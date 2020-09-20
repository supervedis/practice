(define (accumulate combiner null-value term a next b)
  (if (> a b)
      null-value
      (combiner (term a)
                (accumulate combiner null-value term (next a) next b))))
(define (inc x)
  (+ x 1))

(accumulate + 0 identity 1 inc 5)

((lambda (x) (+ x 4)) 4)