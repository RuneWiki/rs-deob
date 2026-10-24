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
public final class client extends HJHAUOBE {

	@ObfuscatedName("client.L")
	public YFAYUBGF[] field115 = new YFAYUBGF[5];

	@ObfuscatedName("client.M")
	public int field116 = 0x4D4233;

	@ObfuscatedName("client.N")
	public String field117 = "";

	@ObfuscatedName("client.O")
	public int[] field118 = new int[5];

	@ObfuscatedName("client.R")
	public long[] field120 = new long[100];

	@ObfuscatedName("client.W")
	public int field124 = -1;

	@ObfuscatedName("client.X")
	public PQBRPYKE field125 = PQBRPYKE.method328(1);

	@ObfuscatedName("client.Y")
	public int field126 = -1;

	@ObfuscatedName("client.bb")
	public int[] field129 = new int[256];

	@ObfuscatedName("client.db")
	public String field130 = "";

	@ObfuscatedName("client.fb")
	public int field132 = 2;

	@ObfuscatedName("client.hb")
	public int field134 = 1;

	@ObfuscatedName("client.ib")
	public PQBRPYKE field135 = PQBRPYKE.method328(1);

	@ObfuscatedName("client.qb")
	public WQACZBNG[] field141 = new WQACZBNG[8];

	@ObfuscatedName("client.wb")
	public int field146 = -1;

	@ObfuscatedName("client.yb")
	public boolean field147 = false;

	@ObfuscatedName("client.Ab")
	public String field148 = "";

	@ObfuscatedName("client.Cb")
	public String[] field150 = new String[100];

	@ObfuscatedName("client.Db")
	public int[] field151 = new int[100];

	@ObfuscatedName("client.Fb")
	public boolean field153 = false;

	@ObfuscatedName("client.Hb")
	public VEIVHFHZ[] field155 = new VEIVHFHZ[100];

	@ObfuscatedName("client.Ib")
	public VEIVHFHZ[] field156 = new VEIVHFHZ[2];

	@ObfuscatedName("client.Jb")
	public int[][] field157 = new int[104][104];

	@ObfuscatedName("client.Mb")
	public boolean field159 = false;

	@ObfuscatedName("client.Ob")
	public int[] field160 = new int[5];

	@ObfuscatedName("client.Qb")
	public boolean field162 = false;

	@ObfuscatedName("client.Rb")
	public int[] field163 = new int[500];

	@ObfuscatedName("client.Sb")
	public int[] field164 = new int[500];

	@ObfuscatedName("client.Tb")
	public int[] field165 = new int[500];

	@ObfuscatedName("client.Ub")
	public int[] field166 = new int[500];

	@ObfuscatedName("client.Vb")
	public boolean field167 = false;

	@ObfuscatedName("client.Xb")
	public int field169 = -1;

	@ObfuscatedName("client.Yb")
	public int[] field170 = new int[50];

	@ObfuscatedName("client.bc")
	public int[] field171 = new int[33];

	@ObfuscatedName("client.oc")
	public int[] field182 = new int[50];

	@ObfuscatedName("client.pc")
	public boolean field183 = true;

	@ObfuscatedName("client.rc")
	public String field185 = "";

	@ObfuscatedName("client.sc")
	public String field186 = "";

	@ObfuscatedName("client.Ic")
	public boolean field202 = false;

	@ObfuscatedName("client.Mc")
	public String[] field205 = new String[500];

	@ObfuscatedName("client.Pc")
	public int field208 = -1;

	@ObfuscatedName("client.Qc")
	public int[][] field209 = new int[104][104];

	@ObfuscatedName("client.Yc")
	public boolean field217 = false;

	@ObfuscatedName("client.ad")
	public byte[] field218 = new byte[16384];

	@ObfuscatedName("client.ed")
	public ATOBWHST field222 = new ATOBWHST();

	@ObfuscatedName("client.hd")
	public int field224 = 2;

	@ObfuscatedName("client.nd")
	public int field229 = -1;

	@ObfuscatedName("client.qd")
	public int[] field232 = new int[1000];

	@ObfuscatedName("client.rd")
	public int[] field233 = new int[1000];

	@ObfuscatedName("client.td")
	public int field235 = -1;

	@ObfuscatedName("client.vd")
	public int[] field237 = new int[BOBVWIJF.field91];

	@ObfuscatedName("client.wd")
	public EOSBSGLH[] field238 = new EOSBSGLH[4];

	@ObfuscatedName("client.yd")
	public boolean field240 = false;

	@ObfuscatedName("client.zd")
	public PQBRPYKE field241 = new PQBRPYKE(new byte[5000]);

	@ObfuscatedName("client.Ad")
	public TBFTCCSF[] field242 = new TBFTCCSF[16384];

	@ObfuscatedName("client.Cd")
	public int[] field244 = new int[16384];

	@ObfuscatedName("client.Md")
	public boolean field254 = false;

	@ObfuscatedName("client.Ud")
	public int field261 = 2;

	@ObfuscatedName("client.de")
	public VGFLNLXH field267 = new VGFLNLXH();

	@ObfuscatedName("client.je")
	public VGFLNLXH field273 = new VGFLNLXH();

	@ObfuscatedName("client.qe")
	public int field280 = -1;

	@ObfuscatedName("client.xe")
	public int[] field286 = new int[151];

	@ObfuscatedName("client.Ge")
	public int[] field295 = new int[7];

	@ObfuscatedName("client.Ke")
	public WQACZBNG[] field298 = new WQACZBNG[32];

	@ObfuscatedName("client.Re")
	public int field305 = -1;

	@ObfuscatedName("client.We")
	public boolean field310 = false;

	@ObfuscatedName("client.Xe")
	public final int field311 = 100;

	@ObfuscatedName("client.Ye")
	public int[] field312 = new int[100];

	@ObfuscatedName("client.Ze")
	public boolean field313 = false;

	@ObfuscatedName("client.ef")
	public String field317 = "";

	@ObfuscatedName("client.ff")
	public final int[] field318 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.gf")
	public int[] field319 = new int[9];

	@ObfuscatedName("client.kf")
	public String[] field322 = new String[5];

	@ObfuscatedName("client.lf")
	public boolean[] field323 = new boolean[5];

	@ObfuscatedName("client.mf")
	public String[] field324 = new String[200];

	@ObfuscatedName("client.vf")
	public volatile boolean field332 = false;

	@ObfuscatedName("client.wf")
	public String field333 = "";

	@ObfuscatedName("client.xf")
	public int[][] field334 = new int[104][104];

	@ObfuscatedName("client.Ff")
	public WQACZBNG[] field341 = new WQACZBNG[20];

	@ObfuscatedName("client.Hf")
	public boolean field343 = false;

	@ObfuscatedName("client.Jf")
	public int[] field345 = new int[200];

	@ObfuscatedName("client.Pf")
	public int[] field351 = new int[5];

	@ObfuscatedName("client.Rf")
	public VGFLNLXH field352 = new VGFLNLXH();

	@ObfuscatedName("client.Xf")
	public int[] field356 = new int[2000];

	@ObfuscatedName("client.Zf")
	public boolean field357 = false;

	@ObfuscatedName("client.gg")
	public boolean field364 = false;

	@ObfuscatedName("client.mg")
	public boolean field370 = true;

	@ObfuscatedName("client.pg")
	public volatile boolean field373 = false;

	@ObfuscatedName("client.vg")
	public CRC32 field377 = new CRC32();

	@ObfuscatedName("client.Ag")
	public int field381 = 0x766654;

	@ObfuscatedName("client.Bg")
	public int[] field382 = new int[BOBVWIJF.field91];

	@ObfuscatedName("client.Cg")
	public int[] field383 = new int[100];

	@ObfuscatedName("client.Dg")
	public String[] field384 = new String[100];

	@ObfuscatedName("client.Eg")
	public String[] field385 = new String[100];

	@ObfuscatedName("client.Fg")
	public boolean field386 = true;

	@ObfuscatedName("client.Rg")
	public WQACZBNG[] field395 = new WQACZBNG[32];

	@ObfuscatedName("client.Tg")
	public int field397 = 1;

	@ObfuscatedName("client.Vg")
	public int[] field399 = new int[4000];

	@ObfuscatedName("client.Wg")
	public int[] field400 = new int[4000];

	@ObfuscatedName("client.Xg")
	public int field401 = -1;

	@ObfuscatedName("client.Zg")
	public VEIVHFHZ[] field402 = new VEIVHFHZ[13];

	@ObfuscatedName("client.bh")
	public int field403 = -1;

	@ObfuscatedName("client.mh")
	public boolean field412 = false;

	@ObfuscatedName("client.oh")
	public WQACZBNG[] field413 = new WQACZBNG[100];

	@ObfuscatedName("client.ph")
	public WQACZBNG[] field414 = new WQACZBNG[1000];

	@ObfuscatedName("client.qh")
	public int[] field415 = new int[BOBVWIJF.field91];

	@ObfuscatedName("client.rh")
	public VGFLNLXH[][][] field416 = new VGFLNLXH[4][104][104];

	@ObfuscatedName("client.th")
	public String field417 = "";

	@ObfuscatedName("client.uh")
	public String field418 = "";

	@ObfuscatedName("client.wh")
	public boolean field420 = false;

	@ObfuscatedName("client.xh")
	public boolean field421 = false;

	@ObfuscatedName("client.yh")
	public int field422 = 2048;

	@ObfuscatedName("client.zh")
	public int field423 = 2047;

	@ObfuscatedName("client.Ah")
	public TPTANZXN[] field424 = new TPTANZXN[field422];

	@ObfuscatedName("client.Ch")
	public int[] field426 = new int[field422];

	@ObfuscatedName("client.Eh")
	public int[] field428 = new int[field422];

	@ObfuscatedName("client.Fh")
	public PQBRPYKE[] field429 = new PQBRPYKE[field422];

	@ObfuscatedName("client.Mh")
	public int field436 = 0x23201B;

	@ObfuscatedName("client.Nh")
	public WQACZBNG[] field437 = new WQACZBNG[32];

	@ObfuscatedName("client.Rh")
	public boolean[] field441 = new boolean[5];

	@ObfuscatedName("client.Vh")
	public boolean field444 = true;

	@ObfuscatedName("client.Wh")
	public int field445 = 78;

	@ObfuscatedName("client.bi")
	public int field450 = -1;

	@ObfuscatedName("client.ci")
	public int field451 = -1;

	@ObfuscatedName("client.si")
	public int[][][] field467 = new int[4][13][13];

	@ObfuscatedName("client.vi")
	public int field470 = 0x332D25;

	@ObfuscatedName("client.wi")
	public int[] field471 = new int[33];

	@ObfuscatedName("client.yi")
	public int field472 = 3;

	@ObfuscatedName("client.Fi")
	public long[] field479 = new long[200];

	@ObfuscatedName("client.Li")
	public int[] field485 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Ti")
	public int field491 = 50;

	@ObfuscatedName("client.Ui")
	public int[] field492 = new int[field491];

	@ObfuscatedName("client.Vi")
	public int[] field493 = new int[field491];

	@ObfuscatedName("client.Wi")
	public int[] field494 = new int[field491];

	@ObfuscatedName("client.Xi")
	public int[] field495 = new int[field491];

	@ObfuscatedName("client.Yi")
	public int[] field496 = new int[field491];

	@ObfuscatedName("client.Zi")
	public int[] field497 = new int[field491];

	@ObfuscatedName("client.aj")
	public int[] field498 = new int[field491];

	@ObfuscatedName("client.bj")
	public String[] field499 = new String[field491];

	@ObfuscatedName("client.cj")
	public int[] field500 = new int[50];

	@ObfuscatedName("client.gj")
	public boolean field504 = false;

	@ObfuscatedName("client.ij")
	public volatile boolean field506 = false;

	@ObfuscatedName("client.mj")
	public PQBRPYKE field509 = PQBRPYKE.method328(1);

	@ObfuscatedName("client.oj")
	public String field511 = "";

	@ObfuscatedName("client.vj")
	public int field517 = -1;

	@ObfuscatedName("client.xj")
	public boolean field519 = false;

	@ObfuscatedName("client.yj")
	public int[] field520 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Dj")
	public int[] field524 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Kj")
	public boolean field531 = false;

	@ObfuscatedName("client.Lj")
	public int[] field532 = new int[151];

	@ObfuscatedName("client.Mj")
	public int[] field533 = new int[5];

	@ObfuscatedName("client.Sj")
	public int field539 = -1;

	@ObfuscatedName("client.Vj")
	public int[] field542 = new int[1000];

	@ObfuscatedName("client.Xj")
	public boolean field544 = false;

	@ObfuscatedName("client.Yj")
	public int[] field545 = new int[2000];

	@ObfuscatedName("client.bk")
	public int field547 = -1;

	@ObfuscatedName("client.ck")
	public boolean field548 = false;

	@ObfuscatedName("client.dk")
	public int field549 = 128;

	@ObfuscatedName("client.hk")
	public int[] field553 = new int[5];

	@ObfuscatedName("client.ik")
	public boolean field554 = true;

	@ObfuscatedName("client.Lc")
	public static int[] field204 = new int[32];

	@ObfuscatedName("client.id")
	public static int field225 = 10;

	@ObfuscatedName("client.kd")
	public static boolean field227 = true;

	@ObfuscatedName("client.lh")
	public static String field411 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Qh")
	public static int[] field440 = new int[99];

	@ObfuscatedName("client.Sh")
	public static BigInteger field442 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.ti")
	public static final int[][] field468 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.lj")
	public static BigInteger field508 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ej")
	public static final int[] field525 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.U")
	public int field122;

	@ObfuscatedName("client.V")
	public int field123;

	@ObfuscatedName("client.Z")
	public static int field127;

	@ObfuscatedName("client.eb")
	public int field131;

	@ObfuscatedName("client.gb")
	public int field133;

	@ObfuscatedName("client.jb")
	public int field136;

	@ObfuscatedName("client.kb")
	public int field137;

	@ObfuscatedName("client.lb")
	public int field138;

	@ObfuscatedName("client.nb")
	public int field139;

	@ObfuscatedName("client.pb")
	public int field140;

	@ObfuscatedName("client.rb")
	public int field142;

	@ObfuscatedName("client.tb")
	public int field143;

	@ObfuscatedName("client.ub")
	public int field144;

	@ObfuscatedName("client.Bb")
	public int field149;

	@ObfuscatedName("client.Eb")
	public int field152;

	@ObfuscatedName("client.Gb")
	public int field154;

	@ObfuscatedName("client.Lb")
	public int field158;

	@ObfuscatedName("client.Pb")
	public int field161;

	@ObfuscatedName("client.Wb")
	public int field168;

	@ObfuscatedName("client.mc")
	public int field181;

	@ObfuscatedName("client.qc")
	public int field184;

	@ObfuscatedName("client.Cc")
	public static int field196;

	@ObfuscatedName("client.Dc")
	public int field197;

	@ObfuscatedName("client.Ec")
	public int field198;

	@ObfuscatedName("client.Fc")
	public int field199;

	@ObfuscatedName("client.Gc")
	public int field200;

	@ObfuscatedName("client.Hc")
	public int field201;

	@ObfuscatedName("client.Kc")
	public static int field203;

	@ObfuscatedName("client.Vc")
	public int field214;

	@ObfuscatedName("client.Wc")
	public int field215;

	@ObfuscatedName("client.Xc")
	public int field216;

	@ObfuscatedName("client.bd")
	public int field219;

	@ObfuscatedName("client.gd")
	public int field223;

	@ObfuscatedName("client.jd")
	public static int field226;

	@ObfuscatedName("client.od")
	public int field230;

	@ObfuscatedName("client.pd")
	public int field231;

	@ObfuscatedName("client.sd")
	public static int field234;

	@ObfuscatedName("client.ud")
	public int field236;

	@ObfuscatedName("client.Bd")
	public int field243;

	@ObfuscatedName("client.Dd")
	public int field245;

	@ObfuscatedName("client.Ed")
	public int field246;

	@ObfuscatedName("client.Fd")
	public int field247;

	@ObfuscatedName("client.Gd")
	public int field248;

	@ObfuscatedName("client.Hd")
	public int field249;

	@ObfuscatedName("client.Id")
	public static int field250;

	@ObfuscatedName("client.Nd")
	public int field255;

	@ObfuscatedName("client.Od")
	public int field256;

	@ObfuscatedName("client.Pd")
	public int field257;

	@ObfuscatedName("client.Qd")
	public int field258;

	@ObfuscatedName("client.Rd")
	public int field259;

	@ObfuscatedName("client.Td")
	public int field260;

	@ObfuscatedName("client.Vd")
	public int field262;

	@ObfuscatedName("client.Xd")
	public int field264;

	@ObfuscatedName("client.Yd")
	public int field265;

	@ObfuscatedName("client.Zd")
	public static int field266;

	@ObfuscatedName("client.fe")
	public static int field269;

	@ObfuscatedName("client.oe")
	public int field278;

	@ObfuscatedName("client.pe")
	public static int field279;

	@ObfuscatedName("client.se")
	public int field282;

	@ObfuscatedName("client.te")
	public int field283;

	@ObfuscatedName("client.ze")
	public int field288;

	@ObfuscatedName("client.Ee")
	public int field293;

	@ObfuscatedName("client.Fe")
	public int field294;

	@ObfuscatedName("client.He")
	public static int field296;

	@ObfuscatedName("client.Le")
	public int field299;

	@ObfuscatedName("client.Me")
	public int field300;

	@ObfuscatedName("client.Ne")
	public int field301;

	@ObfuscatedName("client.Oe")
	public int field302;

	@ObfuscatedName("client.Pe")
	public int field303;

	@ObfuscatedName("client.Qe")
	public int field304;

	@ObfuscatedName("client.Te")
	public int field307;

	@ObfuscatedName("client.Ue")
	public int field308;

	@ObfuscatedName("client.af")
	public int field314;

	@ObfuscatedName("client.df")
	public int field316;

	@ObfuscatedName("client.hf")
	public int field320;

	@ObfuscatedName("client.jf")
	public int field321;

	@ObfuscatedName("client.nf")
	public int field325;

	@ObfuscatedName("client.uf")
	public int field331;

	@ObfuscatedName("client.yf")
	public int field335;

	@ObfuscatedName("client.zf")
	public int field336;

	@ObfuscatedName("client.Af")
	public int field337;

	@ObfuscatedName("client.Bf")
	public int field338;

	@ObfuscatedName("client.Cf")
	public static int field339;

	@ObfuscatedName("client.Df")
	public int field340;

	@ObfuscatedName("client.Gf")
	public static int field342;

	@ObfuscatedName("client.If")
	public int field344;

	@ObfuscatedName("client.Kf")
	public int field346;

	@ObfuscatedName("client.Lf")
	public int field347;

	@ObfuscatedName("client.Mf")
	public int field348;

	@ObfuscatedName("client.Nf")
	public int field349;

	@ObfuscatedName("client.Of")
	public int field350;

	@ObfuscatedName("client.Tf")
	public int field353;

	@ObfuscatedName("client.Uf")
	public int field354;

	@ObfuscatedName("client.Vf")
	public int field355;

	@ObfuscatedName("client.ag")
	public int field358;

	@ObfuscatedName("client.bg")
	public int field359;

	@ObfuscatedName("client.cg")
	public int field360;

	@ObfuscatedName("client.dg")
	public int field361;

	@ObfuscatedName("client.eg")
	public int field362;

	@ObfuscatedName("client.fg")
	public int field363;

	@ObfuscatedName("client.hg")
	public int field365;

	@ObfuscatedName("client.ig")
	public int field366;

	@ObfuscatedName("client.jg")
	public int field367;

	@ObfuscatedName("client.kg")
	public int field368;

	@ObfuscatedName("client.lg")
	public int field369;

	@ObfuscatedName("client.ng")
	public int field371;

	@ObfuscatedName("client.og")
	public int field372;

	@ObfuscatedName("client.ug")
	public int field376;

	@ObfuscatedName("client.Hg")
	public int field387;

	@ObfuscatedName("client.Og")
	public int field392;

	@ObfuscatedName("client.Sg")
	public int field396;

	@ObfuscatedName("client.Ug")
	public int field398;

	@ObfuscatedName("client.ch")
	public int field404;

	@ObfuscatedName("client.vh")
	public int field419;

	@ObfuscatedName("client.Bh")
	public int field425;

	@ObfuscatedName("client.Dh")
	public int field427;

	@ObfuscatedName("client.Gh")
	public int field430;

	@ObfuscatedName("client.Hh")
	public int field431;

	@ObfuscatedName("client.Ih")
	public int field432;

	@ObfuscatedName("client.Jh")
	public int field433;

	@ObfuscatedName("client.Lh")
	public static int field435;

	@ObfuscatedName("client.Oh")
	public int field438;

	@ObfuscatedName("client.Ph")
	public int field439;

	@ObfuscatedName("client.Uh")
	public int field443;

	@ObfuscatedName("client.di")
	public int field452;

	@ObfuscatedName("client.gi")
	public int field455;

	@ObfuscatedName("client.hi")
	public int field456;

	@ObfuscatedName("client.ii")
	public int field457;

	@ObfuscatedName("client.ji")
	public int field458;

	@ObfuscatedName("client.ki")
	public int field459;

	@ObfuscatedName("client.li")
	public int field460;

	@ObfuscatedName("client.ni")
	public int field462;

	@ObfuscatedName("client.oi")
	public int field463;

	@ObfuscatedName("client.pi")
	public int field464;

	@ObfuscatedName("client.qi")
	public int field465;

	@ObfuscatedName("client.ri")
	public int field466;

	@ObfuscatedName("client.ui")
	public int field469;

	@ObfuscatedName("client.zi")
	public int field473;

	@ObfuscatedName("client.Ci")
	public int field476;

	@ObfuscatedName("client.Di")
	public int field477;

	@ObfuscatedName("client.Ei")
	public static int field478;

	@ObfuscatedName("client.Gi")
	public int field480;

	@ObfuscatedName("client.Hi")
	public int field481;

	@ObfuscatedName("client.Ii")
	public int field482;

	@ObfuscatedName("client.Ji")
	public int field483;

	@ObfuscatedName("client.Ki")
	public int field484;

	@ObfuscatedName("client.Mi")
	public int field486;

	@ObfuscatedName("client.Ni")
	public int field487;

	@ObfuscatedName("client.Pi")
	public int field489;

	@ObfuscatedName("client.Si")
	public int field490;

	@ObfuscatedName("client.dj")
	public int field501;

	@ObfuscatedName("client.ej")
	public int field502;

	@ObfuscatedName("client.jj")
	public int field507;

	@ObfuscatedName("client.nj")
	public static int field510;

	@ObfuscatedName("client.wj")
	public int field518;

	@ObfuscatedName("client.Fj")
	public static int field526;

	@ObfuscatedName("client.Nj")
	public int field534;

	@ObfuscatedName("client.Oj")
	public int field535;

	@ObfuscatedName("client.Pj")
	public int field536;

	@ObfuscatedName("client.Qj")
	public int field537;

	@ObfuscatedName("client.Tj")
	public int field540;

	@ObfuscatedName("client.Uj")
	public int field541;

	@ObfuscatedName("client.Wj")
	public int field543;

	@ObfuscatedName("client.ek")
	public int field550;

	@ObfuscatedName("client.fk")
	public int field551;

	@ObfuscatedName("client.gk")
	public int field552;

	@ObfuscatedName("client.jk")
	public int field555;

	@ObfuscatedName("client.kk")
	public int field556;

	@ObfuscatedName("client.vb")
	public long field145;

	@ObfuscatedName("client.Ve")
	public long field309;

	@ObfuscatedName("client.hj")
	public long field505;

	@ObfuscatedName("client.Gj")
	public long field527;

	@ObfuscatedName("client.Zj")
	public long field546;

	@ObfuscatedName("client.cc")
	public DRNBRPSO field172;

	@ObfuscatedName("client.dc")
	public DRNBRPSO field173;

	@ObfuscatedName("client.ec")
	public DRNBRPSO field174;

	@ObfuscatedName("client.fc")
	public DRNBRPSO field175;

	@ObfuscatedName("client.gc")
	public DRNBRPSO field176;

	@ObfuscatedName("client.hc")
	public DRNBRPSO field177;

	@ObfuscatedName("client.ic")
	public DRNBRPSO field178;

	@ObfuscatedName("client.jc")
	public DRNBRPSO field179;

	@ObfuscatedName("client.kc")
	public DRNBRPSO field180;

	@ObfuscatedName("client.tc")
	public DRNBRPSO field187;

	@ObfuscatedName("client.uc")
	public DRNBRPSO field188;

	@ObfuscatedName("client.vc")
	public DRNBRPSO field189;

	@ObfuscatedName("client.wc")
	public DRNBRPSO field190;

	@ObfuscatedName("client.xc")
	public DRNBRPSO field191;

	@ObfuscatedName("client.yc")
	public DRNBRPSO field192;

	@ObfuscatedName("client.zc")
	public DRNBRPSO field193;

	@ObfuscatedName("client.Ac")
	public DRNBRPSO field194;

	@ObfuscatedName("client.Bc")
	public DRNBRPSO field195;

	@ObfuscatedName("client.Ae")
	public DRNBRPSO field289;

	@ObfuscatedName("client.Be")
	public DRNBRPSO field290;

	@ObfuscatedName("client.Ce")
	public DRNBRPSO field291;

	@ObfuscatedName("client.De")
	public DRNBRPSO field292;

	@ObfuscatedName("client.Hj")
	public DRNBRPSO field528;

	@ObfuscatedName("client.Ij")
	public DRNBRPSO field529;

	@ObfuscatedName("client.Jj")
	public DRNBRPSO field530;

	@ObfuscatedName("client.xd")
	public QUPTMIEH field239;

	@ObfuscatedName("client.ab")
	public static TPTANZXN field128;

	@ObfuscatedName("client.Wd")
	public TVERLIYS field263;

	@ObfuscatedName("client.dh")
	public UMNOCQQA field405;

	@ObfuscatedName("client.we")
	public UVFIVFPB field285;

	@ObfuscatedName("client.cd")
	public VEIVHFHZ field220;

	@ObfuscatedName("client.dd")
	public VEIVHFHZ field221;

	@ObfuscatedName("client.Jd")
	public VEIVHFHZ field251;

	@ObfuscatedName("client.Kd")
	public VEIVHFHZ field252;

	@ObfuscatedName("client.Ld")
	public VEIVHFHZ field253;

	@ObfuscatedName("client.he")
	public VEIVHFHZ field271;

	@ObfuscatedName("client.ie")
	public VEIVHFHZ field272;

	@ObfuscatedName("client.of")
	public VEIVHFHZ field326;

	@ObfuscatedName("client.pf")
	public VEIVHFHZ field327;

	@ObfuscatedName("client.qf")
	public VEIVHFHZ field328;

	@ObfuscatedName("client.rf")
	public VEIVHFHZ field329;

	@ObfuscatedName("client.sf")
	public VEIVHFHZ field330;

	@ObfuscatedName("client.xg")
	public VEIVHFHZ field378;

	@ObfuscatedName("client.yg")
	public VEIVHFHZ field379;

	@ObfuscatedName("client.zg")
	public VEIVHFHZ field380;

	@ObfuscatedName("client.pj")
	public VEIVHFHZ field512;

	@ObfuscatedName("client.qj")
	public VEIVHFHZ field513;

	@ObfuscatedName("client.rj")
	public VEIVHFHZ field514;

	@ObfuscatedName("client.sj")
	public VEIVHFHZ field515;

	@ObfuscatedName("client.tj")
	public VEIVHFHZ field516;

	@ObfuscatedName("client.Nc")
	public WQACZBNG field206;

	@ObfuscatedName("client.Oc")
	public WQACZBNG field207;

	@ObfuscatedName("client.Ie")
	public WQACZBNG field297;

	@ObfuscatedName("client.Pg")
	public WQACZBNG field393;

	@ObfuscatedName("client.Qg")
	public WQACZBNG field394;

	@ObfuscatedName("client.gh")
	public WQACZBNG field406;

	@ObfuscatedName("client.hh")
	public WQACZBNG field407;

	@ObfuscatedName("client.ih")
	public WQACZBNG field408;

	@ObfuscatedName("client.jh")
	public WQACZBNG field409;

	@ObfuscatedName("client.kh")
	public WQACZBNG field410;

	@ObfuscatedName("client.ai")
	public WQACZBNG field449;

	@ObfuscatedName("client.mi")
	public WQACZBNG field461;

	@ObfuscatedName("client.Ai")
	public WQACZBNG field474;

	@ObfuscatedName("client.Bi")
	public WQACZBNG field475;

	@ObfuscatedName("client.Oi")
	public WQACZBNG field488;

	@ObfuscatedName("client.ye")
	public WUYFIEBK field287;

	@ObfuscatedName("client.Q")
	public XOJZVVDK field119;

	@ObfuscatedName("client.Rc")
	public ZFUOSNLM field210;

	@ObfuscatedName("client.Sc")
	public ZFUOSNLM field211;

	@ObfuscatedName("client.Tc")
	public ZFUOSNLM field212;

	@ObfuscatedName("client.Uc")
	public ZFUOSNLM field213;

	@ObfuscatedName("client.ge")
	public String field270;

	@ObfuscatedName("client.cf")
	public String field315;

	@ObfuscatedName("client.Kh")
	public String field434;

	@ObfuscatedName("client.Rj")
	public String field538;

	@ObfuscatedName("client.Se")
	public Socket field306;

	@ObfuscatedName("client.S")
	public static boolean field121;

	@ObfuscatedName("client.ld")
	public static boolean field228;

	@ObfuscatedName("client.ee")
	public static boolean field268;

	@ObfuscatedName("client.re")
	public static boolean field281;

	@ObfuscatedName("client.ke")
	public int[] field274;

	@ObfuscatedName("client.le")
	public int[] field275;

	@ObfuscatedName("client.me")
	public int[] field276;

	@ObfuscatedName("client.ne")
	public int[] field277;

	@ObfuscatedName("client.sg")
	public int[] field374;

	@ObfuscatedName("client.tg")
	public int[] field375;

	@ObfuscatedName("client.Ig")
	public int[] field388;

	@ObfuscatedName("client.Jg")
	public int[] field389;

	@ObfuscatedName("client.Kg")
	public int[] field390;

	@ObfuscatedName("client.Lg")
	public int[] field391;

	@ObfuscatedName("client.Xh")
	public int[] field446;

	@ObfuscatedName("client.Yh")
	public int[] field447;

	@ObfuscatedName("client.Zh")
	public int[] field448;

	@ObfuscatedName("client.zj")
	public int[] field521;

	@ObfuscatedName("client.Aj")
	public int[] field522;

	@ObfuscatedName("client.fi")
	public VEIVHFHZ[] field454;

	@ObfuscatedName("client.ve")
	public byte[][] field284;

	@ObfuscatedName("client.Bj")
	public byte[][] field523;

	@ObfuscatedName("client.fj")
	public byte[][][] field503;

	@ObfuscatedName("client.ei")
	public int[][][] field453;

