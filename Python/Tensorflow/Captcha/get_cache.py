from urllib.request import urlretrieve

for step in range(1000):
    urlretrieve(url = 'http://jxgl.hainu.edu.cn/verifycode.servlet', filename =  str(step)+'.jpg')