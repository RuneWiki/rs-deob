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
public final class client extends ARNQXZCA {

	@ObfuscatedName("client.I")
	public boolean field179 = false;

	@ObfuscatedName("client.K")
	public int[] field181 = new int[50];

	@ObfuscatedName("client.L")
	public int field182 = -1;

	@ObfuscatedName("client.M")
	public int field183 = -1;

	@ObfuscatedName("client.N")
	public int[] field184 = new int[151];

	@ObfuscatedName("client.P")
	public int[] field186 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.V")
	public XRUIQOVM[] field192 = new XRUIQOVM[100];

	@ObfuscatedName("client.cb")
	public int field199 = 0x23201B;

	@ObfuscatedName("client.eb")
	public int[] field201 = new int[5];

	@ObfuscatedName("client.gb")
	public int[] field202 = new int[7];

	@ObfuscatedName("client.hb")
	public int[][] field203 = new int[104][104];

	@ObfuscatedName("client.jb")
	public boolean field204 = false;

	@ObfuscatedName("client.tb")
	public boolean field213 = true;

	@ObfuscatedName("client.ub")
	public String field214 = "";

	@ObfuscatedName("client.Ib")
	public int field227 = 78;

	@ObfuscatedName("client.Mb")
	public int[] field228 = new int[9];

	@ObfuscatedName("client.Pb")
	public int field231 = -1;

	@ObfuscatedName("client.Wb")
	public int[] field238 = new int[33];

	@ObfuscatedName("client.Xb")
	public int field239 = -1;

	@ObfuscatedName("client.ac")
	public LZWRHABP field242 = LZWRHABP.method451(1);

	@ObfuscatedName("client.bc")
	public boolean field243 = false;

	@ObfuscatedName("client.fc")
	public int field246 = -1;

	@ObfuscatedName("client.hc")
	public boolean field248 = false;

	@ObfuscatedName("client.jc")
	public boolean field250 = false;

	@ObfuscatedName("client.lc")
	public int field252 = 2;

	@ObfuscatedName("client.oc")
	public boolean field255 = false;

	@ObfuscatedName("client.qc")
	public boolean field256 = true;

	@ObfuscatedName("client.rc")
	public boolean field257 = false;

	@ObfuscatedName("client.zc")
	public int field264 = 1;

	@ObfuscatedName("client.Bc")
	public int[] field266 = new int[QFHYLQAY.field1268];

	@ObfuscatedName("client.Ec")
	public boolean field268 = true;

	@ObfuscatedName("client.Ic")
	public INRTBCYJ[] field272 = new INRTBCYJ[1000];

	@ObfuscatedName("client.Jc")
	public int[] field273 = new int[100];

	@ObfuscatedName("client.Kc")
	public String[] field274 = new String[100];

	@ObfuscatedName("client.Lc")
	public String[] field275 = new String[100];

	@ObfuscatedName("client.Sc")
	public boolean field281 = false;

	@ObfuscatedName("client.hd")
	public String field295 = "";

	@ObfuscatedName("client.id")
	public boolean[] field296 = new boolean[5];

	@ObfuscatedName("client.md")
	public int[] field300 = new int[1000];

	@ObfuscatedName("client.nd")
	public LZWRHABP field301 = LZWRHABP.method451(1);

	@ObfuscatedName("client.od")
	public long[] field302 = new long[100];

	@ObfuscatedName("client.pd")
	public int field303 = -1;

	@ObfuscatedName("client.qd")
	public boolean field304 = false;

	@ObfuscatedName("client.rd")
	public JSAXNSIH[][][] field305 = new JSAXNSIH[4][104][104];

	@ObfuscatedName("client.td")
	public int[] field306 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.vd")
	public KZCDTFDB[] field308 = new KZCDTFDB[4];

	@ObfuscatedName("client.yd")
	public GMYKUSOM field311 = new GMYKUSOM();

	@ObfuscatedName("client.Cd")
	public int[] field313 = new int[2000];

	@ObfuscatedName("client.Ed")
	public int[] field315 = new int[5];

	@ObfuscatedName("client.Fd")
	public String field316 = "";

	@ObfuscatedName("client.Gd")
	public String field317 = "";

	@ObfuscatedName("client.Ld")
	public int[] field321 = new int[500];

	@ObfuscatedName("client.Md")
	public int[] field322 = new int[500];

	@ObfuscatedName("client.Nd")
	public int[] field323 = new int[500];

	@ObfuscatedName("client.Od")
	public int[] field324 = new int[500];

	@ObfuscatedName("client.Pd")
	public int field325 = -1;

	@ObfuscatedName("client.Ud")
	public boolean field330 = true;

	@ObfuscatedName("client.se")
	public String field354 = "";

	@ObfuscatedName("client.ue")
	public boolean field355 = false;

	@ObfuscatedName("client.ve")
	public XRUIQOVM[] field356 = new XRUIQOVM[2];

	@ObfuscatedName("client.we")
	public int field357 = -1;

	@ObfuscatedName("client.ze")
	public INRTBCYJ[] field360 = new INRTBCYJ[32];

	@ObfuscatedName("client.Ce")
	public String field363 = "";

	@ObfuscatedName("client.Fe")
	public boolean field365 = false;

	@ObfuscatedName("client.He")
	public int field367 = -1;

	@ObfuscatedName("client.Ie")
	public JSAXNSIH field368 = new JSAXNSIH();

	@ObfuscatedName("client.Pe")
	public AIGFCJME[] field374 = new AIGFCJME[5];

	@ObfuscatedName("client.Ye")
	public int field381 = -1;

	@ObfuscatedName("client.ff")
	public String[] field388 = new String[500];

	@ObfuscatedName("client.of")
	public boolean field392 = false;

	@ObfuscatedName("client.zf")
	public boolean field399 = false;

	@ObfuscatedName("client.Af")
	public CRC32 field400 = new CRC32();

	@ObfuscatedName("client.Ef")
	public int field403 = -1;

	@ObfuscatedName("client.Ff")
	public int field404 = 128;

	@ObfuscatedName("client.Jf")
	public int[] field408 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Kf")
	public boolean field409 = false;

	@ObfuscatedName("client.Tf")
	public INRTBCYJ[] field418 = new INRTBCYJ[32];

	@ObfuscatedName("client.Yf")
	public int[] field423 = new int[50];

	@ObfuscatedName("client.ag")
	public final int[] field425 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.bg")
	public volatile boolean field426 = false;

	@ObfuscatedName("client.dg")
	public int field428 = 3;

	@ObfuscatedName("client.eg")
	public int[] field429 = new int[5];

	@ObfuscatedName("client.ig")
	public int[] field432 = new int[2000];

	@ObfuscatedName("client.ng")
	public String field436 = "";

	@ObfuscatedName("client.qg")
	public int[] field438 = new int[1000];

	@ObfuscatedName("client.rg")
	public int[] field439 = new int[1000];

	@ObfuscatedName("client.sg")
	public boolean field440 = false;

	@ObfuscatedName("client.vg")
	public long[] field443 = new long[200];

	@ObfuscatedName("client.xg")
	public boolean field444 = false;

	@ObfuscatedName("client.yg")
	public int[] field445 = new int[QFHYLQAY.field1268];

	@ObfuscatedName("client.Fg")
	public int field451 = 0x4D4233;

	@ObfuscatedName("client.Ig")
	public boolean field454 = true;

	@ObfuscatedName("client.Jg")
	public boolean field455 = false;

	@ObfuscatedName("client.Kg")
	public INRTBCYJ[] field456 = new INRTBCYJ[8];

	@ObfuscatedName("client.Lg")
	public LZWRHABP field457 = LZWRHABP.method451(1);

	@ObfuscatedName("client.Og")
	public JSAXNSIH field460 = new JSAXNSIH();

	@ObfuscatedName("client.Pg")
	public int[] field461 = new int[33];

	@ObfuscatedName("client.Sg")
	public INRTBCYJ[] field462 = new INRTBCYJ[20];

	@ObfuscatedName("client.Tg")
	public boolean field463 = false;

	@ObfuscatedName("client.kh")
	public boolean field477 = false;

	@ObfuscatedName("client.lh")
	public volatile boolean field478 = false;

	@ObfuscatedName("client.mh")
	public boolean field479 = false;

	@ObfuscatedName("client.zh")
	public int field491 = 50;

	@ObfuscatedName("client.Ah")
	public int[] field492 = new int[field491];

	@ObfuscatedName("client.Bh")
	public int[] field493 = new int[field491];

	@ObfuscatedName("client.Ch")
	public int[] field494 = new int[field491];

	@ObfuscatedName("client.Dh")
	public int[] field495 = new int[field491];

	@ObfuscatedName("client.Eh")
	public int[] field496 = new int[field491];

	@ObfuscatedName("client.Fh")
	public int[] field497 = new int[field491];

	@ObfuscatedName("client.Gh")
	public int[] field498 = new int[field491];

	@ObfuscatedName("client.Hh")
	public String[] field499 = new String[field491];

	@ObfuscatedName("client.Kh")
	public int field501 = 1;

	@ObfuscatedName("client.Oh")
	public int[] field505 = new int[200];

	@ObfuscatedName("client.Rh")
	public JSAXNSIH field508 = new JSAXNSIH();

	@ObfuscatedName("client.Sh")
	public int field509 = -1;

	@ObfuscatedName("client.Th")
	public int field510 = -1;

	@ObfuscatedName("client.Vh")
	public int field512 = 2;

	@ObfuscatedName("client.Xh")
	public int[] field513 = new int[5];

	@ObfuscatedName("client.Zh")
	public int[] field514 = new int[QFHYLQAY.field1268];

	@ObfuscatedName("client.gi")
	public int field521 = 2;

	@ObfuscatedName("client.ii")
	public int field523 = -1;

	@ObfuscatedName("client.ji")
	public int[] field524 = new int[4000];

	@ObfuscatedName("client.ki")
	public int[] field525 = new int[4000];

	@ObfuscatedName("client.li")
	public INRTBCYJ[] field526 = new INRTBCYJ[32];

	@ObfuscatedName("client.oi")
	public final int field529 = 100;

	@ObfuscatedName("client.pi")
	public int[] field530 = new int[100];

	@ObfuscatedName("client.yi")
	public String[] field539 = new String[200];

	@ObfuscatedName("client.zi")
	public int[] field540 = new int[256];

	@ObfuscatedName("client.Bi")
	public XRUIQOVM[] field541 = new XRUIQOVM[13];

	@ObfuscatedName("client.Di")
	public LZWRHABP field543 = new LZWRHABP(new byte[5000]);

	@ObfuscatedName("client.Ei")
	public XQNGYHCW[] field544 = new XQNGYHCW[16384];

	@ObfuscatedName("client.Gi")
	public int[] field546 = new int[16384];

	@ObfuscatedName("client.Ri")
	public String field554 = "";

	@ObfuscatedName("client.Si")
	public String field555 = "";

	@ObfuscatedName("client.Vi")
	public int[][][] field557 = new int[4][13][13];

	@ObfuscatedName("client.Yi")
	public int field559 = 0x766654;

	@ObfuscatedName("client.cj")
	public byte[] field562 = new byte[16384];

	@ObfuscatedName("client.dj")
	public String[] field563 = new String[5];

	@ObfuscatedName("client.ej")
	public boolean[] field564 = new boolean[5];

	@ObfuscatedName("client.mj")
	public int field572 = 2048;

	@ObfuscatedName("client.nj")
	public int field573 = 2047;

	@ObfuscatedName("client.oj")
	public ISLZFAII[] field574 = new ISLZFAII[field572];

	@ObfuscatedName("client.qj")
	public int[] field576 = new int[field572];

	@ObfuscatedName("client.sj")
	public int[] field578 = new int[field572];

	@ObfuscatedName("client.tj")
	public LZWRHABP[] field579 = new LZWRHABP[field572];

	@ObfuscatedName("client.Cj")
	public INRTBCYJ[] field587 = new INRTBCYJ[100];

	@ObfuscatedName("client.Hj")
	public int field592 = -1;

	@ObfuscatedName("client.Ij")
	public int field593 = -1;

	@ObfuscatedName("client.Nj")
	public int[][] field598 = new int[104][104];

	@ObfuscatedName("client.Xj")
	public int[] field607 = new int[5];

	@ObfuscatedName("client.bk")
	public boolean field610 = false;

	@ObfuscatedName("client.dk")
	public volatile boolean field612 = false;

	@ObfuscatedName("client.ek")
	public int[] field613 = new int[151];

	@ObfuscatedName("client.gk")
	public int field614 = 0x332D25;

	@ObfuscatedName("client.jk")
	public boolean field617 = false;

	@ObfuscatedName("client.lk")
	public int[][] field618 = new int[104][104];

	@ObfuscatedName("client.mk")
	public int[] field619 = new int[50];

	@ObfuscatedName("client.nc")
	public static String field254 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Cc")
	public static int[] field267 = new int[32];

	@ObfuscatedName("client.Mg")
	public static final int[][] field458 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.th")
	public static int field485 = 10;

	@ObfuscatedName("client.vh")
	public static boolean field487 = true;

	@ObfuscatedName("client.Ph")
	public static final int[] field506 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.hi")
	public static BigInteger field522 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ci")
	public static BigInteger field542 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Oj")
	public static int[] field599 = new int[99];

	@ObfuscatedName("client.J")
	public int field180;

	@ObfuscatedName("client.O")
	public int field185;

	@ObfuscatedName("client.Q")
	public int field187;

	@ObfuscatedName("client.R")
	public int field188;

	@ObfuscatedName("client.S")
	public int field189;

	@ObfuscatedName("client.T")
	public int field190;

	@ObfuscatedName("client.U")
	public int field191;

	@ObfuscatedName("client.W")
	public int field193;

	@ObfuscatedName("client.X")
	public int field194;

	@ObfuscatedName("client.bb")
	public int field198;

	@ObfuscatedName("client.db")
	public static int field200;

	@ObfuscatedName("client.lb")
	public static int field205;

	@ObfuscatedName("client.mb")
	public int field206;

	@ObfuscatedName("client.nb")
	public int field207;

	@ObfuscatedName("client.ob")
	public int field208;

	@ObfuscatedName("client.pb")
	public int field209;

	@ObfuscatedName("client.qb")
	public int field210;

	@ObfuscatedName("client.rb")
	public static int field211;

	@ObfuscatedName("client.sb")
	public int field212;

	@ObfuscatedName("client.yb")
	public int field218;

	@ObfuscatedName("client.zb")
	public int field219;

	@ObfuscatedName("client.Ab")
	public int field220;

	@ObfuscatedName("client.Nb")
	public static int field229;

	@ObfuscatedName("client.Qb")
	public int field232;

	@ObfuscatedName("client.Zb")
	public int field241;

	@ObfuscatedName("client.cc")
	public int field244;

	@ObfuscatedName("client.gc")
	public static int field247;

	@ObfuscatedName("client.ic")
	public int field249;

	@ObfuscatedName("client.kc")
	public int field251;

	@ObfuscatedName("client.mc")
	public int field253;

	@ObfuscatedName("client.uc")
	public int field259;

	@ObfuscatedName("client.vc")
	public int field260;

	@ObfuscatedName("client.wc")
	public int field261;

	@ObfuscatedName("client.yc")
	public int field263;

	@ObfuscatedName("client.Ac")
	public int field265;

	@ObfuscatedName("client.Fc")
	public int field269;

	@ObfuscatedName("client.Gc")
	public int field270;

	@ObfuscatedName("client.Nc")
	public static int field277;

	@ObfuscatedName("client.Pc")
	public int field278;

	@ObfuscatedName("client.Qc")
	public int field279;

	@ObfuscatedName("client.Rc")
	public int field280;

	@ObfuscatedName("client.bd")
	public static int field290;

	@ObfuscatedName("client.dd")
	public int field291;

	@ObfuscatedName("client.ed")
	public static int field292;

	@ObfuscatedName("client.jd")
	public int field297;

	@ObfuscatedName("client.kd")
	public int field298;

	@ObfuscatedName("client.ld")
	public int field299;

	@ObfuscatedName("client.ud")
	public int field307;

	@ObfuscatedName("client.wd")
	public int field309;

	@ObfuscatedName("client.xd")
	public int field310;

	@ObfuscatedName("client.Dd")
	public static int field314;

	@ObfuscatedName("client.Rd")
	public int field327;

	@ObfuscatedName("client.Sd")
	public int field328;

	@ObfuscatedName("client.Td")
	public int field329;

	@ObfuscatedName("client.Vd")
	public int field331;

	@ObfuscatedName("client.Wd")
	public int field332;

	@ObfuscatedName("client.Xd")
	public int field333;

	@ObfuscatedName("client.Yd")
	public int field334;

	@ObfuscatedName("client.Zd")
	public int field335;

	@ObfuscatedName("client.ae")
	public static int field336;

	@ObfuscatedName("client.ee")
	public int field340;

	@ObfuscatedName("client.fe")
	public int field341;

	@ObfuscatedName("client.xe")
	public int field358;

	@ObfuscatedName("client.Ae")
	public int field361;

	@ObfuscatedName("client.Ee")
	public int field364;

	@ObfuscatedName("client.Ge")
	public int field366;

	@ObfuscatedName("client.Se")
	public int field376;

	@ObfuscatedName("client.Te")
	public int field377;

	@ObfuscatedName("client.Ue")
	public int field378;

	@ObfuscatedName("client.Ve")
	public int field379;

	@ObfuscatedName("client.df")
	public int field386;

	@ObfuscatedName("client.ef")
	public int field387;

	@ObfuscatedName("client.jf")
	public static int field389;

	@ObfuscatedName("client.kf")
	public int field390;

	@ObfuscatedName("client.lf")
	public static int field391;

	@ObfuscatedName("client.qf")
	public int field393;

	@ObfuscatedName("client.rf")
	public int field394;

	@ObfuscatedName("client.tf")
	public int field395;

	@ObfuscatedName("client.uf")
	public int field396;

	@ObfuscatedName("client.vf")
	public int field397;

	@ObfuscatedName("client.xf")
	public int field398;

	@ObfuscatedName("client.Cf")
	public static int field402;

	@ObfuscatedName("client.Gf")
	public int field405;

	@ObfuscatedName("client.Hf")
	public int field406;

	@ObfuscatedName("client.If")
	public int field407;

	@ObfuscatedName("client.Qf")
	public int field415;

	@ObfuscatedName("client.Sf")
	public int field417;

	@ObfuscatedName("client.Wf")
	public int field421;

	@ObfuscatedName("client.Zf")
	public int field424;

	@ObfuscatedName("client.cg")
	public int field427;

	@ObfuscatedName("client.fg")
	public static int field430;

	@ObfuscatedName("client.gg")
	public int field431;

	@ObfuscatedName("client.kg")
	public int field434;

	@ObfuscatedName("client.lg")
	public int field435;

	@ObfuscatedName("client.pg")
	public int field437;

	@ObfuscatedName("client.tg")
	public int field441;

	@ObfuscatedName("client.ug")
	public int field442;

	@ObfuscatedName("client.Eg")
	public int field450;

	@ObfuscatedName("client.Hg")
	public int field453;

	@ObfuscatedName("client.Ng")
	public int field459;

	@ObfuscatedName("client.fh")
	public int field473;

	@ObfuscatedName("client.gh")
	public int field474;

	@ObfuscatedName("client.oh")
	public int field480;

	@ObfuscatedName("client.ph")
	public int field481;

	@ObfuscatedName("client.qh")
	public int field482;

	@ObfuscatedName("client.rh")
	public int field483;

	@ObfuscatedName("client.sh")
	public int field484;

	@ObfuscatedName("client.uh")
	public static int field486;

	@ObfuscatedName("client.xh")
	public int field489;

	@ObfuscatedName("client.yh")
	public int field490;

	@ObfuscatedName("client.Jh")
	public int field500;

	@ObfuscatedName("client.Lh")
	public static int field502;

	@ObfuscatedName("client.Mh")
	public int field503;

	@ObfuscatedName("client.Nh")
	public int field504;

	@ObfuscatedName("client.Qh")
	public int field507;

	@ObfuscatedName("client.Uh")
	public int field511;

	@ObfuscatedName("client.ai")
	public int field515;

	@ObfuscatedName("client.bi")
	public int field516;

	@ObfuscatedName("client.ci")
	public int field517;

	@ObfuscatedName("client.di")
	public int field518;

	@ObfuscatedName("client.ei")
	public int field519;

	@ObfuscatedName("client.fi")
	public int field520;

	@ObfuscatedName("client.qi")
	public int field531;

	@ObfuscatedName("client.ri")
	public int field532;

	@ObfuscatedName("client.si")
	public int field533;

	@ObfuscatedName("client.ti")
	public int field534;

	@ObfuscatedName("client.ui")
	public int field535;

	@ObfuscatedName("client.vi")
	public int field536;

	@ObfuscatedName("client.wi")
	public int field537;

	@ObfuscatedName("client.xi")
	public int field538;

	@ObfuscatedName("client.Fi")
	public int field545;

	@ObfuscatedName("client.Hi")
	public int field547;

	@ObfuscatedName("client.Li")
	public int field549;

	@ObfuscatedName("client.Mi")
	public int field550;

	@ObfuscatedName("client.Ni")
	public int field551;

	@ObfuscatedName("client.Oi")
	public int field552;

	@ObfuscatedName("client.Pi")
	public int field553;

	@ObfuscatedName("client.Ti")
	public static int field556;

	@ObfuscatedName("client.Xi")
	public int field558;

	@ObfuscatedName("client.gj")
	public int field566;

	@ObfuscatedName("client.hj")
	public int field567;

	@ObfuscatedName("client.ij")
	public int field568;

	@ObfuscatedName("client.jj")
	public int field569;

	@ObfuscatedName("client.kj")
	public int field570;

	@ObfuscatedName("client.lj")
	public static int field571;

	@ObfuscatedName("client.pj")
	public int field575;

	@ObfuscatedName("client.rj")
	public int field577;

	@ObfuscatedName("client.uj")
	public int field580;

	@ObfuscatedName("client.zj")
	public int field584;

	@ObfuscatedName("client.Aj")
	public static int field585;

	@ObfuscatedName("client.Bj")
	public int field586;

	@ObfuscatedName("client.Dj")
	public int field588;

	@ObfuscatedName("client.Ej")
	public int field589;

	@ObfuscatedName("client.Fj")
	public int field590;

	@ObfuscatedName("client.Gj")
	public int field591;

	@ObfuscatedName("client.Jj")
	public int field594;

	@ObfuscatedName("client.Kj")
	public int field595;

	@ObfuscatedName("client.Lj")
	public int field596;

	@ObfuscatedName("client.Mj")
	public int field597;

	@ObfuscatedName("client.Pj")
	public int field600;

	@ObfuscatedName("client.Rj")
	public int field601;

	@ObfuscatedName("client.Sj")
	public int field602;

	@ObfuscatedName("client.Tj")
	public int field603;

	@ObfuscatedName("client.Uj")
	public int field604;

	@ObfuscatedName("client.Vj")
	public int field605;

	@ObfuscatedName("client.Wj")
	public int field606;

	@ObfuscatedName("client.Yj")
	public int field608;

	@ObfuscatedName("client.ck")
	public int field611;

	@ObfuscatedName("client.hk")
	public int field615;

	@ObfuscatedName("client.ik")
	public int field616;

	@ObfuscatedName("client.nk")
	public int field620;

	@ObfuscatedName("client.gd")
	public long field294;

	@ObfuscatedName("client.Qe")
	public long field375;

	@ObfuscatedName("client.Bf")
	public long field401;

	@ObfuscatedName("client.Uf")
	public long field419;

	@ObfuscatedName("client.ak")
	public long field609;

	@ObfuscatedName("client.Kd")
	public BJATBFRK field320;

	@ObfuscatedName("client.ye")
	public EWALAKUU field359;

	@ObfuscatedName("client.Mf")
	public FUOSCRKP field411;

	@ObfuscatedName("client.Nf")
	public FUOSCRKP field412;

	@ObfuscatedName("client.Of")
	public FUOSCRKP field413;

	@ObfuscatedName("client.Pf")
	public FUOSCRKP field414;

	@ObfuscatedName("client.Mc")
	public HGDLUQYC field276;

	@ObfuscatedName("client.Ob")
	public INEPYSAC field230;

	@ObfuscatedName("client.sc")
	public INRTBCYJ field258;

	@ObfuscatedName("client.Hc")
	public INRTBCYJ field271;

	@ObfuscatedName("client.Id")
	public INRTBCYJ field318;

	@ObfuscatedName("client.Jd")
	public INRTBCYJ field319;

	@ObfuscatedName("client.be")
	public INRTBCYJ field337;

	@ObfuscatedName("client.he")
	public INRTBCYJ field343;

	@ObfuscatedName("client.ie")
	public INRTBCYJ field344;

	@ObfuscatedName("client.Je")
	public INRTBCYJ field369;

	@ObfuscatedName("client.Ke")
	public INRTBCYJ field370;

	@ObfuscatedName("client.Le")
	public INRTBCYJ field371;

	@ObfuscatedName("client.Me")
	public INRTBCYJ field372;

	@ObfuscatedName("client.Ne")
	public INRTBCYJ field373;

	@ObfuscatedName("client.Gg")
	public INRTBCYJ field452;

	@ObfuscatedName("client.aj")
	public INRTBCYJ field560;

	@ObfuscatedName("client.bj")
	public INRTBCYJ field561;

	@ObfuscatedName("client.Ki")
	public static ISLZFAII field548;

	@ObfuscatedName("client.Vf")
	public MHZWCOLS field420;

	@ObfuscatedName("client.vb")
	public NMOELDRY field215;

	@ObfuscatedName("client.wb")
	public NMOELDRY field216;

	@ObfuscatedName("client.xb")
	public NMOELDRY field217;

	@ObfuscatedName("client.je")
	public NMOELDRY field345;

	@ObfuscatedName("client.ke")
	public NMOELDRY field346;

	@ObfuscatedName("client.le")
	public NMOELDRY field347;

	@ObfuscatedName("client.me")
	public NMOELDRY field348;

	@ObfuscatedName("client.ne")
	public NMOELDRY field349;

	@ObfuscatedName("client.oe")
	public NMOELDRY field350;

	@ObfuscatedName("client.pe")
	public NMOELDRY field351;

	@ObfuscatedName("client.qe")
	public NMOELDRY field352;

	@ObfuscatedName("client.re")
	public NMOELDRY field353;

	@ObfuscatedName("client.Ag")
	public NMOELDRY field446;

	@ObfuscatedName("client.Bg")
	public NMOELDRY field447;

	@ObfuscatedName("client.Cg")
	public NMOELDRY field448;

	@ObfuscatedName("client.Dg")
	public NMOELDRY field449;

	@ObfuscatedName("client.Ug")
	public NMOELDRY field464;

	@ObfuscatedName("client.Vg")
	public NMOELDRY field465;

	@ObfuscatedName("client.Wg")
	public NMOELDRY field466;

	@ObfuscatedName("client.Xg")
	public NMOELDRY field467;

	@ObfuscatedName("client.Yg")
	public NMOELDRY field468;

	@ObfuscatedName("client.Zg")
	public NMOELDRY field469;

	@ObfuscatedName("client.ah")
	public NMOELDRY field470;

	@ObfuscatedName("client.bh")
	public NMOELDRY field471;

	@ObfuscatedName("client.ch")
	public NMOELDRY field472;

	@ObfuscatedName("client.Bd")
	public SRZUEVOD field312;

	@ObfuscatedName("client.Y")
	public XRUIQOVM field195;

	@ObfuscatedName("client.Z")
	public XRUIQOVM field196;

	@ObfuscatedName("client.ab")
	public XRUIQOVM field197;

	@ObfuscatedName("client.Rb")
	public XRUIQOVM field233;

	@ObfuscatedName("client.Sb")
	public XRUIQOVM field234;

	@ObfuscatedName("client.Tb")
	public XRUIQOVM field235;

	@ObfuscatedName("client.Ub")
	public XRUIQOVM field236;

	@ObfuscatedName("client.Vb")
	public XRUIQOVM field237;

	@ObfuscatedName("client.Tc")
	public XRUIQOVM field282;

	@ObfuscatedName("client.Uc")
	public XRUIQOVM field283;

	@ObfuscatedName("client.Vc")
	public XRUIQOVM field284;

	@ObfuscatedName("client.Wc")
	public XRUIQOVM field285;

	@ObfuscatedName("client.Xc")
	public XRUIQOVM field286;

	@ObfuscatedName("client.ih")
	public XRUIQOVM field475;

	@ObfuscatedName("client.jh")
	public XRUIQOVM field476;

	@ObfuscatedName("client.mi")
	public XRUIQOVM field527;

	@ObfuscatedName("client.ni")
	public XRUIQOVM field528;

	@ObfuscatedName("client.wj")
	public XRUIQOVM field581;

	@ObfuscatedName("client.xj")
	public XRUIQOVM field582;

	@ObfuscatedName("client.yj")
	public XRUIQOVM field583;

	@ObfuscatedName("client.xc")
	public String field262;

	@ObfuscatedName("client.Qd")
	public String field326;

	@ObfuscatedName("client.We")
	public String field380;

	@ObfuscatedName("client.Lf")
	public String field410;

	@ObfuscatedName("client.Rf")
	public Socket field416;

	@ObfuscatedName("client.Yb")
	public static boolean field240;

	@ObfuscatedName("client.ec")
	public static boolean field245;

	@ObfuscatedName("client.Xf")
	public static boolean field422;

	@ObfuscatedName("client.wh")
	public static boolean field488;

	@ObfuscatedName("client.Bb")
	public int[] field221;

	@ObfuscatedName("client.Cb")
	public int[] field222;

	@ObfuscatedName("client.Eb")
	public int[] field223;

	@ObfuscatedName("client.Fb")
	public int[] field224;

	@ObfuscatedName("client.Gb")
	public int[] field225;

	@ObfuscatedName("client.Hb")
	public int[] field226;

	@ObfuscatedName("client.Yc")
	public int[] field287;

	@ObfuscatedName("client.Zc")
	public int[] field288;

	@ObfuscatedName("client.ad")
	public int[] field289;

	@ObfuscatedName("client.ce")
	public int[] field338;

	@ObfuscatedName("client.de")
	public int[] field339;

	@ObfuscatedName("client.Ze")
	public int[] field382;

	@ObfuscatedName("client.af")
	public int[] field383;

	@ObfuscatedName("client.bf")
	public int[] field384;

	@ObfuscatedName("client.cf")
	public int[] field385;

	@ObfuscatedName("client.Be")
	public XRUIQOVM[] field362;

	@ObfuscatedName("client.ge")
	public byte[][] field342;

	@ObfuscatedName("client.fj")
	public byte[][] field565;

	@ObfuscatedName("client.jg")
	public byte[][][] field433;

	@ObfuscatedName("client.fd")
	public int[][][] field293;

	@ObfuscatedName("client.a(LGMYKUSOM;I)Z")
	public final boolean method78(GMYKUSOM arg0) {
		int var2 = arg0.field899;
		if (field435 == 2) {
			if (var2 == 201) {
				field248 = true;
				field489 = 0;
				field365 = true;
				field214 = "";
				field558 = 1;
				field363 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field248 = true;
				field489 = 0;
				field365 = true;
				field214 = "";
				field558 = 2;
				field363 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field335 = 250;
			return true;
		}

		if (var2 == 501) {
			field248 = true;
			field489 = 0;
			field365 = true;
			field214 = "";
			field558 = 4;
			field363 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field248 = true;
			field489 = 0;
			field365 = true;
			field214 = "";
			field558 = 5;
			field363 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field202[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = BGEILVDT.field99 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= BGEILVDT.field99) {
							var5 = 0;
						}
					}

					if (!BGEILVDT.field100[var5].field106 && BGEILVDT.field100[var5].field101 == var3 + (field213 ? 0 : 7)) {
						break;
					}
				}

				field202[var3] = var5;
				field409 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field201[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field458[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field458[var6].length) {
					var8 = 0;
				}
			}

			field201[var6] = var8;
			field409 = true;
		}

		if (var2 == 324 && !field213) {
			field213 = true;
			method89();
		}

		if (var2 == 325 && field213) {
			field213 = false;
			method89();
		}

