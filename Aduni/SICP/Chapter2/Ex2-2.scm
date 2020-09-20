;Abstractions that deal with segments
(define (make-segment point-start point-end)
  (cons point-start point-end))

(define (start-segment segment) (car segment))

(define (end-segment segment) (cdr segment))


;Abstractions that deal with points
(define (make-point x-coord y-coord)
  (cons x-coord y-coord))

(define (x-point p) (car p))

(define (y-point p) (cdr p))

;Utility procedures
(define (print-point p)
  (newline)
  (display "(")
  (display (x-point p))
  (display ",")
  (display (y-point p))
  (display ")"))

(define (average x y)
  (/ (+ x y) 2.0))




;Usage
(define (midpoint-segment line)
  (let ((x-mid (average (x-point (start-segment line))
                        (x-point (end-segment line))))
        (y-mid (average (y-point (start-segment line))
                        (y-point (end-segment line)))))
    (make-point x-mid y-mid)))

(define p1 (make-point 4 3))
(define p2 (make-point 16 12))
(define line1 (make-segment p1 p2))


;Ex2.3
;Rectangle representation
;Points that make up a rectangle
(define point1 (make-point 0 0))
(define point2 (make-point 10 0))
(define point3 (make-point 10 5))
(define point4 (make-point 0 5))

;Dimensions of a rectangle
(define l (abs (- (x-point point1) (x-point point2))))
(define w  (abs (- (y-point point1) (y-point point4))))

(define rectangle (make-point l w))

(define (rect-area rectangle)
  (let ((len   (x-point rectangle))
        (width (y-point rectangle)))
    (* len width)))

(define (rect-perimeter rectangle)
  (let ((len   (x-point rectangle))
        (width (y-point rectangle)))
    (+ (* len 2)
       (* width 2))))