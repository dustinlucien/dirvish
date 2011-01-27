(defproject dirvish "1.0.0-SNAPSHOT"
  :description "trying out Clojure, Ring, Aleph to write a simple URL redirecting service in as small a space as possible"
  :dev-dependencies [[org.cloudhoist/pallet-lein "0.2.0"]]
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
		             [aleph "0.1.5-SNAPSHOT"]
		             [org.cloudhoist/pallet "0.4.0-SNAPSHOT"]
                 [org.cloudhoist/pallet-crates-all "0.4.0-SNAPSHOT"]]
                 
                 
  :repositories {"sonatype"
                 "http://oss.sonatype.org/content/repositories/releases"
                 "sonatype-snapshots"
                 "http://oss.sonatype.org/content/repositories/snapshots"})
