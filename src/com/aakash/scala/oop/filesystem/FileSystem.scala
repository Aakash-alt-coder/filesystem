package com.aakash.scala.oop.filesystem

import com.aakash.scala.oop.command.Command
import com.aakash.scala.oop.files.Directory

import java.util.Scanner

object FileSystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)
  
  while(true){
    state.show
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }

}
