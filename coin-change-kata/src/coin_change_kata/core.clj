(ns coin-change-kata.core)

(defn get-change [n-cents]
  (lazy-seq
    (cond (<= 0 (- n-cents 25)) (cons 25 (get-change (- n-cents 25)))
          (<= 0 (- n-cents 10)) (cons 10 (get-change (- n-cents 10)))
          (<= 0 (- n-cents 5)) (cons 5 (get-change (- n-cents 5)))
          (<= 0 (- n-cents 1)) (cons 1 (get-change (- n-cents 1)))
          :else [])))
