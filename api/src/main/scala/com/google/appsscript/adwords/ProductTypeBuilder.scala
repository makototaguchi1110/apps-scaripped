package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Builder for 
 * <a href="adwordsapp_producttype.html">ProductType</a>
 *  objects.
 */
trait ProductTypeBuilder {
  /**
   *  Builds the product type. Returns a 
   * <a href="adwordsapp_producttypeoperation.html">ProductTypeOperation</a>
   *  that corresponds to the creation of the 
   * <a href="adwordsapp_producttype.html">ProductType</a>
   * .
   */
  def build: ProductTypeOperation = ???
  /**  Specifies the bid of the product type. If this is unspecified, will use the bid of the parent product group. */
  def withBid(bid: Double): ProductTypeBuilder = ???
  /**  Specifies the value of the product type. */
  def withValue(value: String): ProductTypeBuilder = ???
}