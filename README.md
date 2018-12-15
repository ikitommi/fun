# (not) fun with protocols

```
lein repl
```

```clj
(load "fun/core")
; true

(load "fun/fun")

(load "fun/core")
; false <--- what happens here?
```
