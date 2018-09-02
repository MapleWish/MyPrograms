class Solution:
    def reverse(self, x):
        R = 0   #返回值
        flag = 1 #标记输入值的正负
        if x<0:
            x = abs(x)
            flag = -1 #输入是负数
        while x != 0:
            R = R*10+x%10
            x = x//10
        if -2147483647<R< 2147483648:#判断是否越界
            return R*flag
        else:
            return 0