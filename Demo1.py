eng=int(input("Enter english marks:"))
hin=int(input("Enter hindi marks: "))
tel=int(input("Enter telugu marks : "))
mat=int(input("Enter maths marks:"))
sci=int(input("Enter science marks: "))
soc=int(input("Enter social marks : "))
sum=eng+hin+mat+sci+soc+tel
res=sum/6
if res>=85:
print("Rank 1")
elif res>=60 and res<85:
print("Rank 2")
elif res>=50 and res<60:
print("Second class")
elif res>=35 and res<50:
print("justy pass")
else:
print("fail")
