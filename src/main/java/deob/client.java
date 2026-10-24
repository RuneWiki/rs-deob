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
public final class client extends OFXQYNOM {

	@ObfuscatedName("client.N")
	public String field47 = "";

	@ObfuscatedName("client.O")
	public int[] field48 = new int[OGPYHVGJ.field1070];

	@ObfuscatedName("client.Q")
	public volatile boolean field49 = false;

	@ObfuscatedName("client.S")
	public int[] field51 = new int[9];

	@ObfuscatedName("client.jb")
	public boolean field68 = false;

	@ObfuscatedName("client.kb")
	public int[] field69 = new int[2000];

	@ObfuscatedName("client.ob")
	public boolean field73 = false;

	@ObfuscatedName("client.xb")
	public int[][] field81 = new int[104][104];

	@ObfuscatedName("client.Ab")
	public int[] field83 = new int[5];

	@ObfuscatedName("client.Mb")
	public int field90 = 78;

	@ObfuscatedName("client.Qb")
	public PGNBHFUF field94 = PGNBHFUF.method408(1);

	@ObfuscatedName("client.Rb")
	public KWBPZBYX[] field95 = new KWBPZBYX[100];

	@ObfuscatedName("client.Yb")
	public String field101 = "";

	@ObfuscatedName("client.Zb")
	public String field102 = "";

	@ObfuscatedName("client.cc")
	public int[] field103 = new int[OGPYHVGJ.field1070];

	@ObfuscatedName("client.dc")
	public int field104 = 128;

	@ObfuscatedName("client.jc")
	public FEPBPONH field110 = new FEPBPONH();

	@ObfuscatedName("client.mc")
	public int field113 = -1;

	@ObfuscatedName("client.nc")
	public int field114 = -1;

	@ObfuscatedName("client.pc")
	public boolean field116 = false;

	@ObfuscatedName("client.rc")
	public int[] field118 = new int[50];

	@ObfuscatedName("client.sc")
	public int field119 = -1;

	@ObfuscatedName("client.tc")
	public boolean field120 = false;

	@ObfuscatedName("client.vc")
	public boolean field121 = false;

	@ObfuscatedName("client.xc")
	public boolean field123 = false;

	@ObfuscatedName("client.Gc")
	public long[] field132 = new long[100];

	@ObfuscatedName("client.Mc")
	public int[] field138 = new int[5];

	@ObfuscatedName("client.Xc")
	public String field149 = "";

	@ObfuscatedName("client.Yc")
	public String field150 = "";

	@ObfuscatedName("client.ad")
	public TTWFVYGB[] field152 = new TTWFVYGB[32];

	@ObfuscatedName("client.gd")
	public TTWFVYGB[] field158 = new TTWFVYGB[32];

	@ObfuscatedName("client.kd")
	public long[] field160 = new long[200];

	@ObfuscatedName("client.ld")
	public NPNTBMMX field161 = new NPNTBMMX();

	@ObfuscatedName("client.rd")
	public PGNBHFUF field167 = PGNBHFUF.method408(1);

	@ObfuscatedName("client.td")
	public int field168 = -1;

	@ObfuscatedName("client.ud")
	public int field169 = 0x23201B;

	@ObfuscatedName("client.Ad")
	public boolean field173 = true;

	@ObfuscatedName("client.Fd")
	public FEPBPONH field176 = new FEPBPONH();

	@ObfuscatedName("client.Hd")
	public int[] field178 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Ld")
	public int[][][] field181 = new int[4][13][13];

	@ObfuscatedName("client.Nd")
	public int field183 = 0x766654;

	@ObfuscatedName("client.Sd")
	public TTWFVYGB[] field186 = new TTWFVYGB[1000];

	@ObfuscatedName("client.Ud")
	public boolean field187 = false;

	@ObfuscatedName("client.ie")
	public boolean field201 = true;

	@ObfuscatedName("client.ne")
	public int field205 = 50;

	@ObfuscatedName("client.oe")
	public int[] field206 = new int[field205];

	@ObfuscatedName("client.pe")
	public int[] field207 = new int[field205];

	@ObfuscatedName("client.qe")
	public int[] field208 = new int[field205];

	@ObfuscatedName("client.re")
	public int[] field209 = new int[field205];

	@ObfuscatedName("client.se")
	public int[] field210 = new int[field205];

	@ObfuscatedName("client.te")
	public int[] field211 = new int[field205];

	@ObfuscatedName("client.ue")
	public int[] field212 = new int[field205];

	@ObfuscatedName("client.ve")
	public String[] field213 = new String[field205];

	@ObfuscatedName("client.Qe")
	public int[] field234 = new int[1000];

	@ObfuscatedName("client.Re")
	public int[] field235 = new int[1000];

	@ObfuscatedName("client.Se")
	public byte[] field236 = new byte[16384];

	@ObfuscatedName("client.Ue")
	public String field238 = "";

	@ObfuscatedName("client.We")
	public String[] field240 = new String[100];

	@ObfuscatedName("client.Xe")
	public int[] field241 = new int[100];

	@ObfuscatedName("client.Ze")
	public boolean field243 = false;

	@ObfuscatedName("client.af")
	public int[] field244 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.hf")
	public boolean field249 = true;

	@ObfuscatedName("client.jf")
	public FEPBPONH[][][] field250 = new FEPBPONH[4][104][104];

	@ObfuscatedName("client.kf")
	public int[] field251 = new int[200];

	@ObfuscatedName("client.lf")
	public int[] field252 = new int[5];

	@ObfuscatedName("client.of")
	public BBRQYCNY[] field254 = new BBRQYCNY[4];

	@ObfuscatedName("client.uf")
	public int[] field258 = new int[151];

	@ObfuscatedName("client.wf")
	public int field260 = 2048;

	@ObfuscatedName("client.xf")
	public int field261 = 2047;

	@ObfuscatedName("client.yf")
	public ZQANNJZE[] field262 = new ZQANNJZE[field260];

	@ObfuscatedName("client.Af")
	public int[] field264 = new int[field260];

	@ObfuscatedName("client.Cf")
	public int[] field266 = new int[field260];

	@ObfuscatedName("client.Df")
	public PGNBHFUF[] field267 = new PGNBHFUF[field260];

	@ObfuscatedName("client.Ff")
	public boolean field269 = false;

	@ObfuscatedName("client.Gf")
	public int field270 = -1;

	@ObfuscatedName("client.Hf")
	public TTWFVYGB[] field271 = new TTWFVYGB[8];

	@ObfuscatedName("client.Lf")
	public int field275 = -1;

	@ObfuscatedName("client.Nf")
	public int[] field277 = new int[4000];

	@ObfuscatedName("client.Of")
	public int[] field278 = new int[4000];

	@ObfuscatedName("client.Rf")
	public int[] field281 = new int[7];

	@ObfuscatedName("client.Uf")
	public boolean field284 = false;

	@ObfuscatedName("client.Wf")
	public boolean field286 = true;

	@ObfuscatedName("client.Xf")
	public int field287 = -1;

	@ObfuscatedName("client.Yf")
	public int[] field288 = new int[33];

	@ObfuscatedName("client.Zf")
	public PGNBHFUF field289 = PGNBHFUF.method408(1);

	@ObfuscatedName("client.bg")
	public String field291 = "";

	@ObfuscatedName("client.gg")
	public TTWFVYGB[] field295 = new TTWFVYGB[20];

	@ObfuscatedName("client.jg")
	public int field298 = -1;

	@ObfuscatedName("client.kg")
	public boolean field299 = false;

	@ObfuscatedName("client.lg")
	public int field300 = 0x332D25;

	@ObfuscatedName("client.ug")
	public int field308 = 2;

	@ObfuscatedName("client.vg")
	public KWBPZBYX[] field309 = new KWBPZBYX[13];

	@ObfuscatedName("client.xg")
	public boolean field311 = false;

	@ObfuscatedName("client.yg")
	public String field312 = "";

	@ObfuscatedName("client.Jg")
	public int[] field322 = new int[2000];

	@ObfuscatedName("client.Lg")
	public int field324 = 1;

	@ObfuscatedName("client.Ng")
	public int field326 = -1;

	@ObfuscatedName("client.Pg")
	public String field328 = "";

	@ObfuscatedName("client.Qg")
	public boolean field329 = false;

	@ObfuscatedName("client.Rg")
	public String[] field330 = new String[5];

	@ObfuscatedName("client.Sg")
	public boolean[] field331 = new boolean[5];

	@ObfuscatedName("client.Xg")
	public boolean field336 = false;

	@ObfuscatedName("client.Yg")
	public boolean field337 = false;

	@ObfuscatedName("client.Zg")
	public boolean field338 = false;

	@ObfuscatedName("client.ch")
	public boolean field340 = false;

	@ObfuscatedName("client.dh")
	public String[] field341 = new String[200];

	@ObfuscatedName("client.eh")
	public int field342 = 3;

	@ObfuscatedName("client.fh")
	public int field343 = -1;

	@ObfuscatedName("client.gh")
	public CRC32 field344 = new CRC32();

	@ObfuscatedName("client.kh")
	public TTWFVYGB[] field347 = new TTWFVYGB[32];

	@ObfuscatedName("client.nh")
	public int field350 = -1;

	@ObfuscatedName("client.ph")
	public int field352 = 1;

	@ObfuscatedName("client.qh")
	public int[] field353 = new int[5];

	@ObfuscatedName("client.uh")
	public boolean field355 = false;

	@ObfuscatedName("client.Ch")
	public int field362 = -1;

	@ObfuscatedName("client.Fh")
	public int[] field365 = new int[500];

	@ObfuscatedName("client.Gh")
	public int[] field366 = new int[500];

	@ObfuscatedName("client.Hh")
	public int[] field367 = new int[500];

	@ObfuscatedName("client.Ih")
	public int[] field368 = new int[500];

	@ObfuscatedName("client.Jh")
	public boolean field369 = false;

	@ObfuscatedName("client.Oh")
	public int[] field373 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Qh")
	public PGNBHFUF field374 = new PGNBHFUF(new byte[5000]);

	@ObfuscatedName("client.Rh")
	public GBGUDIMT[] field375 = new GBGUDIMT[16384];

	@ObfuscatedName("client.Th")
	public int[] field377 = new int[16384];

	@ObfuscatedName("client.Uh")
	public int field378 = -1;

	@ObfuscatedName("client.Wh")
	public int[][] field379 = new int[104][104];

	@ObfuscatedName("client.Xh")
	public final int[] field380 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Yh")
	public int[][] field381 = new int[104][104];

	@ObfuscatedName("client.Zh")
	public KWBPZBYX[] field382 = new KWBPZBYX[2];

	@ObfuscatedName("client.di")
	public int[] field386 = new int[OGPYHVGJ.field1070];

	@ObfuscatedName("client.ei")
	public RUMGIOMW[] field387 = new RUMGIOMW[5];

	@ObfuscatedName("client.fi")
	public int[] field388 = new int[151];

	@ObfuscatedName("client.gi")
	public TTWFVYGB[] field389 = new TTWFVYGB[100];

	@ObfuscatedName("client.hi")
	public int[] field390 = new int[33];

	@ObfuscatedName("client.ii")
	public FEPBPONH field391 = new FEPBPONH();

	@ObfuscatedName("client.ji")
	public int field392 = -1;

	@ObfuscatedName("client.ki")
	public final int field393 = 100;

	@ObfuscatedName("client.li")
	public int[] field394 = new int[100];

	@ObfuscatedName("client.Fi")
	public int[] field412 = new int[50];

	@ObfuscatedName("client.Ki")
	public int field414 = 2;

	@ObfuscatedName("client.Li")
	public boolean field415 = true;

	@ObfuscatedName("client.Oi")
	public String field418 = "";

	@ObfuscatedName("client.Qi")
	public int field419 = 0x4D4233;

	@ObfuscatedName("client.Si")
	public int[] field421 = new int[50];

	@ObfuscatedName("client.Vi")
	public boolean field424 = false;

	@ObfuscatedName("client.Yi")
	public int[] field427 = new int[256];

	@ObfuscatedName("client.bj")
	public String[] field429 = new String[500];

	@ObfuscatedName("client.hj")
	public int[] field435 = new int[100];

	@ObfuscatedName("client.ij")
	public String[] field436 = new String[100];

	@ObfuscatedName("client.jj")
	public String[] field437 = new String[100];

	@ObfuscatedName("client.mj")
	public volatile boolean field440 = false;

	@ObfuscatedName("client.tj")
	public boolean field445 = false;

	@ObfuscatedName("client.wj")
	public int[] field447 = new int[1000];

	@ObfuscatedName("client.Cj")
	public int field453 = 2;

	@ObfuscatedName("client.Gj")
	public boolean field457 = false;

	@ObfuscatedName("client.Kj")
	public int field460 = -1;

	@ObfuscatedName("client.Lj")
	public volatile boolean field461 = false;

	@ObfuscatedName("client.Mj")
	public boolean[] field462 = new boolean[5];

	@ObfuscatedName("client.Oj")
	public int[] field464 = new int[5];

	@ObfuscatedName("client.nk")
	public int field488 = -1;

	@ObfuscatedName("client.R")
	public static BigInteger field50 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ib")
	public static int[] field88 = new int[99];

	@ObfuscatedName("client.Ub")
	public static int field97 = 10;

	@ObfuscatedName("client.Wb")
	public static boolean field99 = true;

	@ObfuscatedName("client.Hc")
	public static BigInteger field133 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.hd")
	public static String field159 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Qd")
	public static int[] field184 = new int[32];

	@ObfuscatedName("client.Og")
	public static final int[][] field327 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Jj")
	public static final int[] field459 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.ec")
	public int field105;

	@ObfuscatedName("client.fc")
	public int field106;

	@ObfuscatedName("client.gc")
	public int field107;

	@ObfuscatedName("client.hc")
	public int field108;

	@ObfuscatedName("client.wc")
	public int field122;

	@ObfuscatedName("client.yc")
	public int field124;

	@ObfuscatedName("client.zc")
	public int field125;

	@ObfuscatedName("client.Ac")
	public int field126;

	@ObfuscatedName("client.Bc")
	public int field127;

	@ObfuscatedName("client.Cc")
	public int field128;

	@ObfuscatedName("client.Dc")
	public int field129;

	@ObfuscatedName("client.Ec")
	public static int field130;

	@ObfuscatedName("client.Fc")
	public int field131;

	@ObfuscatedName("client.Wc")
	public int field148;

	@ObfuscatedName("client.Zc")
	public static int field151;

	@ObfuscatedName("client.bd")
	public int field153;

	@ObfuscatedName("client.cd")
	public int field154;

	@ObfuscatedName("client.dd")
	public int field155;

	@ObfuscatedName("client.ed")
	public int field156;

	@ObfuscatedName("client.fd")
	public int field157;

	@ObfuscatedName("client.od")
	public int field164;

	@ObfuscatedName("client.pd")
	public int field165;

	@ObfuscatedName("client.qd")
	public int field166;

	@ObfuscatedName("client.Cd")
	public int field175;

	@ObfuscatedName("client.Md")
	public int field182;

	@ObfuscatedName("client.Rd")
	public static int field185;

	@ObfuscatedName("client.ae")
	public static int field193;

	@ObfuscatedName("client.be")
	public int field194;

	@ObfuscatedName("client.ce")
	public int field195;

	@ObfuscatedName("client.de")
	public int field196;

	@ObfuscatedName("client.ee")
	public static int field197;

	@ObfuscatedName("client.ge")
	public int field199;

	@ObfuscatedName("client.he")
	public int field200;

	@ObfuscatedName("client.le")
	public static int field203;

	@ObfuscatedName("client.me")
	public int field204;

	@ObfuscatedName("client.Ie")
	public int field226;

	@ObfuscatedName("client.Je")
	public int field227;

	@ObfuscatedName("client.Ke")
	public int field228;

	@ObfuscatedName("client.Le")
	public int field229;

	@ObfuscatedName("client.Me")
	public int field230;

	@ObfuscatedName("client.Ne")
	public static int field231;

	@ObfuscatedName("client.Oe")
	public int field232;

	@ObfuscatedName("client.Pe")
	public int field233;

	@ObfuscatedName("client.Te")
	public int field237;

	@ObfuscatedName("client.Ve")
	public int field239;

	@ObfuscatedName("client.Ye")
	public int field242;

	@ObfuscatedName("client.cf")
	public int field245;

	@ObfuscatedName("client.df")
	public int field246;

	@ObfuscatedName("client.ef")
	public int field247;

	@ObfuscatedName("client.ff")
	public int field248;

	@ObfuscatedName("client.mf")
	public int field253;

	@ObfuscatedName("client.vf")
	public int field259;

	@ObfuscatedName("client.zf")
	public int field263;

	@ObfuscatedName("client.Bf")
	public int field265;

	@ObfuscatedName("client.If")
	public int field272;

	@ObfuscatedName("client.Jf")
	public int field273;

	@ObfuscatedName("client.Kf")
	public int field274;

	@ObfuscatedName("client.Mf")
	public int field276;

	@ObfuscatedName("client.Pf")
	public int field279;

	@ObfuscatedName("client.Qf")
	public int field280;

	@ObfuscatedName("client.Sf")
	public int field282;

	@ObfuscatedName("client.Tf")
	public int field283;

	@ObfuscatedName("client.Vf")
	public int field285;

	@ObfuscatedName("client.ag")
	public static int field290;

	@ObfuscatedName("client.cg")
	public int field292;

	@ObfuscatedName("client.dg")
	public int field293;

	@ObfuscatedName("client.eg")
	public static int field294;

	@ObfuscatedName("client.mg")
	public int field301;

	@ObfuscatedName("client.ng")
	public static int field302;

	@ObfuscatedName("client.tg")
	public int field307;

	@ObfuscatedName("client.wg")
	public int field310;

	@ObfuscatedName("client.zg")
	public static int field313;

	@ObfuscatedName("client.Bg")
	public static int field315;

	@ObfuscatedName("client.Cg")
	public int field316;

	@ObfuscatedName("client.Dg")
	public int field317;

	@ObfuscatedName("client.Eg")
	public int field318;

	@ObfuscatedName("client.Fg")
	public int field319;

	@ObfuscatedName("client.Gg")
	public int field320;

	@ObfuscatedName("client.Hg")
	public int field321;

	@ObfuscatedName("client.Kg")
	public int field323;

	@ObfuscatedName("client.Mg")
	public int field325;

	@ObfuscatedName("client.Tg")
	public int field332;

	@ObfuscatedName("client.Ug")
	public int field333;

	@ObfuscatedName("client.Vg")
	public int field334;

	@ObfuscatedName("client.Wg")
	public int field335;

	@ObfuscatedName("client.bh")
	public int field339;

	@ObfuscatedName("client.hh")
	public int field345;

	@ObfuscatedName("client.jh")
	public int field346;

	@ObfuscatedName("client.oh")
	public int field351;

	@ObfuscatedName("client.rh")
	public int field354;

	@ObfuscatedName("client.wh")
	public int field356;

	@ObfuscatedName("client.xh")
	public int field357;

	@ObfuscatedName("client.yh")
	public int field358;

	@ObfuscatedName("client.zh")
	public int field359;

	@ObfuscatedName("client.Ah")
	public int field360;

	@ObfuscatedName("client.Bh")
	public int field361;

	@ObfuscatedName("client.Nh")
	public int field372;

	@ObfuscatedName("client.Sh")
	public int field376;

	@ObfuscatedName("client.ni")
	public int field395;

	@ObfuscatedName("client.oi")
	public int field396;

	@ObfuscatedName("client.pi")
	public int field397;

	@ObfuscatedName("client.qi")
	public int field398;

	@ObfuscatedName("client.ri")
	public int field399;

	@ObfuscatedName("client.si")
	public int field400;

	@ObfuscatedName("client.ti")
	public int field401;

	@ObfuscatedName("client.vi")
	public int field403;

	@ObfuscatedName("client.wi")
	public int field404;

	@ObfuscatedName("client.xi")
	public int field405;

	@ObfuscatedName("client.Ji")
	public int field413;

	@ObfuscatedName("client.Ni")
	public int field417;

	@ObfuscatedName("client.Ti")
	public static int field422;

	@ObfuscatedName("client.Ui")
	public static int field423;

	@ObfuscatedName("client.Wi")
	public static int field425;

	@ObfuscatedName("client.Zi")
	public int field428;

	@ObfuscatedName("client.cj")
	public int field430;

	@ObfuscatedName("client.dj")
	public int field431;

	@ObfuscatedName("client.ej")
	public int field432;

	@ObfuscatedName("client.fj")
	public int field433;

	@ObfuscatedName("client.gj")
	public int field434;

	@ObfuscatedName("client.K")
	public static int field44;

	@ObfuscatedName("client.oj")
	public int field441;

	@ObfuscatedName("client.vj")
	public int field446;

	@ObfuscatedName("client.xj")
	public int field448;

	@ObfuscatedName("client.yj")
	public int field449;

	@ObfuscatedName("client.L")
	public int field45;

	@ObfuscatedName("client.zj")
	public int field450;

	@ObfuscatedName("client.Aj")
	public int field451;

	@ObfuscatedName("client.Bj")
	public int field452;

	@ObfuscatedName("client.Dj")
	public int field454;

	@ObfuscatedName("client.Ej")
	public int field455;

	@ObfuscatedName("client.Fj")
	public static int field456;

	@ObfuscatedName("client.M")
	public int field46;

	@ObfuscatedName("client.Pj")
	public int field465;

	@ObfuscatedName("client.Qj")
	public int field466;

	@ObfuscatedName("client.Rj")
	public int field467;

	@ObfuscatedName("client.Sj")
	public int field468;

	@ObfuscatedName("client.Uj")
	public int field469;

	@ObfuscatedName("client.Vj")
	public int field470;

	@ObfuscatedName("client.Wj")
	public int field471;

	@ObfuscatedName("client.Xj")
	public int field472;

	@ObfuscatedName("client.ck")
	public int field477;

	@ObfuscatedName("client.dk")
	public int field478;

	@ObfuscatedName("client.ek")
	public int field479;

	@ObfuscatedName("client.fk")
	public int field480;

	@ObfuscatedName("client.gk")
	public int field481;

	@ObfuscatedName("client.ik")
	public int field483;

	@ObfuscatedName("client.jk")
	public int field484;

	@ObfuscatedName("client.kk")
	public int field485;

	@ObfuscatedName("client.lk")
	public int field486;

	@ObfuscatedName("client.mk")
	public int field487;

	@ObfuscatedName("client.Y")
	public int field57;

	@ObfuscatedName("client.Z")
	public int field58;

	@ObfuscatedName("client.fb")
	public int field64;

	@ObfuscatedName("client.gb")
	public int field65;

	@ObfuscatedName("client.hb")
	public int field66;

	@ObfuscatedName("client.ib")
	public int field67;

	@ObfuscatedName("client.lb")
	public int field70;

	@ObfuscatedName("client.mb")
	public static int field71;

	@ObfuscatedName("client.pb")
	public int field74;

	@ObfuscatedName("client.rb")
	public int field75;

	@ObfuscatedName("client.sb")
	public int field76;

	@ObfuscatedName("client.tb")
	public int field77;

	@ObfuscatedName("client.ub")
	public int field78;

	@ObfuscatedName("client.vb")
	public int field79;

	@ObfuscatedName("client.wb")
	public int field80;

	@ObfuscatedName("client.Db")
	public int field85;

	@ObfuscatedName("client.Eb")
	public int field86;

	@ObfuscatedName("client.Lb")
	public static int field89;

	@ObfuscatedName("client.Nb")
	public int field91;

	@ObfuscatedName("client.Ob")
	public int field92;

	@ObfuscatedName("client.Pb")
	public int field93;

	@ObfuscatedName("client.Vb")
	public static int field98;

	@ObfuscatedName("client.Bd")
	public long field174;

	@ObfuscatedName("client.fe")
	public long field198;

	@ObfuscatedName("client.Ri")
	public long field420;

	@ObfuscatedName("client.nb")
	public long field72;

	@ObfuscatedName("client.Cb")
	public long field84;

	@ObfuscatedName("client.ic")
	public BDQVRRZB field109;

	@ObfuscatedName("client.Tb")
	public DGAWSPEW field96;

	@ObfuscatedName("client.J")
	public HHMTQDYM field43;

	@ObfuscatedName("client.ke")
	public KFVPSSJH field202;

	@ObfuscatedName("client.Jd")
	public KWBPZBYX field179;

	@ObfuscatedName("client.Kd")
	public KWBPZBYX field180;

	@ObfuscatedName("client.Vd")
	public KWBPZBYX field188;

	@ObfuscatedName("client.Wd")
	public KWBPZBYX field189;

	@ObfuscatedName("client.Xd")
	public KWBPZBYX field190;

	@ObfuscatedName("client.Yd")
	public KWBPZBYX field191;

	@ObfuscatedName("client.Zd")
	public KWBPZBYX field192;

	@ObfuscatedName("client.we")
	public KWBPZBYX field214;

	@ObfuscatedName("client.xe")
	public KWBPZBYX field215;

	@ObfuscatedName("client.ye")
	public KWBPZBYX field216;

	@ObfuscatedName("client.yi")
	public KWBPZBYX field406;

	@ObfuscatedName("client.zi")
	public KWBPZBYX field407;

	@ObfuscatedName("client.qj")
	public KWBPZBYX field442;

	@ObfuscatedName("client.rj")
	public KWBPZBYX field443;

	@ObfuscatedName("client.sj")
	public KWBPZBYX field444;

	@ObfuscatedName("client.ab")
	public KWBPZBYX field59;

	@ObfuscatedName("client.bb")
	public KWBPZBYX field60;

	@ObfuscatedName("client.cb")
	public KWBPZBYX field61;

	@ObfuscatedName("client.db")
	public KWBPZBYX field62;

	@ObfuscatedName("client.eb")
	public KWBPZBYX field63;

	@ObfuscatedName("client.Nc")
	public MVSFNVJP field139;

	@ObfuscatedName("client.Oc")
	public MVSFNVJP field140;

	@ObfuscatedName("client.Pc")
	public MVSFNVJP field141;

	@ObfuscatedName("client.Qc")
	public MVSFNVJP field142;

	@ObfuscatedName("client.Rc")
	public MVSFNVJP field143;

	@ObfuscatedName("client.Sc")
	public MVSFNVJP field144;

	@ObfuscatedName("client.Tc")
	public MVSFNVJP field145;

	@ObfuscatedName("client.Uc")
	public MVSFNVJP field146;

	@ObfuscatedName("client.Vc")
	public MVSFNVJP field147;

	@ObfuscatedName("client.ze")
	public MVSFNVJP field217;

	@ObfuscatedName("client.Ae")
	public MVSFNVJP field218;

	@ObfuscatedName("client.Be")
	public MVSFNVJP field219;

	@ObfuscatedName("client.Ce")
	public MVSFNVJP field220;

	@ObfuscatedName("client.De")
	public MVSFNVJP field221;

	@ObfuscatedName("client.Ee")
	public MVSFNVJP field222;

	@ObfuscatedName("client.Fe")
	public MVSFNVJP field223;

	@ObfuscatedName("client.Ge")
	public MVSFNVJP field224;

	@ObfuscatedName("client.He")
	public MVSFNVJP field225;

	@ObfuscatedName("client.pg")
	public MVSFNVJP field303;

	@ObfuscatedName("client.qg")
	public MVSFNVJP field304;

	@ObfuscatedName("client.rg")
	public MVSFNVJP field305;

	@ObfuscatedName("client.sg")
	public MVSFNVJP field306;

	@ObfuscatedName("client.ai")
	public MVSFNVJP field383;

	@ObfuscatedName("client.bi")
	public MVSFNVJP field384;

	@ObfuscatedName("client.ci")
	public MVSFNVJP field385;

	@ObfuscatedName("client.yb")
	public QDHHNYHL field82;

	@ObfuscatedName("client.qc")
	public TTWFVYGB field117;

	@ObfuscatedName("client.yd")
	public TTWFVYGB field171;

	@ObfuscatedName("client.zd")
	public TTWFVYGB field172;

	@ObfuscatedName("client.Dh")
	public TTWFVYGB field363;

	@ObfuscatedName("client.Eh")
	public TTWFVYGB field364;

	@ObfuscatedName("client.Lh")
	public TTWFVYGB field370;

	@ObfuscatedName("client.Mh")
	public TTWFVYGB field371;

	@ObfuscatedName("client.kj")
	public TTWFVYGB field438;

	@ObfuscatedName("client.lj")
	public TTWFVYGB field439;

	@ObfuscatedName("client.T")
	public TTWFVYGB field52;

	@ObfuscatedName("client.U")
	public TTWFVYGB field53;

	@ObfuscatedName("client.V")
	public TTWFVYGB field54;

	@ObfuscatedName("client.W")
	public TTWFVYGB field55;

	@ObfuscatedName("client.X")
	public TTWFVYGB field56;

	@ObfuscatedName("client.Fb")
	public TTWFVYGB field87;

	@ObfuscatedName("client.Ic")
	public XUAWPLCH field134;

	@ObfuscatedName("client.Jc")
	public XUAWPLCH field135;

	@ObfuscatedName("client.Kc")
	public XUAWPLCH field136;

	@ObfuscatedName("client.Lc")
	public XUAWPLCH field137;

	@ObfuscatedName("client.md")
	public YMDQNWFI field162;

	@ObfuscatedName("client.xd")
	public static ZQANNJZE field170;

	@ObfuscatedName("client.Ef")
	public String field268;

	@ObfuscatedName("client.mh")
	public String field349;

	@ObfuscatedName("client.ui")
	public String field402;

	@ObfuscatedName("client.hk")
	public String field482;

	@ObfuscatedName("client.Mi")
	public Socket field416;

	@ObfuscatedName("client.Xb")
	public static boolean field100;

	@ObfuscatedName("client.Gd")
	public static boolean field177;

	@ObfuscatedName("client.lh")
	public static boolean field348;

	@ObfuscatedName("client.Ij")
	public static boolean field458;

	@ObfuscatedName("client.kc")
	public int[] field111;

	@ObfuscatedName("client.lc")
	public int[] field112;

	@ObfuscatedName("client.pf")
	public int[] field255;

	@ObfuscatedName("client.qf")
	public int[] field256;

	@ObfuscatedName("client.rf")
	public int[] field257;

	@ObfuscatedName("client.hg")
	public int[] field296;

	@ObfuscatedName("client.ig")
	public int[] field297;

	@ObfuscatedName("client.Bi")
	public int[] field408;

	@ObfuscatedName("client.Ci")
	public int[] field409;

	@ObfuscatedName("client.Di")
	public int[] field410;

	@ObfuscatedName("client.Ei")
	public int[] field411;

	@ObfuscatedName("client.Yj")
	public int[] field473;

	@ObfuscatedName("client.Zj")
	public int[] field474;

	@ObfuscatedName("client.ak")
	public int[] field475;

	@ObfuscatedName("client.bk")
	public int[] field476;

	@ObfuscatedName("client.Ag")
	public KWBPZBYX[] field314;

	@ObfuscatedName("client.oc")
	public byte[][] field115;

	@ObfuscatedName("client.nd")
	public byte[][] field163;

	@ObfuscatedName("client.Nj")
	public byte[][][] field463;

	@ObfuscatedName("client.Xi")
	public int[][][] field426;

