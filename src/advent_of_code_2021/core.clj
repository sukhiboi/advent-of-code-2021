(ns advent-of-code-2021.core
  (:gen-class))
(require 'advent-of-code-2021.day1.core)

(defn runSpecificDayProblems [dayNumber]
  (let [
        day (find-ns (symbol (str "advent-of-code-2021.day" dayNumber ".core")))
        part1 (symbol (str "part1"))
        part2 (symbol (str "part2"))
        puzzleInput (slurp (str "src/advent_of_code_2021/day" dayNumber "/puzzleInput.txt"))
        ]
    (println (apply str (repeat 50 "-")))
    (println "Part1 Solution:" ((ns-resolve day part1) puzzleInput))
    (println "Part2 Solution:" ((ns-resolve day part2) puzzleInput))
    ))

(defn -main
  ([] (println "Advent Of Code 2021"))
  ([dayNumber]
   (try (println "Running Day" dayNumber)
        (runSpecificDayProblems dayNumber)
        (catch Exception e (println "This day is not solved yet." )))
   ))
