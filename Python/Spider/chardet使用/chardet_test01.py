'''使用外部库chardet的detect来获取网址编码方式'''
# -*- coding: UTF-8 -*-
from urllib import request
import chardet

if __name__ == "__main__":
    response = request.urlopen("http://fanyi.baidu.com/")
    html = response.read()
    charset = chardet.detect(html)
    print(charset)
'''
运行结果：
    {'encoding': 'utf-8', 'confidence': 0.99, 'language': ''}
为一个字典
'''