package com.aakash.scala.oop.command

import com.aakash.scala.oop.files.{DirEntry, File}
import com.aakash.scala.oop.filesystem.State

class Touch(name: String) extends CreateEntry(name) {

  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)
}