	@ObfuscatedName("client.b(B)V")
	public final void method63() {
		for (QJBDGANU var1 = (QJBDGANU) field391.method269(); var1 != null; var1 = (QJBDGANU) field391.method271()) {
			if (field148 != var1.field1198 || field456 > var1.field1191) {
				var1.method221();
			} else if (field456 >= var1.field1190) {
				if (var1.field1189 > 0) {
					GBGUDIMT var2 = field375[var1.field1189 - 1];
					if (var2 != null && var2.field628 >= 0 && var2.field628 < 13312 && var2.field629 >= 0 && var2.field629 < 13312) {
						var1.method490(field456, var2.field629, method91(var1.field1198, var2.field628, var2.field629) - var1.field1185, var2.field628);
					}
				}

				if (var1.field1189 < 0) {
					int var3 = -var1.field1189 - 1;
					ZQANNJZE var4;
					if (field378 == var3) {
						var4 = field170;
					} else {
						var4 = field262[var3];
					}

					if (var4 != null && var4.field628 >= 0 && var4.field628 < 13312 && var4.field629 >= 0 && var4.field629 < 13312) {
						var1.method490(field456, var4.field629, method91(var1.field1198, var4.field628, var4.field629) - var1.field1185, var4.field628);
					}
				}

				var1.method489(field441);
				field202.method323(var1, (int) var1.field1177, 60, field148, false, (int) var1.field1176, -1, (int) var1.field1175, var1.field1196);
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method64() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field111[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field111[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field112[var10] = (field111[var10 - 1] + field111[var10 + 1] + field111[var10 - 128] + field111[var10 + 128]) / 4;
			}
		}

		field199 += 128;
		if (field199 > field296.length) {
			field199 -= field296.length;
			int var11 = (int) (Math.random() * 12.0D);
			method77(field314[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field112[var14 + 128] - field296[field199 + var14 & field296.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field111[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field427[var16] = field427[var16 + 1];
		}

		field427[var1 - 1] = (int) (Math.sin(field456 / 14.0D) * 16.0D + Math.sin(field456 / 15.0D) * 14.0D + Math.sin(field456 / 16.0D) * 12.0D);

		if (field404 > 0) {
			field404 -= 4;
		}

		if (field405 > 0) {
			field405 -= 4;
		}

		if (field404 == 0 && field405 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field404 = 1024;
			}

			if (var17 == 1) {
				field405 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(BILjava/lang/String;Ljava/lang/String;)V")
	public final void method65(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field488 != -1) {
			field268 = arg2;
			field1062 = 0;
		}

		if (field275 == -1) {
			field329 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field435[var4] = field435[var4 - 1];
			field436[var4] = field436[var4 - 1];
			field437[var4] = field437[var4 - 1];
		}

		field435[0] = arg0;
		field436[0] = arg1;
		field437[0] = arg2;
	}

	@ObfuscatedName("client.a(IILPGNBHFUF;)V")
	public final void method66(int arg0, PGNBHFUF arg1) {
		arg1.method430();
		int var3 = arg1.method431(1);
		if (var3 != 0) {
			int var4 = arg1.method431(2);
			if (var4 == 0) {
				field266[field265++] = field261;
			} else if (var4 == 1) {
				int var5 = arg1.method431(3);
				field170.method264(var5, false);
				int var6 = arg1.method431(1);
				if (var6 == 1) {
					field266[field265++] = field261;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method431(3);
				field170.method264(var7, true);
				int var8 = arg1.method431(3);
				field170.method264(var8, true);
				int var9 = arg1.method431(1);
				if (var9 == 1) {
					field266[field265++] = field261;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method431(1);
				if (var10 == 1) {
					field266[field265++] = field261;
				}

				int var11 = arg1.method431(7);
				int var12 = arg1.method431(7);
				int var13 = arg1.method431(1);
				field148 = arg1.method431(2);
				field170.method262(var13 == 1, var12, var11);
			}
		}
	}

	@ObfuscatedName("client.a(III)Z")
	public final boolean method67(int arg0, int arg1) {
		boolean var3 = false;
		NPNTBMMX var4 = NPNTBMMX.method393(arg1);
		for (int var5 = 0; var5 < var4.field978.length && var4.field978[var5] != -1; var5++) {
			NPNTBMMX var6 = NPNTBMMX.method393(var4.field978[var5]);
			if (var6.field1011 == 1) {
				var3 |= method67(arg0, var6.field1018);
			}

			if (var6.field1011 == 6 && (var6.field969 != -1 || var6.field970 != -1)) {
				boolean var7 = method119(var6);
				int var8;
				if (var7) {
					var8 = var6.field970;
				} else {
					var8 = var6.field969;
				}

				if (var8 != -1) {
					KIZBPSHZ var9 = KIZBPSHZ.field888[var8];
					var6.field1012 += arg0;
					while (var6.field1012 > var9.method364(var6.field990)) {
						var6.field1012 -= var9.method364(var6.field990) + 1;
						var6.field990++;
						if (var6.field990 >= var9.field889) {
							var6.field990 -= var9.field893;
							if (var6.field990 < 0 || var6.field990 >= var9.field889) {
								var6.field990 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1011 == 6 && var6.field982 != 0) {
				int var10 = var6.field982 >> 16;
				int var11 = var6.field982 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1027 = var6.field1027 + var10 & 0x7FF;
				var6.field1028 = var6.field1028 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method68() {
		byte[] var1 = field82.method488("title.dat", null);
		TTWFVYGB var2 = new TTWFVYGB(var1, this);
		field220.method377();
		var2.method509(0, 0);
		field221.method377();
		var2.method509(-637, 0);
		field217.method377();
		var2.method509(-128, 0);
		field218.method377();
		var2.method509(-202, -371);
		field219.method377();
		var2.method509(-202, -171);
		field222.method377();
		var2.method509(0, -265);
		field223.method377();
		var2.method509(-562, -265);
		field224.method377();
		var2.method509(-128, -171);
		field225.method377();
		var2.method509(-562, -171);
		int[] var3 = new int[var2.field1232];
		for (int var4 = 0; var4 < var2.field1233; var4++) {
			for (int var5 = 0; var5 < var2.field1232; var5++) {
				var3[var5] = var2.field1231[var2.field1232 * var4 + var2.field1232 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1232; var6++) {
				var2.field1231[var2.field1232 * var4 + var6] = var3[var6];
			}
		}

		field220.method377();
		var2.method509(382, 0);
		field221.method377();
		var2.method509(-255, 0);
		field217.method377();
		var2.method509(254, 0);
		field218.method377();
		var2.method509(180, -371);
		field219.method377();
		var2.method509(180, -171);
		field222.method377();
		var2.method509(382, -265);
		field223.method377();
		var2.method509(-180, -265);
		field224.method377();
		var2.method509(254, -171);
		field225.method377();
		var2.method509(-180, -171);
		TTWFVYGB var7 = new TTWFVYGB(field82, "logo", 0);
		field217.method377();
		var7.method511(382 - var7.field1232 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(LPGNBHFUF;ZI)V")
	public final void method69(PGNBHFUF arg0, int arg1) {
		arg0.method430();
		int var3 = arg0.method431(8);
		if (var3 < field376) {
			for (int var4 = var3; var4 < field376; var4++) {
				field447[field446++] = field377[var4];
			}
		}

		if (var3 > field376) {
			signlink.reporterror(field149 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field376 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field377[var5];
			GBGUDIMT var7 = field375[var6];
			int var8 = arg0.method431(1);
			if (var8 == 0) {
				field377[field376++] = var6;
				var7.field650 = field456;
			} else {
				int var9 = arg0.method431(2);
				if (var9 == 0) {
					field377[field376++] = var6;
					var7.field650 = field456;
					field266[field265++] = var6;
				} else if (var9 == 1) {
					field377[field376++] = var6;
					var7.field650 = field456;
					int var10 = arg0.method431(3);
					var7.method264(var10, false);
					int var11 = arg0.method431(1);
					if (var11 == 1) {
						field266[field265++] = var6;
					}
				} else if (var9 == 2) {
					field377[field376++] = var6;
					var7.field650 = field456;
					int var12 = arg0.method431(3);
					var7.method264(var12, true);
					int var13 = arg0.method431(3);
					var7.method264(var13, true);
					int var14 = arg0.method431(1);
					if (var14 == 1) {
						field266[field265++] = var6;
					}
				} else if (var9 == 3) {
					field447[field446++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method70(boolean arg0) {
		for (int var2 = 0; var2 < field376; var2++) {
			GBGUDIMT var3 = field375[field377[var2]];
			int var4 = (field377[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method263() && var3.field699.field1290 == arg0 && var3.field699.method530()) {
				int var5 = var3.field628 >> 7;
				int var6 = var3.field629 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field619 == 1 && (var3.field628 & 0x7F) == 0x40 && (var3.field629 & 0x7F) == 0x40) {
						if (field379[var5][var6] == field75) {
							continue;
						}

						field379[var5][var6] = field75;
					}

					if (!var3.field699.field1298) {
						var4 += Integer.MIN_VALUE;
					}

					field202.method323(var3, method91(field148, var3.field628, var3.field629), (var3.field619 - 1) * 64 + 60, field148, var3.field627, var3.field629, var4, var3.field628, var3.field630);
				}
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method71(int arg0, int arg1) {
		FEPBPONH var3 = field250[field148][arg0][arg1];
		if (var3 == null) {
			field202.method333(field148, arg0, arg1);
		} else {
			int var4 = -99999999;
			BINNTJRP var5 = null;
			for (BINNTJRP var6 = (BINNTJRP) var3.method269(); var6 != null; var6 = (BINNTJRP) var3.method271()) {
				IBYWZZZK var7 = IBYWZZZK.method290(var6.field20);
				int var8 = var7.field753;
				if (var7.field768) {
					var8 = (var6.field19 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method267(var5);
			BINNTJRP var9 = null;
			BINNTJRP var10 = null;
			for (BINNTJRP var11 = (BINNTJRP) var3.method269(); var11 != null; var11 = (BINNTJRP) var3.method271()) {
				if (var5.field20 != var11.field20 && var9 == null) {
					var9 = var11;
				}

				if (var5.field20 != var11.field20 && var9.field20 != var11.field20 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field202.method319(var9, var5, method91(field148, arg0 * 128 + 64, arg1 * 128 + 64), var12, arg0, arg1, var10, field148);
		}
	}

	@ObfuscatedName("client.a(IILNPNTBMMX;IIIIII)V")
	public final void method72(int arg0, int arg1, NPNTBMMX arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field121) {
			field122 = 32;
		} else {
			field122 = 0;
		}

		field121 = false;
		if (arg5 >= arg3 && arg5 < arg3 + 16 && arg0 >= arg1 && arg0 < arg1 + 16) {
			arg2.field1014 -= field246 * 4;

			if (arg4 == 1) {
				field311 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field329 = true;
			}
		} else if (arg5 >= arg3 && arg5 < arg3 + 16 && arg0 >= arg1 + arg7 - 16 && arg0 < arg1 + arg7) {
			arg2.field1014 += field246 * 4;

			if (arg4 == 1) {
				field311 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field329 = true;
			}
		} else if (arg5 >= arg3 - field122 && arg5 < arg3 + field122 + 16 && arg0 >= arg1 + 16 && arg0 < arg1 + arg7 - 16 && field246 > 0) {
			int var9 = (arg7 - 32) * arg7 / arg6;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg0 - arg1 - var9 / 2 - 16;
			int var11 = arg7 - var9 - 32;
			arg2.field1014 = (arg6 - arg7) * var10 / var11;

			if (arg4 == 1) {
				field311 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field329 = true;
			}

			field121 = true;
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method73(int arg0) {
		int[] var2 = field87.field1231;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field463[arg0][var7][var5] & 0x18) == 0) {
					field202.method347(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field463[arg0 + 1][var7][var5] & 0x8) != 0) {
					field202.method347(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field87.method506();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field463[arg0][var11][var10] & 0x18) == 0) {
					method148(var8, arg0, var10, var9, var11);
				}

				if (arg0 < 3 && (field463[arg0 + 1][var11][var10] & 0x8) != 0) {
					method148(var8, arg0 + 1, var10, var9, var11);
				}
			}
		}

		if (field305 != null) {
			field305.method377();
			DJQPOKKS.field589 = field475;
		}

		field233 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field202.method341(field148, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = CSTFGNEK.method219(var14).field496;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field254[field148].field12;
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

						field186[field233] = field389[var15];
						field234[field233] = var16;
						field235[field233] = var17;
						field233++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method74() {
		if (field432 == 0) {
			field429[0] = "Cancel";
			field367[0] = 1961;
			field332 = 1;
			if (field392 == -1) {
				method110();
				field164 = 0;
				field45 = 0;

				if (field1056 > 4 && field1057 > 4 && field1056 < 516 && field1057 < 338) {
					if (field270 == -1) {
						method104();
					} else {
						method198(4, 0, field1057, 4, NPNTBMMX.method393(field270), field1056, 0);
					}
				}

				if (field92 != field164) {
					field92 = field164;
				}

				if (field45 != field272) {
					field272 = field45;
				}

				field164 = 0;
				field45 = 0;

				if (field1056 > 553 && field1057 > 205 && field1056 < 743 && field1057 < 466) {
					if (field343 != -1) {
						method198(205, 0, field1057, 553, NPNTBMMX.method393(field343), field1056, 1);
					} else if (field373[field342] != -1) {
						method198(205, 0, field1057, 553, NPNTBMMX.method393(field373[field342]), field1056, 1);
					}
				}

				if (field70 != field164) {
					field311 = true;
					field70 = field164;
				}

				if (field45 != field245) {
					field311 = true;
					field245 = field45;
				}

				field164 = 0;
				field45 = 0;

				if (field1056 > 17 && field1057 > 357 && field1056 < 496 && field1057 < 453) {
					if (field275 != -1) {
						method198(357, 0, field1057, 17, NPNTBMMX.method393(field275), field1056, 2);
					} else if (field488 != -1) {
						method198(357, 0, field1057, 17, NPNTBMMX.method393(field488), field1056, 3);
					} else if (field1057 < 434 && field1056 < 426 && field345 == 0) {
						method161(field1057 - 357, field1056 - 17);
					}
				}

				if ((field275 != -1 || field488 != -1) && field165 != field164) {
					field329 = true;
					field165 = field164;
				}

				if ((field275 != -1 || field488 != -1) && field45 != field237) {
					field329 = true;
					field237 = field45;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field332 - 1; var2++) {
						if (field367[var2] < 1000 && field367[var2 + 1] > 1000) {
							String var3 = field429[var2];
							field429[var2] = field429[var2 + 1];
							field429[var2 + 1] = var3;
							int var4 = field367[var2];
							field367[var2] = field367[var2 + 1];
							field367[var2 + 1] = var4;
							int var5 = field365[var2];
							field365[var2] = field365[var2 + 1];
							field365[var2 + 1] = var5;
							int var6 = field366[var2];
							field366[var2] = field366[var2 + 1];
							field366[var2 + 1] = var6;
							int var7 = field368[var2];
							field368[var2] = field368[var2 + 1];
							field368[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field164 = 0;
				field45 = 0;
				method198(0, 0, field1057, 0, NPNTBMMX.method393(field392), field1056, 0);

				if (field92 != field164) {
					field92 = field164;
				}

				if (field45 != field272) {
					field272 = field45;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method75() {
		if (field403 != 0) {
			XUAWPLCH var1 = field135;
			int var2 = 0;
			if (field273 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field437[var3] != null) {
					int var4 = field435[var3];
					String var5 = field436[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field301 == 0 || field301 == 1 && method79(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method538(0, var7, var8, "From");
						var1.method538(0xFFFF, var7 - 1, var8, "From");
						int var11 = var8 + var1.method536("From ");
						if (var6 == 1) {
							field382[0].method371(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field382[1].method371(var11, var7 - 12);
							var11 += 14;
						}

						var1.method538(0, var7, var11, var5 + ": " + field437[var3]);
						var1.method538(0xFFFF, var7 - 1, var11, var5 + ": " + field437[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field301 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method538(0, var9, 4, field437[var3]);
						var1.method538(0xFFFF, var9 - 1, 4, field437[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field301 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method538(0, var10, 4, "To " + var5 + ": " + field437[var3]);
						var1.method538(0xFFFF, var10 - 1, 4, "To " + var5 + ": " + field437[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method76() {
		if (field417 == 0) {
			int var1 = field1046 / 2 - 80;
			int var2 = field1047 / 2 + 20;
			var2 += 20;
			if (field1062 == 1 && field1063 >= var1 - 75 && field1063 <= var1 + 75 && field1064 >= var2 - 20 && field1064 <= var2 + 20) {
				field417 = 3;
				field428 = 0;
			}

			int var3 = field1046 / 2 + 80;
			if (field1062 == 1 && field1063 >= var3 - 75 && field1063 <= var3 + 75 && field1064 >= var2 - 20 && field1064 <= var2 + 20) {
				field101 = "";
				field102 = "Enter your username & password.";
				field417 = 2;
				field428 = 0;
			}
		} else if (field417 == 2) {
			int var4 = field1047 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1062 == 1 && field1064 >= var4 - 15 && field1064 < var4) {
				field428 = 0;
			}

			var4 += 15;
			if (field1062 == 1 && field1064 >= var4 - 15 && field1064 < var4) {
				field428 = 1;
			}

			var4 += 15;
			int var5 = field1046 / 2 - 80;
			int var6 = field1047 / 2 + 50;
			var6 += 20;
			if (field1062 == 1 && field1063 >= var5 - 75 && field1063 <= var5 + 75 && field1064 >= var6 - 20 && field1064 <= var6 + 20) {
				field469 = 0;
				method118(field149, field150, false);

				if (field340) {
					return;
				}
			}

			int var7 = field1046 / 2 + 80;
			if (field1062 == 1 && field1063 >= var7 - 75 && field1063 <= var7 + 75 && field1064 >= var6 - 20 && field1064 <= var6 + 20) {
				field417 = 0;
				field149 = "";
				field150 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method407();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field159.length(); var10++) {
					if (var8 == field159.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field428 == 0) {
					if (var8 == 8 && field149.length() > 0) {
						field149 = field149.substring(0, field149.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field428 = 1;
					}

					if (var9) {
						field149 = field149 + (char) var8;
					}

					if (field149.length() > 12) {
						field149 = field149.substring(0, 12);
					}
				} else if (field428 == 1) {
					if (var8 == 8 && field150.length() > 0) {
						field150 = field150.substring(0, field150.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field428 = 0;
					}

					if (var9) {
						field150 = field150 + (char) var8;
					}

					if (field150.length() > 20) {
						field150 = field150.substring(0, 20);
					}
				}
			}
		} else if (field417 == 3) {
			int var11 = field1046 / 2;
			int var12 = field1047 / 2 + 50;
			var12 += 20;
			if (field1062 == 1 && field1063 >= var11 - 75 && field1063 <= var11 + 75 && field1064 >= var12 - 20 && field1064 <= var12 + 20) {
				field417 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LKWBPZBYX;I)V")
	public final void method77(KWBPZBYX arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field296.length; var3++) {
			field296[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field296[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field297[var9] = (field296[var9 - 1] + field296[var9 + 1] + field296[var9 - 128] + field296[var9 + 128]) / 4;
				}
			}

			int[] var10 = field296;
			field296 = field297;
			field297 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field907; var12++) {
				for (int var13 = 0; var13 < arg0.field906; var13++) {
					if (arg0.field904[var11++] != 0) {
						int var14 = var13 + arg0.field908 + 16;
						int var15 = var12 + arg0.field909 + 16;
						int var16 = (var15 << 7) + var14;
						field296[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILPGNBHFUF;)V")
	public final void method78(int arg0, PGNBHFUF arg1) {
		for (int var3 = 0; var3 < field265; var3++) {
			int var4 = field266[var3];
			ZQANNJZE var5 = field262[var4];
			int var6 = arg1.method420();
			if ((var6 & 0x10) != 0) {
				var6 += arg1.method420() << 8;
			}

			method193(var4, var5, arg1, var6);
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)Z")
	public final boolean method79(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field279; var2++) {
			if (arg0.equalsIgnoreCase(field341[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field170.field1463)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method80(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method81() {
		field294++;
		if (field294 > 88) {
			field294 = 0;
			field167.method409(139);
		}

		for (int var1 = 0; var1 < field376; var1++) {
			int var2 = field377[var1];
			GBGUDIMT var3 = field375[var2];
			if (var3 != null) {
				method82(var3, var3.field699.field1291);
			}
		}
	}

	@ObfuscatedName("client.a(LEGCNSKZO;IZ)V")
	public final void method82(EGCNSKZO arg0, int arg1) {
		if (arg0.field628 < 128 || arg0.field629 < 128 || arg0.field628 >= 13184 || arg0.field629 >= 13184) {
			arg0.field645 = -1;
			arg0.field622 = -1;
			arg0.field612 = 0;
			arg0.field613 = 0;
			arg0.field628 = arg0.field658[0] * 128 + arg0.field619 * 64;
			arg0.field629 = arg0.field659[0] * 128 + arg0.field619 * 64;
			arg0.method261();
		}

		if (field170 == arg0 && (arg0.field628 < 1536 || arg0.field629 < 1536 || arg0.field628 >= 11776 || arg0.field629 >= 11776)) {
			arg0.field645 = -1;
			arg0.field622 = -1;
			arg0.field612 = 0;
			arg0.field613 = 0;
			arg0.field628 = arg0.field658[0] * 128 + arg0.field619 * 64;
			arg0.field629 = arg0.field659[0] * 128 + arg0.field619 * 64;
			arg0.method261();
		}

		if (arg0.field612 > field456) {
			method83(arg0);
		} else if (arg0.field613 >= field456) {
			method84(arg0);
		} else {
			method85(arg0);
		}

		method86(arg0);
		method87(arg0);
	}

	@ObfuscatedName("client.a(ZLEGCNSKZO;)V")
	public final void method83(EGCNSKZO arg0) {
		int var2 = arg0.field612 - field456;
		int var3 = arg0.field619 * 64 + arg0.field608 * 128;
		int var4 = arg0.field619 * 64 + arg0.field610 * 128;
		arg0.field628 += (var3 - arg0.field628) / var2;
		arg0.field629 += (var4 - arg0.field629) / var2;
		arg0.field631 = 0;

		if (arg0.field614 == 0) {
			arg0.field632 = 1024;
		}

		if (arg0.field614 == 1) {
			arg0.field632 = 1536;
		}

		if (arg0.field614 == 2) {
			arg0.field632 = 0;
		}

		if (arg0.field614 == 3) {
			arg0.field632 = 512;
		}
	}

	@ObfuscatedName("client.a(LEGCNSKZO;I)V")
	public final void method84(EGCNSKZO arg0) {
		if (field456 == arg0.field613 || arg0.field645 == -1 || arg0.field648 != 0 || arg0.field647 + 1 > KIZBPSHZ.field888[arg0.field645].method364(arg0.field646)) {
			int var2 = arg0.field613 - arg0.field612;
			int var3 = field456 - arg0.field612;
			int var4 = arg0.field619 * 64 + arg0.field608 * 128;
			int var5 = arg0.field619 * 64 + arg0.field610 * 128;
			int var6 = arg0.field619 * 64 + arg0.field609 * 128;
			int var7 = arg0.field619 * 64 + arg0.field611 * 128;
			arg0.field628 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field629 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field631 = 0;

		if (arg0.field614 == 0) {
			arg0.field632 = 1024;
		}

		if (arg0.field614 == 1) {
			arg0.field632 = 1536;
		}

		if (arg0.field614 == 2) {
			arg0.field632 = 0;
		}

		if (arg0.field614 == 3) {
			arg0.field632 = 512;
		}

		arg0.field630 = arg0.field632;
	}

	@ObfuscatedName("client.b(ZLEGCNSKZO;)V")
	public final void method85(EGCNSKZO arg0) {
		arg0.field615 = arg0.field656;
		if (arg0.field621 == 0) {
			arg0.field631 = 0;
		} else {
			if (arg0.field645 != -1 && arg0.field648 == 0) {
				KIZBPSHZ var2 = KIZBPSHZ.field888[arg0.field645];
				if (arg0.field641 > 0 && var2.field900 == 0) {
					arg0.field631++;
					return;
				}

				if (arg0.field641 <= 0 && var2.field901 == 0) {
					arg0.field631++;
					return;
				}
			}

			int var3 = arg0.field628;
			int var4 = arg0.field629;
			int var5 = arg0.field658[arg0.field621 - 1] * 128 + arg0.field619 * 64;
			int var6 = arg0.field659[arg0.field621 - 1] * 128 + arg0.field619 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field632 = 1280;
					} else if (var4 > var6) {
						arg0.field632 = 1792;
					} else {
						arg0.field632 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field632 = 768;
					} else if (var4 > var6) {
						arg0.field632 = 256;
					} else {
						arg0.field632 = 512;
					}
				} else if (var4 < var6) {
					arg0.field632 = 1024;
				} else {
					arg0.field632 = 0;
				}

				int var7 = arg0.field632 - arg0.field630 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field637;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field636;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field639;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field638;
				}

				if (var8 == -1) {
					var8 = arg0.field636;
				}

				arg0.field615 = var8;
				int var9 = 4;
				if (arg0.field632 != arg0.field630 && arg0.field634 == -1 && arg0.field620 != 0) {
					var9 = 2;
				}

				if (arg0.field621 > 2) {
					var9 = 6;
				}

				if (arg0.field621 > 3) {
					var9 = 8;
				}

				if (arg0.field631 > 0 && arg0.field621 > 1) {
					var9 = 8;
					arg0.field631--;
				}

				if (arg0.field633[arg0.field621 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field636 == arg0.field615 && arg0.field651 != -1) {
					arg0.field615 = arg0.field651;
				}

				if (var3 < var5) {
					arg0.field628 += var9;
					if (arg0.field628 > var5) {
						arg0.field628 = var5;
					}
				} else if (var3 > var5) {
					arg0.field628 -= var9;
					if (arg0.field628 < var5) {
						arg0.field628 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field629 += var9;
					if (arg0.field629 > var6) {
						arg0.field629 = var6;
					}
				} else if (var4 > var6) {
					arg0.field629 -= var9;
					if (arg0.field629 < var6) {
						arg0.field629 = var6;
					}
				}

				if (arg0.field628 == var5 && arg0.field629 == var6) {
					arg0.field621--;

					if (arg0.field641 > 0) {
						arg0.field641--;
						return;
					}
				}
			} else {
				arg0.field628 = var5;
				arg0.field629 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ILEGCNSKZO;)V")
	public final void method86(EGCNSKZO arg0) {
		if (arg0.field620 != 0) {
			if (arg0.field634 != -1 && arg0.field634 < 32768) {
				GBGUDIMT var2 = field375[arg0.field634];
				if (var2 != null) {
					int var3 = arg0.field628 - var2.field628;
					int var4 = arg0.field629 - var2.field629;
					if (var3 != 0 || var4 != 0) {
						arg0.field632 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field634 >= 32768) {
				int var5 = arg0.field634 - 32768;
				if (field378 == var5) {
					var5 = field261;
				}

				ZQANNJZE var6 = field262[var5];
				if (var6 != null) {
					int var7 = arg0.field628 - var6.field628;
					int var8 = arg0.field629 - var6.field629;
					if (var7 != 0 || var8 != 0) {
						arg0.field632 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field606 != 0 || arg0.field607 != 0) && (arg0.field621 == 0 || arg0.field631 > 0)) {
				int var9 = arg0.field628 - (arg0.field606 - field465 - field465) * 64;
				int var10 = arg0.field629 - (arg0.field607 - field466 - field466) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field632 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field606 = 0;
				arg0.field607 = 0;
			}

			int var11 = arg0.field632 - arg0.field630 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field620 || var11 > 2048 - arg0.field620) {
					arg0.field630 = arg0.field632;
				} else if (var11 > 1024) {
					arg0.field630 -= arg0.field620;
				} else {
					arg0.field630 += arg0.field620;
				}

				arg0.field630 &= 0x7FF;
				if (arg0.field656 == arg0.field615 && arg0.field632 != arg0.field630) {
					if (arg0.field657 != -1) {
						arg0.field615 = arg0.field657;
						return;
					}

					arg0.field615 = arg0.field636;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LEGCNSKZO;B)V")
	public final void method87(EGCNSKZO arg0) {
		arg0.field627 = false;

		if (arg0.field615 != -1) {
			KIZBPSHZ var2 = KIZBPSHZ.field888[arg0.field615];
			arg0.field617++;
			if (arg0.field616 < var2.field889 && arg0.field617 > var2.method364(arg0.field616)) {
				arg0.field617 = 0;
				arg0.field616++;
			}

			if (arg0.field616 >= var2.field889) {
				arg0.field617 = 0;
				arg0.field616 = 0;
			}
		}

		if (arg0.field622 != -1 && field456 >= arg0.field625) {
			if (arg0.field623 < 0) {
				arg0.field623 = 0;
			}

			KIZBPSHZ var3 = BUIWQSXJ.field30[arg0.field622].field34;
			arg0.field624++;
			while (arg0.field623 < var3.field889 && arg0.field624 > var3.method364(arg0.field623)) {
				arg0.field624 -= var3.method364(arg0.field623);
				arg0.field623++;
			}

			if (arg0.field623 >= var3.field889 && (arg0.field623 < 0 || arg0.field623 >= var3.field889)) {
				arg0.field622 = -1;
			}
		}

		if (arg0.field645 != -1 && arg0.field648 <= 1) {
			KIZBPSHZ var4 = KIZBPSHZ.field888[arg0.field645];
			if (var4.field900 == 1 && arg0.field641 > 0 && arg0.field612 <= field456 && arg0.field613 < field456) {
				arg0.field648 = 1;
				return;
			}
		}

		if (arg0.field645 != -1 && arg0.field648 == 0) {
			KIZBPSHZ var5 = KIZBPSHZ.field888[arg0.field645];
			arg0.field647++;
			while (arg0.field646 < var5.field889 && arg0.field647 > var5.method364(arg0.field646)) {
				arg0.field647 -= var5.method364(arg0.field646);
				arg0.field646++;
			}

			if (arg0.field646 >= var5.field889) {
				arg0.field646 -= var5.field893;
				arg0.field649++;
				if (arg0.field649 >= var5.field899) {
					arg0.field645 = -1;
				}

				if (arg0.field646 < 0 || arg0.field646 >= var5.field889) {
					arg0.field645 = -1;
				}
			}

			arg0.field627 = var5.field895;
		}

		if (arg0.field648 > 0) {
			arg0.field648--;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method88() {
		if (field392 == -1 || field259 != 2 && field1049 == null) {
			if (field284) {
				method114();
				field284 = false;
				field139.method378(0, 4, field1048);
				field140.method378(0, 357, field1048);
				field141.method378(722, 4, field1048);
				field142.method378(743, 205, field1048);
				field143.method378(0, 0, field1048);
				field144.method378(516, 4, field1048);
				field145.method378(516, 205, field1048);
				field146.method378(496, 357, field1048);
				field147.method378(0, 338, field1048);
				field311 = true;
				field329 = true;
				field355 = true;
				field338 = true;

				if (field259 != 2) {
					field305.method378(4, 4, field1048);
					field304.method378(550, 4, field1048);
				}

				field290++;
				if (field290 > 1212) {
					field290 = 0;
					field167.method409(186);
					field167.method410(0);
					int var3 = field167.field1082;
					field167.method410(215);

					if ((int) (Math.random() * 2.0D) == 0) {
						field167.method410(193);
					}

					field167.method410((int) (Math.random() * 256.0D));
					field167.method411((int) (Math.random() * 65536.0D));
					field167.method410((int) (Math.random() * 256.0D));
					field167.method411(42728);
					field167.method411(52291);

					if ((int) (Math.random() * 2.0D) == 0) {
						field167.method410(186);
					}

					field167.method411(18581);
					field167.method410(44);
					field167.method419(field167.field1082 - var3);
				}
			}

			if (field259 == 2) {
				method155();
			}

			if (field123 && field153 == 1) {
				field311 = true;
			}

			if (field343 != -1) {
				boolean var4 = method67(field441, field343);
				if (var4) {
					field311 = true;
				}
			}

			if (field451 == 2) {
				field311 = true;
			}

			if (field432 == 2) {
				field311 = true;
			}

			if (field311) {
				method186();
				field311 = false;
			}

			if (field275 == -1 && field345 == 0) {
				field161.field1014 = field90 - field487 - 77;

				if (field1056 > 448 && field1056 < 560 && field1057 > 332) {
					method72(field1057 - 357, 0, field161, 463, -1, field1056 - 17, field90, 77);
				}

				int var5 = field90 - field161.field1014 - 77;
				if (var5 < 0) {
					var5 = 0;
				}

				if (var5 > field90 - 77) {
					var5 = field90 - 77;
				}

				if (field487 != var5) {
					field487 = var5;
					field329 = true;
				}

				field315++;
				if (field315 > 129) {
					field315 = 0;
					field167.method409(134);
					field167.method414(0);
				}
			}

			if (field275 == -1 && field345 == 3) {
				int var6 = field239 * 14 + 7;
				field161.field1014 = field242;

				if (field1056 > 448 && field1056 < 560 && field1057 > 332) {
					method72(field1057 - 357, 0, field161, 463, -1, field1056 - 17, var6, 77);
				}

				int var7 = field161.field1014;
				if (var7 < 0) {
					var7 = 0;
				}

				if (var7 > var6 - 77) {
					var7 = var6 - 77;
				}

				if (field242 != var7) {
					field242 = var7;
					field329 = true;
				}
			}

			if (field275 != -1) {
				boolean var8 = method67(field441, field275);
				if (var8) {
					field329 = true;
				}
			}

			if (field451 == 3) {
				field329 = true;
			}

			if (field432 == 3) {
				field329 = true;
			}

			if (field268 != null) {
				field329 = true;
			}

			if (field123 && field153 == 2) {
				field329 = true;
			}

			if (field329) {
				method140();
				field329 = false;
			}

			if (field259 == 2) {
				method93();
				field304.method378(550, 4, field1048);
			}

			if (field362 != -1) {
				field355 = true;
			}

			if (field355) {
				if (field362 != -1 && field362 == field342) {
					field362 = -1;
					field167.method409(237);
					field167.method410(field342);
				}

				field355 = false;
				field385.method377();
				field444.method371(0, 0);

				if (field343 == -1) {
					if (field373[field342] != -1) {
						if (field342 == 0) {
							field59.method371(22, 10);
						}

						if (field342 == 1) {
							field60.method371(54, 8);
						}

						if (field342 == 2) {
							field60.method371(82, 8);
						}

						if (field342 == 3) {
							field61.method371(110, 8);
						}

						if (field342 == 4) {
							field63.method371(153, 8);
						}

						if (field342 == 5) {
							field63.method371(181, 8);
						}

						if (field342 == 6) {
							field62.method371(209, 9);
						}
					}

					if (field373[0] != -1 && (field362 != 0 || field456 % 20 < 10)) {
						field309[0].method371(29, 13);
					}

					if (field373[1] != -1 && (field362 != 1 || field456 % 20 < 10)) {
						field309[1].method371(53, 11);
					}

					if (field373[2] != -1 && (field362 != 2 || field456 % 20 < 10)) {
						field309[2].method371(82, 11);
					}

					if (field373[3] != -1 && (field362 != 3 || field456 % 20 < 10)) {
						field309[3].method371(115, 12);
					}

					if (field373[4] != -1 && (field362 != 4 || field456 % 20 < 10)) {
						field309[4].method371(153, 13);
					}

					if (field373[5] != -1 && (field362 != 5 || field456 % 20 < 10)) {
						field309[5].method371(180, 11);
					}

					if (field373[6] != -1 && (field362 != 6 || field456 % 20 < 10)) {
						field309[6].method371(208, 13);
					}
				}

				field385.method378(516, 160, field1048);
				field384.method377();
				field443.method371(0, 0);

				if (field343 == -1) {
					if (field373[field342] != -1) {
						if (field342 == 7) {
							field188.method371(42, 0);
						}

						if (field342 == 8) {
							field189.method371(74, 0);
						}

						if (field342 == 9) {
							field189.method371(102, 0);
						}

						if (field342 == 10) {
							field190.method371(130, 1);
						}

						if (field342 == 11) {
							field192.method371(173, 0);
						}

						if (field342 == 12) {
							field192.method371(201, 0);
						}

						if (field342 == 13) {
							field191.method371(229, 0);
						}
					}

					if (field373[8] != -1 && (field362 != 8 || field456 % 20 < 10)) {
						field309[7].method371(74, 2);
					}

					if (field373[9] != -1 && (field362 != 9 || field456 % 20 < 10)) {
						field309[8].method371(102, 3);
					}

					if (field373[10] != -1 && (field362 != 10 || field456 % 20 < 10)) {
						field309[9].method371(137, 4);
					}

					if (field373[11] != -1 && (field362 != 11 || field456 % 20 < 10)) {
						field309[10].method371(174, 2);
					}

					if (field373[12] != -1 && (field362 != 12 || field456 % 20 < 10)) {
						field309[11].method371(201, 2);
					}

					if (field373[13] != -1 && (field362 != 13 || field456 % 20 < 10)) {
						field309[12].method371(226, 2);
					}
				}

				field384.method378(496, 466, field1048);
				field305.method377();
				DJQPOKKS.field589 = field475;
			}

			if (field338) {
				field338 = false;
				field383.method377();
				field442.method371(0, 0);
				field135.method535("Public chat", 0xFFFFFF, true, 28, 55);

				if (field316 == 0) {
					field135.method535("On", 0xFF00, true, 41, 55);
				}

				if (field316 == 1) {
					field135.method535("Friends", 0xFFFF00, true, 41, 55);
				}

				if (field316 == 2) {
					field135.method535("Off", 0xFF0000, true, 41, 55);
				}

				if (field316 == 3) {
					field135.method535("Hide", 0xFFFF, true, 41, 55);
				}

				field135.method535("Private chat", 0xFFFFFF, true, 28, 184);

				if (field301 == 0) {
					field135.method535("On", 0xFF00, true, 41, 184);
				}

				if (field301 == 1) {
					field135.method535("Friends", 0xFFFF00, true, 41, 184);
				}

				if (field301 == 2) {
					field135.method535("Off", 0xFF0000, true, 41, 184);
				}

				field135.method535("Trade/compete", 0xFFFFFF, true, 28, 324);

				if (field354 == 0) {
					field135.method535("On", 0xFF00, true, 41, 324);
				}

				if (field354 == 1) {
					field135.method535("Friends", 0xFFFF00, true, 41, 324);
				}

				if (field354 == 2) {
					field135.method535("Off", 0xFF0000, true, 41, 324);
				}

				field135.method535("Report abuse", 0xFFFFFF, true, 33, 458);
				field383.method378(0, 453, field1048);
				field305.method377();
				DJQPOKKS.field589 = field475;
			}

			field441 = 0;
		} else {
			if (field259 == 2) {
				method67(field441, field392);

				if (field326 != -1) {
					method67(field441, field326);
				}

				field441 = 0;
				method90();
				field1049.method377();
				DJQPOKKS.field589 = field476;
				YYTDUXDR.method579();
				field284 = true;
				NPNTBMMX var1 = NPNTBMMX.method393(field392);
				if (var1.field971 == 512 && var1.field966 == 334 && var1.field1011 == 0) {
					var1.field971 = 765;
					var1.field966 = 503;
				}

				method170(0, var1, 0, 0);

				if (field326 != -1) {
					NPNTBMMX var2 = NPNTBMMX.method393(field326);
					if (var2.field971 == 512 && var2.field966 == 334 && var2.field1011 == 0) {
						var2.field971 = 765;
						var2.field966 = 503;
					}

					method170(0, var2, 0, 0);
				}

				if (field123) {
					method160();
				} else {
					method74();
					method115();
				}
			}

			field1049.method378(0, 0, field1048);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method89() {
		field204 = 0;
		for (int var1 = -1; var1 < field376 + field263; var1++) {
			EGCNSKZO var2;
			if (var1 == -1) {
				var2 = field170;
			} else if (var1 < field263) {
				var2 = field262[field264[var1]];
			} else {
				var2 = field375[field377[var1 - field263]];
			}

			if (var2 != null && var2.method263()) {
				if (var2 instanceof GBGUDIMT) {
					WZSDIPBR var3 = ((GBGUDIMT) var2).field699;
					if (var3.field1308 != null) {
						var3 = var3.method526();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field263) {
					WZSDIPBR var6 = ((GBGUDIMT) var2).field699;
					if (var6.field1306 >= 0 && var6.field1306 < field158.length) {
						method177(var2, var2.field640 + 15);

						if (field113 > -1) {
							field158[var6.field1306].method511(field113 - 12, field114 - 30);
						}
					}

					if (field274 == 1 && field377[var1 - field263] == field395 && field456 % 20 < 10) {
						method177(var2, var2.field640 + 15);

						if (field113 > -1) {
							field152[0].method511(field113 - 12, field114 - 28);
						}
					}
				} else {
					int var4 = 30;
					ZQANNJZE var5 = (ZQANNJZE) var2;
					if (var5.field1464 != -1 || var5.field1457 != -1) {
						method177(var2, var2.field640 + 15);

						if (field113 > -1) {
							if (var5.field1464 != -1) {
								field347[var5.field1464].method511(field113 - 12, field114 - var4);
								var4 += 25;
							}

							if (var5.field1457 != -1) {
								field158[var5.field1457].method511(field113 - 12, field114 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field274 == 10 && field264[var1] == field124) {
						method177(var2, var2.field640 + 15);

						if (field113 > -1) {
							field152[1].method511(field113 - 12, field114 - var4);
						}
					}
				}

				if (var2.field652 != null && (var1 >= field263 || field316 == 0 || field316 == 3 || field316 == 1 && method79(((ZQANNJZE) var2).field1463))) {
					method177(var2, var2.field640);

					if (field113 > -1 && field204 < field205) {
						field209[field204] = field136.method537(var2.field652) / 2;
						field208[field204] = field136.field1376;
						field206[field204] = field113;
						field207[field204] = field114;
						field210[field204] = var2.field618;
						field211[field204] = var2.field660;
						field212[field204] = var2.field635;
						field213[field204++] = var2.field652;

						if (field276 == 0 && var2.field660 >= 1 && var2.field660 <= 3) {
							field208[field204] += 10;
							field207[field204] += 5;
						}

						if (field276 == 0 && var2.field660 == 4) {
							field209[field204] = 60;
						}

						if (field276 == 0 && var2.field660 == 5) {
							field208[field204] += 5;
						}
					}
				}

				if (var2.field653 > field456) {
					method177(var2, var2.field640 + 15);

					if (field113 > -1) {
						int var7 = var2.field654 * 30 / var2.field655;
						if (var7 > 30) {
							var7 = 30;
						}

						YYTDUXDR.method581(field113 - 15, 0xFF00, var7, 5, field114 - 3);
						YYTDUXDR.method581(field113 + var7 - 15, 0xFF0000, 30 - var7, 5, field114 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field644[var8] > field456) {
						method177(var2, var2.field640 / 2);

						if (field113 > -1) {
							if (var8 == 1) {
								field114 -= 20;
							}

							if (var8 == 2) {
								field113 -= 15;
								field114 -= 10;
							}

							if (var8 == 3) {
								field113 += 15;
								field114 -= 10;
							}

							field295[var2.field643[var8]].method511(field113 - 12, field114 - 12);
							field134.method534(field113, field114 + 4, String.valueOf(var2.field642[var8]), 0);
							field134.method534(field113 - 1, field114 + 3, String.valueOf(var2.field642[var8]), 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field204; var9++) {
			int var10 = field206[var9];
			int var11 = field207[var9];
			int var12 = field209[var9];
			int var13 = field208[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field207[var15] - field208[var15] && var11 - var13 < field207[var15] + 2 && var10 - var12 < field209[var15] + field206[var15] && var10 + var12 > field206[var15] - field209[var15] && field207[var15] - field208[var15] < var11) {
						var11 = field207[var15] - field208[var15];
						var14 = true;
					}
				}
			}

			field113 = field206[var9];
			field114 = field207[var9] = var11;
			String var16 = field213[var9];
			if (field276 == 0) {
				int var17 = 0xFFFF00;
				if (field210[var9] < 6) {
					var17 = field244[field210[var9]];
				}

				if (field210[var9] == 6) {
					var17 = field75 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field210[var9] == 7) {
					var17 = field75 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field210[var9] == 8) {
					var17 = field75 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field210[var9] == 9) {
					int var18 = 150 - field212[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field210[var9] == 10) {
					int var19 = 150 - field212[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field210[var9] == 11) {
					int var20 = 150 - field212[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field211[var9] == 0) {
					field136.method534(field113, field114 + 1, var16, 0);
					field136.method534(field113, field114, var16, var17);
				}

				if (field211[var9] == 1) {
					field136.method539(field114 + 1, 0, field113, field75, var16);
					field136.method539(field114, var17, field113, field75, var16);
				}

				if (field211[var9] == 2) {
					field136.method540(field114 + 1, field75, var16, field113, 0);
					field136.method540(field114, field75, var16, field113, var17);
				}

				if (field211[var9] == 3) {
					field136.method541(field75, 0, field113, var16, field114 + 1, 150 - field212[var9]);
					field136.method541(field75, var17, field113, var16, field114, 150 - field212[var9]);
				}

				if (field211[var9] == 4) {
					int var21 = field136.method537(var16);
					int var22 = (150 - field212[var9]) * (var21 + 100) / 150;
					YYTDUXDR.method578(field113 + 50, 0, field113 - 50, 334);
					field136.method538(0, field114 + 1, field113 + 50 - var22, var16);
					field136.method538(var17, field114, field113 + 50 - var22, var16);
					YYTDUXDR.method577();
				}

				if (field211[var9] == 5) {
					int var23 = 150 - field212[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					YYTDUXDR.method578(512, field114 - field136.field1376 - 1, 0, field114 + 5);
					field136.method534(field113, field114 + var24 + 1, var16, 0);
					field136.method534(field113, field114 + var24, var16, var17);
					YYTDUXDR.method577();
				}
			} else {
				field136.method534(field113, field114 + 1, var16, 0);
				field136.method534(field113, field114, var16, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method90() {
		if (field1049 == null) {
			method125();
			field217 = null;
			field218 = null;
			field219 = null;
			field220 = null;
			field221 = null;
			field222 = null;
			field223 = null;
			field224 = null;
			field225 = null;
			field306 = null;
			field304 = null;
			field303 = null;
			field305 = null;
			field383 = null;
			field384 = null;
			field385 = null;
			field1049 = new MVSFNVJP(method174(), 503, 765);
			field284 = true;
		}
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int method91(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field463[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field426[var6][var4][var5] + field426[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field426[var6][var4][var5 + 1] + field426[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IB)Z")
	public final boolean method92(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field367[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 201) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method93() {
		field304.method377();

		if (field253 == 2) {
			byte[] var1 = field215.field904;
			int[] var2 = YYTDUXDR.field1435;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field363.method515(field105, 25, field288, 25, 0, 33, 256, field390, 33, 0);
			field305.method377();
			DJQPOKKS.field589 = field475;
		} else {
			int var5 = field452 + field105 & 0x7FF;
			int var6 = field170.field628 / 32 + 48;
			int var7 = 464 - field170.field629 / 32;
			field87.method515(var5, var7, field258, var6, 25, 151, field323 + 256, field388, 146, 5);
			field363.method515(field105, 25, field288, 25, 0, 33, 256, field390, 33, 0);

			for (int var8 = 0; var8 < field233; var8++) {
				int var9 = field234[var8] * 4 + 2 - field170.field628 / 32;
				int var10 = field235[var8] * 4 + 2 - field170.field629 / 32;
				method203(field186[var8], var9, var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					FEPBPONH var13 = field250[field148][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field170.field628 / 32;
						int var15 = var12 * 4 + 2 - field170.field629 / 32;
						method203(field52, var14, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field376; var16++) {
				GBGUDIMT var17 = field375[field377[var16]];
				if (var17 != null && var17.method263()) {
					WZSDIPBR var18 = var17.field699;
					if (var18.field1308 != null) {
						var18 = var18.method526();
					}

					if (var18 != null && var18.field1297 && var18.field1298) {
						int var19 = var17.field628 / 32 - field170.field628 / 32;
						int var20 = var17.field629 / 32 - field170.field629 / 32;
						method203(field53, var19, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field263; var21++) {
				ZQANNJZE var22 = field262[field264[var21]];
				if (var22 != null && var22.method263()) {
					int var23 = var22.field628 / 32 - field170.field628 / 32;
					int var24 = var22.field629 / 32 - field170.field629 / 32;
					boolean var25 = false;
					long var26 = ZMJDGKKV.method588(var22.field1463);
					for (int var28 = 0; var28 < field279; var28++) {
						if (field160[var28] == var26 && field251[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field170.field1465 != 0 && var22.field1465 != 0 && field170.field1465 == var22.field1465) {
						var29 = true;
					}

					if (var25) {
						method203(field55, var23, var24);
					} else if (var29) {
						method203(field56, var23, var24);
					} else {
						method203(field54, var23, var24);
					}
				}
			}

			if (field274 != 0 && field456 % 20 < 10) {
				if (field274 == 1 && field395 >= 0 && field395 < field375.length) {
					GBGUDIMT var30 = field375[field395];
					if (var30 != null) {
						int var31 = var30.field628 / 32 - field170.field628 / 32;
						int var32 = var30.field629 / 32 - field170.field629 / 32;
						method127(field439, var31, var32);
					}
				}

				if (field274 == 2) {
					int var33 = (field317 - field465) * 4 + 2 - field170.field628 / 32;
					int var34 = (field318 - field466) * 4 + 2 - field170.field629 / 32;
					method127(field439, var33, var34);
				}

				if (field274 == 10 && field124 >= 0 && field124 < field262.length) {
					ZQANNJZE var35 = field262[field124];
					if (var35 != null) {
						int var36 = var35.field628 / 32 - field170.field628 / 32;
						int var37 = var35.field629 / 32 - field170.field629 / 32;
						method127(field439, var36, var37);
					}
				}
			}

			if (field85 != 0) {
				int var38 = field85 * 4 + 2 - field170.field628 / 32;
				int var39 = field86 * 4 + 2 - field170.field629 / 32;
				method203(field438, var38, var39);
			}

			YYTDUXDR.method581(97, 0xFFFFFF, 3, 3, 78);
			field305.method377();
			DJQPOKKS.field589 = field475;
		}
	}

	public final void run() {
		if (field49) {
			method205();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method94(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field202.method342(field148, arg2, arg0, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			CSTFGNEK var8 = CSTFGNEK.method219(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field527;
				var10 = var8.field533;
			} else {
				var9 = var8.field533;
				var10 = var8.field527;
			}

			int var11 = var8.field518;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method151(false, var10, arg0, field170.field658[0], field170.field659[0], var9, 2, var11, arg2, 0, 0);
		} else {
			method151(false, 0, arg0, field170.field658[0], field170.field659[0], 0, 2, 0, arg2, var7, var6 + 1);
		}

		field483 = field1063;
		field484 = field1064;
		field486 = 2;
		field485 = 0;
		return true;
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method95(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field46; var3++) {
				if (field132[var3] == arg0) {
					field46--;
					field311 = true;

					for (int var4 = var3; var4 < field46; var4++) {
						field132[var4] = field132[var4 + 1];
					}

					field167.method409(104);
					field167.method416(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLNPNTBMMX;)V")
	public final void method96(NPNTBMMX arg0) {
		int var2 = arg0.field1029;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field280 == 0) {
				arg0.field997 = "Loading friend list";
				arg0.field1030 = 0;
			} else if (var2 == 1 && field280 == 1) {
				arg0.field997 = "Connecting to friendserver";
				arg0.field1030 = 0;
			} else if (var2 == 2 && field280 != 2) {
				arg0.field997 = "Please wait...";
				arg0.field1030 = 0;
			} else {
				int var3 = field279;
				if (field280 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field997 = "";
					arg0.field1030 = 0;
				} else {
					arg0.field997 = field341[var2];
					arg0.field1030 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field279;
			if (field280 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field997 = "";
				arg0.field1030 = 0;
			} else {
				if (field251[var2] == 0) {
					arg0.field997 = "@red@Offline";
				} else if (field251[var2] < 200) {
					if (field251[var2] == field97) {
						arg0.field997 = "@gre@World" + (field251[var2] - 9);
					} else {
						arg0.field997 = "@yel@World" + (field251[var2] - 9);
					}
				} else if (field251[var2] == field97) {
					arg0.field997 = "@gre@Classic" + (field251[var2] - 219);
				} else {
					arg0.field997 = "@yel@Classic" + (field251[var2] - 219);
				}

				arg0.field1030 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field279;
			if (field280 != 2) {
				var5 = 0;
			}

			arg0.field987 = var5 * 15 + 20;
			if (arg0.field987 <= arg0.field966) {
				arg0.field987 = arg0.field966 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field280 == 0) {
				arg0.field997 = "Loading ignore list";
				arg0.field1030 = 0;
			} else if (var2 == 1 && field280 == 0) {
				arg0.field997 = "Please wait...";
				arg0.field1030 = 0;
			} else {
				int var6 = field46;
				if (field280 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field997 = "";
					arg0.field1030 = 0;
				} else {
					arg0.field997 = ZMJDGKKV.method592(ZMJDGKKV.method589(field132[var2]));
					arg0.field1030 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field987 = field46 * 15 + 20;
			if (arg0.field987 <= arg0.field966) {
				arg0.field987 = arg0.field966 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1027 = 150;
			arg0.field1028 = (int) (Math.sin(field456 / 40.0D) * 256.0D) & 0x7FF;

			if (field68) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field281[var7];
					if (var8 >= 0 && !IEVJZYTE.field792[var8].method303()) {
						return;
					}
				}

				field68 = false;
				POJFANDE[] var9 = new POJFANDE[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field281[var11];
					if (var12 >= 0) {
						var9[var10++] = IEVJZYTE.field792[var12].method304();
					}
				}

				POJFANDE var13 = new POJFANDE(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field252[var14] != 0) {
						var13.method474(field327[var14][0], field327[var14][field252[var14]]);

						if (var14 == 1) {
							var13.method474(field459[0], field459[field252[var14]]);
						}
					}
				}

				var13.method467();
				var13.method468(KIZBPSHZ.field888[field170.field656].field890[0]);
				var13.method477(64, 850, -30, -50, -30, true);
				arg0.field1007 = 5;
				arg0.field1008 = 0;
				NPNTBMMX.method395(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field370 == null) {
				field370 = arg0.field1003;
				field371 = arg0.field977;
			}

			if (field173) {
				arg0.field1003 = field371;
			} else {
				arg0.field1003 = field370;
			}
		} else if (var2 == 325) {
			if (field370 == null) {
				field370 = arg0.field1003;
				field371 = arg0.field977;
			}

			if (field173) {
				arg0.field1003 = field370;
			} else {
				arg0.field1003 = field371;
			}
		} else if (var2 == 600) {
			arg0.field997 = field47;
			if (field456 % 20 < 10) {
				arg0.field997 = arg0.field997 + "|";
			} else {
				arg0.field997 = arg0.field997 + " ";
			}
		} else if (var2 == 620) {
			if (field282 < 1) {
				arg0.field997 = "";
			} else if (field424) {
				arg0.field992 = 0xFF0000;
				arg0.field997 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field992 = 0xFFFFFF;
				arg0.field997 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field477 - field361;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field997 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field67 == 0) {
				arg0.field997 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field67 <= field477) {
				arg0.field997 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method97(field67);
			} else {
				int var17 = field477 + 14 - field67;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field997 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method97(field67) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field166 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field166 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field166 + " unread messages";
			}

			arg0.field997 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field131 > 0 && field131 <= field477 + 10) {
				arg0.field997 = "Last password change:\\n@gre@" + method97(field131);
			} else {
				arg0.field997 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field66 > 2 && !field99) {
				arg0.field997 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field66 > 2) {
				arg0.field997 = "\\n\\nYou have @gre@" + field66 + "@yel@ days of\\nmember credit remaining.";
			} else if (field66 > 0) {
				arg0.field997 = "You have @gre@" + field66 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field997 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field66 > 2 && !field99) {
				arg0.field997 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field66 > 0) {
				arg0.field997 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field997 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field67 > field477) {
				arg0.field997 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field997 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method97(int arg0) {
		if (arg0 > field477 + 10) {
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

	@ObfuscatedName("client.j(I)V")
	public final void method98() {
		field68 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field281[var1] = -1;
			for (int var2 = 0; var2 < IEVJZYTE.field791; var2++) {
				if (!IEVJZYTE.field792[var2].field798 && IEVJZYTE.field792[var2].field793 == var1 + (field173 ? 0 : 7)) {
					field281[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)I")
	public final int method99() {
		int var1 = 3;
		if (field229 < 310) {
			int var2 = field226 >> 7;
			int var3 = field228 >> 7;
			int var4 = field170.field628 >> 7;
			int var5 = field170.field629 >> 7;

			if ((field463[field148][var2][var3] & 0x4) != 0) {
				var1 = field148;
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

					if ((field463[field148][var2][var3] & 0x4) != 0) {
						var1 = field148;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field463[field148][var2][var3] & 0x4) != 0) {
							var1 = field148;
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

					if ((field463[field148][var2][var3] & 0x4) != 0) {
						var1 = field148;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field463[field148][var2][var3] & 0x4) != 0) {
							var1 = field148;
						}
					}
				}
			}
		}

		if ((field463[field148][field170.field628 >> 7][field170.field629 >> 7] & 0x4) != 0) {
			var1 = field148;
		}

		return var1;
	}

	@ObfuscatedName("client.l(I)I")
	public final int method100() {
		int var1 = method91(field148, field226, field228);
		if (var1 - field227 < 800 && (field463[field148][field226 >> 7][field228 >> 7] & 0x4) != 0) {
			return field148;
		}

		return 3;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method101() {
		if (field80 > 0) {
			method134();
		} else {
			method135("Please wait - attempting to reestablish", "Connection lost");
			field253 = 0;
			field85 = 0;
			HHMTQDYM var1 = field43;
			field340 = false;
			field469 = 0;
			method118(field149, field150, true);

			if (!field340) {
				method134();
			}

			try {
				var1.method277();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method102() {
		int var1 = 5;
		field51[8] = 0;
		int var2 = 0;
		while (field51[8] == 0) {
			String var3 = "Unknown problem";
			method188("Connecting to web server", 20);

			try {
				DataInputStream var4 = method171("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 355);
				PGNBHFUF var5 = new PGNBHFUF(new byte[40]);
				var4.readFully(var5.field1081, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field51[var6] = var5.method425();
				}

				int var7 = var5.method425();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field51[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field51[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field51[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field51[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field51[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field51[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method188("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method188(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field299 = !field299;
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method103() {
		for (int var1 = 0; var1 < field232; var1++) {
			if (field118[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field412[var1] != field168 || field421[var1] != field287) {
						PGNBHFUF var3 = SHEJQUDB.method497(field412[var1], field421[var1]);
						if (System.currentTimeMillis() + var3.field1082 / 22 > field454 / 22 + field198) {
							field454 = var3.field1082;
							field198 = System.currentTimeMillis();

							if (method142(var3.field1082, var3.field1081)) {
								field168 = field412[var1];
								field287 = field421[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method207()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field167.method409(116);
						field167.method411(field412[var1] & 0x7FFF);
					} else {
						field167.method409(116);
						field167.method411(-1);
					}
				}

				if (var2 && field118[var1] != -5) {
					field118[var1] = -5;
				} else {
					field232--;
					for (int var5 = var1; var5 < field232; var5++) {
						field412[var5] = field412[var5 + 1];
						field421[var5] = field421[var5 + 1];
						field118[var5] = field118[var5 + 1];
					}

					var1--;
				}
			} else {
				field118[var1]--;
			}
		}

		if (field182 > 0) {
			field182 -= 20;
			if (field182 < 0) {
				field182 = 0;
			}

			if (field182 == 0 && field286 && !field100) {
				field200 = field460;
				field201 = true;
				field96.method230(2, field200);
				return;
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method104() {
		if (field398 == 0 && field479 == 0) {
			field429[field332] = "Walk here";
			field367[field332] = 709;
			field365[field332] = field1056;
			field366[field332] = field1057;
			field332++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < POJFANDE.field1160; var2++) {
			int var3 = POJFANDE.field1161[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field202.method342(field148, var4, var5, var3) >= 0) {
					CSTFGNEK var8 = CSTFGNEK.method219(var7);
					if (var8.field531 != null) {
						var8 = var8.method212();
					}

					if (var8 == null) {
						continue;
					}

					if (field398 == 1) {
						field429[field332] = "Use " + field402 + " with @cya@" + var8.field501;
						field367[field332] = 642;
						field368[field332] = var3;
						field365[field332] = var4;
						field366[field332] = var5;
						field332++;
					} else if (field479 != 1) {
						if (var8.field492 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field492[var9] != null) {
									field429[field332] = var8.field492[var9] + " @cya@" + var8.field501;

									if (var9 == 0) {
										field367[field332] = 716;
									}

									if (var9 == 1) {
										field367[field332] = 993;
									}

									if (var9 == 2) {
										field367[field332] = 885;
									}

									if (var9 == 3) {
										field367[field332] = 492;
									}

									if (var9 == 4) {
										field367[field332] = 1660;
									}

									field368[field332] = var3;
									field365[field332] = var4;
									field366[field332] = var5;
									field332++;
								}
							}
						}

						field429[field332] = "Examine @cya@" + var8.field501;
						field367[field332] = 1474;
						field368[field332] = var8.field506 << 14;
						field365[field332] = var4;
						field366[field332] = var5;
						field332++;
					} else if ((field481 & 0x4) == 4) {
						field429[field332] = field482 + " @cya@" + var8.field501;
						field367[field332] = 668;
						field368[field332] = var3;
						field365[field332] = var4;
						field366[field332] = var5;
						field332++;
					}
				}

				if (var6 == 1) {
					GBGUDIMT var10 = field375[var7];
					if (var10.field699.field1291 == 1 && (var10.field628 & 0x7F) == 0x40 && (var10.field629 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field376; var11++) {
							GBGUDIMT var12 = field375[field377[var11]];
							if (var12 != null && var10 != var12 && var12.field699.field1291 == 1 && var10.field628 == var12.field628 && var10.field629 == var12.field629) {
								method158(var5, field377[var11], var12.field699, var4);
							}
						}

						for (int var13 = 0; var13 < field263; var13++) {
							ZQANNJZE var14 = field262[field264[var13]];
							if (var14 != null && var10.field628 == var14.field628 && var10.field629 == var14.field629) {
								method136(var5, var4, field264[var13], var14);
							}
						}
					}

					method158(var5, var7, var10.field699, var4);
				}

				if (var6 == 0) {
					ZQANNJZE var15 = field262[var7];
					if ((var15.field628 & 0x7F) == 0x40 && (var15.field629 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field376; var16++) {
							GBGUDIMT var17 = field375[field377[var16]];
							if (var17 != null && var17.field699.field1291 == 1 && var15.field628 == var17.field628 && var15.field629 == var17.field629) {
								method158(var5, field377[var16], var17.field699, var4);
							}
						}

						for (int var18 = 0; var18 < field263; var18++) {
							ZQANNJZE var19 = field262[field264[var18]];
							if (var19 != null && var15 != var19 && var15.field628 == var19.field628 && var15.field629 == var19.field629) {
								method136(var5, var4, field264[var18], var19);
							}
						}
					}

					method136(var5, var4, var7, var15);
				}

				if (var6 == 3) {
					FEPBPONH var20 = field250[field148][var4][var5];
					if (var20 != null) {
						for (BINNTJRP var21 = (BINNTJRP) var20.method270(); var21 != null; var21 = (BINNTJRP) var20.method272()) {
							IBYWZZZK var22 = IBYWZZZK.method290(var21.field20);
							if (field398 == 1) {
								field429[field332] = "Use " + field402 + " with @lre@" + var22.field747;
								field367[field332] = 567;
								field368[field332] = var21.field20;
								field365[field332] = var4;
								field366[field332] = var5;
								field332++;
							} else if (field479 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field749 != null && var22.field749[var23] != null) {
										field429[field332] = var22.field749[var23] + " @lre@" + var22.field747;

										if (var23 == 0) {
											field367[field332] = 635;
										}

										if (var23 == 1) {
											field367[field332] = 641;
										}

										if (var23 == 2) {
											field367[field332] = 821;
										}

										if (var23 == 3) {
											field367[field332] = 992;
										}

										if (var23 == 4) {
											field367[field332] = 330;
										}

										field368[field332] = var21.field20;
										field365[field332] = var4;
										field366[field332] = var5;
										field332++;
									} else if (var23 == 2) {
										field429[field332] = "Take @lre@" + var22.field747;
										field367[field332] = 821;
										field368[field332] = var21.field20;
										field365[field332] = var4;
										field366[field332] = var5;
										field332++;
									}
								}

								field429[field332] = "Examine @lre@" + var22.field747;
								field367[field332] = 1907;
								field368[field332] = var21.field20;
								field365[field332] = var4;
								field366[field332] = var5;
								field332++;
							} else if ((field481 & 0x1) == 1) {
								field429[field332] = field482 + " @lre@" + var22.field747;
								field367[field332] = 994;
								field368[field332] = var21.field20;
								field365[field332] = var4;
								field366[field332] = var5;
								field332++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method105() {
		try {
			field119 = -1;
			field110.method273();
			field391.method273();
			field193++;
			if (field193 > 1570) {
				field193 = 0;
				field167.method409(145);
				field167.method410(0);
				int var1 = field167.field1082;

				if ((int) (Math.random() * 2.0D) == 0) {
					field167.method410(120);
				}

				field167.method411((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field167.method411(54115);
				}

				field167.method410((int) (Math.random() * 256.0D));
				field167.method410(68);

				if ((int) (Math.random() * 2.0D) == 0) {
					field167.method411(56997);
				}

				field167.method411((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field167.method411(11446);
				}

				field167.method410(159);
				field167.method411((int) (Math.random() * 65536.0D));
				field167.method419(field167.field1082 - var1);
			}

			DJQPOKKS.method247();
			method199();
			field202.method312();
			System.gc();

			for (int var2 = 0; var2 < 4; var2++) {
				field254[var2].method39();
			}

			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						field463[var3][var4][var5] = 0;
					}
				}
			}

			YECQDWTF var6 = new YECQDWTF(104, field426, 104, field463);
			int var7 = field163.length;
			field167.method409(253);

			if (!field116) {
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = (field255[var8] >> 8) * 64 - field465;
					int var10 = (field255[var8] & 0xFF) * 64 - field466;
					byte[] var11 = field163[var8];
					if (var11 != null) {
						var6.method563((field64 - 6) * 8, field254, var11, var9, (field65 - 6) * 8, var10);
					}
				}

				for (int var12 = 0; var12 < var7; var12++) {
					int var13 = (field255[var12] >> 8) * 64 - field465;
					int var14 = (field255[var12] & 0xFF) * 64 - field466;
					byte[] var15 = field163[var12];
					if (var15 == null && field65 < 800) {
						var6.method567(var13, var14, 64, 64);
					}
				}

				field167.method409(253);

				for (int var16 = 0; var16 < var7; var16++) {
					byte[] var17 = field115[var16];
					if (var17 != null) {
						int var18 = (field255[var16] >> 8) * 64 - field465;
						int var19 = (field255[var16] & 0xFF) * 64 - field466;
						var6.method557(var17, var19, var18, field254, field202);
					}
				}
			}

			if (field116) {
				for (int var20 = 0; var20 < 4; var20++) {
					for (int var21 = 0; var21 < 13; var21++) {
						for (int var22 = 0; var22 < 13; var22++) {
							boolean var23 = false;
							int var24 = field181[var20][var21][var22];
							if (var24 != -1) {
								int var25 = var24 >> 24 & 0x3;
								int var26 = var24 >> 1 & 0x3;
								int var27 = var24 >> 14 & 0x3FF;
								int var28 = var24 >> 3 & 0x7FF;
								int var29 = (var27 / 8 << 8) + var28 / 8;
								for (int var30 = 0; var30 < field255.length; var30++) {
									if (field255[var30] == var29 && field163[var30] != null) {
										var6.method566(var26, var21 * 8, (var27 & 0x7) * 8, field254, var20, var25, var22 * 8, field163[var30], (var28 & 0x7) * 8);
										var23 = true;
										break;
									}
								}
							}

							if (!var23) {
								var6.method553(var21 * 8, var20, var22 * 8);
							}
						}
					}
				}

				for (int var31 = 0; var31 < 13; var31++) {
					for (int var32 = 0; var32 < 13; var32++) {
						int var33 = field181[0][var31][var32];
						if (var33 == -1) {
							var6.method567(var31 * 8, var32 * 8, 8, 8);
						}
					}
				}

				field167.method409(253);

				for (int var34 = 0; var34 < 4; var34++) {
					for (int var35 = 0; var35 < 13; var35++) {
						for (int var36 = 0; var36 < 13; var36++) {
							int var37 = field181[var34][var35][var36];
							if (var37 != -1) {
								int var38 = var37 >> 24 & 0x3;
								int var39 = var37 >> 1 & 0x3;
								int var40 = var37 >> 14 & 0x3FF;
								int var41 = var37 >> 3 & 0x7FF;
								int var42 = (var40 / 8 << 8) + var41 / 8;
								for (int var43 = 0; var43 < field255.length; var43++) {
									if (field255[var43] == var42 && field115[var43] != null) {
										var6.method558(var34, var39, (var41 & 0x7) * 8, (var40 & 0x7) * 8, field115[var43], field254, var35 * 8, var38, var36 * 8, field202);
										break;
									}
								}
							}
						}
					}
				}
			}

			field167.method409(253);
			var6.method560(field202, field254);

			if (field305 != null) {
				field305.method377();
				DJQPOKKS.field589 = field475;
			}

			field167.method409(253);
			int var44 = YECQDWTF.field1397;
			if (var44 > field148) {
				var44 = field148;
			}

			if (var44 < field148 - 1) {
				int var45 = field148 - 1;
			}

			if (field100) {
				field202.method313(YECQDWTF.field1397);
			} else {
				field202.method313(0);
			}

			for (int var46 = 0; var46 < 104; var46++) {
				for (int var47 = 0; var47 < 104; var47++) {
					method71(var46, var47);
				}
			}

			field422++;
			if (field422 > 1843) {
				field422 = 0;
				field167.method409(91);
				field167.method410(0);
				int var48 = field167.field1082;
				field167.method410((int) (Math.random() * 256.0D));
				field167.method410(85);

				if ((int) (Math.random() * 2.0D) == 0) {
					field167.method411(41546);
				}

				field167.method411(4405);

				if ((int) (Math.random() * 2.0D) == 0) {
					field167.method410(0);
				}

				field167.method410(193);
				field167.method410(99);
				field167.method410(178);
				field167.method411(11597);
				field167.method411((int) (Math.random() * 65536.0D));
				field167.method419(field167.field1082 - var48);
			}

			method146();
		} catch (Exception var61) {
		}

		CSTFGNEK.field503.method601();

		if (field1051 != null) {
			field167.method409(74);
			field167.method414(1057001181);
		}

		if (field100 && signlink.cache_dat != null) {
			int var50 = field96.method241(0);
			for (int var51 = 0; var51 < var50; var51++) {
				int var52 = field96.method236(var51);
				if ((var52 & 0x79) == 0) {
					POJFANDE.method459(var51);
				}
			}
		}

		System.gc();
		DJQPOKKS.method248(20);
		field96.method233();
		int var53 = (field64 - 6) / 8 - 1;
		int var54 = (field64 + 6) / 8 + 1;
		int var55 = (field65 - 6) / 8 - 1;
		int var56 = (field65 + 6) / 8 + 1;
		if (field120) {
			var53 = 49;
			var54 = 50;
			var55 = 49;
			var56 = 50;
		}

		for (int var57 = var53; var57 <= var54; var57++) {
			for (int var58 = var55; var58 <= var56; var58++) {
				if (var53 == var57 || var54 == var57 || var55 == var58 || var56 == var58) {
					int var59 = field96.method228(var57, var58, 0);
					if (var59 != -1) {
						field96.method225(var59, 3);
					}

					int var60 = field96.method228(var57, var58, 1);
					if (var60 != -1) {
						field96.method225(var60, 3);
					}
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1051 != null) {
				return new URL("http://127.0.0.1:" + (field98 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.m(I)V")
	public final void method106() {
		try {
			int var1 = field170.field628 + field413;
			int var2 = field170.field629 + field307;
			if (field333 - var1 < -500 || field333 - var1 > 500 || field334 - var2 < -500 || field334 - var2 > 500) {
				field333 = var1;
				field334 = var2;
			}

			if (field333 != var1) {
				field333 += (var1 - field333) / 16;
			}

			if (field334 != var2) {
				field334 += (var2 - field334) / 16;
			}

			if (field1066[1] == 1) {
				field106 += (-field106 - 24) / 2;
			} else if (field1066[2] == 1) {
				field106 += (24 - field106) / 2;
			} else {
				field106 /= 2;
			}

			if (field1066[3] == 1) {
				field107 += (12 - field107) / 2;
			} else if (field1066[4] == 1) {
				field107 += (-field107 - 12) / 2;
			} else {
				field107 /= 2;
			}

			field105 = field106 / 2 + field105 & 0x7FF;
			field104 += field107 / 2;
			if (field104 < 128) {
				field104 = 128;
			}

			if (field104 > 383) {
				field104 = 383;
			}

			int var3 = field333 >> 7;
			int var4 = field334 >> 7;
			int var5 = method91(field148, field333, field334);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field148;
						if (var9 < 3 && (field463[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field426[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			field423++;
			if (field423 > 1897) {
				field423 = 0;
				field167.method409(125);
				field167.method410(0);
				int var11 = field167.field1082;
				field167.method410(221);
				field167.method411((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field167.method410(167);
				}

				field167.method410(228);
				field167.method411(36419);
				field167.method410((int) (Math.random() * 256.0D));
				field167.method411(21720);
				field167.method411((int) (Math.random() * 65536.0D));
				field167.method411((int) (Math.random() * 65536.0D));
				field167.method410(101);
				field167.method419(field167.field1082 - var11);
			}

			int var12 = var6 * 192;
			if (var12 > 98048) {
				var12 = 98048;
			}

			if (var12 < 32768) {
				var12 = 32768;
			}

			if (var12 > field285) {
				field285 += (var12 - field285) / 24;
			} else if (var12 < field285) {
				field285 += (var12 - field285) / 80;
			}
		} catch (Exception var13) {
			signlink.reporterror("glfc_ex " + field170.field628 + "," + field170.field629 + "," + field333 + "," + field334 + "," + field64 + "," + field65 + "," + field465 + "," + field466);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method107() {
		Graphics var1 = method174().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method406(1);

		if (field269) {
			field461 = false;
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

		if (field337) {
			field461 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field445) {
			field461 = false;
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

	@ObfuscatedName("client.a(B)V")
	public final void method108() {
		field255 = null;
		field163 = null;
		field115 = null;
		field256 = null;
		field257 = null;
		field236 = null;
		field442 = null;
		field443 = null;
		field444 = null;
		field117 = null;
		field303 = null;
		field304 = null;
		field305 = null;
		field306 = null;
		field214 = null;
		field215 = null;
		field216 = null;
		field262 = null;
		field264 = null;
		field266 = null;
		field267 = null;
		field447 = null;
		field365 = null;
		field366 = null;
		field367 = null;
		field368 = null;
		field429 = null;
		field234 = null;
		field235 = null;
		field186 = null;
		field363 = null;
		field295 = null;
		field347 = null;
		field158 = null;
		field152 = null;
		field271 = null;
		field59 = null;
		field60 = null;
		field61 = null;
		field62 = null;
		field63 = null;
		field383 = null;
		field384 = null;
		field385 = null;
		field143 = null;
		field144 = null;
		field145 = null;
		field146 = null;
		field147 = null;
		field250 = null;
		field176 = null;

		if (field162 != null) {
			field162.field1416 = false;
		}

		field162 = null;
		field139 = null;
		field140 = null;
		field141 = null;
		field142 = null;
		field391 = null;
		field110 = null;
		field341 = null;
		field160 = null;
		field251 = null;
		field379 = null;
		method132();
		field87 = null;
		field167 = null;
		field94 = null;
		field289 = null;
		field374 = null;
		field188 = null;
		field189 = null;
		field190 = null;
		field191 = null;
		field192 = null;
		field309 = null;
		field322 = null;
		field95 = null;
		field389 = null;

		try {
			if (field43 != null) {
				field43.method277();
			}
		} catch (Exception var1) {
		}

		field43 = null;
		field52 = null;
		field53 = null;
		field54 = null;
		field55 = null;
		field56 = null;
		field220 = null;
		field221 = null;
		field217 = null;
		field218 = null;
		field219 = null;
		field375 = null;
		field377 = null;
		field222 = null;
		field223 = null;
		field224 = null;
		field225 = null;
		field81 = null;
		field381 = null;
		field277 = null;
		field278 = null;
		field426 = null;
		field463 = null;
		field202 = null;
		field254 = null;

		if (field96 != null) {
			field96.method242();
		}

		field96 = null;
		method125();
		CSTFGNEK.method216();
		WZSDIPBR.method532();
		IBYWZZZK.method288();
		NPNTBMMX.method400();
		UFJMYAXC.field1239 = null;
		IEVJZYTE.field792 = null;
		FJUASMMM.field689 = null;
		KIZBPSHZ.field888 = null;
		BUIWQSXJ.field30 = null;
		BUIWQSXJ.field42 = null;
		ZWNTUTST.field1473 = null;
		field1049 = null;
		ZQANNJZE.field1459 = null;
		DJQPOKKS.method244();
		KFVPSSJH.method311();
		POJFANDE.method456();
		HVIFHYEW.method285();
		System.gc();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public final void method109(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field239 = 0;
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

			field239 = 0;
			label45: for (int var7 = 0; var7 < IBYWZZZK.field760; var7++) {
				IBYWZZZK var8 = IBYWZZZK.method290(var7);
				if (var8.field755 == -1 && var8.field747 != null) {
					String var9 = var8.field747.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label45;
						}
					}

					field240[field239] = var9;
					field241[field239] = var7;
					field239++;
					if (field239 >= field240.length) {
						break;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method110() {
		if (field403 != 0) {
			int var1 = 0;
			if (field273 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field437[var2] != null) {
					int var3 = field435[var2];
					String var4 = field436[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field301 == 0 || field301 == 1 && method79(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1056 > 4 && field1057 - 4 > var8 - 10 && field1057 - 4 <= var8 + 3) {
							int var9 = field135.method536("From:  " + var4 + field437[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1056 < var9 + 4) {
								if (field282 >= 1) {
									field429[field332] = "Report abuse @whi@" + var4;
									field367[field332] = 2031;
									field332++;
								}

								field429[field332] = "Add ignore @whi@" + var4;
								field367[field332] = 2370;
								field332++;
								field429[field332] = "Add friend @whi@" + var4;
								field367[field332] = 2201;
								field332++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field301 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILNPNTBMMX;)Z")
	public final boolean method111(NPNTBMMX arg0) {
		int var2 = arg0.field1029;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field429[field332] = "Remove @whi@" + arg0.field997;
				field367[field332] = 629;
				field332++;
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

		field429[field332] = "Remove @whi@" + field341[var2];
		field367[field332] = 761;
		field332++;
		field429[field332] = "Message @whi@" + field341[var2];
		field367[field332] = 246;
		field332++;
		return true;
	}

	@ObfuscatedName("client.a(LPGNBHFUF;II)V")
	public final void method112(PGNBHFUF arg0, int arg1) {
		for (int var3 = 0; var3 < field265; var3++) {
			int var4 = field266[var3];
			GBGUDIMT var5 = field375[var4];
			int var6 = arg0.method420();
			if ((var6 & 0x80) != 0) {
				var5.field606 = arg0.method446();
				var5.field607 = arg0.method447();
			}

			if ((var6 & 0x1) != 0) {
				int var7 = arg0.method440();
				int var8 = arg0.method438();
				var5.method265(field456, var8, var7);
				var5.field653 = field456 + 300;
				var5.field654 = arg0.method439();
				var5.field655 = arg0.method420();
			}

			if ((var6 & 0x4) != 0) {
				int var9 = arg0.method439();
				int var10 = arg0.method438();
				var5.method265(field456, var10, var9);
				var5.field653 = field456 + 300;
				var5.field654 = arg0.method440();
				var5.field655 = arg0.method440();
			}

			if ((var6 & 0x8) != 0) {
				var5.field622 = arg0.method446();
				int var11 = arg0.method452();
				var5.field626 = var11 >> 16;
				var5.field625 = (var11 & 0xFFFF) + field456;
				var5.field623 = 0;
				var5.field624 = 0;

				if (var5.field625 > field456) {
					var5.field623 = -1;
				}

				if (var5.field622 == 0xFFFF) {
					var5.field622 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field634 = arg0.method422();
				if (var5.field634 == 0xFFFF) {
					var5.field634 = -1;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field699 = WZSDIPBR.method525(arg0.method447());
				var5.field619 = var5.field699.field1291;
				var5.field620 = var5.field699.field1302;
				var5.field636 = var5.field699.field1289;
				var5.field637 = var5.field699.field1283;
				var5.field638 = var5.field699.field1286;
				var5.field639 = var5.field699.field1303;
				var5.field656 = var5.field699.field1313;
			}

			if ((var6 & 0x40) != 0) {
				int var12 = arg0.method448();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg0.method420();
				if (var5.field645 == var12 && var12 != -1) {
					int var14 = KIZBPSHZ.field888[var12].field902;
					if (var14 == 1) {
						var5.field646 = 0;
						var5.field647 = 0;
						var5.field648 = var13;
						var5.field649 = 0;
					}

					if (var14 == 2) {
						var5.field649 = 0;
					}
				} else if (var12 == -1 || var5.field645 == -1 || KIZBPSHZ.field888[var12].field896 >= KIZBPSHZ.field888[var5.field645].field896) {
					var5.field645 = var12;
					var5.field646 = 0;
					var5.field647 = 0;
					var5.field648 = var13;
					var5.field649 = 0;
					var5.field641 = var5.field621;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field652 = arg0.method427();
				var5.field635 = 100;
			}
		}
	}

	@ObfuscatedName("client.b(LPGNBHFUF;II)V")
	public final void method113(PGNBHFUF arg0, int arg1) {
		while (arg0.field1083 + 21 < arg1 * 8) {
			int var3 = arg0.method431(14);
			if (var3 == 16383) {
				break;
			}

			if (field375[var3] == null) {
				field375[var3] = new GBGUDIMT();
			}

			GBGUDIMT var4 = field375[var3];
			field377[field376++] = var3;
			var4.field650 = field456;
			int var5 = arg0.method431(1);
			var4.field699 = WZSDIPBR.method525(arg0.method431(13));
			int var6 = arg0.method431(1);
			if (var6 == 1) {
				field266[field265++] = var3;
			}

			int var7 = arg0.method431(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method431(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field619 = var4.field699.field1291;
			var4.field620 = var4.field699.field1302;
			var4.field636 = var4.field699.field1289;
			var4.field637 = var4.field699.field1283;
			var4.field638 = var4.field699.field1286;
			var4.field639 = var4.field699.field1303;
			var4.field656 = var4.field699.field1313;
			var4.method262(var5 == 1, field170.field658[0] + var8, field170.field659[0] + var7);
		}

		arg0.method432();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method114() {
		if (field306 == null) {
			method125();
			field1049 = null;
			field217 = null;
			field218 = null;
			field219 = null;
			field220 = null;
			field221 = null;
			field222 = null;
			field223 = null;
			field224 = null;
			field225 = null;
			field306 = new MVSFNVJP(method174(), 96, 479);
			field304 = new MVSFNVJP(method174(), 156, 172);
			YYTDUXDR.method579();
			field215.method371(0, 0);
			field303 = new MVSFNVJP(method174(), 261, 190);
			field305 = new MVSFNVJP(method174(), 334, 512);
			YYTDUXDR.method579();
			field383 = new MVSFNVJP(method174(), 50, 496);
			field384 = new MVSFNVJP(method174(), 37, 269);
			field385 = new MVSFNVJP(method174(), 45, 249);
			field284 = true;
			field305.method377();
			DJQPOKKS.field589 = field475;
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method115() {
		if (field332 >= 2 || field398 != 0 || field479 != 0) {
			String var1;
			if (field398 == 1 && field332 < 2) {
				var1 = "Use " + field402 + " with...";
			} else if (field479 == 1 && field332 < 2) {
				var1 = field482 + "...";
			} else {
				var1 = field429[field332 - 1];
			}

			if (field332 > 2) {
				var1 = var1 + "@whi@ / " + (field332 - 2) + " more options";
			}

			field136.method543(15, var1, 4, field456 / 1000, 0xFFFFFF, true);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		IYHIHFOL var10 = null;
		for (IYHIHFOL var11 = (IYHIHFOL) field176.method269(); var11 != null; var11 = (IYHIHFOL) field176.method271()) {
			if (var11.field807 == arg4 && var11.field809 == arg2 && var11.field810 == arg1 && var11.field808 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new IYHIHFOL();
			var10.field807 = arg4;
			var10.field808 = arg3;
			var10.field809 = arg2;
			var10.field810 = arg1;
			method204(var10);
			field176.method266(var10);
		}

		var10.field799 = arg7;
		var10.field801 = arg6;
		var10.field800 = arg0;
		var10.field803 = arg5;
		var10.field802 = arg8;
	}

	@ObfuscatedName("client.a(BLNPNTBMMX;I)I")
	public final int method117(NPNTBMMX arg0, int arg1) {
		if (arg0.field964 == null || arg1 >= arg0.field964.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field964[arg1];
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
					var8 = field386[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field48[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field103[var3[var5++]];
				}

				if (var7 == 4) {
					NPNTBMMX var10 = NPNTBMMX.method393(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < IBYWZZZK.field760 && (!IBYWZZZK.method290(var11).field746 || field99)) {
						for (int var12 = 0; var12 < var10.field1013.length; var12++) {
							if (var11 + 1 == var10.field1013[var12]) {
								var8 += var10.field1021[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field322[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field88[field48[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field322[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field170.field1461;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < OGPYHVGJ.field1070; var13++) {
						if (OGPYHVGJ.field1072[var13]) {
							var8 += field48[var13];
						}
					}
				}

				if (var7 == 10) {
					NPNTBMMX var14 = NPNTBMMX.method393(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < IBYWZZZK.field760 && (!IBYWZZZK.method290(var15).field746 || field99)) {
						for (int var16 = 0; var16 < var14.field1013.length; var16++) {
							if (var14.field1013[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field108;
				}

				if (var7 == 12) {
					var8 = field175;
				}

				if (var7 == 13) {
					int var17 = field322[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					GDBQCAOA var20 = GDBQCAOA.field701[var19];
					int var21 = var20.field703;
					int var22 = var20.field704;
					int var23 = var20.field705;
					int var24 = field184[var23 - var22];
					var8 = field322[var21] >> var22 & var24;
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
					var8 = (field170.field628 >> 7) + field465;
				}

				if (var7 == 19) {
					var8 = (field170.field629 >> 7) + field466;
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

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method118(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field101 = "";
				field102 = "Connecting to server...";
				method147(true);
			}

			field43 = new HHMTQDYM(this, method201(field98 + 43594));
			long var4 = ZMJDGKKV.method588(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field167.field1082 = 0;
			field167.method410(14);
			field167.method410(var6);
			field43.method281(0, field167.field1081, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field43.method278();
			}

			int var8 = field43.method278();
			int var9 = var8;

			if (var8 == 0) {
				field43.method280(field289.field1081, 0, 8);
				field289.field1082 = 0;
				field72 = field289.method426();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field72 >> 32), (int) field72 };
				field167.field1082 = 0;
				field167.method410(10);
				field167.method414(var10[0]);
				field167.method414(var10[1]);
				field167.method414(var10[2]);
				field167.method414(var10[3]);
				field167.method414(signlink.uid);
				field167.method417(arg0);
				field167.method417(arg1);
				field167.method435(field133, field50);
				field94.field1082 = 0;

				if (arg2) {
					field94.method410(18);
				} else {
					field94.method410(16);
				}

				field94.method410(field167.field1082 + 36 + 1 + 1 + 2);
				field94.method410(255);
				field94.method411(355);
				field94.method410(field100 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field94.method414(field51[var11]);
				}

				field94.method418(field167.field1081, field167.field1082, 0);
				field167.field1086 = new BDQVRRZB(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field109 = new BDQVRRZB(var10);
				field43.method281(0, field94.field1081, field94.field1082);
				var8 = field43.method278();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method118(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field282 = field43.method278();
				field348 = field43.method278() == 1;
				field420 = 0L;
				field310 = 0;
				field162.field1418 = 0;
				field1053 = true;
				field249 = true;
				field340 = true;
				field167.field1082 = 0;
				field289.field1082 = 0;
				field77 = -1;
				field470 = -1;
				field471 = -1;
				field472 = -1;
				field76 = 0;
				field78 = 0;
				field273 = 0;
				field80 = 0;
				field274 = 0;
				field332 = 0;
				field123 = false;
				field1054 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field437[var13] = null;
				}

				field398 = 0;
				field479 = 0;
				field259 = 0;
				field232 = 0;
				field413 = (int) (Math.random() * 100.0D) - 50;
				field307 = (int) (Math.random() * 110.0D) - 55;
				field351 = (int) (Math.random() * 80.0D) - 40;
				field452 = (int) (Math.random() * 120.0D) - 60;
				field323 = (int) (Math.random() * 30.0D) - 20;
				field105 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field253 = 0;
				field119 = -1;
				field85 = 0;
				field86 = 0;
				field263 = 0;
				field376 = 0;

				for (int var14 = 0; var14 < field260; var14++) {
					field262[var14] = null;
					field267[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field375[var15] = null;
				}

				field170 = field262[field261] = new ZQANNJZE();
				field391.method273();
				field110.method273();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field250[var16][var17][var18] = null;
						}
					}
				}

				field176 = new FEPBPONH();
				field280 = 0;
				field279 = 0;
				method200(field488);
				field488 = -1;
				method200(field275);
				field275 = -1;
				method200(field270);
				field270 = -1;
				method200(field392);
				field392 = -1;
				method200(field326);
				field326 = -1;
				method200(field343);
				field343 = -1;
				method200(field298);
				field298 = -1;
				field369 = false;
				field342 = 3;
				field345 = 0;
				field123 = false;
				field243 = false;
				field268 = null;
				field325 = 0;
				field362 = -1;
				field173 = true;
				method98();

				for (int var19 = 0; var19 < 5; var19++) {
					field252[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field330[var20] = null;
					field331[var20] = false;
				}

				field425 = 0;
				field185 = 0;
				field231 = 0;
				field71 = 0;
				field89 = 0;
				field203 = 0;
				field313 = 0;
				field130 = 0;
				field197 = 0;
				method114();
			} else if (var8 == 3) {
				field101 = "";
				field102 = "Invalid username or password.";
			} else if (var8 == 4) {
				field101 = "Your account has been disabled.";
				field102 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field101 = "Your account is already logged in.";
				field102 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field101 = "RuneScape has been updated!";
				field102 = "Please reload this page.";
			} else if (var8 == 7) {
				field101 = "This world is full.";
				field102 = "Please use a different world.";
			} else if (var8 == 8) {
				field101 = "Unable to connect.";
				field102 = "Login server offline.";
			} else if (var8 == 9) {
				field101 = "Login limit exceeded.";
				field102 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field101 = "Unable to connect.";
				field102 = "Bad session id.";
			} else if (var8 == 11) {
				field101 = "Login server rejected session.";
				field102 = "Please try again.";
			} else if (var8 == 12) {
				field101 = "You need a members account to login to this world.";
				field102 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field101 = "Could not complete login.";
				field102 = "Please try using a different world.";
			} else if (var8 == 14) {
				field101 = "The server is being updated.";
				field102 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field340 = true;
				field167.field1082 = 0;
				field289.field1082 = 0;
				field77 = -1;
				field470 = -1;
				field471 = -1;
				field472 = -1;
				field76 = 0;
				field78 = 0;
				field273 = 0;
				field332 = 0;
				field123 = false;
				field84 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field101 = "Login attempts exceeded.";
				field102 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field101 = "You are standing in a members-only area.";
				field102 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field101 = "Invalid loginserver requested";
				field102 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field43.method278();
				for (var21 += 3; var21 >= 0; var21--) {
					field101 = "You have only just left another world";
					field102 = "Your profile will be transferred in: " + var21;
					method147(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method118(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field101 = "Malformed login packet.";
				field102 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field101 = "Unexpected server response";
				field102 = "Please try using a different world.";
			} else if (var9 != 0) {
				field101 = "No response from server";
				field102 = "Please try using a different world.";
			} else if (field469 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field469++;
				method118(arg0, arg1, arg2);
			} else {
				field101 = "No response from loginserver";
				field102 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field101 = "";
			field102 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(LNPNTBMMX;I)Z")
	public final boolean method119(NPNTBMMX arg0) {
		if (arg0.field1004 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1004.length; var2++) {
			int var3 = method117(arg0, var2);
			int var4 = arg0.field960[var2];
			if (arg0.field1004[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1004[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1004[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(ILPGNBHFUF;B)V")
	public final void method120(int arg0, PGNBHFUF arg1) {
		while (arg1.field1083 + 10 < arg0 * 8) {
			int var3 = arg1.method431(11);
			if (var3 == 2047) {
				break;
			}

			if (field262[var3] == null) {
				field262[var3] = new ZQANNJZE();
				if (field267[var3] != null) {
					field262[var3].method594(field267[var3]);
				}
			}

			field264[field263++] = var3;
			ZQANNJZE var4 = field262[var3];
			var4.field650 = field456;
			int var5 = arg1.method431(1);
			if (var5 == 1) {
				field266[field265++] = var3;
			}

			int var6 = arg1.method431(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method431(1);
			int var8 = arg1.method431(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method262(var7 == 1, field170.field658[0] + var8, field170.field659[0] + var6);
		}

		arg1.method432();
	}

	@ObfuscatedName("client.i(B)V")
	public final void method121() {
		if (field1062 == 1) {
			if (field1063 >= 539 && field1063 <= 573 && field1064 >= 169 && field1064 < 205 && field373[0] != -1) {
				field311 = true;
				field342 = 0;
				field355 = true;
			}

			if (field1063 >= 569 && field1063 <= 599 && field1064 >= 168 && field1064 < 205 && field373[1] != -1) {
				field311 = true;
				field342 = 1;
				field355 = true;
			}

			if (field1063 >= 597 && field1063 <= 627 && field1064 >= 168 && field1064 < 205 && field373[2] != -1) {
				field311 = true;
				field342 = 2;
				field355 = true;
			}

			if (field1063 >= 625 && field1063 <= 669 && field1064 >= 168 && field1064 < 203 && field373[3] != -1) {
				field311 = true;
				field342 = 3;
				field355 = true;
			}

			if (field1063 >= 666 && field1063 <= 696 && field1064 >= 168 && field1064 < 205 && field373[4] != -1) {
				field311 = true;
				field342 = 4;
				field355 = true;
			}

			if (field1063 >= 694 && field1063 <= 724 && field1064 >= 168 && field1064 < 205 && field373[5] != -1) {
				field311 = true;
				field342 = 5;
				field355 = true;
			}

			if (field1063 >= 722 && field1063 <= 756 && field1064 >= 169 && field1064 < 205 && field373[6] != -1) {
				field311 = true;
				field342 = 6;
				field355 = true;
			}

			if (field1063 >= 540 && field1063 <= 574 && field1064 >= 466 && field1064 < 502 && field373[7] != -1) {
				field311 = true;
				field342 = 7;
				field355 = true;
			}

			if (field1063 >= 572 && field1063 <= 602 && field1064 >= 466 && field1064 < 503 && field373[8] != -1) {
				field311 = true;
				field342 = 8;
				field355 = true;
			}

			if (field1063 >= 599 && field1063 <= 629 && field1064 >= 466 && field1064 < 503 && field373[9] != -1) {
				field311 = true;
				field342 = 9;
				field355 = true;
			}

			if (field1063 >= 627 && field1063 <= 671 && field1064 >= 467 && field1064 < 502 && field373[10] != -1) {
				field311 = true;
				field342 = 10;
				field355 = true;
			}

			if (field1063 >= 669 && field1063 <= 699 && field1064 >= 466 && field1064 < 503 && field373[11] != -1) {
				field311 = true;
				field342 = 11;
				field355 = true;
			}

			if (field1063 >= 696 && field1063 <= 726 && field1064 >= 466 && field1064 < 503 && field373[12] != -1) {
				field311 = true;
				field342 = 12;
				field355 = true;
			}

			if (field1063 >= 724 && field1063 <= 758 && field1064 >= 466 && field1064 < 502 && field373[13] != -1) {
				field311 = true;
				field342 = 13;
				field355 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZIIIII)V")
	public final void method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = POJFANDE.field1162[var7];
			int var13 = POJFANDE.field1163[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = POJFANDE.field1162[var8];
			int var16 = POJFANDE.field1163[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field226 = arg2 - var9;
		field227 = arg3 - var10;
		field228 = arg1 - var11;
		field229 = arg5;
		field230 = arg4;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 355);

			if (arg0.length == 5) {
				field97 = Integer.parseInt(arg0[0]);
				field98 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method133();
				} else if (arg0[2].equals("highmem")) {
					method150();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field99 = false;
				} else if (arg0[3].equals("members")) {
					field99 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method403(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method123() {
		method188("Starting up", 20);

		if (signlink.sunjava) {
			field1042 = 5;
		}

		if (field177) {
			field445 = true;
		} else {
			field177 = true;
			boolean var1 = false;
			String var2 = method196();
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
						field387[var3] = new RUMGIOMW(signlink.cache_dat, signlink.cache_idx[var3], 500000, var3 + 1);
					}
				}

				try {
					method102();
					field82 = method180("title", "title screen", field51[1], 1, 25);
					field134 = new XUAWPLCH(false, field82, "p11_full");
					field135 = new XUAWPLCH(false, field82, "p12_full");
					field136 = new XUAWPLCH(false, field82, "b12_full");
					field137 = new XUAWPLCH(true, field82, "q8_full");
					method68();
					method152();
					QDHHNYHL var4 = method180("config", "config", field51[2], 2, 30);
					QDHHNYHL var5 = method180("interface", "interface", field51[3], 3, 35);
					QDHHNYHL var6 = method180("media", "2d graphics", field51[4], 4, 40);
					QDHHNYHL var7 = method180("textures", "textures", field51[6], 6, 45);
					QDHHNYHL var8 = method180("wordenc", "chat system", field51[7], 7, 50);
					QDHHNYHL var9 = method180("sounds", "sound effects", field51[8], 8, 55);
					field463 = new byte[4][104][104];
					field426 = new int[4][105][105];
					field202 = new KFVPSSJH(field426, 104, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field254[var10] = new BBRQYCNY(104, 104);
					}

					field87 = new TTWFVYGB(512, 512);
					QDHHNYHL var11 = method180("versionlist", "update list", field51[5], 5, 60);
					method188("Connecting to update server", 60);
					field96 = new DGAWSPEW();
					field96.method232(var11, this);
					HVIFHYEW.method283(field96.method239());
					POJFANDE.method457(field96.method241(0), field96);

					if (!field100) {
						field200 = 0;
						field201 = true;
						field96.method230(2, field200);

						while (field96.method240() > 0) {
							method166();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field96.field549 > 3) {
								method145("ondemand");
								return;
							}
						}
					}

					method188("Requesting animations", 65);
					int var12 = field96.method241(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field96.method230(1, var13);
					}

					while (field96.method240() > 0) {
						int var14 = var12 - field96.method240();
						if (var14 > 0) {
							method188("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method166();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field96.field549 > 3) {
							method145("ondemand");
							return;
						}
					}

					method188("Requesting models", 70);
					int var15 = field96.method241(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field96.method236(var16);
						if ((var17 & 0x1) != 0) {
							field96.method230(0, var16);
						}
					}

					int var18 = field96.method240();
					while (field96.method240() > 0) {
						int var19 = var18 - field96.method240();
						if (var19 > 0) {
							method188("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method166();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field387[0] != null) {
						method188("Requesting maps", 75);
						field96.method230(3, field96.method228(47, 48, 0));
						field96.method230(3, field96.method228(47, 48, 1));
						field96.method230(3, field96.method228(48, 48, 0));
						field96.method230(3, field96.method228(48, 48, 1));
						field96.method230(3, field96.method228(49, 48, 0));
						field96.method230(3, field96.method228(49, 48, 1));
						field96.method230(3, field96.method228(47, 47, 0));
						field96.method230(3, field96.method228(47, 47, 1));
						field96.method230(3, field96.method228(48, 47, 0));
						field96.method230(3, field96.method228(48, 47, 1));
						field96.method230(3, field96.method228(48, 148, 0));
						field96.method230(3, field96.method228(48, 148, 1));
						int var20 = field96.method240();
						while (field96.method240() > 0) {
							int var21 = var20 - field96.method240();
							if (var21 > 0) {
								method188("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method166();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field96.method241(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field96.method236(var23);
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
							field96.method224(var23, 0, var25);
						}
					}

					field96.method223(field99);

					if (!field100) {
						int var26 = field96.method241(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field96.method234(var27)) {
								field96.method224(var27, 2, (byte) 1);
							}
						}
					}

					method188("Unpacking media", 80);
					field214 = new KWBPZBYX(var6, "invback", 0);
					field216 = new KWBPZBYX(var6, "chatback", 0);
					field215 = new KWBPZBYX(var6, "mapback", 0);
					field442 = new KWBPZBYX(var6, "backbase1", 0);
					field443 = new KWBPZBYX(var6, "backbase2", 0);
					field444 = new KWBPZBYX(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field309[var28] = new KWBPZBYX(var6, "sideicons", var28);
					}

					field363 = new TTWFVYGB(var6, "compass", 0);
					field364 = new TTWFVYGB(var6, "mapedge", 0);
					field364.method508();

					for (int var29 = 0; var29 < 72; var29++) {
						field95[var29] = new KWBPZBYX(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field389[var30] = new TTWFVYGB(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field295[var31] = new TTWFVYGB(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field347[var32] = new TTWFVYGB(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field158[var33] = new TTWFVYGB(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field152[var34] = new TTWFVYGB(var6, "headicons_hint", var34);
					}

					field117 = new TTWFVYGB(var6, "overlay_multiway", 0);
					field438 = new TTWFVYGB(var6, "mapmarker", 0);
					field439 = new TTWFVYGB(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field271[var35] = new TTWFVYGB(var6, "cross", var35);
					}

					field52 = new TTWFVYGB(var6, "mapdots", 0);
					field53 = new TTWFVYGB(var6, "mapdots", 1);
					field54 = new TTWFVYGB(var6, "mapdots", 2);
					field55 = new TTWFVYGB(var6, "mapdots", 3);
					field56 = new TTWFVYGB(var6, "mapdots", 4);
					field406 = new KWBPZBYX(var6, "scrollbar", 0);
					field407 = new KWBPZBYX(var6, "scrollbar", 1);
					field59 = new KWBPZBYX(var6, "redstone1", 0);
					field60 = new KWBPZBYX(var6, "redstone2", 0);
					field61 = new KWBPZBYX(var6, "redstone3", 0);
					field62 = new KWBPZBYX(var6, "redstone1", 0);
					field62.method368();
					field63 = new KWBPZBYX(var6, "redstone2", 0);
					field63.method368();
					field188 = new KWBPZBYX(var6, "redstone1", 0);
					field188.method369();
					field189 = new KWBPZBYX(var6, "redstone2", 0);
					field189.method369();
					field190 = new KWBPZBYX(var6, "redstone3", 0);
					field190.method369();
					field191 = new KWBPZBYX(var6, "redstone1", 0);
					field191.method368();
					field191.method369();
					field192 = new KWBPZBYX(var6, "redstone2", 0);
					field192.method368();
					field192.method369();

					for (int var36 = 0; var36 < 2; var36++) {
						field382[var36] = new KWBPZBYX(var6, "mod_icons", var36);
					}

					TTWFVYGB var37 = new TTWFVYGB(var6, "backleft1", 0);
					field139 = new MVSFNVJP(method174(), var37.field1233, var37.field1232);
					var37.method509(0, 0);
					TTWFVYGB var38 = new TTWFVYGB(var6, "backleft2", 0);
					field140 = new MVSFNVJP(method174(), var38.field1233, var38.field1232);
					var38.method509(0, 0);
					TTWFVYGB var39 = new TTWFVYGB(var6, "backright1", 0);
					field141 = new MVSFNVJP(method174(), var39.field1233, var39.field1232);
					var39.method509(0, 0);
					TTWFVYGB var40 = new TTWFVYGB(var6, "backright2", 0);
					field142 = new MVSFNVJP(method174(), var40.field1233, var40.field1232);
					var40.method509(0, 0);
					TTWFVYGB var41 = new TTWFVYGB(var6, "backtop1", 0);
					field143 = new MVSFNVJP(method174(), var41.field1233, var41.field1232);
					var41.method509(0, 0);
					TTWFVYGB var42 = new TTWFVYGB(var6, "backvmid1", 0);
					field144 = new MVSFNVJP(method174(), var42.field1233, var42.field1232);
					var42.method509(0, 0);
					TTWFVYGB var43 = new TTWFVYGB(var6, "backvmid2", 0);
					field145 = new MVSFNVJP(method174(), var43.field1233, var43.field1232);
					var43.method509(0, 0);
					TTWFVYGB var44 = new TTWFVYGB(var6, "backvmid3", 0);
					field146 = new MVSFNVJP(method174(), var44.field1233, var44.field1232);
					var44.method509(0, 0);
					TTWFVYGB var45 = new TTWFVYGB(var6, "backhmid2", 0);
					field147 = new MVSFNVJP(method174(), var45.field1233, var45.field1232);
					var45.method509(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field389[var50] != null) {
							field389[var50].method507(var46 + var49, var48 + var49, var47 + var49);
						}

						if (field95[var50] != null) {
							field95[var50].method370(var46 + var49, var48 + var49, var47 + var49);
						}
					}

					method188("Unpacking textures", 83);
					DJQPOKKS.method249(var7);
					DJQPOKKS.method253(0.8D);
					DJQPOKKS.method248(20);
					method188("Unpacking config", 86);
					KIZBPSHZ.method363(var4);
					CSTFGNEK.method220(var4);
					UFJMYAXC.method519(var4);
					IBYWZZZK.method293(var4);
					WZSDIPBR.method531(var4);
					IEVJZYTE.method301(var4);
					BUIWQSXJ.method60(var4);
					ZWNTUTST.method597(var4);
					GDBQCAOA.method275(var4);
					IBYWZZZK.field780 = field99;

					if (!field100) {
						method188("Unpacking sounds", 90);
						byte[] var51 = var9.method488("sounds.dat", null);
						PGNBHFUF var52 = new PGNBHFUF(var51);
						SHEJQUDB.method496(var52);
					}

					method188("Unpacking interfaces", 95);
					XUAWPLCH[] var53 = new XUAWPLCH[] { field134, field135, field136, field137 };
					NPNTBMMX.method396(var6, var5, var53);
					method188("Preparing game engine", 100);

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field215.field904[field215.field906 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field288[var54] = var55;
						field390[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field215.field904[field215.field906 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field258[var58 - 5] = var59 - 25;
						field388[var58 - 5] = var60 - var59;
					}

					DJQPOKKS.method246(765, 503);
					field476 = DJQPOKKS.field589;
					DJQPOKKS.method246(479, 96);
					field473 = DJQPOKKS.field589;
					DJQPOKKS.method246(190, 261);
					field474 = DJQPOKKS.field589;
					DJQPOKKS.method246(512, 334);
					field475 = DJQPOKKS.field589;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = DJQPOKKS.field587[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					KFVPSSJH.method348(800, 500, 334, 512, var62);
					AZWWSWYH.method1(var8);
					field162 = new YMDQNWFI(this);
					method164(field162, 10);
					YRZVGTOF.field1434 = this;
					CSTFGNEK.field502 = this;
					WZSDIPBR.field1278 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field349 + " " + field91);
					field269 = true;
				}
			} else {
				field337 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method124(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method125() {
		field461 = false;
		while (field440) {
			field461 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field179 = null;
		field180 = null;
		field314 = null;
		field408 = null;
		field409 = null;
		field410 = null;
		field411 = null;
		field296 = null;
		field297 = null;
		field111 = null;
		field112 = null;
		field171 = null;
		field172 = null;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method126() {
		if (field217 == null) {
			field1049 = null;
			field306 = null;
			field304 = null;
			field303 = null;
			field305 = null;
			field383 = null;
			field384 = null;
			field385 = null;
			field220 = new MVSFNVJP(method174(), 265, 128);
			YYTDUXDR.method579();
			field221 = new MVSFNVJP(method174(), 265, 128);
			YYTDUXDR.method579();
			field217 = new MVSFNVJP(method174(), 171, 509);
			YYTDUXDR.method579();
			field218 = new MVSFNVJP(method174(), 132, 360);
			YYTDUXDR.method579();
			field219 = new MVSFNVJP(method174(), 200, 360);
			YYTDUXDR.method579();
			field222 = new MVSFNVJP(method174(), 238, 202);
			YYTDUXDR.method579();
			field223 = new MVSFNVJP(method174(), 238, 203);
			YYTDUXDR.method579();
			field224 = new MVSFNVJP(method174(), 94, 74);
			YYTDUXDR.method579();
			field225 = new MVSFNVJP(method174(), 94, 75);
			YYTDUXDR.method579();

			if (field82 != null) {
				method68();
				method152();
			}

			field284 = true;
		}
	}

	@ObfuscatedName("client.a(LTTWFVYGB;III)V")
	public final void method127(TTWFVYGB arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field452 + field105 & 0x7FF;
			int var6 = POJFANDE.field1162[var5];
			int var7 = POJFANDE.field1163[var5];
			var6 = var6 * 256 / (field323 + 256);
			var7 = var7 * 256 / (field323 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field364.method516(15, 256, 15, 20, var10, var12 + 94 + 4 - 10, 20, 83 - var13 - 20);
		} else {
			method203(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method128(long arg0) {
		if (arg0 != 0L) {
			if (field46 >= 100) {
				method65(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = ZMJDGKKV.method592(ZMJDGKKV.method589(arg0));
				for (int var4 = 0; var4 < field46; var4++) {
					if (field132[var4] == arg0) {
						method65(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field279; var5++) {
					if (field160[var5] == arg0) {
						method65(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field132[field46++] = arg0;
				field311 = true;
				field167.method409(240);
				field167.method416(arg0);
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method129() {
		short var1 = 256;

		if (field404 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field404 > 768) {
					field408[var2] = method124(field410[var2], field409[var2], 1024 - field404);
				} else if (field404 > 256) {
					field408[var2] = field410[var2];
				} else {
					field408[var2] = method124(field409[var2], field410[var2], 256 - field404);
				}
			}
		} else if (field405 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field405 > 768) {
					field408[var3] = method124(field411[var3], field409[var3], 1024 - field405);
				} else if (field405 > 256) {
					field408[var3] = field411[var3];
				} else {
					field408[var3] = method124(field409[var3], field411[var3], 256 - field405);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field408[var4] = field409[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field220.field951[var5] = field171.field1231[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field427[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field111[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field408[var12];
					int var15 = field220.field951[var7];
					field220.field951[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field220.method378(0, 0, field1048);

		for (int var16 = 0; var16 < 33920; var16++) {
			field221.field951[var16] = field172.field1231[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field427[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field111[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field408[var23];
					int var26 = field221.field951[var18];
					field221.field951[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field221.method378(637, 0, field1048);
	}

	@ObfuscatedName("client.q(I)V")
	public final void method130() {
		int var1 = field125 * 128 + 64;
		int var2 = field126 * 128 + 64;
		int var3 = method91(field148, var1, var2) - field127;

		if (field226 < var1) {
			field226 += (var1 - field226) * field129 / 1000 + field128;
			if (field226 > var1) {
				field226 = var1;
			}
		}

		if (field226 > var1) {
			field226 -= (field226 - var1) * field129 / 1000 + field128;
			if (field226 < var1) {
				field226 = var1;
			}
		}

		if (field227 < var3) {
			field227 += (var3 - field227) * field129 / 1000 + field128;
			if (field227 > var3) {
				field227 = var3;
			}
		}

		if (field227 > var3) {
			field227 -= (field227 - var3) * field129 / 1000 + field128;
			if (field227 < var3) {
				field227 = var3;
			}
		}

		if (field228 < var2) {
			field228 += (var2 - field228) * field129 / 1000 + field128;
			if (field228 > var2) {
				field228 = var2;
			}
		}

		if (field228 > var2) {
			field228 -= (field228 - var2) * field129 / 1000 + field128;
			if (field228 < var2) {
				field228 = var2;
			}
		}

		int var4 = field356 * 128 + 64;
		int var5 = field357 * 128 + 64;
		int var6 = method91(field148, var4, var5) - field358;
		int var7 = var4 - field226;
		int var8 = var6 - field227;
		int var9 = var5 - field228;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field229 < var11) {
			field229 += (var11 - field229) * field360 / 1000 + field359;
			if (field229 > var11) {
				field229 = var11;
			}
		}

		if (field229 > var11) {
			field229 -= (field229 - var11) * field360 / 1000 + field359;
			if (field229 < var11) {
				field229 = var11;
			}
		}

		int var13 = var12 - field230;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field230 += field360 * var13 / 1000 + field359;
			field230 &= 0x7FF;
		}

		if (var13 < 0) {
			field230 -= -var13 * field360 / 1000 + field359;
			field230 &= 0x7FF;
		}

		int var14 = var12 - field230;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field230 = var12;
		}
	}

	@ObfuscatedName("client.a(LNPNTBMMX;Z)Z")
	public final boolean method131(NPNTBMMX arg0) {
		int var2 = arg0.field1029;
		if (field280 == 2) {
			if (var2 == 201) {
				field329 = true;
				field345 = 0;
				field243 = true;
				field328 = "";
				field74 = 1;
				field312 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field329 = true;
				field345 = 0;
				field243 = true;
				field328 = "";
				field74 = 2;
				field312 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field80 = 250;
			return true;
		}

		if (var2 == 501) {
			field329 = true;
			field345 = 0;
			field243 = true;
			field328 = "";
			field74 = 4;
			field312 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field329 = true;
			field345 = 0;
			field243 = true;
			field328 = "";
			field74 = 5;
			field312 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field281[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = IEVJZYTE.field791 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= IEVJZYTE.field791) {
							var5 = 0;
						}
					}

					if (!IEVJZYTE.field792[var5].field798 && IEVJZYTE.field792[var5].field793 == var3 + (field173 ? 0 : 7)) {
						break;
					}
				}

				field281[var3] = var5;
				field68 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field252[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field327[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field327[var6].length) {
					var8 = 0;
				}
			}

			field252[var6] = var8;
			field68 = true;
		}

		if (var2 == 324 && !field173) {
			field173 = true;
			method98();
		}

		if (var2 == 325 && field173) {
			field173 = false;
			method98();
		}

		if (var2 == 326) {
			field167.method409(22);
			field167.method410(field173 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field167.method410(field281[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field167.method410(field252[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field424 = !field424;
		}

		if (var2 >= 601 && var2 <= 613) {
			method206();

			if (field47.length() > 0) {
				field167.method409(251);
				field167.method416(ZMJDGKKV.method588(field47));
				field167.method410(var2 - 601);
				field167.method410(field424 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method132() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	public final void init() {
		field97 = Integer.parseInt(getParameter("nodeid"));
		field98 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method133();
		} else {
			method150();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field99 = false;
		} else {
			field99 = true;
		}

		method404(765, 503);
	}

	@ObfuscatedName("client.j(B)V")
	public static final void method133() {
		KFVPSSJH.field824 = true;
		DJQPOKKS.field578 = true;
		field100 = true;
		YECQDWTF.field1383 = true;
		CSTFGNEK.field522 = true;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method134() {
		try {
			if (field43 != null) {
				field43.method277();
			}
		} catch (Exception var2) {
		}

		field43 = null;
		field340 = false;
		field417 = 0;
		field149 = "";
		field150 = "";
		method199();
		field202.method312();

		for (int var1 = 0; var1 < 4; var1++) {
			field254[var1].method39();
		}

		System.gc();
		method132();
		field460 = -1;
		field200 = -1;
		field182 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method135(String arg0, String arg1) {
		if (field305 != null) {
			field305.method377();
			DJQPOKKS.field589 = field475;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field135.method534(257, var3, arg1, 0);
			field135.method534(256, var3 - 1, arg1, 0xFFFFFF);
			var3 += 15;
			if (arg0 != null) {
				field135.method534(257, var3, arg0, 0);
				field135.method534(256, var3 - 1, arg0, 0xFFFFFF);
			}

			field305.method378(4, 4, field1048);
		} else if (field1049 != null) {
			field1049.method377();
			DJQPOKKS.field589 = field476;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			YYTDUXDR.method581(383 - var5 / 2, 0, var5, var6, var4 - var6 / 2 - 5);
			YYTDUXDR.method582(var5, 0xFFFFFF, 383 - var5 / 2, var6, var4 - var6 / 2 - 5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field135.method534(383, var4, arg1, 0);
			field135.method534(382, var4 - 1, arg1, 0xFFFFFF);
			var4 += 15;
			if (arg0 != null) {
				field135.method534(383, var4, arg0, 0);
				field135.method534(382, var4 - 1, arg0, 0xFFFFFF);
			}

			field1049.method378(0, 0, field1048);
		}
	}

	@ObfuscatedName("client.a(IIIILZQANNJZE;)V")
	public final void method136(int arg0, int arg1, int arg2, ZQANNJZE arg3) {
		if (field170 != arg3 && field332 < 400) {
			String var5;
			if (arg3.field1460 == 0) {
				var5 = arg3.field1463 + method185(arg3.field1461, field170.field1461) + " (level-" + arg3.field1461 + ")";
			} else {
				var5 = arg3.field1463 + " (skill-" + arg3.field1460 + ")";
			}

			if (field398 == 1) {
				field429[field332] = "Use " + field402 + " with @whi@" + var5;
				field367[field332] = 326;
				field368[field332] = arg2;
				field365[field332] = arg1;
				field366[field332] = arg0;
				field332++;
			} else if (field479 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field330[var6] != null) {
						field429[field332] = field330[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field330[var6].equalsIgnoreCase("attack")) {
							if (arg3.field1461 > field170.field1461) {
								var7 = 2000;
							}

							if (field170.field1465 != 0 && arg3.field1465 != 0) {
								if (field170.field1465 == arg3.field1465) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field331[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field367[field332] = var7 + 646;
						}

						if (var6 == 1) {
							field367[field332] = var7 + 479;
						}

						if (var6 == 2) {
							field367[field332] = var7 + 749;
						}

						if (var6 == 3) {
							field367[field332] = var7 + 525;
						}

						if (var6 == 4) {
							field367[field332] = var7 + 572;
						}

						field368[field332] = arg2;
						field365[field332] = arg1;
						field366[field332] = arg0;
						field332++;
					}
				}
			} else if ((field481 & 0x8) == 8) {
				field429[field332] = field482 + " @whi@" + var5;
				field367[field332] = 8;
				field368[field332] = arg2;
				field365[field332] = arg1;
				field366[field332] = arg0;
				field332++;
			}

			for (int var8 = 0; var8 < field332; var8++) {
				if (field367[var8] == 709) {
					field429[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method137() {
		if (field445 || field269 || field337) {
			method107();
		} else {
			field151++;

			if (field340) {
				method88();
			} else {
				method147(false);
			}

			field246 = 0;
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method138(int arg0) {
		if (!field100) {
			for (int var2 = 0; var2 < field178.length; var2++) {
				int var3 = field178[var2];
				if (DJQPOKKS.field597[var3] >= arg0) {
					KWBPZBYX var4 = DJQPOKKS.field591[var3];
					int var5 = var4.field907 * var4.field906 - 1;
					int var6 = field441 * var4.field906 * 2;
					byte[] var7 = var4.field904;
					byte[] var8 = field236;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field904 = var8;
					field236 = var7;
					DJQPOKKS.method251(var3);
				}
			}

			field302++;
			if (field302 > 66) {
				field302 = 0;
				field167.method409(213);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public final String method139(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.t(I)V")
	public final void method140() {
		field306.method377();
		DJQPOKKS.field589 = field473;
		field216.method371(0, 0);

		if (field243) {
			field136.method534(239, 40, field312, 0);
			field136.method534(239, 60, field328 + "*", 128);
		} else if (field345 == 1) {
			field136.method534(239, 40, "Enter amount:", 0);
			field136.method534(239, 60, field291 + "*", 128);
		} else if (field345 == 2) {
			field136.method534(239, 40, "Enter name:", 0);
			field136.method534(239, 60, field291 + "*", 128);
		} else if (field345 == 3) {
			if (field291 != field238) {
				method109(field291);
				field238 = field291;
			}

			XUAWPLCH var1 = field135;
			YYTDUXDR.method578(463, 0, 0, 77);

			for (int var2 = 0; var2 < field239; var2++) {
				int var3 = var2 * 14 + 18 - field242;
				if (var3 > 0 && var3 < 110) {
					var1.method534(239, var3, field240[var2], 0);
				}
			}

			YYTDUXDR.method577();

			if (field239 > 5) {
				method209(field239 * 14 + 7, field242, 77, 0, 463);
			}

			if (field291.length() == 0) {
				field136.method534(239, 40, "Enter object name", 255);
			} else if (field239 == 0) {
				field136.method534(239, 40, "No matching objects found, please shorten search", 0);
			}

			var1.method534(239, 90, field291 + "*", 0);
			YYTDUXDR.method584(0, 479, 77, 0);
		} else if (field268 != null) {
			field136.method534(239, 40, field268, 0);
			field136.method534(239, 60, "Click to continue", 128);
		} else if (field275 != -1) {
			method170(0, NPNTBMMX.method393(field275), 0, 0);
		} else if (field488 == -1) {
			XUAWPLCH var4 = field135;
			int var5 = 0;
			YYTDUXDR.method578(463, 0, 0, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field437[var6] != null) {
					int var7 = field435[var6];
					int var8 = field487 + 70 - var5 * 14;
					String var9 = field436[var6];
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
							var4.method538(0, var8, 4, field437[var6]);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field316 == 0 || field316 == 1 && method79(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field382[0].method371(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field382[1].method371(var11, var8 - 12);
								var11 += 14;
							}

							var4.method538(0, var8, var11, var9 + ":");
							var11 += var4.method536(var9) + 8;
							var4.method538(255, var8, var11, field437[var6]);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field403 == 0 && (var7 == 7 || field301 == 0 || field301 == 1 && method79(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method538(0, var8, var12, "From");
							int var14 = var12 + var4.method536("From ");
							if (var10 == 1) {
								field382[0].method371(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field382[1].method371(var14, var8 - 12);
								var14 += 14;
							}

							var4.method538(0, var8, var14, var9 + ":");
							var14 += var4.method536(var9) + 8;
							var4.method538(0x800000, var8, var14, field437[var6]);
						}

						var5++;
					}

					if (var7 == 4 && (field354 == 0 || field354 == 1 && method79(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method538(0x800080, var8, 4, var9 + " " + field437[var6]);
						}

						var5++;
					}

					if (var7 == 5 && field403 == 0 && field301 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method538(0x800000, var8, 4, field437[var6]);
						}

						var5++;
					}

					if (var7 == 6 && field403 == 0 && field301 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method538(0, var8, 4, "To " + var9 + ":");
							var4.method538(0x800000, var8, var4.method536("To " + var9) + 12, field437[var6]);
						}

						var5++;
					}

					if (var7 == 8 && (field354 == 0 || field354 == 1 && method79(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method538(0x7E3200, var8, 4, var9 + " " + field437[var6]);
						}

						var5++;
					}
				}
			}

			YYTDUXDR.method577();
			field90 = var5 * 14 + 7;
			if (field90 < 78) {
				field90 = 78;
			}

			method209(field90, field90 - field487 - 77, 77, 0, 463);
			String var13;
			if (field170 == null || field170.field1463 == null) {
				var13 = ZMJDGKKV.method592(field149);
			} else {
				var13 = field170.field1463;
			}

			var4.method538(0, 90, 4, var13 + ":");
			var4.method538(255, 90, var4.method536(var13 + ": ") + 6, field418 + "*");
			YYTDUXDR.method584(0, 479, 77, 0);
		} else {
			method170(0, NPNTBMMX.method393(field488), 0, 0);
		}

		if (field123 && field153 == 2) {
			method160();
		}

		field306.method378(17, 357, field1048);
		field305.method377();
		DJQPOKKS.field589 = field475;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method141(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(ZI[B)Z")
	public final boolean method142(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method143() {
		int var1 = field136.method536("Choose Option");
		for (int var2 = 0; var2 < field332; var2++) {
			int var3 = field136.method536(field429[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field332 * 15 + 21;
		if (field1063 > 4 && field1064 > 4 && field1063 < 516 && field1064 < 338) {
			int var5 = field1063 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1064 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field123 = true;
			field153 = 0;
			field154 = var5;
			field155 = var6;
			field156 = var1;
			field157 = field332 * 15 + 22;
		}

		if (field1063 > 553 && field1064 > 205 && field1063 < 743 && field1064 < 466) {
			int var7 = field1063 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1064 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field123 = true;
			field153 = 1;
			field154 = var7;
			field155 = var8;
			field156 = var1;
			field157 = field332 * 15 + 22;
		}

		if (field1063 > 17 && field1064 > 357 && field1063 < 496 && field1064 < 453) {
			int var9 = field1063 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1064 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field123 = true;
			field153 = 2;
			field154 = var9;
			field155 = var10;
			field156 = var1;
			field157 = field332 * 15 + 22;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method144() {
		if (field259 == 2) {
			for (IYHIHFOL var1 = (IYHIHFOL) field176.method269(); var1 != null; var1 = (IYHIHFOL) field176.method271()) {
				if (var1.field802 > 0) {
					var1.field802--;
				}

				if (var1.field802 != 0) {
					if (var1.field803 > 0) {
						var1.field803--;
					}

					if (var1.field803 == 0 && var1.field809 >= 1 && var1.field810 >= 1 && var1.field809 <= 102 && var1.field810 <= 102 && (var1.field799 < 0 || YECQDWTF.method568(var1.field801, var1.field799))) {
						method181(var1.field809, var1.field801, var1.field799, var1.field807, var1.field800, var1.field808, var1.field810);
						var1.field803 = -1;

						if (var1.field804 == var1.field799 && var1.field804 == -1) {
							var1.method221();
						} else if (var1.field804 == var1.field799 && var1.field805 == var1.field800 && var1.field806 == var1.field801) {
							var1.method221();
						}
					}
				} else if (var1.field804 < 0 || YECQDWTF.method568(var1.field806, var1.field804)) {
					method181(var1.field809, var1.field806, var1.field804, var1.field807, var1.field805, var1.field808, var1.field810);
					var1.method221();
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method145(String arg0) {
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

	@ObfuscatedName("client.k(B)V")
	public final void method146() {
		for (IYHIHFOL var1 = (IYHIHFOL) field176.method269(); var1 != null; var1 = (IYHIHFOL) field176.method271()) {
			if (var1.field802 == -1) {
				var1.field803 = 0;
				method204(var1);
			} else {
				var1.method221();
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method147(boolean arg0) {
		method126();
		field219.method377();
		field179.method371(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field417 == 0) {
			int var4 = var3 / 2 + 80;
			field134.method535(field96.field542, 0x75A9A9, true, var4, var2 / 2);
			int var5 = var3 / 2 - 20;
			field136.method535("Welcome to RuneScape", 0xFFFF00, true, var5, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field180.method371(var6 - 73, var7 - 20);
			field136.method535("New User", 0xFFFFFF, true, var7 + 5, var6);
			int var8 = var2 / 2 + 80;
			field180.method371(var8 - 73, var7 - 20);
			field136.method535("Existing User", 0xFFFFFF, true, var7 + 5, var8);
		}

		if (field417 == 2) {
			int var9 = var3 / 2 - 40;
			if (field101.length() > 0) {
				field136.method535(field101, 0xFFFF00, true, var9 - 15, var2 / 2);
				field136.method535(field102, 0xFFFF00, true, var9, var2 / 2);
				var9 += 30;
			} else {
				field136.method535(field102, 0xFFFF00, true, var9 - 7, var2 / 2);
				var9 += 30;
			}

			field136.method542(var9, 0xFFFFFF, var2 / 2 - 90, true, "Username: " + field149 + (field428 == 0 & field456 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field136.method542(var9, 0xFFFFFF, var2 / 2 - 88, true, "Password: " + ZMJDGKKV.method593(field150) + (field428 == 1 & field456 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field180.method371(var10 - 73, var11 - 20);
				field136.method535("Login", 0xFFFFFF, true, var11 + 5, var10);
				int var12 = var2 / 2 + 80;
				field180.method371(var12 - 73, var11 - 20);
				field136.method535("Cancel", 0xFFFFFF, true, var11 + 5, var12);
			}
		}

		if (field417 == 3) {
			field136.method535("Create a free account", 0xFFFF00, true, var3 / 2 - 60, var2 / 2);
			int var13 = var3 / 2 - 35;
			field136.method535("To create a new account you need to", 0xFFFFFF, true, var13, var2 / 2);
			var13 += 15;
			field136.method535("go back to the main RuneScape webpage", 0xFFFFFF, true, var13, var2 / 2);
			var13 += 15;
			field136.method535("and choose the 'create account'", 0xFFFFFF, true, var13, var2 / 2);
			var13 += 15;
			field136.method535("button near the top of that page.", 0xFFFFFF, true, var13, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field180.method371(var14 - 73, var15 - 20);
			field136.method535("Cancel", 0xFFFFFF, true, var15 + 5, var14);
		}

		field219.method378(202, 171, field1048);

		if (field284) {
			field284 = false;
			field217.method378(128, 0, field1048);
			field218.method378(202, 371, field1048);
			field222.method378(0, 265, field1048);
			field223.method378(562, 265, field1048);
			field224.method378(128, 171, field1048);
			field225.method378(562, 171, field1048);
		}
	}

	@ObfuscatedName("client.a(IIIIIB)V")
	public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field202.method338(arg1, arg4, arg2);
		if (var6 != 0) {
			int var7 = field202.method342(arg1, arg4, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field87.field1231;
			int var12 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			CSTFGNEK var14 = CSTFGNEK.method219(var13);
			if (var14.field529 == -1) {
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
				KWBPZBYX var15 = field95[var14.field529];
				if (var15 != null) {
					int var16 = (var14.field527 * 4 - var15.field906) / 2;
					int var17 = (var14.field533 * 4 - var15.field907) / 2;
					var15.method371(arg4 * 4 + var16 + 48, (104 - arg2 - var14.field533) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field202.method340(arg1, arg4, arg2);
		if (var18 != 0) {
			int var19 = field202.method342(arg1, arg4, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			CSTFGNEK var23 = CSTFGNEK.method219(var22);
			if (var23.field529 != -1) {
				KWBPZBYX var24 = field95[var23.field529];
				if (var24 != null) {
					int var25 = (var23.field527 * 4 - var24.field906) / 2;
					int var26 = (var23.field533 * 4 - var24.field907) / 2;
					var24.method371(arg4 * 4 + var25 + 48, (104 - arg2 - var23.field533) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field87.field1231;
				int var29 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field202.method341(arg1, arg4, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			CSTFGNEK var32 = CSTFGNEK.method219(var31);
			if (var32.field529 != -1) {
				KWBPZBYX var33 = field95[var32.field529];
				if (var33 != null) {
					int var34 = (var32.field527 * 4 - var33.field906) / 2;
					int var35 = (var32.field533 * 4 - var33.field907) / 2;
					var33.method371(arg4 * 4 + var34 + 48, (104 - arg2 - var32.field533) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLPGNBHFUF;)V")
	public final void method149(int arg0, PGNBHFUF arg1) {
		int var3 = arg1.method431(8);
		if (var3 < field263) {
			for (int var4 = var3; var4 < field263; var4++) {
				field447[field446++] = field264[var4];
			}
		}

		if (var3 > field263) {
			signlink.reporterror(field149 + " Too many players");
			throw new RuntimeException("eek");
		}

		field263 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field264[var5];
			ZQANNJZE var7 = field262[var6];
			int var8 = arg1.method431(1);
			if (var8 == 0) {
				field264[field263++] = var6;
				var7.field650 = field456;
			} else {
				int var9 = arg1.method431(2);
				if (var9 == 0) {
					field264[field263++] = var6;
					var7.field650 = field456;
					field266[field265++] = var6;
				} else if (var9 == 1) {
					field264[field263++] = var6;
					var7.field650 = field456;
					int var10 = arg1.method431(3);
					var7.method264(var10, false);
					int var11 = arg1.method431(1);
					if (var11 == 1) {
						field266[field265++] = var6;
					}
				} else if (var9 == 2) {
					field264[field263++] = var6;
					var7.field650 = field456;
					int var12 = arg1.method431(3);
					var7.method264(var12, true);
					int var13 = arg1.method431(3);
					var7.method264(var13, true);
					int var14 = arg1.method431(1);
					if (var14 == 1) {
						field266[field265++] = var6;
					}
				} else if (var9 == 3) {
					field447[field446++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public static final void method150() {
		KFVPSSJH.field824 = false;
		DJQPOKKS.field578 = false;
		field100 = false;
		YECQDWTF.field1383 = false;
		CSTFGNEK.field522 = false;
	}

	@ObfuscatedName("client.a(ZIIIIIIIIIII)Z")
	public final boolean method151(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field81[var14][var15] = 0;
				field381[var14][var15] = 99999999;
			}
		}

		int var16 = arg3;
		int var17 = arg4;
		field81[arg3][arg4] = 99;
		field381[arg3][arg4] = 0;
		byte var18 = 0;
		int var19 = 0;
		field277[var18] = arg3;
		int var35 = var18 + 1;
		field278[var18] = arg4;
		boolean var20 = false;
		int var21 = field277.length;
		int[][] var22 = field254[field148].field12;
		while (var35 != var19) {
			var16 = field277[var19];
			var17 = field278[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg2 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field254[field148].method48(var16, arg9, arg8, arg2, var17, arg10 - 1)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field254[field148].method49(var16, arg2, arg9, arg8, var17, arg10 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg5 != 0 && arg1 != 0 && field254[field148].method50(arg7, arg8, arg1, var17, arg2, var16, arg5)) {
				var20 = true;
				break;
			}

			int var23 = field381[var16][var17] + 1;
			if (var16 > 0 && field81[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field277[var35] = var16 - 1;
				field278[var35] = var17;
				var35 = (var35 + 1) % var21;
				field81[var16 - 1][var17] = 2;
				field381[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field81[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field277[var35] = var16 + 1;
				field278[var35] = var17;
				var35 = (var35 + 1) % var21;
				field81[var16 + 1][var17] = 8;
				field381[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field81[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field277[var35] = var16;
				field278[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field81[var16][var17 - 1] = 1;
				field381[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field81[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field277[var35] = var16;
				field278[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field81[var16][var17 + 1] = 4;
				field381[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field81[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field277[var35] = var16 - 1;
				field278[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field81[var16 - 1][var17 - 1] = 3;
				field381[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field81[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field277[var35] = var16 + 1;
				field278[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field81[var16 + 1][var17 - 1] = 9;
				field381[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field81[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field277[var35] = var16 - 1;
				field278[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field81[var16 - 1][var17 + 1] = 6;
				field381[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field81[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field277[var35] = var16 + 1;
				field278[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field81[var16 + 1][var17 + 1] = 12;
				field381[var16 + 1][var17 + 1] = var23;
			}
		}

		field196 = 0;
		if (!var20) {
			if (arg0) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
						for (int var27 = arg2 - var25; var27 <= arg2 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field381[var26][var27] < var24) {
								var24 = field381[var26][var27];
								var16 = var26;
								var17 = var27;
								field196 = 1;
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
		field277[var28] = var16;
		int var36 = var28 + 1;
		field278[var28] = var17;
		int var29;
		int var30 = var29 = field81[var16][var17];
		while (arg3 != var16 || arg4 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field277[var36] = var16;
				field278[var36++] = var17;
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

			var30 = field81[var16][var17];
		}

		if (var36 <= 0) {
			if (arg6 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field277[var36];
		int var33 = field278[var36];

		if (arg6 == 0) {
			field167.method409(69);
			field167.method410(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field167.method409(159);
			field167.method410(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field167.method409(124);
			field167.method410(var31 + var31 + 3);
		}

		field85 = field277[0];
		field86 = field278[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field167.method436(field277[var36] - var32);
			field167.method437(field278[var36] - var33);
		}

		field167.method444(field465 + var32);
		field167.method437(field1066[5] == 1 ? 1 : 0);
		field167.method443(field466 + var33);
		return true;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method152() {
		field179 = new KWBPZBYX(field82, "titlebox", 0);
		field180 = new KWBPZBYX(field82, "titlebutton", 0);
		field314 = new KWBPZBYX[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field314[var1] = new KWBPZBYX(field82, "runes", var1);
		}

		field171 = new TTWFVYGB(128, 265);
		field172 = new TTWFVYGB(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field171.field1231[var2] = field220.field951[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field172.field1231[var3] = field221.field951[var3];
		}

		field409 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field409[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field409[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field409[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field409[var7 + 192] = 0xFFFFFF;
		}

		field410 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field410[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field410[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field410[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field410[var11 + 192] = 0xFFFFFF;
		}

		field411 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field411[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field411[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field411[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field411[var15 + 192] = 0xFFFFFF;
		}

		field408 = new int[256];
		field296 = new int[32768];
		field297 = new int[32768];
		method77(null);
		field111 = new int[32768];
		field112 = new int[32768];
		method188("Connecting to fileserver", 10);

		if (!field461) {
			field49 = true;
			field461 = true;
			method164(this, 2);
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method153() {
		if (field253 == 0 && field1062 == 1) {
			int var1 = field1063 - 25 - 550;
			int var2 = field1064 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field452 + field105 & 0x7FF;
				int var4 = DJQPOKKS.field587[var3];
				int var5 = DJQPOKKS.field588[var3];
				var4 = (field323 + 256) * var4 >> 8;
				var5 = (field323 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field170.field628 + var6 >> 7;
				int var9 = field170.field629 - var7 >> 7;
				boolean var10 = method151(true, 0, var9, field170.field658[0], field170.field659[0], 0, 1, 0, var8, 0, 0);
				if (var10) {
					field167.method410(var1);
					field167.method410(var2);
					field167.method411(field105);
					field167.method410(57);
					field167.method410(field452);
					field167.method410(field323);
					field167.method410(89);
					field167.method411(field170.field628);
					field167.method411(field170.field629);
					field167.method410(field196);
					field167.method410(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method154() {
		if (field273 > 1) {
			field273--;
		}

		if (field80 > 0) {
			field80--;
		}

		for (int var1 = 0; var1 < 5 && method202(); var1++) {
		}

		if (field340) {
			synchronized (field162.field1419) {
				if (!field348) {
					field162.field1418 = 0;
				} else if (field1062 != 0 || field162.field1418 >= 40) {
					field167.method409(175);
					field167.method410(0);
					int var3 = field167.field1082;
					int var4 = 0;
					for (int var5 = 0; var5 < field162.field1418 && var3 - field167.field1082 < 240; var5++) {
						var4++;
						int var6 = field162.field1415[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field162.field1420[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field162.field1415[var5] == -1 && field162.field1420[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field292 != var7 || field293 != var6) {
							int var9 = var7 - field292;
							field292 = var7;
							int var10 = var6 - field293;
							field293 = var6;

							if (field310 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field167.method411((field310 << 12) + (var9 << 6) + var10);
								field310 = 0;
							} else if (field310 < 8) {
								field167.method413((field310 << 19) + var8 + 0x800000);
								field310 = 0;
							} else {
								field167.method414((field310 << 19) + var8 - 0x40000000);
								field310 = 0;
							}
						} else if (field310 < 2047) {
							field310++;
						}
					}

					field167.method419(field167.field1082 - var3);

					if (var4 >= field162.field1418) {
						field162.field1418 = 0;
					} else {
						field162.field1418 -= var4;
						for (int var11 = 0; var11 < field162.field1418; var11++) {
							field162.field1420[var11] = field162.field1420[var4 + var11];
							field162.field1415[var11] = field162.field1415[var4 + var11];
						}
					}
				}
			}

			if (field1062 != 0) {
				long var12 = (field1065 - field420) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field420 = field1065;
				int var14 = field1064;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1063;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1062 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field167.method409(137);
				field167.method451((var17 << 19) + (var18 << 20) + var16);
			}

			if (field335 > 0) {
				field335--;
			}

			if (field1066[1] == 1 || field1066[2] == 1 || field1066[3] == 1 || field1066[4] == 1) {
				field336 = true;
			}

			if (field336 && field335 <= 0) {
				field335 = 20;
				field336 = false;
				field167.method409(136);
				field167.method445(field104);
				field167.method411(field105);
			}

			if (field1053 && !field249) {
				field249 = true;
				field167.method409(1);
				field167.method410(1);
			}

			if (!field1053 && field249) {
				field249 = false;
				field167.method409(1);
				field167.method410(0);
			}

			method191();
			method144();
			method103();
			field78++;
			if (field78 > 750) {
				method101();
			}

			method159();
			method81();
			method156();
			field441++;

			if (field486 != 0) {
				field485 += 20;
				if (field485 >= 400) {
					field486 = 0;
				}
			}

			if (field451 != 0) {
				field448++;
				if (field448 >= 15) {
					if (field451 == 2) {
						field311 = true;
					}

					if (field451 == 3) {
						field329 = true;
					}

					field451 = 0;
				}
			}

			if (field432 != 0) {
				field195++;

				if (field1056 > field433 + 5 || field1056 < field433 - 5 || field1057 > field434 + 5 || field1057 < field434 - 5) {
					field73 = true;
				}

				if (field1055 == 0) {
					if (field432 == 2) {
						field311 = true;
					}

					if (field432 == 3) {
						field329 = true;
					}

					field432 = 0;

					if (field73 && field195 >= 5) {
						field58 = -1;
						method74();

						if (field58 == field430 && field57 != field431) {
							NPNTBMMX var19 = NPNTBMMX.method393(field430);
							byte var20 = 0;
							if (field346 == 1 && var19.field1029 == 206) {
								var20 = 1;
							}

							if (var19.field1013[field57] <= 0) {
								var20 = 0;
							}

							if (var19.field963) {
								int var21 = field431;
								int var22 = field57;
								var19.field1013[var22] = var19.field1013[var21];
								var19.field1021[var22] = var19.field1021[var21];
								var19.field1013[var21] = -1;
								var19.field1021[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field431;
								int var24 = field57;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method402(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method402(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method402(field57, field431);
							}

							field167.method409(207);
							field167.method443(field57);
							field167.method437(var20);
							field167.method445(field430);
							field167.method445(field431);
						}
					} else if ((field455 == 1 || method92(field332 - 1)) && field332 > 2) {
						method143();
					} else if (field332 > 0) {
						method175(field332 - 1);
					}

					field448 = 10;
					field1062 = 0;
				}
			}

			if (KFVPSSJH.field858 != -1) {
				int var25 = KFVPSSJH.field858;
				int var26 = KFVPSSJH.field859;
				boolean var27 = method151(true, 0, var26, field170.field658[0], field170.field659[0], 0, 0, 0, var25, 0, 0);
				KFVPSSJH.field858 = -1;

				if (var27) {
					field483 = field1063;
					field484 = field1064;
					field486 = 1;
					field485 = 0;
				}
			}

			if (field1062 == 1 && field268 != null) {
				field268 = null;
				field329 = true;
				field1062 = 0;
			}

			method183();

			if (field392 == -1) {
				method153();
				method121();
				method195();
			}

			if (field1055 == 1 || field1062 == 1) {
				field246++;
			}

			if (field237 == 0 && field245 == 0 && field272 == 0) {
				if (field339 > 0) {
					field339--;
				}
			} else if (field339 < 100) {
				field339++;
				if (field339 == 100) {
					if (field237 != 0) {
						field329 = true;
					}

					if (field245 != 0) {
						field311 = true;
					}
				}
			}

			if (field259 == 2) {
				method106();
			}

			if (field259 == 2 && field187) {
				method130();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field138[var28]++;
			}

			method187();
			field1054++;
			if (field1054 > 4500) {
				field80 = 250;
				field1054 -= 500;
				field167.method409(192);
			}

			field396++;
			if (field396 > 500) {
				field396 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field413 += field414;
				}

				if ((var29 & 0x2) == 2) {
					field307 += field308;
				}

				if ((var29 & 0x4) == 4) {
					field351 += field352;
				}
			}

			if (field413 < -50) {
				field414 = 2;
			}

			if (field413 > 50) {
				field414 = -2;
			}

			if (field307 < -55) {
				field308 = 2;
			}

			if (field307 > 55) {
				field308 = -2;
			}

			if (field351 < -40) {
				field352 = 1;
			}

			if (field351 > 40) {
				field352 = -1;
			}

			field283++;
			if (field283 > 500) {
				field283 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field452 += field453;
				}

				if ((var30 & 0x2) == 2) {
					field323 += field324;
				}
			}

			if (field452 < -60) {
				field453 = 2;
			}

			if (field452 > 60) {
				field453 = -2;
			}

			if (field323 < -20) {
				field324 = 1;
			}

			if (field323 > 10) {
				field324 = -1;
			}

			field79++;
			if (field79 > 50) {
				field167.method409(253);
			}

			try {
				if (field43 != null && field167.field1082 > 0) {
					field43.method281(0, field167.field1081, field167.field1082);
					field167.field1082 = 0;
					field79 = 0;
				}
			} catch (IOException var32) {
				method101();
			} catch (Exception var33) {
				method134();
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method155() {
		field75++;
		method165(true);
		method70(true);
		method165(false);
		method70(false);
		method63();
		method179();

		if (!field187) {
			int var1 = field104;
			if (field285 / 256 > var1) {
				var1 = field285 / 256;
			}

			if (field462[4] && field353[4] + 128 > var1) {
				var1 = field353[4] + 128;
			}

			int var2 = field351 + field105 & 0x7FF;
			method122(var1 * 3 + 600, field334, field333, method91(field148, field170.field628, field170.field629) - 50, var2, var1);
		}

		int var3;
		if (field187) {
			var3 = method100();
		} else {
			var3 = method99();
		}

		int var4 = field226;
		int var5 = field227;
		int var6 = field228;
		int var7 = field229;
		int var8 = field230;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field462[var9]) {
				int var10 = (int) (Math.random() * (field83[var9] * 2 + 1) + Math.sin(field464[var9] / 100.0D * field138[var9]) * field353[var9] - field83[var9]);
				if (var9 == 0) {
					field226 += var10;
				}

				if (var9 == 1) {
					field227 += var10;
				}

				if (var9 == 2) {
					field228 += var10;
				}

				if (var9 == 3) {
					field230 = field230 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field229 += var10;
					if (field229 < 128) {
						field229 = 128;
					}

					if (field229 > 383) {
						field229 = 383;
					}
				}
			}
		}

		int var11 = DJQPOKKS.field598;
		POJFANDE.field1157 = true;
		POJFANDE.field1160 = 0;
		POJFANDE.field1158 = field1056 - 4;
		POJFANDE.field1159 = field1057 - 4;
		YYTDUXDR.method579();
		field202.method351(field230, field226, field227, field228, field229, var3);
		field202.method326();
		method89();
		method169();
		method138(var11);
		method163();
		field305.method378(4, 4, field1048);
		field226 = var4;
		field227 = var5;
		field228 = var6;
		field229 = var7;
		field230 = var8;
	}

	@ObfuscatedName("client.x(I)V")
	public final void method156() {
		for (int var1 = -1; var1 < field263; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field261;
			} else {
				var2 = field264[var1];
			}

			ZQANNJZE var3 = field262[var2];
			if (var3 != null && var3.field635 > 0) {
				var3.field635--;
				if (var3.field635 == 0) {
					var3.field652 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field376; var4++) {
			int var5 = field377[var4];
			GBGUDIMT var6 = field375[var5];
			if (var6 != null && var6.field635 > 0) {
				var6.field635--;
				if (var6.field635 == 0) {
					var6.field652 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method157(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field279; var3++) {
				if (field160[var3] == arg0) {
					field279--;
					field311 = true;

					for (int var4 = var3; var4 < field279; var4++) {
						field341[var4] = field341[var4 + 1];
						field251[var4] = field251[var4 + 1];
						field160[var4] = field160[var4 + 1];
					}

					field167.method409(143);
					field167.method416(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILWZSDIPBR;I)V")
	public final void method158(int arg0, int arg1, WZSDIPBR arg2, int arg3) {
		if (field332 < 400) {
			if (arg2.field1308 != null) {
				arg2 = arg2.method526();
			}

			if (arg2 != null && arg2.field1298) {
				String var5 = arg2.field1279;
				if (arg2.field1304 != 0) {
					var5 = var5 + method185(arg2.field1304, field170.field1461) + " (level-" + arg2.field1304 + ")";
				}

				if (field398 == 1) {
					field429[field332] = "Use " + field402 + " with @yel@" + var5;
					field367[field332] = 22;
					field368[field332] = arg1;
					field365[field332] = arg3;
					field366[field332] = arg0;
					field332++;
				} else if (field479 != 1) {
					if (arg2.field1312 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field1312[var6] != null && !arg2.field1312[var6].equalsIgnoreCase("attack")) {
								field429[field332] = arg2.field1312[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field367[field332] = 71;
								}

								if (var6 == 1) {
									field367[field332] = 133;
								}

								if (var6 == 2) {
									field367[field332] = 946;
								}

								if (var6 == 3) {
									field367[field332] = 546;
								}

								if (var6 == 4) {
									field367[field332] = 777;
								}

								field368[field332] = arg1;
								field365[field332] = arg3;
								field366[field332] = arg0;
								field332++;
							}
						}
					}

					if (arg2.field1312 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field1312[var7] != null && arg2.field1312[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field1304 > field170.field1461) {
									var8 = 2000;
								}

								field429[field332] = arg2.field1312[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field367[field332] = var8 + 71;
								}

								if (var7 == 1) {
									field367[field332] = var8 + 133;
								}

								if (var7 == 2) {
									field367[field332] = var8 + 946;
								}

								if (var7 == 3) {
									field367[field332] = var8 + 546;
								}

								if (var7 == 4) {
									field367[field332] = var8 + 777;
								}

								field368[field332] = arg1;
								field365[field332] = arg3;
								field366[field332] = arg0;
								field332++;
							}
						}
					}

					field429[field332] = "Examine @yel@" + var5;
					field367[field332] = 1317;
					field368[field332] = arg1;
					field365[field332] = arg3;
					field366[field332] = arg0;
					field332++;
				} else if ((field481 & 0x2) == 2) {
					field429[field332] = field482 + " @yel@" + var5;
					field367[field332] = 972;
					field368[field332] = arg1;
					field365[field332] = arg3;
					field366[field332] = arg0;
					field332++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method159() {
		for (int var1 = -1; var1 < field263; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field261;
			} else {
				var2 = field264[var1];
			}

			ZQANNJZE var3 = field262[var2];
			if (var3 != null) {
				method82(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method160() {
		int var1 = field154;
		int var2 = field155;
		int var3 = field156;
		int var4 = field157;
		int var5 = 0x5D5447;
		YYTDUXDR.method581(var1, var5, var3, var4, var2);
		YYTDUXDR.method581(var1 + 1, 0, var3 - 2, 16, var2 + 1);
		YYTDUXDR.method582(var3 - 2, 0, var1 + 1, var4 - 19, var2 + 18);
		field136.method538(var5, var2 + 14, var1 + 3, "Choose Option");
		int var6 = field1056;
		int var7 = field1057;
		if (field153 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field153 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field153 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field332; var8++) {
			int var9 = (field332 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field136.method542(var9, var10, var1 + 3, true, field429[var8]);
		}
	}

	@ObfuscatedName("client.b(IIB)V")
	public final void method161(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field437[var4] != null) {
				int var5 = field435[var4];
				int var6 = field487 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field436[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field316 == 0 || field316 == 1 && method79(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field170.field1463)) {
						if (field282 >= 1) {
							field429[field332] = "Report abuse @whi@" + var7;
							field367[field332] = 31;
							field332++;
						}

						field429[field332] = "Add ignore @whi@" + var7;
						field367[field332] = 370;
						field332++;
						field429[field332] = "Add friend @whi@" + var7;
						field367[field332] = 201;
						field332++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field403 == 0 && (var5 == 7 || field301 == 0 || field301 == 1 && method79(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field282 >= 1) {
							field429[field332] = "Report abuse @whi@" + var7;
							field367[field332] = 31;
							field332++;
						}

						field429[field332] = "Add ignore @whi@" + var7;
						field367[field332] = 370;
						field332++;
						field429[field332] = "Add friend @whi@" + var7;
						field367[field332] = 201;
						field332++;
					}

					var3++;
				}

				if (var5 == 4 && (field354 == 0 || field354 == 1 && method79(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field429[field332] = "Accept trade @whi@" + var7;
						field367[field332] = 88;
						field332++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field403 == 0 && field301 < 2) {
					var3++;
				}

				if (var5 == 8 && (field354 == 0 || field354 == 1 && method79(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field429[field332] = "Accept challenge @whi@" + var7;
						field367[field332] = 892;
						field332++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method162() {
		field284 = true;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method163() {
		method75();

		if (field486 == 1) {
			field271[field485 / 100].method511(field483 - 8 - 4, field484 - 8 - 4);
		}

		if (field486 == 2) {
			field271[field485 / 100 + 4].method511(field483 - 8 - 4, field484 - 8 - 4);
			field44++;
			if (field44 > 61) {
				field44 = 0;
				field167.method409(62);
			}
		}

		if (field298 != -1) {
			method67(field441, field298);
			method170(0, NPNTBMMX.method393(field298), 0, 0);
		}

		if (field270 != -1) {
			method67(field441, field270);
			method170(0, NPNTBMMX.method393(field270), 0, 0);
		}

		method176();

		if (!field123) {
			method74();
			method115();
		} else if (field153 == 0) {
			method160();
		}

		if (field325 == 1) {
			field117.method511(472, 296);
		}

		if (field458) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1044 < 30 && field100) {
				var3 = 0xFF0000;
			}

			if (field1044 < 20 && !field100) {
				var3 = 0xFF0000;
			}

			field135.method533(var1, var2, "Fps:" + field1044, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field100) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field100) {
				int var8 = 0xFF0000;
			}

			field135.method533(var1, var2, "Mem:" + var5 + "k", 0xFFFF00);
			var2 += 15;
		}

		if (field273 != 0) {
			int var9 = field273 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field135.method538(0xFFFF00, 329, 4, "System update in: " + var10 + ":0" + var9);
			} else {
				field135.method538(0xFFFF00, 329, 4, "System update in: " + var10 + ":" + var9);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method164(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method164(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method165(boolean arg0) {
		if (field170.field628 >> 7 == field85 && field170.field629 >> 7 == field86) {
			field85 = 0;
		}

		int var2 = field263;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			ZQANNJZE var4;
			int var5;
			if (arg0) {
				var4 = field170;
				var5 = field261 << 14;
			} else {
				var4 = field262[field264[var3]];
				var5 = field264[var3] << 14;
			}

			if (var4 != null && var4.method263()) {
				var4.field1446 = false;
				if ((field100 && field263 > 50 || field263 > 200) && !arg0 && var4.field656 == var4.field615) {
					var4.field1446 = true;
				}

				int var6 = var4.field628 >> 7;
				int var7 = var4.field629 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1451 == null || field456 < var4.field1454 || field456 >= var4.field1455) {
						if ((var4.field628 & 0x7F) == 0x40 && (var4.field629 & 0x7F) == 0x40) {
							if (field379[var6][var7] == field75) {
								continue;
							}

							field379[var6][var7] = field75;
						}

						var4.field1471 = method91(field148, var4.field628, var4.field629);
						field202.method323(var4, var4.field1471, 60, field148, var4.field627, var4.field629, var5, var4.field628, var4.field630);
					} else {
						var4.field1446 = false;
						var4.field1471 = method91(field148, var4.field628, var4.field629);
						field202.method324(var4.field1471, var4.field629, var5, var4.field1468, var4.field630, 60, var4.field1466, field148, var4.field628, var4.field1467, var4.field1469, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method166() {
		while (true) {
			DYWHHFEE var1 = field96.method227();
			if (var1 == null) {
				return;
			}

			if (var1.field601 == 0) {
				POJFANDE.method458(var1.field602, var1.field604);

				if ((field96.method236(var1.field602) & 0x62) != 0) {
					field311 = true;

					if (field275 != -1 || field488 != -1) {
						field329 = true;
					}
				}
			}

			if (var1.field601 == 1 && var1.field604 != null) {
				HVIFHYEW.method284(var1.field604);
			}

			if (var1.field601 == 2 && field200 == var1.field602 && var1.field604 != null) {
				method194(var1.field604, field201);
			}

			if (var1.field601 == 3 && field259 == 1) {
				for (int var2 = 0; var2 < field163.length; var2++) {
					if (field256[var2] == var1.field602) {
						field163[var2] = var1.field604;

						if (var1.field604 == null) {
							field256[var2] = -1;
						}

						break;
					}

					if (field257[var2] == var1.field602) {
						field115[var2] = var1.field604;

						if (var1.field604 == null) {
							field257[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field601 == 93 && field96.method235(var1.field602)) {
				YECQDWTF.method569(field96, new PGNBHFUF(var1.field604));
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method167(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.b(IBLPGNBHFUF;)V")
	public final void method168(int arg0, PGNBHFUF arg1) {
		field446 = 0;
		field265 = 0;
		method66(arg0, arg1);
		method149(arg0, arg1);
		method120(arg0, arg1);
		method78(arg0, arg1);

		for (int var3 = 0; var3 < field446; var3++) {
			int var4 = field447[var3];
			if (field456 != field262[var4].field650) {
				field262[var4] = null;
			}
		}

		if (arg1.field1082 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1082 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field263; var5++) {
			if (field262[field264[var5]] == null) {
				signlink.reporterror(field149 + " null entry in pl list - pos:" + var5 + " size:" + field263);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method169() {
		if (field274 == 2) {
			method178((field317 - field465 << 7) + field320, field319 * 2, (field318 - field466 << 7) + field321);

			if (field113 > -1 && field456 % 20 < 10) {
				field152[0].method511(field113 - 12, field114 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(ILNPNTBMMX;IIZ)V")
	public final void method170(int arg0, NPNTBMMX arg1, int arg2, int arg3) {
		if (arg1.field1011 == 0 && arg1.field978 != null && (!arg1.field1015 || field92 == arg1.field1018 || field70 == arg1.field1018 || field165 == arg1.field1018)) {
			int var5 = YYTDUXDR.field1440;
			int var6 = YYTDUXDR.field1438;
			int var7 = YYTDUXDR.field1441;
			int var8 = YYTDUXDR.field1439;
			YYTDUXDR.method578(arg1.field971 + arg2, arg0, arg2, arg1.field966 + arg0);
			int var9 = arg1.field978.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field968[var10] + arg2;
				int var12 = arg1.field976[var10] + arg0 - arg3;
				NPNTBMMX var13 = NPNTBMMX.method393(arg1.field978[var10]);
				var11 += var13.field988;
				var12 += var13.field975;

				if (var13.field1029 > 0) {
					method96(var13);
				}

				if (var13.field1011 == 0) {
					if (var13.field1014 > var13.field987 - var13.field966) {
						var13.field1014 = var13.field987 - var13.field966;
					}

					if (var13.field1014 < 0) {
						var13.field1014 = 0;
					}

					method170(var12, var13, var11, var13.field1014);

					if (var13.field987 > var13.field966) {
						method209(var13.field987, var13.field1014, var13.field966, var12, var13.field971 + var11);
					}
				} else if (var13.field1011 != 1) {
					if (var13.field1011 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field966; var15++) {
							for (int var16 = 0; var16 < var13.field971; var16++) {
								int var17 = (var13.field986 + 32) * var16 + var11;
								int var18 = (var13.field972 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1002[var14];
									var18 += var13.field961[var14];
								}

								if (var13.field1013[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1013[var14] - 1;
									if (var17 > YYTDUXDR.field1440 - 32 && var17 < YYTDUXDR.field1441 && var18 > YYTDUXDR.field1438 - 32 && var18 < YYTDUXDR.field1439 || field432 != 0 && field431 == var14) {
										int var22 = 0;
										if (field398 == 1 && field399 == var14 && field400 == var13.field1018) {
											var22 = 0xFFFFFF;
										}

										TTWFVYGB var23 = IBYWZZZK.method298(var21, var13.field1021[var14], var22);
										if (var23 != null) {
											if (field432 != 0 && field431 == var14 && field430 == var13.field1018) {
												var19 = field1056 - field433;
												var20 = field1057 - field434;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field195 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method513(128, var17 + var19, var18 + var20);

												if (var18 + var20 < YYTDUXDR.field1438 && arg1.field1014 > 0) {
													int var24 = (YYTDUXDR.field1438 - var18 - var20) * field441 / 3;
													if (var24 > field441 * 10) {
														var24 = field441 * 10;
													}

													if (var24 > arg1.field1014) {
														var24 = arg1.field1014;
													}

													arg1.field1014 -= var24;
													field434 += var24;
												}

												if (var18 + var20 + 32 > YYTDUXDR.field1439 && arg1.field1014 < arg1.field987 - arg1.field966) {
													int var25 = (var18 + var20 + 32 - YYTDUXDR.field1439) * field441 / 3;
													if (var25 > field441 * 10) {
														var25 = field441 * 10;
													}

													if (var25 > arg1.field987 - arg1.field966 - arg1.field1014) {
														var25 = arg1.field987 - arg1.field966 - arg1.field1014;
													}

													arg1.field1014 += var25;
													field434 -= var25;
												}
											} else if (field451 != 0 && field450 == var14 && field449 == var13.field1018) {
												var23.method513(128, var17, var18);
											} else {
												var23.method511(var17, var18);
											}

											if (var23.field1236 == 33 || var13.field1021[var14] != 1) {
												int var26 = var13.field1021[var14];
												field134.method538(0, var18 + var20 + 10, var17 + 1 + var19, method141(var26));
												field134.method538(0xFFFF00, var18 + var20 + 9, var17 + var19, method141(var26));
											}
										}
									}
								} else if (var13.field980 != null && var14 < 20) {
									TTWFVYGB var27 = var13.field980[var14];
									if (var27 != null) {
										var27.method511(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1011 == 3) {
						boolean var28 = false;
						if (field165 == var13.field1018 || field70 == var13.field1018 || field92 == var13.field1018) {
							var28 = true;
						}

						int var29;
						if (method119(var13)) {
							var29 = var13.field1000;
							if (var28 && var13.field974 != 0) {
								var29 = var13.field974;
							}
						} else {
							var29 = var13.field992;
							if (var28 && var13.field985 != 0) {
								var29 = var13.field985;
							}
						}

						if (var13.field979 == 0) {
							if (var13.field1020) {
								YYTDUXDR.method581(var11, var29, var13.field971, var13.field966, var12);
							} else {
								YYTDUXDR.method582(var13.field971, var29, var11, var13.field966, var12);
							}
						} else if (var13.field1020) {
							YYTDUXDR.method580(var29, 256 - (var13.field979 & 0xFF), var11, var12, var13.field966, var13.field971);
						} else {
							YYTDUXDR.method583(var13.field971, var13.field966, var12, var29, var11, 256 - (var13.field979 & 0xFF));
						}
					} else if (var13.field1011 == 4) {
						XUAWPLCH var30 = var13.field1005;
						String var31 = var13.field997;
						boolean var32 = false;
						if (field165 == var13.field1018 || field70 == var13.field1018 || field92 == var13.field1018) {
							var32 = true;
						}

						int var33;
						if (method119(var13)) {
							var33 = var13.field1000;
							if (var32 && var13.field974 != 0) {
								var33 = var13.field974;
							}

							if (var13.field998.length() > 0) {
								var31 = var13.field998;
							}
						} else {
							var33 = var13.field992;
							if (var32 && var13.field985 != 0) {
								var33 = var13.field985;
							}
						}

						if (var13.field1030 == 6 && field369) {
							var31 = "Please wait...";
							var33 = var13.field992;
						}

						if (YYTDUXDR.field1436 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1376 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method139(method117(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method139(method117(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method139(method117(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method139(method117(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method139(method117(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field1009) {
								var30.method535(var41, var33, var13.field962, var34, var13.field971 / 2 + var11);
							} else {
								var30.method542(var34, var33, var11, var13.field962, var41);
							}

							var34 += var30.field1376;
						}
					} else if (var13.field1011 == 5) {
						TTWFVYGB var42;
						if (method119(var13)) {
							var42 = var13.field977;
						} else {
							var42 = var13.field1003;
						}

						if (var42 != null) {
							var42.method511(var11, var12);
						}
					} else if (var13.field1011 == 6) {
						int var43 = DJQPOKKS.field583;
						int var44 = DJQPOKKS.field584;
						DJQPOKKS.field583 = var13.field971 / 2 + var11;
						DJQPOKKS.field584 = var13.field966 / 2 + var12;
						int var45 = DJQPOKKS.field587[var13.field1027] * var13.field1026 >> 16;
						int var46 = DJQPOKKS.field588[var13.field1027] * var13.field1026 >> 16;
						boolean var47 = method119(var13);
						int var48;
						if (var47) {
							var48 = var13.field970;
						} else {
							var48 = var13.field969;
						}

						POJFANDE var49;
						if (var48 == -1) {
							var49 = var13.method399(var47, -1, -1);
						} else {
							KIZBPSHZ var50 = KIZBPSHZ.field888[var48];
							var49 = var13.method399(var47, var50.field890[var13.field990], var50.field891[var13.field990]);
						}

						if (var49 != null) {
							var49.method481(0, var13.field1028, 0, var13.field1027, 0, var45, var46);
						}

						DJQPOKKS.field583 = var43;
						DJQPOKKS.field584 = var44;
					} else {
						if (var13.field1011 == 7) {
							XUAWPLCH var51 = var13.field1005;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field966; var53++) {
								for (int var54 = 0; var54 < var13.field971; var54++) {
									if (var13.field1013[var52] > 0) {
										IBYWZZZK var55 = IBYWZZZK.method290(var13.field1013[var52] - 1);
										String var56 = var55.field747;
										if (var55.field768 || var13.field1021[var52] != 1) {
											var56 = var56 + " x" + method182(var13.field1021[var52]);
										}

										int var57 = (var13.field986 + 115) * var54 + var11;
										int var58 = (var13.field972 + 12) * var53 + var12;
										if (var13.field1009) {
											var51.method535(var56, var13.field992, var13.field962, var58, var13.field971 / 2 + var57);
										} else {
											var51.method542(var58, var13.field992, var57, var13.field962, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1011 == 8 && (field237 == var13.field1018 || field245 == var13.field1018 || field272 == var13.field1018) && field339 == 100) {
							int var59 = 0;
							int var60 = 0;
							XUAWPLCH var61 = field135;
							String var62 = var13.field997;
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

								int var65 = var61.method536(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1376 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field971 + var11 - var59 - 5;
							int var67 = var13.field966 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field971 + arg2) {
								var66 = arg1.field971 + arg2 - var59;
							}

							if (var60 + var67 > arg1.field966 + arg0) {
								var67 = arg1.field966 + arg0 - var60;
							}

							YYTDUXDR.method581(var66, 0xFFFFA0, var59, var60, var67);
							YYTDUXDR.method582(var59, 0, var66, var60, var67);
							String var68 = var13.field997;
							int var69 = var61.field1376 + var67 + 2;
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

								var61.method542(var69, 0, var66 + 3, false, var71);
								var69 += var61.field1376 + 1;
							}
						}
					}
				}
			}

			YYTDUXDR.method578(var7, var6, var5, var8);
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method171(String arg0) throws IOException {
		if (field299) {
			if (field416 != null) {
				try {
					field416.close();
				} catch (Exception var4) {
				}

				field416 = null;
			}

			field416 = method201(43595);
			field416.setSoTimeout(10000);
			InputStream var2 = field416.getInputStream();
			OutputStream var3 = field416.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method172(long arg0) {
		if (arg0 != 0L) {
			if (field279 >= 100 && field194 != 1) {
				method65(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field279 >= 200) {
				method65(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = ZMJDGKKV.method592(ZMJDGKKV.method589(arg0));
				for (int var4 = 0; var4 < field279; var4++) {
					if (field160[var4] == arg0) {
						method65(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field46; var5++) {
					if (field132[var5] == arg0) {
						method65(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field170.field1463)) {
					field341[field279] = var3;
					field160[field279] = arg0;
					field251[field279] = 0;
					field279++;
					field311 = true;
					field167.method409(221);
					field167.method416(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public void method173() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field372);

		if (field96 != null) {
			System.out.println("Od-cycle:" + field96.field571);
		}

		System.out.println("loop-cycle:" + field456);
		System.out.println("draw-cycle:" + field151);
		System.out.println("ptype:" + field77);
		System.out.println("psize:" + field76);

		if (field43 != null) {
			field43.method282();
		}

		field1045 = true;
	}

	@ObfuscatedName("client.b(Z)Ljava/awt/Component;")
	public final Component method174() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1051 != null) {
			return field1051;
		}

		return this;
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method175(int arg0) {
		if (arg0 >= 0) {
			int var2 = field365[arg0];
			int var3 = field366[arg0];
			int var4 = field367[arg0];
			int var5 = field368[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field345 != 0 && var4 != 1961) {
				field345 = 0;
				field329 = true;
			}

			if (var4 == 177) {
				field167.method409(181);
				field167.method411(var5);
				field167.method445(var2);
				field167.method444(var3);
				field448 = 0;
				field449 = var3;
				field450 = var2;
				field451 = 2;
				if (NPNTBMMX.method393(var3).field1006 == field270) {
					field451 = 1;
				}

				if (NPNTBMMX.method393(var3).field1006 == field275) {
					field451 = 3;
				}
			}

			if (var4 == 716) {
				method94(var3, var5, var2);
				field167.method409(3);
				field167.method445(field466 + var3);
				field167.method445(var5 >> 14 & 0x7FFF);
				field167.method444(field465 + var2);
			}

			if (var4 == 537) {
				field167.method409(51);
				field167.method444(var3);
				field167.method445(var5);
				field167.method411(var2);
				field448 = 0;
				field449 = var3;
				field450 = var2;
				field451 = 2;
				if (NPNTBMMX.method393(var3).field1006 == field270) {
					field451 = 1;
				}

				if (NPNTBMMX.method393(var3).field1006 == field275) {
					field451 = 3;
				}
			}

			if (var4 == 996) {
				field167.method409(224);
				field167.method443(var5);
				field167.method443(var2);
				field167.method411(var3);
				field448 = 0;
				field449 = var3;
				field450 = var2;
				field451 = 2;
				if (NPNTBMMX.method393(var3).field1006 == field270) {
					field451 = 1;
				}

				if (NPNTBMMX.method393(var3).field1006 == field275) {
					field451 = 3;
				}
			}

			if (var4 == 444) {
				NPNTBMMX var6 = NPNTBMMX.method393(var3);
				field479 = 1;
				field480 = var3;
				field481 = var6.field1017;
				field398 = 0;
				field311 = true;
				String var7 = var6.field967;
				if (var7.indexOf(" ") != -1) {
					var7 = var7.substring(0, var7.indexOf(" "));
				}

				String var8 = var6.field967;
				if (var8.indexOf(" ") != -1) {
					var8 = var8.substring(var8.indexOf(" ") + 1);
				}

				field482 = var7 + " " + var6.field1022 + " " + var8;

				if (field481 == 16) {
					field311 = true;
					field342 = 3;
					field355 = true;
				}
			} else {
				if (var4 == 208) {
					NPNTBMMX var9 = NPNTBMMX.method393(var3);
					boolean var10 = true;
					if (var9.field1029 > 0) {
						var10 = method131(var9);
					}

					if (var10) {
						field167.method409(75);
						field167.method411(var3);
					}
				}

				if (var4 == 201 || var4 == 370 || var4 == 761 || var4 == 629) {
					String var11 = field429[arg0];
					int var12 = var11.indexOf("@whi@");
					if (var12 != -1) {
						long var13 = ZMJDGKKV.method588(var11.substring(var12 + 5).trim());
						if (var4 == 201) {
							method172(var13);
						}

						if (var4 == 370) {
							method128(var13);
						}

						if (var4 == 761) {
							method157(var13);
						}

						if (var4 == 629) {
							method95(var13);
						}
					}
				}

				if (var4 == 525) {
					ZQANNJZE var15 = field262[var5];
					if (var15 != null) {
						method151(false, 1, var15.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var15.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field425 += var5;
						if (field425 >= 77) {
							field167.method409(42);
							field167.method414(0);
							field425 = 0;
						}

						field167.method409(84);
						field167.method444(var5);
					}
				}

				if (var4 == 73) {
					field167.method409(95);
					field167.method411(var2);
					field167.method444(var5);
					field167.method411(var3);
					field448 = 0;
					field449 = var3;
					field450 = var2;
					field451 = 2;
					if (NPNTBMMX.method393(var3).field1006 == field270) {
						field451 = 1;
					}

					if (NPNTBMMX.method393(var3).field1006 == field275) {
						field451 = 3;
					}
				}

				if (var4 == 284 && !field369) {
					field167.method409(20);
					field167.method411(var3);
					field369 = true;
				}

				if (var4 == 1660) {
					field231++;
					if (field231 >= 146) {
						field167.method409(96);
						field167.method413(0x4C78E5);
						field231 = 0;
					}

					method94(var3, var5, var2);
					field167.method409(64);
					field167.method445(field466 + var3);
					field167.method444(field465 + var2);
					field167.method444(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 994) {
					boolean var16 = method151(false, 0, var3, field170.field658[0], field170.field659[0], 0, 2, 0, var2, 0, 0);
					if (!var16) {
						method151(false, 1, var3, field170.field658[0], field170.field659[0], 1, 2, 0, var2, 0, 0);
					}

					field483 = field1063;
					field484 = field1064;
					field486 = 2;
					field485 = 0;
					field167.method409(142);
					field167.method444(field480);
					field167.method445(var5);
					field167.method444(field466 + var3);
					field167.method411(field465 + var2);
				}

				if (var4 == 178) {
					method200(field488);
					field488 = -1;
					field329 = true;
				}

				if (var4 == 479) {
					ZQANNJZE var18 = field262[var5];
					if (var18 != null) {
						method151(false, 1, var18.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var18.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field130++;
						if (field130 >= 135) {
							field167.method409(220);
							field167.method411(7858);
							field130 = 0;
						}

						field167.method409(8);
						field167.method443(var5);
					}
				}

				if (var4 == 1317) {
					GBGUDIMT var19 = field375[var5];
					if (var19 != null) {
						WZSDIPBR var20 = var19.field699;
						if (var20.field1308 != null) {
							var20 = var20.method526();
						}

						if (var20 != null) {
							String var21;
							if (var20.field1301 == null) {
								var21 = "It's a " + var20.field1279 + ".";
							} else {
								var21 = new String(var20.field1301);
							}

							method65(0, "", var21);
						}
					}
				}

				if (var4 == 821) {
					boolean var22 = method151(false, 0, var3, field170.field658[0], field170.field659[0], 0, 2, 0, var2, 0, 0);
					if (!var22) {
						method151(false, 1, var3, field170.field658[0], field170.field659[0], 1, 2, 0, var2, 0, 0);
					}

					field483 = field1063;
					field484 = field1064;
					field486 = 2;
					field485 = 0;
					field167.method409(174);
					field167.method444(field465 + var2);
					field167.method443(field466 + var3);
					field167.method411(var5);
				}

				if (var4 == 664) {
					field167.method409(107);
					field167.method443(var5);
					field167.method444(var3);
					field167.method445(var2);
					field448 = 0;
					field449 = var3;
					field450 = var2;
					field451 = 2;
					if (NPNTBMMX.method393(var3).field1006 == field270) {
						field451 = 1;
					}

					if (NPNTBMMX.method393(var3).field1006 == field275) {
						field451 = 3;
					}
				}

				if (var4 == 668 && method94(var3, var5, var2)) {
					field167.method409(198);
					field167.method444(var5 >> 14 & 0x7FFF);
					field167.method445(field465 + var2);
					field167.method411(field466 + var3);
					field167.method411(field480);
				}

				if (var4 == 206) {
					field167.method409(141);
					field167.method443(var5);
					field167.method445(var3);
					field167.method444(var2);
					field167.method411(field480);
					field448 = 0;
					field449 = var3;
					field450 = var2;
					field451 = 2;
					if (NPNTBMMX.method393(var3).field1006 == field270) {
						field451 = 1;
					}

					if (NPNTBMMX.method393(var3).field1006 == field275) {
						field451 = 3;
					}
				}

				if (var4 == 839) {
					if ((var5 & 0x3) == 0) {
						field197++;
					}

					if (field197 >= 71) {
						field167.method409(57);
						field167.method414(0);
						field197 = 0;
					}

					field167.method409(165);
					field167.method411(var5);
					field167.method444(var2);
					field167.method411(var3);
					field448 = 0;
					field449 = var3;
					field450 = var2;
					field451 = 2;
					if (NPNTBMMX.method393(var3).field1006 == field270) {
						field451 = 1;
					}

					if (NPNTBMMX.method393(var3).field1006 == field275) {
						field451 = 3;
					}
				}

				if (var4 == 31) {
					String var24 = field429[arg0];
					int var25 = var24.indexOf("@whi@");
					if (var25 != -1) {
						if (field270 == -1) {
							method206();
							field47 = var24.substring(var25 + 5).trim();
							field424 = false;
							field350 = field270 = NPNTBMMX.field989;
						} else {
							method65(0, "", "Please close the interface you have open before using 'report abuse'");
						}
					}
				}

				if (var4 == 572) {
					ZQANNJZE var26 = field262[var5];
					if (var26 != null) {
						method151(false, 1, var26.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var26.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field167.method409(130);
						field167.method411(var5);
					}
				}

				if (var4 == 567) {
					boolean var27 = method151(false, 0, var3, field170.field658[0], field170.field659[0], 0, 2, 0, var2, 0, 0);
					if (!var27) {
						method151(false, 1, var3, field170.field658[0], field170.field659[0], 1, 2, 0, var2, 0, 0);
					}

					field483 = field1063;
					field484 = field1064;
					field486 = 2;
					field485 = 0;
					field167.method409(34);
					field167.method411(field401);
					field167.method443(var5);
					field167.method444(field465 + var2);
					field167.method445(field466 + var3);
					field167.method445(field400);
					field167.method443(field399);
				}

				if (var4 == 358) {
					field89++;
					if (field89 >= 73) {
						field167.method409(27);
						field167.method414(0);
						field89 = 0;
					}

					field167.method409(118);
					field167.method443(var5);
					field167.method445(var2);
					field167.method445(var3);
					field448 = 0;
					field449 = var3;
					field450 = var2;
					field451 = 2;
					if (NPNTBMMX.method393(var3).field1006 == field270) {
						field451 = 1;
					}

					if (NPNTBMMX.method393(var3).field1006 == field275) {
						field451 = 3;
					}
				}

				if (var4 == 88 || var4 == 892) {
					String var29 = field429[arg0];
					int var30 = var29.indexOf("@whi@");
					if (var30 != -1) {
						var29 = var29.substring(var30 + 5).trim();
						String var31 = ZMJDGKKV.method592(ZMJDGKKV.method589(ZMJDGKKV.method588(var29)));
						boolean var32 = false;
						for (int var33 = 0; var33 < field263; var33++) {
							ZQANNJZE var34 = field262[field264[var33]];
							if (var34 != null && var34.field1463 != null && var34.field1463.equalsIgnoreCase(var31)) {
								method151(false, 1, var34.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var34.field658[0], 0, 0);

								if (var4 == 88) {
									field425 += var5;
									if (field425 >= 77) {
										field167.method409(42);
										field167.method414(0);
										field425 = 0;
									}

									field167.method409(84);
									field167.method444(field264[var33]);
								}

								if (var4 == 892) {
									field167.method409(161);
									field167.method445(field264[var33]);
								}

								var32 = true;
								break;
							}
						}

						if (!var32) {
							method65(0, "", "Unable to find " + var31);
						}
					}
				}

				if (var4 == 71) {
					GBGUDIMT var35 = field375[var5];
					if (var35 != null) {
						method151(false, 1, var35.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var35.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field167.method409(48);
						field167.method444(var5);
					}
				}

				if (var4 == 635) {
					boolean var36 = method151(false, 0, var3, field170.field658[0], field170.field659[0], 0, 2, 0, var2, 0, 0);
					if (!var36) {
						method151(false, 1, var3, field170.field658[0], field170.field659[0], 1, 2, 0, var2, 0, 0);
					}

					field483 = field1063;
					field484 = field1064;
					field486 = 2;
					field485 = 0;
					field167.method409(86);
					field167.method445(field465 + var2);
					field167.method445(var5);
					field167.method443(field466 + var3);
				}

				if (var4 == 8) {
					ZQANNJZE var38 = field262[var5];
					if (var38 != null) {
						method151(false, 1, var38.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var38.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field167.method409(219);
						field167.method443(field480);
						field167.method443(var5);
					}
				}

				if (var4 == 709) {
					if (field123) {
						field202.method350(var3 - 4, var2 - 4);
					} else {
						field202.method350(field1064 - 4, field1063 - 4);
					}
				}

				if (var4 == 330) {
					boolean var39 = method151(false, 0, var3, field170.field658[0], field170.field659[0], 0, 2, 0, var2, 0, 0);
					if (!var39) {
						method151(false, 1, var3, field170.field658[0], field170.field659[0], 1, 2, 0, var2, 0, 0);
					}

					field483 = field1063;
					field484 = field1064;
					field486 = 2;
					field485 = 0;
					field185 += field466;
					if (field185 >= 52) {
						field167.method409(179);
						field185 = 0;
					}

					field167.method409(190);
					field167.method445(var5);
					field167.method444(field465 + var2);
					field167.method444(field466 + var3);
				}

				if (var4 == 642 && method94(var3, var5, var2)) {
					field167.method409(114);
					field167.method443(field401);
					field167.method443(field466 + var3);
					field167.method444(field465 + var2);
					field167.method411(field400);
					field167.method445(field399);
					field167.method443(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 777) {
					GBGUDIMT var41 = field375[var5];
					if (var41 != null) {
						method151(false, 1, var41.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var41.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field203++;
						if (field203 >= 120) {
							field167.method409(97);
							field167.method413(0x1C0081);
							field203 = 0;
						}

						field167.method409(92);
						field167.method444(var5);
					}
				}

				if (var4 == 885) {
					if ((var5 & 0x3) == 0) {
						field313++;
					}

					if (field313 >= 98) {
						field167.method409(170);
						field167.method414(0);
						field313 = 0;
					}

					method94(var3, var5, var2);
					field167.method409(37);
					field167.method443(field466 + var3);
					field167.method443(field465 + var2);
					field167.method411(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 133) {
					GBGUDIMT var42 = field375[var5];
					if (var42 != null) {
						method151(false, 1, var42.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var42.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;

						if ((var5 & 0x3) == 0) {
							field71++;
						}

						if (field71 >= 146) {
							field167.method409(164);
							field167.method410(201);
							field71 = 0;
						}

						field167.method409(218);
						field167.method445(var5);
					}
				}

				if (var4 == 1516) {
					IBYWZZZK var43 = IBYWZZZK.method290(var5);
					NPNTBMMX var44 = NPNTBMMX.method393(var3);
					String var45;
					if (var44 != null && var44.field1021[var2] >= 100000) {
						var45 = var44.field1021[var2] + " x " + var43.field747;
					} else if (var43.field782 == null) {
						var45 = "It's a " + var43.field747 + ".";
					} else {
						var45 = new String(var43.field782);
					}

					method65(0, "", var45);
				}

				if (var4 == 993) {
					method94(var3, var5, var2);
					field167.method409(126);
					field167.method445(field465 + var2);
					field167.method443(var5 >> 14 & 0x7FFF);
					field167.method411(field466 + var3);
				}

				if (var4 == 105) {
					field167.method409(75);
					field167.method411(var3);
					NPNTBMMX var46 = NPNTBMMX.method393(var3);
					if (var46.field964 != null && var46.field964[0][0] == 5) {
						int var47 = var46.field964[0][1];
						if (field322[var47] != var46.field960[0]) {
							field322[var47] = var46.field960[0];
							method208(var47);
							field311 = true;
						}
					}
				}

				if (var4 == 906) {
					field167.method409(40);
					field167.method445(var3);
					field167.method444(var2);
					field167.method445(var5);
					field448 = 0;
					field449 = var3;
					field450 = var2;
					field451 = 2;
					if (NPNTBMMX.method393(var3).field1006 == field270) {
						field451 = 1;
					}

					if (NPNTBMMX.method393(var3).field1006 == field275) {
						field451 = 3;
					}
				}

				if (var4 == 946) {
					GBGUDIMT var48 = field375[var5];
					if (var48 != null) {
						method151(false, 1, var48.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var48.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field167.method409(243);
						field167.method445(var5);
					}
				}

				if (var4 == 1474) {
					int var49 = var5 >> 14 & 0x7FFF;
					CSTFGNEK var50 = CSTFGNEK.method219(var49);
					String var51;
					if (var50.field508 == null) {
						var51 = "It's a " + var50.field501 + ".";
					} else {
						var51 = new String(var50.field508);
					}

					method65(0, "", var51);
				}

				if (var4 == 127) {
					field167.method409(204);
					field167.method444(var2);
					field167.method444(var5);
					field167.method444(var3);
					field448 = 0;
					field449 = var3;
					field450 = var2;
					field451 = 2;
					if (NPNTBMMX.method393(var3).field1006 == field270) {
						field451 = 1;
					}

					if (NPNTBMMX.method393(var3).field1006 == field275) {
						field451 = 3;
					}
				}

				if (var4 == 368) {
					method206();
				}

				if (var4 == 646) {
					ZQANNJZE var52 = field262[var5];
					if (var52 != null) {
						method151(false, 1, var52.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var52.field658[0], 0, 0);
						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field167.method409(161);
						field167.method445(var5);
					}
				}

				if (var4 == 407) {
					field167.method409(75);
					field167.method411(var3);
					NPNTBMMX var53 = NPNTBMMX.method393(var3);
					if (var53.field964 != null && var53.field964[0][0] == 5) {
						int var54 = var53.field964[0][1];
						field322[var54] = 1 - field322[var54];
						method208(var54);
						field311 = true;
					}
				}

				if (var4 == 492) {
					method94(var3, var5, var2);
					field167.method409(167);
					field167.method411(var5 >> 14 & 0x7FFF);
					field167.method445(field465 + var2);
					field167.method411(field466 + var3);
				}

				if (var4 == 277) {
					field167.method409(133);
					field167.method444(var2);
					field167.method443(var5);
					field167.method445(var3);
					field448 = 0;
					field449 = var3;
					field450 = var2;
					field451 = 2;
					if (NPNTBMMX.method393(var3).field1006 == field270) {
						field451 = 1;
					}

					if (NPNTBMMX.method393(var3).field1006 == field275) {
						field451 = 3;
					}
				}

				if (var4 == 728) {
					field398 = 1;
					field399 = var2;
					field400 = var3;
					field401 = var5;
					field402 = IBYWZZZK.method290(var5).field747;
					field479 = 0;
					field311 = true;
				} else {
					if (var4 == 546) {
						GBGUDIMT var55 = field375[var5];
						if (var55 != null) {
							method151(false, 1, var55.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var55.field658[0], 0, 0);
							field483 = field1063;
							field484 = field1064;
							field486 = 2;
							field485 = 0;
							field167.method409(248);
							field167.method411(var5);
						}
					}

					if (var4 == 835) {
						field167.method409(235);
						field167.method445(var5);
						field167.method444(var2);
						field167.method411(field400);
						field167.method411(var3);
						field167.method443(field401);
						field167.method444(field399);
						field448 = 0;
						field449 = var3;
						field450 = var2;
						field451 = 2;
						if (NPNTBMMX.method393(var3).field1006 == field270) {
							field451 = 1;
						}

						if (NPNTBMMX.method393(var3).field1006 == field275) {
							field451 = 3;
						}
					}

					if (var4 == 641) {
						boolean var56 = method151(false, 0, var3, field170.field658[0], field170.field659[0], 0, 2, 0, var2, 0, 0);
						if (!var56) {
							method151(false, 1, var3, field170.field658[0], field170.field659[0], 1, 2, 0, var2, 0, 0);
						}

						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field167.method409(225);
						field167.method411(var5);
						field167.method445(field465 + var2);
						field167.method443(field466 + var3);
					}

					if (var4 == 22) {
						GBGUDIMT var58 = field375[var5];
						if (var58 != null) {
							method151(false, 1, var58.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var58.field658[0], 0, 0);
							field483 = field1063;
							field484 = field1064;
							field486 = 2;
							field485 = 0;
							field167.method409(128);
							field167.method444(field401);
							field167.method411(field400);
							field167.method444(field399);
							field167.method445(var5);
						}
					}

					if (var4 == 1907) {
						IBYWZZZK var59 = IBYWZZZK.method290(var5);
						String var60;
						if (var59.field782 == null) {
							var60 = "It's a " + var59.field747 + ".";
						} else {
							var60 = new String(var59.field782);
						}

						method65(0, "", var60);
					}

					if (var4 == 992) {
						boolean var61 = method151(false, 0, var3, field170.field658[0], field170.field659[0], 0, 2, 0, var2, 0, 0);
						if (!var61) {
							method151(false, 1, var3, field170.field658[0], field170.field659[0], 1, 2, 0, var2, 0, 0);
						}

						field483 = field1063;
						field484 = field1064;
						field486 = 2;
						field485 = 0;
						field167.method409(31);
						field167.method443(field465 + var2);
						field167.method411(var5);
						field167.method411(field466 + var3);
					}

					if (var4 == 749) {
						ZQANNJZE var63 = field262[var5];
						if (var63 != null) {
							method151(false, 1, var63.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var63.field658[0], 0, 0);
							field483 = field1063;
							field484 = field1064;
							field486 = 2;
							field485 = 0;
							field167.method409(180);
							field167.method443(var5);
						}
					}

					if (var4 == 246) {
						String var64 = field429[arg0];
						int var65 = var64.indexOf("@whi@");
						if (var65 != -1) {
							long var66 = ZMJDGKKV.method588(var64.substring(var65 + 5).trim());
							int var68 = -1;
							for (int var69 = 0; var69 < field279; var69++) {
								if (field160[var69] == var66) {
									var68 = var69;
									break;
								}
							}

							if (var68 != -1 && field251[var68] > 0) {
								field329 = true;
								field345 = 0;
								field243 = true;
								field328 = "";
								field74 = 3;
								field174 = field160[var68];
								field312 = "Enter message to send to " + field341[var68];
							}
						}
					}

					if (var4 == 972) {
						GBGUDIMT var70 = field375[var5];
						if (var70 != null) {
							method151(false, 1, var70.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var70.field658[0], 0, 0);
							field483 = field1063;
							field484 = field1064;
							field486 = 2;
							field485 = 0;
							field167.method409(193);
							field167.method445(var5);
							field167.method445(field480);
						}
					}

					if (var4 == 326) {
						ZQANNJZE var71 = field262[var5];
						if (var71 != null) {
							method151(false, 1, var71.field659[0], field170.field658[0], field170.field659[0], 1, 2, 0, var71.field658[0], 0, 0);
							field483 = field1063;
							field484 = field1064;
							field486 = 2;
							field485 = 0;
							field167.method409(99);
							field167.method444(field400);
							field167.method443(field401);
							field167.method444(field399);
							field167.method445(var5);
						}
					}

					field398 = 0;
					field479 = 0;
					field311 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method176() {
		field397 = 0;
		int var1 = (field170.field628 >> 7) + field465;
		int var2 = (field170.field629 >> 7) + field466;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field397 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field397 = 1;
		}

		if (field397 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field397 = 0;
		}
	}

	@ObfuscatedName("client.a(ILEGCNSKZO;I)V")
	public final void method177(EGCNSKZO arg0, int arg1) {
		method178(arg0.field628, arg1, arg0.field629);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method178(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method91(field148, arg0, arg2) - arg1;
			arg0 -= field226;
			var4 -= field227;
			arg2 -= field228;
			int var5 = POJFANDE.field1162[field229];
			int var6 = POJFANDE.field1163[field229];
			int var7 = POJFANDE.field1162[field230];
			int var8 = POJFANDE.field1163[field230];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field113 = (var9 << 9) / arg2 + DJQPOKKS.field583;
				field114 = (var11 << 9) / arg2 + DJQPOKKS.field584;
			} else {
				field113 = -1;
				field114 = -1;
			}
		} else {
			field113 = -1;
			field114 = -1;
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method179() {
		for (KACHDVNZ var1 = (KACHDVNZ) field110.method269(); var1 != null; var1 = (KACHDVNZ) field110.method271()) {
			if (field148 != var1.field814 || var1.field820) {
				var1.method221();
			} else if (field456 >= var1.field819) {
				var1.method307(field441);

				if (var1.field820) {
					var1.method221();
				} else {
					field202.method323(var1, var1.field817, 60, var1.field814, false, var1.field816, -1, var1.field815, 0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;Ljava/lang/String;III)LQDHHNYHL;")
	public final QDHHNYHL method180(String arg0, String arg1, int arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field387[0] != null) {
				var6 = field387[0].method491(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field344.reset();
			field344.update(var6);
			int var8 = (int) field344.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new QDHHNYHL(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method188("Requesting " + arg1, arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method171(arg0 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				PGNBHFUF var16 = new PGNBHFUF(var15);
				var16.field1082 = 3;
				int var17 = var16.method424() + 6;
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
						method188("Loading " + arg1 + " - " + var22 + "%", arg4);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field387[0] != null) {
						field387[0].method492(var6.length, var6, arg3);
					}
				} catch (Exception var28) {
					field387[0] = null;
				}

				if (var6 != null) {
					field344.reset();
					field344.update(var6);
					int var23 = (int) field344.getValue();
					if (arg2 != var23) {
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
						method188("Game updated - please reload page", arg4);
						var25 = 10;
					} else {
						method188(var11 + " - Retrying in " + var25, arg4);
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

				field299 = !field299;
			}
		}

		return new QDHHNYHL(var6);
	}

	@ObfuscatedName("client.a(IIIIIBII)V")
	public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg6 >= 1 && arg0 <= 102 && arg6 <= 102) {
			if (field100 && field148 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg5 == 0) {
				var8 = field202.method338(arg3, arg0, arg6);
			}

			if (arg5 == 1) {
				var8 = field202.method339(arg6, arg0, arg3);
			}

			if (arg5 == 2) {
				var8 = field202.method340(arg3, arg0, arg6);
			}

			if (arg5 == 3) {
				var8 = field202.method341(arg3, arg0, arg6);
			}

			if (var8 != 0) {
				int var12 = field202.method342(arg3, arg0, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg5 == 0) {
					field202.method329(arg6, arg3, arg0);
					CSTFGNEK var16 = CSTFGNEK.method219(var13);
					if (var16.field491) {
						field254[arg3].method44(var14, arg0, arg6, var15, var16.field499);
					}
				}

				if (arg5 == 1) {
					field202.method330(arg6, arg3, arg0);
				}

				if (arg5 == 2) {
					field202.method331(arg3, arg0, arg6);
					CSTFGNEK var17 = CSTFGNEK.method219(var13);
					if (var17.field527 + arg0 > 103 || var17.field527 + arg6 > 103 || var17.field533 + arg0 > 103 || var17.field533 + arg6 > 103) {
						return;
					}

					if (var17.field491) {
						field254[arg3].method45(var17.field499, arg6, var17.field527, var15, arg0, var17.field533);
					}
				}

				if (arg5 == 3) {
					field202.method332(arg0, arg3, arg6);
					CSTFGNEK var18 = CSTFGNEK.method219(var13);
					if (var18.field491 && var18.field524) {
						field254[arg3].method47(arg0, arg6);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field463[1][arg0][arg6] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				YECQDWTF.method555(field426, var19, arg0, arg1, arg4, arg2, field254[arg3], arg3, arg6, field202);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(IB)Ljava/lang/String;")
	public static final String method182(int arg0) {
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

	@ObfuscatedName("client.C(I)V")
	public final void method183() {
		if (field432 == 0) {
			int var1 = field1062;
			if (field479 == 1 && field1063 >= 516 && field1064 >= 160 && field1063 <= 765 && field1064 <= 205) {
				var1 = 0;
			}

			if (field123) {
				if (var1 != 1) {
					int var2 = field1056;
					int var3 = field1057;
					if (field153 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field153 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field153 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field154 - 10 || var2 > field156 + field154 + 10 || var3 < field155 - 10 || var3 > field157 + field155 + 10) {
						field123 = false;

						if (field153 == 1) {
							field311 = true;
						}

						if (field153 == 2) {
							field329 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field154;
					int var5 = field155;
					int var6 = field156;
					int var7 = field1063;
					int var8 = field1064;
					if (field153 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field153 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field153 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field332; var10++) {
						int var11 = (field332 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method175(var9);
					}

					field123 = false;

					if (field153 == 1) {
						field311 = true;
					}

					if (field153 == 2) {
						field329 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field332 > 0) {
					int var12 = field367[field332 - 1];
					if (var12 == 277 || var12 == 73 || var12 == 664 || var12 == 127 || var12 == 906 || var12 == 358 || var12 == 177 || var12 == 839 || var12 == 537 || var12 == 996 || var12 == 728 || var12 == 1516) {
						int var13 = field365[field332 - 1];
						int var14 = field366[field332 - 1];
						NPNTBMMX var15 = NPNTBMMX.method393(var14);
						if (var15.field994 || var15.field963) {
							field73 = false;
							field195 = 0;
							field430 = var14;
							field431 = var13;
							field432 = 2;
							field433 = field1063;
							field434 = field1064;

							if (NPNTBMMX.method393(var14).field1006 == field270) {
								field432 = 1;
							}

							if (NPNTBMMX.method393(var14).field1006 == field275) {
								field432 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field455 == 1 || method92(field332 - 1)) && field332 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field332 > 0) {
					method175(field332 - 1);
				}

				if (var1 != 2 || field332 <= 0) {
					return;
				}

				method143();
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method184() {
		if (!field445 && !field269 && !field337) {
			field456++;

			if (field340) {
				method154();
			} else {
				method76();
			}

			method166();
		}
	}

	@ObfuscatedName("client.a(IZI)Ljava/lang/String;")
	public static final String method185(int arg0, int arg1) {
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

	@ObfuscatedName("client.D(I)V")
	public final void method186() {
		field303.method377();
		DJQPOKKS.field589 = field474;
		field214.method371(0, 0);

		if (field343 != -1) {
			method170(0, NPNTBMMX.method393(field343), 0, 0);
		} else if (field373[field342] != -1) {
			method170(0, NPNTBMMX.method393(field373[field342]), 0, 0);
		}

		if (field123 && field153 == 1) {
			method160();
		}

		field303.method378(553, 205, field1048);
		field305.method377();
		DJQPOKKS.field589 = field475;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method187() {
		while (true) {
			int var1 = method407();
			if (var1 == -1) {
				return;
			}

			if (field270 != -1 && field350 == field270) {
				if (var1 == 8 && field47.length() > 0) {
					field47 = field47.substring(0, field47.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field47.length() < 12) {
					field47 = field47 + (char) var1;
				}
			} else if (field243) {
				if (var1 >= 32 && var1 <= 122 && field328.length() < 80) {
					field328 = field328 + (char) var1;
					field329 = true;
				}

				if (var1 == 8 && field328.length() > 0) {
					field328 = field328.substring(0, field328.length() - 1);
					field329 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field243 = false;
					field329 = true;

					if (field74 == 1) {
						long var2 = ZMJDGKKV.method588(field328);
						method172(var2);
					}

					if (field74 == 2 && field279 > 0) {
						long var4 = ZMJDGKKV.method588(field328);
						method157(var4);
					}

					if (field74 == 3 && field328.length() > 0) {
						field167.method409(227);
						field167.method410(0);
						int var6 = field167.field1082;
						field167.method416(field174);
						KDXWZDUJ.method309(field167, field328);
						field167.method419(field167.field1082 - var6);
						field328 = KDXWZDUJ.method310(field328);
						field328 = AZWWSWYH.method11(field328);
						method65(6, ZMJDGKKV.method592(ZMJDGKKV.method589(field174)), field328);

						if (field301 == 2) {
							field301 = 1;
							field338 = true;
							field167.method409(72);
							field167.method410(field316);
							field167.method410(field301);
							field167.method410(field354);
						}
					}

					if (field74 == 4 && field46 < 100) {
						long var7 = ZMJDGKKV.method588(field328);
						method128(var7);
					}

					if (field74 == 5 && field46 > 0) {
						long var9 = ZMJDGKKV.method588(field328);
						method95(var9);
					}
				}
			} else if (field345 == 1) {
				if (var1 >= 48 && var1 <= 57 && field291.length() < 10) {
					field291 = field291 + (char) var1;
					field329 = true;
				}

				if (var1 == 8 && field291.length() > 0) {
					field291 = field291.substring(0, field291.length() - 1);
					field329 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field291.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field291);
						} catch (Exception var21) {
						}

						field167.method409(24);
						field167.method414(var11);
					}

					field345 = 0;
					field329 = true;
				}
			} else if (field345 == 2) {
				if (var1 >= 32 && var1 <= 122 && field291.length() < 12) {
					field291 = field291 + (char) var1;
					field329 = true;
				}

				if (var1 == 8 && field291.length() > 0) {
					field291 = field291.substring(0, field291.length() - 1);
					field329 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field291.length() > 0) {
						field167.method409(13);
						field167.method416(ZMJDGKKV.method588(field291));
					}

					field345 = 0;
					field329 = true;
				}
			} else if (field345 == 3) {
				if (var1 >= 32 && var1 <= 122 && field291.length() < 40) {
					field291 = field291 + (char) var1;
					field329 = true;
				}

				if (var1 == 8 && field291.length() > 0) {
					field291 = field291.substring(0, field291.length() - 1);
					field329 = true;
				}
			} else if (field275 == -1 && field392 == -1) {
				if (var1 >= 32 && var1 <= 122 && field418.length() < 80) {
					field418 = field418 + (char) var1;
					field329 = true;
				}

				if (var1 == 8 && field418.length() > 0) {
					field418 = field418.substring(0, field418.length() - 1);
					field329 = true;
				}

				if ((var1 == 13 || var1 == 10) && field418.length() > 0) {
					if (field282 == 2) {
						if (field418.equals("::clientdrop")) {
							method101();
						}

						if (field418.equals("::lag")) {
							method173();
						}

						if (field418.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field96.method241(2); var12++) {
								field96.method224(var12, 2, (byte) 1);
							}
						}

						if (field418.equals("::fpson")) {
							field458 = true;
						}

						if (field418.equals("::fpsoff")) {
							field458 = false;
						}

						if (field418.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field254[var13].field12[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field418.startsWith("::")) {
						field167.method409(191);
						field167.method410(field418.length() - 1);
						field167.method417(field418.substring(2));
					} else {
						String var16 = field418.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field418 = field418.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field418 = field418.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field418 = field418.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field418 = field418.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field418 = field418.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field418 = field418.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field418 = field418.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field418 = field418.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field418 = field418.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field418 = field418.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field418 = field418.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field418 = field418.substring(6);
						}

						String var18 = field418.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field418 = field418.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field418 = field418.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field418 = field418.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field418 = field418.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field418 = field418.substring(6);
						}

						field167.method409(45);
						field167.method410(0);
						int var20 = field167.field1082;
						field167.method410(var17);
						field167.method437(var19);
						field374.field1082 = 0;
						KDXWZDUJ.method309(field374, field418);
						field167.method453(0, field374.field1081, field374.field1082);
						field167.method419(field167.field1082 - var20);
						field418 = KDXWZDUJ.method310(field418);
						field418 = AZWWSWYH.method11(field418);
						field170.field652 = field418;
						field170.field618 = var17;
						field170.field660 = var19;
						field170.field635 = 150;

						if (field282 == 2) {
							method65(2, "@cr2@" + field170.field1463, field170.field652);
						} else if (field282 == 1) {
							method65(2, "@cr1@" + field170.field1463, field170.field652);
						} else {
							method65(2, field170.field1463, field170.field652);
						}

						if (field316 == 2) {
							field316 = 3;
							field338 = true;
							field167.method409(72);
							field167.method410(field316);
							field167.method410(field301);
							field167.method410(field354);
						}
					}

					field418 = "";
					field329 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method188(String arg0, int arg1) {
		field91 = arg1;
		field349 = arg0;
		method126();

		if (field82 == null) {
			super.method188(arg0, arg1);
		} else {
			field219.method377();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field136.method534(var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			YYTDUXDR.method582(304, 0x8C1111, var3 / 2 - 152, 34, var6);
			YYTDUXDR.method582(302, 0, var3 / 2 - 151, 32, var6 + 1);
			YYTDUXDR.method581(var3 / 2 - 150, 0x8C1111, arg1 * 3, 30, var6 + 2);
			YYTDUXDR.method581(arg1 * 3 + var3 / 2 - 150, 0, 300 - arg1 * 3, 30, var6 + 2);
			field136.method534(var3 / 2, var4 / 2 + 5 - var5, arg0, 0xFFFFFF);
			field219.method378(202, 171, field1048);

			if (field284) {
				field284 = false;

				if (!field461) {
					field220.method378(0, 0, field1048);
					field221.method378(637, 0, field1048);
				}

				field217.method378(128, 0, field1048);
				field218.method378(202, 371, field1048);
				field222.method378(0, 265, field1048);
				field223.method378(562, 265, field1048);
				field224.method378(128, 171, field1048);
				field225.method378(562, 171, field1048);
			}
		}
	}

	@ObfuscatedName("client.a(BLPGNBHFUF;I)V")
	public final void method189(PGNBHFUF arg0, int arg1) {
		if (arg1 == 39) {
			byte var3 = arg0.method441();
			int var4 = arg0.method438();
			int var5 = var4 >> 2;
			int var6 = var4 & 0x3;
			int var7 = field380[var5];
			byte var8 = arg0.method442();
			byte var9 = arg0.method442();
			byte var10 = arg0.method441();
			int var11 = arg0.method448();
			int var12 = arg0.method422();
			int var13 = arg0.method439();
			int var14 = (var13 >> 4 & 0x7) + field247;
			int var15 = (var13 & 0x7) + field248;
			int var16 = arg0.method448();
			int var17 = arg0.method448();
			ZQANNJZE var18;
			if (field378 == var12) {
				var18 = field170;
			} else {
				var18 = field262[var12];
			}

			if (var18 != null) {
				CSTFGNEK var19 = CSTFGNEK.method219(var11);
				int var20 = field426[field148][var14][var15];
				int var21 = field426[field148][var14 + 1][var15];
				int var22 = field426[field148][var14 + 1][var15 + 1];
				int var23 = field426[field148][var14][var15 + 1];
				POJFANDE var24 = var19.method217(var5, var6, var20, var21, var22, var23, -1);
				if (var24 != null) {
					method116(0, var15, var14, var7, field148, var17 + 1, 0, -1, var16 + 1);
					var18.field1454 = field456 + var17;
					var18.field1455 = field456 + var16;
					var18.field1451 = var24;
					int var25 = var19.field527;
					int var26 = var19.field533;
					if (var6 == 1 || var6 == 3) {
						var25 = var19.field533;
						var26 = var19.field527;
					}

					var18.field1448 = var14 * 128 + var25 * 64;
					var18.field1450 = var15 * 128 + var26 * 64;
					var18.field1449 = method91(field148, var18.field1448, var18.field1450);

					if (var10 > var3) {
						byte var27 = var10;
						var10 = var3;
						var3 = var27;
					}

					if (var8 > var9) {
						byte var28 = var8;
						var8 = var9;
						var9 = var28;
					}

					var18.field1466 = var10 + var14;
					var18.field1468 = var3 + var14;
					var18.field1467 = var8 + var15;
					var18.field1469 = var9 + var15;
				}
			}
		}

		if (arg1 == 41) {
			int var29 = arg0.method420();
			int var30 = (var29 >> 4 & 0x7) + field247;
			int var31 = (var29 & 0x7) + field248;
			int var32 = arg0.method422();
			int var33 = arg0.method422();
			int var34 = arg0.method422();
			if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
				FEPBPONH var35 = field250[field148][var30][var31];
				if (var35 != null) {
					for (BINNTJRP var36 = (BINNTJRP) var35.method269(); var36 != null; var36 = (BINNTJRP) var35.method271()) {
						if ((var32 & 0x7FFF) == var36.field20 && var36.field19 == var33) {
							var36.field19 = var34;
							break;
						}
					}

					method71(var30, var31);
				}
			}
		} else if (arg1 == 90) {
			int var37 = arg0.method440();
			int var38 = (var37 >> 4 & 0x7) + field247;
			int var39 = (var37 & 0x7) + field248;
			int var40 = arg0.method439();
			int var41 = var40 >> 2;
			int var42 = var40 & 0x3;
			int var43 = field380[var41];
			if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
				method116(var42, var39, var38, var43, field148, 0, var41, -1, -1);
			}
		} else if (arg1 == 20) {
			int var44 = arg0.method447();
			int var45 = arg0.method440();
			int var46 = (var45 >> 4 & 0x7) + field247;
			int var47 = (var45 & 0x7) + field248;
			if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
				FEPBPONH var48 = field250[field148][var46][var47];
				if (var48 != null) {
					for (BINNTJRP var49 = (BINNTJRP) var48.method269(); var49 != null; var49 = (BINNTJRP) var48.method271()) {
						if ((var44 & 0x7FFF) == var49.field20) {
							var49.method221();
							break;
						}
					}

					if (var48.method269() == null) {
						field250[field148][var46][var47] = null;
					}

					method71(var46, var47);
				}
			}
		} else if (arg1 == 114) {
			int var50 = arg0.method420();
			int var51 = (var50 >> 4 & 0x7) + field247;
			int var52 = (var50 & 0x7) + field248;
			int var53 = arg0.method422();
			int var54 = arg0.method420();
			int var55 = arg0.method422();
			if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
				var51 = var51 * 128 + 64;
				var52 = var52 * 128 + 64;
				KACHDVNZ var56 = new KACHDVNZ(var53, var55, var51, method91(field148, var51, var52) - var54, field148, var52, field456);
				field110.method266(var56);
			}
		} else {
			if (arg1 == 216) {
				int var57 = arg0.method420();
				int var58 = (var57 >> 4 & 0x7) + field247;
				int var59 = (var57 & 0x7) + field248;
				int var60 = arg0.method422();
				int var61 = arg0.method420();
				int var62 = var61 >> 4 & 0xF;
				int var63 = var61 & 0x7;
				if (field170.field658[0] >= var58 - var62 && field170.field658[0] <= var58 + var62 && field170.field659[0] >= var59 - var62 && field170.field659[0] <= var59 + var62 && field415 && !field100 && field232 < 50) {
					field412[field232] = var60;
					field421[field232] = var63;
					field118[field232] = SHEJQUDB.field1225[var60];
					field232++;
				}
			}

			if (arg1 == 51) {
				int var64 = arg0.method447();
				int var65 = arg0.method448();
				int var66 = arg0.method438();
				int var67 = (var66 >> 4 & 0x7) + field247;
				int var68 = (var66 & 0x7) + field248;
				if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
					BINNTJRP var69 = new BINNTJRP();
					var69.field20 = var64;
					var69.field19 = var65;

					if (field250[field148][var67][var68] == null) {
						field250[field148][var67][var68] = new FEPBPONH();
					}

					field250[field148][var67][var68].method266(var69);
					method71(var67, var68);
				}
			} else if (arg1 == 125) {
				int var70 = arg0.method448();
				int var71 = arg0.method438();
				int var72 = (var71 >> 4 & 0x7) + field247;
				int var73 = (var71 & 0x7) + field248;
				int var74 = arg0.method447();
				int var75 = arg0.method422();
				if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && field378 != var75) {
					BINNTJRP var76 = new BINNTJRP();
					var76.field20 = var74;
					var76.field19 = var70;

					if (field250[field148][var72][var73] == null) {
						field250[field148][var72][var73] = new FEPBPONH();
					}

					field250[field148][var72][var73].method266(var76);
					method71(var72, var73);
				}
			} else if (arg1 == 127) {
				int var77 = arg0.method438();
				int var78 = (var77 >> 4 & 0x7) + field247;
				int var79 = (var77 & 0x7) + field248;
				int var80 = arg0.method447();
				int var81 = arg0.method420();
				int var82 = var81 >> 2;
				int var83 = var81 & 0x3;
				int var84 = field380[var82];
				if (var78 >= 0 && var79 >= 0 && var78 < 103 && var79 < 103) {
					int var85 = field426[field148][var78][var79];
					int var86 = field426[field148][var78 + 1][var79];
					int var87 = field426[field148][var78 + 1][var79 + 1];
					int var88 = field426[field148][var78][var79 + 1];
					if (var84 == 0) {
						ELDIEXXN var89 = field202.method334(var78, var79, field148);
						if (var89 != null) {
							int var90 = var89.field668 >> 14 & 0x7FFF;
							if (var82 == 2) {
								var89.field666 = new YRZVGTOF(var80, 2, var87, var83 + 4, var85, var90, false, var86, var88);
								var89.field667 = new YRZVGTOF(var80, 2, var87, var83 + 1 & 0x3, var85, var90, false, var86, var88);
							} else {
								var89.field666 = new YRZVGTOF(var80, var82, var87, var83, var85, var90, false, var86, var88);
							}
						}
					}

					if (var84 == 1) {
						KYBDPTIX var91 = field202.method335(var78, field148, var79);
						if (var91 != null) {
							var91.field942 = new YRZVGTOF(var80, 4, var87, 0, var85, var91.field943 >> 14 & 0x7FFF, false, var86, var88);
						}
					}

					if (var84 == 2) {
						GYQBBOIO var92 = field202.method336(var78, var79, field148);

						if (var82 == 11) {
							var82 = 10;
						}

						if (var92 != null) {
							var92.field714 = new YRZVGTOF(var80, var82, var87, var83, var85, var92.field722 >> 14 & 0x7FFF, false, var86, var88);
						}
					}

					if (var84 == 3) {
						LVNZRQZB var93 = field202.method337(field148, var79, var78);
						if (var93 != null) {
							var93.field948 = new YRZVGTOF(var80, 22, var87, var83, var85, var93.field949 >> 14 & 0x7FFF, false, var86, var88);
						}
					}
				}
			} else if (arg1 == 74) {
				int var94 = arg0.method448();
				int var95 = arg0.method438();
				int var96 = (var95 >> 4 & 0x7) + field247;
				int var97 = (var95 & 0x7) + field248;
				int var98 = arg0.method439();
				int var99 = var98 >> 2;
				int var100 = var98 & 0x3;
				int var101 = field380[var99];
				if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
					method116(var100, var97, var96, var101, field148, 0, var99, var94, -1);
				}
			} else if (arg1 == 133) {
				int var102 = arg0.method420();
				int var103 = (var102 >> 4 & 0x7) + field247;
				int var104 = (var102 & 0x7) + field248;
				int var105 = var103 + arg0.method421();
				int var106 = var104 + arg0.method421();
				int var107 = arg0.method423();
				int var108 = arg0.method422();
				int var109 = arg0.method420() * 4;
				int var110 = arg0.method420() * 4;
				int var111 = arg0.method422();
				int var112 = arg0.method422();
				int var113 = arg0.method420();
				int var114 = arg0.method420();
				if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var108 != 0xFFFF) {
					var103 = var103 * 128 + 64;
					var104 = var104 * 128 + 64;
					var105 = var105 * 128 + 64;
					var106 = var106 * 128 + 64;
					QJBDGANU var115 = new QJBDGANU(method91(field148, var103, var104) - var109, field456 + var112, field456 + var111, field148, var108, var103, var113, var114, var104, var110, var107);
					var115.method490(field456 + var111, var106, method91(field148, var105, var106) - var110, var105);
					field391.method266(var115);
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method190(int arg0) {
		NPNTBMMX var2 = NPNTBMMX.method393(arg0);
		for (int var3 = 0; var3 < var2.field978.length && var2.field978[var3] != -1; var3++) {
			NPNTBMMX var4 = NPNTBMMX.method393(var2.field978[var3]);
			if (var4.field1011 == 1) {
				method190(var4.field1018);
			}

			var4.field990 = 0;
			var4.field1012 = 0;
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method191() {
		if (field100 && field259 == 2 && YECQDWTF.field1396 != field148) {
			method135(null, "Loading - please wait.");
			field259 = 1;
			field84 = System.currentTimeMillis();
		}

		if (field259 == 1) {
			int var1 = method192();
			if (var1 != 0 && System.currentTimeMillis() - field84 > 360000L) {
				signlink.reporterror(field149 + " glcfb " + field72 + "," + var1 + "," + field100 + "," + field387[0] + "," + field96.method240() + "," + field148 + "," + field64 + "," + field65);
				field84 = System.currentTimeMillis();
			}
		}

		if (field259 == 2 && field148 != field119) {
			field119 = field148;
			method73(field148);
		}
	}

	@ObfuscatedName("client.F(I)I")
	public final int method192() {
		for (int var1 = 0; var1 < field163.length; var1++) {
			if (field163[var1] == null && field256[var1] != -1) {
				return -1;
			}

			if (field115[var1] == null && field257[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field163.length; var3++) {
			byte[] var4 = field115[var3];
			if (var4 != null) {
				int var5 = (field255[var3] >> 8) * 64 - field465;
				int var6 = (field255[var3] & 0xFF) * 64 - field466;
				if (field116) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= YECQDWTF.method564(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field457) {
			return -4;
		} else {
			field259 = 2;
			YECQDWTF.field1396 = field148;
			method105();
			field167.method409(12);
			return 0;
		}
	}

	@ObfuscatedName("client.a(ILZQANNJZE;ILPGNBHFUF;I)V")
	public final void method193(int arg0, ZQANNJZE arg1, PGNBHFUF arg2, int arg3) {
		if ((arg3 & 0x20) != 0) {
			int var5 = arg2.method420();
			int var6 = arg2.method439();
			arg1.method265(field456, var6, var5);
			arg1.field653 = field456 + 300;
			arg1.field654 = arg2.method420();
			arg1.field655 = arg2.method440();
		}

		if ((arg3 & 0x200) != 0) {
			arg1.field622 = arg2.method448();
			int var7 = arg2.method452();
			arg1.field626 = var7 >> 16;
			arg1.field625 = (var7 & 0xFFFF) + field456;
			arg1.field623 = 0;
			arg1.field624 = 0;

			if (arg1.field625 > field456) {
				arg1.field623 = -1;
			}

			if (arg1.field622 == 0xFFFF) {
				arg1.field622 = -1;
			}
		}

		if ((arg3 & 0x40) != 0) {
			arg1.field652 = arg2.method427();
			if (arg1.field652.charAt(0) == '~') {
				arg1.field652 = arg1.field652.substring(1);
				method65(2, arg1.field1463, arg1.field652);
			} else if (field170 == arg1) {
				method65(2, arg1.field1463, arg1.field652);
			}

			arg1.field618 = 0;
			arg1.field660 = 0;
			arg1.field635 = 150;
		}

		if ((arg3 & 0x4) != 0) {
			arg1.field634 = arg2.method448();
			if (arg1.field634 == 0xFFFF) {
				arg1.field634 = -1;
			}
		}

		if ((arg3 & 0x1) != 0) {
			int var8 = arg2.method439();
			byte[] var9 = new byte[var8];
			PGNBHFUF var10 = new PGNBHFUF(var9);
			arg2.method455(0, var8, var9);
			field267[arg0] = var10;
			arg1.method594(var10);
		}

		if ((arg3 & 0x400) != 0) {
			int var11 = arg2.method440();
			int var12 = arg2.method420();
			arg1.method265(field456, var12, var11);
			arg1.field653 = field456 + 300;
			arg1.field654 = arg2.method440();
			arg1.field655 = arg2.method420();
		}

		if ((arg3 & 0x100) != 0) {
			arg1.field608 = arg2.method439();
			arg1.field610 = arg2.method439();
			arg1.field609 = arg2.method440();
			arg1.field611 = arg2.method420();
			arg1.field612 = arg2.method448() + field456;
			arg1.field613 = arg2.method446() + field456;
			arg1.field614 = arg2.method440();
			arg1.method261();
		}

		if ((arg3 & 0x80) != 0) {
			int var13 = arg2.method448();
			int var14 = arg2.method420();
			int var15 = arg2.method439();
			int var16 = arg2.field1082;

			if (arg1.field1463 != null && arg1.field1452) {
				long var17 = ZMJDGKKV.method588(arg1.field1463);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field46; var20++) {
						if (field132[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field397 == 0) {
					try {
						field374.field1082 = 0;
						arg2.method454(0, field374.field1081, var15);
						field374.field1082 = 0;
						String var21 = KDXWZDUJ.method308(var15, field374);
						var21 = AZWWSWYH.method11(var21);
						arg1.field652 = var21;
						arg1.field618 = var13 >> 8;
						arg1.field660 = var13 & 0xFF;
						arg1.field635 = 150;

						if (var14 == 2 || var14 == 3) {
							method65(1, "@cr2@" + arg1.field1463, var21);
						} else if (var14 == 1) {
							method65(1, "@cr1@" + arg1.field1463, var21);
						} else {
							method65(2, arg1.field1463, var21);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field1082 = var15 + var16;
		}

		if ((arg3 & 0x8) != 0) {
			arg1.field606 = arg2.method447();
			arg1.field607 = arg2.method446();
		}

		if ((arg3 & 0x2) != 0) {
			int var23 = arg2.method448();
			if (var23 == 0xFFFF) {
				var23 = -1;
			}

			int var24 = arg2.method438();
			if (arg1.field645 == var23 && var23 != -1) {
				int var25 = KIZBPSHZ.field888[var23].field902;
				if (var25 == 1) {
					arg1.field646 = 0;
					arg1.field647 = 0;
					arg1.field648 = var24;
					arg1.field649 = 0;
				}

				if (var25 == 2) {
					arg1.field649 = 0;
					return;
				}
			} else if (var23 == -1 || arg1.field645 == -1 || KIZBPSHZ.field888[var23].field896 >= KIZBPSHZ.field888[arg1.field645].field896) {
				arg1.field645 = var23;
				arg1.field646 = 0;
				arg1.field647 = 0;
				arg1.field648 = var24;
				arg1.field649 = 0;
				arg1.field641 = arg1.field621;
			}
		}
	}

	@ObfuscatedName("client.a([BZI)V")
	public final void method194(byte[] arg0, boolean arg1) {
		if (field286) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method195() {
		if (field1062 == 1) {
			if (field1063 >= 6 && field1063 <= 106 && field1064 >= 467 && field1064 <= 499) {
				field316 = (field316 + 1) % 4;
				field338 = true;
				field329 = true;
				field167.method409(72);
				field167.method410(field316);
				field167.method410(field301);
				field167.method410(field354);
			}

			if (field1063 >= 135 && field1063 <= 235 && field1064 >= 467 && field1064 <= 499) {
				field301 = (field301 + 1) % 3;
				field338 = true;
				field329 = true;
				field167.method409(72);
				field167.method410(field316);
				field167.method410(field301);
				field167.method410(field354);
			}

			if (field1063 >= 273 && field1063 <= 373 && field1064 >= 467 && field1064 <= 499) {
				field354 = (field354 + 1) % 3;
				field338 = true;
				field329 = true;
				field167.method409(72);
				field167.method410(field316);
				field167.method410(field301);
				field167.method410(field354);
			}

			if (field1063 >= 412 && field1063 <= 512 && field1064 >= 467 && field1064 <= 499) {
				if (field270 == -1) {
					method206();
					field47 = "";
					field424 = false;
					field350 = field270 = NPNTBMMX.field989;
					return;
				}

				method65(0, "", "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.G(I)Ljava/lang/String;")
	public final String method196() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1051 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(ZLPGNBHFUF;I)V")
	public final void method197(PGNBHFUF arg0, int arg1) {
		field446 = 0;
		field265 = 0;
		method69(arg0, arg1);
		method113(arg0, arg1);
		method112(arg0, arg1);

		for (int var3 = 0; var3 < field446; var3++) {
			int var4 = field447[var3];
			if (field456 != field375[var4].field650) {
				field375[var4].field699 = null;
				field375[var4] = null;
			}
		}

		if (arg0.field1082 != arg1) {
			signlink.reporterror(field149 + " size mismatch in getnpcpos - pos:" + arg0.field1082 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field376; var5++) {
			if (field375[field377[var5]] == null) {
				signlink.reporterror(field149 + " null entry in npc list - pos:" + var5 + " size:" + field376);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBLNPNTBMMX;II)V")
	public final void method198(int arg0, int arg1, int arg2, int arg3, NPNTBMMX arg4, int arg5, int arg6) {
		if (arg4.field1011 == 0 && arg4.field978 != null && !arg4.field1015 && (arg5 >= arg3 && arg2 >= arg0 && arg5 <= arg4.field971 + arg3 && arg2 <= arg4.field966 + arg0)) {
			int var8 = arg4.field978.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg4.field968[var9] + arg3;
				int var11 = arg4.field976[var9] + arg0 - arg1;
				NPNTBMMX var12 = NPNTBMMX.method393(arg4.field978[var9]);
				var10 += var12.field988;
				var11 += var12.field975;
				if ((var12.field965 >= 0 || var12.field985 != 0) && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field971 + var10 && arg2 < var12.field966 + var11) {
					if (var12.field965 >= 0) {
						field164 = var12.field965;
					} else {
						field164 = var12.field1018;
					}
				}

				if (var12.field1011 == 8 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field971 + var10 && arg2 < var12.field966 + var11) {
					field45 = var12.field1018;
				}

				if (var12.field1011 == 0) {
					method198(var11, var12.field1014, arg2, var10, var12, arg5, arg6);

					if (var12.field987 > var12.field966) {
						method72(arg2, var11, var12, var12.field971 + var10, arg6, arg5, var12.field987, var12.field966);
					}
				} else {
					if (var12.field1030 == 1 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field971 + var10 && arg2 < var12.field966 + var11) {
						boolean var13 = false;
						if (var12.field1029 != 0) {
							var13 = method111(var12);
						}

						if (!var13) {
							field429[field332] = var12.field999;
							field367[field332] = 208;
							field366[field332] = var12.field1018;
							field332++;
						}
					}

					if (var12.field1030 == 2 && field479 == 0 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field971 + var10 && arg2 < var12.field966 + var11) {
						String var14 = var12.field967;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field429[field332] = var14 + " @gre@" + var12.field1022;
						field367[field332] = 444;
						field366[field332] = var12.field1018;
						field332++;
					}

					if (var12.field1030 == 3 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field971 + var10 && arg2 < var12.field966 + var11) {
						field429[field332] = "Close";

						if (arg6 == 3) {
							field367[field332] = 178;
						} else {
							field367[field332] = 368;
						}

						field366[field332] = var12.field1018;
						field332++;
					}

					if (var12.field1030 == 4 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field971 + var10 && arg2 < var12.field966 + var11) {
						field429[field332] = var12.field999;
						field367[field332] = 407;
						field366[field332] = var12.field1018;
						field332++;
					}

					if (var12.field1030 == 5 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field971 + var10 && arg2 < var12.field966 + var11) {
						field429[field332] = var12.field999;
						field367[field332] = 105;
						field366[field332] = var12.field1018;
						field332++;
					}

					if (var12.field1030 == 6 && !field369 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field971 + var10 && arg2 < var12.field966 + var11) {
						field429[field332] = var12.field999;
						field367[field332] = 284;
						field366[field332] = var12.field1018;
						field332++;
					}

					if (var12.field1011 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field966; var16++) {
							for (int var17 = 0; var17 < var12.field971; var17++) {
								int var18 = (var12.field986 + 32) * var17 + var10;
								int var19 = (var12.field972 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1002[var15];
									var19 += var12.field961[var15];
								}

								if (arg5 >= var18 && arg2 >= var19 && arg5 < var18 + 32 && arg2 < var19 + 32) {
									field57 = var15;
									field58 = var12.field1018;

									if (var12.field1013[var15] > 0) {
										IBYWZZZK var20 = IBYWZZZK.method290(var12.field1013[var15] - 1);
										if (field398 == 1 && var12.field1023) {
											if (field400 != var12.field1018 || field399 != var15) {
												field429[field332] = "Use " + field402 + " with @lre@" + var20.field747;
												field367[field332] = 835;
												field368[field332] = var20.field770;
												field365[field332] = var15;
												field366[field332] = var12.field1018;
												field332++;
											}
										} else if (field479 != 1 || !var12.field1023) {
											if (var12.field1023) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field769 != null && var20.field769[var21] != null) {
														field429[field332] = var20.field769[var21] + " @lre@" + var20.field747;

														if (var21 == 3) {
															field367[field332] = 537;
														}

														if (var21 == 4) {
															field367[field332] = 996;
														}

														field368[field332] = var20.field770;
														field365[field332] = var15;
														field366[field332] = var12.field1018;
														field332++;
													} else if (var21 == 4) {
														field429[field332] = "Drop @lre@" + var20.field747;
														field367[field332] = 996;
														field368[field332] = var20.field770;
														field365[field332] = var15;
														field366[field332] = var12.field1018;
														field332++;
													}
												}
											}

											if (var12.field991) {
												field429[field332] = "Use @lre@" + var20.field747;
												field367[field332] = 728;
												field368[field332] = var20.field770;
												field365[field332] = var15;
												field366[field332] = var12.field1018;
												field332++;
											}

											if (var12.field1023 && var20.field769 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field769[var22] != null) {
														field429[field332] = var20.field769[var22] + " @lre@" + var20.field747;

														if (var22 == 0) {
															field367[field332] = 358;
														}

														if (var22 == 1) {
															field367[field332] = 177;
														}

														if (var22 == 2) {
															field367[field332] = 839;
														}

														field368[field332] = var20.field770;
														field365[field332] = var15;
														field366[field332] = var12.field1018;
														field332++;
													}
												}
											}

											if (var12.field995 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field995[var23] != null) {
														field429[field332] = var12.field995[var23] + " @lre@" + var20.field747;

														if (var23 == 0) {
															field367[field332] = 277;
														}

														if (var23 == 1) {
															field367[field332] = 73;
														}

														if (var23 == 2) {
															field367[field332] = 664;
														}

														if (var23 == 3) {
															field367[field332] = 127;
														}

														if (var23 == 4) {
															field367[field332] = 906;
														}

														field368[field332] = var20.field770;
														field365[field332] = var15;
														field366[field332] = var12.field1018;
														field332++;
													}
												}
											}

											field429[field332] = "Examine @lre@" + var20.field747;
											field367[field332] = 1516;
											field368[field332] = var20.field770;
											field365[field332] = var15;
											field366[field332] = var12.field1018;
											field332++;
										} else if ((field481 & 0x10) == 0x10) {
											field429[field332] = field482 + " @lre@" + var20.field747;
											field367[field332] = 206;
											field368[field332] = var20.field770;
											field365[field332] = var15;
											field366[field332] = var12.field1018;
											field332++;
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

	@ObfuscatedName("client.H(I)V")
	public final void method199() {
		CSTFGNEK.field503.method601();
		CSTFGNEK.field511.method601();
		WZSDIPBR.field1280.method601();
		IBYWZZZK.field767.method601();
		IBYWZZZK.field765.method601();
		ZQANNJZE.field1459.method601();
		BUIWQSXJ.field42.method601();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.c(BI)V")
	public final void method200(int arg0) {
		NPNTBMMX.method398(arg0);
	}

	@ObfuscatedName("client.I(I)Ljava/net/Socket;")
	public final Socket method201(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.p(B)Z")
	public final boolean method202() {
		if (field43 == null) {
			return false;
		}

		try {
			int var1 = field43.method279();
			if (var1 == 0) {
				return false;
			}

			if (field77 == -1) {
				field43.method280(field289.field1081, 0, 1);
				field77 = field289.field1081[0] & 0xFF;
				if (field109 != null) {
					field77 = field77 - field109.method51() & 0xFF;
				}

				field76 = QEOGAQPY.field1174[field77];
				var1--;
			}

			if (field76 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field43.method280(field289.field1081, 0, 1);
				field76 = field289.field1081[0] & 0xFF;
				var1--;
			}

			if (field76 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field43.method280(field289.field1081, 0, 2);
				field289.field1082 = 0;
				field76 = field289.method422();
				var1 -= 2;
			}

			if (var1 < field76) {
				return false;
			}

			field289.field1082 = 0;
			field43.method280(field289.field1081, 0, field76);
			field78 = 0;
			field472 = field471;
			field471 = field470;
			field470 = field77;

			if (field77 == 173) {
				field273 = field289.method447() * 30;
				field77 = -1;
				return true;
			}

			if (field77 == 166) {
				long var2 = field289.method426();
				int var4 = field289.method420();
				String var5 = ZMJDGKKV.method592(ZMJDGKKV.method589(var2));
				for (int var6 = 0; var6 < field279; var6++) {
					if (field160[var6] == var2) {
						if (field251[var6] != var4) {
							field251[var6] = var4;
							field311 = true;

							if (var4 > 0) {
								method65(5, "", var5 + " has logged in.");
							}

							if (var4 == 0) {
								method65(5, "", var5 + " has logged out.");
							}
						}

						var5 = null;
						break;
					}
				}

				if (var5 != null && field279 < 200) {
					field160[field279] = var2;
					field341[field279] = var5;
					field251[field279] = var4;
					field279++;
					field311 = true;
				}

				boolean var7 = false;
				while (!var7) {
					var7 = true;
					for (int var8 = 0; var8 < field279 - 1; var8++) {
						if (field251[var8] != field97 && field251[var8 + 1] == field97 || field251[var8] == 0 && field251[var8 + 1] != 0) {
							int var9 = field251[var8];
							field251[var8] = field251[var8 + 1];
							field251[var8 + 1] = var9;
							String var10 = field341[var8];
							field341[var8] = field341[var8 + 1];
							field341[var8 + 1] = var10;
							long var11 = field160[var8];
							field160[var8] = field160[var8 + 1];
							field160[var8 + 1] = var11;
							field311 = true;
							var7 = false;
						}
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 237) {
				field311 = true;
				int var13 = field289.method422();
				NPNTBMMX var14 = NPNTBMMX.method393(var13);
				int var15 = field289.method422();
				for (int var16 = 0; var16 < var15; var16++) {
					var14.field1013[var16] = field289.method446();
					int var17 = field289.method440();
					if (var17 == 255) {
						var17 = field289.method452();
					}

					var14.field1021[var16] = var17;
				}

				for (int var18 = var15; var18 < var14.field1013.length; var18++) {
					var14.field1013[var18] = 0;
					var14.field1021[var18] = 0;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 165) {
				int var19 = field289.method422();
				method190(var19);

				if (field343 != -1) {
					method200(field343);
					field343 = -1;
					field311 = true;
					field355 = true;
				}

				if (field275 != -1) {
					method200(field275);
					field275 = -1;
					field329 = true;
				}

				if (field392 != -1) {
					method200(field392);
					field392 = -1;
					field284 = true;
				}

				if (field326 != -1) {
					method200(field326);
					field326 = -1;
				}

				if (field270 != var19) {
					method200(field270);
					field270 = var19;
				}

				if (field345 != 0) {
					field345 = 0;
					field329 = true;
				}

				field369 = false;
				field77 = -1;
				return true;
			}

			if (field77 == 159) {
				method168(field76, field289);
				field457 = false;
				field77 = -1;
				return true;
			}

			if (field77 == 67) {
				field46 = field76 / 8;
				for (int var20 = 0; var20 < field46; var20++) {
					field132[var20] = field289.method426();
				}

				field77 = -1;
				return true;
			}

			if (field77 == 220) {
				long var21 = field289.method426();
				int var23 = field289.method425();
				int var24 = field289.method420();
				boolean var25 = false;
				for (int var26 = 0; var26 < 100; var26++) {
					if (field394[var26] == var23) {
						var25 = true;
						break;
					}
				}

				if (var24 <= 1) {
					for (int var27 = 0; var27 < field46; var27++) {
						if (field132[var27] == var21) {
							var25 = true;
							break;
						}
					}
				}

				if (!var25 && field397 == 0) {
					try {
						field394[field478] = var23;
						field478 = (field478 + 1) % 100;
						String var28 = KDXWZDUJ.method308(field76 - 13, field289);
						if (var24 != 3) {
							var28 = AZWWSWYH.method11(var28);
						}

						if (var24 == 2 || var24 == 3) {
							method65(7, "@cr2@" + ZMJDGKKV.method592(ZMJDGKKV.method589(var21)), var28);
						} else if (var24 == 1) {
							method65(7, "@cr1@" + ZMJDGKKV.method592(ZMJDGKKV.method589(var21)), var28);
						} else {
							method65(3, ZMJDGKKV.method592(ZMJDGKKV.method589(var21)), var28);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 236) {
				field85 = 0;
				field77 = -1;
				return true;
			}

			if (field77 == 253) {
				int var30 = field289.method447();
				int var31 = field289.method422();
				NPNTBMMX.method393(var31).field1007 = 2;
				NPNTBMMX.method393(var31).field1008 = var30;
				field77 = -1;
				return true;
			}

			if (field77 == 248) {
				int var32 = field289.method447();
				int var33 = field289.method422();
				method190(var32);

				if (var33 != -1) {
					method190(var33);
				}

				if (field270 != -1) {
					method200(field270);
					field270 = -1;
				}

				if (field343 != -1) {
					method200(field343);
					field343 = -1;
				}

				if (field275 != -1) {
					method200(field275);
					field275 = -1;
				}

				if (field392 != var32) {
					method200(field392);
					field392 = var32;
				}

				if (field326 != var32) {
					method200(field326);
					field326 = var33;
				}

				field345 = 0;
				field369 = false;
				field77 = -1;
				return true;
			}

			if (field77 == 183) {
				field253 = field289.method420();
				field77 = -1;
				return true;
			}

			if (field77 == 104) {
				field311 = true;
				int var34 = field289.method422();
				NPNTBMMX var35 = NPNTBMMX.method393(var34);
				while (field289.field1082 < field76) {
					int var36 = field289.method434();
					int var37 = field289.method422();
					int var38 = field289.method420();
					if (var38 == 255) {
						var38 = field289.method425();
					}

					if (var36 >= 0 && var36 < var35.field1013.length) {
						var35.field1013[var36] = var37;
						var35.field1021[var36] = var38;
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 233) {
				int var39 = field289.method422();
				int var40 = field289.method446();
				int var41 = var40 >> 10 & 0x1F;
				int var42 = var40 >> 5 & 0x1F;
				int var43 = var40 & 0x1F;
				NPNTBMMX.method393(var39).field992 = (var43 << 3) + (var41 << 19) + (var42 << 11);
				field77 = -1;
				return true;
			}

			if (field77 == 59) {
				method197(field289, field76);
				field77 = -1;
				return true;
			}

			if (field77 == 235) {
				if (field342 == 12) {
					field311 = true;
				}

				field108 = field289.method420();
				field77 = -1;
				return true;
			}

			if (field77 == 176) {
				for (int var44 = 0; var44 < field322.length; var44++) {
					if (field69[var44] != field322[var44]) {
						field322[var44] = field69[var44];
						method208(var44);
						field311 = true;
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 174) {
				int var45 = field289.method446();
				int var46 = field289.method452();
				field69[var45] = var46;

				if (field322[var45] != var46) {
					field322[var45] = var46;
					method208(var45);
					field311 = true;

					if (field488 != -1) {
						field329 = true;
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 11) {
				field247 = field289.method440();
				field248 = field289.method439();

				while (field289.field1082 < field76) {
					int var47 = field289.method420();
					method189(field289, var47);
				}

				field77 = -1;
				return true;
			}

			if (field77 == 28) {
				field248 = field289.method440();
				field247 = field289.method420();
				for (int var48 = field247; var48 < field247 + 8; var48++) {
					for (int var49 = field248; var49 < field248 + 8; var49++) {
						if (field250[field148][var48][var49] != null) {
							field250[field148][var48][var49] = null;
							method71(var48, var49);
						}
					}
				}

				for (IYHIHFOL var50 = (IYHIHFOL) field176.method269(); var50 != null; var50 = (IYHIHFOL) field176.method271()) {
					if (var50.field809 >= field247 && var50.field809 < field247 + 8 && var50.field810 >= field248 && var50.field810 < field248 + 8 && field148 == var50.field807) {
						var50.field802 = 0;
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 192) {
				field362 = field289.method420();
				if (field362 == field342) {
					if (field362 == 3) {
						field342 = 1;
					} else {
						field342 = 3;
					}

					field311 = true;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 239) {
				int var51 = field289.method448();
				int var52 = field289.method423();
				int var53 = field289.method449();
				NPNTBMMX var54 = NPNTBMMX.method393(var51);
				var54.field988 = var52;
				var54.field975 = var53;
				field77 = -1;
				return true;
			}

			if (field77 == 203) {
				field477 = field289.method422();
				field93 = field289.method425();
				field289.method422();
				field166 = field289.method446();
				field67 = field289.method447();
				field131 = field289.method448();
				field289.method440();
				field289.method447();
				field66 = field289.method448();
				field289.method446();
				field361 = field289.method447();
				signlink.dnslookup(ZMJDGKKV.method591(field93));
				field77 = -1;
				return true;
			}

			if (field77 == 55) {
				if (field343 != -1) {
					method200(field343);
					field343 = -1;
					field311 = true;
					field355 = true;
				}

				if (field275 != -1) {
					method200(field275);
					field275 = -1;
					field329 = true;
				}

				if (field392 != -1) {
					method200(field392);
					field392 = -1;
					field284 = true;
				}

				if (field326 != -1) {
					method200(field326);
					field326 = -1;
				}

				if (field270 != -1) {
					method200(field270);
					field270 = -1;
				}

				if (field345 != 0) {
					field345 = 0;
					field329 = true;
				}

				field369 = false;
				field77 = -1;
				return true;
			}

			if (field77 == 249) {
				field325 = field289.method420();
				field77 = -1;
				return true;
			}

			if (field77 == 10) {
				int var55 = field289.method422();
				int var56 = field289.method420();
				int var57 = field289.method422();
				if (var57 == 0xFFFF) {
					if (field232 < 50) {
						field412[field232] = (short) var55;
						field421[field232] = var56;
						field118[field232] = 0;
						field232++;
					}
				} else if (field415 && !field100 && field232 < 50) {
					field412[field232] = var55;
					field421[field232] = var56;
					field118[field232] = SHEJQUDB.field1225[var55] + var57;
					field232++;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 36) {
				int var58 = field289.method420();
				int var59 = field289.method420();
				int var60 = field289.method420();
				int var61 = field289.method420();
				field462[var58] = true;
				field83[var58] = var59;
				field353[var58] = var60;
				field464[var58] = var61;
				field138[var58] = 0;
				field77 = -1;
				return true;
			}

			if (field77 == 190) {
				int var62 = field289.method422();
				int var63 = field289.method422();
				NPNTBMMX var64 = NPNTBMMX.method393(var63);
				if (var64 != null && var64.field1011 == 0) {
					if (var62 < 0) {
						var62 = 0;
					}

					if (var62 > var64.field987 - var64.field966) {
						var62 = var64.field987 - var64.field966;
					}

					var64.field1014 = var62;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 93) {
				boolean var65 = field289.method439() == 1;
				int var66 = field289.method448();
				NPNTBMMX.method393(var66).field1015 = var65;
				field77 = -1;
				return true;
			}

			if (field77 == 66) {
				field243 = false;
				field345 = 1;
				field291 = "";
				field329 = true;
				field77 = -1;
				return true;
			}

			if (field77 == 111) {
				int var67 = field289.method446();
				NPNTBMMX var68 = NPNTBMMX.method393(var67);
				for (int var69 = 0; var69 < var68.field1013.length; var69++) {
					var68.field1013[var69] = -1;
					var68.field1013[var69] = 0;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 88) {
				int var70 = field289.method448();
				int var71 = field289.method447();
				int var72 = field289.method448();
				NPNTBMMX.method393(var71).field982 = (var70 << 16) + var72;
				field77 = -1;
				return true;
			}

			if (field77 == 142) {
				field243 = false;
				field345 = 2;
				field291 = "";
				field329 = true;
				field77 = -1;
				return true;
			}

			if (field77 == 92) {
				int var73 = field289.method446();
				method190(var73);

				if (field275 != -1) {
					method200(field275);
					field275 = -1;
					field329 = true;
				}

				if (field392 != -1) {
					method200(field392);
					field392 = -1;
					field284 = true;
				}

				if (field326 != -1) {
					method200(field326);
					field326 = -1;
				}

				if (field270 != -1) {
					method200(field270);
					field270 = -1;
				}

				if (field343 != var73) {
					method200(field343);
					field343 = var73;
				}

				if (field345 != 0) {
					field345 = 0;
					field329 = true;
				}

				field311 = true;
				field355 = true;
				field369 = false;
				field77 = -1;
				return true;
			}

			if (field77 == 194) {
				int var74 = field289.method422();
				int var75 = field289.method446();

				if (field275 != -1) {
					method200(field275);
					field275 = -1;
					field329 = true;
				}

				if (field392 != -1) {
					method200(field392);
					field392 = -1;
					field284 = true;
				}

				if (field326 != -1) {
					method200(field326);
					field326 = -1;
				}

				if (field270 != var74) {
					method200(field270);
					field270 = var74;
				}

				if (field343 != var75) {
					method200(field343);
					field343 = var75;
				}

				if (field345 != 0) {
					field345 = 0;
					field329 = true;
				}

				field311 = true;
				field355 = true;
				field369 = false;
				field77 = -1;
				return true;
			}

			if (field77 == 131) {
				String var76 = field289.method427();
				if (var76.endsWith(":tradereq:")) {
					String var77 = var76.substring(0, var76.indexOf(":"));
					long var78 = ZMJDGKKV.method588(var77);
					boolean var80 = false;
					for (int var81 = 0; var81 < field46; var81++) {
						if (field132[var81] == var78) {
							var80 = true;
							break;
						}
					}

					if (!var80 && field397 == 0) {
						method65(4, var77, "wishes to trade with you.");
					}
				} else if (var76.endsWith(":duelreq:")) {
					String var82 = var76.substring(0, var76.indexOf(":"));
					long var83 = ZMJDGKKV.method588(var82);
					boolean var85 = false;
					for (int var86 = 0; var86 < field46; var86++) {
						if (field132[var86] == var83) {
							var85 = true;
							break;
						}
					}

					if (!var85 && field397 == 0) {
						method65(8, var82, "wishes to duel with you.");
					}
				} else if (var76.endsWith(":chalreq:")) {
					String var87 = var76.substring(0, var76.indexOf(":"));
					long var88 = ZMJDGKKV.method588(var87);
					boolean var90 = false;
					for (int var91 = 0; var91 < field46; var91++) {
						if (field132[var91] == var88) {
							var90 = true;
							break;
						}
					}

					if (!var90 && field397 == 0) {
						String var92 = var76.substring(var76.indexOf(":") + 1, var76.length() - 9);
						method65(8, var87, var92);
					}
				} else {
					method65(0, "", var76);
				}

				field77 = -1;
				return true;
			}

			if (field77 == 215) {
				field187 = false;

				for (int var93 = 0; var93 < 5; var93++) {
					field462[var93] = false;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 205) {
				int var94 = field289.method450();
				if (field488 != var94) {
					method200(field488);
					field488 = var94;
				}

				field329 = true;
				field77 = -1;
				return true;
			}

			if (field77 == 137) {
				field274 = field289.method420();
				if (field274 == 1) {
					field395 = field289.method422();
				}

				if (field274 >= 2 && field274 <= 6) {
					if (field274 == 2) {
						field320 = 64;
						field321 = 64;
					}

					if (field274 == 3) {
						field320 = 0;
						field321 = 64;
					}

					if (field274 == 4) {
						field320 = 128;
						field321 = 64;
					}

					if (field274 == 5) {
						field320 = 64;
						field321 = 0;
					}

					if (field274 == 6) {
						field320 = 64;
						field321 = 128;
					}

					field274 = 2;
					field317 = field289.method422();
					field318 = field289.method422();
					field319 = field289.method420();
				}

				if (field274 == 10) {
					field124 = field289.method422();
				}

				field77 = -1;
				return true;
			}

			if (field77 == 44) {
				field187 = true;
				field125 = field289.method420();
				field126 = field289.method420();
				field127 = field289.method422();
				field128 = field289.method420();
				field129 = field289.method420();
				if (field129 >= 100) {
					field226 = field125 * 128 + 64;
					field228 = field126 * 128 + 64;
					field227 = method91(field148, field226, field228) - field127;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 204) {
				String var95 = field289.method427();
				int var96 = field289.method446();
				NPNTBMMX.method393(var96).field997 = var95;

				if (field373[field342] == NPNTBMMX.method393(var96).field1006) {
					field311 = true;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 33) {
				if (field342 == 12) {
					field311 = true;
				}

				field175 = field289.method423();
				field77 = -1;
				return true;
			}

			if (field77 == 113) {
				method134();
				field77 = -1;
				return false;
			}

			if (field77 == 150 || field77 == 118) {
				int var97 = field64;
				int var98 = field65;
				if (field77 == 150) {
					var97 = field289.method446();
					var98 = field289.method448();
					field116 = false;
				}

				if (field77 == 118) {
					var97 = field289.method446();
					field289.method430();

					for (int var99 = 0; var99 < 4; var99++) {
						for (int var100 = 0; var100 < 13; var100++) {
							for (int var101 = 0; var101 < 13; var101++) {
								int var102 = field289.method431(1);
								if (var102 == 1) {
									field181[var99][var100][var101] = field289.method431(26);
								} else {
									field181[var99][var100][var101] = -1;
								}
							}
						}
					}

					field289.method432();
					var98 = field289.method422();
					field116 = true;
				}

				if (field64 == var97 && field65 == var98 && field259 == 2) {
					field77 = -1;
					return true;
				}

				field64 = var97;
				field65 = var98;
				field465 = (field64 - 6) * 8;
				field466 = (field65 - 6) * 8;
				field120 = false;
				if ((field64 / 8 == 48 || field64 / 8 == 49) && field65 / 8 == 48) {
					field120 = true;
				}

				if (field64 / 8 == 48 && field65 / 8 == 148) {
					field120 = true;
				}

				field259 = 1;
				field84 = System.currentTimeMillis();
				method135(null, "Loading - please wait.");

				if (field77 == 150) {
					int var103 = 0;
					for (int var104 = (field64 - 6) / 8; var104 <= (field64 + 6) / 8; var104++) {
						for (int var105 = (field65 - 6) / 8; var105 <= (field65 + 6) / 8; var105++) {
							var103++;
						}
					}

					field163 = new byte[var103][];
					field115 = new byte[var103][];
					field255 = new int[var103];
					field256 = new int[var103];
					field257 = new int[var103];
					int var106 = 0;
					for (int var107 = (field64 - 6) / 8; var107 <= (field64 + 6) / 8; var107++) {
						for (int var108 = (field65 - 6) / 8; var108 <= (field65 + 6) / 8; var108++) {
							field255[var106] = (var107 << 8) + var108;

							if (field120 && (var108 == 49 || var108 == 149 || var108 == 147 || var107 == 50 || var107 == 49 && var108 == 47)) {
								field256[var106] = -1;
								field257[var106] = -1;
								var106++;
							} else {
								int var109 = field256[var106] = field96.method228(var107, var108, 0);
								if (var109 != -1) {
									field96.method230(3, var109);
								}

								int var110 = field257[var106] = field96.method228(var107, var108, 1);
								if (var110 != -1) {
									field96.method230(3, var110);
								}

								var106++;
							}
						}
					}
				}

				if (field77 == 118) {
					int var111 = 0;
					int[] var112 = new int[676];
					for (int var113 = 0; var113 < 4; var113++) {
						for (int var114 = 0; var114 < 13; var114++) {
							for (int var115 = 0; var115 < 13; var115++) {
								int var116 = field181[var113][var114][var115];
								if (var116 != -1) {
									int var117 = var116 >> 14 & 0x3FF;
									int var118 = var116 >> 3 & 0x7FF;
									int var119 = (var117 / 8 << 8) + var118 / 8;
									for (int var120 = 0; var120 < var111; var120++) {
										if (var112[var120] == var119) {
											var119 = -1;
											break;
										}
									}

									if (var119 != -1) {
										var112[var111++] = var119;
									}
								}
							}
						}
					}

					field163 = new byte[var111][];
					field115 = new byte[var111][];
					field255 = new int[var111];
					field256 = new int[var111];
					field257 = new int[var111];
					for (int var121 = 0; var121 < var111; var121++) {
						int var122 = field255[var121] = var112[var121];
						int var123 = var122 >> 8 & 0xFF;
						int var124 = var122 & 0xFF;
						int var125 = field256[var121] = field96.method228(var123, var124, 0);
						if (var125 != -1) {
							field96.method230(3, var125);
						}

						int var126 = field257[var121] = field96.method228(var123, var124, 1);
						if (var126 != -1) {
							field96.method230(3, var126);
						}
					}
				}

				int var127 = field465 - field467;
				int var128 = field466 - field468;
				field467 = field465;
				field468 = field466;

				for (int var129 = 0; var129 < 16384; var129++) {
					GBGUDIMT var130 = field375[var129];
					if (var130 != null) {
						for (int var131 = 0; var131 < 10; var131++) {
							var130.field658[var131] -= var127;
							var130.field659[var131] -= var128;
						}

						var130.field628 -= var127 * 128;
						var130.field629 -= var128 * 128;
					}
				}

				for (int var132 = 0; var132 < field260; var132++) {
					ZQANNJZE var133 = field262[var132];
					if (var133 != null) {
						for (int var134 = 0; var134 < 10; var134++) {
							var133.field658[var134] -= var127;
							var133.field659[var134] -= var128;
						}

						var133.field628 -= var127 * 128;
						var133.field629 -= var128 * 128;
					}
				}

				field457 = true;
				byte var135 = 0;
				byte var136 = 104;
				byte var137 = 1;
				if (var127 < 0) {
					var135 = 103;
					var136 = -1;
					var137 = -1;
				}

				byte var138 = 0;
				byte var139 = 104;
				byte var140 = 1;
				if (var128 < 0) {
					var138 = 103;
					var139 = -1;
					var140 = -1;
				}

				for (int var141 = var135; var141 != var136; var141 += var137) {
					for (int var142 = var138; var142 != var139; var142 += var140) {
						int var143 = var127 + var141;
						int var144 = var128 + var142;
						for (int var145 = 0; var145 < 4; var145++) {
							if (var143 >= 0 && var144 >= 0 && var143 < 104 && var144 < 104) {
								field250[var145][var141][var142] = field250[var145][var143][var144];
							} else {
								field250[var145][var141][var142] = null;
							}
						}
					}
				}

				for (IYHIHFOL var146 = (IYHIHFOL) field176.method269(); var146 != null; var146 = (IYHIHFOL) field176.method271()) {
					var146.field809 -= var127;
					var146.field810 -= var128;
					if (var146.field809 < 0 || var146.field810 < 0 || var146.field809 >= 104 || var146.field810 >= 104) {
						var146.method221();
					}
				}

				if (field85 != 0) {
					field85 -= var127;
					field86 -= var128;
				}

				field187 = false;
				field77 = -1;
				return true;
			}

			if (field77 == 216 || field77 == 41 || field77 == 39 || field77 == 125 || field77 == 114 || field77 == 133 || field77 == 20 || field77 == 51 || field77 == 127 || field77 == 90 || field77 == 74) {
				method189(field289, field77);
				field77 = -1;
				return true;
			}

			if (field77 == 242) {
				int var147 = field289.method446();
				NPNTBMMX.method393(var147).field1007 = 3;

				if (field170.field1453 == null) {
					NPNTBMMX.method393(var147).field1008 = (field170.field1462[11] << 5) + (field170.field1462[8] << 10) + (field170.field1462[0] << 15) + (field170.field1456[0] << 25) + (field170.field1456[4] << 20) + field170.field1462[1];
				} else {
					NPNTBMMX.method393(var147).field1008 = (int) (field170.field1453.field1311 + 0x12345678L);
				}

				field77 = -1;
				return true;
			}

			if (field77 == 212) {
				field378 = field289.method422();
				field194 = field289.method439();
				field77 = -1;
				return true;
			}

			if (field77 == 31) {
				field248 = field289.method438();
				field247 = field289.method438();
				field77 = -1;
				return true;
			}

			if (field77 == 54) {
				int var148 = field289.method449();
				int var149 = field289.method448();
				NPNTBMMX var150 = NPNTBMMX.method393(var149);
				if (var150.field969 != var148 || var148 == -1) {
					var150.field969 = var148;
					var150.field990 = 0;
					var150.field1012 = 0;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 135) {
				field316 = field289.method420();
				field301 = field289.method420();
				field354 = field289.method420();
				field338 = true;
				field329 = true;
				field77 = -1;
				return true;
			}

			if (field77 == 187) {
				for (int var151 = 0; var151 < field262.length; var151++) {
					if (field262[var151] != null) {
						field262[var151].field645 = -1;
					}
				}

				for (int var152 = 0; var152 < field375.length; var152++) {
					if (field375[var152] != null) {
						field375[var152].field645 = -1;
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 167) {
				int var153 = field289.method438();
				int var154 = field289.method446();
				if (var154 == 0xFFFF) {
					var154 = -1;
				}

				if (field373[var153] != var154) {
					method200(field373[var153]);
					field373[var153] = var154;
				}

				field311 = true;
				field355 = true;
				field77 = -1;
				return true;
			}

			if (field77 == 154) {
				int var155 = field289.method447();
				int var156 = field289.method446();
				NPNTBMMX.method393(var156).field1007 = 1;
				NPNTBMMX.method393(var156).field1008 = var155;
				field77 = -1;
				return true;
			}

			if (field77 == 22) {
				int var157 = field289.method422();
				method190(var157);

				if (field343 != -1) {
					method200(field343);
					field343 = -1;
					field311 = true;
					field355 = true;
				}

				if (field392 != -1) {
					method200(field392);
					field392 = -1;
					field284 = true;
				}

				if (field326 != -1) {
					method200(field326);
					field326 = -1;
				}

				if (field270 != -1) {
					method200(field270);
					field270 = -1;
				}

				if (field275 != var157) {
					method200(field275);
					field275 = var157;
				}

				field369 = false;
				field329 = true;
				field77 = -1;
				return true;
			}

			if (field77 == 200) {
				field187 = true;
				field356 = field289.method420();
				field357 = field289.method420();
				field358 = field289.method422();
				field359 = field289.method420();
				field360 = field289.method420();
				if (field360 >= 100) {
					int var158 = field356 * 128 + 64;
					int var159 = field357 * 128 + 64;
					int var160 = method91(field148, var158, var159) - field358;
					int var161 = var158 - field226;
					int var162 = var160 - field227;
					int var163 = var159 - field228;
					int var164 = (int) Math.sqrt(var161 * var161 + var163 * var163);
					field229 = (int) (Math.atan2(var162, var164) * 325.949D) & 0x7FF;
					field230 = (int) (Math.atan2(var161, var163) * -325.949D) & 0x7FF;

					if (field229 < 128) {
						field229 = 128;
					}

					if (field229 > 383) {
						field229 = 383;
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 94) {
				field342 = field289.method420();
				field311 = true;
				field355 = true;
				field77 = -1;
				return true;
			}

			if (field77 == 72) {
				field280 = field289.method420();
				field311 = true;
				field77 = -1;
				return true;
			}

			if (field77 == 18) {
				int var165 = field289.method446();
				int var166 = field289.method446();
				int var167 = field289.method448();
				int var168 = field289.method447();
				NPNTBMMX.method393(var165).field1027 = var167;
				NPNTBMMX.method393(var165).field1028 = var168;
				NPNTBMMX.method393(var165).field1026 = var166;
				field77 = -1;
				return true;
			}

			if (field77 == 102) {
				int var169 = field289.method422();
				byte var170 = field289.method442();
				field69[var169] = var170;

				if (field322[var169] != var170) {
					field322[var169] = var170;
					method208(var169);
					field311 = true;

					if (field488 != -1) {
						field329 = true;
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 64) {
				int var171 = field289.method448();
				int var172 = field289.method446();
				int var173 = field289.method447();

				if (var171 == 0xFFFF) {
					NPNTBMMX.method393(var172).field1007 = 0;
					field77 = -1;
					return true;
				}

				IBYWZZZK var174 = IBYWZZZK.method290(var171);
				NPNTBMMX.method393(var172).field1007 = 4;
				NPNTBMMX.method393(var172).field1008 = var171;
				NPNTBMMX.method393(var172).field1027 = var174.field784;
				NPNTBMMX.method393(var172).field1028 = var174.field763;
				NPNTBMMX.method393(var172).field1026 = var174.field771 * 100 / var173;
				field77 = -1;
				return true;
			}

			if (field77 == 84) {
				int var175 = field289.method422();
				if (var175 == 0xFFFF) {
					var175 = -1;
				}

				if (field460 != var175 && field286 && !field100 && field182 == 0) {
					field200 = var175;
					field201 = true;
					field96.method230(2, field200);
				}

				field460 = var175;
				field77 = -1;
				return true;
			}

			if (field77 == 106) {
				int var176 = field289.method424();
				int var177 = field289.method446();
				if (field286 && !field100) {
					field200 = var177;
					field201 = false;
					field96.method230(2, field200);
					field182 = var176;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 95) {
				field311 = true;
				int var178 = field289.method420();
				int var179 = field289.method452();
				int var180 = field289.method438();
				field103[var180] = var179;
				field386[var180] = var178;
				field48[var180] = 1;
				for (int var181 = 0; var181 < 98; var181++) {
					if (var179 >= field88[var181]) {
						field48[var180] = var181 + 2;
					}
				}

				field77 = -1;
				return true;
			}

			if (field77 == 164) {
				int var182 = field289.method449();
				if (var182 >= 0) {
					method190(var182);
				}

				if (field298 != var182) {
					method200(field298);
					field298 = var182;
				}

				field77 = -1;
				return true;
			}

			if (field77 == 149) {
				int var183 = field289.method440();
				String var184 = field289.method427();
				int var185 = field289.method438();
				if (var185 >= 1 && var185 <= 5) {
					if (var184.equalsIgnoreCase("null")) {
						var184 = null;
					}

					field330[var185 - 1] = var184;
					field331[var185 - 1] = var183 == 0;
				}

				field77 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field77 + "," + field76 + " - " + field471 + "," + field472);
			method134();
		} catch (IOException var190) {
			method101();
		} catch (Exception var191) {
			String var187 = "T2 - " + field77 + "," + field471 + "," + field472 + " - " + field76 + "," + (field170.field658[0] + field465) + "," + (field170.field659[0] + field466) + " - ";
			for (int var188 = 0; var188 < field76 && var188 < 50; var188++) {
				var187 = var187 + field289.field1081[var188] + ",";
			}

			signlink.reporterror(var187);
			method134();
		}

		return true;
	}

	@ObfuscatedName("client.a(LTTWFVYGB;IZI)V")
	public final void method203(TTWFVYGB arg0, int arg1, int arg2) {
		int var4 = field452 + field105 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = POJFANDE.field1162[var4];
			int var7 = POJFANDE.field1163[var4];
			var6 = var6 * 256 / (field323 + 256);
			var7 = var7 * 256 / (field323 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method517(83 - var9 - arg0.field1237 / 2 - 4, var8 + 94 - arg0.field1236 / 2 + 4, field215);
			} else {
				arg0.method511(var8 + 94 + 4 - arg0.field1236 / 2, 83 - var9 - arg0.field1237 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(ILIYHIHFOL;)V")
	public final void method204(IYHIHFOL arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field808 == 0) {
			var2 = field202.method338(arg0.field807, arg0.field809, arg0.field810);
		}

		if (arg0.field808 == 1) {
			var2 = field202.method339(arg0.field810, arg0.field809, arg0.field807);
		}

		if (arg0.field808 == 2) {
			var2 = field202.method340(arg0.field807, arg0.field809, arg0.field810);
		}

		if (arg0.field808 == 3) {
			var2 = field202.method341(arg0.field807, arg0.field809, arg0.field810);
		}

		if (var2 != 0) {
			int var6 = field202.method342(arg0.field807, arg0.field809, arg0.field810, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field804 = var3;
		arg0.field806 = var4;
		arg0.field805 = var5;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method205() {
		field440 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field461) {
				field372++;
				method64();
				method64();
				method129();
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

		field440 = false;
	}

	@ObfuscatedName("client.q(B)V")
	public final void method206() {
		field167.method409(70);

		if (field343 != -1) {
			method200(field343);
			field343 = -1;
			field311 = true;
			field369 = false;
			field355 = true;
		}

		if (field275 != -1) {
			method200(field275);
			field275 = -1;
			field329 = true;
			field369 = false;
		}

		if (field392 != -1) {
			method200(field392);
			field392 = -1;
			field284 = true;
		}

		if (field326 != -1) {
			method200(field326);
			field326 = -1;
		}

		if (field270 != -1) {
			method200(field270);
			field270 = -1;
		}
	}

	@ObfuscatedName("client.K(I)Z")
	public final boolean method207() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.e(II)V")
	public final void method208(int arg0) {
		int var2 = ZWNTUTST.field1473[arg0].field1481;
		if (var2 != 0) {
			int var3 = field322[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					DJQPOKKS.method253(0.9D);
				}

				if (var3 == 2) {
					DJQPOKKS.method253(0.8D);
				}

				if (var3 == 3) {
					DJQPOKKS.method253(0.7D);
				}

				if (var3 == 4) {
					DJQPOKKS.method253(0.6D);
				}

				IBYWZZZK.field765.method601();
				field284 = true;
			}

			if (var2 == 3) {
				boolean var4 = field286;

				if (var3 == 0) {
					method80(field286, 0);
					field286 = true;
				}

				if (var3 == 1) {
					method80(field286, -400);
					field286 = true;
				}

				if (var3 == 2) {
					method80(field286, -800);
					field286 = true;
				}

				if (var3 == 3) {
					method80(field286, -1200);
					field286 = true;
				}

				if (var3 == 4) {
					field286 = false;
				}

				if (field286 != var4 && !field100) {
					if (field286) {
						field200 = field460;
						field201 = true;
						field96.method230(2, field200);
					} else {
						method132();
					}

					field182 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field415 = true;
					method167(0);
				}

				if (var3 == 1) {
					field415 = true;
					method167(-400);
				}

				if (var3 == 2) {
					field415 = true;
					method167(-800);
				}

				if (var3 == 3) {
					field415 = true;
					method167(-1200);
				}

				if (var3 == 4) {
					field415 = false;
				}
			}

			if (var2 == 5) {
				field455 = var3;
			}

			if (var2 == 6) {
				field276 = var3;
			}

			if (var2 == 8) {
				field403 = var3;
				field329 = true;
			}

			if (var2 == 9) {
				field346 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field406.method371(arg4, arg3);
		field407.method371(arg4, arg2 + arg3 - 16);
		YYTDUXDR.method581(arg4, field169, 16, arg2 - 32, arg3 + 16);
		int var6 = (arg2 - 32) * arg2 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg1 / (arg0 - arg2);
		YYTDUXDR.method581(arg4, field419, 16, var6, arg3 + var7 + 16);
		YYTDUXDR.method586(arg3 + var7 + 16, var6, arg4, field183);
		YYTDUXDR.method586(arg3 + var7 + 16, var6, arg4 + 1, field183);
		YYTDUXDR.method584(field183, 16, arg3 + var7 + 16, arg4);
		YYTDUXDR.method584(field183, 16, arg3 + var7 + 17, arg4);
		YYTDUXDR.method586(arg3 + var7 + 16, var6, arg4 + 15, field300);
		YYTDUXDR.method586(arg3 + var7 + 17, var6 - 1, arg4 + 14, field300);
		YYTDUXDR.method584(field300, 16, arg3 + var7 + var6 + 15, arg4);
		YYTDUXDR.method584(field300, 15, arg3 + var7 + var6 + 14, arg4 + 1);
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field88[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field184[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
