(ns coin-change-kata.core-spec
  (:require [speclj.core :refer :all]
            [coin-change-kata.core :refer :all]))

(describe "Coin Change"
  (it "can return minimal change for 1 cent"
    (should= [1]
             (get-change 1)))

  (it "can return minimal change for 10 cents"
    (should= [10]
             (get-change 10)))

  (it "can return minimal change for 15 cents"
    (should= [10 5]
             (get-change 15)))

  (it "can return minimal change for 20 cents"
    (should= [10 10]
             (get-change 20)))

  (it "can return minimal change for 23 cents"
    (should= [10 10 1 1 1]
             (get-change 23)))

  (it "can return minimal change for 25 cents"
    (should= [25]
             (get-change 25)))

  (it "can return minimal change for 47 cents"
    (should= [25 10 10 1 1]
             (get-change 47)))

  (it "can return minimal change for 67 cents"
    (should= [25, 25, 10, 5, 1, 1]
             (get-change 67)))

  (it "can return minimal change for 99 cents"
    (should= [25 25 25 10 10 1 1 1 1]
             (get-change 99)))

  (it "can return minimal change for 129034492 cents"
    (let [result (concat (take 11613 (repeat 25)) [10 5 1 1])]
      (should= result
               (get-change 290342)))))
