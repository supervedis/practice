;Representation of rationals
(define (make-rat n d)
  (let ((g (gcd n d)))
    (cond ((negative? (/  d g)) (cons (* -1 (/ n g)) (* -1 (/ d g))))
          (else
           (cons (/ n g) (/  d g))))))

;(define (e
(define (numer x) (car x))

(define (denom x) (cdr x))

(define (print-rat x)
  (newline)
  (display (numer x))
  (display "/")
  (display (denom x)))


;Operations that can be perfomed on rational numbers
(define (add-rat x y)
  (make-rat (+ (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))))

(define (sub-rat x y)
  (make-rat (- (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))))

(define (mult-rat x y)
  (make-rat (* (numer x) (numer y))
            (* (denom x) (denom y))))

(define (div-rat x y)
  (make-rat (* (numer x) (denom y))
            (* (numer y) (denom x))))

(define (equal-rat? x y)
(= (* (numer x) (denom y))
   (* (numer y) (denom x))))

(define one-half (make-rat 1 2))
(print-rat one-half)
(define one-third (make-rat 1 -3))
(print-rat one-third)
