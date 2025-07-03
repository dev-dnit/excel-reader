package dnit.excel.reader.internal.validation

import dnit.excel.reader.internal.models.ExcelFields
import org.dhatim.fastexcel.reader.Row


/**
 * Checks if the row contains any content.
 * This function checks if the row is empty or not.
 */
internal fun rowsContainsContent(
    row : Row,
    dictionaryColumnExcelIndexToField : Map<Int, ExcelFields>,
) : Boolean {
    return dictionaryColumnExcelIndexToField.keys.any { row.getCell(it)?.value != null }
}

