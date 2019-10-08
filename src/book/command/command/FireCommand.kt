package book.command.command

import book.command.actors.GameActor

class FireCommand: Command(){
    override fun execute(actor: GameActor) {
        fireGun();
    }

    private fun fireGun() {
        println("fire")
    }

}