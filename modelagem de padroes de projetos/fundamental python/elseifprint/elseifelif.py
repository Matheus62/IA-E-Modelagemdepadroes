nota1 = float(input("digite a primeira nota "))
nota2 = float(input("digite a segunda nota "))
frequencia = float(input("digite a Frequencia "))

media = (nota1 + nota2)/2
print("A media é ",media)

if media >= 6 and frequencia >= 75:
    print("Aprovado :)")
    print("curta as ferias")
elif media >= 2:
    print("o aluno esta de exame")
    print("estude mais")
else:
    print("O aluno esta reprovado")
    print("Meus pessames")