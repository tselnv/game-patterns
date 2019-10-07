package book.command

import book.actors.GameActor

abstract class Command{
    abstract fun execute(actor: GameActor);
}