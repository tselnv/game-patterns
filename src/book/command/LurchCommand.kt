package book.command

import book.actors.GameActor

class LurchCommand: Command(){
    override fun execute(actor: GameActor) {
        lurch();
    }

    private fun lurch() {
        println("lurch")
    }

}