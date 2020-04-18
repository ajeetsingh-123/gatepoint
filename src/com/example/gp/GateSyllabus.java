package com.example.gp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("NewApi")
public class GateSyllabus extends Fragment {
        TextView t1;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
  		View rootView = inflater.inflate(R.layout.activity_gate_syllabus, container, false);
  		t1 = (TextView)rootView.findViewById(R.id.tex12);
  		t1.setText(Html.fromHtml("<font color=\"#000000\" size=\"15\"><b>"+"Syllabus for Computer Science and"+
 " Information Technology(CS)\n\n"+"</font></br>"+
 "<font color=\"#0000ee\">"+"\t\t ENGINEERING MATHEMATICS\n\n"+"</font></br></b>"+
"<font color=\"#000000\"><b>"+"\n Mathematical Logic:"+"</b></font>"+ "Propositional Logic; First Order Logic.\n"+
"<font color=\"#000000\"><b>"+"\t\t Probability:"+"</b></font>"+ " Conditional Probability; Mean, Median, Mode and Standard Deviation; Random"+
"Variables; Distributions; uniform, normal, exponential, Poisson, Binomial."+
"Set Theory & Algebra: "+"</b></font>"+ "Sets; Relations; Functions; Groups; Partial Orders; Lattice; Boolean"+
"Algebra.\n"+
"<font color=\"#000000\"><b>"+"Combinatory:"+"</b></font>"+ " Permutations; Combinations; Counting; Summation; generating functions;"+
"recurrence relations; asymptotics.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t Graph Theory:"+"</b></font>"+ " Connectivity; spanning trees; Cut vertices & edges; covering; matching;"+
"independent sets; Colouring; Planarity; Isomorphism.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t Linear Algebra:"+"</b></font>"+ " Algebra of matrices, determinants, systems of linear equations, Eigen values"+
"and Eigen vectors.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t Numerical Methods:"+"</b></font>"+"LU decomposition for systems of linear equations; numerical solutions of"+
"non-linear algebraic equations by Secant, Bisection and Newton-Raphson Methods; Numerical"+
"integration by trapezoidal and Simpson’s rules.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t Calculus:"+"</b></font>"+ " Limit, Continuity & differentiability, Mean value Theorems, Theorems of integral"+
"calculus, evaluation of definite & improper integrals, Partial derivatives, Total derivatives,"+
"maxima & minima.\n"+
"<font color=\"#0000ee\">"+"\t\t\t\t\t\t\t\t\t\tCOMPUTER SCIENCE AND INFORMATION TECHNOLOGY\n"+"</b></font>"+ 
"<font color=\"#000000\"><b>"+"\t\t\t\t\tDigital Logic:"+"</b></font>"+ " Logic functions, Minimization, Design and synthesis of combinational sequential circuits; Number representation and computer arithmeticand"+
"<font color=\"#000000\"><b>"+"\t\t\t Computer Organization and Architecture: "+"</b></font>"+ "Machine instructions and addressing modes, ALU"+
"and data-path, CPU control design, Memory interface, I/O interface (Interrupt and DMA mode),"+
"Instruction pipelining, Cache and main memory, Secondary storage."+
"passing, Scope, Binding; Abstract data types, Arrays, Stacks, Queues, Linked Lists, Trees,"+
"Binary search trees, Binary heaps.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t Algorithms: "+"</b></font>"+ "Analysis, Asymptotic notation, Notions of space and time complexity, Worst and"+
"average case analysis; Design: Greedy approach, Dynamic programming, Divide-and-conquer;"+
"Tree and graph traversals, Connected components, Spanning trees, Shortest paths; Hashing,"+
"Sorting, Searching. Asymptotic analysis (best, worst, average cases) of time and space, upper"+
"and lower bounds, Basic concepts of complexity classes – P, NP, NP-hard, NP-complete.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t Theory of Computation:"+"</b></font>"+ " Regular languages and finite automata, Context free languages and"+
"Push-down automata, Recursively enumerable sets and Turing machines, Undecidability.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t Compiler Design:"+"</b></font>"+ " Lexical analysis, Parsing, Syntax directed translation, Runtime environments,"+
"Intermediate and target code generation, Basics of code optimization.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t Operating System:"+"</b></font>"+ " Processes, Threads, Inter-process communication, Concurrency,"+
"Synchronization, Deadlock, CPU scheduling, Memory management and virtual memory, File"+
"systems, I/O systems, Protection and security.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t Databases: "+"</b></font>"+ "ER-model, Relational model (relational algebra, tuple calculus), Database design"+
"(integrity constraints, normal forms), Query languages (SQL), File structures (sequential files,"+
"indexing, B and B+ trees), Transactions and concurrency control.\n"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t Computer Networks:"+"</b></font>"+ " ISO/OSI stack, LAN technologies (Ethernet, Token ring), Flow and error"+
"control techniques, Routing algorithms, Congestion control, TCP/UDP and sockets, IP(v4),"+
"Application layer protocols (icmp, dns, smtp, pop, ftp, http); Basic concepts of hubs, switches,"+
"gateways, and routers. Network security – basic concepts of public key and private key"+
"cryptography, digital signature, firewalls.\n"));
	return rootView;
	}
}
