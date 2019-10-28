(ns alura.aula6)

(def pedido {:mochila {:quantidade 2 :preco 80}
             :camisa  {:quantidade 3 :preco 40}})


; ---------------------------------------------
;
(defn imprime-e-15 [valor]
  (println "v:" valor (class valor))
  15)


(map imprime-e-15 pedido)



; ---------------------------------------------
;
(defn imprime-e-15 [[chave valor]]
  (println "c:" chave (class chave))
  (println "v:" valor (class valor))
  15)

(println (map imprime-e-15 pedido))



; ---------------------------------------------
;
(defn imprime-e-valor [[chave valor]]
  (println "v:" valor )
  valor)

(println (map imprime-e-valor pedido))


; ---------------------------------------------
;
(defn preco-por-produto [[_ valor]]
  (* (:quantidade valor) (:preco valor)))

(println (map preco-por-produto pedido))

(println (reduce + (map preco-por-produto pedido)))


; ----------
; reduce sem threading
(defn total-do-pedido
  [pedido]
  (reduce + (map preco-por-produto pedido)))

(println (total-do-pedido pedido))



; ----------
; reduce com
; threading LAST
(defn total-do-pedido
  [pedido]
  (->> pedido
       (map preco-por-produto ,,,)
       (reduce + ,,,)))

(println (total-do-pedido pedido))



; nova definicao de passagem pro map
(defn preco-total-por-produto [produto]
  (* (:quantidade produto) (:preco produto)))

(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-total-por-produto ,,,)
       (reduce + ,,,)))

(println (total-do-pedido pedido))


; -----------------------------------------------------


(def pedido {:mochila {:quantidade 2 :preco 80}
             :camisa  {:quantidade 3 :preco 40}
             :chaveiro {:quantidade 1}
             })


(defn gratuito?
  [[key value]]
  (println key "<e>" value)
  (<= (:preco value 0) 0)
  )

(println "filtro gratuitos:"
         (filter gratuito? pedido))


; ----------------------------------------------
; usando funcao anonima
; ----------------------------------------------

(defn gratuito?
  [value]
  (<= (:preco value 0) 0))

(println "filtro gratuitos:"
         (filter (fn [[key value]] (gratuito? value)) pedido))

(println "filtro gratuitos:"
         (filter #(gratuito? (second %))  pedido))



(defn pago?
  [item]
  (not (gratuito? item)))

(println (pago? {:preco 100}))
(println (pago? {:preco 0}))
(println (pago? {}))


; -----------------------------------------
; composicao de funcao

; definindo simbolo
(def pago? (comp not gratuito?))

(println (pago? {:preco 100}))
(println (pago? {:preco 0}))




