(define (product term a next b)
  (if (> a b)
      1
      (* (term a)
         (product term (next a) next b))))

(define (fact a b)
  (if (> a b)
      1
      (* a (fact (+ a 1) b))))

(define (inc x)
  (+ x 1))

(define (factorial n)
  (product identity 1 inc n))

(define (pi-term k)
  (if (even? k)
      (/ (+ k 2) (+ k 1))
      (/ (+ k 1) (+ k 2))))

(* (product pi-term 1 inc 6) 4) 