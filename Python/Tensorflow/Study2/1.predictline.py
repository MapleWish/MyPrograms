import tensorflow as tf
import numpy as np

#creat data
x_data = np.random.rand(100).astype(np.float32)#tf默认数据格式为float32

y_data = x_data * 0.1 + 0.3

#creat tensorflow structure start#

Weights = tf.Variable(tf.random_uniform([1,], -1.0, 1.0))  #产生均匀分布的维度为1的(-1,1)的随机数 第一个参数shape为 [维度] 
                                                           #shape是一个元组，里面每个数字表示每一维的长度

biases = tf.Variable(tf.zeros([1,]))

y = Weights * x_data + biases

loss = tf.reduce_mean(tf.square(y - y_data))
optimizer = tf.train.GradientDescentOptimizer(0.5)
train = optimizer.minimize(loss)

init = tf.initialize_all_variables()

#creat tensorflow structure end#

sess = tf.Session() #用于运行TensorFlow操作的类 
sess.run(init)
for step in range(201):
    sess.run(train)
    if step % 20 == 0:
        print (step,sess.run(Weights),sess.run(biases))