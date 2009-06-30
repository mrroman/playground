(defn hex [x] (. Integer toHexString x))

(defn rgb [r g b]
  (hex 
   (+ b (* 256 (+ g (* 256 r))))))
