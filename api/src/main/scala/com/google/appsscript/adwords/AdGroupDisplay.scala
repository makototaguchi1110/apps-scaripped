package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import java.util.Date

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

/**
 * 
 *  Access to ad group-level display criteria. For example, to access all display keywords in an ad group: 
 * <pre class="prettyprint">
 *  var displayKeywordIterator = adGroup.display().keywords().get();
 *  while (displayKeywordIterator.hasNext()) {
 *    var displayKeyword = displayKeywordIterator.next();
 *  }</pre>
 */
trait AdGroupDisplay {
  /**  Returns the selector of all audiences in the ad group. */
  def audiences: AudienceSelector = ???
  /**  Returns the selector of all excluded audiences in the ad group. */
  def excludedAudiences: ExcludedAudienceSelector = ???
  /**  Returns the selector of all excluded display keywords in the ad group. */
  def excludedKeywords: ExcludedDisplayKeywordSelector = ???
  /**  Returns the selector of all excluded placements in the ad group. */
  def excludedPlacements: ExcludedPlacementSelector = ???
  /**  Returns the selector of all excluded topics in the ad group. */
  def excludedTopics: ExcludedTopicSelector = ???
  /**  Returns the selector of all display keywords in the ad group. */
  def keywords: DisplayKeywordSelector = ???
  /**
   *  Returns a new audience builder for this ad group. When 
   * <a href="adwordsapp_audiencebuilder.html#build_0">AudienceBuilder.build()</a>
   *  is called, an audience will be created in this ad group. When 
   * <a href="adwordsapp_audiencebuilder.html#exclude_0">AudienceBuilder.exclude()</a>
   *  is called, an excluded audience will be created in this ad group.
   */
  def newAudienceBuilder: AudienceBuilder = ???
  /**
   *  Returns a new display keyword builder for this ad group. When 
   * <a href="adwordsapp_displaykeywordbuilder.html#build_0">DisplayKeywordBuilder.build()</a>
   *  is called, a display keyword will be created in this ad group. When 
   * <a href="adwordsapp_displaykeywordbuilder.html#exclude_0">DisplayKeywordBuilder.exclude()</a>
   *  is called, an excluded display keyword will be created in this ad group.
   */
  def newKeywordBuilder: DisplayKeywordBuilder = ???
  /**
   *  Returns a new placement builder for this ad group. When 
   * <a href="adwordsapp_placementbuilder.html#build_0">PlacementBuilder.build()</a>
   *  is called, a placement will be created in this ad group. When 
   * <a href="adwordsapp_placementbuilder.html#exclude_0">PlacementBuilder.exclude()</a>
   *  is called, an excluded placement will be created in this ad group.
   */
  def newPlacementBuilder: PlacementBuilder = ???
  /**
   *  Returns a new topic builder for this ad group. When 
   * <a href="adwordsapp_topicbuilder.html#build_0">TopicBuilder.build()</a>
   *  is called, a topic will be created in this ad group. When 
   * <a href="adwordsapp_topicbuilder.html#exclude_0">TopicBuilder.exclude()</a>
   *  is called, an excluded topic will be created in this ad group.
   */
  def newTopicBuilder: TopicBuilder = ???
  /**  Returns the selector of all placements in the ad group. */
  def placements: PlacementSelector = ???
  /**  Returns the selector of all topics in the ad group. */
  def topics: TopicSelector = ???
}