(in-ns 'day2.core)

(defn updatePosition-part1 [current-position [direction displacement :as movement]]
  (cond
    (= direction :forward) (assoc current-position
                          :horizontal-distance (+ (:horizontal-distance current-position) displacement))
    (= direction :up) (assoc current-position
                          :depth (- (:depth current-position) displacement))
    (= direction :down) (assoc current-position
                          :depth (+ (:depth current-position) displacement))))

(defn part1 [input]
  (->> input
       (reduce updatePosition-part1 (hash-map :horizontal-distance 0 :depth 0))
       vals
       (apply *)))
