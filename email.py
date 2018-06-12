try:
    file = input("File name : ")
    fhand = open(file,'r')
    
    for line in fhand:
        start = line.find('@')
        end = line.find('.')
        host = line[start+1:end]
    print(host)

    fhand.close()
except:
    print("Error")

