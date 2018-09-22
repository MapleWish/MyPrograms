import tensorflow as tf

state = tf.Variable(0, name='counter')
print(state.name)
#返回 counter:0  第0个变量，名字为counter 
one = tf.Variable(1)  # 变量
# one = tf.constant(1)
#constant 常量

new_value = tf.add(state , one)
updata = tf.assign(state, new_value)

init = tf.initialize_all_variables()

sess = tf.Session()
sess.run(init)

print(range(3))
for _ in range(3):
    sess.run(updata)
    print(sess.run(state))

