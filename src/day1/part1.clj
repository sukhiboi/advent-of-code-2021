(in-ns 'day1.core)

(defn part1 [input]
  (->> input
       (partition 2 1)
       (reduce #(if (apply < %2) (inc %1) %1) 0)))
