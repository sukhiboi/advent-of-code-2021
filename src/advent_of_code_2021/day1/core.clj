(ns advent-of-code-2021.day1.core
  (:gen-class :main true))

(defn -main [] (println "Hello in day 1"))

(defn read-input [part]
  (slurp (str "src/advent_of_code_2021/day1/puzzleInput.txt")))

(defn parse-input []
  (for [depth (-> (read-input "part1") (.split "\n"))]
    (Integer/parseInt depth)))

(load "part1")
(load "part2")
