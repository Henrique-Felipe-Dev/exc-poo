class Courses (val nomeCurso: String?,
               var nomeProfessor: String?,
               var ano: Int) {

    val listaEstudantes = mutableListOf<Student?>()

    fun mostrarEstudantes(){
        for(i in listaEstudantes){
            println(i?.nome)
        }
    }

    fun cadastrar(student: Student?) {
        listaEstudantes.add(student)
        println("Estudante cadastrado com sucesso!")
    }

    fun cadastrar(students: Array<Student?>?) {
        if (students != null) {
            for(i in students){
                listaEstudantes.add(i)
            }
        }
        println("Estudantes cadastrados com sucesso!")
    }

    fun removerEstudante(student: Student?) {
        if(listaEstudantes.contains(student)){
            listaEstudantes.remove(student)
            println("O Estudante foi removido com sucesso!")
        }else{
            println("Esse estudante não existe na lista")
        }
    }

    fun numEstudantesCadastrados(){
        println("O número de estudantes cadastrados no curso é" +
                " ${listaEstudantes.size}")
    }

    fun melhorNota(){
        var melhorNota = listaEstudantes[0]?.nota
        for(i in listaEstudantes){
            if(i?.nota!! > melhorNota!!){
                melhorNota = i.nota
            }
        }
        println("A maior nota desse curso é $melhorNota")
    }

}