;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname primality-test) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define (runtime) (current-milliseconds))

(define (smallest-divisor n)
  (find-smallest n 2))
(define (find-smallest n test-divisor)
  (cond ((> (sqr test-divisor) n) n)
        ((divide? n test-divisor) test-divisor)
        (else (find-smallest n (next test-divisor)))))
(define (divide? n divisor)
  (= (remainder n divisor) 0))

(define (prime? n)
  (= n (smallest-divisor n)))
 
(define (timed-prime-test n)
  (begin
   (newline)
   (display n)
(start-prime-test n (runtime))))
(define (start-prime-test n start-time)
  (if (prime? n)
      (report-prime (- (runtime) start-time))
      #f))
(define (report-prime elapsed-time)
  (begin
(display " *** ")
(display elapsed-time)))


(define (search-for-primess counter n)
  (if (even? n)
      (s-f-p counter (+ n 1))
      (s-f-p counter n)))

(define (s-f-p c n)
  (if (> c 0)
      (if (timed-prime-test n)
          (s-f-p (- c 1) (+ n 2))
          (s-f-p c (+ n 2)))
      "Finished"))

(define (search-for-primes counter lower upper)
  (cond ((> counter upper) "Finished")
        ((even? lower) (search-for-primes counter (+ lower 1) upper))
        (else (begin (timed-prime-test lower) (search-for-primes (+ counter 1) (+ lower 2) upper)))))

;ex 1.24
(define (next c)
  (if (= c 2)
      3
      (+ c 2)))


 (timed-prime-test 1000000007) 
 (timed-prime-test 1000000009) 
 (timed-prime-test 1000000021) 
 (timed-prime-test 10000000019) 
 (timed-prime-test 10000000033) 
 (timed-prime-test 10000000061) 
 (timed-prime-test 100000000003) 
 (timed-prime-test 100000000019) 
 (timed-prime-test 100000000057) 
 (timed-prime-test 1000000000039) 
 (timed-prime-test 1000000000061) 
 (timed-prime-test 1000000000063) 