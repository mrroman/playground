(defn split-to-objects [text]
  (let [x (.split text "&")]
    (split-with #(= "" %) x)))

(defn split-by-char [sq d]
  (loop [x sq y [] z []]
    (if (empty? x)
      (cons z y)
      (if (= (first x) d)
	(recur [(rest x) (cons z y) []])
	(recur [(rest x) y (cons (first x) z)])
	)0
      )
    )
  )
