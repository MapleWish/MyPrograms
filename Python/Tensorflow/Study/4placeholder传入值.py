'''
Tensorflow 如果想要从外部传入data,
那就需要用到 tf.placeholder(),
然后在之后 sess.run(***, feed_dict={input: **})的时候传入要输入的值.
'''

import tensorflow as tf

input1 = tf.placeholder(tf.float32)
input2 = tf.placeholder(tf.float32)

output = tf.multiply(input1, input2)

with tf.Session() as sess:
    print (sess.run(output,feed_dict={input1:[7.],input2:[2.]}))