(in-ns 'advent-of-code-2021.day1.core)

(defn part1 [puzzleInput]
  (->> (parse-input puzzleInput)
       (partition 2 1)
       (reduce #(if (apply < %2) (inc %1) %1) 0)))
