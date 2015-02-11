package com.google.appsscript.adwords

import com.google.appsscript.base._

import com.google.appsscript.charts._

import com.google.appsscript.drive._

import com.google.appsscript.spreadsheet._

import com.google.appsscript.drive._

import scala.scalajs.js

/**
 * 
 *  Represents a shopping campaign.
 */
trait ShoppingCampaign extends js.Object {
  /**  Returns the selector of all shopping ad groups in the shopping campaign. */
  def adGroups(): ShoppingAdGroupSelector = js.native
  /**
   *  Creates an ad schedule criterion from an ad schedule object. Once created, the shopping campaign will start showing ads during the specified time. 
   * <p>When called with one argument, <code>addAdSchedule</code> supports two kinds of input: </p>
   * <ul> 
   *  <li>Existing <a href="adwordsapp_adschedule.html">AdSchedule</a> objects, perhaps from another campaign: <pre class="prettyprint">
   *  var campaigns = AdWordsApp.campaigns().get();
   *  var campaign1 = campaigns.next();
   *  var campaign2 = campaigns.next();
   *  var schedule = campaign1.targeting().adSchedules().get().next();
   *  campaign2.addAdSchedule(schedule);</pre></li> 
   *  <li>Plain JavaScript objects describing an ad schedule. For instance, this will create an ad schedule covering Saturday mornings: <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.addAdSchedule({
   *    dayOfWeek: "SATURDAY",
   *    startHour: 7,
   *    startMinute: 0,
   *    endHour: 11,
   *    endMinute: 0,
   *    bidModifier: 1.1
   *  });</pre> This will look at the following properties of the given object: 
   *   <ul> 
   *    <li><code>dayOfWeek</code>: <strong>Required.</strong> Must be one of <code>"MONDAY"</code>, <code>"TUESDAY"</code>, <code>"WEDNESDAY"</code>, <code>"THURSDAY"</code>, <code>"FRIDAY"</code>, <code>"SATURDAY"</code>, or <code>"SUNDAY"</code>.</li> 
   *    <li><code>startHour</code> and <code>startMinute</code>: <strong>Required.</strong> The starting time of this segment of the ad schedule. <code>startHour</code> must be an integer between <code>0</code> and <code>23</code>, and <code>startMinute</code> must be either <code>0</code>, <code>15</code>, <code>30</code>, or <code>45</code>. For instance, a <code>startHour</code> of <code>18</code> and a <code>startMinute</code> of <code>30</code> would result in an ad schedule starting at 6:30PM. Acceptable starting times range from <code>00:00</code> to <code>23:45</code>.</li> 
   *    <li><code>endHour</code> and <code>endMinute</code>: <strong>Required.</strong> The ending time of this segment of the ad schedule. <code>endHour</code> must be an integer between <code>0</code> and <code>24</code>, and <code>endMinute</code> must be either <code>0</code>, <code>15</code>, <code>30</code>, or <code>45</code>. For instance, a <code>endHour</code> of <code>18</code> and a <code>endMinute</code> of <code>30</code> would result in an ad schedule ending at 6:30PM. Acceptable ending times range from <code>00:15</code> to <code>24:00</code>.</li> 
   *    <li><code>bidModifier</code>: <strong>Optional.</strong> The bid modifier for this segment of the ad schedule.</li>
   *   </ul> </li>
   * </ul>
   * <p></p>
   *  
   * <p>One thing to keep in mind is that, by default, campaigns have no ad schedule criteria and hence serve ads at all times. Adding the first ad schedule to a campaign will cause ads to be shown during that time only.</p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def addAdSchedule(adSchedule: AnyRef): Unit = js.native
  /**
   *  Creates an ad schedule criterion. Once created, the shopping campaign will start showing ads during the specified time. 
   * <p>For instance, this will create an ad schedule covering Saturday mornings: </p>
   * <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.addAdSchedule("SATURDAY", 7, 0, 11, 0);</pre>
   * <p></p>
   *  
   * <p>This will create the same schedule, but with a bid modifier of <code>1.1</code>: </p>
   * <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.addAdSchedule("SATURDAY", 7, 0, 11, 0, 1.1);</pre>
   * <p></p>
   *  
   * <p>One thing to keep in mind is that, by default, campaigns have no ad schedule criteria and hence serve ads at all times. Adding the first ad schedule to a campaign will cause ads to be shown during that time only.</p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def addAdSchedule(dayOfWeek: String, startHour: Int, startMinute: Int, endHour: Int, endMinute: Int, bidModifier: Double): Unit = js.native
  /**
   *  Creates a location target in this campaign from a location object. Once created, the shopping campaign will start showing ads to the location with the given location ID. 
   * <p>When called with one argument, <code>addLocation</code> supports three kinds of input: </p>
   * <ul> 
   *  <li>A location ID. For a list of locations and their corresponding IDs, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>.</li> 
   *  <li>Existing <a href="adwordsapp_targetedlocation.html">TargetedLocation</a> or <a href="adwordsapp_excludedlocation.html">ExcludedLocation</a> objects, perhaps from another campaign: <pre class="prettyprint">
   *  var campaigns = AdWordsApp.campaigns().get();
   *  var campaign1 = campaigns.next();
   *  var campaign2 = campaigns.next();
   *  var location = campaign1.targeting().targetedLocations().get().next();
   *  campaign2.addLocation(location);</pre></li> 
   *  <li>Plain JavaScript objects describing a location. For instance, this would create a location target for Tennessee: <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.addLocation({
   *    id: 21175,
   *    bidModifier: 1.2,
   *  });</pre> This will look at the following properties of the given object: 
   *   <ul> 
   *    <li><code>id</code>: <strong>Required.</strong> The ID of the location to target. For a list of locations and their corresponding IDs, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>.</li> 
   *    <li><code>bidModifier</code>: <strong>Optional.</strong> The bid modifier for this location.</li> 
   *   </ul></li>
   * </ul>
   * <p></p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def addLocation(location: AnyRef): Unit = js.native
  /**
   *  Creates a location target in this campaign from a location ID and bid modifier. Once created, the shopping campaign will start showing ads to the location with the given location ID. 
   * <p>For instance, this will create a location target for Tennessee with a bid modifier of <code>1.15</code>: </p>
   * <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.addLocation(21175, 1.15);</pre>
   * <p></p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def addLocation(locationId: Int, bidModifier: Double): Unit = js.native
  /**
   *  Creates a proximity target in this campaign from a proximity object. Once created, the shopping campaign will start showing ads to geographical points within the specified radius of the specified central point. 
   * <p>When called with one argument, <code>addProximity</code> supports two kinds of input: </p>
   * <ul> 
   *  <li>Existing <a href="adwordsapp_targetedproximity.html">TargetedProximity</a> objects, perhaps from another campaign: <pre class="prettyprint">
   *  var campaigns = AdWordsApp.campaigns().get();
   *  var campaign1 = campaigns.next();
   *  var campaign2 = campaigns.next();
   *  var proximity = campaign1.targeting().targetedProximities().get().next();
   *  campaign2.addProximity(proximity);</pre></li> 
   *  <li>Plain JavaScript objects describing a proximity. For instance, this would create a proximity targeting 20km around Google headquarters: <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.addProximity({
   *    latitude: 37.423021,
   *    longitude: -122.083739,
   *    radius: 20,
   *    radiusUnits: "KILOMETERS",
   *    bidModifier: 0.75,
   *    address: {
   *      streetAddress: "1600 Amphitheatre Parkway",
   *      cityName: "Mountain View",
   *      provinceName: "California",
   *      provinceCode: "CA",
   *      postalCode: "94043",
   *      countryCode: "US"
   *    }
   *  });</pre> This will look at the following properties of the given object: 
   *   <ul> 
   *    <li><code>latitude</code> and <code>longitude</code>: <strong>Required.</strong> The central geographic point of the proximity to target.</li> 
   *    <li><code>radius</code> and <code>radiusUnits</code>: <strong>Required.</strong> The radius around the central point to target. <code>radiusUnits</code> must be either <code>"MILES"</code> or <code>"KILOMETERS"</code>.</li> 
   *    <li><code>bidModifier</code>: <strong>Optional.</strong> The bid modifier for this proximity.</li> 
   *    <li><code>address</code>: <strong>Optional.</strong> The address associated with the central geographical point. <p>If present, this is expected to be an object, which contains any of <code>streetAddress</code>, <code>streetAddress2</code>, <code>cityName</code>, <code>provinceName</code>, <code>provinceCode</code>, <code>postalCode</code>, and <code>countryCode</code> as properties with string values. This corresponds to the <a href="adwordsapp_address.html">Address</a> objects returned by existing proximity targets. </p> <p>There is no validation to check that the address actually belongs to the given latitude and longitude. It has no functionality except to change what shows up in the Campaign Management interface.</p></li>
   *   </ul> </li>
   * </ul>
   * <p></p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def addProximity(proximity: AnyRef): Unit = js.native
  /**
   *  Creates a proximity target in this campaign. Once created, the shopping campaign will start showing ads to geographical points within the specified radius of the specified central point. 
   * <p>For instance, this will create a proximity targeting 20km around Google headquarters: </p>
   * <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.addProximity(37.423021, -122.083739, 20, "KILOMETERS");</pre>
   *  Similarly, to create the same proximity target with a bid modifier and address: 
   * <pre class="prettyprint">
   *  campaign.addProximity(37.423021, -122.083739, 20, "KILOMETERS", {
   *    bidModifier: 1.15,
   *    address: {
   *      streetAddress: "1600 Amphitheatre Parkway",
   *      cityName: "Mountain View",
   *      provinceName: "California",
   *      provinceCode: "CA",
   *      postalCode: "94043",
   *      countryCode: "US"
   *    }
   *  });</pre>
   *  
   * <p></p>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def addProximity(latitude: Double, longitude: Double, radius: Double, radiusUnits: String, optArgs: AnyRef): Unit = js.native
  /**  Returns the selector of all product ads in the shopping campaign. */
  def ads(): ProductAdSelector = js.native
  /**
   *  Applies a label to the shopping campaign. 
   * <code>name</code>
   *  of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account. 
   * <p>Note that the shopping campaign cannot not have more than 50 labels. </p>
   * <p>Returns nothing.</p>
   *  
   */
  def applyLabel(name: String): Unit = js.native
  /**  Provides access to this shopping campaign's bidding fields. */
  def bidding(): ShoppingCampaignBidding = js.native
  /**
   *  Enables the shopping campaign. 
   * <p>Returns nothing.</p>
   *  
   */
  def enable(): Unit = js.native
  /**
   *  Creates a location exclusion in this campaign. Once created, the shopping campaign will not show ads to the location with the given location ID. 
   * <p>This method accepts three forms of input: </p>
   * <ul> 
   *  <li>A simple location ID. For a list of locations and their corresponding IDs, please see the <a href="/adwords/api/docs/appendix/geotargeting">AdWords API documentation on geotargeting</a>: <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.excludeLocation(21175);</pre></li> 
   *  <li>Existing <a href="adwordsapp_targetedlocation.html">TargetedLocation</a> or <a href="adwordsapp_excludedlocation.html">ExcludedLocation</a> objects, perhaps from another campaign: <pre class="prettyprint">
   *  var campaigns = AdWordsApp.campaigns().get();
   *  var campaign1 = campaigns.next();
   *  var campaign2 = campaigns.next();
   *  var location = campaign1.targeting().excludedLocations().get().next();
   *  campaign2.excludeLocation(location);</pre></li> 
   *  <li>Plain JavaScript objects describing a location. For instance, this would create a location exclusion for Tennessee: <pre class="prettyprint">
   *  var campaign = AdWordsApp.campaigns().get().next();
   *  campaign.excludeLocation({
   *    id: 21175
   *  });</pre> The only field of the object which will be looked at is <code>id</code>, which represents the location ID.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def excludeLocation(locationOrId: AnyRef): Unit = js.native
  /**
   *  Returns the ad rotation type of the shopping campaign. Possible return values: 
   * <p><code>OPTIMIZE, CONVERSION_OPTIMIZE, ROTATE, ROTATE_FOREVER</code></p>
   */
  def getAdRotationType(): String = js.native
  /**
   *  Returns the bidding strategy type of the shopping campaign. Possible return values: 
   * <p><code>MANUAL_CPC, MANUAL_CPM, BUDGET_OPTIMIZER, CONVERSION_OPTIMIZER, PERCENT_CPA</code></p>
   */
  def getBiddingStrategyType(): String = js.native
  /**
   *  Returns the budget of the shopping campaign. In order to change the shopping campaign's budget, use 
   * <a href="adwordsapp_budget.html#setAmount_1">Budget.setAmount(double)</a>
   * .
   */
  def getBudget(): Budget = js.native
  /**
   *  Returns the shopping campaign's end date, or 
   * <code>null</code>
   *  if there is no end date. For instance, if a campaign ended on May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getEndDate(): AdWordsDate = js.native
  /**
   *  Returns the type of this entity as a 
   * <code>String</code>
   * , in this case, 
   * <code>"ShoppingCampaign"</code>
   * .
   */
  def getEntityType(): String = js.native
  /**  Returns the ID of the shopping campaign. */
  def getId(): Long = js.native
  /**  Returns the name of the shopping campaign. */
  def getName(): String = js.native
  /**
   *  Returns the shopping campaign's start date. For instance, if a campaign started on May 3, 2013, this would return the following object: 
   * <code>{year: 2013, month: 5, day: 3}</code>
   * .
   */
  def getStartDate(): AdWordsDate = js.native
  /**
   *  Returns stats for the specified date range. Supported values: 
   * <p><code>TODAY, YESTERDAY, LAST_7_DAYS, THIS_WEEK_SUN_TODAY, LAST_WEEK, LAST_14_DAYS, LAST_30_DAYS, LAST_BUSINESS_WEEK, LAST_WEEK_SUN_SAT, THIS_MONTH, LAST_MONTH, ALL_TIME</code>.</p>
   *  Example: 
   * <pre class="prettyprint">
   *  var stats = shoppingCampaign.getStatsFor("THIS_MONTH");</pre>
   */
  def getStatsFor(dateRange: String): Stats = js.native
  /**
   *  Returns stats for the specified custom date range. Both parameters can be either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  form. For instance, 
   * <code>March 24th, 2013</code>
   *  is represented as either 
   * <code>{year: 2013, month: 3, day: 24}</code>
   *  or 
   * <code>"20130324"</code>
   * . The date range is inclusive on both ends, so 
   * <code>forDateRange("20130324", "20130324")</code>
   *  defines a range of a single day.
   */
  def getStatsFor(dateFrom: AnyRef, dateTo: AnyRef): Stats = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the shopping campaign is deleted.
   */
  def isDeleted(): Boolean = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the shopping campaign is enabled.
   */
  def isEnabled(): Boolean = js.native
  /**
   *  Returns 
   * <code>true</code>
   *  if the shopping campaign is paused.
   */
  def isPaused(): Boolean = js.native
  /**  Creates a selector of all labels applied to the shopping campaign. */
  def labels(): LabelSelector = js.native
  /**
   *  Returns a selector of the campaign-level negative keywords belonging to this campaign. 
   * <br>
   * <br>
   *  Note that this selector will not return any negative keywords belonging to this campaign's child ad groups — it only returns campaign-level negative keywords.
   */
  def negativeKeywords(): NegativeKeywordSelector = js.native
  /**  Returns a new shopping ad group builder for this shopping campaign. */
  def newAdGroupBuilder(): ShoppingAdGroupBuilder = js.native
  /**
   *  Pauses the shopping campaign. 
   * <p>Returns nothing.</p>
   *  
   */
  def pause(): Unit = js.native
  /**  Returns the selector of all product groups in the campaign. */
  def productGroups(): ProductGroupSelector = js.native
  /**
   *  Removes a label from the shopping campaign. 
   * <code>name</code>
   *  of the label is case-sensitive. Operation will fail if the label with the specified name does not already exist in the account. 
   * <p>Returns nothing.</p>
   *  
   */
  def removeLabel(name: String): Unit = js.native
  /**
   *  Sets the ad rotation type of the shopping campaign. For instance, 
   * <code>campaign.setAdRotationType("OPTIMIZE");</code>
   *  instructs AdWords to optimize ad serving based on the shopping campaign's CTR. For more information, see 
   * <a href="https://support.google.com/adwords/answer/2404248">Choose an ad delivery method</a>
   *  help article. 
   * <p>Returns nothing.</p>
   *  
   */
  def setAdRotationType(adRotationType: String): Unit = js.native
  /**
   *  Sets the shopping campaign's end date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>campaign.setEndDate("20130503");</code>
   *  is equivalent to 
   * <code>campaign.setEndDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>it's a date in the past, or</li> 
   *  <li>it's a date after the latest allowed end date of December 30, 2037.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setEndDate(date: AnyRef): Unit = js.native
  /**
   *  Sets the name of the shopping campaign. 
   * <p>Returns nothing.</p>
   *  
   */
  def setName(name: String): Unit = js.native
  /**
   *  Sets the shopping campaign's start date from either an object containing year, month, and day fields, or an 8-digit string in 
   * <code>YYYYMMDD</code>
   *  format. For instance, 
   * <code>campaign.setStartDate("20130503");</code>
   *  is equivalent to 
   * <code>campaign.setStartDate({year: 2013, month: 5, day: 3});</code>
   * . The change will fail and report an error if:
   * <ul> 
   *  <li>the shopping campaign has already started,</li> 
   *  <li>the given date is invalid (e.g., <code>{year: 2013, month: 5, day: 55}</code>),</li> 
   *  <li>the given date is after the shopping campaign's end date,</li> 
   *  <li>it's a date in the past, or </li> 
   *  <li>it's a date after the latest allowed end date of December 30, 2037.</li>
   * </ul>
   *  
   * <p>Returns nothing.</p>
   *  
   */
  def setStartDate(date: AnyRef): Unit = js.native
  /**  Provides access to campaign-level targeting criteria: device targeting, ad scheduling, and location targeting. */
  def targeting(): Targeting = js.native
}