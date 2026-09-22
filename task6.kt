fun main(args: Array<String>) {
    val words = if (args.isNotEmpty()) {
        args.toList()
    } else {
        System.`in`.bufferedReader().readText()
            .trim()
            .split(Regex("\\s+"))
            .filter { it.isNotEmpty() }
    }

    val counts = words.groupingBy { it }.eachCount()
    counts.entries
        .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })
        .forEach { (word, count) -> println("$word $count") }
}
