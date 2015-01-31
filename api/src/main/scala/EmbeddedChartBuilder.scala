/**
 * EmbeddedChartBuilder This builder allows you to edit an EmbeddedChart. Make sure to call sheet.updateChart(builder.build()) to save your changes. 
 *  
 * 
 *  var sheet = SpreadsheetApp.getActiveSheet();
 *  var range = sheet.getRange("A1:B8");
 *  var chart = sheet.getCharts()[0];
 *  chart = chart.modify()
 *      .addRange(range)
 *      .setOption('title', 'Updated!')
 *      .setOption('animation.duration', 500)
 *      .setPosition(2,2,0,0)
 *      .build();
 *  sheet.updateChart(chart);
 */
trait EmbeddedChartBuilder {
  /** Adds a Range to the chart represented by this builder. Will not add the Range if it has already been added to the chart. */
  def addRange(range: Range): EmbeddedChartBuilder = ???
  /** Sets the chart type to AreaChart and returns an EmbeddedAreaChartBuilder. */
  def asAreaChart: EmbeddedAreaChartBuilder = ???
  /** Sets the chart type to BarChart and returns an EmbeddedBarChartBuilder. */
  def asBarChart: EmbeddedBarChartBuilder = ???
  /** Sets the chart type to ColumnChart and returns an EmbeddedColumnChartBuilder. */
  def asColumnChart: EmbeddedColumnChartBuilder = ???
  /** Sets the chart type to LineChart and returns an EmbeddedLineChartBuilder. */
  def asLineChart: EmbeddedLineChartBuilder = ???
  /** Sets the chart type to PieChart and returns an EmbeddedPieChartBuilder. */
  def asPieChart: EmbeddedPieChartBuilder = ???
  /** Sets the chart type to ScatterChart and returns an EmbeddedScatterChartBuilder. */
  def asScatterChart: EmbeddedScatterChartBuilder = ???
  /** Sets the chart type to TableChart and returns an EmbeddedTableChartBuilder. */
  def asTableChart: EmbeddedTableChartBuilder = ???
  /** Builds the chart to reflect all changes made to it. This method will not automatically draw the chart on top of the spreadsheet. A new chart must be inserted via sheet.insertChart(chart), and an existing chart should be updated via sheet.update(chart); */
  def build: EmbeddedChart = ???
  /** Returns the current chart type. */
  def getChartType: ChartType = ???
  /** Return the ContainerInfo, which encapsulates where the chart appears on the sheet. */
  def getContainer: ContainerInfo = ???
  /** Returns a copy of the list of ranges currently providing data for this chart. Use addRange and removeRange to modify this list. */
  def getRanges: Seq[Range] = ???
  /** Removes the specified Range from the chart represented by this builder. Will not throw an error if the Range is not in this chart. The range removed must match up with a range added via addRange(range), or it will not be removed, and it will not throw an exception. This method cannot be used to partially remove values from a range. */
  def removeRange(range: Range): EmbeddedChartBuilder = ???
  /** Changes the type of chart. Not all embedded chart types are currently supported. See ChartType. */
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = ???
  /**
   */
  def setOption(option: String)(value: Object): EmbeddedChartBuilder = ???
  /** Sets the position, changing where the chart appears on the sheet. AnchorRowPos and AnchorColPos are 1-indexed. */
  def setPosition(anchorRowPos: Int)(anchorColPos: Int)(offsetX: Int)(offsetY: Int): EmbeddedChartBuilder = ???
}