(ns coin-change-kata.core)

(defn add-coin [coin-map coin]
  (let [cents (:cents coin-map)
        change (:change coin-map)]
    (if (< (- cents coin) 0)
      coin-map
      (recur {:cents (- cents coin) :change (conj change coin)} coin))))

(defn get-change [cents]
  (:change
    (reduce add-coin {:cents cents, :change []} [25 10 5 1])))