		if (var2 == 326) {
			field242.method452(122);
			field242.method453(field213 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field242.method453(field202[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field242.method453(field201[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field392 = !field392;
		}

		if (var2 >= 601 && var2 <= 613) {
			method123();

			if (field295.length() > 0) {
				field242.method452(130);
				field242.method459(CSEYUXAS.method216(field295));
				field242.method453(var2 - 601);
				field242.method453(field392 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method79() {
		if (field464 == null) {
			field65 = null;
			field449 = null;
			field447 = null;
			field446 = null;
			field448 = null;
			field215 = null;
			field216 = null;
			field217 = null;
			field467 = new NMOELDRY(265, 128, method17());
			CYEOWDOP.method227();
			field468 = new NMOELDRY(265, 128, method17());
			CYEOWDOP.method227();
			field464 = new NMOELDRY(171, 509, method17());
			CYEOWDOP.method227();
			field465 = new NMOELDRY(132, 360, method17());
			CYEOWDOP.method227();
			field466 = new NMOELDRY(200, 360, method17());
			CYEOWDOP.method227();
			field469 = new NMOELDRY(238, 202, method17());
			CYEOWDOP.method227();
			field470 = new NMOELDRY(238, 203, method17());
			CYEOWDOP.method227();
			field471 = new NMOELDRY(94, 74, method17());
			CYEOWDOP.method227();
			field472 = new NMOELDRY(94, 75, method17());
			CYEOWDOP.method227();

			if (field312 != null) {
				method168();
				method120();
			}

			field617 = true;
		}
	}

	@ObfuscatedName("client.f(I)I")
	public final int method80() {
		int var1 = 3;
		if (field552 < 310) {
			int var2 = field549 >> 7;
			int var3 = field551 >> 7;
			int var4 = field548.field1395 >> 7;
			int var5 = field548.field1396 >> 7;

			if ((field433[field580][var2][var3] & 0x4) != 0) {
				var1 = field580;
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

					if ((field433[field580][var2][var3] & 0x4) != 0) {
						var1 = field580;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field433[field580][var2][var3] & 0x4) != 0) {
							var1 = field580;
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

					if ((field433[field580][var2][var3] & 0x4) != 0) {
						var1 = field580;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field433[field580][var2][var3] & 0x4) != 0) {
							var1 = field580;
						}
					}
				}
			}
		}

		if ((field433[field580][field548.field1395 >> 7][field548.field1396 >> 7] & 0x4) != 0) {
			var1 = field580;
		}

		return var1;
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method81() {
		int var1 = method171(field551, field549, field580);
		if (var1 - field550 < 800 && (field433[field580][field549 >> 7][field551 >> 7] & 0x4) != 0) {
			return field580;
		}

		return 3;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method82(int arg0) {
		if (!field488) {
			for (int var2 = 0; var2 < field186.length; var2++) {
				int var3 = field186[var2];
				if (GAGDRMEJ.field823[var3] >= arg0) {
					XRUIQOVM var4 = GAGDRMEJ.field817[var3];
					int var5 = var4.field1498 * var4.field1497 - 1;
					int var6 = field536 * var4.field1497 * 2;
					byte[] var7 = var4.field1495;
					byte[] var8 = field562;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1495 = var8;
					field562 = var7;
					GAGDRMEJ.method332(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method16() {
		field617 = true;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method83(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field554 = "";
				field555 = "Connecting to server...";
				method182(true);
			}

			field276 = new HGDLUQYC(method191(field486 + 43594), this);
			long var4 = CSEYUXAS.method216(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field242.field1139 = 0;
			field242.method453(14);
			field242.method453(var6);
			field276.method356(field242.field1138, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field276.method353();
			}

			int var8 = field276.method353();
			int var9 = var8;

			if (var8 == 0) {
				field276.method355(field457.field1138, 0, 8);
				field457.field1139 = 0;
				field419 = field457.method469();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field419 >> 32), (int) field419 };
				field242.field1139 = 0;
				field242.method453(10);
				field242.method457(var10[0]);
				field242.method457(var10[1]);
				field242.method457(var10[2]);
				field242.method457(var10[3]);
				field242.method457(signlink.uid);
				field242.method460(arg0);
				field242.method460(arg1);
				field242.method478(field522, field542);
				field301.field1139 = 0;

				if (arg2) {
					field301.method453(18);
				} else {
					field301.method453(16);
				}

				field301.method453(field242.field1139 + 36 + 1 + 1 + 2);
				field301.method453(255);
				field301.method454(343);
				field301.method453(field488 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field301.method457(field228[var11]);
				}

				field301.method461(0, field242.field1138, field242.field1139);
				field242.field1143 = new INEPYSAC(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field230 = new INEPYSAC(var10);
				field276.method356(field301.field1138, 0, field301.field1139);
				var8 = field276.method353();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method83(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field180 = field276.method353();
				field245 = field276.method353() == 1;
				field294 = 0L;
				field615 = 0;
				field420.field1152 = 0;
				field69 = true;
				field454 = true;
				field477 = true;
				field242.field1139 = 0;
				field457.field1139 = 0;
				field332 = -1;
				field395 = -1;
				field396 = -1;
				field397 = -1;
				field331 = 0;
				field333 = 0;
				field364 = 0;
				field335 = 0;
				field586 = 0;
				field232 = 0;
				field444 = false;
				field70 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field275[var13] = null;
				}

				field376 = 0;
				field259 = 0;
				field474 = 0;
				field218 = 0;
				field251 = (int) (Math.random() * 100.0D) - 50;
				field520 = (int) (Math.random() * 110.0D) - 55;
				field500 = (int) (Math.random() * 80.0D) - 40;
				field511 = (int) (Math.random() * 120.0D) - 60;
				field263 = (int) (Math.random() * 30.0D) - 20;
				field405 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field265 = 0;
				field183 = -1;
				field269 = 0;
				field270 = 0;
				field575 = 0;
				field545 = 0;

				for (int var14 = 0; var14 < field572; var14++) {
					field574[var14] = null;
					field579[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field544[var15] = null;
				}

				field548 = field574[field573] = new ISLZFAII();
				field508.method406();
				field460.method406();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field305[var16][var17][var18] = null;
						}
					}
				}

				field368 = new JSAXNSIH();
				field435 = 0;
				field434 = 0;
				method90(field510);
				field510 = -1;
				method90(field523);
				field523 = -1;
				method90(field239);
				field239 = -1;
				method90(field357);
				field357 = -1;
				method90(field403);
				field403 = -1;
				method90(field246);
				field246 = -1;
				method90(field231);
				field231 = -1;
				field304 = false;
				field428 = 3;
				field489 = 0;
				field444 = false;
				field365 = false;
				field326 = null;
				field591 = 0;
				field325 = -1;
				field213 = true;
				method89();

				for (int var19 = 0; var19 < 5; var19++) {
					field201[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field563[var20] = null;
					field564[var20] = false;
				}

				field389 = 0;
				field430 = 0;
				field292 = 0;
				field247 = 0;
				field402 = 0;
				field229 = 0;
				field205 = 0;
				field314 = 0;
				method201();
			} else if (var8 == 3) {
				field554 = "";
				field555 = "Invalid username or password.";
			} else if (var8 == 4) {
				field554 = "Your account has been disabled.";
				field555 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field554 = "Your account is already logged in.";
				field555 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field554 = "RuneScape has been updated!";
				field555 = "Please reload this page.";
			} else if (var8 == 7) {
				field554 = "This world is full.";
				field555 = "Please use a different world.";
			} else if (var8 == 8) {
				field554 = "Unable to connect.";
				field555 = "Login server offline.";
			} else if (var8 == 9) {
				field554 = "Login limit exceeded.";
				field555 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field554 = "Unable to connect.";
				field555 = "Bad session id.";
			} else if (var8 == 11) {
				field554 = "Login server rejected session.";
				field555 = "Please try again.";
			} else if (var8 == 12) {
				field554 = "You need a members account to login to this world.";
				field555 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field554 = "Could not complete login.";
				field555 = "Please try using a different world.";
			} else if (var8 == 14) {
				field554 = "The server is being updated.";
				field555 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field477 = true;
				field242.field1139 = 0;
				field457.field1139 = 0;
				field332 = -1;
				field395 = -1;
				field396 = -1;
				field397 = -1;
				field331 = 0;
				field333 = 0;
				field364 = 0;
				field232 = 0;
				field444 = false;
				field401 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field554 = "Login attempts exceeded.";
				field555 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field554 = "You are standing in a members-only area.";
				field555 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field554 = "Invalid loginserver requested";
				field555 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field276.method353();
				for (var21 += 3; var21 >= 0; var21--) {
					field554 = "You have only just left another world";
					field555 = "Your profile will be transferred in: " + var21;
					method182(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method83(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field554 = "Malformed login packet.";
				field555 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field554 = "Unexpected server response";
				field555 = "Please try using a different world.";
			} else if (var9 != 0) {
				field554 = "No response from server";
				field555 = "Please try using a different world.";
			} else if (field415 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field415++;
				method83(arg0, arg1, arg2);
			} else {
				field554 = "No response from loginserver";
				field555 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field554 = "";
			field555 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ILLZWRHABP;I)V")
	public final void method84(LZWRHABP arg0, int arg1) {
		if (arg1 == 94) {
			int var3 = arg0.method483();
			int var4 = (var3 >> 4 & 0x7) + field327;
			int var5 = (var3 & 0x7) + field328;
			int var6 = arg0.method463();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field425[var7];
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method151(-1, 0, var7, var8, -1, var9, field580, var5, var4);
			}
		} else if (arg1 == 86) {
			int var10 = arg0.method463();
			int var11 = (var10 >> 4 & 0x7) + field327;
			int var12 = (var10 & 0x7) + field328;
			int var13 = arg0.method465();
			int var14 = arg0.method463();
			int var15 = arg0.method465();
			if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
				var11 = var11 * 128 + 64;
				var12 = var12 * 128 + 64;
				MRRUTRWH var16 = new MRRUTRWH(var13, method171(var12, var11, field580) - var14, var15, var12, field580, field211, var11);
				field460.method399(var16);
			}
		} else if (arg1 == 89) {
			int var17 = arg0.method482();
			int var18 = var17 >> 2;
			int var19 = var17 & 0x3;
			int var20 = field425[var18];
			int var21 = arg0.method484();
			int var22 = (var21 >> 4 & 0x7) + field327;
			int var23 = (var21 & 0x7) + field328;
			int var24 = arg0.method493();
			if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
				method151(var24, 0, var18, var19, -1, var20, field580, var23, var22);
			}
		} else if (arg1 == 60) {
			int var25 = arg0.method463();
			int var26 = (var25 >> 4 & 0x7) + field327;
			int var27 = (var25 & 0x7) + field328;
			int var28 = arg0.method465();
			int var29 = arg0.method465();
			int var30 = arg0.method465();
			if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
				JSAXNSIH var31 = field305[field580][var26][var27];
				if (var31 != null) {
					for (FEZCJZIH var32 = (FEZCJZIH) var31.method402(); var32 != null; var32 = (FEZCJZIH) var31.method404()) {
						if ((var28 & 0x7FFF) == var32.field755 && var32.field754 == var29) {
							var32.field754 = var30;
							break;
						}
					}

					method192(var26, var27);
				}
			}
		} else {
			if (arg1 == 220) {
				byte var33 = arg0.method485();
				byte var34 = arg0.method486();
				byte var35 = arg0.method487();
				int var36 = arg0.method492();
				int var37 = arg0.method492();
				int var38 = arg0.method482();
				int var39 = (var38 >> 4 & 0x7) + field327;
				int var40 = (var38 & 0x7) + field328;
				int var41 = arg0.method493();
				int var42 = arg0.method484();
				int var43 = var42 >> 2;
				int var44 = var42 & 0x3;
				int var45 = field425[var43];
				int var46 = arg0.method465();
				byte var47 = arg0.method486();
				ISLZFAII var48;
				if (field303 == var46) {
					var48 = field548;
				} else {
					var48 = field574[var46];
				}

				if (var48 != null) {
					OEPVRTCC var49 = OEPVRTCC.method522(var41);
					int var50 = field293[field580][var39][var40];
					int var51 = field293[field580][var39 + 1][var40];
					int var52 = field293[field580][var39 + 1][var40 + 1];
					int var53 = field293[field580][var39][var40 + 1];
					LSSDQDBV var54 = var49.method513(var43, var44, var50, var51, var52, var53, -1);
					if (var54 != null) {
						method151(-1, var36 + 1, 0, 0, var37 + 1, var45, field580, var40, var39);
						var48.field1028 = field211 + var36;
						var48.field1029 = field211 + var37;
						var48.field1022 = var54;
						int var55 = var49.field1246;
						int var56 = var49.field1230;
						if (var44 == 1 || var44 == 3) {
							var55 = var49.field1230;
							var56 = var49.field1246;
						}

						var48.field1019 = var39 * 128 + var55 * 64;
						var48.field1021 = var40 * 128 + var56 * 64;
						var48.field1020 = method171(var48.field1021, var48.field1019, field580);

						if (var33 > var34) {
							byte var57 = var33;
							var33 = var34;
							var34 = var57;
						}

						if (var35 > var47) {
							byte var58 = var35;
							var35 = var47;
							var47 = var58;
						}

						var48.field1031 = var33 + var39;
						var48.field1033 = var34 + var39;
						var48.field1032 = var35 + var40;
						var48.field1034 = var40 + var47;
					}
				}
			}

			if (arg1 == 194) {
				int var59 = arg0.method463();
				int var60 = (var59 >> 4 & 0x7) + field327;
				int var61 = (var59 & 0x7) + field328;
				int var62 = arg0.method493();
				int var63 = arg0.method483();
				int var64 = var63 >> 2;
				int var65 = var63 & 0x3;
				int var66 = field425[var64];
				if (var60 >= 0 && var61 >= 0 && var60 < 103 && var61 < 103) {
					int var67 = field293[field580][var60][var61];
					int var68 = field293[field580][var60 + 1][var61];
					int var69 = field293[field580][var60 + 1][var61 + 1];
					int var70 = field293[field580][var60][var61 + 1];
					if (var66 == 0) {
						BEUBTAKI var71 = field320.method49(var61, field580, var60);
						if (var71 != null) {
							int var72 = var71.field97 >> 14 & 0x7FFF;
							if (var64 == 2) {
								var71.field95 = new FIZEXPNW(var62, var67, false, var72, 2, var70, var68, var69, var65 + 4);
								var71.field96 = new FIZEXPNW(var62, var67, false, var72, 2, var70, var68, var69, var65 + 1 & 0x3);
							} else {
								var71.field95 = new FIZEXPNW(var62, var67, false, var72, var64, var70, var68, var69, var65);
							}
						}
					}

					if (var66 == 1) {
						WQFNGRJI var73 = field320.method50(var61, var60, field580);
						if (var73 != null) {
							var73.field1491 = new FIZEXPNW(var62, var67, false, var73.field1492 >> 14 & 0x7FFF, 4, var70, var68, var69, 0);
						}
					}

					if (var66 == 2) {
						GFQOSMEB var74 = field320.method51(field580, var60, var61);

						if (var64 == 11) {
							var64 = 10;
						}

						if (var74 != null) {
							var74.field831 = new FIZEXPNW(var62, var67, false, var74.field839 >> 14 & 0x7FFF, var64, var70, var68, var69, var65);
						}
					}

					if (var66 == 3) {
						BSFWDEHY var75 = field320.method52(var61, var60, field580);
						if (var75 != null) {
							var75.field176 = new FIZEXPNW(var62, var67, false, var75.field177 >> 14 & 0x7FFF, 22, var70, var68, var69, var65);
						}
					}
				}
			} else if (arg1 == 180) {
				int var76 = arg0.method491();
				int var77 = arg0.method491();
				int var78 = arg0.method483();
				int var79 = (var78 >> 4 & 0x7) + field327;
				int var80 = (var78 & 0x7) + field328;
				if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
					FEZCJZIH var81 = new FEZCJZIH();
					var81.field755 = var77;
					var81.field754 = var76;

					if (field305[field580][var79][var80] == null) {
						field305[field580][var79][var80] = new JSAXNSIH();
					}

					field305[field580][var79][var80].method399(var81);
					method192(var79, var80);
				}
			} else if (arg1 == 106) {
				int var82 = arg0.method465();
				int var83 = arg0.method463();
				int var84 = (var83 >> 4 & 0x7) + field327;
				int var85 = (var83 & 0x7) + field328;
				if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
					JSAXNSIH var86 = field305[field580][var84][var85];
					if (var86 != null) {
						for (FEZCJZIH var87 = (FEZCJZIH) var86.method402(); var87 != null; var87 = (FEZCJZIH) var86.method404()) {
							if ((var82 & 0x7FFF) == var87.field755) {
								var87.method579();
								break;
							}
						}

						if (var86.method402() == null) {
							field305[field580][var84][var85] = null;
						}

						method192(var84, var85);
					}
				}
			} else if (arg1 == 122) {
				int var88 = arg0.method463();
				int var89 = (var88 >> 4 & 0x7) + field327;
				int var90 = (var88 & 0x7) + field328;
				int var91 = var89 + arg0.method464();
				int var92 = var90 + arg0.method464();
				int var93 = arg0.method466();
				int var94 = arg0.method465();
				int var95 = arg0.method463() * 4;
				int var96 = arg0.method463() * 4;
				int var97 = arg0.method465();
				int var98 = arg0.method465();
				int var99 = arg0.method463();
				int var100 = arg0.method463();
				if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104 && var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104 && var94 != 0xFFFF) {
					var89 = var89 * 128 + 64;
					var90 = var90 * 128 + 64;
					var91 = var91 * 128 + 64;
					var92 = var92 * 128 + 64;
					QNSFNRFM var101 = new QNSFNRFM(field580, var90, method171(var90, var89, field580) - var95, field211 + var98, var93, var100, var94, var89, var99, var96, field211 + var97);
					var101.method538(field211 + var97, method171(var92, var91, field580) - var96, var92, var91);
					field508.method399(var101);
				}
			} else if (arg1 == 223) {
				int var102 = arg0.method463();
				int var103 = (var102 >> 4 & 0x7) + field327;
				int var104 = (var102 & 0x7) + field328;
				int var105 = arg0.method465();
				int var106 = arg0.method463();
				int var107 = var106 >> 4 & 0xF;
				int var108 = var106 & 0x7;
				if (field548.field1398[0] >= var103 - var107 && field548.field1398[0] <= var103 + var107 && field548.field1399[0] >= var104 - var107 && field548.field1399[0] <= var104 + var107 && field256 && !field488 && field218 < 50) {
					field181[field218] = var105;
					field619[field218] = var108;
					field423[field218] = MNBSCLLD.field1158[var105];
					field218++;
				}
			} else if (arg1 == 187) {
				int var109 = arg0.method491();
				int var110 = arg0.method493();
				int var111 = arg0.method484();
				int var112 = (var111 >> 4 & 0x7) + field327;
				int var113 = (var111 & 0x7) + field328;
				int var114 = arg0.method465();
				if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && field303 != var110) {
					FEZCJZIH var115 = new FEZCJZIH();
					var115.field755 = var114;
					var115.field754 = var109;

					if (field305[field580][var112][var113] == null) {
						field305[field580][var112][var113] = new JSAXNSIH();
					}

					field305[field580][var112][var113].method399(var115);
					method192(var112, var113);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZLGMYKUSOM;II)V")
	public final void method85(int arg0, GMYKUSOM arg1, int arg2, int arg3) {
		if (arg1.field903 == 0 && arg1.field890 != null && (!arg1.field894 || field194 == arg1.field843 || field537 == arg1.field843 || field538 == arg1.field843)) {
			int var5 = CYEOWDOP.field643;
			int var6 = CYEOWDOP.field641;
			int var7 = CYEOWDOP.field644;
			int var8 = CYEOWDOP.field642;
			CYEOWDOP.method226(arg1.field891 + arg2, arg3, arg1.field860 + arg3, arg2);
			int var9 = arg1.field890.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field874[var10] + arg2;
				int var12 = arg1.field865[var10] + arg3 - arg0;
				GMYKUSOM var13 = GMYKUSOM.method350(arg1.field890[var10]);
				var11 += var13.field845;
				var12 += var13.field866;

				if (var13.field899 > 0) {
					method128(var13);
				}

				if (var13.field903 == 0) {
					if (var13.field905 > var13.field882 - var13.field860) {
						var13.field905 = var13.field882 - var13.field860;
					}

					if (var13.field905 < 0) {
						var13.field905 = 0;
					}

					method85(var13.field905, var13, var11, var12);

					if (var13.field882 > var13.field860) {
						method155(var13.field905, var13.field860, var13.field882, var13.field891 + var11, var12);
					}
				} else if (var13.field903 != 1) {
					if (var13.field903 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field860; var15++) {
							for (int var16 = 0; var16 < var13.field891; var16++) {
								int var17 = (var13.field910 + 32) * var16 + var11;
								int var18 = (var13.field883 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field844[var14];
									var18 += var13.field881[var14];
								}

								if (var13.field912[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field912[var14] - 1;
									if (var17 > CYEOWDOP.field643 - 32 && var17 < CYEOWDOP.field644 && var18 > CYEOWDOP.field641 - 32 && var18 < CYEOWDOP.field642 || field208 != 0 && field207 == var14) {
										int var22 = 0;
										if (field376 == 1 && field377 == var14 && field378 == var13.field843) {
											var22 = 0xFFFFFF;
										}

										INRTBCYJ var23 = HHBFOKVP.method368(var22, var21, var13.field864[var14]);
										if (var23 != null) {
											if (field208 != 0 && field207 == var14 && field206 == var13.field843) {
												var19 = field72 - field209;
												var20 = field73 - field210;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field421 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method389(128, var17 + var19, var18 + var20);

												if (var18 + var20 < CYEOWDOP.field641 && arg1.field905 > 0) {
													int var24 = (CYEOWDOP.field641 - var18 - var20) * field536 / 3;
													if (var24 > field536 * 10) {
														var24 = field536 * 10;
													}

													if (var24 > arg1.field905) {
														var24 = arg1.field905;
													}

													arg1.field905 -= var24;
													field210 += var24;
												}

												if (var18 + var20 + 32 > CYEOWDOP.field642 && arg1.field905 < arg1.field882 - arg1.field860) {
													int var25 = (var18 + var20 + 32 - CYEOWDOP.field642) * field536 / 3;
													if (var25 > field536 * 10) {
														var25 = field536 * 10;
													}

													if (var25 > arg1.field882 - arg1.field860 - arg1.field905) {
														var25 = arg1.field882 - arg1.field860 - arg1.field905;
													}

													arg1.field905 += var25;
													field210 -= var25;
												}
											} else if (field605 != 0 && field604 == var14 && field603 == var13.field843) {
												var23.method389(128, var17, var18);
											} else {
												var23.method387(var17, var18);
											}

											if (var23.field1016 == 33 || var13.field864[var14] != 1) {
												int var26 = var13.field864[var14];
												field411.method314(var18 + var20 + 10, method124(var26), var17 + var19 + 1, 0);
												field411.method314(var18 + var20 + 9, method124(var26), var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field842 != null && var14 < 20) {
									INRTBCYJ var27 = var13.field842[var14];
									if (var27 != null) {
										var27.method387(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field903 == 3) {
						boolean var28 = false;
						if (field538 == var13.field843 || field537 == var13.field843 || field194 == var13.field843) {
							var28 = true;
						}

						int var29;
						if (method169(var13)) {
							var29 = var13.field873;
							if (var28 && var13.field856 != 0) {
								var29 = var13.field856;
							}
						} else {
							var29 = var13.field853;
							if (var28 && var13.field886 != 0) {
								var29 = var13.field886;
							}
						}

						if (var13.field848 == 0) {
							if (var13.field901) {
								CYEOWDOP.method229(var29, var13.field891, var11, var12, var13.field860);
							} else {
								CYEOWDOP.method230(var11, var13.field891, var29, var13.field860, var12);
							}
						} else if (var13.field901) {
							CYEOWDOP.method228(var13.field860, var13.field891, 256 - (var13.field848 & 0xFF), var29, var11, var12);
						} else {
							CYEOWDOP.method231(256 - (var13.field848 & 0xFF), var12, var11, var13.field891, var29, var13.field860);
						}
					} else if (var13.field903 == 4) {
						FUOSCRKP var30 = var13.field893;
						String var31 = var13.field897;
						boolean var32 = false;
						if (field538 == var13.field843 || field537 == var13.field843 || field194 == var13.field843) {
							var32 = true;
						}

						int var33;
						if (method169(var13)) {
							var33 = var13.field873;
							if (var32 && var13.field856 != 0) {
								var33 = var13.field856;
							}

							if (var13.field889.length() > 0) {
								var31 = var13.field889;
							}
						} else {
							var33 = var13.field853;
							if (var32 && var13.field886 != 0) {
								var33 = var13.field886;
							}
						}

						if (var13.field880 == 6 && field304) {
							var31 = "Please wait...";
							var33 = var13.field853;
						}

						if (CYEOWDOP.field639 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field776 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method115(method111(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method115(method111(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method115(method111(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method115(method111(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method115(method111(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field887) {
								var30.method311(var13.field861, var34, var13.field891 / 2 + var11, var41, var33);
							} else {
								var30.method318(var34, var33, var13.field861, var11, var41);
							}

							var34 += var30.field776;
						}
					} else if (var13.field903 == 5) {
						INRTBCYJ var42;
						if (method169(var13)) {
							var42 = var13.field863;
						} else {
							var42 = var13.field849;
						}

						if (var42 != null) {
							var42.method387(var11, var12);
						}
					} else if (var13.field903 == 6) {
						int var43 = GAGDRMEJ.field809;
						int var44 = GAGDRMEJ.field810;
						GAGDRMEJ.field809 = var13.field891 / 2 + var11;
						GAGDRMEJ.field810 = var13.field860 / 2 + var12;
						int var45 = GAGDRMEJ.field813[var13.field870] * var13.field869 >> 16;
						int var46 = GAGDRMEJ.field814[var13.field870] * var13.field869 >> 16;
						boolean var47 = method169(var13);
						int var48;
						if (var47) {
							var48 = var13.field907;
						} else {
							var48 = var13.field906;
						}

						LSSDQDBV var49;
						if (var48 == -1) {
							var49 = var13.method351(var47, -1, -1);
						} else {
							WOTIAWQC var50 = WOTIAWQC.field1470[var48];
							var49 = var13.method351(var47, var50.field1473[var13.field875], var50.field1472[var13.field875]);
						}

						if (var49 != null) {
							var49.method443(0, var13.field871, 0, var13.field870, 0, var45, var46);
						}

						GAGDRMEJ.field809 = var43;
						GAGDRMEJ.field810 = var44;
					} else {
						if (var13.field903 == 7) {
							FUOSCRKP var51 = var13.field893;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field860; var53++) {
								for (int var54 = 0; var54 < var13.field891; var54++) {
									if (var13.field912[var52] > 0) {
										HHBFOKVP var55 = HHBFOKVP.method367(var13.field912[var52] - 1);
										String var56 = var55.field956;
										if (var55.field943 || var13.field864[var52] != 1) {
											var56 = var56 + " x" + method118(var13.field864[var52]);
										}

										int var57 = (var13.field910 + 115) * var54 + var11;
										int var58 = (var13.field883 + 12) * var53 + var12;
										if (var13.field887) {
											var51.method311(var13.field861, var58, var13.field891 / 2 + var57, var56, var13.field853);
										} else {
											var51.method318(var58, var13.field853, var13.field861, var57, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field903 == 8 && (field366 == var13.field843 || field427 == var13.field843 || field398 == var13.field843) && field606 == 100) {
							int var59 = 0;
							int var60 = 0;
							FUOSCRKP var61 = field412;
							String var62 = var13.field897;
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

								int var65 = var61.method312(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field776 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field891 + var11 - var59 - 5;
							int var67 = var13.field860 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field891 + arg2) {
								var66 = arg1.field891 + arg2 - var59;
							}

							CYEOWDOP.method229(0xFFFFA0, var59, var66, var67, var60);
							CYEOWDOP.method230(var66, var59, 0, var60, var67);
							String var68 = var13.field897;
							int var69 = var61.field776 + var67 + 2;
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

								var61.method318(var69, 0, false, var66 + 3, var71);
								var69 += var61.field776 + 1;
							}
						}
					}
				}
			}

			CYEOWDOP.method226(var7, var6, var8, var5);
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method86() {
		try {
			if (field276 != null) {
				field276.method352();
			}
		} catch (Exception var2) {
		}

		field276 = null;
		field477 = false;
		field417 = 0;
		field316 = "";
		field317 = "";
		method148();
		field320.method27();

		for (int var1 = 0; var1 < 4; var1++) {
			field308[var1].method407();
		}

		System.gc();
		method88();
		field182 = -1;
		field329 = -1;
		field453 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BLjava/lang/String;)V")
	public final void method87(String arg0, String arg1) {
		if (field448 != null) {
			field448.method509();
			GAGDRMEJ.field815 = field225;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field412.method310(257, var3, 0, arg1);
			field412.method310(256, var3 - 1, 0xFFFFFF, arg1);
			var3 += 15;
			if (arg0 != null) {
				field412.method310(257, var3, 0, arg0);
				field412.method310(256, var3 - 1, 0xFFFFFF, arg0);
			}

			field448.method510(4, 4, field64);
		} else if (field65 != null) {
			field65.method509();
			GAGDRMEJ.field815 = field226;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			CYEOWDOP.method229(0, var5, 383 - var5 / 2, var4 - 5 - var6 / 2, var6);
			CYEOWDOP.method230(383 - var5 / 2, var5, 0xFFFFFF, var6, var4 - var6 / 2 - 5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field412.method310(383, var4, 0, arg1);
			field412.method310(382, var4 - 1, 0xFFFFFF, arg1);
			var4 += 15;
			if (arg0 != null) {
				field412.method310(383, var4, 0, arg0);
				field412.method310(382, var4 - 1, 0xFFFFFF, arg0);
			}

			field65.method510(0, 0, field64);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method88() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.g(I)V")
	public final void method89() {
		field409 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field202[var1] = -1;
			for (int var2 = 0; var2 < BGEILVDT.field99; var2++) {
				if (!BGEILVDT.field100[var2].field106 && BGEILVDT.field100[var2].field101 == var1 + (field213 ? 0 : 7)) {
					field202[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method90(int arg0) {
		GMYKUSOM.method345(arg0);
	}

	@ObfuscatedName("client.a(IILLZWRHABP;)V")
	public final void method91(int arg0, LZWRHABP arg1) {
		arg1.method473();
		int var3 = arg1.method474(1);
		if (var3 != 0) {
			int var4 = arg1.method474(2);
			if (var4 == 0) {
				field578[field577++] = field573;
			} else if (var4 == 1) {
				int var5 = arg1.method474(3);
				field548.method576(false, var5);
				int var6 = arg1.method474(1);
				if (var6 == 1) {
					field578[field577++] = field573;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method474(3);
				field548.method576(true, var7);
				int var8 = arg1.method474(3);
				field548.method576(true, var8);
				int var9 = arg1.method474(1);
				if (var9 == 1) {
					field578[field577++] = field573;
				}
			} else if (var4 == 3) {
				field580 = arg1.method474(2);
				int var10 = arg1.method474(7);
				int var11 = arg1.method474(7);
				int var12 = arg1.method474(1);
				if (var12 == 1) {
					field578[field577++] = field573;
				}

				int var13 = arg1.method474(1);
				field548.method575(var11, var13 == 1, var10);
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method92() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field221[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field221[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field222[var10] = (field221[var10 - 1] + field221[var10 + 1] + field221[var10 - 128] + field221[var10 + 128]) / 4;
			}
		}

		field566 += 128;
		if (field566 > field338.length) {
			field566 -= field338.length;
			int var11 = (int) (Math.random() * 12.0D);
			method143(field362[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field222[var14 + 128] - field338[field566 + var14 & field338.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field221[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field540[var16] = field540[var16 + 1];
		}

		field540[var1 - 1] = (int) (Math.sin(field211 / 14.0D) * 16.0D + Math.sin(field211 / 15.0D) * 14.0D + Math.sin(field211 / 16.0D) * 12.0D);

		if (field588 > 0) {
			field588 -= 4;
		}

		if (field589 > 0) {
			field589 -= 4;
		}

		if (field588 == 0 && field589 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field588 = 1024;
			}

			if (var17 == 1) {
				field589 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZIIIIII)Z")
	public final boolean method93(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field598[var14][var15] = 0;
				field618[var14][var15] = 99999999;
			}
		}

		int var16 = arg4;
		int var17 = arg2;
		field598[arg4][arg2] = 99;
		field618[arg4][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field524[var18] = arg4;
		int var35 = var18 + 1;
		field525[var18] = arg2;
		boolean var20 = false;
		int var21 = field524.length;
		int[][] var22 = field308[field580].field1057;
		while (var35 != var19) {
			var16 = field524[var19];
			var17 = field525[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg6 == var17) {
				var20 = true;
				break;
			}

			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && field308[field580].method416(arg1 - 1, arg3, arg0, var16, arg6, var17)) {
					var20 = true;
					break;
				}

				if (arg1 < 10 && field308[field580].method417(var17, arg1 - 1, arg0, arg3, arg6, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg9 != 0 && arg7 != 0 && field308[field580].method418(arg9, arg7, arg0, var16, arg8, arg6, var17)) {
				var20 = true;
				break;
			}

			int var23 = field618[var16][var17] + 1;
			if (var16 > 0 && field598[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field524[var35] = var16 - 1;
				field525[var35] = var17;
				var35 = (var35 + 1) % var21;
				field598[var16 - 1][var17] = 2;
				field618[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field598[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field524[var35] = var16 + 1;
				field525[var35] = var17;
				var35 = (var35 + 1) % var21;
				field598[var16 + 1][var17] = 8;
				field618[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field598[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field524[var35] = var16;
				field525[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field598[var16][var17 - 1] = 1;
				field618[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field598[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field524[var35] = var16;
				field525[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field598[var16][var17 + 1] = 4;
				field618[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field598[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field524[var35] = var16 - 1;
				field525[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field598[var16 - 1][var17 - 1] = 3;
				field618[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field598[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field524[var35] = var16 + 1;
				field525[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field598[var16 + 1][var17 - 1] = 9;
				field618[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field598[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field524[var35] = var16 - 1;
				field525[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field598[var16 - 1][var17 + 1] = 6;
				field618[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field598[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field524[var35] = var16 + 1;
				field525[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field598[var16 + 1][var17 + 1] = 12;
				field618[var16 + 1][var17 + 1] = var23;
			}
		}

		field390 = 0;
		if (!var20) {
			if (arg5) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg0 - var25; var26 <= arg0 + var25; var26++) {
						for (int var27 = arg6 - var25; var27 <= arg6 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field618[var26][var27] < var24) {
								var24 = field618[var26][var27];
								var16 = var26;
								var17 = var27;
								field390 = 1;
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
		field524[var28] = var16;
		int var36 = var28 + 1;
		field525[var28] = var17;
		int var29;
		int var30 = var29 = field598[var16][var17];
		while (arg4 != var16 || arg2 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field524[var36] = var16;
				field525[var36++] = var17;
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

			var30 = field598[var16][var17];
		}

		if (var36 <= 0) {
			if (arg10 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field524[var36];
		int var33 = field525[var36];
		field247 += var31;
		if (field247 >= 124) {
			field242.method452(98);
			field242.method453(74);
			field247 = 0;
		}

		if (arg10 == 0) {
			field242.method452(41);
			field242.method453(var31 + var31 + 3);
		}

		if (arg10 == 1) {
			field242.method452(212);
			field242.method453(var31 + var31 + 3 + 14);
		}

		if (arg10 == 2) {
			field242.method452(31);
			field242.method453(var31 + var31 + 3);
		}

		field269 = field524[0];
		field270 = field525[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field242.method479(field524[var36] - var32);
			field242.method480(field525[var36] - var33);
		}

		field242.method488(field567 + var32);
		field242.method481(field82[5] == 1 ? 1 : 0);
		field242.method489(field568 + var33);
		return true;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method94() {
		int var1 = 5;
		field228[8] = 0;
		int var2 = 0;
		while (field228[8] == 0) {
			String var3 = "Unknown problem";
			method19(20, "Connecting to web server");

			try {
				DataInputStream var4 = method188("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 343);
				LZWRHABP var5 = new LZWRHABP(new byte[40]);
				var4.readFully(var5.field1138, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field228[var6] = var5.method468();
				}

				int var7 = var5.method468();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field228[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field228[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field228[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field228[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field228[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field228[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method19(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method19(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field463 = !field463;
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method95() {
		field447.method509();

		if (field265 == 2) {
			byte[] var1 = field196.field1495;
			int[] var2 = CYEOWDOP.field638;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field337.method391(25, 25, 33, 0, 256, field461, 0, field238, 33, field405);
			field448.method509();
			GAGDRMEJ.field815 = field225;
		} else {
			int var5 = field511 + field405 & 0x7FF;
			int var6 = field548.field1395 / 32 + 48;
			int var7 = 464 - field548.field1396 / 32;
			field271.method391(var6, var7, 151, 5, field263 + 256, field613, 25, field184, 146, var5);
			field337.method391(25, 25, 33, 0, 256, field461, 0, field238, 33, field405);

			for (int var8 = 0; var8 < field437; var8++) {
				int var9 = field438[var8] * 4 + 2 - field548.field1395 / 32;
				int var10 = field439[var8] * 4 + 2 - field548.field1396 / 32;
				method140(field272[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					JSAXNSIH var13 = field305[field580][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field548.field1395 / 32;
						int var15 = var12 * 4 + 2 - field548.field1396 / 32;
						method140(field369, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field545; var16++) {
				XQNGYHCW var17 = field544[field546[var16]];
				if (var17 != null && var17.method397()) {
					DUHKBPRV var18 = var17.field1494;
					if (var18.field671 != null) {
						var18 = var18.method237();
					}

					if (var18 != null && var18.field667 && var18.field656) {
						int var19 = var17.field1395 / 32 - field548.field1395 / 32;
						int var20 = var17.field1396 / 32 - field548.field1396 / 32;
						method140(field370, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field575; var21++) {
				ISLZFAII var22 = field574[field576[var21]];
				if (var22 != null && var22.method397()) {
					int var23 = var22.field1395 / 32 - field548.field1395 / 32;
					int var24 = var22.field1396 / 32 - field548.field1396 / 32;
					boolean var25 = false;
					long var26 = CSEYUXAS.method216(var22.field1039);
					for (int var28 = 0; var28 < field434; var28++) {
						if (field443[var28] == var26 && field505[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field548.field1036 != 0 && var22.field1036 != 0 && field548.field1036 == var22.field1036) {
						var29 = true;
					}

					if (var25) {
						method140(field372, var24, var23);
					} else if (var29) {
						method140(field373, var24, var23);
					} else {
						method140(field371, var24, var23);
					}
				}
			}

			if (field586 != 0 && field211 % 20 < 10) {
				if (field586 == 1 && field297 >= 0 && field297 < field544.length) {
					XQNGYHCW var30 = field544[field297];
					if (var30 != null) {
						int var31 = var30.field1395 / 32 - field548.field1395 / 32;
						int var32 = var30.field1396 / 32 - field548.field1396 / 32;
						method159(field319, var31, var32);
					}
				}

				if (field586 == 2) {
					int var33 = (field515 - field567) * 4 + 2 - field548.field1395 / 32;
					int var34 = (field516 - field568) * 4 + 2 - field548.field1396 / 32;
					method159(field319, var33, var34);
				}

				if (field586 == 10 && field584 >= 0 && field584 < field574.length) {
					ISLZFAII var35 = field574[field584];
					if (var35 != null) {
						int var36 = var35.field1395 / 32 - field548.field1395 / 32;
						int var37 = var35.field1396 / 32 - field548.field1396 / 32;
						method159(field319, var36, var37);
					}
				}
			}

			if (field269 != 0) {
				int var38 = field269 * 4 + 2 - field548.field1395 / 32;
				int var39 = field270 * 4 + 2 - field548.field1396 / 32;
				method140(field318, var39, var38);
			}

			CYEOWDOP.method229(0xFFFFFF, 3, 97, 78, 3);
			field448.method509();
			GAGDRMEJ.field815 = field225;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method96() {
		field571++;
		if (field571 > 1785) {
			field571 = 0;
			field242.method452(199);
			field242.method453(0);
			int var1 = field242.field1139;
			field242.method454(41896);

			if ((int) (Math.random() * 2.0D) == 0) {
				field242.method454(60025);
			}

			field242.method453(166);
			field242.method453((int) (Math.random() * 256.0D));
			field242.method453(228);
			field242.method454((int) (Math.random() * 65536.0D));
			field242.method453(130);

			if ((int) (Math.random() * 2.0D) == 0) {
				field242.method453(197);
			}

			field242.method454(63017);
			field242.method454(23674);
			field242.method462(field242.field1139 - var1);
		}

		for (int var2 = 0; var2 < field545; var2++) {
			int var3 = field546[var2];
			XQNGYHCW var4 = field544[var3];
			if (var4 != null) {
				method97(var4, var4.field1494.field652);
			}
		}
	}

	@ObfuscatedName("client.a(LUOUXSBLI;BI)V")
	public final void method97(UOUXSBLI arg0, int arg1) {
		if (arg0.field1395 < 128 || arg0.field1396 < 128 || arg0.field1395 >= 13184 || arg0.field1396 >= 13184) {
			arg0.field1388 = -1;
			arg0.field1415 = -1;
			arg0.field1428 = 0;
			arg0.field1429 = 0;
			arg0.field1395 = arg0.field1398[0] * 128 + arg0.field1423 * 64;
			arg0.field1396 = arg0.field1399[0] * 128 + arg0.field1423 * 64;
			arg0.method578();
		}

		if (field548 == arg0 && (arg0.field1395 < 1536 || arg0.field1396 < 1536 || arg0.field1395 >= 11776 || arg0.field1396 >= 11776)) {
			arg0.field1388 = -1;
			arg0.field1415 = -1;
			arg0.field1428 = 0;
			arg0.field1429 = 0;
			arg0.field1395 = arg0.field1398[0] * 128 + arg0.field1423 * 64;
			arg0.field1396 = arg0.field1399[0] * 128 + arg0.field1423 * 64;
			arg0.method578();
		}

		if (arg0.field1428 > field211) {
			method98(arg0);
		} else if (arg0.field1429 >= field211) {
			method99(arg0);
		} else {
			method100(arg0);
		}

		method101(arg0);
		method102(arg0);
	}

	@ObfuscatedName("client.a(LUOUXSBLI;I)V")
	public final void method98(UOUXSBLI arg0) {
		int var2 = arg0.field1428 - field211;
		int var3 = arg0.field1424 * 128 + arg0.field1423 * 64;
		int var4 = arg0.field1426 * 128 + arg0.field1423 * 64;
		arg0.field1395 += (var3 - arg0.field1395) / var2;
		arg0.field1396 += (var4 - arg0.field1396) / var2;
		arg0.field1420 = 0;

		if (arg0.field1430 == 0) {
			arg0.field1381 = 1024;
		}

		if (arg0.field1430 == 1) {
			arg0.field1381 = 1536;
		}

		if (arg0.field1430 == 2) {
			arg0.field1381 = 0;
		}

		if (arg0.field1430 == 3) {
			arg0.field1381 = 512;
		}
	}

	@ObfuscatedName("client.a(BLUOUXSBLI;)V")
	public final void method99(UOUXSBLI arg0) {
		if (field211 == arg0.field1429 || arg0.field1388 == -1 || arg0.field1391 != 0 || arg0.field1390 + 1 > WOTIAWQC.field1470[arg0.field1388].method581(arg0.field1389)) {
			int var2 = arg0.field1429 - arg0.field1428;
			int var3 = field211 - arg0.field1428;
			int var4 = arg0.field1424 * 128 + arg0.field1423 * 64;
			int var5 = arg0.field1426 * 128 + arg0.field1423 * 64;
			int var6 = arg0.field1425 * 128 + arg0.field1423 * 64;
			int var7 = arg0.field1427 * 128 + arg0.field1423 * 64;
			arg0.field1395 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1396 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1420 = 0;

		if (arg0.field1430 == 0) {
			arg0.field1381 = 1024;
		}

		if (arg0.field1430 == 1) {
			arg0.field1381 = 1536;
		}

		if (arg0.field1430 == 2) {
			arg0.field1381 = 0;
		}

		if (arg0.field1430 == 3) {
			arg0.field1381 = 512;
		}

		arg0.field1397 = arg0.field1381;
	}

	@ObfuscatedName("client.a(ZLUOUXSBLI;)V")
	public final void method100(UOUXSBLI arg0) {
		arg0.field1411 = arg0.field1403;
		if (arg0.field1400 == 0) {
			arg0.field1420 = 0;
		} else {
			if (arg0.field1388 != -1 && arg0.field1391 == 0) {
				WOTIAWQC var2 = WOTIAWQC.field1470[arg0.field1388];
				if (arg0.field1376 > 0 && var2.field1482 == 0) {
					arg0.field1420++;
					return;
				}

				if (arg0.field1376 <= 0 && var2.field1483 == 0) {
					arg0.field1420++;
					return;
				}
			}

			int var3 = arg0.field1395;
			int var4 = arg0.field1396;
			int var5 = arg0.field1398[arg0.field1400 - 1] * 128 + arg0.field1423 * 64;
			int var6 = arg0.field1399[arg0.field1400 - 1] * 128 + arg0.field1423 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1381 = 1280;
					} else if (var4 > var6) {
						arg0.field1381 = 1792;
					} else {
						arg0.field1381 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1381 = 768;
					} else if (var4 > var6) {
						arg0.field1381 = 256;
					} else {
						arg0.field1381 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1381 = 1024;
				} else {
					arg0.field1381 = 0;
				}

				int var7 = arg0.field1381 - arg0.field1397 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1378;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1377;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1380;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1379;
				}

				if (var8 == -1) {
					var8 = arg0.field1377;
				}

				arg0.field1411 = var8;
				int var9 = 4;
				if (arg0.field1397 != arg0.field1381 && arg0.field1394 == -1 && arg0.field1422 != 0) {
					var9 = 2;
				}

				if (arg0.field1400 > 2) {
					var9 = 6;
				}

				if (arg0.field1400 > 3) {
					var9 = 8;
				}

				if (arg0.field1420 > 0 && arg0.field1400 > 1) {
					var9 = 8;
					arg0.field1420--;
				}

				if (arg0.field1402[arg0.field1400 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1411 == arg0.field1377 && arg0.field1401 != -1) {
					arg0.field1411 = arg0.field1401;
				}

				if (var3 < var5) {
					arg0.field1395 += var9;
					if (arg0.field1395 > var5) {
						arg0.field1395 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1395 -= var9;
					if (arg0.field1395 < var5) {
						arg0.field1395 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1396 += var9;
					if (arg0.field1396 > var6) {
						arg0.field1396 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1396 -= var9;
					if (arg0.field1396 < var6) {
						arg0.field1396 = var6;
					}
				}

				if (arg0.field1395 == var5 && arg0.field1396 == var6) {
					arg0.field1400--;

					if (arg0.field1376 > 0) {
						arg0.field1376--;
						return;
					}
				}
			} else {
				arg0.field1395 = var5;
				arg0.field1396 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LUOUXSBLI;B)V")
	public final void method101(UOUXSBLI arg0) {
		if (arg0.field1422 != 0) {
			if (arg0.field1394 != -1 && arg0.field1394 < 32768) {
				XQNGYHCW var2 = field544[arg0.field1394];
				if (var2 != null) {
					int var3 = arg0.field1395 - var2.field1395;
					int var4 = arg0.field1396 - var2.field1396;
					if (var3 != 0 || var4 != 0) {
						arg0.field1381 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1394 >= 32768) {
				int var5 = arg0.field1394 - 32768;
				if (field303 == var5) {
					var5 = field573;
				}

				ISLZFAII var6 = field574[var5];
				if (var6 != null) {
					int var7 = arg0.field1395 - var6.field1395;
					int var8 = arg0.field1396 - var6.field1396;
					if (var7 != 0 || var8 != 0) {
						arg0.field1381 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1408 != 0 || arg0.field1409 != 0) && (arg0.field1400 == 0 || arg0.field1420 > 0)) {
				int var9 = arg0.field1395 - (arg0.field1408 - field567 - field567) * 64;
				int var10 = arg0.field1396 - (arg0.field1409 - field568 - field568) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1381 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1408 = 0;
				arg0.field1409 = 0;
			}

			int var11 = arg0.field1381 - arg0.field1397 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1422 || var11 > 2048 - arg0.field1422) {
					arg0.field1397 = arg0.field1381;
				} else if (var11 > 1024) {
					arg0.field1397 -= arg0.field1422;
				} else {
					arg0.field1397 += arg0.field1422;
				}

				arg0.field1397 &= 0x7FF;
				if (arg0.field1411 == arg0.field1403 && arg0.field1397 != arg0.field1381) {
					if (arg0.field1404 != -1) {
						arg0.field1411 = arg0.field1404;
						return;
					}

					arg0.field1411 = arg0.field1377;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILUOUXSBLI;)V")
	public final void method102(UOUXSBLI arg0) {
		arg0.field1414 = false;

		if (arg0.field1411 != -1) {
			WOTIAWQC var2 = WOTIAWQC.field1470[arg0.field1411];
			arg0.field1413++;
			if (arg0.field1412 < var2.field1471 && arg0.field1413 > var2.method581(arg0.field1412)) {
				arg0.field1413 = 0;
				arg0.field1412++;
			}

			if (arg0.field1412 >= var2.field1471) {
				arg0.field1413 = 0;
				arg0.field1412 = 0;
			}
		}

		if (arg0.field1415 != -1 && field211 >= arg0.field1418) {
			if (arg0.field1416 < 0) {
				arg0.field1416 = 0;
			}

			WOTIAWQC var3 = IMWZJOXU.field992[arg0.field1415].field996;
			arg0.field1417++;
			while (arg0.field1416 < var3.field1471 && arg0.field1417 > var3.method581(arg0.field1416)) {
				arg0.field1417 -= var3.method581(arg0.field1416);
				arg0.field1416++;
			}

			if (arg0.field1416 >= var3.field1471 && (arg0.field1416 < 0 || arg0.field1416 >= var3.field1471)) {
				arg0.field1415 = -1;
			}
		}

		if (arg0.field1388 != -1 && arg0.field1391 <= 1) {
			WOTIAWQC var4 = WOTIAWQC.field1470[arg0.field1388];
			if (var4.field1482 == 1 && arg0.field1376 > 0 && arg0.field1428 <= field211 && arg0.field1429 < field211) {
				arg0.field1391 = 1;
				return;
			}
		}

		if (arg0.field1388 != -1 && arg0.field1391 == 0) {
			WOTIAWQC var5 = WOTIAWQC.field1470[arg0.field1388];
			arg0.field1390++;
			while (arg0.field1389 < var5.field1471 && arg0.field1390 > var5.method581(arg0.field1389)) {
				arg0.field1390 -= var5.method581(arg0.field1389);
				arg0.field1389++;
			}

			if (arg0.field1389 >= var5.field1471) {
				arg0.field1389 -= var5.field1475;
				arg0.field1392++;
				if (arg0.field1392 >= var5.field1481) {
					arg0.field1388 = -1;
				}

				if (arg0.field1389 < 0 || arg0.field1389 >= var5.field1471) {
					arg0.field1388 = -1;
				}
			}

			arg0.field1414 = var5.field1477;
		}

		if (arg0.field1391 > 0) {
			arg0.field1391--;
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method103() {
		if (field357 == -1 || field474 != 2 && field65 == null) {
			if (field617) {
				method201();
				field617 = false;
				field345.method510(0, 4, field64);
				field346.method510(0, 357, field64);
				field347.method510(722, 4, field64);
				field348.method510(743, 205, field64);
				field349.method510(0, 0, field64);
				field350.method510(516, 4, field64);
				field351.method510(516, 205, field64);
				field352.method510(496, 357, field64);
				field353.method510(0, 338, field64);
				field479 = true;
				field248 = true;
				field355 = true;
				field257 = true;

				if (field474 != 2) {
					field448.method510(4, 4, field64);
					field447.method510(550, 4, field64);
				}
			}

			if (field474 == 2) {
				method199();
			}

			if (field444 && field480 == 1) {
				field479 = true;
			}

			if (field246 != -1) {
				boolean var3 = method167(field536, field246);
				if (var3) {
					field479 = true;
				}
			}

			if (field605 == 2) {
				field479 = true;
			}

			if (field208 == 2) {
				field479 = true;
			}

			if (field479) {
				method180();
				field479 = false;
			}

			if (field523 == -1) {
				field311.field905 = field227 - field507 - 77;

				if (field72 > 448 && field72 < 560 && field73 > 332) {
					method135(77, 0, 463, field311, field73 - 357, -1, field72 - 17, field227);
				}

				int var4 = field227 - field311.field905 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field227 - 77) {
					var4 = field227 - 77;
				}

				if (field507 != var4) {
					field507 = var4;
					field248 = true;
				}

				field556++;
				if (field556 > 1150) {
					field556 = 0;
					field242.method452(200);
					field242.method453(0);
					int var5 = field242.field1139;
					field242.method454((int) (Math.random() * 65536.0D));
					field242.method454(39076);
					field242.method453((int) (Math.random() * 256.0D));
					field242.method453(72);
					field242.method454((int) (Math.random() * 65536.0D));

					if ((int) (Math.random() * 2.0D) == 0) {
						field242.method454(24784);
					}

					field242.method453(33);
					field242.method453(161);

					if ((int) (Math.random() * 2.0D) == 0) {
						field242.method454(30608);
					}

					field242.method453(218);
					field242.method462(field242.field1139 - var5);
				}
			}

			if (field523 != -1) {
				boolean var6 = method167(field536, field523);
				if (var6) {
					field248 = true;
				}
			}

			if (field605 == 3) {
				field248 = true;
			}

			if (field208 == 3) {
				field248 = true;
			}

			if (field326 != null) {
				field248 = true;
			}

			if (field444 && field480 == 2) {
				field248 = true;
			}

			if (field248) {
				method144();
				field248 = false;
			}

			if (field474 == 2) {
				method95();
				field447.method510(550, 4, field64);
			}

			if (field325 != -1) {
				field355 = true;
			}

			if (field355) {
				if (field325 != -1 && field428 == field325) {
					field325 = -1;
					field242.method452(64);
					field242.method453(field428);
				}

				field355 = false;
				field217.method509();
				field583.method589(0, 0);

				if (field246 == -1) {
					if (field408[field428] != -1) {
						if (field428 == 0) {
							field282.method589(22, 10);
						}

						if (field428 == 1) {
							field283.method589(54, 8);
						}

						if (field428 == 2) {
							field283.method589(82, 8);
						}

						if (field428 == 3) {
							field284.method589(110, 8);
						}

						if (field428 == 4) {
							field286.method589(153, 8);
						}

						if (field428 == 5) {
							field286.method589(181, 8);
						}

						if (field428 == 6) {
							field285.method589(209, 9);
						}
					}

					if (field408[0] != -1 && (field325 != 0 || field211 % 20 < 10)) {
						field541[0].method589(29, 13);
					}

					if (field408[1] != -1 && (field325 != 1 || field211 % 20 < 10)) {
						field541[1].method589(53, 11);
					}

					if (field408[2] != -1 && (field325 != 2 || field211 % 20 < 10)) {
						field541[2].method589(82, 11);
					}

					if (field408[3] != -1 && (field325 != 3 || field211 % 20 < 10)) {
						field541[3].method589(115, 12);
					}

					if (field408[4] != -1 && (field325 != 4 || field211 % 20 < 10)) {
						field541[4].method589(153, 13);
					}

					if (field408[5] != -1 && (field325 != 5 || field211 % 20 < 10)) {
						field541[5].method589(180, 11);
					}

					if (field408[6] != -1 && (field325 != 6 || field211 % 20 < 10)) {
						field541[6].method589(208, 13);
					}
				}

				field217.method510(516, 160, field64);
				field216.method509();
				field582.method589(0, 0);

				if (field246 == -1) {
					if (field408[field428] != -1) {
						if (field428 == 7) {
							field233.method589(42, 0);
						}

						if (field428 == 8) {
							field234.method589(74, 0);
						}

						if (field428 == 9) {
							field234.method589(102, 0);
						}

						if (field428 == 10) {
							field235.method589(130, 1);
						}

						if (field428 == 11) {
							field237.method589(173, 0);
						}

						if (field428 == 12) {
							field237.method589(201, 0);
						}

						if (field428 == 13) {
							field236.method589(229, 0);
						}
					}

					if (field408[8] != -1 && (field325 != 8 || field211 % 20 < 10)) {
						field541[7].method589(74, 2);
					}

					if (field408[9] != -1 && (field325 != 9 || field211 % 20 < 10)) {
						field541[8].method589(102, 3);
					}

					if (field408[10] != -1 && (field325 != 10 || field211 % 20 < 10)) {
						field541[9].method589(137, 4);
					}

					if (field408[11] != -1 && (field325 != 11 || field211 % 20 < 10)) {
						field541[10].method589(174, 2);
					}

					if (field408[12] != -1 && (field325 != 12 || field211 % 20 < 10)) {
						field541[11].method589(201, 2);
					}

					if (field408[13] != -1 && (field325 != 13 || field211 % 20 < 10)) {
						field541[12].method589(226, 2);
					}
				}

				field216.method510(496, 466, field64);
				field448.method509();
				GAGDRMEJ.field815 = field225;
			}

			if (field257) {
				field257 = false;
				field215.method509();
				field581.method589(0, 0);
				field412.method311(true, 28, 55, "Public chat", 0xFFFFFF);

				if (field503 == 0) {
					field412.method311(true, 41, 55, "On", 0xFF00);
				}

				if (field503 == 1) {
					field412.method311(true, 41, 55, "Friends", 0xFFFF00);
				}

				if (field503 == 2) {
					field412.method311(true, 41, 55, "Off", 0xFF0000);
				}

				if (field503 == 3) {
					field412.method311(true, 41, 55, "Hide", 0xFFFF);
				}

				field412.method311(true, 28, 184, "Private chat", 0xFFFFFF);

				if (field601 == 0) {
					field412.method311(true, 41, 184, "On", 0xFF00);
				}

				if (field601 == 1) {
					field412.method311(true, 41, 184, "Friends", 0xFFFF00);
				}

				if (field601 == 2) {
					field412.method311(true, 41, 184, "Off", 0xFF0000);
				}

				field412.method311(true, 28, 324, "Trade/compete", 0xFFFFFF);

				if (field387 == 0) {
					field412.method311(true, 41, 324, "On", 0xFF00);
				}

				if (field387 == 1) {
					field412.method311(true, 41, 324, "Friends", 0xFFFF00);
				}

				if (field387 == 2) {
					field412.method311(true, 41, 324, "Off", 0xFF0000);
				}

				field412.method311(true, 33, 458, "Report abuse", 0xFFFFFF);
				field215.method510(0, 453, field64);
				field448.method509();
				GAGDRMEJ.field815 = field225;
			}

			field536 = 0;
		} else {
			if (field474 == 2) {
				method167(field536, field357);

				if (field403 != -1) {
					method167(field536, field403);
				}

				field536 = 0;
				method125();
				field65.method509();
				GAGDRMEJ.field815 = field226;
				CYEOWDOP.method227();
				field617 = true;
				GMYKUSOM var1 = GMYKUSOM.method350(field357);
				if (var1.field891 == 512 && var1.field860 == 334 && var1.field903 == 0) {
					var1.field891 = 765;
					var1.field860 = 503;
				}

				method85(0, var1, 0, 0);

				if (field403 != -1) {
					GMYKUSOM var2 = GMYKUSOM.method350(field403);
					if (var2.field891 == 512 && var2.field860 == 334 && var2.field903 == 0) {
						var2.field891 = 765;
						var2.field860 = 503;
					}

					method85(0, var2, 0, 0);
				}

				if (field444) {
					method196();
				} else {
					method113();
					method146();
				}
			}

			field65.method510(0, 0, field64);
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method104() {
		field612 = false;
		while (field478) {
			field612 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field475 = null;
		field476 = null;
		field362 = null;
		field382 = null;
		field383 = null;
		field384 = null;
		field385 = null;
		field338 = null;
		field339 = null;
		field221 = null;
		field222 = null;
		field560 = null;
		field561 = null;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method19(int arg0, String arg1) {
		field212 = arg0;
		field410 = arg1;
		method79();

		if (field312 == null) {
			super.method19(arg0, arg1);
		} else {
			field466.method509();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field413.method310(var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			CYEOWDOP.method230(var3 / 2 - 152, 304, 0x8C1111, 34, var6);
			CYEOWDOP.method230(var3 / 2 - 151, 302, 0, 32, var6 + 1);
			CYEOWDOP.method229(0x8C1111, arg0 * 3, var3 / 2 - 150, var6 + 2, 30);
			CYEOWDOP.method229(0, 300 - arg0 * 3, arg0 * 3 + (var3 / 2 - 150), var6 + 2, 30);
			field413.method310(var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF, arg1);
			field466.method510(202, 171, field64);

			if (field617) {
				field617 = false;

				if (!field612) {
					field467.method510(0, 0, field64);
					field468.method510(637, 0, field64);
				}

				field464.method510(128, 0, field64);
				field465.method510(202, 371, field64);
				field469.method510(0, 265, field64);
				field470.method510(562, 265, field64);
				field471.method510(128, 171, field64);
				field472.method510(562, 171, field64);
			}
		}
	}

	@ObfuscatedName("client.k(I)Z")
	public final boolean method105() {
		if (field276 == null) {
			return false;
		}

		try {
			int var1 = field276.method354();
			if (var1 == 0) {
				return false;
			}

			if (field332 == -1) {
				field276.method355(field457.field1138, 0, 1);
				field332 = field457.field1138[0] & 0xFF;
				if (field230 != null) {
					field332 = field332 - field230.method379() & 0xFF;
				}

				field331 = BOLFLOAI.field172[field332];
				var1--;
			}

			if (field331 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field276.method355(field457.field1138, 0, 1);
				field331 = field457.field1138[0] & 0xFF;
				var1--;
			}

			if (field331 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field276.method355(field457.field1138, 0, 2);
				field457.field1139 = 0;
				field331 = field457.method465();
				var1 -= 2;
			}

			if (var1 < field331) {
				return false;
			}

			field457.field1139 = 0;
			field276.method355(field457.field1138, 0, field331);
			field333 = 0;
			field397 = field396;
			field396 = field395;
			field395 = field332;

			if (field332 == 156) {
				field479 = true;
				int var2 = field457.method482();
				int var3 = field457.method468();
				int var4 = field457.method484();
				field514[var2] = var3;
				field266[var2] = var4;
				field445[var2] = 1;
				for (int var5 = 0; var5 < 98; var5++) {
					if (var3 >= field599[var5]) {
						field445[var2] = var5 + 2;
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 251) {
				field435 = field457.method463();
				field479 = true;
				field332 = -1;
				return true;
			}

			if (field332 == 76) {
				int var6 = field457.method493();
				int var7 = field457.method493();
				GMYKUSOM.method350(var6).field858 = 2;
				GMYKUSOM.method350(var6).field859 = var7;
				field332 = -1;
				return true;
			}

			if (field332 == 157) {
				int var8 = field457.method492();
				String var9 = field457.method470();
				GMYKUSOM.method350(var8).field897 = var9;

				if (field408[field428] == GMYKUSOM.method350(var8).field850) {
					field479 = true;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 200) {
				field327 = field457.method463();
				field328 = field457.method482();
				for (int var10 = field327; var10 < field327 + 8; var10++) {
					for (int var11 = field328; var11 < field328 + 8; var11++) {
						if (field305[field580][var10][var11] != null) {
							field305[field580][var10][var11] = null;
							method192(var10, var11);
						}
					}
				}

				for (WGYERDQO var12 = (WGYERDQO) field368.method402(); var12 != null; var12 = (WGYERDQO) field368.method404()) {
					if (var12.field1466 >= field327 && var12.field1466 < field327 + 8 && var12.field1467 >= field328 && var12.field1467 < field328 + 8 && field580 == var12.field1464) {
						var12.field1468 = 0;
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 82) {
				field364 = field457.method493() * 30;
				field332 = -1;
				return true;
			}

			if (field332 == 178) {
				byte var13 = field457.method485();
				int var14 = field457.method492();
				field432[var14] = var13;

				if (field313[var14] != var13) {
					field313[var14] = var13;
					method162(var14);
					field479 = true;

					if (field510 != -1) {
						field248 = true;
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 72) {
				field265 = field457.method463();
				field332 = -1;
				return true;
			}

			if (field332 == 134) {
				for (int var15 = 0; var15 < field574.length; var15++) {
					if (field574[var15] != null) {
						field574[var15].field1388 = -1;
					}
				}

				for (int var16 = 0; var16 < field544.length; var16++) {
					if (field544[var16] != null) {
						field544[var16].field1388 = -1;
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 173) {
				field327 = field457.method482();
				field328 = field457.method463();
				field332 = -1;
				return true;
			}

			if (field332 == 226) {
				String var17 = field457.method470();
				int var18 = field457.method482();
				int var19 = field457.method463();
				if (var18 >= 1 && var18 <= 5) {
					if (var17.equalsIgnoreCase("null")) {
						var17 = null;
					}

					field563[var18 - 1] = var17;
					field564[var18 - 1] = var19 == 0;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 25) {
				if (field246 != -1) {
					method90(field246);
					field246 = -1;
					field479 = true;
					field355 = true;
				}

				if (field523 != -1) {
					method90(field523);
					field523 = -1;
					field248 = true;
				}

				if (field357 != -1) {
					method90(field357);
					field357 = -1;
					field617 = true;
				}

				if (field403 != -1) {
					method90(field403);
					field403 = -1;
				}

				if (field239 != -1) {
					method90(field239);
					field239 = -1;
				}

				if (field489 != 0) {
					field489 = 0;
					field248 = true;
				}

				field304 = false;
				field332 = -1;
				return true;
			}

			if (field332 == 153 || field332 == 13) {
				int var20 = field393;
				int var21 = field394;
				if (field332 == 153) {
					var21 = field457.method492();
					var20 = field457.method465();
					field455 = false;
				}

				if (field332 == 13) {
					field457.method473();

					for (int var22 = 0; var22 < 4; var22++) {
						for (int var23 = 0; var23 < 13; var23++) {
							for (int var24 = 0; var24 < 13; var24++) {
								int var25 = field457.method474(1);
								if (var25 == 1) {
									field557[var22][var23][var24] = field457.method474(26);
								} else {
									field557[var22][var23][var24] = -1;
								}
							}
						}
					}

					field457.method475();
					var21 = field457.method491();
					var20 = field457.method493();
					field455 = true;
				}

				if (field393 == var20 && field394 == var21 && field474 == 2) {
					field332 = -1;
					return true;
				}

				field393 = var20;
				field394 = var21;
				field567 = (field393 - 6) * 8;
				field568 = (field394 - 6) * 8;
				field255 = false;
				if ((field393 / 8 == 48 || field393 / 8 == 49) && field394 / 8 == 48) {
					field255 = true;
				}

				if (field393 / 8 == 48 && field394 / 8 == 148) {
					field255 = true;
				}

				field474 = 1;
				field401 = System.currentTimeMillis();
				method87(null, "Loading - please wait.");

				if (field332 == 153) {
					int var26 = 0;
					for (int var27 = (field393 - 6) / 8; var27 <= (field393 + 6) / 8; var27++) {
						for (int var28 = (field394 - 6) / 8; var28 <= (field394 + 6) / 8; var28++) {
							var26++;
						}
					}

					field342 = new byte[var26][];
					field565 = new byte[var26][];
					field287 = new int[var26];
					field288 = new int[var26];
					field289 = new int[var26];
					int var29 = 0;
					for (int var30 = (field393 - 6) / 8; var30 <= (field393 + 6) / 8; var30++) {
						for (int var31 = (field394 - 6) / 8; var31 <= (field394 + 6) / 8; var31++) {
							field287[var29] = (var30 << 8) + var31;

							if (field255 && (var31 == 49 || var31 == 149 || var31 == 147 || var30 == 50 || var30 == 49 && var31 == 47)) {
								field288[var29] = -1;
								field289[var29] = -1;
								var29++;
							} else {
								int var32 = field288[var29] = field359.method297(var31, var30, 0);
								if (var32 != -1) {
									field359.method307(3, var32);
								}

								int var33 = field289[var29] = field359.method297(var31, var30, 1);
								if (var33 != -1) {
									field359.method307(3, var33);
								}

								var29++;
							}
						}
					}
				}

				if (field332 == 13) {
					int var34 = 0;
					int[] var35 = new int[676];
					for (int var36 = 0; var36 < 4; var36++) {
						for (int var37 = 0; var37 < 13; var37++) {
							for (int var38 = 0; var38 < 13; var38++) {
								int var39 = field557[var36][var37][var38];
								if (var39 != -1) {
									int var40 = var39 >> 14 & 0x3FF;
									int var41 = var39 >> 3 & 0x7FF;
									int var42 = (var40 / 8 << 8) + var41 / 8;
									for (int var43 = 0; var43 < var34; var43++) {
										if (var35[var43] == var42) {
											var42 = -1;
											break;
										}
									}

									if (var42 != -1) {
										var35[var34++] = var42;
									}
								}
							}
						}
					}

					field342 = new byte[var34][];
					field565 = new byte[var34][];
					field287 = new int[var34];
					field288 = new int[var34];
					field289 = new int[var34];
					for (int var44 = 0; var44 < var34; var44++) {
						int var45 = field287[var44] = var35[var44];
						int var46 = var45 >> 8 & 0xFF;
						int var47 = var45 & 0xFF;
						int var48 = field288[var44] = field359.method297(var47, var46, 0);
						if (var48 != -1) {
							field359.method307(3, var48);
						}

						int var49 = field289[var44] = field359.method297(var47, var46, 1);
						if (var49 != -1) {
							field359.method307(3, var49);
						}
					}
				}

				int var50 = field567 - field569;
				int var51 = field568 - field570;
				field569 = field567;
				field570 = field568;

				for (int var52 = 0; var52 < 16384; var52++) {
					XQNGYHCW var53 = field544[var52];
					if (var53 != null) {
						for (int var54 = 0; var54 < 10; var54++) {
							var53.field1398[var54] -= var50;
							var53.field1399[var54] -= var51;
						}

						var53.field1395 -= var50 * 128;
						var53.field1396 -= var51 * 128;
					}
				}

				for (int var55 = 0; var55 < field572; var55++) {
					ISLZFAII var56 = field574[var55];
					if (var56 != null) {
						for (int var57 = 0; var57 < 10; var57++) {
							var56.field1398[var57] -= var50;
							var56.field1399[var57] -= var51;
						}

						var56.field1395 -= var50 * 128;
						var56.field1396 -= var51 * 128;
					}
				}

				field179 = true;
				byte var58 = 0;
				byte var59 = 104;
				byte var60 = 1;
				if (var50 < 0) {
					var58 = 103;
					var59 = -1;
					var60 = -1;
				}

				byte var61 = 0;
				byte var62 = 104;
				byte var63 = 1;
				if (var51 < 0) {
					var61 = 103;
					var62 = -1;
					var63 = -1;
				}

				for (int var64 = var58; var64 != var59; var64 += var60) {
					for (int var65 = var61; var65 != var62; var65 += var63) {
						int var66 = var50 + var64;
						int var67 = var51 + var65;
						for (int var68 = 0; var68 < 4; var68++) {
							if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
								field305[var68][var64][var65] = field305[var68][var66][var67];
							} else {
								field305[var68][var64][var65] = null;
							}
						}
					}
				}

				for (WGYERDQO var69 = (WGYERDQO) field368.method402(); var69 != null; var69 = (WGYERDQO) field368.method404()) {
					var69.field1466 -= var50;
					var69.field1467 -= var51;
					if (var69.field1466 < 0 || var69.field1467 < 0 || var69.field1466 >= 104 || var69.field1467 >= 104) {
						var69.method579();
					}
				}

				if (field269 != 0) {
					field269 -= var50;
					field270 -= var51;
				}

				field250 = false;
				field332 = -1;
				return true;
			}

			if (field332 == 95) {
				int var70 = field457.method494();
				if (field510 != var70) {
					method90(field510);
					field510 = var70;
				}

				field248 = true;
				field332 = -1;
				return true;
			}

			if (field332 == 110) {
				int var71 = field457.method465();
				int var72 = field457.method465();
				int var73 = field457.method465();
				int var74 = field457.method493();
				GMYKUSOM.method350(var74).field870 = var73;
				GMYKUSOM.method350(var74).field871 = var72;
				GMYKUSOM.method350(var74).field869 = var71;
				field332 = -1;
				return true;
			}

			if (field332 == 37) {
				field591 = field457.method463();
				field332 = -1;
				return true;
			}

			if (field332 == 91) {
				String var75 = field457.method470();
				if (var75.endsWith(":tradereq:")) {
					String var76 = var75.substring(0, var75.indexOf(":"));
					long var77 = CSEYUXAS.method216(var76);
					boolean var79 = false;
					for (int var80 = 0; var80 < field608; var80++) {
						if (field302[var80] == var77) {
							var79 = true;
							break;
						}
					}

					if (!var79 && field590 == 0) {
						method184(4, "wishes to trade with you.", var76);
					}
				} else if (var75.endsWith(":duelreq:")) {
					String var81 = var75.substring(0, var75.indexOf(":"));
					long var82 = CSEYUXAS.method216(var81);
					boolean var84 = false;
					for (int var85 = 0; var85 < field608; var85++) {
						if (field302[var85] == var82) {
							var84 = true;
							break;
						}
					}

					if (!var84 && field590 == 0) {
						method184(8, "wishes to duel with you.", var81);
					}
				} else if (var75.endsWith(":chalreq:")) {
					String var86 = var75.substring(0, var75.indexOf(":"));
					long var87 = CSEYUXAS.method216(var86);
					boolean var89 = false;
					for (int var90 = 0; var90 < field608; var90++) {
						if (field302[var90] == var87) {
							var89 = true;
							break;
						}
					}

					if (!var89 && field590 == 0) {
						String var91 = var75.substring(var75.indexOf(":") + 1, var75.length() - 9);
						method184(8, var91, var86);
					}
				} else {
					method184(0, var75, "");
				}

				field332 = -1;
				return true;
			}

			if (field332 == 204) {
				int var92 = field457.method493();
				int var93 = field457.method492();
				GMYKUSOM var94 = GMYKUSOM.method350(var92);
				if (var94 != null && var94.field903 == 0) {
					if (var93 < 0) {
						var93 = 0;
					}

					if (var93 > var94.field882 - var94.field860) {
						var93 = var94.field882 - var94.field860;
					}

					var94.field905 = var93;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 29) {
				field250 = true;
				field531 = field457.method463();
				field532 = field457.method463();
				field533 = field457.method465();
				field534 = field457.method463();
				field535 = field457.method463();
				if (field535 >= 100) {
					field549 = field531 * 128 + 64;
					field551 = field532 * 128 + 64;
					field550 = method171(field551, field549, field580) - field533;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 213) {
				int var95 = field457.method492();
				if (var95 == 0xFFFF) {
					var95 = -1;
				}

				if (field182 != var95 && field268 && !field488 && field453 == 0) {
					field329 = var95;
					field330 = true;
					field359.method307(2, field329);
				}

				field182 = var95;
				field332 = -1;
				return true;
			}

			if (field332 == 189) {
				int var96 = field457.method496();
				int var97 = field457.method492();
				if (field268 && !field488) {
					field329 = var97;
					field330 = false;
					field359.method307(2, field329);
					field453 = var96;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 12) {
				if (field428 == 12) {
					field479 = true;
				}

				field198 = field457.method466();
				field332 = -1;
				return true;
			}

			if (field332 == 116) {
				field325 = field457.method463();
				if (field428 == field325) {
					if (field325 == 3) {
						field428 = 1;
					} else {
						field428 = 3;
					}

					field479 = true;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 212) {
				int var98 = field457.method492();
				method176(var98);

				if (field246 != -1) {
					method90(field246);
					field246 = -1;
					field479 = true;
					field355 = true;
				}

				if (field523 != -1) {
					method90(field523);
					field523 = -1;
					field248 = true;
				}

				if (field357 != -1) {
					method90(field357);
					field357 = -1;
					field617 = true;
				}

				if (field403 != -1) {
					method90(field403);
					field403 = -1;
				}

				if (field239 != var98) {
					method90(field239);
					field239 = var98;
				}

				if (field489 != 0) {
					field489 = 0;
					field248 = true;
				}

				field304 = false;
				field332 = -1;
				return true;
			}

			if (field332 == 88) {
				field479 = true;
				int var99 = field457.method465();
				GMYKUSOM var100 = GMYKUSOM.method350(var99);
				int var101 = field457.method465();
				for (int var102 = 0; var102 < var101; var102++) {
					int var103 = field457.method484();
					if (var103 == 255) {
						var103 = field457.method500();
					}

					var100.field912[var102] = field457.method465();
					var100.field864[var102] = var103;
				}

				for (int var104 = var101; var104 < var100.field912.length; var104++) {
					var100.field912[var104] = 0;
					var100.field864[var104] = 0;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 35) {
				for (int var105 = 0; var105 < field313.length; var105++) {
					if (field432[var105] != field313[var105]) {
						field313[var105] = field432[var105];
						method162(var105);
						field479 = true;
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 127) {
				field327 = field457.method484();
				field328 = field457.method482();

				while (field457.field1139 < field331) {
					int var106 = field457.method463();
					method84(field457, var106);
				}

				field332 = -1;
				return true;
			}

			if (field332 == 161) {
				int var107 = field457.method465();
				method176(var107);

				if (field523 != -1) {
					method90(field523);
					field523 = -1;
					field248 = true;
				}

				if (field357 != -1) {
					method90(field357);
					field357 = -1;
					field617 = true;
				}

				if (field403 != -1) {
					method90(field403);
					field403 = -1;
				}

				if (field239 != -1) {
					method90(field239);
					field239 = -1;
				}

				if (field246 != var107) {
					method90(field246);
					field246 = var107;
				}

				if (field489 != 0) {
					field489 = 0;
					field248 = true;
				}

				field479 = true;
				field355 = true;
				field304 = false;
				field332 = -1;
				return true;
			}

			if (field332 == 79) {
				int var108 = field457.method465();
				int var109 = field457.method492();

				if (field523 != -1) {
					method90(field523);
					field523 = -1;
					field248 = true;
				}

				if (field357 != -1) {
					method90(field357);
					field357 = -1;
					field617 = true;
				}

				if (field403 != -1) {
					method90(field403);
					field403 = -1;
				}

				if (field239 != var109) {
					method90(field239);
					field239 = var109;
				}

				if (field246 != var108) {
					method90(field246);
					field246 = var108;
				}

				if (field489 != 0) {
					field489 = 0;
					field248 = true;
				}

				field479 = true;
				field355 = true;
				field304 = false;
				field332 = -1;
				return true;
			}

			if (field332 == 63) {
				int var110 = field457.method465();
				int var111 = field457.method491();
				method176(var110);

				if (var111 != -1) {
					method176(var111);
				}

				if (field239 != -1) {
					method90(field239);
					field239 = -1;
				}

				if (field246 != -1) {
					method90(field246);
					field246 = -1;
				}

				if (field523 != -1) {
					method90(field523);
					field523 = -1;
				}

				if (field357 != var110) {
					method90(field357);
					field357 = var110;
				}

				if (field403 != var110) {
					method90(field403);
					field403 = var111;
				}

				field489 = 0;
				field304 = false;
				field332 = -1;
				return true;
			}

			if (field332 == 139) {
				int var112 = field457.method492();
				int var113 = field457.method492();
				GMYKUSOM.method350(var113).field858 = 1;
				GMYKUSOM.method350(var113).field859 = var112;
				field332 = -1;
				return true;
			}

			if (field332 == 206) {
				int var114 = field457.method491();
				int var115 = field457.method483();

				if (var114 == 0xFFFF) {
					var114 = -1;
				}

				if (field408[var115] != var114) {
					method90(field408[var115]);
					field408[var115] = var114;
				}

				field479 = true;
				field355 = true;
				field332 = -1;
				return true;
			}

			if (field332 == 7) {
				int var116 = field457.method465();
				int var117 = field457.method463();
				int var118 = field457.method465();
				if (field256 && !field488 && field218 < 50) {
					field181[field218] = var116;
					field619[field218] = var117;
					field423[field218] = MNBSCLLD.field1158[var116] + var118;
					field218++;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 223 || field332 == 60 || field332 == 220 || field332 == 187 || field332 == 86 || field332 == 122 || field332 == 106 || field332 == 180 || field332 == 194 || field332 == 94 || field332 == 89) {
				method84(field457, field332);
				field332 = -1;
				return true;
			}

			if (field332 == 225) {
				int var119 = field457.method465();
				int var120 = field457.method492();
				int var121 = field457.method491();
				if (var120 == 0xFFFF) {
					GMYKUSOM.method350(var121).field858 = 0;
					field332 = -1;
					return true;
				}

				HHBFOKVP var122 = HHBFOKVP.method367(var120);
				GMYKUSOM.method350(var121).field858 = 4;
				GMYKUSOM.method350(var121).field859 = var120;
				GMYKUSOM.method350(var121).field870 = var122.field965;
				GMYKUSOM.method350(var121).field871 = var122.field960;
				GMYKUSOM.method350(var121).field869 = var122.field988 * 100 / var119;
				field332 = -1;
				return true;
			}

			if (field332 == 141) {
				int var123 = field457.method463();
				int var124 = field457.method463();
				int var125 = field457.method463();
				int var126 = field457.method463();
				field296[var123] = true;
				field315[var123] = var124;
				field513[var123] = var125;
				field429[var123] = var126;
				field607[var123] = 0;
				field332 = -1;
				return true;
			}

			if (field332 == 3) {
				long var127 = field457.method469();
				int var129 = field457.method463();
				String var130 = CSEYUXAS.method220(CSEYUXAS.method217(var127));
				for (int var131 = 0; var131 < field434; var131++) {
					if (field443[var131] == var127) {
						if (field505[var131] != var129) {
							field505[var131] = var129;
							field479 = true;

							if (var129 > 0) {
								method184(5, var130 + " has logged in.", "");
							}

							if (var129 == 0) {
								method184(5, var130 + " has logged out.", "");
							}
						}

						var130 = null;
						break;
					}
				}

				if (var130 != null && field434 < 200) {
					field443[field434] = var127;
					field539[field434] = var130;
					field505[field434] = var129;
					field434++;
					field479 = true;
				}

				boolean var132 = false;
				while (!var132) {
					var132 = true;
					for (int var133 = 0; var133 < field434 - 1; var133++) {
						if (field505[var133] != field485 && field505[var133 + 1] == field485 || field505[var133] == 0 && field505[var133 + 1] != 0) {
							int var134 = field505[var133];
							field505[var133] = field505[var133 + 1];
							field505[var133 + 1] = var134;
							String var135 = field539[var133];
							field539[var133] = field539[var133 + 1];
							field539[var133 + 1] = var135;
							long var136 = field443[var133];
							field443[var133] = field443[var133 + 1];
							field443[var133 + 1] = var136;
							field479 = true;
							var132 = false;
						}
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 27) {
				field250 = false;

				for (int var138 = 0; var138 < 5; var138++) {
					field296[var138] = false;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 184) {
				field365 = false;
				field489 = 1;
				field354 = "";
				field248 = true;
				field332 = -1;
				return true;
			}

			if (field332 == 114) {
				method86();
				field332 = -1;
				return false;
			}

			if (field332 == 123) {
				int var139 = field457.method491();
				int var140 = field457.method494();
				int var141 = field457.method495();
				GMYKUSOM var142 = GMYKUSOM.method350(var139);
				var142.field845 = var140;
				var142.field866 = var141;
				field332 = -1;
				return true;
			}

			if (field332 == 176) {
				int var143 = field457.method492();
				method176(var143);

				if (field246 != -1) {
					method90(field246);
					field246 = -1;
					field479 = true;
					field355 = true;
				}

				if (field357 != -1) {
					method90(field357);
					field357 = -1;
					field617 = true;
				}

				if (field403 != -1) {
					method90(field403);
					field403 = -1;
				}

				if (field239 != -1) {
					method90(field239);
					field239 = -1;
				}

				if (field523 != var143) {
					method90(field523);
					field523 = var143;
				}

				field304 = false;
				field248 = true;
				field332 = -1;
				return true;
			}

			if (field332 == 151) {
				int var144 = field457.method493();
				GMYKUSOM var145 = GMYKUSOM.method350(var144);
				for (int var146 = 0; var146 < var145.field912.length; var146++) {
					var145.field912[var146] = -1;
					var145.field912[var146] = 0;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 255) {
				long var147 = field457.method469();
				int var149 = field457.method468();
				int var150 = field457.method463();
				boolean var151 = false;
				for (int var152 = 0; var152 < 100; var152++) {
					if (field530[var152] == var149) {
						var151 = true;
						break;
					}
				}

				if (var150 <= 1) {
					for (int var153 = 0; var153 < field608; var153++) {
						if (field302[var153] == var147) {
							var151 = true;
							break;
						}
					}
				}

				if (!var151 && field590 == 0) {
					try {
						field530[field611] = var149;
						field611 = (field611 + 1) % 100;
						String var154 = RTTNUYFU.method562(field331 - 13, field457);
						if (var150 != 3) {
							var154 = DYUQECMZ.method254(var154);
						}

						if (var150 == 2 || var150 == 3) {
							method184(7, var154, "@cr2@" + CSEYUXAS.method220(CSEYUXAS.method217(var147)));
						} else if (var150 == 1) {
							method184(7, var154, "@cr1@" + CSEYUXAS.method220(CSEYUXAS.method217(var147)));
						} else {
							method184(3, var154, CSEYUXAS.method220(CSEYUXAS.method217(var147)));
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 39) {
				int var156 = field457.method465();
				int var157 = field457.method493();
				int var158 = field457.method493();
				GMYKUSOM.method350(var157).field878 = (var156 << 16) + var158;
				field332 = -1;
				return true;
			}

			if (field332 == 179) {
				method206(field457, field331);
				field332 = -1;
				return true;
			}

			if (field332 == 55) {
				field386 = field457.method463();
				field303 = field457.method493();
				field332 = -1;
				return true;
			}

			if (field332 == 96) {
				field457.method465();
				field249 = field457.method492();
				field442 = field457.method499();
				field450 = field457.method492();
				field431 = field457.method463();
				field185 = field457.method491();
				field473 = field457.method465();
				field361 = field457.method493();
				field457.method465();
				field340 = field457.method465();
				field298 = field457.method491();
				signlink.dnslookup(CSEYUXAS.method219(field442));
				field332 = -1;
				return true;
			}

			if (field332 == 174) {
				field250 = true;
				field187 = field457.method463();
				field188 = field457.method463();
				field189 = field457.method465();
				field190 = field457.method463();
				field191 = field457.method463();
				if (field191 >= 100) {
					int var159 = field187 * 128 + 64;
					int var160 = field188 * 128 + 64;
					int var161 = method171(var160, var159, field580) - field189;
					int var162 = var159 - field549;
					int var163 = var161 - field550;
					int var164 = var160 - field551;
					int var165 = (int) Math.sqrt(var162 * var162 + var164 * var164);
					field552 = (int) (Math.atan2(var163, var165) * 325.949D) & 0x7FF;
					field553 = (int) (Math.atan2(var162, var164) * -325.949D) & 0x7FF;

					if (field552 < 128) {
						field552 = 128;
					}

					if (field552 > 383) {
						field552 = 383;
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 167) {
				field428 = field457.method484();
				field479 = true;
				field355 = true;
				field332 = -1;
				return true;
			}

			if (field332 == 101) {
				int var166 = field457.method493();
				int var167 = field457.method500();
				field432[var166] = var167;

				if (field313[var166] != var167) {
					field313[var166] = var167;
					method162(var166);
					field479 = true;

					if (field510 != -1) {
						field248 = true;
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 202) {
				field479 = true;
				int var168 = field457.method465();
				GMYKUSOM var169 = GMYKUSOM.method350(var168);
				while (field457.field1139 < field331) {
					int var170 = field457.method477();
					int var171 = field457.method465();
					int var172 = field457.method463();
					if (var172 == 255) {
						var172 = field457.method468();
					}

					if (var170 >= 0 && var170 < var169.field912.length) {
						var169.field912[var170] = var171;
						var169.field864[var170] = var172;
					}
				}

				field332 = -1;
				return true;
			}

			if (field332 == 254) {
				boolean var173 = field457.method482() == 1;
				int var174 = field457.method465();
				GMYKUSOM.method350(var174).field894 = var173;
				field332 = -1;
				return true;
			}

			if (field332 == 227) {
				method170(field457, field331);
				field179 = false;
				field332 = -1;
				return true;
			}

			if (field332 == 247) {
				field608 = field331 / 8;
				for (int var175 = 0; var175 < field608; var175++) {
					field302[var175] = field457.method469();
				}

				field332 = -1;
				return true;
			}

			if (field332 == 193) {
				field365 = false;
				field489 = 2;
				field354 = "";
				field248 = true;
				field332 = -1;
				return true;
			}

			if (field332 == 146) {
				field586 = field457.method463();
				if (field586 == 1) {
					field297 = field457.method465();
				}

				if (field586 >= 2 && field586 <= 6) {
					if (field586 == 2) {
						field518 = 64;
						field519 = 64;
					}

					if (field586 == 3) {
						field518 = 0;
						field519 = 64;
					}

					if (field586 == 4) {
						field518 = 128;
						field519 = 64;
					}

					if (field586 == 5) {
						field518 = 64;
						field519 = 0;
					}

					if (field586 == 6) {
						field518 = 64;
						field519 = 128;
					}

					field586 = 2;
					field515 = field457.method465();
					field516 = field457.method465();
					field517 = field457.method463();
				}

				if (field586 == 10) {
					field584 = field457.method465();
				}

				field332 = -1;
				return true;
			}

			if (field332 == 0) {
				field503 = field457.method463();
				field601 = field457.method463();
				field387 = field457.method463();
				field257 = true;
				field248 = true;
				field332 = -1;
				return true;
			}

			if (field332 == 249) {
				int var176 = field457.method493();
				int var177 = field457.method465();
				int var178 = var177 >> 10 & 0x1F;
				int var179 = var177 >> 5 & 0x1F;
				int var180 = var177 & 0x1F;
				GMYKUSOM.method350(var176).field853 = (var180 << 3) + (var178 << 19) + (var179 << 11);
				field332 = -1;
				return true;
			}

			if (field332 == 111) {
				int var181 = field457.method494();
				if (var181 >= 0) {
					method176(var181);
				}

				if (field231 != var181) {
					method90(field231);
					field231 = var181;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 62) {
				if (field428 == 12) {
					field479 = true;
				}

				field358 = field457.method463();
				field332 = -1;
				return true;
			}

			if (field332 == 41) {
				field269 = 0;
				field332 = -1;
				return true;
			}

			if (field332 == 85) {
				int var182 = field457.method493();
				int var183 = field457.method495();
				GMYKUSOM var184 = GMYKUSOM.method350(var182);
				if (var184.field906 != var183 || var183 == -1) {
					var184.field906 = var183;
					var184.field875 = 0;
					var184.field888 = 0;
				}

				field332 = -1;
				return true;
			}

			if (field332 == 154) {
				int var185 = field457.method492();
				GMYKUSOM.method350(var185).field858 = 3;

				if (field548.field1043 == null) {
					GMYKUSOM.method350(var185).field859 = (field548.field1035[11] << 5) + (field548.field1035[8] << 10) + (field548.field1035[0] << 15) + (field548.field1041[0] << 25) + (field548.field1041[4] << 20) + field548.field1035[1];
				} else {
					GMYKUSOM.method350(var185).field859 = (int) (field548.field1043.field664 + 0x12345678L);
				}

				field332 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field332 + "," + field331 + " - " + field396 + "," + field397);
			method86();
		} catch (IOException var190) {
			method175();
		} catch (Exception var191) {
			String var187 = "T2 - " + field332 + "," + field396 + "," + field397 + " - " + field331 + "," + (field548.field1398[0] + field567) + "," + (field548.field1399[0] + field568) + " - ";
			for (int var188 = 0; var188 < field331 && var188 < 50; var188++) {
				var187 = var187 + field457.field1138[var188] + ",";
			}

			signlink.reporterror(var187);
			method86();
		}

		return true;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method106() {
		field590 = 0;
		int var1 = (field548.field1395 >> 7) + field567;
		int var2 = (field548.field1396 >> 7) + field568;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field590 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field590 = 1;
		}

		if (field590 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field590 = 0;
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 343);

			if (arg0.length == 5) {
				field485 = Integer.parseInt(arg0[0]);
				field486 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method193();
				} else if (arg0[2].equals("highmem")) {
					method114();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field487 = false;
				} else if (arg0[3].equals("members")) {
					field487 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method7(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.b(ILLZWRHABP;I)V")
	public final void method107(int arg0, LZWRHABP arg1) {
		for (int var3 = 0; var3 < field577; var3++) {
			int var4 = field578[var3];
			ISLZFAII var5 = field574[var4];
			int var6 = arg1.method463();
			if ((var6 & 0x2) != 0) {
				var6 += arg1.method463() << 8;
			}

			method109(var5, arg1, var6, var4);
		}
	}

	@ObfuscatedName("client.b(IILLZWRHABP;)V")
	public final void method108(int arg0, LZWRHABP arg1) {
		for (int var3 = 0; var3 < field577; var3++) {
			int var4 = field578[var3];
			XQNGYHCW var5 = field544[var4];
			int var6 = arg1.method463();
			if ((var6 & 0x10) != 0) {
				int var7 = arg1.method482();
				int var8 = arg1.method482();
				var5.method577(var7, field211, var8);
				var5.field1405 = field211 + 300;
				var5.field1406 = arg1.method482();
				var5.field1407 = arg1.method482();
			}

			if ((var6 & 0x4) != 0) {
				var5.field1394 = arg1.method492();
				if (var5.field1394 == 0xFFFF) {
					var5.field1394 = -1;
				}
			}

			if ((var6 & 0x40) != 0) {
				int var9 = arg1.method484();
				int var10 = arg1.method483();
				var5.method577(var9, field211, var10);
				var5.field1405 = field211 + 300;
				var5.field1406 = arg1.method463();
				var5.field1407 = arg1.method483();
			}

			if ((var6 & 0x80) != 0) {
				var5.field1494 = DUHKBPRV.method242(arg1.method465());
				var5.field1423 = var5.field1494.field652;
				var5.field1422 = var5.field1494.field669;
				var5.field1377 = var5.field1494.field666;
				var5.field1378 = var5.field1494.field679;
				var5.field1379 = var5.field1494.field662;
				var5.field1380 = var5.field1494.field680;
				var5.field1403 = var5.field1494.field655;
			}

			if ((var6 & 0x8) != 0) {
				var5.field1408 = arg1.method465();
				var5.field1409 = arg1.method465();
			}

			if ((var6 & 0x20) != 0) {
				var5.field1415 = arg1.method465();
				int var11 = arg1.method468();
				var5.field1419 = var11 >> 16;
				var5.field1418 = (var11 & 0xFFFF) + field211;
				var5.field1416 = 0;
				var5.field1417 = 0;

				if (var5.field1418 > field211) {
					var5.field1416 = -1;
				}

				if (var5.field1415 == 0xFFFF) {
					var5.field1415 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field1383 = arg1.method470();
				var5.field1393 = 100;
			}

			if ((var6 & 0x1) != 0) {
				int var12 = arg1.method493();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg1.method482();
				if (var5.field1388 == var12 && var12 != -1) {
					int var14 = WOTIAWQC.field1470[var12].field1484;
					if (var14 == 1) {
						var5.field1389 = 0;
						var5.field1390 = 0;
						var5.field1391 = var13;
						var5.field1392 = 0;
					}

					if (var14 == 2) {
						var5.field1392 = 0;
					}
				} else if (var12 == -1 || var5.field1388 == -1 || WOTIAWQC.field1470[var12].field1478 >= WOTIAWQC.field1470[var5.field1388].field1478) {
					var5.field1388 = var12;
					var5.field1389 = 0;
					var5.field1390 = 0;
					var5.field1391 = var13;
					var5.field1392 = 0;
					var5.field1376 = var5.field1400;
				}
			}
		}
	}

	public final void init() {
		field485 = Integer.parseInt(getParameter("nodeid"));
		field486 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method193();
		} else {
			method114();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field487 = false;
		} else {
			field487 = true;
		}

		method8(765, 503);
	}

	@ObfuscatedName("client.a(LISLZFAII;LLZWRHABP;III)V")
	public final void method109(ISLZFAII arg0, LZWRHABP arg1, int arg2, int arg3) {
		if ((arg2 & 0x40) != 0) {
			int var5 = arg1.method463();
			byte[] var6 = new byte[var5];
			LZWRHABP var7 = new LZWRHABP(var6);
			arg1.method501(var6, 0, var5);
			field579[arg3] = var7;
			arg0.method395(var7);
		}

		if ((arg2 & 0x200) != 0) {
			arg0.field1424 = arg1.method463();
			arg0.field1426 = arg1.method483();
			arg0.field1425 = arg1.method484();
			arg0.field1427 = arg1.method484();
			arg0.field1428 = arg1.method492() + field211;
			arg0.field1429 = arg1.method493() + field211;
			arg0.field1430 = arg1.method482();
			arg0.method578();
		}

		if ((arg2 & 0x100) != 0) {
			arg0.field1415 = arg1.method465();
			int var8 = arg1.method498();
			arg0.field1419 = var8 >> 16;
			arg0.field1418 = (var8 & 0xFFFF) + field211;
			arg0.field1416 = 0;
			arg0.field1417 = 0;

			if (arg0.field1418 > field211) {
				arg0.field1416 = -1;
			}

			if (arg0.field1415 == 0xFFFF) {
				arg0.field1415 = -1;
			}
		}

		if ((arg2 & 0x1) != 0) {
			int var9 = arg1.method483();
			int var10 = arg1.method482();
			arg0.method577(var9, field211, var10);
			arg0.field1405 = field211 + 300;
			arg0.field1406 = arg1.method482();
			arg0.field1407 = arg1.method484();
		}

		if ((arg2 & 0x20) != 0) {
			arg0.field1394 = arg1.method465();
			if (arg0.field1394 == 0xFFFF) {
				arg0.field1394 = -1;
			}
		}

		if ((arg2 & 0x8) != 0) {
			arg0.field1383 = arg1.method470();
			if (arg0.field1383.charAt(0) == '~') {
				arg0.field1383 = arg0.field1383.substring(1);
				method184(2, arg0.field1383, arg0.field1039);
			} else if (field548 == arg0) {
				method184(2, arg0.field1383, arg0.field1039);
			}

			arg0.field1421 = 0;
			arg0.field1384 = 0;
			arg0.field1393 = 150;
		}

		if ((arg2 & 0x80) != 0) {
			arg0.field1408 = arg1.method492();
			arg0.field1409 = arg1.method493();
		}

		if ((arg2 & 0x400) != 0) {
			int var11 = arg1.method482();
			int var12 = arg1.method483();
			arg0.method577(var11, field211, var12);
			arg0.field1405 = field211 + 300;
			arg0.field1406 = arg1.method482();
			arg0.field1407 = arg1.method484();
		}

		if ((arg2 & 0x10) != 0) {
			int var13 = arg1.method493();
			if (var13 == 0xFFFF) {
				var13 = -1;
			}

			int var14 = arg1.method483();
			if (arg0.field1388 == var13 && var13 != -1) {
				int var15 = WOTIAWQC.field1470[var13].field1484;
				if (var15 == 1) {
					arg0.field1389 = 0;
					arg0.field1390 = 0;
					arg0.field1391 = var14;
					arg0.field1392 = 0;
				}

				if (var15 == 2) {
					arg0.field1392 = 0;
				}
			} else if (var13 == -1 || arg0.field1388 == -1 || WOTIAWQC.field1470[var13].field1478 >= WOTIAWQC.field1470[arg0.field1388].field1478) {
				arg0.field1388 = var13;
				arg0.field1389 = 0;
				arg0.field1390 = 0;
				arg0.field1391 = var14;
				arg0.field1392 = 0;
				arg0.field1376 = arg0.field1400;
			}
		}

		if ((arg2 & 0x4) != 0) {
			int var16 = arg1.method492();
			int var17 = arg1.method482();
			int var18 = arg1.method463();
			int var19 = arg1.field1139;

			if (arg0.field1039 != null && arg0.field1025) {
				long var20 = CSEYUXAS.method216(arg0.field1039);
				boolean var22 = false;
				if (var17 <= 1) {
					for (int var23 = 0; var23 < field608; var23++) {
						if (field302[var23] == var20) {
							var22 = true;
							break;
						}
					}
				}

				if (!var22 && field590 == 0) {
					try {
						field543.field1139 = 0;
						arg1.method501(field543.field1138, 0, var18);
						field543.field1139 = 0;
						String var24 = RTTNUYFU.method562(var18, field543);
						var24 = DYUQECMZ.method254(var24);
						arg0.field1383 = var24;
						arg0.field1421 = var16 >> 8;
						arg0.field1384 = var16 & 0xFF;
						arg0.field1393 = 150;

						if (var17 == 2 || var17 == 3) {
							method184(1, var24, "@cr2@" + arg0.field1039);
						} else if (var17 == 1) {
							method184(1, var24, "@cr1@" + arg0.field1039);
						} else {
							method184(2, var24, arg0.field1039);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field1139 = var18 + var19;
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method110(boolean arg0) {
		if (field548.field1395 >> 7 == field269 && field548.field1396 >> 7 == field270) {
			field269 = 0;
		}

		int var2 = field575;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			ISLZFAII var4;
			int var5;
			if (arg0) {
				var4 = field548;
				var5 = field573 << 14;
			} else {
				var4 = field574[field576[var3]];
				var5 = field576[var3] << 14;
			}

			if (var4 != null && var4.method397()) {
				var4.field1037 = false;
				if ((field488 && field575 > 50 || field575 > 200) && !arg0 && var4.field1411 == var4.field1403) {
					var4.field1037 = true;
				}

				int var6 = var4.field1395 >> 7;
				int var7 = var4.field1396 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1022 == null || field211 < var4.field1028 || field211 >= var4.field1029) {
						if ((var4.field1395 & 0x7F) == 0x40 && (var4.field1396 & 0x7F) == 0x40) {
							if (field203[var6][var7] == field193) {
								continue;
							}

							field203[var6][var7] = field193;
						}

						var4.field1038 = method171(var4.field1396, var4.field1395, field580);
						field320.method38(var4.field1395, 60, var4.field1414, var4, var4.field1038, var4.field1397, field580, var4.field1396, var5);
					} else {
						var4.field1037 = false;
						var4.field1038 = method171(var4.field1396, var4.field1395, field580);
						field320.method39(var4.field1032, var4.field1033, var4.field1034, var4.field1038, var4.field1397, var4, 60, var4.field1031, field580, var5, var4.field1395, var4.field1396);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILGMYKUSOM;Z)I")
	public final int method111(int arg0, GMYKUSOM arg1) {
		if (arg1.field898 == null || arg0 >= arg1.field898.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field898[arg0];
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
					var8 = field266[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field445[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field514[var3[var5++]];
				}

				if (var7 == 4) {
					GMYKUSOM var10 = GMYKUSOM.method350(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < HHBFOKVP.field941 && (!HHBFOKVP.method367(var11).field942 || field487)) {
						for (int var12 = 0; var12 < var10.field912.length; var12++) {
							if (var11 + 1 == var10.field912[var12]) {
								var8 += var10.field864[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field313[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field599[field445[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field313[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field548.field1026;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < QFHYLQAY.field1268; var13++) {
						if (QFHYLQAY.field1270[var13]) {
							var8 += field445[var13];
						}
					}
				}

				if (var7 == 10) {
					GMYKUSOM var14 = GMYKUSOM.method350(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < HHBFOKVP.field941 && (!HHBFOKVP.method367(var15).field942 || field487)) {
						for (int var16 = 0; var16 < var14.field912.length; var16++) {
							if (var14.field912[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field358;
				}

				if (var7 == 12) {
					var8 = field198;
				}

				if (var7 == 13) {
					int var17 = field313[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					RCLYPSZZ var20 = RCLYPSZZ.field1321[var19];
					int var21 = var20.field1323;
					int var22 = var20.field1324;
					int var23 = var20.field1325;
					int var24 = field267[var23 - var22];
					var8 = field313[var21] >> var22 & var24;
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
					var8 = (field548.field1395 >> 7) + field567;
				}

				if (var7 == 19) {
					var8 = (field548.field1396 >> 7) + field568;
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

	@ObfuscatedName("client.a(BLWGYERDQO;)V")
	public final void method112(WGYERDQO arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1465 == 0) {
			var2 = field320.method53(arg0.field1464, arg0.field1466, arg0.field1467);
		}

		if (arg0.field1465 == 1) {
			var2 = field320.method54(arg0.field1466, arg0.field1467, arg0.field1464);
		}

		if (arg0.field1465 == 2) {
			var2 = field320.method55(arg0.field1464, arg0.field1466, arg0.field1467);
		}

		if (arg0.field1465 == 3) {
			var2 = field320.method56(arg0.field1464, arg0.field1466, arg0.field1467);
		}

		if (var2 != 0) {
			int var6 = field320.method57(arg0.field1464, arg0.field1466, arg0.field1467, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1461 = var3;
		arg0.field1463 = var4;
		arg0.field1462 = var5;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method113() {
		if (field208 == 0) {
			field388[0] = "Cancel";
			field323[0] = 1946;
			field232 = 1;
			if (field357 == -1) {
				method190();
				field600 = 0;
				field244 = 0;

				if (field72 > 4 && field73 > 4 && field72 < 516 && field73 < 338) {
					if (field239 == -1) {
						method131();
					} else {
						method185(4, GMYKUSOM.method350(field239), 4, field72, 0, 0, field73);
					}
				}

				if (field600 != field194) {
					field194 = field600;
				}

				if (field398 != field244) {
					field398 = field244;
				}

				field600 = 0;
				field244 = 0;

				if (field72 > 553 && field73 > 205 && field72 < 743 && field73 < 466) {
					if (field246 != -1) {
						method185(205, GMYKUSOM.method350(field246), 553, field72, 1, 0, field73);
					} else if (field408[field428] != -1) {
						method185(205, GMYKUSOM.method350(field408[field428]), 553, field72, 1, 0, field73);
					}
				}

				if (field600 != field537) {
					field479 = true;
					field537 = field600;
				}

				if (field427 != field244) {
					field479 = true;
					field427 = field244;
				}

				field600 = 0;
				field244 = 0;

				if (field72 > 17 && field73 > 357 && field72 < 496 && field73 < 453) {
					if (field523 != -1) {
						method185(357, GMYKUSOM.method350(field523), 17, field72, 2, 0, field73);
					} else if (field510 != -1) {
						method185(357, GMYKUSOM.method350(field510), 17, field72, 3, 0, field73);
					} else if (field73 < 434 && field72 < 426) {
						method161(field73 - 357, field72 - 17);
					}
				}

				if ((field523 != -1 || field510 != -1) && field600 != field538) {
					field248 = true;
					field538 = field600;
				}

				if ((field523 != -1 || field510 != -1) && field366 != field244) {
					field248 = true;
					field366 = field244;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field232 - 1; var2++) {
						if (field323[var2] < 1000 && field323[var2 + 1] > 1000) {
							String var3 = field388[var2];
							field388[var2] = field388[var2 + 1];
							field388[var2 + 1] = var3;
							int var4 = field323[var2];
							field323[var2] = field323[var2 + 1];
							field323[var2 + 1] = var4;
							int var5 = field321[var2];
							field321[var2] = field321[var2 + 1];
							field321[var2 + 1] = var5;
							int var6 = field322[var2];
							field322[var2] = field322[var2 + 1];
							field322[var2 + 1] = var6;
							int var7 = field324[var2];
							field324[var2] = field324[var2 + 1];
							field324[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field600 = 0;
				field244 = 0;
				method185(0, GMYKUSOM.method350(field357), 0, field72, 0, 0, field73);

				if (field600 != field194) {
					field194 = field600;
				}

				if (field398 != field244) {
					field398 = field244;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public static final void method114() {
		BJATBFRK.field107 = false;
		GAGDRMEJ.field804 = false;
		field488 = false;
		QQKEKZOD.field1306 = false;
		OEPVRTCC.field1238 = false;
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method115(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method116(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(BLGMYKUSOM;)Z")
	public final boolean method117(GMYKUSOM arg0) {
		int var2 = arg0.field899;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field388[field232] = "Remove @whi@" + arg0.field897;
				field323[field232] = 997;
				field232++;
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

		field388[field232] = "Remove @whi@" + field539[var2];
		field323[field232] = 293;
		field232++;
		field388[field232] = "Message @whi@" + field539[var2];
		field323[field232] = 927;
		field232++;
		return true;
	}

	@ObfuscatedName("client.c(ZI)Ljava/lang/String;")
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

	@ObfuscatedName("client.a(IIIIIBI)V")
	public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = LSSDQDBV.field1127[var7];
			int var13 = LSSDQDBV.field1128[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = LSSDQDBV.field1127[var8];
			int var16 = LSSDQDBV.field1128[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field549 = arg3 - var9;
		field550 = arg2 - var10;
		field551 = arg4 - var11;
		field552 = arg1;
		field553 = arg0;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method120() {
		field475 = new XRUIQOVM(field312, "titlebox", 0);
		field476 = new XRUIQOVM(field312, "titlebutton", 0);
		field362 = new XRUIQOVM[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field362[var1] = new XRUIQOVM(field312, "runes", var1);
		}

		field560 = new INRTBCYJ(128, 265);
		field561 = new INRTBCYJ(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field560.field1011[var2] = field467.field1196[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field561.field1011[var3] = field468.field1196[var3];
		}

		field383 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field383[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field383[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field383[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field383[var7 + 192] = 0xFFFFFF;
		}

		field384 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field384[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field384[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field384[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field384[var11 + 192] = 0xFFFFFF;
		}

		field385 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field385[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field385[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field385[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field385[var15 + 192] = 0xFFFFFF;
		}

		field382 = new int[256];
		field338 = new int[32768];
		field339 = new int[32768];
		method143(null);
		field221 = new int[32768];
		field222 = new int[32768];
		method19(10, "Connecting to fileserver");

		if (!field612) {
			field426 = true;
			field612 = true;
			method18(this, 2);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method121() {
		if (field78 == 1) {
			if (field79 >= 539 && field79 <= 573 && field80 >= 169 && field80 < 205 && field408[0] != -1) {
				field479 = true;
				field428 = 0;
				field355 = true;
			}

			if (field79 >= 569 && field79 <= 599 && field80 >= 168 && field80 < 205 && field408[1] != -1) {
				field479 = true;
				field428 = 1;
				field355 = true;
			}

			if (field79 >= 597 && field79 <= 627 && field80 >= 168 && field80 < 205 && field408[2] != -1) {
				field479 = true;
				field428 = 2;
				field355 = true;
			}

			if (field79 >= 625 && field79 <= 669 && field80 >= 168 && field80 < 203 && field408[3] != -1) {
				field479 = true;
				field428 = 3;
				field355 = true;
			}

			if (field79 >= 666 && field79 <= 696 && field80 >= 168 && field80 < 205 && field408[4] != -1) {
				field479 = true;
				field428 = 4;
				field355 = true;
			}

			if (field79 >= 694 && field79 <= 724 && field80 >= 168 && field80 < 205 && field408[5] != -1) {
				field479 = true;
				field428 = 5;
				field355 = true;
			}

			if (field79 >= 722 && field79 <= 756 && field80 >= 169 && field80 < 205 && field408[6] != -1) {
				field479 = true;
				field428 = 6;
				field355 = true;
			}

			if (field79 >= 540 && field79 <= 574 && field80 >= 466 && field80 < 502 && field408[7] != -1) {
				field479 = true;
				field428 = 7;
				field355 = true;
			}

			if (field79 >= 572 && field79 <= 602 && field80 >= 466 && field80 < 503 && field408[8] != -1) {
				field479 = true;
				field428 = 8;
				field355 = true;
			}

			if (field79 >= 599 && field79 <= 629 && field80 >= 466 && field80 < 503 && field408[9] != -1) {
				field479 = true;
				field428 = 9;
				field355 = true;
			}

			if (field79 >= 627 && field79 <= 671 && field80 >= 467 && field80 < 502 && field408[10] != -1) {
				field479 = true;
				field428 = 10;
				field355 = true;
			}

			if (field79 >= 669 && field79 <= 699 && field80 >= 466 && field80 < 503 && field408[11] != -1) {
				field479 = true;
				field428 = 11;
				field355 = true;
			}

			if (field79 >= 696 && field79 <= 726 && field80 >= 466 && field80 < 503 && field408[12] != -1) {
				field479 = true;
				field428 = 12;
				field355 = true;
			}

			if (field79 >= 724 && field79 <= 758 && field80 >= 466 && field80 < 502 && field408[13] != -1) {
				field479 = true;
				field428 = 13;
				field355 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method18(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method18(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method122() {
		try {
			int var1 = field548.field1395 + field251;
			int var2 = field548.field1396 + field520;
			if (field278 - var1 < -500 || field278 - var1 > 500 || field279 - var2 < -500 || field279 - var2 > 500) {
				field278 = var1;
				field279 = var2;
			}

			if (field278 != var1) {
				field278 += (var1 - field278) / 16;
			}

			if (field279 != var2) {
				field279 += (var2 - field279) / 16;
			}

			if (field82[1] == 1) {
				field406 += (-field406 - 24) / 2;
			} else if (field82[2] == 1) {
				field406 += (24 - field406) / 2;
			} else {
				field406 /= 2;
			}

			if (field82[3] == 1) {
				field407 += (12 - field407) / 2;
			} else if (field82[4] == 1) {
				field407 += (-field407 - 12) / 2;
			} else {
				field407 /= 2;
			}

			field405 = field406 / 2 + field405 & 0x7FF;
			field404 += field407 / 2;
			if (field404 < 128) {
				field404 = 128;
			}

			if (field404 > 383) {
				field404 = 383;
			}

			field585++;
			if (field585 > 1325) {
				field585 = 0;
				field242.method452(179);
				field242.method453(0);
				int var3 = field242.field1139;
				field242.method453(35);
				field242.method453((int) (Math.random() * 256.0D));
				field242.method453(196);

				if ((int) (Math.random() * 2.0D) == 0) {
					field242.method454(30057);
				}

				field242.method453((int) (Math.random() * 256.0D));
				field242.method453(169);
				field242.method453(79);
				field242.method454(4451);
				field242.method453((int) (Math.random() * 256.0D));
				field242.method454((int) (Math.random() * 65536.0D));
				field242.method462(field242.field1139 - var3);
			}

			int var4 = field278 >> 7;
			int var5 = field279 >> 7;
			int var6 = method171(field279, field278, field580);
			int var7 = 0;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
						int var10 = field580;
						if (var10 < 3 && (field433[1][var8][var9] & 0x2) == 2) {
							var10++;
						}

						int var11 = var6 - field293[var10][var8][var9];
						if (var11 > var7) {
							var7 = var11;
						}
					}
				}
			}

			field391++;
			if (field391 > 1740) {
				field391 = 0;
				field242.method452(151);
				field242.method453(0);
				int var12 = field242.field1139;
				field242.method454((int) (Math.random() * 65536.0D));
				field242.method453((int) (Math.random() * 256.0D));
				field242.method453(221);
				field242.method454(43379);

				if ((int) (Math.random() * 2.0D) == 0) {
					field242.method453(34);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field242.method453(189);
				}

				field242.method453(39);
				field242.method454(4392);
				field242.method454(13877);
				field242.method453((int) (Math.random() * 256.0D));
				field242.method462(field242.field1139 - var12);
			}

			int var13 = var7 * 192;
			if (var13 > 98048) {
				var13 = 98048;
			}

			if (var13 < 32768) {
				var13 = 32768;
			}

			if (var13 > field504) {
				field504 += (var13 - field504) / 24;
			} else if (var13 < field504) {
				field504 += (var13 - field504) / 80;
			}
		} catch (Exception var14) {
			signlink.reporterror("glfc_ex " + field548.field1395 + "," + field548.field1396 + "," + field278 + "," + field279 + "," + field393 + "," + field394 + "," + field567 + "," + field568);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method123() {
		field242.method452(61);

		if (field246 != -1) {
			method90(field246);
			field246 = -1;
			field479 = true;
			field304 = false;
			field355 = true;
		}

		if (field523 != -1) {
			method90(field523);
			field523 = -1;
			field248 = true;
			field304 = false;
		}

		if (field357 != -1) {
			method90(field357);
			field357 = -1;
			field617 = true;
		}

		if (field403 != -1) {
			method90(field403);
			field403 = -1;
		}

		if (field239 != -1) {
			method90(field239);
			field239 = -1;
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method124(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method125() {
		if (field65 == null) {
			method104();
			field464 = null;
			field465 = null;
			field466 = null;
			field467 = null;
			field468 = null;
			field469 = null;
			field470 = null;
			field471 = null;
			field472 = null;
			field449 = null;
			field447 = null;
			field446 = null;
			field448 = null;
			field215 = null;
			field216 = null;
			field217 = null;
			field65 = new NMOELDRY(503, 765, method17());
			field617 = true;
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method126(long arg0) {
		if (arg0 != 0L) {
			if (field608 >= 100) {
				method184(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = CSEYUXAS.method220(CSEYUXAS.method217(arg0));
				for (int var4 = 0; var4 < field608; var4++) {
					if (field302[var4] == arg0) {
						method184(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field434; var5++) {
					if (field443[var5] == arg0) {
						method184(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field302[field608++] = arg0;
				field479 = true;
				field242.method452(190);
				field242.method459(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IBIILISLZFAII;)V")
	public final void method127(int arg0, int arg1, int arg2, ISLZFAII arg3) {
		if (field548 != arg3 && field232 < 400) {
			String var5;
			if (arg3.field1027 == 0) {
				var5 = arg3.field1039 + method142(field548.field1026, arg3.field1026) + " (level-" + arg3.field1026 + ")";
			} else {
				var5 = arg3.field1039 + " (skill-" + arg3.field1027 + ")";
			}

			if (field376 == 1) {
				field388[field232] = "Use " + field380 + " with @whi@" + var5;
				field323[field232] = 996;
				field324[field232] = arg2;
				field321[field232] = arg1;
				field322[field232] = arg0;
				field232++;
			} else if (field259 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field563[var6] != null) {
						field388[field232] = field563[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field563[var6].equalsIgnoreCase("attack")) {
							if (arg3.field1026 > field548.field1026) {
								var7 = 2000;
							}

							if (field548.field1036 != 0 && arg3.field1036 != 0) {
								if (field548.field1036 == arg3.field1036) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field564[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field323[field232] = var7 + 600;
						}

						if (var6 == 1) {
							field323[field232] = var7 + 754;
						}

						if (var6 == 2) {
							field323[field232] = var7 + 691;
						}

						if (var6 == 3) {
							field323[field232] = var7 + 913;
						}

						if (var6 == 4) {
							field323[field232] = var7 + 71;
						}

						field324[field232] = arg2;
						field321[field232] = arg1;
						field322[field232] = arg0;
						field232++;
					}
				}
			} else if ((field261 & 0x8) == 8) {
				field388[field232] = field262 + " @whi@" + var5;
				field323[field232] = 40;
				field324[field232] = arg2;
				field321[field232] = arg1;
				field322[field232] = arg0;
				field232++;
			}

			for (int var8 = 0; var8 < field232; var8++) {
				if (field323[var8] == 277) {
					field388[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LGMYKUSOM;Z)V")
	public final void method128(GMYKUSOM arg0) {
		int var2 = arg0.field899;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field435 == 0) {
				arg0.field897 = "Loading friend list";
				arg0.field880 = 0;
			} else if (var2 == 1 && field435 == 1) {
				arg0.field897 = "Connecting to friendserver";
				arg0.field880 = 0;
			} else if (var2 == 2 && field435 != 2) {
				arg0.field897 = "Please wait...";
				arg0.field880 = 0;
			} else {
				int var3 = field434;
				if (field435 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field897 = "";
					arg0.field880 = 0;
				} else {
					arg0.field897 = field539[var2];
					arg0.field880 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field434;
			if (field435 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field897 = "";
				arg0.field880 = 0;
			} else {
				if (field505[var2] == 0) {
					arg0.field897 = "@red@Offline";
				} else if (field505[var2] < 200) {
					if (field505[var2] == field485) {
						arg0.field897 = "@gre@World-" + (field505[var2] - 9);
					} else {
						arg0.field897 = "@yel@World-" + (field505[var2] - 9);
					}
				} else if (field505[var2] == field485) {
					arg0.field897 = "@gre@Classic" + (field505[var2] - 219);
				} else {
					arg0.field897 = "@yel@Classic" + (field505[var2] - 219);
				}

				arg0.field880 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field434;
			if (field435 != 2) {
				var5 = 0;
			}

			arg0.field882 = var5 * 15 + 20;
			if (arg0.field882 <= arg0.field860) {
				arg0.field882 = arg0.field860 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field435 == 0) {
				arg0.field897 = "Loading ignore list";
				arg0.field880 = 0;
			} else if (var2 == 1 && field435 == 0) {
				arg0.field897 = "Please wait...";
				arg0.field880 = 0;
			} else {
				int var6 = field608;
				if (field435 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field897 = "";
					arg0.field880 = 0;
				} else {
					arg0.field897 = CSEYUXAS.method220(CSEYUXAS.method217(field302[var2]));
					arg0.field880 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field882 = field608 * 15 + 20;
			if (arg0.field882 <= arg0.field860) {
				arg0.field882 = arg0.field860 + 1;
			}
		} else if (var2 == 327) {
			arg0.field870 = 150;
			arg0.field871 = (int) (Math.sin(field211 / 40.0D) * 256.0D) & 0x7FF;

			if (field409) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field202[var7];
					if (var8 >= 0 && !BGEILVDT.field100[var8].method22()) {
						return;
					}
				}

				field409 = false;
				LSSDQDBV[] var9 = new LSSDQDBV[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field202[var11];
					if (var12 >= 0) {
						var9[var10++] = BGEILVDT.field100[var12].method23();
					}
				}

				LSSDQDBV var13 = new LSSDQDBV(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field201[var14] != 0) {
						var13.method437(field458[var14][0], field458[var14][field201[var14]]);

						if (var14 == 1) {
							var13.method437(field506[0], field506[field201[var14]]);
						}
					}
				}

				var13.method430();
				var13.method431(WOTIAWQC.field1470[field548.field1403].field1472[0]);
				var13.method440(64, 850, -30, -50, -30, true);
				arg0.field858 = 5;
				arg0.field859 = 0;
				GMYKUSOM.method342(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field343 == null) {
				field343 = arg0.field849;
				field344 = arg0.field863;
			}

			if (field213) {
				arg0.field849 = field344;
			} else {
				arg0.field849 = field343;
			}
		} else if (var2 == 325) {
			if (field343 == null) {
				field343 = arg0.field849;
				field344 = arg0.field863;
			}

			if (field213) {
				arg0.field849 = field343;
			} else {
				arg0.field849 = field344;
			}
		} else if (var2 == 600) {
			arg0.field897 = field295;
			if (field211 % 20 < 10) {
				arg0.field897 = arg0.field897 + "|";
			} else {
				arg0.field897 = arg0.field897 + " ";
			}
		} else if (var2 == 620) {
			if (field180 < 1) {
				arg0.field897 = "";
			} else if (field392) {
				arg0.field853 = 0xFF0000;
				arg0.field897 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field853 = 0xFFFFFF;
				arg0.field897 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field298 - field249;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field897 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field450 == 0) {
				arg0.field897 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field450 <= field298) {
				arg0.field897 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method129(field450);
			} else {
				int var17 = field298 + 14 - field450;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field897 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method129(field450) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field340 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field340 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field340 + " unread messages";
			}

			arg0.field897 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field361 > 0 && field361 <= field298 + 10) {
				arg0.field897 = "Last password change:\\n@gre@" + method129(field361);
			} else {
				arg0.field897 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 664) {
			if (field431 == 0) {
				arg0.field897 = "You have not yet set\\nany contact details.";
			}

			if (field431 == 1) {
				arg0.field897 = "Contact Details Last Set:\\n@gre@" + method129(field473);
			}

			if (field431 == 2) {
				arg0.field897 = "You need to set\\nnew contact details.";
			}
		} else if (var2 == 665) {
			if (field185 > 2 && !field487) {
				arg0.field897 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field185 > 2) {
				arg0.field897 = "\\n\\nYou have @gre@" + field185 + "@yel@ days of\\nmember credit remaining.";
			} else if (field185 > 0) {
				arg0.field897 = "You have @gre@" + field185 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field897 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field185 > 2 && !field487) {
				arg0.field897 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field185 > 0) {
				arg0.field897 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field897 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field450 > field298) {
				arg0.field897 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field897 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public final String method129(int arg0) {
		if (arg0 > field298 + 10) {
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

	@ObfuscatedName("client.r(I)V")
	public final void method130() {
		if (field547 != 0) {
			FUOSCRKP var1 = field412;
			int var2 = 0;
			if (field364 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field275[var3] != null) {
					int var4 = field273[var3];
					String var5 = field274[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field601 == 0 || field601 == 1 && method195(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method314(var7, "From", var8, 0);
						var1.method314(var7 - 1, "From", var8, 0xFFFF);
						int var11 = var8 + var1.method312("From ");
						if (var6 == 1) {
							field356[0].method589(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field356[1].method589(var11, var7 - 12);
							var11 += 14;
						}

						var1.method314(var7, var5 + ": " + field275[var3], var11, 0);
						var1.method314(var7 - 1, var5 + ": " + field275[var3], var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field601 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method314(var9, field275[var3], 4, 0);
						var1.method314(var9 - 1, field275[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field601 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method314(var10, "To " + var5 + ": " + field275[var3], 4, 0);
						var1.method314(var10 - 1, "To " + var5 + ": " + field275[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method131() {
		if (field376 == 0 && field259 == 0) {
			field388[field232] = "Walk here";
			field323[field232] = 277;
			field321[field232] = field72;
			field322[field232] = field73;
			field232++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < LSSDQDBV.field1125; var2++) {
			int var3 = LSSDQDBV.field1126[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field320.method57(field580, var4, var5, var3) >= 0) {
					OEPVRTCC var8 = OEPVRTCC.method522(var7);
					if (var8.field1250 != null) {
						var8 = var8.method515();
					}

					if (var8 == null) {
						continue;
					}

					if (field376 == 1) {
						field388[field232] = "Use " + field380 + " with @cya@" + var8.field1242;
						field323[field232] = 413;
						field324[field232] = var3;
						field321[field232] = var4;
						field322[field232] = var5;
						field232++;
					} else if (field259 != 1) {
						if (var8.field1231 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1231[var9] != null) {
									field388[field232] = var8.field1231[var9] + " @cya@" + var8.field1242;

									if (var9 == 0) {
										field323[field232] = 396;
									}

									if (var9 == 1) {
										field323[field232] = 683;
									}

									if (var9 == 2) {
										field323[field232] = 978;
									}

									if (var9 == 3) {
										field323[field232] = 835;
									}

									if (var9 == 4) {
										field323[field232] = 1002;
									}

									field324[field232] = var3;
									field321[field232] = var4;
									field322[field232] = var5;
									field232++;
								}
							}
						}

						field388[field232] = "Examine @cya@" + var8.field1242;
						field323[field232] = 1028;
						field324[field232] = var8.field1223 << 14;
						field321[field232] = var4;
						field322[field232] = var5;
						field232++;
					} else if ((field261 & 0x4) == 4) {
						field388[field232] = field262 + " @cya@" + var8.field1242;
						field323[field232] = 687;
						field324[field232] = var3;
						field321[field232] = var4;
						field322[field232] = var5;
						field232++;
					}
				}

				if (var6 == 1) {
					XQNGYHCW var10 = field544[var7];
					if (var10.field1494.field652 == 1 && (var10.field1395 & 0x7F) == 0x40 && (var10.field1396 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field545; var11++) {
							XQNGYHCW var12 = field544[field546[var11]];
							if (var12 != null && var10 != var12 && var12.field1494.field652 == 1 && var10.field1395 == var12.field1395 && var10.field1396 == var12.field1396) {
								method186(field546[var11], var12.field1494, var4, var5);
							}
						}

						for (int var13 = 0; var13 < field575; var13++) {
							ISLZFAII var14 = field574[field576[var13]];
							if (var14 != null && var10.field1395 == var14.field1395 && var10.field1396 == var14.field1396) {
								method127(var5, var4, field576[var13], var14);
							}
						}
					}

					method186(var7, var10.field1494, var4, var5);
				}

				if (var6 == 0) {
					ISLZFAII var15 = field574[var7];
					if ((var15.field1395 & 0x7F) == 0x40 && (var15.field1396 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field545; var16++) {
							XQNGYHCW var17 = field544[field546[var16]];
							if (var17 != null && var17.field1494.field652 == 1 && var15.field1395 == var17.field1395 && var15.field1396 == var17.field1396) {
								method186(field546[var16], var17.field1494, var4, var5);
							}
						}

						for (int var18 = 0; var18 < field575; var18++) {
							ISLZFAII var19 = field574[field576[var18]];
							if (var19 != null && var15 != var19 && var15.field1395 == var19.field1395 && var15.field1396 == var19.field1396) {
								method127(var5, var4, field576[var18], var19);
							}
						}
					}

					method127(var5, var4, var7, var15);
				}

				if (var6 == 3) {
					JSAXNSIH var20 = field305[field580][var4][var5];
					if (var20 != null) {
						for (FEZCJZIH var21 = (FEZCJZIH) var20.method403(); var21 != null; var21 = (FEZCJZIH) var20.method405()) {
							HHBFOKVP var22 = HHBFOKVP.method367(var21.field755);
							if (field376 == 1) {
								field388[field232] = "Use " + field380 + " with @lre@" + var22.field956;
								field323[field232] = 734;
								field324[field232] = var21.field755;
								field321[field232] = var4;
								field322[field232] = var5;
								field232++;
							} else if (field259 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field963 != null && var22.field963[var23] != null) {
										field388[field232] = var22.field963[var23] + " @lre@" + var22.field956;

										if (var23 == 0) {
											field323[field232] = 426;
										}

										if (var23 == 1) {
											field323[field232] = 168;
										}

										if (var23 == 2) {
											field323[field232] = 725;
										}

										if (var23 == 3) {
											field323[field232] = 257;
										}

										if (var23 == 4) {
											field323[field232] = 288;
										}

										field324[field232] = var21.field755;
										field321[field232] = var4;
										field322[field232] = var5;
										field232++;
									} else if (var23 == 2) {
										field388[field232] = "Take @lre@" + var22.field956;
										field323[field232] = 725;
										field324[field232] = var21.field755;
										field321[field232] = var4;
										field322[field232] = var5;
										field232++;
									}
								}

								field388[field232] = "Examine @lre@" + var22.field956;
								field323[field232] = 1353;
								field324[field232] = var21.field755;
								field321[field232] = var4;
								field322[field232] = var5;
								field232++;
							} else if ((field261 & 0x1) == 1) {
								field388[field232] = field262 + " @lre@" + var22.field956;
								field323[field232] = 5;
								field324[field232] = var21.field755;
								field321[field232] = var4;
								field322[field232] = var5;
								field232++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZLLZWRHABP;)V")
	public final void method132(int arg0, LZWRHABP arg1) {
		arg1.method473();
		int var3 = arg1.method474(8);
		if (var3 < field545) {
			for (int var4 = var3; var4 < field545; var4++) {
				field300[field299++] = field546[var4];
			}
		}

		if (var3 > field545) {
			signlink.reporterror(field316 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field545 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field546[var5];
			XQNGYHCW var7 = field544[var6];
			int var8 = arg1.method474(1);
			if (var8 == 0) {
				field546[field545++] = var6;
				var7.field1410 = field211;
			} else {
				int var9 = arg1.method474(2);
				if (var9 == 0) {
					field546[field545++] = var6;
					var7.field1410 = field211;
					field578[field577++] = var6;
				} else if (var9 == 1) {
					field546[field545++] = var6;
					var7.field1410 = field211;
					int var10 = arg1.method474(3);
					var7.method576(false, var10);
					int var11 = arg1.method474(1);
					if (var11 == 1) {
						field578[field577++] = var6;
					}
				} else if (var9 == 2) {
					field546[field545++] = var6;
					var7.field1410 = field211;
					int var12 = arg1.method474(3);
					var7.method576(true, var12);
					int var13 = arg1.method474(3);
					var7.method576(true, var13);
					int var14 = arg1.method474(1);
					if (var14 == 1) {
						field578[field577++] = var6;
					}
				} else if (var9 == 3) {
					field300[field299++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;IILjava/lang/String;I)LSRZUEVOD;")
	public final SRZUEVOD method133(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field374[0] != null) {
				var6 = field374[0].method1(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field400.reset();
			field400.update(var6);
			int var8 = (int) field400.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new SRZUEVOD(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method19(arg1, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method188(arg0 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				LZWRHABP var16 = new LZWRHABP(var15);
				var16.field1139 = 3;
				int var17 = var16.method467() + 6;
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
						method19(arg1, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field374[0] != null) {
						field374[0].method2(arg4, var6, var6.length);
					}
				} catch (Exception var28) {
					field374[0] = null;
				}

				if (var6 != null) {
					field400.reset();
					field400.update(var6);
					int var23 = (int) field400.getValue();
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
						method19(arg1, "Game updated - please reload page");
						var25 = 10;
					} else {
						method19(arg1, var11 + " - Retrying in " + var25);
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

				field463 = !field463;
			}
		}

		return new SRZUEVOD(var6);
	}

	@ObfuscatedName("client.c(B)Ljava/lang/String;")
	public final String method134() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field67 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIILGMYKUSOM;IBIII)V")
	public final void method135(int arg0, int arg1, int arg2, GMYKUSOM arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field610) {
			field441 = 32;
		} else {
			field441 = 0;
		}

		field610 = false;
		if (arg6 >= arg2 && arg6 < arg2 + 16 && arg4 >= arg1 && arg4 < arg1 + 16) {
			arg3.field905 -= field307 * 4;

			if (arg5 == 1) {
				field479 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field248 = true;
			}
		} else if (arg6 >= arg2 && arg6 < arg2 + 16 && arg4 >= arg0 + arg1 - 16 && arg4 < arg0 + arg1) {
			arg3.field905 += field307 * 4;

			if (arg5 == 1) {
				field479 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field248 = true;
			}
		} else if (arg6 >= arg2 - field441 && arg6 < arg2 + field441 + 16 && arg4 >= arg1 + 16 && arg4 < arg0 + arg1 - 16 && field307 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg1 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg3.field905 = (arg7 - arg0) * var10 / var11;

			if (arg5 == 1) {
				field479 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field248 = true;
			}

			field610 = true;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method136() {
		if (field488 && field474 == 2 && QQKEKZOD.field1307 != field580) {
			method87(null, "Loading - please wait.");
			field474 = 1;
			field401 = System.currentTimeMillis();
		}

		if (field474 == 1) {
			int var1 = method137();
			if (var1 != 0 && System.currentTimeMillis() - field401 > 360000L) {
				signlink.reporterror(field316 + " glcfb " + field419 + "," + var1 + "," + field488 + "," + field374[0] + "," + field359.method289() + "," + field580 + "," + field393 + "," + field394);
				field401 = System.currentTimeMillis();
			}
		}

		if (field474 == 2 && field580 != field183) {
			field183 = field580;
			method183(field580);
		}
	}

	@ObfuscatedName("client.t(I)I")
	public final int method137() {
		for (int var1 = 0; var1 < field342.length; var1++) {
			if (field342[var1] == null && field288[var1] != -1) {
				return -1;
			}

			if (field565[var1] == null && field289[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field342.length; var3++) {
			byte[] var4 = field565[var3];
			if (var4 != null) {
				int var5 = (field287[var3] >> 8) * 64 - field567;
				int var6 = (field287[var3] & 0xFF) * 64 - field568;
				if (field455) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= QQKEKZOD.method553(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field179) {
			return -4;
		} else {
			field474 = 2;
			QQKEKZOD.field1307 = field580;
			method205();
			field242.method452(146);
			return 0;
		}
	}

	@ObfuscatedName("client.a(BIZ)V")
	public final void method138(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(LLZWRHABP;BI)V")
	public final void method139(LZWRHABP arg0, int arg1) {
		while (arg0.field1140 + 21 < arg1 * 8) {
			int var3 = arg0.method474(14);
			if (var3 == 16383) {
				break;
			}

			if (field544[var3] == null) {
				field544[var3] = new XQNGYHCW();
			}

			XQNGYHCW var4 = field544[var3];
			field546[field545++] = var3;
			var4.field1410 = field211;
			int var5 = arg0.method474(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method474(1);
			var4.field1494 = DUHKBPRV.method242(arg0.method474(12));
			int var7 = arg0.method474(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method474(1);
			if (var8 == 1) {
				field578[field577++] = var3;
			}

			var4.field1423 = var4.field1494.field652;
			var4.field1422 = var4.field1494.field669;
			var4.field1377 = var4.field1494.field666;
			var4.field1378 = var4.field1494.field679;
			var4.field1379 = var4.field1494.field662;
			var4.field1380 = var4.field1494.field680;
			var4.field1403 = var4.field1494.field655;
			var4.method575(field548.field1399[0] + var7, var6 == 1, field548.field1398[0] + var5);
		}

		arg0.method475();
	}

	@ObfuscatedName("client.a(LINRTBCYJ;IIB)V")
	public final void method140(INRTBCYJ arg0, int arg1, int arg2) {
		int var4 = field511 + field405 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = LSSDQDBV.field1127[var4];
			int var7 = LSSDQDBV.field1128[var4];
			var6 = var6 * 256 / (field263 + 256);
			var7 = var7 * 256 / (field263 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method393(var8 + 94 + 4 - arg0.field1016 / 2, 83 - var9 - arg0.field1017 / 2 - 4, field196);
			} else {
				arg0.method387(var8 + 94 + 4 - arg0.field1016 / 2, 83 - var9 - arg0.field1017 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method13() {
		if (!field204 && !field440 && !field243) {
			field211++;

			if (field477) {
				method158();
			} else {
				method150();
			}

			method212();
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method141(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field434; var3++) {
				if (field443[var3] == arg0) {
					field434--;
					field479 = true;

					for (int var4 = var3; var4 < field434; var4++) {
						field539[var4] = field539[var4 + 1];
						field505[var4] = field505[var4 + 1];
						field443[var4] = field443[var4 + 1];
					}

					field242.method452(231);
					field242.method459(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method142(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(ILXRUIQOVM;)V")
	public final void method143(XRUIQOVM arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field338.length; var3++) {
			field338[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field338[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field339[var9] = (field338[var9 - 1] + field338[var9 + 1] + field338[var9 - 128] + field338[var9 + 128]) / 4;
				}
			}

			int[] var10 = field338;
			field338 = field339;
			field339 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1498; var12++) {
				for (int var13 = 0; var13 < arg0.field1497; var13++) {
					if (arg0.field1495[var11++] != 0) {
						int var14 = var13 + arg0.field1499 + 16;
						int var15 = var12 + arg0.field1500 + 16;
						int var16 = (var15 << 7) + var14;
						field338[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method144() {
		field449.method509();
		GAGDRMEJ.field815 = field223;
		field197.method589(0, 0);

		if (field365) {
			field413.method310(239, 40, 0, field363);
			field413.method310(239, 60, 128, field214 + "*");
		} else if (field489 == 1) {
			field413.method310(239, 40, 0, "Enter amount:");
			field413.method310(239, 60, 128, field354 + "*");
		} else if (field489 == 2) {
			field413.method310(239, 40, 0, "Enter name:");
			field413.method310(239, 60, 128, field354 + "*");
		} else if (field326 != null) {
			field413.method310(239, 40, 0, field326);
			field413.method310(239, 60, 128, "Click to continue");
		} else if (field523 != -1) {
			method85(0, GMYKUSOM.method350(field523), 0, 0);
		} else if (field510 == -1) {
			FUOSCRKP var1 = field412;
			int var2 = 0;
			CYEOWDOP.method226(463, 0, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field275[var3] != null) {
					int var4 = field273[var3];
					int var5 = field507 + 70 - var2 * 14;
					String var6 = field274[var3];
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
							var1.method314(var5, field275[var3], 4, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field503 == 0 || field503 == 1 && method195(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field356[0].method589(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field356[1].method589(var8, var5 - 12);
								var8 += 14;
							}

							var1.method314(var5, var6 + ":", var8, 0);
							var8 += var1.method312(var6) + 8;
							var1.method314(var5, field275[var3], var8, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field547 == 0 && (var4 == 7 || field601 == 0 || field601 == 1 && method195(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method314(var5, "From", var9, 0);
							int var11 = var9 + var1.method312("From ");
							if (var7 == 1) {
								field356[0].method589(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field356[1].method589(var11, var5 - 12);
								var11 += 14;
							}

							var1.method314(var5, var6 + ":", var11, 0);
							var11 += var1.method312(var6) + 8;
							var1.method314(var5, field275[var3], var11, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field387 == 0 || field387 == 1 && method195(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method314(var5, var6 + " " + field275[var3], 4, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field547 == 0 && field601 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method314(var5, field275[var3], 4, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field547 == 0 && field601 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method314(var5, "To " + var6 + ":", 4, 0);
							var1.method314(var5, field275[var3], var1.method312("To " + var6) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field387 == 0 || field387 == 1 && method195(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method314(var5, var6 + " " + field275[var3], 4, 0x7E3200);
						}

						var2++;
					}
				}
			}

			CYEOWDOP.method225();
			field227 = var2 * 14 + 7;
			if (field227 < 78) {
				field227 = 78;
			}

			method155(field227 - field507 - 77, 77, field227, 463, 0);
			String var10;
			if (field548 == null || field548.field1039 == null) {
				var10 = CSEYUXAS.method220(field316);
			} else {
				var10 = field548.field1039;
			}

			var1.method314(90, var10 + ":", 4, 0);
			var1.method314(90, field436 + "*", var1.method312(var10 + ": ") + 6, 255);
			CYEOWDOP.method232(0, 479, 0, 77);
		} else {
			method85(0, GMYKUSOM.method350(field510), 0, 0);
		}

		if (field444 && field480 == 2) {
			method196();
		}

		field449.method510(17, 357, field64);
		field448.method509();
		GAGDRMEJ.field815 = field225;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method145() {
		if (field208 == 0) {
			int var1 = field78;
			if (field259 == 1 && field79 >= 516 && field80 >= 160 && field79 <= 765 && field80 <= 205) {
				var1 = 0;
			}

			if (field444) {
				if (var1 != 1) {
					int var2 = field72;
					int var3 = field73;
					if (field480 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field480 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field480 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field481 - 10 || var2 > field483 + field481 + 10 || var3 < field482 - 10 || var3 > field484 + field482 + 10) {
						field444 = false;

						if (field480 == 1) {
							field479 = true;
						}

						if (field480 == 2) {
							field248 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field481;
					int var5 = field482;
					int var6 = field483;
					int var7 = field79;
					int var8 = field80;
					if (field480 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field480 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field480 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field232; var10++) {
						int var11 = (field232 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method156(var9);
					}

					field444 = false;

					if (field480 == 1) {
						field479 = true;
					}

					if (field480 == 2) {
						field248 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field232 > 0) {
					int var12 = field323[field232 - 1];
					if (var12 == 532 || var12 == 614 || var12 == 156 || var12 == 798 || var12 == 346 || var12 == 341 || var12 == 228 || var12 == 155 || var12 == 371 || var12 == 88 || var12 == 831 || var12 == 1753) {
						int var13 = field321[field232 - 1];
						int var14 = field322[field232 - 1];
						GMYKUSOM var15 = GMYKUSOM.method350(var14);
						if (var15.field854 || var15.field851) {
							field399 = false;
							field421 = 0;
							field206 = var14;
							field207 = var13;
							field208 = 2;
							field209 = field79;
							field210 = field80;

							if (GMYKUSOM.method350(var14).field850 == field239) {
								field208 = 1;
							}

							if (GMYKUSOM.method350(var14).field850 == field523) {
								field208 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field424 == 1 || method157(field232 - 1)) && field232 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field232 > 0) {
					method156(field232 - 1);
				}

				if (var1 != 2 || field232 <= 0) {
					return;
				}

				method177();
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method146() {
		if (field232 >= 2 || field376 != 0 || field259 != 0) {
			String var1;
			if (field376 == 1 && field232 < 2) {
				var1 = "Use " + field380 + " with...";
			} else if (field259 == 1 && field232 < 2) {
				var1 = field262 + "...";
			} else {
				var1 = field388[field232 - 1];
			}

			if (field232 > 2) {
				var1 = var1 + "@whi@ / " + (field232 - 2) + " more options";
			}

			field413.method319(var1, 4, 0xFFFFFF, true, field211 / 1000, 15);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method147() {
		short var1 = 256;

		if (field588 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field588 > 768) {
					field382[var2] = method213(1024 - field588, field384[var2], field383[var2]);
				} else if (field588 > 256) {
					field382[var2] = field384[var2];
				} else {
					field382[var2] = method213(256 - field588, field383[var2], field384[var2]);
				}
			}
		} else if (field589 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field589 > 768) {
					field382[var3] = method213(1024 - field589, field385[var3], field383[var3]);
				} else if (field589 > 256) {
					field382[var3] = field385[var3];
				} else {
					field382[var3] = method213(256 - field589, field383[var3], field385[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field382[var4] = field383[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field467.field1196[var5] = field560.field1011[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field540[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field221[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field382[var12];
					int var15 = field467.field1196[var7];
					field467.field1196[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field467.method510(0, 0, field64);

		for (int var16 = 0; var16 < 33920; var16++) {
			field468.field1196[var16] = field561.field1011[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field540[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field221[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field382[var23];
					int var26 = field468.field1196[var18];
					field468.field1196[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field468.method510(637, 0, field64);
	}

	@ObfuscatedName("client.x(I)V")
	public final void method148() {
		OEPVRTCC.field1235.method450();
		OEPVRTCC.field1210.method450();
		DUHKBPRV.field665.method450();
		HHBFOKVP.field961.method450();
		HHBFOKVP.field981.method450();
		ISLZFAII.field1023.method450();
		IMWZJOXU.field1004.method450();
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method149() {
		for (QNSFNRFM var1 = (QNSFNRFM) field508.method402(); var1 != null; var1 = (QNSFNRFM) field508.method404()) {
			if (field580 != var1.field1274 || field211 > var1.field1286) {
				var1.method579();
			} else if (field211 >= var1.field1285) {
				if (var1.field1273 > 0) {
					XQNGYHCW var2 = field544[var1.field1273 - 1];
					if (var2 != null && var2.field1395 >= 0 && var2.field1395 < 13312 && var2.field1396 >= 0 && var2.field1396 < 13312) {
						var1.method538(field211, method171(var2.field1396, var2.field1395, var1.field1274) - var1.field1284, var2.field1396, var2.field1395);
					}
				}

				if (var1.field1273 < 0) {
					int var3 = -var1.field1273 - 1;
					ISLZFAII var4;
					if (field303 == var3) {
						var4 = field548;
					} else {
						var4 = field574[var3];
					}

					if (var4 != null && var4.field1395 >= 0 && var4.field1395 < 13312 && var4.field1396 >= 0 && var4.field1396 < 13312) {
						var1.method538(field211, method171(var4.field1396, var4.field1395, var1.field1274) - var1.field1284, var4.field1396, var4.field1395);
					}
				}

				var1.method537(field536);
				field320.method38((int) var1.field1278, 60, false, var1, (int) var1.field1280, var1.field1287, field580, (int) var1.field1279, -1);
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method150() {
		if (field417 == 0) {
			int var1 = field62 / 2 - 80;
			int var2 = field63 / 2 + 20;
			var2 += 20;
			if (field78 == 1 && field79 >= var1 - 75 && field79 <= var1 + 75 && field80 >= var2 - 20 && field80 <= var2 + 20) {
				field417 = 3;
				field620 = 0;
			}

			int var3 = field62 / 2 + 80;
			if (field78 == 1 && field79 >= var3 - 75 && field79 <= var3 + 75 && field80 >= var2 - 20 && field80 <= var2 + 20) {
				field554 = "";
				field555 = "Enter your username & password.";
				field417 = 2;
				field620 = 0;
			}
		} else if (field417 == 2) {
			int var4 = field63 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field78 == 1 && field80 >= var4 - 15 && field80 < var4) {
				field620 = 0;
			}

			var4 += 15;
			if (field78 == 1 && field80 >= var4 - 15 && field80 < var4) {
				field620 = 1;
			}

			var4 += 15;
			int var5 = field62 / 2 - 80;
			int var6 = field63 / 2 + 50;
			var6 += 20;
			if (field78 == 1 && field79 >= var5 - 75 && field79 <= var5 + 75 && field80 >= var6 - 20 && field80 <= var6 + 20) {
				field415 = 0;
				method83(field316, field317, false);

				if (field477) {
					return;
				}
			}

			int var7 = field62 / 2 + 80;
			if (field78 == 1 && field79 >= var7 - 75 && field79 <= var7 + 75 && field80 >= var6 - 20 && field80 <= var6 + 20) {
				field417 = 0;
				field316 = "";
				field317 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method11();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field254.length(); var10++) {
					if (var8 == field254.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field620 == 0) {
					if (var8 == 8 && field316.length() > 0) {
						field316 = field316.substring(0, field316.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field620 = 1;
					}

					if (var9) {
						field316 = field316 + (char) var8;
					}

					if (field316.length() > 12) {
						field316 = field316.substring(0, 12);
					}
				} else if (field620 == 1) {
					if (var8 == 8 && field317.length() > 0) {
						field317 = field317.substring(0, field317.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field620 = 0;
					}

					if (var9) {
						field317 = field317 + (char) var8;
					}

					if (field317.length() > 20) {
						field317 = field317.substring(0, 20);
					}
				}
			}
		} else if (field417 == 3) {
			int var11 = field62 / 2;
			int var12 = field63 / 2 + 50;
			var12 += 20;
			if (field78 == 1 && field79 >= var11 - 75 && field79 <= var11 + 75 && field80 >= var12 - 20 && field80 <= var12 + 20) {
				field417 = 0;
				return;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field67 != null) {
				return new URL("http://127.0.0.1:" + (field486 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		WGYERDQO var10 = null;
		for (WGYERDQO var11 = (WGYERDQO) field368.method402(); var11 != null; var11 = (WGYERDQO) field368.method404()) {
			if (var11.field1464 == arg6 && var11.field1466 == arg8 && var11.field1467 == arg7 && var11.field1465 == arg5) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new WGYERDQO();
			var10.field1464 = arg6;
			var10.field1465 = arg5;
			var10.field1466 = arg8;
			var10.field1467 = arg7;
			method112(var10);
			field368.method399(var10);
		}

		var10.field1458 = arg0;
		var10.field1460 = arg2;
		var10.field1459 = arg3;
		var10.field1457 = arg1;
		var10.field1468 = arg4;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method152(String arg0) {
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

	@ObfuscatedName("client.z(I)V")
	public final void method153() {
		if (field265 == 0 && field78 == 1) {
			int var1 = field79 - 25 - 550;
			int var2 = field80 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field511 + field405 & 0x7FF;
				int var4 = GAGDRMEJ.field813[var3];
				int var5 = GAGDRMEJ.field814[var3];
				var4 = (field263 + 256) * var4 >> 8;
				var5 = (field263 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field548.field1395 + var6 >> 7;
				int var9 = field548.field1396 - var7 >> 7;
				boolean var10 = method93(var8, 0, field548.field1399[0], 0, field548.field1398[0], true, var9, 0, 0, 0, 1);
				if (var10) {
					field242.method453(var1);
					field242.method453(var2);
					field242.method454(field405);
					field242.method453(57);
					field242.method453(field511);
					field242.method453(field263);
					field242.method453(89);
					field242.method454(field548.field1395);
					field242.method454(field548.field1396);
					field242.method453(field390);
					field242.method453(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method154() {
		for (WGYERDQO var1 = (WGYERDQO) field368.method402(); var1 != null; var1 = (WGYERDQO) field368.method404()) {
			if (var1.field1468 == -1) {
				var1.field1457 = 0;
				method112(var1);
			} else {
				var1.method579();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field527.method589(arg3, arg4);
		field528.method589(arg3, arg1 + arg4 - 16);
		CYEOWDOP.method229(field199, 16, arg3, arg4 + 16, arg1 - 32);
		int var6 = (arg1 - 32) * arg1 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg0 / (arg2 - arg1);
		CYEOWDOP.method229(field451, 16, arg3, arg4 + var7 + 16, var6);
		CYEOWDOP.method234(arg4 + var7 + 16, arg3, var6, field559);
		CYEOWDOP.method234(arg4 + var7 + 16, arg3 + 1, var6, field559);
		CYEOWDOP.method232(field559, 16, arg3, arg4 + var7 + 16);
		CYEOWDOP.method232(field559, 16, arg3, arg4 + var7 + 17);
		CYEOWDOP.method234(arg4 + var7 + 16, arg3 + 15, var6, field614);
		CYEOWDOP.method234(arg4 + var7 + 17, arg3 + 14, var6 - 1, field614);
		CYEOWDOP.method232(field614, 16, arg3, arg4 + var7 + var6 + 15);
		CYEOWDOP.method232(field614, 15, arg3 + 1, arg4 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.d(II)V")
	public final void method156(int arg0) {
		if (arg0 >= 0) {
			if (field489 != 0) {
				field489 = 0;
				field248 = true;
			}

			int var2 = field321[arg0];
			int var3 = field322[arg0];
			int var4 = field323[arg0];
			int var5 = field324[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 154) {
				field242.method452(254);
				field242.method454(var3);
				field242.method489(field260);
				field242.method488(var2);
				field242.method488(var5);
				field602 = 0;
				field603 = var3;
				field604 = var2;
				field605 = 2;
				if (GMYKUSOM.method350(var3).field850 == field239) {
					field605 = 1;
				}

				if (GMYKUSOM.method350(var3).field850 == field523) {
					field605 = 3;
				}
			}

			if (var4 == 88) {
				field242.method452(223);
				field242.method490(var5);
				field242.method454(var3);
				field242.method454(var2);
				field602 = 0;
				field603 = var3;
				field604 = var2;
				field605 = 2;
				if (GMYKUSOM.method350(var3).field850 == field239) {
					field605 = 1;
				}

				if (GMYKUSOM.method350(var3).field850 == field523) {
					field605 = 3;
				}
			}

			if (var4 == 691) {
				ISLZFAII var6 = field574[var5];
				if (var6 != null) {
					method93(var6.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var6.field1399[0], 1, 0, 1, 2);
					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field242.method452(36);
					field242.method488(var5);
				}
			}

			if (var4 == 277) {
				if (field444) {
					field320.method65(var3 - 4, var2 - 4);
				} else {
					field320.method65(field80 - 4, field79 - 4);
				}
			}

			if (var4 == 168) {
				boolean var7 = method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 0, 0, 0, 2);
				if (!var7) {
					method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 1, 0, 1, 2);
				}

				field594 = field79;
				field595 = field80;
				field597 = 2;
				field596 = 0;
				field242.method452(203);
				field242.method454(var5);
				field242.method454(field567 + var2);
				field242.method489(field568 + var3);
			}

			if (var4 == 156) {
				field242.method452(4);
				field242.method454(var5);
				field242.method489(var3);
				field242.method489(var2);
				field602 = 0;
				field603 = var3;
				field604 = var2;
				field605 = 2;
				if (GMYKUSOM.method350(var3).field850 == field239) {
					field605 = 1;
				}

				if (GMYKUSOM.method350(var3).field850 == field523) {
					field605 = 3;
				}
			}

			if (var4 == 401) {
				XQNGYHCW var9 = field544[var5];
				if (var9 != null) {
					method93(var9.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var9.field1399[0], 1, 0, 1, 2);
					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field242.method452(56);
					field242.method488(field379);
					field242.method454(var5);
					field242.method454(field378);
					field242.method488(field377);
				}
			}

			if (var4 == 996) {
				ISLZFAII var10 = field574[var5];
				if (var10 != null) {
					method93(var10.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var10.field1399[0], 1, 0, 1, 2);
					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field242.method452(83);
					field242.method490(var5);
					field242.method454(field377);
					field242.method489(field379);
					field242.method488(field378);
				}
			}

			if (var4 == 460) {
				String var11 = field388[arg0];
				int var12 = var11.indexOf("@whi@");
				if (var12 != -1) {
					if (field239 == -1) {
						method123();
						field295 = var11.substring(var12 + 5).trim();
						field392 = false;
						field509 = field239 = GMYKUSOM.field868;
					} else {
						method184(0, "Please close the interface you have open before using 'report abuse'", "");
					}
				}
			}

			if (var4 == 1698) {
				XQNGYHCW var13 = field544[var5];
				if (var13 != null) {
					DUHKBPRV var14 = var13.field1494;
					if (var14.field671 != null) {
						var14 = var14.method237();
					}

					if (var14 != null) {
						String var15;
						if (var14.field675 == null) {
							var15 = "It's a " + var14.field649 + ".";
						} else {
							var15 = new String(var14.field675);
						}

						method184(0, var15, "");
					}
				}
			}

			if (var4 == 978) {
				method174(var5, var3, var2);
				field242.method452(121);
				field242.method489(field568 + var3);
				field242.method489(field567 + var2);
				field242.method489(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 754) {
				ISLZFAII var16 = field574[var5];
				if (var16 != null) {
					method93(var16.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var16.field1399[0], 1, 0, 1, 2);
					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field242.method452(195);
					field242.method490(var5);
				}
			}

			if (var4 == 571 || var4 == 766 || var4 == 293 || var4 == 997) {
				String var17 = field388[arg0];
				int var18 = var17.indexOf("@whi@");
				if (var18 != -1) {
					long var19 = CSEYUXAS.method216(var17.substring(var18 + 5).trim());
					if (var4 == 571) {
						method209(var19);
					}

					if (var4 == 766) {
						method126(var19);
					}

					if (var4 == 293) {
						method141(var19);
					}

					if (var4 == 997) {
						method189(var19);
					}
				}
			}

			if (var4 == 683) {
				field389++;
				if (field389 >= 69) {
					field242.method452(140);
					field242.method453(17);
					field389 = 0;
				}

				method174(var5, var3, var2);
				field242.method452(150);
				field242.method454(var5 >> 14 & 0x7FFF);
				field242.method490(field568 + var3);
				field242.method488(field567 + var2);
			}

			if (var4 == 913) {
				ISLZFAII var21 = field574[var5];
				if (var21 != null) {
					method93(var21.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var21.field1399[0], 1, 0, 1, 2);
					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field242.method452(191);
					field242.method488(var5);
				}
			}

			if (var4 == 371) {
				field292 += var3;
				if (field292 >= 92) {
					field242.method452(6);
					field242.method453(224);
					field292 = 0;
				}

				field242.method452(163);
				field242.method490(var3);
				field242.method488(var5);
				field242.method490(var2);
				field602 = 0;
				field603 = var3;
				field604 = var2;
				field605 = 2;
				if (GMYKUSOM.method350(var3).field850 == field239) {
					field605 = 1;
				}

				if (GMYKUSOM.method350(var3).field850 == field523) {
					field605 = 3;
				}
			}

			if (var4 == 111) {
				XQNGYHCW var22 = field544[var5];
				if (var22 != null) {
					method93(var22.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var22.field1399[0], 1, 0, 1, 2);
					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field242.method452(135);
					field242.method454(var5);
				}
			}

			if (var4 == 396) {
				method174(var5, var3, var2);
				field242.method452(82);
				field242.method454(var5 >> 14 & 0x7FFF);
				field242.method489(field567 + var2);
				field242.method489(field568 + var3);
			}

			if (var4 == 40) {
				ISLZFAII var23 = field574[var5];
				if (var23 != null) {
					method93(var23.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var23.field1399[0], 1, 0, 1, 2);
					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field242.method452(86);
					field242.method490(field260);
					field242.method489(var5);
				}
			}

			if (var4 == 908) {
				XQNGYHCW var24 = field544[var5];
				if (var24 != null) {
					method93(var24.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var24.field1399[0], 1, 0, 1, 2);
					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field242.method452(14);
					field242.method490(var5);
				}
			}

			if (var4 == 5) {
				boolean var25 = method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 0, 0, 0, 2);
				if (!var25) {
					method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 1, 0, 1, 2);
				}

				field594 = field79;
				field595 = field80;
				field597 = 2;
				field596 = 0;
				field242.method452(95);
				field242.method488(field568 + var3);
				field242.method488(field260);
				field242.method454(var5);
				field242.method489(field567 + var2);
			}

			if (var4 == 130) {
				GMYKUSOM var27 = GMYKUSOM.method350(var3);
				field259 = 1;
				field260 = var3;
				field261 = var27.field902;
				field376 = 0;
				field479 = true;
				String var28 = var27.field852;
				if (var28.indexOf(" ") != -1) {
					var28 = var28.substring(0, var28.indexOf(" "));
				}

				String var29 = var27.field852;
				if (var29.indexOf(" ") != -1) {
					var29 = var29.substring(var29.indexOf(" ") + 1);
				}

				field262 = var28 + " " + var27.field862 + " " + var29;

				if (field261 == 16) {
					field479 = true;
					field428 = 3;
					field355 = true;
				}
			} else {
				if (var4 == 383) {
					field242.method452(158);
					field242.method454(var3);
					GMYKUSOM var30 = GMYKUSOM.method350(var3);
					if (var30.field898 != null && var30.field898[0][0] == 5) {
						int var31 = var30.field898[0][1];
						field313[var31] = 1 - field313[var31];
						method162(var31);
						field479 = true;
					}
				}

				if (var4 == 228) {
					field242.method452(220);
					field242.method454(var5);
					field242.method490(var2);
					field242.method489(var3);
					field602 = 0;
					field603 = var3;
					field604 = var2;
					field605 = 2;
					if (GMYKUSOM.method350(var3).field850 == field239) {
						field605 = 1;
					}

					if (GMYKUSOM.method350(var3).field850 == field523) {
						field605 = 3;
					}
				}

				if (var4 == 647) {
					field242.method452(158);
					field242.method454(var3);
					GMYKUSOM var32 = GMYKUSOM.method350(var3);
					if (var32.field898 != null && var32.field898[0][0] == 5) {
						int var33 = var32.field898[0][1];
						if (field313[var33] != var32.field855[0]) {
							field313[var33] = var32.field855[0];
							method162(var33);
							field479 = true;
						}
					}
				}

				if (var4 == 725) {
					boolean var34 = method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 0, 0, 0, 2);
					if (!var34) {
						method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 1, 0, 1, 2);
					}

					field594 = field79;
					field595 = field80;
					field597 = 2;
					field596 = 0;
					field229 += var2;
					if (field229 >= 132) {
						field242.method452(119);
						field242.method454(5647);
						field229 = 0;
					}

					field242.method452(166);
					field242.method489(var5);
					field242.method490(field568 + var3);
					field242.method490(field567 + var2);
				}

				if (var4 == 62 && !field304) {
					field242.method452(221);
					field242.method454(var3);
					field304 = true;
				}

				if (var4 == 413 && method174(var5, var3, var2)) {
					field242.method452(55);
					field242.method488(field377);
					field242.method454(var5 >> 14 & 0x7FFF);
					field242.method490(field379);
					field242.method454(field378);
					field242.method454(field568 + var3);
					field242.method489(field567 + var2);
				}

				if (var4 == 61) {
					method90(field510);
					field510 = -1;
					field248 = true;
				}

				if (var4 == 798) {
					field242.method452(174);
					field242.method488(var3);
					field242.method490(var5);
					field242.method488(var2);
					field602 = 0;
					field603 = var3;
					field604 = var2;
					field605 = 2;
					if (GMYKUSOM.method350(var3).field850 == field239) {
						field605 = 1;
					}

					if (GMYKUSOM.method350(var3).field850 == field523) {
						field605 = 3;
					}
				}

				if (var4 == 1353) {
					HHBFOKVP var36 = HHBFOKVP.method367(var5);
					String var37;
					if (var36.field970 == null) {
						var37 = "It's a " + var36.field956 + ".";
					} else {
						var37 = new String(var36.field970);
					}

					method184(0, var37, "");
				}

				if (var4 == 842) {
					field242.method452(172);
					field242.method454(field379);
					field242.method454(var5);
					field242.method490(var2);
					field242.method454(field377);
					field242.method490(field378);
					field242.method489(var3);
					field602 = 0;
					field603 = var3;
					field604 = var2;
					field605 = 2;
					if (GMYKUSOM.method350(var3).field850 == field239) {
						field605 = 1;
					}

					if (GMYKUSOM.method350(var3).field850 == field523) {
						field605 = 3;
					}
				}

				if (var4 == 831) {
					field376 = 1;
					field377 = var2;
					field378 = var3;
					field379 = var5;
					field380 = HHBFOKVP.method367(var5).field956;
					field259 = 0;
					field479 = true;
				} else {
					if (var4 == 614) {
						field402 += var5;
						if (field402 >= 70) {
							field242.method452(68);
							field242.method456(0x15C1E6);
							field402 = 0;
						}

						field242.method452(197);
						field242.method454(var3);
						field242.method488(var2);
						field242.method454(var5);
						field602 = 0;
						field603 = var3;
						field604 = var2;
						field605 = 2;
						if (GMYKUSOM.method350(var3).field850 == field239) {
							field605 = 1;
						}

						if (GMYKUSOM.method350(var3).field850 == field523) {
							field605 = 3;
						}
					}

					if (var4 == 346) {
						field242.method452(69);
						field242.method454(var5);
						field242.method489(var3);
						field242.method490(var2);
						field602 = 0;
						field603 = var3;
						field604 = var2;
						field605 = 2;
						if (GMYKUSOM.method350(var3).field850 == field239) {
							field605 = 1;
						}

						if (GMYKUSOM.method350(var3).field850 == field523) {
							field605 = 3;
						}
					}

					if (var4 == 71) {
						ISLZFAII var38 = field574[var5];
						if (var38 != null) {
							method93(var38.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var38.field1399[0], 1, 0, 1, 2);
							field594 = field79;
							field595 = field80;
							field597 = 2;
							field596 = 0;
							field242.method452(167);
							field242.method488(var5);
						}
					}

					if (var4 == 1753) {
						HHBFOKVP var39 = HHBFOKVP.method367(var5);
						GMYKUSOM var40 = GMYKUSOM.method350(var3);
						String var41;
						if (var40 != null && var40.field864[var2] >= 100000) {
							var41 = var40.field864[var2] + " x " + var39.field956;
						} else if (var39.field970 == null) {
							var41 = "It's a " + var39.field956 + ".";
						} else {
							var41 = new String(var39.field970);
						}

						method184(0, var41, "");
					}

					if (var4 == 175) {
						XQNGYHCW var42 = field544[var5];
						if (var42 != null) {
							method93(var42.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var42.field1399[0], 1, 0, 1, 2);
							field594 = field79;
							field595 = field80;
							field597 = 2;
							field596 = 0;
							field242.method452(188);
							field242.method489(var5);
						}
					}

					if (var4 == 835) {
						method174(var5, var3, var2);
						field242.method452(248);
						field242.method488(var5 >> 14 & 0x7FFF);
						field242.method488(field568 + var3);
						field242.method490(field567 + var2);
					}

					if (var4 == 426) {
						boolean var43 = method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 0, 0, 0, 2);
						if (!var43) {
							method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 1, 0, 1, 2);
						}

						field594 = field79;
						field595 = field80;
						field597 = 2;
						field596 = 0;

						if ((field567 & 0x3) == 0) {
							field205++;
						}

						if (field205 >= 129) {
							field242.method452(20);
							field242.method454(43309);
							field205 = 0;
						}

						field242.method452(19);
						field242.method489(field567 + var2);
						field242.method454(var5);
						field242.method488(field568 + var3);
					}

					if (var4 == 87) {
						GMYKUSOM var45 = GMYKUSOM.method350(var3);
						boolean var46 = true;
						if (var45.field899 > 0) {
							var46 = method78(var45);
						}

						if (var46) {
							field242.method452(158);
							field242.method454(var3);
						}
					}

					if (var4 == 1002) {
						if ((field567 & 0x3) == 0) {
							field430++;
						}

						if (field430 >= 62) {
							field242.method452(246);
							field242.method457(0);
							field430 = 0;
						}

						method174(var5, var3, var2);
						field242.method452(205);
						field242.method490(var5 >> 14 & 0x7FFF);
						field242.method490(field568 + var3);
						field242.method490(field567 + var2);
					}

					if (var4 == 600) {
						ISLZFAII var47 = field574[var5];
						if (var47 != null) {
							method93(var47.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var47.field1399[0], 1, 0, 1, 2);
							field594 = field79;
							field595 = field80;
							field597 = 2;
							field596 = 0;
							field242.method452(72);
							field242.method454(var5);
						}
					}

					if (var4 == 984) {
						XQNGYHCW var48 = field544[var5];
						if (var48 != null) {
							method93(var48.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var48.field1399[0], 1, 0, 1, 2);
							field594 = field79;
							field595 = field80;
							field597 = 2;
							field596 = 0;
							field242.method452(16);
							field242.method454(var5);
						}
					}

					if (var4 == 532) {
						if ((var3 & 0x3) == 0) {
							field314++;
						}

						if (field314 >= 69) {
							field242.method452(125);
							field242.method456(0x3FFF36);
							field314 = 0;
						}

						field242.method452(232);
						field242.method488(var2);
						field242.method490(var3);
						field242.method490(var5);
						field602 = 0;
						field603 = var3;
						field604 = var2;
						field605 = 2;
						if (GMYKUSOM.method350(var3).field850 == field239) {
							field605 = 1;
						}

						if (GMYKUSOM.method350(var3).field850 == field523) {
							field605 = 3;
						}
					}

					if (var4 == 927) {
						String var49 = field388[arg0];
						int var50 = var49.indexOf("@whi@");
						if (var50 != -1) {
							long var51 = CSEYUXAS.method216(var49.substring(var50 + 5).trim());
							int var53 = -1;
							for (int var54 = 0; var54 < field434; var54++) {
								if (field443[var54] == var51) {
									var53 = var54;
									break;
								}
							}

							if (var53 != -1 && field505[var53] > 0) {
								field248 = true;
								field489 = 0;
								field365 = true;
								field214 = "";
								field558 = 3;
								field609 = field443[var53];
								field363 = "Enter message to send to " + field539[var53];
							}
						}
					}

					if (var4 == 288) {
						boolean var55 = method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 0, 0, 0, 2);
						if (!var55) {
							method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 1, 0, 1, 2);
						}

						field594 = field79;
						field595 = field80;
						field597 = 2;
						field596 = 0;
						field242.method452(171);
						field242.method490(field568 + var3);
						field242.method454(field567 + var2);
						field242.method489(var5);
					}

					if (var4 == 1028) {
						int var57 = var5 >> 14 & 0x7FFF;
						OEPVRTCC var58 = OEPVRTCC.method522(var57);
						String var59;
						if (var58.field1226 == null) {
							var59 = "It's a " + var58.field1242 + ".";
						} else {
							var59 = new String(var58.field1226);
						}

						method184(0, var59, "");
					}

					if (var4 == 257) {
						boolean var60 = method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 0, 0, 0, 2);
						if (!var60) {
							method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 1, 0, 1, 2);
						}

						field594 = field79;
						field595 = field80;
						field597 = 2;
						field596 = 0;
						field242.method452(123);
						field242.method490(field568 + var3);
						field242.method454(field567 + var2);
						field242.method488(var5);
					}

					if (var4 == 456) {
						XQNGYHCW var62 = field544[var5];
						if (var62 != null) {
							method93(var62.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var62.field1399[0], 1, 0, 1, 2);
							field594 = field79;
							field595 = field80;
							field597 = 2;
							field596 = 0;
							field242.method452(164);
							field242.method490(var5);
						}
					}

					if (var4 == 15) {
						method123();
					}

					if (var4 == 734) {
						boolean var63 = method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 0, 0, 0, 2);
						if (!var63) {
							method93(var2, 0, field548.field1399[0], 0, field548.field1398[0], false, var3, 1, 0, 1, 2);
						}

						field594 = field79;
						field595 = field80;
						field597 = 2;
						field596 = 0;
						field242.method452(22);
						field242.method488(var5);
						field242.method488(field377);
						field242.method488(field378);
						field242.method490(field567 + var2);
						field242.method489(field379);
						field242.method488(field568 + var3);
					}

					if (var4 == 341) {
						field242.method452(133);
						field242.method489(var5);
						field242.method488(var3);
						field242.method454(var2);
						field602 = 0;
						field603 = var3;
						field604 = var2;
						field605 = 2;
						if (GMYKUSOM.method350(var3).field850 == field239) {
							field605 = 1;
						}

						if (GMYKUSOM.method350(var3).field850 == field523) {
							field605 = 3;
						}
					}

					if (var4 == 140 || var4 == 113) {
						String var65 = field388[arg0];
						int var66 = var65.indexOf("@whi@");
						if (var66 != -1) {
							var65 = var65.substring(var66 + 5).trim();
							String var67 = CSEYUXAS.method220(CSEYUXAS.method217(CSEYUXAS.method216(var65)));
							boolean var68 = false;
							for (int var69 = 0; var69 < field575; var69++) {
								ISLZFAII var70 = field574[field576[var69]];
								if (var70 != null && var70.field1039 != null && var70.field1039.equalsIgnoreCase(var67)) {
									method93(var70.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var70.field1399[0], 1, 0, 1, 2);

									if (var4 == 140) {
										field242.method452(191);
										field242.method488(field576[var69]);
									}

									if (var4 == 113) {
										field242.method452(72);
										field242.method454(field576[var69]);
									}

									var68 = true;
									break;
								}
							}

							if (!var68) {
								method184(0, "Unable to find " + var67, "");
							}
						}
					}

					if (var4 == 722) {
						XQNGYHCW var71 = field544[var5];
						if (var71 != null) {
							method93(var71.field1398[0], 0, field548.field1399[0], 0, field548.field1398[0], false, var71.field1399[0], 1, 0, 1, 2);
							field594 = field79;
							field595 = field80;
							field597 = 2;
							field596 = 0;
							field242.method452(117);
							field242.method490(field260);
							field242.method488(var5);
						}
					}

					if (var4 == 687 && method174(var5, var3, var2)) {
						field242.method452(218);
						field242.method490(field568 + var3);
						field242.method489(var5 >> 14 & 0x7FFF);
						field242.method489(field567 + var2);
						field242.method454(field260);
					}

					if (var4 == 155) {
						field242.method452(54);
						field242.method454(var2);
						field242.method489(var3);
						field242.method488(var5);
						field602 = 0;
						field603 = var3;
						field604 = var2;
						field605 = 2;
						if (GMYKUSOM.method350(var3).field850 == field239) {
							field605 = 1;
						}

						if (GMYKUSOM.method350(var3).field850 == field523) {
							field605 = 3;
						}
					}

					field376 = 0;
					field259 = 0;
					field479 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)Z")
	public final boolean method157(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field323[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 571) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method158() {
		if (field364 > 1) {
			field364--;
		}

		if (field335 > 0) {
			field335--;
		}

		for (int var1 = 0; var1 < 5 && method105(); var1++) {
		}

		if (field477) {
			synchronized (field420.field1156) {
				if (!field245) {
					field420.field1152 = 0;
				} else if (field78 != 0 || field420.field1152 >= 40) {
					field242.method452(228);
					field242.method453(0);
					int var3 = field242.field1139;
					int var4 = 0;
					for (int var5 = 0; var5 < field420.field1152 && var3 - field242.field1139 < 240; var5++) {
						var4++;
						int var6 = field420.field1155[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field420.field1153[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field420.field1155[var5] == -1 && field420.field1153[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field309 != var7 || field310 != var6) {
							int var9 = var7 - field309;
							field309 = var7;
							int var10 = var6 - field310;
							field310 = var6;

							if (field615 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field242.method454((field615 << 12) + (var9 << 6) + var10);
								field615 = 0;
							} else if (field615 < 8) {
								field242.method456((field615 << 19) + var8 + 0x800000);
								field615 = 0;
							} else {
								field242.method457((field615 << 19) + var8 - 0x40000000);
								field615 = 0;
							}
						} else if (field615 < 2047) {
							field615++;
						}
					}

					field242.method462(field242.field1139 - var3);

					if (var4 >= field420.field1152) {
						field420.field1152 = 0;
					} else {
						field420.field1152 -= var4;
						for (int var11 = 0; var11 < field420.field1152; var11++) {
							field420.field1153[var11] = field420.field1153[var4 + var11];
							field420.field1155[var11] = field420.field1155[var4 + var11];
						}
					}
				}
			}

			if (field78 != 0) {
				long var12 = (field81 - field294) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field294 = field81;
				int var14 = field80;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field79;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field78 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field242.method452(77);
				field242.method497((var17 << 19) + (var18 << 20) + var16);
			}

			if (field280 > 0) {
				field280--;
			}

			if (field82[1] == 1 || field82[2] == 1 || field82[3] == 1 || field82[4] == 1) {
				field281 = true;
			}

			if (field281 && field280 <= 0) {
				field280 = 20;
				field281 = false;
				field242.method452(7);
				field242.method454(field404);
				field242.method490(field405);
			}

			if (field69 && !field454) {
				field454 = true;
				field242.method452(216);
				field242.method453(1);
			}

			if (!field69 && field454) {
				field454 = false;
				field242.method452(216);
				field242.method453(0);
			}

			method136();
			method179();
			method181();
			field200++;
			if (field200 > 1160) {
				field200 = 0;
				field242.method452(18);
				field242.method453(0);
				int var19 = field242.field1139;
				field242.method453(112);
				field242.method454((int) (Math.random() * 65536.0D));
				field242.method453(224);

				if ((int) (Math.random() * 2.0D) == 0) {
					field242.method454(35707);
				}

				field242.method454(31811);
				field242.method454((int) (Math.random() * 65536.0D));
				field242.method453(178);
				field242.method453(157);
				field242.method454((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field242.method454(63005);
				}

				field242.method462(field242.field1139 - var19);
			}

			field333++;
			if (field333 > 750) {
				method175();
			}

			method211();
			method96();
			method164();
			field536++;

			if (field597 != 0) {
				field596 += 20;
				if (field596 >= 400) {
					field597 = 0;
				}
			}

			if (field605 != 0) {
				field602++;
				if (field602 >= 15) {
					if (field605 == 2) {
						field479 = true;
					}

					if (field605 == 3) {
						field248 = true;
					}

					field605 = 0;
				}
			}

			if (field208 != 0) {
				field421++;

				if (field72 > field209 + 5 || field72 < field209 - 5 || field73 > field210 + 5 || field73 < field210 - 5) {
					field399 = true;
				}

				if (field71 == 0) {
					if (field208 == 2) {
						field479 = true;
					}

					if (field208 == 3) {
						field248 = true;
					}

					field208 = 0;

					if (field399 && field421 >= 5) {
						field220 = -1;
						method113();

						if (field220 == field206 && field219 != field207) {
							GMYKUSOM var20 = GMYKUSOM.method350(field206);
							byte var21 = 0;
							if (field341 == 1 && var20.field899 == 206) {
								var21 = 1;
							}

							if (var20.field912[field219] <= 0) {
								var21 = 0;
							}

							if (var20.field851) {
								int var22 = field207;
								int var23 = field219;
								var20.field912[var23] = var20.field912[var22];
								var20.field864[var23] = var20.field864[var22];
								var20.field912[var22] = -1;
								var20.field864[var22] = 0;
							} else if (var21 == 1) {
								int var24 = field207;
								int var25 = field219;
								while (var24 != var25) {
									if (var24 > var25) {
										var20.method343(var24, var24 - 1);
										var24--;
									} else if (var24 < var25) {
										var20.method343(var24, var24 + 1);
										var24++;
									}
								}
							} else {
								var20.method343(field207, field219);
							}

							field242.method452(109);
							field242.method488(field207);
							field242.method454(field219);
							field242.method453(var21);
							field242.method490(field206);
						}
					} else if ((field424 == 1 || method157(field232 - 1)) && field232 > 2) {
						method177();
					} else if (field232 > 0) {
						method156(field232 - 1);
					}

					field602 = 10;
					field78 = 0;
				}
			}

			if (BJATBFRK.field141 != -1) {
				int var26 = BJATBFRK.field141;
				int var27 = BJATBFRK.field142;
				boolean var28 = method93(var26, 0, field548.field1399[0], 0, field548.field1398[0], true, var27, 0, 0, 0, 0);
				BJATBFRK.field141 = -1;

				if (var28) {
					field594 = field79;
					field595 = field80;
					field597 = 1;
					field596 = 0;
				}
			}

			if (field78 == 1 && field326 != null) {
				field326 = null;
				field248 = true;
				field78 = 0;
			}

			method145();

			if (field357 == -1) {
				method153();
				method121();
				method165();
			}

			if (field71 == 1 || field78 == 1) {
				field307++;
			}

			if (field366 == 0 && field427 == 0 && field398 == 0) {
				if (field606 > 0) {
					field606--;
				}
			} else if (field606 < 100) {
				field606++;
				if (field606 == 100) {
					if (field366 != 0) {
						field248 = true;
					}

					if (field427 != 0) {
						field479 = true;
					}
				}
			}

			if (field474 == 2) {
				method122();
			}

			if (field474 == 2 && field250) {
				method200();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field607[var29]++;
			}

			method178();
			field70++;
			if (field70 > 4500) {
				field335 = 250;
				field70 -= 500;
				field242.method452(24);
			}

			field459++;
			if (field459 > 500) {
				field459 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field251 += field252;
				}

				if ((var30 & 0x2) == 2) {
					field520 += field521;
				}

				if ((var30 & 0x4) == 4) {
					field500 += field501;
				}
			}

			if (field251 < -50) {
				field252 = 2;
			}

			if (field251 > 50) {
				field252 = -2;
			}

			if (field520 < -55) {
				field521 = 2;
			}

			if (field520 > 55) {
				field521 = -2;
			}

			if (field500 < -40) {
				field501 = 1;
			}

			if (field500 > 40) {
				field501 = -1;
			}

			field616++;
			if (field616 > 500) {
				field616 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field511 += field512;
				}

				if ((var31 & 0x2) == 2) {
					field263 += field264;
				}
			}

			if (field511 < -60) {
				field512 = 2;
			}

			if (field511 > 60) {
				field512 = -2;
			}

			if (field263 < -20) {
				field264 = 1;
			}

			if (field263 > 10) {
				field264 = -1;
			}

			field334++;
			if (field334 > 50) {
				field242.method452(162);
			}

			try {
				if (field276 != null && field242.field1139 > 0) {
					field276.method356(field242.field1138, 0, field242.field1139);
					field242.field1139 = 0;
					field334 = 0;
				}
			} catch (IOException var33) {
				method175();
			} catch (Exception var34) {
				method86();
			}
		}
	}

	@ObfuscatedName("client.a(LINRTBCYJ;III)V")
	public final void method159(INRTBCYJ arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field511 + field405 & 0x7FF;
			int var6 = LSSDQDBV.field1127[var5];
			int var7 = LSSDQDBV.field1128[var5];
			var6 = var6 * 256 / (field263 + 256);
			var7 = var7 * 256 / (field263 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field258.method392(15, 83 - var13 - 20, var12 + 94 + 4 - 10, 15, 256, 20, 20, var10);
		} else {
			method140(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method160() {
		if (field586 == 2) {
			method208((field516 - field568 << 7) + field519, (field515 - field567 << 7) + field518, field517 * 2);

			if (field592 > -1 && field211 % 20 < 10) {
				field418[0].method387(field592 - 12, field593 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(IIB)V")
	public final void method161(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field275[var4] != null) {
				int var5 = field273[var4];
				int var6 = field507 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field274[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field503 == 0 || field503 == 1 && method195(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field548.field1039)) {
						if (field180 >= 1) {
							field388[field232] = "Report abuse @whi@" + var7;
							field323[field232] = 460;
							field232++;
						}

						field388[field232] = "Add ignore @whi@" + var7;
						field323[field232] = 766;
						field232++;
						field388[field232] = "Add friend @whi@" + var7;
						field323[field232] = 571;
						field232++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field547 == 0 && (var5 == 7 || field601 == 0 || field601 == 1 && method195(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field180 >= 1) {
							field388[field232] = "Report abuse @whi@" + var7;
							field323[field232] = 460;
							field232++;
						}

						field388[field232] = "Add ignore @whi@" + var7;
						field323[field232] = 766;
						field232++;
						field388[field232] = "Add friend @whi@" + var7;
						field323[field232] = 571;
						field232++;
					}

					var3++;
				}

				if (var5 == 4 && (field387 == 0 || field387 == 1 && method195(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field388[field232] = "Accept trade @whi@" + var7;
						field323[field232] = 140;
						field232++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field547 == 0 && field601 < 2) {
					var3++;
				}

				if (var5 == 8 && (field387 == 0 || field387 == 1 && method195(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field388[field232] = "Accept challenge @whi@" + var7;
						field323[field232] = 113;
						field232++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method162(int arg0) {
		int var2 = CUNNWCIM.field623[arg0].field631;
		if (var2 != 0) {
			int var3 = field313[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					GAGDRMEJ.method334(0.9D);
				}

				if (var3 == 2) {
					GAGDRMEJ.method334(0.8D);
				}

				if (var3 == 3) {
					GAGDRMEJ.method334(0.7D);
				}

				if (var3 == 4) {
					GAGDRMEJ.method334(0.6D);
				}

				HHBFOKVP.field981.method450();
				field617 = true;
			}

			if (var2 == 3) {
				boolean var4 = field268;

				if (var3 == 0) {
					method138(0, field268);
					field268 = true;
				}

				if (var3 == 1) {
					method138(-400, field268);
					field268 = true;
				}

				if (var3 == 2) {
					method138(-800, field268);
					field268 = true;
				}

				if (var3 == 3) {
					method138(-1200, field268);
					field268 = true;
				}

				if (var3 == 4) {
					field268 = false;
				}

				if (field268 != var4 && !field488) {
					if (field268) {
						field329 = field182;
						field330 = true;
						field359.method307(2, field329);
					} else {
						method88();
					}

					field453 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field256 = true;
					method197(0);
				}

				if (var3 == 1) {
					field256 = true;
					method197(-400);
				}

				if (var3 == 2) {
					field256 = true;
					method197(-800);
				}

				if (var3 == 3) {
					field256 = true;
					method197(-1200);
				}

				if (var3 == 4) {
					field256 = false;
				}
			}

			if (var2 == 5) {
				field424 = var3;
			}

			if (var2 == 6) {
				field253 = var3;
			}

			if (var2 == 8) {
				field547 = var3;
				field248 = true;
			}

			if (var2 == 9) {
				field341 = var3;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method163() {
		field478 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field612) {
				field241++;
				method92();
				method92();
				method147();
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

		field478 = false;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method164() {
		for (int var1 = -1; var1 < field575; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field573;
			} else {
				var2 = field576[var1];
			}

			ISLZFAII var3 = field574[var2];
			if (var3 != null && var3.field1393 > 0) {
				var3.field1393--;
				if (var3.field1393 == 0) {
					var3.field1383 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field545; var4++) {
			int var5 = field546[var4];
			XQNGYHCW var6 = field544[var5];
			if (var6 != null && var6.field1393 > 0) {
				var6.field1393--;
				if (var6.field1393 == 0) {
					var6.field1383 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method165() {
		if (field78 == 1) {
			if (field79 >= 6 && field79 <= 106 && field80 >= 467 && field80 <= 499) {
				field503 = (field503 + 1) % 4;
				field257 = true;
				field248 = true;
				field242.method452(245);
				field242.method453(field503);
				field242.method453(field601);
				field242.method453(field387);
			}

			if (field79 >= 135 && field79 <= 235 && field80 >= 467 && field80 <= 499) {
				field601 = (field601 + 1) % 3;
				field257 = true;
				field248 = true;
				field242.method452(245);
				field242.method453(field503);
				field242.method453(field601);
				field242.method453(field387);
			}

			if (field79 >= 273 && field79 <= 373 && field80 >= 467 && field80 <= 499) {
				field387 = (field387 + 1) % 3;
				field257 = true;
				field248 = true;
				field242.method452(245);
				field242.method453(field503);
				field242.method453(field601);
				field242.method453(field387);
			}

			if (field79 >= 412 && field79 <= 512 && field80 >= 467 && field80 <= 499) {
				if (field239 == -1) {
					method123();
					field295 = "";
					field392 = false;
					field509 = field239 = GMYKUSOM.field868;
					return;
				}

				method184(0, "Please close the interface you have open before using 'report abuse'", "");
				return;
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method166() {
		field490 = 0;
		for (int var1 = -1; var1 < field575 + field545; var1++) {
			UOUXSBLI var2;
			if (var1 == -1) {
				var2 = field548;
			} else if (var1 < field575) {
				var2 = field574[field576[var1]];
			} else {
				var2 = field544[field546[var1 - field575]];
			}

			if (var2 != null && var2.method397()) {
				if (var2 instanceof XQNGYHCW) {
					DUHKBPRV var3 = ((XQNGYHCW) var2).field1494;
					if (var3.field671 != null) {
						var3 = var3.method237();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field575) {
					DUHKBPRV var6 = ((XQNGYHCW) var2).field1494;
					if (var6.field658 >= 0 && var6.field658 < field360.length) {
						method207(var2, var2.field1382 + 15);

						if (field592 > -1) {
							field360[var6.field658].method387(field592 - 12, field593 - 30);
						}
					}

					if (field586 == 1 && field546[var1 - field575] == field297 && field211 % 20 < 10) {
						method207(var2, var2.field1382 + 15);

						if (field592 > -1) {
							field418[0].method387(field592 - 12, field593 - 28);
						}
					}
				} else {
					int var4 = 30;
					ISLZFAII var5 = (ISLZFAII) var2;
					if (var5.field1042 != -1 || var5.field1024 != -1) {
						method207(var2, var2.field1382 + 15);

						if (field592 > -1) {
							if (var5.field1042 != -1) {
								field526[var5.field1042].method387(field592 - 12, field593 - var4);
								var4 += 25;
							}

							if (var5.field1024 != -1) {
								field360[var5.field1024].method387(field592 - 12, field593 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field586 == 10 && field576[var1] == field584) {
						method207(var2, var2.field1382 + 15);

						if (field592 > -1) {
							field418[1].method387(field592 - 12, field593 - var4);
						}
					}
				}

				if (var2.field1383 != null && (var1 >= field575 || field503 == 0 || field503 == 3 || field503 == 1 && method195(((ISLZFAII) var2).field1039))) {
					method207(var2, var2.field1382);

					if (field592 > -1 && field490 < field491) {
						field495[field490] = field413.method313(var2.field1383) / 2;
						field494[field490] = field413.field776;
						field492[field490] = field592;
						field493[field490] = field593;
						field496[field490] = var2.field1421;
						field497[field490] = var2.field1384;
						field498[field490] = var2.field1393;
						field499[field490++] = var2.field1383;

						if (field253 == 0 && var2.field1384 >= 1 && var2.field1384 <= 3) {
							field494[field490] += 10;
							field493[field490] += 5;
						}

						if (field253 == 0 && var2.field1384 == 4) {
							field495[field490] = 60;
						}

						if (field253 == 0 && var2.field1384 == 5) {
							field494[field490] += 5;
						}
					}
				}

				if (var2.field1405 > field211) {
					method207(var2, var2.field1382 + 15);

					if (field592 > -1) {
						int var7 = var2.field1406 * 30 / var2.field1407;
						if (var7 > 30) {
							var7 = 30;
						}

						CYEOWDOP.method229(0xFF00, var7, field592 - 15, field593 - 3, 5);
						CYEOWDOP.method229(0xFF0000, 30 - var7, field592 - 15 + var7, field593 - 3, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1387[var8] > field211) {
						method207(var2, var2.field1382 / 2);

						if (field592 > -1) {
							if (var8 == 1) {
								field593 -= 20;
							}

							if (var8 == 2) {
								field592 -= 15;
								field593 -= 10;
							}

							if (var8 == 3) {
								field592 += 15;
								field593 -= 10;
							}

							field462[var2.field1386[var8]].method387(field592 - 12, field593 - 12);
							field411.method310(field592, field593 + 4, 0, String.valueOf(var2.field1385[var8]));
							field411.method310(field592 - 1, field593 + 3, 0xFFFFFF, String.valueOf(var2.field1385[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field490; var9++) {
			int var10 = field492[var9];
			int var11 = field493[var9];
			int var12 = field495[var9];
			int var13 = field494[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field493[var15] - field494[var15] && var11 - var13 < field493[var15] + 2 && var10 - var12 < field495[var15] + field492[var15] && var10 + var12 > field492[var15] - field495[var15] && field493[var15] - field494[var15] < var11) {
						var11 = field493[var15] - field494[var15];
						var14 = true;
					}
				}
			}

			field592 = field492[var9];
			field593 = field493[var9] = var11;
			String var16 = field499[var9];
			if (field253 == 0) {
				int var17 = 0xFFFF00;
				if (field496[var9] < 6) {
					var17 = field306[field496[var9]];
				}

				if (field496[var9] == 6) {
					var17 = field193 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field496[var9] == 7) {
					var17 = field193 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field496[var9] == 8) {
					var17 = field193 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field496[var9] == 9) {
					int var18 = 150 - field498[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field496[var9] == 10) {
					int var19 = 150 - field498[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field496[var9] == 11) {
					int var20 = 150 - field498[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field497[var9] == 0) {
					field413.method310(field592, field593 + 1, 0, var16);
					field413.method310(field592, field593, var17, var16);
				}

				if (field497[var9] == 1) {
					field413.method315(field593 + 1, var16, 0, field592, field193);
					field413.method315(field593, var16, var17, field592, field193);
				}

				if (field497[var9] == 2) {
					field413.method316(field592, 0, var16, field593 + 1, field193);
					field413.method316(field592, var17, var16, field593, field193);
				}

				if (field497[var9] == 3) {
					field413.method317(var16, 0, 150 - field498[var9], field193, field592, field593 + 1);
					field413.method317(var16, var17, 150 - field498[var9], field193, field592, field593);
				}

				if (field497[var9] == 4) {
					int var21 = field413.method313(var16);
					int var22 = (150 - field498[var9]) * (var21 + 100) / 150;
					CYEOWDOP.method226(field592 + 50, 0, 334, field592 - 50);
					field413.method314(field593 + 1, var16, field592 + 50 - var22, 0);
					field413.method314(field593, var16, field592 + 50 - var22, var17);
					CYEOWDOP.method225();
				}

				if (field497[var9] == 5) {
					int var23 = 150 - field498[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					CYEOWDOP.method226(512, field593 - field413.field776 - 1, field593 + 5, 0);
					field413.method310(field592, field593 + var24 + 1, 0, var16);
					field413.method310(field592, field593 + var24, var17, var16);
					CYEOWDOP.method225();
				}
			} else {
				field413.method310(field592, field593 + 1, 0, var16);
				field413.method310(field592, field593, 0xFFFF00, var16);
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method167(int arg0, int arg1) {
		boolean var3 = false;
		GMYKUSOM var4 = GMYKUSOM.method350(arg1);
		for (int var5 = 0; var5 < var4.field890.length && var4.field890[var5] != -1; var5++) {
			GMYKUSOM var6 = GMYKUSOM.method350(var4.field890[var5]);
			if (var6.field903 == 1) {
				var3 |= method167(arg0, var6.field843);
			}

			if (var6.field903 == 6 && (var6.field906 != -1 || var6.field907 != -1)) {
				boolean var7 = method169(var6);
				int var8;
				if (var7) {
					var8 = var6.field907;
				} else {
					var8 = var6.field906;
				}

				if (var8 != -1) {
					WOTIAWQC var9 = WOTIAWQC.field1470[var8];
					var6.field888 += arg0;
					while (var6.field888 > var9.method581(var6.field875)) {
						var6.field888 -= var9.method581(var6.field875) + 1;
						var6.field875++;
						if (var6.field875 >= var9.field1471) {
							var6.field875 -= var9.field1475;
							if (var6.field875 < 0 || var6.field875 >= var9.field1471) {
								var6.field875 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field903 == 6 && var6.field878 != 0) {
				int var10 = var6.field878 >> 16;
				int var11 = var6.field878 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field870 = var6.field870 + var10 & 0x7FF;
				var6.field871 = var6.field871 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method168() {
		byte[] var1 = field312.method566("title.dat", null);
		INRTBCYJ var2 = new INRTBCYJ(var1, this);
		field467.method509();
		var2.method385(0, 0);
		field468.method509();
		var2.method385(-637, 0);
		field464.method509();
		var2.method385(-128, 0);
		field465.method509();
		var2.method385(-202, -371);
		field466.method509();
		var2.method385(-202, -171);
		field469.method509();
		var2.method385(0, -265);
		field470.method509();
		var2.method385(-562, -265);
		field471.method509();
		var2.method385(-128, -171);
		field472.method509();
		var2.method385(-562, -171);
		int[] var3 = new int[var2.field1012];
		for (int var4 = 0; var4 < var2.field1013; var4++) {
			for (int var5 = 0; var5 < var2.field1012; var5++) {
				var3[var5] = var2.field1011[var2.field1012 * var4 + var2.field1012 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1012; var6++) {
				var2.field1011[var2.field1012 * var4 + var6] = var3[var6];
			}
		}

		field467.method509();
		var2.method385(382, 0);
		field468.method509();
		var2.method385(-255, 0);
		field464.method509();
		var2.method385(254, 0);
		field465.method509();
		var2.method385(180, -371);
		field466.method509();
		var2.method385(180, -171);
		field469.method509();
		var2.method385(382, -265);
		field470.method509();
		var2.method385(-180, -265);
		field471.method509();
		var2.method385(254, -171);
		field472.method509();
		var2.method385(-180, -171);
		INRTBCYJ var7 = new INRTBCYJ(field312, "logo", 0);
		field464.method509();
		var7.method387(382 - var7.field1012 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(ILGMYKUSOM;)Z")
	public final boolean method169(GMYKUSOM arg0) {
		if (arg0.field913 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field913.length; var2++) {
			int var3 = method111(var2, arg0);
			int var4 = arg0.field855[var2];
			if (arg0.field913[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field913[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field913[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(LLZWRHABP;II)V")
	public final void method170(LZWRHABP arg0, int arg1) {
		field299 = 0;
		field577 = 0;
		method91(arg1, arg0);
		method203(arg0, arg1);
		method187(arg1, arg0);
		method107(arg1, arg0);

		for (int var3 = 0; var3 < field299; var3++) {
			int var4 = field300[var3];
			if (field211 != field574[var4].field1410) {
				field574[var4] = null;
			}
		}

		if (arg0.field1139 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1139 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field575; var5++) {
			if (field574[field576[var5]] == null) {
				signlink.reporterror(field316 + " null entry in pl list - pos:" + var5 + " size:" + field575);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method171(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field433[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field293[var6][var4][var5] + field293[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field293[var6][var4][var5 + 1] + field293[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method172(boolean arg0) {
		for (int var2 = 0; var2 < field545; var2++) {
			XQNGYHCW var3 = field544[field546[var2]];
			int var4 = (field546[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method397() && var3.field1494.field651 == arg0 && var3.field1494.method243()) {
				int var5 = var3.field1395 >> 7;
				int var6 = var3.field1396 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1423 == 1 && (var3.field1395 & 0x7F) == 0x40 && (var3.field1396 & 0x7F) == 0x40) {
						if (field203[var5][var6] == field193) {
							continue;
						}

						field203[var5][var6] = field193;
					}

					if (!var3.field1494.field656) {
						var4 += Integer.MIN_VALUE;
					}

					field320.method38(var3.field1395, (var3.field1423 - 1) * 64 + 60, var3.field1414, var3, method171(var3.field1396, var3.field1395, field580), var3.field1397, field580, var3.field1396, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method173() {
		method130();

		if (field597 == 1) {
			field456[field596 / 100].method387(field594 - 8 - 4, field595 - 8 - 4);
		}

		if (field597 == 2) {
			field456[field596 / 100 + 4].method387(field594 - 8 - 4, field595 - 8 - 4);
		}

		if (field231 != -1) {
			method167(field536, field231);
			method85(0, GMYKUSOM.method350(field231), 0, 0);
		}

		if (field239 != -1) {
			method167(field536, field239);
			method85(0, GMYKUSOM.method350(field239), 0, 0);
		}

		method106();

		if (!field444) {
			method113();
			method146();
		} else if (field480 == 0) {
			method196();
		}

		if (field591 == 1) {
			field452.method387(472, 296);
		}

		if (field240) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field60 < 30 && field488) {
				var3 = 0xFF0000;
			}

			if (field60 < 20 && !field488) {
				var3 = 0xFF0000;
			}

			field412.method309(var3, "Fps:" + field60, var1, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field488) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field488) {
				int var8 = 0xFF0000;
			}

			field412.method309(0xFFFF00, "Mem:" + var5 + "k", var1, var2);
			var2 += 15;
		}

		if (field364 != 0) {
			int var9 = field364 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field412.method314(329, "System update in: " + var10 + ":0" + var9, 4, 0xFFFF00);
			} else {
				field412.method314(329, "System update in: " + var10 + ":" + var9, 4, 0xFFFF00);
			}

			field290++;
			if (field290 > 58) {
				field290 = 0;
				field242.method452(129);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IBII)Z")
	public final boolean method174(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field320.method57(field580, arg2, arg1, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			OEPVRTCC var8 = OEPVRTCC.method522(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1246;
				var10 = var8.field1230;
			} else {
				var9 = var8.field1230;
				var10 = var8.field1246;
			}

			int var11 = var8.field1243;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method93(arg2, 0, field548.field1399[0], 0, field548.field1398[0], false, arg1, var10, var11, var9, 2);
		} else {
			method93(arg2, var6 + 1, field548.field1399[0], var7, field548.field1398[0], false, arg1, 0, 0, 0, 2);
		}

		field594 = field79;
		field595 = field80;
		field597 = 2;
		field596 = 0;
		return true;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method175() {
		if (field335 > 0) {
			method86();
		} else {
			method87("Please wait - attempting to reestablish", "Connection lost");
			field265 = 0;
			field269 = 0;
			HGDLUQYC var1 = field276;
			field477 = false;
			field415 = 0;
			method83(field316, field317, true);

			if (!field477) {
				method86();
			}

			try {
				var1.method352();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method176(int arg0) {
		GMYKUSOM var2 = GMYKUSOM.method350(arg0);
		for (int var3 = 0; var3 < var2.field890.length && var2.field890[var3] != -1; var3++) {
			GMYKUSOM var4 = GMYKUSOM.method350(var2.field890[var3]);
			if (var4.field903 == 1) {
				method176(var4.field843);
			}

			var4.field875 = 0;
			var4.field888 = 0;
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method177() {
		int var1 = field413.method312("Choose Option");
		for (int var2 = 0; var2 < field232; var2++) {
			int var3 = field413.method312(field388[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field232 * 15 + 21;
		if (field79 > 4 && field80 > 4 && field79 < 516 && field80 < 338) {
			int var5 = field79 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field80 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field444 = true;
			field480 = 0;
			field481 = var5;
			field482 = var6;
			field483 = var1;
			field484 = field232 * 15 + 22;
		}

		if (field79 > 553 && field80 > 205 && field79 < 743 && field80 < 466) {
			int var7 = field79 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field80 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field444 = true;
			field480 = 1;
			field481 = var7;
			field482 = var8;
			field483 = var1;
			field484 = field232 * 15 + 22;
		}

		if (field79 > 17 && field80 > 357 && field79 < 496 && field80 < 453) {
			int var9 = field79 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field80 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field444 = true;
			field480 = 2;
			field481 = var9;
			field482 = var10;
			field483 = var1;
			field484 = field232 * 15 + 22;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method178() {
		field336++;
		if (field336 > 1276) {
			field336 = 0;
			field242.method452(1);
			field242.method453(0);
			int var1 = field242.field1139;

			if ((int) (Math.random() * 2.0D) == 0) {
				field242.method453(250);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field242.method454(16639);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field242.method453(92);
			}

			field242.method454((int) (Math.random() * 65536.0D));
			field242.method454((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field242.method454(17103);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field242.method453(188);
			}

			field242.method453(57);

			if ((int) (Math.random() * 2.0D) == 0) {
				field242.method453(21);
			}

			field242.method454((int) (Math.random() * 65536.0D));
			field242.method462(field242.field1139 - var1);
		}

		while (true) {
			int var2;
			do {
				while (true) {
					var2 = method11();
					if (var2 == -1) {
						return;
					}

					if (field239 != -1 && field509 == field239) {
						break;
					}

					if (field365) {
						if (var2 >= 32 && var2 <= 122 && field214.length() < 80) {
							field214 = field214 + (char) var2;
							field248 = true;
						}

						if (var2 == 8 && field214.length() > 0) {
							field214 = field214.substring(0, field214.length() - 1);
							field248 = true;
						}

						if (var2 == 13 || var2 == 10) {
							field365 = false;
							field248 = true;

							if (field558 == 1) {
								long var3 = CSEYUXAS.method216(field214);
								method209(var3);
							}

							if (field558 == 2 && field434 > 0) {
								long var5 = CSEYUXAS.method216(field214);
								method141(var5);
							}

							if (field558 == 3 && field214.length() > 0) {
								field242.method452(215);
								field242.method453(0);
								int var7 = field242.field1139;
								field242.method459(field609);
								RTTNUYFU.method563(field214, field242);
								field242.method462(field242.field1139 - var7);
								field214 = RTTNUYFU.method564(field214);
								field214 = DYUQECMZ.method254(field214);
								method184(6, field214, CSEYUXAS.method220(CSEYUXAS.method217(field609)));

								if (field601 == 2) {
									field601 = 1;
									field257 = true;
									field242.method452(245);
									field242.method453(field503);
									field242.method453(field601);
									field242.method453(field387);
								}
							}

							if (field558 == 4 && field608 < 100) {
								long var8 = CSEYUXAS.method216(field214);
								method126(var8);
							}

							if (field558 == 5 && field608 > 0) {
								long var10 = CSEYUXAS.method216(field214);
								method189(var10);
							}
						}
					} else if (field489 == 1) {
						if (var2 >= 48 && var2 <= 57 && field354.length() < 10) {
							field354 = field354 + (char) var2;
							field248 = true;
						}

						if (var2 == 8 && field354.length() > 0) {
							field354 = field354.substring(0, field354.length() - 1);
							field248 = true;
						}

						if (var2 == 13 || var2 == 10) {
							if (field354.length() > 0) {
								int var12 = 0;
								try {
									var12 = Integer.parseInt(field354);
								} catch (Exception var22) {
								}

								field242.method452(42);
								field242.method457(var12);
							}

							field489 = 0;
							field248 = true;
						}
					} else if (field489 == 2) {
						if (var2 >= 32 && var2 <= 122 && field354.length() < 12) {
							field354 = field354 + (char) var2;
							field248 = true;
						}

						if (var2 == 8 && field354.length() > 0) {
							field354 = field354.substring(0, field354.length() - 1);
							field248 = true;
						}

						if (var2 == 13 || var2 == 10) {
							if (field354.length() > 0) {
								field242.method452(91);
								field242.method459(CSEYUXAS.method216(field354));
							}

							field489 = 0;
							field248 = true;
						}
					} else if (field523 == -1 && field357 == -1) {
						if (var2 >= 32 && var2 <= 122 && field436.length() < 80) {
							field436 = field436 + (char) var2;
							field248 = true;
						}

						if (var2 == 8 && field436.length() > 0) {
							field436 = field436.substring(0, field436.length() - 1);
							field248 = true;
						}

						if ((var2 == 13 || var2 == 10) && field436.length() > 0) {
							if (field180 == 2) {
								if (field436.equals("::clientdrop")) {
									method175();
								}

								if (field436.equals("::lag")) {
									method198();
								}

								if (field436.equals("::prefetchmusic")) {
									for (int var13 = 0; var13 < field359.method301(2); var13++) {
										field359.method288((byte) 1, 2, var13);
									}
								}

								if (field436.equals("::fpson")) {
									field240 = true;
								}

								if (field436.equals("::fpsoff")) {
									field240 = false;
								}

								if (field436.equals("::noclip")) {
									for (int var14 = 0; var14 < 4; var14++) {
										for (int var15 = 1; var15 < 103; var15++) {
											for (int var16 = 1; var16 < 103; var16++) {
												field308[var14].field1057[var15][var16] = 0;
											}
										}
									}
								}
							}

							if (field436.startsWith("::")) {
								field242.method452(180);
								field242.method453(field436.length() - 1);
								field242.method460(field436.substring(2));
							} else {
								String var17 = field436.toLowerCase();
								byte var18 = 0;
								if (var17.startsWith("yellow:")) {
									var18 = 0;
									field436 = field436.substring(7);
								} else if (var17.startsWith("red:")) {
									var18 = 1;
									field436 = field436.substring(4);
								} else if (var17.startsWith("green:")) {
									var18 = 2;
									field436 = field436.substring(6);
								} else if (var17.startsWith("cyan:")) {
									var18 = 3;
									field436 = field436.substring(5);
								} else if (var17.startsWith("purple:")) {
									var18 = 4;
									field436 = field436.substring(7);
								} else if (var17.startsWith("white:")) {
									var18 = 5;
									field436 = field436.substring(6);
								} else if (var17.startsWith("flash1:")) {
									var18 = 6;
									field436 = field436.substring(7);
								} else if (var17.startsWith("flash2:")) {
									var18 = 7;
									field436 = field436.substring(7);
								} else if (var17.startsWith("flash3:")) {
									var18 = 8;
									field436 = field436.substring(7);
								} else if (var17.startsWith("glow1:")) {
									var18 = 9;
									field436 = field436.substring(6);
								} else if (var17.startsWith("glow2:")) {
									var18 = 10;
									field436 = field436.substring(6);
								} else if (var17.startsWith("glow3:")) {
									var18 = 11;
									field436 = field436.substring(6);
								}

								String var19 = field436.toLowerCase();
								byte var20 = 0;
								if (var19.startsWith("wave:")) {
									var20 = 1;
									field436 = field436.substring(5);
								} else if (var19.startsWith("wave2:")) {
									var20 = 2;
									field436 = field436.substring(6);
								} else if (var19.startsWith("shake:")) {
									var20 = 3;
									field436 = field436.substring(6);
								} else if (var19.startsWith("scroll:")) {
									var20 = 4;
									field436 = field436.substring(7);
								} else if (var19.startsWith("slide:")) {
									var20 = 5;
									field436 = field436.substring(6);
								}

								field242.method452(161);
								field242.method453(0);
								int var21 = field242.field1139;
								field242.method481(var20);
								field242.method479(var18);
								field543.field1139 = 0;
								RTTNUYFU.method563(field436, field543);
								field242.method461(0, field543.field1138, field543.field1139);
								field242.method462(field242.field1139 - var21);
								field436 = RTTNUYFU.method564(field436);
								field436 = DYUQECMZ.method254(field436);
								field548.field1383 = field436;
								field548.field1421 = var18;
								field548.field1384 = var20;
								field548.field1393 = 150;

								if (field180 == 2) {
									method184(2, field548.field1383, "@cr2@" + field548.field1039);
								} else if (field180 == 1) {
									method184(2, field548.field1383, "@cr1@" + field548.field1039);
								} else {
									method184(2, field548.field1383, field548.field1039);
								}

								if (field503 == 2) {
									field503 = 3;
									field257 = true;
									field242.method452(245);
									field242.method453(field503);
									field242.method453(field601);
									field242.method453(field387);
								}
							}

							field436 = "";
							field248 = true;
						}
					}
				}

				if (var2 == 8 && field295.length() > 0) {
					field295 = field295.substring(0, field295.length() - 1);
				}
			} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);

			if (field295.length() < 12) {
				field295 = field295 + (char) var2;
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method179() {
		if (field474 == 2) {
			for (WGYERDQO var1 = (WGYERDQO) field368.method402(); var1 != null; var1 = (WGYERDQO) field368.method404()) {
				if (var1.field1468 > 0) {
					var1.field1468--;
				}

				if (var1.field1468 != 0) {
					if (var1.field1457 > 0) {
						var1.field1457--;
					}

					if (var1.field1457 == 0 && var1.field1466 >= 1 && var1.field1467 >= 1 && var1.field1466 <= 102 && var1.field1467 <= 102 && (var1.field1458 < 0 || QQKEKZOD.method554(var1.field1458, var1.field1460))) {
						method215(var1.field1464, var1.field1465, var1.field1460, var1.field1458, var1.field1466, var1.field1459, var1.field1467);
						var1.field1457 = -1;

						if (var1.field1461 == var1.field1458 && var1.field1461 == -1) {
							var1.method579();
						} else if (var1.field1461 == var1.field1458 && var1.field1462 == var1.field1459 && var1.field1463 == var1.field1460) {
							var1.method579();
						}
					}
				} else if (var1.field1461 < 0 || QQKEKZOD.method554(var1.field1461, var1.field1463)) {
					method215(var1.field1464, var1.field1465, var1.field1463, var1.field1461, var1.field1466, var1.field1462, var1.field1467);
					var1.method579();
				}
			}

			field277++;
			if (field277 > 1748) {
				field277 = 0;
				field242.method452(152);
				field242.method453(0);
				int var2 = field242.field1139;
				field242.method453(128);
				field242.method453(51);

				if ((int) (Math.random() * 2.0D) == 0) {
					field242.method453(195);
				}

				field242.method453(100);
				field242.method454(53801);
				field242.method453(80);
				field242.method454(64011);
				field242.method454(50823);

				if ((int) (Math.random() * 2.0D) == 0) {
					field242.method453(254);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field242.method454(24931);
				}

				field242.method462(field242.field1139 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method180() {
		field446.method509();
		GAGDRMEJ.field815 = field224;
		field195.method589(0, 0);

		if (field246 != -1) {
			method85(0, GMYKUSOM.method350(field246), 0, 0);
		} else if (field408[field428] != -1) {
			method85(0, GMYKUSOM.method350(field408[field428]), 0, 0);
		}

		if (field444 && field480 == 1) {
			method196();
		}

		field446.method510(553, 205, field64);
		field448.method509();
		GAGDRMEJ.field815 = field225;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method14() {
		signlink.reporterror = false;

		try {
			if (field276 != null) {
				field276.method352();
			}
		} catch (Exception var1) {
		}

		field276 = null;
		method88();

		if (field420 != null) {
			field420.field1154 = false;
		}

		field420 = null;
		field359.method302();
		field359 = null;
		field543 = null;
		field242 = null;
		field301 = null;
		field457 = null;
		field287 = null;
		field342 = null;
		field565 = null;
		field288 = null;
		field289 = null;
		field293 = null;
		field433 = null;
		field320 = null;
		field308 = null;
		field598 = null;
		field618 = null;
		field524 = null;
		field525 = null;
		field562 = null;
		field446 = null;
		field447 = null;
		field448 = null;
		field449 = null;
		field215 = null;
		field216 = null;
		field217 = null;
		field345 = null;
		field346 = null;
		field347 = null;
		field348 = null;
		field349 = null;
		field350 = null;
		field351 = null;
		field352 = null;
		field353 = null;
		field195 = null;
		field196 = null;
		field197 = null;
		field581 = null;
		field582 = null;
		field583 = null;
		field541 = null;
		field282 = null;
		field283 = null;
		field284 = null;
		field285 = null;
		field286 = null;
		field233 = null;
		field234 = null;
		field235 = null;
		field236 = null;
		field237 = null;
		field337 = null;
		field462 = null;
		field526 = null;
		field360 = null;
		field418 = null;
		field456 = null;
		field452 = null;
		field369 = null;
		field370 = null;
		field371 = null;
		field372 = null;
		field373 = null;
		field192 = null;
		field587 = null;
		field203 = null;
		field574 = null;
		field576 = null;
		field578 = null;
		field579 = null;
		field300 = null;
		field544 = null;
		field546 = null;
		field305 = null;
		field368 = null;
		field508 = null;
		field460 = null;
		field321 = null;
		field322 = null;
		field323 = null;
		field324 = null;
		field388 = null;
		field313 = null;
		field438 = null;
		field439 = null;
		field272 = null;
		field271 = null;
		field539 = null;
		field443 = null;
		field505 = null;
		field467 = null;
		field468 = null;
		field464 = null;
		field465 = null;
		field466 = null;
		field469 = null;
		field470 = null;
		field471 = null;
		field472 = null;
		method104();
		OEPVRTCC.method520();
		DUHKBPRV.method239();
		HHBFOKVP.method362();
		GMYKUSOM.method344();
		EHKXAJCO.field703 = null;
		BGEILVDT.field100 = null;
		EGOPPTET.field692 = null;
		WOTIAWQC.field1470 = null;
		IMWZJOXU.field992 = null;
		IMWZJOXU.field1004 = null;
		CUNNWCIM.field623 = null;
		field65 = null;
		ISLZFAII.field1023 = null;
		GAGDRMEJ.method325();
		BJATBFRK.method26();
		LSSDQDBV.method419();
		YGZNOIUP.method597();
		System.gc();
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method181() {
		for (int var1 = 0; var1 < field218; var1++) {
			if (field423[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field181[var1] != field367 || field619[var1] != field381) {
						LZWRHABP var3 = MNBSCLLD.method503(field181[var1], field619[var1]);
						if (System.currentTimeMillis() + var3.field1139 / 22 > field291 / 22 + field375) {
							field291 = var3.field1139;
							field375 = System.currentTimeMillis();

							if (method116(var3.field1138, var3.field1139)) {
								field367 = field181[var1];
								field381 = field619[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method194()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field423[var1] != -5) {
					field423[var1] = -5;
				} else {
					field218--;
					for (int var5 = var1; var5 < field218; var5++) {
						field181[var5] = field181[var5 + 1];
						field619[var5] = field619[var5 + 1];
						field423[var5] = field423[var5 + 1];
					}

					var1--;
				}
			} else {
				field423[var1]--;
			}
		}

		if (field453 > 0) {
			field453 -= 20;
			if (field453 < 0) {
				field453 = 0;
			}

			if (field453 == 0 && field268 && !field488) {
				field329 = field182;
				field330 = true;
				field359.method307(2, field329);
				return;
			}
		}
	}

	@ObfuscatedName("client.e(ZI)V")
	public final void method182(boolean arg0) {
		method79();
		field466.method509();
		field475.method589(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field417 == 0) {
			int var4 = var3 / 2 + 80;
			field411.method311(true, var4, var2 / 2, field359.field738, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field413.method311(true, var5, var2 / 2, "Welcome to RuneScape", 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field476.method589(var6 - 73, var7 - 20);
			field413.method311(true, var7 + 5, var6, "New User", 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field476.method589(var8 - 73, var7 - 20);
			field413.method311(true, var7 + 5, var8, "Existing User", 0xFFFFFF);
		}

		if (field417 == 2) {
			int var9 = var3 / 2 - 40;
			if (field554.length() > 0) {
				field413.method311(true, var9 - 15, var2 / 2, field554, 0xFFFF00);
				field413.method311(true, var9, var2 / 2, field555, 0xFFFF00);
				var9 += 30;
			} else {
				field413.method311(true, var9 - 7, var2 / 2, field555, 0xFFFF00);
				var9 += 30;
			}

			field413.method318(var9, 0xFFFFFF, true, var2 / 2 - 90, "Username: " + field316 + (field620 == 0 & field211 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field413.method318(var9, 0xFFFFFF, true, var2 / 2 - 88, "Password: " + CSEYUXAS.method221(field317) + (field620 == 1 & field211 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field476.method589(var10 - 73, var11 - 20);
				field413.method311(true, var11 + 5, var10, "Login", 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field476.method589(var12 - 73, var11 - 20);
				field413.method311(true, var11 + 5, var12, "Cancel", 0xFFFFFF);
			}
		}

		if (field417 == 3) {
			field413.method311(true, var3 / 2 - 60, var2 / 2, "Create a free account", 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field413.method311(true, var13, var2 / 2, "To create a new account you need to", 0xFFFFFF);
			var13 += 15;
			field413.method311(true, var13, var2 / 2, "go back to the main RuneScape webpage", 0xFFFFFF);
			var13 += 15;
			field413.method311(true, var13, var2 / 2, "and choose the 'create account'", 0xFFFFFF);
			var13 += 15;
			field413.method311(true, var13, var2 / 2, "button near the top of that page.", 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field476.method589(var14 - 73, var15 - 20);
			field413.method311(true, var15 + 5, var14, "Cancel", 0xFFFFFF);
		}

		field466.method510(202, 171, field64);

		if (field617) {
			field617 = false;
			field464.method510(128, 0, field64);
			field465.method510(202, 371, field64);
			field469.method510(0, 265, field64);
			field470.method510(562, 265, field64);
			field471.method510(128, 171, field64);
			field472.method510(562, 171, field64);
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method183(int arg0) {
		int[] var2 = field271.field1011;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field433[arg0][var7][var5] & 0x18) == 0) {
					field320.method62(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field433[arg0 + 1][var7][var5] & 0x8) != 0) {
					field320.method62(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field271.method382();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field433[arg0][var11][var10] & 0x18) == 0) {
					method202(var10, arg0, var8, var9, var11);
				}

				if (arg0 < 3 && (field433[arg0 + 1][var11][var10] & 0x8) != 0) {
					method202(var10, arg0 + 1, var8, var9, var11);
				}
			}
		}

		if (field448 != null) {
			field448.method509();
			GAGDRMEJ.field815 = field225;
		}

		field437 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field320.method56(field580, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = OEPVRTCC.method522(var14).field1215;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field308[field580].field1057;
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

						field272[field437] = field587[var15];
						field438[field437] = var16;
						field439[field437] = var17;
						field437++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ZLjava/lang/String;)V")
	public final void method184(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field510 != -1) {
			field326 = arg1;
			field78 = 0;
		}

		if (field523 == -1) {
			field248 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field273[var4] = field273[var4 - 1];
			field274[var4] = field274[var4 - 1];
			field275[var4] = field275[var4 - 1];
		}

		field273[0] = arg0;
		field274[0] = arg2;
		field275[0] = arg1;
	}

	@ObfuscatedName("client.a(ZILGMYKUSOM;IIIII)V")
	public final void method185(int arg0, GMYKUSOM arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1.field903 == 0 && arg1.field890 != null && !arg1.field894 && (arg3 >= arg2 && arg6 >= arg0 && arg3 <= arg1.field891 + arg2 && arg6 <= arg1.field860 + arg0)) {
			int var8 = arg1.field890.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg1.field874[var9] + arg2;
				int var11 = arg1.field865[var9] + arg0 - arg5;
				GMYKUSOM var12 = GMYKUSOM.method350(arg1.field890[var9]);
				var10 += var12.field845;
				var11 += var12.field866;
				if ((var12.field892 >= 0 || var12.field886 != 0) && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field891 + var10 && arg6 < var12.field860 + var11) {
					if (var12.field892 >= 0) {
						field600 = var12.field892;
					} else {
						field600 = var12.field843;
					}
				}

				if (var12.field903 == 8 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field891 + var10 && arg6 < var12.field860 + var11) {
					field244 = var12.field843;
				}

				if (var12.field903 == 0) {
					method185(var11, var12, var10, arg3, arg4, var12.field905, arg6);

					if (var12.field882 > var12.field860) {
						method135(var12.field860, var11, var12.field891 + var10, var12, arg6, arg4, arg3, var12.field882);
					}
				} else {
					if (var12.field880 == 1 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field891 + var10 && arg6 < var12.field860 + var11) {
						boolean var13 = false;
						if (var12.field899 != 0) {
							var13 = method117(var12);
						}

						if (!var13) {
							field388[field232] = var12.field877;
							field323[field232] = 87;
							field322[field232] = var12.field843;
							field232++;
						}
					}

					if (var12.field880 == 2 && field259 == 0 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field891 + var10 && arg6 < var12.field860 + var11) {
						String var14 = var12.field852;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field388[field232] = var14 + " @gre@" + var12.field862;
						field323[field232] = 130;
						field322[field232] = var12.field843;
						field232++;
					}

					if (var12.field880 == 3 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field891 + var10 && arg6 < var12.field860 + var11) {
						field388[field232] = "Close";

						if (arg4 == 3) {
							field323[field232] = 61;
						} else {
							field323[field232] = 15;
						}

						field322[field232] = var12.field843;
						field232++;
					}

					if (var12.field880 == 4 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field891 + var10 && arg6 < var12.field860 + var11) {
						field388[field232] = var12.field877;
						field323[field232] = 383;
						field322[field232] = var12.field843;
						field232++;
					}

					if (var12.field880 == 5 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field891 + var10 && arg6 < var12.field860 + var11) {
						field388[field232] = var12.field877;
						field323[field232] = 647;
						field322[field232] = var12.field843;
						field232++;
					}

					if (var12.field880 == 6 && !field304 && arg3 >= var10 && arg6 >= var11 && arg3 < var12.field891 + var10 && arg6 < var12.field860 + var11) {
						field388[field232] = var12.field877;
						field323[field232] = 62;
						field322[field232] = var12.field843;
						field232++;
					}

					if (var12.field903 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field860; var16++) {
							for (int var17 = 0; var17 < var12.field891; var17++) {
								int var18 = (var12.field910 + 32) * var17 + var10;
								int var19 = (var12.field883 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field844[var15];
									var19 += var12.field881[var15];
								}

								if (arg3 >= var18 && arg6 >= var19 && arg3 < var18 + 32 && arg6 < var19 + 32) {
									field219 = var15;
									field220 = var12.field843;

									if (var12.field912[var15] > 0) {
										HHBFOKVP var20 = HHBFOKVP.method367(var12.field912[var15] - 1);
										if (field376 == 1 && var12.field879) {
											if (field378 != var12.field843 || field377 != var15) {
												field388[field232] = "Use " + field380 + " with @lre@" + var20.field956;
												field323[field232] = 842;
												field324[field232] = var20.field979;
												field321[field232] = var15;
												field322[field232] = var12.field843;
												field232++;
											}
										} else if (field259 != 1 || !var12.field879) {
											if (var12.field879) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field948 != null && var20.field948[var21] != null) {
														field388[field232] = var20.field948[var21] + " @lre@" + var20.field956;

														if (var21 == 3) {
															field323[field232] = 371;
														}

														if (var21 == 4) {
															field323[field232] = 88;
														}

														field324[field232] = var20.field979;
														field321[field232] = var15;
														field322[field232] = var12.field843;
														field232++;
													} else if (var21 == 4) {
														field388[field232] = "Drop @lre@" + var20.field956;
														field323[field232] = 88;
														field324[field232] = var20.field979;
														field321[field232] = var15;
														field322[field232] = var12.field843;
														field232++;
													}
												}
											}

											if (var12.field900) {
												field388[field232] = "Use @lre@" + var20.field956;
												field323[field232] = 831;
												field324[field232] = var20.field979;
												field321[field232] = var15;
												field322[field232] = var12.field843;
												field232++;
											}

											if (var12.field879 && var20.field948 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field948[var22] != null) {
														field388[field232] = var20.field948[var22] + " @lre@" + var20.field956;

														if (var22 == 0) {
															field323[field232] = 341;
														}

														if (var22 == 1) {
															field323[field232] = 228;
														}

														if (var22 == 2) {
															field323[field232] = 155;
														}

														field324[field232] = var20.field979;
														field321[field232] = var15;
														field322[field232] = var12.field843;
														field232++;
													}
												}
											}

											if (var12.field841 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field841[var23] != null) {
														field388[field232] = var12.field841[var23] + " @lre@" + var20.field956;

														if (var23 == 0) {
															field323[field232] = 532;
														}

														if (var23 == 1) {
															field323[field232] = 614;
														}

														if (var23 == 2) {
															field323[field232] = 156;
														}

														if (var23 == 3) {
															field323[field232] = 798;
														}

														if (var23 == 4) {
															field323[field232] = 346;
														}

														field324[field232] = var20.field979;
														field321[field232] = var15;
														field322[field232] = var12.field843;
														field232++;
													}
												}
											}

											field388[field232] = "Examine @lre@" + var20.field956;
											field323[field232] = 1753;
											field324[field232] = var20.field979;
											field321[field232] = var15;
											field322[field232] = var12.field843;
											field232++;
										} else if ((field261 & 0x10) == 0x10) {
											field388[field232] = field262 + " @lre@" + var20.field956;
											field323[field232] = 154;
											field324[field232] = var20.field979;
											field321[field232] = var15;
											field322[field232] = var12.field843;
											field232++;
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

	@ObfuscatedName("client.d(I)V")
	public final void method15() {
		if (field204 || field440 || field243) {
			method204();
		} else {
			field502++;

			if (field477) {
				method103();
			} else {
				method182(false);
			}

			field307 = 0;
		}
	}

	@ObfuscatedName("client.a(ILDUHKBPRV;III)V")
	public final void method186(int arg0, DUHKBPRV arg1, int arg2, int arg3) {
		if (field232 < 400) {
			if (arg1.field671 != null) {
				arg1 = arg1.method237();
			}

			if (arg1 != null && arg1.field656) {
				String var5 = arg1.field649;
				if (arg1.field650 != 0) {
					var5 = var5 + method142(field548.field1026, arg1.field650) + " (level-" + arg1.field650 + ")";
				}

				if (field376 == 1) {
					field388[field232] = "Use " + field380 + " with @yel@" + var5;
					field323[field232] = 401;
					field324[field232] = arg0;
					field321[field232] = arg2;
					field322[field232] = arg3;
					field232++;
				} else if (field259 != 1) {
					if (arg1.field670 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field670[var6] != null && !arg1.field670[var6].equalsIgnoreCase("attack")) {
								field388[field232] = arg1.field670[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field323[field232] = 456;
								}

								if (var6 == 1) {
									field323[field232] = 111;
								}

								if (var6 == 2) {
									field323[field232] = 984;
								}

								if (var6 == 3) {
									field323[field232] = 175;
								}

								if (var6 == 4) {
									field323[field232] = 908;
								}

								field324[field232] = arg0;
								field321[field232] = arg2;
								field322[field232] = arg3;
								field232++;
							}
						}
					}

					if (arg1.field670 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field670[var7] != null && arg1.field670[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field650 > field548.field1026) {
									var8 = 2000;
								}

								field388[field232] = arg1.field670[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field323[field232] = var8 + 456;
								}

								if (var7 == 1) {
									field323[field232] = var8 + 111;
								}

								if (var7 == 2) {
									field323[field232] = var8 + 984;
								}

								if (var7 == 3) {
									field323[field232] = var8 + 175;
								}

								if (var7 == 4) {
									field323[field232] = var8 + 908;
								}

								field324[field232] = arg0;
								field321[field232] = arg2;
								field322[field232] = arg3;
								field232++;
							}
						}
					}

					field388[field232] = "Examine @yel@" + var5;
					field323[field232] = 1698;
					field324[field232] = arg0;
					field321[field232] = arg2;
					field322[field232] = arg3;
					field232++;
				} else if ((field261 & 0x2) == 2) {
					field388[field232] = field262 + " @yel@" + var5;
					field323[field232] = 722;
					field324[field232] = arg0;
					field321[field232] = arg2;
					field322[field232] = arg3;
					field232++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IILLZWRHABP;)V")
	public final void method187(int arg0, LZWRHABP arg1) {
		while (arg1.field1140 + 10 < arg0 * 8) {
			int var3 = arg1.method474(11);
			if (var3 == 2047) {
				break;
			}

			if (field574[var3] == null) {
				field574[var3] = new ISLZFAII();
				if (field579[var3] != null) {
					field574[var3].method395(field579[var3]);
				}
			}

			field576[field575++] = var3;
			ISLZFAII var4 = field574[var3];
			var4.field1410 = field211;
			int var5 = arg1.method474(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method474(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method474(1);
			int var8 = arg1.method474(1);
			if (var8 == 1) {
				field578[field577++] = var3;
			}

			var4.method575(field548.field1399[0] + var5, var7 == 1, field548.field1398[0] + var6);
		}

		arg1.method475();
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method188(String arg0) throws IOException {
		if (field463) {
			if (field416 != null) {
				try {
					field416.close();
				} catch (Exception var4) {
				}

				field416 = null;
			}

			field416 = method191(43595);
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

	@ObfuscatedName("client.b(JI)V")
	public final void method189(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field608; var3++) {
				if (field302[var3] == arg0) {
					field608--;
					field479 = true;

					for (int var4 = var3; var4 < field608; var4++) {
						field302[var4] = field302[var4 + 1];
					}

					field242.method452(196);
					field242.method459(arg0);
					return;
				}
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method190() {
		if (field547 != 0) {
			int var1 = 0;
			if (field364 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field275[var2] != null) {
					int var3 = field273[var2];
					String var4 = field274[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field601 == 0 || field601 == 1 && method195(var4))) {
						int var8 = 329 - var1 * 13;
						if (field72 > 4 && field73 - 4 > var8 - 10 && field73 - 4 <= var8 + 3) {
							int var9 = field412.method312("From:  " + var4 + field275[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field72 < var9 + 4) {
								if (field180 >= 1) {
									field388[field232] = "Report abuse @whi@" + var4;
									field323[field232] = 2460;
									field232++;
								}

								field388[field232] = "Add ignore @whi@" + var4;
								field323[field232] = 2766;
								field232++;
								field388[field232] = "Add friend @whi@" + var4;
								field323[field232] = 2571;
								field232++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field601 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)Ljava/net/Socket;")
	public final Socket method191(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.h(II)V")
	public final void method192(int arg0, int arg1) {
		JSAXNSIH var3 = field305[field580][arg0][arg1];
		if (var3 == null) {
			field320.method48(field580, arg0, arg1);
		} else {
			int var4 = -99999999;
			FEZCJZIH var5 = null;
			for (FEZCJZIH var6 = (FEZCJZIH) var3.method402(); var6 != null; var6 = (FEZCJZIH) var3.method404()) {
				HHBFOKVP var7 = HHBFOKVP.method367(var6.field755);
				int var8 = var7.field982;
				if (var7.field943) {
					var8 = (var6.field754 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method400(var5);
			FEZCJZIH var9 = null;
			FEZCJZIH var10 = null;
			for (FEZCJZIH var11 = (FEZCJZIH) var3.method402(); var11 != null; var11 = (FEZCJZIH) var3.method404()) {
				if (var5.field755 != var11.field755 && var9 == null) {
					var9 = var11;
				}

				if (var5.field755 != var11.field755 && var9.field755 != var11.field755 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field320.method34(var12, field580, var5, arg1, var10, var9, arg0, method171(arg1 * 128 + 64, arg0 * 128 + 64, field580));
		}
	}

	@ObfuscatedName("client.j(B)V")
	public static final void method193() {
		BJATBFRK.field107 = true;
		GAGDRMEJ.field804 = true;
		field488 = true;
		QQKEKZOD.field1306 = true;
		OEPVRTCC.field1238 = true;
	}

	@ObfuscatedName("client.H(I)Z")
	public final boolean method194() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a()V")
	public final void method12() {
		method19(20, "Starting up");

		if (signlink.sunjava) {
			field58 = 5;
		}

		if (field422) {
			field204 = true;
		} else {
			field422 = true;
			boolean var1 = false;
			String var2 = method134();
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
						field374[var3] = new AIGFCJME(500000, signlink.cache_dat, signlink.cache_idx[var3], var3 + 1);
					}
				}

				try {
					method94();
					field312 = method133("title", 25, field228[1], "title screen", 1);
					field411 = new FUOSCRKP(false, "p11_full", field312);
					field412 = new FUOSCRKP(false, "p12_full", field312);
					field413 = new FUOSCRKP(false, "b12_full", field312);
					field414 = new FUOSCRKP(true, "q8_full", field312);
					method168();
					method120();
					SRZUEVOD var4 = method133("config", 30, field228[2], "config", 2);
					SRZUEVOD var5 = method133("interface", 35, field228[3], "interface", 3);
					SRZUEVOD var6 = method133("media", 40, field228[4], "2d graphics", 4);
					SRZUEVOD var7 = method133("textures", 45, field228[6], "textures", 6);
					SRZUEVOD var8 = method133("wordenc", 50, field228[7], "chat system", 7);
					SRZUEVOD var9 = method133("sounds", 55, field228[8], "sound effects", 8);
					field433 = new byte[4][104][104];
					field293 = new int[4][105][105];
					field320 = new BJATBFRK(104, 104, 4, field293);

					for (int var10 = 0; var10 < 4; var10++) {
						field308[var10] = new KZCDTFDB(104, 104);
					}

					field271 = new INRTBCYJ(512, 512);
					SRZUEVOD var11 = method133("versionlist", 60, field228[5], "update list", 5);
					method19(60, "Connecting to update server");
					field359 = new EWALAKUU();
					field359.method306(var11, this);
					YGZNOIUP.method595(field359.method286());
					LSSDQDBV.method420(field359.method301(0), field359);

					if (!field488) {
						field329 = 0;
						field330 = true;
						field359.method307(2, field329);

						while (field359.method289() > 0) {
							method212();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field359.field715 > 3) {
								method152("ondemand");
								return;
							}
						}
					}

					method19(65, "Requesting animations");
					int var12 = field359.method301(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field359.method307(1, var13);
					}

					while (field359.method289() > 0) {
						int var14 = var12 - field359.method289();
						if (var14 > 0) {
							method19(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method212();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field359.field715 > 3) {
							method152("ondemand");
							return;
						}
					}

					method19(70, "Requesting models");
					int var15 = field359.method301(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field359.method304(var16);
						if ((var17 & 0x1) != 0) {
							field359.method307(0, var16);
						}
					}

					int var18 = field359.method289();
					while (field359.method289() > 0) {
						int var19 = var18 - field359.method289();
						if (var19 > 0) {
							method19(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method212();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field374[0] != null) {
						method19(75, "Requesting maps");
						field359.method307(3, field359.method297(48, 47, 0));
						field359.method307(3, field359.method297(48, 47, 1));
						field359.method307(3, field359.method297(48, 48, 0));
						field359.method307(3, field359.method297(48, 48, 1));
						field359.method307(3, field359.method297(48, 49, 0));
						field359.method307(3, field359.method297(48, 49, 1));
						field359.method307(3, field359.method297(47, 47, 0));
						field359.method307(3, field359.method297(47, 47, 1));
						field359.method307(3, field359.method297(47, 48, 0));
						field359.method307(3, field359.method297(47, 48, 1));
						field359.method307(3, field359.method297(148, 48, 0));
						field359.method307(3, field359.method297(148, 48, 1));
						int var20 = field359.method289();
						while (field359.method289() > 0) {
							int var21 = var20 - field359.method289();
							if (var21 > 0) {
								method19(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method212();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field359.method301(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field359.method304(var23);
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
							field359.method288(var25, 0, var23);
						}
					}

					field359.method290(field487);

					if (!field488) {
						int var26 = field359.method301(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field359.method295(var27)) {
								field359.method288((byte) 1, 2, var27);
							}
						}
					}

					method19(80, "Unpacking media");
					field195 = new XRUIQOVM(var6, "invback", 0);
					field197 = new XRUIQOVM(var6, "chatback", 0);
					field196 = new XRUIQOVM(var6, "mapback", 0);
					field581 = new XRUIQOVM(var6, "backbase1", 0);
					field582 = new XRUIQOVM(var6, "backbase2", 0);
					field583 = new XRUIQOVM(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field541[var28] = new XRUIQOVM(var6, "sideicons", var28);
					}

					field337 = new INRTBCYJ(var6, "compass", 0);
					field258 = new INRTBCYJ(var6, "mapedge", 0);
					field258.method384();

					for (int var29 = 0; var29 < 72; var29++) {
						field192[var29] = new XRUIQOVM(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field587[var30] = new INRTBCYJ(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field462[var31] = new INRTBCYJ(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field526[var32] = new INRTBCYJ(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field360[var33] = new INRTBCYJ(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field418[var34] = new INRTBCYJ(var6, "headicons_hint", var34);
					}

					field452 = new INRTBCYJ(var6, "overlay_multiway", 0);
					field318 = new INRTBCYJ(var6, "mapmarker", 0);
					field319 = new INRTBCYJ(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field456[var35] = new INRTBCYJ(var6, "cross", var35);
					}

					field369 = new INRTBCYJ(var6, "mapdots", 0);
					field370 = new INRTBCYJ(var6, "mapdots", 1);
					field371 = new INRTBCYJ(var6, "mapdots", 2);
					field372 = new INRTBCYJ(var6, "mapdots", 3);
					field373 = new INRTBCYJ(var6, "mapdots", 4);
					field527 = new XRUIQOVM(var6, "scrollbar", 0);
					field528 = new XRUIQOVM(var6, "scrollbar", 1);
					field282 = new XRUIQOVM(var6, "redstone1", 0);
					field283 = new XRUIQOVM(var6, "redstone2", 0);
					field284 = new XRUIQOVM(var6, "redstone3", 0);
					field285 = new XRUIQOVM(var6, "redstone1", 0);
					field285.method586();
					field286 = new XRUIQOVM(var6, "redstone2", 0);
					field286.method586();
					field233 = new XRUIQOVM(var6, "redstone1", 0);
					field233.method587();
					field234 = new XRUIQOVM(var6, "redstone2", 0);
					field234.method587();
					field235 = new XRUIQOVM(var6, "redstone3", 0);
					field235.method587();
					field236 = new XRUIQOVM(var6, "redstone1", 0);
					field236.method586();
					field236.method587();
					field237 = new XRUIQOVM(var6, "redstone2", 0);
					field237.method586();
					field237.method587();

					for (int var36 = 0; var36 < 2; var36++) {
						field356[var36] = new XRUIQOVM(var6, "mod_icons", var36);
					}

					INRTBCYJ var37 = new INRTBCYJ(var6, "backleft1", 0);
					field345 = new NMOELDRY(var37.field1013, var37.field1012, method17());
					var37.method385(0, 0);
					INRTBCYJ var38 = new INRTBCYJ(var6, "backleft2", 0);
					field346 = new NMOELDRY(var38.field1013, var38.field1012, method17());
					var38.method385(0, 0);
					INRTBCYJ var39 = new INRTBCYJ(var6, "backright1", 0);
					field347 = new NMOELDRY(var39.field1013, var39.field1012, method17());
					var39.method385(0, 0);
					INRTBCYJ var40 = new INRTBCYJ(var6, "backright2", 0);
					field348 = new NMOELDRY(var40.field1013, var40.field1012, method17());
					var40.method385(0, 0);
					INRTBCYJ var41 = new INRTBCYJ(var6, "backtop1", 0);
					field349 = new NMOELDRY(var41.field1013, var41.field1012, method17());
					var41.method385(0, 0);
					INRTBCYJ var42 = new INRTBCYJ(var6, "backvmid1", 0);
					field350 = new NMOELDRY(var42.field1013, var42.field1012, method17());
					var42.method385(0, 0);
					INRTBCYJ var43 = new INRTBCYJ(var6, "backvmid2", 0);
					field351 = new NMOELDRY(var43.field1013, var43.field1012, method17());
					var43.method385(0, 0);
					INRTBCYJ var44 = new INRTBCYJ(var6, "backvmid3", 0);
					field352 = new NMOELDRY(var44.field1013, var44.field1012, method17());
					var44.method385(0, 0);
					INRTBCYJ var45 = new INRTBCYJ(var6, "backhmid2", 0);
					field353 = new NMOELDRY(var45.field1013, var45.field1012, method17());
					var45.method385(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field587[var50] != null) {
							field587[var50].method383(var46 + var49, var48 + var49, var47 + var49);
						}

						if (field192[var50] != null) {
							field192[var50].method588(var46 + var49, var48 + var49, var47 + var49);
						}
					}

					method19(83, "Unpacking textures");
					GAGDRMEJ.method330(var7);
					GAGDRMEJ.method334(0.8D);
					GAGDRMEJ.method329(20);
					method19(86, "Unpacking config");
					WOTIAWQC.method580(var4);
					OEPVRTCC.method517(var4);
					EHKXAJCO.method282(var4);
					HHBFOKVP.method369(var4);
					DUHKBPRV.method236(var4);
					BGEILVDT.method20(var4);
					IMWZJOXU.method376(var4);
					CUNNWCIM.method222(var4);
					RCLYPSZZ.method560(var4);
					HHBFOKVP.field953 = field487;

					if (!field488) {
						method19(90, "Unpacking sounds");
						byte[] var51 = var9.method566("sounds.dat", null);
						LZWRHABP var52 = new LZWRHABP(var51);
						MNBSCLLD.method502(var52);
					}

					method19(95, "Unpacking interfaces");
					FUOSCRKP[] var53 = new FUOSCRKP[] { field411, field412, field413, field414 };
					GMYKUSOM.method346(var5, var6, var53);
					method19(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field196.field1495[field196.field1497 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field238[var54] = var55;
						field461[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field196.field1495[field196.field1497 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field184[var58 - 5] = var59 - 25;
						field613[var58 - 5] = var60 - var59;
					}

					GAGDRMEJ.method327(765, 503);
					field226 = GAGDRMEJ.field815;
					GAGDRMEJ.method327(479, 96);
					field223 = GAGDRMEJ.field815;
					GAGDRMEJ.method327(190, 261);
					field224 = GAGDRMEJ.field815;
					GAGDRMEJ.method327(512, 334);
					field225 = GAGDRMEJ.field815;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = GAGDRMEJ.field813[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					BJATBFRK.method63(800, 500, 334, 512, var62);
					DYUQECMZ.method244(var8);
					field420 = new MHZWCOLS(this);
					method18(field420, 10);
					FIZEXPNW.field756 = this;
					OEPVRTCC.field1224 = this;
					DUHKBPRV.field672 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field410 + " " + field212);
					field440 = true;
				}
			} else {
				field243 = true;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method195(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field434; var2++) {
			if (arg0.equalsIgnoreCase(field539[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field548.field1039)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method196() {
		int var1 = field481;
		int var2 = field482;
		int var3 = field483;
		int var4 = field484;
		int var5 = 0x5D5447;
		CYEOWDOP.method229(var5, var3, var1, var2, var4);
		CYEOWDOP.method229(0, var3 - 2, var1 + 1, var2 + 1, 16);
		CYEOWDOP.method230(var1 + 1, var3 - 2, 0, var4 - 19, var2 + 18);
		field413.method314(var2 + 14, "Choose Option", var1 + 3, var5);
		int var6 = field72;
		int var7 = field73;
		if (field480 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field480 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field480 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field232; var8++) {
			int var9 = (field232 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field413.method318(var9, var10, true, var1 + 3, field388[var8]);
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method197(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.k(B)V")
	public void method198() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field241);

		if (field359 != null) {
			System.out.println("Od-cycle:" + field359.field728);
		}

		System.out.println("loop-cycle:" + field211);
		System.out.println("draw-cycle:" + field502);
		System.out.println("ptype:" + field332);
		System.out.println("psize:" + field331);

		if (field276 != null) {
			field276.method357();
		}

		field61 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method17() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field67 != null) {
			return field67;
		}

		return this;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method199() {
		field193++;
		method110(true);
		method172(true);
		method110(false);
		method172(false);
		method149();
		method214();

		if (!field250) {
			int var1 = field404;
			if (field504 / 256 > var1) {
				var1 = field504 / 256;
			}

			if (field296[4] && field513[4] + 128 > var1) {
				var1 = field513[4] + 128;
			}

			int var2 = field500 + field405 & 0x7FF;
			method119(var2, var1, method171(field548.field1396, field548.field1395, field580) - 50, field278, field279, var1 * 3 + 600);
		}

		int var3;
		if (field250) {
			var3 = method81();
		} else {
			var3 = method80();
		}

		int var4 = field549;
		int var5 = field550;
		int var6 = field551;
		int var7 = field552;
		int var8 = field553;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field296[var9]) {
				int var10 = (int) (Math.random() * (field315[var9] * 2 + 1) + Math.sin(field429[var9] / 100.0D * field607[var9]) * field513[var9] - field315[var9]);
				if (var9 == 0) {
					field549 += var10;
				}

				if (var9 == 1) {
					field550 += var10;
				}

				if (var9 == 2) {
					field551 += var10;
				}

				if (var9 == 3) {
					field553 = field553 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field552 += var10;
					if (field552 < 128) {
						field552 = 128;
					}

					if (field552 > 383) {
						field552 = 383;
					}
				}
			}
		}

		int var11 = GAGDRMEJ.field824;
		LSSDQDBV.field1122 = true;
		LSSDQDBV.field1125 = 0;
		LSSDQDBV.field1123 = field72 - 4;
		LSSDQDBV.field1124 = field73 - 4;
		CYEOWDOP.method227();
		field320.method66(field551, field550, field549, field553, field552, var3);
		field320.method41();
		method166();
		method160();
		method82(var11);
		method173();
		field448.method510(4, 4, field64);
		field549 = var4;
		field550 = var5;
		field551 = var6;
		field552 = var7;
		field553 = var8;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method200() {
		int var1 = field531 * 128 + 64;
		int var2 = field532 * 128 + 64;
		int var3 = method171(var2, var1, field580) - field533;

		if (field549 < var1) {
			field549 += (var1 - field549) * field535 / 1000 + field534;
			if (field549 > var1) {
				field549 = var1;
			}
		}

		if (field549 > var1) {
			field549 -= (field549 - var1) * field535 / 1000 + field534;
			if (field549 < var1) {
				field549 = var1;
			}
		}

		if (field550 < var3) {
			field550 += (var3 - field550) * field535 / 1000 + field534;
			if (field550 > var3) {
				field550 = var3;
			}
		}

		if (field550 > var3) {
			field550 -= (field550 - var3) * field535 / 1000 + field534;
			if (field550 < var3) {
				field550 = var3;
			}
		}

		if (field551 < var2) {
			field551 += (var2 - field551) * field535 / 1000 + field534;
			if (field551 > var2) {
				field551 = var2;
			}
		}

		if (field551 > var2) {
			field551 -= (field551 - var2) * field535 / 1000 + field534;
			if (field551 < var2) {
				field551 = var2;
			}
		}

		int var4 = field187 * 128 + 64;
		int var5 = field188 * 128 + 64;
		int var6 = method171(var5, var4, field580) - field189;
		int var7 = var4 - field549;
		int var8 = var6 - field550;
		int var9 = var5 - field551;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field552 < var11) {
			field552 += (var11 - field552) * field191 / 1000 + field190;
			if (field552 > var11) {
				field552 = var11;
			}
		}

		if (field552 > var11) {
			field552 -= (field552 - var11) * field191 / 1000 + field190;
			if (field552 < var11) {
				field552 = var11;
			}
		}

		int var13 = var12 - field553;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field553 += field191 * var13 / 1000 + field190;
			field553 &= 0x7FF;
		}

		if (var13 < 0) {
			field553 -= -var13 * field191 / 1000 + field190;
			field553 &= 0x7FF;
		}

		int var14 = var12 - field553;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field553 = var12;
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method201() {
		if (field449 == null) {
			method104();
			field65 = null;
			field464 = null;
			field465 = null;
			field466 = null;
			field467 = null;
			field468 = null;
			field469 = null;
			field470 = null;
			field471 = null;
			field472 = null;
			field449 = new NMOELDRY(96, 479, method17());
			field447 = new NMOELDRY(156, 172, method17());
			CYEOWDOP.method227();
			field196.method589(0, 0);
			field446 = new NMOELDRY(261, 190, method17());
			field448 = new NMOELDRY(334, 512, method17());
			CYEOWDOP.method227();
			field215 = new NMOELDRY(50, 496, method17());
			field216 = new NMOELDRY(37, 269, method17());
			field217 = new NMOELDRY(45, 249, method17());
			field617 = true;
			field448.method509();
			GAGDRMEJ.field815 = field225;
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field320.method53(arg1, arg4, arg0);
		if (var6 != 0) {
			int var7 = field320.method57(arg1, arg4, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field271.field1011;
			int var12 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			OEPVRTCC var14 = OEPVRTCC.method522(var13);
			if (var14.field1219 == -1) {
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
				XRUIQOVM var15 = field192[var14.field1219];
				if (var15 != null) {
					int var16 = (var14.field1246 * 4 - var15.field1497) / 2;
					int var17 = (var14.field1230 * 4 - var15.field1498) / 2;
					var15.method589(arg4 * 4 + var16 + 48, (104 - arg0 - var14.field1230) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field320.method55(arg1, arg4, arg0);
		if (var18 != 0) {
			int var19 = field320.method57(arg1, arg4, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			OEPVRTCC var23 = OEPVRTCC.method522(var22);
			if (var23.field1219 != -1) {
				XRUIQOVM var24 = field192[var23.field1219];
				if (var24 != null) {
					int var25 = (var23.field1246 * 4 - var24.field1497) / 2;
					int var26 = (var23.field1230 * 4 - var24.field1498) / 2;
					var24.method589(arg4 * 4 + var25 + 48, (104 - arg0 - var23.field1230) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field271.field1011;
				int var29 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field320.method56(arg1, arg4, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			OEPVRTCC var32 = OEPVRTCC.method522(var31);
			if (var32.field1219 != -1) {
				XRUIQOVM var33 = field192[var32.field1219];
				if (var33 != null) {
					int var34 = (var32.field1246 * 4 - var33.field1497) / 2;
					int var35 = (var32.field1230 * 4 - var33.field1498) / 2;
					var33.method589(arg4 * 4 + var34 + 48, (104 - arg0 - var32.field1230) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LLZWRHABP;ZI)V")
	public final void method203(LZWRHABP arg0, int arg1) {
		int var3 = arg0.method474(8);
		if (var3 < field575) {
			for (int var4 = var3; var4 < field575; var4++) {
				field300[field299++] = field576[var4];
			}
		}

		if (var3 > field575) {
			signlink.reporterror(field316 + " Too many players");
			throw new RuntimeException("eek");
		}

		field575 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field576[var5];
			ISLZFAII var7 = field574[var6];
			int var8 = arg0.method474(1);
			if (var8 == 0) {
				field576[field575++] = var6;
				var7.field1410 = field211;
			} else {
				int var9 = arg0.method474(2);
				if (var9 == 0) {
					field576[field575++] = var6;
					var7.field1410 = field211;
					field578[field577++] = var6;
				} else if (var9 == 1) {
					field576[field575++] = var6;
					var7.field1410 = field211;
					int var10 = arg0.method474(3);
					var7.method576(false, var10);
					int var11 = arg0.method474(1);
					if (var11 == 1) {
						field578[field577++] = var6;
					}
				} else if (var9 == 2) {
					field576[field575++] = var6;
					var7.field1410 = field211;
					int var12 = arg0.method474(3);
					var7.method576(true, var12);
					int var13 = arg0.method474(3);
					var7.method576(true, var13);
					int var14 = arg0.method474(1);
					if (var14 == 1) {
						field578[field577++] = var6;
					}
				} else if (var9 == 3) {
					field300[field299++] = var6;
				}
			}
		}
	}

	public final void run() {
		if (field426) {
			method163();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method204() {
		Graphics var1 = method17().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method10(1);

		if (field440) {
			field612 = false;
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

		if (field243) {
			field612 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field204) {
			field612 = false;
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

	@ObfuscatedName("client.J(I)V")
	public final void method205() {
		try {
			field183 = -1;
			field460.method406();
			field508.method406();
			GAGDRMEJ.method328();
			method148();
			field320.method27();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field308[var1].method407();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field433[var2][var3][var4] = 0;
					}
				}
			}

			QQKEKZOD var5 = new QQKEKZOD(104, 104, field293, field433);
			int var6 = field342.length;
			field242.method452(162);

			if (!field455) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field287[var7] >> 8) * 64 - field567;
					int var9 = (field287[var7] & 0xFF) * 64 - field568;
					byte[] var10 = field342[var7];
					if (var10 != null) {
						var5.method551(var9, (field393 - 6) * 8, field308, (field394 - 6) * 8, var8, var10);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field287[var11] >> 8) * 64 - field567;
					int var13 = (field287[var11] & 0xFF) * 64 - field568;
					byte[] var14 = field342[var11];
					if (var14 == null && field394 < 800) {
						var5.method555(var12, var13, 64, 64);
					}
				}

				field242.method452(162);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field565[var15];
					if (var16 != null) {
						int var17 = (field287[var15] >> 8) * 64 - field567;
						int var18 = (field287[var15] & 0xFF) * 64 - field568;
						var5.method548(field320, var17, var18, var16, field308);
					}
				}
			}

			if (field455) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field557[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field287.length; var28++) {
									if (field287[var28] == var27 && field342[var28] != null) {
										var5.method542(var21 * 8, field308, var20 * 8, field342[var28], var23, var24, (var25 & 0x7) * 8, (var26 & 0x7) * 8, var19);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field557[0][var29][var30];
						if (var31 == -1) {
							var5.method555(var29 * 8, var30 * 8, 8, 8);
						}
					}
				}

				field242.method452(162);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field557[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field287.length; var41++) {
									if (field287[var41] == var40 && field565[var41] != null) {
										var5.method540(var36, var33 * 8, var34 * 8, (var38 & 0x7) * 8, var37, field320, (var39 & 0x7) * 8, field565[var41], field308, var32);
										break;
									}
								}
							}
						}
					}
				}
			}

			field242.method452(162);
			var5.method541(field320, field308);

			if (field448 != null) {
				field448.method509();
				GAGDRMEJ.field815 = field225;
			}

			field242.method452(162);
			int var42 = QQKEKZOD.field1295;
			if (var42 > field580) {
				var42 = field580;
			}

			if (var42 < field580 - 1) {
				int var43 = field580 - 1;
			}

			if (field488) {
				field320.method28(QQKEKZOD.field1295);
			} else {
				field320.method28(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method192(var44, var45);
				}
			}

			method154();
		} catch (Exception var58) {
		}

		OEPVRTCC.field1235.method450();

		if (field67 != null) {
			field242.method452(29);
			field242.method457(1057001181);
		}

		if (field488 && signlink.cache_dat != null) {
			int var47 = field359.method301(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field359.method304(var48);
				if ((var49 & 0x79) == 0) {
					LSSDQDBV.method422(var48);
				}
			}
		}

		System.gc();
		GAGDRMEJ.method329(20);
		field359.method294();
		int var50 = (field393 - 6) / 8 - 1;
		int var51 = (field393 + 6) / 8 + 1;
		int var52 = (field394 - 6) / 8 - 1;
		int var53 = (field394 + 6) / 8 + 1;
		if (field255) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field359.method297(var55, var54, 0);
					if (var56 != -1) {
						field359.method291(3, var56);
					}

					int var57 = field359.method297(var55, var54, 1);
					if (var57 != -1) {
						field359.method291(3, var57);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(LLZWRHABP;II)V")
	public final void method206(LZWRHABP arg0, int arg1) {
		field299 = 0;
		field577 = 0;
		method132(arg1, arg0);
		method139(arg0, arg1);
		method108(arg1, arg0);

		for (int var3 = 0; var3 < field299; var3++) {
			int var4 = field300[var3];
			if (field211 != field544[var4].field1410) {
				field544[var4].field1494 = null;
				field544[var4] = null;
			}
		}

		if (arg0.field1139 != arg1) {
			signlink.reporterror(field316 + " size mismatch in getnpcpos - pos:" + arg0.field1139 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field545; var5++) {
			if (field544[field546[var5]] == null) {
				signlink.reporterror(field316 + " null entry in npc list - pos:" + var5 + " size:" + field545);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(LUOUXSBLI;BI)V")
	public final void method207(UOUXSBLI arg0, int arg1) {
		method208(arg0.field1396, arg0.field1395, arg1);
	}

	@ObfuscatedName("client.a(IIZI)V")
	public final void method208(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method171(arg0, arg1, field580) - arg2;
			arg1 -= field549;
			var4 -= field550;
			arg0 -= field551;
			int var5 = LSSDQDBV.field1127[field552];
			int var6 = LSSDQDBV.field1128[field552];
			int var7 = LSSDQDBV.field1127[field553];
			int var8 = LSSDQDBV.field1128[field553];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field592 = (var9 << 9) / arg0 + GAGDRMEJ.field809;
				field593 = (var11 << 9) / arg0 + GAGDRMEJ.field810;
			} else {
				field592 = -1;
				field593 = -1;
			}
		} else {
			field592 = -1;
			field593 = -1;
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method209(long arg0) {
		if (arg0 != 0L) {
			if (field434 >= 100 && field386 != 1) {
				method184(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field434 >= 200) {
				method184(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = CSEYUXAS.method220(CSEYUXAS.method217(arg0));
				for (int var4 = 0; var4 < field434; var4++) {
					if (field443[var4] == arg0) {
						method184(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field608; var5++) {
					if (field302[var5] == arg0) {
						method184(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field548.field1039)) {
					field539[field434] = var3;
					field443[field434] = arg0;
					field505[field434] = 0;
					field434++;
					field479 = true;
					field242.method452(80);
					field242.method459(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void method210(boolean arg0, byte[] arg1) {
		if (field268) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method211() {
		for (int var1 = -1; var1 < field575; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field573;
			} else {
				var2 = field576[var1];
			}

			ISLZFAII var3 = field574[var2];
			if (var3 != null) {
				method97(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method212() {
		while (true) {
			WETSEMVU var1 = field359.method292();
			if (var1 == null) {
				return;
			}

			if (var1.field1456 == 0) {
				LSSDQDBV.method421(var1.field1452, var1.field1455);

				if ((field359.method304(var1.field1455) & 0x62) != 0) {
					field479 = true;

					if (field523 != -1 || field510 != -1) {
						field248 = true;
					}
				}
			}

			if (var1.field1456 == 1 && var1.field1452 != null) {
				YGZNOIUP.method596(var1.field1452);
			}

			if (var1.field1456 == 2 && field329 == var1.field1455 && var1.field1452 != null) {
				method210(field330, var1.field1452);
			}

			if (var1.field1456 == 3 && field474 == 1) {
				for (int var2 = 0; var2 < field342.length; var2++) {
					if (field288[var2] == var1.field1455) {
						field342[var2] = var1.field1452;

						if (var1.field1452 == null) {
							field288[var2] = -1;
						}

						break;
					}

					if (field289[var2] == var1.field1455) {
						field565[var2] = var1.field1452;

						if (var1.field1452 == null) {
							field289[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1456 == 93 && field359.method300(var1.field1455)) {
				QQKEKZOD.method539(field359, new LZWRHABP(var1.field1452));
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method213(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.o(B)V")
	public final void method214() {
		for (MRRUTRWH var1 = (MRRUTRWH) field460.method402(); var1 != null; var1 = (MRRUTRWH) field460.method404()) {
			if (field580 != var1.field1188 || var1.field1192) {
				var1.method579();
			} else if (field211 >= var1.field1187) {
				var1.method508(field536);

				if (var1.field1192) {
					var1.method579();
				} else {
					field320.method38(var1.field1189, 60, false, var1, var1.field1191, 0, var1.field1188, var1.field1190, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZIIIIII)V")
	public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg6 >= 1 && arg4 <= 102 && arg6 <= 102) {
			if (field488 && field580 != arg0) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field320.method53(arg0, arg4, arg6);
			}

			if (arg1 == 1) {
				var8 = field320.method54(arg4, arg6, arg0);
			}

			if (arg1 == 2) {
				var8 = field320.method55(arg0, arg4, arg6);
			}

			if (arg1 == 3) {
				var8 = field320.method56(arg0, arg4, arg6);
			}

			if (var8 != 0) {
				int var12 = field320.method57(arg0, arg4, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field320.method44(arg4, arg6, arg0);
					OEPVRTCC var16 = OEPVRTCC.method522(var13);
					if (var16.field1205) {
						field308[arg0].method412(var16.field1228, arg6, var15, arg4, var14);
					}
				}

				if (arg1 == 1) {
					field320.method45(arg6, arg0, arg4);
				}

				if (arg1 == 2) {
					field320.method46(arg6, arg0, arg4);
					OEPVRTCC var17 = OEPVRTCC.method522(var13);
					if (var17.field1246 + arg4 > 103 || var17.field1246 + arg6 > 103 || var17.field1230 + arg4 > 103 || var17.field1230 + arg6 > 103) {
						return;
					}

					if (var17.field1205) {
						field308[arg0].method413(var17.field1228, arg4, arg6, var15, var17.field1230, var17.field1246);
					}
				}

				if (arg1 == 3) {
					field320.method47(arg6, arg0, arg4);
					OEPVRTCC var18 = OEPVRTCC.method522(var13);
					if (var18.field1205 && var18.field1208) {
						field308[arg0].method415(arg4, arg6);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg0;
				if (arg0 < 3 && (field433[1][arg4][arg6] & 0x2) == 2) {
					var19 = arg0 + 1;
				}

				QQKEKZOD.method552(arg4, arg2, arg0, arg3, field293, field320, field308[arg0], arg5, var19, arg6);
				return;
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field267[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field599[var3] = var2 / 4;
		}
	}
}
