(ns modulo2.aula1_tail_recursion_2)

; stack overflow with big sequence
(defn my-map
  [func inner-sequence]
  (let [frst (first inner-sequence)]
    (if (not (nil? frst))
      (do
        (func frst)
        (my-map func (rest inner-sequence))))))

; example
; (my-map println (range 100000))


; optimize stack memory -> clojure use 'recur'
; recur only in tail of function
(defn my-map
  [func inner-sequence]
  (let [frst (first inner-sequence)]
    (if (not (nil? frst))
      (do
        (func frst)
        (recur func (rest inner-sequence))))))

(my-map println (range 10000))
