(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (cond (and (> speed 0) (< speed 5)) (* speed 221)
        (and (> speed 4) (< speed 9)) (* speed 221 0.9)
        (= speed 9) (*  speed 221 0.8)
        (= speed 10) (*  speed 221 0.77)
        :else 0))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int(/ (production-rate speed) 60)))
