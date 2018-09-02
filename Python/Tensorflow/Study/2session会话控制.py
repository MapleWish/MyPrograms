import tensorflow as tf 

matrix1 = tf.constant([[3, 3]])#一行两列
matrix2 = tf.constant([[2],
                        [2]])#两行一列

product = tf.matmul(matrix1, matrix2)

#method1 #用sess.close() ,更为整洁系统
'''
sess = tf.Session()
result = sess.run(product)
print(result)
sess.close()
'''

#methond2 #自动结束
with tf.Session() as sess:
    result = sess.run(product)
    print(result)
