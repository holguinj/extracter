(defproject extracter "0.1.0"
  :description "Extract core fact documentation from the Facter source."
  :url "http://github.com/holguinj/extracter"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main ^:skip-aot extracter.core
  :jvm-opts ["-Xmx1G"]
  :profiles {:uberjar {:aot :all}}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.3.1"]
                 [org.clojure/tools.cli "0.3.1"]
                 [instaparse "1.3.2"]])
