(ns fun.core
  (:require [fun.impl :as impl]
            [fun.fun :as p]))

(if-not (satisfies? p/Fun impl/fun)
  (throw (ex-info "fail" {})))
