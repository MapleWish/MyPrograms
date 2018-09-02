def weight_variable(shape):
    initial = tf.truncated_normal(shape, stddev=0.1)#随机分布变量 deviation 绝对偏差
    return tf.Variable(initial)

def bias_variable(shape):
    initial = tf.constant(0.1, shape=shape)
    return tf.Variable(initial)

def conv2d(x, W):
    #stride[1,x_movement,y_movement,1] 
    return tf.nn.conv2d(x, W, strides=[1, 1, 1, 1], padding='SAME')  #Must have strides[0]=strides[3]=1
    
def max_pooling_2x2(x):
    return tf.nn.max_pool(x, ksize=[1, 2, 2, 1], strides=[1, 2, 2, 1], padding='SAME')

#define placeholder for inputs to network
xs = tf.placeholder(tf.float32, [None, 784])  #28x28
ys = tf.placeholder(tf.float32, [None, 10])
keep_pro = tf.placeholder(tf.float32)
x_image = tf.reshape(xs, [-1, 28, 28, 1])  #-1 维度不顾 28x28 1元素个数2个（黑白）
print(x_image.shape)  #[n_sample,28,28,1]

##conv1 layer##
W_conv1 = weight_variable([5, 5, 1, 32])  #patch 5x5 in size 1厚度 32高度
b_conv1 = bias_variable([32])
h_conv1 = tt.nn.relu(conv2d(x_image, W_conv1) + b_conv1)#output size 28*28*32
h_pool1 = max_pooling_2x2(h_conv1)  #outputsize 14*14*32 pooling 不变高度


##conv2 layer##
W_conv2 = weight_variable([5, 5, 32, 64])  #patch 5x5 in size 32高度 out size 64高度
b_conv2 = bias_variable([64)
h_conv2 = tt.nn.relu(conv2d(h_pool1, W_conv2) + b_conv2)#output size 14*14*64
h_pool2 = max_pooling_2x2(h_conv2)  #outputsize 7*7*64 pooling 不变高度

##func1 layer##
W_fc1 = weight_variable([7 * 7 * 64, 1024])
b_fcl = bias_variable([1024])
#[n_sample,7,7,64] ->>[n_sample,7*7*64]
h_pool2_flat = tf.reshape(h_pool2, [-1, 7 * 7 * 64])
h_fcl = tf.nn.relu(tf.matmul(h_pool2_flat, W_fc1) + b_fcl)
h_fcl_drop = tf.nn.dropouot(h_fcl,keep_prob)

##func2 layer##
W_fc2 = weight_variable([1024,10])
b_fc2 = bias_variable([1024])
prediction = tf.nn.softmax(tf.matmul(h_fcl_drop,W_fc2) + b_fc2)


