(ns core)

(defn present-puzzle-info [day-number part1-solution part2-solution]
  (println "Running Day" day-number "Puzzle")
  (println (apply str (repeat 50 "-")))
  (println "Part1 Solution:" part1-solution)
  (println "Part2 Solution:" part2-solution))

(defn -main [] (println "Advent Of Code 2021"))
