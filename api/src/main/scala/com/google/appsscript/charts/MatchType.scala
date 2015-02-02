package com.google.appsscript.charts

import com.google.appsscript.base._

import com.google.appsscript.ui._

import scala.scalajs.js

/** MatchType An enumeration of how a string value should be matched. Matching a string is a boolean operation. Given a string, a match term (string), and a match type, the operation will output true in the following cases: If the match type equals EXACT and the match term equals the string. If the match type equals PREFIX and the match term is a prefix of the string. If the match type equals ANY and the match term is a substring of the string. This enumeration can be used in by a string filter control to decide which rows to filter out of the data table. Given a column to filter on, leave only the rows that match the value entered in the filter input box, using one of the above matching types. */
trait MatchType extends js.Object {
  /** Returns the name of the MatchType to be used in the options JSON. */
  def getName: String = js.native
}