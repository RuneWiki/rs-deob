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
public final class client extends EUDZGBGU {

	@ObfuscatedName("client.fb")
	public int field151 = -1;

	@ObfuscatedName("client.kb")
	public int[] field156 = new int[5];

	@ObfuscatedName("client.nb")
	public int[] field158 = new int[TLQAADVO.field1165];

	@ObfuscatedName("client.pb")
	public boolean[] field159 = new boolean[5];

	@ObfuscatedName("client.qb")
	public XGRGMPUQ field160 = new XGRGMPUQ(new byte[5000]);

	@ObfuscatedName("client.rb")
	public DLMOHDFX[] field161 = new DLMOHDFX[16384];

	@ObfuscatedName("client.tb")
	public int[] field163 = new int[16384];

	@ObfuscatedName("client.wb")
	public int[] field165 = new int[7];

	@ObfuscatedName("client.Mb")
	public int[] field178 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Ob")
	public int[] field180 = new int[50];

	@ObfuscatedName("client.Pb")
	public VYAVYWNE field181 = new VYAVYWNE();

	@ObfuscatedName("client.Sb")
	public boolean field184 = false;

	@ObfuscatedName("client.Tb")
	public int[] field185 = new int[TLQAADVO.field1165];

	@ObfuscatedName("client.Wb")
	public int field188 = -1;

	@ObfuscatedName("client.Xb")
	public int field189 = 0x766654;

	@ObfuscatedName("client.Yb")
	public int[] field190 = new int[100];

	@ObfuscatedName("client.Zb")
	public String[] field191 = new String[100];

	@ObfuscatedName("client.ac")
	public String[] field192 = new String[100];

	@ObfuscatedName("client.cc")
	public long[] field194 = new long[200];

	@ObfuscatedName("client.dc")
	public String field195 = "";

	@ObfuscatedName("client.ec")
	public XGRGMPUQ field196 = XGRGMPUQ.method453(1);

	@ObfuscatedName("client.rc")
	public int[] field207 = new int[33];

	@ObfuscatedName("client.tc")
	public int field209 = -1;

	@ObfuscatedName("client.xc")
	public int[][][] field213 = new int[4][13][13];

	@ObfuscatedName("client.Ec")
	public int field219 = 2;

	@ObfuscatedName("client.Fc")
	public final int field220 = 100;

	@ObfuscatedName("client.Gc")
	public int[] field221 = new int[100];

	@ObfuscatedName("client.Hc")
	public long[] field222 = new long[100];

	@ObfuscatedName("client.Ic")
	public int field223 = -1;

	@ObfuscatedName("client.Jc")
	public int field224 = -1;

	@ObfuscatedName("client.Pc")
	public int[] field230 = new int[50];

	@ObfuscatedName("client.Wc")
	public boolean field237 = false;

	@ObfuscatedName("client.Yc")
	public int[] field238 = new int[200];

	@ObfuscatedName("client.ed")
	public int field243 = -1;

	@ObfuscatedName("client.fd")
	public int[] field244 = new int[5];

	@ObfuscatedName("client.hd")
	public boolean field246 = false;

	@ObfuscatedName("client.id")
	public boolean field247 = false;

	@ObfuscatedName("client.jd")
	public boolean field248 = false;

	@ObfuscatedName("client.ld")
	public boolean field250 = false;

	@ObfuscatedName("client.od")
	public byte[] field253 = new byte[16384];

	@ObfuscatedName("client.qd")
	public PDMJJHOP[] field255 = new PDMJJHOP[32];

	@ObfuscatedName("client.zd")
	public VLUKUYNM field260 = new VLUKUYNM();

	@ObfuscatedName("client.Nd")
	public int field274 = 0x23201B;

	@ObfuscatedName("client.Od")
	public int[] field275 = new int[2000];

	@ObfuscatedName("client.Pd")
	public CRC32 field276 = new CRC32();

	@ObfuscatedName("client.Qd")
	public final int[] field277 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Xd")
	public boolean field284 = false;

	@ObfuscatedName("client.Zd")
	public PDMJJHOP[] field286 = new PDMJJHOP[32];

	@ObfuscatedName("client.ce")
	public boolean field289 = false;

	@ObfuscatedName("client.de")
	public String field290 = "";

	@ObfuscatedName("client.ge")
	public boolean field293 = false;

	@ObfuscatedName("client.he")
	public int field294 = -1;

	@ObfuscatedName("client.se")
	public VSJQVIFL[] field305 = new VSJQVIFL[13];

	@ObfuscatedName("client.we")
	public boolean field309 = true;

	@ObfuscatedName("client.xe")
	public int[][] field310 = new int[104][104];

	@ObfuscatedName("client.ye")
	public int field311 = -1;

	@ObfuscatedName("client.ze")
	public int[][] field312 = new int[104][104];

	@ObfuscatedName("client.Ae")
	public int[] field313 = new int[50];

	@ObfuscatedName("client.Be")
	public VLUKUYNM[][][] field314 = new VLUKUYNM[4][104][104];

	@ObfuscatedName("client.De")
	public GQSCEHQI[] field316 = new GQSCEHQI[4];

	@ObfuscatedName("client.He")
	public int field320 = 2;

	@ObfuscatedName("client.Ie")
	public int[] field321 = new int[2000];

	@ObfuscatedName("client.Je")
	public int field322 = 0x332D25;

	@ObfuscatedName("client.Le")
	public boolean field324 = false;

	@ObfuscatedName("client.Me")
	public int[] field325 = new int[33];

	@ObfuscatedName("client.Ne")
	public int field326 = 128;

	@ObfuscatedName("client.Te")
	public volatile boolean field331 = false;

	@ObfuscatedName("client.Ve")
	public int field333 = 1;

	@ObfuscatedName("client.We")
	public VSJQVIFL[] field334 = new VSJQVIFL[2];

	@ObfuscatedName("client.Xe")
	public boolean field335 = true;

	@ObfuscatedName("client.af")
	public PDMJJHOP[] field338 = new PDMJJHOP[20];

	@ObfuscatedName("client.hf")
	public int field345 = -1;

	@ObfuscatedName("client.jf")
	public boolean field346 = false;

	@ObfuscatedName("client.mf")
	public int field349 = 1;

	@ObfuscatedName("client.qf")
	public boolean field353 = false;

	@ObfuscatedName("client.rf")
	public int[][] field354 = new int[104][104];

	@ObfuscatedName("client.tf")
	public int[] field356 = new int[5];

	@ObfuscatedName("client.uf")
	public String[] field357 = new String[5];

	@ObfuscatedName("client.vf")
	public boolean[] field358 = new boolean[5];

	@ObfuscatedName("client.Af")
	public int field363 = -1;

	@ObfuscatedName("client.Gf")
	public XGRGMPUQ field369 = XGRGMPUQ.method453(1);

	@ObfuscatedName("client.Xf")
	public volatile boolean field386 = false;

	@ObfuscatedName("client.Yf")
	public boolean field387 = false;

	@ObfuscatedName("client.ag")
	public int[] field389 = new int[1000];

	@ObfuscatedName("client.bg")
	public int[] field390 = new int[1000];

	@ObfuscatedName("client.cg")
	public String field391 = "";

	@ObfuscatedName("client.dg")
	public String field392 = "";

	@ObfuscatedName("client.hg")
	public int field395 = -1;

	@ObfuscatedName("client.ig")
	public int field396 = 3;

	@ObfuscatedName("client.og")
	public int[] field401 = new int[5];

	@ObfuscatedName("client.pg")
	public int field402 = -1;

	@ObfuscatedName("client.tg")
	public boolean field404 = false;

	@ObfuscatedName("client.Bg")
	public VLUKUYNM field411 = new VLUKUYNM();

	@ObfuscatedName("client.Mg")
	public PDMJJHOP[] field422 = new PDMJJHOP[32];

	@ObfuscatedName("client.Ng")
	public PDMJJHOP[] field423 = new PDMJJHOP[100];

	@ObfuscatedName("client.Og")
	public int field424 = -1;

	@ObfuscatedName("client.Tg")
	public boolean field429 = true;

	@ObfuscatedName("client.Vg")
	public int[] field430 = new int[256];

	@ObfuscatedName("client.Wg")
	public int[] field431 = new int[4000];

	@ObfuscatedName("client.Xg")
	public int[] field432 = new int[4000];

	@ObfuscatedName("client.Yg")
	public PDMJJHOP[] field433 = new PDMJJHOP[1000];

	@ObfuscatedName("client.bh")
	public XGRGMPUQ field435 = XGRGMPUQ.method453(1);

	@ObfuscatedName("client.dh")
	public String field436 = "";

	@ObfuscatedName("client.hh")
	public String field440 = "";

	@ObfuscatedName("client.jh")
	public boolean field442 = false;

	@ObfuscatedName("client.ph")
	public String field448 = "";

	@ObfuscatedName("client.qh")
	public String field449 = "";

	@ObfuscatedName("client.th")
	public int[] field452 = new int[5];

	@ObfuscatedName("client.Bh")
	public boolean field456 = false;

	@ObfuscatedName("client.Ch")
	public boolean field457 = false;

	@ObfuscatedName("client.Ih")
	public String[] field463 = new String[200];

	@ObfuscatedName("client.Sh")
	public int[] field473 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Vh")
	public boolean field475 = false;

	@ObfuscatedName("client.Wh")
	public boolean field476 = false;

	@ObfuscatedName("client.Zh")
	public volatile boolean field479 = false;

	@ObfuscatedName("client.li")
	public int field491 = -1;

	@ObfuscatedName("client.oi")
	public int field494 = 0x4D4233;

	@ObfuscatedName("client.si")
	public int[] field498 = new int[1000];

	@ObfuscatedName("client.vi")
	public int field500 = 78;

	@ObfuscatedName("client.wi")
	public boolean field501 = false;

	@ObfuscatedName("client.yi")
	public int field503 = 50;

	@ObfuscatedName("client.zi")
	public int[] field504 = new int[field503];

	@ObfuscatedName("client.Ai")
	public int[] field505 = new int[field503];

	@ObfuscatedName("client.Bi")
	public int[] field506 = new int[field503];

	@ObfuscatedName("client.Ci")
	public int[] field507 = new int[field503];

	@ObfuscatedName("client.Di")
	public int[] field508 = new int[field503];

	@ObfuscatedName("client.Ei")
	public int[] field509 = new int[field503];

	@ObfuscatedName("client.Fi")
	public int[] field510 = new int[field503];

	@ObfuscatedName("client.Gi")
	public String[] field511 = new String[field503];

	@ObfuscatedName("client.Ii")
	public int field513 = 2048;

	@ObfuscatedName("client.Ji")
	public int field514 = 2047;

	@ObfuscatedName("client.Ki")
	public MTFZASIN[] field515 = new MTFZASIN[field513];

	@ObfuscatedName("client.Mi")
	public int[] field517 = new int[field513];

	@ObfuscatedName("client.Oi")
	public int[] field519 = new int[field513];

	@ObfuscatedName("client.Pi")
	public XGRGMPUQ[] field520 = new XGRGMPUQ[field513];

	@ObfuscatedName("client.Qi")
	public String[] field521 = new String[500];

	@ObfuscatedName("client.Ti")
	public VLUKUYNM field524 = new VLUKUYNM();

	@ObfuscatedName("client.Vi")
	public VSJQVIFL[] field526 = new VSJQVIFL[100];

	@ObfuscatedName("client.Wi")
	public boolean field527 = true;

	@ObfuscatedName("client.ej")
	public boolean field534 = false;

	@ObfuscatedName("client.fj")
	public boolean field535 = false;

	@ObfuscatedName("client.gj")
	public int[] field536 = new int[9];

	@ObfuscatedName("client.hj")
	public PDMJJHOP[] field537 = new PDMJJHOP[8];

	@ObfuscatedName("client.lj")
	public int[] field540 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.oj")
	public int field542 = -1;

	@ObfuscatedName("client.pj")
	public String field543 = "";

	@ObfuscatedName("client.rj")
	public int field544 = -1;

	@ObfuscatedName("client.vj")
	public int[] field546 = new int[151];

	@ObfuscatedName("client.Fj")
	public int[] field556 = new int[TLQAADVO.field1165];

	@ObfuscatedName("client.Gj")
	public int[] field557 = new int[151];

	@ObfuscatedName("client.Ij")
	public int[] field559 = new int[500];

	@ObfuscatedName("client.Jj")
	public int[] field560 = new int[500];

	@ObfuscatedName("client.Kj")
	public int[] field561 = new int[500];

	@ObfuscatedName("client.Lj")
	public int[] field562 = new int[500];

	@ObfuscatedName("client.Oj")
	public IJFFCIDM[] field565 = new IJFFCIDM[5];

	@ObfuscatedName("client.Sj")
	public int field569 = 2;

	@ObfuscatedName("client.Xj")
	public boolean field574 = true;

	@ObfuscatedName("client.cd")
	public static String field241 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.nd")
	public static BigInteger field252 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.ee")
	public static final int[][] field291 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.bf")
	public static int[] field339 = new int[32];

	@ObfuscatedName("client.gf")
	public static final int[] field344 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Hg")
	public static int field417 = 10;

	@ObfuscatedName("client.Jg")
	public static boolean field419 = true;

	@ObfuscatedName("client.Sg")
	public static BigInteger field428 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Zi")
	public static int[] field529 = new int[99];

	@ObfuscatedName("client.K")
	public int field135;

	@ObfuscatedName("client.L")
	public int field136;

	@ObfuscatedName("client.M")
	public int field137;

	@ObfuscatedName("client.N")
	public int field138;

	@ObfuscatedName("client.O")
	public int field139;

	@ObfuscatedName("client.P")
	public int field140;

	@ObfuscatedName("client.Q")
	public int field141;

	@ObfuscatedName("client.R")
	public int field142;

	@ObfuscatedName("client.S")
	public static int field143;

	@ObfuscatedName("client.W")
	public int field146;

	@ObfuscatedName("client.Y")
	public int field147;

	@ObfuscatedName("client.bb")
	public static int field148;

	@ObfuscatedName("client.eb")
	public int field150;

	@ObfuscatedName("client.gb")
	public int field152;

	@ObfuscatedName("client.hb")
	public int field153;

	@ObfuscatedName("client.ib")
	public int field154;

	@ObfuscatedName("client.jb")
	public int field155;

	@ObfuscatedName("client.lb")
	public static int field157;

	@ObfuscatedName("client.sb")
	public int field162;

	@ObfuscatedName("client.ub")
	public int field164;

	@ObfuscatedName("client.xb")
	public int field166;

	@ObfuscatedName("client.yb")
	public int field167;

	@ObfuscatedName("client.zb")
	public int field168;

	@ObfuscatedName("client.Ab")
	public int field169;

	@ObfuscatedName("client.Bb")
	public int field170;

	@ObfuscatedName("client.Cb")
	public int field171;

	@ObfuscatedName("client.Gb")
	public int field172;

	@ObfuscatedName("client.Hb")
	public int field173;

	@ObfuscatedName("client.Ib")
	public int field174;

	@ObfuscatedName("client.Jb")
	public int field175;

	@ObfuscatedName("client.Kb")
	public int field176;

	@ObfuscatedName("client.Lb")
	public int field177;

	@ObfuscatedName("client.Nb")
	public int field179;

	@ObfuscatedName("client.Rb")
	public int field183;

	@ObfuscatedName("client.fc")
	public int field197;

	@ObfuscatedName("client.gc")
	public int field198;

	@ObfuscatedName("client.hc")
	public int field199;

	@ObfuscatedName("client.ic")
	public int field200;

	@ObfuscatedName("client.kc")
	public int field202;

	@ObfuscatedName("client.mc")
	public int field203;

	@ObfuscatedName("client.sc")
	public int field208;

	@ObfuscatedName("client.uc")
	public int field210;

	@ObfuscatedName("client.vc")
	public int field211;

	@ObfuscatedName("client.wc")
	public int field212;

	@ObfuscatedName("client.yc")
	public int field214;

	@ObfuscatedName("client.zc")
	public int field215;

	@ObfuscatedName("client.Ac")
	public int field216;

	@ObfuscatedName("client.Dc")
	public int field218;

	@ObfuscatedName("client.Oc")
	public int field229;

	@ObfuscatedName("client.Rc")
	public int field232;

	@ObfuscatedName("client.Sc")
	public int field233;

	@ObfuscatedName("client.Uc")
	public int field235;

	@ObfuscatedName("client.Zc")
	public int field239;

	@ObfuscatedName("client.ad")
	public int field240;

	@ObfuscatedName("client.dd")
	public int field242;

	@ObfuscatedName("client.md")
	public int field251;

	@ObfuscatedName("client.pd")
	public int field254;

	@ObfuscatedName("client.wd")
	public int field258;

	@ObfuscatedName("client.xd")
	public int field259;

	@ObfuscatedName("client.Gd")
	public int field267;

	@ObfuscatedName("client.Hd")
	public static int field268;

	@ObfuscatedName("client.Ld")
	public int field272;

	@ObfuscatedName("client.Md")
	public int field273;

	@ObfuscatedName("client.Sd")
	public int field279;

	@ObfuscatedName("client.Td")
	public int field280;

	@ObfuscatedName("client.Ud")
	public int field281;

	@ObfuscatedName("client.Vd")
	public int field282;

	@ObfuscatedName("client.Wd")
	public int field283;

	@ObfuscatedName("client.ae")
	public int field287;

	@ObfuscatedName("client.be")
	public static int field288;

	@ObfuscatedName("client.fe")
	public int field292;

	@ObfuscatedName("client.ke")
	public static int field297;

	@ObfuscatedName("client.le")
	public int field298;

	@ObfuscatedName("client.re")
	public int field304;

	@ObfuscatedName("client.te")
	public int field306;

	@ObfuscatedName("client.ve")
	public int field308;

	@ObfuscatedName("client.Ce")
	public static int field315;

	@ObfuscatedName("client.Ee")
	public int field317;

	@ObfuscatedName("client.Fe")
	public int field318;

	@ObfuscatedName("client.Ge")
	public int field319;

	@ObfuscatedName("client.Ke")
	public int field323;

	@ObfuscatedName("client.Oe")
	public int field327;

	@ObfuscatedName("client.Pe")
	public int field328;

	@ObfuscatedName("client.Qe")
	public int field329;

	@ObfuscatedName("client.Ue")
	public int field332;

	@ObfuscatedName("client.Ye")
	public static int field336;

	@ObfuscatedName("client.kf")
	public int field347;

	@ObfuscatedName("client.lf")
	public int field348;

	@ObfuscatedName("client.nf")
	public int field350;

	@ObfuscatedName("client.of")
	public int field351;

	@ObfuscatedName("client.pf")
	public int field352;

	@ObfuscatedName("client.sf")
	public int field355;

	@ObfuscatedName("client.wf")
	public int field359;

	@ObfuscatedName("client.xf")
	public int field360;

	@ObfuscatedName("client.zf")
	public int field362;

	@ObfuscatedName("client.Bf")
	public int field364;

	@ObfuscatedName("client.Cf")
	public int field365;

	@ObfuscatedName("client.Jf")
	public int field372;

	@ObfuscatedName("client.Kf")
	public int field373;

	@ObfuscatedName("client.Lf")
	public int field374;

	@ObfuscatedName("client.Mf")
	public int field375;

	@ObfuscatedName("client.Nf")
	public int field376;

	@ObfuscatedName("client.Of")
	public int field377;

	@ObfuscatedName("client.Pf")
	public int field378;

	@ObfuscatedName("client.Qf")
	public int field379;

	@ObfuscatedName("client.Rf")
	public int field380;

	@ObfuscatedName("client.Sf")
	public int field381;

	@ObfuscatedName("client.Zf")
	public int field388;

	@ObfuscatedName("client.fg")
	public int field393;

	@ObfuscatedName("client.kg")
	public int field397;

	@ObfuscatedName("client.lg")
	public int field398;

	@ObfuscatedName("client.mg")
	public int field399;

	@ObfuscatedName("client.ng")
	public int field400;

	@ObfuscatedName("client.rg")
	public int field403;

	@ObfuscatedName("client.ug")
	public int field405;

	@ObfuscatedName("client.vg")
	public int field406;

	@ObfuscatedName("client.wg")
	public int field407;

	@ObfuscatedName("client.xg")
	public int field408;

	@ObfuscatedName("client.yg")
	public int field409;

	@ObfuscatedName("client.Ag")
	public int field410;

	@ObfuscatedName("client.Dg")
	public int field413;

	@ObfuscatedName("client.Eg")
	public int field414;

	@ObfuscatedName("client.Fg")
	public int field415;

	@ObfuscatedName("client.Gg")
	public int field416;

	@ObfuscatedName("client.Ig")
	public static int field418;

	@ObfuscatedName("client.Lg")
	public int field421;

	@ObfuscatedName("client.Rg")
	public static int field427;

	@ObfuscatedName("client.Zg")
	public int field434;

	@ObfuscatedName("client.eh")
	public int field437;

	@ObfuscatedName("client.ih")
	public int field441;

	@ObfuscatedName("client.rh")
	public int field450;

	@ObfuscatedName("client.sh")
	public int field451;

	@ObfuscatedName("client.wh")
	public int field453;

	@ObfuscatedName("client.Dh")
	public int field458;

	@ObfuscatedName("client.Eh")
	public int field459;

	@ObfuscatedName("client.Fh")
	public int field460;

	@ObfuscatedName("client.Gh")
	public int field461;

	@ObfuscatedName("client.Hh")
	public int field462;

	@ObfuscatedName("client.Xh")
	public static int field477;

	@ObfuscatedName("client.Yh")
	public static int field478;

	@ObfuscatedName("client.ei")
	public int field484;

	@ObfuscatedName("client.fi")
	public int field485;

	@ObfuscatedName("client.gi")
	public int field486;

	@ObfuscatedName("client.hi")
	public int field487;

	@ObfuscatedName("client.pi")
	public int field495;

	@ObfuscatedName("client.qi")
	public int field496;

	@ObfuscatedName("client.ri")
	public int field497;

	@ObfuscatedName("client.ui")
	public int field499;

	@ObfuscatedName("client.xi")
	public int field502;

	@ObfuscatedName("client.Hi")
	public static int field512;

	@ObfuscatedName("client.Li")
	public int field516;

	@ObfuscatedName("client.Ni")
	public int field518;

	@ObfuscatedName("client.Ri")
	public int field522;

	@ObfuscatedName("client.Si")
	public int field523;

	@ObfuscatedName("client.Ui")
	public int field525;

	@ObfuscatedName("client.Xi")
	public int field528;

	@ObfuscatedName("client.aj")
	public static int field530;

	@ObfuscatedName("client.bj")
	public int field531;

	@ObfuscatedName("client.cj")
	public static int field532;

	@ObfuscatedName("client.dj")
	public int field533;

	@ObfuscatedName("client.jj")
	public int field538;

	@ObfuscatedName("client.kj")
	public int field539;

	@ObfuscatedName("client.tj")
	public static int field545;

	@ObfuscatedName("client.Hj")
	public int field558;

	@ObfuscatedName("client.Mj")
	public int field563;

	@ObfuscatedName("client.Nj")
	public static int field564;

	@ObfuscatedName("client.Pj")
	public int field566;

	@ObfuscatedName("client.Qj")
	public int field567;

	@ObfuscatedName("client.Rj")
	public int field568;

	@ObfuscatedName("client.Ub")
	public long field186;

	@ObfuscatedName("client.Vb")
	public long field187;

	@ObfuscatedName("client.bc")
	public long field193;

	@ObfuscatedName("client.yf")
	public long field361;

	@ObfuscatedName("client.mj")
	public long field541;

	@ObfuscatedName("client.Ad")
	public AAVSEYUK field261;

	@ObfuscatedName("client.Jh")
	public BVMYRJQC field464;

	@ObfuscatedName("client.Kh")
	public BVMYRJQC field465;

	@ObfuscatedName("client.Lh")
	public BVMYRJQC field466;

	@ObfuscatedName("client.Mh")
	public BVMYRJQC field467;

	@ObfuscatedName("client.Nh")
	public BVMYRJQC field468;

	@ObfuscatedName("client.Oh")
	public BVMYRJQC field469;

	@ObfuscatedName("client.Ph")
	public BVMYRJQC field470;

	@ObfuscatedName("client.Qh")
	public BVMYRJQC field471;

	@ObfuscatedName("client.Rh")
	public BVMYRJQC field472;

	@ObfuscatedName("client.ai")
	public BVMYRJQC field480;

	@ObfuscatedName("client.bi")
	public BVMYRJQC field481;

	@ObfuscatedName("client.ci")
	public BVMYRJQC field482;

	@ObfuscatedName("client.di")
	public BVMYRJQC field483;

	@ObfuscatedName("client.ii")
	public BVMYRJQC field488;

	@ObfuscatedName("client.ji")
	public BVMYRJQC field489;

	@ObfuscatedName("client.ki")
	public BVMYRJQC field490;

	@ObfuscatedName("client.wj")
	public BVMYRJQC field547;

	@ObfuscatedName("client.xj")
	public BVMYRJQC field548;

	@ObfuscatedName("client.yj")
	public BVMYRJQC field549;

	@ObfuscatedName("client.zj")
	public BVMYRJQC field550;

	@ObfuscatedName("client.Aj")
	public BVMYRJQC field551;

	@ObfuscatedName("client.Bj")
	public BVMYRJQC field552;

	@ObfuscatedName("client.Cj")
	public BVMYRJQC field553;

	@ObfuscatedName("client.Dj")
	public BVMYRJQC field554;

	@ObfuscatedName("client.Ej")
	public BVMYRJQC field555;

	@ObfuscatedName("client.Rd")
	public ENXSCLLS field278;

	@ObfuscatedName("client.Tj")
	public KGPDNFPL field570;

	@ObfuscatedName("client.Uj")
	public KGPDNFPL field571;

	@ObfuscatedName("client.Vj")
	public KGPDNFPL field572;

	@ObfuscatedName("client.Wj")
	public KGPDNFPL field573;

	@ObfuscatedName("client.nc")
	public LAQKYZGL field204;

	@ObfuscatedName("client.kd")
	public MJLXHQTQ field249;

	@ObfuscatedName("client.cb")
	public static MTFZASIN field149;

	@ObfuscatedName("client.Uh")
	public OQEOESGS field474;

	@ObfuscatedName("client.Tc")
	public PDMJJHOP field234;

	@ObfuscatedName("client.Vc")
	public PDMJJHOP field236;

	@ObfuscatedName("client.ie")
	public PDMJJHOP field295;

	@ObfuscatedName("client.je")
	public PDMJJHOP field296;

	@ObfuscatedName("client.cf")
	public PDMJJHOP field340;

	@ObfuscatedName("client.Hf")
	public PDMJJHOP field370;

	@ObfuscatedName("client.If")
	public PDMJJHOP field371;

	@ObfuscatedName("client.Cg")
	public PDMJJHOP field412;

	@ObfuscatedName("client.fh")
	public PDMJJHOP field438;

	@ObfuscatedName("client.gh")
	public PDMJJHOP field439;

	@ObfuscatedName("client.kh")
	public PDMJJHOP field443;

	@ObfuscatedName("client.lh")
	public PDMJJHOP field444;

	@ObfuscatedName("client.mh")
	public PDMJJHOP field445;

	@ObfuscatedName("client.nh")
	public PDMJJHOP field446;

	@ObfuscatedName("client.oh")
	public PDMJJHOP field447;

	@ObfuscatedName("client.rd")
	public VSJQVIFL field256;

	@ObfuscatedName("client.sd")
	public VSJQVIFL field257;

	@ObfuscatedName("client.Bd")
	public VSJQVIFL field262;

	@ObfuscatedName("client.Cd")
	public VSJQVIFL field263;

	@ObfuscatedName("client.Dd")
	public VSJQVIFL field264;

	@ObfuscatedName("client.Ed")
	public VSJQVIFL field265;

	@ObfuscatedName("client.Fd")
	public VSJQVIFL field266;

	@ObfuscatedName("client.Id")
	public VSJQVIFL field269;

	@ObfuscatedName("client.Jd")
	public VSJQVIFL field270;

	@ObfuscatedName("client.Kd")
	public VSJQVIFL field271;

	@ObfuscatedName("client.me")
	public VSJQVIFL field299;

	@ObfuscatedName("client.ne")
	public VSJQVIFL field300;

	@ObfuscatedName("client.oe")
	public VSJQVIFL field301;

	@ObfuscatedName("client.pe")
	public VSJQVIFL field302;

	@ObfuscatedName("client.qe")
	public VSJQVIFL field303;

	@ObfuscatedName("client.Df")
	public VSJQVIFL field366;

	@ObfuscatedName("client.Ef")
	public VSJQVIFL field367;

	@ObfuscatedName("client.Ff")
	public VSJQVIFL field368;

	@ObfuscatedName("client.mi")
	public VSJQVIFL field492;

	@ObfuscatedName("client.ni")
	public VSJQVIFL field493;

	@ObfuscatedName("client.gg")
	public YDQEOBYY field394;

	@ObfuscatedName("client.jc")
	public String field201;

	@ObfuscatedName("client.Bc")
	public String field217;

	@ObfuscatedName("client.Yd")
	public String field285;

	@ObfuscatedName("client.Se")
	public String field330;

	@ObfuscatedName("client.V")
	public Socket field145;

	@ObfuscatedName("client.gd")
	public static boolean field245;

	@ObfuscatedName("client.ue")
	public static boolean field307;

	@ObfuscatedName("client.Kg")
	public static boolean field420;

	@ObfuscatedName("client.Ah")
	public static boolean field455;

	@ObfuscatedName("client.oc")
	public int[] field205;

	@ObfuscatedName("client.pc")
	public int[] field206;

	@ObfuscatedName("client.Kc")
	public int[] field225;

	@ObfuscatedName("client.Lc")
	public int[] field226;

	@ObfuscatedName("client.Mc")
	public int[] field227;

	@ObfuscatedName("client.Nc")
	public int[] field228;

	@ObfuscatedName("client.df")
	public int[] field341;

	@ObfuscatedName("client.ef")
	public int[] field342;

	@ObfuscatedName("client.ff")
	public int[] field343;

	@ObfuscatedName("client.Tf")
	public int[] field382;

	@ObfuscatedName("client.Uf")
	public int[] field383;

	@ObfuscatedName("client.Vf")
	public int[] field384;

	@ObfuscatedName("client.Wf")
	public int[] field385;

	@ObfuscatedName("client.Pg")
	public int[] field425;

	@ObfuscatedName("client.Qg")
	public int[] field426;

	@ObfuscatedName("client.xh")
	public VSJQVIFL[] field454;

	@ObfuscatedName("client.Qc")
	public byte[][] field231;

	@ObfuscatedName("client.Ze")
	public byte[][] field337;

	@ObfuscatedName("client.Qb")
	public byte[][][] field182;

	@ObfuscatedName("client.U")
	public int[][][] field144;

