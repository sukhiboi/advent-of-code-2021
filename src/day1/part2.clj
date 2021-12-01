(in-ns 'day1.core)

(defn part2 [input]
  (->> input
       (partition 3 1)
       (map #(reduce + %1))
       part1))
