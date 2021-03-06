(defproject org.clojars.quoll/naga "0.2.2-SNAPSHOT"
  :description "Forward Chaining Rule Engine"
  :url "http://github.com/threatgrid/naga"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [prismatic/schema "1.0.5"]
                 [org.clojure/tools.cli "0.3.5"]
                 [org.clojure/core.cache "0.6.5"]
                 [the/parsatron "0.0.7"]
                 [cheshire "5.6.3"]
                 ; [com.datomic/datomic-pro "0.9.5561"] ; uncomment for Datomic Pro
                 [com.datomic/datomic-free "0.9.5561"]
                 [org.postgresql/postgresql "9.3-1102-jdbc41"]]
  :profiles {:dev {:plugins [[lein-kibit "0.1.5"]]}}
  :main naga.cli)
