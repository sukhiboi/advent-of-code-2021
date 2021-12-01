(in-ns 'advent-of-code-2021.day1.core)

(defn part2 []
  (->> (parse-input)
       (partition 3 1)
       (map #(reduce + %1))
       (partition 2 1)
       (reduce #(if (apply < %2) (inc %1) %1) 0)
       println))
