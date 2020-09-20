((lambda (x) (* x 4))4)

(define (square a)
  (* a a))

(define (f x y)
  (define (f-helper a b)
    (+ (* x (square a))
       (* y b)
       (* a b)))
  (f-helper (+ 1 (* x  y))
            (- 1 y)))

(define (f-rev x y)
  ((lambda (a b)
    (+ (* x (square a))
       (* y b)
       (* a b)))
    (+ 1 (* x  y))
            (- 1 y)))

(define (f-let x y)
  (let ((a (+ 1 (* x y)))
        (b (- 1 y)))
  (+ (* x (square a))
     (* y b)
     (* a b))))

(+ (let ((x 3))
     (+ x (* x 10)))
   5)

(define (f g)
  (g 2))