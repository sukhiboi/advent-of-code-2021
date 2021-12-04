(ns day3.core_test
  (:require [clojure.test :refer :all]
            [day3.core :refer :all]))

(deftest day3-parsing-function
  (testing "Testing Parsing function"
    (is (= (parse-input "1110011\n1110111\n1111001") [
                                                      ["1" "1" "1" "0" "0" "1" "1"]
                                                      ["1" "1" "1" "0" "1" "1" "1"]
                                                      ["1" "1" "1" "1" "0" "0" "1"]]))))

(def aoc-example (parse-input "00100\n11110\n10110\n10111\n10101\n01111\n00111\n11100\n10000\n11001\n00010\n01010"))

(deftest day3-test
  (testing "Testing Part1"
    (is (= (part1 aoc-example) 198)))
  (testing "Testing Part2"
    (is (= (part2 aoc-example) 230))))
