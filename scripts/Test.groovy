import org.grails.plugins.csv.CSVWriter
includeTargets << grailsScript("_GrailsInit")

target(test: "The description of the script goes here!") {
    def sw = new StringWriter()
	def b = new CSVWriter(sw, {
  col1 { it.val1 }
  col2 { it.val2 }
})
b << [val1: 'a', val2: 'b']
b << [val1: 'c', val2: 'd']
assert b.writer.toString() == '''"col1","col2"
"a","b"
"c","d"'''
}

setDefaultTarget(test)
