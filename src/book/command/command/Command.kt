package book.command.command

import book.command.actors.GameActor

abstract class Command{
    abstract fun execute(actor: GameActor);
}