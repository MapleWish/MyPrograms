#在python中，如何东西都是对象，其中find是这个对象中带有的函数，可以直接被调用
#find 返回的是在字符串从第一个位置开始搜索到的首个位置
#####find (substr,start,end) 从start开始到end结束######

s = "My favoraite game is maple story."

print(s.find("story"))

print(s.find("i"))
print(s.find("i",18))


print(s[27:])

