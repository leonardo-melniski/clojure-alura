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
