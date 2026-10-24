package deob;

import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import sign.signlink;

@ObfuscatedName("client")
public final class client extends NZBGSSTU {

	@ObfuscatedName("client.K")
	public IBHUFTPE[] field110 = new IBHUFTPE[32];

	@ObfuscatedName("client.L")
	public int field111 = -1;

	@ObfuscatedName("client.cb")
	public volatile boolean field125 = false;

	@ObfuscatedName("client.eb")
	public int field127 = 2;

	@ObfuscatedName("client.fb")
	public boolean field128 = false;

	@ObfuscatedName("client.gb")
	public int field129 = 2048;

	@ObfuscatedName("client.hb")
	public int field130 = 2047;

	@ObfuscatedName("client.ib")
	public BSQIIHOT[] field131 = new BSQIIHOT[field129];

	@ObfuscatedName("client.kb")
	public int[] field133 = new int[field129];

	@ObfuscatedName("client.mb")
	public int[] field135 = new int[field129];

	@ObfuscatedName("client.nb")
	public MVHXDWGI[] field136 = new MVHXDWGI[field129];

	@ObfuscatedName("client.qb")
	public int[] field139 = new int[ZFYFZSTP.field1512];

	@ObfuscatedName("client.sb")
	public int[] field140 = new int[200];

	@ObfuscatedName("client.zb")
	public long[] field145 = new long[100];

	@ObfuscatedName("client.Db")
	public IBHUFTPE[] field147 = new IBHUFTPE[100];

	@ObfuscatedName("client.Fb")
	public boolean field148 = true;

	@ObfuscatedName("client.Tb")
	public IHMCQRZY field162 = new IHMCQRZY();

	@ObfuscatedName("client.Ub")
	public volatile boolean field163 = false;

	@ObfuscatedName("client.cc")
	public boolean field170 = false;

	@ObfuscatedName("client.dc")
	public int field171 = -1;

	@ObfuscatedName("client.jc")
	public boolean field177 = true;

	@ObfuscatedName("client.oc")
	public boolean field182 = false;

	@ObfuscatedName("client.uc")
	public int field187 = 0x766654;

	@ObfuscatedName("client.Ec")
	public boolean field197 = false;

	@ObfuscatedName("client.Gc")
	public int field199 = -1;

	@ObfuscatedName("client.Hc")
	public boolean field200 = false;

	@ObfuscatedName("client.Qc")
	public boolean field209 = false;

	@ObfuscatedName("client.Sc")
	public long[] field210 = new long[200];

	@ObfuscatedName("client.Tc")
	public String field211 = "";

	@ObfuscatedName("client.Vc")
	public int field213 = 1;

	@ObfuscatedName("client.Wc")
	public boolean field214 = false;

	@ObfuscatedName("client.dd")
	public MVHXDWGI field221 = MVHXDWGI.method345(1);

	@ObfuscatedName("client.fd")
	public int[] field223 = new int[1000];

	@ObfuscatedName("client.gd")
	public boolean field224 = false;

	@ObfuscatedName("client.kd")
	public boolean field227 = false;

	@ObfuscatedName("client.od")
	public int[] field231 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.rd")
	public int field233 = 2;

	@ObfuscatedName("client.ud")
	public String field234 = "";

	@ObfuscatedName("client.wd")
	public String[] field236 = new String[100];

	@ObfuscatedName("client.xd")
	public int[] field237 = new int[100];

	@ObfuscatedName("client.zd")
	public boolean field239 = false;

	@ObfuscatedName("client.Bd")
	public int[] field241 = new int[151];

	@ObfuscatedName("client.Md")
	public boolean field251 = false;

	@ObfuscatedName("client.Pd")
	public int[] field253 = new int[9];

	@ObfuscatedName("client.Wd")
	public boolean field259 = false;

	@ObfuscatedName("client.Yd")
	public int[][][] field261 = new int[4][13][13];

	@ObfuscatedName("client.Zd")
	public int[] field262 = new int[5];

	@ObfuscatedName("client.ge")
	public IHMCQRZY field269 = new IHMCQRZY();

	@ObfuscatedName("client.he")
	public int field270 = 0x332D25;

	@ObfuscatedName("client.ie")
	public boolean field271 = false;

	@ObfuscatedName("client.le")
	public int[] field274 = new int[1000];

	@ObfuscatedName("client.me")
	public int[] field275 = new int[1000];

	@ObfuscatedName("client.oe")
	public LQLHEUAQ[] field277 = new LQLHEUAQ[4];

	@ObfuscatedName("client.pe")
	public boolean field278 = false;

	@ObfuscatedName("client.ve")
	public int[] field284 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Ce")
	public int[] field290 = new int[33];

	@ObfuscatedName("client.Ie")
	public String field294 = "";

	@ObfuscatedName("client.Le")
	public int[][] field297 = new int[104][104];

	@ObfuscatedName("client.Ne")
	public int field298 = 78;

	@ObfuscatedName("client.Qe")
	public String field300 = "";

	@ObfuscatedName("client.Te")
	public int[] field301 = new int[5];

	@ObfuscatedName("client.Ue")
	public int[] field302 = new int[50];

	@ObfuscatedName("client.Ve")
	public IBHUFTPE[] field303 = new IBHUFTPE[20];

	@ObfuscatedName("client.We")
	public int field304 = -1;

	@ObfuscatedName("client.Ye")
	public int field306 = -1;

	@ObfuscatedName("client.ef")
	public BNGXLHWA[] field308 = new BNGXLHWA[13];

	@ObfuscatedName("client.kf")
	public QQNRPAWO[] field313 = new QQNRPAWO[5];

	@ObfuscatedName("client.tf")
	public int field321 = -1;

	@ObfuscatedName("client.uf")
	public int[] field322 = new int[50];

	@ObfuscatedName("client.Df")
	public int field330 = -1;

	@ObfuscatedName("client.Hf")
	public volatile boolean field333 = false;

	@ObfuscatedName("client.If")
	public IBHUFTPE[] field334 = new IBHUFTPE[32];

	@ObfuscatedName("client.Jf")
	public IHMCQRZY field335 = new IHMCQRZY();

	@ObfuscatedName("client.Kf")
	public BNGXLHWA[] field336 = new BNGXLHWA[2];

	@ObfuscatedName("client.Lf")
	public int[] field337 = new int[50];

	@ObfuscatedName("client.Mf")
	public int field338 = 3;

	@ObfuscatedName("client.Sf")
	public String[] field343 = new String[5];

	@ObfuscatedName("client.Tf")
	public boolean[] field344 = new boolean[5];

	@ObfuscatedName("client.Uf")
	public BNGXLHWA[] field345 = new BNGXLHWA[100];

	@ObfuscatedName("client.Vf")
	public MVHXDWGI field346 = MVHXDWGI.method345(1);

	@ObfuscatedName("client.dg")
	public boolean field354 = false;

	@ObfuscatedName("client.eg")
	public IBHUFTPE[] field355 = new IBHUFTPE[32];

	@ObfuscatedName("client.ig")
	public int field358 = 1;

	@ObfuscatedName("client.jg")
	public boolean field359 = true;

	@ObfuscatedName("client.pg")
	public IHMCQRZY[][][] field364 = new IHMCQRZY[4][104][104];

	@ObfuscatedName("client.qg")
	public String[] field365 = new String[500];

	@ObfuscatedName("client.xg")
	public MVHXDWGI field370 = MVHXDWGI.method345(1);

	@ObfuscatedName("client.zg")
	public int field372 = 128;

	@ObfuscatedName("client.Dg")
	public int field376 = -1;

	@ObfuscatedName("client.Hg")
	public int[] field380 = new int[2000];

	@ObfuscatedName("client.Rg")
	public int field389 = 2;

	@ObfuscatedName("client.Sg")
	public int field390 = -1;

	@ObfuscatedName("client.Tg")
	public IBHUFTPE[] field391 = new IBHUFTPE[1000];

	@ObfuscatedName("client.eh")
	public IBHUFTPE[] field402 = new IBHUFTPE[8];

	@ObfuscatedName("client.fh")
	public String field403 = "";

	@ObfuscatedName("client.gh")
	public String field404 = "";

	@ObfuscatedName("client.hh")
	public int[] field405 = new int[500];

	@ObfuscatedName("client.ih")
	public int[] field406 = new int[500];

	@ObfuscatedName("client.jh")
	public int[] field407 = new int[500];

	@ObfuscatedName("client.kh")
	public int[] field408 = new int[500];

	@ObfuscatedName("client.mh")
	public int field410 = -1;

	@ObfuscatedName("client.nh")
	public int field411 = -1;

	@ObfuscatedName("client.oh")
	public final int[] field412 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.qh")
	public int field414 = 50;

	@ObfuscatedName("client.rh")
	public int[] field415 = new int[field414];

	@ObfuscatedName("client.sh")
	public int[] field416 = new int[field414];

	@ObfuscatedName("client.th")
	public int[] field417 = new int[field414];

	@ObfuscatedName("client.uh")
	public int[] field418 = new int[field414];

	@ObfuscatedName("client.vh")
	public int[] field419 = new int[field414];

	@ObfuscatedName("client.wh")
	public int[] field420 = new int[field414];

	@ObfuscatedName("client.xh")
	public int[] field421 = new int[field414];

	@ObfuscatedName("client.yh")
	public String[] field422 = new String[field414];

	@ObfuscatedName("client.Bh")
	public int[][] field425 = new int[104][104];

	@ObfuscatedName("client.Ch")
	public String field426 = "";

	@ObfuscatedName("client.Dh")
	public String field427 = "";

	@ObfuscatedName("client.Eh")
	public MYGSUHVG field428 = new MYGSUHVG();

	@ObfuscatedName("client.Mh")
	public boolean field435 = true;

	@ObfuscatedName("client.Oh")
	public int field437 = 0x23201B;

	@ObfuscatedName("client.Rh")
	public boolean field439 = false;

	@ObfuscatedName("client.Sh")
	public int[] field440 = new int[256];

	@ObfuscatedName("client.Th")
	public int[] field441 = new int[4000];

	@ObfuscatedName("client.Uh")
	public int[] field442 = new int[4000];

	@ObfuscatedName("client.Yh")
	public int field446 = -1;

	@ObfuscatedName("client.ci")
	public boolean field449 = true;

	@ObfuscatedName("client.gi")
	public byte[] field453 = new byte[16384];

	@ObfuscatedName("client.ui")
	public boolean field466 = false;

	@ObfuscatedName("client.vi")
	public int[] field467 = new int[2000];

	@ObfuscatedName("client.wi")
	public int[] field468 = new int[151];

	@ObfuscatedName("client.Di")
	public final int field473 = 100;

	@ObfuscatedName("client.Ei")
	public int[] field474 = new int[100];

	@ObfuscatedName("client.Ki")
	public int[] field480 = new int[5];

	@ObfuscatedName("client.Qi")
	public boolean field486 = false;

	@ObfuscatedName("client.Zi")
	public int[] field494 = new int[ZFYFZSTP.field1512];

	@ObfuscatedName("client.bj")
	public int[] field495 = new int[ZFYFZSTP.field1512];

	@ObfuscatedName("client.cj")
	public CRC32 field496 = new CRC32();

	@ObfuscatedName("client.dj")
	public int[] field497 = new int[5];

	@ObfuscatedName("client.ej")
	public boolean field498 = false;

	@ObfuscatedName("client.oj")
	public int field505 = -1;

	@ObfuscatedName("client.pj")
	public int field506 = -1;

	@ObfuscatedName("client.qj")
	public int field507 = 0x4D4233;

	@ObfuscatedName("client.rj")
	public int[] field508 = new int[7];

	@ObfuscatedName("client.tj")
	public int field509 = -1;

	@ObfuscatedName("client.uj")
	public int[] field510 = new int[33];

	@ObfuscatedName("client.vj")
	public String[] field511 = new String[200];

	@ObfuscatedName("client.wj")
	public String field512 = "";

	@ObfuscatedName("client.xj")
	public boolean[] field513 = new boolean[5];

	@ObfuscatedName("client.yj")
	public int[] field514 = new int[100];

	@ObfuscatedName("client.zj")
	public String[] field515 = new String[100];

	@ObfuscatedName("client.Aj")
	public String[] field516 = new String[100];

	@ObfuscatedName("client.Dj")
	public boolean field518 = false;

	@ObfuscatedName("client.Ej")
	public boolean field519 = false;

	@ObfuscatedName("client.Gj")
	public int[][] field521 = new int[104][104];

	@ObfuscatedName("client.Kj")
	public String field524 = "";

	@ObfuscatedName("client.Nj")
	public boolean field527 = false;

	@ObfuscatedName("client.Pj")
	public MVHXDWGI field529 = new MVHXDWGI(new byte[5000]);

	@ObfuscatedName("client.Qj")
	public ACKJULTZ[] field530 = new ACKJULTZ[16384];

	@ObfuscatedName("client.Sj")
	public int[] field532 = new int[16384];

	@ObfuscatedName("client.fk")
	public int[] field545 = new int[5];

	@ObfuscatedName("client.hk")
	public int[] field546 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.kk")
	public int field548 = -1;

	@ObfuscatedName("client.zf")
	public static int field326 = 10;

	@ObfuscatedName("client.Bf")
	public static boolean field328 = true;

	@ObfuscatedName("client.rg")
	public static int[] field366 = new int[99];

	@ObfuscatedName("client.sg")
	public static int[] field367 = new int[32];

	@ObfuscatedName("client.yg")
	public static BigInteger field371 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ah")
	public static BigInteger field424 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Ih")
	public static final int[] field432 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Jh")
	public static String field433 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.hi")
	public static final int[][] field454 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.J")
	public int field109;

	@ObfuscatedName("client.M")
	public int field112;

	@ObfuscatedName("client.N")
	public int field113;

	@ObfuscatedName("client.P")
	public int field115;

	@ObfuscatedName("client.db")
	public int field126;

	@ObfuscatedName("client.jb")
	public int field132;

	@ObfuscatedName("client.lb")
	public int field134;

	@ObfuscatedName("client.pb")
	public int field138;

	@ObfuscatedName("client.tb")
	public int field141;

	@ObfuscatedName("client.ub")
	public static int field142;

	@ObfuscatedName("client.vb")
	public int field143;

	@ObfuscatedName("client.wb")
	public int field144;

	@ObfuscatedName("client.Ab")
	public int field146;

	@ObfuscatedName("client.Lb")
	public int field154;

	@ObfuscatedName("client.Mb")
	public int field155;

	@ObfuscatedName("client.Nb")
	public int field156;

	@ObfuscatedName("client.Ob")
	public int field157;

	@ObfuscatedName("client.Pb")
	public int field158;

	@ObfuscatedName("client.Sb")
	public int field161;

	@ObfuscatedName("client.Vb")
	public int field164;

	@ObfuscatedName("client.Wb")
	public int field165;

	@ObfuscatedName("client.Xb")
	public int field166;

	@ObfuscatedName("client.Yb")
	public int field167;

	@ObfuscatedName("client.Zb")
	public int field168;

	@ObfuscatedName("client.ac")
	public int field169;

	@ObfuscatedName("client.ic")
	public int field176;

	@ObfuscatedName("client.rc")
	public int field185;

	@ObfuscatedName("client.tc")
	public int field186;

	@ObfuscatedName("client.Fc")
	public static int field198;

	@ObfuscatedName("client.Ic")
	public int field201;

	@ObfuscatedName("client.Jc")
	public int field202;

	@ObfuscatedName("client.Kc")
	public int field203;

	@ObfuscatedName("client.Lc")
	public int field204;

	@ObfuscatedName("client.Nc")
	public int field206;

	@ObfuscatedName("client.Oc")
	public int field207;

	@ObfuscatedName("client.Pc")
	public int field208;

	@ObfuscatedName("client.Uc")
	public int field212;

	@ObfuscatedName("client.ad")
	public int field218;

	@ObfuscatedName("client.cd")
	public int field220;

	@ObfuscatedName("client.ed")
	public int field222;

	@ObfuscatedName("client.hd")
	public static int field225;

	@ObfuscatedName("client.id")
	public int field226;

	@ObfuscatedName("client.ld")
	public int field228;

	@ObfuscatedName("client.md")
	public int field229;

	@ObfuscatedName("client.nd")
	public int field230;

	@ObfuscatedName("client.qd")
	public int field232;

	@ObfuscatedName("client.vd")
	public int field235;

	@ObfuscatedName("client.yd")
	public int field238;

	@ObfuscatedName("client.Cd")
	public int field242;

	@ObfuscatedName("client.Gd")
	public int field245;

	@ObfuscatedName("client.Hd")
	public int field246;

	@ObfuscatedName("client.Id")
	public int field247;

	@ObfuscatedName("client.Jd")
	public int field248;

	@ObfuscatedName("client.Kd")
	public int field249;

	@ObfuscatedName("client.Ld")
	public int field250;

	@ObfuscatedName("client.Nd")
	public int field252;

	@ObfuscatedName("client.Ud")
	public int field257;

	@ObfuscatedName("client.Vd")
	public int field258;

	@ObfuscatedName("client.ae")
	public int field263;

	@ObfuscatedName("client.be")
	public int field264;

	@ObfuscatedName("client.ce")
	public int field265;

	@ObfuscatedName("client.de")
	public int field266;

	@ObfuscatedName("client.ee")
	public int field267;

	@ObfuscatedName("client.ke")
	public int field273;

	@ObfuscatedName("client.ne")
	public int field276;

	@ObfuscatedName("client.qe")
	public int field279;

	@ObfuscatedName("client.re")
	public int field280;

	@ObfuscatedName("client.se")
	public int field281;

	@ObfuscatedName("client.te")
	public int field282;

	@ObfuscatedName("client.ue")
	public int field283;

	@ObfuscatedName("client.we")
	public int field285;

	@ObfuscatedName("client.xe")
	public int field286;

	@ObfuscatedName("client.ye")
	public static int field287;

	@ObfuscatedName("client.ze")
	public int field288;

	@ObfuscatedName("client.Ae")
	public int field289;

	@ObfuscatedName("client.De")
	public int field291;

	@ObfuscatedName("client.Ee")
	public int field292;

	@ObfuscatedName("client.Fe")
	public int field293;

	@ObfuscatedName("client.Je")
	public int field295;

	@ObfuscatedName("client.Ke")
	public int field296;

	@ObfuscatedName("client.Xe")
	public static int field305;

	@ObfuscatedName("client.bf")
	public int field307;

	@ObfuscatedName("client.ff")
	public int field309;

	@ObfuscatedName("client.gf")
	public int field310;

	@ObfuscatedName("client.hf")
	public int field311;

	@ObfuscatedName("client.jf")
	public static int field312;

	@ObfuscatedName("client.lf")
	public int field314;

	@ObfuscatedName("client.mf")
	public int field315;

	@ObfuscatedName("client.nf")
	public int field316;

	@ObfuscatedName("client.of")
	public int field317;

	@ObfuscatedName("client.pf")
	public int field318;

	@ObfuscatedName("client.rf")
	public int field320;

	@ObfuscatedName("client.vf")
	public int field323;

	@ObfuscatedName("client.wf")
	public int field324;

	@ObfuscatedName("client.Af")
	public static int field327;

	@ObfuscatedName("client.Rf")
	public int field342;

	@ObfuscatedName("client.Wf")
	public static int field347;

	@ObfuscatedName("client.Xf")
	public int field348;

	@ObfuscatedName("client.Zf")
	public int field350;

	@ObfuscatedName("client.ag")
	public int field351;

	@ObfuscatedName("client.bg")
	public int field352;

	@ObfuscatedName("client.hg")
	public int field357;

	@ObfuscatedName("client.kg")
	public int field360;

	@ObfuscatedName("client.mg")
	public static int field362;

	@ObfuscatedName("client.tg")
	public static int field368;

	@ObfuscatedName("client.ug")
	public int field369;

	@ObfuscatedName("client.Ag")
	public int field373;

	@ObfuscatedName("client.Bg")
	public int field374;

	@ObfuscatedName("client.Cg")
	public int field375;

	@ObfuscatedName("client.Eg")
	public int field377;

	@ObfuscatedName("client.Fg")
	public int field378;

	@ObfuscatedName("client.Gg")
	public int field379;

	@ObfuscatedName("client.Kg")
	public int field382;

	@ObfuscatedName("client.Lg")
	public int field383;

	@ObfuscatedName("client.Mg")
	public int field384;

	@ObfuscatedName("client.Ng")
	public int field385;

	@ObfuscatedName("client.Og")
	public int field386;

	@ObfuscatedName("client.Pg")
	public int field387;

	@ObfuscatedName("client.Qg")
	public int field388;

	@ObfuscatedName("client.Ug")
	public int field392;

	@ObfuscatedName("client.Vg")
	public int field393;

	@ObfuscatedName("client.Xg")
	public int field395;

	@ObfuscatedName("client.ch")
	public static int field400;

	@ObfuscatedName("client.dh")
	public int field401;

	@ObfuscatedName("client.lh")
	public int field409;

	@ObfuscatedName("client.ph")
	public int field413;

	@ObfuscatedName("client.zh")
	public int field423;

	@ObfuscatedName("client.Lh")
	public int field434;

	@ObfuscatedName("client.Qh")
	public static int field438;

	@ObfuscatedName("client.Vh")
	public static int field443;

	@ObfuscatedName("client.Wh")
	public int field444;

	@ObfuscatedName("client.Xh")
	public int field445;

	@ObfuscatedName("client.Zh")
	public int field447;

	@ObfuscatedName("client.bi")
	public int field448;

	@ObfuscatedName("client.di")
	public int field450;

	@ObfuscatedName("client.fi")
	public static int field452;

	@ObfuscatedName("client.ni")
	public int field460;

	@ObfuscatedName("client.pi")
	public int field461;

	@ObfuscatedName("client.qi")
	public int field462;

	@ObfuscatedName("client.ri")
	public int field463;

	@ObfuscatedName("client.si")
	public int field464;

	@ObfuscatedName("client.ti")
	public int field465;

	@ObfuscatedName("client.Ai")
	public int field471;

	@ObfuscatedName("client.Bi")
	public int field472;

	@ObfuscatedName("client.Li")
	public int field481;

	@ObfuscatedName("client.Mi")
	public int field482;

	@ObfuscatedName("client.Ni")
	public int field483;

	@ObfuscatedName("client.Oi")
	public int field484;

	@ObfuscatedName("client.Pi")
	public int field485;

	@ObfuscatedName("client.Si")
	public int field487;

	@ObfuscatedName("client.Ti")
	public int field488;

	@ObfuscatedName("client.Ui")
	public int field489;

	@ObfuscatedName("client.Vi")
	public int field490;

	@ObfuscatedName("client.Wi")
	public int field491;

	@ObfuscatedName("client.nj")
	public static int field504;

	@ObfuscatedName("client.Bj")
	public int field517;

	@ObfuscatedName("client.Fj")
	public int field520;

	@ObfuscatedName("client.Hj")
	public int field522;

	@ObfuscatedName("client.Jj")
	public int field523;

	@ObfuscatedName("client.Rj")
	public int field531;

	@ObfuscatedName("client.Uj")
	public int field534;

	@ObfuscatedName("client.Vj")
	public int field535;

	@ObfuscatedName("client.Wj")
	public int field536;

	@ObfuscatedName("client.Xj")
	public int field537;

	@ObfuscatedName("client.Zj")
	public int field539;

	@ObfuscatedName("client.ik")
	public int field547;

	@ObfuscatedName("client.lk")
	public int field549;

	@ObfuscatedName("client.O")
	public long field114;

	@ObfuscatedName("client.Td")
	public long field256;

	@ObfuscatedName("client.Xd")
	public long field260;

	@ObfuscatedName("client.qf")
	public long field319;

	@ObfuscatedName("client.lg")
	public long field361;

	@ObfuscatedName("client.kc")
	public AWMLZOXZ field178;

	@ObfuscatedName("client.lc")
	public AWMLZOXZ field179;

	@ObfuscatedName("client.mc")
	public AWMLZOXZ field180;

	@ObfuscatedName("client.nc")
	public AWMLZOXZ field181;

	@ObfuscatedName("client.Gb")
	public BNGXLHWA field149;

	@ObfuscatedName("client.Hb")
	public BNGXLHWA field150;

	@ObfuscatedName("client.Ib")
	public BNGXLHWA field151;

	@ObfuscatedName("client.Jb")
	public BNGXLHWA field152;

	@ObfuscatedName("client.Kb")
	public BNGXLHWA field153;

	@ObfuscatedName("client.Qb")
	public BNGXLHWA field159;

	@ObfuscatedName("client.Rb")
	public BNGXLHWA field160;

	@ObfuscatedName("client.ec")
	public BNGXLHWA field172;

	@ObfuscatedName("client.fc")
	public BNGXLHWA field173;

	@ObfuscatedName("client.gc")
	public BNGXLHWA field174;

	@ObfuscatedName("client.Fh")
	public BNGXLHWA field429;

	@ObfuscatedName("client.Gh")
	public BNGXLHWA field430;

	@ObfuscatedName("client.Hh")
	public BNGXLHWA field431;

	@ObfuscatedName("client.xi")
	public BNGXLHWA field469;

	@ObfuscatedName("client.yi")
	public BNGXLHWA field470;

	@ObfuscatedName("client.Fi")
	public BNGXLHWA field475;

	@ObfuscatedName("client.Gi")
	public BNGXLHWA field476;

	@ObfuscatedName("client.Hi")
	public BNGXLHWA field477;

	@ObfuscatedName("client.Ii")
	public BNGXLHWA field478;

	@ObfuscatedName("client.Ji")
	public BNGXLHWA field479;

	@ObfuscatedName("client.mi")
	public static BSQIIHOT field459;

	@ObfuscatedName("client.T")
	public ESGPTMPA field116;

	@ObfuscatedName("client.U")
	public ESGPTMPA field117;

	@ObfuscatedName("client.V")
	public ESGPTMPA field118;

	@ObfuscatedName("client.W")
	public ESGPTMPA field119;

	@ObfuscatedName("client.X")
	public ESGPTMPA field120;

	@ObfuscatedName("client.Y")
	public ESGPTMPA field121;

	@ObfuscatedName("client.Z")
	public ESGPTMPA field122;

	@ObfuscatedName("client.ab")
	public ESGPTMPA field123;

	@ObfuscatedName("client.bb")
	public ESGPTMPA field124;

	@ObfuscatedName("client.vc")
	public ESGPTMPA field188;

	@ObfuscatedName("client.wc")
	public ESGPTMPA field189;

	@ObfuscatedName("client.xc")
	public ESGPTMPA field190;

	@ObfuscatedName("client.yc")
	public ESGPTMPA field191;

	@ObfuscatedName("client.zc")
	public ESGPTMPA field192;

	@ObfuscatedName("client.Ac")
	public ESGPTMPA field193;

	@ObfuscatedName("client.Bc")
	public ESGPTMPA field194;

	@ObfuscatedName("client.Cc")
	public ESGPTMPA field195;

	@ObfuscatedName("client.Dc")
	public ESGPTMPA field196;

	@ObfuscatedName("client.Nf")
	public ESGPTMPA field339;

	@ObfuscatedName("client.Of")
	public ESGPTMPA field340;

	@ObfuscatedName("client.Pf")
	public ESGPTMPA field341;

	@ObfuscatedName("client.Yg")
	public ESGPTMPA field396;

	@ObfuscatedName("client.Zg")
	public ESGPTMPA field397;

	@ObfuscatedName("client.ah")
	public ESGPTMPA field398;

	@ObfuscatedName("client.bh")
	public ESGPTMPA field399;

	@ObfuscatedName("client.pc")
	public IBHUFTPE field183;

	@ObfuscatedName("client.qc")
	public IBHUFTPE field184;

	@ObfuscatedName("client.Oe")
	public IBHUFTPE field299;

	@ObfuscatedName("client.xf")
	public IBHUFTPE field325;

	@ObfuscatedName("client.Ff")
	public IBHUFTPE field331;

	@ObfuscatedName("client.Gf")
	public IBHUFTPE field332;

	@ObfuscatedName("client.gg")
	public IBHUFTPE field356;

	@ObfuscatedName("client.Lj")
	public IBHUFTPE field525;

	@ObfuscatedName("client.Mj")
	public IBHUFTPE field526;

	@ObfuscatedName("client.Yj")
	public IBHUFTPE field538;

	@ObfuscatedName("client.ak")
	public IBHUFTPE field540;

	@ObfuscatedName("client.bk")
	public IBHUFTPE field541;

	@ObfuscatedName("client.ck")
	public IBHUFTPE field542;

	@ObfuscatedName("client.dk")
	public IBHUFTPE field543;

	@ObfuscatedName("client.ek")
	public IBHUFTPE field544;

	@ObfuscatedName("client.Tj")
	public IEMHZJLX field533;

	@ObfuscatedName("client.Wg")
	public JFQWYHZJ field394;

	@ObfuscatedName("client.hc")
	public QIAMMSTQ field175;

	@ObfuscatedName("client.Ig")
	public RKMPVAZH field381;

	@ObfuscatedName("client.og")
	public TYRTFBBQ field363;

	@ObfuscatedName("client.je")
	public YNDLJDLS field272;

	@ObfuscatedName("client.Mc")
	public String field205;

	@ObfuscatedName("client.Qd")
	public String field254;

	@ObfuscatedName("client.Sd")
	public String field255;

	@ObfuscatedName("client.cg")
	public String field353;

	@ObfuscatedName("client.ob")
	public Socket field137;

	@ObfuscatedName("client.fe")
	public static boolean field268;

	@ObfuscatedName("client.Cf")
	public static boolean field329;

	@ObfuscatedName("client.Nh")
	public static boolean field436;

	@ObfuscatedName("client.lj")
	public static boolean field503;

	@ObfuscatedName("client.Xc")
	public int[] field215;

	@ObfuscatedName("client.Yc")
	public int[] field216;

	@ObfuscatedName("client.Zc")
	public int[] field217;

	@ObfuscatedName("client.Dd")
	public int[] field243;

	@ObfuscatedName("client.Ed")
	public int[] field244;

	@ObfuscatedName("client.ii")
	public int[] field455;

	@ObfuscatedName("client.ji")
	public int[] field456;

	@ObfuscatedName("client.ki")
	public int[] field457;

	@ObfuscatedName("client.li")
	public int[] field458;

	@ObfuscatedName("client.Xi")
	public int[] field492;

	@ObfuscatedName("client.Yi")
	public int[] field493;

	@ObfuscatedName("client.gj")
	public int[] field499;

	@ObfuscatedName("client.hj")
	public int[] field500;

	@ObfuscatedName("client.ij")
	public int[] field501;

	@ObfuscatedName("client.jj")
	public int[] field502;

	@ObfuscatedName("client.ei")
	public BNGXLHWA[] field451;

	@ObfuscatedName("client.Ad")
	public byte[][] field240;

	@ObfuscatedName("client.Yf")
	public byte[][] field349;

	@ObfuscatedName("client.bd")
	public byte[][][] field219;

	@ObfuscatedName("client.Oj")
	public int[][][] field528;

	@ObfuscatedName("client.d(I)V")
	public final void method48() {
		int var1 = field164 * 128 + 64;
		int var2 = field165 * 128 + 64;
		int var3 = method68(var2, var1, field395) - field166;

		if (field314 < var1) {
			field314 += (var1 - field314) * field168 / 1000 + field167;
			if (field314 > var1) {
				field314 = var1;
			}
		}

		if (field314 > var1) {
			field314 -= (field314 - var1) * field168 / 1000 + field167;
			if (field314 < var1) {
				field314 = var1;
			}
		}

		if (field315 < var3) {
			field315 += (var3 - field315) * field168 / 1000 + field167;
			if (field315 > var3) {
				field315 = var3;
			}
		}

		if (field315 > var3) {
			field315 -= (field315 - var3) * field168 / 1000 + field167;
			if (field315 < var3) {
				field315 = var3;
			}
		}

		if (field316 < var2) {
			field316 += (var2 - field316) * field168 / 1000 + field167;
			if (field316 > var2) {
				field316 = var2;
			}
		}

		if (field316 > var2) {
			field316 -= (field316 - var2) * field168 / 1000 + field167;
			if (field316 < var2) {
				field316 = var2;
			}
		}

		int var4 = field461 * 128 + 64;
		int var5 = field462 * 128 + 64;
		int var6 = method68(var5, var4, field395) - field463;
		int var7 = var4 - field314;
		int var8 = var6 - field315;
		int var9 = var5 - field316;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field317 < var11) {
			field317 += (var11 - field317) * field465 / 1000 + field464;
			if (field317 > var11) {
				field317 = var11;
			}
		}

		if (field317 > var11) {
			field317 -= (field317 - var11) * field465 / 1000 + field464;
			if (field317 < var11) {
				field317 = var11;
			}
		}

