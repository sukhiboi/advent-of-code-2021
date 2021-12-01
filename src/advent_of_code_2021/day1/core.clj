(ns advent-of-code-2021.day1.core
  (:gen-class :main true)
  (:require [clojure.string :as str]))

(defn parse-input [puzzleInput]
  (for [depths (str/split-lines puzzleInput)]
    (Integer/parseInt depths)))

(load "part1")
(load "part2")
