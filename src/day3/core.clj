(ns day3.core
  (:require [core]
            [clojure.string :as str]))

(defn parse-input [puzzle-input]
  (->> puzzle-input
       (str/split-lines)
       (map #(str/split % #""))
       (into [])))

(load "part1")
(load "part2")

(defn -main []
(let [
      day-number 2
      puzzle-input (parse-input (slurp (str "src/day3/puzzleInput.txt")))
      part1-solution (part1 puzzle-input)
      part2-solution (part2 puzzle-input)
      ]
  (core/present-puzzle-info day-number part1-solution part2-solution)))
