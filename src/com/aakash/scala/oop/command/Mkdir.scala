package com.aakash.scala.oop.command

import com.aakash.scala.oop.files.{DirEntry, Directory}
import com.aakash.scala.oop.filesystem.State

class Mkdir(name: String) extends CreateEntry(name) {
  override def createSpecificEntry(state: State): DirEntry =
    Directory.empty(state.wd.path, name)

}
