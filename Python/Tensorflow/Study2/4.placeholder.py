#placeholder 占位符 目的在于在运行 Session 时使用 设置placeholder 的值
import tensorflow as tf

input1 = tf.placeholder(tf.float32) #placeholder类型最好设置成tf.float32
input2 = tf.placeholder(tf.float32)

output = tf.multiply(input1, input2)

with tf.Session() as sess:
    print(sess.run(output,{input1:7,input2:2}))#在使用Session时，运用字典，输入（确定）placeholder的值