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
public final class client extends UNXTKTRJ {

	@ObfuscatedName("client.K")
	public boolean field109 = true;

	@ObfuscatedName("client.O")
	public EWLVMFRK[][][] field112 = new EWLVMFRK[4][104][104];

	@ObfuscatedName("client.Q")
	public int field114 = -1;

	@ObfuscatedName("client.R")
	public boolean field115 = false;

	@ObfuscatedName("client.V")
	public String[] field119 = new String[500];

	@ObfuscatedName("client.bb")
	public int[][] field125 = new int[104][104];

	@ObfuscatedName("client.db")
	public OPAHDXQS[] field126 = new OPAHDXQS[4];

	@ObfuscatedName("client.mb")
	public int field135 = 2;

	@ObfuscatedName("client.ob")
	public int[] field137 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.pb")
	public boolean field138 = false;

	@ObfuscatedName("client.qb")
	public int field139 = -1;

	@ObfuscatedName("client.sb")
	public boolean field141 = true;

	@ObfuscatedName("client.tb")
	public int[][][] field142 = new int[4][13][13];

	@ObfuscatedName("client.Db")
	public int[] field152 = new int[151];

	@ObfuscatedName("client.Hb")
	public boolean field155 = false;

	@ObfuscatedName("client.Jb")
	public int[] field157 = new int[33];

	@ObfuscatedName("client.Nb")
	public int[][] field161 = new int[104][104];

	@ObfuscatedName("client.Pb")
	public String[] field163 = new String[200];

	@ObfuscatedName("client.Ub")
	public boolean field167 = true;

	@ObfuscatedName("client.Wb")
	public volatile boolean field169 = false;

	@ObfuscatedName("client.Yb")
	public int field171 = -1;

	@ObfuscatedName("client.fc")
	public boolean field176 = false;

	@ObfuscatedName("client.jc")
	public int[] field179 = new int[MXXUKHFT.field923];

	@ObfuscatedName("client.kc")
	public int field180 = -1;

	@ObfuscatedName("client.mc")
	public boolean field182 = false;

	@ObfuscatedName("client.nc")
	public YGMSKJOQ[] field183 = new YGMSKJOQ[20];

	@ObfuscatedName("client.oc")
	public CRC32 field184 = new CRC32();

	@ObfuscatedName("client.qc")
	public int field185 = 128;

	@ObfuscatedName("client.yc")
	public EWLVMFRK field192 = new EWLVMFRK();

	@ObfuscatedName("client.zc")
	public DEITBGVL[] field193 = new DEITBGVL[2];

	@ObfuscatedName("client.Kc")
	public boolean field201 = true;

	@ObfuscatedName("client.Oc")
	public int field204 = 2048;

	@ObfuscatedName("client.Pc")
	public int field205 = 2047;

	@ObfuscatedName("client.Qc")
	public OTTYZSZE[] field206 = new OTTYZSZE[field204];

	@ObfuscatedName("client.Sc")
	public int[] field208 = new int[field204];

	@ObfuscatedName("client.Uc")
	public int[] field210 = new int[field204];

	@ObfuscatedName("client.Vc")
	public XJCNBMKS[] field211 = new XJCNBMKS[field204];

	@ObfuscatedName("client.Wc")
	public int[] field212 = new int[9];

	@ObfuscatedName("client.dd")
	public int[] field219 = new int[100];

	@ObfuscatedName("client.ed")
	public String[] field220 = new String[100];

	@ObfuscatedName("client.fd")
	public String[] field221 = new String[100];

	@ObfuscatedName("client.od")
	public int field229 = -1;

	@ObfuscatedName("client.pd")
	public int[] field230 = new int[2000];

	@ObfuscatedName("client.qd")
	public int field231 = 3;

	@ObfuscatedName("client.wd")
	public String field237 = "";

	@ObfuscatedName("client.Ad")
	public boolean field241 = false;

	@ObfuscatedName("client.Bd")
	public byte[] field242 = new byte[16384];

	@ObfuscatedName("client.Cd")
	public boolean field243 = false;

	@ObfuscatedName("client.Ld")
	public boolean field251 = false;

	@ObfuscatedName("client.Nd")
	public int field253 = -1;

	@ObfuscatedName("client.Od")
	public int[] field254 = new int[33];

	@ObfuscatedName("client.Pd")
	public YGMSKJOQ[] field255 = new YGMSKJOQ[1000];

	@ObfuscatedName("client.Rd")
	public int[] field257 = new int[5];

	@ObfuscatedName("client.Sd")
	public int[] field258 = new int[500];

	@ObfuscatedName("client.Td")
	public int[] field259 = new int[500];

	@ObfuscatedName("client.Ud")
	public int[] field260 = new int[500];

	@ObfuscatedName("client.Vd")
	public int[] field261 = new int[500];

	@ObfuscatedName("client.Wd")
	public String field262 = "";

	@ObfuscatedName("client.Zd")
	public int[] field264 = new int[5];

	@ObfuscatedName("client.ce")
	public int field267 = -1;

	@ObfuscatedName("client.he")
	public int[][] field269 = new int[104][104];

	@ObfuscatedName("client.ie")
	public String field270 = "";

	@ObfuscatedName("client.je")
	public String field271 = "";

	@ObfuscatedName("client.ke")
	public boolean[] field272 = new boolean[5];

	@ObfuscatedName("client.le")
	public long[] field273 = new long[100];

	@ObfuscatedName("client.ne")
	public int[] field275 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.pe")
	public boolean field276 = false;

	@ObfuscatedName("client.te")
	public int[] field279 = new int[1000];

	@ObfuscatedName("client.ue")
	public int[] field280 = new int[1000];

	@ObfuscatedName("client.Be")
	public boolean field286 = false;

	@ObfuscatedName("client.Ce")
	public boolean field287 = false;

	@ObfuscatedName("client.Le")
	public int field295 = 1;

	@ObfuscatedName("client.Ve")
	public int[] field305 = new int[200];

	@ObfuscatedName("client.ef")
	public int field314 = -1;

	@ObfuscatedName("client.ff")
	public int field315 = -1;

	@ObfuscatedName("client.gf")
	public int[] field316 = new int[5];

	@ObfuscatedName("client.hf")
	public int field317 = 0x332D25;

	@ObfuscatedName("client.jf")
	public boolean field318 = false;

	@ObfuscatedName("client.kf")
	public YGMSKJOQ[] field319 = new YGMSKJOQ[8];

	@ObfuscatedName("client.lf")
	public boolean field320 = false;

	@ObfuscatedName("client.mf")
	public XJCNBMKS field321 = new XJCNBMKS(new byte[5000]);

	@ObfuscatedName("client.nf")
	public FSNLAIJY[] field322 = new FSNLAIJY[16384];

	@ObfuscatedName("client.pf")
	public int[] field324 = new int[16384];

	@ObfuscatedName("client.uf")
	public volatile boolean field328 = false;

	@ObfuscatedName("client.Ef")
	public boolean field337 = false;

	@ObfuscatedName("client.Of")
	public int[] field345 = new int[MXXUKHFT.field923];

	@ObfuscatedName("client.Sf")
	public boolean field348 = false;

	@ObfuscatedName("client.bg")
	public volatile boolean field355 = false;

	@ObfuscatedName("client.dg")
	public boolean field356 = false;

	@ObfuscatedName("client.gg")
	public int field358 = -1;

	@ObfuscatedName("client.ig")
	public long[] field359 = new long[200];

	@ObfuscatedName("client.jg")
	public int[] field360 = new int[50];

	@ObfuscatedName("client.kg")
	public int[] field361 = new int[4000];

	@ObfuscatedName("client.lg")
	public int[] field362 = new int[4000];

	@ObfuscatedName("client.ng")
	public boolean field364 = false;

	@ObfuscatedName("client.og")
	public String field365 = "";

	@ObfuscatedName("client.qg")
	public int field367 = 0x23201B;

	@ObfuscatedName("client.tg")
	public String field369 = "";

	@ObfuscatedName("client.wg")
	public EWLVMFRK field372 = new EWLVMFRK();

	@ObfuscatedName("client.zg")
	public boolean field375 = false;

	@ObfuscatedName("client.Cg")
	public boolean field378 = true;

	@ObfuscatedName("client.Dg")
	public int field379 = 0x766654;

	@ObfuscatedName("client.Hg")
	public int field382 = 2;

	@ObfuscatedName("client.Lg")
	public int field386 = 2;

	@ObfuscatedName("client.Ng")
	public int field388 = 50;

	@ObfuscatedName("client.Og")
	public int[] field389 = new int[field388];

	@ObfuscatedName("client.Pg")
	public int[] field390 = new int[field388];

	@ObfuscatedName("client.Qg")
	public int[] field391 = new int[field388];

	@ObfuscatedName("client.Rg")
	public int[] field392 = new int[field388];

	@ObfuscatedName("client.Sg")
	public int[] field393 = new int[field388];

	@ObfuscatedName("client.Tg")
	public int[] field394 = new int[field388];

	@ObfuscatedName("client.Ug")
	public int[] field395 = new int[field388];

	@ObfuscatedName("client.Vg")
	public String[] field396 = new String[field388];

	@ObfuscatedName("client.Wg")
	public int[] field397 = new int[7];

	@ObfuscatedName("client.ah")
	public XJCNBMKS field400 = XJCNBMKS.method522(1);

	@ObfuscatedName("client.bh")
	public YGMSKJOQ[] field401 = new YGMSKJOQ[20];

	@ObfuscatedName("client.dh")
	public boolean field402 = false;

	@ObfuscatedName("client.fh")
	public boolean field404 = false;

	@ObfuscatedName("client.hh")
	public final int field406 = 100;

	@ObfuscatedName("client.ih")
	public int[] field407 = new int[100];

	@ObfuscatedName("client.lh")
	public EWLVMFRK field409 = new EWLVMFRK();

	@ObfuscatedName("client.xh")
	public String field421 = "";

	@ObfuscatedName("client.Gh")
	public int[] field430 = new int[MXXUKHFT.field923];

	@ObfuscatedName("client.Hh")
	public int field431 = 0x4D4233;

	@ObfuscatedName("client.Jh")
	public int[] field433 = new int[5];

	@ObfuscatedName("client.Qh")
	public int[] field440 = new int[1000];

	@ObfuscatedName("client.Uh")
	public OVNURGUS[] field443 = new OVNURGUS[5];

	@ObfuscatedName("client.Wh")
	public String field444 = "";

	@ObfuscatedName("client.Xh")
	public String field445 = "";

	@ObfuscatedName("client.Zh")
	public boolean field447 = false;

	@ObfuscatedName("client.li")
	public int[] field459 = new int[5];

	@ObfuscatedName("client.yi")
	public DEITBGVL[] field470 = new DEITBGVL[13];

	@ObfuscatedName("client.zi")
	public RWLOYYVC field471 = new RWLOYYVC();

	@ObfuscatedName("client.Bi")
	public int field472 = -1;

	@ObfuscatedName("client.Oi")
	public int[] field485 = new int[50];

	@ObfuscatedName("client.Ti")
	public int field488 = 1;

	@ObfuscatedName("client.Wi")
	public int field490 = -1;

	@ObfuscatedName("client.Xi")
	public final int[] field491 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Zi")
	public int[] field493 = new int[151];

	@ObfuscatedName("client.bj")
	public int field494 = -1;

	@ObfuscatedName("client.cj")
	public int field495 = 78;

	@ObfuscatedName("client.fj")
	public XJCNBMKS field498 = XJCNBMKS.method522(1);

	@ObfuscatedName("client.hj")
	public XJCNBMKS field500 = XJCNBMKS.method522(1);

	@ObfuscatedName("client.nj")
	public int[] field505 = new int[50];

	@ObfuscatedName("client.tj")
	public int field511 = -1;

	@ObfuscatedName("client.Aj")
	public boolean field517 = false;

	@ObfuscatedName("client.Bj")
	public int[] field518 = new int[256];

	@ObfuscatedName("client.Cj")
	public DEITBGVL[] field519 = new DEITBGVL[100];

	@ObfuscatedName("client.Hj")
	public int[] field524 = new int[2000];

	@ObfuscatedName("client.Jj")
	public YGMSKJOQ[] field526 = new YGMSKJOQ[100];

	@ObfuscatedName("client.Kj")
	public String[] field527 = new String[5];

	@ObfuscatedName("client.Lj")
	public boolean[] field528 = new boolean[5];

	@ObfuscatedName("client.X")
	public static int[] field121 = new int[99];

	@ObfuscatedName("client.lc")
	public static BigInteger field181 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.rd")
	public static int[] field232 = new int[32];

	@ObfuscatedName("client.Af")
	public static int field333 = 10;

	@ObfuscatedName("client.Cf")
	public static boolean field335 = true;

	@ObfuscatedName("client.Rf")
	public static String field347 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Zg")
	public static final int[] field399 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.kh")
	public static BigInteger field408 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.ij")
	public static final int[][] field501 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.L")
	public static int field110;

	@ObfuscatedName("client.M")
	public int field111;

	@ObfuscatedName("client.P")
	public int field113;

	@ObfuscatedName("client.S")
	public int field116;

	@ObfuscatedName("client.T")
	public int field117;

	@ObfuscatedName("client.U")
	public int field118;

	@ObfuscatedName("client.W")
	public int field120;

	@ObfuscatedName("client.Y")
	public int field122;

	@ObfuscatedName("client.Z")
	public static int field123;

	@ObfuscatedName("client.ab")
	public int field124;

	@ObfuscatedName("client.ib")
	public int field131;

	@ObfuscatedName("client.lb")
	public int field134;

	@ObfuscatedName("client.nb")
	public static int field136;

	@ObfuscatedName("client.rb")
	public static int field140;

	@ObfuscatedName("client.ub")
	public int field143;

	@ObfuscatedName("client.vb")
	public int field144;

	@ObfuscatedName("client.wb")
	public int field145;

	@ObfuscatedName("client.xb")
	public static int field146;

	@ObfuscatedName("client.yb")
	public int field147;

	@ObfuscatedName("client.zb")
	public int field148;

	@ObfuscatedName("client.Ab")
	public int field149;

	@ObfuscatedName("client.Bb")
	public int field150;

	@ObfuscatedName("client.Cb")
	public int field151;

	@ObfuscatedName("client.Eb")
	public int field153;

	@ObfuscatedName("client.Fb")
	public int field154;

	@ObfuscatedName("client.Ib")
	public int field156;

	@ObfuscatedName("client.Ob")
	public int field162;

	@ObfuscatedName("client.Xb")
	public int field170;

	@ObfuscatedName("client.Zb")
	public int field172;

	@ObfuscatedName("client.ac")
	public int field173;

	@ObfuscatedName("client.dc")
	public int field174;

	@ObfuscatedName("client.ic")
	public int field178;

	@ObfuscatedName("client.rc")
	public int field186;

	@ObfuscatedName("client.sc")
	public int field187;

	@ObfuscatedName("client.tc")
	public int field188;

	@ObfuscatedName("client.uc")
	public int field189;

	@ObfuscatedName("client.xc")
	public static int field191;

	@ObfuscatedName("client.Ac")
	public static int field194;

	@ObfuscatedName("client.Cc")
	public int field195;

	@ObfuscatedName("client.Ec")
	public int field196;

	@ObfuscatedName("client.Gc")
	public int field197;

	@ObfuscatedName("client.Hc")
	public int field198;

	@ObfuscatedName("client.Ic")
	public int field199;

	@ObfuscatedName("client.Jc")
	public int field200;

	@ObfuscatedName("client.Rc")
	public int field207;

	@ObfuscatedName("client.Tc")
	public int field209;

	@ObfuscatedName("client.cd")
	public int field218;

	@ObfuscatedName("client.hd")
	public int field222;

	@ObfuscatedName("client.xd")
	public int field238;

	@ObfuscatedName("client.yd")
	public int field239;

	@ObfuscatedName("client.zd")
	public int field240;

	@ObfuscatedName("client.Jd")
	public int field249;

	@ObfuscatedName("client.Kd")
	public int field250;

	@ObfuscatedName("client.Md")
	public static int field252;

	@ObfuscatedName("client.Qd")
	public int field256;

	@ObfuscatedName("client.ee")
	public int field268;

	@ObfuscatedName("client.me")
	public int field274;

	@ObfuscatedName("client.re")
	public int field277;

	@ObfuscatedName("client.se")
	public int field278;

	@ObfuscatedName("client.we")
	public static int field282;

	@ObfuscatedName("client.ye")
	public int field283;

	@ObfuscatedName("client.ze")
	public int field284;

	@ObfuscatedName("client.Fe")
	public int field289;

	@ObfuscatedName("client.Ge")
	public int field290;

	@ObfuscatedName("client.He")
	public int field291;

	@ObfuscatedName("client.Ie")
	public int field292;

	@ObfuscatedName("client.Je")
	public int field293;

	@ObfuscatedName("client.Ke")
	public int field294;

	@ObfuscatedName("client.Ye")
	public int field308;

	@ObfuscatedName("client.Ze")
	public int field309;

	@ObfuscatedName("client.af")
	public int field310;

	@ObfuscatedName("client.bf")
	public int field311;

	@ObfuscatedName("client.cf")
	public int field312;

	@ObfuscatedName("client.of")
	public int field323;

	@ObfuscatedName("client.rf")
	public int field325;

	@ObfuscatedName("client.sf")
	public int field326;

	@ObfuscatedName("client.tf")
	public int field327;

	@ObfuscatedName("client.Bf")
	public static int field334;

	@ObfuscatedName("client.Gf")
	public static int field338;

	@ObfuscatedName("client.Qf")
	public int field346;

	@ObfuscatedName("client.Wf")
	public int field350;

	@ObfuscatedName("client.Xf")
	public int field351;

	@ObfuscatedName("client.Yf")
	public int field352;

	@ObfuscatedName("client.Zf")
	public int field353;

	@ObfuscatedName("client.fg")
	public int field357;

	@ObfuscatedName("client.mg")
	public static int field363;

	@ObfuscatedName("client.pg")
	public int field366;

	@ObfuscatedName("client.sg")
	public int field368;

	@ObfuscatedName("client.xg")
	public int field373;

	@ObfuscatedName("client.yg")
	public int field374;

	@ObfuscatedName("client.Ag")
	public static int field376;

	@ObfuscatedName("client.Bg")
	public int field377;

	@ObfuscatedName("client.Eg")
	public int field380;

	@ObfuscatedName("client.Gg")
	public int field381;

	@ObfuscatedName("client.Ig")
	public int field383;

	@ObfuscatedName("client.Jg")
	public int field384;

	@ObfuscatedName("client.Kg")
	public int field385;

	@ObfuscatedName("client.Mg")
	public int field387;

	@ObfuscatedName("client.Xg")
	public int field398;

	@ObfuscatedName("client.gh")
	public int field405;

	@ObfuscatedName("client.mh")
	public int field410;

	@ObfuscatedName("client.nh")
	public int field411;

	@ObfuscatedName("client.oh")
	public int field412;

	@ObfuscatedName("client.ph")
	public int field413;

	@ObfuscatedName("client.qh")
	public int field414;

	@ObfuscatedName("client.rh")
	public int field415;

	@ObfuscatedName("client.sh")
	public int field416;

	@ObfuscatedName("client.th")
	public int field417;

	@ObfuscatedName("client.uh")
	public int field418;

	@ObfuscatedName("client.vh")
	public int field419;

	@ObfuscatedName("client.wh")
	public static int field420;

	@ObfuscatedName("client.zh")
	public int field423;

	@ObfuscatedName("client.Ah")
	public int field424;

	@ObfuscatedName("client.Bh")
	public static int field425;

	@ObfuscatedName("client.Ch")
	public int field426;

	@ObfuscatedName("client.Kh")
	public int field434;

	@ObfuscatedName("client.Lh")
	public int field435;

	@ObfuscatedName("client.Mh")
	public int field436;

	@ObfuscatedName("client.Nh")
	public int field437;

	@ObfuscatedName("client.Oh")
	public int field438;

	@ObfuscatedName("client.Ph")
	public int field439;

	@ObfuscatedName("client.Sh")
	public int field442;

	@ObfuscatedName("client.Yh")
	public int field446;

	@ObfuscatedName("client.ai")
	public int field448;

	@ObfuscatedName("client.bi")
	public int field449;

	@ObfuscatedName("client.ci")
	public int field450;

	@ObfuscatedName("client.di")
	public int field451;

	@ObfuscatedName("client.ei")
	public int field452;

	@ObfuscatedName("client.fi")
	public int field453;

	@ObfuscatedName("client.gi")
	public int field454;

	@ObfuscatedName("client.hi")
	public int field455;

	@ObfuscatedName("client.ii")
	public int field456;

	@ObfuscatedName("client.ji")
	public int field457;

	@ObfuscatedName("client.ki")
	public int field458;

	@ObfuscatedName("client.ni")
	public int field460;

	@ObfuscatedName("client.ri")
	public int field463;

	@ObfuscatedName("client.si")
	public int field464;

	@ObfuscatedName("client.ti")
	public int field465;

	@ObfuscatedName("client.ui")
	public int field466;

	@ObfuscatedName("client.vi")
	public int field467;

	@ObfuscatedName("client.xi")
	public static int field469;

	@ObfuscatedName("client.Ci")
	public int field473;

	@ObfuscatedName("client.Mi")
	public static int field483;

	@ObfuscatedName("client.Ni")
	public int field484;

	@ObfuscatedName("client.Qi")
	public int field486;

	@ObfuscatedName("client.Si")
	public int field487;

	@ObfuscatedName("client.Vi")
	public int field489;

	@ObfuscatedName("client.Yi")
	public int field492;

	@ObfuscatedName("client.ej")
	public int field497;

	@ObfuscatedName("client.gj")
	public int field499;

	@ObfuscatedName("client.jj")
	public int field502;

	@ObfuscatedName("client.kj")
	public int field503;

	@ObfuscatedName("client.vj")
	public int field512;

	@ObfuscatedName("client.wj")
	public int field513;

	@ObfuscatedName("client.Fj")
	public int field522;

	@ObfuscatedName("client.Gj")
	public int field523;

	@ObfuscatedName("client.Mj")
	public int field529;

	@ObfuscatedName("client.Nj")
	public int field530;

	@ObfuscatedName("client.Oj")
	public int field531;

	@ObfuscatedName("client.Pj")
	public int field532;

	@ObfuscatedName("client.De")
	public long field288;

	@ObfuscatedName("client.Uf")
	public long field349;

	@ObfuscatedName("client.Ih")
	public long field432;

	@ObfuscatedName("client.oi")
	public long field461;

	@ObfuscatedName("client.mj")
	public long field504;

	@ObfuscatedName("client.Lc")
	public ADZBQDSQ field202;

	@ObfuscatedName("client.Xc")
	public DEITBGVL field213;

	@ObfuscatedName("client.Yc")
	public DEITBGVL field214;

	@ObfuscatedName("client.Zc")
	public DEITBGVL field215;

	@ObfuscatedName("client.ad")
	public DEITBGVL field216;

	@ObfuscatedName("client.bd")
	public DEITBGVL field217;

	@ObfuscatedName("client.We")
	public DEITBGVL field306;

	@ObfuscatedName("client.Xe")
	public DEITBGVL field307;

	@ObfuscatedName("client.Dh")
	public DEITBGVL field427;

	@ObfuscatedName("client.Eh")
	public DEITBGVL field428;

	@ObfuscatedName("client.Fh")
	public DEITBGVL field429;

	@ObfuscatedName("client.oj")
	public DEITBGVL field506;

	@ObfuscatedName("client.pj")
	public DEITBGVL field507;

	@ObfuscatedName("client.qj")
	public DEITBGVL field508;

	@ObfuscatedName("client.rj")
	public DEITBGVL field509;

	@ObfuscatedName("client.sj")
	public DEITBGVL field510;

	@ObfuscatedName("client.xj")
	public DEITBGVL field514;

	@ObfuscatedName("client.yj")
	public DEITBGVL field515;

	@ObfuscatedName("client.zj")
	public DEITBGVL field516;

	@ObfuscatedName("client.Dj")
	public DEITBGVL field520;

	@ObfuscatedName("client.Ej")
	public DEITBGVL field521;

	@ObfuscatedName("client.vc")
	public EUCYOSVT field190;

	@ObfuscatedName("client.ae")
	public JUGCSXVJ field265;

	@ObfuscatedName("client.Nc")
	public KALHRUDX field203;

	@ObfuscatedName("client.ve")
	public static OTTYZSZE field281;

	@ObfuscatedName("client.Rh")
	public QKFGLETG field441;

	@ObfuscatedName("client.vf")
	public SDLNXGIT field329;

	@ObfuscatedName("client.eb")
	public UMCYZJWP field127;

	@ObfuscatedName("client.fb")
	public UMCYZJWP field128;

	@ObfuscatedName("client.gb")
	public UMCYZJWP field129;

	@ObfuscatedName("client.hb")
	public UMCYZJWP field130;

	@ObfuscatedName("client.jb")
	public YGMSKJOQ field132;

	@ObfuscatedName("client.kb")
	public YGMSKJOQ field133;

	@ObfuscatedName("client.nd")
	public YGMSKJOQ field228;

	@ObfuscatedName("client.sd")
	public YGMSKJOQ field233;

	@ObfuscatedName("client.td")
	public YGMSKJOQ field234;

	@ObfuscatedName("client.Dd")
	public YGMSKJOQ field244;

	@ObfuscatedName("client.Ed")
	public YGMSKJOQ field245;

	@ObfuscatedName("client.Fd")
	public YGMSKJOQ field246;

	@ObfuscatedName("client.Gd")
	public YGMSKJOQ field247;

	@ObfuscatedName("client.Hd")
	public YGMSKJOQ field248;

	@ObfuscatedName("client.be")
	public YGMSKJOQ field266;

	@ObfuscatedName("client.Ae")
	public YGMSKJOQ field285;

	@ObfuscatedName("client.Mf")
	public YGMSKJOQ field343;

	@ObfuscatedName("client.Nf")
	public YGMSKJOQ field344;

	@ObfuscatedName("client.Rb")
	public YQSLUNUN field164;

	@ObfuscatedName("client.Sb")
	public YQSLUNUN field165;

	@ObfuscatedName("client.Tb")
	public YQSLUNUN field166;

	@ObfuscatedName("client.Me")
	public YQSLUNUN field296;

	@ObfuscatedName("client.Ne")
	public YQSLUNUN field297;

	@ObfuscatedName("client.Oe")
	public YQSLUNUN field298;

	@ObfuscatedName("client.Pe")
	public YQSLUNUN field299;

	@ObfuscatedName("client.Qe")
	public YQSLUNUN field300;

	@ObfuscatedName("client.Re")
	public YQSLUNUN field301;

	@ObfuscatedName("client.Se")
	public YQSLUNUN field302;

	@ObfuscatedName("client.Te")
	public YQSLUNUN field303;

	@ObfuscatedName("client.Ue")
	public YQSLUNUN field304;

	@ObfuscatedName("client.If")
	public YQSLUNUN field339;

	@ObfuscatedName("client.Jf")
	public YQSLUNUN field340;

	@ObfuscatedName("client.Kf")
	public YQSLUNUN field341;

	@ObfuscatedName("client.Lf")
	public YQSLUNUN field342;

	@ObfuscatedName("client.Di")
	public YQSLUNUN field474;

	@ObfuscatedName("client.Ei")
	public YQSLUNUN field475;

	@ObfuscatedName("client.Fi")
	public YQSLUNUN field476;

	@ObfuscatedName("client.Gi")
	public YQSLUNUN field477;

	@ObfuscatedName("client.Hi")
	public YQSLUNUN field478;

	@ObfuscatedName("client.Ii")
	public YQSLUNUN field479;

	@ObfuscatedName("client.Ji")
	public YQSLUNUN field480;

	@ObfuscatedName("client.Ki")
	public YQSLUNUN field481;

	@ObfuscatedName("client.Li")
	public YQSLUNUN field482;

	@ObfuscatedName("client.Vb")
	public String field168;

	@ObfuscatedName("client.ag")
	public String field354;

	@ObfuscatedName("client.wi")
	public String field468;

	@ObfuscatedName("client.Ij")
	public String field525;

	@ObfuscatedName("client.dj")
	public Socket field496;

	@ObfuscatedName("client.ec")
	public static boolean field175;

	@ObfuscatedName("client.md")
	public static boolean field227;

	@ObfuscatedName("client.Df")
	public static boolean field336;

	@ObfuscatedName("client.eh")
	public static boolean field403;

	@ObfuscatedName("client.Kb")
	public int[] field158;

	@ObfuscatedName("client.Lb")
	public int[] field159;

	@ObfuscatedName("client.Mb")
	public int[] field160;

	@ObfuscatedName("client.id")
	public int[] field223;

	@ObfuscatedName("client.jd")
	public int[] field224;

	@ObfuscatedName("client.kd")
	public int[] field225;

	@ObfuscatedName("client.ld")
	public int[] field226;

	@ObfuscatedName("client.ud")
	public int[] field235;

	@ObfuscatedName("client.vd")
	public int[] field236;

	@ObfuscatedName("client.xf")
	public int[] field330;

	@ObfuscatedName("client.yf")
	public int[] field331;

	@ObfuscatedName("client.zf")
	public int[] field332;

	@ObfuscatedName("client.ug")
	public int[] field370;

	@ObfuscatedName("client.vg")
	public int[] field371;

	@ObfuscatedName("client.yh")
	public DEITBGVL[] field422;

	@ObfuscatedName("client.gc")
	public byte[][] field177;

	@ObfuscatedName("client.Xd")
	public byte[][] field263;

	@ObfuscatedName("client.qi")
	public byte[][][] field462;

	@ObfuscatedName("client.df")
	public int[][][] field313;

	@ObfuscatedName("client.b(I)V")
	public final void method19() {
		SIUJJQHQ.field1284.method299();
		SIUJJQHQ.field1277.method299();
		NHTDEVDA.field963.method299();
		AOLTHQTO.field73.method299();
		AOLTHQTO.field79.method299();
		OTTYZSZE.field1037.method299();
		VSBOWDVL.field1392.method299();
	}

	@ObfuscatedName("client.c(I)V")
	public final void method20() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field370[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field370[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field371[var10] = (field370[var10 - 1] + field370[var10 + 1] + field370[var10 - 128] + field370[var10 + 128]) / 4;
			}
		}

