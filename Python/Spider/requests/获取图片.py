from bs4 import BeautifulSoup
from urllib import request

url = 'http://www.shuaia.net/index.html'
head = {}
head['User-Agent'] = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36"

req = request.Request(url=url, headers=head)
response=request.urlopen(req)
html = response.read().decode('utf-8')

bf = BeautifulSoup(html, 'lxml')
targets_url = bf.find_all(class_='item-img')
list_url = []
for each in targets_url:
    list_url.append(each.img.get('alt') + '=' + each.get('href'))
print(list_url)