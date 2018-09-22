# -*- coding: UTF-8 -*-
'''urllib.request.openurl()用于打开和读取Url'''
from urllib import request 


if __name__ == "__main__":
    response = request.urlopen("http://fanyi.baidu.com/")
    html = response.read()
    print(html)