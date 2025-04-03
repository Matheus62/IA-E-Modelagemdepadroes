def carregarAlunos():
    Alunos = []
    notas = []

    for i in range(5):
        nome = input("Digite o nome do aluno: ")
        nota = float(input("digite a nota do aluno: "))
        print()

        Alunos.append(nome)
        notas.append(nota)

    resultado = []
    resultado.append(nome)
    resultado.append(nota)

    return resultado

def maiorNota(matriz):
    alunos = matriz[0]
    notas = matriz[1]


print ( carregarAlunos() )
maiorNota(maiornota)