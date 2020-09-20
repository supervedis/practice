;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname ex1-16) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define (fast-expt b n)
  (cond ((= n 0) 1)
        ((even? n) (sqr (fast-expt b (/ n 2))))
        (else (* b (fast-expt b (- n 1))))))

(define (fast-exp-iter b n product)
  (cond ((= n 0) product)
        ((even? n) (fast-exp-iter (sqr b) (/ n 2) product))
        (else (fast-exp-iter b (- n 1) (* b product)))))

(fast-exp-iter 2 3 1)