		field256 += 128;
		if (field256 > field235.length) {
			field256 -= field235.length;
			int var11 = (int) (Math.random() * 12.0D);
			method153(field422[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field371[var14 + 128] - field235[field256 + var14 & field235.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field370[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field518[var16] = field518[var16 + 1];
		}

		field518[var1 - 1] = (int) (Math.sin(field376 / 14.0D) * 16.0D + Math.sin(field376 / 15.0D) * 14.0D + Math.sin(field376 / 16.0D) * 12.0D);

		if (field512 > 0) {
			field512 -= 4;
		}

		if (field513 > 0) {
			field513 -= 4;
		}

		if (field512 == 0 && field513 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field512 = 1024;
			}

			if (var17 == 1) {
				field513 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method21() {
		field387 = 0;
		for (int var1 = -1; var1 < field323 + field207; var1++) {
			YHEHTOVP var2;
			if (var1 == -1) {
				var2 = field281;
			} else if (var1 < field207) {
				var2 = field206[field208[var1]];
			} else {
				var2 = field322[field324[var1 - field207]];
			}

			if (var2 != null && var2.method245()) {
				if (var2 instanceof FSNLAIJY) {
					NHTDEVDA var3 = ((FSNLAIJY) var2).field631;
					if (var3.field948 != null) {
						var3 = var3.method364();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field207) {
					NHTDEVDA var7 = ((FSNLAIJY) var2).field631;
					if (var7.field967 >= 0 && var7.field967 < field401.length) {
						method66(var2, var2.field1459 + 15);

						if (field314 > -1) {
							field401[var7.field967].method576(field315 - 30, field314 - 12);
						}
					}

					if (field373 == 1 && field324[var1 - field207] == field120 && field376 % 20 < 10) {
						method66(var2, var2.field1459 + 15);

						if (field314 > -1) {
							field401[2].method576(field315 - 28, field314 - 12);
						}
					}
				} else {
					int var4 = 30;
					OTTYZSZE var5 = (OTTYZSZE) var2;
					if (var5.field1047 != 0) {
						method66(var2, var2.field1459 + 15);

						if (field314 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field1047 & 1 << var6) != 0) {
									field401[var6].method576(field315 - var4, field314 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field373 == 10 && field208[var1] == field189) {
						method66(var2, var2.field1459 + 15);

						if (field314 > -1) {
							field401[7].method576(field315 - var4, field314 - 12);
						}
					}
				}

				if (var2.field1461 != null && (var1 >= field207 || field473 == 0 || field473 == 3 || field473 == 1 && method68(((OTTYZSZE) var2).field1038))) {
					method66(var2, var2.field1459);

					if (field314 > -1 && field387 < field388) {
						field392[field387] = field129.method469(var2.field1461) / 2;
						field391[field387] = field129.field1307;
						field389[field387] = field314;
						field390[field387] = field315;
						field393[field387] = var2.field1433;
						field394[field387] = var2.field1442;
						field395[field387] = var2.field1443;
						field396[field387++] = var2.field1461;

						if (field268 == 0 && var2.field1442 >= 1 && var2.field1442 <= 3) {
							field391[field387] += 10;
							field390[field387] += 5;
						}

						if (field268 == 0 && var2.field1442 == 4) {
							field392[field387] = 60;
						}

						if (field268 == 0 && var2.field1442 == 5) {
							field391[field387] += 5;
						}
					}
				}

				if (var2.field1422 > field376) {
					method66(var2, var2.field1459 + 15);

					if (field314 > -1) {
						int var8 = var2.field1423 * 30 / var2.field1424;
						if (var8 > 30) {
							var8 = 30;
						}

						HQRNTLRZ.method284(field314 - 15, field315 - 3, 0xFF00, var8, 5);
						HQRNTLRZ.method284(field314 + var8 - 15, field315 - 3, 0xFF0000, 30 - var8, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1471[var9] > field376) {
						method66(var2, var2.field1459 / 2);

						if (field314 > -1) {
							if (var9 == 1) {
								field315 -= 20;
							}

							if (var9 == 2) {
								field314 -= 15;
								field315 -= 10;
							}

							if (var9 == 3) {
								field314 += 15;
								field315 -= 10;
							}

							field183[var2.field1470[var9]].method576(field315 - 12, field314 - 12);
							field127.method466(field315 + 4, String.valueOf(var2.field1469[var9]), 0, field314);
							field127.method466(field315 + 3, String.valueOf(var2.field1469[var9]), 0xFFFFFF, field314 - 1);
						}
					}
				}
			}
		}

		field425++;
		if (field425 > 78) {
			field425 = 0;
			field400.method523(204);
		}

		for (int var10 = 0; var10 < field387; var10++) {
			int var11 = field389[var10];
			int var12 = field390[var10];
			int var13 = field392[var10];
			int var14 = field391[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field390[var16] - field391[var16] && var12 - var14 < field390[var16] + 2 && var11 - var13 < field392[var16] + field389[var16] && var11 + var13 > field389[var16] - field392[var16] && field390[var16] - field391[var16] < var12) {
						var12 = field390[var16] - field391[var16];
						var15 = true;
					}
				}
			}

			field314 = field389[var10];
			field315 = field390[var10] = var12;
			String var17 = field396[var10];
			if (field268 == 0) {
				int var18 = 0xFFFF00;
				if (field393[var10] < 6) {
					var18 = field275[field393[var10]];
				}

				if (field393[var10] == 6) {
					var18 = field426 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field393[var10] == 7) {
					var18 = field426 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field393[var10] == 8) {
					var18 = field426 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field393[var10] == 9) {
					int var19 = 150 - field395[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field393[var10] == 10) {
					int var20 = 150 - field395[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field393[var10] == 11) {
					int var21 = 150 - field395[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field394[var10] == 0) {
					field129.method466(field315 + 1, var17, 0, field314);
					field129.method466(field315, var17, var18, field314);
				}

				if (field394[var10] == 1) {
					field129.method471(0, var17, field426, field314, field315 + 1);
					field129.method471(var18, var17, field426, field314, field315);
				}

				if (field394[var10] == 2) {
					field129.method472(var17, field315 + 1, field314, field426, 0);
					field129.method472(var17, field315, field314, field426, var18);
				}

				if (field394[var10] == 3) {
					field129.method473(field314, 150 - field395[var10], field426, 0, var17, field315 + 1);
					field129.method473(field314, 150 - field395[var10], field426, var18, var17, field315);
				}

				if (field394[var10] == 4) {
					int var22 = field129.method469(var17);
					int var23 = (150 - field395[var10]) * (var22 + 100) / 150;
					HQRNTLRZ.method281(field314 - 50, 0, field314 + 50, 334);
					field129.method470(field314 + 50 - var23, var17, 0, field315 + 1);
					field129.method470(field314 + 50 - var23, var17, var18, field315);
					HQRNTLRZ.method280();
				}

				if (field394[var10] == 5) {
					int var24 = 150 - field395[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					HQRNTLRZ.method281(0, field315 - field129.field1307 - 1, 512, field315 + 5);
					field129.method466(field315 + var25 + 1, var17, 0, field314);
					field129.method466(field315 + var25, var17, var18, field314);
					HQRNTLRZ.method280();
				}
			} else {
				field129.method466(field315 + 1, var17, 0, field314);
				field129.method466(field315, var17, 0xFFFF00, field314);
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method22() {
		if (field296 == null) {
			field1319 = null;
			field342 = null;
			field340 = null;
			field339 = null;
			field341 = null;
			field164 = null;
			field165 = null;
			field166 = null;
			field299 = new YQSLUNUN(265, method28(), 128);
			HQRNTLRZ.method282();
			field300 = new YQSLUNUN(265, method28(), 128);
			HQRNTLRZ.method282();
			field296 = new YQSLUNUN(171, method28(), 509);
			HQRNTLRZ.method282();
			field297 = new YQSLUNUN(132, method28(), 360);
			HQRNTLRZ.method282();
			field298 = new YQSLUNUN(200, method28(), 360);
			HQRNTLRZ.method282();
			field301 = new YQSLUNUN(238, method28(), 202);
			HQRNTLRZ.method282();
			field302 = new YQSLUNUN(238, method28(), 203);
			HQRNTLRZ.method282();
			field303 = new YQSLUNUN(94, method28(), 74);
			HQRNTLRZ.method282();
			field304 = new YQSLUNUN(94, method28(), 75);
			HQRNTLRZ.method282();

			if (field441 != null) {
				method42();
				method70();
			}

			field375 = true;
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method23() {
		if (field342 == null) {
			method55();
			field1319 = null;
			field296 = null;
			field297 = null;
			field298 = null;
			field299 = null;
			field300 = null;
			field301 = null;
			field302 = null;
			field303 = null;
			field304 = null;
			field342 = new YQSLUNUN(96, method28(), 479);
			field340 = new YQSLUNUN(156, method28(), 172);
			HQRNTLRZ.method282();
			field515.method166(0, 0);
			field339 = new YQSLUNUN(261, method28(), 190);
			field341 = new YQSLUNUN(334, method28(), 512);
			HQRNTLRZ.method282();
			field164 = new YQSLUNUN(50, method28(), 496);
			field165 = new YQSLUNUN(37, method28(), 269);
			field166 = new YQSLUNUN(45, method28(), 249);
			field375 = true;
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method24() {
		for (JQLDEMYI var1 = (JQLDEMYI) field372.method201(); var1 != null; var1 = (JQLDEMYI) field372.method203()) {
			if (field131 != var1.field764 || var1.field768) {
				var1.method396();
			} else if (field376 >= var1.field760) {
				var1.method300(field274);

				if (var1.field768) {
					var1.method396();
				} else {
					field203.method317(0, var1.field764, var1.field765, var1.field766, 60, var1.field767, -1, var1, false);
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)Z")
	public final boolean method25(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field260[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 554) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;I)V")
	public final void method26(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field494 != -1) {
			field525 = arg0;
			field1332 = 0;
		}

		if (field229 == -1) {
			field447 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field219[var4] = field219[var4 - 1];
			field220[var4] = field220[var4 - 1];
			field221[var4] = field221[var4 - 1];
		}

		field219[0] = arg2;
		field220[0] = arg1;
		field221[0] = arg0;
	}

	@ObfuscatedName("client.g(I)V")
	public void method27() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field486);

		if (field329 != null) {
			System.out.println("Od-cycle:" + field329.field1248);
		}

		System.out.println("loop-cycle:" + field376);
		System.out.println("draw-cycle:" + field420);
		System.out.println("ptype:" + field309);
		System.out.println("psize:" + field308);

		if (field190 != null) {
			field190.method197();
		}

		field1315 = true;
	}

	@ObfuscatedName("client.d(B)Ljava/awt/Component;")
	public final Component method28() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1321 != null) {
			return field1321;
		}

		return this;
	}

	@ObfuscatedName("client.a(LRWLOYYVC;IZIZIIII)V")
	public final void method29(RWLOYYVC arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field176) {
			field325 = 32;
		} else {
			field325 = 0;
		}

		field176 = false;
		if (arg7 >= arg1 && arg7 < arg1 + 16 && arg4 >= arg2 && arg4 < arg2 + 16) {
			arg0.field1113 -= field464 * 4;

			if (arg3) {
				field320 = true;
				return;
			}
		} else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg4 >= arg2 + arg5 - 16 && arg4 < arg2 + arg5) {
			arg0.field1113 += field464 * 4;

			if (arg3) {
				field320 = true;
				return;
			}
		} else if (arg7 >= arg1 - field325 && arg7 < arg1 + field325 + 16 && arg4 >= arg2 + 16 && arg4 < arg2 + arg5 - 16 && field464 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg6;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg2 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg0.field1113 = (arg6 - arg5) * var10 / var11;

			if (arg3) {
				field320 = true;
			}

			field176 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IILXJCNBMKS;)V")
	public final void method30(int arg0, XJCNBMKS arg1) {
		arg1.method544();
		int var3 = arg1.method545(1);
		if (var3 != 0) {
			int var4 = arg1.method545(2);
			if (var4 == 0) {
				field210[field209++] = field205;
			} else if (var4 == 1) {
				int var5 = arg1.method545(3);
				field281.method584(false, var5);
				int var6 = arg1.method545(1);
				if (var6 == 1) {
					field210[field209++] = field205;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method545(3);
				field281.method584(true, var7);
				int var8 = arg1.method545(3);
				field281.method584(true, var8);
				int var9 = arg1.method545(1);
				if (var9 == 1) {
					field210[field209++] = field205;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method545(7);
				int var11 = arg1.method545(7);
				field131 = arg1.method545(2);
				int var12 = arg1.method545(1);
				if (var12 == 1) {
					field210[field209++] = field205;
				}

				int var13 = arg1.method545(1);
				field281.method585(var10, var11, var13 == 1);
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method31() {
		int var1 = 5;
		field212[8] = 0;
		int var2 = 0;
		while (field212[8] == 0) {
			String var3 = "Unknown problem";
			method107(20, "Connecting to web server");

			try {
				DataInputStream var4 = method137("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 321);
				XJCNBMKS var5 = new XJCNBMKS(new byte[40]);
				var4.readFully(var5.field1402, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field212[var6] = var5.method539();
				}

				int var7 = var5.method539();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field212[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field212[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field212[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field212[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field212[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field212[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method107(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method107(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field402 = !field402;
			}
		}
	}

	@ObfuscatedName("client.a(ILXJCNBMKS;I)V")
	public final void method32(XJCNBMKS arg0, int arg1) {
		field439 = 0;
		field209 = 0;
		method61(arg1, arg0);
		method108(arg0, arg1);
		method104(arg0, arg1);

		for (int var3 = 0; var3 < field439; var3++) {
			int var4 = field440[var3];
			if (field376 != field322[var4].field1434) {
				field322[var4].field631 = null;
				field322[var4] = null;
			}
		}

		if (arg0.field1403 != arg1) {
			signlink.reporterror(field270 + " size mismatch in getnpcpos - pos:" + arg0.field1403 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field323; var5++) {
			if (field322[field324[var5]] == null) {
				signlink.reporterror(field270 + " null entry in npc list - pos:" + var5 + " size:" + field323);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method33() {
		field169 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field328) {
				field486++;
				method20();
				method20();
				method94();
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

		field169 = false;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method34() {
		if (field442 == 0 && field1332 == 1) {
			int var1 = field1333 - 25 - 550;
			int var2 = field1334 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field186 + field134 & 0x7FF;
				int var4 = DQOLNIHT.field567[var3];
				int var5 = DQOLNIHT.field568[var3];
				var4 = (field294 + 256) * var4 >> 8;
				var5 = (field294 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field281.field1472 + var6 >> 7;
				int var9 = field281.field1473 - var7 >> 7;
				boolean var10 = method82(0, 0, 1, 0, field281.field1448[0], var8, true, field281.field1449[0], var9, 0, 0);
				if (var10) {
					field400.method524(var1);
					field400.method524(var2);
					field400.method525(field186);
					field400.method524(57);
					field400.method524(field134);
					field400.method524(field294);
					field400.method524(89);
					field400.method525(field281.field1472);
					field400.method525(field281.field1473);
					field400.method524(field154);
					field400.method524(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)Ljava/lang/String;")
	public final String method35() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1321 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method36(String arg0) {
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

	@ObfuscatedName("client.a(ZJ)V")
	public final void method37(long arg0) {
		if (arg0 != 0L) {
			if (field383 >= 100) {
				method26("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = UWUPOZSY.method490(UWUPOZSY.method487(arg0));
				for (int var4 = 0; var4 < field383; var4++) {
					if (field273[var4] == arg0) {
						method26(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field116; var5++) {
					if (field359[var5] == arg0) {
						method26("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field273[field383++] = arg0;
				field320 = true;
				field400.method523(155);
				field400.method530(arg0);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method38() {
		for (int var1 = 0; var1 < field492; var1++) {
			if (field505[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field360[var1] != field267 || field485[var1] != field490) {
						XJCNBMKS var3 = IXJIDLUT.method292(field360[var1], field485[var1]);
						if (System.currentTimeMillis() + var3.field1403 / 22 > field499 / 22 + field432) {
							field499 = var3.field1403;
							field432 = System.currentTimeMillis();

							if (method49(var3.field1402, var3.field1403)) {
								field267 = field360[var1];
								field490 = field485[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method138()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field505[var1] != -5) {
					field505[var1] = -5;
				} else {
					field492--;
					for (int var5 = var1; var5 < field492; var5++) {
						field360[var5] = field360[var5 + 1];
						field485[var5] = field485[var5 + 1];
						field505[var5] = field505[var5 + 1];
					}

					var1--;
				}
			} else {
				field505[var1]--;
			}
		}

		if (field484 > 0) {
			field484 -= 20;
			if (field484 < 0) {
				field484 = 0;
			}

			if (field484 == 0 && field167 && !field336) {
				field377 = field511;
				field378 = true;
				field329.method430(2, field377);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method39(boolean arg0) {
		for (int var2 = 0; var2 < field323; var2++) {
			FSNLAIJY var3 = field322[field324[var2]];
			int var4 = (field324[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method245() && var3.field631.field942 == arg0) {
				int var5 = var3.field1472 >> 7;
				int var6 = var3.field1473 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1464 == 1 && (var3.field1472 & 0x7F) == 0x40 && (var3.field1473 & 0x7F) == 0x40) {
						if (field161[var5][var6] == field426) {
							continue;
						}

						field161[var5][var6] = field426;
					}

					if (!var3.field631.field958) {
						var4 += Integer.MIN_VALUE;
					}

					field203.method317(var3.field1474, field131, var3.field1472, var3.field1473, (var3.field1464 - 1) * 64 + 60, method91(var3.field1473, field131, var3.field1472), var4, var3, var3.field1455);
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1321 != null) {
				return new URL("http://127.0.0.1:" + (field334 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method40() {
		if (field291 == 0) {
			int var1 = field1332;
			if (field465 == 1 && field1333 >= 516 && field1334 >= 160 && field1333 <= 765 && field1334 <= 205) {
				var1 = 0;
			}

			if (field287) {
				if (var1 != 1) {
					int var2 = field1326;
					int var3 = field1327;
					if (field411 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field411 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field411 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field412 - 10 || var2 > field414 + field412 + 10 || var3 < field413 - 10 || var3 > field415 + field413 + 10) {
						field287 = false;

						if (field411 == 1) {
							field320 = true;
						}

						if (field411 == 2) {
							field447 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field412;
					int var5 = field413;
					int var6 = field414;
					int var7 = field1333;
					int var8 = field1334;
					if (field411 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field411 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field411 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field111; var10++) {
						int var11 = (field111 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method128(var9);
					}

					field287 = false;

					if (field411 == 1) {
						field320 = true;
					}

					if (field411 == 2) {
						field447 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field111 > 0) {
					int var12 = field260[field111 - 1];
					if (var12 == 883 || var12 == 997 || var12 == 67 || var12 == 186 || var12 == 966 || var12 == 99 || var12 == 111 || var12 == 308 || var12 == 442 || var12 == 2 || var12 == 756 || var12 == 1298) {
						int var13 = field258[field111 - 1];
						int var14 = field259[field111 - 1];
						RWLOYYVC var15 = RWLOYYVC.field1135[var14];
						if (var15.field1114 || var15.field1119) {
							field276 = false;
							field178 = 0;
							field289 = var14;
							field290 = var13;
							field291 = 2;
							field292 = field1333;
							field293 = field1334;

							if (RWLOYYVC.field1135[var14].field1124 == field253) {
								field291 = 1;
							}

							if (RWLOYYVC.field1135[var14].field1124 == field229) {
								field291 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field489 == 1 || method25(field111 - 1)) && field111 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field111 > 0) {
					method128(field111 - 1);
				}

				if (var1 != 2 || field111 <= 0) {
					return;
				}

				method45();
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method41() {
		field340.method588();

		if (field442 == 2) {
			byte[] var1 = field515.field541;
			int[] var2 = HQRNTLRZ.field736;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field266.method580(25, field157, 256, 0, 0, 25, field254, field186, 33, 33);
			field341.method588();
		} else {
			int var5 = field186 + field134 & 0x7FF;
			int var6 = field281.field1472 / 32 + 48;
			int var7 = 464 - field281.field1473 / 32;
			field285.method580(var7, field493, field294 + 256, 5, 25, var6, field152, var5, 151, 146);
			field266.method580(25, field157, 256, 0, 0, 25, field254, field186, 33, 33);

			for (int var8 = 0; var8 < field278; var8++) {
				int var9 = field279[var8] * 4 + 2 - field281.field1472 / 32;
				int var10 = field280[var8] * 4 + 2 - field281.field1473 / 32;
				method130(var10, var9, field255[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					EWLVMFRK var13 = field112[field131][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field281.field1472 / 32;
						int var15 = var12 * 4 + 2 - field281.field1473 / 32;
						method130(var15, var14, field244);
					}
				}
			}

			for (int var16 = 0; var16 < field323; var16++) {
				FSNLAIJY var17 = field322[field324[var16]];
				if (var17 != null && var17.method245()) {
					NHTDEVDA var18 = var17.field631;
					if (var18.field948 != null) {
						var18 = var18.method364();
					}

					if (var18 != null && var18.field937 && var18.field958) {
						int var19 = var17.field1472 / 32 - field281.field1472 / 32;
						int var20 = var17.field1473 / 32 - field281.field1473 / 32;
						method130(var20, var19, field245);
					}
				}
			}

			for (int var21 = 0; var21 < field207; var21++) {
				OTTYZSZE var22 = field206[field208[var21]];
				if (var22 != null && var22.method245()) {
					int var23 = var22.field1472 / 32 - field281.field1472 / 32;
					int var24 = var22.field1473 / 32 - field281.field1473 / 32;
					boolean var25 = false;
					long var26 = UWUPOZSY.method486(var22.field1038);
					for (int var28 = 0; var28 < field116; var28++) {
						if (field359[var28] == var26 && field305[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field281.field1032 != 0 && var22.field1032 != 0 && field281.field1032 == var22.field1032) {
						var29 = true;
					}

					if (var25) {
						method130(var24, var23, field247);
					} else if (var29) {
						method130(var24, var23, field248);
					} else {
						method130(var24, var23, field246);
					}
				}
			}

			if (field373 != 0 && field376 % 20 < 10) {
				if (field373 == 1 && field120 >= 0 && field120 < field322.length) {
					FSNLAIJY var30 = field322[field120];
					if (var30 != null) {
						int var31 = var30.field1472 / 32 - field281.field1472 / 32;
						int var32 = var30.field1473 / 32 - field281.field1473 / 32;
						method43(field234, var32, var31);
					}
				}

				if (field373 == 2) {
					int var33 = (field448 - field197) * 4 + 2 - field281.field1472 / 32;
					int var34 = (field449 - field198) * 4 + 2 - field281.field1473 / 32;
					method43(field234, var34, var33);
				}

				if (field373 == 10 && field189 >= 0 && field189 < field206.length) {
					OTTYZSZE var35 = field206[field189];
					if (var35 != null) {
						int var36 = var35.field1472 / 32 - field281.field1472 / 32;
						int var37 = var35.field1473 / 32 - field281.field1473 / 32;
						method43(field234, var37, var36);
					}
				}
			}

			if (field283 != 0) {
				int var38 = field283 * 4 + 2 - field281.field1472 / 32;
				int var39 = field284 * 4 + 2 - field281.field1473 / 32;
				method130(var39, var38, field233);
			}

			HQRNTLRZ.method284(97, 78, 0xFFFFFF, 3, 3);
			field341.method588();
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.g(B)V")
	public final void method42() {
		byte[] var1 = field441.method402("title.dat", null);
		YGMSKJOQ var2 = new YGMSKJOQ(var1, this);
		field299.method588();
		var2.method574(0, 0);
		field300.method588();
		var2.method574(-637, 0);
		field296.method588();
		var2.method574(-128, 0);
		field297.method588();
		var2.method574(-202, -371);
		field298.method588();
		var2.method574(-202, -171);
		field301.method588();
		var2.method574(0, -265);
		field302.method588();
		var2.method574(-562, -265);
		field303.method588();
		var2.method574(-128, -171);
		field304.method588();
		var2.method574(-562, -171);
		int[] var3 = new int[var2.field1416];
		for (int var4 = 0; var4 < var2.field1417; var4++) {
			for (int var5 = 0; var5 < var2.field1416; var5++) {
				var3[var5] = var2.field1415[var2.field1416 * var4 + var2.field1416 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1416; var6++) {
				var2.field1415[var2.field1416 * var4 + var6] = var3[var6];
			}
		}

		field299.method588();
		var2.method574(382, 0);
		field300.method588();
		var2.method574(-255, 0);
		field296.method588();
		var2.method574(254, 0);
		field297.method588();
		var2.method574(180, -371);
		field298.method588();
		var2.method574(180, -171);
		field301.method588();
		var2.method574(382, -265);
		field302.method588();
		var2.method574(-180, -265);
		field303.method588();
		var2.method574(254, -171);
		field304.method588();
		var2.method574(-180, -171);
		YGMSKJOQ var7 = new YGMSKJOQ(field441, "logo", 0);
		field296.method588();
		var7.method576(18, 382 - var7.field1416 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(ILYGMSKJOQ;II)V")
	public final void method43(YGMSKJOQ arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field186 + field134 & 0x7FF;
			int var6 = FUTAQMCE.field701[var5];
			int var7 = FUTAQMCE.field702[var5];
			var6 = var6 * 256 / (field294 + 256);
			var7 = var7 * 256 / (field294 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field228.method581(15, var10, 20, 20, var12 + 94 + 4 - 10, 83 - var13 - 20, 15, 256);
		} else {
			method130(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.a(LRWLOYYVC;ZIIIII)V")
	public final void method44(RWLOYYVC arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0.field1156 == 0 && arg0.field1128 != null && !arg0.field1099 && (arg1 >= arg4 && arg3 >= arg5 && arg1 <= arg0.field1142 + arg4 && arg3 <= arg0.field1133 + arg5)) {
			int var7 = arg0.field1128.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg0.field1120[var8] + arg4;
				int var10 = arg0.field1095[var8] + arg5 - arg2;
				RWLOYYVC var11 = RWLOYYVC.field1135[arg0.field1128[var8]];
				var9 += var11.field1132;
				var10 += var11.field1130;
				if ((var11.field1129 >= 0 || var11.field1118 != 0) && arg1 >= var9 && arg3 >= var10 && arg1 < var11.field1142 + var9 && arg3 < var11.field1133 + var10) {
					if (var11.field1129 >= 0) {
						field124 = var11.field1129;
					} else {
						field124 = var11.field1145;
					}
				}

				if (var11.field1156 == 0) {
					method44(var11, arg1, var11.field1113, arg3, var9, var10);

					if (var11.field1138 > var11.field1133) {
						method29(var11, var11.field1142 + var9, var10, true, arg3, var11.field1133, var11.field1138, arg1);
					}
				} else {
					if (var11.field1150 == 1 && arg1 >= var9 && arg3 >= var10 && arg1 < var11.field1142 + var9 && arg3 < var11.field1133 + var10) {
						boolean var12 = false;
						if (var11.field1143 != 0) {
							var12 = method74(var11);
						}

						if (!var12) {
							field119[field111] = var11.field1112;
							field260[field111] = 539;
							field259[field111] = var11.field1145;
							field111++;
						}
					}

					if (var11.field1150 == 2 && field465 == 0 && arg1 >= var9 && arg3 >= var10 && arg1 < var11.field1142 + var9 && arg3 < var11.field1133 + var10) {
						String var13 = var11.field1105;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field119[field111] = var13 + " @gre@" + var11.field1141;
						field260[field111] = 6;
						field259[field111] = var11.field1145;
						field111++;
					}

					if (var11.field1150 == 3 && arg1 >= var9 && arg3 >= var10 && arg1 < var11.field1142 + var9 && arg3 < var11.field1133 + var10) {
						field119[field111] = "Close";
						field260[field111] = 210;
						field259[field111] = var11.field1145;
						field111++;
					}

					if (var11.field1150 == 4 && arg1 >= var9 && arg3 >= var10 && arg1 < var11.field1142 + var9 && arg3 < var11.field1133 + var10) {
						field119[field111] = var11.field1112;
						field260[field111] = 522;
						field259[field111] = var11.field1145;
						field111++;
					}

					if (var11.field1150 == 5 && arg1 >= var9 && arg3 >= var10 && arg1 < var11.field1142 + var9 && arg3 < var11.field1133 + var10) {
						field119[field111] = var11.field1112;
						field260[field111] = 565;
						field259[field111] = var11.field1145;
						field111++;
					}

					if (var11.field1150 == 6 && !field356 && arg1 >= var9 && arg3 >= var10 && arg1 < var11.field1142 + var9 && arg3 < var11.field1133 + var10) {
						field119[field111] = var11.field1112;
						field260[field111] = 551;
						field259[field111] = var11.field1145;
						field111++;
					}

					if (var11.field1156 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field1133; var15++) {
							for (int var16 = 0; var16 < var11.field1142; var16++) {
								int var17 = (var11.field1116 + 32) * var16 + var9;
								int var18 = (var11.field1136 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field1103[var14];
									var18 += var11.field1109[var14];
								}

								if (arg1 >= var17 && arg3 >= var18 && arg1 < var17 + 32 && arg3 < var18 + 32) {
									field522 = var14;
									field523 = var11.field1145;

									if (var11.field1153[var14] > 0) {
										AOLTHQTO var19 = AOLTHQTO.method13(var11.field1153[var14] - 1);
										if (field350 == 1 && var11.field1131) {
											if (field352 != var11.field1145 || field351 != var14) {
												field119[field111] = "Use " + field354 + " with @lre@" + var19.field43;
												field260[field111] = 373;
												field261[field111] = var19.field78;
												field258[field111] = var14;
												field259[field111] = var11.field1145;
												field111++;
											}
										} else if (field465 != 1 || !var11.field1131) {
											if (var11.field1131) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field80 != null && var19.field80[var20] != null) {
														field119[field111] = var19.field80[var20] + " @lre@" + var19.field43;

														if (var20 == 3) {
															field260[field111] = 442;
														}

														if (var20 == 4) {
															field260[field111] = 2;
														}

														field261[field111] = var19.field78;
														field258[field111] = var14;
														field259[field111] = var11.field1145;
														field111++;
													} else if (var20 == 4) {
														field119[field111] = "Drop @lre@" + var19.field43;
														field260[field111] = 2;
														field261[field111] = var19.field78;
														field258[field111] = var14;
														field259[field111] = var11.field1145;
														field111++;
													}
												}
											}

											if (var11.field1092) {
												field119[field111] = "Use @lre@" + var19.field43;
												field260[field111] = 756;
												field261[field111] = var19.field78;
												field258[field111] = var14;
												field259[field111] = var11.field1145;
												field111++;
											}

											if (var11.field1131 && var19.field80 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field80[var21] != null) {
														field119[field111] = var19.field80[var21] + " @lre@" + var19.field43;

														if (var21 == 0) {
															field260[field111] = 99;
														}

														if (var21 == 1) {
															field260[field111] = 111;
														}

														if (var21 == 2) {
															field260[field111] = 308;
														}

														field261[field111] = var19.field78;
														field258[field111] = var14;
														field259[field111] = var11.field1145;
														field111++;
													}
												}
											}

											if (var11.field1149 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field1149[var22] != null) {
														field119[field111] = var11.field1149[var22] + " @lre@" + var19.field43;

														if (var22 == 0) {
															field260[field111] = 883;
														}

														if (var22 == 1) {
															field260[field111] = 997;
														}

														if (var22 == 2) {
															field260[field111] = 67;
														}

														if (var22 == 3) {
															field260[field111] = 186;
														}

														if (var22 == 4) {
															field260[field111] = 966;
														}

														field261[field111] = var19.field78;
														field258[field111] = var14;
														field259[field111] = var11.field1145;
														field111++;
													}
												}
											}

											field119[field111] = "Examine @lre@" + var19.field43;
											field260[field111] = 1298;
											field261[field111] = var19.field78;
											field258[field111] = var14;
											field259[field111] = var11.field1145;
											field111++;
										} else if ((field467 & 0x10) == 0x10) {
											field119[field111] = field468 + " @lre@" + var19.field43;
											field260[field111] = 162;
											field261[field111] = var19.field78;
											field258[field111] = var14;
											field259[field111] = var11.field1145;
											field111++;
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

	@ObfuscatedName("client.g(Z)V")
	public final void method45() {
		int var1 = field129.method468("Choose Option");
		for (int var2 = 0; var2 < field111; var2++) {
			int var3 = field129.method468(field119[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field111 * 15 + 21;
		if (field1333 > 4 && field1334 > 4 && field1333 < 516 && field1334 < 338) {
			int var5 = field1333 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1334 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field287 = true;
			field411 = 0;
			field412 = var5;
			field413 = var6;
			field414 = var1;
			field415 = field111 * 15 + 22;
		}

		if (field1333 > 553 && field1334 > 205 && field1333 < 743 && field1334 < 466) {
			int var7 = field1333 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1334 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field287 = true;
			field411 = 1;
			field412 = var7;
			field413 = var8;
			field414 = var1;
			field415 = field111 * 15 + 22;
		}

		if (field1333 > 17 && field1334 > 357 && field1333 < 496 && field1334 < 453) {
			int var9 = field1333 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1334 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field287 = true;
			field411 = 2;
			field412 = var9;
			field413 = var10;
			field414 = var1;
			field415 = field111 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method46() {
		method107(20, "Starting up");

		if (signlink.sunjava) {
			field1312 = 5;
		}

		if (field175) {
			field286 = true;
		} else {
			field175 = true;
			boolean var1 = false;
			String var2 = method35();
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
						field443[var3] = new OVNURGUS(signlink.cache_idx[var3], signlink.cache_dat, var3 + 1, 500000);
					}
				}

				try {
					method31();
					field441 = method83("title", 1, 25, "title screen", field212[1]);
					field127 = new UMCYZJWP("p11_full", false, field441);
					field128 = new UMCYZJWP("p12_full", false, field441);
					field129 = new UMCYZJWP("b12_full", false, field441);
					field130 = new UMCYZJWP("q8_full", true, field441);
					method42();
					method70();
					QKFGLETG var4 = method83("config", 2, 30, "config", field212[2]);
					QKFGLETG var5 = method83("interface", 3, 35, "interface", field212[3]);
					QKFGLETG var6 = method83("media", 4, 40, "2d graphics", field212[4]);
					QKFGLETG var7 = method83("textures", 6, 45, "textures", field212[6]);
					QKFGLETG var8 = method83("wordenc", 7, 50, "chat system", field212[7]);
					QKFGLETG var9 = method83("sounds", 8, 55, "sound effects", field212[8]);
					field462 = new byte[4][104][104];
					field313 = new int[4][105][105];
					field203 = new KALHRUDX(4, 104, field313, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field126[var10] = new OPAHDXQS(104, 104);
					}

					field285 = new YGMSKJOQ(512, 512);
					QKFGLETG var11 = method83("versionlist", 5, 60, "update list", field212[5]);
					method107(60, "Connecting to update server");
					field329 = new SDLNXGIT();
					field329.method448(var11, this);
					RYVJCVCB.method424(field329.method433());
					FUTAQMCE.method247(field329.method429(0), field329);

					if (!field336) {
						field377 = 0;
						try {
							field377 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field378 = true;
						field329.method430(2, field377);

						while (field329.method440() > 0) {
							method156();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field329.field1246 > 3) {
								method36("ondemand");
								return;
							}
						}
					}

					method107(65, "Requesting animations");
					int var12 = field329.method429(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field329.method430(1, var13);
					}

					while (field329.method440() > 0) {
						int var14 = var12 - field329.method440();
						if (var14 > 0) {
							method107(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method156();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field329.field1246 > 3) {
							method36("ondemand");
							return;
						}
					}

					method107(70, "Requesting models");
					int var15 = field329.method429(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field329.method439(var16);
						if ((var17 & 0x1) != 0) {
							field329.method430(0, var16);
						}
					}

					int var18 = field329.method440();
					while (field329.method440() > 0) {
						int var19 = var18 - field329.method440();
						if (var19 > 0) {
							method107(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method156();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field443[0] != null) {
						method107(75, "Requesting maps");
						field329.method430(3, field329.method438(0, 47, 48));
						field329.method430(3, field329.method438(1, 47, 48));
						field329.method430(3, field329.method438(0, 48, 48));
						field329.method430(3, field329.method438(1, 48, 48));
						field329.method430(3, field329.method438(0, 49, 48));
						field329.method430(3, field329.method438(1, 49, 48));
						field329.method430(3, field329.method438(0, 47, 47));
						field329.method430(3, field329.method438(1, 47, 47));
						field329.method430(3, field329.method438(0, 48, 47));
						field329.method430(3, field329.method438(1, 48, 47));
						field329.method430(3, field329.method438(0, 48, 148));
						field329.method430(3, field329.method438(1, 48, 148));
						int var20 = field329.method440();
						while (field329.method440() > 0) {
							int var21 = var20 - field329.method440();
							if (var21 > 0) {
								method107(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method156();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field329.method429(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field329.method439(var23);
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
							field329.method446(0, var23, var25);
						}
					}

					field329.method432(field335);

					if (!field336) {
						int var26 = field329.method429(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field329.method449(var27)) {
								field329.method446(2, var27, (byte) 1);
							}
						}
					}

					method107(80, "Unpacking media");
					field514 = new DEITBGVL(var6, "invback", 0);
					field516 = new DEITBGVL(var6, "chatback", 0);
					field515 = new DEITBGVL(var6, "mapback", 0);
					field427 = new DEITBGVL(var6, "backbase1", 0);
					field428 = new DEITBGVL(var6, "backbase2", 0);
					field429 = new DEITBGVL(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field470[var28] = new DEITBGVL(var6, "sideicons", var28);
					}

					field266 = new YGMSKJOQ(var6, "compass", 0);
					field228 = new YGMSKJOQ(var6, "mapedge", 0);
					field228.method573();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field519[var29] = new DEITBGVL(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field526[var30] = new YGMSKJOQ(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field183[var31] = new YGMSKJOQ(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field401[var32] = new YGMSKJOQ(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field233 = new YGMSKJOQ(var6, "mapmarker", 0);
					field234 = new YGMSKJOQ(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field319[var33] = new YGMSKJOQ(var6, "cross", var33);
					}

					field244 = new YGMSKJOQ(var6, "mapdots", 0);
					field245 = new YGMSKJOQ(var6, "mapdots", 1);
					field246 = new YGMSKJOQ(var6, "mapdots", 2);
					field247 = new YGMSKJOQ(var6, "mapdots", 3);
					field248 = new YGMSKJOQ(var6, "mapdots", 4);
					field520 = new DEITBGVL(var6, "scrollbar", 0);
					field521 = new DEITBGVL(var6, "scrollbar", 1);
					field213 = new DEITBGVL(var6, "redstone1", 0);
					field214 = new DEITBGVL(var6, "redstone2", 0);
					field215 = new DEITBGVL(var6, "redstone3", 0);
					field216 = new DEITBGVL(var6, "redstone1", 0);
					field216.method163();
					field217 = new DEITBGVL(var6, "redstone2", 0);
					field217.method163();
					field506 = new DEITBGVL(var6, "redstone1", 0);
					field506.method164();
					field507 = new DEITBGVL(var6, "redstone2", 0);
					field507.method164();
					field508 = new DEITBGVL(var6, "redstone3", 0);
					field508.method164();
					field509 = new DEITBGVL(var6, "redstone1", 0);
					field509.method163();
					field509.method164();
					field510 = new DEITBGVL(var6, "redstone2", 0);
					field510.method163();
					field510.method164();

					for (int var34 = 0; var34 < 2; var34++) {
						field193[var34] = new DEITBGVL(var6, "mod_icons", var34);
					}

					YGMSKJOQ var35 = new YGMSKJOQ(var6, "backleft1", 0);
					field474 = new YQSLUNUN(var35.field1417, method28(), var35.field1416);
					var35.method574(0, 0);
					YGMSKJOQ var36 = new YGMSKJOQ(var6, "backleft2", 0);
					field475 = new YQSLUNUN(var36.field1417, method28(), var36.field1416);
					var36.method574(0, 0);
					YGMSKJOQ var37 = new YGMSKJOQ(var6, "backright1", 0);
					field476 = new YQSLUNUN(var37.field1417, method28(), var37.field1416);
					var37.method574(0, 0);
					YGMSKJOQ var38 = new YGMSKJOQ(var6, "backright2", 0);
					field477 = new YQSLUNUN(var38.field1417, method28(), var38.field1416);
					var38.method574(0, 0);
					YGMSKJOQ var39 = new YGMSKJOQ(var6, "backtop1", 0);
					field478 = new YQSLUNUN(var39.field1417, method28(), var39.field1416);
					var39.method574(0, 0);
					YGMSKJOQ var40 = new YGMSKJOQ(var6, "backvmid1", 0);
					field479 = new YQSLUNUN(var40.field1417, method28(), var40.field1416);
					var40.method574(0, 0);
					YGMSKJOQ var41 = new YGMSKJOQ(var6, "backvmid2", 0);
					field480 = new YQSLUNUN(var41.field1417, method28(), var41.field1416);
					var41.method574(0, 0);
					YGMSKJOQ var42 = new YGMSKJOQ(var6, "backvmid3", 0);
					field481 = new YQSLUNUN(var42.field1417, method28(), var42.field1416);
					var42.method574(0, 0);
					YGMSKJOQ var43 = new YGMSKJOQ(var6, "backhmid2", 0);
					field482 = new YQSLUNUN(var43.field1417, method28(), var43.field1416);
					var43.method574(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field526[var48] != null) {
							field526[var48].method572(var46 + var47, var44 + var47, var45 + var47);
						}

						if (field519[var48] != null) {
							field519[var48].method165(var46 + var47, var44 + var47, var45 + var47);
						}
					}

					method107(83, "Unpacking textures");
					DQOLNIHT.method175(var7);
					DQOLNIHT.method179(0.8D);
					DQOLNIHT.method174(20);
					method107(86, "Unpacking config");
					GMRGYXFL.method276(var4);
					SIUJJQHQ.method451(var4);
					MQVXAZFZ.method358(var4);
					AOLTHQTO.method6(var4);
					NHTDEVDA.method365(var4);
					OQTGDMNX.method383(var4);
					VSBOWDVL.method517(var4);
					NYAYDXBO.method369(var4);
					VSLUEINI.method520(var4);
					AOLTHQTO.field51 = field335;

					if (!field336) {
						method107(90, "Unpacking sounds");
						byte[] var49 = var9.method402("sounds.dat", null);
						XJCNBMKS var50 = new XJCNBMKS(var49);
						IXJIDLUT.method291(var50);
					}

					method107(95, "Unpacking interfaces");
					UMCYZJWP[] var51 = new UMCYZJWP[] { field127, field128, field129, field130 };
					RWLOYYVC.method410(var5, var51, var6);
					method107(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field515.field541[field515.field543 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field157[var52] = var53;
						field254[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field515.field541[field515.field543 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field493[var56 - 5] = var57 - 25;
						field152[var56 - 5] = var58 - var57;
					}

					DQOLNIHT.method172(96, 479);
					field158 = DQOLNIHT.field569;
					DQOLNIHT.method172(261, 190);
					field159 = DQOLNIHT.field569;
					DQOLNIHT.method172(334, 512);
					field160 = DQOLNIHT.field569;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = DQOLNIHT.field567[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					KALHRUDX.method342(500, 512, 334, var60, 800);
					EZWZJZNN.method206(var8);
					field265 = new JUGCSXVJ(this);
					method106(field265, 10);
					ACEWFDYF.field11 = this;
					SIUJJQHQ.field1262 = this;
					NHTDEVDA.field947 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field168 + " " + field460);
					field251 = true;
				}
			} else {
				field364 = true;
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method47() {
		field342.method588();
		DQOLNIHT.field569 = field158;
		field516.method166(0, 0);

		if (field243) {
			field129.method466(40, field421, 0, 239);
			field129.method466(60, field365 + "*", 128, 239);
		} else if (field218 == 1) {
			field129.method466(40, "Enter amount:", 0, 239);
			field129.method466(60, field237 + "*", 128, 239);
		} else if (field218 == 2) {
			field129.method466(40, "Enter name:", 0, 239);
			field129.method466(60, field237 + "*", 128, 239);
		} else if (field525 != null) {
			field129.method466(40, field525, 0, 239);
			field129.method466(60, "Click to continue", 128, 239);
		} else if (field229 != -1) {
			method158(RWLOYYVC.field1135[field229], 0, 0, 0);
		} else if (field494 == -1) {
			UMCYZJWP var1 = field128;
			int var2 = 0;
			HQRNTLRZ.method281(0, 0, 463, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field221[var3] != null) {
					int var4 = field219[var3];
					int var5 = field118 + 70 - var2 * 14;
					String var6 = field220[var3];
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
							var1.method470(4, field221[var3], 0, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field473 == 0 || field473 == 1 && method68(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field193[0].method166(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field193[1].method166(var5 - 12, var8);
								var8 += 14;
							}

							var1.method470(var8, var6 + ":", 0, var5);
							var8 += var1.method468(var6) + 8;
							var1.method470(var8, field221[var3], 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field458 == 0 && (var4 == 7 || field366 == 0 || field366 == 1 && method68(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method470(var9, "From", 0, var5);
							int var11 = var9 + var1.method468("From ");
							if (var7 == 1) {
								field193[0].method166(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field193[1].method166(var5 - 12, var11);
								var11 += 14;
							}

							var1.method470(var11, var6 + ":", 0, var5);
							var11 += var1.method468(var6) + 8;
							var1.method470(var11, field221[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field162 == 0 || field162 == 1 && method68(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method470(4, var6 + " " + field221[var3], 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && field458 == 0 && field366 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method470(4, field221[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && field458 == 0 && field366 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method470(4, "To " + var6 + ":", 0, var5);
							var1.method470(var1.method468("To " + var6) + 12, field221[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field162 == 0 || field162 == 1 && method68(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method470(4, var6 + " " + field221[var3], 0x7E3200, var5);
						}

						var2++;
					}
				}
			}

			HQRNTLRZ.method280();
			field495 = var2 * 14 + 7;
			if (field495 < 78) {
				field495 = 78;
			}

			method62(field495 - field118 - 77, 77, 463, 0, field495);
			String var10;
			if (field281 == null || field281.field1038 == null) {
				var10 = UWUPOZSY.method490(field270);
			} else {
				var10 = field281.field1038;
			}

			var1.method470(4, var10 + ":", 0, 90);
			var1.method470(var1.method468(var10 + ": ") + 6, field262 + "*", 255, 90);
			HQRNTLRZ.method287(0, 77, 479, 0);
		} else {
			method158(RWLOYYVC.field1135[field494], 0, 0, 0);
		}

		if (field287 && field411 == 2) {
			method126();
		}

		field342.method589(357, field1318, 17);
		field341.method588();
		DQOLNIHT.field569 = field160;
	}

	@ObfuscatedName("client.a(BLRWLOYYVC;)Z")
	public final boolean method48(RWLOYYVC arg0) {
		int var2 = arg0.field1143;
		if (field117 == 2) {
			if (var2 == 201) {
				field447 = true;
				field218 = 0;
				field243 = true;
				field365 = "";
				field380 = 1;
				field421 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field447 = true;
				field218 = 0;
				field243 = true;
				field365 = "";
				field380 = 2;
				field421 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field312 = 250;
			return true;
		}

		if (var2 == 501) {
			field447 = true;
			field218 = 0;
			field243 = true;
			field365 = "";
			field380 = 4;
			field421 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field447 = true;
			field218 = 0;
			field243 = true;
			field365 = "";
			field380 = 5;
			field421 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field397[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = OQTGDMNX.field1015 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= OQTGDMNX.field1015) {
							var5 = 0;
						}
					}

					if (!OQTGDMNX.field1016[var5].field1022 && OQTGDMNX.field1016[var5].field1017 == var3 + (field141 ? 0 : 7)) {
						break;
					}
				}

				field397[var3] = var5;
				field337 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field433[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field501[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field501[var6].length) {
					var8 = 0;
				}
			}

			field433[var6] = var8;
			field337 = true;
		}

		if (var2 == 324 && !field141) {
			field141 = true;
			method52();
		}

		if (var2 == 325 && field141) {
			field141 = false;
			method52();
		}

		if (var2 == 326) {
			field400.method523(77);
			field400.method524(field141 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field400.method524(field397[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field400.method524(field433[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field182 = !field182;
		}

		if (var2 >= 601 && var2 <= 612) {
			method63();

			if (field369.length() > 0) {
				field400.method523(251);
				field400.method530(UWUPOZSY.method486(field369));
				field400.method524(var2 - 601);
				field400.method524(field182 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method49(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		OCRHTPRV var10 = null;
		for (OCRHTPRV var11 = (OCRHTPRV) field192.method201(); var11 != null; var11 = (OCRHTPRV) field192.method203()) {
			if (var11.field999 == arg3 && var11.field1001 == arg0 && var11.field1002 == arg8 && var11.field1000 == arg5) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new OCRHTPRV();
			var10.field999 = arg3;
			var10.field1000 = arg5;
			var10.field1001 = arg0;
			var10.field1002 = arg8;
			method95(var10);
			field192.method198(var10);
		}

		var10.field1007 = arg6;
		var10.field1009 = arg2;
		var10.field1008 = arg1;
		var10.field1006 = arg7;
		var10.field998 = arg4;
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method51() {
		for (int var1 = -1; var1 < field207; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field205;
			} else {
				var2 = field208[var1];
			}

			OTTYZSZE var3 = field206[var2];
			if (var3 != null) {
				method142(var3, 1);
			}
		}

		field110++;
		if (field110 > 71) {
			field110 = 0;
			field400.method523(13);
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method52() {
		field337 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field397[var1] = -1;
			for (int var2 = 0; var2 < OQTGDMNX.field1015; var2++) {
				if (!OQTGDMNX.field1016[var2].field1022 && OQTGDMNX.field1016[var2].field1017 == var1 + (field141 ? 0 : 7)) {
					field397[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method53(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field383; var3++) {
				if (field273[var3] == arg0) {
					field383--;
					field320 = true;

					for (int var4 = var3; var4 < field383; var4++) {
						field273[var4] = field273[var4 + 1];
					}

					field400.method523(43);
					field400.method530(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method54(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field116; var3++) {
				if (field359[var3] == arg0) {
					field116--;
					field320 = true;

					for (int var4 = var3; var4 < field116; var4++) {
						field163[var4] = field163[var4 + 1];
						field305[var4] = field305[var4 + 1];
						field359[var4] = field359[var4 + 1];
					}

					field400.method523(1);
					field400.method530(arg0);
					break;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 321);

			if (arg0.length == 5) {
				field333 = Integer.parseInt(arg0[0]);
				field334 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method139();
				} else if (arg0[2].equals("highmem")) {
					method86();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field335 = false;
				} else if (arg0[3].equals("members")) {
					field335 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method481(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method55() {
		field328 = false;
		while (field169) {
			field328 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field306 = null;
		field307 = null;
		field422 = null;
		field223 = null;
		field224 = null;
		field225 = null;
		field226 = null;
		field235 = null;
		field236 = null;
		field370 = null;
		field371 = null;
		field132 = null;
		field133 = null;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method56() {
		if (field373 == 2) {
			method67((field448 - field197 << 7) + field451, field450 * 2, (field449 - field198 << 7) + field452);

			if (field314 > -1 && field376 % 20 < 10) {
				field401[2].method576(field315 - 28, field314 - 12);
			}
		}
	}

	@ObfuscatedName("client.b(III)Z")
	public final boolean method57(int arg0, int arg1) {
		boolean var3 = false;
		RWLOYYVC var4 = RWLOYYVC.field1135[arg0];
		for (int var5 = 0; var5 < var4.field1128.length && var4.field1128[var5] != -1; var5++) {
			RWLOYYVC var6 = RWLOYYVC.field1135[var4.field1128[var5]];
			if (var6.field1156 == 1) {
				var3 |= method57(var6.field1145, arg1);
			}

			if (var6.field1156 == 6 && (var6.field1125 != -1 || var6.field1126 != -1)) {
				boolean var7 = method159(var6);
				int var8;
				if (var7) {
					var8 = var6.field1126;
				} else {
					var8 = var6.field1125;
				}

				if (var8 != -1) {
					GMRGYXFL var9 = GMRGYXFL.field720[var8];
					var6.field1127 += arg1;
					while (var6.field1127 > var9.method277(var6.field1152)) {
						var6.field1127 -= var9.method277(var6.field1152) + 1;
						var6.field1152++;
						if (var6.field1152 >= var9.field721) {
							var6.field1152 -= var9.field725;
							if (var6.field1152 < 0 || var6.field1152 >= var9.field721) {
								var6.field1152 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1156 == 6 && var6.field1101 != 0) {
				int var10 = var6.field1101 >> 16;
				int var11 = var6.field1101 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1122 = var6.field1122 + var10 & 0x7FF;
				var6.field1123 = var6.field1123 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.j(B)Z")
	public final boolean method58() {
		if (field190 == null) {
			return false;
		}

		try {
			int var1 = field190.method194();
			if (var1 == 0) {
				return false;
			}

			if (field309 == -1) {
				field190.method195(field498.field1402, 0, 1);
				field309 = field498.field1402[0] & 0xFF;
				if (field202 != null) {
					field309 = field309 - field202.method3() & 0xFF;
				}

				field308 = VDRHOWCL.field1367[field309];
				var1--;
			}

			if (field308 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field190.method195(field498.field1402, 0, 1);
				field308 = field498.field1402[0] & 0xFF;
				var1--;
			}

			if (field308 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field190.method195(field498.field1402, 0, 2);
				field498.field1403 = 0;
				field308 = field498.method536();
				var1 -= 2;
			}

			if (var1 < field308) {
				return false;
			}

			field498.field1403 = 0;
			field190.method195(field498.field1402, 0, field308);
			field310 = 0;
			field145 = field144;
			field144 = field143;
			field143 = field309;

			if (field309 == 212) {
				field320 = true;
				int var2 = field498.method566();
				int var3 = field498.method553();
				int var4 = field498.method552();
				field345[var3] = var2;
				field179[var3] = var4;
				field430[var3] = 1;
				for (int var5 = 0; var5 < 98; var5++) {
					if (var2 >= field121[var5]) {
						field430[var3] = var5 + 2;
					}
				}

				field309 = -1;
				return true;
			}

			if (field309 == 184) {
				if (field231 == 12) {
					field320 = true;
				}

				field153 = field498.method537();
				field309 = -1;
				return true;
			}

			if (field309 == 113) {
				if (field139 != -1) {
					field139 = -1;
					field320 = true;
					field517 = true;
				}

				if (field229 != -1) {
					field229 = -1;
					field447 = true;
				}

				if (field218 != 0) {
					field218 = 0;
					field447 = true;
				}

				field253 = -1;
				field356 = false;
				field309 = -1;
				return true;
			}

			if (field309 == 36) {
				field115 = false;

				for (int var6 = 0; var6 < 5; var6++) {
					field272[var6] = false;
				}

				field309 = -1;
				return true;
			}

			if (field309 == 239) {
				int var7 = field498.method561();
				int var8 = field498.method536();
				int var9 = var7 >> 10 & 0x1F;
				int var10 = var7 >> 5 & 0x1F;
				int var11 = var7 & 0x1F;
				RWLOYYVC.field1135[var8].field1096 = (var11 << 3) + (var9 << 19) + (var10 << 11);
				field309 = -1;
				return true;
			}

			if (field309 == 204) {
				String var12 = field498.method541();
				int var13 = field498.method553();
				int var14 = field498.method534();
				if (var13 >= 1 && var13 <= 5) {
					if (var12.equalsIgnoreCase("null")) {
						var12 = null;
					}

					field527[var13 - 1] = var12;
					field528[var13 - 1] = var14 == 0;
				}

				field309 = -1;
				return true;
			}

			if (field309 == 171) {
				int var15 = field498.method559();
				String var16 = field498.method541();
				RWLOYYVC.field1135[var15].field1117 = var16;

				if (field137[field231] == RWLOYYVC.field1135[var15].field1124) {
					field320 = true;
				}

				field309 = -1;
				return true;
			}

			if (field309 == 189) {
				field358 = field498.method536();
				field122 = field498.method553();
				field309 = -1;
				return true;
			}

			if (field309 == 138) {
				method32(field498, field308);
				field309 = -1;
				return true;
			}

			if (field309 != 211 && field309 != 152) {
				if (field309 == 58) {
					field346 = field498.method536() * 30;
					field309 = -1;
					return true;
				}

				if (field309 == 101) {
					field442 = field498.method534();
					field309 = -1;
					return true;
				}

				if (field309 == 3) {
					method59(field308, field498);
					field348 = false;
					field309 = -1;
					return true;
				}

				if (field309 == 217) {
					int var67 = field498.method561();
					method133(var67);

					if (field139 != -1) {
						field139 = -1;
						field320 = true;
						field517 = true;
					}

					if (field229 != -1) {
						field229 = -1;
						field447 = true;
					}

					if (field218 != 0) {
						field218 = 0;
						field447 = true;
					}

					field253 = var67;
					field356 = false;
					field309 = -1;
					return true;
				}

				if (field309 == 132) {
					for (int var68 = 0; var68 < field524.length; var68++) {
						if (field524[var68] != field230[var68]) {
							field524[var68] = field230[var68];
							method155(var68);
							field320 = true;
						}
					}

					field309 = -1;
					return true;
				}

				if (field309 == 170) {
					field327 = field498.method534();
					field309 = -1;
					return true;
				}

				if (field309 == 207) {
					int var69 = field498.method536();
					byte var70 = field498.method535();
					field230[var69] = var70;

					if (field524[var69] != var70) {
						field524[var69] = var70;
						method155(var69);
						field320 = true;

						if (field494 != -1) {
							field447 = true;
						}
					}

					field309 = -1;
					return true;
				}

				if (field309 == 126) {
					field231 = field498.method552();
					field320 = true;
					field517 = true;
					field309 = -1;
					return true;
				}

				if (field309 == 135) {
					field383 = field308 / 8;
					for (int var71 = 0; var71 < field383; var71++) {
						field273[var71] = field498.method540();
					}

					field309 = -1;
					return true;
				}

				if (field309 == 149) {
					int var72 = field498.method554();
					int var73 = field498.method536();
					if (var73 == 0xFFFF) {
						var73 = -1;
					}

					field137[var72] = var73;
					field320 = true;
					field517 = true;
					field309 = -1;
					return true;
				}

				if (field309 == 177) {
					field283 = 0;
					field309 = -1;
					return true;
				}

				if (field309 == 163) {
					field320 = true;
					int var74 = field498.method536();
					RWLOYYVC var75 = RWLOYYVC.field1135[var74];
					while (field498.field1403 < field308) {
						int var76 = field498.method548();
						int var77 = field498.method536();
						int var78 = field498.method534();
						if (var78 == 255) {
							var78 = field498.method539();
						}

						if (var76 >= 0 && var76 < var75.field1153.length) {
							var75.field1153[var76] = var77;
							var75.field1115[var76] = var78;
						}
					}

					field309 = -1;
					return true;
				}

				if (field309 == 70) {
					long var79 = field498.method540();
					int var81 = field498.method539();
					int var82 = field498.method534();
					boolean var83 = false;
					for (int var84 = 0; var84 < 100; var84++) {
						if (field407[var84] == var81) {
							var83 = true;
							break;
						}
					}

					if (var82 <= 1) {
						for (int var85 = 0; var85 < field383; var85++) {
							if (field273[var85] == var79) {
								var83 = true;
								break;
							}
						}
					}

					if (!var83 && field156 == 0) {
						try {
							field407[field446] = var81;
							field446 = (field446 + 1) % 100;
							String var86 = PBQQFQEC.method397(field308 - 13, field498);
							if (var82 != 3) {
								var86 = EZWZJZNN.method216(var86);
							}

							if (var82 == 2 || var82 == 3) {
								method26(var86, "@cr2@" + UWUPOZSY.method490(UWUPOZSY.method487(var79)), 7);
							} else if (var82 == 1) {
								method26(var86, "@cr1@" + UWUPOZSY.method490(UWUPOZSY.method487(var79)), 7);
							} else {
								method26(var86, UWUPOZSY.method490(UWUPOZSY.method487(var79)), 3);
							}
						} catch (Exception var189) {
							signlink.reporterror("cde1");
						}
					}

					field309 = -1;
					return true;
				}

				if (field309 == 245) {
					int var88 = field498.method567();
					int var89 = field498.method536();
					field230[var89] = var88;

					if (field524[var89] != var88) {
						field524[var89] = var88;
						method155(var89);
						field320 = true;

						if (field494 != -1) {
							field447 = true;
						}
					}

					field309 = -1;
					return true;
				}

				if (field309 == 60) {
					field320 = true;
					int var90 = field498.method536();
					RWLOYYVC var91 = RWLOYYVC.field1135[var90];
					int var92 = field498.method536();
					for (int var93 = 0; var93 < var92; var93++) {
						var91.field1153[var93] = field498.method536();
						int var94 = field498.method554();
						if (var94 == 255) {
							var94 = field498.method539();
						}

						var91.field1115[var93] = var94;
					}

					for (int var95 = var92; var95 < var91.field1153.length; var95++) {
						var91.field1153[var95] = 0;
						var91.field1115[var95] = 0;
					}

					field309 = -1;
					return true;
				}

				if (field309 == 230) {
					String var96 = field498.method541();
					if (var96.endsWith(":tradereq:")) {
						String var97 = var96.substring(0, var96.indexOf(":"));
						long var98 = UWUPOZSY.method486(var97);
						boolean var100 = false;
						for (int var101 = 0; var101 < field383; var101++) {
							if (field273[var101] == var98) {
								var100 = true;
								break;
							}
						}

						if (!var100 && field156 == 0) {
							method26("wishes to trade with you.", var97, 4);
						}
					} else if (var96.endsWith(":duelreq:")) {
						String var102 = var96.substring(0, var96.indexOf(":"));
						long var103 = UWUPOZSY.method486(var102);
						boolean var105 = false;
						for (int var106 = 0; var106 < field383; var106++) {
							if (field273[var106] == var103) {
								var105 = true;
								break;
							}
						}

						if (!var105 && field156 == 0) {
							method26("wishes to duel with you.", var102, 8);
						}
					} else if (var96.endsWith(":chalreq:")) {
						String var107 = var96.substring(0, var96.indexOf(":"));
						long var108 = UWUPOZSY.method486(var107);
						boolean var110 = false;
						for (int var111 = 0; var111 < field383; var111++) {
							if (field273[var111] == var108) {
								var110 = true;
								break;
							}
						}

						if (!var110 && field156 == 0) {
							String var112 = var96.substring(var96.indexOf(":") + 1, var96.length() - 9);
							method26(var112, var107, 8);
						}
					} else {
						method26(var96, "", 0);
					}

					field309 = -1;
					return true;
				}

				if (field309 != 240 && field309 != 35 && field309 != 159 && field309 != 26 && field309 != 80 && field309 != 128 && field309 != 37 && field309 != 61 && field309 != 72 && field309 != 251 && field309 != 102) {
					if (field309 == 52) {
						int var113 = field498.method561();
						method133(var113);

						if (field139 != -1) {
							field139 = -1;
							field320 = true;
							field517 = true;
						}

						field229 = var113;
						field447 = true;
						field253 = -1;
						field356 = false;
						field309 = -1;
						return true;
					}

					if (field309 == 81) {
						int var114 = field498.method536();
						int var115 = field498.method559();
						int var116 = field498.method536();

						if (var114 == 0xFFFF) {
							RWLOYYVC.field1135[var115].field1146 = 0;
							field309 = -1;
							return true;
						}

						AOLTHQTO var117 = AOLTHQTO.method13(var114);
						RWLOYYVC.field1135[var115].field1146 = 4;
						RWLOYYVC.field1135[var115].field1147 = var114;
						RWLOYYVC.field1135[var115].field1122 = var117.field69;
						RWLOYYVC.field1135[var115].field1123 = var117.field58;
						RWLOYYVC.field1135[var115].field1121 = var117.field37 * 100 / var116;
						field309 = -1;
						return true;
					}

					if (field309 == 57) {
						if (field231 == 12) {
							field320 = true;
						}

						field113 = field498.method534();
						field309 = -1;
						return true;
					}

					if (field309 == 220) {
						int var118 = field498.method564();
						field494 = var118;
						field447 = true;
						field309 = -1;
						return true;
					}

					if (field309 == 222) {
						long var119 = field498.method540();
						int var121 = field498.method534();
						String var122 = UWUPOZSY.method490(UWUPOZSY.method487(var119));
						for (int var123 = 0; var123 < field116; var123++) {
							if (field359[var123] == var119) {
								if (field305[var123] != var121) {
									field305[var123] = var121;
									field320 = true;

									if (var121 > 0) {
										method26(var122 + " has logged in.", "", 5);
									}

									if (var121 == 0) {
										method26(var122 + " has logged out.", "", 5);
									}
								}

								var122 = null;
								break;
							}
						}

						if (var122 != null && field116 < 200) {
							field359[field116] = var119;
							field163[field116] = var122;
							field305[field116] = var121;
							field116++;
							field320 = true;
						}

						boolean var124 = false;
						while (!var124) {
							var124 = true;
							for (int var125 = 0; var125 < field116 - 1; var125++) {
								if (field305[var125] != field333 && field305[var125 + 1] == field333 || field305[var125] == 0 && field305[var125 + 1] != 0) {
									int var126 = field305[var125];
									field305[var125] = field305[var125 + 1];
									field305[var125 + 1] = var126;
									String var127 = field163[var125];
									field163[var125] = field163[var125 + 1];
									field163[var125 + 1] = var127;
									long var128 = field359[var125];
									field359[var125] = field359[var125 + 1];
									field359[var125 + 1] = var128;
									field320 = true;
									var124 = false;
								}
							}
						}

						field309 = -1;
						return true;
					}

					if (field309 == 176) {
						field114 = field498.method552();
						if (field231 == field114) {
							if (field114 == 3) {
								field231 = 1;
							} else {
								field231 = 3;
							}

							field320 = true;
						}

						field309 = -1;
						return true;
					}

					if (field309 == 183) {
						field250 = field498.method553();
						field249 = field498.method534();
						field309 = -1;
						return true;
					}

					if (field309 == 140) {
						for (int var130 = 0; var130 < field206.length; var130++) {
							if (field206[var130] != null) {
								field206[var130].field1450 = -1;
							}
						}

						for (int var131 = 0; var131 < field322.length; var131++) {
							if (field322[var131] != null) {
								field322[var131].field1450 = -1;
							}
						}

						field309 = -1;
						return true;
					}

					if (field309 == 7) {
						field373 = field498.method534();
						if (field373 == 1) {
							field120 = field498.method536();
						}

						if (field373 >= 2 && field373 <= 6) {
							if (field373 == 2) {
								field451 = 64;
								field452 = 64;
							}

							if (field373 == 3) {
								field451 = 0;
								field452 = 64;
							}

							if (field373 == 4) {
								field451 = 128;
								field452 = 64;
							}

							if (field373 == 5) {
								field451 = 64;
								field452 = 0;
							}

							if (field373 == 6) {
								field451 = 64;
								field452 = 128;
							}

							field373 = 2;
							field448 = field498.method536();
							field449 = field498.method536();
							field450 = field498.method534();
						}

						if (field373 == 10) {
							field189 = field498.method536();
						}

						field309 = -1;
						return true;
					}

					if (field309 == 64) {
						int var132 = field498.method537();
						if (var132 >= 0) {
							method133(var132);
						}

						field171 = var132;
						field309 = -1;
						return true;
					}

					if (field309 == 165) {
						int var133 = field498.method534();
						int var134 = field498.method534();
						int var135 = field498.method534();
						int var136 = field498.method534();
						field272[var133] = true;
						field459[var133] = var134;
						field316[var133] = var135;
						field257[var133] = var136;
						field264[var133] = 0;
						field309 = -1;
						return true;
					}

					if (field309 == 250) {
						field473 = field498.method534();
						field366 = field498.method534();
						field162 = field498.method534();
						field155 = true;
						field447 = true;
						field309 = -1;
						return true;
					}

					if (field309 == 41) {
						field117 = field498.method534();
						field320 = true;
						field309 = -1;
						return true;
					}

					if (field309 == 157) {
						field243 = false;
						field218 = 1;
						field237 = "";
						field447 = true;
						field309 = -1;
						return true;
					}

					if (field309 == 108) {
						field243 = false;
						field218 = 2;
						field237 = "";
						field447 = true;
						field309 = -1;
						return true;
					}

					if (field309 == 116) {
						int var137 = field498.method561();
						int var138 = field498.method559();

						if (field229 != -1) {
							field229 = -1;
							field447 = true;
						}

						if (field218 != 0) {
							field218 = 0;
							field447 = true;
						}

						field253 = var138;
						field139 = var137;
						field320 = true;
						field517 = true;
						field356 = false;
						field309 = -1;
						return true;
					}

					if (field309 == 164) {
						int var139 = field498.method561();
						int var140 = field498.method560();
						int var141 = field498.method536();
						int var142 = field498.method560();
						RWLOYYVC.field1135[var139].field1122 = var140;
						RWLOYYVC.field1135[var139].field1123 = var141;
						RWLOYYVC.field1135[var139].field1121 = var142;
						field309 = -1;
						return true;
					}

					if (field309 == 56) {
						field249 = field498.method554();
						field250 = field498.method534();
						for (int var143 = field249; var143 < field249 + 8; var143++) {
							for (int var144 = field250; var144 < field250 + 8; var144++) {
								if (field112[field131][var143][var144] != null) {
									field112[field131][var143][var144] = null;
									method93(var143, var144);
								}
							}
						}

						for (OCRHTPRV var145 = (OCRHTPRV) field192.method201(); var145 != null; var145 = (OCRHTPRV) field192.method203()) {
							if (var145.field1001 >= field249 && var145.field1001 < field249 + 8 && var145.field1002 >= field250 && var145.field1002 < field250 + 8 && field131 == var145.field999) {
								var145.field998 = 0;
							}
						}

						field309 = -1;
						return true;
					}

					if (field309 == 195) {
						int var146 = field498.method536();
						RWLOYYVC.field1135[var146].field1146 = 3;

						if (field281.field1029 == null) {
							RWLOYYVC.field1135[var146].field1147 = (field281.field1033[11] << 5) + (field281.field1033[8] << 10) + (field281.field1033[0] << 15) + (field281.field1040[0] << 25) + (field281.field1040[4] << 20) + field281.field1033[1];
						} else {
							RWLOYYVC.field1135[var146].field1147 = (int) (field281.field1029.field936 + 0x12345678L);
						}

						field309 = -1;
						return true;
					}

					if (field309 == 216) {
						int var147 = field498.method561();
						int var148 = field498.method536();
						int var149 = field498.method561();
						RWLOYYVC.field1135[var149].field1101 = (var147 << 16) + var148;
						field309 = -1;
						return true;
					}

					if (field309 == 93) {
						int var150 = field498.method563();
						int var151 = field498.method536();
						RWLOYYVC var152 = RWLOYYVC.field1135[var151];
						var152.field1125 = var150;

						if (var150 == -1) {
							var152.field1152 = 0;
							var152.field1127 = 0;
						}

						field309 = -1;
						return true;
					}

					if (field309 == 118) {
						int var153 = field498.method561();
						if (var153 == 0xFFFF) {
							var153 = -1;
						}

						if (field511 != var153 && field167 && !field336 && field484 == 0) {
							field377 = var153;
							field378 = true;
							field329.method430(2, field377);
						}

						field511 = var153;
						field309 = -1;
						return true;
					}

					if (field309 == 175) {
						int var154 = field498.method560();
						int var155 = field498.method538();
						if (field167 && !field336) {
							field377 = var154;
							field378 = false;
							field329.method430(2, field377);
							field484 = var155;
						}

						field309 = -1;
						return true;
					}

					if (field309 == 30) {
						int var156 = field498.method559();
						int var157 = field498.method559();
						RWLOYYVC var158 = RWLOYYVC.field1135[var157];
						if (var158 != null && var158.field1156 == 0) {
							if (var156 < 0) {
								var156 = 0;
							}

							if (var156 > var158.field1138 - var158.field1133) {
								var156 = var158.field1138 - var158.field1133;
							}

							var158.field1113 = var156;
						}

						field309 = -1;
						return true;
					}

					if (field309 == 65) {
						field249 = field498.method534();
						field250 = field498.method553();

						while (field498.field1403 < field308) {
							int var159 = field498.method534();
							method152(var159, field498);
						}

						field309 = -1;
						return true;
					}

					if (field309 == 198) {
						method109();
						field309 = -1;
						return false;
					}

					if (field309 == 76) {
						int var160 = field498.method560();
						RWLOYYVC var161 = RWLOYYVC.field1135[var160];
						for (int var162 = 0; var162 < var161.field1153.length; var162++) {
							var161.field1153[var162] = -1;
							var161.field1153[var162] = 0;
						}

						field309 = -1;
						return true;
					}

					if (field309 == 196) {
						int var163 = field498.method536();
						int var164 = field498.method534();
						int var165 = field498.method536();
						if (field109 && !field336 && field492 < 50) {
							field360[field492] = var163;
							field485[field492] = var164;
							field505[field492] = IXJIDLUT.field747[var163] + var165;
							field492++;
						}

						field309 = -1;
						return true;
					}

					if (field309 == 208) {
						int var166 = field498.method559();
						method133(var166);

						if (field229 != -1) {
							field229 = -1;
							field447 = true;
						}

						if (field218 != 0) {
							field218 = 0;
							field447 = true;
						}

						field139 = var166;
						field320 = true;
						field517 = true;
						field253 = -1;
						field356 = false;
						field309 = -1;
						return true;
					}

					if (field309 == 13) {
						int var167 = field498.method537();
						int var168 = field498.method559();
						int var169 = field498.method562();
						RWLOYYVC var170 = RWLOYYVC.field1135[var168];
						var170.field1132 = var169;
						var170.field1130 = var167;
						field309 = -1;
						return true;
					}

					if (field309 == 55) {
						field115 = true;
						field434 = field498.method534();
						field435 = field498.method534();
						field436 = field498.method536();
						field437 = field498.method534();
						field438 = field498.method534();
						if (field438 >= 100) {
							field453 = field434 * 128 + 64;
							field455 = field435 * 128 + 64;
							field454 = method91(field455, field131, field453) - field436;
						}

						field309 = -1;
						return true;
					}

					if (field309 == 11) {
						int var171 = field498.method560();
						boolean var172 = field498.method552() == 1;
						RWLOYYVC.field1135[var171].field1099 = var172;
						field309 = -1;
						return true;
					}

					if (field309 == 62) {
						int var173 = field498.method561();
						int var174 = field498.method559();
						RWLOYYVC.field1135[var174].field1146 = 2;
						RWLOYYVC.field1135[var174].field1147 = var173;
						field309 = -1;
						return true;
					}

					if (field309 == 247) {
						int var175 = field498.method560();
						int var176 = field498.method561();
						RWLOYYVC.field1135[var175].field1146 = 1;
						RWLOYYVC.field1135[var175].field1147 = var176;
						field309 = -1;
						return true;
					}

					if (field309 == 142) {
						field115 = true;
						field147 = field498.method534();
						field148 = field498.method534();
						field149 = field498.method536();
						field150 = field498.method534();
						field151 = field498.method534();
						if (field151 >= 100) {
							int var177 = field147 * 128 + 64;
							int var178 = field148 * 128 + 64;
							int var179 = method91(var178, field131, var177) - field149;
							int var180 = var177 - field453;
							int var181 = var179 - field454;
							int var182 = var178 - field455;
							int var183 = (int) Math.sqrt(var180 * var180 + var182 * var182);
							field456 = (int) (Math.atan2(var181, var183) * 325.949D) & 0x7FF;
							field457 = (int) (Math.atan2(var180, var182) * -325.949D) & 0x7FF;

							if (field456 < 128) {
								field456 = 128;
							}

							if (field456 > 383) {
								field456 = 383;
							}
						}

						field309 = -1;
						return true;
					}

					if (field309 == 186) {
						field357 = field498.method561();
						field384 = field498.method567();
						field405 = field498.method552();
						field463 = field498.method553();
						field410 = field498.method561();

						if (field384 != 0 && field253 == -1) {
							signlink.dnslookup(UWUPOZSY.method489(field384));
							method63();
							short var184 = 650;
							if (field405 != 201 || field463 == 1) {
								var184 = 655;
							}

							field369 = "";
							field182 = false;

							for (int var185 = 0; var185 < RWLOYYVC.field1135.length; var185++) {
								if (RWLOYYVC.field1135[var185] != null && RWLOYYVC.field1135[var185].field1143 == var184) {
									field253 = RWLOYYVC.field1135[var185].field1124;
									break;
								}
							}
						}

						field309 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field309 + "," + field308 + " - " + field144 + "," + field145);
					method109();
					return true;
				}

				method152(field309, field498);
				field309 = -1;
				return true;
			}

			int var17 = field172;
			int var18 = field173;
			if (field309 == 211) {
				var17 = field498.method559();
				var18 = field498.method536();
				field318 = false;
			}

			if (field309 == 152) {
				var17 = field498.method559();
				field498.method544();

				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field498.method545(1);
							if (var22 == 1) {
								field142[var19][var20][var21] = field498.method545(26);
							} else {
								field142[var19][var20][var21] = -1;
							}
						}
					}
				}

				field498.method546();
				var18 = field498.method560();
				field318 = true;
			}

			if (field172 == var17 && field173 == var18 && field196 == 2) {
				field309 = -1;
				return true;
			}

			field172 = var17;
			field173 = var18;
			field197 = (field172 - 6) * 8;
			field198 = (field173 - 6) * 8;
			field138 = false;
			if ((field172 / 8 == 48 || field172 / 8 == 49) && field173 / 8 == 48) {
				field138 = true;
			}

			if (field172 / 8 == 48 && field173 / 8 == 148) {
				field138 = true;
			}

			field196 = 1;
			field349 = System.currentTimeMillis();
			field341.method588();
			field128.method466(151, "Loading - please wait.", 0, 257);
			field128.method466(150, "Loading - please wait.", 0xFFFFFF, 256);
			field341.method589(4, field1318, 4);

			if (field309 == 211) {
				int var23 = 0;
				for (int var24 = (field172 - 6) / 8; var24 <= (field172 + 6) / 8; var24++) {
					for (int var25 = (field173 - 6) / 8; var25 <= (field173 + 6) / 8; var25++) {
						var23++;
					}
				}

				field263 = new byte[var23][];
				field177 = new byte[var23][];
				field330 = new int[var23];
				field331 = new int[var23];
				field332 = new int[var23];
				int var26 = 0;
				for (int var27 = (field172 - 6) / 8; var27 <= (field172 + 6) / 8; var27++) {
					for (int var28 = (field173 - 6) / 8; var28 <= (field173 + 6) / 8; var28++) {
						field330[var26] = (var27 << 8) + var28;

						if (field138 && (var28 == 49 || var28 == 149 || var28 == 147 || var27 == 50 || var27 == 49 && var28 == 47)) {
							field331[var26] = -1;
							field332[var26] = -1;
							var26++;
						} else {
							int var29 = field331[var26] = field329.method438(0, var27, var28);
							if (var29 != -1) {
								field329.method430(3, var29);
							}

							int var30 = field332[var26] = field329.method438(1, var27, var28);
							if (var30 != -1) {
								field329.method430(3, var30);
							}

							var26++;
						}
					}
				}
			}

			if (field309 == 152) {
				int var31 = 0;
				int[] var32 = new int[676];
				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field142[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 14 & 0x3FF;
								int var38 = var36 >> 3 & 0x7FF;
								int var39 = (var37 / 8 << 8) + var38 / 8;
								for (int var40 = 0; var40 < var31; var40++) {
									if (var32[var40] == var39) {
										var39 = -1;
										break;
									}
								}

								if (var39 != -1) {
									var32[var31++] = var39;
								}
							}
						}
					}
				}

				field263 = new byte[var31][];
				field177 = new byte[var31][];
				field330 = new int[var31];
				field331 = new int[var31];
				field332 = new int[var31];
				for (int var41 = 0; var41 < var31; var41++) {
					int var42 = field330[var41] = var32[var41];
					int var43 = var42 >> 8 & 0xFF;
					int var44 = var42 & 0xFF;
					int var45 = field331[var41] = field329.method438(0, var43, var44);
					if (var45 != -1) {
						field329.method430(3, var45);
					}

					int var46 = field332[var41] = field329.method438(1, var43, var44);
					if (var46 != -1) {
						field329.method430(3, var46);
					}
				}
			}

			int var47 = field197 - field199;
			int var48 = field198 - field200;
			field199 = field197;
			field200 = field198;

			for (int var49 = 0; var49 < 16384; var49++) {
				FSNLAIJY var50 = field322[var49];
				if (var50 != null) {
					for (int var51 = 0; var51 < 10; var51++) {
						var50.field1448[var51] -= var47;
						var50.field1449[var51] -= var48;
					}

					var50.field1472 -= var47 * 128;
					var50.field1473 -= var48 * 128;
				}
			}

			for (int var52 = 0; var52 < field204; var52++) {
				OTTYZSZE var53 = field206[var52];
				if (var53 != null) {
					for (int var54 = 0; var54 < 10; var54++) {
						var53.field1448[var54] -= var47;
						var53.field1449[var54] -= var48;
					}

					var53.field1472 -= var47 * 128;
					var53.field1473 -= var48 * 128;
				}
			}

			field348 = true;
			byte var55 = 0;
			byte var56 = 104;
			byte var57 = 1;
			if (var47 < 0) {
				var55 = 103;
				var56 = -1;
				var57 = -1;
			}

			byte var58 = 0;
			byte var59 = 104;
			byte var60 = 1;
			if (var48 < 0) {
				var58 = 103;
				var59 = -1;
				var60 = -1;
			}

			for (int var61 = var55; var61 != var56; var61 += var57) {
				for (int var62 = var58; var62 != var59; var62 += var60) {
					int var63 = var47 + var61;
					int var64 = var48 + var62;
					for (int var65 = 0; var65 < 4; var65++) {
						if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
							field112[var65][var61][var62] = field112[var65][var63][var64];
						} else {
							field112[var65][var61][var62] = null;
						}
					}
				}
			}

			for (OCRHTPRV var66 = (OCRHTPRV) field192.method201(); var66 != null; var66 = (OCRHTPRV) field192.method203()) {
				var66.field1001 -= var47;
				var66.field1002 -= var48;
				if (var66.field1001 < 0 || var66.field1002 < 0 || var66.field1001 >= 104 || var66.field1002 >= 104) {
					var66.method396();
				}
			}

			if (field283 != 0) {
				field283 -= var47;
				field284 -= var48;
			}

			field115 = false;
			field309 = -1;
			return true;
		} catch (IOException var190) {
			method125();
		} catch (Exception var191) {
			String var187 = "T2 - " + field309 + "," + field144 + "," + field145 + " - " + field308 + "," + (field281.field1448[0] + field197) + "," + (field281.field1449[0] + field198) + " - ";
			for (int var188 = 0; var188 < field308 && var188 < 50; var188++) {
				var187 = var187 + field498.field1402[var188] + ",";
			}

			signlink.reporterror(var187);
			method109();
		}

		return true;
	}

	@ObfuscatedName("client.b(IILXJCNBMKS;)V")
	public final void method59(int arg0, XJCNBMKS arg1) {
		field439 = 0;
		field209 = 0;
		method30(arg0, arg1);
		method115(arg1, arg0);
		method122(arg1, arg0);
		method151(arg1, arg0);

		for (int var3 = 0; var3 < field439; var3++) {
			int var4 = field440[var3];
			if (field376 != field206[var4].field1434) {
				field206[var4] = null;
			}
		}

		if (arg1.field1403 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1403 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field207; var5++) {
			if (field206[field208[var5]] == null) {
				signlink.reporterror(field270 + " null entry in pl list - pos:" + var5 + " size:" + field207);
				throw new RuntimeException("eek");
			}
		}
	}

	public final void run() {
		if (field355) {
			method33();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method60(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IBLXJCNBMKS;)V")
	public final void method61(int arg0, XJCNBMKS arg1) {
		arg1.method544();
		int var3 = arg1.method545(8);
		if (var3 < field323) {
			for (int var4 = var3; var4 < field323; var4++) {
				field440[field439++] = field324[var4];
			}
		}

		if (var3 > field323) {
			signlink.reporterror(field270 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field323 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field324[var5];
			FSNLAIJY var7 = field322[var6];
			int var8 = arg1.method545(1);
			if (var8 == 0) {
				field324[field323++] = var6;
				var7.field1434 = field376;
			} else {
				int var9 = arg1.method545(2);
				if (var9 == 0) {
					field324[field323++] = var6;
					var7.field1434 = field376;
					field210[field209++] = var6;
				} else if (var9 == 1) {
					field324[field323++] = var6;
					var7.field1434 = field376;
					int var10 = arg1.method545(3);
					var7.method584(false, var10);
					int var11 = arg1.method545(1);
					if (var11 == 1) {
						field210[field209++] = var6;
					}
				} else if (var9 == 2) {
					field324[field323++] = var6;
					var7.field1434 = field376;
					int var12 = arg1.method545(3);
					var7.method584(true, var12);
					int var13 = arg1.method545(3);
					var7.method584(true, var13);
					int var14 = arg1.method545(1);
					if (var14 == 1) {
						field210[field209++] = var6;
					}
				} else if (var9 == 3) {
					field440[field439++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field520.method166(arg3, arg2);
		field521.method166(arg1 + arg3 - 16, arg2);
		HQRNTLRZ.method284(arg2, arg3 + 16, field367, 16, arg1 - 32);
		int var6 = (arg1 - 32) * arg1 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg0 / (arg4 - arg1);
		HQRNTLRZ.method284(arg2, arg3 + var7 + 16, field431, 16, var6);
		HQRNTLRZ.method289(arg2, field379, arg3 + var7 + 16, var6);
		HQRNTLRZ.method289(arg2 + 1, field379, arg3 + var7 + 16, var6);
		HQRNTLRZ.method287(field379, arg3 + var7 + 16, 16, arg2);
		HQRNTLRZ.method287(field379, arg3 + var7 + 17, 16, arg2);
		HQRNTLRZ.method289(arg2 + 15, field317, arg3 + var7 + 16, var6);
		HQRNTLRZ.method289(arg2 + 14, field317, arg3 + var7 + 17, var6 - 1);
		HQRNTLRZ.method287(field317, arg3 + var7 + var6 + 15, 16, arg2);
		HQRNTLRZ.method287(field317, arg3 + var7 + var6 + 14, 15, arg2 + 1);
	}

	@ObfuscatedName("client.k(I)V")
	public final void method63() {
		field400.method523(252);

		if (field139 != -1) {
			field139 = -1;
			field320 = true;
			field356 = false;
			field517 = true;
		}

		if (field229 != -1) {
			field229 = -1;
			field447 = true;
			field356 = false;
		}

		field253 = -1;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method64() {
		int var1 = field434 * 128 + 64;
		int var2 = field435 * 128 + 64;
		int var3 = method91(var2, field131, var1) - field436;

		if (field453 < var1) {
			field453 += (var1 - field453) * field438 / 1000 + field437;
			if (field453 > var1) {
				field453 = var1;
			}
		}

		if (field453 > var1) {
			field453 -= (field453 - var1) * field438 / 1000 + field437;
			if (field453 < var1) {
				field453 = var1;
			}
		}

		if (field454 < var3) {
			field454 += (var3 - field454) * field438 / 1000 + field437;
			if (field454 > var3) {
				field454 = var3;
			}
		}

		if (field454 > var3) {
			field454 -= (field454 - var3) * field438 / 1000 + field437;
			if (field454 < var3) {
				field454 = var3;
			}
		}

		if (field455 < var2) {
			field455 += (var2 - field455) * field438 / 1000 + field437;
			if (field455 > var2) {
				field455 = var2;
			}
		}

		if (field455 > var2) {
			field455 -= (field455 - var2) * field438 / 1000 + field437;
			if (field455 < var2) {
				field455 = var2;
			}
		}

		int var4 = field147 * 128 + 64;
		int var5 = field148 * 128 + 64;
		int var6 = method91(var5, field131, var4) - field149;
		int var7 = var4 - field453;
		int var8 = var6 - field454;
		int var9 = var5 - field455;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field456 < var11) {
			field456 += (var11 - field456) * field151 / 1000 + field150;
			if (field456 > var11) {
				field456 = var11;
			}
		}

		if (field456 > var11) {
			field456 -= (field456 - var11) * field151 / 1000 + field150;
			if (field456 < var11) {
				field456 = var11;
			}
		}

		int var13 = var12 - field457;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field457 += field151 * var13 / 1000 + field150;
			field457 &= 0x7FF;
		}

		if (var13 < 0) {
			field457 -= -var13 * field151 / 1000 + field150;
			field457 &= 0x7FF;
		}

		int var14 = var12 - field457;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field457 = var12;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method65() {
		field156 = 0;
		int var1 = (field281.field1472 >> 7) + field197;
		int var2 = (field281.field1473 >> 7) + field198;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field156 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field156 = 1;
		}

		if (field156 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field156 = 0;
		}
	}

	@ObfuscatedName("client.a(BLYHEHTOVP;I)V")
	public final void method66(YHEHTOVP arg0, int arg1) {
		method67(arg0.field1472, arg1, arg0.field1473);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method67(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method91(arg2, field131, arg0) - arg1;
			arg0 -= field453;
			var4 -= field454;
			arg2 -= field455;
			int var5 = FUTAQMCE.field701[field456];
			int var6 = FUTAQMCE.field702[field456];
			int var7 = FUTAQMCE.field701[field457];
			int var8 = FUTAQMCE.field702[field457];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field314 = (var9 << 9) / arg2 + DQOLNIHT.field563;
				field315 = (var11 << 9) / arg2 + DQOLNIHT.field564;
			} else {
				field314 = -1;
				field315 = -1;
			}
		} else {
			field314 = -1;
			field315 = -1;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method68(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field116; var2++) {
			if (arg0.equalsIgnoreCase(field163[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field281.field1038)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(I)V")
	public final void method69() {
		signlink.reporterror = false;

		try {
			if (field190 != null) {
				field190.method192();
			}
		} catch (Exception var1) {
		}

		field190 = null;
		method96();

		if (field265 != null) {
			field265.field771 = false;
		}

		field265 = null;
		field329.method442();
		field329 = null;
		field321 = null;
		field400 = null;
		field500 = null;
		field498 = null;
		field330 = null;
		field263 = null;
		field177 = null;
		field331 = null;
		field332 = null;
		field313 = null;
		field462 = null;
		field203 = null;
		field126 = null;
		field125 = null;
		field269 = null;
		field361 = null;
		field362 = null;
		field242 = null;
		field339 = null;
		field340 = null;
		field341 = null;
		field342 = null;
		field164 = null;
		field165 = null;
		field166 = null;
		field474 = null;
		field475 = null;
		field476 = null;
		field477 = null;
		field478 = null;
		field479 = null;
		field480 = null;
		field481 = null;
		field482 = null;
		field514 = null;
		field515 = null;
		field516 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field470 = null;
		field213 = null;
		field214 = null;
		field215 = null;
		field216 = null;
		field217 = null;
		field506 = null;
		field507 = null;
		field508 = null;
		field509 = null;
		field510 = null;
		field266 = null;
		field183 = null;
		field401 = null;
		field319 = null;
		field244 = null;
		field245 = null;
		field246 = null;
		field247 = null;
		field248 = null;
		field519 = null;
		field526 = null;
		field161 = null;
		field206 = null;
		field208 = null;
		field210 = null;
		field211 = null;
		field440 = null;
		field322 = null;
		field324 = null;
		field112 = null;
		field192 = null;
		field409 = null;
		field372 = null;
		field258 = null;
		field259 = null;
		field260 = null;
		field261 = null;
		field119 = null;
		field524 = null;
		field279 = null;
		field280 = null;
		field255 = null;
		field285 = null;
		field163 = null;
		field359 = null;
		field305 = null;
		field299 = null;
		field300 = null;
		field296 = null;
		field297 = null;
		field298 = null;
		field301 = null;
		field302 = null;
		field303 = null;
		field304 = null;
		method55();
		SIUJJQHQ.method452();
		NHTDEVDA.method363();
		AOLTHQTO.method12();
		MQVXAZFZ.field911 = null;
		OQTGDMNX.field1016 = null;
		RWLOYYVC.field1135 = null;
		AHKPYPQH.field21 = null;
		GMRGYXFL.field720 = null;
		VSBOWDVL.field1380 = null;
		VSBOWDVL.field1392 = null;
		NYAYDXBO.field984 = null;
		field1319 = null;
		OTTYZSZE.field1037 = null;
		DQOLNIHT.method170();
		KALHRUDX.method305();
		FUTAQMCE.method246();
		RYVJCVCB.method426();
		System.gc();
	}

	@ObfuscatedName("client.k(B)V")
	public final void method70() {
		field306 = new DEITBGVL(field441, "titlebox", 0);
		field307 = new DEITBGVL(field441, "titlebutton", 0);
		field422 = new DEITBGVL[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field422[var2] = new DEITBGVL(field441, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field422[var3] = new DEITBGVL(field441, "runes", (var3 & 0x3) + 12);
			}
		}

		field132 = new YGMSKJOQ(128, 265);
		field133 = new YGMSKJOQ(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field132.field1415[var4] = field299.field1477[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field133.field1415[var5] = field300.field1477[var5];
		}

		field224 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field224[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field224[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field224[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field224[var9 + 192] = 0xFFFFFF;
		}

		field225 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field225[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field225[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field225[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field225[var13 + 192] = 0xFFFFFF;
		}

		field226 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field226[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field226[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field226[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field226[var17 + 192] = 0xFFFFFF;
		}

		field223 = new int[256];
		field235 = new int[32768];
		field236 = new int[32768];
		method153(null);
		field370 = new int[32768];
		field371 = new int[32768];
		method107(10, "Connecting to fileserver");

		if (!field328) {
			field355 = true;
			field328 = true;
			method106(this, 2);
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field203.method332(arg1, arg4, arg0);
		if (var6 != 0) {
			int var7 = field203.method336(arg1, arg4, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field285.field1415;
			int var12 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			SIUJJQHQ var14 = SIUJJQHQ.method455(var13);
			if (var14.field1266 == -1) {
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
				DEITBGVL var15 = field519[var14.field1266];
				if (var15 != null) {
					int var16 = (var14.field1265 * 4 - var15.field543) / 2;
					int var17 = (var14.field1256 * 4 - var15.field544) / 2;
					var15.method166((104 - arg0 - var14.field1256) * 4 + var17 + 48, arg4 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field203.method334(arg1, arg4, arg0);
		if (var18 != 0) {
			int var19 = field203.method336(arg1, arg4, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			SIUJJQHQ var23 = SIUJJQHQ.method455(var22);
			if (var23.field1266 != -1) {
				DEITBGVL var24 = field519[var23.field1266];
				if (var24 != null) {
					int var25 = (var23.field1265 * 4 - var24.field543) / 2;
					int var26 = (var23.field1256 * 4 - var24.field544) / 2;
					var24.method166((104 - arg0 - var23.field1256) * 4 + var26 + 48, arg4 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field285.field1415;
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

		int var30 = field203.method335(arg1, arg4, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			SIUJJQHQ var32 = SIUJJQHQ.method455(var31);
			if (var32.field1266 != -1) {
				DEITBGVL var33 = field519[var32.field1266];
				if (var33 != null) {
					int var34 = (var32.field1265 * 4 - var33.field543) / 2;
					int var35 = (var32.field1256 * 4 - var33.field544) / 2;
					var33.method166((104 - arg0 - var32.field1256) * 4 + var35 + 48, arg4 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method72() {
		if (field1332 == 1) {
			if (field1333 >= 539 && field1333 <= 573 && field1334 >= 169 && field1334 < 205 && field137[0] != -1) {
				field320 = true;
				field231 = 0;
				field517 = true;
			}

			if (field1333 >= 569 && field1333 <= 599 && field1334 >= 168 && field1334 < 205 && field137[1] != -1) {
				field320 = true;
				field231 = 1;
				field517 = true;
			}

			if (field1333 >= 597 && field1333 <= 627 && field1334 >= 168 && field1334 < 205 && field137[2] != -1) {
				field320 = true;
				field231 = 2;
				field517 = true;
			}

			if (field1333 >= 625 && field1333 <= 669 && field1334 >= 168 && field1334 < 203 && field137[3] != -1) {
				field320 = true;
				field231 = 3;
				field517 = true;
			}

			if (field1333 >= 666 && field1333 <= 696 && field1334 >= 168 && field1334 < 205 && field137[4] != -1) {
				field320 = true;
				field231 = 4;
				field517 = true;
			}

			if (field1333 >= 694 && field1333 <= 724 && field1334 >= 168 && field1334 < 205 && field137[5] != -1) {
				field320 = true;
				field231 = 5;
				field517 = true;
			}

			if (field1333 >= 722 && field1333 <= 756 && field1334 >= 169 && field1334 < 205 && field137[6] != -1) {
				field320 = true;
				field231 = 6;
				field517 = true;
			}

			if (field1333 >= 540 && field1333 <= 574 && field1334 >= 466 && field1334 < 502 && field137[7] != -1) {
				field320 = true;
				field231 = 7;
				field517 = true;
			}

			if (field1333 >= 572 && field1333 <= 602 && field1334 >= 466 && field1334 < 503 && field137[8] != -1) {
				field320 = true;
				field231 = 8;
				field517 = true;
			}

			if (field1333 >= 599 && field1333 <= 629 && field1334 >= 466 && field1334 < 503 && field137[9] != -1) {
				field320 = true;
				field231 = 9;
				field517 = true;
			}

			if (field1333 >= 627 && field1333 <= 671 && field1334 >= 467 && field1334 < 502 && field137[10] != -1) {
				field320 = true;
				field231 = 10;
				field517 = true;
			}

			if (field1333 >= 669 && field1333 <= 699 && field1334 >= 466 && field1334 < 503 && field137[11] != -1) {
				field320 = true;
				field231 = 11;
				field517 = true;
			}

			if (field1333 >= 696 && field1333 <= 726 && field1334 >= 466 && field1334 < 503 && field137[12] != -1) {
				field320 = true;
				field231 = 12;
				field517 = true;
			}

			if (field1333 >= 724 && field1333 <= 758 && field1334 >= 466 && field1334 < 502 && field137[13] != -1) {
				field320 = true;
				field231 = 13;
				field517 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method73() {
		if (!field286 && !field251 && !field364) {
			field376++;

			if (field404) {
				method97();
			} else {
				method92();
			}

			method156();
		}
	}

	@ObfuscatedName("client.a(ZLRWLOYYVC;)Z")
	public final boolean method74(RWLOYYVC arg0) {
		int var2 = arg0.field1143;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field119[field111] = "Remove @whi@" + arg0.field1117;
				field260[field111] = 355;
				field111++;
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

		field119[field111] = "Remove @whi@" + field163[var2];
		field260[field111] = 163;
		field111++;
		field119[field111] = "Message @whi@" + field163[var2];
		field260[field111] = 643;
		field111++;
		return true;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method75() {
		if (field1332 == 1) {
			if (field1333 >= 6 && field1333 <= 106 && field1334 >= 467 && field1334 <= 499) {
				field473 = (field473 + 1) % 4;
				field155 = true;
				field447 = true;
				field400.method523(36);
				field400.method524(field473);
				field400.method524(field366);
				field400.method524(field162);
			}

			if (field1333 >= 135 && field1333 <= 235 && field1334 >= 467 && field1334 <= 499) {
				field366 = (field366 + 1) % 3;
				field155 = true;
				field447 = true;
				field400.method523(36);
				field400.method524(field473);
				field400.method524(field366);
				field400.method524(field162);
			}

			if (field1333 >= 273 && field1333 <= 373 && field1334 >= 467 && field1334 <= 499) {
				field162 = (field162 + 1) % 3;
				field155 = true;
				field447 = true;
				field400.method523(36);
				field400.method524(field473);
				field400.method524(field366);
				field400.method524(field162);
			}

			if (field1333 >= 412 && field1333 <= 512 && field1334 >= 467 && field1334 <= 499) {
				if (field253 == -1) {
					method63();
					field369 = "";
					field182 = false;

					for (int var1 = 0; var1 < RWLOYYVC.field1135.length; var1++) {
						if (RWLOYYVC.field1135[var1] != null && RWLOYYVC.field1135[var1].field1143 == 600) {
							field180 = field253 = RWLOYYVC.field1135[var1].field1124;
							return;
						}
					}

					return;
				}

				method26("Please close the interface you have open before using 'report abuse'", "", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method76() {
		if (field458 != 0) {
			UMCYZJWP var1 = field128;
			int var2 = 0;
			if (field346 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field221[var3] != null) {
					int var4 = field219[var3];
					String var5 = field220[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field366 == 0 || field366 == 1 && method68(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method470(var8, "From", 0, var7);
						var1.method470(var8, "From", 0xFFFF, var7 - 1);
						int var11 = var8 + var1.method468("From ");
						if (var6 == 1) {
							field193[0].method166(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field193[1].method166(var7 - 12, var11);
							var11 += 14;
						}

						var1.method470(var11, var5 + ": " + field221[var3], 0, var7);
						var1.method470(var11, var5 + ": " + field221[var3], 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field366 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method470(4, field221[var3], 0, var9);
						var1.method470(4, field221[var3], 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field366 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method470(4, "To " + var5 + ": " + field221[var3], 0, var10);
						var1.method470(4, "To " + var5 + ": " + field221[var3], 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZLRWLOYYVC;)I")
	public final int method77(int arg0, RWLOYYVC arg1) {
		if (arg1.field1154 == null || arg0 >= arg1.field1154.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1154[arg0];
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
					var8 = field179[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field430[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field345[var3[var5++]];
				}

				if (var7 == 4) {
					RWLOYYVC var10 = RWLOYYVC.field1135[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < AOLTHQTO.field44 && (!AOLTHQTO.method13(var11).field64 || field335)) {
						for (int var12 = 0; var12 < var10.field1153.length; var12++) {
							if (var11 + 1 == var10.field1153[var12]) {
								var8 += var10.field1115[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field524[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field121[field430[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field524[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field281.field1030;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < MXXUKHFT.field923; var13++) {
						if (MXXUKHFT.field925[var13]) {
							var8 += field430[var13];
						}
					}
				}

				if (var7 == 10) {
					RWLOYYVC var14 = RWLOYYVC.field1135[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < AOLTHQTO.field44 && (!AOLTHQTO.method13(var15).field64 || field335)) {
						for (int var16 = 0; var16 < var14.field1153.length; var16++) {
							if (var14.field1153[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field113;
				}

				if (var7 == 12) {
					var8 = field153;
				}

				if (var7 == 13) {
					int var17 = field524[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					VSLUEINI var20 = VSLUEINI.field1394[var19];
					int var21 = var20.field1396;
					int var22 = var20.field1397;
					int var23 = var20.field1398;
					int var24 = field232[var23 - var22];
					var8 = field524[var21] >> var22 & var24;
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
					var8 = (field281.field1472 >> 7) + field197;
				}

				if (var7 == 19) {
					var8 = (field281.field1473 >> 7) + field198;
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

	@ObfuscatedName("client.k(Z)V")
	public final void method78() {
		try {
			int var1 = field281.field1472 + field385;
			int var2 = field281.field1473 + field381;
			if (field238 - var1 < -500 || field238 - var1 > 500 || field239 - var2 < -500 || field239 - var2 > 500) {
				field238 = var1;
				field239 = var2;
			}

			if (field238 != var1) {
				field238 += (var1 - field238) / 16;
			}

			if (field239 != var2) {
				field239 += (var2 - field239) / 16;
			}

			if (field1336[1] == 1) {
				field187 += (-field187 - 24) / 2;
			} else if (field1336[2] == 1) {
				field187 += (24 - field187) / 2;
			} else {
				field187 /= 2;
			}

			if (field1336[3] == 1) {
				field188 += (12 - field188) / 2;
			} else if (field1336[4] == 1) {
				field188 += (-field188 - 12) / 2;
			} else {
				field188 /= 2;
			}

			field186 = field187 / 2 + field186 & 0x7FF;
			field185 += field188 / 2;
			if (field185 < 128) {
				field185 = 128;
			}

			if (field185 > 383) {
				field185 = 383;
			}

			field123++;
			if (field123 > 190) {
				field123 = 0;
				field400.method523(131);
				field400.method527(0xBAB41F);
			}

			int var3 = field238 >> 7;
			int var4 = field239 >> 7;
			int var5 = method91(field239, field131, field238);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field131;
						if (var9 < 3 && (field462[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field313[var9][var7][var8];
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

			if (var11 > field398) {
				field398 += (var11 - field398) / 24;
			} else if (var11 < field398) {
				field398 += (var11 - field398) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field281.field1472 + "," + field281.field1473 + "," + field238 + "," + field239 + "," + field172 + "," + field173 + "," + field197 + "," + field198);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method79() {
		method76();

		if (field532 == 1) {
			field319[field531 / 100].method576(field530 - 8 - 4, field529 - 8 - 4);
			field140++;
			if (field140 > 73) {
				field140 = 0;
				field400.method523(83);
			}
		}

		if (field532 == 2) {
			field319[field531 / 100 + 4].method576(field530 - 8 - 4, field529 - 8 - 4);
			field483++;
			if (field483 > 102) {
				field483 = 0;
				field400.method523(148);
				field400.method524(197);
			}
		}

		if (field171 != -1) {
			method57(field171, field274);
			method158(RWLOYYVC.field1135[field171], 0, 0, 0);
		}

		if (field253 != -1) {
			method57(field253, field274);
			method158(RWLOYYVC.field1135[field253], 0, 0, 0);
		}

		method65();

		if (!field287) {
			method132();
			method81();
		} else if (field411 == 0) {
			method126();
		}

		if (field327 == 1) {
			field401[1].method576(296, 472);
		}

		if (field403) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1314 < 15) {
				var3 = 0xFF0000;
			}

			field128.method465(var1, var3, var2, "Fps:" + field1314);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field336) {
				int var7 = 0xFF0000;
			}

			field128.method465(var1, 0xFFFF00, var2, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field346 != 0) {
			int var8 = field346 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field128.method470(4, "System update in: " + var9 + ":0" + var8, 0xFFFF00, 329);
			} else {
				field128.method470(4, "System update in: " + var9 + ":" + var8, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg2 >= 1 && arg5 <= 102 && arg2 <= 102) {
			if (field336 && field131 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field203.method332(arg1, arg5, arg2);
			}

			if (arg6 == 1) {
				var8 = field203.method333(arg2, arg5, arg1);
			}

			if (arg6 == 2) {
				var8 = field203.method334(arg1, arg5, arg2);
			}

			if (arg6 == 3) {
				var8 = field203.method335(arg1, arg5, arg2);
			}

			if (var8 != 0) {
				int var12 = field203.method336(arg1, arg5, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field203.method323(arg5, arg1, arg2);
					SIUJJQHQ var16 = SIUJJQHQ.method455(var13);
					if (var16.field1295) {
						field126[arg1].method376(arg2, var16.field1261, var14, arg5, var15);
					}
				}

				if (arg6 == 1) {
					field203.method324(arg2, arg5, arg1);
				}

				if (arg6 == 2) {
					field203.method325(arg2, arg5, arg1);
					SIUJJQHQ var17 = SIUJJQHQ.method455(var13);
					if (var17.field1265 + arg5 > 103 || var17.field1265 + arg2 > 103 || var17.field1256 + arg5 > 103 || var17.field1256 + arg2 > 103) {
						return;
					}

					if (var17.field1295) {
						field126[arg1].method377(var17.field1261, arg5, var17.field1265, var17.field1256, var15, arg2);
					}
				}

				if (arg6 == 3) {
					field203.method326(arg5, arg1, arg2);
					SIUJJQHQ var18 = SIUJJQHQ.method455(var13);
					if (var18.field1295 && var18.field1263) {
						field126[arg1].method379(arg5, arg2);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field462[1][arg5][arg2] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				UZSUQFDN.method510(arg2, arg1, arg3, arg5, field203, field126[arg1], var19, arg4, field313, arg0);
				return;
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method81() {
		if (field111 >= 2 || field350 != 0 || field465 != 0) {
			String var1;
			if (field350 == 1 && field111 < 2) {
				var1 = "Use " + field354 + " with...";
			} else if (field465 == 1 && field111 < 2) {
				var1 = field468 + "...";
			} else {
				var1 = field119[field111 - 1];
			}

			if (field111 > 2) {
				var1 = var1 + "@whi@ / " + (field111 - 2) + " more options";
			}

			field129.method475(var1, 0xFFFFFF, true, 4, field376 / 1000, 15);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIZIIII)Z")
	public final boolean method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field125[var14][var15] = 0;
				field269[var14][var15] = 99999999;
			}
		}

		int var16 = arg4;
		int var17 = arg7;
		field125[arg4][arg7] = 99;
		field269[arg4][arg7] = 0;
		byte var18 = 0;
		int var19 = 0;
		field361[var18] = arg4;
		int var35 = var18 + 1;
		field362[var18] = arg7;
		boolean var20 = false;
		int var21 = field361.length;
		int[][] var22 = field126[field131].field1014;
		while (var35 != var19) {
			var16 = field361[var19];
			var17 = field362[var19];
			var19 = (var19 + 1) % var21;

			if (arg5 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field126[field131].method380(var16, arg10 - 1, arg5, var17, arg9, arg8)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field126[field131].method381(arg9, arg10 - 1, arg8, var16, var17, arg5)) {
					var20 = true;
					break;
				}
			}

			if (arg0 != 0 && arg1 != 0 && field126[field131].method382(arg0, arg8, var17, arg3, arg1, var16, arg5)) {
				var20 = true;
				break;
			}

			int var23 = field269[var16][var17] + 1;
			if (var16 > 0 && field125[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field361[var35] = var16 - 1;
				field362[var35] = var17;
				var35 = (var35 + 1) % var21;
				field125[var16 - 1][var17] = 2;
				field269[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field125[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field361[var35] = var16 + 1;
				field362[var35] = var17;
				var35 = (var35 + 1) % var21;
				field125[var16 + 1][var17] = 8;
				field269[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field125[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field361[var35] = var16;
				field362[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field125[var16][var17 - 1] = 1;
				field269[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field125[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field361[var35] = var16;
				field362[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field125[var16][var17 + 1] = 4;
				field269[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field125[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field361[var35] = var16 - 1;
				field362[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field125[var16 - 1][var17 - 1] = 3;
				field269[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field125[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field361[var35] = var16 + 1;
				field362[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field125[var16 + 1][var17 - 1] = 9;
				field269[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field125[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field361[var35] = var16 - 1;
				field362[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field125[var16 - 1][var17 + 1] = 6;
				field269[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field125[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field361[var35] = var16 + 1;
				field362[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field125[var16 + 1][var17 + 1] = 12;
				field269[var16 + 1][var17 + 1] = var23;
			}
		}

		field154 = 0;
		if (!var20) {
			if (arg6) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg5 - var25; var26 <= arg5 + var25; var26++) {
						for (int var27 = arg8 - var25; var27 <= arg8 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field269[var26][var27] < var24) {
								var24 = field269[var26][var27];
								var16 = var26;
								var17 = var27;
								field154 = 1;
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
		field361[var28] = var16;
		int var36 = var28 + 1;
		field362[var28] = var17;
		int var29;
		int var30 = var29 = field125[var16][var17];
		while (arg4 != var16 || arg7 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field361[var36] = var16;
				field362[var36++] = var17;
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

			var30 = field125[var16][var17];
		}

		if (var36 <= 0) {
			if (arg2 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field361[var36];
		int var33 = field362[var36];
		field252++;
		if (field252 >= 127) {
			field400.method523(142);
			field400.method527(84528);
			field252 = 0;
		}

		if (arg2 == 0) {
			field400.method523(249);
			field400.method524(var31 + var31 + 3);
		}

		if (arg2 == 1) {
			field400.method523(147);
			field400.method524(var31 + var31 + 3 + 14);
		}

		if (arg2 == 2) {
			field400.method523(162);
			field400.method524(var31 + var31 + 3);
		}

		field400.method550(field1336[5] == 1 ? 1 : 0);
		field400.method525(field198 + var33);
		field400.method556(field197 + var32);
		field283 = field361[0];
		field284 = field362[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field400.method551(field361[var36] - var32);
			field400.method550(field362[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;IILjava/lang/String;I)LQKFGLETG;")
	public final QKFGLETG method83(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field443[0] != null) {
				var6 = field443[0].method392(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field184.reset();
			field184.update(var6);
			int var8 = (int) field184.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new QKFGLETG(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method107(arg2, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method137(arg0 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				XJCNBMKS var16 = new XJCNBMKS(var15);
				var16.field1403 = 3;
				int var17 = var16.method538() + 6;
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
						method107(arg2, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field443[0] != null) {
						field443[0].method393(var6, var6.length, arg1);
					}
				} catch (Exception var28) {
					field443[0] = null;
				}

				if (var6 != null) {
					field184.reset();
					field184.update(var6);
					int var23 = (int) field184.getValue();
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
						method107(arg2, "Game updated - please reload page");
						var25 = 10;
					} else {
						method107(arg2, var11 + " - Retrying in " + var25);
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

				field402 = !field402;
			}
		}

		return new QKFGLETG(var6);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method84(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field444 = "";
				field445 = "Connecting to server...";
				method154(true);
			}

			field190 = new EUCYOSVT(method85(field334 + 43594), this);
			long var4 = UWUPOZSY.method486(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field400.field1403 = 0;
			field400.method524(14);
			field400.method524(var6);
			field190.method196(2, 0, field400.field1402);

			for (int var7 = 0; var7 < 8; var7++) {
				field190.method193();
			}

			int var8 = field190.method193();
			int var9 = var8;

			if (var8 == 0) {
				field190.method195(field498.field1402, 0, 8);
				field498.field1403 = 0;
				field504 = field498.method540();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field504 >> 32), (int) field504 };
				field400.field1403 = 0;
				field400.method524(10);
				field400.method528(var10[0]);
				field400.method528(var10[1]);
				field400.method528(var10[2]);
				field400.method528(var10[3]);
				field400.method528(signlink.uid);
				field400.method531(arg0);
				field400.method531(arg1);
				field400.method549(field408, field181);
				field500.field1403 = 0;

				if (arg2) {
					field500.method524(18);
				} else {
					field500.method524(16);
				}

				field500.method524(field400.field1403 + 36 + 1 + 1 + 2);
				field500.method524(255);
				field500.method525(321);
				field500.method524(field336 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field500.method528(field212[var11]);
				}

				field500.method532(field400.field1402, field400.field1403, 0);
				field400.field1407 = new ADZBQDSQ(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field202 = new ADZBQDSQ(var10);
				field190.method196(field500.field1403, 0, field500.field1402);
				var8 = field190.method193();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method84(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field423 = field190.method193();
				field227 = field190.method193() == 1;
				field461 = 0L;
				field424 = 0;
				field265.field774 = 0;
				field1323 = true;
				field201 = true;
				field404 = true;
				field400.field1403 = 0;
				field498.field1403 = 0;
				field309 = -1;
				field143 = -1;
				field144 = -1;
				field145 = -1;
				field308 = 0;
				field310 = 0;
				field346 = 0;
				field312 = 0;
				field373 = 0;
				field111 = 0;
				field287 = false;
				field1324 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field221[var13] = null;
				}

				field350 = 0;
				field465 = 0;
				field196 = 0;
				field492 = 0;
				field385 = (int) (Math.random() * 100.0D) - 50;
				field381 = (int) (Math.random() * 110.0D) - 55;
				field487 = (int) (Math.random() * 80.0D) - 40;
				field134 = (int) (Math.random() * 120.0D) - 60;
				field294 = (int) (Math.random() * 30.0D) - 20;
				field186 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field442 = 0;
				field472 = -1;
				field283 = 0;
				field284 = 0;
				field207 = 0;
				field323 = 0;

				for (int var14 = 0; var14 < field204; var14++) {
					field206[var14] = null;
					field211[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field322[var15] = null;
				}

				field281 = field206[field205] = new OTTYZSZE();
				field409.method205();
				field372.method205();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field112[var16][var17][var18] = null;
						}
					}
				}

				field192 = new EWLVMFRK();
				field117 = 0;
				field116 = 0;
				field494 = -1;
				field229 = -1;
				field253 = -1;
				field139 = -1;
				field171 = -1;
				field356 = false;
				field231 = 3;
				field218 = 0;
				field287 = false;
				field243 = false;
				field525 = null;
				field327 = 0;
				field114 = -1;
				field141 = true;
				method52();

				for (int var19 = 0; var19 < 5; var19++) {
					field433[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field527[var20] = null;
					field528[var20] = false;
				}

				field282 = 0;
				field469 = 0;
				field252 = 0;
				field194 = 0;
				field136 = 0;
				field146 = 0;
				field338 = 0;
				method23();
			} else if (var8 == 3) {
				field444 = "";
				field445 = "Invalid username or password.";
			} else if (var8 == 4) {
				field444 = "Your account has been disabled.";
				field445 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field444 = "Your account is already logged in.";
				field445 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field444 = "RuneScape has been updated!";
				field445 = "Please reload this page.";
			} else if (var8 == 7) {
				field444 = "This world is full.";
				field445 = "Please use a different world.";
			} else if (var8 == 8) {
				field444 = "Unable to connect.";
				field445 = "Login server offline.";
			} else if (var8 == 9) {
				field444 = "Login limit exceeded.";
				field445 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field444 = "Unable to connect.";
				field445 = "Bad session id.";
			} else if (var8 == 11) {
				field445 = "Login server rejected session.";
				field445 = "Please try again.";
			} else if (var8 == 12) {
				field444 = "You need a members account to login to this world.";
				field445 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field444 = "Could not complete login.";
				field445 = "Please try using a different world.";
			} else if (var8 == 14) {
				field444 = "The server is being updated.";
				field445 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field404 = true;
				field400.field1403 = 0;
				field498.field1403 = 0;
				field309 = -1;
				field143 = -1;
				field144 = -1;
				field145 = -1;
				field308 = 0;
				field310 = 0;
				field346 = 0;
				field111 = 0;
				field287 = false;
				field349 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field444 = "Login attempts exceeded.";
				field445 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field444 = "You are standing in a members-only area.";
				field445 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field444 = "Invalid loginserver requested";
				field445 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field190.method193();
				for (var21 += 3; var21 >= 0; var21--) {
					field444 = "You have only just left another world";
					field445 = "Your profile will be transferred in: " + var21;
					method154(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method84(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field444 = "Unexpected server response";
				field445 = "Please try using a different world.";
			} else if (var9 != 0) {
				field444 = "No response from server";
				field445 = "Please try using a different world.";
			} else if (field368 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field368++;
				method84(arg0, arg1, arg2);
			} else {
				field444 = "No response from loginserver";
				field445 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field444 = "";
			field445 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.q(I)Ljava/net/Socket;")
	public final Socket method85(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.l(Z)V")
	public static final void method86() {
		KALHRUDX.field800 = false;
		DQOLNIHT.field558 = false;
		field336 = false;
		UZSUQFDN.field1359 = false;
		SIUJJQHQ.field1274 = false;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method87() {
		for (OCRHTPRV var1 = (OCRHTPRV) field192.method201(); var1 != null; var1 = (OCRHTPRV) field192.method203()) {
			if (var1.field998 == -1) {
				var1.field1006 = 0;
				method95(var1);
			} else {
				var1.method396();
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method88() {
		while (true) {
			int var1 = method485();
			if (var1 == -1) {
				return;
			}

			if (field253 != -1 && field253 == field180) {
				if (var1 == 8 && field369.length() > 0) {
					field369 = field369.substring(0, field369.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field369.length() < 12) {
					field369 = field369 + (char) var1;
				}
			} else if (field243) {
				if (var1 >= 32 && var1 <= 122 && field365.length() < 80) {
					field365 = field365 + (char) var1;
					field447 = true;
				}

				if (var1 == 8 && field365.length() > 0) {
					field365 = field365.substring(0, field365.length() - 1);
					field447 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field243 = false;
					field447 = true;

					if (field380 == 1) {
						long var2 = UWUPOZSY.method486(field365);
						method124(var2);
					}

					if (field380 == 2 && field116 > 0) {
						long var4 = UWUPOZSY.method486(field365);
						method54(var4);
					}

					if (field380 == 3 && field365.length() > 0) {
						field400.method523(192);
						field400.method524(0);
						int var6 = field400.field1403;
						field400.method530(field288);
						PBQQFQEC.method398(field400, field365);
						field400.method533(field400.field1403 - var6);
						field365 = PBQQFQEC.method399(field365);
						field365 = EZWZJZNN.method216(field365);
						method26(field365, UWUPOZSY.method490(UWUPOZSY.method487(field288)), 6);

						if (field366 == 2) {
							field366 = 1;
							field155 = true;
							field400.method523(36);
							field400.method524(field473);
							field400.method524(field366);
							field400.method524(field162);
						}
					}

					if (field380 == 4 && field383 < 100) {
						long var7 = UWUPOZSY.method486(field365);
						method37(var7);
					}

					if (field380 == 5 && field383 > 0) {
						long var9 = UWUPOZSY.method486(field365);
						method53(var9);
					}
				}
			} else if (field218 == 1) {
				if (var1 >= 48 && var1 <= 57 && field237.length() < 10) {
					field237 = field237 + (char) var1;
					field447 = true;
				}

				if (var1 == 8 && field237.length() > 0) {
					field237 = field237.substring(0, field237.length() - 1);
					field447 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field237.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field237);
						} catch (Exception var21) {
						}

						field400.method523(128);
						field400.method528(var11);
					}

					field218 = 0;
					field447 = true;
				}
			} else if (field218 == 2) {
				if (var1 >= 32 && var1 <= 122 && field237.length() < 12) {
					field237 = field237 + (char) var1;
					field447 = true;
				}

				if (var1 == 8 && field237.length() > 0) {
					field237 = field237.substring(0, field237.length() - 1);
					field447 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field237.length() > 0) {
						field400.method523(209);
						field400.method530(UWUPOZSY.method486(field237));
					}

					field218 = 0;
					field447 = true;
				}
			} else if (field229 == -1) {
				if (var1 >= 32 && var1 <= 122 && field262.length() < 80) {
					field262 = field262 + (char) var1;
					field447 = true;
				}

				if (var1 == 8 && field262.length() > 0) {
					field262 = field262.substring(0, field262.length() - 1);
					field447 = true;
				}

				if ((var1 == 13 || var1 == 10) && field262.length() > 0) {
					if (field423 == 2) {
						if (field262.equals("::clientdrop")) {
							method125();
						}

						if (field262.equals("::lag")) {
							method27();
						}

						if (field262.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field329.method429(2); var12++) {
								field329.method446(2, var12, (byte) 1);
							}
						}

						if (field262.equals("::fpson")) {
							field403 = true;
						}

						if (field262.equals("::fpsoff")) {
							field403 = false;
						}

						if (field262.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field126[var13].field1014[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field262.startsWith("::")) {
						field400.method523(218);
						field400.method524(field262.length() - 1);
						field400.method531(field262.substring(2));
					} else {
						String var16 = field262.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field262 = field262.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field262 = field262.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field262 = field262.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field262 = field262.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field262 = field262.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field262 = field262.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field262 = field262.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field262 = field262.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field262 = field262.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field262 = field262.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field262 = field262.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field262 = field262.substring(6);
						}

						String var18 = field262.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field262 = field262.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field262 = field262.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field262 = field262.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field262 = field262.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field262 = field262.substring(6);
						}

						field400.method523(175);
						field400.method524(0);
						int var20 = field400.field1403;
						field400.method550(var19);
						field321.field1403 = 0;
						PBQQFQEC.method398(field321, field262);
						field400.method568(field321.field1402, 0, field321.field1403);
						field400.method550(var17);
						field400.method533(field400.field1403 - var20);
						field262 = PBQQFQEC.method399(field262);
						field262 = EZWZJZNN.method216(field262);
						field281.field1461 = field262;
						field281.field1433 = var17;
						field281.field1442 = var19;
						field281.field1443 = 150;

						if (field423 == 2) {
							method26(field281.field1461, "@cr2@" + field281.field1038, 2);
						} else if (field423 == 1) {
							method26(field281.field1461, "@cr1@" + field281.field1038, 2);
						} else {
							method26(field281.field1461, field281.field1038, 2);
						}

						if (field473 == 2) {
							field473 = 3;
							field155 = true;
							field400.method523(36);
							field400.method524(field473);
							field400.method524(field366);
							field400.method524(field162);
						}
					}

					field262 = "";
					field447 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)I")
	public final int method89() {
		int var1 = 3;
		if (field456 < 310) {
			int var2 = field453 >> 7;
			int var3 = field455 >> 7;
			int var4 = field281.field1472 >> 7;
			int var5 = field281.field1473 >> 7;

			if ((field462[field131][var2][var3] & 0x4) != 0) {
				var1 = field131;
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

					if ((field462[field131][var2][var3] & 0x4) != 0) {
						var1 = field131;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field462[field131][var2][var3] & 0x4) != 0) {
							var1 = field131;
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

					if ((field462[field131][var2][var3] & 0x4) != 0) {
						var1 = field131;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field462[field131][var2][var3] & 0x4) != 0) {
							var1 = field131;
						}
					}
				}
			}
		}

		if ((field462[field131][field281.field1472 >> 7][field281.field1473 >> 7] & 0x4) != 0) {
			var1 = field131;
		}

		return var1;
	}

	@ObfuscatedName("client.t(I)I")
	public final int method90() {
		int var1 = method91(field455, field131, field453);
		if (var1 - field454 < 800 && (field462[field131][field453 >> 7][field455 >> 7] & 0x4) != 0) {
			return field131;
		}

		return 3;
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method91(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field462[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field313[var6][var4][var5] + field313[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field313[var6][var4][var5 + 1] + field313[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method92() {
		if (field497 == 0) {
			int var1 = field1316 / 2 - 80;
			int var2 = field1317 / 2 + 20;
			var2 += 20;
			if (field1332 == 1 && field1333 >= var1 - 75 && field1333 <= var1 + 75 && field1334 >= var2 - 20 && field1334 <= var2 + 20) {
				field497 = 3;
				field222 = 0;
			}

			int var3 = field1316 / 2 + 80;
			if (field1332 == 1 && field1333 >= var3 - 75 && field1333 <= var3 + 75 && field1334 >= var2 - 20 && field1334 <= var2 + 20) {
				field444 = "";
				field445 = "Enter your username & password.";
				field497 = 2;
				field222 = 0;
			}
		} else if (field497 == 2) {
			int var4 = field1317 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1332 == 1 && field1334 >= var4 - 15 && field1334 < var4) {
				field222 = 0;
			}

			var4 += 15;
			if (field1332 == 1 && field1334 >= var4 - 15 && field1334 < var4) {
				field222 = 1;
			}

			var4 += 15;
			int var5 = field1316 / 2 - 80;
			int var6 = field1317 / 2 + 50;
			var6 += 20;
			if (field1332 == 1 && field1333 >= var5 - 75 && field1333 <= var5 + 75 && field1334 >= var6 - 20 && field1334 <= var6 + 20) {
				field368 = 0;
				method84(field270, field271, false);

				if (field404) {
					return;
				}
			}

			int var7 = field1316 / 2 + 80;
			if (field1332 == 1 && field1333 >= var7 - 75 && field1333 <= var7 + 75 && field1334 >= var6 - 20 && field1334 <= var6 + 20) {
				field497 = 0;
				field270 = "";
				field271 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method485();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field347.length(); var10++) {
					if (var8 == field347.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field222 == 0) {
					if (var8 == 8 && field270.length() > 0) {
						field270 = field270.substring(0, field270.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field222 = 1;
					}

					if (var9) {
						field270 = field270 + (char) var8;
					}

					if (field270.length() > 12) {
						field270 = field270.substring(0, 12);
					}
				} else if (field222 == 1) {
					if (var8 == 8 && field271.length() > 0) {
						field271 = field271.substring(0, field271.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field222 = 0;
					}

					if (var9) {
						field271 = field271 + (char) var8;
					}

					if (field271.length() > 20) {
						field271 = field271.substring(0, 20);
					}
				}
			}
		} else if (field497 == 3) {
			int var11 = field1316 / 2;
			int var12 = field1317 / 2 + 50;
			var12 += 20;
			if (field1332 == 1 && field1333 >= var11 - 75 && field1333 <= var11 + 75 && field1334 >= var12 - 20 && field1334 <= var12 + 20) {
				field497 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method93(int arg0, int arg1) {
		EWLVMFRK var3 = field112[field131][arg0][arg1];
		if (var3 == null) {
			field203.method327(field131, arg0, arg1);
		} else {
			int var4 = -99999999;
			MOPVFPSQ var5 = null;
			for (MOPVFPSQ var6 = (MOPVFPSQ) var3.method201(); var6 != null; var6 = (MOPVFPSQ) var3.method203()) {
				AOLTHQTO var7 = AOLTHQTO.method13(var6.field909);
				int var8 = var7.field81;
				if (var7.field65) {
					var8 = (var6.field908 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method199(var5);
			MOPVFPSQ var9 = null;
			MOPVFPSQ var10 = null;
			for (MOPVFPSQ var11 = (MOPVFPSQ) var3.method201(); var11 != null; var11 = (MOPVFPSQ) var3.method203()) {
				if (var5.field909 != var11.field909 && var9 == null) {
					var9 = var11;
				}

				if (var5.field909 != var11.field909 && var9.field909 != var11.field909 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field203.method313(var5, arg1, method91(arg1 * 128 + 64, field131, arg0 * 128 + 64), var10, field131, arg0, var12, var9);
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method94() {
		short var1 = 256;

		if (field512 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field512 > 768) {
					field223[var2] = method103(field224[var2], field225[var2], 1024 - field512);
				} else if (field512 > 256) {
					field223[var2] = field225[var2];
				} else {
					field223[var2] = method103(field225[var2], field224[var2], 256 - field512);
				}
			}
		} else if (field513 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field513 > 768) {
					field223[var3] = method103(field224[var3], field226[var3], 1024 - field513);
				} else if (field513 > 256) {
					field223[var3] = field226[var3];
				} else {
					field223[var3] = method103(field226[var3], field224[var3], 256 - field513);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field223[var4] = field224[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field299.field1477[var5] = field132.field1415[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field518[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field370[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field223[var12];
					int var15 = field299.field1477[var7];
					field299.field1477[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field299.method589(0, field1318, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field300.field1477[var16] = field133.field1415[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field518[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field370[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field223[var23];
					int var26 = field300.field1477[var18];
					field300.field1477[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field300.method589(0, field1318, 637);
	}

	@ObfuscatedName("client.a(LOCRHTPRV;Z)V")
	public final void method95(OCRHTPRV arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1000 == 0) {
			var2 = field203.method332(arg0.field999, arg0.field1001, arg0.field1002);
		}

		if (arg0.field1000 == 1) {
			var2 = field203.method333(arg0.field1002, arg0.field1001, arg0.field999);
		}

		if (arg0.field1000 == 2) {
			var2 = field203.method334(arg0.field999, arg0.field1001, arg0.field1002);
		}

		if (arg0.field1000 == 3) {
			var2 = field203.method335(arg0.field999, arg0.field1001, arg0.field1002);
		}

		if (var2 != 0) {
			int var6 = field203.method336(arg0.field999, arg0.field1001, arg0.field1002, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1003 = var3;
		arg0.field1005 = var4;
		arg0.field1004 = var5;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method96() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.w(I)V")
	public final void method97() {
		if (field346 > 1) {
			field346--;
		}

		if (field312 > 0) {
			field312--;
		}

		for (int var1 = 0; var1 < 5 && method58(); var1++) {
		}

		if (field404) {
			synchronized (field265.field773) {
				if (!field227) {
					field265.field774 = 0;
				} else if (field1332 != 0 || field265.field774 >= 40) {
					field400.method523(33);
					field400.method524(0);
					int var3 = field400.field1403;
					int var4 = 0;
					for (int var5 = 0; var5 < field265.field774 && var3 - field400.field1403 < 240; var5++) {
						var4++;
						int var6 = field265.field772[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field265.field769[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field265.field772[var5] == -1 && field265.field769[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field502 != var7 || field503 != var6) {
							int var9 = var7 - field502;
							field502 = var7;
							int var10 = var6 - field503;
							field503 = var6;

							if (field424 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field400.method525((field424 << 12) + (var9 << 6) + var10);
								field424 = 0;
							} else if (field424 < 8) {
								field400.method527((field424 << 19) + var8 + 0x800000);
								field424 = 0;
							} else {
								field400.method528((field424 << 19) + var8 - 0x40000000);
								field424 = 0;
							}
						} else if (field424 < 2047) {
							field424++;
						}
					}

					field400.method533(field400.field1403 - var3);

					if (var4 >= field265.field774) {
						field265.field774 = 0;
					} else {
						field265.field774 -= var4;
						for (int var11 = 0; var11 < field265.field774; var11++) {
							field265.field769[var11] = field265.field769[var4 + var11];
							field265.field772[var11] = field265.field772[var4 + var11];
						}
					}
				}
			}

			if (field1332 != 0) {
				long var12 = (field1335 - field461) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field461 = field1335;
				int var14 = field1334;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1333;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1332 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field400.method523(133);
				field400.method565((var17 << 19) + (var18 << 20) + var16);
			}

			if (field240 > 0) {
				field240--;
			}

			if (field1336[1] == 1 || field1336[2] == 1 || field1336[3] == 1 || field1336[4] == 1) {
				field241 = true;
			}

			if (field241 && field240 <= 0) {
				field240 = 20;
				field241 = false;
				field400.method523(73);
				field400.method525(field185);
				field400.method525(field186);
			}

			if (field1323 && !field201) {
				field201 = true;
				field400.method523(95);
				field400.method524(1);
			}

			if (!field1323 && field201) {
				field201 = false;
				field400.method523(95);
				field400.method524(0);
			}

			method119();
			method123();
			method38();
			field310++;
			if (field310 > 750) {
				method125();
			}

			method51();
			method141();
			method131();
			field274++;

			if (field532 != 0) {
				field531 += 20;
				if (field531 >= 400) {
					field532 = 0;
				}
			}

			if (field419 != 0) {
				field416++;
				if (field416 >= 15) {
					if (field419 == 2) {
						field320 = true;
					}

					if (field419 == 3) {
						field447 = true;
					}

					field419 = 0;
				}
			}

			if (field291 != 0) {
				field178++;

				if (field1326 > field292 + 5 || field1326 < field292 - 5 || field1327 > field293 + 5 || field1327 < field293 - 5) {
					field276 = true;
				}

				if (field1325 == 0) {
					if (field291 == 2) {
						field320 = true;
					}

					if (field291 == 3) {
						field447 = true;
					}

					field291 = 0;

					if (field276 && field178 >= 5) {
						field523 = -1;
						method132();

						if (field523 == field289 && field522 != field290) {
							RWLOYYVC var19 = RWLOYYVC.field1135[field289];
							byte var20 = 0;
							if (field195 == 1 && var19.field1143 == 206) {
								var20 = 1;
							}

							if (var19.field1153[field522] <= 0) {
								var20 = 0;
							}

							if (var19.field1119) {
								int var21 = field290;
								int var22 = field522;
								var19.field1153[var22] = var19.field1153[var21];
								var19.field1115[var22] = var19.field1115[var21];
								var19.field1153[var21] = -1;
								var19.field1115[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field290;
								int var24 = field522;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method414(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method414(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method414(field522, field290);
							}

							field400.method523(248);
							field400.method524(var20);
							field400.method558(field522);
							field400.method556(field290);
							field400.method558(field289);
						}
					} else if ((field489 == 1 || method25(field111 - 1)) && field111 > 2) {
						method45();
					} else if (field111 > 0) {
						method128(field111 - 1);
					}

					field416 = 10;
					field1332 = 0;
				}
			}

			if (KALHRUDX.field834 != -1) {
				int var25 = KALHRUDX.field834;
				int var26 = KALHRUDX.field835;
				boolean var27 = method82(0, 0, 0, 0, field281.field1448[0], var25, true, field281.field1449[0], var26, 0, 0);
				KALHRUDX.field834 = -1;

				if (var27) {
					field529 = field1333;
					field530 = field1334;
					field532 = 1;
					field531 = 0;
				}
			}

			if (field1332 == 1 && field525 != null) {
				field525 = null;
				field447 = true;
				field1332 = 0;
			}

			method40();
			method34();
			method72();
			method75();

			if (field1325 == 1 || field1332 == 1) {
				field464++;
			}

			if (field196 == 2) {
				method78();
			}

			if (field196 == 2 && field115) {
				method64();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field264[var28]++;
			}

			method88();
			field1324++;
			if (field1324 > 4500) {
				field312 = 250;
				field1324 -= 500;
				field400.method523(166);
			}

			field326++;
			if (field326 > 500) {
				field326 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field385 += field386;
				}

				if ((var29 & 0x2) == 2) {
					field381 += field382;
				}

				if ((var29 & 0x4) == 4) {
					field487 += field488;
				}
			}

			if (field385 < -50) {
				field386 = 2;
			}

			if (field385 > 50) {
				field386 = -2;
			}

			if (field381 < -55) {
				field382 = 2;
			}

			if (field381 > 55) {
				field382 = -2;
			}

			if (field487 < -40) {
				field488 = 1;
			}

			if (field487 > 40) {
				field488 = -1;
			}

			field374++;
			if (field374 > 500) {
				field374 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field134 += field135;
				}

				if ((var30 & 0x2) == 2) {
					field294 += field295;
				}
			}

			if (field134 < -60) {
				field135 = 2;
			}

			if (field134 > 60) {
				field135 = -2;
			}

			if (field294 < -20) {
				field295 = 1;
			}

			if (field294 > 10) {
				field295 = -1;
			}

			field311++;
			if (field311 > 50) {
				field400.method523(220);
			}

			try {
				if (field190 != null && field400.field1403 > 0) {
					field190.method196(field400.field1403, 0, field400.field1402);
					field400.field1403 = 0;
					field311 = 0;
				}
			} catch (IOException var32) {
				method125();
			} catch (Exception var33) {
				method109();
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method98() {
		for (QOQPOLAC var1 = (QOQPOLAC) field409.method201(); var1 != null; var1 = (QOQPOLAC) field409.method203()) {
			if (field131 != var1.field1083 || field376 > var1.field1071) {
				var1.method396();
			} else if (field376 >= var1.field1070) {
				if (var1.field1068 > 0) {
					FSNLAIJY var2 = field322[var1.field1068 - 1];
					if (var2 != null && var2.field1472 >= 0 && var2.field1472 < 13312 && var2.field1473 >= 0 && var2.field1473 < 13312) {
						var1.method403(var2.field1472, var2.field1473, method91(var2.field1473, var1.field1083, var2.field1472) - var1.field1075, field376);
					}
				}

				if (var1.field1068 < 0) {
					int var3 = -var1.field1068 - 1;
					OTTYZSZE var4;
					if (field358 == var3) {
						var4 = field281;
					} else {
						var4 = field206[var3];
					}

					if (var4 != null && var4.field1472 >= 0 && var4.field1472 < 13312 && var4.field1473 >= 0 && var4.field1473 < 13312) {
						var1.method403(var4.field1472, var4.field1473, method91(var4.field1473, var1.field1083, var4.field1472) - var1.field1075, field376);
					}
				}

				var1.method404(field274);
				field203.method317(var1.field1076, field131, (int) var1.field1086, (int) var1.field1087, 60, (int) var1.field1088, -1, var1, false);
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method99(int arg0) {
		int[] var2 = field285.field1415;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field462[arg0][var7][var5] & 0x18) == 0) {
					field203.method341(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field462[arg0 + 1][var7][var5] & 0x8) != 0) {
					field203.method341(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field285.method571();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field462[arg0][var11][var10] & 0x18) == 0) {
					method71(var10, arg0, var9, var8, var11);
				}

				if (arg0 < 3 && (field462[arg0 + 1][var11][var10] & 0x8) != 0) {
					method71(var10, arg0 + 1, var9, var8, var11);
				}
			}
		}

		field341.method588();
		field363++;
		if (field363 > 58) {
			field363 = 0;
			field400.method523(91);
		}

		field278 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field203.method335(field131, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = SIUJJQHQ.method455(var14).field1260;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field126[field131].field1014;
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

						field255[field278] = field526[var15];
						field279[field278] = var16;
						field280[field278] = var17;
						field278++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method100() {
		try {
			field472 = -1;
			field372.method205();
			field409.method205();
			DQOLNIHT.method173();
			method19();
			field203.method306();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field126[var1].method371();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field462[var2][var3][var4] = 0;
					}
				}
			}

			UZSUQFDN var5 = new UZSUQFDN(field462, 104, 104, field313);
			int var6 = field263.length;
			field400.method523(220);

			if (!field318) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field330[var7] >> 8) * 64 - field197;
					int var9 = (field330[var7] & 0xFF) * 64 - field198;
					byte[] var10 = field263[var7];
					if (var10 != null) {
						var5.method509((field173 - 6) * 8, var9, var8, field126, var10, (field172 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field330[var11] >> 8) * 64 - field197;
					int var13 = (field330[var11] & 0xFF) * 64 - field198;
					byte[] var14 = field263[var11];
					if (var14 == null && field173 < 800) {
						var5.method499(64, 64, var13, var12);
					}
				}

				field400.method523(220);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field177[var15];
					if (var16 != null) {
						int var17 = (field330[var15] >> 8) * 64 - field197;
						int var18 = (field330[var15] & 0xFF) * 64 - field198;
						var5.method494(field126, var18, field203, var16, var17);
					}
				}
			}

			if (field318) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field142[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field330.length; var28++) {
									if (field330[var28] == var27 && field263[var28] != null) {
										var5.method503(field126, field263[var28], var23, var20 * 8, var24, (var26 & 0x7) * 8, (var25 & 0x7) * 8, var19, var21 * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field142[0][var29][var30];
						if (var31 == -1) {
							var5.method499(8, 8, var30 * 8, var29 * 8);
						}
					}
				}

				field400.method523(220);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field142[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field330.length; var41++) {
									if (field330[var41] == var40 && field177[var41] != null) {
										var5.method492((var39 & 0x7) * 8, field126, var36, var32, field203, var37, var33 * 8, var34 * 8, (var38 & 0x7) * 8, field177[var41]);
										break;
									}
								}
							}
						}
					}
				}
			}

			field400.method523(220);
			var5.method511(field203, field126);
			field341.method588();
			field400.method523(220);
			int var42 = UZSUQFDN.field1347;
			if (var42 > field131) {
				var42 = field131;
			}

			if (var42 < field131 - 1) {
				int var43 = field131 - 1;
			}

			if (field336) {
				field203.method307(UZSUQFDN.field1347);
			} else {
				field203.method307(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method93(var44, var45);
				}
			}

			method87();
		} catch (Exception var58) {
		}

		SIUJJQHQ.field1284.method299();

		if (field1321 != null) {
			field400.method523(126);
			field400.method528(1057001181);
		}

		if (field336 && signlink.cache_dat != null) {
			int var47 = field329.method429(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field329.method439(var48);
				if ((var49 & 0x79) == 0) {
					FUTAQMCE.method249(var48);
				}
			}
		}

		System.gc();
		DQOLNIHT.method174(20);
		field329.method445();
		int var50 = (field172 - 6) / 8 - 1;
		int var51 = (field172 + 6) / 8 + 1;
		int var52 = (field173 - 6) / 8 - 1;
		int var53 = (field173 + 6) / 8 + 1;
		if (field138) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field329.method438(0, var54, var55);
					if (var56 != -1) {
						field329.method441(3, var56);
					}

					int var57 = field329.method438(1, var54, var55);
					if (var57 != -1) {
						field329.method441(3, var57);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LRWLOYYVC;B)V")
	public final void method101(RWLOYYVC arg0) {
		int var2 = arg0.field1143;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field117 == 0) {
				arg0.field1117 = "Loading friend list";
				arg0.field1150 = 0;
			} else if (var2 == 1 && field117 == 1) {
				arg0.field1117 = "Connecting to friendserver";
				arg0.field1150 = 0;
			} else if (var2 == 2 && field117 != 2) {
				arg0.field1117 = "Please wait...";
				arg0.field1150 = 0;
			} else {
				int var3 = field116;
				if (field117 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1117 = "";
					arg0.field1150 = 0;
				} else {
					arg0.field1117 = field163[var2];
					arg0.field1150 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field116;
			if (field117 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1117 = "";
				arg0.field1150 = 0;
			} else {
				if (field305[var2] == 0) {
					arg0.field1117 = "@red@Offline";
				} else if (field305[var2] == field333) {
					arg0.field1117 = "@gre@World-" + (field305[var2] - 9);
				} else {
					arg0.field1117 = "@yel@World-" + (field305[var2] - 9);
				}

				arg0.field1150 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field116;
			if (field117 != 2) {
				var5 = 0;
			}

			arg0.field1138 = var5 * 15 + 20;
			if (arg0.field1138 <= arg0.field1133) {
				arg0.field1138 = arg0.field1133 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field117 == 0) {
				arg0.field1117 = "Loading ignore list";
				arg0.field1150 = 0;
			} else if (var2 == 1 && field117 == 0) {
				arg0.field1117 = "Please wait...";
				arg0.field1150 = 0;
			} else {
				int var6 = field383;
				if (field117 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1117 = "";
					arg0.field1150 = 0;
				} else {
					arg0.field1117 = UWUPOZSY.method490(UWUPOZSY.method487(field273[var2]));
					arg0.field1150 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1138 = field383 * 15 + 20;
			if (arg0.field1138 <= arg0.field1133) {
				arg0.field1138 = arg0.field1133 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1122 = 150;
			arg0.field1123 = (int) (Math.sin(field376 / 40.0D) * 256.0D) & 0x7FF;

			if (field337) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field397[var7];
					if (var8 >= 0 && !OQTGDMNX.field1016[var8].method385()) {
						return;
					}
				}

				field337 = false;
				FUTAQMCE[] var9 = new FUTAQMCE[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field397[var11];
					if (var12 >= 0) {
						var9[var10++] = OQTGDMNX.field1016[var12].method386();
					}
				}

				FUTAQMCE var13 = new FUTAQMCE(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field433[var14] != 0) {
						var13.method264(field501[var14][0], field501[var14][field433[var14]]);

						if (var14 == 1) {
							var13.method264(field399[0], field399[field433[var14]]);
						}
					}
				}

				var13.method257();
				var13.method258(GMRGYXFL.field720[field281.field1431].field722[0]);
				var13.method267(64, 850, -30, -50, -30, true);
				arg0.field1146 = 5;
				arg0.field1147 = 0;
				RWLOYYVC.method413(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field343 == null) {
				field343 = arg0.field1148;
				field344 = arg0.field1139;
			}

			if (field141) {
				arg0.field1148 = field344;
			} else {
				arg0.field1148 = field343;
			}
		} else if (var2 == 325) {
			if (field343 == null) {
				field343 = arg0.field1148;
				field344 = arg0.field1139;
			}

			if (field141) {
				arg0.field1148 = field343;
			} else {
				arg0.field1148 = field344;
			}
		} else if (var2 == 600) {
			arg0.field1117 = field369;
			if (field376 % 20 < 10) {
				arg0.field1117 = arg0.field1117 + "|";
			} else {
				arg0.field1117 = arg0.field1117 + " ";
			}
		} else if (var2 == 613) {
			if (field423 < 1) {
				arg0.field1117 = "";
			} else if (field182) {
				arg0.field1096 = 0xFF0000;
				arg0.field1117 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1096 = 0xFFFFFF;
				arg0.field1117 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field384 == 0) {
				arg0.field1117 = "";
			} else {
				String var15;
				if (field357 == 0) {
					var15 = "earlier today";
				} else if (field357 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field357 + " days ago";
				}

				arg0.field1117 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field410 == 0) {
				arg0.field1117 = "0 unread messages";
				arg0.field1096 = 0xFFFF00;
			}

			if (field410 == 1) {
				arg0.field1117 = "1 unread message";
				arg0.field1096 = 0xFF00;
			}

			if (field410 > 1) {
				arg0.field1117 = field410 + " unread messages";
				arg0.field1096 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field405 == 201) {
				if (field463 == 1) {
					arg0.field1117 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1117 = "";
				}
			} else if (field405 == 200) {
				arg0.field1117 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field405 == 0) {
					var16 = "Earlier today";
				} else if (field405 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field405 + " days ago";
				}

				arg0.field1117 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field405 == 201) {
				if (field463 == 1) {
					arg0.field1117 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1117 = "";
				}
			} else if (field405 == 200) {
				arg0.field1117 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1117 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field405 == 201) {
				if (field463 == 1) {
					arg0.field1117 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1117 = "";
				}
			} else if (field405 == 200) {
				arg0.field1117 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1117 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method102() {
		if (field286 || field251 || field364) {
			method110();
		} else {
			field420++;

			if (field404) {
				method148();
			} else {
				method154(false);
			}

			field464 = 0;
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method103(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(LXJCNBMKS;IZ)V")
	public final void method104(XJCNBMKS arg0, int arg1) {
		for (int var3 = 0; var3 < field209; var3++) {
			int var4 = field210[var3];
			FSNLAIJY var5 = field322[var4];
			int var6 = arg0.method534();
			if ((var6 & 0x2) != 0) {
				var5.field1461 = arg0.method541();
				var5.field1443 = 100;
			}

			if ((var6 & 0x20) != 0) {
				int var7 = arg0.method554();
				int var8 = arg0.method553();
				var5.method586(field376, var8, var7);
				var5.field1422 = field376 + 300;
				var5.field1423 = arg0.method552();
				var5.field1424 = arg0.method554();
			}

			if ((var6 & 0x8) != 0) {
				var5.field1426 = arg0.method559();
				int var9 = arg0.method567();
				var5.field1430 = var9 >> 16;
				var5.field1429 = (var9 & 0xFFFF) + field376;
				var5.field1427 = 0;
				var5.field1428 = 0;

				if (var5.field1429 > field376) {
					var5.field1427 = -1;
				}

				if (var5.field1426 == 0xFFFF) {
					var5.field1426 = -1;
				}
			}

			if ((var6 & 0x40) != 0) {
				var5.field1460 = arg0.method560();
				if (var5.field1460 == 0xFFFF) {
					var5.field1460 = -1;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field631 = NHTDEVDA.method368(arg0.method561());
				var5.field1464 = var5.field631.field953;
				var5.field1457 = var5.field631.field945;
				var5.field1465 = var5.field631.field941;
				var5.field1466 = var5.field631.field946;
				var5.field1467 = var5.field631.field940;
				var5.field1468 = var5.field631.field961;
				var5.field1431 = var5.field631.field954;
			}

			if ((var6 & 0x4) != 0) {
				int var10 = arg0.method559();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg0.method534();
				if (var5.field1450 == var10 && var10 != -1) {
					int var12 = GMRGYXFL.field720[var10].field734;
					if (var12 == 1) {
						var5.field1451 = 0;
						var5.field1452 = 0;
						var5.field1453 = var11;
						var5.field1454 = 0;
					}

					if (var12 == 2) {
						var5.field1454 = 0;
					}
				} else if (var10 == -1 || var5.field1450 == -1 || GMRGYXFL.field720[var10].field728 >= GMRGYXFL.field720[var5.field1450].field728) {
					var5.field1450 = var10;
					var5.field1451 = 0;
					var5.field1452 = 0;
					var5.field1453 = var11;
					var5.field1454 = 0;
					var5.field1475 = var5.field1456;
				}
			}

			if ((var6 & 0x80) != 0) {
				var5.field1462 = arg0.method559();
				var5.field1463 = arg0.method561();
			}

			if ((var6 & 0x1) != 0) {
				int var13 = arg0.method554();
				int var14 = arg0.method553();
				var5.method586(field376, var14, var13);
				var5.field1422 = field376 + 300;
				var5.field1423 = arg0.method534();
				var5.field1424 = arg0.method553();
			}
		}
	}

	@ObfuscatedName("client.a(LOTTYZSZE;ILXJCNBMKS;II)V")
	public final void method105(OTTYZSZE arg0, XJCNBMKS arg1, int arg2, int arg3) {
		if ((arg2 & 0x2) != 0) {
			int var5 = arg1.method554();
			int var6 = arg1.method552();
			arg0.method586(field376, var6, var5);
			arg0.field1422 = field376 + 300;
			arg0.field1423 = arg1.method534();
			arg0.field1424 = arg1.method552();
		}

		if ((arg2 & 0x200) != 0) {
			arg0.field1435 = arg1.method554();
			arg0.field1437 = arg1.method552();
			arg0.field1436 = arg1.method553();
			arg0.field1438 = arg1.method554();
			arg0.field1439 = arg1.method561() + field376;
			arg0.field1440 = arg1.method559() + field376;
			arg0.field1441 = arg1.method554();
			arg0.method587();
		}

		if ((arg2 & 0x20) != 0) {
			arg0.field1460 = arg1.method536();
			if (arg0.field1460 == 0xFFFF) {
				arg0.field1460 = -1;
			}
		}

		if ((arg2 & 0x8) != 0) {
			arg0.field1462 = arg1.method559();
			arg0.field1463 = arg1.method536();
		}

		if ((arg2 & 0x100) != 0) {
			int var7 = arg1.method553();
			int var8 = arg1.method554();
			arg0.method586(field376, var8, var7);
			arg0.field1422 = field376 + 300;
			arg0.field1423 = arg1.method534();
			arg0.field1424 = arg1.method534();
		}

		if ((arg2 & 0x4) != 0) {
			int var9 = arg1.method553();
			byte[] var10 = new byte[var9];
			XJCNBMKS var11 = new XJCNBMKS(var10);
			arg1.method569(0, var10, var9);
			field211[arg3] = var11;
			arg0.method390(var11);
		}

		if ((arg2 & 0x40) != 0) {
			int var12 = arg1.method559();
			int var13 = arg1.method553();
			int var14 = arg1.method534();
			int var15 = arg1.field1403;

			if (arg0.field1038 != null && arg0.field1039) {
				long var16 = UWUPOZSY.method486(arg0.field1038);
				boolean var18 = false;
				if (var13 <= 1) {
					for (int var19 = 0; var19 < field383; var19++) {
						if (field273[var19] == var16) {
							var18 = true;
							break;
						}
					}
				}

				if (!var18 && field156 == 0) {
					try {
						field321.field1403 = 0;
						arg1.method570(0, field321.field1402, var14);
						field321.field1403 = 0;
						String var20 = PBQQFQEC.method397(var14, field321);
						var20 = EZWZJZNN.method216(var20);
						arg0.field1461 = var20;
						arg0.field1433 = var12 >> 8;
						arg0.field1442 = var12 & 0xFF;
						arg0.field1443 = 150;

						if (var13 == 2 || var13 == 3) {
							method26(var20, "@cr2@" + arg0.field1038, 1);
						} else if (var13 == 1) {
							method26(var20, "@cr1@" + arg0.field1038, 1);
						} else {
							method26(var20, arg0.field1038, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field1403 = var14 + var15;
		}

		if ((arg2 & 0x400) != 0) {
			arg0.field1426 = arg1.method561();
			int var22 = arg1.method567();
			arg0.field1430 = var22 >> 16;
			arg0.field1429 = (var22 & 0xFFFF) + field376;
			arg0.field1427 = 0;
			arg0.field1428 = 0;

			if (arg0.field1429 > field376) {
				arg0.field1427 = -1;
			}

			if (arg0.field1426 == 0xFFFF) {
				arg0.field1426 = -1;
			}
		}

		if ((arg2 & 0x1) != 0) {
			int var23 = arg1.method536();
			if (var23 == 0xFFFF) {
				var23 = -1;
			}

			int var24 = arg1.method553();
			if (arg0.field1450 == var23 && var23 != -1) {
				int var25 = GMRGYXFL.field720[var23].field734;
				if (var25 == 1) {
					arg0.field1451 = 0;
					arg0.field1452 = 0;
					arg0.field1453 = var24;
					arg0.field1454 = 0;
				}

				if (var25 == 2) {
					arg0.field1454 = 0;
				}
			} else if (var23 == -1 || arg0.field1450 == -1 || GMRGYXFL.field720[var23].field728 >= GMRGYXFL.field720[arg0.field1450].field728) {
				arg0.field1450 = var23;
				arg0.field1451 = 0;
				arg0.field1452 = 0;
				arg0.field1453 = var24;
				arg0.field1454 = 0;
				arg0.field1475 = arg0.field1456;
			}
		}

		if ((arg2 & 0x80) != 0) {
			arg0.field1461 = arg1.method541();
			if (arg0.field1461.charAt(0) == '~') {
				arg0.field1461 = arg0.field1461.substring(1);
				method26(arg0.field1461, arg0.field1038, 2);
			} else if (field281 == arg0) {
				method26(arg0.field1461, arg0.field1038, 2);
			}

			arg0.field1433 = 0;
			arg0.field1442 = 0;
			arg0.field1443 = 150;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method106(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method106(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IZLjava/lang/String;)V")
	public final void method107(int arg0, String arg1) {
		field460 = arg0;
		field168 = arg1;
		method22();

		if (field441 == null) {
			super.method107(arg0, arg1);
		} else {
			field298.method588();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field129.method466(var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", 0xFFFFFF, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			HQRNTLRZ.method285(34, 0x8C1111, var3 / 2 - 152, 304, var6);
			HQRNTLRZ.method285(32, 0, var3 / 2 - 151, 302, var6 + 1);
			HQRNTLRZ.method284(var3 / 2 - 150, var6 + 2, 0x8C1111, arg0 * 3, 30);
			HQRNTLRZ.method284(arg0 * 3 + var3 / 2 - 150, var6 + 2, 0, 300 - arg0 * 3, 30);
			field129.method466(var4 / 2 + 5 - var5, arg1, 0xFFFFFF, var3 / 2);
			field298.method589(171, field1318, 202);

			if (field375) {
				field375 = false;

				if (!field328) {
					field299.method589(0, field1318, 0);
					field300.method589(0, field1318, 637);
				}

				field296.method589(0, field1318, 128);
				field297.method589(371, field1318, 202);
				field301.method589(265, field1318, 0);
				field302.method589(265, field1318, 562);
				field303.method589(171, field1318, 128);
				field304.method589(171, field1318, 562);
			}
		}
	}

	@ObfuscatedName("client.a(LXJCNBMKS;ZI)V")
	public final void method108(XJCNBMKS arg0, int arg1) {
		while (arg0.field1404 + 21 < arg1 * 8) {
			int var3 = arg0.method545(14);
			if (var3 == 16383) {
				break;
			}

			if (field322[var3] == null) {
				field322[var3] = new FSNLAIJY();
			}

			FSNLAIJY var4 = field322[var3];
			field324[field323++] = var3;
			var4.field1434 = field376;
			int var5 = arg0.method545(1);
			if (var5 == 1) {
				field210[field209++] = var3;
			}

			int var6 = arg0.method545(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method545(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			var4.field631 = NHTDEVDA.method368(arg0.method545(12));
			int var8 = arg0.method545(1);
			var4.field1464 = var4.field631.field953;
			var4.field1457 = var4.field631.field945;
			var4.field1465 = var4.field631.field941;
			var4.field1466 = var4.field631.field946;
			var4.field1467 = var4.field631.field940;
			var4.field1468 = var4.field631.field961;
			var4.field1431 = var4.field631.field954;
			var4.method585(field281.field1448[0] + var7, field281.field1449[0] + var6, var8 == 1);
		}

		arg0.method546();
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method109() {
		try {
			if (field190 != null) {
				field190.method192();
			}
		} catch (Exception var2) {
		}

		field190 = null;
		field404 = false;
		field497 = 0;
		field270 = "";
		field271 = "";
		method19();
		field203.method306();

		for (int var1 = 0; var1 < 4; var1++) {
			field126[var1].method371();
		}

		System.gc();
		method96();
		field511 = -1;
		field377 = -1;
		field484 = 0;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method110() {
		Graphics var1 = method28().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method484(1);

		if (field251) {
			field328 = false;
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

		if (field364) {
			field328 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field286) {
			field328 = false;
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

	@ObfuscatedName("client.d(IIII)Z")
	public final boolean method111(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field203.method336(field131, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			SIUJJQHQ var8 = SIUJJQHQ.method455(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1265;
				var10 = var8.field1256;
			} else {
				var9 = var8.field1256;
				var10 = var8.field1265;
			}

			int var11 = var8.field1279;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method82(var9, var10, 2, var11, field281.field1448[0], arg1, false, field281.field1449[0], arg2, 0, 0);
		} else {
			method82(0, 0, 2, 0, field281.field1448[0], arg1, false, field281.field1449[0], arg2, var7, var6 + 1);
		}

		field529 = field1333;
		field530 = field1334;
		field532 = 2;
		field531 = 0;
		return true;
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public final String method112(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.d(III)V")
	public final void method113(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field221[var4] != null) {
				int var5 = field219[var4];
				int var6 = field118 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field220[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field473 == 0 || field473 == 1 && method68(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field281.field1038)) {
						if (field423 >= 1) {
							field119[field111] = "Report abuse @whi@" + var7;
							field260[field111] = 38;
							field111++;
						}

						field119[field111] = "Add ignore @whi@" + var7;
						field260[field111] = 376;
						field111++;
						field119[field111] = "Add friend @whi@" + var7;
						field260[field111] = 554;
						field111++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field458 == 0 && (var5 == 7 || field366 == 0 || field366 == 1 && method68(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field423 >= 1) {
							field119[field111] = "Report abuse @whi@" + var7;
							field260[field111] = 38;
							field111++;
						}

						field119[field111] = "Add ignore @whi@" + var7;
						field260[field111] = 376;
						field111++;
						field119[field111] = "Add friend @whi@" + var7;
						field260[field111] = 554;
						field111++;
					}

					var3++;
				}

				if (var5 == 4 && (field162 == 0 || field162 == 1 && method68(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field119[field111] = "Accept trade @whi@" + var7;
						field260[field111] = 543;
						field111++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field458 == 0 && field366 < 2) {
					var3++;
				}

				if (var5 == 8 && (field162 == 0 || field162 == 1 && method68(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field119[field111] = "Accept challenge @whi@" + var7;
						field260[field111] = 219;
						field111++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LOTTYZSZE;ZIII)V")
	public final void method114(OTTYZSZE arg0, int arg1, int arg2, int arg3) {
		if (field281 != arg0 && field111 < 400) {
			String var5;
			if (arg0.field1045 == 0) {
				var5 = arg0.field1038 + method60(arg0.field1030, field281.field1030) + " (level-" + arg0.field1030 + ")";
			} else {
				var5 = arg0.field1038 + " (skill-" + arg0.field1045 + ")";
			}

			if (field350 == 1) {
				field119[field111] = "Use " + field354 + " with @whi@" + var5;
				field260[field111] = 291;
				field261[field111] = arg2;
				field258[field111] = arg1;
				field259[field111] = arg3;
				field111++;
			} else if (field465 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field527[var6] != null) {
						field119[field111] = field527[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field527[var6].equalsIgnoreCase("attack")) {
							if (arg0.field1030 > field281.field1030) {
								var7 = 2000;
							}

							if (field281.field1032 != 0 && arg0.field1032 != 0) {
								if (field281.field1032 == arg0.field1032) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field528[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field260[field111] = var7 + 822;
						}

						if (var6 == 1) {
							field260[field111] = var7 + 986;
						}

						if (var6 == 2) {
							field260[field111] = var7 + 431;
						}

						if (var6 == 3) {
							field260[field111] = var7 + 916;
						}

						if (var6 == 4) {
							field260[field111] = var7 + 132;
						}

						field261[field111] = arg2;
						field258[field111] = arg1;
						field259[field111] = arg3;
						field111++;
					}
				}
			} else if ((field467 & 0x8) == 8) {
				field119[field111] = field468 + " @whi@" + var5;
				field260[field111] = 108;
				field261[field111] = arg2;
				field258[field111] = arg1;
				field259[field111] = arg3;
				field111++;
			}

			for (int var8 = 0; var8 < field111; var8++) {
				if (field260[var8] == 746) {
					field119[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LXJCNBMKS;IZ)V")
	public final void method115(XJCNBMKS arg0, int arg1) {
		int var3 = arg0.method545(8);
		if (var3 < field207) {
			for (int var4 = var3; var4 < field207; var4++) {
				field440[field439++] = field208[var4];
			}
		}

		if (var3 > field207) {
			signlink.reporterror(field270 + " Too many players");
			throw new RuntimeException("eek");
		}

		field207 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field208[var5];
			OTTYZSZE var7 = field206[var6];
			int var8 = arg0.method545(1);
			if (var8 == 0) {
				field208[field207++] = var6;
				var7.field1434 = field376;
			} else {
				int var9 = arg0.method545(2);
				if (var9 == 0) {
					field208[field207++] = var6;
					var7.field1434 = field376;
					field210[field209++] = var6;
				} else if (var9 == 1) {
					field208[field207++] = var6;
					var7.field1434 = field376;
					int var10 = arg0.method545(3);
					var7.method584(false, var10);
					int var11 = arg0.method545(1);
					if (var11 == 1) {
						field210[field209++] = var6;
					}
				} else if (var9 == 2) {
					field208[field207++] = var6;
					var7.field1434 = field376;
					int var12 = arg0.method545(3);
					var7.method584(true, var12);
					int var13 = arg0.method545(3);
					var7.method584(true, var13);
					int var14 = arg0.method545(1);
					if (var14 == 1) {
						field210[field209++] = var6;
					}
				} else if (var9 == 3) {
					field440[field439++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILNHTDEVDA;IZI)V")
	public final void method116(int arg0, NHTDEVDA arg1, int arg2, int arg3) {
		if (field111 < 400) {
			if (arg1.field948 != null) {
				arg1 = arg1.method364();
			}

			if (arg1 != null && arg1.field958) {
				String var5 = arg1.field970;
				if (arg1.field934 != 0) {
					var5 = var5 + method60(arg1.field934, field281.field1030) + " (level-" + arg1.field934 + ")";
				}

				if (field350 == 1) {
					field119[field111] = "Use " + field354 + " with @yel@" + var5;
					field260[field111] = 450;
					field261[field111] = arg2;
					field258[field111] = arg3;
					field259[field111] = arg0;
					field111++;
				} else if (field465 != 1) {
					if (arg1.field960 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field960[var6] != null && !arg1.field960[var6].equalsIgnoreCase("attack")) {
								field119[field111] = arg1.field960[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field260[field111] = 173;
								}

								if (var6 == 1) {
									field260[field111] = 11;
								}

								if (var6 == 2) {
									field260[field111] = 567;
								}

								if (var6 == 3) {
									field260[field111] = 415;
								}

								if (var6 == 4) {
									field260[field111] = 246;
								}

								field261[field111] = arg2;
								field258[field111] = arg3;
								field259[field111] = arg0;
								field111++;
							}
						}
					}

					if (arg1.field960 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field960[var7] != null && arg1.field960[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field934 > field281.field1030) {
									var8 = 2000;
								}

								field119[field111] = arg1.field960[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field260[field111] = var8 + 173;
								}

								if (var7 == 1) {
									field260[field111] = var8 + 11;
								}

								if (var7 == 2) {
									field260[field111] = var8 + 567;
								}

								if (var7 == 3) {
									field260[field111] = var8 + 415;
								}

								if (var7 == 4) {
									field260[field111] = var8 + 246;
								}

								field261[field111] = arg2;
								field258[field111] = arg3;
								field259[field111] = arg0;
								field111++;
							}
						}
					}

					field119[field111] = "Examine @yel@" + var5;
					field260[field111] = 1569;
					field261[field111] = arg2;
					field258[field111] = arg3;
					field259[field111] = arg0;
					field111++;
				} else if ((field467 & 0x2) == 2) {
					field119[field111] = field468 + " @yel@" + var5;
					field260[field111] = 902;
					field261[field111] = arg2;
					field258[field111] = arg3;
					field259[field111] = arg0;
					field111++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method117(int arg0) {
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

	@ObfuscatedName("client.z(I)V")
	public final void method118() {
		if (field350 == 0 && field465 == 0) {
			field119[field111] = "Walk here";
			field260[field111] = 746;
			field258[field111] = field1326;
			field259[field111] = field1327;
			field111++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < FUTAQMCE.field699; var2++) {
			int var3 = FUTAQMCE.field700[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field203.method336(field131, var4, var5, var3) >= 0) {
					SIUJJQHQ var8 = SIUJJQHQ.method455(var7);
					if (var8.field1281 != null) {
						var8 = var8.method457();
					}

					if (var8 == null) {
						continue;
					}

					if (field350 == 1) {
						field119[field111] = "Use " + field354 + " with @cya@" + var8.field1254;
						field260[field111] = 31;
						field261[field111] = var3;
						field258[field111] = var4;
						field259[field111] = var5;
						field111++;
					} else if (field465 != 1) {
						if (var8.field1289 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1289[var9] != null) {
									field119[field111] = var8.field1289[var9] + " @cya@" + var8.field1254;

									if (var9 == 0) {
										field260[field111] = 948;
									}

									if (var9 == 1) {
										field260[field111] = 957;
									}

									if (var9 == 2) {
										field260[field111] = 941;
									}

									if (var9 == 3) {
										field260[field111] = 947;
									}

									if (var9 == 4) {
										field260[field111] = 1555;
									}

									field261[field111] = var3;
									field258[field111] = var4;
									field259[field111] = var5;
									field111++;
								}
							}
						}

						field119[field111] = "Examine @cya@" + var8.field1254;
						field260[field111] = 1595;
						field261[field111] = var8.field1270 << 14;
						field258[field111] = var4;
						field259[field111] = var5;
						field111++;
					} else if ((field467 & 0x4) == 4) {
						field119[field111] = field468 + " @cya@" + var8.field1254;
						field260[field111] = 591;
						field261[field111] = var3;
						field258[field111] = var4;
						field259[field111] = var5;
						field111++;
					}
				}

				if (var6 == 1) {
					FSNLAIJY var10 = field322[var7];
					if (var10.field631.field953 == 1 && (var10.field1472 & 0x7F) == 0x40 && (var10.field1473 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field323; var11++) {
							FSNLAIJY var12 = field322[field324[var11]];
							if (var12 != null && var10 != var12 && var12.field631.field953 == 1 && var10.field1472 == var12.field1472 && var10.field1473 == var12.field1473) {
								method116(var5, var12.field631, field324[var11], var4);
							}
						}

						for (int var13 = 0; var13 < field207; var13++) {
							OTTYZSZE var14 = field206[field208[var13]];
							if (var14 != null && var10.field1472 == var14.field1472 && var10.field1473 == var14.field1473) {
								method114(var14, var4, field208[var13], var5);
							}
						}
					}

					method116(var5, var10.field631, var7, var4);
				}

				if (var6 == 0) {
					OTTYZSZE var15 = field206[var7];
					if ((var15.field1472 & 0x7F) == 0x40 && (var15.field1473 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field323; var16++) {
							FSNLAIJY var17 = field322[field324[var16]];
							if (var17 != null && var17.field631.field953 == 1 && var15.field1472 == var17.field1472 && var15.field1473 == var17.field1473) {
								method116(var5, var17.field631, field324[var16], var4);
							}
						}

						for (int var18 = 0; var18 < field207; var18++) {
							OTTYZSZE var19 = field206[field208[var18]];
							if (var19 != null && var15 != var19 && var15.field1472 == var19.field1472 && var15.field1473 == var19.field1473) {
								method114(var19, var4, field208[var18], var5);
							}
						}
					}

					method114(var15, var4, var7, var5);
				}

				if (var6 == 3) {
					EWLVMFRK var20 = field112[field131][var4][var5];
					if (var20 != null) {
						for (MOPVFPSQ var21 = (MOPVFPSQ) var20.method202(); var21 != null; var21 = (MOPVFPSQ) var20.method204()) {
							AOLTHQTO var22 = AOLTHQTO.method13(var21.field909);
							if (field350 == 1) {
								field119[field111] = "Use " + field354 + " with @lre@" + var22.field43;
								field260[field111] = 358;
								field261[field111] = var21.field909;
								field258[field111] = var4;
								field259[field111] = var5;
								field111++;
							} else if (field465 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field60 != null && var22.field60[var23] != null) {
										field119[field111] = var22.field60[var23] + " @lre@" + var22.field43;

										if (var23 == 0) {
											field260[field111] = 410;
										}

										if (var23 == 1) {
											field260[field111] = 129;
										}

										if (var23 == 2) {
											field260[field111] = 790;
										}

										if (var23 == 3) {
											field260[field111] = 922;
										}

										if (var23 == 4) {
											field260[field111] = 579;
										}

										field261[field111] = var21.field909;
										field258[field111] = var4;
										field259[field111] = var5;
										field111++;
									} else if (var23 == 2) {
										field119[field111] = "Take @lre@" + var22.field43;
										field260[field111] = 790;
										field261[field111] = var21.field909;
										field258[field111] = var4;
										field259[field111] = var5;
										field111++;
									}
								}

								field119[field111] = "Examine @lre@" + var22.field43;
								field260[field111] = 1070;
								field261[field111] = var21.field909;
								field258[field111] = var4;
								field259[field111] = var5;
								field111++;
							} else if ((field467 & 0x1) == 1) {
								field119[field111] = field468 + " @lre@" + var22.field43;
								field260[field111] = 558;
								field261[field111] = var21.field909;
								field258[field111] = var4;
								field259[field111] = var5;
								field111++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method119() {
		if (field336 && field196 == 2 && UZSUQFDN.field1362 != field131) {
			field341.method588();
			field128.method466(151, "Loading - please wait.", 0, 257);
			field128.method466(150, "Loading - please wait.", 0xFFFFFF, 256);
			field341.method589(4, field1318, 4);
			field196 = 1;
			field349 = System.currentTimeMillis();
		}

		if (field196 == 1) {
			int var1 = method120();
			if (var1 != 0 && System.currentTimeMillis() - field349 > 360000L) {
				signlink.reporterror(field270 + " glcfb " + field504 + "," + var1 + "," + field336 + "," + field443[0] + "," + field329.method440() + "," + field131 + "," + field172 + "," + field173);
				field349 = System.currentTimeMillis();
			}
		}

		if (field196 == 2 && field472 != field131) {
			field472 = field131;
			method99(field131);
		}
	}

	@ObfuscatedName("client.n(B)I")
	public final int method120() {
		for (int var1 = 0; var1 < field263.length; var1++) {
			if (field263[var1] == null && field331[var1] != -1) {
				return -1;
			}

			if (field177[var1] == null && field332[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field263.length; var3++) {
			byte[] var4 = field177[var3];
			if (var4 != null) {
				int var5 = (field330[var3] >> 8) * 64 - field197;
				int var6 = (field330[var3] & 0xFF) * 64 - field198;
				if (field318) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= UZSUQFDN.method498(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field348) {
			return -4;
		} else {
			field196 = 2;
			UZSUQFDN.field1362 = field131;
			method100();
			field400.method523(255);
			return 0;
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method121() {
		field375 = true;
	}

	@ObfuscatedName("client.c(LXJCNBMKS;IZ)V")
	public final void method122(XJCNBMKS arg0, int arg1) {
		while (arg0.field1404 + 10 < arg1 * 8) {
			int var3 = arg0.method545(11);
			if (var3 == 2047) {
				break;
			}

			if (field206[var3] == null) {
				field206[var3] = new OTTYZSZE();
				if (field211[var3] != null) {
					field206[var3].method390(field211[var3]);
				}
			}

			field208[field207++] = var3;
			OTTYZSZE var4 = field206[var3];
			var4.field1434 = field376;
			int var5 = arg0.method545(1);
			int var6 = arg0.method545(1);
			if (var6 == 1) {
				field210[field209++] = var3;
			}

			int var7 = arg0.method545(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method545(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method585(field281.field1448[0] + var7, field281.field1449[0] + var8, var5 == 1);
		}

		arg0.method546();
	}

	@ObfuscatedName("client.B(I)V")
	public final void method123() {
		if (field196 == 2) {
			for (OCRHTPRV var1 = (OCRHTPRV) field192.method201(); var1 != null; var1 = (OCRHTPRV) field192.method203()) {
				if (var1.field998 > 0) {
					var1.field998--;
				}

				if (var1.field998 != 0) {
					if (var1.field1006 > 0) {
						var1.field1006--;
					}

					if (var1.field1006 == 0 && var1.field1001 >= 1 && var1.field1002 >= 1 && var1.field1001 <= 102 && var1.field1002 <= 102 && (var1.field1007 < 0 || UZSUQFDN.method500(var1.field1007, var1.field1009))) {
						method80(var1.field1007, var1.field999, var1.field1002, var1.field1009, var1.field1008, var1.field1001, var1.field1000);
						var1.field1006 = -1;

						if (var1.field1007 == var1.field1003 && var1.field1003 == -1) {
							var1.method396();
						} else if (var1.field1007 == var1.field1003 && var1.field1008 == var1.field1004 && var1.field1009 == var1.field1005) {
							var1.method396();
						}
					}
				} else if (var1.field1003 < 0 || UZSUQFDN.method500(var1.field1003, var1.field1005)) {
					method80(var1.field1003, var1.field999, var1.field1002, var1.field1005, var1.field1004, var1.field1001, var1.field1000);
					var1.method396();
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method124(long arg0) {
		if (arg0 != 0L) {
			if (field116 >= 100 && field122 != 1) {
				method26("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field116 >= 200) {
				method26("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = UWUPOZSY.method490(UWUPOZSY.method487(arg0));
				for (int var4 = 0; var4 < field116; var4++) {
					if (field359[var4] == arg0) {
						method26(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field383; var5++) {
					if (field273[var5] == arg0) {
						method26("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field281.field1038)) {
					field163[field116] = var3;
					field359[field116] = arg0;
					field305[field116] = 0;
					field116++;
					field320 = true;
					field400.method523(238);
					field400.method530(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method125() {
		if (field312 > 0) {
			method109();
		} else {
			field341.method588();
			field128.method466(144, "Connection lost", 0, 257);
			field128.method466(143, "Connection lost", 0xFFFFFF, 256);
			field128.method466(159, "Please wait - attempting to reestablish", 0, 257);
			field128.method466(158, "Please wait - attempting to reestablish", 0xFFFFFF, 256);
			field341.method589(4, field1318, 4);
			field442 = 0;
			field283 = 0;
			EUCYOSVT var1 = field190;
			field404 = false;
			field368 = 0;
			method84(field270, field271, true);

			if (!field404) {
				method109();
			}

			try {
				var1.method192();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method126() {
		int var1 = field412;
		int var2 = field413;
		int var3 = field414;
		int var4 = field415;
		int var5 = 0x5D5447;
		HQRNTLRZ.method284(var1, var2, var5, var3, var4);
		HQRNTLRZ.method284(var1 + 1, var2 + 1, 0, var3 - 2, 16);
		HQRNTLRZ.method285(var4 - 19, 0, var1 + 1, var3 - 2, var2 + 18);
		field129.method470(var1 + 3, "Choose Option", var5, var2 + 14);
		int var6 = field1326;
		int var7 = field1327;
		if (field411 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field411 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field411 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field111; var8++) {
			int var9 = (field111 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field129.method474(var9, var10, field119[var8], true, var1 + 3);
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method127() {
		if (field458 != 0) {
			int var1 = 0;
			if (field346 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field221[var2] != null) {
					int var3 = field219[var2];
					String var4 = field220[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field366 == 0 || field366 == 1 && method68(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1326 > 4 && field1327 - 4 > var8 - 10 && field1327 - 4 <= var8 + 3) {
							int var9 = field128.method468("From:  " + var4 + field221[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1326 < var9 + 4) {
								if (field423 >= 1) {
									field119[field111] = "Report abuse @whi@" + var4;
									field260[field111] = 2038;
									field111++;
								}

								field119[field111] = "Add ignore @whi@" + var4;
								field260[field111] = 2376;
								field111++;
								field119[field111] = "Add friend @whi@" + var4;
								field260[field111] = 2554;
								field111++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field366 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	public final void init() {
		field333 = Integer.parseInt(getParameter("nodeid"));
		field334 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method139();
		} else {
			method86();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field335 = false;
		} else {
			field335 = true;
		}

		method482(503, 765);
	}

	@ObfuscatedName("client.f(II)V")
	public final void method128(int arg0) {
		if (arg0 >= 0) {
			if (field218 != 0) {
				field218 = 0;
				field447 = true;
			}

			int var2 = field258[arg0];
			int var3 = field259[arg0];
			int var4 = field260[arg0];
			int var5 = field261[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 565) {
				field400.method523(129);
				field400.method525(var3);
				RWLOYYVC var6 = RWLOYYVC.field1135[var3];
				if (var6.field1154 != null && var6.field1154[0][0] == 5) {
					int var7 = var6.field1154[0][1];
					if (field524[var7] != var6.field1100[0]) {
						field524[var7] = var6.field1100[0];
						method155(var7);
						field320 = true;
					}
				}
			}

			if (var4 == 246) {
				FSNLAIJY var8 = field322[var5];
				if (var8 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var8.field1448[0], false, field281.field1449[0], var8.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(39);
					field400.method525(var5);
				}
			}

			if (var4 == 450) {
				FSNLAIJY var9 = field322[var5];
				if (var9 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var9.field1448[0], false, field281.field1449[0], var9.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(185);
					field400.method525(field351);
					field400.method557(field353);
					field400.method556(var5);
					field400.method557(field352);
				}
			}

			if (var4 == 551 && !field356) {
				field400.method523(58);
				field400.method525(var3);
				field356 = true;
			}

			if (var4 == 539) {
				RWLOYYVC var10 = RWLOYYVC.field1135[var3];
				boolean var11 = true;
				if (var10.field1143 > 0) {
					var11 = method48(var10);
				}

				if (var11) {
					field400.method523(129);
					field400.method525(var3);
				}
			}

			if (var4 == 916) {
				OTTYZSZE var12 = field206[var5];
				if (var12 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var12.field1448[0], false, field281.field1449[0], var12.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(163);
					field400.method556(var5);
				}
			}

			if (var4 == 1555) {
				method111(var5, var2, var3);
				field400.method523(59);
				field400.method557(var5 >> 14 & 0x7FFF);
				field400.method556(field197 + var2);
				field400.method558(field198 + var3);
			}

			if (var4 == 111) {
				field400.method523(122);
				field400.method556(var3);
				field400.method557(var2);
				field400.method558(var5);
				field416 = 0;
				field417 = var3;
				field418 = var2;
				field419 = 2;
				if (RWLOYYVC.field1135[var3].field1124 == field253) {
					field419 = 1;
				}

				if (RWLOYYVC.field1135[var3].field1124 == field229) {
					field419 = 3;
				}
			}

			if (var4 == 1569) {
				FSNLAIJY var13 = field322[var5];
				if (var13 != null) {
					NHTDEVDA var14 = var13.field631;
					if (var14.field948 != null) {
						var14 = var14.method364();
					}

					if (var14 != null) {
						String var15;
						if (var14.field939 == null) {
							var15 = "It's a " + var14.field970 + ".";
						} else {
							var15 = new String(var14.field939);
						}

						method26(var15, "", 0);
					}
				}
			}

			if (var4 == 1070) {
				AOLTHQTO var16 = AOLTHQTO.method13(var5);
				String var17;
				if (var16.field66 == null) {
					var17 = "It's a " + var16.field43 + ".";
				} else {
					var17 = new String(var16.field66);
				}

				method26(var17, "", 0);
			}

			if (var4 == 415) {
				FSNLAIJY var18 = field322[var5];
				if (var18 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var18.field1448[0], false, field281.field1449[0], var18.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(134);
					field400.method557(var5);
				}
			}

			if (var4 == 11) {
				FSNLAIJY var19 = field322[var5];
				if (var19 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var19.field1448[0], false, field281.field1449[0], var19.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(119);
					field400.method556(var5);
				}
			}

			if (var4 == 554 || var4 == 376 || var4 == 163 || var4 == 355) {
				String var20 = field119[arg0];
				int var21 = var20.indexOf("@whi@");
				if (var21 != -1) {
					long var22 = UWUPOZSY.method486(var20.substring(var21 + 5).trim());
					if (var4 == 554) {
						method124(var22);
					}

					if (var4 == 376) {
						method37(var22);
					}

					if (var4 == 163) {
						method54(var22);
					}

					if (var4 == 355) {
						method53(var22);
					}
				}
			}

			if (var4 == 31 && method111(var5, var2, var3)) {
				field400.method523(149);
				field400.method558(field353);
				field400.method556(field198 + var3);
				field400.method558(field197 + var2);
				field400.method525(var5 >> 14 & 0x7FFF);
				field400.method556(field352);
				field400.method525(field351);
			}

			if (var4 == 431) {
				OTTYZSZE var24 = field206[var5];
				if (var24 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var24.field1448[0], false, field281.field1449[0], var24.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(141);
					field400.method557(var5);
				}
			}

			if (var4 == 948) {
				method111(var5, var2, var3);
				field400.method523(130);
				field400.method557(var5 >> 14 & 0x7FFF);
				field400.method525(field197 + var2);
				field400.method558(field198 + var3);
			}

			if (var4 == 543 || var4 == 219) {
				String var25 = field119[arg0];
				int var26 = var25.indexOf("@whi@");
				if (var26 != -1) {
					var25 = var25.substring(var26 + 5).trim();
					String var27 = UWUPOZSY.method490(UWUPOZSY.method487(UWUPOZSY.method486(var25)));
					boolean var28 = false;
					for (int var29 = 0; var29 < field207; var29++) {
						OTTYZSZE var30 = field206[field208[var29]];
						if (var30 != null && var30.field1038 != null && var30.field1038.equalsIgnoreCase(var27)) {
							method82(1, 1, 2, 0, field281.field1448[0], var30.field1448[0], false, field281.field1449[0], var30.field1449[0], 0, 0);

							if (var4 == 543) {
								field400.method523(163);
								field400.method556(field208[var29]);
							}

							if (var4 == 219) {
								field400.method523(96);
								field400.method556(field208[var29]);
							}

							var28 = true;
							break;
						}
					}

					if (!var28) {
						method26("Unable to find " + var27, "", 0);
					}
				}
			}

			if (var4 == 941) {
				method111(var5, var2, var3);
				field400.method523(243);
				field400.method558(field197 + var2);
				field400.method557(var5 >> 14 & 0x7FFF);
				field400.method525(field198 + var3);
			}

			if (var4 == 173) {
				FSNLAIJY var31 = field322[var5];
				if (var31 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var31.field1448[0], false, field281.field1449[0], var31.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(200);
					field400.method525(var5);
				}
			}

			if (var4 == 308) {
				field194 += var2;
				if (field194 >= 51) {
					field400.method523(18);
					field400.method524(70);
					field194 = 0;
				}

				field400.method523(112);
				field400.method558(var2);
				field400.method556(var5);
				field400.method525(var3);
				field416 = 0;
				field417 = var3;
				field418 = var2;
				field419 = 2;
				if (RWLOYYVC.field1135[var3].field1124 == field253) {
					field419 = 1;
				}

				if (RWLOYYVC.field1135[var3].field1124 == field229) {
					field419 = 3;
				}
			}

			if (var4 == 790) {
				boolean var32 = method82(0, 0, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				if (!var32) {
					method82(1, 1, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				}

				field529 = field1333;
				field530 = field1334;
				field532 = 2;
				field531 = 0;

				if ((var2 & 0x3) == 0) {
					field469++;
				}

				if (field469 >= 79) {
					field400.method523(92);
					field400.method524(134);
					field469 = 0;
				}

				field400.method523(115);
				field400.method556(field197 + var2);
				field400.method525(field198 + var3);
				field400.method558(var5);
			}

			if (var4 == 902) {
				FSNLAIJY var34 = field322[var5];
				if (var34 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var34.field1448[0], false, field281.field1449[0], var34.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(109);
					field400.method525(var5);
					field400.method558(field466);
				}
			}

			if (var4 == 162) {
				field400.method523(34);
				field400.method556(var3);
				field400.method558(var2);
				field400.method558(field466);
				field400.method557(var5);
				field416 = 0;
				field417 = var3;
				field418 = var2;
				field419 = 2;
				if (RWLOYYVC.field1135[var3].field1124 == field253) {
					field419 = 1;
				}

				if (RWLOYYVC.field1135[var3].field1124 == field229) {
					field419 = 3;
				}
			}

			if (var4 == 410) {
				boolean var35 = method82(0, 0, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				if (!var35) {
					method82(1, 1, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				}

				field529 = field1333;
				field530 = field1334;
				field532 = 2;
				field531 = 0;
				field400.method523(53);
				field400.method525(field198 + var3);
				field400.method556(var5);
				field400.method558(field197 + var2);
			}

			if (var4 == 291) {
				OTTYZSZE var37 = field206[var5];
				if (var37 != null) {
					method82(1, 1, 2, 0, field281.field1448[0], var37.field1448[0], false, field281.field1449[0], var37.field1449[0], 0, 0);
					field529 = field1333;
					field530 = field1334;
					field532 = 2;
					field531 = 0;
					field400.method523(206);
					field400.method556(field352);
					field400.method558(field351);
					field400.method558(field353);
					field400.method525(var5);
				}
			}

			if (var4 == 579) {
				boolean var38 = method82(0, 0, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				if (!var38) {
					method82(1, 1, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				}

				field529 = field1333;
				field530 = field1334;
				field532 = 2;
				field531 = 0;
				field146++;
				if (field146 >= 96) {
					field400.method523(217);
					field400.method524(77);
					field146 = 0;
				}

				field400.method523(55);
				field400.method558(field198 + var3);
				field400.method556(field197 + var2);
				field400.method556(var5);
			}

			if (var4 == 1298) {
				AOLTHQTO var40 = AOLTHQTO.method13(var5);
				RWLOYYVC var41 = RWLOYYVC.field1135[var3];
				String var42;
				if (var41 != null && var41.field1115[var2] >= 100000) {
					var42 = var41.field1115[var2] + " x " + var40.field43;
				} else if (var40.field66 == null) {
					var42 = "It's a " + var40.field43 + ".";
				} else {
					var42 = new String(var40.field66);
				}

				method26(var42, "", 0);
			}

			if (var4 == 558) {
				boolean var43 = method82(0, 0, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				if (!var43) {
					method82(1, 1, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				}

				field529 = field1333;
				field530 = field1334;
				field532 = 2;
				field531 = 0;
				field400.method523(3);
				field400.method556(field466);
				field400.method556(var5);
				field400.method557(field198 + var3);
				field400.method557(field197 + var2);
			}

			if (var4 == 129) {
				boolean var45 = method82(0, 0, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				if (!var45) {
					method82(1, 1, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
				}

				field529 = field1333;
				field530 = field1334;
				field532 = 2;
				field531 = 0;
				field400.method523(38);
				field400.method557(field197 + var2);
				field400.method557(var5);
				field400.method557(field198 + var3);
			}

			if (var4 == 67) {
				field400.method523(145);
				field400.method556(var5);
				field400.method557(var2);
				field400.method558(var3);
				field416 = 0;
				field417 = var3;
				field418 = var2;
				field419 = 2;
				if (RWLOYYVC.field1135[var3].field1124 == field253) {
					field419 = 1;
				}

				if (RWLOYYVC.field1135[var3].field1124 == field229) {
					field419 = 3;
				}
			}

			if (var4 == 746) {
				if (field287) {
					field203.method344(var3 - 4, var2 - 4);
				} else {
					field203.method344(field1334 - 4, field1333 - 4);
				}
			}

			if (var4 == 6) {
				RWLOYYVC var47 = RWLOYYVC.field1135[var3];
				field465 = 1;
				field466 = var3;
				field467 = var47.field1137;
				field350 = 0;
				field320 = true;
				String var48 = var47.field1105;
				if (var48.indexOf(" ") != -1) {
					var48 = var48.substring(0, var48.indexOf(" "));
				}

				String var49 = var47.field1105;
				if (var49.indexOf(" ") != -1) {
					var49 = var49.substring(var49.indexOf(" ") + 1);
				}

				field468 = var48 + " " + var47.field1141 + " " + var49;

				if (field467 == 16) {
					field320 = true;
					field231 = 3;
					field517 = true;
				}
			} else {
				if (var4 == 38) {
					String var50 = field119[arg0];
					int var51 = var50.indexOf("@whi@");
					if (var51 != -1) {
						if (field253 == -1) {
							method63();
							field369 = var50.substring(var51 + 5).trim();
							field182 = false;

							for (int var52 = 0; var52 < RWLOYYVC.field1135.length; var52++) {
								if (RWLOYYVC.field1135[var52] != null && RWLOYYVC.field1135[var52].field1143 == 600) {
									field180 = field253 = RWLOYYVC.field1135[var52].field1124;
									break;
								}
							}
						} else {
							method26("Please close the interface you have open before using 'report abuse'", "", 0);
						}
					}
				}

				if (var4 == 957) {
					method111(var5, var2, var3);
					field400.method523(54);
					field400.method556(field198 + var3);
					field400.method556(var5 >> 14 & 0x7FFF);
					field400.method557(field197 + var2);
				}

				if (var4 == 986) {
					OTTYZSZE var53 = field206[var5];
					if (var53 != null) {
						method82(1, 1, 2, 0, field281.field1448[0], var53.field1448[0], false, field281.field1449[0], var53.field1449[0], 0, 0);
						field529 = field1333;
						field530 = field1334;
						field532 = 2;
						field531 = 0;
						field282++;
						if (field282 >= 133) {
							field400.method523(2);
							field400.method528(0);
							field282 = 0;
						}

						field400.method523(114);
						field400.method525(var5);
					}
				}

				if (var4 == 567) {
					FSNLAIJY var54 = field322[var5];
					if (var54 != null) {
						method82(1, 1, 2, 0, field281.field1448[0], var54.field1448[0], false, field281.field1449[0], var54.field1449[0], 0, 0);
						field529 = field1333;
						field530 = field1334;
						field532 = 2;
						field531 = 0;
						field400.method523(31);
						field400.method556(var5);
					}
				}

				if (var4 == 997) {
					field400.method523(136);
					field400.method558(var2);
					field400.method557(var5);
					field400.method558(var3);
					field416 = 0;
					field417 = var3;
					field418 = var2;
					field419 = 2;
					if (RWLOYYVC.field1135[var3].field1124 == field253) {
						field419 = 1;
					}

					if (RWLOYYVC.field1135[var3].field1124 == field229) {
						field419 = 3;
					}
				}

				if (var4 == 210) {
					method63();
				}

				if (var4 == 132) {
					OTTYZSZE var55 = field206[var5];
					if (var55 != null) {
						method82(1, 1, 2, 0, field281.field1448[0], var55.field1448[0], false, field281.field1449[0], var55.field1449[0], 0, 0);
						field529 = field1333;
						field530 = field1334;
						field532 = 2;
						field531 = 0;
						field400.method523(48);
						field400.method525(var5);
					}
				}

				if (var4 == 822) {
					OTTYZSZE var56 = field206[var5];
					if (var56 != null) {
						method82(1, 1, 2, 0, field281.field1448[0], var56.field1448[0], false, field281.field1449[0], var56.field1449[0], 0, 0);
						field529 = field1333;
						field530 = field1334;
						field532 = 2;
						field531 = 0;
						field400.method523(96);
						field400.method556(var5);
					}
				}

				if (var4 == 756) {
					field350 = 1;
					field351 = var2;
					field352 = var3;
					field353 = var5;
					field354 = AOLTHQTO.method13(var5).field43;
					field465 = 0;
					field320 = true;
				} else {
					if (var4 == 358) {
						boolean var57 = method82(0, 0, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
						if (!var57) {
							method82(1, 1, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
						}

						field529 = field1333;
						field530 = field1334;
						field532 = 2;
						field531 = 0;
						field400.method523(102);
						field400.method525(field351);
						field400.method557(field352);
						field400.method525(field353);
						field400.method525(field198 + var3);
						field400.method558(var5);
						field400.method558(field197 + var2);
					}

					if (var4 == 922) {
						boolean var59 = method82(0, 0, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
						if (!var59) {
							method82(1, 1, 2, 0, field281.field1448[0], var2, false, field281.field1449[0], var3, 0, 0);
						}

						field529 = field1333;
						field530 = field1334;
						field532 = 2;
						field531 = 0;
						field400.method523(221);
						field400.method557(var5);
						field400.method525(field197 + var2);
						field400.method557(field198 + var3);
					}

					if (var4 == 186) {
						field400.method523(32);
						field400.method557(var5);
						field400.method556(var3);
						field400.method525(var2);
						field416 = 0;
						field417 = var3;
						field418 = var2;
						field419 = 2;
						if (RWLOYYVC.field1135[var3].field1124 == field253) {
							field419 = 1;
						}

						if (RWLOYYVC.field1135[var3].field1124 == field229) {
							field419 = 3;
						}
					}

					if (var4 == 883) {
						if ((var2 & 0x3) == 0) {
							field338++;
						}

						if (field338 >= 69) {
							field400.method523(167);
							field400.method525(2525);
							field338 = 0;
						}

						field400.method523(237);
						field400.method558(var5);
						field400.method556(var2);
						field400.method557(var3);
						field416 = 0;
						field417 = var3;
						field418 = var2;
						field419 = 2;
						if (RWLOYYVC.field1135[var3].field1124 == field253) {
							field419 = 1;
						}

						if (RWLOYYVC.field1135[var3].field1124 == field229) {
							field419 = 3;
						}
					}

					if (var4 == 591 && method111(var5, var2, var3)) {
						field400.method523(127);
						field400.method556(field466);
						field400.method558(field198 + var3);
						field400.method557(field197 + var2);
						field400.method558(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 2) {
						field400.method523(132);
						field400.method556(var3);
						field400.method556(var5);
						field400.method556(var2);
						field416 = 0;
						field417 = var3;
						field418 = var2;
						field419 = 2;
						if (RWLOYYVC.field1135[var3].field1124 == field253) {
							field419 = 1;
						}

						if (RWLOYYVC.field1135[var3].field1124 == field229) {
							field419 = 3;
						}
					}

					if (var4 == 966) {
						field400.method523(124);
						field400.method556(var3);
						field400.method556(var2);
						field400.method557(var5);
						field416 = 0;
						field417 = var3;
						field418 = var2;
						field419 = 2;
						if (RWLOYYVC.field1135[var3].field1124 == field253) {
							field419 = 1;
						}

						if (RWLOYYVC.field1135[var3].field1124 == field229) {
							field419 = 3;
						}
					}

					if (var4 == 442) {
						field400.method523(172);
						field400.method558(var2);
						field400.method557(var5);
						field400.method558(var3);
						field416 = 0;
						field417 = var3;
						field418 = var2;
						field419 = 2;
						if (RWLOYYVC.field1135[var3].field1124 == field253) {
							field419 = 1;
						}

						if (RWLOYYVC.field1135[var3].field1124 == field229) {
							field419 = 3;
						}
					}

					if (var4 == 643) {
						String var61 = field119[arg0];
						int var62 = var61.indexOf("@whi@");
						if (var62 != -1) {
							long var63 = UWUPOZSY.method486(var61.substring(var62 + 5).trim());
							int var65 = -1;
							for (int var66 = 0; var66 < field116; var66++) {
								if (field359[var66] == var63) {
									var65 = var66;
									break;
								}
							}

							if (var65 != -1 && field305[var65] > 0) {
								field447 = true;
								field218 = 0;
								field243 = true;
								field365 = "";
								field380 = 3;
								field288 = field359[var65];
								field421 = "Enter message to send to " + field163[var65];
							}
						}
					}

					if (var4 == 373) {
						field400.method523(214);
						field400.method557(var5);
						field400.method558(var3);
						field400.method558(var2);
						field400.method525(field353);
						field400.method557(field352);
						field400.method558(field351);
						field416 = 0;
						field417 = var3;
						field418 = var2;
						field419 = 2;
						if (RWLOYYVC.field1135[var3].field1124 == field253) {
							field419 = 1;
						}

						if (RWLOYYVC.field1135[var3].field1124 == field229) {
							field419 = 3;
						}
					}

					if (var4 == 1595) {
						int var67 = var5 >> 14 & 0x7FFF;
						SIUJJQHQ var68 = SIUJJQHQ.method455(var67);
						String var69;
						if (var68.field1259 == null) {
							var69 = "It's a " + var68.field1254 + ".";
						} else {
							var69 = new String(var68.field1259);
						}

						method26(var69, "", 0);
					}

					if (var4 == 947) {
						method111(var5, var2, var3);
						field400.method523(125);
						field400.method525(field198 + var3);
						field400.method525(field197 + var2);
						field400.method525(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 522) {
						field400.method523(129);
						field400.method525(var3);
						RWLOYYVC var70 = RWLOYYVC.field1135[var3];
						if (var70.field1154 != null && var70.field1154[0][0] == 5) {
							int var71 = var70.field1154[0][1];
							field524[var71] = 1 - field524[var71];
							method155(var71);
							field320 = true;
						}
					}

					if (var4 == 108) {
						OTTYZSZE var72 = field206[var5];
						if (var72 != null) {
							method82(1, 1, 2, 0, field281.field1448[0], var72.field1448[0], false, field281.field1449[0], var72.field1449[0], 0, 0);
							field529 = field1333;
							field530 = field1334;
							field532 = 2;
							field531 = 0;
							field400.method523(84);
							field400.method556(var5);
							field400.method558(field466);
						}
					}

					if (var4 == 99) {
						if ((var5 & 0x3) == 0) {
							field136++;
						}

						if (field136 >= 117) {
							field400.method523(108);
							field400.method524(206);
							field136 = 0;
						}

						field400.method523(197);
						field400.method558(var2);
						field400.method558(var3);
						field400.method558(var5);
						field416 = 0;
						field417 = var3;
						field418 = var2;
						field419 = 2;
						if (RWLOYYVC.field1135[var3].field1124 == field253) {
							field419 = 1;
						}

						if (RWLOYYVC.field1135[var3].field1124 == field229) {
							field419 = 3;
						}
					}

					field350 = 0;
					field465 = 0;
					field320 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method129() {
		field426++;
		method135(true);
		method39(true);
		method135(false);
		method39(false);
		method98();
		method24();

		if (!field115) {
			int var1 = field185;
			if (field398 / 256 > var1) {
				var1 = field398 / 256;
			}

			if (field272[4] && field316[4] + 128 > var1) {
				var1 = field316[4] + 128;
			}

			int var2 = field487 + field186 & 0x7FF;
			method134(var2, field238, var1 * 3 + 600, method91(field281.field1473, field131, field281.field1472) - 50, var1, field239);
		}

		int var3;
		if (field115) {
			var3 = method90();
		} else {
			var3 = method89();
		}

		int var4 = field453;
		int var5 = field454;
		int var6 = field455;
		int var7 = field456;
		int var8 = field457;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field272[var9]) {
				int var10 = (int) (Math.random() * (field459[var9] * 2 + 1) + Math.sin(field257[var9] / 100.0D * field264[var9]) * field316[var9] - field459[var9]);
				if (var9 == 0) {
					field453 += var10;
				}

				if (var9 == 1) {
					field454 += var10;
				}

				if (var9 == 2) {
					field455 += var10;
				}

				if (var9 == 3) {
					field457 = field457 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field456 += var10;
					if (field456 < 128) {
						field456 = 128;
					}

					if (field456 > 383) {
						field456 = 383;
					}
				}
			}
		}

		int var11 = DQOLNIHT.field578;
		FUTAQMCE.field696 = true;
		FUTAQMCE.field699 = 0;
		FUTAQMCE.field697 = field1326 - 4;
		FUTAQMCE.field698 = field1327 - 4;
		HQRNTLRZ.method282();
		field203.method345(var3, field454, field453, field457, field455, field456);
		field203.method320();
		method21();
		method56();
		method160(var11);
		method79();
		field341.method589(4, field1318, 4);
		field453 = var4;
		field454 = var5;
		field455 = var6;
		field456 = var7;
		field457 = var8;
	}

	@ObfuscatedName("client.a(IILYGMSKJOQ;I)V")
	public final void method130(int arg0, int arg1, YGMSKJOQ arg2) {
		int var4 = field186 + field134 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = FUTAQMCE.field701[var4];
			int var7 = FUTAQMCE.field702[var4];
			var6 = var6 * 256 / (field294 + 256);
			var7 = var7 * 256 / (field294 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method582(field515, 83 - var9 - arg2.field1421 / 2 - 4, var8 + 94 - arg2.field1420 / 2 + 4);
			} else {
				arg2.method576(83 - var9 - arg2.field1421 / 2 - 4, var8 + 94 - arg2.field1420 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method131() {
		for (int var1 = -1; var1 < field207; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field205;
			} else {
				var2 = field208[var1];
			}

			OTTYZSZE var3 = field206[var2];
			if (var3 != null && var3.field1443 > 0) {
				var3.field1443--;
				if (var3.field1443 == 0) {
					var3.field1461 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field323; var4++) {
			int var5 = field324[var4];
			FSNLAIJY var6 = field322[var5];
			if (var6 != null && var6.field1443 > 0) {
				var6.field1443--;
				if (var6.field1443 == 0) {
					var6.field1461 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method132() {
		if (field291 == 0) {
			field119[0] = "Cancel";
			field260[0] = 1640;
			field111 = 1;
			method127();
			field124 = 0;

			if (field1326 > 4 && field1327 > 4 && field1326 < 516 && field1327 < 338) {
				if (field253 == -1) {
					method118();
				} else {
					method44(RWLOYYVC.field1135[field253], field1326, 0, field1327, 4, 4);
				}
			}

			if (field170 != field124) {
				field170 = field124;
			}

			field124 = 0;

			if (field1326 > 553 && field1327 > 205 && field1326 < 743 && field1327 < 466) {
				if (field139 != -1) {
					method44(RWLOYYVC.field1135[field139], field1326, 0, field1327, 553, 205);
				} else if (field137[field231] != -1) {
					method44(RWLOYYVC.field1135[field137[field231]], field1326, 0, field1327, 553, 205);
				}
			}

			if (field174 != field124) {
				field320 = true;
				field174 = field124;
			}

			field124 = 0;

			if (field1326 > 17 && field1327 > 357 && field1326 < 496 && field1327 < 453) {
				if (field229 != -1) {
					method44(RWLOYYVC.field1135[field229], field1326, 0, field1327, 17, 357);
				} else if (field1327 < 434 && field1326 < 426) {
					method113(field1326 - 17, field1327 - 357);
				}
			}

			if (field229 != -1 && field277 != field124) {
				field447 = true;
				field277 = field124;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field111 - 1; var2++) {
					if (field260[var2] < 1000 && field260[var2 + 1] > 1000) {
						String var3 = field119[var2];
						field119[var2] = field119[var2 + 1];
						field119[var2 + 1] = var3;
						int var4 = field260[var2];
						field260[var2] = field260[var2 + 1];
						field260[var2 + 1] = var4;
						int var5 = field258[var2];
						field258[var2] = field258[var2 + 1];
						field258[var2 + 1] = var5;
						int var6 = field259[var2];
						field259[var2] = field259[var2 + 1];
						field259[var2 + 1] = var6;
						int var7 = field261[var2];
						field261[var2] = field261[var2 + 1];
						field261[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method133(int arg0) {
		RWLOYYVC var2 = RWLOYYVC.field1135[arg0];
		for (int var3 = 0; var3 < var2.field1128.length && var2.field1128[var3] != -1; var3++) {
			RWLOYYVC var4 = RWLOYYVC.field1135[var2.field1128[var3]];
			if (var4.field1156 == 1) {
				method133(var4.field1145);
			}

			var4.field1152 = 0;
			var4.field1127 = 0;
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = FUTAQMCE.field701[var7];
			int var13 = FUTAQMCE.field702[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = FUTAQMCE.field701[var8];
			int var16 = FUTAQMCE.field702[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field453 = arg1 - var9;
		field454 = arg3 - var10;
		field455 = arg5 - var11;
		field456 = arg4;
		field457 = arg0;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method135(boolean arg0) {
		if (field281.field1472 >> 7 == field283 && field281.field1473 >> 7 == field284) {
			field283 = 0;
		}

		int var2 = field207;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			OTTYZSZE var4;
			int var5;
			if (arg0) {
				var4 = field281;
				var5 = field205 << 14;
			} else {
				var4 = field206[field208[var3]];
				var5 = field208[var3] << 14;
			}

			if (var4 != null && var4.method245()) {
				var4.field1034 = false;
				if ((field336 && field207 > 50 || field207 > 200) && !arg0 && var4.field1444 == var4.field1431) {
					var4.field1034 = true;
				}

				int var6 = var4.field1472 >> 7;
				int var7 = var4.field1473 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1028 == null || field376 < var4.field1023 || field376 >= var4.field1024) {
						if ((var4.field1472 & 0x7F) == 0x40 && (var4.field1473 & 0x7F) == 0x40) {
							if (field161[var6][var7] == field426) {
								continue;
							}

							field161[var6][var7] = field426;
						}

						var4.field1046 = method91(var4.field1473, field131, var4.field1472);
						field203.method317(var4.field1474, field131, var4.field1472, var4.field1473, 60, var4.field1046, var5, var4, var4.field1455);
					} else {
						var4.field1034 = false;
						var4.field1046 = method91(var4.field1473, field131, var4.field1472);
						field203.method318(var4.field1046, var4.field1043, var4.field1044, var4.field1472, var5, var4, var4.field1474, var4.field1473, field131, var4.field1041, var4.field1042, 60);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.s(Z)V")
	public final void method136() {
		field339.method588();
		DQOLNIHT.field569 = field159;
		field514.method166(0, 0);

		if (field139 != -1) {
			method158(RWLOYYVC.field1135[field139], 0, 0, 0);
		} else if (field137[field231] != -1) {
			method158(RWLOYYVC.field1135[field137[field231]], 0, 0, 0);
		}

		if (field287 && field411 == 1) {
			method126();
		}

		field339.method589(205, field1318, 553);
		field341.method588();
		DQOLNIHT.field569 = field160;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method137(String arg0) throws IOException {
		if (field402) {
			if (field496 != null) {
				try {
					field496.close();
				} catch (Exception var4) {
				}

				field496 = null;
			}

			field496 = method85(43595);
			field496.setSoTimeout(10000);
			InputStream var2 = field496.getInputStream();
			OutputStream var3 = field496.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.D(I)Z")
	public final boolean method138() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.E(I)V")
	public static final void method139() {
		KALHRUDX.field800 = true;
		DQOLNIHT.field558 = true;
		field336 = true;
		UZSUQFDN.field1359 = true;
		SIUJJQHQ.field1274 = true;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(ZZI)V")
	public final void method140(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method141() {
		for (int var1 = 0; var1 < field323; var1++) {
			int var2 = field324[var1];
			FSNLAIJY var3 = field322[var2];
			if (var3 != null) {
				method142(var3, var3.field631.field953);
			}
		}
	}

	@ObfuscatedName("client.a(LYHEHTOVP;IB)V")
	public final void method142(YHEHTOVP arg0, int arg1) {
		if (arg0.field1472 < 128 || arg0.field1473 < 128 || arg0.field1472 >= 13184 || arg0.field1473 >= 13184) {
			arg0.field1450 = -1;
			arg0.field1426 = -1;
			arg0.field1439 = 0;
			arg0.field1440 = 0;
			arg0.field1472 = arg0.field1448[0] * 128 + arg0.field1464 * 64;
			arg0.field1473 = arg0.field1449[0] * 128 + arg0.field1464 * 64;
			arg0.method587();
		}

		if (field281 == arg0 && (arg0.field1472 < 1536 || arg0.field1473 < 1536 || arg0.field1472 >= 11776 || arg0.field1473 >= 11776)) {
			arg0.field1450 = -1;
			arg0.field1426 = -1;
			arg0.field1439 = 0;
			arg0.field1440 = 0;
			arg0.field1472 = arg0.field1448[0] * 128 + arg0.field1464 * 64;
			arg0.field1473 = arg0.field1449[0] * 128 + arg0.field1464 * 64;
			arg0.method587();
		}

		if (arg0.field1439 > field376) {
			method143(arg0);
		} else if (arg0.field1440 >= field376) {
			method144(arg0);
		} else {
			method145(arg0);
		}

		method146(arg0);
		method147(arg0);
	}

	@ObfuscatedName("client.a(LYHEHTOVP;B)V")
	public final void method143(YHEHTOVP arg0) {
		int var2 = arg0.field1439 - field376;
		int var3 = arg0.field1464 * 64 + arg0.field1435 * 128;
		int var4 = arg0.field1464 * 64 + arg0.field1437 * 128;
		arg0.field1472 += (var3 - arg0.field1472) / var2;
		arg0.field1473 += (var4 - arg0.field1473) / var2;
		arg0.field1458 = 0;

		if (arg0.field1441 == 0) {
			arg0.field1447 = 1024;
		}

		if (arg0.field1441 == 1) {
			arg0.field1447 = 1536;
		}

		if (arg0.field1441 == 2) {
			arg0.field1447 = 0;
		}

		if (arg0.field1441 == 3) {
			arg0.field1447 = 512;
		}
	}

	@ObfuscatedName("client.a(LYHEHTOVP;I)V")
	public final void method144(YHEHTOVP arg0) {
		if (field376 == arg0.field1440 || arg0.field1450 == -1 || arg0.field1453 != 0 || arg0.field1452 + 1 > GMRGYXFL.field720[arg0.field1450].method277(arg0.field1451)) {
			int var2 = arg0.field1440 - arg0.field1439;
			int var3 = field376 - arg0.field1439;
			int var4 = arg0.field1464 * 64 + arg0.field1435 * 128;
			int var5 = arg0.field1464 * 64 + arg0.field1437 * 128;
			int var6 = arg0.field1464 * 64 + arg0.field1436 * 128;
			int var7 = arg0.field1464 * 64 + arg0.field1438 * 128;
			arg0.field1472 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1473 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1458 = 0;

		if (arg0.field1441 == 0) {
			arg0.field1447 = 1024;
		}

		if (arg0.field1441 == 1) {
			arg0.field1447 = 1536;
		}

		if (arg0.field1441 == 2) {
			arg0.field1447 = 0;
		}

		if (arg0.field1441 == 3) {
			arg0.field1447 = 512;
		}

		arg0.field1474 = arg0.field1447;
	}

	@ObfuscatedName("client.a(ILYHEHTOVP;)V")
	public final void method145(YHEHTOVP arg0) {
		arg0.field1444 = arg0.field1431;
		if (arg0.field1456 == 0) {
			arg0.field1458 = 0;
		} else {
			if (arg0.field1450 != -1 && arg0.field1453 == 0) {
				GMRGYXFL var2 = GMRGYXFL.field720[arg0.field1450];
				if (arg0.field1475 > 0 && var2.field732 == 0) {
					arg0.field1458++;
					return;
				}

				if (arg0.field1475 <= 0 && var2.field733 == 0) {
					arg0.field1458++;
					return;
				}
			}

			int var3 = arg0.field1472;
			int var4 = arg0.field1473;
			int var5 = arg0.field1448[arg0.field1456 - 1] * 128 + arg0.field1464 * 64;
			int var6 = arg0.field1449[arg0.field1456 - 1] * 128 + arg0.field1464 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1447 = 1280;
					} else if (var4 > var6) {
						arg0.field1447 = 1792;
					} else {
						arg0.field1447 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1447 = 768;
					} else if (var4 > var6) {
						arg0.field1447 = 256;
					} else {
						arg0.field1447 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1447 = 1024;
				} else {
					arg0.field1447 = 0;
				}

				int var7 = arg0.field1447 - arg0.field1474 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1466;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1465;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1468;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1467;
				}

				if (var8 == -1) {
					var8 = arg0.field1465;
				}

				arg0.field1444 = var8;
				int var9 = 4;
				if (arg0.field1474 != arg0.field1447 && arg0.field1460 == -1 && arg0.field1457 != 0) {
					var9 = 2;
				}

				if (arg0.field1456 > 2) {
					var9 = 6;
				}

				if (arg0.field1456 > 3) {
					var9 = 8;
				}

				if (arg0.field1458 > 0 && arg0.field1456 > 1) {
					var9 = 8;
					arg0.field1458--;
				}

				if (arg0.field1476[arg0.field1456 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1465 == arg0.field1444 && arg0.field1425 != -1) {
					arg0.field1444 = arg0.field1425;
				}

				if (var3 < var5) {
					arg0.field1472 += var9;
					if (arg0.field1472 > var5) {
						arg0.field1472 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1472 -= var9;
					if (arg0.field1472 < var5) {
						arg0.field1472 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1473 += var9;
					if (arg0.field1473 > var6) {
						arg0.field1473 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1473 -= var9;
					if (arg0.field1473 < var6) {
						arg0.field1473 = var6;
					}
				}

				if (arg0.field1472 == var5 && arg0.field1473 == var6) {
					arg0.field1456--;

					if (arg0.field1475 > 0) {
						arg0.field1475--;
						return;
					}
				}
			} else {
				arg0.field1472 = var5;
				arg0.field1473 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(LYHEHTOVP;I)V")
	public final void method146(YHEHTOVP arg0) {
		if (arg0.field1457 != 0) {
			if (arg0.field1460 != -1 && arg0.field1460 < 32768) {
				FSNLAIJY var2 = field322[arg0.field1460];
				if (var2 != null) {
					int var3 = arg0.field1472 - var2.field1472;
					int var4 = arg0.field1473 - var2.field1473;
					if (var3 != 0 || var4 != 0) {
						arg0.field1447 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1460 >= 32768) {
				int var5 = arg0.field1460 - 32768;
				if (field358 == var5) {
					var5 = field205;
				}

				OTTYZSZE var6 = field206[var5];
				if (var6 != null) {
					int var7 = arg0.field1472 - var6.field1472;
					int var8 = arg0.field1473 - var6.field1473;
					if (var7 != 0 || var8 != 0) {
						arg0.field1447 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1462 != 0 || arg0.field1463 != 0) && (arg0.field1456 == 0 || arg0.field1458 > 0)) {
				int var9 = arg0.field1472 - (arg0.field1462 - field197 - field197) * 64;
				int var10 = arg0.field1473 - (arg0.field1463 - field198 - field198) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1447 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1462 = 0;
				arg0.field1463 = 0;
			}

			int var11 = arg0.field1447 - arg0.field1474 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1457 || var11 > 2048 - arg0.field1457) {
					arg0.field1474 = arg0.field1447;
				} else if (var11 > 1024) {
					arg0.field1474 -= arg0.field1457;
				} else {
					arg0.field1474 += arg0.field1457;
				}

				arg0.field1474 &= 0x7FF;
				if (arg0.field1444 == arg0.field1431 && arg0.field1474 != arg0.field1447) {
					if (arg0.field1432 != -1) {
						arg0.field1444 = arg0.field1432;
						return;
					}

					arg0.field1444 = arg0.field1465;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILYHEHTOVP;)V")
	public final void method147(YHEHTOVP arg0) {
		arg0.field1455 = false;

		if (arg0.field1444 != -1) {
			GMRGYXFL var2 = GMRGYXFL.field720[arg0.field1444];
			arg0.field1446++;
			if (arg0.field1445 < var2.field721 && arg0.field1446 > var2.method277(arg0.field1445)) {
				arg0.field1446 = 0;
				arg0.field1445++;
			}

			if (arg0.field1445 >= var2.field721) {
				arg0.field1446 = 0;
				arg0.field1445 = 0;
			}
		}

		if (arg0.field1426 != -1 && field376 >= arg0.field1429) {
			if (arg0.field1427 < 0) {
				arg0.field1427 = 0;
			}

			GMRGYXFL var3 = VSBOWDVL.field1380[arg0.field1426].field1384;
			arg0.field1428++;
			while (arg0.field1427 < var3.field721 && arg0.field1428 > var3.method277(arg0.field1427)) {
				arg0.field1428 -= var3.method277(arg0.field1427);
				arg0.field1427++;
			}

			if (arg0.field1427 >= var3.field721 && (arg0.field1427 < 0 || arg0.field1427 >= var3.field721)) {
				arg0.field1426 = -1;
			}
		}

		if (arg0.field1450 != -1 && arg0.field1453 <= 1) {
			GMRGYXFL var4 = GMRGYXFL.field720[arg0.field1450];
			if (var4.field732 == 1 && arg0.field1475 > 0 && arg0.field1439 <= field376 && arg0.field1440 < field376) {
				arg0.field1453 = 1;
				return;
			}
		}

		if (arg0.field1450 != -1 && arg0.field1453 == 0) {
			GMRGYXFL var5 = GMRGYXFL.field720[arg0.field1450];
			arg0.field1452++;
			while (arg0.field1451 < var5.field721 && arg0.field1452 > var5.method277(arg0.field1451)) {
				arg0.field1452 -= var5.method277(arg0.field1451);
				arg0.field1451++;
			}

			if (arg0.field1451 >= var5.field721) {
				arg0.field1451 -= var5.field725;
				arg0.field1454++;
				if (arg0.field1454 >= var5.field731) {
					arg0.field1450 = -1;
				}

				if (arg0.field1451 < 0 || arg0.field1451 >= var5.field721) {
					arg0.field1450 = -1;
				}
			}

			arg0.field1455 = var5.field727;
		}

		if (arg0.field1453 > 0) {
			arg0.field1453--;
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method148() {
		if (field375) {
			field375 = false;
			field474.method589(4, field1318, 0);
			field475.method589(357, field1318, 0);
			field476.method589(4, field1318, 722);
			field477.method589(205, field1318, 743);
			field478.method589(0, field1318, 0);
			field479.method589(4, field1318, 516);
			field480.method589(205, field1318, 516);
			field481.method589(357, field1318, 496);
			field482.method589(338, field1318, 0);
			field320 = true;
			field447 = true;
			field517 = true;
			field155 = true;

			if (field196 != 2) {
				field341.method589(4, field1318, 4);
				field340.method589(4, field1318, 550);
			}
		}

		if (field196 == 2) {
			method129();
		}

		if (field287 && field411 == 1) {
			field320 = true;
		}

		if (field139 != -1) {
			boolean var1 = method57(field139, field274);
			if (var1) {
				field320 = true;
			}
		}

		if (field419 == 2) {
			field320 = true;
		}

		if (field291 == 2) {
			field320 = true;
		}

		if (field320) {
			method136();
			field320 = false;
		}

		if (field229 == -1) {
			field471.field1113 = field495 - field118 - 77;

			if (field1326 > 448 && field1326 < 560 && field1327 > 332) {
				method29(field471, 463, 0, false, field1327 - 357, 77, field495, field1326 - 17);
			}

			int var2 = field495 - field471.field1113 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field495 - 77) {
				var2 = field495 - 77;
			}

			if (field118 != var2) {
				field118 = var2;
				field447 = true;
			}

			field191++;
			if (field191 > 1297) {
				field191 = 0;
				field400.method523(116);
				field400.method524(0);
				int var3 = field400.field1403;
				field400.method524(174);

				if ((int) (Math.random() * 2.0D) == 0) {
					field400.method524(213);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field400.method525(35720);
				}

				field400.method525((int) (Math.random() * 65536.0D));
				field400.method525((int) (Math.random() * 65536.0D));
				field400.method524((int) (Math.random() * 256.0D));
				field400.method525(47094);
				field400.method524(200);

				if ((int) (Math.random() * 2.0D) == 0) {
					field400.method524(242);
				}

				field400.method525(13108);
				field400.method533(field400.field1403 - var3);
			}
		}

		if (field229 != -1) {
			boolean var4 = method57(field229, field274);
			if (var4) {
				field447 = true;
			}
		}

		if (field419 == 3) {
			field447 = true;
		}

		if (field291 == 3) {
			field447 = true;
		}

		if (field525 != null) {
			field447 = true;
		}

		if (field287 && field411 == 2) {
			field447 = true;
		}

		if (field447) {
			method47();
			field447 = false;
		}

		if (field196 == 2) {
			method41();
			field340.method589(4, field1318, 550);
		}

		if (field114 != -1) {
			field517 = true;
		}

		if (field517) {
			if (field114 != -1 && field231 == field114) {
				field114 = -1;
				field400.method523(199);
				field400.method524(field231);
			}

			field517 = false;
			field166.method588();
			field429.method166(0, 0);

			if (field139 == -1) {
				if (field137[field231] != -1) {
					if (field231 == 0) {
						field213.method166(10, 22);
					}

					if (field231 == 1) {
						field214.method166(8, 54);
					}

					if (field231 == 2) {
						field214.method166(8, 82);
					}

					if (field231 == 3) {
						field215.method166(8, 110);
					}

					if (field231 == 4) {
						field217.method166(8, 153);
					}

					if (field231 == 5) {
						field217.method166(8, 181);
					}

					if (field231 == 6) {
						field216.method166(9, 209);
					}
				}

				if (field137[0] != -1 && (field114 != 0 || field376 % 20 < 10)) {
					field470[0].method166(13, 29);
				}

				if (field137[1] != -1 && (field114 != 1 || field376 % 20 < 10)) {
					field470[1].method166(11, 53);
				}

				if (field137[2] != -1 && (field114 != 2 || field376 % 20 < 10)) {
					field470[2].method166(11, 82);
				}

				if (field137[3] != -1 && (field114 != 3 || field376 % 20 < 10)) {
					field470[3].method166(12, 115);
				}

				if (field137[4] != -1 && (field114 != 4 || field376 % 20 < 10)) {
					field470[4].method166(13, 153);
				}

				if (field137[5] != -1 && (field114 != 5 || field376 % 20 < 10)) {
					field470[5].method166(11, 180);
				}

				if (field137[6] != -1 && (field114 != 6 || field376 % 20 < 10)) {
					field470[6].method166(13, 208);
				}
			}

			field166.method589(160, field1318, 516);
			field165.method588();
			field428.method166(0, 0);

			if (field139 == -1) {
				if (field137[field231] != -1) {
					if (field231 == 7) {
						field506.method166(0, 42);
					}

					if (field231 == 8) {
						field507.method166(0, 74);
					}

					if (field231 == 9) {
						field507.method166(0, 102);
					}

					if (field231 == 10) {
						field508.method166(1, 130);
					}

					if (field231 == 11) {
						field510.method166(0, 173);
					}

					if (field231 == 12) {
						field510.method166(0, 201);
					}

					if (field231 == 13) {
						field509.method166(0, 229);
					}
				}

				if (field137[8] != -1 && (field114 != 8 || field376 % 20 < 10)) {
					field470[7].method166(2, 74);
				}

				if (field137[9] != -1 && (field114 != 9 || field376 % 20 < 10)) {
					field470[8].method166(3, 102);
				}

				if (field137[10] != -1 && (field114 != 10 || field376 % 20 < 10)) {
					field470[9].method166(4, 137);
				}

				if (field137[11] != -1 && (field114 != 11 || field376 % 20 < 10)) {
					field470[10].method166(2, 174);
				}

				if (field137[12] != -1 && (field114 != 12 || field376 % 20 < 10)) {
					field470[11].method166(2, 201);
				}

				if (field137[13] != -1 && (field114 != 13 || field376 % 20 < 10)) {
					field470[12].method166(2, 226);
				}
			}

			field165.method589(466, field1318, 496);
			field341.method588();
		}

		if (field155) {
			field155 = false;
			field164.method588();
			field427.method166(0, 0);
			field128.method467(55, "Public chat", true, 0xFFFFFF, 28);

			if (field473 == 0) {
				field128.method467(55, "On", true, 0xFF00, 41);
			}

			if (field473 == 1) {
				field128.method467(55, "Friends", true, 0xFFFF00, 41);
			}

			if (field473 == 2) {
				field128.method467(55, "Off", true, 0xFF0000, 41);
			}

			if (field473 == 3) {
				field128.method467(55, "Hide", true, 0xFFFF, 41);
			}

			field128.method467(184, "Private chat", true, 0xFFFFFF, 28);

			if (field366 == 0) {
				field128.method467(184, "On", true, 0xFF00, 41);
			}

			if (field366 == 1) {
				field128.method467(184, "Friends", true, 0xFFFF00, 41);
			}

			if (field366 == 2) {
				field128.method467(184, "Off", true, 0xFF0000, 41);
			}

			field128.method467(324, "Trade/compete", true, 0xFFFFFF, 28);

			if (field162 == 0) {
				field128.method467(324, "On", true, 0xFF00, 41);
			}

			if (field162 == 1) {
				field128.method467(324, "Friends", true, 0xFFFF00, 41);
			}

			if (field162 == 2) {
				field128.method467(324, "Off", true, 0xFF0000, 41);
			}

			field128.method467(458, "Report abuse", true, 0xFFFFFF, 33);
			field164.method589(453, field1318, 0);
			field341.method588();
		}

		field274 = 0;
	}

	@ObfuscatedName("client.c(ZI)Ljava/lang/String;")
	public static final String method149(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void method150(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.a(LXJCNBMKS;II)V")
	public final void method151(XJCNBMKS arg0, int arg1) {
		for (int var3 = 0; var3 < field209; var3++) {
			int var4 = field210[var3];
			OTTYZSZE var5 = field206[var4];
			int var6 = arg0.method534();
			if ((var6 & 0x10) != 0) {
				var6 += arg0.method534() << 8;
			}

			method105(var5, arg0, var6, var4);
		}
	}

	@ObfuscatedName("client.b(ILXJCNBMKS;I)V")
	public final void method152(int arg0, XJCNBMKS arg1) {
		if (arg0 == 72) {
			int var3 = arg1.method552();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field491[var4];
			int var7 = arg1.method536();
			int var8 = arg1.method534();
			int var9 = (var8 >> 4 & 0x7) + field249;
			int var10 = (var8 & 0x7) + field250;
			if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
				int var11 = field313[field131][var9][var10];
				int var12 = field313[field131][var9 + 1][var10];
				int var13 = field313[field131][var9 + 1][var10 + 1];
				int var14 = field313[field131][var9][var10 + 1];
				if (var6 == 0) {
					CJZFVOBU var15 = field203.method328(var9, var10, field131);
					if (var15 != null) {
						int var16 = var15.field107 >> 14 & 0x7FFF;
						if (var4 == 2) {
							var15.field105 = new ACEWFDYF(var11, var12, var5 + 4, 2, var7, var16, var13, false, var14);
							var15.field106 = new ACEWFDYF(var11, var12, var5 + 1 & 0x3, 2, var7, var16, var13, false, var14);
						} else {
							var15.field105 = new ACEWFDYF(var11, var12, var5, var4, var7, var16, var13, false, var14);
						}
					}
				}

				if (var6 == 1) {
					COKTOJEL var17 = field203.method329(var10, field131, var9);
					if (var17 != null) {
						var17.field538 = new ACEWFDYF(var11, var12, 0, 4, var7, var17.field539 >> 14 & 0x7FFF, var13, false, var14);
					}
				}

				if (var6 == 2) {
					GJZDEXHZ var18 = field203.method330(field131, var9, var10);

					if (var4 == 11) {
						var4 = 10;
					}

					if (var18 != null) {
						var18.field709 = new ACEWFDYF(var11, var12, var5, var4, var7, var18.field717 >> 14 & 0x7FFF, var13, false, var14);
					}
				}

				if (var6 == 3) {
					NTKRPJBD var19 = field203.method331(var9, field131, var10);
					if (var19 != null) {
						var19.field980 = new ACEWFDYF(var11, var12, var5, 22, var7, var19.field981 >> 14 & 0x7FFF, var13, false, var14);
					}
				}
			}
		} else if (arg0 == 35) {
			int var20 = arg1.method534();
			int var21 = (var20 >> 4 & 0x7) + field249;
			int var22 = (var20 & 0x7) + field250;
			int var23 = arg1.method536();
			int var24 = arg1.method536();
			int var25 = arg1.method536();
			if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
				EWLVMFRK var26 = field112[field131][var21][var22];
				if (var26 != null) {
					for (MOPVFPSQ var27 = (MOPVFPSQ) var26.method201(); var27 != null; var27 = (MOPVFPSQ) var26.method203()) {
						if ((var23 & 0x7FFF) == var27.field909 && var27.field908 == var24) {
							var27.field908 = var25;
							break;
						}
					}

					method93(var21, var22);
				}
			}
		} else {
			if (arg0 == 159) {
				int var28 = arg1.method534();
				int var29 = (var28 >> 4 & 0x7) + field249;
				int var30 = (var28 & 0x7) + field250;
				byte var31 = arg1.method555();
				int var32 = arg1.method553();
				int var33 = var32 >> 2;
				int var34 = var32 & 0x3;
				int var35 = field491[var33];
				int var36 = arg1.method560();
				byte var37 = arg1.method555();
				byte var38 = arg1.method535();
				int var39 = arg1.method536();
				int var40 = arg1.method561();
				byte var41 = arg1.method535();
				int var42 = arg1.method561();
				OTTYZSZE var43;
				if (field358 == var42) {
					var43 = field281;
				} else {
					var43 = field206[var42];
				}

				if (var43 != null) {
					SIUJJQHQ var44 = SIUJJQHQ.method455(var39);
					int var45 = field313[field131][var29][var30];
					int var46 = field313[field131][var29 + 1][var30];
					int var47 = field313[field131][var29 + 1][var30 + 1];
					int var48 = field313[field131][var29][var30 + 1];
					FUTAQMCE var49 = var44.method456(var33, var34, var45, var46, var47, var48, -1);
					if (var49 != null) {
						method50(var29, 0, 0, field131, var36 + 1, var35, -1, var40 + 1, var30);
						var43.field1023 = field376 + var40;
						var43.field1024 = field376 + var36;
						var43.field1028 = var49;
						int var50 = var44.field1265;
						int var51 = var44.field1256;
						if (var34 == 1 || var34 == 3) {
							var50 = var44.field1256;
							var51 = var44.field1265;
						}

						var43.field1025 = var29 * 128 + var50 * 64;
						var43.field1027 = var30 * 128 + var51 * 64;
						var43.field1026 = method91(var43.field1027, field131, var43.field1025);

						if (var38 > var41) {
							byte var52 = var38;
							var38 = var41;
							var41 = var52;
						}

						if (var37 > var31) {
							byte var53 = var37;
							var37 = var31;
							var31 = var53;
						}

						var43.field1041 = var29 + var38;
						var43.field1043 = var29 + var41;
						var43.field1042 = var30 + var37;
						var43.field1044 = var30 + var31;
					}
				}
			}

			if (arg0 == 61) {
				int var54 = arg1.method534();
				int var55 = (var54 >> 4 & 0x7) + field249;
				int var56 = (var54 & 0x7) + field250;
				int var57 = arg1.method560();
				int var58 = arg1.method561();
				if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
					MOPVFPSQ var59 = new MOPVFPSQ();
					var59.field909 = var58;
					var59.field908 = var57;

					if (field112[field131][var55][var56] == null) {
						field112[field131][var55][var56] = new EWLVMFRK();
					}

					field112[field131][var55][var56].method198(var59);
					method93(var55, var56);
				}
			} else if (arg0 == 102) {
				int var60 = arg1.method553();
				int var61 = var60 >> 2;
				int var62 = var60 & 0x3;
				int var63 = field491[var61];
				int var64 = arg1.method561();
				int var65 = arg1.method553();
				int var66 = (var65 >> 4 & 0x7) + field249;
				int var67 = (var65 & 0x7) + field250;
				if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
					method50(var66, var62, var61, field131, -1, var63, var64, 0, var67);
				}
			} else if (arg0 == 128) {
				int var68 = arg1.method534();
				int var69 = (var68 >> 4 & 0x7) + field249;
				int var70 = (var68 & 0x7) + field250;
				int var71 = var69 + arg1.method535();
				int var72 = var70 + arg1.method535();
				int var73 = arg1.method537();
				int var74 = arg1.method536();
				int var75 = arg1.method534() * 4;
				int var76 = arg1.method534() * 4;
				int var77 = arg1.method536();
				int var78 = arg1.method536();
				int var79 = arg1.method534();
				int var80 = arg1.method534();
				if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var74 != 0xFFFF) {
					var69 = var69 * 128 + 64;
					var70 = var70 * 128 + 64;
					var71 = var71 * 128 + 64;
					var72 = var72 * 128 + 64;
					QOQPOLAC var81 = new QOQPOLAC(var80, var79, field376 + var77, var74, method91(var70, field131, var69) - var75, var73, field376 + var78, field131, var76, var70, var69);
					var81.method403(var71, var72, method91(var72, field131, var71) - var76, field376 + var77);
					field409.method198(var81);
				}
			} else if (arg0 == 26) {
				int var82 = arg1.method536();
				int var83 = arg1.method561();
				int var84 = arg1.method554();
				int var85 = (var84 >> 4 & 0x7) + field249;
				int var86 = (var84 & 0x7) + field250;
				int var87 = arg1.method559();
				if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && field358 != var87) {
					MOPVFPSQ var88 = new MOPVFPSQ();
					var88.field909 = var82;
					var88.field908 = var83;

					if (field112[field131][var85][var86] == null) {
						field112[field131][var85][var86] = new EWLVMFRK();
					}

					field112[field131][var85][var86].method198(var88);
					method93(var85, var86);
				}
			} else if (arg0 == 251) {
				int var89 = arg1.method534();
				int var90 = (var89 >> 4 & 0x7) + field249;
				int var91 = (var89 & 0x7) + field250;
				int var92 = arg1.method553();
				int var93 = var92 >> 2;
				int var94 = var92 & 0x3;
				int var95 = field491[var93];
				if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
					method50(var90, var94, var93, field131, -1, var95, -1, 0, var91);
				}
			} else if (arg0 == 37) {
				int var96 = arg1.method552();
				int var97 = (var96 >> 4 & 0x7) + field249;
				int var98 = (var96 & 0x7) + field250;
				int var99 = arg1.method536();
				if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
					EWLVMFRK var100 = field112[field131][var97][var98];
					if (var100 != null) {
						for (MOPVFPSQ var101 = (MOPVFPSQ) var100.method201(); var101 != null; var101 = (MOPVFPSQ) var100.method203()) {
							if ((var99 & 0x7FFF) == var101.field909) {
								var101.method396();
								break;
							}
						}

						if (var100.method201() == null) {
							field112[field131][var97][var98] = null;
						}

						method93(var97, var98);
					}
				}
			} else if (arg0 == 80) {
				int var102 = arg1.method534();
				int var103 = (var102 >> 4 & 0x7) + field249;
				int var104 = (var102 & 0x7) + field250;
				int var105 = arg1.method536();
				int var106 = arg1.method534();
				int var107 = arg1.method536();
				if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
					var103 = var103 * 128 + 64;
					var104 = var104 * 128 + 64;
					JQLDEMYI var108 = new JQLDEMYI(method91(var104, field131, var103) - var106, var107, field376, var105, field131, var103, var104);
					field372.method198(var108);
				}
			} else if (arg0 == 240) {
				int var109 = arg1.method534();
				int var110 = (var109 >> 4 & 0x7) + field249;
				int var111 = (var109 & 0x7) + field250;
				int var112 = arg1.method536();
				int var113 = arg1.method534();
				int var114 = var113 >> 4 & 0xF;
				int var115 = var113 & 0x7;
				if (field281.field1448[0] >= var110 - var114 && field281.field1448[0] <= var110 + var114 && field281.field1449[0] >= var111 - var114 && field281.field1449[0] <= var111 + var114 && field109 && !field336 && field492 < 50) {
					field360[field492] = var112;
					field485[field492] = var115;
					field505[field492] = IXJIDLUT.field747[var112];
					field492++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILDEITBGVL;)V")
	public final void method153(DEITBGVL arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field235.length; var3++) {
			field235[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field235[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field236[var9] = (field235[var9 - 1] + field235[var9 + 1] + field235[var9 - 128] + field235[var9 + 128]) / 4;
				}
			}

			int[] var10 = field235;
			field235 = field236;
			field236 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field544; var12++) {
				for (int var13 = 0; var13 < arg0.field543; var13++) {
					if (arg0.field541[var11++] != 0) {
						int var14 = var13 + arg0.field545 + 16;
						int var15 = var12 + arg0.field546 + 16;
						int var16 = (var15 << 7) + var14;
						field235[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method154(boolean arg0) {
		method22();
		field298.method588();
		field306.method166(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field497 == 0) {
			int var4 = var3 / 2 + 80;
			field127.method467(var2 / 2, field329.field1216, true, 0x75A9A9, var4);
			int var5 = var3 / 2 - 20;
			field129.method467(var2 / 2, "Welcome to RuneScape", true, 0xFFFF00, var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field307.method166(var7 - 20, var6 - 73);
			field129.method467(var6, "New User", true, 0xFFFFFF, var7 + 5);
			int var8 = var2 / 2 + 80;
			field307.method166(var7 - 20, var8 - 73);
			field129.method467(var8, "Existing User", true, 0xFFFFFF, var7 + 5);
		}

		if (field497 == 2) {
			int var9 = var3 / 2 - 40;
			if (field444.length() > 0) {
				field129.method467(var2 / 2, field444, true, 0xFFFF00, var9 - 15);
				field129.method467(var2 / 2, field445, true, 0xFFFF00, var9);
				var9 += 30;
			} else {
				field129.method467(var2 / 2, field445, true, 0xFFFF00, var9 - 7);
				var9 += 30;
			}

			field129.method474(var9, 0xFFFFFF, "Username: " + field270 + (field222 == 0 & field376 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 90);
			var9 += 15;
			field129.method474(var9, 0xFFFFFF, "Password: " + UWUPOZSY.method491(field271) + (field222 == 1 & field376 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 88);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field307.method166(var11 - 20, var10 - 73);
				field129.method467(var10, "Login", true, 0xFFFFFF, var11 + 5);
				int var12 = var2 / 2 + 80;
				field307.method166(var11 - 20, var12 - 73);
				field129.method467(var12, "Cancel", true, 0xFFFFFF, var11 + 5);
			}
		}

		if (field497 == 3) {
			field129.method467(var2 / 2, "Create a free account", true, 0xFFFF00, var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field129.method467(var2 / 2, "To create a new account you need to", true, 0xFFFFFF, var13);
			var13 += 15;
			field129.method467(var2 / 2, "go back to the main RuneScape webpage", true, 0xFFFFFF, var13);
			var13 += 15;
			field129.method467(var2 / 2, "and choose the red 'create account'", true, 0xFFFFFF, var13);
			var13 += 15;
			field129.method467(var2 / 2, "button at the top right of that page.", true, 0xFFFFFF, var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field307.method166(var15 - 20, var14 - 73);
			field129.method467(var14, "Cancel", true, 0xFFFFFF, var15 + 5);
		}

		field298.method589(171, field1318, 202);

		if (field375) {
			field375 = false;
			field296.method589(0, field1318, 128);
			field297.method589(371, field1318, 202);
			field301.method589(265, field1318, 0);
			field302.method589(265, field1318, 562);
			field303.method589(171, field1318, 128);
			field304.method589(171, field1318, 562);
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method155(int arg0) {
		int var2 = NYAYDXBO.field984[arg0].field992;
		if (var2 != 0) {
			int var3 = field524[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					DQOLNIHT.method179(0.9D);
				}

				if (var3 == 2) {
					DQOLNIHT.method179(0.8D);
				}

				if (var3 == 3) {
					DQOLNIHT.method179(0.7D);
				}

				if (var3 == 4) {
					DQOLNIHT.method179(0.6D);
				}

				AOLTHQTO.field79.method299();
				field375 = true;
			}

			if (var2 == 3) {
				boolean var4 = field167;

				if (var3 == 0) {
					method140(field167, 0);
					field167 = true;
				}

				if (var3 == 1) {
					method140(field167, -400);
					field167 = true;
				}

				if (var3 == 2) {
					method140(field167, -800);
					field167 = true;
				}

				if (var3 == 3) {
					method140(field167, -1200);
					field167 = true;
				}

				if (var3 == 4) {
					field167 = false;
				}

				if (field167 != var4 && !field336) {
					if (field167) {
						field377 = field511;
						field378 = true;
						field329.method430(2, field377);
					} else {
						method96();
					}

					field484 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field109 = true;
					method157(0);
				}

				if (var3 == 1) {
					field109 = true;
					method157(-400);
				}

				if (var3 == 2) {
					field109 = true;
					method157(-800);
				}

				if (var3 == 3) {
					field109 = true;
					method157(-1200);
				}

				if (var3 == 4) {
					field109 = false;
				}
			}

			if (var2 == 5) {
				field489 = var3;
			}

			if (var2 == 6) {
				field268 = var3;
			}

			if (var2 == 8) {
				field458 = var3;
				field447 = true;
			}

			if (var2 == 9) {
				field195 = var3;
			}
		}
	}

	@ObfuscatedName("client.t(Z)V")
	public final void method156() {
		while (true) {
			ZLBJQGSS var1 = field329.method437();
			if (var1 == null) {
				return;
			}

			if (var1.field1484 == 0) {
				FUTAQMCE.method248(var1.field1485, var1.field1487);

				if ((field329.method439(var1.field1485) & 0x62) != 0) {
					field320 = true;

					if (field229 != -1) {
						field447 = true;
					}
				}
			}

			if (var1.field1484 == 1 && var1.field1487 != null) {
				RYVJCVCB.method425(var1.field1487);
			}

			if (var1.field1484 == 2 && field377 == var1.field1485 && var1.field1487 != null) {
				method150(field378, var1.field1487);
			}

			if (var1.field1484 == 3 && field196 == 1) {
				for (int var2 = 0; var2 < field263.length; var2++) {
					if (field331[var2] == var1.field1485) {
						field263[var2] = var1.field1487;

						if (var1.field1487 == null) {
							field331[var2] = -1;
						}

						break;
					}

					if (field332[var2] == var1.field1485) {
						field177[var2] = var1.field1487;

						if (var1.field1487 == null) {
							field332[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1484 == 93 && field329.method443(var1.field1485)) {
				UZSUQFDN.method506(field329, new XJCNBMKS(var1.field1487));
			}
		}
	}

	@ObfuscatedName("client.e(ZI)V")
	public final void method157(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(LRWLOYYVC;IIIB)V")
	public final void method158(RWLOYYVC arg0, int arg1, int arg2, int arg3) {
		if (arg0.field1156 == 0 && arg0.field1128 != null && (!arg0.field1099 || field170 == arg0.field1145 || field174 == arg0.field1145 || field277 == arg0.field1145)) {
			int var5 = HQRNTLRZ.field741;
			int var6 = HQRNTLRZ.field739;
			int var7 = HQRNTLRZ.field742;
			int var8 = HQRNTLRZ.field740;
			HQRNTLRZ.method281(arg2, arg3, arg0.field1142 + arg2, arg0.field1133 + arg3);
			int var9 = arg0.field1128.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field1120[var10] + arg2;
				int var12 = arg0.field1095[var10] + arg3 - arg1;
				RWLOYYVC var13 = RWLOYYVC.field1135[arg0.field1128[var10]];
				var11 += var13.field1132;
				var12 += var13.field1130;

				if (var13.field1143 > 0) {
					method101(var13);
				}

				if (var13.field1156 == 0) {
					if (var13.field1113 > var13.field1138 - var13.field1133) {
						var13.field1113 = var13.field1138 - var13.field1133;
					}

					if (var13.field1113 < 0) {
						var13.field1113 = 0;
					}

					method158(var13, var13.field1113, var11, var12);

					if (var13.field1138 > var13.field1133) {
						method62(var13.field1113, var13.field1133, var13.field1142 + var11, var12, var13.field1138);
					}
				} else if (var13.field1156 != 1) {
					if (var13.field1156 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1133; var15++) {
							for (int var16 = 0; var16 < var13.field1142; var16++) {
								int var17 = (var13.field1116 + 32) * var16 + var11;
								int var18 = (var13.field1136 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1103[var14];
									var18 += var13.field1109[var14];
								}

								if (var13.field1153[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1153[var14] - 1;
									if (var17 > HQRNTLRZ.field741 - 32 && var17 < HQRNTLRZ.field742 && var18 > HQRNTLRZ.field739 - 32 && var18 < HQRNTLRZ.field740 || field291 != 0 && field290 == var14) {
										int var22 = 0;
										if (field350 == 1 && field351 == var14 && field352 == var13.field1145) {
											var22 = 0xFFFFFF;
										}

										YGMSKJOQ var23 = AOLTHQTO.method8(var21, var13.field1115[var14], var22);
										if (var23 != null) {
											if (field291 != 0 && field290 == var14 && field289 == var13.field1145) {
												var19 = field1326 - field292;
												var20 = field1327 - field293;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field178 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method578(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < HQRNTLRZ.field739 && arg0.field1113 > 0) {
													int var24 = (HQRNTLRZ.field739 - var18 - var20) * field274 / 3;
													if (var24 > field274 * 10) {
														var24 = field274 * 10;
													}

													if (var24 > arg0.field1113) {
														var24 = arg0.field1113;
													}

													arg0.field1113 -= var24;
													field293 += var24;
												}

												if (var18 + var20 + 32 > HQRNTLRZ.field740 && arg0.field1113 < arg0.field1138 - arg0.field1133) {
													int var25 = (var18 + var20 + 32 - HQRNTLRZ.field740) * field274 / 3;
													if (var25 > field274 * 10) {
														var25 = field274 * 10;
													}

													if (var25 > arg0.field1138 - arg0.field1133 - arg0.field1113) {
														var25 = arg0.field1138 - arg0.field1133 - arg0.field1113;
													}

													arg0.field1113 += var25;
													field293 -= var25;
												}
											} else if (field419 != 0 && field418 == var14 && field417 == var13.field1145) {
												var23.method578(var18, var17, 128);
											} else {
												var23.method576(var18, var17);
											}

											if (var23.field1420 == 33 || var13.field1115[var14] != 1) {
												int var26 = var13.field1115[var14];
												field127.method470(var17 + var19 + 1, method149(var26), 0, var18 + var20 + 10);
												field127.method470(var17 + var19, method149(var26), 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field1097 != null && var14 < 20) {
									YGMSKJOQ var27 = var13.field1097[var14];
									if (var27 != null) {
										var27.method576(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1156 == 3) {
						boolean var28 = false;
						if (field277 == var13.field1145 || field174 == var13.field1145 || field170 == var13.field1145) {
							var28 = true;
						}

						int var29;
						if (method159(var13)) {
							var29 = var13.field1110;
							if (var28 && var13.field1104 != 0) {
								var29 = var13.field1104;
							}
						} else {
							var29 = var13.field1096;
							if (var28 && var13.field1118 != 0) {
								var29 = var13.field1118;
							}
						}

						if (var13.field1140 == 0) {
							if (var13.field1144) {
								HQRNTLRZ.method284(var11, var12, var29, var13.field1142, var13.field1133);
							} else {
								HQRNTLRZ.method285(var13.field1133, var29, var11, var13.field1142, var12);
							}
						} else if (var13.field1144) {
							HQRNTLRZ.method283(var29, var13.field1142, var12, 256 - (var13.field1140 & 0xFF), var11, var13.field1133);
						} else {
							HQRNTLRZ.method286(var13.field1133, var29, 256 - (var13.field1140 & 0xFF), var13.field1142, var12, var11);
						}
					} else if (var13.field1156 == 4) {
						UMCYZJWP var30 = var13.field1134;
						String var31 = var13.field1117;
						boolean var32 = false;
						if (field277 == var13.field1145 || field174 == var13.field1145 || field170 == var13.field1145) {
							var32 = true;
						}

						int var33;
						if (method159(var13)) {
							var33 = var13.field1110;
							if (var32 && var13.field1104 != 0) {
								var33 = var13.field1104;
							}

							if (var13.field1151.length() > 0) {
								var31 = var13.field1151;
							}
						} else {
							var33 = var13.field1096;
							if (var32 && var13.field1118 != 0) {
								var33 = var13.field1118;
							}
						}

						if (var13.field1150 == 6 && field356) {
							var31 = "Please wait...";
							var33 = var13.field1096;
						}

						if (HQRNTLRZ.field737 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1307 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method112(method77(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method112(method77(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method112(method77(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method112(method77(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method112(method77(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1098) {
								var30.method467(var13.field1142 / 2 + var11, var41, var13.field1111, var33, var34);
							} else {
								var30.method474(var34, var33, var41, var13.field1111, var11);
							}

							var34 += var30.field1307;
						}
					} else if (var13.field1156 == 5) {
						YGMSKJOQ var42;
						if (method159(var13)) {
							var42 = var13.field1139;
						} else {
							var42 = var13.field1148;
						}

						if (var42 != null) {
							var42.method576(var12, var11);
						}
					} else if (var13.field1156 == 6) {
						int var43 = DQOLNIHT.field563;
						int var44 = DQOLNIHT.field564;
						DQOLNIHT.field563 = var13.field1142 / 2 + var11;
						DQOLNIHT.field564 = var13.field1133 / 2 + var12;
						int var45 = DQOLNIHT.field567[var13.field1122] * var13.field1121 >> 16;
						int var46 = DQOLNIHT.field568[var13.field1122] * var13.field1121 >> 16;
						boolean var47 = method159(var13);
						int var48;
						if (var47) {
							var48 = var13.field1126;
						} else {
							var48 = var13.field1125;
						}

						FUTAQMCE var49;
						if (var48 == -1) {
							var49 = var13.method415(var47, -1, -1);
						} else {
							GMRGYXFL var50 = GMRGYXFL.field720[var48];
							var49 = var13.method415(var47, var50.field723[var13.field1152], var50.field722[var13.field1152]);
						}

						if (var49 != null) {
							var49.method270(0, var13.field1123, 0, var13.field1122, 0, var45, var46);
						}

						DQOLNIHT.field563 = var43;
						DQOLNIHT.field564 = var44;
					} else if (var13.field1156 == 7) {
						UMCYZJWP var51 = var13.field1134;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field1133; var53++) {
							for (int var54 = 0; var54 < var13.field1142; var54++) {
								if (var13.field1153[var52] > 0) {
									AOLTHQTO var55 = AOLTHQTO.method13(var13.field1153[var52] - 1);
									String var56 = var55.field43;
									if (var55.field65 || var13.field1115[var52] != 1) {
										var56 = var56 + " x" + method117(var13.field1115[var52]);
									}

									int var57 = (var13.field1116 + 115) * var54 + var11;
									int var58 = (var13.field1136 + 12) * var53 + var12;
									if (var13.field1098) {
										var51.method467(var13.field1142 / 2 + var57, var56, var13.field1111, var13.field1096, var58);
									} else {
										var51.method474(var58, var13.field1096, var56, var13.field1111, var57);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			HQRNTLRZ.method281(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("client.b(ZLRWLOYYVC;)Z")
	public final boolean method159(RWLOYYVC arg0) {
		if (arg0.field1108 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1108.length; var2++) {
			int var3 = method77(var2, arg0);
			int var4 = arg0.field1100[var2];
			if (arg0.field1108[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1108[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1108[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.h(II)V")
	public final void method160(int arg0) {
		if (!field336) {
			if (DQOLNIHT.field577[17] >= arg0) {
				DEITBGVL var2 = DQOLNIHT.field571[17];
				int var3 = var2.field544 * var2.field543 - 1;
				int var4 = field274 * var2.field543 * 2;
				byte[] var5 = var2.field541;
				byte[] var6 = field242;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field541 = var6;
				field242 = var5;
				DQOLNIHT.method177(17);
			}

			if (DQOLNIHT.field577[24] >= arg0) {
				DEITBGVL var8 = DQOLNIHT.field571[24];
				int var9 = var8.field544 * var8.field543 - 1;
				int var10 = field274 * var8.field543 * 2;
				byte[] var11 = var8.field541;
				byte[] var12 = field242;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field541 = var12;
				field242 = var11;
				DQOLNIHT.method177(24);
			}

			if (DQOLNIHT.field577[34] >= arg0) {
				DEITBGVL var14 = DQOLNIHT.field571[34];
				int var15 = var14.field544 * var14.field543 - 1;
				int var16 = field274 * var14.field543 * 2;
				byte[] var17 = var14.field541;
				byte[] var18 = field242;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field541 = var18;
				field242 = var17;
				DQOLNIHT.method177(34);
				return;
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field121[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field232[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
