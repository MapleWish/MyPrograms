import tensorflow as tf
import numpy as np

#creat data
x_data = np.random.rand(100).astype(np.float32)#产生0-100的32位浮点随机数(在Tenorflow大部分数据都是float32))
y_data = x_data * 0.1 + 0.3

### creat tensorflow structure start ###
Weights = tf.Variable (tf.random_uniform([1],-1.0,1.0))#Variable随机变量Weight（权重）初始值-1~1  ,使用随机数列生成的（一维结构）,Weight用大写表示矩阵
biases = tf.Variable(tf.zeros([1]))#biases（偏置）,初始默认值0

y = Weights * x_data + biases#预测的y

loss = tf.reduce_mean(tf.square(y - y_data))#准确度
optimizer = tf.train.GradientDescentOptimizer(0.5)#优化器（GradientDescent梯度下降) 学习效率0.5
train = optimizer.minimize(loss)#优化准确度，减少误差


init = tf.initialize_all_variables()#初始化
### creat tensorflow structure end###

sess = tf.Session()#激活 Improtant，sess会话控制 非常重要 记得Session要大写（对象）
sess.run(init)#see.run 非常重要

for step in range(201):
    sess.run(train)#训练减少误差
    if step % 20 == 0:#每20步输出一次
        print(step, sess.run(Weights), sess.run(biases))