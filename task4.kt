fun main(args: Array<String>) {
    val counts = args.groupingBy { it }.eachCount()
    counts.toSortedMap().forEach { (word, count) -> println("$word $count") }
}
