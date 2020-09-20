(define (conss x y)
  (define (dispatch m)
    (cond ((= m 0) x)
          ((= m 1) y)
          (else (error "Argument not 0 or 1 -- CONS" m))))
  dispatch)

(define (carr z) (z 0))
(define (cdrr z) (z 1))

(define (cns x y)
  (lambda (m) (m x y)))

(define (cra z)
  (z (lambda (p q) p)))

(define (crd z)
  (z (lambda (p q) q)))

((lambda (m) (m 2 3)) (lambda (p q) p))
((lambda (p q) p) 2 3)
