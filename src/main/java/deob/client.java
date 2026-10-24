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
public final class client extends BTXFPMEV {

	@ObfuscatedName("client.O")
	public int[] field101 = new int[33];

	@ObfuscatedName("client.P")
	public int[] field102 = new int[7];

	@ObfuscatedName("client.S")
	public int[] field104 = new int[50];

	@ObfuscatedName("client.T")
	public final int field105 = 100;

	@ObfuscatedName("client.U")
	public int[] field106 = new int[100];

	@ObfuscatedName("client.hb")
	public int field118 = 0x23201B;

	@ObfuscatedName("client.jb")
	public int[] field120 = new int[1000];

	@ObfuscatedName("client.qb")
	public int[] field125 = new int[5];

	@ObfuscatedName("client.xb")
	public int field131 = 78;

	@ObfuscatedName("client.yb")
	public boolean field132 = false;

	@ObfuscatedName("client.Bb")
	public String field134 = "";

	@ObfuscatedName("client.Jb")
	public int field142 = -1;

	@ObfuscatedName("client.Ob")
	public JHKSAGUC field147 = JHKSAGUC.method294(1);

	@ObfuscatedName("client.Rb")
	public int field150 = -1;

	@ObfuscatedName("client.ac")
	public DLNMSHLT[] field159 = new DLNMSHLT[100];

	@ObfuscatedName("client.dc")
	public int[][][] field161 = new int[4][13][13];

	@ObfuscatedName("client.fc")
	public boolean field163 = false;

	@ObfuscatedName("client.gc")
	public int[] field164 = new int[50];

	@ObfuscatedName("client.ic")
	public int field166 = 2;

	@ObfuscatedName("client.jc")
	public int field167 = 0x332D25;

	@ObfuscatedName("client.mc")
	public int[] field168 = new int[5];

	@ObfuscatedName("client.oc")
	public boolean field170 = false;

	@ObfuscatedName("client.pc")
	public boolean field171 = false;

	@ObfuscatedName("client.vc")
	public int[] field175 = new int[1000];

	@ObfuscatedName("client.wc")
	public int[] field176 = new int[1000];

	@ObfuscatedName("client.Lc")
	public byte[] field190 = new byte[16384];

	@ObfuscatedName("client.Pc")
	public boolean field194 = false;

	@ObfuscatedName("client.Qc")
	public int field195 = -1;

	@ObfuscatedName("client.Rc")
	public OUZUCGGU field196 = new OUZUCGGU();

	@ObfuscatedName("client.Sc")
	public final int[] field197 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Tc")
	public int field198 = 0x766654;

	@ObfuscatedName("client.bd")
	public String field206 = "";

	@ObfuscatedName("client.cd")
	public String field207 = "";

	@ObfuscatedName("client.gd")
	public int field210 = -1;

	@ObfuscatedName("client.hd")
	public int field211 = 2048;

	@ObfuscatedName("client.id")
	public int field212 = 2047;

	@ObfuscatedName("client.jd")
	public FVFJZZXQ[] field213 = new FVFJZZXQ[field211];

	@ObfuscatedName("client.ld")
	public int[] field215 = new int[field211];

	@ObfuscatedName("client.nd")
	public int[] field217 = new int[field211];

	@ObfuscatedName("client.od")
	public JHKSAGUC[] field218 = new JHKSAGUC[field211];

	@ObfuscatedName("client.pd")
	public JHKSAGUC field219 = JHKSAGUC.method294(1);

	@ObfuscatedName("client.vd")
	public volatile boolean field225 = false;

	@ObfuscatedName("client.Fd")
	public int field235 = -1;

	@ObfuscatedName("client.Jd")
	public boolean field237 = false;

	@ObfuscatedName("client.Qd")
	public boolean field243 = false;

	@ObfuscatedName("client.Sd")
	public int[] field245 = new int[EALUQMKU.field564];

	@ObfuscatedName("client.Vd")
	public boolean field248 = true;

	@ObfuscatedName("client.Wd")
	public TNOPEJNZ field249 = new TNOPEJNZ();

	@ObfuscatedName("client.Xd")
	public int[] field250 = new int[5];

	@ObfuscatedName("client.Yd")
	public int[] field251 = new int[9];

	@ObfuscatedName("client.Zd")
	public int[] field252 = new int[33];

	@ObfuscatedName("client.be")
	public boolean field254 = false;

	@ObfuscatedName("client.ce")
	public int[] field255 = new int[151];

	@ObfuscatedName("client.ee")
	public boolean field256 = false;

	@ObfuscatedName("client.fe")
	public boolean field257 = false;

	@ObfuscatedName("client.ge")
	public int field258 = -1;

	@ObfuscatedName("client.oe")
	public boolean field265 = false;

	@ObfuscatedName("client.ue")
	public int field271 = -1;

	@ObfuscatedName("client.ye")
	public int field273 = 2;

	@ObfuscatedName("client.Ae")
	public boolean field275 = false;

	@ObfuscatedName("client.Be")
	public String field276 = "";

	@ObfuscatedName("client.Ie")
	public int[] field281 = new int[256];

	@ObfuscatedName("client.Le")
	public JHKSAGUC field284 = JHKSAGUC.method294(1);

	@ObfuscatedName("client.Re")
	public int[] field290 = new int[2000];

	@ObfuscatedName("client.Se")
	public String field291 = "";

	@ObfuscatedName("client.Te")
	public String field292 = "";

	@ObfuscatedName("client.Xe")
	public String[] field295 = new String[200];

	@ObfuscatedName("client.cf")
	public int[][] field300 = new int[104][104];

	@ObfuscatedName("client.ff")
	public KQOBJHBO[] field302 = new KQOBJHBO[5];

	@ObfuscatedName("client.mf")
	public DLNMSHLT[] field308 = new DLNMSHLT[1000];

	@ObfuscatedName("client.sf")
	public boolean field314 = true;

	@ObfuscatedName("client.uf")
	public int field316 = 50;

	@ObfuscatedName("client.vf")
	public int[] field317 = new int[field316];

	@ObfuscatedName("client.wf")
	public int[] field318 = new int[field316];

	@ObfuscatedName("client.xf")
	public int[] field319 = new int[field316];

	@ObfuscatedName("client.yf")
	public int[] field320 = new int[field316];

	@ObfuscatedName("client.zf")
	public int[] field321 = new int[field316];

	@ObfuscatedName("client.Af")
	public int[] field322 = new int[field316];

	@ObfuscatedName("client.Bf")
	public int[] field323 = new int[field316];

	@ObfuscatedName("client.Cf")
	public String[] field324 = new String[field316];

	@ObfuscatedName("client.Of")
	public YAPSNHGU[] field335 = new YAPSNHGU[2];

	@ObfuscatedName("client.Qf")
	public boolean field337 = false;

	@ObfuscatedName("client.Rf")
	public YAPSNHGU[] field338 = new YAPSNHGU[13];

	@ObfuscatedName("client.Xf")
	public int[] field342 = new int[EALUQMKU.field564];

	@ObfuscatedName("client.Yf")
	public int[] field343 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Zf")
	public int field344 = 0x4D4233;

	@ObfuscatedName("client.gg")
	public int field351 = -1;

	@ObfuscatedName("client.hg")
	public int field352 = -1;

	@ObfuscatedName("client.ig")
	public boolean field353 = true;

	@ObfuscatedName("client.lg")
	public int field356 = 3;

	@ObfuscatedName("client.rg")
	public int[] field362 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.xg")
	public int[] field366 = new int[50];

	@ObfuscatedName("client.zg")
	public int field368 = -1;

	@ObfuscatedName("client.Ag")
	public long[] field369 = new long[100];

	@ObfuscatedName("client.Qg")
	public int[] field381 = new int[5];

	@ObfuscatedName("client.Tg")
	public JHKSAGUC field382 = new JHKSAGUC(new byte[5000]);

	@ObfuscatedName("client.Ug")
	public NLPNWUNL[] field383 = new NLPNWUNL[16384];

	@ObfuscatedName("client.Wg")
	public int[] field385 = new int[16384];

	@ObfuscatedName("client.ah")
	public YAPSNHGU[] field388 = new YAPSNHGU[100];

	@ObfuscatedName("client.dh")
	public int field391 = 1;

	@ObfuscatedName("client.eh")
	public String[] field392 = new String[500];

	@ObfuscatedName("client.fh")
	public volatile boolean field393 = false;

	@ObfuscatedName("client.oh")
	public boolean field400 = false;

	@ObfuscatedName("client.qh")
	public OUZUCGGU field402 = new OUZUCGGU();

	@ObfuscatedName("client.rh")
	public boolean field403 = false;

	@ObfuscatedName("client.Ah")
	public int[] field412 = new int[500];

	@ObfuscatedName("client.Bh")
	public int[] field413 = new int[500];

	@ObfuscatedName("client.Ch")
	public int[] field414 = new int[500];

	@ObfuscatedName("client.Dh")
	public int[] field415 = new int[500];

	@ObfuscatedName("client.Gh")
	public int[] field418 = new int[2000];

	@ObfuscatedName("client.Jh")
	public boolean field421 = true;

	@ObfuscatedName("client.Mh")
	public DLNMSHLT[] field424 = new DLNMSHLT[8];

	@ObfuscatedName("client.Nh")
	public int[] field425 = new int[EALUQMKU.field564];

	@ObfuscatedName("client.Oh")
	public int field426 = 128;

	@ObfuscatedName("client.Th")
	public int[] field431 = new int[5];

	@ObfuscatedName("client.Uh")
	public DLNMSHLT[] field432 = new DLNMSHLT[20];

	@ObfuscatedName("client.Wh")
	public boolean field433 = false;

	@ObfuscatedName("client.Xh")
	public int[] field434 = new int[151];

	@ObfuscatedName("client.Yh")
	public OUZUCGGU[][][] field435 = new OUZUCGGU[4][104][104];

	@ObfuscatedName("client.Zh")
	public KFLNJHKB[] field436 = new KFLNJHKB[4];

	@ObfuscatedName("client.hi")
	public boolean field444 = false;

	@ObfuscatedName("client.ii")
	public String field445 = "";

	@ObfuscatedName("client.ji")
	public int[] field446 = new int[200];

	@ObfuscatedName("client.ki")
	public DLNMSHLT[] field447 = new DLNMSHLT[20];

	@ObfuscatedName("client.li")
	public long[] field448 = new long[200];

	@ObfuscatedName("client.oi")
	public boolean field449 = false;

	@ObfuscatedName("client.pi")
	public boolean field450 = true;

	@ObfuscatedName("client.qi")
	public int field451 = -1;

	@ObfuscatedName("client.ri")
	public int field452 = -1;

	@ObfuscatedName("client.ui")
	public int[] field455 = new int[100];

	@ObfuscatedName("client.vi")
	public String[] field456 = new String[100];

	@ObfuscatedName("client.wi")
	public String[] field457 = new String[100];

	@ObfuscatedName("client.Bi")
	public int[][] field462 = new int[104][104];

	@ObfuscatedName("client.Ii")
	public int field468 = 2;

	@ObfuscatedName("client.Oi")
	public int[][] field474 = new int[104][104];

	@ObfuscatedName("client.Pi")
	public String field475 = "";

	@ObfuscatedName("client.Qi")
	public int[] field476 = new int[4000];

	@ObfuscatedName("client.Ri")
	public int[] field477 = new int[4000];

	@ObfuscatedName("client.Ti")
	public volatile boolean field479 = false;

	@ObfuscatedName("client.Vi")
	public CRC32 field481 = new CRC32();

	@ObfuscatedName("client.aj")
	public int field486 = -1;

	@ObfuscatedName("client.ej")
	public int field490 = 1;

	@ObfuscatedName("client.kj")
	public String field496 = "";

	@ObfuscatedName("client.mj")
	public boolean[] field497 = new boolean[5];

	@ObfuscatedName("client.nj")
	public boolean field498 = false;

	@ObfuscatedName("client.tj")
	public int field502 = -1;

	@ObfuscatedName("client.Dj")
	public boolean field512 = false;

	@ObfuscatedName("client.Ej")
	public String[] field513 = new String[5];

	@ObfuscatedName("client.Fj")
	public boolean[] field514 = new boolean[5];

	@ObfuscatedName("client.Hj")
	public OUZUCGGU field516 = new OUZUCGGU();

	@ObfuscatedName("client.Jj")
	public boolean field517 = false;

	@ObfuscatedName("client.Kj")
	public boolean field518 = false;

	@ObfuscatedName("client.Md")
	public static BigInteger field240 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.ze")
	public static final int[][] field274 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Ue")
	public static String field293 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ye")
	public static int[] field296 = new int[99];

	@ObfuscatedName("client.Dg")
	public static int field372 = 10;

	@ObfuscatedName("client.Fg")
	public static boolean field374 = true;

	@ObfuscatedName("client.ph")
	public static BigInteger field401 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.sh")
	public static final int[] field404 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.rj")
	public static int[] field500 = new int[32];

	@ObfuscatedName("client.N")
	public static int field100;

	@ObfuscatedName("client.R")
	public int field103;

	@ObfuscatedName("client.gb")
	public int field117;

	@ObfuscatedName("client.ib")
	public int field119;

	@ObfuscatedName("client.kb")
	public static int field121;

	@ObfuscatedName("client.lb")
	public int field122;

	@ObfuscatedName("client.mb")
	public int field123;

	@ObfuscatedName("client.Ab")
	public int field133;

	@ObfuscatedName("client.Eb")
	public int field137;

	@ObfuscatedName("client.Fb")
	public int field138;

	@ObfuscatedName("client.Gb")
	public int field139;

	@ObfuscatedName("client.Hb")
	public int field140;

	@ObfuscatedName("client.Ib")
	public int field141;

	@ObfuscatedName("client.Lb")
	public int field144;

	@ObfuscatedName("client.Mb")
	public int field145;

	@ObfuscatedName("client.Nb")
	public int field146;

	@ObfuscatedName("client.Sb")
	public int field151;

	@ObfuscatedName("client.Tb")
	public int field152;

	@ObfuscatedName("client.Ub")
	public int field153;

	@ObfuscatedName("client.Vb")
	public int field154;

	@ObfuscatedName("client.Wb")
	public int field155;

	@ObfuscatedName("client.cc")
	public int field160;

	@ObfuscatedName("client.hc")
	public int field165;

	@ObfuscatedName("client.sc")
	public int field173;

	@ObfuscatedName("client.uc")
	public int field174;

	@ObfuscatedName("client.Ic")
	public int field187;

	@ObfuscatedName("client.Jc")
	public int field188;

	@ObfuscatedName("client.Kc")
	public int field189;

	@ObfuscatedName("client.Mc")
	public int field191;

	@ObfuscatedName("client.Nc")
	public int field192;

	@ObfuscatedName("client.Oc")
	public int field193;

	@ObfuscatedName("client.Uc")
	public static int field199;

	@ObfuscatedName("client.Wc")
	public int field201;

	@ObfuscatedName("client.Xc")
	public int field202;

	@ObfuscatedName("client.Yc")
	public int field203;

	@ObfuscatedName("client.Zc")
	public int field204;

	@ObfuscatedName("client.ad")
	public int field205;

	@ObfuscatedName("client.ed")
	public int field208;

	@ObfuscatedName("client.fd")
	public int field209;

	@ObfuscatedName("client.kd")
	public int field214;

	@ObfuscatedName("client.md")
	public int field216;

	@ObfuscatedName("client.qd")
	public int field220;

	@ObfuscatedName("client.rd")
	public int field221;

	@ObfuscatedName("client.sd")
	public int field222;

	@ObfuscatedName("client.ud")
	public int field224;

	@ObfuscatedName("client.Dd")
	public int field233;

	@ObfuscatedName("client.Ed")
	public int field234;

	@ObfuscatedName("client.Gd")
	public static int field236;

	@ObfuscatedName("client.Kd")
	public int field238;

	@ObfuscatedName("client.Ld")
	public static int field239;

	@ObfuscatedName("client.Od")
	public static int field241;

	@ObfuscatedName("client.Pd")
	public int field242;

	@ObfuscatedName("client.Ud")
	public int field247;

	@ObfuscatedName("client.ne")
	public static int field264;

	@ObfuscatedName("client.pe")
	public int field266;

	@ObfuscatedName("client.qe")
	public int field267;

	@ObfuscatedName("client.se")
	public int field269;

	@ObfuscatedName("client.te")
	public int field270;

	@ObfuscatedName("client.xe")
	public int field272;

	@ObfuscatedName("client.Ce")
	public int field277;

	@ObfuscatedName("client.De")
	public int field278;

	@ObfuscatedName("client.He")
	public int field280;

	@ObfuscatedName("client.Je")
	public int field282;

	@ObfuscatedName("client.Ke")
	public int field283;

	@ObfuscatedName("client.Me")
	public int field285;

	@ObfuscatedName("client.Ne")
	public int field286;

	@ObfuscatedName("client.Oe")
	public int field287;

	@ObfuscatedName("client.Pe")
	public int field288;

	@ObfuscatedName("client.Qe")
	public int field289;

	@ObfuscatedName("client.Ze")
	public int field297;

	@ObfuscatedName("client.af")
	public int field298;

	@ObfuscatedName("client.bf")
	public int field299;

	@ObfuscatedName("client.df")
	public int field301;

	@ObfuscatedName("client.nf")
	public int field309;

	@ObfuscatedName("client.tf")
	public int field315;

	@ObfuscatedName("client.Gf")
	public static int field327;

	@ObfuscatedName("client.If")
	public int field329;

	@ObfuscatedName("client.Jf")
	public int field330;

	@ObfuscatedName("client.Kf")
	public int field331;

	@ObfuscatedName("client.Lf")
	public int field332;

	@ObfuscatedName("client.Mf")
	public int field333;

	@ObfuscatedName("client.Nf")
	public static int field334;

	@ObfuscatedName("client.Pf")
	public static int field336;

	@ObfuscatedName("client.Sf")
	public int field339;

	@ObfuscatedName("client.Uf")
	public int field340;

	@ObfuscatedName("client.ag")
	public int field345;

	@ObfuscatedName("client.cg")
	public int field347;

	@ObfuscatedName("client.dg")
	public int field348;

	@ObfuscatedName("client.eg")
	public int field349;

	@ObfuscatedName("client.fg")
	public int field350;

	@ObfuscatedName("client.sg")
	public static int field363;

	@ObfuscatedName("client.tg")
	public int field364;

	@ObfuscatedName("client.ug")
	public int field365;

	@ObfuscatedName("client.yg")
	public static int field367;

	@ObfuscatedName("client.Bg")
	public int field370;

	@ObfuscatedName("client.Cg")
	public int field371;

	@ObfuscatedName("client.Eg")
	public static int field373;

	@ObfuscatedName("client.Jg")
	public int field376;

	@ObfuscatedName("client.Kg")
	public int field377;

	@ObfuscatedName("client.Lg")
	public int field378;

	@ObfuscatedName("client.Mg")
	public int field379;

	@ObfuscatedName("client.Ng")
	public int field380;

	@ObfuscatedName("client.Vg")
	public int field384;

	@ObfuscatedName("client.Yg")
	public int field387;

	@ObfuscatedName("client.bh")
	public int field389;

	@ObfuscatedName("client.ch")
	public int field390;

	@ObfuscatedName("client.gh")
	public int field394;

	@ObfuscatedName("client.hh")
	public static int field395;

	@ObfuscatedName("client.lh")
	public int field397;

	@ObfuscatedName("client.mh")
	public int field398;

	@ObfuscatedName("client.nh")
	public int field399;

	@ObfuscatedName("client.th")
	public int field405;

	@ObfuscatedName("client.uh")
	public int field406;

	@ObfuscatedName("client.vh")
	public int field407;

	@ObfuscatedName("client.Eh")
	public int field416;

	@ObfuscatedName("client.Fh")
	public int field417;

	@ObfuscatedName("client.Hh")
	public int field419;

	@ObfuscatedName("client.Ph")
	public int field427;

	@ObfuscatedName("client.Qh")
	public int field428;

	@ObfuscatedName("client.Rh")
	public int field429;

	@ObfuscatedName("client.Sh")
	public int field430;

	@ObfuscatedName("client.di")
	public int field440;

	@ObfuscatedName("client.ei")
	public int field441;

	@ObfuscatedName("client.gi")
	public int field443;

	@ObfuscatedName("client.ti")
	public int field454;

	@ObfuscatedName("client.Ci")
	public static int field463;

	@ObfuscatedName("client.Hi")
	public int field467;

	@ObfuscatedName("client.Ji")
	public int field469;

	@ObfuscatedName("client.Ki")
	public int field470;

	@ObfuscatedName("client.Li")
	public int field471;

	@ObfuscatedName("client.Mi")
	public int field472;

	@ObfuscatedName("client.Si")
	public int field478;

	@ObfuscatedName("client.Ui")
	public static int field480;

	@ObfuscatedName("client.Wi")
	public int field482;

	@ObfuscatedName("client.Xi")
	public int field483;

	@ObfuscatedName("client.Yi")
	public int field484;

	@ObfuscatedName("client.Zi")
	public int field485;

	@ObfuscatedName("client.bj")
	public int field487;

	@ObfuscatedName("client.cj")
	public int field488;

	@ObfuscatedName("client.dj")
	public int field489;

	@ObfuscatedName("client.fj")
	public int field491;

	@ObfuscatedName("client.gj")
	public int field492;

	@ObfuscatedName("client.hj")
	public int field493;

	@ObfuscatedName("client.ij")
	public int field494;

	@ObfuscatedName("client.jj")
	public int field495;

	@ObfuscatedName("client.qj")
	public int field499;

	@ObfuscatedName("client.sj")
	public int field501;

	@ObfuscatedName("client.uj")
	public int field503;

	@ObfuscatedName("client.vj")
	public int field504;

	@ObfuscatedName("client.wj")
	public int field505;

	@ObfuscatedName("client.xj")
	public int field506;

	@ObfuscatedName("client.yj")
	public int field507;

	@ObfuscatedName("client.zj")
	public int field508;

	@ObfuscatedName("client.Aj")
	public int field509;

	@ObfuscatedName("client.Bj")
	public int field510;

	@ObfuscatedName("client.Cj")
	public int field511;

	@ObfuscatedName("client.Gj")
	public int field515;

	@ObfuscatedName("client.L")
	public int field98;

	@ObfuscatedName("client.M")
	public int field99;

	@ObfuscatedName("client.ec")
	public long field162;

	@ObfuscatedName("client.nc")
	public long field169;

	@ObfuscatedName("client.xc")
	public long field177;

	@ObfuscatedName("client.wd")
	public long field226;

	@ObfuscatedName("client.We")
	public long field294;

	@ObfuscatedName("client.W")
	public CMFQLMCT field108;

	@ObfuscatedName("client.X")
	public CMFQLMCT field109;

	@ObfuscatedName("client.Y")
	public CMFQLMCT field110;

	@ObfuscatedName("client.Z")
	public CMFQLMCT field111;

	@ObfuscatedName("client.ab")
	public CMFQLMCT field112;

	@ObfuscatedName("client.bb")
	public CMFQLMCT field113;

	@ObfuscatedName("client.cb")
	public CMFQLMCT field114;

	@ObfuscatedName("client.db")
	public CMFQLMCT field115;

	@ObfuscatedName("client.eb")
	public CMFQLMCT field116;

	@ObfuscatedName("client.yc")
	public CMFQLMCT field178;

	@ObfuscatedName("client.zc")
	public CMFQLMCT field179;

	@ObfuscatedName("client.Ac")
	public CMFQLMCT field180;

	@ObfuscatedName("client.Bc")
	public CMFQLMCT field181;

	@ObfuscatedName("client.Cc")
	public CMFQLMCT field182;

	@ObfuscatedName("client.Dc")
	public CMFQLMCT field183;

	@ObfuscatedName("client.Ec")
	public CMFQLMCT field184;

	@ObfuscatedName("client.Fc")
	public CMFQLMCT field185;

	@ObfuscatedName("client.Gc")
	public CMFQLMCT field186;

	@ObfuscatedName("client.zd")
	public CMFQLMCT field229;

	@ObfuscatedName("client.Ad")
	public CMFQLMCT field230;

	@ObfuscatedName("client.Bd")
	public CMFQLMCT field231;

	@ObfuscatedName("client.Cd")
	public CMFQLMCT field232;

	@ObfuscatedName("client.yi")
	public CMFQLMCT field459;

	@ObfuscatedName("client.zi")
	public CMFQLMCT field460;

	@ObfuscatedName("client.Ai")
	public CMFQLMCT field461;

	@ObfuscatedName("client.vb")
	public DLNMSHLT field129;

	@ObfuscatedName("client.wb")
	public DLNMSHLT field130;

	@ObfuscatedName("client.Cb")
	public DLNMSHLT field135;

	@ObfuscatedName("client.Df")
	public DLNMSHLT field325;

	@ObfuscatedName("client.Ef")
	public DLNMSHLT field326;

	@ObfuscatedName("client.jg")
	public DLNMSHLT field354;

	@ObfuscatedName("client.kg")
	public DLNMSHLT field355;

	@ObfuscatedName("client.mg")
	public DLNMSHLT field357;

	@ObfuscatedName("client.ng")
	public DLNMSHLT field358;

	@ObfuscatedName("client.og")
	public DLNMSHLT field359;

	@ObfuscatedName("client.pg")
	public DLNMSHLT field360;

	@ObfuscatedName("client.qg")
	public DLNMSHLT field361;

	@ObfuscatedName("client.Ih")
	public DLNMSHLT field420;

	@ObfuscatedName("client.fi")
	public DLNMSHLT field442;

	@ObfuscatedName("client.ih")
	public static FVFJZZXQ field396;

	@ObfuscatedName("client.re")
	public HRXSNEYZ field268;

	@ObfuscatedName("client.of")
	public QJBJRTJO field310;

	@ObfuscatedName("client.pf")
	public QJBJRTJO field311;

	@ObfuscatedName("client.qf")
	public QJBJRTJO field312;

	@ObfuscatedName("client.rf")
	public QJBJRTJO field313;

	@ObfuscatedName("client.Fe")
	public QLBHZVFC field279;

	@ObfuscatedName("client.xi")
	public UMYAUCNU field458;

	@ObfuscatedName("client.nb")
	public VCAZMAEX field124;

	@ObfuscatedName("client.Vc")
	public VCPXACGS field200;

	@ObfuscatedName("client.Pb")
	public YAPSNHGU field148;

	@ObfuscatedName("client.Qb")
	public YAPSNHGU field149;

	@ObfuscatedName("client.he")
	public YAPSNHGU field259;

	@ObfuscatedName("client.ie")
	public YAPSNHGU field260;

	@ObfuscatedName("client.je")
	public YAPSNHGU field261;

	@ObfuscatedName("client.ke")
	public YAPSNHGU field262;

	@ObfuscatedName("client.le")
	public YAPSNHGU field263;

	@ObfuscatedName("client.gf")
	public YAPSNHGU field303;

	@ObfuscatedName("client.hf")
	public YAPSNHGU field304;

	@ObfuscatedName("client.jf")
	public YAPSNHGU field305;

	@ObfuscatedName("client.kf")
	public YAPSNHGU field306;

	@ObfuscatedName("client.lf")
	public YAPSNHGU field307;

	@ObfuscatedName("client.Kh")
	public YAPSNHGU field422;

	@ObfuscatedName("client.Lh")
	public YAPSNHGU field423;

	@ObfuscatedName("client.ai")
	public YAPSNHGU field437;

	@ObfuscatedName("client.bi")
	public YAPSNHGU field438;

	@ObfuscatedName("client.ci")
	public YAPSNHGU field439;

	@ObfuscatedName("client.Ei")
	public YAPSNHGU field464;

	@ObfuscatedName("client.Fi")
	public YAPSNHGU field465;

	@ObfuscatedName("client.Gi")
	public YAPSNHGU field466;

	@ObfuscatedName("client.Td")
	public ZPIYFABJ field246;

	@ObfuscatedName("client.Db")
	public String field136;

	@ObfuscatedName("client.td")
	public String field223;

	@ObfuscatedName("client.Hf")
	public String field328;

	@ObfuscatedName("client.Ni")
	public String field473;

	@ObfuscatedName("client.si")
	public Socket field453;

	@ObfuscatedName("client.Rd")
	public static boolean field244;

	@ObfuscatedName("client.ae")
	public static boolean field253;

	@ObfuscatedName("client.bg")
	public static boolean field346;

	@ObfuscatedName("client.Gg")
	public static boolean field375;

	@ObfuscatedName("client.rb")
	public int[] field126;

	@ObfuscatedName("client.sb")
	public int[] field127;

	@ObfuscatedName("client.tb")
	public int[] field128;

	@ObfuscatedName("client.Xb")
	public int[] field156;

	@ObfuscatedName("client.Yb")
	public int[] field157;

	@ObfuscatedName("client.Zb")
	public int[] field158;

	@ObfuscatedName("client.xd")
	public int[] field227;

	@ObfuscatedName("client.yd")
	public int[] field228;

	@ObfuscatedName("client.wh")
	public int[] field408;

	@ObfuscatedName("client.xh")
	public int[] field409;

	@ObfuscatedName("client.yh")
	public int[] field410;

	@ObfuscatedName("client.zh")
	public int[] field411;

	@ObfuscatedName("client.Lj")
	public int[] field519;

	@ObfuscatedName("client.Mj")
	public int[] field520;

	@ObfuscatedName("client.V")
	public YAPSNHGU[] field107;

	@ObfuscatedName("client.Kb")
	public byte[][] field143;

	@ObfuscatedName("client.Xg")
	public byte[][] field386;

	@ObfuscatedName("client.rc")
	public byte[][][] field172;

	@ObfuscatedName("client.Vf")
	public int[][][] field341;

