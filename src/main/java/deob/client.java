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
import java.util.zip.CRC32;
import sign.signlink;

@ObfuscatedName("client")
public final class client extends OGVKVTJB {

	@ObfuscatedName("client.O")
	public int field139 = 50;

	@ObfuscatedName("client.P")
	public int[] field140 = new int[field139];

	@ObfuscatedName("client.Q")
	public int[] field141 = new int[field139];

	@ObfuscatedName("client.R")
	public int[] field142 = new int[field139];

	@ObfuscatedName("client.S")
	public int[] field143 = new int[field139];

	@ObfuscatedName("client.T")
	public int[] field144 = new int[field139];

	@ObfuscatedName("client.U")
	public int[] field145 = new int[field139];

	@ObfuscatedName("client.V")
	public int[] field146 = new int[field139];

	@ObfuscatedName("client.W")
	public String[] field147 = new String[field139];

	@ObfuscatedName("client.Y")
	public int field149 = 2;

	@ObfuscatedName("client.Z")
	public int field150 = -1;

	@ObfuscatedName("client.eb")
	public GINAMIRO[] field154 = new GINAMIRO[5];

	@ObfuscatedName("client.gb")
	public int[] field156 = new int[1000];

	@ObfuscatedName("client.nb")
	public int field162 = -1;

	@ObfuscatedName("client.ub")
	public boolean field167 = true;

	@ObfuscatedName("client.vb")
	public volatile boolean field168 = false;

	@ObfuscatedName("client.Bb")
	public int field173 = -1;

	@ObfuscatedName("client.Cb")
	public int[] field174 = new int[5];

	@ObfuscatedName("client.Hb")
	public int field178 = 1;

	@ObfuscatedName("client.Kb")
	public long[] field180 = new long[100];

	@ObfuscatedName("client.Qb")
	public int field184 = 78;

	@ObfuscatedName("client.Zb")
	public JQOEJEDB field193 = new JQOEJEDB();

	@ObfuscatedName("client.ac")
	public boolean field194 = false;

	@ObfuscatedName("client.cc")
	public int[] field195 = new int[256];

	@ObfuscatedName("client.ec")
	public String field197 = "";

	@ObfuscatedName("client.fc")
	public boolean field198 = false;

	@ObfuscatedName("client.hc")
	public int[][] field200 = new int[104][104];

	@ObfuscatedName("client.lc")
	public int[] field204 = new int[151];

	@ObfuscatedName("client.mc")
	public boolean field205 = true;

	@ObfuscatedName("client.pc")
	public GLPEJJEY[] field207 = new GLPEJJEY[13];

	@ObfuscatedName("client.vc")
	public boolean field212 = false;

	@ObfuscatedName("client.yc")
	public boolean field215 = false;

	@ObfuscatedName("client.Dc")
	public boolean field219 = false;

	@ObfuscatedName("client.Sc")
	public boolean field233 = false;

	@ObfuscatedName("client.Yc")
	public TNNDDWAZ[] field239 = new TNNDDWAZ[20];

	@ObfuscatedName("client.Zc")
	public int field240 = -1;

	@ObfuscatedName("client.ed")
	public int[] field245 = new int[500];

	@ObfuscatedName("client.fd")
	public int[] field246 = new int[500];

	@ObfuscatedName("client.gd")
	public int[] field247 = new int[500];

	@ObfuscatedName("client.hd")
	public int[] field248 = new int[500];

	@ObfuscatedName("client.jd")
	public int[][] field250 = new int[104][104];

	@ObfuscatedName("client.rd")
	public int[] field257 = new int[2000];

	@ObfuscatedName("client.td")
	public int field259 = -1;

	@ObfuscatedName("client.ud")
	public String field260 = "";

	@ObfuscatedName("client.vd")
	public int[] field261 = new int[5];

	@ObfuscatedName("client.Dd")
	public int field268 = -1;

	@ObfuscatedName("client.Ed")
	public int field269 = -1;

	@ObfuscatedName("client.Kd")
	public int[] field274 = new int[VLRCHEEU.field1381];

	@ObfuscatedName("client.Nd")
	public int[] field277 = new int[7];

	@ObfuscatedName("client.Od")
	public JQOEJEDB[][][] field278 = new JQOEJEDB[4][104][104];

	@ObfuscatedName("client.Qd")
	public int[] field280 = new int[50];

	@ObfuscatedName("client.Rd")
	public String field281 = "";

	@ObfuscatedName("client.Sd")
	public String field282 = "";

	@ObfuscatedName("client.Td")
	public String[] field283 = new String[500];

	@ObfuscatedName("client.ae")
	public boolean field288 = false;

	@ObfuscatedName("client.ce")
	public TNNDDWAZ[] field290 = new TNNDDWAZ[8];

	@ObfuscatedName("client.fe")
	public String field293 = "";

	@ObfuscatedName("client.he")
	public int field294 = 0x332D25;

	@ObfuscatedName("client.ie")
	public int field295 = 0x23201B;

	@ObfuscatedName("client.je")
	public final int field296 = 100;

	@ObfuscatedName("client.ke")
	public int[] field297 = new int[100];

	@ObfuscatedName("client.me")
	public int field298 = 3;

	@ObfuscatedName("client.ne")
	public KHOMSBHW field299 = KHOMSBHW.method337(1);

	@ObfuscatedName("client.oe")
	public boolean[] field300 = new boolean[5];

	@ObfuscatedName("client.xe")
	public int field308 = -1;

	@ObfuscatedName("client.ye")
	public int field309 = -1;

	@ObfuscatedName("client.ze")
	public int[] field310 = new int[100];

	@ObfuscatedName("client.Ae")
	public String[] field311 = new String[100];

	@ObfuscatedName("client.Be")
	public String[] field312 = new String[100];

	@ObfuscatedName("client.Ce")
	public int[] field313 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Ee")
	public boolean field314 = false;

	@ObfuscatedName("client.Ge")
	public int[] field315 = new int[33];

	@ObfuscatedName("client.Me")
	public JQOEJEDB field321 = new JQOEJEDB();

	@ObfuscatedName("client.Ne")
	public int[] field322 = new int[5];

	@ObfuscatedName("client.Oe")
	public int field323 = -1;

	@ObfuscatedName("client.Pe")
	public boolean field324 = false;

	@ObfuscatedName("client.Ue")
	public JQOEJEDB field329 = new JQOEJEDB();

	@ObfuscatedName("client.Ze")
	public String field333 = "";

	@ObfuscatedName("client.jf")
	public int[] field341 = new int[5];

	@ObfuscatedName("client.vf")
	public int[][] field352 = new int[104][104];

	@ObfuscatedName("client.Kf")
	public int field367 = 2;

	@ObfuscatedName("client.Lf")
	public String field368 = "";

	@ObfuscatedName("client.Mf")
	public String field369 = "";

	@ObfuscatedName("client.Nf")
	public int field370 = 2048;

	@ObfuscatedName("client.Of")
	public int field371 = 2047;

	@ObfuscatedName("client.Pf")
	public YNSPIQRH[] field372 = new YNSPIQRH[field370];

	@ObfuscatedName("client.Rf")
	public int[] field374 = new int[field370];

	@ObfuscatedName("client.Tf")
	public int[] field376 = new int[field370];

	@ObfuscatedName("client.Uf")
	public KHOMSBHW[] field377 = new KHOMSBHW[field370];

	@ObfuscatedName("client.Vf")
	public int[] field378 = new int[VLRCHEEU.field1381];

	@ObfuscatedName("client.Xf")
	public boolean field380 = false;

	@ObfuscatedName("client.dg")
	public volatile boolean field386 = false;

	@ObfuscatedName("client.gg")
	public int field388 = 2;

	@ObfuscatedName("client.hg")
	public KHOMSBHW field389 = KHOMSBHW.method337(1);

	@ObfuscatedName("client.lg")
	public boolean field391 = true;

	@ObfuscatedName("client.mg")
	public CRC32 field392 = new CRC32();

	@ObfuscatedName("client.pg")
	public boolean field395 = false;

	@ObfuscatedName("client.ug")
	public boolean field400 = true;

	@ObfuscatedName("client.wg")
	public int[] field402 = new int[50];

	@ObfuscatedName("client.xg")
	public int[] field403 = new int[5];

	@ObfuscatedName("client.yg")
	public volatile boolean field404 = false;

	@ObfuscatedName("client.zg")
	public int field405 = -1;

	@ObfuscatedName("client.Bg")
	public int[] field407 = new int[50];

	@ObfuscatedName("client.Cg")
	public String field408 = "";

	@ObfuscatedName("client.Dg")
	public int[] field409 = new int[4000];

	@ObfuscatedName("client.Eg")
	public int[] field410 = new int[4000];

	@ObfuscatedName("client.Fg")
	public int field411 = -1;

	@ObfuscatedName("client.Gg")
	public DFJABDHX[] field412 = new DFJABDHX[4];

	@ObfuscatedName("client.Lg")
	public int[] field417 = new int[33];

	@ObfuscatedName("client.Pg")
	public int field421 = 128;

	@ObfuscatedName("client.Tg")
	public GLPEJJEY[] field425 = new GLPEJJEY[100];

	@ObfuscatedName("client.Zg")
	public String[] field430 = new String[5];

	@ObfuscatedName("client.ah")
	public boolean[] field431 = new boolean[5];

	@ObfuscatedName("client.dh")
	public KHOMSBHW field434 = new KHOMSBHW(new byte[5000]);

	@ObfuscatedName("client.eh")
	public FJJCITCO[] field435 = new FJJCITCO[16384];

	@ObfuscatedName("client.gh")
	public int[] field437 = new int[16384];

	@ObfuscatedName("client.hh")
	public long[] field438 = new long[200];

	@ObfuscatedName("client.sh")
	public String[] field448 = new String[200];

	@ObfuscatedName("client.vh")
	public final int[] field451 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.xh")
	public int field453 = 0x4D4233;

	@ObfuscatedName("client.Dh")
	public byte[] field459 = new byte[16384];

	@ObfuscatedName("client.Kh")
	public int[] field465 = new int[1000];

	@ObfuscatedName("client.Lh")
	public int[] field466 = new int[1000];

	@ObfuscatedName("client.Th")
	public boolean field473 = false;

	@ObfuscatedName("client.Yh")
	public AMSZZFWC field478 = new AMSZZFWC();

	@ObfuscatedName("client.Zh")
	public boolean field479 = false;

	@ObfuscatedName("client.bi")
	public int[] field481 = new int[151];

	@ObfuscatedName("client.ci")
	public boolean field482 = false;

	@ObfuscatedName("client.di")
	public int[] field483 = new int[9];

	@ObfuscatedName("client.ei")
	public int field484 = -1;

	@ObfuscatedName("client.hi")
	public boolean field487 = false;

	@ObfuscatedName("client.ri")
	public boolean field497 = false;

	@ObfuscatedName("client.si")
	public TNNDDWAZ[] field498 = new TNNDDWAZ[20];

	@ObfuscatedName("client.Bi")
	public int[] field506 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Ci")
	public int field507 = 0x766654;

	@ObfuscatedName("client.Di")
	public boolean field508 = false;

	@ObfuscatedName("client.Ri")
	public KHOMSBHW field520 = KHOMSBHW.method337(1);

	@ObfuscatedName("client.Si")
	public boolean field521 = false;

	@ObfuscatedName("client.bj")
	public int[] field528 = new int[2000];

	@ObfuscatedName("client.cj")
	public int[][][] field529 = new int[4][13][13];

	@ObfuscatedName("client.dj")
	public int[] field530 = new int[200];

	@ObfuscatedName("client.ej")
	public boolean field531 = false;

	@ObfuscatedName("client.hj")
	public boolean field534 = false;

	@ObfuscatedName("client.lj")
	public int[] field538 = new int[VLRCHEEU.field1381];

	@ObfuscatedName("client.nj")
	public boolean field540 = true;

	@ObfuscatedName("client.oj")
	public TNNDDWAZ[] field541 = new TNNDDWAZ[1000];

	@ObfuscatedName("client.qj")
	public TNNDDWAZ[] field542 = new TNNDDWAZ[100];

	@ObfuscatedName("client.vj")
	public boolean field546 = false;

	@ObfuscatedName("client.Ej")
	public int field555 = 1;

	@ObfuscatedName("client.Hj")
	public boolean field558 = false;

	@ObfuscatedName("client.Kj")
	public GLPEJJEY[] field561 = new GLPEJJEY[2];

	@ObfuscatedName("client.Mj")
	public int field562 = -1;

	@ObfuscatedName("client.Mb")
	public static BigInteger field181 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.kc")
	public static BigInteger field203 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Qe")
	public static int field325 = 10;

	@ObfuscatedName("client.Se")
	public static boolean field327 = true;

	@ObfuscatedName("client.Wf")
	public static String field379 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.ai")
	public static int[] field480 = new int[32];

	@ObfuscatedName("client.ii")
	public static int[] field488 = new int[99];

	@ObfuscatedName("client.Qi")
	public static final int[][] field519 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Vi")
	public static final int[] field524 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.N")
	public int field138;

	@ObfuscatedName("client.X")
	public int field148;

	@ObfuscatedName("client.cb")
	public int field152;

	@ObfuscatedName("client.db")
	public static int field153;

	@ObfuscatedName("client.fb")
	public int field155;

	@ObfuscatedName("client.ib")
	public int field157;

	@ObfuscatedName("client.jb")
	public int field158;

	@ObfuscatedName("client.kb")
	public int field159;

	@ObfuscatedName("client.lb")
	public int field160;

	@ObfuscatedName("client.ob")
	public int field163;

	@ObfuscatedName("client.qb")
	public int field165;

	@ObfuscatedName("client.tb")
	public int field166;

	@ObfuscatedName("client.xb")
	public int field169;

	@ObfuscatedName("client.yb")
	public int field170;

	@ObfuscatedName("client.Db")
	public int field175;

	@ObfuscatedName("client.Eb")
	public int field176;

	@ObfuscatedName("client.Gb")
	public int field177;

	@ObfuscatedName("client.Ob")
	public int field182;

	@ObfuscatedName("client.Rb")
	public static int field185;

	@ObfuscatedName("client.Sb")
	public int field186;

	@ObfuscatedName("client.Tb")
	public int field187;

	@ObfuscatedName("client.Ub")
	public int field188;

	@ObfuscatedName("client.Vb")
	public int field189;

	@ObfuscatedName("client.Wb")
	public int field190;

	@ObfuscatedName("client.Xb")
	public int field191;

	@ObfuscatedName("client.Yb")
	public static int field192;

	@ObfuscatedName("client.dc")
	public int field196;

	@ObfuscatedName("client.nc")
	public int field206;

	@ObfuscatedName("client.wc")
	public int field213;

	@ObfuscatedName("client.xc")
	public int field214;

	@ObfuscatedName("client.zc")
	public int field216;

	@ObfuscatedName("client.Ac")
	public int field217;

	@ObfuscatedName("client.Ec")
	public int field220;

	@ObfuscatedName("client.Fc")
	public int field221;

	@ObfuscatedName("client.Mc")
	public int field228;

	@ObfuscatedName("client.Nc")
	public int field229;

	@ObfuscatedName("client.Oc")
	public int field230;

	@ObfuscatedName("client.Pc")
	public int field231;

	@ObfuscatedName("client.Qc")
	public int field232;

	@ObfuscatedName("client.Tc")
	public int field234;

	@ObfuscatedName("client.Uc")
	public int field235;

	@ObfuscatedName("client.Vc")
	public int field236;

	@ObfuscatedName("client.Wc")
	public int field237;

	@ObfuscatedName("client.Xc")
	public int field238;

	@ObfuscatedName("client.ad")
	public int field241;

	@ObfuscatedName("client.id")
	public int field249;

	@ObfuscatedName("client.kd")
	public int field251;

	@ObfuscatedName("client.ld")
	public int field252;

	@ObfuscatedName("client.md")
	public int field253;

	@ObfuscatedName("client.nd")
	public int field254;

	@ObfuscatedName("client.od")
	public int field255;

	@ObfuscatedName("client.sd")
	public int field258;

	@ObfuscatedName("client.xd")
	public int field262;

	@ObfuscatedName("client.yd")
	public int field263;

	@ObfuscatedName("client.zd")
	public int field264;

	@ObfuscatedName("client.Ad")
	public int field265;

	@ObfuscatedName("client.Bd")
	public int field266;

	@ObfuscatedName("client.Cd")
	public int field267;

	@ObfuscatedName("client.Gd")
	public int field270;

	@ObfuscatedName("client.Hd")
	public int field271;

	@ObfuscatedName("client.Id")
	public int field272;

	@ObfuscatedName("client.Pd")
	public int field279;

	@ObfuscatedName("client.Yd")
	public int field287;

	@ObfuscatedName("client.de")
	public int field291;

	@ObfuscatedName("client.ee")
	public int field292;

	@ObfuscatedName("client.qe")
	public int field301;

	@ObfuscatedName("client.re")
	public int field302;

	@ObfuscatedName("client.se")
	public int field303;

	@ObfuscatedName("client.te")
	public int field304;

	@ObfuscatedName("client.ue")
	public int field305;

	@ObfuscatedName("client.ve")
	public int field306;

	@ObfuscatedName("client.we")
	public int field307;

	@ObfuscatedName("client.Le")
	public int field320;

	@ObfuscatedName("client.Re")
	public static int field326;

	@ObfuscatedName("client.Ve")
	public static int field330;

	@ObfuscatedName("client.Xe")
	public int field332;

	@ObfuscatedName("client.gf")
	public int field339;

	@ObfuscatedName("client.hf")
	public int field340;

	@ObfuscatedName("client.uf")
	public static int field351;

	@ObfuscatedName("client.Gf")
	public int field363;

	@ObfuscatedName("client.If")
	public static int field365;

	@ObfuscatedName("client.Jf")
	public int field366;

	@ObfuscatedName("client.Qf")
	public int field373;

	@ObfuscatedName("client.Sf")
	public int field375;

	@ObfuscatedName("client.fg")
	public int field387;

	@ObfuscatedName("client.ng")
	public int field393;

	@ObfuscatedName("client.og")
	public int field394;

	@ObfuscatedName("client.Mg")
	public int field418;

	@ObfuscatedName("client.Og")
	public static int field420;

	@ObfuscatedName("client.Qg")
	public int field422;

	@ObfuscatedName("client.Rg")
	public int field423;

	@ObfuscatedName("client.Sg")
	public int field424;

	@ObfuscatedName("client.Vg")
	public int field426;

	@ObfuscatedName("client.Wg")
	public int field427;

	@ObfuscatedName("client.Xg")
	public int field428;

	@ObfuscatedName("client.Yg")
	public int field429;

	@ObfuscatedName("client.bh")
	public static int field432;

	@ObfuscatedName("client.ch")
	public int field433;

	@ObfuscatedName("client.fh")
	public int field436;

	@ObfuscatedName("client.ih")
	public int field439;

	@ObfuscatedName("client.jh")
	public int field440;

	@ObfuscatedName("client.kh")
	public int field441;

	@ObfuscatedName("client.lh")
	public int field442;

	@ObfuscatedName("client.mh")
	public int field443;

	@ObfuscatedName("client.nh")
	public int field444;

	@ObfuscatedName("client.oh")
	public int field445;

	@ObfuscatedName("client.ph")
	public int field446;

	@ObfuscatedName("client.rh")
	public int field447;

	@ObfuscatedName("client.th")
	public int field449;

	@ObfuscatedName("client.uh")
	public int field450;

	@ObfuscatedName("client.wh")
	public int field452;

	@ObfuscatedName("client.yh")
	public int field454;

	@ObfuscatedName("client.zh")
	public static int field455;

	@ObfuscatedName("client.Ah")
	public int field456;

	@ObfuscatedName("client.Ch")
	public int field458;

	@ObfuscatedName("client.Eh")
	public int field460;

	@ObfuscatedName("client.Fh")
	public int field461;

	@ObfuscatedName("client.Gh")
	public int field462;

	@ObfuscatedName("client.Hh")
	public int field463;

	@ObfuscatedName("client.Jh")
	public int field464;

	@ObfuscatedName("client.Rh")
	public static int field471;

	@ObfuscatedName("client.Sh")
	public static int field472;

	@ObfuscatedName("client.Wh")
	public int field476;

	@ObfuscatedName("client.Xh")
	public int field477;

	@ObfuscatedName("client.fi")
	public int field485;

	@ObfuscatedName("client.gi")
	public int field486;

	@ObfuscatedName("client.ji")
	public int field489;

	@ObfuscatedName("client.ki")
	public int field490;

	@ObfuscatedName("client.li")
	public int field491;

	@ObfuscatedName("client.mi")
	public int field492;

	@ObfuscatedName("client.ni")
	public int field493;

	@ObfuscatedName("client.oi")
	public int field494;

	@ObfuscatedName("client.pi")
	public int field495;

	@ObfuscatedName("client.ui")
	public static int field499;

	@ObfuscatedName("client.vi")
	public static int field500;

	@ObfuscatedName("client.wi")
	public int field501;

	@ObfuscatedName("client.xi")
	public int field502;

	@ObfuscatedName("client.yi")
	public int field503;

	@ObfuscatedName("client.zi")
	public int field504;

	@ObfuscatedName("client.Ai")
	public int field505;

	@ObfuscatedName("client.Gi")
	public int field511;

	@ObfuscatedName("client.Ji")
	public int field513;

	@ObfuscatedName("client.Ti")
	public int field522;

	@ObfuscatedName("client.Ui")
	public int field523;

	@ObfuscatedName("client.Wi")
	public int field525;

	@ObfuscatedName("client.fj")
	public static int field532;

	@ObfuscatedName("client.gj")
	public static int field533;

	@ObfuscatedName("client.ij")
	public int field535;

	@ObfuscatedName("client.mj")
	public int field539;

	@ObfuscatedName("client.sj")
	public int field543;

	@ObfuscatedName("client.tj")
	public int field544;

	@ObfuscatedName("client.uj")
	public int field545;

	@ObfuscatedName("client.wj")
	public int field547;

	@ObfuscatedName("client.xj")
	public static int field548;

	@ObfuscatedName("client.yj")
	public int field549;

	@ObfuscatedName("client.zj")
	public int field550;

	@ObfuscatedName("client.Aj")
	public int field551;

	@ObfuscatedName("client.Dj")
	public int field554;

	@ObfuscatedName("client.Fj")
	public static int field556;

	@ObfuscatedName("client.Gj")
	public static int field557;

	@ObfuscatedName("client.Ij")
	public int field559;

	@ObfuscatedName("client.Jj")
	public int field560;

	@ObfuscatedName("client.pb")
	public long field164;

	@ObfuscatedName("client.Pb")
	public long field183;

	@ObfuscatedName("client.Ld")
	public long field275;

	@ObfuscatedName("client.Ke")
	public long field319;

	@ObfuscatedName("client.wf")
	public long field353;

	@ObfuscatedName("client.We")
	public BGNYQYNO field331;

	@ObfuscatedName("client.Hg")
	public EXARMWSO field413;

	@ObfuscatedName("client.Ig")
	public EXARMWSO field414;

	@ObfuscatedName("client.Jg")
	public EXARMWSO field415;

	@ObfuscatedName("client.Kg")
	public EXARMWSO field416;

	@ObfuscatedName("client.ic")
	public GLPEJJEY field201;

	@ObfuscatedName("client.jc")
	public GLPEJJEY field202;

	@ObfuscatedName("client.Hc")
	public GLPEJJEY field223;

	@ObfuscatedName("client.Ic")
	public GLPEJJEY field224;

	@ObfuscatedName("client.Jc")
	public GLPEJJEY field225;

	@ObfuscatedName("client.Kc")
	public GLPEJJEY field226;

	@ObfuscatedName("client.Lc")
	public GLPEJJEY field227;

	@ObfuscatedName("client.bd")
	public GLPEJJEY field242;

	@ObfuscatedName("client.cd")
	public GLPEJJEY field243;

	@ObfuscatedName("client.dd")
	public GLPEJJEY field244;

	@ObfuscatedName("client.af")
	public GLPEJJEY field334;

	@ObfuscatedName("client.bf")
	public GLPEJJEY field335;

	@ObfuscatedName("client.cf")
	public GLPEJJEY field336;

	@ObfuscatedName("client.Yf")
	public GLPEJJEY field381;

	@ObfuscatedName("client.Zf")
	public GLPEJJEY field382;

	@ObfuscatedName("client.ag")
	public GLPEJJEY field383;

	@ObfuscatedName("client.bg")
	public GLPEJJEY field384;

	@ObfuscatedName("client.cg")
	public GLPEJJEY field385;

	@ObfuscatedName("client.jj")
	public GLPEJJEY field536;

	@ObfuscatedName("client.kj")
	public GLPEJJEY field537;

	@ObfuscatedName("client.Gc")
	public HAMMMZGY field222;

	@ObfuscatedName("client.gc")
	public KVLMMBSC field199;

	@ObfuscatedName("client.qc")
	public PFNLOREN field208;

	@ObfuscatedName("client.rc")
	public PFNLOREN field209;

	@ObfuscatedName("client.sc")
	public PFNLOREN field210;

	@ObfuscatedName("client.kf")
	public PFNLOREN field342;

	@ObfuscatedName("client.lf")
	public PFNLOREN field343;

	@ObfuscatedName("client.mf")
	public PFNLOREN field344;

	@ObfuscatedName("client.nf")
	public PFNLOREN field345;

	@ObfuscatedName("client.of")
	public PFNLOREN field346;

	@ObfuscatedName("client.pf")
	public PFNLOREN field347;

	@ObfuscatedName("client.qf")
	public PFNLOREN field348;

	@ObfuscatedName("client.rf")
	public PFNLOREN field349;

	@ObfuscatedName("client.sf")
	public PFNLOREN field350;

	@ObfuscatedName("client.xf")
	public PFNLOREN field354;

	@ObfuscatedName("client.yf")
	public PFNLOREN field355;

	@ObfuscatedName("client.zf")
	public PFNLOREN field356;

	@ObfuscatedName("client.Af")
	public PFNLOREN field357;

	@ObfuscatedName("client.Bf")
	public PFNLOREN field358;

	@ObfuscatedName("client.Cf")
	public PFNLOREN field359;

	@ObfuscatedName("client.Df")
	public PFNLOREN field360;

	@ObfuscatedName("client.Ef")
	public PFNLOREN field361;

	@ObfuscatedName("client.Ff")
	public PFNLOREN field362;

	@ObfuscatedName("client.qg")
	public PFNLOREN field396;

	@ObfuscatedName("client.rg")
	public PFNLOREN field397;

	@ObfuscatedName("client.sg")
	public PFNLOREN field398;

	@ObfuscatedName("client.tg")
	public PFNLOREN field399;

	@ObfuscatedName("client.Nj")
	public SCSPFXGB field563;

	@ObfuscatedName("client.tc")
	public SSXXGGTR field211;

	@ObfuscatedName("client.ab")
	public SYUGXMZF field151;

	@ObfuscatedName("client.zb")
	public TNNDDWAZ field171;

	@ObfuscatedName("client.Ab")
	public TNNDDWAZ field172;

	@ObfuscatedName("client.Bc")
	public TNNDDWAZ field218;

	@ObfuscatedName("client.Uh")
	public TNNDDWAZ field474;

	@ObfuscatedName("client.Vh")
	public TNNDDWAZ field475;

	@ObfuscatedName("client.qi")
	public TNNDDWAZ field496;

	@ObfuscatedName("client.Ki")
	public TNNDDWAZ field514;

	@ObfuscatedName("client.Li")
	public TNNDDWAZ field515;

	@ObfuscatedName("client.Mi")
	public TNNDDWAZ field516;

	@ObfuscatedName("client.Ni")
	public TNNDDWAZ field517;

	@ObfuscatedName("client.Oi")
	public TNNDDWAZ field518;

	@ObfuscatedName("client.Xi")
	public TNNDDWAZ field526;

	@ObfuscatedName("client.Bj")
	public TNNDDWAZ field552;

	@ObfuscatedName("client.Cj")
	public TNNDDWAZ field553;

	@ObfuscatedName("client.qd")
	public static YNSPIQRH field256;

	@ObfuscatedName("client.mb")
	public String field161;

	@ObfuscatedName("client.Jd")
	public String field273;

	@ObfuscatedName("client.Md")
	public String field276;

	@ObfuscatedName("client.Yi")
	public String field527;

	@ObfuscatedName("client.Ii")
	public Socket field512;

	@ObfuscatedName("client.Ib")
	public static boolean field179;

	@ObfuscatedName("client.Te")
	public static boolean field328;

	@ObfuscatedName("client.ig")
	public static boolean field390;

	@ObfuscatedName("client.vg")
	public static boolean field401;

	@ObfuscatedName("client.Ud")
	public int[] field284;

	@ObfuscatedName("client.Vd")
	public int[] field285;

	@ObfuscatedName("client.Wd")
	public int[] field286;

	@ObfuscatedName("client.He")
	public int[] field316;

	@ObfuscatedName("client.Ie")
	public int[] field317;

	@ObfuscatedName("client.Je")
	public int[] field318;

	@ObfuscatedName("client.ef")
	public int[] field337;

	@ObfuscatedName("client.ff")
	public int[] field338;

	@ObfuscatedName("client.Nh")
	public int[] field467;

	@ObfuscatedName("client.Oh")
	public int[] field468;

	@ObfuscatedName("client.Ph")
	public int[] field469;

	@ObfuscatedName("client.Qh")
	public int[] field470;

	@ObfuscatedName("client.Ei")
	public int[] field509;

	@ObfuscatedName("client.Fi")
	public int[] field510;

	@ObfuscatedName("client.Bh")
	public GLPEJJEY[] field457;

	@ObfuscatedName("client.be")
	public byte[][] field289;

	@ObfuscatedName("client.Ng")
	public byte[][] field419;

	@ObfuscatedName("client.Ag")
	public byte[][][] field406;

	@ObfuscatedName("client.Hf")
	public int[][][] field364;

