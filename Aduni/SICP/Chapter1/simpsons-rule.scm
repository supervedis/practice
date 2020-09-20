;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname simpsons-rule) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define (cube a)
  (* a a a))

(define (sum term a next b)
  (if ( > a b)
      0
      (+ (term a)                        
         (sum term (next a) next b))))

(define (make-number-even x)
  (+ x (remainder x 2)))

(define (h a b n)
  (/ (- b a) (make-number-even n)))

(define (simpson-rule f a b n)
  (h a b n))

(define (a x)
  (define (b b) 1))