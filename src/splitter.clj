(def test-string "11&&22&&33&aa&&bb&c&dd")

(defn splitter [x]
  (let [s (.split x "&")]
    (loop [data s result [] current []]
      (when (not (empty? s))
	(if (= (first data) "")
	  (recur (rest data) result current)
	  (recur (rest data) 

(defn split-to-objects [text]
  (let [x (.split text "&")]
    (split-with #(= "" %) x)))

(defn split-by-char [sq d]
  (loop [x sq y [] z []]
    (if (empty? x)
      (cons z y)
      (if (= (first x) d)
	(recur (rest (rest x)) y (cons (first (rest x)) z))
	(recur (rest x) (cons z y) [])
	)
      )
    )
  )

(defn myreduce [x y]
  (if (= y "")
    (cons y x)
    (if (= (first x) "")
      (cons y (rest x))
      (cons y (list x)))))
