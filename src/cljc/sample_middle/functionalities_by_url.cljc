(ns sample-middle.functionalities-by-url
  (:require [sample-middle.functionalities :as smfns]
            [common-middle.functionalities-by-url :as fns-by-url]))

(defn bind-specific-functionalities-by-url
  "Adds specific CRUD functionalities beside the common ones"
  []
  (swap!
    fns-by-url/read-functionalities
    conj
    smfns/person-read)
  (swap!
    fns-by-url/update-functionalities
    conj
    smfns/person-update)
  (swap!
    fns-by-url/create-functionalities
    conj
    smfns/person-create)
  (swap!
    fns-by-url/delete-functionalities
    conj
    smfns/person-delete))

