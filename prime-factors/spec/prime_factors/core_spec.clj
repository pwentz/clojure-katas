(ns prime-factors.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors.core :refer :all]))

(describe "Prime Factors"
  (it "returns an empty array for numbers less than 2"
    (should= '() (prime-factors 1)))

  (it "returns prime factor of 2"
    (should= '(2) (prime-factors 2)))

  (it "returns prime factor of 4"
    (should= '(2 2) (prime-factors 4)))

  (it "returns prime factor of 5"
    (should= '(5) (prime-factors 5)))

  (it "returns prime factor of 6"
    (should= '(2 3) (prime-factors 6)))

  (it "returns prime factor of 9"
    (should= '(3 3) (prime-factors 9)))

  (it "returns prime factor of 12"
    (should= '(2 2 3) (prime-factors 12)))

  (it "returns prime factor of 147"
    (should= '(2 2 2 3 7) (prime-factors 168)))

  (it "returns prime factor of 330"
    (should= '(2 3 5 11) (prime-factors 330))))
