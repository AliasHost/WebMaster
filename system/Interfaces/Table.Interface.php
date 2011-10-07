<?php

/**
 * Represents a table within a database containing rows and columns
 * @author Devon R.K. McAvoy
 *
 */
interface Table{

	/**
	 * Gets the column prefix in this table
	 * @return string
	 */
	public function getColumnPrefix();

	/**
	 * Sets the column prefix
	 * @param string $solumnPrefix
	 */
	public function setColumnPrefix($solumnPrefix);

	/**
	 * Adds a column
	 * @param Column $col
	 */
	public function addColumn($col);
	/**
	 * Deletes the column from the table
	 * @param Column $col
	 */
	public function dropColumn($col);
	/**
	 * Alters the column
	 * @param Column $col
	 */
	public function alterColumn($col);

	/**
	 * Add a Row to the Table
	 * @param Row $row
	 */
	public function insertRow($row);
	/**
	 * Delete a Row from the Table
	 * @param Row $row
	 */
	public function deleteRow($row);
	/**
	 * Update the contents of a Row
	 * @param Table $row
	 * @return Row
	 */
	public function updateRow($row);
	/**
	 * Returns the Row the requested columns
	 * @param Table $row
	 * @return Row
	 */
	public function selectRow($row);

	/**
	 * Counts the entries in the column;
	 * @param Column $col
	 * @return int
	 */
	public function count($col);

}

?>