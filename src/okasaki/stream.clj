(ns okasaki.stream)

(defprotocol IStream
  "All functions act on streams to create new streams."
  (++       [this other] "Appends two streams together.")
  (stake    [this n]     "Grabs the first n elements from a stream.")
  (sdrop    [this n]     "Drops the first n elements from a stream.")
  (sreverse [this]       "Reverses the stream."))

;(defrecord Stream [curr next]
;  IStream
;  (defn ++ [_ other]
;    ))
