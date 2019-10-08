package book.command.command

import book.command.actors.GameActor

class SwitchWeaponCommand: Command(){
    override fun execute(actor: GameActor) {
        switch();
    }

    private fun switch() {
        println("switch")
    }

}