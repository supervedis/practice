(define tolerance 0.00001)

(define (average x y)
  (/ (+ x y) 2))

(define (average-damp f)
  (lambda (x) (average x (f x))))

(define (fixed-point f first-guess)
  (define (close-enough? v1 v2)
    (< (abs (- v1 v2)) tolerance))
  (define (try guess)
    (let ((next (f guess)))
      (display next)
      (newline)
      (if (close-enough? next guess)
          guess
          (try next))))
  (try first-guess))

(fixed-point cos 1.0)

(define (sq-root x)
  (fixed-point (lambda (y) (average y (/ x y))) 1.0))

;ex 1.35
(define (phi x)
  (fixed-point (lambda (x) (average x (+ 1 (/ 1 x)))) 1.0))

;ex 1.36
(define (x-power-x x)
  (fixed-point (lambda (x) (average x (/ (log 1000) (log x)))) 2.0))

(define (sqrt x)
  (fixed-point (average-damp (lambda (y) (/ x y)))
1.0))