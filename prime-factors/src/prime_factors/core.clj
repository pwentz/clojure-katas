(ns prime-factors.core)

(defn first-factor-of [n]
  (->> n
       (inc)
       (range 2)
       (filter #(zero? (mod n %)))
       (first)))

(defn prime-factors [n]
  (let [first-factor (first-factor-of n)]
    (cond (< n 2) []
          (= n first-factor) [first-factor]
          :else (apply (partial conj [first-factor]) (->> first-factor
                                                          (/ n)
                                                          (prime-factors))))))
