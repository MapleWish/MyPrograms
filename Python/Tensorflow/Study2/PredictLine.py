import tensorflow as tf 
import numpy as np

##creat data 
x_data = np.random.rand(100)#数据都使用np的 tensorflow处理的都是数组类型数据
y_data = x_data * 0.3 + 0.1


##creat tensorflow structure start#
Weigths = tf.Variable(tf.random_uniform([1,], -1, 1))
biases = tf.Variable(tf.zeros([1,]))

y = Weigths * x_data + biases

cost = tf.reduce_mean(tf.square(y - y_data))

optimizer = tf.train.GradientDescentOptimizer(0.6)

train = optimizer.minimize(cost)
##Creat tensorflow structure end##

init = tf.initialize_all_variables()

sess = tf.Session()

sess.run(init)#完成初始化所有变量

for step in range(200):
    sess.run(train)#完成一次train
    
    print(sess.run(Weigths),sess.run(biases))
