(ns fun.core
  (:require [fun.impl :as impl]
            [fun.fun :as p]))

(println (satisfies? p/Fun impl/fun))
