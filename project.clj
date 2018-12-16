(defproject fun "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:uberjar1 {:aot :all}
             :uberjar2 {:aot [fun.impl fun.core fun.fun fun.main]}
             :uberjar3 {:aot [fun.main fun.impl fun.fun fun.core]}}

  :dependencies [[org.clojure/clojure "1.8.0"]])
