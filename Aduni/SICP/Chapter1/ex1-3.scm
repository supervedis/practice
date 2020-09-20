;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname ex1-3) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
; Ex 1.3
(define (min-num x y)
  (cond ((< x y) x)
        ((= x y) x)
        (else y))
  )

(define (max-num x y)
  (cond ((> x y) x)
        ((= x y) x)
        (else y))
  )

(define (square x)
  (* x x))

(define (sum-of-two-squares x y)
  (+ (square x) (square y)))

(define (sum-square-of-two-large-integers x y z)
  (sum-of-two-squares (max-num x y) (max-num (min-num x y) z))
  )