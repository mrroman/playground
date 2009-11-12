(defn hello [] 
  (println "Hello world!"))

(defn petla [x y]
  (loop [i 0 j 0]
    (when (< j y)
      (print (str "(" i "," j") "))
      (recur (mod (inc i) x) (if (= i (dec x)) (inc j) j))))))
