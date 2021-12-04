(in-ns 'day3.core)

(defn part1 [input]
     (->> input
          (apply mapv vector)
          (map frequencies)
          (reduce #(merge-with str %1 {:gamma (if (> (get %2 "0") (get %2 "1")) 0 1)
                                       :epsilon (if (< (get %2 "0") (get %2 "1")) 0 1)
                                       }) {:gamma "" :epsilon ""})
          ((juxt :gamma :epsilon))
          (map #(Integer/parseInt % 2))
          (apply *)))
