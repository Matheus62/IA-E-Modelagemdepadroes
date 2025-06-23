soma = 0

for i in range(0,10):
    N = float (input("Digite a um numero "+ str(i+1) +"."))
    soma = soma + N
if soma >= 10:
 print("A quantidade numerica é maior que 10")
else:
   print("A quantidade numerica não é maior que 10")