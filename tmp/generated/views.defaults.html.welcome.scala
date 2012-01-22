
                    package views.defaults.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object welcome extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(title:String):Html = {
                            try {
                                _display_ {

format.raw/*1.16*/("""

<link rel="stylesheet" href="""")+_display_(/*3.31*/asset("public/playmanual/manual.css"))+format.raw/*3.68*/("""" type="text/css" media="screen" charset="utf-8">
<link rel="stylesheet" href="""")+_display_(/*4.31*/asset("public/playmanual/wiki.css"))+format.raw/*4.66*/("""" type="text/css" media="screen" charset="utf-8">

<div class="wrapper">

    <div id="docSidebar">
        
        <div id="logo">
            <img src="""")+_display_(/*11.24*/asset("public/playmanual/logo.png"))+format.raw/*11.59*/("""">                
            <h2 id="version">Play """)+_display_(/*12.36*/play/*12.40*/.Play.version)+format.raw/*12.53*/("""</h2>
        </div>

        <h2>Browse</h2>
        <ul>
            <li id="gotoc"><a href="/@documentation/home">Local documentation</a></li>
            <li id="gotoc"><a href="/@documentation/modules/scala/home">Scala module documentation</a></li>
            <li id="gotoc"><a href="/@api/index.html">Browse Java API</a></li>
        </ul>

        <h2>Contents</h2>
        <div id="toc"></div>

        <h2>Search</h2>
        <p>Get help with google</p>
        <div id="searchBox"><form action="http://www.google.com/cse" id="cse-search-box"><div><input type="hidden" name="cx" value="002614023023983855063:jn1mu_7bof0" /><input type="hidden" name="ie" value="UTF-8" /><input type="text" name="q" size="28" style="font-size:14px"/></div></form><script type="text/javascript" src="http://www.google.com/coop/cse/brand?form=cse-search-box&lang=en"></script></div>

    </div>

    <div id="pageContent">

        <div class="wikistyle">
            <h1>""")+_display_(/*34.18*/title)+format.raw/*34.23*/("""</h1>
            <p>
                Congratulation, you've just created a new Scala Play application. This page will help you in the few next steps.
            </p>
            <h2><a name="why">Why do you see this page?</a></h2>
            <p>
                The <strong>conf/routes</strong> file defines a route that tell play to invoke the <strong>Application.index</strong> action
                when a browser requests the <strong>/</strong> URI using the <strong>GET</strong> method:
            </p>
            <pre><code># Application home page
GET     /         Application.index</code></pre>
            <p>
                So play has invoked the <strong>controllers&#46;Application&#46;index</strong> method:
            </p>
            <pre><code>package controllers

import play._
import play.mvc._

object Application extends Controller """)+format.raw("""{""")+format.raw/*53.40*/("""

    import views.Application._

    def index = """)+format.raw("""{""")+format.raw/*57.18*/("""
        html.index("Your Scala application is ready!")
    """)+format.raw("""}""")+format.raw/*59.6*/("""

""")+format.raw("""}""")+format.raw/*61.2*/("""</code></pre>
            <p>
                The action returns the HTML content generated by the <strong>views.Application.html.index</strong> template. 
                This template is defined in the <strong>app/views/Application/index.scala.html</strong> file:
            </p>
            <pre><code>@(title:String)

@main(title) """)+format.raw("""{""")+format.raw/*68.16*/("""

    @views.defaults.html.welcome(title)

""")+format.raw("""}""")+format.raw/*72.2*/("""</code></pre>
            <p>
                This template extends the <strong>app/views/main.scala.html</strong> template, and call <strong>views.defaults.html.welcome</strong> to display this
                welcome page.
            </p>
            <h2><a name="db">Need to connect to a database?</a></h2>
            <p>
                You can quickly set up a developement database (either in memory or written to the filesystem), by adding one of these
                lines to the <strong>conf/application.conf</strong> file:
            </p>
<pre><code># For a transient in memory database (H2 in memory)
db=mem

# for a simple file written database (H2 file stored)
db=fs</code></pre>
            <p>
                If you want to connect to an existing <strong>MySQL5 server</strong>, use:
            </p>
<pre><code>db=mysql:user:pwd@database_name</code></pre>            
            <p>
                If you need to connect to another JDBC compliant database, first add the corresponding driver library to the
                <strong>lib/</strong> directory of your application, and add these lines to the <strong>conf/application.conf</strong> file:
            </p>
            <pre><code>db.url=jdbc:postgresql:database_name
db.driver=org.postgresql.Driver
db.user=root
db.pass=secret</code></pre>      
            <h2><a name="doc">Need more help?</a></h2>
            <p>
                When your application run in <strong>DEV</strong> mode, you can access directly the current documentation at the
                <a href="/@documentation">/@documentation</a> URL or go to <a href="http://www.playframework.org">http://www.playframework.org</a>.
            </p>
            <p>
                The Scala specific documentation is available at <a href="/@documentation/modules/scala/home">/@documentation/modules/scala/home</a>
            </p>
            <p>
                The <a href="http://groups.google.com/group/play-framework">Play Google Group</a> is where Play users come to seek help, announce projects, and discuss. 
                If you don't have any google account, you can still join the mailing list sending an email to
                <br/><strong>play-framework+subscribe@googlegroups.com</strong>.
            </p>
        </div>
    </div>
            
        </div>

    </div>

</div>

<script type="text/javascript" src="""")+_display_(/*121.38*/asset("public/playmanual/jquery-1.3.2.min.js"))+format.raw/*121.84*/(""""></script>
<script type="text/javascript" src="""")+_display_(/*122.38*/asset("public/playmanual/navigation.js"))+format.raw/*122.78*/(""""></script>
""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Sat Jan 21 22:20:44 EST 2012
                    SOURCE: /app/views/defaults/welcome.scala.html
                    HASH: 82f0ff4ad533d5473bed384fbba122fa8ca7b61d
                    MATRIX: 328->1|449->15|507->47|564->84|670->164|725->199|908->355|964->390|1045->444|1058->448|1092->461|2082->1427|2108->1432|3016->2293|3114->2344|3221->2405|3270->2408|3654->2747|3744->2792|6152->5178|6220->5224|6297->5273|6359->5313
                    LINES: 10->1|14->1|16->3|16->3|17->4|17->4|24->11|24->11|25->12|25->12|25->12|47->34|47->34|66->53|70->57|72->59|74->61|81->68|85->72|134->121|134->121|135->122|135->122
                    -- GENERATED --
                */
            