	@ObfuscatedName("client.a(ZLTNOPEJNZ;)Z")
	public final boolean method62(TNOPEJNZ arg0) {
		int var2 = arg0.field1307;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field392[field283] = "Remove @whi@" + arg0.field1322;
				field414[field283] = 281;
				field283++;
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

		field392[field283] = "Remove @whi@" + field295[var2];
		field414[field283] = 47;
		field283++;
		field392[field283] = "Message @whi@" + field295[var2];
		field414[field283] = 904;
		field283++;
		return true;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		DHMMFTZG var10 = null;
		for (DHMMFTZG var11 = (DHMMFTZG) field516.method393(); var11 != null; var11 = (DHMMFTZG) field516.method395()) {
			if (var11.field530 == arg1 && var11.field532 == arg3 && var11.field533 == arg4 && var11.field531 == arg0) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new DHMMFTZG();
			var10.field530 = arg1;
			var10.field531 = arg0;
			var10.field532 = arg3;
			var10.field533 = arg4;
			method102(var10);
			field516.method390(var10);
		}

		var10.field537 = arg6;
		var10.field539 = arg5;
		var10.field538 = arg8;
		var10.field529 = arg7;
		var10.field540 = arg2;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field77 != null) {
				return new URL("http://127.0.0.1:" + (field373 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method64() {
		SYTHBZWG.field1217.method388();
		SYTHBZWG.field1189.method388();
		RBTWCHLG.field1064.method388();
		MACPVTEQ.field877.method388();
		MACPVTEQ.field858.method388();
		FVFJZZXQ.field623.method388();
		UAVNMKVJ.field1345.method388();
	}

	@ObfuscatedName("client.a(ZILJHKSAGUC;)V")
	public final void method65(int arg0, JHKSAGUC arg1) {
		for (int var3 = 0; var3 < field216; var3++) {
			int var4 = field217[var3];
			FVFJZZXQ var5 = field213[var4];
			int var6 = arg1.method306();
			if ((var6 & 0x10) != 0) {
				var6 += arg1.method306() << 8;
			}

			method85(var4, arg1, var6, var5);
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method66(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field364; var3++) {
				if (field369[var3] == arg0) {
					field364--;
					field433 = true;

					for (int var4 = var3; var4 < field364; var4++) {
						field369[var4] = field369[var4 + 1];
					}

					field147.method295(203);
					field147.method302(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method67() {
		field367++;
		if (field367 > 121) {
			field367 = 0;
			field147.method295(55);
			field147.method300(0);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method51();
					if (var1 == -1) {
						return;
					}

					if (field210 != -1 && field502 == field210) {
						break;
					}

					if (field257) {
						if (var1 >= 32 && var1 <= 122 && field445.length() < 80) {
							field445 = field445 + (char) var1;
							field518 = true;
						}

						if (var1 == 8 && field445.length() > 0) {
							field445 = field445.substring(0, field445.length() - 1);
							field518 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field257 = false;
							field518 = true;

							if (field387 == 1) {
								long var2 = XNWHEMGT.method576(field445);
								method108(var2);
							}

							if (field387 == 2 && field269 > 0) {
								long var4 = XNWHEMGT.method576(field445);
								method106(var4);
							}

							if (field387 == 3 && field445.length() > 0) {
								field147.method295(204);
								field147.method296(0);
								int var6 = field147.field752;
								field147.method302(field226);
								JFSYEOAW.method292(field147, field445);
								field147.method305(field147.field752 - var6);
								field445 = JFSYEOAW.method293(field445);
								field445 = GQUAQVLD.method257(field445);
								method111(6, field445, XNWHEMGT.method580(XNWHEMGT.method577(field226)));

								if (field242 == 2) {
									field242 = 1;
									field163 = true;
									field147.method295(36);
									field147.method296(field103);
									field147.method296(field242);
									field147.method296(field478);
								}
							}

							if (field387 == 4 && field364 < 100) {
								long var7 = XNWHEMGT.method576(field445);
								method73(var7);
							}

							if (field387 == 5 && field364 > 0) {
								long var9 = XNWHEMGT.method576(field445);
								method66(var9);
							}
						}
					} else if (field501 == 1) {
						if (var1 >= 48 && var1 <= 57 && field475.length() < 10) {
							field475 = field475 + (char) var1;
							field518 = true;
						}

						if (var1 == 8 && field475.length() > 0) {
							field475 = field475.substring(0, field475.length() - 1);
							field518 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field475.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field475);
								} catch (Exception var21) {
								}

								field147.method295(20);
								field147.method300(var11);
							}

							field501 = 0;
							field518 = true;
						}
					} else if (field501 == 2) {
						if (var1 >= 32 && var1 <= 122 && field475.length() < 12) {
							field475 = field475 + (char) var1;
							field518 = true;
						}

						if (var1 == 8 && field475.length() > 0) {
							field475 = field475.substring(0, field475.length() - 1);
							field518 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field475.length() > 0) {
								field147.method295(14);
								field147.method302(XNWHEMGT.method576(field475));
							}

							field501 = 0;
							field518 = true;
						}
					} else if (field258 == -1) {
						if (var1 >= 32 && var1 <= 122 && field134.length() < 80) {
							field134 = field134 + (char) var1;
							field518 = true;
						}

						if (var1 == 8 && field134.length() > 0) {
							field134 = field134.substring(0, field134.length() - 1);
							field518 = true;
						}

						if ((var1 == 13 || var1 == 10) && field134.length() > 0) {
							if (field419 == 2) {
								if (field134.equals("::clientdrop")) {
									method140();
								}

								if (field134.equals("::lag")) {
									method183();
								}

								if (field134.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field200.method557(2); var12++) {
										field200.method564((byte) 1, var12, 2);
									}
								}

								if (field134.equals("::fpson")) {
									field244 = true;
								}

								if (field134.equals("::fpsoff")) {
									field244 = false;
								}

								if (field134.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field436[var13].field786[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field134.startsWith("::")) {
								field147.method295(212);
								field147.method296(field134.length() - 1);
								field147.method303(field134.substring(2));
							} else {
								String var16 = field134.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field134 = field134.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field134 = field134.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field134 = field134.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field134 = field134.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field134 = field134.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field134 = field134.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field134 = field134.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field134 = field134.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field134 = field134.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field134 = field134.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field134 = field134.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field134 = field134.substring(6);
								}

								String var18 = field134.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field134 = field134.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field134 = field134.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field134 = field134.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field134 = field134.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field134 = field134.substring(6);
								}

								field147.method295(172);
								field147.method296(0);
								int var20 = field147.field752;
								field147.method324(var19);
								field147.method324(var17);
								field382.field752 = 0;
								JFSYEOAW.method292(field382, field134);
								field147.method304(0, field382.field752, field382.field751);
								field147.method305(field147.field752 - var20);
								field134 = JFSYEOAW.method293(field134);
								field134 = GQUAQVLD.method257(field134);
								field396.field996 = field134;
								field396.field1025 = var17;
								field396.field1017 = var19;
								field396.field1023 = 150;

								if (field419 == 2) {
									method111(2, field396.field996, "@cr2@" + field396.field603);
								} else if (field419 == 1) {
									method111(2, field396.field996, "@cr1@" + field396.field603);
								} else {
									method111(2, field396.field996, field396.field603);
								}

								if (field103 == 2) {
									field103 = 3;
									field163 = true;
									field147.method295(36);
									field147.method296(field103);
									field147.method296(field242);
									field147.method296(field478);
								}
							}

							field134 = "";
							field518 = true;
						}
					}
				}

				if (var1 == 8 && field276.length() > 0) {
					field276 = field276.substring(0, field276.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field276.length() < 12) {
				field276 = field276 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method68() {
		for (QBCJVLJJ var1 = (QBCJVLJJ) field402.method393(); var1 != null; var1 = (QBCJVLJJ) field402.method395()) {
			if (field122 != var1.field940 || var1.field944) {
				var1.method290();
			} else if (field236 >= var1.field939) {
				var1.method412(field99);

				if (var1.field944) {
					var1.method290();
				} else {
					field458.method515(var1.field943, -1, 60, false, var1.field940, var1.field941, var1, var1.field942, 0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILQQAAMZPI;)V")
	public final void method69(int arg0, QQAAMZPI arg1) {
		method70(arg0, arg1.field1020, arg1.field1019);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method70(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method173(arg1, arg2, field122) - arg0;
			arg2 -= field491;
			var4 -= field492;
			arg1 -= field493;
			int var5 = RTQSBWRH.field1158[field494];
			int var6 = RTQSBWRH.field1159[field494];
			int var7 = RTQSBWRH.field1158[field495];
			int var8 = RTQSBWRH.field1159[field495];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field451 = (var9 << 9) / arg1 + AZWEEYMC.field46;
				field452 = (var11 << 9) / arg1 + AZWEEYMC.field47;
			} else {
				field451 = -1;
				field452 = -1;
			}
		} else {
			field451 = -1;
			field452 = -1;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method71(String arg0) {
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

	@ObfuscatedName("client.a(Ljava/lang/String;IB)V")
	public final void method59(String arg0, int arg1) {
		field173 = arg1;
		field328 = arg0;
		method133();

		if (field268 == null) {
			super.method59(arg0, arg1);
		} else {
			field180.method196();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field312.method418(var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			FBOVVAQK.method236(34, var3 / 2 - 152, 304, 0x8C1111, var6);
			FBOVVAQK.method236(32, var3 / 2 - 151, 302, 0, var6 + 1);
			FBOVVAQK.method235(30, arg1 * 3, var6 + 2, 0x8C1111, var3 / 2 - 150);
			FBOVVAQK.method235(30, 300 - arg1 * 3, var6 + 2, 0, arg1 * 3 + var3 / 2 - 150);
			field312.method418(var4 / 2 + 5 - var5, var3 / 2, arg0, 0xFFFFFF);
			field180.method197(field74, 171, 202);

			if (field444) {
				field444 = false;

				if (!field479) {
					field181.method197(field74, 0, 0);
					field182.method197(field74, 0, 637);
				}

				field178.method197(field74, 0, 128);
				field179.method197(field74, 371, 202);
				field183.method197(field74, 265, 0);
				field184.method197(field74, 265, 562);
				field185.method197(field74, 171, 128);
				field186.method197(field74, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method72() {
		int var1 = 5;
		field251[8] = 0;
		int var2 = 0;
		while (field251[8] == 0) {
			String var3 = "Unknown problem";
			method59("Connecting to web server", 20);

			try {
				DataInputStream var4 = method94("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 318);
				JHKSAGUC var5 = new JHKSAGUC(new byte[40]);
				var4.readFully(var5.field751, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field251[var6] = var5.method311();
				}

				int var7 = var5.method311();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field251[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field251[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field251[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field251[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field251[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field251[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method59("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method59(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field403 = !field403;
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method73(long arg0) {
		if (arg0 != 0L) {
			if (field364 >= 100) {
				method111(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = XNWHEMGT.method580(XNWHEMGT.method577(arg0));
				for (int var4 = 0; var4 < field364; var4++) {
					if (field369[var4] == arg0) {
						method111(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field269; var5++) {
					if (field448[var5] == arg0) {
						method111(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field369[field364++] = arg0;
				field433 = true;
				field147.method295(105);
				field147.method302(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method74(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field458.method534(field122, arg2, arg1, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			SYTHBZWG var8 = SYTHBZWG.method491(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1203;
				var10 = var8.field1181;
			} else {
				var9 = var8.field1181;
				var10 = var8.field1203;
			}

			int var11 = var8.field1208;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method171(arg2, var11, var10, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], var9, arg1);
		} else {
			method171(arg2, 0, 0, 2, field396.field1007[0], var6 + 1, false, var7, field396.field1008[0], 0, arg1);
		}

		field347 = field89;
		field348 = field90;
		field350 = 2;
		field349 = 0;
		return true;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method53() {
		if (!field517 && !field243 && !field512) {
			field236++;

			if (field256) {
				method144();
			} else {
				method93();
			}

			method149();
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method75() {
		if (field139 == 0) {
			int var1 = field88;
			if (field220 == 1 && field89 >= 516 && field90 >= 160 && field89 <= 765 && field90 <= 205) {
				var1 = 0;
			}

			if (field265) {
				if (var1 != 1) {
					int var2 = field82;
					int var3 = field83;
					if (field151 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field151 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field151 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field152 - 10 || var2 > field154 + field152 + 10 || var3 < field153 - 10 || var3 > field155 + field153 + 10) {
						field265 = false;

						if (field151 == 1) {
							field433 = true;
						}

						if (field151 == 2) {
							field518 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field152;
					int var5 = field153;
					int var6 = field154;
					int var7 = field89;
					int var8 = field90;
					if (field151 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field151 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field151 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field283; var10++) {
						int var11 = (field283 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method101(var9);
					}

					field265 = false;

					if (field151 == 1) {
						field433 = true;
					}

					if (field151 == 2) {
						field518 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field283 > 0) {
					int var12 = field414[field283 - 1];
					if (var12 == 3 || var12 == 743 || var12 == 705 || var12 == 947 || var12 == 760 || var12 == 723 || var12 == 22 || var12 == 300 || var12 == 863 || var12 == 196 || var12 == 146 || var12 == 1752) {
						int var13 = field412[field283 - 1];
						int var14 = field413[field283 - 1];
						TNOPEJNZ var15 = TNOPEJNZ.field1272[var14];
						if (var15.field1315 || var15.field1278) {
							field498 = false;
							field192 = 0;
							field137 = var14;
							field138 = var13;
							field139 = 2;
							field140 = field89;
							field141 = field90;

							if (TNOPEJNZ.field1272[var14].field1294 == field210) {
								field139 = 1;
							}

							if (TNOPEJNZ.field1272[var14].field1294 == field258) {
								field139 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field499 == 1 || method115(field283 - 1)) && field283 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field283 > 0) {
					method101(field283 - 1);
				}

				if (var1 != 2 || field283 <= 0) {
					return;
				}

				method98();
			}
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method76(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(I[BZ)V")
	public final void method77(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	public final void run() {
		if (field225) {
			method153();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.b(Z)Z")
	public final boolean method78() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.b(III)V")
	public final void method79(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field457[var4] != null) {
				int var5 = field455[var4];
				int var6 = field189 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field456[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field103 == 0 || field103 == 1 && method174(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field396.field603)) {
						if (field419 >= 1) {
							field392[field283] = "Report abuse @whi@" + var7;
							field414[field283] = 953;
							field283++;
						}

						field392[field283] = "Add ignore @whi@" + var7;
						field414[field283] = 13;
						field283++;
						field392[field283] = "Add friend @whi@" + var7;
						field414[field283] = 217;
						field283++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field145 == 0 && (var5 == 7 || field242 == 0 || field242 == 1 && method174(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field419 >= 1) {
							field392[field283] = "Report abuse @whi@" + var7;
							field414[field283] = 953;
							field283++;
						}

						field392[field283] = "Add ignore @whi@" + var7;
						field414[field283] = 13;
						field283++;
						field392[field283] = "Add friend @whi@" + var7;
						field414[field283] = 217;
						field283++;
					}

					var3++;
				}

				if (var5 == 4 && (field478 == 0 || field478 == 1 && method174(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field392[field283] = "Accept trade @whi@" + var7;
						field414[field283] = 15;
						field283++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field145 == 0 && field242 < 2) {
					var3++;
				}

				if (var5 == 8 && (field478 == 0 || field478 == 1 && method174(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field392[field283] = "Accept challenge @whi@" + var7;
						field414[field283] = 84;
						field283++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method80() {
		if (field238 == 2) {
			for (DHMMFTZG var1 = (DHMMFTZG) field516.method393(); var1 != null; var1 = (DHMMFTZG) field516.method395()) {
				if (var1.field540 > 0) {
					var1.field540--;
				}

				if (var1.field540 != 0) {
					if (var1.field529 > 0) {
						var1.field529--;
					}

					if (var1.field529 == 0 && var1.field532 >= 1 && var1.field533 >= 1 && var1.field532 <= 102 && var1.field533 <= 102 && (var1.field537 < 0 || AIYLKTEB.method8(var1.field539, var1.field537))) {
						method117(var1.field538, var1.field537, var1.field530, var1.field539, var1.field533, var1.field531, var1.field532);
						var1.field529 = -1;

						if (var1.field537 == var1.field534 && var1.field534 == -1) {
							var1.method290();
						} else if (var1.field537 == var1.field534 && var1.field538 == var1.field535 && var1.field539 == var1.field536) {
							var1.method290();
						}
					}
				} else if (var1.field534 < 0 || AIYLKTEB.method8(var1.field536, var1.field534)) {
					method117(var1.field535, var1.field534, var1.field530, var1.field536, var1.field533, var1.field531, var1.field532);
					var1.method290();
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method81() {
		field422 = new YAPSNHGU(field268, "titlebox", 0);
		field423 = new YAPSNHGU(field268, "titlebutton", 0);
		field107 = new YAPSNHGU[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field107[var2] = new YAPSNHGU(field268, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field107[var3] = new YAPSNHGU(field268, "runes", (var3 & 0x3) + 12);
			}
		}

		field354 = new DLNMSHLT(128, 265);
		field355 = new DLNMSHLT(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field354.field541[var4] = field181.field521[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field355.field541[var5] = field182.field521[var5];
		}

		field409 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field409[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field409[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field409[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field409[var9 + 192] = 0xFFFFFF;
		}

		field410 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field410[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field410[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field410[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field410[var13 + 192] = 0xFFFFFF;
		}

		field411 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field411[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field411[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field411[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field411[var17 + 192] = 0xFFFFFF;
		}

		field408 = new int[256];
		field519 = new int[32768];
		field520 = new int[32768];
		method128(null);
		field227 = new int[32768];
		field228 = new int[32768];
		method59("Connecting to fileserver", 10);

		if (!field479) {
			field225 = true;
			field479 = true;
			method58(this, 2);
		}
	}

	@ObfuscatedName("client.a(LJHKSAGUC;II)V")
	public final void method82(JHKSAGUC arg0, int arg1) {
		arg0.method316();
		int var3 = arg0.method317(8);
		if (var3 < field384) {
			for (int var4 = var3; var4 < field384; var4++) {
				field120[field119++] = field385[var4];
			}
		}

		if (var3 > field384) {
			signlink.reporterror(field291 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field384 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field385[var5];
			NLPNWUNL var7 = field383[var6];
			int var8 = arg0.method317(1);
			if (var8 == 0) {
				field385[field384++] = var6;
				var7.field1022 = field236;
			} else {
				int var9 = arg0.method317(2);
				if (var9 == 0) {
					field385[field384++] = var6;
					var7.field1022 = field236;
					field217[field216++] = var6;
				} else if (var9 == 1) {
					field385[field384++] = var6;
					var7.field1022 = field236;
					int var10 = arg0.method317(3);
					var7.method439(var10, false);
					int var11 = arg0.method317(1);
					if (var11 == 1) {
						field217[field216++] = var6;
					}
				} else if (var9 == 2) {
					field385[field384++] = var6;
					var7.field1022 = field236;
					int var12 = arg0.method317(3);
					var7.method439(var12, true);
					int var13 = arg0.method317(3);
					var7.method439(var13, true);
					int var14 = arg0.method317(1);
					if (var14 == 1) {
						field217[field216++] = var6;
					}
				} else if (var9 == 3) {
					field120[field119++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method58(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method58(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method83() {
		field230.method196();

		if (field280 == 2) {
			byte[] var1 = field465.field1472;
			int[] var2 = FBOVVAQK.field591;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field135.method209(25, field101, 33, 0, 25, 256, field252, 33, 0, field427);
			field231.method196();
		} else {
			int var5 = field467 + field427 & 0x7FF;
			int var6 = field396.field1019 / 32 + 48;
			int var7 = 464 - field396.field1020 / 32;
			field442.method209(var6, field434, 151, 5, var7, field489 + 256, field255, 146, 25, var5);
			field135.method209(25, field101, 33, 0, 25, 256, field252, 33, 0, field427);

			for (int var8 = 0; var8 < field174; var8++) {
				int var9 = field175[var8] * 4 + 2 - field396.field1019 / 32;
				int var10 = field176[var8] * 4 + 2 - field396.field1020 / 32;
				method137(var9, field308[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					OUZUCGGU var13 = field435[field122][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field396.field1019 / 32;
						int var15 = var12 * 4 + 2 - field396.field1020 / 32;
						method137(var14, field357, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field384; var16++) {
				NLPNWUNL var17 = field383[field385[var16]];
				if (var17 != null && var17.method244()) {
					RBTWCHLG var18 = var17.field908;
					if (var18.field1077 != null) {
						var18 = var18.method448();
					}

					if (var18 != null && var18.field1070 && var18.field1072) {
						int var19 = var17.field1019 / 32 - field396.field1019 / 32;
						int var20 = var17.field1020 / 32 - field396.field1020 / 32;
						method137(var19, field358, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field214; var21++) {
				FVFJZZXQ var22 = field213[field215[var21]];
				if (var22 != null && var22.method244()) {
					int var23 = var22.field1019 / 32 - field396.field1019 / 32;
					int var24 = var22.field1020 / 32 - field396.field1020 / 32;
					boolean var25 = false;
					long var26 = XNWHEMGT.method576(var22.field603);
					for (int var28 = 0; var28 < field269; var28++) {
						if (field448[var28] == var26 && field446[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field396.field616 != 0 && var22.field616 != 0 && field396.field616 == var22.field616) {
						var29 = true;
					}

					if (var25) {
						method137(var23, field360, var24);
					} else if (var29) {
						method137(var23, field361, var24);
					} else {
						method137(var23, field359, var24);
					}
				}
			}

			if (field117 != 0 && field236 % 20 < 10) {
				if (field117 == 1 && field339 >= 0 && field339 < field383.length) {
					NLPNWUNL var30 = field383[field339];
					if (var30 != null) {
						int var31 = var30.field1019 / 32 - field396.field1019 / 32;
						int var32 = var30.field1020 / 32 - field396.field1020 / 32;
						method176(var32, var31, field130);
					}
				}

				if (field117 == 2) {
					int var33 = (field507 - field503) * 4 + 2 - field396.field1019 / 32;
					int var34 = (field508 - field504) * 4 + 2 - field396.field1020 / 32;
					method176(var34, var33, field130);
				}

				if (field117 == 10 && field394 >= 0 && field394 < field213.length) {
					FVFJZZXQ var35 = field213[field394];
					if (var35 != null) {
						int var36 = var35.field1019 / 32 - field396.field1019 / 32;
						int var37 = var35.field1020 / 32 - field396.field1020 / 32;
						method176(var37, var36, field130);
					}
				}
			}

			if (field440 != 0) {
				int var38 = field440 * 4 + 2 - field396.field1019 / 32;
				int var39 = field441 * 4 + 2 - field396.field1020 / 32;
				method137(var38, field129, var39);
			}

			FBOVVAQK.method235(3, 3, 78, 0xFFFFFF, 97);
			field231.method196();
		}
	}

	@ObfuscatedName("client.a(IBII)I")
	public final int method84(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IILJHKSAGUC;ILFVFJZZXQ;)V")
	public final void method85(int arg0, JHKSAGUC arg1, int arg2, FVFJZZXQ arg3) {
		if ((arg2 & 0x20) != 0) {
			int var5 = arg1.method308();
			int var6 = arg1.method306();
			int var7 = arg1.method326();
			int var8 = arg1.field752;

			if (arg3.field603 != null && arg3.field606) {
				long var9 = XNWHEMGT.method576(arg3.field603);
				boolean var11 = false;
				if (var6 <= 1) {
					for (int var12 = 0; var12 < field364; var12++) {
						if (field369[var12] == var9) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field309 == 0) {
					try {
						field382.field752 = 0;
						arg1.method343(var7, field382.field751, 0);
						field382.field752 = 0;
						String var13 = JFSYEOAW.method291(var7, field382);
						var13 = GQUAQVLD.method257(var13);
						arg3.field996 = var13;
						arg3.field1025 = var5 >> 8;
						arg3.field1017 = var5 & 0xFF;
						arg3.field1023 = 150;

						if (var6 == 2 || var6 == 3) {
							method111(1, var13, "@cr2@" + arg3.field603);
						} else if (var6 == 1) {
							method111(1, var13, "@cr1@" + arg3.field603);
						} else {
							method111(2, var13, arg3.field603);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field752 = var7 + var8;
		}

		if ((arg2 & 0x4) != 0) {
			int var15 = arg1.method325();
			byte[] var16 = new byte[var15];
			JHKSAGUC var17 = new JHKSAGUC(var16);
			arg1.method343(var15, var16, 0);
			field218[arg0] = var17;
			arg3.method243(var17);
		}

		if ((arg2 & 0x1) != 0) {
			arg3.field1011 = arg1.method308();
			arg3.field1012 = arg1.method308();
		}

		if ((arg2 & 0x2) != 0) {
			int var18 = arg1.method308();
			if (var18 == 0xFFFF) {
				var18 = -1;
			}

			int var19 = arg1.method327();
			if (arg3.field1035 == var18 && var18 != -1) {
				int var20 = LCRVYGCP.field795[var18].field809;
				if (var20 == 1) {
					arg3.field1036 = 0;
					arg3.field1037 = 0;
					arg3.field1038 = var19;
					arg3.field1039 = 0;
				}

				if (var20 == 2) {
					arg3.field1039 = 0;
				}
			} else if (var18 == -1 || arg3.field1035 == -1 || LCRVYGCP.field795[var18].field803 >= LCRVYGCP.field795[arg3.field1035].field803) {
				arg3.field1035 = var18;
				arg3.field1036 = 0;
				arg3.field1037 = 0;
				arg3.field1038 = var19;
				arg3.field1039 = 0;
				arg3.field1016 = arg3.field1005;
			}
		}

		if ((arg2 & 0x400) != 0) {
			arg3.field998 = arg1.method326();
			arg3.field1000 = arg1.method327();
			arg3.field999 = arg1.method326();
			arg3.field1001 = arg1.method325();
			arg3.field1002 = arg1.method336() + field236;
			arg3.field1003 = arg1.method308() + field236;
			arg3.field1004 = arg1.method326();
			arg3.method441();
		}

		if ((arg2 & 0x100) != 0) {
			arg3.field991 = arg1.method308();
			int var21 = arg1.method311();
			arg3.field995 = var21 >> 16;
			arg3.field994 = (var21 & 0xFFFF) + field236;
			arg3.field992 = 0;
			arg3.field993 = 0;

			if (arg3.field994 > field236) {
				arg3.field992 = -1;
			}

			if (arg3.field991 == 0xFFFF) {
				arg3.field991 = -1;
			}
		}

		if ((arg2 & 0x200) != 0) {
			int var22 = arg1.method327();
			int var23 = arg1.method327();
			arg3.method442(var22, var23, field236);
			arg3.field1029 = field236 + 300;
			arg3.field1030 = arg1.method326();
			arg3.field1031 = arg1.method325();
		}

		if ((arg2 & 0x8) != 0) {
			arg3.field1027 = arg1.method334();
			if (arg3.field1027 == 0xFFFF) {
				arg3.field1027 = -1;
			}
		}

		if ((arg2 & 0x80) != 0) {
			int var24 = arg1.method306();
			int var25 = arg1.method326();
			arg3.method442(var24, var25, field236);
			arg3.field1029 = field236 + 300;
			arg3.field1030 = arg1.method326();
			arg3.field1031 = arg1.method306();
		}

		if ((arg2 & 0x40) != 0) {
			arg3.field996 = arg1.method313();
			if (arg3.field996.charAt(0) == '~') {
				arg3.field996 = arg3.field996.substring(1);
				method111(2, arg3.field996, arg3.field603);
			} else if (field396 == arg3) {
				method111(2, arg3.field996, arg3.field603);
			}

			arg3.field1025 = 0;
			arg3.field1017 = 0;
			arg3.field1023 = 150;
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method86() {
		field229.method196();
		AZWEEYMC.field52 = field157;
		field464.method587(0, 0);

		if (field235 != -1) {
			method185(0, TNOPEJNZ.field1272[field235], 0, 0);
		} else if (field343[field356] != -1) {
			method185(0, TNOPEJNZ.field1272[field343[field356]], 0, 0);
		}

		if (field265 && field151 == 1) {
			method92();
		}

		field229.method197(field74, 205, 553);
		field231.method196();
		AZWEEYMC.field52 = field158;
	}

	@ObfuscatedName("client.c(II)V")
	public final void method87(int arg0) {
		int[] var2 = field442.field541;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field172[arg0][var7][var5] & 0x18) == 0) {
					field458.method539(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field172[arg0 + 1][var7][var5] & 0x8) != 0) {
					field458.method539(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field442.method200();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field172[arg0][var11][var10] & 0x18) == 0) {
					method135(var10, var11, arg0, var8, var9);
				}

				if (arg0 < 3 && (field172[arg0 + 1][var11][var10] & 0x8) != 0) {
					method135(var10, var11, arg0 + 1, var8, var9);
				}
			}
		}

		field231.method196();
		field174 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field458.method533(field122, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = SYTHBZWG.method491(var14).field1187;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field436[field122].field786;
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

						field308[field174] = field159[var15];
						field175[field174] = var16;
						field176[field174] = var17;
						field174++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method88(int arg0) {
		if (!field375) {
			if (AZWEEYMC.field60[17] >= arg0) {
				YAPSNHGU var2 = AZWEEYMC.field54[17];
				int var3 = var2.field1475 * var2.field1474 - 1;
				int var4 = field99 * var2.field1474 * 2;
				byte[] var5 = var2.field1472;
				byte[] var6 = field190;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1472 = var6;
				field190 = var5;
				AZWEEYMC.method32(17);
				field463++;
				if (field463 > 132) {
					field463 = 0;
					field147.method295(60);
					field147.method296(4);
				}
			}

			if (AZWEEYMC.field60[24] >= arg0) {
				YAPSNHGU var8 = AZWEEYMC.field54[24];
				int var9 = var8.field1475 * var8.field1474 - 1;
				int var10 = field99 * var8.field1474 * 2;
				byte[] var11 = var8.field1472;
				byte[] var12 = field190;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field1472 = var12;
				field190 = var11;
				AZWEEYMC.method32(24);
			}

			if (AZWEEYMC.field60[34] >= arg0) {
				YAPSNHGU var14 = AZWEEYMC.field54[34];
				int var15 = var14.field1475 * var14.field1474 - 1;
				int var16 = field99 * var14.field1474 * 2;
				byte[] var17 = var14.field1472;
				byte[] var18 = field190;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field1472 = var18;
				field190 = var17;
				AZWEEYMC.method32(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method89() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.l(I)V")
	public static final void method90() {
		UMYAUCNU.field1346 = false;
		AZWEEYMC.field41 = false;
		field375 = false;
		AIYLKTEB.field35 = false;
		SYTHBZWG.field1196 = false;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method91() {
		if (field232 == null) {
			method178();
			field75 = null;
			field178 = null;
			field179 = null;
			field180 = null;
			field181 = null;
			field182 = null;
			field183 = null;
			field184 = null;
			field185 = null;
			field186 = null;
			field232 = new CMFQLMCT(479, method57(), 96);
			field230 = new CMFQLMCT(172, method57(), 156);
			FBOVVAQK.method233();
			field465.method587(0, 0);
			field229 = new CMFQLMCT(190, method57(), 261);
			field231 = new CMFQLMCT(512, method57(), 334);
			FBOVVAQK.method233();
			field459 = new CMFQLMCT(496, method57(), 50);
			field460 = new CMFQLMCT(269, method57(), 37);
			field461 = new CMFQLMCT(249, method57(), 45);
			field444 = true;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method92() {
		int var1 = field152;
		int var2 = field153;
		int var3 = field154;
		int var4 = field155;
		int var5 = 0x5D5447;
		FBOVVAQK.method235(var4, var3, var2, var5, var1);
		FBOVVAQK.method235(16, var3 - 2, var2 + 1, 0, var1 + 1);
		FBOVVAQK.method236(var4 - 19, var1 + 1, var3 - 2, 0, var2 + 18);
		field312.method422(var5, "Choose Option", var1 + 3, var2 + 14);
		int var6 = field82;
		int var7 = field83;
		if (field151 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field151 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field151 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field283; var8++) {
			int var9 = (field283 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field312.method426(field392[var8], true, var1 + 3, var10, var9);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method93() {
		if (field454 == 0) {
			int var1 = field72 / 2 - 80;
			int var2 = field73 / 2 + 20;
			var2 += 20;
			if (field88 == 1 && field89 >= var1 - 75 && field89 <= var1 + 75 && field90 >= var2 - 20 && field90 <= var2 + 20) {
				field454 = 3;
				field417 = 0;
			}

			int var3 = field72 / 2 + 80;
			if (field88 == 1 && field89 >= var3 - 75 && field89 <= var3 + 75 && field90 >= var2 - 20 && field90 <= var2 + 20) {
				field206 = "";
				field207 = "Enter your username & password.";
				field454 = 2;
				field417 = 0;
			}
		} else if (field454 == 2) {
			int var4 = field73 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field88 == 1 && field90 >= var4 - 15 && field90 < var4) {
				field417 = 0;
			}

			var4 += 15;
			if (field88 == 1 && field90 >= var4 - 15 && field90 < var4) {
				field417 = 1;
			}

			var4 += 15;
			int var5 = field72 / 2 - 80;
			int var6 = field73 / 2 + 50;
			var6 += 20;
			if (field88 == 1 && field89 >= var5 - 75 && field89 <= var5 + 75 && field90 >= var6 - 20 && field90 <= var6 + 20) {
				field371 = 0;
				method187(field291, field292, false);

				if (field256) {
					return;
				}
			}

			int var7 = field72 / 2 + 80;
			if (field88 == 1 && field89 >= var7 - 75 && field89 <= var7 + 75 && field90 >= var6 - 20 && field90 <= var6 + 20) {
				field454 = 0;
				field291 = "";
				field292 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method51();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field293.length(); var10++) {
					if (var8 == field293.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field417 == 0) {
					if (var8 == 8 && field291.length() > 0) {
						field291 = field291.substring(0, field291.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field417 = 1;
					}

					if (var9) {
						field291 = field291 + (char) var8;
					}

					if (field291.length() > 12) {
						field291 = field291.substring(0, 12);
					}
				} else if (field417 == 1) {
					if (var8 == 8 && field292.length() > 0) {
						field292 = field292.substring(0, field292.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field417 = 0;
					}

					if (var9) {
						field292 = field292 + (char) var8;
					}

					if (field292.length() > 20) {
						field292 = field292.substring(0, 20);
					}
				}
			}
		} else if (field454 == 3) {
			int var11 = field72 / 2;
			int var12 = field73 / 2 + 50;
			var12 += 20;
			if (field88 == 1 && field89 >= var11 - 75 && field89 <= var11 + 75 && field90 >= var12 - 20 && field90 <= var12 + 20) {
				field454 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method94(String arg0) throws IOException {
		if (field403) {
			if (field453 != null) {
				try {
					field453.close();
				} catch (Exception var4) {
				}

				field453 = null;
			}

			field453 = method143(43595);
			field453.setSoTimeout(10000);
			InputStream var2 = field453.getInputStream();
			OutputStream var3 = field453.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(IILTNOPEJNZ;ZIII)V")
	public final void method95(int arg0, int arg1, TNOPEJNZ arg2, int arg3, int arg4, int arg5) {
		if (arg2.field1304 == 0 && arg2.field1321 != null && !arg2.field1275 && (arg1 >= arg3 && arg4 >= arg5 && arg1 <= arg2.field1289 + arg3 && arg4 <= arg2.field1303 + arg5)) {
			int var7 = arg2.field1321.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg2.field1313[var8] + arg3;
				int var10 = arg2.field1324[var8] + arg5 - arg0;
				TNOPEJNZ var11 = TNOPEJNZ.field1272[arg2.field1321[var8]];
				var9 += var11.field1293;
				var10 += var11.field1312;
				if ((var11.field1318 >= 0 || var11.field1276 != 0) && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field1289 + var9 && arg4 < var11.field1303 + var10) {
					if (var11.field1318 >= 0) {
						field301 = var11.field1318;
					} else {
						field301 = var11.field1281;
					}
				}

				if (var11.field1304 == 0) {
					method95(var11.field1323, arg1, var11, var9, arg4, var10);

					if (var11.field1292 > var11.field1303) {
						method180(true, var11.field1303, var11.field1292, var11.field1289 + var9, arg1, var11, arg4, var10);
					}
				} else {
					if (var11.field1306 == 1 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field1289 + var9 && arg4 < var11.field1303 + var10) {
						boolean var12 = false;
						if (var11.field1307 != 0) {
							var12 = method62(var11);
						}

						if (!var12) {
							field392[field283] = var11.field1274;
							field414[field283] = 640;
							field413[field283] = var11.field1281;
							field283++;
						}
					}

					if (var11.field1306 == 2 && field220 == 0 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field1289 + var9 && arg4 < var11.field1303 + var10) {
						String var13 = var11.field1286;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field392[field283] = var13 + " @gre@" + var11.field1314;
						field414[field283] = 877;
						field413[field283] = var11.field1281;
						field283++;
					}

					if (var11.field1306 == 3 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field1289 + var9 && arg4 < var11.field1303 + var10) {
						field392[field283] = "Close";
						field414[field283] = 590;
						field413[field283] = var11.field1281;
						field283++;
					}

					if (var11.field1306 == 4 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field1289 + var9 && arg4 < var11.field1303 + var10) {
						field392[field283] = var11.field1274;
						field414[field283] = 450;
						field413[field283] = var11.field1281;
						field283++;
					}

					if (var11.field1306 == 5 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field1289 + var9 && arg4 < var11.field1303 + var10) {
						field392[field283] = var11.field1274;
						field414[field283] = 46;
						field413[field283] = var11.field1281;
						field283++;
					}

					if (var11.field1306 == 6 && !field132 && arg1 >= var9 && arg4 >= var10 && arg1 < var11.field1289 + var9 && arg4 < var11.field1303 + var10) {
						field392[field283] = var11.field1274;
						field414[field283] = 924;
						field413[field283] = var11.field1281;
						field283++;
					}

					if (var11.field1304 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field1303; var15++) {
							for (int var16 = 0; var16 < var11.field1289; var16++) {
								int var17 = (var11.field1284 + 32) * var16 + var9;
								int var18 = (var11.field1316 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field1273[var14];
									var18 += var11.field1328[var14];
								}

								if (arg1 >= var17 && arg4 >= var18 && arg1 < var17 + 32 && arg4 < var18 + 32) {
									field277 = var14;
									field278 = var11.field1281;

									if (var11.field1317[var14] > 0) {
										MACPVTEQ var19 = MACPVTEQ.method374(var11.field1317[var14] - 1);
										if (field469 == 1 && var11.field1277) {
											if (field471 != var11.field1281 || field470 != var14) {
												field392[field283] = "Use " + field473 + " with @lre@" + var19.field864;
												field414[field283] = 571;
												field415[field283] = var19.field885;
												field412[field283] = var14;
												field413[field283] = var11.field1281;
												field283++;
											}
										} else if (field220 != 1 || !var11.field1277) {
											if (var11.field1277) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field886 != null && var19.field886[var20] != null) {
														field392[field283] = var19.field886[var20] + " @lre@" + var19.field864;

														if (var20 == 3) {
															field414[field283] = 863;
														}

														if (var20 == 4) {
															field414[field283] = 196;
														}

														field415[field283] = var19.field885;
														field412[field283] = var14;
														field413[field283] = var11.field1281;
														field283++;
													} else if (var20 == 4) {
														field392[field283] = "Drop @lre@" + var19.field864;
														field414[field283] = 196;
														field415[field283] = var19.field885;
														field412[field283] = var14;
														field413[field283] = var11.field1281;
														field283++;
													}
												}
											}

											if (var11.field1319) {
												field392[field283] = "Use @lre@" + var19.field864;
												field414[field283] = 146;
												field415[field283] = var19.field885;
												field412[field283] = var14;
												field413[field283] = var11.field1281;
												field283++;
											}

											if (var11.field1277 && var19.field886 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field886[var21] != null) {
														field392[field283] = var19.field886[var21] + " @lre@" + var19.field864;

														if (var21 == 0) {
															field414[field283] = 723;
														}

														if (var21 == 1) {
															field414[field283] = 22;
														}

														if (var21 == 2) {
															field414[field283] = 300;
														}

														field415[field283] = var19.field885;
														field412[field283] = var14;
														field413[field283] = var11.field1281;
														field283++;
													}
												}
											}

											if (var11.field1285 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field1285[var22] != null) {
														field392[field283] = var11.field1285[var22] + " @lre@" + var19.field864;

														if (var22 == 0) {
															field414[field283] = 3;
														}

														if (var22 == 1) {
															field414[field283] = 743;
														}

														if (var22 == 2) {
															field414[field283] = 705;
														}

														if (var22 == 3) {
															field414[field283] = 947;
														}

														if (var22 == 4) {
															field414[field283] = 760;
														}

														field415[field283] = var19.field885;
														field412[field283] = var14;
														field413[field283] = var11.field1281;
														field283++;
													}
												}
											}

											field392[field283] = "Examine @lre@" + var19.field864;
											field414[field283] = 1752;
											field415[field283] = var19.field885;
											field412[field283] = var14;
											field413[field283] = var11.field1281;
											field283++;
										} else if ((field222 & 0x10) == 0x10) {
											field392[field283] = field223 + " @lre@" + var19.field864;
											field414[field283] = 24;
											field415[field283] = var19.field885;
											field412[field283] = var14;
											field413[field283] = var11.field1281;
											field283++;
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

	@ObfuscatedName("client.g(B)V")
	public final void method96() {
		field194 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field102[var1] = -1;
			for (int var2 = 0; var2 < DQSOHZWU.field548; var2++) {
				if (!DQSOHZWU.field549[var2].field555 && DQSOHZWU.field549[var2].field550 == var1 + (field421 ? 0 : 7)) {
					field102[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method97() {
		if (field145 != 0) {
			int var1 = 0;
			if (field515 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field457[var2] != null) {
					int var3 = field455[var2];
					String var4 = field456[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field242 == 0 || field242 == 1 && method174(var4))) {
						int var8 = 329 - var1 * 13;
						if (field82 > 4 && field83 - 4 > var8 - 10 && field83 - 4 <= var8 + 3) {
							int var9 = field311.method420("From:  " + var4 + field457[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field82 < var9 + 4) {
								if (field419 >= 1) {
									field392[field283] = "Report abuse @whi@" + var4;
									field414[field283] = 2953;
									field283++;
								}

								field392[field283] = "Add ignore @whi@" + var4;
								field414[field283] = 2013;
								field283++;
								field392[field283] = "Add friend @whi@" + var4;
								field414[field283] = 2217;
								field283++;
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

	@ObfuscatedName("client.n(I)V")
	public final void method98() {
		int var1 = field312.method420("Choose Option");
		for (int var2 = 0; var2 < field283; var2++) {
			int var3 = field312.method420(field392[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field283 * 15 + 21;
		if (field89 > 4 && field90 > 4 && field89 < 516 && field90 < 338) {
			int var5 = field89 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field90 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field265 = true;
			field151 = 0;
			field152 = var5;
			field153 = var6;
			field154 = var1;
			field155 = field283 * 15 + 22;
		}

		if (field89 > 553 && field90 > 205 && field89 < 743 && field90 < 466) {
			int var7 = field89 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field90 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field265 = true;
			field151 = 1;
			field152 = var7;
			field153 = var8;
			field154 = var1;
			field155 = field283 * 15 + 22;
		}

		if (field89 > 17 && field90 > 357 && field89 < 496 && field90 < 453) {
			int var9 = field89 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field90 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field265 = true;
			field151 = 2;
			field152 = var9;
			field153 = var10;
			field154 = var1;
			field155 = field283 * 15 + 22;
		}
	}

	@ObfuscatedName("client.o(I)V")
	public static final void method99() {
		UMYAUCNU.field1346 = true;
		AZWEEYMC.field41 = true;
		field375 = true;
		AIYLKTEB.field35 = true;
		SYTHBZWG.field1196 = true;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method100() {
		for (int var1 = 0; var1 < field267; var1++) {
			if (field366[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field104[var1] != field142 || field164[var1] != field368) {
						JHKSAGUC var3 = PWXXEHUE.method399(field104[var1], field164[var1]);
						if (System.currentTimeMillis() + var3.field752 / 22 > field187 / 22 + field177) {
							field187 = var3.field752;
							field177 = System.currentTimeMillis();

							if (method150(var3.field752, var3.field751)) {
								field142 = field104[var1];
								field368 = field164[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method78()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field366[var1] != -5) {
					field366[var1] = -5;
				} else {
					field267--;
					for (int var5 = var1; var5 < field267; var5++) {
						field104[var5] = field104[var5 + 1];
						field164[var5] = field164[var5 + 1];
						field366[var5] = field366[var5 + 1];
					}

					var1--;
				}
			} else {
				field366[var1]--;
			}
		}

		if (field98 > 0) {
			field98 -= 20;
			if (field98 < 0) {
				field98 = 0;
			}

			if (field98 == 0 && field353 && !field375) {
				field247 = field150;
				field248 = true;
				field200.method567(2, field247);
				return;
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method52() {
		method59("Starting up", 20);

		if (signlink.sunjava) {
			field68 = 5;
		}

		if (field253) {
			field517 = true;
		} else {
			field253 = true;
			boolean var1 = false;
			String var2 = method120();
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
						field302[var3] = new KQOBJHBO(var3 + 1, signlink.cache_dat, signlink.cache_idx[var3], 500000);
					}
				}

				try {
					method72();
					field268 = method114("title", "title screen", 1, 25, field251[1]);
					field310 = new QJBJRTJO(field268, "p11_full", false);
					field311 = new QJBJRTJO(field268, "p12_full", false);
					field312 = new QJBJRTJO(field268, "b12_full", false);
					field313 = new QJBJRTJO(field268, "q8_full", true);
					method155();
					method81();
					HRXSNEYZ var4 = method114("config", "config", 2, 30, field251[2]);
					HRXSNEYZ var5 = method114("interface", "interface", 3, 35, field251[3]);
					HRXSNEYZ var6 = method114("media", "2d graphics", 4, 40, field251[4]);
					HRXSNEYZ var7 = method114("textures", "textures", 6, 45, field251[6]);
					HRXSNEYZ var8 = method114("wordenc", "chat system", 7, 50, field251[7]);
					HRXSNEYZ var9 = method114("sounds", "sound effects", 8, 55, field251[8]);
					field172 = new byte[4][104][104];
					field341 = new int[4][105][105];
					field458 = new UMYAUCNU(4, 104, field341, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field436[var10] = new KFLNJHKB(104, 104);
					}

					field442 = new DLNMSHLT(512, 512);
					HRXSNEYZ var11 = method114("versionlist", "update list", 5, 60, field251[5]);
					method59("Connecting to update server", 60);
					field200 = new VCPXACGS();
					field200.method560(var11, this);
					EMBMBPSC.method225(field200.method561());
					RTQSBWRH.method451(field200.method557(0), field200);

					if (!field375) {
						field247 = 0;
						try {
							field247 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field248 = true;
						field200.method567(2, field247);

						while (field200.method571() > 0) {
							method149();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field200.field1438 > 3) {
								method71("ondemand");
								return;
							}
						}
					}

					method59("Requesting animations", 65);
					int var12 = field200.method557(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field200.method567(1, var13);
					}

					while (field200.method571() > 0) {
						int var14 = var12 - field200.method571();
						if (var14 > 0) {
							method59("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method149();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field200.field1438 > 3) {
							method71("ondemand");
							return;
						}
					}

					method59("Requesting models", 70);
					int var15 = field200.method557(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field200.method558(var16);
						if ((var17 & 0x1) != 0) {
							field200.method567(0, var16);
						}
					}

					int var18 = field200.method571();
					while (field200.method571() > 0) {
						int var19 = var18 - field200.method571();
						if (var19 > 0) {
							method59("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method149();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field302[0] != null) {
						method59("Requesting maps", 75);
						field200.method567(3, field200.method563(0, 47, 48));
						field200.method567(3, field200.method563(1, 47, 48));
						field200.method567(3, field200.method563(0, 48, 48));
						field200.method567(3, field200.method563(1, 48, 48));
						field200.method567(3, field200.method563(0, 49, 48));
						field200.method567(3, field200.method563(1, 49, 48));
						field200.method567(3, field200.method563(0, 47, 47));
						field200.method567(3, field200.method563(1, 47, 47));
						field200.method567(3, field200.method563(0, 48, 47));
						field200.method567(3, field200.method563(1, 48, 47));
						field200.method567(3, field200.method563(0, 48, 148));
						field200.method567(3, field200.method563(1, 48, 148));
						int var20 = field200.method571();
						while (field200.method571() > 0) {
							int var21 = var20 - field200.method571();
							if (var21 > 0) {
								method59("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method149();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field200.method557(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field200.method558(var23);
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
							field200.method564(var25, var23, 0);
						}
					}

					field200.method570(field374);

					if (!field375) {
						int var26 = field200.method557(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field200.method566(var27)) {
								field200.method564((byte) 1, var27, 2);
							}
						}
					}

					method59("Unpacking media", 80);
					field464 = new YAPSNHGU(var6, "invback", 0);
					field466 = new YAPSNHGU(var6, "chatback", 0);
					field465 = new YAPSNHGU(var6, "mapback", 0);
					field437 = new YAPSNHGU(var6, "backbase1", 0);
					field438 = new YAPSNHGU(var6, "backbase2", 0);
					field439 = new YAPSNHGU(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field338[var28] = new YAPSNHGU(var6, "sideicons", var28);
					}

					field135 = new DLNMSHLT(var6, "compass", 0);
					field420 = new DLNMSHLT(var6, "mapedge", 0);
					field420.method202();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field388[var29] = new YAPSNHGU(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field159[var30] = new DLNMSHLT(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field432[var31] = new DLNMSHLT(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field447[var32] = new DLNMSHLT(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field129 = new DLNMSHLT(var6, "mapmarker", 0);
					field130 = new DLNMSHLT(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field424[var33] = new DLNMSHLT(var6, "cross", var33);
					}

					field357 = new DLNMSHLT(var6, "mapdots", 0);
					field358 = new DLNMSHLT(var6, "mapdots", 1);
					field359 = new DLNMSHLT(var6, "mapdots", 2);
					field360 = new DLNMSHLT(var6, "mapdots", 3);
					field361 = new DLNMSHLT(var6, "mapdots", 4);
					field148 = new YAPSNHGU(var6, "scrollbar", 0);
					field149 = new YAPSNHGU(var6, "scrollbar", 1);
					field259 = new YAPSNHGU(var6, "redstone1", 0);
					field260 = new YAPSNHGU(var6, "redstone2", 0);
					field261 = new YAPSNHGU(var6, "redstone3", 0);
					field262 = new YAPSNHGU(var6, "redstone1", 0);
					field262.method584();
					field263 = new YAPSNHGU(var6, "redstone2", 0);
					field263.method584();
					field303 = new YAPSNHGU(var6, "redstone1", 0);
					field303.method585();
					field304 = new YAPSNHGU(var6, "redstone2", 0);
					field304.method585();
					field305 = new YAPSNHGU(var6, "redstone3", 0);
					field305.method585();
					field306 = new YAPSNHGU(var6, "redstone1", 0);
					field306.method584();
					field306.method585();
					field307 = new YAPSNHGU(var6, "redstone2", 0);
					field307.method584();
					field307.method585();

					for (int var34 = 0; var34 < 2; var34++) {
						field335[var34] = new YAPSNHGU(var6, "mod_icons", var34);
					}

					DLNMSHLT var35 = new DLNMSHLT(var6, "backleft1", 0);
					field108 = new CMFQLMCT(var35.field542, method57(), var35.field543);
					var35.method203(0, 0);
					DLNMSHLT var36 = new DLNMSHLT(var6, "backleft2", 0);
					field109 = new CMFQLMCT(var36.field542, method57(), var36.field543);
					var36.method203(0, 0);
					DLNMSHLT var37 = new DLNMSHLT(var6, "backright1", 0);
					field110 = new CMFQLMCT(var37.field542, method57(), var37.field543);
					var37.method203(0, 0);
					DLNMSHLT var38 = new DLNMSHLT(var6, "backright2", 0);
					field111 = new CMFQLMCT(var38.field542, method57(), var38.field543);
					var38.method203(0, 0);
					DLNMSHLT var39 = new DLNMSHLT(var6, "backtop1", 0);
					field112 = new CMFQLMCT(var39.field542, method57(), var39.field543);
					var39.method203(0, 0);
					DLNMSHLT var40 = new DLNMSHLT(var6, "backvmid1", 0);
					field113 = new CMFQLMCT(var40.field542, method57(), var40.field543);
					var40.method203(0, 0);
					DLNMSHLT var41 = new DLNMSHLT(var6, "backvmid2", 0);
					field114 = new CMFQLMCT(var41.field542, method57(), var41.field543);
					var41.method203(0, 0);
					DLNMSHLT var42 = new DLNMSHLT(var6, "backvmid3", 0);
					field115 = new CMFQLMCT(var42.field542, method57(), var42.field543);
					var42.method203(0, 0);
					DLNMSHLT var43 = new DLNMSHLT(var6, "backhmid2", 0);
					field116 = new CMFQLMCT(var43.field542, method57(), var43.field543);
					var43.method203(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field159[var48] != null) {
							field159[var48].method201(var45 + var47, var44 + var47, var46 + var47);
						}

						if (field388[var48] != null) {
							field388[var48].method586(var45 + var47, var44 + var47, var46 + var47);
						}
					}

					method59("Unpacking textures", 83);
					AZWEEYMC.method30(var7);
					AZWEEYMC.method34(0.8D);
					AZWEEYMC.method29(20);
					method59("Unpacking config", 86);
					LCRVYGCP.method360(var4);
					SYTHBZWG.method484(var4);
					NEDSEYSI.method381(var4);
					MACPVTEQ.method369(var4);
					RBTWCHLG.method445(var4);
					DQSOHZWU.method213(var4);
					UAVNMKVJ.method500(var4);
					EINNWKRR.method223(var4);
					AIRUOZLB.method2(var4);
					MACPVTEQ.field882 = field374;

					if (!field375) {
						method59("Unpacking sounds", 90);
						byte[] var49 = var9.method289("sounds.dat", null);
						JHKSAGUC var50 = new JHKSAGUC(var49);
						PWXXEHUE.method398(var50);
					}

					method59("Unpacking interfaces", 95);
					QJBJRTJO[] var51 = new QJBJRTJO[] { field310, field311, field312, field313 };
					TNOPEJNZ.method497(var51, var5, var6);
					method59("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field465.field1472[field465.field1474 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field252[var52] = var53;
						field101[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field465.field1472[field465.field1474 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field255[var56 - 5] = var57 - 25;
						field434[var56 - 5] = var58 - var57;
					}

					AZWEEYMC.method27(96, 479);
					field156 = AZWEEYMC.field52;
					AZWEEYMC.method27(261, 190);
					field157 = AZWEEYMC.field52;
					AZWEEYMC.method27(334, 512);
					field158 = AZWEEYMC.field52;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = AZWEEYMC.field50[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					UMYAUCNU.method540(800, 512, var60, 334, 500);
					GQUAQVLD.method247(var8);
					field124 = new VCAZMAEX(this);
					method58(field124, 10);
					HALGFRSE.field640 = this;
					SYTHBZWG.field1177 = this;
					RBTWCHLG.field1078 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field328 + " " + field173);
					field243 = true;
				}
			} else {
				field512 = true;
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method101(int arg0) {
		if (arg0 >= 0) {
			if (field501 != 0) {
				field501 = 0;
				field518 = true;
			}

			int var2 = field412[arg0];
			int var3 = field413[arg0];
			int var4 = field414[arg0];
			int var5 = field415[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 629) {
				boolean var6 = method171(var2, 0, 0, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 0, var3);
				if (!var6) {
					method171(var2, 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var3);
				}

				field347 = field89;
				field348 = field90;
				field350 = 2;
				field349 = 0;
				field147.method295(254);
				field147.method297(field503 + var2);
				field147.method332(var5);
				field147.method332(field504 + var3);
			}

			if (var4 == 412) {
				method74(var5, var3, var2);
				field147.method295(87);
				field147.method332(field504 + var3);
				field147.method333(var5 >> 14 & 0x7FFF);
				field147.method331(field503 + var2);
			}

			if (var4 == 505) {
				if (field265) {
					field458.method542(var2 - 4, var3 - 4);
				} else {
					field458.method542(field89 - 4, field90 - 4);
				}
			}

			if (var4 == 562) {
				FVFJZZXQ var8 = field213[var5];
				if (var8 != null) {
					method171(var8.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var8.field1008[0]);
					field347 = field89;
					field348 = field90;
					field350 = 2;
					field349 = 0;
					field147.method295(33);
					field147.method331(var5);
				}
			}

			if (var4 == 209) {
				NLPNWUNL var9 = field383[var5];
				if (var9 != null) {
					method171(var9.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var9.field1008[0]);
					field347 = field89;
					field348 = field90;
					field350 = 2;
					field349 = 0;
					field147.method295(236);
					field147.method332(var5);
					field147.method297(field221);
				}
			}

			if (var4 == 1912) {
				int var10 = var5 >> 14 & 0x7FFF;
				SYTHBZWG var11 = SYTHBZWG.method491(var10);
				String var12;
				if (var11.field1204 == null) {
					var12 = "It's a " + var11.field1207 + ".";
				} else {
					var12 = new String(var11.field1204);
				}

				method111(0, var12, "");
			}

			if (var4 == 640) {
				TNOPEJNZ var13 = TNOPEJNZ.field1272[var3];
				boolean var14 = true;
				if (var13.field1307 > 0) {
					var14 = method121(var13);
				}

				if (var14) {
					field147.method295(131);
					field147.method297(var3);
				}
			}

			if (var4 == 124) {
				boolean var15 = method171(var2, 0, 0, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 0, var3);
				if (!var15) {
					method171(var2, 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var3);
				}

				field347 = field89;
				field348 = field90;
				field350 = 2;
				field349 = 0;
				field147.method295(13);
				field147.method331(field503 + var2);
				field147.method297(field504 + var3);
				field147.method332(var5);
			}

			if (var4 == 81) {
				boolean var17 = method171(var2, 0, 0, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 0, var3);
				if (!var17) {
					method171(var2, 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var3);
				}

				field347 = field89;
				field348 = field90;
				field350 = 2;
				field349 = 0;
				field363 += var3;
				if (field363 >= 75) {
					field147.method295(246);
					field147.method296(242);
					field363 = 0;
				}

				field147.method295(239);
				field147.method331(field504 + var3);
				field147.method297(field503 + var2);
				field147.method333(var5);
			}

			if (var4 == 801) {
				FVFJZZXQ var19 = field213[var5];
				if (var19 != null) {
					method171(var19.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var19.field1008[0]);
					field347 = field89;
					field348 = field90;
					field350 = 2;
					field349 = 0;
					field147.method295(129);
					field147.method297(var5);
				}
			}

			if (var4 == 217 || var4 == 13 || var4 == 47 || var4 == 281) {
				String var20 = field392[arg0];
				int var21 = var20.indexOf("@whi@");
				if (var21 != -1) {
					long var22 = XNWHEMGT.method576(var20.substring(var21 + 5).trim());
					if (var4 == 217) {
						method108(var22);
					}

					if (var4 == 13) {
						method73(var22);
					}

					if (var4 == 47) {
						method106(var22);
					}

					if (var4 == 281) {
						method66(var22);
					}
				}
			}

			if (var4 == 760) {
				field147.method295(247);
				field147.method332(var5);
				field147.method297(var3);
				field147.method333(var2);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (TNOPEJNZ.field1272[var3].field1294 == field210) {
					field485 = 1;
				}

				if (TNOPEJNZ.field1272[var3].field1294 == field258) {
					field485 = 3;
				}
			}

			if (var4 == 667) {
				NLPNWUNL var24 = field383[var5];
				if (var24 != null) {
					method171(var24.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var24.field1008[0]);
					field347 = field89;
					field348 = field90;
					field350 = 2;
					field349 = 0;
					field147.method295(180);
					field147.method331(var5);
				}
			}

			if (var4 == 590) {
				method145();
			}

			if (var4 == 22) {
				field147.method295(47);
				field147.method331(var2);
				field147.method297(var5);
				field147.method297(var3);
				field482 = 0;
				field483 = var3;
				field484 = var2;
				field485 = 2;
				if (TNOPEJNZ.field1272[var3].field1294 == field210) {
					field485 = 1;
				}

				if (TNOPEJNZ.field1272[var3].field1294 == field258) {
					field485 = 3;
				}
			}

			if (var4 == 146) {
				field469 = 1;
				field470 = var2;
				field471 = var3;
				field472 = var5;
				field473 = MACPVTEQ.method374(var5).field864;
				field220 = 0;
				field433 = true;
			} else {
				if (var4 == 196) {
					field147.method295(25);
					field147.method332(var3);
					field147.method333(var2);
					field147.method297(var5);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 1842) {
					NLPNWUNL var25 = field383[var5];
					if (var25 != null) {
						RBTWCHLG var26 = var25.field908;
						if (var26.field1077 != null) {
							var26 = var26.method448();
						}

						if (var26 != null) {
							String var27;
							if (var26.field1088 == null) {
								var27 = "It's a " + var26.field1055 + ".";
							} else {
								var27 = new String(var26.field1088);
							}

							method111(0, var27, "");
						}
					}
				}

				if (var4 == 953) {
					String var28 = field392[arg0];
					int var29 = var28.indexOf("@whi@");
					if (var29 != -1) {
						if (field210 == -1) {
							method145();
							field276 = var28.substring(var29 + 5).trim();
							field275 = false;

							for (int var30 = 0; var30 < TNOPEJNZ.field1272.length; var30++) {
								if (TNOPEJNZ.field1272[var30] != null && TNOPEJNZ.field1272[var30].field1307 == 600) {
									field502 = field210 = TNOPEJNZ.field1272[var30].field1294;
									break;
								}
							}
						} else {
							method111(0, "Please close the interface you have open before using 'report abuse'", "");
						}
					}
				}

				if (var4 == 450) {
					field147.method295(131);
					field147.method297(var3);
					TNOPEJNZ var31 = TNOPEJNZ.field1272[var3];
					if (var31.field1330 != null && var31.field1330[0][0] == 5) {
						int var32 = var31.field1330[0][1];
						field418[var32] = 1 - field418[var32];
						method116(var32);
						field433 = true;
					}
				}

				if (var4 == 270) {
					NLPNWUNL var33 = field383[var5];
					if (var33 != null) {
						method171(var33.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var33.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field147.method295(77);
						field147.method297(var5);
					}
				}

				if (var4 == 863) {
					field239++;
					if (field239 >= 135) {
						field147.method295(38);
						field147.method296(167);
						field239 = 0;
					}

					field147.method295(8);
					field147.method333(var3);
					field147.method333(var5);
					field147.method332(var2);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 24) {
					field147.method295(85);
					field147.method297(var5);
					field147.method297(var2);
					field147.method297(field221);
					field147.method331(var3);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 15 || var4 == 84) {
					String var34 = field392[arg0];
					int var35 = var34.indexOf("@whi@");
					if (var35 != -1) {
						var34 = var34.substring(var35 + 5).trim();
						String var36 = XNWHEMGT.method580(XNWHEMGT.method577(XNWHEMGT.method576(var34)));
						boolean var37 = false;
						for (int var38 = 0; var38 < field214; var38++) {
							FVFJZZXQ var39 = field213[field215[var38]];
							if (var39 != null && var39.field603 != null && var39.field603.equalsIgnoreCase(var36)) {
								method171(var39.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var39.field1008[0]);

								if (var4 == 15) {
									field147.method295(177);
									field147.method297(field215[var38]);
								}

								if (var4 == 84) {
									field121 += var5;
									if (field121 >= 78) {
										field147.method295(15);
										field147.method300(0);
										field121 = 0;
									}

									field147.method295(113);
									field147.method297(field215[var38]);
								}

								var37 = true;
								break;
							}
						}

						if (!var37) {
							method111(0, "Unable to find " + var36, "");
						}
					}
				}

				if (var4 == 745) {
					field327++;
					if (field327 >= 142) {
						field147.method295(170);
						field327 = 0;
					}

					method74(var5, var3, var2);
					field147.method295(175);
					field147.method331(field503 + var2);
					field147.method331(var5 >> 14 & 0x7FFF);
					field147.method331(field504 + var3);
				}

				if (var4 == 571) {
					field147.method295(238);
					field147.method297(var2);
					field147.method297(var3);
					field147.method297(field472);
					field147.method333(field471);
					field147.method333(var5);
					field147.method331(field470);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 46) {
					field147.method295(131);
					field147.method297(var3);
					TNOPEJNZ var40 = TNOPEJNZ.field1272[var3];
					if (var40.field1330 != null && var40.field1330[0][0] == 5) {
						int var41 = var40.field1330[0][1];
						if (field418[var41] != var40.field1300[0]) {
							field418[var41] = var40.field1300[0];
							method116(var41);
							field433 = true;
						}
					}
				}

				if (var4 == 705) {
					if ((var3 & 0x3) == 0) {
						field480++;
					}

					if (field480 >= 100) {
						field147.method295(24);
						field147.method296(71);
						field480 = 0;
					}

					field147.method295(221);
					field147.method333(var3);
					field147.method331(var5);
					field147.method331(var2);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 572) {
					boolean var42 = method171(var2, 0, 0, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 0, var3);
					if (!var42) {
						method171(var2, 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var3);
					}

					field347 = field89;
					field348 = field90;
					field350 = 2;
					field349 = 0;
					field147.method295(142);
					field147.method332(var5);
					field147.method297(field221);
					field147.method297(field503 + var2);
					field147.method331(field504 + var3);
				}

				if (var4 == 1859) {
					MACPVTEQ var44 = MACPVTEQ.method374(var5);
					String var45;
					if (var44.field866 == null) {
						var45 = "It's a " + var44.field864 + ".";
					} else {
						var45 = new String(var44.field866);
					}

					method111(0, var45, "");
				}

				if (var4 == 464) {
					NLPNWUNL var46 = field383[var5];
					if (var46 != null) {
						method171(var46.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var46.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field147.method295(156);
						field147.method297(var5);
					}
				}

				if (var4 == 964) {
					FVFJZZXQ var47 = field213[var5];
					if (var47 != null) {
						method171(var47.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var47.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field147.method295(45);
						field147.method332(field221);
						field147.method297(var5);
					}
				}

				if (var4 == 296) {
					NLPNWUNL var48 = field383[var5];
					if (var48 != null) {
						method171(var48.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var48.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;

						if ((var5 & 0x3) == 0) {
							field395++;
						}

						if (field395 >= 103) {
							field147.method295(17);
							field147.method296(3);
							field395 = 0;
						}

						field147.method295(89);
						field147.method297(var5);
					}
				}

				if (var4 == 128) {
					FVFJZZXQ var49 = field213[var5];
					if (var49 != null) {
						method171(var49.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var49.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field147.method295(240);
						field147.method297(field470);
						field147.method332(var5);
						field147.method332(field471);
						field147.method331(field472);
					}
				}

				if (var4 == 919) {
					method74(var5, var3, var2);
					field147.method295(111);
					field147.method331(field504 + var3);
					field147.method332(field503 + var2);
					field147.method333(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 90) {
					FVFJZZXQ var50 = field213[var5];
					if (var50 != null) {
						method171(var50.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var50.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field100 += var5;
						if (field100 >= 108) {
							field147.method295(67);
							field147.method297(59871);
							field100 = 0;
						}

						field147.method295(7);
						field147.method297(var5);
					}
				}

				if (var4 == 723) {
					field147.method295(140);
					field147.method332(var5);
					field147.method297(var3);
					field147.method333(var2);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 901) {
					FVFJZZXQ var51 = field213[var5];
					if (var51 != null) {
						method171(var51.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var51.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field121 += var5;
						if (field121 >= 78) {
							field147.method295(15);
							field147.method300(0);
							field121 = 0;
						}

						field147.method295(113);
						field147.method297(var5);
					}
				}

				if (var4 == 633) {
					boolean var52 = method171(var2, 0, 0, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 0, var3);
					if (!var52) {
						method171(var2, 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var3);
					}

					field347 = field89;
					field348 = field90;
					field350 = 2;
					field349 = 0;

					if ((field504 & 0x3) == 0) {
						field334++;
					}

					if (field334 >= 105) {
						field147.method295(35);
						field147.method296(54);
						field334 = 0;
					}

					field147.method295(34);
					field147.method332(field504 + var3);
					field147.method333(var5);
					field147.method333(field503 + var2);
				}

				if (var4 == 924 && !field132) {
					field147.method295(184);
					field147.method297(var3);
					field132 = true;
				}

				if (var4 == 338) {
					FVFJZZXQ var54 = field213[var5];
					if (var54 != null) {
						method171(var54.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var54.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field147.method295(177);
						field147.method297(var5);
					}
				}

				if (var4 == 187) {
					NLPNWUNL var55 = field383[var5];
					if (var55 != null) {
						method171(var55.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var55.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field147.method295(152);
						field147.method331(var5);
					}
				}

				if (var4 == 770 && method74(var5, var3, var2)) {
					field147.method295(216);
					field147.method333(field221);
					field147.method331(field504 + var3);
					field147.method333(var5 >> 14 & 0x7FFF);
					field147.method332(field503 + var2);
				}

				if (var4 == 3) {
					field147.method295(255);
					field147.method332(var5);
					field147.method332(var3);
					field147.method332(var2);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 943) {
					boolean var56 = method171(var2, 0, 0, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 0, var3);
					if (!var56) {
						method171(var2, 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var3);
					}

					field347 = field89;
					field348 = field90;
					field350 = 2;
					field349 = 0;
					field147.method295(124);
					field147.method331(field503 + var2);
					field147.method297(field504 + var3);
					field147.method332(var5);
				}

				if (var4 == 743) {
					field147.method295(100);
					field147.method297(var5);
					field147.method333(var2);
					field147.method332(var3);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 1752) {
					MACPVTEQ var58 = MACPVTEQ.method374(var5);
					TNOPEJNZ var59 = TNOPEJNZ.field1272[var3];
					String var60;
					if (var59 != null && var59.field1297[var2] >= 100000) {
						var60 = var59.field1297[var2] + " x " + var58.field864;
					} else if (var58.field866 == null) {
						var60 = "It's a " + var58.field864 + ".";
					} else {
						var60 = new String(var58.field866);
					}

					method111(0, var60, "");
				}

				if (var4 == 237) {
					NLPNWUNL var61 = field383[var5];
					if (var61 != null) {
						method171(var61.field1007[0], 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var61.field1008[0]);
						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field147.method295(252);
						field147.method333(field471);
						field147.method297(field470);
						field147.method297(field472);
						field147.method297(var5);
					}
				}

				if (var4 == 947) {
					field147.method295(207);
					field147.method297(var3);
					field147.method331(var2);
					field147.method333(var5);
					field482 = 0;
					field483 = var3;
					field484 = var2;
					field485 = 2;
					if (TNOPEJNZ.field1272[var3].field1294 == field210) {
						field485 = 1;
					}

					if (TNOPEJNZ.field1272[var3].field1294 == field258) {
						field485 = 3;
					}
				}

				if (var4 == 904) {
					String var62 = field392[arg0];
					int var63 = var62.indexOf("@whi@");
					if (var63 != -1) {
						long var64 = XNWHEMGT.method576(var62.substring(var63 + 5).trim());
						int var66 = -1;
						for (int var67 = 0; var67 < field269; var67++) {
							if (field448[var67] == var64) {
								var66 = var67;
								break;
							}
						}

						if (var66 != -1 && field446[var66] > 0) {
							field518 = true;
							field501 = 0;
							field257 = true;
							field445 = "";
							field387 = 3;
							field226 = field448[var66];
							field496 = "Enter message to send to " + field295[var66];
						}
					}
				}

				if (var4 == 877) {
					TNOPEJNZ var68 = TNOPEJNZ.field1272[var3];
					field220 = 1;
					field221 = var3;
					field222 = var68.field1279;
					field469 = 0;
					field433 = true;
					String var69 = var68.field1286;
					if (var69.indexOf(" ") != -1) {
						var69 = var69.substring(0, var69.indexOf(" "));
					}

					String var70 = var68.field1286;
					if (var70.indexOf(" ") != -1) {
						var70 = var70.substring(var70.indexOf(" ") + 1);
					}

					field223 = var69 + " " + var68.field1314 + " " + var70;

					if (field222 == 16) {
						field433 = true;
						field356 = 3;
						field254 = true;
					}
				} else {
					if (var4 == 701 && method74(var5, var3, var2)) {
						field147.method295(29);
						field147.method297(field503 + var2);
						field147.method331(var5 >> 14 & 0x7FFF);
						field147.method331(field471);
						field147.method297(field472);
						field147.method333(field470);
						field147.method297(field504 + var3);
					}

					if (var4 == 1043) {
						method74(var5, var3, var2);
						field147.method295(185);
						field147.method297(var5 >> 14 & 0x7FFF);
						field147.method332(field504 + var3);
						field147.method297(field503 + var2);
					}

					if (var4 == 707) {
						method74(var5, var3, var2);
						field147.method295(208);
						field147.method331(field503 + var2);
						field147.method331(var5 >> 14 & 0x7FFF);
						field147.method331(field504 + var3);
					}

					if (var4 == 389) {
						boolean var71 = method171(var2, 0, 0, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 0, var3);
						if (!var71) {
							method171(var2, 0, 1, 2, field396.field1007[0], 0, false, 0, field396.field1008[0], 1, var3);
						}

						field347 = field89;
						field348 = field90;
						field350 = 2;
						field349 = 0;
						field147.method295(120);
						field147.method331(field503 + var2);
						field147.method331(field472);
						field147.method297(field471);
						field147.method332(field470);
						field147.method333(var5);
						field147.method297(field504 + var3);
					}

					if (var4 == 300) {
						field147.method295(40);
						field147.method297(var5);
						field147.method332(var2);
						field147.method332(var3);
						field482 = 0;
						field483 = var3;
						field484 = var2;
						field485 = 2;
						if (TNOPEJNZ.field1272[var3].field1294 == field210) {
							field485 = 1;
						}

						if (TNOPEJNZ.field1272[var3].field1294 == field258) {
							field485 = 3;
						}
					}

					field469 = 0;
					field220 = 0;
					field433 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLDHMMFTZG;)V")
	public final void method102(DHMMFTZG arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field531 == 0) {
			var2 = field458.method530(arg0.field530, arg0.field532, arg0.field533);
		}

		if (arg0.field531 == 1) {
			var2 = field458.method531(arg0.field533, arg0.field530, arg0.field532);
		}

		if (arg0.field531 == 2) {
			var2 = field458.method532(arg0.field530, arg0.field532, arg0.field533);
		}

		if (arg0.field531 == 3) {
			var2 = field458.method533(arg0.field530, arg0.field532, arg0.field533);
		}

		if (var2 != 0) {
			int var6 = field458.method534(arg0.field530, arg0.field532, arg0.field533, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field534 = var3;
		arg0.field536 = var4;
		arg0.field535 = var5;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method103() {
		for (HEJSGXMA var1 = (HEJSGXMA) field196.method393(); var1 != null; var1 = (HEJSGXMA) field196.method395()) {
			if (field122 != var1.field683 || field236 > var1.field678) {
				var1.method290();
			} else if (field236 >= var1.field677) {
				if (var1.field690 > 0) {
					NLPNWUNL var2 = field383[var1.field690 - 1];
					if (var2 != null && var2.field1019 >= 0 && var2.field1019 < 13312 && var2.field1020 >= 0 && var2.field1020 < 13312) {
						var1.method287(method173(var2.field1020, var2.field1019, var1.field683) - var1.field687, var2.field1019, var2.field1020, field236);
					}
				}

				if (var1.field690 < 0) {
					int var3 = -var1.field690 - 1;
					FVFJZZXQ var4;
					if (field352 == var3) {
						var4 = field396;
					} else {
						var4 = field213[var3];
					}

					if (var4 != null && var4.field1019 >= 0 && var4.field1019 < 13312 && var4.field1020 >= 0 && var4.field1020 < 13312) {
						var1.method287(method173(var4.field1020, var4.field1019, var1.field683) - var1.field687, var4.field1019, var4.field1020, field236);
					}
				}

				var1.method286(field99);
				field458.method515((int) var1.field682, -1, 60, false, field122, (int) var1.field680, var1, (int) var1.field681, var1.field691);
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method104() {
		if (field375 && field238 == 2 && AIYLKTEB.field31 != field122) {
			field231.method196();
			field311.method418(151, 257, "Loading - please wait.", 0);
			field311.method418(150, 256, "Loading - please wait.", 0xFFFFFF);
			field231.method197(field74, 4, 4);
			field238 = 1;
			field294 = System.currentTimeMillis();
		}

		if (field238 == 1) {
			int var1 = method105();
			if (var1 != 0 && System.currentTimeMillis() - field294 > 360000L) {
				signlink.reporterror(field291 + " glcfb " + field162 + "," + var1 + "," + field375 + "," + field302[0] + "," + field200.method571() + "," + field122 + "," + field297 + "," + field298);
				field294 = System.currentTimeMillis();
			}
		}

		if (field238 == 2 && field486 != field122) {
			field486 = field122;
			method87(field122);
		}
	}

	@ObfuscatedName("client.p(I)I")
	public final int method105() {
		for (int var1 = 0; var1 < field386.length; var1++) {
			if (field386[var1] == null && field127[var1] != -1) {
				return -1;
			}

			if (field143[var1] == null && field128[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field386.length; var3++) {
			byte[] var4 = field143[var3];
			if (var4 != null) {
				int var5 = (field126[var3] >> 8) * 64 - field503;
				int var6 = (field126[var3] & 0xFF) * 64 - field504;
				if (field337) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= AIYLKTEB.method24(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field171) {
			return -4;
		} else {
			field238 = 2;
			AIYLKTEB.field31 = field122;
			method131();
			field147.method295(88);
			return 0;
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method106(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field269; var3++) {
				if (field448[var3] == arg0) {
					field269--;
					field433 = true;

					for (int var4 = var3; var4 < field269; var4++) {
						field295[var4] = field295[var4 + 1];
						field446[var4] = field446[var4 + 1];
						field448[var4] = field448[var4 + 1];
					}

					field147.method295(193);
					field147.method302(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method107() {
		field309 = 0;
		int var1 = (field396.field1019 >> 7) + field503;
		int var2 = (field396.field1020 >> 7) + field504;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field309 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field309 = 1;
		}

		if (field309 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field309 = 0;
		}
	}

	@ObfuscatedName("client.c(IJ)V")
	public final void method108(long arg0) {
		if (arg0 != 0L) {
			if (field269 >= 100 && field209 != 1) {
				method111(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field269 >= 200) {
				method111(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = XNWHEMGT.method580(XNWHEMGT.method577(arg0));
				for (int var4 = 0; var4 < field269; var4++) {
					if (field448[var4] == arg0) {
						method111(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field364; var5++) {
					if (field369[var5] == arg0) {
						method111(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field396.field603)) {
					field295[field269] = var3;
					field448[field269] = arg0;
					field446[field269] = 0;
					field269++;
					field433 = true;
					field147.method295(217);
					field147.method302(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method109() {
		field123++;
		method132(true);
		method170(true);
		method132(false);
		method170(false);
		method103();
		method68();

		if (!field237) {
			int var1 = field426;
			if (field144 / 256 > var1) {
				var1 = field144 / 256;
			}

			if (field497[4] && field125[4] + 128 > var1) {
				var1 = field125[4] + 128;
			}

			int var2 = field427 + field390 & 0x7FF;
			method119(method173(field396.field1020, field396.field1019, field122) - 50, var1 * 3 + 600, field397, var2, field398, var1);
		}

		int var3;
		if (field237) {
			var3 = method191();
		} else {
			var3 = method190();
		}

		int var4 = field491;
		int var5 = field492;
		int var6 = field493;
		int var7 = field494;
		int var8 = field495;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field497[var9]) {
				int var10 = (int) (Math.random() * (field381[var9] * 2 + 1) + Math.sin(field431[var9] / 100.0D * field250[var9]) * field125[var9] - field381[var9]);
				if (var9 == 0) {
					field491 += var10;
				}

				if (var9 == 1) {
					field492 += var10;
				}

				if (var9 == 2) {
					field493 += var10;
				}

				if (var9 == 3) {
					field495 = field495 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field494 += var10;
					if (field494 < 128) {
						field494 = 128;
					}

					if (field494 > 383) {
						field494 = 383;
					}
				}
			}
		}

		int var11 = AZWEEYMC.field61;
		RTQSBWRH.field1153 = true;
		RTQSBWRH.field1156 = 0;
		RTQSBWRH.field1154 = field82 - 4;
		RTQSBWRH.field1155 = field83 - 4;
		FBOVVAQK.method233();
		field458.method543(var3, field493, field494, field495, field491, field492);
		field458.method518();
		method158();
		method141();
		method88(var11);
		method184();
		field231.method197(field74, 4, 4);
		field491 = var4;
		field492 = var5;
		field493 = var6;
		field494 = var7;
		field495 = var8;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(LTNOPEJNZ;II)I")
	public final int method110(TNOPEJNZ arg0, int arg1) {
		if (arg0.field1330 == null || arg1 >= arg0.field1330.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field1330[arg1];
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
					var8 = field342[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field425[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field245[var3[var5++]];
				}

				if (var7 == 4) {
					TNOPEJNZ var10 = TNOPEJNZ.field1272[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < MACPVTEQ.field862 && (!MACPVTEQ.method374(var11).field872 || field374)) {
						for (int var12 = 0; var12 < var10.field1317.length; var12++) {
							if (var11 + 1 == var10.field1317[var12]) {
								var8 += var10.field1297[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field418[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field296[field425[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field418[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field396.field627;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < EALUQMKU.field564; var13++) {
						if (EALUQMKU.field566[var13]) {
							var8 += field425[var13];
						}
					}
				}

				if (var7 == 10) {
					TNOPEJNZ var14 = TNOPEJNZ.field1272[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < MACPVTEQ.field862 && (!MACPVTEQ.method374(var15).field872 || field374)) {
						for (int var16 = 0; var16 < var14.field1317.length; var16++) {
							if (var14.field1317[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field376;
				}

				if (var7 == 12) {
					var8 = field193;
				}

				if (var7 == 13) {
					int var17 = field418[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					AIRUOZLB var20 = AIRUOZLB.field4[var19];
					int var21 = var20.field6;
					int var22 = var20.field7;
					int var23 = var20.field8;
					int var24 = field500[var23 - var22];
					var8 = field418[var21] >> var22 & var24;
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
					var8 = (field396.field1019 >> 7) + field503;
				}

				if (var7 == 19) {
					var8 = (field396.field1020 >> 7) + field504;
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

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;B)V")
	public final void method111(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field351 != -1) {
			field136 = arg1;
			field88 = 0;
		}

		if (field258 == -1) {
			field518 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field455[var4] = field455[var4 - 1];
			field456[var4] = field456[var4 - 1];
			field457[var4] = field457[var4 - 1];
		}

		field455[0] = arg0;
		field456[0] = arg2;
		field457[0] = arg1;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method112(int arg0) {
		TNOPEJNZ var2 = TNOPEJNZ.field1272[arg0];
		for (int var3 = 0; var3 < var2.field1321.length && var2.field1321[var3] != -1; var3++) {
			TNOPEJNZ var4 = TNOPEJNZ.field1272[var2.field1321[var3]];
			if (var4.field1304 == 1) {
				method112(var4.field1281);
			}

			var4.field1290 = 0;
			var4.field1305 = 0;
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method113() {
		try {
			int var1 = field396.field1019 + field272;
			int var2 = field396.field1020 + field165;
			if (field397 - var1 < -500 || field397 - var1 > 500 || field398 - var2 < -500 || field398 - var2 > 500) {
				field397 = var1;
				field398 = var2;
			}

			if (field397 != var1) {
				field397 += (var1 - field397) / 16;
			}

			if (field398 != var2) {
				field398 += (var2 - field398) / 16;
			}

			if (field92[1] == 1) {
				field428 += (-field428 - 24) / 2;
			} else if (field92[2] == 1) {
				field428 += (24 - field428) / 2;
			} else {
				field428 /= 2;
			}

			if (field92[3] == 1) {
				field429 += (12 - field429) / 2;
			} else if (field92[4] == 1) {
				field429 += (-field429 - 12) / 2;
			} else {
				field429 /= 2;
			}

			field427 = field428 / 2 + field427 & 0x7FF;
			field426 += field429 / 2;
			if (field426 < 128) {
				field426 = 128;
			}

			if (field426 > 383) {
				field426 = 383;
			}

			int var3 = field397 >> 7;
			int var4 = field398 >> 7;
			int var5 = method173(field398, field397, field122);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field122;
						if (var9 < 3 && (field172[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field341[var9][var7][var8];
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

			if (var11 > field144) {
				field144 += (var11 - field144) / 24;
			} else if (var11 < field144) {
				field144 += (var11 - field144) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field396.field1019 + "," + field396.field1020 + "," + field397 + "," + field398 + "," + field297 + "," + field298 + "," + field503 + "," + field504);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;ZIII)LHRXSNEYZ;")
	public final HRXSNEYZ method114(String arg0, String arg1, int arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field302[0] != null) {
				var6 = field302[0].method356(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field481.reset();
			field481.update(var6);
			int var8 = (int) field481.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new HRXSNEYZ(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method59("Requesting " + arg1, arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method94(arg0 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				JHKSAGUC var16 = new JHKSAGUC(var15);
				var16.field752 = 3;
				int var17 = var16.method310() + 6;
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
						method59("Loading " + arg1 + " - " + var22 + "%", arg3);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field302[0] != null) {
						field302[0].method357(var6, arg2, var6.length);
					}
				} catch (Exception var28) {
					field302[0] = null;
				}

				if (var6 != null) {
					field481.reset();
					field481.update(var6);
					int var23 = (int) field481.getValue();
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
						method59("Game updated - please reload page", arg3);
						var25 = 10;
					} else {
						method59(var11 + " - Retrying in " + var25, arg3);
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

				field403 = !field403;
			}
		}

		return new HRXSNEYZ(var6);
	}

	@ObfuscatedName("client.b(ZI)Z")
	public final boolean method115(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field414[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 217) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method116(int arg0) {
		int var2 = EINNWKRR.field568[arg0].field576;
		if (var2 != 0) {
			int var3 = field418[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					AZWEEYMC.method34(0.9D);
				}

				if (var3 == 2) {
					AZWEEYMC.method34(0.8D);
				}

				if (var3 == 3) {
					AZWEEYMC.method34(0.7D);
				}

				if (var3 == 4) {
					AZWEEYMC.method34(0.6D);
				}

				MACPVTEQ.field858.method388();
				field444 = true;
			}

			if (var2 == 3) {
				boolean var4 = field353;

				if (var3 == 0) {
					method177(field353, 0);
					field353 = true;
				}

				if (var3 == 1) {
					method177(field353, -400);
					field353 = true;
				}

				if (var3 == 2) {
					method177(field353, -800);
					field353 = true;
				}

				if (var3 == 3) {
					method177(field353, -1200);
					field353 = true;
				}

				if (var3 == 4) {
					field353 = false;
				}

				if (field353 != var4 && !field375) {
					if (field353) {
						field247 = field150;
						field248 = true;
						field200.method567(2, field247);
					} else {
						method89();
					}

					field98 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field450 = true;
					method151(0);
				}

				if (var3 == 1) {
					field450 = true;
					method151(-400);
				}

				if (var3 == 2) {
					field450 = true;
					method151(-800);
				}

				if (var3 == 3) {
					field450 = true;
					method151(-1200);
				}

				if (var3 == 4) {
					field450 = false;
				}
			}

			if (var2 == 5) {
				field499 = var3;
			}

			if (var2 == 6) {
				field389 = var3;
			}

			if (var2 == 8) {
				field145 = var3;
				field518 = true;
			}

			if (var2 == 9) {
				field430 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZII)V")
	public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg4 >= 1 && arg6 <= 102 && arg4 <= 102) {
			if (field375 && field122 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg5 == 0) {
				var8 = field458.method530(arg2, arg6, arg4);
			}

			if (arg5 == 1) {
				var8 = field458.method531(arg4, arg2, arg6);
			}

			if (arg5 == 2) {
				var8 = field458.method532(arg2, arg6, arg4);
			}

			if (arg5 == 3) {
				var8 = field458.method533(arg2, arg6, arg4);
			}

			if (var8 != 0) {
				int var12 = field458.method534(arg2, arg6, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg5 == 0) {
					field458.method521(arg2, arg6, arg4);
					SYTHBZWG var16 = SYTHBZWG.method491(var13);
					if (var16.field1216) {
						field436[arg2].method349(arg4, var14, var15, var16.field1173, arg6);
					}
				}

				if (arg5 == 1) {
					field458.method522(arg6, arg2, arg4);
				}

				if (arg5 == 2) {
					field458.method523(arg2, arg6, arg4);
					SYTHBZWG var17 = SYTHBZWG.method491(var13);
					if (var17.field1203 + arg6 > 103 || var17.field1203 + arg4 > 103 || var17.field1181 + arg6 > 103 || var17.field1181 + arg4 > 103) {
						return;
					}

					if (var17.field1216) {
						field436[arg2].method350(var17.field1203, arg4, arg6, var15, var17.field1173, var17.field1181);
					}
				}

				if (arg5 == 3) {
					field458.method524(arg6, arg2, arg4);
					SYTHBZWG var18 = SYTHBZWG.method491(var13);
					if (var18.field1216 && var18.field1198) {
						field436[arg2].method352(arg6, arg4);
					}
				}
			}

			if (arg1 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field172[1][arg6][arg4] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				AIYLKTEB.method19(arg6, arg2, field341, field436[arg2], arg1, arg0, arg3, arg4, field458, var19);
				return;
			}
		}
	}

	@ObfuscatedName("client.j(B)Z")
	public final boolean method118() {
		if (field279 == null) {
			return false;
		}

		try {
			int var1 = field279.method435();
			if (var1 == 0) {
				return false;
			}

			if (field202 == -1) {
				field279.method436(field219.field751, 0, 1);
				field202 = field219.field751[0] & 0xFF;
				if (field246 != null) {
					field202 = field202 - field246.method589() & 0xFF;
				}

				field201 = LBBFJFVU.field793[field202];
				var1--;
			}

			if (field201 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field279.method436(field219.field751, 0, 1);
				field201 = field219.field751[0] & 0xFF;
				var1--;
			}

			if (field201 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field279.method436(field219.field751, 0, 2);
				field219.field752 = 0;
				field201 = field219.method308();
				var1 -= 2;
			}

			if (var1 < field201) {
				return false;
			}

			field219.field752 = 0;
			field279.method436(field219.field751, 0, field201);
			field203 = 0;
			field380 = field379;
			field379 = field378;
			field378 = field202;

			if (field202 == 233) {
				field237 = true;
				field329 = field219.method306();
				field330 = field219.method306();
				field331 = field219.method308();
				field332 = field219.method306();
				field333 = field219.method306();
				if (field333 >= 100) {
					int var2 = field329 * 128 + 64;
					int var3 = field330 * 128 + 64;
					int var4 = method173(var3, var2, field122) - field331;
					int var5 = var2 - field491;
					int var6 = var4 - field492;
					int var7 = var3 - field493;
					int var8 = (int) Math.sqrt(var5 * var5 + var7 * var7);
					field494 = (int) (Math.atan2(var6, var8) * 325.949D) & 0x7FF;
					field495 = (int) (Math.atan2(var5, var7) * -325.949D) & 0x7FF;

					if (field494 < 128) {
						field494 = 128;
					}

					if (field494 > 383) {
						field494 = 383;
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 122) {
				field340 = field219.method335();
				field405 = field219.method308();
				field282 = field219.method342();
				field377 = field219.method325();
				field188 = field219.method327();
				if (field282 != 0 && field210 == -1) {
					signlink.dnslookup(XNWHEMGT.method579(field282));
					method145();
					short var9 = 650;
					if (field377 != 201 || field188 == 1) {
						var9 = 655;
					}

					field276 = "";
					field275 = false;

					for (int var10 = 0; var10 < TNOPEJNZ.field1272.length; var10++) {
						if (TNOPEJNZ.field1272[var10] != null && TNOPEJNZ.field1272[var10].field1307 == var9) {
							field210 = TNOPEJNZ.field1272[var10].field1294;
							break;
						}
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 136) {
				field364 = field201 / 8;
				for (int var11 = 0; var11 < field364; var11++) {
					field369[var11] = field219.method312();
				}

				field202 = -1;
				return true;
			}

			if (field202 == 165) {
				int var12 = field219.method340();
				int var13 = field219.method308();
				field290[var13] = var12;

				if (field418[var13] != var12) {
					field418[var13] = var12;
					method116(var13);
					field433 = true;

					if (field351 != -1) {
						field518 = true;
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 91) {
				for (int var14 = 0; var14 < field418.length; var14++) {
					if (field418[var14] != field290[var14]) {
						field418[var14] = field290[var14];
						method116(var14);
						field433 = true;
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 20) {
				if (field356 == 12) {
					field433 = true;
				}

				field376 = field219.method306();
				field202 = -1;
				return true;
			}

			if (field202 == 63) {
				field195 = field219.method326();
				if (field356 == field195) {
					if (field195 == 3) {
						field356 = 1;
					} else {
						field356 = 3;
					}

					field433 = true;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 227) {
				int var15 = field219.method336();
				int var16 = field219.method325();

				if (var15 == 0xFFFF) {
					var15 = -1;
				}

				field343[var16] = var15;
				field433 = true;
				field254 = true;
				field202 = -1;
				return true;
			}

			if (field202 == 192) {
				int var17 = field219.method306();
				int var18 = field219.method306();
				int var19 = field219.method306();
				int var20 = field219.method306();
				field497[var17] = true;
				field381[var17] = var18;
				field125[var17] = var19;
				field431[var17] = var20;
				field250[var17] = 0;
				field202 = -1;
				return true;
			}

			if (field202 == 18) {
				int var21 = field219.method334();
				int var22 = field219.method335();
				TNOPEJNZ var23 = TNOPEJNZ.field1272[var21];
				if (var23 != null && var23.field1304 == 0) {
					if (var22 < 0) {
						var22 = 0;
					}

					if (var22 > var23.field1292 - var23.field1303) {
						var22 = var23.field1292 - var23.field1303;
					}

					var23.field1323 = var22;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 25) {
				int var24 = field219.method308();
				int var25 = field219.method334();
				int var26 = field219.method308();
				int var27 = field219.method334();
				TNOPEJNZ.field1272[var26].field1309 = var27;
				TNOPEJNZ.field1272[var26].field1310 = var25;
				TNOPEJNZ.field1272[var26].field1308 = var24;
				field202 = -1;
				return true;
			}

			if (field202 == 217) {
				field103 = field219.method306();
				field242 = field219.method306();
				field478 = field219.method306();
				field163 = true;
				field518 = true;
				field202 = -1;
				return true;
			}

			if (field202 == 232) {
				field257 = false;
				field501 = 1;
				field475 = "";
				field518 = true;
				field202 = -1;
				return true;
			}

			if (field202 == 250) {
				method168(field219, field201);
				field171 = false;
				field202 = -1;
				return true;
			}

			if (field202 == 245) {
				int var28 = field219.method337();
				field351 = var28;
				field518 = true;
				field202 = -1;
				return true;
			}

			if (field202 == 178) {
				int var29 = field219.method308();
				int var30 = field219.method335();
				TNOPEJNZ.field1272[var29].field1269 = 1;
				TNOPEJNZ.field1272[var29].field1270 = var30;
				field202 = -1;
				return true;
			}

			if (field202 == 133) {
				int var31 = field219.method308();
				if (var31 == 0xFFFF) {
					var31 = -1;
				}

				if (field150 != var31 && field353 && !field375 && field98 == 0) {
					field247 = var31;
					field248 = true;
					field200.method567(2, field247);
				}

				field150 = var31;
				field202 = -1;
				return true;
			}

			if (field202 == 24) {
				int var32 = field219.method339();
				int var33 = field219.method334();
				if (field353 && !field375) {
					field247 = var33;
					field248 = false;
					field200.method567(2, field247);
					field98 = var32;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 163) {
				int var34 = field219.method308();
				int var35 = field219.method306();
				int var36 = field219.method308();
				if (field450 && !field375 && field267 < 50) {
					field104[field267] = var34;
					field164[field267] = var35;
					field366[field267] = PWXXEHUE.field931[var34] + var36;
					field267++;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 252) {
				field515 = field219.method336() * 30;
				field202 = -1;
				return true;
			}

			if (field202 == 11) {
				field299 = field219.method306();
				field202 = -1;
				return true;
			}

			if (field202 == 42) {
				long var37 = field219.method312();
				int var39 = field219.method311();
				int var40 = field219.method306();
				boolean var41 = false;
				for (int var42 = 0; var42 < 100; var42++) {
					if (field106[var42] == var39) {
						var41 = true;
						break;
					}
				}

				if (var40 <= 1) {
					for (int var43 = 0; var43 < field364; var43++) {
						if (field369[var43] == var37) {
							var41 = true;
							break;
						}
					}
				}

				if (!var41 && field309 == 0) {
					try {
						field106[field191] = var39;
						field191 = (field191 + 1) % 100;
						String var44 = JFSYEOAW.method291(field201 - 13, field219);
						if (var40 != 3) {
							var44 = GQUAQVLD.method257(var44);
						}

						if (var40 == 2 || var40 == 3) {
							method111(7, var44, "@cr2@" + XNWHEMGT.method580(XNWHEMGT.method577(var37)));
						} else if (var40 == 1) {
							method111(7, var44, "@cr1@" + XNWHEMGT.method580(XNWHEMGT.method577(var37)));
						} else {
							method111(3, var44, XNWHEMGT.method580(XNWHEMGT.method577(var37)));
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 243) {
				for (int var46 = 0; var46 < field213.length; var46++) {
					if (field213[var46] != null) {
						field213[var46].field1035 = -1;
					}
				}

				for (int var47 = 0; var47 < field383.length; var47++) {
					if (field383[var47] != null) {
						field383[var47].field1035 = -1;
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 214) {
				method181(field219, field201);
				field202 = -1;
				return true;
			}

			if (field202 == 100) {
				int var48 = field219.method308();
				boolean var49 = field219.method306() == 1;
				TNOPEJNZ.field1272[var48].field1275 = var49;
				field202 = -1;
				return true;
			}

			if (field202 == 191) {
				int var50 = field219.method308();
				int var51 = field219.method336();
				int var52 = field219.method308();

				if (var50 == 0xFFFF) {
					TNOPEJNZ.field1272[var51].field1269 = 0;
					field202 = -1;
					return true;
				}

				MACPVTEQ var53 = MACPVTEQ.method374(var50);
				TNOPEJNZ.field1272[var51].field1269 = 4;
				TNOPEJNZ.field1272[var51].field1270 = var50;
				TNOPEJNZ.field1272[var51].field1309 = var53.field890;
				TNOPEJNZ.field1272[var51].field1310 = var53.field865;
				TNOPEJNZ.field1272[var51].field1308 = var53.field851 * 100 / var52;
				field202 = -1;
				return true;
			}

			if (field202 == 221) {
				int var54 = field219.method308();
				TNOPEJNZ var55 = TNOPEJNZ.field1272[var54];
				for (int var56 = 0; var56 < var55.field1317.length; var56++) {
					var55.field1317[var56] = -1;
					var55.field1317[var56] = 0;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 6) {
				int var57 = field219.method334();
				method112(var57);

				if (field258 != -1) {
					field258 = -1;
					field518 = true;
				}

				if (field501 != 0) {
					field501 = 0;
					field518 = true;
				}

				field235 = var57;
				field433 = true;
				field254 = true;
				field210 = -1;
				field132 = false;
				field202 = -1;
				return true;
			}

			if (field202 == 224) {
				field406 = field219.method327();
				field407 = field219.method326();
				field202 = -1;
				return true;
			}

			if (field202 == 196) {
				if (field235 != -1) {
					field235 = -1;
					field433 = true;
					field254 = true;
				}

				if (field258 != -1) {
					field258 = -1;
					field518 = true;
				}

				if (field501 != 0) {
					field501 = 0;
					field518 = true;
				}

				field210 = -1;
				field132 = false;
				field202 = -1;
				return true;
			}

			if (field202 == 53) {
				int var58 = field219.method335();
				method112(var58);

				if (field235 != -1) {
					field235 = -1;
					field433 = true;
					field254 = true;
				}

				if (field258 != -1) {
					field258 = -1;
					field518 = true;
				}

				if (field501 != 0) {
					field501 = 0;
					field518 = true;
				}

				field210 = var58;
				field132 = false;
				field202 = -1;
				return true;
			}

			if (field202 == 198) {
				int var59 = field219.method335();
				int var60 = field219.method336();
				int var61 = var59 >> 10 & 0x1F;
				int var62 = var59 >> 5 & 0x1F;
				int var63 = var59 & 0x1F;
				TNOPEJNZ.field1272[var60].field1331 = (var63 << 3) + (var61 << 19) + (var62 << 11);
				field202 = -1;
				return true;
			}

			if (field202 == 104) {
				byte var64 = field219.method328();
				int var65 = field219.method335();
				field290[var65] = var64;

				if (field418[var65] != var64) {
					field418[var65] = var64;
					method116(var65);
					field433 = true;

					if (field351 != -1) {
						field518 = true;
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 228) {
				int var66 = field219.method308();
				method112(var66);

				if (field235 != -1) {
					field235 = -1;
					field433 = true;
					field254 = true;
				}

				field258 = var66;
				field518 = true;
				field210 = -1;
				field132 = false;
				field202 = -1;
				return true;
			}

			if (field202 == 12) {
				int var67 = field219.method335();
				String var68 = field219.method313();
				TNOPEJNZ.field1272[var67].field1322 = var68;

				if (field343[field356] == TNOPEJNZ.field1272[var67].field1294) {
					field433 = true;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 151) {
				field433 = true;
				int var69 = field219.method325();
				int var70 = field219.method340();
				int var71 = field219.method327();
				field245[var71] = var70;
				field342[var71] = var69;
				field425[var71] = 1;
				for (int var72 = 0; var72 < 98; var72++) {
					if (var70 >= field296[var72]) {
						field425[var71] = var72 + 2;
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 213) {
				field270 = field219.method306();
				field433 = true;
				field202 = -1;
				return true;
			}

			if (field202 == 118) {
				int var73 = field219.method334();
				TNOPEJNZ.field1272[var73].field1269 = 3;

				if (field396.field609 == null) {
					TNOPEJNZ.field1272[var73].field1270 = (field396.field608[11] << 5) + (field396.field608[8] << 10) + (field396.field608[0] << 15) + (field396.field625[0] << 25) + (field396.field625[4] << 20) + field396.field608[1];
				} else {
					TNOPEJNZ.field1272[var73].field1270 = (int) (field396.field609.field1062 + 0x12345678L);
				}

				field202 = -1;
				return true;
			}

			if (field202 == 123) {
				field352 = field219.method334();
				field209 = field219.method326();
				field202 = -1;
				return true;
			}

			if (field202 == 41) {
				field280 = field219.method306();
				field202 = -1;
				return true;
			}

			if (field202 == 116) {
				field356 = field219.method327();
				field433 = true;
				field254 = true;
				field202 = -1;
				return true;
			}

			if (field202 == 3) {
				int var74 = field219.method337();
				if (var74 >= 0) {
					method112(var74);
				}

				field271 = var74;
				field202 = -1;
				return true;
			}

			if (field202 == 242) {
				field237 = false;

				for (int var75 = 0; var75 < 5; var75++) {
					field497[var75] = false;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 23) {
				field433 = true;
				int var76 = field219.method308();
				TNOPEJNZ var77 = TNOPEJNZ.field1272[var76];
				while (field219.field752 < field201) {
					int var78 = field219.method320();
					int var79 = field219.method308();
					int var80 = field219.method306();
					if (var80 == 255) {
						var80 = field219.method311();
					}

					if (var78 >= 0 && var78 < var77.field1317.length) {
						var77.field1317[var78] = var79;
						var77.field1297[var78] = var80;
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 92) {
				field237 = true;
				field285 = field219.method306();
				field286 = field219.method306();
				field287 = field219.method308();
				field288 = field219.method306();
				field289 = field219.method306();
				if (field289 >= 100) {
					field491 = field285 * 128 + 64;
					field493 = field286 * 128 + 64;
					field492 = method173(field493, field491, field122) - field287;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 102) {
				String var81 = field219.method313();
				if (var81.endsWith(":tradereq:")) {
					String var82 = var81.substring(0, var81.indexOf(":"));
					long var83 = XNWHEMGT.method576(var82);
					boolean var85 = false;
					for (int var86 = 0; var86 < field364; var86++) {
						if (field369[var86] == var83) {
							var85 = true;
							break;
						}
					}

					if (!var85 && field309 == 0) {
						method111(4, "wishes to trade with you.", var82);
					}
				} else if (var81.endsWith(":duelreq:")) {
					String var87 = var81.substring(0, var81.indexOf(":"));
					long var88 = XNWHEMGT.method576(var87);
					boolean var90 = false;
					for (int var91 = 0; var91 < field364; var91++) {
						if (field369[var91] == var88) {
							var90 = true;
							break;
						}
					}

					if (!var90 && field309 == 0) {
						method111(8, "wishes to duel with you.", var87);
					}
				} else if (var81.endsWith(":chalreq:")) {
					String var92 = var81.substring(0, var81.indexOf(":"));
					long var93 = XNWHEMGT.method576(var92);
					boolean var95 = false;
					for (int var96 = 0; var96 < field364; var96++) {
						if (field369[var96] == var93) {
							var95 = true;
							break;
						}
					}

					if (!var95 && field309 == 0) {
						String var97 = var81.substring(var81.indexOf(":") + 1, var81.length() - 9);
						method111(8, var97, var92);
					}
				} else {
					method111(0, var81, "");
				}

				field202 = -1;
				return true;
			}

			if (field202 == 0) {
				field406 = field219.method325();
				field407 = field219.method326();
				for (int var98 = field406; var98 < field406 + 8; var98++) {
					for (int var99 = field407; var99 < field407 + 8; var99++) {
						if (field435[field122][var98][var99] != null) {
							field435[field122][var98][var99] = null;
							method148(var98, var99);
						}
					}
				}

				for (DHMMFTZG var100 = (DHMMFTZG) field516.method393(); var100 != null; var100 = (DHMMFTZG) field516.method395()) {
					if (var100.field532 >= field406 && var100.field532 < field406 + 8 && var100.field533 >= field407 && var100.field533 < field407 + 8 && field122 == var100.field530) {
						var100.field540 = 0;
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 94) {
				field406 = field219.method306();
				field407 = field219.method327();

				while (field219.field752 < field201) {
					int var101 = field219.method306();
					method154(field219, var101);
				}

				field202 = -1;
				return true;
			}

			if (field202 == 159 || field202 == 32 || field202 == 65 || field202 == 78 || field202 == 183 || field202 == 223 || field202 == 4 || field202 == 19 || field202 == 189 || field202 == 101 || field202 == 27) {
				method154(field219, field202);
				field202 = -1;
				return true;
			}

			if (field202 == 157) {
				field440 = 0;
				field202 = -1;
				return true;
			}

			if (field202 == 38 || field202 == 154) {
				int var102 = field297;
				int var103 = field298;
				if (field202 == 38) {
					var102 = field219.method335();
					var103 = field219.method308();
					field337 = false;
				}

				if (field202 == 154) {
					var103 = field219.method308();
					field219.method316();

					for (int var104 = 0; var104 < 4; var104++) {
						for (int var105 = 0; var105 < 13; var105++) {
							for (int var106 = 0; var106 < 13; var106++) {
								int var107 = field219.method317(1);
								if (var107 == 1) {
									field161[var104][var105][var106] = field219.method317(26);
								} else {
									field161[var104][var105][var106] = -1;
								}
							}
						}
					}

					field219.method318();
					var102 = field219.method334();
					field337 = true;
				}

				if (field297 == var102 && field298 == var103 && field238 == 2) {
					field202 = -1;
					return true;
				}

				field297 = var102;
				field298 = var103;
				field503 = (field297 - 6) * 8;
				field504 = (field298 - 6) * 8;
				field449 = false;
				if ((field297 / 8 == 48 || field297 / 8 == 49) && field298 / 8 == 48) {
					field449 = true;
				}

				if (field297 / 8 == 48 && field298 / 8 == 148) {
					field449 = true;
				}

				field238 = 1;
				field294 = System.currentTimeMillis();
				field231.method196();
				field311.method418(151, 257, "Loading - please wait.", 0);
				field311.method418(150, 256, "Loading - please wait.", 0xFFFFFF);
				field231.method197(field74, 4, 4);

				if (field202 == 38) {
					int var108 = 0;
					for (int var109 = (field297 - 6) / 8; var109 <= (field297 + 6) / 8; var109++) {
						for (int var110 = (field298 - 6) / 8; var110 <= (field298 + 6) / 8; var110++) {
							var108++;
						}
					}

					field386 = new byte[var108][];
					field143 = new byte[var108][];
					field126 = new int[var108];
					field127 = new int[var108];
					field128 = new int[var108];
					int var111 = 0;
					for (int var112 = (field297 - 6) / 8; var112 <= (field297 + 6) / 8; var112++) {
						for (int var113 = (field298 - 6) / 8; var113 <= (field298 + 6) / 8; var113++) {
							field126[var111] = (var112 << 8) + var113;

							if (field449 && (var113 == 49 || var113 == 149 || var113 == 147 || var112 == 50 || var112 == 49 && var113 == 47)) {
								field127[var111] = -1;
								field128[var111] = -1;
								var111++;
							} else {
								int var114 = field127[var111] = field200.method563(0, var112, var113);
								if (var114 != -1) {
									field200.method567(3, var114);
								}

								int var115 = field128[var111] = field200.method563(1, var112, var113);
								if (var115 != -1) {
									field200.method567(3, var115);
								}

								var111++;
							}
						}
					}
				}

				if (field202 == 154) {
					int var116 = 0;
					int[] var117 = new int[676];
					for (int var118 = 0; var118 < 4; var118++) {
						for (int var119 = 0; var119 < 13; var119++) {
							for (int var120 = 0; var120 < 13; var120++) {
								int var121 = field161[var118][var119][var120];
								if (var121 != -1) {
									int var122 = var121 >> 14 & 0x3FF;
									int var123 = var121 >> 3 & 0x7FF;
									int var124 = (var122 / 8 << 8) + var123 / 8;
									for (int var125 = 0; var125 < var116; var125++) {
										if (var117[var125] == var124) {
											var124 = -1;
											break;
										}
									}

									if (var124 != -1) {
										var117[var116++] = var124;
									}
								}
							}
						}
					}

					field386 = new byte[var116][];
					field143 = new byte[var116][];
					field126 = new int[var116];
					field127 = new int[var116];
					field128 = new int[var116];
					for (int var126 = 0; var126 < var116; var126++) {
						int var127 = field126[var126] = var117[var126];
						int var128 = var127 >> 8 & 0xFF;
						int var129 = var127 & 0xFF;
						int var130 = field127[var126] = field200.method563(0, var128, var129);
						if (var130 != -1) {
							field200.method567(3, var130);
						}

						int var131 = field128[var126] = field200.method563(1, var128, var129);
						if (var131 != -1) {
							field200.method567(3, var131);
						}
					}
				}

				int var132 = field503 - field505;
				int var133 = field504 - field506;
				field505 = field503;
				field506 = field504;

				for (int var134 = 0; var134 < 16384; var134++) {
					NLPNWUNL var135 = field383[var134];
					if (var135 != null) {
						for (int var136 = 0; var136 < 10; var136++) {
							var135.field1007[var136] -= var132;
							var135.field1008[var136] -= var133;
						}

						var135.field1019 -= var132 * 128;
						var135.field1020 -= var133 * 128;
					}
				}

				for (int var137 = 0; var137 < field211; var137++) {
					FVFJZZXQ var138 = field213[var137];
					if (var138 != null) {
						for (int var139 = 0; var139 < 10; var139++) {
							var138.field1007[var139] -= var132;
							var138.field1008[var139] -= var133;
						}

						var138.field1019 -= var132 * 128;
						var138.field1020 -= var133 * 128;
					}
				}

				field171 = true;
				byte var140 = 0;
				byte var141 = 104;
				byte var142 = 1;
				if (var132 < 0) {
					var140 = 103;
					var141 = -1;
					var142 = -1;
				}

				byte var143 = 0;
				byte var144 = 104;
				byte var145 = 1;
				if (var133 < 0) {
					var143 = 103;
					var144 = -1;
					var145 = -1;
				}

				for (int var146 = var140; var146 != var141; var146 += var142) {
					for (int var147 = var143; var147 != var144; var147 += var145) {
						int var148 = var132 + var146;
						int var149 = var133 + var147;
						for (int var150 = 0; var150 < 4; var150++) {
							if (var148 >= 0 && var149 >= 0 && var148 < 104 && var149 < 104) {
								field435[var150][var146][var147] = field435[var150][var148][var149];
							} else {
								field435[var150][var146][var147] = null;
							}
						}
					}
				}

				for (DHMMFTZG var151 = (DHMMFTZG) field516.method393(); var151 != null; var151 = (DHMMFTZG) field516.method395()) {
					var151.field532 -= var132;
					var151.field533 -= var133;
					if (var151.field532 < 0 || var151.field533 < 0 || var151.field532 >= 104 || var151.field533 >= 104) {
						var151.method290();
					}
				}

				if (field440 != 0) {
					field440 -= var132;
					field441 -= var133;
				}

				field237 = false;
				field202 = -1;
				return true;
			}

			if (field202 == 182) {
				field433 = true;
				int var152 = field219.method308();
				TNOPEJNZ var153 = TNOPEJNZ.field1272[var152];
				int var154 = field219.method308();
				for (int var155 = 0; var155 < var154; var155++) {
					int var156 = field219.method327();
					if (var156 == 255) {
						var156 = field219.method342();
					}

					var153.field1317[var155] = field219.method335();
					var153.field1297[var155] = var156;
				}

				for (int var157 = var154; var157 < var153.field1317.length; var157++) {
					var153.field1317[var157] = 0;
					var153.field1297[var157] = 0;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 90) {
				method179();
				field202 = -1;
				return false;
			}

			if (field202 == 229) {
				field257 = false;
				field501 = 2;
				field475 = "";
				field518 = true;
				field202 = -1;
				return true;
			}

			if (field202 == 51) {
				field117 = field219.method306();
				if (field117 == 1) {
					field339 = field219.method308();
				}

				if (field117 >= 2 && field117 <= 6) {
					if (field117 == 2) {
						field510 = 64;
						field511 = 64;
					}

					if (field117 == 3) {
						field510 = 0;
						field511 = 64;
					}

					if (field117 == 4) {
						field510 = 128;
						field511 = 64;
					}

					if (field117 == 5) {
						field510 = 64;
						field511 = 0;
					}

					if (field117 == 6) {
						field510 = 64;
						field511 = 128;
					}

					field117 = 2;
					field507 = field219.method308();
					field508 = field219.method308();
					field509 = field219.method306();
				}

				if (field117 == 10) {
					field394 = field219.method308();
				}

				field202 = -1;
				return true;
			}

			if (field202 == 75) {
				long var158 = field219.method312();
				int var160 = field219.method306();
				String var161 = XNWHEMGT.method580(XNWHEMGT.method577(var158));
				for (int var162 = 0; var162 < field269; var162++) {
					if (field448[var162] == var158) {
						if (field446[var162] != var160) {
							field446[var162] = var160;
							field433 = true;

							if (var160 > 0) {
								method111(5, var161 + " has logged in.", "");
							}

							if (var160 == 0) {
								method111(5, var161 + " has logged out.", "");
							}
						}

						var161 = null;
						break;
					}
				}

				if (var161 != null && field269 < 200) {
					field448[field269] = var158;
					field295[field269] = var161;
					field446[field269] = var160;
					field269++;
					field433 = true;
				}

				boolean var163 = false;
				while (!var163) {
					var163 = true;
					for (int var164 = 0; var164 < field269 - 1; var164++) {
						if (field446[var164] != field372 && field446[var164 + 1] == field372 || field446[var164] == 0 && field446[var164 + 1] != 0) {
							int var165 = field446[var164];
							field446[var164] = field446[var164 + 1];
							field446[var164 + 1] = var165;
							String var166 = field295[var164];
							field295[var164] = field295[var164 + 1];
							field295[var164 + 1] = var166;
							long var167 = field448[var164];
							field448[var164] = field448[var164 + 1];
							field448[var164 + 1] = var167;
							field433 = true;
							var163 = false;
						}
					}
				}

				field202 = -1;
				return true;
			}

			if (field202 == 255) {
				int var169 = field219.method306();
				String var170 = field219.method313();
				int var171 = field219.method306();
				if (var171 >= 1 && var171 <= 5) {
					if (var170.equalsIgnoreCase("null")) {
						var170 = null;
					}

					field513[var171 - 1] = var170;
					field514[var171 - 1] = var169 == 0;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 211) {
				if (field356 == 12) {
					field433 = true;
				}

				field193 = field219.method309();
				field202 = -1;
				return true;
			}

			if (field202 == 111) {
				int var172 = field219.method338();
				int var173 = field219.method334();
				TNOPEJNZ var174 = TNOPEJNZ.field1272[var173];
				var174.field1287 = var172;

				if (var172 == -1) {
					var174.field1290 = 0;
					var174.field1305 = 0;
				}

				field202 = -1;
				return true;
			}

			if (field202 == 10) {
				int var175 = field219.method335();
				int var176 = field219.method334();

				if (field258 != -1) {
					field258 = -1;
					field518 = true;
				}

				if (field501 != 0) {
					field501 = 0;
					field518 = true;
				}

				field210 = var175;
				field235 = var176;
				field433 = true;
				field254 = true;
				field132 = false;
				field202 = -1;
				return true;
			}

			if (field202 == 206) {
				int var177 = field219.method309();
				int var178 = field219.method338();
				int var179 = field219.method308();
				TNOPEJNZ var180 = TNOPEJNZ.field1272[var179];
				var180.field1293 = var177;
				var180.field1312 = var178;
				field202 = -1;
				return true;
			}

			if (field202 == 68) {
				int var181 = field219.method308();
				int var182 = field219.method308();
				TNOPEJNZ.field1272[var181].field1269 = 2;
				TNOPEJNZ.field1272[var181].field1270 = var182;
				field202 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field202 + "," + field201 + " - " + field379 + "," + field380);
			method179();
		} catch (IOException var187) {
			method140();
		} catch (Exception var188) {
			String var184 = "T2 - " + field202 + "," + field379 + "," + field380 + " - " + field201 + "," + (field396.field1007[0] + field503) + "," + (field396.field1008[0] + field504) + " - ";
			for (int var185 = 0; var185 < field201 && var185 < 50; var185++) {
				var184 = var184 + field219.field751[var185] + ",";
			}

			signlink.reporterror(var184);
			method179();
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = RTQSBWRH.field1158[var7];
			int var13 = RTQSBWRH.field1159[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = RTQSBWRH.field1158[var8];
			int var16 = RTQSBWRH.field1159[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field491 = arg2 - var9;
		field492 = arg0 - var10;
		field493 = arg4 - var11;
		field494 = arg5;
		field495 = arg3;
	}

	@ObfuscatedName("client.k(B)Ljava/lang/String;")
	public final String method120() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field77 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(BLTNOPEJNZ;)Z")
	public final boolean method121(TNOPEJNZ arg0) {
		int var2 = arg0.field1307;
		if (field270 == 2) {
			if (var2 == 201) {
				field518 = true;
				field501 = 0;
				field257 = true;
				field445 = "";
				field387 = 1;
				field496 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field518 = true;
				field501 = 0;
				field257 = true;
				field445 = "";
				field387 = 2;
				field496 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field205 = 250;
			return true;
		}

		if (var2 == 501) {
			field518 = true;
			field501 = 0;
			field257 = true;
			field445 = "";
			field387 = 4;
			field496 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field518 = true;
			field501 = 0;
			field257 = true;
			field445 = "";
			field387 = 5;
			field496 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field102[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = DQSOHZWU.field548 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= DQSOHZWU.field548) {
							var5 = 0;
						}
					}

					if (!DQSOHZWU.field549[var5].field555 && DQSOHZWU.field549[var5].field550 == var3 + (field421 ? 0 : 7)) {
						break;
					}
				}

				field102[var3] = var5;
				field194 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field168[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field274[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field274[var6].length) {
					var8 = 0;
				}
			}

			field168[var6] = var8;
			field194 = true;
		}

		if (var2 == 324 && !field421) {
			field421 = true;
			method96();
		}

		if (var2 == 325 && field421) {
			field421 = false;
			method96();
		}

		if (var2 == 326) {
			field147.method295(253);
			field147.method296(field421 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field147.method296(field102[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field147.method296(field168[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field275 = !field275;
		}

		if (var2 >= 601 && var2 <= 612) {
			method145();

			if (field276.length() > 0) {
				field147.method295(19);
				field147.method302(XNWHEMGT.method576(field276));
				field147.method296(var2 - 601);
				field147.method296(field275 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method122() {
		for (int var1 = -1; var1 < field214; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field212;
			} else {
				var2 = field215[var1];
			}

			FVFJZZXQ var3 = field213[var2];
			if (var3 != null) {
				method161(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(IZLJHKSAGUC;)V")
	public final void method123(int arg0, JHKSAGUC arg1) {
		arg1.method316();
		int var3 = arg1.method317(1);
		if (var3 != 0) {
			int var4 = arg1.method317(2);
			if (var4 == 0) {
				field217[field216++] = field212;
			} else if (var4 == 1) {
				int var5 = arg1.method317(3);
				field396.method439(var5, false);
				int var6 = arg1.method317(1);
				if (var6 == 1) {
					field217[field216++] = field212;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method317(3);
				field396.method439(var7, true);
				int var8 = arg1.method317(3);
				field396.method439(var8, true);
				int var9 = arg1.method317(1);
				if (var9 == 1) {
					field217[field216++] = field212;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method317(1);
				if (var10 == 1) {
					field217[field216++] = field212;
				}

				field122 = arg1.method317(2);
				int var11 = arg1.method317(1);
				int var12 = arg1.method317(7);
				int var13 = arg1.method317(7);
				field396.method440(var12, var11 == 1, var13);
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method124() {
		if (field283 >= 2 || field469 != 0 || field220 != 0) {
			String var1;
			if (field469 == 1 && field283 < 2) {
				var1 = "Use " + field473 + " with...";
			} else if (field220 == 1 && field283 < 2) {
				var1 = field223 + "...";
			} else {
				var1 = field392[field283 - 1];
			}

			if (field283 > 2) {
				var1 = var1 + "@whi@ / " + (field283 - 2) + " more options";
			}

			field312.method427(true, var1, 15, field236 / 1000, 0xFFFFFF, 4);
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method125() {
		if (field469 == 0 && field220 == 0) {
			field392[field283] = "Walk here";
			field414[field283] = 505;
			field412[field283] = field82;
			field413[field283] = field83;
			field283++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < RTQSBWRH.field1156; var2++) {
			int var3 = RTQSBWRH.field1157[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field458.method534(field122, var4, var5, var3) >= 0) {
					SYTHBZWG var8 = SYTHBZWG.method491(var7);
					if (var8.field1182 != null) {
						var8 = var8.method490();
					}

					if (var8 == null) {
						continue;
					}

					if (field469 == 1) {
						field392[field283] = "Use " + field473 + " with @cya@" + var8.field1207;
						field414[field283] = 701;
						field415[field283] = var3;
						field412[field283] = var4;
						field413[field283] = var5;
						field283++;
					} else if (field220 != 1) {
						if (var8.field1195 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1195[var9] != null) {
									field392[field283] = var8.field1195[var9] + " @cya@" + var8.field1207;

									if (var9 == 0) {
										field414[field283] = 707;
									}

									if (var9 == 1) {
										field414[field283] = 919;
									}

									if (var9 == 2) {
										field414[field283] = 745;
									}

									if (var9 == 3) {
										field414[field283] = 412;
									}

									if (var9 == 4) {
										field414[field283] = 1043;
									}

									field415[field283] = var3;
									field412[field283] = var4;
									field413[field283] = var5;
									field283++;
								}
							}
						}

						field392[field283] = "Examine @cya@" + var8.field1207;
						field414[field283] = 1912;
						field415[field283] = var8.field1186 << 14;
						field412[field283] = var4;
						field413[field283] = var5;
						field283++;
					} else if ((field222 & 0x4) == 4) {
						field392[field283] = field223 + " @cya@" + var8.field1207;
						field414[field283] = 770;
						field415[field283] = var3;
						field412[field283] = var4;
						field413[field283] = var5;
						field283++;
					}
				}

				if (var6 == 1) {
					NLPNWUNL var10 = field383[var7];
					if (var10.field908.field1053 == 1 && (var10.field1019 & 0x7F) == 0x40 && (var10.field1020 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field384; var11++) {
							NLPNWUNL var12 = field383[field385[var11]];
							if (var12 != null && var10 != var12 && var12.field908.field1053 == 1 && var10.field1019 == var12.field1019 && var10.field1020 == var12.field1020) {
								method169(var12.field908, field385[var11], var4, var5);
							}
						}

						for (int var13 = 0; var13 < field214; var13++) {
							FVFJZZXQ var14 = field213[field215[var13]];
							if (var14 != null && var10.field1019 == var14.field1019 && var10.field1020 == var14.field1020) {
								method142(var4, var5, field215[var13], var14);
							}
						}
					}

					method169(var10.field908, var7, var4, var5);
				}

				if (var6 == 0) {
					FVFJZZXQ var15 = field213[var7];
					if ((var15.field1019 & 0x7F) == 0x40 && (var15.field1020 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field384; var16++) {
							NLPNWUNL var17 = field383[field385[var16]];
							if (var17 != null && var17.field908.field1053 == 1 && var15.field1019 == var17.field1019 && var15.field1020 == var17.field1020) {
								method169(var17.field908, field385[var16], var4, var5);
							}
						}

						for (int var18 = 0; var18 < field214; var18++) {
							FVFJZZXQ var19 = field213[field215[var18]];
							if (var19 != null && var15 != var19 && var15.field1019 == var19.field1019 && var15.field1020 == var19.field1020) {
								method142(var4, var5, field215[var18], var19);
							}
						}
					}

					method142(var4, var5, var7, var15);
				}

				if (var6 == 3) {
					OUZUCGGU var20 = field435[field122][var4][var5];
					if (var20 != null) {
						for (CTXDUSNR var21 = (CTXDUSNR) var20.method394(); var21 != null; var21 = (CTXDUSNR) var20.method396()) {
							MACPVTEQ var22 = MACPVTEQ.method374(var21.field528);
							if (field469 == 1) {
								field392[field283] = "Use " + field473 + " with @lre@" + var22.field864;
								field414[field283] = 389;
								field415[field283] = var21.field528;
								field412[field283] = var4;
								field413[field283] = var5;
								field283++;
							} else if (field220 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field860 != null && var22.field860[var23] != null) {
										field392[field283] = var22.field860[var23] + " @lre@" + var22.field864;

										if (var23 == 0) {
											field414[field283] = 81;
										}

										if (var23 == 1) {
											field414[field283] = 633;
										}

										if (var23 == 2) {
											field414[field283] = 943;
										}

										if (var23 == 3) {
											field414[field283] = 629;
										}

										if (var23 == 4) {
											field414[field283] = 124;
										}

										field415[field283] = var21.field528;
										field412[field283] = var4;
										field413[field283] = var5;
										field283++;
									} else if (var23 == 2) {
										field392[field283] = "Take @lre@" + var22.field864;
										field414[field283] = 943;
										field415[field283] = var21.field528;
										field412[field283] = var4;
										field413[field283] = var5;
										field283++;
									}
								}

								field392[field283] = "Examine @lre@" + var22.field864;
								field414[field283] = 1859;
								field415[field283] = var21.field528;
								field412[field283] = var4;
								field413[field283] = var5;
								field283++;
							} else if ((field222 & 0x1) == 1) {
								field392[field283] = field223 + " @lre@" + var22.field864;
								field414[field283] = 572;
								field415[field283] = var21.field528;
								field412[field283] = var4;
								field413[field283] = var5;
								field283++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method126() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field227[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field227[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field228[var10] = (field227[var10 - 1] + field227[var10 + 1] + field227[var10 - 128] + field227[var10 + 128]) / 4;
			}
		}

		field365 += 128;
		if (field365 > field519.length) {
			field365 -= field519.length;
			int var11 = (int) (Math.random() * 12.0D);
			method128(field107[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field228[var14 + 128] - field519[field365 + var14 & field519.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field227[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field281[var16] = field281[var16 + 1];
		}

		field281[var1 - 1] = (int) (Math.sin(field236 / 14.0D) * 16.0D + Math.sin(field236 / 15.0D) * 14.0D + Math.sin(field236 / 16.0D) * 12.0D);

		if (field487 > 0) {
			field487 -= 4;
		}

		if (field488 > 0) {
			field488 -= 4;
		}

		if (field487 == 0 && field488 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field487 = 1024;
			}

			if (var17 == 1) {
				field488 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method127(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(ILYAPSNHGU;)V")
	public final void method128(YAPSNHGU arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field519.length; var3++) {
			field519[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field519[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field520[var9] = (field519[var9 - 1] + field519[var9 + 1] + field519[var9 - 128] + field519[var9 + 128]) / 4;
				}
			}

			int[] var10 = field519;
			field519 = field520;
			field520 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1475; var12++) {
				for (int var13 = 0; var13 < arg0.field1474; var13++) {
					if (arg0.field1472[var11++] != 0) {
						int var14 = var13 + arg0.field1476 + 16;
						int var15 = var12 + arg0.field1477 + 16;
						int var16 = (var15 << 7) + var14;
						field519[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method129() {
		field232.method196();
		AZWEEYMC.field52 = field156;
		field466.method587(0, 0);

		if (field257) {
			field312.method418(40, 239, field496, 0);
			field312.method418(60, 239, field445 + "*", 128);
		} else if (field501 == 1) {
			field312.method418(40, 239, "Enter amount:", 0);
			field312.method418(60, 239, field475 + "*", 128);
		} else if (field501 == 2) {
			field312.method418(40, 239, "Enter name:", 0);
			field312.method418(60, 239, field475 + "*", 128);
		} else if (field136 != null) {
			field312.method418(40, 239, field136, 0);
			field312.method418(60, 239, "Click to continue", 128);
		} else if (field258 != -1) {
			method185(0, TNOPEJNZ.field1272[field258], 0, 0);
		} else if (field351 == -1) {
			QJBJRTJO var1 = field311;
			int var2 = 0;
			FBOVVAQK.method232(463, 0, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field457[var3] != null) {
					int var4 = field455[var3];
					int var5 = field189 + 70 - var2 * 14;
					String var6 = field456[var3];
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
							var1.method422(0, field457[var3], 4, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field103 == 0 || field103 == 1 && method174(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field335[0].method587(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field335[1].method587(var5 - 12, var8);
								var8 += 14;
							}

							var1.method422(0, var6 + ":", var8, var5);
							var8 += var1.method420(var6) + 8;
							var1.method422(255, field457[var3], var8, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field145 == 0 && (var4 == 7 || field242 == 0 || field242 == 1 && method174(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method422(0, "From", var9, var5);
							int var11 = var9 + var1.method420("From ");
							if (var7 == 1) {
								field335[0].method587(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field335[1].method587(var5 - 12, var11);
								var11 += 14;
							}

							var1.method422(0, var6 + ":", var11, var5);
							var11 += var1.method420(var6) + 8;
							var1.method422(0x800000, field457[var3], var11, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field478 == 0 || field478 == 1 && method174(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method422(0x800080, var6 + " " + field457[var3], 4, var5);
						}

						var2++;
					}

					if (var4 == 5 && field145 == 0 && field242 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method422(0x800000, field457[var3], 4, var5);
						}

						var2++;
					}

					if (var4 == 6 && field145 == 0 && field242 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method422(0, "To " + var6 + ":", 4, var5);
							var1.method422(0x800000, field457[var3], var1.method420("To " + var6) + 12, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field478 == 0 || field478 == 1 && method174(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method422(0x7E3200, var6 + " " + field457[var3], 4, var5);
						}

						var2++;
					}
				}
			}

			FBOVVAQK.method231();
			field131 = var2 * 14 + 7;
			if (field131 < 78) {
				field131 = 78;
			}

			method146(field131 - field189 - 77, 77, field131, 0, 463);
			String var10;
			if (field396 == null || field396.field603 == null) {
				var10 = XNWHEMGT.method580(field291);
			} else {
				var10 = field396.field603;
			}

			var1.method422(0, var10 + ":", 4, 90);
			var1.method422(255, field134 + "*", var1.method420(var10 + ": ") + 6, 90);
			FBOVVAQK.method238(479, 0, 0, 77);
		} else {
			method185(0, TNOPEJNZ.field1272[field351], 0, 0);
		}

		if (field265 && field151 == 2) {
			method92();
		}

		field232.method197(field74, 357, 17);
		field231.method196();
		AZWEEYMC.field52 = field158;
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method130(boolean arg0) {
		method133();
		field180.method196();
		field422.method587(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field454 == 0) {
			int var4 = var3 / 2 + 80;
			field310.method419(true, field200.field1448, var2 / 2, 0x75A9A9, var4);
			int var5 = var3 / 2 - 20;
			field312.method419(true, "Welcome to RuneScape", var2 / 2, 0xFFFF00, var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field423.method587(var7 - 20, var6 - 73);
			field312.method419(true, "New User", var6, 0xFFFFFF, var7 + 5);
			int var8 = var2 / 2 + 80;
			field423.method587(var7 - 20, var8 - 73);
			field312.method419(true, "Existing User", var8, 0xFFFFFF, var7 + 5);
		}

		if (field454 == 2) {
			int var9 = var3 / 2 - 40;
			if (field206.length() > 0) {
				field312.method419(true, field206, var2 / 2, 0xFFFF00, var9 - 15);
				field312.method419(true, field207, var2 / 2, 0xFFFF00, var9);
				var9 += 30;
			} else {
				field312.method419(true, field207, var2 / 2, 0xFFFF00, var9 - 7);
				var9 += 30;
			}

			field312.method426("Username: " + field291 + (field417 == 0 & field236 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 90, 0xFFFFFF, var9);
			var9 += 15;
			field312.method426("Password: " + XNWHEMGT.method581(field292) + (field417 == 1 & field236 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 88, 0xFFFFFF, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field423.method587(var11 - 20, var10 - 73);
				field312.method419(true, "Login", var10, 0xFFFFFF, var11 + 5);
				int var12 = var2 / 2 + 80;
				field423.method587(var11 - 20, var12 - 73);
				field312.method419(true, "Cancel", var12, 0xFFFFFF, var11 + 5);
			}
		}

		if (field454 == 3) {
			field312.method419(true, "Create a free account", var2 / 2, 0xFFFF00, var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field312.method419(true, "To create a new account you need to", var2 / 2, 0xFFFFFF, var13);
			var13 += 15;
			field312.method419(true, "go back to the main RuneScape webpage", var2 / 2, 0xFFFFFF, var13);
			var13 += 15;
			field312.method419(true, "and choose the red 'create account'", var2 / 2, 0xFFFFFF, var13);
			var13 += 15;
			field312.method419(true, "button at the top right of that page.", var2 / 2, 0xFFFFFF, var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field423.method587(var15 - 20, var14 - 73);
			field312.method419(true, "Cancel", var14, 0xFFFFFF, var15 + 5);
		}

		field180.method197(field74, 171, 202);

		if (field444) {
			field444 = false;
			field178.method197(field74, 0, 128);
			field179.method197(field74, 371, 202);
			field183.method197(field74, 265, 0);
			field184.method197(field74, 265, 562);
			field185.method197(field74, 171, 128);
			field186.method197(field74, 171, 562);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method131() {
		try {
			field486 = -1;
			field402.method397();
			field196.method397();
			AZWEEYMC.method28();
			method64();
			field458.method504();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field436[var1].method344();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field172[var2][var3][var4] = 0;
					}
				}
			}

			AIYLKTEB var5 = new AIYLKTEB(104, field341, field172, 104);
			int var6 = field386.length;
			field147.method295(166);

			if (!field337) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field126[var7] >> 8) * 64 - field503;
					int var9 = (field126[var7] & 0xFF) * 64 - field504;
					byte[] var10 = field386[var7];
					if (var10 != null) {
						var5.method7(var10, var8, var9, field436, (field298 - 6) * 8, (field297 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field126[var11] >> 8) * 64 - field503;
					int var13 = (field126[var11] & 0xFF) * 64 - field504;
					byte[] var14 = field386[var11];
					if (var14 == null && field298 < 800) {
						var5.method6(var13, var12, 64, 64);
					}
				}

				field147.method295(166);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field143[var15];
					if (var16 != null) {
						int var17 = (field126[var15] >> 8) * 64 - field503;
						int var18 = (field126[var15] & 0xFF) * 64 - field504;
						var5.method16(var18, field458, var17, field436, var16);
					}
				}
			}

			if (field337) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field161[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field126.length; var28++) {
									if (field126[var28] == var27 && field386[var28] != null) {
										var5.method13(var23, field436, var21 * 8, (var25 & 0x7) * 8, var24, field386[var28], var19, var20 * 8, (var26 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field161[0][var29][var30];
						if (var31 == -1) {
							var5.method6(var30 * 8, var29 * 8, 8, 8);
						}
					}
				}

				field147.method295(166);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field161[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field126.length; var41++) {
									if (field126[var41] == var40 && field143[var41] != null) {
										var5.method15(var34 * 8, field143[var41], field436, var36, var33 * 8, (var38 & 0x7) * 8, var32, var37, field458, (var39 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field147.method295(166);
			var5.method12(field458, field436);
			field231.method196();
			field147.method295(166);
			int var42 = AIYLKTEB.field32;
			if (var42 > field122) {
				var42 = field122;
			}

			if (var42 < field122 - 1) {
				int var43 = field122 - 1;
			}

			if (field375) {
				field458.method505(AIYLKTEB.field32);
			} else {
				field458.method505(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method148(var44, var45);
				}
			}

			method172();
		} catch (Exception var58) {
		}

		SYTHBZWG.field1217.method388();

		if (field77 != null) {
			field147.method295(53);
			field147.method300(1057001181);
		}

		if (field375 && signlink.cache_dat != null) {
			int var47 = field200.method557(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field200.method558(var48);
				if ((var49 & 0x79) == 0) {
					RTQSBWRH.method453(var48);
				}
			}
		}

		System.gc();
		AZWEEYMC.method29(20);
		field200.method573();
		int var50 = (field297 - 6) / 8 - 1;
		int var51 = (field297 + 6) / 8 + 1;
		int var52 = (field298 - 6) / 8 - 1;
		int var53 = (field298 + 6) / 8 + 1;
		if (field449) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field200.method563(0, var54, var55);
					if (var56 != -1) {
						field200.method565(var56, 3);
					}

					int var57 = field200.method563(1, var54, var55);
					if (var57 != -1) {
						field200.method565(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method132(boolean arg0) {
		if (field396.field1019 >> 7 == field440 && field396.field1020 >> 7 == field441) {
			field440 = 0;
		}

		int var2 = field214;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			FVFJZZXQ var4;
			int var5;
			if (arg0) {
				var4 = field396;
				var5 = field212 << 14;
			} else {
				var4 = field213[field215[var3]];
				var5 = field215[var3] << 14;
			}

			if (var4 != null && var4.method244()) {
				var4.field624 = false;
				if ((field375 && field214 > 50 || field214 > 200) && !arg0 && var4.field1013 == var4.field1009) {
					var4.field624 = true;
				}

				int var6 = var4.field1019 >> 7;
				int var7 = var4.field1020 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field615 == null || field236 < var4.field617 || field236 >= var4.field618) {
						if ((var4.field1019 & 0x7F) == 0x40 && (var4.field1020 & 0x7F) == 0x40) {
							if (field474[var6][var7] == field123) {
								continue;
							}

							field474[var6][var7] = field123;
						}

						var4.field611 = method173(var4.field1020, var4.field1019, field122);
						field458.method515(var4.field611, var5, 60, var4.field1040, field122, var4.field1019, var4, var4.field1020, var4.field1021);
					} else {
						var4.field624 = false;
						var4.field611 = method173(var4.field1020, var4.field1019, field122);
						field458.method516(field122, 60, var4.field619, var4.field621, var4.field1019, var4.field611, var4, var4.field1021, var5, var4.field622, var4.field1020, var4.field620);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method133() {
		if (field178 == null) {
			field75 = null;
			field232 = null;
			field230 = null;
			field229 = null;
			field231 = null;
			field459 = null;
			field460 = null;
			field461 = null;
			field181 = new CMFQLMCT(128, method57(), 265);
			FBOVVAQK.method233();
			field182 = new CMFQLMCT(128, method57(), 265);
			FBOVVAQK.method233();
			field178 = new CMFQLMCT(509, method57(), 171);
			FBOVVAQK.method233();
			field179 = new CMFQLMCT(360, method57(), 132);
			FBOVVAQK.method233();
			field180 = new CMFQLMCT(360, method57(), 200);
			FBOVVAQK.method233();
			field183 = new CMFQLMCT(202, method57(), 238);
			FBOVVAQK.method233();
			field184 = new CMFQLMCT(203, method57(), 238);
			FBOVVAQK.method233();
			field185 = new CMFQLMCT(74, method57(), 94);
			FBOVVAQK.method233();
			field186 = new CMFQLMCT(75, method57(), 94);
			FBOVVAQK.method233();

			if (field268 != null) {
				method155();
				method81();
			}

			field444 = true;
		}
	}

	@ObfuscatedName("client.a(LTNOPEJNZ;I)Z")
	public final boolean method134(TNOPEJNZ arg0) {
		if (arg0.field1280 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1280.length; var2++) {
			int var3 = method110(arg0, var2);
			int var4 = arg0.field1300[var2];
			if (arg0.field1280[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1280[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1280[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field458.method530(arg2, arg1, arg0);
		if (var6 != 0) {
			int var7 = field458.method534(arg2, arg1, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field442.field541;
			int var12 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			SYTHBZWG var14 = SYTHBZWG.method491(var13);
			if (var14.field1202 == -1) {
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
				YAPSNHGU var15 = field388[var14.field1202];
				if (var15 != null) {
					int var16 = (var14.field1203 * 4 - var15.field1474) / 2;
					int var17 = (var14.field1181 * 4 - var15.field1475) / 2;
					var15.method587((104 - arg0 - var14.field1181) * 4 + var17 + 48, arg1 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field458.method532(arg2, arg1, arg0);
		if (var18 != 0) {
			int var19 = field458.method534(arg2, arg1, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			SYTHBZWG var23 = SYTHBZWG.method491(var22);
			if (var23.field1202 != -1) {
				YAPSNHGU var24 = field388[var23.field1202];
				if (var24 != null) {
					int var25 = (var23.field1203 * 4 - var24.field1474) / 2;
					int var26 = (var23.field1181 * 4 - var24.field1475) / 2;
					var24.method587((104 - arg0 - var23.field1181) * 4 + var26 + 48, arg1 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field442.field541;
				int var29 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field458.method533(arg2, arg1, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			SYTHBZWG var32 = SYTHBZWG.method491(var31);
			if (var32.field1202 != -1) {
				YAPSNHGU var33 = field388[var32.field1202];
				if (var33 != null) {
					int var34 = (var32.field1203 * 4 - var33.field1474) / 2;
					int var35 = (var32.field1181 * 4 - var33.field1475) / 2;
					var33.method587((104 - arg0 - var32.field1181) * 4 + var35 + 48, arg1 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method136() {
		if (field145 != 0) {
			QJBJRTJO var1 = field311;
			int var2 = 0;
			if (field515 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field457[var3] != null) {
					int var4 = field455[var3];
					String var5 = field456[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field242 == 0 || field242 == 1 && method174(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method422(0, "From", var8, var7);
						var1.method422(0xFFFF, "From", var8, var7 - 1);
						int var11 = var8 + var1.method420("From ");
						if (var6 == 1) {
							field335[0].method587(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field335[1].method587(var7 - 12, var11);
							var11 += 14;
						}

						var1.method422(0, var5 + ": " + field457[var3], var11, var7);
						var1.method422(0xFFFF, var5 + ": " + field457[var3], var11, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field242 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method422(0, field457[var3], 4, var9);
						var1.method422(0xFFFF, field457[var3], 4, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field242 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method422(0, "To " + var5 + ": " + field457[var3], 4, var10);
						var1.method422(0xFFFF, "To " + var5 + ": " + field457[var3], 4, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BILDLNMSHLT;I)V")
	public final void method137(int arg0, DLNMSHLT arg1, int arg2) {
		int var4 = field467 + field427 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = RTQSBWRH.field1158[var4];
			int var7 = RTQSBWRH.field1159[var4];
			var6 = var6 * 256 / (field489 + 256);
			var7 = var7 * 256 / (field489 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method211(field465, var8 + 94 + 4 - arg1.field546 / 2, 83 - var9 - arg1.field547 / 2 - 4);
			} else {
				arg1.method205(83 - var9 - arg1.field547 / 2 - 4, var8 + 94 - arg1.field546 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method138(int arg0) {
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

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method139(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.y(I)V")
	public final void method140() {
		if (field205 > 0) {
			method179();
		} else {
			field231.method196();
			field311.method418(144, 257, "Connection lost", 0);
			field311.method418(143, 256, "Connection lost", 0xFFFFFF);
			field311.method418(159, 257, "Please wait - attempting to reestablish", 0);
			field311.method418(158, 256, "Please wait - attempting to reestablish", 0xFFFFFF);
			field231.method197(field74, 4, 4);
			field280 = 0;
			field440 = 0;
			QLBHZVFC var1 = field279;
			field256 = false;
			field371 = 0;
			method187(field291, field292, true);

			if (!field256) {
				method179();
			}

			try {
				var1.method433();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method141() {
		if (field117 == 2) {
			method70(field509 * 2, (field508 - field504 << 7) + field511, (field507 - field503 << 7) + field510);

			if (field451 > -1 && field236 % 20 < 10) {
				field447[2].method205(field452 - 28, field451 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(IIILFVFJZZXQ;I)V")
	public final void method142(int arg0, int arg1, int arg2, FVFJZZXQ arg3) {
		if (field396 != arg3 && field283 < 400) {
			String var5;
			if (arg3.field605 == 0) {
				var5 = arg3.field603 + method127(arg3.field627, field396.field627) + " (level-" + arg3.field627 + ")";
			} else {
				var5 = arg3.field603 + " (skill-" + arg3.field605 + ")";
			}

			if (field469 == 1) {
				field392[field283] = "Use " + field473 + " with @whi@" + var5;
				field414[field283] = 128;
				field415[field283] = arg2;
				field412[field283] = arg0;
				field413[field283] = arg1;
				field283++;
			} else if (field220 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field513[var6] != null) {
						field392[field283] = field513[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field513[var6].equalsIgnoreCase("attack")) {
							if (arg3.field627 > field396.field627) {
								var7 = 2000;
							}

							if (field396.field616 != 0 && arg3.field616 != 0) {
								if (field396.field616 == arg3.field616) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field514[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field414[field283] = var7 + 901;
						}

						if (var6 == 1) {
							field414[field283] = var7 + 562;
						}

						if (var6 == 2) {
							field414[field283] = var7 + 801;
						}

						if (var6 == 3) {
							field414[field283] = var7 + 338;
						}

						if (var6 == 4) {
							field414[field283] = var7 + 90;
						}

						field415[field283] = arg2;
						field412[field283] = arg0;
						field413[field283] = arg1;
						field283++;
					}
				}
			} else if ((field222 & 0x8) == 8) {
				field392[field283] = field223 + " @whi@" + var5;
				field414[field283] = 964;
				field415[field283] = arg2;
				field412[field283] = arg0;
				field413[field283] = arg1;
				field283++;
			}

			for (int var8 = 0; var8 < field283; var8++) {
				if (field414[var8] == 505) {
					field392[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)Ljava/net/Socket;")
	public final Socket method143(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.B(I)V")
	public final void method144() {
		if (field515 > 1) {
			field515--;
		}

		if (field205 > 0) {
			field205--;
		}

		for (int var1 = 0; var1 < 5 && method118(); var1++) {
		}

		if (field256) {
			synchronized (field124.field1414) {
				if (!field346) {
					field124.field1413 = 0;
				} else if (field88 != 0 || field124.field1413 >= 40) {
					field147.method295(22);
					field147.method296(0);
					int var3 = field147.field752;
					int var4 = 0;
					for (int var5 = 0; var5 < field124.field1413 && var3 - field147.field752 < 240; var5++) {
						var4++;
						int var6 = field124.field1409[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field124.field1411[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field124.field1409[var5] == -1 && field124.field1411[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field233 != var7 || field234 != var6) {
							int var9 = var7 - field233;
							field233 = var7;
							int var10 = var6 - field234;
							field234 = var6;

							if (field266 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field147.method297((field266 << 12) + (var9 << 6) + var10);
								field266 = 0;
							} else if (field266 < 8) {
								field147.method299((field266 << 19) + var8 + 0x800000);
								field266 = 0;
							} else {
								field147.method300((field266 << 19) + var8 - 0x40000000);
								field266 = 0;
							}
						} else if (field266 < 2047) {
							field266++;
						}
					}

					field147.method305(field147.field752 - var3);

					if (var4 >= field124.field1413) {
						field124.field1413 = 0;
					} else {
						field124.field1413 -= var4;
						for (int var11 = 0; var11 < field124.field1413; var11++) {
							field124.field1411[var11] = field124.field1411[var4 + var11];
							field124.field1409[var11] = field124.field1409[var4 + var11];
						}
					}
				}
			}

			if (field88 != 0) {
				long var12 = (field91 - field169) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field169 = field91;
				int var14 = field90;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field89;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field88 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field147.method295(160);
				field147.method300((var17 << 19) + (var18 << 20) + var16);
			}

			if (field399 > 0) {
				field399--;
			}

			if (field92[1] == 1 || field92[2] == 1 || field92[3] == 1 || field92[4] == 1) {
				field400 = true;
			}

			if (field400 && field399 <= 0) {
				field399 = 20;
				field400 = false;
				field147.method295(188);
				field147.method332(field427);
				field147.method331(field426);
			}

			if (field79 && !field314) {
				field314 = true;
				field147.method295(136);
				field147.method296(1);
			}

			if (!field79 && field314) {
				field314 = false;
				field147.method295(136);
				field147.method296(0);
			}

			method104();
			method80();
			method100();
			field203++;
			if (field203 > 750) {
				method140();
			}

			method122();
			method160();
			method194();
			field241++;
			if (field241 > 85) {
				field241 = 0;
				field147.method295(245);
			}

			field99++;

			if (field350 != 0) {
				field349 += 20;
				if (field349 >= 400) {
					field350 = 0;
				}
			}

			if (field485 != 0) {
				field482++;
				if (field482 >= 15) {
					if (field485 == 2) {
						field433 = true;
					}

					if (field485 == 3) {
						field518 = true;
					}

					field485 = 0;
				}
			}

			if (field139 != 0) {
				field192++;

				if (field82 > field140 + 5 || field82 < field140 - 5 || field83 > field141 + 5 || field83 < field141 - 5) {
					field498 = true;
				}

				if (field81 == 0) {
					if (field139 == 2) {
						field433 = true;
					}

					if (field139 == 3) {
						field518 = true;
					}

					field139 = 0;

					if (field498 && field192 >= 5) {
						field278 = -1;
						method157();

						if (field278 == field137 && field277 != field138) {
							TNOPEJNZ var19 = TNOPEJNZ.field1272[field137];
							byte var20 = 0;
							if (field430 == 1 && var19.field1307 == 206) {
								var20 = 1;
							}

							if (var19.field1317[field277] <= 0) {
								var20 = 0;
							}

							if (var19.field1278) {
								int var21 = field138;
								int var22 = field277;
								var19.field1317[var22] = var19.field1317[var21];
								var19.field1297[var22] = var19.field1297[var21];
								var19.field1317[var21] = -1;
								var19.field1297[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field138;
								int var24 = field277;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method498(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method498(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method498(field138, field277);
							}

							field147.method295(228);
							field147.method322(var20);
							field147.method297(field137);
							field147.method333(field138);
							field147.method297(field277);
						}
					} else if ((field499 == 1 || method115(field283 - 1)) && field283 > 2) {
						method98();
					} else if (field283 > 0) {
						method101(field283 - 1);
					}

					field482 = 10;
					field88 = 0;
				}
			}

			if (UMYAUCNU.field1380 != -1) {
				int var25 = UMYAUCNU.field1380;
				int var26 = UMYAUCNU.field1381;
				boolean var27 = method171(var25, 0, 0, 0, field396.field1007[0], 0, true, 0, field396.field1008[0], 0, var26);
				UMYAUCNU.field1380 = -1;

				if (var27) {
					field347 = field89;
					field348 = field90;
					field350 = 1;
					field349 = 0;
				}
			}

			if (field88 == 1 && field136 != null) {
				field136 = null;
				field518 = true;
				field88 = 0;
			}

			method75();
			method189();
			method147();
			method175();

			if (field81 == 1 || field88 == 1) {
				field224++;
			}

			if (field238 == 2) {
				method113();
			}

			if (field238 == 2 && field237) {
				method182();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field250[var28]++;
			}

			method67();
			field80++;
			if (field80 > 4500) {
				field205 = 250;
				field80 -= 500;
				field147.method295(243);
			}

			field370++;
			if (field370 > 500) {
				field370 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field272 += field273;
				}

				if ((var29 & 0x2) == 2) {
					field165 += field166;
				}

				if ((var29 & 0x4) == 4) {
					field390 += field391;
				}
			}

			if (field272 < -50) {
				field273 = 2;
			}

			if (field272 > 50) {
				field273 = -2;
			}

			if (field165 < -55) {
				field166 = 2;
			}

			if (field165 > 55) {
				field166 = -2;
			}

			if (field390 < -40) {
				field391 = 1;
			}

			if (field390 > 40) {
				field391 = -1;
			}

			field443++;
			if (field443 > 500) {
				field443 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field467 += field468;
				}

				if ((var30 & 0x2) == 2) {
					field489 += field490;
				}
			}

			if (field467 < -60) {
				field468 = 2;
			}

			if (field467 > 60) {
				field468 = -2;
			}

			if (field489 < -20) {
				field490 = 1;
			}

			if (field489 > 10) {
				field490 = -1;
			}

			field204++;
			if (field204 > 50) {
				field147.method295(166);
			}

			try {
				if (field279 != null && field147.field752 > 0) {
					field279.method437(field147.field751, field147.field752, 0);
					field147.field752 = 0;
					field204 = 0;
				}
			} catch (IOException var32) {
				method140();
			} catch (Exception var33) {
				method179();
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method145() {
		field147.method295(70);

		if (field235 != -1) {
			field235 = -1;
			field433 = true;
			field132 = false;
			field254 = true;
		}

		if (field258 != -1) {
			field258 = -1;
			field518 = true;
			field132 = false;
		}

		field210 = -1;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 318);

			if (arg0.length == 5) {
				field372 = Integer.parseInt(arg0[0]);
				field373 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method99();
				} else if (arg0[2].equals("highmem")) {
					method90();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field374 = false;
				} else if (arg0[3].equals("members")) {
					field374 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method47(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IIIIZI)V")
	public final void method146(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field148.method587(arg3, arg4);
		field149.method587(arg1 + arg3 - 16, arg4);
		FBOVVAQK.method235(arg1 - 32, 16, arg3 + 16, field118, arg4);
		int var6 = (arg1 - 32) * arg1 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg0 / (arg2 - arg1);
		FBOVVAQK.method235(var6, 16, arg3 + var7 + 16, field344, arg4);
		FBOVVAQK.method240(arg4, arg3 + var7 + 16, field198, var6);
		FBOVVAQK.method240(arg4 + 1, arg3 + 16 + var7, field198, var6);
		FBOVVAQK.method238(16, field198, arg4, arg3 + var7 + 16);
		FBOVVAQK.method238(16, field198, arg4, arg3 + var7 + 17);
		FBOVVAQK.method240(arg4 + 15, arg3 + 16 + var7, field167, var6);
		FBOVVAQK.method240(arg4 + 14, arg3 + 17 + var7, field167, var6 - 1);
		FBOVVAQK.method238(16, field167, arg4, arg3 + var7 + var6 + 15);
		FBOVVAQK.method238(15, field167, arg4 + 1, arg3 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.C(I)V")
	public final void method147() {
		if (field88 == 1) {
			if (field89 >= 539 && field89 <= 573 && field90 >= 169 && field90 < 205 && field343[0] != -1) {
				field433 = true;
				field356 = 0;
				field254 = true;
			}

			if (field89 >= 569 && field89 <= 599 && field90 >= 168 && field90 < 205 && field343[1] != -1) {
				field433 = true;
				field356 = 1;
				field254 = true;
			}

			if (field89 >= 597 && field89 <= 627 && field90 >= 168 && field90 < 205 && field343[2] != -1) {
				field433 = true;
				field356 = 2;
				field254 = true;
			}

			if (field89 >= 625 && field89 <= 669 && field90 >= 168 && field90 < 203 && field343[3] != -1) {
				field433 = true;
				field356 = 3;
				field254 = true;
			}

			if (field89 >= 666 && field89 <= 696 && field90 >= 168 && field90 < 205 && field343[4] != -1) {
				field433 = true;
				field356 = 4;
				field254 = true;
			}

			if (field89 >= 694 && field89 <= 724 && field90 >= 168 && field90 < 205 && field343[5] != -1) {
				field433 = true;
				field356 = 5;
				field254 = true;
			}

			if (field89 >= 722 && field89 <= 756 && field90 >= 169 && field90 < 205 && field343[6] != -1) {
				field433 = true;
				field356 = 6;
				field254 = true;
			}

			if (field89 >= 540 && field89 <= 574 && field90 >= 466 && field90 < 502 && field343[7] != -1) {
				field433 = true;
				field356 = 7;
				field254 = true;
			}

			if (field89 >= 572 && field89 <= 602 && field90 >= 466 && field90 < 503 && field343[8] != -1) {
				field433 = true;
				field356 = 8;
				field254 = true;
			}

			if (field89 >= 599 && field89 <= 629 && field90 >= 466 && field90 < 503 && field343[9] != -1) {
				field433 = true;
				field356 = 9;
				field254 = true;
			}

			if (field89 >= 627 && field89 <= 671 && field90 >= 467 && field90 < 502 && field343[10] != -1) {
				field433 = true;
				field356 = 10;
				field254 = true;
			}

			if (field89 >= 669 && field89 <= 699 && field90 >= 466 && field90 < 503 && field343[11] != -1) {
				field433 = true;
				field356 = 11;
				field254 = true;
			}

			if (field89 >= 696 && field89 <= 726 && field90 >= 466 && field90 < 503 && field343[12] != -1) {
				field433 = true;
				field356 = 12;
				field254 = true;
			}

			if (field89 >= 724 && field89 <= 758 && field90 >= 466 && field90 < 502 && field343[13] != -1) {
				field433 = true;
				field356 = 13;
				field254 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method148(int arg0, int arg1) {
		OUZUCGGU var3 = field435[field122][arg0][arg1];
		if (var3 == null) {
			field458.method525(field122, arg0, arg1);
		} else {
			int var4 = -99999999;
			CTXDUSNR var5 = null;
			for (CTXDUSNR var6 = (CTXDUSNR) var3.method393(); var6 != null; var6 = (CTXDUSNR) var3.method395()) {
				MACPVTEQ var7 = MACPVTEQ.method374(var6.field528);
				int var8 = var7.field861;
				if (var7.field881) {
					var8 = (var6.field527 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method391(var5);
			CTXDUSNR var9 = null;
			CTXDUSNR var10 = null;
			for (CTXDUSNR var11 = (CTXDUSNR) var3.method393(); var11 != null; var11 = (CTXDUSNR) var3.method395()) {
				if (var5.field528 != var11.field528 && var9 == null) {
					var9 = var11;
				}

				if (var5.field528 != var11.field528 && var9.field528 != var11.field528 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field458.method511(var12, var9, method173(arg1 * 128 + 64, arg0 * 128 + 64, field122), var5, arg0, field122, arg1, var10);
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method149() {
		while (true) {
			LMSXRUPQ var1 = field200.method568();
			if (var1 == null) {
				return;
			}

			if (var1.field815 == 0) {
				RTQSBWRH.method452(var1.field811, var1.field813);

				if ((field200.method558(var1.field811) & 0x62) != 0) {
					field433 = true;

					if (field258 != -1) {
						field518 = true;
					}
				}
			}

			if (var1.field815 == 1 && var1.field813 != null) {
				EMBMBPSC.method226(var1.field813);
			}

			if (var1.field815 == 2 && field247 == var1.field811 && var1.field813 != null) {
				method77(var1.field813, field248);
			}

			if (var1.field815 == 3 && field238 == 1) {
				for (int var2 = 0; var2 < field386.length; var2++) {
					if (field127[var2] == var1.field811) {
						field386[var2] = var1.field813;

						if (var1.field813 == null) {
							field127[var2] = -1;
						}

						break;
					}

					if (field128[var2] == var1.field811) {
						field143[var2] = var1.field813;

						if (var1.field813 == null) {
							field128[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field815 == 93 && field200.method575(var1.field811)) {
				AIYLKTEB.method11(new JHKSAGUC(var1.field813), field200);
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method150(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.h(II)V")
	public final void method151(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.b(LTNOPEJNZ;I)V")
	public final void method152(TNOPEJNZ arg0) {
		int var2 = arg0.field1307;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field270 == 0) {
				arg0.field1322 = "Loading friend list";
				arg0.field1306 = 0;
			} else if (var2 == 1 && field270 == 1) {
				arg0.field1322 = "Connecting to friendserver";
				arg0.field1306 = 0;
			} else if (var2 == 2 && field270 != 2) {
				arg0.field1322 = "Please wait...";
				arg0.field1306 = 0;
			} else {
				int var3 = field269;
				if (field270 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1322 = "";
					arg0.field1306 = 0;
				} else {
					arg0.field1322 = field295[var2];
					arg0.field1306 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field269;
			if (field270 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1322 = "";
				arg0.field1306 = 0;
			} else {
				if (field446[var2] == 0) {
					arg0.field1322 = "@red@Offline";
				} else if (field446[var2] == field372) {
					arg0.field1322 = "@gre@World-" + (field446[var2] - 9);
				} else {
					arg0.field1322 = "@yel@World-" + (field446[var2] - 9);
				}

				arg0.field1306 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field269;
			if (field270 != 2) {
				var5 = 0;
			}

			arg0.field1292 = var5 * 15 + 20;
			if (arg0.field1292 <= arg0.field1303) {
				arg0.field1292 = arg0.field1303 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field270 == 0) {
				arg0.field1322 = "Loading ignore list";
				arg0.field1306 = 0;
			} else if (var2 == 1 && field270 == 0) {
				arg0.field1322 = "Please wait...";
				arg0.field1306 = 0;
			} else {
				int var6 = field364;
				if (field270 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1322 = "";
					arg0.field1306 = 0;
				} else {
					arg0.field1322 = XNWHEMGT.method580(XNWHEMGT.method577(field369[var2]));
					arg0.field1306 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1292 = field364 * 15 + 20;
			if (arg0.field1292 <= arg0.field1303) {
				arg0.field1292 = arg0.field1303 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1309 = 150;
			arg0.field1310 = (int) (Math.sin(field236 / 40.0D) * 256.0D) & 0x7FF;

			if (field194) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field102[var7];
					if (var8 >= 0 && !DQSOHZWU.field549[var8].method215()) {
						return;
					}
				}

				field194 = false;
				RTQSBWRH[] var9 = new RTQSBWRH[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field102[var11];
					if (var12 >= 0) {
						var9[var10++] = DQSOHZWU.field549[var12].method216();
					}
				}

				RTQSBWRH var13 = new RTQSBWRH(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field168[var14] != 0) {
						var13.method468(field274[var14][0], field274[var14][field168[var14]]);

						if (var14 == 1) {
							var13.method468(field404[0], field404[field168[var14]]);
						}
					}
				}

				var13.method461();
				var13.method462(LCRVYGCP.field795[field396.field1009].field797[0]);
				var13.method471(64, 850, -30, -50, -30, true);
				arg0.field1269 = 5;
				arg0.field1270 = 0;
				TNOPEJNZ.method496(5, 0, var13);
			}
		} else if (var2 == 324) {
			if (field325 == null) {
				field325 = arg0.field1326;
				field326 = arg0.field1282;
			}

			if (field421) {
				arg0.field1326 = field326;
			} else {
				arg0.field1326 = field325;
			}
		} else if (var2 == 325) {
			if (field325 == null) {
				field325 = arg0.field1326;
				field326 = arg0.field1282;
			}

			if (field421) {
				arg0.field1326 = field325;
			} else {
				arg0.field1326 = field326;
			}
		} else if (var2 == 600) {
			arg0.field1322 = field276;
			if (field236 % 20 < 10) {
				arg0.field1322 = arg0.field1322 + "|";
			} else {
				arg0.field1322 = arg0.field1322 + " ";
			}
		} else if (var2 == 613) {
			if (field419 < 1) {
				arg0.field1322 = "";
			} else if (field275) {
				arg0.field1331 = 0xFF0000;
				arg0.field1322 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1331 = 0xFFFFFF;
				arg0.field1322 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field282 == 0) {
				arg0.field1322 = "";
			} else {
				String var15;
				if (field340 == 0) {
					var15 = "earlier today";
				} else if (field340 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field340 + " days ago";
				}

				arg0.field1322 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field405 == 0) {
				arg0.field1322 = "0 unread messages";
				arg0.field1331 = 0xFFFF00;
			}

			if (field405 == 1) {
				arg0.field1322 = "1 unread message";
				arg0.field1331 = 0xFF00;
			}

			if (field405 > 1) {
				arg0.field1322 = field405 + " unread messages";
				arg0.field1331 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field377 == 201) {
				if (field188 == 1) {
					arg0.field1322 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1322 = "";
				}
			} else if (field377 == 200) {
				arg0.field1322 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field377 == 0) {
					var16 = "Earlier today";
				} else if (field377 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field377 + " days ago";
				}

				arg0.field1322 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field377 == 201) {
				if (field188 == 1) {
					arg0.field1322 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1322 = "";
				}
			} else if (field377 == 200) {
				arg0.field1322 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1322 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field377 == 201) {
				if (field188 == 1) {
					arg0.field1322 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1322 = "";
				}
			} else if (field377 == 200) {
				arg0.field1322 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1322 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method153() {
		field393 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field479) {
				field345++;
				method126();
				method126();
				method156();
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

		field393 = false;
	}

	@ObfuscatedName("client.b(LJHKSAGUC;II)V")
	public final void method154(JHKSAGUC arg0, int arg1) {
		if (arg1 == 189) {
			int var3 = arg0.method326();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field197[var4];
			int var7 = arg0.method325();
			int var8 = (var7 >> 4 & 0x7) + field406;
			int var9 = (var7 & 0x7) + field407;
			int var10 = arg0.method335();
			if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
				int var11 = field341[field122][var8][var9];
				int var12 = field341[field122][var8 + 1][var9];
				int var13 = field341[field122][var8 + 1][var9 + 1];
				int var14 = field341[field122][var8][var9 + 1];
				if (var6 == 0) {
					PFUEXSRR var15 = field458.method526(var9, var8, field122);
					if (var15 != null) {
						int var16 = var15.field928 >> 14 & 0x7FFF;
						if (var4 == 2) {
							var15.field926 = new HALGFRSE(2, var5 + 4, var12, var16, var10, var14, var13, false, var11);
							var15.field927 = new HALGFRSE(2, var5 + 1 & 0x3, var12, var16, var10, var14, var13, false, var11);
						} else {
							var15.field926 = new HALGFRSE(var4, var5, var12, var16, var10, var14, var13, false, var11);
						}
					}
				}

				if (var6 == 1) {
					LOBYMLZB var17 = field458.method527(var9, field122, var8);
					if (var17 != null) {
						var17.field829 = new HALGFRSE(4, 0, var12, var17.field830 >> 14 & 0x7FFF, var10, var14, var13, false, var11);
					}
				}

				if (var6 == 2) {
					LRPWHDBW var18 = field458.method528(var9, field122, var8);

					if (var4 == 11) {
						var4 = 10;
					}

					if (var18 != null) {
						var18.field836 = new HALGFRSE(var4, var5, var12, var18.field844 >> 14 & 0x7FFF, var10, var14, var13, false, var11);
					}
				}

				if (var6 == 3) {
					QSFLBNZK var19 = field458.method529(var8, var9, field122);
					if (var19 != null) {
						var19.field1049 = new HALGFRSE(22, var5, var12, var19.field1050 >> 14 & 0x7FFF, var10, var14, var13, false, var11);
					}
				}
			}
		} else if (arg1 == 19) {
			int var20 = arg0.method335();
			int var21 = arg0.method336();
			int var22 = arg0.method326();
			int var23 = (var22 >> 4 & 0x7) + field406;
			int var24 = (var22 & 0x7) + field407;
			if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
				CTXDUSNR var25 = new CTXDUSNR();
				var25.field528 = var20;
				var25.field527 = var21;

				if (field435[field122][var23][var24] == null) {
					field435[field122][var23][var24] = new OUZUCGGU();
				}

				field435[field122][var23][var24].method390(var25);
				method148(var23, var24);
			}
		} else if (arg1 == 78) {
			int var26 = arg0.method335();
			int var27 = arg0.method336();
			int var28 = arg0.method336();
			int var29 = arg0.method306();
			int var30 = (var29 >> 4 & 0x7) + field406;
			int var31 = (var29 & 0x7) + field407;
			if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104 && field352 != var28) {
				CTXDUSNR var32 = new CTXDUSNR();
				var32.field528 = var27;
				var32.field527 = var26;

				if (field435[field122][var30][var31] == null) {
					field435[field122][var30][var31] = new OUZUCGGU();
				}

				field435[field122][var30][var31].method390(var32);
				method148(var30, var31);
			}
		} else if (arg1 == 32) {
			int var33 = arg0.method306();
			int var34 = (var33 >> 4 & 0x7) + field406;
			int var35 = (var33 & 0x7) + field407;
			int var36 = arg0.method308();
			int var37 = arg0.method308();
			int var38 = arg0.method308();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				OUZUCGGU var39 = field435[field122][var34][var35];
				if (var39 != null) {
					for (CTXDUSNR var40 = (CTXDUSNR) var39.method393(); var40 != null; var40 = (CTXDUSNR) var39.method395()) {
						if ((var36 & 0x7FFF) == var40.field528 && var40.field527 == var37) {
							var40.field527 = var38;
							break;
						}
					}

					method148(var34, var35);
				}
			}
		} else {
			if (arg1 == 65) {
				int var41 = arg0.method308();
				byte var42 = arg0.method330();
				byte var43 = arg0.method329();
				byte var44 = arg0.method329();
				int var45 = arg0.method327();
				int var46 = var45 >> 2;
				int var47 = var45 & 0x3;
				int var48 = field197[var46];
				int var49 = arg0.method326();
				int var50 = (var49 >> 4 & 0x7) + field406;
				int var51 = (var49 & 0x7) + field407;
				int var52 = arg0.method335();
				int var53 = arg0.method335();
				byte var54 = arg0.method330();
				int var55 = arg0.method334();
				FVFJZZXQ var56;
				if (field352 == var55) {
					var56 = field396;
				} else {
					var56 = field213[var55];
				}

				if (var56 != null) {
					SYTHBZWG var57 = SYTHBZWG.method491(var52);
					int var58 = field341[field122][var50][var51];
					int var59 = field341[field122][var50 + 1][var51];
					int var60 = field341[field122][var50 + 1][var51 + 1];
					int var61 = field341[field122][var50][var51 + 1];
					RTQSBWRH var62 = var57.method486(var46, var47, var58, var59, var60, var61, -1);
					if (var62 != null) {
						method63(var48, field122, var41 + 1, var50, var51, 0, -1, var53 + 1, 0);
						var56.field617 = field236 + var53;
						var56.field618 = field236 + var41;
						var56.field615 = var62;
						int var63 = var57.field1203;
						int var64 = var57.field1181;
						if (var47 == 1 || var47 == 3) {
							var63 = var57.field1181;
							var64 = var57.field1203;
						}

						var56.field612 = var50 * 128 + var63 * 64;
						var56.field614 = var51 * 128 + var64 * 64;
						var56.field613 = method173(var56.field614, var56.field612, field122);

						if (var44 > var42) {
							byte var65 = var44;
							var44 = var42;
							var42 = var65;
						}

						if (var54 > var43) {
							byte var66 = var54;
							var54 = var43;
							var43 = var66;
						}

						var56.field619 = var44 + var50;
						var56.field621 = var42 + var50;
						var56.field620 = var51 + var54;
						var56.field622 = var43 + var51;
					}
				}
			}

			if (arg1 == 159) {
				int var67 = arg0.method306();
				int var68 = (var67 >> 4 & 0x7) + field406;
				int var69 = (var67 & 0x7) + field407;
				int var70 = arg0.method308();
				int var71 = arg0.method306();
				int var72 = var71 >> 4 & 0xF;
				int var73 = var71 & 0x7;
				if (field396.field1007[0] >= var68 - var72 && field396.field1007[0] <= var68 + var72 && field396.field1008[0] >= var69 - var72 && field396.field1008[0] <= var69 + var72 && field450 && !field375 && field267 < 50) {
					field104[field267] = var70;
					field164[field267] = var73;
					field366[field267] = PWXXEHUE.field931[var70];
					field267++;
				}
			}

			if (arg1 == 27) {
				int var74 = arg0.method306();
				int var75 = (var74 >> 4 & 0x7) + field406;
				int var76 = (var74 & 0x7) + field407;
				int var77 = arg0.method326();
				int var78 = var77 >> 2;
				int var79 = var77 & 0x3;
				int var80 = field197[var78];
				int var81 = arg0.method308();
				if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
					method63(var80, field122, -1, var75, var76, var78, var81, 0, var79);
				}
			} else if (arg1 == 101) {
				int var82 = arg0.method306();
				int var83 = (var82 >> 4 & 0x7) + field406;
				int var84 = (var82 & 0x7) + field407;
				int var85 = arg0.method327();
				int var86 = var85 >> 2;
				int var87 = var85 & 0x3;
				int var88 = field197[var86];
				if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
					method63(var88, field122, -1, var83, var84, var86, -1, 0, var87);
				}
			} else if (arg1 == 183) {
				int var89 = arg0.method306();
				int var90 = (var89 >> 4 & 0x7) + field406;
				int var91 = (var89 & 0x7) + field407;
				int var92 = arg0.method308();
				int var93 = arg0.method306();
				int var94 = arg0.method308();
				if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
					var90 = var90 * 128 + 64;
					var91 = var91 * 128 + 64;
					QBCJVLJJ var95 = new QBCJVLJJ(var91, field236, method173(var91, var90, field122) - var93, var90, var92, var94, field122);
					field402.method390(var95);
				}
			} else if (arg1 == 4) {
				int var96 = arg0.method335();
				int var97 = arg0.method326();
				int var98 = (var97 >> 4 & 0x7) + field406;
				int var99 = (var97 & 0x7) + field407;
				if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
					OUZUCGGU var100 = field435[field122][var98][var99];
					if (var100 != null) {
						for (CTXDUSNR var101 = (CTXDUSNR) var100.method393(); var101 != null; var101 = (CTXDUSNR) var100.method395()) {
							if ((var96 & 0x7FFF) == var101.field528) {
								var101.method290();
								break;
							}
						}

						if (var100.method393() == null) {
							field435[field122][var98][var99] = null;
						}

						method148(var98, var99);
					}
				}
			} else if (arg1 == 223) {
				int var102 = arg0.method306();
				int var103 = (var102 >> 4 & 0x7) + field406;
				int var104 = (var102 & 0x7) + field407;
				int var105 = var103 + arg0.method307();
				int var106 = var104 + arg0.method307();
				int var107 = arg0.method309();
				int var108 = arg0.method308();
				int var109 = arg0.method306() * 4;
				int var110 = arg0.method306() * 4;
				int var111 = arg0.method308();
				int var112 = arg0.method308();
				int var113 = arg0.method306();
				int var114 = arg0.method306();
				if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var108 != 0xFFFF) {
					var103 = var103 * 128 + 64;
					var104 = var104 * 128 + 64;
					var105 = var105 * 128 + 64;
					var106 = var106 * 128 + 64;
					HEJSGXMA var115 = new HEJSGXMA(var108, field236 + var111, var103, var107, var114, method173(var104, var103, field122) - var109, var104, field236 + var112, var110, var113, field122);
					var115.method287(method173(var106, var105, field122) - var110, var105, var106, field236 + var111);
					field196.method390(var115);
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method155() {
		byte[] var1 = field268.method289("title.dat", null);
		DLNMSHLT var2 = new DLNMSHLT(var1, this);
		field181.method196();
		var2.method203(0, 0);
		field182.method196();
		var2.method203(-637, 0);
		field178.method196();
		var2.method203(-128, 0);
		field179.method196();
		var2.method203(-202, -371);
		field180.method196();
		var2.method203(-202, -171);
		field183.method196();
		var2.method203(0, -265);
		field184.method196();
		var2.method203(-562, -265);
		field185.method196();
		var2.method203(-128, -171);
		field186.method196();
		var2.method203(-562, -171);
		int[] var3 = new int[var2.field542];
		for (int var4 = 0; var4 < var2.field543; var4++) {
			for (int var5 = 0; var5 < var2.field542; var5++) {
				var3[var5] = var2.field541[var2.field542 * var4 + var2.field542 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field542; var6++) {
				var2.field541[var2.field542 * var4 + var6] = var3[var6];
			}
		}

		field181.method196();
		var2.method203(382, 0);
		field182.method196();
		var2.method203(-255, 0);
		field178.method196();
		var2.method203(254, 0);
		field179.method196();
		var2.method203(180, -371);
		field180.method196();
		var2.method203(180, -171);
		field183.method196();
		var2.method203(382, -265);
		field184.method196();
		var2.method203(-180, -265);
		field185.method196();
		var2.method203(254, -171);
		field186.method196();
		var2.method203(-180, -171);
		DLNMSHLT var7 = new DLNMSHLT(field268, "logo", 0);
		field178.method196();
		var7.method205(18, 382 - var7.field542 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.F(I)V")
	public final void method156() {
		short var1 = 256;

		if (field487 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field487 > 768) {
					field408[var2] = method84(field410[var2], field409[var2], 1024 - field487);
				} else if (field487 > 256) {
					field408[var2] = field410[var2];
				} else {
					field408[var2] = method84(field409[var2], field410[var2], 256 - field487);
				}
			}
		} else if (field488 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field488 > 768) {
					field408[var3] = method84(field411[var3], field409[var3], 1024 - field488);
				} else if (field488 > 256) {
					field408[var3] = field411[var3];
				} else {
					field408[var3] = method84(field409[var3], field411[var3], 256 - field488);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field408[var4] = field409[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field181.field521[var5] = field354.field541[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field281[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field227[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field408[var12];
					int var15 = field181.field521[var7];
					field181.field521[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field181.method197(field74, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field182.field521[var16] = field355.field541[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field281[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field227[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field408[var23];
					int var26 = field182.field521[var18];
					field182.field521[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field182.method197(field74, 0, 637);
	}

	@ObfuscatedName("client.G(I)V")
	public final void method157() {
		if (field139 == 0) {
			field392[0] = "Cancel";
			field414[0] = 1540;
			field283 = 1;
			method97();
			field301 = 0;

			if (field82 > 4 && field83 > 4 && field82 < 516 && field83 < 338) {
				if (field210 == -1) {
					method125();
				} else {
					method95(0, field82, TNOPEJNZ.field1272[field210], 4, field83, 4);
				}
			}

			if (field301 != field133) {
				field133 = field301;
			}

			field301 = 0;

			if (field82 > 553 && field83 > 205 && field82 < 743 && field83 < 466) {
				if (field235 != -1) {
					method95(0, field82, TNOPEJNZ.field1272[field235], 553, field83, 205);
				} else if (field343[field356] != -1) {
					method95(0, field82, TNOPEJNZ.field1272[field343[field356]], 553, field83, 205);
				}
			}

			if (field416 != field301) {
				field433 = true;
				field416 = field301;
			}

			field301 = 0;

			if (field82 > 17 && field83 > 357 && field82 < 496 && field83 < 453) {
				if (field258 != -1) {
					method95(0, field82, TNOPEJNZ.field1272[field258], 17, field83, 357);
				} else if (field83 < 434 && field82 < 426) {
					method79(field82 - 17, field83 - 357);
				}
			}

			if (field258 != -1 && field301 != field146) {
				field518 = true;
				field146 = field301;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field283 - 1; var2++) {
					if (field414[var2] < 1000 && field414[var2 + 1] > 1000) {
						String var3 = field392[var2];
						field392[var2] = field392[var2 + 1];
						field392[var2 + 1] = var3;
						int var4 = field414[var2];
						field414[var2] = field414[var2 + 1];
						field414[var2 + 1] = var4;
						int var5 = field412[var2];
						field412[var2] = field412[var2 + 1];
						field412[var2 + 1] = var5;
						int var6 = field413[var2];
						field413[var2] = field413[var2 + 1];
						field413[var2 + 1] = var6;
						int var7 = field415[var2];
						field415[var2] = field415[var2 + 1];
						field415[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method55() {
		if (field517 || field243 || field512) {
			method188();
		} else {
			field264++;

			if (field256) {
				method167();
			} else {
				method130(false);
			}

			field224 = 0;
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method158() {
		field315 = 0;
		for (int var1 = -1; var1 < field384 + field214; var1++) {
			QQAAMZPI var2;
			if (var1 == -1) {
				var2 = field396;
			} else if (var1 < field214) {
				var2 = field213[field215[var1]];
			} else {
				var2 = field383[field385[var1 - field214]];
			}

			if (var2 != null && var2.method244()) {
				if (var2 instanceof NLPNWUNL) {
					RBTWCHLG var3 = ((NLPNWUNL) var2).field908;
					if (var3.field1077 != null) {
						var3 = var3.method448();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field214) {
					RBTWCHLG var7 = ((NLPNWUNL) var2).field908;
					if (var7.field1068 >= 0 && var7.field1068 < field447.length) {
						method69(var2.field1024 + 15, var2);

						if (field451 > -1) {
							field447[var7.field1068].method205(field452 - 30, field451 - 12);
						}
					}

					if (field117 == 1 && field385[var1 - field214] == field339 && field236 % 20 < 10) {
						method69(var2.field1024 + 15, var2);

						if (field451 > -1) {
							field447[2].method205(field452 - 28, field451 - 12);
						}
					}
				} else {
					int var4 = 30;
					FVFJZZXQ var5 = (FVFJZZXQ) var2;
					if (var5.field607 != 0) {
						method69(var2.field1024 + 15, var2);

						if (field451 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field607 & 1 << var6) != 0) {
									field447[var6].method205(field452 - var4, field451 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field117 == 10 && field215[var1] == field394) {
						method69(var2.field1024 + 15, var2);

						if (field451 > -1) {
							field447[7].method205(field452 - var4, field451 - 12);
						}
					}
				}

				if (var2.field996 != null && (var1 >= field214 || field103 == 0 || field103 == 3 || field103 == 1 && method174(((FVFJZZXQ) var2).field603))) {
					method69(var2.field1024, var2);

					if (field451 > -1 && field315 < field316) {
						field320[field315] = field312.method421(var2.field996) / 2;
						field319[field315] = field312.field978;
						field317[field315] = field451;
						field318[field315] = field452;
						field321[field315] = var2.field1025;
						field322[field315] = var2.field1017;
						field323[field315] = var2.field1023;
						field324[field315++] = var2.field996;

						if (field389 == 0 && var2.field1017 >= 1 && var2.field1017 <= 3) {
							field319[field315] += 10;
							field318[field315] += 5;
						}

						if (field389 == 0 && var2.field1017 == 4) {
							field320[field315] = 60;
						}

						if (field389 == 0 && var2.field1017 == 5) {
							field319[field315] += 5;
						}
					}
				}

				if (var2.field1029 > field236) {
					method69(var2.field1024 + 15, var2);

					if (field451 > -1) {
						int var8 = var2.field1030 * 30 / var2.field1031;
						if (var8 > 30) {
							var8 = 30;
						}

						FBOVVAQK.method235(5, var8, field452 - 3, 0xFF00, field451 - 15);
						FBOVVAQK.method235(5, 30 - var8, field452 - 3, 0xFF0000, field451 + var8 - 15);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1034[var9] > field236) {
						method69(var2.field1024 / 2, var2);

						if (field451 > -1) {
							if (var9 == 1) {
								field452 -= 20;
							}

							if (var9 == 2) {
								field451 -= 15;
								field452 -= 10;
							}

							if (var9 == 3) {
								field451 += 15;
								field452 -= 10;
							}

							field432[var2.field1033[var9]].method205(field452 - 12, field451 - 12);
							field310.method418(field452 + 4, field451, String.valueOf(var2.field1032[var9]), 0);
							field310.method418(field452 + 3, field451 - 1, String.valueOf(var2.field1032[var9]), 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field315; var10++) {
			int var11 = field317[var10];
			int var12 = field318[var10];
			int var13 = field320[var10];
			int var14 = field319[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field318[var16] - field319[var16] && var12 - var14 < field318[var16] + 2 && var11 - var13 < field320[var16] + field317[var16] && var11 + var13 > field317[var16] - field320[var16] && field318[var16] - field319[var16] < var12) {
						var12 = field318[var16] - field319[var16];
						var15 = true;
					}
				}
			}

			field451 = field317[var10];
			field452 = field318[var10] = var12;
			String var17 = field324[var10];
			if (field389 == 0) {
				int var18 = 0xFFFF00;
				if (field321[var10] < 6) {
					var18 = field362[field321[var10]];
				}

				if (field321[var10] == 6) {
					var18 = field123 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field321[var10] == 7) {
					var18 = field123 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field321[var10] == 8) {
					var18 = field123 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field321[var10] == 9) {
					int var19 = 150 - field323[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field321[var10] == 10) {
					int var20 = 150 - field323[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field321[var10] == 11) {
					int var21 = 150 - field323[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field322[var10] == 0) {
					field312.method418(field452 + 1, field451, var17, 0);
					field312.method418(field452, field451, var17, var18);
				}

				if (field322[var10] == 1) {
					field312.method423(0, field452 + 1, var17, field123, field451);
					field312.method423(var18, field452, var17, field123, field451);
				}

				if (field322[var10] == 2) {
					field312.method424(field452 + 1, field451, 0, field123, var17);
					field312.method424(field452, field451, var18, field123, var17);
				}

				if (field322[var10] == 3) {
					field312.method425(0, field451, field452 + 1, 150 - field323[var10], field123, var17);
					field312.method425(var18, field451, field452, 150 - field323[var10], field123, var17);
				}

				if (field322[var10] == 4) {
					int var22 = field312.method421(var17);
					int var23 = (150 - field323[var10]) * (var22 + 100) / 150;
					FBOVVAQK.method232(field451 + 50, field451 - 50, 334, 0);
					field312.method422(0, var17, field451 + 50 - var23, field452 + 1);
					field312.method422(var18, var17, field451 + 50 - var23, field452);
					FBOVVAQK.method231();
				}

				if (field322[var10] == 5) {
					int var24 = 150 - field323[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					FBOVVAQK.method232(512, 0, field452 + 5, field452 - field312.field978 - 1);
					field312.method418(field452 + var25 + 1, field451, var17, 0);
					field312.method418(field452 + var25, field451, var17, var18);
					FBOVVAQK.method231();
				}
			} else {
				field312.method418(field452 + 1, field451, var17, 0);
				field312.method418(field452, field451, var17, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.a(ILJHKSAGUC;B)V")
	public final void method159(int arg0, JHKSAGUC arg1) {
		while (arg1.field753 + 10 < arg0 * 8) {
			int var3 = arg1.method317(11);
			if (var3 == 2047) {
				break;
			}

			if (field213[var3] == null) {
				field213[var3] = new FVFJZZXQ();
				if (field218[var3] != null) {
					field213[var3].method243(field218[var3]);
				}
			}

			field215[field214++] = var3;
			FVFJZZXQ var4 = field213[var3];
			var4.field1022 = field236;
			int var5 = arg1.method317(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method317(1);
			int var7 = arg1.method317(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method317(1);
			if (var8 == 1) {
				field217[field216++] = var3;
			}

			var4.method440(field396.field1008[0] + var5, var6 == 1, field396.field1007[0] + var7);
		}

		arg1.method318();
	}

	@ObfuscatedName("client.H(I)V")
	public final void method160() {
		for (int var1 = 0; var1 < field384; var1++) {
			int var2 = field385[var1];
			NLPNWUNL var3 = field383[var2];
			if (var3 != null) {
				method161(var3, var3.field908.field1053);
			}
		}
	}

	@ObfuscatedName("client.a(LQQAAMZPI;II)V")
	public final void method161(QQAAMZPI arg0, int arg1) {
		if (arg0.field1019 < 128 || arg0.field1020 < 128 || arg0.field1019 >= 13184 || arg0.field1020 >= 13184) {
			arg0.field1035 = -1;
			arg0.field991 = -1;
			arg0.field1002 = 0;
			arg0.field1003 = 0;
			arg0.field1019 = arg0.field1007[0] * 128 + arg0.field1006 * 64;
			arg0.field1020 = arg0.field1008[0] * 128 + arg0.field1006 * 64;
			arg0.method441();
		}

		if (field396 == arg0 && (arg0.field1019 < 1536 || arg0.field1020 < 1536 || arg0.field1019 >= 11776 || arg0.field1020 >= 11776)) {
			arg0.field1035 = -1;
			arg0.field991 = -1;
			arg0.field1002 = 0;
			arg0.field1003 = 0;
			arg0.field1019 = arg0.field1007[0] * 128 + arg0.field1006 * 64;
			arg0.field1020 = arg0.field1008[0] * 128 + arg0.field1006 * 64;
			arg0.method441();
		}

		if (arg0.field1002 > field236) {
			method162(arg0);
		} else if (arg0.field1003 >= field236) {
			method163(arg0);
		} else {
			method164(arg0);
		}

		method165(arg0);
		method166(arg0);
	}

	@ObfuscatedName("client.a(BLQQAAMZPI;)V")
	public final void method162(QQAAMZPI arg0) {
		int var2 = arg0.field1002 - field236;
		int var3 = arg0.field998 * 128 + arg0.field1006 * 64;
		int var4 = arg0.field1006 * 64 + arg0.field1000 * 128;
		arg0.field1019 += (var3 - arg0.field1019) / var2;
		arg0.field1020 += (var4 - arg0.field1020) / var2;
		arg0.field1018 = 0;

		if (arg0.field1004 == 0) {
			arg0.field997 = 1024;
		}

		if (arg0.field1004 == 1) {
			arg0.field997 = 1536;
		}

		if (arg0.field1004 == 2) {
			arg0.field997 = 0;
		}

		if (arg0.field1004 == 3) {
			arg0.field997 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLQQAAMZPI;)V")
	public final void method163(QQAAMZPI arg0) {
		if (field236 == arg0.field1003 || arg0.field1035 == -1 || arg0.field1038 != 0 || arg0.field1037 + 1 > LCRVYGCP.field795[arg0.field1035].method361(arg0.field1036)) {
			int var2 = arg0.field1003 - arg0.field1002;
			int var3 = field236 - arg0.field1002;
			int var4 = arg0.field998 * 128 + arg0.field1006 * 64;
			int var5 = arg0.field1006 * 64 + arg0.field1000 * 128;
			int var6 = arg0.field999 * 128 + arg0.field1006 * 64;
			int var7 = arg0.field1006 * 64 + arg0.field1001 * 128;
			arg0.field1019 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1020 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1018 = 0;

		if (arg0.field1004 == 0) {
			arg0.field997 = 1024;
		}

		if (arg0.field1004 == 1) {
			arg0.field997 = 1536;
		}

		if (arg0.field1004 == 2) {
			arg0.field997 = 0;
		}

		if (arg0.field1004 == 3) {
			arg0.field997 = 512;
		}

		arg0.field1021 = arg0.field997;
	}

	@ObfuscatedName("client.b(BLQQAAMZPI;)V")
	public final void method164(QQAAMZPI arg0) {
		arg0.field1013 = arg0.field1009;
		if (arg0.field1005 == 0) {
			arg0.field1018 = 0;
		} else {
			if (arg0.field1035 != -1 && arg0.field1038 == 0) {
				LCRVYGCP var2 = LCRVYGCP.field795[arg0.field1035];
				if (arg0.field1016 > 0 && var2.field807 == 0) {
					arg0.field1018++;
					return;
				}

				if (arg0.field1016 <= 0 && var2.field808 == 0) {
					arg0.field1018++;
					return;
				}
			}

			int var3 = arg0.field1019;
			int var4 = arg0.field1020;
			int var5 = arg0.field1007[arg0.field1005 - 1] * 128 + arg0.field1006 * 64;
			int var6 = arg0.field1008[arg0.field1005 - 1] * 128 + arg0.field1006 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field997 = 1280;
					} else if (var4 > var6) {
						arg0.field997 = 1792;
					} else {
						arg0.field997 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field997 = 768;
					} else if (var4 > var6) {
						arg0.field997 = 256;
					} else {
						arg0.field997 = 512;
					}
				} else if (var4 < var6) {
					arg0.field997 = 1024;
				} else {
					arg0.field997 = 0;
				}

				int var7 = arg0.field997 - arg0.field1021 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1042;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1041;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1044;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1043;
				}

				if (var8 == -1) {
					var8 = arg0.field1041;
				}

				arg0.field1013 = var8;
				int var9 = 4;
				if (arg0.field997 != arg0.field1021 && arg0.field1027 == -1 && arg0.field1045 != 0) {
					var9 = 2;
				}

				if (arg0.field1005 > 2) {
					var9 = 6;
				}

				if (arg0.field1005 > 3) {
					var9 = 8;
				}

				if (arg0.field1018 > 0 && arg0.field1005 > 1) {
					var9 = 8;
					arg0.field1018--;
				}

				if (arg0.field1026[arg0.field1005 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1041 == arg0.field1013 && arg0.field1028 != -1) {
					arg0.field1013 = arg0.field1028;
				}

				if (var3 < var5) {
					arg0.field1019 += var9;
					if (arg0.field1019 > var5) {
						arg0.field1019 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1019 -= var9;
					if (arg0.field1019 < var5) {
						arg0.field1019 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1020 += var9;
					if (arg0.field1020 > var6) {
						arg0.field1020 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1020 -= var9;
					if (arg0.field1020 < var6) {
						arg0.field1020 = var6;
					}
				}

				if (arg0.field1019 == var5 && arg0.field1020 == var6) {
					arg0.field1005--;

					if (arg0.field1016 > 0) {
						arg0.field1016--;
						return;
					}
				}
			} else {
				arg0.field1019 = var5;
				arg0.field1020 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ILQQAAMZPI;)V")
	public final void method165(QQAAMZPI arg0) {
		if (arg0.field1045 != 0) {
			if (arg0.field1027 != -1 && arg0.field1027 < 32768) {
				NLPNWUNL var2 = field383[arg0.field1027];
				if (var2 != null) {
					int var3 = arg0.field1019 - var2.field1019;
					int var4 = arg0.field1020 - var2.field1020;
					if (var3 != 0 || var4 != 0) {
						arg0.field997 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1027 >= 32768) {
				int var5 = arg0.field1027 - 32768;
				if (field352 == var5) {
					var5 = field212;
				}

				FVFJZZXQ var6 = field213[var5];
				if (var6 != null) {
					int var7 = arg0.field1019 - var6.field1019;
					int var8 = arg0.field1020 - var6.field1020;
					if (var7 != 0 || var8 != 0) {
						arg0.field997 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1011 != 0 || arg0.field1012 != 0) && (arg0.field1005 == 0 || arg0.field1018 > 0)) {
				int var9 = arg0.field1019 - (arg0.field1011 - field503 - field503) * 64;
				int var10 = arg0.field1020 - (arg0.field1012 - field504 - field504) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field997 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1011 = 0;
				arg0.field1012 = 0;
			}

			int var11 = arg0.field997 - arg0.field1021 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1045 || var11 > 2048 - arg0.field1045) {
					arg0.field1021 = arg0.field997;
				} else if (var11 > 1024) {
					arg0.field1021 -= arg0.field1045;
				} else {
					arg0.field1021 += arg0.field1045;
				}

				arg0.field1021 &= 0x7FF;
				if (arg0.field1013 == arg0.field1009 && arg0.field997 != arg0.field1021) {
					if (arg0.field1010 != -1) {
						arg0.field1013 = arg0.field1010;
						return;
					}

					arg0.field1013 = arg0.field1041;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LQQAAMZPI;I)V")
	public final void method166(QQAAMZPI arg0) {
		arg0.field1040 = false;

		if (arg0.field1013 != -1) {
			LCRVYGCP var2 = LCRVYGCP.field795[arg0.field1013];
			arg0.field1015++;
			if (arg0.field1014 < var2.field796 && arg0.field1015 > var2.method361(arg0.field1014)) {
				arg0.field1015 = 0;
				arg0.field1014++;
			}

			if (arg0.field1014 >= var2.field796) {
				arg0.field1015 = 0;
				arg0.field1014 = 0;
			}
		}

		if (arg0.field991 != -1 && field236 >= arg0.field994) {
			if (arg0.field992 < 0) {
				arg0.field992 = 0;
			}

			LCRVYGCP var3 = UAVNMKVJ.field1333[arg0.field991].field1337;
			arg0.field993++;
			while (arg0.field992 < var3.field796 && arg0.field993 > var3.method361(arg0.field992)) {
				arg0.field993 -= var3.method361(arg0.field992);
				arg0.field992++;
			}

			if (arg0.field992 >= var3.field796 && (arg0.field992 < 0 || arg0.field992 >= var3.field796)) {
				arg0.field991 = -1;
			}
		}

		if (arg0.field1035 != -1 && arg0.field1038 <= 1) {
			LCRVYGCP var4 = LCRVYGCP.field795[arg0.field1035];
			if (var4.field807 == 1 && arg0.field1016 > 0 && arg0.field1002 <= field236 && arg0.field1003 < field236) {
				arg0.field1038 = 1;
				return;
			}
		}

		if (arg0.field1035 != -1 && arg0.field1038 == 0) {
			LCRVYGCP var5 = LCRVYGCP.field795[arg0.field1035];
			arg0.field1037++;
			while (arg0.field1036 < var5.field796 && arg0.field1037 > var5.method361(arg0.field1036)) {
				arg0.field1037 -= var5.method361(arg0.field1036);
				arg0.field1036++;
			}

			if (arg0.field1036 >= var5.field796) {
				arg0.field1036 -= var5.field800;
				arg0.field1039++;
				if (arg0.field1039 >= var5.field806) {
					arg0.field1035 = -1;
				}

				if (arg0.field1036 < 0 || arg0.field1036 >= var5.field796) {
					arg0.field1035 = -1;
				}
			}

			arg0.field1040 = var5.field802;
		}

		if (arg0.field1038 > 0) {
			arg0.field1038--;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method167() {
		if (field444) {
			field444 = false;
			field108.method197(field74, 4, 0);
			field109.method197(field74, 357, 0);
			field110.method197(field74, 4, 722);
			field111.method197(field74, 205, 743);
			field112.method197(field74, 0, 0);
			field113.method197(field74, 4, 516);
			field114.method197(field74, 205, 516);
			field115.method197(field74, 357, 496);
			field116.method197(field74, 338, 0);
			field433 = true;
			field518 = true;
			field254 = true;
			field163 = true;

			if (field238 != 2) {
				field231.method197(field74, 4, 4);
				field230.method197(field74, 4, 550);
			}
		}

		if (field238 == 2) {
			method109();
		}

		if (field265 && field151 == 1) {
			field433 = true;
		}

		if (field235 != -1) {
			boolean var1 = method193(field235, field99);
			if (var1) {
				field433 = true;
			}
		}

		if (field485 == 2) {
			field433 = true;
		}

		if (field139 == 2) {
			field433 = true;
		}

		if (field433) {
			method86();
			field433 = false;
		}

		if (field258 == -1) {
			field249.field1323 = field131 - field189 - 77;

			if (field82 > 448 && field82 < 560 && field83 > 332) {
				method180(false, 77, field131, 463, field82 - 17, field249, field83 - 357, 0);
			}

			int var2 = field131 - field249.field1323 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field131 - 77) {
				var2 = field131 - 77;
			}

			if (field189 != var2) {
				field189 = var2;
				field518 = true;
			}
		}

		if (field258 != -1) {
			boolean var3 = method193(field258, field99);
			if (var3) {
				field518 = true;
			}
		}

		if (field485 == 3) {
			field518 = true;
		}

		if (field139 == 3) {
			field518 = true;
		}

		if (field136 != null) {
			field518 = true;
		}

		if (field265 && field151 == 2) {
			field518 = true;
		}

		if (field518) {
			method129();
			field518 = false;
		}

		if (field238 == 2) {
			method83();
			field230.method197(field74, 4, 550);
		}

		if (field195 != -1) {
			field254 = true;
		}

		if (field254) {
			if (field195 != -1 && field356 == field195) {
				field195 = -1;
				field147.method295(86);
				field147.method296(field356);
			}

			field254 = false;
			field461.method196();
			field439.method587(0, 0);

			if (field235 == -1) {
				if (field343[field356] != -1) {
					if (field356 == 0) {
						field259.method587(10, 22);
					}

					if (field356 == 1) {
						field260.method587(8, 54);
					}

					if (field356 == 2) {
						field260.method587(8, 82);
					}

					if (field356 == 3) {
						field261.method587(8, 110);
					}

					if (field356 == 4) {
						field263.method587(8, 153);
					}

					if (field356 == 5) {
						field263.method587(8, 181);
					}

					if (field356 == 6) {
						field262.method587(9, 209);
					}
				}

				if (field343[0] != -1 && (field195 != 0 || field236 % 20 < 10)) {
					field338[0].method587(13, 29);
				}

				if (field343[1] != -1 && (field195 != 1 || field236 % 20 < 10)) {
					field338[1].method587(11, 53);
				}

				if (field343[2] != -1 && (field195 != 2 || field236 % 20 < 10)) {
					field338[2].method587(11, 82);
				}

				if (field343[3] != -1 && (field195 != 3 || field236 % 20 < 10)) {
					field338[3].method587(12, 115);
				}

				if (field343[4] != -1 && (field195 != 4 || field236 % 20 < 10)) {
					field338[4].method587(13, 153);
				}

				if (field343[5] != -1 && (field195 != 5 || field236 % 20 < 10)) {
					field338[5].method587(11, 180);
				}

				if (field343[6] != -1 && (field195 != 6 || field236 % 20 < 10)) {
					field338[6].method587(13, 208);
				}
			}

			field461.method197(field74, 160, 516);
			field460.method196();
			field438.method587(0, 0);

			if (field235 == -1) {
				if (field343[field356] != -1) {
					if (field356 == 7) {
						field303.method587(0, 42);
					}

					if (field356 == 8) {
						field304.method587(0, 74);
					}

					if (field356 == 9) {
						field304.method587(0, 102);
					}

					if (field356 == 10) {
						field305.method587(1, 130);
					}

					if (field356 == 11) {
						field307.method587(0, 173);
					}

					if (field356 == 12) {
						field307.method587(0, 201);
					}

					if (field356 == 13) {
						field306.method587(0, 229);
					}
				}

				if (field343[8] != -1 && (field195 != 8 || field236 % 20 < 10)) {
					field338[7].method587(2, 74);
				}

				if (field343[9] != -1 && (field195 != 9 || field236 % 20 < 10)) {
					field338[8].method587(3, 102);
				}

				if (field343[10] != -1 && (field195 != 10 || field236 % 20 < 10)) {
					field338[9].method587(4, 137);
				}

				if (field343[11] != -1 && (field195 != 11 || field236 % 20 < 10)) {
					field338[10].method587(2, 174);
				}

				if (field343[12] != -1 && (field195 != 12 || field236 % 20 < 10)) {
					field338[11].method587(2, 201);
				}

				if (field343[13] != -1 && (field195 != 13 || field236 % 20 < 10)) {
					field338[12].method587(2, 226);
				}
			}

			field460.method197(field74, 466, 496);
			field231.method196();
		}

		if (field163) {
			field163 = false;
			field459.method196();
			field437.method587(0, 0);
			field311.method419(true, "Public chat", 55, 0xFFFFFF, 28);

			if (field103 == 0) {
				field311.method419(true, "On", 55, 0xFF00, 41);
			}

			if (field103 == 1) {
				field311.method419(true, "Friends", 55, 0xFFFF00, 41);
			}

			if (field103 == 2) {
				field311.method419(true, "Off", 55, 0xFF0000, 41);
			}

			if (field103 == 3) {
				field311.method419(true, "Hide", 55, 0xFFFF, 41);
			}

			field311.method419(true, "Private chat", 184, 0xFFFFFF, 28);

			if (field242 == 0) {
				field311.method419(true, "On", 184, 0xFF00, 41);
			}

			if (field242 == 1) {
				field311.method419(true, "Friends", 184, 0xFFFF00, 41);
			}

			if (field242 == 2) {
				field311.method419(true, "Off", 184, 0xFF0000, 41);
			}

			field311.method419(true, "Trade/compete", 324, 0xFFFFFF, 28);

			if (field478 == 0) {
				field311.method419(true, "On", 324, 0xFF00, 41);
			}

			if (field478 == 1) {
				field311.method419(true, "Friends", 324, 0xFFFF00, 41);
			}

			if (field478 == 2) {
				field311.method419(true, "Off", 324, 0xFF0000, 41);
			}

			field311.method419(true, "Report abuse", 458, 0xFFFFFF, 33);
			field459.method197(field74, 453, 0);
			field231.method196();
		}

		field99 = 0;
	}

	@ObfuscatedName("client.c(LJHKSAGUC;II)V")
	public final void method168(JHKSAGUC arg0, int arg1) {
		field119 = 0;
		field216 = 0;
		method123(arg1, arg0);
		method192(arg1, arg0);
		method159(arg1, arg0);
		method65(arg1, arg0);

		for (int var3 = 0; var3 < field119; var3++) {
			int var4 = field120[var3];
			if (field236 != field213[var4].field1022) {
				field213[var4] = null;
			}
		}

		if (arg0.field752 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field752 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field214; var5++) {
			if (field213[field215[var5]] == null) {
				signlink.reporterror(field291 + " null entry in pl list - pos:" + var5 + " size:" + field214);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(LRBTWCHLG;IZII)V")
	public final void method169(RBTWCHLG arg0, int arg1, int arg2, int arg3) {
		if (field283 < 400) {
			if (arg0.field1077 != null) {
				arg0 = arg0.method448();
			}

			if (arg0 != null && arg0.field1072) {
				String var5 = arg0.field1055;
				if (arg0.field1059 != 0) {
					var5 = var5 + method127(arg0.field1059, field396.field627) + " (level-" + arg0.field1059 + ")";
				}

				if (field469 == 1) {
					field392[field283] = "Use " + field473 + " with @yel@" + var5;
					field414[field283] = 237;
					field415[field283] = arg1;
					field412[field283] = arg2;
					field413[field283] = arg3;
					field283++;
				} else if (field220 != 1) {
					if (arg0.field1052 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field1052[var6] != null && !arg0.field1052[var6].equalsIgnoreCase("attack")) {
								field392[field283] = arg0.field1052[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field414[field283] = 296;
								}

								if (var6 == 1) {
									field414[field283] = 187;
								}

								if (var6 == 2) {
									field414[field283] = 464;
								}

								if (var6 == 3) {
									field414[field283] = 667;
								}

								if (var6 == 4) {
									field414[field283] = 270;
								}

								field415[field283] = arg1;
								field412[field283] = arg2;
								field413[field283] = arg3;
								field283++;
							}
						}
					}

					if (arg0.field1052 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field1052[var7] != null && arg0.field1052[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field1059 > field396.field627) {
									var8 = 2000;
								}

								field392[field283] = arg0.field1052[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field414[field283] = var8 + 296;
								}

								if (var7 == 1) {
									field414[field283] = var8 + 187;
								}

								if (var7 == 2) {
									field414[field283] = var8 + 464;
								}

								if (var7 == 3) {
									field414[field283] = var8 + 667;
								}

								if (var7 == 4) {
									field414[field283] = var8 + 270;
								}

								field415[field283] = arg1;
								field412[field283] = arg2;
								field413[field283] = arg3;
								field283++;
							}
						}
					}

					field392[field283] = "Examine @yel@" + var5;
					field414[field283] = 1842;
					field415[field283] = arg1;
					field412[field283] = arg2;
					field413[field283] = arg3;
					field283++;
				} else if ((field222 & 0x2) == 2) {
					field392[field283] = field223 + " @yel@" + var5;
					field414[field283] = 209;
					field415[field283] = arg1;
					field412[field283] = arg2;
					field413[field283] = arg3;
					field283++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method56() {
		field444 = true;
	}

	@ObfuscatedName("client.b(ZB)V")
	public final void method170(boolean arg0) {
		for (int var2 = 0; var2 < field384; var2++) {
			NLPNWUNL var3 = field383[field385[var2]];
			int var4 = (field385[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method244() && var3.field908.field1054 == arg0) {
				int var5 = var3.field1019 >> 7;
				int var6 = var3.field1020 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1006 == 1 && (var3.field1019 & 0x7F) == 0x40 && (var3.field1020 & 0x7F) == 0x40) {
						if (field474[var5][var6] == field123) {
							continue;
						}

						field474[var5][var6] = field123;
					}

					if (!var3.field908.field1072) {
						var4 += Integer.MIN_VALUE;
					}

					field458.method515(method173(var3.field1020, var3.field1019, field122), var4, (var3.field1006 - 1) * 64 + 60, var3.field1040, field122, var3.field1019, var3, var3.field1020, var3.field1021);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIZIBIII)Z")
	public final boolean method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field462[var14][var15] = 0;
				field300[var14][var15] = 99999999;
			}
		}

		int var16 = arg4;
		int var17 = arg8;
		field462[arg4][arg8] = 99;
		field300[arg4][arg8] = 0;
		byte var18 = 0;
		int var19 = 0;
		field476[var18] = arg4;
		int var35 = var18 + 1;
		field477[var18] = arg8;
		boolean var20 = false;
		int var21 = field476.length;
		int[][] var22 = field436[field122].field786;
		while (var35 != var19) {
			var16 = field476[var19];
			var17 = field477[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && field436[field122].method353(var16, arg5 - 1, arg7, var17, arg0, arg10)) {
					var20 = true;
					break;
				}

				if (arg5 < 10 && field436[field122].method354(arg0, var16, arg7, var17, arg10, arg5 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg9 != 0 && arg2 != 0 && field436[field122].method355(arg1, arg2, arg0, arg9, var17, var16, arg10)) {
				var20 = true;
				break;
			}

			int var23 = field300[var16][var17] + 1;
			if (var16 > 0 && field462[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field476[var35] = var16 - 1;
				field477[var35] = var17;
				var35 = (var35 + 1) % var21;
				field462[var16 - 1][var17] = 2;
				field300[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field462[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field476[var35] = var16 + 1;
				field477[var35] = var17;
				var35 = (var35 + 1) % var21;
				field462[var16 + 1][var17] = 8;
				field300[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field462[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field476[var35] = var16;
				field477[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field462[var16][var17 - 1] = 1;
				field300[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field462[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field476[var35] = var16;
				field477[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field462[var16][var17 + 1] = 4;
				field300[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field462[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field476[var35] = var16 - 1;
				field477[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field462[var16 - 1][var17 - 1] = 3;
				field300[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field462[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field476[var35] = var16 + 1;
				field477[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field462[var16 + 1][var17 - 1] = 9;
				field300[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field462[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field476[var35] = var16 - 1;
				field477[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field462[var16 - 1][var17 + 1] = 6;
				field300[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field462[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field476[var35] = var16 + 1;
				field477[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field462[var16 + 1][var17 + 1] = 12;
				field300[var16 + 1][var17 + 1] = var23;
			}
		}

		field160 = 0;
		if (!var20) {
			if (arg6) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg0 - var25; var26 <= arg0 + var25; var26++) {
						for (int var27 = arg10 - var25; var27 <= arg10 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field300[var26][var27] < var24) {
								var24 = field300[var26][var27];
								var16 = var26;
								var17 = var27;
								field160 = 1;
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
		field476[var28] = var16;
		int var36 = var28 + 1;
		field477[var28] = var17;
		int var29;
		int var30 = var29 = field462[var16][var17];
		while (arg4 != var16 || arg8 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field476[var36] = var16;
				field477[var36++] = var17;
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

			var30 = field462[var16][var17];
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
		int var32 = field476[var36];
		int var33 = field477[var36];

		if (arg3 == 0) {
			field147.method295(146);
			field147.method296(var31 + var31 + 3);
		}

		if (arg3 == 1) {
			field147.method295(130);
			field147.method296(var31 + var31 + 3 + 14);
		}

		if (arg3 == 2) {
			field147.method295(106);
			field147.method296(var31 + var31 + 3);
		}

		field440 = field476[0];
		field441 = field477[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field147.method323(field476[var36] - var32);
			field147.method322(field477[var36] - var33);
		}

		field147.method322(field92[5] == 1 ? 1 : 0);
		field147.method331(field503 + var32);
		field147.method333(field504 + var33);
		return true;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method172() {
		for (DHMMFTZG var1 = (DHMMFTZG) field516.method393(); var1 != null; var1 = (DHMMFTZG) field516.method395()) {
			if (var1.field540 == -1) {
				var1.field529 = 0;
				method102(var1);
			} else {
				var1.method290();
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method173(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field172[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field341[var6][var4][var5] + field341[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field341[var6][var4][var5 + 1] + field341[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method174(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field269; var2++) {
			if (arg0.equalsIgnoreCase(field295[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field396.field603)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.p(B)V")
	public final void method175() {
		if (field88 == 1) {
			if (field89 >= 6 && field89 <= 106 && field90 >= 467 && field90 <= 499) {
				field103 = (field103 + 1) % 4;
				field163 = true;
				field518 = true;
				field147.method295(36);
				field147.method296(field103);
				field147.method296(field242);
				field147.method296(field478);
			}

			if (field89 >= 135 && field89 <= 235 && field90 >= 467 && field90 <= 499) {
				field242 = (field242 + 1) % 3;
				field163 = true;
				field518 = true;
				field147.method295(36);
				field147.method296(field103);
				field147.method296(field242);
				field147.method296(field478);
			}

			if (field89 >= 273 && field89 <= 373 && field90 >= 467 && field90 <= 499) {
				field478 = (field478 + 1) % 3;
				field163 = true;
				field518 = true;
				field147.method295(36);
				field147.method296(field103);
				field147.method296(field242);
				field147.method296(field478);
			}

			if (field89 >= 412 && field89 <= 512 && field90 >= 467 && field90 <= 499) {
				if (field210 == -1) {
					method145();
					field276 = "";
					field275 = false;

					for (int var1 = 0; var1 < TNOPEJNZ.field1272.length; var1++) {
						if (TNOPEJNZ.field1272[var1] != null && TNOPEJNZ.field1272[var1].field1307 == 600) {
							field502 = field210 = TNOPEJNZ.field1272[var1].field1294;
							break;
						}
					}
				} else {
					method111(0, "Please close the interface you have open before using 'report abuse'", "");
				}
			}

			field199++;
			if (field199 > 1671) {
				field199 = 0;
				field147.method295(50);
				field147.method296(0);
				int var2 = field147.field752;
				field147.method296((int) (Math.random() * 256.0D));
				field147.method297((int) (Math.random() * 65536.0D));
				field147.method296(198);

				if ((int) (Math.random() * 2.0D) == 0) {
					field147.method296(116);
				}

				field147.method297((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field147.method297(63782);
				}

				field147.method297((int) (Math.random() * 65536.0D));
				field147.method296((int) (Math.random() * 256.0D));
				field147.method296(1);
				field147.method297(18724);
				field147.method305(field147.field752 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIILDLNMSHLT;)V")
	public final void method176(int arg0, int arg1, DLNMSHLT arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field467 + field427 & 0x7FF;
			int var6 = RTQSBWRH.field1158[var5];
			int var7 = RTQSBWRH.field1159[var5];
			var6 = var6 * 256 / (field489 + 256);
			var7 = var7 * 256 / (field489 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field420.method210(var10, 20, 15, 256, 20, 15, 83 - var13 - 20, var12 + 94 + 4 - 10);
		} else {
			method137(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.a(ZZI)V")
	public final void method177(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method178() {
		field479 = false;
		while (field393) {
			field479 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field422 = null;
		field423 = null;
		field107 = null;
		field408 = null;
		field409 = null;
		field410 = null;
		field411 = null;
		field519 = null;
		field520 = null;
		field227 = null;
		field228 = null;
		field354 = null;
		field355 = null;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method179() {
		try {
			if (field279 != null) {
				field279.method433();
			}
		} catch (Exception var2) {
		}

		field279 = null;
		field256 = false;
		field454 = 0;
		field291 = "";
		field292 = "";
		method64();
		field458.method504();

		for (int var1 = 0; var1 < 4; var1++) {
			field436[var1].method344();
		}

		System.gc();
		method89();
		field150 = -1;
		field247 = -1;
		field98 = 0;
	}

	@ObfuscatedName("client.a(ZIIIIILTNOPEJNZ;II)V")
	public final void method180(boolean arg0, int arg1, int arg2, int arg3, int arg4, TNOPEJNZ arg5, int arg6, int arg7) {
		if (field170) {
			field208 = 32;
		} else {
			field208 = 0;
		}

		field170 = false;
		if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg7 && arg6 < arg7 + 16) {
			arg5.field1323 -= field224 * 4;

			if (arg0) {
				field433 = true;
				return;
			}
		} else if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg1 + arg7 - 16 && arg6 < arg1 + arg7) {
			arg5.field1323 += field224 * 4;

			if (arg0) {
				field433 = true;
				return;
			}
		} else if (arg4 >= arg3 - field208 && arg4 < arg3 + field208 + 16 && arg6 >= arg7 + 16 && arg6 < arg1 + arg7 - 16 && field224 > 0) {
			int var9 = (arg1 - 32) * arg1 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg7 - var9 / 2 - 16;
			int var11 = arg1 - var9 - 32;
			arg5.field1323 = (arg2 - arg1) * var10 / var11;

			if (arg0) {
				field433 = true;
			}

			field170 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(ILJHKSAGUC;I)V")
	public final void method181(JHKSAGUC arg0, int arg1) {
		field119 = 0;
		field216 = 0;
		method82(arg0, arg1);
		method186(arg1, arg0);
		method195(arg0, arg1);

		for (int var3 = 0; var3 < field119; var3++) {
			int var4 = field120[var3];
			if (field236 != field383[var4].field1022) {
				field383[var4].field908 = null;
				field383[var4] = null;
			}
		}

		if (arg0.field752 != arg1) {
			signlink.reporterror(field291 + " size mismatch in getnpcpos - pos:" + arg0.field752 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field384; var5++) {
			if (field383[field385[var5]] == null) {
				signlink.reporterror(field291 + " null entry in npc list - pos:" + var5 + " size:" + field384);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method182() {
		int var1 = field285 * 128 + 64;
		int var2 = field286 * 128 + 64;
		int var3 = method173(var2, var1, field122) - field287;

		if (field491 < var1) {
			field491 += (var1 - field491) * field289 / 1000 + field288;
			if (field491 > var1) {
				field491 = var1;
			}
		}

		if (field491 > var1) {
			field491 -= (field491 - var1) * field289 / 1000 + field288;
			if (field491 < var1) {
				field491 = var1;
			}
		}

		if (field492 < var3) {
			field492 += (var3 - field492) * field289 / 1000 + field288;
			if (field492 > var3) {
				field492 = var3;
			}
		}

		if (field492 > var3) {
			field492 -= (field492 - var3) * field289 / 1000 + field288;
			if (field492 < var3) {
				field492 = var3;
			}
		}

		if (field493 < var2) {
			field493 += (var2 - field493) * field289 / 1000 + field288;
			if (field493 > var2) {
				field493 = var2;
			}
		}

		if (field493 > var2) {
			field493 -= (field493 - var2) * field289 / 1000 + field288;
			if (field493 < var2) {
				field493 = var2;
			}
		}

		int var4 = field329 * 128 + 64;
		int var5 = field330 * 128 + 64;
		int var6 = method173(var5, var4, field122) - field331;
		int var7 = var4 - field491;
		int var8 = var6 - field492;
		int var9 = var5 - field493;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field494 < var11) {
			field494 += (var11 - field494) * field333 / 1000 + field332;
			if (field494 > var11) {
				field494 = var11;
			}
		}

		if (field494 > var11) {
			field494 -= (field494 - var11) * field333 / 1000 + field332;
			if (field494 < var11) {
				field494 = var11;
			}
		}

		int var13 = var12 - field495;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field495 += field333 * var13 / 1000 + field332;
			field495 &= 0x7FF;
		}

		if (var13 < 0) {
			field495 -= -var13 * field333 / 1000 + field332;
			field495 &= 0x7FF;
		}

		int var14 = var12 - field495;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field495 = var12;
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method54() {
		signlink.reporterror = false;

		try {
			if (field279 != null) {
				field279.method433();
			}
		} catch (Exception var1) {
		}

		field279 = null;
		method89();

		if (field124 != null) {
			field124.field1412 = false;
		}

		field124 = null;
		field200.method574();
		field200 = null;
		field382 = null;
		field147 = null;
		field284 = null;
		field219 = null;
		field126 = null;
		field386 = null;
		field143 = null;
		field127 = null;
		field128 = null;
		field341 = null;
		field172 = null;
		field458 = null;
		field436 = null;
		field462 = null;
		field300 = null;
		field476 = null;
		field477 = null;
		field190 = null;
		field229 = null;
		field230 = null;
		field231 = null;
		field232 = null;
		field459 = null;
		field460 = null;
		field461 = null;
		field108 = null;
		field109 = null;
		field110 = null;
		field111 = null;
		field112 = null;
		field113 = null;
		field114 = null;
		field115 = null;
		field116 = null;
		field464 = null;
		field465 = null;
		field466 = null;
		field437 = null;
		field438 = null;
		field439 = null;
		field338 = null;
		field259 = null;
		field260 = null;
		field261 = null;
		field262 = null;
		field263 = null;
		field303 = null;
		field304 = null;
		field305 = null;
		field306 = null;
		field307 = null;
		field135 = null;
		field432 = null;
		field447 = null;
		field424 = null;
		field357 = null;
		field358 = null;
		field359 = null;
		field360 = null;
		field361 = null;
		field388 = null;
		field159 = null;
		field474 = null;
		field213 = null;
		field215 = null;
		field217 = null;
		field218 = null;
		field120 = null;
		field383 = null;
		field385 = null;
		field435 = null;
		field516 = null;
		field196 = null;
		field402 = null;
		field412 = null;
		field413 = null;
		field414 = null;
		field415 = null;
		field392 = null;
		field418 = null;
		field175 = null;
		field176 = null;
		field308 = null;
		field442 = null;
		field295 = null;
		field448 = null;
		field446 = null;
		field181 = null;
		field182 = null;
		field178 = null;
		field179 = null;
		field180 = null;
		field183 = null;
		field184 = null;
		field185 = null;
		field186 = null;
		method178();
		SYTHBZWG.method483();
		RBTWCHLG.method446();
		MACPVTEQ.method380();
		NEDSEYSI.field896 = null;
		DQSOHZWU.field549 = null;
		TNOPEJNZ.field1272 = null;
		WRLMXYTG.field1454 = null;
		LCRVYGCP.field795 = null;
		UAVNMKVJ.field1333 = null;
		UAVNMKVJ.field1345 = null;
		EINNWKRR.field568 = null;
		field75 = null;
		FVFJZZXQ.field623 = null;
		AZWEEYMC.method25();
		UMYAUCNU.method503();
		RTQSBWRH.method450();
		EMBMBPSC.method227();
		System.gc();
	}

	@ObfuscatedName("client.q(B)V")
	public void method183() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field345);

		if (field200 != null) {
			System.out.println("Od-cycle:" + field200.field1431);
		}

		System.out.println("loop-cycle:" + field236);
		System.out.println("draw-cycle:" + field264);
		System.out.println("ptype:" + field202);
		System.out.println("psize:" + field201);

		if (field279 != null) {
			field279.method438();
		}

		field71 = true;
	}

	@ObfuscatedName("client.b(B)Ljava/awt/Component;")
	public final Component method57() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field77 != null) {
			return field77;
		}

		return this;
	}

	@ObfuscatedName("client.N(I)V")
	public final void method184() {
		method136();

		if (field350 == 1) {
			field424[field349 / 100].method205(field348 - 8 - 4, field347 - 8 - 4);
			field336++;
			if (field336 > 161) {
				field336 = 0;
				field147.method295(196);
				field147.method299(0x1795E1);
			}
		}

		if (field350 == 2) {
			field424[field349 / 100 + 4].method205(field348 - 8 - 4, field347 - 8 - 4);
		}

		if (field271 != -1) {
			method193(field271, field99);
			method185(0, TNOPEJNZ.field1272[field271], 0, 0);
		}

		if (field210 != -1) {
			method193(field210, field99);
			method185(0, TNOPEJNZ.field1272[field210], 0, 0);
		}

		method107();

		if (!field265) {
			method157();
			method124();
		} else if (field151 == 0) {
			method92();
		}

		if (field299 == 1) {
			field447[1].method205(296, 472);
		}

		if (field244) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field70 < 15) {
				var3 = 0xFF0000;
			}

			field311.method417(var1, "Fps:" + field70, var2, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field375) {
				int var7 = 0xFF0000;
			}

			field311.method417(var1, "Mem:" + var5 + "k", var2, 0xFFFF00);
			var2 += 15;
		}

		if (field515 != 0) {
			int var8 = field515 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field311.method422(0xFFFF00, "System update in: " + var9 + ":0" + var8, 4, 329);
			} else {
				field311.method422(0xFFFF00, "System update in: " + var9 + ":" + var8, 4, 329);
			}
		}
	}

	@ObfuscatedName("client.a(IILTNOPEJNZ;II)V")
	public final void method185(int arg0, TNOPEJNZ arg1, int arg2, int arg3) {
		if (arg1.field1304 == 0 && arg1.field1321 != null && (!arg1.field1275 || field133 == arg1.field1281 || field416 == arg1.field1281 || field146 == arg1.field1281)) {
			int var5 = FBOVVAQK.field596;
			int var6 = FBOVVAQK.field594;
			int var7 = FBOVVAQK.field597;
			int var8 = FBOVVAQK.field595;
			FBOVVAQK.method232(arg1.field1289 + arg2, arg2, arg1.field1303 + arg0, arg0);
			int var9 = arg1.field1321.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field1313[var10] + arg2;
				int var12 = arg1.field1324[var10] + arg0 - arg3;
				TNOPEJNZ var13 = TNOPEJNZ.field1272[arg1.field1321[var10]];
				var11 += var13.field1293;
				var12 += var13.field1312;

				if (var13.field1307 > 0) {
					method152(var13);
				}

				if (var13.field1304 == 0) {
					if (var13.field1323 > var13.field1292 - var13.field1303) {
						var13.field1323 = var13.field1292 - var13.field1303;
					}

					if (var13.field1323 < 0) {
						var13.field1323 = 0;
					}

					method185(var12, var13, var11, var13.field1323);

					if (var13.field1292 > var13.field1303) {
						method146(var13.field1323, var13.field1303, var13.field1292, var12, var13.field1289 + var11);
					}
				} else if (var13.field1304 != 1) {
					if (var13.field1304 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1303; var15++) {
							for (int var16 = 0; var16 < var13.field1289; var16++) {
								int var17 = (var13.field1284 + 32) * var16 + var11;
								int var18 = (var13.field1316 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1273[var14];
									var18 += var13.field1328[var14];
								}

								if (var13.field1317[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1317[var14] - 1;
									if (var17 > FBOVVAQK.field596 - 32 && var17 < FBOVVAQK.field597 && var18 > FBOVVAQK.field594 - 32 && var18 < FBOVVAQK.field595 || field139 != 0 && field138 == var14) {
										int var22 = 0;
										if (field469 == 1 && field470 == var14 && field471 == var13.field1281) {
											var22 = 0xFFFFFF;
										}

										DLNMSHLT var23 = MACPVTEQ.method375(var13.field1297[var14], var21, var22);
										if (var23 != null) {
											if (field139 != 0 && field138 == var14 && field137 == var13.field1281) {
												var19 = field82 - field140;
												var20 = field83 - field141;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field192 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method207(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < FBOVVAQK.field594 && arg1.field1323 > 0) {
													int var24 = (FBOVVAQK.field594 - var18 - var20) * field99 / 3;
													if (var24 > field99 * 10) {
														var24 = field99 * 10;
													}

													if (var24 > arg1.field1323) {
														var24 = arg1.field1323;
													}

													arg1.field1323 -= var24;
													field141 += var24;
												}

												if (var18 + var20 + 32 > FBOVVAQK.field595 && arg1.field1323 < arg1.field1292 - arg1.field1303) {
													int var25 = (var18 + var20 + 32 - FBOVVAQK.field595) * field99 / 3;
													if (var25 > field99 * 10) {
														var25 = field99 * 10;
													}

													if (var25 > arg1.field1292 - arg1.field1303 - arg1.field1323) {
														var25 = arg1.field1292 - arg1.field1303 - arg1.field1323;
													}

													arg1.field1323 += var25;
													field141 -= var25;
												}
											} else if (field485 != 0 && field484 == var14 && field483 == var13.field1281) {
												var23.method207(var17, var18, 128);
											} else {
												var23.method205(var18, var17);
											}

											if (var23.field546 == 33 || var13.field1297[var14] != 1) {
												int var26 = var13.field1297[var14];
												field310.method422(0, method139(var26), var17 + var19 + 1, var18 + 10 + var20);
												field310.method422(0xFFFF00, method139(var26), var17 + var19, var18 + 9 + var20);
											}
										}
									}
								} else if (var13.field1302 != null && var14 < 20) {
									DLNMSHLT var27 = var13.field1302[var14];
									if (var27 != null) {
										var27.method205(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1304 == 3) {
						boolean var28 = false;
						if (field146 == var13.field1281 || field416 == var13.field1281 || field133 == var13.field1281) {
							var28 = true;
						}

						int var29;
						if (method134(var13)) {
							var29 = var13.field1320;
							if (var28 && var13.field1271 != 0) {
								var29 = var13.field1271;
							}
						} else {
							var29 = var13.field1331;
							if (var28 && var13.field1276 != 0) {
								var29 = var13.field1276;
							}
						}

						if (var13.field1298 == 0) {
							if (var13.field1301) {
								FBOVVAQK.method235(var13.field1303, var13.field1289, var12, var29, var11);
							} else {
								FBOVVAQK.method236(var13.field1303, var11, var13.field1289, var29, var12);
							}
						} else if (var13.field1301) {
							FBOVVAQK.method234(var12, var11, 256 - (var13.field1298 & 0xFF), var13.field1289, var13.field1303, var29);
						} else {
							FBOVVAQK.method237(256 - (var13.field1298 & 0xFF), var12, var13.field1303, var29, var13.field1289, var11);
						}
					} else if (var13.field1304 == 4) {
						QJBJRTJO var30 = var13.field1268;
						String var31 = var13.field1322;
						boolean var32 = false;
						if (field146 == var13.field1281 || field416 == var13.field1281 || field133 == var13.field1281) {
							var32 = true;
						}

						int var33;
						if (method134(var13)) {
							var33 = var13.field1320;
							if (var32 && var13.field1271 != 0) {
								var33 = var13.field1271;
							}

							if (var13.field1299.length() > 0) {
								var31 = var13.field1299;
							}
						} else {
							var33 = var13.field1331;
							if (var32 && var13.field1276 != 0) {
								var33 = var13.field1276;
							}
						}

						if (var13.field1306 == 6 && field132) {
							var31 = "Please wait...";
							var33 = var13.field1331;
						}

						if (FBOVVAQK.field592 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field978 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method76(method110(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method76(method110(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method76(method110(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method76(method110(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method76(method110(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field1325) {
								var30.method419(var13.field1291, var41, var13.field1289 / 2 + var11, var33, var34);
							} else {
								var30.method426(var41, var13.field1291, var11, var33, var34);
							}

							var34 += var30.field978;
						}
					} else if (var13.field1304 == 5) {
						DLNMSHLT var42;
						if (method134(var13)) {
							var42 = var13.field1282;
						} else {
							var42 = var13.field1326;
						}

						if (var42 != null) {
							var42.method205(var12, var11);
						}
					} else if (var13.field1304 == 6) {
						int var43 = AZWEEYMC.field46;
						int var44 = AZWEEYMC.field47;
						AZWEEYMC.field46 = var13.field1289 / 2 + var11;
						AZWEEYMC.field47 = var13.field1303 / 2 + var12;
						int var45 = AZWEEYMC.field50[var13.field1309] * var13.field1308 >> 16;
						int var46 = AZWEEYMC.field51[var13.field1309] * var13.field1308 >> 16;
						boolean var47 = method134(var13);
						int var48;
						if (var47) {
							var48 = var13.field1288;
						} else {
							var48 = var13.field1287;
						}

						RTQSBWRH var49;
						if (var48 == -1) {
							var49 = var13.method499(var47, -1, -1);
						} else {
							LCRVYGCP var50 = LCRVYGCP.field795[var48];
							var49 = var13.method499(var47, var50.field798[var13.field1290], var50.field797[var13.field1290]);
						}

						if (var49 != null) {
							var49.method474(0, var13.field1310, 0, var13.field1309, 0, var45, var46);
						}

						AZWEEYMC.field46 = var43;
						AZWEEYMC.field47 = var44;
					} else if (var13.field1304 == 7) {
						QJBJRTJO var51 = var13.field1268;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field1303; var53++) {
							for (int var54 = 0; var54 < var13.field1289; var54++) {
								if (var13.field1317[var52] > 0) {
									MACPVTEQ var55 = MACPVTEQ.method374(var13.field1317[var52] - 1);
									String var56 = var55.field864;
									if (var55.field881 || var13.field1297[var52] != 1) {
										var56 = var56 + " x" + method138(var13.field1297[var52]);
									}

									int var57 = (var13.field1284 + 115) * var54 + var11;
									int var58 = (var13.field1316 + 12) * var53 + var12;
									if (var13.field1325) {
										var51.method419(var13.field1291, var56, var13.field1289 / 2 + var57, var13.field1331, var58);
									} else {
										var51.method426(var56, var13.field1291, var57, var13.field1331, var58);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			FBOVVAQK.method232(var7, var5, var8, var6);
		}
	}

	public final void init() {
		field372 = Integer.parseInt(getParameter("nodeid"));
		field373 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method99();
		} else {
			method90();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field374 = false;
		} else {
			field374 = true;
		}

		method48(503, 765);
	}

	@ObfuscatedName("client.a(BILJHKSAGUC;)V")
	public final void method186(int arg0, JHKSAGUC arg1) {
		while (arg1.field753 + 21 < arg0 * 8) {
			int var3 = arg1.method317(14);
			if (var3 == 16383) {
				break;
			}

			if (field383[var3] == null) {
				field383[var3] = new NLPNWUNL();
			}

			NLPNWUNL var4 = field383[var3];
			field385[field384++] = var3;
			var4.field1022 = field236;
			int var5 = arg1.method317(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method317(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method317(1);
			var4.field908 = RBTWCHLG.method449(arg1.method317(12));
			int var8 = arg1.method317(1);
			if (var8 == 1) {
				field217[field216++] = var3;
			}

			var4.field1006 = var4.field908.field1053;
			var4.field1045 = var4.field908.field1071;
			var4.field1041 = var4.field908.field1084;
			var4.field1042 = var4.field908.field1079;
			var4.field1043 = var4.field908.field1074;
			var4.field1044 = var4.field908.field1061;
			var4.field1009 = var4.field908.field1081;
			var4.method440(field396.field1008[0] + var5, var7 == 1, field396.field1007[0] + var6);
		}

		arg1.method318();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method187(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field206 = "";
				field207 = "Connecting to server...";
				method130(true);
			}

			field279 = new QLBHZVFC(this, method143(field373 + 43594));
			long var4 = XNWHEMGT.method576(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field147.field752 = 0;
			field147.method296(14);
			field147.method296(var6);
			field279.method437(field147.field751, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field279.method434();
			}

			int var8 = field279.method434();
			int var9 = var8;

			if (var8 == 0) {
				field279.method436(field219.field751, 0, 8);
				field219.field752 = 0;
				field162 = field219.method312();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field162 >> 32), (int) field162 };
				field147.field752 = 0;
				field147.method296(10);
				field147.method300(var10[0]);
				field147.method300(var10[1]);
				field147.method300(var10[2]);
				field147.method300(var10[3]);
				field147.method300(signlink.uid);
				field147.method303(arg0);
				field147.method303(arg1);
				field147.method321(field401, field240);
				field284.field752 = 0;

				if (arg2) {
					field284.method296(18);
				} else {
					field284.method296(16);
				}

				field284.method296(field147.field752 + 36 + 1 + 1 + 2);
				field284.method296(255);
				field284.method297(318);
				field284.method296(field375 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field284.method300(field251[var11]);
				}

				field284.method304(0, field147.field752, field147.field751);
				field147.field756 = new ZPIYFABJ(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field246 = new ZPIYFABJ(var10);
				field279.method437(field284.field751, field284.field752, 0);
				var8 = field279.method434();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method187(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field419 = field279.method434();
				field346 = field279.method434() == 1;
				field169 = 0L;
				field266 = 0;
				field124.field1413 = 0;
				field79 = true;
				field314 = true;
				field256 = true;
				field147.field752 = 0;
				field219.field752 = 0;
				field202 = -1;
				field378 = -1;
				field379 = -1;
				field380 = -1;
				field201 = 0;
				field203 = 0;
				field515 = 0;
				field205 = 0;
				field117 = 0;
				field283 = 0;
				field265 = false;
				field80 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field457[var13] = null;
				}

				field469 = 0;
				field220 = 0;
				field238 = 0;
				field267 = 0;
				field272 = (int) (Math.random() * 100.0D) - 50;
				field165 = (int) (Math.random() * 110.0D) - 55;
				field390 = (int) (Math.random() * 80.0D) - 40;
				field467 = (int) (Math.random() * 120.0D) - 60;
				field489 = (int) (Math.random() * 30.0D) - 20;
				field427 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field280 = 0;
				field486 = -1;
				field440 = 0;
				field441 = 0;
				field214 = 0;
				field384 = 0;

				for (int var14 = 0; var14 < field211; var14++) {
					field213[var14] = null;
					field218[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field383[var15] = null;
				}

				field396 = field213[field212] = new FVFJZZXQ();
				field196.method397();
				field402.method397();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field435[var16][var17][var18] = null;
						}
					}
				}

				field516 = new OUZUCGGU();
				field270 = 0;
				field269 = 0;
				field351 = -1;
				field258 = -1;
				field210 = -1;
				field235 = -1;
				field271 = -1;
				field132 = false;
				field356 = 3;
				field501 = 0;
				field265 = false;
				field257 = false;
				field136 = null;
				field299 = 0;
				field195 = -1;
				field421 = true;
				method96();

				for (int var19 = 0; var19 < 5; var19++) {
					field168[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field513[var20] = null;
					field514[var20] = false;
				}

				field395 = 0;
				field480 = 0;
				field334 = 0;
				field100 = 0;
				field363 = 0;
				field239 = 0;
				field327 = 0;
				field121 = 0;
				method91();
			} else if (var8 == 3) {
				field206 = "";
				field207 = "Invalid username or password.";
			} else if (var8 == 4) {
				field206 = "Your account has been disabled.";
				field207 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field206 = "Your account is already logged in.";
				field207 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field206 = "RuneScape has been updated!";
				field207 = "Please reload this page.";
			} else if (var8 == 7) {
				field206 = "This world is full.";
				field207 = "Please use a different world.";
			} else if (var8 == 8) {
				field206 = "Unable to connect.";
				field207 = "Login server offline.";
			} else if (var8 == 9) {
				field206 = "Login limit exceeded.";
				field207 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field206 = "Unable to connect.";
				field207 = "Bad session id.";
			} else if (var8 == 11) {
				field207 = "Login server rejected session.";
				field207 = "Please try again.";
			} else if (var8 == 12) {
				field206 = "You need a members account to login to this world.";
				field207 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field206 = "Could not complete login.";
				field207 = "Please try using a different world.";
			} else if (var8 == 14) {
				field206 = "The server is being updated.";
				field207 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field256 = true;
				field147.field752 = 0;
				field219.field752 = 0;
				field202 = -1;
				field378 = -1;
				field379 = -1;
				field380 = -1;
				field201 = 0;
				field203 = 0;
				field515 = 0;
				field283 = 0;
				field265 = false;
				field294 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field206 = "Login attempts exceeded.";
				field207 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field206 = "You are standing in a members-only area.";
				field207 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field206 = "Invalid loginserver requested";
				field207 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field279.method434();
				for (var21 += 3; var21 >= 0; var21--) {
					field206 = "You have only just left another world";
					field207 = "Your profile will be transferred in: " + var21;
					method130(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method187(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field206 = "Unexpected server response";
				field207 = "Please try using a different world.";
			} else if (var9 != 0) {
				field206 = "No response from server";
				field207 = "Please try using a different world.";
			} else if (field371 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field371++;
				method187(arg0, arg1, arg2);
			} else {
				field206 = "No response from loginserver";
				field207 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field206 = "";
			field207 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method188() {
		Graphics var1 = method57().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method50(1);

		if (field243) {
			field479 = false;
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

		if (field512) {
			field479 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field517) {
			field479 = false;
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

	@ObfuscatedName("client.P(I)V")
	public final void method189() {
		if (field280 == 0 && field88 == 1) {
			int var1 = field89 - 25 - 550;
			int var2 = field90 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field467 + field427 & 0x7FF;
				int var4 = AZWEEYMC.field50[var3];
				int var5 = AZWEEYMC.field51[var3];
				var4 = (field489 + 256) * var4 >> 8;
				var5 = (field489 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field396.field1019 + var6 >> 7;
				int var9 = field396.field1020 - var7 >> 7;
				boolean var10 = method171(var8, 0, 0, 1, field396.field1007[0], 0, true, 0, field396.field1008[0], 0, var9);
				if (var10) {
					field147.method296(var1);
					field147.method296(var2);
					field147.method297(field427);
					field147.method296(57);
					field147.method296(field467);
					field147.method296(field489);
					field147.method296(89);
					field147.method297(field396.field1019);
					field147.method297(field396.field1020);
					field147.method296(field160);
					field147.method296(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.r(B)I")
	public final int method190() {
		int var1 = 3;
		if (field494 < 310) {
			int var2 = field491 >> 7;
			int var3 = field493 >> 7;
			int var4 = field396.field1019 >> 7;
			int var5 = field396.field1020 >> 7;

			if ((field172[field122][var2][var3] & 0x4) != 0) {
				var1 = field122;
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

					if ((field172[field122][var2][var3] & 0x4) != 0) {
						var1 = field122;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field172[field122][var2][var3] & 0x4) != 0) {
							var1 = field122;
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

					if ((field172[field122][var2][var3] & 0x4) != 0) {
						var1 = field122;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field172[field122][var2][var3] & 0x4) != 0) {
							var1 = field122;
						}
					}
				}
			}
		}

		if ((field172[field122][field396.field1019 >> 7][field396.field1020 >> 7] & 0x4) != 0) {
			var1 = field122;
		}

		return var1;
	}

	@ObfuscatedName("client.Q(I)I")
	public final int method191() {
		int var1 = method173(field493, field491, field122);
		if (var1 - field492 < 800 && (field172[field122][field491 >> 7][field493 >> 7] & 0x4) != 0) {
			return field122;
		}

		return 3;
	}

	@ObfuscatedName("client.b(ILJHKSAGUC;I)V")
	public final void method192(int arg0, JHKSAGUC arg1) {
		int var3 = arg1.method317(8);
		if (var3 < field214) {
			for (int var4 = var3; var4 < field214; var4++) {
				field120[field119++] = field215[var4];
			}
		}

		if (var3 > field214) {
			signlink.reporterror(field291 + " Too many players");
			throw new RuntimeException("eek");
		}

		field214 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field215[var5];
			FVFJZZXQ var7 = field213[var6];
			int var8 = arg1.method317(1);
			if (var8 == 0) {
				field215[field214++] = var6;
				var7.field1022 = field236;
			} else {
				int var9 = arg1.method317(2);
				if (var9 == 0) {
					field215[field214++] = var6;
					var7.field1022 = field236;
					field217[field216++] = var6;
				} else if (var9 == 1) {
					field215[field214++] = var6;
					var7.field1022 = field236;
					int var10 = arg1.method317(3);
					var7.method439(var10, false);
					int var11 = arg1.method317(1);
					if (var11 == 1) {
						field217[field216++] = var6;
					}
				} else if (var9 == 2) {
					field215[field214++] = var6;
					var7.field1022 = field236;
					int var12 = arg1.method317(3);
					var7.method439(var12, true);
					int var13 = arg1.method317(3);
					var7.method439(var13, true);
					int var14 = arg1.method317(1);
					if (var14 == 1) {
						field217[field216++] = var6;
					}
				} else if (var9 == 3) {
					field120[field119++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.d(III)Z")
	public final boolean method193(int arg0, int arg1) {
		boolean var3 = false;
		TNOPEJNZ var4 = TNOPEJNZ.field1272[arg0];
		for (int var5 = 0; var5 < var4.field1321.length && var4.field1321[var5] != -1; var5++) {
			TNOPEJNZ var6 = TNOPEJNZ.field1272[var4.field1321[var5]];
			if (var6.field1304 == 1) {
				var3 |= method193(var6.field1281, arg1);
			}

			if (var6.field1304 == 6 && (var6.field1287 != -1 || var6.field1288 != -1)) {
				boolean var7 = method134(var6);
				int var8;
				if (var7) {
					var8 = var6.field1288;
				} else {
					var8 = var6.field1287;
				}

				if (var8 != -1) {
					LCRVYGCP var9 = LCRVYGCP.field795[var8];
					var6.field1305 += arg1;
					while (var6.field1305 > var9.method361(var6.field1290)) {
						var6.field1305 -= var9.method361(var6.field1290) + 1;
						var6.field1290++;
						if (var6.field1290 >= var9.field796) {
							var6.field1290 -= var9.field800;
							if (var6.field1290 < 0 || var6.field1290 >= var9.field796) {
								var6.field1290 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method194() {
		for (int var1 = -1; var1 < field214; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field212;
			} else {
				var2 = field215[var1];
			}

			FVFJZZXQ var3 = field213[var2];
			if (var3 != null && var3.field1023 > 0) {
				var3.field1023--;
				if (var3.field1023 == 0) {
					var3.field996 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field384; var4++) {
			int var5 = field385[var4];
			NLPNWUNL var6 = field383[var5];
			if (var6 != null && var6.field1023 > 0) {
				var6.field1023--;
				if (var6.field1023 == 0) {
					var6.field996 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLJHKSAGUC;I)V")
	public final void method195(JHKSAGUC arg0, int arg1) {
		for (int var3 = 0; var3 < field216; var3++) {
			int var4 = field217[var3];
			NLPNWUNL var5 = field383[var4];
			int var6 = arg0.method306();
			if ((var6 & 0x40) != 0) {
				int var7 = arg0.method306();
				int var8 = arg0.method306();
				var5.method442(var7, var8, field236);
				var5.field1029 = field236 + 300;
				var5.field1030 = arg0.method325();
				var5.field1031 = arg0.method327();
			}

			if ((var6 & 0x8) != 0) {
				int var9 = arg0.method336();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				int var10 = arg0.method325();
				if (var5.field1035 == var9 && var9 != -1) {
					int var11 = LCRVYGCP.field795[var9].field809;
					if (var11 == 1) {
						var5.field1036 = 0;
						var5.field1037 = 0;
						var5.field1038 = var10;
						var5.field1039 = 0;
					}

					if (var11 == 2) {
						var5.field1039 = 0;
					}
				} else if (var9 == -1 || var5.field1035 == -1 || LCRVYGCP.field795[var9].field803 >= LCRVYGCP.field795[var5.field1035].field803) {
					var5.field1035 = var9;
					var5.field1036 = 0;
					var5.field1037 = 0;
					var5.field1038 = var10;
					var5.field1039 = 0;
					var5.field1016 = var5.field1005;
				}
			}

			if ((var6 & 0x10) != 0) {
				int var12 = arg0.method327();
				int var13 = arg0.method325();
				var5.method442(var12, var13, field236);
				var5.field1029 = field236 + 300;
				var5.field1030 = arg0.method325();
				var5.field1031 = arg0.method306();
			}

			if ((var6 & 0x1) != 0) {
				var5.field908 = RBTWCHLG.method449(arg0.method308());
				var5.field1006 = var5.field908.field1053;
				var5.field1045 = var5.field908.field1071;
				var5.field1041 = var5.field908.field1084;
				var5.field1042 = var5.field908.field1079;
				var5.field1043 = var5.field908.field1074;
				var5.field1044 = var5.field908.field1061;
				var5.field1009 = var5.field908.field1081;
			}

			if ((var6 & 0x20) != 0) {
				var5.field991 = arg0.method308();
				int var14 = arg0.method341();
				var5.field995 = var14 >> 16;
				var5.field994 = (var14 & 0xFFFF) + field236;
				var5.field992 = 0;
				var5.field993 = 0;

				if (var5.field994 > field236) {
					var5.field992 = -1;
				}

				if (var5.field991 == 0xFFFF) {
					var5.field991 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				var5.field1011 = arg0.method334();
				var5.field1012 = arg0.method335();
			}

			if ((var6 & 0x2) != 0) {
				var5.field996 = arg0.method313();
				var5.field1023 = 100;
			}

			if ((var6 & 0x80) != 0) {
				var5.field1027 = arg0.method335();
				if (var5.field1027 == 0xFFFF) {
					var5.field1027 = -1;
				}
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field296[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field500[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
