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
public final class client extends VTYHSWDE {

	@ObfuscatedName("client.Q")
	public volatile boolean field64 = false;

	@ObfuscatedName("client.S")
	public String field66 = "";

	@ObfuscatedName("client.kb")
	public volatile boolean field84 = false;

	@ObfuscatedName("client.ub")
	public boolean field94 = true;

	@ObfuscatedName("client.vb")
	public String field95 = "";

	@ObfuscatedName("client.yb")
	public OMAKLDKI[] field97 = new OMAKLDKI[8];

	@ObfuscatedName("client.Bb")
	public String field99 = "";

	@ObfuscatedName("client.Db")
	public String[] field101 = new String[100];

	@ObfuscatedName("client.Eb")
	public int[] field102 = new int[100];

	@ObfuscatedName("client.Gb")
	public boolean field104 = false;

	@ObfuscatedName("client.Hb")
	public int[] field105 = new int[200];

	@ObfuscatedName("client.Ib")
	public CRC32 field106 = new CRC32();

	@ObfuscatedName("client.Pb")
	public int field112 = 50;

	@ObfuscatedName("client.Qb")
	public int[] field113 = new int[field112];

	@ObfuscatedName("client.Rb")
	public int[] field114 = new int[field112];

	@ObfuscatedName("client.Sb")
	public int[] field115 = new int[field112];

	@ObfuscatedName("client.Tb")
	public int[] field116 = new int[field112];

	@ObfuscatedName("client.Ub")
	public int[] field117 = new int[field112];

	@ObfuscatedName("client.Vb")
	public int[] field118 = new int[field112];

	@ObfuscatedName("client.Wb")
	public int[] field119 = new int[field112];

	@ObfuscatedName("client.Xb")
	public String[] field120 = new String[field112];

	@ObfuscatedName("client.Yb")
	public int[] field121 = new int[151];

	@ObfuscatedName("client.gc")
	public OMAKLDKI[] field129 = new OMAKLDKI[32];

	@ObfuscatedName("client.mc")
	public ETMNPRAF field135 = new ETMNPRAF();

	@ObfuscatedName("client.pc")
	public int field138 = 1;

	@ObfuscatedName("client.qc")
	public ETMNPRAF field139 = new ETMNPRAF();

	@ObfuscatedName("client.sc")
	public int field141 = 1;

	@ObfuscatedName("client.vc")
	public boolean field143 = true;

	@ObfuscatedName("client.yc")
	public boolean field146 = true;

	@ObfuscatedName("client.Ac")
	public int field147 = -1;

	@ObfuscatedName("client.Bc")
	public ETMNPRAF[][][] field148 = new ETMNPRAF[4][104][104];

	@ObfuscatedName("client.Ec")
	public int[] field151 = new int[5];

	@ObfuscatedName("client.Mc")
	public boolean field159 = false;

	@ObfuscatedName("client.Nc")
	public int[] field160 = new int[VPKKBTBT.field1362];

	@ObfuscatedName("client.Oc")
	public SVWJKJVI field161 = SVWJKJVI.method449(1);

	@ObfuscatedName("client.Zc")
	public boolean field170 = false;

	@ObfuscatedName("client.cd")
	public boolean field172 = false;

	@ObfuscatedName("client.ed")
	public SVWJKJVI field174 = new SVWJKJVI(new byte[5000]);

	@ObfuscatedName("client.fd")
	public PEHNWFXK[] field175 = new PEHNWFXK[16384];

	@ObfuscatedName("client.hd")
	public int[] field177 = new int[16384];

	@ObfuscatedName("client.id")
	public int[] field178 = new int[2000];

	@ObfuscatedName("client.jd")
	public long[] field179 = new long[100];

	@ObfuscatedName("client.md")
	public String field182 = "";

	@ObfuscatedName("client.pd")
	public int[] field185 = new int[VPKKBTBT.field1362];

	@ObfuscatedName("client.sd")
	public int[] field187 = new int[5];

	@ObfuscatedName("client.td")
	public int field188 = 78;

	@ObfuscatedName("client.xd")
	public int[] field192 = new int[33];

	@ObfuscatedName("client.yd")
	public boolean field193 = false;

	@ObfuscatedName("client.Bd")
	public int field196 = -1;

	@ObfuscatedName("client.Fd")
	public int field200 = 2;

	@ObfuscatedName("client.Gd")
	public String field201 = "";

	@ObfuscatedName("client.Hd")
	public int[] field202 = new int[100];

	@ObfuscatedName("client.Id")
	public String[] field203 = new String[100];

	@ObfuscatedName("client.Jd")
	public String[] field204 = new String[100];

	@ObfuscatedName("client.Ld")
	public OMAKLDKI[] field206 = new OMAKLDKI[1000];

	@ObfuscatedName("client.Vd")
	public boolean field216 = true;

	@ObfuscatedName("client.ge")
	public int field225 = -1;

	@ObfuscatedName("client.ie")
	public boolean field227 = false;

	@ObfuscatedName("client.je")
	public String field228 = "";

	@ObfuscatedName("client.ke")
	public String field229 = "";

	@ObfuscatedName("client.te")
	public int[] field237 = new int[33];

	@ObfuscatedName("client.ve")
	public int[] field239 = new int[500];

	@ObfuscatedName("client.we")
	public int[] field240 = new int[500];

	@ObfuscatedName("client.xe")
	public int[] field241 = new int[500];

	@ObfuscatedName("client.ye")
	public int[] field242 = new int[500];

	@ObfuscatedName("client.Be")
	public int field245 = -1;

	@ObfuscatedName("client.Fe")
	public int field247 = 2;

	@ObfuscatedName("client.Le")
	public int field252 = 2;

	@ObfuscatedName("client.Me")
	public int[][] field253 = new int[104][104];

	@ObfuscatedName("client.Ne")
	public ZXDQRRNS[] field254 = new ZXDQRRNS[2];

	@ObfuscatedName("client.Oe")
	public int[] field255 = new int[7];

	@ObfuscatedName("client.Pe")
	public int[] field256 = new int[50];

	@ObfuscatedName("client.Qe")
	public int field257 = 128;

	@ObfuscatedName("client.We")
	public int[] field263 = new int[5];

	@ObfuscatedName("client.Xe")
	public int field264 = -1;

	@ObfuscatedName("client.af")
	public int[][] field266 = new int[104][104];

	@ObfuscatedName("client.bf")
	public boolean field267 = false;

	@ObfuscatedName("client.ff")
	public boolean field271 = false;

	@ObfuscatedName("client.jf")
	public int[] field274 = new int[1000];

	@ObfuscatedName("client.lf")
	public int[] field276 = new int[5];

	@ObfuscatedName("client.qf")
	public OMAKLDKI[] field281 = new OMAKLDKI[20];

	@ObfuscatedName("client.vf")
	public int field286 = 0x766654;

	@ObfuscatedName("client.wf")
	public NHFASBOX field287 = new NHFASBOX();

	@ObfuscatedName("client.Jf")
	public boolean field299 = false;

	@ObfuscatedName("client.Kf")
	public XFNDANMT[] field300 = new XFNDANMT[5];

	@ObfuscatedName("client.Lf")
	public int field301 = -1;

	@ObfuscatedName("client.Rf")
	public int[] field306 = new int[4000];

	@ObfuscatedName("client.Sf")
	public int[] field307 = new int[4000];

	@ObfuscatedName("client.fg")
	public byte[] field318 = new byte[16384];

	@ObfuscatedName("client.gg")
	public int[] field319 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.ig")
	public int[] field320 = new int[50];

	@ObfuscatedName("client.jg")
	public boolean field321 = false;

	@ObfuscatedName("client.lg")
	public boolean field323 = false;

	@ObfuscatedName("client.mg")
	public int field324 = 0x4D4233;

	@ObfuscatedName("client.tg")
	public String[] field331 = new String[5];

	@ObfuscatedName("client.ug")
	public boolean[] field332 = new boolean[5];

	@ObfuscatedName("client.Bg")
	public int[] field339 = new int[5];

	@ObfuscatedName("client.Cg")
	public int field340 = -1;

	@ObfuscatedName("client.Dg")
	public OMAKLDKI[] field341 = new OMAKLDKI[100];

	@ObfuscatedName("client.Gg")
	public final int[] field343 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ig")
	public String field344 = "";

	@ObfuscatedName("client.Jg")
	public String field345 = "";

	@ObfuscatedName("client.Lg")
	public boolean field347 = false;

	@ObfuscatedName("client.Tg")
	public ZXDQRRNS[] field354 = new ZXDQRRNS[100];

	@ObfuscatedName("client.Wg")
	public ZXDQRRNS[] field357 = new ZXDQRRNS[13];

	@ObfuscatedName("client.Xg")
	public int field358 = -1;

	@ObfuscatedName("client.Zg")
	public SVWJKJVI field360 = SVWJKJVI.method449(1);

	@ObfuscatedName("client.dh")
	public boolean field364 = false;

	@ObfuscatedName("client.eh")
	public int field365 = -1;

	@ObfuscatedName("client.fh")
	public int field366 = -1;

	@ObfuscatedName("client.gh")
	public int[] field367 = new int[2000];

	@ObfuscatedName("client.hh")
	public boolean field368 = false;

	@ObfuscatedName("client.jh")
	public boolean field370 = false;

	@ObfuscatedName("client.mh")
	public OXMJPDWD[] field373 = new OXMJPDWD[4];

	@ObfuscatedName("client.nh")
	public int[] field374 = new int[9];

	@ObfuscatedName("client.oh")
	public int[] field375 = new int[50];

	@ObfuscatedName("client.rh")
	public boolean field378 = false;

	@ObfuscatedName("client.yh")
	public boolean field384 = false;

	@ObfuscatedName("client.zh")
	public boolean[] field385 = new boolean[5];

	@ObfuscatedName("client.Ah")
	public OMAKLDKI[] field386 = new OMAKLDKI[32];

	@ObfuscatedName("client.Gh")
	public SVWJKJVI field390 = SVWJKJVI.method449(1);

	@ObfuscatedName("client.Kh")
	public int field393 = -1;

	@ObfuscatedName("client.Nh")
	public boolean field396 = true;

	@ObfuscatedName("client.Ph")
	public int field397 = -1;

	@ObfuscatedName("client.Qh")
	public int field398 = -1;

	@ObfuscatedName("client.Sh")
	public int[][] field400 = new int[104][104];

	@ObfuscatedName("client.Th")
	public String[] field401 = new String[500];

	@ObfuscatedName("client.Wh")
	public int field403 = -1;

	@ObfuscatedName("client.Xh")
	public boolean field404 = false;

	@ObfuscatedName("client.Yh")
	public int[][][] field405 = new int[4][13][13];

	@ObfuscatedName("client.Zh")
	public int field406 = 0x23201B;

	@ObfuscatedName("client.ni")
	public volatile boolean field420 = false;

	@ObfuscatedName("client.pi")
	public int[] field422 = new int[1000];

	@ObfuscatedName("client.qi")
	public int[] field423 = new int[1000];

	@ObfuscatedName("client.ti")
	public String field424 = "";

	@ObfuscatedName("client.xi")
	public int field427 = 0x332D25;

	@ObfuscatedName("client.yi")
	public boolean field428 = false;

	@ObfuscatedName("client.zi")
	public int field429 = 2048;

	@ObfuscatedName("client.Ai")
	public int field430 = 2047;

	@ObfuscatedName("client.Bi")
	public KVXZMJHR[] field431 = new KVXZMJHR[field429];

	@ObfuscatedName("client.Di")
	public int[] field433 = new int[field429];

	@ObfuscatedName("client.Fi")
	public int[] field435 = new int[field429];

	@ObfuscatedName("client.Gi")
	public SVWJKJVI[] field436 = new SVWJKJVI[field429];

	@ObfuscatedName("client.Ji")
	public int field438 = -1;

	@ObfuscatedName("client.Oi")
	public long[] field443 = new long[200];

	@ObfuscatedName("client.Pi")
	public String[] field444 = new String[200];

	@ObfuscatedName("client.Vi")
	public int[] field449 = new int[VPKKBTBT.field1362];

	@ObfuscatedName("client.Wi")
	public int[] field450 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Xi")
	public int[] field451 = new int[256];

	@ObfuscatedName("client.Yi")
	public boolean field452 = false;

	@ObfuscatedName("client.Zi")
	public boolean field453 = false;

	@ObfuscatedName("client.yj")
	public int[] field476 = new int[151];

	@ObfuscatedName("client.Cj")
	public boolean field478 = false;

	@ObfuscatedName("client.Dj")
	public ETMNPRAF field479 = new ETMNPRAF();

	@ObfuscatedName("client.Ij")
	public int field484 = -1;

	@ObfuscatedName("client.Jj")
	public int[] field485 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Kj")
	public int field486 = 3;

	@ObfuscatedName("client.Sj")
	public OMAKLDKI[] field493 = new OMAKLDKI[32];

	@ObfuscatedName("client.Xj")
	public final int field497 = 100;

	@ObfuscatedName("client.Yj")
	public int[] field498 = new int[100];

	@ObfuscatedName("client.lc")
	public static BigInteger field134 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Kc")
	public static String field157 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.wd")
	public static int[] field191 = new int[32];

	@ObfuscatedName("client.rf")
	public static final int[][] field282 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.th")
	public static final int[] field380 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.fi")
	public static BigInteger field412 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ui")
	public static int[] field448 = new int[99];

	@ObfuscatedName("client.cj")
	public static int field455 = 10;

	@ObfuscatedName("client.ej")
	public static boolean field457 = true;

	@ObfuscatedName("client.Cb")
	public int field100;

	@ObfuscatedName("client.Fb")
	public int field103;

	@ObfuscatedName("client.Ob")
	public int field111;

	@ObfuscatedName("client.Zb")
	public int field122;

	@ObfuscatedName("client.ac")
	public int field123;

	@ObfuscatedName("client.bc")
	public int field124;

	@ObfuscatedName("client.cc")
	public int field125;

	@ObfuscatedName("client.dc")
	public int field126;

	@ObfuscatedName("client.ec")
	public int field127;

	@ObfuscatedName("client.fc")
	public int field128;

	@ObfuscatedName("client.hc")
	public int field130;

	@ObfuscatedName("client.nc")
	public static int field136;

	@ObfuscatedName("client.oc")
	public int field137;

	@ObfuscatedName("client.rc")
	public int field140;

	@ObfuscatedName("client.tc")
	public int field142;

	@ObfuscatedName("client.wc")
	public int field144;

	@ObfuscatedName("client.xc")
	public int field145;

	@ObfuscatedName("client.Cc")
	public static int field149;

	@ObfuscatedName("client.Dc")
	public static int field150;

	@ObfuscatedName("client.Fc")
	public int field152;

	@ObfuscatedName("client.Gc")
	public int field153;

	@ObfuscatedName("client.Hc")
	public int field154;

	@ObfuscatedName("client.Ic")
	public int field155;

	@ObfuscatedName("client.Jc")
	public int field156;

	@ObfuscatedName("client.Lc")
	public int field158;

	@ObfuscatedName("client.Pc")
	public int field162;

	@ObfuscatedName("client.Rc")
	public int field163;

	@ObfuscatedName("client.gd")
	public int field176;

	@ObfuscatedName("client.nd")
	public int field183;

	@ObfuscatedName("client.od")
	public int field184;

	@ObfuscatedName("client.ud")
	public int field189;

	@ObfuscatedName("client.vd")
	public int field190;

	@ObfuscatedName("client.zd")
	public int field194;

	@ObfuscatedName("client.Ad")
	public int field195;

	@ObfuscatedName("client.Ed")
	public int field199;

	@ObfuscatedName("client.Kd")
	public int field205;

	@ObfuscatedName("client.Wd")
	public int field217;

	@ObfuscatedName("client.Xd")
	public int field218;

	@ObfuscatedName("client.Yd")
	public int field219;

	@ObfuscatedName("client.be")
	public int field220;

	@ObfuscatedName("client.ce")
	public int field221;

	@ObfuscatedName("client.de")
	public int field222;

	@ObfuscatedName("client.ee")
	public int field223;

	@ObfuscatedName("client.fe")
	public int field224;

	@ObfuscatedName("client.he")
	public int field226;

	@ObfuscatedName("client.me")
	public int field231;

	@ObfuscatedName("client.oe")
	public int field232;

	@ObfuscatedName("client.pe")
	public int field233;

	@ObfuscatedName("client.qe")
	public int field234;

	@ObfuscatedName("client.Ae")
	public int field244;

	@ObfuscatedName("client.Ee")
	public int field246;

	@ObfuscatedName("client.Ge")
	public static int field248;

	@ObfuscatedName("client.He")
	public static int field249;

	@ObfuscatedName("client.Ke")
	public int field251;

	@ObfuscatedName("client.Re")
	public int field258;

	@ObfuscatedName("client.Se")
	public int field259;

	@ObfuscatedName("client.Te")
	public int field260;

	@ObfuscatedName("client.Ue")
	public int field261;

	@ObfuscatedName("client.Ve")
	public int field262;

	@ObfuscatedName("client.Ye")
	public int field265;

	@ObfuscatedName("client.cf")
	public int field268;

	@ObfuscatedName("client.df")
	public int field269;

	@ObfuscatedName("client.ef")
	public int field270;

	@ObfuscatedName("client.gf")
	public int field272;

	@ObfuscatedName("client.hf")
	public int field273;

	@ObfuscatedName("client.kf")
	public int field275;

	@ObfuscatedName("client.nf")
	public int field278;

	@ObfuscatedName("client.of")
	public int field279;

	@ObfuscatedName("client.pf")
	public int field280;

	@ObfuscatedName("client.xf")
	public int field288;

	@ObfuscatedName("client.yf")
	public int field289;

	@ObfuscatedName("client.zf")
	public int field290;

	@ObfuscatedName("client.Af")
	public int field291;

	@ObfuscatedName("client.Bf")
	public int field292;

	@ObfuscatedName("client.Cf")
	public int field293;

	@ObfuscatedName("client.Df")
	public int field294;

	@ObfuscatedName("client.Ef")
	public int field295;

	@ObfuscatedName("client.Gf")
	public int field297;

	@ObfuscatedName("client.Mf")
	public int field302;

	@ObfuscatedName("client.Pf")
	public int field305;

	@ObfuscatedName("client.Yf")
	public int field312;

	@ObfuscatedName("client.Zf")
	public int field313;

	@ObfuscatedName("client.ag")
	public int field314;

	@ObfuscatedName("client.bg")
	public int field315;

	@ObfuscatedName("client.cg")
	public static int field316;

	@ObfuscatedName("client.eg")
	public static int field317;

	@ObfuscatedName("client.kg")
	public int field322;

	@ObfuscatedName("client.sg")
	public static int field330;

	@ObfuscatedName("client.vg")
	public static int field333;

	@ObfuscatedName("client.wg")
	public int field334;

	@ObfuscatedName("client.xg")
	public int field335;

	@ObfuscatedName("client.yg")
	public int field336;

	@ObfuscatedName("client.zg")
	public int field337;

	@ObfuscatedName("client.Ag")
	public int field338;

	@ObfuscatedName("client.Eg")
	public int field342;

	@ObfuscatedName("client.Kg")
	public int field346;

	@ObfuscatedName("client.Mg")
	public int field348;

	@ObfuscatedName("client.Og")
	public int field349;

	@ObfuscatedName("client.Pg")
	public int field350;

	@ObfuscatedName("client.Qg")
	public int field351;

	@ObfuscatedName("client.Rg")
	public int field352;

	@ObfuscatedName("client.Sg")
	public int field353;

	@ObfuscatedName("client.Ug")
	public int field355;

	@ObfuscatedName("client.Vg")
	public int field356;

	@ObfuscatedName("client.Yg")
	public int field359;

	@ObfuscatedName("client.ah")
	public int field361;

	@ObfuscatedName("client.ch")
	public int field363;

	@ObfuscatedName("client.ih")
	public int field369;

	@ObfuscatedName("client.kh")
	public int field371;

	@ObfuscatedName("client.lh")
	public int field372;

	@ObfuscatedName("client.sh")
	public int field379;

	@ObfuscatedName("client.vh")
	public int field381;

	@ObfuscatedName("client.wh")
	public static int field382;

	@ObfuscatedName("client.xh")
	public int field383;

	@ObfuscatedName("client.Dh")
	public int field387;

	@ObfuscatedName("client.Eh")
	public int field388;

	@ObfuscatedName("client.Ih")
	public static int field391;

	@ObfuscatedName("client.Jh")
	public int field392;

	@ObfuscatedName("client.Lh")
	public int field394;

	@ObfuscatedName("client.Mh")
	public int field395;

	@ObfuscatedName("client.Rh")
	public int field399;

	@ObfuscatedName("client.ei")
	public int field411;

	@ObfuscatedName("client.gi")
	public int field413;

	@ObfuscatedName("client.hi")
	public int field414;

	@ObfuscatedName("client.ii")
	public int field415;

	@ObfuscatedName("client.ji")
	public int field416;

	@ObfuscatedName("client.ki")
	public int field417;

	@ObfuscatedName("client.mi")
	public int field419;

	@ObfuscatedName("client.oi")
	public int field421;

	@ObfuscatedName("client.ui")
	public int field425;

	@ObfuscatedName("client.vi")
	public static int field426;

	@ObfuscatedName("client.Ci")
	public int field432;

	@ObfuscatedName("client.Ei")
	public int field434;

	@ObfuscatedName("client.Ki")
	public int field439;

	@ObfuscatedName("client.Si")
	public int field446;

	@ObfuscatedName("client.aj")
	public static int field454;

	@ObfuscatedName("client.dj")
	public static int field456;

	@ObfuscatedName("client.lj")
	public static int field463;

	@ObfuscatedName("client.mj")
	public int field464;

	@ObfuscatedName("client.nj")
	public int field465;

	@ObfuscatedName("client.oj")
	public int field466;

	@ObfuscatedName("client.pj")
	public int field467;

	@ObfuscatedName("client.qj")
	public int field468;

	@ObfuscatedName("client.sj")
	public int field470;

	@ObfuscatedName("client.zj")
	public int field477;

	@ObfuscatedName("client.Fj")
	public int field481;

	@ObfuscatedName("client.Uj")
	public int field494;

	@ObfuscatedName("client.Vj")
	public int field495;

	@ObfuscatedName("client.Wj")
	public int field496;

	@ObfuscatedName("client.J")
	public int field57;

	@ObfuscatedName("client.R")
	public int field65;

	@ObfuscatedName("client.db")
	public int field77;

	@ObfuscatedName("client.eb")
	public int field78;

	@ObfuscatedName("client.fb")
	public int field79;

	@ObfuscatedName("client.gb")
	public int field80;

	@ObfuscatedName("client.hb")
	public int field81;

	@ObfuscatedName("client.ib")
	public int field82;

	@ObfuscatedName("client.jb")
	public int field83;

	@ObfuscatedName("client.lb")
	public int field85;

	@ObfuscatedName("client.mb")
	public int field86;

	@ObfuscatedName("client.nb")
	public int field87;

	@ObfuscatedName("client.ob")
	public int field88;

	@ObfuscatedName("client.pb")
	public static int field89;

	@ObfuscatedName("client.qb")
	public int field90;

	@ObfuscatedName("client.rb")
	public int field91;

	@ObfuscatedName("client.tb")
	public int field93;

	@ObfuscatedName("client.xb")
	public int field96;

	@ObfuscatedName("client.Ab")
	public int field98;

	@ObfuscatedName("client.dd")
	public long field173;

	@ObfuscatedName("client.se")
	public long field236;

	@ObfuscatedName("client.ph")
	public long field376;

	@ObfuscatedName("client.Ti")
	public long field447;

	@ObfuscatedName("client.sb")
	public long field92;

	@ObfuscatedName("client.T")
	public GXHGUSOD field67;

	@ObfuscatedName("client.Ej")
	public IHBKBLZU field480;

	@ObfuscatedName("client.Nb")
	public JAGFVRIK field110;

	@ObfuscatedName("client.Md")
	public KJGJRATW field207;

	@ObfuscatedName("client.Nd")
	public KJGJRATW field208;

	@ObfuscatedName("client.Od")
	public KJGJRATW field209;

	@ObfuscatedName("client.Pd")
	public KJGJRATW field210;

	@ObfuscatedName("client.Qd")
	public KJGJRATW field211;

	@ObfuscatedName("client.Rd")
	public KJGJRATW field212;

	@ObfuscatedName("client.Sd")
	public KJGJRATW field213;

	@ObfuscatedName("client.Td")
	public KJGJRATW field214;

	@ObfuscatedName("client.Ud")
	public KJGJRATW field215;

	@ObfuscatedName("client.Li")
	public KJGJRATW field440;

	@ObfuscatedName("client.Mi")
	public KJGJRATW field441;

	@ObfuscatedName("client.Ni")
	public KJGJRATW field442;

	@ObfuscatedName("client.Oj")
	public KJGJRATW field489;

	@ObfuscatedName("client.Pj")
	public KJGJRATW field490;

	@ObfuscatedName("client.Qj")
	public KJGJRATW field491;

	@ObfuscatedName("client.Rj")
	public KJGJRATW field492;

	@ObfuscatedName("client.U")
	public KJGJRATW field68;

	@ObfuscatedName("client.V")
	public KJGJRATW field69;

	@ObfuscatedName("client.W")
	public KJGJRATW field70;

	@ObfuscatedName("client.X")
	public KJGJRATW field71;

	@ObfuscatedName("client.Y")
	public KJGJRATW field72;

	@ObfuscatedName("client.Z")
	public KJGJRATW field73;

	@ObfuscatedName("client.ab")
	public KJGJRATW field74;

	@ObfuscatedName("client.bb")
	public KJGJRATW field75;

	@ObfuscatedName("client.cb")
	public KJGJRATW field76;

	@ObfuscatedName("client.kc")
	public static KVXZMJHR field133;

	@ObfuscatedName("client.ic")
	public OMAKLDKI field131;

	@ObfuscatedName("client.jc")
	public OMAKLDKI field132;

	@ObfuscatedName("client.bd")
	public OMAKLDKI field171;

	@ObfuscatedName("client.Cd")
	public OMAKLDKI field197;

	@ObfuscatedName("client.Dd")
	public OMAKLDKI field198;

	@ObfuscatedName("client.Tf")
	public OMAKLDKI field308;

	@ObfuscatedName("client.Fh")
	public OMAKLDKI field389;

	@ObfuscatedName("client.Qi")
	public OMAKLDKI field445;

	@ObfuscatedName("client.tj")
	public OMAKLDKI field471;

	@ObfuscatedName("client.uj")
	public OMAKLDKI field472;

	@ObfuscatedName("client.vj")
	public OMAKLDKI field473;

	@ObfuscatedName("client.wj")
	public OMAKLDKI field474;

	@ObfuscatedName("client.xj")
	public OMAKLDKI field475;

	@ObfuscatedName("client.Gj")
	public OMAKLDKI field482;

	@ObfuscatedName("client.Hj")
	public OMAKLDKI field483;

	@ObfuscatedName("client.gj")
	public ONSICLVF field459;

	@ObfuscatedName("client.hj")
	public ONSICLVF field460;

	@ObfuscatedName("client.ij")
	public ONSICLVF field461;

	@ObfuscatedName("client.jj")
	public ONSICLVF field462;

	@ObfuscatedName("client.Ii")
	public OPLZBITI field437;

	@ObfuscatedName("client.P")
	public PTISUREQ field63;

	@ObfuscatedName("client.Hf")
	public WEMOPWVJ field298;

	@ObfuscatedName("client.Kb")
	public ZXDQRRNS field107;

	@ObfuscatedName("client.Lb")
	public ZXDQRRNS field108;

	@ObfuscatedName("client.Mb")
	public ZXDQRRNS field109;

	@ObfuscatedName("client.Nf")
	public ZXDQRRNS field303;

	@ObfuscatedName("client.Of")
	public ZXDQRRNS field304;

	@ObfuscatedName("client.Vf")
	public ZXDQRRNS field309;

	@ObfuscatedName("client.Wf")
	public ZXDQRRNS field310;

	@ObfuscatedName("client.Xf")
	public ZXDQRRNS field311;

	@ObfuscatedName("client.ng")
	public ZXDQRRNS field325;

	@ObfuscatedName("client.og")
	public ZXDQRRNS field326;

	@ObfuscatedName("client.pg")
	public ZXDQRRNS field327;

	@ObfuscatedName("client.qg")
	public ZXDQRRNS field328;

	@ObfuscatedName("client.rg")
	public ZXDQRRNS field329;

	@ObfuscatedName("client.Mj")
	public ZXDQRRNS field487;

	@ObfuscatedName("client.Nj")
	public ZXDQRRNS field488;

	@ObfuscatedName("client.K")
	public ZXDQRRNS field58;

	@ObfuscatedName("client.L")
	public ZXDQRRNS field59;

	@ObfuscatedName("client.M")
	public ZXDQRRNS field60;

	@ObfuscatedName("client.N")
	public ZXDQRRNS field61;

	@ObfuscatedName("client.O")
	public ZXDQRRNS field62;

	@ObfuscatedName("client.re")
	public String field235;

	@ObfuscatedName("client.Je")
	public String field250;

	@ObfuscatedName("client.mf")
	public String field277;

	@ObfuscatedName("client.rj")
	public String field469;

	@ObfuscatedName("client.ze")
	public Socket field243;

	@ObfuscatedName("client.qd")
	public static boolean field186;

	@ObfuscatedName("client.bh")
	public static boolean field362;

	@ObfuscatedName("client.Uh")
	public static boolean field402;

	@ObfuscatedName("client.fj")
	public static boolean field458;

	@ObfuscatedName("client.Sc")
	public int[] field164;

	@ObfuscatedName("client.Tc")
	public int[] field165;

	@ObfuscatedName("client.Uc")
	public int[] field166;

	@ObfuscatedName("client.Vc")
	public int[] field167;

	@ObfuscatedName("client.Wc")
	public int[] field168;

	@ObfuscatedName("client.Xc")
	public int[] field169;

	@ObfuscatedName("client.kd")
	public int[] field180;

	@ObfuscatedName("client.ld")
	public int[] field181;

	@ObfuscatedName("client.sf")
	public int[] field283;

	@ObfuscatedName("client.tf")
	public int[] field284;

	@ObfuscatedName("client.uf")
	public int[] field285;

	@ObfuscatedName("client.ai")
	public int[] field407;

	@ObfuscatedName("client.bi")
	public int[] field408;

	@ObfuscatedName("client.ci")
	public int[] field409;

	@ObfuscatedName("client.di")
	public int[] field410;

	@ObfuscatedName("client.Ff")
	public ZXDQRRNS[] field296;

	@ObfuscatedName("client.ue")
	public byte[][] field238;

	@ObfuscatedName("client.li")
	public byte[][] field418;

	@ObfuscatedName("client.le")
	public byte[][][] field230;

	@ObfuscatedName("client.qh")
	public int[][][] field377;

