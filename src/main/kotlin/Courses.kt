class Courses (val nomeCurso: String?,
               var nomeProfessor: String?,
               var ano: Int) {

    //Declaramos a lista para receber estudantes nulos
    val listaEstudantes = mutableListOf<Student?>()

    fun mostrarEstudantes(){
        for(i in listaEstudantes){
            println(i?.nome)
            //O i? indica que o valor que estamos retornando pode ser nulo
        }
    }

    fun cadastrar(student: Student?) {
        listaEstudantes.add(student)
        println("Estudante cadastrado com sucesso!")
    }

    fun cadastrar(students: Array<Student?>?) {
        //Para iterarmos sobre os valores de cada estudante, precisamos, aqui,
        // nos certificar de que nenhum estudante é nulo, para evitar erros
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
        //Declaramos a variável melhor nota e passamos listaEstudantes[0]?.nota para
        //ele. Lembrem que o ?,nesse caso, vai indicar que pode ser que o valor
        //que queremos recuperar da listaEstudantes seja nulo. Automaticamente
        //a variável melhor nota ficou com o tipo Double?
        var melhorNota = listaEstudantes[0]?.nota
        for(i in listaEstudantes){
            //Como o if não pode receber valores nulos, usamos a exclamação !! para
            //indicar que o valor que será retornado no if será convertido para
            //um tipo não nulo
            if(i?.nota!! > melhorNota!!){
                melhorNota = i.nota
            }
        }
        println("A maior nota desse curso é $melhorNota")
    }

}