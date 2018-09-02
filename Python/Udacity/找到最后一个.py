def find_last(s,sfind):
    first_find=s.find(sfind)
    last_find=-1            #需要将last_find在while外定义 否则在不进入while时找到不last_find
    while (first_find!=-1):
        last_find=first_find
        first_find=s.find(sfind,first_find+1)
    return last_find




print (find_last('aaaa', 'b'))
#>>> 3

#print find_last('aaaaa', 'aa')
#>>> 3

#print find_last('aaaa', 'b')
#>>> -1