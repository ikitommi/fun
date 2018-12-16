# (not) fun with protocols

# uberjar

```bash
lein with-profile uberjar1 uberjar # ok
lein with-profile uberjar2 uberjar # ok
lein with-profile uberjar3 uberjar # fails
```

# repl

```bash
lein repl
```

```clj
(load "fun/core")
; true

(load "fun/fun")

(load "fun/core")
; false <--- what happens here?
```
