(ns okasaki.lazy)

(defmacro $ [body]
  `(fn [] ~body))

(defn ! [susp]
  (susp))
