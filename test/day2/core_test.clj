(ns day2.core_test
  (:require [clojure.test :refer :all]
            [day2.core :refer :all]))

(deftest day2-parsing-function
  (testing "Testing Parsing function"
    (is (= (parse-input "test") "test"))))

(def aoc-example (parse-input (slurp "test/day2/testInput.txt")))

(deftest day2-test
  (testing "Testing Part1"
    (is (= (part1 aoc-example) "Day2Test\n")))
  (testing "Testing Part2"
    (is (= (part2 aoc-example) "Day2Test\n"))))