		int var13 = var12 - field318;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field318 += field465 * var13 / 1000 + field464;
			field318 &= 0x7FF;
		}

		if (var13 < 0) {
			field318 -= -var13 * field465 / 1000 + field464;
			field318 &= 0x7FF;
		}

		int var14 = var12 - field318;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field318 = var12;
		}
	}

	@ObfuscatedName("client.a(LBSQIIHOT;BIII)V")
	public final void method49(BSQIIHOT arg0, int arg1, int arg2, int arg3) {
		if (field459 != arg0 && field230 < 400) {
			String var5;
			if (arg0.field95 == 0) {
				var5 = arg0.field80 + method156(arg0.field94, field459.field94) + " (level-" + arg0.field94 + ")";
			} else {
				var5 = arg0.field80 + " (skill-" + arg0.field95 + ")";
			}

			if (field201 == 1) {
				field365[field230] = "Use " + field205 + " with @whi@" + var5;
				field407[field230] = 567;
				field408[field230] = arg2;
				field405[field230] = arg1;
				field406[field230] = arg3;
				field230++;
			} else if (field350 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field343[var6] != null) {
						field365[field230] = field343[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field343[var6].equalsIgnoreCase("attack")) {
							if (arg0.field94 > field459.field94) {
								var7 = 2000;
							}

							if (field459.field86 != 0 && arg0.field86 != 0) {
								if (field459.field86 == arg0.field86) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field344[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field407[field230] = var7 + 314;
						}

						if (var6 == 1) {
							field407[field230] = var7 + 274;
						}

						if (var6 == 2) {
							field407[field230] = var7 + 369;
						}

						if (var6 == 3) {
							field407[field230] = var7 + 191;
						}

						if (var6 == 4) {
							field407[field230] = var7 + 48;
						}

						field408[field230] = arg2;
						field405[field230] = arg1;
						field406[field230] = arg3;
						field230++;
					}
				}
			} else if ((field352 & 0x8) == 8) {
				field365[field230] = field353 + " @whi@" + var5;
				field407[field230] = 495;
				field408[field230] = arg2;
				field405[field230] = arg1;
				field406[field230] = arg3;
				field230++;
			}

			for (int var8 = 0; var8 < field230; var8++) {
				if (field407[var8] == 2) {
					field365[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIZ)V")
	public final void method50(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field516[var4] != null) {
				int var5 = field514[var4];
				int var6 = field293 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field515[var4];
				boolean var8 = false;

				if (var7 != null && var7.startsWith("@cr1@")) {
					var7 = var7.substring(5);
					boolean var9 = true;
				}

				if (var7 != null && var7.startsWith("@cr2@")) {
					var7 = var7.substring(5);
					boolean var10 = true;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field288 == 0 || field288 == 1 && method74(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field459.field80)) {
						if (field377 >= 1) {
							field365[field230] = "Report abuse @whi@" + var7;
							field407[field230] = 614;
							field230++;
						}

						field365[field230] = "Add ignore @whi@" + var7;
						field407[field230] = 235;
						field230++;
						field365[field230] = "Add friend @whi@" + var7;
						field407[field230] = 87;
						field230++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field549 == 0 && (var5 == 7 || field242 == 0 || field242 == 1 && method74(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field377 >= 1) {
							field365[field230] = "Report abuse @whi@" + var7;
							field407[field230] = 614;
							field230++;
						}

						field365[field230] = "Add ignore @whi@" + var7;
						field407[field230] = 235;
						field230++;
						field365[field230] = "Add friend @whi@" + var7;
						field407[field230] = 87;
						field230++;
					}

					var3++;
				}

				if (var5 == 4 && (field320 == 0 || field320 == 1 && method74(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field365[field230] = "Accept trade @whi@" + var7;
						field407[field230] = 536;
						field230++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field549 == 0 && field242 < 2) {
					var3++;
				}

				if (var5 == 8 && (field320 == 0 || field320 == 1 && method74(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field365[field230] = "Accept challenge @whi@" + var7;
						field407[field230] = 691;
						field230++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method51() {
		if (field399 == null) {
			method137();
			field1108 = null;
			field188 = null;
			field189 = null;
			field190 = null;
			field191 = null;
			field192 = null;
			field193 = null;
			field194 = null;
			field195 = null;
			field196 = null;
			field399 = new ESGPTMPA(96, 479, method119());
			field397 = new ESGPTMPA(156, 172, method119());
			FVBHOYJF.method212();
			field430.method38(0, 0);
			field396 = new ESGPTMPA(261, 190, method119());
			field398 = new ESGPTMPA(334, 512, method119());
			FVBHOYJF.method212();
			field339 = new ESGPTMPA(50, 496, method119());
			field340 = new ESGPTMPA(37, 269, method119());
			field341 = new ESGPTMPA(45, 249, method119());
			field259 = true;
			field398.method206();
			THHUVKBK.field1413 = field457;
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method52() {
		field452++;
		if (field452 > 1754) {
			field452 = 0;
			field370.method346(41);
			field370.method347(0);
			int var1 = field370.field1014;
			field370.method347(105);
			field370.method348(61787);

			if ((int) (Math.random() * 2.0D) == 0) {
				field370.method347(216);
			}

			field370.method348(15751);
			field370.method348(46500);

			if ((int) (Math.random() * 2.0D) == 0) {
				field370.method348(56513);
			}

			field370.method348(34718);
			field370.method347(7);
			field370.method348((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field370.method347(222);
			}

			field370.method356(field370.field1014 - var1);
		}

		for (int var2 = 0; var2 < field531; var2++) {
			int var3 = field532[var2];
			ACKJULTZ var4 = field530[var3];
			if (var4 != null) {
				method53(var4.field1.field888, var4);
			}
		}
	}

	@ObfuscatedName("client.a(ILJXGMYPJH;B)V")
	public final void method53(int arg0, JXGMYPJH arg1) {
		if (arg1.field828 < 128 || arg1.field829 < 128 || arg1.field828 >= 13184 || arg1.field829 >= 13184) {
			arg1.field823 = -1;
			arg1.field790 = -1;
			arg1.field799 = 0;
			arg1.field800 = 0;
			arg1.field828 = arg1.field834[0] * 128 + arg1.field812 * 64;
			arg1.field829 = arg1.field835[0] * 128 + arg1.field812 * 64;
			arg1.method304();
		}

		if (field459 == arg1 && (arg1.field828 < 1536 || arg1.field829 < 1536 || arg1.field828 >= 11776 || arg1.field829 >= 11776)) {
			arg1.field823 = -1;
			arg1.field790 = -1;
			arg1.field799 = 0;
			arg1.field800 = 0;
			arg1.field828 = arg1.field834[0] * 128 + arg1.field812 * 64;
			arg1.field829 = arg1.field835[0] * 128 + arg1.field812 * 64;
			arg1.method304();
		}

		if (arg1.field799 > field443) {
			method54(arg1);
		} else if (arg1.field800 >= field443) {
			method55(arg1);
		} else {
			method56(arg1);
		}

		method57(arg1);
		method58(arg1);
	}

	@ObfuscatedName("client.a(LJXGMYPJH;I)V")
	public final void method54(JXGMYPJH arg0) {
		int var2 = arg0.field799 - field443;
		int var3 = arg0.field812 * 64 + arg0.field795 * 128;
		int var4 = arg0.field812 * 64 + arg0.field797 * 128;
		arg0.field828 += (var3 - arg0.field828) / var2;
		arg0.field829 += (var4 - arg0.field829) / var2;
		arg0.field802 = 0;

		if (arg0.field801 == 0) {
			arg0.field817 = 1024;
		}

		if (arg0.field801 == 1) {
			arg0.field817 = 1536;
		}

		if (arg0.field801 == 2) {
			arg0.field817 = 0;
		}

		if (arg0.field801 == 3) {
			arg0.field817 = 512;
		}
	}

	@ObfuscatedName("client.b(LJXGMYPJH;I)V")
	public final void method55(JXGMYPJH arg0) {
		if (field443 == arg0.field800 || arg0.field823 == -1 || arg0.field826 != 0 || arg0.field825 + 1 > JZFUUSFN.field841[arg0.field823].method308(arg0.field824)) {
			int var2 = arg0.field800 - arg0.field799;
			int var3 = field443 - arg0.field799;
			int var4 = arg0.field812 * 64 + arg0.field795 * 128;
			int var5 = arg0.field812 * 64 + arg0.field797 * 128;
			int var6 = arg0.field812 * 64 + arg0.field796 * 128;
			int var7 = arg0.field812 * 64 + arg0.field798 * 128;
			arg0.field828 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field829 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field802 = 0;

		if (arg0.field801 == 0) {
			arg0.field817 = 1024;
		}

		if (arg0.field801 == 1) {
			arg0.field817 = 1536;
		}

		if (arg0.field801 == 2) {
			arg0.field817 = 0;
		}

		if (arg0.field801 == 3) {
			arg0.field817 = 512;
		}

		arg0.field830 = arg0.field817;
	}

	@ObfuscatedName("client.a(ILJXGMYPJH;)V")
	public final void method56(JXGMYPJH arg0) {
		arg0.field836 = arg0.field832;
		if (arg0.field816 == 0) {
			arg0.field802 = 0;
		} else {
			if (arg0.field823 != -1 && arg0.field826 == 0) {
				JZFUUSFN var2 = JZFUUSFN.field841[arg0.field823];
				if (arg0.field814 > 0 && var2.field853 == 0) {
					arg0.field802++;
					return;
				}

				if (arg0.field814 <= 0 && var2.field854 == 0) {
					arg0.field802++;
					return;
				}
			}

			int var3 = arg0.field828;
			int var4 = arg0.field829;
			int var5 = arg0.field834[arg0.field816 - 1] * 128 + arg0.field812 * 64;
			int var6 = arg0.field835[arg0.field816 - 1] * 128 + arg0.field812 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field817 = 1280;
					} else if (var4 > var6) {
						arg0.field817 = 1792;
					} else {
						arg0.field817 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field817 = 768;
					} else if (var4 > var6) {
						arg0.field817 = 256;
					} else {
						arg0.field817 = 512;
					}
				} else if (var4 < var6) {
					arg0.field817 = 1024;
				} else {
					arg0.field817 = 0;
				}

				int var7 = arg0.field817 - arg0.field830 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field806;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field805;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field808;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field807;
				}

				if (var8 == -1) {
					var8 = arg0.field805;
				}

				arg0.field836 = var8;
				int var9 = 4;
				if (arg0.field830 != arg0.field817 && arg0.field815 == -1 && arg0.field831 != 0) {
					var9 = 2;
				}

				if (arg0.field816 > 2) {
					var9 = 6;
				}

				if (arg0.field816 > 3) {
					var9 = 8;
				}

				if (arg0.field802 > 0 && arg0.field816 > 1) {
					var9 = 8;
					arg0.field802--;
				}

				if (arg0.field819[arg0.field816 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field836 == arg0.field805 && arg0.field818 != -1) {
					arg0.field836 = arg0.field818;
				}

				if (var3 < var5) {
					arg0.field828 += var9;
					if (arg0.field828 > var5) {
						arg0.field828 = var5;
					}
				} else if (var3 > var5) {
					arg0.field828 -= var9;
					if (arg0.field828 < var5) {
						arg0.field828 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field829 += var9;
					if (arg0.field829 > var6) {
						arg0.field829 = var6;
					}
				} else if (var4 > var6) {
					arg0.field829 -= var9;
					if (arg0.field829 < var6) {
						arg0.field829 = var6;
					}
				}

				if (arg0.field828 == var5 && arg0.field829 == var6) {
					arg0.field816--;

					if (arg0.field814 > 0) {
						arg0.field814--;
						return;
					}
				}
			} else {
				arg0.field828 = var5;
				arg0.field829 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LJXGMYPJH;B)V")
	public final void method57(JXGMYPJH arg0) {
		if (arg0.field831 != 0) {
			if (arg0.field815 != -1 && arg0.field815 < 32768) {
				ACKJULTZ var2 = field530[arg0.field815];
				if (var2 != null) {
					int var3 = arg0.field828 - var2.field828;
					int var4 = arg0.field829 - var2.field829;
					if (var3 != 0 || var4 != 0) {
						arg0.field817 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field815 >= 32768) {
				int var5 = arg0.field815 - 32768;
				if (field390 == var5) {
					var5 = field130;
				}

				BSQIIHOT var6 = field131[var5];
				if (var6 != null) {
					int var7 = arg0.field828 - var6.field828;
					int var8 = arg0.field829 - var6.field829;
					if (var7 != 0 || var8 != 0) {
						arg0.field817 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field788 != 0 || arg0.field789 != 0) && (arg0.field816 == 0 || arg0.field802 > 0)) {
				int var9 = arg0.field828 - (arg0.field788 - field245 - field245) * 64;
				int var10 = arg0.field829 - (arg0.field789 - field246 - field246) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field817 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field788 = 0;
				arg0.field789 = 0;
			}

			int var11 = arg0.field817 - arg0.field830 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field831 || var11 > 2048 - arg0.field831) {
					arg0.field830 = arg0.field817;
				} else if (var11 > 1024) {
					arg0.field830 -= arg0.field831;
				} else {
					arg0.field830 += arg0.field831;
				}

				arg0.field830 &= 0x7FF;
				if (arg0.field836 == arg0.field832 && arg0.field830 != arg0.field817) {
					if (arg0.field833 != -1) {
						arg0.field836 = arg0.field833;
						return;
					}

					arg0.field836 = arg0.field805;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(LJXGMYPJH;I)V")
	public final void method58(JXGMYPJH arg0) {
		arg0.field803 = false;

		if (arg0.field836 != -1) {
			JZFUUSFN var2 = JZFUUSFN.field841[arg0.field836];
			arg0.field838++;
			if (arg0.field837 < var2.field842 && arg0.field838 > var2.method308(arg0.field837)) {
				arg0.field838 = 0;
				arg0.field837++;
			}

			if (arg0.field837 >= var2.field842) {
				arg0.field838 = 0;
				arg0.field837 = 0;
			}
		}

		if (arg0.field790 != -1 && field443 >= arg0.field793) {
			if (arg0.field791 < 0) {
				arg0.field791 = 0;
			}

			JZFUUSFN var3 = MBSSGBHW.field927[arg0.field790].field931;
			arg0.field792++;
			while (arg0.field791 < var3.field842 && arg0.field792 > var3.method308(arg0.field791)) {
				arg0.field792 -= var3.method308(arg0.field791);
				arg0.field791++;
			}

			if (arg0.field791 >= var3.field842 && (arg0.field791 < 0 || arg0.field791 >= var3.field842)) {
				arg0.field790 = -1;
			}
		}

		if (arg0.field823 != -1 && arg0.field826 <= 1) {
			JZFUUSFN var4 = JZFUUSFN.field841[arg0.field823];
			if (var4.field853 == 1 && arg0.field814 > 0 && arg0.field799 <= field443 && arg0.field800 < field443) {
				arg0.field826 = 1;
				return;
			}
		}

		if (arg0.field823 != -1 && arg0.field826 == 0) {
			JZFUUSFN var5 = JZFUUSFN.field841[arg0.field823];
			arg0.field825++;
			while (arg0.field824 < var5.field842 && arg0.field825 > var5.method308(arg0.field824)) {
				arg0.field825 -= var5.method308(arg0.field824);
				arg0.field824++;
			}

			if (arg0.field824 >= var5.field842) {
				arg0.field824 -= var5.field846;
				arg0.field827++;
				if (arg0.field827 >= var5.field852) {
					arg0.field823 = -1;
				}

				if (arg0.field824 < 0 || arg0.field824 >= var5.field842) {
					arg0.field823 = -1;
				}
			}

			arg0.field803 = var5.field848;
		}

		if (arg0.field826 > 0) {
			arg0.field826--;
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method59() {
		if (field446 == -1 || field289 != 2 && field1108 == null) {
			if (field259) {
				method51();
				field259 = false;
				field116.method207(field1107, 4, 0);
				field117.method207(field1107, 357, 0);
				field118.method207(field1107, 4, 722);
				field119.method207(field1107, 205, 743);
				field120.method207(field1107, 0, 0);
				field121.method207(field1107, 4, 516);
				field122.method207(field1107, 205, 516);
				field123.method207(field1107, 357, 496);
				field124.method207(field1107, 338, 0);
				field227 = true;
				field271 = true;
				field128 = true;
				field439 = true;

				if (field289 != 2) {
					field398.method207(field1107, 4, 4);
					field397.method207(field1107, 4, 550);
				}
			}

			if (field289 == 2) {
				method73();
			}

			if (field278 && field481 == 1) {
				field227 = true;
			}

			if (field111 != -1) {
				boolean var3 = method186(field520, field111);
				if (var3) {
					field227 = true;
				}
			}

			if (field385 == 2) {
				field227 = true;
			}

			if (field281 == 2) {
				field227 = true;
			}

			if (field227) {
				method193();
				field227 = false;
			}

			if (field548 == -1 && field471 == 0) {
				field428.field1086 = field298 - field293 - 77;

				if (field1115 > 448 && field1115 < 560 && field1116 > 332) {
					method109(field1116 - 357, field428, 77, 0, -1, field1115 - 17, 463, field298);
				}

				int var4 = field298 - field428.field1086 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field298 - 77) {
					var4 = field298 - 77;
				}

				if (field293 != var4) {
					field293 = var4;
					field271 = true;
				}
			}

			if (field548 == -1 && field471 == 3) {
				int var5 = field235 * 14 + 7;
				field428.field1086 = field238;

				if (field1115 > 448 && field1115 < 560 && field1116 > 332) {
					method109(field1116 - 357, field428, 77, 0, -1, field1115 - 17, 463, var5);
				}

				int var6 = field428.field1086;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field238 != var6) {
					field238 = var6;
					field271 = true;
				}
			}

			if (field548 != -1) {
				boolean var7 = method186(field520, field548);
				if (var7) {
					field271 = true;
				}
			}

			if (field385 == 3) {
				field271 = true;
			}

			if (field281 == 3) {
				field271 = true;
			}

			if (field255 != null) {
				field271 = true;
			}

			if (field278 && field481 == 2) {
				field271 = true;
			}

			if (field271) {
				method88();
				field271 = false;
			}

			if (field289 == 2) {
				method181();
				field397.method207(field1107, 4, 550);
			}

			if (field410 != -1) {
				field128 = true;
			}

			if (field128) {
				if (field410 != -1 && field410 == field338) {
					field410 = -1;
					field370.method346(77);
					field370.method347(field338);
				}

				field128 = false;
				field341.method206();
				field174.method38(0, 0);

				if (field111 == -1) {
					if (field284[field338] != -1) {
						if (field338 == 0) {
							field149.method38(22, 10);
						}

						if (field338 == 1) {
							field150.method38(54, 8);
						}

						if (field338 == 2) {
							field150.method38(82, 8);
						}

						if (field338 == 3) {
							field151.method38(110, 8);
						}

						if (field338 == 4) {
							field153.method38(153, 8);
						}

						if (field338 == 5) {
							field153.method38(181, 8);
						}

						if (field338 == 6) {
							field152.method38(209, 9);
						}
					}

					if (field284[0] != -1 && (field410 != 0 || field443 % 20 < 10)) {
						field308[0].method38(29, 13);
					}

					if (field284[1] != -1 && (field410 != 1 || field443 % 20 < 10)) {
						field308[1].method38(53, 11);
					}

					if (field284[2] != -1 && (field410 != 2 || field443 % 20 < 10)) {
						field308[2].method38(82, 11);
					}

					if (field284[3] != -1 && (field410 != 3 || field443 % 20 < 10)) {
						field308[3].method38(115, 12);
					}

					if (field284[4] != -1 && (field410 != 4 || field443 % 20 < 10)) {
						field308[4].method38(153, 13);
					}

					if (field284[5] != -1 && (field410 != 5 || field443 % 20 < 10)) {
						field308[5].method38(180, 11);
					}

					if (field284[6] != -1 && (field410 != 6 || field443 % 20 < 10)) {
						field308[6].method38(208, 13);
					}
				}

				field341.method207(field1107, 160, 516);
				field340.method206();
				field173.method38(0, 0);

				if (field111 == -1) {
					if (field284[field338] != -1) {
						if (field338 == 7) {
							field475.method38(42, 0);
						}

						if (field338 == 8) {
							field476.method38(74, 0);
						}

						if (field338 == 9) {
							field476.method38(102, 0);
						}

						if (field338 == 10) {
							field477.method38(130, 1);
						}

						if (field338 == 11) {
							field479.method38(173, 0);
						}

						if (field338 == 12) {
							field479.method38(201, 0);
						}

						if (field338 == 13) {
							field478.method38(229, 0);
						}
					}

					if (field284[8] != -1 && (field410 != 8 || field443 % 20 < 10)) {
						field308[7].method38(74, 2);
					}

					if (field284[9] != -1 && (field410 != 9 || field443 % 20 < 10)) {
						field308[8].method38(102, 3);
					}

					if (field284[10] != -1 && (field410 != 10 || field443 % 20 < 10)) {
						field308[9].method38(137, 4);
					}

					if (field284[11] != -1 && (field410 != 11 || field443 % 20 < 10)) {
						field308[10].method38(174, 2);
					}

					if (field284[12] != -1 && (field410 != 12 || field443 % 20 < 10)) {
						field308[11].method38(201, 2);
					}

					if (field284[13] != -1 && (field410 != 13 || field443 % 20 < 10)) {
						field308[12].method38(226, 2);
					}
				}

				field340.method207(field1107, 466, 496);
				field398.method206();
				THHUVKBK.field1413 = field457;
			}

			if (field439) {
				field439 = false;
				field339.method206();
				field172.method38(0, 0);
				field179.method19("Public chat", true, 28, 0xFFFFFF, 55);

				if (field288 == 0) {
					field179.method19("On", true, 41, 0xFF00, 55);
				}

				if (field288 == 1) {
					field179.method19("Friends", true, 41, 0xFFFF00, 55);
				}

				if (field288 == 2) {
					field179.method19("Off", true, 41, 0xFF0000, 55);
				}

				if (field288 == 3) {
					field179.method19("Hide", true, 41, 0xFFFF, 55);
				}

				field179.method19("Private chat", true, 28, 0xFFFFFF, 184);

				if (field242 == 0) {
					field179.method19("On", true, 41, 0xFF00, 184);
				}

				if (field242 == 1) {
					field179.method19("Friends", true, 41, 0xFFFF00, 184);
				}

				if (field242 == 2) {
					field179.method19("Off", true, 41, 0xFF0000, 184);
				}

				field179.method19("Trade/compete", true, 28, 0xFFFFFF, 324);

				if (field320 == 0) {
					field179.method19("On", true, 41, 0xFF00, 324);
				}

				if (field320 == 1) {
					field179.method19("Friends", true, 41, 0xFFFF00, 324);
				}

				if (field320 == 2) {
					field179.method19("Off", true, 41, 0xFF0000, 324);
				}

				field179.method19("Report abuse", true, 33, 0xFFFFFF, 458);
				field339.method207(field1107, 453, 0);
				field398.method206();
				THHUVKBK.field1413 = field457;
			}

			field520 = 0;
		} else {
			if (field289 == 2) {
				method186(field520, field446);

				if (field376 != -1) {
					method186(field520, field376);
				}

				field520 = 0;
				method70();
				field1108.method206();
				THHUVKBK.field1413 = field458;
				FVBHOYJF.method212();
				field259 = true;
				MYGSUHVG var1 = MYGSUHVG.method402(field446);
				if (var1.field1038 == 512 && var1.field1034 == 334 && var1.field1090 == 0) {
					var1.field1038 = 765;
					var1.field1034 = 503;
				}

				method124(var1, 0, 0, 0);

				if (field376 != -1) {
					MYGSUHVG var2 = MYGSUHVG.method402(field376);
					if (var2.field1038 == 512 && var2.field1034 == 334 && var2.field1090 == 0) {
						var2.field1038 = 765;
						var2.field1034 = 503;
					}

					method124(var2, 0, 0, 0);
				}

				if (field278) {
					method69();
				} else {
					method165();
					method174();
				}
			}

			field1108.method207(field1107, 0, 0);
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method60() {
		field125 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field333) {
				field401++;
				method145();
				method145();
				method149();
				var3++;
				if (var3 > 10) {
					long var5 = System.currentTimeMillis();
					int var7 = (int) (var5 - var1) / 10 - var4;
					var4 = 40 - var7;
					if (var4 < 5) {
						var4 = 5;
					}

					var3 = 0;
					var1 = var5;
				}

				try {
					Thread.sleep(var4);
				} catch (Exception var8) {
				}
			}
		} catch (Exception var9) {
		}

		field125 = false;
	}

	@ObfuscatedName("client.a(LMVHXDWGI;ZI)V")
	public final void method61(MVHXDWGI arg0, int arg1) {
		while (arg0.field1015 + 10 < arg1 * 8) {
			int var3 = arg0.method368(11);
			if (var3 == 2047) {
				break;
			}

			if (field131[var3] == null) {
				field131[var3] = new BSQIIHOT();
				if (field136[var3] != null) {
					field131[var3].method42(field136[var3]);
				}
			}

			field133[field132++] = var3;
			BSQIIHOT var4 = field131[var3];
			var4.field813 = field443;
			int var5 = arg0.method368(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method368(1);
			int var7 = arg0.method368(1);
			if (var7 == 1) {
				field135[field134++] = var3;
			}

			int var8 = arg0.method368(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method306(field459.field835[0] + var5, var6 == 1, field459.field834[0] + var8);
		}

		arg0.method369();
	}

	@ObfuscatedName("client.b(B)V")
	public final void method62() {
		for (SOQRIJPC var1 = (SOQRIJPC) field335.method246(); var1 != null; var1 = (SOQRIJPC) field335.method248()) {
			if (field395 != var1.field1361 || field443 > var1.field1365) {
				var1.method589();
			} else if (field443 >= var1.field1364) {
				if (var1.field1369 > 0) {
					ACKJULTZ var2 = field530[var1.field1369 - 1];
					if (var2 != null && var2.field828 >= 0 && var2.field828 < 13312 && var2.field829 >= 0 && var2.field829 < 13312) {
						var1.method542(var2.field828, field443, method68(var2.field829, var2.field828, var1.field1361) - var1.field1375, var2.field829);
					}
				}

				if (var1.field1369 < 0) {
					int var3 = -var1.field1369 - 1;
					BSQIIHOT var4;
					if (field390 == var3) {
						var4 = field459;
					} else {
						var4 = field131[var3];
					}

					if (var4 != null && var4.field828 >= 0 && var4.field828 < 13312 && var4.field829 >= 0 && var4.field829 < 13312) {
						var1.method542(var4.field828, field443, method68(var4.field829, var4.field828, var1.field1361) - var1.field1375, var4.field829);
					}
				}

				var1.method541(field520);
				field394.method263(field395, (int) var1.field1360, (int) var1.field1358, var1, (int) var1.field1359, 60, var1.field1352, false, -1);
			}
		}

		field368++;
		if (field368 > 138) {
			field368 = 0;
			field370.method346(36);
			field370.method348(48837);
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method63(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field450; var3++) {
				if (field145[var3] == arg0) {
					field450--;
					field227 = true;

					for (int var4 = var3; var4 < field450; var4++) {
						field145[var4] = field145[var4 + 1];
					}

					field370.method346(141);
					field370.method353(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method64() {
		if (field329 && field289 == 2 && SBZYTIRX.field1351 != field395) {
			method111(null, "Loading - please wait.");
			field289 = 1;
			field260 = System.currentTimeMillis();
		}

		if (field289 == 1) {
			int var1 = method65();
			if (var1 != 0 && System.currentTimeMillis() - field260 > 360000L) {
				signlink.reporterror(field426 + " glcfb " + field361 + "," + var1 + "," + field329 + "," + field313[0] + "," + field381.method499() + "," + field395 + "," + field386 + "," + field387);
				field260 = System.currentTimeMillis();
			}
		}

		if (field289 == 2 && field395 != field321) {
			field321 = field395;
			method87(field395);
		}
	}

	@ObfuscatedName("client.f(Z)I")
	public final int method65() {
		for (int var1 = 0; var1 < field349.length; var1++) {
			if (field349[var1] == null && field216[var1] != -1) {
				return -1;
			}

			if (field240[var1] == null && field217[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field349.length; var3++) {
			byte[] var4 = field240[var3];
			if (var4 != null) {
				int var5 = (field215[var3] >> 8) * 64 - field245;
				int var6 = (field215[var3] & 0xFF) * 64 - field246;
				if (field486) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= SBZYTIRX.method537(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field214) {
			return -4;
		} else {
			field289 = 2;
			SBZYTIRX.field1351 = field395;
			method104();
			field370.method346(50);
			return 0;
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method66(int arg0) {
		MYGSUHVG var2 = MYGSUHVG.method402(arg0);
		for (int var3 = 0; var3 < var2.field1064.length && var2.field1064[var3] != -1; var3++) {
			MYGSUHVG var4 = MYGSUHVG.method402(var2.field1064[var3]);
			if (var4.field1090 == 1) {
				method66(var4.field1075);
			}

			var4.field1059 = 0;
			var4.field1096 = 0;
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method67() {
		while (true) {
			int var1 = method409();
			if (var1 == -1) {
				return;
			}

			if (field304 != -1 && field330 == field304) {
				if (var1 == 8 && field524.length() > 0) {
					field524 = field524.substring(0, field524.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field524.length() < 12) {
					field524 = field524 + (char) var1;
				}
			} else if (field239) {
				if (var1 >= 32 && var1 <= 122 && field211.length() < 80) {
					field211 = field211 + (char) var1;
					field271 = true;
				}

				if (var1 == 8 && field211.length() > 0) {
					field211 = field211.substring(0, field211.length() - 1);
					field271 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field239 = false;
					field271 = true;

					if (field144 == 1) {
						long var2 = TGGPOZND.method547(field211);
						method178(var2);
					}

					if (field144 == 2 && field112 > 0) {
						long var4 = TGGPOZND.method547(field211);
						method103(var4);
					}

					if (field144 == 3 && field211.length() > 0) {
						field370.method346(177);
						field370.method347(0);
						int var6 = field370.field1014;
						field370.method353(field114);
						RJLRTDJR.method496(field370, field211);
						field370.method356(field370.field1014 - var6);
						field211 = RJLRTDJR.method497(field211);
						field211 = PRVYVGOX.method451(field211);
						method102(field211, 6, TGGPOZND.method551(TGGPOZND.method548(field114)));

						if (field242 == 2) {
							field242 = 1;
							field439 = true;
							field370.method346(227);
							field370.method347(field288);
							field370.method347(field242);
							field370.method347(field320);
						}
					}

					if (field144 == 4 && field450 < 100) {
						long var7 = TGGPOZND.method547(field211);
						method83(var7);
					}

					if (field144 == 5 && field450 > 0) {
						long var9 = TGGPOZND.method547(field211);
						method63(var9);
					}
				}
			} else if (field471 == 1) {
				if (var1 >= 48 && var1 <= 57 && field294.length() < 10) {
					field294 = field294 + (char) var1;
					field271 = true;
				}

				if (var1 == 8 && field294.length() > 0) {
					field294 = field294.substring(0, field294.length() - 1);
					field271 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field294.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field294);
						} catch (Exception var21) {
						}

						field370.method346(142);
						field370.method351(var11);
					}

					field471 = 0;
					field271 = true;
				}
			} else if (field471 == 2) {
				if (var1 >= 32 && var1 <= 122 && field294.length() < 12) {
					field294 = field294 + (char) var1;
					field271 = true;
				}

				if (var1 == 8 && field294.length() > 0) {
					field294 = field294.substring(0, field294.length() - 1);
					field271 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field294.length() > 0) {
						field370.method346(217);
						field370.method353(TGGPOZND.method547(field294));
					}

					field471 = 0;
					field271 = true;
				}
			} else if (field471 == 3) {
				if (var1 >= 32 && var1 <= 122 && field294.length() < 40) {
					field294 = field294 + (char) var1;
					field271 = true;
				}

				if (var1 == 8 && field294.length() > 0) {
					field294 = field294.substring(0, field294.length() - 1);
					field271 = true;
				}
			} else if (field548 == -1 && field446 == -1) {
				if (var1 >= 32 && var1 <= 122 && field512.length() < 80) {
					field512 = field512 + (char) var1;
					field271 = true;
				}

				if (var1 == 8 && field512.length() > 0) {
					field512 = field512.substring(0, field512.length() - 1);
					field271 = true;
				}

				if ((var1 == 13 || var1 == 10) && field512.length() > 0) {
					if (field377 == 2) {
						if (field512.equals("::clientdrop")) {
							method167();
						}

						if (field512.equals("::lag")) {
							method118();
						}

						if (field512.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field381.method514(2); var12++) {
								field381.method501(2, (byte) 1, var12);
							}
						}

						if (field512.equals("::fpson")) {
							field268 = true;
						}

						if (field512.equals("::fpsoff")) {
							field268 = false;
						}

						if (field512.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field277[var13].field900[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field512.startsWith("::")) {
						field370.method346(58);
						field370.method347(field512.length() - 1);
						field370.method354(field512.substring(2));
					} else {
						String var16 = field512.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field512 = field512.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field512 = field512.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field512 = field512.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field512 = field512.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field512 = field512.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field512 = field512.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field512 = field512.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field512 = field512.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field512 = field512.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field512 = field512.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field512 = field512.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field512 = field512.substring(6);
						}

						String var18 = field512.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field512 = field512.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field512 = field512.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field512 = field512.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field512 = field512.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field512 = field512.substring(6);
						}

						field370.method346(110);
						field370.method347(0);
						int var20 = field370.field1014;
						field529.field1014 = 0;
						RJLRTDJR.method496(field529, field512);
						field370.method355(field529.field1013, field529.field1014, 0);
						field370.method347(var19);
						field370.method374(var17);
						field370.method356(field370.field1014 - var20);
						field512 = RJLRTDJR.method497(field512);
						field512 = PRVYVGOX.method451(field512);
						field459.field804 = field512;
						field459.field786 = var17;
						field459.field787 = var19;
						field459.field839 = 150;

						if (field377 == 2) {
							method102(field459.field804, 2, "@cr2@" + field459.field80);
						} else if (field377 == 1) {
							method102(field459.field804, 2, "@cr1@" + field459.field80);
						} else {
							method102(field459.field804, 2, field459.field80);
						}

						if (field288 == 2) {
							field288 = 3;
							field439 = true;
							field370.method346(227);
							field370.method347(field288);
							field370.method347(field242);
							field370.method347(field320);
						}
					}

					field512 = "";
					field271 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method68(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field219[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field528[var6][var4][var5] + field528[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field528[var6][var4][var5 + 1] + field528[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.g(I)V")
	public final void method69() {
		int var1 = field482;
		int var2 = field483;
		int var3 = field484;
		int var4 = field485;
		int var5 = 0x5D5447;
		FVBHOYJF.method214(var5, var4, var1, var2, var3);
		FVBHOYJF.method214(0, 16, var1 + 1, var2 + 1, var3 - 2);
		FVBHOYJF.method215(var4 - 19, 0, var3 - 2, var2 + 18, var1 + 1);
		field180.method22(var2 + 14, "Choose Option", var1 + 3, var5);
		int var6 = field1115;
		int var7 = field1116;
		if (field481 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field481 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field481 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field230; var8++) {
			int var9 = (field230 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field180.method26(var1 + 3, var9, true, field365[var8], var10);
		}
	}

	public final void run() {
		if (field163) {
			method60();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method70() {
		if (field1108 == null) {
			method137();
			field188 = null;
			field189 = null;
			field190 = null;
			field191 = null;
			field192 = null;
			field193 = null;
			field194 = null;
			field195 = null;
			field196 = null;
			field399 = null;
			field397 = null;
			field396 = null;
			field398 = null;
			field339 = null;
			field340 = null;
			field341 = null;
			field1108 = new ESGPTMPA(503, 765, method119());
			field259 = true;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method71() {
		if (field472 == 2) {
			method152((field155 - field246 << 7) + field158, field156 * 2, (field154 - field245 << 7) + field157);

			if (field505 > -1 && field443 % 20 < 10) {
				field334[0].method233(field505 - 12, field506 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method72(int arg0, String arg1) {
		field522 = arg0;
		field254 = arg1;
		method77();

		if (field533 == null) {
			super.method72(arg0, arg1);
		} else {
			field190.method206();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field180.method18(0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			FVBHOYJF.method215(34, 0x8C1111, 304, var6, var3 / 2 - 152);
			FVBHOYJF.method215(32, 0, 302, var6 + 1, var3 / 2 - 151);
			FVBHOYJF.method214(0x8C1111, 30, var3 / 2 - 150, var6 + 2, arg0 * 3);
			FVBHOYJF.method214(0, 30, arg0 * 3 + var3 / 2 - 150, var6 + 2, 300 - arg0 * 3);
			field180.method18(0xFFFFFF, arg1, var4 / 2 + 5 - var5, var3 / 2);
			field190.method207(field1107, 171, 202);

			if (field259) {
				field259 = false;

				if (!field333) {
					field191.method207(field1107, 0, 0);
					field192.method207(field1107, 0, 637);
				}

				field188.method207(field1107, 0, 128);
				field189.method207(field1107, 371, 202);
				field193.method207(field1107, 265, 0);
				field194.method207(field1107, 265, 562);
				field195.method207(field1107, 171, 128);
				field196.method207(field1107, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method73() {
		field141++;
		method96(true);
		method144(true);
		method96(false);
		method144(false);
		method62();
		method158();

		if (!field170) {
			int var1 = field372;
			if (field517 / 256 > var1) {
				var1 = field517 / 256;
			}

			if (field513[4] && field497[4] + 128 > var1) {
				var1 = field497[4] + 128;
			}

			int var2 = field373 + field212 & 0x7FF;
			method163(var1 * 3 + 600, method68(field459.field829, field459.field828, field395) - 50, field207, var2, var1, field206);
		}

		int var3;
		if (field170) {
			var3 = method116();
		} else {
			var3 = method115();
		}

		int var4 = field314;
		int var5 = field315;
		int var6 = field316;
		int var7 = field317;
		int var8 = field318;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field513[var9]) {
				int var10 = (int) (Math.random() * (field545[var9] * 2 + 1) + Math.sin(field262[var9] / 100.0D * field480[var9]) * field497[var9] - field545[var9]);
				if (var9 == 0) {
					field314 += var10;
				}

				if (var9 == 1) {
					field315 += var10;
				}

				if (var9 == 2) {
					field316 += var10;
				}

				if (var9 == 3) {
					field318 = field318 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field317 += var10;
					if (field317 < 128) {
						field317 = 128;
					}

					if (field317 > 383) {
						field317 = 383;
					}
				}
			}
		}

		int var11 = THHUVKBK.field1422;
		PDVZPZLT.field1192 = true;
		PDVZPZLT.field1195 = 0;
		PDVZPZLT.field1193 = field1115 - 4;
		PDVZPZLT.field1194 = field1116 - 4;
		FVBHOYJF.method212();
		field394.method291(field317, field315, var3, field318, field316, field314);
		field394.method266();
		method172();
		method71();
		method93(var11);
		method187();
		field398.method207(field1107, 4, 4);
		field314 = var4;
		field315 = var5;
		field316 = var6;
		field317 = var7;
		field318 = var8;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method74(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field112; var2++) {
			if (arg0.equalsIgnoreCase(field511[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field459.field80)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method75() {
		if (field519 || field251 || field354) {
			method141();
		} else {
			field312++;

			if (field182) {
				method59();
			} else {
				method143(false);
			}

			field250 = 0;
		}
	}

	@ObfuscatedName("client.a(ILMVHXDWGI;I)V")
	public final void method76(int arg0, MVHXDWGI arg1) {
		arg1.method367();
		int var3 = arg1.method368(8);
		if (var3 < field531) {
			for (int var4 = var3; var4 < field531; var4++) {
				field223[field222++] = field532[var4];
			}
		}

		if (var3 > field531) {
			signlink.reporterror(field426 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field531 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field532[var5];
			ACKJULTZ var7 = field530[var6];
			int var8 = arg1.method368(1);
			if (var8 == 0) {
				field532[field531++] = var6;
				var7.field813 = field443;
			} else {
				int var9 = arg1.method368(2);
				if (var9 == 0) {
					field532[field531++] = var6;
					var7.field813 = field443;
					field135[field134++] = var6;
				} else if (var9 == 1) {
					field532[field531++] = var6;
					var7.field813 = field443;
					int var10 = arg1.method368(3);
					var7.method303(var10, false);
					int var11 = arg1.method368(1);
					if (var11 == 1) {
						field135[field134++] = var6;
					}
				} else if (var9 == 2) {
					field532[field531++] = var6;
					var7.field813 = field443;
					int var12 = arg1.method368(3);
					var7.method303(var12, true);
					int var13 = arg1.method368(3);
					var7.method303(var13, true);
					int var14 = arg1.method368(1);
					if (var14 == 1) {
						field135[field134++] = var6;
					}
				} else if (var9 == 3) {
					field223[field222++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method77() {
		if (field188 == null) {
			field1108 = null;
			field399 = null;
			field397 = null;
			field396 = null;
			field398 = null;
			field339 = null;
			field340 = null;
			field341 = null;
			field191 = new ESGPTMPA(265, 128, method119());
			FVBHOYJF.method212();
			field192 = new ESGPTMPA(265, 128, method119());
			FVBHOYJF.method212();
			field188 = new ESGPTMPA(171, 509, method119());
			FVBHOYJF.method212();
			field189 = new ESGPTMPA(132, 360, method119());
			FVBHOYJF.method212();
			field190 = new ESGPTMPA(200, 360, method119());
			FVBHOYJF.method212();
			field193 = new ESGPTMPA(238, 202, method119());
			FVBHOYJF.method212();
			field194 = new ESGPTMPA(238, 203, method119());
			FVBHOYJF.method212();
			field195 = new ESGPTMPA(94, 74, method119());
			FVBHOYJF.method212();
			field196 = new ESGPTMPA(94, 75, method119());
			FVBHOYJF.method212();

			if (field533 != null) {
				method155();
				method194();
			}

			field259 = true;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method78() {
		for (int var1 = -1; var1 < field132; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field130;
			} else {
				var2 = field133[var1];
			}

			BSQIIHOT var3 = field131[var2];
			if (var3 != null && var3.field839 > 0) {
				var3.field839--;
				if (var3.field839 == 0) {
					var3.field804 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field531; var4++) {
			int var5 = field532[var4];
			ACKJULTZ var6 = field530[var5];
			if (var6 != null && var6.field839 > 0) {
				var6.field839--;
				if (var6.field839 == 0) {
					var6.field804 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method79(String arg0) {
		System.out.println(arg0);

		try {
			getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch (Exception var3) {
			var3.printStackTrace();
		}

		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch (Exception var4) {
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method80() {
		if (field549 != 0) {
			AWMLZOXZ var1 = field179;
			int var2 = 0;
			if (field460 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field516[var3] != null) {
					int var4 = field514[var3];
					String var5 = field515[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field242 == 0 || field242 == 1 && method74(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method22(var7, "From", var8, 0);
						var1.method22(var7 - 1, "From", var8, 0xFFFF);
						int var11 = var8 + var1.method20("From ");
						if (var6 == 1) {
							field336[0].method38(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field336[1].method38(var11, var7 - 12);
							var11 += 14;
						}

						var1.method22(var7, var5 + ": " + field516[var3], var11, 0);
						var1.method22(var7 - 1, var5 + ": " + field516[var3], var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field242 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method22(var9, field516[var3], 4, 0);
						var1.method22(var9 - 1, field516[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field242 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method22(var10, "To " + var5 + ": " + field516[var3], 4, 0);
						var1.method22(var10 - 1, "To " + var5 + ": " + field516[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIILjava/lang/String;I)LIEMHZJLX;")
	public final IEMHZJLX method81(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field313[0] != null) {
				var6 = field313[0].method488(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field496.reset();
			field496.update(var6);
			int var8 = (int) field496.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new IEMHZJLX(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method72(arg2, "Requesting " + arg0);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method176(arg3 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				MVHXDWGI var16 = new MVHXDWGI(var15);
				var16.field1014 = 3;
				int var17 = var16.method361() + 6;
				int var18 = 6;
				var6 = new byte[var17];
				for (int var19 = 0; var19 < 6; var19++) {
					var6[var19] = var15[var19];
				}

				while (var18 < var17) {
					int var20 = var17 - var18;
					if (var20 > 1000) {
						var20 = 1000;
					}

					int var21 = var14.read(var6, var18, var20);
					if (var21 < 0) {
						(new StringBuffer("Length error: ")).append(var18).append("/").append(var17).toString();
						throw new IOException("EOF");
					}

					var18 += var21;
					int var22 = var18 * 100 / var17;
					if (var13 != var22) {
						method72(arg2, "Loading " + arg0 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field313[0] != null) {
						field313[0].method489(arg4, var6.length, var6);
					}
				} catch (Exception var28) {
					field313[0] = null;
				}

				if (var6 != null) {
					field496.reset();
					field496.update(var6);
					int var23 = (int) field496.getValue();
					if (arg1 != var23) {
						var6 = null;
						var10++;
						var11 = "Checksum error: " + var23;
					}
				}
			} catch (IOException var30) {
				if (var11.equals("Unknown error")) {
					var11 = "Connection error";
				}

				var6 = null;
			} catch (NullPointerException var31) {
				var11 = "Null error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var32) {
				var11 = "Bounds error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var33) {
				var11 = "Unexpected error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			}

			if (var6 == null) {
				for (int var25 = var7; var25 > 0; var25--) {
					if (var10 >= 3) {
						method72(arg2, "Game updated - please reload page");
						var25 = 10;
					} else {
						method72(arg2, var11 + " - Retrying in " + var25);
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception var27) {
					}
				}

				var7 *= 2;
				if (var7 > 60) {
					var7 = 60;
				}

				field224 = !field224;
			}
		}

		return new IEMHZJLX(var6);
	}

	@ObfuscatedName("client.g(B)V")
	public final void method82() {
		CUIVWWJO.field550.method588();
		CUIVWWJO.field576.method588();
		LQFHJGYA.field876.method588();
		AGZBBQJK.field31.method588();
		AGZBBQJK.field18.method588();
		BSQIIHOT.field77.method588();
		MBSSGBHW.field939.method588();
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method83(long arg0) {
		if (arg0 != 0L) {
			if (field450 >= 100) {
				method102("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = TGGPOZND.method551(TGGPOZND.method548(arg0));
				for (int var4 = 0; var4 < field450; var4++) {
					if (field145[var4] == arg0) {
						method102(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field112; var5++) {
					if (field210[var5] == arg0) {
						method102("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field145[field450++] = arg0;
				field227 = true;
				field370.method346(104);
				field370.method353(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(LXEHNJCHN;Z)V")
	public final void method84(XEHNJCHN arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1493 == 0) {
			var2 = field394.method278(arg0.field1492, arg0.field1494, arg0.field1495);
		}

		if (arg0.field1493 == 1) {
			var2 = field394.method279(arg0.field1494, arg0.field1495, arg0.field1492);
		}

		if (arg0.field1493 == 2) {
			var2 = field394.method280(arg0.field1492, arg0.field1494, arg0.field1495);
		}

		if (arg0.field1493 == 3) {
			var2 = field394.method281(arg0.field1492, arg0.field1494, arg0.field1495);
		}

		if (var2 != 0) {
			int var6 = field394.method282(arg0.field1492, arg0.field1494, arg0.field1495, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1484 = var3;
		arg0.field1486 = var4;
		arg0.field1485 = var5;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(LMYGSUHVG;I)V")
	public final void method85(MYGSUHVG arg0) {
		int var2 = arg0.field1080;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field113 == 0) {
				arg0.field1073 = "Loading friend list";
				arg0.field1065 = 0;
			} else if (var2 == 1 && field113 == 1) {
				arg0.field1073 = "Connecting to friendserver";
				arg0.field1065 = 0;
			} else if (var2 == 2 && field113 != 2) {
				arg0.field1073 = "Please wait...";
				arg0.field1065 = 0;
			} else {
				int var3 = field112;
				if (field113 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1073 = "";
					arg0.field1065 = 0;
				} else {
					arg0.field1073 = field511[var2];
					arg0.field1065 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field112;
			if (field113 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1073 = "";
				arg0.field1065 = 0;
			} else {
				if (field140[var2] == 0) {
					arg0.field1073 = "@red@Offline";
				} else if (field140[var2] < 200) {
					if (field140[var2] == field326) {
						arg0.field1073 = "@gre@World" + (field140[var2] - 9);
					} else {
						arg0.field1073 = "@yel@World" + (field140[var2] - 9);
					}
				} else if (field140[var2] == field326) {
					arg0.field1073 = "@gre@Classic" + (field140[var2] - 219);
				} else {
					arg0.field1073 = "@yel@Classic" + (field140[var2] - 219);
				}

				arg0.field1065 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field112;
			if (field113 != 2) {
				var5 = 0;
			}

			arg0.field1081 = var5 * 15 + 20;
			if (arg0.field1081 <= arg0.field1034) {
				arg0.field1081 = arg0.field1034 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field113 == 0) {
				arg0.field1073 = "Loading ignore list";
				arg0.field1065 = 0;
			} else if (var2 == 1 && field113 == 0) {
				arg0.field1073 = "Please wait...";
				arg0.field1065 = 0;
			} else {
				int var6 = field450;
				if (field113 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1073 = "";
					arg0.field1065 = 0;
				} else {
					arg0.field1073 = TGGPOZND.method551(TGGPOZND.method548(field145[var2]));
					arg0.field1065 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1081 = field450 * 15 + 20;
			if (arg0.field1081 <= arg0.field1034) {
				arg0.field1081 = arg0.field1034 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1053 = 150;
			arg0.field1054 = (int) (Math.sin(field443 / 40.0D) * 256.0D) & 0x7FF;

			if (field466) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field508[var7];
					if (var8 >= 0 && !LXLAQKAC.field919[var8].method337()) {
						return;
					}
				}

				field466 = false;
				PDVZPZLT[] var9 = new PDVZPZLT[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field508[var11];
					if (var12 >= 0) {
						var9[var10++] = LXLAQKAC.field919[var12].method338();
					}
				}

				PDVZPZLT var13 = new PDVZPZLT(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field301[var14] != 0) {
						var13.method428(field454[var14][0], field454[var14][field301[var14]]);

						if (var14 == 1) {
							var13.method428(field432[0], field432[field301[var14]]);
						}
					}
				}

				var13.method421();
				var13.method422(JZFUUSFN.field841[field459.field832].field843[0]);
				var13.method431(64, 850, -30, -50, -30, true);
				arg0.field1046 = 5;
				arg0.field1047 = 0;
				MYGSUHVG.method394(0, var13, 5);
			}
		} else if (var2 == 324) {
			if (field525 == null) {
				field525 = arg0.field1058;
				field526 = arg0.field1045;
			}

			if (field359) {
				arg0.field1058 = field526;
			} else {
				arg0.field1058 = field525;
			}
		} else if (var2 == 325) {
			if (field525 == null) {
				field525 = arg0.field1058;
				field526 = arg0.field1045;
			}

			if (field359) {
				arg0.field1058 = field525;
			} else {
				arg0.field1058 = field526;
			}
		} else if (var2 == 600) {
			arg0.field1073 = field524;
			if (field443 % 20 < 10) {
				arg0.field1073 = arg0.field1073 + "|";
			} else {
				arg0.field1073 = arg0.field1073 + " ";
			}
		} else if (var2 == 620) {
			if (field377 < 1) {
				arg0.field1073 = "";
			} else if (field498) {
				arg0.field1062 = 0xFF0000;
				arg0.field1073 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1062 = 0xFFFFFF;
				arg0.field1073 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field307 - field229;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1073 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field409 == 0) {
				arg0.field1073 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field409 <= field307) {
				arg0.field1073 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method86(field409);
			} else {
				int var17 = field307 + 14 - field409;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1073 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method86(field409) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field109 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field109 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field109 + " unread messages";
			}

			arg0.field1073 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field379 > 0 && field379 <= field307 + 10) {
				arg0.field1073 = "Last password change:\\n@gre@" + method86(field379);
			} else {
				arg0.field1073 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field360 > 2 && !field328) {
				arg0.field1073 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field360 > 2) {
				arg0.field1073 = "\\n\\nYou have @gre@" + field360 + "@yel@ days of\\nmember credit remaining.";
			} else if (field360 > 0) {
				arg0.field1073 = "You have @gre@" + field360 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1073 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field360 > 2 && !field328) {
				arg0.field1073 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field360 > 0) {
				arg0.field1073 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1073 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field409 > field307) {
				arg0.field1073 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1073 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public final String method86(int arg0) {
		if (arg0 > field307 + 10) {
			return "Unknown";
		}

		long var2 = (arg0 + 11745L) * 86400000L;
		Calendar var4 = Calendar.getInstance();
		var4.setTime(new Date(var2));
		int var5 = var4.get(5);
		int var6 = var4.get(2);
		int var7 = var4.get(1);
		String[] var8 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		return var5 + "-" + var8[var6] + "-" + var7;
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method87(int arg0) {
		int[] var2 = field325.field692;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field219[arg0][var7][var5] & 0x18) == 0) {
					field394.method287(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field219[arg0 + 1][var7][var5] & 0x8) != 0) {
					field394.method287(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field325.method228();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field219[arg0][var11][var10] & 0x18) == 0) {
					method179(var9, var10, arg0, var11, var8);
				}

				if (arg0 < 3 && (field219[arg0 + 1][var11][var10] & 0x8) != 0) {
					method179(var9, var10, arg0 + 1, var11, var8);
				}
			}
		}

		if (field398 != null) {
			field398.method206();
			THHUVKBK.field1413 = field457;
		}

		field273 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field394.method281(field395, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = CUIVWWJO.method203(var14).field569;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field277[field395].field900;
							for (int var21 = 0; var21 < 10; var21++) {
								int var22 = (int) (Math.random() * 4.0D);
								if (var22 == 0 && var16 > 0 && var16 > var12 - 3 && (var20[var16 - 1][var17] & 0x1280108) == 0) {
									var16--;
								}

								if (var22 == 1 && var16 < var18 - 1 && var16 < var12 + 3 && (var20[var16 + 1][var17] & 0x1280180) == 0) {
									var16++;
								}

								if (var22 == 2 && var17 > 0 && var17 > var13 - 3 && (var20[var16][var17 - 1] & 0x1280102) == 0) {
									var17--;
								}

								if (var22 == 3 && var17 < var19 - 1 && var17 < var13 + 3 && (var20[var16][var17 + 1] & 0x1280120) == 0) {
									var17++;
								}
							}
						}

						field391[field273] = field147[var15];
						field274[field273] = var16;
						field275[field273] = var17;
						field273++;
					}
				}
			}
		}

		field504++;
		if (field504 > 88) {
			field504 = 0;
			field370.method346(45);
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method88() {
		field399.method206();
		THHUVKBK.field1413 = field455;
		field431.method38(0, 0);

		if (field239) {
			field180.method18(0, field300, 40, 239);
			field180.method18(128, field211 + "*", 60, 239);
		} else if (field471 == 1) {
			field180.method18(0, "Enter amount:", 40, 239);
			field180.method18(128, field294 + "*", 60, 239);
		} else if (field471 == 2) {
			field180.method18(0, "Enter name:", 40, 239);
			field180.method18(128, field294 + "*", 60, 239);
		} else if (field471 == 3) {
			if (field294 != field234) {
				method170(field294);
				field234 = field294;
			}

			AWMLZOXZ var1 = field179;
			FVBHOYJF.method211(0, 0, 77, 463);

			for (int var2 = 0; var2 < field235; var2++) {
				int var3 = var2 * 14 + 18 - field238;
				if (var3 > 0 && var3 < 110) {
					var1.method18(0, field236[var2], var3, 239);
				}
			}

			FVBHOYJF.method210();

			if (field235 > 5) {
				method182(field238, 463, 77, 0, field235 * 14 + 7);
			}

			if (field294.length() == 0) {
				field180.method18(255, "Enter object name", 40, 239);
			} else if (field235 == 0) {
				field180.method18(0, "No matching objects found, please shorten search", 40, 239);
			}

			var1.method18(0, field294 + "*", 90, 239);
			FVBHOYJF.method217(0, 77, 0, 479);
		} else if (field255 != null) {
			field180.method18(0, field255, 40, 239);
			field180.method18(128, "Click to continue", 60, 239);
		} else if (field548 != -1) {
			method124(MYGSUHVG.method402(field548), 0, 0, 0);
		} else if (field509 == -1) {
			AWMLZOXZ var4 = field179;
			int var5 = 0;
			FVBHOYJF.method211(0, 0, 77, 463);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field516[var6] != null) {
					int var7 = field514[var6];
					int var8 = field293 + 70 - var5 * 14;
					String var9 = field515[var6];
					byte var10 = 0;
					if (var9 != null && var9.startsWith("@cr1@")) {
						var9 = var9.substring(5);
						var10 = 1;
					}

					if (var9 != null && var9.startsWith("@cr2@")) {
						var9 = var9.substring(5);
						var10 = 2;
					}

					if (var7 == 0) {
						if (var8 > 0 && var8 < 110) {
							var4.method22(var8, field516[var6], 4, 0);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field288 == 0 || field288 == 1 && method74(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field336[0].method38(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field336[1].method38(var11, var8 - 12);
								var11 += 14;
							}

							var4.method22(var8, var9 + ":", var11, 0);
							var11 += var4.method20(var9) + 8;
							var4.method22(var8, field516[var6], var11, 255);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field549 == 0 && (var7 == 7 || field242 == 0 || field242 == 1 && method74(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method22(var8, "From", var12, 0);
							int var14 = var12 + var4.method20("From ");
							if (var10 == 1) {
								field336[0].method38(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field336[1].method38(var14, var8 - 12);
								var14 += 14;
							}

							var4.method22(var8, var9 + ":", var14, 0);
							var14 += var4.method20(var9) + 8;
							var4.method22(var8, field516[var6], var14, 0x800000);
						}

						var5++;
					}

					if (var7 == 4 && (field320 == 0 || field320 == 1 && method74(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method22(var8, var9 + " " + field516[var6], 4, 0x800080);
						}

						var5++;
					}

					if (var7 == 5 && field549 == 0 && field242 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method22(var8, field516[var6], 4, 0x800000);
						}

						var5++;
					}

					if (var7 == 6 && field549 == 0 && field242 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method22(var8, "To " + var9 + ":", 4, 0);
							var4.method22(var8, field516[var6], var4.method20("To " + var9) + 12, 0x800000);
						}

						var5++;
					}

					if (var7 == 8 && (field320 == 0 || field320 == 1 && method74(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method22(var8, var9 + " " + field516[var6], 4, 0x7E3200);
						}

						var5++;
					}
				}
			}

			FVBHOYJF.method210();
			field298 = var5 * 14 + 7;
			if (field298 < 78) {
				field298 = 78;
			}

			method182(field298 - field293 - 77, 463, 77, 0, field298);
			String var13;
			if (field459 == null || field459.field80 == null) {
				var13 = TGGPOZND.method551(field426);
			} else {
				var13 = field459.field80;
			}

			var4.method22(90, var13 + ":", 4, 0);
			var4.method22(90, field512 + "*", var4.method20(var13 + ": ") + 6, 255);
			FVBHOYJF.method217(0, 77, 0, 479);
		} else {
			method124(MYGSUHVG.method402(field509), 0, 0, 0);
		}

		if (field278 && field481 == 2) {
			method69();
		}

		field399.method207(field1107, 357, 17);
		field398.method206();
		THHUVKBK.field1413 = field457;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method89(int arg0) {
		int var2 = RIRWXSOT.field1266[arg0].field1274;
		if (var2 != 0) {
			int var3 = field467[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					THHUVKBK.method562(0.9D);
				}

				if (var3 == 2) {
					THHUVKBK.method562(0.8D);
				}

				if (var3 == 3) {
					THHUVKBK.method562(0.7D);
				}

				if (var3 == 4) {
					THHUVKBK.method562(0.6D);
				}

				AGZBBQJK.field18.method588();
				field259 = true;
			}

			if (var2 == 3) {
				boolean var4 = field435;

				if (var3 == 0) {
					method106(0, field435);
					field435 = true;
				}

				if (var3 == 1) {
					method106(-400, field435);
					field435 = true;
				}

				if (var3 == 2) {
					method106(-800, field435);
					field435 = true;
				}

				if (var3 == 3) {
					method106(-1200, field435);
					field435 = true;
				}

				if (var3 == 4) {
					field435 = false;
				}

				if (field435 != var4 && !field329) {
					if (field435) {
						field448 = field306;
						field449 = true;
						field381.method516(2, field448);
					} else {
						method157();
					}

					field369 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field177 = true;
					method134(0);
				}

				if (var3 == 1) {
					field177 = true;
					method134(-400);
				}

				if (var3 == 2) {
					field177 = true;
					method134(-800);
				}

				if (var3 == 3) {
					field177 = true;
					method134(-1200);
				}

				if (var3 == 4) {
					field177 = false;
				}
			}

			if (var2 == 5) {
				field539 = var3;
			}

			if (var2 == 6) {
				field348 = var3;
			}

			if (var2 == 8) {
				field549 = var3;
				field271 = true;
			}

			if (var2 == 9) {
				field257 = var3;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method90() {
		try {
			int var1 = field459.field828 + field126;
			int var2 = field459.field829 + field388;
			if (field206 - var1 < -500 || field206 - var1 > 500 || field207 - var2 < -500 || field207 - var2 > 500) {
				field206 = var1;
				field207 = var2;
			}

			if (field206 != var1) {
				field206 += (var1 - field206) / 16;
			}

			if (field207 != var2) {
				field207 += (var2 - field207) / 16;
			}

			if (field1125[1] == 1) {
				field374 += (-field374 - 24) / 2;
			} else if (field1125[2] == 1) {
				field374 += (24 - field374) / 2;
			} else {
				field374 /= 2;
			}

			if (field1125[3] == 1) {
				field375 += (12 - field375) / 2;
			} else if (field1125[4] == 1) {
				field375 += (-field375 - 12) / 2;
			} else {
				field375 /= 2;
			}

			field373 = field374 / 2 + field373 & 0x7FF;
			field372 += field375 / 2;
			if (field372 < 128) {
				field372 = 128;
			}

			if (field372 > 383) {
				field372 = 383;
			}

			int var3 = field206 >> 7;
			int var4 = field207 >> 7;
			int var5 = method68(field207, field206, field395);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field395;
						if (var9 < 3 && (field219[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field528[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			int var11 = var6 * 192;
			if (var11 > 98048) {
				var11 = 98048;
			}

			if (var11 < 32768) {
				var11 = 32768;
			}

			if (var11 > field517) {
				field517 += (var11 - field517) / 24;
			} else if (var11 < field517) {
				field517 += (var11 - field517) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field459.field828 + "," + field459.field829 + "," + field206 + "," + field207 + "," + field386 + "," + field387 + "," + field245 + "," + field246);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(BILMVHXDWGI;)V")
	public final void method91(int arg0, MVHXDWGI arg1) {
		for (int var3 = 0; var3 < field134; var3++) {
			int var4 = field135[var3];
			BSQIIHOT var5 = field131[var4];
			int var6 = arg1.method357();
			if ((var6 & 0x2) != 0) {
				var6 += arg1.method357() << 8;
			}

			method192(var6, var4, var5, arg1);
		}
	}

	@ObfuscatedName("client.a(BIIILLQFHJGYA;)V")
	public final void method92(int arg0, int arg1, int arg2, LQFHJGYA arg3) {
		if (field230 < 400) {
			if (arg3.field872 != null) {
				arg3 = arg3.method316();
			}

			if (arg3 != null && arg3.field862) {
				String var5 = arg3.field859;
				if (arg3.field866 != 0) {
					var5 = var5 + method156(arg3.field866, field459.field94) + " (level-" + arg3.field866 + ")";
				}

				if (field201 == 1) {
					field365[field230] = "Use " + field205 + " with @yel@" + var5;
					field407[field230] = 416;
					field408[field230] = arg1;
					field405[field230] = arg0;
					field406[field230] = arg2;
					field230++;
				} else if (field350 != 1) {
					if (arg3.field875 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field875[var6] != null && !arg3.field875[var6].equalsIgnoreCase("attack")) {
								field365[field230] = arg3.field875[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field407[field230] = 950;
								}

								if (var6 == 1) {
									field407[field230] = 956;
								}

								if (var6 == 2) {
									field407[field230] = 912;
								}

								if (var6 == 3) {
									field407[field230] = 804;
								}

								if (var6 == 4) {
									field407[field230] = 157;
								}

								field408[field230] = arg1;
								field405[field230] = arg0;
								field406[field230] = arg2;
								field230++;
							}
						}
					}

					if (arg3.field875 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field875[var7] != null && arg3.field875[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field866 > field459.field94) {
									var8 = 2000;
								}

								field365[field230] = arg3.field875[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field407[field230] = var8 + 950;
								}

								if (var7 == 1) {
									field407[field230] = var8 + 956;
								}

								if (var7 == 2) {
									field407[field230] = var8 + 912;
								}

								if (var7 == 3) {
									field407[field230] = var8 + 804;
								}

								if (var7 == 4) {
									field407[field230] = var8 + 157;
								}

								field408[field230] = arg1;
								field405[field230] = arg0;
								field406[field230] = arg2;
								field230++;
							}
						}
					}

					field365[field230] = "Examine @yel@" + var5;
					field407[field230] = 1581;
					field408[field230] = arg1;
					field405[field230] = arg0;
					field406[field230] = arg2;
					field230++;
				} else if ((field352 & 0x2) == 2) {
					field365[field230] = field353 + " @yel@" + var5;
					field407[field230] = 372;
					field408[field230] = arg1;
					field405[field230] = arg0;
					field406[field230] = arg2;
					field230++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method93(int arg0) {
		if (!field329) {
			for (int var2 = 0; var2 < field546.length; var2++) {
				int var3 = field546[var2];
				if (THHUVKBK.field1421[var3] >= arg0) {
					BNGXLHWA var4 = THHUVKBK.field1415[var3];
					int var5 = var4.field70 * var4.field69 - 1;
					int var6 = field520 * var4.field69 * 2;
					byte[] var7 = var4.field67;
					byte[] var8 = field453;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field67 = var8;
					field453 = var7;
					THHUVKBK.method560(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method94() {
		if (field1121 == 1) {
			if (field1122 >= 6 && field1122 <= 106 && field1123 >= 467 && field1123 <= 499) {
				field288 = (field288 + 1) % 4;
				field439 = true;
				field271 = true;
				field370.method346(227);
				field370.method347(field288);
				field370.method347(field242);
				field370.method347(field320);
			}

			if (field1122 >= 135 && field1122 <= 235 && field1123 >= 467 && field1123 <= 499) {
				field242 = (field242 + 1) % 3;
				field439 = true;
				field271 = true;
				field370.method346(227);
				field370.method347(field288);
				field370.method347(field242);
				field370.method347(field320);
			}

			if (field1122 >= 273 && field1122 <= 373 && field1123 >= 467 && field1123 <= 499) {
				field320 = (field320 + 1) % 3;
				field439 = true;
				field271 = true;
				field370.method346(227);
				field370.method347(field288);
				field370.method347(field242);
				field370.method347(field320);
			}

			if (field1122 >= 412 && field1122 <= 512 && field1123 >= 467 && field1123 <= 499) {
				if (field304 == -1) {
					method101();
					field524 = "";
					field498 = false;
					field330 = field304 = MYGSUHVG.field1035;
					return;
				}

				method102("Please close the interface you have open before using 'report abuse'", 0, "");
				return;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1110 != null) {
				return new URL("http://127.0.0.1:" + (field327 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.b(ILMVHXDWGI;I)V")
	public final void method95(int arg0, MVHXDWGI arg1) {
		if (arg0 == 143) {
			int var3 = arg1.method357();
			int var4 = (var3 >> 4 & 0x7) + field534;
			int var5 = (var3 & 0x7) + field535;
			int var6 = arg1.method359();
			int var7 = arg1.method357();
			int var8 = var7 >> 4 & 0xF;
			int var9 = var7 & 0x7;
			if (field459.field834[0] >= var4 - var8 && field459.field834[0] <= var4 + var8 && field459.field835[0] >= var5 - var8 && field459.field835[0] <= var5 + var8 && field177 && !field329 && field291 < 50) {
				field302[field291] = var6;
				field337[field291] = var9;
				field322[field291] = WTXWLORU.field1466[var6];
				field291++;
			}
		}

		if (arg0 == 137) {
			int var10 = arg1.method385();
			int var11 = arg1.method357();
			int var12 = var11 >> 2;
			int var13 = var11 & 0x3;
			int var14 = field412[var12];
			byte var15 = arg1.method378();
			byte var16 = arg1.method379();
			int var17 = arg1.method385();
			byte var18 = arg1.method379();
			byte var19 = arg1.method378();
			int var20 = arg1.method383();
			int var21 = arg1.method385();
			int var22 = arg1.method357();
			int var23 = (var22 >> 4 & 0x7) + field534;
			int var24 = (var22 & 0x7) + field535;
			BSQIIHOT var25;
			if (field390 == var21) {
				var25 = field459;
			} else {
				var25 = field131[var21];
			}

			if (var25 != null) {
				CUIVWWJO var26 = CUIVWWJO.method203(var17);
				int var27 = field528[field395][var23][var24];
				int var28 = field528[field395][var23 + 1][var24];
				int var29 = field528[field395][var23 + 1][var24 + 1];
				int var30 = field528[field395][var23][var24 + 1];
				PDVZPZLT var31 = var26.method205(var12, var13, var27, var28, var29, var30, -1);
				if (var31 != null) {
					method138(-1, var24, var20 + 1, var14, 0, var10 + 1, field395, var23, 0);
					var25.field91 = field443 + var20;
					var25.field92 = field443 + var10;
					var25.field90 = var31;
					int var32 = var26.field554;
					int var33 = var26.field594;
					if (var13 == 1 || var13 == 3) {
						var32 = var26.field594;
						var33 = var26.field554;
					}

					var25.field87 = var23 * 128 + var32 * 64;
					var25.field89 = var24 * 128 + var33 * 64;
					var25.field88 = method68(var25.field89, var25.field87, field395);

					if (var19 > var16) {
						byte var34 = var19;
						var19 = var16;
						var16 = var34;
					}

					if (var18 > var15) {
						byte var35 = var18;
						var18 = var15;
						var15 = var35;
					}

					var25.field96 = var19 + var23;
					var25.field98 = var16 + var23;
					var25.field97 = var18 + var24;
					var25.field99 = var15 + var24;
				}
			}
		}

		if (arg0 == 101) {
			int var36 = arg1.method383();
			int var37 = arg1.method375();
			int var38 = (var37 >> 4 & 0x7) + field534;
			int var39 = (var37 & 0x7) + field535;
			int var40 = arg1.method383();
			if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
				GEPRJOHJ var41 = new GEPRJOHJ();
				var41.field650 = var36;
				var41.field649 = var40;

				if (field364[field395][var38][var39] == null) {
					field364[field395][var38][var39] = new IHMCQRZY();
				}

				field364[field395][var38][var39].method243(var41);
				method160(var38, var39);
			}
		} else if (arg0 == 247) {
			int var42 = arg1.method383();
			int var43 = arg1.method376();
			int var44 = (var43 >> 4 & 0x7) + field534;
			int var45 = (var43 & 0x7) + field535;
			int var46 = arg1.method383();
			int var47 = arg1.method383();
			if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104 && field390 != var47) {
				GEPRJOHJ var48 = new GEPRJOHJ();
				var48.field650 = var46;
				var48.field649 = var42;

				if (field364[field395][var44][var45] == null) {
					field364[field395][var44][var45] = new IHMCQRZY();
				}

				field364[field395][var44][var45].method243(var48);
				method160(var44, var45);
			}
		} else if (arg0 == 243) {
			int var49 = arg1.method376();
			int var50 = (var49 >> 4 & 0x7) + field534;
			int var51 = (var49 & 0x7) + field535;
			int var52 = arg1.method359();
			int var53 = arg1.method357();
			int var54 = var53 >> 2;
			int var55 = var53 & 0x3;
			int var56 = field412[var54];
			if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
				method138(var52, var51, 0, var56, var54, -1, field395, var50, var55);
			}
		} else if (arg0 == 23) {
			int var57 = arg1.method357();
			int var58 = (var57 >> 4 & 0x7) + field534;
			int var59 = (var57 & 0x7) + field535;
			int var60 = arg1.method376();
			int var61 = var60 >> 2;
			int var62 = var60 & 0x3;
			int var63 = field412[var61];
			if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
				method138(-1, var59, 0, var63, var61, -1, field395, var58, var62);
			}
		} else if (arg0 == 94) {
			int var64 = arg1.method375();
			int var65 = (var64 >> 4 & 0x7) + field534;
			int var66 = (var64 & 0x7) + field535;
			int var67 = arg1.method377();
			int var68 = var67 >> 2;
			int var69 = var67 & 0x3;
			int var70 = field412[var68];
			int var71 = arg1.method359();
			if (var65 >= 0 && var66 >= 0 && var65 < 103 && var66 < 103) {
				int var72 = field528[field395][var65][var66];
				int var73 = field528[field395][var65 + 1][var66];
				int var74 = field528[field395][var65 + 1][var66 + 1];
				int var75 = field528[field395][var65][var66 + 1];
				if (var70 == 0) {
					FBXHWYIA var76 = field394.method274(var66, var65, field395);
					if (var76 != null) {
						int var77 = var76.field619 >> 14 & 0x7FFF;
						if (var68 == 2) {
							var76.field617 = new QQWZAYRQ(var73, var71, var77, var74, var69 + 4, 2, false, var72, var75);
							var76.field618 = new QQWZAYRQ(var73, var71, var77, var74, var69 + 1 & 0x3, 2, false, var72, var75);
						} else {
							var76.field617 = new QQWZAYRQ(var73, var71, var77, var74, var69, var68, false, var72, var75);
						}
					}
				}

				if (var70 == 1) {
					FMKEDFDF var78 = field394.method275(field395, var65, var66);
					if (var78 != null) {
						var78.field636 = new QQWZAYRQ(var73, var71, var78.field637 >> 14 & 0x7FFF, var74, 0, 4, false, var72, var75);
					}
				}

				if (var70 == 2) {
					IZPXIEAC var79 = field394.method276(var65, var66, field395);

					if (var68 == 11) {
						var68 = 10;
					}

					if (var79 != null) {
						var79.field712 = new QQWZAYRQ(var73, var71, var79.field720 >> 14 & 0x7FFF, var74, var69, var68, false, var72, var75);
					}
				}

				if (var70 == 3) {
					QDOEJJUO var80 = field394.method277(field395, var66, var65);
					if (var80 != null) {
						var80.field1211 = new QQWZAYRQ(var73, var71, var80.field1212 >> 14 & 0x7FFF, var74, var69, 22, false, var72, var75);
					}
				}
			}
		} else if (arg0 == 4) {
			int var81 = arg1.method357();
			int var82 = (var81 >> 4 & 0x7) + field534;
			int var83 = (var81 & 0x7) + field535;
			int var84 = arg1.method359();
			int var85 = arg1.method357();
			int var86 = arg1.method359();
			if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
				var82 = var82 * 128 + 64;
				var83 = var83 * 128 + 64;
				GOHSICMY var87 = new GOHSICMY(field395, var84, field443, var83, var82, var86, method68(var83, var82, field395) - var85);
				field269.method243(var87);
			}
		} else if (arg0 == 235) {
			int var88 = arg1.method357();
			int var89 = (var88 >> 4 & 0x7) + field534;
			int var90 = (var88 & 0x7) + field535;
			int var91 = var89 + arg1.method358();
			int var92 = var90 + arg1.method358();
			int var93 = arg1.method360();
			int var94 = arg1.method359();
			int var95 = arg1.method357() * 4;
			int var96 = arg1.method357() * 4;
			int var97 = arg1.method359();
			int var98 = arg1.method359();
			int var99 = arg1.method357();
			int var100 = arg1.method357();
			if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104 && var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104 && var94 != 0xFFFF) {
				var89 = var89 * 128 + 64;
				var90 = var90 * 128 + 64;
				var91 = var91 * 128 + 64;
				var92 = var92 * 128 + 64;
				SOQRIJPC var101 = new SOQRIJPC(var96, field395, var94, field443 + var98, method68(var90, var89, field395) - var95, var93, var99, var100, var90, field443 + var97, var89);
				var101.method542(var91, field443 + var97, method68(var92, var91, field395) - var96, var92);
				field335.method243(var101);
			}
		} else if (arg0 == 179) {
			int var102 = arg1.method376();
			int var103 = (var102 >> 4 & 0x7) + field534;
			int var104 = (var102 & 0x7) + field535;
			int var105 = arg1.method359();
			if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
				IHMCQRZY var106 = field364[field395][var103][var104];
				if (var106 != null) {
					for (GEPRJOHJ var107 = (GEPRJOHJ) var106.method246(); var107 != null; var107 = (GEPRJOHJ) var106.method248()) {
						if ((var105 & 0x7FFF) == var107.field650) {
							var107.method589();
							break;
						}
					}

					if (var106.method246() == null) {
						field364[field395][var103][var104] = null;
					}

					method160(var103, var104);
				}
			}
		} else if (arg0 == 93) {
			int var108 = arg1.method357();
			int var109 = (var108 >> 4 & 0x7) + field534;
			int var110 = (var108 & 0x7) + field535;
			int var111 = arg1.method359();
			int var112 = arg1.method359();
			int var113 = arg1.method359();
			if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
				IHMCQRZY var114 = field364[field395][var109][var110];
				if (var114 != null) {
					for (GEPRJOHJ var115 = (GEPRJOHJ) var114.method246(); var115 != null; var115 = (GEPRJOHJ) var114.method248()) {
						if ((var111 & 0x7FFF) == var115.field650 && var115.field649 == var112) {
							var115.field649 = var113;
							break;
						}
					}

					method160(var109, var110);
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method96(boolean arg0) {
		if (field459.field828 >> 7 == field323 && field459.field829 >> 7 == field324) {
			field323 = 0;
		}

		int var2 = field132;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			BSQIIHOT var4;
			int var5;
			if (arg0) {
				var4 = field459;
				var5 = field130 << 14;
			} else {
				var4 = field131[field133[var3]];
				var5 = field133[var3] << 14;
			}

			if (var4 != null && var4.method1()) {
				var4.field79 = false;
				if ((field329 && field132 > 50 || field132 > 200) && !arg0 && var4.field836 == var4.field832) {
					var4.field79 = true;
				}

				int var6 = var4.field828 >> 7;
				int var7 = var4.field829 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field90 == null || field443 < var4.field91 || field443 >= var4.field92) {
						if ((var4.field828 & 0x7F) == 0x40 && (var4.field829 & 0x7F) == 0x40) {
							if (field297[var6][var7] == field141) {
								continue;
							}

							field297[var6][var7] = field141;
						}

						var4.field78 = method68(var4.field829, var4.field828, field395);
						field394.method263(field395, var4.field78, var4.field828, var4, var4.field829, 60, var4.field830, var4.field803, var5);
					} else {
						var4.field79 = false;
						var4.field78 = method68(var4.field829, var4.field828, field395);
						field394.method264(60, var4.field78, var4.field98, var4.field97, var4, var4.field99, var4.field96, var5, field395, var4.field828, var4.field829, var4.field830);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIZ)I")
	public final int method97(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method98(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.m(I)V")
	public final void method99() {
		for (int var1 = 0; var1 < field291; var1++) {
			if (field322[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field302[var1] != field171 || field337[var1] != field411) {
						MVHXDWGI var3 = WTXWLORU.method581(field337[var1], field302[var1]);
						if (System.currentTimeMillis() + var3.field1014 / 22 > field169 / 22 + field319) {
							field169 = var3.field1014;
							field319 = System.currentTimeMillis();

							if (method98(var3.field1014, var3.field1013)) {
								field171 = field302[var1];
								field411 = field337[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method108()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field370.method346(198);
						field370.method348(field302[var1] & 0x7FFF);
					} else {
						field370.method346(198);
						field370.method348(-1);
					}
				}

				if (var2 && field322[var1] != -5) {
					field322[var1] = -5;
				} else {
					field291--;
					for (int var5 = var1; var5 < field291; var5++) {
						field302[var5] = field302[var5 + 1];
						field337[var5] = field337[var5 + 1];
						field322[var5] = field322[var5 + 1];
					}

					var1--;
				}
			} else {
				field322[var1]--;
			}
		}

		if (field369 > 0) {
			field369 -= 20;
			if (field369 < 0) {
				field369 = 0;
			}

			if (field369 == 0 && field435 && !field329) {
				field448 = field306;
				field449 = true;
				field381.method516(2, field448);
				return;
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method100() {
		field466 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field508[var1] = -1;
			for (int var2 = 0; var2 < LXLAQKAC.field918; var2++) {
				if (!LXLAQKAC.field919[var2].field925 && LXLAQKAC.field919[var2].field920 == var1 + (field359 ? 0 : 7)) {
					field508[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method101() {
		field370.method346(71);

		if (field111 != -1) {
			method112(field111);
			field111 = -1;
			field227 = true;
			field197 = false;
			field128 = true;
		}

		if (field548 != -1) {
			method112(field548);
			field548 = -1;
			field271 = true;
			field197 = false;
		}

		if (field446 != -1) {
			method112(field446);
			field446 = -1;
			field259 = true;
		}

		if (field376 != -1) {
			method112(field376);
			field376 = -1;
		}

		if (field304 != -1) {
			method112(field304);
			field304 = -1;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;)V")
	public final void method102(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field509 != -1) {
			field255 = arg0;
			field1121 = 0;
		}

		if (field548 == -1) {
			field271 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field514[var4] = field514[var4 - 1];
			field515[var4] = field515[var4 - 1];
			field516[var4] = field516[var4 - 1];
		}

		field514[0] = arg1;
		field515[0] = arg2;
		field516[0] = arg0;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method103(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field112; var3++) {
				if (field210[var3] == arg0) {
					field112--;
					field227 = true;

					for (int var4 = var3; var4 < field112; var4++) {
						field511[var4] = field511[var4 + 1];
						field140[var4] = field140[var4 + 1];
						field210[var4] = field210[var4 + 1];
					}

					field370.method346(193);
					field370.method353(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method104() {
		try {
			field321 = -1;
			field269.method250();
			field335.method250();
			THHUVKBK.method556();
			method82();
			field394.method252();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field277[var1].method323();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field219[var2][var3][var4] = 0;
					}
				}
			}

			SBZYTIRX var5 = new SBZYTIRX(field528, 104, field219, 104);
			int var6 = field349.length;
			field370.method346(204);

			if (!field486) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field215[var7] >> 8) * 64 - field245;
					int var9 = (field215[var7] & 0xFF) * 64 - field246;
					byte[] var10 = field349[var7];
					if (var10 != null) {
						var5.method531((field386 - 6) * 8, var10, var8, var9, (field387 - 6) * 8, field277);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field215[var11] >> 8) * 64 - field245;
					int var13 = (field215[var11] & 0xFF) * 64 - field246;
					byte[] var14 = field349[var11];
					if (var14 == null && field387 < 800) {
						var5.method536(64, var13, var12, 64);
					}
				}

				field142++;
				if (field142 > 167) {
					field142 = 0;
					field370.method346(75);
					field370.method347(150);
				}

				field370.method346(204);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field240[var15];
					if (var16 != null) {
						int var17 = (field215[var15] >> 8) * 64 - field245;
						int var18 = (field215[var15] & 0xFF) * 64 - field246;
						var5.method529(var16, field277, field394, var17, var18);
					}
				}
			}

			if (field486) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field261[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field215.length; var29++) {
									if (field215[var29] == var28 && field349[var29] != null) {
										var5.method535(field277, (var26 & 0x7) * 8, var24, field349[var29], var20 * 8, var25, (var27 & 0x7) * 8, var21 * 8, var19);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method520(var19, var20 * 8, var21 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field261[0][var30][var31];
						if (var32 == -1) {
							var5.method536(8, var31 * 8, var30 * 8, 8);
						}
					}
				}

				field370.method346(204);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field261[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field215.length; var42++) {
									if (field215[var42] == var41 && field240[var42] != null) {
										var5.method528(field277, field394, var37, var34 * 8, field240[var42], (var39 & 0x7) * 8, var33, var35 * 8, var38, (var40 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field370.method346(204);
			var5.method540(field394, field277);

			if (field398 != null) {
				field398.method206();
				THHUVKBK.field1413 = field457;
			}

			field370.method346(204);
			int var43 = SBZYTIRX.field1335;
			if (var43 > field395) {
				var43 = field395;
			}

			if (var43 < field395 - 1) {
				int var44 = field395 - 1;
			}

			if (field329) {
				field394.method253(SBZYTIRX.field1335);
			} else {
				field394.method253(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method160(var45, var46);
				}
			}

			method122();
		} catch (Exception var59) {
		}

		CUIVWWJO.field550.method588();

		if (field1110 != null) {
			field370.method346(236);
			field370.method351(1057001181);
		}

		if (field329 && signlink.cache_dat != null) {
			int var48 = field381.method514(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field381.method504(var49);
				if ((var50 & 0x79) == 0) {
					PDVZPZLT.method413(var49);
				}
			}
		}

		System.gc();
		THHUVKBK.method557(20);
		field381.method518();
		int var51 = (field386 - 6) / 8 - 1;
		int var52 = (field386 + 6) / 8 + 1;
		int var53 = (field387 - 6) / 8 - 1;
		int var54 = (field387 + 6) / 8 + 1;
		if (field527) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field381.method507(0, var55, var56);
					if (var57 != -1) {
						field381.method517(var57, 3);
					}

					int var58 = field381.method507(1, var55, var56);
					if (var58 != -1) {
						field381.method517(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)Ljava/lang/String;")
	public final String method105() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1110 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method106(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(LMVHXDWGI;IB)V")
	public final void method107(MVHXDWGI arg0, int arg1) {
		int var3 = arg0.method368(8);
		if (var3 < field132) {
			for (int var4 = var3; var4 < field132; var4++) {
				field223[field222++] = field133[var4];
			}
		}

		if (var3 > field132) {
			signlink.reporterror(field426 + " Too many players");
			throw new RuntimeException("eek");
		}

		field132 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field133[var5];
			BSQIIHOT var7 = field131[var6];
			int var8 = arg0.method368(1);
			if (var8 == 0) {
				field133[field132++] = var6;
				var7.field813 = field443;
			} else {
				int var9 = arg0.method368(2);
				if (var9 == 0) {
					field133[field132++] = var6;
					var7.field813 = field443;
					field135[field134++] = var6;
				} else if (var9 == 1) {
					field133[field132++] = var6;
					var7.field813 = field443;
					int var10 = arg0.method368(3);
					var7.method303(var10, false);
					int var11 = arg0.method368(1);
					if (var11 == 1) {
						field135[field134++] = var6;
					}
				} else if (var9 == 2) {
					field133[field132++] = var6;
					var7.field813 = field443;
					int var12 = arg0.method368(3);
					var7.method303(var12, true);
					int var13 = arg0.method368(3);
					var7.method303(var13, true);
					int var14 = arg0.method368(1);
					if (var14 == 1) {
						field135[field134++] = var6;
					}
				} else if (var9 == 3) {
					field223[field222++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)Z")
	public final boolean method108() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(ILMYGSUHVG;IZIIIII)V")
	public final void method109(int arg0, MYGSUHVG arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field200) {
			field218 = 32;
		} else {
			field218 = 0;
		}

		field200 = false;
		if (arg5 >= arg6 && arg5 < arg6 + 16 && arg0 >= arg3 && arg0 < arg3 + 16) {
			arg1.field1086 -= field250 * 4;

			if (arg4 == 1) {
				field227 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field271 = true;
			}
		} else if (arg5 >= arg6 && arg5 < arg6 + 16 && arg0 >= arg2 + arg3 - 16 && arg0 < arg2 + arg3) {
			arg1.field1086 += field250 * 4;

			if (arg4 == 1) {
				field227 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field271 = true;
			}
		} else if (arg5 >= arg6 - field218 && arg5 < arg6 + field218 + 16 && arg0 >= arg3 + 16 && arg0 < arg2 + arg3 - 16 && field250 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg3 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg1.field1086 = (arg7 - arg2) * var10 / var11;

			if (arg4 == 1) {
				field227 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field271 = true;
			}

			field200 = true;
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method110() {
		try {
			if (field363 != null) {
				field363.method574();
			}
		} catch (Exception var2) {
		}

		field363 = null;
		field182 = false;
		field138 = 0;
		field426 = "";
		field427 = "";
		method82();
		field394.method252();

		for (int var1 = 0; var1 < 4; var1++) {
			field277[var1].method323();
		}

		System.gc();
		method157();
		field306 = -1;
		field448 = -1;
		field369 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method111(String arg0, String arg1) {
		if (field398 != null) {
			field398.method206();
			THHUVKBK.field1413 = field457;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field179.method18(0, arg1, var3, 257);
			field179.method18(0xFFFFFF, arg1, var3 - 1, 256);
			var3 += 15;
			if (arg0 != null) {
				field179.method18(0, arg0, var3, 257);
				field179.method18(0xFFFFFF, arg0, var3 - 1, 256);
			}

			field398.method207(field1107, 4, 4);
		} else if (field1108 != null) {
			field1108.method206();
			THHUVKBK.field1413 = field458;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			FVBHOYJF.method214(0, var6, 383 - var5 / 2, var4 - 5 - var6 / 2, var5);
			FVBHOYJF.method215(var6, 0xFFFFFF, var5, var4 - var6 / 2 - 5, 383 - var5 / 2);

			if (arg0 != null) {
				var4 -= 7;
			}

			field179.method18(0, arg1, var4, 383);
			field179.method18(0xFFFFFF, arg1, var4 - 1, 382);
			var4 += 15;
			if (arg0 != null) {
				field179.method18(0, arg0, var4, 383);
				field179.method18(0xFFFFFF, arg0, var4 - 1, 382);
			}

			field1108.method207(field1107, 0, 0);
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method112(int arg0) {
		MYGSUHVG.method403(arg0);
	}

	@ObfuscatedName("client.a(LMYGSUHVG;BI)I")
	public final int method113(MYGSUHVG arg0, int arg1) {
		if (arg0.field1094 == null || arg1 >= arg0.field1094.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field1094[arg1];
			int var4 = 0;
			int var5 = 0;
			byte var6 = 0;
			while (true) {
				int var7 = var3[var5++];
				int var8 = 0;
				byte var9 = 0;

				if (var7 == 0) {
					return var4;
				}

				if (var7 == 1) {
					var8 = field495[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field494[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field139[var3[var5++]];
				}

				if (var7 == 4) {
					MYGSUHVG var10 = MYGSUHVG.method402(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < AGZBBQJK.field44 && (!AGZBBQJK.method11(var11).field24 || field328)) {
						for (int var12 = 0; var12 < var10.field1051.length; var12++) {
							if (var11 + 1 == var10.field1051[var12]) {
								var8 += var10.field1063[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field467[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field366[field494[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field467[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field459.field94;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < ZFYFZSTP.field1512; var13++) {
						if (ZFYFZSTP.field1514[var13]) {
							var8 += field494[var13];
						}
					}
				}

				if (var7 == 10) {
					MYGSUHVG var14 = MYGSUHVG.method402(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < AGZBBQJK.field44 && (!AGZBBQJK.method11(var15).field24 || field328)) {
						for (int var16 = 0; var16 < var14.field1051.length; var16++) {
							if (var14.field1051[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field447;
				}

				if (var7 == 12) {
					var8 = field249;
				}

				if (var7 == 13) {
					int var17 = field467[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					QMAVGSSV var20 = QMAVGSSV.field1234[var19];
					int var21 = var20.field1236;
					int var22 = var20.field1237;
					int var23 = var20.field1238;
					int var24 = field367[var23 - var22];
					var8 = field467[var21] >> var22 & var24;
				}

				if (var7 == 15) {
					var9 = 1;
				}

				if (var7 == 16) {
					var9 = 2;
				}

				if (var7 == 17) {
					var9 = 3;
				}

				if (var7 == 18) {
					var8 = (field459.field828 >> 7) + field245;
				}

				if (var7 == 19) {
					var8 = (field459.field829 >> 7) + field246;
				}

				if (var7 == 20) {
					var8 = var3[var5++];
				}

				if (var9 == 0) {
					if (var6 == 0) {
						var4 += var8;
					}

					if (var6 == 1) {
						var4 -= var8;
					}

					if (var6 == 2 && var8 != 0) {
						var4 /= var8;
					}

					if (var6 == 3) {
						var4 *= var8;
					}

					var6 = 0;
				} else {
					var6 = var9;
				}
			}
		} catch (Exception var25) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(LMVHXDWGI;II)V")
	public final void method114(MVHXDWGI arg0, int arg1) {
		field222 = 0;
		field134 = 0;
		method168(arg1, arg0);
		method107(arg0, arg1);
		method61(arg0, arg1);
		method91(arg1, arg0);

		for (int var3 = 0; var3 < field222; var3++) {
			int var4 = field223[var3];
			if (field443 != field131[var4].field813) {
				field131[var4] = null;
			}
		}

		if (arg0.field1014 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1014 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field132; var5++) {
			if (field131[field133[var5]] == null) {
				signlink.reporterror(field426 + " null entry in pl list - pos:" + var5 + " size:" + field132);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.o(I)I")
	public final int method115() {
		int var1 = 3;
		if (field317 < 310) {
			int var2 = field314 >> 7;
			int var3 = field316 >> 7;
			int var4 = field459.field828 >> 7;
			int var5 = field459.field829 >> 7;

			if ((field219[field395][var2][var3] & 0x4) != 0) {
				var1 = field395;
			}

			int var6;
			if (var4 > var2) {
				var6 = var4 - var2;
			} else {
				var6 = var2 - var4;
			}

			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}

			if (var6 > var7) {
				int var8 = var7 * 0x10000 / var6;
				int var9 = 32768;
				while (var2 != var4) {
					if (var2 < var4) {
						var2++;
					} else if (var2 > var4) {
						var2--;
					}

					if ((field219[field395][var2][var3] & 0x4) != 0) {
						var1 = field395;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field219[field395][var2][var3] & 0x4) != 0) {
							var1 = field395;
						}
					}
				}
			} else {
				int var10 = var6 * 0x10000 / var7;
				int var11 = 32768;
				while (var3 != var5) {
					if (var3 < var5) {
						var3++;
					} else if (var3 > var5) {
						var3--;
					}

					if ((field219[field395][var2][var3] & 0x4) != 0) {
						var1 = field395;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field219[field395][var2][var3] & 0x4) != 0) {
							var1 = field395;
						}
					}
				}
			}
		}

		if ((field219[field395][field459.field828 >> 7][field459.field829 >> 7] & 0x4) != 0) {
			var1 = field395;
		}

		return var1;
	}

	@ObfuscatedName("client.p(I)I")
	public final int method116() {
		int var1 = method68(field316, field314, field395);
		if (var1 - field315 < 800 && (field219[field395][field314 >> 7][field316 >> 7] & 0x4) != 0) {
			return field395;
		}

		return 3;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method117() {
		if (field138 == 0) {
			int var1 = field1105 / 2 - 80;
			int var2 = field1106 / 2 + 20;
			var2 += 20;
			if (field1121 == 1 && field1122 >= var1 - 75 && field1122 <= var1 + 75 && field1123 >= var2 - 20 && field1123 <= var2 + 20) {
				field138 = 3;
				field286 = 0;
			}

			int var3 = field1105 / 2 + 80;
			if (field1121 == 1 && field1122 >= var3 - 75 && field1122 <= var3 + 75 && field1123 >= var2 - 20 && field1123 <= var2 + 20) {
				field403 = "";
				field404 = "Enter your username & password.";
				field138 = 2;
				field286 = 0;
			}
		} else if (field138 == 2) {
			int var4 = field1106 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1121 == 1 && field1123 >= var4 - 15 && field1123 < var4) {
				field286 = 0;
			}

			var4 += 15;
			if (field1121 == 1 && field1123 >= var4 - 15 && field1123 < var4) {
				field286 = 1;
			}

			var4 += 15;
			int var5 = field1105 / 2 - 80;
			int var6 = field1106 / 2 + 50;
			var6 += 20;
			if (field1121 == 1 && field1122 >= var5 - 75 && field1122 <= var5 + 75 && field1123 >= var6 - 20 && field1123 <= var6 + 20) {
				field523 = 0;
				method133(field426, field427, false);

				if (field182) {
					return;
				}
			}

			int var7 = field1105 / 2 + 80;
			if (field1121 == 1 && field1122 >= var7 - 75 && field1122 <= var7 + 75 && field1123 >= var6 - 20 && field1123 <= var6 + 20) {
				field138 = 0;
				field426 = "";
				field427 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method409();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field433.length(); var10++) {
					if (var8 == field433.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field286 == 0) {
					if (var8 == 8 && field426.length() > 0) {
						field426 = field426.substring(0, field426.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field286 = 1;
					}

					if (var9) {
						field426 = field426 + (char) var8;
					}

					if (field426.length() > 12) {
						field426 = field426.substring(0, 12);
					}
				} else if (field286 == 1) {
					if (var8 == 8 && field427.length() > 0) {
						field427 = field427.substring(0, field427.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field286 = 0;
					}

					if (var9) {
						field427 = field427 + (char) var8;
					}

					if (field427.length() > 20) {
						field427 = field427.substring(0, 20);
					}
				}
			}
		} else if (field138 == 3) {
			int var11 = field1105 / 2;
			int var12 = field1106 / 2 + 50;
			var12 += 20;
			if (field1121 == 1 && field1122 >= var11 - 75 && field1122 <= var11 + 75 && field1123 >= var12 - 20 && field1123 <= var12 + 20) {
				field138 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public void method118() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field401);

		if (field381 != null) {
			System.out.println("Od-cycle:" + field381.field1302);
		}

		System.out.println("loop-cycle:" + field443);
		System.out.println("draw-cycle:" + field312);
		System.out.println("ptype:" + field488);
		System.out.println("psize:" + field487);

		if (field363 != null) {
			field363.method579();
		}

		field1104 = true;
	}

	@ObfuscatedName("client.c(I)Ljava/awt/Component;")
	public final Component method119() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1110 != null) {
			return field1110;
		}

		return this;
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public final String method120(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.b(LMYGSUHVG;I)Z")
	public final boolean method121(MYGSUHVG arg0) {
		int var2 = arg0.field1080;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field365[field230] = "Remove @whi@" + arg0.field1073;
				field407[field230] = 199;
				field230++;
				return true;
			}

			return false;
		}

		if (var2 >= 801) {
			var2 -= 701;
		} else if (var2 >= 701) {
			var2 -= 601;
		} else if (var2 >= 101) {
			var2 -= 101;
		} else {
			var2--;
		}

		field365[field230] = "Remove @whi@" + field511[var2];
		field407[field230] = 612;
		field230++;
		field365[field230] = "Message @whi@" + field511[var2];
		field407[field230] = 28;
		field230++;
		return true;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method122() {
		for (XEHNJCHN var1 = (XEHNJCHN) field162.method246(); var1 != null; var1 = (XEHNJCHN) field162.method248()) {
			if (var1.field1491 == -1) {
				var1.field1490 = 0;
				method84(var1);
			} else {
				var1.method589();
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 365);

			if (arg0.length == 5) {
				field326 = Integer.parseInt(arg0[0]);
				field327 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method164();
				} else if (arg0[2].equals("highmem")) {
					method142();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field328 = false;
				} else if (arg0[3].equals("members")) {
					field328 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method405(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(ILMYGSUHVG;)Z")
	public final boolean method123(MYGSUHVG arg0) {
		int var2 = arg0.field1080;
		if (field113 == 2) {
			if (var2 == 201) {
				field271 = true;
				field471 = 0;
				field239 = true;
				field211 = "";
				field144 = 1;
				field300 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field271 = true;
				field471 = 0;
				field239 = true;
				field211 = "";
				field144 = 2;
				field300 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field491 = 250;
			return true;
		}

		if (var2 == 501) {
			field271 = true;
			field471 = 0;
			field239 = true;
			field211 = "";
			field144 = 4;
			field300 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field271 = true;
			field471 = 0;
			field239 = true;
			field211 = "";
			field144 = 5;
			field300 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field508[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = LXLAQKAC.field918 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= LXLAQKAC.field918) {
							var5 = 0;
						}
					}

					if (!LXLAQKAC.field919[var5].field925 && LXLAQKAC.field919[var5].field920 == var3 + (field359 ? 0 : 7)) {
						break;
					}
				}

				field508[var3] = var5;
				field466 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field301[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field454[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field454[var6].length) {
					var8 = 0;
				}
			}

			field301[var6] = var8;
			field466 = true;
		}

		if (var2 == 324 && !field359) {
			field359 = true;
			method100();
		}

		if (var2 == 325 && field359) {
			field359 = false;
			method100();
		}

		if (var2 == 326) {
			field370.method346(44);
			field370.method347(field359 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field370.method347(field508[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field370.method347(field301[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field498 = !field498;
		}

		if (var2 >= 601 && var2 <= 613) {
			method101();

			if (field524.length() > 0) {
				field370.method346(154);
				field370.method353(TGGPOZND.method547(field524));
				field370.method347(var2 - 601);
				field370.method347(field498 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(LMYGSUHVG;IIII)V")
	public final void method124(MYGSUHVG arg0, int arg1, int arg2, int arg3) {
		if (arg0.field1090 == 0 && arg0.field1064 != null && (!arg0.field1095 || field226 == arg0.field1075 || field176 == arg0.field1075 || field263 == arg0.field1075)) {
			int var5 = FVBHOYJF.field644;
			int var6 = FVBHOYJF.field642;
			int var7 = FVBHOYJF.field645;
			int var8 = FVBHOYJF.field643;
			FVBHOYJF.method211(arg2, arg3, arg0.field1034 + arg2, arg0.field1038 + arg3);
			int var9 = arg0.field1064.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field1030[var10] + arg3;
				int var12 = arg0.field1032[var10] + arg2 - arg1;
				MYGSUHVG var13 = MYGSUHVG.method402(arg0.field1064[var10]);
				var11 += var13.field1069;
				var12 += var13.field1041;

				if (var13.field1080 > 0) {
					method85(var13);
				}

				if (var13.field1090 == 0) {
					if (var13.field1086 > var13.field1081 - var13.field1034) {
						var13.field1086 = var13.field1081 - var13.field1034;
					}

					if (var13.field1086 < 0) {
						var13.field1086 = 0;
					}

					method124(var13, var13.field1086, var12, var11);

					if (var13.field1081 > var13.field1034) {
						method182(var13.field1086, var13.field1038 + var11, var13.field1034, var12, var13.field1081);
					}
				} else if (var13.field1090 != 1) {
					if (var13.field1090 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1034; var15++) {
							for (int var16 = 0; var16 < var13.field1038; var16++) {
								int var17 = (var13.field1029 + 32) * var16 + var11;
								int var18 = (var13.field1072 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1028[var14];
									var18 += var13.field1067[var14];
								}

								if (var13.field1051[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1051[var14] - 1;
									if (var17 > FVBHOYJF.field644 - 32 && var17 < FVBHOYJF.field645 && var18 > FVBHOYJF.field642 - 32 && var18 < FVBHOYJF.field643 || field281 != 0 && field280 == var14) {
										int var22 = 0;
										if (field201 == 1 && field202 == var14 && field203 == var13.field1075) {
											var22 = 0xFFFFFF;
										}

										IBHUFTPE var23 = AGZBBQJK.method12(var22, var13.field1063[var14], var21);
										if (var23 != null) {
											if (field281 != 0 && field280 == var14 && field279 == var13.field1075) {
												var19 = field1115 - field282;
												var20 = field1116 - field283;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field161 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method235(var18 + var20, 128, var17 + var19);

												if (var18 + var20 < FVBHOYJF.field642 && arg0.field1086 > 0) {
													int var24 = (FVBHOYJF.field642 - var18 - var20) * field520 / 3;
													if (var24 > field520 * 10) {
														var24 = field520 * 10;
													}

													if (var24 > arg0.field1086) {
														var24 = arg0.field1086;
													}

													arg0.field1086 -= var24;
													field283 += var24;
												}

												if (var18 + var20 + 32 > FVBHOYJF.field643 && arg0.field1086 < arg0.field1081 - arg0.field1034) {
													int var25 = (var18 + var20 + 32 - FVBHOYJF.field643) * field520 / 3;
													if (var25 > field520 * 10) {
														var25 = field520 * 10;
													}

													if (var25 > arg0.field1081 - arg0.field1034 - arg0.field1086) {
														var25 = arg0.field1081 - arg0.field1034 - arg0.field1086;
													}

													arg0.field1086 += var25;
													field283 -= var25;
												}
											} else if (field385 != 0 && field384 == var14 && field383 == var13.field1075) {
												var23.method235(var18, 128, var17);
											} else {
												var23.method233(var17, var18);
											}

											if (var23.field697 == 33 || var13.field1063[var14] != 1) {
												int var26 = var13.field1063[var14];
												field178.method22(var18 + var20 + 10, method180(var26), var17 + var19 + 1, 0);
												field178.method22(var18 + var20 + 9, method180(var26), var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field1088 != null && var14 < 20) {
									IBHUFTPE var27 = var13.field1088[var14];
									if (var27 != null) {
										var27.method233(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1090 == 3) {
						boolean var28 = false;
						if (field263 == var13.field1075 || field176 == var13.field1075 || field226 == var13.field1075) {
							var28 = true;
						}

						int var29;
						if (method175(var13)) {
							var29 = var13.field1026;
							if (var28 && var13.field1066 != 0) {
								var29 = var13.field1066;
							}
						} else {
							var29 = var13.field1062;
							if (var28 && var13.field1091 != 0) {
								var29 = var13.field1091;
							}
						}

						if (var13.field1098 == 0) {
							if (var13.field1097) {
								FVBHOYJF.method214(var29, var13.field1034, var11, var12, var13.field1038);
							} else {
								FVBHOYJF.method215(var13.field1034, var29, var13.field1038, var12, var11);
							}
						} else if (var13.field1097) {
							FVBHOYJF.method213(var29, var12, var13.field1038, 256 - (var13.field1098 & 0xFF), var11, var13.field1034);
						} else {
							FVBHOYJF.method216(var11, var29, 256 - (var13.field1098 & 0xFF), var13.field1034, var13.field1038, var12);
						}
					} else if (var13.field1090 == 4) {
						AWMLZOXZ var30 = var13.field1084;
						String var31 = var13.field1073;
						boolean var32 = false;
						if (field263 == var13.field1075 || field176 == var13.field1075 || field226 == var13.field1075) {
							var32 = true;
						}

						int var33;
						if (method175(var13)) {
							var33 = var13.field1026;
							if (var32 && var13.field1066 != 0) {
								var33 = var13.field1066;
							}

							if (var13.field1040.length() > 0) {
								var31 = var13.field1040;
							}
						} else {
							var33 = var13.field1062;
							if (var32 && var13.field1091 != 0) {
								var33 = var13.field1091;
							}
						}

						if (var13.field1065 == 6 && field197) {
							var31 = "Please wait...";
							var33 = var13.field1062;
						}

						if (FVBHOYJF.field640 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field64 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method120(method113(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method120(method113(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method120(method113(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method120(method113(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method120(method113(var13, 4)) + var31.substring(var39 + 2);
								}
							}

							int var40 = var31.indexOf("\\n");
							String var41;
							if (var40 == -1) {
								var41 = var31;
								var31 = "";
							} else {
								var41 = var31.substring(0, var40);
								var31 = var31.substring(var40 + 2);
							}

							if (var13.field1027) {
								var30.method19(var41, var13.field1074, var34, var33, var13.field1038 / 2 + var11);
							} else {
								var30.method26(var11, var34, var13.field1074, var41, var33);
							}

							var34 += var30.field64;
						}
					} else if (var13.field1090 == 5) {
						IBHUFTPE var42;
						if (method175(var13)) {
							var42 = var13.field1045;
						} else {
							var42 = var13.field1058;
						}

						if (var42 != null) {
							var42.method233(var11, var12);
						}
					} else if (var13.field1090 == 6) {
						int var43 = THHUVKBK.field1407;
						int var44 = THHUVKBK.field1408;
						THHUVKBK.field1407 = var13.field1038 / 2 + var11;
						THHUVKBK.field1408 = var13.field1034 / 2 + var12;
						int var45 = THHUVKBK.field1411[var13.field1053] * var13.field1052 >> 16;
						int var46 = THHUVKBK.field1412[var13.field1053] * var13.field1052 >> 16;
						boolean var47 = method175(var13);
						int var48;
						if (var47) {
							var48 = var13.field1061;
						} else {
							var48 = var13.field1060;
						}

						PDVZPZLT var49;
						if (var48 == -1) {
							var49 = var13.method400(var47, -1, -1);
						} else {
							JZFUUSFN var50 = JZFUUSFN.field841[var48];
							var49 = var13.method400(var47, var50.field843[var13.field1059], var50.field844[var13.field1059]);
						}

						if (var49 != null) {
							var49.method435(0, var13.field1054, 0, var13.field1053, 0, var45, var46);
						}

						THHUVKBK.field1407 = var43;
						THHUVKBK.field1408 = var44;
					} else {
						if (var13.field1090 == 7) {
							AWMLZOXZ var51 = var13.field1084;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1034; var53++) {
								for (int var54 = 0; var54 < var13.field1038; var54++) {
									if (var13.field1051[var52] > 0) {
										AGZBBQJK var55 = AGZBBQJK.method11(var13.field1051[var52] - 1);
										String var56 = String.valueOf(var55.field40);
										if (var55.field13 || var13.field1063[var52] != 1) {
											var56 = var56 + " x" + method188(var13.field1063[var52]);
										}

										int var57 = (var13.field1029 + 115) * var54 + var11;
										int var58 = (var13.field1072 + 12) * var53 + var12;
										if (var13.field1027) {
											var51.method19(var56, var13.field1074, var58, var13.field1062, var13.field1038 / 2 + var57);
										} else {
											var51.method26(var57, var58, var13.field1074, var56, var13.field1062);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1090 == 8 && (field115 == var13.field1075 || field276 == var13.field1075 || field185 == var13.field1075) && field378 == 100) {
							int var59 = 0;
							int var60 = 0;
							AWMLZOXZ var61 = field179;
							String var62 = var13.field1073;
							while (var62.length() > 0) {
								int var63 = var62.indexOf("\\n");
								String var64;
								if (var63 == -1) {
									var64 = var62;
									var62 = "";
								} else {
									var64 = var62.substring(0, var63);
									var62 = var62.substring(var63 + 2);
								}

								int var65 = var61.method20(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field64 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1038 + var11 - var59 - 5;
							int var67 = var13.field1034 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg0.field1038 + arg3) {
								var66 = arg0.field1038 + arg3 - var59;
							}

							if (var60 + var67 > arg0.field1034 + arg2) {
								var67 = arg0.field1034 + arg2 - var60;
							}

							FVBHOYJF.method214(0xFFFFA0, var60, var66, var67, var59);
							FVBHOYJF.method215(var60, 0, var59, var67, var66);
							String var68 = var13.field1073;
							int var69 = var61.field64 + var67 + 2;
							while (var68.length() > 0) {
								int var70 = var68.indexOf("\\n");
								String var71;
								if (var70 == -1) {
									var71 = var68;
									var68 = "";
								} else {
									var71 = var68.substring(0, var70);
									var68 = var68.substring(var70 + 2);
								}

								var61.method26(var66 + 3, var69, false, var71, 0);
								var69 += var61.field64 + 1;
							}
						}
					}
				}
			}

			FVBHOYJF.method211(var6, var5, var8, var7);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method125() {
		int var1 = 5;
		field253[8] = 0;
		int var2 = 0;
		while (field253[8] == 0) {
			String var3 = "Unknown problem";
			method72(20, "Connecting to web server");

			try {
				DataInputStream var4 = method176("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 365);
				MVHXDWGI var5 = new MVHXDWGI(new byte[40]);
				var4.readFully(var5.field1013, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field253[var6] = var5.method362();
				}

				int var7 = var5.method362();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field253[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field253[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field253[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field253[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field253[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field253[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method72(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method72(10, var3 + " - Will retry in " + var10 + " secs.");
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception var11) {
					}
				}

				var1 *= 2;
				if (var1 > 60) {
					var1 = 60;
				}

				field224 = !field224;
			}
		}
	}

	@ObfuscatedName("client.a(ZLIBHUFTPE;II)V")
	public final void method126(IBHUFTPE arg0, int arg1, int arg2) {
		if (arg0 != null) {
			int var4 = field373 + field232 & 0x7FF;
			int var5 = arg1 * arg1 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = PDVZPZLT.field1197[var4];
				int var7 = PDVZPZLT.field1198[var4];
				var6 = var6 * 256 / (field357 + 256);
				var7 = var7 * 256 / (field357 + 256);
				int var8 = arg1 * var6 + arg2 * var7 >> 16;
				int var9 = arg1 * var7 - arg2 * var6 >> 16;
				if (var5 > 2500) {
					arg0.method239(field430, 83 - var9 - arg0.field698 / 2 - 4, var8 + 94 - arg0.field697 / 2 + 4);
				} else {
					arg0.method233(var8 + 94 + 4 - arg0.field697 / 2, 83 - var9 - arg0.field698 / 2 - 4);
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method127() {
		if (field1121 == 1) {
			if (field1122 >= 539 && field1122 <= 573 && field1123 >= 169 && field1123 < 205 && field284[0] != -1) {
				field227 = true;
				field338 = 0;
				field128 = true;
			}

			if (field1122 >= 569 && field1122 <= 599 && field1123 >= 168 && field1123 < 205 && field284[1] != -1) {
				field227 = true;
				field338 = 1;
				field128 = true;
			}

			if (field1122 >= 597 && field1122 <= 627 && field1123 >= 168 && field1123 < 205 && field284[2] != -1) {
				field227 = true;
				field338 = 2;
				field128 = true;
			}

			if (field1122 >= 625 && field1122 <= 669 && field1123 >= 168 && field1123 < 203 && field284[3] != -1) {
				field227 = true;
				field338 = 3;
				field128 = true;
			}

			if (field1122 >= 666 && field1122 <= 696 && field1123 >= 168 && field1123 < 205 && field284[4] != -1) {
				field227 = true;
				field338 = 4;
				field128 = true;
			}

			if (field1122 >= 694 && field1122 <= 724 && field1123 >= 168 && field1123 < 205 && field284[5] != -1) {
				field227 = true;
				field338 = 5;
				field128 = true;
			}

			if (field1122 >= 722 && field1122 <= 756 && field1123 >= 169 && field1123 < 205 && field284[6] != -1) {
				field227 = true;
				field338 = 6;
				field128 = true;
			}

			if (field1122 >= 540 && field1122 <= 574 && field1123 >= 466 && field1123 < 502 && field284[7] != -1) {
				field227 = true;
				field338 = 7;
				field128 = true;
			}

			if (field1122 >= 572 && field1122 <= 602 && field1123 >= 466 && field1123 < 503 && field284[8] != -1) {
				field227 = true;
				field338 = 8;
				field128 = true;
			}

			if (field1122 >= 599 && field1122 <= 629 && field1123 >= 466 && field1123 < 503 && field284[9] != -1) {
				field227 = true;
				field338 = 9;
				field128 = true;
			}

			if (field1122 >= 627 && field1122 <= 671 && field1123 >= 467 && field1123 < 502 && field284[10] != -1) {
				field227 = true;
				field338 = 10;
				field128 = true;
			}

			if (field1122 >= 669 && field1122 <= 699 && field1123 >= 466 && field1123 < 503 && field284[11] != -1) {
				field227 = true;
				field338 = 11;
				field128 = true;
			}

			if (field1122 >= 696 && field1122 <= 726 && field1123 >= 466 && field1123 < 503 && field284[12] != -1) {
				field227 = true;
				field338 = 12;
				field128 = true;
			}

			if (field1122 >= 724 && field1122 <= 758 && field1123 >= 466 && field1123 < 502 && field284[13] != -1) {
				field227 = true;
				field338 = 13;
				field128 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIILMYGSUHVG;)V")
	public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, MYGSUHVG arg6) {
		if (arg6.field1090 == 0 && arg6.field1064 != null && !arg6.field1095 && (arg3 >= arg1 && arg5 >= arg4 && arg3 <= arg6.field1038 + arg1 && arg5 <= arg6.field1034 + arg4)) {
			int var8 = arg6.field1064.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg6.field1030[var9] + arg1;
				int var11 = arg6.field1032[var9] + arg4 - arg0;
				MYGSUHVG var12 = MYGSUHVG.method402(arg6.field1064[var9]);
				var10 += var12.field1069;
				var11 += var12.field1041;
				if ((var12.field1068 >= 0 || var12.field1091 != 0) && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field1038 + var10 && arg5 < var12.field1034 + var11) {
					if (var12.field1068 >= 0) {
						field434 = var12.field1068;
					} else {
						field434 = var12.field1075;
					}
				}

				if (var12.field1090 == 8 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field1038 + var10 && arg5 < var12.field1034 + var11) {
					field220 = var12.field1075;
				}

				if (var12.field1090 == 0) {
					method128(var12.field1086, var10, arg2, arg3, var11, arg5, var12);

					if (var12.field1081 > var12.field1034) {
						method109(arg5, var12, var12.field1034, var11, arg2, arg3, var12.field1038 + var10, var12.field1081);
					}
				} else {
					if (var12.field1065 == 1 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field1038 + var10 && arg5 < var12.field1034 + var11) {
						boolean var13 = false;
						if (var12.field1080 != 0) {
							var13 = method121(var12);
						}

						if (!var13) {
							field365[field230] = var12.field1082;
							field407[field230] = 639;
							field406[field230] = var12.field1075;
							field230++;
						}
					}

					if (var12.field1065 == 2 && field350 == 0 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field1038 + var10 && arg5 < var12.field1034 + var11) {
						String var14 = var12.field1085;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field365[field230] = var14 + " @gre@" + var12.field1042;
						field407[field230] = 201;
						field406[field230] = var12.field1075;
						field230++;
					}

					if (var12.field1065 == 3 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field1038 + var10 && arg5 < var12.field1034 + var11) {
						field365[field230] = "Close";

						if (arg2 == 3) {
							field407[field230] = 141;
						} else {
							field407[field230] = 78;
						}

						field406[field230] = var12.field1075;
						field230++;
					}

					if (var12.field1065 == 4 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field1038 + var10 && arg5 < var12.field1034 + var11) {
						field365[field230] = var12.field1082;
						field407[field230] = 600;
						field406[field230] = var12.field1075;
						field230++;
					}

					if (var12.field1065 == 5 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field1038 + var10 && arg5 < var12.field1034 + var11) {
						field365[field230] = var12.field1082;
						field407[field230] = 645;
						field406[field230] = var12.field1075;
						field230++;
					}

					if (var12.field1065 == 6 && !field197 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field1038 + var10 && arg5 < var12.field1034 + var11) {
						field365[field230] = var12.field1082;
						field407[field230] = 253;
						field406[field230] = var12.field1075;
						field230++;
					}

					if (var12.field1090 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1034; var16++) {
							for (int var17 = 0; var17 < var12.field1038; var17++) {
								int var18 = (var12.field1029 + 32) * var17 + var10;
								int var19 = (var12.field1072 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1028[var15];
									var19 += var12.field1067[var15];
								}

								if (arg3 >= var18 && arg5 >= var19 && arg3 < var18 + 32 && arg5 < var19 + 32) {
									field295 = var15;
									field296 = var12.field1075;

									if (var12.field1051[var15] > 0) {
										AGZBBQJK var20 = AGZBBQJK.method11(var12.field1051[var15] - 1);
										if (field201 == 1 && var12.field1044) {
											if (field203 != var12.field1075 || field202 != var15) {
												field365[field230] = "Use " + field205 + " with @lre@" + var20.field40;
												field407[field230] = 878;
												field408[field230] = var20.field27;
												field405[field230] = var15;
												field406[field230] = var12.field1075;
												field230++;
											}
										} else if (field350 != 1 || !var12.field1044) {
											if (var12.field1044) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field11 != null && var20.field11[var21] != null) {
														field365[field230] = var20.field11[var21] + " @lre@" + var20.field40;

														if (var21 == 3) {
															field407[field230] = 635;
														}

														if (var21 == 4) {
															field407[field230] = 139;
														}

														field408[field230] = var20.field27;
														field405[field230] = var15;
														field406[field230] = var12.field1075;
														field230++;
													} else if (var21 == 4) {
														field365[field230] = "Drop @lre@" + var20.field40;
														field407[field230] = 139;
														field408[field230] = var20.field27;
														field405[field230] = var15;
														field406[field230] = var12.field1075;
														field230++;
													}
												}
											}

											if (var12.field1057) {
												field365[field230] = "Use @lre@" + var20.field40;
												field407[field230] = 25;
												field408[field230] = var20.field27;
												field405[field230] = var15;
												field406[field230] = var12.field1075;
												field230++;
											}

											if (var12.field1044 && var20.field11 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field11[var22] != null) {
														field365[field230] = var20.field11[var22] + " @lre@" + var20.field40;

														if (var22 == 0) {
															field407[field230] = 176;
														}

														if (var22 == 1) {
															field407[field230] = 212;
														}

														if (var22 == 2) {
															field407[field230] = 592;
														}

														field408[field230] = var20.field27;
														field405[field230] = var15;
														field406[field230] = var12.field1075;
														field230++;
													}
												}
											}

											if (var12.field1078 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1078[var23] != null) {
														field365[field230] = var12.field1078[var23] + " @lre@" + var20.field40;

														if (var23 == 0) {
															field407[field230] = 872;
														}

														if (var23 == 1) {
															field407[field230] = 348;
														}

														if (var23 == 2) {
															field407[field230] = 881;
														}

														if (var23 == 3) {
															field407[field230] = 829;
														}

														if (var23 == 4) {
															field407[field230] = 497;
														}

														field408[field230] = var20.field27;
														field405[field230] = var15;
														field406[field230] = var12.field1075;
														field230++;
													}
												}
											}

											field365[field230] = "Examine @lre@" + var20.field40;
											field407[field230] = 1169;
											field408[field230] = var20.field27;
											field405[field230] = var15;
											field406[field230] = var12.field1075;
											field230++;
										} else if ((field352 & 0x10) == 0x10) {
											field365[field230] = field353 + " @lre@" + var20.field40;
											field407[field230] = 200;
											field408[field230] = var20.field27;
											field405[field230] = var15;
											field406[field230] = var12.field1075;
											field230++;
										}
									}
								}

								var15++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method129() {
		while (true) {
			HSCHLCCN var1 = field381.method509();
			if (var1 == null) {
				return;
			}

			if (var1.field688 == 0) {
				PDVZPZLT.method412(var1.field690, var1.field689);

				if ((field381.method504(var1.field690) & 0x62) != 0) {
					field227 = true;

					if (field548 != -1 || field509 != -1) {
						field271 = true;
					}
				}
			}

			if (var1.field688 == 1 && var1.field689 != null) {
				YPRWORMV.method599(var1.field689);
			}

			if (var1.field688 == 2 && field448 == var1.field690 && var1.field689 != null) {
				method136(var1.field689, field449);
			}

			if (var1.field688 == 3 && field289 == 1) {
				for (int var2 = 0; var2 < field349.length; var2++) {
					if (field216[var2] == var1.field690) {
						field349[var2] = var1.field689;

						if (var1.field689 == null) {
							field216[var2] = -1;
						}

						break;
					}

					if (field217[var2] == var1.field690) {
						field240[var2] = var1.field689;

						if (var1.field689 == null) {
							field217[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field688 == 93 && field381.method513(var1.field690)) {
				SBZYTIRX.method539(field381, new MVHXDWGI(var1.field689));
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method130() {
		if (field460 > 1) {
			field460--;
		}

		if (field491 > 0) {
			field491--;
		}

		for (int var1 = 0; var1 < 5 && method171(); var1++) {
		}

		if (field182) {
			synchronized (field272.field1502) {
				if (!field436) {
					field272.field1498 = 0;
				} else if (field1121 != 0 || field272.field1498 >= 40) {
					field370.method346(156);
					field370.method347(0);
					int var3 = field370.field1014;
					int var4 = 0;
					for (int var5 = 0; var5 < field272.field1498 && var3 - field370.field1014 < 240; var5++) {
						var4++;
						int var6 = field272.field1497[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field272.field1501[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field272.field1497[var5] == -1 && field272.field1501[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field536 != var7 || field537 != var6) {
							int var9 = var7 - field536;
							field536 = var7;
							int var10 = var6 - field537;
							field537 = var6;

							if (field393 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field370.method348((field393 << 12) + (var9 << 6) + var10);
								field393 = 0;
							} else if (field393 < 8) {
								field370.method350((field393 << 19) + var8 + 0x800000);
								field393 = 0;
							} else {
								field370.method351((field393 << 19) + var8 - 0x40000000);
								field393 = 0;
							}
						} else if (field393 < 2047) {
							field393++;
						}
					}

					field370.method356(field370.field1014 - var3);

					if (var4 >= field272.field1498) {
						field272.field1498 = 0;
					} else {
						field272.field1498 -= var4;
						for (int var11 = 0; var11 < field272.field1498; var11++) {
							field272.field1501[var11] = field272.field1501[var4 + var11];
							field272.field1497[var11] = field272.field1497[var4 + var11];
						}
					}
				}
			}

			if (field1121 != 0) {
				long var12 = (field1124 - field256) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field256 = field1124;
				int var14 = field1123;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1122;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1121 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field370.method346(127);
				field370.method388((var17 << 19) + (var18 << 20) + var16);
			}

			if (field208 > 0) {
				field208--;
			}

			if (field1125[1] == 1 || field1125[2] == 1 || field1125[3] == 1 || field1125[4] == 1) {
				field209 = true;
			}

			if (field209 && field208 <= 0) {
				field208 = 20;
				field209 = false;
				field370.method346(82);
				field370.method381(field372);
				field370.method348(field373);
			}

			if (field1112 && !field148) {
				field148 = true;
				field370.method346(163);
				field370.method347(1);
			}

			if (!field1112 && field148) {
				field148 = false;
				field370.method346(163);
				field370.method347(0);
			}

			method64();
			method132();
			method99();
			field489++;
			if (field489 > 750) {
				method167();
			}

			method166();
			method52();
			method78();
			field520++;

			if (field267 != 0) {
				field266 += 20;
				if (field266 >= 400) {
					field267 = 0;
				}
			}

			if (field385 != 0) {
				field382++;
				if (field382 >= 15) {
					if (field385 == 2) {
						field227 = true;
					}

					if (field385 == 3) {
						field271 = true;
					}

					field385 = 0;
				}
			}

			if (field281 != 0) {
				field161++;

				if (field1115 > field282 + 5 || field1115 < field282 - 5 || field1116 > field283 + 5 || field1116 < field283 - 5) {
					field518 = true;
				}

				if (field1114 == 0) {
					if (field281 == 2) {
						field227 = true;
					}

					if (field281 == 3) {
						field271 = true;
					}

					field281 = 0;

					if (field518 && field161 >= 5) {
						field296 = -1;
						method165();

						if (field296 == field279 && field295 != field280) {
							MYGSUHVG var19 = MYGSUHVG.method402(field279);
							byte var20 = 0;
							if (field257 == 1 && var19.field1080 == 206) {
								var20 = 1;
							}

							if (var19.field1051[field295] <= 0) {
								var20 = 0;
							}

							if (var19.field1079) {
								int var21 = field280;
								int var22 = field295;
								var19.field1051[var22] = var19.field1051[var21];
								var19.field1063[var22] = var19.field1063[var21];
								var19.field1051[var21] = -1;
								var19.field1063[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field280;
								int var24 = field295;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method396(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method396(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method396(field280, field295);
							}

							field370.method346(208);
							field370.method348(field295);
							field370.method348(field279);
							field370.method373(var20);
							field370.method380(field280);
						}
					} else if ((field539 == 1 || method184(field230 - 1)) && field230 > 2) {
						method185();
					} else if (field230 > 0) {
						method159(field230 - 1);
					}

					field382 = 10;
					field1121 = 0;
				}
			}

			if (JFQWYHZJ.field756 != -1) {
				int var25 = JFQWYHZJ.field756;
				int var26 = JFQWYHZJ.field757;
				boolean var27 = method131(0, 0, 0, 0, 0, 0, true, var25, var26, field459.field835[0], field459.field834[0]);
				JFQWYHZJ.field756 = -1;

				if (var27) {
					field264 = field1122;
					field265 = field1123;
					field267 = 1;
					field266 = 0;
				}
			}

			if (field1121 == 1 && field255 != null) {
				field255 = null;
				field271 = true;
				field1121 = 0;
			}

			method162();

			if (field446 == -1) {
				method150();
				method127();
				method94();
			}

			if (field1114 == 1 || field1121 == 1) {
				field250++;
			}

			if (field115 == 0 && field276 == 0 && field185 == 0) {
				if (field378 > 0) {
					field378--;
				}
			} else if (field378 < 100) {
				field378++;
				if (field378 == 100) {
					if (field115 != 0) {
						field271 = true;
					}

					if (field276 != 0) {
						field227 = true;
					}
				}
			}

			if (field289 == 2) {
				method90();
			}

			if (field289 == 2 && field170) {
				method48();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field480[var28]++;
			}

			method67();
			field1113++;
			if (field1113 > 4500) {
				field491 = 250;
				field1113 -= 500;
				field370.method346(10);
			}

			field342++;
			if (field342 > 500) {
				field342 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field126 += field127;
				}

				if ((var29 & 0x2) == 2) {
					field388 += field389;
				}

				if ((var29 & 0x4) == 4) {
					field212 += field213;
				}
			}

			if (field126 < -50) {
				field127 = 2;
			}

			if (field126 > 50) {
				field127 = -2;
			}

			if (field388 < -55) {
				field389 = 2;
			}

			if (field388 > 55) {
				field389 = -2;
			}

			if (field212 < -40) {
				field213 = 1;
			}

			if (field212 > 40) {
				field213 = -1;
			}

			field258++;
			if (field258 > 500) {
				field258 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field232 += field233;
				}

				if ((var30 & 0x2) == 2) {
					field357 += field358;
				}
			}

			if (field232 < -60) {
				field233 = 2;
			}

			if (field232 > 60) {
				field233 = -2;
			}

			if (field357 < -20) {
				field358 = 1;
			}

			if (field357 > 10) {
				field358 = -1;
			}

			field347++;
			if (field347 > 161) {
				field347 = 0;
				field370.method346(168);
				field370.method350(0xF0FB99);
			}

			field490++;
			if (field490 > 50) {
				field370.method346(204);
			}

			try {
				if (field363 != null && field370.field1014 > 0) {
					field363.method578(0, field370.field1014, field370.field1013);
					field370.field1014 = 0;
					field490 = 0;
				}
			} catch (IOException var32) {
				method167();
			} catch (Exception var33) {
				method110();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIZZIIII)Z")
	public final boolean method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field521[var14][var15] = 0;
				field425[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg9;
		field521[arg10][arg9] = 99;
		field425[arg10][arg9] = 0;
		byte var18 = 0;
		int var19 = 0;
		field441[var18] = arg10;
		int var39 = var18 + 1;
		field442[var18] = arg9;
		boolean var20 = false;
		int var21 = field441.length;
		int[][] var22 = field277[field395].field900;
		while (var39 != var19) {
			var16 = field441[var19];
			var17 = field442[var19];
			var19 = (var19 + 1) % var21;

			if (arg7 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && field277[field395].method332(arg8, var17, arg3 - 1, arg7, var16, arg4)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && field277[field395].method333(arg7, var17, var16, arg4, arg3 - 1, arg8)) {
					var20 = true;
					break;
				}
			}

			if (arg2 != 0 && arg0 != 0 && field277[field395].method334(arg7, arg2, arg0, var17, arg8, arg1, var16)) {
				var20 = true;
				break;
			}

			int var23 = field425[var16][var17] + 1;
			if (var16 > 0 && field521[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field441[var39] = var16 - 1;
				field442[var39] = var17;
				var39 = (var39 + 1) % var21;
				field521[var16 - 1][var17] = 2;
				field425[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field521[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field441[var39] = var16 + 1;
				field442[var39] = var17;
				var39 = (var39 + 1) % var21;
				field521[var16 + 1][var17] = 8;
				field425[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field521[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field441[var39] = var16;
				field442[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field521[var16][var17 - 1] = 1;
				field425[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field521[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field441[var39] = var16;
				field442[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field521[var16][var17 + 1] = 4;
				field425[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field521[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field441[var39] = var16 - 1;
				field442[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field521[var16 - 1][var17 - 1] = 3;
				field425[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field521[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field441[var39] = var16 + 1;
				field442[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field521[var16 + 1][var17 - 1] = 9;
				field425[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field521[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field441[var39] = var16 - 1;
				field442[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field521[var16 - 1][var17 + 1] = 6;
				field425[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field521[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field441[var39] = var16 + 1;
				field442[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field521[var16 + 1][var17 + 1] = 12;
				field425[var16 + 1][var17 + 1] = var23;
			}
		}

		field146 = 0;
		if (!var20) {
			if (!arg6) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg7 - var26; var27 <= arg7 + var26; var27++) {
				for (int var28 = arg8 - var26; var28 <= arg8 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field425[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg7) {
							var29 = arg7 - var27;
						} else if (var27 > arg2 + arg7 - 1) {
							var29 = var27 + 1 - arg2 - arg7;
						}

						int var30 = 0;
						if (var28 < arg8) {
							var30 = arg8 - var28;
						} else if (var28 > arg0 + arg8 - 1) {
							var30 = var28 + 1 - arg0 - arg8;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field425[var27][var28] < var25) {
							var24 = var31;
							var25 = field425[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg10 == var16 && arg9 == var17) {
				return false;
			}

			field146 = 1;
		}

		byte var32 = 0;
		field441[var32] = var16;
		int var40 = var32 + 1;
		field442[var32] = var17;
		int var33;
		int var34 = var33 = field521[var16][var17];
		while (arg10 != var16 || arg9 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field441[var40] = var16;
				field442[var40++] = var17;
			}

			if ((var34 & 0x2) != 0) {
				var16++;
			} else if ((var34 & 0x8) != 0) {
				var16--;
			}

			if ((var34 & 0x1) != 0) {
				var17++;
			} else if ((var34 & 0x4) != 0) {
				var17--;
			}

			var34 = field521[var16][var17];
		}

		if (var40 <= 0) {
			if (arg5 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field441[var40];
		int var37 = field442[var40];
		field400++;
		if (field400 >= 96) {
			field370.method346(128);
			field370.method350(0x743F1A);
			field400 = 0;
		}

		if (arg5 == 0) {
			field370.method346(1);
			field370.method347(var35 + var35 + 3);
		}

		if (arg5 == 1) {
			field370.method346(19);
			field370.method347(var35 + var35 + 3 + 14);
		}

		if (arg5 == 2) {
			field370.method346(18);
			field370.method347(var35 + var35 + 3);
		}

		field370.method374(field1125[5] == 1 ? 1 : 0);
		field370.method380(field246 + var37);
		field323 = field441[0];
		field324 = field442[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field370.method374(field441[var40] - var36);
			field370.method373(field442[var40] - var37);
		}

		field370.method380(field245 + var36);
		return true;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method132() {
		if (field289 == 2) {
			for (XEHNJCHN var1 = (XEHNJCHN) field162.method246(); var1 != null; var1 = (XEHNJCHN) field162.method248()) {
				if (var1.field1491 > 0) {
					var1.field1491--;
				}

				if (var1.field1491 != 0) {
					if (var1.field1490 > 0) {
						var1.field1490--;
					}

					if (var1.field1490 == 0 && var1.field1494 >= 1 && var1.field1495 >= 1 && var1.field1494 <= 102 && var1.field1495 <= 102 && (var1.field1487 < 0 || SBZYTIRX.method534(var1.field1489, var1.field1487))) {
						method135(var1.field1489, var1.field1487, var1.field1494, var1.field1493, var1.field1492, var1.field1495, var1.field1488);
						var1.field1490 = -1;

						if (var1.field1487 == var1.field1484 && var1.field1484 == -1) {
							var1.method589();
						} else if (var1.field1487 == var1.field1484 && var1.field1488 == var1.field1485 && var1.field1489 == var1.field1486) {
							var1.method589();
						}
					}
				} else if (var1.field1484 < 0 || SBZYTIRX.method534(var1.field1486, var1.field1484)) {
					method135(var1.field1486, var1.field1484, var1.field1494, var1.field1493, var1.field1492, var1.field1495, var1.field1485);
					var1.method589();
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method133(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field403 = "";
				field404 = "Connecting to server...";
				method143(true);
			}

			field363 = new TYRTFBBQ(this, method177(field327 + 43594));
			long var4 = TGGPOZND.method547(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field370.field1014 = 0;
			field370.method347(14);
			field370.method347(var6);
			field363.method578(0, 2, field370.field1013);

			for (int var7 = 0; var7 < 8; var7++) {
				field363.method575();
			}

			int var8 = field363.method575();
			int var9 = var8;

			if (var8 == 0) {
				field363.method577(field221.field1013, 0, 8);
				field221.field1014 = 0;
				field361 = field221.method363();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field361 >> 32), (int) field361 };
				field370.field1014 = 0;
				field370.method347(10);
				field370.method351(var10[0]);
				field370.method351(var10[1]);
				field370.method351(var10[2]);
				field370.method351(var10[3]);
				field370.method351(signlink.uid);
				field370.method354(arg0);
				field370.method354(arg1);
				field370.method372(field371, field424);
				field346.field1014 = 0;

				if (arg2) {
					field346.method347(18);
				} else {
					field346.method347(16);
				}

				field346.method347(field370.field1014 + 36 + 1 + 1 + 2);
				field346.method347(255);
				field346.method348(365);
				field346.method347(field329 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field346.method351(field253[var11]);
				}

				field346.method355(field370.field1013, field370.field1014, 0);
				field370.field1018 = new QIAMMSTQ(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field175 = new QIAMMSTQ(var10);
				field363.method578(0, field346.field1014, field346.field1013);
				var8 = field363.method575();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method133(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field377 = field363.method575();
				field436 = field363.method575() == 1;
				field256 = 0L;
				field393 = 0;
				field272.field1498 = 0;
				field1112 = true;
				field148 = true;
				field182 = true;
				field370.field1014 = 0;
				field221.field1014 = 0;
				field488 = -1;
				field309 = -1;
				field310 = -1;
				field311 = -1;
				field487 = 0;
				field489 = 0;
				field460 = 0;
				field491 = 0;
				field472 = 0;
				field230 = 0;
				field278 = false;
				field1113 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field516[var13] = null;
				}

				field201 = 0;
				field350 = 0;
				field289 = 0;
				field291 = 0;
				field126 = (int) (Math.random() * 100.0D) - 50;
				field388 = (int) (Math.random() * 110.0D) - 55;
				field212 = (int) (Math.random() * 80.0D) - 40;
				field232 = (int) (Math.random() * 120.0D) - 60;
				field357 = (int) (Math.random() * 30.0D) - 20;
				field373 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field186 = 0;
				field321 = -1;
				field323 = 0;
				field324 = 0;
				field132 = 0;
				field531 = 0;

				for (int var14 = 0; var14 < field129; var14++) {
					field131[var14] = null;
					field136[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field530[var15] = null;
				}

				field459 = field131[field130] = new BSQIIHOT();
				field335.method250();
				field269.method250();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field364[var16][var17][var18] = null;
						}
					}
				}

				field162 = new IHMCQRZY();
				field113 = 0;
				field112 = 0;
				method112(field509);
				field509 = -1;
				method112(field548);
				field548 = -1;
				method112(field304);
				field304 = -1;
				method112(field446);
				field446 = -1;
				method112(field376);
				field376 = -1;
				method112(field111);
				field111 = -1;
				method112(field199);
				field199 = -1;
				field197 = false;
				field338 = 3;
				field471 = 0;
				field278 = false;
				field239 = false;
				field255 = null;
				field292 = 0;
				field410 = -1;
				field359 = true;
				method100();

				for (int var19 = 0; var19 < 5; var19++) {
					field301[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field343[var20] = null;
					field344[var20] = false;
				}

				field362 = 0;
				field225 = 0;
				field198 = 0;
				field438 = 0;
				field400 = 0;
				method51();
			} else if (var8 == 3) {
				field403 = "";
				field404 = "Invalid username or password.";
			} else if (var8 == 4) {
				field403 = "Your account has been disabled.";
				field404 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field403 = "Your account is already logged in.";
				field404 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field403 = "RuneScape has been updated!";
				field404 = "Please reload this page.";
			} else if (var8 == 7) {
				field403 = "This world is full.";
				field404 = "Please use a different world.";
			} else if (var8 == 8) {
				field403 = "Unable to connect.";
				field404 = "Login server offline.";
			} else if (var8 == 9) {
				field403 = "Login limit exceeded.";
				field404 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field403 = "Unable to connect.";
				field404 = "Bad session id.";
			} else if (var8 == 12) {
				field403 = "You need a members account to login to this world.";
				field404 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field403 = "Could not complete login.";
				field404 = "Please try using a different world.";
			} else if (var8 == 14) {
				field403 = "The server is being updated.";
				field404 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field182 = true;
				field370.field1014 = 0;
				field221.field1014 = 0;
				field488 = -1;
				field309 = -1;
				field310 = -1;
				field311 = -1;
				field487 = 0;
				field489 = 0;
				field460 = 0;
				field230 = 0;
				field278 = false;
				field260 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field403 = "Login attempts exceeded.";
				field404 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field403 = "You are standing in a members-only area.";
				field404 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field403 = "Invalid loginserver requested";
				field404 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field363.method575();
				for (var21 += 3; var21 >= 0; var21--) {
					field403 = "You have only just left another world";
					field404 = "Your profile will be transferred in: " + var21;
					method143(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method133(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field403 = "Malformed login packet.";
				field404 = "Please try again.";
			} else if (var8 == 23) {
				field403 = "No reply from loginserver.";
				field404 = "Please try again.";
			} else if (var8 == 24) {
				field403 = "Error loading your profile.";
				field404 = "Please contact customer support.";
			} else if (var8 == 25) {
				field403 = "Unexpected loginserver response.";
				field404 = "Please try using a different world.";
			} else if (var8 == 26) {
				field403 = "This computers address has been blocked";
				field404 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field403 = "Unexpected server response";
				field404 = "Please try using a different world.";
			} else if (var9 != 0) {
				field403 = "No response from server";
				field404 = "Please try using a different world.";
			} else if (field523 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field523++;
				method133(arg0, arg1, arg2);
			} else {
				field403 = "No response from loginserver";
				field404 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field403 = "";
			field404 = "Error connecting to server.";
		}
	}

	public final void init() {
		field326 = Integer.parseInt(getParameter("nodeid"));
		field327 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method164();
		} else {
			method142();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field328 = false;
		} else {
			field328 = true;
		}

		method406(503, 765);
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method134(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
			if (field329 && field395 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field394.method278(arg4, arg2, arg5);
			}

			if (arg3 == 1) {
				var8 = field394.method279(arg2, arg5, arg4);
			}

			if (arg3 == 2) {
				var8 = field394.method280(arg4, arg2, arg5);
			}

			if (arg3 == 3) {
				var8 = field394.method281(arg4, arg2, arg5);
			}

			if (var8 != 0) {
				int var12 = field394.method282(arg4, arg2, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field394.method269(arg5, arg4, arg2);
					CUIVWWJO var16 = CUIVWWJO.method203(var13);
					if (var16.field570) {
						field277[arg4].method328(var16.field553, arg2, var14, arg5, var15);
					}
				}

				if (arg3 == 1) {
					field394.method270(arg5, arg2, arg4);
				}

				if (arg3 == 2) {
					field394.method271(arg4, arg5, arg2);
					CUIVWWJO var17 = CUIVWWJO.method203(var13);
					if (var17.field554 + arg2 > 103 || var17.field554 + arg5 > 103 || var17.field594 + arg2 > 103 || var17.field594 + arg5 > 103) {
						return;
					}

					if (var17.field570) {
						field277[arg4].method329(var15, arg5, var17.field554, arg2, var17.field594, var17.field553);
					}
				}

				if (arg3 == 3) {
					field394.method272(arg4, arg2, arg5);
					CUIVWWJO var18 = CUIVWWJO.method203(var13);
					if (var18.field570 && var18.field586) {
						field277[arg4].method331(arg5, arg2);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field219[1][arg2][arg5] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				SBZYTIRX.method523(arg0, arg4, arg6, field528, arg2, arg5, field277[arg4], var19, field394, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.a([BZZ)V")
	public final void method136(byte[] arg0, boolean arg1) {
		if (field435) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method137() {
		field333 = false;
		while (field125) {
			field333 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field469 = null;
		field470 = null;
		field451 = null;
		field499 = null;
		field500 = null;
		field501 = null;
		field502 = null;
		field492 = null;
		field493 = null;
		field243 = null;
		field244 = null;
		field183 = null;
		field184 = null;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		XEHNJCHN var10 = null;
		for (XEHNJCHN var11 = (XEHNJCHN) field162.method246(); var11 != null; var11 = (XEHNJCHN) field162.method248()) {
			if (var11.field1492 == arg6 && var11.field1494 == arg7 && var11.field1495 == arg1 && var11.field1493 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new XEHNJCHN();
			var10.field1492 = arg6;
			var10.field1493 = arg3;
			var10.field1494 = arg7;
			var10.field1495 = arg1;
			method84(var10);
			field162.method243(var10);
		}

		var10.field1487 = arg0;
		var10.field1489 = arg4;
		var10.field1488 = arg8;
		var10.field1490 = arg2;
		var10.field1491 = arg5;
	}

	@ObfuscatedName("client.a(IILIBHUFTPE;I)V")
	public final void method139(int arg0, IBHUFTPE arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field373 + field232 & 0x7FF;
			int var6 = PDVZPZLT.field1197[var5];
			int var7 = PDVZPZLT.field1198[var5];
			var6 = var6 * 256 / (field357 + 256);
			var7 = var7 * 256 / (field357 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field299.method238(20, 15, 83 - var13 - 20, var10, 15, 256, 20, var12 + 94 + 4 - 10);
		} else {
			method126(arg1, arg0, arg2);
		}
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method140(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field394.method282(field395, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			CUIVWWJO var8 = CUIVWWJO.method203(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field554;
				var10 = var8.field594;
			} else {
				var9 = var8.field594;
				var10 = var8.field554;
			}

			int var11 = var8.field595;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method131(var10, var11, var9, 0, 0, 2, true, arg1, arg2, field459.field835[0], field459.field834[0]);
		} else {
			method131(0, 0, 0, var6 + 1, var7, 2, true, arg1, arg2, field459.field835[0], field459.field834[0]);
		}

		field287++;
		if (field287 > 1332) {
			field287 = 0;
			field370.method346(183);
			field370.method347(0);
			int var12 = field370.field1014;
			field370.method347(123);
			field370.method347(96);

			if ((int) (Math.random() * 2.0D) == 0) {
				field370.method348(63133);
			}

			field370.method348(30708);
			field370.method347(24);

			if ((int) (Math.random() * 2.0D) == 0) {
				field370.method347(188);
			}

			field370.method347((int) (Math.random() * 256.0D));
			field370.method347((int) (Math.random() * 256.0D));
			field370.method347((int) (Math.random() * 256.0D));
			field370.method347(14);
			field370.method356(field370.field1014 - var12);
		}

		field264 = field1122;
		field265 = field1123;
		field267 = 2;
		field266 = 0;
		return true;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method141() {
		Graphics var1 = method119().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method408(1);

		if (field251) {
			field333 = false;
			var1.setFont(new Font("Helvetica", 1, 16));
			var1.setColor(Color.yellow);
			int var2 = 35;
			var1.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var2);
			var2 += 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, var2);
			var2 += 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var2);
			var2 += 30;
			var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var2);
			var2 += 30;
			var1.drawString("3: Try using a different game-world", 30, var2);
			var2 += 30;
			var1.drawString("4: Try rebooting your computer", 30, var2);
			var2 += 30;
			var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var2);
		}

		if (field354) {
			field333 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field519) {
			field333 = false;
			var1.setColor(Color.yellow);
			int var3 = 35;
			var1.drawString("Error a copy of RuneScape already appears to be loaded", 30, var3);
			var3 += 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, var3);
			var3 += 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var3);
			var3 += 30;
			var1.drawString("2: Try rebooting your computer, and reloading", 30, var3);
			var3 += 30;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public static final void method142() {
		JFQWYHZJ.field722 = false;
		THHUVKBK.field1402 = false;
		field329 = false;
		SBZYTIRX.field1349 = false;
		CUIVWWJO.field555 = false;
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method143(boolean arg0) {
		method77();
		field190.method206();
		field469.method38(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field138 == 0) {
			int var4 = var3 / 2 + 80;
			field178.method19(field381.field1284, true, var4, 0x75A9A9, var2 / 2);
			int var5 = var3 / 2 - 20;
			field180.method19("Welcome to RuneScape", true, var5, 0xFFFF00, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field470.method38(var6 - 73, var7 - 20);
			field180.method19("New User", true, var7 + 5, 0xFFFFFF, var6);
			int var8 = var2 / 2 + 80;
			field470.method38(var8 - 73, var7 - 20);
			field180.method19("Existing User", true, var7 + 5, 0xFFFFFF, var8);
		}

		if (field138 == 2) {
			int var9 = var3 / 2 - 40;
			if (field403.length() > 0) {
				field180.method19(field403, true, var9 - 15, 0xFFFF00, var2 / 2);
				field180.method19(field404, true, var9, 0xFFFF00, var2 / 2);
				var9 += 30;
			} else {
				field180.method19(field404, true, var9 - 7, 0xFFFF00, var2 / 2);
				var9 += 30;
			}

			field180.method26(var2 / 2 - 90, var9, true, "Username: " + field426 + (field286 == 0 & field443 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF);
			var9 += 15;
			field180.method26(var2 / 2 - 88, var9, true, "Password: " + TGGPOZND.method552(field427) + (field286 == 1 & field443 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field470.method38(var10 - 73, var11 - 20);
				field180.method19("Login", true, var11 + 5, 0xFFFFFF, var10);
				int var12 = var2 / 2 + 80;
				field470.method38(var12 - 73, var11 - 20);
				field180.method19("Cancel", true, var11 + 5, 0xFFFFFF, var12);
			}
		}

		if (field138 == 3) {
			field180.method19("Create a free account", true, var3 / 2 - 60, 0xFFFF00, var2 / 2);
			int var13 = var3 / 2 - 35;
			field180.method19("To create a new account you need to", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field180.method19("go back to the main RuneScape webpage", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field180.method19("and choose the 'create account'", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			field180.method19("button near the top of that page.", true, var13, 0xFFFFFF, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field470.method38(var14 - 73, var15 - 20);
			field180.method19("Cancel", true, var15 + 5, 0xFFFFFF, var14);
		}

		field190.method207(field1107, 171, 202);

		if (field259) {
			field259 = false;
			field188.method207(field1107, 0, 128);
			field189.method207(field1107, 371, 202);
			field193.method207(field1107, 265, 0);
			field194.method207(field1107, 265, 562);
			field195.method207(field1107, 171, 128);
			field196.method207(field1107, 171, 562);
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method144(boolean arg0) {
		for (int var2 = 0; var2 < field531; var2++) {
			ACKJULTZ var3 = field530[field532[var2]];
			int var4 = (field532[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method1() && var3.field1.field883 == arg0 && var3.field1.method318()) {
				int var5 = var3.field828 >> 7;
				int var6 = var3.field829 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field812 == 1 && (var3.field828 & 0x7F) == 0x40 && (var3.field829 & 0x7F) == 0x40) {
						if (field297[var5][var6] == field141) {
							continue;
						}

						field297[var5][var6] = field141;
					}

					if (!var3.field1.field862) {
						var4 += Integer.MIN_VALUE;
					}

					field394.method263(field395, method68(var3.field829, var3.field828, field395), var3.field828, var3, var3.field829, (var3.field812 - 1) * 64 + 60, var3.field830, var3.field803, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method145() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field243[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field243[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field244[var10] = (field243[var10 - 1] + field243[var10 + 1] + field243[var10 - 128] + field243[var10 + 128]) / 4;
			}
		}

		field143 += 128;
		if (field143 > field492.length) {
			field143 -= field492.length;
			int var11 = (int) (Math.random() * 12.0D);
			method154(field451[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field244[var14 + 128] - field492[field143 + var14 & field492.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field243[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field440[var16] = field440[var16 + 1];
		}

		field440[var1 - 1] = (int) (Math.sin(field443 / 14.0D) * 16.0D + Math.sin(field443 / 15.0D) * 14.0D + Math.sin(field443 / 16.0D) * 12.0D);

		if (field444 > 0) {
			field444 -= 4;
		}

		if (field445 > 0) {
			field445 -= 4;
		}

		if (field444 == 0 && field445 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field444 = 1024;
			}

			if (var17 == 1) {
				field445 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILMVHXDWGI;)V")
	public final void method146(int arg0, MVHXDWGI arg1) {
		field222 = 0;
		field134 = 0;
		method76(arg0, arg1);
		method161(arg1, arg0);
		method190(arg1, arg0);

		for (int var3 = 0; var3 < field222; var3++) {
			int var4 = field223[var3];
			if (field443 != field530[var4].field813) {
				field530[var4].field1 = null;
				field530[var4] = null;
			}
		}

		if (arg1.field1014 != arg0) {
			signlink.reporterror(field426 + " size mismatch in getnpcpos - pos:" + arg1.field1014 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field531; var5++) {
			if (field530[field532[var5]] == null) {
				signlink.reporterror(field426 + " null entry in npc list - pos:" + var5 + " size:" + field531);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method147() {
		method72(20, "Starting up");

		if (signlink.sunjava) {
			field1101 = 5;
		}

		if (field503) {
			field519 = true;
		} else {
			field503 = true;
			boolean var1 = false;
			String var2 = method105();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.231")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.229")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.228")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.227")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.226")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.224")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.223")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.221")) {
				var1 = true;
			}

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field313[var3] = new QQNRPAWO(signlink.cache_idx[var3], var3 + 1, 500000, signlink.cache_dat);
					}
				}

				try {
					method125();
					field533 = method81("title screen", field253[1], 25, "title", 1);
					field178 = new AWMLZOXZ("p11_full", field533, false);
					field179 = new AWMLZOXZ("p12_full", field533, false);
					field180 = new AWMLZOXZ("b12_full", field533, false);
					field181 = new AWMLZOXZ("q8_full", field533, true);
					method155();
					method194();
					IEMHZJLX var4 = method81("config", field253[2], 30, "config", 2);
					IEMHZJLX var5 = method81("interface", field253[3], 35, "interface", 3);
					IEMHZJLX var6 = method81("2d graphics", field253[4], 40, "media", 4);
					IEMHZJLX var7 = method81("textures", field253[6], 45, "textures", 6);
					IEMHZJLX var8 = method81("chat system", field253[7], 50, "wordenc", 7);
					IEMHZJLX var9 = method81("sound effects", field253[8], 55, "sounds", 8);
					field219 = new byte[4][104][104];
					field528 = new int[4][105][105];
					field394 = new JFQWYHZJ(104, field528, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field277[var10] = new LQLHEUAQ(104, 104);
					}

					field325 = new IBHUFTPE(512, 512);
					IEMHZJLX var11 = method81("update list", field253[5], 60, "versionlist", 5);
					method72(60, "Connecting to update server");
					field381 = new RKMPVAZH();
					field381.method505(var11, this);
					YPRWORMV.method598(field381.method506());
					PDVZPZLT.method411(field381.method514(0), field381);

					if (!field329) {
						field448 = 0;
						field449 = true;
						field381.method516(2, field448);

						while (field381.method499() > 0) {
							method129();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field381.field1303 > 3) {
								method79("ondemand");
								return;
							}
						}
					}

					method72(65, "Requesting animations");
					int var12 = field381.method514(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field381.method516(1, var13);
					}

					while (field381.method499() > 0) {
						int var14 = var12 - field381.method499();
						if (var14 > 0) {
							method72(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method129();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field381.field1303 > 3) {
							method79("ondemand");
							return;
						}
					}

					method72(70, "Requesting models");
					int var15 = field381.method514(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field381.method504(var16);
						if ((var17 & 0x1) != 0) {
							field381.method516(0, var16);
						}
					}

					int var18 = field381.method499();
					while (field381.method499() > 0) {
						int var19 = var18 - field381.method499();
						if (var19 > 0) {
							method72(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method129();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field313[0] != null) {
						method72(75, "Requesting maps");
						field381.method516(3, field381.method507(0, 47, 48));
						field381.method516(3, field381.method507(1, 47, 48));
						field381.method516(3, field381.method507(0, 48, 48));
						field381.method516(3, field381.method507(1, 48, 48));
						field381.method516(3, field381.method507(0, 49, 48));
						field381.method516(3, field381.method507(1, 49, 48));
						field381.method516(3, field381.method507(0, 47, 47));
						field381.method516(3, field381.method507(1, 47, 47));
						field381.method516(3, field381.method507(0, 48, 47));
						field381.method516(3, field381.method507(1, 48, 47));
						field381.method516(3, field381.method507(0, 48, 148));
						field381.method516(3, field381.method507(1, 48, 148));
						int var20 = field381.method499();
						while (field381.method499() > 0) {
							int var21 = var20 - field381.method499();
							if (var21 > 0) {
								method72(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method129();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field381.method514(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field381.method504(var23);
						byte var25 = 0;
						if ((var24 & 0x8) != 0) {
							var25 = 10;
						} else if ((var24 & 0x20) != 0) {
							var25 = 9;
						} else if ((var24 & 0x10) != 0) {
							var25 = 8;
						} else if ((var24 & 0x40) != 0) {
							var25 = 7;
						} else if ((var24 & 0x80) != 0) {
							var25 = 6;
						} else if ((var24 & 0x2) != 0) {
							var25 = 5;
						} else if ((var24 & 0x4) != 0) {
							var25 = 4;
						}

						if ((var24 & 0x1) != 0) {
							var25 = 3;
						}

						if (var25 != 0) {
							field381.method501(0, var25, var23);
						}
					}

					field381.method510(field328);

					if (!field329) {
						int var26 = field381.method514(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field381.method503(var27)) {
								field381.method501(2, (byte) 1, var27);
							}
						}
					}

					method72(80, "Unpacking media");
					field429 = new BNGXLHWA(var6, "invback", 0);
					field431 = new BNGXLHWA(var6, "chatback", 0);
					field430 = new BNGXLHWA(var6, "mapback", 0);
					field172 = new BNGXLHWA(var6, "backbase1", 0);
					field173 = new BNGXLHWA(var6, "backbase2", 0);
					field174 = new BNGXLHWA(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field308[var28] = new BNGXLHWA(var6, "sideicons", var28);
					}

					field538 = new IBHUFTPE(var6, "compass", 0);
					field299 = new IBHUFTPE(var6, "mapedge", 0);
					field299.method230();

					for (int var29 = 0; var29 < 72; var29++) {
						field345[var29] = new BNGXLHWA(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 70; var30++) {
						field147[var30] = new IBHUFTPE(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field303[var31] = new IBHUFTPE(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field355[var32] = new IBHUFTPE(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field110[var33] = new IBHUFTPE(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field334[var34] = new IBHUFTPE(var6, "headicons_hint", var34);
					}

					field356 = new IBHUFTPE(var6, "overlay_multiway", 0);
					field331 = new IBHUFTPE(var6, "mapmarker", 0);
					field332 = new IBHUFTPE(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field402[var35] = new IBHUFTPE(var6, "cross", var35);
					}

					field540 = new IBHUFTPE(var6, "mapdots", 0);
					field541 = new IBHUFTPE(var6, "mapdots", 1);
					field542 = new IBHUFTPE(var6, "mapdots", 2);
					field543 = new IBHUFTPE(var6, "mapdots", 3);
					field544 = new IBHUFTPE(var6, "mapdots", 4);
					field159 = new BNGXLHWA(var6, "scrollbar", 0);
					field160 = new BNGXLHWA(var6, "scrollbar", 1);
					field149 = new BNGXLHWA(var6, "redstone1", 0);
					field150 = new BNGXLHWA(var6, "redstone2", 0);
					field151 = new BNGXLHWA(var6, "redstone3", 0);
					field152 = new BNGXLHWA(var6, "redstone1", 0);
					field152.method35();
					field153 = new BNGXLHWA(var6, "redstone2", 0);
					field153.method35();
					field475 = new BNGXLHWA(var6, "redstone1", 0);
					field475.method36();
					field476 = new BNGXLHWA(var6, "redstone2", 0);
					field476.method36();
					field477 = new BNGXLHWA(var6, "redstone3", 0);
					field477.method36();
					field478 = new BNGXLHWA(var6, "redstone1", 0);
					field478.method35();
					field478.method36();
					field479 = new BNGXLHWA(var6, "redstone2", 0);
					field479.method35();
					field479.method36();

					for (int var36 = 0; var36 < 2; var36++) {
						field336[var36] = new BNGXLHWA(var6, "mod_icons", var36);
					}

					IBHUFTPE var37 = new IBHUFTPE(var6, "backleft1", 0);
					field116 = new ESGPTMPA(var37.field694, var37.field693, method119());
					var37.method231(0, 0);
					IBHUFTPE var38 = new IBHUFTPE(var6, "backleft2", 0);
					field117 = new ESGPTMPA(var38.field694, var38.field693, method119());
					var38.method231(0, 0);
					IBHUFTPE var39 = new IBHUFTPE(var6, "backright1", 0);
					field118 = new ESGPTMPA(var39.field694, var39.field693, method119());
					var39.method231(0, 0);
					IBHUFTPE var40 = new IBHUFTPE(var6, "backright2", 0);
					field119 = new ESGPTMPA(var40.field694, var40.field693, method119());
					var40.method231(0, 0);
					IBHUFTPE var41 = new IBHUFTPE(var6, "backtop1", 0);
					field120 = new ESGPTMPA(var41.field694, var41.field693, method119());
					var41.method231(0, 0);
					IBHUFTPE var42 = new IBHUFTPE(var6, "backvmid1", 0);
					field121 = new ESGPTMPA(var42.field694, var42.field693, method119());
					var42.method231(0, 0);
					IBHUFTPE var43 = new IBHUFTPE(var6, "backvmid2", 0);
					field122 = new ESGPTMPA(var43.field694, var43.field693, method119());
					var43.method231(0, 0);
					IBHUFTPE var44 = new IBHUFTPE(var6, "backvmid3", 0);
					field123 = new ESGPTMPA(var44.field694, var44.field693, method119());
					var44.method231(0, 0);
					IBHUFTPE var45 = new IBHUFTPE(var6, "backhmid2", 0);
					field124 = new ESGPTMPA(var45.field694, var45.field693, method119());
					var45.method231(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field147[var50] != null) {
							field147[var50].method229(var47 + var49, var46 + var49, var48 + var49);
						}

						if (field345[var50] != null) {
							field345[var50].method37(var47 + var49, var46 + var49, var48 + var49);
						}
					}

					method72(83, "Unpacking textures");
					THHUVKBK.method558(var7);
					THHUVKBK.method562(0.8D);
					THHUVKBK.method557(20);
					method72(86, "Unpacking config");
					JZFUUSFN.method307(var4);
					CUIVWWJO.method196(var4);
					QDVRTZST.method479(var4);
					AGZBBQJK.method7(var4);
					LQFHJGYA.method320(var4);
					LXLAQKAC.method335(var4);
					MBSSGBHW.method341(var4);
					RIRWXSOT.method493(var4);
					QMAVGSSV.method486(var4);
					AGZBBQJK.field20 = field328;

					if (!field329) {
						method72(90, "Unpacking sounds");
						byte[] var51 = var9.method242("sounds.dat", null);
						MVHXDWGI var52 = new MVHXDWGI(var51);
						WTXWLORU.method580(var52);
					}

					method72(95, "Unpacking interfaces");
					AWMLZOXZ[] var53 = new AWMLZOXZ[] { field178, field179, field180, field181 };
					MYGSUHVG.method401(var53, var5, var6);
					method72(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field430.field67[field430.field69 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field510[var54] = var55;
						field290[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field430.field67[field430.field69 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field241[var58 - 5] = var59 - 25;
						field468[var58 - 5] = var60 - var59;
					}

					THHUVKBK.method555(765, 503);
					field458 = THHUVKBK.field1413;
					THHUVKBK.method555(479, 96);
					field455 = THHUVKBK.field1413;
					THHUVKBK.method555(190, 261);
					field456 = THHUVKBK.field1413;
					THHUVKBK.method555(512, 334);
					field457 = THHUVKBK.field1413;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = THHUVKBK.field1411[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					JFQWYHZJ.method288(334, 800, 512, var62, 500);
					PRVYVGOX.method441(var8);
					field272 = new YNDLJDLS(this);
					method169(field272, 10);
					QQWZAYRQ.field1252 = this;
					CUIVWWJO.field583 = this;
					LQFHJGYA.field877 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field254 + " " + field522);
					field251 = true;
				}
			} else {
				field354 = true;
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method148() {
		field405 = null;
		field406 = null;
		field407 = null;
		field408 = null;
		field365 = null;
		field274 = null;
		field275 = null;
		field391 = null;
		field215 = null;
		field349 = null;
		field240 = null;
		field216 = null;
		field217 = null;
		field149 = null;
		field150 = null;
		field151 = null;
		field152 = null;
		field153 = null;

		if (field272 != null) {
			field272.field1499 = false;
		}

		field272 = null;
		field540 = null;
		field541 = null;
		field542 = null;
		field543 = null;
		field544 = null;
		field345 = null;
		field147 = null;
		field308 = null;
		method157();
		field429 = null;
		field430 = null;
		field431 = null;
		field467 = null;
		field193 = null;
		field194 = null;
		field195 = null;
		field196 = null;
		field529 = null;
		field530 = null;
		field532 = null;
		field396 = null;
		field397 = null;
		field398 = null;
		field399 = null;
		field528 = null;
		field219 = null;
		field394 = null;
		field277 = null;
		field325 = null;
		field370 = null;
		field346 = null;
		field221 = null;
		field356 = null;
		field120 = null;
		field121 = null;
		field122 = null;
		field123 = null;
		field124 = null;
		field116 = null;
		field117 = null;
		field118 = null;
		field119 = null;
		field131 = null;
		field133 = null;
		field135 = null;
		field136 = null;
		field223 = null;
		field521 = null;
		field425 = null;
		field441 = null;
		field442 = null;
		field297 = null;
		field191 = null;
		field192 = null;
		field188 = null;
		field189 = null;
		field190 = null;
		field538 = null;
		field303 = null;
		field355 = null;
		field110 = null;
		field334 = null;
		field402 = null;
		field364 = null;
		field162 = null;
		field511 = null;
		field210 = null;
		field140 = null;

		if (field381 != null) {
			field381.method511();
		}

		field381 = null;

		try {
			if (field363 != null) {
				field363.method574();
			}
		} catch (Exception var1) {
		}

		field363 = null;
		field172 = null;
		field173 = null;
		field174 = null;
		field339 = null;
		field340 = null;
		field341 = null;
		field475 = null;
		field476 = null;
		field477 = null;
		field478 = null;
		field479 = null;
		field335 = null;
		field269 = null;
		field453 = null;
		method137();
		CUIVWWJO.method197();
		LQFHJGYA.method319();
		AGZBBQJK.method8();
		MYGSUHVG.method399();
		QDVRTZST.field1215 = null;
		LXLAQKAC.field919 = null;
		FHGNYSDH.field621 = null;
		JZFUUSFN.field841 = null;
		MBSSGBHW.field927 = null;
		MBSSGBHW.field939 = null;
		RIRWXSOT.field1266 = null;
		field1108 = null;
		BSQIIHOT.field77 = null;
		THHUVKBK.method553();
		JFQWYHZJ.method251();
		PDVZPZLT.method410();
		YPRWORMV.method600();
		System.gc();
	}

	@ObfuscatedName("client.x(I)V")
	public final void method149() {
		short var1 = 256;

		if (field444 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field444 > 768) {
					field499[var2] = method97(field501[var2], 1024 - field444, field500[var2]);
				} else if (field444 > 256) {
					field499[var2] = field501[var2];
				} else {
					field499[var2] = method97(field500[var2], 256 - field444, field501[var2]);
				}
			}
		} else if (field445 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field445 > 768) {
					field499[var3] = method97(field502[var3], 1024 - field445, field500[var3]);
				} else if (field445 > 256) {
					field499[var3] = field502[var3];
				} else {
					field499[var3] = method97(field500[var3], 256 - field445, field502[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field499[var4] = field500[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field191.field606[var5] = field183.field692[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field440[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field243[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field499[var12];
					int var15 = field191.field606[var7];
					field191.field606[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field191.method207(field1107, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field192.field606[var16] = field184.field692[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field440[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field243[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field499[var23];
					int var26 = field192.field606[var18];
					field192.field606[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field192.method207(field1107, 0, 637);
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method150() {
		if (field186 == 0 && field1121 == 1) {
			int var1 = field1122 - 25 - 550;
			int var2 = field1123 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field373 + field232 & 0x7FF;
				int var4 = THHUVKBK.field1411[var3];
				int var5 = THHUVKBK.field1412[var3];
				var4 = (field357 + 256) * var4 >> 8;
				var5 = (field357 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field459.field828 + var6 >> 7;
				int var9 = field459.field829 - var7 >> 7;
				boolean var10 = method131(0, 0, 0, 0, 0, 1, true, var8, var9, field459.field835[0], field459.field834[0]);
				if (var10) {
					field370.method347(var1);
					field370.method347(var2);
					field370.method348(field373);
					field370.method347(57);
					field370.method347(field232);
					field370.method347(field357);
					field370.method347(89);
					field370.method348(field459.field828);
					field370.method348(field459.field829);
					field370.method347(field146);
					field370.method347(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILJXGMYPJH;B)V")
	public final void method151(int arg0, JXGMYPJH arg1) {
		method152(arg1.field829, arg0, arg1.field828);
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method152(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method68(arg0, arg2, field395) - arg1;
			arg2 -= field314;
			var4 -= field315;
			arg0 -= field316;
			int var5 = PDVZPZLT.field1197[field317];
			int var6 = PDVZPZLT.field1198[field317];
			int var7 = PDVZPZLT.field1197[field318];
			int var8 = PDVZPZLT.field1198[field318];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field505 = (var9 << 9) / arg0 + THHUVKBK.field1407;
				field506 = (var11 << 9) / arg0 + THHUVKBK.field1408;
			} else {
				field505 = -1;
				field506 = -1;
			}
		} else {
			field505 = -1;
			field506 = -1;
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method153() {
		if (!field519 && !field251 && !field354) {
			field443++;

			if (field182) {
				method130();
			} else {
				method117();
			}

			method129();
		}
	}

	@ObfuscatedName("client.a(ILBNGXLHWA;)V")
	public final void method154(BNGXLHWA arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field492.length; var3++) {
			field492[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field492[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field493[var9] = (field492[var9 - 1] + field492[var9 + 1] + field492[var9 - 128] + field492[var9 + 128]) / 4;
				}
			}

			int[] var10 = field492;
			field492 = field493;
			field493 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field70; var12++) {
				for (int var13 = 0; var13 < arg0.field69; var13++) {
					if (arg0.field67[var11++] != 0) {
						int var14 = var13 + arg0.field71 + 16;
						int var15 = var12 + arg0.field72 + 16;
						int var16 = (var15 << 7) + var14;
						field492[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method155() {
		byte[] var1 = field533.method242("title.dat", null);
		IBHUFTPE var2 = new IBHUFTPE(var1, this);
		field191.method206();
		var2.method231(0, 0);
		field192.method206();
		var2.method231(-637, 0);
		field188.method206();
		var2.method231(-128, 0);
		field189.method206();
		var2.method231(-202, -371);
		field190.method206();
		var2.method231(-202, -171);
		field193.method206();
		var2.method231(0, -265);
		field194.method206();
		var2.method231(-562, -265);
		field195.method206();
		var2.method231(-128, -171);
		field196.method206();
		var2.method231(-562, -171);
		int[] var3 = new int[var2.field693];
		for (int var4 = 0; var4 < var2.field694; var4++) {
			for (int var5 = 0; var5 < var2.field693; var5++) {
				var3[var5] = var2.field692[var2.field693 * var4 + var2.field693 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field693; var6++) {
				var2.field692[var2.field693 * var4 + var6] = var3[var6];
			}
		}

		field191.method206();
		var2.method231(382, 0);
		field192.method206();
		var2.method231(-255, 0);
		field188.method206();
		var2.method231(254, 0);
		field189.method206();
		var2.method231(180, -371);
		field190.method206();
		var2.method231(180, -171);
		field193.method206();
		var2.method231(382, -265);
		field194.method206();
		var2.method231(-180, -265);
		field195.method206();
		var2.method231(254, -171);
		field196.method206();
		var2.method231(-180, -171);
		IBHUFTPE var7 = new IBHUFTPE(field533, "logo", 0);
		field188.method206();
		var7.method233(382 - var7.field693 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(ZII)Ljava/lang/String;")
	public static final String method156(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return "@red@";
		}

		if (var2 < -6) {
			return "@or3@";
		}

		if (var2 < -3) {
			return "@or2@";
		}

		if (var2 < 0) {
			return "@or1@";
		}

		if (var2 > 9) {
			return "@gre@";
		}

		if (var2 > 6) {
			return "@gr3@";
		}

		if (var2 > 3) {
			return "@gr2@";
		}

		if (var2 > 0) {
			return "@gr1@";
		}

		return "@yel@";
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method157() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.y(I)V")
	public final void method158() {
		for (GOHSICMY var1 = (GOHSICMY) field269.method246(); var1 != null; var1 = (GOHSICMY) field269.method248()) {
			if (field395 != var1.field678 || var1.field676) {
				var1.method589();
			} else if (field443 >= var1.field684) {
				var1.method221(field520);

				if (var1.field676) {
					var1.method589();
				} else {
					field394.method263(var1.field678, var1.field681, var1.field679, var1, var1.field680, 60, 0, false, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method159(int arg0) {
		if (arg0 >= 0) {
			int var2 = field405[arg0];
			int var3 = field406[arg0];
			int var4 = field407[arg0];
			int var5 = field408[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field471 != 0 && var4 != 1153) {
				field471 = 0;
				field271 = true;
			}

			if (var4 == 697 && method140(var5, var2, var3)) {
				field370.method346(121);
				field370.method381(field203);
				field370.method380(field246 + var3);
				field370.method380(field204);
				field370.method381(field245 + var2);
				field370.method381(field202);
				field370.method348(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 28) {
				String var6 = field365[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					long var8 = TGGPOZND.method547(var6.substring(var7 + 5).trim());
					int var10 = -1;
					for (int var11 = 0; var11 < field112; var11++) {
						if (field210[var11] == var8) {
							var10 = var11;
							break;
						}
					}

					if (var10 != -1 && field140[var10] > 0) {
						field271 = true;
						field471 = 0;
						field239 = true;
						field211 = "";
						field144 = 3;
						field114 = field210[var10];
						field300 = "Enter message to send to " + field511[var10];
					}
				}
			}

			if (var4 == 1881) {
				int var12 = var5 >> 14 & 0x7FFF;
				CUIVWWJO var13 = CUIVWWJO.method203(var12);
				String var14;
				if (var13.field565 == null) {
					var14 = "It's a " + var13.field593 + ".";
				} else {
					var14 = new String(var13.field565);
				}

				method102(var14, 0, "");
			}

			if (var4 == 1993) {
				AGZBBQJK var15 = AGZBBQJK.method11(var5);
				String var16;
				if (var15.field12 == null) {
					var16 = "It's a " + var15.field40 + ".";
				} else {
					var16 = new String(var15.field12);
				}

				method102(var16, 0, "");
			}

			if (var4 == 1478) {
				method140(var5, var2, var3);
				field370.method346(158);
				field370.method380(field245 + var2);
				field370.method380(var5 >> 14 & 0x7FFF);
				field370.method380(field246 + var3);
			}

			if (var4 == 78) {
				method101();
			}

			if (var4 == 157) {
				ACKJULTZ var17 = field530[var5];
				if (var17 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var17.field834[0], var17.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(95);
					field370.method381(var5);
				}
			}

			if (var4 == 614) {
				String var18 = field365[arg0];
				int var19 = var18.indexOf("@whi@");
				if (var19 != -1) {
					if (field304 == -1) {
						method101();
						field524 = var18.substring(var19 + 5).trim();
						field498 = false;
						field330 = field304 = MYGSUHVG.field1035;
					} else {
						method102("Please close the interface you have open before using 'report abuse'", 0, "");
					}
				}
			}

			if (var4 == 497) {
				field370.method346(116);
				field370.method348(var2);
				field370.method380(var5);
				field370.method382(var3);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 878) {
				field370.method346(188);
				field370.method348(field204);
				field370.method380(field203);
				field370.method348(var3);
				field370.method382(var5);
				field370.method380(field202);
				field370.method380(var2);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 600) {
				field370.method346(155);
				field370.method348(var3);
				MYGSUHVG var20 = MYGSUHVG.method402(var3);
				if (var20.field1094 != null && var20.field1094[0][0] == 5) {
					int var21 = var20.field1094[0][1];
					field467[var21] = 1 - field467[var21];
					method89(var21);
					field227 = true;
				}
			}

			if (var4 == 495) {
				BSQIIHOT var22 = field131[var5];
				if (var22 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var22.field834[0], var22.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(230);
					field370.method382(field351);
					field370.method348(var5);
				}
			}

			if (var4 == 956) {
				ACKJULTZ var23 = field530[var5];
				if (var23 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var23.field834[0], var23.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;

					if ((var5 & 0x3) == 0) {
						field362++;
					}

					if (field362 >= 147) {
						field370.method346(34);
						field370.method351(0);
						field362 = 0;
					}

					field370.method346(233);
					field370.method348(var5);
				}
			}

			if (var4 == 881) {
				field370.method346(111);
				field370.method380(var2);
				field370.method381(var5);
				field370.method348(var3);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 635) {
				field370.method346(51);
				field370.method382(var3);
				field370.method380(var5);
				field370.method380(var2);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 592) {
				field370.method346(11);
				field370.method380(var3);
				field370.method380(var5);
				field370.method380(var2);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 369) {
				BSQIIHOT var24 = field131[var5];
				if (var24 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var24.field834[0], var24.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(139);
					field370.method380(var5);
				}
			}

			if (var4 == 212) {
				field370.method346(103);
				field370.method382(var3);
				field370.method382(var5);
				field370.method380(var2);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 2) {
				if (field278) {
					field394.method290(var2 - 4, var3 - 4);
				} else {
					field394.method290(field1122 - 4, field1123 - 4);
				}
			}

			if (var4 == 416) {
				ACKJULTZ var25 = field530[var5];
				if (var25 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var25.field834[0], var25.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(101);
					field370.method382(field203);
					field370.method382(field204);
					field370.method381(field202);
					field370.method380(var5);
				}
			}

			if (var4 == 314) {
				BSQIIHOT var26 = field131[var5];
				if (var26 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var26.field834[0], var26.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field225 += var5;
					if (field225 >= 91) {
						field370.method346(86);
						field370.method348(51305);
						field225 = 0;
					}

					field370.method346(91);
					field370.method382(var5);
				}
			}

			if (var4 == 732) {
				method140(var5, var2, var3);
				field370.method346(201);
				field370.method380(field245 + var2);
				field370.method381(field246 + var3);
				field370.method382(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 745) {
				boolean var27 = method131(0, 0, 0, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
				if (!var27) {
					method131(1, 0, 1, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
				}

				field264 = field1122;
				field265 = field1123;
				field267 = 2;
				field266 = 0;
				field370.method346(73);
				field370.method381(field245 + var2);
				field370.method382(field246 + var3);
				field370.method380(var5);
			}

			if (var4 == 872) {
				field370.method346(126);
				field370.method348(var2);
				field370.method382(var3);
				field370.method348(var5);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 603) {
				boolean var29 = method131(0, 0, 0, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
				if (!var29) {
					method131(1, 0, 1, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
				}

				field264 = field1122;
				field265 = field1123;
				field267 = 2;
				field266 = 0;
				field370.method346(81);
				field370.method348(var5);
				field370.method380(field245 + var2);
				field370.method382(field246 + var3);
			}

			if (var4 == 912) {
				ACKJULTZ var31 = field530[var5];
				if (var31 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var31.field834[0], var31.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(69);
					field370.method382(var5);
				}
			}

			if (var4 == 274) {
				BSQIIHOT var32 = field131[var5];
				if (var32 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var32.field834[0], var32.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(112);
					field370.method348(var5);
				}
			}

			if (var4 == 829) {
				field370.method346(175);
				field370.method348(var5);
				field370.method380(var2);
				field370.method382(var3);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 917 && method140(var5, var2, var3)) {
				field370.method346(16);
				field370.method348(field246 + var3);
				field370.method381(field351);
				field370.method381(field245 + var2);
				field370.method382(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 176) {
				field370.method346(226);
				field370.method380(var3);
				field370.method382(var5);
				field370.method382(var2);
				field382 = 0;
				field383 = var3;
				field384 = var2;
				field385 = 2;
				if (MYGSUHVG.method402(var3).field1033 == field304) {
					field385 = 1;
				}

				if (MYGSUHVG.method402(var3).field1033 == field548) {
					field385 = 3;
				}
			}

			if (var4 == 804) {
				ACKJULTZ var33 = field530[var5];
				if (var33 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var33.field834[0], var33.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(210);
					field370.method381(var5);
				}
			}

			if (var4 == 567) {
				BSQIIHOT var34 = field131[var5];
				if (var34 != null) {
					method131(1, 0, 1, 0, 0, 2, false, var34.field834[0], var34.field835[0], field459.field835[0], field459.field834[0]);
					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(85);
					field370.method380(field202);
					field370.method348(var5);
					field370.method380(field203);
					field370.method380(field204);
				}
			}

			if (var4 == 702) {
				field198 += field245;
				if (field198 >= 105) {
					field370.method346(53);
					field370.method347(45);
					field198 = 0;
				}

				method140(var5, var2, var3);
				field370.method346(14);
				field370.method381(field246 + var3);
				field370.method380(var5 >> 14 & 0x7FFF);
				field370.method382(field245 + var2);
			}

			if (var4 == 1581) {
				ACKJULTZ var35 = field530[var5];
				if (var35 != null) {
					LQFHJGYA var36 = var35.field1;
					if (var36.field872 != null) {
						var36 = var36.method316();
					}

					if (var36 != null) {
						String var37;
						if (var36.field868 == null) {
							var37 = "It's a " + var36.field859 + ".";
						} else {
							var37 = new String(var36.field868);
						}

						method102(var37, 0, "");
					}
				}
			}

			if (var4 == 25) {
				field201 = 1;
				field202 = var2;
				field203 = var3;
				field204 = var5;
				field205 = String.valueOf(AGZBBQJK.method11(var5).field40);
				field350 = 0;
				field227 = true;
			} else {
				if (var4 == 253 && !field197) {
					field370.method346(78);
					field370.method348(var3);
					field197 = true;
				}

				if (var4 == 191) {
					BSQIIHOT var38 = field131[var5];
					if (var38 != null) {
						method131(1, 0, 1, 0, 0, 2, false, var38.field834[0], var38.field835[0], field459.field835[0], field459.field834[0]);
						field264 = field1122;
						field265 = field1123;
						field267 = 2;
						field266 = 0;
						field370.method346(138);
						field370.method381(var5);
					}
				}

				if (var4 == 639) {
					MYGSUHVG var39 = MYGSUHVG.method402(var3);
					boolean var40 = true;
					if (var39.field1080 > 0) {
						var40 = method123(var39);
					}

					if (var40) {
						field370.method346(155);
						field370.method348(var3);
					}
				}

				if (var4 == 601) {
					method140(var5, var2, var3);
					field370.method346(129);
					field370.method382(field245 + var2);
					field370.method381(field246 + var3);
					field370.method348(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 194) {
					boolean var41 = method131(0, 0, 0, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
					if (!var41) {
						method131(1, 0, 1, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
					}

					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(114);
					field370.method348(var5);
					field370.method348(field245 + var2);
					field370.method380(field246 + var3);
				}

				if (var4 == 644) {
					boolean var43 = method131(0, 0, 0, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
					if (!var43) {
						method131(1, 0, 1, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
					}

					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(190);
					field370.method381(var5);
					field370.method382(field246 + var3);
					field370.method382(field245 + var2);
				}

				if (var4 == 1169) {
					AGZBBQJK var45 = AGZBBQJK.method11(var5);
					MYGSUHVG var46 = MYGSUHVG.method402(var3);
					String var47;
					if (var46 != null && var46.field1063[var2] >= 100000) {
						var47 = var46.field1063[var2] + " x " + var45.field40;
					} else if (var45.field12 == null) {
						var47 = "It's a " + var45.field40 + ".";
					} else {
						var47 = new String(var45.field12);
					}

					method102(var47, 0, "");
				}

				if (var4 == 645) {
					field370.method346(155);
					field370.method348(var3);
					MYGSUHVG var48 = MYGSUHVG.method402(var3);
					if (var48.field1094 != null && var48.field1094[0][0] == 5) {
						int var49 = var48.field1094[0][1];
						if (field467[var49] != var48.field1087[0]) {
							field467[var49] = var48.field1087[0];
							method89(var49);
							field227 = true;
						}
					}
				}

				if (var4 == 141) {
					method112(field509);
					field509 = -1;
					field271 = true;
				}

				if (var4 == 200) {
					field370.method346(4);
					field370.method348(var5);
					field370.method348(var3);
					field370.method348(var2);
					field370.method382(field351);
					field382 = 0;
					field383 = var3;
					field384 = var2;
					field385 = 2;
					if (MYGSUHVG.method402(var3).field1033 == field304) {
						field385 = 1;
					}

					if (MYGSUHVG.method402(var3).field1033 == field548) {
						field385 = 3;
					}
				}

				if (var4 == 536 || var4 == 691) {
					String var50 = field365[arg0];
					int var51 = var50.indexOf("@whi@");
					if (var51 != -1) {
						var50 = var50.substring(var51 + 5).trim();
						String var52 = TGGPOZND.method551(TGGPOZND.method548(TGGPOZND.method547(var50)));
						boolean var53 = false;
						for (int var54 = 0; var54 < field132; var54++) {
							BSQIIHOT var55 = field131[field133[var54]];
							if (var55 != null && var55.field80 != null && var55.field80.equalsIgnoreCase(var52)) {
								method131(1, 0, 1, 0, 0, 2, false, var55.field834[0], var55.field835[0], field459.field835[0], field459.field834[0]);

								if (var4 == 536) {
									field370.method346(138);
									field370.method381(field133[var54]);
								}

								if (var4 == 691) {
									field225 += var5;
									if (field225 >= 91) {
										field370.method346(86);
										field370.method348(51305);
										field225 = 0;
									}

									field370.method346(91);
									field370.method382(field133[var54]);
								}

								var53 = true;
								break;
							}
						}

						if (!var53) {
							method102("Unable to find " + var52, 0, "");
						}
					}
				}

				if (var4 == 48) {
					BSQIIHOT var56 = field131[var5];
					if (var56 != null) {
						method131(1, 0, 1, 0, 0, 2, false, var56.field834[0], var56.field835[0], field459.field835[0], field459.field834[0]);
						field264 = field1122;
						field265 = field1123;
						field267 = 2;
						field266 = 0;
						field438++;
						if (field438 >= 88) {
							field370.method346(6);
							field370.method348(33600);
							field438 = 0;
						}

						field370.method346(140);
						field370.method382(var5);
					}
				}

				if (var4 == 450) {
					boolean var57 = method131(0, 0, 0, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
					if (!var57) {
						method131(1, 0, 1, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
					}

					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(222);
					field370.method348(var5);
					field370.method382(field351);
					field370.method380(field245 + var2);
					field370.method382(field246 + var3);
				}

				if (var4 == 348) {
					field370.method346(194);
					field370.method348(var5);
					field370.method382(var3);
					field370.method381(var2);
					field382 = 0;
					field383 = var3;
					field384 = var2;
					field385 = 2;
					if (MYGSUHVG.method402(var3).field1033 == field304) {
						field385 = 1;
					}

					if (MYGSUHVG.method402(var3).field1033 == field548) {
						field385 = 3;
					}
				}

				if (var4 == 344) {
					boolean var59 = method131(0, 0, 0, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
					if (!var59) {
						method131(1, 0, 1, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
					}

					field264 = field1122;
					field265 = field1123;
					field267 = 2;
					field266 = 0;
					field370.method346(117);
					field370.method382(field245 + var2);
					field370.method380(var5);
					field370.method380(field246 + var3);
				}

				if (var4 == 87 || var4 == 235 || var4 == 612 || var4 == 199) {
					String var61 = field365[arg0];
					int var62 = var61.indexOf("@whi@");
					if (var62 != -1) {
						long var63 = TGGPOZND.method547(var61.substring(var62 + 5).trim());
						if (var4 == 87) {
							method178(var63);
						}

						if (var4 == 235) {
							method83(var63);
						}

						if (var4 == 612) {
							method103(var63);
						}

						if (var4 == 199) {
							method63(var63);
						}
					}
				}

				if (var4 == 201) {
					MYGSUHVG var65 = MYGSUHVG.method402(var3);
					field350 = 1;
					field351 = var3;
					field352 = var65.field1036;
					field201 = 0;
					field227 = true;
					String var66 = var65.field1085;
					if (var66.indexOf(" ") != -1) {
						var66 = var66.substring(0, var66.indexOf(" "));
					}

					String var67 = var65.field1085;
					if (var67.indexOf(" ") != -1) {
						var67 = var67.substring(var67.indexOf(" ") + 1);
					}

					field353 = var66 + " " + var65.field1042 + " " + var67;

					if (field352 == 16) {
						field227 = true;
						field338 = 3;
						field128 = true;
					}
				} else {
					if (var4 == 950) {
						ACKJULTZ var68 = field530[var5];
						if (var68 != null) {
							method131(1, 0, 1, 0, 0, 2, false, var68.field834[0], var68.field835[0], field459.field835[0], field459.field834[0]);
							field264 = field1122;
							field265 = field1123;
							field267 = 2;
							field266 = 0;
							field370.method346(93);
							field370.method348(var5);
						}
					}

					if (var4 == 861) {
						method140(var5, var2, var3);
						field370.method346(242);
						field370.method382(field245 + var2);
						field370.method348(var5 >> 14 & 0x7FFF);
						field370.method380(field246 + var3);
					}

					if (var4 == 368) {
						boolean var69 = method131(0, 0, 0, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
						if (!var69) {
							method131(1, 0, 1, 0, 0, 2, false, var2, var3, field459.field835[0], field459.field834[0]);
						}

						field264 = field1122;
						field265 = field1123;
						field267 = 2;
						field266 = 0;
						field370.method346(38);
						field370.method382(field203);
						field370.method380(field246 + var3);
						field370.method381(var5);
						field370.method381(field204);
						field370.method382(field245 + var2);
						field370.method382(field202);
					}

					if (var4 == 139) {
						field370.method346(27);
						field370.method382(var3);
						field370.method380(var5);
						field370.method381(var2);
						field382 = 0;
						field383 = var3;
						field384 = var2;
						field385 = 2;
						if (MYGSUHVG.method402(var3).field1033 == field304) {
							field385 = 1;
						}

						if (MYGSUHVG.method402(var3).field1033 == field548) {
							field385 = 3;
						}
					}

					if (var4 == 372) {
						ACKJULTZ var71 = field530[var5];
						if (var71 != null) {
							method131(1, 0, 1, 0, 0, 2, false, var71.field834[0], var71.field835[0], field459.field835[0], field459.field834[0]);
							field264 = field1122;
							field265 = field1123;
							field267 = 2;
							field266 = 0;
							field370.method346(221);
							field370.method381(var5);
							field370.method380(field351);
						}
					}

					field201 = 0;
					field350 = 0;
					field227 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method160(int arg0, int arg1) {
		IHMCQRZY var3 = field364[field395][arg0][arg1];
		if (var3 == null) {
			field394.method273(field395, arg0, arg1);
		} else {
			int var4 = -99999999;
			GEPRJOHJ var5 = null;
			for (GEPRJOHJ var6 = (GEPRJOHJ) var3.method246(); var6 != null; var6 = (GEPRJOHJ) var3.method248()) {
				AGZBBQJK var7 = AGZBBQJK.method11(var6.field650);
				int var8 = var7.field25;
				if (var7.field13) {
					var8 = (var6.field649 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method244(var5);
			GEPRJOHJ var9 = null;
			GEPRJOHJ var10 = null;
			for (GEPRJOHJ var11 = (GEPRJOHJ) var3.method246(); var11 != null; var11 = (GEPRJOHJ) var3.method248()) {
				if (var5.field650 != var11.field650 && var9 == null) {
					var9 = var11;
				}

				if (var5.field650 != var11.field650 && var9.field650 != var11.field650 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field394.method259(var10, field395, arg0, var12, var5, var9, method68(arg1 * 128 + 64, arg0 * 128 + 64, field395), arg1);
		}
	}

	@ObfuscatedName("client.b(LMVHXDWGI;II)V")
	public final void method161(MVHXDWGI arg0, int arg1) {
		while (arg0.field1015 + 21 < arg1 * 8) {
			int var3 = arg0.method368(14);
			if (var3 == 16383) {
				break;
			}

			if (field530[var3] == null) {
				field530[var3] = new ACKJULTZ();
			}

			ACKJULTZ var4 = field530[var3];
			field532[field531++] = var3;
			var4.field813 = field443;
			int var5 = arg0.method368(1);
			var4.field1 = LQFHJGYA.method315(arg0.method368(13));
			int var6 = arg0.method368(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method368(1);
			if (var7 == 1) {
				field135[field134++] = var3;
			}

			int var8 = arg0.method368(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field812 = var4.field1.field888;
			var4.field831 = var4.field1.field887;
			var4.field805 = var4.field1.field884;
			var4.field806 = var4.field1.field869;
			var4.field807 = var4.field1.field889;
			var4.field808 = var4.field1.field863;
			var4.field832 = var4.field1.field894;
			var4.method306(field459.field835[0] + var6, var5 == 1, field459.field834[0] + var8);
		}

		arg0.method369();
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method162() {
		if (field281 == 0) {
			int var1 = field1121;
			if (field350 == 1 && field1122 >= 516 && field1123 >= 160 && field1122 <= 765 && field1123 <= 205) {
				var1 = 0;
			}

			if (field278) {
				if (var1 != 1) {
					int var2 = field1115;
					int var3 = field1116;
					if (field481 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field481 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field481 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field482 - 10 || var2 > field484 + field482 + 10 || var3 < field483 - 10 || var3 > field485 + field483 + 10) {
						field278 = false;

						if (field481 == 1) {
							field227 = true;
						}

						if (field481 == 2) {
							field271 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field482;
					int var5 = field483;
					int var6 = field484;
					int var7 = field1122;
					int var8 = field1123;
					if (field481 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field481 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field481 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field230; var10++) {
						int var11 = (field230 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method159(var9);
					}

					field278 = false;

					if (field481 == 1) {
						field227 = true;
					}

					if (field481 == 2) {
						field271 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field230 > 0) {
					int var12 = field407[field230 - 1];
					if (var12 == 872 || var12 == 348 || var12 == 881 || var12 == 829 || var12 == 497 || var12 == 176 || var12 == 212 || var12 == 592 || var12 == 635 || var12 == 139 || var12 == 25 || var12 == 1169) {
						int var13 = field405[field230 - 1];
						int var14 = field406[field230 - 1];
						MYGSUHVG var15 = MYGSUHVG.method402(var14);
						if (var15.field1031 || var15.field1079) {
							field518 = false;
							field161 = 0;
							field279 = var14;
							field280 = var13;
							field281 = 2;
							field282 = field1122;
							field283 = field1123;

							if (MYGSUHVG.method402(var14).field1033 == field304) {
								field281 = 1;
							}

							if (MYGSUHVG.method402(var14).field1033 == field548) {
								field281 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field539 == 1 || method184(field230 - 1)) && field230 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field230 > 0) {
					method159(field230 - 1);
				}

				if (var1 != 2 || field230 <= 0) {
					return;
				}

				method185();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = PDVZPZLT.field1197[var7];
			int var13 = PDVZPZLT.field1198[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = PDVZPZLT.field1197[var8];
			int var16 = PDVZPZLT.field1198[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field314 = arg5 - var9;
		field315 = arg1 - var10;
		field316 = arg2 - var11;
		field317 = arg4;
		field318 = arg3;
	}

	@ObfuscatedName("client.p(Z)V")
	public static final void method164() {
		JFQWYHZJ.field722 = true;
		THHUVKBK.field1402 = true;
		field329 = true;
		SBZYTIRX.field1349 = true;
		CUIVWWJO.field555 = true;
	}

	@ObfuscatedName("client.o(B)V")
	public final void method165() {
		if (field281 == 0) {
			field365[0] = "Cancel";
			field407[0] = 1153;
			field230 = 1;
			if (field446 == -1) {
				method183();
				field434 = 0;
				field220 = 0;

				if (field1115 > 4 && field1116 > 4 && field1115 < 516 && field1116 < 338) {
					if (field304 == -1) {
						method189();
					} else {
						method128(0, 4, 0, field1115, 4, field1116, MYGSUHVG.method402(field304));
					}
				}

				if (field434 != field226) {
					field226 = field434;
				}

				if (field220 != field185) {
					field185 = field220;
				}

				field434 = 0;
				field220 = 0;

				if (field1115 > 553 && field1116 > 205 && field1115 < 743 && field1116 < 466) {
					if (field111 != -1) {
						method128(0, 553, 1, field1115, 205, field1116, MYGSUHVG.method402(field111));
					} else if (field284[field338] != -1) {
						method128(0, 553, 1, field1115, 205, field1116, MYGSUHVG.method402(field284[field338]));
					}
				}

				if (field434 != field176) {
					field227 = true;
					field176 = field434;
				}

				if (field276 != field220) {
					field227 = true;
					field276 = field220;
				}

				field434 = 0;
				field220 = 0;

				if (field1115 > 17 && field1116 > 357 && field1115 < 496 && field1116 < 453) {
					if (field548 != -1) {
						method128(0, 17, 2, field1115, 357, field1116, MYGSUHVG.method402(field548));
					} else if (field509 != -1) {
						method128(0, 17, 3, field1115, 357, field1116, MYGSUHVG.method402(field509));
					} else if (field1116 < 434 && field1115 < 426 && field471 == 0) {
						method50(field1116 - 357, field1115 - 17);
					}
				}

				if ((field548 != -1 || field509 != -1) && field434 != field263) {
					field271 = true;
					field263 = field434;
				}

				if ((field548 != -1 || field509 != -1) && field220 != field115) {
					field271 = true;
					field115 = field220;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field230 - 1; var2++) {
						if (field407[var2] < 1000 && field407[var2 + 1] > 1000) {
							String var3 = field365[var2];
							field365[var2] = field365[var2 + 1];
							field365[var2 + 1] = var3;
							int var4 = field407[var2];
							field407[var2] = field407[var2 + 1];
							field407[var2 + 1] = var4;
							int var5 = field405[var2];
							field405[var2] = field405[var2 + 1];
							field405[var2 + 1] = var5;
							int var6 = field406[var2];
							field406[var2] = field406[var2 + 1];
							field406[var2 + 1] = var6;
							int var7 = field408[var2];
							field408[var2] = field408[var2 + 1];
							field408[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field434 = 0;
				field220 = 0;
				method128(0, 0, 0, field1115, 0, field1116, MYGSUHVG.method402(field446));

				if (field434 != field226) {
					field226 = field434;
				}

				if (field220 != field185) {
					field185 = field220;
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method166() {
		for (int var1 = -1; var1 < field132; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field130;
			} else {
				var2 = field133[var1];
			}

			BSQIIHOT var3 = field131[var2];
			if (var3 != null) {
				method53(1, var3);
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method167() {
		if (field491 > 0) {
			method110();
		} else {
			method111("Please wait - attempting to reestablish", "Connection lost");
			field186 = 0;
			field323 = 0;
			TYRTFBBQ var1 = field363;
			field182 = false;
			field523 = 0;
			method133(field426, field427, true);

			if (!field182) {
				method110();
			}

			try {
				var1.method574();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.c(ILMVHXDWGI;I)V")
	public final void method168(int arg0, MVHXDWGI arg1) {
		arg1.method367();
		int var3 = arg1.method368(1);
		if (var3 != 0) {
			int var4 = arg1.method368(2);
			if (var4 == 0) {
				field135[field134++] = field130;
			} else if (var4 == 1) {
				int var5 = arg1.method368(3);
				field459.method303(var5, false);
				int var6 = arg1.method368(1);
				if (var6 == 1) {
					field135[field134++] = field130;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method368(3);
				field459.method303(var7, true);
				int var8 = arg1.method368(3);
				field459.method303(var8, true);
				int var9 = arg1.method368(1);
				if (var9 == 1) {
					field135[field134++] = field130;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method368(1);
				field395 = arg1.method368(2);
				int var11 = arg1.method368(7);
				int var12 = arg1.method368(1);
				if (var12 == 1) {
					field135[field134++] = field130;
				}

				int var13 = arg1.method368(7);
				field459.method306(var13, var10 == 1, var11);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method169(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method169(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.b(ILjava/lang/String;)V")
	public final void method170(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field235 = 0;
		} else {
			String var2 = arg0;
			String[] var3 = new String[100];
			int var4 = 0;
			while (true) {
				int var5 = var2.indexOf(" ");
				if (var5 == -1) {
					break;
				}

				String var6 = var2.substring(0, var5).trim();
				if (var6.length() > 0) {
					var3[var4++] = var6.toLowerCase();
				}

				var2 = var2.substring(var5 + 1);
			}

			var2 = var2.trim();
			if (var2.length() > 0) {
				var3[var4++] = var2.toLowerCase();
			}

			field235 = 0;
			label46: for (int var7 = 0; var7 < AGZBBQJK.field44; var7++) {
				AGZBBQJK var8 = AGZBBQJK.method11(var7);
				if (var8.field51 == -1 && var8.field40 != null) {
					String var9 = var8.field40.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field236[field235] = var9;
					field237[field235] = var7;
					field235++;
					if (field235 >= field236.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)Z")
	public final boolean method171() {
		if (field363 == null) {
			return false;
		}

		try {
			int var1 = field363.method576();
			if (var1 == 0) {
				return false;
			}

			if (field488 == -1) {
				field363.method577(field221.field1013, 0, 1);
				field488 = field221.field1013[0] & 0xFF;
				if (field175 != null) {
					field488 = field488 - field175.method483() & 0xFF;
				}

				field487 = EMUGFALT.field605[field488];
				var1--;
			}

			if (field487 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field363.method577(field221.field1013, 0, 1);
				field487 = field221.field1013[0] & 0xFF;
				var1--;
			}

			if (field487 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field363.method577(field221.field1013, 0, 2);
				field221.field1014 = 0;
				field487 = field221.method359();
				var1 -= 2;
			}

			if (var1 < field487) {
				return false;
			}

			field221.field1014 = 0;
			field363.method577(field221.field1013, 0, field487);
			field489 = 0;
			field311 = field310;
			field310 = field309;
			field309 = field488;

			if (field488 == 154) {
				int var2 = field221.method384();
				int var3 = field221.method390();
				field380[var2] = var3;

				if (field467[var2] != var3) {
					field467[var2] = var3;
					method89(var2);
					field227 = true;

					if (field509 != -1) {
						field271 = true;
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 65) {
				field534 = field221.method376();
				field535 = field221.method377();
				for (int var4 = field534; var4 < field534 + 8; var4++) {
					for (int var5 = field535; var5 < field535 + 8; var5++) {
						if (field364[field395][var4][var5] != null) {
							field364[field395][var4][var5] = null;
							method160(var4, var5);
						}
					}
				}

				for (XEHNJCHN var6 = (XEHNJCHN) field162.method246(); var6 != null; var6 = (XEHNJCHN) field162.method248()) {
					if (var6.field1494 >= field534 && var6.field1494 < field534 + 8 && var6.field1495 >= field535 && var6.field1495 < field535 + 8 && field395 == var6.field1492) {
						var6.field1491 = 0;
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 207) {
				for (int var7 = 0; var7 < field467.length; var7++) {
					if (field467[var7] != field380[var7]) {
						field467[var7] = field380[var7];
						method89(var7);
						field227 = true;
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 35) {
				int var8 = field221.method359();
				int var9 = field221.method359();
				method66(var9);

				if (var8 != -1) {
					method66(var8);
				}

				if (field304 != -1) {
					method112(field304);
					field304 = -1;
				}

				if (field111 != -1) {
					method112(field111);
					field111 = -1;
				}

				if (field548 != -1) {
					method112(field548);
					field548 = -1;
				}

				if (field446 != var9) {
					method112(field446);
					field446 = var9;
				}

				if (field376 != var9) {
					method112(field376);
					field376 = var8;
				}

				field471 = 0;
				field197 = false;
				field488 = -1;
				return true;
			}

			if (field488 == 115) {
				int var10 = field221.method385();
				int var11 = field221.method385();
				int var12 = field221.method385();
				if (var11 == 0xFFFF) {
					MYGSUHVG.method402(var12).field1046 = 0;
					field488 = -1;
					return true;
				}

				AGZBBQJK var13 = AGZBBQJK.method11(var11);
				MYGSUHVG.method402(var12).field1046 = 4;
				MYGSUHVG.method402(var12).field1047 = var11;
				MYGSUHVG.method402(var12).field1053 = var13.field21;
				MYGSUHVG.method402(var12).field1054 = var13.field15;
				MYGSUHVG.method402(var12).field1052 = var13.field54 * 100 / var10;
				field488 = -1;
				return true;
			}

			if (field488 == 12) {
				field186 = field221.method357();
				field488 = -1;
				return true;
			}

			if (field488 == 21 || field488 == 15) {
				int var14 = field386;
				int var15 = field387;
				if (field488 == 21) {
					var15 = field221.method383();
					var14 = field221.method359();
					field486 = false;
				}

				if (field488 == 15) {
					var15 = field221.method385();
					var14 = field221.method359();
					field221.method367();

					for (int var16 = 0; var16 < 4; var16++) {
						for (int var17 = 0; var17 < 13; var17++) {
							for (int var18 = 0; var18 < 13; var18++) {
								int var19 = field221.method368(1);
								if (var19 == 1) {
									field261[var16][var17][var18] = field221.method368(26);
								} else {
									field261[var16][var17][var18] = -1;
								}
							}
						}
					}

					field221.method369();
					field486 = true;
				}

				if (field386 == var14 && field387 == var15 && field289 == 2) {
					field488 = -1;
					return true;
				}

				field386 = var14;
				field387 = var15;
				field245 = (field386 - 6) * 8;
				field246 = (field387 - 6) * 8;
				field527 = false;
				if ((field386 / 8 == 48 || field386 / 8 == 49) && field387 / 8 == 48) {
					field527 = true;
				}

				if (field386 / 8 == 48 && field387 / 8 == 148) {
					field527 = true;
				}

				field289 = 1;
				field260 = System.currentTimeMillis();
				method111(null, "Loading - please wait.");

				if (field488 == 21) {
					int var20 = 0;
					for (int var21 = (field386 - 6) / 8; var21 <= (field386 + 6) / 8; var21++) {
						for (int var22 = (field387 - 6) / 8; var22 <= (field387 + 6) / 8; var22++) {
							var20++;
						}
					}

					field349 = new byte[var20][];
					field240 = new byte[var20][];
					field215 = new int[var20];
					field216 = new int[var20];
					field217 = new int[var20];
					int var23 = 0;
					for (int var24 = (field386 - 6) / 8; var24 <= (field386 + 6) / 8; var24++) {
						for (int var25 = (field387 - 6) / 8; var25 <= (field387 + 6) / 8; var25++) {
							field215[var23] = (var24 << 8) + var25;

							if (field527 && (var25 == 49 || var25 == 149 || var25 == 147 || var24 == 50 || var24 == 49 && var25 == 47)) {
								field216[var23] = -1;
								field217[var23] = -1;
								var23++;
							} else {
								int var26 = field216[var23] = field381.method507(0, var24, var25);
								if (var26 != -1) {
									field381.method516(3, var26);
								}

								int var27 = field217[var23] = field381.method507(1, var24, var25);
								if (var27 != -1) {
									field381.method516(3, var27);
								}

								var23++;
							}
						}
					}
				}

				if (field488 == 15) {
					int var28 = 0;
					int[] var29 = new int[676];
					for (int var30 = 0; var30 < 4; var30++) {
						for (int var31 = 0; var31 < 13; var31++) {
							for (int var32 = 0; var32 < 13; var32++) {
								int var33 = field261[var30][var31][var32];
								if (var33 != -1) {
									int var34 = var33 >> 14 & 0x3FF;
									int var35 = var33 >> 3 & 0x7FF;
									int var36 = (var34 / 8 << 8) + var35 / 8;
									for (int var37 = 0; var37 < var28; var37++) {
										if (var29[var37] == var36) {
											var36 = -1;
											break;
										}
									}

									if (var36 != -1) {
										var29[var28++] = var36;
									}
								}
							}
						}
					}

					field349 = new byte[var28][];
					field240 = new byte[var28][];
					field215 = new int[var28];
					field216 = new int[var28];
					field217 = new int[var28];
					for (int var38 = 0; var38 < var28; var38++) {
						int var39 = field215[var38] = var29[var38];
						int var40 = var39 >> 8 & 0xFF;
						int var41 = var39 & 0xFF;
						int var42 = field216[var38] = field381.method507(0, var40, var41);
						if (var42 != -1) {
							field381.method516(3, var42);
						}

						int var43 = field217[var38] = field381.method507(1, var40, var41);
						if (var43 != -1) {
							field381.method516(3, var43);
						}
					}
				}

				int var44 = field245 - field247;
				int var45 = field246 - field248;
				field247 = field245;
				field248 = field246;

				for (int var46 = 0; var46 < 16384; var46++) {
					ACKJULTZ var47 = field530[var46];
					if (var47 != null) {
						for (int var48 = 0; var48 < 10; var48++) {
							var47.field834[var48] -= var44;
							var47.field835[var48] -= var45;
						}

						var47.field828 -= var44 * 128;
						var47.field829 -= var45 * 128;
					}
				}

				for (int var49 = 0; var49 < field129; var49++) {
					BSQIIHOT var50 = field131[var49];
					if (var50 != null) {
						for (int var51 = 0; var51 < 10; var51++) {
							var50.field834[var51] -= var44;
							var50.field835[var51] -= var45;
						}

						var50.field828 -= var44 * 128;
						var50.field829 -= var45 * 128;
					}
				}

				field214 = true;
				byte var52 = 0;
				byte var53 = 104;
				byte var54 = 1;
				if (var44 < 0) {
					var52 = 103;
					var53 = -1;
					var54 = -1;
				}

				byte var55 = 0;
				byte var56 = 104;
				byte var57 = 1;
				if (var45 < 0) {
					var55 = 103;
					var56 = -1;
					var57 = -1;
				}

				for (int var58 = var52; var58 != var53; var58 += var54) {
					for (int var59 = var55; var59 != var56; var59 += var57) {
						int var60 = var44 + var58;
						int var61 = var45 + var59;
						for (int var62 = 0; var62 < 4; var62++) {
							if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
								field364[var62][var58][var59] = field364[var62][var60][var61];
							} else {
								field364[var62][var58][var59] = null;
							}
						}
					}
				}

				for (XEHNJCHN var63 = (XEHNJCHN) field162.method246(); var63 != null; var63 = (XEHNJCHN) field162.method248()) {
					var63.field1494 -= var44;
					var63.field1495 -= var45;
					if (var63.field1494 < 0 || var63.field1495 < 0 || var63.field1494 >= 104 || var63.field1495 >= 104) {
						var63.method589();
					}
				}

				if (field323 != 0) {
					field323 -= var44;
					field324 -= var45;
				}

				field170 = false;
				field488 = -1;
				return true;
			}

			if (field488 == 218) {
				field228 = field221.method391();
				field360 = field221.method383();
				field409 = field221.method383();
				field221.method359();
				field229 = field221.method359();
				field221.method384();
				field109 = field221.method384();
				field379 = field221.method383();
				field221.method376();
				field307 = field221.method359();
				field221.method384();
				signlink.dnslookup(TGGPOZND.method550(field228));
				field488 = -1;
				return true;
			}

			if (field488 == 11) {
				long var64 = field221.method363();
				int var66 = field221.method357();
				String var67 = TGGPOZND.method551(TGGPOZND.method548(var64));
				for (int var68 = 0; var68 < field112; var68++) {
					if (field210[var68] == var64) {
						if (field140[var68] != var66) {
							field140[var68] = var66;
							field227 = true;

							if (var66 > 0) {
								method102(var67 + " has logged in.", 5, "");
							}

							if (var66 == 0) {
								method102(var67 + " has logged out.", 5, "");
							}
						}

						var67 = null;
						break;
					}
				}

				if (var67 != null && field112 < 200) {
					field210[field112] = var64;
					field511[field112] = var67;
					field140[field112] = var66;
					field112++;
					field227 = true;
				}

				boolean var69 = false;
				while (!var69) {
					var69 = true;
					for (int var70 = 0; var70 < field112 - 1; var70++) {
						if (field140[var70] != field326 && field140[var70 + 1] == field326 || field140[var70] == 0 && field140[var70 + 1] != 0) {
							int var71 = field140[var70];
							field140[var70] = field140[var70 + 1];
							field140[var70 + 1] = var71;
							String var72 = field511[var70];
							field511[var70] = field511[var70 + 1];
							field511[var70 + 1] = var72;
							long var73 = field210[var70];
							field210[var70] = field210[var70 + 1];
							field210[var70 + 1] = var73;
							field227 = true;
							var69 = false;
						}
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 64) {
				int var75 = field221.method359();
				int var76 = field221.method384();
				int var77 = field221.method383();
				int var78 = field221.method359();
				MYGSUHVG.method402(var75).field1053 = var78;
				MYGSUHVG.method402(var75).field1054 = var77;
				MYGSUHVG.method402(var75).field1052 = var76;
				field488 = -1;
				return true;
			}

			if (field488 == 244) {
				int var79 = field221.method359();
				int var80 = field221.method383();
				MYGSUHVG.method402(var80).field1046 = 1;
				MYGSUHVG.method402(var80).field1047 = var79;
				field488 = -1;
				return true;
			}

			if (field488 == 27) {
				String var81 = field221.method364();
				int var82 = field221.method384();
				MYGSUHVG.method402(var82).field1073 = var81;

				if (field284[field338] == MYGSUHVG.method402(var82).field1033) {
					field227 = true;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 204) {
				field535 = field221.method376();
				field534 = field221.method357();

				while (field221.field1014 < field487) {
					int var83 = field221.method357();
					method95(var83, field221);
				}

				field488 = -1;
				return true;
			}

			if (field488 == 83) {
				int var84 = field221.method359();
				if (var84 == 0xFFFF) {
					var84 = -1;
				}

				if (field306 != var84 && field435 && !field329 && field369 == 0) {
					field448 = var84;
					field449 = true;
					field381.method516(2, field448);
				}

				field306 = var84;
				field488 = -1;
				return true;
			}

			if (field488 == 232) {
				int var85 = field221.method359();
				int var86 = field221.method361();
				if (field435 && !field329) {
					field448 = var85;
					field449 = false;
					field381.method516(2, field448);
					field369 = var86;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 138) {
				field288 = field221.method357();
				field242 = field221.method357();
				field320 = field221.method357();
				field439 = true;
				field271 = true;
				field488 = -1;
				return true;
			}

			if (field488 == 84) {
				int var87 = field221.method383();
				byte var88 = field221.method379();
				field380[var87] = var88;

				if (field467[var87] != var88) {
					field467[var87] = var88;
					method89(var87);
					field227 = true;

					if (field509 != -1) {
						field271 = true;
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 136) {
				field292 = field221.method357();
				field488 = -1;
				return true;
			}

			if (field488 == 147) {
				int var89 = field221.method357();
				int var90 = field221.method357();
				int var91 = field221.method357();
				int var92 = field221.method357();
				field513[var89] = true;
				field545[var89] = var90;
				field497[var89] = var91;
				field262[var89] = var92;
				field480[var89] = 0;
				field488 = -1;
				return true;
			}

			if (field488 == 151) {
				field410 = field221.method357();
				if (field410 == field338) {
					if (field410 == 3) {
						field338 = 1;
					} else {
						field338 = 3;
					}

					field227 = true;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 24) {
				method114(field221, field487);
				field214 = false;
				field488 = -1;
				return true;
			}

			if (field488 == 165) {
				int var93 = field221.method385();
				method66(var93);

				if (field548 != -1) {
					method112(field548);
					field548 = -1;
					field271 = true;
				}

				if (field446 != -1) {
					method112(field446);
					field446 = -1;
					field259 = true;
				}

				if (field376 != -1) {
					method112(field376);
					field376 = -1;
				}

				if (field304 != -1) {
					method112(field304);
					field304 = -1;
				}

				if (field111 != var93) {
					method112(field111);
					field111 = var93;
				}

				if (field471 != 0) {
					field471 = 0;
					field271 = true;
				}

				field227 = true;
				field128 = true;
				field197 = false;
				field488 = -1;
				return true;
			}

			if (field488 == 155) {
				int var94 = field221.method385();
				int var95 = field221.method383();
				MYGSUHVG var96 = MYGSUHVG.method402(var94);
				if (var96 != null && var96.field1090 == 0) {
					if (var95 < 0) {
						var95 = 0;
					}

					if (var95 > var96.field1081 - var96.field1034) {
						var95 = var96.field1081 - var96.field1034;
					}

					var96.field1086 = var95;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 30) {
				int var97 = field221.method385();
				int var98 = field221.method385();
				int var99 = field221.method359();
				MYGSUHVG.method402(var97).field1055 = (var99 << 16) + var98;
				field488 = -1;
				return true;
			}

			if (field488 == 215) {
				field450 = field487 / 8;
				for (int var100 = 0; var100 < field450; var100++) {
					field145[var100] = field221.method363();
				}

				field488 = -1;
				return true;
			}

			if (field488 == 173) {
				field239 = false;
				field471 = 1;
				field294 = "";
				field271 = true;
				field488 = -1;
				return true;
			}

			if (field488 == 198) {
				int var101 = field221.method384();
				method66(var101);

				if (field111 != -1) {
					method112(field111);
					field111 = -1;
					field227 = true;
					field128 = true;
				}

				if (field446 != -1) {
					method112(field446);
					field446 = -1;
					field259 = true;
				}

				if (field376 != -1) {
					method112(field376);
					field376 = -1;
				}

				if (field304 != -1) {
					method112(field304);
					field304 = -1;
				}

				if (field548 != var101) {
					method112(field548);
					field548 = var101;
				}

				field197 = false;
				field271 = true;
				field488 = -1;
				return true;
			}

			if (field488 == 253) {
				int var102 = field221.method357();
				String var103 = field221.method364();
				int var104 = field221.method376();
				if (var102 >= 1 && var102 <= 5) {
					if (var103.equalsIgnoreCase("null")) {
						var103 = null;
					}

					field343[var102 - 1] = var103;
					field344[var102 - 1] = var104 == 0;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 122) {
				field323 = 0;
				field488 = -1;
				return true;
			}

			if (field488 == 199) {
				field460 = field221.method385() * 30;
				field488 = -1;
				return true;
			}

			if (field488 == 61) {
				field535 = field221.method377();
				field534 = field221.method376();
				field488 = -1;
				return true;
			}

			if (field488 == 87) {
				int var105 = field221.method385();
				method66(var105);

				if (field111 != -1) {
					method112(field111);
					field111 = -1;
					field227 = true;
					field128 = true;
				}

				if (field548 != -1) {
					method112(field548);
					field548 = -1;
					field271 = true;
				}

				if (field446 != -1) {
					method112(field446);
					field446 = -1;
					field259 = true;
				}

				if (field376 != -1) {
					method112(field376);
					field376 = -1;
				}

				if (field304 != var105) {
					method112(field304);
					field304 = var105;
				}

				if (field471 != 0) {
					field471 = 0;
					field271 = true;
				}

				field197 = false;
				field488 = -1;
				return true;
			}

			if (field488 == 123) {
				int var106 = field221.method359();
				int var107 = field221.method357();
				int var108 = field221.method359();
				if (var108 == 0xFFFF) {
					if (field291 < 50) {
						field302[field291] = (short) var106;
						field337[field291] = var107;
						field322[field291] = 0;
						field291++;
					}
				} else if (field177 && !field329 && field291 < 50) {
					field302[field291] = var106;
					field337[field291] = var107;
					field322[field291] = WTXWLORU.field1466[var106] + var108;
					field291++;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 239) {
				int var109 = field221.method385();
				int var110 = field221.method385();
				MYGSUHVG.method402(var110).field1046 = 2;
				MYGSUHVG.method402(var110).field1047 = var109;
				field488 = -1;
				return true;
			}

			if (field488 == 134) {
				field227 = true;
				int var111 = field221.method359();
				MYGSUHVG var112 = MYGSUHVG.method402(var111);
				int var113 = field221.method359();
				for (int var114 = 0; var114 < var113; var114++) {
					int var115 = field221.method357();
					if (var115 == 255) {
						var115 = field221.method362();
					}

					var112.field1051[var114] = field221.method359();
					var112.field1063[var114] = var115;
				}

				for (int var116 = var113; var116 < var112.field1051.length; var116++) {
					var112.field1051[var116] = 0;
					var112.field1063[var116] = 0;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 20) {
				method110();
				field488 = -1;
				return false;
			}

			if (field488 == 51) {
				field113 = field221.method357();
				field227 = true;
				field488 = -1;
				return true;
			}

			if (field488 == 163) {
				if (field338 == 12) {
					field227 = true;
				}

				field249 = field221.method360();
				field488 = -1;
				return true;
			}

			if (field488 == 29) {
				field227 = true;
				int var117 = field221.method359();
				MYGSUHVG var118 = MYGSUHVG.method402(var117);
				while (field221.field1014 < field487) {
					int var119 = field221.method371();
					int var120 = field221.method359();
					int var121 = field221.method357();
					if (var121 == 255) {
						var121 = field221.method362();
					}

					if (var119 >= 0 && var119 < var118.field1051.length) {
						var118.field1051[var119] = var120;
						var118.field1063[var119] = var121;
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 34) {
				field239 = false;
				field471 = 2;
				field294 = "";
				field271 = true;
				field488 = -1;
				return true;
			}

			if (field488 == 216) {
				method146(field487, field221);
				field488 = -1;
				return true;
			}

			if (field488 == 25) {
				int var122 = field221.method360();
				int var123 = field221.method387();
				int var124 = field221.method383();
				MYGSUHVG var125 = MYGSUHVG.method402(var124);
				var125.field1069 = var122;
				var125.field1041 = var123;
				field488 = -1;
				return true;
			}

			if (field488 == 139) {
				int var126 = field221.method360();
				if (field509 != var126) {
					method112(field509);
					field509 = var126;
				}

				field271 = true;
				field488 = -1;
				return true;
			}

			if (field488 == 110) {
				field170 = false;

				for (int var127 = 0; var127 < 5; var127++) {
					field513[var127] = false;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 158) {
				int var128 = field221.method383();
				boolean var129 = field221.method375() == 1;
				MYGSUHVG.method402(var128).field1095 = var129;
				field488 = -1;
				return true;
			}

			if (field488 == 91) {
				int var130 = field221.method384();
				int var131 = field221.method386();
				MYGSUHVG var132 = MYGSUHVG.method402(var130);
				if (var132.field1060 != var131 || var131 == -1) {
					var132.field1060 = var131;
					var132.field1059 = 0;
					var132.field1096 = 0;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 228) {
				if (field111 != -1) {
					method112(field111);
					field111 = -1;
					field227 = true;
					field128 = true;
				}

				if (field548 != -1) {
					method112(field548);
					field548 = -1;
					field271 = true;
				}

				if (field446 != -1) {
					method112(field446);
					field446 = -1;
					field259 = true;
				}

				if (field376 != -1) {
					method112(field376);
					field376 = -1;
				}

				if (field304 != -1) {
					method112(field304);
					field304 = -1;
				}

				if (field471 != 0) {
					field471 = 0;
					field271 = true;
				}

				field197 = false;
				field488 = -1;
				return true;
			}

			if (field488 == 76) {
				for (int var133 = 0; var133 < field131.length; var133++) {
					if (field131[var133] != null) {
						field131[var133].field823 = -1;
					}
				}

				for (int var134 = 0; var134 < field530.length; var134++) {
					if (field530[var134] != null) {
						field530[var134].field823 = -1;
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 182) {
				int var135 = field221.method383();
				int var136 = field221.method383();
				int var137 = var135 >> 10 & 0x1F;
				int var138 = var135 >> 5 & 0x1F;
				int var139 = var135 & 0x1F;
				MYGSUHVG.method402(var136).field1062 = (var139 << 3) + (var137 << 19) + (var138 << 11);
				field488 = -1;
				return true;
			}

			if (field488 == 99) {
				long var140 = field221.method363();
				int var142 = field221.method362();
				int var143 = field221.method357();
				boolean var144 = false;
				for (int var145 = 0; var145 < 100; var145++) {
					if (field474[var145] == var142) {
						var144 = true;
						break;
					}
				}

				if (var143 <= 1) {
					for (int var146 = 0; var146 < field450; var146++) {
						if (field145[var146] == var140) {
							var144 = true;
							break;
						}
					}
				}

				if (!var144 && field285 == 0) {
					try {
						field474[field547] = var142;
						field547 = (field547 + 1) % 100;
						String var147 = RJLRTDJR.method495(field487 - 13, field221);
						if (var143 != 3) {
							var147 = PRVYVGOX.method451(var147);
						}

						if (var143 == 2 || var143 == 3) {
							method102(var147, 7, "@cr2@" + TGGPOZND.method551(TGGPOZND.method548(var140)));
						} else if (var143 == 1) {
							method102(var147, 7, "@cr1@" + TGGPOZND.method551(TGGPOZND.method548(var140)));
						} else {
							method102(var147, 3, TGGPOZND.method551(TGGPOZND.method548(var140)));
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 191) {
				field338 = field221.method376();
				field227 = true;
				field128 = true;
				field488 = -1;
				return true;
			}

			if (field488 == 161) {
				String var149 = field221.method364();
				if (var149.endsWith(":tradereq:")) {
					String var150 = var149.substring(0, var149.indexOf(":"));
					long var151 = TGGPOZND.method547(var150);
					boolean var153 = false;
					for (int var154 = 0; var154 < field450; var154++) {
						if (field145[var154] == var151) {
							var153 = true;
							break;
						}
					}

					if (!var153 && field285 == 0) {
						method102("wishes to trade with you.", 4, var150);
					}
				} else if (var149.endsWith(":duelreq:")) {
					String var155 = var149.substring(0, var149.indexOf(":"));
					long var156 = TGGPOZND.method547(var155);
					boolean var158 = false;
					for (int var159 = 0; var159 < field450; var159++) {
						if (field145[var159] == var156) {
							var158 = true;
							break;
						}
					}

					if (!var158 && field285 == 0) {
						method102("wishes to duel with you.", 8, var155);
					}
				} else if (var149.endsWith(":chalreq:")) {
					String var160 = var149.substring(0, var149.indexOf(":"));
					long var161 = TGGPOZND.method547(var160);
					boolean var163 = false;
					for (int var164 = 0; var164 < field450; var164++) {
						if (field145[var164] == var161) {
							var163 = true;
							break;
						}
					}

					if (!var163 && field285 == 0) {
						String var165 = var149.substring(var149.indexOf(":") + 1, var149.length() - 9);
						method102(var165, 8, var160);
					}
				} else {
					method102(var149, 0, "");
				}

				field488 = -1;
				return true;
			}

			if (field488 == 242) {
				int var166 = field221.method384();
				int var167 = field221.method383();

				if (field548 != -1) {
					method112(field548);
					field548 = -1;
					field271 = true;
				}

				if (field446 != -1) {
					method112(field446);
					field446 = -1;
					field259 = true;
				}

				if (field376 != -1) {
					method112(field376);
					field376 = -1;
				}

				if (field304 != var167) {
					method112(field304);
					field304 = var167;
				}

				if (field111 != var166) {
					method112(field111);
					field111 = var166;
				}

				if (field471 != 0) {
					field471 = 0;
					field271 = true;
				}

				field227 = true;
				field128 = true;
				field197 = false;
				field488 = -1;
				return true;
			}

			if (field488 == 92) {
				int var168 = field221.method383();
				int var169 = field221.method375();

				if (var168 == 0xFFFF) {
					var168 = -1;
				}

				if (field284[var169] != var168) {
					method112(field284[var169]);
					field284[var169] = var168;
				}

				field227 = true;
				field128 = true;
				field488 = -1;
				return true;
			}

			if (field488 == 214) {
				field170 = true;
				field461 = field221.method357();
				field462 = field221.method357();
				field463 = field221.method359();
				field464 = field221.method357();
				field465 = field221.method357();
				if (field465 >= 100) {
					int var170 = field461 * 128 + 64;
					int var171 = field462 * 128 + 64;
					int var172 = method68(var171, var170, field395) - field463;
					int var173 = var170 - field314;
					int var174 = var172 - field315;
					int var175 = var171 - field316;
					int var176 = (int) Math.sqrt(var173 * var173 + var175 * var175);
					field317 = (int) (Math.atan2(var174, var176) * 325.949D) & 0x7FF;
					field318 = (int) (Math.atan2(var173, var175) * -325.949D) & 0x7FF;

					if (field317 < 128) {
						field317 = 128;
					}

					if (field317 > 383) {
						field317 = 383;
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 221) {
				field227 = true;
				int var177 = field221.method376();
				int var178 = field221.method375();
				int var179 = field221.method389();
				field139[var177] = var179;
				field495[var177] = var178;
				field494[var177] = 1;
				for (int var180 = 0; var180 < 98; var180++) {
					if (var179 >= field366[var180]) {
						field494[var177] = var180 + 2;
					}
				}

				field488 = -1;
				return true;
			}

			if (field488 == 130) {
				int var181 = field221.method383();
				MYGSUHVG.method402(var181).field1046 = 3;

				if (field459.field100 == null) {
					MYGSUHVG.method402(var181).field1047 = (field459.field81[11] << 5) + (field459.field81[8] << 10) + (field459.field81[0] << 15) + (field459.field83[0] << 25) + (field459.field83[4] << 20) + field459.field81[1];
				} else {
					MYGSUHVG.method402(var181).field1047 = (int) (field459.field100.field880 + 0x12345678L);
				}

				field488 = -1;
				return true;
			}

			if (field488 == 143 || field488 == 93 || field488 == 137 || field488 == 247 || field488 == 4 || field488 == 235 || field488 == 179 || field488 == 101 || field488 == 94 || field488 == 23 || field488 == 243) {
				method95(field488, field221);
				field488 = -1;
				return true;
			}

			if (field488 == 230) {
				field472 = field221.method357();
				if (field472 == 1) {
					field423 = field221.method359();
				}

				if (field472 >= 2 && field472 <= 6) {
					if (field472 == 2) {
						field157 = 64;
						field158 = 64;
					}

					if (field472 == 3) {
						field157 = 0;
						field158 = 64;
					}

					if (field472 == 4) {
						field157 = 128;
						field158 = 64;
					}

					if (field472 == 5) {
						field157 = 64;
						field158 = 0;
					}

					if (field472 == 6) {
						field157 = 64;
						field158 = 128;
					}

					field472 = 2;
					field154 = field221.method359();
					field155 = field221.method359();
					field156 = field221.method357();
				}

				if (field472 == 10) {
					field392 = field221.method359();
				}

				field488 = -1;
				return true;
			}

			if (field488 == 164) {
				int var182 = field221.method359();
				MYGSUHVG var183 = MYGSUHVG.method402(var182);
				for (int var184 = 0; var184 < var183.field1051.length; var184++) {
					var183.field1051[var184] = -1;
					var183.field1051[var184] = 0;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 251) {
				int var185 = field221.method386();
				if (var185 >= 0) {
					method66(var185);
				}

				if (field199 != var185) {
					method112(field199);
					field199 = var185;
				}

				field488 = -1;
				return true;
			}

			if (field488 == 55) {
				field252 = field221.method377();
				field390 = field221.method385();
				field488 = -1;
				return true;
			}

			if (field488 == 203) {
				if (field338 == 12) {
					field227 = true;
				}

				field447 = field221.method357();
				field488 = -1;
				return true;
			}

			if (field488 == 103) {
				field170 = true;
				field164 = field221.method357();
				field165 = field221.method357();
				field166 = field221.method359();
				field167 = field221.method357();
				field168 = field221.method357();
				if (field168 >= 100) {
					field314 = field164 * 128 + 64;
					field316 = field165 * 128 + 64;
					field315 = method68(field316, field314, field395) - field166;
				}

				field488 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field488 + "," + field487 + " - " + field310 + "," + field311);
			method110();
		} catch (IOException var190) {
			method167();
		} catch (Exception var191) {
			String var187 = "T2 - " + field488 + "," + field310 + "," + field311 + " - " + field487 + "," + (field459.field834[0] + field245) + "," + (field459.field835[0] + field246) + " - ";
			for (int var188 = 0; var188 < field487 && var188 < 50; var188++) {
				var187 = var187 + field221.field1013[var188] + ",";
			}

			signlink.reporterror(var187);
			method110();
		}

		return true;
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method172() {
		field413 = 0;
		for (int var1 = -1; var1 < field531 + field132; var1++) {
			JXGMYPJH var2;
			if (var1 == -1) {
				var2 = field459;
			} else if (var1 < field132) {
				var2 = field131[field133[var1]];
			} else {
				var2 = field530[field532[var1 - field132]];
			}

			if (var2 != null && var2.method1()) {
				if (var2 instanceof ACKJULTZ) {
					LQFHJGYA var3 = ((ACKJULTZ) var2).field1;
					if (var3.field872 != null) {
						var3 = var3.method316();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field132) {
					LQFHJGYA var6 = ((ACKJULTZ) var2).field1;
					if (var6.field860 >= 0 && var6.field860 < field110.length) {
						method151(var2.field785 + 15, var2);

						if (field505 > -1) {
							field110[var6.field860].method233(field505 - 12, field506 - 30);
						}
					}

					if (field472 == 1 && field532[var1 - field132] == field423 && field443 % 20 < 10) {
						method151(var2.field785 + 15, var2);

						if (field505 > -1) {
							field334[0].method233(field505 - 12, field506 - 28);
						}
					}
				} else {
					int var4 = 30;
					BSQIIHOT var5 = (BSQIIHOT) var2;
					if (var5.field75 != -1 || var5.field85 != -1) {
						method151(var2.field785 + 15, var2);

						if (field505 > -1) {
							if (var5.field75 != -1) {
								field355[var5.field75].method233(field505 - 12, field506 - var4);
								var4 += 25;
							}

							if (var5.field85 != -1) {
								field110[var5.field85].method233(field505 - 12, field506 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field472 == 10 && field133[var1] == field392) {
						method151(var2.field785 + 15, var2);

						if (field505 > -1) {
							field334[1].method233(field505 - 12, field506 - var4);
						}
					}
				}

				if (var2.field804 != null && (var1 >= field132 || field288 == 0 || field288 == 3 || field288 == 1 && method74(((BSQIIHOT) var2).field80))) {
					method151(var2.field785, var2);

					if (field505 > -1 && field413 < field414) {
						field418[field413] = field180.method21(var2.field804) / 2;
						field417[field413] = field180.field64;
						field415[field413] = field505;
						field416[field413] = field506;
						field419[field413] = var2.field786;
						field420[field413] = var2.field787;
						field421[field413] = var2.field839;
						field422[field413++] = var2.field804;

						if (field348 == 0 && var2.field787 >= 1 && var2.field787 <= 3) {
							field417[field413] += 10;
							field416[field413] += 5;
						}

						if (field348 == 0 && var2.field787 == 4) {
							field418[field413] = 60;
						}

						if (field348 == 0 && var2.field787 == 5) {
							field417[field413] += 5;
						}
					}
				}

				if (var2.field820 > field443) {
					method151(var2.field785 + 15, var2);

					if (field505 > -1) {
						int var7 = var2.field821 * 30 / var2.field822;
						if (var7 > 30) {
							var7 = 30;
						}

						FVBHOYJF.method214(0xFF00, 5, field505 - 15, field506 - 3, var7);
						FVBHOYJF.method214(0xFF0000, 5, field505 + var7 - 15, field506 - 3, 30 - var7);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field811[var8] > field443) {
						method151(var2.field785 / 2, var2);

						if (field505 > -1) {
							if (var8 == 1) {
								field506 -= 20;
							}

							if (var8 == 2) {
								field505 -= 15;
								field506 -= 10;
							}

							if (var8 == 3) {
								field505 += 15;
								field506 -= 10;
							}

							field303[var2.field810[var8]].method233(field505 - 12, field506 - 12);
							field178.method18(0, String.valueOf(var2.field809[var8]), field506 + 4, field505);
							field178.method18(0xFFFFFF, String.valueOf(var2.field809[var8]), field506 + 3, field505 - 1);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field413; var9++) {
			int var10 = field415[var9];
			int var11 = field416[var9];
			int var12 = field418[var9];
			int var13 = field417[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field416[var15] - field417[var15] && var11 - var13 < field416[var15] + 2 && var10 - var12 < field418[var15] + field415[var15] && var10 + var12 > field415[var15] - field418[var15] && field416[var15] - field417[var15] < var11) {
						var11 = field416[var15] - field417[var15];
						var14 = true;
					}
				}
			}

			field505 = field415[var9];
			field506 = field416[var9] = var11;
			String var16 = field422[var9];
			if (field348 == 0) {
				int var17 = 0xFFFF00;
				if (field419[var9] < 6) {
					var17 = field231[field419[var9]];
				}

				if (field419[var9] == 6) {
					var17 = field141 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field419[var9] == 7) {
					var17 = field141 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field419[var9] == 8) {
					var17 = field141 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field419[var9] == 9) {
					int var18 = 150 - field421[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field419[var9] == 10) {
					int var19 = 150 - field421[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field419[var9] == 11) {
					int var20 = 150 - field421[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field420[var9] == 0) {
					field180.method18(0, var16, field506 + 1, field505);
					field180.method18(var17, var16, field506, field505);
				}

				if (field420[var9] == 1) {
					field180.method23(field505, var16, 0, field506 + 1, field141);
					field180.method23(field505, var16, var17, field506, field141);
				}

				if (field420[var9] == 2) {
					field180.method24(field141, field506 + 1, field505, 0, var16);
					field180.method24(field141, field506, field505, var17, var16);
				}

				if (field420[var9] == 3) {
					field180.method25(field506 + 1, field505, field141, 150 - field421[var9], var16, 0);
					field180.method25(field506, field505, field141, 150 - field421[var9], var16, var17);
				}

				if (field420[var9] == 4) {
					int var21 = field180.method21(var16);
					int var22 = (150 - field421[var9]) * (var21 + 100) / 150;
					FVBHOYJF.method211(0, field505 - 50, 334, field505 + 50);
					field180.method22(field506 + 1, var16, field505 + 50 - var22, 0);
					field180.method22(field506, var16, field505 + 50 - var22, var17);
					FVBHOYJF.method210();
				}

				if (field420[var9] == 5) {
					int var23 = 150 - field421[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					FVBHOYJF.method211(field506 - field180.field64 - 1, 0, field506 + 5, 512);
					field180.method18(0, var16, field506 + var24 + 1, field505);
					field180.method18(var17, var16, field506 + var24, field505);
					FVBHOYJF.method210();
				}
			} else {
				field180.method18(0, var16, field506 + 1, field505);
				field180.method18(0xFFFF00, var16, field506, field505);
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method173() {
		field285 = 0;
		int var1 = (field459.field828 >> 7) + field245;
		int var2 = (field459.field829 >> 7) + field246;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field285 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field285 = 1;
		}

		if (field285 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field285 = 0;
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method174() {
		if (field230 >= 2 || field201 != 0 || field350 != 0) {
			String var1;
			if (field201 == 1 && field230 < 2) {
				var1 = "Use " + field205 + " with...";
			} else if (field350 == 1 && field230 < 2) {
				var1 = field353 + "...";
			} else {
				var1 = field365[field230 - 1];
			}

			if (field230 > 2) {
				var1 = var1 + "@whi@ / " + (field230 - 2) + " more options";
			}

			field180.method27(0xFFFFFF, 4, var1, 15, true, field443 / 1000);
		}
	}

	@ObfuscatedName("client.a(ZLMYGSUHVG;)Z")
	public final boolean method175(MYGSUHVG arg0) {
		if (arg0.field1056 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1056.length; var2++) {
			int var3 = method113(arg0, var2);
			int var4 = arg0.field1087[var2];
			if (arg0.field1056[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1056[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1056[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method176(String arg0) throws IOException {
		if (field224) {
			if (field137 != null) {
				try {
					field137.close();
				} catch (Exception var4) {
				}

				field137 = null;
			}

			field137 = method177(43595);
			field137.setSoTimeout(10000);
			InputStream var2 = field137.getInputStream();
			OutputStream var3 = field137.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.B(I)Ljava/net/Socket;")
	public final Socket method177(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method178(long arg0) {
		if (arg0 != 0L) {
			if (field112 >= 100 && field252 != 1) {
				method102("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else if (field112 >= 200) {
				method102("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else {
				String var3 = TGGPOZND.method551(TGGPOZND.method548(arg0));
				for (int var4 = 0; var4 < field112; var4++) {
					if (field210[var4] == arg0) {
						method102(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field450; var5++) {
					if (field145[var5] == arg0) {
						method102("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field459.field80)) {
					field511[field112] = var3;
					field210[field112] = arg0;
					field140[field112] = 0;
					field112++;
					field227 = true;
					field370.method346(52);
					field370.method353(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field394.method278(arg2, arg3, arg1);
		if (var6 != 0) {
			int var7 = field394.method282(arg2, arg3, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field325.field692;
			int var12 = (103 - arg1) * 512 * 4 + arg3 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			CUIVWWJO var14 = CUIVWWJO.method203(var13);
			if (var14.field567 == -1) {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 3 + 512] = var10;
						var11[var12 + 3 + 1024] = var10;
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 3 + 512] = var10;
						var11[var12 + 3 + 1024] = var10;
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			} else {
				BNGXLHWA var15 = field345[var14.field567];
				if (var15 != null) {
					int var16 = (var14.field554 * 4 - var15.field69) / 2;
					int var17 = (var14.field594 * 4 - var15.field70) / 2;
					var15.method38(arg3 * 4 + var16 + 48, (104 - arg1 - var14.field594) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field394.method280(arg2, arg3, arg1);
		if (var18 != 0) {
			int var19 = field394.method282(arg2, arg3, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			CUIVWWJO var23 = CUIVWWJO.method203(var22);
			if (var23.field567 != -1) {
				BNGXLHWA var24 = field345[var23.field567];
				if (var24 != null) {
					int var25 = (var23.field554 * 4 - var24.field69) / 2;
					int var26 = (var23.field594 * 4 - var24.field70) / 2;
					var24.method38(arg3 * 4 + var25 + 48, (104 - arg1 - var23.field594) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field325.field692;
				int var29 = (103 - arg1) * 512 * 4 + arg3 * 4 + 24624;
				if (var20 == 0 || var20 == 2) {
					var28[var29 + 1536] = var27;
					var28[var29 + 1024 + 1] = var27;
					var28[var29 + 512 + 2] = var27;
					var28[var29 + 3] = var27;
				} else {
					var28[var29] = var27;
					var28[var29 + 512 + 1] = var27;
					var28[var29 + 1024 + 2] = var27;
					var28[var29 + 1536 + 3] = var27;
				}
			}
		}

		int var30 = field394.method281(arg2, arg3, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			CUIVWWJO var32 = CUIVWWJO.method203(var31);
			if (var32.field567 != -1) {
				BNGXLHWA var33 = field345[var32.field567];
				if (var33 != null) {
					int var34 = (var32.field554 * 4 - var33.field69) / 2;
					int var35 = (var32.field594 * 4 - var33.field70) / 2;
					var33.method38(arg3 * 4 + var34 + 48, (104 - arg1 - var32.field594) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method180(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.C(I)V")
	public final void method181() {
		field397.method206();

		if (field186 == 2) {
			byte[] var1 = field430.field67;
			int[] var2 = FVBHOYJF.field639;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field538.method237(25, field510, 256, 33, field290, 33, 0, 25, 0, field373);
			field398.method206();
			THHUVKBK.field1413 = field457;
		} else {
			int var5 = field373 + field232 & 0x7FF;
			int var6 = field459.field828 / 32 + 48;
			int var7 = 464 - field459.field829 / 32;
			field325.method237(var6, field241, field357 + 256, 151, field468, 146, 5, var7, 25, var5);
			field538.method237(25, field510, 256, 33, field290, 33, 0, 25, 0, field373);

			for (int var8 = 0; var8 < field273; var8++) {
				int var9 = field274[var8] * 4 + 2 - field459.field828 / 32;
				int var10 = field275[var8] * 4 + 2 - field459.field829 / 32;
				method126(field391[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					IHMCQRZY var13 = field364[field395][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field459.field828 / 32;
						int var15 = var12 * 4 + 2 - field459.field829 / 32;
						method126(field540, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field531; var16++) {
				ACKJULTZ var17 = field530[field532[var16]];
				if (var17 != null && var17.method1()) {
					LQFHJGYA var18 = var17.field1;
					if (var18.field872 != null) {
						var18 = var18.method316();
					}

					if (var18 != null && var18.field893 && var18.field862) {
						int var19 = var17.field828 / 32 - field459.field828 / 32;
						int var20 = var17.field829 / 32 - field459.field829 / 32;
						method126(field541, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field132; var21++) {
				BSQIIHOT var22 = field131[field133[var21]];
				if (var22 != null && var22.method1()) {
					int var23 = var22.field828 / 32 - field459.field828 / 32;
					int var24 = var22.field829 / 32 - field459.field829 / 32;
					boolean var25 = false;
					long var26 = TGGPOZND.method547(var22.field80);
					for (int var28 = 0; var28 < field112; var28++) {
						if (field210[var28] == var26 && field140[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field459.field86 != 0 && var22.field86 != 0 && field459.field86 == var22.field86) {
						var29 = true;
					}

					if (var25) {
						method126(field543, var24, var23);
					} else if (var29) {
						method126(field544, var24, var23);
					} else {
						method126(field542, var24, var23);
					}
				}
			}

			if (field472 != 0 && field443 % 20 < 10) {
				if (field472 == 1 && field423 >= 0 && field423 < field530.length) {
					ACKJULTZ var30 = field530[field423];
					if (var30 != null) {
						int var31 = var30.field828 / 32 - field459.field828 / 32;
						int var32 = var30.field829 / 32 - field459.field829 / 32;
						method139(var32, field332, var31);
					}
				}

				if (field472 == 2) {
					int var33 = (field154 - field245) * 4 + 2 - field459.field828 / 32;
					int var34 = (field155 - field246) * 4 + 2 - field459.field829 / 32;
					method139(var34, field332, var33);
				}

				if (field472 == 10 && field392 >= 0 && field392 < field131.length) {
					BSQIIHOT var35 = field131[field392];
					if (var35 != null) {
						int var36 = var35.field828 / 32 - field459.field828 / 32;
						int var37 = var35.field829 / 32 - field459.field829 / 32;
						method139(var37, field332, var36);
					}
				}
			}

			if (field323 != 0) {
				int var38 = field323 * 4 + 2 - field459.field828 / 32;
				int var39 = field324 * 4 + 2 - field459.field829 / 32;
				method126(field331, var39, var38);
			}

			FVBHOYJF.method214(0xFFFFFF, 3, 97, 78, 3);
			field398.method206();
			THHUVKBK.field1413 = field457;
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method182(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field159.method38(arg1, arg3);
		field160.method38(arg1, arg2 + arg3 - 16);
		FVBHOYJF.method214(field437, arg2 - 32, arg1, arg3 + 16, 16);
		int var6 = (arg2 - 32) * arg2 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg0 / (arg4 - arg2);
		FVBHOYJF.method214(field507, var6, arg1, arg3 + var7 + 16, 16);
		FVBHOYJF.method219(arg3 + var7 + 16, var6, arg1, field187);
		FVBHOYJF.method219(arg3 + var7 + 16, var6, arg1 + 1, field187);
		FVBHOYJF.method217(arg1, arg3 + var7 + 16, field187, 16);
		FVBHOYJF.method217(arg1, arg3 + var7 + 17, field187, 16);
		FVBHOYJF.method219(arg3 + var7 + 16, var6, arg1 + 15, field270);
		FVBHOYJF.method219(arg3 + var7 + 17, var6 - 1, arg1 + 14, field270);
		FVBHOYJF.method217(arg1, arg3 + var7 + var6 + 15, field270, 16);
		FVBHOYJF.method217(arg1 + 1, arg3 + 14 + var7 + var6, field270, 15);
	}

	@ObfuscatedName("client.D(I)V")
	public final void method183() {
		if (field549 != 0) {
			int var1 = 0;
			if (field460 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field516[var2] != null) {
					int var3 = field514[var2];
					String var4 = field515[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field242 == 0 || field242 == 1 && method74(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1115 > 4 && field1116 - 4 > var8 - 10 && field1116 - 4 <= var8 + 3) {
							int var9 = field179.method20("From:  " + var4 + field516[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1115 < var9 + 4) {
								if (field377 >= 1) {
									field365[field230] = "Report abuse @whi@" + var4;
									field407[field230] = 2614;
									field230++;
								}

								field365[field230] = "Add ignore @whi@" + var4;
								field407[field230] = 2235;
								field230++;
								field365[field230] = "Add friend @whi@" + var4;
								field407[field230] = 2087;
								field230++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field242 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.i(II)Z")
	public final boolean method184(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field407[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 87) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method185() {
		int var1 = field180.method20("Choose Option");
		for (int var2 = 0; var2 < field230; var2++) {
			int var3 = field180.method20(field365[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field230 * 15 + 21;
		if (field1122 > 4 && field1123 > 4 && field1122 < 516 && field1123 < 338) {
			int var5 = field1122 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1123 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field278 = true;
			field481 = 0;
			field482 = var5;
			field483 = var6;
			field484 = var1;
			field485 = field230 * 15 + 22;
		}

		if (field1122 > 553 && field1123 > 205 && field1122 < 743 && field1123 < 466) {
			int var7 = field1122 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1123 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field278 = true;
			field481 = 1;
			field482 = var7;
			field483 = var8;
			field484 = var1;
			field485 = field230 * 15 + 22;
		}

		if (field1122 > 17 && field1123 > 357 && field1122 < 496 && field1123 < 453) {
			int var9 = field1122 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1123 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field278 = true;
			field481 = 2;
			field482 = var9;
			field483 = var10;
			field484 = var1;
			field485 = field230 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(III)Z")
	public final boolean method186(int arg0, int arg1) {
		boolean var3 = false;
		MYGSUHVG var4 = MYGSUHVG.method402(arg1);
		for (int var5 = 0; var5 < var4.field1064.length && var4.field1064[var5] != -1; var5++) {
			MYGSUHVG var6 = MYGSUHVG.method402(var4.field1064[var5]);
			if (var6.field1090 == 0) {
				var3 |= method186(arg0, var6.field1075);
			}

			if (var6.field1090 == 6 && (var6.field1060 != -1 || var6.field1061 != -1)) {
				boolean var7 = method175(var6);
				int var8;
				if (var7) {
					var8 = var6.field1061;
				} else {
					var8 = var6.field1060;
				}

				if (var8 != -1) {
					JZFUUSFN var9 = JZFUUSFN.field841[var8];
					var6.field1096 += arg0;
					while (var6.field1096 > var9.method308(var6.field1059)) {
						var6.field1096 -= var9.method308(var6.field1059) + 1;
						var6.field1059++;
						if (var6.field1059 >= var9.field842) {
							var6.field1059 -= var9.field846;
							if (var6.field1059 < 0 || var6.field1059 >= var9.field842) {
								var6.field1059 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1090 == 6 && var6.field1055 != 0) {
				int var10 = var6.field1055 >> 16;
				int var11 = var6.field1055 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1053 = var6.field1053 + var10 & 0x7FF;
				var6.field1054 = var6.field1054 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method187() {
		method80();

		if (field267 == 1) {
			field402[field266 / 100].method233(field264 - 8 - 4, field265 - 8 - 4);
		}

		if (field267 == 2) {
			field402[field266 / 100 + 4].method233(field264 - 8 - 4, field265 - 8 - 4);
		}

		if (field199 != -1) {
			method186(field520, field199);
			method124(MYGSUHVG.method402(field199), 0, 0, 0);
		}

		if (field304 != -1) {
			method186(field520, field304);
			method124(MYGSUHVG.method402(field304), 0, 0, 0);
		}

		method173();

		if (!field278) {
			method165();
			method174();
		} else if (field481 == 0) {
			method69();
		}

		if (field292 == 1) {
			field356.method233(472, 296);
		}

		if (field268) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1103 < 30 && field329) {
				var3 = 0xFF0000;
			}

			if (field1103 < 20 && !field329) {
				var3 = 0xFF0000;
			}

			field179.method17(var1, var3, "Fps:" + field1103, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field329) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field329) {
				int var8 = 0xFF0000;
			}

			field179.method17(var1, 0xFFFF00, "Mem:" + var5 + "k", var2);
			var2 += 15;
		}

		if (field460 != 0) {
			int var9 = field460 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field179.method22(329, "System update in: " + var10 + ":0" + var9, 4, 0xFFFF00);
			} else {
				field179.method22(329, "System update in: " + var10 + ":" + var9, 4, 0xFFFF00);
			}

			field305++;
			if (field305 > 74) {
				field305 = 0;
				field370.method346(105);
				return;
			}
		}
	}

	@ObfuscatedName("client.j(II)Ljava/lang/String;")
	public static final String method188(int arg0) {
		String var1 = String.valueOf(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 8) {
			var1 = "@gre@" + var1.substring(0, var1.length() - 8) + " million @whi@(" + var1 + ")";
		} else if (var1.length() > 4) {
			var1 = "@cya@" + var1.substring(0, var1.length() - 4) + "K @whi@(" + var1 + ")";
		}

		return " " + var1;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method189() {
		if (field201 == 0 && field350 == 0) {
			field365[field230] = "Walk here";
			field407[field230] = 2;
			field405[field230] = field1115;
			field406[field230] = field1116;
			field230++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < PDVZPZLT.field1195; var2++) {
			int var3 = PDVZPZLT.field1196[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field394.method282(field395, var4, var5, var3) >= 0) {
					CUIVWWJO var8 = CUIVWWJO.method203(var7);
					if (var8.field562 != null) {
						var8 = var8.method195();
					}

					if (var8 == null) {
						continue;
					}

					if (field201 == 1) {
						field365[field230] = "Use " + field205 + " with @cya@" + var8.field593;
						field407[field230] = 697;
						field408[field230] = var3;
						field405[field230] = var4;
						field406[field230] = var5;
						field230++;
					} else if (field350 != 1) {
						if (var8.field558 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field558[var9] != null) {
									field365[field230] = var8.field558[var9] + " @cya@" + var8.field593;

									if (var9 == 0) {
										field407[field230] = 861;
									}

									if (var9 == 1) {
										field407[field230] = 601;
									}

									if (var9 == 2) {
										field407[field230] = 732;
									}

									if (var9 == 3) {
										field407[field230] = 702;
									}

									if (var9 == 4) {
										field407[field230] = 1478;
									}

									field408[field230] = var3;
									field405[field230] = var4;
									field406[field230] = var5;
									field230++;
								}
							}
						}

						field365[field230] = "Examine @cya@" + var8.field593;
						field407[field230] = 1881;
						field408[field230] = var8.field585 << 14;
						field405[field230] = var4;
						field406[field230] = var5;
						field230++;
					} else if ((field352 & 0x4) == 4) {
						field365[field230] = field353 + " @cya@" + var8.field593;
						field407[field230] = 917;
						field408[field230] = var3;
						field405[field230] = var4;
						field406[field230] = var5;
						field230++;
					}
				}

				if (var6 == 1) {
					ACKJULTZ var10 = field530[var7];
					if (var10.field1.field888 == 1 && (var10.field828 & 0x7F) == 0x40 && (var10.field829 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field531; var11++) {
							ACKJULTZ var12 = field530[field532[var11]];
							if (var12 != null && var10 != var12 && var12.field1.field888 == 1 && var10.field828 == var12.field828 && var10.field829 == var12.field829) {
								method92(var4, field532[var11], var5, var12.field1);
							}
						}

						for (int var13 = 0; var13 < field132; var13++) {
							BSQIIHOT var14 = field131[field133[var13]];
							if (var14 != null && var10.field828 == var14.field828 && var10.field829 == var14.field829) {
								method49(var14, var4, field133[var13], var5);
							}
						}
					}

					method92(var4, var7, var5, var10.field1);
				}

				if (var6 == 0) {
					BSQIIHOT var15 = field131[var7];
					if ((var15.field828 & 0x7F) == 0x40 && (var15.field829 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field531; var16++) {
							ACKJULTZ var17 = field530[field532[var16]];
							if (var17 != null && var17.field1.field888 == 1 && var15.field828 == var17.field828 && var15.field829 == var17.field829) {
								method92(var4, field532[var16], var5, var17.field1);
							}
						}

						for (int var18 = 0; var18 < field132; var18++) {
							BSQIIHOT var19 = field131[field133[var18]];
							if (var19 != null && var15 != var19 && var15.field828 == var19.field828 && var15.field829 == var19.field829) {
								method49(var19, var4, field133[var18], var5);
							}
						}
					}

					method49(var15, var4, var7, var5);
				}

				if (var6 == 3) {
					IHMCQRZY var20 = field364[field395][var4][var5];
					if (var20 != null) {
						for (GEPRJOHJ var21 = (GEPRJOHJ) var20.method247(); var21 != null; var21 = (GEPRJOHJ) var20.method249()) {
							AGZBBQJK var22 = AGZBBQJK.method11(var21.field650);
							if (field201 == 1) {
								field365[field230] = "Use " + field205 + " with @lre@" + var22.field40;
								field407[field230] = 368;
								field408[field230] = var21.field650;
								field405[field230] = var4;
								field406[field230] = var5;
								field230++;
							} else if (field350 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field55 != null && var22.field55[var23] != null) {
										field365[field230] = var22.field55[var23] + " @lre@" + var22.field40;

										if (var23 == 0) {
											field407[field230] = 644;
										}

										if (var23 == 1) {
											field407[field230] = 603;
										}

										if (var23 == 2) {
											field407[field230] = 194;
										}

										if (var23 == 3) {
											field407[field230] = 745;
										}

										if (var23 == 4) {
											field407[field230] = 344;
										}

										field408[field230] = var21.field650;
										field405[field230] = var4;
										field406[field230] = var5;
										field230++;
									} else if (var23 == 2) {
										field365[field230] = "Take @lre@" + var22.field40;
										field407[field230] = 194;
										field408[field230] = var21.field650;
										field405[field230] = var4;
										field406[field230] = var5;
										field230++;
									}
								}

								field365[field230] = "Examine @lre@" + var22.field40;
								field407[field230] = 1993;
								field408[field230] = var21.field650;
								field405[field230] = var4;
								field406[field230] = var5;
								field230++;
							} else if ((field352 & 0x1) == 1) {
								field365[field230] = field353 + " @lre@" + var22.field40;
								field407[field230] = 450;
								field408[field230] = var21.field650;
								field405[field230] = var4;
								field406[field230] = var5;
								field230++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(ILMVHXDWGI;I)V")
	public final void method190(MVHXDWGI arg0, int arg1) {
		for (int var3 = 0; var3 < field134; var3++) {
			int var4 = field135[var3];
			ACKJULTZ var5 = field530[var4];
			int var6 = arg0.method357();
			if ((var6 & 0x20) != 0) {
				var5.field788 = arg0.method384();
				var5.field789 = arg0.method385();
			}

			if ((var6 & 0x1) != 0) {
				var5.field790 = arg0.method383();
				int var7 = arg0.method390();
				var5.field794 = var7 >> 16;
				var5.field793 = (var7 & 0xFFFF) + field443;
				var5.field791 = 0;
				var5.field792 = 0;

				if (var5.field793 > field443) {
					var5.field791 = -1;
				}

				if (var5.field790 == 0xFFFF) {
					var5.field790 = -1;
				}
			}

			if ((var6 & 0x10) != 0) {
				int var8 = arg0.method385();
				if (var8 == 0xFFFF) {
					var8 = -1;
				}

				int var9 = arg0.method377();
				if (var5.field823 == var8 && var8 != -1) {
					int var10 = JZFUUSFN.field841[var8].field855;
					if (var10 == 1) {
						var5.field824 = 0;
						var5.field825 = 0;
						var5.field826 = var9;
						var5.field827 = 0;
					}

					if (var10 == 2) {
						var5.field827 = 0;
					}
				} else if (var8 == -1 || var5.field823 == -1 || JZFUUSFN.field841[var8].field849 >= JZFUUSFN.field841[var5.field823].field849) {
					var5.field823 = var8;
					var5.field824 = 0;
					var5.field825 = 0;
					var5.field826 = var9;
					var5.field827 = 0;
					var5.field814 = var5.field816;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var11 = arg0.method357();
				int var12 = arg0.method357();
				var5.method305(var11, field443, var12);
				var5.field820 = field443 + 300;
				var5.field821 = arg0.method377();
				var5.field822 = arg0.method357();
			}

			if ((var6 & 0x40) != 0) {
				int var13 = arg0.method376();
				int var14 = arg0.method375();
				var5.method305(var13, field443, var14);
				var5.field820 = field443 + 300;
				var5.field821 = arg0.method376();
				var5.field822 = arg0.method357();
			}

			if ((var6 & 0x8) != 0) {
				var5.field1 = LQFHJGYA.method315(arg0.method359());
				var5.field812 = var5.field1.field888;
				var5.field831 = var5.field1.field887;
				var5.field805 = var5.field1.field884;
				var5.field806 = var5.field1.field869;
				var5.field807 = var5.field1.field889;
				var5.field808 = var5.field1.field863;
				var5.field832 = var5.field1.field894;
			}

			if ((var6 & 0x2) != 0) {
				var5.field815 = arg0.method383();
				if (var5.field815 == 0xFFFF) {
					var5.field815 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				var5.field804 = arg0.method364();
				var5.field839 = 100;
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method191() {
		field259 = true;
	}

	@ObfuscatedName("client.a(IIILBSQIIHOT;LMVHXDWGI;)V")
	public final void method192(int arg0, int arg1, BSQIIHOT arg2, MVHXDWGI arg3) {
		if ((arg0 & 0x40) != 0) {
			arg2.field788 = arg3.method359();
			arg2.field789 = arg3.method385();
		}

		if ((arg0 & 0x200) != 0) {
			arg2.field790 = arg3.method359();
			int var5 = arg3.method391();
			arg2.field794 = var5 >> 16;
			arg2.field793 = (var5 & 0xFFFF) + field443;
			arg2.field791 = 0;
			arg2.field792 = 0;

			if (arg2.field793 > field443) {
				arg2.field791 = -1;
			}

			if (arg2.field790 == 0xFFFF) {
				arg2.field790 = -1;
			}
		}

		if ((arg0 & 0x1) != 0) {
			arg2.field804 = arg3.method364();
			if (arg2.field804.charAt(0) == '~') {
				arg2.field804 = arg2.field804.substring(1);
				method102(arg2.field804, 2, arg2.field80);
			} else if (field459 == arg2) {
				method102(arg2.field804, 2, arg2.field80);
			}

			arg2.field786 = 0;
			arg2.field787 = 0;
			arg2.field839 = 150;
		}

		if ((arg0 & 0x400) != 0) {
			int var6 = arg3.method376();
			int var7 = arg3.method377();
			arg2.method305(var6, field443, var7);
			arg2.field820 = field443 + 300;
			arg2.field821 = arg3.method375();
			arg2.field822 = arg3.method377();
		}

		if ((arg0 & 0x100) != 0) {
			arg2.field795 = arg3.method377();
			arg2.field797 = arg3.method357();
			arg2.field796 = arg3.method357();
			arg2.field798 = arg3.method377();
			arg2.field799 = arg3.method385() + field443;
			arg2.field800 = arg3.method359() + field443;
			arg2.field801 = arg3.method377();
			arg2.method304();
		}

		if ((arg0 & 0x10) != 0) {
			int var8 = arg3.method385();
			int var9 = arg3.method375();
			int var10 = arg3.method377();
			int var11 = arg3.field1014;

			if (arg2.field80 != null && arg2.field76) {
				long var12 = TGGPOZND.method547(arg2.field80);
				boolean var14 = false;
				if (var9 <= 1) {
					for (int var15 = 0; var15 < field450; var15++) {
						if (field145[var15] == var12) {
							var14 = true;
							break;
						}
					}
				}

				if (!var14 && field285 == 0) {
					try {
						field529.field1014 = 0;
						arg3.method393(0, field529.field1013, var10);
						field529.field1014 = 0;
						String var16 = RJLRTDJR.method495(var10, field529);
						var16 = PRVYVGOX.method451(var16);
						arg2.field804 = var16;
						arg2.field786 = var8 >> 8;
						arg2.field787 = var8 & 0xFF;
						arg2.field839 = 150;

						if (var9 == 2 || var9 == 3) {
							method102(var16, 1, "@cr2@" + arg2.field80);
						} else if (var9 == 1) {
							method102(var16, 1, "@cr1@" + arg2.field80);
						} else {
							method102(var16, 2, arg2.field80);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field1014 = var10 + var11;
		}

		if ((arg0 & 0x4) != 0) {
			arg2.field815 = arg3.method385();
			if (arg2.field815 == 0xFFFF) {
				arg2.field815 = -1;
			}
		}

		if ((arg0 & 0x20) != 0) {
			int var18 = arg3.method376();
			int var19 = arg3.method375();
			arg2.method305(var18, field443, var19);
			arg2.field820 = field443 + 300;
			arg2.field821 = arg3.method376();
			arg2.field822 = arg3.method376();
		}

		if ((arg0 & 0x80) != 0) {
			int var20 = arg3.method385();
			if (var20 == 0xFFFF) {
				var20 = -1;
			}

			int var21 = arg3.method375();
			if (arg2.field823 == var20 && var20 != -1) {
				int var22 = JZFUUSFN.field841[var20].field855;
				if (var22 == 1) {
					arg2.field824 = 0;
					arg2.field825 = 0;
					arg2.field826 = var21;
					arg2.field827 = 0;
				}

				if (var22 == 2) {
					arg2.field827 = 0;
				}
			} else if (var20 == -1 || arg2.field823 == -1 || JZFUUSFN.field841[var20].field849 >= JZFUUSFN.field841[arg2.field823].field849) {
				arg2.field823 = var20;
				arg2.field824 = 0;
				arg2.field825 = 0;
				arg2.field826 = var21;
				arg2.field827 = 0;
				arg2.field814 = arg2.field816;
			}
		}

		if ((arg0 & 0x8) != 0) {
			int var23 = arg3.method357();
			byte[] var24 = new byte[var23];
			MVHXDWGI var25 = new MVHXDWGI(var24);
			arg3.method392(0, var23, var24);
			field136[arg1] = var25;
			arg2.method42(var25);
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method193() {
		field396.method206();
		THHUVKBK.field1413 = field456;
		field429.method38(0, 0);

		if (field111 != -1) {
			method124(MYGSUHVG.method402(field111), 0, 0, 0);
		} else if (field284[field338] != -1) {
			method124(MYGSUHVG.method402(field284[field338]), 0, 0, 0);
		}

		if (field278 && field481 == 1) {
			method69();
		}

		field396.method207(field1107, 205, 553);
		field398.method206();
		THHUVKBK.field1413 = field457;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method194() {
		field469 = new BNGXLHWA(field533, "titlebox", 0);
		field470 = new BNGXLHWA(field533, "titlebutton", 0);
		field451 = new BNGXLHWA[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field451[var1] = new BNGXLHWA(field533, "runes", var1);
		}

		field183 = new IBHUFTPE(128, 265);
		field184 = new IBHUFTPE(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field183.field692[var2] = field191.field606[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field184.field692[var3] = field192.field606[var3];
		}

		field500 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field500[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field500[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field500[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field500[var7 + 192] = 0xFFFFFF;
		}

		field501 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field501[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field501[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field501[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field501[var11 + 192] = 0xFFFFFF;
		}

		field502 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field502[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field502[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field502[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field502[var15 + 192] = 0xFFFFFF;
		}

		field499 = new int[256];
		field492 = new int[32768];
		field493 = new int[32768];
		method154(null);
		field243 = new int[32768];
		field244 = new int[32768];
		method72(10, "Connecting to fileserver");

		if (!field333) {
			field163 = true;
			field333 = true;
			method169(this, 2);
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field366[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field367[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
