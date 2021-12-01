(ns day1.core_test
  (:require [clojure.test :refer :all]
            [day1.core :refer :all]))

(deftest day1-parsing-function
  (testing "Testing Parsing function"
    (is (= (parse-input "12\n13\n14") '(12 13 14)))))

(def day1-aoc-example (parse-input (slurp "test/day1/testInput.txt")))

(deftest day1-test
  (testing "Testing Part1"
    (is (= (part1 day1-aoc-example) 7)))
  (testing "Testing Part2"
    (is (= (part2 day1-aoc-example) 5))))
