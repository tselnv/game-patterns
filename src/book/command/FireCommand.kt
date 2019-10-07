package book.command

import book.actors.GameActor

class FireCommand: Command(){
    override fun execute(actor: GameActor) {
        fireGun();
    }

    private fun fireGun() {
        println("fire")
    }

}