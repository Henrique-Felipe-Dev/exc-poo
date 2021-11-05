import courses.Courses
import student.Student

fun main(args: Array<String>) {

    val rosnei: Student = Student("Rosnei", "da Silva",
        123, 50.0, 2)

    val maria: Student = Student("Maria", "da Silva",
        1234, 80.0, 1)

    val henrique: Student = Student("Henrique", "da Silva Felipe",
        12345, 10.0, 3)

    val rebeca: Student = Student("Rebeca", "da Silva",
        123456, 70.0, 1)

    val genivaldo: Student = Student("Genivaldo", "da Silva",
        123456, 70.0, 1)

    rosnei.nomeCompleto()
    rosnei.mudarAnoSeAprovado()

    val cursoIngles = Courses("Inglês", "Genivaldo",
                                1)

    cursoIngles.cadastrar(rosnei)
    cursoIngles.cadastrar(maria)

    cursoIngles.numEstudantesCadastrados()

    cursoIngles.removerEstudante(rebeca)

    val estudantes: Array<Student?> = arrayOf(henrique, rebeca)

    cursoIngles.cadastrar(estudantes)

    cursoIngles.numEstudantesCadastrados()

    cursoIngles.melhorNota()

    cursoIngles.mostrarEstudantes()

    try {
        //Nós queremos tentar executar a função
        //Pois caso essa nossa função dê erro, nós queremos manipular ess erro
        //Sem a necessidade do nosso programa fechar (crashar)
        cursoIngles.verificarAluno(genivaldo)
    }catch (e: Exception){
        //Nós recuperamos o exceção e exibimos a mensagem dela
        println(e.message)
    }

}