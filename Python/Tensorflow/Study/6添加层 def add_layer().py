import tensorflow as tf

def add_layer(inputs, in_size, out_size, activation_function=None):
    Weights = tf.Variable(tf.random_normal([in_size, out_size]))#初始化随机随机变量用随机数好于置0，此为初始矩阵
    biases = tf.Variable(tf.zeros([1, out_size]) + 0.1)#列表。+0.1不为零
    Wx_plus_b = tf.matmul(inputs, Weights) + biases
    if activation_function is None:
        outputs = Wx_plus_b
    else:
        outputs = activation_function(Wx_plus_b)
    return outputs