(defn hex [x] 
	"Returns hex representation of int"
	(. Integer toHexString x))

(defn rgb [r g b]
	"Returns hex of RGB color code"
  (hex 
   (+ b (* 256 (+ g (* 256 r))))))
