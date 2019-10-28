(ns alura.aula4)

(def precos [30 45 80 101 99 76 82])

(println (precos 0))
(println (get precos 0))

; (println (precos 10)) ; --- EXCEPTION
(println "VALOR PADRAO 2:" (get precos 10 2))
(println "VALOR PADRAO 2:" (get precos 1 2))


(defn quad [x] (* x x))

(println (update precos 0 inc))
(println (update precos 1 quad))

(println (update precos 1 (fn [x] (+ x x))))
(println (update precos 1 #(+ % %)))

(def func-anonima #(+ % 1000.9))

(println (update precos 1 func-anonima))

(println "vetor:precos continua igual")
(println precos)


; --------------------------------------
; map
; --------------------------------------


(defn aplica-dobro [x] (* 2 x))

(println "map" (map aplica-dobro precos))


; --------------------------------------
; filter
; --------------------------------------

(defn maior-50 [x] (> x 50))
(defn menor-igual-50 [x] (<= x 50))

(println "filter maior-50" (filter maior-50 precos))
(println "filter menor-igual-50" (filter menor-igual-50 precos))


(println "filter even?" (filter even? precos))
(println "filter odd?" (filter odd? precos))

; --------------------------------------
; reduce
; --------------------------------------

(defn soma
  [x y]
  (println "somando " x y)
  (+ x y))

(println "reduce-soma" (reduce soma precos))
(println "reduce +" (reduce + precos))


(println (range 10))




