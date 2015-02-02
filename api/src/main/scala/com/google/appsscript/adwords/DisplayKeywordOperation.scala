package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  An operation representing creation of a new display keyword. Calling any method (
 * <a href="adwordsapp_displaykeywordoperation.html#getErrors_0">getErrors</a>
 * , 
 * <a href="adwordsapp_displaykeywordoperation.html#getResult_0">getResult</a>
 * , or 
 * <a href="adwordsapp_displaykeywordoperation.html#isSuccessful_0">isSuccessful</a>
 * ) will cause the operation to execute and create the display keyword. To make the script more efficient, it's recommended that you store the operations in an array and only call these methods once you've constructed all the operations you want.
 */
trait DisplayKeywordOperation {
  /**  Returns an empty array if the operation was successful, otherwise returns the list of errors encountered when trying to create the DisplayKeyword. */
  def getErrors: Seq[String] = ???
  /**
   *  Returns the newly created DisplayKeyword, or 
   * <code>null</code>
   *  if the operation was unsuccessful.
   */
  def getResult: DisplayKeyword = ???
  /**
   *  Returns 
   * <code>true</code>
   *  if the operation was successful.
   */
  def isSuccessful: Boolean = ???
}