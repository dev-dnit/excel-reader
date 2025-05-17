package dnit.excel.reader.internal.models

import dnit.excel.reader.api.Excel
import java.lang.reflect.Field

internal data class ExcelFields(
    val annotation: Excel,
    val field: Field
)