	@ObfuscatedName("client.a(IIIIZII)V")
	public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = IYSWJGDE.field782[var7];
			int var13 = IYSWJGDE.field783[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = IYSWJGDE.field782[var8];
			int var16 = IYSWJGDE.field783[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field220 = arg2 - var9;
		field221 = arg0 - var10;
		field222 = arg4 - var11;
		field223 = arg5;
		field224 = arg1;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method13() {
		int var1 = field461.method362("Choose Option");
		for (int var2 = 0; var2 < field399; var2++) {
			int var3 = field461.method362(field401[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field399 * 15 + 21;
		if (field1388 > 4 && field1389 > 4 && field1388 < 516 && field1389 < 338) {
			int var5 = field1388 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1389 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field452 = true;
			field152 = 0;
			field153 = var5;
			field154 = var6;
			field155 = var1;
			field156 = field399 * 15 + 22;
		}

		if (field1388 > 553 && field1389 > 205 && field1388 < 743 && field1389 < 466) {
			int var7 = field1388 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1389 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field452 = true;
			field152 = 1;
			field153 = var7;
			field154 = var8;
			field155 = var1;
			field156 = field399 * 15 + 22;
		}

		if (field1388 > 17 && field1389 > 357 && field1388 < 496 && field1389 < 453) {
			int var9 = field1388 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1389 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field452 = true;
			field152 = 2;
			field153 = var9;
			field154 = var10;
			field155 = var1;
			field156 = field399 * 15 + 22;
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.e(I)V")
	public final void method14() {
		if (field1387 == 1) {
			if (field1388 >= 6 && field1388 <= 106 && field1389 >= 467 && field1389 <= 499) {
				field57 = (field57 + 1) % 4;
				field378 = true;
				field428 = true;
				field360.method450(54);
				field360.method451(field57);
				field360.method451(field93);
				field360.method451(field158);
			}

			if (field1388 >= 135 && field1388 <= 235 && field1389 >= 467 && field1389 <= 499) {
				field93 = (field93 + 1) % 3;
				field378 = true;
				field428 = true;
				field360.method450(54);
				field360.method451(field57);
				field360.method451(field93);
				field360.method451(field158);
			}

			if (field1388 >= 273 && field1388 <= 373 && field1389 >= 467 && field1389 <= 499) {
				field158 = (field158 + 1) % 3;
				field378 = true;
				field428 = true;
				field360.method450(54);
				field360.method451(field57);
				field360.method451(field93);
				field360.method451(field158);
			}

			if (field1388 >= 412 && field1388 <= 512 && field1389 >= 467 && field1389 <= 499) {
				if (field301 == -1) {
					method146();
					field424 = "";
					field404 = false;
					field264 = field301 = NHFASBOX.field930;
					return;
				}

				method45("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method15(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method16(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field355; var2++) {
			if (arg0.equalsIgnoreCase(field444[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field133.field853)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(LSVWJKJVI;IB)V")
	public final void method17(SVWJKJVI arg0, int arg1) {
		arg0.method471();
		int var3 = arg0.method472(8);
		if (var3 < field176) {
			for (int var4 = var3; var4 < field176; var4++) {
				field274[field273++] = field177[var4];
			}
		}

		if (var3 > field176) {
			signlink.reporterror(field344 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field176 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field177[var5];
			PEHNWFXK var7 = field175[var6];
			int var8 = arg0.method472(1);
			if (var8 == 0) {
				field177[field176++] = var6;
				var7.field1000 = field316;
			} else {
				int var9 = arg0.method472(2);
				if (var9 == 0) {
					field177[field176++] = var6;
					var7.field1000 = field316;
					field435[field434++] = var6;
				} else if (var9 == 1) {
					field177[field176++] = var6;
					var7.field1000 = field316;
					int var10 = arg0.method472(3);
					var7.method343(var10, false);
					int var11 = arg0.method472(1);
					if (var11 == 1) {
						field435[field434++] = var6;
					}
				} else if (var9 == 2) {
					field177[field176++] = var6;
					var7.field1000 = field316;
					int var12 = arg0.method472(3);
					var7.method343(var12, true);
					int var13 = arg0.method472(3);
					var7.method343(var13, true);
					int var14 = arg0.method472(1);
					if (var14 == 1) {
						field435[field434++] = var6;
					}
				} else if (var9 == 3) {
					field274[field273++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method18(int arg0) {
		NHFASBOX var2 = NHFASBOX.method339(arg0);
		for (int var3 = 0; var3 < var2.field960.length && var2.field960[var3] != -1; var3++) {
			NHFASBOX var4 = NHFASBOX.method339(var2.field960[var3]);
			if (var4.field914 == 1) {
				method18(var4.field936);
			}

			var4.field950 = 0;
			var4.field959 = 0;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method19(String arg0) throws IOException {
		if (field170) {
			if (field243 != null) {
				try {
					field243.close();
				} catch (Exception var4) {
				}

				field243 = null;
			}

			field243 = method154(43595);
			field243.setSoTimeout(10000);
			InputStream var2 = field243.getInputStream();
			OutputStream var3 = field243.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(LNHFASBOX;B)Z")
	public final boolean method20(NHFASBOX arg0) {
		int var2 = arg0.field909;
		if (field356 == 2) {
			if (var2 == 201) {
				field428 = true;
				field379 = 0;
				field104 = true;
				field201 = "";
				field162 = 1;
				field95 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field428 = true;
				field379 = 0;
				field104 = true;
				field201 = "";
				field162 = 2;
				field95 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field338 = 250;
			return true;
		}

		if (var2 == 501) {
			field428 = true;
			field379 = 0;
			field104 = true;
			field201 = "";
			field162 = 4;
			field95 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field428 = true;
			field379 = 0;
			field104 = true;
			field201 = "";
			field162 = 5;
			field95 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field255[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = UGUHDANY.field1285 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= UGUHDANY.field1285) {
							var5 = 0;
						}
					}

					if (!UGUHDANY.field1286[var5].field1292 && UGUHDANY.field1286[var5].field1287 == var3 + (field146 ? 0 : 7)) {
						break;
					}
				}

				field255[var3] = var5;
				field368 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field187[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field282[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field282[var6].length) {
					var8 = 0;
				}
			}

			field187[var6] = var8;
			field368 = true;
		}

		if (var2 == 324 && !field146) {
			field146 = true;
			method94();
		}

		if (var2 == 325 && field146) {
			field146 = false;
			method94();
		}

		if (var2 == 326) {
			field360.method450(24);
			field360.method451(field146 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field360.method451(field255[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field360.method451(field187[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field404 = !field404;
		}

		if (var2 >= 601 && var2 <= 613) {
			method146();

			if (field424.length() > 0) {
				field360.method450(135);
				field360.method457(ASZHZJYZ.method5(field424));
				field360.method451(var2 - 601);
				field360.method451(field404 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method21(int arg0, int arg1) {
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

	@ObfuscatedName("client.b(Ljava/lang/String;I)V")
	public final void method22(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field100 = 0;
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

			field100 = 0;
			label46: for (int var7 = 0; var7 < VIWDEJKN.field1323; var7++) {
				VIWDEJKN var8 = VIWDEJKN.method544(var7);
				if (var8.field1345 == -1 && var8.field1311 != null) {
					String var9 = var8.field1311.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field101[field100] = var9;
					field102[field100] = var7;
					field100++;
					if (field100 >= field101.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LZXDQRRNS;I)V")
	public final void method23(ZXDQRRNS arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field164.length; var3++) {
			field164[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field164[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field165[var9] = (field164[var9 - 1] + field164[var9 + 1] + field164[var9 - 128] + field164[var9 + 128]) / 4;
				}
			}

			int[] var10 = field164;
			field164 = field165;
			field165 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1511; var12++) {
				for (int var13 = 0; var13 < arg0.field1510; var13++) {
					if (arg0.field1508[var11++] != 0) {
						int var14 = var13 + arg0.field1512 + 16;
						int var15 = var12 + arg0.field1513 + 16;
						int var16 = (var15 << 7) + var14;
						field164[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method24() {
		for (CHEFEIMI var1 = (CHEFEIMI) field139.method181(); var1 != null; var1 = (CHEFEIMI) field139.method183()) {
			if (var1.field56 == -1) {
				var1.field55 = 0;
				method156(var1);
			} else {
				var1.method331();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field67.method215(arg1, arg4, arg0);
		if (var6 != 0) {
			int var7 = field67.method219(arg1, arg4, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field389.field1027;
			int var12 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			PXRGLLGB var14 = PXRGLLGB.method417(var13);
			if (var14.field1155 == -1) {
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
				ZXDQRRNS var15 = field354[var14.field1155];
				if (var15 != null) {
					int var16 = (var14.field1142 * 4 - var15.field1510) / 2;
					int var17 = (var14.field1149 * 4 - var15.field1511) / 2;
					var15.method599((104 - arg0 - var14.field1149) * 4 + var17 + 48, arg4 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field67.method217(arg1, arg4, arg0);
		if (var18 != 0) {
			int var19 = field67.method219(arg1, arg4, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			PXRGLLGB var23 = PXRGLLGB.method417(var22);
			if (var23.field1155 != -1) {
				ZXDQRRNS var24 = field354[var23.field1155];
				if (var24 != null) {
					int var25 = (var23.field1142 * 4 - var24.field1510) / 2;
					int var26 = (var23.field1149 * 4 - var24.field1511) / 2;
					var24.method599((104 - arg0 - var23.field1149) * 4 + var26 + 48, arg4 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field389.field1027;
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

		int var30 = field67.method218(arg1, arg4, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			PXRGLLGB var32 = PXRGLLGB.method417(var31);
			if (var32.field1155 != -1) {
				ZXDQRRNS var33 = field354[var32.field1155];
				if (var33 != null) {
					int var34 = (var32.field1142 * 4 - var33.field1510) / 2;
					int var35 = (var32.field1149 * 4 - var33.field1511) / 2;
					var33.method599((104 - arg0 - var32.field1149) * 4 + var35 + 48, arg4 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method26(int arg0) {
		NHFASBOX.method334(arg0);
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method27() {
		byte[] var1 = field298.method559("title.dat", null);
		OMAKLDKI var2 = new OMAKLDKI(var1, this);
		field210.method316();
		var2.method349(0, 0);
		field211.method316();
		var2.method349(-637, 0);
		field207.method316();
		var2.method349(-128, 0);
		field208.method316();
		var2.method349(-202, -371);
		field209.method316();
		var2.method349(-202, -171);
		field212.method316();
		var2.method349(0, -265);
		field213.method316();
		var2.method349(-562, -265);
		field214.method316();
		var2.method349(-128, -171);
		field215.method316();
		var2.method349(-562, -171);
		int[] var3 = new int[var2.field1028];
		for (int var4 = 0; var4 < var2.field1029; var4++) {
			for (int var5 = 0; var5 < var2.field1028; var5++) {
				var3[var5] = var2.field1027[var2.field1028 * var4 + var2.field1028 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1028; var6++) {
				var2.field1027[var2.field1028 * var4 + var6] = var3[var6];
			}
		}

		field210.method316();
		var2.method349(382, 0);
		field211.method316();
		var2.method349(-255, 0);
		field207.method316();
		var2.method349(254, 0);
		field208.method316();
		var2.method349(180, -371);
		field209.method316();
		var2.method349(180, -171);
		field212.method316();
		var2.method349(382, -265);
		field213.method316();
		var2.method349(-180, -265);
		field214.method316();
		var2.method349(254, -171);
		field215.method316();
		var2.method349(-180, -171);
		OMAKLDKI var7 = new OMAKLDKI(field298, "logo", 0);
		field207.method316();
		var7.method351(18, 382 - var7.field1028 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.f(I)V")
	public final void method28() {
		try {
			if (field63 != null) {
				field63.method407();
			}
		} catch (Exception var2) {
		}

		field63 = null;
		field323 = false;
		field244 = 0;
		field344 = "";
		field345 = "";
		method95();
		field67.method189();

		for (int var1 = 0; var1 < 4; var1++) {
			field373[var1].method380();
		}

		System.gc();
		method128();
		field340 = -1;
		field395 = -1;
		field302 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;I)V")
	public final void method29(String arg0, String arg1) {
		if (field491 != null) {
			field491.method316();
			QRNWMOSL.field1180 = field168;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field460.method360(var3, arg0, 257, 0);
			field460.method360(var3 - 1, arg0, 256, 0xFFFFFF);
			var3 += 15;
			if (arg1 != null) {
				field460.method360(var3, arg1, 257, 0);
				field460.method360(var3 - 1, arg1, 256, 0xFFFFFF);
			}

			field491.method317(4, 4, field1373);
		} else if (field1374 != null) {
			field1374.method316();
			QRNWMOSL.field1180 = field169;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			DEVPLWNC.method164(0, var6, 383 - var5 / 2, var5, var4 - var6 / 2 - 5);
			DEVPLWNC.method165(0xFFFFFF, 383 - var5 / 2, var4 - 5 - var6 / 2, var6, var5);

			if (arg1 != null) {
				var4 -= 7;
			}

			field460.method360(var4, arg0, 383, 0);
			field460.method360(var4 - 1, arg0, 382, 0xFFFFFF);
			var4 += 15;
			if (arg1 != null) {
				field460.method360(var4, arg1, 383, 0);
				field460.method360(var4 - 1, arg1, 382, 0xFFFFFF);
			}

			field1374.method317(0, 0, field1373);
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method30(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method31(long arg0) {
		if (arg0 != 0L) {
			if (field272 >= 100) {
				method45("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = ASZHZJYZ.method9(ASZHZJYZ.method6(arg0));
				for (int var4 = 0; var4 < field272; var4++) {
					if (field179[var4] == arg0) {
						method45("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field355; var5++) {
					if (field443[var5] == arg0) {
						method45("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field179[field272++] = arg0;
				field370 = true;
				field360.method450(4);
				field360.method457(arg0);
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method32() {
		if (field288 == 2) {
			method71((field414 - field86 << 7) + field417, field415 * 2, (field413 - field85 << 7) + field416);

			if (field397 > -1 && field316 % 20 < 10) {
				field129[0].method351(field398 - 28, field397 - 12);
			}
		}
	}

	@ObfuscatedName("client.b(LSVWJKJVI;IB)V")
	public final void method33(SVWJKJVI arg0, int arg1) {
		while (arg0.field1264 + 21 < arg1 * 8) {
			int var3 = arg0.method472(14);
			if (var3 == 16383) {
				break;
			}

			if (field175[var3] == null) {
				field175[var3] = new PEHNWFXK();
			}

			PEHNWFXK var4 = field175[var3];
			field177[field176++] = var3;
			var4.field1000 = field316;
			int var5 = arg0.method472(1);
			if (var5 == 1) {
				field435[field434++] = var3;
			}

			int var6 = arg0.method472(1);
			var4.field1056 = PIPBZEOV.method398(arg0.method472(13));
			int var7 = arg0.method472(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method472(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field991 = var4.field1056.field1095;
			var4.field992 = var4.field1056.field1102;
			var4.field1005 = var4.field1056.field1076;
			var4.field1006 = var4.field1056.field1098;
			var4.field1007 = var4.field1056.field1100;
			var4.field1008 = var4.field1056.field1069;
			var4.field967 = var4.field1056.field1075;
			var4.method344(field133.field1018[0] + var7, var6 == 1, field133.field1017[0] + var8);
		}

		arg0.method473();
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method34(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field272; var3++) {
				if (field179[var3] == arg0) {
					field272--;
					field370 = true;

					for (int var4 = var3; var4 < field272; var4++) {
						field179[var4] = field179[var4 + 1];
					}

					field360.method450(240);
					field360.method457(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method35(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(ILSVWJKJVI;LKVXZMJHR;II)V")
	public final void method36(int arg0, SVWJKJVI arg1, KVXZMJHR arg2, int arg3) {
		if ((arg3 & 0x100) != 0) {
			int var5 = arg1.method481();
			int var6 = arg1.method479();
			arg2.method342(var6, field316, var5);
			arg2.field982 = field316 + 300;
			arg2.field983 = arg1.method479();
			arg2.field984 = arg1.method461();
		}

		if ((arg3 & 0x8) != 0) {
			arg2.field986 = arg1.method468();
			if (arg2.field986.charAt(0) == '~') {
				arg2.field986 = arg2.field986.substring(1);
				method45(arg2.field853, 2, arg2.field986);
			} else if (field133 == arg2) {
				method45(arg2.field853, 2, arg2.field986);
			}

			arg2.field971 = 0;
			arg2.field985 = 0;
			arg2.field1004 = 150;
		}

		if ((arg3 & 0x200) != 0) {
			arg2.field995 = arg1.method490();
			int var7 = arg1.method466();
			arg2.field999 = var7 >> 16;
			arg2.field998 = (var7 & 0xFFFF) + field316;
			arg2.field996 = 0;
			arg2.field997 = 0;

			if (arg2.field998 > field316) {
				arg2.field996 = -1;
			}

			if (arg2.field995 == 0xFFFF) {
				arg2.field995 = -1;
			}
		}

		if ((arg3 & 0x4) != 0) {
			int var8 = arg1.method463();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			int var9 = arg1.method481();
			if (arg2.field1009 == var8 && var8 != -1) {
				int var10 = KMWMLVIH.field825[var8].field839;
				if (var10 == 1) {
					arg2.field1010 = 0;
					arg2.field1011 = 0;
					arg2.field1012 = var9;
					arg2.field1013 = 0;
				}

				if (var10 == 2) {
					arg2.field1013 = 0;
				}
			} else if (var8 == -1 || arg2.field1009 == -1 || KMWMLVIH.field825[var8].field833 >= KMWMLVIH.field825[arg2.field1009].field833) {
				arg2.field1009 = var8;
				arg2.field1010 = 0;
				arg2.field1011 = 0;
				arg2.field1012 = var9;
				arg2.field1013 = 0;
				arg2.field1014 = arg2.field993;
			}
		}

		if ((arg3 & 0x400) != 0) {
			arg2.field975 = arg1.method480();
			arg2.field977 = arg1.method481();
			arg2.field976 = arg1.method480();
			arg2.field978 = arg1.method479();
			arg2.field979 = arg1.method488() + field316;
			arg2.field980 = arg1.method490() + field316;
			arg2.field981 = arg1.method461();
			arg2.method345();
		}

		if ((arg3 & 0x80) != 0) {
			arg2.field969 = arg1.method490();
			arg2.field970 = arg1.method463();
		}

		if ((arg3 & 0x2) != 0) {
			arg2.field994 = arg1.method463();
			if (arg2.field994 == 0xFFFF) {
				arg2.field994 = -1;
			}
		}

		if ((arg3 & 0x20) != 0) {
			int var11 = arg1.method488();
			int var12 = arg1.method481();
			int var13 = arg1.method481();
			int var14 = arg1.field1263;

			if (arg2.field853 != null && arg2.field856) {
				long var15 = ASZHZJYZ.method5(arg2.field853);
				boolean var17 = false;
				if (var12 <= 1) {
					for (int var18 = 0; var18 < field272; var18++) {
						if (field179[var18] == var15) {
							var17 = true;
							break;
						}
					}
				}

				if (!var17 && field439 == 0) {
					try {
						field174.field1263 = 0;
						arg1.method470(0, field174.field1262, var13);
						field174.field1263 = 0;
						String var19 = IQRKADXA.method266(field174, var13);
						var19 = UIPOGFJQ.method512(var19);
						arg2.field986 = var19;
						arg2.field971 = var11 >> 8;
						arg2.field985 = var11 & 0xFF;
						arg2.field1004 = 150;

						if (var12 == 2 || var12 == 3) {
							method45("@cr2@" + arg2.field853, 1, var19);
						} else if (var12 == 1) {
							method45("@cr1@" + arg2.field853, 1, var19);
						} else {
							method45(arg2.field853, 2, var19);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field1263 = var13 + var14;
		}

		if ((arg3 & 0x40) != 0) {
			int var21 = arg1.method481();
			byte[] var22 = new byte[var21];
			SVWJKJVI var23 = new SVWJKJVI(var22);
			arg1.method495(var21, 0, var22);
			field436[arg0] = var23;
			arg2.method324(var23);
		}

		if ((arg3 & 0x1) != 0) {
			int var24 = arg1.method481();
			int var25 = arg1.method461();
			arg2.method342(var25, field316, var24);
			arg2.field982 = field316 + 300;
			arg2.field983 = arg1.method481();
			arg2.field984 = arg1.method481();
		}
	}

	@ObfuscatedName("client.a(IBLSVWJKJVI;)V")
	public final void method37(int arg0, SVWJKJVI arg1) {
		arg1.method471();
		int var3 = arg1.method472(1);
		if (var3 != 0) {
			int var4 = arg1.method472(2);
			if (var4 == 0) {
				field435[field434++] = field430;
			} else if (var4 == 1) {
				int var5 = arg1.method472(3);
				field133.method343(var5, false);
				int var6 = arg1.method472(1);
				if (var6 == 1) {
					field435[field434++] = field430;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method472(3);
				field133.method343(var7, true);
				int var8 = arg1.method472(3);
				field133.method343(var8, true);
				int var9 = arg1.method472(1);
				if (var9 == 1) {
					field435[field434++] = field430;
				}
			} else if (var4 == 3) {
				field280 = arg1.method472(2);
				int var10 = arg1.method472(7);
				int var11 = arg1.method472(1);
				int var12 = arg1.method472(1);
				if (var12 == 1) {
					field435[field434++] = field430;
				}

				int var13 = arg1.method472(7);
				field133.method344(var10, var11 == 1, var13);
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method38(int arg0) {
		int var2 = KHDRIUSF.field803[arg0].field811;
		if (var2 != 0) {
			int var3 = field178[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					QRNWMOSL.method433(0.9D);
				}

				if (var3 == 2) {
					QRNWMOSL.method433(0.8D);
				}

				if (var3 == 3) {
					QRNWMOSL.method433(0.7D);
				}

				if (var3 == 4) {
					QRNWMOSL.method433(0.6D);
				}

				VIWDEJKN.field1314.method177();
				field364 = true;
			}

			if (var2 == 3) {
				boolean var4 = field143;

				if (var3 == 0) {
					method73(0, field143);
					field143 = true;
				}

				if (var3 == 1) {
					method73(-400, field143);
					field143 = true;
				}

				if (var3 == 2) {
					method73(-800, field143);
					field143 = true;
				}

				if (var3 == 3) {
					method73(-1200, field143);
					field143 = true;
				}

				if (var3 == 4) {
					field143 = false;
				}

				if (field143 != var4 && !field458) {
					if (field143) {
						field395 = field340;
						field396 = true;
						field480.method245(2, field395);
					} else {
						method128();
					}

					field302 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field216 = true;
					method140(0);
				}

				if (var3 == 1) {
					field216 = true;
					method140(-400);
				}

				if (var3 == 2) {
					field216 = true;
					method140(-800);
				}

				if (var3 == 3) {
					field216 = true;
					method140(-1200);
				}

				if (var3 == 4) {
					field216 = false;
				}
			}

			if (var2 == 5) {
				field383 = var3;
			}

			if (var2 == 6) {
				field82 = var3;
			}

			if (var2 == 8) {
				field411 = var3;
				field428 = true;
			}

			if (var2 == 9) {
				field81 = var3;
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method39() {
		field426++;
		if (field426 > 117) {
			field426 = 0;
			field360.method450(72);
			field360.method455(0);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method557();
					if (var1 == -1) {
						return;
					}

					if (field301 != -1 && field301 == field264) {
						break;
					}

					if (field104) {
						if (var1 >= 32 && var1 <= 122 && field201.length() < 80) {
							field201 = field201 + (char) var1;
							field428 = true;
						}

						if (var1 == 8 && field201.length() > 0) {
							field201 = field201.substring(0, field201.length() - 1);
							field428 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field104 = false;
							field428 = true;

							if (field162 == 1) {
								long var2 = ASZHZJYZ.method5(field201);
								method57(var2);
							}

							if (field162 == 2 && field355 > 0) {
								long var4 = ASZHZJYZ.method5(field201);
								method66(var4);
							}

							if (field162 == 3 && field201.length() > 0) {
								field360.method450(124);
								field360.method451(0);
								int var6 = field360.field1263;
								field360.method457(field92);
								IQRKADXA.method267(field360, field201);
								field360.method460(field360.field1263 - var6);
								field201 = IQRKADXA.method268(field201);
								field201 = UIPOGFJQ.method512(field201);
								method45(ASZHZJYZ.method9(ASZHZJYZ.method6(field92)), 6, field201);

								if (field93 == 2) {
									field93 = 1;
									field378 = true;
									field360.method450(54);
									field360.method451(field57);
									field360.method451(field93);
									field360.method451(field158);
								}
							}

							if (field162 == 4 && field272 < 100) {
								long var7 = ASZHZJYZ.method5(field201);
								method31(var7);
							}

							if (field162 == 5 && field272 > 0) {
								long var9 = ASZHZJYZ.method5(field201);
								method34(var9);
							}
						}
					} else if (field379 == 1) {
						if (var1 >= 48 && var1 <= 57 && field66.length() < 10) {
							field66 = field66 + (char) var1;
							field428 = true;
						}

						if (var1 == 8 && field66.length() > 0) {
							field66 = field66.substring(0, field66.length() - 1);
							field428 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field66.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field66);
								} catch (Exception var21) {
								}

								field360.method450(140);
								field360.method455(var11);
							}

							field379 = 0;
							field428 = true;
						}
					} else if (field379 == 2) {
						if (var1 >= 32 && var1 <= 122 && field66.length() < 12) {
							field66 = field66 + (char) var1;
							field428 = true;
						}

						if (var1 == 8 && field66.length() > 0) {
							field66 = field66.substring(0, field66.length() - 1);
							field428 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field66.length() > 0) {
								field360.method450(146);
								field360.method457(ASZHZJYZ.method5(field66));
							}

							field379 = 0;
							field428 = true;
						}
					} else if (field379 == 3) {
						if (var1 >= 32 && var1 <= 122 && field66.length() < 40) {
							field66 = field66 + (char) var1;
							field428 = true;
						}

						if (var1 == 8 && field66.length() > 0) {
							field66 = field66.substring(0, field66.length() - 1);
							field428 = true;
						}
					} else if (field196 == -1 && field393 == -1) {
						if (var1 >= 32 && var1 <= 122 && field182.length() < 80) {
							field182 = field182 + (char) var1;
							field428 = true;
						}

						if (var1 == 8 && field182.length() > 0) {
							field182 = field182.substring(0, field182.length() - 1);
							field428 = true;
						}

						if ((var1 == 13 || var1 == 10) && field182.length() > 0) {
							if (field90 == 2) {
								if (field182.equals("::clientdrop")) {
									method43();
								}

								if (field182.equals("::lag")) {
									method81();
								}

								if (field182.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field480.method244(2); var12++) {
										field480.method253((byte) 1, 2, var12);
									}
								}

								if (field182.equals("::fpson")) {
									field402 = true;
								}

								if (field182.equals("::fpsoff")) {
									field402 = false;
								}

								if (field182.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field373[var13].field1055[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field182.startsWith("::")) {
								field360.method450(82);
								field360.method451(field182.length() - 1);
								field360.method458(field182.substring(2));
							} else {
								String var16 = field182.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field182 = field182.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field182 = field182.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field182 = field182.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field182 = field182.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field182 = field182.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field182 = field182.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field182 = field182.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field182 = field182.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field182 = field182.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field182 = field182.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field182 = field182.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field182 = field182.substring(6);
								}

								String var18 = field182.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field182 = field182.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field182 = field182.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field182 = field182.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field182 = field182.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field182 = field182.substring(6);
								}

								field360.method450(165);
								field360.method451(0);
								int var20 = field360.field1263;
								field360.method451(var17);
								field360.method477(var19);
								field174.field1263 = 0;
								IQRKADXA.method267(field174, field182);
								field360.method459(0, field174.field1262, field174.field1263);
								field360.method460(field360.field1263 - var20);
								field182 = IQRKADXA.method268(field182);
								field182 = UIPOGFJQ.method512(field182);
								field133.field986 = field182;
								field133.field971 = var17;
								field133.field985 = var19;
								field133.field1004 = 150;

								if (field90 == 2) {
									method45("@cr2@" + field133.field853, 2, field133.field986);
								} else if (field90 == 1) {
									method45("@cr1@" + field133.field853, 2, field133.field986);
								} else {
									method45(field133.field853, 2, field133.field986);
								}

								if (field57 == 2) {
									field57 = 3;
									field378 = true;
									field360.method450(54);
									field360.method451(field57);
									field360.method451(field93);
									field360.method451(field158);
								}
							}

							field182 = "";
							field428 = true;
						}
					}
				}

				if (var1 == 8 && field424.length() > 0) {
					field424 = field424.substring(0, field424.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field424.length() < 12) {
				field424 = field424 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method40() {
		if (field492 == null) {
			method144();
			field1374 = null;
			field207 = null;
			field208 = null;
			field209 = null;
			field210 = null;
			field211 = null;
			field212 = null;
			field213 = null;
			field214 = null;
			field215 = null;
			field492 = new KJGJRATW(method82(), 479, 96);
			field490 = new KJGJRATW(method82(), 172, 156);
			DEVPLWNC.method162();
			field108.method599(0, 0);
			field489 = new KJGJRATW(method82(), 190, 261);
			field491 = new KJGJRATW(method82(), 512, 334);
			DEVPLWNC.method162();
			field440 = new KJGJRATW(method82(), 496, 50);
			field441 = new KJGJRATW(method82(), 269, 37);
			field442 = new KJGJRATW(method82(), 249, 45);
			field364 = true;
			field491.method316();
			QRNWMOSL.field1180 = field168;
		}
	}

	@ObfuscatedName("client.a(IILNHFASBOX;)I")
	public final int method41(int arg0, NHFASBOX arg1) {
		if (arg1.field939 == null || arg0 >= arg1.field939.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field939[arg0];
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
					var8 = field449[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field160[var3[var5++]];
				}

				if (var7 == 4) {
					NHFASBOX var10 = NHFASBOX.method339(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < VIWDEJKN.field1323 && (!VIWDEJKN.method544(var11).field1321 || field457)) {
						for (int var12 = 0; var12 < var10.field956.length; var12++) {
							if (var11 + 1 == var10.field956[var12]) {
								var8 += var10.field943[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field178[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field448[field449[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field178[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field133.field851;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < VPKKBTBT.field1362; var13++) {
						if (VPKKBTBT.field1364[var13]) {
							var8 += field449[var13];
						}
					}
				}

				if (var7 == 10) {
					NHFASBOX var14 = NHFASBOX.method339(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < VIWDEJKN.field1323 && (!VIWDEJKN.method544(var15).field1321 || field457)) {
						for (int var16 = 0; var16 < var14.field956.length; var16++) {
							if (var14.field956[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field219;
				}

				if (var7 == 12) {
					var8 = field371;
				}

				if (var7 == 13) {
					int var17 = field178[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					GQWQHTHS var20 = GQWQHTHS.field557[var19];
					int var21 = var20.field559;
					int var22 = var20.field560;
					int var23 = var20.field561;
					int var24 = field191[var23 - var22];
					var8 = field178[var21] >> var22 & var24;
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
					var8 = (field133.field972 >> 7) + field85;
				}

				if (var7 == 19) {
					var8 = (field133.field973 >> 7) + field86;
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

	@ObfuscatedName("client.a(IIILNHFASBOX;IZII)V")
	public final void method42(int arg0, int arg1, int arg2, NHFASBOX arg3, int arg4, int arg5, int arg6) {
		if (arg3.field914 == 0 && arg3.field960 != null && !arg3.field904 && (arg0 >= arg6 && arg2 >= arg4 && arg0 <= arg3.field917 + arg6 && arg2 <= arg3.field893 + arg4)) {
			int var8 = arg3.field960.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg3.field892[var9] + arg6;
				int var11 = arg3.field920[var9] + arg4 - arg1;
				NHFASBOX var12 = NHFASBOX.method339(arg3.field960[var9]);
				var10 += var12.field931;
				var11 += var12.field919;
				if ((var12.field915 >= 0 || var12.field953 != 0) && arg0 >= var10 && arg2 >= var11 && arg0 < var12.field917 + var10 && arg2 < var12.field893 + var11) {
					if (var12.field915 >= 0) {
						field130 = var12.field915;
					} else {
						field130 = var12.field936;
					}
				}

				if (var12.field914 == 8 && arg0 >= var10 && arg2 >= var11 && arg0 < var12.field917 + var10 && arg2 < var12.field893 + var11) {
					field392 = var12.field936;
				}

				if (var12.field914 == 0) {
					method42(arg0, var12.field940, arg2, var12, var11, arg5, var10);

					if (var12.field924 > var12.field893) {
						method126(var12, var11, arg5, var12.field893, arg0, var12.field924, var12.field917 + var10, arg2);
					}
				} else {
					if (var12.field946 == 1 && arg0 >= var10 && arg2 >= var11 && arg0 < var12.field917 + var10 && arg2 < var12.field893 + var11) {
						boolean var13 = false;
						if (var12.field909 != 0) {
							var13 = method114(var12);
						}

						if (!var13) {
							field401[field399] = var12.field957;
							field241[field399] = 128;
							field240[field399] = var12.field936;
							field399++;
						}
					}

					if (var12.field946 == 2 && field232 == 0 && arg0 >= var10 && arg2 >= var11 && arg0 < var12.field917 + var10 && arg2 < var12.field893 + var11) {
						String var14 = var12.field933;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field401[field399] = var14 + " @gre@" + var12.field934;
						field241[field399] = 738;
						field240[field399] = var12.field936;
						field399++;
					}

					if (var12.field946 == 3 && arg0 >= var10 && arg2 >= var11 && arg0 < var12.field917 + var10 && arg2 < var12.field893 + var11) {
						field401[field399] = "Close";

						if (arg5 == 3) {
							field241[field399] = 136;
						} else {
							field241[field399] = 526;
						}

						field240[field399] = var12.field936;
						field399++;
					}

					if (var12.field946 == 4 && arg0 >= var10 && arg2 >= var11 && arg0 < var12.field917 + var10 && arg2 < var12.field893 + var11) {
						field401[field399] = var12.field957;
						field241[field399] = 256;
						field240[field399] = var12.field936;
						field399++;
					}

					if (var12.field946 == 5 && arg0 >= var10 && arg2 >= var11 && arg0 < var12.field917 + var10 && arg2 < var12.field893 + var11) {
						field401[field399] = var12.field957;
						field241[field399] = 211;
						field240[field399] = var12.field936;
						field399++;
					}

					if (var12.field946 == 6 && !field227 && arg0 >= var10 && arg2 >= var11 && arg0 < var12.field917 + var10 && arg2 < var12.field893 + var11) {
						field401[field399] = var12.field957;
						field241[field399] = 192;
						field240[field399] = var12.field936;
						field399++;
					}

					if (var12.field914 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field893; var16++) {
							for (int var17 = 0; var17 < var12.field917; var17++) {
								int var18 = (var12.field952 + 32) * var17 + var10;
								int var19 = (var12.field898 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field918[var15];
									var19 += var12.field901[var15];
								}

								if (arg0 >= var18 && arg2 >= var19 && arg0 < var18 + 32 && arg2 < var19 + 32) {
									field261 = var15;
									field262 = var12.field936;

									if (var12.field956[var15] > 0) {
										VIWDEJKN var20 = VIWDEJKN.method544(var12.field956[var15] - 1);
										if (field465 == 1 && var12.field935) {
											if (field467 != var12.field936 || field466 != var15) {
												field401[field399] = "Use " + field469 + " with @lre@" + var20.field1311;
												field241[field399] = 919;
												field242[field399] = var20.field1347;
												field239[field399] = var15;
												field240[field399] = var12.field936;
												field399++;
											}
										} else if (field232 != 1 || !var12.field935) {
											if (var12.field935) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1310 != null && var20.field1310[var21] != null) {
														field401[field399] = var20.field1310[var21] + " @lre@" + var20.field1311;

														if (var21 == 3) {
															field241[field399] = 228;
														}

														if (var21 == 4) {
															field241[field399] = 675;
														}

														field242[field399] = var20.field1347;
														field239[field399] = var15;
														field240[field399] = var12.field936;
														field399++;
													} else if (var21 == 4) {
														field401[field399] = "Drop @lre@" + var20.field1311;
														field241[field399] = 675;
														field242[field399] = var20.field1347;
														field239[field399] = var15;
														field240[field399] = var12.field936;
														field399++;
													}
												}
											}

											if (var12.field938) {
												field401[field399] = "Use @lre@" + var20.field1311;
												field241[field399] = 860;
												field242[field399] = var20.field1347;
												field239[field399] = var15;
												field240[field399] = var12.field936;
												field399++;
											}

											if (var12.field935 && var20.field1310 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1310[var22] != null) {
														field401[field399] = var20.field1310[var22] + " @lre@" + var20.field1311;

														if (var22 == 0) {
															field241[field399] = 221;
														}

														if (var22 == 1) {
															field241[field399] = 379;
														}

														if (var22 == 2) {
															field241[field399] = 207;
														}

														field242[field399] = var20.field1347;
														field239[field399] = var15;
														field240[field399] = var12.field936;
														field399++;
													}
												}
											}

											if (var12.field900 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field900[var23] != null) {
														field401[field399] = var12.field900[var23] + " @lre@" + var20.field1311;

														if (var23 == 0) {
															field241[field399] = 941;
														}

														if (var23 == 1) {
															field241[field399] = 631;
														}

														if (var23 == 2) {
															field241[field399] = 94;
														}

														if (var23 == 3) {
															field241[field399] = 292;
														}

														if (var23 == 4) {
															field241[field399] = 883;
														}

														field242[field399] = var20.field1347;
														field239[field399] = var15;
														field240[field399] = var12.field936;
														field399++;
													}
												}
											}

											field401[field399] = "Examine @lre@" + var20.field1311;
											field241[field399] = 1826;
											field242[field399] = var20.field1347;
											field239[field399] = var15;
											field240[field399] = var12.field936;
											field399++;
										} else if ((field234 & 0x10) == 0x10) {
											field401[field399] = field235 + " @lre@" + var20.field1311;
											field241[field399] = 210;
											field242[field399] = var20.field1347;
											field239[field399] = var15;
											field240[field399] = var12.field936;
											field399++;
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

	@ObfuscatedName("client.i(I)V")
	public final void method43() {
		if (field338 > 0) {
			method28();
		} else {
			method29("Connection lost", "Please wait - attempting to reestablish");
			field189 = 0;
			field387 = 0;
			PTISUREQ var1 = field63;
			field323 = false;
			field481 = 0;
			method158(field344, field345, true);

			if (!field323) {
				method28();
			}

			try {
				var1.method407();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ZIIILKVXZMJHR;)V")
	public final void method44(int arg0, int arg1, int arg2, KVXZMJHR arg3) {
		if (field133 != arg3 && field399 < 400) {
			String var5;
			if (arg3.field855 == 0) {
				var5 = arg3.field853 + method21(field133.field851, arg3.field851) + " (level-" + arg3.field851 + ")";
			} else {
				var5 = arg3.field853 + " (skill-" + arg3.field855 + ")";
			}

			if (field465 == 1) {
				field401[field399] = "Use " + field469 + " with @whi@" + var5;
				field241[field399] = 669;
				field242[field399] = arg2;
				field239[field399] = arg1;
				field240[field399] = arg0;
				field399++;
			} else if (field232 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field331[var6] != null) {
						field401[field399] = field331[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field331[var6].equalsIgnoreCase("attack")) {
							if (arg3.field851 > field133.field851) {
								var7 = 2000;
							}

							if (field133.field841 != 0 && arg3.field841 != 0) {
								if (field133.field841 == arg3.field841) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field332[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field241[field399] = var7 + 685;
						}

						if (var6 == 1) {
							field241[field399] = var7 + 530;
						}

						if (var6 == 2) {
							field241[field399] = var7 + 622;
						}

						if (var6 == 3) {
							field241[field399] = var7 + 749;
						}

						if (var6 == 4) {
							field241[field399] = var7 + 832;
						}

						field242[field399] = arg2;
						field239[field399] = arg1;
						field240[field399] = arg0;
						field399++;
					}
				}
			} else if ((field234 & 0x8) == 8) {
				field401[field399] = field235 + " @whi@" + var5;
				field241[field399] = 544;
				field242[field399] = arg2;
				field239[field399] = arg1;
				field240[field399] = arg0;
				field399++;
			}

			for (int var8 = 0; var8 < field399; var8++) {
				if (field241[var8] == 821) {
					field401[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1376 != null) {
				return new URL("http://127.0.0.1:" + (field456 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IILjava/lang/String;)V")
	public final void method45(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field365 != -1) {
			field277 = arg2;
			field1387 = 0;
		}

		if (field196 == -1) {
			field428 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field202[var4] = field202[var4 - 1];
			field203[var4] = field203[var4 - 1];
			field204[var4] = field204[var4 - 1];
		}

		field202[0] = arg1;
		field203[0] = arg0;
		field204[0] = arg2;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method46() {
		if (field399 >= 2 || field465 != 0 || field232 != 0) {
			String var1;
			if (field465 == 1 && field399 < 2) {
				var1 = "Use " + field469 + " with...";
			} else if (field232 == 1 && field399 < 2) {
				var1 = field235 + "...";
			} else {
				var1 = field401[field399 - 1];
			}

			if (field399 > 2) {
				var1 = var1 + "@whi@ / " + (field399 - 2) + " more options";
			}

			field461.method369(15, 0xFFFFFF, var1, field316 / 1000, 4, true);
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method47() {
		if (field207 == null) {
			field1374 = null;
			field492 = null;
			field490 = null;
			field489 = null;
			field491 = null;
			field440 = null;
			field441 = null;
			field442 = null;
			field210 = new KJGJRATW(method82(), 128, 265);
			DEVPLWNC.method162();
			field211 = new KJGJRATW(method82(), 128, 265);
			DEVPLWNC.method162();
			field207 = new KJGJRATW(method82(), 509, 171);
			DEVPLWNC.method162();
			field208 = new KJGJRATW(method82(), 360, 132);
			DEVPLWNC.method162();
			field209 = new KJGJRATW(method82(), 360, 200);
			DEVPLWNC.method162();
			field212 = new KJGJRATW(method82(), 202, 238);
			DEVPLWNC.method162();
			field213 = new KJGJRATW(method82(), 203, 238);
			DEVPLWNC.method162();
			field214 = new KJGJRATW(method82(), 74, 94);
			DEVPLWNC.method162();
			field215 = new KJGJRATW(method82(), 75, 94);
			DEVPLWNC.method162();

			if (field298 != null) {
				method27();
				method72();
			}

			field364 = true;
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method48(int arg0) {
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

	@ObfuscatedName("client.d(B)V")
	public final void method49() {
		field490.method316();

		if (field189 == 2) {
			byte[] var1 = field108.field1508;
			int[] var2 = DEVPLWNC.field524;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field445.method355(33, 0, field237, 25, 0, field258, field192, 33, 256, 25);
			field491.method316();
			QRNWMOSL.field1180 = field168;
		} else {
			int var5 = field258 + field246 & 0x7FF;
			int var6 = field133.field972 / 32 + 48;
			int var7 = 464 - field133.field973 / 32;
			field389.method355(146, 5, field476, var6, 25, var5, field121, 151, field140 + 256, var7);
			field445.method355(33, 0, field237, 25, 0, field258, field192, 33, 256, 25);

			for (int var8 = 0; var8 < field421; var8++) {
				int var9 = field422[var8] * 4 + 2 - field133.field972 / 32;
				int var10 = field423[var8] * 4 + 2 - field133.field973 / 32;
				method91(var10, field206[var8], var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					ETMNPRAF var13 = field148[field280][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field133.field972 / 32;
						int var15 = var12 * 4 + 2 - field133.field973 / 32;
						method91(var15, field471, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field176; var16++) {
				PEHNWFXK var17 = field175[field177[var16]];
				if (var17 != null && var17.method325()) {
					PIPBZEOV var18 = var17.field1056;
					if (var18.field1082 != null) {
						var18 = var18.method397();
					}

					if (var18 != null && var18.field1083 && var18.field1070) {
						int var19 = var17.field972 / 32 - field133.field972 / 32;
						int var20 = var17.field973 / 32 - field133.field973 / 32;
						method91(var20, field472, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field432; var21++) {
				KVXZMJHR var22 = field431[field433[var21]];
				if (var22 != null && var22.method325()) {
					int var23 = var22.field972 / 32 - field133.field972 / 32;
					int var24 = var22.field973 / 32 - field133.field973 / 32;
					boolean var25 = false;
					long var26 = ASZHZJYZ.method5(var22.field853);
					for (int var28 = 0; var28 < field355; var28++) {
						if (field443[var28] == var26 && field105[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field133.field841 != 0 && var22.field841 != 0 && field133.field841 == var22.field841) {
						var29 = true;
					}

					if (var25) {
						method91(var24, field474, var23);
					} else if (var29) {
						method91(var24, field475, var23);
					} else {
						method91(var24, field473, var23);
					}
				}
			}

			if (field288 != 0 && field316 % 20 < 10) {
				if (field288 == 1 && field183 >= 0 && field183 < field175.length) {
					PEHNWFXK var30 = field175[field183];
					if (var30 != null) {
						int var31 = var30.field972 / 32 - field133.field972 / 32;
						int var32 = var30.field973 / 32 - field133.field973 / 32;
						method111(var31, field483, var32);
					}
				}

				if (field288 == 2) {
					int var33 = (field413 - field85) * 4 + 2 - field133.field972 / 32;
					int var34 = (field414 - field86) * 4 + 2 - field133.field973 / 32;
					method111(var33, field483, var34);
				}

				if (field288 == 10 && field446 >= 0 && field446 < field431.length) {
					KVXZMJHR var35 = field431[field446];
					if (var35 != null) {
						int var36 = var35.field972 / 32 - field133.field972 / 32;
						int var37 = var35.field973 / 32 - field133.field973 / 32;
						method111(var36, field483, var37);
					}
				}
			}

			if (field387 != 0) {
				int var38 = field387 * 4 + 2 - field133.field972 / 32;
				int var39 = field388 * 4 + 2 - field133.field973 / 32;
				method91(var39, field482, var38);
			}

			DEVPLWNC.method164(0xFFFFFF, 3, 97, 3, 78);
			field491.method316();
			QRNWMOSL.field1180 = field168;
		}
	}

	@ObfuscatedName("client.a(IB)Z")
	public final boolean method50(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field241[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 839) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method51() {
		if (field465 == 0 && field232 == 0) {
			field401[field399] = "Walk here";
			field241[field399] = 821;
			field239[field399] = field1381;
			field240[field399] = field1382;
			field399++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < IYSWJGDE.field780; var2++) {
			int var3 = IYSWJGDE.field781[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field67.method219(field280, var4, var5, var3) >= 0) {
					PXRGLLGB var8 = PXRGLLGB.method417(var7);
					if (var8.field1138 != null) {
						var8 = var8.method418();
					}

					if (var8 == null) {
						continue;
					}

					if (field465 == 1) {
						field401[field399] = "Use " + field469 + " with @cya@" + var8.field1160;
						field241[field399] = 453;
						field242[field399] = var3;
						field239[field399] = var4;
						field240[field399] = var5;
						field399++;
					} else if (field232 != 1) {
						if (var8.field1163 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1163[var9] != null) {
									field401[field399] = var8.field1163[var9] + " @cya@" + var8.field1160;

									if (var9 == 0) {
										field241[field399] = 405;
									}

									if (var9 == 1) {
										field241[field399] = 87;
									}

									if (var9 == 2) {
										field241[field399] = 424;
									}

									if (var9 == 3) {
										field241[field399] = 707;
									}

									if (var9 == 4) {
										field241[field399] = 1198;
									}

									field242[field399] = var3;
									field239[field399] = var4;
									field240[field399] = var5;
									field399++;
								}
							}
						}

						field401[field399] = "Examine @cya@" + var8.field1160;
						field241[field399] = 1648;
						field242[field399] = var8.field1139 << 14;
						field239[field399] = var4;
						field240[field399] = var5;
						field399++;
					} else if ((field234 & 0x4) == 4) {
						field401[field399] = field235 + " @cya@" + var8.field1160;
						field241[field399] = 23;
						field242[field399] = var3;
						field239[field399] = var4;
						field240[field399] = var5;
						field399++;
					}
				}

				if (var6 == 1) {
					PEHNWFXK var10 = field175[var7];
					if (var10.field1056.field1095 == 1 && (var10.field972 & 0x7F) == 0x40 && (var10.field973 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field176; var11++) {
							PEHNWFXK var12 = field175[field177[var11]];
							if (var12 != null && var10 != var12 && var12.field1056.field1095 == 1 && var10.field972 == var12.field972 && var10.field973 == var12.field973) {
								method113(var4, var5, field177[var11], var12.field1056);
							}
						}

						for (int var13 = 0; var13 < field432; var13++) {
							KVXZMJHR var14 = field431[field433[var13]];
							if (var14 != null && var10.field972 == var14.field972 && var10.field973 == var14.field973) {
								method44(var5, var4, field433[var13], var14);
							}
						}
					}

					method113(var4, var5, var7, var10.field1056);
				}

				if (var6 == 0) {
					KVXZMJHR var15 = field431[var7];
					if ((var15.field972 & 0x7F) == 0x40 && (var15.field973 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field176; var16++) {
							PEHNWFXK var17 = field175[field177[var16]];
							if (var17 != null && var17.field1056.field1095 == 1 && var15.field972 == var17.field972 && var15.field973 == var17.field973) {
								method113(var4, var5, field177[var16], var17.field1056);
							}
						}

						for (int var18 = 0; var18 < field432; var18++) {
							KVXZMJHR var19 = field431[field433[var18]];
							if (var19 != null && var15 != var19 && var15.field972 == var19.field972 && var15.field973 == var19.field973) {
								method44(var5, var4, field433[var18], var19);
							}
						}
					}

					method44(var5, var4, var7, var15);
				}

				if (var6 == 3) {
					ETMNPRAF var20 = field148[field280][var4][var5];
					if (var20 != null) {
						for (WEHUNTCT var21 = (WEHUNTCT) var20.method182(); var21 != null; var21 = (WEHUNTCT) var20.method184()) {
							VIWDEJKN var22 = VIWDEJKN.method544(var21.field1413);
							if (field465 == 1) {
								field401[field399] = "Use " + field469 + " with @lre@" + var22.field1311;
								field241[field399] = 956;
								field242[field399] = var21.field1413;
								field239[field399] = var4;
								field240[field399] = var5;
								field399++;
							} else if (field232 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1301 != null && var22.field1301[var23] != null) {
										field401[field399] = var22.field1301[var23] + " @lre@" + var22.field1311;

										if (var23 == 0) {
											field241[field399] = 77;
										}

										if (var23 == 1) {
											field241[field399] = 483;
										}

										if (var23 == 2) {
											field241[field399] = 491;
										}

										if (var23 == 3) {
											field241[field399] = 879;
										}

										if (var23 == 4) {
											field241[field399] = 455;
										}

										field242[field399] = var21.field1413;
										field239[field399] = var4;
										field240[field399] = var5;
										field399++;
									} else if (var23 == 2) {
										field401[field399] = "Take @lre@" + var22.field1311;
										field241[field399] = 491;
										field242[field399] = var21.field1413;
										field239[field399] = var4;
										field240[field399] = var5;
										field399++;
									}
								}

								field401[field399] = "Examine @lre@" + var22.field1311;
								field241[field399] = 1914;
								field242[field399] = var21.field1413;
								field239[field399] = var4;
								field240[field399] = var5;
								field399++;
							} else if ((field234 & 0x1) == 1) {
								field401[field399] = field235 + " @lre@" + var22.field1311;
								field241[field399] = 769;
								field242[field399] = var21.field1413;
								field239[field399] = var4;
								field240[field399] = var5;
								field399++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method52() {
		method53();

		if (field315 == 1) {
			field97[field314 / 100].method351(field313 - 8 - 4, field312 - 8 - 4);
		}

		if (field315 == 2) {
			field97[field314 / 100 + 4].method351(field313 - 8 - 4, field312 - 8 - 4);
			field149++;
			if (field149 > 1114) {
				field149 = 0;
				field360.method450(26);
				field360.method451(0);
				int var1 = field360.field1263;
				field360.method451((int) (Math.random() * 256.0D));
				field360.method452(9360);

				if ((int) (Math.random() * 2.0D) == 0) {
					field360.method451(245);
				}

				field360.method452(2628);
				field360.method452(27049);
				field360.method451(152);

				if ((int) (Math.random() * 2.0D) == 0) {
					field360.method452(33207);
				}

				field360.method452(59958);
				field360.method451(186);
				field360.method452((int) (Math.random() * 65536.0D));
				field360.method460(field360.field1263 - var1);
			}
		}

		if (field358 != -1) {
			method99(field358, field297);
			method65(NHFASBOX.method339(field358), 0, 0, 0);
		}

		if (field301 != -1) {
			method99(field301, field297);
			method65(NHFASBOX.method339(field301), 0, 0, 0);
		}

		method59();

		if (!field452) {
			method84();
			method46();
		} else if (field152 == 0) {
			method136();
		}

		if (field184 == 1) {
			field308.method351(296, 472);
		}

		if (field402) {
			short var2 = 507;
			int var3 = 20;
			int var4 = 0xFFFF00;
			if (field1369 < 30 && field458) {
				var4 = 0xFF0000;
			}

			if (field1369 < 20 && !field458) {
				var4 = 0xFF0000;
			}

			field460.method359(var3, "Fps:" + field1369, var4, var2);
			var3 += 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 0xFFFF00;

			if (var6 > 0x2000000 && field458) {
				int var8 = 0xFF0000;
			}

			if (var6 > 0x4000000 && !field458) {
				int var9 = 0xFF0000;
			}

			field460.method359(var3, "Mem:" + var6 + "k", 0xFFFF00, var2);
			var3 += 15;
		}

		if (field163 != 0) {
			int var10 = field163 / 50;
			int var11 = var10 / 60;
			var10 %= 60;
			if (var10 < 10) {
				field460.method364(329, 0xFFFF00, 4, "System update in: " + var11 + ":0" + var10);
			} else {
				field460.method364(329, 0xFFFF00, 4, "System update in: " + var11 + ":" + var10);
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method53() {
		if (field411 != 0) {
			ONSICLVF var1 = field460;
			int var2 = 0;
			if (field163 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field204[var3] != null) {
					int var4 = field202[var3];
					String var5 = field203[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field93 == 0 || field93 == 1 && method16(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method364(var7, 0, var8, "From");
						var1.method364(var7 - 1, 0xFFFF, var8, "From");
						int var11 = var8 + var1.method362("From ");
						if (var6 == 1) {
							field254[0].method599(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field254[1].method599(var7 - 12, var11);
							var11 += 14;
						}

						var1.method364(var7, 0, var11, var5 + ": " + field204[var3]);
						var1.method364(var7 - 1, 0xFFFF, var11, var5 + ": " + field204[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field93 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method364(var9, 0, 4, field204[var3]);
						var1.method364(var9 - 1, 0xFFFF, 4, field204[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field93 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method364(var10, 0, 4, "To " + var5 + ": " + field204[var3]);
						var1.method364(var10 - 1, 0xFFFF, 4, "To " + var5 + ": " + field204[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method54() {
		Graphics var1 = method82().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method556(1);

		if (field172) {
			field84 = false;
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

		if (field159) {
			field84 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field347) {
			field84 = false;
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

	@ObfuscatedName("client.a(ILNHFASBOX;)V")
	public final void method55(NHFASBOX arg0) {
		int var2 = arg0.field909;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field356 == 0) {
				arg0.field907 = "Loading friend list";
				arg0.field946 = 0;
			} else if (var2 == 1 && field356 == 1) {
				arg0.field907 = "Connecting to friendserver";
				arg0.field946 = 0;
			} else if (var2 == 2 && field356 != 2) {
				arg0.field907 = "Please wait...";
				arg0.field946 = 0;
			} else {
				int var3 = field355;
				if (field356 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field907 = "";
					arg0.field946 = 0;
				} else {
					arg0.field907 = field444[var2];
					arg0.field946 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field355;
			if (field356 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field907 = "";
				arg0.field946 = 0;
			} else {
				if (field105[var2] == 0) {
					arg0.field907 = "@red@Offline";
				} else if (field105[var2] < 200) {
					if (field105[var2] == field455) {
						arg0.field907 = "@gre@World" + (field105[var2] - 9);
					} else {
						arg0.field907 = "@yel@World" + (field105[var2] - 9);
					}
				} else if (field105[var2] == field455) {
					arg0.field907 = "@gre@Classic" + (field105[var2] - 219);
				} else {
					arg0.field907 = "@yel@Classic" + (field105[var2] - 219);
				}

				arg0.field946 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field355;
			if (field356 != 2) {
				var5 = 0;
			}

			arg0.field924 = var5 * 15 + 20;
			if (arg0.field924 <= arg0.field893) {
				arg0.field924 = arg0.field893 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field356 == 0) {
				arg0.field907 = "Loading ignore list";
				arg0.field946 = 0;
			} else if (var2 == 1 && field356 == 0) {
				arg0.field907 = "Please wait...";
				arg0.field946 = 0;
			} else {
				int var6 = field272;
				if (field356 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field907 = "";
					arg0.field946 = 0;
				} else {
					arg0.field907 = ASZHZJYZ.method9(ASZHZJYZ.method6(field179[var2]));
					arg0.field946 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field924 = field272 * 15 + 20;
			if (arg0.field924 <= arg0.field893) {
				arg0.field924 = arg0.field893 + 1;
			}
		} else if (var2 == 327) {
			arg0.field912 = 150;
			arg0.field913 = (int) (Math.sin(field316 / 40.0D) * 256.0D) & 0x7FF;

			if (field368) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field255[var7];
					if (var8 >= 0 && !UGUHDANY.field1286[var8].method498()) {
						return;
					}
				}

				field368 = false;
				IYSWJGDE[] var9 = new IYSWJGDE[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field255[var11];
					if (var12 >= 0) {
						var9[var10++] = UGUHDANY.field1286[var12].method499();
					}
				}

				IYSWJGDE var13 = new IYSWJGDE(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field187[var14] != 0) {
						var13.method287(field282[var14][0], field282[var14][field187[var14]]);

						if (var14 == 1) {
							var13.method287(field380[0], field380[field187[var14]]);
						}
					}
				}

				var13.method280();
				var13.method281(KMWMLVIH.field825[field133.field967].field827[0]);
				var13.method290(64, 850, -30, -50, -30, true);
				arg0.field954 = 5;
				arg0.field955 = 0;
				NHFASBOX.method338(5, 0, var13);
			}
		} else if (var2 == 324) {
			if (field131 == null) {
				field131 = arg0.field922;
				field132 = arg0.field951;
			}

			if (field146) {
				arg0.field922 = field132;
			} else {
				arg0.field922 = field131;
			}
		} else if (var2 == 325) {
			if (field131 == null) {
				field131 = arg0.field922;
				field132 = arg0.field951;
			}

			if (field146) {
				arg0.field922 = field131;
			} else {
				arg0.field922 = field132;
			}
		} else if (var2 == 600) {
			arg0.field907 = field424;
			if (field316 % 20 < 10) {
				arg0.field907 = arg0.field907 + "|";
			} else {
				arg0.field907 = arg0.field907 + " ";
			}
		} else if (var2 == 620) {
			if (field90 < 1) {
				arg0.field907 = "";
			} else if (field404) {
				arg0.field902 = 0xFF0000;
				arg0.field907 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field902 = 0xFFFFFF;
				arg0.field907 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field322 - field419;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field907 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field342 == 0) {
				arg0.field907 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field342 <= field322) {
				arg0.field907 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method56(field342);
			} else {
				int var17 = field322 + 14 - field342;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field907 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method56(field342) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field96 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field96 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field96 + " unread messages";
			}

			arg0.field907 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field361 > 0 && field361 <= field322 + 10) {
				arg0.field907 = "Last password change:\\n@gre@" + method56(field361);
			} else {
				arg0.field907 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field142 > 2 && !field457) {
				arg0.field907 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field142 > 2) {
				arg0.field907 = "\\n\\nYou have @gre@" + field142 + "@yel@ days of\\nmember credit remaining.";
			} else if (field142 > 0) {
				arg0.field907 = "You have @gre@" + field142 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field907 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field142 > 2 && !field457) {
				arg0.field907 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field142 > 0) {
				arg0.field907 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field907 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field342 > field322) {
				arg0.field907 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field907 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.b(BI)Ljava/lang/String;")
	public final String method56(int arg0) {
		if (arg0 > field322 + 10) {
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

	@ObfuscatedName("client.b(IJ)V")
	public final void method57(long arg0) {
		if (arg0 != 0L) {
			if (field355 >= 100 && field231 != 1) {
				method45("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field355 >= 200) {
				method45("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = ASZHZJYZ.method9(ASZHZJYZ.method6(arg0));
				for (int var4 = 0; var4 < field355; var4++) {
					if (field443[var4] == arg0) {
						method45("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field272; var5++) {
					if (field179[var5] == arg0) {
						method45("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field133.field853)) {
					field444[field355] = var3;
					field443[field355] = arg0;
					field105[field355] = 0;
					field355++;
					field370 = true;
					field360.method450(190);
					field360.method457(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)Z")
	public final boolean method58() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.g(B)V")
	public final void method59() {
		field439 = 0;
		int var1 = (field133.field972 >> 7) + field85;
		int var2 = (field133.field973 >> 7) + field86;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field439 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field439 = 1;
		}

		if (field439 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field439 = 0;
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method60() {
		int var1 = field349 * 128 + 64;
		int var2 = field350 * 128 + 64;
		int var3 = method97(var1, var2, field280) - field351;

		if (field220 < var1) {
			field220 += (var1 - field220) * field353 / 1000 + field352;
			if (field220 > var1) {
				field220 = var1;
			}
		}

		if (field220 > var1) {
			field220 -= (field220 - var1) * field353 / 1000 + field352;
			if (field220 < var1) {
				field220 = var1;
			}
		}

		if (field221 < var3) {
			field221 += (var3 - field221) * field353 / 1000 + field352;
			if (field221 > var3) {
				field221 = var3;
			}
		}

		if (field221 > var3) {
			field221 -= (field221 - var3) * field353 / 1000 + field352;
			if (field221 < var3) {
				field221 = var3;
			}
		}

		if (field222 < var2) {
			field222 += (var2 - field222) * field353 / 1000 + field352;
			if (field222 > var2) {
				field222 = var2;
			}
		}

		if (field222 > var2) {
			field222 -= (field222 - var2) * field353 / 1000 + field352;
			if (field222 < var2) {
				field222 = var2;
			}
		}

		int var4 = field122 * 128 + 64;
		int var5 = field123 * 128 + 64;
		int var6 = method97(var4, var5, field280) - field124;
		int var7 = var4 - field220;
		int var8 = var6 - field221;
		int var9 = var5 - field222;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field223 < var11) {
			field223 += (var11 - field223) * field126 / 1000 + field125;
			if (field223 > var11) {
				field223 = var11;
			}
		}

		if (field223 > var11) {
			field223 -= (field223 - var11) * field126 / 1000 + field125;
			if (field223 < var11) {
				field223 = var11;
			}
		}

		int var13 = var12 - field224;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field224 += field126 * var13 / 1000 + field125;
			field224 &= 0x7FF;
		}

		if (var13 < 0) {
			field224 -= -var13 * field126 / 1000 + field125;
			field224 &= 0x7FF;
		}

		int var14 = var12 - field224;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field224 = var12;
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method61() {
		if (field291 == 0) {
			int var1 = field1387;
			if (field232 == 1 && field1388 >= 516 && field1389 >= 160 && field1388 <= 765 && field1389 <= 205) {
				var1 = 0;
			}

			if (field452) {
				if (var1 != 1) {
					int var2 = field1381;
					int var3 = field1382;
					if (field152 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field152 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field152 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field153 - 10 || var2 > field155 + field153 + 10 || var3 < field154 - 10 || var3 > field156 + field154 + 10) {
						field452 = false;

						if (field152 == 1) {
							field370 = true;
						}

						if (field152 == 2) {
							field428 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field153;
					int var5 = field154;
					int var6 = field155;
					int var7 = field1388;
					int var8 = field1389;
					if (field152 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field152 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field152 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field399; var10++) {
						int var11 = (field399 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method143(var9);
					}

					field452 = false;

					if (field152 == 1) {
						field370 = true;
					}

					if (field152 == 2) {
						field428 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field399 > 0) {
					int var12 = field241[field399 - 1];
					if (var12 == 941 || var12 == 631 || var12 == 94 || var12 == 292 || var12 == 883 || var12 == 221 || var12 == 379 || var12 == 207 || var12 == 228 || var12 == 675 || var12 == 860 || var12 == 1826) {
						int var13 = field239[field399 - 1];
						int var14 = field240[field399 - 1];
						NHFASBOX var15 = NHFASBOX.method339(var14);
						if (var15.field925 || var15.field908) {
							field193 = false;
							field425 = 0;
							field289 = var14;
							field290 = var13;
							field291 = 2;
							field292 = field1388;
							field293 = field1389;

							if (NHFASBOX.method339(var14).field947 == field301) {
								field291 = 1;
							}

							if (NHFASBOX.method339(var14).field947 == field196) {
								field291 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field383 == 1 || method50(field399 - 1)) && field399 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field399 > 0) {
					method143(field399 - 1);
				}

				if (var1 != 2 || field399 <= 0) {
					return;
				}

				method13();
			}
		}
	}

	@ObfuscatedName("client.o(I)I")
	public final int method62() {
		int var1 = 3;
		if (field223 < 310) {
			int var2 = field220 >> 7;
			int var3 = field222 >> 7;
			int var4 = field133.field972 >> 7;
			int var5 = field133.field973 >> 7;

			if ((field230[field280][var2][var3] & 0x4) != 0) {
				var1 = field280;
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

					if ((field230[field280][var2][var3] & 0x4) != 0) {
						var1 = field280;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field230[field280][var2][var3] & 0x4) != 0) {
							var1 = field280;
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

					if ((field230[field280][var2][var3] & 0x4) != 0) {
						var1 = field280;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field230[field280][var2][var3] & 0x4) != 0) {
							var1 = field280;
						}
					}
				}
			}
		}

		if ((field230[field280][field133.field972 >> 7][field133.field973 >> 7] & 0x4) != 0) {
			var1 = field280;
		}

		return var1;
	}

	@ObfuscatedName("client.p(I)I")
	public final int method63() {
		int var1 = method97(field220, field222, field280);
		if (var1 - field221 < 800 && (field230[field280][field220 >> 7][field222 >> 7] & 0x4) != 0) {
			return field280;
		}

		return 3;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method64() {
		field359++;
		method133(true);
		method80(true);
		method133(false);
		method80(false);
		method93();
		method102();

		if (!field384) {
			int var1 = field257;
			if (field265 / 256 > var1) {
				var1 = field265 / 256;
			}

			if (field385[4] && field151[4] + 128 > var1) {
				var1 = field151[4] + 128;
			}

			int var2 = field258 + field137 & 0x7FF;
			method12(method97(field133.field972, field133.field973, field280) - 50, var2, field268, var1 * 3 + 600, field269, var1);
		}

		int var3;
		if (field384) {
			var3 = method63();
		} else {
			var3 = method62();
		}

		int var4 = field220;
		int var5 = field221;
		int var6 = field222;
		int var7 = field223;
		int var8 = field224;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field385[var9]) {
				int var10 = (int) (Math.random() * (field276[var9] * 2 + 1) + Math.sin(field263[var9] / 100.0D * field339[var9]) * field151[var9] - field276[var9]);
				if (var9 == 0) {
					field220 += var10;
				}

				if (var9 == 1) {
					field221 += var10;
				}

				if (var9 == 2) {
					field222 += var10;
				}

				if (var9 == 3) {
					field224 = field224 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field223 += var10;
					if (field223 < 128) {
						field223 = 128;
					}

					if (field223 > 383) {
						field223 = 383;
					}
				}
			}
		}

		int var11 = QRNWMOSL.field1189;
		IYSWJGDE.field777 = true;
		IYSWJGDE.field780 = 0;
		IYSWJGDE.field778 = field1381 - 4;
		IYSWJGDE.field779 = field1382 - 4;
		DEVPLWNC.method162();
		field67.method228(field222, field224, field221, field220, field223, var3);
		field67.method203();
		method115();
		method32();
		method130(var11);
		method52();
		field491.method317(4, 4, field1373);
		field220 = var4;
		field221 = var5;
		field222 = var6;
		field223 = var7;
		field224 = var8;
	}

	@ObfuscatedName("client.a(LNHFASBOX;IIII)V")
	public final void method65(NHFASBOX arg0, int arg1, int arg2, int arg3) {
		if (arg0.field914 == 0 && arg0.field960 != null && (!arg0.field904 || field294 == arg0.field936 || field194 == arg0.field936 || field65 == arg0.field936)) {
			int var5 = DEVPLWNC.field529;
			int var6 = DEVPLWNC.field527;
			int var7 = DEVPLWNC.field530;
			int var8 = DEVPLWNC.field528;
			DEVPLWNC.method161(arg0.field917 + arg2, arg2, arg0.field893 + arg3, arg3);
			int var9 = arg0.field960.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field892[var10] + arg2;
				int var12 = arg0.field920[var10] + arg3 - arg1;
				NHFASBOX var13 = NHFASBOX.method339(arg0.field960[var10]);
				var11 += var13.field931;
				var12 += var13.field919;

				if (var13.field909 > 0) {
					method55(var13);
				}

				if (var13.field914 == 0) {
					if (var13.field940 > var13.field924 - var13.field893) {
						var13.field940 = var13.field924 - var13.field893;
					}

					if (var13.field940 < 0) {
						var13.field940 = 0;
					}

					method65(var13, var13.field940, var11, var12);

					if (var13.field924 > var13.field893) {
						method148(var12, var13.field924, var13.field917 + var11, var13.field893, var13.field940);
					}
				} else if (var13.field914 != 1) {
					if (var13.field914 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field893; var15++) {
							for (int var16 = 0; var16 < var13.field917; var16++) {
								int var17 = (var13.field952 + 32) * var16 + var11;
								int var18 = (var13.field898 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field918[var14];
									var18 += var13.field901[var14];
								}

								if (var13.field956[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field956[var14] - 1;
									if (var17 > DEVPLWNC.field529 - 32 && var17 < DEVPLWNC.field530 && var18 > DEVPLWNC.field527 - 32 && var18 < DEVPLWNC.field528 || field291 != 0 && field290 == var14) {
										int var22 = 0;
										if (field465 == 1 && field466 == var14 && field467 == var13.field936) {
											var22 = 0xFFFFFF;
										}

										OMAKLDKI var23 = VIWDEJKN.method546(var13.field943[var14], var21, var22);
										if (var23 != null) {
											if (field291 != 0 && field290 == var14 && field289 == var13.field936) {
												var19 = field1381 - field292;
												var20 = field1382 - field293;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field425 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method353(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < DEVPLWNC.field527 && arg0.field940 > 0) {
													int var24 = (DEVPLWNC.field527 - var18 - var20) * field297 / 3;
													if (var24 > field297 * 10) {
														var24 = field297 * 10;
													}

													if (var24 > arg0.field940) {
														var24 = arg0.field940;
													}

													arg0.field940 -= var24;
													field293 += var24;
												}

												if (var18 + var20 + 32 > DEVPLWNC.field528 && arg0.field940 < arg0.field924 - arg0.field893) {
													int var25 = (var18 + var20 + 32 - DEVPLWNC.field528) * field297 / 3;
													if (var25 > field297 * 10) {
														var25 = field297 * 10;
													}

													if (var25 > arg0.field924 - arg0.field893 - arg0.field940) {
														var25 = arg0.field924 - arg0.field893 - arg0.field940;
													}

													arg0.field940 += var25;
													field293 -= var25;
												}
											} else if (field80 != 0 && field79 == var14 && field78 == var13.field936) {
												var23.method353(var18, var17, 128);
											} else {
												var23.method351(var18, var17);
											}

											if (var23.field1032 == 33 || var13.field943[var14] != 1) {
												int var26 = var13.field943[var14];
												field459.method364(var18 + var20 + 10, 0, var17 + var19 + 1, method83(var26));
												field459.method364(var18 + var20 + 9, 0xFFFF00, var17 + var19, method83(var26));
											}
										}
									}
								} else if (var13.field958 != null && var14 < 20) {
									OMAKLDKI var27 = var13.field958[var14];
									if (var27 != null) {
										var27.method351(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field914 == 3) {
						boolean var28 = false;
						if (field65 == var13.field936 || field194 == var13.field936 || field294 == var13.field936) {
							var28 = true;
						}

						int var29;
						if (method137(var13)) {
							var29 = var13.field897;
							if (var28 && var13.field937 != 0) {
								var29 = var13.field937;
							}
						} else {
							var29 = var13.field902;
							if (var28 && var13.field953 != 0) {
								var29 = var13.field953;
							}
						}

						if (var13.field899 == 0) {
							if (var13.field945) {
								DEVPLWNC.method164(var29, var13.field893, var11, var13.field917, var12);
							} else {
								DEVPLWNC.method165(var29, var11, var12, var13.field893, var13.field917);
							}
						} else if (var13.field945) {
							DEVPLWNC.method163(256 - (var13.field899 & 0xFF), var12, var13.field893, var13.field917, var11, var29);
						} else {
							DEVPLWNC.method166(256 - (var13.field899 & 0xFF), var29, var11, var12, var13.field917, var13.field893);
						}
					} else if (var13.field914 == 4) {
						ONSICLVF var30 = var13.field923;
						String var31 = var13.field907;
						boolean var32 = false;
						if (field65 == var13.field936 || field194 == var13.field936 || field294 == var13.field936) {
							var32 = true;
						}

						int var33;
						if (method137(var13)) {
							var33 = var13.field897;
							if (var32 && var13.field937 != 0) {
								var33 = var13.field937;
							}

							if (var13.field921.length() > 0) {
								var31 = var13.field921;
							}
						} else {
							var33 = var13.field902;
							if (var32 && var13.field953 != 0) {
								var33 = var13.field953;
							}
						}

						if (var13.field946 == 6 && field227) {
							var31 = "Please wait...";
							var33 = var13.field902;
						}

						if (DEVPLWNC.field525 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1040 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method15(method41(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method15(method41(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method15(method41(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method15(method41(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method15(method41(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field906) {
								var30.method361(var13.field917 / 2 + var11, var34, var41, var13.field916, var33);
							} else {
								var30.method368(var33, var13.field916, var41, var11, var34);
							}

							var34 += var30.field1040;
						}
					} else if (var13.field914 == 5) {
						OMAKLDKI var42;
						if (method137(var13)) {
							var42 = var13.field951;
						} else {
							var42 = var13.field922;
						}

						if (var42 != null) {
							var42.method351(var12, var11);
						}
					} else if (var13.field914 == 6) {
						int var43 = QRNWMOSL.field1174;
						int var44 = QRNWMOSL.field1175;
						QRNWMOSL.field1174 = var13.field917 / 2 + var11;
						QRNWMOSL.field1175 = var13.field893 / 2 + var12;
						int var45 = QRNWMOSL.field1178[var13.field912] * var13.field911 >> 16;
						int var46 = QRNWMOSL.field1179[var13.field912] * var13.field911 >> 16;
						boolean var47 = method137(var13);
						int var48;
						if (var47) {
							var48 = var13.field949;
						} else {
							var48 = var13.field948;
						}

						IYSWJGDE var49;
						if (var48 == -1) {
							var49 = var13.method333(var47, -1, -1);
						} else {
							KMWMLVIH var50 = KMWMLVIH.field825[var48];
							var49 = var13.method333(var47, var50.field827[var13.field950], var50.field828[var13.field950]);
						}

						if (var49 != null) {
							var49.method294(0, var13.field913, 0, var13.field912, 0, var45, var46);
						}

						QRNWMOSL.field1174 = var43;
						QRNWMOSL.field1175 = var44;
					} else {
						if (var13.field914 == 7) {
							ONSICLVF var51 = var13.field923;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field893; var53++) {
								for (int var54 = 0; var54 < var13.field917; var54++) {
									if (var13.field956[var52] > 0) {
										VIWDEJKN var55 = VIWDEJKN.method544(var13.field956[var52] - 1);
										String var56 = String.valueOf(var55.field1311);
										if (var55.field1324 || var13.field943[var52] != 1) {
											var56 = var56 + " x" + method48(var13.field943[var52]);
										}

										int var57 = (var13.field952 + 115) * var54 + var11;
										int var58 = (var13.field898 + 12) * var53 + var12;
										if (var13.field906) {
											var51.method361(var13.field917 / 2 + var57, var58, var56, var13.field916, var13.field902);
										} else {
											var51.method368(var13.field902, var13.field916, var56, var57, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field914 == 8 && (field305 == var13.field936 || field226 == var13.field936 || field477 == var13.field936) && field369 == 100) {
							int var59 = 0;
							int var60 = 0;
							ONSICLVF var61 = field460;
							String var62 = var13.field907;
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

								int var65 = var61.method362(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1040 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field917 + var11 - var59 - 5;
							int var67 = var13.field893 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg0.field917 + arg2) {
								var66 = arg0.field917 + arg2 - var59;
							}

							if (var60 + var67 > arg0.field893 + arg3) {
								var67 = arg0.field893 + arg3 - var60;
							}

							DEVPLWNC.method164(0xFFFFA0, var60, var66, var59, var67);
							DEVPLWNC.method165(0, var66, var67, var60, var59);
							String var68 = var13.field907;
							int var69 = var61.field1040 + var67 + 2;
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

								var61.method368(0, false, var71, var66 + 3, var69);
								var69 += var61.field1040 + 1;
							}
						}
					}
				}
			}

			DEVPLWNC.method161(var7, var5, var8, var6);
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method66(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field355; var3++) {
				if (field443[var3] == arg0) {
					field355--;
					field370 = true;

					for (int var4 = var3; var4 < field355; var4++) {
						field444[var4] = field444[var4 + 1];
						field105[var4] = field105[var4 + 1];
						field443[var4] = field443[var4 + 1];
					}

					field360.method450(183);
					field360.method457(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method67(int arg0, int arg1) {
		ETMNPRAF var3 = field148[field280][arg0][arg1];
		if (var3 == null) {
			field67.method210(field280, arg0, arg1);
		} else {
			int var4 = -99999999;
			WEHUNTCT var5 = null;
			for (WEHUNTCT var6 = (WEHUNTCT) var3.method181(); var6 != null; var6 = (WEHUNTCT) var3.method183()) {
				VIWDEJKN var7 = VIWDEJKN.method544(var6.field1413);
				int var8 = var7.field1300;
				if (var7.field1324) {
					var8 = (var6.field1414 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method179(var5);
			WEHUNTCT var9 = null;
			WEHUNTCT var10 = null;
			for (WEHUNTCT var11 = (WEHUNTCT) var3.method181(); var11 != null; var11 = (WEHUNTCT) var3.method183()) {
				if (var5.field1413 != var11.field1413 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1413 != var11.field1413 && var9.field1413 != var11.field1413 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field67.method196(var10, var5, arg1, field280, arg0, method97(arg0 * 128 + 64, arg1 * 128 + 64, field280), var12, var9);
		}
	}

	@ObfuscatedName("client.a(IIIILjava/lang/String;Ljava/lang/String;)LWEMOPWVJ;")
	public final WEMOPWVJ method68(int arg0, int arg1, int arg2, String arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field300[0] != null) {
				var6 = field300[0].method582(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field106.reset();
			field106.update(var6);
			int var8 = (int) field106.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new WEMOPWVJ(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method141(arg0, "Requesting " + arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method19(arg3 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				SVWJKJVI var16 = new SVWJKJVI(var15);
				var16.field1263 = 3;
				int var17 = var16.method465() + 6;
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
						method141(arg0, "Loading " + arg4 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field300[0] != null) {
						field300[0].method583(arg1, var6.length, var6);
					}
				} catch (Exception var28) {
					field300[0] = null;
				}

				if (var6 != null) {
					field106.reset();
					field106.update(var6);
					int var23 = (int) field106.getValue();
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
						method141(arg0, "Game updated - please reload page");
						var25 = 10;
					} else {
						method141(arg0, var11 + " - Retrying in " + var25);
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

				field170 = !field170;
			}
		}

		return new WEMOPWVJ(var6);
	}

	@ObfuscatedName("client.q(I)V")
	public final void method69() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field180[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field180[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field181[var10] = (field180[var10 - 1] + field180[var10 + 1] + field180[var10 - 128] + field180[var10 + 128]) / 4;
			}
		}

		field470 += 128;
		if (field470 > field164.length) {
			field470 -= field164.length;
			int var11 = (int) (Math.random() * 12.0D);
			method23(field296[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field181[var14 + 128] - field164[field470 + var14 & field164.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field180[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field451[var16] = field451[var16 + 1];
		}

		field451[var1 - 1] = (int) (Math.sin(field316 / 14.0D) * 16.0D + Math.sin(field316 / 15.0D) * 14.0D + Math.sin(field316 / 16.0D) * 12.0D);

		if (field278 > 0) {
			field278 -= 4;
		}

		if (field279 > 0) {
			field279 -= 4;
		}

		if (field278 == 0 && field279 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field278 = 1024;
			}

			if (var17 == 1) {
				field279 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(BLNNWGJIGN;I)V")
	public final void method70(NNWGJIGN arg0, int arg1) {
		method71(arg0.field973, arg1, arg0.field972);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method71(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method97(arg2, arg0, field280) - arg1;
			arg2 -= field220;
			var4 -= field221;
			arg0 -= field222;
			int var5 = IYSWJGDE.field782[field223];
			int var6 = IYSWJGDE.field783[field223];
			int var7 = IYSWJGDE.field782[field224];
			int var8 = IYSWJGDE.field783[field224];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field397 = (var9 << 9) / arg0 + QRNWMOSL.field1174;
				field398 = (var11 << 9) / arg0 + QRNWMOSL.field1175;
			} else {
				field397 = -1;
				field398 = -1;
			}
		} else {
			field397 = -1;
			field398 = -1;
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method72() {
		field303 = new ZXDQRRNS(field298, "titlebox", 0);
		field304 = new ZXDQRRNS(field298, "titlebutton", 0);
		field296 = new ZXDQRRNS[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field296[var1] = new ZXDQRRNS(field298, "runes", var1);
		}

		field197 = new OMAKLDKI(128, 265);
		field198 = new OMAKLDKI(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field197.field1027[var2] = field210.field818[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field198.field1027[var3] = field211.field818[var3];
		}

		field408 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field408[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field408[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field408[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field408[var7 + 192] = 0xFFFFFF;
		}

		field409 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field409[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field409[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field409[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field409[var11 + 192] = 0xFFFFFF;
		}

		field410 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field410[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field410[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field410[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field410[var15 + 192] = 0xFFFFFF;
		}

		field407 = new int[256];
		field164 = new int[32768];
		field165 = new int[32768];
		method23(null);
		field180 = new int[32768];
		field181 = new int[32768];
		method141(10, "Connecting to fileserver");

		if (!field84) {
			field420 = true;
			field84 = true;
			method87(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method73(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method74() {
		for (int var1 = 0; var1 < field195; var1++) {
			if (field320[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field256[var1] != field484 || field375[var1] != field366) {
						SVWJKJVI var3 = JRSHCCMF.method309(field256[var1], field375[var1]);
						if (System.currentTimeMillis() + var3.field1263 / 22 > field372 / 22 + field173) {
							field372 = var3.field1263;
							field173 = System.currentTimeMillis();

							if (method35(var3.field1263, var3.field1262)) {
								field484 = field256[var1];
								field366 = field375[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method58()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field360.method450(252);
						field360.method452(field256[var1] & 0x7FFF);
					} else {
						field360.method450(252);
						field360.method452(-1);
					}
				}

				if (var2 && field320[var1] != -5) {
					field320[var1] = -5;
				} else {
					field195--;
					for (int var5 = var1; var5 < field195; var5++) {
						field256[var5] = field256[var5 + 1];
						field375[var5] = field375[var5 + 1];
						field320[var5] = field320[var5 + 1];
					}

					var1--;
				}
			} else {
				field320[var1]--;
			}
		}

		if (field302 > 0) {
			field302 -= 20;
			if (field302 < 0) {
				field302 = 0;
			}

			if (field302 == 0 && field143 && !field458) {
				field395 = field340;
				field396 = true;
				field480.method245(2, field395);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LSVWJKJVI;ZI)V")
	public final void method75(SVWJKJVI arg0, int arg1) {
		for (int var3 = 0; var3 < field434; var3++) {
			int var4 = field435[var3];
			KVXZMJHR var5 = field431[var4];
			int var6 = arg0.method461();
			if ((var6 & 0x10) != 0) {
				var6 += arg0.method461() << 8;
			}

			method36(var4, arg0, var5, var6);
		}
	}

	@ObfuscatedName("client.c(BI)V")
	public final void method76(int arg0) {
		int[] var2 = field389.field1027;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field230[arg0][var7][var5] & 0x18) == 0) {
					field67.method224(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field230[arg0 + 1][var7][var5] & 0x8) != 0) {
					field67.method224(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field389.method346();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field230[arg0][var11][var10] & 0x18) == 0) {
					method25(var10, arg0, var8, var9, var11);
				}

				if (arg0 < 3 && (field230[arg0 + 1][var11][var10] & 0x8) != 0) {
					method25(var10, arg0 + 1, var8, var9, var11);
				}
			}
		}

		if (field491 != null) {
			field491.method316();
			QRNWMOSL.field1180 = field168;
		}

		field421 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field67.method218(field280, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = PXRGLLGB.method417(var14).field1167;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field373[field280].field1055;
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

						field206[field421] = field341[var15];
						field422[field421] = var16;
						field423[field421] = var17;
						field421++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method77() {
		if (field347 || field172 || field159) {
			method54();
		} else {
			field454++;

			if (field323) {
				method110();
			} else {
				method101(false);
			}

			field394 = 0;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method78() {
		if (field1374 == null) {
			method144();
			field207 = null;
			field208 = null;
			field209 = null;
			field210 = null;
			field211 = null;
			field212 = null;
			field213 = null;
			field214 = null;
			field215 = null;
			field492 = null;
			field490 = null;
			field489 = null;
			field491 = null;
			field440 = null;
			field441 = null;
			field442 = null;
			field1374 = new KJGJRATW(method82(), 765, 503);
			field364 = true;
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method79() {
		if (!field347 && !field172 && !field159) {
			field316++;

			if (field323) {
				method119();
			} else {
				method100();
			}

			method121();
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method80(boolean arg0) {
		for (int var2 = 0; var2 < field176; var2++) {
			PEHNWFXK var3 = field175[field177[var2]];
			int var4 = (field177[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method325() && var3.field1056.field1101 == arg0 && var3.field1056.method394()) {
				int var5 = var3.field972 >> 7;
				int var6 = var3.field973 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field991 == 1 && (var3.field972 & 0x7F) == 0x40 && (var3.field973 & 0x7F) == 0x40) {
						if (field400[var5][var6] == field359) {
							continue;
						}

						field400[var5][var6] = field359;
					}

					if (!var3.field1056.field1070) {
						var4 += Integer.MIN_VALUE;
					}

					field67.method200(method97(var3.field972, var3.field973, field280), var3.field973, field280, var3, var3.field987, var3.field974, var4, (var3.field991 - 1) * 64 + 60, var3.field972);
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public void method81() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field91);

		if (field480 != null) {
			System.out.println("Od-cycle:" + field480.field679);
		}

		System.out.println("loop-cycle:" + field316);
		System.out.println("draw-cycle:" + field454);
		System.out.println("ptype:" + field335);
		System.out.println("psize:" + field334);

		if (field63 != null) {
			field63.method412();
		}

		field1370 = true;
	}

	@ObfuscatedName("client.c(I)Ljava/awt/Component;")
	public final Component method82() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1376 != null) {
			return field1376;
		}

		return this;
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public static final String method83(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method84() {
		if (field291 == 0) {
			field401[0] = "Cancel";
			field241[0] = 1467;
			field399 = 1;
			if (field393 == -1) {
				method118();
				field130 = 0;
				field392 = 0;

				if (field1381 > 4 && field1382 > 4 && field1381 < 516 && field1382 < 338) {
					if (field301 == -1) {
						method51();
					} else {
						method42(field1381, 0, field1382, NHFASBOX.method339(field301), 4, 0, 4);
					}
				}

				if (field294 != field130) {
					field294 = field130;
				}

				if (field477 != field392) {
					field477 = field392;
				}

				field130 = 0;
				field392 = 0;

				if (field1381 > 553 && field1382 > 205 && field1381 < 743 && field1382 < 466) {
					if (field245 != -1) {
						method42(field1381, 0, field1382, NHFASBOX.method339(field245), 205, 1, 553);
					} else if (field485[field486] != -1) {
						method42(field1381, 0, field1382, NHFASBOX.method339(field485[field486]), 205, 1, 553);
					}
				}

				if (field194 != field130) {
					field370 = true;
					field194 = field130;
				}

				if (field392 != field226) {
					field370 = true;
					field226 = field392;
				}

				field130 = 0;
				field392 = 0;

				if (field1381 > 17 && field1382 > 357 && field1381 < 496 && field1382 < 453) {
					if (field196 != -1) {
						method42(field1381, 0, field1382, NHFASBOX.method339(field196), 357, 2, 17);
					} else if (field365 != -1) {
						method42(field1381, 0, field1382, NHFASBOX.method339(field365), 357, 3, 17);
					} else if (field1382 < 434 && field1381 < 426 && field379 == 0) {
						method157(field1382 - 357, field1381 - 17);
					}
				}

				if ((field196 != -1 || field365 != -1) && field65 != field130) {
					field428 = true;
					field65 = field130;
				}

				if ((field196 != -1 || field365 != -1) && field392 != field305) {
					field428 = true;
					field305 = field392;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field399 - 1; var2++) {
						if (field241[var2] < 1000 && field241[var2 + 1] > 1000) {
							String var3 = field401[var2];
							field401[var2] = field401[var2 + 1];
							field401[var2 + 1] = var3;
							int var4 = field241[var2];
							field241[var2] = field241[var2 + 1];
							field241[var2 + 1] = var4;
							int var5 = field239[var2];
							field239[var2] = field239[var2 + 1];
							field239[var2 + 1] = var5;
							int var6 = field240[var2];
							field240[var2] = field240[var2 + 1];
							field240[var2 + 1] = var6;
							int var7 = field242[var2];
							field242[var2] = field242[var2 + 1];
							field242[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field130 = 0;
				field392 = 0;
				method42(field1381, 0, field1382, NHFASBOX.method339(field393), 0, 0, 0);

				if (field294 != field130) {
					field294 = field130;
				}

				if (field477 != field392) {
					field477 = field392;
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method85() {
		try {
			int var1 = field133.field972 + field251;
			int var2 = field133.field973 + field199;
			if (field268 - var1 < -500 || field268 - var1 > 500 || field269 - var2 < -500 || field269 - var2 > 500) {
				field268 = var1;
				field269 = var2;
			}

			if (field268 != var1) {
				field268 += (var1 - field268) / 16;
			}

			if (field269 != var2) {
				field269 += (var2 - field269) / 16;
			}

			if (field1391[1] == 1) {
				field259 += (-field259 - 24) / 2;
			} else if (field1391[2] == 1) {
				field259 += (24 - field259) / 2;
			} else {
				field259 /= 2;
			}

			if (field1391[3] == 1) {
				field260 += (12 - field260) / 2;
			} else if (field1391[4] == 1) {
				field260 += (-field260 - 12) / 2;
			} else {
				field260 /= 2;
			}

			field258 = field259 / 2 + field258 & 0x7FF;
			field257 += field260 / 2;
			if (field257 < 128) {
				field257 = 128;
			}

			if (field257 > 383) {
				field257 = 383;
			}

			int var3 = field268 >> 7;
			int var4 = field269 >> 7;
			int var5 = method97(field268, field269, field280);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field280;
						if (var9 < 3 && (field230[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field377[var9][var7][var8];
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

			if (var11 > field265) {
				field265 += (var11 - field265) / 24;
			} else if (var11 < field265) {
				field265 += (var11 - field265) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field133.field972 + "," + field133.field973 + "," + field268 + "," + field269 + "," + field127 + "," + field128 + "," + field85 + "," + field86);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method86() {
		for (int var1 = -1; var1 < field432; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field430;
			} else {
				var2 = field433[var1];
			}

			KVXZMJHR var3 = field431[var2];
			if (var3 != null) {
				method104(1, var3);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method87(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method87(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.c(LSVWJKJVI;IB)V")
	public final void method88(SVWJKJVI arg0, int arg1) {
		int var3 = arg0.method472(8);
		if (var3 < field432) {
			for (int var4 = var3; var4 < field432; var4++) {
				field274[field273++] = field433[var4];
			}
		}

		if (var3 > field432) {
			signlink.reporterror(field344 + " Too many players");
			throw new RuntimeException("eek");
		}

		field432 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field433[var5];
			KVXZMJHR var7 = field431[var6];
			int var8 = arg0.method472(1);
			if (var8 == 0) {
				field433[field432++] = var6;
				var7.field1000 = field316;
			} else {
				int var9 = arg0.method472(2);
				if (var9 == 0) {
					field433[field432++] = var6;
					var7.field1000 = field316;
					field435[field434++] = var6;
				} else if (var9 == 1) {
					field433[field432++] = var6;
					var7.field1000 = field316;
					int var10 = arg0.method472(3);
					var7.method343(var10, false);
					int var11 = arg0.method472(1);
					if (var11 == 1) {
						field435[field434++] = var6;
					}
				} else if (var9 == 2) {
					field433[field432++] = var6;
					var7.field1000 = field316;
					int var12 = arg0.method472(3);
					var7.method343(var12, true);
					int var13 = arg0.method472(3);
					var7.method343(var13, true);
					int var14 = arg0.method472(1);
					if (var14 == 1) {
						field435[field434++] = var6;
					}
				} else if (var9 == 3) {
					field274[field273++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method89() {
		int var1 = 5;
		field374[8] = 0;
		int var2 = 0;
		while (field374[8] == 0) {
			String var3 = "Unknown problem";
			method141(20, "Connecting to web server");

			try {
				DataInputStream var4 = method19("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 362);
				SVWJKJVI var5 = new SVWJKJVI(new byte[40]);
				var4.readFully(var5.field1262, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field374[var6] = var5.method466();
				}

				int var7 = var5.method466();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field374[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field374[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field374[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field374[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field374[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field374[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method141(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method141(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field170 = !field170;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method90() {
		if (field189 == 0 && field1387 == 1) {
			int var1 = field1388 - 25 - 550;
			int var2 = field1389 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field258 + field246 & 0x7FF;
				int var4 = QRNWMOSL.field1178[var3];
				int var5 = QRNWMOSL.field1179[var3];
				var4 = (field140 + 256) * var4 >> 8;
				var5 = (field140 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field133.field972 + var6 >> 7;
				int var9 = field133.field973 - var7 >> 7;
				boolean var10 = method92(0, 0, 0, 0, field133.field1017[0], 1, true, field133.field1018[0], 0, var9, var8);
				if (var10) {
					field360.method451(var1);
					field360.method451(var2);
					field360.method452(field258);
					field360.method451(57);
					field360.method451(field246);
					field360.method451(field140);
					field360.method451(89);
					field360.method452(field133.field972);
					field360.method452(field133.field973);
					field360.method451(field381);
					field360.method451(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILOMAKLDKI;IB)V")
	public final void method91(int arg0, OMAKLDKI arg1, int arg2) {
		int var4 = field258 + field246 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = IYSWJGDE.field782[var4];
			int var7 = IYSWJGDE.field783[var4];
			var6 = var6 * 256 / (field140 + 256);
			var7 = var7 * 256 / (field140 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method357(83 - var9 - arg1.field1033 / 2 - 4, var8 + 94 - arg1.field1032 / 2 + 4, field108);
			} else {
				arg1.method351(83 - var9 - arg1.field1033 / 2 - 4, var8 + 94 - arg1.field1032 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIZIIII)Z")
	public final boolean method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field253[var14][var15] = 0;
				field266[var14][var15] = 99999999;
			}
		}

		int var16 = arg4;
		int var17 = arg7;
		field253[arg4][arg7] = 99;
		field266[arg4][arg7] = 0;
		byte var18 = 0;
		int var19 = 0;
		field306[var18] = arg4;
		int var39 = var18 + 1;
		field307[var18] = arg7;
		boolean var20 = false;
		int var21 = field306.length;
		int[][] var22 = field373[field280].field1055;
		while (var39 != var19) {
			var16 = field306[var19];
			var17 = field307[var19];
			var19 = (var19 + 1) % var21;

			if (arg10 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && field373[field280].method389(var16, arg9, arg0, arg10, var17, arg3 - 1)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && field373[field280].method390(arg3 - 1, arg9, arg10, var17, arg0, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg8 != 0 && arg1 != 0 && field373[field280].method391(arg10, arg2, arg9, arg8, var17, arg1, var16)) {
				var20 = true;
				break;
			}

			int var23 = field266[var16][var17] + 1;
			if (var16 > 0 && field253[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field306[var39] = var16 - 1;
				field307[var39] = var17;
				var39 = (var39 + 1) % var21;
				field253[var16 - 1][var17] = 2;
				field266[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field253[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field306[var39] = var16 + 1;
				field307[var39] = var17;
				var39 = (var39 + 1) % var21;
				field253[var16 + 1][var17] = 8;
				field266[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field253[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field306[var39] = var16;
				field307[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field253[var16][var17 - 1] = 1;
				field266[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field253[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field306[var39] = var16;
				field307[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field253[var16][var17 + 1] = 4;
				field266[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field253[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field306[var39] = var16 - 1;
				field307[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field253[var16 - 1][var17 - 1] = 3;
				field266[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field253[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field306[var39] = var16 + 1;
				field307[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field253[var16 + 1][var17 - 1] = 9;
				field266[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field253[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field306[var39] = var16 - 1;
				field307[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field253[var16 - 1][var17 + 1] = 6;
				field266[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field253[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field306[var39] = var16 + 1;
				field307[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field253[var16 + 1][var17 + 1] = 12;
				field266[var16 + 1][var17 + 1] = var23;
			}
		}

		field381 = 0;
		if (!var20) {
			if (!arg6) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg10 - var26; var27 <= arg10 + var26; var27++) {
				for (int var28 = arg9 - var26; var28 <= arg9 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field266[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg10) {
							var29 = arg10 - var27;
						} else if (var27 > arg8 + arg10 - 1) {
							var29 = var27 + 1 - arg8 - arg10;
						}

						int var30 = 0;
						if (var28 < arg9) {
							var30 = arg9 - var28;
						} else if (var28 > arg1 + arg9 - 1) {
							var30 = var28 + 1 - arg1 - arg9;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field266[var27][var28] < var25) {
							var24 = var31;
							var25 = field266[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg4 == var16 && arg7 == var17) {
				return false;
			}

			field381 = 1;
		}

		byte var32 = 0;
		field306[var32] = var16;
		int var40 = var32 + 1;
		field307[var32] = var17;
		int var33;
		int var34 = var33 = field253[var16][var17];
		while (arg4 != var16 || arg7 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field306[var40] = var16;
				field307[var40++] = var17;
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

			var34 = field253[var16][var17];
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
		int var36 = field306[var40];
		int var37 = field307[var40];
		field136++;
		if (field136 >= 85) {
			field360.method450(173);
			field360.method451(150);
			field136 = 0;
		}

		if (arg5 == 0) {
			field360.method450(169);
			field360.method451(var35 + var35 + 3);
		}

		if (arg5 == 1) {
			field360.method450(77);
			field360.method451(var35 + var35 + 3 + 14);
		}

		if (arg5 == 2) {
			field360.method450(35);
			field360.method451(var35 + var35 + 3);
		}

		field360.method452(field85 + var36);
		field360.method486(field86 + var37);
		field360.method477(field1391[5] == 1 ? 1 : 0);
		field387 = field306[0];
		field388 = field307[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field360.method478(field306[var40] - var36);
			field360.method451(field307[var40] - var37);
		}

		return true;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method93() {
		for (AAKFEJZP var1 = (AAKFEJZP) field135.method181(); var1 != null; var1 = (AAKFEJZP) field135.method183()) {
			if (field280 != var1.field1 || field316 > var1.field9) {
				var1.method331();
			} else if (field316 >= var1.field8) {
				if (var1.field18 > 0) {
					PEHNWFXK var2 = field175[var1.field18 - 1];
					if (var2 != null && var2.field972 >= 0 && var2.field972 < 13312 && var2.field973 >= 0 && var2.field973 < 13312) {
						var1.method3(var2.field972, var2.field973, method97(var2.field972, var2.field973, var1.field1) - var1.field7, field316);
					}
				}

				if (var1.field18 < 0) {
					int var3 = -var1.field18 - 1;
					KVXZMJHR var4;
					if (field438 == var3) {
						var4 = field133;
					} else {
						var4 = field431[var3];
					}

					if (var4 != null && var4.field972 >= 0 && var4.field972 < 13312 && var4.field973 >= 0 && var4.field973 < 13312) {
						var1.method3(var4.field972, var4.field973, method97(var4.field972, var4.field973, var1.field1) - var1.field7, field316);
					}
				}

				var1.method1(field297);
				field67.method200((int) var1.field13, (int) var1.field12, field280, var1, false, var1.field2, -1, 60, (int) var1.field11);
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method94() {
		field368 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field255[var1] = -1;
			for (int var2 = 0; var2 < UGUHDANY.field1285; var2++) {
				if (!UGUHDANY.field1286[var2].field1292 && UGUHDANY.field1286[var2].field1287 == var1 + (field146 ? 0 : 7)) {
					field255[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method95() {
		PXRGLLGB.field1135.method177();
		PXRGLLGB.field1146.method177();
		PIPBZEOV.field1099.method177();
		VIWDEJKN.field1337.method177();
		VIWDEJKN.field1314.method177();
		KVXZMJHR.field857.method177();
		RTDMFIDA.field1213.method177();
	}

	@ObfuscatedName("client.y(I)Ljava/lang/String;")
	public final String method96() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1376 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method97(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field230[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field377[var6][var4][var5] + field377[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field377[var6][var4][var5 + 1] + field377[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(LSVWJKJVI;II)V")
	public final void method98(SVWJKJVI arg0, int arg1) {
		for (int var3 = 0; var3 < field434; var3++) {
			int var4 = field435[var3];
			PEHNWFXK var5 = field175[var4];
			int var6 = arg0.method461();
			if ((var6 & 0x20) != 0) {
				var5.field994 = arg0.method488();
				if (var5.field994 == 0xFFFF) {
					var5.field994 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				int var7 = arg0.method488();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg0.method481();
				if (var5.field1009 == var7 && var7 != -1) {
					int var9 = KMWMLVIH.field825[var7].field839;
					if (var9 == 1) {
						var5.field1010 = 0;
						var5.field1011 = 0;
						var5.field1012 = var8;
						var5.field1013 = 0;
					}

					if (var9 == 2) {
						var5.field1013 = 0;
					}
				} else if (var7 == -1 || var5.field1009 == -1 || KMWMLVIH.field825[var7].field833 >= KMWMLVIH.field825[var5.field1009].field833) {
					var5.field1009 = var7;
					var5.field1010 = 0;
					var5.field1011 = 0;
					var5.field1012 = var8;
					var5.field1013 = 0;
					var5.field1014 = var5.field993;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var10 = arg0.method480();
				int var11 = arg0.method479();
				var5.method342(var11, field316, var10);
				var5.field982 = field316 + 300;
				var5.field983 = arg0.method480();
				var5.field984 = arg0.method481();
			}

			if ((var6 & 0x4) != 0) {
				int var12 = arg0.method480();
				int var13 = arg0.method479();
				var5.method342(var13, field316, var12);
				var5.field982 = field316 + 300;
				var5.field983 = arg0.method479();
				var5.field984 = arg0.method461();
			}

			if ((var6 & 0x10) != 0) {
				var5.field995 = arg0.method489();
				int var14 = arg0.method466();
				var5.field999 = var14 >> 16;
				var5.field998 = (var14 & 0xFFFF) + field316;
				var5.field996 = 0;
				var5.field997 = 0;

				if (var5.field998 > field316) {
					var5.field996 = -1;
				}

				if (var5.field995 == 0xFFFF) {
					var5.field995 = -1;
				}
			}

			if ((var6 & 0x40) != 0) {
				var5.field986 = arg0.method468();
				var5.field1004 = 100;
			}

			if ((var6 & 0x80) != 0) {
				var5.field969 = arg0.method490();
				var5.field970 = arg0.method488();
			}

			if ((var6 & 0x8) != 0) {
				var5.field1056 = PIPBZEOV.method398(arg0.method489());
				var5.field991 = var5.field1056.field1095;
				var5.field992 = var5.field1056.field1102;
				var5.field1005 = var5.field1056.field1076;
				var5.field1006 = var5.field1056.field1098;
				var5.field1007 = var5.field1056.field1100;
				var5.field1008 = var5.field1056.field1069;
				var5.field967 = var5.field1056.field1075;
			}
		}
	}

	@ObfuscatedName("client.d(III)Z")
	public final boolean method99(int arg0, int arg1) {
		boolean var3 = false;
		NHFASBOX var4 = NHFASBOX.method339(arg0);
		for (int var5 = 0; var5 < var4.field960.length && var4.field960[var5] != -1; var5++) {
			NHFASBOX var6 = NHFASBOX.method339(var4.field960[var5]);
			if (var6.field914 == 0) {
				var3 |= method99(var6.field936, arg1);
			}

			if (var6.field914 == 6 && (var6.field948 != -1 || var6.field949 != -1)) {
				boolean var7 = method137(var6);
				int var8;
				if (var7) {
					var8 = var6.field949;
				} else {
					var8 = var6.field948;
				}

				if (var8 != -1) {
					KMWMLVIH var9 = KMWMLVIH.field825[var8];
					var6.field959 += arg1;
					while (var6.field959 > var9.method320(var6.field950)) {
						var6.field959 -= var9.method320(var6.field950) + 1;
						var6.field950++;
						if (var6.field950 >= var9.field826) {
							var6.field950 -= var9.field830;
							if (var6.field950 < 0 || var6.field950 >= var9.field826) {
								var6.field950 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field914 == 6 && var6.field962 != 0) {
				int var10 = var6.field962 >> 16;
				int var11 = var6.field962 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field912 = var6.field912 + var10 & 0x7FF;
				var6.field913 = var6.field913 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method100() {
		if (field244 == 0) {
			int var1 = field1371 / 2 - 80;
			int var2 = field1372 / 2 + 20;
			var2 += 20;
			if (field1387 == 1 && field1388 >= var1 - 75 && field1388 <= var1 + 75 && field1389 >= var2 - 20 && field1389 <= var2 + 20) {
				field244 = 3;
				field98 = 0;
			}

			int var3 = field1371 / 2 + 80;
			if (field1387 == 1 && field1388 >= var3 - 75 && field1388 <= var3 + 75 && field1389 >= var2 - 20 && field1389 <= var2 + 20) {
				field228 = "";
				field229 = "Enter your username & password.";
				field244 = 2;
				field98 = 0;
			}
		} else if (field244 == 2) {
			int var4 = field1372 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1387 == 1 && field1389 >= var4 - 15 && field1389 < var4) {
				field98 = 0;
			}

			var4 += 15;
			if (field1387 == 1 && field1389 >= var4 - 15 && field1389 < var4) {
				field98 = 1;
			}

			var4 += 15;
			int var5 = field1371 / 2 - 80;
			int var6 = field1372 / 2 + 50;
			var6 += 20;
			if (field1387 == 1 && field1388 >= var5 - 75 && field1388 <= var5 + 75 && field1389 >= var6 - 20 && field1389 <= var6 + 20) {
				field481 = 0;
				method158(field344, field345, false);

				if (field323) {
					return;
				}
			}

			int var7 = field1371 / 2 + 80;
			if (field1387 == 1 && field1388 >= var7 - 75 && field1388 <= var7 + 75 && field1389 >= var6 - 20 && field1389 <= var6 + 20) {
				field244 = 0;
				field344 = "";
				field345 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method557();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field157.length(); var10++) {
					if (var8 == field157.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field98 == 0) {
					if (var8 == 8 && field344.length() > 0) {
						field344 = field344.substring(0, field344.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field98 = 1;
					}

					if (var9) {
						field344 = field344 + (char) var8;
					}

					if (field344.length() > 12) {
						field344 = field344.substring(0, 12);
					}
				} else if (field98 == 1) {
					if (var8 == 8 && field345.length() > 0) {
						field345 = field345.substring(0, field345.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field98 = 0;
					}

					if (var9) {
						field345 = field345 + (char) var8;
					}

					if (field345.length() > 20) {
						field345 = field345.substring(0, 20);
					}
				}
			}
		} else if (field244 == 3) {
			int var11 = field1371 / 2;
			int var12 = field1372 / 2 + 50;
			var12 += 20;
			if (field1387 == 1 && field1388 >= var11 - 75 && field1388 <= var11 + 75 && field1389 >= var12 - 20 && field1389 <= var12 + 20) {
				field244 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method101(boolean arg0) {
		method47();
		field209.method316();
		field303.method599(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field244 == 0) {
			int var4 = var3 / 2 + 80;
			field459.method361(var2 / 2, var4, field480.field691, true, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field461.method361(var2 / 2, var5, "Welcome to RuneScape", true, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field304.method599(var7 - 20, var6 - 73);
			field461.method361(var6, var7 + 5, "New User", true, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field304.method599(var7 - 20, var8 - 73);
			field461.method361(var8, var7 + 5, "Existing User", true, 0xFFFFFF);
		}

		if (field244 == 2) {
			int var9 = var3 / 2 - 40;
			if (field228.length() > 0) {
				field461.method361(var2 / 2, var9 - 15, field228, true, 0xFFFF00);
				field461.method361(var2 / 2, var9, field229, true, 0xFFFF00);
				var9 += 30;
			} else {
				field461.method361(var2 / 2, var9 - 7, field229, true, 0xFFFF00);
				var9 += 30;
			}

			field461.method368(0xFFFFFF, true, "Username: " + field344 + (field98 == 0 & field316 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 90, var9);
			var9 += 15;
			field461.method368(0xFFFFFF, true, "Password: " + ASZHZJYZ.method10(field345) + (field98 == 1 & field316 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 88, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field304.method599(var11 - 20, var10 - 73);
				field461.method361(var10, var11 + 5, "Login", true, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field304.method599(var11 - 20, var12 - 73);
				field461.method361(var12, var11 + 5, "Cancel", true, 0xFFFFFF);
			}
		}

		if (field244 == 3) {
			field461.method361(var2 / 2, var3 / 2 - 60, "Create a free account", true, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field461.method361(var2 / 2, var13, "To create a new account you need to", true, 0xFFFFFF);
			var13 += 15;
			field461.method361(var2 / 2, var13, "go back to the main RuneScape webpage", true, 0xFFFFFF);
			var13 += 15;
			field461.method361(var2 / 2, var13, "and choose the 'create account'", true, 0xFFFFFF);
			var13 += 15;
			field461.method361(var2 / 2, var13, "button near the top of that page.", true, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field304.method599(var15 - 20, var14 - 73);
			field461.method361(var14, var15 + 5, "Cancel", true, 0xFFFFFF);
		}

		field209.method317(171, 202, field1373);

		if (field364) {
			field364 = false;
			field207.method317(0, 128, field1373);
			field208.method317(371, 202, field1373);
			field212.method317(265, 0, field1373);
			field213.method317(265, 562, field1373);
			field214.method317(171, 128, field1373);
			field215.method317(171, 562, field1373);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method102() {
		for (PEKVALKR var1 = (PEKVALKR) field479.method181(); var1 != null; var1 = (PEKVALKR) field479.method183()) {
			if (field280 != var1.field1061 || var1.field1065) {
				var1.method331();
			} else if (field316 >= var1.field1057) {
				var1.method393(field297);

				if (var1.field1065) {
					var1.method331();
				} else {
					field67.method200(var1.field1064, var1.field1063, var1.field1061, var1, false, 0, -1, 60, var1.field1062);
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method103() {
		for (int var1 = 0; var1 < field176; var1++) {
			int var2 = field177[var1];
			PEHNWFXK var3 = field175[var2];
			if (var3 != null) {
				method104(var3.field1056.field1095, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILNNWGJIGN;I)V")
	public final void method104(int arg0, NNWGJIGN arg1) {
		if (arg1.field972 < 128 || arg1.field973 < 128 || arg1.field972 >= 13184 || arg1.field973 >= 13184) {
			arg1.field1009 = -1;
			arg1.field995 = -1;
			arg1.field979 = 0;
			arg1.field980 = 0;
			arg1.field972 = arg1.field1017[0] * 128 + arg1.field991 * 64;
			arg1.field973 = arg1.field1018[0] * 128 + arg1.field991 * 64;
			arg1.method345();
		}

		if (field133 == arg1 && (arg1.field972 < 1536 || arg1.field973 < 1536 || arg1.field972 >= 11776 || arg1.field973 >= 11776)) {
			arg1.field1009 = -1;
			arg1.field995 = -1;
			arg1.field979 = 0;
			arg1.field980 = 0;
			arg1.field972 = arg1.field1017[0] * 128 + arg1.field991 * 64;
			arg1.field973 = arg1.field1018[0] * 128 + arg1.field991 * 64;
			arg1.method345();
		}

		if (arg1.field979 > field316) {
			method105(arg1);
		} else if (arg1.field980 >= field316) {
			method106(arg1);
		} else {
			method107(arg1);
		}

		method108(arg1);
		method109(arg1);
	}

	@ObfuscatedName("client.a(LNNWGJIGN;I)V")
	public final void method105(NNWGJIGN arg0) {
		int var2 = arg0.field979 - field316;
		int var3 = arg0.field991 * 64 + arg0.field975 * 128;
		int var4 = arg0.field991 * 64 + arg0.field977 * 128;
		arg0.field972 += (var3 - arg0.field972) / var2;
		arg0.field973 += (var4 - arg0.field973) / var2;
		arg0.field1015 = 0;

		if (arg0.field981 == 0) {
			arg0.field964 = 1024;
		}

		if (arg0.field981 == 1) {
			arg0.field964 = 1536;
		}

		if (arg0.field981 == 2) {
			arg0.field964 = 0;
		}

		if (arg0.field981 == 3) {
			arg0.field964 = 512;
		}
	}

	@ObfuscatedName("client.a(LNNWGJIGN;B)V")
	public final void method106(NNWGJIGN arg0) {
		if (field316 == arg0.field980 || arg0.field1009 == -1 || arg0.field1012 != 0 || arg0.field1011 + 1 > KMWMLVIH.field825[arg0.field1009].method320(arg0.field1010)) {
			int var2 = arg0.field980 - arg0.field979;
			int var3 = field316 - arg0.field979;
			int var4 = arg0.field991 * 64 + arg0.field975 * 128;
			int var5 = arg0.field991 * 64 + arg0.field977 * 128;
			int var6 = arg0.field991 * 64 + arg0.field976 * 128;
			int var7 = arg0.field991 * 64 + arg0.field978 * 128;
			arg0.field972 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field973 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1015 = 0;

		if (arg0.field981 == 0) {
			arg0.field964 = 1024;
		}

		if (arg0.field981 == 1) {
			arg0.field964 = 1536;
		}

		if (arg0.field981 == 2) {
			arg0.field964 = 0;
		}

		if (arg0.field981 == 3) {
			arg0.field964 = 512;
		}

		arg0.field974 = arg0.field964;
	}

	@ObfuscatedName("client.a(ILNNWGJIGN;)V")
	public final void method107(NNWGJIGN arg0) {
		arg0.field988 = arg0.field967;
		if (arg0.field993 == 0) {
			arg0.field1015 = 0;
		} else {
			if (arg0.field1009 != -1 && arg0.field1012 == 0) {
				KMWMLVIH var2 = KMWMLVIH.field825[arg0.field1009];
				if (arg0.field1014 > 0 && var2.field837 == 0) {
					arg0.field1015++;
					return;
				}

				if (arg0.field1014 <= 0 && var2.field838 == 0) {
					arg0.field1015++;
					return;
				}
			}

			int var3 = arg0.field972;
			int var4 = arg0.field973;
			int var5 = arg0.field1017[arg0.field993 - 1] * 128 + arg0.field991 * 64;
			int var6 = arg0.field1018[arg0.field993 - 1] * 128 + arg0.field991 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field964 = 1280;
					} else if (var4 > var6) {
						arg0.field964 = 1792;
					} else {
						arg0.field964 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field964 = 768;
					} else if (var4 > var6) {
						arg0.field964 = 256;
					} else {
						arg0.field964 = 512;
					}
				} else if (var4 < var6) {
					arg0.field964 = 1024;
				} else {
					arg0.field964 = 0;
				}

				int var7 = arg0.field964 - arg0.field974 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1006;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1005;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1008;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1007;
				}

				if (var8 == -1) {
					var8 = arg0.field1005;
				}

				arg0.field988 = var8;
				int var9 = 4;
				if (arg0.field974 != arg0.field964 && arg0.field994 == -1 && arg0.field992 != 0) {
					var9 = 2;
				}

				if (arg0.field993 > 2) {
					var9 = 6;
				}

				if (arg0.field993 > 3) {
					var9 = 8;
				}

				if (arg0.field1015 > 0 && arg0.field993 > 1) {
					var9 = 8;
					arg0.field1015--;
				}

				if (arg0.field966[arg0.field993 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field988 == arg0.field1005 && arg0.field1016 != -1) {
					arg0.field988 = arg0.field1016;
				}

				if (var3 < var5) {
					arg0.field972 += var9;
					if (arg0.field972 > var5) {
						arg0.field972 = var5;
					}
				} else if (var3 > var5) {
					arg0.field972 -= var9;
					if (arg0.field972 < var5) {
						arg0.field972 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field973 += var9;
					if (arg0.field973 > var6) {
						arg0.field973 = var6;
					}
				} else if (var4 > var6) {
					arg0.field973 -= var9;
					if (arg0.field973 < var6) {
						arg0.field973 = var6;
					}
				}

				if (arg0.field972 == var5 && arg0.field973 == var6) {
					arg0.field993--;

					if (arg0.field1014 > 0) {
						arg0.field1014--;
						return;
					}
				}
			} else {
				arg0.field972 = var5;
				arg0.field973 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(BLNNWGJIGN;)V")
	public final void method108(NNWGJIGN arg0) {
		if (arg0.field992 != 0) {
			if (arg0.field994 != -1 && arg0.field994 < 32768) {
				PEHNWFXK var2 = field175[arg0.field994];
				if (var2 != null) {
					int var3 = arg0.field972 - var2.field972;
					int var4 = arg0.field973 - var2.field973;
					if (var3 != 0 || var4 != 0) {
						arg0.field964 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field994 >= 32768) {
				int var5 = arg0.field994 - 32768;
				if (field438 == var5) {
					var5 = field430;
				}

				KVXZMJHR var6 = field431[var5];
				if (var6 != null) {
					int var7 = arg0.field972 - var6.field972;
					int var8 = arg0.field973 - var6.field973;
					if (var7 != 0 || var8 != 0) {
						arg0.field964 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field969 != 0 || arg0.field970 != 0) && (arg0.field993 == 0 || arg0.field1015 > 0)) {
				int var9 = arg0.field972 - (arg0.field969 - field85 - field85) * 64;
				int var10 = arg0.field973 - (arg0.field970 - field86 - field86) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field964 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field969 = 0;
				arg0.field970 = 0;
			}

			int var11 = arg0.field964 - arg0.field974 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field992 || var11 > 2048 - arg0.field992) {
					arg0.field974 = arg0.field964;
				} else if (var11 > 1024) {
					arg0.field974 -= arg0.field992;
				} else {
					arg0.field974 += arg0.field992;
				}

				arg0.field974 &= 0x7FF;
				if (arg0.field988 == arg0.field967 && arg0.field974 != arg0.field964) {
					if (arg0.field968 != -1) {
						arg0.field988 = arg0.field968;
						return;
					}

					arg0.field988 = arg0.field1005;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILNNWGJIGN;)V")
	public final void method109(NNWGJIGN arg0) {
		arg0.field987 = false;

		if (arg0.field988 != -1) {
			KMWMLVIH var2 = KMWMLVIH.field825[arg0.field988];
			arg0.field990++;
			if (arg0.field989 < var2.field826 && arg0.field990 > var2.method320(arg0.field989)) {
				arg0.field990 = 0;
				arg0.field989++;
			}

			if (arg0.field989 >= var2.field826) {
				arg0.field990 = 0;
				arg0.field989 = 0;
			}
		}

		if (arg0.field995 != -1 && field316 >= arg0.field998) {
			if (arg0.field996 < 0) {
				arg0.field996 = 0;
			}

			KMWMLVIH var3 = RTDMFIDA.field1201[arg0.field995].field1205;
			arg0.field997++;
			while (arg0.field996 < var3.field826 && arg0.field997 > var3.method320(arg0.field996)) {
				arg0.field997 -= var3.method320(arg0.field996);
				arg0.field996++;
			}

			if (arg0.field996 >= var3.field826 && (arg0.field996 < 0 || arg0.field996 >= var3.field826)) {
				arg0.field995 = -1;
			}
		}

		if (arg0.field1009 != -1 && arg0.field1012 <= 1) {
			KMWMLVIH var4 = KMWMLVIH.field825[arg0.field1009];
			if (var4.field837 == 1 && arg0.field1014 > 0 && arg0.field979 <= field316 && arg0.field980 < field316) {
				arg0.field1012 = 1;
				return;
			}
		}

		if (arg0.field1009 != -1 && arg0.field1012 == 0) {
			KMWMLVIH var5 = KMWMLVIH.field825[arg0.field1009];
			arg0.field1011++;
			while (arg0.field1010 < var5.field826 && arg0.field1011 > var5.method320(arg0.field1010)) {
				arg0.field1011 -= var5.method320(arg0.field1010);
				arg0.field1010++;
			}

			if (arg0.field1010 >= var5.field826) {
				arg0.field1010 -= var5.field830;
				arg0.field1013++;
				if (arg0.field1013 >= var5.field836) {
					arg0.field1009 = -1;
				}

				if (arg0.field1010 < 0 || arg0.field1010 >= var5.field826) {
					arg0.field1009 = -1;
				}
			}

			arg0.field987 = var5.field832;
		}

		if (arg0.field1012 > 0) {
			arg0.field1012--;
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method110() {
		if (field393 == -1 || field275 != 2 && field1374 == null) {
			if (field364) {
				method40();
				field364 = false;
				field68.method317(4, 0, field1373);
				field69.method317(357, 0, field1373);
				field70.method317(4, 722, field1373);
				field71.method317(205, 743, field1373);
				field72.method317(0, 0, field1373);
				field73.method317(4, 516, field1373);
				field74.method317(205, 516, field1373);
				field75.method317(357, 496, field1373);
				field76.method317(338, 0, field1373);
				field370 = true;
				field428 = true;
				field453 = true;
				field378 = true;

				if (field275 != 2) {
					field491.method317(4, 4, field1373);
					field490.method317(4, 550, field1373);
				}
			}

			if (field275 == 2) {
				method64();
			}

			if (field452 && field152 == 1) {
				field370 = true;
			}

			if (field245 != -1) {
				boolean var3 = method99(field245, field297);
				if (var3) {
					field370 = true;
				}
			}

			if (field80 == 2) {
				field370 = true;
			}

			if (field291 == 2) {
				field370 = true;
			}

			if (field370) {
				method129();
				field370 = false;
			}

			if (field196 == -1 && field379 == 0) {
				field287.field940 = field188 - field348 - 77;

				if (field1381 > 448 && field1381 < 560 && field1382 > 332) {
					method126(field287, 0, -1, 77, field1381 - 17, field188, 463, field1382 - 357);
				}

				int var4 = field188 - field287.field940 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field188 - 77) {
					var4 = field188 - 77;
				}

				if (field348 != var4) {
					field348 = var4;
					field428 = true;
				}
			}

			if (field196 == -1 && field379 == 3) {
				int var5 = field100 * 14 + 7;
				field287.field940 = field103;

				if (field1381 > 448 && field1381 < 560 && field1382 > 332) {
					method126(field287, 0, -1, 77, field1381 - 17, var5, 463, field1382 - 357);
				}

				int var6 = field287.field940;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field103 != var6) {
					field103 = var6;
					field428 = true;
				}
			}

			if (field196 != -1) {
				boolean var7 = method99(field196, field297);
				if (var7) {
					field428 = true;
				}
			}

			if (field80 == 3) {
				field428 = true;
			}

			if (field291 == 3) {
				field428 = true;
			}

			if (field277 != null) {
				field428 = true;
			}

			if (field452 && field152 == 2) {
				field428 = true;
			}

			if (field428) {
				method135();
				field428 = false;
			}

			if (field275 == 2) {
				method49();
				field490.method317(4, 550, field1373);
				field391++;
				if (field391 > 1271) {
					field391 = 0;
					field360.method450(225);
					field360.method451(0);
					int var8 = field360.field1263;

					if ((int) (Math.random() * 2.0D) == 0) {
						field360.method451(152);
					}

					field360.method452((int) (Math.random() * 65536.0D));
					field360.method451((int) (Math.random() * 256.0D));
					field360.method451((int) (Math.random() * 256.0D));
					field360.method452(16113);
					field360.method452((int) (Math.random() * 65536.0D));
					field360.method452(60626);
					field360.method452(58675);
					field360.method452((int) (Math.random() * 65536.0D));
					field360.method451((int) (Math.random() * 256.0D));
					field360.method460(field360.field1263 - var8);
				}
			}

			if (field225 != -1) {
				field453 = true;
			}

			if (field453) {
				if (field225 != -1 && field486 == field225) {
					field225 = -1;
					field360.method450(61);
					field360.method451(field486);
				}

				field453 = false;
				field442.method316();
				field311.method599(0, 0);

				if (field245 == -1) {
					if (field485[field486] != -1) {
						if (field486 == 0) {
							field58.method599(10, 22);
						}

						if (field486 == 1) {
							field59.method599(8, 54);
						}

						if (field486 == 2) {
							field59.method599(8, 82);
						}

						if (field486 == 3) {
							field60.method599(8, 110);
						}

						if (field486 == 4) {
							field62.method599(8, 153);
						}

						if (field486 == 5) {
							field62.method599(8, 181);
						}

						if (field486 == 6) {
							field61.method599(9, 209);
						}
					}

					if (field485[0] != -1 && (field225 != 0 || field316 % 20 < 10)) {
						field357[0].method599(13, 29);
					}

					if (field485[1] != -1 && (field225 != 1 || field316 % 20 < 10)) {
						field357[1].method599(11, 53);
					}

					if (field485[2] != -1 && (field225 != 2 || field316 % 20 < 10)) {
						field357[2].method599(11, 82);
					}

					if (field485[3] != -1 && (field225 != 3 || field316 % 20 < 10)) {
						field357[3].method599(12, 115);
					}

					if (field485[4] != -1 && (field225 != 4 || field316 % 20 < 10)) {
						field357[4].method599(13, 153);
					}

					if (field485[5] != -1 && (field225 != 5 || field316 % 20 < 10)) {
						field357[5].method599(11, 180);
					}

					if (field485[6] != -1 && (field225 != 6 || field316 % 20 < 10)) {
						field357[6].method599(13, 208);
					}
				}

				field442.method317(160, 516, field1373);
				field441.method316();
				field310.method599(0, 0);

				if (field245 == -1) {
					if (field485[field486] != -1) {
						if (field486 == 7) {
							field325.method599(0, 42);
						}

						if (field486 == 8) {
							field326.method599(0, 74);
						}

						if (field486 == 9) {
							field326.method599(0, 102);
						}

						if (field486 == 10) {
							field327.method599(1, 130);
						}

						if (field486 == 11) {
							field329.method599(0, 173);
						}

						if (field486 == 12) {
							field329.method599(0, 201);
						}

						if (field486 == 13) {
							field328.method599(0, 229);
						}
					}

					if (field485[8] != -1 && (field225 != 8 || field316 % 20 < 10)) {
						field357[7].method599(2, 74);
					}

					if (field485[9] != -1 && (field225 != 9 || field316 % 20 < 10)) {
						field357[8].method599(3, 102);
					}

					if (field485[10] != -1 && (field225 != 10 || field316 % 20 < 10)) {
						field357[9].method599(4, 137);
					}

					if (field485[11] != -1 && (field225 != 11 || field316 % 20 < 10)) {
						field357[10].method599(2, 174);
					}

					if (field485[12] != -1 && (field225 != 12 || field316 % 20 < 10)) {
						field357[11].method599(2, 201);
					}

					if (field485[13] != -1 && (field225 != 13 || field316 % 20 < 10)) {
						field357[12].method599(2, 226);
					}
				}

				field441.method317(466, 496, field1373);
				field491.method316();
				QRNWMOSL.field1180 = field168;
			}

			if (field378) {
				field378 = false;
				field440.method316();
				field309.method599(0, 0);
				field460.method361(55, 28, "Public chat", true, 0xFFFFFF);

				if (field57 == 0) {
					field460.method361(55, 41, "On", true, 0xFF00);
				}

				if (field57 == 1) {
					field460.method361(55, 41, "Friends", true, 0xFFFF00);
				}

				if (field57 == 2) {
					field460.method361(55, 41, "Off", true, 0xFF0000);
				}

				if (field57 == 3) {
					field460.method361(55, 41, "Hide", true, 0xFFFF);
				}

				field460.method361(184, 28, "Private chat", true, 0xFFFFFF);

				if (field93 == 0) {
					field460.method361(184, 41, "On", true, 0xFF00);
				}

				if (field93 == 1) {
					field460.method361(184, 41, "Friends", true, 0xFFFF00);
				}

				if (field93 == 2) {
					field460.method361(184, 41, "Off", true, 0xFF0000);
				}

				field460.method361(324, 28, "Trade/compete", true, 0xFFFFFF);

				if (field158 == 0) {
					field460.method361(324, 41, "On", true, 0xFF00);
				}

				if (field158 == 1) {
					field460.method361(324, 41, "Friends", true, 0xFFFF00);
				}

				if (field158 == 2) {
					field460.method361(324, 41, "Off", true, 0xFF0000);
				}

				field460.method361(458, 33, "Report abuse", true, 0xFFFFFF);
				field440.method317(453, 0, field1373);
				field491.method316();
				QRNWMOSL.field1180 = field168;
			}

			field297 = 0;
		} else {
			if (field275 == 2) {
				method99(field393, field297);

				if (field147 != -1) {
					method99(field147, field297);
				}

				field297 = 0;
				method78();
				field1374.method316();
				QRNWMOSL.field1180 = field169;
				DEVPLWNC.method162();
				field364 = true;
				NHFASBOX var1 = NHFASBOX.method339(field393);
				if (var1.field917 == 512 && var1.field893 == 334 && var1.field914 == 0) {
					var1.field917 = 765;
					var1.field893 = 503;
				}

				method65(var1, 0, 0, 0);

				if (field147 != -1) {
					NHFASBOX var2 = NHFASBOX.method339(field147);
					if (var2.field917 == 512 && var2.field893 == 334 && var2.field914 == 0) {
						var2.field917 = 765;
						var2.field893 = 503;
					}

					method65(var2, 0, 0, 0);
				}

				if (field452) {
					method136();
				} else {
					method84();
					method46();
				}
			}

			field1374.method317(0, 0, field1373);
		}
	}

	@ObfuscatedName("client.a(ILOMAKLDKI;ZI)V")
	public final void method111(int arg0, OMAKLDKI arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field258 + field246 & 0x7FF;
			int var6 = IYSWJGDE.field782[var5];
			int var7 = IYSWJGDE.field783[var5];
			var6 = var6 * 256 / (field140 + 256);
			var7 = var7 * 256 / (field140 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field171.method356(15, var12 + 94 + 4 - 10, 20, 20, 15, var10, 256, 83 - var13 - 20);
		} else {
			method91(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method112() {
		field440 = null;
		field441 = null;
		field442 = null;
		field354 = null;
		field341 = null;
		method128();
		field400 = null;
		field212 = null;
		field213 = null;
		field214 = null;
		field215 = null;
		field72 = null;
		field73 = null;
		field74 = null;
		field75 = null;
		field76 = null;
		field107 = null;
		field108 = null;
		field109 = null;
		field444 = null;
		field443 = null;
		field105 = null;
		field325 = null;
		field326 = null;
		field327 = null;
		field328 = null;
		field329 = null;
		field58 = null;
		field59 = null;
		field60 = null;
		field61 = null;
		field62 = null;
		field318 = null;
		field210 = null;
		field211 = null;
		field207 = null;
		field208 = null;
		field209 = null;
		field253 = null;
		field266 = null;
		field306 = null;
		field307 = null;
		field389 = null;
		field445 = null;
		field281 = null;
		field493 = null;
		field386 = null;
		field129 = null;
		field97 = null;
		field178 = null;
		field283 = null;
		field238 = null;
		field418 = null;
		field284 = null;
		field285 = null;
		field360 = null;
		field390 = null;
		field161 = null;
		field308 = null;
		field68 = null;
		field69 = null;
		field70 = null;
		field71 = null;
		field174 = null;
		field471 = null;
		field472 = null;
		field473 = null;
		field474 = null;
		field475 = null;
		field489 = null;
		field490 = null;
		field491 = null;
		field492 = null;
		field309 = null;
		field310 = null;
		field311 = null;
		field175 = null;
		field177 = null;
		field431 = null;
		field433 = null;
		field435 = null;
		field436 = null;
		field274 = null;
		field357 = null;

		try {
			if (field63 != null) {
				field63.method407();
			}
		} catch (Exception var1) {
		}

		field63 = null;
		field377 = null;
		field230 = null;
		field67 = null;
		field373 = null;
		field148 = null;
		field139 = null;

		if (field480 != null) {
			field480.method252();
		}

		field480 = null;

		if (field110 != null) {
			field110.field788 = false;
		}

		field110 = null;
		field422 = null;
		field423 = null;
		field206 = null;
		field239 = null;
		field240 = null;
		field241 = null;
		field242 = null;
		field401 = null;
		field135 = null;
		field479 = null;
		method144();
		PXRGLLGB.method420();
		PIPBZEOV.method400();
		VIWDEJKN.method541();
		NHFASBOX.method336();
		EPJTEXKD.field535 = null;
		UGUHDANY.field1286 = null;
		TPSDVPTZ.field1275 = null;
		KMWMLVIH.field825 = null;
		RTDMFIDA.field1201 = null;
		RTDMFIDA.field1213 = null;
		KHDRIUSF.field803 = null;
		field1374 = null;
		KVXZMJHR.field857 = null;
		QRNWMOSL.method424();
		GXHGUSOD.method188();
		IYSWJGDE.method269();
		PLSPTEPI.method404();
		System.gc();
	}

	@ObfuscatedName("client.a(IIZILPIPBZEOV;)V")
	public final void method113(int arg0, int arg1, int arg2, PIPBZEOV arg3) {
		if (field399 < 400) {
			if (arg3.field1082 != null) {
				arg3 = arg3.method397();
			}

			if (arg3 != null && arg3.field1070) {
				String var5 = arg3.field1080;
				if (arg3.field1094 != 0) {
					var5 = var5 + method21(field133.field851, arg3.field1094) + " (level-" + arg3.field1094 + ")";
				}

				if (field465 == 1) {
					field401[field399] = "Use " + field469 + " with @yel@" + var5;
					field241[field399] = 227;
					field242[field399] = arg2;
					field239[field399] = arg0;
					field240[field399] = arg1;
					field399++;
				} else if (field232 != 1) {
					if (arg3.field1091 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field1091[var6] != null && !arg3.field1091[var6].equalsIgnoreCase("attack")) {
								field401[field399] = arg3.field1091[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field241[field399] = 616;
								}

								if (var6 == 1) {
									field241[field399] = 310;
								}

								if (var6 == 2) {
									field241[field399] = 218;
								}

								if (var6 == 3) {
									field241[field399] = 138;
								}

								if (var6 == 4) {
									field241[field399] = 745;
								}

								field242[field399] = arg2;
								field239[field399] = arg0;
								field240[field399] = arg1;
								field399++;
							}
						}
					}

					if (arg3.field1091 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field1091[var7] != null && arg3.field1091[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field1094 > field133.field851) {
									var8 = 2000;
								}

								field401[field399] = arg3.field1091[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field241[field399] = var8 + 616;
								}

								if (var7 == 1) {
									field241[field399] = var8 + 310;
								}

								if (var7 == 2) {
									field241[field399] = var8 + 218;
								}

								if (var7 == 3) {
									field241[field399] = var8 + 138;
								}

								if (var7 == 4) {
									field241[field399] = var8 + 745;
								}

								field242[field399] = arg2;
								field239[field399] = arg0;
								field240[field399] = arg1;
								field399++;
							}
						}
					}

					field401[field399] = "Examine @yel@" + var5;
					field241[field399] = 1013;
					field242[field399] = arg2;
					field239[field399] = arg0;
					field240[field399] = arg1;
					field399++;
				} else if ((field234 & 0x2) == 2) {
					field401[field399] = field235 + " @yel@" + var5;
					field241[field399] = 389;
					field242[field399] = arg2;
					field239[field399] = arg0;
					field240[field399] = arg1;
					field399++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLNHFASBOX;)Z")
	public final boolean method114(NHFASBOX arg0) {
		int var2 = arg0.field909;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field401[field399] = "Remove @whi@" + arg0.field907;
				field241[field399] = 557;
				field399++;
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

		field401[field399] = "Remove @whi@" + field444[var2];
		field241[field399] = 613;
		field399++;
		field401[field399] = "Message @whi@" + field444[var2];
		field241[field399] = 444;
		field399++;
		return true;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method115() {
		field111 = 0;
		for (int var1 = -1; var1 < field432 + field176; var1++) {
			NNWGJIGN var2;
			if (var1 == -1) {
				var2 = field133;
			} else if (var1 < field432) {
				var2 = field431[field433[var1]];
			} else {
				var2 = field175[field177[var1 - field432]];
			}

			if (var2 != null && var2.method325()) {
				if (var2 instanceof PEHNWFXK) {
					PIPBZEOV var3 = ((PEHNWFXK) var2).field1056;
					if (var3.field1082 != null) {
						var3 = var3.method397();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field432) {
					PIPBZEOV var6 = ((PEHNWFXK) var2).field1056;
					if (var6.field1089 >= 0 && var6.field1089 < field386.length) {
						method70(var2, var2.field965 + 15);

						if (field397 > -1) {
							field386[var6.field1089].method351(field398 - 30, field397 - 12);
						}
					}

					if (field288 == 1 && field177[var1 - field432] == field183 && field316 % 20 < 10) {
						method70(var2, var2.field965 + 15);

						if (field397 > -1) {
							field129[0].method351(field398 - 28, field397 - 12);
						}
					}
				} else {
					int var4 = 30;
					KVXZMJHR var5 = (KVXZMJHR) var2;
					if (var5.field847 != -1 || var5.field850 != -1) {
						method70(var2, var2.field965 + 15);

						if (field397 > -1) {
							if (var5.field847 != -1) {
								field493[var5.field847].method351(field398 - var4, field397 - 12);
								var4 += 25;
							}

							if (var5.field850 != -1) {
								field386[var5.field850].method351(field398 - var4, field397 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field288 == 10 && field433[var1] == field446) {
						method70(var2, var2.field965 + 15);

						if (field397 > -1) {
							field129[1].method351(field398 - var4, field397 - 12);
						}
					}
				}

				if (var2.field986 != null && (var1 >= field432 || field57 == 0 || field57 == 3 || field57 == 1 && method16(((KVXZMJHR) var2).field853))) {
					method70(var2, var2.field965);

					if (field397 > -1 && field111 < field112) {
						field116[field111] = field461.method363(var2.field986) / 2;
						field115[field111] = field461.field1040;
						field113[field111] = field397;
						field114[field111] = field398;
						field117[field111] = var2.field971;
						field118[field111] = var2.field985;
						field119[field111] = var2.field1004;
						field120[field111++] = var2.field986;

						if (field82 == 0 && var2.field985 >= 1 && var2.field985 <= 3) {
							field115[field111] += 10;
							field114[field111] += 5;
						}

						if (field82 == 0 && var2.field985 == 4) {
							field116[field111] = 60;
						}

						if (field82 == 0 && var2.field985 == 5) {
							field115[field111] += 5;
						}
					}
				}

				if (var2.field982 > field316) {
					method70(var2, var2.field965 + 15);

					if (field397 > -1) {
						int var7 = var2.field983 * 30 / var2.field984;
						if (var7 > 30) {
							var7 = 30;
						}

						DEVPLWNC.method164(0xFF00, 5, field397 - 15, var7, field398 - 3);
						DEVPLWNC.method164(0xFF0000, 5, field397 + var7 - 15, 30 - var7, field398 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1003[var8] > field316) {
						method70(var2, var2.field965 / 2);

						if (field397 > -1) {
							if (var8 == 1) {
								field398 -= 20;
							}

							if (var8 == 2) {
								field397 -= 15;
								field398 -= 10;
							}

							if (var8 == 3) {
								field397 += 15;
								field398 -= 10;
							}

							field281[var2.field1002[var8]].method351(field398 - 12, field397 - 12);
							field459.method360(field398 + 4, String.valueOf(var2.field1001[var8]), field397, 0);
							field459.method360(field398 + 3, String.valueOf(var2.field1001[var8]), field397 - 1, 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field111; var9++) {
			int var10 = field113[var9];
			int var11 = field114[var9];
			int var12 = field116[var9];
			int var13 = field115[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field114[var15] - field115[var15] && var11 - var13 < field114[var15] + 2 && var10 - var12 < field116[var15] + field113[var15] && var10 + var12 > field113[var15] - field116[var15] && field114[var15] - field115[var15] < var11) {
						var11 = field114[var15] - field115[var15];
						var14 = true;
					}
				}
			}

			field397 = field113[var9];
			field398 = field114[var9] = var11;
			String var16 = field120[var9];
			if (field82 == 0) {
				int var17 = 0xFFFF00;
				if (field117[var9] < 6) {
					var17 = field319[field117[var9]];
				}

				if (field117[var9] == 6) {
					var17 = field359 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field117[var9] == 7) {
					var17 = field359 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field117[var9] == 8) {
					var17 = field359 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field117[var9] == 9) {
					int var18 = 150 - field119[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field117[var9] == 10) {
					int var19 = 150 - field119[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field117[var9] == 11) {
					int var20 = 150 - field119[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field118[var9] == 0) {
					field461.method360(field398 + 1, var16, field397, 0);
					field461.method360(field398, var16, field397, var17);
				}

				if (field118[var9] == 1) {
					field461.method365(field397, field359, 0, var16, field398 + 1);
					field461.method365(field397, field359, var17, var16, field398);
				}

				if (field118[var9] == 2) {
					field461.method366(var16, field359, field398 + 1, field397, 0);
					field461.method366(var16, field359, field398, field397, var17);
				}

				if (field118[var9] == 3) {
					field461.method367(field398 + 1, 0, var16, field359, 150 - field119[var9], field397);
					field461.method367(field398, var17, var16, field359, 150 - field119[var9], field397);
				}

				if (field118[var9] == 4) {
					int var21 = field461.method363(var16);
					int var22 = (150 - field119[var9]) * (var21 + 100) / 150;
					DEVPLWNC.method161(field397 + 50, field397 - 50, 334, 0);
					field461.method364(field398 + 1, 0, field397 + 50 - var22, var16);
					field461.method364(field398, var17, field397 + 50 - var22, var16);
					DEVPLWNC.method160();
				}

				if (field118[var9] == 5) {
					int var23 = 150 - field119[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					DEVPLWNC.method161(512, 0, field398 + 5, field398 - field461.field1040 - 1);
					field461.method360(field398 + var24 + 1, var16, field397, 0);
					field461.method360(field398 + var24, var16, field397, var17);
					DEVPLWNC.method160();
				}
			} else {
				field461.method360(field398 + 1, var16, field397, 0);
				field461.method360(field398, var16, field397, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.k(Z)Z")
	public final boolean method116() {
		if (field63 == null) {
			return false;
		}

		try {
			int var1 = field63.method409();
			if (var1 == 0) {
				return false;
			}

			if (field335 == -1) {
				field63.method410(field161.field1262, 0, 1);
				field335 = field161.field1262[0] & 0xFF;
				if (field437 != null) {
					field335 = field335 - field437.method375() & 0xFF;
				}

				field334 = LRLEVLJF.field879[field335];
				var1--;
			}

			if (field334 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field63.method410(field161.field1262, 0, 1);
				field334 = field161.field1262[0] & 0xFF;
				var1--;
			}

			if (field334 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field63.method410(field161.field1262, 0, 2);
				field161.field1263 = 0;
				field334 = field161.method463();
				var1 -= 2;
			}

			if (var1 < field334) {
				return false;
			}

			field161.field1263 = 0;
			field63.method410(field161.field1262, 0, field334);
			field336 = 0;
			field496 = field495;
			field495 = field494;
			field494 = field335;

			if (field335 == 56) {
				String var2 = field161.method468();
				if (var2.endsWith(":tradereq:")) {
					String var3 = var2.substring(0, var2.indexOf(":"));
					long var4 = ASZHZJYZ.method5(var3);
					boolean var6 = false;
					for (int var7 = 0; var7 < field272; var7++) {
						if (field179[var7] == var4) {
							var6 = true;
							break;
						}
					}

					if (!var6 && field439 == 0) {
						method45(var3, 4, "wishes to trade with you.");
					}
				} else if (var2.endsWith(":duelreq:")) {
					String var8 = var2.substring(0, var2.indexOf(":"));
					long var9 = ASZHZJYZ.method5(var8);
					boolean var11 = false;
					for (int var12 = 0; var12 < field272; var12++) {
						if (field179[var12] == var9) {
							var11 = true;
							break;
						}
					}

					if (!var11 && field439 == 0) {
						method45(var8, 8, "wishes to duel with you.");
					}
				} else if (var2.endsWith(":chalreq:")) {
					String var13 = var2.substring(0, var2.indexOf(":"));
					long var14 = ASZHZJYZ.method5(var13);
					boolean var16 = false;
					for (int var17 = 0; var17 < field272; var17++) {
						if (field179[var17] == var14) {
							var16 = true;
							break;
						}
					}

					if (!var16 && field439 == 0) {
						String var18 = var2.substring(var2.indexOf(":") + 1, var2.length() - 9);
						method45(var13, 8, var18);
					}
				} else {
					method45("", 0, var2);
				}

				field335 = -1;
				return true;
			}

			if (field335 == 12) {
				int var19 = field161.method489();
				int var20 = field161.method490();
				int var21 = field161.method490();
				NHFASBOX.method339(var21).field962 = (var19 << 16) + var20;
				field335 = -1;
				return true;
			}

			if (field335 == 45) {
				long var22 = field161.method467();
				int var24 = field161.method466();
				int var25 = field161.method461();
				boolean var26 = false;
				for (int var27 = 0; var27 < 100; var27++) {
					if (field498[var27] == var24) {
						var26 = true;
						break;
					}
				}

				if (var25 <= 1) {
					for (int var28 = 0; var28 < field272; var28++) {
						if (field179[var28] == var22) {
							var26 = true;
							break;
						}
					}
				}

				if (!var26 && field439 == 0) {
					try {
						field498[field83] = var24;
						field83 = (field83 + 1) % 100;
						String var29 = IQRKADXA.method266(field161, field334 - 13);
						if (var25 != 3) {
							var29 = UIPOGFJQ.method512(var29);
						}

						if (var25 == 2 || var25 == 3) {
							method45("@cr2@" + ASZHZJYZ.method9(ASZHZJYZ.method6(var22)), 7, var29);
						} else if (var25 == 1) {
							method45("@cr1@" + ASZHZJYZ.method9(ASZHZJYZ.method6(var22)), 7, var29);
						} else {
							method45(ASZHZJYZ.method9(ASZHZJYZ.method6(var22)), 3, var29);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 51) {
				if (field245 != -1) {
					method26(field245);
					field245 = -1;
					field370 = true;
					field453 = true;
				}

				if (field196 != -1) {
					method26(field196);
					field196 = -1;
					field428 = true;
				}

				if (field393 != -1) {
					method26(field393);
					field393 = -1;
					field364 = true;
				}

				if (field147 != -1) {
					method26(field147);
					field147 = -1;
				}

				if (field301 != -1) {
					method26(field301);
					field301 = -1;
				}

				if (field379 != 0) {
					field379 = 0;
					field428 = true;
				}

				field227 = false;
				field335 = -1;
				return true;
			}

			if (field335 == 208) {
				field370 = true;
				int var31 = field161.method481();
				int var32 = field161.method494();
				int var33 = field161.method481();
				field160[var33] = var32;
				field185[var33] = var31;
				field449[var33] = 1;
				for (int var34 = 0; var34 < 98; var34++) {
					if (var32 >= field448[var34]) {
						field449[var33] = var34 + 2;
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 237) {
				field231 = field161.method479();
				field438 = field161.method463();
				field335 = -1;
				return true;
			}

			if (field335 == 235) {
				int var35 = field161.method463();
				int var36 = field161.method488();

				if (field196 != -1) {
					method26(field196);
					field196 = -1;
					field428 = true;
				}

				if (field393 != -1) {
					method26(field393);
					field393 = -1;
					field364 = true;
				}

				if (field147 != -1) {
					method26(field147);
					field147 = -1;
				}

				if (field301 != var36) {
					method26(field301);
					field301 = var36;
				}

				if (field245 != var35) {
					method26(field245);
					field245 = var35;
				}

				if (field379 != 0) {
					field379 = 0;
					field428 = true;
				}

				field370 = true;
				field453 = true;
				field227 = false;
				field335 = -1;
				return true;
			}

			if (field335 == 123) {
				int var37 = field161.method488();
				int var38 = field161.method493();
				field367[var37] = var38;

				if (field178[var37] != var38) {
					field178[var37] = var38;
					method38(var37);
					field370 = true;

					if (field365 != -1) {
						field428 = true;
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 42) {
				if (field486 == 12) {
					field370 = true;
				}

				field219 = field161.method461();
				field335 = -1;
				return true;
			}

			if (field335 == 148) {
				field104 = false;
				field379 = 2;
				field66 = "";
				field428 = true;
				field335 = -1;
				return true;
			}

			if (field335 == 85) {
				int var39 = field161.method488();
				if (var39 == 0xFFFF) {
					var39 = -1;
				}

				if (field340 != var39 && field143 && !field458 && field302 == 0) {
					field395 = var39;
					field396 = true;
					field480.method245(2, field395);
				}

				field340 = var39;
				field335 = -1;
				return true;
			}

			if (field335 == 65) {
				int var40 = field161.method489();
				int var41 = field161.method465();
				if (field143 && !field458) {
					field395 = var40;
					field396 = false;
					field480.method245(2, field395);
					field302 = var41;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 78) {
				int var42 = field161.method463();
				int var43 = field161.method461();
				int var44 = field161.method463();
				if (var44 == 0xFFFF) {
					if (field195 < 50) {
						field256[field195] = (short) var42;
						field375[field195] = var43;
						field320[field195] = 0;
						field195++;
					}
				} else if (field216 && !field458 && field195 < 50) {
					field256[field195] = var42;
					field375[field195] = var43;
					field320[field195] = JRSHCCMF.field796[var42] + var44;
					field195++;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 185) {
				int var45 = field161.method489();
				NHFASBOX.method339(var45).field954 = 3;

				if (field133.field846 == null) {
					NHFASBOX.method339(var45).field955 = (field133.field860[11] << 5) + (field133.field860[8] << 10) + (field133.field860[0] << 15) + (field133.field866[0] << 25) + (field133.field866[4] << 20) + field133.field860[1];
				} else {
					NHFASBOX.method339(var45).field955 = (int) (field133.field846.field1085 + 0x12345678L);
				}

				field335 = -1;
				return true;
			}

			if (field335 == 8) {
				int var46 = field161.method463();
				int var47 = field161.method490();
				int var48 = field161.method488();

				if (var46 == 0xFFFF) {
					NHFASBOX.method339(var47).field954 = 0;
					field335 = -1;
					return true;
				}

				VIWDEJKN var49 = VIWDEJKN.method544(var46);
				NHFASBOX.method339(var47).field954 = 4;
				NHFASBOX.method339(var47).field955 = var46;
				NHFASBOX.method339(var47).field912 = var49.field1318;
				NHFASBOX.method339(var47).field913 = var49.field1308;
				NHFASBOX.method339(var47).field911 = var49.field1304 * 100 / var48;
				field335 = -1;
				return true;
			}

			if (field335 == 76) {
				field104 = false;
				field379 = 1;
				field66 = "";
				field428 = true;
				field335 = -1;
				return true;
			}

			if (field335 == 197) {
				field387 = 0;
				field335 = -1;
				return true;
			}

			if (field335 == 29) {
				int var50 = field161.method488();
				String var51 = field161.method468();
				NHFASBOX.method339(var50).field907 = var51;

				if (field485[field486] == NHFASBOX.method339(var50).field947) {
					field370 = true;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 38) {
				field486 = field161.method480();
				field370 = true;
				field453 = true;
				field335 = -1;
				return true;
			}

			if (field335 == 137) {
				for (int var52 = 0; var52 < field178.length; var52++) {
					if (field367[var52] != field178[var52]) {
						field178[var52] = field367[var52];
						method38(var52);
						field370 = true;
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 210) {
				field184 = field161.method461();
				field335 = -1;
				return true;
			}

			if (field335 == 44) {
				field142 = field161.method490();
				field419 = field161.method489();
				field161.method488();
				field342 = field161.method489();
				field161.method489();
				field161.method490();
				field322 = field161.method489();
				field205 = field161.method493();
				field361 = field161.method489();
				field161.method481();
				field96 = field161.method490();
				signlink.dnslookup(ASZHZJYZ.method8(field205));
				field335 = -1;
				return true;
			}

			if (field335 == 18) {
				long var53 = field161.method467();
				int var55 = field161.method461();
				String var56 = ASZHZJYZ.method9(ASZHZJYZ.method6(var53));
				for (int var57 = 0; var57 < field355; var57++) {
					if (field443[var57] == var53) {
						if (field105[var57] != var55) {
							field105[var57] = var55;
							field370 = true;

							if (var55 > 0) {
								method45("", 5, var56 + " has logged in.");
							}

							if (var55 == 0) {
								method45("", 5, var56 + " has logged out.");
							}
						}

						var56 = null;
						break;
					}
				}

				if (var56 != null && field355 < 200) {
					field443[field355] = var53;
					field444[field355] = var56;
					field105[field355] = var55;
					field355++;
					field370 = true;
				}

				boolean var58 = false;
				while (!var58) {
					var58 = true;
					for (int var59 = 0; var59 < field355 - 1; var59++) {
						if (field105[var59] != field455 && field105[var59 + 1] == field455 || field105[var59] == 0 && field105[var59 + 1] != 0) {
							int var60 = field105[var59];
							field105[var59] = field105[var59 + 1];
							field105[var59 + 1] = var60;
							String var61 = field444[var59];
							field444[var59] = field444[var59 + 1];
							field444[var59 + 1] = var61;
							long var62 = field443[var59];
							field443[var59] = field443[var59 + 1];
							field443[var59 + 1] = var62;
							field370 = true;
							var58 = false;
						}
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 94) {
				int var64 = field161.method488();
				method18(var64);

				if (field245 != -1) {
					method26(field245);
					field245 = -1;
					field370 = true;
					field453 = true;
				}

				if (field196 != -1) {
					method26(field196);
					field196 = -1;
					field428 = true;
				}

				if (field393 != -1) {
					method26(field393);
					field393 = -1;
					field364 = true;
				}

				if (field147 != -1) {
					method26(field147);
					field147 = -1;
				}

				if (field301 != var64) {
					method26(field301);
					field301 = var64;
				}

				if (field379 != 0) {
					field379 = 0;
					field428 = true;
				}

				field227 = false;
				field335 = -1;
				return true;
			}

			if (field335 == 101) {
				int var65 = field161.method488();
				int var66 = field161.method463();
				NHFASBOX.method339(var65).field954 = 1;
				NHFASBOX.method339(var65).field955 = var66;
				field335 = -1;
				return true;
			}

			if (field335 == 136) {
				int var67 = field161.method488();
				int var68 = field161.method490();
				int var69 = field161.method489();
				int var70 = field161.method463();
				NHFASBOX.method339(var68).field912 = var70;
				NHFASBOX.method339(var68).field913 = var67;
				NHFASBOX.method339(var68).field911 = var69;
				field335 = -1;
				return true;
			}

			if (field335 == 33) {
				int var71 = field161.method461();
				int var72 = field161.method461();
				int var73 = field161.method461();
				int var74 = field161.method461();
				field385[var71] = true;
				field276[var71] = var72;
				field151[var71] = var73;
				field263[var71] = var74;
				field339[var71] = 0;
				field335 = -1;
				return true;
			}

			if (field335 == 67) {
				int var75 = field161.method463();
				int var76 = field161.method492();
				NHFASBOX var77 = NHFASBOX.method339(var75);
				if (var77.field948 != var76 || var76 == -1) {
					var77.field948 = var76;
					var77.field950 = 0;
					var77.field959 = 0;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 230) {
				field217 = field161.method480();
				field218 = field161.method479();

				while (field161.field1263 < field334) {
					int var78 = field161.method461();
					method142(var78, field161);
				}

				field335 = -1;
				return true;
			}

			if (field335 == 193) {
				int var79 = field161.method479();
				int var80 = field161.method479();
				String var81 = field161.method468();
				if (var79 >= 1 && var79 <= 5) {
					if (var81.equalsIgnoreCase("null")) {
						var81 = null;
					}

					field331[var79 - 1] = var81;
					field332[var79 - 1] = var80 == 0;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 188) {
				int var82 = field161.method464();
				if (var82 >= 0) {
					method18(var82);
				}

				if (field358 != var82) {
					method26(field358);
					field358 = var82;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 23) {
				int var83 = field161.method488();
				method18(var83);

				if (field245 != -1) {
					method26(field245);
					field245 = -1;
					field370 = true;
					field453 = true;
				}

				if (field393 != -1) {
					method26(field393);
					field393 = -1;
					field364 = true;
				}

				if (field147 != -1) {
					method26(field147);
					field147 = -1;
				}

				if (field301 != -1) {
					method26(field301);
					field301 = -1;
				}

				if (field196 != var83) {
					method26(field196);
					field196 = var83;
				}

				field227 = false;
				field428 = true;
				field335 = -1;
				return true;
			}

			if (field335 == 120 || field335 == 95) {
				int var84 = field127;
				int var85 = field128;
				if (field335 == 120) {
					var85 = field161.method490();
					var84 = field161.method490();
					field478 = false;
				}

				if (field335 == 95) {
					field161.method471();

					for (int var86 = 0; var86 < 4; var86++) {
						for (int var87 = 0; var87 < 13; var87++) {
							for (int var88 = 0; var88 < 13; var88++) {
								int var89 = field161.method472(1);
								if (var89 == 1) {
									field405[var86][var87][var88] = field161.method472(26);
								} else {
									field405[var86][var87][var88] = -1;
								}
							}
						}
					}

					field161.method473();
					var84 = field161.method490();
					var85 = field161.method489();
					field478 = true;
				}

				if (field127 == var84 && field128 == var85 && field275 == 2) {
					field335 = -1;
					return true;
				}

				field127 = var84;
				field128 = var85;
				field85 = (field127 - 6) * 8;
				field86 = (field128 - 6) * 8;
				field299 = false;
				if ((field127 / 8 == 48 || field127 / 8 == 49) && field128 / 8 == 48) {
					field299 = true;
				}

				if (field127 / 8 == 48 && field128 / 8 == 148) {
					field299 = true;
				}

				field275 = 1;
				field447 = System.currentTimeMillis();
				method29("Loading - please wait.", null);

				if (field335 == 120) {
					int var90 = 0;
					for (int var91 = (field127 - 6) / 8; var91 <= (field127 + 6) / 8; var91++) {
						for (int var92 = (field128 - 6) / 8; var92 <= (field128 + 6) / 8; var92++) {
							var90++;
						}
					}

					field238 = new byte[var90][];
					field418 = new byte[var90][];
					field283 = new int[var90];
					field284 = new int[var90];
					field285 = new int[var90];
					int var93 = 0;
					for (int var94 = (field127 - 6) / 8; var94 <= (field127 + 6) / 8; var94++) {
						for (int var95 = (field128 - 6) / 8; var95 <= (field128 + 6) / 8; var95++) {
							field283[var93] = (var94 << 8) + var95;

							if (field299 && (var95 == 49 || var95 == 149 || var95 == 147 || var94 == 50 || var94 == 49 && var95 == 47)) {
								field284[var93] = -1;
								field285[var93] = -1;
								var93++;
							} else {
								int var96 = field284[var93] = field480.method259(0, var94, var95);
								if (var96 != -1) {
									field480.method245(3, var96);
								}

								int var97 = field285[var93] = field480.method259(1, var94, var95);
								if (var97 != -1) {
									field480.method245(3, var97);
								}

								var93++;
							}
						}
					}
				}

				if (field335 == 95) {
					int var98 = 0;
					int[] var99 = new int[676];
					for (int var100 = 0; var100 < 4; var100++) {
						for (int var101 = 0; var101 < 13; var101++) {
							for (int var102 = 0; var102 < 13; var102++) {
								int var103 = field405[var100][var101][var102];
								if (var103 != -1) {
									int var104 = var103 >> 14 & 0x3FF;
									int var105 = var103 >> 3 & 0x7FF;
									int var106 = (var104 / 8 << 8) + var105 / 8;
									for (int var107 = 0; var107 < var98; var107++) {
										if (var99[var107] == var106) {
											var106 = -1;
											break;
										}
									}

									if (var106 != -1) {
										var99[var98++] = var106;
									}
								}
							}
						}
					}

					field238 = new byte[var98][];
					field418 = new byte[var98][];
					field283 = new int[var98];
					field284 = new int[var98];
					field285 = new int[var98];
					for (int var108 = 0; var108 < var98; var108++) {
						int var109 = field283[var108] = var99[var108];
						int var110 = var109 >> 8 & 0xFF;
						int var111 = var109 & 0xFF;
						int var112 = field284[var108] = field480.method259(0, var110, var111);
						if (var112 != -1) {
							field480.method245(3, var112);
						}

						int var113 = field285[var108] = field480.method259(1, var110, var111);
						if (var113 != -1) {
							field480.method245(3, var113);
						}
					}
				}

				int var114 = field85 - field87;
				int var115 = field86 - field88;
				field87 = field85;
				field88 = field86;

				for (int var116 = 0; var116 < 16384; var116++) {
					PEHNWFXK var117 = field175[var116];
					if (var117 != null) {
						for (int var118 = 0; var118 < 10; var118++) {
							var117.field1017[var118] -= var114;
							var117.field1018[var118] -= var115;
						}

						var117.field972 -= var114 * 128;
						var117.field973 -= var115 * 128;
					}
				}

				for (int var119 = 0; var119 < field429; var119++) {
					KVXZMJHR var120 = field431[var119];
					if (var120 != null) {
						for (int var121 = 0; var121 < 10; var121++) {
							var120.field1017[var121] -= var114;
							var120.field1018[var121] -= var115;
						}

						var120.field972 -= var114 * 128;
						var120.field973 -= var115 * 128;
					}
				}

				field321 = true;
				byte var122 = 0;
				byte var123 = 104;
				byte var124 = 1;
				if (var114 < 0) {
					var122 = 103;
					var123 = -1;
					var124 = -1;
				}

				byte var125 = 0;
				byte var126 = 104;
				byte var127 = 1;
				if (var115 < 0) {
					var125 = 103;
					var126 = -1;
					var127 = -1;
				}

				for (int var128 = var122; var128 != var123; var128 += var124) {
					for (int var129 = var125; var129 != var126; var129 += var127) {
						int var130 = var114 + var128;
						int var131 = var115 + var129;
						for (int var132 = 0; var132 < 4; var132++) {
							if (var130 >= 0 && var131 >= 0 && var130 < 104 && var131 < 104) {
								field148[var132][var128][var129] = field148[var132][var130][var131];
							} else {
								field148[var132][var128][var129] = null;
							}
						}
					}
				}

				for (CHEFEIMI var133 = (CHEFEIMI) field139.method181(); var133 != null; var133 = (CHEFEIMI) field139.method183()) {
					var133.field47 -= var114;
					var133.field48 -= var115;
					if (var133.field47 < 0 || var133.field48 < 0 || var133.field47 >= 104 || var133.field48 >= 104) {
						var133.method331();
					}
				}

				if (field387 != 0) {
					field387 -= var114;
					field388 -= var115;
				}

				field384 = false;
				field335 = -1;
				return true;
			}

			if (field335 == 4) {
				field225 = field161.method479();
				if (field486 == field225) {
					if (field225 == 3) {
						field486 = 1;
					} else {
						field486 = 3;
					}

					field370 = true;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 250) {
				int var134 = field161.method464();
				if (field365 != var134) {
					method26(field365);
					field365 = var134;
				}

				field428 = true;
				field335 = -1;
				return true;
			}

			if (field335 == 232) {
				int var135 = field161.method488();
				method18(var135);

				if (field196 != -1) {
					method26(field196);
					field196 = -1;
					field428 = true;
				}

				if (field393 != -1) {
					method26(field393);
					field393 = -1;
					field364 = true;
				}

				if (field147 != -1) {
					method26(field147);
					field147 = -1;
				}

				if (field301 != -1) {
					method26(field301);
					field301 = -1;
				}

				if (field245 != var135) {
					method26(field245);
					field245 = var135;
				}

				if (field379 != 0) {
					field379 = 0;
					field428 = true;
				}

				field370 = true;
				field453 = true;
				field227 = false;
				field335 = -1;
				return true;
			}

			if (field335 == 224) {
				if (field486 == 12) {
					field370 = true;
				}

				field371 = field161.method464();
				field335 = -1;
				return true;
			}

			if (field335 == 89) {
				method131(field334, field161);
				field335 = -1;
				return true;
			}

			if (field335 == 57) {
				field57 = field161.method461();
				field93 = field161.method461();
				field158 = field161.method461();
				field378 = true;
				field428 = true;
				field335 = -1;
				return true;
			}

			if (field335 == 234) {
				field370 = true;
				int var136 = field161.method463();
				NHFASBOX var137 = NHFASBOX.method339(var136);
				while (field161.field1263 < field334) {
					int var138 = field161.method475();
					int var139 = field161.method463();
					int var140 = field161.method461();
					if (var140 == 255) {
						var140 = field161.method466();
					}

					if (var138 >= 0 && var138 < var137.field956.length) {
						var137.field956[var138] = var139;
						var137.field943[var138] = var140;
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 141) {
				field163 = field161.method489() * 30;
				field335 = -1;
				return true;
			}

			if (field335 == 75) {
				field370 = true;
				int var141 = field161.method463();
				NHFASBOX var142 = NHFASBOX.method339(var141);
				int var143 = field161.method463();
				for (int var144 = 0; var144 < var143; var144++) {
					int var145 = field161.method481();
					if (var145 == 255) {
						var145 = field161.method494();
					}

					var142.field956[var144] = field161.method490();
					var142.field943[var144] = var145;
				}

				for (int var146 = var143; var146 < var142.field956.length; var146++) {
					var142.field956[var146] = 0;
					var142.field943[var146] = 0;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 205) {
				field272 = field334 / 8;
				for (int var147 = 0; var147 < field272; var147++) {
					field179[var147] = field161.method467();
				}

				field335 = -1;
				return true;
			}

			if (field335 == 161) {
				int var148 = field161.method463();
				int var149 = field161.method463();
				int var150 = var149 >> 10 & 0x1F;
				int var151 = var149 >> 5 & 0x1F;
				int var152 = var149 & 0x1F;
				NHFASBOX.method339(var148).field902 = (var152 << 3) + (var150 << 19) + (var151 << 11);
				field335 = -1;
				return true;
			}

			if (field335 == 149) {
				field356 = field161.method461();
				field370 = true;
				field335 = -1;
				return true;
			}

			if (field335 == 221) {
				field217 = field161.method479();
				field218 = field161.method481();
				field335 = -1;
				return true;
			}

			if (field335 == 199) {
				field384 = true;
				field122 = field161.method461();
				field123 = field161.method461();
				field124 = field161.method463();
				field125 = field161.method461();
				field126 = field161.method461();
				if (field126 >= 100) {
					int var153 = field122 * 128 + 64;
					int var154 = field123 * 128 + 64;
					int var155 = method97(var153, var154, field280) - field124;
					int var156 = var153 - field220;
					int var157 = var155 - field221;
					int var158 = var154 - field222;
					int var159 = (int) Math.sqrt(var156 * var156 + var158 * var158);
					field223 = (int) (Math.atan2(var157, var159) * 325.949D) & 0x7FF;
					field224 = (int) (Math.atan2(var156, var158) * -325.949D) & 0x7FF;

					if (field223 < 128) {
						field223 = 128;
					}

					if (field223 > 383) {
						field223 = 383;
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 203) {
				int var160 = field161.method490();
				int var161 = field161.method463();
				method18(var160);

				if (var161 != -1) {
					method18(var161);
				}

				if (field301 != -1) {
					method26(field301);
					field301 = -1;
				}

				if (field245 != -1) {
					method26(field245);
					field245 = -1;
				}

				if (field196 != -1) {
					method26(field196);
					field196 = -1;
				}

				if (field393 != var160) {
					method26(field393);
					field393 = var160;
				}

				if (field147 != var160) {
					method26(field147);
					field147 = var161;
				}

				field379 = 0;
				field227 = false;
				field335 = -1;
				return true;
			}

			if (field335 == 62) {
				int var162 = field161.method463();
				boolean var163 = field161.method481() == 1;
				NHFASBOX.method339(var162).field904 = var163;
				field335 = -1;
				return true;
			}

			if (field335 == 17) {
				field189 = field161.method461();
				field335 = -1;
				return true;
			}

			if (field335 == 9) {
				for (int var164 = 0; var164 < field431.length; var164++) {
					if (field431[var164] != null) {
						field431[var164].field1009 = -1;
					}
				}

				for (int var165 = 0; var165 < field175.length; var165++) {
					if (field175[var165] != null) {
						field175[var165].field1009 = -1;
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 154) {
				field384 = false;

				for (int var166 = 0; var166 < 5; var166++) {
					field385[var166] = false;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 228) {
				int var167 = field161.method479();
				int var168 = field161.method463();
				if (var168 == 0xFFFF) {
					var168 = -1;
				}

				if (field485[var167] != var168) {
					method26(field485[var167]);
					field485[var167] = var168;
				}

				field370 = true;
				field453 = true;
				field335 = -1;
				return true;
			}

			if (field335 == 15) {
				field288 = field161.method461();
				if (field288 == 1) {
					field183 = field161.method463();
				}

				if (field288 >= 2 && field288 <= 6) {
					if (field288 == 2) {
						field416 = 64;
						field417 = 64;
					}

					if (field288 == 3) {
						field416 = 0;
						field417 = 64;
					}

					if (field288 == 4) {
						field416 = 128;
						field417 = 64;
					}

					if (field288 == 5) {
						field416 = 64;
						field417 = 0;
					}

					if (field288 == 6) {
						field416 = 64;
						field417 = 128;
					}

					field288 = 2;
					field413 = field161.method463();
					field414 = field161.method463();
					field415 = field161.method461();
				}

				if (field288 == 10) {
					field446 = field161.method463();
				}

				field335 = -1;
				return true;
			}

			if (field335 == 220) {
				int var169 = field161.method463();
				byte var170 = field161.method462();
				field367[var169] = var170;

				if (field178[var169] != var170) {
					field178[var169] = var170;
					method38(var169);
					field370 = true;

					if (field365 != -1) {
						field428 = true;
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 140) {
				field218 = field161.method461();
				field217 = field161.method481();
				for (int var171 = field217; var171 < field217 + 8; var171++) {
					for (int var172 = field218; var172 < field218 + 8; var172++) {
						if (field148[field280][var171][var172] != null) {
							field148[field280][var171][var172] = null;
							method67(var171, var172);
						}
					}
				}

				for (CHEFEIMI var173 = (CHEFEIMI) field139.method181(); var173 != null; var173 = (CHEFEIMI) field139.method183()) {
					if (var173.field47 >= field217 && var173.field47 < field217 + 8 && var173.field48 >= field218 && var173.field48 < field218 + 8 && field280 == var173.field45) {
						var173.field56 = 0;
					}
				}

				field335 = -1;
				return true;
			}

			if (field335 == 121) {
				int var174 = field161.method492();
				int var175 = field161.method489();
				int var176 = field161.method491();
				NHFASBOX var177 = NHFASBOX.method339(var175);
				var177.field931 = var176;
				var177.field919 = var174;
				field335 = -1;
				return true;
			}

			if (field335 == 170) {
				method134(field161, field334);
				field321 = false;
				field335 = -1;
				return true;
			}

			if (field335 == 126) {
				int var178 = field161.method489();
				NHFASBOX var179 = NHFASBOX.method339(var178);
				for (int var180 = 0; var180 < var179.field956.length; var180++) {
					var179.field956[var180] = -1;
					var179.field956[var180] = 0;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 194) {
				int var181 = field161.method463();
				int var182 = field161.method490();
				NHFASBOX.method339(var182).field954 = 2;
				NHFASBOX.method339(var182).field955 = var181;
				field335 = -1;
				return true;
			}

			if (field335 == 68) {
				method28();
				field335 = -1;
				return false;
			}

			if (field335 == 80 || field335 == 200 || field335 == 243 || field335 == 34 || field335 == 129 || field335 == 99 || field335 == 189 || field335 == 247 || field335 == 157 || field335 == 144 || field335 == 26) {
				method142(field335, field161);
				field335 = -1;
				return true;
			}

			if (field335 == 139) {
				int var183 = field161.method489();
				int var184 = field161.method488();
				NHFASBOX var185 = NHFASBOX.method339(var183);
				if (var185 != null && var185.field914 == 0) {
					if (var184 < 0) {
						var184 = 0;
					}

					if (var184 > var185.field924 - var185.field893) {
						var184 = var185.field924 - var185.field893;
					}

					var185.field940 = var184;
				}

				field335 = -1;
				return true;
			}

			if (field335 == 59) {
				field384 = true;
				field349 = field161.method461();
				field350 = field161.method461();
				field351 = field161.method463();
				field352 = field161.method461();
				field353 = field161.method461();
				if (field353 >= 100) {
					field220 = field349 * 128 + 64;
					field222 = field350 * 128 + 64;
					field221 = method97(field220, field222, field280) - field351;
				}

				field335 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field335 + "," + field334 + " - " + field495 + "," + field496);
			method28();
		} catch (IOException var190) {
			method43();
		} catch (Exception var191) {
			String var187 = "T2 - " + field335 + "," + field495 + "," + field496 + " - " + field334 + "," + (field133.field1017[0] + field85) + "," + (field133.field1018[0] + field86) + " - ";
			for (int var188 = 0; var188 < field334 && var188 < 50; var188++) {
				var187 = var187 + field161.field1262[var188] + ",";
			}

			signlink.reporterror(var187);
			method28();
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		CHEFEIMI var10 = null;
		for (CHEFEIMI var11 = (CHEFEIMI) field139.method181(); var11 != null; var11 = (CHEFEIMI) field139.method183()) {
			if (var11.field45 == arg5 && var11.field47 == arg6 && var11.field48 == arg7 && var11.field46 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new CHEFEIMI();
			var10.field45 = arg5;
			var10.field46 = arg2;
			var10.field47 = arg6;
			var10.field48 = arg7;
			method156(var10);
			field139.method178(var10);
		}

		var10.field49 = arg8;
		var10.field51 = arg3;
		var10.field50 = arg1;
		var10.field55 = arg4;
		var10.field56 = arg0;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method118() {
		if (field411 != 0) {
			int var1 = 0;
			if (field163 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field204[var2] != null) {
					int var3 = field202[var2];
					String var4 = field203[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field93 == 0 || field93 == 1 && method16(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1381 > 4 && field1382 - 4 > var8 - 10 && field1382 - 4 <= var8 + 3) {
							int var9 = field460.method362("From:  " + var4 + field204[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1381 < var9 + 4) {
								if (field90 >= 1) {
									field401[field399] = "Report abuse @whi@" + var4;
									field241[field399] = 2591;
									field399++;
								}

								field401[field399] = "Add ignore @whi@" + var4;
								field241[field399] = 2673;
								field399++;
								field401[field399] = "Add friend @whi@" + var4;
								field241[field399] = 2839;
								field399++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field93 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method119() {
		if (field163 > 1) {
			field163--;
		}

		if (field338 > 0) {
			field338--;
		}

		for (int var1 = 0; var1 < 5 && method116(); var1++) {
		}

		if (field323) {
			synchronized (field110.field790) {
				if (!field186) {
					field110.field786 = 0;
				} else if (field1387 != 0 || field110.field786 >= 40) {
					field360.method450(51);
					field360.method451(0);
					int var3 = field360.field1263;
					int var4 = 0;
					for (int var5 = 0; var5 < field110.field786 && var3 - field360.field1263 < 240; var5++) {
						var4++;
						int var6 = field110.field787[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field110.field789[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field110.field787[var5] == -1 && field110.field789[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field144 != var7 || field145 != var6) {
							int var9 = var7 - field144;
							field144 = var7;
							int var10 = var6 - field145;
							field145 = var6;

							if (field295 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field360.method452((field295 << 12) + (var9 << 6) + var10);
								field295 = 0;
							} else if (field295 < 8) {
								field360.method454((field295 << 19) + var8 + 0x800000);
								field295 = 0;
							} else {
								field360.method455((field295 << 19) + var8 - 0x40000000);
								field295 = 0;
							}
						} else if (field295 < 2047) {
							field295++;
						}
					}

					field360.method460(field360.field1263 - var3);

					if (var4 >= field110.field786) {
						field110.field786 = 0;
					} else {
						field110.field786 -= var4;
						for (int var11 = 0; var11 < field110.field786; var11++) {
							field110.field789[var11] = field110.field789[var4 + var11];
							field110.field787[var11] = field110.field787[var4 + var11];
						}
					}
				}
			}

			if (field1387 != 0) {
				long var12 = (field1390 - field376) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field376 = field1390;
				int var14 = field1389;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1388;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1387 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field360.method450(27);
				field360.method455((var17 << 19) + (var18 << 20) + var16);
			}

			if (field270 > 0) {
				field270--;
			}

			if (field1391[1] == 1 || field1391[2] == 1 || field1391[3] == 1 || field1391[4] == 1) {
				field271 = true;
			}

			if (field271 && field270 <= 0) {
				field270 = 20;
				field271 = false;
				field360.method450(166);
				field360.method487(field258);
				field360.method486(field257);
			}

			if (field1378 && !field94) {
				field94 = true;
				field360.method450(111);
				field360.method451(1);
			}

			if (!field1378 && field94) {
				field94 = false;
				field360.method450(111);
				field360.method451(0);
			}

			method149();
			method151();
			method74();
			field336++;
			if (field336 > 750) {
				method43();
			}

			method86();
			method103();
			method132();
			field297++;

			if (field315 != 0) {
				field314 += 20;
				if (field314 >= 400) {
					field315 = 0;
				}
			}

			if (field80 != 0) {
				field77++;
				if (field77 >= 15) {
					if (field80 == 2) {
						field370 = true;
					}

					if (field80 == 3) {
						field428 = true;
					}

					field80 = 0;
				}
			}

			if (field291 != 0) {
				field425++;

				if (field1381 > field292 + 5 || field1381 < field292 - 5 || field1382 > field293 + 5 || field1382 < field293 - 5) {
					field193 = true;
				}

				if (field1380 == 0) {
					if (field291 == 2) {
						field370 = true;
					}

					if (field291 == 3) {
						field428 = true;
					}

					field291 = 0;

					if (field193 && field425 >= 5) {
						field262 = -1;
						method84();

						if (field289 == field262 && field290 != field261) {
							NHFASBOX var19 = NHFASBOX.method339(field289);
							byte var20 = 0;
							if (field81 == 1 && var19.field909 == 206) {
								var20 = 1;
							}

							if (var19.field956[field261] <= 0) {
								var20 = 0;
							}

							if (var19.field908) {
								int var21 = field290;
								int var22 = field261;
								var19.field956[var22] = var19.field956[var21];
								var19.field943[var22] = var19.field943[var21];
								var19.field956[var21] = -1;
								var19.field943[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field290;
								int var24 = field261;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method340(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method340(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method340(field261, field290);
							}

							field360.method450(21);
							field360.method452(field289);
							field360.method452(field290);
							field360.method451(var20);
							field360.method485(field261);
						}
					} else if ((field383 == 1 || method50(field399 - 1)) && field399 > 2) {
						method13();
					} else if (field399 > 0) {
						method143(field399 - 1);
					}

					field77 = 10;
					field1387 = 0;
				}
			}

			if (GXHGUSOD.field600 != -1) {
				int var25 = GXHGUSOD.field600;
				int var26 = GXHGUSOD.field601;
				boolean var27 = method92(0, 0, 0, 0, field133.field1017[0], 0, true, field133.field1018[0], 0, var26, var25);
				GXHGUSOD.field600 = -1;

				if (var27) {
					field312 = field1388;
					field313 = field1389;
					field315 = 1;
					field314 = 0;
				}
			}

			if (field1387 == 1 && field277 != null) {
				field277 = null;
				field428 = true;
				field1387 = 0;
			}

			method61();

			if (field393 == -1) {
				method90();
				method122();
				method14();
			}

			if (field1380 == 1 || field1387 == 1) {
				field394++;
			}

			if (field305 == 0 && field226 == 0 && field477 == 0) {
				if (field369 > 0) {
					field369--;
				}
			} else if (field369 < 100) {
				field369++;
				if (field369 == 100) {
					if (field305 != 0) {
						field428 = true;
					}

					if (field226 != 0) {
						field370 = true;
					}
				}
			}

			if (field275 == 2) {
				method85();
			}

			if (field275 == 2 && field384) {
				method60();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field339[var28]++;
			}

			method39();
			field463++;
			if (field463 > 1804) {
				field463 = 0;
				field360.method450(69);
				field360.method451(0);
				int var29 = field360.field1263;
				field360.method451((int) (Math.random() * 256.0D));
				field360.method451(212);
				field360.method452(25280);
				field360.method452((int) (Math.random() * 65536.0D));
				field360.method452((int) (Math.random() * 65536.0D));
				field360.method451((int) (Math.random() * 256.0D));
				field360.method451(181);

				if ((int) (Math.random() * 2.0D) == 0) {
					field360.method451(149);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field360.method451(90);
				}

				field360.method452((int) (Math.random() * 65536.0D));
				field360.method460(field360.field1263 - var29);
			}

			field1379++;
			if (field1379 > 4500) {
				field338 = 250;
				field1379 -= 500;
				field360.method450(244);
			}

			field190++;
			if (field190 > 500) {
				field190 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field251 += field252;
				}

				if ((var30 & 0x2) == 2) {
					field199 += field200;
				}

				if ((var30 & 0x4) == 4) {
					field137 += field138;
				}
			}

			if (field251 < -50) {
				field252 = 2;
			}

			if (field251 > 50) {
				field252 = -2;
			}

			if (field199 < -55) {
				field200 = 2;
			}

			if (field199 > 55) {
				field200 = -2;
			}

			if (field137 < -40) {
				field138 = 1;
			}

			if (field137 > 40) {
				field138 = -1;
			}

			field363++;
			if (field363 > 500) {
				field363 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field246 += field247;
				}

				if ((var31 & 0x2) == 2) {
					field140 += field141;
				}
			}

			if (field246 < -60) {
				field247 = 2;
			}

			if (field246 > 60) {
				field247 = -2;
			}

			if (field140 < -20) {
				field141 = 1;
			}

			if (field140 > 10) {
				field141 = -1;
			}

			field150++;
			if (field150 > 1148) {
				field150 = 0;
				field360.method450(206);
				field360.method451(0);
				int var32 = field360.field1263;
				field360.method452((int) (Math.random() * 65536.0D));
				field360.method451(252);

				if ((int) (Math.random() * 2.0D) == 0) {
					field360.method452(62952);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field360.method451(24);
				}

				field360.method451((int) (Math.random() * 256.0D));
				field360.method451(178);
				field360.method452(7452);
				field360.method451(12);

				if ((int) (Math.random() * 2.0D) == 0) {
					field360.method452(44881);
				}

				field360.method451(10);
				field360.method460(field360.field1263 - var32);
			}

			field337++;
			if (field337 > 50) {
				field360.method450(89);
			}

			try {
				if (field63 != null && field360.field1263 > 0) {
					field63.method411(0, field360.field1263, field360.field1262);
					field360.field1263 = 0;
					field337 = 0;
				}
			} catch (IOException var34) {
				method43();
			} catch (Exception var35) {
				method28();
			}
		}
	}

	@ObfuscatedName("client.a(IIIB)Z")
	public final boolean method120(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field67.method219(field280, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			PXRGLLGB var8 = PXRGLLGB.method417(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1142;
				var10 = var8.field1149;
			} else {
				var9 = var8.field1149;
				var10 = var8.field1142;
			}

			int var11 = var8.field1150;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method92(0, var10, var11, 0, field133.field1017[0], 2, true, field133.field1018[0], var9, arg1, arg0);
		} else {
			method92(var7, 0, 0, var6 + 1, field133.field1017[0], 2, true, field133.field1018[0], 0, arg1, arg0);
		}

		field312 = field1388;
		field313 = field1389;
		field315 = 2;
		field314 = 0;
		return true;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method121() {
		while (true) {
			NFBFXKHQ var1 = field480.method261();
			if (var1 == null) {
				return;
			}

			if (var1.field889 == 0) {
				IYSWJGDE.method271(var1.field886, var1.field887);

				if ((field480.method248(var1.field887) & 0x62) != 0) {
					field370 = true;

					if (field196 != -1 || field365 != -1) {
						field428 = true;
					}
				}
			}

			if (var1.field889 == 1 && var1.field886 != null) {
				PLSPTEPI.method403(var1.field886);
			}

			if (var1.field889 == 2 && field395 == var1.field887 && var1.field886 != null) {
				method139(var1.field886, field396);
			}

			if (var1.field889 == 3 && field275 == 1) {
				for (int var2 = 0; var2 < field238.length; var2++) {
					if (field284[var2] == var1.field887) {
						field238[var2] = var1.field886;

						if (var1.field886 == null) {
							field284[var2] = -1;
						}

						break;
					}

					if (field285[var2] == var1.field887) {
						field418[var2] = var1.field886;

						if (var1.field886 == null) {
							field285[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field889 == 93 && field480.method263(var1.field887)) {
				WMHCOPKE.method572(new SVWJKJVI(var1.field886), field480);
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method122() {
		if (field1387 == 1) {
			if (field1388 >= 539 && field1388 <= 573 && field1389 >= 169 && field1389 < 205 && field485[0] != -1) {
				field370 = true;
				field486 = 0;
				field453 = true;
			}

			if (field1388 >= 569 && field1388 <= 599 && field1389 >= 168 && field1389 < 205 && field485[1] != -1) {
				field370 = true;
				field486 = 1;
				field453 = true;
			}

			if (field1388 >= 597 && field1388 <= 627 && field1389 >= 168 && field1389 < 205 && field485[2] != -1) {
				field370 = true;
				field486 = 2;
				field453 = true;
			}

			if (field1388 >= 625 && field1388 <= 669 && field1389 >= 168 && field1389 < 203 && field485[3] != -1) {
				field370 = true;
				field486 = 3;
				field453 = true;
			}

			if (field1388 >= 666 && field1388 <= 696 && field1389 >= 168 && field1389 < 205 && field485[4] != -1) {
				field370 = true;
				field486 = 4;
				field453 = true;
			}

			if (field1388 >= 694 && field1388 <= 724 && field1389 >= 168 && field1389 < 205 && field485[5] != -1) {
				field370 = true;
				field486 = 5;
				field453 = true;
			}

			if (field1388 >= 722 && field1388 <= 756 && field1389 >= 169 && field1389 < 205 && field485[6] != -1) {
				field370 = true;
				field486 = 6;
				field453 = true;
			}

			if (field1388 >= 540 && field1388 <= 574 && field1389 >= 466 && field1389 < 502 && field485[7] != -1) {
				field370 = true;
				field486 = 7;
				field453 = true;
			}

			if (field1388 >= 572 && field1388 <= 602 && field1389 >= 466 && field1389 < 503 && field485[8] != -1) {
				field370 = true;
				field486 = 8;
				field453 = true;
			}

			if (field1388 >= 599 && field1388 <= 629 && field1389 >= 466 && field1389 < 503 && field485[9] != -1) {
				field370 = true;
				field486 = 9;
				field453 = true;
			}

			if (field1388 >= 627 && field1388 <= 671 && field1389 >= 467 && field1389 < 502 && field485[10] != -1) {
				field370 = true;
				field486 = 10;
				field453 = true;
			}

			if (field1388 >= 669 && field1388 <= 699 && field1389 >= 466 && field1389 < 503 && field485[11] != -1) {
				field370 = true;
				field486 = 11;
				field453 = true;
			}

			if (field1388 >= 696 && field1388 <= 726 && field1389 >= 466 && field1389 < 503 && field485[12] != -1) {
				field370 = true;
				field486 = 12;
				field453 = true;
			}

			if (field1388 >= 724 && field1388 <= 758 && field1389 >= 466 && field1389 < 502 && field485[13] != -1) {
				field370 = true;
				field486 = 13;
				field453 = true;
				return;
			}
		}
	}

	public final void init() {
		field455 = Integer.parseInt(getParameter("nodeid"));
		field456 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method127();
		} else {
			method153();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field457 = false;
		} else {
			field457 = true;
		}

		method554(765, 503);
	}

	@ObfuscatedName("client.E(I)V")
	public final void method123() {
		try {
			field403 = -1;
			field479.method185();
			field135.method185();
			QRNWMOSL.method427();
			method95();
			field67.method189();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field373[var1].method380();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field230[var2][var3][var4] = 0;
					}
				}
			}

			WMHCOPKE var5 = new WMHCOPKE(field377, field230, 104, 104);
			int var6 = field238.length;
			field360.method450(89);

			if (!field478) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field283[var7] >> 8) * 64 - field85;
					int var9 = (field283[var7] & 0xFF) * 64 - field86;
					byte[] var10 = field238[var7];
					if (var10 != null) {
						var5.method563((field128 - 6) * 8, field373, var10, var8, var9, (field127 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field283[var11] >> 8) * 64 - field85;
					int var13 = (field283[var11] & 0xFF) * 64 - field86;
					byte[] var14 = field238[var11];
					if (var14 == null && field128 < 800) {
						var5.method579(var12, var13, 64, 64);
					}
				}

				field360.method450(89);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field418[var15];
					if (var16 != null) {
						int var17 = (field283[var15] >> 8) * 64 - field85;
						int var18 = (field283[var15] & 0xFF) * 64 - field86;
						var5.method578(var16, var17, field67, var18, field373);
					}
				}
			}

			if (field478) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field405[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field283.length; var29++) {
									if (field283[var29] == var28 && field238[var29] != null) {
										var5.method580(var25, (var27 & 0x7) * 8, (var26 & 0x7) * 8, field238[var29], var20 * 8, var21 * 8, var19, var24, field373);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method568(var21 * 8, var20 * 8, var19);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field405[0][var30][var31];
						if (var32 == -1) {
							var5.method579(var30 * 8, var31 * 8, 8, 8);
						}
					}
				}

				field360.method450(89);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field405[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field283.length; var42++) {
									if (field283[var42] == var41 && field418[var42] != null) {
										var5.method581(var35 * 8, var38, (var40 & 0x7) * 8, (var39 & 0x7) * 8, field373, var37, field418[var42], var34 * 8, field67, var33);
										break;
									}
								}
							}
						}
					}
				}
			}

			field360.method450(89);
			var5.method574(field67, field373);

			if (field491 != null) {
				field491.method316();
				QRNWMOSL.field1180 = field168;
			}

			field360.method450(89);
			int var43 = WMHCOPKE.field1445;
			if (var43 > field280) {
				var43 = field280;
			}

			if (var43 < field280 - 1) {
				int var44 = field280 - 1;
			}

			if (field458) {
				field67.method190(WMHCOPKE.field1445);
			} else {
				field67.method190(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method67(var45, var46);
				}
			}

			method24();
		} catch (Exception var59) {
		}

		PXRGLLGB.field1135.method177();

		if (field1376 != null) {
			field360.method450(226);
			field360.method455(1057001181);
		}

		if (field458 && signlink.cache_dat != null) {
			int var48 = field480.method244(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field480.method248(var49);
				if ((var50 & 0x79) == 0) {
					IYSWJGDE.method272(var49);
				}
			}
		}

		System.gc();
		QRNWMOSL.method428(20);
		field480.method260();
		int var51 = (field127 - 6) / 8 - 1;
		int var52 = (field127 + 6) / 8 + 1;
		int var53 = (field128 - 6) / 8 - 1;
		int var54 = (field128 + 6) / 8 + 1;
		if (field299) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field480.method259(0, var55, var56);
					if (var57 != -1) {
						field480.method262(var57, 3);
					}

					int var58 = field480.method259(1, var55, var56);
					if (var58 != -1) {
						field480.method262(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILSVWJKJVI;)V")
	public final void method124(int arg0, SVWJKJVI arg1) {
		while (arg1.field1264 + 10 < arg0 * 8) {
			int var3 = arg1.method472(11);
			if (var3 == 2047) {
				break;
			}

			if (field431[var3] == null) {
				field431[var3] = new KVXZMJHR();
				if (field436[var3] != null) {
					field431[var3].method324(field436[var3]);
				}
			}

			field433[field432++] = var3;
			KVXZMJHR var4 = field431[var3];
			var4.field1000 = field316;
			int var5 = arg1.method472(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method472(1);
			int var7 = arg1.method472(1);
			if (var7 == 1) {
				field435[field434++] = var3;
			}

			int var8 = arg1.method472(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method344(field133.field1018[0] + var5, var6 == 1, field133.field1017[0] + var8);
		}

		arg1.method473();
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg1 >= 1 && arg4 <= 102 && arg1 <= 102) {
			if (field458 && field280 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field67.method215(arg2, arg4, arg1);
			}

			if (arg0 == 1) {
				var8 = field67.method216(arg2, arg4, arg1);
			}

			if (arg0 == 2) {
				var8 = field67.method217(arg2, arg4, arg1);
			}

			if (arg0 == 3) {
				var8 = field67.method218(arg2, arg4, arg1);
			}

			if (var8 != 0) {
				int var12 = field67.method219(arg2, arg4, arg1, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field67.method206(arg2, arg1, arg4);
					PXRGLLGB var16 = PXRGLLGB.method417(var13);
					if (var16.field1124) {
						field373[arg2].method385(var15, var16.field1132, arg1, arg4, var14);
					}
				}

				if (arg0 == 1) {
					field67.method207(arg2, arg4, arg1);
				}

				if (arg0 == 2) {
					field67.method208(arg4, arg1, arg2);
					PXRGLLGB var17 = PXRGLLGB.method417(var13);
					if (var17.field1142 + arg4 > 103 || var17.field1142 + arg1 > 103 || var17.field1149 + arg4 > 103 || var17.field1149 + arg1 > 103) {
						return;
					}

					if (var17.field1124) {
						field373[arg2].method386(var15, arg4, var17.field1132, arg1, var17.field1142, var17.field1149);
					}
				}

				if (arg0 == 3) {
					field67.method209(arg1, arg2, arg4);
					PXRGLLGB var18 = PXRGLLGB.method417(var13);
					if (var18.field1124 && var18.field1143) {
						field373[arg2].method388(arg4, arg1);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field230[1][arg4][arg1] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				WMHCOPKE.method575(arg4, field377, arg5, arg6, field373[arg2], field67, arg2, var19, arg3, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LNHFASBOX;IIBIIIII)V")
	public final void method126(NHFASBOX arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field267) {
			field346 = 32;
		} else {
			field346 = 0;
		}

		field267 = false;
		if (arg4 >= arg6 && arg4 < arg6 + 16 && arg7 >= arg1 && arg7 < arg1 + 16) {
			arg0.field940 -= field394 * 4;

			if (arg2 == 1) {
				field370 = true;
			}

			if (arg2 == 2 || arg2 == 3) {
				field428 = true;
			}
		} else if (arg4 >= arg6 && arg4 < arg6 + 16 && arg7 >= arg1 + arg3 - 16 && arg7 < arg1 + arg3) {
			arg0.field940 += field394 * 4;

			if (arg2 == 1) {
				field370 = true;
			}

			if (arg2 == 2 || arg2 == 3) {
				field428 = true;
			}
		} else if (arg4 >= arg6 - field346 && arg4 < arg6 + field346 + 16 && arg7 >= arg1 + 16 && arg7 < arg1 + arg3 - 16 && field394 > 0) {
			int var9 = (arg3 - 32) * arg3 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg1 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg0.field940 = (arg5 - arg3) * var10 / var11;

			if (arg2 == 1) {
				field370 = true;
			}

			if (arg2 == 2 || arg2 == 3) {
				field428 = true;
			}

			field267 = true;
		}
	}

	@ObfuscatedName("client.n(B)V")
	public static final void method127() {
		GXHGUSOD.field566 = true;
		QRNWMOSL.field1169 = true;
		field458 = true;
		WMHCOPKE.field1449 = true;
		PXRGLLGB.field1158 = true;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method128() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.o(B)V")
	public final void method129() {
		field489.method316();
		QRNWMOSL.field1180 = field167;
		field107.method599(0, 0);

		if (field245 != -1) {
			method65(NHFASBOX.method339(field245), 0, 0, 0);
		} else if (field485[field486] != -1) {
			method65(NHFASBOX.method339(field485[field486]), 0, 0, 0);
		}

		if (field452 && field152 == 1) {
			method136();
		}

		field489.method317(205, 553, field1373);
		field491.method316();
		QRNWMOSL.field1180 = field168;
	}

	@ObfuscatedName("client.d(BI)V")
	public final void method130(int arg0) {
		if (!field458) {
			for (int var2 = 0; var2 < field450.length; var2++) {
				int var3 = field450[var2];
				if (QRNWMOSL.field1188[var3] >= arg0) {
					ZXDQRRNS var4 = QRNWMOSL.field1182[var3];
					int var5 = var4.field1511 * var4.field1510 - 1;
					int var6 = field297 * var4.field1510 * 2;
					byte[] var7 = var4.field1508;
					byte[] var8 = field318;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1508 = var8;
					field318 = var7;
					QRNWMOSL.method431(var3);
					field333++;
					if (field333 > 1734) {
						field333 = 0;
						field360.method450(217);
						field360.method451(0);
						int var10 = field360.field1263;

						if ((int) (Math.random() * 2.0D) == 0) {
							field360.method452(8354);
						}

						field360.method451((int) (Math.random() * 256.0D));
						field360.method452((int) (Math.random() * 65536.0D));
						field360.method452(46806);
						field360.method452(61169);
						field360.method451(228);
						field360.method452((int) (Math.random() * 65536.0D));
						field360.method452(22457);
						field360.method451((int) (Math.random() * 256.0D));
						field360.method451((int) (Math.random() * 256.0D));
						field360.method460(field360.field1263 - var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILSVWJKJVI;B)V")
	public final void method131(int arg0, SVWJKJVI arg1) {
		field273 = 0;
		field434 = 0;
		method17(arg1, arg0);
		method33(arg1, arg0);
		method98(arg1, arg0);

		for (int var3 = 0; var3 < field273; var3++) {
			int var4 = field274[var3];
			if (field316 != field175[var4].field1000) {
				field175[var4].field1056 = null;
				field175[var4] = null;
			}
		}

		if (arg1.field1263 != arg0) {
			signlink.reporterror(field344 + " size mismatch in getnpcpos - pos:" + arg1.field1263 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field176; var5++) {
			if (field175[field177[var5]] == null) {
				signlink.reporterror(field344 + " null entry in npc list - pos:" + var5 + " size:" + field176);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method132() {
		for (int var1 = -1; var1 < field432; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field430;
			} else {
				var2 = field433[var1];
			}

			KVXZMJHR var3 = field431[var2];
			if (var3 != null && var3.field1004 > 0) {
				var3.field1004--;
				if (var3.field1004 == 0) {
					var3.field986 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field176; var4++) {
			int var5 = field177[var4];
			PEHNWFXK var6 = field175[var5];
			if (var6 != null && var6.field1004 > 0) {
				var6.field1004--;
				if (var6.field1004 == 0) {
					var6.field986 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method133(boolean arg0) {
		if (field133.field972 >> 7 == field387 && field133.field973 >> 7 == field388) {
			field387 = 0;
		}

		int var2 = field432;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			KVXZMJHR var4;
			int var5;
			if (arg0) {
				var4 = field133;
				var5 = field430 << 14;
			} else {
				var4 = field431[field433[var3]];
				var5 = field433[var3] << 14;
			}

			if (var4 != null && var4.method325()) {
				var4.field852 = false;
				if ((field458 && field432 > 50 || field432 > 200) && !arg0 && var4.field988 == var4.field967) {
					var4.field852 = true;
				}

				int var6 = var4.field972 >> 7;
				int var7 = var4.field973 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field845 == null || field316 < var4.field858 || field316 >= var4.field859) {
						if ((var4.field972 & 0x7F) == 0x40 && (var4.field973 & 0x7F) == 0x40) {
							if (field400[var6][var7] == field359) {
								continue;
							}

							field400[var6][var7] = field359;
						}

						var4.field849 = method97(var4.field972, var4.field973, field280);
						field67.method200(var4.field849, var4.field973, field280, var4, var4.field987, var4.field974, var5, 60, var4.field972);
					} else {
						var4.field852 = false;
						var4.field849 = method97(var4.field972, var4.field973, field280);
						field67.method201(var4.field861, var4.field972, var4.field862, field280, var4.field863, var4.field849, var4, var4.field864, var4.field973, var5, 60, var4.field974);
					}
				}
			}
		}
	}

	public final void run() {
		if (field420) {
			method152();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(BLSVWJKJVI;I)V")
	public final void method134(SVWJKJVI arg0, int arg1) {
		field273 = 0;
		field434 = 0;
		method37(arg1, arg0);
		method88(arg0, arg1);
		method124(arg1, arg0);
		method75(arg0, arg1);

		for (int var3 = 0; var3 < field273; var3++) {
			int var4 = field274[var3];
			if (field316 != field431[var4].field1000) {
				field431[var4] = null;
			}
		}

		if (arg0.field1263 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1263 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field432; var5++) {
			if (field431[field433[var5]] == null) {
				signlink.reporterror(field344 + " null entry in pl list - pos:" + var5 + " size:" + field432);
				throw new RuntimeException("eek");
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 362);

			if (arg0.length == 5) {
				field455 = Integer.parseInt(arg0[0]);
				field456 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method127();
				} else if (arg0[2].equals("highmem")) {
					method153();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field457 = false;
				} else if (arg0[3].equals("members")) {
					field457 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method553(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method135() {
		field492.method316();
		QRNWMOSL.field1180 = field166;
		field109.method599(0, 0);

		if (field104) {
			field461.method360(40, field95, 239, 0);
			field461.method360(60, field201 + "*", 239, 128);
		} else if (field379 == 1) {
			field461.method360(40, "Enter amount:", 239, 0);
			field461.method360(60, field66 + "*", 239, 128);
		} else if (field379 == 2) {
			field461.method360(40, "Enter name:", 239, 0);
			field461.method360(60, field66 + "*", 239, 128);
		} else if (field379 == 3) {
			if (field99 != field66) {
				method22(field66);
				field99 = field66;
			}

			ONSICLVF var1 = field460;
			DEVPLWNC.method161(463, 0, 77, 0);

			for (int var2 = 0; var2 < field100; var2++) {
				int var3 = var2 * 14 + 18 - field103;
				if (var3 > 0 && var3 < 110) {
					var1.method360(var3, field101[var2], 239, 0);
				}
			}

			DEVPLWNC.method160();

			if (field100 > 5) {
				method148(0, field100 * 14 + 7, 463, 77, field103);
			}

			if (field66.length() == 0) {
				field461.method360(40, "Enter object name", 239, 255);
			} else if (field100 == 0) {
				field461.method360(40, "No matching objects found, please shorten search", 239, 0);
			}

			var1.method360(90, field66 + "*", 239, 0);
			DEVPLWNC.method167(0, 479, 0, 77);
		} else if (field277 != null) {
			field461.method360(40, field277, 239, 0);
			field461.method360(60, "Click to continue", 239, 128);
		} else if (field196 != -1) {
			method65(NHFASBOX.method339(field196), 0, 0, 0);
		} else if (field365 == -1) {
			ONSICLVF var4 = field460;
			int var5 = 0;
			DEVPLWNC.method161(463, 0, 77, 0);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field204[var6] != null) {
					int var7 = field202[var6];
					int var8 = field348 + 70 - var5 * 14;
					String var9 = field203[var6];
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
							var4.method364(var8, 0, 4, field204[var6]);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field57 == 0 || field57 == 1 && method16(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field254[0].method599(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field254[1].method599(var8 - 12, var11);
								var11 += 14;
							}

							var4.method364(var8, 0, var11, var9 + ":");
							var11 += var4.method362(var9) + 8;
							var4.method364(var8, 255, var11, field204[var6]);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field411 == 0 && (var7 == 7 || field93 == 0 || field93 == 1 && method16(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method364(var8, 0, var12, "From");
							int var14 = var12 + var4.method362("From ");
							if (var10 == 1) {
								field254[0].method599(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field254[1].method599(var8 - 12, var14);
								var14 += 14;
							}

							var4.method364(var8, 0, var14, var9 + ":");
							var14 += var4.method362(var9) + 8;
							var4.method364(var8, 0x800000, var14, field204[var6]);
						}

						var5++;
					}

					if (var7 == 4 && (field158 == 0 || field158 == 1 && method16(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method364(var8, 0x800080, 4, var9 + " " + field204[var6]);
						}

						var5++;
					}

					if (var7 == 5 && field411 == 0 && field93 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method364(var8, 0x800000, 4, field204[var6]);
						}

						var5++;
					}

					if (var7 == 6 && field411 == 0 && field93 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method364(var8, 0, 4, "To " + var9 + ":");
							var4.method364(var8, 0x800000, var4.method362("To " + var9) + 12, field204[var6]);
						}

						var5++;
					}

					if (var7 == 8 && (field158 == 0 || field158 == 1 && method16(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method364(var8, 0x7E3200, 4, var9 + " " + field204[var6]);
						}

						var5++;
					}
				}
			}

			DEVPLWNC.method160();
			field188 = var5 * 14 + 7;
			if (field188 < 78) {
				field188 = 78;
			}

			method148(0, field188, 463, 77, field188 - field348 - 77);
			String var13;
			if (field133 == null || field133.field853 == null) {
				var13 = ASZHZJYZ.method9(field344);
			} else {
				var13 = field133.field853;
			}

			var4.method364(90, 0, 4, var13 + ":");
			var4.method364(90, 255, var4.method362(var13 + ": ") + 6, field182 + "*");
			DEVPLWNC.method167(0, 479, 0, 77);
		} else {
			method65(NHFASBOX.method339(field365), 0, 0, 0);
		}

		if (field452 && field152 == 2) {
			method136();
		}

		field492.method317(357, 17, field1373);
		field491.method316();
		QRNWMOSL.field1180 = field168;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method136() {
		int var1 = field153;
		int var2 = field154;
		int var3 = field155;
		int var4 = field156;
		int var5 = 0x5D5447;
		DEVPLWNC.method164(var5, var4, var1, var3, var2);
		DEVPLWNC.method164(0, 16, var1 + 1, var3 - 2, var2 + 1);
		DEVPLWNC.method165(0, var1 + 1, var2 + 18, var4 - 19, var3 - 2);
		field461.method364(var2 + 14, var5, var1 + 3, "Choose Option");
		int var6 = field1381;
		int var7 = field1382;
		if (field152 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field152 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field152 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field399; var8++) {
			int var9 = (field399 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field461.method368(var10, true, field401[var8], var1 + 3, var9);
		}
	}

	@ObfuscatedName("client.a(LNHFASBOX;Z)Z")
	public final boolean method137(NHFASBOX arg0) {
		if (arg0.field932 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field932.length; var2++) {
			int var3 = method41(var2, arg0);
			int var4 = arg0.field894[var2];
			if (arg0.field932[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field932[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field932[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method138(String arg0) {
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

	@ObfuscatedName("client.a(B[BZ)V")
	public final void method139(byte[] arg0, boolean arg1) {
		if (field143) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method140(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(ZILjava/lang/String;)V")
	public final void method141(int arg0, String arg1) {
		field464 = arg0;
		field250 = arg1;
		method47();

		if (field298 == null) {
			super.method141(arg0, arg1);
		} else {
			field209.method316();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field461.method360(var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", var3 / 2, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			DEVPLWNC.method165(0x8C1111, var3 / 2 - 152, var6, 34, 304);
			DEVPLWNC.method165(0, var3 / 2 - 151, var6 + 1, 32, 302);
			DEVPLWNC.method164(0x8C1111, 30, var3 / 2 - 150, arg0 * 3, var6 + 2);
			DEVPLWNC.method164(0, 30, arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, var6 + 2);
			field461.method360(var4 / 2 + 5 - var5, arg1, var3 / 2, 0xFFFFFF);
			field209.method317(171, 202, field1373);

			if (field364) {
				field364 = false;

				if (!field84) {
					field210.method317(0, 0, field1373);
					field211.method317(0, 637, field1373);
				}

				field207.method317(0, 128, field1373);
				field208.method317(371, 202, field1373);
				field212.method317(265, 0, field1373);
				field213.method317(265, 562, field1373);
				field214.method317(171, 128, field1373);
				field215.method317(171, 562, field1373);
			}
		}
	}

	@ObfuscatedName("client.b(IILSVWJKJVI;)V")
	public final void method142(int arg0, SVWJKJVI arg1) {
		if (arg0 == 243) {
			int var3 = arg1.method480();
			int var4 = (var3 >> 4 & 0x7) + field217;
			int var5 = (var3 & 0x7) + field218;
			byte var6 = arg1.method482();
			int var7 = arg1.method490();
			int var8 = arg1.method480();
			int var9 = var8 >> 2;
			int var10 = var8 & 0x3;
			int var11 = field343[var9];
			int var12 = arg1.method489();
			byte var13 = arg1.method484();
			int var14 = arg1.method463();
			int var15 = arg1.method490();
			byte var16 = arg1.method483();
			byte var17 = arg1.method462();
			KVXZMJHR var18;
			if (field438 == var14) {
				var18 = field133;
			} else {
				var18 = field431[var14];
			}

			if (var18 != null) {
				PXRGLLGB var19 = PXRGLLGB.method417(var12);
				int var20 = field377[field280][var4][var5];
				int var21 = field377[field280][var4 + 1][var5];
				int var22 = field377[field280][var4 + 1][var5 + 1];
				int var23 = field377[field280][var4][var5 + 1];
				IYSWJGDE var24 = var19.method414(var9, var10, var20, var21, var22, var23, -1);
				if (var24 != null) {
					method117(var7 + 1, 0, var11, 0, var15 + 1, field280, var4, var5, -1);
					var18.field858 = field316 + var15;
					var18.field859 = field316 + var7;
					var18.field845 = var24;
					int var25 = var19.field1142;
					int var26 = var19.field1149;
					if (var10 == 1 || var10 == 3) {
						var25 = var19.field1149;
						var26 = var19.field1142;
					}

					var18.field842 = var4 * 128 + var25 * 64;
					var18.field844 = var5 * 128 + var26 * 64;
					var18.field843 = method97(var18.field842, var18.field844, field280);

					if (var6 > var16) {
						byte var27 = var6;
						var6 = var16;
						var16 = var27;
					}

					if (var13 > var17) {
						byte var28 = var13;
						var13 = var17;
						var17 = var28;
					}

					var18.field861 = var4 + var6;
					var18.field863 = var4 + var16;
					var18.field862 = var5 + var13;
					var18.field864 = var5 + var17;
				}
			}
		}

		if (arg0 == 200) {
			int var29 = arg1.method461();
			int var30 = (var29 >> 4 & 0x7) + field217;
			int var31 = (var29 & 0x7) + field218;
			int var32 = arg1.method463();
			int var33 = arg1.method463();
			int var34 = arg1.method463();
			if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
				ETMNPRAF var35 = field148[field280][var30][var31];
				if (var35 != null) {
					for (WEHUNTCT var36 = (WEHUNTCT) var35.method181(); var36 != null; var36 = (WEHUNTCT) var35.method183()) {
						if ((var32 & 0x7FFF) == var36.field1413 && var36.field1414 == var33) {
							var36.field1414 = var34;
							break;
						}
					}

					method67(var30, var31);
				}
			}
		} else if (arg0 == 157) {
			int var37 = arg1.method481();
			int var38 = (var37 >> 4 & 0x7) + field217;
			int var39 = (var37 & 0x7) + field218;
			int var40 = arg1.method463();
			int var41 = arg1.method480();
			int var42 = var41 >> 2;
			int var43 = var41 & 0x3;
			int var44 = field343[var42];
			if (var38 >= 0 && var39 >= 0 && var38 < 103 && var39 < 103) {
				int var45 = field377[field280][var38][var39];
				int var46 = field377[field280][var38 + 1][var39];
				int var47 = field377[field280][var38 + 1][var39 + 1];
				int var48 = field377[field280][var38][var39 + 1];
				if (var44 == 0) {
					LGISJLTP var49 = field67.method211(field280, var38, var39);
					if (var49 != null) {
						int var50 = var49.field874 >> 14 & 0x7FFF;
						if (var42 == 2) {
							var49.field872 = new INFJTSRJ(var47, var46, var50, var40, 2, var43 + 4, false, var45, var48);
							var49.field873 = new INFJTSRJ(var47, var46, var50, var40, 2, var43 + 1 & 0x3, false, var45, var48);
						} else {
							var49.field872 = new INFJTSRJ(var47, var46, var50, var40, var42, var43, false, var45, var48);
						}
					}
				}

				if (var44 == 1) {
					NSKZZFDC var51 = field67.method212(var39, field280, var38);
					if (var51 != null) {
						var51.field1024 = new INFJTSRJ(var47, var46, var51.field1025 >> 14 & 0x7FFF, var40, 4, 0, false, var45, var48);
					}
				}

				if (var44 == 2) {
					VNAYNNSA var52 = field67.method213(field280, var38, var39);

					if (var42 == 11) {
						var42 = 10;
					}

					if (var52 != null) {
						var52.field1352 = new INFJTSRJ(var47, var46, var52.field1360 >> 14 & 0x7FFF, var40, var42, var43, false, var45, var48);
					}
				}

				if (var44 == 3) {
					XGICCTRV var53 = field67.method214(var38, var39, field280);
					if (var53 != null) {
						var53.field1471 = new INFJTSRJ(var47, var46, var53.field1472 >> 14 & 0x7FFF, var40, 22, var43, false, var45, var48);
					}
				}
			}
		} else {
			if (arg0 == 80) {
				int var54 = arg1.method461();
				int var55 = (var54 >> 4 & 0x7) + field217;
				int var56 = (var54 & 0x7) + field218;
				int var57 = arg1.method463();
				int var58 = arg1.method461();
				int var59 = var58 >> 4 & 0xF;
				int var60 = var58 & 0x7;
				if (field133.field1017[0] >= var55 - var59 && field133.field1017[0] <= var55 + var59 && field133.field1018[0] >= var56 - var59 && field133.field1018[0] <= var56 + var59 && field216 && !field458 && field195 < 50) {
					field256[field195] = var57;
					field375[field195] = var60;
					field320[field195] = JRSHCCMF.field796[var57];
					field195++;
				}
			}

			if (arg0 == 99) {
				int var61 = arg1.method461();
				int var62 = (var61 >> 4 & 0x7) + field217;
				int var63 = (var61 & 0x7) + field218;
				int var64 = var62 + arg1.method462();
				int var65 = var63 + arg1.method462();
				int var66 = arg1.method464();
				int var67 = arg1.method463();
				int var68 = arg1.method461() * 4;
				int var69 = arg1.method461() * 4;
				int var70 = arg1.method463();
				int var71 = arg1.method463();
				int var72 = arg1.method461();
				int var73 = arg1.method461();
				if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104 && var67 != 0xFFFF) {
					var62 = var62 * 128 + 64;
					var63 = var63 * 128 + 64;
					var64 = var64 * 128 + 64;
					var65 = var65 * 128 + 64;
					AAKFEJZP var74 = new AAKFEJZP(field316 + var70, method97(var62, var63, field280) - var68, field280, var62, var73, var66, var69, var67, var63, var72, field316 + var71);
					var74.method3(var64, var65, method97(var64, var65, field280) - var69, field316 + var70);
					field135.method178(var74);
				}
			} else if (arg0 == 189) {
				int var75 = arg1.method488();
				int var76 = arg1.method461();
				int var77 = (var76 >> 4 & 0x7) + field217;
				int var78 = (var76 & 0x7) + field218;
				if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
					ETMNPRAF var79 = field148[field280][var77][var78];
					if (var79 != null) {
						for (WEHUNTCT var80 = (WEHUNTCT) var79.method181(); var80 != null; var80 = (WEHUNTCT) var79.method183()) {
							if ((var75 & 0x7FFF) == var80.field1413) {
								var80.method331();
								break;
							}
						}

						if (var79.method181() == null) {
							field148[field280][var77][var78] = null;
						}

						method67(var77, var78);
					}
				}
			} else if (arg0 == 144) {
				int var81 = arg1.method479();
				int var82 = (var81 >> 4 & 0x7) + field217;
				int var83 = (var81 & 0x7) + field218;
				int var84 = arg1.method479();
				int var85 = var84 >> 2;
				int var86 = var84 & 0x3;
				int var87 = field343[var85];
				if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
					method117(-1, var86, var87, var85, 0, field280, var82, var83, -1);
				}
			} else if (arg0 == 26) {
				int var88 = arg1.method490();
				int var89 = arg1.method480();
				int var90 = (var89 >> 4 & 0x7) + field217;
				int var91 = (var89 & 0x7) + field218;
				int var92 = arg1.method461();
				int var93 = var92 >> 2;
				int var94 = var92 & 0x3;
				int var95 = field343[var93];
				if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
					method117(-1, var94, var95, var93, 0, field280, var90, var91, var88);
				}
			} else if (arg0 == 34) {
				int var96 = arg1.method490();
				int var97 = arg1.method489();
				int var98 = arg1.method489();
				int var99 = arg1.method461();
				int var100 = (var99 >> 4 & 0x7) + field217;
				int var101 = (var99 & 0x7) + field218;
				if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && field438 != var96) {
					WEHUNTCT var102 = new WEHUNTCT();
					var102.field1413 = var97;
					var102.field1414 = var98;

					if (field148[field280][var100][var101] == null) {
						field148[field280][var100][var101] = new ETMNPRAF();
					}

					field148[field280][var100][var101].method178(var102);
					method67(var100, var101);
				}
			} else if (arg0 == 247) {
				int var103 = arg1.method489();
				int var104 = arg1.method481();
				int var105 = (var104 >> 4 & 0x7) + field217;
				int var106 = (var104 & 0x7) + field218;
				int var107 = arg1.method463();
				if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
					WEHUNTCT var108 = new WEHUNTCT();
					var108.field1413 = var107;
					var108.field1414 = var103;

					if (field148[field280][var105][var106] == null) {
						field148[field280][var105][var106] = new ETMNPRAF();
					}

					field148[field280][var105][var106].method178(var108);
					method67(var105, var106);
				}
			} else if (arg0 == 129) {
				int var109 = arg1.method461();
				int var110 = (var109 >> 4 & 0x7) + field217;
				int var111 = (var109 & 0x7) + field218;
				int var112 = arg1.method463();
				int var113 = arg1.method461();
				int var114 = arg1.method463();
				if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
					var110 = var110 * 128 + 64;
					var111 = var111 * 128 + 64;
					PEKVALKR var115 = new PEKVALKR(field280, var114, var112, var111, field316, method97(var110, var111, field280) - var113, var110);
					field479.method178(var115);
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method143(int arg0) {
		if (arg0 >= 0) {
			int var2 = field239[arg0];
			int var3 = field240[arg0];
			int var4 = field241[arg0];
			int var5 = field242[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field379 != 0 && var4 != 1467) {
				field379 = 0;
				field428 = true;
			}

			if (var4 == 210) {
				field360.method450(132);
				field360.method452(var5);
				field360.method452(field233);
				field360.method485(var3);
				field360.method485(var2);
				field77 = 0;
				field78 = var3;
				field79 = var2;
				field80 = 2;
				if (NHFASBOX.method339(var3).field947 == field301) {
					field80 = 1;
				}

				if (NHFASBOX.method339(var3).field947 == field196) {
					field80 = 3;
				}
			}

			if (var4 == 919) {
				field360.method450(50);
				field360.method452(var2);
				field360.method486(var5);
				field360.method485(field467);
				field360.method487(var3);
				field360.method452(field468);
				field360.method487(field466);
				field77 = 0;
				field78 = var3;
				field79 = var2;
				field80 = 2;
				if (NHFASBOX.method339(var3).field947 == field301) {
					field80 = 1;
				}

				if (NHFASBOX.method339(var3).field947 == field196) {
					field80 = 3;
				}
			}

			if (var4 == 310) {
				PEHNWFXK var6 = field175[var5];
				if (var6 != null) {
					method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var6.field1018[0], var6.field1017[0]);
					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;
					field360.method450(126);
					field360.method487(var5);
				}
			}

			if (var4 == 622) {
				KVXZMJHR var7 = field431[var5];
				if (var7 != null) {
					method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var7.field1018[0], var7.field1017[0]);
					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;
					field360.method450(59);
					field360.method452(var5);
				}
			}

			if (var4 == 136) {
				method26(field365);
				field365 = -1;
				field428 = true;
			}

			if (var4 == 480 || var4 == 189) {
				String var8 = field401[arg0];
				int var9 = var8.indexOf("@whi@");
				if (var9 != -1) {
					var8 = var8.substring(var9 + 5).trim();
					String var10 = ASZHZJYZ.method9(ASZHZJYZ.method6(ASZHZJYZ.method5(var8)));
					boolean var11 = false;
					for (int var12 = 0; var12 < field432; var12++) {
						KVXZMJHR var13 = field431[field433[var12]];
						if (var13 != null && var13.field853 != null && var13.field853.equalsIgnoreCase(var10)) {
							method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var13.field1018[0], var13.field1017[0]);

							if (var4 == 480) {
								field382++;
								if (field382 >= 82) {
									field360.method450(188);
									field360.method455(0);
									field382 = 0;
								}

								field360.method450(128);
								field360.method485(field433[var12]);
							}

							if (var4 == 189) {
								field360.method450(186);
								field360.method452(field433[var12]);
							}

							var11 = true;
							break;
						}
					}

					if (!var11) {
						method45("", 0, "Unable to find " + var10);
					}
				}
			}

			if (var4 == 218) {
				PEHNWFXK var14 = field175[var5];
				if (var14 != null) {
					method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var14.field1018[0], var14.field1017[0]);
					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;
					field360.method450(29);
					field360.method485(var5);
				}
			}

			if (var4 == 221) {
				field360.method450(7);
				field360.method452(var3);
				field360.method485(var5);
				field360.method485(var2);
				field77 = 0;
				field78 = var3;
				field79 = var2;
				field80 = 2;
				if (NHFASBOX.method339(var3).field947 == field301) {
					field80 = 1;
				}

				if (NHFASBOX.method339(var3).field947 == field196) {
					field80 = 3;
				}
			}

			if (var4 == 483) {
				boolean var15 = method92(0, 0, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 0, var3, var2);
				if (!var15) {
					method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var3, var2);
				}

				field312 = field1388;
				field313 = field1389;
				field315 = 2;
				field314 = 0;
				field360.method450(144);
				field360.method485(field86 + var3);
				field360.method452(field85 + var2);
				field360.method486(var5);
			}

			if (var4 == 631) {
				if ((var5 & 0x3) == 0) {
					field330++;
				}

				if (field330 >= 96) {
					field360.method450(15);
					field360.method452(61151);
					field330 = 0;
				}

				field360.method450(94);
				field360.method485(var5);
				field360.method485(var2);
				field360.method452(var3);
				field77 = 0;
				field78 = var3;
				field79 = var2;
				field80 = 2;
				if (NHFASBOX.method339(var3).field947 == field301) {
					field80 = 1;
				}

				if (NHFASBOX.method339(var3).field947 == field196) {
					field80 = 3;
				}
			}

			if (var4 == 526) {
				method146();
			}

			if (var4 == 738) {
				NHFASBOX var17 = NHFASBOX.method339(var3);
				field232 = 1;
				field233 = var3;
				field234 = var17.field903;
				field465 = 0;
				field370 = true;
				String var18 = var17.field933;
				if (var18.indexOf(" ") != -1) {
					var18 = var18.substring(0, var18.indexOf(" "));
				}

				String var19 = var17.field933;
				if (var19.indexOf(" ") != -1) {
					var19 = var19.substring(var19.indexOf(" ") + 1);
				}

				field235 = var18 + " " + var17.field934 + " " + var19;

				if (field234 == 16) {
					field370 = true;
					field486 = 3;
					field453 = true;
				}
			} else {
				if (var4 == 444) {
					String var20 = field401[arg0];
					int var21 = var20.indexOf("@whi@");
					if (var21 != -1) {
						long var22 = ASZHZJYZ.method5(var20.substring(var21 + 5).trim());
						int var24 = -1;
						for (int var25 = 0; var25 < field355; var25++) {
							if (field443[var25] == var22) {
								var24 = var25;
								break;
							}
						}

						if (var24 != -1 && field105[var24] > 0) {
							field428 = true;
							field379 = 0;
							field104 = true;
							field201 = "";
							field162 = 3;
							field92 = field443[var24];
							field95 = "Enter message to send to " + field444[var24];
						}
					}
				}

				if (var4 == 87) {
					method120(var2, var3, var5);
					field360.method450(134);
					field360.method486(field85 + var2);
					field360.method452(field86 + var3);
					field360.method487(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 879) {
					boolean var26 = method92(0, 0, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 0, var3, var2);
					if (!var26) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var3, var2);
					}

					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;
					field360.method450(136);
					field360.method452(var5);
					field360.method485(field86 + var3);
					field360.method486(field85 + var2);
				}

				if (var4 == 138) {
					PEHNWFXK var28 = field175[var5];
					if (var28 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var28.field1018[0], var28.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field360.method450(203);
						field360.method485(var5);
					}
				}

				if (var4 == 207) {
					field360.method450(73);
					field360.method452(var3);
					field360.method485(var5);
					field360.method485(var2);
					field77 = 0;
					field78 = var3;
					field79 = var2;
					field80 = 2;
					if (NHFASBOX.method339(var3).field947 == field301) {
						field80 = 1;
					}

					if (NHFASBOX.method339(var3).field947 == field196) {
						field80 = 3;
					}
				}

				if (var4 == 769) {
					boolean var29 = method92(0, 0, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 0, var3, var2);
					if (!var29) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var3, var2);
					}

					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;
					field360.method450(88);
					field360.method486(field85 + var2);
					field360.method452(field233);
					field360.method486(var5);
					field360.method452(field86 + var3);
				}

				if (var4 == 389) {
					PEHNWFXK var31 = field175[var5];
					if (var31 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var31.field1018[0], var31.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field360.method450(117);
						field360.method452(field233);
						field360.method485(var5);
					}
				}

				if (var4 == 669) {
					KVXZMJHR var32 = field431[var5];
					if (var32 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var32.field1018[0], var32.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field360.method450(34);
						field360.method486(field466);
						field360.method487(var5);
						field360.method485(field468);
						field360.method452(field467);
					}
				}

				if (var4 == 228) {
					field360.method450(208);
					field360.method486(var2);
					field360.method485(var3);
					field360.method486(var5);
					field77 = 0;
					field78 = var3;
					field79 = var2;
					field80 = 2;
					if (NHFASBOX.method339(var3).field947 == field301) {
						field80 = 1;
					}

					if (NHFASBOX.method339(var3).field947 == field196) {
						field80 = 3;
					}
				}

				if (var4 == 1826) {
					VIWDEJKN var33 = VIWDEJKN.method544(var5);
					NHFASBOX var34 = NHFASBOX.method339(var3);
					String var35;
					if (var34 != null && var34.field943[var2] >= 100000) {
						var35 = var34.field943[var2] + " x " + var33.field1311;
					} else if (var33.field1319 == null) {
						var35 = "It's a " + var33.field1311 + ".";
					} else {
						var35 = new String(var33.field1319);
					}

					method45("", 0, var35);
				}

				if (var4 == 675) {
					field360.method450(104);
					field360.method486(var5);
					field360.method485(var2);
					field360.method452(var3);
					field77 = 0;
					field78 = var3;
					field79 = var2;
					field80 = 2;
					if (NHFASBOX.method339(var3).field947 == field301) {
						field80 = 1;
					}

					if (NHFASBOX.method339(var3).field947 == field196) {
						field80 = 3;
					}
				}

				if (var4 == 227) {
					PEHNWFXK var36 = field175[var5];
					if (var36 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var36.field1018[0], var36.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field360.method450(78);
						field360.method486(field467);
						field360.method487(field468);
						field360.method487(field466);
						field360.method487(var5);
					}
				}

				if (var4 == 685) {
					KVXZMJHR var37 = field431[var5];
					if (var37 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var37.field1018[0], var37.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field360.method450(186);
						field360.method452(var5);
					}
				}

				if (var4 == 77) {
					boolean var38 = method92(0, 0, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 0, var3, var2);
					if (!var38) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var3, var2);
					}

					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;
					field360.method450(235);
					field360.method486(var5);
					field360.method452(field85 + var2);
					field360.method487(field86 + var3);
				}

				if (var4 == 941) {
					field360.method450(133);
					field360.method485(var5);
					field360.method487(var3);
					field360.method485(var2);
					field77 = 0;
					field78 = var3;
					field79 = var2;
					field80 = 2;
					if (NHFASBOX.method339(var3).field947 == field301) {
						field80 = 1;
					}

					if (NHFASBOX.method339(var3).field947 == field196) {
						field80 = 3;
					}
				}

				if (var4 == 707) {
					method120(var2, var3, var5);
					field360.method450(116);
					field360.method486(field86 + var3);
					field360.method485(var5 >> 14 & 0x7FFF);
					field360.method452(field85 + var2);
				}

				if (var4 == 94) {
					field360.method450(192);
					field360.method452(var3);
					field360.method452(var5);
					field360.method452(var2);
					field77 = 0;
					field78 = var3;
					field79 = var2;
					field80 = 2;
					if (NHFASBOX.method339(var3).field947 == field301) {
						field80 = 1;
					}

					if (NHFASBOX.method339(var3).field947 == field196) {
						field80 = 3;
					}
				}

				if (var4 == 821) {
					if (field452) {
						field67.method227(var3 - 4, var2 - 4);
					} else {
						field67.method227(field1389 - 4, field1388 - 4);
					}
				}

				if (var4 == 883) {
					field360.method450(221);
					field360.method487(var5);
					field360.method487(var2);
					field360.method487(var3);
					field77 = 0;
					field78 = var3;
					field79 = var2;
					field80 = 2;
					if (NHFASBOX.method339(var3).field947 == field301) {
						field80 = 1;
					}

					if (NHFASBOX.method339(var3).field947 == field196) {
						field80 = 3;
					}
				}

				if (var4 == 749) {
					KVXZMJHR var40 = field431[var5];
					if (var40 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var40.field1018[0], var40.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field382++;
						if (field382 >= 82) {
							field360.method450(188);
							field360.method455(0);
							field382 = 0;
						}

						field360.method450(128);
						field360.method485(var5);
					}
				}

				if (var4 == 453 && method120(var2, var3, var5)) {
					field360.method450(181);
					field360.method452(field467);
					field360.method485(field468);
					field360.method486(field466);
					field360.method487(var5 >> 14 & 0x7FFF);
					field360.method485(field85 + var2);
					field360.method486(field86 + var3);
				}

				if (var4 == 1013) {
					PEHNWFXK var41 = field175[var5];
					if (var41 != null) {
						PIPBZEOV var42 = var41.field1056;
						if (var42.field1082 != null) {
							var42 = var42.method397();
						}

						if (var42 != null) {
							String var43;
							if (var42.field1067 == null) {
								var43 = "It's a " + var42.field1080 + ".";
							} else {
								var43 = new String(var42.field1067);
							}

							method45("", 0, var43);
						}
					}
				}

				if (var4 == 491) {
					boolean var44 = method92(0, 0, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 0, var3, var2);
					if (!var44) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var3, var2);
					}

					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;

					if ((field86 & 0x3) == 0) {
						field248++;
					}

					if (field248 >= 108) {
						field360.method450(159);
						field360.method454(0x4BBDFA);
						field248 = 0;
					}

					field360.method450(160);
					field360.method452(var5);
					field360.method485(field86 + var3);
					field360.method487(field85 + var2);
				}

				if (var4 == 455) {
					boolean var46 = method92(0, 0, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 0, var3, var2);
					if (!var46) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var3, var2);
					}

					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;
					field360.method450(40);
					field360.method486(field85 + var2);
					field360.method452(var5);
					field360.method485(field86 + var3);
				}

				if (var4 == 1198) {
					method120(var2, var3, var5);
					field360.method450(31);
					field360.method452(var5 >> 14 & 0x7FFF);
					field360.method452(field86 + var3);
					field360.method487(field85 + var2);
				}

				if (var4 == 544) {
					KVXZMJHR var48 = field431[var5];
					if (var48 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var48.field1018[0], var48.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field360.method450(167);
						field360.method487(var5);
						field360.method486(field233);
					}
				}

				if (var4 == 256) {
					field360.method450(16);
					field360.method452(var3);
					NHFASBOX var49 = NHFASBOX.method339(var3);
					if (var49.field939 != null && var49.field939[0][0] == 5) {
						int var50 = var49.field939[0][1];
						field178[var50] = 1 - field178[var50];
						method38(var50);
						field370 = true;
					}
				}

				if (var4 == 1648) {
					int var51 = var5 >> 14 & 0x7FFF;
					PXRGLLGB var52 = PXRGLLGB.method417(var51);
					String var53;
					if (var52.field1159 == null) {
						var53 = "It's a " + var52.field1160 + ".";
					} else {
						var53 = new String(var52.field1159);
					}

					method45("", 0, var53);
				}

				if (var4 == 192 && !field227) {
					field360.method450(33);
					field360.method452(var3);
					field227 = true;
				}

				if (var4 == 956) {
					boolean var54 = method92(0, 0, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 0, var3, var2);
					if (!var54) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var3, var2);
					}

					field312 = field1388;
					field313 = field1389;
					field315 = 2;
					field314 = 0;
					field360.method450(10);
					field360.method485(var5);
					field360.method486(field468);
					field360.method452(field85 + var2);
					field360.method487(field86 + var3);
					field360.method486(field466);
					field360.method487(field467);
				}

				if (var4 == 832) {
					KVXZMJHR var56 = field431[var5];
					if (var56 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var56.field1018[0], var56.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field317++;
						if (field317 >= 78) {
							field360.method450(227);
							field360.method454(0xF7DC7F);
							field317 = 0;
						}

						field360.method450(47);
						field360.method487(var5);
					}
				}

				if (var4 == 379) {
					field360.method450(36);
					field360.method452(var2);
					field360.method485(var5);
					field360.method452(var3);
					field77 = 0;
					field78 = var3;
					field79 = var2;
					field80 = 2;
					if (NHFASBOX.method339(var3).field947 == field301) {
						field80 = 1;
					}

					if (NHFASBOX.method339(var3).field947 == field196) {
						field80 = 3;
					}
				}

				if (var4 == 1914) {
					VIWDEJKN var57 = VIWDEJKN.method544(var5);
					String var58;
					if (var57.field1319 == null) {
						var58 = "It's a " + var57.field1311 + ".";
					} else {
						var58 = new String(var57.field1319);
					}

					method45("", 0, var58);
				}

				if (var4 == 128) {
					NHFASBOX var59 = NHFASBOX.method339(var3);
					boolean var60 = true;
					if (var59.field909 > 0) {
						var60 = method20(var59);
					}

					if (var60) {
						field360.method450(16);
						field360.method452(var3);
					}
				}

				if (var4 == 405) {
					method120(var2, var3, var5);
					field360.method450(239);
					field360.method452(var5 >> 14 & 0x7FFF);
					field360.method485(field85 + var2);
					field360.method486(field86 + var3);
				}

				if (var4 == 839 || var4 == 673 || var4 == 613 || var4 == 557) {
					String var61 = field401[arg0];
					int var62 = var61.indexOf("@whi@");
					if (var62 != -1) {
						long var63 = ASZHZJYZ.method5(var61.substring(var62 + 5).trim());
						if (var4 == 839) {
							method57(var63);
						}

						if (var4 == 673) {
							method31(var63);
						}

						if (var4 == 613) {
							method66(var63);
						}

						if (var4 == 557) {
							method34(var63);
						}
					}
				}

				if (var4 == 745) {
					PEHNWFXK var65 = field175[var5];
					if (var65 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var65.field1018[0], var65.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field249 += var5;
						if (field249 >= 65) {
							field360.method450(0);
							field249 = 0;
						}

						field360.method450(163);
						field360.method452(var5);
					}
				}

				if (var4 == 530) {
					KVXZMJHR var66 = field431[var5];
					if (var66 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var66.field1018[0], var66.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field360.method450(153);
						field360.method486(var5);
					}
				}

				if (var4 == 211) {
					field360.method450(16);
					field360.method452(var3);
					NHFASBOX var67 = NHFASBOX.method339(var3);
					if (var67.field939 != null && var67.field939[0][0] == 5) {
						int var68 = var67.field939[0][1];
						if (field178[var68] != var67.field894[0]) {
							field178[var68] = var67.field894[0];
							method38(var68);
							field370 = true;
						}
					}
				}

				if (var4 == 424) {
					if ((var2 & 0x3) == 0) {
						field89++;
					}

					if (field89 >= 54) {
						field360.method450(247);
						field360.method455(0);
						field89 = 0;
					}

					method120(var2, var3, var5);
					field360.method450(57);
					field360.method452(field85 + var2);
					field360.method486(field86 + var3);
					field360.method487(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 591) {
					String var69 = field401[arg0];
					int var70 = var69.indexOf("@whi@");
					if (var70 != -1) {
						if (field301 == -1) {
							method146();
							field424 = var69.substring(var70 + 5).trim();
							field404 = false;
							field264 = field301 = NHFASBOX.field930;
						} else {
							method45("", 0, "Please close the interface you have open before using 'report abuse'");
						}
					}
				}

				if (var4 == 23 && method120(var2, var3, var5)) {
					field360.method450(80);
					field360.method452(var5 >> 14 & 0x7FFF);
					field360.method487(field233);
					field360.method486(field86 + var3);
					field360.method485(field85 + var2);
				}

				if (var4 == 616) {
					PEHNWFXK var71 = field175[var5];
					if (var71 != null) {
						method92(0, 1, 0, 0, field133.field1017[0], 2, false, field133.field1018[0], 1, var71.field1018[0], var71.field1017[0]);
						field312 = field1388;
						field313 = field1389;
						field315 = 2;
						field314 = 0;
						field360.method450(14);
						field360.method486(var5);
					}
				}

				if (var4 == 860) {
					field465 = 1;
					field466 = var2;
					field467 = var3;
					field468 = var5;
					field469 = String.valueOf(VIWDEJKN.method544(var5).field1311);
					field232 = 0;
					field370 = true;
				} else {
					if (var4 == 292) {
						field360.method450(172);
						field360.method486(var3);
						field360.method486(var5);
						field360.method486(var2);
						field77 = 0;
						field78 = var3;
						field79 = var2;
						field80 = 2;
						if (NHFASBOX.method339(var3).field947 == field301) {
							field80 = 1;
						}

						if (NHFASBOX.method339(var3).field947 == field196) {
							field80 = 3;
						}
					}

					field465 = 0;
					field232 = 0;
					field370 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method144() {
		field84 = false;
		while (field64) {
			field84 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field303 = null;
		field304 = null;
		field296 = null;
		field407 = null;
		field408 = null;
		field409 = null;
		field410 = null;
		field164 = null;
		field165 = null;
		field180 = null;
		field181 = null;
		field197 = null;
		field198 = null;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.b(I)V")
	public final void method145() {
		field364 = true;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method146() {
		field360.method450(30);

		if (field245 != -1) {
			method26(field245);
			field245 = -1;
			field370 = true;
			field227 = false;
			field453 = true;
		}

		if (field196 != -1) {
			method26(field196);
			field196 = -1;
			field428 = true;
			field227 = false;
		}

		if (field393 != -1) {
			method26(field393);
			field393 = -1;
			field364 = true;
		}

		if (field147 != -1) {
			method26(field147);
			field147 = -1;
		}

		if (field301 != -1) {
			method26(field301);
			field301 = -1;
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method147() {
		short var1 = 256;

		if (field278 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field278 > 768) {
					field407[var2] = method30(1024 - field278, field409[var2], field408[var2]);
				} else if (field278 > 256) {
					field407[var2] = field409[var2];
				} else {
					field407[var2] = method30(256 - field278, field408[var2], field409[var2]);
				}
			}
		} else if (field279 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field279 > 768) {
					field407[var3] = method30(1024 - field279, field410[var3], field408[var3]);
				} else if (field279 > 256) {
					field407[var3] = field410[var3];
				} else {
					field407[var3] = method30(256 - field279, field408[var3], field410[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field407[var4] = field408[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field210.field818[var5] = field197.field1027[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field451[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field180[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field407[var12];
					int var15 = field210.field818[var7];
					field210.field818[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field210.method317(0, 0, field1373);

		for (int var16 = 0; var16 < 33920; var16++) {
			field211.field818[var16] = field198.field1027[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field451[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field180[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field407[var23];
					int var26 = field211.field818[var18];
					field211.field818[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field211.method317(0, 637, field1373);
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field487.method599(arg0, arg2);
		field488.method599(arg0 + arg3 - 16, arg2);
		DEVPLWNC.method164(field406, arg3 - 32, arg2, 16, arg0 + 16);
		int var6 = (arg3 - 32) * arg3 / arg1;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg4 / (arg1 - arg3);
		DEVPLWNC.method164(field324, var6, arg2, 16, arg0 + var7 + 16);
		DEVPLWNC.method169(arg0 + var7 + 16, arg2, field286, var6);
		DEVPLWNC.method169(arg0 + var7 + 16, arg2 + 1, field286, var6);
		DEVPLWNC.method167(arg2, 16, field286, arg0 + var7 + 16);
		DEVPLWNC.method167(arg2, 16, field286, arg0 + var7 + 17);
		DEVPLWNC.method169(arg0 + var7 + 16, arg2 + 15, field427, var6);
		DEVPLWNC.method169(arg0 + var7 + 17, arg2 + 14, field427, var6 - 1);
		DEVPLWNC.method167(arg2, 16, field427, arg0 + var7 + var6 + 15);
		DEVPLWNC.method167(arg2 + 1, 15, field427, arg0 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.I(I)V")
	public final void method149() {
		if (field458 && field275 == 2 && WMHCOPKE.field1448 != field280) {
			method29("Loading - please wait.", null);
			field275 = 1;
			field447 = System.currentTimeMillis();
		}

		if (field275 == 1) {
			int var1 = method150();
			if (var1 != 0 && System.currentTimeMillis() - field447 > 360000L) {
				signlink.reporterror(field344 + " glcfb " + field236 + "," + var1 + "," + field458 + "," + field300[0] + "," + field480.method249() + "," + field280 + "," + field127 + "," + field128);
				field447 = System.currentTimeMillis();
			}
		}

		if (field275 == 2 && field403 != field280) {
			field403 = field280;
			method76(field280);
		}
	}

	@ObfuscatedName("client.J(I)I")
	public final int method150() {
		for (int var1 = 0; var1 < field238.length; var1++) {
			if (field238[var1] == null && field284[var1] != -1) {
				return -1;
			}

			if (field418[var1] == null && field285[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field238.length; var3++) {
			byte[] var4 = field418[var3];
			if (var4 != null) {
				int var5 = (field283[var3] >> 8) * 64 - field85;
				int var6 = (field283[var3] & 0xFF) * 64 - field86;
				if (field478) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= WMHCOPKE.method561(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field321) {
			return -4;
		} else {
			field275 = 2;
			WMHCOPKE.field1448 = field280;
			method123();
			field360.method450(138);
			return 0;
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method151() {
		if (field275 == 2) {
			for (CHEFEIMI var1 = (CHEFEIMI) field139.method181(); var1 != null; var1 = (CHEFEIMI) field139.method183()) {
				if (var1.field56 > 0) {
					var1.field56--;
				}

				if (var1.field56 != 0) {
					if (var1.field55 > 0) {
						var1.field55--;
					}

					if (var1.field55 == 0 && var1.field47 >= 1 && var1.field48 >= 1 && var1.field47 <= 102 && var1.field48 <= 102 && (var1.field49 < 0 || WMHCOPKE.method570(var1.field49, var1.field51))) {
						method125(var1.field46, var1.field48, var1.field45, var1.field50, var1.field47, var1.field49, var1.field51);
						var1.field55 = -1;

						if (var1.field52 == var1.field49 && var1.field52 == -1) {
							var1.method331();
						} else if (var1.field52 == var1.field49 && var1.field53 == var1.field50 && var1.field54 == var1.field51) {
							var1.method331();
						}
					}
				} else if (var1.field52 < 0 || WMHCOPKE.method570(var1.field52, var1.field54)) {
					method125(var1.field46, var1.field48, var1.field45, var1.field53, var1.field47, var1.field52, var1.field54);
					var1.method331();
				}
			}
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method152() {
		field64 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field84) {
				field91++;
				method69();
				method69();
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

		field64 = false;
	}

	@ObfuscatedName("client.n(Z)V")
	public static final void method153() {
		GXHGUSOD.field566 = false;
		QRNWMOSL.field1169 = false;
		field458 = false;
		WMHCOPKE.field1449 = false;
		PXRGLLGB.field1158 = false;
	}

	@ObfuscatedName("client.L(I)Ljava/net/Socket;")
	public final Socket method154(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a()V")
	public final void method155() {
		method141(20, "Starting up");

		if (signlink.sunjava) {
			field1367 = 5;
		}

		if (field362) {
			field347 = true;
		} else {
			field362 = true;
			boolean var1 = false;
			String var2 = method96();
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
						field300[var3] = new XFNDANMT(signlink.cache_idx[var3], 500000, signlink.cache_dat, var3 + 1);
					}
				}

				try {
					method89();
					field298 = method68(25, 1, field374[1], "title", "title screen");
					field459 = new ONSICLVF(field298, false, "p11_full");
					field460 = new ONSICLVF(field298, false, "p12_full");
					field461 = new ONSICLVF(field298, false, "b12_full");
					field462 = new ONSICLVF(field298, true, "q8_full");
					method27();
					method72();
					WEMOPWVJ var4 = method68(30, 2, field374[2], "config", "config");
					WEMOPWVJ var5 = method68(35, 3, field374[3], "interface", "interface");
					WEMOPWVJ var6 = method68(40, 4, field374[4], "media", "2d graphics");
					WEMOPWVJ var7 = method68(45, 6, field374[6], "textures", "textures");
					WEMOPWVJ var8 = method68(50, 7, field374[7], "wordenc", "chat system");
					WEMOPWVJ var9 = method68(55, 8, field374[8], "sounds", "sound effects");
					field230 = new byte[4][104][104];
					field377 = new int[4][105][105];
					field67 = new GXHGUSOD(4, 104, 104, field377);

					for (int var10 = 0; var10 < 4; var10++) {
						field373[var10] = new OXMJPDWD(104, 104);
					}

					field389 = new OMAKLDKI(512, 512);
					WEMOPWVJ var11 = method68(60, 5, field374[5], "versionlist", "update list");
					method141(60, "Connecting to update server");
					field480 = new IHBKBLZU();
					field480.method251(var11, this);
					PLSPTEPI.method402(field480.method256());
					IYSWJGDE.method270(field480.method244(0), field480);

					if (!field458) {
						field395 = 0;
						field396 = true;
						field480.method245(2, field395);

						while (field480.method249() > 0) {
							method121();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field480.field669 > 3) {
								method138("ondemand");
								return;
							}
						}
					}

					method141(65, "Requesting animations");
					int var12 = field480.method244(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field480.method245(1, var13);
					}

					while (field480.method249() > 0) {
						int var14 = var12 - field480.method249();
						if (var14 > 0) {
							method141(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method121();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field480.field669 > 3) {
							method138("ondemand");
							return;
						}
					}

					method141(70, "Requesting models");
					int var15 = field480.method244(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field480.method248(var16);
						if ((var17 & 0x1) != 0) {
							field480.method245(0, var16);
						}
					}

					int var18 = field480.method249();
					while (field480.method249() > 0) {
						int var19 = var18 - field480.method249();
						if (var19 > 0) {
							method141(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method121();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field300[0] != null) {
						method141(75, "Requesting maps");
						field480.method245(3, field480.method259(0, 47, 48));
						field480.method245(3, field480.method259(1, 47, 48));
						field480.method245(3, field480.method259(0, 48, 48));
						field480.method245(3, field480.method259(1, 48, 48));
						field480.method245(3, field480.method259(0, 49, 48));
						field480.method245(3, field480.method259(1, 49, 48));
						field480.method245(3, field480.method259(0, 47, 47));
						field480.method245(3, field480.method259(1, 47, 47));
						field480.method245(3, field480.method259(0, 48, 47));
						field480.method245(3, field480.method259(1, 48, 47));
						field480.method245(3, field480.method259(0, 48, 148));
						field480.method245(3, field480.method259(1, 48, 148));
						int var20 = field480.method249();
						while (field480.method249() > 0) {
							int var21 = var20 - field480.method249();
							if (var21 > 0) {
								method141(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method121();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field480.method244(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field480.method248(var23);
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
							field480.method253(var25, 0, var23);
						}
					}

					field480.method258(field457);

					if (!field458) {
						int var26 = field480.method244(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field480.method255(var27)) {
								field480.method253((byte) 1, 2, var27);
							}
						}
					}

					method141(80, "Unpacking media");
					field107 = new ZXDQRRNS(var6, "invback", 0);
					field109 = new ZXDQRRNS(var6, "chatback", 0);
					field108 = new ZXDQRRNS(var6, "mapback", 0);
					field309 = new ZXDQRRNS(var6, "backbase1", 0);
					field310 = new ZXDQRRNS(var6, "backbase2", 0);
					field311 = new ZXDQRRNS(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field357[var28] = new ZXDQRRNS(var6, "sideicons", var28);
					}

					field445 = new OMAKLDKI(var6, "compass", 0);
					field171 = new OMAKLDKI(var6, "mapedge", 0);
					field171.method348();

					for (int var29 = 0; var29 < 72; var29++) {
						field354[var29] = new ZXDQRRNS(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field341[var30] = new OMAKLDKI(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field281[var31] = new OMAKLDKI(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field493[var32] = new OMAKLDKI(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field386[var33] = new OMAKLDKI(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field129[var34] = new OMAKLDKI(var6, "headicons_hint", var34);
					}

					field308 = new OMAKLDKI(var6, "overlay_multiway", 0);
					field482 = new OMAKLDKI(var6, "mapmarker", 0);
					field483 = new OMAKLDKI(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field97[var35] = new OMAKLDKI(var6, "cross", var35);
					}

					field471 = new OMAKLDKI(var6, "mapdots", 0);
					field472 = new OMAKLDKI(var6, "mapdots", 1);
					field473 = new OMAKLDKI(var6, "mapdots", 2);
					field474 = new OMAKLDKI(var6, "mapdots", 3);
					field475 = new OMAKLDKI(var6, "mapdots", 4);
					field487 = new ZXDQRRNS(var6, "scrollbar", 0);
					field488 = new ZXDQRRNS(var6, "scrollbar", 1);
					field58 = new ZXDQRRNS(var6, "redstone1", 0);
					field59 = new ZXDQRRNS(var6, "redstone2", 0);
					field60 = new ZXDQRRNS(var6, "redstone3", 0);
					field61 = new ZXDQRRNS(var6, "redstone1", 0);
					field61.method596();
					field62 = new ZXDQRRNS(var6, "redstone2", 0);
					field62.method596();
					field325 = new ZXDQRRNS(var6, "redstone1", 0);
					field325.method597();
					field326 = new ZXDQRRNS(var6, "redstone2", 0);
					field326.method597();
					field327 = new ZXDQRRNS(var6, "redstone3", 0);
					field327.method597();
					field328 = new ZXDQRRNS(var6, "redstone1", 0);
					field328.method596();
					field328.method597();
					field329 = new ZXDQRRNS(var6, "redstone2", 0);
					field329.method596();
					field329.method597();

					for (int var36 = 0; var36 < 2; var36++) {
						field254[var36] = new ZXDQRRNS(var6, "mod_icons", var36);
					}

					OMAKLDKI var37 = new OMAKLDKI(var6, "backleft1", 0);
					field68 = new KJGJRATW(method82(), var37.field1028, var37.field1029);
					var37.method349(0, 0);
					OMAKLDKI var38 = new OMAKLDKI(var6, "backleft2", 0);
					field69 = new KJGJRATW(method82(), var38.field1028, var38.field1029);
					var38.method349(0, 0);
					OMAKLDKI var39 = new OMAKLDKI(var6, "backright1", 0);
					field70 = new KJGJRATW(method82(), var39.field1028, var39.field1029);
					var39.method349(0, 0);
					OMAKLDKI var40 = new OMAKLDKI(var6, "backright2", 0);
					field71 = new KJGJRATW(method82(), var40.field1028, var40.field1029);
					var40.method349(0, 0);
					OMAKLDKI var41 = new OMAKLDKI(var6, "backtop1", 0);
					field72 = new KJGJRATW(method82(), var41.field1028, var41.field1029);
					var41.method349(0, 0);
					OMAKLDKI var42 = new OMAKLDKI(var6, "backvmid1", 0);
					field73 = new KJGJRATW(method82(), var42.field1028, var42.field1029);
					var42.method349(0, 0);
					OMAKLDKI var43 = new OMAKLDKI(var6, "backvmid2", 0);
					field74 = new KJGJRATW(method82(), var43.field1028, var43.field1029);
					var43.method349(0, 0);
					OMAKLDKI var44 = new OMAKLDKI(var6, "backvmid3", 0);
					field75 = new KJGJRATW(method82(), var44.field1028, var44.field1029);
					var44.method349(0, 0);
					OMAKLDKI var45 = new OMAKLDKI(var6, "backhmid2", 0);
					field76 = new KJGJRATW(method82(), var45.field1028, var45.field1029);
					var45.method349(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field341[var50] != null) {
							field341[var50].method347(var48 + var49, var47 + var49, var46 + var49);
						}

						if (field354[var50] != null) {
							field354[var50].method598(var48 + var49, var47 + var49, var46 + var49);
						}
					}

					method141(83, "Unpacking textures");
					QRNWMOSL.method429(var7);
					QRNWMOSL.method433(0.8D);
					QRNWMOSL.method428(20);
					method141(86, "Unpacking config");
					KMWMLVIH.method319(var4);
					PXRGLLGB.method416(var4);
					EPJTEXKD.method171(var4);
					VIWDEJKN.method548(var4);
					PIPBZEOV.method396(var4);
					UGUHDANY.method496(var4);
					RTDMFIDA.method446(var4);
					KHDRIUSF.method314(var4);
					GQWQHTHS.method186(var4);
					VIWDEJKN.field1344 = field457;

					if (!field458) {
						method141(90, "Unpacking sounds");
						byte[] var51 = var9.method559("sounds.dat", null);
						SVWJKJVI var52 = new SVWJKJVI(var51);
						JRSHCCMF.method308(var52);
					}

					method141(95, "Unpacking interfaces");
					ONSICLVF[] var53 = new ONSICLVF[] { field459, field460, field461, field462 };
					NHFASBOX.method335(var5, var6, var53);
					method141(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field108.field1508[field108.field1510 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field192[var54] = var55;
						field237[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field108.field1508[field108.field1510 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field121[var58 - 5] = var59 - 25;
						field476[var58 - 5] = var60 - var59;
					}

					QRNWMOSL.method426(503, 765);
					field169 = QRNWMOSL.field1180;
					QRNWMOSL.method426(96, 479);
					field166 = QRNWMOSL.field1180;
					QRNWMOSL.method426(261, 190);
					field167 = QRNWMOSL.field1180;
					QRNWMOSL.method426(334, 512);
					field168 = QRNWMOSL.field1180;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = QRNWMOSL.field1178[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					GXHGUSOD.method225(334, 800, var62, 512, 500);
					UIPOGFJQ.method502(var8);
					field110 = new JAGFVRIK(this);
					method87(field110, 10);
					INFJTSRJ.field703 = this;
					PXRGLLGB.field1136 = this;
					PIPBZEOV.field1086 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field250 + " " + field464);
					field172 = true;
				}
			} else {
				field159 = true;
			}
		}
	}

	@ObfuscatedName("client.a(LCHEFEIMI;B)V")
	public final void method156(CHEFEIMI arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field46 == 0) {
			var2 = field67.method215(arg0.field45, arg0.field47, arg0.field48);
		}

		if (arg0.field46 == 1) {
			var2 = field67.method216(arg0.field45, arg0.field47, arg0.field48);
		}

		if (arg0.field46 == 2) {
			var2 = field67.method217(arg0.field45, arg0.field47, arg0.field48);
		}

		if (arg0.field46 == 3) {
			var2 = field67.method218(arg0.field45, arg0.field47, arg0.field48);
		}

		if (var2 != 0) {
			int var6 = field67.method219(arg0.field45, arg0.field47, arg0.field48, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field52 = var3;
		arg0.field54 = var4;
		arg0.field53 = var5;
	}

	@ObfuscatedName("client.e(III)V")
	public final void method157(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field204[var4] != null) {
				int var5 = field202[var4];
				int var6 = field348 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field203[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field57 == 0 || field57 == 1 && method16(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field133.field853)) {
						if (field90 >= 1) {
							field401[field399] = "Report abuse @whi@" + var7;
							field241[field399] = 591;
							field399++;
						}

						field401[field399] = "Add ignore @whi@" + var7;
						field241[field399] = 673;
						field399++;
						field401[field399] = "Add friend @whi@" + var7;
						field241[field399] = 839;
						field399++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field411 == 0 && (var5 == 7 || field93 == 0 || field93 == 1 && method16(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field90 >= 1) {
							field401[field399] = "Report abuse @whi@" + var7;
							field241[field399] = 591;
							field399++;
						}

						field401[field399] = "Add ignore @whi@" + var7;
						field241[field399] = 673;
						field399++;
						field401[field399] = "Add friend @whi@" + var7;
						field241[field399] = 839;
						field399++;
					}

					var3++;
				}

				if (var5 == 4 && (field158 == 0 || field158 == 1 && method16(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field401[field399] = "Accept trade @whi@" + var7;
						field241[field399] = 480;
						field399++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field411 == 0 && field93 < 2) {
					var3++;
				}

				if (var5 == 8 && (field158 == 0 || field158 == 1 && method16(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field401[field399] = "Accept challenge @whi@" + var7;
						field241[field399] = 189;
						field399++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method158(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field228 = "";
				field229 = "Connecting to server...";
				method101(true);
			}

			field63 = new PTISUREQ(this, method154(field456 + 43594));
			long var4 = ASZHZJYZ.method5(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field360.field1263 = 0;
			field360.method451(14);
			field360.method451(var6);
			field63.method411(0, 2, field360.field1262);

			for (int var7 = 0; var7 < 8; var7++) {
				field63.method408();
			}

			int var8 = field63.method408();
			int var9 = var8;

			if (var8 == 0) {
				field63.method410(field161.field1262, 0, 8);
				field161.field1263 = 0;
				field236 = field161.method467();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field236 >> 32), (int) field236 };
				field360.field1263 = 0;
				field360.method451(10);
				field360.method455(var10[0]);
				field360.method455(var10[1]);
				field360.method455(var10[2]);
				field360.method455(var10[3]);
				field360.method455(signlink.uid);
				field360.method458(arg0);
				field360.method458(arg1);
				field360.method476(field412, field134);
				field390.field1263 = 0;

				if (arg2) {
					field390.method451(18);
				} else {
					field390.method451(16);
				}

				field390.method451(field360.field1263 + 36 + 1 + 1 + 2);
				field390.method451(255);
				field390.method452(362);
				field390.method451(field458 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field390.method455(field374[var11]);
				}

				field390.method459(0, field360.field1262, field360.field1263);
				field360.field1267 = new OPLZBITI(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field437 = new OPLZBITI(var10);
				field63.method411(0, field390.field1263, field390.field1262);
				var8 = field63.method408();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method158(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field90 = field63.method408();
				field186 = field63.method408() == 1;
				field376 = 0L;
				field295 = 0;
				field110.field786 = 0;
				field1378 = true;
				field94 = true;
				field323 = true;
				field360.field1263 = 0;
				field161.field1263 = 0;
				field335 = -1;
				field494 = -1;
				field495 = -1;
				field496 = -1;
				field334 = 0;
				field336 = 0;
				field163 = 0;
				field338 = 0;
				field288 = 0;
				field399 = 0;
				field452 = false;
				field1379 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field204[var13] = null;
				}

				field465 = 0;
				field232 = 0;
				field275 = 0;
				field195 = 0;
				field251 = (int) (Math.random() * 100.0D) - 50;
				field199 = (int) (Math.random() * 110.0D) - 55;
				field137 = (int) (Math.random() * 80.0D) - 40;
				field246 = (int) (Math.random() * 120.0D) - 60;
				field140 = (int) (Math.random() * 30.0D) - 20;
				field258 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field189 = 0;
				field403 = -1;
				field387 = 0;
				field388 = 0;
				field432 = 0;
				field176 = 0;

				for (int var14 = 0; var14 < field429; var14++) {
					field431[var14] = null;
					field436[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field175[var15] = null;
				}

				field133 = field431[field430] = new KVXZMJHR();
				field135.method185();
				field479.method185();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field148[var16][var17][var18] = null;
						}
					}
				}

				field139 = new ETMNPRAF();
				field356 = 0;
				field355 = 0;
				method26(field365);
				field365 = -1;
				method26(field196);
				field196 = -1;
				method26(field301);
				field301 = -1;
				method26(field393);
				field393 = -1;
				method26(field147);
				field147 = -1;
				method26(field245);
				field245 = -1;
				method26(field358);
				field358 = -1;
				field227 = false;
				field486 = 3;
				field379 = 0;
				field452 = false;
				field104 = false;
				field277 = null;
				field184 = 0;
				field225 = -1;
				field146 = true;
				method94();

				for (int var19 = 0; var19 < 5; var19++) {
					field187[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field331[var20] = null;
					field332[var20] = false;
				}

				field136 = 0;
				field330 = 0;
				field249 = 0;
				field317 = 0;
				field382 = 0;
				field89 = 0;
				field248 = 0;
				method40();
			} else if (var8 == 3) {
				field228 = "";
				field229 = "Invalid username or password.";
			} else if (var8 == 4) {
				field228 = "Your account has been disabled.";
				field229 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field228 = "Your account is already logged in.";
				field229 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field228 = "RuneScape has been updated!";
				field229 = "Please reload this page.";
			} else if (var8 == 7) {
				field228 = "This world is full.";
				field229 = "Please use a different world.";
			} else if (var8 == 8) {
				field228 = "Unable to connect.";
				field229 = "Login server offline.";
			} else if (var8 == 9) {
				field228 = "Login limit exceeded.";
				field229 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field228 = "Unable to connect.";
				field229 = "Bad session id.";
			} else if (var8 == 11) {
				field228 = "Login server rejected session.";
				field229 = "Please try again.";
			} else if (var8 == 12) {
				field228 = "You need a members account to login to this world.";
				field229 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field228 = "Could not complete login.";
				field229 = "Please try using a different world.";
			} else if (var8 == 14) {
				field228 = "The server is being updated.";
				field229 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field323 = true;
				field360.field1263 = 0;
				field161.field1263 = 0;
				field335 = -1;
				field494 = -1;
				field495 = -1;
				field496 = -1;
				field334 = 0;
				field336 = 0;
				field163 = 0;
				field399 = 0;
				field452 = false;
				field447 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field228 = "Login attempts exceeded.";
				field229 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field228 = "You are standing in a members-only area.";
				field229 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field228 = "Invalid loginserver requested";
				field229 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field63.method408();
				for (var21 += 3; var21 >= 0; var21--) {
					field228 = "You have only just left another world";
					field229 = "Your profile will be transferred in: " + var21;
					method101(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method158(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field228 = "Malformed login packet.";
				field229 = "Please try again.";
			} else if (var8 == 23) {
				field228 = "This computers address has been blocked";
				field229 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field228 = "Unexpected server response";
				field229 = "Please try using a different world.";
			} else if (var9 != 0) {
				field228 = "No response from server";
				field229 = "Please try using a different world.";
			} else if (field481 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field481++;
				method158(arg0, arg1, arg2);
			} else {
				field228 = "No response from loginserver";
				field229 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field228 = "";
			field229 = "Error connecting to server.";
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field191[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field448[var3] = var2 / 4;
		}
	}
}
