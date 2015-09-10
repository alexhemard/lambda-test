(ns lambda-test.core
  (:gen-class
   :methods [^:static [handler [String] String]]))

(def -handler
  [x]
  (str "hello, " x "!"))
