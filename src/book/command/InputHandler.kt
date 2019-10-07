package book.command

import book.Game
import book.Main

class InputHandler{

    private val buttonX = JumpCommand();
    private val buttonY = FireCommand();
    private val buttonA = LurchCommand();
    private val buttonB = SwitchWeaponCommand();
    private val buttonNull = NullCommand();

    fun handleInput(game: Game){
        val code = System.`in`.read()

        var button: Command;

        button = when(code.toChar()){
            Buttons.BUTTON_X.char -> buttonX
            Buttons.BUTTON_Y.char -> buttonY
            Buttons.BUTTON_A.char -> buttonA
            Buttons.BUTTON_B.char -> buttonB
            else -> buttonNull
        }

        button.execute(game.actor);
    }

    private fun isPressed(button: Buttons): Boolean {
        val code = System.`in`.read()
        return button == when(code.toChar()){
            Buttons.BUTTON_X.char -> Buttons.BUTTON_X
            Buttons.BUTTON_Y.char -> Buttons.BUTTON_Y
            Buttons.BUTTON_A.char -> Buttons.BUTTON_A
            Buttons.BUTTON_B.char -> Buttons.BUTTON_B
            else -> Buttons.BUTTON_NULL
        }
    }
}