(defn hello []
  (println "Hello world!"))

(defn hello-frame []
  (doto (javax.swing.JFrame.)
    (.setTitle "Hello world!")
    (.setVisible true)))

(defn get-timer-task [what]
  (proxy [java.util.TimerTask] []
    (run []
	 (what))))

(defn get-date [hr mi]
  (let [calendar (doto (java.util.Calendar/getInstance)
		   (.set java.util.Calendar/HOUR_OF_DAY hr)
		   (.set java.util.Calendar/MINUTE mi))]
    (.getTime calendar)))

(defn setup-timer [hr mi what]
  (let 
      [timer-task (get-timer-task what)]
    (doto (java.util.Timer.)
      (.schedule timer-task (get-date hr mi)))))
