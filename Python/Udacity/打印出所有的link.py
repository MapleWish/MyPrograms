def get_next_target(page):
    start_link = page.find('<a href=')
    start_quote = page.find('"', start_link)
    end_quote = page.find('"', start_quote + 1)
    url = page[start_quote + 1:end_quote]
    return url, end_quote

def print_all_links(page):
    while True:
        url, end_quote = get_next_target(page)
        page = page[end_quote:]
        if (url):
            print(url)
        else:
            break

def get_page(url):
    import urllib.request

    file=urllib.request.urlopen(url)

    data = file.read()  #读取全部
    
    return data


print_all_links(get_page('http://jxgl.hainu.edu.cn/'))    