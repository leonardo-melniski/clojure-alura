(ns modulo2.aula1_map_1)

(def words ["hello" "world" "book" "table"])

(println "(map println words)")
(map println words)

(println "(println (first words))")
(println (first words))
(println (first []))                                        ; returns -> nil

(println "(println (rest words))")
(println (rest words))
(println "(println (next words))")
(println (next words))

(println "(println (rest []))")
(println (rest []))                                         ; returns -> () ; sequence
(println "(println (next []))")
(println (next []))                                         ; returns -> nil

(println (seq []))                                          ; nil
(println (seq [1 2 3 4]))                                   ; (1, 2, 3, 4) ; sequence


(println "my implementation of map")
;(defn my-map
;  [func inner-sequence]
;  (let [frst (first inner-sequence)]
;    (func frst)
;    (my-map func (rest inner-sequence)))) ;    (my-map func (rest inner-sequence))))
;
;(my-map println words)


(defn my-map
  [func inner-sequence]
  (let [frst (first inner-sequence)]
    (if (not (nil? frst))
      (do
        (func frst)
        (my-map func (rest inner-sequence))))))

(println "-- BEGIN --")
(my-map println words)
(println "-----")
(my-map println [])
(println "-----")
(my-map println ["bingo" false 10])
(println "-----")
(my-map println nil)
(println "-- END --")
