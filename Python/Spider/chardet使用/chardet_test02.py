# -*- coding: UTF-8 -*-
from urllib import request
'''
urllib.request.urlopen()可以是 url字符串 或者是 一个 Request对象
使用request.Request创建了一个Request类：req
Request是创建了对象，使用这个对象就能进行很多操作。直接urlopen只是临时的。
'''
req = request.Request("http://fanyi.baidu.com/")
response = request.urlopen(req)
html = response.read()
html = html.decode("utf-8")
print (html)