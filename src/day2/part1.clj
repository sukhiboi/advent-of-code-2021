(in-ns 'day2.core)

(defn updatePosition [
                      {horizontal-distance :horizontal-distance depth :depth :as current-position}
                      [direction displacement :as movement]]
  (cond
    (= direction :forward) {:horizontal-distance (+ horizontal-distance displacement) :depth depth}
    (= direction :up) {:horizontal-distance horizontal-distance :depth (- depth displacement)}
    (= direction :down) {:horizontal-distance horizontal-distance :depth (+ depth displacement)}
    ))

(defn part1 [input]
  (->> input
       (reduce updatePosition (hash-map :horizontal-distance 0 :depth 0))
       vals
       (apply *)))
