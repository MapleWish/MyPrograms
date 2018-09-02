class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        x=str(x)
        s = x[::-1]  #直接使用字符串倒序 x[start:end:step]step强调的是步进 默认1 -1则为倒置
        if(x==s):
            return True
        else:
            return False