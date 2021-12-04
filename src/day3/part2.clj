(in-ns 'day3.core)

(defn find-oxygen-generator-rating [report]
  (->> (mapv vector report)
       (->>
         first
         frequencies
         (#(cond
             (= (get % "0") (get % "1")) "1"
             (> (get % "0") (get % "1")) "0"
             :else "1"))
         )

       ))

(defn part2 [input]
  (->> input
       (apply mapv vector)
       (reduce #() {"0" 0 "1" 0})
       ))