	@ObfuscatedName("client.b(II)V")
	public final void method43(int arg0) {
		VYAVYWNE.method398(arg0);
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method44() {
		if (field483 == null) {
			method188();
			field677 = null;
			field547 = null;
			field548 = null;
			field549 = null;
			field550 = null;
			field551 = null;
			field552 = null;
			field553 = null;
			field554 = null;
			field555 = null;
			field483 = new BVMYRJQC(96, method107(), 479);
			field481 = new BVMYRJQC(156, method107(), 172);
			IGZZCJOU.method243();
			field367.method374(0, 0);
			field480 = new BVMYRJQC(261, method107(), 190);
			field482 = new BVMYRJQC(334, method107(), 512);
			IGZZCJOU.method243();
			field488 = new BVMYRJQC(50, method107(), 496);
			field489 = new BVMYRJQC(37, method107(), 269);
			field490 = new BVMYRJQC(45, method107(), 249);
			field324 = true;
			field482.method34();
			VWUXWWMW.field1200 = field384;
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method45() {
		for (int var1 = -1; var1 < field516; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field514;
			} else {
				var2 = field517[var1];
			}

			MTFZASIN var3 = field515[var2];
			if (var3 != null && var3.field610 > 0) {
				var3.field610--;
				if (var3.field610 == 0) {
					var3.field609 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field162; var4++) {
			int var5 = field163[var4];
			DLMOHDFX var6 = field161[var5];
			if (var6 != null && var6.field610 > 0) {
				var6.field610--;
				if (var6.field610 == 0) {
					var6.field609 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public static final void method46() {
		YDQEOBYY.field1444 = true;
		VWUXWWMW.field1189 = true;
		field420 = true;
		VZMNLGCR.field1381 = true;
		BMWIVHMF.field92 = true;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method47(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method47(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method48() {
		BMWIVHMF.field106.method195();
		BMWIVHMF.field93.method195();
		KFUEEJVZ.field893.method195();
		HJAQAKAW.field744.method195();
		HJAQAKAW.field752.method195();
		MTFZASIN.field1090.method195();
		BKJQHSVH.field65.method195();
	}

	@ObfuscatedName("client.g(I)V")
	public static final void method49() {
		YDQEOBYY.field1444 = false;
		VWUXWWMW.field1189 = false;
		field420 = false;
		VZMNLGCR.field1381 = false;
		BMWIVHMF.field92 = false;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method50(long arg0) {
		if (arg0 != 0L) {
			if (field153 >= 100 && field441 != 1) {
				method133(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field153 >= 200) {
				method133(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = CIRLBWBX.method41(CIRLBWBX.method38(arg0));
				for (int var4 = 0; var4 < field153; var4++) {
					if (field194[var4] == arg0) {
						method133(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field211; var5++) {
					if (field222[var5] == arg0) {
						method133(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field149.field1091)) {
					field463[field153] = var3;
					field194[field153] = arg0;
					field238[field153] = 0;
					field153++;
					field457 = true;
					field369.method454(229);
					field369.method461(arg0);
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field679 != null) {
				return new URL("http://127.0.0.1:" + (field418 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(ILXGRGMPUQ;I)V")
	public final void method51(int arg0, XGRGMPUQ arg1) {
		for (int var3 = 0; var3 < field518; var3++) {
			int var4 = field519[var3];
			MTFZASIN var5 = field515[var4];
			int var6 = arg1.method465();
			if ((var6 & 0x40) != 0) {
				var6 += arg1.method465() << 8;
			}

			method148(var5, var6, var4, arg1);
		}
	}

	@ObfuscatedName("client.a(ZLVYAVYWNE;)Z")
	public final boolean method52(VYAVYWNE arg0) {
		int var2 = arg0.field1273;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field521[field212] = "Remove @whi@" + arg0.field1233;
				field561[field212] = 663;
				field212++;
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

		field521[field212] = "Remove @whi@" + field463[var2];
		field561[field212] = 633;
		field212++;
		field521[field212] = "Message @whi@" + field463[var2];
		field561[field212] = 144;
		field212++;
		return true;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method53() {
		signlink.reporterror = false;

		try {
			if (field261 != null) {
				field261.method1();
			}
		} catch (Exception var1) {
		}

		field261 = null;
		method134();

		if (field474 != null) {
			field474.field1132 = false;
		}

		field474 = null;
		field204.method295();
		field204 = null;
		field160 = null;
		field369 = null;
		field435 = null;
		field196 = null;
		field341 = null;
		field231 = null;
		field337 = null;
		field342 = null;
		field343 = null;
		field144 = null;
		field182 = null;
		field394 = null;
		field316 = null;
		field310 = null;
		field312 = null;
		field431 = null;
		field432 = null;
		field253 = null;
		field480 = null;
		field481 = null;
		field482 = null;
		field483 = null;
		field488 = null;
		field489 = null;
		field490 = null;
		field464 = null;
		field465 = null;
		field466 = null;
		field467 = null;
		field468 = null;
		field469 = null;
		field470 = null;
		field471 = null;
		field472 = null;
		field366 = null;
		field367 = null;
		field368 = null;
		field269 = null;
		field270 = null;
		field271 = null;
		field305 = null;
		field262 = null;
		field263 = null;
		field264 = null;
		field265 = null;
		field266 = null;
		field299 = null;
		field300 = null;
		field301 = null;
		field302 = null;
		field303 = null;
		field412 = null;
		field338 = null;
		field255 = null;
		field286 = null;
		field422 = null;
		field537 = null;
		field340 = null;
		field443 = null;
		field444 = null;
		field445 = null;
		field446 = null;
		field447 = null;
		field526 = null;
		field423 = null;
		field354 = null;
		field515 = null;
		field517 = null;
		field519 = null;
		field520 = null;
		field498 = null;
		field161 = null;
		field163 = null;
		field314 = null;
		field524 = null;
		field411 = null;
		field260 = null;
		field559 = null;
		field560 = null;
		field561 = null;
		field562 = null;
		field521 = null;
		field275 = null;
		field389 = null;
		field390 = null;
		field433 = null;
		field234 = null;
		field463 = null;
		field194 = null;
		field238 = null;
		field550 = null;
		field551 = null;
		field547 = null;
		field548 = null;
		field549 = null;
		field552 = null;
		field553 = null;
		field554 = null;
		field555 = null;
		method188();
		BMWIVHMF.method31();
		KFUEEJVZ.method269();
		HJAQAKAW.method230();
		VYAVYWNE.method396();
		NVLIPBUR.field1115 = null;
		BLFCIBLQ.field67 = null;
		AZGHAWGC.field28 = null;
		MJVHTYCA.field1044 = null;
		BKJQHSVH.field53 = null;
		BKJQHSVH.field65 = null;
		KVOIHOSF.field919 = null;
		field677 = null;
		MTFZASIN.field1090 = null;
		VWUXWWMW.method376();
		YDQEOBYY.method501();
		VYUQHOMO.method403();
		APJPJMYV.method9();
		System.gc();
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method54() {
		if (field677 == null) {
			method188();
			field547 = null;
			field548 = null;
			field549 = null;
			field550 = null;
			field551 = null;
			field552 = null;
			field553 = null;
			field554 = null;
			field555 = null;
			field483 = null;
			field481 = null;
			field480 = null;
			field482 = null;
			field488 = null;
			field489 = null;
			field490 = null;
			field677 = new BVMYRJQC(503, method107(), 765);
			field324 = true;
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method55(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field394.method528(arg2, arg0, arg1);
		if (var6 != 0) {
			int var7 = field394.method532(arg2, arg0, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field234.field1145;
			int var12 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			BMWIVHMF var14 = BMWIVHMF.method30(var13);
			if (var14.field89 == -1) {
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
				VSJQVIFL var15 = field526[var14.field89];
				if (var15 != null) {
					int var16 = (var14.field85 * 4 - var15.field1183) / 2;
					int var17 = (var14.field102 * 4 - var15.field1184) / 2;
					var15.method374((104 - arg1 - var14.field102) * 4 + var17 + 48, arg0 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field394.method530(arg2, arg0, arg1);
		if (var18 != 0) {
			int var19 = field394.method532(arg2, arg0, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			BMWIVHMF var23 = BMWIVHMF.method30(var22);
			if (var23.field89 != -1) {
				VSJQVIFL var24 = field526[var23.field89];
				if (var24 != null) {
					int var25 = (var23.field85 * 4 - var24.field1183) / 2;
					int var26 = (var23.field102 * 4 - var24.field1184) / 2;
					var24.method374((104 - arg1 - var23.field102) * 4 + var26 + 48, arg0 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field234.field1145;
				int var29 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = field394.method531(arg2, arg0, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			BMWIVHMF var32 = BMWIVHMF.method30(var31);
			if (var32.field89 != -1) {
				VSJQVIFL var33 = field526[var32.field89];
				if (var33 != null) {
					int var34 = (var32.field85 * 4 - var33.field1183) / 2;
					int var35 = (var32.field102 * 4 - var33.field1184) / 2;
					var33.method374((104 - arg1 - var32.field102) * 4 + var35 + 48, arg0 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method56(boolean arg0) {
		for (int var2 = 0; var2 < field162; var2++) {
			DLMOHDFX var3 = field161[field163[var2]];
			int var4 = (field163[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method192() && var3.field599.field872 == arg0 && var3.field599.method268()) {
				int var5 = var3.field654 >> 7;
				int var6 = var3.field655 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field619 == 1 && (var3.field654 & 0x7F) == 0x40 && (var3.field655 & 0x7F) == 0x40) {
						if (field354[var5][var6] == field499) {
							continue;
						}

						field354[var5][var6] = field499;
					}

					if (!var3.field599.field887) {
						var4 += Integer.MIN_VALUE;
					}

					field394.method513(var3.field654, method95(var3.field654, var3.field655, field359), (var3.field619 - 1) * 64 + 60, var4, var3.field655, field359, var3, var3.field656, var3.field634);
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method57() {
		field427++;
		if (field427 > 92) {
			field427 = 0;
			field369.method454(15);
		}

		for (int var1 = 0; var1 < field162; var1++) {
			int var2 = field163[var1];
			DLMOHDFX var3 = field161[var2];
			if (var3 != null) {
				method58(var3, var3.field599.field865);
			}
		}
	}

	@ObfuscatedName("client.a(LDSYLCNKR;II)V")
	public final void method58(DSYLCNKR arg0, int arg1) {
		if (arg0.field654 < 128 || arg0.field655 < 128 || arg0.field654 >= 13184 || arg0.field655 >= 13184) {
			arg0.field611 = -1;
			arg0.field640 = -1;
			arg0.field631 = 0;
			arg0.field632 = 0;
			arg0.field654 = arg0.field635[0] * 128 + arg0.field619 * 64;
			arg0.field655 = arg0.field636[0] * 128 + arg0.field619 * 64;
			arg0.method196();
		}

		if (field149 == arg0 && (arg0.field654 < 1536 || arg0.field655 < 1536 || arg0.field654 >= 11776 || arg0.field655 >= 11776)) {
			arg0.field611 = -1;
			arg0.field640 = -1;
			arg0.field631 = 0;
			arg0.field632 = 0;
			arg0.field654 = arg0.field635[0] * 128 + arg0.field619 * 64;
			arg0.field655 = arg0.field636[0] * 128 + arg0.field619 * 64;
			arg0.method196();
		}

		if (arg0.field631 > field512) {
			method59(arg0);
		} else if (arg0.field632 >= field512) {
			method60(arg0);
		} else {
			method61(arg0);
		}

		method62(arg0);
		method63(arg0);
	}

	@ObfuscatedName("client.a(BLDSYLCNKR;)V")
	public final void method59(DSYLCNKR arg0) {
		int var2 = arg0.field631 - field512;
		int var3 = arg0.field627 * 128 + arg0.field619 * 64;
		int var4 = arg0.field629 * 128 + arg0.field619 * 64;
		arg0.field654 += (var3 - arg0.field654) / var2;
		arg0.field655 += (var4 - arg0.field655) / var2;
		arg0.field649 = 0;

		if (arg0.field633 == 0) {
			arg0.field639 = 1024;
		}

		if (arg0.field633 == 1) {
			arg0.field639 = 1536;
		}

		if (arg0.field633 == 2) {
			arg0.field639 = 0;
		}

		if (arg0.field633 == 3) {
			arg0.field639 = 512;
		}
	}

	@ObfuscatedName("client.a(ILDSYLCNKR;)V")
	public final void method60(DSYLCNKR arg0) {
		if (field512 == arg0.field632 || arg0.field611 == -1 || arg0.field614 != 0 || arg0.field613 + 1 > MJVHTYCA.field1044[arg0.field611].method319(arg0.field612)) {
			int var2 = arg0.field632 - arg0.field631;
			int var3 = field512 - arg0.field631;
			int var4 = arg0.field627 * 128 + arg0.field619 * 64;
			int var5 = arg0.field629 * 128 + arg0.field619 * 64;
			int var6 = arg0.field628 * 128 + arg0.field619 * 64;
			int var7 = arg0.field630 * 128 + arg0.field619 * 64;
			arg0.field654 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field655 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field649 = 0;

		if (arg0.field633 == 0) {
			arg0.field639 = 1024;
		}

		if (arg0.field633 == 1) {
			arg0.field639 = 1536;
		}

		if (arg0.field633 == 2) {
			arg0.field639 = 0;
		}

		if (arg0.field633 == 3) {
			arg0.field639 = 512;
		}

		arg0.field656 = arg0.field639;
	}

	@ObfuscatedName("client.a(LDSYLCNKR;B)V")
	public final void method61(DSYLCNKR arg0) {
		arg0.field646 = arg0.field659;
		if (arg0.field651 == 0) {
			arg0.field649 = 0;
		} else {
			if (arg0.field611 != -1 && arg0.field614 == 0) {
				MJVHTYCA var2 = MJVHTYCA.field1044[arg0.field611];
				if (arg0.field638 > 0 && var2.field1056 == 0) {
					arg0.field649++;
					return;
				}

				if (arg0.field638 <= 0 && var2.field1057 == 0) {
					arg0.field649++;
					return;
				}
			}

			int var3 = arg0.field654;
			int var4 = arg0.field655;
			int var5 = arg0.field635[arg0.field651 - 1] * 128 + arg0.field619 * 64;
			int var6 = arg0.field636[arg0.field651 - 1] * 128 + arg0.field619 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field639 = 1280;
					} else if (var4 > var6) {
						arg0.field639 = 1792;
					} else {
						arg0.field639 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field639 = 768;
					} else if (var4 > var6) {
						arg0.field639 = 256;
					} else {
						arg0.field639 = 512;
					}
				} else if (var4 < var6) {
					arg0.field639 = 1024;
				} else {
					arg0.field639 = 0;
				}

				int var7 = arg0.field639 - arg0.field656 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field624;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field623;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field626;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field625;
				}

				if (var8 == -1) {
					var8 = arg0.field623;
				}

				arg0.field646 = var8;
				int var9 = 4;
				if (arg0.field656 != arg0.field639 && arg0.field637 == -1 && arg0.field650 != 0) {
					var9 = 2;
				}

				if (arg0.field651 > 2) {
					var9 = 6;
				}

				if (arg0.field651 > 3) {
					var9 = 8;
				}

				if (arg0.field649 > 0 && arg0.field651 > 1) {
					var9 = 8;
					arg0.field649--;
				}

				if (arg0.field608[arg0.field651 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field646 == arg0.field623 && arg0.field658 != -1) {
					arg0.field646 = arg0.field658;
				}

				if (var3 < var5) {
					arg0.field654 += var9;
					if (arg0.field654 > var5) {
						arg0.field654 = var5;
					}
				} else if (var3 > var5) {
					arg0.field654 -= var9;
					if (arg0.field654 < var5) {
						arg0.field654 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field655 += var9;
					if (arg0.field655 > var6) {
						arg0.field655 = var6;
					}
				} else if (var4 > var6) {
					arg0.field655 -= var9;
					if (arg0.field655 < var6) {
						arg0.field655 = var6;
					}
				}

				if (arg0.field654 == var5 && arg0.field655 == var6) {
					arg0.field651--;

					if (arg0.field638 > 0) {
						arg0.field638--;
						return;
					}
				}
			} else {
				arg0.field654 = var5;
				arg0.field655 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LDSYLCNKR;I)V")
	public final void method62(DSYLCNKR arg0) {
		if (arg0.field650 != 0) {
			if (arg0.field637 != -1 && arg0.field637 < 32768) {
				DLMOHDFX var2 = field161[arg0.field637];
				if (var2 != null) {
					int var3 = arg0.field654 - var2.field654;
					int var4 = arg0.field655 - var2.field655;
					if (var3 != 0 || var4 != 0) {
						arg0.field639 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field637 >= 32768) {
				int var5 = arg0.field637 - 32768;
				if (field243 == var5) {
					var5 = field514;
				}

				MTFZASIN var6 = field515[var5];
				if (var6 != null) {
					int var7 = arg0.field654 - var6.field654;
					int var8 = arg0.field655 - var6.field655;
					if (var7 != 0 || var8 != 0) {
						arg0.field639 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field652 != 0 || arg0.field653 != 0) && (arg0.field651 == 0 || arg0.field649 > 0)) {
				int var9 = arg0.field654 - (arg0.field652 - field413 - field413) * 64;
				int var10 = arg0.field655 - (arg0.field653 - field414 - field414) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field639 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field652 = 0;
				arg0.field653 = 0;
			}

			int var11 = arg0.field639 - arg0.field656 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field650 || var11 > 2048 - arg0.field650) {
					arg0.field656 = arg0.field639;
				} else if (var11 > 1024) {
					arg0.field656 -= arg0.field650;
				} else {
					arg0.field656 += arg0.field650;
				}

				arg0.field656 &= 0x7FF;
				if (arg0.field659 == arg0.field646 && arg0.field656 != arg0.field639) {
					if (arg0.field660 != -1) {
						arg0.field646 = arg0.field660;
						return;
					}

					arg0.field646 = arg0.field623;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(BLDSYLCNKR;)V")
	public final void method63(DSYLCNKR arg0) {
		arg0.field634 = false;

		if (arg0.field646 != -1) {
			MJVHTYCA var2 = MJVHTYCA.field1044[arg0.field646];
			arg0.field648++;
			if (arg0.field647 < var2.field1045 && arg0.field648 > var2.method319(arg0.field647)) {
				arg0.field648 = 0;
				arg0.field647++;
			}

			if (arg0.field647 >= var2.field1045) {
				arg0.field648 = 0;
				arg0.field647 = 0;
			}
		}

		if (arg0.field640 != -1 && field512 >= arg0.field643) {
			if (arg0.field641 < 0) {
				arg0.field641 = 0;
			}

			MJVHTYCA var3 = BKJQHSVH.field53[arg0.field640].field57;
			arg0.field642++;
			while (arg0.field641 < var3.field1045 && arg0.field642 > var3.method319(arg0.field641)) {
				arg0.field642 -= var3.method319(arg0.field641);
				arg0.field641++;
			}

			if (arg0.field641 >= var3.field1045 && (arg0.field641 < 0 || arg0.field641 >= var3.field1045)) {
				arg0.field640 = -1;
			}
		}

		if (arg0.field611 != -1 && arg0.field614 <= 1) {
			MJVHTYCA var4 = MJVHTYCA.field1044[arg0.field611];
			if (var4.field1056 == 1 && arg0.field638 > 0 && arg0.field631 <= field512 && arg0.field632 < field512) {
				arg0.field614 = 1;
				return;
			}
		}

		if (arg0.field611 != -1 && arg0.field614 == 0) {
			MJVHTYCA var5 = MJVHTYCA.field1044[arg0.field611];
			arg0.field613++;
			while (arg0.field612 < var5.field1045 && arg0.field613 > var5.method319(arg0.field612)) {
				arg0.field613 -= var5.method319(arg0.field612);
				arg0.field612++;
			}

			if (arg0.field612 >= var5.field1045) {
				arg0.field612 -= var5.field1049;
				arg0.field615++;
				if (arg0.field615 >= var5.field1055) {
					arg0.field611 = -1;
				}

				if (arg0.field612 < 0 || arg0.field612 >= var5.field1045) {
					arg0.field611 = -1;
				}
			}

			arg0.field634 = var5.field1051;
		}

		if (arg0.field614 > 0) {
			arg0.field614--;
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method64() {
		if (field311 == -1 || field533 != 2 && field677 == null) {
			if (field324) {
				method44();
				field324 = false;
				field464.method35(field676, 0, 4);
				field465.method35(field676, 0, 357);
				field466.method35(field676, 722, 4);
				field467.method35(field676, 743, 205);
				field468.method35(field676, 0, 0);
				field469.method35(field676, 516, 4);
				field470.method35(field676, 516, 205);
				field471.method35(field676, 496, 357);
				field472.method35(field676, 0, 338);
				field457 = true;
				field293 = true;
				field248 = true;
				field404 = true;

				if (field533 != 2) {
					field482.method35(field676, 4, 4);
					field481.method35(field676, 550, 4);
				}
			}

			if (field533 == 2) {
				method141();
			}

			if (field250 && field167 == 1) {
				field457 = true;
			}

			if (field363 != -1) {
				boolean var3 = method162(field363, field403);
				if (var3) {
					field457 = true;
				}
			}

			if (field376 == 2) {
				field457 = true;
			}

			if (field137 == 2) {
				field457 = true;
			}

			if (field457) {
				method154();
				field457 = false;
			}

			if (field424 == -1) {
				field181.field1282 = field500 - field522 - 77;

				if (field684 > 448 && field684 < 560 && field685 > 332) {
					method118(field685 - 357, field684 - 17, field500, 0, 77, 463, field181, -1);
				}

				int var4 = field500 - field181.field1282 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field500 - 77) {
					var4 = field500 - 77;
				}

				if (field522 != var4) {
					field522 = var4;
					field293 = true;
				}
			}

			if (field424 != -1) {
				boolean var5 = method162(field424, field403);
				if (var5) {
					field293 = true;
				}
			}

			if (field376 == 3) {
				field293 = true;
			}

			if (field137 == 3) {
				field293 = true;
			}

			if (field330 != null) {
				field293 = true;
			}

			if (field250 && field167 == 2) {
				field293 = true;
			}

			if (field293) {
				method105();
				field293 = false;
			}

			if (field533 == 2) {
				method67();
				field481.method35(field676, 550, 4);
			}

			if (field542 != -1) {
				field248 = true;
			}

			if (field248) {
				if (field542 != -1 && field542 == field396) {
					field542 = -1;
					field369.method454(113);
					field369.method455(field396);
				}

				field248 = false;
				field490.method34();
				field271.method374(0, 0);

				if (field363 == -1) {
					if (field473[field396] != -1) {
						if (field396 == 0) {
							field262.method374(10, 22);
						}

						if (field396 == 1) {
							field263.method374(8, 54);
						}

						if (field396 == 2) {
							field263.method374(8, 82);
						}

						if (field396 == 3) {
							field264.method374(8, 110);
						}

						if (field396 == 4) {
							field266.method374(8, 153);
						}

						if (field396 == 5) {
							field266.method374(8, 181);
						}

						if (field396 == 6) {
							field265.method374(9, 209);
						}
					}

					if (field473[0] != -1 && (field542 != 0 || field512 % 20 < 10)) {
						field305[0].method374(13, 29);
					}

					if (field473[1] != -1 && (field542 != 1 || field512 % 20 < 10)) {
						field305[1].method374(11, 53);
					}

					if (field473[2] != -1 && (field542 != 2 || field512 % 20 < 10)) {
						field305[2].method374(11, 82);
					}

					if (field473[3] != -1 && (field542 != 3 || field512 % 20 < 10)) {
						field305[3].method374(12, 115);
					}

					if (field473[4] != -1 && (field542 != 4 || field512 % 20 < 10)) {
						field305[4].method374(13, 153);
					}

					if (field473[5] != -1 && (field542 != 5 || field512 % 20 < 10)) {
						field305[5].method374(11, 180);
					}

					if (field473[6] != -1 && (field542 != 6 || field512 % 20 < 10)) {
						field305[6].method374(13, 208);
					}
				}

				field490.method35(field676, 516, 160);
				field489.method34();
				field270.method374(0, 0);

				if (field363 == -1) {
					if (field473[field396] != -1) {
						if (field396 == 7) {
							field299.method374(0, 42);
						}

						if (field396 == 8) {
							field300.method374(0, 74);
						}

						if (field396 == 9) {
							field300.method374(0, 102);
						}

						if (field396 == 10) {
							field301.method374(1, 130);
						}

						if (field396 == 11) {
							field303.method374(0, 173);
						}

						if (field396 == 12) {
							field303.method374(0, 201);
						}

						if (field396 == 13) {
							field302.method374(0, 229);
						}
					}

					if (field473[8] != -1 && (field542 != 8 || field512 % 20 < 10)) {
						field305[7].method374(2, 74);
					}

					if (field473[9] != -1 && (field542 != 9 || field512 % 20 < 10)) {
						field305[8].method374(3, 102);
					}

					if (field473[10] != -1 && (field542 != 10 || field512 % 20 < 10)) {
						field305[9].method374(4, 137);
					}

					if (field473[11] != -1 && (field542 != 11 || field512 % 20 < 10)) {
						field305[10].method374(2, 174);
					}

					if (field473[12] != -1 && (field542 != 12 || field512 % 20 < 10)) {
						field305[11].method374(2, 201);
					}

					if (field473[13] != -1 && (field542 != 13 || field512 % 20 < 10)) {
						field305[12].method374(2, 226);
					}
				}

				field489.method35(field676, 496, 466);
				field482.method34();
				VWUXWWMW.field1200 = field384;
			}

			if (field404) {
				field404 = false;
				field488.method34();
				field269.method374(0, 0);
				field571.method272(55, 28, "Public chat", 0xFFFFFF, true);

				if (field142 == 0) {
					field571.method272(55, 41, "On", 0xFF00, true);
				}

				if (field142 == 1) {
					field571.method272(55, 41, "Friends", 0xFFFF00, true);
				}

				if (field142 == 2) {
					field571.method272(55, 41, "Off", 0xFF0000, true);
				}

				if (field142 == 3) {
					field571.method272(55, 41, "Hide", 0xFFFF, true);
				}

				field571.method272(184, 28, "Private chat", 0xFFFFFF, true);

				if (field362 == 0) {
					field571.method272(184, 41, "On", 0xFF00, true);
				}

				if (field362 == 1) {
					field571.method272(184, 41, "Friends", 0xFFFF00, true);
				}

				if (field362 == 2) {
					field571.method272(184, 41, "Off", 0xFF0000, true);
				}

				field571.method272(324, 28, "Trade/compete", 0xFFFFFF, true);

				if (field273 == 0) {
					field571.method272(324, 41, "On", 0xFF00, true);
				}

				if (field273 == 1) {
					field571.method272(324, 41, "Friends", 0xFFFF00, true);
				}

				if (field273 == 2) {
					field571.method272(324, 41, "Off", 0xFF0000, true);
				}

				field571.method272(458, 33, "Report abuse", 0xFFFFFF, true);
				field488.method35(field676, 0, 453);
				field482.method34();
				VWUXWWMW.field1200 = field384;
			}

			field403 = 0;
		} else {
			if (field533 == 2) {
				method162(field311, field403);

				if (field209 != -1) {
					method162(field209, field403);
				}

				field403 = 0;
				method54();
				field677.method34();
				VWUXWWMW.field1200 = field385;
				IGZZCJOU.method243();
				field324 = true;
				VYAVYWNE var1 = VYAVYWNE.method395(field311);
				if (var1.field1228 == 512 && var1.field1236 == 334 && var1.field1281 == 0) {
					var1.field1228 = 765;
					var1.field1236 = 503;
				}

				method83(0, 0, var1, 0);

				if (field209 != -1) {
					VYAVYWNE var2 = VYAVYWNE.method395(field209);
					if (var2.field1228 == 512 && var2.field1236 == 334 && var2.field1281 == 0) {
						var2.field1228 = 765;
						var2.field1236 = 503;
					}

					method83(0, 0, var2, 0);
				}

				if (field250) {
					method149();
				} else {
					method132();
					method157();
				}
			}

			field677.method35(field676, 0, 0);
		}
	}

	@ObfuscatedName("client.a(ZBI)V")
	public final void method65(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method66() {
		if (field137 == 0) {
			int var1 = field690;
			if (field214 == 1 && field691 >= 516 && field692 >= 160 && field691 <= 765 && field692 <= 205) {
				var1 = 0;
			}

			if (field250) {
				if (var1 != 1) {
					int var2 = field684;
					int var3 = field685;
					if (field167 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field167 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field167 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field168 - 10 || var2 > field170 + field168 + 10 || var3 < field169 - 10 || var3 > field171 + field169 + 10) {
						field250 = false;

						if (field167 == 1) {
							field457 = true;
						}

						if (field167 == 2) {
							field293 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field168;
					int var5 = field169;
					int var6 = field170;
					int var7 = field691;
					int var8 = field692;
					if (field167 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field167 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field167 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field212; var10++) {
						int var11 = (field212 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method90(var9);
					}

					field250 = false;

					if (field167 == 1) {
						field457 = true;
					}

					if (field167 == 2) {
						field293 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field212 > 0) {
					int var12 = field561[field212 - 1];
					if (var12 == 610 || var12 == 36 || var12 == 38 || var12 == 277 || var12 == 929 || var12 == 477 || var12 == 705 || var12 == 363 || var12 == 34 || var12 == 73 || var12 == 332 || var12 == 1205) {
						int var13 = field559[field212 - 1];
						int var14 = field560[field212 - 1];
						VYAVYWNE var15 = VYAVYWNE.method395(var14);
						if (var15.field1232 || var15.field1227) {
							field475 = false;
							field240 = 0;
							field135 = var14;
							field136 = var13;
							field137 = 2;
							field138 = field691;
							field139 = field692;

							if (VYAVYWNE.method395(var14).field1213 == field345) {
								field137 = 1;
							}

							if (VYAVYWNE.method395(var14).field1213 == field424) {
								field137 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field453 == 1 || method85(field212 - 1)) && field212 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field212 > 0) {
					method90(field212 - 1);
				}

				if (var1 != 2 || field212 <= 0) {
					return;
				}

				method131();
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method67() {
		field481.method34();

		if (field451 == 2) {
			byte[] var1 = field367.field1181;
			int[] var2 = IGZZCJOU.field795;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field412.method344(33, 25, 25, field325, 0, 33, 0, 256, field327, field207);
			field482.method34();
			VWUXWWMW.field1200 = field384;
		} else {
			int var5 = field327 + field218 & 0x7FF;
			int var6 = field149.field654 / 32 + 48;
			int var7 = 464 - field149.field655 / 32;
			field234.method344(151, var7, var6, field546, 25, 146, 5, field332 + 256, var5, field557);
			field412.method344(33, 25, 25, field325, 0, 33, 0, 256, field327, field207);

			for (int var8 = 0; var8 < field388; var8++) {
				int var9 = field389[var8] * 4 + 2 - field149.field654 / 32;
				int var10 = field390[var8] * 4 + 2 - field149.field655 / 32;
				method117(field433[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					VLUKUYNM var13 = field314[field359][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field149.field654 / 32;
						int var15 = var12 * 4 + 2 - field149.field655 / 32;
						method117(field443, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field162; var16++) {
				DLMOHDFX var17 = field161[field163[var16]];
				if (var17 != null && var17.method192()) {
					KFUEEJVZ var18 = var17.field599;
					if (var18.field861 != null) {
						var18 = var18.method262();
					}

					if (var18 != null && var18.field880 && var18.field887) {
						int var19 = var17.field654 / 32 - field149.field654 / 32;
						int var20 = var17.field655 / 32 - field149.field655 / 32;
						method117(field444, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field516; var21++) {
				MTFZASIN var22 = field515[field517[var21]];
				if (var22 != null && var22.method192()) {
					int var23 = var22.field654 / 32 - field149.field654 / 32;
					int var24 = var22.field655 / 32 - field149.field655 / 32;
					boolean var25 = false;
					long var26 = CIRLBWBX.method37(var22.field1091);
					for (int var28 = 0; var28 < field153; var28++) {
						if (field194[var28] == var26 && field238[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field149.field1071 != 0 && var22.field1071 != 0 && field149.field1071 == var22.field1071) {
						var29 = true;
					}

					if (var25) {
						method117(field446, var24, var23);
					} else if (var29) {
						method117(field447, var24, var23);
					} else {
						method117(field445, var24, var23);
					}
				}
			}

			if (field203 != 0 && field512 % 20 < 10) {
				if (field203 == 1 && field166 >= 0 && field166 < field161.length) {
					DLMOHDFX var30 = field161[field166];
					if (var30 != null) {
						int var31 = var30.field654 / 32 - field149.field654 / 32;
						int var32 = var30.field655 / 32 - field149.field655 / 32;
						method84(field371, var31, var32);
					}
				}

				if (field203 == 2) {
					int var33 = (field458 - field413) * 4 + 2 - field149.field654 / 32;
					int var34 = (field459 - field414) * 4 + 2 - field149.field655 / 32;
					method84(field371, var33, var34);
				}

				if (field203 == 10 && field235 >= 0 && field235 < field515.length) {
					MTFZASIN var35 = field515[field235];
					if (var35 != null) {
						int var36 = var35.field654 / 32 - field149.field654 / 32;
						int var37 = var35.field655 / 32 - field149.field655 / 32;
						method84(field371, var36, var37);
					}
				}
			}

			if (field232 != 0) {
				int var38 = field232 * 4 + 2 - field149.field654 / 32;
				int var39 = field233 * 4 + 2 - field149.field655 / 32;
				method117(field370, var39, var38);
			}

			IGZZCJOU.method245(78, 0xFFFFFF, 97, 3, 3);
			field482.method34();
			VWUXWWMW.field1200 = field384;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method68() {
		if (field254 > 1) {
			field254--;
		}

		if (field381 > 0) {
			field381--;
		}

		for (int var1 = 0; var1 < 5 && method140(); var1++) {
		}

		if (field289) {
			synchronized (field474.field1129) {
				if (!field455) {
					field474.field1130 = 0;
				} else if (field690 != 0 || field474.field1130 >= 40) {
					field369.method454(97);
					field369.method455(0);
					int var3 = field369.field1432;
					int var4 = 0;
					for (int var5 = 0; var5 < field474.field1130 && var3 - field369.field1432 < 240; var5++) {
						var4++;
						int var6 = field474.field1133[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field474.field1131[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field474.field1133[var5] == -1 && field474.field1131[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field140 != var7 || field141 != var6) {
							int var9 = var7 - field140;
							field140 = var7;
							int var10 = var6 - field141;
							field141 = var6;

							if (field239 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field369.method456((field239 << 12) + (var9 << 6) + var10);
								field239 = 0;
							} else if (field239 < 8) {
								field369.method458((field239 << 19) + var8 + 0x800000);
								field239 = 0;
							} else {
								field369.method459((field239 << 19) + var8 - 0x40000000);
								field239 = 0;
							}
						} else if (field239 < 2047) {
							field239++;
						}
					}

					field369.method464(field369.field1432 - var3);

					if (var4 >= field474.field1130) {
						field474.field1130 = 0;
					} else {
						field474.field1130 -= var4;
						for (int var11 = 0; var11 < field474.field1130; var11++) {
							field474.field1131[var11] = field474.field1131[var4 + var11];
							field474.field1133[var11] = field474.field1133[var4 + var11];
						}
					}
				}
			}

			if (field690 != 0) {
				long var12 = (field693 - field193) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field193 = field693;
				int var14 = field692;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field691;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field690 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field369.method454(14);
				field369.method497((var17 << 19) + (var18 << 20) + var16);
			}

			if (field352 > 0) {
				field352--;
			}

			if (field694[1] == 1 || field694[2] == 1 || field694[3] == 1 || field694[4] == 1) {
				field353 = true;
			}

			if (field353 && field352 <= 0) {
				field352 = 20;
				field353 = false;
				field369.method454(124);
				field369.method490(field326);
				field369.method488(field327);
			}

			if (field681 && !field335) {
				field335 = true;
				field369.method454(57);
				field369.method455(1);
			}

			if (!field681 && field335) {
				field335 = false;
				field369.method454(57);
				field369.method455(0);
			}

			method115();
			method93();
			method146();
			field379++;
			if (field379 > 750) {
				method125();
			}

			method76();
			method57();
			method45();
			field403++;

			if (field400 != 0) {
				field399 += 20;
				if (field399 >= 400) {
					field400 = 0;
				}
			}

			if (field376 != 0) {
				field373++;
				if (field373 >= 15) {
					if (field376 == 2) {
						field457 = true;
					}

					if (field376 == 3) {
						field293 = true;
					}

					field376 = 0;
				}
			}

			if (field137 != 0) {
				field240++;

				if (field684 > field138 + 5 || field684 < field138 - 5 || field685 > field139 + 5 || field685 < field139 - 5) {
					field475 = true;
				}

				if (field683 == 0) {
					if (field137 == 2) {
						field457 = true;
					}

					if (field137 == 3) {
						field293 = true;
					}

					field137 = 0;

					if (field475 && field240 >= 5) {
						field259 = -1;
						method132();

						if (field259 == field135 && field258 != field136) {
							VYAVYWNE var19 = VYAVYWNE.method395(field135);
							byte var20 = 0;
							if (field287 == 1 && var19.field1273 == 206) {
								var20 = 1;
							}

							if (var19.field1250[field258] <= 0) {
								var20 = 0;
							}

							if (var19.field1227) {
								int var21 = field136;
								int var22 = field258;
								var19.field1250[var22] = var19.field1250[var21];
								var19.field1216[var22] = var19.field1216[var21];
								var19.field1250[var21] = -1;
								var19.field1216[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field136;
								int var24 = field258;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method394(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method394(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method394(field258, field136);
							}

							field369.method454(202);
							field369.method456(field258);
							field369.method482(var20);
							field369.method489(field136);
							field369.method456(field135);
						}
					} else if ((field453 == 1 || method85(field212 - 1)) && field212 > 2) {
						method131();
					} else if (field212 > 0) {
						method90(field212 - 1);
					}

					field373 = 10;
					field690 = 0;
				}
			}

			if (YDQEOBYY.field1478 != -1) {
				int var25 = YDQEOBYY.field1478;
				int var26 = YDQEOBYY.field1479;
				boolean var27 = method102(var26, 0, 0, 0, 0, field149.field635[0], 0, true, var25, field149.field636[0], 0);
				YDQEOBYY.field1478 = -1;

				if (var27) {
					field397 = field691;
					field398 = field692;
					field400 = 1;
					field399 = 0;
				}
			}

			if (field690 == 1 && field330 != null) {
				field330 = null;
				field293 = true;
				field690 = 0;
			}

			method66();

			if (field311 == -1) {
				method181();
				method180();
				method108();
			}

			if (field683 == 1 || field690 == 1) {
				field267++;
			}

			if (field355 == 0 && field208 == 0 && field242 == 0) {
				if (field164 > 0) {
					field164--;
				}
			} else if (field164 < 100) {
				field164++;
				if (field164 == 100) {
					if (field355 != 0) {
						field293 = true;
					}

					if (field208 != 0) {
						field457 = true;
					}
				}
			}

			if (field533 == 2) {
				method158();
			}

			if (field533 == 2 && field476) {
				method166();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field401[var28]++;
			}

			method109();
			field682++;
			if (field682 > 4500) {
				field381 = 250;
				field682 -= 500;
				field369.method454(145);
			}

			field152++;
			if (field152 > 500) {
				field152 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field319 += field320;
				}

				if ((var29 & 0x2) == 2) {
					field568 += field569;
				}

				if ((var29 & 0x4) == 4) {
					field348 += field349;
				}
			}

			if (field319 < -50) {
				field320 = 2;
			}

			if (field319 > 50) {
				field320 = -2;
			}

			if (field568 < -55) {
				field569 = 2;
			}

			if (field568 > 55) {
				field569 = -2;
			}

			if (field348 < -40) {
				field349 = 1;
			}

			if (field348 > 40) {
				field349 = -1;
			}

			field323++;
			if (field323 > 500) {
				field323 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field218 += field219;
				}

				if ((var30 & 0x2) == 2) {
					field332 += field333;
				}
			}

			if (field218 < -60) {
				field219 = 2;
			}

			if (field218 > 60) {
				field219 = -2;
			}

			if (field332 < -20) {
				field333 = 1;
			}

			if (field332 > 10) {
				field333 = -1;
			}

			field380++;
			if (field380 > 50) {
				field369.method454(214);
			}

			try {
				if (field261 != null && field369.field1432 > 0) {
					field261.method5(field369.field1432, field369.field1431, 0);
					field369.field1432 = 0;
					field380 = 0;
				}
			} catch (IOException var32) {
				method125();
			} catch (Exception var33) {
				method123();
			}
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method69(boolean arg0) {
		method96();
		field549.method34();
		field492.method374(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field146 == 0) {
			int var4 = var3 / 2 + 80;
			field570.method272(var2 / 2, var4, field204.field957, 0x75A9A9, true);
			int var5 = var3 / 2 - 20;
			field572.method272(var2 / 2, var5, "Welcome to RuneScape", 0xFFFF00, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field493.method374(var7 - 20, var6 - 73);
			field572.method272(var6, var7 + 5, "New User", 0xFFFFFF, true);
			int var8 = var2 / 2 + 80;
			field493.method374(var7 - 20, var8 - 73);
			field572.method272(var8, var7 + 5, "Existing User", 0xFFFFFF, true);
		}

		if (field146 == 2) {
			int var9 = var3 / 2 - 40;
			if (field448.length() > 0) {
				field572.method272(var2 / 2, var9 - 15, field448, 0xFFFF00, true);
				field572.method272(var2 / 2, var9, field449, 0xFFFF00, true);
				var9 += 30;
			} else {
				field572.method272(var2 / 2, var9 - 7, field449, 0xFFFF00, true);
				var9 += 30;
			}

			field572.method279("Username: " + field391 + (field410 == 0 & field512 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 90, 0xFFFFFF, true, var9);
			var9 += 15;
			field572.method279("Password: " + CIRLBWBX.method42(field392) + (field410 == 1 & field512 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 88, 0xFFFFFF, true, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field493.method374(var11 - 20, var10 - 73);
				field572.method272(var10, var11 + 5, "Login", 0xFFFFFF, true);
				int var12 = var2 / 2 + 80;
				field493.method374(var11 - 20, var12 - 73);
				field572.method272(var12, var11 + 5, "Cancel", 0xFFFFFF, true);
			}
		}

		if (field146 == 3) {
			field572.method272(var2 / 2, var3 / 2 - 60, "Create a free account", 0xFFFF00, true);
			int var13 = var3 / 2 - 35;
			field572.method272(var2 / 2, var13, "To create a new account you need to", 0xFFFFFF, true);
			var13 += 15;
			field572.method272(var2 / 2, var13, "go back to the main RuneScape webpage", 0xFFFFFF, true);
			var13 += 15;
			field572.method272(var2 / 2, var13, "and choose the 'create account'", 0xFFFFFF, true);
			var13 += 15;
			field572.method272(var2 / 2, var13, "button near the top of that page.", 0xFFFFFF, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field493.method374(var15 - 20, var14 - 73);
			field572.method272(var14, var15 + 5, "Cancel", 0xFFFFFF, true);
		}

		field549.method35(field676, 202, 171);

		if (field324) {
			field324 = false;
			field547.method35(field676, 128, 0);
			field548.method35(field676, 202, 371);
			field552.method35(field676, 0, 265);
			field553.method35(field676, 562, 265);
			field554.method35(field676, 128, 171);
			field555.method35(field676, 562, 171);
		}
	}

	@ObfuscatedName("client.b(ILXGRGMPUQ;I)V")
	public final void method70(int arg0, XGRGMPUQ arg1) {
		for (int var3 = 0; var3 < field518; var3++) {
			int var4 = field519[var3];
			DLMOHDFX var5 = field161[var4];
			int var6 = arg1.method465();
			if ((var6 & 0x10) != 0) {
				int var7 = arg1.method465();
				int var8 = arg1.method484();
				var5.method198(var8, field512, var7);
				var5.field616 = field512 + 300;
				var5.field617 = arg1.method484();
				var5.field618 = arg1.method484();
			}

			if ((var6 & 0x40) != 0) {
				var5.field652 = arg1.method467();
				var5.field653 = arg1.method492();
			}

			if ((var6 & 0x80) != 0) {
				var5.field640 = arg1.method493();
				int var9 = arg1.method499();
				var5.field644 = var9 >> 16;
				var5.field643 = (var9 & 0xFFFF) + field512;
				var5.field641 = 0;
				var5.field642 = 0;

				if (var5.field643 > field512) {
					var5.field641 = -1;
				}

				if (var5.field640 == 0xFFFF) {
					var5.field640 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.field637 = arg1.method492();
				if (var5.field637 == 0xFFFF) {
					var5.field637 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				int var10 = arg1.method467();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg1.method485();
				if (var5.field611 == var10 && var10 != -1) {
					int var12 = MJVHTYCA.field1044[var10].field1058;
					if (var12 == 1) {
						var5.field612 = 0;
						var5.field613 = 0;
						var5.field614 = var11;
						var5.field615 = 0;
					}

					if (var12 == 2) {
						var5.field615 = 0;
					}
				} else if (var10 == -1 || var5.field611 == -1 || MJVHTYCA.field1044[var10].field1052 >= MJVHTYCA.field1044[var5.field611].field1052) {
					var5.field611 = var10;
					var5.field612 = 0;
					var5.field613 = 0;
					var5.field614 = var11;
					var5.field615 = 0;
					var5.field638 = var5.field651;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field599 = KFUEEJVZ.method267(arg1.method493());
				var5.field619 = var5.field599.field865;
				var5.field650 = var5.field599.field876;
				var5.field623 = var5.field599.field888;
				var5.field624 = var5.field599.field878;
				var5.field625 = var5.field599.field860;
				var5.field626 = var5.field599.field874;
				var5.field659 = var5.field599.field886;
			}

			if ((var6 & 0x4) != 0) {
				int var13 = arg1.method485();
				int var14 = arg1.method485();
				var5.method198(var14, field512, var13);
				var5.field616 = field512 + 300;
				var5.field617 = arg1.method483();
				var5.field618 = arg1.method465();
			}

			if ((var6 & 0x2) != 0) {
				var5.field609 = arg1.method472();
				var5.field610 = 100;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method71() {
		Graphics var1 = method107().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method210(1);

		if (field387) {
			field386 = false;
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

		if (field284) {
			field386 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field346) {
			field386 = false;
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

	@ObfuscatedName("client.d(Z)V")
	public final void method72() {
		byte[] var1 = field249.method317("title.dat", null);
		PDMJJHOP var2 = new PDMJJHOP(var1, this);
		field550.method34();
		var2.method338(0, 0);
		field551.method34();
		var2.method338(0, -637);
		field547.method34();
		var2.method338(0, -128);
		field548.method34();
		var2.method338(-371, -202);
		field549.method34();
		var2.method338(-171, -202);
		field552.method34();
		var2.method338(-265, 0);
		field553.method34();
		var2.method338(-265, -562);
		field554.method34();
		var2.method338(-171, -128);
		field555.method34();
		var2.method338(-171, -562);
		int[] var3 = new int[var2.field1146];
		for (int var4 = 0; var4 < var2.field1147; var4++) {
			for (int var5 = 0; var5 < var2.field1146; var5++) {
				var3[var5] = var2.field1145[var2.field1146 * var4 + var2.field1146 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1146; var6++) {
				var2.field1145[var2.field1146 * var4 + var6] = var3[var6];
			}
		}

		field550.method34();
		var2.method338(0, 382);
		field551.method34();
		var2.method338(0, -255);
		field547.method34();
		var2.method338(0, 254);
		field548.method34();
		var2.method338(-371, 180);
		field549.method34();
		var2.method338(-171, 180);
		field552.method34();
		var2.method338(-265, 382);
		field553.method34();
		var2.method338(-265, -180);
		field554.method34();
		var2.method338(-171, 254);
		field555.method34();
		var2.method338(-171, -180);
		PDMJJHOP var7 = new PDMJJHOP(field249, "logo", 0);
		field547.method34();
		var7.method340(18, 382 - var7.field1146 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.c(II)V")
	public final void method73(int arg0) {
		int var2 = KVOIHOSF.field919[arg0].field927;
		if (var2 != 0) {
			int var3 = field275[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					VWUXWWMW.method385(0.9D);
				}

				if (var3 == 2) {
					VWUXWWMW.method385(0.8D);
				}

				if (var3 == 3) {
					VWUXWWMW.method385(0.7D);
				}

				if (var3 == 4) {
					VWUXWWMW.method385(0.6D);
				}

				HJAQAKAW.field752.method195();
				field324 = true;
			}

			if (var2 == 3) {
				boolean var4 = field574;

				if (var3 == 0) {
					method65(field574, 0);
					field574 = true;
				}

				if (var3 == 1) {
					method65(field574, -400);
					field574 = true;
				}

				if (var3 == 2) {
					method65(field574, -800);
					field574 = true;
				}

				if (var3 == 3) {
					method65(field574, -1200);
					field574 = true;
				}

				if (var3 == 4) {
					field574 = false;
				}

				if (field574 != var4 && !field420) {
					if (field574) {
						field308 = field188;
						field309 = true;
						field204.method297(2, field308);
					} else {
						method134();
					}

					field202 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field429 = true;
					method101(0);
				}

				if (var3 == 1) {
					field429 = true;
					method101(-400);
				}

				if (var3 == 2) {
					field429 = true;
					method101(-800);
				}

				if (var3 == 3) {
					field429 = true;
					method101(-1200);
				}

				if (var3 == 4) {
					field429 = false;
				}
			}

			if (var2 == 5) {
				field453 = var3;
			}

			if (var2 == 6) {
				field347 = var3;
			}

			if (var2 == 8) {
				field147 = var3;
				field293 = true;
			}

			if (var2 == 9) {
				field287 = var3;
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method74(int arg0, int arg1) {
		VLUKUYNM var3 = field314[field359][arg0][arg1];
		if (var3 == null) {
			field394.method523(field359, arg0, arg1);
		} else {
			int var4 = -99999999;
			OFYTUJCE var5 = null;
			for (OFYTUJCE var6 = (OFYTUJCE) var3.method361(); var6 != null; var6 = (OFYTUJCE) var3.method363()) {
				HJAQAKAW var7 = HJAQAKAW.method237(var6.field1128);
				int var8 = var7.field742;
				if (var7.field749) {
					var8 = (var6.field1127 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method359(var5);
			OFYTUJCE var9 = null;
			OFYTUJCE var10 = null;
			for (OFYTUJCE var11 = (OFYTUJCE) var3.method361(); var11 != null; var11 = (OFYTUJCE) var3.method363()) {
				if (var5.field1128 != var11.field1128 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1128 != var11.field1128 && var9.field1128 != var11.field1128 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field394.method509(var9, var5, arg1, arg0, method95(arg0 * 128 + 64, arg1 * 128 + 64, field359), var12, field359, var10);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method75() {
		if (field197 == 0 && field214 == 0) {
			field521[field212] = "Walk here";
			field561[field212] = 765;
			field559[field212] = field684;
			field560[field212] = field685;
			field212++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < VYUQHOMO.field1352; var2++) {
			int var3 = VYUQHOMO.field1353[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field394.method532(field359, var4, var5, var3) >= 0) {
					BMWIVHMF var8 = BMWIVHMF.method30(var7);
					if (var8.field78 != null) {
						var8 = var8.method23();
					}

					if (var8 == null) {
						continue;
					}

					if (field197 == 1) {
						field521[field212] = "Use " + field201 + " with @cya@" + var8.field103;
						field561[field212] = 906;
						field562[field212] = var3;
						field559[field212] = var4;
						field560[field212] = var5;
						field212++;
					} else if (field214 != 1) {
						if (var8.field104 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field104[var9] != null) {
									field521[field212] = var8.field104[var9] + " @cya@" + var8.field103;

									if (var9 == 0) {
										field561[field212] = 579;
									}

									if (var9 == 1) {
										field561[field212] = 179;
									}

									if (var9 == 2) {
										field561[field212] = 109;
									}

									if (var9 == 3) {
										field561[field212] = 186;
									}

									if (var9 == 4) {
										field561[field212] = 1802;
									}

									field562[field212] = var3;
									field559[field212] = var4;
									field560[field212] = var5;
									field212++;
								}
							}
						}

						field521[field212] = "Examine @cya@" + var8.field103;
						field561[field212] = 1836;
						field562[field212] = var8.field116 << 14;
						field559[field212] = var4;
						field560[field212] = var5;
						field212++;
					} else if ((field216 & 0x4) == 4) {
						field521[field212] = field217 + " @cya@" + var8.field103;
						field561[field212] = 450;
						field562[field212] = var3;
						field559[field212] = var4;
						field560[field212] = var5;
						field212++;
					}
				}

				if (var6 == 1) {
					DLMOHDFX var10 = field161[var7];
					if (var10.field599.field865 == 1 && (var10.field654 & 0x7F) == 0x40 && (var10.field655 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field162; var11++) {
							DLMOHDFX var12 = field161[field163[var11]];
							if (var12 != null && var10 != var12 && var12.field599.field865 == 1 && var10.field654 == var12.field654 && var10.field655 == var12.field655) {
								method179(field163[var11], var4, var12.field599, var5);
							}
						}

						for (int var13 = 0; var13 < field516; var13++) {
							MTFZASIN var14 = field515[field517[var13]];
							if (var14 != null && var10.field654 == var14.field654 && var10.field655 == var14.field655) {
								method143(var5, var4, field517[var13], var14);
							}
						}
					}

					method179(var7, var4, var10.field599, var5);
				}

				if (var6 == 0) {
					MTFZASIN var15 = field515[var7];
					if ((var15.field654 & 0x7F) == 0x40 && (var15.field655 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field162; var16++) {
							DLMOHDFX var17 = field161[field163[var16]];
							if (var17 != null && var17.field599.field865 == 1 && var15.field654 == var17.field654 && var15.field655 == var17.field655) {
								method179(field163[var16], var4, var17.field599, var5);
							}
						}

						for (int var18 = 0; var18 < field516; var18++) {
							MTFZASIN var19 = field515[field517[var18]];
							if (var19 != null && var15 != var19 && var15.field654 == var19.field654 && var15.field655 == var19.field655) {
								method143(var5, var4, field517[var18], var19);
							}
						}
					}

					method143(var5, var4, var7, var15);
				}

				if (var6 == 3) {
					VLUKUYNM var20 = field314[field359][var4][var5];
					if (var20 != null) {
						for (OFYTUJCE var21 = (OFYTUJCE) var20.method362(); var21 != null; var21 = (OFYTUJCE) var20.method364()) {
							HJAQAKAW var22 = HJAQAKAW.method237(var21.field1128);
							if (field197 == 1) {
								field521[field212] = "Use " + field201 + " with @lre@" + var22.field755;
								field561[field212] = 675;
								field562[field212] = var21.field1128;
								field559[field212] = var4;
								field560[field212] = var5;
								field212++;
							} else if (field214 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field737 != null && var22.field737[var23] != null) {
										field521[field212] = var22.field737[var23] + " @lre@" + var22.field755;

										if (var23 == 0) {
											field561[field212] = 228;
										}

										if (var23 == 1) {
											field561[field212] = 330;
										}

										if (var23 == 2) {
											field561[field212] = 162;
										}

										if (var23 == 3) {
											field561[field212] = 916;
										}

										if (var23 == 4) {
											field561[field212] = 790;
										}

										field562[field212] = var21.field1128;
										field559[field212] = var4;
										field560[field212] = var5;
										field212++;
									} else if (var23 == 2) {
										field521[field212] = "Take @lre@" + var22.field755;
										field561[field212] = 162;
										field562[field212] = var21.field1128;
										field559[field212] = var4;
										field560[field212] = var5;
										field212++;
									}
								}

								field521[field212] = "Examine @lre@" + var22.field755;
								field561[field212] = 1918;
								field562[field212] = var21.field1128;
								field559[field212] = var4;
								field560[field212] = var5;
								field212++;
							} else if ((field216 & 0x1) == 1) {
								field521[field212] = field217 + " @lre@" + var22.field755;
								field561[field212] = 453;
								field562[field212] = var21.field1128;
								field559[field212] = var4;
								field560[field212] = var5;
								field212++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method76() {
		for (int var1 = -1; var1 < field516; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field514;
			} else {
				var2 = field517[var1];
			}

			MTFZASIN var3 = field515[var2];
			if (var3 != null) {
				method58(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method77() {
		field502 = 0;
		for (int var1 = -1; var1 < field516 + field162; var1++) {
			DSYLCNKR var2;
			if (var1 == -1) {
				var2 = field149;
			} else if (var1 < field516) {
				var2 = field515[field517[var1]];
			} else {
				var2 = field161[field163[var1 - field516]];
			}

			if (var2 != null && var2.method192()) {
				if (var2 instanceof DLMOHDFX) {
					KFUEEJVZ var3 = ((DLMOHDFX) var2).field599;
					if (var3.field861 != null) {
						var3 = var3.method262();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field516) {
					KFUEEJVZ var6 = ((DLMOHDFX) var2).field599;
					if (var6.field884 >= 0 && var6.field884 < field286.length) {
						method177(var2, var2.field661 + 15);

						if (field223 > -1) {
							field286[var6.field884].method340(field224 - 30, field223 - 12);
						}
					}

					if (field203 == 1 && field163[var1 - field516] == field166 && field512 % 20 < 10) {
						method177(var2, var2.field661 + 15);

						if (field223 > -1) {
							field422[0].method340(field224 - 28, field223 - 12);
						}
					}
				} else {
					int var4 = 30;
					MTFZASIN var5 = (MTFZASIN) var2;
					if (var5.field1096 != -1 || var5.field1095 != -1) {
						method177(var2, var2.field661 + 15);

						if (field223 > -1) {
							if (var5.field1096 != -1) {
								field255[var5.field1096].method340(field224 - var4, field223 - 12);
								var4 += 25;
							}

							if (var5.field1095 != -1) {
								field286[var5.field1095].method340(field224 - var4, field223 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field203 == 10 && field517[var1] == field235) {
						method177(var2, var2.field661 + 15);

						if (field223 > -1) {
							field422[1].method340(field224 - var4, field223 - 12);
						}
					}
				}

				if (var2.field609 != null && (var1 >= field516 || field142 == 0 || field142 == 3 || field142 == 1 && method186(((MTFZASIN) var2).field1091))) {
					method177(var2, var2.field661);

					if (field223 > -1 && field502 < field503) {
						field507[field502] = field572.method274(var2.field609) / 2;
						field506[field502] = field572.field903;
						field504[field502] = field223;
						field505[field502] = field224;
						field508[field502] = var2.field645;
						field509[field502] = var2.field657;
						field510[field502] = var2.field610;
						field511[field502++] = var2.field609;

						if (field347 == 0 && var2.field657 >= 1 && var2.field657 <= 3) {
							field506[field502] += 10;
							field505[field502] += 5;
						}

						if (field347 == 0 && var2.field657 == 4) {
							field507[field502] = 60;
						}

						if (field347 == 0 && var2.field657 == 5) {
							field506[field502] += 5;
						}
					}
				}

				if (var2.field616 > field512) {
					method177(var2, var2.field661 + 15);

					if (field223 > -1) {
						int var7 = var2.field617 * 30 / var2.field618;
						if (var7 > 30) {
							var7 = 30;
						}

						IGZZCJOU.method245(field224 - 3, 0xFF00, field223 - 15, var7, 5);
						IGZZCJOU.method245(field224 - 3, 0xFF0000, field223 + var7 - 15, 30 - var7, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field622[var8] > field512) {
						method177(var2, var2.field661 / 2);

						if (field223 > -1) {
							if (var8 == 1) {
								field224 -= 20;
							}

							if (var8 == 2) {
								field223 -= 15;
								field224 -= 10;
							}

							if (var8 == 3) {
								field223 += 15;
								field224 -= 10;
							}

							field338[var2.field621[var8]].method340(field224 - 12, field223 - 12);
							field570.method271(String.valueOf(var2.field620[var8]), 0, field224 + 4, field223);
							field570.method271(String.valueOf(var2.field620[var8]), 0xFFFFFF, field224 + 3, field223 - 1);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field502; var9++) {
			int var10 = field504[var9];
			int var11 = field505[var9];
			int var12 = field507[var9];
			int var13 = field506[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field505[var15] - field506[var15] && var11 - var13 < field505[var15] + 2 && var10 - var12 < field507[var15] + field504[var15] && var10 + var12 > field504[var15] - field507[var15] && field505[var15] - field506[var15] < var11) {
						var11 = field505[var15] - field506[var15];
						var14 = true;
					}
				}
			}

			field223 = field504[var9];
			field224 = field505[var9] = var11;
			String var16 = field511[var9];
			if (field347 == 0) {
				int var17 = 0xFFFF00;
				if (field508[var9] < 6) {
					var17 = field178[field508[var9]];
				}

				if (field508[var9] == 6) {
					var17 = field499 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field508[var9] == 7) {
					var17 = field499 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field508[var9] == 8) {
					var17 = field499 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field508[var9] == 9) {
					int var18 = 150 - field510[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field508[var9] == 10) {
					int var19 = 150 - field510[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field508[var9] == 11) {
					int var20 = 150 - field510[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field509[var9] == 0) {
					field572.method271(var16, 0, field224 + 1, field223);
					field572.method271(var16, var17, field224, field223);
				}

				if (field509[var9] == 1) {
					field572.method276(0, field499, field223, var16, field224 + 1);
					field572.method276(var17, field499, field223, var16, field224);
				}

				if (field509[var9] == 2) {
					field572.method277(var16, field223, 0, field499, field224 + 1);
					field572.method277(var16, field223, var17, field499, field224);
				}

				if (field509[var9] == 3) {
					field572.method278(field224 + 1, field499, var16, field223, 0, 150 - field510[var9]);
					field572.method278(field224, field499, var16, field223, var17, 150 - field510[var9]);
				}

				if (field509[var9] == 4) {
					int var21 = field572.method274(var16);
					int var22 = (150 - field510[var9]) * (var21 + 100) / 150;
					IGZZCJOU.method242(field223 - 50, 334, 0, field223 + 50);
					field572.method275(field224 + 1, field223 + 50 - var22, 0, var16);
					field572.method275(field224, field223 + 50 - var22, var17, var16);
					IGZZCJOU.method241();
				}

				if (field509[var9] == 5) {
					int var23 = 150 - field510[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					IGZZCJOU.method242(0, field224 + 5, field224 - field572.field903 - 1, 512);
					field572.method271(var16, 0, field224 + var24 + 1, field223);
					field572.method271(var16, var17, field224 + var24, field223);
					IGZZCJOU.method241();
				}
			} else {
				field572.method271(var16, 0, field224 + 1, field223);
				field572.method271(var16, 0xFFFF00, field224, field223);
			}
		}
	}

	@ObfuscatedName("client.a(LXGRGMPUQ;BI)V")
	public final void method78(XGRGMPUQ arg0, int arg1) {
		if (arg1 == 45) {
			int var3 = arg0.method484();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field277[var4];
			int var7 = arg0.method485();
			int var8 = (var7 >> 4 & 0x7) + field495;
			int var9 = (var7 & 0x7) + field496;
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
				method100(-1, var4, field359, var8, var9, 0, -1, var5, var6);
			}
		} else if (arg1 == 196) {
			int var10 = arg0.method467();
			int var11 = arg0.method493();
			int var12 = arg0.method492();
			int var13 = arg0.method485();
			int var14 = (var13 >> 4 & 0x7) + field495;
			int var15 = (var13 & 0x7) + field496;
			if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && field243 != var10) {
				OFYTUJCE var16 = new OFYTUJCE();
				var16.field1128 = var12;
				var16.field1127 = var11;

				if (field314[field359][var14][var15] == null) {
					field314[field359][var14][var15] = new VLUKUYNM();
				}

				field314[field359][var14][var15].method358(var16);
				method74(var14, var15);
			}
		} else {
			if (arg1 == 157) {
				int var17 = arg0.method491();
				int var18 = arg0.method492();
				byte var19 = arg0.method466();
				byte var20 = arg0.method487();
				byte var21 = arg0.method487();
				int var22 = arg0.method492();
				int var23 = arg0.method483();
				int var24 = (var23 >> 4 & 0x7) + field495;
				int var25 = (var23 & 0x7) + field496;
				byte var26 = arg0.method486();
				int var27 = arg0.method493();
				int var28 = arg0.method465();
				int var29 = var28 >> 2;
				int var30 = var28 & 0x3;
				int var31 = field277[var29];
				MTFZASIN var32;
				if (field243 == var17) {
					var32 = field149;
				} else {
					var32 = field515[var17];
				}

				if (var32 != null) {
					BMWIVHMF var33 = BMWIVHMF.method30(var22);
					int var34 = field144[field359][var24][var25];
					int var35 = field144[field359][var24 + 1][var25];
					int var36 = field144[field359][var24 + 1][var25 + 1];
					int var37 = field144[field359][var24][var25 + 1];
					VYUQHOMO var38 = var33.method27(var29, var30, var34, var35, var36, var37, -1);
					if (var38 != null) {
						method100(-1, 0, field359, var24, var25, var18 + 1, var27 + 1, 0, var31);
						var32.field1093 = field512 + var18;
						var32.field1094 = field512 + var27;
						var32.field1088 = var38;
						int var39 = var33.field85;
						int var40 = var33.field102;
						if (var30 == 1 || var30 == 3) {
							var39 = var33.field102;
							var40 = var33.field85;
						}

						var32.field1085 = var24 * 128 + var39 * 64;
						var32.field1087 = var25 * 128 + var40 * 64;
						var32.field1086 = method95(var32.field1085, var32.field1087, field359);

						if (var20 > var26) {
							byte var41 = var20;
							var20 = var26;
							var26 = var41;
						}

						if (var21 > var19) {
							byte var42 = var21;
							var21 = var19;
							var19 = var42;
						}

						var32.field1078 = var20 + var24;
						var32.field1080 = var24 + var26;
						var32.field1079 = var21 + var25;
						var32.field1081 = var19 + var25;
					}
				}
			}

			if (arg1 == 81) {
				int var43 = arg0.method465();
				int var44 = (var43 >> 4 & 0x7) + field495;
				int var45 = (var43 & 0x7) + field496;
				int var46 = arg0.method467();
				int var47 = arg0.method467();
				int var48 = arg0.method467();
				if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
					VLUKUYNM var49 = field314[field359][var44][var45];
					if (var49 != null) {
						for (OFYTUJCE var50 = (OFYTUJCE) var49.method361(); var50 != null; var50 = (OFYTUJCE) var49.method363()) {
							if ((var46 & 0x7FFF) == var50.field1128 && var50.field1127 == var47) {
								var50.field1127 = var48;
								break;
							}
						}

						method74(var44, var45);
					}
				}
			} else if (arg1 == 163) {
				int var51 = arg0.method467();
				int var52 = arg0.method484();
				int var53 = (var52 >> 4 & 0x7) + field495;
				int var54 = (var52 & 0x7) + field496;
				int var55 = arg0.method484();
				int var56 = var55 >> 2;
				int var57 = var55 & 0x3;
				int var58 = field277[var56];
				if (var53 >= 0 && var54 >= 0 && var53 < 103 && var54 < 103) {
					int var59 = field144[field359][var53][var54];
					int var60 = field144[field359][var53 + 1][var54];
					int var61 = field144[field359][var53 + 1][var54 + 1];
					int var62 = field144[field359][var53][var54 + 1];
					if (var58 == 0) {
						LSEGSKSQ var63 = field394.method524(var54, field359, var53);
						if (var63 != null) {
							int var64 = var63.field1005 >> 14 & 0x7FFF;
							if (var56 == 2) {
								var63.field1003 = new AZNRLUAT(var61, var59, var64, var60, false, 2, var57 + 4, var51, var62);
								var63.field1004 = new AZNRLUAT(var61, var59, var64, var60, false, 2, var57 + 1 & 0x3, var51, var62);
							} else {
								var63.field1003 = new AZNRLUAT(var61, var59, var64, var60, false, var56, var57, var51, var62);
							}
						}
					}

					if (var58 == 1) {
						MRGUUUDO var65 = field394.method525(field359, var53, var54);
						if (var65 != null) {
							var65.field1068 = new AZNRLUAT(var61, var59, var65.field1069 >> 14 & 0x7FFF, var60, false, 4, 0, var51, var62);
						}
					}

					if (var58 == 2) {
						JTKKQJFC var66 = field394.method526(var54, field359, var53);

						if (var56 == 11) {
							var56 = 10;
						}

						if (var66 != null) {
							var66.field850 = new AZNRLUAT(var61, var59, var66.field858 >> 14 & 0x7FFF, var60, false, var56, var57, var51, var62);
						}
					}

					if (var58 == 3) {
						VMPNHHUY var67 = field394.method527(var54, field359, var53);
						if (var67 != null) {
							var67.field1175 = new AZNRLUAT(var61, var59, var67.field1176 >> 14 & 0x7FFF, var60, false, 22, var57, var51, var62);
						}
					}
				}
			} else if (arg1 == 12) {
				int var68 = arg0.method485();
				int var69 = (var68 >> 4 & 0x7) + field495;
				int var70 = (var68 & 0x7) + field496;
				int var71 = arg0.method492();
				if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
					VLUKUYNM var72 = field314[field359][var69][var70];
					if (var72 != null) {
						for (OFYTUJCE var73 = (OFYTUJCE) var72.method361(); var73 != null; var73 = (OFYTUJCE) var72.method363()) {
							if ((var71 & 0x7FFF) == var73.field1128) {
								var73.method334();
								break;
							}
						}

						if (var72.method361() == null) {
							field314[field359][var69][var70] = null;
						}

						method74(var69, var70);
					}
				}
			} else if (arg1 == 129) {
				int var74 = arg0.method492();
				int var75 = arg0.method493();
				int var76 = arg0.method465();
				int var77 = (var76 >> 4 & 0x7) + field495;
				int var78 = (var76 & 0x7) + field496;
				if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
					OFYTUJCE var79 = new OFYTUJCE();
					var79.field1128 = var75;
					var79.field1127 = var74;

					if (field314[field359][var77][var78] == null) {
						field314[field359][var77][var78] = new VLUKUYNM();
					}

					field314[field359][var77][var78].method358(var79);
					method74(var77, var78);
				}
			} else {
				if (arg1 == 237) {
					int var80 = arg0.method465();
					int var81 = (var80 >> 4 & 0x7) + field495;
					int var82 = (var80 & 0x7) + field496;
					int var83 = arg0.method467();
					int var84 = arg0.method465();
					int var85 = var84 >> 4 & 0xF;
					int var86 = var84 & 0x7;
					if (field149.field635[0] >= var81 - var85 && field149.field635[0] <= var81 + var85 && field149.field636[0] >= var82 - var85 && field149.field636[0] <= var82 + var85 && field429 && !field420 && field229 < 50) {
						field230[field229] = var83;
						field180[field229] = var86;
						field313[field229] = OWCBJDUM.field1136[var83];
						field229++;
					}
				}

				if (arg1 == 143) {
					int var87 = arg0.method465();
					int var88 = (var87 >> 4 & 0x7) + field495;
					int var89 = (var87 & 0x7) + field496;
					int var90 = var88 + arg0.method466();
					int var91 = var89 + arg0.method466();
					int var92 = arg0.method468();
					int var93 = arg0.method467();
					int var94 = arg0.method465() * 4;
					int var95 = arg0.method465() * 4;
					int var96 = arg0.method467();
					int var97 = arg0.method467();
					int var98 = arg0.method465();
					int var99 = arg0.method465();
					if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104 && var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var93 != 0xFFFF) {
						var88 = var88 * 128 + 64;
						var89 = var89 * 128 + 64;
						var90 = var90 * 128 + 64;
						var91 = var91 * 128 + 64;
						CSHXWWDM var100 = new CSHXWWDM(var88, method95(var88, var89, field359) - var94, var98, field512 + var97, var99, var92, var95, field359, field512 + var96, var93, var89);
						var100.method189(var90, method95(var90, var91, field359) - var95, field512 + var96, var91);
						field411.method358(var100);
					}
				} else if (arg1 == 180) {
					int var101 = arg0.method465();
					int var102 = (var101 >> 4 & 0x7) + field495;
					int var103 = (var101 & 0x7) + field496;
					int var104 = arg0.method467();
					int var105 = arg0.method465();
					int var106 = arg0.method467();
					if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
						var102 = var102 * 128 + 64;
						var103 = var103 * 128 + 64;
						GCMSALIP var107 = new GCMSALIP(field359, var103, field512, var102, var106, method95(var102, var103, field359) - var105, var104);
						field260.method358(var107);
					}
				} else if (arg1 == 68) {
					int var108 = arg0.method467();
					int var109 = arg0.method465();
					int var110 = var109 >> 2;
					int var111 = var109 & 0x3;
					int var112 = field277[var110];
					int var113 = arg0.method483();
					int var114 = (var113 >> 4 & 0x7) + field495;
					int var115 = (var113 & 0x7) + field496;
					if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
						method100(var108, var110, field359, var114, var115, 0, -1, var111, var112);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILXGRGMPUQ;)V")
	public final void method79(int arg0, XGRGMPUQ arg1) {
		field497 = 0;
		field518 = 0;
		method88(arg1, arg0);
		method89(arg1, arg0);
		method70(arg0, arg1);

		for (int var3 = 0; var3 < field497; var3++) {
			int var4 = field498[var3];
			if (field512 != field161[var4].field607) {
				field161[var4].field599 = null;
				field161[var4] = null;
			}
		}

		if (arg1.field1432 != arg0) {
			signlink.reporterror(field391 + " size mismatch in getnpcpos - pos:" + arg1.field1432 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field162; var5++) {
			if (field161[field163[var5]] == null) {
				signlink.reporterror(field391 + " null entry in npc list - pos:" + var5 + " size:" + field162);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method80() {
		for (CSHXWWDM var1 = (CSHXWWDM) field411.method361(); var1 != null; var1 = (CSHXWWDM) field411.method363()) {
			if (field359 != var1.field591 || field512 > var1.field576) {
				var1.method334();
			} else if (field512 >= var1.field575) {
				if (var1.field594 > 0) {
					DLMOHDFX var2 = field161[var1.field594 - 1];
					if (var2 != null && var2.field654 >= 0 && var2.field654 < 13312 && var2.field655 >= 0 && var2.field655 < 13312) {
						var1.method189(var2.field654, method95(var2.field654, var2.field655, var1.field591) - var1.field584, field512, var2.field655);
					}
				}

				if (var1.field594 < 0) {
					int var3 = -var1.field594 - 1;
					MTFZASIN var4;
					if (field243 == var3) {
						var4 = field149;
					} else {
						var4 = field515[var3];
					}

					if (var4 != null && var4.field654 >= 0 && var4.field654 < 13312 && var4.field655 >= 0 && var4.field655 < 13312) {
						var1.method189(var4.field654, method95(var4.field654, var4.field655, var1.field591) - var1.field584, field512, var4.field655);
					}
				}

				var1.method190(field403);
				field394.method513((int) var1.field577, (int) var1.field579, 60, -1, (int) var1.field578, field359, var1, var1.field589, false);
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method81() {
		method142(20, "Starting up");

		if (signlink.sunjava) {
			field670 = 5;
		}

		if (field245) {
			field346 = true;
		} else {
			field245 = true;
			boolean var1 = false;
			String var2 = method185();
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

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field565[var3] = new IJFFCIDM(500000, signlink.cache_idx[var3], signlink.cache_dat, var3 + 1);
					}
				}

				try {
					method176();
					field249 = method163(25, field536[1], "title", 1, "title screen");
					field570 = new KGPDNFPL("p11_full", field249, false);
					field571 = new KGPDNFPL("p12_full", field249, false);
					field572 = new KGPDNFPL("b12_full", field249, false);
					field573 = new KGPDNFPL("q8_full", field249, true);
					method72();
					method175();
					MJLXHQTQ var4 = method163(30, field536[2], "config", 2, "config");
					MJLXHQTQ var5 = method163(35, field536[3], "interface", 3, "interface");
					MJLXHQTQ var6 = method163(40, field536[4], "media", 4, "2d graphics");
					MJLXHQTQ var7 = method163(45, field536[6], "textures", 6, "textures");
					MJLXHQTQ var8 = method163(50, field536[7], "wordenc", 7, "chat system");
					MJLXHQTQ var9 = method163(55, field536[8], "sounds", 8, "sound effects");
					field182 = new byte[4][104][104];
					field144 = new int[4][105][105];
					field394 = new YDQEOBYY(104, field144, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field316[var10] = new GQSCEHQI(104, 104);
					}

					field234 = new PDMJJHOP(512, 512);
					MJLXHQTQ var11 = method163(60, field536[5], "versionlist", 5, "update list");
					method142(60, "Connecting to update server");
					field204 = new LAQKYZGL();
					field204.method306(var11, this);
					APJPJMYV.method7(field204.method308());
					VYUQHOMO.method404(field204.method303(0), field204);

					if (!field420) {
						field308 = 0;
						field309 = true;
						field204.method297(2, field308);

						while (field204.method302() > 0) {
							method139();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field204.field953 > 3) {
								method147("ondemand");
								return;
							}
						}
					}

					method142(65, "Requesting animations");
					int var12 = field204.method303(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field204.method297(1, var13);
					}

					while (field204.method302() > 0) {
						int var14 = var12 - field204.method302();
						if (var14 > 0) {
							method142(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method139();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field204.field953 > 3) {
							method147("ondemand");
							return;
						}
					}

					method142(70, "Requesting models");
					int var15 = field204.method303(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field204.method294(var16);
						if ((var17 & 0x1) != 0) {
							field204.method297(0, var16);
						}
					}

					int var18 = field204.method302();
					while (field204.method302() > 0) {
						int var19 = var18 - field204.method302();
						if (var19 > 0) {
							method142(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method139();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field565[0] != null) {
						method142(75, "Requesting maps");
						field204.method297(3, field204.method299(47, 48, 0));
						field204.method297(3, field204.method299(47, 48, 1));
						field204.method297(3, field204.method299(48, 48, 0));
						field204.method297(3, field204.method299(48, 48, 1));
						field204.method297(3, field204.method299(49, 48, 0));
						field204.method297(3, field204.method299(49, 48, 1));
						field204.method297(3, field204.method299(47, 47, 0));
						field204.method297(3, field204.method299(47, 47, 1));
						field204.method297(3, field204.method299(48, 47, 0));
						field204.method297(3, field204.method299(48, 47, 1));
						field204.method297(3, field204.method299(48, 148, 0));
						field204.method297(3, field204.method299(48, 148, 1));
						int var20 = field204.method302();
						while (field204.method302() > 0) {
							int var21 = var20 - field204.method302();
							if (var21 > 0) {
								method142(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method139();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field204.method303(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field204.method294(var23);
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
							field204.method300(0, var25, var23);
						}
					}

					field204.method304(field419);

					if (!field420) {
						int var26 = field204.method303(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field204.method291(var27)) {
								field204.method300(2, (byte) 1, var27);
							}
						}
					}

					method142(80, "Unpacking media");
					field366 = new VSJQVIFL(var6, "invback", 0);
					field368 = new VSJQVIFL(var6, "chatback", 0);
					field367 = new VSJQVIFL(var6, "mapback", 0);
					field269 = new VSJQVIFL(var6, "backbase1", 0);
					field270 = new VSJQVIFL(var6, "backbase2", 0);
					field271 = new VSJQVIFL(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field305[var28] = new VSJQVIFL(var6, "sideicons", var28);
					}

					field412 = new PDMJJHOP(var6, "compass", 0);
					field236 = new PDMJJHOP(var6, "mapedge", 0);
					field236.method337();

					for (int var29 = 0; var29 < 72; var29++) {
						field526[var29] = new VSJQVIFL(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field423[var30] = new PDMJJHOP(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field338[var31] = new PDMJJHOP(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field255[var32] = new PDMJJHOP(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field286[var33] = new PDMJJHOP(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field422[var34] = new PDMJJHOP(var6, "headicons_hint", var34);
					}

					field340 = new PDMJJHOP(var6, "overlay_multiway", 0);
					field370 = new PDMJJHOP(var6, "mapmarker", 0);
					field371 = new PDMJJHOP(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field537[var35] = new PDMJJHOP(var6, "cross", var35);
					}

					field443 = new PDMJJHOP(var6, "mapdots", 0);
					field444 = new PDMJJHOP(var6, "mapdots", 1);
					field445 = new PDMJJHOP(var6, "mapdots", 2);
					field446 = new PDMJJHOP(var6, "mapdots", 3);
					field447 = new PDMJJHOP(var6, "mapdots", 4);
					field256 = new VSJQVIFL(var6, "scrollbar", 0);
					field257 = new VSJQVIFL(var6, "scrollbar", 1);
					field262 = new VSJQVIFL(var6, "redstone1", 0);
					field263 = new VSJQVIFL(var6, "redstone2", 0);
					field264 = new VSJQVIFL(var6, "redstone3", 0);
					field265 = new VSJQVIFL(var6, "redstone1", 0);
					field265.method371();
					field266 = new VSJQVIFL(var6, "redstone2", 0);
					field266.method371();
					field299 = new VSJQVIFL(var6, "redstone1", 0);
					field299.method372();
					field300 = new VSJQVIFL(var6, "redstone2", 0);
					field300.method372();
					field301 = new VSJQVIFL(var6, "redstone3", 0);
					field301.method372();
					field302 = new VSJQVIFL(var6, "redstone1", 0);
					field302.method371();
					field302.method372();
					field303 = new VSJQVIFL(var6, "redstone2", 0);
					field303.method371();
					field303.method372();

					for (int var36 = 0; var36 < 2; var36++) {
						field334[var36] = new VSJQVIFL(var6, "mod_icons", var36);
					}

					PDMJJHOP var37 = new PDMJJHOP(var6, "backleft1", 0);
					field464 = new BVMYRJQC(var37.field1147, method107(), var37.field1146);
					var37.method338(0, 0);
					PDMJJHOP var38 = new PDMJJHOP(var6, "backleft2", 0);
					field465 = new BVMYRJQC(var38.field1147, method107(), var38.field1146);
					var38.method338(0, 0);
					PDMJJHOP var39 = new PDMJJHOP(var6, "backright1", 0);
					field466 = new BVMYRJQC(var39.field1147, method107(), var39.field1146);
					var39.method338(0, 0);
					PDMJJHOP var40 = new PDMJJHOP(var6, "backright2", 0);
					field467 = new BVMYRJQC(var40.field1147, method107(), var40.field1146);
					var40.method338(0, 0);
					PDMJJHOP var41 = new PDMJJHOP(var6, "backtop1", 0);
					field468 = new BVMYRJQC(var41.field1147, method107(), var41.field1146);
					var41.method338(0, 0);
					PDMJJHOP var42 = new PDMJJHOP(var6, "backvmid1", 0);
					field469 = new BVMYRJQC(var42.field1147, method107(), var42.field1146);
					var42.method338(0, 0);
					PDMJJHOP var43 = new PDMJJHOP(var6, "backvmid2", 0);
					field470 = new BVMYRJQC(var43.field1147, method107(), var43.field1146);
					var43.method338(0, 0);
					PDMJJHOP var44 = new PDMJJHOP(var6, "backvmid3", 0);
					field471 = new BVMYRJQC(var44.field1147, method107(), var44.field1146);
					var44.method338(0, 0);
					PDMJJHOP var45 = new PDMJJHOP(var6, "backhmid2", 0);
					field472 = new BVMYRJQC(var45.field1147, method107(), var45.field1146);
					var45.method338(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field423[var50] != null) {
							field423[var50].method336(var48 + var49, var46 + var49, var47 + var49);
						}

						if (field526[var50] != null) {
							field526[var50].method373(var48 + var49, var46 + var49, var47 + var49);
						}
					}

					method142(83, "Unpacking textures");
					VWUXWWMW.method381(var7);
					VWUXWWMW.method385(0.8D);
					VWUXWWMW.method380(20);
					method142(86, "Unpacking config");
					MJVHTYCA.method318(var4);
					BMWIVHMF.method26(var4);
					NVLIPBUR.method324(var4);
					HJAQAKAW.method227(var4);
					KFUEEJVZ.method266(var4);
					BLFCIBLQ.method17(var4);
					BKJQHSVH.method14(var4);
					KVOIHOSF.method286(var4);
					HUPZKMWH.method238(var4);
					HJAQAKAW.field745 = field419;

					if (!field420) {
						method142(90, "Unpacking sounds");
						byte[] var51 = var9.method317("sounds.dat", null);
						XGRGMPUQ var52 = new XGRGMPUQ(var51);
						OWCBJDUM.method328(var52);
					}

					method142(95, "Unpacking interfaces");
					KGPDNFPL[] var53 = new KGPDNFPL[] { field570, field571, field572, field573 };
					VYAVYWNE.method401(var6, var5, var53);
					method142(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field367.field1181[field367.field1183 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field325[var54] = var55;
						field207[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field367.field1181[field367.field1183 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field546[var58 - 5] = var59 - 25;
						field557[var58 - 5] = var60 - var59;
					}

					VWUXWWMW.method378(503, 765);
					field385 = VWUXWWMW.field1200;
					VWUXWWMW.method378(96, 479);
					field382 = VWUXWWMW.field1200;
					VWUXWWMW.method378(261, 190);
					field383 = VWUXWWMW.field1200;
					VWUXWWMW.method378(334, 512);
					field384 = VWUXWWMW.field1200;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = VWUXWWMW.field1198[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					YDQEOBYY.method538(var62, 800, 512, 334, 500);
					ZTOXLNJM.method561(var8);
					field474 = new OQEOESGS(this);
					method47(field474, 10);
					AZNRLUAT.field44 = this;
					BMWIVHMF.field76 = this;
					KFUEEJVZ.field866 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field285 + " " + field183);
					field387 = true;
				}
			} else {
				field284 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IILXGRGMPUQ;)V")
	public final void method82(int arg0, XGRGMPUQ arg1) {
		while (arg1.field1433 + 10 < arg0 * 8) {
			int var3 = arg1.method476(11);
			if (var3 == 2047) {
				break;
			}

			if (field515[var3] == null) {
				field515[var3] = new MTFZASIN();
				if (field520[var3] != null) {
					field515[var3].method322(field520[var3]);
				}
			}

			field517[field516++] = var3;
			MTFZASIN var4 = field515[var3];
			var4.field607 = field512;
			int var5 = arg1.method476(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method476(1);
			if (var6 == 1) {
				field519[field518++] = var3;
			}

			int var7 = arg1.method476(1);
			int var8 = arg1.method476(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method199(var7 == 1, field149.field636[0] + var5, field149.field635[0] + var8);
		}

		arg1.method477();
	}

	@ObfuscatedName("client.a(IIILVYAVYWNE;I)V")
	public final void method83(int arg0, int arg1, VYAVYWNE arg2, int arg3) {
		if (arg2.field1281 == 0 && arg2.field1256 != null && (!arg2.field1284 || field563 == arg2.field1219 || field251 == arg2.field1219 || field421 == arg2.field1219)) {
			int var5 = IGZZCJOU.field800;
			int var6 = IGZZCJOU.field798;
			int var7 = IGZZCJOU.field801;
			int var8 = IGZZCJOU.field799;
			IGZZCJOU.method242(arg0, arg2.field1236 + arg3, arg3, arg2.field1228 + arg0);
			int var9 = arg2.field1256.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field1231[var10] + arg0;
				int var12 = arg2.field1269[var10] + arg3 - arg1;
				VYAVYWNE var13 = VYAVYWNE.method395(arg2.field1256[var10]);
				var11 += var13.field1225;
				var12 += var13.field1235;

				if (var13.field1273 > 0) {
					method119(var13);
				}

				if (var13.field1281 == 0) {
					if (var13.field1282 > var13.field1217 - var13.field1236) {
						var13.field1282 = var13.field1217 - var13.field1236;
					}

					if (var13.field1282 < 0) {
						var13.field1282 = 0;
					}

					method83(var11, var13.field1282, var13, var12);

					if (var13.field1217 > var13.field1236) {
						method169(var13.field1217, var13.field1282, var13.field1236, var13.field1228 + var11, var12);
					}
				} else if (var13.field1281 != 1) {
					if (var13.field1281 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1236; var15++) {
							for (int var16 = 0; var16 < var13.field1228; var16++) {
								int var17 = (var13.field1261 + 32) * var16 + var11;
								int var18 = (var13.field1283 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1247[var14];
									var18 += var13.field1220[var14];
								}

								if (var13.field1250[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1250[var14] - 1;
									if (var17 > IGZZCJOU.field800 - 32 && var17 < IGZZCJOU.field801 && var18 > IGZZCJOU.field798 - 32 && var18 < IGZZCJOU.field799 || field137 != 0 && field136 == var14) {
										int var22 = 0;
										if (field197 == 1 && field198 == var14 && field199 == var13.field1219) {
											var22 = 0xFFFFFF;
										}

										PDMJJHOP var23 = HJAQAKAW.method229(var21, var22, var13.field1216[var14]);
										if (var23 != null) {
											if (field137 != 0 && field136 == var14 && field135 == var13.field1219) {
												var19 = field684 - field138;
												var20 = field685 - field139;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field240 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method342(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < IGZZCJOU.field798 && arg2.field1282 > 0) {
													int var24 = (IGZZCJOU.field798 - var18 - var20) * field403 / 3;
													if (var24 > field403 * 10) {
														var24 = field403 * 10;
													}

													if (var24 > arg2.field1282) {
														var24 = arg2.field1282;
													}

													arg2.field1282 -= var24;
													field139 += var24;
												}

												if (var18 + var20 + 32 > IGZZCJOU.field799 && arg2.field1282 < arg2.field1217 - arg2.field1236) {
													int var25 = (var18 + var20 + 32 - IGZZCJOU.field799) * field403 / 3;
													if (var25 > field403 * 10) {
														var25 = field403 * 10;
													}

													if (var25 > arg2.field1217 - arg2.field1236 - arg2.field1282) {
														var25 = arg2.field1217 - arg2.field1236 - arg2.field1282;
													}

													arg2.field1282 += var25;
													field139 -= var25;
												}
											} else if (field376 != 0 && field375 == var14 && field374 == var13.field1219) {
												var23.method342(var18, var17, 128);
											} else {
												var23.method340(var18, var17);
											}

											if (var23.field1150 == 33 || var13.field1216[var14] != 1) {
												int var26 = var13.field1216[var14];
												field570.method275(var18 + var20 + 10, var17 + 1 + var19, 0, method155(var26));
												field570.method275(var18 + var20 + 9, var17 + var19, 0xFFFF00, method155(var26));
											}
										}
									}
								} else if (var13.field1221 != null && var14 < 20) {
									PDMJJHOP var27 = var13.field1221[var14];
									if (var27 != null) {
										var27.method340(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1281 == 3) {
						boolean var28 = false;
						if (field421 == var13.field1219 || field251 == var13.field1219 || field563 == var13.field1219) {
							var28 = true;
						}

						int var29;
						if (method99(var13)) {
							var29 = var13.field1241;
							if (var28 && var13.field1254 != 0) {
								var29 = var13.field1254;
							}
						} else {
							var29 = var13.field1271;
							if (var28 && var13.field1272 != 0) {
								var29 = var13.field1272;
							}
						}

						if (var13.field1214 == 0) {
							if (var13.field1215) {
								IGZZCJOU.method245(var12, var29, var11, var13.field1228, var13.field1236);
							} else {
								IGZZCJOU.method246(var29, var12, var13.field1228, var11, var13.field1236);
							}
						} else if (var13.field1215) {
							IGZZCJOU.method244(var29, var11, 256 - (var13.field1214 & 0xFF), var13.field1228, var13.field1236, var12);
						} else {
							IGZZCJOU.method247(256 - (var13.field1214 & 0xFF), var12, var29, var11, var13.field1228, var13.field1236);
						}
					} else if (var13.field1281 == 4) {
						KGPDNFPL var30 = var13.field1266;
						String var31 = var13.field1233;
						boolean var32 = false;
						if (field421 == var13.field1219 || field251 == var13.field1219 || field563 == var13.field1219) {
							var32 = true;
						}

						int var33;
						if (method99(var13)) {
							var33 = var13.field1241;
							if (var32 && var13.field1254 != 0) {
								var33 = var13.field1254;
							}

							if (var13.field1274.length() > 0) {
								var31 = var13.field1274;
							}
						} else {
							var33 = var13.field1271;
							if (var32 && var13.field1272 != 0) {
								var33 = var13.field1272;
							}
						}

						if (var13.field1240 == 6 && field246) {
							var31 = "Please wait...";
							var33 = var13.field1271;
						}

						if (IGZZCJOU.field796 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field903 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method159(method104(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method159(method104(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method159(method104(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method159(method104(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method159(method104(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1244) {
								var30.method272(var13.field1228 / 2 + var11, var34, var41, var33, var13.field1257);
							} else {
								var30.method279(var41, var11, var33, var13.field1257, var34);
							}

							var34 += var30.field903;
						}
					} else if (var13.field1281 == 5) {
						PDMJJHOP var42;
						if (method99(var13)) {
							var42 = var13.field1253;
						} else {
							var42 = var13.field1276;
						}

						if (var42 != null) {
							var42.method340(var12, var11);
						}
					} else if (var13.field1281 == 6) {
						int var43 = VWUXWWMW.field1194;
						int var44 = VWUXWWMW.field1195;
						VWUXWWMW.field1194 = var13.field1228 / 2 + var11;
						VWUXWWMW.field1195 = var13.field1236 / 2 + var12;
						int var45 = VWUXWWMW.field1198[var13.field1238] * var13.field1237 >> 16;
						int var46 = VWUXWWMW.field1199[var13.field1238] * var13.field1237 >> 16;
						boolean var47 = method99(var13);
						int var48;
						if (var47) {
							var48 = var13.field1223;
						} else {
							var48 = var13.field1222;
						}

						VYUQHOMO var49;
						if (var48 == -1) {
							var49 = var13.method393(-1, var47, -1);
						} else {
							MJVHTYCA var50 = MJVHTYCA.field1044[var48];
							var49 = var13.method393(var50.field1046[var13.field1270], var47, var50.field1047[var13.field1270]);
						}

						if (var49 != null) {
							var49.method427(0, var13.field1239, 0, var13.field1238, 0, var45, var46);
						}

						VWUXWWMW.field1194 = var43;
						VWUXWWMW.field1195 = var44;
					} else {
						if (var13.field1281 == 7) {
							KGPDNFPL var51 = var13.field1266;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1236; var53++) {
								for (int var54 = 0; var54 < var13.field1228; var54++) {
									if (var13.field1250[var52] > 0) {
										HJAQAKAW var55 = HJAQAKAW.method237(var13.field1250[var52] - 1);
										String var56 = var55.field755;
										if (var55.field749 || var13.field1216[var52] != 1) {
											var56 = var56 + " x" + method86(var13.field1216[var52]);
										}

										int var57 = (var13.field1261 + 115) * var54 + var11;
										int var58 = (var13.field1283 + 12) * var53 + var12;
										if (var13.field1244) {
											var51.method272(var13.field1228 / 2 + var57, var58, var56, var13.field1271, var13.field1257);
										} else {
											var51.method279(var56, var57, var13.field1271, var13.field1257, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1281 == 8 && (field355 == var13.field1219 || field208 == var13.field1219 || field242 == var13.field1219) && field164 == 100) {
							int var59 = 0;
							int var60 = 0;
							KGPDNFPL var61 = field571;
							String var62 = var13.field1233;
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

								int var65 = var61.method273(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field903 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1228 + var11 - var59 - 5;
							int var67 = var13.field1236 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field1228 + arg0) {
								var66 = arg2.field1228 + arg0 - var59;
							}

							IGZZCJOU.method245(var67, 0xFFFFA0, var66, var59, var60);
							IGZZCJOU.method246(0, var67, var59, var66, var60);
							String var68 = var13.field1233;
							int var69 = var61.field903 + var67 + 2;
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

								var61.method279(var71, var66 + 3, 0, false, var69);
								var69 += var61.field903 + 1;
							}
						}
					}
				}
			}

			IGZZCJOU.method242(var5, var8, var6, var7);
		}
	}

	@ObfuscatedName("client.a(LPDMJJHOP;BII)V")
	public final void method84(PDMJJHOP arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field327 + field218 & 0x7FF;
			int var6 = VYUQHOMO.field1354[var5];
			int var7 = VYUQHOMO.field1355[var5];
			var6 = var6 * 256 / (field332 + 256);
			var7 = var7 * 256 / (field332 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field236.method345(83 - var13 - 20, 20, var12 + 94 + 4 - 10, 15, 256, var10, 20, 15);
		} else {
			method117(arg0, arg2, arg1);
		}
	}

	public final void init() {
		field417 = Integer.parseInt(getParameter("nodeid"));
		field418 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method46();
		} else {
			method49();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field419 = false;
		} else {
			field419 = true;
		}

		method208(503, 765);
	}

	@ObfuscatedName("client.e(II)Z")
	public final boolean method85(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field561[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 678) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method86(int arg0) {
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

	@ObfuscatedName("client.g(B)V")
	public final void method87() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field205[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field205[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field206[var10] = (field205[var10 - 1] + field205[var10 + 1] + field205[var10 - 128] + field205[var10 + 128]) / 4;
			}
		}

		field292 += 128;
		if (field292 > field425.length) {
			field292 -= field425.length;
			int var11 = (int) (Math.random() * 12.0D);
			method122(field454[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field206[var14 + 128] - field425[field292 + var14 & field425.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field205[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field430[var16] = field430[var16 + 1];
		}

		field430[var1 - 1] = (int) (Math.sin(field512 / 14.0D) * 16.0D + Math.sin(field512 / 15.0D) * 14.0D + Math.sin(field512 / 16.0D) * 12.0D);

		if (field317 > 0) {
			field317 -= 4;
		}

		if (field318 > 0) {
			field318 -= 4;
		}

		if (field317 == 0 && field318 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field317 = 1024;
			}

			if (var17 == 1) {
				field318 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LXGRGMPUQ;II)V")
	public final void method88(XGRGMPUQ arg0, int arg1) {
		arg0.method475();
		int var3 = arg0.method476(8);
		if (var3 < field162) {
			for (int var4 = var3; var4 < field162; var4++) {
				field498[field497++] = field163[var4];
			}
		}

		if (var3 > field162) {
			signlink.reporterror(field391 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field162 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field163[var5];
			DLMOHDFX var7 = field161[var6];
			int var8 = arg0.method476(1);
			if (var8 == 0) {
				field163[field162++] = var6;
				var7.field607 = field512;
			} else {
				int var9 = arg0.method476(2);
				if (var9 == 0) {
					field163[field162++] = var6;
					var7.field607 = field512;
					field519[field518++] = var6;
				} else if (var9 == 1) {
					field163[field162++] = var6;
					var7.field607 = field512;
					int var10 = arg0.method476(3);
					var7.method197(var10, false);
					int var11 = arg0.method476(1);
					if (var11 == 1) {
						field519[field518++] = var6;
					}
				} else if (var9 == 2) {
					field163[field162++] = var6;
					var7.field607 = field512;
					int var12 = arg0.method476(3);
					var7.method197(var12, true);
					int var13 = arg0.method476(3);
					var7.method197(var13, true);
					int var14 = arg0.method476(1);
					if (var14 == 1) {
						field519[field518++] = var6;
					}
				} else if (var9 == 3) {
					field498[field497++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLXGRGMPUQ;I)V")
	public final void method89(XGRGMPUQ arg0, int arg1) {
		while (arg0.field1433 + 21 < arg1 * 8) {
			int var3 = arg0.method476(14);
			if (var3 == 16383) {
				break;
			}

			if (field161[var3] == null) {
				field161[var3] = new DLMOHDFX();
			}

			DLMOHDFX var4 = field161[var3];
			field163[field162++] = var3;
			var4.field607 = field512;
			var4.field599 = KFUEEJVZ.method267(arg0.method476(13));
			int var5 = arg0.method476(1);
			int var6 = arg0.method476(1);
			if (var6 == 1) {
				field519[field518++] = var3;
			}

			int var7 = arg0.method476(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method476(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field619 = var4.field599.field865;
			var4.field650 = var4.field599.field876;
			var4.field623 = var4.field599.field888;
			var4.field624 = var4.field599.field878;
			var4.field625 = var4.field599.field860;
			var4.field626 = var4.field599.field874;
			var4.field659 = var4.field599.field886;
			var4.method199(var5 == 1, field149.field636[0] + var7, field149.field635[0] + var8);
		}

		arg0.method477();
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method90(int arg0) {
		if (arg0 >= 0) {
			if (field528 != 0) {
				field528 = 0;
				field293 = true;
			}

			int var2 = field559[arg0];
			int var3 = field560[arg0];
			int var4 = field561[arg0];
			int var5 = field562[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 818 && !field246) {
				field369.method454(36);
				field369.method456(var3);
				field246 = true;
			}

			if (var4 == 178 || var4 == 830) {
				String var6 = field521[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					var6 = var6.substring(var7 + 5).trim();
					String var8 = CIRLBWBX.method41(CIRLBWBX.method38(CIRLBWBX.method37(var6)));
					boolean var9 = false;
					for (int var10 = 0; var10 < field516; var10++) {
						MTFZASIN var11 = field515[field517[var10]];
						if (var11 != null && var11.field1091 != null && var11.field1091.equalsIgnoreCase(var8)) {
							method102(var11.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var11.field635[0], field149.field636[0], 0);

							if (var4 == 178) {
								field369.method454(59);
								field369.method456(field517[var10]);
							}

							if (var4 == 830) {
								field369.method454(212);
								field369.method488(field517[var10]);
							}

							var9 = true;
							break;
						}
					}

					if (!var9) {
						method133(0, "", "Unable to find " + var8);
					}
				}
			}

			if (var4 == 157) {
				DLMOHDFX var12 = field161[var5];
				if (var12 != null) {
					method102(var12.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var12.field635[0], field149.field636[0], 0);
					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field369.method454(98);
					field369.method456(var5);
				}
			}

			if (var4 == 1205) {
				HJAQAKAW var13 = HJAQAKAW.method237(var5);
				VYAVYWNE var14 = VYAVYWNE.method395(var3);
				String var15;
				if (var14 != null && var14.field1216[var2] >= 100000) {
					var15 = var14.field1216[var2] + " x " + var13.field755;
				} else if (var13.field778 == null) {
					var15 = "It's a " + var13.field755 + ".";
				} else {
					var15 = new String(var13.field778);
				}

				method133(0, "", var15);
			}

			if (var4 == 453) {
				boolean var16 = method102(var3, 0, 0, 2, 0, field149.field635[0], 0, false, var2, field149.field636[0], 0);
				if (!var16) {
					method102(var3, 1, 0, 2, 1, field149.field635[0], 0, false, var2, field149.field636[0], 0);
				}

				field397 = field691;
				field398 = field692;
				field400 = 2;
				field399 = 0;
				field369.method454(196);
				field369.method456(var5);
				field369.method490(field215);
				field369.method456(field414 + var3);
				field369.method489(field413 + var2);
			}

			if (var4 == 708) {
				DLMOHDFX var18 = field161[var5];
				if (var18 != null) {
					method102(var18.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var18.field635[0], field149.field636[0], 0);
					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field315++;
					if (field315 >= 103) {
						field369.method454(99);
						field369.method455(180);
						field315 = 0;
					}

					field369.method454(100);
					field369.method489(var5);
				}
			}

			if (var4 == 1802) {
				method98(var3, var2, var5);
				field369.method454(245);
				field369.method490(field413 + var2);
				field369.method490(var5 >> 14 & 0x7FFF);
				field369.method490(field414 + var3);
			}

			if (var4 == 36) {
				field369.method454(216);
				field369.method456(var5);
				field369.method489(var3);
				field369.method488(var2);
				field373 = 0;
				field374 = var3;
				field375 = var2;
				field376 = 2;
				if (VYAVYWNE.method395(var3).field1213 == field345) {
					field376 = 1;
				}

				if (VYAVYWNE.method395(var3).field1213 == field424) {
					field376 = 3;
				}
			}

			if (var4 == 821) {
				method160();
			}

			if (var4 == 1918) {
				HJAQAKAW var19 = HJAQAKAW.method237(var5);
				String var20;
				if (var19.field778 == null) {
					var20 = "It's a " + var19.field755 + ".";
				} else {
					var20 = new String(var19.field778);
				}

				method133(0, "", var20);
			}

			if (var4 == 330) {
				boolean var21 = method102(var3, 0, 0, 2, 0, field149.field635[0], 0, false, var2, field149.field636[0], 0);
				if (!var21) {
					method102(var3, 1, 0, 2, 1, field149.field635[0], 0, false, var2, field149.field636[0], 0);
				}

				field397 = field691;
				field398 = field692;
				field400 = 2;
				field399 = 0;
				field369.method454(37);
				field369.method490(field413 + var2);
				field369.method488(var5);
				field369.method489(field414 + var3);
			}

			if (var4 == 214) {
				VYAVYWNE var23 = VYAVYWNE.method395(var3);
				boolean var24 = true;
				if (var23.field1273 > 0) {
					var24 = method172(var23);
				}

				if (var24) {
					field369.method454(27);
					field369.method456(var3);
				}
			}

			if (var4 == 916) {
				boolean var25 = method102(var3, 0, 0, 2, 0, field149.field635[0], 0, false, var2, field149.field636[0], 0);
				if (!var25) {
					method102(var3, 1, 0, 2, 1, field149.field635[0], 0, false, var2, field149.field636[0], 0);
				}

				field397 = field691;
				field398 = field692;
				field400 = 2;
				field399 = 0;
				field369.method454(227);
				field369.method488(var5);
				field369.method490(field413 + var2);
				field369.method456(field414 + var3);
			}

			if (var4 == 675) {
				boolean var27 = method102(var3, 0, 0, 2, 0, field149.field635[0], 0, false, var2, field149.field636[0], 0);
				if (!var27) {
					method102(var3, 1, 0, 2, 1, field149.field635[0], 0, false, var2, field149.field636[0], 0);
				}

				field397 = field691;
				field398 = field692;
				field400 = 2;
				field399 = 0;
				field369.method454(103);
				field369.method488(field413 + var2);
				field369.method488(field198);
				field369.method456(field199);
				field369.method456(field414 + var3);
				field369.method456(var5);
				field369.method490(field200);
			}

			if (var4 == 1958) {
				DLMOHDFX var29 = field161[var5];
				if (var29 != null) {
					KFUEEJVZ var30 = var29.field599;
					if (var30.field861 != null) {
						var30 = var30.method262();
					}

					if (var30 != null) {
						String var31;
						if (var30.field894 == null) {
							var31 = "It's a " + var30.field877 + ".";
						} else {
							var31 = new String(var30.field894);
						}

						method133(0, "", var31);
					}
				}
			}

			if (var4 == 843) {
				MTFZASIN var32 = field515[var5];
				if (var32 != null) {
					method102(var32.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var32.field635[0], field149.field636[0], 0);
					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field369.method454(130);
					field369.method456(field215);
					field369.method488(var5);
				}
			}

			if (var4 == 940) {
				MTFZASIN var33 = field515[var5];
				if (var33 != null) {
					method102(var33.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var33.field635[0], field149.field636[0], 0);
					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field369.method454(212);
					field369.method488(var5);
				}
			}

			if (var4 == 1836) {
				int var34 = var5 >> 14 & 0x7FFF;
				BMWIVHMF var35 = BMWIVHMF.method30(var34);
				String var36;
				if (var35.field115 == null) {
					var36 = "It's a " + var35.field103 + ".";
				} else {
					var36 = new String(var35.field115);
				}

				method133(0, "", var36);
			}

			if (var4 == 31) {
				DLMOHDFX var37 = field161[var5];
				if (var37 != null) {
					method102(var37.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var37.field635[0], field149.field636[0], 0);
					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field369.method454(184);
					field369.method490(var5);
					field369.method490(field215);
				}
			}

			if (var4 == 73) {
				field369.method454(87);
				field369.method456(var5);
				field369.method489(var2);
				field369.method490(var3);
				field373 = 0;
				field374 = var3;
				field375 = var2;
				field376 = 2;
				if (VYAVYWNE.method395(var3).field1213 == field345) {
					field376 = 1;
				}

				if (VYAVYWNE.method395(var3).field1213 == field424) {
					field376 = 3;
				}
			}

			if (var4 == 705) {
				field369.method454(205);
				field369.method456(var3);
				field369.method490(var2);
				field369.method488(var5);
				field373 = 0;
				field374 = var3;
				field375 = var2;
				field376 = 2;
				if (VYAVYWNE.method395(var3).field1213 == field345) {
					field376 = 1;
				}

				if (VYAVYWNE.method395(var3).field1213 == field424) {
					field376 = 3;
				}
			}

			if (var4 == 109) {
				method98(var3, var2, var5);
				field369.method454(201);
				field369.method490(var5 >> 14 & 0x7FFF);
				field369.method488(field414 + var3);
				field369.method488(field413 + var2);
			}

			if (var4 == 477) {
				field369.method454(171);
				field369.method456(var3);
				field369.method488(var5);
				field369.method489(var2);
				field373 = 0;
				field374 = var3;
				field375 = var2;
				field376 = 2;
				if (VYAVYWNE.method395(var3).field1213 == field345) {
					field376 = 1;
				}

				if (VYAVYWNE.method395(var3).field1213 == field424) {
					field376 = 3;
				}
			}

			if (var4 == 657) {
				field369.method454(88);
				field369.method488(var2);
				field369.method488(var3);
				field369.method488(var5);
				field369.method488(field215);
				field373 = 0;
				field374 = var3;
				field375 = var2;
				field376 = 2;
				if (VYAVYWNE.method395(var3).field1213 == field345) {
					field376 = 1;
				}

				if (VYAVYWNE.method395(var3).field1213 == field424) {
					field376 = 3;
				}
			}

			if (var4 == 576) {
				MTFZASIN var38 = field515[var5];
				if (var38 != null) {
					method102(var38.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var38.field635[0], field149.field636[0], 0);
					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field369.method454(79);
					field369.method488(var5);
				}
			}

			if (var4 == 277) {
				field369.method454(131);
				field369.method488(var2);
				field369.method488(var5);
				field369.method456(var3);
				field373 = 0;
				field374 = var3;
				field375 = var2;
				field376 = 2;
				if (VYAVYWNE.method395(var3).field1213 == field345) {
					field376 = 1;
				}

				if (VYAVYWNE.method395(var3).field1213 == field424) {
					field376 = 3;
				}
			}

			if (var4 == 726) {
				String var39 = field521[arg0];
				int var40 = var39.indexOf("@whi@");
				if (var40 != -1) {
					if (field345 == -1) {
						method160();
						field290 = var39.substring(var40 + 5).trim();
						field534 = false;
						field491 = field345 = VYAVYWNE.field1275;
					} else {
						method133(0, "", "Please close the interface you have open before using 'report abuse'");
					}
				}
			}

			if (var4 == 529) {
				method43(field294);
				field294 = -1;
				field293 = true;
			}

			if (var4 == 534) {
				MTFZASIN var41 = field515[var5];
				if (var41 != null) {
					method102(var41.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var41.field635[0], field149.field636[0], 0);
					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field157 += var5;
					if (field157 >= 145) {
						field369.method454(19);
						field369.method459(0);
						field157 = 0;
					}

					field369.method454(78);
					field369.method490(var5);
				}
			}

			if (var4 == 144) {
				String var42 = field521[arg0];
				int var43 = var42.indexOf("@whi@");
				if (var43 != -1) {
					long var44 = CIRLBWBX.method37(var42.substring(var43 + 5).trim());
					int var46 = -1;
					for (int var47 = 0; var47 < field153; var47++) {
						if (field194[var47] == var44) {
							var46 = var47;
							break;
						}
					}

					if (var46 != -1 && field238[var46] > 0) {
						field293 = true;
						field528 = 0;
						field501 = true;
						field436 = "";
						field155 = 3;
						field186 = field194[var46];
						field543 = "Enter message to send to " + field463[var46];
					}
				}
			}

			if (var4 == 982) {
				DLMOHDFX var48 = field161[var5];
				if (var48 != null) {
					method102(var48.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var48.field635[0], field149.field636[0], 0);
					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field545 += var5;
					if (field545 >= 116) {
						field369.method454(69);
						field545 = 0;
					}

					field369.method454(235);
					field369.method490(var5);
				}
			}

			if (var4 == 34) {
				field369.method454(93);
				field369.method489(var2);
				field369.method488(var5);
				field369.method456(var3);
				field373 = 0;
				field374 = var3;
				field375 = var2;
				field376 = 2;
				if (VYAVYWNE.method395(var3).field1213 == field345) {
					field376 = 1;
				}

				if (VYAVYWNE.method395(var3).field1213 == field424) {
					field376 = 3;
				}
			}

			if (var4 == 332) {
				field197 = 1;
				field198 = var2;
				field199 = var3;
				field200 = var5;
				field201 = HJAQAKAW.method237(var5).field755;
				field214 = 0;
				field457 = true;
			} else {
				if (var4 == 168) {
					DLMOHDFX var49 = field161[var5];
					if (var49 != null) {
						method102(var49.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var49.field635[0], field149.field636[0], 0);
						field397 = field691;
						field398 = field692;
						field400 = 2;
						field399 = 0;

						if ((var5 & 0x3) == 0) {
							field564++;
						}

						if (field564 >= 84) {
							field369.method454(39);
							field369.method458(0x6473B0);
							field564 = 0;
						}

						field369.method454(53);
						field369.method490(var5);
					}
				}

				if (var4 == 790) {
					boolean var50 = method102(var3, 0, 0, 2, 0, field149.field635[0], 0, false, var2, field149.field636[0], 0);
					if (!var50) {
						method102(var3, 1, 0, 2, 1, field149.field635[0], 0, false, var2, field149.field636[0], 0);
					}

					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;
					field369.method454(94);
					field369.method490(field413 + var2);
					field369.method488(field414 + var3);
					field369.method488(var5);
				}

				if (var4 == 228) {
					boolean var52 = method102(var3, 0, 0, 2, 0, field149.field635[0], 0, false, var2, field149.field636[0], 0);
					if (!var52) {
						method102(var3, 1, 0, 2, 1, field149.field635[0], 0, false, var2, field149.field636[0], 0);
					}

					field397 = field691;
					field398 = field692;
					field400 = 2;
					field399 = 0;

					if ((var2 & 0x3) == 0) {
						field530++;
					}

					if (field530 >= 93) {
						field369.method454(22);
						field369.method458(0x47D10C);
						field530 = 0;
					}

					field369.method454(1);
					field369.method489(field413 + var2);
					field369.method456(field414 + var3);
					field369.method488(var5);
				}

				if (var4 == 363) {
					field369.method454(43);
					field369.method489(var5);
					field369.method456(var2);
					field369.method456(var3);
					field373 = 0;
					field374 = var3;
					field375 = var2;
					field376 = 2;
					if (VYAVYWNE.method395(var3).field1213 == field345) {
						field376 = 1;
					}

					if (VYAVYWNE.method395(var3).field1213 == field424) {
						field376 = 3;
					}
				}

				if (var4 == 211) {
					field369.method454(27);
					field369.method456(var3);
					VYAVYWNE var54 = VYAVYWNE.method395(var3);
					if (var54.field1243 != null && var54.field1243[0][0] == 5) {
						int var55 = var54.field1243[0][1];
						if (field275[var55] != var54.field1249[0]) {
							field275[var55] = var54.field1249[0];
							method73(var55);
							field457 = true;
						}
					}
				}

				if (var4 == 854) {
					VYAVYWNE var56 = VYAVYWNE.method395(var3);
					field214 = 1;
					field215 = var3;
					field216 = var56.field1245;
					field197 = 0;
					field457 = true;
					String var57 = var56.field1224;
					if (var57.indexOf(" ") != -1) {
						var57 = var57.substring(0, var57.indexOf(" "));
					}

					String var58 = var56.field1224;
					if (var58.indexOf(" ") != -1) {
						var58 = var58.substring(var58.indexOf(" ") + 1);
					}

					field217 = var57 + " " + var56.field1262 + " " + var58;

					if (field216 == 16) {
						field457 = true;
						field396 = 3;
						field248 = true;
					}
				} else {
					if (var4 == 38) {
						field369.method454(209);
						field369.method489(var2);
						field369.method456(var5);
						field369.method456(var3);
						field373 = 0;
						field374 = var3;
						field375 = var2;
						field376 = 2;
						if (VYAVYWNE.method395(var3).field1213 == field345) {
							field376 = 1;
						}

						if (VYAVYWNE.method395(var3).field1213 == field424) {
							field376 = 3;
						}
					}

					if (var4 == 579) {
						field268 += var3;
						if (field268 >= 112) {
							field369.method454(192);
							field369.method459(0);
							field268 = 0;
						}

						method98(var3, var2, var5);
						field369.method454(71);
						field369.method489(var5 >> 14 & 0x7FFF);
						field369.method490(field414 + var3);
						field369.method490(field413 + var2);
					}

					if (var4 == 678 || var4 == 495 || var4 == 633 || var4 == 663) {
						String var59 = field521[arg0];
						int var60 = var59.indexOf("@whi@");
						if (var60 != -1) {
							long var61 = CIRLBWBX.method37(var59.substring(var60 + 5).trim());
							if (var4 == 678) {
								method50(var61);
							}

							if (var4 == 495) {
								method174(var61);
							}

							if (var4 == 633) {
								method167(var61);
							}

							if (var4 == 663) {
								method138(var61);
							}
						}
					}

					if (var4 == 906 && method98(var3, var2, var5)) {
						field369.method454(38);
						field369.method490(field413 + var2);
						field369.method488(var5 >> 14 & 0x7FFF);
						field369.method488(field414 + var3);
						field369.method490(field198);
						field369.method456(field200);
						field369.method456(field199);
					}

					if (var4 == 269) {
						MTFZASIN var63 = field515[var5];
						if (var63 != null) {
							method102(var63.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var63.field635[0], field149.field636[0], 0);
							field397 = field691;
							field398 = field692;
							field400 = 2;
							field399 = 0;
							field369.method454(59);
							field369.method456(var5);
						}
					}

					if (var4 == 610) {
						field369.method454(117);
						field369.method488(var3);
						field369.method489(var5);
						field369.method488(var2);
						field373 = 0;
						field374 = var3;
						field375 = var2;
						field376 = 2;
						if (VYAVYWNE.method395(var3).field1213 == field345) {
							field376 = 1;
						}

						if (VYAVYWNE.method395(var3).field1213 == field424) {
							field376 = 3;
						}
					}

					if (var4 == 250) {
						MTFZASIN var64 = field515[var5];
						if (var64 != null) {
							method102(var64.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var64.field635[0], field149.field636[0], 0);
							field397 = field691;
							field398 = field692;
							field400 = 2;
							field399 = 0;
							field369.method454(151);
							field369.method490(var5);
						}
					}

					if (var4 == 765) {
						if (field250) {
							field394.method540(var3 - 4, var2 - 4);
						} else {
							field394.method540(field692 - 4, field691 - 4);
						}
					}

					if (var4 == 856) {
						field369.method454(27);
						field369.method456(var3);
						VYAVYWNE var65 = VYAVYWNE.method395(var3);
						if (var65.field1243 != null && var65.field1243[0][0] == 5) {
							int var66 = var65.field1243[0][1];
							field275[var66] = 1 - field275[var66];
							method73(var66);
							field457 = true;
						}
					}

					if (var4 == 929) {
						field369.method454(254);
						field369.method489(var5);
						field369.method489(var3);
						field369.method488(var2);
						field373 = 0;
						field374 = var3;
						field375 = var2;
						field376 = 2;
						if (VYAVYWNE.method395(var3).field1213 == field345) {
							field376 = 1;
						}

						if (VYAVYWNE.method395(var3).field1213 == field424) {
							field376 = 3;
						}
					}

					if (var4 == 186) {
						field532++;
						if (field532 >= 112) {
							field369.method454(178);
							field369.method459(0);
							field532 = 0;
						}

						method98(var3, var2, var5);
						field369.method454(215);
						field369.method490(field413 + var2);
						field369.method456(field414 + var3);
						field369.method490(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 179) {
						method98(var3, var2, var5);
						field369.method454(75);
						field369.method489(var5 >> 14 & 0x7FFF);
						field369.method490(field413 + var2);
						field369.method488(field414 + var3);
					}

					if (var4 == 441) {
						MTFZASIN var67 = field515[var5];
						if (var67 != null) {
							method102(var67.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var67.field635[0], field149.field636[0], 0);
							field397 = field691;
							field398 = field692;
							field400 = 2;
							field399 = 0;
							field369.method454(55);
							field369.method456(field199);
							field369.method456(field200);
							field369.method490(field198);
							field369.method490(var5);
						}
					}

					if (var4 == 450 && method98(var3, var2, var5)) {
						field369.method454(84);
						field369.method489(field413 + var2);
						field369.method488(field414 + var3);
						field369.method488(var5 >> 14 & 0x7FFF);
						field369.method456(field215);
					}

					if (var4 == 372) {
						DLMOHDFX var68 = field161[var5];
						if (var68 != null) {
							method102(var68.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var68.field635[0], field149.field636[0], 0);
							field397 = field691;
							field398 = field692;
							field400 = 2;
							field399 = 0;
							field369.method454(199);
							field369.method490(var5);
						}
					}

					if (var4 == 162) {
						boolean var69 = method102(var3, 0, 0, 2, 0, field149.field635[0], 0, false, var2, field149.field636[0], 0);
						if (!var69) {
							method102(var3, 1, 0, 2, 1, field149.field635[0], 0, false, var2, field149.field636[0], 0);
						}

						field397 = field691;
						field398 = field692;
						field400 = 2;
						field399 = 0;
						field369.method454(115);
						field369.method489(var5);
						field369.method488(field414 + var3);
						field369.method489(field413 + var2);
					}

					if (var4 == 754) {
						DLMOHDFX var71 = field161[var5];
						if (var71 != null) {
							method102(var71.field636[0], 1, 0, 2, 1, field149.field635[0], 0, false, var71.field635[0], field149.field636[0], 0);
							field397 = field691;
							field398 = field692;
							field400 = 2;
							field399 = 0;
							field369.method454(250);
							field369.method490(field198);
							field369.method490(field200);
							field369.method488(var5);
							field369.method490(field199);
						}
					}

					if (var4 == 131) {
						field369.method454(200);
						field369.method488(var2);
						field369.method489(field198);
						field369.method489(field200);
						field369.method488(field199);
						field369.method490(var3);
						field369.method456(var5);
						field373 = 0;
						field374 = var3;
						field375 = var2;
						field376 = 2;
						if (VYAVYWNE.method395(var3).field1213 == field345) {
							field376 = 1;
						}

						if (VYAVYWNE.method395(var3).field1213 == field424) {
							field376 = 3;
						}
					}

					field197 = 0;
					field214 = 0;
					field457 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method91() {
		field324 = true;
	}

	@ObfuscatedName("client.b(I)V")
	public final void method92() {
		if (!field346 && !field387 && !field284) {
			field512++;

			if (field289) {
				method68();
			} else {
				method145();
			}

			method139();
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method93() {
		if (field533 == 2) {
			for (KLVJVWGL var1 = (KLVJVWGL) field524.method361(); var1 != null; var1 = (KLVJVWGL) field524.method363()) {
				if (var1.field906 > 0) {
					var1.field906--;
				}

				if (var1.field906 != 0) {
					if (var1.field914 > 0) {
						var1.field914--;
					}

					if (var1.field914 == 0 && var1.field909 >= 1 && var1.field910 >= 1 && var1.field909 <= 102 && var1.field910 <= 102 && (var1.field911 < 0 || VZMNLGCR.method445(var1.field913, var1.field911))) {
						method183(var1.field912, var1.field907, var1.field909, var1.field908, var1.field910, var1.field913, var1.field911);
						var1.field914 = -1;

						if (var1.field915 == var1.field911 && var1.field915 == -1) {
							var1.method334();
						} else if (var1.field915 == var1.field911 && var1.field916 == var1.field912 && var1.field917 == var1.field913) {
							var1.method334();
						}
					}
				} else if (var1.field915 < 0 || VZMNLGCR.method445(var1.field917, var1.field915)) {
					method183(var1.field916, var1.field907, var1.field909, var1.field908, var1.field910, var1.field917, var1.field915);
					var1.method334();
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBIIII)V")
	public final void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = VYUQHOMO.field1354[var7];
			int var13 = VYUQHOMO.field1355[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = VYUQHOMO.field1354[var8];
			int var16 = VYUQHOMO.field1355[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field405 = arg0 - var9;
		field406 = arg1 - var10;
		field407 = arg2 - var11;
		field408 = arg3;
		field409 = arg4;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method95(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field182[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field144[var6][var4][var5] + field144[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field144[var6][var4][var5 + 1] + field144[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method96() {
		if (field547 == null) {
			field677 = null;
			field483 = null;
			field481 = null;
			field480 = null;
			field482 = null;
			field488 = null;
			field489 = null;
			field490 = null;
			field550 = new BVMYRJQC(265, method107(), 128);
			IGZZCJOU.method243();
			field551 = new BVMYRJQC(265, method107(), 128);
			IGZZCJOU.method243();
			field547 = new BVMYRJQC(171, method107(), 509);
			IGZZCJOU.method243();
			field548 = new BVMYRJQC(132, method107(), 360);
			IGZZCJOU.method243();
			field549 = new BVMYRJQC(200, method107(), 360);
			IGZZCJOU.method243();
			field552 = new BVMYRJQC(238, method107(), 202);
			IGZZCJOU.method243();
			field553 = new BVMYRJQC(238, method107(), 203);
			IGZZCJOU.method243();
			field554 = new BVMYRJQC(94, method107(), 74);
			IGZZCJOU.method243();
			field555 = new BVMYRJQC(94, method107(), 75);
			IGZZCJOU.method243();

			if (field249 != null) {
				method72();
				method175();
			}

			field324 = true;
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method97(boolean arg0, byte[] arg1) {
		if (field574) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.a(IBII)Z")
	public final boolean method98(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field394.method532(field359, arg1, arg0, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			BMWIVHMF var8 = BMWIVHMF.method30(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field85;
				var10 = var8.field102;
			} else {
				var9 = var8.field102;
				var10 = var8.field85;
			}

			int var11 = var8.field80;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method102(arg0, var9, var11, 2, var10, field149.field635[0], 0, false, arg1, field149.field636[0], 0);
		} else {
			method102(arg0, 0, 0, 2, 0, field149.field635[0], var7, false, arg1, field149.field636[0], var6 + 1);
		}

		field477++;
		if (field477 > 173) {
			field477 = 0;
			field369.method454(230);
			field369.method456(2704);
		}

		field397 = field691;
		field398 = field692;
		field400 = 2;
		field399 = 0;
		return true;
	}

	@ObfuscatedName("client.a(LVYAVYWNE;B)Z")
	public final boolean method99(VYAVYWNE arg0) {
		if (arg0.field1279 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1279.length; var2++) {
			int var3 = method104(var2, arg0);
			int var4 = arg0.field1249[var2];
			if (arg0.field1279[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1279[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1279[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIIBIIII)V")
	public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		KLVJVWGL var10 = null;
		for (KLVJVWGL var11 = (KLVJVWGL) field524.method361(); var11 != null; var11 = (KLVJVWGL) field524.method363()) {
			if (var11.field907 == arg2 && var11.field909 == arg3 && var11.field910 == arg4 && var11.field908 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new KLVJVWGL();
			var10.field907 = arg2;
			var10.field908 = arg8;
			var10.field909 = arg3;
			var10.field910 = arg4;
			method111(var10);
			field524.method358(var10);
		}

		var10.field911 = arg0;
		var10.field913 = arg1;
		var10.field912 = arg7;
		var10.field914 = arg5;
		var10.field906 = arg6;
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method101(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(IIIIIIIIZIII)Z")
	public final boolean method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field310[var14][var15] = 0;
				field312[var14][var15] = 99999999;
			}
		}

		int var16 = arg5;
		int var17 = arg9;
		field310[arg5][arg9] = 99;
		field312[arg5][arg9] = 0;
		byte var18 = 0;
		int var19 = 0;
		field431[var18] = arg5;
		int var35 = var18 + 1;
		field432[var18] = arg9;
		boolean var20 = false;
		int var21 = field431.length;
		int[][] var22 = field316[field359].field736;
		while (var35 != var19) {
			var16 = field431[var19];
			var17 = field432[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field316[field359].method222(arg8, arg0, var16, arg6, arg10 - 1, var17)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field316[field359].method223(var17, arg10 - 1, arg6, var16, arg0, arg8)) {
					var20 = true;
					break;
				}
			}

			if (arg1 != 0 && arg4 != 0 && field316[field359].method224(var17, arg4, arg2, arg0, arg8, arg1, var16)) {
				var20 = true;
				break;
			}

			int var23 = field312[var16][var17] + 1;
			if (var16 > 0 && field310[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field431[var35] = var16 - 1;
				field432[var35] = var17;
				var35 = (var35 + 1) % var21;
				field310[var16 - 1][var17] = 2;
				field312[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field310[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field431[var35] = var16 + 1;
				field432[var35] = var17;
				var35 = (var35 + 1) % var21;
				field310[var16 + 1][var17] = 8;
				field312[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field310[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field431[var35] = var16;
				field432[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field310[var16][var17 - 1] = 1;
				field312[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field310[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field431[var35] = var16;
				field432[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field310[var16][var17 + 1] = 4;
				field312[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field310[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field431[var35] = var16 - 1;
				field432[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field310[var16 - 1][var17 - 1] = 3;
				field312[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field310[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field431[var35] = var16 + 1;
				field432[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field310[var16 + 1][var17 - 1] = 9;
				field312[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field310[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field431[var35] = var16 - 1;
				field432[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field310[var16 - 1][var17 + 1] = 6;
				field312[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field310[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field431[var35] = var16 + 1;
				field432[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field310[var16 + 1][var17 + 1] = 12;
				field312[var16 + 1][var17 + 1] = var23;
			}
		}

		field487 = 0;
		if (!var20) {
			if (arg7) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
						for (int var27 = arg0 - var25; var27 <= arg0 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field312[var26][var27] < var24) {
								var24 = field312[var26][var27];
								var16 = var26;
								var17 = var27;
								field487 = 1;
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
		field431[var28] = var16;
		int var36 = var28 + 1;
		field432[var28] = var17;
		int var29;
		int var30 = var29 = field310[var16][var17];
		while (arg5 != var16 || arg9 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field431[var36] = var16;
				field432[var36++] = var17;
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

			var30 = field310[var16][var17];
		}

		if (var36 <= 0) {
			if (arg3 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field431[var36];
		int var33 = field432[var36];

		if (arg3 == 0) {
			field369.method454(217);
			field369.method455(var31 + var31 + 3);
		}

		if (arg3 == 1) {
			field369.method454(180);
			field369.method455(var31 + var31 + 3 + 14);
		}

		if (arg3 == 2) {
			field369.method454(222);
			field369.method455(var31 + var31 + 3);
		}

		field369.method481(field694[5] == 1 ? 1 : 0);
		field369.method490(field413 + var32);
		field369.method456(field414 + var33);
		field232 = field431[0];
		field233 = field432[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field369.method481(field431[var36] - var32);
			field369.method482(field432[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method103(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(ZILVYAVYWNE;)I")
	public final int method104(int arg0, VYAVYWNE arg1) {
		if (arg1.field1243 == null || arg0 >= arg1.field1243.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1243[arg0];
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
					var8 = field185[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field158[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field556[var3[var5++]];
				}

				if (var7 == 4) {
					VYAVYWNE var10 = VYAVYWNE.method395(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < HJAQAKAW.field761 && (!HJAQAKAW.method237(var11).field784 || field419)) {
						for (int var12 = 0; var12 < var10.field1250.length; var12++) {
							if (var11 + 1 == var10.field1250[var12]) {
								var8 += var10.field1216[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field275[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field529[field158[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field275[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field149.field1082;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < TLQAADVO.field1165; var13++) {
						if (TLQAADVO.field1167[var13]) {
							var8 += field158[var13];
						}
					}
				}

				if (var7 == 10) {
					VYAVYWNE var14 = VYAVYWNE.method395(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < HJAQAKAW.field761 && (!HJAQAKAW.method237(var15).field784 || field419)) {
						for (int var16 = 0; var16 < var14.field1250.length; var16++) {
							if (var14.field1250[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field531;
				}

				if (var7 == 12) {
					var8 = field437;
				}

				if (var7 == 13) {
					int var17 = field275[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					HUPZKMWH var20 = HUPZKMWH.field786[var19];
					int var21 = var20.field788;
					int var22 = var20.field789;
					int var23 = var20.field790;
					int var24 = field339[var23 - var22];
					var8 = field275[var21] >> var22 & var24;
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
					var8 = (field149.field654 >> 7) + field413;
				}

				if (var7 == 19) {
					var8 = (field149.field655 >> 7) + field414;
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

	@ObfuscatedName("client.o(I)V")
	public final void method105() {
		field483.method34();
		VWUXWWMW.field1200 = field382;
		field368.method374(0, 0);

		if (field501) {
			field572.method271(field543, 0, 40, 239);
			field572.method271(field436 + "*", 128, 60, 239);
		} else if (field528 == 1) {
			field572.method271("Enter amount:", 0, 40, 239);
			field572.method271(field195 + "*", 128, 60, 239);
		} else if (field528 == 2) {
			field572.method271("Enter name:", 0, 40, 239);
			field572.method271(field195 + "*", 128, 60, 239);
		} else if (field330 != null) {
			field572.method271(field330, 0, 40, 239);
			field572.method271("Click to continue", 128, 60, 239);
		} else if (field424 != -1) {
			method83(0, 0, VYAVYWNE.method395(field424), 0);
		} else if (field294 == -1) {
			KGPDNFPL var1 = field571;
			int var2 = 0;
			IGZZCJOU.method242(0, 77, 0, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field192[var3] != null) {
					int var4 = field190[var3];
					int var5 = field522 + 70 - var2 * 14;
					String var6 = field191[var3];
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
							var1.method275(var5, 4, 0, field192[var3]);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field142 == 0 || field142 == 1 && method186(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field334[0].method374(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field334[1].method374(var5 - 12, var8);
								var8 += 14;
							}

							var1.method275(var5, var8, 0, var6 + ":");
							var8 += var1.method273(var6) + 8;
							var1.method275(var5, var8, 255, field192[var3]);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field147 == 0 && (var4 == 7 || field362 == 0 || field362 == 1 && method186(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method275(var5, var9, 0, "From");
							int var11 = var9 + var1.method273("From ");
							if (var7 == 1) {
								field334[0].method374(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field334[1].method374(var5 - 12, var11);
								var11 += 14;
							}

							var1.method275(var5, var11, 0, var6 + ":");
							var11 += var1.method273(var6) + 8;
							var1.method275(var5, var11, 0x800000, field192[var3]);
						}

						var2++;
					}

					if (var4 == 4 && (field273 == 0 || field273 == 1 && method186(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method275(var5, 4, 0x800080, var6 + " " + field192[var3]);
						}

						var2++;
					}

					if (var4 == 5 && field147 == 0 && field362 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method275(var5, 4, 0x800000, field192[var3]);
						}

						var2++;
					}

					if (var4 == 6 && field147 == 0 && field362 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method275(var5, 4, 0, "To " + var6 + ":");
							var1.method275(var5, var1.method273("To " + var6) + 12, 0x800000, field192[var3]);
						}

						var2++;
					}

					if (var4 == 8 && (field273 == 0 || field273 == 1 && method186(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method275(var5, 4, 0x7E3200, var6 + " " + field192[var3]);
						}

						var2++;
					}
				}
			}

			IGZZCJOU.method241();
			field500 = var2 * 14 + 7;
			if (field500 < 78) {
				field500 = 78;
			}

			method169(field500, field500 - field522 - 77, 77, 463, 0);
			String var10;
			if (field149 == null || field149.field1091 == null) {
				var10 = CIRLBWBX.method41(field391);
			} else {
				var10 = field149.field1091;
			}

			var1.method275(90, 4, 0, var10 + ":");
			var1.method275(90, var1.method273(var10 + ": ") + 6, 255, field440 + "*");
			IGZZCJOU.method248(0, 77, 479, 0);
		} else {
			method83(0, 0, VYAVYWNE.method395(field294), 0);
		}

		if (field250 && field167 == 2) {
			method149();
		}

		field483.method35(field676, 17, 357);
		field482.method34();
		VWUXWWMW.field1200 = field384;
	}

	@ObfuscatedName("client.f(Z)V")
	public void method106() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field558);

		if (field204 != null) {
			System.out.println("Od-cycle:" + field204.field964);
		}

		System.out.println("loop-cycle:" + field512);
		System.out.println("draw-cycle:" + field143);
		System.out.println("ptype:" + field378);
		System.out.println("psize:" + field377);

		if (field261 != null) {
			field261.method6();
		}

		field673 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method107() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field679 != null) {
			return field679;
		}

		return this;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method108() {
		if (field690 == 1) {
			if (field691 >= 6 && field691 <= 106 && field692 >= 467 && field692 <= 499) {
				field142 = (field142 + 1) % 4;
				field404 = true;
				field293 = true;
				field369.method454(206);
				field369.method455(field142);
				field369.method455(field362);
				field369.method455(field273);
			}

			if (field691 >= 135 && field691 <= 235 && field692 >= 467 && field692 <= 499) {
				field362 = (field362 + 1) % 3;
				field404 = true;
				field293 = true;
				field369.method454(206);
				field369.method455(field142);
				field369.method455(field362);
				field369.method455(field273);
			}

			if (field691 >= 273 && field691 <= 373 && field692 >= 467 && field692 <= 499) {
				field273 = (field273 + 1) % 3;
				field404 = true;
				field293 = true;
				field369.method454(206);
				field369.method455(field142);
				field369.method455(field362);
				field369.method455(field273);
			}

			if (field691 >= 412 && field691 <= 512 && field692 >= 467 && field692 <= 499) {
				if (field345 == -1) {
					method160();
					field290 = "";
					field534 = false;
					field491 = field345 = VYAVYWNE.field1275;
					return;
				}

				method133(0, "", "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method109() {
		while (true) {
			int var1 = method211();
			if (var1 == -1) {
				return;
			}

			if (field345 != -1 && field491 == field345) {
				if (var1 == 8 && field290.length() > 0) {
					field290 = field290.substring(0, field290.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field290.length() < 12) {
					field290 = field290 + (char) var1;
				}
			} else if (field501) {
				if (var1 >= 32 && var1 <= 122 && field436.length() < 80) {
					field436 = field436 + (char) var1;
					field293 = true;
				}

				if (var1 == 8 && field436.length() > 0) {
					field436 = field436.substring(0, field436.length() - 1);
					field293 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field501 = false;
					field293 = true;

					if (field155 == 1) {
						long var2 = CIRLBWBX.method37(field436);
						method50(var2);
					}

					if (field155 == 2 && field153 > 0) {
						long var4 = CIRLBWBX.method37(field436);
						method167(var4);
					}

					if (field155 == 3 && field436.length() > 0) {
						field369.method454(220);
						field369.method455(0);
						int var6 = field369.field1432;
						field369.method461(field186);
						VOWJQLLT.method367(field436, field369);
						field369.method464(field369.field1432 - var6);
						field436 = VOWJQLLT.method368(field436);
						field436 = ZTOXLNJM.method571(field436);
						method133(6, CIRLBWBX.method41(CIRLBWBX.method38(field186)), field436);

						if (field362 == 2) {
							field362 = 1;
							field404 = true;
							field369.method454(206);
							field369.method455(field142);
							field369.method455(field362);
							field369.method455(field273);
						}
					}

					if (field155 == 4 && field211 < 100) {
						long var7 = CIRLBWBX.method37(field436);
						method174(var7);
					}

					if (field155 == 5 && field211 > 0) {
						long var9 = CIRLBWBX.method37(field436);
						method138(var9);
					}
				}
			} else if (field528 == 1) {
				if (var1 >= 48 && var1 <= 57 && field195.length() < 10) {
					field195 = field195 + (char) var1;
					field293 = true;
				}

				if (var1 == 8 && field195.length() > 0) {
					field195 = field195.substring(0, field195.length() - 1);
					field293 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field195.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field195);
						} catch (Exception var21) {
						}

						field369.method454(114);
						field369.method459(var11);
					}

					field528 = 0;
					field293 = true;
				}
			} else if (field528 == 2) {
				if (var1 >= 32 && var1 <= 122 && field195.length() < 12) {
					field195 = field195 + (char) var1;
					field293 = true;
				}

				if (var1 == 8 && field195.length() > 0) {
					field195 = field195.substring(0, field195.length() - 1);
					field293 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field195.length() > 0) {
						field369.method454(104);
						field369.method461(CIRLBWBX.method37(field195));
					}

					field528 = 0;
					field293 = true;
				}
			} else if (field424 == -1 && field311 == -1) {
				if (var1 >= 32 && var1 <= 122 && field440.length() < 80) {
					field440 = field440 + (char) var1;
					field293 = true;
				}

				if (var1 == 8 && field440.length() > 0) {
					field440 = field440.substring(0, field440.length() - 1);
					field293 = true;
				}

				if ((var1 == 13 || var1 == 10) && field440.length() > 0) {
					if (field525 == 2) {
						if (field440.equals("::clientdrop")) {
							method125();
						}

						if (field440.equals("::lag")) {
							method106();
						}

						if (field440.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field204.method303(2); var12++) {
								field204.method300(2, (byte) 1, var12);
							}
						}

						if (field440.equals("::fpson")) {
							field307 = true;
						}

						if (field440.equals("::fpsoff")) {
							field307 = false;
						}

						if (field440.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field316[var13].field736[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field440.startsWith("::")) {
						field369.method454(188);
						field369.method455(field440.length() - 1);
						field369.method462(field440.substring(2));
					} else {
						String var16 = field440.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field440 = field440.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field440 = field440.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field440 = field440.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field440 = field440.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field440 = field440.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field440 = field440.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field440 = field440.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field440 = field440.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field440 = field440.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field440 = field440.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field440 = field440.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field440 = field440.substring(6);
						}

						String var18 = field440.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field440 = field440.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field440 = field440.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field440 = field440.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field440 = field440.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field440 = field440.substring(6);
						}

						field369.method454(144);
						field369.method455(0);
						int var20 = field369.field1432;
						field369.method481(var17);
						field369.method481(var19);
						field160.field1432 = 0;
						VOWJQLLT.method367(field440, field160);
						field369.method500(field160.field1432, 0, field160.field1431);
						field369.method464(field369.field1432 - var20);
						field440 = VOWJQLLT.method368(field440);
						field440 = ZTOXLNJM.method571(field440);
						field149.field609 = field440;
						field149.field645 = var17;
						field149.field657 = var19;
						field149.field610 = 150;

						if (field525 == 2) {
							method133(2, "@cr2@" + field149.field1091, field149.field609);
						} else if (field525 == 1) {
							method133(2, "@cr1@" + field149.field1091, field149.field609);
						} else {
							method133(2, field149.field1091, field149.field609);
						}

						if (field142 == 2) {
							field142 = 3;
							field404 = true;
							field369.method454(206);
							field369.method455(field142);
							field369.method455(field362);
							field369.method455(field273);
						}
					}

					field440 = "";
					field293 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method110(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(LKLVJVWGL;I)V")
	public final void method111(KLVJVWGL arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field908 == 0) {
			var2 = field394.method528(arg0.field907, arg0.field909, arg0.field910);
		}

		if (arg0.field908 == 1) {
			var2 = field394.method529(arg0.field907, arg0.field910, arg0.field909);
		}

		if (arg0.field908 == 2) {
			var2 = field394.method530(arg0.field907, arg0.field909, arg0.field910);
		}

		if (arg0.field908 == 3) {
			var2 = field394.method531(arg0.field907, arg0.field909, arg0.field910);
		}

		if (var2 != 0) {
			int var6 = field394.method532(arg0.field907, arg0.field909, arg0.field910, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field915 = var3;
		arg0.field917 = var4;
		arg0.field916 = var5;
	}

	@ObfuscatedName("client.b(LXGRGMPUQ;II)V")
	public final void method112(XGRGMPUQ arg0, int arg1) {
		arg0.method475();
		int var3 = arg0.method476(1);
		if (var3 != 0) {
			int var4 = arg0.method476(2);
			if (var4 == 0) {
				field519[field518++] = field514;
			} else if (var4 == 1) {
				int var5 = arg0.method476(3);
				field149.method197(var5, false);
				int var6 = arg0.method476(1);
				if (var6 == 1) {
					field519[field518++] = field514;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method476(3);
				field149.method197(var7, true);
				int var8 = arg0.method476(3);
				field149.method197(var8, true);
				int var9 = arg0.method476(1);
				if (var9 == 1) {
					field519[field518++] = field514;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method476(1);
				field359 = arg0.method476(2);
				int var11 = arg0.method476(7);
				int var12 = arg0.method476(7);
				int var13 = arg0.method476(1);
				if (var13 == 1) {
					field519[field518++] = field514;
				}

				field149.method199(var10 == 1, var11, var12);
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method113(boolean arg0) {
		if (field149.field654 >> 7 == field232 && field149.field655 >> 7 == field233) {
			field232 = 0;
		}

		int var2 = field516;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			MTFZASIN var4;
			int var5;
			if (arg0) {
				var4 = field149;
				var5 = field514 << 14;
			} else {
				var4 = field515[field517[var3]];
				var5 = field517[var3] << 14;
			}

			if (var4 != null && var4.method192()) {
				var4.field1084 = false;
				if ((field420 && field516 > 50 || field516 > 200) && !arg0 && var4.field659 == var4.field646) {
					var4.field1084 = true;
				}

				int var6 = var4.field654 >> 7;
				int var7 = var4.field655 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1088 == null || field512 < var4.field1093 || field512 >= var4.field1094) {
						if ((var4.field654 & 0x7F) == 0x40 && (var4.field655 & 0x7F) == 0x40) {
							if (field354[var6][var7] == field499) {
								continue;
							}

							field354[var6][var7] = field499;
						}

						var4.field1083 = method95(var4.field654, var4.field655, field359);
						field394.method513(var4.field654, var4.field1083, 60, var5, var4.field655, field359, var4, var4.field656, var4.field634);
					} else {
						var4.field1084 = false;
						var4.field1083 = method95(var4.field654, var4.field655, field359);
						field394.method514(var4, var4.field654, var4.field1078, var4.field1083, field359, var5, 60, var4.field656, var4.field1079, var4.field655, var4.field1081, var4.field1080);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLXGRGMPUQ;I)V")
	public final void method114(XGRGMPUQ arg0, int arg1) {
		field497 = 0;
		field518 = 0;
		method112(arg0, arg1);
		method184(arg1, arg0);
		method82(arg1, arg0);
		method51(arg1, arg0);

		for (int var3 = 0; var3 < field497; var3++) {
			int var4 = field498[var3];
			if (field512 != field515[var4].field607) {
				field515[var4] = null;
			}
		}

		if (arg0.field1432 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1432 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field516; var5++) {
			if (field515[field517[var5]] == null) {
				signlink.reporterror(field391 + " null entry in pl list - pos:" + var5 + " size:" + field516);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method115() {
		if (field420 && field533 == 2 && VZMNLGCR.field1361 != field359) {
			method124(null, "Loading - please wait.");
			field533 = 1;
			field187 = System.currentTimeMillis();
		}

		if (field533 == 1) {
			int var1 = method116();
			if (var1 != 0 && System.currentTimeMillis() - field187 > 360000L) {
				signlink.reporterror(field391 + " glcfb " + field541 + "," + var1 + "," + field420 + "," + field565[0] + "," + field204.method302() + "," + field359 + "," + field566 + "," + field567);
				field187 = System.currentTimeMillis();
			}
		}

		if (field533 == 2 && field402 != field359) {
			field402 = field359;
			method129(field359);
		}
	}

	@ObfuscatedName("client.h(Z)I")
	public final int method116() {
		for (int var1 = 0; var1 < field231.length; var1++) {
			if (field231[var1] == null && field342[var1] != -1) {
				return -1;
			}

			if (field337[var1] == null && field343[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field231.length; var3++) {
			byte[] var4 = field337[var3];
			if (var4 != null) {
				int var5 = (field341[var3] >> 8) * 64 - field413;
				int var6 = (field341[var3] & 0xFF) * 64 - field414;
				if (field247) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= VZMNLGCR.method433(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field237) {
			return -4;
		} else {
			field533 = 2;
			VZMNLGCR.field1361 = field359;
			method170();
			field369.method454(231);
			return 0;
		}
	}

	@ObfuscatedName("client.a(LPDMJJHOP;IBI)V")
	public final void method117(PDMJJHOP arg0, int arg1, int arg2) {
		int var4 = field327 + field218 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = VYUQHOMO.field1354[var4];
			int var7 = VYUQHOMO.field1355[var4];
			var6 = var6 * 256 / (field332 + 256);
			var7 = var7 * 256 / (field332 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method346(83 - var9 - arg0.field1151 / 2 - 4, field367, var8 + 94 + 4 - arg0.field1150 / 2);
			} else {
				arg0.method340(83 - var9 - arg0.field1151 / 2 - 4, var8 + 94 - arg0.field1150 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIZLVYAVYWNE;I)V")
	public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, VYAVYWNE arg6, int arg7) {
		if (field535) {
			field150 = 32;
		} else {
			field150 = 0;
		}

		field535 = false;
		if (arg1 >= arg5 && arg1 < arg5 + 16 && arg0 >= arg3 && arg0 < arg3 + 16) {
			arg6.field1282 -= field267 * 4;

			if (arg7 == 1) {
				field457 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field293 = true;
			}
		} else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg0 >= arg3 + arg4 - 16 && arg0 < arg3 + arg4) {
			arg6.field1282 += field267 * 4;

			if (arg7 == 1) {
				field457 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field293 = true;
			}
		} else if (arg1 >= arg5 - field150 && arg1 < arg5 + field150 + 16 && arg0 >= arg3 + 16 && arg0 < arg3 + arg4 - 16 && field267 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg3 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg6.field1282 = (arg2 - arg4) * var10 / var11;

			if (arg7 == 1) {
				field457 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field293 = true;
			}

			field535 = true;
		}
	}

	@ObfuscatedName("client.b(LVYAVYWNE;B)V")
	public final void method119(VYAVYWNE arg0) {
		int var2 = arg0.field1273;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field154 == 0) {
				arg0.field1233 = "Loading friend list";
				arg0.field1240 = 0;
			} else if (var2 == 1 && field154 == 1) {
				arg0.field1233 = "Connecting to friendserver";
				arg0.field1240 = 0;
			} else if (var2 == 2 && field154 != 2) {
				arg0.field1233 = "Please wait...";
				arg0.field1240 = 0;
			} else {
				int var3 = field153;
				if (field154 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1233 = "";
					arg0.field1240 = 0;
				} else {
					arg0.field1233 = field463[var2];
					arg0.field1240 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field153;
			if (field154 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1233 = "";
				arg0.field1240 = 0;
			} else {
				if (field238[var2] == 0) {
					arg0.field1233 = "@red@Offline";
				} else if (field238[var2] < 200) {
					if (field238[var2] == field417) {
						arg0.field1233 = "@gre@World" + (field238[var2] - 9);
					} else {
						arg0.field1233 = "@yel@World" + (field238[var2] - 9);
					}
				} else if (field238[var2] == field417) {
					arg0.field1233 = "@gre@Classic" + (field238[var2] - 219);
				} else {
					arg0.field1233 = "@yel@Classic" + (field238[var2] - 219);
				}

				arg0.field1240 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field153;
			if (field154 != 2) {
				var5 = 0;
			}

			arg0.field1217 = var5 * 15 + 20;
			if (arg0.field1217 <= arg0.field1236) {
				arg0.field1217 = arg0.field1236 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field154 == 0) {
				arg0.field1233 = "Loading ignore list";
				arg0.field1240 = 0;
			} else if (var2 == 1 && field154 == 0) {
				arg0.field1233 = "Please wait...";
				arg0.field1240 = 0;
			} else {
				int var6 = field211;
				if (field154 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1233 = "";
					arg0.field1240 = 0;
				} else {
					arg0.field1233 = CIRLBWBX.method41(CIRLBWBX.method38(field222[var2]));
					arg0.field1240 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1217 = field211 * 15 + 20;
			if (arg0.field1217 <= arg0.field1236) {
				arg0.field1217 = arg0.field1236 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1238 = 150;
			arg0.field1239 = (int) (Math.sin(field512 / 40.0D) * 256.0D) & 0x7FF;

			if (field456) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field165[var7];
					if (var8 >= 0 && !BLFCIBLQ.field67[var8].method19()) {
						return;
					}
				}

				field456 = false;
				VYUQHOMO[] var9 = new VYUQHOMO[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field165[var11];
					if (var12 >= 0) {
						var9[var10++] = BLFCIBLQ.field67[var12].method20();
					}
				}

				VYUQHOMO var13 = new VYUQHOMO(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field244[var14] != 0) {
						var13.method421(field291[var14][0], field291[var14][field244[var14]]);

						if (var14 == 1) {
							var13.method421(field344[0], field344[field244[var14]]);
						}
					}
				}

				var13.method414();
				var13.method415(MJVHTYCA.field1044[field149.field659].field1046[0]);
				var13.method424(64, 850, -30, -50, -30, true);
				arg0.field1263 = 5;
				arg0.field1264 = 0;
				VYAVYWNE.method400(0, var13, 5);
			}
		} else if (var2 == 324) {
			if (field295 == null) {
				field295 = arg0.field1276;
				field296 = arg0.field1253;
			}

			if (field527) {
				arg0.field1276 = field296;
			} else {
				arg0.field1276 = field295;
			}
		} else if (var2 == 325) {
			if (field295 == null) {
				field295 = arg0.field1276;
				field296 = arg0.field1253;
			}

			if (field527) {
				arg0.field1276 = field295;
			} else {
				arg0.field1276 = field296;
			}
		} else if (var2 == 600) {
			arg0.field1233 = field290;
			if (field512 % 20 < 10) {
				arg0.field1233 = arg0.field1233 + "|";
			} else {
				arg0.field1233 = arg0.field1233 + " ";
			}
		} else if (var2 == 620) {
			if (field525 < 1) {
				arg0.field1233 = "";
			} else if (field534) {
				arg0.field1271 = 0xFF0000;
				arg0.field1233 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1271 = 0xFFFFFF;
				arg0.field1233 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field372 - field306;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1233 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field393 == 0) {
				arg0.field1233 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field393 <= field372) {
				arg0.field1233 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method120(field393);
			} else {
				int var17 = field372 + 14 - field393;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1233 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method120(field393) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field304 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field304 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field304 + " unread messages";
			}

			arg0.field1233 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field272 > 0 && field272 <= field372 + 10) {
				arg0.field1233 = "Last password change:\\n@gre@" + method120(field272);
			} else {
				arg0.field1233 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 664) {
			if (field434 == 0) {
				arg0.field1233 = "You have not yet set\\nany contact details.";
			}

			if (field434 == 1) {
				arg0.field1233 = "Contact Details Last Set:\\n@gre@" + method120(field365);
			}

			if (field434 == 2) {
				arg0.field1233 = "You need to set\\nnew contact details.";
			}
		} else if (var2 == 665) {
			if (field539 > 2 && !field419) {
				arg0.field1233 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field539 > 2) {
				arg0.field1233 = "\\n\\nYou have @gre@" + field539 + "@yel@ days of\\nmember credit remaining.";
			} else if (field539 > 0) {
				arg0.field1233 = "You have @gre@" + field539 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1233 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field539 > 2 && !field419) {
				arg0.field1233 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field539 > 0) {
				arg0.field1233 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1233 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field393 > field372) {
				arg0.field1233 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1233 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method120(int arg0) {
		if (arg0 > field372 + 10) {
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

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method121(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field448 = "";
				field449 = "Connecting to server...";
				method69(true);
			}

			field261 = new AAVSEYUK(this, method144(field418 + 43594));
			long var4 = CIRLBWBX.method37(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field369.field1432 = 0;
			field369.method455(14);
			field369.method455(var6);
			field261.method5(2, field369.field1431, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field261.method2();
			}

			int var8 = field261.method2();
			int var9 = var8;

			if (var8 == 0) {
				field261.method4(field196.field1431, 0, 8);
				field196.field1432 = 0;
				field541 = field196.method471();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field541 >> 32), (int) field541 };
				field369.field1432 = 0;
				field369.method455(10);
				field369.method459(var10[0]);
				field369.method459(var10[1]);
				field369.method459(var10[2]);
				field369.method459(var10[3]);
				field369.method459(signlink.uid);
				field369.method462(arg0);
				field369.method462(arg1);
				field369.method480(field252, field428);
				field435.field1432 = 0;

				if (arg2) {
					field435.method455(18);
				} else {
					field435.method455(16);
				}

				field435.method455(field369.field1432 + 36 + 1 + 1 + 2);
				field435.method455(255);
				field435.method456(347);
				field435.method455(field420 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field435.method459(field536[var11]);
				}

				field435.method463(field369.field1431, 0, field369.field1432);
				field369.field1436 = new ENXSCLLS(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field278 = new ENXSCLLS(var10);
				field261.method5(field435.field1432, field435.field1431, 0);
				var8 = field261.method2();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method121(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field525 = field261.method2();
				field455 = field261.method2() == 1;
				field193 = 0L;
				field239 = 0;
				field474.field1130 = 0;
				field681 = true;
				field335 = true;
				field289 = true;
				field369.field1432 = 0;
				field196.field1432 = 0;
				field378 = -1;
				field484 = -1;
				field485 = -1;
				field486 = -1;
				field377 = 0;
				field379 = 0;
				field254 = 0;
				field381 = 0;
				field203 = 0;
				field212 = 0;
				field250 = false;
				field682 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field192[var13] = null;
				}

				field197 = 0;
				field214 = 0;
				field533 = 0;
				field229 = 0;
				field319 = (int) (Math.random() * 100.0D) - 50;
				field568 = (int) (Math.random() * 110.0D) - 55;
				field348 = (int) (Math.random() * 80.0D) - 40;
				field218 = (int) (Math.random() * 120.0D) - 60;
				field332 = (int) (Math.random() * 30.0D) - 20;
				field327 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field451 = 0;
				field402 = -1;
				field232 = 0;
				field233 = 0;
				field516 = 0;
				field162 = 0;

				for (int var14 = 0; var14 < field513; var14++) {
					field515[var14] = null;
					field520[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field161[var15] = null;
				}

				field149 = field515[field514] = new MTFZASIN();
				field411.method365();
				field260.method365();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field314[var16][var17][var18] = null;
						}
					}
				}

				field524 = new VLUKUYNM();
				field154 = 0;
				field153 = 0;
				method43(field294);
				field294 = -1;
				method43(field424);
				field424 = -1;
				method43(field345);
				field345 = -1;
				method43(field311);
				field311 = -1;
				method43(field209);
				field209 = -1;
				method43(field363);
				field363 = -1;
				method43(field151);
				field151 = -1;
				field246 = false;
				field396 = 3;
				field528 = 0;
				field250 = false;
				field501 = false;
				field330 = null;
				field298 = 0;
				field542 = -1;
				field527 = true;
				method161();

				for (int var19 = 0; var19 < 5; var19++) {
					field244[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field357[var20] = null;
					field358[var20] = false;
				}

				field315 = 0;
				field157 = 0;
				field564 = 0;
				field530 = 0;
				field545 = 0;
				field268 = 0;
				field532 = 0;
				method44();
			} else if (var8 == 3) {
				field448 = "";
				field449 = "Invalid username or password.";
			} else if (var8 == 4) {
				field448 = "Your account has been disabled.";
				field449 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field448 = "Your account is already logged in.";
				field449 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field448 = "RuneScape has been updated!";
				field449 = "Please reload this page.";
			} else if (var8 == 7) {
				field448 = "This world is full.";
				field449 = "Please use a different world.";
			} else if (var8 == 8) {
				field448 = "Unable to connect.";
				field449 = "Login server offline.";
			} else if (var8 == 9) {
				field448 = "Login limit exceeded.";
				field449 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field448 = "Unable to connect.";
				field449 = "Bad session id.";
			} else if (var8 == 11) {
				field448 = "Login server rejected session.";
				field449 = "Please try again.";
			} else if (var8 == 12) {
				field448 = "You need a members account to login to this world.";
				field449 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field448 = "Could not complete login.";
				field449 = "Please try using a different world.";
			} else if (var8 == 14) {
				field448 = "The server is being updated.";
				field449 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field289 = true;
				field369.field1432 = 0;
				field196.field1432 = 0;
				field378 = -1;
				field484 = -1;
				field485 = -1;
				field486 = -1;
				field377 = 0;
				field379 = 0;
				field254 = 0;
				field212 = 0;
				field250 = false;
				field187 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field448 = "Login attempts exceeded.";
				field449 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field448 = "You are standing in a members-only area.";
				field449 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field448 = "Invalid loginserver requested";
				field449 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field261.method2();
				for (var21 += 3; var21 >= 0; var21--) {
					field448 = "You have only just left another world";
					field449 = "Your profile will be transferred in: " + var21;
					method69(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method121(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field448 = "Malformed login packet.";
				field449 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field448 = "Unexpected server response";
				field449 = "Please try using a different world.";
			} else if (var9 != 0) {
				field448 = "No response from server";
				field449 = "Please try using a different world.";
			} else if (field360 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field360++;
				method121(arg0, arg1, arg2);
			} else {
				field448 = "No response from loginserver";
				field449 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field448 = "";
			field449 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(LVSJQVIFL;I)V")
	public final void method122(VSJQVIFL arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field425.length; var3++) {
			field425[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field425[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field426[var9] = (field425[var9 - 1] + field425[var9 + 1] + field425[var9 - 128] + field425[var9 + 128]) / 4;
				}
			}

			int[] var10 = field425;
			field425 = field426;
			field426 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1184; var12++) {
				for (int var13 = 0; var13 < arg0.field1183; var13++) {
					if (arg0.field1181[var11++] != 0) {
						int var14 = var13 + arg0.field1185 + 16;
						int var15 = var12 + arg0.field1186 + 16;
						int var16 = (var15 << 7) + var14;
						field425[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method123() {
		try {
			if (field261 != null) {
				field261.method1();
			}
		} catch (Exception var2) {
		}

		field261 = null;
		field289 = false;
		field146 = 0;
		field391 = "";
		field392 = "";
		method48();
		field394.method502();

		for (int var1 = 0; var1 < 4; var1++) {
			field316[var1].method213();
		}

		System.gc();
		method134();
		field188 = -1;
		field308 = -1;
		field202 = 0;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method124(String arg0, String arg1) {
		if (field482 != null) {
			field482.method34();
			VWUXWWMW.field1200 = field384;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field571.method271(arg1, 0, var3, 257);
			field571.method271(arg1, 0xFFFFFF, var3 - 1, 256);
			var3 += 15;
			if (arg0 != null) {
				field571.method271(arg0, 0, var3, 257);
				field571.method271(arg0, 0xFFFFFF, var3 - 1, 256);
			}

			field482.method35(field676, 4, 4);
		} else if (field677 != null) {
			field677.method34();
			VWUXWWMW.field1200 = field385;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			IGZZCJOU.method245(var4 - var6 / 2 - 5, 0, 383 - var5 / 2, var5, var6);
			IGZZCJOU.method246(0xFFFFFF, var4 - var6 / 2 - 5, var5, 383 - var5 / 2, var6);

			if (arg0 != null) {
				var4 -= 7;
			}

			field571.method271(arg1, 0, var4, 383);
			field571.method271(arg1, 0xFFFFFF, var4 - 1, 382);
			var4 += 15;
			if (arg0 != null) {
				field571.method271(arg0, 0, var4, 383);
				field571.method271(arg0, 0xFFFFFF, var4 - 1, 382);
			}

			field677.method35(field676, 0, 0);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method125() {
		if (field381 > 0) {
			method123();
		} else {
			method124("Please wait - attempting to reestablish", "Connection lost");
			field451 = 0;
			field232 = 0;
			AAVSEYUK var1 = field261;
			field289 = false;
			field360 = 0;
			method121(field391, field392, true);

			if (!field289) {
				method123();
			}

			try {
				var1.method1();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.s(I)I")
	public final int method126() {
		int var1 = 3;
		if (field408 < 310) {
			int var2 = field405 >> 7;
			int var3 = field407 >> 7;
			int var4 = field149.field654 >> 7;
			int var5 = field149.field655 >> 7;

			if ((field182[field359][var2][var3] & 0x4) != 0) {
				var1 = field359;
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

					if ((field182[field359][var2][var3] & 0x4) != 0) {
						var1 = field359;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field182[field359][var2][var3] & 0x4) != 0) {
							var1 = field359;
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

					if ((field182[field359][var2][var3] & 0x4) != 0) {
						var1 = field359;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field182[field359][var2][var3] & 0x4) != 0) {
							var1 = field359;
						}
					}
				}
			}
		}

		if ((field182[field359][field149.field654 >> 7][field149.field655 >> 7] & 0x4) != 0) {
			var1 = field359;
		}

		return var1;
	}

	@ObfuscatedName("client.t(I)I")
	public final int method127() {
		int var1 = method95(field405, field407, field359);
		if (var1 - field406 < 800 && (field182[field359][field405 >> 7][field407 >> 7] & 0x4) != 0) {
			return field359;
		}

		return 3;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method128(int arg0) {
		VYAVYWNE var2 = VYAVYWNE.method395(arg0);
		for (int var3 = 0; var3 < var2.field1256.length && var2.field1256[var3] != -1; var3++) {
			VYAVYWNE var4 = VYAVYWNE.method395(var2.field1256[var3]);
			if (var4.field1281 == 1) {
				method128(var4.field1219);
			}

			var4.field1270 = 0;
			var4.field1234 = 0;
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method129(int arg0) {
		int[] var2 = field234.field1145;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field182[arg0][var7][var5] & 0x18) == 0) {
					field394.method537(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field182[arg0 + 1][var7][var5] & 0x8) != 0) {
					field394.method537(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field234.method335();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field182[arg0][var11][var10] & 0x18) == 0) {
					method55(var11, var10, arg0, var9, var8);
				}

				if (arg0 < 3 && (field182[arg0 + 1][var11][var10] & 0x8) != 0) {
					method55(var11, var10, arg0 + 1, var9, var8);
				}
			}
		}

		if (field482 != null) {
			field482.method34();
			VWUXWWMW.field1200 = field384;
		}

		field288++;
		if (field288 > 133) {
			field288 = 0;
			field369.method454(149);
			field369.method458(0x439302);
		}

		field388 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field394.method531(field359, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = BMWIVHMF.method30(var14).field90;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field316[field359].field736;
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

						field433[field388] = field423[var15];
						field389[field388] = var16;
						field390[field388] = var17;
						field388++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)Z")
	public final boolean method130() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.v(I)V")
	public final void method131() {
		int var1 = field572.method273("Choose Option");
		for (int var2 = 0; var2 < field212; var2++) {
			int var3 = field572.method273(field521[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field212 * 15 + 21;
		if (field691 > 4 && field692 > 4 && field691 < 516 && field692 < 338) {
			int var5 = field691 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field692 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field250 = true;
			field167 = 0;
			field168 = var5;
			field169 = var6;
			field170 = var1;
			field171 = field212 * 15 + 22;
		}

		if (field691 > 553 && field692 > 205 && field691 < 743 && field692 < 466) {
			int var7 = field691 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field692 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field250 = true;
			field167 = 1;
			field168 = var7;
			field169 = var8;
			field170 = var1;
			field171 = field212 * 15 + 22;
		}

		if (field691 > 17 && field692 > 357 && field691 < 496 && field692 < 453) {
			int var9 = field691 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field692 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field250 = true;
			field167 = 2;
			field168 = var9;
			field169 = var10;
			field170 = var1;
			field171 = field212 * 15 + 22;
		}
	}

	public final void run() {
		if (field479) {
			method136();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method132() {
		if (field137 == 0) {
			field521[0] = "Cancel";
			field561[0] = 1027;
			field212 = 1;
			if (field311 == -1) {
				method156();
				field450 = 0;
				field523 = 0;

				if (field684 > 4 && field685 > 4 && field684 < 516 && field685 < 338) {
					if (field345 == -1) {
						method75();
					} else {
						method153(VYAVYWNE.method395(field345), field685, 4, field684, 0, 4, 0);
					}
				}

				if (field563 != field450) {
					field563 = field450;
				}

				if (field523 != field242) {
					field242 = field523;
				}

				field450 = 0;
				field523 = 0;

				if (field684 > 553 && field685 > 205 && field684 < 743 && field685 < 466) {
					if (field363 != -1) {
						method153(VYAVYWNE.method395(field363), field685, 553, field684, 0, 205, 1);
					} else if (field473[field396] != -1) {
						method153(VYAVYWNE.method395(field473[field396]), field685, 553, field684, 0, 205, 1);
					}
				}

				if (field450 != field251) {
					field457 = true;
					field251 = field450;
				}

				if (field523 != field208) {
					field457 = true;
					field208 = field523;
				}

				field450 = 0;
				field523 = 0;

				if (field684 > 17 && field685 > 357 && field684 < 496 && field685 < 453) {
					if (field424 != -1) {
						method153(VYAVYWNE.method395(field424), field685, 17, field684, 0, 357, 2);
					} else if (field294 != -1) {
						method153(VYAVYWNE.method395(field294), field685, 17, field684, 0, 357, 3);
					} else if (field685 < 434 && field684 < 426) {
						method187(field685 - 357, field684 - 17);
					}
				}

				if ((field424 != -1 || field294 != -1) && field450 != field421) {
					field293 = true;
					field421 = field450;
				}

				if ((field424 != -1 || field294 != -1) && field523 != field355) {
					field293 = true;
					field355 = field523;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field212 - 1; var2++) {
						if (field561[var2] < 1000 && field561[var2 + 1] > 1000) {
							String var3 = field521[var2];
							field521[var2] = field521[var2 + 1];
							field521[var2 + 1] = var3;
							int var4 = field561[var2];
							field561[var2] = field561[var2 + 1];
							field561[var2 + 1] = var4;
							int var5 = field559[var2];
							field559[var2] = field559[var2 + 1];
							field559[var2 + 1] = var5;
							int var6 = field560[var2];
							field560[var2] = field560[var2 + 1];
							field560[var2 + 1] = var6;
							int var7 = field562[var2];
							field562[var2] = field562[var2 + 1];
							field562[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field450 = 0;
				field523 = 0;
				method153(VYAVYWNE.method395(field311), field685, 0, field684, 0, 0, 0);

				if (field563 != field450) {
					field563 = field450;
				}

				if (field523 != field242) {
					field242 = field523;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method133(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field294 != -1) {
			field330 = arg2;
			field690 = 0;
		}

		if (field424 == -1) {
			field293 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field190[var4] = field190[var4 - 1];
			field191[var4] = field191[var4 - 1];
			field192[var4] = field192[var4 - 1];
		}

		field190[0] = arg0;
		field191[0] = arg1;
		field192[0] = arg2;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method134() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.j(B)V")
	public final void method135() {
		if (field147 != 0) {
			KGPDNFPL var1 = field571;
			int var2 = 0;
			if (field254 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field192[var3] != null) {
					int var4 = field190[var3];
					String var5 = field191[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field362 == 0 || field362 == 1 && method186(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method275(var7, var8, 0, "From");
						var1.method275(var7 - 1, var8, 0xFFFF, "From");
						int var11 = var8 + var1.method273("From ");
						if (var6 == 1) {
							field334[0].method374(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field334[1].method374(var7 - 12, var11);
							var11 += 14;
						}

						var1.method275(var7, var11, 0, var5 + ": " + field192[var3]);
						var1.method275(var7 - 1, var11, 0xFFFF, var5 + ": " + field192[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field362 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method275(var9, 4, 0, field192[var3]);
						var1.method275(var9 - 1, 4, 0xFFFF, field192[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field362 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method275(var10, 4, 0, "To " + var5 + ": " + field192[var3]);
						var1.method275(var10 - 1, 4, 0xFFFF, "To " + var5 + ": " + field192[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method136() {
		field331 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field386) {
				field558++;
				method87();
				method87();
				method165();
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

		field331 = false;
	}

	@ObfuscatedName("client.x(I)V")
	public final void method137() {
		method135();

		if (field400 == 1) {
			field537[field399 / 100].method340(field398 - 8 - 4, field397 - 8 - 4);
			field478++;
			if (field478 > 83) {
				field478 = 0;
				field369.method454(137);
			}
		}

		if (field400 == 2) {
			field537[field399 / 100 + 4].method340(field398 - 8 - 4, field397 - 8 - 4);
		}

		if (field151 != -1) {
			method162(field151, field403);
			method83(0, 0, VYAVYWNE.method395(field151), 0);
		}

		if (field345 != -1) {
			method162(field345, field403);
			method83(0, 0, VYAVYWNE.method395(field345), 0);
		}

		method151();

		if (!field250) {
			method132();
			method157();
		} else if (field167 == 0) {
			method149();
		}

		if (field298 == 1) {
			field340.method340(296, 472);
		}

		if (field307) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field672 < 30 && field420) {
				var3 = 0xFF0000;
			}

			if (field672 < 20 && !field420) {
				var3 = 0xFF0000;
			}

			field571.method270(var2, "Fps:" + field672, var1, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field420) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field420) {
				int var8 = 0xFF0000;
			}

			field571.method270(var2, "Mem:" + var5 + "k", var1, 0xFFFF00);
			var2 += 15;
		}

		if (field254 != 0) {
			int var9 = field254 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field571.method275(329, 4, 0xFFFF00, "System update in: " + var10 + ":0" + var9);
			} else {
				field571.method275(329, 4, 0xFFFF00, "System update in: " + var10 + ":" + var9);
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 347);

			if (arg0.length == 5) {
				field417 = Integer.parseInt(arg0[0]);
				field418 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method46();
				} else if (arg0[2].equals("highmem")) {
					method49();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field419 = false;
				} else if (arg0[3].equals("members")) {
					field419 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method207(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method138(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field211; var3++) {
				if (field222[var3] == arg0) {
					field211--;
					field457 = true;

					for (int var4 = var3; var4 < field211; var4++) {
						field222[var4] = field222[var4 + 1];
					}

					field369.method454(135);
					field369.method461(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method139() {
		while (true) {
			SFALJUFQ var1 = field204.method292();
			if (var1 == null) {
				return;
			}

			if (var1.field1161 == 0) {
				VYUQHOMO.method405(var1.field1160, var1.field1164);

				if ((field204.method294(var1.field1164) & 0x62) != 0) {
					field457 = true;

					if (field424 != -1 || field294 != -1) {
						field293 = true;
					}
				}
			}

			if (var1.field1161 == 1 && var1.field1160 != null) {
				APJPJMYV.method8(var1.field1160);
			}

			if (var1.field1161 == 2 && field308 == var1.field1164 && var1.field1160 != null) {
				method97(field309, var1.field1160);
			}

			if (var1.field1161 == 3 && field533 == 1) {
				for (int var2 = 0; var2 < field231.length; var2++) {
					if (field342[var2] == var1.field1164) {
						field231[var2] = var1.field1160;

						if (var1.field1160 == null) {
							field342[var2] = -1;
						}

						break;
					}

					if (field343[var2] == var1.field1164) {
						field337[var2] = var1.field1160;

						if (var1.field1160 == null) {
							field343[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1161 == 93 && field204.method305(var1.field1164)) {
				VZMNLGCR.method436(new XGRGMPUQ(var1.field1160), field204);
			}
		}
	}

	@ObfuscatedName("client.l(B)Z")
	public final boolean method140() {
		if (field261 == null) {
			return false;
		}

		try {
			int var1 = field261.method3();
			if (var1 == 0) {
				return false;
			}

			if (field378 == -1) {
				field261.method4(field196.field1431, 0, 1);
				field378 = field196.field1431[0] & 0xFF;
				if (field278 != null) {
					field378 = field378 - field278.method200() & 0xFF;
				}

				field377 = IZVIDNCJ.field814[field378];
				var1--;
			}

			if (field377 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field261.method4(field196.field1431, 0, 1);
				field377 = field196.field1431[0] & 0xFF;
				var1--;
			}

			if (field377 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field261.method4(field196.field1431, 0, 2);
				field196.field1432 = 0;
				field377 = field196.method467();
				var1 -= 2;
			}

			if (var1 < field377) {
				return false;
			}

			field196.field1432 = 0;
			field261.method4(field196.field1431, 0, field377);
			field379 = 0;
			field486 = field485;
			field485 = field484;
			field484 = field378;

			if (field378 == 169) {
				int var2 = field196.method491();
				int var3 = field196.method493();

				if (field424 != -1) {
					method43(field424);
					field424 = -1;
					field293 = true;
				}

				if (field311 != -1) {
					method43(field311);
					field311 = -1;
					field324 = true;
				}

				if (field209 != -1) {
					method43(field209);
					field209 = -1;
				}

				if (field345 != var2) {
					method43(field345);
					field345 = var2;
				}

				if (field363 != var3) {
					method43(field363);
					field363 = var3;
				}

				if (field528 != 0) {
					field528 = 0;
					field293 = true;
				}

				field457 = true;
				field248 = true;
				field246 = false;
				field378 = -1;
				return true;
			}

			if (field378 == 79) {
				int var4 = field196.method467();
				int var5 = field196.method493();
				int var6 = field196.method493();
				int var7 = field196.method492();
				VYAVYWNE.method395(var6).field1238 = var4;
				VYAVYWNE.method395(var6).field1239 = var7;
				VYAVYWNE.method395(var6).field1237 = var5;
				field378 = -1;
				return true;
			}

			if (field378 == 30) {
				field542 = field196.method465();
				if (field542 == field396) {
					if (field542 == 3) {
						field396 = 1;
					} else {
						field396 = 3;
					}

					field457 = true;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 170) {
				field243 = field196.method493();
				field441 = field196.method483();
				field378 = -1;
				return true;
			}

			if (field378 == 9) {
				if (field396 == 12) {
					field457 = true;
				}

				field531 = field196.method465();
				field378 = -1;
				return true;
			}

			if (field378 == 149) {
				field372 = field196.method492();
				field365 = field196.method491();
				field364 = field196.method498();
				field434 = field196.method465();
				field196.method493();
				field393 = field196.method493();
				field196.method493();
				field304 = field196.method467();
				field539 = field196.method467();
				field306 = field196.method493();
				field272 = field196.method491();
				signlink.dnslookup(CIRLBWBX.method40(field364));
				field378 = -1;
				return true;
			}

			if (field378 == 155) {
				method123();
				field378 = -1;
				return false;
			}

			if (field378 == 105) {
				for (int var8 = 0; var8 < field515.length; var8++) {
					if (field515[var8] != null) {
						field515[var8].field611 = -1;
					}
				}

				for (int var9 = 0; var9 < field161.length; var9++) {
					if (field161[var9] != null) {
						field161[var9].field611 = -1;
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 64) {
				field457 = true;
				int var10 = field196.method467();
				VYAVYWNE var11 = VYAVYWNE.method395(var10);
				int var12 = field196.method467();
				for (int var13 = 0; var13 < var12; var13++) {
					int var14 = field196.method483();
					if (var14 == 255) {
						var14 = field196.method498();
					}

					var11.field1250[var13] = field196.method491();
					var11.field1216[var13] = var14;
				}

				for (int var15 = var12; var15 < var11.field1250.length; var15++) {
					var11.field1250[var15] = 0;
					var11.field1216[var15] = 0;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 142) {
				long var16 = field196.method471();
				int var18 = field196.method465();
				String var19 = CIRLBWBX.method41(CIRLBWBX.method38(var16));
				for (int var20 = 0; var20 < field153; var20++) {
					if (field194[var20] == var16) {
						if (field238[var20] != var18) {
							field238[var20] = var18;
							field457 = true;

							if (var18 > 0) {
								method133(5, "", var19 + " has logged in.");
							}

							if (var18 == 0) {
								method133(5, "", var19 + " has logged out.");
							}
						}

						var19 = null;
						break;
					}
				}

				if (var19 != null && field153 < 200) {
					field194[field153] = var16;
					field463[field153] = var19;
					field238[field153] = var18;
					field153++;
					field457 = true;
				}

				boolean var21 = false;
				while (!var21) {
					var21 = true;
					for (int var22 = 0; var22 < field153 - 1; var22++) {
						if (field238[var22] != field417 && field238[var22 + 1] == field417 || field238[var22] == 0 && field238[var22 + 1] != 0) {
							int var23 = field238[var22];
							field238[var22] = field238[var22 + 1];
							field238[var22 + 1] = var23;
							String var24 = field463[var22];
							field463[var22] = field463[var22 + 1];
							field463[var22 + 1] = var24;
							long var25 = field194[var22];
							field194[var22] = field194[var22 + 1];
							field194[var22 + 1] = var25;
							field457 = true;
							var21 = false;
						}
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 210) {
				long var27 = field196.method471();
				int var29 = field196.method470();
				int var30 = field196.method465();
				boolean var31 = false;
				for (int var32 = 0; var32 < 100; var32++) {
					if (field221[var32] == var29) {
						var31 = true;
						break;
					}
				}

				if (var30 <= 1) {
					for (int var33 = 0; var33 < field211; var33++) {
						if (field222[var33] == var27) {
							var31 = true;
							break;
						}
					}
				}

				if (!var31 && field172 == 0) {
					try {
						field221[field210] = var29;
						field210 = (field210 + 1) % 100;
						String var34 = VOWJQLLT.method366(field196, field377 - 13);
						if (var30 != 3) {
							var34 = ZTOXLNJM.method571(var34);
						}

						if (var30 == 2 || var30 == 3) {
							method133(7, "@cr2@" + CIRLBWBX.method41(CIRLBWBX.method38(var27)), var34);
						} else if (var30 == 1) {
							method133(7, "@cr1@" + CIRLBWBX.method41(CIRLBWBX.method38(var27)), var34);
						} else {
							method133(3, CIRLBWBX.method41(CIRLBWBX.method38(var27)), var34);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 248) {
				int var36 = field196.method491();
				method128(var36);

				if (field424 != -1) {
					method43(field424);
					field424 = -1;
					field293 = true;
				}

				if (field311 != -1) {
					method43(field311);
					field311 = -1;
					field324 = true;
				}

				if (field209 != -1) {
					method43(field209);
					field209 = -1;
				}

				if (field345 != -1) {
					method43(field345);
					field345 = -1;
				}

				if (field363 != var36) {
					method43(field363);
					field363 = var36;
				}

				if (field528 != 0) {
					field528 = 0;
					field293 = true;
				}

				field457 = true;
				field248 = true;
				field246 = false;
				field378 = -1;
				return true;
			}

			if (field378 == 172) {
				for (int var37 = 0; var37 < field275.length; var37++) {
					if (field321[var37] != field275[var37]) {
						field275[var37] = field321[var37];
						method73(var37);
						field457 = true;
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 244) {
				field203 = field196.method465();
				if (field203 == 1) {
					field166 = field196.method467();
				}

				if (field203 >= 2 && field203 <= 6) {
					if (field203 == 2) {
						field461 = 64;
						field462 = 64;
					}

					if (field203 == 3) {
						field461 = 0;
						field462 = 64;
					}

					if (field203 == 4) {
						field461 = 128;
						field462 = 64;
					}

					if (field203 == 5) {
						field461 = 64;
						field462 = 0;
					}

					if (field203 == 6) {
						field461 = 64;
						field462 = 128;
					}

					field203 = 2;
					field458 = field196.method467();
					field459 = field196.method467();
					field460 = field196.method465();
				}

				if (field203 == 10) {
					field235 = field196.method467();
				}

				field378 = -1;
				return true;
			}

			if (field378 == 111) {
				if (field396 == 12) {
					field457 = true;
				}

				field437 = field196.method468();
				field378 = -1;
				return true;
			}

			if (field378 == 224) {
				field476 = true;
				field279 = field196.method465();
				field280 = field196.method465();
				field281 = field196.method467();
				field282 = field196.method465();
				field283 = field196.method465();
				if (field283 >= 100) {
					int var38 = field279 * 128 + 64;
					int var39 = field280 * 128 + 64;
					int var40 = method95(var38, var39, field359) - field281;
					int var41 = var38 - field405;
					int var42 = var40 - field406;
					int var43 = var39 - field407;
					int var44 = (int) Math.sqrt(var41 * var41 + var43 * var43);
					field408 = (int) (Math.atan2(var42, var44) * 325.949D) & 0x7FF;
					field409 = (int) (Math.atan2(var41, var43) * -325.949D) & 0x7FF;

					if (field408 < 128) {
						field408 = 128;
					}

					if (field408 > 383) {
						field408 = 383;
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 165) {
				int var45 = field196.method495();
				if (var45 >= 0) {
					method128(var45);
				}

				if (field151 != var45) {
					method43(field151);
					field151 = var45;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 75) {
				field496 = field196.method485();
				field495 = field196.method485();
				for (int var46 = field495; var46 < field495 + 8; var46++) {
					for (int var47 = field496; var47 < field496 + 8; var47++) {
						if (field314[field359][var46][var47] != null) {
							field314[field359][var46][var47] = null;
							method74(var46, var47);
						}
					}
				}

				for (KLVJVWGL var48 = (KLVJVWGL) field524.method361(); var48 != null; var48 = (KLVJVWGL) field524.method363()) {
					if (var48.field909 >= field495 && var48.field909 < field495 + 8 && var48.field910 >= field496 && var48.field910 < field496 + 8 && field359 == var48.field907) {
						var48.field906 = 0;
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 120) {
				field254 = field196.method491() * 30;
				field378 = -1;
				return true;
			}

			if (field378 == 89) {
				int var49 = field196.method492();
				int var50 = field196.method492();
				VYAVYWNE.method395(var49).field1263 = 2;
				VYAVYWNE.method395(var49).field1264 = var50;
				field378 = -1;
				return true;
			}

			if (field378 == 150) {
				field142 = field196.method465();
				field362 = field196.method465();
				field273 = field196.method465();
				field404 = true;
				field293 = true;
				field378 = -1;
				return true;
			}

			if (field378 == 104) {
				int var51 = field196.method491();
				method128(var51);

				if (field363 != -1) {
					method43(field363);
					field363 = -1;
					field457 = true;
					field248 = true;
				}

				if (field424 != -1) {
					method43(field424);
					field424 = -1;
					field293 = true;
				}

				if (field311 != -1) {
					method43(field311);
					field311 = -1;
					field324 = true;
				}

				if (field209 != -1) {
					method43(field209);
					field209 = -1;
				}

				if (field345 != var51) {
					method43(field345);
					field345 = var51;
				}

				if (field528 != 0) {
					field528 = 0;
					field293 = true;
				}

				field246 = false;
				field378 = -1;
				return true;
			}

			if (field378 == 13) {
				if (field363 != -1) {
					method43(field363);
					field363 = -1;
					field457 = true;
					field248 = true;
				}

				if (field424 != -1) {
					method43(field424);
					field424 = -1;
					field293 = true;
				}

				if (field311 != -1) {
					method43(field311);
					field311 = -1;
					field324 = true;
				}

				if (field209 != -1) {
					method43(field209);
					field209 = -1;
				}

				if (field345 != -1) {
					method43(field345);
					field345 = -1;
				}

				if (field528 != 0) {
					field528 = 0;
					field293 = true;
				}

				field246 = false;
				field378 = -1;
				return true;
			}

			if (field378 == 118) {
				int var52 = field196.method465();
				int var53 = field196.method465();
				int var54 = field196.method465();
				int var55 = field196.method465();
				field159[var52] = true;
				field156[var52] = var53;
				field356[var52] = var54;
				field452[var52] = var55;
				field401[var52] = 0;
				field378 = -1;
				return true;
			}

			if (field378 == 154) {
				int var56 = field196.method495();
				if (field294 != var56) {
					method43(field294);
					field294 = var56;
				}

				field293 = true;
				field378 = -1;
				return true;
			}

			if (field378 == 166) {
				String var57 = field196.method472();
				if (var57.endsWith(":tradereq:")) {
					String var58 = var57.substring(0, var57.indexOf(":"));
					long var59 = CIRLBWBX.method37(var58);
					boolean var61 = false;
					for (int var62 = 0; var62 < field211; var62++) {
						if (field222[var62] == var59) {
							var61 = true;
							break;
						}
					}

					if (!var61 && field172 == 0) {
						method133(4, var58, "wishes to trade with you.");
					}
				} else if (var57.endsWith(":duelreq:")) {
					String var63 = var57.substring(0, var57.indexOf(":"));
					long var64 = CIRLBWBX.method37(var63);
					boolean var66 = false;
					for (int var67 = 0; var67 < field211; var67++) {
						if (field222[var67] == var64) {
							var66 = true;
							break;
						}
					}

					if (!var66 && field172 == 0) {
						method133(8, var63, "wishes to duel with you.");
					}
				} else if (var57.endsWith(":chalreq:")) {
					String var68 = var57.substring(0, var57.indexOf(":"));
					long var69 = CIRLBWBX.method37(var68);
					boolean var71 = false;
					for (int var72 = 0; var72 < field211; var72++) {
						if (field222[var72] == var69) {
							var71 = true;
							break;
						}
					}

					if (!var71 && field172 == 0) {
						String var73 = var57.substring(var57.indexOf(":") + 1, var57.length() - 9);
						method133(8, var68, var73);
					}
				} else {
					method133(0, "", var57);
				}

				field378 = -1;
				return true;
			}

			if (field378 == 19) {
				int var74 = field196.method491();
				int var75 = field196.method492();
				VYAVYWNE var76 = VYAVYWNE.method395(var75);
				if (var76 != null && var76.field1281 == 0) {
					if (var74 < 0) {
						var74 = 0;
					}

					if (var74 > var76.field1217 - var76.field1236) {
						var74 = var76.field1217 - var76.field1236;
					}

					var76.field1282 = var74;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 177) {
				field476 = true;
				field173 = field196.method465();
				field174 = field196.method465();
				field175 = field196.method467();
				field176 = field196.method465();
				field177 = field196.method465();
				if (field177 >= 100) {
					field405 = field173 * 128 + 64;
					field407 = field174 * 128 + 64;
					field406 = method95(field405, field407, field359) - field175;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 187) {
				int var77 = field196.method494();
				int var78 = field196.method495();
				int var79 = field196.method467();
				VYAVYWNE var80 = VYAVYWNE.method395(var79);
				var80.field1225 = var78;
				var80.field1235 = var77;
				field378 = -1;
				return true;
			}

			if (field378 == 56) {
				int var81 = field196.method491();
				int var82 = field196.method499();
				field321[var81] = var82;

				if (field275[var81] != var82) {
					field275[var81] = var82;
					method73(var81);
					field457 = true;

					if (field294 != -1) {
						field293 = true;
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 183 || field378 == 206) {
				int var83 = field566;
				int var84 = field567;
				if (field378 == 183) {
					var84 = field196.method492();
					var83 = field196.method491();
					field247 = false;
				}

				if (field378 == 206) {
					field196.method475();

					for (int var85 = 0; var85 < 4; var85++) {
						for (int var86 = 0; var86 < 13; var86++) {
							for (int var87 = 0; var87 < 13; var87++) {
								int var88 = field196.method476(1);
								if (var88 == 1) {
									field213[var85][var86][var87] = field196.method476(26);
								} else {
									field213[var85][var86][var87] = -1;
								}
							}
						}
					}

					field196.method477();
					var83 = field196.method493();
					var84 = field196.method467();
					field247 = true;
				}

				if (field566 == var83 && field567 == var84 && field533 == 2) {
					field378 = -1;
					return true;
				}

				field566 = var83;
				field567 = var84;
				field413 = (field566 - 6) * 8;
				field414 = (field567 - 6) * 8;
				field184 = false;
				if ((field566 / 8 == 48 || field566 / 8 == 49) && field567 / 8 == 48) {
					field184 = true;
				}

				if (field566 / 8 == 48 && field567 / 8 == 148) {
					field184 = true;
				}

				field533 = 1;
				field187 = System.currentTimeMillis();
				method124(null, "Loading - please wait.");

				if (field378 == 183) {
					int var89 = 0;
					for (int var90 = (field566 - 6) / 8; var90 <= (field566 + 6) / 8; var90++) {
						for (int var91 = (field567 - 6) / 8; var91 <= (field567 + 6) / 8; var91++) {
							var89++;
						}
					}

					field231 = new byte[var89][];
					field337 = new byte[var89][];
					field341 = new int[var89];
					field342 = new int[var89];
					field343 = new int[var89];
					int var92 = 0;
					for (int var93 = (field566 - 6) / 8; var93 <= (field566 + 6) / 8; var93++) {
						for (int var94 = (field567 - 6) / 8; var94 <= (field567 + 6) / 8; var94++) {
							field341[var92] = (var93 << 8) + var94;

							if (field184 && (var94 == 49 || var94 == 149 || var94 == 147 || var93 == 50 || var93 == 49 && var94 == 47)) {
								field342[var92] = -1;
								field343[var92] = -1;
								var92++;
							} else {
								int var95 = field342[var92] = field204.method299(var93, var94, 0);
								if (var95 != -1) {
									field204.method297(3, var95);
								}

								int var96 = field343[var92] = field204.method299(var93, var94, 1);
								if (var96 != -1) {
									field204.method297(3, var96);
								}

								var92++;
							}
						}
					}
				}

				if (field378 == 206) {
					int var97 = 0;
					int[] var98 = new int[676];
					for (int var99 = 0; var99 < 4; var99++) {
						for (int var100 = 0; var100 < 13; var100++) {
							for (int var101 = 0; var101 < 13; var101++) {
								int var102 = field213[var99][var100][var101];
								if (var102 != -1) {
									int var103 = var102 >> 14 & 0x3FF;
									int var104 = var102 >> 3 & 0x7FF;
									int var105 = (var103 / 8 << 8) + var104 / 8;
									for (int var106 = 0; var106 < var97; var106++) {
										if (var98[var106] == var105) {
											var105 = -1;
											break;
										}
									}

									if (var105 != -1) {
										var98[var97++] = var105;
									}
								}
							}
						}
					}

					field231 = new byte[var97][];
					field337 = new byte[var97][];
					field341 = new int[var97];
					field342 = new int[var97];
					field343 = new int[var97];
					for (int var107 = 0; var107 < var97; var107++) {
						int var108 = field341[var107] = var98[var107];
						int var109 = var108 >> 8 & 0xFF;
						int var110 = var108 & 0xFF;
						int var111 = field342[var107] = field204.method299(var109, var110, 0);
						if (var111 != -1) {
							field204.method297(3, var111);
						}

						int var112 = field343[var107] = field204.method299(var109, var110, 1);
						if (var112 != -1) {
							field204.method297(3, var112);
						}
					}
				}

				int var113 = field413 - field415;
				int var114 = field414 - field416;
				field415 = field413;
				field416 = field414;

				for (int var115 = 0; var115 < 16384; var115++) {
					DLMOHDFX var116 = field161[var115];
					if (var116 != null) {
						for (int var117 = 0; var117 < 10; var117++) {
							var116.field635[var117] -= var113;
							var116.field636[var117] -= var114;
						}

						var116.field654 -= var113 * 128;
						var116.field655 -= var114 * 128;
					}
				}

				for (int var118 = 0; var118 < field513; var118++) {
					MTFZASIN var119 = field515[var118];
					if (var119 != null) {
						for (int var120 = 0; var120 < 10; var120++) {
							var119.field635[var120] -= var113;
							var119.field636[var120] -= var114;
						}

						var119.field654 -= var113 * 128;
						var119.field655 -= var114 * 128;
					}
				}

				field237 = true;
				byte var121 = 0;
				byte var122 = 104;
				byte var123 = 1;
				if (var113 < 0) {
					var121 = 103;
					var122 = -1;
					var123 = -1;
				}

				byte var124 = 0;
				byte var125 = 104;
				byte var126 = 1;
				if (var114 < 0) {
					var124 = 103;
					var125 = -1;
					var126 = -1;
				}

				for (int var127 = var121; var127 != var122; var127 += var123) {
					for (int var128 = var124; var128 != var125; var128 += var126) {
						int var129 = var113 + var127;
						int var130 = var114 + var128;
						for (int var131 = 0; var131 < 4; var131++) {
							if (var129 >= 0 && var130 >= 0 && var129 < 104 && var130 < 104) {
								field314[var131][var127][var128] = field314[var131][var129][var130];
							} else {
								field314[var131][var127][var128] = null;
							}
						}
					}
				}

				for (KLVJVWGL var132 = (KLVJVWGL) field524.method361(); var132 != null; var132 = (KLVJVWGL) field524.method363()) {
					var132.field909 -= var113;
					var132.field910 -= var114;
					if (var132.field909 < 0 || var132.field910 < 0 || var132.field909 >= 104 || var132.field910 >= 104) {
						var132.method334();
					}
				}

				if (field232 != 0) {
					field232 -= var113;
					field233 -= var114;
				}

				field476 = false;
				field378 = -1;
				return true;
			}

			if (field378 == 84) {
				int var133 = field196.method493();
				int var134 = field196.method485();

				if (var133 == 0xFFFF) {
					var133 = -1;
				}

				if (field473[var134] != var133) {
					method43(field473[var134]);
					field473[var134] = var133;
				}

				field457 = true;
				field248 = true;
				field378 = -1;
				return true;
			}

			if (field378 == 131) {
				int var135 = field196.method467();
				int var136 = field196.method465();
				int var137 = field196.method467();
				if (field429 && !field420 && field229 < 50) {
					field230[field229] = var135;
					field180[field229] = var136;
					field313[field229] = OWCBJDUM.field1136[var135] + var137;
					field229++;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 41) {
				int var138 = field196.method467();
				VYAVYWNE var139 = VYAVYWNE.method395(var138);
				for (int var140 = 0; var140 < var139.field1250.length; var140++) {
					var139.field1250[var140] = -1;
					var139.field1250[var140] = 0;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 83) {
				boolean var141 = field196.method484() == 1;
				int var142 = field196.method467();
				VYAVYWNE.method395(var142).field1284 = var141;
				field378 = -1;
				return true;
			}

			if (field378 == 87) {
				field154 = field196.method465();
				field457 = true;
				field378 = -1;
				return true;
			}

			if (field378 == 80) {
				field496 = field196.method483();
				field495 = field196.method483();

				while (field196.field1432 < field377) {
					int var143 = field196.method465();
					method78(field196, var143);
				}

				field378 = -1;
				return true;
			}

			if (field378 == 247) {
				int var144 = field196.method467();
				method128(var144);

				if (field363 != -1) {
					method43(field363);
					field363 = -1;
					field457 = true;
					field248 = true;
				}

				if (field311 != -1) {
					method43(field311);
					field311 = -1;
					field324 = true;
				}

				if (field209 != -1) {
					method43(field209);
					field209 = -1;
				}

				if (field345 != -1) {
					method43(field345);
					field345 = -1;
				}

				if (field424 != var144) {
					method43(field424);
					field424 = var144;
				}

				field246 = false;
				field293 = true;
				field378 = -1;
				return true;
			}

			if (field378 == 245) {
				int var145 = field196.method467();
				int var146 = field196.method493();
				int var147 = var146 >> 10 & 0x1F;
				int var148 = var146 >> 5 & 0x1F;
				int var149 = var146 & 0x1F;
				VYAVYWNE.method395(var145).field1271 = (var149 << 3) + (var147 << 19) + (var148 << 11);
				field378 = -1;
				return true;
			}

			if (field378 == 46) {
				field396 = field196.method484();
				field457 = true;
				field248 = true;
				field378 = -1;
				return true;
			}

			if (field378 == 67) {
				String var150 = field196.method472();
				int var151 = field196.method491();
				VYAVYWNE.method395(var151).field1233 = var150;

				if (field473[field396] == VYAVYWNE.method395(var151).field1213) {
					field457 = true;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 60) {
				field232 = 0;
				field378 = -1;
				return true;
			}

			if (field378 == 27) {
				int var152 = field196.method492();
				int var153 = field196.method467();
				int var154 = field196.method492();
				VYAVYWNE.method395(var152).field1246 = (var154 << 16) + var153;
				field378 = -1;
				return true;
			}

			if (field378 == 140) {
				method79(field377, field196);
				field378 = -1;
				return true;
			}

			if (field378 == 178) {
				int var155 = field196.method491();
				int var156 = field196.method493();
				VYAVYWNE.method395(var156).field1263 = 1;
				VYAVYWNE.method395(var156).field1264 = var155;
				field378 = -1;
				return true;
			}

			if (field378 == 134) {
				int var157 = field196.method493();
				VYAVYWNE.method395(var157).field1263 = 3;

				if (field149.field1076 == null) {
					VYAVYWNE.method395(var157).field1264 = (field149.field1089[11] << 5) + (field149.field1089[8] << 10) + (field149.field1089[0] << 15) + (field149.field1074[0] << 25) + (field149.field1074[4] << 20) + field149.field1089[1];
				} else {
					VYAVYWNE.method395(var157).field1264 = (int) (field149.field1076.field891 + 0x12345678L);
				}

				field378 = -1;
				return true;
			}

			if (field378 == 237 || field378 == 81 || field378 == 157 || field378 == 196 || field378 == 180 || field378 == 143 || field378 == 12 || field378 == 129 || field378 == 163 || field378 == 45 || field378 == 68) {
				method78(field196, field378);
				field378 = -1;
				return true;
			}

			if (field378 == 220) {
				field501 = false;
				field528 = 1;
				field195 = "";
				field293 = true;
				field378 = -1;
				return true;
			}

			if (field378 == 33) {
				field496 = field196.method483();
				field495 = field196.method485();
				field378 = -1;
				return true;
			}

			if (field378 == 176) {
				field501 = false;
				field528 = 2;
				field195 = "";
				field293 = true;
				field378 = -1;
				return true;
			}

			if (field378 == 100) {
				field457 = true;
				int var158 = field196.method485();
				int var159 = field196.method499();
				int var160 = field196.method465();
				field556[var158] = var159;
				field185[var158] = var160;
				field158[var158] = 1;
				for (int var161 = 0; var161 < 98; var161++) {
					if (var159 >= field529[var161]) {
						field158[var158] = var161 + 2;
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 168) {
				byte var162 = field196.method487();
				int var163 = field196.method467();
				field321[var163] = var162;

				if (field275[var163] != var162) {
					field275[var163] = var162;
					method73(var163);
					field457 = true;

					if (field294 != -1) {
						field293 = true;
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 128) {
				field457 = true;
				int var164 = field196.method467();
				VYAVYWNE var165 = VYAVYWNE.method395(var164);
				while (field196.field1432 < field377) {
					int var166 = field196.method479();
					int var167 = field196.method467();
					int var168 = field196.method465();
					if (var168 == 255) {
						var168 = field196.method470();
					}

					if (var166 >= 0 && var166 < var165.field1250.length) {
						var165.field1250[var166] = var167;
						var165.field1216[var166] = var168;
					}
				}

				field378 = -1;
				return true;
			}

			if (field378 == 106) {
				method114(field196, field377);
				field237 = false;
				field378 = -1;
				return true;
			}

			if (field378 == 37) {
				field298 = field196.method465();
				field378 = -1;
				return true;
			}

			if (field378 == 97) {
				field211 = field377 / 8;
				for (int var169 = 0; var169 < field211; var169++) {
					field222[var169] = field196.method471();
				}

				field378 = -1;
				return true;
			}

			if (field378 == 235) {
				int var170 = field196.method467();
				int var171 = field196.method493();
				method128(var171);

				if (var170 != -1) {
					method128(var170);
				}

				if (field345 != -1) {
					method43(field345);
					field345 = -1;
				}

				if (field363 != -1) {
					method43(field363);
					field363 = -1;
				}

				if (field424 != -1) {
					method43(field424);
					field424 = -1;
				}

				if (field311 != var171) {
					method43(field311);
					field311 = var171;
				}

				if (field209 != var171) {
					method43(field209);
					field209 = var170;
				}

				field528 = 0;
				field246 = false;
				field378 = -1;
				return true;
			}

			if (field378 == 148) {
				field476 = false;

				for (int var172 = 0; var172 < 5; var172++) {
					field159[var172] = false;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 146) {
				int var173 = field196.method484();
				String var174 = field196.method472();
				int var175 = field196.method484();
				if (var173 >= 1 && var173 <= 5) {
					if (var174.equalsIgnoreCase("null")) {
						var174 = null;
					}

					field357[var173 - 1] = var174;
					field358[var173 - 1] = var175 == 0;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 28) {
				int var176 = field196.method493();
				int var177 = field196.method494();
				VYAVYWNE var178 = VYAVYWNE.method395(var176);
				if (var178.field1222 != var177 || var177 == -1) {
					var178.field1222 = var177;
					var178.field1270 = 0;
					var178.field1234 = 0;
				}

				field378 = -1;
				return true;
			}

			if (field378 == 152) {
				int var179 = field196.method492();
				int var180 = field196.method493();
				int var181 = field196.method493();
				if (var179 == 0xFFFF) {
					VYAVYWNE.method395(var181).field1263 = 0;
					field378 = -1;
					return true;
				}

				HJAQAKAW var182 = HJAQAKAW.method237(var179);
				VYAVYWNE.method395(var181).field1263 = 4;
				VYAVYWNE.method395(var181).field1264 = var179;
				VYAVYWNE.method395(var181).field1238 = var182.field746;
				VYAVYWNE.method395(var181).field1239 = var182.field758;
				VYAVYWNE.method395(var181).field1237 = var182.field765 * 100 / var180;
				field378 = -1;
				return true;
			}

			if (field378 == 95) {
				field451 = field196.method465();
				field378 = -1;
				return true;
			}

			if (field378 == 114) {
				int var183 = field196.method467();
				if (var183 == 0xFFFF) {
					var183 = -1;
				}

				if (field188 != var183 && field574 && !field420 && field202 == 0) {
					field308 = var183;
					field309 = true;
					field204.method297(2, field308);
				}

				field188 = var183;
				field378 = -1;
				return true;
			}

			if (field378 == 31) {
				int var184 = field196.method467();
				int var185 = field196.method496();
				if (field574 && !field420) {
					field308 = var184;
					field309 = false;
					field204.method297(2, field308);
					field202 = var185;
				}

				field378 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field378 + "," + field377 + " - " + field485 + "," + field486);
			method123();
		} catch (IOException var190) {
			method125();
		} catch (Exception var191) {
			String var187 = "T2 - " + field378 + "," + field485 + "," + field486 + " - " + field377 + "," + (field149.field635[0] + field413) + "," + (field149.field636[0] + field414) + " - ";
			for (int var188 = 0; var188 < field377 && var188 < 50; var188++) {
				var187 = var187 + field196.field1431[var188] + ",";
			}

			signlink.reporterror(var187);
			method123();
		}

		return true;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method141() {
		field499++;
		method113(true);
		method56(true);
		method113(false);
		method56(false);
		method80();
		method168();

		if (!field476) {
			int var1 = field326;
			if (field179 / 256 > var1) {
				var1 = field179 / 256;
			}

			if (field159[4] && field356[4] + 128 > var1) {
				var1 = field356[4] + 128;
			}

			int var2 = field348 + field327 & 0x7FF;
			method94(field350, method95(field149.field654, field149.field655, field359) - 50, field351, var1, var2, var1 * 3 + 600);
		}

		int var3;
		if (field476) {
			var3 = method127();
		} else {
			var3 = method126();
		}

		int var4 = field405;
		int var5 = field406;
		int var6 = field407;
		int var7 = field408;
		int var8 = field409;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field159[var9]) {
				int var10 = (int) (Math.random() * (field156[var9] * 2 + 1) + Math.sin(field452[var9] / 100.0D * field401[var9]) * field356[var9] - field156[var9]);
				if (var9 == 0) {
					field405 += var10;
				}

				if (var9 == 1) {
					field406 += var10;
				}

				if (var9 == 2) {
					field407 += var10;
				}

				if (var9 == 3) {
					field409 = field409 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field408 += var10;
					if (field408 < 128) {
						field408 = 128;
					}

					if (field408 > 383) {
						field408 = 383;
					}
				}
			}
		}

		int var11 = VWUXWWMW.field1209;
		VYUQHOMO.field1349 = true;
		VYUQHOMO.field1352 = 0;
		VYUQHOMO.field1350 = field684 - 4;
		VYUQHOMO.field1351 = field685 - 4;
		IGZZCJOU.method243();
		field394.method541(field409, field406, field408, var3, field407, field405);
		field394.method516();
		method77();
		method171();
		method173(var11);
		method137();
		field482.method35(field676, 4, 4);
		field405 = var4;
		field406 = var5;
		field407 = var6;
		field408 = var7;
		field409 = var8;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method142(int arg0, String arg1) {
		field183 = arg0;
		field285 = arg1;
		method96();

		if (field249 == null) {
			super.method142(arg0, arg1);
		} else {
			field549.method34();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field572.method271("RuneScape is loading - please wait...", 0xFFFFFF, var4 / 2 - var5 - 26, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			IGZZCJOU.method246(0x8C1111, var6, 304, var3 / 2 - 152, 34);
			IGZZCJOU.method246(0, var6 + 1, 302, var3 / 2 - 151, 32);
			IGZZCJOU.method245(var6 + 2, 0x8C1111, var3 / 2 - 150, arg0 * 3, 30);
			IGZZCJOU.method245(var6 + 2, 0, arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, 30);
			field572.method271(arg1, 0xFFFFFF, var4 / 2 + 5 - var5, var3 / 2);
			field549.method35(field676, 202, 171);

			if (field324) {
				field324 = false;

				if (!field386) {
					field550.method35(field676, 0, 0);
					field551.method35(field676, 637, 0);
				}

				field547.method35(field676, 128, 0);
				field548.method35(field676, 202, 371);
				field552.method35(field676, 0, 265);
				field553.method35(field676, 562, 265);
				field554.method35(field676, 128, 171);
				field555.method35(field676, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.a(IIIILMTFZASIN;)V")
	public final void method143(int arg0, int arg1, int arg2, MTFZASIN arg3) {
		if (field149 != arg3 && field212 < 400) {
			String var5;
			if (arg3.field1072 == 0) {
				var5 = arg3.field1091 + method103(field149.field1082, arg3.field1082) + " (level-" + arg3.field1082 + ")";
			} else {
				var5 = arg3.field1091 + " (skill-" + arg3.field1072 + ")";
			}

			if (field197 == 1) {
				field521[field212] = "Use " + field201 + " with @whi@" + var5;
				field561[field212] = 441;
				field562[field212] = arg2;
				field559[field212] = arg1;
				field560[field212] = arg0;
				field212++;
			} else if (field214 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field357[var6] != null) {
						field521[field212] = field357[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field357[var6].equalsIgnoreCase("attack")) {
							if (arg3.field1082 > field149.field1082) {
								var7 = 2000;
							}

							if (field149.field1071 != 0 && arg3.field1071 != 0) {
								if (field149.field1071 == arg3.field1071) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field358[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field561[field212] = var7 + 940;
						}

						if (var6 == 1) {
							field561[field212] = var7 + 250;
						}

						if (var6 == 2) {
							field561[field212] = var7 + 534;
						}

						if (var6 == 3) {
							field561[field212] = var7 + 269;
						}

						if (var6 == 4) {
							field561[field212] = var7 + 576;
						}

						field562[field212] = arg2;
						field559[field212] = arg1;
						field560[field212] = arg0;
						field212++;
					}
				}
			} else if ((field216 & 0x8) == 8) {
				field521[field212] = field217 + " @whi@" + var5;
				field561[field212] = 843;
				field562[field212] = arg2;
				field559[field212] = arg1;
				field560[field212] = arg0;
				field212++;
			}

			for (int var8 = 0; var8 < field212; var8++) {
				if (field561[var8] == 765) {
					field521[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)Ljava/net/Socket;")
	public final Socket method144(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.m(B)V")
	public final void method145() {
		if (field146 == 0) {
			int var1 = field674 / 2 - 80;
			int var2 = field675 / 2 + 20;
			var2 += 20;
			if (field690 == 1 && field691 >= var1 - 75 && field691 <= var1 + 75 && field692 >= var2 - 20 && field692 <= var2 + 20) {
				field146 = 3;
				field410 = 0;
			}

			int var3 = field674 / 2 + 80;
			if (field690 == 1 && field691 >= var3 - 75 && field691 <= var3 + 75 && field692 >= var2 - 20 && field692 <= var2 + 20) {
				field448 = "";
				field449 = "Enter your username & password.";
				field146 = 2;
				field410 = 0;
			}
		} else if (field146 == 2) {
			int var4 = field675 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field690 == 1 && field692 >= var4 - 15 && field692 < var4) {
				field410 = 0;
			}

			var4 += 15;
			if (field690 == 1 && field692 >= var4 - 15 && field692 < var4) {
				field410 = 1;
			}

			var4 += 15;
			int var5 = field674 / 2 - 80;
			int var6 = field675 / 2 + 50;
			var6 += 20;
			if (field690 == 1 && field691 >= var5 - 75 && field691 <= var5 + 75 && field692 >= var6 - 20 && field692 <= var6 + 20) {
				field360 = 0;
				method121(field391, field392, false);

				if (field289) {
					return;
				}
			}

			int var7 = field674 / 2 + 80;
			if (field690 == 1 && field691 >= var7 - 75 && field691 <= var7 + 75 && field692 >= var6 - 20 && field692 <= var6 + 20) {
				field146 = 0;
				field391 = "";
				field392 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method211();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field241.length(); var10++) {
					if (var8 == field241.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field410 == 0) {
					if (var8 == 8 && field391.length() > 0) {
						field391 = field391.substring(0, field391.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field410 = 1;
					}

					if (var9) {
						field391 = field391 + (char) var8;
					}

					if (field391.length() > 12) {
						field391 = field391.substring(0, 12);
					}
				} else if (field410 == 1) {
					if (var8 == 8 && field392.length() > 0) {
						field392 = field392.substring(0, field392.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field410 = 0;
					}

					if (var9) {
						field392 = field392 + (char) var8;
					}

					if (field392.length() > 20) {
						field392 = field392.substring(0, 20);
					}
				}
			}
		} else if (field146 == 3) {
			int var11 = field674 / 2;
			int var12 = field675 / 2 + 50;
			var12 += 20;
			if (field690 == 1 && field691 >= var11 - 75 && field691 <= var11 + 75 && field692 >= var12 - 20 && field692 <= var12 + 20) {
				field146 = 0;
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

	@ObfuscatedName("client.l(Z)V")
	public final void method146() {
		for (int var1 = 0; var1 < field229; var1++) {
			if (field313[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field230[var1] != field395 || field180[var1] != field544) {
						XGRGMPUQ var3 = OWCBJDUM.method329(field180[var1], field230[var1]);
						if (System.currentTimeMillis() + var3.field1432 / 22 > field538 / 22 + field361) {
							field538 = var3.field1432;
							field361 = System.currentTimeMillis();

							if (method110(var3.field1432, var3.field1431)) {
								field395 = field230[var1];
								field544 = field180[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method130()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field313[var1] != -5) {
					field313[var1] = -5;
				} else {
					field229--;
					for (int var5 = var1; var5 < field229; var5++) {
						field230[var5] = field230[var5 + 1];
						field180[var5] = field180[var5 + 1];
						field313[var5] = field313[var5 + 1];
					}

					var1--;
				}
			} else {
				field313[var1]--;
			}
		}

		if (field202 > 0) {
			field202 -= 20;
			if (field202 < 0) {
				field202 = 0;
			}

			if (field202 == 0 && field574 && !field420) {
				field308 = field188;
				field309 = true;
				field204.method297(2, field308);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method147(String arg0) {
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

	@ObfuscatedName("client.a(LMTFZASIN;IIILXGRGMPUQ;)V")
	public final void method148(MTFZASIN arg0, int arg1, int arg2, XGRGMPUQ arg3) {
		if ((arg1 & 0x10) != 0) {
			int var5 = arg3.method467();
			int var6 = arg3.method483();
			int var7 = arg3.method484();
			int var8 = arg3.field1432;

			if (arg0.field1091 != null && arg0.field1077) {
				long var9 = CIRLBWBX.method37(arg0.field1091);
				boolean var11 = false;
				if (var6 <= 1) {
					for (int var12 = 0; var12 < field211; var12++) {
						if (field222[var12] == var9) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field172 == 0) {
					try {
						field160.field1432 = 0;
						arg3.method474(field160.field1431, var7, 0);
						field160.field1432 = 0;
						String var13 = VOWJQLLT.method366(field160, var7);
						var13 = ZTOXLNJM.method571(var13);
						arg0.field609 = var13;
						arg0.field645 = var5 >> 8;
						arg0.field657 = var5 & 0xFF;
						arg0.field610 = 150;

						if (var6 == 2 || var6 == 3) {
							method133(1, "@cr2@" + arg0.field1091, var13);
						} else if (var6 == 1) {
							method133(1, "@cr1@" + arg0.field1091, var13);
						} else {
							method133(2, arg0.field1091, var13);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field1432 = var7 + var8;
		}

		if ((arg1 & 0x20) != 0) {
			arg0.field652 = arg3.method492();
			arg0.field653 = arg3.method492();
		}

		if ((arg1 & 0x200) != 0) {
			arg0.field627 = arg3.method484();
			arg0.field629 = arg3.method465();
			arg0.field628 = arg3.method483();
			arg0.field630 = arg3.method465();
			arg0.field631 = arg3.method492() + field512;
			arg0.field632 = arg3.method467() + field512;
			arg0.field633 = arg3.method484();
			arg0.method196();
		}

		if ((arg1 & 0x2) != 0) {
			arg0.field609 = arg3.method472();
			if (arg0.field609.charAt(0) == '~') {
				arg0.field609 = arg0.field609.substring(1);
				method133(2, arg0.field1091, arg0.field609);
			} else if (field149 == arg0) {
				method133(2, arg0.field1091, arg0.field609);
			}

			arg0.field645 = 0;
			arg0.field657 = 0;
			arg0.field610 = 150;
		}

		if ((arg1 & 0x400) != 0) {
			arg0.field640 = arg3.method491();
			int var15 = arg3.method499();
			arg0.field644 = var15 >> 16;
			arg0.field643 = (var15 & 0xFFFF) + field512;
			arg0.field641 = 0;
			arg0.field642 = 0;

			if (arg0.field643 > field512) {
				arg0.field641 = -1;
			}

			if (arg0.field640 == 0xFFFF) {
				arg0.field640 = -1;
			}
		}

		if ((arg1 & 0x100) != 0) {
			int var16 = arg3.method483();
			int var17 = arg3.method483();
			arg0.method198(var17, field512, var16);
			arg0.field616 = field512 + 300;
			arg0.field617 = arg3.method465();
			arg0.field618 = arg3.method483();
		}

		if ((arg1 & 0x1) != 0) {
			arg0.field637 = arg3.method491();
			if (arg0.field637 == 0xFFFF) {
				arg0.field637 = -1;
			}
		}

		if ((arg1 & 0x8) != 0) {
			int var18 = arg3.method484();
			byte[] var19 = new byte[var18];
			XGRGMPUQ var20 = new XGRGMPUQ(var19);
			arg3.method474(var19, var18, 0);
			field520[arg2] = var20;
			arg0.method322(var20);
		}

		if ((arg1 & 0x80) != 0) {
			int var21 = arg3.method467();
			if (var21 == 0xFFFF) {
				var21 = -1;
			}

			int var22 = arg3.method465();
			if (arg0.field611 == var21 && var21 != -1) {
				int var23 = MJVHTYCA.field1044[var21].field1058;
				if (var23 == 1) {
					arg0.field612 = 0;
					arg0.field613 = 0;
					arg0.field614 = var22;
					arg0.field615 = 0;
				}

				if (var23 == 2) {
					arg0.field615 = 0;
				}
			} else if (var21 == -1 || arg0.field611 == -1 || MJVHTYCA.field1044[var21].field1052 >= MJVHTYCA.field1044[arg0.field611].field1052) {
				arg0.field611 = var21;
				arg0.field612 = 0;
				arg0.field613 = 0;
				arg0.field614 = var22;
				arg0.field615 = 0;
				arg0.field638 = arg0.field651;
			}
		}

		if ((arg1 & 0x4) != 0) {
			int var24 = arg3.method484();
			int var25 = arg3.method485();
			arg0.method198(var25, field512, var24);
			arg0.field616 = field512 + 300;
			arg0.field617 = arg3.method485();
			arg0.field618 = arg3.method483();
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method149() {
		int var1 = field168;
		int var2 = field169;
		int var3 = field170;
		int var4 = field171;
		int var5 = 0x5D5447;
		IGZZCJOU.method245(var2, var5, var1, var3, var4);
		IGZZCJOU.method245(var2 + 1, 0, var1 + 1, var3 - 2, 16);
		IGZZCJOU.method246(0, var2 + 18, var3 - 2, var1 + 1, var4 - 19);
		field572.method275(var2 + 14, var1 + 3, var5, "Choose Option");
		int var6 = field684;
		int var7 = field685;
		if (field167 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field167 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field167 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field212; var8++) {
			int var9 = (field212 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field572.method279(field521[var8], var1 + 3, var10, true, var9);
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method150(String arg0) throws IOException {
		if (field442) {
			if (field145 != null) {
				try {
					field145.close();
				} catch (Exception var4) {
				}

				field145 = null;
			}

			field145 = method144(43595);
			field145.setSoTimeout(10000);
			InputStream var2 = field145.getInputStream();
			OutputStream var3 = field145.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.z(I)V")
	public final void method151() {
		field172 = 0;
		int var1 = (field149.field654 >> 7) + field413;
		int var2 = (field149.field655 >> 7) + field414;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field172 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field172 = 1;
		}

		if (field172 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field172 = 0;
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method152() {
		for (KLVJVWGL var1 = (KLVJVWGL) field524.method361(); var1 != null; var1 = (KLVJVWGL) field524.method363()) {
			if (var1.field906 == -1) {
				var1.field914 = 0;
				method111(var1);
			} else {
				var1.method334();
			}
		}
	}

	@ObfuscatedName("client.a(LVYAVYWNE;IIIIIII)V")
	public final void method153(VYAVYWNE arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0.field1281 == 0 && arg0.field1256 != null && !arg0.field1284 && (arg3 >= arg2 && arg1 >= arg5 && arg3 <= arg0.field1228 + arg2 && arg1 <= arg0.field1236 + arg5)) {
			int var8 = arg0.field1256.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg0.field1231[var9] + arg2;
				int var11 = arg0.field1269[var9] + arg5 - arg4;
				VYAVYWNE var12 = VYAVYWNE.method395(arg0.field1256[var9]);
				var10 += var12.field1225;
				var11 += var12.field1235;
				if ((var12.field1248 >= 0 || var12.field1272 != 0) && arg3 >= var10 && arg1 >= var11 && arg3 < var12.field1228 + var10 && arg1 < var12.field1236 + var11) {
					if (var12.field1248 >= 0) {
						field450 = var12.field1248;
					} else {
						field450 = var12.field1219;
					}
				}

				if (var12.field1281 == 8 && arg3 >= var10 && arg1 >= var11 && arg3 < var12.field1228 + var10 && arg1 < var12.field1236 + var11) {
					field523 = var12.field1219;
				}

				if (var12.field1281 == 0) {
					method153(var12, arg1, var10, arg3, var12.field1282, var11, arg6);

					if (var12.field1217 > var12.field1236) {
						method118(arg1, arg3, var12.field1217, var11, var12.field1236, var12.field1228 + var10, var12, arg6);
					}
				} else {
					if (var12.field1240 == 1 && arg3 >= var10 && arg1 >= var11 && arg3 < var12.field1228 + var10 && arg1 < var12.field1236 + var11) {
						boolean var13 = false;
						if (var12.field1273 != 0) {
							var13 = method52(var12);
						}

						if (!var13) {
							field521[field212] = var12.field1252;
							field561[field212] = 214;
							field560[field212] = var12.field1219;
							field212++;
						}
					}

					if (var12.field1240 == 2 && field214 == 0 && arg3 >= var10 && arg1 >= var11 && arg3 < var12.field1228 + var10 && arg1 < var12.field1236 + var11) {
						String var14 = var12.field1224;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field521[field212] = var14 + " @gre@" + var12.field1262;
						field561[field212] = 854;
						field560[field212] = var12.field1219;
						field212++;
					}

					if (var12.field1240 == 3 && arg3 >= var10 && arg1 >= var11 && arg3 < var12.field1228 + var10 && arg1 < var12.field1236 + var11) {
						field521[field212] = "Close";

						if (arg6 == 3) {
							field561[field212] = 529;
						} else {
							field561[field212] = 821;
						}

						field560[field212] = var12.field1219;
						field212++;
					}

					if (var12.field1240 == 4 && arg3 >= var10 && arg1 >= var11 && arg3 < var12.field1228 + var10 && arg1 < var12.field1236 + var11) {
						field521[field212] = var12.field1252;
						field561[field212] = 856;
						field560[field212] = var12.field1219;
						field212++;
					}

					if (var12.field1240 == 5 && arg3 >= var10 && arg1 >= var11 && arg3 < var12.field1228 + var10 && arg1 < var12.field1236 + var11) {
						field521[field212] = var12.field1252;
						field561[field212] = 211;
						field560[field212] = var12.field1219;
						field212++;
					}

					if (var12.field1240 == 6 && !field246 && arg3 >= var10 && arg1 >= var11 && arg3 < var12.field1228 + var10 && arg1 < var12.field1236 + var11) {
						field521[field212] = var12.field1252;
						field561[field212] = 818;
						field560[field212] = var12.field1219;
						field212++;
					}

					if (var12.field1281 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1236; var16++) {
							for (int var17 = 0; var17 < var12.field1228; var17++) {
								int var18 = (var12.field1261 + 32) * var17 + var10;
								int var19 = (var12.field1283 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1247[var15];
									var19 += var12.field1220[var15];
								}

								if (arg3 >= var18 && arg1 >= var19 && arg3 < var18 + 32 && arg1 < var19 + 32) {
									field258 = var15;
									field259 = var12.field1219;

									if (var12.field1250[var15] > 0) {
										HJAQAKAW var20 = HJAQAKAW.method237(var12.field1250[var15] - 1);
										if (field197 == 1 && var12.field1230) {
											if (field199 != var12.field1219 || field198 != var15) {
												field521[field212] = "Use " + field201 + " with @lre@" + var20.field755;
												field561[field212] = 131;
												field562[field212] = var20.field740;
												field559[field212] = var15;
												field560[field212] = var12.field1219;
												field212++;
											}
										} else if (field214 != 1 || !var12.field1230) {
											if (var12.field1230) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field747 != null && var20.field747[var21] != null) {
														field521[field212] = var20.field747[var21] + " @lre@" + var20.field755;

														if (var21 == 3) {
															field561[field212] = 34;
														}

														if (var21 == 4) {
															field561[field212] = 73;
														}

														field562[field212] = var20.field740;
														field559[field212] = var15;
														field560[field212] = var12.field1219;
														field212++;
													} else if (var21 == 4) {
														field521[field212] = "Drop @lre@" + var20.field755;
														field561[field212] = 73;
														field562[field212] = var20.field740;
														field559[field212] = var15;
														field560[field212] = var12.field1219;
														field212++;
													}
												}
											}

											if (var12.field1258) {
												field521[field212] = "Use @lre@" + var20.field755;
												field561[field212] = 332;
												field562[field212] = var20.field740;
												field559[field212] = var15;
												field560[field212] = var12.field1219;
												field212++;
											}

											if (var12.field1230 && var20.field747 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field747[var22] != null) {
														field521[field212] = var20.field747[var22] + " @lre@" + var20.field755;

														if (var22 == 0) {
															field561[field212] = 477;
														}

														if (var22 == 1) {
															field561[field212] = 705;
														}

														if (var22 == 2) {
															field561[field212] = 363;
														}

														field562[field212] = var20.field740;
														field559[field212] = var15;
														field560[field212] = var12.field1219;
														field212++;
													}
												}
											}

											if (var12.field1242 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1242[var23] != null) {
														field521[field212] = var12.field1242[var23] + " @lre@" + var20.field755;

														if (var23 == 0) {
															field561[field212] = 610;
														}

														if (var23 == 1) {
															field561[field212] = 36;
														}

														if (var23 == 2) {
															field561[field212] = 38;
														}

														if (var23 == 3) {
															field561[field212] = 277;
														}

														if (var23 == 4) {
															field561[field212] = 929;
														}

														field562[field212] = var20.field740;
														field559[field212] = var15;
														field560[field212] = var12.field1219;
														field212++;
													}
												}
											}

											field521[field212] = "Examine @lre@" + var20.field755;
											field561[field212] = 1205;
											field562[field212] = var20.field740;
											field559[field212] = var15;
											field560[field212] = var12.field1219;
											field212++;
										} else if ((field216 & 0x10) == 0x10) {
											field521[field212] = field217 + " @lre@" + var20.field755;
											field561[field212] = 657;
											field562[field212] = var20.field740;
											field559[field212] = var15;
											field560[field212] = var12.field1219;
											field212++;
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

	@ObfuscatedName("client.A(I)V")
	public final void method154() {
		field480.method34();
		VWUXWWMW.field1200 = field383;
		field366.method374(0, 0);

		if (field363 != -1) {
			method83(0, 0, VYAVYWNE.method395(field363), 0);
		} else if (field473[field396] != -1) {
			method83(0, 0, VYAVYWNE.method395(field473[field396]), 0);
		}

		if (field250 && field167 == 1) {
			method149();
		}

		field480.method35(field676, 553, 205);
		field482.method34();
		VWUXWWMW.field1200 = field384;
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method155(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.B(I)V")
	public final void method156() {
		if (field147 != 0) {
			int var1 = 0;
			if (field254 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field192[var2] != null) {
					int var3 = field190[var2];
					String var4 = field191[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field362 == 0 || field362 == 1 && method186(var4))) {
						int var8 = 329 - var1 * 13;
						if (field684 > 4 && field685 - 4 > var8 - 10 && field685 - 4 <= var8 + 3) {
							int var9 = field571.method273("From:  " + var4 + field192[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field684 < var9 + 4) {
								if (field525 >= 1) {
									field521[field212] = "Report abuse @whi@" + var4;
									field561[field212] = 2726;
									field212++;
								}

								field521[field212] = "Add ignore @whi@" + var4;
								field561[field212] = 2495;
								field212++;
								field521[field212] = "Add friend @whi@" + var4;
								field561[field212] = 2678;
								field212++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field362 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method157() {
		if (field212 >= 2 || field197 != 0 || field214 != 0) {
			String var1;
			if (field197 == 1 && field212 < 2) {
				var1 = "Use " + field201 + " with...";
			} else if (field214 == 1 && field212 < 2) {
				var1 = field217 + "...";
			} else {
				var1 = field521[field212 - 1];
			}

			if (field212 > 2) {
				var1 = var1 + "@whi@ / " + (field212 - 2) + " more options";
			}

			field572.method280(var1, field512 / 1000, 0xFFFFFF, 4, 15, true);
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method158() {
		try {
			int var1 = field149.field654 + field319;
			int var2 = field149.field655 + field568;
			if (field350 - var1 < -500 || field350 - var1 > 500 || field351 - var2 < -500 || field351 - var2 > 500) {
				field350 = var1;
				field351 = var2;
			}

			if (field350 != var1) {
				field350 += (var1 - field350) / 16;
			}

			if (field351 != var2) {
				field351 += (var2 - field351) / 16;
			}

			if (field694[1] == 1) {
				field328 += (-field328 - 24) / 2;
			} else if (field694[2] == 1) {
				field328 += (24 - field328) / 2;
			} else {
				field328 /= 2;
			}

			if (field694[3] == 1) {
				field329 += (12 - field329) / 2;
			} else if (field694[4] == 1) {
				field329 += (-field329 - 12) / 2;
			} else {
				field329 /= 2;
			}

			field327 = field328 / 2 + field327 & 0x7FF;
			field326 += field329 / 2;
			if (field326 < 128) {
				field326 = 128;
			}

			if (field326 > 383) {
				field326 = 383;
			}

			int var3 = field350 >> 7;
			int var4 = field351 >> 7;
			int var5 = method95(field350, field351, field359);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field359;
						if (var9 < 3 && (field182[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field144[var9][var7][var8];
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

			if (var11 > field179) {
				field179 += (var11 - field179) / 24;
			} else if (var11 < field179) {
				field179 += (var11 - field179) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field149.field654 + "," + field149.field655 + "," + field350 + "," + field351 + "," + field566 + "," + field567 + "," + field413 + "," + field414);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.b(BI)Ljava/lang/String;")
	public final String method159(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.E(I)V")
	public final void method160() {
		field369.method454(189);

		if (field363 != -1) {
			method43(field363);
			field363 = -1;
			field457 = true;
			field246 = false;
			field248 = true;
		}

		if (field424 != -1) {
			method43(field424);
			field424 = -1;
			field293 = true;
			field246 = false;
		}

		if (field311 != -1) {
			method43(field311);
			field311 = -1;
			field324 = true;
		}

		if (field209 != -1) {
			method43(field209);
			field209 = -1;
		}

		if (field345 != -1) {
			method43(field345);
			field345 = -1;
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method161() {
		field456 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field165[var1] = -1;
			for (int var2 = 0; var2 < BLFCIBLQ.field66; var2++) {
				if (!BLFCIBLQ.field67[var2].field73 && BLFCIBLQ.field67[var2].field68 == var1 + (field527 ? 0 : 7)) {
					field165[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method162(int arg0, int arg1) {
		boolean var3 = false;
		VYAVYWNE var4 = VYAVYWNE.method395(arg0);
		for (int var5 = 0; var5 < var4.field1256.length && var4.field1256[var5] != -1; var5++) {
			VYAVYWNE var6 = VYAVYWNE.method395(var4.field1256[var5]);
			if (var6.field1281 == 1) {
				var3 |= method162(var6.field1219, arg1);
			}

			if (var6.field1281 == 6 && (var6.field1222 != -1 || var6.field1223 != -1)) {
				boolean var7 = method99(var6);
				int var8;
				if (var7) {
					var8 = var6.field1223;
				} else {
					var8 = var6.field1222;
				}

				if (var8 != -1) {
					MJVHTYCA var9 = MJVHTYCA.field1044[var8];
					var6.field1234 += arg1;
					while (var6.field1234 > var9.method319(var6.field1270)) {
						var6.field1234 -= var9.method319(var6.field1270) + 1;
						var6.field1270++;
						if (var6.field1270 >= var9.field1045) {
							var6.field1270 -= var9.field1049;
							if (var6.field1270 < 0 || var6.field1270 >= var9.field1045) {
								var6.field1270 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1281 == 6 && var6.field1246 != 0) {
				int var10 = var6.field1246 >> 16;
				int var11 = var6.field1246 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1238 = var6.field1238 + var10 & 0x7FF;
				var6.field1239 = var6.field1239 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(IIZLjava/lang/String;ILjava/lang/String;)LMJLXHQTQ;")
	public final MJLXHQTQ method163(int arg0, int arg1, String arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field565[0] != null) {
				var6 = field565[0].method252(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field276.reset();
			field276.update(var6);
			int var8 = (int) field276.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new MJLXHQTQ(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method142(arg0, "Requesting " + arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method150(arg2 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				XGRGMPUQ var16 = new XGRGMPUQ(var15);
				var16.field1432 = 3;
				int var17 = var16.method469() + 6;
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
						method142(arg0, "Loading " + arg4 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field565[0] != null) {
						field565[0].method253(var6.length, var6, arg3);
					}
				} catch (Exception var28) {
					field565[0] = null;
				}

				if (var6 != null) {
					field276.reset();
					field276.update(var6);
					int var23 = (int) field276.getValue();
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
						method142(arg0, "Game updated - please reload page");
						var25 = 10;
					} else {
						method142(arg0, var11 + " - Retrying in " + var25);
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

				field442 = !field442;
			}
		}

		return new MJLXHQTQ(var6);
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method164(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method165() {
		short var1 = 256;

		if (field317 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field317 > 768) {
					field225[var2] = method164(field227[var2], 1024 - field317, field226[var2]);
				} else if (field317 > 256) {
					field225[var2] = field227[var2];
				} else {
					field225[var2] = method164(field226[var2], 256 - field317, field227[var2]);
				}
			}
		} else if (field318 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field318 > 768) {
					field225[var3] = method164(field228[var3], 1024 - field318, field226[var3]);
				} else if (field318 > 256) {
					field225[var3] = field228[var3];
				} else {
					field225[var3] = method164(field226[var3], 256 - field318, field228[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field225[var4] = field226[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field550.field128[var5] = field438.field1145[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field430[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field205[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field225[var12];
					int var15 = field550.field128[var7];
					field550.field128[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field550.method35(field676, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field551.field128[var16] = field439.field1145[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field430[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field205[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field225[var23];
					int var26 = field551.field128[var18];
					field551.field128[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field551.method35(field676, 637, 0);
	}

	@ObfuscatedName("client.F(I)V")
	public final void method166() {
		int var1 = field173 * 128 + 64;
		int var2 = field174 * 128 + 64;
		int var3 = method95(var1, var2, field359) - field175;

		if (field405 < var1) {
			field405 += (var1 - field405) * field177 / 1000 + field176;
			if (field405 > var1) {
				field405 = var1;
			}
		}

		if (field405 > var1) {
			field405 -= (field405 - var1) * field177 / 1000 + field176;
			if (field405 < var1) {
				field405 = var1;
			}
		}

		if (field406 < var3) {
			field406 += (var3 - field406) * field177 / 1000 + field176;
			if (field406 > var3) {
				field406 = var3;
			}
		}

		if (field406 > var3) {
			field406 -= (field406 - var3) * field177 / 1000 + field176;
			if (field406 < var3) {
				field406 = var3;
			}
		}

		if (field407 < var2) {
			field407 += (var2 - field407) * field177 / 1000 + field176;
			if (field407 > var2) {
				field407 = var2;
			}
		}

		if (field407 > var2) {
			field407 -= (field407 - var2) * field177 / 1000 + field176;
			if (field407 < var2) {
				field407 = var2;
			}
		}

		field336++;
		if (field336 > 158) {
			field336 = 0;
			field369.method454(163);
			field369.method458(0x5F86D8);
		}

		int var4 = field279 * 128 + 64;
		int var5 = field280 * 128 + 64;
		int var6 = method95(var4, var5, field359) - field281;
		int var7 = var4 - field405;
		int var8 = var6 - field406;
		int var9 = var5 - field407;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field408 < var11) {
			field408 += (var11 - field408) * field283 / 1000 + field282;
			if (field408 > var11) {
				field408 = var11;
			}
		}

		if (field408 > var11) {
			field408 -= (field408 - var11) * field283 / 1000 + field282;
			if (field408 < var11) {
				field408 = var11;
			}
		}

		int var13 = var12 - field409;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field409 += field283 * var13 / 1000 + field282;
			field409 &= 0x7FF;
		}

		if (var13 < 0) {
			field409 -= -var13 * field283 / 1000 + field282;
			field409 &= 0x7FF;
		}

		int var14 = var12 - field409;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field409 = var12;
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method167(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field153; var3++) {
				if (field194[var3] == arg0) {
					field153--;
					field457 = true;

					for (int var4 = var3; var4 < field153; var4++) {
						field463[var4] = field463[var4 + 1];
						field238[var4] = field238[var4 + 1];
						field194[var4] = field194[var4 + 1];
					}

					field369.method454(54);
					field369.method461(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method168() {
		for (GCMSALIP var1 = (GCMSALIP) field260.method361(); var1 != null; var1 = (GCMSALIP) field260.method363()) {
			if (field359 != var1.field698 || var1.field703) {
				var1.method334();
			} else if (field512 >= var1.field704) {
				var1.method212(field403);

				if (var1.field703) {
					var1.method334();
				} else {
					field394.method513(var1.field699, var1.field701, 60, -1, var1.field700, var1.field698, var1, 0, false);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIBII)V")
	public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field256.method374(arg4, arg3);
		field257.method374(arg2 + arg4 - 16, arg3);
		IGZZCJOU.method245(arg4 + 16, field274, arg3, 16, arg2 - 32);
		int var6 = (arg2 - 32) * arg2 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg1 / (arg0 - arg2);
		IGZZCJOU.method245(arg4 + var7 + 16, field494, arg3, 16, var6);
		IGZZCJOU.method250(var6, arg4 + var7 + 16, field189, arg3);
		IGZZCJOU.method250(var6, arg4 + var7 + 16, field189, arg3 + 1);
		IGZZCJOU.method248(field189, arg4 + var7 + 16, 16, arg3);
		IGZZCJOU.method248(field189, arg4 + var7 + 17, 16, arg3);
		IGZZCJOU.method250(var6, arg4 + var7 + 16, field322, arg3 + 15);
		IGZZCJOU.method250(var6 - 1, arg4 + 17 + var7, field322, arg3 + 14);
		IGZZCJOU.method248(field322, arg4 + var7 + var6 + 15, 16, arg3);
		IGZZCJOU.method248(field322, arg4 + var7 + var6 + 14, 15, arg3 + 1);
	}

	@ObfuscatedName("client.G(I)V")
	public final void method170() {
		try {
			field402 = -1;
			field260.method365();
			field411.method365();
			VWUXWWMW.method379();
			method48();
			field394.method502();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field316[var1].method213();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field182[var2][var3][var4] = 0;
					}
				}
			}

			VZMNLGCR var5 = new VZMNLGCR(104, field144, field182, 104);
			int var6 = field231.length;
			field369.method454(214);

			if (!field247) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field341[var7] >> 8) * 64 - field413;
					int var9 = (field341[var7] & 0xFF) * 64 - field414;
					byte[] var10 = field231[var7];
					if (var10 != null) {
						var5.method442(field316, var8, var9, (field567 - 6) * 8, var10, (field566 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field341[var11] >> 8) * 64 - field413;
					int var13 = (field341[var11] & 0xFF) * 64 - field414;
					byte[] var14 = field231[var11];
					if (var14 == null && field567 < 800) {
						var5.method450(var12, 64, 64, var13);
					}
				}

				field369.method454(214);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field337[var15];
					if (var16 != null) {
						int var17 = (field341[var15] >> 8) * 64 - field413;
						int var18 = (field341[var15] & 0xFF) * 64 - field414;
						var5.method448(var18, field316, var17, var16, field394);
					}
				}
			}

			if (field247) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field213[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field341.length; var28++) {
									if (field341[var28] == var27 && field231[var28] != null) {
										var5.method446(var21 * 8, (var26 & 0x7) * 8, var20 * 8, field231[var28], var23, (var25 & 0x7) * 8, var24, var19, field316);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field213[0][var29][var30];
						if (var31 == -1) {
							var5.method450(var29 * 8, 8, 8, var30 * 8);
						}
					}
				}

				field369.method454(214);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field213[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field341.length; var41++) {
									if (field341[var41] == var40 && field337[var41] != null) {
										var5.method441(field337[var41], var34 * 8, field316, var33 * 8, field394, (var39 & 0x7) * 8, var36, (var38 & 0x7) * 8, var32, var37);
										break;
									}
								}
							}
						}
					}
				}
			}

			field369.method454(214);
			var5.method443(field316, field394);

			if (field482 != null) {
				field482.method34();
				VWUXWWMW.field1200 = field384;
			}

			field369.method454(214);
			int var42 = VZMNLGCR.field1371;
			if (var42 > field359) {
				var42 = field359;
			}

			if (var42 < field359 - 1) {
				int var43 = field359 - 1;
			}

			if (field420) {
				field394.method503(VZMNLGCR.field1371);
			} else {
				field394.method503(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method74(var44, var45);
				}
			}

			method152();
		} catch (Exception var58) {
		}

		BMWIVHMF.field106.method195();

		if (field679 != null) {
			field369.method454(210);
			field369.method459(1057001181);
		}

		if (field420 && signlink.cache_dat != null) {
			int var47 = field204.method303(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field204.method294(var48);
				if ((var49 & 0x79) == 0) {
					VYUQHOMO.method406(var48);
				}
			}
		}

		System.gc();
		VWUXWWMW.method380(20);
		field204.method307();
		int var50 = (field566 - 6) / 8 - 1;
		int var51 = (field566 + 6) / 8 + 1;
		int var52 = (field567 - 6) / 8 - 1;
		int var53 = (field567 + 6) / 8 + 1;
		if (field184) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field204.method299(var54, var55, 0);
					if (var56 != -1) {
						field204.method301(var56, 3);
					}

					int var57 = field204.method299(var54, var55, 1);
					if (var57 != -1) {
						field204.method301(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method171() {
		if (field203 == 2) {
			method178((field458 - field413 << 7) + field461, (field459 - field414 << 7) + field462, field460 * 2);

			if (field223 > -1 && field512 % 20 < 10) {
				field422[0].method340(field224 - 28, field223 - 12);
			}
		}
	}

	@ObfuscatedName("client.b(ZLVYAVYWNE;)Z")
	public final boolean method172(VYAVYWNE arg0) {
		int var2 = arg0.field1273;
		if (field154 == 2) {
			if (var2 == 201) {
				field293 = true;
				field528 = 0;
				field501 = true;
				field436 = "";
				field155 = 1;
				field543 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field293 = true;
				field528 = 0;
				field501 = true;
				field436 = "";
				field155 = 2;
				field543 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field381 = 250;
			return true;
		}

		if (var2 == 501) {
			field293 = true;
			field528 = 0;
			field501 = true;
			field436 = "";
			field155 = 4;
			field543 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field293 = true;
			field528 = 0;
			field501 = true;
			field436 = "";
			field155 = 5;
			field543 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field165[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = BLFCIBLQ.field66 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= BLFCIBLQ.field66) {
							var5 = 0;
						}
					}

					if (!BLFCIBLQ.field67[var5].field73 && BLFCIBLQ.field67[var5].field68 == var3 + (field527 ? 0 : 7)) {
						break;
					}
				}

				field165[var3] = var5;
				field456 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field244[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field291[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field291[var6].length) {
					var8 = 0;
				}
			}

			field244[var6] = var8;
			field456 = true;
		}

		if (var2 == 324 && !field527) {
			field527 = true;
			method161();
		}

		if (var2 == 325 && field527) {
			field527 = false;
			method161();
		}

		if (var2 == 326) {
			field369.method454(29);
			field369.method455(field527 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field369.method455(field165[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field369.method455(field244[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field534 = !field534;
		}

		if (var2 >= 601 && var2 <= 613) {
			method160();

			if (field290.length() > 0) {
				field369.method454(91);
				field369.method461(CIRLBWBX.method37(field290));
				field369.method455(var2 - 601);
				field369.method455(field534 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.c(BI)V")
	public final void method173(int arg0) {
		if (!field420) {
			for (int var2 = 0; var2 < field540.length; var2++) {
				int var3 = field540[var2];
				if (VWUXWWMW.field1208[var3] >= arg0) {
					VSJQVIFL var4 = VWUXWWMW.field1202[var3];
					int var5 = var4.field1184 * var4.field1183 - 1;
					int var6 = field403 * var4.field1183 * 2;
					byte[] var7 = var4.field1181;
					byte[] var8 = field253;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1181 = var8;
					field253 = var7;
					VWUXWWMW.method383(var3);
					field148++;
					if (field148 > 139) {
						field148 = 0;
						field369.method454(26);
						field369.method458(0x46EC34);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method174(long arg0) {
		if (arg0 != 0L) {
			if (field211 >= 100) {
				method133(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = CIRLBWBX.method41(CIRLBWBX.method38(arg0));
				for (int var4 = 0; var4 < field211; var4++) {
					if (field222[var4] == arg0) {
						method133(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field153; var5++) {
					if (field194[var5] == arg0) {
						method133(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field222[field211++] = arg0;
				field457 = true;
				field369.method454(150);
				field369.method461(arg0);
			}
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method175() {
		field492 = new VSJQVIFL(field249, "titlebox", 0);
		field493 = new VSJQVIFL(field249, "titlebutton", 0);
		field454 = new VSJQVIFL[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field454[var1] = new VSJQVIFL(field249, "runes", var1);
		}

		field438 = new PDMJJHOP(128, 265);
		field439 = new PDMJJHOP(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field438.field1145[var2] = field550.field128[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field439.field1145[var3] = field551.field128[var3];
		}

		field226 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field226[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field226[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field226[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field226[var7 + 192] = 0xFFFFFF;
		}

		field227 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field227[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field227[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field227[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field227[var11 + 192] = 0xFFFFFF;
		}

		field228 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field228[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field228[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field228[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field228[var15 + 192] = 0xFFFFFF;
		}

		field225 = new int[256];
		field425 = new int[32768];
		field426 = new int[32768];
		method122(null);
		field205 = new int[32768];
		field206 = new int[32768];
		method142(10, "Connecting to fileserver");

		if (!field386) {
			field479 = true;
			field386 = true;
			method47(this, 2);
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method176() {
		int var1 = 5;
		field536[8] = 0;
		int var2 = 0;
		while (field536[8] == 0) {
			String var3 = "Unknown problem";
			method142(20, "Connecting to web server");

			try {
				DataInputStream var4 = method150("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 347);
				XGRGMPUQ var5 = new XGRGMPUQ(new byte[40]);
				var4.readFully(var5.field1431, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field536[var6] = var5.method470();
				}

				int var7 = var5.method470();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field536[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field536[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field536[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field536[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field536[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field536[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method142(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method142(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field442 = !field442;
			}
		}
	}

	@ObfuscatedName("client.a(ILDSYLCNKR;I)V")
	public final void method177(DSYLCNKR arg0, int arg1) {
		method178(arg0.field654, arg0.field655, arg1);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method178(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = method95(arg0, arg1, field359) - arg2;
			arg0 -= field405;
			var4 -= field406;
			arg1 -= field407;
			int var5 = VYUQHOMO.field1354[field408];
			int var6 = VYUQHOMO.field1355[field408];
			int var7 = VYUQHOMO.field1354[field409];
			int var8 = VYUQHOMO.field1355[field409];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field223 = (var9 << 9) / arg1 + VWUXWWMW.field1194;
				field224 = (var11 << 9) / arg1 + VWUXWWMW.field1195;
			} else {
				field223 = -1;
				field224 = -1;
			}
		} else {
			field223 = -1;
			field224 = -1;
		}
	}

	@ObfuscatedName("client.a(IILKFUEEJVZ;II)V")
	public final void method179(int arg0, int arg1, KFUEEJVZ arg2, int arg3) {
		if (field212 < 400) {
			if (arg2.field861 != null) {
				arg2 = arg2.method262();
			}

			if (arg2 != null && arg2.field887) {
				String var5 = arg2.field877;
				if (arg2.field890 != 0) {
					var5 = var5 + method103(field149.field1082, arg2.field890) + " (level-" + arg2.field890 + ")";
				}

				if (field197 == 1) {
					field521[field212] = "Use " + field201 + " with @yel@" + var5;
					field561[field212] = 754;
					field562[field212] = arg0;
					field559[field212] = arg1;
					field560[field212] = arg3;
					field212++;
				} else if (field214 != 1) {
					if (arg2.field871 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field871[var6] != null && !arg2.field871[var6].equalsIgnoreCase("attack")) {
								field521[field212] = arg2.field871[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field561[field212] = 982;
								}

								if (var6 == 1) {
									field561[field212] = 708;
								}

								if (var6 == 2) {
									field561[field212] = 372;
								}

								if (var6 == 3) {
									field561[field212] = 168;
								}

								if (var6 == 4) {
									field561[field212] = 157;
								}

								field562[field212] = arg0;
								field559[field212] = arg1;
								field560[field212] = arg3;
								field212++;
							}
						}
					}

					if (arg2.field871 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field871[var7] != null && arg2.field871[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field890 > field149.field1082) {
									var8 = 2000;
								}

								field521[field212] = arg2.field871[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field561[field212] = var8 + 982;
								}

								if (var7 == 1) {
									field561[field212] = var8 + 708;
								}

								if (var7 == 2) {
									field561[field212] = var8 + 372;
								}

								if (var7 == 3) {
									field561[field212] = var8 + 168;
								}

								if (var7 == 4) {
									field561[field212] = var8 + 157;
								}

								field562[field212] = arg0;
								field559[field212] = arg1;
								field560[field212] = arg3;
								field212++;
							}
						}
					}

					field521[field212] = "Examine @yel@" + var5;
					field561[field212] = 1958;
					field562[field212] = arg0;
					field559[field212] = arg1;
					field560[field212] = arg3;
					field212++;
				} else if ((field216 & 0x2) == 2) {
					field521[field212] = field217 + " @yel@" + var5;
					field561[field212] = 31;
					field562[field212] = arg0;
					field559[field212] = arg1;
					field560[field212] = arg3;
					field212++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method180() {
		if (field690 == 1) {
			if (field691 >= 539 && field691 <= 573 && field692 >= 169 && field692 < 205 && field473[0] != -1) {
				field457 = true;
				field396 = 0;
				field248 = true;
			}

			if (field691 >= 569 && field691 <= 599 && field692 >= 168 && field692 < 205 && field473[1] != -1) {
				field457 = true;
				field396 = 1;
				field248 = true;
			}

			if (field691 >= 597 && field691 <= 627 && field692 >= 168 && field692 < 205 && field473[2] != -1) {
				field457 = true;
				field396 = 2;
				field248 = true;
			}

			if (field691 >= 625 && field691 <= 669 && field692 >= 168 && field692 < 203 && field473[3] != -1) {
				field457 = true;
				field396 = 3;
				field248 = true;
			}

			if (field691 >= 666 && field691 <= 696 && field692 >= 168 && field692 < 205 && field473[4] != -1) {
				field457 = true;
				field396 = 4;
				field248 = true;
			}

			if (field691 >= 694 && field691 <= 724 && field692 >= 168 && field692 < 205 && field473[5] != -1) {
				field457 = true;
				field396 = 5;
				field248 = true;
			}

			if (field691 >= 722 && field691 <= 756 && field692 >= 169 && field692 < 205 && field473[6] != -1) {
				field457 = true;
				field396 = 6;
				field248 = true;
			}

			if (field691 >= 540 && field691 <= 574 && field692 >= 466 && field692 < 502 && field473[7] != -1) {
				field457 = true;
				field396 = 7;
				field248 = true;
			}

			if (field691 >= 572 && field691 <= 602 && field692 >= 466 && field692 < 503 && field473[8] != -1) {
				field457 = true;
				field396 = 8;
				field248 = true;
			}

			if (field691 >= 599 && field691 <= 629 && field692 >= 466 && field692 < 503 && field473[9] != -1) {
				field457 = true;
				field396 = 9;
				field248 = true;
			}

			if (field691 >= 627 && field691 <= 671 && field692 >= 467 && field692 < 502 && field473[10] != -1) {
				field457 = true;
				field396 = 10;
				field248 = true;
			}

			if (field691 >= 669 && field691 <= 699 && field692 >= 466 && field692 < 503 && field473[11] != -1) {
				field457 = true;
				field396 = 11;
				field248 = true;
			}

			if (field691 >= 696 && field691 <= 726 && field692 >= 466 && field692 < 503 && field473[12] != -1) {
				field457 = true;
				field396 = 12;
				field248 = true;
			}

			if (field691 >= 724 && field691 <= 758 && field692 >= 466 && field692 < 502 && field473[13] != -1) {
				field457 = true;
				field396 = 13;
				field248 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method181() {
		if (field451 == 0 && field690 == 1) {
			int var1 = field691 - 25 - 550;
			int var2 = field692 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field327 + field218 & 0x7FF;
				int var4 = VWUXWWMW.field1198[var3];
				int var5 = VWUXWWMW.field1199[var3];
				var4 = (field332 + 256) * var4 >> 8;
				var5 = (field332 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field149.field654 + var6 >> 7;
				int var9 = field149.field655 - var7 >> 7;
				boolean var10 = method102(var9, 0, 0, 1, 0, field149.field635[0], 0, true, var8, field149.field636[0], 0);
				if (var10) {
					field369.method455(var1);
					field369.method455(var2);
					field369.method456(field327);
					field369.method455(57);
					field369.method455(field218);
					field369.method455(field332);
					field369.method455(89);
					field369.method456(field149.field654);
					field369.method456(field149.field655);
					field369.method455(field487);
					field369.method455(63);
				}
			}

			field297++;
			if (field297 > 90) {
				field297 = 0;
				field369.method454(45);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method182() {
		if (field346 || field387 || field284) {
			method71();
		} else {
			field143++;

			if (field289) {
				method64();
			} else {
				method69(false);
			}

			field267 = 0;
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg4 >= 1 && arg2 <= 102 && arg4 <= 102) {
			if (field420 && field359 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field394.method528(arg1, arg2, arg4);
			}

			if (arg3 == 1) {
				var8 = field394.method529(arg1, arg4, arg2);
			}

			if (arg3 == 2) {
				var8 = field394.method530(arg1, arg2, arg4);
			}

			if (arg3 == 3) {
				var8 = field394.method531(arg1, arg2, arg4);
			}

			if (var8 != 0) {
				int var12 = field394.method532(arg1, arg2, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field394.method519(arg4, arg1, arg2);
					BMWIVHMF var16 = BMWIVHMF.method30(var13);
					if (var16.field95) {
						field316[arg1].method218(arg2, arg4, var16.field101, var15, var14);
					}
				}

				if (arg3 == 1) {
					field394.method520(arg1, arg2, arg4);
				}

				if (arg3 == 2) {
					field394.method521(arg1, arg4, arg2);
					BMWIVHMF var17 = BMWIVHMF.method30(var13);
					if (var17.field85 + arg2 > 103 || var17.field85 + arg4 > 103 || var17.field102 + arg2 > 103 || var17.field102 + arg4 > 103) {
						return;
					}

					if (var17.field95) {
						field316[arg1].method219(arg4, var17.field102, var15, arg2, var17.field101, var17.field85);
					}
				}

				if (arg3 == 3) {
					field394.method522(arg4, arg1, arg2);
					BMWIVHMF var18 = BMWIVHMF.method30(var13);
					if (var18.field95 && var18.field91) {
						field316[arg1].method221(arg2, arg4);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field182[1][arg2][arg4] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				VZMNLGCR.method447(arg1, arg2, arg5, arg6, var19, field394, field316[arg1], arg0, field144, arg4);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(ILXGRGMPUQ;I)V")
	public final void method184(int arg0, XGRGMPUQ arg1) {
		int var3 = arg1.method476(8);
		if (var3 < field516) {
			for (int var4 = var3; var4 < field516; var4++) {
				field498[field497++] = field517[var4];
			}
		}

		if (var3 > field516) {
			signlink.reporterror(field391 + " Too many players");
			throw new RuntimeException("eek");
		}

		field516 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field517[var5];
			MTFZASIN var7 = field515[var6];
			int var8 = arg1.method476(1);
			if (var8 == 0) {
				field517[field516++] = var6;
				var7.field607 = field512;
			} else {
				int var9 = arg1.method476(2);
				if (var9 == 0) {
					field517[field516++] = var6;
					var7.field607 = field512;
					field519[field518++] = var6;
				} else if (var9 == 1) {
					field517[field516++] = var6;
					var7.field607 = field512;
					int var10 = arg1.method476(3);
					var7.method197(var10, false);
					int var11 = arg1.method476(1);
					if (var11 == 1) {
						field519[field518++] = var6;
					}
				} else if (var9 == 2) {
					field517[field516++] = var6;
					var7.field607 = field512;
					int var12 = arg1.method476(3);
					var7.method197(var12, true);
					int var13 = arg1.method476(3);
					var7.method197(var13, true);
					int var14 = arg1.method476(1);
					if (var14 == 1) {
						field519[field518++] = var6;
					}
				} else if (var9 == 3) {
					field498[field497++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.s(B)Ljava/lang/String;")
	public final String method185() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field679 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)Z")
	public final boolean method186(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field153; var2++) {
			if (arg0.equalsIgnoreCase(field463[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field149.field1091)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.d(III)V")
	public final void method187(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field192[var4] != null) {
				int var5 = field190[var4];
				int var6 = field522 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field191[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field142 == 0 || field142 == 1 && method186(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field149.field1091)) {
						if (field525 >= 1) {
							field521[field212] = "Report abuse @whi@" + var7;
							field561[field212] = 726;
							field212++;
						}

						field521[field212] = "Add ignore @whi@" + var7;
						field561[field212] = 495;
						field212++;
						field521[field212] = "Add friend @whi@" + var7;
						field561[field212] = 678;
						field212++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field147 == 0 && (var5 == 7 || field362 == 0 || field362 == 1 && method186(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field525 >= 1) {
							field521[field212] = "Report abuse @whi@" + var7;
							field561[field212] = 726;
							field212++;
						}

						field521[field212] = "Add ignore @whi@" + var7;
						field561[field212] = 495;
						field212++;
						field521[field212] = "Add friend @whi@" + var7;
						field561[field212] = 678;
						field212++;
					}

					var3++;
				}

				if (var5 == 4 && (field273 == 0 || field273 == 1 && method186(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field521[field212] = "Accept trade @whi@" + var7;
						field561[field212] = 178;
						field212++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field147 == 0 && field362 < 2) {
					var3++;
				}

				if (var5 == 8 && (field273 == 0 || field273 == 1 && method186(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field521[field212] = "Accept challenge @whi@" + var7;
						field561[field212] = 830;
						field212++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method188() {
		field386 = false;
		while (field331) {
			field386 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field492 = null;
		field493 = null;
		field454 = null;
		field225 = null;
		field226 = null;
		field227 = null;
		field228 = null;
		field425 = null;
		field426 = null;
		field205 = null;
		field206 = null;
		field438 = null;
		field439 = null;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field339[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field529[var3] = var2 / 4;
		}
	}
}
