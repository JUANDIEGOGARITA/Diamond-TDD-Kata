import java.util.ArrayList
import java.util.Collections.reverse

class Diamond {
    val START_LETTER = 'A'

    fun upTo(stopLetter: Char): ArrayList<String> {
        val rows:List<String> = createRows(stopLetter)
        val mirroredRows = mirrorRows(rows)
        rows.addAll(mirroredRows)

    }

    private fun mirrorRows(rows: List<String>): List<String> {
        val mirroredRows = ArrayList(rows)
        reverse(mirroredRows)
        mirroredRows.removeAt(0)
        return mirroredRows
    }

    private fun createRows(stopLetter: Char): List<String> {
        val rows = ArrayList<String>()
        val letterInterval = stopLetter - START_LETTER
        for (letterIndex in 0..letterInterval) {
            rows.add(createRow(stopLetter, letterIndex))
        }
        return rows
    }
}