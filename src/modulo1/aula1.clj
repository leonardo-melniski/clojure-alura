(ns modulo1.aula1)


(def total-de-produtos 15)

(println "Total" total-de-produtos)

(println (+ 9 10))

(def estoque ["bola" "camiseta"])

(println (estoque 0))
(println (estoque 1))

(println (count estoque))

(def estoque (conj estoque "bermuda"))


(println (estoque 2))




; -------------------------------------------------
;  function
; -------------------------------------------------

(defn imprime-menssagens []
  (println "------------------------")
  (println "hello world"))

(imprime-menssagens)


(defn valor-descontado
  "Retonar o valor descontado que é 90% do valor bruto"
  [valor-bruto]
  (* valor-bruto 0.9))

(println (valor-descontado 110))


(defn valor-descontado2
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto         (* valor-bruto taxa-de-desconto)]
    (println "calculando desconto" desconto)
    (- valor-bruto desconto)))

(println (valor-descontado2 120))



; ----------------------------------------------------
; if
; ----------------------------------------------------

(println (> 10 2))
(println (< 10 2))
(if (< 10 2) (println "TRUE") (println "FALSE"))



(defn valor-descontado3
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "calculando desconto" desconto)
      (- valor-bruto desconto))
    valor-bruto))


(println (valor-descontado3 1000))
(println (valor-descontado3 100))


