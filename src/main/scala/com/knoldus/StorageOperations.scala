package com.knoldus

trait Storaged {

  def addElement(element: Int): Unit

  def removeElement(element: Int): Boolean

  def removeAll(): Unit

  def checkIfContains(element: Int): Boolean
}

class StorageOperations extends Storaged {

  private val storageObject = new Storage()

  def addElement(element: Int): Unit = storageObject.addElement(element)

  def removeElement(element: Int): Boolean = storageObject.removeElement(element)

  def removeAll(): Unit = storageObject.removeAll()

  def checkIfContains(element: Int): Boolean = storageObject.checkIfContains(element)
}