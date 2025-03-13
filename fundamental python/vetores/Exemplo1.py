alunos = ["Felipe", "Isabele", "Pedro", "Ligia", "Matheus"]

print (alunos)
print("O primeiro valor do vetor é", (alunos[0]))
print("O ultimo valor do vetor é", (alunos[4]))
print("O valor do valor do vetor é", (alunos[-1]))

print()
for nome in alunos:
    print(nome)

print()
for i in range(5):
    print("Na posição",(i)," temos o valor",alunos[i])