;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname hod) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define dx 0.001)

(define (cube a)
  (* a a a))

(define (inc x)
  (+ x 1))
;------------------------------------------
(define (pi-sum-next a)
  (+ a 4))

(define (add-dx x)
  (+ x dx))

;------------------------------------------
(define (pi-sum-current a)
  (/ 1.0 (* a (+ a 2.0))))

(define (integral-current a)
  (+ a (/ dx 2.0)))
;------------------------------------------
;Simpson's rule
(define (h a b n)
  (/ (- b a) n))

(define (simp-k k)
  (inc k))

(define (coeff k n)
  (cond ((= k 0) (= k n) 1)
        ((odd? k) 4)
        (else 2)))

(define (simp-term a b k n)
  (+ a (* k (h a b n))))

(define (simp-next a)
  (+ a ()

(define (simpsons-rule f a b n)
  (simps-rule f a b n 0))

(define (simps-rule f a b n k)
  (sum f (simp-term a b k n) (simp-next 

  
(define (sum term a next b)
  (if ( > a b)
      0
      (+ (term a)                        
         (sum term (next a) next b))))   
                                        


(define (sum-cubes a b)
  (sum cube a inc b))

(define (sum-integers a b)
  (sum identity a inc b))

(define (pi-sum a b)
  (sum pi-sum-current a pi-sum-next b))

(define (integral f a b)
  (* (sum f (integral-current a) add-dx b)
     dx))

;(define (integral f a b dx)
;(define (add-dx x)
;(define (integral f a b dx)
 ; (define (add-dx x) (+ x dx))
  ;(* (sum f (+ a (/ dx 2.0)) add-dx b)
   ;          dx))

;(define (integral f a b dx) 
 ; (define (add-dx x) (+ x dx))
  ;(+ 1 dx))
