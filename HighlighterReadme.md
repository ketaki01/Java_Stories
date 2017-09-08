
SYNTAX HIGHLIGHTER ASSG : MAIN CLASS : TestStyles.java

Syntax Highlighting

Story 1

When given a set of keywords we need to identify the occurrences of
keywords in given input text and mark them with [blue] color attribute

Sample Keywords:
as if and then when

Sample Input:
If we write a program and compile it, then we can run the program
to get output

Sample Output:
[blue]If[blue] we write a program [blue]and[blue] compile it,
[blue]then[blue] we can run the program to get output


Story 2

When given a set of keywords marked with different colors we need to
highlight them with their respective color attribute.

Sample Keywords:
as:blue
if:red
and:red
then:green
when:blue

Sample Input:
If we write a program and compile it, then as we run the program,
we will get output

Sample Output:
[red]If[red] we write a program [red]and[red] compile it,
[green]then[green] [blue]as[blue] we run the program, we will get
output


Story 3

When given a set of keywords marked with various color and capitalization
constrains we need to highlight them with their respective color attribute along
with capitalization

Sample Keywords:
as : blue : capital
if : red : lower
and : red : capital
then : green: lower
when : blue : lower

Sample Input:
If we write a program and compile it, then as we run the program,
we will get output

Sample Output:
[red]if[red] we write a program [red]AND[red] compile it,
[green]then[green] [blue]AS[blue] we run the program, we will get
output


Story 4

When given a set of keywords marked with various color, capitalization and
style constrains we need to highlight them with their respective constraint
specific attributes

Sample Keywords:
as : blue : capital : normal
if : red : lower : bold
and : red : capital : bold
then : green: lower : normal
when : blue : lower : normal

Sample Input:
If we write a program and compile it, then as we run the program,
we will get output

Sample Output:
[red][bold]if[bold][red] we write a program [red][bold]AND[bold]
[red] compile it, [green]then[green] [blue]AS[blue] we run the
program, we will get output
