#多重赋值： a,b=1,2 可以同时赋值 a,b=b,a 相当于交换

def get_next_target(page):
    start_link = page.find('<a href=')
    start_quote = page.find('"', start_link)
    end_quote = page.find('"', start_quote + 1)
    url = page[start_quote + 1:end_quote]

    return url, end_quote

#print (get_next_target('this is a <a href="http://udacity.com">link!</a>')) 直接输出两个元素 输出的为两个元素的元组 ('http://udacity.com', 37)

url, endpos = get_next_target('this is a <a href="http://udacity.com">link!</a>') 

print (url)    #赋值后输出 则为输出的格式 http://udacity.com          