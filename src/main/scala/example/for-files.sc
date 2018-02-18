import java.io.File

val filesHere = (new File(".")).listFiles

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

for (file <- filesHere
      if file.isFile
      if file.getName.endsWith(".py");
      line <- fileLines(file);
      trimmed = line.trim
      if trimmed.length > 0
    )
    println(file + ": " + trimmed)
