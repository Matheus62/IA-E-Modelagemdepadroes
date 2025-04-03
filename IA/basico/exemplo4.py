soma = 0

for i in range(5):
    nota = float (input("Digite a nota "+ str(i+1) +"."))
    soma = soma + nota
media = soma/5
print("A media do aluno é",media)