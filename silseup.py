try:
    file = input("File name : ")
    fhand = open(file,'r')

    for line in fhand:
        print(line)

    fhand.close()
except:
    print("Error")
