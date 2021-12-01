(ns advent-of-code-2021.core
  (:gen-class))
(require 'advent-of-code-2021.day1.core)

(defn runSpecificDayProblems [day]
  (let [
        day (find-ns (symbol (str "advent-of-code-2021.day" day ".core")))
        part1 (symbol (str "part1"))
        part2 (symbol (str "part2"))
        ]
    (println (apply str (repeat 50 "-")))
    (println ((ns-resolve day part1)))
    (println (apply str (repeat 50 "=")))
    (println ((ns-resolve day part2)))
    ))

(defn -main
  ([] (println "Advent Of Code 2021"))
  ([dayNumber]
   (try (println "Running Day" dayNumber)
        (runSpecificDayProblems dayNumber)
        (catch Exception e (println "This day is not solved yet.")))
   ))
