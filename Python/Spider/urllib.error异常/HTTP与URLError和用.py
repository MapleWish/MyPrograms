# -*- coding: UTF-8 -*-
from urllib import request
from urllib import error

if __name__ == "__main__":
    #一个不存在的连接
    url = "http://www.douyu.com/Cotory.html"
    req = request.Request(url)
    try:
        responese = request.urlopen(req)
    except error.URLError as e:
        #hasattr方法用来说明是否有子字符串
        #URLError高于HTTPError 当检查出URLError时，不进行HTTPError
        if hasattr(e,'code'):
            print("HTTPError")
            print(e.code)
        elif hasattr(e,'reason'):
            print("URLError")
            print(e.reason)