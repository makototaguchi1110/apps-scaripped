package com.google.appsscript.spreadsheet

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import scala.scalajs.js

/** Range Access and modify spreadsheet ranges. This class allows users to access and modify ranges in Google Sheets. A range can be a single cell in a sheet or a range of cells in a sheet. */
trait Range extends js.Object {
  /** Make this range the active range. */
  def activate(): Range = js.native
  /** Break any multi-column cells in the range into individual cells again. Calling this function on a range is equivalent to selecting a range and clicking Format -> Merge -> Unmerge. */
  def breakApart(): Range = js.native
  /** Determines whether the user has permission to edit every cell in the range. The spreadsheet owner is always able to edit protected ranges and sheets. */
  def canEdit(): Boolean = js.native
  /** Clears the range of contents, formats, and data-validation rules. */
  def clear(): Range = js.native
  /** Clears the range of contents, format, data-validation rules, and/or comments, as specified with the given advanced options. By default all data will be cleared. */
  def clear(options: AnyRef): Range = js.native
  /** Clears the content of the range, leaving the formatting intact. */
  def clearContent(): Range = js.native
  /** Clears the data-validation rules for the range. */
  def clearDataValidations(): Range = js.native
  /** Clears formatting for this range. This clears text formatting for the cell or cells in the range, but does not reset any number formatting rules. */
  def clearFormat(): Range = js.native
  /** Clears the note in the given cell or cells. */
  def clearNote(): Range = js.native
  /** Copy the formatting of the range to the given location. If the destination is larger or smaller than the source range then the source will be repeated or truncated accordingly. Note that this method copies the formatting only. For a detailed description of the gridId parameter, see getGridId(). */
  def copyFormatToRange(gridId: Int, column: Int, columnEnd: Int, row: Int, rowEnd: Int): Unit = js.native
  /** Copy the formatting of the range to the given location. If the destination is larger or smaller than the source range then the source will be repeated or truncated accordingly. Note that this method copies the formatting only. */
  def copyFormatToRange(sheet: Sheet, column: Int, columnEnd: Int, row: Int, rowEnd: Int): Unit = js.native
  /** Copies the data from a range of cells to another range of cells. Both the values and formatting are copied. */
  def copyTo(destination: Range): Unit = js.native
  /** Copies the data from a range of cells to another range of cells. By default both the values and formatting are copied, but this can be overridden using advanced arguments. */
  def copyTo(destination: Range, options: AnyRef): Unit = js.native
  /** Copy the content of the range to the given location. If the destination is larger or smaller than the source range then the source will be repeated or truncated accordingly. For a detailed description of the gridId parameter, see getGridId(). */
  def copyValuesToRange(gridId: Int, column: Int, columnEnd: Int, row: Int, rowEnd: Int): Unit = js.native
  /** Copy the content of the range to the given location. If the destination is larger or smaller than the source range then the source will be repeated or truncated accordingly. */
  def copyValuesToRange(sheet: Sheet, column: Int, columnEnd: Int, row: Int, rowEnd: Int): Unit = js.native
  /** Returns a string description of the range, in A1 notation. */
  def getA1Notation(): String = js.native
  /** Returns the background color of the top-left cell in the range (i.e., '#ffffff'). */
  def getBackground(): String = js.native
  /** Returns the background colors of the cells in the range (i.e., '#ffffff'). */
  def getBackgrounds(): js.Array[js.Array[String]] = js.native
  /** Returns a given cell within a range. */
  def getCell(row: Int, column: Int): Range = js.native
  /** Returns the starting column position for this range. */
  def getColumn(): Int = js.native
  /** Returns a URL for the data in this range, which can be used to create charts and queries. */
  def getDataSourceUrl(): String = js.native
  /** Return the data inside this object as a DataTable. */
  def getDataTable(): DataTable = js.native
  /** Return the data inside this Range as a DataTable. */
  def getDataTable(firstRowIsHeader: Boolean): DataTable = js.native
  /** Returns the data-validation rule for the top-left cell in the range. If data validation has not been set on the cell, this method returns null. */
  def getDataValidation(): DataValidation = js.native
  /** Returns the data-validation rules for all cells in the range. If data validation has not been set on a given cell, this method returns null for that cell's position in the array. */
  def getDataValidations(): js.Array[js.Array[DataValidation]] = js.native
  /** Returns the font color of the cell in the top-left corner of the range, in CSS notation (like '#ffffff' or 'white'). */
  def getFontColor(): String = js.native
  /** Returns the font colors of the cells in the range in CSS notation (like '#ffffff' or 'white'). */
  def getFontColors(): js.Array[js.Array[String]] = js.native
  /** Returns the font families of the cells in the range. */
  def getFontFamilies(): js.Array[js.Array[String]] = js.native
  /** Returns the font family of the cell in the top-left corner of the range. */
  def getFontFamily(): String = js.native
  /** Gets the line style of the cell in the top-left corner of the range ('underline', 'line-through', or 'none'). */
  def getFontLine(): String = js.native
  /** Gets the line style of the cells in the range ('underline', 'line-through', or 'none'). */
  def getFontLines(): js.Array[js.Array[String]] = js.native
  /** Returns the font size in point size of the cell in the top-left corner of the range. */
  def getFontSize(): Int = js.native
  /** Returns the font sizes of the cells in the range. */
  def getFontSizes(): js.Array[js.Array[Int]] = js.native
  /** Returns the font style ('italic' or 'normal' of the cell in the top-left corner of the range. */
  def getFontStyle(): String = js.native
  /** Returns the font styles of the cells in the range. */
  def getFontStyles(): js.Array[js.Array[String]] = js.native
  /** Returns the font weight (normal/bold) of the cell in the top-left corner of the range. */
  def getFontWeight(): String = js.native
  /** Returns the font weights of the cells in the range. */
  def getFontWeights(): js.Array[js.Array[String]] = js.native
  /** Returns the formula (A1 notation) for the top-left cell of the range, or an empty string if the cell is empty or doesn't contain a formula. */
  def getFormula(): String = js.native
  /** Returns the formula (R1C1 notation) for a given cell, or null if none. */
  def getFormulaR1C1(): String = js.native
  /** Returns the formulas (A1 notation) for the cells in the range. Entries in the 2D array will be an empty string for cells with no formula. */
  def getFormulas(): js.Array[js.Array[String]] = js.native
  /** Returns the formulas (R1C1 notation) for the cells in the range. Entries in the 2D array will be null for cells with no formula. */
  def getFormulasR1C1(): js.Array[js.Array[String]] = js.native
  /** Returns the grid ID of the range's parent sheet. The first sheet created in a spreadsheet has a grid ID of 0, and each sheet created thereafter increments the ID. The ID does not necessarily correspond to a sheet's tab position because sheets may have been reordered or deleted. If a sheet is deleted, the grid ID for subsequent sheets continues to increment, and the grid ID of the deleted sheet is not reused. */
  def getGridId(): Int = js.native
  /** Returns the height of the range. */
  def getHeight(): Int = js.native
  /** Returns the horizontal alignment of the text (left/center/right) of the cell in the top-left corner of the range. */
  def getHorizontalAlignment(): String = js.native
  /** Returns the horizontal alignments of the cells in the range. */
  def getHorizontalAlignments(): js.Array[js.Array[String]] = js.native
  /** Returns the end column position. */
  def getLastColumn(): Int = js.native
  /** Returns the end row position. */
  def getLastRow(): Int = js.native
  /** Returns the note associated with the given range. */
  def getNote(): String = js.native
  /** Returns the notes associated with the cells in the range. */
  def getNotes(): js.Array[js.Array[String]] = js.native
  /** Returns the number of columns in this range. */
  def getNumColumns(): Int = js.native
  /** Returns the number of rows in this range. */
  def getNumRows(): Int = js.native
  /** Get the number formatting of the top-left cell of the given range. The number format corresponds to a formatting created when a user clicks Format -> Number. */
  def getNumberFormat(): String = js.native
  /** Returns the number formats for the cells in the range. */
  def getNumberFormats(): js.Array[js.Array[String]] = js.native
  /** Returns the row position for this range. */
  def getRow(): Int = js.native
  /** Returns the row position for this range. */
  def getRowIndex(): Int = js.native
  /** Returns the sheet this range belongs to. */
  def getSheet(): Sheet = js.native
  /** Returns the value of the top-left cell in the range. The value may be of type Number, Boolean, Date, or String depending on the value of the cell. Empty cells will return an empty string. */
  def getValue(): AnyRef = js.native
  /** Returns the rectangular grid of values for this range. Returns a two-dimensional array of values, indexed by row, then by column. The values may be of type Number, Boolean, Date, or String, depending on the value of the cell. Empty cells will be represented by an empty string in the array. Remember that while a range index starts at 1, 1, the JavaScript array will be indexed from [0][0]. */
  def getValues(): js.Array[js.Array[AnyRef]] = js.native
  /** Returns the vertical alignment (top/middle/bottom) of the cell in the top-left corner of the range. */
  def getVerticalAlignment(): String = js.native
  /** Returns the vertical alignments of the cells in the range. */
  def getVerticalAlignments(): js.Array[js.Array[String]] = js.native
  /** Returns the width of the range in columns. */
  def getWidth(): Int = js.native
  /** Returns the wrapping policy of the cell in the top-left corner of the range. true if the text wraps, false if the text does not. */
  def getWrap(): Boolean = js.native
  /** Returns the wrapping policy of the cells in the range. */
  def getWraps(): js.Array[js.Array[Boolean]] = js.native
  /** Returns true if the range is totally blank. */
  def isBlank(): Boolean = js.native
  /** Determines whether the end of the range is bound to a particular column. For example, for the ranges A1:B10 or B:B, which are bound to columns at the end of the range, this method returns true; for the ranges 3:7 or A1:5, which are bound only to particular rows at the end of the range, this method returns false. */
  def isEndColumnBounded(): Boolean = js.native
  /** Determines whether the end of the range is bound to a particular row. For example, for the ranges A1:B10 or 3:7, which are bound to rows at the end of the range, this method returns true; for the ranges B:B or A1:C, which are bound only to particular columns at the end of the range, this method returns false. */
  def isEndRowBounded(): Boolean = js.native
  /** Determines whether the start of the range is bound to a particular column. For example, for the ranges A1:B10 or B:B, which are bound to columns at the start of the range, this method returns true; for the range 3:7, which is bound only to a row at the start of the range, this method returns false. */
  def isStartColumnBounded(): Boolean = js.native
  /** Determines whether the start of the range is bound to a particular row. For example, for the ranges A1:B10 or 3:7, which are bound to rows at the start of the range, this method returns true; for the range B:B, which is bound only to a particular column at the start of the range, this method returns false. */
  def isStartRowBounded(): Boolean = js.native
  /** Merges the cells in the range together into a single block. */
  def merge(): Range = js.native
  /** Merge the cells in the range across the columns of the range. */
  def mergeAcross(): Range = js.native
  /** Merges the cells in the range together. */
  def mergeVertically(): Range = js.native
  /** Cut and paste (both format and values) from this range to the target range. */
  def moveTo(target: Range): Unit = js.native
  /** Returns a new range that is offset from this range by the given number of rows and columns (which can be negative). The new range will be the same size as the original range. */
  def offset(rowOffset: Int, columnOffset: Int): Range = js.native
  /** Returns a new range that is relative to the current range, whose upper left point is offset from the current range by the given rows and columns, and with the given height in cells. */
  def offset(rowOffset: Int, columnOffset: Int, numRows: Int): Range = js.native
  /** Returns a new range that is relative to the current range, whose upper left point is offset from the current range by the given rows and columns, and with the given height and width in cells. */
  def offset(rowOffset: Int, columnOffset: Int, numRows: Int, numColumns: Int): Range = js.native
  /** Creates an object that can protect the range from being edited except by users who have permission. Until the script actually changes the list of editors for the range (by calling Protection.removeEditor(emailAddress), Protection.removeEditor(user), Protection.removeEditors(emailAddresses), Protection.addEditor(emailAddress), Protection.addEditor(user), Protection.addEditors(emailAddresses), or setting a new value for Protection.setDomainEdit(editable)), the permissions will mirror those of the spreadsheet itself, which effectively means that the range remains unprotected. If the range is already protected, this method creates a new protected range that overlaps the existing one. If a cell is covered by two protected ranges and one of the protected ranges allows a particular user to edit the cell and the other does not, the user will not be able to edit. */
  def protect(): Protection = js.native
  /** Sets the background color of all cells in the range in CSS notation (like '#ffffff' or 'white'). */
  def setBackground(color: String): Range = js.native
  /** Sets the background to the given RGB color. This is a convenience wrapper for the setBackground call that takes a string color. */
  def setBackgroundRGB(red: Int, green: Int, blue: Int): Range = js.native
  /** Sets a rectangular grid of background colors (must match dimensions of this range). The colors are in CSS notation (like '#ffffff' or 'white'). */
  def setBackgrounds(color: js.Array[js.Array[String]]): Range = js.native
  /** Sets the border property. Valid values are true (on), false (off) and null (no change). */
  def setBorder(top: Boolean, left: Boolean, bottom: Boolean, right: Boolean, vertical: Boolean, horizontal: Boolean): Range = js.native
  /** Sets one data-validation rule for all cells in the range. */
  def setDataValidation(rule: DataValidation): Range = js.native
  /** Sets the data-validation rules for all cells in the range. This method takes a two-dimensional array of data validations, indexed by row then by column. The array dimensions must correspond to the range dimensions. */
  def setDataValidations(rules: js.Array[js.Array[DataValidation]]): Range = js.native
  /** Sets the font color in CSS notation (like '#ffffff' or 'white'). */
  def setFontColor(color: String): Range = js.native
  /** Sets a rectangular grid of font colors (must match dimensions of this range). The colors are in CSS notation (like '#ffffff' or 'white'). */
  def setFontColors(colors: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Sets a rectangular grid of font families (must match dimensions of this range). Examples of font families are "Arial" or "Helvetica". */
  def setFontFamilies(fontFamilies: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Sets the font family, such as "Arial" or "Helvetica". */
  def setFontFamily(fontFamily: String): Range = js.native
  /** Sets the line style of the given range ('underline', 'line-through', or 'none'). */
  def setFontLine(fontLine: String): Range = js.native
  /** Sets a rectangular grid of line styles (must match dimensions of this range). */
  def setFontLines(fontLines: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Sets the font size, with the size being the point size to use. */
  def setFontSize(size: Int): Range = js.native
  /** Sets a rectangular grid of font sizes (must match dimensions of this range). The sizes are in points. */
  def setFontSizes(sizes: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Set the font style for the given range ('italic' or 'normal'). */
  def setFontStyle(fontStyle: String): Range = js.native
  /** Sets a rectangular grid of font styles (must match dimensions of this range). */
  def setFontStyles(fontStyles: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Set the font weight for the given range (normal/bold). */
  def setFontWeight(fontWeight: String): Range = js.native
  /** Sets a rectangular grid of font weights (must match dimensions of this range). An example of a font weight is "bold". */
  def setFontWeights(fontWeights: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Updates the formula for this range. The given formula must be in A1 notation. */
  def setFormula(formula: String): Range = js.native
  /** Updates the formula for this range. The given formula must be in R1C1 notation. */
  def setFormulaR1C1(formula: String): Range = js.native
  /** Sets a rectangular grid of formulas (must match dimensions of this range). The given formulas must be in A1 notation. This method takes a two-dimensional array of formulas, indexed by row, then by column. The array dimensions must correspond to the range dimensions. */
  def setFormulas(formulas: js.Array[js.Array[String]]): Range = js.native
  /** Sets a rectangular grid of formulas (must match dimensions of this range). The given formulas must be in R1C1 notation. */
  def setFormulasR1C1(formulas: js.Array[js.Array[String]]): Range = js.native
  /** Set the horizontal (left to right) alignment for the given range (left/center/right). */
  def setHorizontalAlignment(alignment: String): Range = js.native
  /** Sets a rectangular grid of horizontal alignments. see setHorizontalAlignment(alignment) */
  def setHorizontalAlignments(alignments: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Sets the note to the given value. */
  def setNote(note: String): Range = js.native
  /** Sets a rectangular grid of notes (must match dimensions of this range). */
  def setNotes(notes: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Sets the number or date format to the given formatting string. Date formats follow the SimpleDateFormat specification. */
  def setNumberFormat(numberFormat: String): Range = js.native
  /** Sets a rectangular grid of number or date formats (must match dimensions of this range). The values are formatting strings, see setNumberFormat(numberFormat). Date formats follow the SimpleDateFormat specification. */
  def setNumberFormats(numberFormats: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Sets the value of the range. The value can be numeric, string, boolean or date. If it begins with '=' it is interpreted as a formula. */
  def setValue(value: AnyRef): Range = js.native
  /** Sets a rectangular grid of values (must match dimensions of this range). */
  def setValues(values: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Set the vertical (top to bottom) alignment for the given range (top/middle/bottom). */
  def setVerticalAlignment(alignment: String): Range = js.native
  /** Sets a rectangular grid of vertical alignments (must match dimensions of this range). */
  def setVerticalAlignments(alignments: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Set the cell wrap of the given range. Cells with wrap enabled (the default) will resize to display their full content. Cells with wrap disabled will display as much as possible in the cell without resizing or running to multiple lines. */
  def setWrap(isWrapEnabled: Boolean): Range = js.native
  /** Sets a rectangular grid of word wrap policies (must match dimensions of this range). Cells with wrap enabled (the default) will resize to display their full content. Cells with wrap disabled will display as much as possible in the cell without resizing or running to multiple lines. */
  def setWraps(isWrapEnabled: js.Array[js.Array[AnyRef]]): Range = js.native
  /** Sorts the cells in the given range. Sorts the cells in a given range, by column and order specified. */
  def sort(sortSpecObj: AnyRef): Range = js.native
}
