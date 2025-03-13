soma = 0

for i in range(0,10):
    N = float (input("Digite a um numero "+ str(i+1) +"."))
    soma = soma + N

if soma != 2:
 print("Este numero é par")
else:
   print("Este numero é impar")