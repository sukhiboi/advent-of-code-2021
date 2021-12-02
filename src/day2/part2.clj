(in-ns 'day2.core)

(defn updatePosition-part2 [current-position [direction displacement :as movement]]
  (cond
    (= direction :forward) (assoc current-position
                             :horizontal-distance (+ (:horizontal-distance current-position) displacement)
                             :depth (+ (:depth current-position)
                                       (* (:aim current-position) displacement)))
    (= direction :up) (assoc current-position
                        :aim (- (:aim current-position) displacement))
    (= direction :down) (assoc current-position
                          :aim (+ (:aim current-position) displacement))))

(defn part2 [input]
  (->> input
       (reduce updatePosition-part2 (hash-map :horizontal-distance 0 :depth 0 :aim 0))
       (#(vals (select-keys % [:horizontal-distance :depth])))
       (apply *)))
