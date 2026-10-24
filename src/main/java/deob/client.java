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
public final class client extends ITJBTECW {

	@ObfuscatedName("client.N")
	public boolean field97 = false;

	@ObfuscatedName("client.O")
	public int[][][] field98 = new int[4][13][13];

	@ObfuscatedName("client.R")
	public int[] field99 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.S")
	public long[] field100 = new long[200];

	@ObfuscatedName("client.eb")
	public int[] field112 = new int[200];

	@ObfuscatedName("client.fb")
	public int[] field113 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.gb")
	public CRC32 field114 = new CRC32();

	@ObfuscatedName("client.qb")
	public int field122 = 1;

	@ObfuscatedName("client.ub")
	public int field125 = -1;

	@ObfuscatedName("client.vb")
	public int field126 = 0x4D4233;

	@ObfuscatedName("client.Bb")
	public String field131 = "";

	@ObfuscatedName("client.Gb")
	public int field135 = -1;

	@ObfuscatedName("client.Jb")
	public boolean field137 = false;

	@ObfuscatedName("client.Mb")
	public int[] field140 = new int[2000];

	@ObfuscatedName("client.Nb")
	public int[] field141 = new int[50];

	@ObfuscatedName("client.Sb")
	public int field146 = 0x332D25;

	@ObfuscatedName("client.Tb")
	public int[][] field147 = new int[104][104];

	@ObfuscatedName("client.Yb")
	public boolean[] field151 = new boolean[5];

	@ObfuscatedName("client.ac")
	public int[] field153 = new int[1000];

	@ObfuscatedName("client.gc")
	public int[] field159 = new int[50];

	@ObfuscatedName("client.vc")
	public String[] field173 = new String[5];

	@ObfuscatedName("client.wc")
	public boolean[] field174 = new boolean[5];

	@ObfuscatedName("client.Oc")
	public boolean field191 = false;

	@ObfuscatedName("client.Qc")
	public String field193 = "";

	@ObfuscatedName("client.Xc")
	public int[] field200 = new int[4000];

	@ObfuscatedName("client.Yc")
	public int[] field201 = new int[4000];

	@ObfuscatedName("client.nd")
	public int field212 = -1;

	@ObfuscatedName("client.od")
	public boolean field213 = false;

	@ObfuscatedName("client.qd")
	public int[] field215 = new int[5];

	@ObfuscatedName("client.rd")
	public boolean field216 = false;

	@ObfuscatedName("client.zd")
	public int field223 = -1;

	@ObfuscatedName("client.Bd")
	public int field225 = -1;

	@ObfuscatedName("client.Cd")
	public boolean field226 = false;

	@ObfuscatedName("client.Dd")
	public boolean field227 = false;

	@ObfuscatedName("client.Gd")
	public int[] field229 = new int[50];

	@ObfuscatedName("client.Hd")
	public boolean field230 = false;

	@ObfuscatedName("client.Jd")
	public int field232 = 50;

	@ObfuscatedName("client.Kd")
	public int[] field233 = new int[field232];

	@ObfuscatedName("client.Ld")
	public int[] field234 = new int[field232];

	@ObfuscatedName("client.Md")
	public int[] field235 = new int[field232];

	@ObfuscatedName("client.Nd")
	public int[] field236 = new int[field232];

	@ObfuscatedName("client.Od")
	public int[] field237 = new int[field232];

	@ObfuscatedName("client.Pd")
	public int[] field238 = new int[field232];

	@ObfuscatedName("client.Qd")
	public int[] field239 = new int[field232];

	@ObfuscatedName("client.Rd")
	public String[] field240 = new String[field232];

	@ObfuscatedName("client.Xd")
	public int field246 = -1;

	@ObfuscatedName("client.Yd")
	public TAIXVIBM[] field247 = new TAIXVIBM[2];

	@ObfuscatedName("client.be")
	public boolean field250 = false;

	@ObfuscatedName("client.pe")
	public YSGENUJE field261 = new YSGENUJE();

	@ObfuscatedName("client.re")
	public ZOMNSJJM field263 = ZOMNSJJM.method535(1);

	@ObfuscatedName("client.te")
	public int[] field264 = new int[7];

	@ObfuscatedName("client.ve")
	public LXRBRCRX[] field266 = new LXRBRCRX[20];

	@ObfuscatedName("client.we")
	public boolean field267 = false;

	@ObfuscatedName("client.xe")
	public int[] field268 = new int[100];

	@ObfuscatedName("client.ye")
	public String[] field269 = new String[100];

	@ObfuscatedName("client.ze")
	public String[] field270 = new String[100];

	@ObfuscatedName("client.Ee")
	public boolean field274 = false;

	@ObfuscatedName("client.Fe")
	public NXLHMSCV[] field275 = new NXLHMSCV[4];

	@ObfuscatedName("client.Ge")
	public long[] field276 = new long[100];

	@ObfuscatedName("client.Me")
	public int[] field282 = new int[TPWPPNUN.field1263];

	@ObfuscatedName("client.Oe")
	public int field284 = 2;

	@ObfuscatedName("client.af")
	public boolean field296 = true;

	@ObfuscatedName("client.ff")
	public int[] field301 = new int[1000];

	@ObfuscatedName("client.gf")
	public int[] field302 = new int[1000];

	@ObfuscatedName("client.nf")
	public boolean field305 = false;

	@ObfuscatedName("client.of")
	public int field306 = 128;

	@ObfuscatedName("client.uf")
	public String field312 = "";

	@ObfuscatedName("client.vf")
	public int[] field313 = new int[256];

	@ObfuscatedName("client.wf")
	public LXRBRCRX[] field314 = new LXRBRCRX[20];

	@ObfuscatedName("client.xf")
	public boolean field315 = true;

	@ObfuscatedName("client.yf")
	public int field316 = -1;

	@ObfuscatedName("client.Af")
	public String field317 = "";

	@ObfuscatedName("client.Bf")
	public String field318 = "";

	@ObfuscatedName("client.Df")
	public ZOMNSJJM field319 = ZOMNSJJM.method535(1);

	@ObfuscatedName("client.Hf")
	public int field321 = 0x23201B;

	@ObfuscatedName("client.If")
	public final int field322 = 100;

	@ObfuscatedName("client.Jf")
	public int[] field323 = new int[100];

	@ObfuscatedName("client.Pf")
	public int field329 = -1;

	@ObfuscatedName("client.Rf")
	public int field331 = 1;

	@ObfuscatedName("client.ag")
	public byte[] field340 = new byte[16384];

	@ObfuscatedName("client.bg")
	public String[] field341 = new String[200];

	@ObfuscatedName("client.dg")
	public int field343 = -1;

	@ObfuscatedName("client.eg")
	public int[] field344 = new int[5];

	@ObfuscatedName("client.fg")
	public int[] field345 = new int[TPWPPNUN.field1263];

	@ObfuscatedName("client.hg")
	public int field347 = 2;

	@ObfuscatedName("client.pg")
	public LXRBRCRX[] field354 = new LXRBRCRX[8];

	@ObfuscatedName("client.rg")
	public int field356 = 0x766654;

	@ObfuscatedName("client.yg")
	public boolean field362 = false;

	@ObfuscatedName("client.zg")
	public int[] field363 = new int[33];

	@ObfuscatedName("client.Ag")
	public int field364 = -1;

	@ObfuscatedName("client.Cg")
	public YSGENUJE field366 = new YSGENUJE();

	@ObfuscatedName("client.Dg")
	public int[] field367 = new int[500];

	@ObfuscatedName("client.Eg")
	public int[] field368 = new int[500];

	@ObfuscatedName("client.Fg")
	public int[] field369 = new int[500];

	@ObfuscatedName("client.Gg")
	public int[] field370 = new int[500];

	@ObfuscatedName("client.Ig")
	public int[] field372 = new int[9];

	@ObfuscatedName("client.Kg")
	public YSGENUJE field373 = new YSGENUJE();

	@ObfuscatedName("client.Sg")
	public boolean field381 = true;

	@ObfuscatedName("client.Tg")
	public boolean field382 = false;

	@ObfuscatedName("client.Wg")
	public boolean field385 = false;

	@ObfuscatedName("client.Xg")
	public boolean field386 = false;

	@ObfuscatedName("client.Zg")
	public TAIXVIBM[] field387 = new TAIXVIBM[100];

	@ObfuscatedName("client.kh")
	public volatile boolean field398 = false;

	@ObfuscatedName("client.ph")
	public int field402 = 78;

	@ObfuscatedName("client.uh")
	public String[] field406 = new String[500];

	@ObfuscatedName("client.yh")
	public int field410 = -1;

	@ObfuscatedName("client.zh")
	public int field411 = -1;

	@ObfuscatedName("client.Ah")
	public TGFFTNFO[] field412 = new TGFFTNFO[5];

	@ObfuscatedName("client.Jh")
	public boolean field421 = false;

	@ObfuscatedName("client.Lh")
	public int field422 = -1;

	@ObfuscatedName("client.Oh")
	public CPNGZAUN field424 = new CPNGZAUN();

	@ObfuscatedName("client.Sh")
	public boolean field427 = true;

	@ObfuscatedName("client.Th")
	public boolean field428 = false;

	@ObfuscatedName("client.Vh")
	public int[][] field430 = new int[104][104];

	@ObfuscatedName("client.Wh")
	public String field431 = "";

	@ObfuscatedName("client.Xh")
	public String field432 = "";

	@ObfuscatedName("client.ai")
	public TAIXVIBM[] field434 = new TAIXVIBM[13];

	@ObfuscatedName("client.hi")
	public int field439 = 2048;

	@ObfuscatedName("client.ii")
	public int field440 = 2047;

	@ObfuscatedName("client.ji")
	public QIVQUKBA[] field441 = new QIVQUKBA[field439];

	@ObfuscatedName("client.li")
	public int[] field443 = new int[field439];

	@ObfuscatedName("client.ni")
	public int[] field445 = new int[field439];

	@ObfuscatedName("client.oi")
	public ZOMNSJJM[] field446 = new ZOMNSJJM[field439];

	@ObfuscatedName("client.xi")
	public LXRBRCRX[] field453 = new LXRBRCRX[1000];

	@ObfuscatedName("client.zi")
	public volatile boolean field455 = false;

	@ObfuscatedName("client.Ai")
	public boolean field456 = true;

	@ObfuscatedName("client.Fi")
	public int field461 = 2;

	@ObfuscatedName("client.Gi")
	public int field462 = -1;

	@ObfuscatedName("client.Hi")
	public int[] field463 = new int[33];

	@ObfuscatedName("client.Ji")
	public int[][] field464 = new int[104][104];

	@ObfuscatedName("client.Ki")
	public volatile boolean field465 = false;

	@ObfuscatedName("client.Qi")
	public boolean field471 = false;

	@ObfuscatedName("client.Wi")
	public int[] field476 = new int[2000];

	@ObfuscatedName("client.Yi")
	public int[] field478 = new int[151];

	@ObfuscatedName("client.Zi")
	public String field479 = "";

	@ObfuscatedName("client.aj")
	public LXRBRCRX[] field480 = new LXRBRCRX[100];

	@ObfuscatedName("client.bj")
	public boolean field481 = false;

	@ObfuscatedName("client.dj")
	public final int[] field483 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.mj")
	public int field492 = 3;

	@ObfuscatedName("client.oj")
	public int[] field494 = new int[5];

	@ObfuscatedName("client.sj")
	public ZOMNSJJM field498 = ZOMNSJJM.method535(1);

	@ObfuscatedName("client.tj")
	public ZOMNSJJM field499 = new ZOMNSJJM(new byte[5000]);

	@ObfuscatedName("client.uj")
	public TEBIXSCV[] field500 = new TEBIXSCV[16384];

	@ObfuscatedName("client.wj")
	public int[] field502 = new int[16384];

	@ObfuscatedName("client.xj")
	public int[] field503 = new int[151];

	@ObfuscatedName("client.Dj")
	public boolean field506 = false;

	@ObfuscatedName("client.Ej")
	public int[] field507 = new int[5];

	@ObfuscatedName("client.Gj")
	public int[] field509 = new int[5];

	@ObfuscatedName("client.Kj")
	public int[] field513 = new int[TPWPPNUN.field1263];

	@ObfuscatedName("client.Lj")
	public boolean field514 = false;

	@ObfuscatedName("client.Mj")
	public YSGENUJE[][][] field515 = new YSGENUJE[4][104][104];

	@ObfuscatedName("client.Oj")
	public String field517 = "";

	@ObfuscatedName("client.hd")
	public static final int[][] field208 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.jd")
	public static String field209 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.kf")
	public static int[] field303 = new int[99];

	@ObfuscatedName("client.Mf")
	public static BigInteger field326 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.lg")
	public static int field350 = 10;

	@ObfuscatedName("client.ng")
	public static boolean field352 = true;

	@ObfuscatedName("client.Bg")
	public static int[] field365 = new int[32];

	@ObfuscatedName("client.sh")
	public static BigInteger field405 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Ti")
	public static final int[] field473 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.jb")
	public int field115;

	@ObfuscatedName("client.kb")
	public int field116;

	@ObfuscatedName("client.lb")
	public int field117;

	@ObfuscatedName("client.mb")
	public int field118;

	@ObfuscatedName("client.nb")
	public int field119;

	@ObfuscatedName("client.ob")
	public int field120;

	@ObfuscatedName("client.pb")
	public int field121;

	@ObfuscatedName("client.Kb")
	public int field138;

	@ObfuscatedName("client.Lb")
	public int field139;

	@ObfuscatedName("client.Rb")
	public int field145;

	@ObfuscatedName("client.Ub")
	public static int field148;

	@ObfuscatedName("client.Wb")
	public static int field149;

	@ObfuscatedName("client.Xb")
	public int field150;

	@ObfuscatedName("client.Zb")
	public int field152;

	@ObfuscatedName("client.hc")
	public int field160;

	@ObfuscatedName("client.oc")
	public int field167;

	@ObfuscatedName("client.pc")
	public int field168;

	@ObfuscatedName("client.qc")
	public int field169;

	@ObfuscatedName("client.rc")
	public int field170;

	@ObfuscatedName("client.sc")
	public int field171;

	@ObfuscatedName("client.uc")
	public static int field172;

	@ObfuscatedName("client.xc")
	public int field175;

	@ObfuscatedName("client.yc")
	public int field176;

	@ObfuscatedName("client.zc")
	public int field177;

	@ObfuscatedName("client.Ac")
	public int field178;

	@ObfuscatedName("client.Bc")
	public int field179;

	@ObfuscatedName("client.Cc")
	public int field180;

	@ObfuscatedName("client.Jc")
	public int field186;

	@ObfuscatedName("client.Kc")
	public int field187;

	@ObfuscatedName("client.Nc")
	public int field190;

	@ObfuscatedName("client.Rc")
	public int field194;

	@ObfuscatedName("client.Sc")
	public int field195;

	@ObfuscatedName("client.Tc")
	public int field196;

	@ObfuscatedName("client.Uc")
	public int field197;

	@ObfuscatedName("client.Vc")
	public int field198;

	@ObfuscatedName("client.Wc")
	public int field199;

	@ObfuscatedName("client.ad")
	public int field203;

	@ObfuscatedName("client.bd")
	public int field204;

	@ObfuscatedName("client.ed")
	public int field205;

	@ObfuscatedName("client.fd")
	public int field206;

	@ObfuscatedName("client.gd")
	public int field207;

	@ObfuscatedName("client.md")
	public static int field211;

	@ObfuscatedName("client.pd")
	public static int field214;

	@ObfuscatedName("client.sd")
	public int field217;

	@ObfuscatedName("client.td")
	public int field218;

	@ObfuscatedName("client.ud")
	public int field219;

	@ObfuscatedName("client.yd")
	public int field222;

	@ObfuscatedName("client.Ad")
	public static int field224;

	@ObfuscatedName("client.Ed")
	public int field228;

	@ObfuscatedName("client.Id")
	public int field231;

	@ObfuscatedName("client.Sd")
	public int field241;

	@ObfuscatedName("client.Td")
	public int field242;

	@ObfuscatedName("client.Ud")
	public int field243;

	@ObfuscatedName("client.Vd")
	public int field244;

	@ObfuscatedName("client.Wd")
	public int field245;

	@ObfuscatedName("client.Zd")
	public int field248;

	@ObfuscatedName("client.ce")
	public static int field251;

	@ObfuscatedName("client.he")
	public int field256;

	@ObfuscatedName("client.ie")
	public static int field257;

	@ObfuscatedName("client.je")
	public int field258;

	@ObfuscatedName("client.ne")
	public int field259;

	@ObfuscatedName("client.ue")
	public static int field265;

	@ObfuscatedName("client.Be")
	public int field271;

	@ObfuscatedName("client.Ce")
	public int field272;

	@ObfuscatedName("client.De")
	public int field273;

	@ObfuscatedName("client.He")
	public int field277;

	@ObfuscatedName("client.Ie")
	public int field278;

	@ObfuscatedName("client.Je")
	public int field279;

	@ObfuscatedName("client.Le")
	public int field281;

	@ObfuscatedName("client.Ne")
	public int field283;

	@ObfuscatedName("client.Pe")
	public int field285;

	@ObfuscatedName("client.Ze")
	public int field295;

	@ObfuscatedName("client.ef")
	public int field300;

	@ObfuscatedName("client.lf")
	public int field304;

	@ObfuscatedName("client.pf")
	public int field307;

	@ObfuscatedName("client.qf")
	public int field308;

	@ObfuscatedName("client.rf")
	public int field309;

	@ObfuscatedName("client.sf")
	public static int field310;

	@ObfuscatedName("client.tf")
	public int field311;

	@ObfuscatedName("client.Ef")
	public static int field320;

	@ObfuscatedName("client.Kf")
	public static int field324;

	@ObfuscatedName("client.Qf")
	public int field330;

	@ObfuscatedName("client.Sf")
	public int field332;

	@ObfuscatedName("client.Tf")
	public int field333;

	@ObfuscatedName("client.Uf")
	public int field334;

	@ObfuscatedName("client.Vf")
	public int field335;

	@ObfuscatedName("client.Wf")
	public int field336;

	@ObfuscatedName("client.Yf")
	public int field338;

	@ObfuscatedName("client.cg")
	public int field342;

	@ObfuscatedName("client.gg")
	public int field346;

	@ObfuscatedName("client.jg")
	public int field348;

	@ObfuscatedName("client.kg")
	public static int field349;

	@ObfuscatedName("client.mg")
	public static int field351;

	@ObfuscatedName("client.Hg")
	public int field371;

	@ObfuscatedName("client.Lg")
	public int field374;

	@ObfuscatedName("client.Mg")
	public int field375;

	@ObfuscatedName("client.Ng")
	public int field376;

	@ObfuscatedName("client.Og")
	public int field377;

	@ObfuscatedName("client.Pg")
	public int field378;

	@ObfuscatedName("client.Qg")
	public int field379;

	@ObfuscatedName("client.Rg")
	public int field380;

	@ObfuscatedName("client.Ug")
	public int field383;

	@ObfuscatedName("client.Vg")
	public int field384;

	@ObfuscatedName("client.ah")
	public int field388;

	@ObfuscatedName("client.bh")
	public int field389;

	@ObfuscatedName("client.ch")
	public int field390;

	@ObfuscatedName("client.dh")
	public int field391;

	@ObfuscatedName("client.eh")
	public int field392;

	@ObfuscatedName("client.fh")
	public int field393;

	@ObfuscatedName("client.gh")
	public int field394;

	@ObfuscatedName("client.hh")
	public int field395;

	@ObfuscatedName("client.ih")
	public int field396;

	@ObfuscatedName("client.jh")
	public int field397;

	@ObfuscatedName("client.lh")
	public static int field399;

	@ObfuscatedName("client.nh")
	public static int field400;

	@ObfuscatedName("client.rh")
	public int field404;

	@ObfuscatedName("client.Bh")
	public int field413;

	@ObfuscatedName("client.Ch")
	public int field414;

	@ObfuscatedName("client.Dh")
	public int field415;

	@ObfuscatedName("client.Eh")
	public int field416;

	@ObfuscatedName("client.Fh")
	public int field417;

	@ObfuscatedName("client.Gh")
	public int field418;

	@ObfuscatedName("client.Hh")
	public int field419;

	@ObfuscatedName("client.Nh")
	public int field423;

	@ObfuscatedName("client.Ph")
	public int field425;

	@ObfuscatedName("client.Qh")
	public int field426;

	@ObfuscatedName("client.Uh")
	public int field429;

	@ObfuscatedName("client.bi")
	public int field435;

	@ObfuscatedName("client.ci")
	public int field436;

	@ObfuscatedName("client.di")
	public int field437;

	@ObfuscatedName("client.ki")
	public int field442;

	@ObfuscatedName("client.mi")
	public int field444;

	@ObfuscatedName("client.qi")
	public int field448;

	@ObfuscatedName("client.yi")
	public int field454;

	@ObfuscatedName("client.Ei")
	public int field460;

	@ObfuscatedName("client.Li")
	public int field466;

	@ObfuscatedName("client.Mi")
	public int field467;

	@ObfuscatedName("client.Ni")
	public int field468;

	@ObfuscatedName("client.Oi")
	public int field469;

	@ObfuscatedName("client.Si")
	public int field472;

	@ObfuscatedName("client.Ui")
	public static int field474;

	@ObfuscatedName("client.Vi")
	public int field475;

	@ObfuscatedName("client.Xi")
	public int field477;

	@ObfuscatedName("client.cj")
	public int field482;

	@ObfuscatedName("client.gj")
	public int field486;

	@ObfuscatedName("client.hj")
	public int field487;

	@ObfuscatedName("client.ij")
	public int field488;

	@ObfuscatedName("client.kj")
	public int field490;

	@ObfuscatedName("client.lj")
	public int field491;

	@ObfuscatedName("client.nj")
	public int field493;

	@ObfuscatedName("client.qj")
	public int field496;

	@ObfuscatedName("client.rj")
	public int field497;

	@ObfuscatedName("client.vj")
	public int field501;

	@ObfuscatedName("client.Cj")
	public int field505;

	@ObfuscatedName("client.Fj")
	public static int field508;

	@ObfuscatedName("client.Jj")
	public static int field512;

	@ObfuscatedName("client.Nj")
	public int field516;

	@ObfuscatedName("client.Rj")
	public int field518;

	@ObfuscatedName("client.Sj")
	public int field519;

	@ObfuscatedName("client.Tj")
	public int field520;

	@ObfuscatedName("client.Uj")
	public int field521;

	@ObfuscatedName("client.Vj")
	public int field522;

	@ObfuscatedName("client.Hb")
	public long field136;

	@ObfuscatedName("client.kd")
	public long field210;

	@ObfuscatedName("client.Zf")
	public long field339;

	@ObfuscatedName("client.qg")
	public long field355;

	@ObfuscatedName("client.Zh")
	public long field433;

	@ObfuscatedName("client.Pc")
	public BJGZFSFX field192;

	@ObfuscatedName("client.U")
	public ECAKBTRA field102;

	@ObfuscatedName("client.V")
	public ECAKBTRA field103;

	@ObfuscatedName("client.W")
	public ECAKBTRA field104;

	@ObfuscatedName("client.X")
	public ECAKBTRA field105;

	@ObfuscatedName("client.Y")
	public ECAKBTRA field106;

	@ObfuscatedName("client.Z")
	public ECAKBTRA field107;

	@ObfuscatedName("client.ab")
	public ECAKBTRA field108;

	@ObfuscatedName("client.bb")
	public ECAKBTRA field109;

	@ObfuscatedName("client.cb")
	public ECAKBTRA field110;

	@ObfuscatedName("client.wb")
	public ECAKBTRA field127;

	@ObfuscatedName("client.xb")
	public ECAKBTRA field128;

	@ObfuscatedName("client.yb")
	public ECAKBTRA field129;

	@ObfuscatedName("client.zb")
	public ECAKBTRA field130;

	@ObfuscatedName("client.Qe")
	public ECAKBTRA field286;

	@ObfuscatedName("client.Re")
	public ECAKBTRA field287;

	@ObfuscatedName("client.Se")
	public ECAKBTRA field288;

	@ObfuscatedName("client.Te")
	public ECAKBTRA field289;

	@ObfuscatedName("client.Ue")
	public ECAKBTRA field290;

	@ObfuscatedName("client.Ve")
	public ECAKBTRA field291;

	@ObfuscatedName("client.We")
	public ECAKBTRA field292;

	@ObfuscatedName("client.Xe")
	public ECAKBTRA field293;

	@ObfuscatedName("client.Ye")
	public ECAKBTRA field294;

	@ObfuscatedName("client.Bi")
	public ECAKBTRA field457;

	@ObfuscatedName("client.Ci")
	public ECAKBTRA field458;

	@ObfuscatedName("client.Di")
	public ECAKBTRA field459;

	@ObfuscatedName("client.wg")
	public HFNJDDXC field361;

	@ObfuscatedName("client.ri")
	public JQUNTFOC field449;

	@ObfuscatedName("client.si")
	public JQUNTFOC field450;

	@ObfuscatedName("client.ti")
	public JQUNTFOC field451;

	@ObfuscatedName("client.ui")
	public JQUNTFOC field452;

	@ObfuscatedName("client.Ob")
	public LXRBRCRX field142;

	@ObfuscatedName("client.Pb")
	public LXRBRCRX field143;

	@ObfuscatedName("client.bc")
	public LXRBRCRX field154;

	@ObfuscatedName("client.cc")
	public LXRBRCRX field155;

	@ObfuscatedName("client.dc")
	public LXRBRCRX field156;

	@ObfuscatedName("client.ec")
	public LXRBRCRX field157;

	@ObfuscatedName("client.fc")
	public LXRBRCRX field158;

	@ObfuscatedName("client.Zc")
	public LXRBRCRX field202;

	@ObfuscatedName("client.wd")
	public LXRBRCRX field220;

	@ObfuscatedName("client.xd")
	public LXRBRCRX field221;

	@ObfuscatedName("client.qe")
	public LXRBRCRX field262;

	@ObfuscatedName("client.Ih")
	public LXRBRCRX field420;

	@ObfuscatedName("client.ej")
	public LXRBRCRX field484;

	@ObfuscatedName("client.fj")
	public LXRBRCRX field485;

	@ObfuscatedName("client.db")
	public LYZBHNJP field111;

	@ObfuscatedName("client.jj")
	public NCUAQOFM field489;

	@ObfuscatedName("client.qh")
	public static QIVQUKBA field403;

	@ObfuscatedName("client.ei")
	public SMQPXRFY field438;

	@ObfuscatedName("client.Db")
	public TAIXVIBM field132;

	@ObfuscatedName("client.Eb")
	public TAIXVIBM field133;

	@ObfuscatedName("client.Fb")
	public TAIXVIBM field134;

	@ObfuscatedName("client.jc")
	public TAIXVIBM field162;

	@ObfuscatedName("client.kc")
	public TAIXVIBM field163;

	@ObfuscatedName("client.lc")
	public TAIXVIBM field164;

	@ObfuscatedName("client.mc")
	public TAIXVIBM field165;

	@ObfuscatedName("client.nc")
	public TAIXVIBM field166;

	@ObfuscatedName("client.Ec")
	public TAIXVIBM field181;

	@ObfuscatedName("client.Fc")
	public TAIXVIBM field182;

	@ObfuscatedName("client.Gc")
	public TAIXVIBM field183;

	@ObfuscatedName("client.Hc")
	public TAIXVIBM field184;

	@ObfuscatedName("client.Ic")
	public TAIXVIBM field185;

	@ObfuscatedName("client.Lc")
	public TAIXVIBM field188;

	@ObfuscatedName("client.Mc")
	public TAIXVIBM field189;

	@ObfuscatedName("client.vh")
	public TAIXVIBM field407;

	@ObfuscatedName("client.wh")
	public TAIXVIBM field408;

	@ObfuscatedName("client.xh")
	public TAIXVIBM field409;

	@ObfuscatedName("client.Hj")
	public TAIXVIBM field510;

	@ObfuscatedName("client.Ij")
	public TAIXVIBM field511;

	@ObfuscatedName("client.Aj")
	public ZQADNJCF field504;

	@ObfuscatedName("client.ae")
	public String field249;

	@ObfuscatedName("client.ge")
	public String field255;

	@ObfuscatedName("client.Ke")
	public String field280;

	@ObfuscatedName("client.Pi")
	public String field470;

	@ObfuscatedName("client.Xf")
	public Socket field337;

	@ObfuscatedName("client.T")
	public static boolean field101;

	@ObfuscatedName("client.Lf")
	public static boolean field325;

	@ObfuscatedName("client.og")
	public static boolean field353;

	@ObfuscatedName("client.pi")
	public static boolean field447;

	@ObfuscatedName("client.sb")
	public int[] field123;

	@ObfuscatedName("client.tb")
	public int[] field124;

	@ObfuscatedName("client.de")
	public int[] field252;

	@ObfuscatedName("client.ee")
	public int[] field253;

	@ObfuscatedName("client.fe")
	public int[] field254;

	@ObfuscatedName("client.bf")
	public int[] field297;

	@ObfuscatedName("client.cf")
	public int[] field298;

	@ObfuscatedName("client.df")
	public int[] field299;

	@ObfuscatedName("client.Nf")
	public int[] field327;

	@ObfuscatedName("client.Of")
	public int[] field328;

	@ObfuscatedName("client.sg")
	public int[] field357;

	@ObfuscatedName("client.tg")
	public int[] field358;

	@ObfuscatedName("client.ug")
	public int[] field359;

	@ObfuscatedName("client.vg")
	public int[] field360;

	@ObfuscatedName("client.oh")
	public TAIXVIBM[] field401;

	@ObfuscatedName("client.ic")
	public byte[][] field161;

	@ObfuscatedName("client.oe")
	public byte[][] field260;

	@ObfuscatedName("client.pj")
	public byte[][][] field495;

	@ObfuscatedName("client.Qb")
	public int[][][] field144;