	@ObfuscatedName("client.a(Z)V")
	public final void method66() {
		if (field232 > 0) {
			method185();
		} else {
			field398.method465();
			field414.method248(144, "Connection lost", 257, 0);
			field414.method248(143, "Connection lost", 256, 0xFFFFFF);
			field414.method248(159, "Please wait - attempting to reestablish", 257, 0);
			field414.method248(158, "Please wait - attempting to reestablish", 256, 0xFFFFFF);
			field398.method466(field1027, 4, 4);
			field279 = 0;
			field216 = 0;
			KVLMMBSC var1 = field199;
			field198 = false;
			field262 = 0;
			method179(field281, field282, true);

			if (!field198) {
				method185();
			}

			try {
				var1.method398();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method67() {
		if (field157 == 0 && field270 == 0) {
			field283[field476] = "Walk here";
			field247[field476] = 451;
			field245[field476] = field1035;
			field246[field476] = field1036;
			field476++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < GEUHTGZJ.field775; var2++) {
			int var3 = GEUHTGZJ.field776[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field331.method45(field320, var4, var5, var3) >= 0) {
					RUJAIVBH var8 = RUJAIVBH.method512(var7);
					if (var8.field1168 != null) {
						var8 = var8.method510();
					}

					if (var8 == null) {
						continue;
					}

					if (field157 == 1) {
						field283[field476] = "Use " + field161 + " with @cya@" + var8.field1157;
						field247[field476] = 910;
						field248[field476] = var3;
						field245[field476] = var4;
						field246[field476] = var5;
						field476++;
					} else if (field270 != 1) {
						if (var8.field1153 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1153[var9] != null) {
									field283[field476] = var8.field1153[var9] + " @cya@" + var8.field1157;

									if (var9 == 0) {
										field247[field476] = 988;
									}

									if (var9 == 1) {
										field247[field476] = 341;
									}

									if (var9 == 2) {
										field247[field476] = 350;
									}

									if (var9 == 3) {
										field247[field476] = 648;
									}

									if (var9 == 4) {
										field247[field476] = 1736;
									}

									field248[field476] = var3;
									field245[field476] = var4;
									field246[field476] = var5;
									field476++;
								}
							}
						}

						field283[field476] = "Examine @cya@" + var8.field1157;
						field247[field476] = 1720;
						field248[field476] = var8.field1145 << 14;
						field245[field476] = var4;
						field246[field476] = var5;
						field476++;
					} else if ((field272 & 0x4) == 4) {
						field283[field476] = field273 + " @cya@" + var8.field1157;
						field247[field476] = 475;
						field248[field476] = var3;
						field245[field476] = var4;
						field246[field476] = var5;
						field476++;
					}
				}

				if (var6 == 1) {
					FJJCITCO var10 = field435[var7];
					if (var10.field650.field1299 == 1 && (var10.field1326 & 0x7F) == 0x40 && (var10.field1327 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field436; var11++) {
							FJJCITCO var12 = field435[field437[var11]];
							if (var12 != null && var10 != var12 && var12.field650.field1299 == 1 && var10.field1326 == var12.field1326 && var10.field1327 == var12.field1327) {
								method172(var5, field437[var11], var4, var12.field650);
							}
						}

						for (int var13 = 0; var13 < field373; var13++) {
							YNSPIQRH var14 = field372[field374[var13]];
							if (var14 != null && var10.field1326 == var14.field1326 && var10.field1327 == var14.field1327) {
								method127(var5, field374[var13], var14, var4);
							}
						}
					}

					method172(var5, var7, var4, var10.field650);
				}

				if (var6 == 0) {
					YNSPIQRH var15 = field372[var7];
					if ((var15.field1326 & 0x7F) == 0x40 && (var15.field1327 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field436; var16++) {
							FJJCITCO var17 = field435[field437[var16]];
							if (var17 != null && var17.field650.field1299 == 1 && var15.field1326 == var17.field1326 && var15.field1327 == var17.field1327) {
								method172(var5, field437[var16], var4, var17.field650);
							}
						}

						for (int var18 = 0; var18 < field373; var18++) {
							YNSPIQRH var19 = field372[field374[var18]];
							if (var19 != null && var15 != var19 && var15.field1326 == var19.field1326 && var15.field1327 == var19.field1327) {
								method127(var5, field374[var18], var19, var4);
							}
						}
					}

					method127(var5, var7, var15, var4);
				}

				if (var6 == 3) {
					JQOEJEDB var20 = field278[field320][var4][var5];
					if (var20 != null) {
						for (PMWLDMKW var21 = (PMWLDMKW) var20.method330(); var21 != null; var21 = (PMWLDMKW) var20.method332()) {
							FZACNING var22 = FZACNING.method278(var21.field1083);
							if (field157 == 1) {
								field283[field476] = "Use " + field161 + " with @lre@" + var22.field678;
								field247[field476] = 858;
								field248[field476] = var21.field1083;
								field245[field476] = var4;
								field246[field476] = var5;
								field476++;
							} else if (field270 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field679 != null && var22.field679[var23] != null) {
										field283[field476] = var22.field679[var23] + " @lre@" + var22.field678;

										if (var23 == 0) {
											field247[field476] = 583;
										}

										if (var23 == 1) {
											field247[field476] = 261;
										}

										if (var23 == 2) {
											field247[field476] = 766;
										}

										if (var23 == 3) {
											field247[field476] = 972;
										}

										if (var23 == 4) {
											field247[field476] = 971;
										}

										field248[field476] = var21.field1083;
										field245[field476] = var4;
										field246[field476] = var5;
										field476++;
									} else if (var23 == 2) {
										field283[field476] = "Take @lre@" + var22.field678;
										field247[field476] = 766;
										field248[field476] = var21.field1083;
										field245[field476] = var4;
										field246[field476] = var5;
										field476++;
									}
								}

								field283[field476] = "Examine @lre@" + var22.field678;
								field247[field476] = 1015;
								field248[field476] = var21.field1083;
								field245[field476] = var4;
								field246[field476] = var5;
								field476++;
							} else if ((field272 & 0x1) == 1) {
								field283[field476] = field273 + " @lre@" + var22.field678;
								field247[field476] = 139;
								field248[field476] = var21.field1083;
								field245[field476] = var4;
								field246[field476] = var5;
								field476++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LKHOMSBHW;IZ)V")
	public final void method68(KHOMSBHW arg0, int arg1) {
		field155 = 0;
		field375 = 0;
		method183(arg0, arg1);
		method148(arg1, arg0);
		method77(arg1, arg0);

		for (int var3 = 0; var3 < field155; var3++) {
			int var4 = field156[var3];
			if (field420 != field435[var4].field1329) {
				field435[var4].field650 = null;
				field435[var4] = null;
			}
		}

		if (arg0.field934 != arg1) {
			signlink.reporterror(field281 + " size mismatch in getnpcpos - pos:" + arg0.field934 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field436; var5++) {
			if (field435[field437[var5]] == null) {
				signlink.reporterror(field281 + " null entry in npc list - pos:" + var5 + " size:" + field436);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method69() {
		if (field236 == 0) {
			int var1 = field1041;
			if (field270 == 1 && field1042 >= 516 && field1043 >= 160 && field1042 <= 765 && field1043 <= 205) {
				var1 = 0;
			}

			if (field219) {
				if (var1 != 1) {
					int var2 = field1035;
					int var3 = field1036;
					if (field439 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field439 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field439 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field440 - 10 || var2 > field442 + field440 + 10 || var3 < field441 - 10 || var3 > field443 + field441 + 10) {
						field219 = false;

						if (field439 == 1) {
							field473 = true;
						}

						if (field439 == 2) {
							field482 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field440;
					int var5 = field441;
					int var6 = field442;
					int var7 = field1042;
					int var8 = field1043;
					if (field439 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field439 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field439 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field476; var10++) {
						int var11 = (field476 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method176(var9);
					}

					field219 = false;

					if (field439 == 1) {
						field473 = true;
					}

					if (field439 == 2) {
						field482 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field476 > 0) {
					int var12 = field247[field476 - 1];
					if (var12 == 189 || var12 == 454 || var12 == 571 || var12 == 853 || var12 == 246 || var12 == 212 || var12 == 543 || var12 == 506 || var12 == 265 || var12 == 738 || var12 == 567 || var12 == 1717) {
						int var13 = field245[field476 - 1];
						int var14 = field246[field476 - 1];
						AMSZZFWC var15 = AMSZZFWC.field63[var14];
						if (var15.field61 || var15.field7) {
							field314 = false;
							field182 = 0;
							field234 = var14;
							field235 = var13;
							field236 = 2;
							field237 = field1042;
							field238 = field1043;

							if (AMSZZFWC.field63[var14].field6 == field309) {
								field236 = 1;
							}

							if (AMSZZFWC.field63[var14].field6 == field411) {
								field236 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field559 == 1 || method85(field476 - 1)) && field476 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field476 > 0) {
					method176(field476 - 1);
				}

				if (var1 != 2 || field476 <= 0) {
					return;
				}

				method95();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IB)V")
	public final void method70(String arg0, int arg1) {
		field258 = arg1;
		field527 = arg0;
		method86();

		if (field151 == null) {
			super.method70(arg0, arg1);
		} else {
			field344.method465();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field415.method248(var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", var3 / 2, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			OMVHXJFV.method421(304, 34, 0x8C1111, var6, var3 / 2 - 152);
			OMVHXJFV.method421(302, 32, 0, var6 + 1, var3 / 2 - 151);
			OMVHXJFV.method420(var3 / 2 - 150, 0x8C1111, 30, arg1 * 3, var6 + 2);
			OMVHXJFV.method420(arg1 * 3 + var3 / 2 - 150, 0, 30, 300 - arg1 * 3, var6 + 2);
			field415.method248(var4 / 2 + 5 - var5, arg0, var3 / 2, 0xFFFFFF);
			field344.method466(field1027, 171, 202);

			if (field487) {
				field487 = false;

				if (!field168) {
					field345.method466(field1027, 0, 0);
					field346.method466(field1027, 0, 637);
				}

				field342.method466(field1027, 0, 128);
				field343.method466(field1027, 371, 202);
				field347.method466(field1027, 265, 0);
				field348.method466(field1027, 265, 562);
				field349.method466(field1027, 171, 128);
				field350.method466(field1027, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean method71(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static final String method72(int arg0) {
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

	@ObfuscatedName("client.e(I)V")
	public final void method73() {
		for (DXQCGOAI var1 = (DXQCGOAI) field329.method329(); var1 != null; var1 = (DXQCGOAI) field329.method331()) {
			if (field320 != var1.field574 || var1.field573) {
				var1.method1();
			} else if (field420 >= var1.field571) {
				var1.method222(field458);

				if (var1.field573) {
					var1.method1();
				} else {
					field331.method26(var1.field576, var1.field577, -1, 0, var1.field574, 60, false, var1, var1.field575);
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)Ljava/lang/String;")
	public final String method74() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1030 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.f(I)V")
	public final void method75() {
		byte[] var1 = field151.method551("title.dat", null);
		TNNDDWAZ var2 = new TNNDDWAZ(var1, this);
		field345.method465();
		var2.method556(0, 0);
		field346.method465();
		var2.method556(-637, 0);
		field342.method465();
		var2.method556(-128, 0);
		field343.method465();
		var2.method556(-202, -371);
		field344.method465();
		var2.method556(-202, -171);
		field347.method465();
		var2.method556(0, -265);
		field348.method465();
		var2.method556(-562, -265);
		field349.method465();
		var2.method556(-128, -171);
		field350.method465();
		var2.method556(-562, -171);
		int[] var3 = new int[var2.field1275];
		for (int var4 = 0; var4 < var2.field1276; var4++) {
			for (int var5 = 0; var5 < var2.field1275; var5++) {
				var3[var5] = var2.field1274[var2.field1275 * var4 + var2.field1275 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1275; var6++) {
				var2.field1274[var2.field1275 * var4 + var6] = var3[var6];
			}
		}

		field345.method465();
		var2.method556(382, 0);
		field346.method465();
		var2.method556(-255, 0);
		field342.method465();
		var2.method556(254, 0);
		field343.method465();
		var2.method556(180, -371);
		field344.method465();
		var2.method556(180, -171);
		field347.method465();
		var2.method556(382, -265);
		field348.method465();
		var2.method556(-180, -265);
		field349.method465();
		var2.method556(254, -171);
		field350.method465();
		var2.method556(-180, -171);
		TNNDDWAZ var7 = new TNNDDWAZ(field151, "logo", 0);
		field342.method465();
		var7.method558(18, 382 - var7.field1275 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.g(I)V")
	public final void method76() {
		field536 = new GLPEJJEY(field151, "titlebox", 0);
		field537 = new GLPEJJEY(field151, "titlebutton", 0);
		field457 = new GLPEJJEY[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field457[var2] = new GLPEJJEY(field151, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field457[var3] = new GLPEJJEY(field151, "runes", (var3 & 0x3) + 12);
			}
		}

		field552 = new TNNDDWAZ(128, 265);
		field553 = new TNNDDWAZ(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field552.field1274[var4] = field345.field1069[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field553.field1274[var5] = field346.field1069[var5];
		}

		field468 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field468[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field468[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field468[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field468[var9 + 192] = 0xFFFFFF;
		}

		field469 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field469[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field469[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field469[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field469[var13 + 192] = 0xFFFFFF;
		}

		field470 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field470[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field470[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field470[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field470[var17 + 192] = 0xFFFFFF;
		}

		field467 = new int[256];
		field509 = new int[32768];
		field510 = new int[32768];
		method152(null);
		field337 = new int[32768];
		field338 = new int[32768];
		method70("Connecting to fileserver", 10);

		if (!field168) {
			field386 = true;
			field168 = true;
			method102(this, 2);
		}
	}

	@ObfuscatedName("client.a(ILKHOMSBHW;B)V")
	public final void method77(int arg0, KHOMSBHW arg1) {
		for (int var3 = 0; var3 < field375; var3++) {
			int var4 = field376[var3];
			FJJCITCO var5 = field435[var4];
			int var6 = arg1.method349();
			if ((var6 & 0x8) != 0) {
				var5.field1325 = arg1.method379();
				if (var5.field1325 == 0xFFFF) {
					var5.field1325 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field1365 = arg1.method351();
				var5.field1366 = arg1.method351();
			}

			if ((var6 & 0x2) != 0) {
				int var7 = arg1.method377();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg1.method370();
				if (var5.field1339 == var7 && var7 != -1) {
					int var9 = EJHGNUGE.field604[var7].field618;
					if (var9 == 1) {
						var5.field1340 = 0;
						var5.field1341 = 0;
						var5.field1342 = var8;
						var5.field1343 = 0;
					}

					if (var9 == 2) {
						var5.field1343 = 0;
					}
				} else if (var7 == -1 || var5.field1339 == -1 || EJHGNUGE.field604[var7].field612 >= EJHGNUGE.field604[var5.field1339].field612) {
					var5.field1339 = var7;
					var5.field1340 = 0;
					var5.field1341 = 0;
					var5.field1342 = var8;
					var5.field1343 = 0;
					var5.field1379 = var5.field1346;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var10 = arg1.method369();
				int var11 = arg1.method370();
				var5.method579(field420, var11, var10);
				var5.field1336 = field420 + 300;
				var5.field1337 = arg1.method349();
				var5.field1338 = arg1.method370();
			}

			if ((var6 & 0x80) != 0) {
				var5.field1331 = arg1.method356();
				var5.field1335 = 100;
			}

			if ((var6 & 0x10) != 0) {
				var5.field650 = UGDYQAXI.method570(arg1.method378());
				var5.field1352 = var5.field650.field1299;
				var5.field1345 = var5.field650.field1318;
				var5.field1347 = var5.field650.field1306;
				var5.field1348 = var5.field650.field1307;
				var5.field1349 = var5.field650.field1315;
				var5.field1350 = var5.field650.field1297;
				var5.field1332 = var5.field650.field1295;
			}

			if ((var6 & 0x40) != 0) {
				var5.field1370 = arg1.method379();
				int var12 = arg1.method386();
				var5.field1374 = var12 >> 16;
				var5.field1373 = (var12 & 0xFFFF) + field420;
				var5.field1371 = 0;
				var5.field1372 = 0;

				if (var5.field1373 > field420) {
					var5.field1371 = -1;
				}

				if (var5.field1370 == 0xFFFF) {
					var5.field1370 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				int var13 = arg1.method368();
				int var14 = arg1.method349();
				var5.method579(field420, var14, var13);
				var5.field1336 = field420 + 300;
				var5.field1337 = arg1.method368();
				var5.field1338 = arg1.method368();
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method78() {
		for (int var1 = -1; var1 < field373; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field371;
			} else {
				var2 = field374[var1];
			}

			YNSPIQRH var3 = field372[var2];
			if (var3 != null && var3.field1335 > 0) {
				var3.field1335--;
				if (var3.field1335 == 0) {
					var3.field1331 = null;
				}
			}
		}

		field365++;
		if (field365 > 88) {
			field365 = 0;
			field299.method338(211);
		}

		for (int var4 = 0; var4 < field436; var4++) {
			int var5 = field437[var4];
			FJJCITCO var6 = field435[var5];
			if (var6 != null && var6.field1335 > 0) {
				var6.field1335--;
				if (var6.field1335 == 0) {
					var6.field1331 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)Z")
	public final boolean method79(int arg0, int arg1) {
		boolean var3 = false;
		AMSZZFWC var4 = AMSZZFWC.field63[arg1];
		for (int var5 = 0; var5 < var4.field19.length && var4.field19[var5] != -1; var5++) {
			AMSZZFWC var6 = AMSZZFWC.field63[var4.field19[var5]];
			if (var6.field33 == 1) {
				var3 |= method79(arg0, var6.field14);
			}

			if (var6.field33 == 6 && (var6.field38 != -1 || var6.field39 != -1)) {
				boolean var7 = method119(var6);
				int var8;
				if (var7) {
					var8 = var6.field39;
				} else {
					var8 = var6.field38;
				}

				if (var8 != -1) {
					EJHGNUGE var9 = EJHGNUGE.field604[var8];
					var6.field56 += arg0;
					while (var6.field56 > var9.method241(var6.field40)) {
						var6.field56 -= var9.method241(var6.field40) + 1;
						var6.field40++;
						if (var6.field40 >= var9.field605) {
							var6.field40 -= var9.field609;
							if (var6.field40 < 0 || var6.field40 >= var9.field605) {
								var6.field40 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.b(ILKHOMSBHW;B)V")
	public final void method80(int arg0, KHOMSBHW arg1) {
		field155 = 0;
		field375 = 0;
		method111(arg1, arg0);
		method92(arg0, arg1);
		method153(arg1, arg0);
		method149(arg1, arg0);

		for (int var3 = 0; var3 < field155; var3++) {
			int var4 = field156[var3];
			if (field420 != field372[var4].field1329) {
				field372[var4] = null;
			}
		}

		if (arg1.field934 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field934 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field373; var5++) {
			if (field372[field374[var5]] == null) {
				signlink.reporterror(field281 + " null entry in pl list - pos:" + var5 + " size:" + field373);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field331.method41(arg4, arg1, arg2);
		if (var6 != 0) {
			int var7 = field331.method45(arg4, arg1, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field218.field1274;
			int var12 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			RUJAIVBH var14 = RUJAIVBH.method512(var13);
			if (var14.field1150 == -1) {
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
				GLPEJJEY var15 = field425[var14.field1150];
				if (var15 != null) {
					int var16 = (var14.field1174 * 4 - var15.field788) / 2;
					int var17 = (var14.field1180 * 4 - var15.field789) / 2;
					var15.method319((104 - arg2 - var14.field1180) * 4 + var17 + 48, arg1 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field331.method43(arg4, arg1, arg2);
		if (var18 != 0) {
			int var19 = field331.method45(arg4, arg1, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			RUJAIVBH var23 = RUJAIVBH.method512(var22);
			if (var23.field1150 != -1) {
				GLPEJJEY var24 = field425[var23.field1150];
				if (var24 != null) {
					int var25 = (var23.field1174 * 4 - var24.field788) / 2;
					int var26 = (var23.field1180 * 4 - var24.field789) / 2;
					var24.method319((104 - arg2 - var23.field1180) * 4 + var26 + 48, arg1 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field218.field1274;
				int var29 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field331.method44(arg4, arg1, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			RUJAIVBH var32 = RUJAIVBH.method512(var31);
			if (var32.field1150 != -1) {
				GLPEJJEY var33 = field425[var32.field1150];
				if (var33 != null) {
					int var34 = (var32.field1174 * 4 - var33.field788) / 2;
					int var35 = (var32.field1180 * 4 - var33.field789) / 2;
					var33.method319((104 - arg2 - var32.field1180) * 4 + var35 + 48, arg1 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method82() {
		try {
			field405 = -1;
			field329.method333();
			field321.method333();
			field500++;
			if (field500 > 1672) {
				field500 = 0;
				field299.method338(187);
				field299.method339(0);
				int var1 = field299.field934;
				field299.method339(172);

				if ((int) (Math.random() * 2.0D) == 0) {
					field299.method339(99);
				}

				field299.method339(26);
				field299.method340((int) (Math.random() * 65536.0D));
				field299.method340(39552);
				field299.method340(16690);

				if ((int) (Math.random() * 2.0D) == 0) {
					field299.method340(16512);
				}

				field299.method339(109);

				if ((int) (Math.random() * 2.0D) == 0) {
					field299.method339(241);
				}

				field299.method339(60);
				field299.method348(field299.field934 - var1);
			}

			EDRGRMCC.method226();
			method97();
			field331.method15();
			System.gc();

			for (int var2 = 0; var2 < 4; var2++) {
				field412[var2].method208();
			}

			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						field406[var3][var4][var5] = 0;
					}
				}
			}

			PTERWXXU var6 = new PTERWXXU(field406, 104, 104, field364);
			int var7 = field419.length;
			field299.method338(140);

			if (!field212) {
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = (field284[var8] >> 8) * 64 - field489;
					int var10 = (field284[var8] & 0xFF) * 64 - field490;
					byte[] var11 = field419[var8];
					if (var11 != null) {
						var6.method487((field221 - 6) * 8, var9, (field220 - 6) * 8, field412, var10, var11);
					}
				}

				for (int var12 = 0; var12 < var7; var12++) {
					int var13 = (field284[var12] >> 8) * 64 - field489;
					int var14 = (field284[var12] & 0xFF) * 64 - field490;
					byte[] var15 = field419[var12];
					if (var15 == null && field221 < 800) {
						var6.method489(64, var13, var14, 64);
					}
				}

				field299.method338(140);

				for (int var16 = 0; var16 < var7; var16++) {
					byte[] var17 = field289[var16];
					if (var17 != null) {
						int var18 = (field284[var16] >> 8) * 64 - field489;
						int var19 = (field284[var16] & 0xFF) * 64 - field490;
						var6.method474(var18, var17, var19, field331, field412);
					}
				}
			}

			if (field212) {
				for (int var20 = 0; var20 < 4; var20++) {
					for (int var21 = 0; var21 < 13; var21++) {
						for (int var22 = 0; var22 < 13; var22++) {
							int var23 = field529[var20][var21][var22];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field284.length; var29++) {
									if (field284[var29] == var28 && field419[var29] != null) {
										var6.method491(var20, var22 * 8, var25, (var27 & 0x7) * 8, var21 * 8, var24, (var26 & 0x7) * 8, field412, field419[var29]);
										break;
									}
								}
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field529[0][var30][var31];
						if (var32 == -1) {
							var6.method489(8, var30 * 8, var31 * 8, 8);
						}
					}
				}

				field299.method338(140);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field529[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field284.length; var42++) {
									if (field284[var42] == var41 && field289[var42] != null) {
										var6.method476(field331, (var40 & 0x7) * 8, field289[var42], var38, var33, var35 * 8, var34 * 8, field412, (var39 & 0x7) * 8, var37);
										break;
									}
								}
							}
						}
					}
				}
			}

			field299.method338(140);
			var6.method477(field331, field412);
			field398.method465();
			field299.method338(140);
			int var43 = PTERWXXU.field1094;
			if (var43 > field320) {
				var43 = field320;
			}

			if (var43 < field320 - 1) {
				int var44 = field320 - 1;
			}

			if (field328) {
				field331.method16(PTERWXXU.field1094);
			} else {
				field331.method16(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method144(var45, var46);
				}
			}

			field330++;
			if (field330 > 1500) {
				field330 = 0;
				field299.method338(236);
				field299.method339(0);
				int var47 = field299.field934;
				field299.method339((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field299.method339(41);
				}

				field299.method339((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field299.method339(20);
				}

				field299.method340((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field299.method340(51853);
				}

				field299.method339((int) (Math.random() * 256.0D));
				field299.method339(152);
				field299.method339(112);
				field299.method339((int) (Math.random() * 256.0D));
				field299.method348(field299.field934 - var47);
			}

			method205();
		} catch (Exception var60) {
		}

		RUJAIVBH.field1151.method568();

		if (field1030 != null) {
			field299.method338(5);
			field299.method343(1057001181);
		}

		if (field328 && signlink.cache_dat != null) {
			int var49 = field211.method548(0);
			for (int var50 = 0; var50 < var49; var50++) {
				int var51 = field211.method540(var50);
				if ((var51 & 0x79) == 0) {
					GEUHTGZJ.method284(var50);
				}
			}
		}

		System.gc();
		EDRGRMCC.method227(20);
		field211.method535();
		int var52 = (field220 - 6) / 8 - 1;
		int var53 = (field220 + 6) / 8 + 1;
		int var54 = (field221 - 6) / 8 - 1;
		int var55 = (field221 + 6) / 8 + 1;
		if (field479) {
			var52 = 49;
			var53 = 50;
			var54 = 49;
			var55 = 50;
		}

		for (int var56 = var52; var56 <= var53; var56++) {
			for (int var57 = var54; var57 <= var55; var57++) {
				if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
					int var58 = field211.method541(0, var56, var57);
					if (var58 != -1) {
						field211.method543(var58, 3);
					}

					int var59 = field211.method541(1, var56, var57);
					if (var59 != -1) {
						field211.method543(var59, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public static final void method83() {
		BGNYQYNO.field75 = true;
		EDRGRMCC.field580 = true;
		field328 = true;
		PTERWXXU.field1100 = true;
		RUJAIVBH.field1173 = true;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method84() {
		for (RVDLUGTG var1 = (RVDLUGTG) field321.method329(); var1 != null; var1 = (RVDLUGTG) field321.method331()) {
			if (field320 != var1.field1197 || field420 > var1.field1201) {
				var1.method1();
			} else if (field420 >= var1.field1200) {
				if (var1.field1185 > 0) {
					FJJCITCO var2 = field435[var1.field1185 - 1];
					if (var2 != null && var2.field1326 >= 0 && var2.field1326 < 13312 && var2.field1327 >= 0 && var2.field1327 < 13312) {
						var1.method516(var2.field1327, field420, var2.field1326, method156(var1.field1197, var2.field1326, var2.field1327) - var1.field1193);
					}
				}

				if (var1.field1185 < 0) {
					int var3 = -var1.field1185 - 1;
					YNSPIQRH var4;
					if (field323 == var3) {
						var4 = field256;
					} else {
						var4 = field372[var3];
					}

					if (var4 != null && var4.field1326 >= 0 && var4.field1326 < 13312 && var4.field1327 >= 0 && var4.field1327 < 13312) {
						var1.method516(var4.field1327, field420, var4.field1326, method156(var1.field1197, var4.field1326, var4.field1327) - var1.field1193);
					}
				}

				var1.method517(field458);
				field331.method26((int) var1.field1187, (int) var1.field1188, -1, var1.field1198, field320, 60, false, var1, (int) var1.field1186);
			}
		}
	}

	@ObfuscatedName("client.a(ZI)Z")
	public final boolean method85(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field247[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 983) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method86() {
		if (field342 == null) {
			field1028 = null;
			field399 = null;
			field397 = null;
			field396 = null;
			field398 = null;
			field208 = null;
			field209 = null;
			field210 = null;
			field345 = new PFNLOREN(128, method192(), 265);
			OMVHXJFV.method418();
			field346 = new PFNLOREN(128, method192(), 265);
			OMVHXJFV.method418();
			field342 = new PFNLOREN(509, method192(), 171);
			OMVHXJFV.method418();
			field343 = new PFNLOREN(360, method192(), 132);
			OMVHXJFV.method418();
			field344 = new PFNLOREN(360, method192(), 200);
			OMVHXJFV.method418();
			field347 = new PFNLOREN(202, method192(), 238);
			OMVHXJFV.method418();
			field348 = new PFNLOREN(203, method192(), 238);
			OMVHXJFV.method418();
			field349 = new PFNLOREN(74, method192(), 94);
			OMVHXJFV.method418();
			field350 = new PFNLOREN(75, method192(), 94);
			OMVHXJFV.method418();

			if (field151 != null) {
				method75();
				method76();
			}

			field487 = true;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method87() {
		field399.method465();
		EDRGRMCC.field591 = field316;
		field244.method319(0, 0);

		if (field324) {
			field415.method248(40, field197, 239, 0);
			field415.method248(60, field260 + "*", 239, 128);
		} else if (field214 == 1) {
			field415.method248(40, "Enter amount:", 239, 0);
			field415.method248(60, field408 + "*", 239, 128);
		} else if (field214 == 2) {
			field415.method248(40, "Enter name:", 239, 0);
			field415.method248(60, field408 + "*", 239, 128);
		} else if (field276 != null) {
			field415.method248(40, field276, 239, 0);
			field415.method248(60, "Click to continue", 239, 128);
		} else if (field411 != -1) {
			method136(0, 0, AMSZZFWC.field63[field411], 0);
		} else if (field240 == -1) {
			EXARMWSO var1 = field414;
			int var2 = 0;
			OMVHXJFV.method417(463, 0, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field312[var3] != null) {
					int var4 = field310[var3];
					int var5 = field418 + 70 - var2 * 14;
					String var6 = field311[var3];
					byte var7 = 0;
					if (var6 != null && var6.startsWith("@cr1@")) {
						var6 = var6.substring(5);
						var7 = 1;
					}

					if (var6 != null && var6.startsWith("@cr2@")) {
						var6 = var6.substring(5);
						var7 = 2;
					}

					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method252(0, 4, field312[var3], var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field525 == 0 || field525 == 1 && method135(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field561[0].method319(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field561[1].method319(var5 - 12, var8);
								var8 += 14;
							}

							var1.method252(0, var8, var6 + ":", var5);
							var8 += var1.method250(var6) + 8;
							var1.method252(255, var8, field312[var3], var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field196 == 0 && (var4 == 7 || field152 == 0 || field152 == 1 && method135(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method252(0, var9, "From", var5);
							int var11 = var9 + var1.method250("From ");
							if (var7 == 1) {
								field561[0].method319(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field561[1].method319(var5 - 12, var11);
								var11 += 14;
							}

							var1.method252(0, var11, var6 + ":", var5);
							var11 += var1.method250(var6) + 8;
							var1.method252(0x800000, var11, field312[var3], var5);
						}

						var2++;
					}

					if (var4 == 4 && (field287 == 0 || field287 == 1 && method135(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method252(0x800080, 4, var6 + " " + field312[var3], var5);
						}

						var2++;
					}

					if (var4 == 5 && field196 == 0 && field152 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method252(0x800000, 4, field312[var3], var5);
						}

						var2++;
					}

					if (var4 == 6 && field196 == 0 && field152 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method252(0, 4, "To " + var6 + ":", var5);
							var1.method252(0x800000, var1.method250("To " + var6) + 12, field312[var3], var5);
						}

						var2++;
					}

					if (var4 == 8 && (field287 == 0 || field287 == 1 && method135(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method252(0x7E3200, 4, var6 + " " + field312[var3], var5);
						}

						var2++;
					}
				}
			}

			OMVHXJFV.method416();
			field184 = var2 * 14 + 7;
			if (field184 < 78) {
				field184 = 78;
			}

			method134(field184 - field418 - 77, 77, 0, 463, field184);
			String var10;
			if (field256 == null || field256.field1437 == null) {
				var10 = UMKVTRLP.method584(field281);
			} else {
				var10 = field256.field1437;
			}

			var1.method252(0, 4, var10 + ":", 90);
			var1.method252(255, var1.method250(var10 + ": ") + 6, field333 + "*", 90);
			OMVHXJFV.method423(77, 479, 0, 0);
		} else {
			method136(0, 0, AMSZZFWC.field63[field240], 0);
		}

		if (field219 && field439 == 2) {
			method106();
		}

		field399.method466(field1027, 357, 17);
		field398.method465();
		EDRGRMCC.field591 = field318;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method88(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field452; var3++) {
				if (field180[var3] == arg0) {
					field452--;
					field473 = true;

					for (int var4 = var3; var4 < field452; var4++) {
						field180[var4] = field180[var4 + 1];
					}

					field299.method338(104);
					field299.method345(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method89() {
		if (field476 >= 2 || field157 != 0 || field270 != 0) {
			String var1;
			if (field157 == 1 && field476 < 2) {
				var1 = "Use " + field161 + " with...";
			} else if (field270 == 1 && field476 < 2) {
				var1 = field273 + "...";
			} else {
				var1 = field283[field476 - 1];
			}

			if (field476 > 2) {
				var1 = var1 + "@whi@ / " + (field476 - 2) + " more options";
			}

			field415.method257(0xFFFFFF, true, field420 / 1000, 15, var1, 4);
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method90(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method91() {
		if (field196 != 0) {
			int var1 = 0;
			if (field485 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field312[var2] != null) {
					int var3 = field310[var2];
					String var4 = field311[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field152 == 0 || field152 == 1 && method135(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1035 > 4 && field1036 - 4 > var8 - 10 && field1036 - 4 <= var8 + 3) {
							int var9 = field414.method250("From:  " + var4 + field312[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1035 < var9 + 4) {
								if (field166 >= 1) {
									field283[field476] = "Report abuse @whi@" + var4;
									field247[field476] = 2872;
									field476++;
								}

								field283[field476] = "Add ignore @whi@" + var4;
								field247[field476] = 2616;
								field476++;
								field283[field476] = "Add friend @whi@" + var4;
								field247[field476] = 2983;
								field476++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field152 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILKHOMSBHW;)V")
	public final void method92(int arg0, KHOMSBHW arg1) {
		int var3 = arg1.method360(8);
		if (var3 < field373) {
			for (int var4 = var3; var4 < field373; var4++) {
				field156[field155++] = field374[var4];
			}
		}

		if (var3 > field373) {
			signlink.reporterror(field281 + " Too many players");
			throw new RuntimeException("eek");
		}

		field373 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field374[var5];
			YNSPIQRH var7 = field372[var6];
			int var8 = arg1.method360(1);
			if (var8 == 0) {
				field374[field373++] = var6;
				var7.field1329 = field420;
			} else {
				int var9 = arg1.method360(2);
				if (var9 == 0) {
					field374[field373++] = var6;
					var7.field1329 = field420;
					field376[field375++] = var6;
				} else if (var9 == 1) {
					field374[field373++] = var6;
					var7.field1329 = field420;
					int var10 = arg1.method360(3);
					var7.method576(var10, false);
					int var11 = arg1.method360(1);
					if (var11 == 1) {
						field376[field375++] = var6;
					}
				} else if (var9 == 2) {
					field374[field373++] = var6;
					var7.field1329 = field420;
					int var12 = arg1.method360(3);
					var7.method576(var12, true);
					int var13 = arg1.method360(3);
					var7.method576(var13, true);
					int var14 = arg1.method360(1);
					if (var14 == 1) {
						field376[field375++] = var6;
					}
				} else if (var9 == 3) {
					field156[field155++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method93() {
		method99();

		if (field254 == 1) {
			field290[field253 / 100].method558(field252 - 8 - 4, field251 - 8 - 4);
		}

		if (field254 == 2) {
			field290[field253 / 100 + 4].method558(field252 - 8 - 4, field251 - 8 - 4);
		}

		if (field562 != -1) {
			method79(field458, field562);
			method136(0, 0, AMSZZFWC.field63[field562], 0);
		}

		if (field309 != -1) {
			method79(field458, field309);
			method136(0, 0, AMSZZFWC.field63[field309], 0);
		}

		method158();

		if (!field219) {
			method193();
			method89();
		} else if (field439 == 0) {
			method106();
		}

		if (field206 == 1) {
			field498[1].method558(296, 472);
		}

		if (field401) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1023 < 15) {
				var3 = 0xFF0000;
			}

			field414.method247(var2, var3, "Fps:" + field1023, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field328) {
				int var7 = 0xFF0000;
			}

			field414.method247(var2, 0xFFFF00, "Mem:" + var5 + "k", var1);
			var2 += 15;
		}

		if (field485 != 0) {
			int var8 = field485 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field414.method252(0xFFFF00, 4, "System update in: " + var9 + ":0" + var8, 329);
			} else {
				field414.method252(0xFFFF00, 4, "System update in: " + var9 + ":" + var8, 329);
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method94() {
		int var1 = 5;
		field483[8] = 0;
		int var2 = 0;
		while (field483[8] == 0) {
			String var3 = "Unknown problem";
			method70("Connecting to web server", 20);

			try {
				DataInputStream var4 = method107("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 312);
				KHOMSBHW var5 = new KHOMSBHW(new byte[40]);
				var4.readFully(var5.field933, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field483[var6] = var5.method354();
				}

				int var7 = var5.method354();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field483[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field483[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field483[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field483[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field483[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field483[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method70("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method70(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field558 = !field558;
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method95() {
		int var1 = field415.method250("Choose Option");
		for (int var2 = 0; var2 < field476; var2++) {
			int var3 = field415.method250(field283[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field476 * 15 + 21;
		if (field1042 > 4 && field1043 > 4 && field1042 < 516 && field1043 < 338) {
			int var5 = field1042 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1043 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field219 = true;
			field439 = 0;
			field440 = var5;
			field441 = var6;
			field442 = var1;
			field443 = field476 * 15 + 22;
		}

		if (field1042 > 553 && field1043 > 205 && field1042 < 743 && field1043 < 466) {
			int var7 = field1042 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1043 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field219 = true;
			field439 = 1;
			field440 = var7;
			field441 = var8;
			field442 = var1;
			field443 = field476 * 15 + 22;
		}

		if (field1042 > 17 && field1043 > 357 && field1042 < 496 && field1043 < 453) {
			int var9 = field1042 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1043 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field219 = true;
			field439 = 2;
			field440 = var9;
			field441 = var10;
			field442 = var1;
			field443 = field476 * 15 + 22;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method96() {
		field404 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field168) {
				field446++;
				method104();
				method104();
				method170();
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

		field404 = false;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method97() {
		RUJAIVBH.field1151.method568();
		RUJAIVBH.field1170.method568();
		UGDYQAXI.field1320.method568();
		FZACNING.field671.method568();
		FZACNING.field692.method568();
		YNSPIQRH.field1430.method568();
		IDBAHLFM.field817.method568();
	}

	@ObfuscatedName("client.f(B)V")
	public final void method98() {
		if (field279 == 0 && field1041 == 1) {
			int var1 = field1042 - 25 - 550;
			int var2 = field1043 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field422 + field366 & 0x7FF;
				int var4 = EDRGRMCC.field589[var3];
				int var5 = EDRGRMCC.field590[var3];
				var4 = (field177 + 256) * var4 >> 8;
				var5 = (field177 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field256.field1326 + var6 >> 7;
				int var9 = field256.field1327 - var7 >> 7;
				boolean var10 = method175(0, var9, 0, 0, var8, 0, field256.field1368[0], 1, 0, true, field256.field1367[0]);
				if (var10) {
					field299.method339(var1);
					field299.method339(var2);
					field299.method340(field422);
					field299.method339(57);
					field299.method339(field366);
					field299.method339(field177);
					field299.method339(89);
					field299.method340(field256.field1326);
					field299.method340(field256.field1327);
					field299.method339(field456);
					field299.method339(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method99() {
		if (field196 != 0) {
			EXARMWSO var1 = field414;
			int var2 = 0;
			if (field485 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field312[var3] != null) {
					int var4 = field310[var3];
					String var5 = field311[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field152 == 0 || field152 == 1 && method135(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method252(0, var8, "From", var7);
						var1.method252(0xFFFF, var8, "From", var7 - 1);
						int var11 = var8 + var1.method250("From ");
						if (var6 == 1) {
							field561[0].method319(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field561[1].method319(var7 - 12, var11);
							var11 += 14;
						}

						var1.method252(0, var11, var5 + ": " + field312[var3], var7);
						var1.method252(0xFFFF, var11, var5 + ": " + field312[var3], var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field152 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method252(0, 4, field312[var3], var9);
						var1.method252(0xFFFF, 4, field312[var3], var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field152 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method252(0, 4, "To " + var5 + ": " + field312[var3], var10);
						var1.method252(0xFFFF, 4, "To " + var5 + ": " + field312[var3], var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	public final void init() {
		field325 = Integer.parseInt(getParameter("nodeid"));
		field326 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method83();
		} else {
			method173();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field327 = false;
		} else {
			field327 = true;
		}

		method411(765, 503);
	}

	@ObfuscatedName("client.p(I)V")
	public final void method100() {
		field397.method465();

		if (field279 == 2) {
			byte[] var1 = field243.field786;
			int[] var2 = OMVHXJFV.field1049;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field526.method562(0, 33, 33, field417, 0, 25, 256, field422, 25, field315);
			field398.method465();
		} else {
			int var5 = field422 + field366 & 0x7FF;
			int var6 = field256.field1326 / 32 + 48;
			int var7 = 464 - field256.field1327 / 32;
			field218.method562(5, 146, 151, field204, 25, var6, field177 + 256, var5, var7, field481);
			field526.method562(0, 33, 33, field417, 0, 25, 256, field422, 25, field315);

			for (int var8 = 0; var8 < field464; var8++) {
				int var9 = field465[var8] * 4 + 2 - field256.field1326 / 32;
				int var10 = field466[var8] * 4 + 2 - field256.field1327 / 32;
				method162(var9, field541[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					JQOEJEDB var13 = field278[field320][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field256.field1326 / 32;
						int var15 = var12 * 4 + 2 - field256.field1327 / 32;
						method162(var14, field514, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field436; var16++) {
				FJJCITCO var17 = field435[field437[var16]];
				if (var17 != null && var17.method263()) {
					UGDYQAXI var18 = var17.field650;
					if (var18.field1301 != null) {
						var18 = var18.method574();
					}

					if (var18 != null && var18.field1289 && var18.field1303) {
						int var19 = var17.field1326 / 32 - field256.field1326 / 32;
						int var20 = var17.field1327 / 32 - field256.field1327 / 32;
						method162(var19, field515, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field373; var21++) {
				YNSPIQRH var22 = field372[field374[var21]];
				if (var22 != null && var22.method263()) {
					int var23 = var22.field1326 / 32 - field256.field1326 / 32;
					int var24 = var22.field1327 / 32 - field256.field1327 / 32;
					boolean var25 = false;
					long var26 = UMKVTRLP.method580(var22.field1437);
					for (int var28 = 0; var28 < field494; var28++) {
						if (field438[var28] == var26 && field530[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field256.field1438 != 0 && var22.field1438 != 0 && field256.field1438 == var22.field1438) {
						var29 = true;
					}

					if (var25) {
						method162(var23, field517, var24);
					} else if (var29) {
						method162(var23, field518, var24);
					} else {
						method162(var23, field516, var24);
					}
				}
			}

			if (field163 != 0 && field420 % 20 < 10) {
				if (field163 == 1 && field175 >= 0 && field175 < field435.length) {
					FJJCITCO var30 = field435[field175];
					if (var30 != null) {
						int var31 = var30.field1326 / 32 - field256.field1326 / 32;
						int var32 = var30.field1327 / 32 - field256.field1327 / 32;
						method137(field475, var31, var32);
					}
				}

				if (field163 == 2) {
					int var33 = (field186 - field489) * 4 + 2 - field256.field1326 / 32;
					int var34 = (field187 - field490) * 4 + 2 - field256.field1327 / 32;
					method137(field475, var33, var34);
				}

				if (field163 == 10 && field170 >= 0 && field170 < field372.length) {
					YNSPIQRH var35 = field372[field170];
					if (var35 != null) {
						int var36 = var35.field1326 / 32 - field256.field1326 / 32;
						int var37 = var35.field1327 / 32 - field256.field1327 / 32;
						method137(field475, var36, var37);
					}
				}
			}

			if (field216 != 0) {
				int var38 = field216 * 4 + 2 - field256.field1326 / 32;
				int var39 = field217 * 4 + 2 - field256.field1327 / 32;
				method162(var38, field474, var39);
			}

			OMVHXJFV.method420(97, 0xFFFFFF, 3, 3, 78);
			field398.method465();
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method101() {
		int var1 = field501 * 128 + 64;
		int var2 = field502 * 128 + 64;
		int var3 = method156(field320, var1, var2) - field503;

		if (field263 < var1) {
			field263 += (var1 - field263) * field505 / 1000 + field504;
			if (field263 > var1) {
				field263 = var1;
			}
		}

		if (field263 > var1) {
			field263 -= (field263 - var1) * field505 / 1000 + field504;
			if (field263 < var1) {
				field263 = var1;
			}
		}

		if (field264 < var3) {
			field264 += (var3 - field264) * field505 / 1000 + field504;
			if (field264 > var3) {
				field264 = var3;
			}
		}

		if (field264 > var3) {
			field264 -= (field264 - var3) * field505 / 1000 + field504;
			if (field264 < var3) {
				field264 = var3;
			}
		}

		if (field265 < var2) {
			field265 += (var2 - field265) * field505 / 1000 + field504;
			if (field265 > var2) {
				field265 = var2;
			}
		}

		if (field265 > var2) {
			field265 -= (field265 - var2) * field505 / 1000 + field504;
			if (field265 < var2) {
				field265 = var2;
			}
		}

		int var4 = field301 * 128 + 64;
		int var5 = field302 * 128 + 64;
		int var6 = method156(field320, var4, var5) - field303;
		int var7 = var4 - field263;
		int var8 = var6 - field264;
		int var9 = var5 - field265;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field266 < var11) {
			field266 += (var11 - field266) * field305 / 1000 + field304;
			if (field266 > var11) {
				field266 = var11;
			}
		}

		if (field266 > var11) {
			field266 -= (field266 - var11) * field305 / 1000 + field304;
			if (field266 < var11) {
				field266 = var11;
			}
		}

		int var13 = var12 - field267;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field267 += field305 * var13 / 1000 + field304;
			field267 &= 0x7FF;
		}

		if (var13 < 0) {
			field267 -= -var13 * field305 / 1000 + field304;
			field267 &= 0x7FF;
		}

		int var14 = var12 - field267;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field267 = var12;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method102(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method102(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method103() {
		try {
			int var1 = field256.field1326 + field148;
			int var2 = field256.field1327 + field387;
			if (field543 - var1 < -500 || field543 - var1 > 500 || field544 - var2 < -500 || field544 - var2 > 500) {
				field543 = var1;
				field544 = var2;
			}

			if (field543 != var1) {
				field543 += (var1 - field543) / 16;
			}

			if (field544 != var2) {
				field544 += (var2 - field544) / 16;
			}

			if (field1045[1] == 1) {
				field423 += (-field423 - 24) / 2;
			} else if (field1045[2] == 1) {
				field423 += (24 - field423) / 2;
			} else {
				field423 /= 2;
			}

			if (field1045[3] == 1) {
				field424 += (12 - field424) / 2;
			} else if (field1045[4] == 1) {
				field424 += (-field424 - 12) / 2;
			} else {
				field424 /= 2;
			}

			field422 = field423 / 2 + field422 & 0x7FF;
			field421 += field424 / 2;
			if (field421 < 128) {
				field421 = 128;
			}

			if (field421 > 383) {
				field421 = 383;
			}

			int var3 = field543 >> 7;
			int var4 = field544 >> 7;
			int var5 = method156(field320, field543, field544);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field320;
						if (var9 < 3 && (field406[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field364[var9][var7][var8];
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

			if (var11 > field477) {
				field477 += (var11 - field477) / 24;
			} else if (var11 < field477) {
				field477 += (var11 - field477) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field256.field1326 + "," + field256.field1327 + "," + field543 + "," + field544 + "," + field220 + "," + field221 + "," + field489 + "," + field490);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method104() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field337[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field337[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field338[var10] = (field337[var10 - 1] + field337[var10 + 1] + field337[var10 - 128] + field337[var10 + 128]) / 4;
			}
		}

		field292 += 128;
		if (field292 > field509.length) {
			field292 -= field509.length;
			int var11 = (int) (Math.random() * 12.0D);
			method152(field457[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field338[var14 + 128] - field509[field292 + var14 & field509.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field337[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field195[var16] = field195[var16 + 1];
		}

		field195[var1 - 1] = (int) (Math.sin(field420 / 14.0D) * 16.0D + Math.sin(field420 / 15.0D) * 14.0D + Math.sin(field420 / 16.0D) * 12.0D);

		if (field427 > 0) {
			field427 -= 4;
		}

		if (field428 > 0) {
			field428 -= 4;
		}

		if (field427 == 0 && field428 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field427 = 1024;
			}

			if (var17 == 1) {
				field428 = 1024;
				return;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1030 != null) {
				return new URL("http://127.0.0.1:" + (field326 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = GEUHTGZJ.field777[var7];
			int var13 = GEUHTGZJ.field778[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = GEUHTGZJ.field777[var8];
			int var16 = GEUHTGZJ.field778[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field263 = arg0 - var9;
		field264 = arg4 - var10;
		field265 = arg2 - var11;
		field266 = arg1;
		field267 = arg3;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method106() {
		int var1 = field440;
		int var2 = field441;
		int var3 = field442;
		int var4 = field443;
		int var5 = 0x5D5447;
		OMVHXJFV.method420(var1, var5, var4, var3, var2);
		OMVHXJFV.method420(var1 + 1, 0, 16, var3 - 2, var2 + 1);
		OMVHXJFV.method421(var3 - 2, var4 - 19, 0, var2 + 18, var1 + 1);
		field415.method252(var5, var1 + 3, "Choose Option", var2 + 14);
		int var6 = field1035;
		int var7 = field1036;
		if (field439 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field439 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field439 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field476; var8++) {
			int var9 = (field476 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field415.method256(var10, var9, true, var1 + 3, field283[var8]);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method107(String arg0) throws IOException {
		if (field558) {
			if (field512 != null) {
				try {
					field512.close();
				} catch (Exception var4) {
				}

				field512 = null;
			}

			field512 = method184(43595);
			field512.setSoTimeout(10000);
			InputStream var2 = field512.getInputStream();
			OutputStream var3 = field512.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.s(I)V")
	public final void method108() {
		if (field449 == 2) {
			for (ZAHKTBCG var1 = (ZAHKTBCG) field193.method329(); var1 != null; var1 = (ZAHKTBCG) field193.method331()) {
				if (var1.field1457 > 0) {
					var1.field1457--;
				}

				if (var1.field1457 != 0) {
					if (var1.field1456 > 0) {
						var1.field1456--;
					}

					if (var1.field1456 == 0 && var1.field1454 >= 1 && var1.field1455 >= 1 && var1.field1454 <= 102 && var1.field1455 <= 102 && (var1.field1446 < 0 || PTERWXXU.method488(var1.field1448, var1.field1446))) {
						method190(var1.field1454, var1.field1452, var1.field1446, var1.field1453, var1.field1455, var1.field1447, var1.field1448);
						var1.field1456 = -1;

						if (var1.field1449 == var1.field1446 && var1.field1449 == -1) {
							var1.method1();
						} else if (var1.field1449 == var1.field1446 && var1.field1450 == var1.field1447 && var1.field1451 == var1.field1448) {
							var1.method1();
						}
					}
				} else if (var1.field1449 < 0 || PTERWXXU.method488(var1.field1451, var1.field1449)) {
					method190(var1.field1454, var1.field1452, var1.field1449, var1.field1453, var1.field1455, var1.field1450, var1.field1451);
					var1.method1();
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZBI)V")
	public final void method109(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method110(int arg0) {
		if (!field328) {
			if (EDRGRMCC.field599[17] >= arg0) {
				GLPEJJEY var2 = EDRGRMCC.field593[17];
				int var3 = var2.field789 * var2.field788 - 1;
				int var4 = field458 * var2.field788 * 2;
				byte[] var5 = var2.field786;
				byte[] var6 = field459;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field786 = var6;
				field459 = var5;
				EDRGRMCC.method230(17);
				field499++;
				if (field499 > 175) {
					field499 = 0;
					field299.method338(243);
					field299.method339(107);
				}
			}

			if (EDRGRMCC.field599[24] >= arg0) {
				GLPEJJEY var8 = EDRGRMCC.field593[24];
				int var9 = var8.field789 * var8.field788 - 1;
				int var10 = field458 * var8.field788 * 2;
				byte[] var11 = var8.field786;
				byte[] var12 = field459;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field786 = var12;
				field459 = var11;
				EDRGRMCC.method230(24);
				field472++;
				if (field472 > 1909) {
					field472 = 0;
					field299.method338(228);
					field299.method339(0);
					int var14 = field299.field934;

					if ((int) (Math.random() * 2.0D) == 0) {
						field299.method339(94);
					}

					field299.method339((int) (Math.random() * 256.0D));
					field299.method339(30);
					field299.method340(58788);
					field299.method339((int) (Math.random() * 256.0D));

					if ((int) (Math.random() * 2.0D) == 0) {
						field299.method339(71);
					}

					field299.method339(175);

					if ((int) (Math.random() * 2.0D) == 0) {
						field299.method339(89);
					}

					field299.method339(13);
					field299.method340(41631);
					field299.method348(field299.field934 - var14);
				}
			}

			if (EDRGRMCC.field599[34] >= arg0) {
				GLPEJJEY var15 = EDRGRMCC.field593[34];
				int var16 = var15.field789 * var15.field788 - 1;
				int var17 = field458 * var15.field788 * 2;
				byte[] var18 = var15.field786;
				byte[] var19 = field459;
				for (int var20 = 0; var20 <= var16; var20++) {
					var19[var20] = var18[var20 - var17 & var16];
				}

				var15.field786 = var19;
				field459 = var18;
				EDRGRMCC.method230(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LKHOMSBHW;II)V")
	public final void method111(KHOMSBHW arg0, int arg1) {
		arg0.method359();
		int var3 = arg0.method360(1);
		if (var3 != 0) {
			int var4 = arg0.method360(2);
			if (var4 == 0) {
				field376[field375++] = field371;
			} else if (var4 == 1) {
				int var5 = arg0.method360(3);
				field256.method576(var5, false);
				int var6 = arg0.method360(1);
				if (var6 == 1) {
					field376[field375++] = field371;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method360(3);
				field256.method576(var7, true);
				int var8 = arg0.method360(3);
				field256.method576(var8, true);
				int var9 = arg0.method360(1);
				if (var9 == 1) {
					field376[field375++] = field371;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method360(1);
				field320 = arg0.method360(2);
				int var11 = arg0.method360(1);
				if (var11 == 1) {
					field376[field375++] = field371;
				}

				int var12 = arg0.method360(7);
				int var13 = arg0.method360(7);
				field256.method577(var13, var10 == 1, var12);
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method112() {
		if (field328 && field449 == 2 && PTERWXXU.field1106 != field320) {
			field398.method465();
			field414.method248(151, "Loading - please wait.", 257, 0);
			field414.method248(150, "Loading - please wait.", 256, 0xFFFFFF);
			field398.method466(field1027, 4, 4);
			field449 = 1;
			field353 = System.currentTimeMillis();
		}

		if (field449 == 1) {
			int var1 = method113();
			if (var1 != 0 && System.currentTimeMillis() - field353 > 360000L) {
				signlink.reporterror(field281 + " glcfb " + field183 + "," + var1 + "," + field328 + "," + field154[0] + "," + field211.method537() + "," + field320 + "," + field220 + "," + field221);
				field353 = System.currentTimeMillis();
			}
		}

		if (field449 == 2 && field405 != field320) {
			field405 = field320;
			method188(field320);
		}
	}

	@ObfuscatedName("client.i(B)I")
	public final int method113() {
		for (int var1 = 0; var1 < field419.length; var1++) {
			if (field419[var1] == null && field285[var1] != -1) {
				return -1;
			}

			if (field289[var1] == null && field286[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field419.length; var3++) {
			byte[] var4 = field289[var3];
			if (var4 != null) {
				int var5 = (field284[var3] >> 8) * 64 - field489;
				int var6 = (field284[var3] & 0xFF) * 64 - field490;
				if (field212) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= PTERWXXU.method475(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field497) {
			return -4;
		} else {
			field449 = 2;
			PTERWXXU.field1106 = field320;
			method82();
			field299.method338(253);
			return 0;
		}
	}

	@ObfuscatedName("client.a(ILAMSZZFWC;)V")
	public final void method114(AMSZZFWC arg0) {
		int var2 = arg0.field52;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field495 == 0) {
				arg0.field48 = "Loading friend list";
				arg0.field44 = 0;
			} else if (var2 == 1 && field495 == 1) {
				arg0.field48 = "Connecting to friendserver";
				arg0.field44 = 0;
			} else if (var2 == 2 && field495 != 2) {
				arg0.field48 = "Please wait...";
				arg0.field44 = 0;
			} else {
				int var3 = field494;
				if (field495 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field48 = "";
					arg0.field44 = 0;
				} else {
					arg0.field48 = field448[var2];
					arg0.field44 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field494;
			if (field495 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field48 = "";
				arg0.field44 = 0;
			} else {
				if (field530[var2] == 0) {
					arg0.field48 = "@red@Offline";
				} else if (field530[var2] == field325) {
					arg0.field48 = "@gre@World-" + (field530[var2] - 9);
				} else {
					arg0.field48 = "@yel@World-" + (field530[var2] - 9);
				}

				arg0.field44 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field494;
			if (field495 != 2) {
				var5 = 0;
			}

			arg0.field62 = var5 * 15 + 20;
			if (arg0.field62 <= arg0.field12) {
				arg0.field62 = arg0.field12 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field495 == 0) {
				arg0.field48 = "Loading ignore list";
				arg0.field44 = 0;
			} else if (var2 == 1 && field495 == 0) {
				arg0.field48 = "Please wait...";
				arg0.field44 = 0;
			} else {
				int var6 = field452;
				if (field495 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field48 = "";
					arg0.field44 = 0;
				} else {
					arg0.field48 = UMKVTRLP.method584(UMKVTRLP.method581(field180[var2]));
					arg0.field44 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field62 = field452 * 15 + 20;
			if (arg0.field62 <= arg0.field12) {
				arg0.field62 = arg0.field12 + 1;
			}
		} else if (var2 == 327) {
			arg0.field59 = 150;
			arg0.field60 = (int) (Math.sin(field420 / 40.0D) * 256.0D) & 0x7FF;

			if (field194) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field277[var7];
					if (var8 >= 0 && !PJCTWSQI.field1076[var8].method470()) {
						return;
					}
				}

				field194 = false;
				GEUHTGZJ[] var9 = new GEUHTGZJ[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field277[var11];
					if (var12 >= 0) {
						var9[var10++] = PJCTWSQI.field1076[var12].method471();
					}
				}

				GEUHTGZJ var13 = new GEUHTGZJ(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field174[var14] != 0) {
						var13.method299(field519[var14][0], field519[var14][field174[var14]]);

						if (var14 == 1) {
							var13.method299(field524[0], field524[field174[var14]]);
						}
					}
				}

				var13.method292();
				var13.method293(EJHGNUGE.field604[field256.field1332].field606[0]);
				var13.method302(64, 850, -30, -50, -30, true);
				arg0.field35 = 5;
				arg0.field36 = 0;
				AMSZZFWC.method6(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field171 == null) {
				field171 = arg0.field27;
				field172 = arg0.field54;
			}

			if (field205) {
				arg0.field27 = field172;
			} else {
				arg0.field27 = field171;
			}
		} else if (var2 == 325) {
			if (field171 == null) {
				field171 = arg0.field27;
				field172 = arg0.field54;
			}

			if (field205) {
				arg0.field27 = field171;
			} else {
				arg0.field27 = field172;
			}
		} else if (var2 == 600) {
			arg0.field48 = field293;
			if (field420 % 20 < 10) {
				arg0.field48 = arg0.field48 + "|";
			} else {
				arg0.field48 = arg0.field48 + " ";
			}
		} else if (var2 == 613) {
			if (field166 < 1) {
				arg0.field48 = "";
			} else if (field508) {
				arg0.field53 = 0xFF0000;
				arg0.field48 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field53 = 0xFFFFFF;
				arg0.field48 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field560 == 0) {
				arg0.field48 = "";
			} else {
				String var15;
				if (field191 == 0) {
					var15 = "earlier today";
				} else if (field191 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field191 + " days ago";
				}

				arg0.field48 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field535 == 0) {
				arg0.field48 = "0 unread messages";
				arg0.field53 = 0xFFFF00;
			}

			if (field535 == 1) {
				arg0.field48 = "1 unread message";
				arg0.field53 = 0xFF00;
			}

			if (field535 > 1) {
				arg0.field48 = field535 + " unread messages";
				arg0.field53 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field306 == 201) {
				if (field255 == 1) {
					arg0.field48 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field48 = "";
				}
			} else if (field306 == 200) {
				arg0.field48 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field306 == 0) {
					var16 = "Earlier today";
				} else if (field306 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field306 + " days ago";
				}

				arg0.field48 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field306 == 201) {
				if (field255 == 1) {
					arg0.field48 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field48 = "";
				}
			} else if (field306 == 200) {
				arg0.field48 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field48 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field306 == 201) {
				if (field255 == 1) {
					arg0.field48 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field48 = "";
				}
			} else if (field306 == 200) {
				arg0.field48 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field48 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method115(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a()V")
	public final void method116() {
		method70("Starting up", 20);

		if (signlink.sunjava) {
			field1021 = 5;
		}

		if (field390) {
			field233 = true;
		} else {
			field390 = true;
			boolean var1 = false;
			String var2 = method74();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
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

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field154[var3] = new GINAMIRO(signlink.cache_dat, 500000, var3 + 1, signlink.cache_idx[var3]);
					}
				}

				try {
					method94();
					field151 = method150("title screen", 1, "title", 25, field483[1]);
					field413 = new EXARMWSO(false, field151, "p11_full");
					field414 = new EXARMWSO(false, field151, "p12_full");
					field415 = new EXARMWSO(false, field151, "b12_full");
					field416 = new EXARMWSO(true, field151, "q8_full");
					method75();
					method76();
					SYUGXMZF var4 = method150("config", 2, "config", 30, field483[2]);
					SYUGXMZF var5 = method150("interface", 3, "interface", 35, field483[3]);
					SYUGXMZF var6 = method150("2d graphics", 4, "media", 40, field483[4]);
					SYUGXMZF var7 = method150("textures", 6, "textures", 45, field483[6]);
					SYUGXMZF var8 = method150("chat system", 7, "wordenc", 50, field483[7]);
					SYUGXMZF var9 = method150("sound effects", 8, "sounds", 55, field483[8]);
					field406 = new byte[4][104][104];
					field364 = new int[4][105][105];
					field331 = new BGNYQYNO(4, field364, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field412[var10] = new DFJABDHX(104, 104);
					}

					field218 = new TNNDDWAZ(512, 512);
					SYUGXMZF var11 = method150("update list", 5, "versionlist", 60, field483[5]);
					method70("Connecting to update server", 60);
					field211 = new SSXXGGTR();
					field211.method530(var11, this);
					QWCFKPFT.method500(field211.method542());
					GEUHTGZJ.method282(field211.method548(0), field211);

					if (!field328) {
						field539 = 0;
						try {
							field539 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field540 = true;
						field211.method531(2, field539);

						while (field211.method537() > 0) {
							method133();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field211.field1224 > 3) {
								method206("ondemand");
								return;
							}
						}
					}

					method70("Requesting animations", 65);
					int var12 = field211.method548(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field211.method531(1, var13);
					}

					while (field211.method537() > 0) {
						int var14 = var12 - field211.method537();
						if (var14 > 0) {
							method70("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method133();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field211.field1224 > 3) {
							method206("ondemand");
							return;
						}
					}

					method70("Requesting models", 70);
					int var15 = field211.method548(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field211.method540(var16);
						if ((var17 & 0x1) != 0) {
							field211.method531(0, var16);
						}
					}

					int var18 = field211.method537();
					while (field211.method537() > 0) {
						int var19 = var18 - field211.method537();
						if (var19 > 0) {
							method70("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method133();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field154[0] != null) {
						method70("Requesting maps", 75);
						field211.method531(3, field211.method541(0, 47, 48));
						field211.method531(3, field211.method541(1, 47, 48));
						field211.method531(3, field211.method541(0, 48, 48));
						field211.method531(3, field211.method541(1, 48, 48));
						field211.method531(3, field211.method541(0, 49, 48));
						field211.method531(3, field211.method541(1, 49, 48));
						field211.method531(3, field211.method541(0, 47, 47));
						field211.method531(3, field211.method541(1, 47, 47));
						field211.method531(3, field211.method541(0, 48, 47));
						field211.method531(3, field211.method541(1, 48, 47));
						field211.method531(3, field211.method541(0, 48, 148));
						field211.method531(3, field211.method541(1, 48, 148));
						int var20 = field211.method537();
						while (field211.method537() > 0) {
							int var21 = var20 - field211.method537();
							if (var21 > 0) {
								method70("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method133();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field211.method548(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field211.method540(var23);
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
							field211.method536(var23, var25, 0);
						}
					}

					field211.method539(field327);

					if (!field328) {
						int var26 = field211.method548(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field211.method534(var27)) {
								field211.method536(var27, (byte) 1, 2);
							}
						}
					}

					method70("Unpacking media", 80);
					field242 = new GLPEJJEY(var6, "invback", 0);
					field244 = new GLPEJJEY(var6, "chatback", 0);
					field243 = new GLPEJJEY(var6, "mapback", 0);
					field334 = new GLPEJJEY(var6, "backbase1", 0);
					field335 = new GLPEJJEY(var6, "backbase2", 0);
					field336 = new GLPEJJEY(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field207[var28] = new GLPEJJEY(var6, "sideicons", var28);
					}

					field526 = new TNNDDWAZ(var6, "compass", 0);
					field496 = new TNNDDWAZ(var6, "mapedge", 0);
					field496.method555();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field425[var29] = new GLPEJJEY(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field542[var30] = new TNNDDWAZ(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field239[var31] = new TNNDDWAZ(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field498[var32] = new TNNDDWAZ(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field474 = new TNNDDWAZ(var6, "mapmarker", 0);
					field475 = new TNNDDWAZ(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field290[var33] = new TNNDDWAZ(var6, "cross", var33);
					}

					field514 = new TNNDDWAZ(var6, "mapdots", 0);
					field515 = new TNNDDWAZ(var6, "mapdots", 1);
					field516 = new TNNDDWAZ(var6, "mapdots", 2);
					field517 = new TNNDDWAZ(var6, "mapdots", 3);
					field518 = new TNNDDWAZ(var6, "mapdots", 4);
					field201 = new GLPEJJEY(var6, "scrollbar", 0);
					field202 = new GLPEJJEY(var6, "scrollbar", 1);
					field223 = new GLPEJJEY(var6, "redstone1", 0);
					field224 = new GLPEJJEY(var6, "redstone2", 0);
					field225 = new GLPEJJEY(var6, "redstone3", 0);
					field226 = new GLPEJJEY(var6, "redstone1", 0);
					field226.method316();
					field227 = new GLPEJJEY(var6, "redstone2", 0);
					field227.method316();
					field381 = new GLPEJJEY(var6, "redstone1", 0);
					field381.method317();
					field382 = new GLPEJJEY(var6, "redstone2", 0);
					field382.method317();
					field383 = new GLPEJJEY(var6, "redstone3", 0);
					field383.method317();
					field384 = new GLPEJJEY(var6, "redstone1", 0);
					field384.method316();
					field384.method317();
					field385 = new GLPEJJEY(var6, "redstone2", 0);
					field385.method316();
					field385.method317();

					for (int var34 = 0; var34 < 2; var34++) {
						field561[var34] = new GLPEJJEY(var6, "mod_icons", var34);
					}

					TNNDDWAZ var35 = new TNNDDWAZ(var6, "backleft1", 0);
					field354 = new PFNLOREN(var35.field1275, method192(), var35.field1276);
					var35.method556(0, 0);
					TNNDDWAZ var36 = new TNNDDWAZ(var6, "backleft2", 0);
					field355 = new PFNLOREN(var36.field1275, method192(), var36.field1276);
					var36.method556(0, 0);
					TNNDDWAZ var37 = new TNNDDWAZ(var6, "backright1", 0);
					field356 = new PFNLOREN(var37.field1275, method192(), var37.field1276);
					var37.method556(0, 0);
					TNNDDWAZ var38 = new TNNDDWAZ(var6, "backright2", 0);
					field357 = new PFNLOREN(var38.field1275, method192(), var38.field1276);
					var38.method556(0, 0);
					TNNDDWAZ var39 = new TNNDDWAZ(var6, "backtop1", 0);
					field358 = new PFNLOREN(var39.field1275, method192(), var39.field1276);
					var39.method556(0, 0);
					TNNDDWAZ var40 = new TNNDDWAZ(var6, "backvmid1", 0);
					field359 = new PFNLOREN(var40.field1275, method192(), var40.field1276);
					var40.method556(0, 0);
					TNNDDWAZ var41 = new TNNDDWAZ(var6, "backvmid2", 0);
					field360 = new PFNLOREN(var41.field1275, method192(), var41.field1276);
					var41.method556(0, 0);
					TNNDDWAZ var42 = new TNNDDWAZ(var6, "backvmid3", 0);
					field361 = new PFNLOREN(var42.field1275, method192(), var42.field1276);
					var42.method556(0, 0);
					TNNDDWAZ var43 = new TNNDDWAZ(var6, "backhmid2", 0);
					field362 = new PFNLOREN(var43.field1275, method192(), var43.field1276);
					var43.method556(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field542[var48] != null) {
							field542[var48].method554(var45 + var47, var44 + var47, var46 + var47);
						}

						if (field425[var48] != null) {
							field425[var48].method318(var45 + var47, var44 + var47, var46 + var47);
						}
					}

					method70("Unpacking textures", 83);
					EDRGRMCC.method228(var7);
					EDRGRMCC.method232(0.8D);
					EDRGRMCC.method227(20);
					method70("Unpacking config", 86);
					EJHGNUGE.method240(var4);
					RUJAIVBH.method506(var4);
					EPIGJXFD.method243(var4);
					FZACNING.method269(var4);
					UGDYQAXI.method569(var4);
					PJCTWSQI.method468(var4);
					IDBAHLFM.method321(var4);
					IYJSMCGP.method324(var4);
					GAQBLBTP.method279(var4);
					FZACNING.field688 = field327;

					if (!field328) {
						method70("Unpacking sounds", 90);
						byte[] var49 = var9.method551("sounds.dat", null);
						KHOMSBHW var50 = new KHOMSBHW(var49);
						AWDRZEFD.method8(var50);
					}

					method70("Unpacking interfaces", 95);
					EXARMWSO[] var51 = new EXARMWSO[] { field413, field414, field415, field416 };
					AMSZZFWC.method7(var51, var6, var5);
					method70("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field243.field786[field243.field788 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field315[var52] = var53;
						field417[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field243.field786[field243.field788 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field481[var56 - 5] = var57 - 25;
						field204[var56 - 5] = var58 - var57;
					}

					EDRGRMCC.method225(96, 479);
					field316 = EDRGRMCC.field591;
					EDRGRMCC.method225(261, 190);
					field317 = EDRGRMCC.field591;
					EDRGRMCC.method225(334, 512);
					field318 = EDRGRMCC.field591;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = EDRGRMCC.field589[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					BGNYQYNO.method51(500, 334, var60, 512, 800);
					PAYTRPNV.method427(var8);
					field222 = new HAMMMZGY(this);
					method102(field222, 10);
					TGBMMCBD.field1269 = this;
					RUJAIVBH.field1176 = this;
					UGDYQAXI.field1311 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field527 + " " + field258);
					field534 = true;
				}
			} else {
				field215 = true;
			}
		}
	}

	@ObfuscatedName("client.a(LAMSZZFWC;I)Z")
	public final boolean method117(AMSZZFWC arg0) {
		int var2 = arg0.field52;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field283[field476] = "Remove @whi@" + arg0.field48;
				field247[field476] = 172;
				field476++;
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

		field283[field476] = "Remove @whi@" + field448[var2];
		field247[field476] = 940;
		field476++;
		field283[field476] = "Message @whi@" + field448[var2];
		field247[field476] = 207;
		field476++;
		return true;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method118() {
		if (field513 == 0) {
			int var1 = field1025 / 2 - 80;
			int var2 = field1026 / 2 + 20;
			var2 += 20;
			if (field1041 == 1 && field1042 >= var1 - 75 && field1042 <= var1 + 75 && field1043 >= var2 - 20 && field1043 <= var2 + 20) {
				field513 = 3;
				field433 = 0;
			}

			int var3 = field1025 / 2 + 80;
			if (field1041 == 1 && field1042 >= var3 - 75 && field1042 <= var3 + 75 && field1043 >= var2 - 20 && field1043 <= var2 + 20) {
				field368 = "";
				field369 = "Enter your username & password.";
				field513 = 2;
				field433 = 0;
			}
		} else if (field513 == 2) {
			int var4 = field1026 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1041 == 1 && field1043 >= var4 - 15 && field1043 < var4) {
				field433 = 0;
			}

			var4 += 15;
			if (field1041 == 1 && field1043 >= var4 - 15 && field1043 < var4) {
				field433 = 1;
			}

			var4 += 15;
			int var5 = field1025 / 2 - 80;
			int var6 = field1026 / 2 + 50;
			var6 += 20;
			if (field1041 == 1 && field1042 >= var5 - 75 && field1042 <= var5 + 75 && field1043 >= var6 - 20 && field1043 <= var6 + 20) {
				field262 = 0;
				method179(field281, field282, false);

				if (field198) {
					return;
				}
			}

			int var7 = field1025 / 2 + 80;
			if (field1041 == 1 && field1042 >= var7 - 75 && field1042 <= var7 + 75 && field1043 >= var6 - 20 && field1043 <= var6 + 20) {
				field513 = 0;
				field281 = "";
				field282 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method414();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field379.length(); var10++) {
					if (var8 == field379.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field433 == 0) {
					if (var8 == 8 && field281.length() > 0) {
						field281 = field281.substring(0, field281.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field433 = 1;
					}

					if (var9) {
						field281 = field281 + (char) var8;
					}

					if (field281.length() > 12) {
						field281 = field281.substring(0, 12);
					}
				} else if (field433 == 1) {
					if (var8 == 8 && field282.length() > 0) {
						field282 = field282.substring(0, field282.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field433 = 0;
					}

					if (var9) {
						field282 = field282 + (char) var8;
					}

					if (field282.length() > 20) {
						field282 = field282.substring(0, 20);
					}
				}
			}
		} else if (field513 == 3) {
			int var11 = field1025 / 2;
			int var12 = field1026 / 2 + 50;
			var12 += 20;
			if (field1041 == 1 && field1042 >= var11 - 75 && field1042 <= var11 + 75 && field1043 >= var12 - 20 && field1043 <= var12 + 20) {
				field513 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILAMSZZFWC;)Z")
	public final boolean method119(AMSZZFWC arg0) {
		if (arg0.field21 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field21.length; var2++) {
			int var3 = method157(var2, arg0);
			int var4 = arg0.field4[var2];
			if (arg0.field21[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field21[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field21[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.u(I)Z")
	public final boolean method120() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method121(long arg0) {
		if (arg0 != 0L) {
			if (field494 >= 100 && field450 != 1) {
				method182("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field494 >= 200) {
				method182("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = UMKVTRLP.method584(UMKVTRLP.method581(arg0));
				for (int var4 = 0; var4 < field494; var4++) {
					if (field438[var4] == arg0) {
						method182("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field452; var5++) {
					if (field180[var5] == arg0) {
						method182("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field256.field1437)) {
					field448[field494] = var3;
					field438[field494] = arg0;
					field530[field494] = 0;
					field494++;
					field473 = true;
					field299.method338(160);
					field299.method345(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method122() {
		field153++;
		if (field153 > 1606) {
			field153 = 0;
			field299.method338(118);
			field299.method339(0);
			int var1 = field299.field934;
			field299.method340(27087);
			field299.method339(162);
			field299.method340(22009);

			if ((int) (Math.random() * 2.0D) == 0) {
				field299.method340(63882);
			}

			field299.method340(54058);

			if ((int) (Math.random() * 2.0D) == 0) {
				field299.method340(58701);
			}

			field299.method339((int) (Math.random() * 256.0D));
			field299.method340((int) (Math.random() * 65536.0D));
			field299.method340(32700);
			field299.method339((int) (Math.random() * 256.0D));
			field299.method348(field299.field934 - var1);
		}

		while (true) {
			int var2;
			do {
				while (true) {
					var2 = method414();
					if (var2 == -1) {
						return;
					}

					if (field309 != -1 && field309 == field308) {
						break;
					}

					if (field324) {
						if (var2 >= 32 && var2 <= 122 && field260.length() < 80) {
							field260 = field260 + (char) var2;
							field482 = true;
						}

						if (var2 == 8 && field260.length() > 0) {
							field260 = field260.substring(0, field260.length() - 1);
							field482 = true;
						}

						if (var2 == 13 || var2 == 10) {
							field324 = false;
							field482 = true;

							if (field363 == 1) {
								long var3 = UMKVTRLP.method580(field260);
								method121(var3);
							}

							if (field363 == 2 && field494 > 0) {
								long var5 = UMKVTRLP.method580(field260);
								method171(var5);
							}

							if (field363 == 3 && field260.length() > 0) {
								field299.method338(218);
								field299.method339(0);
								int var7 = field299.field934;
								field299.method345(field275);
								KFRNHLYS.method335(field260, field299);
								field299.method348(field299.field934 - var7);
								field260 = KFRNHLYS.method336(field260);
								field260 = PAYTRPNV.method437(field260);
								method182(UMKVTRLP.method584(UMKVTRLP.method581(field275)), 6, field260);

								if (field152 == 2) {
									field152 = 1;
									field531 = true;
									field299.method338(83);
									field299.method339(field525);
									field299.method339(field152);
									field299.method339(field287);
								}
							}

							if (field363 == 4 && field452 < 100) {
								long var8 = UMKVTRLP.method580(field260);
								method141(var8);
							}

							if (field363 == 5 && field452 > 0) {
								long var10 = UMKVTRLP.method580(field260);
								method88(var10);
							}
						}
					} else if (field214 == 1) {
						if (var2 >= 48 && var2 <= 57 && field408.length() < 10) {
							field408 = field408 + (char) var2;
							field482 = true;
						}

						if (var2 == 8 && field408.length() > 0) {
							field408 = field408.substring(0, field408.length() - 1);
							field482 = true;
						}

						if (var2 == 13 || var2 == 10) {
							if (field408.length() > 0) {
								int var12 = 0;
								try {
									var12 = Integer.parseInt(field408);
								} catch (Exception var22) {
								}

								field299.method338(86);
								field299.method343(var12);
							}

							field214 = 0;
							field482 = true;
						}
					} else if (field214 == 2) {
						if (var2 >= 32 && var2 <= 122 && field408.length() < 12) {
							field408 = field408 + (char) var2;
							field482 = true;
						}

						if (var2 == 8 && field408.length() > 0) {
							field408 = field408.substring(0, field408.length() - 1);
							field482 = true;
						}

						if (var2 == 13 || var2 == 10) {
							if (field408.length() > 0) {
								field299.method338(210);
								field299.method345(UMKVTRLP.method580(field408));
							}

							field214 = 0;
							field482 = true;
						}
					} else if (field411 == -1) {
						if (var2 >= 32 && var2 <= 122 && field333.length() < 80) {
							field333 = field333 + (char) var2;
							field482 = true;
						}

						if (var2 == 8 && field333.length() > 0) {
							field333 = field333.substring(0, field333.length() - 1);
							field482 = true;
						}

						if ((var2 == 13 || var2 == 10) && field333.length() > 0) {
							if (field166 == 2) {
								if (field333.equals("::clientdrop")) {
									method66();
								}

								if (field333.equals("::lag")) {
									method191();
								}

								if (field333.equals("::prefetchmusic")) {
									for (int var13 = 0; var13 < field211.method548(2); var13++) {
										field211.method536(var13, (byte) 1, 2);
									}
								}

								if (field333.equals("::fpson")) {
									field401 = true;
								}

								if (field333.equals("::fpsoff")) {
									field401 = false;
								}

								if (field333.equals("::noclip")) {
									for (int var14 = 0; var14 < 4; var14++) {
										for (int var15 = 1; var15 < 103; var15++) {
											for (int var16 = 1; var16 < 103; var16++) {
												field412[var14].field568[var15][var16] = 0;
											}
										}
									}
								}
							}

							if (field333.startsWith("::")) {
								field299.method338(217);
								field299.method339(field333.length() - 1);
								field299.method346(field333.substring(2));
							} else {
								String var17 = field333.toLowerCase();
								byte var18 = 0;
								if (var17.startsWith("yellow:")) {
									var18 = 0;
									field333 = field333.substring(7);
								} else if (var17.startsWith("red:")) {
									var18 = 1;
									field333 = field333.substring(4);
								} else if (var17.startsWith("green:")) {
									var18 = 2;
									field333 = field333.substring(6);
								} else if (var17.startsWith("cyan:")) {
									var18 = 3;
									field333 = field333.substring(5);
								} else if (var17.startsWith("purple:")) {
									var18 = 4;
									field333 = field333.substring(7);
								} else if (var17.startsWith("white:")) {
									var18 = 5;
									field333 = field333.substring(6);
								} else if (var17.startsWith("flash1:")) {
									var18 = 6;
									field333 = field333.substring(7);
								} else if (var17.startsWith("flash2:")) {
									var18 = 7;
									field333 = field333.substring(7);
								} else if (var17.startsWith("flash3:")) {
									var18 = 8;
									field333 = field333.substring(7);
								} else if (var17.startsWith("glow1:")) {
									var18 = 9;
									field333 = field333.substring(6);
								} else if (var17.startsWith("glow2:")) {
									var18 = 10;
									field333 = field333.substring(6);
								} else if (var17.startsWith("glow3:")) {
									var18 = 11;
									field333 = field333.substring(6);
								}

								String var19 = field333.toLowerCase();
								byte var20 = 0;
								if (var19.startsWith("wave:")) {
									var20 = 1;
									field333 = field333.substring(5);
								} else if (var19.startsWith("wave2:")) {
									var20 = 2;
									field333 = field333.substring(6);
								} else if (var19.startsWith("shake:")) {
									var20 = 3;
									field333 = field333.substring(6);
								} else if (var19.startsWith("scroll:")) {
									var20 = 4;
									field333 = field333.substring(7);
								} else if (var19.startsWith("slide:")) {
									var20 = 5;
									field333 = field333.substring(6);
								}

								field299.method338(184);
								field299.method339(0);
								int var21 = field299.field934;
								field299.method365(var20);
								field299.method367(var18);
								field434.field934 = 0;
								KFRNHLYS.method335(field333, field434);
								field299.method387(0, field434.field933, field434.field934);
								field299.method348(field299.field934 - var21);
								field333 = KFRNHLYS.method336(field333);
								field333 = PAYTRPNV.method437(field333);
								field256.field1331 = field333;
								field256.field1375 = var18;
								field256.field1351 = var20;
								field256.field1335 = 150;

								if (field166 == 2) {
									method182("@cr2@" + field256.field1437, 2, field256.field1331);
								} else if (field166 == 1) {
									method182("@cr1@" + field256.field1437, 2, field256.field1331);
								} else {
									method182(field256.field1437, 2, field256.field1331);
								}

								if (field525 == 2) {
									field525 = 3;
									field531 = true;
									field299.method338(83);
									field299.method339(field525);
									field299.method339(field152);
									field299.method339(field287);
								}
							}

							field333 = "";
							field482 = true;
						}
					}
				}

				if (var2 == 8 && field293.length() > 0) {
					field293 = field293.substring(0, field293.length() - 1);
				}
			} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);

			if (field293.length() < 12) {
				field293 = field293 + (char) var2;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method123() {
		if (field1041 == 1) {
			if (field1042 >= 6 && field1042 <= 106 && field1043 >= 467 && field1043 <= 499) {
				field525 = (field525 + 1) % 4;
				field531 = true;
				field482 = true;
				field299.method338(83);
				field299.method339(field525);
				field299.method339(field152);
				field299.method339(field287);
			}

			if (field1042 >= 135 && field1042 <= 235 && field1043 >= 467 && field1043 <= 499) {
				field152 = (field152 + 1) % 3;
				field531 = true;
				field482 = true;
				field299.method338(83);
				field299.method339(field525);
				field299.method339(field152);
				field299.method339(field287);
			}

			if (field1042 >= 273 && field1042 <= 373 && field1043 >= 467 && field1043 <= 499) {
				field287 = (field287 + 1) % 3;
				field531 = true;
				field482 = true;
				field299.method338(83);
				field299.method339(field525);
				field299.method339(field152);
				field299.method339(field287);
			}

			if (field1042 >= 412 && field1042 <= 512 && field1043 >= 467 && field1043 <= 499) {
				if (field309 == -1) {
					method146();
					field293 = "";
					field508 = false;

					for (int var1 = 0; var1 < AMSZZFWC.field63.length; var1++) {
						if (AMSZZFWC.field63[var1] != null && AMSZZFWC.field63[var1].field52 == 600) {
							field308 = field309 = AMSZZFWC.field63[var1].field6;
							return;
						}
					}

					return;
				}

				method182("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IBI)V")
	public final void method124(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field312[var4] != null) {
				int var5 = field310[var4];
				int var6 = field418 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field311[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field525 == 0 || field525 == 1 && method135(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field256.field1437)) {
						if (field166 >= 1) {
							field283[field476] = "Report abuse @whi@" + var7;
							field247[field476] = 872;
							field476++;
						}

						field283[field476] = "Add ignore @whi@" + var7;
						field247[field476] = 616;
						field476++;
						field283[field476] = "Add friend @whi@" + var7;
						field247[field476] = 983;
						field476++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field196 == 0 && (var5 == 7 || field152 == 0 || field152 == 1 && method135(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field166 >= 1) {
							field283[field476] = "Report abuse @whi@" + var7;
							field247[field476] = 872;
							field476++;
						}

						field283[field476] = "Add ignore @whi@" + var7;
						field247[field476] = 616;
						field476++;
						field283[field476] = "Add friend @whi@" + var7;
						field247[field476] = 983;
						field476++;
					}

					var3++;
				}

				if (var5 == 4 && (field287 == 0 || field287 == 1 && method135(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field283[field476] = "Accept trade @whi@" + var7;
						field247[field476] = 765;
						field476++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field196 == 0 && field152 < 2) {
					var3++;
				}

				if (var5 == 8 && (field287 == 0 || field287 == 1 && method135(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field283[field476] = "Accept challenge @whi@" + var7;
						field247[field476] = 924;
						field476++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method125() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.e(II)V")
	public final void method126(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(BIILYNSPIQRH;I)V")
	public final void method127(int arg0, int arg1, YNSPIQRH arg2, int arg3) {
		if (field256 != arg2 && field476 < 400) {
			String var5;
			if (arg2.field1442 == 0) {
				var5 = arg2.field1437 + method145(field256.field1422, arg2.field1422) + " (level-" + arg2.field1422 + ")";
			} else {
				var5 = arg2.field1437 + " (skill-" + arg2.field1442 + ")";
			}

			if (field157 == 1) {
				field283[field476] = "Use " + field161 + " with @whi@" + var5;
				field247[field476] = 39;
				field248[field476] = arg1;
				field245[field476] = arg3;
				field246[field476] = arg0;
				field476++;
			} else if (field270 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field430[var6] != null) {
						field283[field476] = field430[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field430[var6].equalsIgnoreCase("attack")) {
							if (arg2.field1422 > field256.field1422) {
								var7 = 2000;
							}

							if (field256.field1438 != 0 && arg2.field1438 != 0) {
								if (field256.field1438 == arg2.field1438) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field431[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field247[field476] = var7 + 509;
						}

						if (var6 == 1) {
							field247[field476] = var7 + 939;
						}

						if (var6 == 2) {
							field247[field476] = var7 + 516;
						}

						if (var6 == 3) {
							field247[field476] = var7 + 860;
						}

						if (var6 == 4) {
							field247[field476] = var7 + 92;
						}

						field248[field476] = arg1;
						field245[field476] = arg3;
						field246[field476] = arg0;
						field476++;
					}
				}
			} else if ((field272 & 0x8) == 8) {
				field283[field476] = field273 + " @whi@" + var5;
				field247[field476] = 368;
				field248[field476] = arg1;
				field245[field476] = arg3;
				field246[field476] = arg0;
				field476++;
			}

			for (int var8 = 0; var8 < field476; var8++) {
				if (field247[var8] == 451) {
					field283[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)I")
	public final int method128() {
		int var1 = 3;
		if (field266 < 310) {
			int var2 = field263 >> 7;
			int var3 = field265 >> 7;
			int var4 = field256.field1326 >> 7;
			int var5 = field256.field1327 >> 7;

			if ((field406[field320][var2][var3] & 0x4) != 0) {
				var1 = field320;
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

					if ((field406[field320][var2][var3] & 0x4) != 0) {
						var1 = field320;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field406[field320][var2][var3] & 0x4) != 0) {
							var1 = field320;
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

					if ((field406[field320][var2][var3] & 0x4) != 0) {
						var1 = field320;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field406[field320][var2][var3] & 0x4) != 0) {
							var1 = field320;
						}
					}
				}
			}
		}

		if ((field406[field320][field256.field1326 >> 7][field256.field1327 >> 7] & 0x4) != 0) {
			var1 = field320;
		}

		return var1;
	}

	@ObfuscatedName("client.x(I)I")
	public final int method129() {
		int var1 = method156(field320, field263, field265);
		if (var1 - field264 < 800 && (field406[field320][field263 >> 7][field265 >> 7] & 0x4) != 0) {
			return field320;
		}

		return 3;
	}

	@ObfuscatedName("client.a(IIIIIILAMSZZFWC;ZI)V")
	public final void method130(int arg0, int arg1, int arg2, int arg3, int arg4, AMSZZFWC arg5, boolean arg6, int arg7) {
		if (field395) {
			field291 = 32;
		} else {
			field291 = 0;
		}

		field395 = false;
		if (arg7 >= arg4 && arg7 < arg4 + 16 && arg1 >= arg2 && arg1 < arg2 + 16) {
			arg5.field47 -= field165 * 4;

			if (arg6) {
				field473 = true;
				return;
			}
		} else if (arg7 >= arg4 && arg7 < arg4 + 16 && arg1 >= arg2 + arg3 - 16 && arg1 < arg2 + arg3) {
			arg5.field47 += field165 * 4;

			if (arg6) {
				field473 = true;
				return;
			}
		} else if (arg7 >= arg4 - field291 && arg7 < arg4 + field291 + 16 && arg1 >= arg2 + 16 && arg1 < arg2 + arg3 - 16 && field165 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg0;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg2 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg5.field47 = (arg0 - arg3) * var10 / var11;

			if (arg6) {
				field473 = true;
			}

			field395 = true;
		} else {
			return;
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.y(I)V")
	public final void method131() {
		for (int var1 = -1; var1 < field373; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field371;
			} else {
				var2 = field374[var1];
			}

			YNSPIQRH var3 = field372[var2];
			if (var3 != null) {
				method196(1, var3);
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method132() {
		field511++;
		method154(true);
		method165(true);
		method154(false);
		method165(false);
		method84();
		method73();

		if (!field521) {
			int var1 = field421;
			if (field477 / 256 > var1) {
				var1 = field477 / 256;
			}

			if (field300[4] && field341[4] + 128 > var1) {
				var1 = field341[4] + 128;
			}

			int var2 = field554 + field422 & 0x7FF;
			method105(field543, var1, field544, var2, method156(field320, field256.field1326, field256.field1327) - 50, var1 * 3 + 600);
		}

		int var3;
		if (field521) {
			var3 = method129();
		} else {
			var3 = method128();
		}

		int var4 = field263;
		int var5 = field264;
		int var6 = field265;
		int var7 = field266;
		int var8 = field267;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field300[var9]) {
				int var10 = (int) (Math.random() * (field403[var9] * 2 + 1) + Math.sin(field322[var9] / 100.0D * field261[var9]) * field341[var9] - field403[var9]);
				if (var9 == 0) {
					field263 += var10;
				}

				if (var9 == 1) {
					field264 += var10;
				}

				if (var9 == 2) {
					field265 += var10;
				}

				if (var9 == 3) {
					field267 = field267 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field266 += var10;
					if (field266 < 128) {
						field266 = 128;
					}

					if (field266 > 383) {
						field266 = 383;
					}
				}
			}
		}

		int var11 = EDRGRMCC.field600;
		GEUHTGZJ.field772 = true;
		GEUHTGZJ.field775 = 0;
		GEUHTGZJ.field773 = field1035 - 4;
		GEUHTGZJ.field774 = field1036 - 4;
		OMVHXJFV.method418();
		field331.method54(var3, field265, field266, field267, field264, field263);
		field331.method29();
		method178();
		method163();
		method110(var11);
		method93();
		field398.method466(field1027, 4, 4);
		field263 = var4;
		field264 = var5;
		field265 = var6;
		field266 = var7;
		field267 = var8;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method133() {
		while (true) {
			LOBJUMRN var1 = field211.method532();
			if (var1 == null) {
				return;
			}

			if (var1.field992 == 0) {
				GEUHTGZJ.method283(var1.field996, var1.field994);

				if ((field211.method540(var1.field994) & 0x62) != 0) {
					field473 = true;

					if (field411 != -1) {
						field482 = true;
					}
				}
			}

			if (var1.field992 == 1 && var1.field996 != null) {
				QWCFKPFT.method501(var1.field996);
			}

			if (var1.field992 == 2 && field539 == var1.field994 && var1.field996 != null) {
				method204(var1.field996, field540);
			}

			if (var1.field992 == 3 && field449 == 1) {
				for (int var2 = 0; var2 < field419.length; var2++) {
					if (field285[var2] == var1.field994) {
						field419[var2] = var1.field996;

						if (var1.field996 == null) {
							field285[var2] = -1;
						}

						break;
					}

					if (field286[var2] == var1.field994) {
						field289[var2] = var1.field996;

						if (var1.field996 == null) {
							field286[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field992 == 93 && field211.method533(var1.field994)) {
				PTERWXXU.method494(new KHOMSBHW(var1.field996), field211);
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field201.method319(arg2, arg3);
		field202.method319(arg1 + arg2 - 16, arg3);
		OMVHXJFV.method420(arg3, field295, arg1 - 32, 16, arg2 + 16);
		int var6 = (arg1 - 32) * arg1 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg0 / (arg4 - arg1);
		OMVHXJFV.method420(arg3, field453, var6, 16, arg2 + var7 + 16);
		OMVHXJFV.method425(var6, arg3, arg2 + var7 + 16, field507);
		OMVHXJFV.method425(var6, arg3 + 1, arg2 + 16 + var7, field507);
		OMVHXJFV.method423(arg2 + var7 + 16, 16, arg3, field507);
		OMVHXJFV.method423(arg2 + var7 + 17, 16, arg3, field507);
		OMVHXJFV.method425(var6, arg3 + 15, arg2 + 16 + var7, field294);
		OMVHXJFV.method425(var6 - 1, arg3 + 14, arg2 + var7 + 17, field294);
		OMVHXJFV.method423(arg2 + var7 + var6 + 15, 16, arg3, field294);
		OMVHXJFV.method423(arg2 + var7 + var6 + 14, 15, arg3 + 1, field294);
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method135(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field494; var2++) {
			if (arg0.equalsIgnoreCase(field448[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field256.field1437)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IBILAMSZZFWC;I)V")
	public final void method136(int arg0, int arg1, AMSZZFWC arg2, int arg3) {
		if (arg2.field33 == 0 && arg2.field19 != null && (!arg2.field28 || field249 == arg2.field14 || field426 == arg2.field14 || field523 == arg2.field14)) {
			int var5 = OMVHXJFV.field1054;
			int var6 = OMVHXJFV.field1052;
			int var7 = OMVHXJFV.field1055;
			int var8 = OMVHXJFV.field1053;
			OMVHXJFV.method417(arg2.field41 + arg0, arg3, arg2.field12 + arg3, arg0);
			int var9 = arg2.field19.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field22[var10] + arg0;
				int var12 = arg2.field34[var10] + arg3 - arg1;
				AMSZZFWC var13 = AMSZZFWC.field63[arg2.field19[var10]];
				var11 += var13.field46;
				var12 += var13.field5;

				if (var13.field52 > 0) {
					method114(var13);
				}

				if (var13.field33 == 0) {
					if (var13.field47 > var13.field62 - var13.field12) {
						var13.field47 = var13.field62 - var13.field12;
					}

					if (var13.field47 < 0) {
						var13.field47 = 0;
					}

					method136(var11, var13.field47, var13, var12);

					if (var13.field62 > var13.field12) {
						method134(var13.field47, var13.field12, var12, var13.field41 + var11, var13.field62);
					}
				} else if (var13.field33 != 1) {
					if (var13.field33 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field12; var15++) {
							for (int var16 = 0; var16 < var13.field41; var16++) {
								int var17 = (var13.field57 + 32) * var16 + var11;
								int var18 = (var13.field66 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field29[var14];
									var18 += var13.field20[var14];
								}

								if (var13.field49[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field49[var14] - 1;
									if (var17 > OMVHXJFV.field1054 - 32 && var17 < OMVHXJFV.field1055 && var18 > OMVHXJFV.field1052 - 32 && var18 < OMVHXJFV.field1053 || field236 != 0 && field235 == var14) {
										int var22 = 0;
										if (field157 == 1 && field158 == var14 && field159 == var13.field14) {
											var22 = 0xFFFFFF;
										}

										TNNDDWAZ var23 = FZACNING.method275(var21, var13.field55[var14], var22);
										if (var23 != null) {
											if (field236 != 0 && field235 == var14 && field234 == var13.field14) {
												var19 = field1035 - field237;
												var20 = field1036 - field238;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field182 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method560(128, var17 + var19, var18 + var20);

												if (var18 + var20 < OMVHXJFV.field1052 && arg2.field47 > 0) {
													int var24 = (OMVHXJFV.field1052 - var18 - var20) * field458 / 3;
													if (var24 > field458 * 10) {
														var24 = field458 * 10;
													}

													if (var24 > arg2.field47) {
														var24 = arg2.field47;
													}

													arg2.field47 -= var24;
													field238 += var24;
												}

												if (var18 + var20 + 32 > OMVHXJFV.field1053 && arg2.field47 < arg2.field62 - arg2.field12) {
													int var25 = (var18 + var20 + 32 - OMVHXJFV.field1053) * field458 / 3;
													if (var25 > field458 * 10) {
														var25 = field458 * 10;
													}

													if (var25 > arg2.field62 - arg2.field12 - arg2.field47) {
														var25 = arg2.field62 - arg2.field12 - arg2.field47;
													}

													arg2.field47 += var25;
													field238 -= var25;
												}
											} else if (field463 != 0 && field462 == var14 && field461 == var13.field14) {
												var23.method560(128, var17, var18);
											} else {
												var23.method558(var18, var17);
											}

											if (var23.field1279 == 33 || var13.field55[var14] != 1) {
												int var26 = var13.field55[var14];
												field413.method252(0, var17 + var19 + 1, method115(var26), var18 + var20 + 10);
												field413.method252(0xFFFF00, var17 + var19, method115(var26), var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field50 != null && var14 < 20) {
									TNNDDWAZ var27 = var13.field50[var14];
									if (var27 != null) {
										var27.method558(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field33 == 3) {
						boolean var28 = false;
						if (field523 == var13.field14 || field426 == var13.field14 || field249 == var13.field14) {
							var28 = true;
						}

						int var29;
						if (method119(var13)) {
							var29 = var13.field11;
							if (var28 && var13.field65 != 0) {
								var29 = var13.field65;
							}
						} else {
							var29 = var13.field53;
							if (var28 && var13.field64 != 0) {
								var29 = var13.field64;
							}
						}

						if (var13.field13 == 0) {
							if (var13.field32) {
								OMVHXJFV.method420(var11, var29, var13.field12, var13.field41, var12);
							} else {
								OMVHXJFV.method421(var13.field41, var13.field12, var29, var12, var11);
							}
						} else if (var13.field32) {
							OMVHXJFV.method419(var13.field12, 256 - (var13.field13 & 0xFF), var29, var11, var13.field41, var12);
						} else {
							OMVHXJFV.method422(var13.field12, var11, 256 - (var13.field13 & 0xFF), var29, var13.field41, var12);
						}
					} else if (var13.field33 == 4) {
						EXARMWSO var30 = var13.field25;
						String var31 = var13.field48;
						boolean var32 = false;
						if (field523 == var13.field14 || field426 == var13.field14 || field249 == var13.field14) {
							var32 = true;
						}

						int var33;
						if (method119(var13)) {
							var33 = var13.field11;
							if (var32 && var13.field65 != 0) {
								var33 = var13.field65;
							}

							if (var13.field37.length() > 0) {
								var31 = var13.field37;
							}
						} else {
							var33 = var13.field53;
							if (var32 && var13.field64 != 0) {
								var33 = var13.field64;
							}
						}

						if (var13.field44 == 6 && field288) {
							var31 = "Please wait...";
							var33 = var13.field53;
						}

						if (OMVHXJFV.field1050 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field639 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method90(method157(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method90(method157(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method90(method157(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method90(method157(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method90(method157(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field23) {
								var30.method249(var41, var13.field8, var13.field41 / 2 + var11, var34, var33);
							} else {
								var30.method256(var33, var34, var13.field8, var11, var41);
							}

							var34 += var30.field639;
						}
					} else if (var13.field33 == 5) {
						TNNDDWAZ var42;
						if (method119(var13)) {
							var42 = var13.field54;
						} else {
							var42 = var13.field27;
						}

						if (var42 != null) {
							var42.method558(var12, var11);
						}
					} else if (var13.field33 == 6) {
						int var43 = EDRGRMCC.field585;
						int var44 = EDRGRMCC.field586;
						EDRGRMCC.field585 = var13.field41 / 2 + var11;
						EDRGRMCC.field586 = var13.field12 / 2 + var12;
						int var45 = EDRGRMCC.field589[var13.field59] * var13.field58 >> 16;
						int var46 = EDRGRMCC.field590[var13.field59] * var13.field58 >> 16;
						boolean var47 = method119(var13);
						int var48;
						if (var47) {
							var48 = var13.field39;
						} else {
							var48 = var13.field38;
						}

						GEUHTGZJ var49;
						if (var48 == -1) {
							var49 = var13.method5(-1, -1, var47);
						} else {
							EJHGNUGE var50 = EJHGNUGE.field604[var48];
							var49 = var13.method5(var50.field607[var13.field40], var50.field606[var13.field40], var47);
						}

						if (var49 != null) {
							var49.method305(0, var13.field60, 0, var13.field59, 0, var45, var46);
						}

						EDRGRMCC.field585 = var43;
						EDRGRMCC.field586 = var44;
					} else if (var13.field33 == 7) {
						EXARMWSO var51 = var13.field25;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field12; var53++) {
							for (int var54 = 0; var54 < var13.field41; var54++) {
								if (var13.field49[var52] > 0) {
									FZACNING var55 = FZACNING.method278(var13.field49[var52] - 1);
									String var56 = var55.field678;
									if (var55.field689 || var13.field55[var52] != 1) {
										var56 = var56 + " x" + method72(var13.field55[var52]);
									}

									int var57 = (var13.field57 + 115) * var54 + var11;
									int var58 = (var13.field66 + 12) * var53 + var12;
									if (var13.field23) {
										var51.method249(var56, var13.field8, var13.field41 / 2 + var57, var58, var13.field53);
									} else {
										var51.method256(var13.field53, var58, var13.field8, var57, var56);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			OMVHXJFV.method417(var7, var6, var8, var5);
		}
	}

	@ObfuscatedName("client.a(LTNNDDWAZ;III)V")
	public final void method137(TNNDDWAZ arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field422 + field366 & 0x7FF;
			int var6 = GEUHTGZJ.field777[var5];
			int var7 = GEUHTGZJ.field778[var5];
			var6 = var6 * 256 / (field177 + 256);
			var7 = var7 * 256 / (field177 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field496.method563(var10, 83 - var13 - 20, 20, 256, 20, var12 + 94 + 4 - 10, 15, 15);
		} else {
			method162(arg1, arg0, arg2);
		}
	}

	@ObfuscatedName("client.l(B)Z")
	public final boolean method138() {
		if (field199 == null) {
			return false;
		}

		try {
			int var1 = field199.method400();
			if (var1 == 0) {
				return false;
			}

			if (field229 == -1) {
				field199.method401(field389.field933, 0, 1);
				field229 = field389.field933[0] & 0xFF;
				if (field563 != null) {
					field229 = field229 - field563.method526() & 0xFF;
				}

				field228 = RQGQYKDZ.field1135[field229];
				var1--;
			}

			if (field228 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field199.method401(field389.field933, 0, 1);
				field228 = field389.field933[0] & 0xFF;
				var1--;
			}

			if (field228 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field199.method401(field389.field933, 0, 2);
				field389.field934 = 0;
				field228 = field389.method351();
				var1 -= 2;
			}

			if (var1 < field228) {
				return false;
			}

			field389.field934 = 0;
			field199.method401(field389.field933, 0, field228);
			field230 = 0;
			field551 = field550;
			field550 = field549;
			field549 = field229;

			if (field229 == 119) {
				field473 = true;
				int var2 = field389.method351();
				AMSZZFWC var3 = AMSZZFWC.field63[var2];
				while (field389.field934 < field228) {
					int var4 = field389.method363();
					int var5 = field389.method351();
					int var6 = field389.method349();
					if (var6 == 255) {
						var6 = field389.method354();
					}

					if (var4 >= 0 && var4 < var3.field49.length) {
						var3.field49[var4] = var5;
						var3.field55[var4] = var6;
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 56) {
				field452 = field228 / 8;
				for (int var7 = 0; var7 < field452; var7++) {
					field180[var7] = field389.method355();
				}

				field229 = -1;
				return true;
			}

			if (field229 == 113) {
				int var8 = field389.method379();
				int var9 = field389.method351();

				if (field411 != -1) {
					field411 = -1;
					field482 = true;
				}

				if (field214 != 0) {
					field214 = 0;
					field482 = true;
				}

				field309 = var9;
				field162 = var8;
				field473 = true;
				field380 = true;
				field288 = false;
				field229 = -1;
				return true;
			}

			if (field229 == 3 || field229 == 98) {
				int var10 = field220;
				int var11 = field221;
				if (field229 == 3) {
					var11 = field389.method379();
					var10 = field389.method378();
					field212 = false;
				}

				if (field229 == 98) {
					var10 = field389.method351();
					var11 = field389.method377();
					field389.method359();

					for (int var12 = 0; var12 < 4; var12++) {
						for (int var13 = 0; var13 < 13; var13++) {
							for (int var14 = 0; var14 < 13; var14++) {
								int var15 = field389.method360(1);
								if (var15 == 1) {
									field529[var12][var13][var14] = field389.method360(26);
								} else {
									field529[var12][var13][var14] = -1;
								}
							}
						}
					}

					field389.method361();
					field212 = true;
				}

				if (field220 == var10 && field221 == var11 && field449 == 2) {
					field229 = -1;
					return true;
				}

				field220 = var10;
				field221 = var11;
				field489 = (field220 - 6) * 8;
				field490 = (field221 - 6) * 8;
				field479 = false;
				if ((field220 / 8 == 48 || field220 / 8 == 49) && field221 / 8 == 48) {
					field479 = true;
				}

				if (field220 / 8 == 48 && field221 / 8 == 148) {
					field479 = true;
				}

				field449 = 1;
				field353 = System.currentTimeMillis();
				field398.method465();
				field414.method248(151, "Loading - please wait.", 257, 0);
				field414.method248(150, "Loading - please wait.", 256, 0xFFFFFF);
				field398.method466(field1027, 4, 4);

				if (field229 == 3) {
					int var16 = 0;
					for (int var17 = (field220 - 6) / 8; var17 <= (field220 + 6) / 8; var17++) {
						for (int var18 = (field221 - 6) / 8; var18 <= (field221 + 6) / 8; var18++) {
							var16++;
						}
					}

					field419 = new byte[var16][];
					field289 = new byte[var16][];
					field284 = new int[var16];
					field285 = new int[var16];
					field286 = new int[var16];
					int var19 = 0;
					for (int var20 = (field220 - 6) / 8; var20 <= (field220 + 6) / 8; var20++) {
						for (int var21 = (field221 - 6) / 8; var21 <= (field221 + 6) / 8; var21++) {
							field284[var19] = (var20 << 8) + var21;

							if (field479 && (var21 == 49 || var21 == 149 || var21 == 147 || var20 == 50 || var20 == 49 && var21 == 47)) {
								field285[var19] = -1;
								field286[var19] = -1;
								var19++;
							} else {
								int var22 = field285[var19] = field211.method541(0, var20, var21);
								if (var22 != -1) {
									field211.method531(3, var22);
								}

								int var23 = field286[var19] = field211.method541(1, var20, var21);
								if (var23 != -1) {
									field211.method531(3, var23);
								}

								var19++;
							}
						}
					}
				}

				if (field229 == 98) {
					int var24 = 0;
					int[] var25 = new int[676];
					for (int var26 = 0; var26 < 4; var26++) {
						for (int var27 = 0; var27 < 13; var27++) {
							for (int var28 = 0; var28 < 13; var28++) {
								int var29 = field529[var26][var27][var28];
								if (var29 != -1) {
									int var30 = var29 >> 14 & 0x3FF;
									int var31 = var29 >> 3 & 0x7FF;
									int var32 = (var30 / 8 << 8) + var31 / 8;
									for (int var33 = 0; var33 < var24; var33++) {
										if (var25[var33] == var32) {
											var32 = -1;
											break;
										}
									}

									if (var32 != -1) {
										var25[var24++] = var32;
									}
								}
							}
						}
					}

					field419 = new byte[var24][];
					field289 = new byte[var24][];
					field284 = new int[var24];
					field285 = new int[var24];
					field286 = new int[var24];
					for (int var34 = 0; var34 < var24; var34++) {
						int var35 = field284[var34] = var25[var34];
						int var36 = var35 >> 8 & 0xFF;
						int var37 = var35 & 0xFF;
						int var38 = field285[var34] = field211.method541(0, var36, var37);
						if (var38 != -1) {
							field211.method531(3, var38);
						}

						int var39 = field286[var34] = field211.method541(1, var36, var37);
						if (var39 != -1) {
							field211.method531(3, var39);
						}
					}
				}

				int var40 = field489 - field491;
				int var41 = field490 - field492;
				field491 = field489;
				field492 = field490;

				for (int var42 = 0; var42 < 16384; var42++) {
					FJJCITCO var43 = field435[var42];
					if (var43 != null) {
						for (int var44 = 0; var44 < 10; var44++) {
							var43.field1367[var44] -= var40;
							var43.field1368[var44] -= var41;
						}

						var43.field1326 -= var40 * 128;
						var43.field1327 -= var41 * 128;
					}
				}

				for (int var45 = 0; var45 < field370; var45++) {
					YNSPIQRH var46 = field372[var45];
					if (var46 != null) {
						for (int var47 = 0; var47 < 10; var47++) {
							var46.field1367[var47] -= var40;
							var46.field1368[var47] -= var41;
						}

						var46.field1326 -= var40 * 128;
						var46.field1327 -= var41 * 128;
					}
				}

				field497 = true;
				byte var48 = 0;
				byte var49 = 104;
				byte var50 = 1;
				if (var40 < 0) {
					var48 = 103;
					var49 = -1;
					var50 = -1;
				}

				byte var51 = 0;
				byte var52 = 104;
				byte var53 = 1;
				if (var41 < 0) {
					var51 = 103;
					var52 = -1;
					var53 = -1;
				}

				for (int var54 = var48; var54 != var49; var54 += var50) {
					for (int var55 = var51; var55 != var52; var55 += var53) {
						int var56 = var40 + var54;
						int var57 = var41 + var55;
						for (int var58 = 0; var58 < 4; var58++) {
							if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
								field278[var58][var54][var55] = field278[var58][var56][var57];
							} else {
								field278[var58][var54][var55] = null;
							}
						}
					}
				}

				for (ZAHKTBCG var59 = (ZAHKTBCG) field193.method329(); var59 != null; var59 = (ZAHKTBCG) field193.method331()) {
					var59.field1454 -= var40;
					var59.field1455 -= var41;
					if (var59.field1454 < 0 || var59.field1455 < 0 || var59.field1454 >= 104 || var59.field1455 >= 104) {
						var59.method1();
					}
				}

				if (field216 != 0) {
					field216 -= var40;
					field217 -= var41;
				}

				field521 = false;
				field229 = -1;
				return true;
			}

			if (field229 == 221) {
				field444 = field389.method349();
				field445 = field389.method369();
				field229 = -1;
				return true;
			}

			if (field229 == 104 || field229 == 197 || field229 == 171 || field229 == 231 || field229 == 101 || field229 == 29 || field229 == 78 || field229 == 59 || field229 == 40 || field229 == 216 || field229 == 25) {
				method139(field229, field389);
				field229 = -1;
				return true;
			}

			if (field229 == 144) {
				field324 = false;
				field214 = 1;
				field408 = "";
				field482 = true;
				field229 = -1;
				return true;
			}

			if (field229 == 246) {
				field163 = field389.method349();
				if (field163 == 1) {
					field175 = field389.method351();
				}

				if (field163 >= 2 && field163 <= 6) {
					if (field163 == 2) {
						field189 = 64;
						field190 = 64;
					}

					if (field163 == 3) {
						field189 = 0;
						field190 = 64;
					}

					if (field163 == 4) {
						field189 = 128;
						field190 = 64;
					}

					if (field163 == 5) {
						field189 = 64;
						field190 = 0;
					}

					if (field163 == 6) {
						field189 = 64;
						field190 = 128;
					}

					field163 = 2;
					field186 = field389.method351();
					field187 = field389.method351();
					field188 = field389.method349();
				}

				if (field163 == 10) {
					field170 = field389.method351();
				}

				field229 = -1;
				return true;
			}

			if (field229 == 125) {
				int var60 = field389.method379();
				int var61 = field389.method379();
				int var62 = field389.method377();
				if (var62 == 0xFFFF) {
					AMSZZFWC.field63[var60].field35 = 0;
					field229 = -1;
					return true;
				}

				FZACNING var63 = FZACNING.method278(var62);
				AMSZZFWC.field63[var60].field35 = 4;
				AMSZZFWC.field63[var60].field36 = var62;
				AMSZZFWC.field63[var60].field59 = var63.field696;
				AMSZZFWC.field63[var60].field60 = var63.field698;
				AMSZZFWC.field63[var60].field58 = var63.field663 * 100 / var61;
				field229 = -1;
				return true;
			}

			if (field229 == 206) {
				field445 = field389.method349();
				field444 = field389.method368();
				for (int var64 = field444; var64 < field444 + 8; var64++) {
					for (int var65 = field445; var65 < field445 + 8; var65++) {
						if (field278[field320][var64][var65] != null) {
							field278[field320][var64][var65] = null;
							method144(var64, var65);
						}
					}
				}

				for (ZAHKTBCG var66 = (ZAHKTBCG) field193.method329(); var66 != null; var66 = (ZAHKTBCG) field193.method331()) {
					if (var66.field1454 >= field444 && var66.field1454 < field444 + 8 && var66.field1455 >= field445 && var66.field1455 < field445 + 8 && field320 == var66.field1452) {
						var66.field1457 = 0;
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 21) {
				field521 = true;
				field501 = field389.method349();
				field502 = field389.method349();
				field503 = field389.method351();
				field504 = field389.method349();
				field505 = field389.method349();
				if (field505 >= 100) {
					field263 = field501 * 128 + 64;
					field265 = field502 * 128 + 64;
					field264 = method156(field320, field263, field265) - field503;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 124) {
				int var67 = field389.method377();
				method203(var67);

				if (field162 != -1) {
					field162 = -1;
					field473 = true;
					field380 = true;
				}

				if (field411 != -1) {
					field411 = -1;
					field482 = true;
				}

				if (field214 != 0) {
					field214 = 0;
					field482 = true;
				}

				field309 = var67;
				field288 = false;
				field229 = -1;
				return true;
			}

			if (field229 == 41) {
				int var68 = field389.method377();
				int var69 = field389.method379();
				AMSZZFWC.field63[var68].field35 = 1;
				AMSZZFWC.field63[var68].field36 = var69;
				field229 = -1;
				return true;
			}

			if (field229 == 97) {
				if (field162 != -1) {
					field162 = -1;
					field473 = true;
					field380 = true;
				}

				if (field411 != -1) {
					field411 = -1;
					field482 = true;
				}

				if (field214 != 0) {
					field214 = 0;
					field482 = true;
				}

				field309 = -1;
				field288 = false;
				field229 = -1;
				return true;
			}

			if (field229 == 83) {
				method80(field228, field389);
				field497 = false;
				field229 = -1;
				return true;
			}

			if (field229 == 79) {
				method68(field389, field228);
				field229 = -1;
				return true;
			}

			if (field229 == 123) {
				if (field298 == 12) {
					field473 = true;
				}

				field169 = field389.method349();
				field229 = -1;
				return true;
			}

			if (field229 == 152) {
				field521 = false;

				for (int var70 = 0; var70 < 5; var70++) {
					field300[var70] = false;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 23) {
				field521 = true;
				field301 = field389.method349();
				field302 = field389.method349();
				field303 = field389.method351();
				field304 = field389.method349();
				field305 = field389.method349();
				if (field305 >= 100) {
					int var71 = field301 * 128 + 64;
					int var72 = field302 * 128 + 64;
					int var73 = method156(field320, var71, var72) - field303;
					int var74 = var71 - field263;
					int var75 = var73 - field264;
					int var76 = var72 - field265;
					int var77 = (int) Math.sqrt(var74 * var74 + var76 * var76);
					field266 = (int) (Math.atan2(var75, var77) * 325.949D) & 0x7FF;
					field267 = (int) (Math.atan2(var74, var76) * -325.949D) & 0x7FF;

					if (field266 < 128) {
						field266 = 128;
					}

					if (field266 > 383) {
						field266 = 383;
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 157) {
				long var78 = field389.method355();
				int var80 = field389.method354();
				int var81 = field389.method349();
				boolean var82 = false;
				for (int var83 = 0; var83 < 100; var83++) {
					if (field297[var83] == var80) {
						var82 = true;
						break;
					}
				}

				if (var81 <= 1) {
					for (int var84 = 0; var84 < field452; var84++) {
						if (field180[var84] == var78) {
							var82 = true;
							break;
						}
					}
				}

				if (!var82 && field522 == 0) {
					try {
						field297[field176] = var80;
						field176 = (field176 + 1) % 100;
						String var85 = KFRNHLYS.method334(field389, field228 - 13);
						if (var81 != 3) {
							var85 = PAYTRPNV.method437(var85);
						}

						if (var81 == 2 || var81 == 3) {
							method182("@cr2@" + UMKVTRLP.method584(UMKVTRLP.method581(var78)), 7, var85);
						} else if (var81 == 1) {
							method182("@cr1@" + UMKVTRLP.method584(UMKVTRLP.method581(var78)), 7, var85);
						} else {
							method182(UMKVTRLP.method584(UMKVTRLP.method581(var78)), 3, var85);
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 227) {
				long var87 = field389.method355();
				int var89 = field389.method349();
				String var90 = UMKVTRLP.method584(UMKVTRLP.method581(var87));
				for (int var91 = 0; var91 < field494; var91++) {
					if (field438[var91] == var87) {
						if (field530[var91] != var89) {
							field530[var91] = var89;
							field473 = true;

							if (var89 > 0) {
								method182("", 5, var90 + " has logged in.");
							}

							if (var89 == 0) {
								method182("", 5, var90 + " has logged out.");
							}
						}

						var90 = null;
						break;
					}
				}

				if (var90 != null && field494 < 200) {
					field438[field494] = var87;
					field448[field494] = var90;
					field530[field494] = var89;
					field494++;
					field473 = true;
				}

				boolean var92 = false;
				while (!var92) {
					var92 = true;
					for (int var93 = 0; var93 < field494 - 1; var93++) {
						if (field530[var93] != field325 && field530[var93 + 1] == field325 || field530[var93] == 0 && field530[var93 + 1] != 0) {
							int var94 = field530[var93];
							field530[var93] = field530[var93 + 1];
							field530[var93 + 1] = var94;
							String var95 = field448[var93];
							field448[var93] = field448[var93 + 1];
							field448[var93 + 1] = var95;
							long var96 = field438[var93];
							field438[var93] = field438[var93 + 1];
							field438[var93 + 1] = var96;
							field473 = true;
							var92 = false;
						}
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 49) {
				field298 = field389.method368();
				field473 = true;
				field380 = true;
				field229 = -1;
				return true;
			}

			if (field229 == 165) {
				int var98 = field389.method368();
				int var99 = field389.method368();
				String var100 = field389.method356();
				if (var98 >= 1 && var98 <= 5) {
					if (var100.equalsIgnoreCase("null")) {
						var100 = null;
					}

					field430[var98 - 1] = var100;
					field431[var98 - 1] = var99 == 0;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 161) {
				for (int var101 = 0; var101 < field372.length; var101++) {
					if (field372[var101] != null) {
						field372[var101].field1339 = -1;
					}
				}

				for (int var102 = 0; var102 < field435.length; var102++) {
					if (field435[var102] != null) {
						field435[var102].field1339 = -1;
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 50) {
				field473 = true;
				int var103 = field389.method351();
				AMSZZFWC var104 = AMSZZFWC.field63[var103];
				int var105 = field389.method351();
				for (int var106 = 0; var106 < var105; var106++) {
					int var107 = field389.method349();
					if (var107 == 255) {
						var107 = field389.method386();
					}

					var104.field49[var106] = field389.method351();
					var104.field55[var106] = var107;
				}

				for (int var108 = var105; var108 < var104.field49.length; var108++) {
					var104.field49[var108] = 0;
					var104.field55[var108] = 0;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 214) {
				field206 = field389.method349();
				field229 = -1;
				return true;
			}

			if (field229 == 46) {
				field306 = field389.method349();
				field535 = field389.method377();
				field191 = field389.method379();
				field560 = field389.method386();
				field255 = field389.method370();
				if (field560 != 0 && field309 == -1) {
					signlink.dnslookup(UMKVTRLP.method583(field560));
					method146();
					short var109 = 650;
					if (field306 != 201 || field255 == 1) {
						var109 = 655;
					}

					field293 = "";
					field508 = false;

					for (int var110 = 0; var110 < AMSZZFWC.field63.length; var110++) {
						if (AMSZZFWC.field63[var110] != null && AMSZZFWC.field63[var110].field52 == var109) {
							field309 = AMSZZFWC.field63[var110].field6;
							break;
						}
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 34) {
				field323 = field389.method377();
				field450 = field389.method349();
				field229 = -1;
				return true;
			}

			if (field229 == 47) {
				int var111 = field389.method378();
				AMSZZFWC var112 = AMSZZFWC.field63[var111];
				for (int var113 = 0; var113 < var112.field49.length; var113++) {
					var112.field49[var113] = -1;
					var112.field49[var113] = 0;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 84) {
				int var114 = field389.method377();
				int var115 = field389.method378();
				AMSZZFWC var116 = AMSZZFWC.field63[var115];
				if (var116 != null && var116.field33 == 0) {
					if (var114 < 0) {
						var114 = 0;
					}

					if (var114 > var116.field62 - var116.field12) {
						var114 = var116.field62 - var116.field12;
					}

					var116.field47 = var114;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 237) {
				int var117 = field389.method351();
				int var118 = field389.method349();
				int var119 = field389.method351();
				if (field391 && !field328 && field547 < 50) {
					field280[field547] = var117;
					field407[field547] = var118;
					field402[field547] = AWDRZEFD.field69[var117] + var119;
					field547++;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 199) {
				int var120 = field389.method379();
				boolean var121 = field389.method369() == 1;
				AMSZZFWC.field63[var120].field28 = var121;
				field229 = -1;
				return true;
			}

			if (field229 == 203) {
				int var122 = field389.method351();
				method203(var122);

				if (field162 != -1) {
					field162 = -1;
					field473 = true;
					field380 = true;
				}

				field411 = var122;
				field482 = true;
				field309 = -1;
				field288 = false;
				field229 = -1;
				return true;
			}

			if (field229 == 110) {
				method185();
				field229 = -1;
				return false;
			}

			if (field229 == 202) {
				field259 = field389.method349();
				if (field298 == field259) {
					if (field259 == 3) {
						field298 = 1;
					} else {
						field298 = 3;
					}

					field473 = true;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 142) {
				int var123 = field389.method379();
				if (var123 == 0xFFFF) {
					var123 = -1;
				}

				if (field173 != var123 && field400 && !field328 && field213 == 0) {
					field539 = var123;
					field540 = true;
					field211.method531(2, field539);
				}

				field173 = var123;
				field229 = -1;
				return true;
			}

			if (field229 == 129) {
				int var124 = field389.method377();
				int var125 = field389.method379();
				if (field400 && !field328) {
					field539 = var125;
					field540 = false;
					field211.method531(2, field539);
					field213 = var124;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 223) {
				field444 = field389.method349();
				field445 = field389.method349();

				while (field389.field934 < field228) {
					int var126 = field389.method349();
					method139(var126, field389);
				}

				field229 = -1;
				return true;
			}

			if (field229 == 53) {
				for (int var127 = 0; var127 < field257.length; var127++) {
					if (field528[var127] != field257[var127]) {
						field257[var127] = field528[var127];
						method143(var127);
						field473 = true;
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 187) {
				int var128 = field389.method379();
				int var129 = field389.method379();
				AMSZZFWC.field63[var129].field35 = 2;
				AMSZZFWC.field63[var129].field36 = var128;
				field229 = -1;
				return true;
			}

			if (field229 == 247) {
				int var130 = field389.method354();
				int var131 = field389.method377();
				field528[var131] = var130;

				if (field257[var131] != var130) {
					field257[var131] = var130;
					method143(var131);
					field473 = true;

					if (field240 != -1) {
						field482 = true;
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 188) {
				int var132 = field389.method379();
				int var133 = field389.method379();
				int var134 = field389.method378();
				int var135 = field389.method351();
				AMSZZFWC.field63[var134].field59 = var132;
				AMSZZFWC.field63[var134].field60 = var133;
				AMSZZFWC.field63[var134].field58 = var135;
				field229 = -1;
				return true;
			}

			if (field229 == 166) {
				int var136 = field389.method378();
				int var137 = field389.method351();
				int var138 = var136 >> 10 & 0x1F;
				int var139 = var136 >> 5 & 0x1F;
				int var140 = var136 & 0x1F;
				AMSZZFWC.field63[var137].field53 = (var140 << 3) + (var138 << 19) + (var139 << 11);
				field229 = -1;
				return true;
			}

			if (field229 == 254) {
				int var141 = field389.method382();
				if (var141 >= 0) {
					method203(var141);
				}

				field562 = var141;
				field229 = -1;
				return true;
			}

			if (field229 == 177) {
				int var142 = field389.method379();
				int var143 = field389.method380();
				AMSZZFWC var144 = AMSZZFWC.field63[var142];
				var144.field38 = var143;

				if (var143 == -1) {
					var144.field40 = 0;
					var144.field56 = 0;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 44) {
				int var145 = field389.method378();
				method203(var145);

				if (field411 != -1) {
					field411 = -1;
					field482 = true;
				}

				if (field214 != 0) {
					field214 = 0;
					field482 = true;
				}

				field162 = var145;
				field473 = true;
				field380 = true;
				field309 = -1;
				field288 = false;
				field229 = -1;
				return true;
			}

			if (field229 == 229) {
				int var146 = field389.method352();
				int var147 = field389.method351();
				int var148 = field389.method352();
				AMSZZFWC var149 = AMSZZFWC.field63[var147];
				var149.field46 = var146;
				var149.field5 = var148;
				field229 = -1;
				return true;
			}

			if (field229 == 176) {
				field485 = field389.method378() * 30;
				field229 = -1;
				return true;
			}

			if (field229 == 244) {
				int var150 = field389.method377();
				String var151 = field389.method356();
				AMSZZFWC.field63[var150].field48 = var151;

				if (field506[field298] == AMSZZFWC.field63[var150].field6) {
					field473 = true;
				}

				field229 = -1;
				return true;
			}

			if (field229 == 180) {
				int var152 = field389.method381();
				field240 = var152;
				field482 = true;
				field229 = -1;
				return true;
			}

			if (field229 == 85) {
				field525 = field389.method349();
				field152 = field389.method349();
				field287 = field389.method349();
				field531 = true;
				field482 = true;
				field229 = -1;
				return true;
			}

			if (field229 == 158) {
				if (field298 == 12) {
					field473 = true;
				}

				field447 = field389.method352();
				field229 = -1;
				return true;
			}

			if (field229 == 178) {
				field324 = false;
				field214 = 2;
				field408 = "";
				field482 = true;
				field229 = -1;
				return true;
			}

			if (field229 == 234) {
				int var153 = field389.method379();
				byte var154 = field389.method373();
				field528[var153] = var154;

				if (field257[var153] != var154) {
					field257[var153] = var154;
					method143(var153);
					field473 = true;

					if (field240 != -1) {
						field482 = true;
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 77) {
				int var155 = field389.method349();
				int var156 = field389.method379();
				if (var156 == 0xFFFF) {
					var156 = -1;
				}

				field506[var155] = var156;
				field473 = true;
				field380 = true;
				field229 = -1;
				return true;
			}

			if (field229 == 55) {
				field495 = field389.method349();
				field473 = true;
				field229 = -1;
				return true;
			}

			if (field229 == 72) {
				field216 = 0;
				field229 = -1;
				return true;
			}

			if (field229 == 146) {
				int var157 = field389.method349();
				int var158 = field389.method349();
				int var159 = field389.method349();
				int var160 = field389.method349();
				field300[var157] = true;
				field403[var157] = var158;
				field341[var157] = var159;
				field322[var157] = var160;
				field261[var157] = 0;
				field229 = -1;
				return true;
			}

			if (field229 == 103) {
				int var161 = field389.method351();
				AMSZZFWC.field63[var161].field35 = 3;

				if (field256.field1423 == null) {
					AMSZZFWC.field63[var161].field36 = (field256.field1441[11] << 5) + (field256.field1441[8] << 10) + (field256.field1441[0] << 15) + (field256.field1425[0] << 25) + (field256.field1425[4] << 20) + field256.field1441[1];
				} else {
					AMSZZFWC.field63[var161].field36 = (int) (field256.field1423.field1321 + 0x12345678L);
				}

				field229 = -1;
				return true;
			}

			if (field229 == 51) {
				String var162 = field389.method356();
				if (var162.endsWith(":tradereq:")) {
					String var163 = var162.substring(0, var162.indexOf(":"));
					long var164 = UMKVTRLP.method580(var163);
					boolean var166 = false;
					for (int var167 = 0; var167 < field452; var167++) {
						if (field180[var167] == var164) {
							var166 = true;
							break;
						}
					}

					if (!var166 && field522 == 0) {
						method182(var163, 4, "wishes to trade with you.");
					}
				} else if (var162.endsWith(":duelreq:")) {
					String var168 = var162.substring(0, var162.indexOf(":"));
					long var169 = UMKVTRLP.method580(var168);
					boolean var171 = false;
					for (int var172 = 0; var172 < field452; var172++) {
						if (field180[var172] == var169) {
							var171 = true;
							break;
						}
					}

					if (!var171 && field522 == 0) {
						method182(var168, 8, "wishes to duel with you.");
					}
				} else if (var162.endsWith(":chalreq:")) {
					String var173 = var162.substring(0, var162.indexOf(":"));
					long var174 = UMKVTRLP.method580(var173);
					boolean var176 = false;
					for (int var177 = 0; var177 < field452; var177++) {
						if (field180[var177] == var174) {
							var176 = true;
							break;
						}
					}

					if (!var176 && field522 == 0) {
						String var178 = var162.substring(var162.indexOf(":") + 1, var162.length() - 9);
						method182(var173, 8, var178);
					}
				} else {
					method182("", 0, var162);
				}

				field229 = -1;
				return true;
			}

			if (field229 == 218) {
				field473 = true;
				int var179 = field389.method369();
				int var180 = field389.method370();
				int var181 = field389.method385();
				field378[var179] = var181;
				field274[var179] = var180;
				field538[var179] = 1;
				for (int var182 = 0; var182 < 98; var182++) {
					if (var181 >= field488[var182]) {
						field538[var179] = var182 + 2;
					}
				}

				field229 = -1;
				return true;
			}

			if (field229 == 148) {
				field279 = field389.method349();
				field229 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field229 + "," + field228 + " - " + field550 + "," + field551);
			method185();
		} catch (IOException var187) {
			method66();
		} catch (Exception var188) {
			String var184 = "T2 - " + field229 + "," + field550 + "," + field551 + " - " + field228 + "," + (field256.field1367[0] + field489) + "," + (field256.field1368[0] + field490) + " - ";
			for (int var185 = 0; var185 < field228 && var185 < 50; var185++) {
				var184 = var184 + field389.field933[var185] + ",";
			}

			signlink.reporterror(var184);
			method185();
		}

		return true;
	}

	@ObfuscatedName("client.b(IILKHOMSBHW;)V")
	public final void method139(int arg0, KHOMSBHW arg1) {
		if (arg0 == 59) {
			int var3 = arg1.method351();
			int var4 = arg1.method369();
			int var5 = (var4 >> 4 & 0x7) + field444;
			int var6 = (var4 & 0x7) + field445;
			int var7 = arg1.method379();
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				PMWLDMKW var8 = new PMWLDMKW();
				var8.field1083 = var7;
				var8.field1084 = var3;

				if (field278[field320][var5][var6] == null) {
					field278[field320][var5][var6] = new JQOEJEDB();
				}

				field278[field320][var5][var6].method326(var8);
				method144(var5, var6);
			}
		} else {
			if (arg0 == 104) {
				int var9 = arg1.method349();
				int var10 = (var9 >> 4 & 0x7) + field444;
				int var11 = (var9 & 0x7) + field445;
				int var12 = arg1.method351();
				int var13 = arg1.method349();
				int var14 = var13 >> 4 & 0xF;
				int var15 = var13 & 0x7;
				if (field256.field1367[0] >= var10 - var14 && field256.field1367[0] <= var10 + var14 && field256.field1368[0] >= var11 - var14 && field256.field1368[0] <= var11 + var14 && field391 && !field328 && field547 < 50) {
					field280[field547] = var12;
					field407[field547] = var15;
					field402[field547] = AWDRZEFD.field69[var12];
					field547++;
				}
			}

			if (arg0 == 101) {
				int var16 = arg1.method349();
				int var17 = (var16 >> 4 & 0x7) + field444;
				int var18 = (var16 & 0x7) + field445;
				int var19 = arg1.method351();
				int var20 = arg1.method349();
				int var21 = arg1.method351();
				if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
					var17 = var17 * 128 + 64;
					var18 = var18 * 128 + 64;
					DXQCGOAI var22 = new DXQCGOAI(var18, var17, var21, field320, field420, var19, method156(field320, var17, var18) - var20);
					field329.method326(var22);
				}
			} else {
				if (arg0 == 171) {
					int var23 = arg1.method379();
					byte var24 = arg1.method373();
					byte var25 = arg1.method350();
					int var26 = arg1.method378();
					int var27 = arg1.method379();
					byte var28 = arg1.method372();
					byte var29 = arg1.method371();
					int var30 = arg1.method349();
					int var31 = (var30 >> 4 & 0x7) + field444;
					int var32 = (var30 & 0x7) + field445;
					int var33 = arg1.method377();
					int var34 = arg1.method368();
					int var35 = var34 >> 2;
					int var36 = var34 & 0x3;
					int var37 = field451[var35];
					YNSPIQRH var38;
					if (field323 == var33) {
						var38 = field256;
					} else {
						var38 = field372[var33];
					}

					if (var38 != null) {
						RUJAIVBH var39 = RUJAIVBH.method512(var27);
						int var40 = field364[field320][var31][var32];
						int var41 = field364[field320][var31 + 1][var32];
						int var42 = field364[field320][var31 + 1][var32 + 1];
						int var43 = field364[field320][var31][var32 + 1];
						GEUHTGZJ var44 = var39.method505(var35, var36, var40, var41, var42, var43, -1);
						if (var44 != null) {
							method151(var23 + 1, 0, 0, var26 + 1, var32, field320, var31, -1, var37);
							var38.field1439 = field420 + var26;
							var38.field1440 = field420 + var23;
							var38.field1429 = var44;
							int var45 = var39.field1174;
							int var46 = var39.field1180;
							if (var36 == 1 || var36 == 3) {
								var45 = var39.field1180;
								var46 = var39.field1174;
							}

							var38.field1426 = var31 * 128 + var45 * 64;
							var38.field1428 = var32 * 128 + var46 * 64;
							var38.field1427 = method156(field320, var38.field1426, var38.field1428);

							if (var28 > var25) {
								byte var47 = var28;
								var28 = var25;
								var25 = var47;
							}

							if (var29 > var24) {
								byte var48 = var29;
								var29 = var24;
								var24 = var48;
							}

							var38.field1433 = var28 + var31;
							var38.field1435 = var25 + var31;
							var38.field1434 = var29 + var32;
							var38.field1436 = var24 + var32;
						}
					}
				}

				if (arg0 == 29) {
					int var49 = arg1.method349();
					int var50 = (var49 >> 4 & 0x7) + field444;
					int var51 = (var49 & 0x7) + field445;
					int var52 = var50 + arg1.method350();
					int var53 = var51 + arg1.method350();
					int var54 = arg1.method352();
					int var55 = arg1.method351();
					int var56 = arg1.method349() * 4;
					int var57 = arg1.method349() * 4;
					int var58 = arg1.method351();
					int var59 = arg1.method351();
					int var60 = arg1.method349();
					int var61 = arg1.method349();
					if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104 && var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var55 != 0xFFFF) {
						var50 = var50 * 128 + 64;
						var51 = var51 * 128 + 64;
						var52 = var52 * 128 + 64;
						var53 = var53 * 128 + 64;
						RVDLUGTG var62 = new RVDLUGTG(var51, method156(field320, var50, var51) - var56, var61, var54, field420 + var59, field420 + var58, var55, field320, var57, var50, var60);
						var62.method516(var53, field420 + var58, var52, method156(field320, var52, var53) - var57);
						field321.method326(var62);
					}
				} else if (arg0 == 25) {
					int var63 = arg1.method349();
					int var64 = (var63 >> 4 & 0x7) + field444;
					int var65 = (var63 & 0x7) + field445;
					int var66 = arg1.method351();
					int var67 = arg1.method369();
					int var68 = var67 >> 2;
					int var69 = var67 & 0x3;
					int var70 = field451[var68];
					if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
						method151(-1, var69, var68, 0, var65, field320, var64, var66, var70);
					}
				} else if (arg0 == 78) {
					int var71 = arg1.method378();
					int var72 = arg1.method349();
					int var73 = (var72 >> 4 & 0x7) + field444;
					int var74 = (var72 & 0x7) + field445;
					if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
						JQOEJEDB var75 = field278[field320][var73][var74];
						if (var75 != null) {
							for (PMWLDMKW var76 = (PMWLDMKW) var75.method329(); var76 != null; var76 = (PMWLDMKW) var75.method331()) {
								if ((var71 & 0x7FFF) == var76.field1083) {
									var76.method1();
									break;
								}
							}

							if (var75.method329() == null) {
								field278[field320][var73][var74] = null;
							}

							method144(var73, var74);
						}
					}
				} else if (arg0 == 231) {
					int var77 = arg1.method351();
					int var78 = arg1.method368();
					int var79 = (var78 >> 4 & 0x7) + field444;
					int var80 = (var78 & 0x7) + field445;
					int var81 = arg1.method379();
					int var82 = arg1.method379();
					if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104 && field323 != var77) {
						PMWLDMKW var83 = new PMWLDMKW();
						var83.field1083 = var81;
						var83.field1084 = var82;

						if (field278[field320][var79][var80] == null) {
							field278[field320][var79][var80] = new JQOEJEDB();
						}

						field278[field320][var79][var80].method326(var83);
						method144(var79, var80);
					}
				} else if (arg0 == 197) {
					int var84 = arg1.method349();
					int var85 = (var84 >> 4 & 0x7) + field444;
					int var86 = (var84 & 0x7) + field445;
					int var87 = arg1.method351();
					int var88 = arg1.method351();
					int var89 = arg1.method351();
					if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
						JQOEJEDB var90 = field278[field320][var85][var86];
						if (var90 != null) {
							for (PMWLDMKW var91 = (PMWLDMKW) var90.method329(); var91 != null; var91 = (PMWLDMKW) var90.method331()) {
								if ((var87 & 0x7FFF) == var91.field1083 && var91.field1084 == var88) {
									var91.field1084 = var89;
									break;
								}
							}

							method144(var85, var86);
						}
					}
				} else if (arg0 == 216) {
					int var92 = arg1.method368();
					int var93 = var92 >> 2;
					int var94 = var92 & 0x3;
					int var95 = field451[var93];
					int var96 = arg1.method370();
					int var97 = (var96 >> 4 & 0x7) + field444;
					int var98 = (var96 & 0x7) + field445;
					if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
						method151(-1, var94, var93, 0, var98, field320, var97, -1, var95);
					}
				} else if (arg0 == 40) {
					int var99 = arg1.method379();
					int var100 = arg1.method369();
					int var101 = (var100 >> 4 & 0x7) + field444;
					int var102 = (var100 & 0x7) + field445;
					int var103 = arg1.method369();
					int var104 = var103 >> 2;
					int var105 = var103 & 0x3;
					int var106 = field451[var104];
					if (var101 >= 0 && var102 >= 0 && var101 < 103 && var102 < 103) {
						int var107 = field364[field320][var101][var102];
						int var108 = field364[field320][var101 + 1][var102];
						int var109 = field364[field320][var101 + 1][var102 + 1];
						int var110 = field364[field320][var101][var102 + 1];
						if (var106 == 0) {
							YJJPWDQX var111 = field331.method37(var101, field320, var102);
							if (var111 != null) {
								int var112 = var111.field1419 >> 14 & 0x7FFF;
								if (var104 == 2) {
									var111.field1417 = new TGBMMCBD(var112, 2, var107, var110, var109, var108, false, var105 + 4, var99);
									var111.field1418 = new TGBMMCBD(var112, 2, var107, var110, var109, var108, false, var105 + 1 & 0x3, var99);
								} else {
									var111.field1417 = new TGBMMCBD(var112, var104, var107, var110, var109, var108, false, var105, var99);
								}
							}
						}

						if (var106 == 1) {
							XONZNVIF var113 = field331.method38(var102, var101, field320);
							if (var113 != null) {
								var113.field1409 = new TGBMMCBD(var113.field1410 >> 14 & 0x7FFF, 4, var107, var110, var109, var108, false, 0, var99);
							}
						}

						if (var106 == 2) {
							JZJYDTUF var114 = field331.method39(field320, var102, var101);

							if (var104 == 11) {
								var104 = 10;
							}

							if (var114 != null) {
								var114.field887 = new TGBMMCBD(var114.field895 >> 14 & 0x7FFF, var104, var107, var110, var109, var108, false, var105, var99);
							}
						}

						if (var106 == 3) {
							ZEVVFXPK var115 = field331.method40(var102, var101, field320);
							if (var115 != null) {
								var115.field1461 = new TGBMMCBD(var115.field1462 >> 14 & 0x7FFF, 22, var107, var110, var109, var108, false, var105, var99);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method140() {
		field396.method465();
		EDRGRMCC.field591 = field317;
		field242.method319(0, 0);

		if (field162 != -1) {
			method136(0, 0, AMSZZFWC.field63[field162], 0);
		} else if (field506[field298] != -1) {
			method136(0, 0, AMSZZFWC.field63[field506[field298]], 0);
		}

		if (field219 && field439 == 1) {
			method106();
		}

		field396.method466(field1027, 205, 553);
		field398.method465();
		EDRGRMCC.field591 = field318;
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method141(long arg0) {
		if (arg0 != 0L) {
			if (field452 >= 100) {
				method182("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = UMKVTRLP.method584(UMKVTRLP.method581(arg0));
				for (int var4 = 0; var4 < field452; var4++) {
					if (field180[var4] == arg0) {
						method182("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field494; var5++) {
					if (field438[var5] == arg0) {
						method182("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field180[field452++] = arg0;
				field473 = true;
				field299.method338(176);
				field299.method345(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(BLAMSZZFWC;)Z")
	public final boolean method142(AMSZZFWC arg0) {
		int var2 = arg0.field52;
		if (field495 == 2) {
			if (var2 == 201) {
				field482 = true;
				field214 = 0;
				field324 = true;
				field260 = "";
				field363 = 1;
				field197 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field482 = true;
				field214 = 0;
				field324 = true;
				field260 = "";
				field363 = 2;
				field197 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field232 = 250;
			return true;
		}

		if (var2 == 501) {
			field482 = true;
			field214 = 0;
			field324 = true;
			field260 = "";
			field363 = 4;
			field197 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field482 = true;
			field214 = 0;
			field324 = true;
			field260 = "";
			field363 = 5;
			field197 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field277[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = PJCTWSQI.field1075 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= PJCTWSQI.field1075) {
							var5 = 0;
						}
					}

					if (!PJCTWSQI.field1076[var5].field1082 && PJCTWSQI.field1076[var5].field1077 == var3 + (field205 ? 0 : 7)) {
						break;
					}
				}

				field277[var3] = var5;
				field194 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field174[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field519[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field519[var6].length) {
					var8 = 0;
				}
			}

			field174[var6] = var8;
			field194 = true;
		}

		if (var2 == 324 && !field205) {
			field205 = true;
			method174();
		}

		if (var2 == 325 && field205) {
			field205 = false;
			method174();
		}

		if (var2 == 326) {
			field299.method338(100);
			field299.method339(field205 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field299.method339(field277[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field299.method339(field174[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field508 = !field508;
		}

		if (var2 >= 601 && var2 <= 612) {
			method146();

			if (field293.length() > 0) {
				field299.method338(81);
				field299.method345(UMKVTRLP.method580(field293));
				field299.method339(var2 - 601);
				field299.method339(field508 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method143(int arg0) {
		int var2 = IYJSMCGP.field867[arg0].field875;
		if (var2 != 0) {
			int var3 = field257[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					EDRGRMCC.method232(0.9D);
				}

				if (var3 == 2) {
					EDRGRMCC.method232(0.8D);
				}

				if (var3 == 3) {
					EDRGRMCC.method232(0.7D);
				}

				if (var3 == 4) {
					EDRGRMCC.method232(0.6D);
				}

				FZACNING.field692.method568();
				field487 = true;
			}

			if (var2 == 3) {
				boolean var4 = field400;

				if (var3 == 0) {
					method109(field400, 0);
					field400 = true;
				}

				if (var3 == 1) {
					method109(field400, -400);
					field400 = true;
				}

				if (var3 == 2) {
					method109(field400, -800);
					field400 = true;
				}

				if (var3 == 3) {
					method109(field400, -1200);
					field400 = true;
				}

				if (var3 == 4) {
					field400 = false;
				}

				if (field400 != var4 && !field328) {
					if (field400) {
						field539 = field173;
						field540 = true;
						field211.method531(2, field539);
					} else {
						method125();
					}

					field213 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field391 = true;
					method126(0);
				}

				if (var3 == 1) {
					field391 = true;
					method126(-400);
				}

				if (var3 == 2) {
					field391 = true;
					method126(-800);
				}

				if (var3 == 3) {
					field391 = true;
					method126(-1200);
				}

				if (var3 == 4) {
					field391 = false;
				}
			}

			if (var2 == 5) {
				field559 = var3;
			}

			if (var2 == 6) {
				field454 = var3;
			}

			if (var2 == 8) {
				field196 = var3;
				field482 = true;
			}

			if (var2 == 9) {
				field493 = var3;
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method144(int arg0, int arg1) {
		JQOEJEDB var3 = field278[field320][arg0][arg1];
		if (var3 == null) {
			field331.method36(field320, arg0, arg1);
		} else {
			int var4 = -99999999;
			PMWLDMKW var5 = null;
			for (PMWLDMKW var6 = (PMWLDMKW) var3.method329(); var6 != null; var6 = (PMWLDMKW) var3.method331()) {
				FZACNING var7 = FZACNING.method278(var6.field1083);
				int var8 = var7.field674;
				if (var7.field689) {
					var8 = (var6.field1084 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method327(var5);
			PMWLDMKW var9 = null;
			PMWLDMKW var10 = null;
			for (PMWLDMKW var11 = (PMWLDMKW) var3.method329(); var11 != null; var11 = (PMWLDMKW) var3.method331()) {
				if (var5.field1083 != var11.field1083 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1083 != var11.field1083 && var9.field1083 != var11.field1083 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field331.method22(field320, var5, var12, method156(field320, arg0 * 128 + 64, arg1 * 128 + 64), arg1, arg0, var9, var10);
		}
	}

	@ObfuscatedName("client.a(IZI)Ljava/lang/String;")
	public static final String method145(int arg0, int arg1) {
		int var2 = arg0 - arg1;
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

	@ObfuscatedName("client.B(I)V")
	public final void method146() {
		field299.method338(194);

		if (field162 != -1) {
			field162 = -1;
			field473 = true;
			field288 = false;
			field380 = true;
		}

		if (field411 != -1) {
			field411 = -1;
			field482 = true;
			field288 = false;
		}

		field309 = -1;
	}

	@ObfuscatedName("client.n(B)V")
	public final void method147() {
		for (int var1 = 0; var1 < field547; var1++) {
			if (field402[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field280[var1] != field150 || field407[var1] != field484) {
						KHOMSBHW var3 = AWDRZEFD.method9(field280[var1], field407[var1]);
						if (System.currentTimeMillis() + var3.field934 / 22 > field332 / 22 + field319) {
							field332 = var3.field934;
							field319 = System.currentTimeMillis();

							if (method71(var3.field933, var3.field934)) {
								field150 = field280[var1];
								field484 = field407[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method120()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field402[var1] != -5) {
					field402[var1] = -5;
				} else {
					field547--;
					for (int var5 = var1; var5 < field547; var5++) {
						field280[var5] = field280[var5 + 1];
						field407[var5] = field407[var5 + 1];
						field402[var5] = field402[var5 + 1];
					}

					var1--;
				}
			} else {
				field402[var1]--;
			}
		}

		if (field213 > 0) {
			field213 -= 20;
			if (field213 < 0) {
				field213 = 0;
			}

			if (field213 == 0 && field400 && !field328) {
				field539 = field173;
				field540 = true;
				field211.method531(2, field539);
				return;
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.c(IILKHOMSBHW;)V")
	public final void method148(int arg0, KHOMSBHW arg1) {
		while (arg1.field935 + 21 < arg0 * 8) {
			int var3 = arg1.method360(14);
			if (var3 == 16383) {
				break;
			}

			if (field435[var3] == null) {
				field435[var3] = new FJJCITCO();
			}

			FJJCITCO var4 = field435[var3];
			field437[field436++] = var3;
			var4.field1329 = field420;
			int var5 = arg1.method360(1);
			int var6 = arg1.method360(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method360(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			var4.field650 = UGDYQAXI.method570(arg1.method360(12));
			int var8 = arg1.method360(1);
			if (var8 == 1) {
				field376[field375++] = var3;
			}

			var4.field1352 = var4.field650.field1299;
			var4.field1345 = var4.field650.field1318;
			var4.field1347 = var4.field650.field1306;
			var4.field1348 = var4.field650.field1307;
			var4.field1349 = var4.field650.field1315;
			var4.field1350 = var4.field650.field1297;
			var4.field1332 = var4.field650.field1295;
			var4.method577(field256.field1367[0] + var6, var5 == 1, field256.field1368[0] + var7);
		}

		arg1.method361();
	}

	@ObfuscatedName("client.b(LKHOMSBHW;II)V")
	public final void method149(KHOMSBHW arg0, int arg1) {
		for (int var3 = 0; var3 < field375; var3++) {
			int var4 = field376[var3];
			YNSPIQRH var5 = field372[var4];
			int var6 = arg0.method349();
			if ((var6 & 0x20) != 0) {
				var6 += arg0.method349() << 8;
			}

			method186(var6, arg0, var4, var5);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;III)LSYUGXMZF;")
	public final SYUGXMZF method150(String arg0, int arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field154[0] != null) {
				var6 = field154[0].method310(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field392.reset();
			field392.update(var6);
			int var8 = (int) field392.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new SYUGXMZF(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method70("Requesting " + arg0, arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method107(arg2 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				KHOMSBHW var16 = new KHOMSBHW(var15);
				var16.field934 = 3;
				int var17 = var16.method353() + 6;
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
						method70("Loading " + arg0 + " - " + var22 + "%", arg3);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field154[0] != null) {
						field154[0].method311(arg1, var6.length, var6);
					}
				} catch (Exception var28) {
					field154[0] = null;
				}

				if (var6 != null) {
					field392.reset();
					field392.update(var6);
					int var23 = (int) field392.getValue();
					if (arg4 != var23) {
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
						method70("Game updated - please reload page", arg3);
						var25 = 10;
					} else {
						method70(var11 + " - Retrying in " + var25, arg3);
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

				field558 = !field558;
			}
		}

		return new SYUGXMZF(var6);
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		ZAHKTBCG var10 = null;
		for (ZAHKTBCG var11 = (ZAHKTBCG) field193.method329(); var11 != null; var11 = (ZAHKTBCG) field193.method331()) {
			if (var11.field1452 == arg5 && var11.field1454 == arg6 && var11.field1455 == arg4 && var11.field1453 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new ZAHKTBCG();
			var10.field1452 = arg5;
			var10.field1453 = arg8;
			var10.field1454 = arg6;
			var10.field1455 = arg4;
			method207(var10);
			field193.method326(var10);
		}

		var10.field1446 = arg7;
		var10.field1448 = arg2;
		var10.field1447 = arg1;
		var10.field1456 = arg3;
		var10.field1457 = arg0;
	}

	@ObfuscatedName("client.a(BLGLPEJJEY;)V")
	public final void method152(GLPEJJEY arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field509.length; var3++) {
			field509[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field509[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field510[var9] = (field509[var9 - 1] + field509[var9 + 1] + field509[var9 - 128] + field509[var9 + 128]) / 4;
				}
			}

			int[] var10 = field509;
			field509 = field510;
			field510 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field789; var12++) {
				for (int var13 = 0; var13 < arg0.field788; var13++) {
					if (arg0.field786[var11++] != 0) {
						int var14 = var13 + arg0.field790 + 16;
						int var15 = var12 + arg0.field791 + 16;
						int var16 = (var15 << 7) + var14;
						field509[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LKHOMSBHW;BI)V")
	public final void method153(KHOMSBHW arg0, int arg1) {
		while (arg0.field935 + 10 < arg1 * 8) {
			int var3 = arg0.method360(11);
			if (var3 == 2047) {
				break;
			}

			if (field372[var3] == null) {
				field372[var3] = new YNSPIQRH();
				if (field377[var3] != null) {
					field372[var3].method593(field377[var3]);
				}
			}

			field374[field373++] = var3;
			YNSPIQRH var4 = field372[var3];
			var4.field1329 = field420;
			int var5 = arg0.method360(1);
			int var6 = arg0.method360(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method360(1);
			if (var7 == 1) {
				field376[field375++] = var3;
			}

			int var8 = arg0.method360(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method577(field256.field1367[0] + var6, var5 == 1, field256.field1368[0] + var8);
		}

		arg0.method361();
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method154(boolean arg0) {
		if (field256.field1326 >> 7 == field216 && field256.field1327 >> 7 == field217) {
			field216 = 0;
		}

		int var2 = field373;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			YNSPIQRH var4;
			int var5;
			if (arg0) {
				var4 = field256;
				var5 = field371 << 14;
			} else {
				var4 = field372[field374[var3]];
				var5 = field374[var3] << 14;
			}

			if (var4 != null && var4.method263()) {
				var4.field1445 = false;
				if ((field328 && field373 > 50 || field373 > 200) && !arg0 && var4.field1354 == var4.field1332) {
					var4.field1445 = true;
				}

				int var6 = var4.field1326 >> 7;
				int var7 = var4.field1327 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1429 == null || field420 < var4.field1439 || field420 >= var4.field1440) {
						if ((var4.field1326 & 0x7F) == 0x40 && (var4.field1327 & 0x7F) == 0x40) {
							if (field352[var6][var7] == field511) {
								continue;
							}

							field352[var6][var7] = field511;
						}

						var4.field1431 = method156(field320, var4.field1326, var4.field1327);
						field331.method26(var4.field1327, var4.field1431, var5, var4.field1328, field320, 60, var4.field1357, var4, var4.field1326);
					} else {
						var4.field1445 = false;
						var4.field1431 = method156(field320, var4.field1326, var4.field1327);
						field331.method27(var4.field1328, var4.field1435, var5, var4.field1431, 60, var4, var4.field1434, var4.field1327, var4.field1436, field320, var4.field1433, var4.field1326);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method155() {
		if (field399 == null) {
			method187();
			field1028 = null;
			field342 = null;
			field343 = null;
			field344 = null;
			field345 = null;
			field346 = null;
			field347 = null;
			field348 = null;
			field349 = null;
			field350 = null;
			field399 = new PFNLOREN(479, method192(), 96);
			field397 = new PFNLOREN(172, method192(), 156);
			OMVHXJFV.method418();
			field243.method319(0, 0);
			field396 = new PFNLOREN(190, method192(), 261);
			field398 = new PFNLOREN(512, method192(), 334);
			OMVHXJFV.method418();
			field208 = new PFNLOREN(496, method192(), 50);
			field209 = new PFNLOREN(269, method192(), 37);
			field210 = new PFNLOREN(249, method192(), 45);
			field487 = true;
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method156(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field406[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field364[var6][var4][var5] + field364[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field364[var6][var4][var5 + 1] + field364[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IILAMSZZFWC;)I")
	public final int method157(int arg0, AMSZZFWC arg1) {
		if (arg1.field17 == null || arg0 >= arg1.field17.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field17[arg0];
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
					var8 = field274[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field538[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field378[var3[var5++]];
				}

				if (var7 == 4) {
					AMSZZFWC var10 = AMSZZFWC.field63[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < FZACNING.field660 && (!FZACNING.method278(var11).field666 || field327)) {
						for (int var12 = 0; var12 < var10.field49.length; var12++) {
							if (var11 + 1 == var10.field49[var12]) {
								var8 += var10.field55[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field257[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field488[field538[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field257[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field256.field1422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < VLRCHEEU.field1381; var13++) {
						if (VLRCHEEU.field1383[var13]) {
							var8 += field538[var13];
						}
					}
				}

				if (var7 == 10) {
					AMSZZFWC var14 = AMSZZFWC.field63[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < FZACNING.field660 && (!FZACNING.method278(var15).field666 || field327)) {
						for (int var16 = 0; var16 < var14.field49.length; var16++) {
							if (var14.field49[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field169;
				}

				if (var7 == 12) {
					var8 = field447;
				}

				if (var7 == 13) {
					int var17 = field257[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					GAQBLBTP var20 = GAQBLBTP.field700[var19];
					int var21 = var20.field702;
					int var22 = var20.field703;
					int var23 = var20.field704;
					int var24 = field480[var23 - var22];
					var8 = field257[var21] >> var22 & var24;
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
					var8 = (field256.field1326 >> 7) + field489;
				}

				if (var7 == 19) {
					var8 = (field256.field1327 >> 7) + field490;
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

	@ObfuscatedName("client.D(I)V")
	public final void method158() {
		field522 = 0;
		int var1 = (field256.field1326 >> 7) + field489;
		int var2 = (field256.field1327 >> 7) + field490;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field522 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field522 = 1;
		}

		if (field522 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field522 = 0;
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method159() {
		signlink.reporterror = false;

		try {
			if (field199 != null) {
				field199.method398();
			}
		} catch (Exception var1) {
		}

		field199 = null;
		method125();

		if (field222 != null) {
			field222.field795 = false;
		}

		field222 = null;
		field211.method545();
		field211 = null;
		field434 = null;
		field299 = null;
		field520 = null;
		field389 = null;
		field284 = null;
		field419 = null;
		field289 = null;
		field285 = null;
		field286 = null;
		field364 = null;
		field406 = null;
		field331 = null;
		field412 = null;
		field250 = null;
		field200 = null;
		field409 = null;
		field410 = null;
		field459 = null;
		field396 = null;
		field397 = null;
		field398 = null;
		field399 = null;
		field208 = null;
		field209 = null;
		field210 = null;
		field354 = null;
		field355 = null;
		field356 = null;
		field357 = null;
		field358 = null;
		field359 = null;
		field360 = null;
		field361 = null;
		field362 = null;
		field242 = null;
		field243 = null;
		field244 = null;
		field334 = null;
		field335 = null;
		field336 = null;
		field207 = null;
		field223 = null;
		field224 = null;
		field225 = null;
		field226 = null;
		field227 = null;
		field381 = null;
		field382 = null;
		field383 = null;
		field384 = null;
		field385 = null;
		field526 = null;
		field239 = null;
		field498 = null;
		field290 = null;
		field514 = null;
		field515 = null;
		field516 = null;
		field517 = null;
		field518 = null;
		field425 = null;
		field542 = null;
		field352 = null;
		field372 = null;
		field374 = null;
		field376 = null;
		field377 = null;
		field156 = null;
		field435 = null;
		field437 = null;
		field278 = null;
		field193 = null;
		field321 = null;
		field329 = null;
		field245 = null;
		field246 = null;
		field247 = null;
		field248 = null;
		field283 = null;
		field257 = null;
		field465 = null;
		field466 = null;
		field541 = null;
		field218 = null;
		field448 = null;
		field438 = null;
		field530 = null;
		field345 = null;
		field346 = null;
		field342 = null;
		field343 = null;
		field344 = null;
		field347 = null;
		field348 = null;
		field349 = null;
		field350 = null;
		method187();
		RUJAIVBH.method509();
		UGDYQAXI.method573();
		FZACNING.method276();
		EPIGJXFD.field621 = null;
		PJCTWSQI.field1076 = null;
		AMSZZFWC.field63 = null;
		KCGYUXOB.field897 = null;
		EJHGNUGE.field604 = null;
		IDBAHLFM.field805 = null;
		IDBAHLFM.field817 = null;
		IYJSMCGP.field867 = null;
		field1028 = null;
		YNSPIQRH.field1430 = null;
		EDRGRMCC.method223();
		BGNYQYNO.method14();
		GEUHTGZJ.method281();
		QWCFKPFT.method502();
		System.gc();
	}

	@ObfuscatedName("client.a(ILUKUMCXZT;I)V")
	public final void method160(UKUMCXZT arg0, int arg1) {
		method161(arg0.field1327, arg0.field1326, arg1);
	}

	@ObfuscatedName("client.a(IBII)V")
	public final void method161(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method156(field320, arg1, arg0) - arg2;
			arg1 -= field263;
			var4 -= field264;
			arg0 -= field265;
			int var5 = GEUHTGZJ.field777[field266];
			int var6 = GEUHTGZJ.field778[field266];
			int var7 = GEUHTGZJ.field777[field267];
			int var8 = GEUHTGZJ.field778[field267];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field268 = (var9 << 9) / arg0 + EDRGRMCC.field585;
				field269 = (var11 << 9) / arg0 + EDRGRMCC.field586;
			} else {
				field268 = -1;
				field269 = -1;
			}
		} else {
			field268 = -1;
			field269 = -1;
		}
	}

	@ObfuscatedName("client.a(ILTNNDDWAZ;II)V")
	public final void method162(int arg0, TNNDDWAZ arg1, int arg2) {
		int var4 = field422 + field366 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = GEUHTGZJ.field777[var4];
			int var7 = GEUHTGZJ.field778[var4];
			var6 = var6 * 256 / (field177 + 256);
			var7 = var7 * 256 / (field177 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method564(field243, 83 - var9 - arg1.field1280 / 2 - 4, var8 + 94 - arg1.field1279 / 2 + 4);
			} else {
				arg1.method558(83 - var9 - arg1.field1280 / 2 - 4, var8 + 94 - arg1.field1279 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method163() {
		if (field163 == 2) {
			method161((field187 - field490 << 7) + field190, (field186 - field489 << 7) + field189, field188 * 2);

			if (field268 > -1 && field420 % 20 < 10) {
				field498[2].method558(field269 - 28, field268 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method164(boolean arg0) {
		method86();
		field344.method465();
		field536.method319(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field513 == 0) {
			int var4 = var3 / 2 + 80;
			field413.method249(field211.field1214, true, var2 / 2, var4, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field415.method249("Welcome to RuneScape", true, var2 / 2, var5, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field537.method319(var7 - 20, var6 - 73);
			field415.method249("New User", true, var6, var7 + 5, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field537.method319(var7 - 20, var8 - 73);
			field415.method249("Existing User", true, var8, var7 + 5, 0xFFFFFF);
		}

		if (field513 == 2) {
			int var9 = var3 / 2 - 40;
			if (field368.length() > 0) {
				field415.method249(field368, true, var2 / 2, var9 - 15, 0xFFFF00);
				field415.method249(field369, true, var2 / 2, var9, 0xFFFF00);
				var9 += 30;
			} else {
				field415.method249(field369, true, var2 / 2, var9 - 7, 0xFFFF00);
				var9 += 30;
			}

			field415.method256(0xFFFFFF, var9, true, var2 / 2 - 90, "Username: " + field281 + (field433 == 0 & field420 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field415.method256(0xFFFFFF, var9, true, var2 / 2 - 88, "Password: " + UMKVTRLP.method585(field282) + (field433 == 1 & field420 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field537.method319(var11 - 20, var10 - 73);
				field415.method249("Login", true, var10, var11 + 5, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field537.method319(var11 - 20, var12 - 73);
				field415.method249("Cancel", true, var12, var11 + 5, 0xFFFFFF);
			}
		}

		if (field513 == 3) {
			field415.method249("Create a free account", true, var2 / 2, var3 / 2 - 60, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field415.method249("To create a new account you need to", true, var2 / 2, var13, 0xFFFFFF);
			var13 += 15;
			field415.method249("go back to the main RuneScape webpage", true, var2 / 2, var13, 0xFFFFFF);
			var13 += 15;
			field415.method249("and choose the red 'create account'", true, var2 / 2, var13, 0xFFFFFF);
			var13 += 15;
			field415.method249("button at the top right of that page.", true, var2 / 2, var13, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field537.method319(var15 - 20, var14 - 73);
			field415.method249("Cancel", true, var14, var15 + 5, 0xFFFFFF);
		}

		field344.method466(field1027, 171, 202);

		if (field487) {
			field487 = false;
			field342.method466(field1027, 0, 128);
			field343.method466(field1027, 371, 202);
			field347.method466(field1027, 265, 0);
			field348.method466(field1027, 265, 562);
			field349.method466(field1027, 171, 128);
			field350.method466(field1027, 171, 562);
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method165(boolean arg0) {
		for (int var2 = 0; var2 < field436; var2++) {
			FJJCITCO var3 = field435[field437[var2]];
			int var4 = (field437[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method263() && var3.field650.field1313 == arg0) {
				int var5 = var3.field1326 >> 7;
				int var6 = var3.field1327 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1352 == 1 && (var3.field1326 & 0x7F) == 0x40 && (var3.field1327 & 0x7F) == 0x40) {
						if (field352[var5][var6] == field511) {
							continue;
						}

						field352[var5][var6] = field511;
					}

					if (!var3.field650.field1303) {
						var4 += Integer.MIN_VALUE;
					}

					field331.method26(var3.field1327, method156(field320, var3.field1326, var3.field1327), var4, var3.field1328, field320, (var3.field1352 - 1) * 64 + 60, var3.field1357, var3, var3.field1326);
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method166() {
		Graphics var1 = method192().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method413(1);

		if (field534) {
			field168 = false;
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

		if (field215) {
			field168 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field233) {
			field168 = false;
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

	@ObfuscatedName("client.b(IIII)I")
	public final int method167(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ILAMSZZFWC;IIIII)V")
	public final void method168(AMSZZFWC arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0.field33 == 0 && arg0.field19 != null && !arg0.field28 && (arg1 >= arg3 && arg4 >= arg2 && arg1 <= arg0.field41 + arg3 && arg4 <= arg0.field12 + arg2)) {
			int var7 = arg0.field19.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.field22[var8] + arg3;
				int var10 = arg0.field34[var8] + arg2 - arg5;
				AMSZZFWC var11 = AMSZZFWC.field63[arg0.field19[var8]];
				var9 += var11.field46;
				var10 += var11.field5;
				if ((var11.field30 >= 0 || var11.field64 != 0) && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field41 + var9 && arg4 < var11.field12 + var10) {
					if (var11.field30 >= 0) {
						field307 = var11.field30;
					} else {
						field307 = var11.field14;
					}
				}

				if (var11.field33 == 0) {
					method168(var11, arg1, var10, var9, arg4, var11.field47);

					if (var11.field62 > var11.field12) {
						method130(var11.field62, arg4, var10, var11.field12, var11.field41 + var9, var11, true, arg1);
					}
				} else {
					if (var11.field44 == 1 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field41 + var9 && arg4 < var11.field12 + var10) {
						boolean var12 = false;
						if (var11.field52 != 0) {
							var12 = method117(var11);
						}

						if (!var12) {
							field283[field476] = var11.field43;
							field247[field476] = 557;
							field246[field476] = var11.field14;
							field476++;
						}
					}

					if (var11.field44 == 2 && field270 == 0 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field41 + var9 && arg4 < var11.field12 + var10) {
						String var13 = var11.field51;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field283[field476] = var13 + " @gre@" + var11.field18;
						field247[field476] = 764;
						field246[field476] = var11.field14;
						field476++;
					}

					if (var11.field44 == 3 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field41 + var9 && arg4 < var11.field12 + var10) {
						field283[field476] = "Close";
						field247[field476] = 342;
						field246[field476] = var11.field14;
						field476++;
					}

					if (var11.field44 == 4 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field41 + var9 && arg4 < var11.field12 + var10) {
						field283[field476] = var11.field43;
						field247[field476] = 298;
						field246[field476] = var11.field14;
						field476++;
					}

					if (var11.field44 == 5 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field41 + var9 && arg4 < var11.field12 + var10) {
						field283[field476] = var11.field43;
						field247[field476] = 965;
						field246[field476] = var11.field14;
						field476++;
					}

					if (var11.field44 == 6 && !field288 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field41 + var9 && arg4 < var11.field12 + var10) {
						field283[field476] = var11.field43;
						field247[field476] = 513;
						field246[field476] = var11.field14;
						field476++;
					}

					if (var11.field33 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field12; var15++) {
							for (int var16 = 0; var16 < var11.field41; var16++) {
								int var17 = (var11.field57 + 32) * var16 + var9;
								int var18 = (var11.field66 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field29[var14];
									var18 += var11.field20[var14];
								}

								if (arg1 >= var17 && arg4 >= var18 && arg1 < var17 + 32 && arg4 < var18 + 32) {
									field393 = var14;
									field394 = var11.field14;

									if (var11.field49[var14] > 0) {
										FZACNING var19 = FZACNING.method278(var11.field49[var14] - 1);
										if (field157 == 1 && var11.field42) {
											if (field159 != var11.field14 || field158 != var14) {
												field283[field476] = "Use " + field161 + " with @lre@" + var19.field678;
												field247[field476] = 363;
												field248[field476] = var19.field661;
												field245[field476] = var14;
												field246[field476] = var11.field14;
												field476++;
											}
										} else if (field270 != 1 || !var11.field42) {
											if (var11.field42) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field682 != null && var19.field682[var20] != null) {
														field283[field476] = var19.field682[var20] + " @lre@" + var19.field678;

														if (var20 == 3) {
															field247[field476] = 265;
														}

														if (var20 == 4) {
															field247[field476] = 738;
														}

														field248[field476] = var19.field661;
														field245[field476] = var14;
														field246[field476] = var11.field14;
														field476++;
													} else if (var20 == 4) {
														field283[field476] = "Drop @lre@" + var19.field678;
														field247[field476] = 738;
														field248[field476] = var19.field661;
														field245[field476] = var14;
														field246[field476] = var11.field14;
														field476++;
													}
												}
											}

											if (var11.field31) {
												field283[field476] = "Use @lre@" + var19.field678;
												field247[field476] = 567;
												field248[field476] = var19.field661;
												field245[field476] = var14;
												field246[field476] = var11.field14;
												field476++;
											}

											if (var11.field42 && var19.field682 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field682[var21] != null) {
														field283[field476] = var19.field682[var21] + " @lre@" + var19.field678;

														if (var21 == 0) {
															field247[field476] = 212;
														}

														if (var21 == 1) {
															field247[field476] = 543;
														}

														if (var21 == 2) {
															field247[field476] = 506;
														}

														field248[field476] = var19.field661;
														field245[field476] = var14;
														field246[field476] = var11.field14;
														field476++;
													}
												}
											}

											if (var11.field45 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field45[var22] != null) {
														field283[field476] = var11.field45[var22] + " @lre@" + var19.field678;

														if (var22 == 0) {
															field247[field476] = 189;
														}

														if (var22 == 1) {
															field247[field476] = 454;
														}

														if (var22 == 2) {
															field247[field476] = 571;
														}

														if (var22 == 3) {
															field247[field476] = 853;
														}

														if (var22 == 4) {
															field247[field476] = 246;
														}

														field248[field476] = var19.field661;
														field245[field476] = var14;
														field246[field476] = var11.field14;
														field476++;
													}
												}
											}

											field283[field476] = "Examine @lre@" + var19.field678;
											field247[field476] = 1717;
											field248[field476] = var19.field661;
											field245[field476] = var14;
											field246[field476] = var11.field14;
											field476++;
										} else if ((field272 & 0x10) == 0x10) {
											field283[field476] = field273 + " @lre@" + var19.field678;
											field247[field476] = 964;
											field248[field476] = var19.field661;
											field245[field476] = var14;
											field246[field476] = var11.field14;
											field476++;
										}
									}
								}

								var14++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(I)V")
	public final void method169() {
		if (!field233 && !field534 && !field215) {
			field420++;

			if (field198) {
				method181();
			} else {
				method118();
			}

			method133();
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method170() {
		short var1 = 256;

		if (field427 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field427 > 768) {
					field467[var2] = method167(field468[var2], field469[var2], 1024 - field427);
				} else if (field427 > 256) {
					field467[var2] = field469[var2];
				} else {
					field467[var2] = method167(field469[var2], field468[var2], 256 - field427);
				}
			}
		} else if (field428 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field428 > 768) {
					field467[var3] = method167(field468[var3], field470[var3], 1024 - field428);
				} else if (field428 > 256) {
					field467[var3] = field470[var3];
				} else {
					field467[var3] = method167(field470[var3], field468[var3], 256 - field428);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field467[var4] = field468[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field345.field1069[var5] = field552.field1274[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field195[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field337[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field467[var12];
					int var15 = field345.field1069[var7];
					field345.field1069[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field345.method466(field1027, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field346.field1069[var16] = field553.field1274[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field195[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field337[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field467[var23];
					int var26 = field346.field1069[var18];
					field346.field1069[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field346.method466(field1027, 0, 637);
	}

	@ObfuscatedName("client.c(JI)V")
	public final void method171(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field494; var3++) {
				if (field438[var3] == arg0) {
					field494--;
					field473 = true;

					for (int var4 = var3; var4 < field494; var4++) {
						field448[var4] = field448[var4 + 1];
						field530[var4] = field530[var4 + 1];
						field438[var4] = field438[var4 + 1];
					}

					field299.method338(151);
					field299.method345(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILUGDYQAXI;Z)V")
	public final void method172(int arg0, int arg1, int arg2, UGDYQAXI arg3) {
		if (field476 < 400) {
			if (arg3.field1301 != null) {
				arg3 = arg3.method574();
			}

			if (arg3 != null && arg3.field1303) {
				String var5 = arg3.field1291;
				if (arg3.field1293 != 0) {
					var5 = var5 + method145(field256.field1422, arg3.field1293) + " (level-" + arg3.field1293 + ")";
				}

				if (field157 == 1) {
					field283[field476] = "Use " + field161 + " with @yel@" + var5;
					field247[field476] = 579;
					field248[field476] = arg1;
					field245[field476] = arg2;
					field246[field476] = arg0;
					field476++;
				} else if (field270 != 1) {
					if (arg3.field1324 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field1324[var6] != null && !arg3.field1324[var6].equalsIgnoreCase("attack")) {
								field283[field476] = arg3.field1324[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field247[field476] = 29;
								}

								if (var6 == 1) {
									field247[field476] = 784;
								}

								if (var6 == 2) {
									field247[field476] = 211;
								}

								if (var6 == 3) {
									field247[field476] = 322;
								}

								if (var6 == 4) {
									field247[field476] = 434;
								}

								field248[field476] = arg1;
								field245[field476] = arg2;
								field246[field476] = arg0;
								field476++;
							}
						}
					}

					if (arg3.field1324 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field1324[var7] != null && arg3.field1324[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field1293 > field256.field1422) {
									var8 = 2000;
								}

								field283[field476] = arg3.field1324[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field247[field476] = var8 + 29;
								}

								if (var7 == 1) {
									field247[field476] = var8 + 784;
								}

								if (var7 == 2) {
									field247[field476] = var8 + 211;
								}

								if (var7 == 3) {
									field247[field476] = var8 + 322;
								}

								if (var7 == 4) {
									field247[field476] = var8 + 434;
								}

								field248[field476] = arg1;
								field245[field476] = arg2;
								field246[field476] = arg0;
								field476++;
							}
						}
					}

					field283[field476] = "Examine @yel@" + var5;
					field247[field476] = 1119;
					field248[field476] = arg1;
					field245[field476] = arg2;
					field246[field476] = arg0;
					field476++;
				} else if ((field272 & 0x2) == 2) {
					field283[field476] = field273 + " @yel@" + var5;
					field247[field476] = 427;
					field248[field476] = arg1;
					field245[field476] = arg2;
					field246[field476] = arg0;
					field476++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public static final void method173() {
		BGNYQYNO.field75 = false;
		EDRGRMCC.field580 = false;
		field328 = false;
		PTERWXXU.field1100 = false;
		RUJAIVBH.field1173 = false;
	}

	@ObfuscatedName("client.p(B)V")
	public final void method174() {
		field194 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field277[var1] = -1;
			for (int var2 = 0; var2 < PJCTWSQI.field1075; var2++) {
				if (!PJCTWSQI.field1076[var2].field1082 && PJCTWSQI.field1076[var2].field1077 == var1 + (field205 ? 0 : 7)) {
					field277[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIIZI)Z")
	public final boolean method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field250[var14][var15] = 0;
				field200[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg6;
		field250[arg10][arg6] = 99;
		field200[arg10][arg6] = 0;
		byte var18 = 0;
		int var19 = 0;
		field409[var18] = arg10;
		int var35 = var18 + 1;
		field410[var18] = arg6;
		boolean var20 = false;
		int var21 = field409.length;
		int[][] var22 = field412[field320].field568;
		while (var35 != var19) {
			var16 = field409[var19];
			var17 = field410[var19];
			var19 = (var19 + 1) % var21;

			if (arg4 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field412[field320].method217(arg5, arg4, var17, arg1, arg0 - 1, var16)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field412[field320].method218(arg0 - 1, var17, arg4, var16, arg1, arg5)) {
					var20 = true;
					break;
				}
			}

			if (arg8 != 0 && arg3 != 0 && field412[field320].method219(arg2, arg3, var17, var16, arg8, arg4, arg1)) {
				var20 = true;
				break;
			}

			int var23 = field200[var16][var17] + 1;
			if (var16 > 0 && field250[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field409[var35] = var16 - 1;
				field410[var35] = var17;
				var35 = (var35 + 1) % var21;
				field250[var16 - 1][var17] = 2;
				field200[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field250[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field409[var35] = var16 + 1;
				field410[var35] = var17;
				var35 = (var35 + 1) % var21;
				field250[var16 + 1][var17] = 8;
				field200[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field250[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field409[var35] = var16;
				field410[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field250[var16][var17 - 1] = 1;
				field200[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field250[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field409[var35] = var16;
				field410[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field250[var16][var17 + 1] = 4;
				field200[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field250[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field409[var35] = var16 - 1;
				field410[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field250[var16 - 1][var17 - 1] = 3;
				field200[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field250[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field409[var35] = var16 + 1;
				field410[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field250[var16 + 1][var17 - 1] = 9;
				field200[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field250[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field409[var35] = var16 - 1;
				field410[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field250[var16 - 1][var17 + 1] = 6;
				field200[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field250[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field409[var35] = var16 + 1;
				field410[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field250[var16 + 1][var17 + 1] = 12;
				field200[var16 + 1][var17 + 1] = var23;
			}
		}

		field456 = 0;
		if (!var20) {
			if (arg9) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg4 - var25; var26 <= arg4 + var25; var26++) {
						for (int var27 = arg1 - var25; var27 <= arg1 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field200[var26][var27] < var24) {
								var24 = field200[var26][var27];
								var16 = var26;
								var17 = var27;
								field456 = 1;
								var20 = true;
							}
						}
					}

					if (var20) {
						break;
					}
				}
			}

			if (!var20) {
				return false;
			}
		}

		byte var28 = 0;
		field409[var28] = var16;
		int var36 = var28 + 1;
		field410[var28] = var17;
		int var29;
		int var30 = var29 = field250[var16][var17];
		while (arg10 != var16 || arg6 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field409[var36] = var16;
				field410[var36++] = var17;
			}

			if ((var30 & 0x2) != 0) {
				var16++;
			} else if ((var30 & 0x8) != 0) {
				var16--;
			}

			if ((var30 & 0x1) != 0) {
				var17++;
			} else if ((var30 & 0x4) != 0) {
				var17--;
			}

			var30 = field250[var16][var17];
		}

		if (var36 <= 0) {
			if (arg7 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field409[var36];
		int var33 = field410[var36];

		if ((var31 & 0x3) == 0) {
			field548++;
		}

		if (field548 >= 144) {
			field299.method338(209);
			field548 = 0;
		}

		if (arg7 == 0) {
			field299.method338(2);
			field299.method339(var31 + var31 + 3);
		}

		if (arg7 == 1) {
			field299.method338(36);
			field299.method339(var31 + var31 + 3 + 14);
		}

		if (arg7 == 2) {
			field299.method338(213);
			field299.method339(var31 + var31 + 3);
		}

		field299.method375(field490 + var33);
		field216 = field409[0];
		field217 = field410[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field299.method366(field409[var36] - var32);
			field299.method365(field410[var36] - var33);
		}

		field299.method367(field1045[5] == 1 ? 1 : 0);
		field299.method340(field489 + var32);
		return true;
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method176(int arg0) {
		if (arg0 >= 0) {
			if (field214 != 0) {
				field214 = 0;
				field482 = true;
			}

			int var2 = field245[arg0];
			int var3 = field246[arg0];
			int var4 = field247[arg0];
			int var5 = field248[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 1717) {
				FZACNING var6 = FZACNING.method278(var5);
				AMSZZFWC var7 = AMSZZFWC.field63[var3];
				String var8;
				if (var7 != null && var7.field55[var2] >= 100000) {
					var8 = var7.field55[var2] + " x " + var6.field678;
				} else if (var6.field683 == null) {
					var8 = "It's a " + var6.field678 + ".";
				} else {
					var8 = new String(var6.field683);
				}

				method182("", 0, var8);
			}

			if (var4 == 738) {
				field299.method338(157);
				field299.method374(var3);
				field299.method340(var5);
				field299.method340(var2);
				field460 = 0;
				field461 = var3;
				field462 = var2;
				field463 = 2;
				if (AMSZZFWC.field63[var3].field6 == field309) {
					field463 = 1;
				}

				if (AMSZZFWC.field63[var3].field6 == field411) {
					field463 = 3;
				}
			}

			if (var4 == 971) {
				boolean var9 = method175(0, var3, 0, 0, var2, 0, field256.field1368[0], 2, 0, false, field256.field1367[0]);
				if (!var9) {
					method175(0, var3, 0, 1, var2, 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
				}

				field251 = field1042;
				field252 = field1043;
				field254 = 2;
				field253 = 0;
				field299.method338(55);
				field299.method374(field490 + var3);
				field299.method374(var5);
				field299.method374(field489 + var2);
			}

			if (var4 == 571) {
				field455++;
				if (field455 >= 68) {
					field299.method338(166);
					field299.method339(35);
					field455 = 0;
				}

				field299.method338(219);
				field299.method340(var3);
				field299.method376(var2);
				field299.method340(var5);
				field460 = 0;
				field461 = var3;
				field462 = var2;
				field463 = 2;
				if (AMSZZFWC.field63[var3].field6 == field309) {
					field463 = 1;
				}

				if (AMSZZFWC.field63[var3].field6 == field411) {
					field463 = 3;
				}
			}

			if (var4 == 39) {
				YNSPIQRH var11 = field372[var5];
				if (var11 != null) {
					method175(0, var11.field1368[0], 0, 1, var11.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
					field251 = field1042;
					field252 = field1043;
					field254 = 2;
					field253 = 0;
					field299.method338(207);
					field299.method376(field158);
					field299.method375(field159);
					field299.method376(var5);
					field299.method376(field160);
				}
			}

			if (var4 == 350) {
				method177(var5, var3, var2);
				field299.method338(107);
				field299.method376(var5 >> 14 & 0x7FFF);
				field299.method376(field489 + var2);
				field299.method375(field490 + var3);
			}

			if (var4 == 648) {
				method177(var5, var3, var2);
				field299.method338(20);
				field299.method340(field489 + var2);
				field299.method376(field490 + var3);
				field299.method340(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 368) {
				YNSPIQRH var12 = field372[var5];
				if (var12 != null) {
					method175(0, var12.field1368[0], 0, 1, var12.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
					field251 = field1042;
					field252 = field1043;
					field254 = 2;
					field253 = 0;
					field299.method338(246);
					field299.method375(field271);
					field299.method340(var5);
				}
			}

			if (var4 == 567) {
				field157 = 1;
				field158 = var2;
				field159 = var3;
				field160 = var5;
				field161 = FZACNING.method278(var5).field678;
				field270 = 0;
				field473 = true;
			} else {
				if (var4 == 965) {
					field299.method338(172);
					field299.method340(var3);
					AMSZZFWC var13 = AMSZZFWC.field63[var3];
					if (var13.field17 != null && var13.field17[0][0] == 5) {
						int var14 = var13.field17[0][1];
						if (field257[var14] != var13.field4[0]) {
							field257[var14] = var13.field4[0];
							method143(var14);
							field473 = true;
						}
					}
				}

				if (var4 == 964) {
					field299.method338(212);
					field299.method376(var5);
					field299.method375(var3);
					field299.method340(var2);
					field299.method375(field271);
					field460 = 0;
					field461 = var3;
					field462 = var2;
					field463 = 2;
					if (AMSZZFWC.field63[var3].field6 == field309) {
						field463 = 1;
					}

					if (AMSZZFWC.field63[var3].field6 == field411) {
						field463 = 3;
					}
				}

				if (var4 == 434) {
					FJJCITCO var15 = field435[var5];
					if (var15 != null) {
						method175(0, var15.field1368[0], 0, 1, var15.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
						field251 = field1042;
						field252 = field1043;
						field254 = 2;
						field253 = 0;
						field299.method338(237);
						field299.method374(var5);
					}
				}

				if (var4 == 983 || var4 == 616 || var4 == 940 || var4 == 172) {
					String var16 = field283[arg0];
					int var17 = var16.indexOf("@whi@");
					if (var17 != -1) {
						long var18 = UMKVTRLP.method580(var16.substring(var17 + 5).trim());
						if (var4 == 983) {
							method121(var18);
						}

						if (var4 == 616) {
							method141(var18);
						}

						if (var4 == 940) {
							method171(var18);
						}

						if (var4 == 172) {
							method88(var18);
						}
					}
				}

				if (var4 == 1015) {
					FZACNING var20 = FZACNING.method278(var5);
					String var21;
					if (var20.field683 == null) {
						var21 = "It's a " + var20.field678 + ".";
					} else {
						var21 = new String(var20.field683);
					}

					method182("", 0, var21);
				}

				if (var4 == 92) {
					YNSPIQRH var22 = field372[var5];
					if (var22 != null) {
						method175(0, var22.field1368[0], 0, 1, var22.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
						field251 = field1042;
						field252 = field1043;
						field254 = 2;
						field253 = 0;
						field299.method338(61);
						field299.method376(var5);
					}
				}

				if (var4 == 29) {
					FJJCITCO var23 = field435[var5];
					if (var23 != null) {
						method175(0, var23.field1368[0], 0, 1, var23.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
						field251 = field1042;
						field252 = field1043;
						field254 = 2;
						field253 = 0;
						field299.method338(88);
						field299.method375(var5);
					}
				}

				if (var4 == 246) {
					field532++;
					if (field532 >= 145) {
						field299.method338(231);
						field299.method343(0);
						field532 = 0;
					}

					field299.method338(12);
					field299.method340(var5);
					field299.method374(var2);
					field299.method375(var3);
					field460 = 0;
					field461 = var3;
					field462 = var2;
					field463 = 2;
					if (AMSZZFWC.field63[var3].field6 == field309) {
						field463 = 1;
					}

					if (AMSZZFWC.field63[var3].field6 == field411) {
						field463 = 3;
					}
				}

				if (var4 == 139) {
					boolean var24 = method175(0, var3, 0, 0, var2, 0, field256.field1368[0], 2, 0, false, field256.field1367[0]);
					if (!var24) {
						method175(0, var3, 0, 1, var2, 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
					}

					field251 = field1042;
					field252 = field1043;
					field254 = 2;
					field253 = 0;
					field299.method338(199);
					field299.method374(field489 + var2);
					field299.method376(field490 + var3);
					field299.method376(field271);
					field299.method375(var5);
				}

				if (var4 == 207) {
					String var26 = field283[arg0];
					int var27 = var26.indexOf("@whi@");
					if (var27 != -1) {
						long var28 = UMKVTRLP.method580(var26.substring(var27 + 5).trim());
						int var30 = -1;
						for (int var31 = 0; var31 < field494; var31++) {
							if (field438[var31] == var28) {
								var30 = var31;
								break;
							}
						}

						if (var30 != -1 && field530[var30] > 0) {
							field482 = true;
							field214 = 0;
							field324 = true;
							field260 = "";
							field363 = 3;
							field275 = field438[var30];
							field197 = "Enter message to send to " + field448[var30];
						}
					}
				}

				if (var4 == 972) {
					boolean var32 = method175(0, var3, 0, 0, var2, 0, field256.field1368[0], 2, 0, false, field256.field1367[0]);
					if (!var32) {
						method175(0, var3, 0, 1, var2, 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
					}

					field251 = field1042;
					field252 = field1043;
					field254 = 2;
					field253 = 0;
					field299.method338(34);
					field299.method374(var5);
					field299.method374(field489 + var2);
					field299.method375(field490 + var3);
				}

				if (var4 == 557) {
					AMSZZFWC var34 = AMSZZFWC.field63[var3];
					boolean var35 = true;
					if (var34.field52 > 0) {
						var35 = method142(var34);
					}

					if (var35) {
						field299.method338(172);
						field299.method340(var3);
					}
				}

				if (var4 == 427) {
					FJJCITCO var36 = field435[var5];
					if (var36 != null) {
						method175(0, var36.field1368[0], 0, 1, var36.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
						field251 = field1042;
						field252 = field1043;
						field254 = 2;
						field253 = 0;
						field299.method338(18);
						field299.method375(field271);
						field299.method374(var5);
					}
				}

				if (var4 == 516) {
					YNSPIQRH var37 = field372[var5];
					if (var37 != null) {
						method175(0, var37.field1368[0], 0, 1, var37.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
						field251 = field1042;
						field252 = field1043;
						field254 = 2;
						field253 = 0;
						field299.method338(49);
						field299.method340(var5);
					}
				}

				if (var4 == 583) {
					boolean var38 = method175(0, var3, 0, 0, var2, 0, field256.field1368[0], 2, 0, false, field256.field1367[0]);
					if (!var38) {
						method175(0, var3, 0, 1, var2, 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
					}

					field251 = field1042;
					field252 = field1043;
					field254 = 2;
					field253 = 0;
					field299.method338(101);
					field299.method340(field489 + var2);
					field299.method376(field490 + var3);
					field299.method374(var5);
				}

				if (var4 == 860) {
					YNSPIQRH var40 = field372[var5];
					if (var40 != null) {
						method175(0, var40.field1368[0], 0, 1, var40.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
						field251 = field1042;
						field252 = field1043;
						field254 = 2;
						field253 = 0;
						field299.method338(69);
						field299.method375(var5);
					}
				}

				if (var4 == 766) {
					boolean var41 = method175(0, var3, 0, 0, var2, 0, field256.field1368[0], 2, 0, false, field256.field1367[0]);
					if (!var41) {
						method175(0, var3, 0, 1, var2, 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
					}

					field251 = field1042;
					field252 = field1043;
					field254 = 2;
					field253 = 0;
					field299.method338(150);
					field299.method374(field489 + var2);
					field299.method375(field490 + var3);
					field299.method374(var5);
				}

				if (var4 == 1736) {
					method177(var5, var3, var2);
					field299.method338(15);
					field299.method340(field489 + var2);
					field299.method375(var5 >> 14 & 0x7FFF);
					field299.method374(field490 + var3);
				}

				if (var4 == 475 && method177(var5, var3, var2)) {
					field299.method338(7);
					field299.method340(field490 + var3);
					field299.method340(var5 >> 14 & 0x7FFF);
					field299.method375(field271);
					field299.method376(field489 + var2);
				}

				if (var4 == 341) {
					method177(var5, var3, var2);
					field299.method338(39);
					field299.method375(field489 + var2);
					field299.method375(var5 >> 14 & 0x7FFF);
					field299.method376(field490 + var3);
				}

				if (var4 == 784) {
					FJJCITCO var43 = field435[var5];
					if (var43 != null) {
						method175(0, var43.field1368[0], 0, 1, var43.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
						field251 = field1042;
						field252 = field1043;
						field254 = 2;
						field253 = 0;
						field185 += var5;
						if (field185 >= 149) {
							field299.method338(248);
							field185 = 0;
						}

						field299.method338(162);
						field299.method376(var5);
					}
				}

				if (var4 == 939) {
					YNSPIQRH var44 = field372[var5];
					if (var44 != null) {
						method175(0, var44.field1368[0], 0, 1, var44.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
						field251 = field1042;
						field252 = field1043;
						field254 = 2;
						field253 = 0;
						field432 += var5;
						if (field432 >= 91) {
							field299.method338(206);
							field299.method340(40779);
							field432 = 0;
						}

						field299.method338(89);
						field299.method340(var5);
					}
				}

				if (var4 == 261) {
					boolean var45 = method175(0, var3, 0, 0, var2, 0, field256.field1368[0], 2, 0, false, field256.field1367[0]);
					if (!var45) {
						method175(0, var3, 0, 1, var2, 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
					}

					field251 = field1042;
					field252 = field1043;
					field254 = 2;
					field253 = 0;
					field299.method338(45);
					field299.method340(field489 + var2);
					field299.method375(var5);
					field299.method374(field490 + var3);
				}

				if (var4 == 298) {
					field299.method338(172);
					field299.method340(var3);
					AMSZZFWC var47 = AMSZZFWC.field63[var3];
					if (var47.field17 != null && var47.field17[0][0] == 5) {
						int var48 = var47.field17[0][1];
						field257[var48] = 1 - field257[var48];
						method143(var48);
						field473 = true;
					}
				}

				if (var4 == 853) {
					field299.method338(33);
					field299.method340(var3);
					field299.method375(var5);
					field299.method376(var2);
					field460 = 0;
					field461 = var3;
					field462 = var2;
					field463 = 2;
					if (AMSZZFWC.field63[var3].field6 == field309) {
						field463 = 1;
					}

					if (AMSZZFWC.field63[var3].field6 == field411) {
						field463 = 3;
					}
				}

				if (var4 == 451) {
					if (field219) {
						field331.method53(var3 - 4, var2 - 4);
					} else {
						field331.method53(field1043 - 4, field1042 - 4);
					}
				}

				if (var4 == 363) {
					field299.method338(254);
					field299.method375(field158);
					field299.method375(var3);
					field299.method375(field159);
					field299.method375(var5);
					field299.method340(var2);
					field299.method340(field160);
					field460 = 0;
					field461 = var3;
					field462 = var2;
					field463 = 2;
					if (AMSZZFWC.field63[var3].field6 == field309) {
						field463 = 1;
					}

					if (AMSZZFWC.field63[var3].field6 == field411) {
						field463 = 3;
					}
				}

				if (var4 == 1119) {
					FJJCITCO var49 = field435[var5];
					if (var49 != null) {
						UGDYQAXI var50 = var49.field650;
						if (var50.field1301 != null) {
							var50 = var50.method574();
						}

						if (var50 != null) {
							String var51;
							if (var50.field1314 == null) {
								var51 = "It's a " + var50.field1291 + ".";
							} else {
								var51 = new String(var50.field1314);
							}

							method182("", 0, var51);
						}
					}
				}

				if (var4 == 858) {
					boolean var52 = method175(0, var3, 0, 0, var2, 0, field256.field1368[0], 2, 0, false, field256.field1367[0]);
					if (!var52) {
						method175(0, var3, 0, 1, var2, 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
					}

					field251 = field1042;
					field252 = field1043;
					field254 = 2;
					field253 = 0;
					field299.method338(4);
					field299.method374(field489 + var2);
					field299.method376(field159);
					field299.method374(field490 + var3);
					field299.method374(var5);
					field299.method376(field158);
					field299.method374(field160);
				}

				if (var4 == 764) {
					AMSZZFWC var54 = AMSZZFWC.field63[var3];
					field270 = 1;
					field271 = var3;
					field272 = var54.field16;
					field157 = 0;
					field473 = true;
					String var55 = var54.field51;
					if (var55.indexOf(" ") != -1) {
						var55 = var55.substring(0, var55.indexOf(" "));
					}

					String var56 = var54.field51;
					if (var56.indexOf(" ") != -1) {
						var56 = var56.substring(var56.indexOf(" ") + 1);
					}

					field273 = var55 + " " + var54.field18 + " " + var56;

					if (field272 == 16) {
						field473 = true;
						field298 = 3;
						field380 = true;
					}
				} else {
					if (var4 == 265) {
						field557 += var5;
						if (field557 >= 91) {
							field299.method338(24);
							field557 = 0;
						}

						field299.method338(163);
						field299.method340(var5);
						field299.method375(var2);
						field299.method375(var3);
						field460 = 0;
						field461 = var3;
						field462 = var2;
						field463 = 2;
						if (AMSZZFWC.field63[var3].field6 == field309) {
							field463 = 1;
						}

						if (AMSZZFWC.field63[var3].field6 == field411) {
							field463 = 3;
						}
					}

					if (var4 == 910 && method177(var5, var3, var2)) {
						field299.method338(174);
						field299.method376(field489 + var2);
						field299.method375(field159);
						field299.method374(field490 + var3);
						field299.method340(field160);
						field299.method375(var5 >> 14 & 0x7FFF);
						field299.method376(field158);
					}

					if (var4 == 988) {
						method177(var5, var3, var2);
						field299.method338(56);
						field299.method376(field490 + var3);
						field299.method375(var5 >> 14 & 0x7FFF);
						field299.method375(field489 + var2);
					}

					if (var4 == 506) {
						field351++;
						if (field351 >= 78) {
							field299.method338(251);
							field299.method343(0);
							field351 = 0;
						}

						field299.method338(205);
						field299.method340(var3);
						field299.method374(var5);
						field299.method374(var2);
						field460 = 0;
						field461 = var3;
						field462 = var2;
						field463 = 2;
						if (AMSZZFWC.field63[var3].field6 == field309) {
							field463 = 1;
						}

						if (AMSZZFWC.field63[var3].field6 == field411) {
							field463 = 3;
						}
					}

					if (var4 == 342) {
						method146();
					}

					if (var4 == 872) {
						String var57 = field283[arg0];
						int var58 = var57.indexOf("@whi@");
						if (var58 != -1) {
							if (field309 == -1) {
								method146();
								field293 = var57.substring(var58 + 5).trim();
								field508 = false;

								for (int var59 = 0; var59 < AMSZZFWC.field63.length; var59++) {
									if (AMSZZFWC.field63[var59] != null && AMSZZFWC.field63[var59].field52 == 600) {
										field308 = field309 = AMSZZFWC.field63[var59].field6;
										break;
									}
								}
							} else {
								method182("", 0, "Please close the interface you have open before using 'report abuse'");
							}
						}
					}

					if (var4 == 579) {
						FJJCITCO var60 = field435[var5];
						if (var60 != null) {
							method175(0, var60.field1368[0], 0, 1, var60.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
							field251 = field1042;
							field252 = field1043;
							field254 = 2;
							field253 = 0;
							field299.method338(110);
							field299.method376(field160);
							field299.method374(field159);
							field299.method340(field158);
							field299.method375(var5);
						}
					}

					if (var4 == 513 && !field288) {
						field299.method338(146);
						field299.method340(var3);
						field288 = true;
					}

					if (var4 == 454) {
						field299.method338(222);
						field299.method340(var3);
						field299.method375(var2);
						field299.method374(var5);
						field460 = 0;
						field461 = var3;
						field462 = var2;
						field463 = 2;
						if (AMSZZFWC.field63[var3].field6 == field309) {
							field463 = 1;
						}

						if (AMSZZFWC.field63[var3].field6 == field411) {
							field463 = 3;
						}
					}

					if (var4 == 765 || var4 == 924) {
						String var61 = field283[arg0];
						int var62 = var61.indexOf("@whi@");
						if (var62 != -1) {
							var61 = var61.substring(var62 + 5).trim();
							String var63 = UMKVTRLP.method584(UMKVTRLP.method581(UMKVTRLP.method580(var61)));
							boolean var64 = false;
							for (int var65 = 0; var65 < field373; var65++) {
								YNSPIQRH var66 = field372[field374[var65]];
								if (var66 != null && var66.field1437 != null && var66.field1437.equalsIgnoreCase(var63)) {
									method175(0, var66.field1368[0], 0, 1, var66.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);

									if (var4 == 765) {
										field299.method338(69);
										field299.method375(field374[var65]);
									}

									if (var4 == 924) {
										field556 += var5;
										if (field556 >= 101) {
											field299.method338(14);
											field299.method342(0x8995A6);
											field556 = 0;
										}

										field299.method338(26);
										field299.method376(field374[var65]);
									}

									var64 = true;
									break;
								}
							}

							if (!var64) {
								method182("", 0, "Unable to find " + var63);
							}
						}
					}

					if (var4 == 543) {
						field299.method338(112);
						field299.method375(var3);
						field299.method374(var2);
						field299.method375(var5);
						field460 = 0;
						field461 = var3;
						field462 = var2;
						field463 = 2;
						if (AMSZZFWC.field63[var3].field6 == field309) {
							field463 = 1;
						}

						if (AMSZZFWC.field63[var3].field6 == field411) {
							field463 = 3;
						}
					}

					if (var4 == 1720) {
						int var67 = var5 >> 14 & 0x7FFF;
						RUJAIVBH var68 = RUJAIVBH.method512(var67);
						String var69;
						if (var68.field1159 == null) {
							var69 = "It's a " + var68.field1157 + ".";
						} else {
							var69 = new String(var68.field1159);
						}

						method182("", 0, var69);
					}

					if (var4 == 322) {
						FJJCITCO var70 = field435[var5];
						if (var70 != null) {
							method175(0, var70.field1368[0], 0, 1, var70.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
							field251 = field1042;
							field252 = field1043;
							field254 = 2;
							field253 = 0;
							field299.method338(141);
							field299.method376(var5);
						}
					}

					if (var4 == 211) {
						FJJCITCO var71 = field435[var5];
						if (var71 != null) {
							method175(0, var71.field1368[0], 0, 1, var71.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
							field251 = field1042;
							field252 = field1043;
							field254 = 2;
							field253 = 0;
							field299.method338(51);
							field299.method340(var5);
						}
					}

					if (var4 == 509) {
						YNSPIQRH var72 = field372[var5];
						if (var72 != null) {
							method175(0, var72.field1368[0], 0, 1, var72.field1367[0], 0, field256.field1368[0], 2, 1, false, field256.field1367[0]);
							field251 = field1042;
							field252 = field1043;
							field254 = 2;
							field253 = 0;
							field556 += var5;
							if (field556 >= 101) {
								field299.method338(14);
								field299.method342(0x8995A6);
								field556 = 0;
							}

							field299.method338(26);
							field299.method376(var5);
						}
					}

					if (var4 == 189) {
						field299.method338(16);
						field299.method374(var2);
						field299.method376(var3);
						field299.method340(var5);
						field460 = 0;
						field461 = var3;
						field462 = var2;
						field463 = 2;
						if (AMSZZFWC.field63[var3].field6 == field309) {
							field463 = 1;
						}

						if (AMSZZFWC.field63[var3].field6 == field411) {
							field463 = 3;
						}
					}

					if (var4 == 212) {
						field299.method338(28);
						field299.method374(var2);
						field299.method376(var5);
						field299.method374(var3);
						field460 = 0;
						field461 = var3;
						field462 = var2;
						field463 = 2;
						if (AMSZZFWC.field63[var3].field6 == field309) {
							field463 = 1;
						}

						if (AMSZZFWC.field63[var3].field6 == field411) {
							field463 = 3;
						}
					}

					field157 = 0;
					field270 = 0;
					field473 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IIII)Z")
	public final boolean method177(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field331.method45(field320, arg2, arg1, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			RUJAIVBH var8 = RUJAIVBH.method512(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1174;
				var10 = var8.field1180;
			} else {
				var9 = var8.field1180;
				var10 = var8.field1174;
			}

			int var11 = var8.field1142;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method175(0, arg1, var11, var10, arg2, 0, field256.field1368[0], 2, var9, false, field256.field1367[0]);
		} else {
			method175(var6 + 1, arg1, 0, 0, arg2, var7, field256.field1368[0], 2, 0, false, field256.field1367[0]);
		}

		field251 = field1042;
		field252 = field1043;
		field254 = 2;
		field253 = 0;
		return true;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method178() {
		field138 = 0;
		for (int var1 = -1; var1 < field436 + field373; var1++) {
			UKUMCXZT var2;
			if (var1 == -1) {
				var2 = field256;
			} else if (var1 < field373) {
				var2 = field372[field374[var1]];
			} else {
				var2 = field435[field437[var1 - field373]];
			}

			if (var2 != null && var2.method263()) {
				if (var2 instanceof FJJCITCO) {
					UGDYQAXI var3 = ((FJJCITCO) var2).field650;
					if (var3.field1301 != null) {
						var3 = var3.method574();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field373) {
					UGDYQAXI var7 = ((FJJCITCO) var2).field650;
					if (var7.field1304 >= 0 && var7.field1304 < field498.length) {
						method160(var2, var2.field1353 + 15);

						if (field268 > -1) {
							field498[var7.field1304].method558(field269 - 30, field268 - 12);
						}
					}

					if (field163 == 1 && field437[var1 - field373] == field175 && field420 % 20 < 10) {
						method160(var2, var2.field1353 + 15);

						if (field268 > -1) {
							field498[2].method558(field269 - 28, field268 - 12);
						}
					}
				} else {
					int var4 = 30;
					YNSPIQRH var5 = (YNSPIQRH) var2;
					if (var5.field1421 != 0) {
						method160(var2, var2.field1353 + 15);

						if (field268 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field1421 & 1 << var6) != 0) {
									field498[var6].method558(field269 - var4, field268 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field163 == 10 && field374[var1] == field170) {
						method160(var2, var2.field1353 + 15);

						if (field268 > -1) {
							field498[7].method558(field269 - var4, field268 - 12);
						}
					}
				}

				if (var2.field1331 != null && (var1 >= field373 || field525 == 0 || field525 == 3 || field525 == 1 && method135(((YNSPIQRH) var2).field1437))) {
					method160(var2, var2.field1353);

					if (field268 > -1 && field138 < field139) {
						field143[field138] = field415.method251(var2.field1331) / 2;
						field142[field138] = field415.field639;
						field140[field138] = field268;
						field141[field138] = field269;
						field144[field138] = var2.field1375;
						field145[field138] = var2.field1351;
						field146[field138] = var2.field1335;
						field147[field138++] = var2.field1331;

						if (field454 == 0 && var2.field1351 >= 1 && var2.field1351 <= 3) {
							field142[field138] += 10;
							field141[field138] += 5;
						}

						if (field454 == 0 && var2.field1351 == 4) {
							field143[field138] = 60;
						}

						if (field454 == 0 && var2.field1351 == 5) {
							field142[field138] += 5;
						}
					}
				}

				if (var2.field1336 > field420) {
					method160(var2, var2.field1353 + 15);

					if (field268 > -1) {
						int var8 = var2.field1337 * 30 / var2.field1338;
						if (var8 > 30) {
							var8 = 30;
						}

						OMVHXJFV.method420(field268 - 15, 0xFF00, 5, var8, field269 - 3);
						OMVHXJFV.method420(field268 + var8 - 15, 0xFF0000, 5, 30 - var8, field269 - 3);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1378[var9] > field420) {
						method160(var2, var2.field1353 / 2);

						if (field268 > -1) {
							if (var9 == 1) {
								field269 -= 20;
							}

							if (var9 == 2) {
								field268 -= 15;
								field269 -= 10;
							}

							if (var9 == 3) {
								field268 += 15;
								field269 -= 10;
							}

							field239[var2.field1377[var9]].method558(field269 - 12, field268 - 12);
							field413.method248(field269 + 4, String.valueOf(var2.field1376[var9]), field268, 0);
							field413.method248(field269 + 3, String.valueOf(var2.field1376[var9]), field268 - 1, 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field138; var10++) {
			int var11 = field140[var10];
			int var12 = field141[var10];
			int var13 = field143[var10];
			int var14 = field142[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field141[var16] - field142[var16] && var12 - var14 < field141[var16] + 2 && var11 - var13 < field143[var16] + field140[var16] && var11 + var13 > field140[var16] - field143[var16] && field141[var16] - field142[var16] < var12) {
						var12 = field141[var16] - field142[var16];
						var15 = true;
					}
				}
			}

			field268 = field140[var10];
			field269 = field141[var10] = var12;
			String var17 = field147[var10];
			if (field454 == 0) {
				int var18 = 0xFFFF00;
				if (field144[var10] < 6) {
					var18 = field313[field144[var10]];
				}

				if (field144[var10] == 6) {
					var18 = field511 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field144[var10] == 7) {
					var18 = field511 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field144[var10] == 8) {
					var18 = field511 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field144[var10] == 9) {
					int var19 = 150 - field146[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field144[var10] == 10) {
					int var20 = 150 - field146[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field144[var10] == 11) {
					int var21 = 150 - field146[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field145[var10] == 0) {
					field415.method248(field269 + 1, var17, field268, 0);
					field415.method248(field269, var17, field268, var18);
				}

				if (field145[var10] == 1) {
					field415.method253(field511, field269 + 1, field268, 0, var17);
					field415.method253(field511, field269, field268, var18, var17);
				}

				if (field145[var10] == 2) {
					field415.method254(field268, var17, field511, 0, field269 + 1);
					field415.method254(field268, var17, field511, var18, field269);
				}

				if (field145[var10] == 3) {
					field415.method255(0, 150 - field146[var10], field511, field269 + 1, field268, var17);
					field415.method255(var18, 150 - field146[var10], field511, field269, field268, var17);
				}

				if (field145[var10] == 4) {
					int var22 = field415.method251(var17);
					int var23 = (150 - field146[var10]) * (var22 + 100) / 150;
					OMVHXJFV.method417(field268 + 50, 0, 334, field268 - 50);
					field415.method252(0, field268 + 50 - var23, var17, field269 + 1);
					field415.method252(var18, field268 + 50 - var23, var17, field269);
					OMVHXJFV.method416();
				}

				if (field145[var10] == 5) {
					int var24 = 150 - field146[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					OMVHXJFV.method417(512, field269 - field415.field639 - 1, field269 + 5, 0);
					field415.method248(field269 + var25 + 1, var17, field268, 0);
					field415.method248(field269 + var25, var17, field268, var18);
					OMVHXJFV.method416();
				}
			} else {
				field415.method248(field269 + 1, var17, field268, 0);
				field415.method248(field269, var17, field268, 0xFFFF00);
			}
		}
	}

	public final void run() {
		if (field386) {
			method96();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method179(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field368 = "";
				field369 = "Connecting to server...";
				method164(true);
			}

			field199 = new KVLMMBSC(method184(field326 + 43594), this);
			long var4 = UMKVTRLP.method580(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field299.field934 = 0;
			field299.method339(14);
			field299.method339(var6);
			field199.method402(0, 2, field299.field933);

			for (int var7 = 0; var7 < 8; var7++) {
				field199.method399();
			}

			int var8 = field199.method399();
			int var9 = var8;

			if (var8 == 0) {
				field199.method401(field389.field933, 0, 8);
				field389.field934 = 0;
				field183 = field389.method355();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field183 >> 32), (int) field183 };
				field299.field934 = 0;
				field299.method339(10);
				field299.method343(var10[0]);
				field299.method343(var10[1]);
				field299.method343(var10[2]);
				field299.method343(var10[3]);
				field299.method343(signlink.uid);
				field299.method346(arg0);
				field299.method346(arg1);
				field299.method364(field203, field181);
				field520.field934 = 0;

				if (arg2) {
					field520.method339(18);
				} else {
					field520.method339(16);
				}

				field520.method339(field299.field934 + 36 + 1 + 1 + 2);
				field520.method339(255);
				field520.method340(312);
				field520.method339(field328 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field520.method343(field483[var11]);
				}

				field520.method347(field299.field934, 0, field299.field933);
				field299.field938 = new SCSPFXGB(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field563 = new SCSPFXGB(var10);
				field199.method402(0, field520.field934, field520.field933);
				var8 = field199.method399();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method179(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field166 = field199.method399();
				field179 = field199.method399() == 1;
				field164 = 0L;
				field241 = 0;
				field222.field797 = 0;
				field1032 = true;
				field167 = true;
				field198 = true;
				field299.field934 = 0;
				field389.field934 = 0;
				field229 = -1;
				field549 = -1;
				field550 = -1;
				field551 = -1;
				field228 = 0;
				field230 = 0;
				field485 = 0;
				field232 = 0;
				field163 = 0;
				field476 = 0;
				field219 = false;
				field1033 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field312[var13] = null;
				}

				field157 = 0;
				field270 = 0;
				field449 = 0;
				field547 = 0;
				field148 = (int) (Math.random() * 100.0D) - 50;
				field387 = (int) (Math.random() * 110.0D) - 55;
				field554 = (int) (Math.random() * 80.0D) - 40;
				field366 = (int) (Math.random() * 120.0D) - 60;
				field177 = (int) (Math.random() * 30.0D) - 20;
				field422 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field279 = 0;
				field405 = -1;
				field216 = 0;
				field217 = 0;
				field373 = 0;
				field436 = 0;

				for (int var14 = 0; var14 < field370; var14++) {
					field372[var14] = null;
					field377[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field435[var15] = null;
				}

				field256 = field372[field371] = new YNSPIQRH();
				field321.method333();
				field329.method333();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field278[var16][var17][var18] = null;
						}
					}
				}

				field193 = new JQOEJEDB();
				field495 = 0;
				field494 = 0;
				field240 = -1;
				field411 = -1;
				field309 = -1;
				field162 = -1;
				field562 = -1;
				field288 = false;
				field298 = 3;
				field214 = 0;
				field219 = false;
				field324 = false;
				field276 = null;
				field206 = 0;
				field259 = -1;
				field205 = true;
				method174();

				for (int var19 = 0; var19 < 5; var19++) {
					field174[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field430[var20] = null;
					field431[var20] = false;
				}

				field532 = 0;
				field556 = 0;
				field557 = 0;
				field185 = 0;
				field432 = 0;
				field455 = 0;
				field548 = 0;
				field351 = 0;
				method155();
			} else if (var8 == 3) {
				field368 = "";
				field369 = "Invalid username or password.";
			} else if (var8 == 4) {
				field368 = "Your account has been disabled.";
				field369 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field368 = "Your account is already logged in.";
				field369 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field368 = "RuneScape has been updated!";
				field369 = "Please reload this page.";
			} else if (var8 == 7) {
				field368 = "This world is full.";
				field369 = "Please use a different world.";
			} else if (var8 == 8) {
				field368 = "Unable to connect.";
				field369 = "Login server offline.";
			} else if (var8 == 9) {
				field368 = "Login limit exceeded.";
				field369 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field368 = "Unable to connect.";
				field369 = "Bad session id.";
			} else if (var8 == 11) {
				field369 = "Login server rejected session.";
				field369 = "Please try again.";
			} else if (var8 == 12) {
				field368 = "You need a members account to login to this world.";
				field369 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field368 = "Could not complete login.";
				field369 = "Please try using a different world.";
			} else if (var8 == 14) {
				field368 = "The server is being updated.";
				field369 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field198 = true;
				field299.field934 = 0;
				field389.field934 = 0;
				field229 = -1;
				field549 = -1;
				field550 = -1;
				field551 = -1;
				field228 = 0;
				field230 = 0;
				field485 = 0;
				field476 = 0;
				field219 = false;
				field353 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field368 = "Login attempts exceeded.";
				field369 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field368 = "You are standing in a members-only area.";
				field369 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field368 = "Invalid loginserver requested";
				field369 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field199.method399(); var21 >= 0; var21--) {
					field368 = "You have only just left another world";
					field369 = "Your profile will be transferred in: " + var21 + " seconds";
					method164(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method179(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field368 = "Unexpected server response";
				field369 = "Please try using a different world.";
			} else if (var9 != 0) {
				field368 = "No response from server";
				field369 = "Please try using a different world.";
			} else if (field262 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field262++;
				method179(arg0, arg1, arg2);
			} else {
				field368 = "No response from loginserver";
				field369 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field368 = "";
			field369 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method180() {
		if (field233 || field534 || field215) {
			method166();
		} else {
			field471++;

			if (field198) {
				method202();
			} else {
				method164(false);
			}

			field165 = 0;
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method181() {
		if (field485 > 1) {
			field485--;
		}

		if (field232 > 0) {
			field232--;
		}

		for (int var1 = 0; var1 < 5 && method138(); var1++) {
		}

		if (field198) {
			synchronized (field222.field798) {
				if (!field179) {
					field222.field797 = 0;
				} else if (field1041 != 0 || field222.field797 >= 40) {
					field299.method338(208);
					field299.method339(0);
					int var3 = field299.field934;
					int var4 = 0;
					for (int var5 = 0; var5 < field222.field797 && var3 - field299.field934 < 240; var5++) {
						var4++;
						int var6 = field222.field794[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field222.field796[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field222.field794[var5] == -1 && field222.field796[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field339 != var7 || field340 != var6) {
							int var9 = var7 - field339;
							field339 = var7;
							int var10 = var6 - field340;
							field340 = var6;

							if (field241 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field299.method340((field241 << 12) + (var9 << 6) + var10);
								field241 = 0;
							} else if (field241 < 8) {
								field299.method342((field241 << 19) + var8 + 0x800000);
								field241 = 0;
							} else {
								field299.method343((field241 << 19) + var8 - 0x40000000);
								field241 = 0;
							}
						} else if (field241 < 2047) {
							field241++;
						}
					}

					field299.method348(field299.field934 - var3);

					if (var4 >= field222.field797) {
						field222.field797 = 0;
					} else {
						field222.field797 -= var4;
						for (int var11 = 0; var11 < field222.field797; var11++) {
							field222.field796[var11] = field222.field796[var4 + var11];
							field222.field794[var11] = field222.field794[var4 + var11];
						}
					}
				}
			}

			if (field1041 != 0) {
				long var12 = (field1044 - field164) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field164 = field1044;
				int var14 = field1043;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1042;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1041 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field299.method338(66);
				field299.method383((var17 << 19) + (var18 << 20) + var16);
			}

			if (field545 > 0) {
				field545--;
			}

			if (field1045[1] == 1 || field1045[2] == 1 || field1045[3] == 1 || field1045[4] == 1) {
				field546 = true;
			}

			if (field546 && field545 <= 0) {
				field545 = 20;
				field546 = false;
				field299.method338(249);
				field299.method340(field421);
				field299.method375(field422);
			}

			if (field1032 && !field167) {
				field167 = true;
				field299.method338(128);
				field299.method339(1);
			}

			if (!field1032 && field167) {
				field167 = false;
				field299.method338(128);
				field299.method339(0);
			}

			method112();
			method108();
			method147();
			field230++;
			if (field230 > 750) {
				method66();
			}

			method131();
			method195();
			method78();
			field458++;

			if (field254 != 0) {
				field253 += 20;
				if (field253 >= 400) {
					field254 = 0;
				}
			}

			if (field463 != 0) {
				field460++;
				if (field460 >= 15) {
					if (field463 == 2) {
						field473 = true;
					}

					if (field463 == 3) {
						field482 = true;
					}

					field463 = 0;
				}
			}

			if (field236 != 0) {
				field182++;

				if (field1035 > field237 + 5 || field1035 < field237 - 5 || field1036 > field238 + 5 || field1036 < field238 - 5) {
					field314 = true;
				}

				if (field1034 == 0) {
					if (field236 == 2) {
						field473 = true;
					}

					if (field236 == 3) {
						field482 = true;
					}

					field236 = 0;

					if (field314 && field182 >= 5) {
						field394 = -1;
						method193();

						if (field394 == field234 && field393 != field235) {
							AMSZZFWC var19 = AMSZZFWC.field63[field234];
							byte var20 = 0;
							if (field493 == 1 && var19.field52 == 206) {
								var20 = 1;
							}

							if (var19.field49[field393] <= 0) {
								var20 = 0;
							}

							if (var19.field7) {
								int var21 = field235;
								int var22 = field393;
								var19.field49[var22] = var19.field49[var21];
								var19.field55[var22] = var19.field55[var21];
								var19.field49[var21] = -1;
								var19.field55[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field235;
								int var24 = field393;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method4(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method4(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method4(field235, field393);
							}

							field299.method338(154);
							field299.method374(field393);
							field299.method367(var20);
							field299.method340(field235);
							field299.method376(field234);
						}
					} else if ((field559 == 1 || method85(field476 - 1)) && field476 > 2) {
						method95();
					} else if (field476 > 0) {
						method176(field476 - 1);
					}

					field460 = 10;
					field1041 = 0;
				}
			}

			if (BGNYQYNO.field109 != -1) {
				int var25 = BGNYQYNO.field109;
				int var26 = BGNYQYNO.field110;
				boolean var27 = method175(0, var26, 0, 0, var25, 0, field256.field1368[0], 0, 0, true, field256.field1367[0]);
				BGNYQYNO.field109 = -1;

				if (var27) {
					field251 = field1042;
					field252 = field1043;
					field254 = 1;
					field253 = 0;
				}
			}

			if (field1041 == 1 && field276 != null) {
				field276 = null;
				field482 = true;
				field1041 = 0;
			}

			method69();
			method98();
			method194();
			method123();

			if (field1034 == 1 || field1041 == 1) {
				field165++;
			}

			if (field449 == 2) {
				method103();
			}

			if (field449 == 2 && field521) {
				method101();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field261[var28]++;
			}

			method122();
			field1033++;
			if (field1033 > 4500) {
				field232 = 250;
				field1033 -= 500;
				field299.method338(29);
			}

			field429++;
			if (field429 > 500) {
				field429 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field148 += field149;
				}

				if ((var29 & 0x2) == 2) {
					field387 += field388;
				}

				if ((var29 & 0x4) == 4) {
					field554 += field555;
				}
			}

			if (field148 < -50) {
				field149 = 2;
			}

			if (field148 > 50) {
				field149 = -2;
			}

			if (field387 < -55) {
				field388 = 2;
			}

			if (field387 > 55) {
				field388 = -2;
			}

			if (field554 < -40) {
				field555 = 1;
			}

			if (field554 > 40) {
				field555 = -1;
			}

			field486++;
			if (field486 > 500) {
				field486 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field366 += field367;
				}

				if ((var30 & 0x2) == 2) {
					field177 += field178;
				}
			}

			if (field366 < -60) {
				field367 = 2;
			}

			if (field366 > 60) {
				field367 = -2;
			}

			if (field177 < -20) {
				field178 = 1;
			}

			if (field177 > 10) {
				field178 = -1;
			}

			field192++;
			if (field192 > 184) {
				field192 = 0;
				field299.method338(123);
				field299.method340(43753);
			}

			field231++;
			if (field231 > 50) {
				field299.method338(140);
			}

			try {
				if (field199 != null && field299.field934 > 0) {
					field199.method402(0, field299.field934, field299.field933);
					field299.field934 = 0;
					field231 = 0;
				}
			} catch (IOException var32) {
				method66();
			} catch (Exception var33) {
				method185();
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;)V")
	public final void method182(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field240 != -1) {
			field276 = arg2;
			field1041 = 0;
		}

		if (field411 == -1) {
			field482 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field310[var4] = field310[var4 - 1];
			field311[var4] = field311[var4 - 1];
			field312[var4] = field312[var4 - 1];
		}

		field310[0] = arg1;
		field311[0] = arg0;
		field312[0] = arg2;
	}

	@ObfuscatedName("client.c(LKHOMSBHW;II)V")
	public final void method183(KHOMSBHW arg0, int arg1) {
		arg0.method359();
		int var3 = arg0.method360(8);
		if (var3 < field436) {
			for (int var4 = var3; var4 < field436; var4++) {
				field156[field155++] = field437[var4];
			}
		}

		if (var3 > field436) {
			signlink.reporterror(field281 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field436 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field437[var5];
			FJJCITCO var7 = field435[var6];
			int var8 = arg0.method360(1);
			if (var8 == 0) {
				field437[field436++] = var6;
				var7.field1329 = field420;
			} else {
				int var9 = arg0.method360(2);
				if (var9 == 0) {
					field437[field436++] = var6;
					var7.field1329 = field420;
					field376[field375++] = var6;
				} else if (var9 == 1) {
					field437[field436++] = var6;
					var7.field1329 = field420;
					int var10 = arg0.method360(3);
					var7.method576(var10, false);
					int var11 = arg0.method360(1);
					if (var11 == 1) {
						field376[field375++] = var6;
					}
				} else if (var9 == 2) {
					field437[field436++] = var6;
					var7.field1329 = field420;
					int var12 = arg0.method360(3);
					var7.method576(var12, true);
					int var13 = arg0.method360(3);
					var7.method576(var13, true);
					int var14 = arg0.method360(1);
					if (var14 == 1) {
						field376[field375++] = var6;
					}
				} else if (var9 == 3) {
					field156[field155++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)Ljava/net/Socket;")
	public final Socket method184(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.q(B)V")
	public final void method185() {
		try {
			if (field199 != null) {
				field199.method398();
			}
		} catch (Exception var2) {
		}

		field199 = null;
		field198 = false;
		field513 = 0;
		field281 = "";
		field282 = "";
		method97();
		field331.method15();

		for (int var1 = 0; var1 < 4; var1++) {
			field412[var1].method208();
		}

		System.gc();
		method125();
		field173 = -1;
		field539 = -1;
		field213 = 0;
	}

	@ObfuscatedName("client.a(IILKHOMSBHW;ILYNSPIQRH;)V")
	public final void method186(int arg0, KHOMSBHW arg1, int arg2, YNSPIQRH arg3) {
		if ((arg0 & 0x400) != 0) {
			int var5 = arg1.method369();
			int var6 = arg1.method369();
			arg3.method579(field420, var6, var5);
			arg3.field1336 = field420 + 300;
			arg3.field1337 = arg1.method368();
			arg3.field1338 = arg1.method349();
		}

		if ((arg0 & 0x4) != 0) {
			arg3.field1325 = arg1.method377();
			if (arg3.field1325 == 0xFFFF) {
				arg3.field1325 = -1;
			}
		}

		if ((arg0 & 0x8) != 0) {
			int var7 = arg1.method351();
			int var8 = arg1.method349();
			int var9 = arg1.method349();
			int var10 = arg1.field934;

			if (arg3.field1437 != null && arg3.field1443) {
				long var11 = UMKVTRLP.method580(arg3.field1437);
				boolean var13 = false;
				if (var8 <= 1) {
					for (int var14 = 0; var14 < field452; var14++) {
						if (field180[var14] == var11) {
							var13 = true;
							break;
						}
					}
				}

				if (!var13 && field522 == 0) {
					try {
						field434.field934 = 0;
						arg1.method388(field434.field933, 0, var9);
						field434.field934 = 0;
						String var15 = KFRNHLYS.method334(field434, var9);
						var15 = PAYTRPNV.method437(var15);
						arg3.field1331 = var15;
						arg3.field1375 = var7 >> 8;
						arg3.field1351 = var7 & 0xFF;
						arg3.field1335 = 150;

						if (var8 == 2 || var8 == 3) {
							method182("@cr2@" + arg3.field1437, 1, var15);
						} else if (var8 == 1) {
							method182("@cr1@" + arg3.field1437, 1, var15);
						} else {
							method182(arg3.field1437, 2, var15);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field934 = var9 + var10;
		}

		if ((arg0 & 0x10) != 0) {
			int var17 = arg1.method349();
			byte[] var18 = new byte[var17];
			KHOMSBHW var19 = new KHOMSBHW(var18);
			arg1.method389(var17, 0, var18);
			field377[arg2] = var19;
			arg3.method593(var19);
		}

		if ((arg0 & 0x100) != 0) {
			arg3.field1358 = arg1.method369();
			arg3.field1360 = arg1.method349();
			arg3.field1359 = arg1.method368();
			arg3.field1361 = arg1.method370();
			arg3.field1362 = arg1.method378() + field420;
			arg3.field1363 = arg1.method351() + field420;
			arg3.field1364 = arg1.method369();
			arg3.method578();
		}

		if ((arg0 & 0x200) != 0) {
			arg3.field1370 = arg1.method377();
			int var20 = arg1.method384();
			arg3.field1374 = var20 >> 16;
			arg3.field1373 = (var20 & 0xFFFF) + field420;
			arg3.field1371 = 0;
			arg3.field1372 = 0;

			if (arg3.field1373 > field420) {
				arg3.field1371 = -1;
			}

			if (arg3.field1370 == 0xFFFF) {
				arg3.field1370 = -1;
			}
		}

		if ((arg0 & 0x2) != 0) {
			int var21 = arg1.method379();
			if (var21 == 0xFFFF) {
				var21 = -1;
			}

			int var22 = arg1.method368();
			if (arg3.field1339 == var21 && var21 != -1) {
				int var23 = EJHGNUGE.field604[var21].field618;
				if (var23 == 1) {
					arg3.field1340 = 0;
					arg3.field1341 = 0;
					arg3.field1342 = var22;
					arg3.field1343 = 0;
				}

				if (var23 == 2) {
					arg3.field1343 = 0;
				}
			} else if (var21 == -1 || arg3.field1339 == -1 || EJHGNUGE.field604[var21].field612 >= EJHGNUGE.field604[arg3.field1339].field612) {
				arg3.field1339 = var21;
				arg3.field1340 = 0;
				arg3.field1341 = 0;
				arg3.field1342 = var22;
				arg3.field1343 = 0;
				arg3.field1379 = arg3.field1346;
			}
		}

		if ((arg0 & 0x1) != 0) {
			arg3.field1331 = arg1.method356();
			if (arg3.field1331.charAt(0) == '~') {
				arg3.field1331 = arg3.field1331.substring(1);
				method182(arg3.field1437, 2, arg3.field1331);
			} else if (field256 == arg3) {
				method182(arg3.field1437, 2, arg3.field1331);
			}

			arg3.field1375 = 0;
			arg3.field1351 = 0;
			arg3.field1335 = 150;
		}

		if ((arg0 & 0x40) != 0) {
			int var24 = arg1.method349();
			int var25 = arg1.method370();
			arg3.method579(field420, var25, var24);
			arg3.field1336 = field420 + 300;
			arg3.field1337 = arg1.method369();
			arg3.field1338 = arg1.method349();
		}

		if ((arg0 & 0x80) != 0) {
			arg3.field1365 = arg1.method378();
			arg3.field1366 = arg1.method378();
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method187() {
		field168 = false;
		while (field404) {
			field168 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field536 = null;
		field537 = null;
		field457 = null;
		field467 = null;
		field468 = null;
		field469 = null;
		field470 = null;
		field509 = null;
		field510 = null;
		field337 = null;
		field338 = null;
		field552 = null;
		field553 = null;
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method188(int arg0) {
		int[] var2 = field218.field1274;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field406[arg0][var7][var5] & 0x18) == 0) {
					field331.method50(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field406[arg0 + 1][var7][var5] & 0x8) != 0) {
					field331.method50(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field218.method553();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field406[arg0][var11][var10] & 0x18) == 0) {
					method81(var9, var11, var10, var8, arg0);
				}

				if (arg0 < 3 && (field406[arg0 + 1][var11][var10] & 0x8) != 0) {
					method81(var9, var11, var10, var8, arg0 + 1);
				}
			}
		}

		field398.method465();
		field464 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field331.method44(field320, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = RUJAIVBH.method512(var14).field1169;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field412[field320].field568;
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

						field541[field464] = field542[var15];
						field465[field464] = var16;
						field466[field464] = var17;
						field464++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method189() {
		field487 = true;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg4 >= 1 && arg0 <= 102 && arg4 <= 102) {
			if (field328 && field320 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field331.method41(arg1, arg0, arg4);
			}

			if (arg3 == 1) {
				var8 = field331.method42(arg0, arg1, arg4);
			}

			if (arg3 == 2) {
				var8 = field331.method43(arg1, arg0, arg4);
			}

			if (arg3 == 3) {
				var8 = field331.method44(arg1, arg0, arg4);
			}

			if (var8 != 0) {
				int var12 = field331.method45(arg1, arg0, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field331.method32(arg0, arg4, arg1);
					RUJAIVBH var16 = RUJAIVBH.method512(var13);
					if (var16.field1179) {
						field412[arg1].method213(arg4, arg0, var15, var16.field1165, var14);
					}
				}

				if (arg3 == 1) {
					field331.method33(arg1, arg0, arg4);
				}

				if (arg3 == 2) {
					field331.method34(arg4, arg1, arg0);
					RUJAIVBH var17 = RUJAIVBH.method512(var13);
					if (var17.field1174 + arg0 > 103 || var17.field1174 + arg4 > 103 || var17.field1180 + arg0 > 103 || var17.field1180 + arg4 > 103) {
						return;
					}

					if (var17.field1179) {
						field412[arg1].method214(var17.field1174, var17.field1165, var15, arg4, arg0, var17.field1180);
					}
				}

				if (arg3 == 3) {
					field331.method35(arg0, arg4, arg1);
					RUJAIVBH var18 = RUJAIVBH.method512(var13);
					if (var18.field1179 && var18.field1164) {
						field412[arg1].method216(arg4, arg0);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field406[1][arg0][arg4] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				PTERWXXU.method486(field364, field412[arg1], arg4, arg2, var19, field331, arg6, arg1, arg5, arg0);
				return;
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public void method191() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field446);

		if (field211 != null) {
			System.out.println("Od-cycle:" + field211.field1241);
		}

		System.out.println("loop-cycle:" + field420);
		System.out.println("draw-cycle:" + field471);
		System.out.println("ptype:" + field229);
		System.out.println("psize:" + field228);

		if (field199 != null) {
			field199.method403();
		}

		field1024 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method192() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1030 != null) {
			return field1030;
		}

		return this;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 312);

			if (arg0.length == 5) {
				field325 = Integer.parseInt(arg0[0]);
				field326 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method83();
				} else if (arg0[2].equals("highmem")) {
					method173();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field327 = false;
				} else if (arg0[3].equals("members")) {
					field327 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method410(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.s(B)V")
	public final void method193() {
		if (field236 == 0) {
			field283[0] = "Cancel";
			field247[0] = 1977;
			field476 = 1;
			method91();
			field307 = 0;

			if (field1035 > 4 && field1036 > 4 && field1035 < 516 && field1036 < 338) {
				if (field309 == -1) {
					method67();
				} else {
					method168(AMSZZFWC.field63[field309], field1035, 4, 4, field1036, 0);
				}
			}

			if (field307 != field249) {
				field249 = field307;
			}

			field307 = 0;

			if (field1035 > 553 && field1036 > 205 && field1035 < 743 && field1036 < 466) {
				if (field162 != -1) {
					method168(AMSZZFWC.field63[field162], field1035, 205, 553, field1036, 0);
				} else if (field506[field298] != -1) {
					method168(AMSZZFWC.field63[field506[field298]], field1035, 205, 553, field1036, 0);
				}
			}

			if (field426 != field307) {
				field473 = true;
				field426 = field307;
			}

			field307 = 0;

			if (field1035 > 17 && field1036 > 357 && field1035 < 496 && field1036 < 453) {
				if (field411 != -1) {
					method168(AMSZZFWC.field63[field411], field1035, 357, 17, field1036, 0);
				} else if (field1036 < 434 && field1035 < 426) {
					method124(field1035 - 17, field1036 - 357);
				}
			}

			if (field411 != -1 && field523 != field307) {
				field482 = true;
				field523 = field307;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field476 - 1; var2++) {
					if (field247[var2] < 1000 && field247[var2 + 1] > 1000) {
						String var3 = field283[var2];
						field283[var2] = field283[var2 + 1];
						field283[var2 + 1] = var3;
						int var4 = field247[var2];
						field247[var2] = field247[var2 + 1];
						field247[var2 + 1] = var4;
						int var5 = field245[var2];
						field245[var2] = field245[var2 + 1];
						field245[var2 + 1] = var5;
						int var6 = field246[var2];
						field246[var2] = field246[var2 + 1];
						field246[var2 + 1] = var6;
						int var7 = field248[var2];
						field248[var2] = field248[var2 + 1];
						field248[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method194() {
		if (field1041 == 1) {
			if (field1042 >= 539 && field1042 <= 573 && field1043 >= 169 && field1043 < 205 && field506[0] != -1) {
				field473 = true;
				field298 = 0;
				field380 = true;
			}

			if (field1042 >= 569 && field1042 <= 599 && field1043 >= 168 && field1043 < 205 && field506[1] != -1) {
				field473 = true;
				field298 = 1;
				field380 = true;
			}

			if (field1042 >= 597 && field1042 <= 627 && field1043 >= 168 && field1043 < 205 && field506[2] != -1) {
				field473 = true;
				field298 = 2;
				field380 = true;
			}

			if (field1042 >= 625 && field1042 <= 669 && field1043 >= 168 && field1043 < 203 && field506[3] != -1) {
				field473 = true;
				field298 = 3;
				field380 = true;
			}

			if (field1042 >= 666 && field1042 <= 696 && field1043 >= 168 && field1043 < 205 && field506[4] != -1) {
				field473 = true;
				field298 = 4;
				field380 = true;
			}

			if (field1042 >= 694 && field1042 <= 724 && field1043 >= 168 && field1043 < 205 && field506[5] != -1) {
				field473 = true;
				field298 = 5;
				field380 = true;
			}

			if (field1042 >= 722 && field1042 <= 756 && field1043 >= 169 && field1043 < 205 && field506[6] != -1) {
				field473 = true;
				field298 = 6;
				field380 = true;
			}

			if (field1042 >= 540 && field1042 <= 574 && field1043 >= 466 && field1043 < 502 && field506[7] != -1) {
				field473 = true;
				field298 = 7;
				field380 = true;
			}

			if (field1042 >= 572 && field1042 <= 602 && field1043 >= 466 && field1043 < 503 && field506[8] != -1) {
				field473 = true;
				field298 = 8;
				field380 = true;
			}

			if (field1042 >= 599 && field1042 <= 629 && field1043 >= 466 && field1043 < 503 && field506[9] != -1) {
				field473 = true;
				field298 = 9;
				field380 = true;
			}

			if (field1042 >= 627 && field1042 <= 671 && field1043 >= 467 && field1043 < 502 && field506[10] != -1) {
				field473 = true;
				field298 = 10;
				field380 = true;
			}

			if (field1042 >= 669 && field1042 <= 699 && field1043 >= 466 && field1043 < 503 && field506[11] != -1) {
				field473 = true;
				field298 = 11;
				field380 = true;
			}

			if (field1042 >= 696 && field1042 <= 726 && field1043 >= 466 && field1043 < 503 && field506[12] != -1) {
				field473 = true;
				field298 = 12;
				field380 = true;
			}

			if (field1042 >= 724 && field1042 <= 758 && field1043 >= 466 && field1043 < 502 && field506[13] != -1) {
				field473 = true;
				field298 = 13;
				field380 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method195() {
		for (int var1 = 0; var1 < field436; var1++) {
			int var2 = field437[var1];
			FJJCITCO var3 = field435[var2];
			if (var3 != null) {
				method196(var3.field650.field1299, var3);
			}
		}
	}

	@ObfuscatedName("client.b(ILUKUMCXZT;I)V")
	public final void method196(int arg0, UKUMCXZT arg1) {
		if (arg1.field1326 < 128 || arg1.field1327 < 128 || arg1.field1326 >= 13184 || arg1.field1327 >= 13184) {
			arg1.field1339 = -1;
			arg1.field1370 = -1;
			arg1.field1362 = 0;
			arg1.field1363 = 0;
			arg1.field1326 = arg1.field1367[0] * 128 + arg1.field1352 * 64;
			arg1.field1327 = arg1.field1368[0] * 128 + arg1.field1352 * 64;
			arg1.method578();
		}

		if (field256 == arg1 && (arg1.field1326 < 1536 || arg1.field1327 < 1536 || arg1.field1326 >= 11776 || arg1.field1327 >= 11776)) {
			arg1.field1339 = -1;
			arg1.field1370 = -1;
			arg1.field1362 = 0;
			arg1.field1363 = 0;
			arg1.field1326 = arg1.field1367[0] * 128 + arg1.field1352 * 64;
			arg1.field1327 = arg1.field1368[0] * 128 + arg1.field1352 * 64;
			arg1.method578();
		}

		if (arg1.field1362 > field420) {
			method197(arg1);
		} else if (arg1.field1363 >= field420) {
			method198(arg1);
		} else {
			method199(arg1);
		}

		method200(arg1);
		method201(arg1);
	}

	@ObfuscatedName("client.a(ILUKUMCXZT;)V")
	public final void method197(UKUMCXZT arg0) {
		int var2 = arg0.field1362 - field420;
		int var3 = arg0.field1358 * 128 + arg0.field1352 * 64;
		int var4 = arg0.field1360 * 128 + arg0.field1352 * 64;
		arg0.field1326 += (var3 - arg0.field1326) / var2;
		arg0.field1327 += (var4 - arg0.field1327) / var2;
		arg0.field1334 = 0;

		if (arg0.field1364 == 0) {
			arg0.field1344 = 1024;
		}

		if (arg0.field1364 == 1) {
			arg0.field1344 = 1536;
		}

		if (arg0.field1364 == 2) {
			arg0.field1344 = 0;
		}

		if (arg0.field1364 == 3) {
			arg0.field1344 = 512;
		}
	}

	@ObfuscatedName("client.a(BLUKUMCXZT;)V")
	public final void method198(UKUMCXZT arg0) {
		if (field420 == arg0.field1363 || arg0.field1339 == -1 || arg0.field1342 != 0 || arg0.field1341 + 1 > EJHGNUGE.field604[arg0.field1339].method241(arg0.field1340)) {
			int var2 = arg0.field1363 - arg0.field1362;
			int var3 = field420 - arg0.field1362;
			int var4 = arg0.field1358 * 128 + arg0.field1352 * 64;
			int var5 = arg0.field1360 * 128 + arg0.field1352 * 64;
			int var6 = arg0.field1359 * 128 + arg0.field1352 * 64;
			int var7 = arg0.field1361 * 128 + arg0.field1352 * 64;
			arg0.field1326 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1327 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1334 = 0;

		if (arg0.field1364 == 0) {
			arg0.field1344 = 1024;
		}

		if (arg0.field1364 == 1) {
			arg0.field1344 = 1536;
		}

		if (arg0.field1364 == 2) {
			arg0.field1344 = 0;
		}

		if (arg0.field1364 == 3) {
			arg0.field1344 = 512;
		}

		arg0.field1328 = arg0.field1344;
	}

	@ObfuscatedName("client.a(LUKUMCXZT;B)V")
	public final void method199(UKUMCXZT arg0) {
		arg0.field1354 = arg0.field1332;
		if (arg0.field1346 == 0) {
			arg0.field1334 = 0;
		} else {
			if (arg0.field1339 != -1 && arg0.field1342 == 0) {
				EJHGNUGE var2 = EJHGNUGE.field604[arg0.field1339];
				if (arg0.field1379 > 0 && var2.field616 == 0) {
					arg0.field1334++;
					return;
				}

				if (arg0.field1379 <= 0 && var2.field617 == 0) {
					arg0.field1334++;
					return;
				}
			}

			int var3 = arg0.field1326;
			int var4 = arg0.field1327;
			int var5 = arg0.field1367[arg0.field1346 - 1] * 128 + arg0.field1352 * 64;
			int var6 = arg0.field1368[arg0.field1346 - 1] * 128 + arg0.field1352 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1344 = 1280;
					} else if (var4 > var6) {
						arg0.field1344 = 1792;
					} else {
						arg0.field1344 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1344 = 768;
					} else if (var4 > var6) {
						arg0.field1344 = 256;
					} else {
						arg0.field1344 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1344 = 1024;
				} else {
					arg0.field1344 = 0;
				}

				int var7 = arg0.field1344 - arg0.field1328 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1348;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1347;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1350;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1349;
				}

				if (var8 == -1) {
					var8 = arg0.field1347;
				}

				arg0.field1354 = var8;
				int var9 = 4;
				if (arg0.field1344 != arg0.field1328 && arg0.field1325 == -1 && arg0.field1345 != 0) {
					var9 = 2;
				}

				if (arg0.field1346 > 2) {
					var9 = 6;
				}

				if (arg0.field1346 > 3) {
					var9 = 8;
				}

				if (arg0.field1334 > 0 && arg0.field1346 > 1) {
					var9 = 8;
					arg0.field1334--;
				}

				if (arg0.field1330[arg0.field1346 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1354 == arg0.field1347 && arg0.field1369 != -1) {
					arg0.field1354 = arg0.field1369;
				}

				if (var3 < var5) {
					arg0.field1326 += var9;
					if (arg0.field1326 > var5) {
						arg0.field1326 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1326 -= var9;
					if (arg0.field1326 < var5) {
						arg0.field1326 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1327 += var9;
					if (arg0.field1327 > var6) {
						arg0.field1327 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1327 -= var9;
					if (arg0.field1327 < var6) {
						arg0.field1327 = var6;
					}
				}

				if (arg0.field1326 == var5 && arg0.field1327 == var6) {
					arg0.field1346--;

					if (arg0.field1379 > 0) {
						arg0.field1379--;
						return;
					}
				}
			} else {
				arg0.field1326 = var5;
				arg0.field1327 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(ILUKUMCXZT;)V")
	public final void method200(UKUMCXZT arg0) {
		if (arg0.field1345 != 0) {
			if (arg0.field1325 != -1 && arg0.field1325 < 32768) {
				FJJCITCO var2 = field435[arg0.field1325];
				if (var2 != null) {
					int var3 = arg0.field1326 - var2.field1326;
					int var4 = arg0.field1327 - var2.field1327;
					if (var3 != 0 || var4 != 0) {
						arg0.field1344 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1325 >= 32768) {
				int var5 = arg0.field1325 - 32768;
				if (field323 == var5) {
					var5 = field371;
				}

				YNSPIQRH var6 = field372[var5];
				if (var6 != null) {
					int var7 = arg0.field1326 - var6.field1326;
					int var8 = arg0.field1327 - var6.field1327;
					if (var7 != 0 || var8 != 0) {
						arg0.field1344 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1365 != 0 || arg0.field1366 != 0) && (arg0.field1346 == 0 || arg0.field1334 > 0)) {
				int var9 = arg0.field1326 - (arg0.field1365 - field489 - field489) * 64;
				int var10 = arg0.field1327 - (arg0.field1366 - field490 - field490) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1344 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1365 = 0;
				arg0.field1366 = 0;
			}

			int var11 = arg0.field1344 - arg0.field1328 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1345 || var11 > 2048 - arg0.field1345) {
					arg0.field1328 = arg0.field1344;
				} else if (var11 > 1024) {
					arg0.field1328 -= arg0.field1345;
				} else {
					arg0.field1328 += arg0.field1345;
				}

				arg0.field1328 &= 0x7FF;
				if (arg0.field1354 == arg0.field1332 && arg0.field1344 != arg0.field1328) {
					if (arg0.field1333 != -1) {
						arg0.field1354 = arg0.field1333;
						return;
					}

					arg0.field1354 = arg0.field1347;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LUKUMCXZT;I)V")
	public final void method201(UKUMCXZT arg0) {
		arg0.field1357 = false;

		if (arg0.field1354 != -1) {
			EJHGNUGE var2 = EJHGNUGE.field604[arg0.field1354];
			arg0.field1356++;
			if (arg0.field1355 < var2.field605 && arg0.field1356 > var2.method241(arg0.field1355)) {
				arg0.field1356 = 0;
				arg0.field1355++;
			}

			if (arg0.field1355 >= var2.field605) {
				arg0.field1356 = 0;
				arg0.field1355 = 0;
			}
		}

		if (arg0.field1370 != -1 && field420 >= arg0.field1373) {
			if (arg0.field1371 < 0) {
				arg0.field1371 = 0;
			}

			EJHGNUGE var3 = IDBAHLFM.field805[arg0.field1370].field809;
			arg0.field1372++;
			while (arg0.field1371 < var3.field605 && arg0.field1372 > var3.method241(arg0.field1371)) {
				arg0.field1372 -= var3.method241(arg0.field1371);
				arg0.field1371++;
			}

			if (arg0.field1371 >= var3.field605 && (arg0.field1371 < 0 || arg0.field1371 >= var3.field605)) {
				arg0.field1370 = -1;
			}
		}

		if (arg0.field1339 != -1 && arg0.field1342 <= 1) {
			EJHGNUGE var4 = EJHGNUGE.field604[arg0.field1339];
			if (var4.field616 == 1 && arg0.field1379 > 0 && arg0.field1362 <= field420 && arg0.field1363 < field420) {
				arg0.field1342 = 1;
				return;
			}
		}

		if (arg0.field1339 != -1 && arg0.field1342 == 0) {
			EJHGNUGE var5 = EJHGNUGE.field604[arg0.field1339];
			arg0.field1341++;
			while (arg0.field1340 < var5.field605 && arg0.field1341 > var5.method241(arg0.field1340)) {
				arg0.field1341 -= var5.method241(arg0.field1340);
				arg0.field1340++;
			}

			if (arg0.field1340 >= var5.field605) {
				arg0.field1340 -= var5.field609;
				arg0.field1343++;
				if (arg0.field1343 >= var5.field615) {
					arg0.field1339 = -1;
				}

				if (arg0.field1340 < 0 || arg0.field1340 >= var5.field605) {
					arg0.field1339 = -1;
				}
			}

			arg0.field1357 = var5.field611;
		}

		if (arg0.field1342 > 0) {
			arg0.field1342--;
		}
	}

	@ObfuscatedName("client.t(B)V")
	public final void method202() {
		if (field487) {
			field487 = false;
			field354.method466(field1027, 4, 0);
			field355.method466(field1027, 357, 0);
			field356.method466(field1027, 4, 722);
			field357.method466(field1027, 205, 743);
			field358.method466(field1027, 0, 0);
			field359.method466(field1027, 4, 516);
			field360.method466(field1027, 205, 516);
			field361.method466(field1027, 357, 496);
			field362.method466(field1027, 338, 0);
			field473 = true;
			field482 = true;
			field380 = true;
			field531 = true;

			if (field449 != 2) {
				field398.method466(field1027, 4, 4);
				field397.method466(field1027, 4, 550);
			}
		}

		if (field449 == 2) {
			method132();
		}

		if (field219 && field439 == 1) {
			field473 = true;
		}

		if (field162 != -1) {
			boolean var1 = method79(field458, field162);
			if (var1) {
				field473 = true;
			}
		}

		if (field463 == 2) {
			field473 = true;
		}

		if (field236 == 2) {
			field473 = true;
		}

		if (field473) {
			method140();
			field473 = false;
		}

		if (field411 == -1) {
			field478.field47 = field184 - field418 - 77;

			if (field1035 > 448 && field1035 < 560 && field1036 > 332) {
				method130(field184, field1036 - 357, 0, 77, 463, field478, false, field1035 - 17);
			}

			int var2 = field184 - field478.field47 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field184 - 77) {
				var2 = field184 - 77;
			}

			if (field418 != var2) {
				field418 = var2;
				field482 = true;
			}
		}

		if (field411 != -1) {
			boolean var3 = method79(field458, field411);
			if (var3) {
				field482 = true;
			}
		}

		if (field463 == 3) {
			field482 = true;
		}

		if (field236 == 3) {
			field482 = true;
		}

		if (field276 != null) {
			field482 = true;
		}

		if (field219 && field439 == 2) {
			field482 = true;
		}

		if (field482) {
			method87();
			field482 = false;
		}

		if (field449 == 2) {
			method100();
			field397.method466(field1027, 4, 550);
		}

		if (field259 != -1) {
			field380 = true;
		}

		if (field380) {
			if (field259 != -1 && field298 == field259) {
				field259 = -1;
				field299.method338(201);
				field299.method339(field298);
			}

			field380 = false;
			field210.method465();
			field336.method319(0, 0);

			if (field162 == -1) {
				if (field506[field298] != -1) {
					if (field298 == 0) {
						field223.method319(10, 22);
					}

					if (field298 == 1) {
						field224.method319(8, 54);
					}

					if (field298 == 2) {
						field224.method319(8, 82);
					}

					if (field298 == 3) {
						field225.method319(8, 110);
					}

					if (field298 == 4) {
						field227.method319(8, 153);
					}

					if (field298 == 5) {
						field227.method319(8, 181);
					}

					if (field298 == 6) {
						field226.method319(9, 209);
					}
				}

				if (field506[0] != -1 && (field259 != 0 || field420 % 20 < 10)) {
					field207[0].method319(13, 29);
				}

				if (field506[1] != -1 && (field259 != 1 || field420 % 20 < 10)) {
					field207[1].method319(11, 53);
				}

				if (field506[2] != -1 && (field259 != 2 || field420 % 20 < 10)) {
					field207[2].method319(11, 82);
				}

				if (field506[3] != -1 && (field259 != 3 || field420 % 20 < 10)) {
					field207[3].method319(12, 115);
				}

				if (field506[4] != -1 && (field259 != 4 || field420 % 20 < 10)) {
					field207[4].method319(13, 153);
				}

				if (field506[5] != -1 && (field259 != 5 || field420 % 20 < 10)) {
					field207[5].method319(11, 180);
				}

				if (field506[6] != -1 && (field259 != 6 || field420 % 20 < 10)) {
					field207[6].method319(13, 208);
				}
			}

			field210.method466(field1027, 160, 516);
			field533++;
			if (field533 > 93) {
				field533 = 0;
				field299.method338(156);
			}

			field209.method465();
			field335.method319(0, 0);

			if (field162 == -1) {
				if (field506[field298] != -1) {
					if (field298 == 7) {
						field381.method319(0, 42);
					}

					if (field298 == 8) {
						field382.method319(0, 74);
					}

					if (field298 == 9) {
						field382.method319(0, 102);
					}

					if (field298 == 10) {
						field383.method319(1, 130);
					}

					if (field298 == 11) {
						field385.method319(0, 173);
					}

					if (field298 == 12) {
						field385.method319(0, 201);
					}

					if (field298 == 13) {
						field384.method319(0, 229);
					}
				}

				if (field506[8] != -1 && (field259 != 8 || field420 % 20 < 10)) {
					field207[7].method319(2, 74);
				}

				if (field506[9] != -1 && (field259 != 9 || field420 % 20 < 10)) {
					field207[8].method319(3, 102);
				}

				if (field506[10] != -1 && (field259 != 10 || field420 % 20 < 10)) {
					field207[9].method319(4, 137);
				}

				if (field506[11] != -1 && (field259 != 11 || field420 % 20 < 10)) {
					field207[10].method319(2, 174);
				}

				if (field506[12] != -1 && (field259 != 12 || field420 % 20 < 10)) {
					field207[11].method319(2, 201);
				}

				if (field506[13] != -1 && (field259 != 13 || field420 % 20 < 10)) {
					field207[12].method319(2, 226);
				}
			}

			field209.method466(field1027, 466, 496);
			field398.method465();
		}

		if (field531) {
			field531 = false;
			field208.method465();
			field334.method319(0, 0);
			field414.method249("Public chat", true, 55, 28, 0xFFFFFF);

			if (field525 == 0) {
				field414.method249("On", true, 55, 41, 0xFF00);
			}

			if (field525 == 1) {
				field414.method249("Friends", true, 55, 41, 0xFFFF00);
			}

			if (field525 == 2) {
				field414.method249("Off", true, 55, 41, 0xFF0000);
			}

			if (field525 == 3) {
				field414.method249("Hide", true, 55, 41, 0xFFFF);
			}

			field414.method249("Private chat", true, 184, 28, 0xFFFFFF);

			if (field152 == 0) {
				field414.method249("On", true, 184, 41, 0xFF00);
			}

			if (field152 == 1) {
				field414.method249("Friends", true, 184, 41, 0xFFFF00);
			}

			if (field152 == 2) {
				field414.method249("Off", true, 184, 41, 0xFF0000);
			}

			field414.method249("Trade/compete", true, 324, 28, 0xFFFFFF);

			if (field287 == 0) {
				field414.method249("On", true, 324, 41, 0xFF00);
			}

			if (field287 == 1) {
				field414.method249("Friends", true, 324, 41, 0xFFFF00);
			}

			if (field287 == 2) {
				field414.method249("Off", true, 324, 41, 0xFF0000);
			}

			field414.method249("Report abuse", true, 458, 33, 0xFFFFFF);
			field208.method466(field1027, 453, 0);
			field398.method465();
		}

		field458 = 0;
	}

	@ObfuscatedName("client.d(IZ)V")
	public final void method203(int arg0) {
		AMSZZFWC var2 = AMSZZFWC.field63[arg0];
		for (int var3 = 0; var3 < var2.field19.length && var2.field19[var3] != -1; var3++) {
			AMSZZFWC var4 = AMSZZFWC.field63[var2.field19[var3]];
			if (var4.field33 == 1) {
				method203(var4.field14);
			}

			var4.field40 = 0;
			var4.field56 = 0;
		}
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method204(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.u(B)V")
	public final void method205() {
		for (ZAHKTBCG var1 = (ZAHKTBCG) field193.method329(); var1 != null; var1 = (ZAHKTBCG) field193.method331()) {
			if (var1.field1457 == -1) {
				var1.field1456 = 0;
				method207(var1);
			} else {
				var1.method1();
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method206(String arg0) {
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

	@ObfuscatedName("client.a(ILZAHKTBCG;)V")
	public final void method207(ZAHKTBCG arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1453 == 0) {
			var2 = field331.method41(arg0.field1452, arg0.field1454, arg0.field1455);
		}

		if (arg0.field1453 == 1) {
			var2 = field331.method42(arg0.field1454, arg0.field1452, arg0.field1455);
		}

		if (arg0.field1453 == 2) {
			var2 = field331.method43(arg0.field1452, arg0.field1454, arg0.field1455);
		}

		if (arg0.field1453 == 3) {
			var2 = field331.method44(arg0.field1452, arg0.field1454, arg0.field1455);
		}

		if (var2 != 0) {
			int var6 = field331.method45(arg0.field1452, arg0.field1454, arg0.field1455, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1449 = var3;
		arg0.field1451 = var4;
		arg0.field1450 = var5;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field480[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field488[var3] = var2 / 4;
		}
	}
}
