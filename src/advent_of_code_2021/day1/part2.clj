(in-ns 'advent-of-code-2021.day1.core)

(defn part2 [puzzleInput]
  (->> (parse-input puzzleInput)
       (partition 3 1)
       (map #(reduce + %1))
       (str/join "\n")
       part1))
