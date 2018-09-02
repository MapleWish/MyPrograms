import tensorflow as tf

state = tf.Variable(0, name='counter')  #要明确是一个变量，可以命名

#print(state.name) 

one = tf.constant(1)

new_value = tf.add(state,one)
update = tf.assign(state, new_value)

init = tf.initialize_all_variables()  #定义了变量一定要初始化

with tf.Session() as sess:
    sess.run(init)
    for _ in range(3):
        sess.run(update)
        print(sess.run(state))

'''
注意定义了变量以后, 一定要定义init = tf.initialize_all_variables()
不然,变量就不会被初始.
然后同样,在 sess里,也要 sess.run(init), 激活 init这一步.
'''
