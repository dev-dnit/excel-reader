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
) : ExcelContainsContent {

    return try {
        return ExcelContainsContent(
            dictionaryColumnExcelIndexToField.keys.any { row.getCell(it)?.value != null }
        )

    } catch (_ : Throwable) {
        // Sometimes, the fastExcel is throwing some false rows with all [nulls] that are not
        // consistent with the actual excel
        ExcelContainsContent(containsContent = false, wasFalsePositive = true)
    }
}

internal data class ExcelContainsContent(
    val containsContent : Boolean,
    val wasFalsePositive : Boolean = false,
)