	@ObfuscatedName("client.g(I)V")
	public final void method16() {
		field490 = 0;
		for (int var1 = -1; var1 < field425 + field243; var1++) {
			XOZCTLMB var2;
			if (var1 == -1) {
				var2 = field128;
			} else if (var1 < field425) {
				var2 = field424[field426[var1]];
			} else {
				var2 = field242[field244[var1 - field425]];
			}

			if (var2 != null && var2.method442()) {
				if (var2 instanceof TBFTCCSF) {
					JRELGTVY var3 = ((TBFTCCSF) var2).field1187;
					if (var3.field928 != null) {
						var3 = var3.method266();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field425) {
					JRELGTVY var6 = ((TBFTCCSF) var2).field1187;
					if (var6.field944 >= 0 && var6.field944 < field437.length) {
						method52(var2.field1421 + 15, var2);

						if (field450 > -1) {
							field437[var6.field944].method548(field451 - 30, field450 - 12);
						}
					}

					if (field452 == 1 && field244[var1 - field425] == field144 && field526 % 20 < 10) {
						method52(var2.field1421 + 15, var2);

						if (field450 > -1) {
							field395[0].method548(field451 - 28, field450 - 12);
						}
					}
				} else {
					int var4 = 30;
					TPTANZXN var5 = (TPTANZXN) var2;
					if (var5.field1253 != -1 || var5.field1255 != -1) {
						method52(var2.field1421 + 15, var2);

						if (field450 > -1) {
							if (var5.field1253 != -1) {
								field298[var5.field1253].method548(field451 - var4, field450 - 12);
								var4 += 25;
							}

							if (var5.field1255 != -1) {
								field437[var5.field1255].method548(field451 - var4, field450 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field452 == 10 && field426[var1] == field136) {
						method52(var2.field1421 + 15, var2);

						if (field450 > -1) {
							field395[1].method548(field451 - var4, field450 - 12);
						}
					}
				}

				if (var2.field1429 != null && (var1 >= field425 || field371 == 0 || field371 == 3 || field371 == 1 && method137(((TPTANZXN) var2).field1261))) {
					method52(var2.field1421, var2);

					if (field450 > -1 && field490 < field491) {
						field495[field490] = field212.method589(var2.field1429) / 2;
						field494[field490] = field212.field1501;
						field492[field490] = field450;
						field493[field490] = field451;
						field496[field490] = var2.field1413;
						field497[field490] = var2.field1423;
						field498[field490] = var2.field1417;
						field499[field490++] = var2.field1429;

						if (field264 == 0 && var2.field1423 >= 1 && var2.field1423 <= 3) {
							field494[field490] += 10;
							field493[field490] += 5;
						}

						if (field264 == 0 && var2.field1423 == 4) {
							field495[field490] = 60;
						}

						if (field264 == 0 && var2.field1423 == 5) {
							field494[field490] += 5;
						}
					}
				}

				if (var2.field1376 > field526) {
					method52(var2.field1421 + 15, var2);

					if (field450 > -1) {
						int var7 = var2.field1377 * 30 / var2.field1378;
						if (var7 > 30) {
							var7 = 30;
						}

						NBXZFIDS.method291(field450 - 15, var7, field451 - 3, 0xFF00, 5);
						NBXZFIDS.method291(field450 + var7 - 15, 30 - var7, field451 - 3, 0xFF0000, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1395[var8] > field526) {
						method52(var2.field1421 / 2, var2);

						if (field450 > -1) {
							if (var8 == 1) {
								field451 -= 20;
							}

							if (var8 == 2) {
								field450 -= 15;
								field451 -= 10;
							}

							if (var8 == 3) {
								field450 += 15;
								field451 -= 10;
							}

							field341[var2.field1394[var8]].method548(field451 - 12, field450 - 12);
							field210.method586(String.valueOf(var2.field1393[var8]), field450, 0, field451 + 4);
							field210.method586(String.valueOf(var2.field1393[var8]), field450 - 1, 0xFFFFFF, field451 + 3);
						}
					}
				}
			}
		}

		field510++;
		if (field510 > 1485) {
			field510 = 0;
			field125.method329(254);
			field125.method330(0);
			int var9 = field125.field1091;
			field125.method330(155);
			field125.method331(29543);
			field125.method330((int) (Math.random() * 256.0D));
			field125.method330((int) (Math.random() * 256.0D));
			field125.method330((int) (Math.random() * 256.0D));
			field125.method330((int) (Math.random() * 256.0D));
			field125.method331(42538);
			field125.method330((int) (Math.random() * 256.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field125.method331(6785);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field125.method331(34515);
			}

			field125.method339(field125.field1091 - var9);
		}

		for (int var10 = 0; var10 < field490; var10++) {
			int var11 = field492[var10];
			int var12 = field493[var10];
			int var13 = field495[var10];
			int var14 = field494[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field493[var16] - field494[var16] && var12 - var14 < field493[var16] + 2 && var11 - var13 < field495[var16] + field492[var16] && var11 + var13 > field492[var16] - field495[var16] && field493[var16] - field494[var16] < var12) {
						var12 = field493[var16] - field494[var16];
						var15 = true;
					}
				}
			}

			field450 = field492[var10];
			field451 = field493[var10] = var12;
			String var17 = field499[var10];
			if (field264 == 0) {
				int var18 = 0xFFFF00;
				if (field496[var10] < 6) {
					var18 = field485[field496[var10]];
				}

				if (field496[var10] == 6) {
					var18 = field320 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field496[var10] == 7) {
					var18 = field320 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field496[var10] == 8) {
					var18 = field320 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field496[var10] == 9) {
					int var19 = 150 - field498[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field496[var10] == 10) {
					int var20 = 150 - field498[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field496[var10] == 11) {
					int var21 = 150 - field498[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field497[var10] == 0) {
					field212.method586(var17, field450, 0, field451 + 1);
					field212.method586(var17, field450, var18, field451);
				}

				if (field497[var10] == 1) {
					field212.method591(var17, field450, 0, field320, field451 + 1);
					field212.method591(var17, field450, var18, field320, field451);
				}

				if (field497[var10] == 2) {
					field212.method592(0, field451 + 1, field320, var17, field450);
					field212.method592(var18, field451, field320, var17, field450);
				}

				if (field497[var10] == 3) {
					field212.method593(field451 + 1, field320, var17, 150 - field498[var10], field450, 0);
					field212.method593(field451, field320, var17, 150 - field498[var10], field450, var18);
				}

				if (field497[var10] == 4) {
					int var22 = field212.method589(var17);
					int var23 = (150 - field498[var10]) * (var22 + 100) / 150;
					NBXZFIDS.method288(field450 - 50, 334, 0, field450 + 50);
					field212.method590(var17, field451 + 1, 0, field450 + 50 - var23);
					field212.method590(var17, field451, var18, field450 + 50 - var23);
					NBXZFIDS.method287();
				}

				if (field497[var10] == 5) {
					int var24 = 150 - field498[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					NBXZFIDS.method288(0, field451 + 5, field451 - field212.field1501 - 1, 512);
					field212.method586(var17, field450, 0, field451 + var25 + 1);
					field212.method586(var17, field450, var18, field451 + var25);
					NBXZFIDS.method287();
				}
			} else {
				field212.method586(var17, field450, 0, field451 + 1);
				field212.method586(var17, field450, 0xFFFF00, field451);
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;ILjava/lang/String;I)LXOJZVVDK;")
	public final XOJZVVDK method17(int arg0, int arg1, String arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field115[0] != null) {
				var6 = field115[0].method568(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field377.reset();
			field377.update(var6);
			int var8 = (int) field377.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new XOJZVVDK(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method55("Requesting " + arg2, arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method89(arg3 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				PQBRPYKE var16 = new PQBRPYKE(var15);
				var16.field1091 = 3;
				int var17 = var16.method344() + 6;
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
						method55("Loading " + arg2 + " - " + var22 + "%", arg1);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field115[0] != null) {
						field115[0].method569(var6, var6.length, arg0);
					}
				} catch (Exception var28) {
					field115[0] = null;
				}

				if (var6 != null) {
					field377.reset();
					field377.update(var6);
					int var23 = (int) field377.getValue();
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
						method55("Game updated - please reload page", arg1);
						var25 = 10;
					} else {
						method55(var11 + " - Retrying in " + var25, arg1);
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

				field357 = !field357;
			}
		}

		return new XOJZVVDK(var6);
	}

	@ObfuscatedName("client.b(B)V")
	public final void method18() {
		int var1 = field346 * 128 + 64;
		int var2 = field347 * 128 + 64;
		int var3 = method66(field168, var2, var1) - field348;

		if (field462 < var1) {
			field462 += (var1 - field462) * field350 / 1000 + field349;
			if (field462 > var1) {
				field462 = var1;
			}
		}

		if (field462 > var1) {
			field462 -= (field462 - var1) * field350 / 1000 + field349;
			if (field462 < var1) {
				field462 = var1;
			}
		}

		if (field463 < var3) {
			field463 += (var3 - field463) * field350 / 1000 + field349;
			if (field463 > var3) {
				field463 = var3;
			}
		}

		if (field463 > var3) {
			field463 -= (field463 - var3) * field350 / 1000 + field349;
			if (field463 < var3) {
				field463 = var3;
			}
		}

		if (field464 < var2) {
			field464 += (var2 - field464) * field350 / 1000 + field349;
			if (field464 > var2) {
				field464 = var2;
			}
		}

		if (field464 > var2) {
			field464 -= (field464 - var2) * field350 / 1000 + field349;
			if (field464 < var2) {
				field464 = var2;
			}
		}

		int var4 = field358 * 128 + 64;
		int var5 = field359 * 128 + 64;
		int var6 = method66(field168, var5, var4) - field360;
		int var7 = var4 - field462;
		int var8 = var6 - field463;
		int var9 = var5 - field464;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field465 < var11) {
			field465 += (var11 - field465) * field362 / 1000 + field361;
			if (field465 > var11) {
				field465 = var11;
			}
		}

		if (field465 > var11) {
			field465 -= (field465 - var11) * field362 / 1000 + field361;
			if (field465 < var11) {
				field465 = var11;
			}
		}

		int var13 = var12 - field466;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field466 += field362 * var13 / 1000 + field361;
			field466 &= 0x7FF;
		}

		if (var13 < 0) {
			field466 -= -var13 * field362 / 1000 + field361;
			field466 &= 0x7FF;
		}

		int var14 = var12 - field466;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field466 = var12;
		}
	}

	@ObfuscatedName("client.a(ILPQBRPYKE;I)V")
	public final void method19(PQBRPYKE arg0, int arg1) {
		if (arg1 == 124) {
			int var3 = arg0.method368();
			int var4 = arg0.method361();
			int var5 = (var4 >> 4 & 0x7) + field438;
			int var6 = (var4 & 0x7) + field439;
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				VGFLNLXH var7 = field416[field168][var5][var6];
				if (var7 != null) {
					for (VUGJZKVT var8 = (VUGJZKVT) var7.method532(); var8 != null; var8 = (VUGJZKVT) var7.method534()) {
						if ((var3 & 0x7FFF) == var8.field1353) {
							var8.method163();
							break;
						}
					}

					if (var7.method532() == null) {
						field416[field168][var5][var6] = null;
					}

					method67(var5, var6);
				}
			}
		} else if (arg1 == 11) {
			int var9 = arg0.method360();
			int var10 = (var9 >> 4 & 0x7) + field438;
			int var11 = (var9 & 0x7) + field439;
			int var12 = arg0.method370();
			int var13 = arg0.method359();
			int var14 = var13 >> 2;
			int var15 = var13 & 0x3;
			int var16 = field318[var14];
			if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
				int var17 = field453[field168][var10][var11];
				int var18 = field453[field168][var10 + 1][var11];
				int var19 = field453[field168][var10 + 1][var11 + 1];
				int var20 = field453[field168][var10][var11 + 1];
				if (var16 == 0) {
					DYBYTXNZ var21 = field405.method493(var10, field168, var11);
					if (var21 != null) {
						int var22 = var21.field611 >> 14 & 0x7FFF;
						if (var14 == 2) {
							var21.field609 = new DZGXSGHB(var12, var22, var15 + 4, var18, var19, var17, 2, false, var20);
							var21.field610 = new DZGXSGHB(var12, var22, var15 + 1 & 0x3, var18, var19, var17, 2, false, var20);
						} else {
							var21.field609 = new DZGXSGHB(var12, var22, var15, var18, var19, var17, var14, false, var20);
						}
					}
				}

				if (var16 == 1) {
					DTBLKRRA var23 = field405.method494(var11, var10, field168);
					if (var23 != null) {
						var23.field601 = new DZGXSGHB(var12, var23.field602 >> 14 & 0x7FFF, 0, var18, var19, var17, 4, false, var20);
					}
				}

				if (var16 == 2) {
					GFOSCBWB var24 = field405.method495(var10, var11, field168);

					if (var14 == 11) {
						var14 = 10;
					}

					if (var24 != null) {
						var24.field758 = new DZGXSGHB(var12, var24.field766 >> 14 & 0x7FFF, var15, var18, var19, var17, var14, false, var20);
					}
				}

				if (var16 == 3) {
					QXFVLNJO var25 = field405.method496(var10, field168, var11);
					if (var25 != null) {
						var25.field1170 = new DZGXSGHB(var12, var25.field1171 >> 14 & 0x7FFF, var15, var18, var19, var17, 22, false, var20);
					}
				}
			}
		} else if (arg1 == 68) {
			int var26 = arg0.method340();
			int var27 = (var26 >> 4 & 0x7) + field438;
			int var28 = (var26 & 0x7) + field439;
			int var29 = arg0.method342();
			int var30 = arg0.method342();
			int var31 = arg0.method342();
			if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
				VGFLNLXH var32 = field416[field168][var27][var28];
				if (var32 != null) {
					for (VUGJZKVT var33 = (VUGJZKVT) var32.method532(); var33 != null; var33 = (VUGJZKVT) var32.method534()) {
						if ((var29 & 0x7FFF) == var33.field1353 && var33.field1354 == var30) {
							var33.field1354 = var31;
							break;
						}
					}

					method67(var27, var28);
				}
			}
		} else if (arg1 == 248) {
			int var34 = arg0.method340();
			int var35 = (var34 >> 4 & 0x7) + field438;
			int var36 = (var34 & 0x7) + field439;
			int var37 = var35 + arg0.method341();
			int var38 = var36 + arg0.method341();
			int var39 = arg0.method343();
			int var40 = arg0.method342();
			int var41 = arg0.method340() * 4;
			int var42 = arg0.method340() * 4;
			int var43 = arg0.method342();
			int var44 = arg0.method342();
			int var45 = arg0.method340();
			int var46 = arg0.method340();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && var40 != 0xFFFF) {
				var35 = var35 * 128 + 64;
				var36 = var36 * 128 + 64;
				var37 = var37 * 128 + 64;
				var38 = var38 * 128 + 64;
				XQTFUCRC var47 = new XQTFUCRC(var40, field168, var35, var39, var36, var45, var42, var46, method66(field168, var36, var35) - var41, field526 + var44, field526 + var43);
				var47.method566(field526 + var43, var38, method66(field168, var38, var37) - var42, var37);
				field352.method529(var47);
			}
		} else if (arg1 == 156) {
			int var48 = arg0.method359();
			int var49 = var48 >> 2;
			int var50 = var48 & 0x3;
			int var51 = field318[var49];
			int var52 = arg0.method359();
			int var53 = (var52 >> 4 & 0x7) + field438;
			int var54 = (var52 & 0x7) + field439;
			if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
				method81(0, var49, field168, -1, var51, var53, var54, var50, -1);
			}
		} else if (arg1 == 183) {
			int var55 = arg0.method342();
			int var56 = arg0.method361();
			int var57 = (var56 >> 4 & 0x7) + field438;
			int var58 = (var56 & 0x7) + field439;
			int var59 = arg0.method370();
			int var60 = arg0.method342();
			if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104 && field146 != var59) {
				VUGJZKVT var61 = new VUGJZKVT();
				var61.field1353 = var55;
				var61.field1354 = var60;

				if (field416[field168][var57][var58] == null) {
					field416[field168][var57][var58] = new VGFLNLXH();
				}

				field416[field168][var57][var58].method529(var61);
				method67(var57, var58);
			}
		} else if (arg1 == 241) {
			int var62 = arg0.method342();
			int var63 = arg0.method370();
			int var64 = arg0.method359();
			int var65 = (var64 >> 4 & 0x7) + field438;
			int var66 = (var64 & 0x7) + field439;
			if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
				VUGJZKVT var67 = new VUGJZKVT();
				var67.field1353 = var63;
				var67.field1354 = var62;

				if (field416[field168][var65][var66] == null) {
					field416[field168][var65][var66] = new VGFLNLXH();
				}

				field416[field168][var65][var66].method529(var67);
				method67(var65, var66);
			}
		} else {
			if (arg1 == 164) {
				int var68 = arg0.method370();
				byte var69 = arg0.method362();
				byte var70 = arg0.method363();
				byte var71 = arg0.method341();
				int var72 = arg0.method369();
				int var73 = arg0.method340();
				int var74 = (var73 >> 4 & 0x7) + field438;
				int var75 = (var73 & 0x7) + field439;
				int var76 = arg0.method360();
				int var77 = var76 >> 2;
				int var78 = var76 & 0x3;
				int var79 = field318[var77];
				int var80 = arg0.method369();
				byte var81 = arg0.method364();
				int var82 = arg0.method368();
				TPTANZXN var83;
				if (field146 == var80) {
					var83 = field128;
				} else {
					var83 = field424[var80];
				}

				if (var83 != null) {
					ELXAMLNA var84 = ELXAMLNA.method196(var82);
					int var85 = field453[field168][var74][var75];
					int var86 = field453[field168][var74 + 1][var75];
					int var87 = field453[field168][var74 + 1][var75 + 1];
					int var88 = field453[field168][var74][var75 + 1];
					FLXAIVEA var89 = var84.method201(var77, var78, var85, var86, var87, var88, -1);
					if (var89 != null) {
						method81(var72 + 1, 0, field168, var68 + 1, var79, var74, var75, 0, -1);
						var83.field1241 = field526 + var72;
						var83.field1242 = field526 + var68;
						var83.field1251 = var89;
						int var90 = var84.field631;
						int var91 = var84.field661;
						if (var78 == 1 || var78 == 3) {
							var90 = var84.field661;
							var91 = var84.field631;
						}

						var83.field1248 = var74 * 128 + var90 * 64;
						var83.field1250 = var75 * 128 + var91 * 64;
						var83.field1249 = method66(field168, var83.field1250, var83.field1248);

						if (var81 > var70) {
							byte var92 = var81;
							var81 = var70;
							var70 = var92;
						}

						if (var71 > var69) {
							byte var93 = var71;
							var71 = var69;
							var69 = var93;
						}

						var83.field1236 = var74 + var81;
						var83.field1238 = var70 + var74;
						var83.field1237 = var71 + var75;
						var83.field1239 = var69 + var75;
					}
				}
			}

			if (arg1 == 121) {
				int var94 = arg0.method342();
				int var95 = arg0.method360();
				int var96 = var95 >> 2;
				int var97 = var95 & 0x3;
				int var98 = field318[var96];
				int var99 = arg0.method361();
				int var100 = (var99 >> 4 & 0x7) + field438;
				int var101 = (var99 & 0x7) + field439;
				if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
					method81(0, var96, field168, -1, var98, var100, var101, var97, var94);
				}
			} else if (arg1 == 245) {
				int var102 = arg0.method340();
				int var103 = (var102 >> 4 & 0x7) + field438;
				int var104 = (var102 & 0x7) + field439;
				int var105 = arg0.method342();
				int var106 = arg0.method340();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field128.field1404[0] >= var103 - var107 && field128.field1404[0] <= var103 + var107 && field128.field1405[0] >= var104 - var107 && field128.field1405[0] <= var104 + var107 && field386 && !field228 && field219 < 50) {
					field500[field219] = var105;
					field170[field219] = var108;
					field182[field219] = MFQVDWNR.field1017[var105];
					field219++;
				}
			} else if (arg1 == 252) {
				int var109 = arg0.method340();
				int var110 = (var109 >> 4 & 0x7) + field438;
				int var111 = (var109 & 0x7) + field439;
				int var112 = arg0.method342();
				int var113 = arg0.method340();
				int var114 = arg0.method342();
				if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
					var110 = var110 * 128 + 64;
					var111 = var111 * 128 + 64;
					GJMFUMBP var115 = new GJMFUMBP(var114, var112, var110, field168, field526, method66(field168, var111, var110) - var113, var111);
					field267.method529(var115);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method20(String arg0) {
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

	@ObfuscatedName("client.a(BZ)V")
	public final void method21(boolean arg0) {
		if (field128.field1396 >> 7 == field486 && field128.field1397 >> 7 == field487) {
			field486 = 0;
		}

		int var2 = field425;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			TPTANZXN var4;
			int var5;
			if (arg0) {
				var4 = field128;
				var5 = field423 << 14;
			} else {
				var4 = field424[field426[var3]];
				var5 = field426[var3] << 14;
			}

			if (var4 != null && var4.method442()) {
				var4.field1258 = false;
				if ((field228 && field425 > 50 || field425 > 200) && !arg0 && var4.field1414 == var4.field1400) {
					var4.field1258 = true;
				}

				int var6 = var4.field1396 >> 7;
				int var7 = var4.field1397 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1251 == null || field526 < var4.field1241 || field526 >= var4.field1242) {
						if ((var4.field1396 & 0x7F) == 0x40 && (var4.field1397 & 0x7F) == 0x40) {
							if (field209[var6][var7] == field320) {
								continue;
							}

							field209[var6][var7] = field320;
						}

						var4.field1259 = method66(field168, var4.field1397, var4.field1396);
						field405.method482(var5, var4, var4.field1392, field168, var4.field1259, 60, var4.field1396, var4.field1398, var4.field1397);
					} else {
						var4.field1258 = false;
						var4.field1259 = method66(field168, var4.field1397, var4.field1396);
						field405.method483(var4.field1239, var4.field1398, 60, var4.field1397, var4.field1396, var4.field1259, var4.field1236, field168, var4.field1237, var5, var4.field1238, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method22() {
		while (true) {
			int var1 = method263();
			if (var1 == -1) {
				return;
			}

			if (field547 != -1 && field547 == field539) {
				if (var1 == 8 && field511.length() > 0) {
					field511 = field511.substring(0, field511.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field511.length() < 12) {
					field511 = field511 + (char) var1;
				}
			} else if (field153) {
				if (var1 >= 32 && var1 <= 122 && field130.length() < 80) {
					field130 = field130 + (char) var1;
					field548 = true;
				}

				if (var1 == 8 && field130.length() > 0) {
					field130 = field130.substring(0, field130.length() - 1);
					field548 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field153 = false;
					field548 = true;

					if (field398 == 1) {
						long var2 = VUKQGAWR.method537(field130);
						method23(var2);
					}

					if (field398 == 2 && field122 > 0) {
						long var4 = VUKQGAWR.method537(field130);
						method134(var4);
					}

					if (field398 == 3 && field130.length() > 0) {
						field125.method329(252);
						field125.method330(0);
						int var6 = field125.field1091;
						field125.method336(field505);
						GDVTWATR.method246(field130, field125);
						field125.method339(field125.field1091 - var6);
						field130 = GDVTWATR.method247(field130);
						field130 = SQZXZVWD.method413(field130);
						method102(field130, VUKQGAWR.method541(VUKQGAWR.method538(field505)), 6);

						if (field331 == 2) {
							field331 = 1;
							field310 = true;
							field125.method329(186);
							field125.method330(field371);
							field125.method330(field331);
							field125.method330(field181);
						}
					}

					if (field398 == 4 && field140 < 100) {
						long var7 = VUKQGAWR.method537(field130);
						method68(var7);
					}

					if (field398 == 5 && field140 > 0) {
						long var9 = VUKQGAWR.method537(field130);
						method61(var9);
					}
				}
			} else if (field476 == 1) {
				if (var1 >= 48 && var1 <= 57 && field117.length() < 10) {
					field117 = field117 + (char) var1;
					field548 = true;
				}

				if (var1 == 8 && field117.length() > 0) {
					field117 = field117.substring(0, field117.length() - 1);
					field548 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field117.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field117);
						} catch (Exception var21) {
						}

						field125.method329(104);
						field125.method334(var11);
					}

					field476 = 0;
					field548 = true;
				}
			} else if (field476 == 2) {
				if (var1 >= 32 && var1 <= 122 && field117.length() < 12) {
					field117 = field117 + (char) var1;
					field548 = true;
				}

				if (var1 == 8 && field117.length() > 0) {
					field117 = field117.substring(0, field117.length() - 1);
					field548 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field117.length() > 0) {
						field125.method329(32);
						field125.method336(VUKQGAWR.method537(field117));
					}

					field476 = 0;
					field548 = true;
				}
			} else if (field476 == 3) {
				if (var1 >= 32 && var1 <= 122 && field117.length() < 40) {
					field117 = field117 + (char) var1;
					field548 = true;
				}

				if (var1 == 8 && field117.length() > 0) {
					field117 = field117.substring(0, field117.length() - 1);
					field548 = true;
				}
			} else if (field403 == -1 && field229 == -1) {
				if (var1 >= 32 && var1 <= 122 && field333.length() < 80) {
					field333 = field333 + (char) var1;
					field548 = true;
				}

				if (var1 == 8 && field333.length() > 0) {
					field333 = field333.substring(0, field333.length() - 1);
					field548 = true;
				}

				if ((var1 == 13 || var1 == 10) && field333.length() > 0) {
					if (field404 == 2) {
						if (field333.equals("::clientdrop")) {
							method60();
						}

						if (field333.equals("::lag")) {
							method152();
						}

						if (field333.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field239.method396(2); var12++) {
								field239.method389(2, (byte) 1, var12);
							}
						}

						if (field333.equals("::fpson")) {
							field268 = true;
						}

						if (field333.equals("::fpsoff")) {
							field268 = false;
						}

						if (field333.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field238[var13].field678[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field333.startsWith("::")) {
						field125.method329(75);
						field125.method330(field333.length() - 1);
						field125.method337(field333.substring(2));
					} else {
						String var16 = field333.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field333 = field333.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field333 = field333.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field333 = field333.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field333 = field333.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field333 = field333.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field333 = field333.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field333 = field333.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field333 = field333.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field333 = field333.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field333 = field333.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field333 = field333.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field333 = field333.substring(6);
						}

						String var18 = field333.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field333 = field333.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field333 = field333.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field333 = field333.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field333 = field333.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field333 = field333.substring(6);
						}

						field125.method329(199);
						field125.method330(0);
						int var20 = field125.field1091;
						field125.method357(var17);
						field241.field1091 = 0;
						GDVTWATR.method246(field333, field241);
						field125.method338(0, field241.field1091, field241.field1090);
						field125.method330(var19);
						field125.method339(field125.field1091 - var20);
						field333 = GDVTWATR.method247(field333);
						field333 = SQZXZVWD.method413(field333);
						field128.field1429 = field333;
						field128.field1413 = var17;
						field128.field1423 = var19;
						field128.field1417 = 150;

						if (field404 == 2) {
							method102(field128.field1429, "@cr2@" + field128.field1261, 2);
						} else if (field404 == 1) {
							method102(field128.field1429, "@cr1@" + field128.field1261, 2);
						} else {
							method102(field128.field1429, field128.field1261, 2);
						}

						if (field371 == 2) {
							field371 = 3;
							field310 = true;
							field125.method329(186);
							field125.method330(field371);
							field125.method330(field331);
							field125.method330(field181);
						}
					}

					field333 = "";
					field548 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method23(long arg0) {
		if (arg0 != 0L) {
			if (field122 >= 100 && field308 != 1) {
				method102("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field122 >= 200) {
				method102("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = VUKQGAWR.method541(VUKQGAWR.method538(arg0));
				for (int var4 = 0; var4 < field122; var4++) {
					if (field479[var4] == arg0) {
						method102(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field140; var5++) {
					if (field120[var5] == arg0) {
						method102("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field128.field1261)) {
					field324[field122] = var3;
					field479[field122] = arg0;
					field345[field122] = 0;
					field122++;
					field364 = true;
					field125.method329(40);
					field125.method336(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public final String method24(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(ILWQACZBNG;II)V")
	public final void method25(int arg0, WQACZBNG arg1, int arg2) {
		if (arg1 != null) {
			int var4 = field550 + field223 & 0x7FF;
			int var5 = arg0 * arg0 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = FLXAIVEA.field747[var4];
				int var7 = FLXAIVEA.field748[var4];
				var6 = var6 * 256 / (field396 + 256);
				var7 = var7 * 256 / (field396 + 256);
				int var8 = arg0 * var7 + arg2 * var6 >> 16;
				int var9 = arg2 * var7 - arg0 * var6 >> 16;
				if (var5 > 2500) {
					arg1.method554(83 - var9 - arg1.field1362 / 2 - 4, var8 + 94 - arg1.field1361 / 2 + 4, field379);
				} else {
					arg1.method548(83 - var9 - arg1.field1362 / 2 - 4, var8 + 94 - arg1.field1361 / 2 + 4);
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method26() {
		field543 = 0;
		int var1 = (field128.field1396 >> 7) + field365;
		int var2 = (field128.field1397 >> 7) + field366;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field543 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field543 = 1;
		}

		if (field543 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field543 = 0;
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIZIII)Z")
	public final boolean method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field334[var14][var15] = 0;
				field157[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg3;
		field334[arg8][arg3] = 99;
		field157[arg8][arg3] = 0;
		byte var18 = 0;
		int var19 = 0;
		field399[var18] = arg8;
		int var39 = var18 + 1;
		field400[var18] = arg3;
		boolean var20 = false;
		int var21 = field399.length;
		int[][] var22 = field238[field168].field678;
		while (var39 != var19) {
			var16 = field399[var19];
			var17 = field400[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && field238[field168].method211(arg1, var16, var17, arg0, arg9 - 1, arg10)) {
					var20 = true;
					break;
				}

				if (arg9 < 10 && field238[field168].method212(arg9 - 1, arg0, arg1, var16, var17, arg10)) {
					var20 = true;
					break;
				}
			}

			if (arg4 != 0 && arg6 != 0 && field238[field168].method213(arg1, arg4, var16, arg2, arg6, arg0, var17)) {
				var20 = true;
				break;
			}

			int var23 = field157[var16][var17] + 1;
			if (var16 > 0 && field334[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field399[var39] = var16 - 1;
				field400[var39] = var17;
				var39 = (var39 + 1) % var21;
				field334[var16 - 1][var17] = 2;
				field157[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field334[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field399[var39] = var16 + 1;
				field400[var39] = var17;
				var39 = (var39 + 1) % var21;
				field334[var16 + 1][var17] = 8;
				field157[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field334[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field399[var39] = var16;
				field400[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field334[var16][var17 - 1] = 1;
				field157[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field334[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field399[var39] = var16;
				field400[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field334[var16][var17 + 1] = 4;
				field157[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field334[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field399[var39] = var16 - 1;
				field400[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field334[var16 - 1][var17 - 1] = 3;
				field157[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field334[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field399[var39] = var16 + 1;
				field400[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field334[var16 + 1][var17 - 1] = 9;
				field157[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field334[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field399[var39] = var16 - 1;
				field400[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field334[var16 - 1][var17 + 1] = 6;
				field157[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field334[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field399[var39] = var16 + 1;
				field400[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field334[var16 + 1][var17 + 1] = 12;
				field157[var16 + 1][var17 + 1] = var23;
			}
		}

		field507 = 0;
		if (!var20) {
			if (!arg7) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg0 - var26; var27 <= arg0 + var26; var27++) {
				for (int var28 = arg1 - var26; var28 <= arg1 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field157[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg0) {
							var29 = arg0 - var27;
						} else if (var27 > arg0 + arg4 - 1) {
							var29 = var27 + 1 - arg0 - arg4;
						}

						int var30 = 0;
						if (var28 < arg1) {
							var30 = arg1 - var28;
						} else if (var28 > arg1 + arg6 - 1) {
							var30 = var28 + 1 - arg1 - arg6;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field157[var27][var28] < var25) {
							var24 = var31;
							var25 = field157[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg8 == var16 && arg3 == var17) {
				return false;
			}

			field507 = 1;
		}

		byte var32 = 0;
		field399[var32] = var16;
		int var40 = var32 + 1;
		field400[var32] = var17;
		int var33;
		int var34 = var33 = field334[var16][var17];
		while (arg8 != var16 || arg3 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field399[var40] = var16;
				field400[var40++] = var17;
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

			var34 = field334[var16][var17];
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
		int var36 = field399[var40];
		int var37 = field400[var40];

		if (arg5 == 0) {
			field125.method329(120);
			field125.method330(var35 + var35 + 3);
		}

		if (arg5 == 1) {
			field125.method329(56);
			field125.method330(var35 + var35 + 3 + 14);
		}

		if (arg5 == 2) {
			field125.method329(70);
			field125.method330(var35 + var35 + 3);
		}

		field125.method367(field366 + var37);
		field486 = field399[0];
		field487 = field400[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field125.method356(field399[var40] - var36);
			field125.method356(field400[var40] - var37);
		}

		field125.method365(field365 + var36);
		field125.method358(field853[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field271.method527(arg3, arg4);
		field272.method527(arg2 + arg3 - 16, arg4);
		NBXZFIDS.method291(arg4, 16, arg3 + 16, field436, arg2 - 32);
		int var6 = (arg2 - 32) * arg2 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg0 / (arg1 - arg2);
		NBXZFIDS.method291(arg4, 16, arg3 + var7 + 16, field116, var6);
		NBXZFIDS.method296(field381, var6, arg3 + var7 + 16, arg4);
		NBXZFIDS.method296(field381, var6, arg3 + var7 + 16, arg4 + 1);
		NBXZFIDS.method294(arg4, arg3 + var7 + 16, 16, field381);
		NBXZFIDS.method294(arg4, arg3 + var7 + 17, 16, field381);
		NBXZFIDS.method296(field470, var6, arg3 + var7 + 16, arg4 + 15);
		NBXZFIDS.method296(field470, var6 - 1, arg3 + 17 + var7, arg4 + 14);
		NBXZFIDS.method294(arg4, arg3 + var7 + var6 + 15, 16, field470);
		NBXZFIDS.method294(arg4 + 1, arg3 + 14 + var7 + var6, 15, field470);
	}

	@ObfuscatedName("client.d(B)V")
	public final void method29() {
		for (int var1 = -1; var1 < field425; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field423;
			} else {
				var2 = field426[var1];
			}

			TPTANZXN var3 = field424[var2];
			if (var3 != null) {
				method70(1, var3);
			}
		}
	}

	@ObfuscatedName("client.a(LVEIVHFHZ;I)V")
	public final void method30(VEIVHFHZ arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field374.length; var3++) {
			field374[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field374[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field375[var9] = (field374[var9 - 1] + field374[var9 + 1] + field374[var9 - 128] + field374[var9 + 128]) / 4;
				}
			}

			int[] var10 = field374;
			field374 = field375;
			field375 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1346; var12++) {
				for (int var13 = 0; var13 < arg0.field1345; var13++) {
					if (arg0.field1343[var11++] != 0) {
						int var14 = var13 + arg0.field1347 + 16;
						int var15 = var12 + arg0.field1348 + 16;
						int var16 = (var15 << 7) + var14;
						field374[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method31(boolean arg0, byte[] arg1) {
		if (field370) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method32(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field417 = "";
				field418 = "Connecting to server...";
				method103(true);
			}

			field263 = new TVERLIYS(method85(field226 + 43594), this);
			long var4 = VUKQGAWR.method537(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field125.field1091 = 0;
			field125.method330(14);
			field125.method330(var6);
			field263.method468(0, field125.field1090, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field263.method465();
			}

			int var8 = field263.method465();
			int var9 = var8;

			if (var8 == 0) {
				field263.method467(field135.field1090, 0, 8);
				field135.field1091 = 0;
				field309 = field135.method346();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field309 >> 32), (int) field309 };
				field125.field1091 = 0;
				field125.method330(10);
				field125.method334(var10[0]);
				field125.method334(var10[1]);
				field125.method334(var10[2]);
				field125.method334(var10[3]);
				field125.method334(signlink.uid);
				field125.method337(arg0);
				field125.method337(arg1);
				field125.method355(field442, field508);
				field509.field1091 = 0;

				if (arg2) {
					field509.method330(18);
				} else {
					field509.method330(16);
				}

				field509.method330(field125.field1091 + 36 + 1 + 1 + 2);
				field509.method330(255);
				field509.method331(374);
				field509.method330(field228 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field509.method334(field319[var11]);
				}

				field509.method338(0, field125.field1091, field125.field1090);
				field125.field1095 = new WUYFIEBK(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field287 = new WUYFIEBK(var10);
				field263.method468(0, field509.field1090, field509.field1091);
				var8 = field263.method465();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method32(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field404 = field263.method465();
				field121 = field263.method465() == 1;
				field145 = 0L;
				field154 = 0;
				field285.field1339 = 0;
				field840 = true;
				field554 = true;
				field412 = true;
				field125.field1091 = 0;
				field135.field1091 = 0;
				field457 = -1;
				field353 = -1;
				field354 = -1;
				field355 = -1;
				field456 = 0;
				field458 = 0;
				field477 = 0;
				field460 = 0;
				field452 = 0;
				field249 = 0;
				field159 = false;
				field841 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field385[var13] = null;
				}

				field534 = 0;
				field431 = 0;
				field314 = 0;
				field219 = 0;
				field260 = (int) (Math.random() * 100.0D) - 50;
				field131 = (int) (Math.random() * 110.0D) - 55;
				field133 = (int) (Math.random() * 80.0D) - 40;
				field223 = (int) (Math.random() * 120.0D) - 60;
				field396 = (int) (Math.random() * 30.0D) - 20;
				field550 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field372 = 0;
				field305 = -1;
				field486 = 0;
				field487 = 0;
				field425 = 0;
				field243 = 0;

				for (int var14 = 0; var14 < field422; var14++) {
					field424[var14] = null;
					field429[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field242[var15] = null;
				}

				field128 = field424[field423] = new TPTANZXN();
				field352.method536();
				field267.method536();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field416[var16][var17][var18] = null;
						}
					}
				}

				field273 = new VGFLNLXH();
				field123 = 0;
				field122 = 0;
				method33(field401);
				field401 = -1;
				method33(field403);
				field403 = -1;
				method33(field547);
				field547 = -1;
				method33(field229);
				field229 = -1;
				method33(field169);
				field169 = -1;
				method33(field208);
				field208 = -1;
				method33(field126);
				field126 = -1;
				field421 = false;
				field472 = 3;
				field476 = 0;
				field159 = false;
				field153 = false;
				field315 = null;
				field540 = 0;
				field517 = -1;
				field183 = true;
				method58();

				for (int var19 = 0; var19 < 5; var19++) {
					field118[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field322[var20] = null;
					field323[var20] = false;
				}

				field339 = 0;
				field478 = 0;
				field127 = 0;
				field279 = 0;
				field435 = 0;
				field269 = 0;
				field266 = 0;
				field234 = 0;
				method91();
			} else if (var8 == 3) {
				field417 = "";
				field418 = "Invalid username or password.";
			} else if (var8 == 4) {
				field417 = "Your account has been disabled.";
				field418 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field417 = "Your account is already logged in.";
				field418 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field417 = "RuneScape has been updated!";
				field418 = "Please reload this page.";
			} else if (var8 == 7) {
				field417 = "This world is full.";
				field418 = "Please use a different world.";
			} else if (var8 == 8) {
				field417 = "Unable to connect.";
				field418 = "Login server offline.";
			} else if (var8 == 9) {
				field417 = "Login limit exceeded.";
				field418 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field417 = "Unable to connect.";
				field418 = "Bad session id.";
			} else if (var8 == 12) {
				field417 = "You need a members account to login to this world.";
				field418 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field417 = "Could not complete login.";
				field418 = "Please try using a different world.";
			} else if (var8 == 14) {
				field417 = "The server is being updated.";
				field418 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field412 = true;
				field125.field1091 = 0;
				field135.field1091 = 0;
				field457 = -1;
				field353 = -1;
				field354 = -1;
				field355 = -1;
				field456 = 0;
				field458 = 0;
				field477 = 0;
				field249 = 0;
				field159 = false;
				field546 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field417 = "Login attempts exceeded.";
				field418 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field417 = "You are standing in a members-only area.";
				field418 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field417 = "Invalid loginserver requested";
				field418 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field263.method465();
				for (var21 += 3; var21 >= 0; var21--) {
					field417 = "You have only just left another world";
					field418 = "Your profile will be transferred in: " + var21;
					method103(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method32(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field417 = "Malformed login packet.";
				field418 = "Please try again.";
			} else if (var8 == 23) {
				field417 = "No reply from loginserver.";
				field418 = "Please try again.";
			} else if (var8 == 24) {
				field417 = "Error loading your profile.";
				field418 = "Please contact customer support.";
			} else if (var8 == 25) {
				field417 = "Unexpected loginserver response.";
				field418 = "Please try using a different world.";
			} else if (var8 == 26) {
				field417 = "This computers address has been blocked";
				field418 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field417 = "Unexpected server response";
				field418 = "Please try using a different world.";
			} else if (var9 != 0) {
				field417 = "No response from server";
				field418 = "Please try using a different world.";
			} else if (field143 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field143++;
				method32(arg0, arg1, arg2);
			} else {
				field417 = "No response from loginserver";
				field418 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field417 = "";
			field418 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method33(int arg0) {
		ATOBWHST.method1(arg0);
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method34() {
		field506 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field373) {
				field338++;
				method43();
				method43();
				method79();
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

		field506 = false;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method35() {
		field125.method329(237);

		if (field208 != -1) {
			method33(field208);
			field208 = -1;
			field364 = true;
			field421 = false;
			field167 = true;
		}

		if (field403 != -1) {
			method33(field403);
			field403 = -1;
			field548 = true;
			field421 = false;
		}

		if (field229 != -1) {
			method33(field229);
			field229 = -1;
			field420 = true;
		}

		if (field169 != -1) {
			method33(field169);
			field169 = -1;
		}

		if (field547 != -1) {
			method33(field547);
			field547 = -1;
		}
	}

	@ObfuscatedName("client.a(LPQBRPYKE;ZI)V")
	public final void method36(PQBRPYKE arg0, int arg1) {
		field541 = 0;
		field427 = 0;
		method108(arg1, arg0);
		method149(arg1, arg0);
		method124(arg0, arg1);
		method128(arg1, arg0);

		for (int var3 = 0; var3 < field541; var3++) {
			int var4 = field542[var3];
			if (field526 != field424[var4].field1418) {
				field424[var4] = null;
			}
		}

		if (arg0.field1091 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1091 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field425; var5++) {
			if (field424[field426[var5]] == null) {
				signlink.reporterror(field185 + " null entry in pl list - pos:" + var5 + " size:" + field425);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method37() {
		if (field849 == 1) {
			if (field850 >= 6 && field850 <= 106 && field851 >= 467 && field851 <= 499) {
				field371 = (field371 + 1) % 4;
				field310 = true;
				field548 = true;
				field125.method329(186);
				field125.method330(field371);
				field125.method330(field331);
				field125.method330(field181);
			}

			if (field850 >= 135 && field850 <= 235 && field851 >= 467 && field851 <= 499) {
				field331 = (field331 + 1) % 3;
				field310 = true;
				field548 = true;
				field125.method329(186);
				field125.method330(field371);
				field125.method330(field331);
				field125.method330(field181);
			}

			if (field850 >= 273 && field850 <= 373 && field851 >= 467 && field851 <= 499) {
				field181 = (field181 + 1) % 3;
				field310 = true;
				field548 = true;
				field125.method329(186);
				field125.method330(field371);
				field125.method330(field331);
				field125.method330(field181);
			}

			if (field850 >= 412 && field850 <= 512 && field851 >= 467 && field851 <= 499) {
				if (field547 == -1) {
					method35();
					field511 = "";
					field343 = false;
					field539 = field547 = ATOBWHST.field41;
					return;
				}

				method102("Please close the interface you have open before using 'report abuse'", "", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LGWDACNJF;Z)V")
	public final void method38(GWDACNJF arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field805 == 0) {
			var2 = field405.method497(arg0.field804, arg0.field806, arg0.field807);
		}

		if (arg0.field805 == 1) {
			var2 = field405.method498(arg0.field804, arg0.field807, arg0.field806);
		}

		if (arg0.field805 == 2) {
			var2 = field405.method499(arg0.field804, arg0.field806, arg0.field807);
		}

		if (arg0.field805 == 3) {
			var2 = field405.method500(arg0.field804, arg0.field806, arg0.field807);
		}

		if (var2 != 0) {
			int var6 = field405.method501(arg0.field804, arg0.field806, arg0.field807, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field801 = var3;
		arg0.field803 = var4;
		arg0.field802 = var5;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method39() {
		field190 = null;
		field191 = null;
		field187 = null;
		field188 = null;
		field189 = null;
		field334 = null;
		field157 = null;
		field399 = null;
		field400 = null;
		field453 = null;
		field503 = null;
		field405 = null;
		field238 = null;
		field446 = null;
		field523 = null;
		field284 = null;
		field447 = null;
		field448 = null;
		field356 = null;
		field424 = null;
		field426 = null;
		field428 = null;
		field429 = null;
		field542 = null;
		field192 = null;
		field193 = null;
		field194 = null;
		field195 = null;
		field402 = null;
		field378 = null;
		field379 = null;
		field380 = null;
		field232 = null;
		field233 = null;
		field414 = null;
		field218 = null;
		field163 = null;
		field164 = null;
		field165 = null;
		field166 = null;
		field205 = null;
		method80();
		field488 = null;
		field352 = null;
		field267 = null;

		if (field285 != null) {
			field285.field1337 = false;
		}

		field285 = null;
		field176 = null;
		field177 = null;
		field178 = null;
		field179 = null;
		field180 = null;

		if (field239 != null) {
			field239.method394();
		}

		field239 = null;
		field172 = null;
		field173 = null;
		field174 = null;
		field175 = null;
		field251 = null;
		field252 = null;
		field253 = null;
		field242 = null;
		field244 = null;
		field512 = null;
		field513 = null;
		field514 = null;
		field515 = null;
		field516 = null;
		field528 = null;
		field529 = null;
		field530 = null;
		field155 = null;
		field413 = null;
		field324 = null;
		field479 = null;
		field345 = null;
		field326 = null;
		field327 = null;
		field328 = null;
		field329 = null;
		field330 = null;
		field241 = null;
		field416 = null;
		field273 = null;
		field209 = null;
		field289 = null;
		field290 = null;
		field291 = null;
		field292 = null;
		field125 = null;
		field509 = null;
		field135 = null;
		field449 = null;

		try {
			if (field263 != null) {
				field263.method464();
			}
		} catch (Exception var1) {
		}

		field263 = null;
		field461 = null;
		field341 = null;
		field298 = null;
		field437 = null;
		field395 = null;
		field141 = null;
		field406 = null;
		field407 = null;
		field408 = null;
		field409 = null;
		field410 = null;
		method146();
		ELXAMLNA.method191();
		JRELGTVY.method267();
		TGAGWNUA.method448();
		ATOBWHST.method3();
		LDSGOGGM.field1004 = null;
		YUTTZGSS.field1488 = null;
		ZPPFKMYU.field1504 = null;
		BKDXLPEF.field75 = null;
		OKJTNJLE.field1046 = null;
		OKJTNJLE.field1058 = null;
		CJICJSIY.field100 = null;
		field836 = null;
		TPTANZXN.field1254 = null;
		ORCVJTAI.method306();
		UMNOCQQA.method470();
		FLXAIVEA.method214();
		NFWEZFJY.method300();
		System.gc();
	}

	@ObfuscatedName("client.e(B)V")
	public final void method40() {
		if (field452 == 2) {
			method53((field197 - field365 << 7) + field200, field199 * 2, (field198 - field366 << 7) + field201);

			if (field450 > -1 && field526 % 20 < 10) {
				field395[0].method548(field451 - 28, field450 - 12);
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method41() {
		if (field187 == null) {
			field836 = null;
			field292 = null;
			field290 = null;
			field289 = null;
			field291 = null;
			field528 = null;
			field529 = null;
			field530 = null;
			field190 = new DRNBRPSO(265, 128, method153());
			NBXZFIDS.method289();
			field191 = new DRNBRPSO(265, 128, method153());
			NBXZFIDS.method289();
			field187 = new DRNBRPSO(171, 509, method153());
			NBXZFIDS.method289();
			field188 = new DRNBRPSO(132, 360, method153());
			NBXZFIDS.method289();
			field189 = new DRNBRPSO(200, 360, method153());
			NBXZFIDS.method289();
			field192 = new DRNBRPSO(238, 202, method153());
			NBXZFIDS.method289();
			field193 = new DRNBRPSO(238, 203, method153());
			NBXZFIDS.method289();
			field194 = new DRNBRPSO(94, 74, method153());
			NBXZFIDS.method289();
			field195 = new DRNBRPSO(94, 75, method153());
			NBXZFIDS.method289();

			if (field119 != null) {
				method116();
				method157();
			}

			field420 = true;
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field838 != null) {
				return new URL("http://127.0.0.1:" + (field226 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.c(Z)V")
	public static final void method42() {
		UMNOCQQA.field1274 = false;
		ORCVJTAI.field1059 = false;
		field228 = false;
		DBFHRNVI.field567 = false;
		ELXAMLNA.field670 = false;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method43() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field521[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field521[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field522[var10] = (field521[var10 - 1] + field521[var10 + 1] + field521[var10 - 128] + field521[var10 + 128]) / 4;
			}
		}

		field344 += 128;
		if (field344 > field374.length) {
			field344 -= field374.length;
			int var11 = (int) (Math.random() * 12.0D);
			method30(field454[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field522[var14 + 128] - field374[field344 + var14 & field374.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field521[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field129[var16] = field129[var16 + 1];
		}

		field129[var1 - 1] = (int) (Math.sin(field526 / 14.0D) * 16.0D + Math.sin(field526 / 15.0D) * 14.0D + Math.sin(field526 / 16.0D) * 12.0D);

		if (field555 > 0) {
			field555 -= 4;
		}

		if (field556 > 0) {
			field556 -= 4;
		}

		if (field555 == 0 && field556 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field555 = 1024;
			}

			if (var17 == 1) {
				field556 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method44() {
		if (field228 && field314 == 2 && DBFHRNVI.field580 != field168) {
			method142(null, "Loading - please wait.");
			field314 = 1;
			field546 = System.currentTimeMillis();
		}

		if (field314 == 1) {
			int var1 = method45();
			if (var1 != 0 && System.currentTimeMillis() - field546 > 360000L) {
				signlink.reporterror(field185 + " glcfb " + field309 + "," + var1 + "," + field228 + "," + field115[0] + "," + field239.method385() + "," + field168 + "," + field282 + "," + field283);
				field546 = System.currentTimeMillis();
			}
		}

		if (field314 == 2 && field305 != field168) {
			field305 = field168;
			method162(field168);
		}
	}

	@ObfuscatedName("client.g(B)I")
	public final int method45() {
		for (int var1 = 0; var1 < field523.length; var1++) {
			if (field523[var1] == null && field447[var1] != -1) {
				return -1;
			}

			if (field284[var1] == null && field448[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field523.length; var3++) {
			byte[] var4 = field284[var3];
			if (var4 != null) {
				int var5 = (field446[var3] >> 8) * 64 - field365;
				int var6 = (field446[var3] & 0xFF) * 64 - field366;
				if (field544) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= DBFHRNVI.method178(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field519) {
			return -4;
		} else {
			field314 = 2;
			DBFHRNVI.field580 = field168;
			method140();
			field125.method329(198);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method46(int arg0) {
		if (arg0 >= 0) {
			int var2 = field163[arg0];
			int var3 = field164[arg0];
			int var4 = field165[arg0];
			int var5 = field166[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field476 != 0 && var4 != 1718) {
				field476 = 0;
				field548 = true;
			}

			if (var4 == 19) {
				TBFTCCSF var6 = field242[var5];
				if (var6 != null) {
					method27(var6.field1404[0], var6.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(148);
					field125.method366(var5);
				}
			}

			if (var4 == 843) {
				field125.method329(72);
				field125.method331(var3);
				ATOBWHST var7 = ATOBWHST.method4(var3);
				if (var7.field63 != null && var7.field63[0][0] == 5) {
					int var8 = var7.field63[0][1];
					if (field356[var8] != var7.field35[0]) {
						field356[var8] = var7.field35[0];
						method150(var8);
						field364 = true;
					}
				}
			}

			if (var4 == 1234) {
				method136(var5, var2, var3);
				field125.method329(0);
				field125.method366(field365 + var2);
				field125.method366(var5 >> 14 & 0x7FFF);
				field125.method367(field366 + var3);
			}

			if (var4 == 699) {
				method33(field401);
				field401 = -1;
				field548 = true;
			}

			if (var4 == 115) {
				field269 += var5;
				if (field269 >= 132) {
					field125.method329(12);
					field125.method333(0xBF6FAC);
					field269 = 0;
				}

				field125.method329(231);
				field125.method331(var2);
				field125.method365(var3);
				field125.method365(var5);
				field245 = 0;
				field246 = var3;
				field247 = var2;
				field248 = 2;
				if (ATOBWHST.method4(var3).field8 == field547) {
					field248 = 1;
				}

				if (ATOBWHST.method4(var3).field8 == field403) {
					field248 = 3;
				}
			}

			if (var4 == 764) {
				boolean var9 = method27(var2, var3, 0, field128.field1405[0], 0, 2, 0, false, field128.field1404[0], 0, 0);
				if (!var9) {
					method27(var2, var3, 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
				}

				field256 = field850;
				field257 = field851;
				field259 = 2;
				field258 = 0;
				field125.method329(156);
				field125.method366(field365 + var2);
				field125.method331(field366 + var3);
				field125.method367(var5);
			}

			if (var4 == 652 && method136(var5, var2, var3)) {
				field125.method329(251);
				field125.method331(field365 + var2);
				field125.method331(field366 + var3);
				field125.method331(field432);
				field125.method366(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 915) {
				field125.method329(72);
				field125.method331(var3);
				ATOBWHST var11 = ATOBWHST.method4(var3);
				if (var11.field63 != null && var11.field63[0][0] == 5) {
					int var12 = var11.field63[0][1];
					field356[var12] = 1 - field356[var12];
					method150(var12);
					field364 = true;
				}
			}

			if (var4 == 891) {
				TPTANZXN var13 = field424[var5];
				if (var13 != null) {
					method27(var13.field1404[0], var13.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(192);
					field125.method367(field432);
					field125.method366(var5);
				}
			}

			if (var4 == 464 || var4 == 323) {
				String var14 = field205[arg0];
				int var15 = var14.indexOf("@whi@");
				if (var15 != -1) {
					var14 = var14.substring(var15 + 5).trim();
					String var16 = VUKQGAWR.method541(VUKQGAWR.method538(VUKQGAWR.method537(var14)));
					boolean var17 = false;
					for (int var18 = 0; var18 < field425; var18++) {
						TPTANZXN var19 = field424[field426[var18]];
						if (var19 != null && var19.field1261 != null && var19.field1261.equalsIgnoreCase(var16)) {
							method27(var19.field1404[0], var19.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);

							if (var4 == 464) {
								field125.method329(214);
								field125.method331(field426[var18]);
							}

							if (var4 == 323) {
								field125.method329(121);
								field125.method366(field426[var18]);
							}

							var17 = true;
							break;
						}
					}

					if (!var17) {
						method102("Unable to find " + var16, "", 0);
					}
				}
			}

			if (var4 == 426) {
				TPTANZXN var20 = field424[var5];
				if (var20 != null) {
					method27(var20.field1404[0], var20.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(121);
					field125.method366(var5);
				}
			}

			if (var4 == 155) {
				method136(var5, var2, var3);
				field125.method329(66);
				field125.method367(field366 + var3);
				field125.method367(var5 >> 14 & 0x7FFF);
				field125.method366(field365 + var2);
			}

			if (var4 == 659) {
				TBFTCCSF var21 = field242[var5];
				if (var21 != null) {
					method27(var21.field1404[0], var21.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(170);
					field125.method331(var5);
				}
			}

			if (var4 == 247) {
				field125.method329(67);
				field125.method331(var2);
				field125.method366(field536);
				field125.method367(field537);
				field125.method331(field535);
				field125.method331(var5);
				field125.method367(var3);
				field245 = 0;
				field246 = var3;
				field247 = var2;
				field248 = 2;
				if (ATOBWHST.method4(var3).field8 == field547) {
					field248 = 1;
				}

				if (ATOBWHST.method4(var3).field8 == field403) {
					field248 = 3;
				}
			}

			if (var4 == 513) {
				method136(var5, var2, var3);
				field125.method329(8);
				field125.method331(field366 + var3);
				field125.method367(field365 + var2);
				field125.method367(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 376) {
				String var22 = field205[arg0];
				int var23 = var22.indexOf("@whi@");
				if (var23 != -1) {
					if (field547 == -1) {
						method35();
						field511 = var22.substring(var23 + 5).trim();
						field343 = false;
						field539 = field547 = ATOBWHST.field41;
					} else {
						method102("Please close the interface you have open before using 'report abuse'", "", 0);
					}
				}
			}

			if (var4 == 108) {
				boolean var24 = method27(var2, var3, 0, field128.field1405[0], 0, 2, 0, false, field128.field1404[0], 0, 0);
				if (!var24) {
					method27(var2, var3, 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
				}

				field256 = field850;
				field257 = field851;
				field259 = 2;
				field258 = 0;
				field125.method329(106);
				field125.method331(var5);
				field125.method365(field366 + var3);
				field125.method331(field365 + var2);
			}

			if (var4 == 1420) {
				int var26 = var5 >> 14 & 0x7FFF;
				ELXAMLNA var27 = ELXAMLNA.method196(var26);
				String var28;
				if (var27.field645 == null) {
					var28 = "It's a " + var27.field650 + ".";
				} else {
					var28 = new String(var27.field645);
				}

				method102(var28, "", 0);
			}

			if (var4 == 619) {
				TBFTCCSF var29 = field242[var5];
				if (var29 != null) {
					method27(var29.field1404[0], var29.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(80);
					field125.method365(var5);
				}
			}

			if (var4 == 675 || var4 == 720 || var4 == 360 || var4 == 61) {
				String var30 = field205[arg0];
				int var31 = var30.indexOf("@whi@");
				if (var31 != -1) {
					long var32 = VUKQGAWR.method537(var30.substring(var31 + 5).trim());
					if (var4 == 675) {
						method23(var32);
					}

					if (var4 == 720) {
						method68(var32);
					}

					if (var4 == 360) {
						method134(var32);
					}

					if (var4 == 61) {
						method61(var32);
					}
				}
			}

			if (var4 == 21) {
				boolean var34 = method27(var2, var3, 0, field128.field1405[0], 0, 2, 0, false, field128.field1404[0], 0, 0);
				if (!var34) {
					method27(var2, var3, 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
				}

				field256 = field850;
				field257 = field851;
				field259 = 2;
				field258 = 0;
				field125.method329(246);
				field125.method367(field365 + var2);
				field125.method366(field366 + var3);
				field125.method367(var5);
			}

			if (var4 == 871) {
				field435 += var3;
				if (field435 >= 98) {
					field125.method329(189);
					field125.method334(0);
					field435 = 0;
				}

				field125.method329(2);
				field125.method367(var3);
				field125.method331(var2);
				field125.method331(var5);
				field245 = 0;
				field246 = var3;
				field247 = var2;
				field248 = 2;
				if (ATOBWHST.method4(var3).field8 == field547) {
					field248 = 1;
				}

				if (ATOBWHST.method4(var3).field8 == field403) {
					field248 = 3;
				}
			}

			if (var4 == 257) {
				TBFTCCSF var36 = field242[var5];
				if (var36 != null) {
					method27(var36.field1404[0], var36.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(35);
					field125.method365(field432);
					field125.method366(var5);
				}
			}

			if (var4 == 850) {
				field125.method329(48);
				field125.method365(var5);
				field125.method367(var3);
				field125.method366(var2);
				field245 = 0;
				field246 = var3;
				field247 = var2;
				field248 = 2;
				if (ATOBWHST.method4(var3).field8 == field547) {
					field248 = 1;
				}

				if (ATOBWHST.method4(var3).field8 == field403) {
					field248 = 3;
				}
			}

			if (var4 == 1663) {
				TGAGWNUA var37 = TGAGWNUA.method453(var5);
				String var38;
				if (var37.field1207 == null) {
					var38 = "It's a " + var37.field1197 + ".";
				} else {
					var38 = new String(var37.field1207);
				}

				method102(var38, "", 0);
			}

			if (var4 == 547) {
				field125.method329(225);
				field125.method365(var3);
				field125.method365(var5);
				field125.method365(var2);
				field245 = 0;
				field246 = var3;
				field247 = var2;
				field248 = 2;
				if (ATOBWHST.method4(var3).field8 == field547) {
					field248 = 1;
				}

				if (ATOBWHST.method4(var3).field8 == field403) {
					field248 = 3;
				}
			}

			if (var4 == 479) {
				field125.method329(233);
				field125.method331(var2);
				field125.method367(var3);
				field125.method366(var5);
				field245 = 0;
				field246 = var3;
				field247 = var2;
				field248 = 2;
				if (ATOBWHST.method4(var3).field8 == field547) {
					field248 = 1;
				}

				if (ATOBWHST.method4(var3).field8 == field403) {
					field248 = 3;
				}
			}

			if (var4 == 886) {
				TPTANZXN var39 = field424[var5];
				if (var39 != null) {
					method27(var39.field1404[0], var39.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(211);
					field125.method366(var5);
				}
			}

			if (var4 == 712) {
				boolean var40 = method27(var2, var3, 0, field128.field1405[0], 0, 2, 0, false, field128.field1404[0], 0, 0);
				if (!var40) {
					method27(var2, var3, 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
				}

				field256 = field850;
				field257 = field851;
				field259 = 2;
				field258 = 0;
				field125.method329(202);
				field125.method365(field365 + var2);
				field125.method365(field366 + var3);
				field125.method366(var5);
				field125.method367(field432);
			}

			if (var4 == 268 && !field421) {
				field125.method329(175);
				field125.method331(var3);
				field421 = true;
			}

			if (var4 == 616) {
				if (field159) {
					field405.method509(var2 - 4, var3 - 4);
				} else {
					field405.method509(field850 - 4, field851 - 4);
				}
			}

			if (var4 == 253) {
				field534 = 1;
				field535 = var2;
				field536 = var3;
				field537 = var5;
				field538 = String.valueOf(TGAGWNUA.method453(var5).field1197);
				field431 = 0;
				field364 = true;
			} else {
				if (var4 == 670) {
					field478 += var2;
					if (field478 >= 85) {
						field125.method329(141);
						field125.method331(8034);
						field478 = 0;
					}

					field125.method329(99);
					field125.method365(var2);
					field125.method367(var5);
					field125.method365(var3);
					field245 = 0;
					field246 = var3;
					field247 = var2;
					field248 = 2;
					if (ATOBWHST.method4(var3).field8 == field547) {
						field248 = 1;
					}

					if (ATOBWHST.method4(var3).field8 == field403) {
						field248 = 3;
					}
				}

				if (var4 == 1327) {
					TGAGWNUA var42 = TGAGWNUA.method453(var5);
					ATOBWHST var43 = ATOBWHST.method4(var3);
					String var44;
					if (var43 != null && var43.field3[var2] >= 100000) {
						var44 = var43.field3[var2] + " x " + var42.field1197;
					} else if (var42.field1207 == null) {
						var44 = "It's a " + var42.field1197 + ".";
					} else {
						var44 = new String(var42.field1207);
					}

					method102(var44, "", 0);
				}

				if (var4 == 165) {
					TBFTCCSF var45 = field242[var5];
					if (var45 != null) {
						method27(var45.field1404[0], var45.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
						field256 = field850;
						field257 = field851;
						field259 = 2;
						field258 = 0;
						field266 += var5;
						if (field266 >= 58) {
							field125.method329(21);
							field125.method330(154);
							field266 = 0;
						}

						field125.method329(235);
						field125.method331(var5);
					}
				}

				if (var4 == 940) {
					field125.method329(118);
					field125.method365(var2);
					field125.method365(var3);
					field125.method365(var5);
					field245 = 0;
					field246 = var3;
					field247 = var2;
					field248 = 2;
					if (ATOBWHST.method4(var3).field8 == field547) {
						field248 = 1;
					}

					if (ATOBWHST.method4(var3).field8 == field403) {
						field248 = 3;
					}
				}

				if (var4 == 349) {
					ATOBWHST var46 = ATOBWHST.method4(var3);
					boolean var47 = true;
					if (var46.field26 > 0) {
						var47 = method138(var46);
					}

					if (var47) {
						field125.method329(72);
						field125.method331(var3);
					}
				}

				if (var4 == 20) {
					method136(var5, var2, var3);
					field125.method329(38);
					field125.method331(var5 >> 14 & 0x7FFF);
					field125.method367(field366 + var3);
					field125.method331(field365 + var2);
				}

				if (var4 == 857) {
					TBFTCCSF var48 = field242[var5];
					if (var48 != null) {
						method27(var48.field1404[0], var48.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
						field256 = field850;
						field257 = field851;
						field259 = 2;
						field258 = 0;
						field339++;
						if (field339 >= 85) {
							field125.method329(191);
							field125.method331(23198);
							field339 = 0;
						}

						field125.method329(187);
						field125.method366(var5);
					}
				}

				if (var4 == 330) {
					boolean var49 = method27(var2, var3, 0, field128.field1405[0], 0, 2, 0, false, field128.field1404[0], 0, 0);
					if (!var49) {
						method27(var2, var3, 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					}

					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(226);
					field125.method365(var5);
					field125.method367(field366 + var3);
					field125.method365(field365 + var2);
				}

				if (var4 == 5) {
					if ((var3 & 0x3) == 0) {
						field279++;
					}

					if (field279 >= 68) {
						field125.method329(215);
						field279 = 0;
					}

					field125.method329(110);
					field125.method331(var2);
					field125.method331(var5);
					field125.method365(var3);
					field245 = 0;
					field246 = var3;
					field247 = var2;
					field248 = 2;
					if (ATOBWHST.method4(var3).field8 == field547) {
						field248 = 1;
					}

					if (ATOBWHST.method4(var3).field8 == field403) {
						field248 = 3;
					}
				}

				if (var4 == 419) {
					field125.method329(184);
					field125.method331(field432);
					field125.method331(var3);
					field125.method331(var2);
					field125.method367(var5);
					field245 = 0;
					field246 = var3;
					field247 = var2;
					field248 = 2;
					if (ATOBWHST.method4(var3).field8 == field547) {
						field248 = 1;
					}

					if (ATOBWHST.method4(var3).field8 == field403) {
						field248 = 3;
					}
				}

				if (var4 == 123) {
					field125.method329(139);
					field125.method331(var5);
					field125.method367(var2);
					field125.method367(var3);
					field245 = 0;
					field246 = var3;
					field247 = var2;
					field248 = 2;
					if (ATOBWHST.method4(var3).field8 == field547) {
						field248 = 1;
					}

					if (ATOBWHST.method4(var3).field8 == field403) {
						field248 = 3;
					}
				}

				if (var4 == 863) {
					TPTANZXN var51 = field424[var5];
					if (var51 != null) {
						method27(var51.field1404[0], var51.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
						field256 = field850;
						field257 = field851;
						field259 = 2;
						field258 = 0;
						field125.method329(149);
						field125.method365(var5);
					}
				}

				if (var4 == 654) {
					String var52 = field205[arg0];
					int var53 = var52.indexOf("@whi@");
					if (var53 != -1) {
						long var54 = VUKQGAWR.method537(var52.substring(var53 + 5).trim());
						int var56 = -1;
						for (int var57 = 0; var57 < field122; var57++) {
							if (field479[var57] == var54) {
								var56 = var57;
								break;
							}
						}

						if (var56 != -1 && field345[var56] > 0) {
							field548 = true;
							field476 = 0;
							field153 = true;
							field130 = "";
							field398 = 3;
							field505 = field479[var56];
							field317 = "Enter message to send to " + field324[var56];
						}
					}
				}

				if (var4 == 826) {
					field127++;
					if (field127 >= 127) {
						field125.method329(103);
						field125.method331(56911);
						field127 = 0;
					}

					method136(var5, var2, var3);
					field125.method329(203);
					field125.method365(field365 + var2);
					field125.method331(field366 + var3);
					field125.method366(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 715) {
					boolean var58 = method27(var2, var3, 0, field128.field1405[0], 0, 2, 0, false, field128.field1404[0], 0, 0);
					if (!var58) {
						method27(var2, var3, 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
					}

					field256 = field850;
					field257 = field851;
					field259 = 2;
					field258 = 0;
					field125.method329(177);
					field125.method366(field365 + var2);
					field125.method367(var5);
					field125.method367(field366 + var3);
				}

				if (var4 == 193) {
					field125.method329(182);
					field125.method366(var3);
					field125.method367(var2);
					field125.method367(var5);
					field245 = 0;
					field246 = var3;
					field247 = var2;
					field248 = 2;
					if (ATOBWHST.method4(var3).field8 == field547) {
						field248 = 1;
					}

					if (ATOBWHST.method4(var3).field8 == field403) {
						field248 = 3;
					}
				}

				if (var4 == 1) {
					ATOBWHST var60 = ATOBWHST.method4(var3);
					field431 = 1;
					field432 = var3;
					field433 = var60.field19;
					field534 = 0;
					field364 = true;
					String var61 = var60.field33;
					if (var61.indexOf(" ") != -1) {
						var61 = var61.substring(0, var61.indexOf(" "));
					}

					String var62 = var60.field33;
					if (var62.indexOf(" ") != -1) {
						var62 = var62.substring(var62.indexOf(" ") + 1);
					}

					field434 = var61 + " " + var60.field62 + " " + var62;

					if (field433 == 16) {
						field364 = true;
						field472 = 3;
						field167 = true;
					}
				} else {
					if (var4 == 804 && method136(var5, var2, var3)) {
						field125.method329(222);
						field125.method331(field535);
						field125.method367(field536);
						field125.method331(field366 + var3);
						field125.method365(field365 + var2);
						field125.method367(var5 >> 14 & 0x7FFF);
						field125.method367(field537);
					}

					if (var4 == 564) {
						TBFTCCSF var63 = field242[var5];
						if (var63 != null) {
							method27(var63.field1404[0], var63.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
							field256 = field850;
							field257 = field851;
							field259 = 2;
							field258 = 0;
							field125.method329(7);
							field125.method366(field535);
							field125.method366(field537);
							field125.method366(field536);
							field125.method331(var5);
						}
					}

					if (var4 == 1505) {
						TBFTCCSF var64 = field242[var5];
						if (var64 != null) {
							JRELGTVY var65 = var64.field1187;
							if (var65.field928 != null) {
								var65 = var65.method266();
							}

							if (var65 != null) {
								String var66;
								if (var65.field937 == null) {
									var66 = "It's a " + var65.field957 + ".";
								} else {
									var66 = new String(var65.field937);
								}

								method102(var66, "", 0);
							}
						}
					}

					if (var4 == 417) {
						boolean var67 = method27(var2, var3, 0, field128.field1405[0], 0, 2, 0, false, field128.field1404[0], 0, 0);
						if (!var67) {
							method27(var2, var3, 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
						}

						field256 = field850;
						field257 = field851;
						field259 = 2;
						field258 = 0;
						field125.method329(86);
						field125.method367(field537);
						field125.method367(field366 + var3);
						field125.method331(field365 + var2);
						field125.method365(field535);
						field125.method331(var5);
						field125.method365(field536);
					}

					if (var4 == 266) {
						TPTANZXN var69 = field424[var5];
						if (var69 != null) {
							method27(var69.field1404[0], var69.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
							field256 = field850;
							field257 = field851;
							field259 = 2;
							field258 = 0;
							field125.method329(214);
							field125.method331(var5);
						}
					}

					if (var4 == 629) {
						TPTANZXN var70 = field424[var5];
						if (var70 != null) {
							method27(var70.field1404[0], var70.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
							field256 = field850;
							field257 = field851;
							field259 = 2;
							field258 = 0;
							field234 += var5;
							if (field234 >= 115) {
								field125.method329(45);
								field125.method333(0xAB3EA2);
								field234 = 0;
							}

							field125.method329(33);
							field125.method331(var5);
						}
					}

					if (var4 == 969) {
						method35();
					}

					if (var4 == 56) {
						TPTANZXN var71 = field424[var5];
						if (var71 != null) {
							method27(var71.field1404[0], var71.field1405[0], 0, field128.field1405[0], 1, 2, 1, false, field128.field1404[0], 0, 0);
							field256 = field850;
							field257 = field851;
							field259 = 2;
							field258 = 0;
							field125.method329(57);
							field125.method331(field536);
							field125.method331(var5);
							field125.method331(field535);
							field125.method366(field537);
						}
					}

					field534 = 0;
					field431 = 0;
					field364 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILATOBWHST;III)V")
	public final void method47(int arg0, ATOBWHST arg1, int arg2, int arg3) {
		if (arg1.field61 == 0 && arg1.field30 != null && (!arg1.field43 || field299 == arg1.field18 || field139 == arg1.field18 || field392 == arg1.field18)) {
			int var5 = NBXZFIDS.field1031;
			int var6 = NBXZFIDS.field1029;
			int var7 = NBXZFIDS.field1032;
			int var8 = NBXZFIDS.field1030;
			NBXZFIDS.method288(arg2, arg1.field50 + arg3, arg3, arg1.field64 + arg2);
			int var9 = arg1.field30.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field55[var10] + arg2;
				int var12 = arg1.field51[var10] + arg3 - arg0;
				ATOBWHST var13 = ATOBWHST.method4(arg1.field30[var10]);
				var11 += var13.field16;
				var12 += var13.field59;

				if (var13.field26 > 0) {
					method129(var13);
				}

				if (var13.field61 == 0) {
					if (var13.field60 > var13.field42 - var13.field50) {
						var13.field60 = var13.field42 - var13.field50;
					}

					if (var13.field60 < 0) {
						var13.field60 = 0;
					}

					method47(var13.field60, var13, var11, var12);

					if (var13.field42 > var13.field50) {
						method28(var13.field60, var13.field42, var13.field50, var12, var13.field64 + var11);
					}
				} else if (var13.field61 != 1) {
					if (var13.field61 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field50; var15++) {
							for (int var16 = 0; var16 < var13.field64; var16++) {
								int var17 = (var13.field27 + 32) * var16 + var11;
								int var18 = (var13.field48 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field17[var14];
									var18 += var13.field20[var14];
								}

								if (var13.field57[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field57[var14] - 1;
									if (var17 > NBXZFIDS.field1031 - 32 && var17 < NBXZFIDS.field1032 && var18 > NBXZFIDS.field1029 - 32 && var18 < NBXZFIDS.field1030 || field482 != 0 && field481 == var14) {
										int var22 = 0;
										if (field534 == 1 && field535 == var14 && field536 == var13.field18) {
											var22 = 0xFFFFFF;
										}

										WQACZBNG var23 = TGAGWNUA.method446(var21, var22, var13.field3[var14]);
										if (var23 != null) {
											if (field482 != 0 && field481 == var14 && field480 == var13.field18) {
												var19 = field843 - field483;
												var20 = field844 - field484;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field387 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method550(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < NBXZFIDS.field1029 && arg1.field60 > 0) {
													int var24 = (NBXZFIDS.field1029 - var18 - var20) * field230 / 3;
													if (var24 > field230 * 10) {
														var24 = field230 * 10;
													}

													if (var24 > arg1.field60) {
														var24 = arg1.field60;
													}

													arg1.field60 -= var24;
													field484 += var24;
												}

												if (var18 + var20 + 32 > NBXZFIDS.field1030 && arg1.field60 < arg1.field42 - arg1.field50) {
													int var25 = (var18 + var20 + 32 - NBXZFIDS.field1030) * field230 / 3;
													if (var25 > field230 * 10) {
														var25 = field230 * 10;
													}

													if (var25 > arg1.field42 - arg1.field50 - arg1.field60) {
														var25 = arg1.field42 - arg1.field50 - arg1.field60;
													}

													arg1.field60 += var25;
													field484 -= var25;
												}
											} else if (field248 != 0 && field247 == var14 && field246 == var13.field18) {
												var23.method550(var17, 128, var18);
											} else {
												var23.method548(var18, var17);
											}

											if (var23.field1361 == 33 || var13.field3[var14] != 1) {
												int var26 = var13.field3[var14];
												field210.method590(method64(var26), var18 + var20 + 10, 0, var17 + var19 + 1);
												field210.method590(method64(var26), var18 + var20 + 9, 0xFFFF00, var17 + var19);
											}
										}
									}
								} else if (var13.field22 != null && var14 < 20) {
									WQACZBNG var27 = var13.field22[var14];
									if (var27 != null) {
										var27.method548(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field61 == 3) {
						boolean var28 = false;
						if (field392 == var13.field18 || field139 == var13.field18 || field299 == var13.field18) {
							var28 = true;
						}

						int var29;
						if (method86(var13)) {
							var29 = var13.field6;
							if (var28 && var13.field46 != 0) {
								var29 = var13.field46;
							}
						} else {
							var29 = var13.field49;
							if (var28 && var13.field72 != 0) {
								var29 = var13.field72;
							}
						}

						if (var13.field37 == 0) {
							if (var13.field70) {
								NBXZFIDS.method291(var11, var13.field64, var12, var29, var13.field50);
							} else {
								NBXZFIDS.method292(var13.field50, var13.field64, var11, var12, var29);
							}
						} else if (var13.field70) {
							NBXZFIDS.method290(256 - (var13.field37 & 0xFF), var11, var13.field50, var29, var12, var13.field64);
						} else {
							NBXZFIDS.method293(var29, 256 - (var13.field37 & 0xFF), var13.field50, var11, var13.field64, var12);
						}
					} else if (var13.field61 == 4) {
						ZFUOSNLM var30 = var13.field9;
						String var31 = var13.field29;
						boolean var32 = false;
						if (field392 == var13.field18 || field139 == var13.field18 || field299 == var13.field18) {
							var32 = true;
						}

						int var33;
						if (method86(var13)) {
							var33 = var13.field6;
							if (var32 && var13.field46 != 0) {
								var33 = var13.field46;
							}

							if (var13.field2.length() > 0) {
								var31 = var13.field2;
							}
						} else {
							var33 = var13.field49;
							if (var32 && var13.field72 != 0) {
								var33 = var13.field72;
							}
						}

						if (var13.field45 == 6 && field421) {
							var31 = "Please wait...";
							var33 = var13.field49;
						}

						if (NBXZFIDS.field1027 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1501 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method24(method127(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method24(method127(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method24(method127(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method24(method127(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method24(method127(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field7) {
								var30.method587(var13.field64 / 2 + var11, var33, var34, var41, var13.field65);
							} else {
								var30.method594(var11, var41, var34, var33, var13.field65);
							}

							var34 += var30.field1501;
						}
					} else if (var13.field61 == 5) {
						WQACZBNG var42;
						if (method86(var13)) {
							var42 = var13.field54;
						} else {
							var42 = var13.field71;
						}

						if (var42 != null) {
							var42.method548(var12, var11);
						}
					} else if (var13.field61 == 6) {
						int var43 = ORCVJTAI.field1064;
						int var44 = ORCVJTAI.field1065;
						ORCVJTAI.field1064 = var13.field64 / 2 + var11;
						ORCVJTAI.field1065 = var13.field50 / 2 + var12;
						int var45 = ORCVJTAI.field1068[var13.field39] * var13.field38 >> 16;
						int var46 = ORCVJTAI.field1069[var13.field39] * var13.field38 >> 16;
						boolean var47 = method86(var13);
						int var48;
						if (var47) {
							var48 = var13.field12;
						} else {
							var48 = var13.field11;
						}

						FLXAIVEA var49;
						if (var48 == -1) {
							var49 = var13.method6(var47, -1, -1);
						} else {
							BKDXLPEF var50 = BKDXLPEF.field75[var48];
							var49 = var13.method6(var47, var50.field78[var13.field73], var50.field77[var13.field73]);
						}

						if (var49 != null) {
							var49.method239(0, var13.field40, 0, var13.field39, 0, var45, var46);
						}

						ORCVJTAI.field1064 = var43;
						ORCVJTAI.field1065 = var44;
					} else {
						if (var13.field61 == 7) {
							ZFUOSNLM var51 = var13.field9;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field50; var53++) {
								for (int var54 = 0; var54 < var13.field64; var54++) {
									if (var13.field57[var52] > 0) {
										TGAGWNUA var55 = TGAGWNUA.method453(var13.field57[var52] - 1);
										String var56 = String.valueOf(var55.field1197);
										if (var55.field1234 || var13.field3[var52] != 1) {
											var56 = var56 + " x" + method158(var13.field3[var52]);
										}

										int var57 = (var13.field27 + 115) * var54 + var11;
										int var58 = (var13.field48 + 12) * var53 + var12;
										if (var13.field7) {
											var51.method587(var13.field64 / 2 + var57, var13.field49, var58, var56, var13.field65);
										} else {
											var51.method594(var57, var56, var58, var13.field49, var13.field65);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field61 == 8 && (field255 == var13.field18 || field142 == var13.field18 || field340 == var13.field18) && field337 == 100) {
							int var59 = 0;
							int var60 = 0;
							ZFUOSNLM var61 = field211;
							String var62 = var13.field29;
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

								int var65 = var61.method588(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1501 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field64 + var11 - var59 - 5;
							int var67 = var13.field50 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field64 + arg2) {
								var66 = arg1.field64 + arg2 - var59;
							}

							if (var60 + var67 > arg1.field50 + arg3) {
								var67 = arg1.field50 + arg3 - var60;
							}

							NBXZFIDS.method291(var66, var59, var67, 0xFFFFA0, var60);
							NBXZFIDS.method292(var60, var59, var66, var67, 0);
							String var68 = var13.field29;
							int var69 = var61.field1501 + var67 + 2;
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

								var61.method594(var66 + 3, var71, var69, 0, false);
								var69 += var61.field1501 + 1;
							}
						}
					}
				}
			}

			NBXZFIDS.method288(var5, var8, var6, var7);
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method48() {
		if (field372 == 0 && field849 == 1) {
			int var1 = field850 - 25 - 550;
			int var2 = field851 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field550 + field223 & 0x7FF;
				int var4 = ORCVJTAI.field1068[var3];
				int var5 = ORCVJTAI.field1069[var3];
				var4 = (field396 + 256) * var4 >> 8;
				var5 = (field396 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field128.field1396 + var6 >> 7;
				int var9 = field128.field1397 - var7 >> 7;
				boolean var10 = method27(var8, var9, 0, field128.field1405[0], 0, 1, 0, true, field128.field1404[0], 0, 0);
				if (var10) {
					field125.method330(var1);
					field125.method330(var2);
					field125.method331(field550);
					field125.method330(57);
					field125.method330(field223);
					field125.method330(field396);
					field125.method330(89);
					field125.method331(field128.field1396);
					field125.method331(field128.field1397);
					field125.method330(field507);
					field125.method330(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method49(int arg0) {
		ATOBWHST var2 = ATOBWHST.method4(arg0);
		for (int var3 = 0; var3 < var2.field30.length && var2.field30[var3] != -1; var3++) {
			ATOBWHST var4 = ATOBWHST.method4(var2.field30[var3]);
			if (var4.field61 == 1) {
				method49(var4.field18);
			}

			var4.field73 = 0;
			var4.field69 = 0;
		}
	}

	@ObfuscatedName("client.m(I)Z")
	public final boolean method50() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method51() {
		try {
			int var1 = field128.field1396 + field260;
			int var2 = field128.field1397 + field131;
			if (field214 - var1 < -500 || field214 - var1 > 500 || field215 - var2 < -500 || field215 - var2 > 500) {
				field214 = var1;
				field215 = var2;
			}

			if (field214 != var1) {
				field214 += (var1 - field214) / 16;
			}

			if (field215 != var2) {
				field215 += (var2 - field215) / 16;
			}

			if (field853[1] == 1) {
				field551 += (-field551 - 24) / 2;
			} else if (field853[2] == 1) {
				field551 += (24 - field551) / 2;
			} else {
				field551 /= 2;
			}

			if (field853[3] == 1) {
				field552 += (12 - field552) / 2;
			} else if (field853[4] == 1) {
				field552 += (-field552 - 12) / 2;
			} else {
				field552 /= 2;
			}

			field550 = field551 / 2 + field550 & 0x7FF;
			field549 += field552 / 2;
			if (field549 < 128) {
				field549 = 128;
			}

			if (field549 > 383) {
				field549 = 383;
			}

			int var3 = field214 >> 7;
			int var4 = field215 >> 7;
			int var5 = method66(field168, field215, field214);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field168;
						if (var9 < 3 && (field503[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field453[var9][var7][var8];
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

			if (var11 > field236) {
				field236 += (var11 - field236) / 24;
			} else if (var11 < field236) {
				field236 += (var11 - field236) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field128.field1396 + "," + field128.field1397 + "," + field214 + "," + field215 + "," + field282 + "," + field283 + "," + field365 + "," + field366);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IILXOZCTLMB;)V")
	public final void method52(int arg0, XOZCTLMB arg1) {
		method53(arg1.field1396, arg0, arg1.field1397);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method53(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method66(field168, arg2, arg0) - arg1;
			arg0 -= field462;
			var4 -= field463;
			arg2 -= field464;
			int var5 = FLXAIVEA.field747[field465];
			int var6 = FLXAIVEA.field748[field465];
			int var7 = FLXAIVEA.field747[field466];
			int var8 = FLXAIVEA.field748[field466];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field450 = (var9 << 9) / arg2 + ORCVJTAI.field1064;
				field451 = (var11 << 9) / arg2 + ORCVJTAI.field1065;
			} else {
				field450 = -1;
				field451 = -1;
			}
		} else {
			field450 = -1;
			field451 = -1;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method54() {
		while (true) {
			CPQQDQVK var1 = field239.method388();
			if (var1 == null) {
				return;
			}

			if (var1.field559 == 0) {
				FLXAIVEA.method216(var1.field561, var1.field558);

				if ((field239.method378(var1.field561) & 0x62) != 0) {
					field364 = true;

					if (field403 != -1 || field401 != -1) {
						field548 = true;
					}
				}
			}

			if (var1.field559 == 1 && var1.field558 != null) {
				NFWEZFJY.method299(var1.field558);
			}

			if (var1.field559 == 2 && field443 == var1.field561 && var1.field558 != null) {
				method31(field444, var1.field558);
			}

			if (var1.field559 == 3 && field314 == 1) {
				for (int var2 = 0; var2 < field523.length; var2++) {
					if (field447[var2] == var1.field561) {
						field523[var2] = var1.field558;

						if (var1.field558 == null) {
							field447[var2] = -1;
						}

						break;
					}

					if (field448[var2] == var1.field561) {
						field284[var2] = var1.field558;

						if (var1.field558 == null) {
							field448[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field559 == 93 && field239.method390(var1.field561)) {
				DBFHRNVI.method179(new PQBRPYKE(var1.field558), field239);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ZI)V")
	public final void method55(String arg0, int arg1) {
		field369 = arg1;
		field270 = arg0;
		method41();

		if (field119 == null) {
			super.method55(arg0, arg1);
		} else {
			field189.method186();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field212.method586("RuneScape is loading - please wait...", var3 / 2, 0xFFFFFF, var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			NBXZFIDS.method292(34, 304, var3 / 2 - 152, var6, 0x8C1111);
			NBXZFIDS.method292(32, 302, var3 / 2 - 151, var6 + 1, 0);
			NBXZFIDS.method291(var3 / 2 - 150, arg1 * 3, var6 + 2, 0x8C1111, 30);
			NBXZFIDS.method291(arg1 * 3 + var3 / 2 - 150, 300 - arg1 * 3, var6 + 2, 0, 30);
			field212.method586(arg0, var3 / 2, 0xFFFFFF, var4 / 2 + 5 - var5);
			field189.method187(202, field835, 171);

			if (field420) {
				field420 = false;

				if (!field373) {
					field190.method187(0, field835, 0);
					field191.method187(637, field835, 0);
				}

				field187.method187(128, field835, 0);
				field188.method187(202, field835, 371);
				field192.method187(0, field835, 265);
				field193.method187(562, field835, 265);
				field194.method187(128, field835, 171);
				field195.method187(562, field835, 171);
			}
		}
	}

	@ObfuscatedName("client.b(ILWQACZBNG;II)V")
	public final void method56(WQACZBNG arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field550 + field223 & 0x7FF;
			int var6 = FLXAIVEA.field747[var5];
			int var7 = FLXAIVEA.field748[var5];
			var6 = var6 * 256 / (field396 + 256);
			var7 = var7 * 256 / (field396 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field297.method553(83 - var13 - 20, 15, 20, var12 + 94 + 4 - 10, var10, 256, 15, 20);
		} else {
			method25(arg2, arg0, arg1);
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method57() {
		for (GWDACNJF var1 = (GWDACNJF) field273.method532(); var1 != null; var1 = (GWDACNJF) field273.method534()) {
			if (var1.field797 == -1) {
				var1.field808 = 0;
				method38(var1);
			} else {
				var1.method163();
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method58() {
		field313 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field295[var1] = -1;
			for (int var2 = 0; var2 < YUTTZGSS.field1487; var2++) {
				if (!YUTTZGSS.field1488[var2].field1494 && YUTTZGSS.field1488[var2].field1489 == var1 + (field183 ? 0 : 7)) {
					field295[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(BZ)V")
	public final void method59(boolean arg0) {
		for (int var2 = 0; var2 < field243; var2++) {
			TBFTCCSF var3 = field242[field244[var2]];
			int var4 = (field244[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method442() && var3.field1187.field941 == arg0 && var3.field1187.method265()) {
				int var5 = var3.field1396 >> 7;
				int var6 = var3.field1397 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1386 == 1 && (var3.field1396 & 0x7F) == 0x40 && (var3.field1397 & 0x7F) == 0x40) {
						if (field209[var5][var6] == field320) {
							continue;
						}

						field209[var5][var6] = field320;
					}

					if (!var3.field1187.field964) {
						var4 += Integer.MIN_VALUE;
					}

					field405.method482(var4, var3, var3.field1392, field168, method66(field168, var3.field1397, var3.field1396), (var3.field1386 - 1) * 64 + 60, var3.field1396, var3.field1398, var3.field1397);
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method60() {
		if (field460 > 0) {
			method141();
		} else {
			method142("Please wait - attempting to reestablish", "Connection lost");
			field372 = 0;
			field486 = 0;
			TVERLIYS var1 = field263;
			field412 = false;
			field143 = 0;
			method32(field185, field186, true);

			if (!field412) {
				method141();
			}

			try {
				var1.method464();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method61(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field140; var3++) {
				if (field120[var3] == arg0) {
					field140--;
					field364 = true;

					for (int var4 = var3; var4 < field140; var4++) {
						field120[var4] = field120[var4 + 1];
					}

					field125.method329(59);
					field125.method336(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method62() {
		if (field534 == 0 && field431 == 0) {
			field205[field249] = "Walk here";
			field165[field249] = 616;
			field163[field249] = field843;
			field164[field249] = field844;
			field249++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < FLXAIVEA.field745; var2++) {
			int var3 = FLXAIVEA.field746[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field405.method501(field168, var4, var5, var3) >= 0) {
					ELXAMLNA var8 = ELXAMLNA.method196(var7);
					if (var8.field664 != null) {
						var8 = var8.method195();
					}

					if (var8 == null) {
						continue;
					}

					if (field534 == 1) {
						field205[field249] = "Use " + field538 + " with @cya@" + var8.field650;
						field165[field249] = 804;
						field166[field249] = var3;
						field163[field249] = var4;
						field164[field249] = var5;
						field249++;
					} else if (field431 != 1) {
						if (var8.field669 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field669[var9] != null) {
									field205[field249] = var8.field669[var9] + " @cya@" + var8.field650;

									if (var9 == 0) {
										field165[field249] = 513;
									}

									if (var9 == 1) {
										field165[field249] = 20;
									}

									if (var9 == 2) {
										field165[field249] = 155;
									}

									if (var9 == 3) {
										field165[field249] = 826;
									}

									if (var9 == 4) {
										field165[field249] = 1234;
									}

									field166[field249] = var3;
									field163[field249] = var4;
									field164[field249] = var5;
									field249++;
								}
							}
						}

						field205[field249] = "Examine @cya@" + var8.field650;
						field165[field249] = 1420;
						field166[field249] = var8.field649 << 14;
						field163[field249] = var4;
						field164[field249] = var5;
						field249++;
					} else if ((field433 & 0x4) == 4) {
						field205[field249] = field434 + " @cya@" + var8.field650;
						field165[field249] = 652;
						field166[field249] = var3;
						field163[field249] = var4;
						field164[field249] = var5;
						field249++;
					}
				}

				if (var6 == 1) {
					TBFTCCSF var10 = field242[var7];
					if (var10.field1187.field948 == 1 && (var10.field1396 & 0x7F) == 0x40 && (var10.field1397 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field243; var11++) {
							TBFTCCSF var12 = field242[field244[var11]];
							if (var12 != null && var10 != var12 && var12.field1187.field948 == 1 && var10.field1396 == var12.field1396 && var10.field1397 == var12.field1397) {
								method113(var4, var12.field1187, field244[var11], var5);
							}
						}

						for (int var13 = 0; var13 < field425; var13++) {
							TPTANZXN var14 = field424[field426[var13]];
							if (var14 != null && var10.field1396 == var14.field1396 && var10.field1397 == var14.field1397) {
								method99(var5, var14, field426[var13], var4);
							}
						}
					}

					method113(var4, var10.field1187, var7, var5);
				}

				if (var6 == 0) {
					TPTANZXN var15 = field424[var7];
					if ((var15.field1396 & 0x7F) == 0x40 && (var15.field1397 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field243; var16++) {
							TBFTCCSF var17 = field242[field244[var16]];
							if (var17 != null && var17.field1187.field948 == 1 && var15.field1396 == var17.field1396 && var15.field1397 == var17.field1397) {
								method113(var4, var17.field1187, field244[var16], var5);
							}
						}

						for (int var18 = 0; var18 < field425; var18++) {
							TPTANZXN var19 = field424[field426[var18]];
							if (var19 != null && var15 != var19 && var15.field1396 == var19.field1396 && var15.field1397 == var19.field1397) {
								method99(var5, var19, field426[var18], var4);
							}
						}
					}

					method99(var5, var15, var7, var4);
				}

				if (var6 == 3) {
					VGFLNLXH var20 = field416[field168][var4][var5];
					if (var20 != null) {
						for (VUGJZKVT var21 = (VUGJZKVT) var20.method533(); var21 != null; var21 = (VUGJZKVT) var20.method535()) {
							TGAGWNUA var22 = TGAGWNUA.method453(var21.field1353);
							if (field534 == 1) {
								field205[field249] = "Use " + field538 + " with @lre@" + var22.field1197;
								field165[field249] = 417;
								field166[field249] = var21.field1353;
								field163[field249] = var4;
								field164[field249] = var5;
								field249++;
							} else if (field431 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1218 != null && var22.field1218[var23] != null) {
										field205[field249] = var22.field1218[var23] + " @lre@" + var22.field1197;

										if (var23 == 0) {
											field165[field249] = 108;
										}

										if (var23 == 1) {
											field165[field249] = 715;
										}

										if (var23 == 2) {
											field165[field249] = 764;
										}

										if (var23 == 3) {
											field165[field249] = 330;
										}

										if (var23 == 4) {
											field165[field249] = 21;
										}

										field166[field249] = var21.field1353;
										field163[field249] = var4;
										field164[field249] = var5;
										field249++;
									} else if (var23 == 2) {
										field205[field249] = "Take @lre@" + var22.field1197;
										field165[field249] = 764;
										field166[field249] = var21.field1353;
										field163[field249] = var4;
										field164[field249] = var5;
										field249++;
									}
								}

								field205[field249] = "Examine @lre@" + var22.field1197;
								field165[field249] = 1663;
								field166[field249] = var21.field1353;
								field163[field249] = var4;
								field164[field249] = var5;
								field249++;
							} else if ((field433 & 0x1) == 1) {
								field205[field249] = field434 + " @lre@" + var22.field1197;
								field165[field249] = 712;
								field166[field249] = var21.field1353;
								field163[field249] = var4;
								field164[field249] = var5;
								field249++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method63(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	public final void run() {
		if (field332) {
			method34();
		} else {
			super.run();
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public static final String method64(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.j(B)V")
	public final void method65() {
		if (field836 == null) {
			method146();
			field187 = null;
			field188 = null;
			field189 = null;
			field190 = null;
			field191 = null;
			field192 = null;
			field193 = null;
			field194 = null;
			field195 = null;
			field292 = null;
			field290 = null;
			field289 = null;
			field291 = null;
			field528 = null;
			field529 = null;
			field530 = null;
			field836 = new DRNBRPSO(503, 765, method153());
			field420 = true;
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method66(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field503[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field453[var6][var4][var5] + field453[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field453[var6][var4][var5 + 1] + field453[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method67(int arg0, int arg1) {
		VGFLNLXH var3 = field416[field168][arg0][arg1];
		if (var3 == null) {
			field405.method492(field168, arg0, arg1);
		} else {
			int var4 = -99999999;
			VUGJZKVT var5 = null;
			for (VUGJZKVT var6 = (VUGJZKVT) var3.method532(); var6 != null; var6 = (VUGJZKVT) var3.method534()) {
				TGAGWNUA var7 = TGAGWNUA.method453(var6.field1353);
				int var8 = var7.field1210;
				if (var7.field1234) {
					var8 = (var6.field1354 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method530(var5);
			VUGJZKVT var9 = null;
			VUGJZKVT var10 = null;
			for (VUGJZKVT var11 = (VUGJZKVT) var3.method532(); var11 != null; var11 = (VUGJZKVT) var3.method534()) {
				if (var5.field1353 != var11.field1353 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1353 != var11.field1353 && var9.field1353 != var11.field1353 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field405.method478(field168, arg0, method66(field168, arg1 * 128 + 64, arg0 * 128 + 64), var9, var12, arg1, var5, var10);
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method68(long arg0) {
		if (arg0 != 0L) {
			if (field140 >= 100) {
				method102("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = VUKQGAWR.method541(VUKQGAWR.method538(arg0));
				for (int var4 = 0; var4 < field140; var4++) {
					if (field120[var4] == arg0) {
						method102(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field122; var5++) {
					if (field479[var5] == arg0) {
						method102("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field120[field140++] = arg0;
				field364 = true;
				field125.method329(129);
				field125.method336(arg0);
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method69() {
		for (int var1 = 0; var1 < field243; var1++) {
			int var2 = field244[var1];
			TBFTCCSF var3 = field242[var2];
			if (var3 != null) {
				method70(var3.field1187.field948, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILXOZCTLMB;I)V")
	public final void method70(int arg0, XOZCTLMB arg1) {
		if (arg1.field1396 < 128 || arg1.field1397 < 128 || arg1.field1396 >= 13184 || arg1.field1397 >= 13184) {
			arg1.field1424 = -1;
			arg1.field1407 = -1;
			arg1.field1383 = 0;
			arg1.field1384 = 0;
			arg1.field1396 = arg1.field1404[0] * 128 + arg1.field1386 * 64;
			arg1.field1397 = arg1.field1405[0] * 128 + arg1.field1386 * 64;
			arg1.method562();
		}

		if (field128 == arg1 && (arg1.field1396 < 1536 || arg1.field1397 < 1536 || arg1.field1396 >= 11776 || arg1.field1397 >= 11776)) {
			arg1.field1424 = -1;
			arg1.field1407 = -1;
			arg1.field1383 = 0;
			arg1.field1384 = 0;
			arg1.field1396 = arg1.field1404[0] * 128 + arg1.field1386 * 64;
			arg1.field1397 = arg1.field1405[0] * 128 + arg1.field1386 * 64;
			arg1.method562();
		}

		if (arg1.field1383 > field526) {
			method71(arg1);
		} else if (arg1.field1384 >= field526) {
			method72(arg1);
		} else {
			method73(arg1);
		}

		method74(arg1);
		method75(arg1);
	}

	@ObfuscatedName("client.a(LXOZCTLMB;I)V")
	public final void method71(XOZCTLMB arg0) {
		int var2 = arg0.field1383 - field526;
		int var3 = arg0.field1386 * 64 + arg0.field1379 * 128;
		int var4 = arg0.field1386 * 64 + arg0.field1381 * 128;
		arg0.field1396 += (var3 - arg0.field1396) / var2;
		arg0.field1397 += (var4 - arg0.field1397) / var2;
		arg0.field1403 = 0;

		if (arg0.field1385 == 0) {
			arg0.field1387 = 1024;
		}

		if (arg0.field1385 == 1) {
			arg0.field1387 = 1536;
		}

		if (arg0.field1385 == 2) {
			arg0.field1387 = 0;
		}

		if (arg0.field1385 == 3) {
			arg0.field1387 = 512;
		}
	}

	@ObfuscatedName("client.a(ILXOZCTLMB;)V")
	public final void method72(XOZCTLMB arg0) {
		if (field526 == arg0.field1384 || arg0.field1424 == -1 || arg0.field1427 != 0 || arg0.field1426 + 1 > BKDXLPEF.field75[arg0.field1424].method12(arg0.field1425)) {
			int var2 = arg0.field1384 - arg0.field1383;
			int var3 = field526 - arg0.field1383;
			int var4 = arg0.field1386 * 64 + arg0.field1379 * 128;
			int var5 = arg0.field1386 * 64 + arg0.field1381 * 128;
			int var6 = arg0.field1386 * 64 + arg0.field1380 * 128;
			int var7 = arg0.field1386 * 64 + arg0.field1382 * 128;
			arg0.field1396 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1397 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1403 = 0;

		if (arg0.field1385 == 0) {
			arg0.field1387 = 1024;
		}

		if (arg0.field1385 == 1) {
			arg0.field1387 = 1536;
		}

		if (arg0.field1385 == 2) {
			arg0.field1387 = 0;
		}

		if (arg0.field1385 == 3) {
			arg0.field1387 = 512;
		}

		arg0.field1398 = arg0.field1387;
	}

	@ObfuscatedName("client.a(ZLXOZCTLMB;)V")
	public final void method73(XOZCTLMB arg0) {
		arg0.field1400 = arg0.field1414;
		if (arg0.field1412 == 0) {
			arg0.field1403 = 0;
		} else {
			if (arg0.field1424 != -1 && arg0.field1427 == 0) {
				BKDXLPEF var2 = BKDXLPEF.field75[arg0.field1424];
				if (arg0.field1422 > 0 && var2.field87 == 0) {
					arg0.field1403++;
					return;
				}

				if (arg0.field1422 <= 0 && var2.field88 == 0) {
					arg0.field1403++;
					return;
				}
			}

			int var3 = arg0.field1396;
			int var4 = arg0.field1397;
			int var5 = arg0.field1404[arg0.field1412 - 1] * 128 + arg0.field1386 * 64;
			int var6 = arg0.field1405[arg0.field1412 - 1] * 128 + arg0.field1386 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1387 = 1280;
					} else if (var4 > var6) {
						arg0.field1387 = 1792;
					} else {
						arg0.field1387 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1387 = 768;
					} else if (var4 > var6) {
						arg0.field1387 = 256;
					} else {
						arg0.field1387 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1387 = 1024;
				} else {
					arg0.field1387 = 0;
				}

				int var7 = arg0.field1387 - arg0.field1398 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1389;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1388;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1391;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1390;
				}

				if (var8 == -1) {
					var8 = arg0.field1388;
				}

				arg0.field1400 = var8;
				int var9 = 4;
				if (arg0.field1398 != arg0.field1387 && arg0.field1406 == -1 && arg0.field1399 != 0) {
					var9 = 2;
				}

				if (arg0.field1412 > 2) {
					var9 = 6;
				}

				if (arg0.field1412 > 3) {
					var9 = 8;
				}

				if (arg0.field1403 > 0 && arg0.field1412 > 1) {
					var9 = 8;
					arg0.field1403--;
				}

				if (arg0.field1416[arg0.field1412 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1400 == arg0.field1388 && arg0.field1430 != -1) {
					arg0.field1400 = arg0.field1430;
				}

				if (var3 < var5) {
					arg0.field1396 += var9;
					if (arg0.field1396 > var5) {
						arg0.field1396 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1396 -= var9;
					if (arg0.field1396 < var5) {
						arg0.field1396 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1397 += var9;
					if (arg0.field1397 > var6) {
						arg0.field1397 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1397 -= var9;
					if (arg0.field1397 < var6) {
						arg0.field1397 = var6;
					}
				}

				if (arg0.field1396 == var5 && arg0.field1397 == var6) {
					arg0.field1412--;

					if (arg0.field1422 > 0) {
						arg0.field1422--;
						return;
					}
				}
			} else {
				arg0.field1396 = var5;
				arg0.field1397 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(LXOZCTLMB;I)V")
	public final void method74(XOZCTLMB arg0) {
		if (arg0.field1399 != 0) {
			if (arg0.field1406 != -1 && arg0.field1406 < 32768) {
				TBFTCCSF var2 = field242[arg0.field1406];
				if (var2 != null) {
					int var3 = arg0.field1396 - var2.field1396;
					int var4 = arg0.field1397 - var2.field1397;
					if (var3 != 0 || var4 != 0) {
						arg0.field1387 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1406 >= 32768) {
				int var5 = arg0.field1406 - 32768;
				if (field146 == var5) {
					var5 = field423;
				}

				TPTANZXN var6 = field424[var5];
				if (var6 != null) {
					int var7 = arg0.field1396 - var6.field1396;
					int var8 = arg0.field1397 - var6.field1397;
					if (var7 != 0 || var8 != 0) {
						arg0.field1387 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1419 != 0 || arg0.field1420 != 0) && (arg0.field1412 == 0 || arg0.field1403 > 0)) {
				int var9 = arg0.field1396 - (arg0.field1419 - field365 - field365) * 64;
				int var10 = arg0.field1397 - (arg0.field1420 - field366 - field366) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1387 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1419 = 0;
				arg0.field1420 = 0;
			}

			int var11 = arg0.field1387 - arg0.field1398 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1399 || var11 > 2048 - arg0.field1399) {
					arg0.field1398 = arg0.field1387;
				} else if (var11 > 1024) {
					arg0.field1398 -= arg0.field1399;
				} else {
					arg0.field1398 += arg0.field1399;
				}

				arg0.field1398 &= 0x7FF;
				if (arg0.field1414 == arg0.field1400 && arg0.field1398 != arg0.field1387) {
					if (arg0.field1415 != -1) {
						arg0.field1400 = arg0.field1415;
						return;
					}

					arg0.field1400 = arg0.field1388;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILXOZCTLMB;)V")
	public final void method75(XOZCTLMB arg0) {
		arg0.field1392 = false;

		if (arg0.field1400 != -1) {
			BKDXLPEF var2 = BKDXLPEF.field75[arg0.field1400];
			arg0.field1402++;
			if (arg0.field1401 < var2.field76 && arg0.field1402 > var2.method12(arg0.field1401)) {
				arg0.field1402 = 1;
				arg0.field1401++;
			}

			if (arg0.field1401 >= var2.field76) {
				arg0.field1402 = 1;
				arg0.field1401 = 0;
			}
		}

		if (arg0.field1407 != -1 && field526 >= arg0.field1410) {
			if (arg0.field1408 < 0) {
				arg0.field1408 = 0;
			}

			BKDXLPEF var3 = OKJTNJLE.field1046[arg0.field1407].field1050;
			arg0.field1409++;
			if (arg0.field1408 < var3.field76 && arg0.field1409 > var3.method12(arg0.field1408)) {
				arg0.field1409 = 1;
				arg0.field1408++;
			}

			if (arg0.field1408 >= var3.field76 && (arg0.field1408 < 0 || arg0.field1408 >= var3.field76)) {
				arg0.field1407 = -1;
			}
		}

		if (arg0.field1424 != -1 && arg0.field1427 <= 1) {
			BKDXLPEF var4 = BKDXLPEF.field75[arg0.field1424];
			if (var4.field87 == 1 && arg0.field1422 > 0 && arg0.field1383 <= field526 && arg0.field1384 < field526) {
				arg0.field1427 = 1;
				return;
			}
		}

		if (arg0.field1424 != -1 && arg0.field1427 == 0) {
			BKDXLPEF var5 = BKDXLPEF.field75[arg0.field1424];
			arg0.field1426++;
			if (arg0.field1425 < var5.field76 && arg0.field1426 > var5.method12(arg0.field1425)) {
				arg0.field1426 = 1;
				arg0.field1425++;
			}

			if (arg0.field1425 >= var5.field76) {
				arg0.field1425 -= var5.field80;
				arg0.field1428++;
				if (arg0.field1428 >= var5.field86) {
					arg0.field1424 = -1;
				}

				if (arg0.field1425 < 0 || arg0.field1425 >= var5.field76) {
					arg0.field1424 = -1;
				}
			}

			arg0.field1392 = var5.field82;
		}

		if (arg0.field1427 > 0) {
			arg0.field1427--;
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method76() {
		if (field229 == -1 || field314 != 2 && field836 == null) {
			if (field420) {
				method91();
				field420 = false;
				field172.method187(0, field835, 4);
				field173.method187(0, field835, 357);
				field174.method187(722, field835, 4);
				field175.method187(743, field835, 205);
				field176.method187(0, field835, 0);
				field177.method187(516, field835, 4);
				field178.method187(516, field835, 205);
				field179.method187(496, field835, 357);
				field180.method187(0, field835, 338);
				field364 = true;
				field548 = true;
				field167 = true;
				field310 = true;

				if (field314 != 2) {
					field291.method187(4, field835, 4);
					field290.method187(550, field835, 4);
				}
			}

			if (field314 == 2) {
				method148();
			}

			if (field159 && field300 == 1) {
				field364 = true;
			}

			if (field208 != -1) {
				boolean var3 = method100(field230, field208);
				if (var3) {
					field364 = true;
				}
			}

			if (field248 == 2) {
				field364 = true;
			}

			if (field482 == 2) {
				field364 = true;
			}

			if (field364) {
				method77();
				field364 = false;
			}

			if (field403 == -1 && field476 == 0) {
				field222.field60 = field445 - field336 - 77;

				if (field843 > 448 && field843 < 560 && field844 > 332) {
					method88(77, field844 - 357, -1, field222, field843 - 17, field445, 463, 0);
				}

				int var4 = field445 - field222.field60 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field445 - 77) {
					var4 = field445 - 77;
				}

				if (field336 != var4) {
					field336 = var4;
					field548 = true;
				}
			}

			if (field403 == -1 && field476 == 3) {
				int var5 = field149 * 14 + 7;
				field222.field60 = field152;

				if (field843 > 448 && field843 < 560 && field844 > 332) {
					method88(77, field844 - 357, -1, field222, field843 - 17, var5, 463, 0);
				}

				int var6 = field222.field60;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field152 != var6) {
					field152 = var6;
					field548 = true;
				}
			}

			if (field403 != -1) {
				boolean var7 = method100(field230, field403);
				if (var7) {
					field548 = true;
				}
			}

			if (field248 == 3) {
				field548 = true;
			}

			if (field482 == 3) {
				field548 = true;
			}

			if (field315 != null) {
				field548 = true;
			}

			if (field159 && field300 == 2) {
				field548 = true;
			}

			if (field548) {
				method114();
				field548 = false;
			}

			if (field314 == 2) {
				method94();
				field290.method187(550, field835, 4);
				field342++;
				if (field342 > 1246) {
					field342 = 0;
					field125.method329(232);
					field125.method330(0);
					int var8 = field125.field1091;
					field125.method331(23861);
					field125.method330(28);
					field125.method331(63549);
					field125.method330(30);

					if ((int) (Math.random() * 2.0D) == 0) {
						field125.method331(30108);
					}

					field125.method330((int) (Math.random() * 256.0D));

					if ((int) (Math.random() * 2.0D) == 0) {
						field125.method330(7);
					}

					if ((int) (Math.random() * 2.0D) == 0) {
						field125.method331(23140);
					}

					if ((int) (Math.random() * 2.0D) == 0) {
						field125.method330(247);
					}

					field125.method331(43120);
					field125.method339(field125.field1091 - var8);
				}
			}

			if (field517 != -1) {
				field167 = true;
			}

			if (field167) {
				if (field517 != -1 && field517 == field472) {
					field517 = -1;
					field125.method329(242);
					field125.method330(field472);
				}

				field167 = false;
				field530.method186();
				field253.method527(0, 0);

				if (field208 == -1) {
					if (field520[field472] != -1) {
						if (field472 == 0) {
							field512.method527(10, 22);
						}

						if (field472 == 1) {
							field513.method527(8, 54);
						}

						if (field472 == 2) {
							field513.method527(8, 82);
						}

						if (field472 == 3) {
							field514.method527(8, 110);
						}

						if (field472 == 4) {
							field516.method527(8, 153);
						}

						if (field472 == 5) {
							field516.method527(8, 181);
						}

						if (field472 == 6) {
							field515.method527(9, 209);
						}
					}

					if (field520[0] != -1 && (field517 != 0 || field526 % 20 < 10)) {
						field402[0].method527(13, 29);
					}

					if (field520[1] != -1 && (field517 != 1 || field526 % 20 < 10)) {
						field402[1].method527(11, 53);
					}

					if (field520[2] != -1 && (field517 != 2 || field526 % 20 < 10)) {
						field402[2].method527(11, 82);
					}

					if (field520[3] != -1 && (field517 != 3 || field526 % 20 < 10)) {
						field402[3].method527(12, 115);
					}

					if (field520[4] != -1 && (field517 != 4 || field526 % 20 < 10)) {
						field402[4].method527(13, 153);
					}

					if (field520[5] != -1 && (field517 != 5 || field526 % 20 < 10)) {
						field402[5].method527(11, 180);
					}

					if (field520[6] != -1 && (field517 != 6 || field526 % 20 < 10)) {
						field402[6].method527(13, 208);
					}
				}

				field530.method187(516, field835, 160);
				field250++;
				if (field250 > 1764) {
					field250 = 0;
					field125.method329(49);
					field125.method330(0);
					int var9 = field125.field1091;
					field125.method331(51137);
					field125.method331(62484);
					field125.method330((int) (Math.random() * 256.0D));
					field125.method330(21);

					if ((int) (Math.random() * 2.0D) == 0) {
						field125.method331(59541);
					}

					field125.method330((int) (Math.random() * 256.0D));
					field125.method331(15406);

					if ((int) (Math.random() * 2.0D) == 0) {
						field125.method331(19970);
					}

					field125.method330(219);

					if ((int) (Math.random() * 2.0D) == 0) {
						field125.method331(18918);
					}

					field125.method339(field125.field1091 - var9);
				}

				field529.method186();
				field252.method527(0, 0);

				if (field208 == -1) {
					if (field520[field472] != -1) {
						if (field472 == 7) {
							field326.method527(0, 42);
						}

						if (field472 == 8) {
							field327.method527(0, 74);
						}

						if (field472 == 9) {
							field327.method527(0, 102);
						}

						if (field472 == 10) {
							field328.method527(1, 130);
						}

						if (field472 == 11) {
							field330.method527(0, 173);
						}

						if (field472 == 12) {
							field330.method527(0, 201);
						}

						if (field472 == 13) {
							field329.method527(0, 229);
						}
					}

					if (field520[8] != -1 && (field517 != 8 || field526 % 20 < 10)) {
						field402[7].method527(2, 74);
					}

					if (field520[9] != -1 && (field517 != 9 || field526 % 20 < 10)) {
						field402[8].method527(3, 102);
					}

					if (field520[10] != -1 && (field517 != 10 || field526 % 20 < 10)) {
						field402[9].method527(4, 137);
					}

					if (field520[11] != -1 && (field517 != 11 || field526 % 20 < 10)) {
						field402[10].method527(2, 174);
					}

					if (field520[12] != -1 && (field517 != 12 || field526 % 20 < 10)) {
						field402[11].method527(2, 201);
					}

					if (field520[13] != -1 && (field517 != 13 || field526 % 20 < 10)) {
						field402[12].method527(2, 226);
					}
				}

				field529.method187(496, field835, 466);
				field291.method186();
				ORCVJTAI.field1070 = field390;
			}

			if (field310) {
				field310 = false;
				field528.method186();
				field251.method527(0, 0);
				field211.method587(55, 0xFFFFFF, 28, "Public chat", true);

				if (field371 == 0) {
					field211.method587(55, 0xFF00, 41, "On", true);
				}

				if (field371 == 1) {
					field211.method587(55, 0xFFFF00, 41, "Friends", true);
				}

				if (field371 == 2) {
					field211.method587(55, 0xFF0000, 41, "Off", true);
				}

				if (field371 == 3) {
					field211.method587(55, 0xFFFF, 41, "Hide", true);
				}

				field211.method587(184, 0xFFFFFF, 28, "Private chat", true);

				if (field331 == 0) {
					field211.method587(184, 0xFF00, 41, "On", true);
				}

				if (field331 == 1) {
					field211.method587(184, 0xFFFF00, 41, "Friends", true);
				}

				if (field331 == 2) {
					field211.method587(184, 0xFF0000, 41, "Off", true);
				}

				field211.method587(324, 0xFFFFFF, 28, "Trade/compete", true);

				if (field181 == 0) {
					field211.method587(324, 0xFF00, 41, "On", true);
				}

				if (field181 == 1) {
					field211.method587(324, 0xFFFF00, 41, "Friends", true);
				}

				if (field181 == 2) {
					field211.method587(324, 0xFF0000, 41, "Off", true);
				}

				field211.method587(458, 0xFFFFFF, 33, "Report abuse", true);
				field528.method187(0, field835, 453);
				field291.method186();
				ORCVJTAI.field1070 = field390;
			}

			field230 = 0;
		} else {
			if (field314 == 2) {
				method100(field230, field229);

				if (field169 != -1) {
					method100(field230, field169);
				}

				field230 = 0;
				method65();
				field836.method186();
				ORCVJTAI.field1070 = field391;
				NBXZFIDS.method289();
				field420 = true;
				ATOBWHST var1 = ATOBWHST.method4(field229);
				if (var1.field64 == 512 && var1.field50 == 334 && var1.field61 == 0) {
					var1.field64 = 765;
					var1.field50 = 503;
				}

				method47(0, var1, 0, 0);

				if (field169 != -1) {
					ATOBWHST var2 = ATOBWHST.method4(field169);
					if (var2.field64 == 512 && var2.field50 == 334 && var2.field61 == 0) {
						var2.field64 = 765;
						var2.field50 = 503;
					}

					method47(0, var2, 0, 0);
				}

				if (field159) {
					method107();
				} else {
					method159();
					method111();
				}
			}

			field836.method187(0, field835, 0);
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method77() {
		field289.method186();
		ORCVJTAI.field1070 = field389;
		field378.method527(0, 0);

		if (field208 != -1) {
			method47(0, ATOBWHST.method4(field208), 0, 0);
		} else if (field520[field472] != -1) {
			method47(0, ATOBWHST.method4(field520[field472]), 0, 0);
		}

		if (field159 && field300 == 1) {
			method107();
		}

		field289.method187(553, field835, 205);
		field291.method186();
		ORCVJTAI.field1070 = field390;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method78(int arg0) {
		if (!field228) {
			for (int var2 = 0; var2 < field524.length; var2++) {
				int var3 = field524[var2];
				if (ORCVJTAI.field1078[var3] >= arg0) {
					VEIVHFHZ var4 = ORCVJTAI.field1072[var3];
					int var5 = var4.field1346 * var4.field1345 - 1;
					int var6 = field230 * var4.field1345 * 2;
					byte[] var7 = var4.field1343;
					byte[] var8 = field218;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1343 = var8;
					field218 = var7;
					ORCVJTAI.method313(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method79() {
		short var1 = 256;

		if (field555 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field555 > 768) {
					field274[var2] = method133(1024 - field555, field275[var2], field276[var2]);
				} else if (field555 > 256) {
					field274[var2] = field276[var2];
				} else {
					field274[var2] = method133(256 - field555, field276[var2], field275[var2]);
				}
			}
		} else if (field556 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field556 > 768) {
					field274[var3] = method133(1024 - field556, field275[var3], field277[var3]);
				} else if (field556 > 256) {
					field274[var3] = field277[var3];
				} else {
					field274[var3] = method133(256 - field556, field277[var3], field275[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field274[var4] = field275[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field190.field590[var5] = field474.field1356[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field129[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field521[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field274[var12];
					int var15 = field190.field590[var7];
					field190.field590[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field190.method187(0, field835, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field191.field590[var16] = field475.field1356[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field129[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field521[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field274[var23];
					int var26 = field191.field590[var18];
					field191.field590[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field191.method187(637, field835, 0);
	}

	@ObfuscatedName("client.u(I)V")
	public final void method80() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		GWDACNJF var10 = null;
		for (GWDACNJF var11 = (GWDACNJF) field273.method532(); var11 != null; var11 = (GWDACNJF) field273.method534()) {
			if (var11.field804 == arg2 && var11.field806 == arg5 && var11.field807 == arg6 && var11.field805 == arg4) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new GWDACNJF();
			var10.field804 = arg2;
			var10.field805 = arg4;
			var10.field806 = arg5;
			var10.field807 = arg6;
			method38(var10);
			field273.method529(var10);
		}

		var10.field798 = arg8;
		var10.field800 = arg1;
		var10.field799 = arg7;
		var10.field808 = arg0;
		var10.field797 = arg3;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method82() {
		for (int var1 = -1; var1 < field425; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field423;
			} else {
				var2 = field426[var1];
			}

			TPTANZXN var3 = field424[var2];
			if (var3 != null && var3.field1417 > 0) {
				var3.field1417--;
				if (var3.field1417 == 0) {
					var3.field1429 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field243; var4++) {
			int var5 = field244[var4];
			TBFTCCSF var6 = field242[var5];
			if (var6 != null && var6.field1417 > 0) {
				var6.field1417--;
				if (var6.field1417 == 0) {
					var6.field1429 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public static final void method83() {
		UMNOCQQA.field1274 = true;
		ORCVJTAI.field1059 = true;
		field228 = true;
		DBFHRNVI.field567 = true;
		ELXAMLNA.field670 = true;
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method84(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.x(I)Ljava/net/Socket;")
	public final Socket method85(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(LATOBWHST;I)Z")
	public final boolean method86(ATOBWHST arg0) {
		if (arg0.field10 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field10.length; var2++) {
			int var3 = method127(var2, arg0);
			int var4 = arg0.field35[var2];
			if (arg0.field10[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field10[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field10[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.c(III)V")
	public final void method87(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field385[var4] != null) {
				int var5 = field383[var4];
				int var6 = field336 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field384[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field371 == 0 || field371 == 1 && method137(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field128.field1261)) {
						if (field404 >= 1) {
							field205[field249] = "Report abuse @whi@" + var7;
							field165[field249] = 376;
							field249++;
						}

						field205[field249] = "Add ignore @whi@" + var7;
						field165[field249] = 720;
						field249++;
						field205[field249] = "Add friend @whi@" + var7;
						field165[field249] = 675;
						field249++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field278 == 0 && (var5 == 7 || field331 == 0 || field331 == 1 && method137(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field404 >= 1) {
							field205[field249] = "Report abuse @whi@" + var7;
							field165[field249] = 376;
							field249++;
						}

						field205[field249] = "Add ignore @whi@" + var7;
						field165[field249] = 720;
						field249++;
						field205[field249] = "Add friend @whi@" + var7;
						field165[field249] = 675;
						field249++;
					}

					var3++;
				}

				if (var5 == 4 && (field181 == 0 || field181 == 1 && method137(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field205[field249] = "Accept trade @whi@" + var7;
						field165[field249] = 464;
						field249++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field278 == 0 && field331 < 2) {
					var3++;
				}

				if (var5 == 8 && (field181 == 0 || field181 == 1 && method137(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field205[field249] = "Accept challenge @whi@" + var7;
						field165[field249] = 323;
						field249++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILATOBWHST;IIIBI)V")
	public final void method88(int arg0, int arg1, int arg2, ATOBWHST arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field254) {
			field293 = 32;
		} else {
			field293 = 0;
		}

		field254 = false;
		if (arg4 >= arg6 && arg4 < arg6 + 16 && arg1 >= arg7 && arg1 < arg7 + 16) {
			arg3.field60 -= field335 * 4;

			if (arg2 == 1) {
				field364 = true;
			}

			if (arg2 == 2 || arg2 == 3) {
				field548 = true;
			}
		} else if (arg4 >= arg6 && arg4 < arg6 + 16 && arg1 >= arg0 + arg7 - 16 && arg1 < arg0 + arg7) {
			arg3.field60 += field335 * 4;

			if (arg2 == 1) {
				field364 = true;
			}

			if (arg2 == 2 || arg2 == 3) {
				field548 = true;
			}
		} else if (arg4 >= arg6 - field293 && arg4 < arg6 + field293 + 16 && arg1 >= arg7 + 16 && arg1 < arg0 + arg7 - 16 && field335 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg7 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg3.field60 = (arg5 - arg0) * var10 / var11;

			if (arg2 == 1) {
				field364 = true;
			}

			if (arg2 == 2 || arg2 == 3) {
				field548 = true;
			}

			field254 = true;
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method89(String arg0) throws IOException {
		if (field357) {
			if (field306 != null) {
				try {
					field306.close();
				} catch (Exception var4) {
				}

				field306 = null;
			}

			field306 = method85(43595);
			field306.setSoTimeout(10000);
			InputStream var2 = field306.getInputStream();
			OutputStream var3 = field306.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(IIZ)Ljava/lang/String;")
	public static final String method90(int arg0, int arg1) {
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

	@ObfuscatedName("client.d(Z)V")
	public final void method91() {
		if (field292 == null) {
			method146();
			field836 = null;
			field187 = null;
			field188 = null;
			field189 = null;
			field190 = null;
			field191 = null;
			field192 = null;
			field193 = null;
			field194 = null;
			field195 = null;
			field292 = new DRNBRPSO(96, 479, method153());
			field290 = new DRNBRPSO(156, 172, method153());
			NBXZFIDS.method289();
			field379.method527(0, 0);
			field289 = new DRNBRPSO(261, 190, method153());
			field291 = new DRNBRPSO(334, 512, method153());
			NBXZFIDS.method289();
			field528 = new DRNBRPSO(50, 496, method153());
			field529 = new DRNBRPSO(37, 269, method153());
			field530 = new DRNBRPSO(45, 249, method153());
			field420 = true;
			field291.method186();
			ORCVJTAI.field1070 = field390;
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 374);

			if (arg0.length == 5) {
				field225 = Integer.parseInt(arg0[0]);
				field226 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method83();
				} else if (arg0[2].equals("highmem")) {
					method42();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field227 = false;
				} else if (arg0[3].equals("members")) {
					field227 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method259(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(ZIIIIIII)V")
	public final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
			if (field228 && field168 != arg3) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field405.method497(arg3, arg5, arg6);
			}

			if (arg1 == 1) {
				var8 = field405.method498(arg3, arg6, arg5);
			}

			if (arg1 == 2) {
				var8 = field405.method499(arg3, arg5, arg6);
			}

			if (arg1 == 3) {
				var8 = field405.method500(arg3, arg5, arg6);
			}

			if (var8 != 0) {
				int var12 = field405.method501(arg3, arg5, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field405.method488(arg6, arg3, arg5);
					ELXAMLNA var16 = ELXAMLNA.method196(var13);
					if (var16.field637) {
						field238[arg3].method207(arg6, arg5, var16.field635, var14, var15);
					}
				}

				if (arg1 == 1) {
					field405.method489(arg6, arg3, arg5);
				}

				if (arg1 == 2) {
					field405.method490(arg5, arg6, arg3);
					ELXAMLNA var17 = ELXAMLNA.method196(var13);
					if (var17.field631 + arg5 > 103 || var17.field631 + arg6 > 103 || var17.field661 + arg5 > 103 || var17.field661 + arg6 > 103) {
						return;
					}

					if (var17.field637) {
						field238[arg3].method208(var17.field631, var17.field661, arg6, arg5, var15, var17.field635);
					}
				}

				if (arg1 == 3) {
					field405.method491(arg6, arg3, arg5);
					ELXAMLNA var18 = ELXAMLNA.method196(var13);
					if (var18.field637 && var18.field672) {
						field238[arg3].method210(arg5, arg6);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg3;
				if (arg3 < 3 && (field503[1][arg5][arg6] & 0x2) == 2) {
					var19 = arg3 + 1;
				}

				DBFHRNVI.method169(field453, arg3, var19, arg5, field238[arg3], arg6, arg2, arg4, arg0, field405);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBII)V")
	public final void method93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = FLXAIVEA.field747[var7];
			int var13 = FLXAIVEA.field748[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = FLXAIVEA.field747[var8];
			int var16 = FLXAIVEA.field748[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field462 = arg5 - var9;
		field463 = arg3 - var10;
		field464 = arg0 - var11;
		field465 = arg4;
		field466 = arg2;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method94() {
		field290.method186();

		if (field372 == 2) {
			byte[] var1 = field379.field1343;
			int[] var2 = NBXZFIDS.field1026;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field461.method552(0, 256, field471, field550, 33, 25, field171, 33, 0, 25);
			field291.method186();
			ORCVJTAI.field1070 = field390;
		} else {
			int var5 = field550 + field223 & 0x7FF;
			int var6 = field128.field1396 / 32 + 48;
			int var7 = 464 - field128.field1397 / 32;
			field488.method552(5, field396 + 256, field532, var5, 146, var6, field286, 151, 25, var7);
			field461.method552(0, 256, field471, field550, 33, 25, field171, 33, 0, 25);

			for (int var8 = 0; var8 < field231; var8++) {
				int var9 = field232[var8] * 4 + 2 - field128.field1396 / 32;
				int var10 = field233[var8] * 4 + 2 - field128.field1397 / 32;
				method25(var9, field414[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					VGFLNLXH var13 = field416[field168][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field128.field1396 / 32;
						int var15 = var12 * 4 + 2 - field128.field1397 / 32;
						method25(var14, field406, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field243; var16++) {
				TBFTCCSF var17 = field242[field244[var16]];
				if (var17 != null && var17.method442()) {
					JRELGTVY var18 = var17.field1187;
					if (var18.field928 != null) {
						var18 = var18.method266();
					}

					if (var18 != null && var18.field949 && var18.field964) {
						int var19 = var17.field1396 / 32 - field128.field1396 / 32;
						int var20 = var17.field1397 / 32 - field128.field1397 / 32;
						method25(var19, field407, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field425; var21++) {
				TPTANZXN var22 = field424[field426[var21]];
				if (var22 != null && var22.method442()) {
					int var23 = var22.field1396 / 32 - field128.field1396 / 32;
					int var24 = var22.field1397 / 32 - field128.field1397 / 32;
					boolean var25 = false;
					long var26 = VUKQGAWR.method537(var22.field1261);
					for (int var28 = 0; var28 < field122; var28++) {
						if (field479[var28] == var26 && field345[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field128.field1257 != 0 && var22.field1257 != 0 && field128.field1257 == var22.field1257) {
						var29 = true;
					}

					if (var25) {
						method25(var23, field409, var24);
					} else if (var29) {
						method25(var23, field410, var24);
					} else {
						method25(var23, field408, var24);
					}
				}
			}

			if (field452 != 0 && field526 % 20 < 10) {
				if (field452 == 1 && field144 >= 0 && field144 < field242.length) {
					TBFTCCSF var30 = field242[field144];
					if (var30 != null) {
						int var31 = var30.field1396 / 32 - field128.field1396 / 32;
						int var32 = var30.field1397 / 32 - field128.field1397 / 32;
						method56(field207, var32, var31);
					}
				}

				if (field452 == 2) {
					int var33 = (field197 - field365) * 4 + 2 - field128.field1396 / 32;
					int var34 = (field198 - field366) * 4 + 2 - field128.field1397 / 32;
					method56(field207, var34, var33);
				}

				if (field452 == 10 && field136 >= 0 && field136 < field424.length) {
					TPTANZXN var35 = field424[field136];
					if (var35 != null) {
						int var36 = var35.field1396 / 32 - field128.field1396 / 32;
						int var37 = var35.field1397 / 32 - field128.field1397 / 32;
						method56(field207, var37, var36);
					}
				}
			}

			if (field486 != 0) {
				int var38 = field486 * 4 + 2 - field128.field1396 / 32;
				int var39 = field487 * 4 + 2 - field128.field1397 / 32;
				method25(var38, field206, var39);
			}

			NBXZFIDS.method291(97, 3, 78, 0xFFFFFF, 3);
			field291.method186();
			ORCVJTAI.field1070 = field390;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method95() {
		if (field849 == 1) {
			if (field850 >= 539 && field850 <= 573 && field851 >= 169 && field851 < 205 && field520[0] != -1) {
				field364 = true;
				field472 = 0;
				field167 = true;
			}

			if (field850 >= 569 && field850 <= 599 && field851 >= 168 && field851 < 205 && field520[1] != -1) {
				field364 = true;
				field472 = 1;
				field167 = true;
			}

			if (field850 >= 597 && field850 <= 627 && field851 >= 168 && field851 < 205 && field520[2] != -1) {
				field364 = true;
				field472 = 2;
				field167 = true;
			}

			if (field850 >= 625 && field850 <= 669 && field851 >= 168 && field851 < 203 && field520[3] != -1) {
				field364 = true;
				field472 = 3;
				field167 = true;
			}

			if (field850 >= 666 && field850 <= 696 && field851 >= 168 && field851 < 205 && field520[4] != -1) {
				field364 = true;
				field472 = 4;
				field167 = true;
			}

			if (field850 >= 694 && field850 <= 724 && field851 >= 168 && field851 < 205 && field520[5] != -1) {
				field364 = true;
				field472 = 5;
				field167 = true;
			}

			if (field850 >= 722 && field850 <= 756 && field851 >= 169 && field851 < 205 && field520[6] != -1) {
				field364 = true;
				field472 = 6;
				field167 = true;
			}

			if (field850 >= 540 && field850 <= 574 && field851 >= 466 && field851 < 502 && field520[7] != -1) {
				field364 = true;
				field472 = 7;
				field167 = true;
			}

			if (field850 >= 572 && field850 <= 602 && field851 >= 466 && field851 < 503 && field520[8] != -1) {
				field364 = true;
				field472 = 8;
				field167 = true;
			}

			if (field850 >= 599 && field850 <= 629 && field851 >= 466 && field851 < 503 && field520[9] != -1) {
				field364 = true;
				field472 = 9;
				field167 = true;
			}

			if (field850 >= 627 && field850 <= 671 && field851 >= 467 && field851 < 502 && field520[10] != -1) {
				field364 = true;
				field472 = 10;
				field167 = true;
			}

			if (field850 >= 669 && field850 <= 699 && field851 >= 466 && field851 < 503 && field520[11] != -1) {
				field364 = true;
				field472 = 11;
				field167 = true;
			}

			if (field850 >= 696 && field850 <= 726 && field851 >= 466 && field851 < 503 && field520[12] != -1) {
				field364 = true;
				field472 = 12;
				field167 = true;
			}

			if (field850 >= 724 && field850 <= 758 && field851 >= 466 && field851 < 502 && field520[13] != -1) {
				field364 = true;
				field472 = 13;
				field167 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method96() {
		field420 = true;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method97() {
		if (field278 != 0) {
			int var1 = 0;
			if (field477 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field385[var2] != null) {
					int var3 = field383[var2];
					String var4 = field384[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field331 == 0 || field331 == 1 && method137(var4))) {
						int var8 = 329 - var1 * 13;
						if (field843 > 4 && field844 - 4 > var8 - 10 && field844 - 4 <= var8 + 3) {
							int var9 = field211.method588("From:  " + var4 + field385[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field843 < var9 + 4) {
								if (field404 >= 1) {
									field205[field249] = "Report abuse @whi@" + var4;
									field165[field249] = 2376;
									field249++;
								}

								field205[field249] = "Add ignore @whi@" + var4;
								field165[field249] = 2720;
								field249++;
								field205[field249] = "Add friend @whi@" + var4;
								field165[field249] = 2675;
								field249++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field331 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field405.method497(arg4, arg0, arg3);
		if (var6 != 0) {
			int var7 = field405.method501(arg4, arg0, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field488.field1356;
			int var12 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			ELXAMLNA var14 = ELXAMLNA.method196(var13);
			if (var14.field628 == -1) {
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
				VEIVHFHZ var15 = field155[var14.field628];
				if (var15 != null) {
					int var16 = (var14.field631 * 4 - var15.field1345) / 2;
					int var17 = (var14.field661 * 4 - var15.field1346) / 2;
					var15.method527((104 - arg3 - var14.field661) * 4 + var17 + 48, arg0 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field405.method499(arg4, arg0, arg3);
		if (var18 != 0) {
			int var19 = field405.method501(arg4, arg0, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			ELXAMLNA var23 = ELXAMLNA.method196(var22);
			if (var23.field628 != -1) {
				VEIVHFHZ var24 = field155[var23.field628];
				if (var24 != null) {
					int var25 = (var23.field631 * 4 - var24.field1345) / 2;
					int var26 = (var23.field661 * 4 - var24.field1346) / 2;
					var24.method527((104 - arg3 - var23.field661) * 4 + var26 + 48, arg0 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field488.field1356;
				int var29 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = field405.method500(arg4, arg0, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			ELXAMLNA var32 = ELXAMLNA.method196(var31);
			if (var32.field628 != -1) {
				VEIVHFHZ var33 = field155[var32.field628];
				if (var33 != null) {
					int var34 = (var32.field631 * 4 - var33.field1345) / 2;
					int var35 = (var32.field661 * 4 - var33.field1346) / 2;
					var33.method527((104 - arg3 - var32.field661) * 4 + var35 + 48, arg0 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILTPTANZXN;II)V")
	public final void method99(int arg0, TPTANZXN arg1, int arg2, int arg3) {
		if (field128 != arg1 && field249 < 400) {
			String var5;
			if (arg1.field1243 == 0) {
				var5 = arg1.field1261 + method90(arg1.field1252, field128.field1252) + " (level-" + arg1.field1252 + ")";
			} else {
				var5 = arg1.field1261 + " (skill-" + arg1.field1243 + ")";
			}

			if (field534 == 1) {
				field205[field249] = "Use " + field538 + " with @whi@" + var5;
				field165[field249] = 56;
				field166[field249] = arg2;
				field163[field249] = arg3;
				field164[field249] = arg0;
				field249++;
			} else if (field431 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field322[var6] != null) {
						field205[field249] = field322[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field322[var6].equalsIgnoreCase("attack")) {
							if (arg1.field1252 > field128.field1252) {
								var7 = 2000;
							}

							if (field128.field1257 != 0 && arg1.field1257 != 0) {
								if (field128.field1257 == arg1.field1257) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field323[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field165[field249] = var7 + 426;
						}

						if (var6 == 1) {
							field165[field249] = var7 + 629;
						}

						if (var6 == 2) {
							field165[field249] = var7 + 863;
						}

						if (var6 == 3) {
							field165[field249] = var7 + 266;
						}

						if (var6 == 4) {
							field165[field249] = var7 + 886;
						}

						field166[field249] = arg2;
						field163[field249] = arg3;
						field164[field249] = arg0;
						field249++;
					}
				}
			} else if ((field433 & 0x8) == 8) {
				field205[field249] = field434 + " @whi@" + var5;
				field165[field249] = 891;
				field166[field249] = arg2;
				field163[field249] = arg3;
				field164[field249] = arg0;
				field249++;
			}

			for (int var8 = 0; var8 < field249; var8++) {
				if (field165[var8] == 616) {
					field205[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIZ)Z")
	public final boolean method100(int arg0, int arg1) {
		boolean var3 = false;
		ATOBWHST var4 = ATOBWHST.method4(arg1);
		for (int var5 = 0; var5 < var4.field30.length && var4.field30[var5] != -1; var5++) {
			ATOBWHST var6 = ATOBWHST.method4(var4.field30[var5]);
			if (var6.field61 == 0) {
				var3 |= method100(arg0, var6.field18);
			}

			if (var6.field61 == 6 && (var6.field11 != -1 || var6.field12 != -1)) {
				boolean var7 = method86(var6);
				int var8;
				if (var7) {
					var8 = var6.field12;
				} else {
					var8 = var6.field11;
				}

				if (var8 != -1) {
					BKDXLPEF var9 = BKDXLPEF.field75[var8];
					var6.field69 += arg0;
					while (var6.field69 > var9.method12(var6.field73)) {
						var6.field69 -= var9.method12(var6.field73);
						var6.field73++;
						if (var6.field73 >= var9.field76) {
							var6.field73 -= var9.field80;
							if (var6.field73 < 0 || var6.field73 >= var9.field76) {
								var6.field73 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field61 == 6 && var6.field52 != 0) {
				int var10 = var6.field52 >> 16;
				int var11 = var6.field52 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field39 = var6.field39 + var10 & 0x7FF;
				var6.field40 = var6.field40 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.b(ILPQBRPYKE;I)V")
	public final void method101(PQBRPYKE arg0, int arg1) {
		while (arg0.field1092 + 21 < arg1 * 8) {
			int var3 = arg0.method351(14);
			if (var3 == 16383) {
				break;
			}

			if (field242[var3] == null) {
				field242[var3] = new TBFTCCSF();
			}

			TBFTCCSF var4 = field242[var3];
			field244[field243++] = var3;
			var4.field1418 = field526;
			int var5 = arg0.method351(1);
			int var6 = arg0.method351(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method351(1);
			if (var7 == 1) {
				field428[field427++] = var3;
			}

			var4.field1187 = JRELGTVY.method269(arg0.method351(13));
			int var8 = arg0.method351(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1386 = var4.field1187.field948;
			var4.field1399 = var4.field1187.field935;
			var4.field1388 = var4.field1187.field952;
			var4.field1389 = var4.field1187.field961;
			var4.field1390 = var4.field1187.field932;
			var4.field1391 = var4.field1187.field934;
			var4.field1414 = var4.field1187.field930;
			var4.method561(field128.field1405[0] + var6, var5 == 1, field128.field1404[0] + var8);
		}

		arg0.method352();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;II)V")
	public final void method102(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field401 != -1) {
			field315 = arg0;
			field849 = 0;
		}

		if (field403 == -1) {
			field548 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field383[var4] = field383[var4 - 1];
			field384[var4] = field384[var4 - 1];
			field385[var4] = field385[var4 - 1];
		}

		field383[0] = arg2;
		field384[0] = arg1;
		field385[0] = arg0;
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method103(boolean arg0) {
		method41();
		field189.method186();
		field220.method527(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field307 == 0) {
			int var4 = var3 / 2 + 80;
			field210.method587(var2 / 2, 0x75A9A9, var4, field239.field1105, true);
			int var5 = var3 / 2 - 20;
			field212.method587(var2 / 2, 0xFFFF00, var5, "Welcome to RuneScape", true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field221.method527(var7 - 20, var6 - 73);
			field212.method587(var6, 0xFFFFFF, var7 + 5, "New User", true);
			int var8 = var2 / 2 + 80;
			field221.method527(var7 - 20, var8 - 73);
			field212.method587(var8, 0xFFFFFF, var7 + 5, "Existing User", true);
		}

		if (field307 == 2) {
			int var9 = var3 / 2 - 40;
			if (field417.length() > 0) {
				field212.method587(var2 / 2, 0xFFFF00, var9 - 15, field417, true);
				field212.method587(var2 / 2, 0xFFFF00, var9, field418, true);
				var9 += 30;
			} else {
				field212.method587(var2 / 2, 0xFFFF00, var9 - 7, field418, true);
				var9 += 30;
			}

			field212.method594(var2 / 2 - 90, "Username: " + field185 + (field325 == 0 & field526 % 40 < 20 ? "@yel@|" : ""), var9, 0xFFFFFF, true);
			var9 += 15;
			field212.method594(var2 / 2 - 88, "Password: " + VUKQGAWR.method542(field186) + (field325 == 1 & field526 % 40 < 20 ? "@yel@|" : ""), var9, 0xFFFFFF, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field221.method527(var11 - 20, var10 - 73);
				field212.method587(var10, 0xFFFFFF, var11 + 5, "Login", true);
				int var12 = var2 / 2 + 80;
				field221.method527(var11 - 20, var12 - 73);
				field212.method587(var12, 0xFFFFFF, var11 + 5, "Cancel", true);
			}
		}

		if (field307 == 3) {
			field212.method587(var2 / 2, 0xFFFF00, var3 / 2 - 60, "Create a free account", true);
			int var13 = var3 / 2 - 35;
			field212.method587(var2 / 2, 0xFFFFFF, var13, "To create a new account you need to", true);
			var13 += 15;
			field212.method587(var2 / 2, 0xFFFFFF, var13, "go back to the main RuneScape webpage", true);
			var13 += 15;
			field212.method587(var2 / 2, 0xFFFFFF, var13, "and choose the 'create account'", true);
			var13 += 15;
			field212.method587(var2 / 2, 0xFFFFFF, var13, "button near the top of that page.", true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field221.method527(var15 - 20, var14 - 73);
			field212.method587(var14, 0xFFFFFF, var15 + 5, "Cancel", true);
		}

		field189.method187(202, field835, 171);

		if (field420) {
			field420 = false;
			field187.method187(128, field835, 0);
			field188.method187(202, field835, 371);
			field192.method187(0, field835, 265);
			field193.method187(562, field835, 265);
			field194.method187(128, field835, 171);
			field195.method187(562, field835, 171);
		}
	}

	@ObfuscatedName("client.b(ZI)Z")
	public final boolean method104(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field165[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 675) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.y(I)Ljava/lang/String;")
	public final String method105() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field838 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(B)V")
	public final void method106() {
		if (field147 || field240 || field202) {
			method126();
		} else {
			field296++;

			if (field412) {
				method76();
			} else {
				method103(false);
			}

			field335 = 0;
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method107() {
		int var1 = field301;
		int var2 = field302;
		int var3 = field303;
		int var4 = field304;
		int var5 = 0x5D5447;
		NBXZFIDS.method291(var1, var3, var2, var5, var4);
		NBXZFIDS.method291(var1 + 1, var3 - 2, var2 + 1, 0, 16);
		NBXZFIDS.method292(var4 - 19, var3 - 2, var1 + 1, var2 + 18, 0);
		field212.method590("Choose Option", var2 + 14, var5, var1 + 3);
		int var6 = field843;
		int var7 = field844;
		if (field300 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field300 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field300 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field249; var8++) {
			int var9 = (field249 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field212.method594(var1 + 3, field205[var8], var9, var10, true);
		}
	}

	@ObfuscatedName("client.a(IZLPQBRPYKE;)V")
	public final void method108(int arg0, PQBRPYKE arg1) {
		arg1.method350();
		int var3 = arg1.method351(1);
		if (var3 != 0) {
			int var4 = arg1.method351(2);
			if (var4 == 0) {
				field428[field427++] = field423;
			} else if (var4 == 1) {
				int var5 = arg1.method351(3);
				field128.method563(false, var5);
				int var6 = arg1.method351(1);
				if (var6 == 1) {
					field428[field427++] = field423;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method351(3);
				field128.method563(true, var7);
				int var8 = arg1.method351(3);
				field128.method563(true, var8);
				int var9 = arg1.method351(1);
				if (var9 == 1) {
					field428[field427++] = field423;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method351(7);
				int var11 = arg1.method351(1);
				field168 = arg1.method351(2);
				int var12 = arg1.method351(7);
				int var13 = arg1.method351(1);
				if (var13 == 1) {
					field428[field427++] = field423;
				}

				field128.method561(var12, var11 == 1, var10);
			}
		}
	}

	@ObfuscatedName("client.a(IZLATOBWHST;IIIII)V")
	public final void method109(int arg0, ATOBWHST arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1.field61 == 0 && arg1.field30 != null && !arg1.field43 && (arg6 >= arg4 && arg0 >= arg3 && arg6 <= arg1.field64 + arg4 && arg0 <= arg1.field50 + arg3)) {
			int var8 = arg1.field30.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg1.field55[var9] + arg4;
				int var11 = arg1.field51[var9] + arg3 - arg2;
				ATOBWHST var12 = ATOBWHST.method4(arg1.field30[var9]);
				var10 += var12.field16;
				var11 += var12.field59;
				if ((var12.field58 >= 0 || var12.field72 != 0) && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field64 + var10 && arg0 < var12.field50 + var11) {
					if (var12.field58 >= 0) {
						field321 = var12.field58;
					} else {
						field321 = var12.field18;
					}
				}

				if (var12.field61 == 8 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field64 + var10 && arg0 < var12.field50 + var11) {
					field455 = var12.field18;
				}

				if (var12.field61 == 0) {
					method109(arg0, var12, var12.field60, var11, var10, arg5, arg6);

					if (var12.field42 > var12.field50) {
						method88(var12.field50, arg0, arg5, var12, arg6, var12.field42, var12.field64 + var10, var11);
					}
				} else {
					if (var12.field45 == 1 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field64 + var10 && arg0 < var12.field50 + var11) {
						boolean var13 = false;
						if (var12.field26 != 0) {
							var13 = method143(var12);
						}

						if (!var13) {
							field205[field249] = var12.field25;
							field165[field249] = 349;
							field164[field249] = var12.field18;
							field249++;
						}
					}

					if (var12.field45 == 2 && field431 == 0 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field64 + var10 && arg0 < var12.field50 + var11) {
						String var14 = var12.field33;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field205[field249] = var14 + " @gre@" + var12.field62;
						field165[field249] = 1;
						field164[field249] = var12.field18;
						field249++;
					}

					if (var12.field45 == 3 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field64 + var10 && arg0 < var12.field50 + var11) {
						field205[field249] = "Close";

						if (arg5 == 3) {
							field165[field249] = 699;
						} else {
							field165[field249] = 969;
						}

						field164[field249] = var12.field18;
						field249++;
					}

					if (var12.field45 == 4 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field64 + var10 && arg0 < var12.field50 + var11) {
						field205[field249] = var12.field25;
						field165[field249] = 915;
						field164[field249] = var12.field18;
						field249++;
					}

					if (var12.field45 == 5 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field64 + var10 && arg0 < var12.field50 + var11) {
						field205[field249] = var12.field25;
						field165[field249] = 843;
						field164[field249] = var12.field18;
						field249++;
					}

					if (var12.field45 == 6 && !field421 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field64 + var10 && arg0 < var12.field50 + var11) {
						field205[field249] = var12.field25;
						field165[field249] = 268;
						field164[field249] = var12.field18;
						field249++;
					}

					if (var12.field61 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field50; var16++) {
							for (int var17 = 0; var17 < var12.field64; var17++) {
								int var18 = (var12.field27 + 32) * var17 + var10;
								int var19 = (var12.field48 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field17[var15];
									var19 += var12.field20[var15];
								}

								if (arg6 >= var18 && arg0 >= var19 && arg6 < var18 + 32 && arg0 < var19 + 32) {
									field501 = var15;
									field502 = var12.field18;

									if (var12.field57[var15] > 0) {
										TGAGWNUA var20 = TGAGWNUA.method453(var12.field57[var15] - 1);
										if (field534 == 1 && var12.field1) {
											if (field536 != var12.field18 || field535 != var15) {
												field205[field249] = "Use " + field538 + " with @lre@" + var20.field1197;
												field165[field249] = 247;
												field166[field249] = var20.field1227;
												field163[field249] = var15;
												field164[field249] = var12.field18;
												field249++;
											}
										} else if (field431 != 1 || !var12.field1) {
											if (var12.field1) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1203 != null && var20.field1203[var21] != null) {
														field205[field249] = var20.field1203[var21] + " @lre@" + var20.field1197;

														if (var21 == 3) {
															field165[field249] = 115;
														}

														if (var21 == 4) {
															field165[field249] = 547;
														}

														field166[field249] = var20.field1227;
														field163[field249] = var15;
														field164[field249] = var12.field18;
														field249++;
													} else if (var21 == 4) {
														field205[field249] = "Drop @lre@" + var20.field1197;
														field165[field249] = 547;
														field166[field249] = var20.field1227;
														field163[field249] = var15;
														field164[field249] = var12.field18;
														field249++;
													}
												}
											}

											if (var12.field28) {
												field205[field249] = "Use @lre@" + var20.field1197;
												field165[field249] = 253;
												field166[field249] = var20.field1227;
												field163[field249] = var15;
												field164[field249] = var12.field18;
												field249++;
											}

											if (var12.field1 && var20.field1203 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1203[var22] != null) {
														field205[field249] = var20.field1203[var22] + " @lre@" + var20.field1197;

														if (var22 == 0) {
															field165[field249] = 479;
														}

														if (var22 == 1) {
															field165[field249] = 940;
														}

														if (var22 == 2) {
															field165[field249] = 193;
														}

														field166[field249] = var20.field1227;
														field163[field249] = var15;
														field164[field249] = var12.field18;
														field249++;
													}
												}
											}

											if (var12.field68 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field68[var23] != null) {
														field205[field249] = var12.field68[var23] + " @lre@" + var20.field1197;

														if (var23 == 0) {
															field165[field249] = 5;
														}

														if (var23 == 1) {
															field165[field249] = 871;
														}

														if (var23 == 2) {
															field165[field249] = 123;
														}

														if (var23 == 3) {
															field165[field249] = 850;
														}

														if (var23 == 4) {
															field165[field249] = 670;
														}

														field166[field249] = var20.field1227;
														field163[field249] = var15;
														field164[field249] = var12.field18;
														field249++;
													}
												}
											}

											field205[field249] = "Examine @lre@" + var20.field1197;
											field165[field249] = 1327;
											field166[field249] = var20.field1227;
											field163[field249] = var15;
											field164[field249] = var12.field18;
											field249++;
										} else if ((field433 & 0x10) == 0x10) {
											field205[field249] = field434 + " @lre@" + var20.field1197;
											field165[field249] = 419;
											field166[field249] = var20.field1227;
											field163[field249] = var15;
											field164[field249] = var12.field18;
											field249++;
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

	@ObfuscatedName("client.c(I)V")
	public final void method110() {
		if (!field147 && !field240 && !field202) {
			field526++;

			if (field412) {
				method131();
			} else {
				method112();
			}

			method54();
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method111() {
		if (field249 >= 2 || field534 != 0 || field431 != 0) {
			String var1;
			if (field534 == 1 && field249 < 2) {
				var1 = "Use " + field538 + " with...";
			} else if (field431 == 1 && field249 < 2) {
				var1 = field434 + "...";
			} else {
				var1 = field205[field249 - 1];
			}

			if (field249 > 2) {
				var1 = var1 + "@whi@ / " + (field249 - 2) + " more options";
			}

			field212.method595(0xFFFFFF, true, var1, field526 / 1000, 4, 15);
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method112() {
		if (field307 == 0) {
			int var1 = field833 / 2 - 80;
			int var2 = field834 / 2 + 20;
			var2 += 20;
			if (field849 == 1 && field850 >= var1 - 75 && field850 <= var1 + 75 && field851 >= var2 - 20 && field851 <= var2 + 20) {
				field307 = 3;
				field325 = 0;
			}

			int var3 = field833 / 2 + 80;
			if (field849 == 1 && field850 >= var3 - 75 && field850 <= var3 + 75 && field851 >= var2 - 20 && field851 <= var2 + 20) {
				field417 = "";
				field418 = "Enter your username & password.";
				field307 = 2;
				field325 = 0;
			}
		} else if (field307 == 2) {
			int var4 = field834 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field849 == 1 && field851 >= var4 - 15 && field851 < var4) {
				field325 = 0;
			}

			var4 += 15;
			if (field849 == 1 && field851 >= var4 - 15 && field851 < var4) {
				field325 = 1;
			}

			var4 += 15;
			int var5 = field833 / 2 - 80;
			int var6 = field834 / 2 + 50;
			var6 += 20;
			if (field849 == 1 && field850 >= var5 - 75 && field850 <= var5 + 75 && field851 >= var6 - 20 && field851 <= var6 + 20) {
				field143 = 0;
				method32(field185, field186, false);

				if (field412) {
					return;
				}
			}

			int var7 = field833 / 2 + 80;
			if (field849 == 1 && field850 >= var7 - 75 && field850 <= var7 + 75 && field851 >= var6 - 20 && field851 <= var6 + 20) {
				field307 = 0;
				field185 = "";
				field186 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method263();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field411.length(); var10++) {
					if (var8 == field411.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field325 == 0) {
					if (var8 == 8 && field185.length() > 0) {
						field185 = field185.substring(0, field185.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field325 = 1;
					}

					if (var9) {
						field185 = field185 + (char) var8;
					}

					if (field185.length() > 12) {
						field185 = field185.substring(0, 12);
					}
				} else if (field325 == 1) {
					if (var8 == 8 && field186.length() > 0) {
						field186 = field186.substring(0, field186.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field325 = 0;
					}

					if (var9) {
						field186 = field186 + (char) var8;
					}

					if (field186.length() > 20) {
						field186 = field186.substring(0, 20);
					}
				}
			}
		} else if (field307 == 3) {
			int var11 = field833 / 2;
			int var12 = field834 / 2 + 50;
			var12 += 20;
			if (field849 == 1 && field850 >= var11 - 75 && field850 <= var11 + 75 && field851 >= var12 - 20 && field851 <= var12 + 20) {
				field307 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILJRELGTVY;II)V")
	public final void method113(int arg0, JRELGTVY arg1, int arg2, int arg3) {
		if (field249 < 400) {
			if (arg1.field928 != null) {
				arg1 = arg1.method266();
			}

			if (arg1 != null && arg1.field964) {
				String var5 = arg1.field957;
				if (arg1.field946 != 0) {
					var5 = var5 + method90(arg1.field946, field128.field1252) + " (level-" + arg1.field946 + ")";
				}

				if (field534 == 1) {
					field205[field249] = "Use " + field538 + " with @yel@" + var5;
					field165[field249] = 564;
					field166[field249] = arg2;
					field163[field249] = arg0;
					field164[field249] = arg3;
					field249++;
				} else if (field431 != 1) {
					if (arg1.field929 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field929[var6] != null && !arg1.field929[var6].equalsIgnoreCase("attack")) {
								field205[field249] = arg1.field929[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field165[field249] = 165;
								}

								if (var6 == 1) {
									field165[field249] = 19;
								}

								if (var6 == 2) {
									field165[field249] = 857;
								}

								if (var6 == 3) {
									field165[field249] = 659;
								}

								if (var6 == 4) {
									field165[field249] = 619;
								}

								field166[field249] = arg2;
								field163[field249] = arg0;
								field164[field249] = arg3;
								field249++;
							}
						}
					}

					if (arg1.field929 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field929[var7] != null && arg1.field929[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field946 > field128.field1252) {
									var8 = 2000;
								}

								field205[field249] = arg1.field929[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field165[field249] = var8 + 165;
								}

								if (var7 == 1) {
									field165[field249] = var8 + 19;
								}

								if (var7 == 2) {
									field165[field249] = var8 + 857;
								}

								if (var7 == 3) {
									field165[field249] = var8 + 659;
								}

								if (var7 == 4) {
									field165[field249] = var8 + 619;
								}

								field166[field249] = arg2;
								field163[field249] = arg0;
								field164[field249] = arg3;
								field249++;
							}
						}
					}

					field205[field249] = "Examine @yel@" + var5;
					field165[field249] = 1505;
					field166[field249] = arg2;
					field163[field249] = arg0;
					field164[field249] = arg3;
					field249++;
				} else if ((field433 & 0x2) == 2) {
					field205[field249] = field434 + " @yel@" + var5;
					field165[field249] = 257;
					field166[field249] = arg2;
					field163[field249] = arg0;
					field164[field249] = arg3;
					field249++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method114() {
		field292.method186();
		ORCVJTAI.field1070 = field388;
		field380.method527(0, 0);

		if (field153) {
			field212.method586(field317, 239, 0, 40);
			field212.method586(field130 + "*", 239, 128, 60);
		} else if (field476 == 1) {
			field212.method586("Enter amount:", 239, 0, 40);
			field212.method586(field117 + "*", 239, 128, 60);
		} else if (field476 == 2) {
			field212.method586("Enter name:", 239, 0, 40);
			field212.method586(field117 + "*", 239, 128, 60);
		} else if (field476 == 3) {
			if (field148 != field117) {
				method117(field117);
				field148 = field117;
			}

			ZFUOSNLM var1 = field211;
			NBXZFIDS.method288(0, 77, 0, 463);

			for (int var2 = 0; var2 < field149; var2++) {
				int var3 = var2 * 14 + 18 - field152;
				if (var3 > 0 && var3 < 110) {
					var1.method586(field150[var2], 239, 0, var3);
				}
			}

			NBXZFIDS.method287();

			if (field149 > 5) {
				method28(field152, field149 * 14 + 7, 77, 0, 463);
			}

			if (field117.length() == 0) {
				field212.method586("Enter object name", 239, 255, 40);
			} else if (field149 == 0) {
				field212.method586("No matching objects found, please shorten search", 239, 0, 40);
			}

			var1.method586(field117 + "*", 239, 0, 90);
			NBXZFIDS.method294(0, 77, 479, 0);
		} else if (field315 != null) {
			field212.method586(field315, 239, 0, 40);
			field212.method586("Click to continue", 239, 128, 60);
		} else if (field403 != -1) {
			method47(0, ATOBWHST.method4(field403), 0, 0);
		} else if (field401 == -1) {
			ZFUOSNLM var4 = field211;
			int var5 = 0;
			NBXZFIDS.method288(0, 77, 0, 463);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field385[var6] != null) {
					int var7 = field383[var6];
					int var8 = field336 + 70 - var5 * 14;
					String var9 = field384[var6];
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
							var4.method590(field385[var6], var8, 0, 4);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field371 == 0 || field371 == 1 && method137(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field156[0].method527(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field156[1].method527(var8 - 12, var11);
								var11 += 14;
							}

							var4.method590(var9 + ":", var8, 0, var11);
							var11 += var4.method588(var9) + 8;
							var4.method590(field385[var6], var8, 255, var11);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field278 == 0 && (var7 == 7 || field331 == 0 || field331 == 1 && method137(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method590("From", var8, 0, var12);
							int var14 = var12 + var4.method588("From ");
							if (var10 == 1) {
								field156[0].method527(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field156[1].method527(var8 - 12, var14);
								var14 += 14;
							}

							var4.method590(var9 + ":", var8, 0, var14);
							var14 += var4.method588(var9) + 8;
							var4.method590(field385[var6], var8, 0x800000, var14);
						}

						var5++;
					}

					if (var7 == 4 && (field181 == 0 || field181 == 1 && method137(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method590(var9 + " " + field385[var6], var8, 0x800080, 4);
						}

						var5++;
					}

					if (var7 == 5 && field278 == 0 && field331 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method590(field385[var6], var8, 0x800000, 4);
						}

						var5++;
					}

					if (var7 == 6 && field278 == 0 && field331 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method590("To " + var9 + ":", var8, 0, 4);
							var4.method590(field385[var6], var8, 0x800000, var4.method588("To " + var9) + 12);
						}

						var5++;
					}

					if (var7 == 8 && (field181 == 0 || field181 == 1 && method137(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method590(var9 + " " + field385[var6], var8, 0x7E3200, 4);
						}

						var5++;
					}
				}
			}

			NBXZFIDS.method287();
			field445 = var5 * 14 + 7;
			if (field445 < 78) {
				field445 = 78;
			}

			method28(field445 - field336 - 77, field445, 77, 0, 463);
			String var13;
			if (field128 == null || field128.field1261 == null) {
				var13 = VUKQGAWR.method541(field185);
			} else {
				var13 = field128.field1261;
			}

			var4.method590(var13 + ":", 90, 0, 4);
			var4.method590(field333 + "*", 90, 255, var4.method588(var13 + ": ") + 6);
			NBXZFIDS.method294(0, 77, 479, 0);
		} else {
			method47(0, ATOBWHST.method4(field401), 0, 0);
		}

		if (field159 && field300 == 2) {
			method107();
		}

		field292.method187(17, field835, 357);
		field291.method186();
		ORCVJTAI.field1070 = field390;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method115() {
		for (GJMFUMBP var1 = (GJMFUMBP) field267.method532(); var1 != null; var1 = (GJMFUMBP) field267.method534()) {
			if (field168 != var1.field792 || var1.field788) {
				var1.method163();
			} else if (field526 >= var1.field789) {
				var1.method256(field230);

				if (var1.field788) {
					var1.method163();
				} else {
					field405.method482(-1, var1, false, var1.field792, var1.field795, 60, var1.field793, 0, var1.field794);
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method116() {
		byte[] var1 = field119.method560("title.dat", null);
		WQACZBNG var2 = new WQACZBNG(var1, this);
		field190.method186();
		var2.method546(0, 0);
		field191.method186();
		var2.method546(-637, 0);
		field187.method186();
		var2.method546(-128, 0);
		field188.method186();
		var2.method546(-202, -371);
		field189.method186();
		var2.method546(-202, -171);
		field192.method186();
		var2.method546(0, -265);
		field193.method186();
		var2.method546(-562, -265);
		field194.method186();
		var2.method546(-128, -171);
		field195.method186();
		var2.method546(-562, -171);
		int[] var3 = new int[var2.field1357];
		for (int var4 = 0; var4 < var2.field1358; var4++) {
			for (int var5 = 0; var5 < var2.field1357; var5++) {
				var3[var5] = var2.field1356[var2.field1357 * var4 + var2.field1357 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1357; var6++) {
				var2.field1356[var2.field1357 * var4 + var6] = var3[var6];
			}
		}

		field190.method186();
		var2.method546(382, 0);
		field191.method186();
		var2.method546(-255, 0);
		field187.method186();
		var2.method546(254, 0);
		field188.method186();
		var2.method546(180, -371);
		field189.method186();
		var2.method546(180, -171);
		field192.method186();
		var2.method546(382, -265);
		field193.method186();
		var2.method546(-180, -265);
		field194.method186();
		var2.method546(254, -171);
		field195.method186();
		var2.method546(-180, -171);
		WQACZBNG var7 = new WQACZBNG(field119, "logo", 0);
		field187.method186();
		var7.method548(18, 382 - var7.field1357 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public final void method117(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field149 = 0;
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

			field149 = 0;
			label46: for (int var7 = 0; var7 < TGAGWNUA.field1216; var7++) {
				TGAGWNUA var8 = TGAGWNUA.method453(var7);
				if (var8.field1217 == -1 && var8.field1197 != null) {
					String var9 = var8.field1197.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field150[field149] = var9;
					field151[field149] = var7;
					field149++;
					if (field149 >= field150.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)I")
	public final int method118() {
		int var1 = 3;
		if (field465 < 310) {
			int var2 = field462 >> 7;
			int var3 = field464 >> 7;
			int var4 = field128.field1396 >> 7;
			int var5 = field128.field1397 >> 7;

			if ((field503[field168][var2][var3] & 0x4) != 0) {
				var1 = field168;
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

					if ((field503[field168][var2][var3] & 0x4) != 0) {
						var1 = field168;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field503[field168][var2][var3] & 0x4) != 0) {
							var1 = field168;
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

					if ((field503[field168][var2][var3] & 0x4) != 0) {
						var1 = field168;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field503[field168][var2][var3] & 0x4) != 0) {
							var1 = field168;
						}
					}
				}
			}
		}

		if ((field503[field168][field128.field1396 >> 7][field128.field1397 >> 7] & 0x4) != 0) {
			var1 = field168;
		}

		return var1;
	}

	@ObfuscatedName("client.i(Z)I")
	public final int method119() {
		int var1 = method66(field168, field464, field462);
		if (var1 - field463 < 800 && (field503[field168][field462 >> 7][field464 >> 7] & 0x4) != 0) {
			return field168;
		}

		return 3;
	}

	@ObfuscatedName("client.a(ILPQBRPYKE;LTPTANZXN;IB)V")
	public final void method120(int arg0, PQBRPYKE arg1, TPTANZXN arg2, int arg3) {
		if ((arg3 & 0x400) != 0) {
			int var5 = arg1.method360();
			int var6 = arg1.method340();
			arg2.method564(field526, var5, var6);
			arg2.field1376 = field526 + 300;
			arg2.field1377 = arg1.method340();
			arg2.field1378 = arg1.method361();
		}

		if ((arg3 & 0x40) != 0) {
			int var7 = arg1.method359();
			int var8 = arg1.method360();
			arg2.method564(field526, var7, var8);
			arg2.field1376 = field526 + 300;
			arg2.field1377 = arg1.method359();
			arg2.field1378 = arg1.method361();
		}

		if ((arg3 & 0x1) != 0) {
			arg2.field1429 = arg1.method347();
			if (arg2.field1429.charAt(0) == '~') {
				arg2.field1429 = arg2.field1429.substring(1);
				method102(arg2.field1429, arg2.field1261, 2);
			} else if (field128 == arg2) {
				method102(arg2.field1429, arg2.field1261, 2);
			}

			arg2.field1413 = 0;
			arg2.field1423 = 0;
			arg2.field1417 = 150;
		}

		if ((arg3 & 0x100) != 0) {
			arg2.field1379 = arg1.method361();
			arg2.field1381 = arg1.method340();
			arg2.field1380 = arg1.method361();
			arg2.field1382 = arg1.method340();
			arg2.field1383 = arg1.method342() + field526;
			arg2.field1384 = arg1.method368() + field526;
			arg2.field1385 = arg1.method359();
			arg2.method562();
		}

		if ((arg3 & 0x200) != 0) {
			arg2.field1407 = arg1.method368();
			int var9 = arg1.method345();
			arg2.field1411 = var9 >> 16;
			arg2.field1410 = (var9 & 0xFFFF) + field526;
			arg2.field1408 = 0;
			arg2.field1409 = 0;

			if (arg2.field1410 > field526) {
				arg2.field1408 = -1;
			}

			if (arg2.field1407 == 0xFFFF) {
				arg2.field1407 = -1;
			}
		}

		if ((arg3 & 0x4) != 0) {
			int var10 = arg1.method361();
			byte[] var11 = new byte[var10];
			PQBRPYKE var12 = new PQBRPYKE(var11);
			arg1.method376(0, var11, var10);
			field429[arg0] = var12;
			arg2.method456(var12);
		}

		if ((arg3 & 0x10) != 0) {
			int var13 = arg1.method368();
			int var14 = arg1.method361();
			int var15 = arg1.method360();
			int var16 = arg1.field1091;

			if (arg2.field1261 != null && arg2.field1244) {
				long var17 = VUKQGAWR.method537(arg2.field1261);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field140; var20++) {
						if (field120[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field543 == 0) {
					try {
						field241.field1091 = 0;
						arg1.method376(0, field241.field1090, var15);
						field241.field1091 = 0;
						String var21 = GDVTWATR.method245(var15, field241);
						var21 = SQZXZVWD.method413(var21);
						arg2.field1429 = var21;
						arg2.field1413 = var13 >> 8;
						arg2.field1423 = var13 & 0xFF;
						arg2.field1417 = 150;

						if (var14 == 2 || var14 == 3) {
							method102(var21, "@cr2@" + arg2.field1261, 1);
						} else if (var14 == 1) {
							method102(var21, "@cr1@" + arg2.field1261, 1);
						} else {
							method102(var21, arg2.field1261, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field1091 = var15 + var16;
		}

		if ((arg3 & 0x20) != 0) {
			int var23 = arg1.method370();
			if (var23 == 0xFFFF) {
				var23 = -1;
			}

			int var24 = arg1.method361();
			if (arg2.field1424 == var23 && var23 != -1) {
				int var25 = BKDXLPEF.field75[var23].field89;
				if (var25 == 1) {
					arg2.field1425 = 0;
					arg2.field1426 = 0;
					arg2.field1427 = var24;
					arg2.field1428 = 0;
				}

				if (var25 == 2) {
					arg2.field1428 = 0;
				}
			} else if (var23 == -1 || arg2.field1424 == -1 || BKDXLPEF.field75[var23].field83 >= BKDXLPEF.field75[arg2.field1424].field83) {
				arg2.field1424 = var23;
				arg2.field1425 = 0;
				arg2.field1426 = 0;
				arg2.field1427 = var24;
				arg2.field1428 = 0;
				arg2.field1422 = arg2.field1412;
			}
		}

		if ((arg3 & 0x80) != 0) {
			arg2.field1419 = arg1.method369();
			arg2.field1420 = arg1.method370();
		}

		if ((arg3 & 0x2) != 0) {
			arg2.field1406 = arg1.method370();
			if (arg2.field1406 == 0xFFFF) {
				arg2.field1406 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method121() {
		method55("Starting up", 20);

		if (signlink.sunjava) {
			field829 = 5;
		}

		if (field281) {
			field147 = true;
		} else {
			field281 = true;
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
						field115[var3] = new YFAYUBGF(600000, var3 + 1, signlink.cache_dat, signlink.cache_idx[var3]);
					}
				}

				try {
					method132();
					field119 = method17(1, 25, "title screen", "title", field319[1]);
					field210 = new ZFUOSNLM(false, field119, "p11_full");
					field211 = new ZFUOSNLM(false, field119, "p12_full");
					field212 = new ZFUOSNLM(false, field119, "b12_full");
					field213 = new ZFUOSNLM(true, field119, "q8_full");
					method116();
					method157();
					XOJZVVDK var4 = method17(2, 30, "config", "config", field319[2]);
					XOJZVVDK var5 = method17(3, 35, "interface", "interface", field319[3]);
					XOJZVVDK var6 = method17(4, 40, "2d graphics", "media", field319[4]);
					XOJZVVDK var7 = method17(6, 45, "textures", "textures", field319[6]);
					XOJZVVDK var8 = method17(7, 50, "chat system", "wordenc", field319[7]);
					XOJZVVDK var9 = method17(8, 55, "sound effects", "sounds", field319[8]);
					field503 = new byte[4][104][104];
					field453 = new int[4][105][105];
					field405 = new UMNOCQQA(104, 104, field453, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field238[var10] = new EOSBSGLH(104, 104);
					}

					field488 = new WQACZBNG(512, 512);
					XOJZVVDK var11 = method17(5, 60, "update list", "versionlist", field319[5]);
					method55("Connecting to update server", 60);
					field239 = new QUPTMIEH();
					field239.method377(var11, this);
					NFWEZFJY.method298(field239.method387());
					FLXAIVEA.method215(field239.method396(0), field239);

					if (!field228) {
						field443 = 0;
						field444 = true;
						field239.method382(2, field443);

						while (field239.method385() > 0) {
							method54();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}

							if (field239.field1138 > 3) {
								method20("ondemand");
								return;
							}
						}
					}

					method55("Requesting animations", 65);
					int var12 = field239.method396(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field239.method382(1, var13);
					}

					while (field239.method385() > 0) {
						int var14 = var12 - field239.method385();
						if (var14 > 0) {
							method55("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method54();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}

						if (field239.field1138 > 3) {
							method20("ondemand");
							return;
						}
					}

					method55("Requesting models", 70);
					int var15 = field239.method396(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field239.method378(var16);
						if ((var17 & 0x1) != 0) {
							field239.method382(0, var16);
						}
					}

					int var18 = field239.method385();
					while (field239.method385() > 0) {
						int var19 = var18 - field239.method385();
						if (var19 > 0) {
							method55("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method54();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field115[0] != null) {
						method55("Requesting maps", 75);
						field239.method382(3, field239.method384(0, 47, 48));
						field239.method382(3, field239.method384(1, 47, 48));
						field239.method382(3, field239.method384(0, 48, 48));
						field239.method382(3, field239.method384(1, 48, 48));
						field239.method382(3, field239.method384(0, 49, 48));
						field239.method382(3, field239.method384(1, 49, 48));
						field239.method382(3, field239.method384(0, 47, 47));
						field239.method382(3, field239.method384(1, 47, 47));
						field239.method382(3, field239.method384(0, 48, 47));
						field239.method382(3, field239.method384(1, 48, 47));
						field239.method382(3, field239.method384(0, 48, 148));
						field239.method382(3, field239.method384(1, 48, 148));
						int var20 = field239.method385();
						while (field239.method385() > 0) {
							int var21 = var20 - field239.method385();
							if (var21 > 0) {
								method55("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method54();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var22 = field239.method396(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field239.method378(var23);
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
							field239.method389(0, var25, var23);
						}
					}

					field239.method393(field227);

					if (!field228) {
						int var26 = field239.method396(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field239.method380(var27)) {
								field239.method389(2, (byte) 1, var27);
							}
						}
					}

					int var28 = field239.method396(0);
					for (int var29 = 0; var29 < var28; var29++) {
						int var30 = field239.method378(var29);
						if (var30 == 0 && field239.field1136 < 200) {
							field239.method389(0, (byte) 1, var29);
						}
					}

					method55("Unpacking media", 80);
					field378 = new VEIVHFHZ(var6, "invback", 0);
					field380 = new VEIVHFHZ(var6, "chatback", 0);
					field379 = new VEIVHFHZ(var6, "mapback", 0);
					field251 = new VEIVHFHZ(var6, "backbase1", 0);
					field252 = new VEIVHFHZ(var6, "backbase2", 0);
					field253 = new VEIVHFHZ(var6, "backhmid1", 0);

					for (int var31 = 0; var31 < 13; var31++) {
						field402[var31] = new VEIVHFHZ(var6, "sideicons", var31);
					}

					field461 = new WQACZBNG(var6, "compass", 0);
					field297 = new WQACZBNG(var6, "mapedge", 0);
					field297.method545();

					for (int var32 = 0; var32 < 72; var32++) {
						field155[var32] = new VEIVHFHZ(var6, "mapscene", var32);
					}

					for (int var33 = 0; var33 < 70; var33++) {
						field413[var33] = new WQACZBNG(var6, "mapfunction", var33);
					}

					for (int var34 = 0; var34 < 5; var34++) {
						field341[var34] = new WQACZBNG(var6, "hitmarks", var34);
					}

					for (int var35 = 0; var35 < 6; var35++) {
						field298[var35] = new WQACZBNG(var6, "headicons_pk", var35);
					}

					for (int var36 = 0; var36 < 9; var36++) {
						field437[var36] = new WQACZBNG(var6, "headicons_prayer", var36);
					}

					for (int var37 = 0; var37 < 6; var37++) {
						field395[var37] = new WQACZBNG(var6, "headicons_hint", var37);
					}

					field449 = new WQACZBNG(var6, "overlay_multiway", 0);
					field206 = new WQACZBNG(var6, "mapmarker", 0);
					field207 = new WQACZBNG(var6, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field141[var38] = new WQACZBNG(var6, "cross", var38);
					}

					field406 = new WQACZBNG(var6, "mapdots", 0);
					field407 = new WQACZBNG(var6, "mapdots", 1);
					field408 = new WQACZBNG(var6, "mapdots", 2);
					field409 = new WQACZBNG(var6, "mapdots", 3);
					field410 = new WQACZBNG(var6, "mapdots", 4);
					field271 = new VEIVHFHZ(var6, "scrollbar", 0);
					field272 = new VEIVHFHZ(var6, "scrollbar", 1);
					field512 = new VEIVHFHZ(var6, "redstone1", 0);
					field513 = new VEIVHFHZ(var6, "redstone2", 0);
					field514 = new VEIVHFHZ(var6, "redstone3", 0);
					field515 = new VEIVHFHZ(var6, "redstone1", 0);
					field515.method524();
					field516 = new VEIVHFHZ(var6, "redstone2", 0);
					field516.method524();
					field326 = new VEIVHFHZ(var6, "redstone1", 0);
					field326.method525();
					field327 = new VEIVHFHZ(var6, "redstone2", 0);
					field327.method525();
					field328 = new VEIVHFHZ(var6, "redstone3", 0);
					field328.method525();
					field329 = new VEIVHFHZ(var6, "redstone1", 0);
					field329.method524();
					field329.method525();
					field330 = new VEIVHFHZ(var6, "redstone2", 0);
					field330.method524();
					field330.method525();

					for (int var39 = 0; var39 < 2; var39++) {
						field156[var39] = new VEIVHFHZ(var6, "mod_icons", var39);
					}

					WQACZBNG var40 = new WQACZBNG(var6, "backleft1", 0);
					field172 = new DRNBRPSO(var40.field1358, var40.field1357, method153());
					var40.method546(0, 0);
					WQACZBNG var41 = new WQACZBNG(var6, "backleft2", 0);
					field173 = new DRNBRPSO(var41.field1358, var41.field1357, method153());
					var41.method546(0, 0);
					WQACZBNG var42 = new WQACZBNG(var6, "backright1", 0);
					field174 = new DRNBRPSO(var42.field1358, var42.field1357, method153());
					var42.method546(0, 0);
					WQACZBNG var43 = new WQACZBNG(var6, "backright2", 0);
					field175 = new DRNBRPSO(var43.field1358, var43.field1357, method153());
					var43.method546(0, 0);
					WQACZBNG var44 = new WQACZBNG(var6, "backtop1", 0);
					field176 = new DRNBRPSO(var44.field1358, var44.field1357, method153());
					var44.method546(0, 0);
					WQACZBNG var45 = new WQACZBNG(var6, "backvmid1", 0);
					field177 = new DRNBRPSO(var45.field1358, var45.field1357, method153());
					var45.method546(0, 0);
					WQACZBNG var46 = new WQACZBNG(var6, "backvmid2", 0);
					field178 = new DRNBRPSO(var46.field1358, var46.field1357, method153());
					var46.method546(0, 0);
					WQACZBNG var47 = new WQACZBNG(var6, "backvmid3", 0);
					field179 = new DRNBRPSO(var47.field1358, var47.field1357, method153());
					var47.method546(0, 0);
					WQACZBNG var48 = new WQACZBNG(var6, "backhmid2", 0);
					field180 = new DRNBRPSO(var48.field1358, var48.field1357, method153());
					var48.method546(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 100; var53++) {
						if (field413[var53] != null) {
							field413[var53].method544(var50 + var52, var49 + var52, var51 + var52);
						}

						if (field155[var53] != null) {
							field155[var53].method526(var50 + var52, var49 + var52, var51 + var52);
						}
					}

					method55("Unpacking textures", 83);
					ORCVJTAI.method311(var7);
					ORCVJTAI.method315(0.8D);
					ORCVJTAI.method310(20);
					method55("Unpacking config", 86);
					BKDXLPEF.method11(var4);
					ELXAMLNA.method194(var4);
					LDSGOGGM.method276(var4);
					TGAGWNUA.method445(var4);
					JRELGTVY.method268(var4);
					YUTTZGSS.method579(var4);
					OKJTNJLE.method303(var4);
					CJICJSIY.method14(var4);
					HGYXNEJH.method257(var4);
					TGAGWNUA.field1228 = field227;

					if (!field228) {
						method55("Unpacking sounds", 90);
						byte[] var54 = var9.method560("sounds.dat", null);
						PQBRPYKE var55 = new PQBRPYKE(var54);
						MFQVDWNR.method280(var55);
					}

					method55("Unpacking interfaces", 95);
					ZFUOSNLM[] var56 = new ZFUOSNLM[] { field210, field211, field212, field213 };
					ATOBWHST.method2(var5, var56, var6);
					method55("Preparing game engine", 100);

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field379.field1343[field379.field1345 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field471[var57] = var58;
						field171[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field379.field1343[field379.field1345 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field532[var61 - 5] = var62 - 25;
						field286[var61 - 5] = var63 - var62;
					}

					ORCVJTAI.method308(765, 503);
					field391 = ORCVJTAI.field1070;
					ORCVJTAI.method308(479, 96);
					field388 = ORCVJTAI.field1070;
					ORCVJTAI.method308(190, 261);
					field389 = ORCVJTAI.field1070;
					ORCVJTAI.method308(512, 334);
					field390 = ORCVJTAI.field1070;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = ORCVJTAI.field1068[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					UMNOCQQA.method507(800, var65, 500, 334, 512);
					SQZXZVWD.method403(var8);
					field285 = new UVFIVFPB(this);
					method139(field285, 10);
					DZGXSGHB.field616 = this;
					ELXAMLNA.field652 = this;
					JRELGTVY.field947 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field270 + " " + field369);
					field240 = true;
				}
			} else {
				field202 = true;
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method122() {
		for (XQTFUCRC var1 = (XQTFUCRC) field352.method532(); var1 != null; var1 = (XQTFUCRC) field352.method534()) {
			if (field168 != var1.field1451 || field526 > var1.field1454) {
				var1.method163();
			} else if (field526 >= var1.field1453) {
				if (var1.field1449 > 0) {
					TBFTCCSF var2 = field242[var1.field1449 - 1];
					if (var2 != null && var2.field1396 >= 0 && var2.field1396 < 13312 && var2.field1397 >= 0 && var2.field1397 < 13312) {
						var1.method566(field526, var2.field1397, method66(var1.field1451, var2.field1397, var2.field1396) - var1.field1441, var2.field1396);
					}
				}

				if (var1.field1449 < 0) {
					int var3 = -var1.field1449 - 1;
					TPTANZXN var4;
					if (field146 == var3) {
						var4 = field128;
					} else {
						var4 = field424[var3];
					}

					if (var4 != null && var4.field1396 >= 0 && var4.field1396 < 13312 && var4.field1397 >= 0 && var4.field1397 < 13312) {
						var1.method566(field526, var4.field1397, method66(var1.field1451, var4.field1397, var4.field1396) - var1.field1441, var4.field1396);
					}
				}

				var1.method565(field230);
				field405.method482(-1, var1, false, field168, (int) var1.field1435, 60, (int) var1.field1433, var1.field1436, (int) var1.field1434);
			}
		}
	}

	@ObfuscatedName("client.b(LPQBRPYKE;ZI)V")
	public final void method123(PQBRPYKE arg0, int arg1) {
		field541 = 0;
		field427 = 0;
		method155(arg0, arg1);
		method101(arg0, arg1);
		method145(arg0, arg1);

		for (int var3 = 0; var3 < field541; var3++) {
			int var4 = field542[var3];
			if (field526 != field242[var4].field1418) {
				field242[var4].field1187 = null;
				field242[var4] = null;
			}
		}

		if (arg0.field1091 != arg1) {
			signlink.reporterror(field185 + " size mismatch in getnpcpos - pos:" + arg0.field1091 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field243; var5++) {
			if (field242[field244[var5]] == null) {
				signlink.reporterror(field185 + " null entry in npc list - pos:" + var5 + " size:" + field243);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(ILPQBRPYKE;I)V")
	public final void method124(PQBRPYKE arg0, int arg1) {
		while (arg0.field1092 + 10 < arg1 * 8) {
			int var3 = arg0.method351(11);
			if (var3 == 2047) {
				break;
			}

			if (field424[var3] == null) {
				field424[var3] = new TPTANZXN();
				if (field429[var3] != null) {
					field424[var3].method456(field429[var3]);
				}
			}

			field426[field425++] = var3;
			TPTANZXN var4 = field424[var3];
			var4.field1418 = field526;
			int var5 = arg0.method351(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method351(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method351(1);
			if (var7 == 1) {
				field428[field427++] = var3;
			}

			int var8 = arg0.method351(1);
			var4.method561(field128.field1405[0] + var6, var8 == 1, field128.field1404[0] + var5);
		}

		arg0.method352();
	}

	@ObfuscatedName("client.D(I)V")
	public final void method125() {
		ELXAMLNA.field663.method574();
		ELXAMLNA.field640.method574();
		JRELGTVY.field933.method574();
		TGAGWNUA.field1196.method574();
		TGAGWNUA.field1221.method574();
		TPTANZXN.field1254.method574();
		OKJTNJLE.field1058.method574();
	}

	@ObfuscatedName("client.E(I)V")
	public final void method126() {
		Graphics var1 = method153().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method262(1);

		if (field240) {
			field373 = false;
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

		if (field202) {
			field373 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field147) {
			field373 = false;
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

	@ObfuscatedName("client.a(IILATOBWHST;)I")
	public final int method127(int arg0, ATOBWHST arg1) {
		if (arg1.field63 == null || arg0 >= arg1.field63.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field63[arg0];
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
					var8 = field382[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field415[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field237[var3[var5++]];
				}

				if (var7 == 4) {
					ATOBWHST var10 = ATOBWHST.method4(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < TGAGWNUA.field1216 && (!TGAGWNUA.method453(var11).field1198 || field227)) {
						for (int var12 = 0; var12 < var10.field57.length; var12++) {
							if (var11 + 1 == var10.field57[var12]) {
								var8 += var10.field3[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field356[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field440[field415[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field356[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field128.field1252;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < BOBVWIJF.field91; var13++) {
						if (BOBVWIJF.field93[var13]) {
							var8 += field415[var13];
						}
					}
				}

				if (var7 == 10) {
					ATOBWHST var14 = ATOBWHST.method4(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < TGAGWNUA.field1216 && (!TGAGWNUA.method453(var15).field1198 || field227)) {
						for (int var16 = 0; var16 < var14.field57.length; var16++) {
							if (var14.field57[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field518;
				}

				if (var7 == 12) {
					var8 = field430;
				}

				if (var7 == 13) {
					int var17 = field356[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					HGYXNEJH var20 = HGYXNEJH.field818[var19];
					int var21 = var20.field820;
					int var22 = var20.field821;
					int var23 = var20.field822;
					int var24 = field204[var23 - var22];
					var8 = field356[var21] >> var22 & var24;
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
					var8 = (field128.field1396 >> 7) + field365;
				}

				if (var7 == 19) {
					var8 = (field128.field1397 >> 7) + field366;
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

	public final void init() {
		field225 = Integer.parseInt(getParameter("nodeid"));
		field226 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method83();
		} else {
			method42();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field227 = false;
		} else {
			field227 = true;
		}

		method260(503, 765);
	}

	@ObfuscatedName("client.a(ILPQBRPYKE;B)V")
	public final void method128(int arg0, PQBRPYKE arg1) {
		for (int var3 = 0; var3 < field427; var3++) {
			int var4 = field428[var3];
			TPTANZXN var5 = field424[var4];
			int var6 = arg1.method340();
			if ((var6 & 0x8) != 0) {
				var6 += arg1.method340() << 8;
			}

			method120(var4, arg1, var5, var6);
		}
	}

	@ObfuscatedName("client.a(ZLATOBWHST;)V")
	public final void method129(ATOBWHST arg0) {
		int var2 = arg0.field26;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field123 == 0) {
				arg0.field29 = "Loading friend list";
				arg0.field45 = 0;
			} else if (var2 == 1 && field123 == 1) {
				arg0.field29 = "Connecting to friendserver";
				arg0.field45 = 0;
			} else if (var2 == 2 && field123 != 2) {
				arg0.field29 = "Please wait...";
				arg0.field45 = 0;
			} else {
				int var3 = field122;
				if (field123 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field29 = "";
					arg0.field45 = 0;
				} else {
					arg0.field29 = field324[var2];
					arg0.field45 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field122;
			if (field123 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field29 = "";
				arg0.field45 = 0;
			} else {
				if (field345[var2] == 0) {
					arg0.field29 = "@red@Offline";
				} else if (field345[var2] < 200) {
					if (field345[var2] == field225) {
						arg0.field29 = "@gre@World" + (field345[var2] - 9);
					} else {
						arg0.field29 = "@yel@World" + (field345[var2] - 9);
					}
				} else if (field345[var2] == field225) {
					arg0.field29 = "@gre@Classic" + (field345[var2] - 219);
				} else {
					arg0.field29 = "@yel@Classic" + (field345[var2] - 219);
				}

				arg0.field45 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field122;
			if (field123 != 2) {
				var5 = 0;
			}

			arg0.field42 = var5 * 15 + 20;
			if (arg0.field42 <= arg0.field50) {
				arg0.field42 = arg0.field50 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field123 == 0) {
				arg0.field29 = "Loading ignore list";
				arg0.field45 = 0;
			} else if (var2 == 1 && field123 == 0) {
				arg0.field29 = "Please wait...";
				arg0.field45 = 0;
			} else {
				int var6 = field140;
				if (field123 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field29 = "";
					arg0.field45 = 0;
				} else {
					arg0.field29 = VUKQGAWR.method541(VUKQGAWR.method538(field120[var2]));
					arg0.field45 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field42 = field140 * 15 + 20;
			if (arg0.field42 <= arg0.field50) {
				arg0.field42 = arg0.field50 + 1;
			}
		} else if (var2 == 327) {
			arg0.field39 = 150;
			arg0.field40 = (int) (Math.sin(field526 / 40.0D) * 256.0D) & 0x7FF;

			if (field313) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field295[var7];
					if (var8 >= 0 && !YUTTZGSS.field1488[var8].method581()) {
						return;
					}
				}

				field313 = false;
				FLXAIVEA[] var9 = new FLXAIVEA[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field295[var11];
					if (var12 >= 0) {
						var9[var10++] = YUTTZGSS.field1488[var12].method582();
					}
				}

				FLXAIVEA var13 = new FLXAIVEA(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field118[var14] != 0) {
						var13.method232(field468[var14][0], field468[var14][field118[var14]]);

						if (var14 == 1) {
							var13.method232(field525[0], field525[field118[var14]]);
						}
					}
				}

				var13.method225();
				var13.method226(BKDXLPEF.field75[field128.field1414].field77[0]);
				var13.method235(64, 850, -30, -50, -30, true);
				arg0.field13 = 5;
				arg0.field14 = 0;
				ATOBWHST.method9(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field393 == null) {
				field393 = arg0.field71;
				field394 = arg0.field54;
			}

			if (field183) {
				arg0.field71 = field394;
			} else {
				arg0.field71 = field393;
			}
		} else if (var2 == 325) {
			if (field393 == null) {
				field393 = arg0.field71;
				field394 = arg0.field54;
			}

			if (field183) {
				arg0.field71 = field393;
			} else {
				arg0.field71 = field394;
			}
		} else if (var2 == 600) {
			arg0.field29 = field511;
			if (field526 % 20 < 10) {
				arg0.field29 = arg0.field29 + "|";
			} else {
				arg0.field29 = arg0.field29 + " ";
			}
		} else if (var2 == 620) {
			if (field404 < 1) {
				arg0.field29 = "";
			} else if (field343) {
				arg0.field49 = 0xFF0000;
				arg0.field29 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field49 = 0xFFFFFF;
				arg0.field29 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field473 - field161;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field29 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field363 == 0) {
				arg0.field29 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field363 <= field473) {
				arg0.field29 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method130(field363);
			} else {
				int var17 = field473 + 14 - field363;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field29 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method130(field363) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field376 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field376 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field376 + " unread messages";
			}

			arg0.field29 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field265 > 0 && field265 <= field473 + 10) {
				arg0.field29 = "Last password change:\\n@gre@" + method130(field265);
			} else {
				arg0.field29 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field184 > 2 && !field227) {
				arg0.field29 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field184 > 2) {
				arg0.field29 = "\\n\\nYou have @gre@" + field184 + "@yel@ days of\\nmember credit remaining.";
			} else if (field184 > 0) {
				arg0.field29 = "You have @gre@" + field184 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field29 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field184 > 2 && !field227) {
				arg0.field29 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field184 > 0) {
				arg0.field29 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field29 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field363 > field473) {
				arg0.field29 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field29 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.c(IB)Ljava/lang/String;")
	public final String method130(int arg0) {
		if (arg0 > field473 + 10) {
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

	@ObfuscatedName("client.j(Z)V")
	public final void method131() {
		if (field477 > 1) {
			field477--;
		}

		if (field460 > 0) {
			field460--;
		}

		for (int var1 = 0; var1 < 5 && method156(); var1++) {
		}

		if (field412) {
			synchronized (field285.field1342) {
				if (!field121) {
					field285.field1339 = 0;
				} else if (field849 != 0 || field285.field1339 >= 40) {
					field125.method329(128);
					field125.method330(0);
					int var3 = field125.field1091;
					int var4 = 0;
					for (int var5 = 0; var5 < field285.field1339 && var3 - field125.field1091 < 240; var5++) {
						var4++;
						int var6 = field285.field1338[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field285.field1340[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field285.field1338[var5] == -1 && field285.field1340[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field137 != var7 || field138 != var6) {
							int var9 = var7 - field137;
							field137 = var7;
							int var10 = var6 - field138;
							field138 = var6;

							if (field154 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field125.method331((field154 << 12) + (var9 << 6) + var10);
								field154 = 0;
							} else if (field154 < 8) {
								field125.method333((field154 << 19) + var8 + 0x800000);
								field154 = 0;
							} else {
								field125.method334((field154 << 19) + var8 - 0x40000000);
								field154 = 0;
							}
						} else if (field154 < 2047) {
							field154++;
						}
					}

					field125.method339(field125.field1091 - var3);

					if (var4 >= field285.field1339) {
						field285.field1339 = 0;
					} else {
						field285.field1339 -= var4;
						for (int var11 = 0; var11 < field285.field1339; var11++) {
							field285.field1340[var11] = field285.field1340[var4 + var11];
							field285.field1338[var11] = field285.field1338[var4 + var11];
						}
					}
				}
			}

			if (field849 != 0) {
				long var12 = (field852 - field145) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field145 = field852;
				int var14 = field851;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field850;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field849 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field125.method329(1);
				field125.method334((var17 << 19) + (var18 << 20) + var16);
			}

			if (field216 > 0) {
				field216--;
			}

			if (field853[1] == 1 || field853[2] == 1 || field853[3] == 1 || field853[4] == 1) {
				field217 = true;
			}

			if (field217 && field216 <= 0) {
				field216 = 20;
				field217 = false;
				field125.method329(85);
				field125.method367(field549);
				field125.method365(field550);
			}

			if (field840 && !field554) {
				field554 = true;
				field125.method329(201);
				field125.method330(1);
			}

			if (!field840 && field554) {
				field554 = false;
				field125.method329(201);
				field125.method330(0);
			}

			method44();
			method154();
			method135();
			field458++;
			if (field458 > 750) {
				method60();
			}

			method29();
			method69();
			method82();
			field230++;

			if (field259 != 0) {
				field258 += 20;
				if (field258 >= 400) {
					field259 = 0;
				}
			}

			if (field248 != 0) {
				field245++;
				if (field245 >= 15) {
					if (field248 == 2) {
						field364 = true;
					}

					if (field248 == 3) {
						field548 = true;
					}

					field248 = 0;
				}
			}

			if (field482 != 0) {
				field387++;

				if (field843 > field483 + 5 || field843 < field483 - 5 || field844 > field484 + 5 || field844 < field484 - 5) {
					field162 = true;
				}

				if (field842 == 0) {
					if (field482 == 2) {
						field364 = true;
					}

					if (field482 == 3) {
						field548 = true;
					}

					field482 = 0;

					if (field162 && field387 >= 5) {
						field502 = -1;
						method159();

						if (field502 == field480 && field501 != field481) {
							ATOBWHST var19 = ATOBWHST.method4(field480);
							byte var20 = 0;
							if (field469 == 1 && var19.field26 == 206) {
								var20 = 1;
							}

							if (var19.field57[field501] <= 0) {
								var20 = 0;
							}

							if (var19.field44) {
								int var21 = field481;
								int var22 = field501;
								var19.field57[var22] = var19.field57[var21];
								var19.field3[var22] = var19.field3[var21];
								var19.field57[var21] = -1;
								var19.field3[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field481;
								int var24 = field501;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method7(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method7(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method7(field481, field501);
							}

							field125.method329(166);
							field125.method356(var20);
							field125.method365(field481);
							field125.method331(field501);
							field125.method365(field480);
						}
					} else if ((field288 == 1 || method104(field249 - 1)) && field249 > 2) {
						method144();
					} else if (field249 > 0) {
						method46(field249 - 1);
					}

					field245 = 10;
					field849 = 0;
				}
			}

			if (UMNOCQQA.field1308 != -1) {
				int var25 = UMNOCQQA.field1308;
				int var26 = UMNOCQQA.field1309;
				boolean var27 = method27(var25, var26, 0, field128.field1405[0], 0, 0, 0, true, field128.field1404[0], 0, 0);
				UMNOCQQA.field1308 = -1;

				if (var27) {
					field256 = field850;
					field257 = field851;
					field259 = 1;
					field258 = 0;
				}
			}

			if (field849 == 1 && field315 != null) {
				field315 = null;
				field548 = true;
				field849 = 0;
			}

			method147();

			if (field229 == -1) {
				method48();
				method95();
				method37();
			}

			if (field842 == 1 || field849 == 1) {
				field335++;
			}

			if (field255 == 0 && field142 == 0 && field340 == 0) {
				if (field337 > 0) {
					field337--;
				}
			} else if (field337 < 100) {
				field337++;
				if (field337 == 100) {
					if (field255 != 0) {
						field548 = true;
					}

					if (field142 != 0) {
						field364 = true;
					}
				}
			}

			if (field314 == 2) {
				method51();
			}

			if (field314 == 2 && field504) {
				method18();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field533[var28]++;
			}

			method22();
			field841++;
			if (field841 > 4500) {
				field460 = 250;
				field841 -= 500;
				field125.method329(223);
			}

			field294++;
			if (field294 > 500) {
				field294 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field260 += field261;
				}

				if ((var29 & 0x2) == 2) {
					field131 += field132;
				}

				if ((var29 & 0x4) == 4) {
					field133 += field134;
				}
			}

			if (field260 < -50) {
				field261 = 2;
			}

			if (field260 > 50) {
				field261 = -2;
			}

			if (field131 < -55) {
				field132 = 2;
			}

			if (field131 > 55) {
				field132 = -2;
			}

			if (field133 < -40) {
				field134 = 1;
			}

			if (field133 > 40) {
				field134 = -1;
			}

			field419++;
			if (field419 > 500) {
				field419 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field223 += field224;
				}

				if ((var30 & 0x2) == 2) {
					field396 += field397;
				}
			}

			if (field223 < -60) {
				field224 = 2;
			}

			if (field223 > 60) {
				field224 = -2;
			}

			if (field396 < -20) {
				field397 = 1;
			}

			if (field396 > 10) {
				field397 = -1;
			}

			field459++;
			if (field459 > 50) {
				field125.method329(114);
			}

			try {
				if (field263 != null && field125.field1091 > 0) {
					field263.method468(0, field125.field1090, field125.field1091);
					field125.field1091 = 0;
					field459 = 0;
				}
			} catch (IOException var32) {
				method60();
			} catch (Exception var33) {
				method141();
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method132() {
		int var1 = 5;
		field319[8] = 0;
		int var2 = 0;
		while (field319[8] == 0) {
			String var3 = "Unknown problem";
			method55("Connecting to web server", 20);

			try {
				DataInputStream var4 = method89("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 374);
				PQBRPYKE var5 = new PQBRPYKE(new byte[40]);
				var4.readFully(var5.field1090, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field319[var6] = var5.method345();
				}

				int var7 = var5.method345();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field319[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field319[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field319[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field319[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field319[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field319[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method55("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method55(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field357 = !field357;
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method133(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method134(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field122; var3++) {
				if (field479[var3] == arg0) {
					field122--;
					field364 = true;

					for (int var4 = var3; var4 < field122; var4++) {
						field324[var4] = field324[var4 + 1];
						field345[var4] = field345[var4 + 1];
						field479[var4] = field479[var4 + 1];
					}

					field125.method329(116);
					field125.method336(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method135() {
		for (int var1 = 0; var1 < field219; var1++) {
			if (field182[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field500[var1] != field124 || field170[var1] != field280) {
						PQBRPYKE var3 = MFQVDWNR.method281(field500[var1], field170[var1]);
						if (System.currentTimeMillis() + var3.field1091 / 22 > field158 / 22 + field527) {
							field158 = var3.field1091;
							field527 = System.currentTimeMillis();

							if (method63(var3.field1090, var3.field1091)) {
								field124 = field500[var1];
								field280 = field170[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method50()) {
						var2 = true;
					}
				} catch (Exception var7) {
					if (signlink.reporterror) {
						field125.method329(171);
						field125.method331(field500[var1] & 0x7FFF);
					} else {
						field125.method329(171);
						field125.method331(-1);
					}
				}

				if (var2 && field182[var1] != -5) {
					field182[var1] = -5;
				} else {
					field219--;
					for (int var5 = var1; var5 < field219; var5++) {
						field500[var5] = field500[var5 + 1];
						field170[var5] = field170[var5 + 1];
						field182[var5] = field182[var5 + 1];
					}

					var1--;
				}
			} else {
				field182[var1]--;
			}
		}

		field203++;
		if (field203 > 1454) {
			field203 = 0;
			field125.method329(31);
			field125.method330(0);
			int var6 = field125.field1091;
			field125.method331((int) (Math.random() * 65536.0D));
			field125.method331(26445);
			field125.method330((int) (Math.random() * 256.0D));
			field125.method331((int) (Math.random() * 65536.0D));
			field125.method330((int) (Math.random() * 256.0D));
			field125.method331((int) (Math.random() * 65536.0D));
			field125.method331(39738);
			field125.method330(180);
			field125.method330(202);

			if ((int) (Math.random() * 2.0D) == 0) {
				field125.method331(48946);
			}

			field125.method339(field125.field1091 - var6);
		}

		if (field489 > 0) {
			field489 -= 20;
			if (field489 < 0) {
				field489 = 0;
			}

			if (field489 == 0 && field370 && !field228) {
				field443 = field235;
				field444 = true;
				field239.method382(2, field443);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(IIII)Z")
	public final boolean method136(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field405.method501(field168, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			ELXAMLNA var8 = ELXAMLNA.method196(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field631;
				var10 = var8.field661;
			} else {
				var9 = var8.field661;
				var10 = var8.field631;
			}

			int var11 = var8.field660;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method27(arg1, arg2, var11, field128.field1405[0], var9, 2, var10, true, field128.field1404[0], 0, 0);
		} else {
			method27(arg1, arg2, 0, field128.field1405[0], 0, 2, 0, true, field128.field1404[0], var6 + 1, var7);
		}

		field256 = field850;
		field257 = field851;
		field259 = 2;
		field258 = 0;
		return true;
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)Z")
	public final boolean method137(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field122; var2++) {
			if (arg0.equalsIgnoreCase(field324[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field128.field1261)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ILATOBWHST;)Z")
	public final boolean method138(ATOBWHST arg0) {
		int var2 = arg0.field26;
		if (field123 == 2) {
			if (var2 == 201) {
				field548 = true;
				field476 = 0;
				field153 = true;
				field130 = "";
				field398 = 1;
				field317 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field548 = true;
				field476 = 0;
				field153 = true;
				field130 = "";
				field398 = 2;
				field317 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field460 = 250;
			return true;
		}

		if (var2 == 501) {
			field548 = true;
			field476 = 0;
			field153 = true;
			field130 = "";
			field398 = 4;
			field317 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field548 = true;
			field476 = 0;
			field153 = true;
			field130 = "";
			field398 = 5;
			field317 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field295[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = YUTTZGSS.field1487 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= YUTTZGSS.field1487) {
							var5 = 0;
						}
					}

					if (!YUTTZGSS.field1488[var5].field1494 && YUTTZGSS.field1488[var5].field1489 == var3 + (field183 ? 0 : 7)) {
						break;
					}
				}

				field295[var3] = var5;
				field313 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field118[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field468[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field468[var6].length) {
					var8 = 0;
				}
			}

			field118[var6] = var8;
			field313 = true;
		}

		if (var2 == 324 && !field183) {
			field183 = true;
			method58();
		}

		if (var2 == 325 && field183) {
			field183 = false;
			method58();
		}

		if (var2 == 326) {
			field125.method329(94);
			field125.method330(field183 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field125.method330(field295[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field125.method330(field118[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field343 = !field343;
		}

		if (var2 >= 601 && var2 <= 613) {
			method35();

			if (field511.length() > 0) {
				field125.method329(52);
				field125.method336(VUKQGAWR.method537(field511));
				field125.method330(var2 - 601);
				field125.method330(field343 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method139(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method139(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method140() {
		try {
			field305 = -1;
			field267.method536();
			field352.method536();
			ORCVJTAI.method309();
			method125();
			field405.method471();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field238[var1].method202();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field503[var2][var3][var4] = 0;
					}
				}
			}

			DBFHRNVI var5 = new DBFHRNVI(104, field503, field453, 104);
			int var6 = field523.length;
			field125.method329(114);

			if (!field544) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field446[var7] >> 8) * 64 - field365;
					int var9 = (field446[var7] & 0xFF) * 64 - field366;
					byte[] var10 = field523[var7];
					if (var10 != null) {
						var5.method168(var10, (field282 - 6) * 8, var8, field238, var9, (field283 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field446[var11] >> 8) * 64 - field365;
					int var13 = (field446[var11] & 0xFF) * 64 - field366;
					byte[] var14 = field523[var11];
					if (var14 == null && field283 < 800) {
						var5.method165(64, 64, var12, var13);
					}
				}

				field125.method329(114);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field284[var15];
					if (var16 != null) {
						int var17 = (field446[var15] >> 8) * 64 - field365;
						int var18 = (field446[var15] & 0xFF) * 64 - field366;
						var5.method170(field405, field238, var16, var17, var18);
					}
				}
			}

			if (field544) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field467[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field446.length; var29++) {
									if (field446[var29] == var28 && field523[var29] != null) {
										var5.method172(field238, (var26 & 0x7) * 8, var21 * 8, var20 * 8, var25, var24, var19, field523[var29], (var27 & 0x7) * 8);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method177(var19, var20 * 8, var21 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field467[0][var30][var31];
						if (var32 == -1) {
							var5.method165(8, 8, var30 * 8, var31 * 8);
						}
					}
				}

				field125.method329(114);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field467[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field446.length; var42++) {
									if (field446[var42] == var41 && field284[var42] != null) {
										var5.method184(var37, var34 * 8, (var40 & 0x7) * 8, field405, field238, var33, var35 * 8, var38, field284[var42], (var39 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field125.method329(114);
			var5.method185(field238, field405);

			if (field291 != null) {
				field291.method186();
				ORCVJTAI.field1070 = field390;
			}

			field125.method329(114);
			int var43 = DBFHRNVI.field568;
			if (var43 > field168) {
				var43 = field168;
			}

			if (var43 < field168 - 1) {
				int var44 = field168 - 1;
			}

			if (field228) {
				field405.method472(DBFHRNVI.field568);
			} else {
				field405.method472(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method67(var45, var46);
				}
			}

			method57();
		} catch (Exception var59) {
		}

		ELXAMLNA.field663.method574();

		if (field838 != null) {
			field125.method329(81);
			field125.method334(1057001181);
		}

		if (field228 && signlink.cache_dat != null) {
			int var48 = field239.method396(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field239.method378(var49);
				if ((var50 & 0x79) == 0) {
					FLXAIVEA.method217(var49);
				}
			}
		}

		System.gc();
		ORCVJTAI.method310(20);
		field239.method392();
		int var51 = (field282 - 6) / 8 - 1;
		int var52 = (field282 + 6) / 8 + 1;
		int var53 = (field283 - 6) / 8 - 1;
		int var54 = (field283 + 6) / 8 + 1;
		if (field531) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field239.method384(0, var55, var56);
					if (var57 != -1) {
						field239.method383(var57, 3);
					}

					int var58 = field239.method384(1, var55, var56);
					if (var58 != -1) {
						field239.method383(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method141() {
		try {
			if (field263 != null) {
				field263.method464();
			}
		} catch (Exception var2) {
		}

		field263 = null;
		field412 = false;
		field307 = 0;
		field185 = "";
		field186 = "";
		method125();
		field405.method471();

		for (int var1 = 0; var1 < 4; var1++) {
			field238[var1].method202();
		}

		System.gc();
		method80();
		field235 = -1;
		field443 = -1;
		field489 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method142(String arg0, String arg1) {
		if (field291 != null) {
			field291.method186();
			ORCVJTAI.field1070 = field390;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field211.method586(arg1, 257, 0, var3);
			field211.method586(arg1, 256, 0xFFFFFF, var3 - 1);
			var3 += 15;
			if (arg0 != null) {
				field211.method586(arg0, 257, 0, var3);
				field211.method586(arg0, 256, 0xFFFFFF, var3 - 1);
			}

			field291.method187(4, field835, 4);
		} else if (field836 != null) {
			field836.method186();
			ORCVJTAI.field1070 = field391;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			NBXZFIDS.method291(383 - var5 / 2, var5, var4 - var6 / 2 - 5, 0, var6);
			NBXZFIDS.method292(var6, var5, 383 - var5 / 2, var4 - 5 - var6 / 2, 0xFFFFFF);

			if (arg0 != null) {
				var4 -= 7;
			}

			field211.method586(arg1, 383, 0, var4);
			field211.method586(arg1, 382, 0xFFFFFF, var4 - 1);
			var4 += 15;
			if (arg0 != null) {
				field211.method586(arg0, 383, 0, var4);
				field211.method586(arg0, 382, 0xFFFFFF, var4 - 1);
			}

			field836.method187(0, field835, 0);
		}
	}

	@ObfuscatedName("client.b(ZLATOBWHST;)Z")
	public final boolean method143(ATOBWHST arg0) {
		int var2 = arg0.field26;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field205[field249] = "Remove @whi@" + arg0.field29;
				field165[field249] = 61;
				field249++;
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

		field205[field249] = "Remove @whi@" + field324[var2];
		field165[field249] = 360;
		field249++;
		field205[field249] = "Message @whi@" + field324[var2];
		field165[field249] = 654;
		field249++;
		return true;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method144() {
		int var1 = field212.method588("Choose Option");
		for (int var2 = 0; var2 < field249; var2++) {
			int var3 = field212.method588(field205[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field249 * 15 + 21;
		if (field850 > 4 && field851 > 4 && field850 < 516 && field851 < 338) {
			int var5 = field850 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field851 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field159 = true;
			field300 = 0;
			field301 = var5;
			field302 = var6;
			field303 = var1;
			field304 = field249 * 15 + 22;
		}

		if (field850 > 553 && field851 > 205 && field850 < 743 && field851 < 466) {
			int var7 = field850 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field851 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field159 = true;
			field300 = 1;
			field301 = var7;
			field302 = var8;
			field303 = var1;
			field304 = field249 * 15 + 22;
		}

		if (field850 > 17 && field851 > 357 && field850 < 496 && field851 < 453) {
			int var9 = field850 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field851 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field159 = true;
			field300 = 2;
			field301 = var9;
			field302 = var10;
			field303 = var1;
			field304 = field249 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(LPQBRPYKE;II)V")
	public final void method145(PQBRPYKE arg0, int arg1) {
		for (int var3 = 0; var3 < field427; var3++) {
			int var4 = field428[var3];
			TBFTCCSF var5 = field242[var4];
			int var6 = arg0.method340();
			if ((var6 & 0x20) != 0) {
				int var7 = arg0.method361();
				int var8 = arg0.method360();
				var5.method564(field526, var7, var8);
				var5.field1376 = field526 + 300;
				var5.field1377 = arg0.method360();
				var5.field1378 = arg0.method340();
			}

			if ((var6 & 0x4) != 0) {
				var5.field1406 = arg0.method370();
				if (var5.field1406 == 0xFFFF) {
					var5.field1406 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field1419 = arg0.method370();
				var5.field1420 = arg0.method368();
			}

			if ((var6 & 0x10) != 0) {
				var5.field1407 = arg0.method342();
				int var9 = arg0.method345();
				var5.field1411 = var9 >> 16;
				var5.field1410 = (var9 & 0xFFFF) + field526;
				var5.field1408 = 0;
				var5.field1409 = 0;

				if (var5.field1410 > field526) {
					var5.field1408 = -1;
				}

				if (var5.field1407 == 0xFFFF) {
					var5.field1407 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.field1429 = arg0.method347();
				var5.field1417 = 100;
			}

			if ((var6 & 0x80) != 0) {
				int var10 = arg0.method368();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg0.method359();
				if (var5.field1424 == var10 && var10 != -1) {
					int var12 = BKDXLPEF.field75[var10].field89;
					if (var12 == 1) {
						var5.field1425 = 0;
						var5.field1426 = 0;
						var5.field1427 = var11;
						var5.field1428 = 0;
					}

					if (var12 == 2) {
						var5.field1428 = 0;
					}
				} else if (var10 == -1 || var5.field1424 == -1 || BKDXLPEF.field75[var10].field83 >= BKDXLPEF.field75[var5.field1424].field83) {
					var5.field1424 = var10;
					var5.field1425 = 0;
					var5.field1426 = 0;
					var5.field1427 = var11;
					var5.field1428 = 0;
					var5.field1422 = var5.field1412;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field1187 = JRELGTVY.method269(arg0.method368());
				var5.field1386 = var5.field1187.field948;
				var5.field1399 = var5.field1187.field935;
				var5.field1388 = var5.field1187.field952;
				var5.field1389 = var5.field1187.field961;
				var5.field1390 = var5.field1187.field932;
				var5.field1391 = var5.field1187.field934;
				var5.field1414 = var5.field1187.field930;
			}

			if ((var6 & 0x40) != 0) {
				int var13 = arg0.method340();
				int var14 = arg0.method359();
				var5.method564(field526, var13, var14);
				var5.field1376 = field526 + 300;
				var5.field1377 = arg0.method340();
				var5.field1378 = arg0.method359();
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method146() {
		field373 = false;
		while (field506) {
			field373 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field220 = null;
		field221 = null;
		field454 = null;
		field274 = null;
		field275 = null;
		field276 = null;
		field277 = null;
		field374 = null;
		field375 = null;
		field521 = null;
		field522 = null;
		field474 = null;
		field475 = null;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method147() {
		if (field482 == 0) {
			int var1 = field849;
			if (field431 == 1 && field850 >= 516 && field851 >= 160 && field850 <= 765 && field851 <= 205) {
				var1 = 0;
			}

			if (field159) {
				if (var1 != 1) {
					int var2 = field843;
					int var3 = field844;
					if (field300 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field300 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field300 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field301 - 10 || var2 > field303 + field301 + 10 || var3 < field302 - 10 || var3 > field304 + field302 + 10) {
						field159 = false;

						if (field300 == 1) {
							field364 = true;
						}

						if (field300 == 2) {
							field548 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field301;
					int var5 = field302;
					int var6 = field303;
					int var7 = field850;
					int var8 = field851;
					if (field300 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field300 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field300 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field249; var10++) {
						int var11 = (field249 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method46(var9);
					}

					field159 = false;

					if (field300 == 1) {
						field364 = true;
					}

					if (field300 == 2) {
						field548 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field249 > 0) {
					int var12 = field165[field249 - 1];
					if (var12 == 5 || var12 == 871 || var12 == 123 || var12 == 850 || var12 == 670 || var12 == 479 || var12 == 940 || var12 == 193 || var12 == 115 || var12 == 547 || var12 == 253 || var12 == 1327) {
						int var13 = field163[field249 - 1];
						int var14 = field164[field249 - 1];
						ATOBWHST var15 = ATOBWHST.method4(var14);
						if (var15.field47 || var15.field44) {
							field162 = false;
							field387 = 0;
							field480 = var14;
							field481 = var13;
							field482 = 2;
							field483 = field850;
							field484 = field851;

							if (ATOBWHST.method4(var14).field8 == field547) {
								field482 = 1;
							}

							if (ATOBWHST.method4(var14).field8 == field403) {
								field482 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field288 == 1 || method104(field249 - 1)) && field249 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field249 > 0) {
					method46(field249 - 1);
				}

				if (var1 != 2 || field249 <= 0) {
					return;
				}

				method144();
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method148() {
		field320++;
		method21(true);
		method59(true);
		method21(false);
		method59(false);
		method122();
		method115();

		if (!field504) {
			int var1 = field549;
			if (field236 / 256 > var1) {
				var1 = field236 / 256;
			}

			if (field441[4] && field553[4] + 128 > var1) {
				var1 = field553[4] + 128;
			}

			int var2 = field550 + field133 & 0x7FF;
			method93(field215, var1 * 3 + 600, var2, method66(field168, field128.field1397, field128.field1396) - 50, var1, field214);
		}

		int var3;
		if (field504) {
			var3 = method119();
		} else {
			var3 = method118();
		}

		int var4 = field462;
		int var5 = field463;
		int var6 = field464;
		int var7 = field465;
		int var8 = field466;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field441[var9]) {
				int var10 = (int) (Math.random() * (field160[var9] * 2 + 1) + Math.sin(field351[var9] / 100.0D * field533[var9]) * field553[var9] - field160[var9]);
				if (var9 == 0) {
					field462 += var10;
				}

				if (var9 == 1) {
					field463 += var10;
				}

				if (var9 == 2) {
					field464 += var10;
				}

				if (var9 == 3) {
					field466 = field466 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field465 += var10;
					if (field465 < 128) {
						field465 = 128;
					}

					if (field465 > 383) {
						field465 = 383;
					}
				}
			}
		}

		int var11 = ORCVJTAI.field1079;
		FLXAIVEA.field742 = true;
		FLXAIVEA.field745 = 0;
		FLXAIVEA.field743 = field843 - 4;
		FLXAIVEA.field744 = field844 - 4;
		NBXZFIDS.method289();
		field405.method510(var3, field464, field462, field465, field463, field466);
		field405.method485();
		method16();
		method40();
		method78(var11);
		method160();
		field291.method187(4, field835, 4);
		field462 = var4;
		field463 = var5;
		field464 = var6;
		field465 = var7;
		field466 = var8;
	}

	@ObfuscatedName("client.a(IILPQBRPYKE;)V")
	public final void method149(int arg0, PQBRPYKE arg1) {
		int var3 = arg1.method351(8);
		if (var3 < field425) {
			for (int var4 = var3; var4 < field425; var4++) {
				field542[field541++] = field426[var4];
			}
		}

		if (var3 > field425) {
			signlink.reporterror(field185 + " Too many players");
			throw new RuntimeException("eek");
		}

		field425 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field426[var5];
			TPTANZXN var7 = field424[var6];
			int var8 = arg1.method351(1);
			if (var8 == 0) {
				field426[field425++] = var6;
				var7.field1418 = field526;
			} else {
				int var9 = arg1.method351(2);
				if (var9 == 0) {
					field426[field425++] = var6;
					var7.field1418 = field526;
					field428[field427++] = var6;
				} else if (var9 == 1) {
					field426[field425++] = var6;
					var7.field1418 = field526;
					int var10 = arg1.method351(3);
					var7.method563(false, var10);
					int var11 = arg1.method351(1);
					if (var11 == 1) {
						field428[field427++] = var6;
					}
				} else if (var9 == 2) {
					field426[field425++] = var6;
					var7.field1418 = field526;
					int var12 = arg1.method351(3);
					var7.method563(true, var12);
					int var13 = arg1.method351(3);
					var7.method563(true, var13);
					int var14 = arg1.method351(1);
					if (var14 == 1) {
						field428[field427++] = var6;
					}
				} else if (var9 == 3) {
					field542[field541++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method150(int arg0) {
		int var2 = CJICJSIY.field100[arg0].field108;
		if (var2 != 0) {
			int var3 = field356[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					ORCVJTAI.method315(0.9D);
				}

				if (var3 == 2) {
					ORCVJTAI.method315(0.8D);
				}

				if (var3 == 3) {
					ORCVJTAI.method315(0.7D);
				}

				if (var3 == 4) {
					ORCVJTAI.method315(0.6D);
				}

				TGAGWNUA.field1221.method574();
				field420 = true;
			}

			if (var2 == 3) {
				boolean var4 = field370;

				if (var3 == 0) {
					method84(field370, 0);
					field370 = true;
				}

				if (var3 == 1) {
					method84(field370, -400);
					field370 = true;
				}

				if (var3 == 2) {
					method84(field370, -800);
					field370 = true;
				}

				if (var3 == 3) {
					method84(field370, -1200);
					field370 = true;
				}

				if (var3 == 4) {
					field370 = false;
				}

				if (field370 != var4 && !field228) {
					if (field370) {
						field443 = field235;
						field444 = true;
						field239.method382(2, field443);
					} else {
						method80();
					}

					field489 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field386 = true;
					method151(0);
				}

				if (var3 == 1) {
					field386 = true;
					method151(-400);
				}

				if (var3 == 2) {
					field386 = true;
					method151(-800);
				}

				if (var3 == 3) {
					field386 = true;
					method151(-1200);
				}

				if (var3 == 4) {
					field386 = false;
				}
			}

			if (var2 == 5) {
				field288 = var3;
			}

			if (var2 == 6) {
				field264 = var3;
			}

			if (var2 == 8) {
				field278 = var3;
				field548 = true;
			}

			if (var2 == 9) {
				field469 = var3;
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method151(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.K(I)V")
	public void method152() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field338);

		if (field239 != null) {
			System.out.println("Od-cycle:" + field239.field1123);
		}

		System.out.println("loop-cycle:" + field526);
		System.out.println("draw-cycle:" + field296);
		System.out.println("ptype:" + field457);
		System.out.println("psize:" + field456);

		if (field263 != null) {
			field263.method469();
		}

		field832 = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final Component method153() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field838 != null) {
			return field838;
		}

		return this;
	}

	@ObfuscatedName("client.r(B)V")
	public final void method154() {
		if (field314 == 2) {
			for (GWDACNJF var1 = (GWDACNJF) field273.method532(); var1 != null; var1 = (GWDACNJF) field273.method534()) {
				if (var1.field797 > 0) {
					var1.field797--;
				}

				if (var1.field797 != 0) {
					if (var1.field808 > 0) {
						var1.field808--;
					}

					if (var1.field808 == 0 && var1.field806 >= 1 && var1.field807 >= 1 && var1.field806 <= 102 && var1.field807 <= 102 && (var1.field798 < 0 || DBFHRNVI.method164(var1.field798, var1.field800))) {
						method92(var1.field800, var1.field805, var1.field798, var1.field804, var1.field799, var1.field806, var1.field807);
						var1.field808 = -1;

						if (var1.field801 == var1.field798 && var1.field801 == -1) {
							var1.method163();
						} else if (var1.field801 == var1.field798 && var1.field802 == var1.field799 && var1.field803 == var1.field800) {
							var1.method163();
						}
					}
				} else if (var1.field801 < 0 || DBFHRNVI.method164(var1.field801, var1.field803)) {
					method92(var1.field803, var1.field805, var1.field801, var1.field804, var1.field802, var1.field806, var1.field807);
					var1.method163();
				}
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(LPQBRPYKE;IB)V")
	public final void method155(PQBRPYKE arg0, int arg1) {
		arg0.method350();
		int var3 = arg0.method351(8);
		if (var3 < field243) {
			for (int var4 = var3; var4 < field243; var4++) {
				field542[field541++] = field244[var4];
			}
		}

		if (var3 > field243) {
			signlink.reporterror(field185 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field243 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field244[var5];
			TBFTCCSF var7 = field242[var6];
			int var8 = arg0.method351(1);
			if (var8 == 0) {
				field244[field243++] = var6;
				var7.field1418 = field526;
			} else {
				int var9 = arg0.method351(2);
				if (var9 == 0) {
					field244[field243++] = var6;
					var7.field1418 = field526;
					field428[field427++] = var6;
				} else if (var9 == 1) {
					field244[field243++] = var6;
					var7.field1418 = field526;
					int var10 = arg0.method351(3);
					var7.method563(false, var10);
					int var11 = arg0.method351(1);
					if (var11 == 1) {
						field428[field427++] = var6;
					}
				} else if (var9 == 2) {
					field244[field243++] = var6;
					var7.field1418 = field526;
					int var12 = arg0.method351(3);
					var7.method563(true, var12);
					int var13 = arg0.method351(3);
					var7.method563(true, var13);
					int var14 = arg0.method351(1);
					if (var14 == 1) {
						field428[field427++] = var6;
					}
				} else if (var9 == 3) {
					field542[field541++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.s(B)Z")
	public final boolean method156() {
		if (field263 == null) {
			return false;
		}

		try {
			int var1 = field263.method466();
			if (var1 == 0) {
				return false;
			}

			if (field457 == -1) {
				field263.method467(field135.field1090, 0, 1);
				field457 = field135.field1090[0] & 0xFF;
				if (field287 != null) {
					field457 = field457 - field287.method556() & 0xFF;
				}

				field456 = KVGTOIQD.field977[field457];
				var1--;
			}

			if (field456 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field263.method467(field135.field1090, 0, 1);
				field456 = field135.field1090[0] & 0xFF;
				var1--;
			}

			if (field456 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field263.method467(field135.field1090, 0, 2);
				field135.field1091 = 0;
				field456 = field135.method342();
				var1 -= 2;
			}

			if (var1 < field456) {
				return false;
			}

			field135.field1091 = 0;
			field263.method467(field135.field1090, 0, field456);
			field458 = 0;
			field355 = field354;
			field354 = field353;
			field353 = field457;

			if (field457 == 180) {
				field364 = true;
				int var2 = field135.method342();
				ATOBWHST var3 = ATOBWHST.method4(var2);
				int var4 = field135.method342();
				for (int var5 = 0; var5 < var4; var5++) {
					var3.field57[var5] = field135.method370();
					int var6 = field135.method359();
					if (var6 == 255) {
						var6 = field135.method375();
					}

					var3.field3[var5] = var6;
				}

				for (int var7 = var4; var7 < var3.field57.length; var7++) {
					var3.field57[var7] = 0;
					var3.field3[var7] = 0;
				}

				field457 = -1;
				return true;
			}

			if (field457 != 52 && field457 != 6) {
				if (field457 == 236) {
					method36(field135, field456);
					field519 = false;
					field457 = -1;
					return true;
				}

				if (field457 != 253) {
					if (field457 == 137) {
						int var58 = field135.method340();
						int var59 = field135.method340();
						int var60 = field135.method340();
						int var61 = field135.method340();
						field441[var58] = true;
						field160[var58] = var59;
						field553[var58] = var60;
						field351[var58] = var61;
						field533[var58] = 0;
						field457 = -1;
						return true;
					}

					if (field457 == 64) {
						field477 = field135.method369() * 30;
						field457 = -1;
						return true;
					}

					if (field457 == 79) {
						int var62 = field135.method369();
						ATOBWHST.method4(var62).field13 = 3;

						if (field128.field1245 == null) {
							ATOBWHST.method4(var62).field14 = (field128.field1240[11] << 5) + (field128.field1240[8] << 10) + (field128.field1240[0] << 15) + (field128.field1260[0] << 25) + (field128.field1260[4] << 20) + field128.field1240[1];
						} else {
							ATOBWHST.method4(var62).field14 = (int) (field128.field1245.field943 + 0x12345678L);
						}

						field457 = -1;
						return true;
					}

					if (field457 == 181) {
						int var63 = field135.method372();
						int var64 = field135.method368();
						ATOBWHST var65 = ATOBWHST.method4(var64);
						if (var65.field11 != var63 || var63 == -1) {
							var65.field11 = var63;
							var65.field73 = 0;
							var65.field69 = 0;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 71) {
						int var66 = field135.method368();
						int var67 = field135.method342();
						ATOBWHST.method4(var67).field13 = 1;
						ATOBWHST.method4(var67).field14 = var66;
						field457 = -1;
						return true;
					}

					if (field457 == 235) {
						field452 = field135.method340();
						if (field452 == 1) {
							field144 = field135.method342();
						}

						if (field452 >= 2 && field452 <= 6) {
							if (field452 == 2) {
								field200 = 64;
								field201 = 64;
							}

							if (field452 == 3) {
								field200 = 0;
								field201 = 64;
							}

							if (field452 == 4) {
								field200 = 128;
								field201 = 64;
							}

							if (field452 == 5) {
								field200 = 64;
								field201 = 0;
							}

							if (field452 == 6) {
								field200 = 64;
								field201 = 128;
							}

							field452 = 2;
							field197 = field135.method342();
							field198 = field135.method342();
							field199 = field135.method340();
						}

						if (field452 == 10) {
							field136 = field135.method342();
						}

						field457 = -1;
						return true;
					}

					if (field457 == 36) {
						int var68 = field135.method369();
						int var69 = field135.method342();
						int var70 = field135.method370();
						ATOBWHST.method4(var70).field52 = (var68 << 16) + var69;
						field457 = -1;
						return true;
					}

					if (field457 == 163) {
						field517 = field135.method360();
						if (field517 == field472) {
							if (field517 == 3) {
								field472 = 1;
							} else {
								field472 = 3;
							}

							field364 = true;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 134) {
						field364 = true;
						int var71 = field135.method359();
						int var72 = field135.method374();
						int var73 = field135.method340();
						field237[var71] = var72;
						field382[var71] = var73;
						field415[var71] = 1;
						for (int var74 = 0; var74 < 98; var74++) {
							if (var72 >= field440[var74]) {
								field415[var71] = var74 + 2;
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 46) {
						field504 = false;

						for (int var75 = 0; var75 < 5; var75++) {
							field441[var75] = false;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 226) {
						int var76 = field135.method369();
						int var77 = field135.method370();
						method49(var76);

						if (var77 != -1) {
							method49(var77);
						}

						if (field547 != -1) {
							method33(field547);
							field547 = -1;
						}

						if (field208 != -1) {
							method33(field208);
							field208 = -1;
						}

						if (field403 != -1) {
							method33(field403);
							field403 = -1;
						}

						if (field229 != var76) {
							method33(field229);
							field229 = var76;
						}

						if (field169 != var76) {
							method33(field169);
							field169 = var77;
						}

						field476 = 0;
						field421 = false;
						field457 = -1;
						return true;
					}

					if (field457 == 158) {
						int var78 = field135.method368();
						boolean var79 = field135.method361() == 1;
						ATOBWHST.method4(var78).field43 = var79;
						field457 = -1;
						return true;
					}

					if (field457 == 152) {
						for (int var80 = 0; var80 < field424.length; var80++) {
							if (field424[var80] != null) {
								field424[var80].field1424 = -1;
							}
						}

						for (int var81 = 0; var81 < field242.length; var81++) {
							if (field242[var81] != null) {
								field242[var81].field1424 = -1;
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 2) {
						field161 = field135.method368();
						field135.method368();
						field473 = field135.method370();
						field184 = field135.method368();
						field316 = field135.method375();
						field135.method369();
						field363 = field135.method370();
						field135.method368();
						field265 = field135.method369();
						field376 = field135.method369();
						field135.method361();
						signlink.dnslookup(VUKQGAWR.method540(field316));
						field457 = -1;
						return true;
					}

					if (field457 == 243) {
						field540 = field135.method340();
						field457 = -1;
						return true;
					}

					if (field457 == 162) {
						String var82 = field135.method347();
						if (var82.endsWith(":tradereq:")) {
							String var83 = var82.substring(0, var82.indexOf(":"));
							long var84 = VUKQGAWR.method537(var83);
							boolean var86 = false;
							for (int var87 = 0; var87 < field140; var87++) {
								if (field120[var87] == var84) {
									var86 = true;
									break;
								}
							}

							if (!var86 && field543 == 0) {
								method102("wishes to trade with you.", var83, 4);
							}
						} else if (var82.endsWith(":duelreq:")) {
							String var88 = var82.substring(0, var82.indexOf(":"));
							long var89 = VUKQGAWR.method537(var88);
							boolean var91 = false;
							for (int var92 = 0; var92 < field140; var92++) {
								if (field120[var92] == var89) {
									var91 = true;
									break;
								}
							}

							if (!var91 && field543 == 0) {
								method102("wishes to duel with you.", var88, 8);
							}
						} else if (var82.endsWith(":chalreq:")) {
							String var93 = var82.substring(0, var82.indexOf(":"));
							long var94 = VUKQGAWR.method537(var93);
							boolean var96 = false;
							for (int var97 = 0; var97 < field140; var97++) {
								if (field120[var97] == var94) {
									var96 = true;
									break;
								}
							}

							if (!var96 && field543 == 0) {
								String var98 = var82.substring(var82.indexOf(":") + 1, var82.length() - 9);
								method102(var98, var93, 8);
							}
						} else {
							method102(var82, "", 0);
						}

						field457 = -1;
						return true;
					}

					if (field457 == 115) {
						int var99 = field135.method343();
						if (field401 != var99) {
							method33(field401);
							field401 = var99;
						}

						field548 = true;
						field457 = -1;
						return true;
					}

					if (field457 == 100) {
						int var100 = field135.method375();
						int var101 = field135.method370();
						field545[var101] = var100;

						if (field356[var101] != var100) {
							field356[var101] = var100;
							method150(var101);
							field364 = true;

							if (field401 != -1) {
								field548 = true;
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 245 || field457 == 68 || field457 == 164 || field457 == 183 || field457 == 252 || field457 == 248 || field457 == 124 || field457 == 241 || field457 == 11 || field457 == 156 || field457 == 121) {
						method19(field135, field457);
						field457 = -1;
						return true;
					}

					if (field457 == 14) {
						int var102 = field135.method343();
						if (var102 >= 0) {
							method49(var102);
						}

						if (field126 != var102) {
							method33(field126);
							field126 = var102;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 184) {
						field486 = 0;
						field457 = -1;
						return true;
					}

					if (field457 == 196) {
						field140 = field456 / 8;
						for (int var103 = 0; var103 < field140; var103++) {
							field120[var103] = field135.method346();
						}

						field457 = -1;
						return true;
					}

					if (field457 == 26) {
						int var104 = field135.method369();
						if (var104 == 0xFFFF) {
							var104 = -1;
						}

						if (field235 != var104 && field370 && !field228 && field489 == 0) {
							field443 = var104;
							field444 = true;
							field239.method382(2, field443);
						}

						field235 = var104;
						field457 = -1;
						return true;
					}

					if (field457 == 53) {
						int var105 = field135.method373();
						int var106 = field135.method368();
						if (field370 && !field228) {
							field443 = var106;
							field444 = false;
							field239.method382(2, field443);
							field489 = var105;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 136) {
						long var107 = field135.method346();
						int var109 = field135.method340();
						String var110 = VUKQGAWR.method541(VUKQGAWR.method538(var107));
						for (int var111 = 0; var111 < field122; var111++) {
							if (field479[var111] == var107) {
								if (field345[var111] != var109) {
									field345[var111] = var109;
									field364 = true;

									if (var109 > 0) {
										method102(var110 + " has logged in.", "", 5);
									}

									if (var109 == 0) {
										method102(var110 + " has logged out.", "", 5);
									}
								}

								var110 = null;
								break;
							}
						}

						if (var110 != null && field122 < 200) {
							field479[field122] = var107;
							field324[field122] = var110;
							field345[field122] = var109;
							field122++;
							field364 = true;
						}

						boolean var112 = false;
						while (!var112) {
							var112 = true;
							for (int var113 = 0; var113 < field122 - 1; var113++) {
								if (field345[var113] != field225 && field345[var113 + 1] == field225 || field345[var113] == 0 && field345[var113 + 1] != 0) {
									int var114 = field345[var113];
									field345[var113] = field345[var113 + 1];
									field345[var113 + 1] = var114;
									String var115 = field324[var113];
									field324[var113] = field324[var113 + 1];
									field324[var113 + 1] = var115;
									long var116 = field479[var113];
									field479[var113] = field479[var113 + 1];
									field479[var113 + 1] = var116;
									field364 = true;
									var112 = false;
								}
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 104) {
						field439 = field135.method360();
						field438 = field135.method360();
						field457 = -1;
						return true;
					}

					if (field457 == 221) {
						field372 = field135.method340();
						field457 = -1;
						return true;
					}

					if (field457 == 229) {
						int var118 = field135.method370();
						int var119 = field135.method370();
						int var120 = field135.method369();
						int var121 = field135.method368();
						ATOBWHST.method4(var118).field39 = var119;
						ATOBWHST.method4(var118).field40 = var121;
						ATOBWHST.method4(var118).field38 = var120;
						field457 = -1;
						return true;
					}

					if (field457 == 29) {
						int var122 = field135.method369();
						method49(var122);

						if (field403 != -1) {
							method33(field403);
							field403 = -1;
							field548 = true;
						}

						if (field229 != -1) {
							method33(field229);
							field229 = -1;
							field420 = true;
						}

						if (field169 != -1) {
							method33(field169);
							field169 = -1;
						}

						if (field547 != -1) {
							method33(field547);
							field547 = -1;
						}

						if (field208 != var122) {
							method33(field208);
							field208 = var122;
						}

						if (field476 != 0) {
							field476 = 0;
							field548 = true;
						}

						field364 = true;
						field167 = true;
						field421 = false;
						field457 = -1;
						return true;
					}

					if (field457 == 179) {
						int var123 = field135.method368();
						int var124 = field135.method342();
						ATOBWHST var125 = ATOBWHST.method4(var124);
						if (var125 != null && var125.field61 == 0) {
							if (var123 < 0) {
								var123 = 0;
							}

							if (var123 > var125.field42 - var125.field50) {
								var123 = var125.field42 - var125.field50;
							}

							var125.field60 = var123;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 150) {
						field153 = false;
						field476 = 1;
						field117 = "";
						field548 = true;
						field457 = -1;
						return true;
					}

					if (field457 == 3) {
						int var126 = field135.method370();
						method49(var126);

						if (field208 != -1) {
							method33(field208);
							field208 = -1;
							field364 = true;
							field167 = true;
						}

						if (field229 != -1) {
							method33(field229);
							field229 = -1;
							field420 = true;
						}

						if (field169 != -1) {
							method33(field169);
							field169 = -1;
						}

						if (field547 != -1) {
							method33(field547);
							field547 = -1;
						}

						if (field403 != var126) {
							method33(field403);
							field403 = var126;
						}

						field421 = false;
						field548 = true;
						field457 = -1;
						return true;
					}

					if (field457 == 211) {
						if (field472 == 12) {
							field364 = true;
						}

						field518 = field135.method340();
						field457 = -1;
						return true;
					}

					if (field457 == 230) {
						field439 = field135.method360();
						field438 = field135.method361();
						for (int var127 = field438; var127 < field438 + 8; var127++) {
							for (int var128 = field439; var128 < field439 + 8; var128++) {
								if (field416[field168][var127][var128] != null) {
									field416[field168][var127][var128] = null;
									method67(var127, var128);
								}
							}
						}

						for (GWDACNJF var129 = (GWDACNJF) field273.method532(); var129 != null; var129 = (GWDACNJF) field273.method534()) {
							if (var129.field806 >= field438 && var129.field806 < field438 + 8 && var129.field807 >= field439 && var129.field807 < field439 + 8 && field168 == var129.field804) {
								var129.field797 = 0;
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 13) {
						int var130 = field135.method368();
						int var131 = field135.method369();
						ATOBWHST.method4(var130).field13 = 2;
						ATOBWHST.method4(var130).field14 = var131;
						field457 = -1;
						return true;
					}

					if (field457 == 54) {
						field364 = true;
						int var132 = field135.method342();
						ATOBWHST var133 = ATOBWHST.method4(var132);
						while (field135.field1091 < field456) {
							int var134 = field135.method354();
							int var135 = field135.method342();
							int var136 = field135.method340();
							if (var136 == 255) {
								var136 = field135.method345();
							}

							if (var134 >= 0 && var134 < var133.field57.length) {
								var133.field57[var134] = var135;
								var133.field3[var134] = var136;
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 10) {
						field123 = field135.method340();
						field364 = true;
						field457 = -1;
						return true;
					}

					if (field457 == 237) {
						int var137 = field135.method368();
						int var138 = field135.method342();

						if (field403 != -1) {
							method33(field403);
							field403 = -1;
							field548 = true;
						}

						if (field229 != -1) {
							method33(field229);
							field229 = -1;
							field420 = true;
						}

						if (field169 != -1) {
							method33(field169);
							field169 = -1;
						}

						if (field547 != var137) {
							method33(field547);
							field547 = var137;
						}

						if (field208 != var138) {
							method33(field208);
							field208 = var138;
						}

						if (field476 != 0) {
							field476 = 0;
							field548 = true;
						}

						field364 = true;
						field167 = true;
						field421 = false;
						field457 = -1;
						return true;
					}

					if (field457 == 195) {
						String var139 = field135.method347();
						int var140 = field135.method370();
						ATOBWHST.method4(var140).field29 = var139;

						if (field520[field472] == ATOBWHST.method4(var140).field8) {
							field364 = true;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 76) {
						method141();
						field457 = -1;
						return false;
					}

					if (field457 == 0) {
						field472 = field135.method359();
						field364 = true;
						field167 = true;
						field457 = -1;
						return true;
					}

					if (field457 == 107) {
						field371 = field135.method340();
						field331 = field135.method340();
						field181 = field135.method340();
						field310 = true;
						field548 = true;
						field457 = -1;
						return true;
					}

					if (field457 == 188) {
						int var141 = field135.method359();
						String var142 = field135.method347();
						int var143 = field135.method340();
						if (var141 >= 1 && var141 <= 5) {
							if (var142.equalsIgnoreCase("null")) {
								var142 = null;
							}

							field322[var141 - 1] = var142;
							field323[var141 - 1] = var143 == 0;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 254) {
						if (field472 == 12) {
							field364 = true;
						}

						field430 = field135.method343();
						field457 = -1;
						return true;
					}

					if (field457 == 72) {
						int var144 = field135.method369();
						int var145 = field135.method370();
						int var146 = var145 >> 10 & 0x1F;
						int var147 = var145 >> 5 & 0x1F;
						int var148 = var145 & 0x1F;
						ATOBWHST.method4(var144).field49 = (var148 << 3) + (var146 << 19) + (var147 << 11);
						field457 = -1;
						return true;
					}

					if (field457 == 120) {
						int var149 = field135.method369();
						int var150 = field135.method359();

						if (var149 == 0xFFFF) {
							var149 = -1;
						}

						if (field520[var150] != var149) {
							method33(field520[var150]);
							field520[var150] = var149;
						}

						field364 = true;
						field167 = true;
						field457 = -1;
						return true;
					}

					if (field457 == 168) {
						int var151 = field135.method370();
						int var152 = field135.method370();
						int var153 = field135.method342();

						if (var152 == 0xFFFF) {
							ATOBWHST.method4(var151).field13 = 0;
							field457 = -1;
							return true;
						}

						TGAGWNUA var154 = TGAGWNUA.method453(var152);
						ATOBWHST.method4(var151).field13 = 4;
						ATOBWHST.method4(var151).field14 = var152;
						ATOBWHST.method4(var151).field39 = var154.field1189;
						ATOBWHST.method4(var151).field40 = var154.field1190;
						ATOBWHST.method4(var151).field38 = var154.field1201 * 100 / var153;
						field457 = -1;
						return true;
					}

					if (field457 == 41) {
						if (field208 != -1) {
							method33(field208);
							field208 = -1;
							field364 = true;
							field167 = true;
						}

						if (field403 != -1) {
							method33(field403);
							field403 = -1;
							field548 = true;
						}

						if (field229 != -1) {
							method33(field229);
							field229 = -1;
							field420 = true;
						}

						if (field169 != -1) {
							method33(field169);
							field169 = -1;
						}

						if (field547 != -1) {
							method33(field547);
							field547 = -1;
						}

						if (field476 != 0) {
							field476 = 0;
							field548 = true;
						}

						field421 = false;
						field457 = -1;
						return true;
					}

					if (field457 == 177) {
						field504 = true;
						field358 = field135.method340();
						field359 = field135.method340();
						field360 = field135.method342();
						field361 = field135.method340();
						field362 = field135.method340();
						if (field362 >= 100) {
							int var155 = field358 * 128 + 64;
							int var156 = field359 * 128 + 64;
							int var157 = method66(field168, var156, var155) - field360;
							int var158 = var155 - field462;
							int var159 = var157 - field463;
							int var160 = var156 - field464;
							int var161 = (int) Math.sqrt(var158 * var158 + var160 * var160);
							field465 = (int) (Math.atan2(var159, var161) * 325.949D) & 0x7FF;
							field466 = (int) (Math.atan2(var158, var160) * -325.949D) & 0x7FF;

							if (field465 < 128) {
								field465 = 128;
							}

							if (field465 > 383) {
								field465 = 383;
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 34) {
						int var162 = field135.method342();
						int var163 = field135.method340();
						int var164 = field135.method342();
						if (var164 == 0xFFFF) {
							if (field219 < 50) {
								field500[field219] = (short) var162;
								field170[field219] = var163;
								field182[field219] = 0;
								field219++;
							}
						} else if (field386 && !field228 && field219 < 50) {
							field500[field219] = var162;
							field170[field219] = var163;
							field182[field219] = MFQVDWNR.field1017[var162] + var164;
							field219++;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 147) {
						field439 = field135.method360();
						field438 = field135.method360();

						while (field135.field1091 < field456) {
							int var165 = field135.method340();
							method19(field135, var165);
						}

						field457 = -1;
						return true;
					}

					if (field457 == 190) {
						int var166 = field135.method370();
						method49(var166);

						if (field208 != -1) {
							method33(field208);
							field208 = -1;
							field364 = true;
							field167 = true;
						}

						if (field403 != -1) {
							method33(field403);
							field403 = -1;
							field548 = true;
						}

						if (field229 != -1) {
							method33(field229);
							field229 = -1;
							field420 = true;
						}

						if (field169 != -1) {
							method33(field169);
							field169 = -1;
						}

						if (field547 != var166) {
							method33(field547);
							field547 = var166;
						}

						if (field476 != 0) {
							field476 = 0;
							field548 = true;
						}

						field421 = false;
						field457 = -1;
						return true;
					}

					if (field457 == 197) {
						long var167 = field135.method346();
						int var169 = field135.method345();
						int var170 = field135.method340();
						boolean var171 = false;
						for (int var172 = 0; var172 < 100; var172++) {
							if (field312[var172] == var169) {
								var171 = true;
								break;
							}
						}

						if (var170 <= 1) {
							for (int var173 = 0; var173 < field140; var173++) {
								if (field120[var173] == var167) {
									var171 = true;
									break;
								}
							}
						}

						if (!var171 && field543 == 0) {
							try {
								field312[field262] = var169;
								field262 = (field262 + 1) % 100;
								String var174 = GDVTWATR.method245(field456 - 13, field135);
								if (var170 != 3) {
									var174 = SQZXZVWD.method413(var174);
								}

								if (var170 == 2 || var170 == 3) {
									method102(var174, "@cr2@" + VUKQGAWR.method541(VUKQGAWR.method538(var167)), 7);
								} else if (var170 == 1) {
									method102(var174, "@cr1@" + VUKQGAWR.method541(VUKQGAWR.method538(var167)), 7);
								} else {
									method102(var174, VUKQGAWR.method541(VUKQGAWR.method538(var167)), 3);
								}
							} catch (Exception var189) {
								signlink.reporterror("cde1");
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 18) {
						int var176 = field135.method342();
						ATOBWHST var177 = ATOBWHST.method4(var176);
						for (int var178 = 0; var178 < var177.field57.length; var178++) {
							var177.field57[var178] = -1;
							var177.field57[var178] = 0;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 216) {
						for (int var179 = 0; var179 < field356.length; var179++) {
							if (field545[var179] != field356[var179]) {
								field356[var179] = field545[var179];
								method150(var179);
								field364 = true;
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 5) {
						int var180 = field135.method370();
						int var181 = field135.method371();
						int var182 = field135.method372();
						ATOBWHST var183 = ATOBWHST.method4(var180);
						var183.field16 = var182;
						var183.field59 = var181;
						field457 = -1;
						return true;
					}

					if (field457 == 125) {
						field504 = true;
						field346 = field135.method340();
						field347 = field135.method340();
						field348 = field135.method342();
						field349 = field135.method340();
						field350 = field135.method340();
						if (field350 >= 100) {
							field462 = field346 * 128 + 64;
							field464 = field347 * 128 + 64;
							field463 = method66(field168, field464, field462) - field348;
						}

						field457 = -1;
						return true;
					}

					if (field457 == 146) {
						field308 = field135.method340();
						field146 = field135.method342();
						field457 = -1;
						return true;
					}

					if (field457 == 194) {
						byte var184 = field135.method364();
						int var185 = field135.method369();
						field545[var185] = var184;

						if (field356[var185] != var184) {
							field356[var185] = var184;
							method150(var185);
							field364 = true;

							if (field401 != -1) {
								field548 = true;
							}
						}

						field457 = -1;
						return true;
					}

					if (field457 == 175) {
						field153 = false;
						field476 = 2;
						field117 = "";
						field548 = true;
						field457 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field457 + "," + field456 + " - " + field354 + "," + field355);
					method141();
					return true;
				}

				method123(field135, field456);
				field457 = -1;
				return true;
			}

			int var8 = field282;
			int var9 = field283;
			if (field457 == 52) {
				var8 = field135.method368();
				var9 = field135.method370();
				field544 = false;
			}

			if (field457 == 6) {
				var9 = field135.method370();
				var8 = field135.method342();
				field135.method350();

				for (int var10 = 0; var10 < 4; var10++) {
					for (int var11 = 0; var11 < 13; var11++) {
						for (int var12 = 0; var12 < 13; var12++) {
							int var13 = field135.method351(1);
							if (var13 == 1) {
								field467[var10][var11][var12] = field135.method351(26);
							} else {
								field467[var10][var11][var12] = -1;
							}
						}
					}
				}

				field135.method352();
				field544 = true;
			}

			if (field282 == var8 && field283 == var9 && field314 == 2) {
				field457 = -1;
				return true;
			}

			field282 = var8;
			field283 = var9;
			field365 = (field282 - 6) * 8;
			field366 = (field283 - 6) * 8;
			field531 = false;
			if ((field282 / 8 == 48 || field282 / 8 == 49) && field283 / 8 == 48) {
				field531 = true;
			}

			if (field282 / 8 == 48 && field283 / 8 == 148) {
				field531 = true;
			}

			field314 = 1;
			field546 = System.currentTimeMillis();
			method142(null, "Loading - please wait.");

			if (field457 == 52) {
				int var14 = 0;
				for (int var15 = (field282 - 6) / 8; var15 <= (field282 + 6) / 8; var15++) {
					for (int var16 = (field283 - 6) / 8; var16 <= (field283 + 6) / 8; var16++) {
						var14++;
					}
				}

				field523 = new byte[var14][];
				field284 = new byte[var14][];
				field446 = new int[var14];
				field447 = new int[var14];
				field448 = new int[var14];
				int var17 = 0;
				for (int var18 = (field282 - 6) / 8; var18 <= (field282 + 6) / 8; var18++) {
					for (int var19 = (field283 - 6) / 8; var19 <= (field283 + 6) / 8; var19++) {
						field446[var17] = (var18 << 8) + var19;

						if (field531 && (var19 == 49 || var19 == 149 || var19 == 147 || var18 == 50 || var18 == 49 && var19 == 47)) {
							field447[var17] = -1;
							field448[var17] = -1;
							var17++;
						} else {
							int var20 = field447[var17] = field239.method384(0, var18, var19);
							if (var20 != -1) {
								field239.method382(3, var20);
							}

							int var21 = field448[var17] = field239.method384(1, var18, var19);
							if (var21 != -1) {
								field239.method382(3, var21);
							}

							var17++;
						}
					}
				}
			}

			if (field457 == 6) {
				int var22 = 0;
				int[] var23 = new int[676];
				for (int var24 = 0; var24 < 4; var24++) {
					for (int var25 = 0; var25 < 13; var25++) {
						for (int var26 = 0; var26 < 13; var26++) {
							int var27 = field467[var24][var25][var26];
							if (var27 != -1) {
								int var28 = var27 >> 14 & 0x3FF;
								int var29 = var27 >> 3 & 0x7FF;
								int var30 = (var28 / 8 << 8) + var29 / 8;
								for (int var31 = 0; var31 < var22; var31++) {
									if (var23[var31] == var30) {
										var30 = -1;
										break;
									}
								}

								if (var30 != -1) {
									var23[var22++] = var30;
								}
							}
						}
					}
				}

				field523 = new byte[var22][];
				field284 = new byte[var22][];
				field446 = new int[var22];
				field447 = new int[var22];
				field448 = new int[var22];
				for (int var32 = 0; var32 < var22; var32++) {
					int var33 = field446[var32] = var23[var32];
					int var34 = var33 >> 8 & 0xFF;
					int var35 = var33 & 0xFF;
					int var36 = field447[var32] = field239.method384(0, var34, var35);
					if (var36 != -1) {
						field239.method382(3, var36);
					}

					int var37 = field448[var32] = field239.method384(1, var34, var35);
					if (var37 != -1) {
						field239.method382(3, var37);
					}
				}
			}

			int var38 = field365 - field367;
			int var39 = field366 - field368;
			field367 = field365;
			field368 = field366;

			for (int var40 = 0; var40 < 16384; var40++) {
				TBFTCCSF var41 = field242[var40];
				if (var41 != null) {
					for (int var42 = 0; var42 < 10; var42++) {
						var41.field1404[var42] -= var38;
						var41.field1405[var42] -= var39;
					}

					var41.field1396 -= var38 * 128;
					var41.field1397 -= var39 * 128;
				}
			}

			for (int var43 = 0; var43 < field422; var43++) {
				TPTANZXN var44 = field424[var43];
				if (var44 != null) {
					for (int var45 = 0; var45 < 10; var45++) {
						var44.field1404[var45] -= var38;
						var44.field1405[var45] -= var39;
					}

					var44.field1396 -= var38 * 128;
					var44.field1397 -= var39 * 128;
				}
			}

			field519 = true;
			byte var46 = 0;
			byte var47 = 104;
			byte var48 = 1;
			if (var38 < 0) {
				var46 = 103;
				var47 = -1;
				var48 = -1;
			}

			byte var49 = 0;
			byte var50 = 104;
			byte var51 = 1;
			if (var39 < 0) {
				var49 = 103;
				var50 = -1;
				var51 = -1;
			}

			for (int var52 = var46; var52 != var47; var52 += var48) {
				for (int var53 = var49; var53 != var50; var53 += var51) {
					int var54 = var38 + var52;
					int var55 = var39 + var53;
					for (int var56 = 0; var56 < 4; var56++) {
						if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
							field416[var56][var52][var53] = field416[var56][var54][var55];
						} else {
							field416[var56][var52][var53] = null;
						}
					}
				}
			}

			for (GWDACNJF var57 = (GWDACNJF) field273.method532(); var57 != null; var57 = (GWDACNJF) field273.method534()) {
				var57.field806 -= var38;
				var57.field807 -= var39;
				if (var57.field806 < 0 || var57.field807 < 0 || var57.field806 >= 104 || var57.field807 >= 104) {
					var57.method163();
				}
			}

			if (field486 != 0) {
				field486 -= var38;
				field487 -= var39;
			}

			field504 = false;
			field457 = -1;
			return true;
		} catch (IOException var190) {
			method60();
		} catch (Exception var191) {
			String var187 = "T2 - " + field457 + "," + field354 + "," + field355 + " - " + field456 + "," + (field128.field1404[0] + field365) + "," + (field128.field1405[0] + field366) + " - ";
			for (int var188 = 0; var188 < field456 && var188 < 50; var188++) {
				var187 = var187 + field135.field1090[var188] + ",";
			}

			signlink.reporterror(var187);
			method141();
		}

		return true;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method157() {
		field220 = new VEIVHFHZ(field119, "titlebox", 0);
		field221 = new VEIVHFHZ(field119, "titlebutton", 0);
		field454 = new VEIVHFHZ[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field454[var1] = new VEIVHFHZ(field119, "runes", var1);
		}

		field474 = new WQACZBNG(128, 265);
		field475 = new WQACZBNG(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field474.field1356[var2] = field190.field590[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field475.field1356[var3] = field191.field590[var3];
		}

		field275 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field275[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field275[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field275[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field275[var7 + 192] = 0xFFFFFF;
		}

		field276 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field276[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field276[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field276[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field276[var11 + 192] = 0xFFFFFF;
		}

		field277 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field277[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field277[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field277[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field277[var15 + 192] = 0xFFFFFF;
		}

		field274 = new int[256];
		field374 = new int[32768];
		field375 = new int[32768];
		method30(null);
		field521 = new int[32768];
		field522 = new int[32768];
		method55("Connecting to fileserver", 10);

		if (!field373) {
			field332 = true;
			field373 = true;
			method139(this, 2);
		}
	}

	@ObfuscatedName("client.b(BI)Ljava/lang/String;")
	public static final String method158(int arg0) {
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

	@ObfuscatedName("client.M(I)V")
	public final void method159() {
		if (field482 == 0) {
			field205[0] = "Cancel";
			field165[0] = 1718;
			field249 = 1;
			if (field229 == -1) {
				method97();
				field321 = 0;
				field455 = 0;

				if (field843 > 4 && field844 > 4 && field843 < 516 && field844 < 338) {
					if (field547 == -1) {
						method62();
					} else {
						method109(field844, ATOBWHST.method4(field547), 0, 4, 4, 0, field843);
					}
				}

				if (field321 != field299) {
					field299 = field321;
				}

				if (field455 != field340) {
					field340 = field455;
				}

				field321 = 0;
				field455 = 0;

				if (field843 > 553 && field844 > 205 && field843 < 743 && field844 < 466) {
					if (field208 != -1) {
						method109(field844, ATOBWHST.method4(field208), 0, 205, 553, 1, field843);
					} else if (field520[field472] != -1) {
						method109(field844, ATOBWHST.method4(field520[field472]), 0, 205, 553, 1, field843);
					}
				}

				if (field321 != field139) {
					field364 = true;
					field139 = field321;
				}

				if (field455 != field142) {
					field364 = true;
					field142 = field455;
				}

				field321 = 0;
				field455 = 0;

				if (field843 > 17 && field844 > 357 && field843 < 496 && field844 < 453) {
					if (field403 != -1) {
						method109(field844, ATOBWHST.method4(field403), 0, 357, 17, 2, field843);
					} else if (field401 != -1) {
						method109(field844, ATOBWHST.method4(field401), 0, 357, 17, 3, field843);
					} else if (field844 < 434 && field843 < 426 && field476 == 0) {
						method87(field843 - 17, field844 - 357);
					}
				}

				if ((field403 != -1 || field401 != -1) && field392 != field321) {
					field548 = true;
					field392 = field321;
				}

				if ((field403 != -1 || field401 != -1) && field455 != field255) {
					field548 = true;
					field255 = field455;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field249 - 1; var2++) {
						if (field165[var2] < 1000 && field165[var2 + 1] > 1000) {
							String var3 = field205[var2];
							field205[var2] = field205[var2 + 1];
							field205[var2 + 1] = var3;
							int var4 = field165[var2];
							field165[var2] = field165[var2 + 1];
							field165[var2 + 1] = var4;
							int var5 = field163[var2];
							field163[var2] = field163[var2 + 1];
							field163[var2 + 1] = var5;
							int var6 = field164[var2];
							field164[var2] = field164[var2 + 1];
							field164[var2 + 1] = var6;
							int var7 = field166[var2];
							field166[var2] = field166[var2 + 1];
							field166[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field321 = 0;
				field455 = 0;
				method109(field844, ATOBWHST.method4(field229), 0, 0, 0, 0, field843);

				if (field321 != field299) {
					field299 = field321;
				}

				if (field455 != field340) {
					field340 = field455;
				}
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method160() {
		method161();

		if (field259 == 1) {
			field141[field258 / 100].method548(field257 - 8 - 4, field256 - 8 - 4);
		}

		if (field259 == 2) {
			field141[field258 / 100 + 4].method548(field257 - 8 - 4, field256 - 8 - 4);
			field196++;
			if (field196 > 140) {
				field196 = 0;
				field125.method329(122);
				field125.method334(0);
			}
		}

		if (field126 != -1) {
			method100(field230, field126);
			method47(0, ATOBWHST.method4(field126), 0, 0);
		}

		if (field547 != -1) {
			method100(field230, field547);
			method47(0, ATOBWHST.method4(field547), 0, 0);
		}

		method26();

		if (!field159) {
			method159();
			method111();
		} else if (field300 == 0) {
			method107();
		}

		if (field540 == 1) {
			field449.method548(296, 472);
		}

		if (field268) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field831 < 30 && field228) {
				var3 = 0xFF0000;
			}

			if (field831 < 20 && !field228) {
				var3 = 0xFF0000;
			}

			field211.method585(var3, var1, "Fps:" + field831, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field228) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field228) {
				int var8 = 0xFF0000;
			}

			field211.method585(0xFFFF00, var1, "Mem:" + var5 + "k", var2);
			var2 += 15;
		}

		if (field477 != 0) {
			int var9 = field477 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field211.method590("System update in: " + var10 + ":0" + var9, 329, 0xFFFF00, 4);
			} else {
				field211.method590("System update in: " + var10 + ":" + var9, 329, 0xFFFF00, 4);
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method161() {
		if (field278 != 0) {
			ZFUOSNLM var1 = field211;
			int var2 = 0;
			if (field477 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field385[var3] != null) {
					int var4 = field383[var3];
					String var5 = field384[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field331 == 0 || field331 == 1 && method137(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method590("From", var7, 0, var8);
						var1.method590("From", var7 - 1, 0xFFFF, var8);
						int var11 = var8 + var1.method588("From ");
						if (var6 == 1) {
							field156[0].method527(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field156[1].method527(var7 - 12, var11);
							var11 += 14;
						}

						var1.method590(var5 + ": " + field385[var3], var7, 0, var11);
						var1.method590(var5 + ": " + field385[var3], var7 - 1, 0xFFFF, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field331 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method590(field385[var3], var9, 0, 4);
						var1.method590(field385[var3], var9 - 1, 0xFFFF, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field331 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method590("To " + var5 + ": " + field385[var3], var10, 0, 4);
						var1.method590("To " + var5 + ": " + field385[var3], var10 - 1, 0xFFFF, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method162(int arg0) {
		int[] var2 = field488.field1356;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field503[arg0][var7][var5] & 0x18) == 0) {
					field405.method506(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field503[arg0 + 1][var7][var5] & 0x8) != 0) {
					field405.method506(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field488.method543();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field503[arg0][var11][var10] & 0x18) == 0) {
					method98(var11, var9, var8, var10, arg0);
				}

				if (arg0 < 3 && (field503[arg0 + 1][var11][var10] & 0x8) != 0) {
					method98(var11, var9, var8, var10, arg0 + 1);
				}
			}
		}

		if (field291 != null) {
			field291.method186();
			ORCVJTAI.field1070 = field390;
		}

		field231 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field405.method500(field168, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = ELXAMLNA.method196(var14).field627;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field238[field168].field678;
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

						field414[field231] = field413[var15];
						field232[field231] = var16;
						field233[field231] = var17;
						field231++;
					}
				}
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field204[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field440[var3] = var2 / 4;
		}
	}
}
