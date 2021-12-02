(ns day2.core_test
  (:require [clojure.test :refer :all]
            [day2.core :refer :all]))

(deftest day2-parsing-function
  (testing "Testing Parsing function"
    (is (= (parse-input "forward 5\ndown 5") '((:forward 5) (:down 5))))))

(def aoc-example '(
                   (:forward 5)
                   (:down 5)
                   (:forward 8)
                   (:up 3)
                   (:down 8)
                   (:forward 2)))

(deftest day2-test
  (testing "Testing Part1"
    (is (= (part1 aoc-example) 150)))
  (testing "Testing Part2"
    (is (= (part2 aoc-example) "Day2Part2"))))