	@ObfuscatedName("client.f(I)V")
	public final void method38() {
		for (LCCAHTIM var1 = (LCCAHTIM) field366.method523(); var1 != null; var1 = (LCCAHTIM) field366.method525()) {
			if (var1.field873 == -1) {
				var1.field872 = 0;
				method72(var1);
			} else {
				var1.method591();
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method39() {
		for (XTGOQLGZ var1 = (XTGOQLGZ) field261.method523(); var1 != null; var1 = (XTGOQLGZ) field261.method525()) {
			if (field190 != var1.field1354 || var1.field1361) {
				var1.method591();
			} else if (field399 >= var1.field1358) {
				var1.method496(field472);

				if (var1.field1361) {
					var1.method591();
				} else {
					field489.method303(var1.field1356, 0, -1, var1.field1355, var1, 60, var1.field1354, var1.field1357, false);
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method40() {
		short var1 = 256;

		if (field206 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field206 > 768) {
					field357[var2] = method145(field358[var2], field359[var2], 1024 - field206);
				} else if (field206 > 256) {
					field357[var2] = field359[var2];
				} else {
					field357[var2] = method145(field359[var2], field358[var2], 256 - field206);
				}
			}
		} else if (field207 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field207 > 768) {
					field357[var3] = method145(field358[var3], field360[var3], 1024 - field207);
				} else if (field207 > 256) {
					field357[var3] = field360[var3];
				} else {
					field357[var3] = method145(field360[var3], field358[var3], 256 - field207);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field357[var4] = field358[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field289.field752[var5] = field484.field889[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field313[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field327[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field357[var12];
					int var15 = field289.field752[var7];
					field289.field752[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field289.method213(0, field817, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field290.field752[var16] = field485.field889[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field313[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field327[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field357[var23];
					int var26 = field290.field752[var18];
					field290.field752[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field290.method213(637, field817, 0);
	}

	@ObfuscatedName("client.h(I)V")
	public final void method41() {
		for (int var1 = 0; var1 < field393; var1++) {
			if (field141[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field229[var1] != field223 || field159[var1] != field135) {
						ZOMNSJJM var3 = WFTRMPWZ.method449(field159[var1], field229[var1]);
						if (System.currentTimeMillis() + var3.field1457 / 22 > field516 / 22 + field433) {
							field516 = var3.field1457;
							field433 = System.currentTimeMillis();

							if (method143(var3.field1456, var3.field1457)) {
								field223 = field229[var1];
								field135 = field159[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method60()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field141[var1] != -5) {
					field141[var1] = -5;
				} else {
					field393--;
					for (int var5 = var1; var5 < field393; var5++) {
						field229[var5] = field229[var5 + 1];
						field159[var5] = field159[var5 + 1];
						field141[var5] = field141[var5 + 1];
					}

					var1--;
				}
			} else {
				field141[var1]--;
			}
		}

		field324++;
		if (field324 > 117) {
			field324 = 0;
			field498.method536(237);
			field498.method541(0);
		}

		if (field222 > 0) {
			field222 -= 20;
			if (field222 < 0) {
				field222 = 0;
			}

			if (field222 == 0 && field315 && !field353) {
				field295 = field364;
				field296 = true;
				field438.method409(2, field295);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public final String method42(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IIILQIVQUKBA;I)V")
	public final void method43(int arg0, int arg1, QIVQUKBA arg2, int arg3) {
		if (field403 != arg2 && field436 < 400) {
			String var5;
			if (arg2.field1096 == 0) {
				var5 = arg2.field1106 + method80(field403.field1104, arg2.field1104) + " (level-" + arg2.field1104 + ")";
			} else {
				var5 = arg2.field1106 + " (skill-" + arg2.field1096 + ")";
			}

			if (field466 == 1) {
				field406[field436] = "Use " + field470 + " with @whi@" + var5;
				field369[field436] = 647;
				field370[field436] = arg3;
				field367[field436] = arg1;
				field368[field436] = arg0;
				field436++;
			} else if (field277 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field173[var6] != null) {
						field406[field436] = field173[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field173[var6].equalsIgnoreCase("attack")) {
							if (arg2.field1104 > field403.field1104) {
								var7 = 2000;
							}

							if (field403.field1090 != 0 && arg2.field1090 != 0) {
								if (field403.field1090 == arg2.field1090) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field174[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field369[field436] = var7 + 787;
						}

						if (var6 == 1) {
							field369[field436] = var7 + 253;
						}

						if (var6 == 2) {
							field369[field436] = var7 + 808;
						}

						if (var6 == 3) {
							field369[field436] = var7 + 98;
						}

						if (var6 == 4) {
							field369[field436] = var7 + 248;
						}

						field370[field436] = arg3;
						field367[field436] = arg1;
						field368[field436] = arg0;
						field436++;
					}
				}
			} else if ((field279 & 0x8) == 8) {
				field406[field436] = field280 + " @whi@" + var5;
				field369[field436] = 834;
				field370[field436] = arg3;
				field367[field436] = arg1;
				field368[field436] = arg0;
				field436++;
			}

			for (int var8 = 0; var8 < field436; var8++) {
				if (field369[var8] == 760) {
					field406[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method44() {
		field188 = new TAIXVIBM(field111, "titlebox", 0);
		field189 = new TAIXVIBM(field111, "titlebutton", 0);
		field401 = new TAIXVIBM[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field401[var2] = new TAIXVIBM(field111, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field401[var3] = new TAIXVIBM(field111, "runes", (var3 & 0x3) + 12);
			}
		}

		field484 = new LXRBRCRX(128, 265);
		field485 = new LXRBRCRX(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field484.field889[var4] = field289.field752[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field485.field889[var5] = field290.field752[var5];
		}

		field358 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field358[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field358[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field358[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field358[var9 + 192] = 0xFFFFFF;
		}

		field359 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field359[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field359[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field359[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field359[var13 + 192] = 0xFFFFFF;
		}

		field360 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field360[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field360[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field360[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field360[var17 + 192] = 0xFFFFFF;
		}

		field357 = new int[256];
		field123 = new int[32768];
		field124 = new int[32768];
		method138(null);
		field327 = new int[32768];
		field328 = new int[32768];
		method81(10, "Connecting to fileserver");

		if (!field465) {
			field398 = true;
			field465 = true;
			method124(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIILCPNGZAUN;I)V")
	public final void method45(int arg0, int arg1, CPNGZAUN arg2, int arg3) {
		if (arg2.field571 == 0 && arg2.field604 != null && (!arg2.field580 || field437 == arg2.field582 || field404 == arg2.field582 || field379 == arg2.field582)) {
			int var5 = LRYUPGSZ.field884;
			int var6 = LRYUPGSZ.field882;
			int var7 = LRYUPGSZ.field885;
			int var8 = LRYUPGSZ.field883;
			LRYUPGSZ.method266(arg0, arg3, arg2.field599 + arg3, arg2.field575 + arg0);
			int var9 = arg2.field604.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field623[var10] + arg3;
				int var12 = arg2.field630[var10] + arg0 - arg1;
				CPNGZAUN var13 = CPNGZAUN.field578[arg2.field604[var10]];
				var11 += var13.field610;
				var12 += var13.field631;

				if (var13.field609 > 0) {
					method83(var13);
				}

				if (var13.field571 == 0) {
					if (var13.field572 > var13.field616 - var13.field575) {
						var13.field572 = var13.field616 - var13.field575;
					}

					if (var13.field572 < 0) {
						var13.field572 = 0;
					}

					method45(var12, var13.field572, var13, var11);

					if (var13.field616 > var13.field575) {
						method87(var13.field616, var12, var13.field599 + var11, var13.field572, var13.field575);
					}
				} else if (var13.field571 != 1) {
					if (var13.field571 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field575; var15++) {
							for (int var16 = 0; var16 < var13.field599; var16++) {
								int var17 = (var13.field622 + 32) * var16 + var11;
								int var18 = (var13.field597 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field620[var14];
									var18 += var13.field619[var14];
								}

								if (var13.field624[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field624[var14] - 1;
									if (var17 > LRYUPGSZ.field884 - 32 && var17 < LRYUPGSZ.field885 && var18 > LRYUPGSZ.field882 - 32 && var18 < LRYUPGSZ.field883 || field243 != 0 && field242 == var14) {
										int var22 = 0;
										if (field466 == 1 && field467 == var14 && field468 == var13.field582) {
											var22 = 0xFFFFFF;
										}

										LXRBRCRX var23 = SWITYBRD.method412(var13.field570[var14], var22, var21);
										if (var23 != null) {
											if (field243 != 0 && field242 == var14 && field241 == var13.field582) {
												var19 = field825 - field244;
												var20 = field826 - field245;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field205 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method283(128, var18 + var20, var17 + var19);

												if (var18 + var20 < LRYUPGSZ.field882 && arg2.field572 > 0) {
													int var24 = (LRYUPGSZ.field882 - var18 - var20) * field472 / 3;
													if (var24 > field472 * 10) {
														var24 = field472 * 10;
													}

													if (var24 > arg2.field572) {
														var24 = arg2.field572;
													}

													arg2.field572 -= var24;
													field245 += var24;
												}

												if (var18 + var20 + 32 > LRYUPGSZ.field883 && arg2.field572 < arg2.field616 - arg2.field575) {
													int var25 = (var18 + var20 + 32 - LRYUPGSZ.field883) * field472 / 3;
													if (var25 > field472 * 10) {
														var25 = field472 * 10;
													}

													if (var25 > arg2.field616 - arg2.field575 - arg2.field572) {
														var25 = arg2.field616 - arg2.field575 - arg2.field572;
													}

													arg2.field572 += var25;
													field245 -= var25;
												}
											} else if (field197 != 0 && field196 == var14 && field195 == var13.field582) {
												var23.method283(128, var18, var17);
											} else {
												var23.method281(var18, var17);
											}

											if (var23.field894 == 33 || var13.field570[var14] != 1) {
												int var26 = var13.field570[var14];
												field449.method241(0, method175(var26), var18 + var20 + 10, var17 + 1 + var19);
												field449.method241(0xFFFF00, method175(var26), var18 + var20 + 9, var17 + var19);
											}
										}
									}
								} else if (var13.field606 != null && var14 < 20) {
									LXRBRCRX var27 = var13.field606[var14];
									if (var27 != null) {
										var27.method281(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field571 == 3) {
						boolean var28 = false;
						if (field379 == var13.field582 || field404 == var13.field582 || field437 == var13.field582) {
							var28 = true;
						}

						int var29;
						if (method122(var13)) {
							var29 = var13.field612;
							if (var28 && var13.field576 != 0) {
								var29 = var13.field576;
							}
						} else {
							var29 = var13.field611;
							if (var28 && var13.field635 != 0) {
								var29 = var13.field635;
							}
						}

						if (var13.field583 == 0) {
							if (var13.field603) {
								LRYUPGSZ.method269(var29, var13.field599, var13.field575, var12, var11);
							} else {
								LRYUPGSZ.method270(var12, var13.field575, var13.field599, var11, var29);
							}
						} else if (var13.field603) {
							LRYUPGSZ.method268(var13.field575, 256 - (var13.field583 & 0xFF), var13.field599, var11, var12, var29);
						} else {
							LRYUPGSZ.method271(256 - (var13.field583 & 0xFF), var12, var13.field575, var29, var13.field599, var11);
						}
					} else if (var13.field571 == 4) {
						JQUNTFOC var30 = var13.field605;
						String var31 = var13.field598;
						boolean var32 = false;
						if (field379 == var13.field582 || field404 == var13.field582 || field437 == var13.field582) {
							var32 = true;
						}

						int var33;
						if (method122(var13)) {
							var33 = var13.field612;
							if (var32 && var13.field576 != 0) {
								var33 = var13.field576;
							}

							if (var13.field594.length() > 0) {
								var31 = var13.field594;
							}
						} else {
							var33 = var13.field611;
							if (var32 && var13.field635 != 0) {
								var33 = var13.field635;
							}
						}

						if (var13.field600 == 6 && field471) {
							var31 = "Please wait...";
							var33 = var13.field611;
						}

						if (LRYUPGSZ.field880 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field845 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method42(method178(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method42(method178(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method42(method178(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method42(method178(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method42(method178(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field608) {
								var30.method238(var33, var34, var41, var13.field599 / 2 + var11, var13.field584);
							} else {
								var30.method245(var11, var41, var13.field584, var34, var33);
							}

							var34 += var30.field845;
						}
					} else if (var13.field571 == 5) {
						LXRBRCRX var42;
						if (method122(var13)) {
							var42 = var13.field589;
						} else {
							var42 = var13.field595;
						}

						if (var42 != null) {
							var42.method281(var12, var11);
						}
					} else if (var13.field571 == 6) {
						int var43 = CPGFUBUO.field552;
						int var44 = CPGFUBUO.field553;
						CPGFUBUO.field552 = var13.field599 / 2 + var11;
						CPGFUBUO.field553 = var13.field575 / 2 + var12;
						int var45 = CPGFUBUO.field556[var13.field591] * var13.field590 >> 16;
						int var46 = CPGFUBUO.field557[var13.field591] * var13.field590 >> 16;
						boolean var47 = method122(var13);
						int var48;
						if (var47) {
							var48 = var13.field614;
						} else {
							var48 = var13.field613;
						}

						CCYECDYX var49;
						if (var48 == -1) {
							var49 = var13.method204(-1, -1, var47);
						} else {
							ISUBRNPG var50 = ISUBRNPG.field786[var48];
							var49 = var13.method204(var50.field789[var13.field579], var50.field788[var13.field579], var47);
						}

						if (var49 != null) {
							var49.method31(0, var13.field592, 0, var13.field591, 0, var45, var46);
						}

						CPGFUBUO.field552 = var43;
						CPGFUBUO.field553 = var44;
					} else if (var13.field571 == 7) {
						JQUNTFOC var51 = var13.field605;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field575; var53++) {
							for (int var54 = 0; var54 < var13.field599; var54++) {
								if (var13.field624[var52] > 0) {
									SWITYBRD var55 = SWITYBRD.method416(var13.field624[var52] - 1);
									String var56 = var55.field1207;
									if (var55.field1239 || var13.field570[var52] != 1) {
										var56 = var56 + " x" + method118(var13.field570[var52]);
									}

									int var57 = (var13.field622 + 115) * var54 + var11;
									int var58 = (var13.field597 + 12) * var53 + var12;
									if (var13.field608) {
										var51.method238(var13.field611, var58, var56, var13.field599 / 2 + var57, var13.field584);
									} else {
										var51.method245(var57, var56, var13.field584, var58, var13.field611);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			LRYUPGSZ.method266(var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method46() {
		if (field497 != 0) {
			JQUNTFOC var1 = field450;
			int var2 = 0;
			if (field522 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field270[var3] != null) {
					int var4 = field268[var3];
					String var5 = field269[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field380 == 0 || field380 == 1 && method123(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method241(0, "From", var7, var8);
						var1.method241(0xFFFF, "From", var7 - 1, var8);
						int var11 = var8 + var1.method239("From ");
						if (var6 == 1) {
							field247[0].method428(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field247[1].method428(var7 - 12, var11);
							var11 += 14;
						}

						var1.method241(0, var5 + ": " + field270[var3], var7, var11);
						var1.method241(0xFFFF, var5 + ": " + field270[var3], var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field380 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method241(0, field270[var3], var9, 4);
						var1.method241(0xFFFF, field270[var3], var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field380 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method241(0, "To " + var5 + ": " + field270[var3], var10, 4);
						var1.method241(0xFFFF, "To " + var5 + ": " + field270[var3], var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)Z")
	public final boolean method47(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field369[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 858) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(B)V")
	public void method48() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field171);

		if (field438 != null) {
			System.out.println("Od-cycle:" + field438.field1189);
		}

		System.out.println("loop-cycle:" + field399);
		System.out.println("draw-cycle:" + field512);
		System.out.println("ptype:" + field414);
		System.out.println("psize:" + field413);

		if (field192 != null) {
			field192.method6();
		}

		field814 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method49() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field820 != null) {
			return field820;
		}

		return this;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method50() {
		try {
			int var1 = field403.field1069 + field460;
			int var2 = field403.field1070 + field346;
			if (field271 - var1 < -500 || field271 - var1 > 500 || field272 - var2 < -500 || field272 - var2 > 500) {
				field271 = var1;
				field272 = var2;
			}

			if (field271 != var1) {
				field271 += (var1 - field271) / 16;
			}

			if (field272 != var2) {
				field272 += (var2 - field272) / 16;
			}

			if (field835[1] == 1) {
				field308 += (-field308 - 24) / 2;
			} else if (field835[2] == 1) {
				field308 += (24 - field308) / 2;
			} else {
				field308 /= 2;
			}

			if (field835[3] == 1) {
				field309 += (12 - field309) / 2;
			} else if (field835[4] == 1) {
				field309 += (-field309 - 12) / 2;
			} else {
				field309 /= 2;
			}

			field307 = field308 / 2 + field307 & 0x7FF;
			field306 += field309 / 2;
			if (field306 < 128) {
				field306 = 128;
			}

			if (field306 > 383) {
				field306 = 383;
			}

			int var3 = field271 >> 7;
			int var4 = field272 >> 7;
			int var5 = method151(field190, field272, field271);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field190;
						if (var9 < 3 && (field495[1][var7][var8] & 0x2) == 2) {
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

			if (var11 > field348) {
				field348 += (var11 - field348) / 24;
			} else if (var11 < field348) {
				field348 += (var11 - field348) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field403.field1069 + "," + field403.field1070 + "," + field271 + "," + field272 + "," + field217 + "," + field218 + "," + field167 + "," + field168);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method51() {
		NNGZIOFO.field1003.method230();
		NNGZIOFO.field971.method230();
		ZDMOUFDZ.field1452.method230();
		SWITYBRD.field1235.method230();
		SWITYBRD.field1206.method230();
		QIVQUKBA.field1101.method230();
		ZSSCYSIO.field1488.method230();
	}

	@ObfuscatedName("client.a(ILZOMNSJJM;I)V")
	public final void method52(ZOMNSJJM arg0, int arg1) {
		while (arg0.field1458 + 10 < arg1 * 8) {
			int var3 = arg0.method558(11);
			if (var3 == 2047) {
				break;
			}

			if (field441[var3] == null) {
				field441[var3] = new QIVQUKBA();
				if (field446[var3] != null) {
					field441[var3].method374(field446[var3]);
				}
			}

			field443[field442++] = var3;
			QIVQUKBA var4 = field441[var3];
			var4.field1067 = field399;
			int var5 = arg0.method558(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method558(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method558(1);
			if (var7 == 1) {
				field445[field444++] = var3;
			}

			int var8 = arg0.method558(1);
			var4.method373(var8 == 1, field403.field1087[0] + var5, field403.field1086[0] + var6);
		}

		arg0.method559();
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method53() {
		if (field466 == 0 && field277 == 0) {
			field406[field436] = "Walk here";
			field369[field436] = 760;
			field367[field436] = field825;
			field368[field436] = field826;
			field436++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < CCYECDYX.field88; var2++) {
			int var3 = CCYECDYX.field89[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field489.method322(field190, var4, var5, var3) >= 0) {
					NNGZIOFO var8 = NNGZIOFO.method350(var7);
					if (var8.field1000 != null) {
						var8 = var8.method345();
					}

					if (var8 == null) {
						continue;
					}

					if (field466 == 1) {
						field406[field436] = "Use " + field470 + " with @cya@" + var8.field979;
						field369[field436] = 916;
						field370[field436] = var3;
						field367[field436] = var4;
						field368[field436] = var5;
						field436++;
					} else if (field277 != 1) {
						if (var8.field990 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field990[var9] != null) {
									field406[field436] = var8.field990[var9] + " @cya@" + var8.field979;

									if (var9 == 0) {
										field369[field436] = 390;
									}

									if (var9 == 1) {
										field369[field436] = 115;
									}

									if (var9 == 2) {
										field369[field436] = 587;
									}

									if (var9 == 3) {
										field369[field436] = 429;
									}

									if (var9 == 4) {
										field369[field436] = 1275;
									}

									field370[field436] = var3;
									field367[field436] = var4;
									field368[field436] = var5;
									field436++;
								}
							}
						}

						field406[field436] = "Examine @cya@" + var8.field979;
						field369[field436] = 1661;
						field370[field436] = var8.field1004 << 14;
						field367[field436] = var4;
						field368[field436] = var5;
						field436++;
					} else if ((field279 & 0x4) == 4) {
						field406[field436] = field280 + " @cya@" + var8.field979;
						field369[field436] = 969;
						field370[field436] = var3;
						field367[field436] = var4;
						field368[field436] = var5;
						field436++;
					}
				}

				if (var6 == 1) {
					TEBIXSCV var10 = field500[var7];
					if (var10.field1257.field1443 == 1 && (var10.field1069 & 0x7F) == 0x40 && (var10.field1070 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field501; var11++) {
							TEBIXSCV var12 = field500[field502[var11]];
							if (var12 != null && var10 != var12 && var12.field1257.field1443 == 1 && var10.field1069 == var12.field1069 && var10.field1070 == var12.field1070) {
								method96(field502[var11], var4, var5, var12.field1257);
							}
						}

						for (int var13 = 0; var13 < field442; var13++) {
							QIVQUKBA var14 = field441[field443[var13]];
							if (var14 != null && var10.field1069 == var14.field1069 && var10.field1070 == var14.field1070) {
								method43(var5, var4, var14, field443[var13]);
							}
						}
					}

					method96(var7, var4, var5, var10.field1257);
				}

				if (var6 == 0) {
					QIVQUKBA var15 = field441[var7];
					if ((var15.field1069 & 0x7F) == 0x40 && (var15.field1070 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field501; var16++) {
							TEBIXSCV var17 = field500[field502[var16]];
							if (var17 != null && var17.field1257.field1443 == 1 && var15.field1069 == var17.field1069 && var15.field1070 == var17.field1070) {
								method96(field502[var16], var4, var5, var17.field1257);
							}
						}

						for (int var18 = 0; var18 < field442; var18++) {
							QIVQUKBA var19 = field441[field443[var18]];
							if (var19 != null && var15 != var19 && var15.field1069 == var19.field1069 && var15.field1070 == var19.field1070) {
								method43(var5, var4, var19, field443[var18]);
							}
						}
					}

					method43(var5, var4, var15, var7);
				}

				if (var6 == 3) {
					YSGENUJE var20 = field515[field190][var4][var5];
					if (var20 != null) {
						for (LBFKEYAG var21 = (LBFKEYAG) var20.method524(); var21 != null; var21 = (LBFKEYAG) var20.method526()) {
							SWITYBRD var22 = SWITYBRD.method416(var21.field863);
							if (field466 == 1) {
								field406[field436] = "Use " + field470 + " with @lre@" + var22.field1207;
								field369[field436] = 668;
								field370[field436] = var21.field863;
								field367[field436] = var4;
								field368[field436] = var5;
								field436++;
							} else if (field277 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1218 != null && var22.field1218[var23] != null) {
										field406[field436] = var22.field1218[var23] + " @lre@" + var22.field1207;

										if (var23 == 0) {
											field369[field436] = 242;
										}

										if (var23 == 1) {
											field369[field436] = 172;
										}

										if (var23 == 2) {
											field369[field436] = 746;
										}

										if (var23 == 3) {
											field369[field436] = 258;
										}

										if (var23 == 4) {
											field369[field436] = 229;
										}

										field370[field436] = var21.field863;
										field367[field436] = var4;
										field368[field436] = var5;
										field436++;
									} else if (var23 == 2) {
										field406[field436] = "Take @lre@" + var22.field1207;
										field369[field436] = 746;
										field370[field436] = var21.field863;
										field367[field436] = var4;
										field368[field436] = var5;
										field436++;
									}
								}

								field406[field436] = "Examine @lre@" + var22.field1207;
								field369[field436] = 1731;
								field370[field436] = var21.field863;
								field367[field436] = var4;
								field368[field436] = var5;
								field436++;
							} else if ((field279 & 0x1) == 1) {
								field406[field436] = field280 + " @lre@" + var22.field1207;
								field369[field436] = 18;
								field370[field436] = var21.field863;
								field367[field436] = var4;
								field368[field436] = var5;
								field436++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method54() {
		int var1 = field115 * 128 + 64;
		int var2 = field116 * 128 + 64;
		int var3 = method151(field190, var2, var1) - field117;

		if (field176 < var1) {
			field176 += (var1 - field176) * field119 / 1000 + field118;
			if (field176 > var1) {
				field176 = var1;
			}
		}

		if (field176 > var1) {
			field176 -= (field176 - var1) * field119 / 1000 + field118;
			if (field176 < var1) {
				field176 = var1;
			}
		}

		if (field177 < var3) {
			field177 += (var3 - field177) * field119 / 1000 + field118;
			if (field177 > var3) {
				field177 = var3;
			}
		}

		if (field177 > var3) {
			field177 -= (field177 - var3) * field119 / 1000 + field118;
			if (field177 < var3) {
				field177 = var3;
			}
		}

		if (field178 < var2) {
			field178 += (var2 - field178) * field119 / 1000 + field118;
			if (field178 > var2) {
				field178 = var2;
			}
		}

		if (field178 > var2) {
			field178 -= (field178 - var2) * field119 / 1000 + field118;
			if (field178 < var2) {
				field178 = var2;
			}
		}

		int var4 = field388 * 128 + 64;
		int var5 = field389 * 128 + 64;
		int var6 = method151(field190, var5, var4) - field390;
		int var7 = var4 - field176;
		int var8 = var6 - field177;
		int var9 = var5 - field178;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field179 < var11) {
			field179 += (var11 - field179) * field392 / 1000 + field391;
			if (field179 > var11) {
				field179 = var11;
			}
		}

		if (field179 > var11) {
			field179 -= (field179 - var11) * field392 / 1000 + field391;
			if (field179 < var11) {
				field179 = var11;
			}
		}

		int var13 = var12 - field180;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field180 += field392 * var13 / 1000 + field391;
			field180 &= 0x7FF;
		}

		if (var13 < 0) {
			field180 -= -var13 * field392 / 1000 + field391;
			field180 &= 0x7FF;
		}

		int var14 = var12 - field180;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field180 = var12;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method55() {
		Graphics var1 = method49().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method234(1);

		if (field97) {
			field465 = false;
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

		if (field382) {
			field465 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field428) {
			field465 = false;
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

	@ObfuscatedName("client.a(JB)V")
	public final void method56(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field435; var3++) {
				if (field276[var3] == arg0) {
					field435--;
					field385 = true;

					for (int var4 = var3; var4 < field435; var4++) {
						field276[var4] = field276[var4 + 1];
					}

					field498.method536(245);
					field498.method543(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILLXRBRCRX;II)V")
	public final void method57(int arg0, LXRBRCRX arg1, int arg2) {
		int var4 = field307 + field283 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = CCYECDYX.field90[var4];
			int var7 = CCYECDYX.field91[var4];
			var6 = var6 * 256 / (field121 + 256);
			var7 = var7 * 256 / (field121 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method287(field133, var8 + 94 + 4 - arg1.field894 / 2, 83 - var9 - arg1.field895 / 2 - 4);
			} else {
				arg1.method281(83 - var9 - arg1.field895 / 2 - 4, var8 + 94 - arg1.field894 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method58() {
		try {
			if (field192 != null) {
				field192.method1();
			}
		} catch (Exception var2) {
		}

		field192 = null;
		field481 = false;
		field338 = 0;
		field431 = "";
		field432 = "";
		method51();
		field489.method292();

		for (int var1 = 0; var1 < 4; var1++) {
			field275[var1].method354();
		}

		System.gc();
		method168();
		field364 = -1;
		field295 = -1;
		field222 = 0;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method59() {
		while (true) {
			SMSHJBOZ var1 = field438.method391();
			if (var1 == null) {
				return;
			}

			if (var1.field1195 == 0) {
				CCYECDYX.method9(var1.field1199, var1.field1198);

				if ((field438.method395(var1.field1198) & 0x62) != 0) {
					field385 = true;

					if (field316 != -1) {
						field227 = true;
					}
				}
			}

			if (var1.field1195 == 1 && var1.field1199 != null) {
				RKTGZGSS.method380(var1.field1199);
			}

			if (var1.field1195 == 2 && field295 == var1.field1198 && var1.field1199 != null) {
				method137(var1.field1199, field296);
			}

			if (var1.field1195 == 3 && field281 == 1) {
				for (int var2 = 0; var2 < field260.length; var2++) {
					if (field253[var2] == var1.field1198) {
						field260[var2] = var1.field1199;

						if (var1.field1199 == null) {
							field253[var2] = -1;
						}

						break;
					}

					if (field254[var2] == var1.field1198) {
						field161[var2] = var1.field1199;

						if (var1.field1199 == null) {
							field254[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1195 == 93 && field438.method408(var1.field1198)) {
				YCYSFKFW.method513(field438, new ZOMNSJJM(var1.field1199));
			}
		}
	}

	@ObfuscatedName("client.e(Z)Z")
	public final boolean method60() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.o(I)V")
	public final void method61() {
		if (field497 != 0) {
			int var1 = 0;
			if (field522 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field270[var2] != null) {
					int var3 = field268[var2];
					String var4 = field269[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field380 == 0 || field380 == 1 && method123(var4))) {
						int var8 = 329 - var1 * 13;
						if (field825 > 4 && field826 - 4 > var8 - 10 && field826 - 4 <= var8 + 3) {
							int var9 = field450.method239("From:  " + var4 + field270[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field825 < var9 + 4) {
								if (field256 >= 1) {
									field406[field436] = "Report abuse @whi@" + var4;
									field369[field436] = 2036;
									field436++;
								}

								field406[field436] = "Add ignore @whi@" + var4;
								field369[field436] = 2380;
								field436++;
								field406[field436] = "Add friend @whi@" + var4;
								field369[field436] = 2858;
								field436++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field380 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZILZOMNSJJM;)V")
	public final void method62(int arg0, ZOMNSJJM arg1) {
		int var3 = arg1.method558(8);
		if (var3 < field442) {
			for (int var4 = var3; var4 < field442; var4++) {
				field153[field152++] = field443[var4];
			}
		}

		if (var3 > field442) {
			signlink.reporterror(field431 + " Too many players");
			throw new RuntimeException("eek");
		}

		field442 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field443[var5];
			QIVQUKBA var7 = field441[var6];
			int var8 = arg1.method558(1);
			if (var8 == 0) {
				field443[field442++] = var6;
				var7.field1067 = field399;
			} else {
				int var9 = arg1.method558(2);
				if (var9 == 0) {
					field443[field442++] = var6;
					var7.field1067 = field399;
					field445[field444++] = var6;
				} else if (var9 == 1) {
					field443[field442++] = var6;
					var7.field1067 = field399;
					int var10 = arg1.method558(3);
					var7.method371(var10, false);
					int var11 = arg1.method558(1);
					if (var11 == 1) {
						field445[field444++] = var6;
					}
				} else if (var9 == 2) {
					field443[field442++] = var6;
					var7.field1067 = field399;
					int var12 = arg1.method558(3);
					var7.method371(var12, true);
					int var13 = arg1.method558(3);
					var7.method371(var13, true);
					int var14 = arg1.method558(1);
					if (var14 == 1) {
						field445[field444++] = var6;
					}
				} else if (var9 == 3) {
					field153[field152++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZIIIIII)V")
	public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg1 >= 1 && arg5 <= 102 && arg1 <= 102) {
			if (field353 && field190 != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg2 == 0) {
				var8 = field489.method318(arg6, arg5, arg1);
			}

			if (arg2 == 1) {
				var8 = field489.method319(arg6, arg5, arg1);
			}

			if (arg2 == 2) {
				var8 = field489.method320(arg6, arg5, arg1);
			}

			if (arg2 == 3) {
				var8 = field489.method321(arg6, arg5, arg1);
			}

			if (var8 != 0) {
				int var12 = field489.method322(arg6, arg5, arg1, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg2 == 0) {
					field489.method309(arg6, arg1, arg5);
					NNGZIOFO var16 = NNGZIOFO.method350(var13);
					if (var16.field975) {
						field275[arg6].method359(var14, arg5, var16.field1009, var15, arg1);
					}
				}

				if (arg2 == 1) {
					field489.method310(arg1, arg5, arg6);
				}

				if (arg2 == 2) {
					field489.method311(arg5, arg1, arg6);
					NNGZIOFO var17 = NNGZIOFO.method350(var13);
					if (var17.field966 + arg5 > 103 || var17.field966 + arg1 > 103 || var17.field983 + arg5 > 103 || var17.field983 + arg1 > 103) {
						return;
					}

					if (var17.field975) {
						field275[arg6].method360(var17.field983, arg1, var17.field1009, var15, var17.field966, arg5);
					}
				}

				if (arg2 == 3) {
					field489.method312(arg6, arg5, arg1);
					NNGZIOFO var18 = NNGZIOFO.method350(var13);
					if (var18.field975 && var18.field994) {
						field275[arg6].method362(arg1, arg5);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (field495[1][arg5][arg1] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				YCYSFKFW.method504(arg0, field489, field144, arg3, var19, arg4, arg6, field275[arg6], arg5, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method64() {
		field257++;
		if (field257 > 157) {
			field257 = 0;
			field498.method536(169);
			field498.method538(60877);
		}

		for (int var1 = 0; var1 < field501; var1++) {
			int var2 = field502[var1];
			TEBIXSCV var3 = field500[var2];
			if (var3 != null) {
				method65(var3.field1257.field1443, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILOVZHBYZU;)V")
	public final void method65(int arg0, OVZHBYZU arg1) {
		if (arg1.field1069 < 128 || arg1.field1070 < 128 || arg1.field1069 >= 13184 || arg1.field1070 >= 13184) {
			arg1.field1081 = -1;
			arg1.field1037 = -1;
			arg1.field1076 = 0;
			arg1.field1077 = 0;
			arg1.field1069 = arg1.field1086[0] * 128 + arg1.field1050 * 64;
			arg1.field1070 = arg1.field1087[0] * 128 + arg1.field1050 * 64;
			arg1.method372();
		}

		if (field403 == arg1 && (arg1.field1069 < 1536 || arg1.field1070 < 1536 || arg1.field1069 >= 11776 || arg1.field1070 >= 11776)) {
			arg1.field1081 = -1;
			arg1.field1037 = -1;
			arg1.field1076 = 0;
			arg1.field1077 = 0;
			arg1.field1069 = arg1.field1086[0] * 128 + arg1.field1050 * 64;
			arg1.field1070 = arg1.field1087[0] * 128 + arg1.field1050 * 64;
			arg1.method372();
		}

		if (arg1.field1076 > field399) {
			method66(arg1);
		} else if (arg1.field1077 >= field399) {
			method67(arg1);
		} else {
			method68(arg1);
		}

		method69(arg1);
		method70(arg1);
	}

	@ObfuscatedName("client.a(LOVZHBYZU;Z)V")
	public final void method66(OVZHBYZU arg0) {
		int var2 = arg0.field1076 - field399;
		int var3 = arg0.field1072 * 128 + arg0.field1050 * 64;
		int var4 = arg0.field1074 * 128 + arg0.field1050 * 64;
		arg0.field1069 += (var3 - arg0.field1069) / var2;
		arg0.field1070 += (var4 - arg0.field1070) / var2;
		arg0.field1066 = 0;

		if (arg0.field1078 == 0) {
			arg0.field1064 = 1024;
		}

		if (arg0.field1078 == 1) {
			arg0.field1064 = 1536;
		}

		if (arg0.field1078 == 2) {
			arg0.field1064 = 0;
		}

		if (arg0.field1078 == 3) {
			arg0.field1064 = 512;
		}
	}

	@ObfuscatedName("client.a(ILOVZHBYZU;)V")
	public final void method67(OVZHBYZU arg0) {
		if (field399 == arg0.field1077 || arg0.field1081 == -1 || arg0.field1084 != 0 || arg0.field1083 + 1 > ISUBRNPG.field786[arg0.field1081].method226(arg0.field1082)) {
			int var2 = arg0.field1077 - arg0.field1076;
			int var3 = field399 - arg0.field1076;
			int var4 = arg0.field1072 * 128 + arg0.field1050 * 64;
			int var5 = arg0.field1074 * 128 + arg0.field1050 * 64;
			int var6 = arg0.field1073 * 128 + arg0.field1050 * 64;
			int var7 = arg0.field1075 * 128 + arg0.field1050 * 64;
			arg0.field1069 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1070 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1066 = 0;

		if (arg0.field1078 == 0) {
			arg0.field1064 = 1024;
		}

		if (arg0.field1078 == 1) {
			arg0.field1064 = 1536;
		}

		if (arg0.field1078 == 2) {
			arg0.field1064 = 0;
		}

		if (arg0.field1078 == 3) {
			arg0.field1064 = 512;
		}

		arg0.field1071 = arg0.field1064;
	}

	@ObfuscatedName("client.a(BLOVZHBYZU;)V")
	public final void method68(OVZHBYZU arg0) {
		arg0.field1034 = arg0.field1047;
		if (arg0.field1056 == 0) {
			arg0.field1066 = 0;
		} else {
			if (arg0.field1081 != -1 && arg0.field1084 == 0) {
				ISUBRNPG var2 = ISUBRNPG.field786[arg0.field1081];
				if (arg0.field1051 > 0 && var2.field798 == 0) {
					arg0.field1066++;
					return;
				}

				if (arg0.field1051 <= 0 && var2.field799 == 0) {
					arg0.field1066++;
					return;
				}
			}

			int var3 = arg0.field1069;
			int var4 = arg0.field1070;
			int var5 = arg0.field1086[arg0.field1056 - 1] * 128 + arg0.field1050 * 64;
			int var6 = arg0.field1087[arg0.field1056 - 1] * 128 + arg0.field1050 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1064 = 1280;
					} else if (var4 > var6) {
						arg0.field1064 = 1792;
					} else {
						arg0.field1064 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1064 = 768;
					} else if (var4 > var6) {
						arg0.field1064 = 256;
					} else {
						arg0.field1064 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1064 = 1024;
				} else {
					arg0.field1064 = 0;
				}

				int var7 = arg0.field1064 - arg0.field1071 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1043;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1042;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1045;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1044;
				}

				if (var8 == -1) {
					var8 = arg0.field1042;
				}

				arg0.field1034 = var8;
				int var9 = 4;
				if (arg0.field1071 != arg0.field1064 && arg0.field1088 == -1 && arg0.field1058 != 0) {
					var9 = 2;
				}

				if (arg0.field1056 > 2) {
					var9 = 6;
				}

				if (arg0.field1056 > 3) {
					var9 = 8;
				}

				if (arg0.field1066 > 0 && arg0.field1056 > 1) {
					var9 = 8;
					arg0.field1066--;
				}

				if (arg0.field1055[arg0.field1056 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1042 == arg0.field1034 && arg0.field1059 != -1) {
					arg0.field1034 = arg0.field1059;
				}

				if (var3 < var5) {
					arg0.field1069 += var9;
					if (arg0.field1069 > var5) {
						arg0.field1069 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1069 -= var9;
					if (arg0.field1069 < var5) {
						arg0.field1069 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1070 += var9;
					if (arg0.field1070 > var6) {
						arg0.field1070 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1070 -= var9;
					if (arg0.field1070 < var6) {
						arg0.field1070 = var6;
					}
				}

				if (arg0.field1069 == var5 && arg0.field1070 == var6) {
					arg0.field1056--;

					if (arg0.field1051 > 0) {
						arg0.field1051--;
						return;
					}
				}
			} else {
				arg0.field1069 = var5;
				arg0.field1070 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LOVZHBYZU;B)V")
	public final void method69(OVZHBYZU arg0) {
		if (arg0.field1058 != 0) {
			if (arg0.field1088 != -1 && arg0.field1088 < 32768) {
				TEBIXSCV var2 = field500[arg0.field1088];
				if (var2 != null) {
					int var3 = arg0.field1069 - var2.field1069;
					int var4 = arg0.field1070 - var2.field1070;
					if (var3 != 0 || var4 != 0) {
						arg0.field1064 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1088 >= 32768) {
				int var5 = arg0.field1088 - 32768;
				if (field462 == var5) {
					var5 = field440;
				}

				QIVQUKBA var6 = field441[var5];
				if (var6 != null) {
					int var7 = arg0.field1069 - var6.field1069;
					int var8 = arg0.field1070 - var6.field1070;
					if (var7 != 0 || var8 != 0) {
						arg0.field1064 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1079 != 0 || arg0.field1080 != 0) && (arg0.field1056 == 0 || arg0.field1066 > 0)) {
				int var9 = arg0.field1069 - (arg0.field1079 - field167 - field167) * 64;
				int var10 = arg0.field1070 - (arg0.field1080 - field168 - field168) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1064 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1079 = 0;
				arg0.field1080 = 0;
			}

			int var11 = arg0.field1064 - arg0.field1071 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1058 || var11 > 2048 - arg0.field1058) {
					arg0.field1071 = arg0.field1064;
				} else if (var11 > 1024) {
					arg0.field1071 -= arg0.field1058;
				} else {
					arg0.field1071 += arg0.field1058;
				}

				arg0.field1071 &= 0x7FF;
				if (arg0.field1047 == arg0.field1034 && arg0.field1071 != arg0.field1064) {
					if (arg0.field1048 != -1) {
						arg0.field1034 = arg0.field1048;
						return;
					}

					arg0.field1034 = arg0.field1042;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LOVZHBYZU;I)V")
	public final void method70(OVZHBYZU arg0) {
		arg0.field1057 = false;

		if (arg0.field1034 != -1) {
			ISUBRNPG var2 = ISUBRNPG.field786[arg0.field1034];
			arg0.field1036++;
			if (arg0.field1035 < var2.field787 && arg0.field1036 > var2.method226(arg0.field1035)) {
				arg0.field1036 = 0;
				arg0.field1035++;
			}

			if (arg0.field1035 >= var2.field787) {
				arg0.field1036 = 0;
				arg0.field1035 = 0;
			}
		}

		if (arg0.field1037 != -1 && field399 >= arg0.field1040) {
			if (arg0.field1038 < 0) {
				arg0.field1038 = 0;
			}

			ISUBRNPG var3 = ZSSCYSIO.field1476[arg0.field1037].field1480;
			arg0.field1039++;
			while (arg0.field1038 < var3.field787 && arg0.field1039 > var3.method226(arg0.field1038)) {
				arg0.field1039 -= var3.method226(arg0.field1038);
				arg0.field1038++;
			}

			if (arg0.field1038 >= var3.field787 && (arg0.field1038 < 0 || arg0.field1038 >= var3.field787)) {
				arg0.field1037 = -1;
			}
		}

		if (arg0.field1081 != -1 && arg0.field1084 <= 1) {
			ISUBRNPG var4 = ISUBRNPG.field786[arg0.field1081];
			if (var4.field798 == 1 && arg0.field1051 > 0 && arg0.field1076 <= field399 && arg0.field1077 < field399) {
				arg0.field1084 = 1;
				return;
			}
		}

		if (arg0.field1081 != -1 && arg0.field1084 == 0) {
			ISUBRNPG var5 = ISUBRNPG.field786[arg0.field1081];
			arg0.field1083++;
			while (arg0.field1082 < var5.field787 && arg0.field1083 > var5.method226(arg0.field1082)) {
				arg0.field1083 -= var5.method226(arg0.field1082);
				arg0.field1082++;
			}

			if (arg0.field1082 >= var5.field787) {
				arg0.field1082 -= var5.field791;
				arg0.field1085++;
				if (arg0.field1085 >= var5.field797) {
					arg0.field1081 = -1;
				}

				if (arg0.field1082 < 0 || arg0.field1082 >= var5.field787) {
					arg0.field1081 = -1;
				}
			}

			arg0.field1057 = var5.field793;
		}

		if (arg0.field1084 > 0) {
			arg0.field1084--;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method71() {
		if (field506) {
			field506 = false;
			field102.method213(0, field817, 4);
			field103.method213(0, field817, 357);
			field104.method213(722, field817, 4);
			field105.method213(743, field817, 205);
			field106.method213(0, field817, 0);
			field107.method213(516, field817, 4);
			field108.method213(516, field817, 205);
			field109.method213(496, field817, 357);
			field110.method213(0, field817, 338);
			field385 = true;
			field227 = true;
			field226 = true;
			field213 = true;

			if (field281 != 2) {
				field129.method213(4, field817, 4);
				field128.method213(550, field817, 4);
			}
		}

		if (field281 == 2) {
			method100();
		}

		if (field191 && field332 == 1) {
			field385 = true;
		}

		if (field329 != -1) {
			boolean var1 = method148(field472, field329);
			if (var1) {
				field385 = true;
			}
		}

		if (field197 == 2) {
			field385 = true;
		}

		if (field243 == 2) {
			field385 = true;
		}

		if (field385) {
			method179();
			field385 = false;
		}

		if (field316 == -1) {
			field424.field572 = field402 - field285 - 77;

			if (field825 > 448 && field825 < 560 && field826 > 332) {
				method89(0, field826 - 357, false, field402, 77, 463, field825 - 17, field424);
			}

			int var2 = field402 - field424.field572 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field402 - 77) {
				var2 = field402 - 77;
			}

			if (field285 != var2) {
				field285 = var2;
				field227 = true;
			}
		}

		if (field316 != -1) {
			boolean var3 = method148(field472, field316);
			if (var3) {
				field227 = true;
			}
		}

		if (field197 == 3) {
			field227 = true;
		}

		if (field243 == 3) {
			field227 = true;
		}

		if (field249 != null) {
			field227 = true;
		}

		if (field191 && field332 == 2) {
			field227 = true;
		}

		if (field227) {
			method116();
			field227 = false;
		}

		if (field281 == 2) {
			method166();
			field128.method213(550, field817, 4);
		}

		if (field422 != -1) {
			field226 = true;
		}

		if (field226) {
			if (field422 != -1 && field492 == field422) {
				field422 = -1;
				field498.method536(87);
				field498.method537(field492);
			}

			field226 = false;
			field459.method212();
			field409.method428(0, 0);

			if (field329 == -1) {
				if (field113[field492] != -1) {
					if (field492 == 0) {
						field181.method428(10, 22);
					}

					if (field492 == 1) {
						field182.method428(8, 54);
					}

					if (field492 == 2) {
						field182.method428(8, 82);
					}

					if (field492 == 3) {
						field183.method428(8, 110);
					}

					if (field492 == 4) {
						field185.method428(8, 153);
					}

					if (field492 == 5) {
						field185.method428(8, 181);
					}

					if (field492 == 6) {
						field184.method428(9, 209);
					}
				}

				if (field113[0] != -1 && (field422 != 0 || field399 % 20 < 10)) {
					field434[0].method428(13, 29);
				}

				if (field113[1] != -1 && (field422 != 1 || field399 % 20 < 10)) {
					field434[1].method428(11, 53);
				}

				if (field113[2] != -1 && (field422 != 2 || field399 % 20 < 10)) {
					field434[2].method428(11, 82);
				}

				if (field113[3] != -1 && (field422 != 3 || field399 % 20 < 10)) {
					field434[3].method428(12, 115);
				}

				if (field113[4] != -1 && (field422 != 4 || field399 % 20 < 10)) {
					field434[4].method428(13, 153);
				}

				if (field113[5] != -1 && (field422 != 5 || field399 % 20 < 10)) {
					field434[5].method428(11, 180);
				}

				if (field113[6] != -1 && (field422 != 6 || field399 % 20 < 10)) {
					field434[6].method428(13, 208);
				}
			}

			field459.method213(516, field817, 160);
			field149++;
			if (field149 > 102) {
				field149 = 0;
				field498.method536(26);
				field498.method540(0xFC09EF);
			}

			field458.method212();
			field408.method428(0, 0);

			if (field329 == -1) {
				if (field113[field492] != -1) {
					if (field492 == 7) {
						field162.method428(0, 42);
					}

					if (field492 == 8) {
						field163.method428(0, 74);
					}

					if (field492 == 9) {
						field163.method428(0, 102);
					}

					if (field492 == 10) {
						field164.method428(1, 130);
					}

					if (field492 == 11) {
						field166.method428(0, 173);
					}

					if (field492 == 12) {
						field166.method428(0, 201);
					}

					if (field492 == 13) {
						field165.method428(0, 229);
					}
				}

				if (field113[8] != -1 && (field422 != 8 || field399 % 20 < 10)) {
					field434[7].method428(2, 74);
				}

				if (field113[9] != -1 && (field422 != 9 || field399 % 20 < 10)) {
					field434[8].method428(3, 102);
				}

				if (field113[10] != -1 && (field422 != 10 || field399 % 20 < 10)) {
					field434[9].method428(4, 137);
				}

				if (field113[11] != -1 && (field422 != 11 || field399 % 20 < 10)) {
					field434[10].method428(2, 174);
				}

				if (field113[12] != -1 && (field422 != 12 || field399 % 20 < 10)) {
					field434[11].method428(2, 201);
				}

				if (field113[13] != -1 && (field422 != 13 || field399 % 20 < 10)) {
					field434[12].method428(2, 226);
				}
			}

			field458.method213(496, field817, 466);
			field129.method212();
		}

		if (field213) {
			field213 = false;
			field457.method212();
			field407.method428(0, 0);
			field450.method238(0xFFFFFF, 28, "Public chat", 55, true);

			if (field145 == 0) {
				field450.method238(0xFF00, 41, "On", 55, true);
			}

			if (field145 == 1) {
				field450.method238(0xFFFF00, 41, "Friends", 55, true);
			}

			if (field145 == 2) {
				field450.method238(0xFF0000, 41, "Off", 55, true);
			}

			if (field145 == 3) {
				field450.method238(0xFFFF, 41, "Hide", 55, true);
			}

			field450.method238(0xFFFFFF, 28, "Private chat", 184, true);

			if (field380 == 0) {
				field450.method238(0xFF00, 41, "On", 184, true);
			}

			if (field380 == 1) {
				field450.method238(0xFFFF00, 41, "Friends", 184, true);
			}

			if (field380 == 2) {
				field450.method238(0xFF0000, 41, "Off", 184, true);
			}

			field450.method238(0xFFFFFF, 28, "Trade/compete", 324, true);

			if (field228 == 0) {
				field450.method238(0xFF00, 41, "On", 324, true);
			}

			if (field228 == 1) {
				field450.method238(0xFFFF00, 41, "Friends", 324, true);
			}

			if (field228 == 2) {
				field450.method238(0xFF0000, 41, "Off", 324, true);
			}

			field450.method238(0xFFFFFF, 33, "Report abuse", 458, true);
			field457.method213(0, field817, 453);
			field129.method212();
		}

		field472 = 0;
	}

	@ObfuscatedName("client.a(ILLCCAHTIM;)V")
	public final void method72(LCCAHTIM arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field866 == 0) {
			var2 = field489.method318(arg0.field865, arg0.field867, arg0.field868);
		}

		if (arg0.field866 == 1) {
			var2 = field489.method319(arg0.field865, arg0.field867, arg0.field868);
		}

		if (arg0.field866 == 2) {
			var2 = field489.method320(arg0.field865, arg0.field867, arg0.field868);
		}

		if (arg0.field866 == 3) {
			var2 = field489.method321(arg0.field865, arg0.field867, arg0.field868);
		}

		if (var2 != 0) {
			int var6 = field489.method322(arg0.field865, arg0.field867, arg0.field868, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field869 = var3;
		arg0.field871 = var4;
		arg0.field870 = var5;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method73(int arg0) {
		int[] var2 = field420.field889;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field495[arg0][var7][var5] & 0x18) == 0) {
					field489.method327(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field495[arg0 + 1][var7][var5] & 0x8) != 0) {
					field489.method327(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field420.method276();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field495[arg0][var11][var10] & 0x18) == 0) {
					method86(arg0, var8, var9, var10, var11);
				}

				if (arg0 < 3 && (field495[arg0 + 1][var11][var10] & 0x8) != 0) {
					method86(arg0 + 1, var8, var9, var10, var11);
				}
			}
		}

		field129.method212();
		field300 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field489.method321(field190, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = NNGZIOFO.method350(var14).field1006;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field275[field190].field1021;
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

						field453[field300] = field480[var15];
						field301[field300] = var16;
						field302[field300] = var17;
						field300++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method74() {
		if (field417 > 0) {
			method58();
		} else {
			field129.method212();
			field450.method237(144, 0, "Connection lost", 257);
			field450.method237(143, 0xFFFFFF, "Connection lost", 256);
			field450.method237(159, 0, "Please wait - attempting to reestablish", 257);
			field450.method237(158, 0xFFFFFF, "Please wait - attempting to reestablish", 256);
			field129.method213(4, field817, 4);
			field311 = 0;
			field418 = 0;
			BJGZFSFX var1 = field192;
			field481 = false;
			field187 = 0;
			method91(field431, field432, true);

			if (!field481) {
				method58();
			}

			try {
				var1.method1();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(BZI)V")
	public final void method75(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method76(int arg0) {
		if (arg0 >= 0) {
			if (field429 != 0) {
				field429 = 0;
				field227 = true;
			}

			int var2 = field367[arg0];
			int var3 = field368[arg0];
			int var4 = field369[arg0];
			int var5 = field370[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 248) {
				QIVQUKBA var6 = field441[var5];
				if (var6 != null) {
					method90(var6.field1087[0], false, field403.field1087[0], 0, var6.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
					field518 = field832;
					field519 = field833;
					field521 = 2;
					field520 = 0;

					if ((var5 & 0x3) == 0) {
						field474++;
					}

					if (field474 >= 60) {
						field498.method536(126);
						field474 = 0;
					}

					field498.method536(82);
					field498.method571(var5);
				}
			}

			if (var4 == 1176) {
				SWITYBRD var7 = SWITYBRD.method416(var5);
				CPNGZAUN var8 = CPNGZAUN.field578[var3];
				String var9;
				if (var8 != null && var8.field570[var2] >= 100000) {
					var9 = var8.field570[var2] + " x " + var7.field1207;
				} else if (var7.field1220 == null) {
					var9 = "It's a " + var7.field1207 + ".";
				} else {
					var9 = new String(var7.field1220);
				}

				method131(0, "", var9);
			}

			if (var4 == 1661) {
				int var10 = var5 >> 14 & 0x7FFF;
				NNGZIOFO var11 = NNGZIOFO.method350(var10);
				String var12;
				if (var11.field985 == null) {
					var12 = "It's a " + var11.field979 + ".";
				} else {
					var12 = new String(var11.field985);
				}

				method131(0, "", var12);
			}

			if (var4 == 320) {
				field498.method536(67);
				field498.method570(var3);
				field498.method570(var5);
				field498.method572(var2);
				field498.method570(field278);
				field194 = 0;
				field195 = var3;
				field196 = var2;
				field197 = 2;
				if (CPNGZAUN.field578[var3].field621 == field343) {
					field197 = 1;
				}

				if (CPNGZAUN.field578[var3].field621 == field316) {
					field197 = 3;
				}
			}

			if (var4 == 805 && !field471) {
				field498.method536(18);
				field498.method538(var3);
				field471 = true;
			}

			if (var4 == 867) {
				field498.method536(144);
				field498.method538(var3);
				CPNGZAUN var13 = CPNGZAUN.field578[var3];
				if (var13.field581 != null && var13.field581[0][0] == 5) {
					int var14 = var13.field581[0][1];
					if (field476[var14] != var13.field573[0]) {
						field476[var14] = var13.field573[0];
						method171(var14);
						field385 = true;
					}
				}
			}

			if (var4 == 587) {
				method130(var3, var2, var5);
				field498.method536(113);
				field498.method570(field167 + var2);
				field498.method538(field168 + var3);
				field498.method570(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 646) {
				if ((var2 & 0x3) == 0) {
					field349++;
				}

				if (field349 >= 75) {
					field498.method536(28);
					field498.method537(116);
					field349 = 0;
				}

				field498.method536(202);
				field498.method538(var3);
				field498.method538(var5);
				field498.method570(var2);
				field194 = 0;
				field195 = var3;
				field196 = var2;
				field197 = 2;
				if (CPNGZAUN.field578[var3].field621 == field343) {
					field197 = 1;
				}

				if (CPNGZAUN.field578[var3].field621 == field316) {
					field197 = 3;
				}
			}

			if (var4 == 98) {
				QIVQUKBA var15 = field441[var5];
				if (var15 != null) {
					method90(var15.field1087[0], false, field403.field1087[0], 0, var15.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
					field518 = field832;
					field519 = field833;
					field521 = 2;
					field520 = 0;
					field498.method536(203);
					field498.method572(var5);
				}
			}

			if (var4 == 787) {
				QIVQUKBA var16 = field441[var5];
				if (var16 != null) {
					method90(var16.field1087[0], false, field403.field1087[0], 0, var16.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
					field518 = field832;
					field519 = field833;
					field521 = 2;
					field520 = 0;
					field498.method536(162);
					field498.method538(var5);
				}
			}

			if (var4 == 808) {
				QIVQUKBA var17 = field441[var5];
				if (var17 != null) {
					method90(var17.field1087[0], false, field403.field1087[0], 0, var17.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
					field518 = field832;
					field519 = field833;
					field521 = 2;
					field520 = 0;
					field498.method536(242);
					field498.method571(var5);
				}
			}

			if (var4 == 18) {
				boolean var18 = method90(var3, false, field403.field1087[0], 0, var2, 0, 0, 0, 2, field403.field1086[0], 0);
				if (!var18) {
					method90(var3, false, field403.field1087[0], 0, var2, 0, 1, 1, 2, field403.field1086[0], 0);
				}

				field518 = field832;
				field519 = field833;
				field521 = 2;
				field520 = 0;
				field498.method536(189);
				field498.method572(field278);
				field498.method538(field168 + var3);
				field498.method571(var5);
				field498.method570(field167 + var2);
			}

			if (var4 == 36) {
				String var20 = field406[arg0];
				int var21 = var20.indexOf("@whi@");
				if (var21 != -1) {
					if (field343 == -1) {
						method146();
						field312 = var20.substring(var21 + 5).trim();
						field250 = false;

						for (int var22 = 0; var22 < CPNGZAUN.field578.length; var22++) {
							if (CPNGZAUN.field578[var22] != null && CPNGZAUN.field578[var22].field609 == 600) {
								field246 = field343 = CPNGZAUN.field578[var22].field621;
								break;
							}
						}
					} else {
						method131(0, "", "Please close the interface you have open before using 'report abuse'");
					}
				}
			}

			if (var4 == 916 && method130(var3, var2, var5)) {
				field498.method536(217);
				field498.method570(field468);
				field498.method538(var5 >> 14 & 0x7FFF);
				field498.method571(field167 + var2);
				field498.method538(field469);
				field498.method572(field168 + var3);
				field498.method538(field467);
			}

			if (var4 == 668) {
				boolean var23 = method90(var3, false, field403.field1087[0], 0, var2, 0, 0, 0, 2, field403.field1086[0], 0);
				if (!var23) {
					method90(var3, false, field403.field1087[0], 0, var2, 0, 1, 1, 2, field403.field1086[0], 0);
				}

				field518 = field832;
				field519 = field833;
				field521 = 2;
				field520 = 0;
				field498.method536(61);
				field498.method571(field168 + var3);
				field498.method572(field469);
				field498.method538(var5);
				field498.method571(field467);
				field498.method572(field468);
				field498.method571(field167 + var2);
			}

			if (var4 == 413) {
				TEBIXSCV var25 = field500[var5];
				if (var25 != null) {
					method90(var25.field1087[0], false, field403.field1087[0], 0, var25.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
					field518 = field832;
					field519 = field833;
					field521 = 2;
					field520 = 0;
					field498.method536(37);
					field498.method572(var5);
				}
			}

			if (var4 == 965) {
				field498.method536(246);
				field498.method538(var2);
				field498.method572(field469);
				field498.method571(var5);
				field498.method570(var3);
				field498.method571(field468);
				field498.method570(field467);
				field194 = 0;
				field195 = var3;
				field196 = var2;
				field197 = 2;
				if (CPNGZAUN.field578[var3].field621 == field343) {
					field197 = 1;
				}

				if (CPNGZAUN.field578[var3].field621 == field316) {
					field197 = 3;
				}
			}

			if (var4 == 858 || var4 == 380 || var4 == 125 || var4 == 935) {
				String var26 = field406[arg0];
				int var27 = var26.indexOf("@whi@");
				if (var27 != -1) {
					long var28 = LBRUMXRC.method253(var26.substring(var27 + 5).trim());
					if (var4 == 858) {
						method106(var28);
					}

					if (var4 == 380) {
						method78(var28);
					}

					if (var4 == 125) {
						method88(var28);
					}

					if (var4 == 935) {
						method56(var28);
					}
				}
			}

			if (var4 == 258) {
				boolean var30 = method90(var3, false, field403.field1087[0], 0, var2, 0, 0, 0, 2, field403.field1086[0], 0);
				if (!var30) {
					method90(var3, false, field403.field1087[0], 0, var2, 0, 1, 1, 2, field403.field1086[0], 0);
				}

				field518 = field832;
				field519 = field833;
				field521 = 2;
				field520 = 0;
				field508 += field167;
				if (field508 >= 117) {
					field498.method536(235);
					field498.method541(0);
					field508 = 0;
				}

				field498.method536(33);
				field498.method538(field167 + var2);
				field498.method570(var5);
				field498.method572(field168 + var3);
			}

			if (var4 == 293) {
				method146();
			}

			if (var4 == 885) {
				String var32 = field406[arg0];
				int var33 = var32.indexOf("@whi@");
				if (var33 != -1) {
					long var34 = LBRUMXRC.method253(var32.substring(var33 + 5).trim());
					int var36 = -1;
					for (int var37 = 0; var37 < field383; var37++) {
						if (field100[var37] == var34) {
							var36 = var37;
							break;
						}
					}

					if (var36 != -1 && field112[var36] > 0) {
						field227 = true;
						field429 = 0;
						field216 = true;
						field131 = "";
						field186 = 3;
						field136 = field100[var36];
						field193 = "Enter message to send to " + field341[var36];
					}
				}
			}

			if (var4 == 242) {
				boolean var38 = method90(var3, false, field403.field1087[0], 0, var2, 0, 0, 0, 2, field403.field1086[0], 0);
				if (!var38) {
					method90(var3, false, field403.field1087[0], 0, var2, 0, 1, 1, 2, field403.field1086[0], 0);
				}

				field518 = field832;
				field519 = field833;
				field521 = 2;
				field520 = 0;
				field400++;
				if (field400 >= 140) {
					field498.method536(204);
					field498.method537(177);
					field400 = 0;
				}

				field498.method536(175);
				field498.method572(var5);
				field498.method570(field167 + var2);
				field498.method570(field168 + var3);
			}

			if (var4 == 1731) {
				SWITYBRD var40 = SWITYBRD.method416(var5);
				String var41;
				if (var40.field1220 == null) {
					var41 = "It's a " + var40.field1207 + ".";
				} else {
					var41 = new String(var40.field1220);
				}

				method131(0, "", var41);
			}

			if (var4 == 421) {
				field498.method536(55);
				field498.method572(var3);
				field498.method571(var2);
				field498.method538(var5);
				field194 = 0;
				field195 = var3;
				field196 = var2;
				field197 = 2;
				if (CPNGZAUN.field578[var3].field621 == field343) {
					field197 = 1;
				}

				if (CPNGZAUN.field578[var3].field621 == field316) {
					field197 = 3;
				}
			}

			if (var4 == 228) {
				field498.method536(144);
				field498.method538(var3);
				CPNGZAUN var42 = CPNGZAUN.field578[var3];
				if (var42.field581 != null && var42.field581[0][0] == 5) {
					int var43 = var42.field581[0][1];
					field476[var43] = 1 - field476[var43];
					method171(var43);
					field385 = true;
				}
			}

			if (var4 == 115) {
				method130(var3, var2, var5);
				field498.method536(72);
				field498.method538(field168 + var3);
				field498.method571(var5 >> 14 & 0x7FFF);
				field498.method571(field167 + var2);
			}

			if (var4 == 536) {
				TEBIXSCV var44 = field500[var5];
				if (var44 != null) {
					method90(var44.field1087[0], false, field403.field1087[0], 0, var44.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
					field518 = field832;
					field519 = field833;
					field521 = 2;
					field520 = 0;
					field498.method536(220);
					field498.method538(var5);
				}
			}

			if (var4 == 1468) {
				TEBIXSCV var45 = field500[var5];
				if (var45 != null) {
					ZDMOUFDZ var46 = var45.field1257;
					if (var46.field1455 != null) {
						var46 = var46.method528();
					}

					if (var46 != null) {
						String var47;
						if (var46.field1446 == null) {
							var47 = "It's a " + var46.field1448 + ".";
						} else {
							var47 = new String(var46.field1446);
						}

						method131(0, "", var47);
					}
				}
			}

			if (var4 == 647) {
				QIVQUKBA var48 = field441[var5];
				if (var48 != null) {
					method90(var48.field1087[0], false, field403.field1087[0], 0, var48.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
					field518 = field832;
					field519 = field833;
					field521 = 2;
					field520 = 0;
					field498.method536(179);
					field498.method538(field468);
					field498.method538(field467);
					field498.method570(var5);
					field498.method571(field469);
				}
			}

			if (var4 == 993) {
				field498.method536(43);
				field498.method538(var3);
				field498.method572(var5);
				field498.method570(var2);
				field194 = 0;
				field195 = var3;
				field196 = var2;
				field197 = 2;
				if (CPNGZAUN.field578[var3].field621 == field343) {
					field197 = 1;
				}

				if (CPNGZAUN.field578[var3].field621 == field316) {
					field197 = 3;
				}
			}

			if (var4 == 583) {
				field498.method536(114);
				field498.method571(var5);
				field498.method572(var3);
				field498.method572(var2);
				field194 = 0;
				field195 = var3;
				field196 = var2;
				field197 = 2;
				if (CPNGZAUN.field578[var3].field621 == field343) {
					field197 = 1;
				}

				if (CPNGZAUN.field578[var3].field621 == field316) {
					field197 = 3;
				}
			}

			if (var4 == 534) {
				field466 = 1;
				field467 = var2;
				field468 = var3;
				field469 = var5;
				field470 = SWITYBRD.method416(var5).field1207;
				field277 = 0;
				field385 = true;
			} else {
				if (var4 == 723) {
					TEBIXSCV var49 = field500[var5];
					if (var49 != null) {
						method90(var49.field1087[0], false, field403.field1087[0], 0, var49.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
						field518 = field832;
						field519 = field833;
						field521 = 2;
						field520 = 0;
						field498.method536(17);
						field498.method571(var5);
					}
				}

				if (var4 == 882) {
					TEBIXSCV var50 = field500[var5];
					if (var50 != null) {
						method90(var50.field1087[0], false, field403.field1087[0], 0, var50.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
						field518 = field832;
						field519 = field833;
						field521 = 2;
						field520 = 0;
						field498.method536(69);
						field498.method538(var5);
					}
				}

				if (var4 == 542) {
					TEBIXSCV var51 = field500[var5];
					if (var51 != null) {
						method90(var51.field1087[0], false, field403.field1087[0], 0, var51.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
						field518 = field832;
						field519 = field833;
						field521 = 2;
						field520 = 0;
						field498.method536(247);
						field498.method572(var5);
						field498.method570(field468);
						field498.method570(field467);
						field498.method571(field469);
					}
				}

				if (var4 == 290) {
					field498.method536(230);
					field498.method571(var2);
					field498.method571(var5);
					field498.method538(var3);
					field194 = 0;
					field195 = var3;
					field196 = var2;
					field197 = 2;
					if (CPNGZAUN.field578[var3].field621 == field343) {
						field197 = 1;
					}

					if (CPNGZAUN.field578[var3].field621 == field316) {
						field197 = 3;
					}
				}

				if (var4 == 429) {
					method130(var3, var2, var5);
					field498.method536(159);
					field498.method571(var5 >> 14 & 0x7FFF);
					field498.method572(field167 + var2);
					field498.method538(field168 + var3);
				}

				if (var4 == 834) {
					QIVQUKBA var52 = field441[var5];
					if (var52 != null) {
						method90(var52.field1087[0], false, field403.field1087[0], 0, var52.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
						field518 = field832;
						field519 = field833;
						field521 = 2;
						field520 = 0;
						field498.method536(12);
						field498.method538(var5);
						field498.method571(field278);
					}
				}

				if (var4 == 239) {
					field498.method536(248);
					field498.method538(var2);
					field498.method538(var3);
					field498.method571(var5);
					field194 = 0;
					field195 = var3;
					field196 = var2;
					field197 = 2;
					if (CPNGZAUN.field578[var3].field621 == field343) {
						field197 = 1;
					}

					if (CPNGZAUN.field578[var3].field621 == field316) {
						field197 = 3;
					}
				}

				if (var4 == 763) {
					CPNGZAUN var53 = CPNGZAUN.field578[var3];
					field277 = 1;
					field278 = var3;
					field279 = var53.field593;
					field466 = 0;
					field385 = true;
					String var54 = var53.field577;
					if (var54.indexOf(" ") != -1) {
						var54 = var54.substring(0, var54.indexOf(" "));
					}

					String var55 = var53.field577;
					if (var55.indexOf(" ") != -1) {
						var55 = var55.substring(var55.indexOf(" ") + 1);
					}

					field280 = var54 + " " + var53.field628 + " " + var55;

					if (field279 == 16) {
						field385 = true;
						field492 = 3;
						field226 = true;
					}
				} else {
					if (var4 == 975 || var4 == 326) {
						String var56 = field406[arg0];
						int var57 = var56.indexOf("@whi@");
						if (var57 != -1) {
							var56 = var56.substring(var57 + 5).trim();
							String var58 = LBRUMXRC.method257(LBRUMXRC.method254(LBRUMXRC.method253(var56)));
							boolean var59 = false;
							for (int var60 = 0; var60 < field442; var60++) {
								QIVQUKBA var61 = field441[field443[var60]];
								if (var61 != null && var61.field1106 != null && var61.field1106.equalsIgnoreCase(var58)) {
									method90(var61.field1087[0], false, field403.field1087[0], 0, var61.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);

									if (var4 == 975) {
										field498.method536(203);
										field498.method572(field443[var60]);
									}

									if (var4 == 326) {
										field498.method536(162);
										field498.method538(field443[var60]);
									}

									var59 = true;
									break;
								}
							}

							if (!var59) {
								method131(0, "", "Unable to find " + var58);
							}
						}
					}

					if (var4 == 362) {
						TEBIXSCV var62 = field500[var5];
						if (var62 != null) {
							method90(var62.field1087[0], false, field403.field1087[0], 0, var62.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
							field518 = field832;
							field519 = field833;
							field521 = 2;
							field520 = 0;
							field498.method536(79);
							field498.method570(var5);
						}
					}

					if (var4 == 135) {
						field498.method536(1);
						field498.method570(var2);
						field498.method538(var5);
						field498.method571(var3);
						field194 = 0;
						field195 = var3;
						field196 = var2;
						field197 = 2;
						if (CPNGZAUN.field578[var3].field621 == field343) {
							field197 = 1;
						}

						if (CPNGZAUN.field578[var3].field621 == field316) {
							field197 = 3;
						}
					}

					if (var4 == 253) {
						QIVQUKBA var63 = field441[var5];
						if (var63 != null) {
							method90(var63.field1087[0], false, field403.field1087[0], 0, var63.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
							field518 = field832;
							field519 = field833;
							field521 = 2;
							field520 = 0;
							field498.method536(78);
							field498.method571(var5);
						}
					}

					if (var4 == 760) {
						if (field191) {
							field489.method330(var3 - 4, var2 - 4);
						} else {
							field489.method330(field833 - 4, field832 - 4);
						}
					}

					if (var4 == 914) {
						TEBIXSCV var64 = field500[var5];
						if (var64 != null) {
							method90(var64.field1087[0], false, field403.field1087[0], 0, var64.field1086[0], 0, 1, 1, 2, field403.field1086[0], 0);
							field518 = field832;
							field519 = field833;
							field521 = 2;
							field520 = 0;
							field498.method536(44);
							field498.method572(field278);
							field498.method572(var5);
						}
					}

					if (var4 == 969 && method130(var3, var2, var5)) {
						field498.method536(73);
						field498.method571(field168 + var3);
						field498.method572(field167 + var2);
						field498.method570(field278);
						field498.method571(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 931) {
						CPNGZAUN var65 = CPNGZAUN.field578[var3];
						boolean var66 = true;
						if (var65.field609 > 0) {
							var66 = method136(var65);
						}

						if (var66) {
							field498.method536(144);
							field498.method538(var3);
						}
					}

					if (var4 == 1275) {
						method130(var3, var2, var5);
						field498.method536(38);
						field498.method538(field168 + var3);
						field498.method572(var5 >> 14 & 0x7FFF);
						field498.method572(field167 + var2);
					}

					if (var4 == 580) {
						field498.method536(137);
						field498.method538(var5);
						field498.method538(var2);
						field498.method538(var3);
						field194 = 0;
						field195 = var3;
						field196 = var2;
						field197 = 2;
						if (CPNGZAUN.field578[var3].field621 == field343) {
							field197 = 1;
						}

						if (CPNGZAUN.field578[var3].field621 == field316) {
							field197 = 3;
						}
					}

					if (var4 == 172) {
						boolean var67 = method90(var3, false, field403.field1087[0], 0, var2, 0, 0, 0, 2, field403.field1086[0], 0);
						if (!var67) {
							method90(var3, false, field403.field1087[0], 0, var2, 0, 1, 1, 2, field403.field1086[0], 0);
						}

						field518 = field832;
						field519 = field833;
						field521 = 2;
						field520 = 0;
						field498.method536(22);
						field498.method570(var5);
						field498.method572(field167 + var2);
						field498.method570(field168 + var3);
					}

					if (var4 == 550) {
						if ((var5 & 0x3) == 0) {
							field214++;
						}

						if (field214 >= 98) {
							field498.method536(117);
							field498.method541(0);
							field214 = 0;
						}

						field498.method536(99);
						field498.method572(var3);
						field498.method572(var2);
						field498.method570(var5);
						field194 = 0;
						field195 = var3;
						field196 = var2;
						field197 = 2;
						if (CPNGZAUN.field578[var3].field621 == field343) {
							field197 = 1;
						}

						if (CPNGZAUN.field578[var3].field621 == field316) {
							field197 = 3;
						}
					}

					if (var4 == 746) {
						boolean var69 = method90(var3, false, field403.field1087[0], 0, var2, 0, 0, 0, 2, field403.field1086[0], 0);
						if (!var69) {
							method90(var3, false, field403.field1087[0], 0, var2, 0, 1, 1, 2, field403.field1086[0], 0);
						}

						field518 = field832;
						field519 = field833;
						field521 = 2;
						field520 = 0;
						field265++;
						if (field265 >= 90) {
							field498.method536(130);
							field498.method541(0);
							field265 = 0;
						}

						field498.method536(97);
						field498.method572(field167 + var2);
						field498.method572(var5);
						field498.method571(field168 + var3);
					}

					if (var4 == 390) {
						if ((var5 & 0x3) == 0) {
							field251++;
						}

						if (field251 >= 63) {
							field498.method536(164);
							field498.method537(89);
							field251 = 0;
						}

						method130(var3, var2, var5);
						field498.method536(76);
						field498.method571(field167 + var2);
						field498.method570(var5 >> 14 & 0x7FFF);
						field498.method571(field168 + var3);
					}

					if (var4 == 919) {
						field498.method536(127);
						field498.method571(var3);
						field498.method572(var5);
						field498.method538(var2);
						field194 = 0;
						field195 = var3;
						field196 = var2;
						field197 = 2;
						if (CPNGZAUN.field578[var3].field621 == field343) {
							field197 = 1;
						}

						if (CPNGZAUN.field578[var3].field621 == field316) {
							field197 = 3;
						}
					}

					if (var4 == 229) {
						boolean var71 = method90(var3, false, field403.field1087[0], 0, var2, 0, 0, 0, 2, field403.field1086[0], 0);
						if (!var71) {
							method90(var3, false, field403.field1087[0], 0, var2, 0, 1, 1, 2, field403.field1086[0], 0);
						}

						field518 = field832;
						field519 = field833;
						field521 = 2;
						field520 = 0;
						field498.method536(115);
						field498.method538(var5);
						field498.method538(field168 + var3);
						field498.method538(field167 + var2);
					}

					field466 = 0;
					field277 = 0;
					field385 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method77() {
		if (field243 == 0) {
			int var1 = field831;
			if (field277 == 1 && field832 >= 516 && field833 >= 160 && field832 <= 765 && field833 <= 205) {
				var1 = 0;
			}

			if (field191) {
				if (var1 != 1) {
					int var2 = field825;
					int var3 = field826;
					if (field332 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field332 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field332 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field333 - 10 || var2 > field335 + field333 + 10 || var3 < field334 - 10 || var3 > field336 + field334 + 10) {
						field191 = false;

						if (field332 == 1) {
							field385 = true;
						}

						if (field332 == 2) {
							field227 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field333;
					int var5 = field334;
					int var6 = field335;
					int var7 = field832;
					int var8 = field833;
					if (field332 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field332 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field332 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field436; var10++) {
						int var11 = (field436 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method76(var9);
					}

					field191 = false;

					if (field332 == 1) {
						field385 = true;
					}

					if (field332 == 2) {
						field227 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field436 > 0) {
					int var12 = field369[field436 - 1];
					if (var12 == 993 || var12 == 583 || var12 == 646 || var12 == 239 || var12 == 290 || var12 == 550 || var12 == 135 || var12 == 580 || var12 == 919 || var12 == 421 || var12 == 534 || var12 == 1176) {
						int var13 = field367[field436 - 1];
						int var14 = field368[field436 - 1];
						CPNGZAUN var15 = CPNGZAUN.field578[var14];
						if (var15.field602 || var15.field634) {
							field230 = false;
							field205 = 0;
							field241 = var14;
							field242 = var13;
							field243 = 2;
							field244 = field832;
							field245 = field833;

							if (CPNGZAUN.field578[var14].field621 == field343) {
								field243 = 1;
							}

							if (CPNGZAUN.field578[var14].field621 == field316) {
								field243 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field448 == 1 || method47(field436 - 1)) && field436 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field436 > 0) {
					method76(field436 - 1);
				}

				if (var1 != 2 || field436 <= 0) {
					return;
				}

				method110();
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method78(long arg0) {
		if (arg0 != 0L) {
			if (field435 >= 100) {
				method131(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = LBRUMXRC.method257(LBRUMXRC.method254(arg0));
				for (int var4 = 0; var4 < field435; var4++) {
					if (field276[var4] == arg0) {
						method131(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field383; var5++) {
					if (field100[var5] == arg0) {
						method131(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field276[field435++] = arg0;
				field385 = true;
				field498.method536(70);
				field498.method543(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method79() {
		field506 = true;
	}

	public final void run() {
		if (field398) {
			method161();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method80(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method81(int arg0, String arg1) {
		field204 = arg0;
		field255 = arg1;
		method164();

		if (field111 == null) {
			super.method81(arg0, arg1);
		} else {
			field288.method212();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field451.method237(var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...", var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			LRYUPGSZ.method270(var6, 34, 304, var3 / 2 - 152, 0x8C1111);
			LRYUPGSZ.method270(var6 + 1, 32, 302, var3 / 2 - 151, 0);
			LRYUPGSZ.method269(0x8C1111, arg0 * 3, 30, var6 + 2, var3 / 2 - 150);
			LRYUPGSZ.method269(0, 300 - arg0 * 3, 30, var6 + 2, arg0 * 3 + (var3 / 2 - 150));
			field451.method237(var4 / 2 + 5 - var5, 0xFFFFFF, arg1, var3 / 2);
			field288.method213(202, field817, 171);

			if (field506) {
				field506 = false;

				if (!field465) {
					field289.method213(0, field817, 0);
					field290.method213(637, field817, 0);
				}

				field286.method213(128, field817, 0);
				field287.method213(202, field817, 371);
				field291.method213(0, field817, 265);
				field292.method213(562, field817, 265);
				field293.method213(128, field817, 171);
				field294.method213(562, field817, 171);
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method82() {
		if (field496 == 2) {
			method128((field375 - field168 << 7) + field378, field376 * 2, (field374 - field167 << 7) + field377);

			if (field410 > -1 && field399 % 20 < 10) {
				field314[2].method281(field411 - 28, field410 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(LCPNGZAUN;Z)V")
	public final void method83(CPNGZAUN arg0) {
		int var2 = arg0.field609;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field384 == 0) {
				arg0.field598 = "Loading friend list";
				arg0.field600 = 0;
			} else if (var2 == 1 && field384 == 1) {
				arg0.field598 = "Connecting to friendserver";
				arg0.field600 = 0;
			} else if (var2 == 2 && field384 != 2) {
				arg0.field598 = "Please wait...";
				arg0.field600 = 0;
			} else {
				int var3 = field383;
				if (field384 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field598 = "";
					arg0.field600 = 0;
				} else {
					arg0.field598 = field341[var2];
					arg0.field600 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field383;
			if (field384 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field598 = "";
				arg0.field600 = 0;
			} else {
				if (field112[var2] == 0) {
					arg0.field598 = "@red@Offline";
				} else if (field112[var2] < 200) {
					if (field112[var2] == field350) {
						arg0.field598 = "@gre@World-" + (field112[var2] - 9);
					} else {
						arg0.field598 = "@yel@World-" + (field112[var2] - 9);
					}
				} else if (field112[var2] == field350) {
					arg0.field598 = "@gre@Classic" + (field112[var2] - 219);
				} else {
					arg0.field598 = "@yel@Classic" + (field112[var2] - 219);
				}

				arg0.field600 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field383;
			if (field384 != 2) {
				var5 = 0;
			}

			arg0.field616 = var5 * 15 + 20;
			if (arg0.field616 <= arg0.field575) {
				arg0.field616 = arg0.field575 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field384 == 0) {
				arg0.field598 = "Loading ignore list";
				arg0.field600 = 0;
			} else if (var2 == 1 && field384 == 0) {
				arg0.field598 = "Please wait...";
				arg0.field600 = 0;
			} else {
				int var6 = field435;
				if (field384 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field598 = "";
					arg0.field600 = 0;
				} else {
					arg0.field598 = LBRUMXRC.method257(LBRUMXRC.method254(field276[var2]));
					arg0.field600 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field616 = field435 * 15 + 20;
			if (arg0.field616 <= arg0.field575) {
				arg0.field616 = arg0.field575 + 1;
			}
		} else if (var2 == 327) {
			arg0.field591 = 150;
			arg0.field592 = (int) (Math.sin(field399 / 40.0D) * 256.0D) & 0x7FF;

			if (field362) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field264[var7];
					if (var8 >= 0 && !FAQFGVMF.field759[var8].method217()) {
						return;
					}
				}

				field362 = false;
				CCYECDYX[] var9 = new CCYECDYX[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field264[var11];
					if (var12 >= 0) {
						var9[var10++] = FAQFGVMF.field759[var12].method218();
					}
				}

				CCYECDYX var13 = new CCYECDYX(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field509[var14] != 0) {
						var13.method25(field208[var14][0], field208[var14][field509[var14]]);

						if (var14 == 1) {
							var13.method25(field473[0], field473[field509[var14]]);
						}
					}
				}

				var13.method18();
				var13.method19(ISUBRNPG.field786[field403.field1047].field788[0]);
				var13.method28(64, 850, -30, -50, -30, true);
				arg0.field625 = 5;
				arg0.field626 = 0;
				CPNGZAUN.method200(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field142 == null) {
				field142 = arg0.field595;
				field143 = arg0.field589;
			}

			if (field427) {
				arg0.field595 = field143;
			} else {
				arg0.field595 = field142;
			}
		} else if (var2 == 325) {
			if (field142 == null) {
				field142 = arg0.field595;
				field143 = arg0.field589;
			}

			if (field427) {
				arg0.field595 = field142;
			} else {
				arg0.field595 = field143;
			}
		} else if (var2 == 600) {
			arg0.field598 = field312;
			if (field399 % 20 < 10) {
				arg0.field598 = arg0.field598 + "|";
			} else {
				arg0.field598 = arg0.field598 + " ";
			}
		} else if (var2 == 613) {
			if (field256 < 1) {
				arg0.field598 = "";
			} else if (field250) {
				arg0.field611 = 0xFF0000;
				arg0.field598 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field611 = 0xFFFFFF;
				arg0.field598 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field477 == 0) {
				arg0.field598 = "";
			} else {
				String var15;
				if (field219 == 0) {
					var15 = "earlier today";
				} else if (field219 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field219 + " days ago";
				}

				arg0.field598 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field248 == 0) {
				arg0.field598 = "0 unread messages";
				arg0.field611 = 0xFFFF00;
			}

			if (field248 == 1) {
				arg0.field598 = "1 unread message";
				arg0.field611 = 0xFF00;
			}

			if (field248 > 1) {
				arg0.field598 = field248 + " unread messages";
				arg0.field611 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field139 == 201) {
				if (field160 == 1) {
					arg0.field598 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field598 = "";
				}
			} else if (field139 == 200) {
				arg0.field598 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field139 == 0) {
					var16 = "Earlier today";
				} else if (field139 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field139 + " days ago";
				}

				arg0.field598 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field139 == 201) {
				if (field160 == 1) {
					arg0.field598 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field598 = "";
				}
			} else if (field139 == 200) {
				arg0.field598 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field598 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field139 == 201) {
				if (field160 == 1) {
					arg0.field598 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field598 = "";
				}
			} else if (field139 == 200) {
				arg0.field598 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field598 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(IILZOMNSJJM;)V")
	public final void method84(int arg0, ZOMNSJJM arg1) {
		arg1.method557();
		int var3 = arg1.method558(1);
		if (var3 != 0) {
			int var4 = arg1.method558(2);
			if (var4 == 0) {
				field445[field444++] = field440;
			} else if (var4 == 1) {
				int var5 = arg1.method558(3);
				field403.method371(var5, false);
				int var6 = arg1.method558(1);
				if (var6 == 1) {
					field445[field444++] = field440;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method558(3);
				field403.method371(var7, true);
				int var8 = arg1.method558(3);
				field403.method371(var8, true);
				int var9 = arg1.method558(1);
				if (var9 == 1) {
					field445[field444++] = field440;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method558(7);
				field190 = arg1.method558(2);
				int var11 = arg1.method558(7);
				int var12 = arg1.method558(1);
				int var13 = arg1.method558(1);
				if (var13 == 1) {
					field445[field444++] = field440;
				}

				field403.method373(var12 == 1, var11, var10);
			}
		}
	}

	@ObfuscatedName("client.a(LZOMNSJJM;II)V")
	public final void method85(ZOMNSJJM arg0, int arg1) {
		field152 = 0;
		field444 = 0;
		method84(arg1, arg0);
		method62(arg1, arg0);
		method52(arg0, arg1);
		method139(arg1, arg0);

		for (int var3 = 0; var3 < field152; var3++) {
			int var4 = field153[var3];
			if (field399 != field441[var4].field1067) {
				field441[var4] = null;
			}
		}

		if (arg0.field1457 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1457 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field442; var5++) {
			if (field441[field443[var5]] == null) {
				signlink.reporterror(field431 + " null entry in pl list - pos:" + var5 + " size:" + field442);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field489.method318(arg0, arg4, arg3);
		if (var6 != 0) {
			int var7 = field489.method322(arg0, arg4, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field420.field889;
			int var12 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			NNGZIOFO var14 = NNGZIOFO.method350(var13);
			if (var14.field989 == -1) {
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
				TAIXVIBM var15 = field387[var14.field989];
				if (var15 != null) {
					int var16 = (var14.field966 * 4 - var15.field1250) / 2;
					int var17 = (var14.field983 * 4 - var15.field1251) / 2;
					var15.method428((104 - arg3 - var14.field983) * 4 + var17 + 48, arg4 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field489.method320(arg0, arg4, arg3);
		if (var18 != 0) {
			int var19 = field489.method322(arg0, arg4, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			NNGZIOFO var23 = NNGZIOFO.method350(var22);
			if (var23.field989 != -1) {
				TAIXVIBM var24 = field387[var23.field989];
				if (var24 != null) {
					int var25 = (var23.field966 * 4 - var24.field1250) / 2;
					int var26 = (var23.field983 * 4 - var24.field1251) / 2;
					var24.method428((104 - arg3 - var23.field983) * 4 + var26 + 48, arg4 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field420.field889;
				int var29 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field489.method321(arg0, arg4, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			NNGZIOFO var32 = NNGZIOFO.method350(var31);
			if (var32.field989 != -1) {
				TAIXVIBM var33 = field387[var32.field989];
				if (var33 != null) {
					int var34 = (var32.field966 * 4 - var33.field1250) / 2;
					int var35 = (var32.field983 * 4 - var33.field1251) / 2;
					var33.method428((104 - arg3 - var32.field983) * 4 + var35 + 48, arg4 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field510.method428(arg1, arg2);
		field511.method428(arg1 + arg4 - 16, arg2);
		LRYUPGSZ.method269(field321, 16, arg4 - 32, arg1 + 16, arg2);
		int var6 = (arg4 - 32) * arg4 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg3 / (arg0 - arg4);
		LRYUPGSZ.method269(field126, 16, var6, arg1 + var7 + 16, arg2);
		LRYUPGSZ.method274(var6, field356, arg1 + var7 + 16, arg2);
		LRYUPGSZ.method274(var6, field356, arg1 + var7 + 16, arg2 + 1);
		LRYUPGSZ.method272(field356, 16, arg2, arg1 + var7 + 16);
		LRYUPGSZ.method272(field356, 16, arg2, arg1 + var7 + 17);
		LRYUPGSZ.method274(var6, field146, arg1 + var7 + 16, arg2 + 15);
		LRYUPGSZ.method274(var6 - 1, field146, arg1 + var7 + 17, arg2 + 14);
		LRYUPGSZ.method272(field146, 16, arg2, arg1 + var7 + var6 + 15);
		LRYUPGSZ.method272(field146, 15, arg2 + 1, arg1 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method88(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field383; var3++) {
				if (field100[var3] == arg0) {
					field383--;
					field385 = true;

					for (int var4 = var3; var4 < field383; var4++) {
						field341[var4] = field341[var4 + 1];
						field112[var4] = field112[var4 + 1];
						field100[var4] = field100[var4 + 1];
					}

					field498.method536(31);
					field498.method543(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZIIIIILCPNGZAUN;)V")
	public final void method89(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, CPNGZAUN arg7) {
		if (field137) {
			field475 = 32;
		} else {
			field475 = 0;
		}

		field137 = false;
		if (arg6 >= arg5 && arg6 < arg5 + 16 && arg1 >= arg0 && arg1 < arg0 + 16) {
			arg7.field572 -= field486 * 4;

			if (arg2) {
				field385 = true;
				return;
			}
		} else if (arg6 >= arg5 && arg6 < arg5 + 16 && arg1 >= arg0 + arg4 - 16 && arg1 < arg0 + arg4) {
			arg7.field572 += field486 * 4;

			if (arg2) {
				field385 = true;
				return;
			}
		} else if (arg6 >= arg5 - field475 && arg6 < arg5 + field475 + 16 && arg1 >= arg0 + 16 && arg1 < arg0 + arg4 - 16 && field486 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg0 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg7.field572 = (arg3 - arg4) * var10 / var11;

			if (arg2) {
				field385 = true;
			}

			field137 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IZIZIIIIIIII)Z")
	public final boolean method90(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field430[var14][var15] = 0;
				field147[var14][var15] = 99999999;
			}
		}

		int var16 = arg9;
		int var17 = arg2;
		field430[arg9][arg2] = 99;
		field147[arg9][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field200[var18] = arg9;
		int var35 = var18 + 1;
		field201[var18] = arg2;
		boolean var20 = false;
		int var21 = field200.length;
		int[][] var22 = field275[field190].field1021;
		while (var35 != var19) {
			var16 = field200[var19];
			var17 = field201[var19];
			var19 = (var19 + 1) % var21;

			if (arg4 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && field275[field190].method363(var16, arg3 - 1, arg0, var17, arg4, arg5)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && field275[field190].method364(arg5, var16, var17, arg0, arg3 - 1, arg4)) {
					var20 = true;
					break;
				}
			}

			if (arg7 != 0 && arg6 != 0 && field275[field190].method365(arg4, arg0, arg7, arg10, var17, var16, arg6)) {
				var20 = true;
				break;
			}

			int var23 = field147[var16][var17] + 1;
			if (var16 > 0 && field430[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field200[var35] = var16 - 1;
				field201[var35] = var17;
				var35 = (var35 + 1) % var21;
				field430[var16 - 1][var17] = 2;
				field147[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field430[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field200[var35] = var16 + 1;
				field201[var35] = var17;
				var35 = (var35 + 1) % var21;
				field430[var16 + 1][var17] = 8;
				field147[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field430[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field200[var35] = var16;
				field201[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field430[var16][var17 - 1] = 1;
				field147[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field430[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field200[var35] = var16;
				field201[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field430[var16][var17 + 1] = 4;
				field147[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field430[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field200[var35] = var16 - 1;
				field201[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field430[var16 - 1][var17 - 1] = 3;
				field147[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field430[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field200[var35] = var16 + 1;
				field201[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field430[var16 + 1][var17 - 1] = 9;
				field147[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field430[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field200[var35] = var16 - 1;
				field201[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field430[var16 - 1][var17 + 1] = 6;
				field147[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field430[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field200[var35] = var16 + 1;
				field201[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field430[var16 + 1][var17 + 1] = 12;
				field147[var16 + 1][var17 + 1] = var23;
			}
		}

		field259 = 0;
		if (!var20) {
			if (arg1) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg4 - var25; var26 <= arg4 + var25; var26++) {
						for (int var27 = arg0 - var25; var27 <= arg0 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field147[var26][var27] < var24) {
								var24 = field147[var26][var27];
								var16 = var26;
								var17 = var27;
								field259 = 1;
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
		field200[var28] = var16;
		int var36 = var28 + 1;
		field201[var28] = var17;
		int var29;
		int var30 = var29 = field430[var16][var17];
		while (arg9 != var16 || arg2 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field200[var36] = var16;
				field201[var36++] = var17;
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

			var30 = field430[var16][var17];
		}

		if (var36 <= 0) {
			if (arg8 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field200[var36];
		int var33 = field201[var36];

		if (arg8 == 0) {
			field498.method536(109);
			field498.method537(var31 + var31 + 3);
		}

		if (arg8 == 1) {
			field498.method536(90);
			field498.method537(var31 + var31 + 3 + 14);
		}

		if (arg8 == 2) {
			field498.method536(54);
			field498.method537(var31 + var31 + 3);
		}

		field418 = field200[0];
		field419 = field201[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field498.method563(field200[var36] - var32);
			field498.method563(field201[var36] - var33);
		}

		field498.method570(field168 + var33);
		field498.method537(field835[5] == 1 ? 1 : 0);
		field498.method538(field167 + var32);
		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method91(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field317 = "";
				field318 = "Connecting to server...";
				method113(true);
			}

			field192 = new BJGZFSFX(this, method162(field351 + 43594));
			long var4 = LBRUMXRC.method253(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field498.field1457 = 0;
			field498.method537(14);
			field498.method537(var6);
			field192.method5(field498.field1456, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field192.method2();
			}

			int var8 = field192.method2();
			int var9 = var8;

			if (var8 == 0) {
				field192.method4(field263.field1456, 0, 8);
				field263.field1457 = 0;
				field210 = field263.method553();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field210 >> 32), (int) field210 };
				field498.field1457 = 0;
				field498.method537(10);
				field498.method541(var10[0]);
				field498.method541(var10[1]);
				field498.method541(var10[2]);
				field498.method541(var10[3]);
				field498.method541(signlink.uid);
				field498.method544(arg0);
				field498.method544(arg1);
				field498.method562(field326, field405);
				field319.field1457 = 0;

				if (arg2) {
					field319.method537(18);
				} else {
					field319.method537(16);
				}

				field319.method537(field498.field1457 + 36 + 1 + 1 + 2);
				field319.method537(255);
				field319.method538(328);
				field319.method537(field353 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field319.method541(field372[var11]);
				}

				field319.method545(0, field498.field1457, field498.field1456);
				field498.field1461 = new ZQADNJCF(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field504 = new ZQADNJCF(var10);
				field192.method5(field319.field1456, 0, field319.field1457);
				var8 = field192.method2();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method91(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field256 = field192.method2();
				field325 = field192.method2() == 1;
				field339 = 0L;
				field138 = 0;
				field361.field766 = 0;
				field822 = true;
				field381 = true;
				field481 = true;
				field498.field1457 = 0;
				field263.field1457 = 0;
				field414 = -1;
				field395 = -1;
				field396 = -1;
				field397 = -1;
				field413 = 0;
				field415 = 0;
				field522 = 0;
				field417 = 0;
				field496 = 0;
				field436 = 0;
				field191 = false;
				field823 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field270[var13] = null;
				}

				field466 = 0;
				field277 = 0;
				field281 = 0;
				field393 = 0;
				field460 = (int) (Math.random() * 100.0D) - 50;
				field346 = (int) (Math.random() * 110.0D) - 55;
				field330 = (int) (Math.random() * 80.0D) - 40;
				field283 = (int) (Math.random() * 120.0D) - 60;
				field121 = (int) (Math.random() * 30.0D) - 20;
				field307 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field311 = 0;
				field212 = -1;
				field418 = 0;
				field419 = 0;
				field442 = 0;
				field501 = 0;

				for (int var14 = 0; var14 < field439; var14++) {
					field441[var14] = null;
					field446[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field500[var15] = null;
				}

				field403 = field441[field440] = new QIVQUKBA();
				field373.method527();
				field261.method527();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field515[var16][var17][var18] = null;
						}
					}
				}

				field366 = new YSGENUJE();
				field384 = 0;
				field383 = 0;
				field125 = -1;
				field316 = -1;
				field343 = -1;
				field329 = -1;
				field225 = -1;
				field471 = false;
				field492 = 3;
				field429 = 0;
				field191 = false;
				field216 = false;
				field249 = null;
				field394 = 0;
				field422 = -1;
				field427 = true;
				method154();

				for (int var19 = 0; var19 < 5; var19++) {
					field509[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field173[var20] = null;
					field174[var20] = false;
				}

				field474 = 0;
				field251 = 0;
				field349 = 0;
				field214 = 0;
				field508 = 0;
				field400 = 0;
				field265 = 0;
				method176();
			} else if (var8 == 3) {
				field317 = "";
				field318 = "Invalid username or password.";
			} else if (var8 == 4) {
				field317 = "Your account has been disabled.";
				field318 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field317 = "Your account is already logged in.";
				field318 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field317 = "RuneScape has been updated!";
				field318 = "Please reload this page.";
			} else if (var8 == 7) {
				field317 = "This world is full.";
				field318 = "Please use a different world.";
			} else if (var8 == 8) {
				field317 = "Unable to connect.";
				field318 = "Login server offline.";
			} else if (var8 == 9) {
				field317 = "Login limit exceeded.";
				field318 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field317 = "Unable to connect.";
				field318 = "Bad session id.";
			} else if (var8 == 11) {
				field318 = "Login server rejected session.";
				field318 = "Please try again.";
			} else if (var8 == 12) {
				field317 = "You need a members account to login to this world.";
				field318 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field317 = "Could not complete login.";
				field318 = "Please try using a different world.";
			} else if (var8 == 14) {
				field317 = "The server is being updated.";
				field318 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field481 = true;
				field498.field1457 = 0;
				field263.field1457 = 0;
				field414 = -1;
				field395 = -1;
				field396 = -1;
				field397 = -1;
				field413 = 0;
				field415 = 0;
				field522 = 0;
				field436 = 0;
				field191 = false;
				field355 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field317 = "Login attempts exceeded.";
				field318 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field317 = "You are standing in a members-only area.";
				field318 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field317 = "Invalid loginserver requested";
				field318 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field192.method2();
				for (var21 += 3; var21 >= 0; var21--) {
					field317 = "You have only just left another world";
					field318 = "Your profile will be transferred in: " + var21;
					method113(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method91(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field317 = "Unexpected server response";
				field318 = "Please try using a different world.";
			} else if (var9 != 0) {
				field317 = "No response from server";
				field318 = "Please try using a different world.";
			} else if (field187 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field187++;
				method91(arg0, arg1, arg2);
			} else {
				field317 = "No response from loginserver";
				field318 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field317 = "";
			field318 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method92() {
		field231 = 0;
		for (int var1 = -1; var1 < field501 + field442; var1++) {
			OVZHBYZU var2;
			if (var1 == -1) {
				var2 = field403;
			} else if (var1 < field442) {
				var2 = field441[field443[var1]];
			} else {
				var2 = field500[field502[var1 - field442]];
			}

			if (var2 != null && var2.method369()) {
				if (var2 instanceof TEBIXSCV) {
					ZDMOUFDZ var3 = ((TEBIXSCV) var2).field1257;
					if (var3.field1455 != null) {
						var3 = var3.method528();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field442) {
					ZDMOUFDZ var7 = ((TEBIXSCV) var2).field1257;
					if (var7.field1442 >= 0 && var7.field1442 < field314.length) {
						method127(var2.field1049 + 15, var2);

						if (field410 > -1) {
							field314[var7.field1442].method281(field411 - 30, field410 - 12);
						}
					}

					if (field496 == 1 && field502[var1 - field442] == field150 && field399 % 20 < 10) {
						method127(var2.field1049 + 15, var2);

						if (field410 > -1) {
							field314[2].method281(field411 - 28, field410 - 12);
						}
					}
				} else {
					int var4 = 30;
					QIVQUKBA var5 = (QIVQUKBA) var2;
					if (var5.field1091 != 0) {
						method127(var2.field1049 + 15, var2);

						if (field410 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field1091 & 1 << var6) != 0) {
									field314[var6].method281(field411 - var4, field410 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field496 == 10 && field443[var1] == field258) {
						method127(var2.field1049 + 15, var2);

						if (field410 > -1) {
							field314[7].method281(field411 - var4, field410 - 12);
						}
					}
				}

				if (var2.field1046 != null && (var1 >= field442 || field145 == 0 || field145 == 3 || field145 == 1 && method123(((QIVQUKBA) var2).field1106))) {
					method127(var2.field1049, var2);

					if (field410 > -1 && field231 < field232) {
						field236[field231] = field451.method240(var2.field1046) / 2;
						field235[field231] = field451.field845;
						field233[field231] = field410;
						field234[field231] = field411;
						field237[field231] = var2.field1063;
						field238[field231] = var2.field1068;
						field239[field231] = var2.field1065;
						field240[field231++] = var2.field1046;

						if (field342 == 0 && var2.field1068 >= 1 && var2.field1068 <= 3) {
							field235[field231] += 10;
							field234[field231] += 5;
						}

						if (field342 == 0 && var2.field1068 == 4) {
							field236[field231] = 60;
						}

						if (field342 == 0 && var2.field1068 == 5) {
							field235[field231] += 5;
						}
					}
				}

				if (var2.field1060 > field399) {
					method127(var2.field1049 + 15, var2);

					if (field410 > -1) {
						int var8 = var2.field1061 * 30 / var2.field1062;
						if (var8 > 30) {
							var8 = 30;
						}

						LRYUPGSZ.method269(0xFF00, var8, 5, field411 - 3, field410 - 15);
						LRYUPGSZ.method269(0xFF0000, 30 - var8, 5, field411 - 3, field410 - 15 + var8);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1054[var9] > field399) {
						method127(var2.field1049 / 2, var2);

						if (field410 > -1) {
							if (var9 == 1) {
								field411 -= 20;
							}

							if (var9 == 2) {
								field410 -= 15;
								field411 -= 10;
							}

							if (var9 == 3) {
								field410 += 15;
								field411 -= 10;
							}

							field266[var2.field1053[var9]].method281(field411 - 12, field410 - 12);
							field449.method237(field411 + 4, 0, String.valueOf(var2.field1052[var9]), field410);
							field449.method237(field411 + 3, 0xFFFFFF, String.valueOf(var2.field1052[var9]), field410 - 1);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field231; var10++) {
			int var11 = field233[var10];
			int var12 = field234[var10];
			int var13 = field236[var10];
			int var14 = field235[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field234[var16] - field235[var16] && var12 - var14 < field234[var16] + 2 && var11 - var13 < field236[var16] + field233[var16] && var11 + var13 > field233[var16] - field236[var16] && field234[var16] - field235[var16] < var12) {
						var12 = field234[var16] - field235[var16];
						var15 = true;
					}
				}
			}

			field410 = field233[var10];
			field411 = field234[var10] = var12;
			String var17 = field240[var10];
			if (field342 == 0) {
				int var18 = 0xFFFF00;
				if (field237[var10] < 6) {
					var18 = field99[field237[var10]];
				}

				if (field237[var10] == 6) {
					var18 = field482 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field237[var10] == 7) {
					var18 = field482 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field237[var10] == 8) {
					var18 = field482 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field237[var10] == 9) {
					int var19 = 150 - field239[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field237[var10] == 10) {
					int var20 = 150 - field239[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field237[var10] == 11) {
					int var21 = 150 - field239[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field238[var10] == 0) {
					field451.method237(field411 + 1, 0, var17, field410);
					field451.method237(field411, var18, var17, field410);
				}

				if (field238[var10] == 1) {
					field451.method242(var17, field410, field482, 0, field411 + 1);
					field451.method242(var17, field410, field482, var18, field411);
				}

				if (field238[var10] == 2) {
					field451.method243(field410, var17, field482, field411 + 1, 0);
					field451.method243(field410, var17, field482, field411, var18);
				}

				if (field238[var10] == 3) {
					field451.method244(field410, field411 + 1, var17, 0, field482, 150 - field239[var10]);
					field451.method244(field410, field411, var17, var18, field482, 150 - field239[var10]);
				}

				if (field238[var10] == 4) {
					int var22 = field451.method240(var17);
					int var23 = (150 - field239[var10]) * (var22 + 100) / 150;
					LRYUPGSZ.method266(0, field410 - 50, field410 + 50, 334);
					field451.method241(0, var17, field411 + 1, field410 + 50 - var23);
					field451.method241(var18, var17, field411, field410 + 50 - var23);
					LRYUPGSZ.method265();
				}

				if (field238[var10] == 5) {
					int var24 = 150 - field239[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					LRYUPGSZ.method266(field411 - field451.field845 - 1, 0, 512, field411 + 5);
					field451.method237(field411 + var25 + 1, 0, var17, field410);
					field451.method237(field411 + var25, var18, var17, field410);
					LRYUPGSZ.method265();
				}
			} else {
				field451.method237(field411 + 1, 0, var17, field410);
				field451.method237(field411, 0xFFFF00, var17, field410);
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method93() {
		method46();

		if (field521 == 1) {
			field354[field520 / 100].method281(field519 - 8 - 4, field518 - 8 - 4);
			field172++;
			if (field172 > 139) {
				field172 = 0;
				field498.method536(165);
				field498.method537(114);
			}
		}

		if (field521 == 2) {
			field354[field520 / 100 + 4].method281(field519 - 8 - 4, field518 - 8 - 4);
			field320++;
			if (field320 > 136) {
				field320 = 0;
				field498.method536(104);
				field498.method540(0xB5133A);
			}
		}

		if (field225 != -1) {
			method148(field472, field225);
			method45(0, 0, CPNGZAUN.field578[field225], 0);
		}

		if (field343 != -1) {
			method148(field472, field343);
			method45(0, 0, CPNGZAUN.field578[field343], 0);
		}

		method155();

		if (!field191) {
			method114();
			method125();
		} else if (field332 == 0) {
			method126();
		}

		if (field394 == 1) {
			field314[1].method281(296, 472);
		}

		if (field447) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field813 < 15) {
				var3 = 0xFF0000;
			}

			field450.method236("Fps:" + field813, var2, var1, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field353) {
				int var7 = 0xFF0000;
			}

			field450.method236("Mem:" + var5 + "k", var2, var1, 0xFFFF00);
			var2 += 15;
		}

		if (field522 != 0) {
			int var8 = field522 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field450.method241(0xFFFF00, "System update in: " + var9 + ":0" + var8, 329, 4);
			} else {
				field450.method241(0xFFFF00, "System update in: " + var9 + ":" + var8, 329, 4);
			}

			field224++;
			if (field224 > 95) {
				field224 = 0;
				field498.method536(51);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method94(int arg0) {
		if (!field353) {
			if (CPGFUBUO.field566[17] >= arg0) {
				TAIXVIBM var2 = CPGFUBUO.field560[17];
				int var3 = var2.field1251 * var2.field1250 - 1;
				int var4 = field472 * var2.field1250 * 2;
				byte[] var5 = var2.field1248;
				byte[] var6 = field340;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1248 = var6;
				field340 = var5;
				CPGFUBUO.method190(17);
				field148++;
				if (field148 > 94) {
					field148 = 0;
					field498.method536(143);
				}
			}

			if (CPGFUBUO.field566[24] >= arg0) {
				TAIXVIBM var8 = CPGFUBUO.field560[24];
				int var9 = var8.field1251 * var8.field1250 - 1;
				int var10 = field472 * var8.field1250 * 2;
				byte[] var11 = var8.field1248;
				byte[] var12 = field340;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field1248 = var12;
				field340 = var11;
				CPGFUBUO.method190(24);
			}

			if (CPGFUBUO.field566[34] >= arg0) {
				TAIXVIBM var14 = CPGFUBUO.field560[34];
				int var15 = var14.field1251 * var14.field1250 - 1;
				int var16 = field472 * var14.field1250 * 2;
				byte[] var17 = var14.field1248;
				byte[] var18 = field340;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field1248 = var18;
				field340 = var17;
				CPGFUBUO.method190(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method95() {
		int var1 = 5;
		field372[8] = 0;
		int var2 = 0;
		while (field372[8] == 0) {
			String var3 = "Unknown problem";
			method81(20, "Connecting to web server");

			try {
				DataInputStream var4 = method167("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 328);
				ZOMNSJJM var5 = new ZOMNSJJM(new byte[40]);
				var4.readFully(var5.field1456, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field372[var6] = var5.method552();
				}

				int var7 = var5.method552();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field372[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field372[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field372[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field372[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field372[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field372[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method81(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method81(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field386 = !field386;
			}
		}
	}

	@ObfuscatedName("client.a(IIILZDMOUFDZ;I)V")
	public final void method96(int arg0, int arg1, int arg2, ZDMOUFDZ arg3) {
		if (field436 < 400) {
			if (arg3.field1455 != null) {
				arg3 = arg3.method528();
			}

			if (arg3 != null && arg3.field1429) {
				String var5 = arg3.field1448;
				if (arg3.field1423 != 0) {
					var5 = var5 + method80(field403.field1104, arg3.field1423) + " (level-" + arg3.field1423 + ")";
				}

				if (field466 == 1) {
					field406[field436] = "Use " + field470 + " with @yel@" + var5;
					field369[field436] = 542;
					field370[field436] = arg0;
					field367[field436] = arg1;
					field368[field436] = arg2;
					field436++;
				} else if (field277 != 1) {
					if (arg3.field1433 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field1433[var6] != null && !arg3.field1433[var6].equalsIgnoreCase("attack")) {
								field406[field436] = arg3.field1433[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field369[field436] = 723;
								}

								if (var6 == 1) {
									field369[field436] = 536;
								}

								if (var6 == 2) {
									field369[field436] = 413;
								}

								if (var6 == 3) {
									field369[field436] = 882;
								}

								if (var6 == 4) {
									field369[field436] = 362;
								}

								field370[field436] = arg0;
								field367[field436] = arg1;
								field368[field436] = arg2;
								field436++;
							}
						}
					}

					if (arg3.field1433 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field1433[var7] != null && arg3.field1433[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field1423 > field403.field1104) {
									var8 = 2000;
								}

								field406[field436] = arg3.field1433[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field369[field436] = var8 + 723;
								}

								if (var7 == 1) {
									field369[field436] = var8 + 536;
								}

								if (var7 == 2) {
									field369[field436] = var8 + 413;
								}

								if (var7 == 3) {
									field369[field436] = var8 + 882;
								}

								if (var7 == 4) {
									field369[field436] = var8 + 362;
								}

								field370[field436] = arg0;
								field367[field436] = arg1;
								field368[field436] = arg2;
								field436++;
							}
						}
					}

					field406[field436] = "Examine @yel@" + var5;
					field369[field436] = 1468;
					field370[field436] = arg0;
					field367[field436] = arg1;
					field368[field436] = arg2;
					field436++;
				} else if ((field279 & 0x2) == 2) {
					field406[field436] = field280 + " @yel@" + var5;
					field369[field436] = 914;
					field370[field436] = arg0;
					field367[field436] = arg1;
					field368[field436] = arg2;
					field436++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LQIVQUKBA;ILZOMNSJJM;ZI)V")
	public final void method97(QIVQUKBA arg0, int arg1, ZOMNSJJM arg2, int arg3) {
		if ((arg1 & 0x80) != 0) {
			int var5 = arg2.method565();
			int var6 = arg2.method566();
			arg0.method370(field399, var6, var5);
			arg0.field1060 = field399 + 300;
			arg0.field1061 = arg2.method567();
			arg0.field1062 = arg2.method565();
		}

		if ((arg1 & 0x10) != 0) {
			arg0.field1088 = arg2.method574();
			if (arg0.field1088 == 0xFFFF) {
				arg0.field1088 = -1;
			}
		}

		if ((arg1 & 0x20) != 0) {
			arg0.field1046 = arg2.method554();
			if (arg0.field1046.charAt(0) == '~') {
				arg0.field1046 = arg0.field1046.substring(1);
				method131(2, arg0.field1106, arg0.field1046);
			} else if (field403 == arg0) {
				method131(2, arg0.field1106, arg0.field1046);
			}

			arg0.field1063 = 0;
			arg0.field1068 = 0;
			arg0.field1065 = 150;
		}

		if ((arg1 & 0x100) != 0) {
			arg0.field1072 = arg2.method547();
			arg0.field1074 = arg2.method547();
			arg0.field1073 = arg2.method547();
			arg0.field1075 = arg2.method566();
			arg0.field1076 = arg2.method575() + field399;
			arg0.field1077 = arg2.method573() + field399;
			arg0.field1078 = arg2.method565();
			arg0.method372();
		}

		if ((arg1 & 0x8) != 0) {
			int var7 = arg2.method565();
			byte[] var8 = new byte[var7];
			ZOMNSJJM var9 = new ZOMNSJJM(var8);
			arg2.method584(0, var8, var7);
			field446[arg3] = var9;
			arg0.method374(var9);
		}

		if ((arg1 & 0x40) != 0) {
			arg0.field1079 = arg2.method575();
			arg0.field1080 = arg2.method574();
		}

		if ((arg1 & 0x400) != 0) {
			int var10 = arg2.method567();
			int var11 = arg2.method566();
			arg0.method370(field399, var11, var10);
			arg0.field1060 = field399 + 300;
			arg0.field1061 = arg2.method566();
			arg0.field1062 = arg2.method566();
		}

		if ((arg1 & 0x4) != 0) {
			int var12 = arg2.method573();
			int var13 = arg2.method567();
			int var14 = arg2.method547();
			int var15 = arg2.field1457;

			if (arg0.field1106 != null && arg0.field1111) {
				long var16 = LBRUMXRC.method253(arg0.field1106);
				boolean var18 = false;
				if (var13 <= 1) {
					for (int var19 = 0; var19 < field435; var19++) {
						if (field276[var19] == var16) {
							var18 = true;
							break;
						}
					}
				}

				if (!var18 && field203 == 0) {
					try {
						field499.field1457 = 0;
						arg2.method556(0, field499.field1456, var14);
						field499.field1457 = 0;
						String var20 = ODNKXAVL.method366(field499, var14);
						var20 = XLNSJQUZ.method468(var20);
						arg0.field1046 = var20;
						arg0.field1063 = var12 >> 8;
						arg0.field1068 = var12 & 0xFF;
						arg0.field1065 = 150;

						if (var13 == 2 || var13 == 3) {
							method131(1, "@cr2@" + arg0.field1106, var20);
						} else if (var13 == 1) {
							method131(1, "@cr1@" + arg0.field1106, var20);
						} else {
							method131(2, arg0.field1106, var20);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field1457 = var14 + var15;
		}

		if ((arg1 & 0x200) != 0) {
			arg0.field1037 = arg2.method549();
			int var22 = arg2.method582();
			arg0.field1041 = var22 >> 16;
			arg0.field1040 = (var22 & 0xFFFF) + field399;
			arg0.field1038 = 0;
			arg0.field1039 = 0;

			if (arg0.field1040 > field399) {
				arg0.field1038 = -1;
			}

			if (arg0.field1037 == 0xFFFF) {
				arg0.field1037 = -1;
			}
		}

		if ((arg1 & 0x2) != 0) {
			int var23 = arg2.method574();
			if (var23 == 0xFFFF) {
				var23 = -1;
			}

			int var24 = arg2.method565();
			if (arg0.field1081 == var23 && var23 != -1) {
				int var25 = ISUBRNPG.field786[var23].field800;
				if (var25 == 1) {
					arg0.field1082 = 0;
					arg0.field1083 = 0;
					arg0.field1084 = var24;
					arg0.field1085 = 0;
				}

				if (var25 == 2) {
					arg0.field1085 = 0;
					return;
				}
			} else if (var23 == -1 || arg0.field1081 == -1 || ISUBRNPG.field786[var23].field794 >= ISUBRNPG.field786[arg0.field1081].field794) {
				arg0.field1081 = var23;
				arg0.field1082 = 0;
				arg0.field1083 = 0;
				arg0.field1084 = var24;
				arg0.field1085 = 0;
				arg0.field1051 = arg0.field1056;
			}
		}
	}

	public final void init() {
		field350 = Integer.parseInt(getParameter("nodeid"));
		field351 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method149();
		} else {
			method158();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field352 = false;
		} else {
			field352 = true;
		}

		method232(765, 503);
	}

	@ObfuscatedName("client.d(B)Ljava/lang/String;")
	public final String method98() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field820 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;IB)LLYZBHNJP;")
	public final LYZBHNJP method99(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field412[0] != null) {
				var6 = field412[0].method439(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field114.reset();
			field114.update(var6);
			int var8 = (int) field114.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new LYZBHNJP(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method81(arg4, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method167(arg1 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				ZOMNSJJM var16 = new ZOMNSJJM(var15);
				var16.field1457 = 3;
				int var17 = var16.method551() + 6;
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
						method81(arg4, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field412[0] != null) {
						field412[0].method440(var6, var6.length, arg0);
					}
				} catch (Exception var28) {
					field412[0] = null;
				}

				if (var6 != null) {
					field114.reset();
					field114.update(var6);
					int var23 = (int) field114.getValue();
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
						method81(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						method81(arg4, var11 + " - Retrying in " + var25);
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

				field386 = !field386;
			}
		}

		return new LYZBHNJP(var6);
	}

	@ObfuscatedName("client.e(B)V")
	public final void method100() {
		field482++;
		method153(true);
		method152(true);
		method153(false);
		method152(false);
		method101();
		method39();

		if (!field421) {
			int var1 = field306;
			if (field348 / 256 > var1) {
				var1 = field348 / 256;
			}

			if (field151[4] && field344[4] + 128 > var1) {
				var1 = field344[4] + 128;
			}

			int var2 = field330 + field307 & 0x7FF;
			method102(method151(field190, field403.field1070, field403.field1069) - 50, field272, var1, field271, var2, var1 * 3 + 600);
		}

		int var3;
		if (field421) {
			var3 = method133();
		} else {
			var3 = method132();
		}

		int var4 = field176;
		int var5 = field177;
		int var6 = field178;
		int var7 = field179;
		int var8 = field180;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field151[var9]) {
				int var10 = (int) (Math.random() * (field507[var9] * 2 + 1) + Math.sin(field494[var9] / 100.0D * field215[var9]) * field344[var9] - field507[var9]);
				if (var9 == 0) {
					field176 += var10;
				}

				if (var9 == 1) {
					field177 += var10;
				}

				if (var9 == 2) {
					field178 += var10;
				}

				if (var9 == 3) {
					field180 = field180 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field179 += var10;
					if (field179 < 128) {
						field179 = 128;
					}

					if (field179 > 383) {
						field179 = 383;
					}
				}
			}
		}

		int var11 = CPGFUBUO.field567;
		CCYECDYX.field85 = true;
		CCYECDYX.field88 = 0;
		CCYECDYX.field86 = field825 - 4;
		CCYECDYX.field87 = field826 - 4;
		LRYUPGSZ.method267();
		field489.method331(var3, field180, field179, field176, field178, field177);
		field489.method306();
		method92();
		method82();
		method94(var11);
		method93();
		field129.method213(4, field817, 4);
		field176 = var4;
		field177 = var5;
		field178 = var6;
		field179 = var7;
		field180 = var8;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method101() {
		for (CNLPNPVK var1 = (CNLPNPVK) field373.method523(); var1 != null; var1 = (CNLPNPVK) field373.method525()) {
			if (field190 != var1.field523 || field399 > var1.field543) {
				var1.method591();
			} else if (field399 >= var1.field542) {
				if (var1.field546 > 0) {
					TEBIXSCV var2 = field500[var1.field546 - 1];
					if (var2 != null && var2.field1069 >= 0 && var2.field1069 < 13312 && var2.field1070 >= 0 && var2.field1070 < 13312) {
						var1.method182(var2.field1070, method151(var1.field523, var2.field1070, var2.field1069) - var1.field529, var2.field1069, field399);
					}
				}

				if (var1.field546 < 0) {
					int var3 = -var1.field546 - 1;
					QIVQUKBA var4;
					if (field462 == var3) {
						var4 = field403;
					} else {
						var4 = field441[var3];
					}

					if (var4 != null && var4.field1069 >= 0 && var4.field1069 < 13312 && var4.field1070 >= 0 && var4.field1070 < 13312) {
						var1.method182(var4.field1070, method151(var1.field523, var4.field1070, var4.field1069) - var1.field529, var4.field1069, field399);
					}
				}

				var1.method180(field472);
				field489.method303((int) var1.field532, var1.field534, -1, (int) var1.field531, var1, 60, field190, (int) var1.field533, false);
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIII)V")
	public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = CCYECDYX.field90[var7];
			int var13 = CCYECDYX.field91[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = CCYECDYX.field90[var8];
			int var16 = CCYECDYX.field91[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field176 = arg3 - var9;
		field177 = arg0 - var10;
		field178 = arg1 - var11;
		field179 = arg2;
		field180 = arg4;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method103() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field327[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field327[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field328[var10] = (field327[var10 - 1] + field327[var10 + 1] + field327[var10 - 128] + field327[var10 + 128]) / 4;
			}
		}

		field493 += 128;
		if (field493 > field123.length) {
			field493 -= field123.length;
			int var11 = (int) (Math.random() * 12.0D);
			method138(field401[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field328[var14 + 128] - field123[field493 + var14 & field123.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field327[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field313[var16] = field313[var16 + 1];
		}

		field313[var1 - 1] = (int) (Math.sin(field399 / 14.0D) * 16.0D + Math.sin(field399 / 15.0D) * 14.0D + Math.sin(field399 / 16.0D) * 12.0D);

		if (field206 > 0) {
			field206 -= 4;
		}

		if (field207 > 0) {
			field207 -= 4;
		}

		if (field206 == 0 && field207 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field206 = 1024;
			}

			if (var17 == 1) {
				field207 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method104() {
		for (int var1 = -1; var1 < field442; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field440;
			} else {
				var2 = field443[var1];
			}

			QIVQUKBA var3 = field441[var2];
			if (var3 != null && var3.field1065 > 0) {
				var3.field1065--;
				if (var3.field1065 == 0) {
					var3.field1046 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field501; var4++) {
			int var5 = field502[var4];
			TEBIXSCV var6 = field500[var5];
			if (var6 != null && var6.field1065 > 0) {
				var6.field1065--;
				if (var6.field1065 == 0) {
					var6.field1046 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLZOMNSJJM;I)V")
	public final void method105(ZOMNSJJM arg0, int arg1) {
		while (arg0.field1458 + 21 < arg1 * 8) {
			int var3 = arg0.method558(14);
			if (var3 == 16383) {
				break;
			}

			if (field500[var3] == null) {
				field500[var3] = new TEBIXSCV();
			}

			TEBIXSCV var4 = field500[var3];
			field502[field501++] = var3;
			var4.field1067 = field399;
			int var5 = arg0.method558(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method558(1);
			int var7 = arg0.method558(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method558(1);
			if (var8 == 1) {
				field445[field444++] = var3;
			}

			var4.field1257 = ZDMOUFDZ.method529(arg0.method558(12));
			var4.field1050 = var4.field1257.field1443;
			var4.field1058 = var4.field1257.field1444;
			var4.field1042 = var4.field1257.field1438;
			var4.field1043 = var4.field1257.field1450;
			var4.field1044 = var4.field1257.field1419;
			var4.field1045 = var4.field1257.field1425;
			var4.field1047 = var4.field1257.field1451;
			var4.method373(var6 == 1, field403.field1087[0] + var5, field403.field1086[0] + var7);
		}

		arg0.method559();
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method106(long arg0) {
		if (arg0 != 0L) {
			if (field383 >= 100 && field120 != 1) {
				method131(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field383 >= 200) {
				method131(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = LBRUMXRC.method257(LBRUMXRC.method254(arg0));
				for (int var4 = 0; var4 < field383; var4++) {
					if (field100[var4] == arg0) {
						method131(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field435; var5++) {
					if (field276[var5] == arg0) {
						method131(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field403.field1106)) {
					field341[field383] = var3;
					field100[field383] = arg0;
					field112[field383] = 0;
					field383++;
					field385 = true;
					field498.method536(233);
					field498.method543(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILCPNGZAUN;)Z")
	public final boolean method107(CPNGZAUN arg0) {
		int var2 = arg0.field609;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field406[field436] = "Remove @whi@" + arg0.field598;
				field369[field436] = 935;
				field436++;
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

		field406[field436] = "Remove @whi@" + field341[var2];
		field369[field436] = 125;
		field436++;
		field406[field436] = "Message @whi@" + field341[var2];
		field369[field436] = 885;
		field436++;
		return true;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method108() {
		for (int var1 = -1; var1 < field442; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field440;
			} else {
				var2 = field443[var1];
			}

			QIVQUKBA var3 = field441[var2];
			if (var3 != null) {
				method65(1, var3);
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method109() {
		if (field522 > 1) {
			field522--;
		}

		if (field417 > 0) {
			field417--;
		}

		for (int var1 = 0; var1 < 5 && method140(); var1++) {
		}

		if (field481) {
			synchronized (field361.field771) {
				if (!field325) {
					field361.field766 = 0;
				} else if (field831 != 0 || field361.field766 >= 40) {
					field498.method536(15);
					field498.method537(0);
					int var3 = field498.field1457;
					int var4 = 0;
					for (int var5 = 0; var5 < field361.field766 && var3 - field498.field1457 < 240; var5++) {
						var4++;
						int var6 = field361.field769[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field361.field770[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field361.field769[var5] == -1 && field361.field770[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field425 != var7 || field426 != var6) {
							int var9 = var7 - field425;
							field425 = var7;
							int var10 = var6 - field426;
							field426 = var6;

							if (field138 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field498.method538((field138 << 12) + (var9 << 6) + var10);
								field138 = 0;
							} else if (field138 < 8) {
								field498.method540((field138 << 19) + var8 + 0x800000);
								field138 = 0;
							} else {
								field498.method541((field138 << 19) + var8 - 0x40000000);
								field138 = 0;
							}
						} else if (field138 < 2047) {
							field138++;
						}
					}

					field498.method546(field498.field1457 - var3);

					if (var4 >= field361.field766) {
						field361.field766 = 0;
					} else {
						field361.field766 -= var4;
						for (int var11 = 0; var11 < field361.field766; var11++) {
							field361.field770[var11] = field361.field770[var4 + var11];
							field361.field769[var11] = field361.field769[var4 + var11];
						}
					}
				}
			}

			if (field831 != 0) {
				long var12 = (field834 - field339) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field339 = field834;
				int var14 = field833;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field832;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field831 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field498.method536(139);
				field498.method579((var17 << 19) + (var18 << 20) + var16);
			}

			if (field273 > 0) {
				field273--;
			}

			if (field835[1] == 1 || field835[2] == 1 || field835[3] == 1 || field835[4] == 1) {
				field274 = true;
			}

			if (field274 && field273 <= 0) {
				field273 = 20;
				field274 = false;
				field498.method536(187);
				field498.method571(field306);
				field498.method538(field307);
			}

			if (field822 && !field381) {
				field381 = true;
				field498.method536(178);
				field498.method537(1);
			}

			if (!field822 && field381) {
				field381 = false;
				field498.method536(178);
				field498.method537(0);
			}

			method119();
			method115();
			method41();
			field415++;
			if (field415 > 750) {
				method74();
			}

			method108();
			method64();
			method104();
			field472++;

			if (field521 != 0) {
				field520 += 20;
				if (field520 >= 400) {
					field521 = 0;
				}
			}

			if (field197 != 0) {
				field194++;
				if (field194 >= 15) {
					if (field197 == 2) {
						field385 = true;
					}

					if (field197 == 3) {
						field227 = true;
					}

					field197 = 0;
				}
			}

			if (field243 != 0) {
				field205++;

				if (field825 > field244 + 5 || field825 < field244 - 5 || field826 > field245 + 5 || field826 < field245 - 5) {
					field230 = true;
				}

				if (field824 == 0) {
					if (field243 == 2) {
						field385 = true;
					}

					if (field243 == 3) {
						field227 = true;
					}

					field243 = 0;

					if (field230 && field205 >= 5) {
						field488 = -1;
						method114();

						if (field488 == field241 && field487 != field242) {
							CPNGZAUN var19 = CPNGZAUN.field578[field241];
							byte var20 = 0;
							if (field490 == 1 && var19.field609 == 206) {
								var20 = 1;
							}

							if (var19.field624[field487] <= 0) {
								var20 = 0;
							}

							if (var19.field634) {
								int var21 = field242;
								int var22 = field487;
								var19.field624[var22] = var19.field624[var21];
								var19.field570[var22] = var19.field570[var21];
								var19.field624[var21] = -1;
								var19.field570[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field242;
								int var24 = field487;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method202(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method202(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method202(field487, field242);
							}

							field498.method536(36);
							field498.method571(field487);
							field498.method572(field242);
							field498.method570(field241);
							field498.method563(var20);
						}
					} else if ((field448 == 1 || method47(field436 - 1)) && field436 > 2) {
						method110();
					} else if (field436 > 0) {
						method76(field436 - 1);
					}

					field194 = 10;
					field831 = 0;
				}
			}

			if (NCUAQOFM.field937 != -1) {
				int var25 = NCUAQOFM.field937;
				int var26 = NCUAQOFM.field938;
				boolean var27 = method90(var26, true, field403.field1087[0], 0, var25, 0, 0, 0, 0, field403.field1086[0], 0);
				NCUAQOFM.field937 = -1;

				if (var27) {
					field518 = field832;
					field519 = field833;
					field521 = 1;
					field520 = 0;
				}
			}

			if (field831 == 1 && field249 != null) {
				field249 = null;
				field227 = true;
				field831 = 0;
			}

			method77();
			method117();
			method111();
			method144();

			if (field824 == 1 || field831 == 1) {
				field486++;
			}

			if (field281 == 2) {
				method50();
			}

			if (field281 == 2 && field421) {
				method54();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field215[var28]++;
			}

			method159();
			field823++;
			if (field823 > 4500) {
				field417 = 250;
				field823 -= 500;
				field498.method536(156);
			}

			field454++;
			if (field454 > 500) {
				field454 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field460 += field461;
				}

				if ((var29 & 0x2) == 2) {
					field346 += field347;
				}

				if ((var29 & 0x4) == 4) {
					field330 += field331;
				}
			}

			if (field460 < -50) {
				field461 = 2;
			}

			if (field460 > 50) {
				field461 = -2;
			}

			if (field346 < -55) {
				field347 = 2;
			}

			if (field346 > 55) {
				field347 = -2;
			}

			if (field330 < -40) {
				field331 = 1;
			}

			if (field330 > 40) {
				field331 = -1;
			}

			field505++;
			if (field505 > 500) {
				field505 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field283 += field284;
				}

				if ((var30 & 0x2) == 2) {
					field121 += field122;
				}
			}

			if (field283 < -60) {
				field284 = 2;
			}

			if (field283 > 60) {
				field284 = -2;
			}

			if (field121 < -20) {
				field122 = 1;
			}

			if (field121 > 10) {
				field122 = -1;
			}

			field416++;
			if (field416 > 50) {
				field498.method536(200);
			}

			try {
				if (field192 != null && field498.field1457 > 0) {
					field192.method5(field498.field1456, 0, field498.field1457);
					field498.field1457 = 0;
					field416 = 0;
				}
			} catch (IOException var32) {
				method74();
			} catch (Exception var33) {
				method58();
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method110() {
		int var1 = field451.method239("Choose Option");
		for (int var2 = 0; var2 < field436; var2++) {
			int var3 = field451.method239(field406[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field436 * 15 + 21;
		if (field832 > 4 && field833 > 4 && field832 < 516 && field833 < 338) {
			int var5 = field832 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field833 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field191 = true;
			field332 = 0;
			field333 = var5;
			field334 = var6;
			field335 = var1;
			field336 = field436 * 15 + 22;
		}

		if (field832 > 553 && field833 > 205 && field832 < 743 && field833 < 466) {
			int var7 = field832 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field833 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field191 = true;
			field332 = 1;
			field333 = var7;
			field334 = var8;
			field335 = var1;
			field336 = field436 * 15 + 22;
		}

		if (field832 > 17 && field833 > 357 && field832 < 496 && field833 < 453) {
			int var9 = field832 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field833 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field191 = true;
			field332 = 2;
			field333 = var9;
			field334 = var10;
			field335 = var1;
			field336 = field436 * 15 + 22;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method111() {
		if (field831 == 1) {
			if (field832 >= 539 && field832 <= 573 && field833 >= 169 && field833 < 205 && field113[0] != -1) {
				field385 = true;
				field492 = 0;
				field226 = true;
			}

			if (field832 >= 569 && field832 <= 599 && field833 >= 168 && field833 < 205 && field113[1] != -1) {
				field385 = true;
				field492 = 1;
				field226 = true;
			}

			if (field832 >= 597 && field832 <= 627 && field833 >= 168 && field833 < 205 && field113[2] != -1) {
				field385 = true;
				field492 = 2;
				field226 = true;
			}

			if (field832 >= 625 && field832 <= 669 && field833 >= 168 && field833 < 203 && field113[3] != -1) {
				field385 = true;
				field492 = 3;
				field226 = true;
			}

			if (field832 >= 666 && field832 <= 696 && field833 >= 168 && field833 < 205 && field113[4] != -1) {
				field385 = true;
				field492 = 4;
				field226 = true;
			}

			if (field832 >= 694 && field832 <= 724 && field833 >= 168 && field833 < 205 && field113[5] != -1) {
				field385 = true;
				field492 = 5;
				field226 = true;
			}

			if (field832 >= 722 && field832 <= 756 && field833 >= 169 && field833 < 205 && field113[6] != -1) {
				field385 = true;
				field492 = 6;
				field226 = true;
			}

			if (field832 >= 540 && field832 <= 574 && field833 >= 466 && field833 < 502 && field113[7] != -1) {
				field385 = true;
				field492 = 7;
				field226 = true;
			}

			if (field832 >= 572 && field832 <= 602 && field833 >= 466 && field833 < 503 && field113[8] != -1) {
				field385 = true;
				field492 = 8;
				field226 = true;
			}

			if (field832 >= 599 && field832 <= 629 && field833 >= 466 && field833 < 503 && field113[9] != -1) {
				field385 = true;
				field492 = 9;
				field226 = true;
			}

			if (field832 >= 627 && field832 <= 671 && field833 >= 467 && field833 < 502 && field113[10] != -1) {
				field385 = true;
				field492 = 10;
				field226 = true;
			}

			if (field832 >= 669 && field832 <= 699 && field833 >= 466 && field833 < 503 && field113[11] != -1) {
				field385 = true;
				field492 = 11;
				field226 = true;
			}

			if (field832 >= 696 && field832 <= 726 && field833 >= 466 && field833 < 503 && field113[12] != -1) {
				field385 = true;
				field492 = 12;
				field226 = true;
			}

			if (field832 >= 724 && field832 <= 758 && field833 >= 466 && field833 < 502 && field113[13] != -1) {
				field385 = true;
				field492 = 13;
				field226 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method112() {
		field465 = false;
		while (field455) {
			field465 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field188 = null;
		field189 = null;
		field401 = null;
		field357 = null;
		field358 = null;
		field359 = null;
		field360 = null;
		field123 = null;
		field124 = null;
		field327 = null;
		field328 = null;
		field484 = null;
		field485 = null;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method113(boolean arg0) {
		method164();
		field288.method212();
		field188.method428(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field338 == 0) {
			int var4 = var3 / 2 + 80;
			field449.method238(0x75A9A9, var4, field438.field1176, var2 / 2, true);
			int var5 = var3 / 2 - 20;
			field451.method238(0xFFFF00, var5, "Welcome to RuneScape", var2 / 2, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field189.method428(var7 - 20, var6 - 73);
			field451.method238(0xFFFFFF, var7 + 5, "New User", var6, true);
			int var8 = var2 / 2 + 80;
			field189.method428(var7 - 20, var8 - 73);
			field451.method238(0xFFFFFF, var7 + 5, "Existing User", var8, true);
		}

		if (field338 == 2) {
			int var9 = var3 / 2 - 40;
			if (field317.length() > 0) {
				field451.method238(0xFFFF00, var9 - 15, field317, var2 / 2, true);
				field451.method238(0xFFFF00, var9, field318, var2 / 2, true);
				var9 += 30;
			} else {
				field451.method238(0xFFFF00, var9 - 7, field318, var2 / 2, true);
				var9 += 30;
			}

			field451.method245(var2 / 2 - 90, "Username: " + field431 + (field304 == 0 & field399 % 40 < 20 ? "@yel@|" : ""), true, var9, 0xFFFFFF);
			var9 += 15;
			field451.method245(var2 / 2 - 88, "Password: " + LBRUMXRC.method258(field432) + (field304 == 1 & field399 % 40 < 20 ? "@yel@|" : ""), true, var9, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field189.method428(var11 - 20, var10 - 73);
				field451.method238(0xFFFFFF, var11 + 5, "Login", var10, true);
				int var12 = var2 / 2 + 80;
				field189.method428(var11 - 20, var12 - 73);
				field451.method238(0xFFFFFF, var11 + 5, "Cancel", var12, true);
			}
		}

		if (field338 == 3) {
			field451.method238(0xFFFF00, var3 / 2 - 60, "Create a free account", var2 / 2, true);
			int var13 = var3 / 2 - 35;
			field451.method238(0xFFFFFF, var13, "To create a new account you need to", var2 / 2, true);
			var13 += 15;
			field451.method238(0xFFFFFF, var13, "go back to the main RuneScape webpage", var2 / 2, true);
			var13 += 15;
			field451.method238(0xFFFFFF, var13, "and choose the red 'create account'", var2 / 2, true);
			var13 += 15;
			field451.method238(0xFFFFFF, var13, "button at the top right of that page.", var2 / 2, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field189.method428(var15 - 20, var14 - 73);
			field451.method238(0xFFFFFF, var15 + 5, "Cancel", var14, true);
		}

		field288.method213(202, field817, 171);

		if (field506) {
			field506 = false;
			field286.method213(128, field817, 0);
			field287.method213(202, field817, 371);
			field291.method213(0, field817, 265);
			field292.method213(562, field817, 265);
			field293.method213(128, field817, 171);
			field294.method213(562, field817, 171);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method114() {
		if (field243 == 0) {
			field406[0] = "Cancel";
			field369[0] = 1889;
			field436 = 1;
			method61();
			field371 = 0;

			if (field825 > 4 && field826 > 4 && field825 < 516 && field826 < 338) {
				if (field343 == -1) {
					method53();
				} else {
					method170(4, field826, field825, CPNGZAUN.field578[field343], 0, 4);
				}
			}

			if (field437 != field371) {
				field437 = field371;
			}

			field371 = 0;

			if (field825 > 553 && field826 > 205 && field825 < 743 && field826 < 466) {
				if (field329 != -1) {
					method170(205, field826, field825, CPNGZAUN.field578[field329], 0, 553);
				} else if (field113[field492] != -1) {
					method170(205, field826, field825, CPNGZAUN.field578[field113[field492]], 0, 553);
				}
			}

			if (field404 != field371) {
				field385 = true;
				field404 = field371;
			}

			field371 = 0;

			if (field825 > 17 && field826 > 357 && field825 < 496 && field826 < 453) {
				if (field316 != -1) {
					method170(357, field826, field825, CPNGZAUN.field578[field316], 0, 17);
				} else if (field826 < 434 && field825 < 426) {
					method147(field826 - 357, field825 - 17);
				}
			}

			if (field316 != -1 && field379 != field371) {
				field227 = true;
				field379 = field371;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field436 - 1; var2++) {
					if (field369[var2] < 1000 && field369[var2 + 1] > 1000) {
						String var3 = field406[var2];
						field406[var2] = field406[var2 + 1];
						field406[var2 + 1] = var3;
						int var4 = field369[var2];
						field369[var2] = field369[var2 + 1];
						field369[var2 + 1] = var4;
						int var5 = field367[var2];
						field367[var2] = field367[var2 + 1];
						field367[var2 + 1] = var5;
						int var6 = field368[var2];
						field368[var2] = field368[var2 + 1];
						field368[var2 + 1] = var6;
						int var7 = field370[var2];
						field370[var2] = field370[var2 + 1];
						field370[var2 + 1] = var7;
						var1 = false;
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
			if (field820 != null) {
				return new URL("http://127.0.0.1:" + (field351 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.A(I)V")
	public final void method115() {
		if (field281 == 2) {
			for (LCCAHTIM var1 = (LCCAHTIM) field366.method523(); var1 != null; var1 = (LCCAHTIM) field366.method525()) {
				if (var1.field873 > 0) {
					var1.field873--;
				}

				if (var1.field873 != 0) {
					if (var1.field872 > 0) {
						var1.field872--;
					}

					if (var1.field872 == 0 && var1.field867 >= 1 && var1.field868 >= 1 && var1.field867 <= 102 && var1.field868 <= 102 && (var1.field874 < 0 || YCYSFKFW.method500(var1.field876, var1.field874))) {
						method63(var1.field875, var1.field868, var1.field866, var1.field876, var1.field874, var1.field867, var1.field865);
						var1.field872 = -1;

						if (var1.field874 == var1.field869 && var1.field869 == -1) {
							var1.method591();
						} else if (var1.field874 == var1.field869 && var1.field875 == var1.field870 && var1.field876 == var1.field871) {
							var1.method591();
						}
					}
				} else if (var1.field869 < 0 || YCYSFKFW.method500(var1.field871, var1.field869)) {
					method63(var1.field870, var1.field868, var1.field866, var1.field871, var1.field869, var1.field867, var1.field865);
					var1.method591();
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method116() {
		field130.method212();
		CPGFUBUO.field558 = field297;
		field134.method428(0, 0);

		if (field216) {
			field451.method237(40, 0, field193, 239);
			field451.method237(60, 128, field131 + "*", 239);
		} else if (field429 == 1) {
			field451.method237(40, 0, "Enter amount:", 239);
			field451.method237(60, 128, field517 + "*", 239);
		} else if (field429 == 2) {
			field451.method237(40, 0, "Enter name:", 239);
			field451.method237(60, 128, field517 + "*", 239);
		} else if (field249 != null) {
			field451.method237(40, 0, field249, 239);
			field451.method237(60, 128, "Click to continue", 239);
		} else if (field316 != -1) {
			method45(0, 0, CPNGZAUN.field578[field316], 0);
		} else if (field125 == -1) {
			JQUNTFOC var1 = field450;
			int var2 = 0;
			LRYUPGSZ.method266(0, 0, 463, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field270[var3] != null) {
					int var4 = field268[var3];
					int var5 = field285 + 70 - var2 * 14;
					String var6 = field269[var3];
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
							var1.method241(0, field270[var3], var5, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field145 == 0 || field145 == 1 && method123(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field247[0].method428(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field247[1].method428(var5 - 12, var8);
								var8 += 14;
							}

							var1.method241(0, var6 + ":", var5, var8);
							var8 += var1.method239(var6) + 8;
							var1.method241(255, field270[var3], var5, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field497 == 0 && (var4 == 7 || field380 == 0 || field380 == 1 && method123(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method241(0, "From", var5, var9);
							int var11 = var9 + var1.method239("From ");
							if (var7 == 1) {
								field247[0].method428(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field247[1].method428(var5 - 12, var11);
								var11 += 14;
							}

							var1.method241(0, var6 + ":", var5, var11);
							var11 += var1.method239(var6) + 8;
							var1.method241(0x800000, field270[var3], var5, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field228 == 0 || field228 == 1 && method123(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method241(0x800080, var6 + " " + field270[var3], var5, 4);
						}

						var2++;
					}

					if (var4 == 5 && field497 == 0 && field380 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method241(0x800000, field270[var3], var5, 4);
						}

						var2++;
					}

					if (var4 == 6 && field497 == 0 && field380 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method241(0, "To " + var6 + ":", var5, 4);
							var1.method241(0x800000, field270[var3], var5, var1.method239("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field228 == 0 || field228 == 1 && method123(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method241(0x7E3200, var6 + " " + field270[var3], var5, 4);
						}

						var2++;
					}
				}
			}

			LRYUPGSZ.method265();
			field402 = var2 * 14 + 7;
			if (field402 < 78) {
				field402 = 78;
			}

			method87(field402, 0, 463, field402 - field285 - 77, 77);
			String var10;
			if (field403 == null || field403.field1106 == null) {
				var10 = LBRUMXRC.method257(field431);
			} else {
				var10 = field403.field1106;
			}

			var1.method241(0, var10 + ":", 90, 4);
			var1.method241(255, field479 + "*", 90, var1.method239(var10 + ": ") + 6);
			LRYUPGSZ.method272(0, 479, 0, 77);
		} else {
			method45(0, 0, CPNGZAUN.field578[field125], 0);
		}

		if (field191 && field332 == 2) {
			method126();
		}

		field130.method213(17, field817, 357);
		field129.method212();
		CPGFUBUO.field558 = field299;
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method117() {
		if (field311 == 0 && field831 == 1) {
			int var1 = field832 - 25 - 550;
			int var2 = field833 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field307 + field283 & 0x7FF;
				int var4 = CPGFUBUO.field556[var3];
				int var5 = CPGFUBUO.field557[var3];
				var4 = (field121 + 256) * var4 >> 8;
				var5 = (field121 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field403.field1069 + var6 >> 7;
				int var9 = field403.field1070 - var7 >> 7;
				boolean var10 = method90(var9, true, field403.field1087[0], 0, var8, 0, 0, 0, 1, field403.field1086[0], 0);
				if (var10) {
					field498.method537(var1);
					field498.method537(var2);
					field498.method538(field307);
					field498.method537(57);
					field498.method537(field283);
					field498.method537(field121);
					field498.method537(89);
					field498.method538(field403.field1069);
					field498.method538(field403.field1070);
					field498.method537(field259);
					field498.method537(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public static final String method118(int arg0) {
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

	@ObfuscatedName("client.i(B)V")
	public final void method119() {
		if (field353 && field281 == 2 && YCYSFKFW.field1386 != field190) {
			field129.method212();
			field450.method237(151, 0, "Loading - please wait.", 257);
			field450.method237(150, 0xFFFFFF, "Loading - please wait.", 256);
			field129.method213(4, field817, 4);
			field281 = 1;
			field355 = System.currentTimeMillis();
		}

		if (field281 == 1) {
			int var1 = method120();
			if (var1 != 0 && System.currentTimeMillis() - field355 > 360000L) {
				signlink.reporterror(field431 + " glcfb " + field210 + "," + var1 + "," + field353 + "," + field412[0] + "," + field438.method405() + "," + field190 + "," + field217 + "," + field218);
				field355 = System.currentTimeMillis();
			}
		}

		if (field281 == 2 && field212 != field190) {
			field212 = field190;
			method73(field190);
		}
	}

	@ObfuscatedName("client.j(B)I")
	public final int method120() {
		for (int var1 = 0; var1 < field260.length; var1++) {
			if (field260[var1] == null && field253[var1] != -1) {
				return -1;
			}

			if (field161[var1] == null && field254[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field260.length; var3++) {
			byte[] var4 = field161[var3];
			if (var4 != null) {
				int var5 = (field252[var3] >> 8) * 64 - field167;
				int var6 = (field252[var3] & 0xFF) * 64 - field168;
				if (field514) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= YCYSFKFW.method508(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field267) {
			return -4;
		} else {
			field281 = 2;
			YCYSFKFW.field1386 = field190;
			method135();
			field498.method536(116);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IILLXRBRCRX;I)V")
	public final void method121(int arg0, int arg1, LXRBRCRX arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field307 + field283 & 0x7FF;
			int var6 = CCYECDYX.field90[var5];
			int var7 = CCYECDYX.field91[var5];
			var6 = var6 * 256 / (field121 + 256);
			var7 = var7 * 256 / (field121 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field202.method286(var10, 256, var12 + 94 + 4 - 10, 83 - var13 - 20, 15, 15, 20, 20);
		} else {
			method57(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.a(LCPNGZAUN;B)Z")
	public final boolean method122(CPNGZAUN arg0) {
		if (arg0.field601 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field601.length; var2++) {
			int var3 = method178(arg0, var2);
			int var4 = arg0.field573[var2];
			if (arg0.field601[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field601[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field601[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method123(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field383; var2++) {
			if (arg0.equalsIgnoreCase(field341[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field403.field1106)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method124(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method124(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method125() {
		if (field436 >= 2 || field466 != 0 || field277 != 0) {
			String var1;
			if (field466 == 1 && field436 < 2) {
				var1 = "Use " + field470 + " with...";
			} else if (field277 == 1 && field436 < 2) {
				var1 = field280 + "...";
			} else {
				var1 = field406[field436 - 1];
			}

			if (field436 > 2) {
				var1 = var1 + "@whi@ / " + (field436 - 2) + " more options";
			}

			field451.method246(4, 0xFFFFFF, true, 15, var1, field399 / 1000);
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method126() {
		int var1 = field333;
		int var2 = field334;
		int var3 = field335;
		int var4 = field336;
		int var5 = 0x5D5447;
		LRYUPGSZ.method269(var5, var3, var4, var2, var1);
		LRYUPGSZ.method269(0, var3 - 2, 16, var2 + 1, var1 + 1);
		LRYUPGSZ.method270(var2 + 18, var4 - 19, var3 - 2, var1 + 1, 0);
		field451.method241(var5, "Choose Option", var2 + 14, var1 + 3);
		int var6 = field825;
		int var7 = field826;
		if (field332 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field332 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field332 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field436; var8++) {
			int var9 = (field436 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field451.method245(var1 + 3, field406[var8], true, var9, var10);
		}
	}

	@ObfuscatedName("client.b(IILOVZHBYZU;)V")
	public final void method127(int arg0, OVZHBYZU arg1) {
		method128(arg1.field1070, arg0, arg1.field1069);
	}

	@ObfuscatedName("client.a(IIIZ)V")
	public final void method128(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method151(field190, arg0, arg2) - arg1;
			arg2 -= field176;
			var4 -= field177;
			arg0 -= field178;
			int var5 = CCYECDYX.field90[field179];
			int var6 = CCYECDYX.field91[field179];
			int var7 = CCYECDYX.field90[field180];
			int var8 = CCYECDYX.field91[field180];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field410 = (var9 << 9) / arg0 + CPGFUBUO.field552;
				field411 = (var11 << 9) / arg0 + CPGFUBUO.field553;
			} else {
				field410 = -1;
				field411 = -1;
			}
		} else {
			field410 = -1;
			field411 = -1;
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 328);

			if (arg0.length == 5) {
				field350 = Integer.parseInt(arg0[0]);
				field351 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method149();
				} else if (arg0[2].equals("highmem")) {
					method158();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field352 = false;
				} else if (arg0[3].equals("members")) {
					field352 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method231(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.b(LZOMNSJJM;II)V")
	public final void method129(ZOMNSJJM arg0, int arg1) {
		if (arg1 == 235) {
			int var3 = arg0.method566();
			int var4 = (var3 >> 4 & 0x7) + field198;
			int var5 = (var3 & 0x7) + field199;
			int var6 = arg0.method547();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field483[var7];
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method156(var8, var4, var7, var5, -1, field190, 0, var9, -1);
			}
		} else if (arg1 == 93) {
			int var10 = arg0.method567();
			int var11 = (var10 >> 4 & 0x7) + field198;
			int var12 = (var10 & 0x7) + field199;
			int var13 = arg0.method549();
			int var14 = arg0.method573();
			int var15 = arg0.method575();
			if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && field462 != var13) {
				LBFKEYAG var16 = new LBFKEYAG();
				var16.field863 = var15;
				var16.field862 = var14;

				if (field515[field190][var11][var12] == null) {
					field515[field190][var11][var12] = new YSGENUJE();
				}

				field515[field190][var11][var12].method520(var16);
				method177(var11, var12);
			}
		} else if (arg1 == 45) {
			int var17 = arg0.method573();
			int var18 = arg0.method566();
			int var19 = (var18 >> 4 & 0x7) + field198;
			int var20 = (var18 & 0x7) + field199;
			int var21 = arg0.method575();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				LBFKEYAG var22 = new LBFKEYAG();
				var22.field863 = var17;
				var22.field862 = var21;

				if (field515[field190][var19][var20] == null) {
					field515[field190][var19][var20] = new YSGENUJE();
				}

				field515[field190][var19][var20].method520(var22);
				method177(var19, var20);
			}
		} else if (arg1 == 54) {
			int var23 = arg0.method547();
			int var24 = (var23 >> 4 & 0x7) + field198;
			int var25 = (var23 & 0x7) + field199;
			int var26 = arg0.method549();
			int var27 = arg0.method549();
			int var28 = arg0.method549();
			if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
				YSGENUJE var29 = field515[field190][var24][var25];
				if (var29 != null) {
					for (LBFKEYAG var30 = (LBFKEYAG) var29.method523(); var30 != null; var30 = (LBFKEYAG) var29.method525()) {
						if ((var26 & 0x7FFF) == var30.field863 && var30.field862 == var27) {
							var30.field862 = var28;
							break;
						}
					}

					method177(var24, var25);
				}
			}
		} else if (arg1 == 80) {
			int var31 = arg0.method565();
			int var32 = var31 >> 2;
			int var33 = var31 & 0x3;
			int var34 = field483[var32];
			int var35 = arg0.method549();
			int var36 = arg0.method565();
			int var37 = (var36 >> 4 & 0x7) + field198;
			int var38 = (var36 & 0x7) + field199;
			if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
				method156(var33, var37, var32, var38, -1, field190, 0, var34, var35);
			}
		} else if (arg1 == 89) {
			int var39 = arg0.method547();
			int var40 = (var39 >> 4 & 0x7) + field198;
			int var41 = (var39 & 0x7) + field199;
			int var42 = arg0.method549();
			int var43 = arg0.method547();
			int var44 = arg0.method549();
			if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
				var40 = var40 * 128 + 64;
				var41 = var41 * 128 + 64;
				XTGOQLGZ var45 = new XTGOQLGZ(field190, var42, var40, var44, method151(field190, var41, var40) - var43, var41, field399);
				field261.method520(var45);
			}
		} else if (arg1 == 248) {
			int var46 = arg0.method565();
			int var47 = (var46 >> 4 & 0x7) + field198;
			int var48 = (var46 & 0x7) + field199;
			int var49 = arg0.method573();
			if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
				YSGENUJE var50 = field515[field190][var47][var48];
				if (var50 != null) {
					for (LBFKEYAG var51 = (LBFKEYAG) var50.method523(); var51 != null; var51 = (LBFKEYAG) var50.method525()) {
						if ((var49 & 0x7FFF) == var51.field863) {
							var51.method591();
							break;
						}
					}

					if (var50.method523() == null) {
						field515[field190][var47][var48] = null;
					}

					method177(var47, var48);
				}
			}
		} else {
			if (arg1 == 143) {
				int var52 = arg0.method547();
				int var53 = (var52 >> 4 & 0x7) + field198;
				int var54 = (var52 & 0x7) + field199;
				int var55 = arg0.method549();
				int var56 = arg0.method547();
				int var57 = var56 >> 4 & 0xF;
				int var58 = var56 & 0x7;
				if (field403.field1086[0] >= var53 - var57 && field403.field1086[0] <= var53 + var57 && field403.field1087[0] >= var54 - var57 && field403.field1087[0] <= var54 + var57 && field456 && !field353 && field393 < 50) {
					field229[field393] = var55;
					field159[field393] = var58;
					field141[field393] = WFTRMPWZ.field1291[var55];
					field393++;
				}
			}

			if (arg1 == 201) {
				int var59 = arg0.method566();
				int var60 = (var59 >> 4 & 0x7) + field198;
				int var61 = (var59 & 0x7) + field199;
				int var62 = arg0.method549();
				int var63 = arg0.method547();
				int var64 = var63 >> 2;
				int var65 = var63 & 0x3;
				int var66 = field483[var64];
				if (var60 >= 0 && var61 >= 0 && var60 < 103 && var61 < 103) {
					int var67 = field144[field190][var60][var61];
					int var68 = field144[field190][var60 + 1][var61];
					int var69 = field144[field190][var60 + 1][var61 + 1];
					int var70 = field144[field190][var60][var61 + 1];
					if (var66 == 0) {
						OVCWGZAP var71 = field489.method314(field190, var61, var60);
						if (var71 != null) {
							int var72 = var71.field1032 >> 14 & 0x7FFF;
							if (var64 == 2) {
								var71.field1030 = new JVQZOBJO(var62, false, var72, 2, var68, var70, var69, var67, var65 + 4);
								var71.field1031 = new JVQZOBJO(var62, false, var72, 2, var68, var70, var69, var67, var65 + 1 & 0x3);
							} else {
								var71.field1030 = new JVQZOBJO(var62, false, var72, var64, var68, var70, var69, var67, var65);
							}
						}
					}

					if (var66 == 1) {
						WQTHZAXE var73 = field489.method315(var61, field190, var60);
						if (var73 != null) {
							var73.field1333 = new JVQZOBJO(var62, false, var73.field1334 >> 14 & 0x7FFF, 4, var68, var70, var69, var67, 0);
						}
					}

					if (var66 == 2) {
						TVNKVXXP var74 = field489.method316(var60, var61, field190);

						if (var64 == 11) {
							var64 = 10;
						}

						if (var74 != null) {
							var74.field1278 = new JVQZOBJO(var62, false, var74.field1286 >> 14 & 0x7FFF, var64, var68, var70, var69, var67, var65);
						}
					}

					if (var66 == 3) {
						WGTWXNDU var75 = field489.method317(field190, var60, var61);
						if (var75 != null) {
							var75.field1325 = new JVQZOBJO(var62, false, var75.field1326 >> 14 & 0x7FFF, 22, var68, var70, var69, var67, var65);
						}
					}
				}
			} else if (arg1 == 81) {
				int var76 = arg0.method547();
				int var77 = (var76 >> 4 & 0x7) + field198;
				int var78 = (var76 & 0x7) + field199;
				int var79 = var77 + arg0.method548();
				int var80 = var78 + arg0.method548();
				int var81 = arg0.method550();
				int var82 = arg0.method549();
				int var83 = arg0.method547() * 4;
				int var84 = arg0.method547() * 4;
				int var85 = arg0.method549();
				int var86 = arg0.method549();
				int var87 = arg0.method547();
				int var88 = arg0.method547();
				if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104 && var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104 && var82 != 0xFFFF) {
					var77 = var77 * 128 + 64;
					var78 = var78 * 128 + 64;
					var79 = var79 * 128 + 64;
					var80 = var80 * 128 + 64;
					CNLPNPVK var89 = new CNLPNPVK(method151(field190, var78, var77) - var83, var87, field190, field399 + var85, var78, var77, field399 + var86, var88, var84, var81, var82);
					var89.method182(var80, method151(field190, var80, var79) - var84, var79, field399 + var85);
					field373.method520(var89);
				}
			} else if (arg1 == 92) {
				byte var90 = arg0.method569();
				int var91 = arg0.method549();
				int var92 = arg0.method574();
				int var93 = arg0.method547();
				int var94 = (var93 >> 4 & 0x7) + field198;
				int var95 = (var93 & 0x7) + field199;
				int var96 = arg0.method575();
				int var97 = arg0.method574();
				byte var98 = arg0.method568();
				int var99 = arg0.method566();
				int var100 = var99 >> 2;
				int var101 = var99 & 0x3;
				int var102 = field483[var100];
				byte var103 = arg0.method548();
				byte var104 = arg0.method568();
				QIVQUKBA var105;
				if (field462 == var92) {
					var105 = field403;
				} else {
					var105 = field441[var92];
				}

				if (var105 != null) {
					NNGZIOFO var106 = NNGZIOFO.method350(var97);
					int var107 = field144[field190][var94][var95];
					int var108 = field144[field190][var94 + 1][var95];
					int var109 = field144[field190][var94 + 1][var95 + 1];
					int var110 = field144[field190][var94][var95 + 1];
					CCYECDYX var111 = var106.method344(var100, var101, var107, var108, var109, var110, -1);
					if (var111 != null) {
						method156(0, var94, 0, var95, var96 + 1, field190, var91 + 1, var102, -1);
						var105.field1107 = field399 + var91;
						var105.field1108 = field399 + var96;
						var105.field1100 = var111;
						int var112 = var106.field966;
						int var113 = var106.field983;
						if (var101 == 1 || var101 == 3) {
							var112 = var106.field983;
							var113 = var106.field966;
						}

						var105.field1097 = var94 * 128 + var112 * 64;
						var105.field1099 = var95 * 128 + var113 * 64;
						var105.field1098 = method151(field190, var105.field1099, var105.field1097);

						if (var104 > var103) {
							byte var114 = var104;
							var104 = var103;
							var103 = var114;
						}

						if (var98 > var90) {
							byte var115 = var98;
							var98 = var90;
							var90 = var115;
						}

						var105.field1092 = var94 + var104;
						var105.field1094 = var94 + var103;
						var105.field1093 = var95 + var98;
						var105.field1095 = var90 + var95;
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method130(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field489.method322(field190, arg1, arg0, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		field310++;
		if (field310 > 1496) {
			field310 = 0;
			field498.method536(148);
			field498.method537(0);
			int var8 = field498.field1457;
			field498.method538(28830);
			field498.method538(29704);
			field498.method538((int) (Math.random() * 65536.0D));
			field498.method537(8);
			field498.method538((int) (Math.random() * 65536.0D));
			field498.method538(48228);

			if ((int) (Math.random() * 2.0D) == 0) {
				field498.method537(63);
			}

			field498.method538((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field498.method537(132);
			}

			field498.method538(12470);
			field498.method546(field498.field1457 - var8);
		}

		if (var6 == 10 || var6 == 11 || var6 == 22) {
			NNGZIOFO var9 = NNGZIOFO.method350(var4);
			int var10;
			int var11;
			if (var7 == 0 || var7 == 2) {
				var10 = var9.field966;
				var11 = var9.field983;
			} else {
				var10 = var9.field983;
				var11 = var9.field966;
			}

			int var12 = var9.field969;
			if (var7 != 0) {
				var12 = (var12 >> 4 - var7) + (var12 << var7 & 0xF);
			}

			method90(arg0, false, field403.field1087[0], 0, arg1, 0, var11, var10, 2, field403.field1086[0], var12);
		} else {
			method90(arg0, false, field403.field1087[0], var6 + 1, arg1, var7, 0, 0, 2, field403.field1086[0], 0);
		}

		field518 = field832;
		field519 = field833;
		field521 = 2;
		field520 = 0;
		return true;
	}

	@ObfuscatedName("client.a(BILjava/lang/String;Ljava/lang/String;)V")
	public final void method131(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field125 != -1) {
			field249 = arg2;
			field831 = 0;
		}

		if (field316 == -1) {
			field227 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field268[var4] = field268[var4 - 1];
			field269[var4] = field269[var4 - 1];
			field270[var4] = field270[var4 - 1];
		}

		field268[0] = arg0;
		field269[0] = arg1;
		field270[0] = arg2;
	}

	@ObfuscatedName("client.k(Z)I")
	public final int method132() {
		int var1 = 3;
		if (field179 < 310) {
			int var2 = field176 >> 7;
			int var3 = field178 >> 7;
			int var4 = field403.field1069 >> 7;
			int var5 = field403.field1070 >> 7;

			if ((field495[field190][var2][var3] & 0x4) != 0) {
				var1 = field190;
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

					if ((field495[field190][var2][var3] & 0x4) != 0) {
						var1 = field190;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field495[field190][var2][var3] & 0x4) != 0) {
							var1 = field190;
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

					if ((field495[field190][var2][var3] & 0x4) != 0) {
						var1 = field190;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field495[field190][var2][var3] & 0x4) != 0) {
							var1 = field190;
						}
					}
				}
			}
		}

		if ((field495[field190][field403.field1069 >> 7][field403.field1070 >> 7] & 0x4) != 0) {
			var1 = field190;
		}

		return var1;
	}

	@ObfuscatedName("client.C(I)I")
	public final int method133() {
		int var1 = method151(field190, field178, field176);
		if (var1 - field177 < 800 && (field495[field190][field176 >> 7][field178 >> 7] & 0x4) != 0) {
			return field190;
		}

		return 3;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method134() {
		byte[] var1 = field111.method290("title.dat", null);
		LXRBRCRX var2 = new LXRBRCRX(var1, this);
		field289.method212();
		var2.method279(0, 0);
		field290.method212();
		var2.method279(-637, 0);
		field286.method212();
		var2.method279(-128, 0);
		field287.method212();
		var2.method279(-202, -371);
		field288.method212();
		var2.method279(-202, -171);
		field291.method212();
		var2.method279(0, -265);
		field292.method212();
		var2.method279(-562, -265);
		field293.method212();
		var2.method279(-128, -171);
		field294.method212();
		var2.method279(-562, -171);
		int[] var3 = new int[var2.field890];
		for (int var4 = 0; var4 < var2.field891; var4++) {
			for (int var5 = 0; var5 < var2.field890; var5++) {
				var3[var5] = var2.field889[var2.field890 * var4 + var2.field890 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field890; var6++) {
				var2.field889[var2.field890 * var4 + var6] = var3[var6];
			}
		}

		field289.method212();
		var2.method279(382, 0);
		field290.method212();
		var2.method279(-255, 0);
		field286.method212();
		var2.method279(254, 0);
		field287.method212();
		var2.method279(180, -371);
		field288.method212();
		var2.method279(180, -171);
		field291.method212();
		var2.method279(382, -265);
		field292.method212();
		var2.method279(-180, -265);
		field293.method212();
		var2.method279(254, -171);
		field294.method212();
		var2.method279(-180, -171);
		LXRBRCRX var7 = new LXRBRCRX(field111, "logo", 0);
		field286.method212();
		var7.method281(18, 382 - var7.field890 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method135() {
		try {
			field212 = -1;
			field261.method527();
			field373.method527();
			CPGFUBUO.method186();
			method51();
			field489.method292();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field275[var1].method354();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field495[var2][var3][var4] = 0;
					}
				}
			}

			YCYSFKFW var5 = new YCYSFKFW(104, field144, field495, 104);
			int var6 = field260.length;
			field498.method536(200);

			if (!field514) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field252[var7] >> 8) * 64 - field167;
					int var9 = (field252[var7] & 0xFF) * 64 - field168;
					byte[] var10 = field260[var7];
					if (var10 != null) {
						var5.method510(var8, field275, (field218 - 6) * 8, (field217 - 6) * 8, var9, var10);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field252[var11] >> 8) * 64 - field167;
					int var13 = (field252[var11] & 0xFF) * 64 - field168;
					byte[] var14 = field260[var11];
					if (var14 == null && field218 < 800) {
						var5.method507(var13, var12, 64, 64);
					}
				}

				field498.method536(200);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field161[var15];
					if (var16 != null) {
						int var17 = (field252[var15] >> 8) * 64 - field167;
						int var18 = (field252[var15] & 0xFF) * 64 - field168;
						var5.method506(var18, var17, field489, var16, field275);
					}
				}
			}

			if (field514) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field98[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field252.length; var28++) {
									if (field252[var28] == var27 && field260[var28] != null) {
										var5.method515((var26 & 0x7) * 8, var21 * 8, var20 * 8, (var25 & 0x7) * 8, var24, var19, var23, field260[var28], field275);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field98[0][var29][var30];
						if (var31 == -1) {
							var5.method507(var30 * 8, var29 * 8, 8, 8);
						}
					}
				}

				field498.method536(200);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field98[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field252.length; var41++) {
									if (field252[var41] == var40 && field161[var41] != null) {
										var5.method512(field275, (var38 & 0x7) * 8, var34 * 8, field489, var32, var37, (var39 & 0x7) * 8, var33 * 8, var36, field161[var41]);
										break;
									}
								}
							}
						}
					}
				}
			}

			field498.method536(200);
			var5.method497(field489, field275);
			field129.method212();
			field498.method536(200);
			int var42 = YCYSFKFW.field1381;
			if (var42 > field190) {
				var42 = field190;
			}

			if (var42 < field190 - 1) {
				int var43 = field190 - 1;
			}

			if (field353) {
				field489.method293(YCYSFKFW.field1381);
			} else {
				field489.method293(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method177(var44, var45);
				}
			}

			field211++;
			if (field211 > 63) {
				field211 = 0;
				field498.method536(151);
			}

			method38();
		} catch (Exception var58) {
		}

		NNGZIOFO.field1003.method230();

		if (field820 != null) {
			field498.method536(207);
			field498.method541(1057001181);
		}

		if (field353 && signlink.cache_dat != null) {
			int var47 = field438.method402(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field438.method395(var48);
				if ((var49 & 0x79) == 0) {
					CCYECDYX.method10(var48);
				}
			}
		}

		System.gc();
		CPGFUBUO.method187(20);
		field438.method393();
		int var50 = (field217 - 6) / 8 - 1;
		int var51 = (field217 + 6) / 8 + 1;
		int var52 = (field218 - 6) / 8 - 1;
		int var53 = (field218 + 6) / 8 + 1;
		if (field305) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field438.method388(0, var54, var55);
					if (var56 != -1) {
						field438.method390(var56, 3);
					}

					int var57 = field438.method388(1, var54, var55);
					if (var57 != -1) {
						field438.method390(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLCPNGZAUN;)Z")
	public final boolean method136(CPNGZAUN arg0) {
		int var2 = arg0.field609;
		if (field384 == 2) {
			if (var2 == 201) {
				field227 = true;
				field429 = 0;
				field216 = true;
				field131 = "";
				field186 = 1;
				field193 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field227 = true;
				field429 = 0;
				field216 = true;
				field131 = "";
				field186 = 2;
				field193 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field417 = 250;
			return true;
		}

		if (var2 == 501) {
			field227 = true;
			field429 = 0;
			field216 = true;
			field131 = "";
			field186 = 4;
			field193 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field227 = true;
			field429 = 0;
			field216 = true;
			field131 = "";
			field186 = 5;
			field193 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field264[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = FAQFGVMF.field758 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= FAQFGVMF.field758) {
							var5 = 0;
						}
					}

					if (!FAQFGVMF.field759[var5].field765 && FAQFGVMF.field759[var5].field760 == var3 + (field427 ? 0 : 7)) {
						break;
					}
				}

				field264[var3] = var5;
				field362 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field509[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field208[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field208[var6].length) {
					var8 = 0;
				}
			}

			field509[var6] = var8;
			field362 = true;
		}

		if (var2 == 324 && !field427) {
			field427 = true;
			method154();
		}

		if (var2 == 325 && field427) {
			field427 = false;
			method154();
		}

		if (var2 == 326) {
			field498.method536(91);
			field498.method537(field427 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field498.method537(field264[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field498.method537(field509[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field250 = !field250;
		}

		if (var2 >= 601 && var2 <= 612) {
			method146();

			if (field312.length() > 0) {
				field498.method536(216);
				field498.method543(LBRUMXRC.method253(field312));
				field498.method537(var2 - 601);
				field498.method537(field250 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a([BZZ)V")
	public final void method137(byte[] arg0, boolean arg1) {
		if (field315) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.a(LTAIXVIBM;Z)V")
	public final void method138(TAIXVIBM arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field123.length; var3++) {
			field123[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field123[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field124[var9] = (field123[var9 - 1] + field123[var9 + 1] + field123[var9 - 128] + field123[var9 + 128]) / 4;
				}
			}

			int[] var10 = field123;
			field123 = field124;
			field124 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1251; var12++) {
				for (int var13 = 0; var13 < arg0.field1250; var13++) {
					if (arg0.field1248[var11++] != 0) {
						int var14 = var13 + arg0.field1252 + 16;
						int var15 = var12 + arg0.field1253 + 16;
						int var16 = (var15 << 7) + var14;
						field123[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILZOMNSJJM;)V")
	public final void method139(int arg0, ZOMNSJJM arg1) {
		for (int var3 = 0; var3 < field444; var3++) {
			int var4 = field445[var3];
			QIVQUKBA var5 = field441[var4];
			int var6 = arg1.method547();
			if ((var6 & 0x1) != 0) {
				var6 += arg1.method547() << 8;
			}

			method97(var5, var6, arg1, var4);
		}
	}

	@ObfuscatedName("client.D(I)Z")
	public final boolean method140() {
		if (field192 == null) {
			return false;
		}

		try {
			int var1 = field192.method3();
			if (var1 == 0) {
				return false;
			}

			if (field414 == -1) {
				field192.method4(field263.field1456, 0, 1);
				field414 = field263.field1456[0] & 0xFF;
				if (field504 != null) {
					field414 = field414 - field504.method585() & 0xFF;
				}

				field413 = ARVRBDNK.field2[field414];
				var1--;
			}

			if (field413 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field192.method4(field263.field1456, 0, 1);
				field413 = field263.field1456[0] & 0xFF;
				var1--;
			}

			if (field413 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field192.method4(field263.field1456, 0, 2);
				field263.field1457 = 0;
				field413 = field263.method549();
				var1 -= 2;
			}

			if (var1 < field413) {
				return false;
			}

			field263.field1457 = 0;
			field192.method4(field263.field1456, 0, field413);
			field415 = 0;
			field397 = field396;
			field396 = field395;
			field395 = field414;

			if (field414 == 67) {
				int var2 = field263.method576();
				int var3 = field263.method573();
				int var4 = field263.method550();
				CPNGZAUN var5 = CPNGZAUN.field578[var3];
				var5.field610 = var2;
				var5.field631 = var4;
				field414 = -1;
				return true;
			}

			if (field414 == 202) {
				int var6 = field263.method575();
				method172(var6);

				if (field329 != -1) {
					field329 = -1;
					field385 = true;
					field226 = true;
				}

				if (field316 != -1) {
					field316 = -1;
					field227 = true;
				}

				if (field429 != 0) {
					field429 = 0;
					field227 = true;
				}

				field343 = var6;
				field471 = false;
				field414 = -1;
				return true;
			}

			if (field414 == 123) {
				int var7 = field263.method549();
				method172(var7);

				if (field329 != -1) {
					field329 = -1;
					field385 = true;
					field226 = true;
				}

				field316 = var7;
				field227 = true;
				field343 = -1;
				field471 = false;
				field414 = -1;
				return true;
			}

			if (field414 == 158) {
				field421 = true;
				field115 = field263.method547();
				field116 = field263.method547();
				field117 = field263.method549();
				field118 = field263.method547();
				field119 = field263.method547();
				if (field119 >= 100) {
					field176 = field115 * 128 + 64;
					field178 = field116 * 128 + 64;
					field177 = method151(field190, field178, field176) - field117;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 69) {
				field216 = false;
				field429 = 2;
				field517 = "";
				field227 = true;
				field414 = -1;
				return true;
			}

			if (field414 == 100) {
				for (int var8 = 0; var8 < field441.length; var8++) {
					if (field441[var8] != null) {
						field441[var8].field1081 = -1;
					}
				}

				for (int var9 = 0; var9 < field500.length; var9++) {
					if (field500[var9] != null) {
						field500[var9].field1081 = -1;
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 222) {
				field385 = true;
				int var10 = field263.method581();
				int var11 = field263.method567();
				int var12 = field263.method566();
				field282[var11] = var10;
				field345[var11] = var12;
				field513[var11] = 1;
				for (int var13 = 0; var13 < 98; var13++) {
					if (var10 >= field303[var13]) {
						field513[var11] = var13 + 2;
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 172) {
				for (int var14 = 0; var14 < field476.length; var14++) {
					if (field476[var14] != field140[var14]) {
						field476[var14] = field140[var14];
						method171(var14);
						field385 = true;
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 11) {
				method85(field263, field413);
				field267 = false;
				field414 = -1;
				return true;
			}

			if (field414 == 44) {
				int var15 = field263.method574();
				int var16 = field263.method549();
				CPNGZAUN.field578[var16].field625 = 2;
				CPNGZAUN.field578[var16].field626 = var15;
				field414 = -1;
				return true;
			}

			if (field414 == 193) {
				field311 = field263.method547();
				field414 = -1;
				return true;
			}

			if (field414 == 163) {
				int var17 = field263.method574();
				int var18 = field263.method573();
				int var19 = field263.method575();

				if (var18 == 0xFFFF) {
					CPNGZAUN.field578[var17].field625 = 0;
					field414 = -1;
					return true;
				}

				SWITYBRD var20 = SWITYBRD.method416(var18);
				CPNGZAUN.field578[var17].field625 = 4;
				CPNGZAUN.field578[var17].field626 = var18;
				CPNGZAUN.field578[var17].field591 = var20.field1219;
				CPNGZAUN.field578[var17].field592 = var20.field1205;
				CPNGZAUN.field578[var17].field590 = var20.field1237 * 100 / var19;
				field414 = -1;
				return true;
			}

			if (field414 == 18) {
				field198 = field263.method567();
				field199 = field263.method547();
				field414 = -1;
				return true;
			}

			if (field414 == 20) {
				field522 = field263.method575() * 30;
				field414 = -1;
				return true;
			}

			if (field414 == 178) {
				field384 = field263.method547();
				field385 = true;
				field414 = -1;
				return true;
			}

			if (field414 == 84) {
				if (field492 == 12) {
					field385 = true;
				}

				field175 = field263.method550();
				field414 = -1;
				return true;
			}

			if (field414 == 244) {
				field421 = true;
				field388 = field263.method547();
				field389 = field263.method547();
				field390 = field263.method549();
				field391 = field263.method547();
				field392 = field263.method547();
				if (field392 >= 100) {
					int var21 = field388 * 128 + 64;
					int var22 = field389 * 128 + 64;
					int var23 = method151(field190, var22, var21) - field390;
					int var24 = var21 - field176;
					int var25 = var23 - field177;
					int var26 = var22 - field178;
					int var27 = (int) Math.sqrt(var24 * var24 + var26 * var26);
					field179 = (int) (Math.atan2(var25, var27) * 325.949D) & 0x7FF;
					field180 = (int) (Math.atan2(var24, var26) * -325.949D) & 0x7FF;

					if (field179 < 128) {
						field179 = 128;
					}

					if (field179 > 383) {
						field179 = 383;
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 52) {
				method58();
				field414 = -1;
				return false;
			}

			if (field414 == 196) {
				int var28 = field263.method549();
				boolean var29 = field263.method547() == 1;
				CPNGZAUN.field578[var28].field580 = var29;
				field414 = -1;
				return true;
			}

			if (field414 == 110) {
				int var30 = field263.method574();
				int var31 = field263.method575();
				CPNGZAUN var32 = CPNGZAUN.field578[var31];
				if (var32 != null && var32.field571 == 0) {
					if (var30 < 0) {
						var30 = 0;
					}

					if (var30 > var32.field616 - var32.field575) {
						var30 = var32.field616 - var32.field575;
					}

					var32.field572 = var30;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 128) {
				field496 = field263.method547();
				if (field496 == 1) {
					field150 = field263.method549();
				}

				if (field496 >= 2 && field496 <= 6) {
					if (field496 == 2) {
						field377 = 64;
						field378 = 64;
					}

					if (field496 == 3) {
						field377 = 0;
						field378 = 64;
					}

					if (field496 == 4) {
						field377 = 128;
						field378 = 64;
					}

					if (field496 == 5) {
						field377 = 64;
						field378 = 0;
					}

					if (field496 == 6) {
						field377 = 64;
						field378 = 128;
					}

					field496 = 2;
					field374 = field263.method549();
					field375 = field263.method549();
					field376 = field263.method547();
				}

				if (field496 == 10) {
					field258 = field263.method549();
				}

				field414 = -1;
				return true;
			}

			if (field414 == 39) {
				String var33 = field263.method554();
				if (var33.endsWith(":tradereq:")) {
					String var34 = var33.substring(0, var33.indexOf(":"));
					long var35 = LBRUMXRC.method253(var34);
					boolean var37 = false;
					for (int var38 = 0; var38 < field435; var38++) {
						if (field276[var38] == var35) {
							var37 = true;
							break;
						}
					}

					if (!var37 && field203 == 0) {
						method131(4, var34, "wishes to trade with you.");
					}
				} else if (var33.endsWith(":duelreq:")) {
					String var39 = var33.substring(0, var33.indexOf(":"));
					long var40 = LBRUMXRC.method253(var39);
					boolean var42 = false;
					for (int var43 = 0; var43 < field435; var43++) {
						if (field276[var43] == var40) {
							var42 = true;
							break;
						}
					}

					if (!var42 && field203 == 0) {
						method131(8, var39, "wishes to duel with you.");
					}
				} else if (var33.endsWith(":chalreq:")) {
					String var44 = var33.substring(0, var33.indexOf(":"));
					long var45 = LBRUMXRC.method253(var44);
					boolean var47 = false;
					for (int var48 = 0; var48 < field435; var48++) {
						if (field276[var48] == var45) {
							var47 = true;
							break;
						}
					}

					if (!var47 && field203 == 0) {
						String var49 = var33.substring(var33.indexOf(":") + 1, var33.length() - 9);
						method131(8, var44, var49);
					}
				} else {
					method131(0, "", var33);
				}

				field414 = -1;
				return true;
			}

			if (field414 == 177) {
				field199 = field263.method547();
				field198 = field263.method565();
				for (int var50 = field198; var50 < field198 + 8; var50++) {
					for (int var51 = field199; var51 < field199 + 8; var51++) {
						if (field515[field190][var50][var51] != null) {
							field515[field190][var50][var51] = null;
							method177(var50, var51);
						}
					}
				}

				for (LCCAHTIM var52 = (LCCAHTIM) field366.method523(); var52 != null; var52 = (LCCAHTIM) field366.method525()) {
					if (var52.field867 >= field198 && var52.field867 < field198 + 8 && var52.field868 >= field199 && var52.field868 < field199 + 8 && field190 == var52.field865) {
						var52.field873 = 0;
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 171 || field414 == 255) {
				int var53 = field217;
				int var54 = field218;
				if (field414 == 171) {
					var53 = field263.method573();
					var54 = field263.method573();
					field514 = false;
				}

				if (field414 == 255) {
					var54 = field263.method549();
					field263.method557();

					for (int var55 = 0; var55 < 4; var55++) {
						for (int var56 = 0; var56 < 13; var56++) {
							for (int var57 = 0; var57 < 13; var57++) {
								int var58 = field263.method558(1);
								if (var58 == 1) {
									field98[var55][var56][var57] = field263.method558(26);
								} else {
									field98[var55][var56][var57] = -1;
								}
							}
						}
					}

					field263.method559();
					var53 = field263.method574();
					field514 = true;
				}

				if (field217 == var53 && field218 == var54 && field281 == 2) {
					field414 = -1;
					return true;
				}

				field217 = var53;
				field218 = var54;
				field167 = (field217 - 6) * 8;
				field168 = (field218 - 6) * 8;
				field305 = false;
				if ((field217 / 8 == 48 || field217 / 8 == 49) && field218 / 8 == 48) {
					field305 = true;
				}

				if (field217 / 8 == 48 && field218 / 8 == 148) {
					field305 = true;
				}

				field281 = 1;
				field355 = System.currentTimeMillis();
				field129.method212();
				field450.method237(151, 0, "Loading - please wait.", 257);
				field450.method237(150, 0xFFFFFF, "Loading - please wait.", 256);
				field129.method213(4, field817, 4);

				if (field414 == 171) {
					int var59 = 0;
					for (int var60 = (field217 - 6) / 8; var60 <= (field217 + 6) / 8; var60++) {
						for (int var61 = (field218 - 6) / 8; var61 <= (field218 + 6) / 8; var61++) {
							var59++;
						}
					}

					field260 = new byte[var59][];
					field161 = new byte[var59][];
					field252 = new int[var59];
					field253 = new int[var59];
					field254 = new int[var59];
					int var62 = 0;
					for (int var63 = (field217 - 6) / 8; var63 <= (field217 + 6) / 8; var63++) {
						for (int var64 = (field218 - 6) / 8; var64 <= (field218 + 6) / 8; var64++) {
							field252[var62] = (var63 << 8) + var64;

							if (field305 && (var64 == 49 || var64 == 149 || var64 == 147 || var63 == 50 || var63 == 49 && var64 == 47)) {
								field253[var62] = -1;
								field254[var62] = -1;
								var62++;
							} else {
								int var65 = field253[var62] = field438.method388(0, var63, var64);
								if (var65 != -1) {
									field438.method409(3, var65);
								}

								int var66 = field254[var62] = field438.method388(1, var63, var64);
								if (var66 != -1) {
									field438.method409(3, var66);
								}

								var62++;
							}
						}
					}
				}

				if (field414 == 255) {
					int var67 = 0;
					int[] var68 = new int[676];
					for (int var69 = 0; var69 < 4; var69++) {
						for (int var70 = 0; var70 < 13; var70++) {
							for (int var71 = 0; var71 < 13; var71++) {
								int var72 = field98[var69][var70][var71];
								if (var72 != -1) {
									int var73 = var72 >> 14 & 0x3FF;
									int var74 = var72 >> 3 & 0x7FF;
									int var75 = (var73 / 8 << 8) + var74 / 8;
									for (int var76 = 0; var76 < var67; var76++) {
										if (var68[var76] == var75) {
											var75 = -1;
											break;
										}
									}

									if (var75 != -1) {
										var68[var67++] = var75;
									}
								}
							}
						}
					}

					field260 = new byte[var67][];
					field161 = new byte[var67][];
					field252 = new int[var67];
					field253 = new int[var67];
					field254 = new int[var67];
					for (int var77 = 0; var77 < var67; var77++) {
						int var78 = field252[var77] = var68[var77];
						int var79 = var78 >> 8 & 0xFF;
						int var80 = var78 & 0xFF;
						int var81 = field253[var77] = field438.method388(0, var79, var80);
						if (var81 != -1) {
							field438.method409(3, var81);
						}

						int var82 = field254[var77] = field438.method388(1, var79, var80);
						if (var82 != -1) {
							field438.method409(3, var82);
						}
					}
				}

				int var83 = field167 - field169;
				int var84 = field168 - field170;
				field169 = field167;
				field170 = field168;

				for (int var85 = 0; var85 < 16384; var85++) {
					TEBIXSCV var86 = field500[var85];
					if (var86 != null) {
						for (int var87 = 0; var87 < 10; var87++) {
							var86.field1086[var87] -= var83;
							var86.field1087[var87] -= var84;
						}

						var86.field1069 -= var83 * 128;
						var86.field1070 -= var84 * 128;
					}
				}

				for (int var88 = 0; var88 < field439; var88++) {
					QIVQUKBA var89 = field441[var88];
					if (var89 != null) {
						for (int var90 = 0; var90 < 10; var90++) {
							var89.field1086[var90] -= var83;
							var89.field1087[var90] -= var84;
						}

						var89.field1069 -= var83 * 128;
						var89.field1070 -= var84 * 128;
					}
				}

				field267 = true;
				byte var91 = 0;
				byte var92 = 104;
				byte var93 = 1;
				if (var83 < 0) {
					var91 = 103;
					var92 = -1;
					var93 = -1;
				}

				byte var94 = 0;
				byte var95 = 104;
				byte var96 = 1;
				if (var84 < 0) {
					var94 = 103;
					var95 = -1;
					var96 = -1;
				}

				for (int var97 = var91; var97 != var92; var97 += var93) {
					for (int var98 = var94; var98 != var95; var98 += var96) {
						int var99 = var83 + var97;
						int var100 = var84 + var98;
						for (int var101 = 0; var101 < 4; var101++) {
							if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
								field515[var101][var97][var98] = field515[var101][var99][var100];
							} else {
								field515[var101][var97][var98] = null;
							}
						}
					}
				}

				for (LCCAHTIM var102 = (LCCAHTIM) field366.method523(); var102 != null; var102 = (LCCAHTIM) field366.method525()) {
					var102.field867 -= var83;
					var102.field868 -= var84;
					if (var102.field867 < 0 || var102.field868 < 0 || var102.field867 >= 104 || var102.field868 >= 104) {
						var102.method591();
					}
				}

				if (field418 != 0) {
					field418 -= var83;
					field419 -= var84;
				}

				field421 = false;
				field414 = -1;
				return true;
			}

			if (field414 == 121) {
				field385 = true;
				int var103 = field263.method549();
				CPNGZAUN var104 = CPNGZAUN.field578[var103];
				int var105 = field263.method549();
				for (int var106 = 0; var106 < var105; var106++) {
					var104.field624[var106] = field263.method574();
					int var107 = field263.method567();
					if (var107 == 255) {
						var107 = field263.method582();
					}

					var104.field570[var106] = var107;
				}

				for (int var108 = var105; var108 < var104.field624.length; var108++) {
					var104.field624[var108] = 0;
					var104.field570[var108] = 0;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 161) {
				field492 = field263.method547();
				field385 = true;
				field226 = true;
				field414 = -1;
				return true;
			}

			if (field414 == 138) {
				int var109 = field263.method549();
				if (var109 == 0xFFFF) {
					var109 = -1;
				}

				if (field364 != var109 && field315 && !field353 && field222 == 0) {
					field295 = var109;
					field296 = true;
					field438.method409(2, field295);
				}

				field364 = var109;
				field414 = -1;
				return true;
			}

			if (field414 == 6) {
				int var110 = field263.method578();
				int var111 = field263.method573();
				if (field315 && !field353) {
					field295 = var111;
					field296 = false;
					field438.method409(2, field295);
					field222 = var110;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 150) {
				field145 = field263.method547();
				field380 = field263.method547();
				field228 = field263.method547();
				field213 = true;
				field227 = true;
				field414 = -1;
				return true;
			}

			if (field414 == 200) {
				field219 = field263.method549();
				field139 = field263.method566();
				field248 = field263.method573();
				field160 = field263.method567();
				field477 = field263.method582();
				if (field477 != 0 && field343 == -1) {
					signlink.dnslookup(LBRUMXRC.method256(field477));
					method146();
					short var112 = 650;
					if (field139 != 201 || field160 == 1) {
						var112 = 655;
					}

					field312 = "";
					field250 = false;

					for (int var113 = 0; var113 < CPNGZAUN.field578.length; var113++) {
						if (CPNGZAUN.field578[var113] != null && CPNGZAUN.field578[var113].field609 == var112) {
							field343 = CPNGZAUN.field578[var113].field621;
							break;
						}
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 21) {
				int var114 = field263.method573();
				int var115 = field263.method575();
				int var116 = field263.method549();
				int var117 = field263.method574();
				CPNGZAUN.field578[var114].field591 = var115;
				CPNGZAUN.field578[var114].field592 = var117;
				CPNGZAUN.field578[var114].field590 = var116;
				field414 = -1;
				return true;
			}

			if (field414 == 243) {
				int var118 = field263.method575();
				method172(var118);

				if (field316 != -1) {
					field316 = -1;
					field227 = true;
				}

				if (field429 != 0) {
					field429 = 0;
					field227 = true;
				}

				field329 = var118;
				field385 = true;
				field226 = true;
				field343 = -1;
				field471 = false;
				field414 = -1;
				return true;
			}

			if (field414 == 210) {
				field216 = false;
				field429 = 1;
				field517 = "";
				field227 = true;
				field414 = -1;
				return true;
			}

			if (field414 == 76) {
				field385 = true;
				int var119 = field263.method549();
				CPNGZAUN var120 = CPNGZAUN.field578[var119];
				while (field263.field1457 < field413) {
					int var121 = field263.method561();
					int var122 = field263.method549();
					int var123 = field263.method547();
					if (var123 == 255) {
						var123 = field263.method552();
					}

					if (var121 >= 0 && var121 < var120.field624.length) {
						var120.field624[var121] = var122;
						var120.field570[var121] = var123;
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 155) {
				int var124 = field263.method549();
				CPNGZAUN.field578[var124].field625 = 3;

				if (field403.field1113 == null) {
					CPNGZAUN.field578[var124].field626 = (field403.field1109[11] << 5) + (field403.field1109[8] << 10) + (field403.field1109[0] << 15) + (field403.field1089[0] << 25) + (field403.field1089[4] << 20) + field403.field1109[1];
				} else {
					CPNGZAUN.field578[var124].field626 = (int) (field403.field1113.field1441 + 0x12345678L);
				}

				field414 = -1;
				return true;
			}

			if (field414 == 64) {
				int var125 = field263.method549();
				int var126 = field263.method574();
				int var127 = field263.method573();
				CPNGZAUN.field578[var126].field632 = (var125 << 16) + var127;
				field414 = -1;
				return true;
			}

			if (field414 == 3) {
				int var128 = field263.method573();
				int var129 = field263.method575();
				int var130 = var128 >> 10 & 0x1F;
				int var131 = var128 >> 5 & 0x1F;
				int var132 = var128 & 0x1F;
				CPNGZAUN.field578[var129].field611 = (var132 << 3) + (var130 << 19) + (var131 << 11);
				field414 = -1;
				return true;
			}

			if (field414 == 26) {
				field394 = field263.method547();
				field414 = -1;
				return true;
			}

			if (field414 == 229) {
				int var133 = field263.method575();
				int var134 = field263.method580();
				field140[var133] = var134;

				if (field476[var133] != var134) {
					field476[var133] = var134;
					method171(var133);
					field385 = true;

					if (field125 != -1) {
						field227 = true;
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 19) {
				String var135 = field263.method554();
				int var136 = field263.method573();
				CPNGZAUN.field578[var136].field598 = var135;

				if (field113[field492] == CPNGZAUN.field578[var136].field621) {
					field385 = true;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 143 || field414 == 54 || field414 == 92 || field414 == 93 || field414 == 89 || field414 == 81 || field414 == 248 || field414 == 45 || field414 == 201 || field414 == 235 || field414 == 80) {
				method129(field263, field414);
				field414 = -1;
				return true;
			}

			if (field414 == 239) {
				int var137 = field263.method574();
				int var138 = field263.method574();

				if (field316 != -1) {
					field316 = -1;
					field227 = true;
				}

				if (field429 != 0) {
					field429 = 0;
					field227 = true;
				}

				field343 = var137;
				field329 = var138;
				field385 = true;
				field226 = true;
				field471 = false;
				field414 = -1;
				return true;
			}

			if (field414 == 122) {
				if (field329 != -1) {
					field329 = -1;
					field385 = true;
					field226 = true;
				}

				if (field316 != -1) {
					field316 = -1;
					field227 = true;
				}

				if (field429 != 0) {
					field429 = 0;
					field227 = true;
				}

				field343 = -1;
				field471 = false;
				field414 = -1;
				return true;
			}

			if (field414 == 144) {
				long var139 = field263.method553();
				int var141 = field263.method552();
				int var142 = field263.method547();
				boolean var143 = false;
				for (int var144 = 0; var144 < 100; var144++) {
					if (field323[var144] == var141) {
						var143 = true;
						break;
					}
				}

				if (var142 <= 1) {
					for (int var145 = 0; var145 < field435; var145++) {
						if (field276[var145] == var139) {
							var143 = true;
							break;
						}
					}
				}

				if (!var143 && field203 == 0) {
					try {
						field323[field491] = var141;
						field491 = (field491 + 1) % 100;
						String var146 = ODNKXAVL.method366(field263, field413 - 13);
						if (var142 != 3) {
							var146 = XLNSJQUZ.method468(var146);
						}

						if (var142 == 2 || var142 == 3) {
							method131(7, "@cr2@" + LBRUMXRC.method257(LBRUMXRC.method254(var139)), var146);
						} else if (var142 == 1) {
							method131(7, "@cr1@" + LBRUMXRC.method257(LBRUMXRC.method254(var139)), var146);
						} else {
							method131(3, LBRUMXRC.method257(LBRUMXRC.method254(var139)), var146);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 66) {
				byte var148 = field263.method568();
				int var149 = field263.method549();
				field140[var149] = var148;

				if (field476[var149] != var148) {
					field476[var149] = var148;
					method171(var149);
					field385 = true;

					if (field125 != -1) {
						field227 = true;
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 43) {
				int var150 = field263.method573();
				int var151 = field263.method573();
				CPNGZAUN.field578[var151].field625 = 1;
				CPNGZAUN.field578[var151].field626 = var150;
				field414 = -1;
				return true;
			}

			if (field414 == 29) {
				int var152 = field263.method577();
				field125 = var152;
				field227 = true;
				field414 = -1;
				return true;
			}

			if (field414 == 191) {
				int var153 = field263.method575();
				int var154 = field263.method550();
				CPNGZAUN var155 = CPNGZAUN.field578[var153];
				var155.field613 = var154;

				if (var154 == -1) {
					var155.field579 = 0;
					var155.field574 = 0;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 220) {
				int var156 = field263.method576();
				if (var156 >= 0) {
					method172(var156);
				}

				field225 = var156;
				field414 = -1;
				return true;
			}

			if (field414 == 162) {
				int var157 = field263.method549();
				int var158 = field263.method566();

				if (var157 == 0xFFFF) {
					var157 = -1;
				}

				field113[var158] = var157;
				field385 = true;
				field226 = true;
				field414 = -1;
				return true;
			}

			if (field414 == 232) {
				field199 = field263.method566();
				field198 = field263.method566();

				while (field263.field1457 < field413) {
					int var159 = field263.method547();
					method129(field263, var159);
				}

				field414 = -1;
				return true;
			}

			if (field414 == 147) {
				field462 = field263.method574();
				field120 = field263.method547();
				field414 = -1;
				return true;
			}

			if (field414 == 157) {
				int var160 = field263.method549();
				int var161 = field263.method547();
				int var162 = field263.method549();
				if (field456 && !field353 && field393 < 50) {
					field229[field393] = var160;
					field159[field393] = var161;
					field141[field393] = WFTRMPWZ.field1291[var160] + var162;
					field393++;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 218) {
				int var163 = field263.method575();
				CPNGZAUN var164 = CPNGZAUN.field578[var163];
				for (int var165 = 0; var165 < var164.field624.length; var165++) {
					var164.field624[var165] = -1;
					var164.field624[var165] = 0;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 71) {
				field418 = 0;
				field414 = -1;
				return true;
			}

			if (field414 == 141) {
				field435 = field413 / 8;
				for (int var166 = 0; var166 < field435; var166++) {
					field276[var166] = field263.method553();
				}

				field414 = -1;
				return true;
			}

			if (field414 == 112) {
				field421 = false;

				for (int var167 = 0; var167 < 5; var167++) {
					field151[var167] = false;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 91) {
				if (field492 == 12) {
					field385 = true;
				}

				field423 = field263.method547();
				field414 = -1;
				return true;
			}

			if (field414 == 30) {
				method150(field263, field413);
				field414 = -1;
				return true;
			}

			if (field414 == 176) {
				long var168 = field263.method553();
				int var170 = field263.method547();
				String var171 = LBRUMXRC.method257(LBRUMXRC.method254(var168));
				for (int var172 = 0; var172 < field383; var172++) {
					if (field100[var172] == var168) {
						if (field112[var172] != var170) {
							field112[var172] = var170;
							field385 = true;

							if (var170 > 0) {
								method131(5, "", var171 + " has logged in.");
							}

							if (var170 == 0) {
								method131(5, "", var171 + " has logged out.");
							}
						}

						var171 = null;
						break;
					}
				}

				if (var171 != null && field383 < 200) {
					field100[field383] = var168;
					field341[field383] = var171;
					field112[field383] = var170;
					field383++;
					field385 = true;
				}

				boolean var173 = false;
				while (!var173) {
					var173 = true;
					for (int var174 = 0; var174 < field383 - 1; var174++) {
						if (field112[var174] != field350 && field112[var174 + 1] == field350 || field112[var174] == 0 && field112[var174 + 1] != 0) {
							int var175 = field112[var174];
							field112[var174] = field112[var174 + 1];
							field112[var174 + 1] = var175;
							String var176 = field341[var174];
							field341[var174] = field341[var174 + 1];
							field341[var174 + 1] = var176;
							long var177 = field100[var174];
							field100[var174] = field100[var174 + 1];
							field100[var174 + 1] = var177;
							field385 = true;
							var173 = false;
						}
					}
				}

				field414 = -1;
				return true;
			}

			if (field414 == 165) {
				field422 = field263.method567();
				if (field492 == field422) {
					if (field422 == 3) {
						field492 = 1;
					} else {
						field492 = 3;
					}

					field385 = true;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 68) {
				int var179 = field263.method547();
				String var180 = field263.method554();
				int var181 = field263.method567();
				if (var181 >= 1 && var181 <= 5) {
					if (var180.equalsIgnoreCase("null")) {
						var180 = null;
					}

					field173[var181 - 1] = var180;
					field174[var181 - 1] = var179 == 0;
				}

				field414 = -1;
				return true;
			}

			if (field414 == 148) {
				int var182 = field263.method547();
				int var183 = field263.method547();
				int var184 = field263.method547();
				int var185 = field263.method547();
				field151[var182] = true;
				field507[var182] = var183;
				field344[var182] = var184;
				field494[var182] = var185;
				field215[var182] = 0;
				field414 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field414 + "," + field413 + " - " + field396 + "," + field397);
			method58();
		} catch (IOException var190) {
			method74();
		} catch (Exception var191) {
			String var187 = "T2 - " + field414 + "," + field396 + "," + field397 + " - " + field413 + "," + (field403.field1086[0] + field167) + "," + (field403.field1087[0] + field168) + " - ";
			for (int var188 = 0; var188 < field413 && var188 < 50; var188++) {
				var187 = var187 + field263.field1456[var188] + ",";
			}

			signlink.reporterror(var187);
			method58();
		}

		return true;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method141() {
		signlink.reporterror = false;

		try {
			if (field192 != null) {
				field192.method1();
			}
		} catch (Exception var1) {
		}

		field192 = null;
		method168();

		if (field361 != null) {
			field361.field768 = false;
		}

		field361 = null;
		field438.method398();
		field438 = null;
		field499 = null;
		field498 = null;
		field319 = null;
		field263 = null;
		field252 = null;
		field260 = null;
		field161 = null;
		field253 = null;
		field254 = null;
		field144 = null;
		field495 = null;
		field489 = null;
		field275 = null;
		field430 = null;
		field147 = null;
		field200 = null;
		field201 = null;
		field340 = null;
		field127 = null;
		field128 = null;
		field129 = null;
		field130 = null;
		field457 = null;
		field458 = null;
		field459 = null;
		field102 = null;
		field103 = null;
		field104 = null;
		field105 = null;
		field106 = null;
		field107 = null;
		field108 = null;
		field109 = null;
		field110 = null;
		field132 = null;
		field133 = null;
		field134 = null;
		field407 = null;
		field408 = null;
		field409 = null;
		field434 = null;
		field181 = null;
		field182 = null;
		field183 = null;
		field184 = null;
		field185 = null;
		field162 = null;
		field163 = null;
		field164 = null;
		field165 = null;
		field166 = null;
		field262 = null;
		field266 = null;
		field314 = null;
		field354 = null;
		field154 = null;
		field155 = null;
		field156 = null;
		field157 = null;
		field158 = null;
		field387 = null;
		field480 = null;
		field464 = null;
		field441 = null;
		field443 = null;
		field445 = null;
		field446 = null;
		field153 = null;
		field500 = null;
		field502 = null;
		field515 = null;
		field366 = null;
		field373 = null;
		field261 = null;
		field367 = null;
		field368 = null;
		field369 = null;
		field370 = null;
		field406 = null;
		field476 = null;
		field301 = null;
		field302 = null;
		field453 = null;
		field420 = null;
		field341 = null;
		field100 = null;
		field112 = null;
		field289 = null;
		field290 = null;
		field286 = null;
		field287 = null;
		field288 = null;
		field291 = null;
		field292 = null;
		field293 = null;
		field294 = null;
		method112();
		NNGZIOFO.method347();
		ZDMOUFDZ.method534();
		SWITYBRD.method422();
		IMXTJGZE.field773 = null;
		FAQFGVMF.field759 = null;
		CPNGZAUN.field578 = null;
		YYNYMTFQ.field1409 = null;
		ISUBRNPG.field786 = null;
		ZSSCYSIO.field1476 = null;
		ZSSCYSIO.field1488 = null;
		QOKQYKHB.field1115 = null;
		field818 = null;
		QIVQUKBA.field1101 = null;
		CPGFUBUO.method183();
		NCUAQOFM.method291();
		CCYECDYX.method7();
		RKTGZGSS.method381();
		System.gc();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method142(String arg0) {
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

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method143(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method144() {
		if (field831 == 1) {
			if (field832 >= 6 && field832 <= 106 && field833 >= 467 && field833 <= 499) {
				field145 = (field145 + 1) % 4;
				field213 = true;
				field227 = true;
				field498.method536(174);
				field498.method537(field145);
				field498.method537(field380);
				field498.method537(field228);
			}

			if (field832 >= 135 && field832 <= 235 && field833 >= 467 && field833 <= 499) {
				field380 = (field380 + 1) % 3;
				field213 = true;
				field227 = true;
				field498.method536(174);
				field498.method537(field145);
				field498.method537(field380);
				field498.method537(field228);
			}

			if (field832 >= 273 && field832 <= 373 && field833 >= 467 && field833 <= 499) {
				field228 = (field228 + 1) % 3;
				field213 = true;
				field227 = true;
				field498.method536(174);
				field498.method537(field145);
				field498.method537(field380);
				field498.method537(field228);
			}

			if (field832 >= 412 && field832 <= 512 && field833 >= 467 && field833 <= 499) {
				if (field343 == -1) {
					method146();
					field312 = "";
					field250 = false;

					for (int var1 = 0; var1 < CPNGZAUN.field578.length; var1++) {
						if (CPNGZAUN.field578[var1] != null && CPNGZAUN.field578[var1].field609 == 600) {
							field246 = field343 = CPNGZAUN.field578[var1].field621;
							return;
						}
					}

					return;
				}

				method131(0, "", "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method145(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method146() {
		field498.method536(47);

		if (field329 != -1) {
			field329 = -1;
			field385 = true;
			field471 = false;
			field226 = true;
		}

		if (field316 != -1) {
			field316 = -1;
			field227 = true;
			field471 = false;
		}

		field343 = -1;
	}

	@ObfuscatedName("client.d(III)V")
	public final void method147(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field270[var4] != null) {
				int var5 = field268[var4];
				int var6 = field285 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field269[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field145 == 0 || field145 == 1 && method123(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field403.field1106)) {
						if (field256 >= 1) {
							field406[field436] = "Report abuse @whi@" + var7;
							field369[field436] = 36;
							field436++;
						}

						field406[field436] = "Add ignore @whi@" + var7;
						field369[field436] = 380;
						field436++;
						field406[field436] = "Add friend @whi@" + var7;
						field369[field436] = 858;
						field436++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field497 == 0 && (var5 == 7 || field380 == 0 || field380 == 1 && method123(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field256 >= 1) {
							field406[field436] = "Report abuse @whi@" + var7;
							field369[field436] = 36;
							field436++;
						}

						field406[field436] = "Add ignore @whi@" + var7;
						field369[field436] = 380;
						field436++;
						field406[field436] = "Add friend @whi@" + var7;
						field369[field436] = 858;
						field436++;
					}

					var3++;
				}

				if (var5 == 4 && (field228 == 0 || field228 == 1 && method123(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field406[field436] = "Accept trade @whi@" + var7;
						field369[field436] = 975;
						field436++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field497 == 0 && field380 < 2) {
					var3++;
				}

				if (var5 == 8 && (field228 == 0 || field228 == 1 && method123(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field406[field436] = "Accept challenge @whi@" + var7;
						field369[field436] = 326;
						field436++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZII)Z")
	public final boolean method148(int arg0, int arg1) {
		boolean var3 = false;
		CPNGZAUN var4 = CPNGZAUN.field578[arg1];
		for (int var5 = 0; var5 < var4.field604.length && var4.field604[var5] != -1; var5++) {
			CPNGZAUN var6 = CPNGZAUN.field578[var4.field604[var5]];
			if (var6.field571 == 1) {
				var3 |= method148(arg0, var6.field582);
			}

			if (var6.field571 == 6 && (var6.field613 != -1 || var6.field614 != -1)) {
				boolean var7 = method122(var6);
				int var8;
				if (var7) {
					var8 = var6.field614;
				} else {
					var8 = var6.field613;
				}

				if (var8 != -1) {
					ISUBRNPG var9 = ISUBRNPG.field786[var8];
					var6.field574 += arg0;
					while (var6.field574 > var9.method226(var6.field579)) {
						var6.field574 -= var9.method226(var6.field579) + 1;
						var6.field579++;
						if (var6.field579 >= var9.field787) {
							var6.field579 -= var9.field791;
							if (var6.field579 < 0 || var6.field579 >= var9.field787) {
								var6.field579 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field571 == 6 && var6.field632 != 0) {
				int var10 = var6.field632 >> 16;
				int var11 = var6.field632 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field591 = var6.field591 + var10 & 0x7FF;
				var6.field592 = var6.field592 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.E(I)V")
	public static final void method149() {
		NCUAQOFM.field903 = true;
		CPGFUBUO.field547 = true;
		field353 = true;
		YCYSFKFW.field1380 = true;
		NNGZIOFO.field993 = true;
	}

	@ObfuscatedName("client.c(LZOMNSJJM;II)V")
	public final void method150(ZOMNSJJM arg0, int arg1) {
		field152 = 0;
		field444 = 0;
		method157(arg1, arg0);
		method105(arg0, arg1);
		method174(arg1, arg0);

		for (int var3 = 0; var3 < field152; var3++) {
			int var4 = field153[var3];
			if (field399 != field500[var4].field1067) {
				field500[var4].field1257 = null;
				field500[var4] = null;
			}
		}

		if (arg0.field1457 != arg1) {
			signlink.reporterror(field431 + " size mismatch in getnpcpos - pos:" + arg0.field1457 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field501; var5++) {
			if (field500[field502[var5]] == null) {
				signlink.reporterror(field431 + " null entry in npc list - pos:" + var5 + " size:" + field501);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method151(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field495[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field144[var6][var4][var5] + field144[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field144[var6][var4][var5 + 1] + field144[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method152(boolean arg0) {
		for (int var2 = 0; var2 < field501; var2++) {
			TEBIXSCV var3 = field500[field502[var2]];
			int var4 = (field502[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method369() && var3.field1257.field1421 == arg0) {
				int var5 = var3.field1069 >> 7;
				int var6 = var3.field1070 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1050 == 1 && (var3.field1069 & 0x7F) == 0x40 && (var3.field1070 & 0x7F) == 0x40) {
						if (field464[var5][var6] == field482) {
							continue;
						}

						field464[var5][var6] = field482;
					}

					if (!var3.field1257.field1429) {
						var4 += Integer.MIN_VALUE;
					}

					field489.method303(var3.field1070, var3.field1071, var4, var3.field1069, var3, (var3.field1050 - 1) * 64 + 60, field190, method151(field190, var3.field1070, var3.field1069), var3.field1057);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method153(boolean arg0) {
		if (field403.field1069 >> 7 == field418 && field403.field1070 >> 7 == field419) {
			field418 = 0;
		}

		int var2 = field442;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			QIVQUKBA var4;
			int var5;
			if (arg0) {
				var4 = field403;
				var5 = field440 << 14;
			} else {
				var4 = field441[field443[var3]];
				var5 = field443[var3] << 14;
			}

			if (var4 != null && var4.method369()) {
				var4.field1112 = false;
				if ((field353 && field442 > 50 || field442 > 200) && !arg0 && var4.field1047 == var4.field1034) {
					var4.field1112 = true;
				}

				int var6 = var4.field1069 >> 7;
				int var7 = var4.field1070 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1100 == null || field399 < var4.field1107 || field399 >= var4.field1108) {
						if ((var4.field1069 & 0x7F) == 0x40 && (var4.field1070 & 0x7F) == 0x40) {
							if (field464[var6][var7] == field482) {
								continue;
							}

							field464[var6][var7] = field482;
						}

						var4.field1105 = method151(field190, var4.field1070, var4.field1069);
						field489.method303(var4.field1070, var4.field1071, var5, var4.field1069, var4, 60, field190, var4.field1105, var4.field1057);
					} else {
						var4.field1112 = false;
						var4.field1105 = method151(field190, var4.field1070, var4.field1069);
						field489.method304(var4.field1105, var4.field1092, var4.field1071, var4.field1093, var4, var4.field1094, 60, var4.field1069, field190, var4.field1095, var4.field1070, var5);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method154() {
		field362 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field264[var1] = -1;
			for (int var2 = 0; var2 < FAQFGVMF.field758; var2++) {
				if (!FAQFGVMF.field759[var2].field765 && FAQFGVMF.field759[var2].field760 == var1 + (field427 ? 0 : 7)) {
					field264[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method155() {
		field203 = 0;
		int var1 = (field403.field1069 >> 7) + field167;
		int var2 = (field403.field1070 >> 7) + field168;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field203 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field203 = 1;
		}

		if (field203 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field203 = 0;
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIBI)V")
	public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LCCAHTIM var10 = null;
		for (LCCAHTIM var11 = (LCCAHTIM) field366.method523(); var11 != null; var11 = (LCCAHTIM) field366.method525()) {
			if (var11.field865 == arg5 && var11.field867 == arg1 && var11.field868 == arg3 && var11.field866 == arg7) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new LCCAHTIM();
			var10.field865 = arg5;
			var10.field866 = arg7;
			var10.field867 = arg1;
			var10.field868 = arg3;
			method72(var10);
			field366.method520(var10);
		}

		var10.field874 = arg8;
		var10.field876 = arg2;
		var10.field875 = arg0;
		var10.field872 = arg6;
		var10.field873 = arg4;
	}

	@ObfuscatedName("client.a(ILZOMNSJJM;Z)V")
	public final void method157(int arg0, ZOMNSJJM arg1) {
		arg1.method557();
		int var3 = arg1.method558(8);
		if (var3 < field501) {
			for (int var4 = var3; var4 < field501; var4++) {
				field153[field152++] = field502[var4];
			}
		}

		if (var3 > field501) {
			signlink.reporterror(field431 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field501 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field502[var5];
			TEBIXSCV var7 = field500[var6];
			int var8 = arg1.method558(1);
			if (var8 == 0) {
				field502[field501++] = var6;
				var7.field1067 = field399;
			} else {
				int var9 = arg1.method558(2);
				if (var9 == 0) {
					field502[field501++] = var6;
					var7.field1067 = field399;
					field445[field444++] = var6;
				} else if (var9 == 1) {
					field502[field501++] = var6;
					var7.field1067 = field399;
					int var10 = arg1.method558(3);
					var7.method371(var10, false);
					int var11 = arg1.method558(1);
					if (var11 == 1) {
						field445[field444++] = var6;
					}
				} else if (var9 == 2) {
					field502[field501++] = var6;
					var7.field1067 = field399;
					int var12 = arg1.method558(3);
					var7.method371(var12, true);
					int var13 = arg1.method558(3);
					var7.method371(var13, true);
					int var14 = arg1.method558(1);
					if (var14 == 1) {
						field445[field444++] = var6;
					}
				} else if (var9 == 3) {
					field153[field152++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public static final void method158() {
		NCUAQOFM.field903 = false;
		CPGFUBUO.field547 = false;
		field353 = false;
		YCYSFKFW.field1380 = false;
		NNGZIOFO.field993 = false;
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method159() {
		while (true) {
			int var1 = method235();
			if (var1 == -1) {
				return;
			}

			if (field343 != -1 && field343 == field246) {
				if (var1 == 8 && field312.length() > 0) {
					field312 = field312.substring(0, field312.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field312.length() < 12) {
					field312 = field312 + (char) var1;
				}
			} else if (field216) {
				if (var1 >= 32 && var1 <= 122 && field131.length() < 80) {
					field131 = field131 + (char) var1;
					field227 = true;
				}

				if (var1 == 8 && field131.length() > 0) {
					field131 = field131.substring(0, field131.length() - 1);
					field227 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field216 = false;
					field227 = true;

					if (field186 == 1) {
						long var2 = LBRUMXRC.method253(field131);
						method106(var2);
					}

					if (field186 == 2 && field383 > 0) {
						long var4 = LBRUMXRC.method253(field131);
						method88(var4);
					}

					if (field186 == 3 && field131.length() > 0) {
						field498.method536(140);
						field498.method537(0);
						int var6 = field498.field1457;
						field498.method543(field136);
						ODNKXAVL.method367(field131, field498);
						field498.method546(field498.field1457 - var6);
						field131 = ODNKXAVL.method368(field131);
						field131 = XLNSJQUZ.method468(field131);
						method131(6, LBRUMXRC.method257(LBRUMXRC.method254(field136)), field131);

						if (field380 == 2) {
							field380 = 1;
							field213 = true;
							field498.method536(174);
							field498.method537(field145);
							field498.method537(field380);
							field498.method537(field228);
						}
					}

					if (field186 == 4 && field435 < 100) {
						long var7 = LBRUMXRC.method253(field131);
						method78(var7);
					}

					if (field186 == 5 && field435 > 0) {
						long var9 = LBRUMXRC.method253(field131);
						method56(var9);
					}
				}
			} else if (field429 == 1) {
				if (var1 >= 48 && var1 <= 57 && field517.length() < 10) {
					field517 = field517 + (char) var1;
					field227 = true;
				}

				if (var1 == 8 && field517.length() > 0) {
					field517 = field517.substring(0, field517.length() - 1);
					field227 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field517.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field517);
						} catch (Exception var21) {
						}

						field498.method536(64);
						field498.method541(var11);
					}

					field429 = 0;
					field227 = true;
				}
			} else if (field429 == 2) {
				if (var1 >= 32 && var1 <= 122 && field517.length() < 12) {
					field517 = field517 + (char) var1;
					field227 = true;
				}

				if (var1 == 8 && field517.length() > 0) {
					field517 = field517.substring(0, field517.length() - 1);
					field227 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field517.length() > 0) {
						field498.method536(112);
						field498.method543(LBRUMXRC.method253(field517));
					}

					field429 = 0;
					field227 = true;
				}
			} else if (field316 == -1) {
				if (var1 >= 32 && var1 <= 122 && field479.length() < 80) {
					field479 = field479 + (char) var1;
					field227 = true;
				}

				if (var1 == 8 && field479.length() > 0) {
					field479 = field479.substring(0, field479.length() - 1);
					field227 = true;
				}

				if ((var1 == 13 || var1 == 10) && field479.length() > 0) {
					if (field256 == 2) {
						if (field479.equals("::clientdrop")) {
							method74();
						}

						if (field479.equals("::lag")) {
							method48();
						}

						if (field479.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field438.method402(2); var12++) {
								field438.method389(2, var12, (byte) 1);
							}
						}

						if (field479.equals("::fpson")) {
							field447 = true;
						}

						if (field479.equals("::fpsoff")) {
							field447 = false;
						}

						if (field479.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field275[var13].field1021[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field479.startsWith("::")) {
						field498.method536(205);
						field498.method537(field479.length() - 1);
						field498.method544(field479.substring(2));
					} else {
						String var16 = field479.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field479 = field479.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field479 = field479.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field479 = field479.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field479 = field479.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field479 = field479.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field479 = field479.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field479 = field479.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field479 = field479.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field479 = field479.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field479 = field479.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field479 = field479.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field479 = field479.substring(6);
						}

						String var18 = field479.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field479 = field479.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field479 = field479.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field479 = field479.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field479 = field479.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field479 = field479.substring(6);
						}

						field498.method536(222);
						field498.method537(0);
						int var20 = field498.field1457;
						field499.field1457 = 0;
						ODNKXAVL.method367(field479, field499);
						field498.method583(field499.field1456, 0, field499.field1457);
						field498.method563(var19);
						field498.method564(var17);
						field498.method546(field498.field1457 - var20);
						field479 = ODNKXAVL.method368(field479);
						field479 = XLNSJQUZ.method468(field479);
						field403.field1046 = field479;
						field403.field1063 = var17;
						field403.field1068 = var19;
						field403.field1065 = 150;

						if (field256 == 2) {
							method131(2, "@cr2@" + field403.field1106, field403.field1046);
						} else if (field256 == 1) {
							method131(2, "@cr1@" + field403.field1106, field403.field1046);
						} else {
							method131(2, field403.field1106, field403.field1046);
						}

						if (field145 == 2) {
							field145 = 3;
							field213 = true;
							field498.method536(174);
							field498.method537(field145);
							field498.method537(field380);
							field498.method537(field228);
						}
					}

					field479 = "";
					field227 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method160() {
		if (field428 || field97 || field382) {
			method55();
		} else {
			field512++;

			if (field481) {
				method71();
			} else {
				method113(false);
			}

			field486 = 0;
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method161() {
		field455 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field465) {
				field171++;
				method103();
				method103();
				method40();
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

		field455 = false;
	}

	@ObfuscatedName("client.G(I)Ljava/net/Socket;")
	public final Socket method162(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.H(I)V")
	public final void method163() {
		if (field338 == 0) {
			int var1 = field815 / 2 - 80;
			int var2 = field816 / 2 + 20;
			var2 += 20;
			if (field831 == 1 && field832 >= var1 - 75 && field832 <= var1 + 75 && field833 >= var2 - 20 && field833 <= var2 + 20) {
				field338 = 3;
				field304 = 0;
			}

			int var3 = field815 / 2 + 80;
			if (field831 == 1 && field832 >= var3 - 75 && field832 <= var3 + 75 && field833 >= var2 - 20 && field833 <= var2 + 20) {
				field317 = "";
				field318 = "Enter your username & password.";
				field338 = 2;
				field304 = 0;
			}
		} else if (field338 == 2) {
			int var4 = field816 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field831 == 1 && field833 >= var4 - 15 && field833 < var4) {
				field304 = 0;
			}

			var4 += 15;
			if (field831 == 1 && field833 >= var4 - 15 && field833 < var4) {
				field304 = 1;
			}

			var4 += 15;
			int var5 = field815 / 2 - 80;
			int var6 = field816 / 2 + 50;
			var6 += 20;
			if (field831 == 1 && field832 >= var5 - 75 && field832 <= var5 + 75 && field833 >= var6 - 20 && field833 <= var6 + 20) {
				field187 = 0;
				method91(field431, field432, false);

				if (field481) {
					return;
				}
			}

			int var7 = field815 / 2 + 80;
			if (field831 == 1 && field832 >= var7 - 75 && field832 <= var7 + 75 && field833 >= var6 - 20 && field833 <= var6 + 20) {
				field338 = 0;
				field431 = "";
				field432 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method235();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field209.length(); var10++) {
					if (var8 == field209.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field304 == 0) {
					if (var8 == 8 && field431.length() > 0) {
						field431 = field431.substring(0, field431.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field304 = 1;
					}

					if (var9) {
						field431 = field431 + (char) var8;
					}

					if (field431.length() > 12) {
						field431 = field431.substring(0, 12);
					}
				} else if (field304 == 1) {
					if (var8 == 8 && field432.length() > 0) {
						field432 = field432.substring(0, field432.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field304 = 0;
					}

					if (var9) {
						field432 = field432 + (char) var8;
					}

					if (field432.length() > 20) {
						field432 = field432.substring(0, 20);
					}
				}
			}
		} else if (field338 == 3) {
			int var11 = field815 / 2;
			int var12 = field816 / 2 + 50;
			var12 += 20;
			if (field831 == 1 && field832 >= var11 - 75 && field832 <= var11 + 75 && field833 >= var12 - 20 && field833 <= var12 + 20) {
				field338 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method164() {
		if (field286 == null) {
			field818 = null;
			field130 = null;
			field128 = null;
			field127 = null;
			field129 = null;
			field457 = null;
			field458 = null;
			field459 = null;
			field289 = new ECAKBTRA(265, method49(), 128);
			LRYUPGSZ.method267();
			field290 = new ECAKBTRA(265, method49(), 128);
			LRYUPGSZ.method267();
			field286 = new ECAKBTRA(171, method49(), 509);
			LRYUPGSZ.method267();
			field287 = new ECAKBTRA(132, method49(), 360);
			LRYUPGSZ.method267();
			field288 = new ECAKBTRA(200, method49(), 360);
			LRYUPGSZ.method267();
			field291 = new ECAKBTRA(238, method49(), 202);
			LRYUPGSZ.method267();
			field292 = new ECAKBTRA(238, method49(), 203);
			LRYUPGSZ.method267();
			field293 = new ECAKBTRA(94, method49(), 74);
			LRYUPGSZ.method267();
			field294 = new ECAKBTRA(94, method49(), 75);
			LRYUPGSZ.method267();

			if (field111 != null) {
				method134();
				method44();
			}

			field506 = true;
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method165(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method166() {
		field128.method212();

		if (field311 == 2) {
			byte[] var1 = field133.field1248;
			int[] var2 = LRYUPGSZ.field879;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field262.method285(25, 33, 25, field463, field307, 256, 33, 0, field363, 0);
			field129.method212();
		} else {
			int var5 = field307 + field283 & 0x7FF;
			int var6 = field403.field1069 / 32 + 48;
			int var7 = 464 - field403.field1070 / 32;
			field420.method285(var6, 146, var7, field503, var5, field121 + 256, 151, 5, field478, 25);
			field262.method285(25, 33, 25, field463, field307, 256, 33, 0, field363, 0);

			for (int var8 = 0; var8 < field300; var8++) {
				int var9 = field301[var8] * 4 + 2 - field403.field1069 / 32;
				int var10 = field302[var8] * 4 + 2 - field403.field1070 / 32;
				method57(var10, field453[var8], var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					YSGENUJE var13 = field515[field190][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field403.field1069 / 32;
						int var15 = var12 * 4 + 2 - field403.field1070 / 32;
						method57(var15, field154, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field501; var16++) {
				TEBIXSCV var17 = field500[field502[var16]];
				if (var17 != null && var17.method369()) {
					ZDMOUFDZ var18 = var17.field1257;
					if (var18.field1455 != null) {
						var18 = var18.method528();
					}

					if (var18 != null && var18.field1454 && var18.field1429) {
						int var19 = var17.field1069 / 32 - field403.field1069 / 32;
						int var20 = var17.field1070 / 32 - field403.field1070 / 32;
						method57(var20, field155, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field442; var21++) {
				QIVQUKBA var22 = field441[field443[var21]];
				if (var22 != null && var22.method369()) {
					int var23 = var22.field1069 / 32 - field403.field1069 / 32;
					int var24 = var22.field1070 / 32 - field403.field1070 / 32;
					boolean var25 = false;
					long var26 = LBRUMXRC.method253(var22.field1106);
					for (int var28 = 0; var28 < field383; var28++) {
						if (field100[var28] == var26 && field112[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field403.field1090 != 0 && var22.field1090 != 0 && field403.field1090 == var22.field1090) {
						var29 = true;
					}

					if (var25) {
						method57(var24, field157, var23);
					} else if (var29) {
						method57(var24, field158, var23);
					} else {
						method57(var24, field156, var23);
					}
				}
			}

			if (field496 != 0 && field399 % 20 < 10) {
				if (field496 == 1 && field150 >= 0 && field150 < field500.length) {
					TEBIXSCV var30 = field500[field150];
					if (var30 != null) {
						int var31 = var30.field1069 / 32 - field403.field1069 / 32;
						int var32 = var30.field1070 / 32 - field403.field1070 / 32;
						method121(var31, var32, field221);
					}
				}

				if (field496 == 2) {
					int var33 = (field374 - field167) * 4 + 2 - field403.field1069 / 32;
					int var34 = (field375 - field168) * 4 + 2 - field403.field1070 / 32;
					method121(var33, var34, field221);
				}

				if (field496 == 10 && field258 >= 0 && field258 < field441.length) {
					QIVQUKBA var35 = field441[field258];
					if (var35 != null) {
						int var36 = var35.field1069 / 32 - field403.field1069 / 32;
						int var37 = var35.field1070 / 32 - field403.field1070 / 32;
						method121(var36, var37, field221);
					}
				}
			}

			if (field418 != 0) {
				int var38 = field418 * 4 + 2 - field403.field1069 / 32;
				int var39 = field419 * 4 + 2 - field403.field1070 / 32;
				method57(var39, field220, var38);
			}

			LRYUPGSZ.method269(0xFFFFFF, 3, 3, 78, 97);
			field129.method212();
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method167(String arg0) throws IOException {
		if (field386) {
			if (field337 != null) {
				try {
					field337.close();
				} catch (Exception var4) {
				}

				field337 = null;
			}

			field337 = method162(43595);
			field337.setSoTimeout(10000);
			InputStream var2 = field337.getInputStream();
			OutputStream var3 = field337.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.J(I)V")
	public final void method168() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.c(I)V")
	public final void method169() {
		if (!field428 && !field97 && !field382) {
			field399++;

			if (field481) {
				method109();
			} else {
				method163();
			}

			method59();
		}
	}

	@ObfuscatedName("client.a(IIILCPNGZAUN;III)V")
	public final void method170(int arg0, int arg1, int arg2, CPNGZAUN arg3, int arg4, int arg5) {
		if (arg3.field571 == 0 && arg3.field604 != null && !arg3.field580 && (arg2 >= arg5 && arg1 >= arg0 && arg2 <= arg3.field599 + arg5 && arg1 <= arg3.field575 + arg0)) {
			int var7 = arg3.field604.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.field623[var8] + arg5;
				int var10 = arg3.field630[var8] + arg0 - arg4;
				CPNGZAUN var11 = CPNGZAUN.field578[arg3.field604[var8]];
				var9 += var11.field610;
				var10 += var11.field631;
				if ((var11.field607 >= 0 || var11.field635 != 0) && arg2 >= var9 && arg1 >= var10 && arg2 < var11.field599 + var9 && arg1 < var11.field575 + var10) {
					if (var11.field607 >= 0) {
						field371 = var11.field607;
					} else {
						field371 = var11.field582;
					}
				}

				if (var11.field571 == 0) {
					method170(var10, arg1, arg2, var11, var11.field572, var9);

					if (var11.field616 > var11.field575) {
						method89(var10, arg1, true, var11.field616, var11.field575, var11.field599 + var9, arg2, var11);
					}
				} else {
					if (var11.field600 == 1 && arg2 >= var9 && arg1 >= var10 && arg2 < var11.field599 + var9 && arg1 < var11.field575 + var10) {
						boolean var12 = false;
						if (var11.field609 != 0) {
							var12 = method107(var11);
						}

						if (!var12) {
							field406[field436] = var11.field633;
							field369[field436] = 931;
							field368[field436] = var11.field582;
							field436++;
						}
					}

					if (var11.field600 == 2 && field277 == 0 && arg2 >= var9 && arg1 >= var10 && arg2 < var11.field599 + var9 && arg1 < var11.field575 + var10) {
						String var13 = var11.field577;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field406[field436] = var13 + " @gre@" + var11.field628;
						field369[field436] = 763;
						field368[field436] = var11.field582;
						field436++;
					}

					if (var11.field600 == 3 && arg2 >= var9 && arg1 >= var10 && arg2 < var11.field599 + var9 && arg1 < var11.field575 + var10) {
						field406[field436] = "Close";
						field369[field436] = 293;
						field368[field436] = var11.field582;
						field436++;
					}

					if (var11.field600 == 4 && arg2 >= var9 && arg1 >= var10 && arg2 < var11.field599 + var9 && arg1 < var11.field575 + var10) {
						field406[field436] = var11.field633;
						field369[field436] = 228;
						field368[field436] = var11.field582;
						field436++;
					}

					if (var11.field600 == 5 && arg2 >= var9 && arg1 >= var10 && arg2 < var11.field599 + var9 && arg1 < var11.field575 + var10) {
						field406[field436] = var11.field633;
						field369[field436] = 867;
						field368[field436] = var11.field582;
						field436++;
					}

					if (var11.field600 == 6 && !field471 && arg2 >= var9 && arg1 >= var10 && arg2 < var11.field599 + var9 && arg1 < var11.field575 + var10) {
						field406[field436] = var11.field633;
						field369[field436] = 805;
						field368[field436] = var11.field582;
						field436++;
					}

					if (var11.field571 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field575; var15++) {
							for (int var16 = 0; var16 < var11.field599; var16++) {
								int var17 = (var11.field622 + 32) * var16 + var9;
								int var18 = (var11.field597 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field620[var14];
									var18 += var11.field619[var14];
								}

								if (arg2 >= var17 && arg1 >= var18 && arg2 < var17 + 32 && arg1 < var18 + 32) {
									field487 = var14;
									field488 = var11.field582;

									if (var11.field624[var14] > 0) {
										SWITYBRD var19 = SWITYBRD.method416(var11.field624[var14] - 1);
										if (field466 == 1 && var11.field615) {
											if (field468 != var11.field582 || field467 != var14) {
												field406[field436] = "Use " + field470 + " with @lre@" + var19.field1207;
												field369[field436] = 965;
												field370[field436] = var19.field1233;
												field367[field436] = var14;
												field368[field436] = var11.field582;
												field436++;
											}
										} else if (field277 != 1 || !var11.field615) {
											if (var11.field615) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field1234 != null && var19.field1234[var20] != null) {
														field406[field436] = var19.field1234[var20] + " @lre@" + var19.field1207;

														if (var20 == 3) {
															field369[field436] = 919;
														}

														if (var20 == 4) {
															field369[field436] = 421;
														}

														field370[field436] = var19.field1233;
														field367[field436] = var14;
														field368[field436] = var11.field582;
														field436++;
													} else if (var20 == 4) {
														field406[field436] = "Drop @lre@" + var19.field1207;
														field369[field436] = 421;
														field370[field436] = var19.field1233;
														field367[field436] = var14;
														field368[field436] = var11.field582;
														field436++;
													}
												}
											}

											if (var11.field618) {
												field406[field436] = "Use @lre@" + var19.field1207;
												field369[field436] = 534;
												field370[field436] = var19.field1233;
												field367[field436] = var14;
												field368[field436] = var11.field582;
												field436++;
											}

											if (var11.field615 && var19.field1234 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field1234[var21] != null) {
														field406[field436] = var19.field1234[var21] + " @lre@" + var19.field1207;

														if (var21 == 0) {
															field369[field436] = 550;
														}

														if (var21 == 1) {
															field369[field436] = 135;
														}

														if (var21 == 2) {
															field369[field436] = 580;
														}

														field370[field436] = var19.field1233;
														field367[field436] = var14;
														field368[field436] = var11.field582;
														field436++;
													}
												}
											}

											if (var11.field588 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field588[var22] != null) {
														field406[field436] = var11.field588[var22] + " @lre@" + var19.field1207;

														if (var22 == 0) {
															field369[field436] = 993;
														}

														if (var22 == 1) {
															field369[field436] = 583;
														}

														if (var22 == 2) {
															field369[field436] = 646;
														}

														if (var22 == 3) {
															field369[field436] = 239;
														}

														if (var22 == 4) {
															field369[field436] = 290;
														}

														field370[field436] = var19.field1233;
														field367[field436] = var14;
														field368[field436] = var11.field582;
														field436++;
													}
												}
											}

											field406[field436] = "Examine @lre@" + var19.field1207;
											field369[field436] = 1176;
											field370[field436] = var19.field1233;
											field367[field436] = var14;
											field368[field436] = var11.field582;
											field436++;
										} else if ((field279 & 0x10) == 0x10) {
											field406[field436] = field280 + " @lre@" + var19.field1207;
											field369[field436] = 320;
											field370[field436] = var19.field1233;
											field367[field436] = var14;
											field368[field436] = var11.field582;
											field436++;
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

	@ObfuscatedName("client.c(IZ)V")
	public final void method171(int arg0) {
		int var2 = QOKQYKHB.field1115[arg0].field1123;
		if (var2 != 0) {
			int var3 = field476[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					CPGFUBUO.method192(0.9D);
				}

				if (var3 == 2) {
					CPGFUBUO.method192(0.8D);
				}

				if (var3 == 3) {
					CPGFUBUO.method192(0.7D);
				}

				if (var3 == 4) {
					CPGFUBUO.method192(0.6D);
				}

				SWITYBRD.field1206.method230();
				field506 = true;
			}

			if (var2 == 3) {
				boolean var4 = field315;

				if (var3 == 0) {
					method75(field315, 0);
					field315 = true;
				}

				if (var3 == 1) {
					method75(field315, -400);
					field315 = true;
				}

				if (var3 == 2) {
					method75(field315, -800);
					field315 = true;
				}

				if (var3 == 3) {
					method75(field315, -1200);
					field315 = true;
				}

				if (var3 == 4) {
					field315 = false;
				}

				if (field315 != var4 && !field353) {
					if (field315) {
						field295 = field364;
						field296 = true;
						field438.method409(2, field295);
					} else {
						method168();
					}

					field222 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field456 = true;
					method165(0);
				}

				if (var3 == 1) {
					field456 = true;
					method165(-400);
				}

				if (var3 == 2) {
					field456 = true;
					method165(-800);
				}

				if (var3 == 3) {
					field456 = true;
					method165(-1200);
				}

				if (var3 == 4) {
					field456 = false;
				}
			}

			if (var2 == 5) {
				field448 = var3;
			}

			if (var2 == 6) {
				field342 = var3;
			}

			if (var2 == 8) {
				field497 = var3;
				field227 = true;
			}

			if (var2 == 9) {
				field490 = var3;
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method172(int arg0) {
		CPNGZAUN var2 = CPNGZAUN.field578[arg0];
		for (int var3 = 0; var3 < var2.field604.length && var2.field604[var3] != -1; var3++) {
			CPNGZAUN var4 = CPNGZAUN.field578[var2.field604[var3]];
			if (var4.field571 == 1) {
				method172(var4.field582);
			}

			var4.field579 = 0;
			var4.field574 = 0;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method173() {
		method81(20, "Starting up");

		if (signlink.sunjava) {
			field811 = 5;
		}

		if (field101) {
			field428 = true;
		} else {
			field101 = true;
			boolean var1 = false;
			String var2 = method98();
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
						field412[var3] = new TGFFTNFO(var3 + 1, 500000, signlink.cache_dat, signlink.cache_idx[var3]);
					}
				}

				try {
					method95();
					field111 = method99(1, "title", field372[1], "title screen", 25);
					field449 = new JQUNTFOC(field111, false, "p11_full");
					field450 = new JQUNTFOC(field111, false, "p12_full");
					field451 = new JQUNTFOC(field111, false, "b12_full");
					field452 = new JQUNTFOC(field111, true, "q8_full");
					method134();
					method44();
					LYZBHNJP var4 = method99(2, "config", field372[2], "config", 30);
					LYZBHNJP var5 = method99(3, "interface", field372[3], "interface", 35);
					LYZBHNJP var6 = method99(4, "media", field372[4], "2d graphics", 40);
					LYZBHNJP var7 = method99(6, "textures", field372[6], "textures", 45);
					LYZBHNJP var8 = method99(7, "wordenc", field372[7], "chat system", 50);
					LYZBHNJP var9 = method99(8, "sounds", field372[8], "sound effects", 55);
					field495 = new byte[4][104][104];
					field144 = new int[4][105][105];
					field489 = new NCUAQOFM(field144, 4, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field275[var10] = new NXLHMSCV(104, 104);
					}

					field420 = new LXRBRCRX(512, 512);
					LYZBHNJP var11 = method99(5, "versionlist", field372[5], "update list", 60);
					method81(60, "Connecting to update server");
					field438 = new SMQPXRFY();
					field438.method399(var11, this);
					RKTGZGSS.method379(field438.method407());
					CCYECDYX.method8(field438.method402(0), field438);

					if (!field353) {
						field295 = 0;
						try {
							field295 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field296 = true;
						field438.method409(2, field295);

						while (field438.method405() > 0) {
							method59();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field438.field1183 > 3) {
								method142("ondemand");
								return;
							}
						}
					}

					method81(65, "Requesting animations");
					int var12 = field438.method402(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field438.method409(1, var13);
					}

					while (field438.method405() > 0) {
						int var14 = var12 - field438.method405();
						if (var14 > 0) {
							method81(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method59();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field438.field1183 > 3) {
							method142("ondemand");
							return;
						}
					}

					method81(70, "Requesting models");
					int var15 = field438.method402(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field438.method395(var16);
						if ((var17 & 0x1) != 0) {
							field438.method409(0, var16);
						}
					}

					int var18 = field438.method405();
					while (field438.method405() > 0) {
						int var19 = var18 - field438.method405();
						if (var19 > 0) {
							method81(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method59();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field412[0] != null) {
						method81(75, "Requesting maps");
						field438.method409(3, field438.method388(0, 47, 48));
						field438.method409(3, field438.method388(1, 47, 48));
						field438.method409(3, field438.method388(0, 48, 48));
						field438.method409(3, field438.method388(1, 48, 48));
						field438.method409(3, field438.method388(0, 49, 48));
						field438.method409(3, field438.method388(1, 49, 48));
						field438.method409(3, field438.method388(0, 47, 47));
						field438.method409(3, field438.method388(1, 47, 47));
						field438.method409(3, field438.method388(0, 48, 47));
						field438.method409(3, field438.method388(1, 48, 47));
						field438.method409(3, field438.method388(0, 48, 148));
						field438.method409(3, field438.method388(1, 48, 148));
						int var20 = field438.method405();
						while (field438.method405() > 0) {
							int var21 = var20 - field438.method405();
							if (var21 > 0) {
								method81(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method59();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field438.method402(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field438.method395(var23);
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
							field438.method389(0, var23, var25);
						}
					}

					field438.method403(field352);

					if (!field353) {
						int var26 = field438.method402(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field438.method397(var27)) {
								field438.method389(2, var27, (byte) 1);
							}
						}
					}

					method81(80, "Unpacking media");
					field132 = new TAIXVIBM(var6, "invback", 0);
					field134 = new TAIXVIBM(var6, "chatback", 0);
					field133 = new TAIXVIBM(var6, "mapback", 0);
					field407 = new TAIXVIBM(var6, "backbase1", 0);
					field408 = new TAIXVIBM(var6, "backbase2", 0);
					field409 = new TAIXVIBM(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field434[var28] = new TAIXVIBM(var6, "sideicons", var28);
					}

					field262 = new LXRBRCRX(var6, "compass", 0);
					field202 = new LXRBRCRX(var6, "mapedge", 0);
					field202.method278();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field387[var29] = new TAIXVIBM(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field480[var30] = new LXRBRCRX(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field266[var31] = new LXRBRCRX(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field314[var32] = new LXRBRCRX(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field220 = new LXRBRCRX(var6, "mapmarker", 0);
					field221 = new LXRBRCRX(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field354[var33] = new LXRBRCRX(var6, "cross", var33);
					}

					field154 = new LXRBRCRX(var6, "mapdots", 0);
					field155 = new LXRBRCRX(var6, "mapdots", 1);
					field156 = new LXRBRCRX(var6, "mapdots", 2);
					field157 = new LXRBRCRX(var6, "mapdots", 3);
					field158 = new LXRBRCRX(var6, "mapdots", 4);
					field510 = new TAIXVIBM(var6, "scrollbar", 0);
					field511 = new TAIXVIBM(var6, "scrollbar", 1);
					field181 = new TAIXVIBM(var6, "redstone1", 0);
					field182 = new TAIXVIBM(var6, "redstone2", 0);
					field183 = new TAIXVIBM(var6, "redstone3", 0);
					field184 = new TAIXVIBM(var6, "redstone1", 0);
					field184.method425();
					field185 = new TAIXVIBM(var6, "redstone2", 0);
					field185.method425();
					field162 = new TAIXVIBM(var6, "redstone1", 0);
					field162.method426();
					field163 = new TAIXVIBM(var6, "redstone2", 0);
					field163.method426();
					field164 = new TAIXVIBM(var6, "redstone3", 0);
					field164.method426();
					field165 = new TAIXVIBM(var6, "redstone1", 0);
					field165.method425();
					field165.method426();
					field166 = new TAIXVIBM(var6, "redstone2", 0);
					field166.method425();
					field166.method426();

					for (int var34 = 0; var34 < 2; var34++) {
						field247[var34] = new TAIXVIBM(var6, "mod_icons", var34);
					}

					LXRBRCRX var35 = new LXRBRCRX(var6, "backleft1", 0);
					field102 = new ECAKBTRA(var35.field891, method49(), var35.field890);
					var35.method279(0, 0);
					LXRBRCRX var36 = new LXRBRCRX(var6, "backleft2", 0);
					field103 = new ECAKBTRA(var36.field891, method49(), var36.field890);
					var36.method279(0, 0);
					LXRBRCRX var37 = new LXRBRCRX(var6, "backright1", 0);
					field104 = new ECAKBTRA(var37.field891, method49(), var37.field890);
					var37.method279(0, 0);
					LXRBRCRX var38 = new LXRBRCRX(var6, "backright2", 0);
					field105 = new ECAKBTRA(var38.field891, method49(), var38.field890);
					var38.method279(0, 0);
					LXRBRCRX var39 = new LXRBRCRX(var6, "backtop1", 0);
					field106 = new ECAKBTRA(var39.field891, method49(), var39.field890);
					var39.method279(0, 0);
					LXRBRCRX var40 = new LXRBRCRX(var6, "backvmid1", 0);
					field107 = new ECAKBTRA(var40.field891, method49(), var40.field890);
					var40.method279(0, 0);
					LXRBRCRX var41 = new LXRBRCRX(var6, "backvmid2", 0);
					field108 = new ECAKBTRA(var41.field891, method49(), var41.field890);
					var41.method279(0, 0);
					LXRBRCRX var42 = new LXRBRCRX(var6, "backvmid3", 0);
					field109 = new ECAKBTRA(var42.field891, method49(), var42.field890);
					var42.method279(0, 0);
					LXRBRCRX var43 = new LXRBRCRX(var6, "backhmid2", 0);
					field110 = new ECAKBTRA(var43.field891, method49(), var43.field890);
					var43.method279(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field480[var48] != null) {
							field480[var48].method277(var44 + var47, var45 + var47, var46 + var47);
						}

						if (field387[var48] != null) {
							field387[var48].method427(var44 + var47, var45 + var47, var46 + var47);
						}
					}

					method81(83, "Unpacking textures");
					CPGFUBUO.method188(var7);
					CPGFUBUO.method192(0.8D);
					CPGFUBUO.method187(20);
					method81(86, "Unpacking config");
					ISUBRNPG.method225(var4);
					NNGZIOFO.method346(var4);
					IMXTJGZE.method221(var4);
					SWITYBRD.method421(var4);
					ZDMOUFDZ.method532(var4);
					FAQFGVMF.method215(var4);
					ZSSCYSIO.method588(var4);
					QOKQYKHB.method377(var4);
					DUFZKGOK.method206(var4);
					SWITYBRD.field1214 = field352;

					if (!field353) {
						method81(90, "Unpacking sounds");
						byte[] var49 = var9.method290("sounds.dat", null);
						ZOMNSJJM var50 = new ZOMNSJJM(var49);
						WFTRMPWZ.method448(var50);
					}

					method81(95, "Unpacking interfaces");
					JQUNTFOC[] var51 = new JQUNTFOC[] { field449, field450, field451, field452 };
					CPNGZAUN.method205(var51, var6, var5);
					method81(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field133.field1248[field133.field1250 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field463[var52] = var53;
						field363[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field133.field1248[field133.field1250 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field503[var56 - 5] = var57 - 25;
						field478[var56 - 5] = var58 - var57;
					}

					CPGFUBUO.method185(479, 96);
					field297 = CPGFUBUO.field558;
					CPGFUBUO.method185(190, 261);
					field298 = CPGFUBUO.field558;
					CPGFUBUO.method185(512, 334);
					field299 = CPGFUBUO.field558;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = CPGFUBUO.field556[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					NCUAQOFM.method328(334, 500, 512, 800, var60);
					XLNSJQUZ.method458(var8);
					field361 = new HFNJDDXC(this);
					method124(field361, 10);
					JVQZOBJO.field857 = this;
					NNGZIOFO.field992 = this;
					ZDMOUFDZ.field1431 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field255 + " " + field204);
					field97 = true;
				}
			} else {
				field382 = true;
			}
		}
	}

	@ObfuscatedName("client.c(IILZOMNSJJM;)V")
	public final void method174(int arg0, ZOMNSJJM arg1) {
		for (int var3 = 0; var3 < field444; var3++) {
			int var4 = field445[var3];
			TEBIXSCV var5 = field500[var4];
			int var6 = arg1.method547();
			if ((var6 & 0x2) != 0) {
				var5.field1046 = arg1.method554();
				var5.field1065 = 100;
			}

			if ((var6 & 0x40) != 0) {
				var5.field1257 = ZDMOUFDZ.method529(arg1.method574());
				var5.field1050 = var5.field1257.field1443;
				var5.field1058 = var5.field1257.field1444;
				var5.field1042 = var5.field1257.field1438;
				var5.field1043 = var5.field1257.field1450;
				var5.field1044 = var5.field1257.field1419;
				var5.field1045 = var5.field1257.field1425;
				var5.field1047 = var5.field1257.field1451;
			}

			if ((var6 & 0x8) != 0) {
				int var7 = arg1.method567();
				int var8 = arg1.method567();
				var5.method370(field399, var8, var7);
				var5.field1060 = field399 + 300;
				var5.field1061 = arg1.method567();
				var5.field1062 = arg1.method567();
			}

			if ((var6 & 0x10) != 0) {
				var5.field1088 = arg1.method575();
				if (var5.field1088 == 0xFFFF) {
					var5.field1088 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				int var9 = arg1.method573();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				int var10 = arg1.method567();
				if (var5.field1081 == var9 && var9 != -1) {
					int var11 = ISUBRNPG.field786[var9].field800;
					if (var11 == 1) {
						var5.field1082 = 0;
						var5.field1083 = 0;
						var5.field1084 = var10;
						var5.field1085 = 0;
					}

					if (var11 == 2) {
						var5.field1085 = 0;
					}
				} else if (var9 == -1 || var5.field1081 == -1 || ISUBRNPG.field786[var9].field794 >= ISUBRNPG.field786[var5.field1081].field794) {
					var5.field1081 = var9;
					var5.field1082 = 0;
					var5.field1083 = 0;
					var5.field1084 = var10;
					var5.field1085 = 0;
					var5.field1051 = var5.field1056;
				}
			}

			if ((var6 & 0x80) != 0) {
				var5.field1037 = arg1.method573();
				int var12 = arg1.method552();
				var5.field1041 = var12 >> 16;
				var5.field1040 = (var12 & 0xFFFF) + field399;
				var5.field1038 = 0;
				var5.field1039 = 0;

				if (var5.field1040 > field399) {
					var5.field1038 = -1;
				}

				if (var5.field1037 == 0xFFFF) {
					var5.field1037 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.field1079 = arg1.method575();
				var5.field1080 = arg1.method574();
			}

			if ((var6 & 0x4) != 0) {
				int var13 = arg1.method565();
				int var14 = arg1.method547();
				var5.method370(field399, var14, var13);
				var5.field1060 = field399 + 300;
				var5.field1061 = arg1.method565();
				var5.field1062 = arg1.method547();
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public static final String method175(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method176() {
		if (field130 == null) {
			method112();
			field818 = null;
			field286 = null;
			field287 = null;
			field288 = null;
			field289 = null;
			field290 = null;
			field291 = null;
			field292 = null;
			field293 = null;
			field294 = null;
			field130 = new ECAKBTRA(96, method49(), 479);
			field128 = new ECAKBTRA(156, method49(), 172);
			LRYUPGSZ.method267();
			field133.method428(0, 0);
			field127 = new ECAKBTRA(261, method49(), 190);
			field129 = new ECAKBTRA(334, method49(), 512);
			LRYUPGSZ.method267();
			field457 = new ECAKBTRA(50, method49(), 496);
			field458 = new ECAKBTRA(37, method49(), 269);
			field459 = new ECAKBTRA(45, method49(), 249);
			field506 = true;
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method177(int arg0, int arg1) {
		YSGENUJE var3 = field515[field190][arg0][arg1];
		if (var3 == null) {
			field489.method313(field190, arg0, arg1);
		} else {
			int var4 = -99999999;
			LBFKEYAG var5 = null;
			for (LBFKEYAG var6 = (LBFKEYAG) var3.method523(); var6 != null; var6 = (LBFKEYAG) var3.method525()) {
				SWITYBRD var7 = SWITYBRD.method416(var6.field863);
				int var8 = var7.field1244;
				if (var7.field1239) {
					var8 = (var6.field862 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method521(var5);
			LBFKEYAG var9 = null;
			LBFKEYAG var10 = null;
			for (LBFKEYAG var11 = (LBFKEYAG) var3.method523(); var11 != null; var11 = (LBFKEYAG) var3.method525()) {
				if (var5.field863 != var11.field863 && var9 == null) {
					var9 = var11;
				}

				if (var5.field863 != var11.field863 && var9.field863 != var11.field863 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field489.method299(var9, method151(field190, arg1 * 128 + 64, arg0 * 128 + 64), arg0, var12, var10, var5, arg1, field190);
		}
	}

	@ObfuscatedName("client.a(ZLCPNGZAUN;I)I")
	public final int method178(CPNGZAUN arg0, int arg1) {
		if (arg0.field581 == null || arg1 >= arg0.field581.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field581[arg1];
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
					var8 = field345[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field513[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field282[var3[var5++]];
				}

				if (var7 == 4) {
					CPNGZAUN var10 = CPNGZAUN.field578[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < SWITYBRD.field1201 && (!SWITYBRD.method416(var11).field1208 || field352)) {
						for (int var12 = 0; var12 < var10.field624.length; var12++) {
							if (var11 + 1 == var10.field624[var12]) {
								var8 += var10.field570[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field476[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field303[field513[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field476[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field403.field1104;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < TPWPPNUN.field1263; var13++) {
						if (TPWPPNUN.field1265[var13]) {
							var8 += field513[var13];
						}
					}
				}

				if (var7 == 10) {
					CPNGZAUN var14 = CPNGZAUN.field578[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < SWITYBRD.field1201 && (!SWITYBRD.method416(var15).field1208 || field352)) {
						for (int var16 = 0; var16 < var14.field624.length; var16++) {
							if (var14.field624[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field423;
				}

				if (var7 == 12) {
					var8 = field175;
				}

				if (var7 == 13) {
					int var17 = field476[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					DUFZKGOK var20 = DUFZKGOK.field719[var19];
					int var21 = var20.field721;
					int var22 = var20.field722;
					int var23 = var20.field723;
					int var24 = field365[var23 - var22];
					var8 = field476[var21] >> var22 & var24;
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
					var8 = (field403.field1069 >> 7) + field167;
				}

				if (var7 == 19) {
					var8 = (field403.field1070 >> 7) + field168;
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

	@ObfuscatedName("client.s(Z)V")
	public final void method179() {
		field127.method212();
		CPGFUBUO.field558 = field298;
		field132.method428(0, 0);

		if (field329 != -1) {
			method45(0, 0, CPNGZAUN.field578[field329], 0);
		} else if (field113[field492] != -1) {
			method45(0, 0, CPNGZAUN.field578[field113[field492]], 0);
		}

		if (field191 && field332 == 1) {
			method126();
		}

		field127.method213(553, field817, 205);
		field129.method212();
		CPGFUBUO.field558 = field299;
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field303[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field365[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
