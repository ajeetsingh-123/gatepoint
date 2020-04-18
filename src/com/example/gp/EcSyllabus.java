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
public class EcSyllabus extends Fragment {
      TextView t1;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreateView(inflater, container, savedInstanceState);
  		View rootView = inflater.inflate(R.layout.activity_ec_syllabus, container, false);
  		t1 = (TextView)rootView.findViewById(R.id.tex12);
  		t1.setText(Html.fromHtml("<font color=\"#000000\" size=\"15\"><b>"+"EC Electronics and Communications"+"</b></font></br>"+
 "<font color=\"#0000ee\">"+"\n\n\nSection 1: \tEngg. Mathematics"+"</font></br></b>"+
 "<font color=\"#000000\"><b>"+"\t\t\t\t\tLinear Algebra:"+"</font></br></b>"+" Vector space, basis, linear dependence and independence, matrix"+
"algebra, eigen values and eigen vectors, rank, solution of linear equations – existence"+
"and uniqueness."+
"<font color=\"#000000\"><b>"+"\t\t\t\tCalculus:"+"</font></br></b>"+" Mean value theorems, theorems of integral calculus, evaluation of definite and"+
"improper integrals, partial derivatives, maxima and minima, multiple integrals, line, surface"+
"and volume integrals, Taylor series."+
"<font color=\"#000000\"><b>"+"</br>"+"\t\t\t\t\t\t\t\t\t\t\tDifferential Equations: "+"</font></br></b>"+"\tFirst order equations (linear and nonlinear), higher order linear"+
"differential equations, Cauchy's and Euler's equations, methods of solution using variation"+
"of parameters, complementary function and particular integral, partial differential"+
"equations, variable separable method, initial and boundary value problems."+
"<font color=\"#000000\"><b>"+"\t\t\tVector Analysis:"+"</font></br></b>"+"\t Vectors in plane and space, vector operations, gradient, divergence and"+
"curl, Gauss's, Green's and Stoke's theorems."+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\tComplex Analysis:"+"</font></br></b>"+" Analytic functions, Cauchy's integral theorem, Cauchy's integral"+
"formula; Taylor's and Laurent's series, residue theorem."+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\tNumerical Methods:"+"</font></br></b>"+"\t Solution of nonlinear equations, single and multi-step methods for"+
"differential equations, convergence criteria."+
"<font color=\"#000000\"><b>"+"\t\t\t\tProbability and Statistics: "+"</font></br></b>"+"\tMean, median, mode and standard deviation; combinatorial"+
"probability, probability distribution functions - binomial, Poisson, exponential and normal;"+
"Joint and conditional probability;"+"</font></br></b>"+" Correlation and regression analysis."+
"<font color=\"#0000ee\">"+"\t\t\t\t\t\t\tSection 2:\t Networks, Signals and Systems"+"</font></br></b>"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\tNetwork solution methods:"+"</font></br></b>"+" nodal and mesh analysis; Network theorems: superposition,"+
"Thevenin and Norton’s, maximum power transfer; Wye‐Delta transformation; Steady state"+
"sinusoidal analysis using phasors; Time domain analysis of simple linear circuits; Solution of"+
"network equations using Laplace transform; Frequency domain analysis of RLC circuits;"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\tLinear 2‐port network parameters:"+"</font></br></b>"+" driving point and transfer functions; State equations for"+
"networks."+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\tContinuous-time signals:"+"</font></br></b>"+" Fourier series and Fourier transform representations, sampling"+
"theorem and applications;"+"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t\tDiscrete-time signals:"+"</font></br></b>"+" discrete-time Fourier transform (DTFT),"+
"DFT, FFT, Z-transform, interpolation of discrete-time signals; "+"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t\tLTI systems:"+"</font></b>"+" definition and"+
"properties, causality, stability, impulse response, convolution, poles and zeros, parallel and"+
"cascade structure, frequency response, group delay, phase delay, digital filter design"+
"techniques."+
"<font color=\"#0000ee\">"+"\t\t\t\t\t\t\t\t\t\tSection 3: Electronic Devices"+"</font></br>"+
"\t\t\t\t\t\tEnergy bands in intrinsic and extrinsic silicon;"+"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\tCarrier transport: "+"</font></br></b>"+"diffusion current, drift"+
"current, mobility and resistivity; Generation and recombination of carriers; Poisson and"+
"continuity equations; P-N junction, Zener diode, BJT, MOS capacitor, MOSFET, LED, photo"+
"diode and solar cell;" +"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\tIntegrated circuit fabrication process: "+"</font></br></b>"+"oxidation, diffusion, ion"+
"implantation, photolithography and twin-tub CMOS process."+
"<font color=\"#0000ee\">"+"\t\t\t\t\t\t\t\t\tSection 4: Analog Circuits"+"</font></br>"+
"\t\t\t\t\tSmall signal equivalent circuits of diodes, BJTs and MOSFETs; Simple diode circuits:"+
"clipping, clamping and rectifiers;" +"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\tSingle-stage BJT and MOSFET amplifiers:"+"</font></br></b>"+" biasing, bias"+
"stability, mid-frequency small signal analysis and frequency response; BJT and MOSFET"+
"amplifiers: multi-stage, differential, feedback, power and operational; Simple op-amp"+
"circuits; Active filters;" +"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\tSinusoidal oscillators:"+"</font></br></b>"+" criterion for oscillation, single-transistor and opamp"+
"configurations; Function generators, wave-shaping circuits and 555 timers; Voltage"+
"reference circuits;" +"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPower supplies: "+"</font></br></b>"+"ripple removal and regulation."+
"<font color=\"#0000ee\" size=\"15\"><b>"+"\t\t\t\t\t\t\t\t\t\t\tSection 5: Digital Circuits"+"</font></br></b>"+
"\t\t\t\t\t\t\t\tNumber systems; "+"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\tCombinatorial circuits:"+"</font></br></b>"+"\t Boolean algebra, minimization of functions using"+
"Boolean identities and Karnaugh map, logic gates and their static CMOS"+
"implementations, arithmetic circuits, code converters, multiplexers, decoders and PLAs;"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\tSequential circuits:"+"</font></br></b>"+" latches and flip‐flops, counters, shift‐registers and finite state machines;"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\tData converters:"+"</font></br></b>"+" sample and hold circuits, ADCs and DACs;"+"<font color=\"#000000\"><b>"+" \t\t\t\t\t\t\t\tSemiconductor memories:"+"</font></br></b>"+
"ROM, SRAM, DRAM;"+"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t8-bit microprocessor (8085): "+"</font></br></b>"+"architecture, programming, memory and"+
"I/O interfacing."+
"<font color=\"#0000ee\" size=\"15\"><b>"+"\t\t\t\t\t\t\t\tSection 6:\tControl Systems"+"</font></br></b>"+
"\t\t\t\t\t\t\t\t\t\t\t\t\t\tBasic control system components; Feedback principle; Transfer function; Block diagram"+
"representation; Signal flow graph; Transient and steady-state analysis of LTI systems;"+
"Frequency response; Routh-Hurwitz and Nyquist stability criteria; Bode and root-locus plots;"+
"Lag, lead and lag-lead compensation; State variable model and solution of state"+
"equation of LTI systems."+
"<font color=\"#0000ee\" size=\"15\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t\tSection 7:\t Communications"+"</font></br></b>"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tRandom processes: "+"</font></br></b>"+"autocorrelation and power spectral density, properties of white noise,"+
"filtering of random signals through LTI systems;"+"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t Analog communications: "+"</font></br></b>"+"amplitude"+
"modulation and demodulation, angle modulation and demodulation, spectra of AM and"+
"FM, superheterodyne receivers, circuits for analog communications;"+"<font color=\"#000000\"><b>"+" Information theory:"+"</font></br></b>"+
"entropy, mutual information and channel capacity theorem;"+"<font color=\"#000000\"><b>"+" \t\t\t\t\t\t\t\t\t\t\t\t\tDigital communications:"+"</font></br></b>"+
"PCM, DPCM, digital modulation schemes, amplitude, phase and frequency shift keying"+
"(ASK, PSK, FSK), QAM, MAP and ML decoding, matched filter receiver, calculation of"+
"bandwidth, SNR and BER for digital modulation; Fundamentals of error correction,"+
"Hamming codes; Timing and frequency synchronization, inter-symbol interference and its"+
"mitigation; Basics of TDMA, FDMA and CDMA."+
"<font color=\"#0000ee\" size=\"15\"><b>"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\tSection 8: Electromagnetics"+"</font></br></b>"+
"\t\t\t\t\t\t\t\t\t\t\t\t\tElectrostatics; "+"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\t\t\t\tMaxwell’s equations:"+"</font></br></b>"+" differential and integral forms and their interpretation,"+
"boundary conditions, wave equation, Poynting vector;"+"<font color=\"#000000\"><b>"+" Plane waves and properties:"+"</font></br></b>"+
"reflection and refraction, polarization, phase and group velocity, propagation through"+
"various media, skin depth; Transmission lines: equations, characteristic impedance,"+
"impedance matching, impedance transformation, S-parameters, Smith chart;"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\t\tWaveguides: "+"</font></br></b>"+"modes, boundary conditions, cut-off frequencies, dispersion relations;"+
"<font color=\"#000000\"><b>"+"\t\t\t\t\t\t\tAntennas:"+"</font></br></b>"+" antenna types, radiation pattern, gain and directivity, return loss, antenna"+
"arrays; Basics of radar; Light propagation in optical fibers."));
	return rootView;
	}
}