(ns day1.core
  (:gen-class :main true)
  (:require [core])
  (:require [clojure.string :as str]))

(defn parse-input [puzzle-input]
  (for [depths (str/split-lines puzzle-input)]
    (Integer/parseInt depths)))

(load "part1")
(load "part2")

(defn -main []
(let [
      day-number 1
      puzzle-input (parse-input (slurp (str "src/day1/puzzleInput.txt")))
      part1-solution (part1 puzzle-input)
      part2-solution (part2 puzzle-input)
      ]
  (core/present-puzzle-info day-number part1-solution part2-solution)))
