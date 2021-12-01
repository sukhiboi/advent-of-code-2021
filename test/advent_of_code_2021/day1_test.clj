(ns advent-of-code-2021.day1_test
  (:require [clojure.test :refer :all]
            [advent-of-code-2021.day1.core :refer :all]
            [clojure.string :as str]))

(def day1-aoc-example (str/join "\n" '(199 200 208 210 200 207 240 269 260 263)))

(deftest day1-test
  (testing "Testing Day 1"
    (is (= (part1 day1-aoc-example) 7)))
  (testing "Testing Day 2"
    (is (= (part2 day1-aoc-example) 5))))
