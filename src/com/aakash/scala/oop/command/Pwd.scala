package com.aakash.scala.oop.command

import com.aakash.scala.oop.filesystem.State

class Pwd extends Command {
  override def apply(state: State): State =
    state.setMessage(state.wd.path)

}
