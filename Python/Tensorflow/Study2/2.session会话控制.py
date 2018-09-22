# Session 用于运行TensorFlow操作的类 
import tensorflow as tf

matrix1 = tf.constant([[3, 3]])#constant 常量

print(matrix1)
#直接打印不用session
#返回的是一个张量：Tensor("Const:0", shape=(1, 2), dtype=int32)

print(tf.Session().run(matrix1))
#返回的是一个张量：[[3,3]] 一行二列的数组 即[3,3] 最外面表示数组

matrix2 = tf.constant([[2],
                        [2]])

product = tf.matmul(matrix1, matrix2) #matrix multiply or np.dot(m1,m2) 求矩阵的值 而不是广播

#使用session的控制
#method 1
sess = tf.Session()
result = sess.run(product)
print(result)
sess.close()

#method 2
with tf.Session() as sess:
    result = sess.run(product)
    print(result)
