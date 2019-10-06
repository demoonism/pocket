  def getListOfFiles(dir: String):List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    } else {
      List[File]()
    }
  }
  
PWD: val whereami = System.getProperty("user.dir")
LS:
    println(getListOfFiles(whereami))
    println(getListOfFiles("/"))
