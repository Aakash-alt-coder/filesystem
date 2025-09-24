package com.aakash.scala.oop.command

import com.aakash.scala.oop.filesystem.State

class UnknownCommand extends Command {
  override def apply(state: State): State =
    state.setMessage("Command not found!")
}
