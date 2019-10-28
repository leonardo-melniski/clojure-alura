(ns alura.aula5)


(def escola {"mochila" 10 "camisa" 5})
(println escola)
(def escola {"mochila" 10, "camisa" 5})
(println escola)
(def escola {"mochila" 10
             "camisa"  5})
(println escola)

(println (count escola) "elementos")
(println "keys" (keys escola))
(println "values" (vals escola))

; keywork
; :mochila

(def escola {:mochila 10, :camisa 5})
(println escola)


(println (assoc escola :cadeira 50))

(println (dissoc escola :cadeira 50))
;(println (update escola :cadeira inc))

(println (contains? escola :cadeira))

; -------------------------------------------------------------------


(def pedido {:mochila {:quantidade 2 :preco 80}
             :camisa  {:quantidade 3 :preco 40}})


(println "------------------------------")
(println pedido)

(println ":exception is ->" (get pedido :exp))              ; nil pointer execption
(println ":mochila is ->" (get pedido :mochila))            ; without value default
(println ":tenis is ->" (get pedido :tenis {}))             ; with value default

(println ":tenis is ->" (:mochila pedido {}))               ;keyword pode ser invocada como funcao
(println ":tenis is ->" :tenis (pedido {}))                 ;keyword pode ser invocada como funcao

(println "update :quantidade da :mochila is ->"
         (update-in pedido [:mochila :quantidade] inc))


(println (:quantidade (:mochila pedido)))

; THREADING
(println (-> pedido
             :mochila
             :quantidade))











