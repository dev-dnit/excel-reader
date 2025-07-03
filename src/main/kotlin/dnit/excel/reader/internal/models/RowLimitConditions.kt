package dnit.excel.reader.internal.models

class RowLimitConditions {
    private var amountEmptyRowsUntilHeader : Int = 0
    private var amountEmptyRowsAfterHeader : Int = 0

    fun increaseEmptyRowsUntilHeader(): Int {
        amountEmptyRowsUntilHeader++
        return amountEmptyRowsUntilHeader
    }

    fun resetEmptRowsAfterHeader() {
        amountEmptyRowsAfterHeader = 0
    }

    fun increaseEmptyRowsAfterHeader(): Int {
        amountEmptyRowsAfterHeader++
        return amountEmptyRowsAfterHeader
    }

}
