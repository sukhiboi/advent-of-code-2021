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
  (testing "Update Position for Part1"
    (is (=
          (updatePosition-part1 (hash-map :horizontal-distance 1 :depth 1) [:forward 2])
          (hash-map :horizontal-distance 3 :depth 1) ))
    (is (=
          (updatePosition-part1 (hash-map :horizontal-distance 10 :depth 10) [:up 2])
          (hash-map :horizontal-distance 10 :depth 8)))
    (is (=
          (updatePosition-part1 (hash-map :horizontal-distance 10 :depth 10) [:down 2])
          (hash-map :horizontal-distance 10 :depth 12))))
  (testing "Update Position for Part2"
    (is (=
          (updatePosition-part2 (hash-map :horizontal-distance 10 :depth 10 :aim 10) [:forward 2])
          (hash-map :horizontal-distance 12 :depth 30 :aim 10)))
    (is (=
          (updatePosition-part2 (hash-map :horizontal-distance 10 :depth 10 :aim 10) [:up 2])
          (hash-map :horizontal-distance 10 :depth 10 :aim 8)))
    (is (=
          (updatePosition-part2 (hash-map :horizontal-distance 10 :depth 10 :aim 10) [:down 2])
          (hash-map :horizontal-distance 10 :depth 10 :aim 12))))
  (testing "Testing Part1"
    (is (= (part1 aoc-example) 150)))
  (testing "Testing Part2"
    (is (= (part2 aoc-example) 900)))
  )
