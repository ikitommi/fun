(ns fun.impl
  (:require [fun.fun :as p]))

(def fun
  (reify
    p/Fun
    (fun [this] "this is fun")))
