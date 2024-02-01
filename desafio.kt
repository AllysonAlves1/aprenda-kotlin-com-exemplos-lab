// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val idade: Int) {
    override fun toString(): String {
        return "$nome"
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel = Nivel.BASICO)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
//        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Usuário $usuario matriculado na formação $nome")
    }
    fun alunosMatriculados() {
        println("Alunos matriculados na formação $nome:")
        inscritos.forEach { println(it) }
    }
}

fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val formacao = Formacao("Kotlin para iniciantes", listOf(
        ConteudoEducacional("O que é Kotlin?", 30, Nivel.BASICO),
        ConteudoEducacional("Primeiros passos com Kotlin", 60, Nivel.INTERMEDIARIO),
        ConteudoEducacional("Kotlin avançado", 90, Nivel.DIFICIL),
    ))

    val usuario = Usuario("João", 25)
    val usuario2 = Usuario("Maria", 30)
    val usuario3 = Usuario("José", 40)

    formacao.matricular(usuario)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    formacao.alunosMatriculados()

}
