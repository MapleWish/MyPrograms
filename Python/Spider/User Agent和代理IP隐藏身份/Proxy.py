from urllib import request

url = 'https://www.masterfox.cf/'
proxy = {'http': '118.190.95.35:9001'}
proxy_support = request.ProxyHandler(proxy)
opener = request.build_opener(proxy_support)
opener.addheaders = [('User-Agent', 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36')]
request.install_opener(opener)
response = request.urlopen(url)
html = response.read().decode('utf-8')
print(html)