(defproject shrink "1.0.0"
  :description "Run ProGuard on a fat standalone JAR"
  :url "https://github.com/Ingo60/shrink"
  :license {:name "BSD 2 clause"
            :url "https://github.com/Ingo60/shrink/blob/master/LICENSE"}
  :dependencies [;; Uncomment the following line if there is clojure code
                   ;; [org.clojure/clojure "1.6.0"]

                 ;; need to depend on Frege for runtime:
                 ;; You may adapt the frege compiler version
                 [com.theoryinpractise.frege/frege "3.22.367-g2737683"]

                 ;; put here what is needed in addition
                 ;;[jline/jline "1.0"]
				 ]

  ;; A MUST, this is the plugin that makes all this possible
  :plugins [[lein-fregec "3.22.367-i"]]

  ;; Good: The java source can be in the same directory as the frege stuff!
  :java-source-paths ["src"]
  :frege-source-paths ["src"]
  :target-path "bin"
  :main de.contexo.Shrink
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec"]}})
