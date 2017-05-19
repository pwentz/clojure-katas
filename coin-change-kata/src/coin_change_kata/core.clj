(ns coin-change-kata.core)

(defn add-coins [cents coins]
  (loop [acc []
         cents cents
         coins coins]
    (let [coin (first coins)]
      (cond (empty? coins) acc
            (<= 0 (- cents coin)) (recur (conj acc coin) (- cents coin) coins)
            :else (recur acc cents (rest coins))))))

(defn get-change [n-cents]
  (add-coins n-cents [25 10 5 1]))
