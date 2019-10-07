package book.command

import book.actors.GameActor

class SwitchWeaponCommand: Command(){
    override fun execute(actor: GameActor) {
        switch();
    }

    private fun switch() {
        println("switch")
    }

}