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
public final class client extends CMOCHGYM {

	@ObfuscatedName("client.L")
	public int[][] field33 = new int[104][104];

	@ObfuscatedName("client.N")
	public int field35 = -1;

	@ObfuscatedName("client.Q")
	public long[] field37 = new long[100];

	@ObfuscatedName("client.R")
	public RZWMPYWU[] field38 = new RZWMPYWU[13];

	@ObfuscatedName("client.U")
	public int field40 = -1;

	@ObfuscatedName("client.V")
	public int[] field41 = new int[100];

	@ObfuscatedName("client.W")
	public String[] field42 = new String[100];

	@ObfuscatedName("client.X")
	public String[] field43 = new String[100];

	@ObfuscatedName("client.mb")
	public boolean field56 = false;

	@ObfuscatedName("client.nb")
	public ZWUMKFUX[] field57 = new ZWUMKFUX[1000];

	@ObfuscatedName("client.Db")
	public volatile boolean field70 = false;

	@ObfuscatedName("client.Ob")
	public int field78 = 2;

	@ObfuscatedName("client.Qb")
	public long[] field80 = new long[200];

	@ObfuscatedName("client.Tb")
	public String field82 = "";

	@ObfuscatedName("client.Wb")
	public XGQETHKV[] field85 = new XGQETHKV[5];

	@ObfuscatedName("client.Zb")
	public int[] field88 = new int[1000];

	@ObfuscatedName("client.ac")
	public int[] field89 = new int[50];

	@ObfuscatedName("client.bc")
	public int field90 = -1;

	@ObfuscatedName("client.ec")
	public int[] field92 = new int[ONPAPCUL.field1046];

	@ObfuscatedName("client.gc")
	public String[] field94 = new String[200];

	@ObfuscatedName("client.hc")
	public int field95 = 0x4D4233;

	@ObfuscatedName("client.kc")
	public ZWUMKFUX[] field98 = new ZWUMKFUX[32];

	@ObfuscatedName("client.rc")
	public int field104 = 0x23201B;

	@ObfuscatedName("client.tc")
	public int field106 = 1;

	@ObfuscatedName("client.Cc")
	public int field114 = 0x766654;

	@ObfuscatedName("client.Ec")
	public int[] field116 = new int[151];

	@ObfuscatedName("client.Fc")
	public int[] field117 = new int[2000];

	@ObfuscatedName("client.Gc")
	public boolean field118 = false;

	@ObfuscatedName("client.Ic")
	public String field119 = "";

	@ObfuscatedName("client.Jc")
	public String field120 = "";

	@ObfuscatedName("client.Pc")
	public int field126 = 0x332D25;

	@ObfuscatedName("client.Xc")
	public boolean field132 = false;

	@ObfuscatedName("client.Zc")
	public int field134 = -1;

	@ObfuscatedName("client.bd")
	public int field136 = -1;

	@ObfuscatedName("client.ld")
	public String[] field146 = new String[500];

	@ObfuscatedName("client.md")
	public boolean field147 = true;

	@ObfuscatedName("client.od")
	public boolean field149 = true;

	@ObfuscatedName("client.vd")
	public boolean field155 = false;

	@ObfuscatedName("client.yd")
	public int[] field157 = new int[151];

	@ObfuscatedName("client.Ed")
	public boolean field163 = false;

	@ObfuscatedName("client.Ld")
	public boolean field169 = false;

	@ObfuscatedName("client.Od")
	public int field171 = 78;

	@ObfuscatedName("client.Qd")
	public int field173 = -1;

	@ObfuscatedName("client.Td")
	public int[] field176 = new int[50];

	@ObfuscatedName("client.Vd")
	public String field178 = "";

	@ObfuscatedName("client.ie")
	public int field189 = 3;

	@ObfuscatedName("client.ke")
	public CRC32 field190 = new CRC32();

	@ObfuscatedName("client.le")
	public byte[] field191 = new byte[16384];

	@ObfuscatedName("client.me")
	public volatile boolean field192 = false;

	@ObfuscatedName("client.oe")
	public EAREBDMK[] field194 = new EAREBDMK[4];

	@ObfuscatedName("client.Ae")
	public int field204 = -1;

	@ObfuscatedName("client.Be")
	public boolean field205 = false;

	@ObfuscatedName("client.Ce")
	public int[] field206 = new int[500];

	@ObfuscatedName("client.De")
	public int[] field207 = new int[500];

	@ObfuscatedName("client.Ee")
	public int[] field208 = new int[500];

	@ObfuscatedName("client.Fe")
	public int[] field209 = new int[500];

	@ObfuscatedName("client.Je")
	public int[] field212 = new int[5];

	@ObfuscatedName("client.Ke")
	public int[] field213 = new int[256];

	@ObfuscatedName("client.Me")
	public boolean field215 = false;

	@ObfuscatedName("client.Pe")
	public boolean field218 = true;

	@ObfuscatedName("client.Ue")
	public int[] field221 = new int[200];

	@ObfuscatedName("client.Ve")
	public int[] field222 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Xe")
	public boolean field224 = false;

	@ObfuscatedName("client.Ye")
	public NHEPCMLW field225 = NHEPCMLW.method337(1);

	@ObfuscatedName("client.Ze")
	public OCPYCLUF[][][] field226 = new OCPYCLUF[4][104][104];

	@ObfuscatedName("client.ef")
	public boolean field231 = false;

	@ObfuscatedName("client.gf")
	public boolean field232 = false;

	@ObfuscatedName("client.hf")
	public String field233 = "";

	@ObfuscatedName("client.rf")
	public boolean field241 = false;

	@ObfuscatedName("client.Bf")
	public int[] field251 = new int[5];

	@ObfuscatedName("client.Cf")
	public String[] field252 = new String[5];

	@ObfuscatedName("client.Df")
	public boolean[] field253 = new boolean[5];

	@ObfuscatedName("client.Ff")
	public boolean field255 = false;

	@ObfuscatedName("client.Nf")
	public int[] field263 = new int[4000];

	@ObfuscatedName("client.Of")
	public int[] field264 = new int[4000];

	@ObfuscatedName("client.Sf")
	public int field268 = 1;

	@ObfuscatedName("client.Tf")
	public boolean field269 = false;

	@ObfuscatedName("client.Wf")
	public boolean field272 = true;

	@ObfuscatedName("client.Xf")
	public ZWUMKFUX[] field273 = new ZWUMKFUX[32];

	@ObfuscatedName("client.Zf")
	public int field275 = 2;

	@ObfuscatedName("client.cg")
	public int field278 = -1;

	@ObfuscatedName("client.ng")
	public int[] field289 = new int[5];

	@ObfuscatedName("client.og")
	public int field290 = 128;

	@ObfuscatedName("client.wg")
	public OCPYCLUF field297 = new OCPYCLUF();

	@ObfuscatedName("client.yg")
	public ZWUMKFUX[] field299 = new ZWUMKFUX[100];

	@ObfuscatedName("client.Cg")
	public int field303 = -1;

	@ObfuscatedName("client.Dg")
	public NHEPCMLW field304 = new NHEPCMLW(new byte[5000]);

	@ObfuscatedName("client.Eg")
	public ZLSEKGJR[] field305 = new ZLSEKGJR[16384];

	@ObfuscatedName("client.Gg")
	public int[] field307 = new int[16384];

	@ObfuscatedName("client.Ig")
	public int[] field309 = new int[7];

	@ObfuscatedName("client.Mg")
	public boolean field313 = false;

	@ObfuscatedName("client.Sg")
	public boolean field318 = false;

	@ObfuscatedName("client.Ug")
	public boolean field320 = false;

	@ObfuscatedName("client.Wg")
	public int[] field322 = new int[9];

	@ObfuscatedName("client.Yg")
	public final int[] field323 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ah")
	public String field325 = "";

	@ObfuscatedName("client.bh")
	public String field326 = "";

	@ObfuscatedName("client.ch")
	public int field327 = -1;

	@ObfuscatedName("client.dh")
	public NHEPCMLW field328 = NHEPCMLW.method337(1);

	@ObfuscatedName("client.kh")
	public String field333 = "";

	@ObfuscatedName("client.ph")
	public int field337 = -1;

	@ObfuscatedName("client.qh")
	public int field338 = -1;

	@ObfuscatedName("client.sh")
	public int[] field339 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.vh")
	public boolean field342 = false;

	@ObfuscatedName("client.wh")
	public int[] field343 = new int[5];

	@ObfuscatedName("client.Bh")
	public int field347 = 2048;

	@ObfuscatedName("client.Ch")
	public int field348 = 2047;

	@ObfuscatedName("client.Dh")
	public HDYGEGXY[] field349 = new HDYGEGXY[field347];

	@ObfuscatedName("client.Fh")
	public int[] field351 = new int[field347];

	@ObfuscatedName("client.Hh")
	public int[] field353 = new int[field347];

	@ObfuscatedName("client.Ih")
	public NHEPCMLW[] field354 = new NHEPCMLW[field347];

	@ObfuscatedName("client.Kh")
	public ZWUMKFUX[] field355 = new ZWUMKFUX[32];

	@ObfuscatedName("client.Mh")
	public boolean field357 = false;

	@ObfuscatedName("client.Oh")
	public OCPYCLUF field359 = new OCPYCLUF();

	@ObfuscatedName("client.Ph")
	public int[] field360 = new int[ONPAPCUL.field1046];

	@ObfuscatedName("client.Qh")
	public boolean field361 = false;

	@ObfuscatedName("client.Wh")
	public boolean field366 = false;

	@ObfuscatedName("client.Xh")
	public RZWMPYWU[] field367 = new RZWMPYWU[2];

	@ObfuscatedName("client.Zh")
	public int[] field369 = new int[33];

	@ObfuscatedName("client.fi")
	public HZINZKXF field375 = new HZINZKXF();

	@ObfuscatedName("client.gi")
	public int field376 = -1;

	@ObfuscatedName("client.ii")
	public boolean[] field378 = new boolean[5];

	@ObfuscatedName("client.ji")
	public NHEPCMLW field379 = NHEPCMLW.method337(1);

	@ObfuscatedName("client.ki")
	public volatile boolean field380 = false;

	@ObfuscatedName("client.mi")
	public int[] field381 = new int[33];

	@ObfuscatedName("client.ti")
	public boolean field388 = true;

	@ObfuscatedName("client.ui")
	public int[] field389 = new int[50];

	@ObfuscatedName("client.xi")
	public int[][] field392 = new int[104][104];

	@ObfuscatedName("client.yi")
	public int[][] field393 = new int[104][104];

	@ObfuscatedName("client.Ai")
	public final int field395 = 100;

	@ObfuscatedName("client.Bi")
	public int[] field396 = new int[100];

	@ObfuscatedName("client.Ii")
	public int[] field399 = new int[5];

	@ObfuscatedName("client.Ki")
	public int field401 = 50;

	@ObfuscatedName("client.Li")
	public int[] field402 = new int[field401];

	@ObfuscatedName("client.Mi")
	public int[] field403 = new int[field401];

	@ObfuscatedName("client.Ni")
	public int[] field404 = new int[field401];

	@ObfuscatedName("client.Oi")
	public int[] field405 = new int[field401];

	@ObfuscatedName("client.Pi")
	public int[] field406 = new int[field401];

	@ObfuscatedName("client.Qi")
	public int[] field407 = new int[field401];

	@ObfuscatedName("client.Ri")
	public int[] field408 = new int[field401];

	@ObfuscatedName("client.Si")
	public String[] field409 = new String[field401];

	@ObfuscatedName("client.Ti")
	public int[] field410 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Wi")
	public boolean field413 = false;

	@ObfuscatedName("client.Xi")
	public String field414 = "";

	@ObfuscatedName("client.cj")
	public int field419 = -1;

	@ObfuscatedName("client.ej")
	public int field421 = -1;

	@ObfuscatedName("client.gj")
	public int[][][] field423 = new int[4][13][13];

	@ObfuscatedName("client.ij")
	public int[] field425 = new int[1000];

	@ObfuscatedName("client.jj")
	public int[] field426 = new int[1000];

	@ObfuscatedName("client.kj")
	public int field427 = -1;

	@ObfuscatedName("client.lj")
	public int[] field428 = new int[ONPAPCUL.field1046];

	@ObfuscatedName("client.uj")
	public int field437 = 2;

	@ObfuscatedName("client.Dj")
	public ZWUMKFUX[] field445 = new ZWUMKFUX[20];

	@ObfuscatedName("client.Ej")
	public int[] field446 = new int[2000];

	@ObfuscatedName("client.Yj")
	public ZWUMKFUX[] field463 = new ZWUMKFUX[8];

	@ObfuscatedName("client.Zj")
	public RZWMPYWU[] field464 = new RZWMPYWU[100];

	@ObfuscatedName("client.bk")
	public OCPYCLUF field465 = new OCPYCLUF();

	@ObfuscatedName("client.Dc")
	public static BigInteger field115 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.ud")
	public static final int[][] field154 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Sd")
	public static BigInteger field175 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Oe")
	public static String field217 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Uf")
	public static int[] field270 = new int[99];

	@ObfuscatedName("client.bg")
	public static final int[] field277 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Rh")
	public static int[] field362 = new int[32];

	@ObfuscatedName("client.Yi")
	public static int field415 = 10;

	@ObfuscatedName("client.aj")
	public static boolean field417 = true;

	@ObfuscatedName("client.nc")
	public int field100;

	@ObfuscatedName("client.oc")
	public int field101;

	@ObfuscatedName("client.pc")
	public int field102;

	@ObfuscatedName("client.qc")
	public int field103;

	@ObfuscatedName("client.sc")
	public int field105;

	@ObfuscatedName("client.vc")
	public int field107;

	@ObfuscatedName("client.wc")
	public int field108;

	@ObfuscatedName("client.xc")
	public int field109;

	@ObfuscatedName("client.yc")
	public int field110;

	@ObfuscatedName("client.zc")
	public int field111;

	@ObfuscatedName("client.Ac")
	public int field112;

	@ObfuscatedName("client.Kc")
	public int field121;

	@ObfuscatedName("client.Lc")
	public int field122;

	@ObfuscatedName("client.Mc")
	public int field123;

	@ObfuscatedName("client.Nc")
	public int field124;

	@ObfuscatedName("client.Oc")
	public int field125;

	@ObfuscatedName("client.Sc")
	public int field128;

	@ObfuscatedName("client.Tc")
	public int field129;

	@ObfuscatedName("client.Vc")
	public static int field130;

	@ObfuscatedName("client.Wc")
	public int field131;

	@ObfuscatedName("client.ad")
	public static int field135;

	@ObfuscatedName("client.nd")
	public int field148;

	@ObfuscatedName("client.qd")
	public int field150;

	@ObfuscatedName("client.rd")
	public int field151;

	@ObfuscatedName("client.sd")
	public int field152;

	@ObfuscatedName("client.xd")
	public int field156;

	@ObfuscatedName("client.zd")
	public int field158;

	@ObfuscatedName("client.Ad")
	public int field159;

	@ObfuscatedName("client.Bd")
	public int field160;

	@ObfuscatedName("client.Cd")
	public int field161;

	@ObfuscatedName("client.Dd")
	public int field162;

	@ObfuscatedName("client.Kd")
	public int field168;

	@ObfuscatedName("client.Pd")
	public int field172;

	@ObfuscatedName("client.Rd")
	public int field174;

	@ObfuscatedName("client.Ud")
	public int field177;

	@ObfuscatedName("client.ce")
	public int field184;

	@ObfuscatedName("client.de")
	public int field185;

	@ObfuscatedName("client.fe")
	public int field187;

	@ObfuscatedName("client.he")
	public static int field188;

	@ObfuscatedName("client.ne")
	public int field193;

	@ObfuscatedName("client.qe")
	public int field195;

	@ObfuscatedName("client.te")
	public int field198;

	@ObfuscatedName("client.ve")
	public int field199;

	@ObfuscatedName("client.we")
	public int field200;

	@ObfuscatedName("client.xe")
	public int field201;

	@ObfuscatedName("client.ye")
	public int field202;

	@ObfuscatedName("client.ze")
	public int field203;

	@ObfuscatedName("client.Le")
	public static int field214;

	@ObfuscatedName("client.Ne")
	public int field216;

	@ObfuscatedName("client.Se")
	public int field219;

	@ObfuscatedName("client.Te")
	public static int field220;

	@ObfuscatedName("client.We")
	public int field223;

	@ObfuscatedName("client.kf")
	public int field234;

	@ObfuscatedName("client.lf")
	public int field235;

	@ObfuscatedName("client.nf")
	public int field237;

	@ObfuscatedName("client.of")
	public int field238;

	@ObfuscatedName("client.pf")
	public int field239;

	@ObfuscatedName("client.qf")
	public int field240;

	@ObfuscatedName("client.sf")
	public int field242;

	@ObfuscatedName("client.tf")
	public int field243;

	@ObfuscatedName("client.uf")
	public int field244;

	@ObfuscatedName("client.vf")
	public int field245;

	@ObfuscatedName("client.wf")
	public int field246;

	@ObfuscatedName("client.xf")
	public int field247;

	@ObfuscatedName("client.yf")
	public int field248;

	@ObfuscatedName("client.zf")
	public int field249;

	@ObfuscatedName("client.Af")
	public int field250;

	@ObfuscatedName("client.Gf")
	public int field256;

	@ObfuscatedName("client.Hf")
	public int field257;

	@ObfuscatedName("client.If")
	public int field258;

	@ObfuscatedName("client.Jf")
	public int field259;

	@ObfuscatedName("client.Kf")
	public int field260;

	@ObfuscatedName("client.Lf")
	public int field261;

	@ObfuscatedName("client.Mf")
	public static int field262;

	@ObfuscatedName("client.Pf")
	public int field265;

	@ObfuscatedName("client.Qf")
	public int field266;

	@ObfuscatedName("client.Rf")
	public int field267;

	@ObfuscatedName("client.Yf")
	public int field274;

	@ObfuscatedName("client.ag")
	public int field276;

	@ObfuscatedName("client.eg")
	public int field280;

	@ObfuscatedName("client.fg")
	public int field281;

	@ObfuscatedName("client.gg")
	public int field282;

	@ObfuscatedName("client.hg")
	public int field283;

	@ObfuscatedName("client.ig")
	public int field284;

	@ObfuscatedName("client.lg")
	public int field287;

	@ObfuscatedName("client.mg")
	public int field288;

	@ObfuscatedName("client.pg")
	public int field291;

	@ObfuscatedName("client.qg")
	public int field292;

	@ObfuscatedName("client.rg")
	public int field293;

	@ObfuscatedName("client.ug")
	public int field295;

	@ObfuscatedName("client.vg")
	public int field296;

	@ObfuscatedName("client.I")
	public int field30;

	@ObfuscatedName("client.Fg")
	public int field306;

	@ObfuscatedName("client.J")
	public int field31;

	@ObfuscatedName("client.Jg")
	public int field310;

	@ObfuscatedName("client.Kg")
	public int field311;

	@ObfuscatedName("client.Lg")
	public int field312;

	@ObfuscatedName("client.Og")
	public int field315;

	@ObfuscatedName("client.Qg")
	public static int field316;

	@ObfuscatedName("client.Tg")
	public static int field319;

	@ObfuscatedName("client.K")
	public int field32;

	@ObfuscatedName("client.Vg")
	public int field321;

	@ObfuscatedName("client.Zg")
	public int field324;

	@ObfuscatedName("client.fh")
	public int field329;

	@ObfuscatedName("client.lh")
	public int field334;

	@ObfuscatedName("client.oh")
	public int field336;

	@ObfuscatedName("client.th")
	public int field340;

	@ObfuscatedName("client.uh")
	public int field341;

	@ObfuscatedName("client.Eh")
	public int field350;

	@ObfuscatedName("client.Gh")
	public int field352;

	@ObfuscatedName("client.Nh")
	public int field358;

	@ObfuscatedName("client.Th")
	public int field363;

	@ObfuscatedName("client.Uh")
	public int field364;

	@ObfuscatedName("client.Vh")
	public int field365;

	@ObfuscatedName("client.Yh")
	public static int field368;

	@ObfuscatedName("client.hi")
	public static int field377;

	@ObfuscatedName("client.S")
	public int field39;

	@ObfuscatedName("client.wi")
	public int field391;

	@ObfuscatedName("client.Ei")
	public int field397;

	@ObfuscatedName("client.Ji")
	public int field400;

	@ObfuscatedName("client.Ui")
	public int field411;

	@ObfuscatedName("client.Zi")
	public static int field416;

	@ObfuscatedName("client.dj")
	public int field420;

	@ObfuscatedName("client.fj")
	public int field422;

	@ObfuscatedName("client.hj")
	public int field424;

	@ObfuscatedName("client.oj")
	public int field431;

	@ObfuscatedName("client.pj")
	public int field432;

	@ObfuscatedName("client.qj")
	public int field433;

	@ObfuscatedName("client.rj")
	public int field434;

	@ObfuscatedName("client.tj")
	public int field436;

	@ObfuscatedName("client.xj")
	public int field439;

	@ObfuscatedName("client.yj")
	public int field440;

	@ObfuscatedName("client.Mj")
	public int field452;

	@ObfuscatedName("client.Nj")
	public static int field453;

	@ObfuscatedName("client.ab")
	public int field46;

	@ObfuscatedName("client.dk")
	public int field466;

	@ObfuscatedName("client.hb")
	public int field51;

	@ObfuscatedName("client.ib")
	public int field52;

	@ObfuscatedName("client.jb")
	public int field53;

	@ObfuscatedName("client.kb")
	public int field54;

	@ObfuscatedName("client.lb")
	public int field55;

	@ObfuscatedName("client.pb")
	public int field58;

	@ObfuscatedName("client.qb")
	public int field59;

	@ObfuscatedName("client.rb")
	public int field60;

	@ObfuscatedName("client.sb")
	public int field61;

	@ObfuscatedName("client.tb")
	public int field62;

	@ObfuscatedName("client.yb")
	public int field66;

	@ObfuscatedName("client.zb")
	public static int field67;

	@ObfuscatedName("client.Ab")
	public int field68;

	@ObfuscatedName("client.Bb")
	public int field69;

	@ObfuscatedName("client.Fb")
	public int field71;

	@ObfuscatedName("client.Gb")
	public int field72;

	@ObfuscatedName("client.Hb")
	public int field73;

	@ObfuscatedName("client.Ib")
	public int field74;

	@ObfuscatedName("client.Kb")
	public static int field75;

	@ObfuscatedName("client.Mb")
	public int field76;

	@ObfuscatedName("client.Nb")
	public int field77;

	@ObfuscatedName("client.Pb")
	public int field79;

	@ObfuscatedName("client.Sb")
	public int field81;

	@ObfuscatedName("client.Ub")
	public int field83;

	@ObfuscatedName("client.Vb")
	public int field84;

	@ObfuscatedName("client.Xb")
	public int field86;

	@ObfuscatedName("client.Yb")
	public int field87;

	@ObfuscatedName("client.ic")
	public int field96;

	@ObfuscatedName("client.jc")
	public int field97;

	@ObfuscatedName("client.mc")
	public int field99;

	@ObfuscatedName("client.Yc")
	public long field133;

	@ObfuscatedName("client.Nd")
	public long field170;

	@ObfuscatedName("client.af")
	public long field227;

	@ObfuscatedName("client.dg")
	public long field279;

	@ObfuscatedName("client.Lh")
	public long field356;

	@ObfuscatedName("client.ni")
	public GCURPWTI field382;

	@ObfuscatedName("client.oi")
	public GCURPWTI field383;

	@ObfuscatedName("client.pi")
	public GCURPWTI field384;

	@ObfuscatedName("client.qi")
	public GCURPWTI field385;

	@ObfuscatedName("client.Gi")
	public static HDYGEGXY field398;

	@ObfuscatedName("client.Ef")
	public INOFEYKQ field254;

	@ObfuscatedName("client.Rg")
	public IPEHOOFG field317;

	@ObfuscatedName("client.xb")
	public LZVLFSBA field65;

	@ObfuscatedName("client.Xd")
	public RZWMPYWU field179;

	@ObfuscatedName("client.Yd")
	public RZWMPYWU field180;

	@ObfuscatedName("client.Zd")
	public RZWMPYWU field181;

	@ObfuscatedName("client.ae")
	public RZWMPYWU field182;

	@ObfuscatedName("client.be")
	public RZWMPYWU field183;

	@ObfuscatedName("client.zg")
	public RZWMPYWU field300;

	@ObfuscatedName("client.Ag")
	public RZWMPYWU field301;

	@ObfuscatedName("client.Bg")
	public RZWMPYWU field302;

	@ObfuscatedName("client.yh")
	public RZWMPYWU field344;

	@ObfuscatedName("client.zh")
	public RZWMPYWU field345;

	@ObfuscatedName("client.Ah")
	public RZWMPYWU field346;

	@ObfuscatedName("client.ai")
	public RZWMPYWU field370;

	@ObfuscatedName("client.bi")
	public RZWMPYWU field371;

	@ObfuscatedName("client.ci")
	public RZWMPYWU field372;

	@ObfuscatedName("client.di")
	public RZWMPYWU field373;

	@ObfuscatedName("client.ei")
	public RZWMPYWU field374;

	@ObfuscatedName("client.ri")
	public RZWMPYWU field386;

	@ObfuscatedName("client.si")
	public RZWMPYWU field387;

	@ObfuscatedName("client.Y")
	public RZWMPYWU field44;

	@ObfuscatedName("client.Z")
	public RZWMPYWU field45;

	@ObfuscatedName("client.Bc")
	public TEXKPKZX field113;

	@ObfuscatedName("client.P")
	public VNVHYJAS field36;

	@ObfuscatedName("client.cd")
	public VOQVBLJN field137;

	@ObfuscatedName("client.dd")
	public VOQVBLJN field138;

	@ObfuscatedName("client.ed")
	public VOQVBLJN field139;

	@ObfuscatedName("client.fd")
	public VOQVBLJN field140;

	@ObfuscatedName("client.gd")
	public VOQVBLJN field141;

	@ObfuscatedName("client.hd")
	public VOQVBLJN field142;

	@ObfuscatedName("client.id")
	public VOQVBLJN field143;

	@ObfuscatedName("client.jd")
	public VOQVBLJN field144;

	@ObfuscatedName("client.kd")
	public VOQVBLJN field145;

	@ObfuscatedName("client.Gd")
	public VOQVBLJN field164;

	@ObfuscatedName("client.Hd")
	public VOQVBLJN field165;

	@ObfuscatedName("client.Id")
	public VOQVBLJN field166;

	@ObfuscatedName("client.Jd")
	public VOQVBLJN field167;

	@ObfuscatedName("client.hh")
	public VOQVBLJN field330;

	@ObfuscatedName("client.ih")
	public VOQVBLJN field331;

	@ObfuscatedName("client.jh")
	public VOQVBLJN field332;

	@ObfuscatedName("client.Oj")
	public VOQVBLJN field454;

	@ObfuscatedName("client.Pj")
	public VOQVBLJN field455;

	@ObfuscatedName("client.Qj")
	public VOQVBLJN field456;

	@ObfuscatedName("client.Rj")
	public VOQVBLJN field457;

	@ObfuscatedName("client.Sj")
	public VOQVBLJN field458;

	@ObfuscatedName("client.Tj")
	public VOQVBLJN field459;

	@ObfuscatedName("client.Uj")
	public VOQVBLJN field460;

	@ObfuscatedName("client.Vj")
	public VOQVBLJN field461;

	@ObfuscatedName("client.Wj")
	public VOQVBLJN field462;

	@ObfuscatedName("client.Rc")
	public YVLAOVKQ field127;

	@ObfuscatedName("client.ee")
	public ZWUMKFUX field186;

	@ObfuscatedName("client.jg")
	public ZWUMKFUX field285;

	@ObfuscatedName("client.kg")
	public ZWUMKFUX field286;

	@ObfuscatedName("client.tg")
	public ZWUMKFUX field294;

	@ObfuscatedName("client.M")
	public ZWUMKFUX field34;

	@ObfuscatedName("client.Vi")
	public ZWUMKFUX field412;

	@ObfuscatedName("client.mj")
	public ZWUMKFUX field429;

	@ObfuscatedName("client.nj")
	public ZWUMKFUX field430;

	@ObfuscatedName("client.Hj")
	public ZWUMKFUX field447;

	@ObfuscatedName("client.Ij")
	public ZWUMKFUX field448;

	@ObfuscatedName("client.Jj")
	public ZWUMKFUX field449;

	@ObfuscatedName("client.Kj")
	public ZWUMKFUX field450;

	@ObfuscatedName("client.Lj")
	public ZWUMKFUX field451;

	@ObfuscatedName("client.ub")
	public ZWUMKFUX field63;

	@ObfuscatedName("client.vb")
	public ZWUMKFUX field64;

	@ObfuscatedName("client.td")
	public String field153;

	@ObfuscatedName("client.mh")
	public String field335;

	@ObfuscatedName("client.vi")
	public String field390;

	@ObfuscatedName("client.sj")
	public String field435;

	@ObfuscatedName("client.Ng")
	public Socket field314;

	@ObfuscatedName("client.mf")
	public static boolean field236;

	@ObfuscatedName("client.bj")
	public static boolean field418;

	@ObfuscatedName("client.wj")
	public static boolean field438;

	@ObfuscatedName("client.fc")
	public static boolean field93;

	@ObfuscatedName("client.re")
	public int[] field196;

	@ObfuscatedName("client.se")
	public int[] field197;

	@ObfuscatedName("client.Ge")
	public int[] field210;

	@ObfuscatedName("client.He")
	public int[] field211;

	@ObfuscatedName("client.bf")
	public int[] field228;

	@ObfuscatedName("client.cf")
	public int[] field229;

	@ObfuscatedName("client.df")
	public int[] field230;

	@ObfuscatedName("client.zj")
	public int[] field441;

	@ObfuscatedName("client.Aj")
	public int[] field442;

	@ObfuscatedName("client.Bj")
	public int[] field443;

	@ObfuscatedName("client.Cj")
	public int[] field444;

	@ObfuscatedName("client.cb")
	public int[] field47;

	@ObfuscatedName("client.db")
	public int[] field48;

	@ObfuscatedName("client.eb")
	public int[] field49;

	@ObfuscatedName("client.fb")
	public int[] field50;

	@ObfuscatedName("client.xg")
	public RZWMPYWU[] field298;

	@ObfuscatedName("client.Vf")
	public byte[][] field271;

	@ObfuscatedName("client.zi")
	public byte[][] field394;

	@ObfuscatedName("client.Hg")
	public byte[][][] field308;

	@ObfuscatedName("client.dc")
	public int[][][] field91;

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method5(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IIIZIIIIIIZI)Z")
	public final boolean method6(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field33[var14][var15] = 0;
				field393[var14][var15] = 99999999;
			}
		}

		int var16 = arg9;
		int var17 = arg2;
		field33[arg9][arg2] = 99;
		field393[arg9][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		field263[var18] = arg9;
		int var35 = var18 + 1;
		field264[var18] = arg2;
		boolean var20 = false;
		int var21 = field263.length;
		int[][] var22 = field194[field83].field615;
		while (var35 != var19) {
			var16 = field263[var19];
			var17 = field264[var19];
			var19 = (var19 + 1) % var21;

			if (arg7 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field194[field83].method197(var17, arg0 - 1, arg1, var16, arg5, arg7)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field194[field83].method198(arg5, arg7, arg0 - 1, var17, arg1, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg8 != 0 && arg10 != 0 && field194[field83].method199(arg4, arg7, arg8, var16, var17, arg1, arg10)) {
				var20 = true;
				break;
			}

			int var23 = field393[var16][var17] + 1;
			if (var16 > 0 && field33[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field263[var35] = var16 - 1;
				field264[var35] = var17;
				var35 = (var35 + 1) % var21;
				field33[var16 - 1][var17] = 2;
				field393[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field33[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field263[var35] = var16 + 1;
				field264[var35] = var17;
				var35 = (var35 + 1) % var21;
				field33[var16 + 1][var17] = 8;
				field393[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field33[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field263[var35] = var16;
				field264[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field33[var16][var17 - 1] = 1;
				field393[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field33[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field263[var35] = var16;
				field264[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field33[var16][var17 + 1] = 4;
				field393[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field33[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field263[var35] = var16 - 1;
				field264[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field33[var16 - 1][var17 - 1] = 3;
				field393[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field33[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field263[var35] = var16 + 1;
				field264[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field33[var16 + 1][var17 - 1] = 9;
				field393[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field33[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field263[var35] = var16 - 1;
				field264[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field33[var16 - 1][var17 + 1] = 6;
				field393[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field33[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field263[var35] = var16 + 1;
				field264[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field33[var16 + 1][var17 + 1] = 12;
				field393[var16 + 1][var17 + 1] = var23;
			}
		}

		field174 = 0;
		if (!var20) {
			if (arg3) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg7 - var25; var26 <= arg7 + var25; var26++) {
						for (int var27 = arg1 - var25; var27 <= arg1 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field393[var26][var27] < var24) {
								var24 = field393[var26][var27];
								var16 = var26;
								var17 = var27;
								field174 = 1;
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
		field263[var28] = var16;
		int var36 = var28 + 1;
		field264[var28] = var17;
		int var29;
		int var30 = var29 = field33[var16][var17];
		while (arg9 != var16 || arg2 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field263[var36] = var16;
				field264[var36++] = var17;
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

			var30 = field33[var16][var17];
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
		int var32 = field263[var36];
		int var33 = field264[var36];

		if (arg6 == 0) {
			field328.method338(226);
			field328.method339(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field328.method338(114);
			field328.method339(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field328.method338(143);
			field328.method339(var31 + var31 + 3);
		}

		field328.method374(field256 + var32);
		field328.method374(field257 + var33);
		field328.method366(field493[5] == 1 ? 1 : 0);
		field184 = field263[0];
		field185 = field264[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field328.method366(field263[var36] - var32);
			field328.method365(field264[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method7() {
		if (field466 >= 2 || field431 != 0 || field150 != 0) {
			String var1;
			if (field431 == 1 && field466 < 2) {
				var1 = "Use " + field435 + " with...";
			} else if (field150 == 1 && field466 < 2) {
				var1 = field153 + "...";
			} else {
				var1 = field146[field466 - 1];
			}

			if (field466 > 2) {
				var1 = var1 + "@whi@ / " + (field466 - 2) + " more options";
			}

			field384.method221(15, field453 / 1000, 0xFFFFFF, true, 4, var1);
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method8() {
		int var1 = field199 * 128 + 64;
		int var2 = field200 * 128 + 64;
		int var3 = method52(field83, var2, var1) - field201;

		if (field58 < var1) {
			field58 += (var1 - field58) * field203 / 1000 + field202;
			if (field58 > var1) {
				field58 = var1;
			}
		}

		if (field58 > var1) {
			field58 -= (field58 - var1) * field203 / 1000 + field202;
			if (field58 < var1) {
				field58 = var1;
			}
		}

		if (field59 < var3) {
			field59 += (var3 - field59) * field203 / 1000 + field202;
			if (field59 > var3) {
				field59 = var3;
			}
		}

		if (field59 > var3) {
			field59 -= (field59 - var3) * field203 / 1000 + field202;
			if (field59 < var3) {
				field59 = var3;
			}
		}

		if (field60 < var2) {
			field60 += (var2 - field60) * field203 / 1000 + field202;
			if (field60 > var2) {
				field60 = var2;
			}
		}

		if (field60 > var2) {
			field60 -= (field60 - var2) * field203 / 1000 + field202;
			if (field60 < var2) {
				field60 = var2;
			}
		}

		int var4 = field107 * 128 + 64;
		int var5 = field108 * 128 + 64;
		int var6 = method52(field83, var5, var4) - field109;
		int var7 = var4 - field58;
		int var8 = var6 - field59;
		int var9 = var5 - field60;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field61 < var11) {
			field61 += (var11 - field61) * field111 / 1000 + field110;
			if (field61 > var11) {
				field61 = var11;
			}
		}

		if (field61 > var11) {
			field61 -= (field61 - var11) * field111 / 1000 + field110;
			if (field61 < var11) {
				field61 = var11;
			}
		}

		int var13 = var12 - field62;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field62 += field111 * var13 / 1000 + field110;
			field62 &= 0x7FF;
		}

		if (var13 < 0) {
			field62 -= -var13 * field111 / 1000 + field110;
			field62 &= 0x7FF;
		}

		int var14 = var12 - field62;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field62 = var12;
		}
	}

	@ObfuscatedName("client.a(IBII)I")
	public final int method9(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method10(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field411; var3++) {
				if (field37[var3] == arg0) {
					field411--;
					field118 = true;

					for (int var4 = var3; var4 < field411; var4++) {
						field37[var4] = field37[var4 + 1];
					}

					field328.method338(174);
					field328.method345(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method11(byte[] arg0, boolean arg1) {
		if (field147) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method12(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(ZIILHZINZKXF;I)V")
	public final void method13(int arg0, int arg1, HZINZKXF arg2, int arg3) {
		if (arg2.field792 == 0 && arg2.field846 != null && (!arg2.field801 || field79 == arg2.field796 || field129 == arg2.field796 || field341 == arg2.field796)) {
			int var5 = NQLGXPRA.field982;
			int var6 = NQLGXPRA.field980;
			int var7 = NQLGXPRA.field983;
			int var8 = NQLGXPRA.field981;
			NQLGXPRA.method390(arg1, arg2.field793 + arg0, arg0, arg2.field819 + arg1);
			int var9 = arg2.field846.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field837[var10] + arg1;
				int var12 = arg2.field802[var10] + arg0 - arg3;
				HZINZKXF var13 = HZINZKXF.method269(arg2.field846[var10]);
				var11 += var13.field859;
				var12 += var13.field839;

				if (var13.field856 > 0) {
					method142(var13);
				}

				if (var13.field792 == 0) {
					if (var13.field800 > var13.field822 - var13.field793) {
						var13.field800 = var13.field822 - var13.field793;
					}

					if (var13.field800 < 0) {
						var13.field800 = 0;
					}

					method13(var12, var11, var13, var13.field800);

					if (var13.field822 > var13.field793) {
						method34(var13.field822, var13.field819 + var11, var12, var13.field800, var13.field793);
					}
				} else if (var13.field792 != 1) {
					if (var13.field792 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field793; var15++) {
							for (int var16 = 0; var16 < var13.field819; var16++) {
								int var17 = (var13.field817 + 32) * var16 + var11;
								int var18 = (var13.field790 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field829[var14];
									var18 += var13.field826[var14];
								}

								if (var13.field842[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field842[var14] - 1;
									if (var17 > NQLGXPRA.field982 - 32 && var17 < NQLGXPRA.field983 && var18 > NQLGXPRA.field980 - 32 && var18 < NQLGXPRA.field981 || field244 != 0 && field243 == var14) {
										int var22 = 0;
										if (field431 == 1 && field432 == var14 && field433 == var13.field796) {
											var22 = 0xFFFFFF;
										}

										ZWUMKFUX var23 = HVTLSJTR.method256(var22, var21, var13.field840[var14]);
										if (var23 != null) {
											if (field244 != 0 && field243 == var14 && field242 == var13.field796) {
												var19 = field483 - field245;
												var20 = field484 - field246;

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

												var23.method596(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < NQLGXPRA.field980 && arg2.field800 > 0) {
													int var24 = (NQLGXPRA.field980 - var18 - var20) * field247 / 3;
													if (var24 > field247 * 10) {
														var24 = field247 * 10;
													}

													if (var24 > arg2.field800) {
														var24 = arg2.field800;
													}

													arg2.field800 -= var24;
													field246 += var24;
												}

												if (var18 + var20 + 32 > NQLGXPRA.field981 && arg2.field800 < arg2.field822 - arg2.field793) {
													int var25 = (var18 + var20 + 32 - NQLGXPRA.field981) * field247 / 3;
													if (var25 > field247 * 10) {
														var25 = field247 * 10;
													}

													if (var25 > arg2.field822 - arg2.field793 - arg2.field800) {
														var25 = arg2.field822 - arg2.field793 - arg2.field800;
													}

													arg2.field800 += var25;
													field246 -= var25;
												}
											} else if (field74 != 0 && field73 == var14 && field72 == var13.field796) {
												var23.method596(var18, var17, 128);
											} else {
												var23.method594(var17, var18);
											}

											if (var23.field1510 == 33 || var13.field840[var14] != 1) {
												int var26 = var13.field840[var14];
												field382.method216(method12(var26), var17 + var19 + 1, var18 + 10 + var20, 0);
												field382.method216(method12(var26), var17 + var19, var18 + 9 + var20, 0xFFFF00);
											}
										}
									}
								} else if (var13.field814 != null && var14 < 20) {
									ZWUMKFUX var27 = var13.field814[var14];
									if (var27 != null) {
										var27.method594(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field792 == 3) {
						boolean var28 = false;
						if (field341 == var13.field796 || field129 == var13.field796 || field79 == var13.field796) {
							var28 = true;
						}

						int var29;
						if (method99(var13)) {
							var29 = var13.field861;
							if (var28 && var13.field818 != 0) {
								var29 = var13.field818;
							}
						} else {
							var29 = var13.field828;
							if (var28 && var13.field811 != 0) {
								var29 = var13.field811;
							}
						}

						if (var13.field825 == 0) {
							if (var13.field845) {
								NQLGXPRA.method393(var11, var29, var13.field793, var12, var13.field819);
							} else {
								NQLGXPRA.method394(var29, var12, var13.field819, var13.field793, var11);
							}
						} else if (var13.field845) {
							NQLGXPRA.method392(var13.field819, var12, var29, 256 - (var13.field825 & 0xFF), var13.field793, var11);
						} else {
							NQLGXPRA.method395(var12, var11, 256 - (var13.field825 & 0xFF), var13.field793, var29, var13.field819);
						}
					} else if (var13.field792 == 4) {
						GCURPWTI var30 = var13.field805;
						String var31 = var13.field798;
						boolean var32 = false;
						if (field341 == var13.field796 || field129 == var13.field796 || field79 == var13.field796) {
							var32 = true;
						}

						int var33;
						if (method99(var13)) {
							var33 = var13.field861;
							if (var32 && var13.field818 != 0) {
								var33 = var13.field818;
							}

							if (var13.field820.length() > 0) {
								var31 = var13.field820;
							}
						} else {
							var33 = var13.field828;
							if (var32 && var13.field811 != 0) {
								var33 = var13.field811;
							}
						}

						if (var13.field849 == 6 && field163) {
							var31 = "Please wait...";
							var33 = var13.field828;
						}

						if (NQLGXPRA.field978 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field676 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method112(method82(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method112(method82(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method112(method82(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method112(method82(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method112(method82(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field816) {
								var30.method213(var33, var13.field844, var13.field819 / 2 + var11, var34, var41);
							} else {
								var30.method220(var34, var41, var13.field844, var33, var11);
							}

							var34 += var30.field676;
						}
					} else if (var13.field792 == 5) {
						ZWUMKFUX var42;
						if (method99(var13)) {
							var42 = var13.field851;
						} else {
							var42 = var13.field855;
						}

						if (var42 != null) {
							var42.method594(var11, var12);
						}
					} else if (var13.field792 == 6) {
						int var43 = YFTZFAFG.field1434;
						int var44 = YFTZFAFG.field1435;
						YFTZFAFG.field1434 = var13.field819 / 2 + var11;
						YFTZFAFG.field1435 = var13.field793 / 2 + var12;
						int var45 = YFTZFAFG.field1438[var13.field831] * var13.field830 >> 16;
						int var46 = YFTZFAFG.field1439[var13.field831] * var13.field830 >> 16;
						boolean var47 = method99(var13);
						int var48;
						if (var47) {
							var48 = var13.field809;
						} else {
							var48 = var13.field808;
						}

						CSGBDGDY var49;
						if (var48 == -1) {
							var49 = var13.method270(-1, var47, -1);
						} else {
							PNPNYEVW var50 = PNPNYEVW.field1058[var48];
							var49 = var13.method270(var50.field1060[var13.field835], var47, var50.field1061[var13.field835]);
						}

						if (var49 != null) {
							var49.method180(0, var13.field832, 0, var13.field831, 0, var45, var46);
						}

						YFTZFAFG.field1434 = var43;
						YFTZFAFG.field1435 = var44;
					} else {
						if (var13.field792 == 7) {
							GCURPWTI var51 = var13.field805;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field793; var53++) {
								for (int var54 = 0; var54 < var13.field819; var54++) {
									if (var13.field842[var52] > 0) {
										HVTLSJTR var55 = HVTLSJTR.method254(var13.field842[var52] - 1);
										String var56 = var55.field782;
										if (var55.field787 || var13.field840[var52] != 1) {
											var56 = var56 + " x" + method23(var13.field840[var52]);
										}

										int var57 = (var13.field817 + 115) * var54 + var11;
										int var58 = (var13.field790 + 12) * var53 + var12;
										if (var13.field816) {
											var51.method213(var13.field828, var13.field844, var13.field819 / 2 + var57, var58, var56);
										} else {
											var51.method220(var58, var56, var13.field844, var13.field828, var57);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field792 == 8 && (field219 == var13.field796 || field261 == var13.field796 || field391 == var13.field796) && field321 == 100) {
							int var59 = 0;
							int var60 = 0;
							GCURPWTI var61 = field383;
							String var62 = var13.field798;
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

								int var65 = var61.method214(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field676 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field819 + var11 - var59 - 5;
							int var67 = var13.field793 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field819 + arg1) {
								var66 = arg2.field819 + arg1 - var59;
							}

							NQLGXPRA.method393(var66, 0xFFFFA0, var60, var67, var59);
							NQLGXPRA.method394(0, var67, var59, var60, var66);
							String var68 = var13.field798;
							int var69 = var61.field676 + var67 + 2;
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

								var61.method220(var69, var71, false, 0, var66 + 3);
								var69 += var61.field676 + 1;
							}
						}
					}
				}
			}

			NQLGXPRA.method390(var5, var8, var6, var7);
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method14(boolean arg0) {
		if (field398.field1405 >> 7 == field184 && field398.field1406 >> 7 == field185) {
			field184 = 0;
		}

		int var2 = field350;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			HDYGEGXY var4;
			int var5;
			if (arg0) {
				var4 = field398;
				var5 = field348 << 14;
			} else {
				var4 = field349[field351[var3]];
				var5 = field351[var3] << 14;
			}

			if (var4 != null && var4.method250()) {
				var4.field716 = false;
				if ((field418 && field350 > 50 || field350 > 200) && !arg0 && var4.field1403 == var4.field1356) {
					var4.field716 = true;
				}

				int var6 = var4.field1405 >> 7;
				int var7 = var4.field1406 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field730 == null || field453 < var4.field720 || field453 >= var4.field721) {
						if ((var4.field1405 & 0x7F) == 0x40 && (var4.field1406 & 0x7F) == 0x40) {
							if (field392[var6][var7] == field238) {
								continue;
							}

							field392[var6][var7] = field238;
						}

						var4.field726 = method52(field83, var4.field1406, var4.field1405);
						field113.method460(var4.field1405, 60, var4, field83, var4.field1407, var5, var4.field1406, var4.field726, var4.field1384);
					} else {
						var4.field716 = false;
						var4.field726 = method52(field83, var4.field1406, var4.field1405);
						field113.method461(var4.field1406, var4.field736, var4.field1405, var4.field1407, var4.field726, var5, 60, var4.field737, var4, var4.field738, var4.field735, field83);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LNHEPCMLW;IB)V")
	public final void method15(NHEPCMLW arg0, int arg1) {
		arg0.method359();
		int var3 = arg0.method360(1);
		if (var3 != 0) {
			int var4 = arg0.method360(2);
			if (var4 == 0) {
				field353[field352++] = field348;
			} else if (var4 == 1) {
				int var5 = arg0.method360(3);
				field398.method548(false, var5);
				int var6 = arg0.method360(1);
				if (var6 == 1) {
					field353[field352++] = field348;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method360(3);
				field398.method548(true, var7);
				int var8 = arg0.method360(3);
				field398.method548(true, var8);
				int var9 = arg0.method360(1);
				if (var9 == 1) {
					field353[field352++] = field348;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method360(7);
				field83 = arg0.method360(2);
				int var11 = arg0.method360(1);
				int var12 = arg0.method360(1);
				if (var12 == 1) {
					field353[field352++] = field348;
				}

				int var13 = arg0.method360(7);
				field398.method547(var10, var13, var11 == 1);
			}
		}
	}

	@ObfuscatedName("client.a(IIILZWUMKFUX;)V")
	public final void method16(int arg0, int arg1, ZWUMKFUX arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field291 + field274 & 0x7FF;
			int var6 = CSGBDGDY.field566[var5];
			int var7 = CSGBDGDY.field567[var5];
			var6 = var6 * 256 / (field267 + 256);
			var7 = var7 * 256 / (field267 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field294.method599(20, 15, var10, var12 + 94 + 4 - 10, 256, 15, 20, 83 - var13 - 20);
		} else {
			method131(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.a(ILYCAXTCCQ;)V")
	public final void method17(YCAXTCCQ arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1421 == 0) {
			var2 = field113.method475(arg0.field1420, arg0.field1422, arg0.field1423);
		}

		if (arg0.field1421 == 1) {
			var2 = field113.method476(arg0.field1423, arg0.field1420, arg0.field1422);
		}

		if (arg0.field1421 == 2) {
			var2 = field113.method477(arg0.field1420, arg0.field1422, arg0.field1423);
		}

		if (arg0.field1421 == 3) {
			var2 = field113.method478(arg0.field1420, arg0.field1422, arg0.field1423);
		}

		if (var2 != 0) {
			int var6 = field113.method479(arg0.field1420, arg0.field1422, arg0.field1423, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1417 = var3;
		arg0.field1419 = var4;
		arg0.field1418 = var5;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method18(String arg0) {
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

	@ObfuscatedName("client.f(I)V")
	public final void method19() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method20() {
		for (YCAXTCCQ var1 = (YCAXTCCQ) field359.method414(); var1 != null; var1 = (YCAXTCCQ) field359.method416()) {
			if (var1.field1425 == -1) {
				var1.field1424 = 0;
				method17(var1);
			} else {
				var1.method336();
			}
		}
	}

	@ObfuscatedName("client.a(IZLNHEPCMLW;)V")
	public final void method21(int arg0, NHEPCMLW arg1) {
		for (int var3 = 0; var3 < field352; var3++) {
			int var4 = field353[var3];
			HDYGEGXY var5 = field349[var4];
			int var6 = arg1.method349();
			if ((var6 & 0x8) != 0) {
				var6 += arg1.method349() << 8;
			}

			method113(var4, var6, var5, arg1);
		}
	}

	public final void run() {
		if (field192) {
			method76();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method22(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method23(int arg0) {
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

	@ObfuscatedName("client.a(BJ)V")
	public final void method24(long arg0) {
		if (arg0 != 0L) {
			if (field411 >= 100) {
				method106("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = UJPWWGLO.method508(UJPWWGLO.method505(arg0));
				for (int var4 = 0; var4 < field411; var4++) {
					if (field37[var4] == arg0) {
						method106("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field439; var5++) {
					if (field80[var5] == arg0) {
						method106("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field37[field411++] = arg0;
				field118 = true;
				field328.method338(39);
				field328.method345(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method25() {
		try {
			field35 = -1;
			field297.method418();
			field465.method418();
			field377++;
			if (field377 > 1662) {
				field377 = 0;
				field328.method338(251);
				field328.method339(0);
				int var1 = field328.field965;
				field328.method340(35357);
				field328.method340(44205);
				field328.method340((int) (Math.random() * 65536.0D));
				field328.method339(195);
				field328.method339(135);
				field328.method340(22200);
				field328.method340((int) (Math.random() * 65536.0D));
				field328.method340(10016);
				field328.method340((int) (Math.random() * 65536.0D));
				field328.method339(206);
				field328.method348(field328.field965 - var1);
			}

			YFTZFAFG.method559();
			method45();
			field113.method449();
			System.gc();

			for (int var2 = 0; var2 < 4; var2++) {
				field194[var2].method188();
			}

			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						field308[var3][var4][var5] = 0;
					}
				}
			}

			GSYZIGPZ var6 = new GSYZIGPZ(104, field91, 104, field308);
			int var7 = field394.length;
			field328.method338(37);

			if (!field155) {
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = (field228[var8] >> 8) * 64 - field256;
					int var10 = (field228[var8] & 0xFF) * 64 - field257;
					byte[] var11 = field394[var8];
					if (var11 != null) {
						var6.method228((field31 - 6) * 8, var9, (field30 - 6) * 8, var10, field194, var11);
					}
				}

				for (int var12 = 0; var12 < var7; var12++) {
					int var13 = (field228[var12] >> 8) * 64 - field256;
					int var14 = (field228[var12] & 0xFF) * 64 - field257;
					byte[] var15 = field394[var12];
					if (var15 == null && field31 < 800) {
						var6.method230(64, var13, 64, var14);
					}
				}

				field328.method338(37);

				for (int var16 = 0; var16 < var7; var16++) {
					byte[] var17 = field271[var16];
					if (var17 != null) {
						int var18 = (field228[var16] >> 8) * 64 - field256;
						int var19 = (field228[var16] & 0xFF) * 64 - field257;
						var6.method242(field194, var18, var17, var19, field113);
					}
				}
			}

			if (field155) {
				for (int var20 = 0; var20 < 4; var20++) {
					for (int var21 = 0; var21 < 13; var21++) {
						for (int var22 = 0; var22 < 13; var22++) {
							int var23 = field423[var20][var21][var22];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field228.length; var29++) {
									if (field228[var29] == var28 && field394[var29] != null) {
										var6.method229((var26 & 0x7) * 8, var22 * 8, field394[var29], field194, var21 * 8, var24, var20, (var27 & 0x7) * 8, var25);
										break;
									}
								}
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field423[0][var30][var31];
						if (var32 == -1) {
							var6.method230(8, var30 * 8, 8, var31 * 8);
						}
					}
				}

				field328.method338(37);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field423[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field228.length; var42++) {
									if (field228[var42] == var41 && field271[var42] != null) {
										var6.method245((var40 & 0x7) * 8, field113, var37, field271[var42], var38, (var39 & 0x7) * 8, var34 * 8, var35 * 8, field194, var33);
										break;
									}
								}
							}
						}
					}
				}
			}

			field328.method338(37);
			var6.method247(field194, field113);

			if (field166 != null) {
				field166.method535();
				YFTZFAFG.field1440 = field49;
			}

			field328.method338(37);
			int var43 = GSYZIGPZ.field701;
			if (var43 > field83) {
				var43 = field83;
			}

			if (var43 < field83 - 1) {
				int var44 = field83 - 1;
			}

			if (field418) {
				field113.method450(GSYZIGPZ.field701);
			} else {
				field113.method450(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method120(var45, var46);
				}
			}

			method20();
		} catch (Exception var59) {
		}

		NRKXAGEB.field1024.method588();

		if (field478 != null) {
			field328.method338(225);
			field328.method343(1057001181);
		}

		if (field418 && signlink.cache_dat != null) {
			int var48 = field36.method533(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field36.method524(var49);
				if ((var50 & 0x79) == 0) {
					CSGBDGDY.method159(var49);
				}
			}
		}

		System.gc();
		YFTZFAFG.method560(20);
		field36.method527();
		int var51 = (field30 - 6) / 8 - 1;
		int var52 = (field30 + 6) / 8 + 1;
		int var53 = (field31 - 6) / 8 - 1;
		int var54 = (field31 + 6) / 8 + 1;
		if (field361) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field36.method520(var55, var56, 0);
					if (var57 != -1) {
						field36.method523(var57, 3);
					}

					int var58 = field36.method520(var55, var56, 1);
					if (var58 != -1) {
						field36.method523(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg4 >= 1 && arg1 <= 102 && arg4 <= 102) {
			if (field418 && field83 != arg0) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg5 == 0) {
				var8 = field113.method475(arg0, arg1, arg4);
			}

			if (arg5 == 1) {
				var8 = field113.method476(arg4, arg0, arg1);
			}

			if (arg5 == 2) {
				var8 = field113.method477(arg0, arg1, arg4);
			}

			if (arg5 == 3) {
				var8 = field113.method478(arg0, arg1, arg4);
			}

			if (var8 != 0) {
				int var12 = field113.method479(arg0, arg1, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg5 == 0) {
					field113.method466(arg4, arg0, arg1);
					NRKXAGEB var16 = NRKXAGEB.method400(var13);
					if (var16.field1000) {
						field194[arg0].method193(var16.field1029, var15, arg1, var14, arg4);
					}
				}

				if (arg5 == 1) {
					field113.method467(arg4, arg1, arg0);
				}

				if (arg5 == 2) {
					field113.method468(arg1, arg4, arg0);
					NRKXAGEB var17 = NRKXAGEB.method400(var13);
					if (var17.field987 + arg1 > 103 || var17.field987 + arg4 > 103 || var17.field1017 + arg1 > 103 || var17.field1017 + arg4 > 103) {
						return;
					}

					if (var17.field1000) {
						field194[arg0].method194(var15, arg1, var17.field987, var17.field1029, var17.field1017, arg4);
					}
				}

				if (arg5 == 3) {
					field113.method469(arg1, arg0, arg4);
					NRKXAGEB var18 = NRKXAGEB.method400(var13);
					if (var18.field1000 && var18.field1012) {
						field194[arg0].method196(arg4, arg1);
					}
				}
			}

			if (arg2 >= 0) {
				int var19 = arg0;
				if (arg0 < 3 && (field308[1][arg1][arg4] & 0x2) == 2) {
					var19 = arg0 + 1;
				}

				GSYZIGPZ.method244(arg0, field91, arg2, arg4, arg3, var19, field113, arg6, field194[arg0], arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method27() {
		for (PXEWTQHA var1 = (PXEWTQHA) field465.method414(); var1 != null; var1 = (PXEWTQHA) field465.method416()) {
			if (field83 != var1.field1112 || field453 > var1.field1107) {
				var1.method336();
			} else if (field453 >= var1.field1106) {
				if (var1.field1101 > 0) {
					ZLSEKGJR var2 = field305[var1.field1101 - 1];
					if (var2 != null && var2.field1405 >= 0 && var2.field1405 < 13312 && var2.field1406 >= 0 && var2.field1406 < 13312) {
						var1.method429(method52(var1.field1112, var2.field1406, var2.field1405) - var1.field1111, var2.field1405, var2.field1406, field453);
					}
				}

				if (var1.field1101 < 0) {
					int var3 = -var1.field1101 - 1;
					HDYGEGXY var4;
					if (field421 == var3) {
						var4 = field398;
					} else {
						var4 = field349[var3];
					}

					if (var4 != null && var4.field1405 >= 0 && var4.field1405 < 13312 && var4.field1406 >= 0 && var4.field1406 < 13312) {
						var1.method429(method52(var1.field1112, var4.field1406, var4.field1405) - var1.field1111, var4.field1405, var4.field1406, field453);
					}
				}

				var1.method430(field247);
				field113.method460((int) var1.field1120, 60, var1, field83, var1.field1113, -1, (int) var1.field1121, (int) var1.field1122, false);
			}
		}
	}

	@ObfuscatedName("client.a(IB)Z")
	public final boolean method28(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field208[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 918) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ZLHZINZKXF;)Z")
	public final boolean method29(HZINZKXF arg0) {
		int var2 = arg0.field856;
		if (field440 == 2) {
			if (var2 == 201) {
				field232 = true;
				field168 = 0;
				field320 = true;
				field414 = "";
				field283 = 1;
				field178 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field232 = true;
				field168 = 0;
				field320 = true;
				field414 = "";
				field283 = 2;
				field178 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field125 = 250;
			return true;
		}

		if (var2 == 501) {
			field232 = true;
			field168 = 0;
			field320 = true;
			field414 = "";
			field283 = 4;
			field178 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field232 = true;
			field168 = 0;
			field320 = true;
			field414 = "";
			field283 = 5;
			field178 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field309[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = RPRWOACX.field1171 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= RPRWOACX.field1171) {
							var5 = 0;
						}
					}

					if (!RPRWOACX.field1172[var5].field1178 && RPRWOACX.field1172[var5].field1173 == var3 + (field272 ? 0 : 7)) {
						break;
					}
				}

				field309[var3] = var5;
				field56 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field212[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field154[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field154[var6].length) {
					var8 = 0;
				}
			}

			field212[var6] = var8;
			field56 = true;
		}

		if (var2 == 324 && !field272) {
			field272 = true;
			method122();
		}

		if (var2 == 325 && field272) {
			field272 = false;
			method122();
		}

		if (var2 == 326) {
			field328.method338(104);
			field328.method339(field272 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field328.method339(field309[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field328.method339(field212[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field269 = !field269;
		}

		if (var2 >= 601 && var2 <= 613) {
			method110();

			if (field233.length() > 0) {
				field328.method338(96);
				field328.method345(UJPWWGLO.method504(field233));
				field328.method339(var2 - 601);
				field328.method339(field269 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(BLRZWMPYWU;)V")
	public final void method30(RZWMPYWU arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field210.length; var3++) {
			field210[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field210[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field211[var9] = (field210[var9 - 1] + field210[var9 + 1] + field210[var9 - 128] + field210[var9 + 128]) / 4;
				}
			}

			int[] var10 = field210;
			field210 = field211;
			field211 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1182; var12++) {
				for (int var13 = 0; var13 < arg0.field1181; var13++) {
					if (arg0.field1179[var11++] != 0) {
						int var14 = var13 + arg0.field1183 + 16;
						int var15 = var12 + arg0.field1184 + 16;
						int var16 = (var15 << 7) + var14;
						field210[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method31() {
		signlink.reporterror = false;

		try {
			if (field127 != null) {
				field127.method578();
			}
		} catch (Exception var1) {
		}

		field127 = null;
		method19();

		if (field65 != null) {
			field65.field938 = false;
		}

		field65 = null;
		field36.method530();
		field36 = null;
		field304 = null;
		field328 = null;
		field225 = null;
		field379 = null;
		field228 = null;
		field394 = null;
		field271 = null;
		field229 = null;
		field230 = null;
		field91 = null;
		field308 = null;
		field113 = null;
		field194 = null;
		field33 = null;
		field393 = null;
		field263 = null;
		field264 = null;
		field191 = null;
		field164 = null;
		field165 = null;
		field166 = null;
		field167 = null;
		field330 = null;
		field331 = null;
		field332 = null;
		field454 = null;
		field455 = null;
		field456 = null;
		field457 = null;
		field458 = null;
		field459 = null;
		field460 = null;
		field461 = null;
		field462 = null;
		field344 = null;
		field345 = null;
		field346 = null;
		field300 = null;
		field301 = null;
		field302 = null;
		field38 = null;
		field370 = null;
		field371 = null;
		field372 = null;
		field373 = null;
		field374 = null;
		field179 = null;
		field180 = null;
		field181 = null;
		field182 = null;
		field183 = null;
		field412 = null;
		field445 = null;
		field273 = null;
		field98 = null;
		field355 = null;
		field463 = null;
		field34 = null;
		field447 = null;
		field448 = null;
		field449 = null;
		field450 = null;
		field451 = null;
		field464 = null;
		field299 = null;
		field392 = null;
		field349 = null;
		field351 = null;
		field353 = null;
		field354 = null;
		field88 = null;
		field305 = null;
		field307 = null;
		field226 = null;
		field359 = null;
		field465 = null;
		field297 = null;
		field206 = null;
		field207 = null;
		field208 = null;
		field209 = null;
		field146 = null;
		field117 = null;
		field425 = null;
		field426 = null;
		field57 = null;
		field186 = null;
		field94 = null;
		field80 = null;
		field221 = null;
		field140 = null;
		field141 = null;
		field137 = null;
		field138 = null;
		field139 = null;
		field142 = null;
		field143 = null;
		field144 = null;
		field145 = null;
		method78();
		NRKXAGEB.method403();
		GALAVQEJ.method209();
		HVTLSJTR.method265();
		HZINZKXF.method271();
		UMMMVDGS.field1277 = null;
		RPRWOACX.field1172 = null;
		GVTZFBGS.field704 = null;
		PNPNYEVW.field1058 = null;
		FXNZCBPL.field620 = null;
		FXNZCBPL.field632 = null;
		LZWYDZNA.field940 = null;
		field476 = null;
		HDYGEGXY.field719 = null;
		YFTZFAFG.method556();
		TEXKPKZX.method448();
		CSGBDGDY.method156();
		KDJQGGIG.method283();
		System.gc();
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method32(int arg0, String arg1) {
		field32 = arg0;
		field335 = arg1;
		method81();

		if (field254 == null) {
			super.method32(arg0, arg1);
		} else {
			field139.method535();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field384.method212(0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			NQLGXPRA.method394(0x8C1111, var6, 304, 34, var3 / 2 - 152);
			NQLGXPRA.method394(0, var6 + 1, 302, 32, var3 / 2 - 151);
			NQLGXPRA.method393(var3 / 2 - 150, 0x8C1111, 30, var6 + 2, arg0 * 3);
			NQLGXPRA.method393(arg0 * 3 + var3 / 2 - 150, 0, 30, var6 + 2, 300 - arg0 * 3);
			field384.method212(0xFFFFFF, var3 / 2, arg1, var4 / 2 + 5 - var5);
			field139.method536(202, 171, field475);

			if (field224) {
				field224 = false;

				if (!field380) {
					field140.method536(0, 0, field475);
					field141.method536(637, 0, field475);
				}

				field137.method536(128, 0, field475);
				field138.method536(202, 371, field475);
				field142.method536(0, 265, field475);
				field143.method536(562, 265, field475);
				field144.method536(128, 171, field475);
				field145.method536(562, 171, field475);
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method33() {
		field224 = true;
	}

	@ObfuscatedName("client.a(BIIIII)V")
	public final void method34(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field44.method442(arg1, arg2);
		field45.method442(arg1, arg2 + arg4 - 16);
		NQLGXPRA.method393(arg1, field104, arg4 - 32, arg2 + 16, 16);
		int var6 = (arg4 - 32) * arg4 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg3 / (arg0 - arg4);
		NQLGXPRA.method393(arg1, field95, var6, arg2 + var7 + 16, 16);
		NQLGXPRA.method398(field114, arg2 + var7 + 16, arg1, var6);
		NQLGXPRA.method398(field114, arg2 + var7 + 16, arg1 + 1, var6);
		NQLGXPRA.method396(arg2 + var7 + 16, field114, arg1, 16);
		NQLGXPRA.method396(arg2 + var7 + 17, field114, arg1, 16);
		NQLGXPRA.method398(field126, arg2 + var7 + 16, arg1 + 15, var6);
		NQLGXPRA.method398(field126, arg2 + var7 + 17, arg1 + 14, var6 - 1);
		NQLGXPRA.method396(arg2 + var7 + var6 + 15, field126, arg1, 16);
		NQLGXPRA.method396(arg2 + var7 + var6 + 14, field126, arg1 + 1, 15);
	}

	@ObfuscatedName("client.g(I)V")
	public final void method35() {
		if (field431 == 0 && field150 == 0) {
			field146[field466] = "Walk here";
			field208[field466] = 872;
			field206[field466] = field483;
			field207[field466] = field484;
			field466++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < CSGBDGDY.field564; var2++) {
			int var3 = CSGBDGDY.field565[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field113.method479(field83, var4, var5, var3) >= 0) {
					NRKXAGEB var8 = NRKXAGEB.method400(var7);
					if (var8.field1005 != null) {
						var8 = var8.method410();
					}

					if (var8 == null) {
						continue;
					}

					if (field431 == 1) {
						field146[field466] = "Use " + field435 + " with @cya@" + var8.field1020;
						field208[field466] = 677;
						field209[field466] = var3;
						field206[field466] = var4;
						field207[field466] = var5;
						field466++;
					} else if (field150 != 1) {
						if (var8.field992 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field992[var9] != null) {
									field146[field466] = var8.field992[var9] + " @cya@" + var8.field1020;

									if (var9 == 0) {
										field208[field466] = 673;
									}

									if (var9 == 1) {
										field208[field466] = 795;
									}

									if (var9 == 2) {
										field208[field466] = 652;
									}

									if (var9 == 3) {
										field208[field466] = 307;
									}

									if (var9 == 4) {
										field208[field466] = 1238;
									}

									field209[field466] = var3;
									field206[field466] = var4;
									field207[field466] = var5;
									field466++;
								}
							}
						}

						field146[field466] = "Examine @cya@" + var8.field1020;
						field208[field466] = 1788;
						field209[field466] = var8.field996 << 14;
						field206[field466] = var4;
						field207[field466] = var5;
						field466++;
					} else if ((field152 & 0x4) == 4) {
						field146[field466] = field153 + " @cya@" + var8.field1020;
						field208[field466] = 45;
						field209[field466] = var3;
						field206[field466] = var4;
						field207[field466] = var5;
						field466++;
					}
				}

				if (var6 == 1) {
					ZLSEKGJR var10 = field305[var7];
					if (var10.field1475.field656 == 1 && (var10.field1405 & 0x7F) == 0x40 && (var10.field1406 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field306; var11++) {
							ZLSEKGJR var12 = field305[field307[var11]];
							if (var12 != null && var10 != var12 && var12.field1475.field656 == 1 && var10.field1405 == var12.field1405 && var10.field1406 == var12.field1406) {
								method111(field307[var11], var5, var12.field1475, var4);
							}
						}

						for (int var13 = 0; var13 < field350; var13++) {
							HDYGEGXY var14 = field349[field351[var13]];
							if (var14 != null && var10.field1405 == var14.field1405 && var10.field1406 == var14.field1406) {
								method136(field351[var13], var5, var14, var4);
							}
						}
					}

					method111(var7, var5, var10.field1475, var4);
				}

				if (var6 == 0) {
					HDYGEGXY var15 = field349[var7];
					if ((var15.field1405 & 0x7F) == 0x40 && (var15.field1406 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field306; var16++) {
							ZLSEKGJR var17 = field305[field307[var16]];
							if (var17 != null && var17.field1475.field656 == 1 && var15.field1405 == var17.field1405 && var15.field1406 == var17.field1406) {
								method111(field307[var16], var5, var17.field1475, var4);
							}
						}

						for (int var18 = 0; var18 < field350; var18++) {
							HDYGEGXY var19 = field349[field351[var18]];
							if (var19 != null && var15 != var19 && var15.field1405 == var19.field1405 && var15.field1406 == var19.field1406) {
								method136(field351[var18], var5, var19, var4);
							}
						}
					}

					method136(var7, var5, var15, var4);
				}

				if (var6 == 3) {
					OCPYCLUF var20 = field226[field83][var4][var5];
					if (var20 != null) {
						for (FIJVWXBZ var21 = (FIJVWXBZ) var20.method415(); var21 != null; var21 = (FIJVWXBZ) var20.method417()) {
							HVTLSJTR var22 = HVTLSJTR.method254(var21.field617);
							if (field431 == 1) {
								field146[field466] = "Use " + field435 + " with @lre@" + var22.field782;
								field208[field466] = 800;
								field209[field466] = var21.field617;
								field206[field466] = var4;
								field207[field466] = var5;
								field466++;
							} else if (field150 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field776 != null && var22.field776[var23] != null) {
										field146[field466] = var22.field776[var23] + " @lre@" + var22.field782;

										if (var23 == 0) {
											field208[field466] = 948;
										}

										if (var23 == 1) {
											field208[field466] = 816;
										}

										if (var23 == 2) {
											field208[field466] = 185;
										}

										if (var23 == 3) {
											field208[field466] = 405;
										}

										if (var23 == 4) {
											field208[field466] = 309;
										}

										field209[field466] = var21.field617;
										field206[field466] = var4;
										field207[field466] = var5;
										field466++;
									} else if (var23 == 2) {
										field146[field466] = "Take @lre@" + var22.field782;
										field208[field466] = 185;
										field209[field466] = var21.field617;
										field206[field466] = var4;
										field207[field466] = var5;
										field466++;
									}
								}

								field146[field466] = "Examine @lre@" + var22.field782;
								field208[field466] = 1249;
								field209[field466] = var21.field617;
								field206[field466] = var4;
								field207[field466] = var5;
								field466++;
							} else if ((field152 & 0x1) == 1) {
								field146[field466] = field153 + " @lre@" + var22.field782;
								field208[field466] = 807;
								field209[field466] = var21.field617;
								field206[field466] = var4;
								field207[field466] = var5;
								field466++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method36() {
		try {
			int var1 = field398.field1405 + field77;
			int var2 = field398.field1406 + field436;
			if (field310 - var1 < -500 || field310 - var1 > 500 || field311 - var2 < -500 || field311 - var2 > 500) {
				field310 = var1;
				field311 = var2;
			}

			if (field310 != var1) {
				field310 += (var1 - field310) / 16;
			}

			if (field311 != var2) {
				field311 += (var2 - field311) / 16;
			}

			if (field493[1] == 1) {
				field292 += (-field292 - 24) / 2;
			} else if (field493[2] == 1) {
				field292 += (24 - field292) / 2;
			} else {
				field292 /= 2;
			}

			if (field493[3] == 1) {
				field293 += (12 - field293) / 2;
			} else if (field493[4] == 1) {
				field293 += (-field293 - 12) / 2;
			} else {
				field293 /= 2;
			}

			field291 = field292 / 2 + field291 & 0x7FF;
			field290 += field293 / 2;
			if (field290 < 128) {
				field290 = 128;
			}

			if (field290 > 383) {
				field290 = 383;
			}

			int var3 = field310 >> 7;
			int var4 = field311 >> 7;
			int var5 = method52(field83, field311, field310);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field83;
						if (var9 < 3 && (field308[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field91[var9][var7][var8];
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

			if (var11 > field131) {
				field131 += (var11 - field131) / 24;
			} else if (var11 < field131) {
				field131 += (var11 - field131) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field398.field1405 + "," + field398.field1406 + "," + field310 + "," + field311 + "," + field30 + "," + field31 + "," + field256 + "," + field257);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method37() {
		if (field418 && field239 == 2 && GSYZIGPZ.field690 != field83) {
			method145("Loading - please wait.", null);
			field239 = 1;
			field170 = System.currentTimeMillis();
		}

		if (field239 == 1) {
			int var1 = method38();
			if (var1 != 0 && System.currentTimeMillis() - field170 > 360000L) {
				signlink.reporterror(field119 + " glcfb " + field133 + "," + var1 + "," + field418 + "," + field85[0] + "," + field36.method529() + "," + field83 + "," + field30 + "," + field31);
				field170 = System.currentTimeMillis();
			}
		}

		if (field239 == 2 && field83 != field35) {
			field35 = field83;
			method148(field83);
		}
	}

	@ObfuscatedName("client.i(I)I")
	public final int method38() {
		for (int var1 = 0; var1 < field394.length; var1++) {
			if (field394[var1] == null && field229[var1] != -1) {
				return -1;
			}

			if (field271[var1] == null && field230[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field394.length; var3++) {
			byte[] var4 = field271[var3];
			if (var4 != null) {
				int var5 = (field228[var3] >> 8) * 64 - field256;
				int var6 = (field228[var3] & 0xFF) * 64 - field257;
				if (field155) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= GSYZIGPZ.method233(var6, var5, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field255) {
			return -4;
		} else {
			field239 = 2;
			GSYZIGPZ.field690 = field83;
			method25();
			field328.method338(223);
			return 0;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method39() {
		for (int var1 = -1; var1 < field350; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field348;
			} else {
				var2 = field351[var1];
			}

			HDYGEGXY var3 = field349[var2];
			if (var3 != null) {
				method63(1, var3);
			}
		}

		field319++;
		if (field319 > 1283) {
			field319 = 0;
			field328.method338(91);
			field328.method339(0);
			int var4 = field328.field965;
			field328.method340((int) (Math.random() * 65536.0D));
			field328.method339(50);
			field328.method340((int) (Math.random() * 65536.0D));
			field328.method339((int) (Math.random() * 256.0D));
			field328.method340((int) (Math.random() * 65536.0D));
			field328.method339(101);
			field328.method339(204);
			field328.method340((int) (Math.random() * 65536.0D));
			field328.method339((int) (Math.random() * 256.0D));
			field328.method340(26268);
			field328.method348(field328.field965 - var4);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method40() {
		if (field476 == null) {
			method78();
			field137 = null;
			field138 = null;
			field139 = null;
			field140 = null;
			field141 = null;
			field142 = null;
			field143 = null;
			field144 = null;
			field145 = null;
			field167 = null;
			field165 = null;
			field164 = null;
			field166 = null;
			field330 = null;
			field331 = null;
			field332 = null;
			field476 = new VOQVBLJN(503, 765, method92());
			field224 = true;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public static final void method41() {
		TEXKPKZX.field1212 = true;
		YFTZFAFG.field1429 = true;
		field418 = true;
		GSYZIGPZ.field682 = true;
		NRKXAGEB.field999 = true;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method42() {
		for (int var1 = -1; var1 < field350; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field348;
			} else {
				var2 = field351[var1];
			}

			HDYGEGXY var3 = field349[var2];
			if (var3 != null && var3.field1364 > 0) {
				var3.field1364--;
				if (var3.field1364 == 0) {
					var3.field1371 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field306; var4++) {
			int var5 = field307[var4];
			ZLSEKGJR var6 = field305[var5];
			if (var6 != null && var6.field1364 > 0) {
				var6.field1364--;
				if (var6.field1364 == 0) {
					var6.field1371 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method43() {
		if (field276 != 0) {
			int var1 = 0;
			if (field336 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field43[var2] != null) {
					int var3 = field41[var2];
					String var4 = field42[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field172 == 0 || field172 == 1 && method114(var4))) {
						int var8 = 329 - var1 * 13;
						if (field483 > 4 && field484 - 4 > var8 - 10 && field484 - 4 <= var8 + 3) {
							int var9 = field383.method214("From:  " + var4 + field43[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field483 < var9 + 4) {
								if (field81 >= 1) {
									field146[field466] = "Report abuse @whi@" + var4;
									field208[field466] = 2345;
									field466++;
								}

								field146[field466] = "Add ignore @whi@" + var4;
								field208[field466] = 2648;
								field466++;
								field146[field466] = "Add friend @whi@" + var4;
								field208[field466] = 2918;
								field466++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field172 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method44(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field113.method475(arg3, arg4, arg0);
		if (var6 != 0) {
			int var7 = field113.method479(arg3, arg4, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg1;
			}

			int[] var11 = field186.field1505;
			int var12 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			NRKXAGEB var14 = NRKXAGEB.method400(var13);
			if (var14.field1019 == -1) {
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
				RZWMPYWU var15 = field464[var14.field1019];
				if (var15 != null) {
					int var16 = (var14.field987 * 4 - var15.field1181) / 2;
					int var17 = (var14.field1017 * 4 - var15.field1182) / 2;
					var15.method442(arg4 * 4 + var16 + 48, (104 - arg0 - var14.field1017) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field113.method477(arg3, arg4, arg0);
		if (var18 != 0) {
			int var19 = field113.method479(arg3, arg4, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			NRKXAGEB var23 = NRKXAGEB.method400(var22);
			if (var23.field1019 != -1) {
				RZWMPYWU var24 = field464[var23.field1019];
				if (var24 != null) {
					int var25 = (var23.field987 * 4 - var24.field1181) / 2;
					int var26 = (var23.field1017 * 4 - var24.field1182) / 2;
					var24.method442(arg4 * 4 + var25 + 48, (104 - arg0 - var23.field1017) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field186.field1505;
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

		int var30 = field113.method478(arg3, arg4, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			NRKXAGEB var32 = NRKXAGEB.method400(var31);
			if (var32.field1019 != -1) {
				RZWMPYWU var33 = field464[var32.field1019];
				if (var33 != null) {
					int var34 = (var32.field987 * 4 - var33.field1181) / 2;
					int var35 = (var32.field1017 * 4 - var33.field1182) / 2;
					var33.method442(arg4 * 4 + var34 + 48, (104 - arg0 - var32.field1017) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method45() {
		NRKXAGEB.field1024.method588();
		NRKXAGEB.field1026.method588();
		GALAVQEJ.field634.method588();
		HVTLSJTR.field748.method588();
		HVTLSJTR.field769.method588();
		HDYGEGXY.field719.method588();
		FXNZCBPL.field632.method588();
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method46() {
		if (!field318 && !field205 && !field169) {
			field453++;

			if (field366) {
				method88();
			} else {
				method70();
			}

			method147();
		}
	}

	@ObfuscatedName("client.f(Z)I")
	public final int method47() {
		int var1 = 3;
		if (field61 < 310) {
			int var2 = field58 >> 7;
			int var3 = field60 >> 7;
			int var4 = field398.field1405 >> 7;
			int var5 = field398.field1406 >> 7;

			if ((field308[field83][var2][var3] & 0x4) != 0) {
				var1 = field83;
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

					if ((field308[field83][var2][var3] & 0x4) != 0) {
						var1 = field83;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field308[field83][var2][var3] & 0x4) != 0) {
							var1 = field83;
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

					if ((field308[field83][var2][var3] & 0x4) != 0) {
						var1 = field83;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field308[field83][var2][var3] & 0x4) != 0) {
							var1 = field83;
						}
					}
				}
			}
		}

		if ((field308[field83][field398.field1405 >> 7][field398.field1406 >> 7] & 0x4) != 0) {
			var1 = field83;
		}

		return var1;
	}

	@ObfuscatedName("client.g(Z)I")
	public final int method48() {
		int var1 = method52(field83, field60, field58);
		if (var1 - field59 < 800 && (field308[field83][field58 >> 7][field60 >> 7] & 0x4) != 0) {
			return field83;
		}

		return 3;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method49() {
		if (field318 || field205 || field169) {
			method101();
		} else {
			field214++;

			if (field366) {
				method69();
			} else {
				method71(false);
			}

			field84 = 0;
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method50(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field439; var3++) {
				if (field80[var3] == arg0) {
					field439--;
					field118 = true;

					for (int var4 = var3; var4 < field439; var4++) {
						field94[var4] = field94[var4 + 1];
						field221[var4] = field221[var4 + 1];
						field80[var4] = field80[var4 + 1];
					}

					field328.method338(202);
					field328.method345(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method51(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method52(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field308[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field91[var6][var4][var5] + field91[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field91[var6][var4][var5 + 1] + field91[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method53(boolean arg0) {
		for (int var2 = 0; var2 < field306; var2++) {
			ZLSEKGJR var3 = field305[field307[var2]];
			int var4 = (field307[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method250() && var3.field1475.field637 == arg0 && var3.field1475.method208()) {
				int var5 = var3.field1405 >> 7;
				int var6 = var3.field1406 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1375 == 1 && (var3.field1405 & 0x7F) == 0x40 && (var3.field1406 & 0x7F) == 0x40) {
						if (field392[var5][var6] == field238) {
							continue;
						}

						field392[var5][var6] = field238;
					}

					if (!var3.field1475.field663) {
						var4 += Integer.MIN_VALUE;
					}

					field113.method460(var3.field1405, (var3.field1375 - 1) * 64 + 60, var3, field83, var3.field1407, var4, var3.field1406, method52(field83, var3.field1406, var3.field1405), var3.field1384);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILNHEPCMLW;I)V")
	public final void method54(NHEPCMLW arg0, int arg1) {
		arg0.method359();
		int var3 = arg0.method360(8);
		if (var3 < field306) {
			for (int var4 = var3; var4 < field306; var4++) {
				field88[field87++] = field307[var4];
			}
		}

		if (var3 > field306) {
			signlink.reporterror(field119 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field306 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field307[var5];
			ZLSEKGJR var7 = field305[var6];
			int var8 = arg0.method360(1);
			if (var8 == 0) {
				field307[field306++] = var6;
				var7.field1367 = field453;
			} else {
				int var9 = arg0.method360(2);
				if (var9 == 0) {
					field307[field306++] = var6;
					var7.field1367 = field453;
					field353[field352++] = var6;
				} else if (var9 == 1) {
					field307[field306++] = var6;
					var7.field1367 = field453;
					int var10 = arg0.method360(3);
					var7.method548(false, var10);
					int var11 = arg0.method360(1);
					if (var11 == 1) {
						field353[field352++] = var6;
					}
				} else if (var9 == 2) {
					field307[field306++] = var6;
					var7.field1367 = field453;
					int var12 = arg0.method360(3);
					var7.method548(true, var12);
					int var13 = arg0.method360(3);
					var7.method548(true, var13);
					int var14 = arg0.method360(1);
					if (var14 == 1) {
						field353[field352++] = var6;
					}
				} else if (var9 == 3) {
					field88[field87++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method55(int arg0) {
		if (arg0 >= 0) {
			if (field168 != 0) {
				field168 = 0;
				field232 = true;
			}

			int var2 = field206[arg0];
			int var3 = field207[arg0];
			int var4 = field208[arg0];
			int var5 = field209[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 996) {
				HDYGEGXY var6 = field349[var5];
				if (var6 != null) {
					method6(0, var6.field1366[0], field398.field1366[0], false, 0, 0, 2, var6.field1365[0], 1, field398.field1365[0], 1);
					field51 = field490;
					field52 = field491;
					field54 = 2;
					field53 = 0;
					field328.method338(21);
					field328.method372(var5);
				}
			}

			if (var4 == 795) {
				method128(var2, var3, var5);
				field328.method338(78);
				field328.method373(var5 >> 14 & 0x7FFF);
				field328.method340(field256 + var2);
				field328.method373(field257 + var3);
			}

			if (var4 == 87) {
				field431 = 1;
				field432 = var2;
				field433 = var3;
				field434 = var5;
				field435 = HVTLSJTR.method254(var5).field782;
				field150 = 0;
				field118 = true;
			} else {
				if (var4 == 816) {
					boolean var7 = method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 0, field398.field1365[0], 0);
					if (!var7) {
						method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 1, field398.field1365[0], 1);
					}

					field51 = field490;
					field52 = field491;
					field54 = 2;
					field53 = 0;
					field328.method338(9);
					field328.method374(var5);
					field328.method340(field256 + var2);
					field328.method340(field257 + var3);
				}

				if (var4 == 214 && !field163) {
					field328.method338(214);
					field328.method340(var3);
					field163 = true;
				}

				if (var4 == 597) {
					field328.method338(80);
					field328.method340(var3);
					HZINZKXF var9 = HZINZKXF.method269(var3);
					if (var9.field857 != null && var9.field857[0][0] == 5) {
						int var10 = var9.field857[0][1];
						if (field117[var10] != var9.field791[0]) {
							field117[var10] = var9.field791[0];
							method85(var10);
							field118 = true;
						}
					}
				}

				if (var4 == 1238) {
					method128(var2, var3, var5);
					field328.method338(113);
					field328.method373(var5 >> 14 & 0x7FFF);
					field328.method372(field257 + var3);
					field328.method374(field256 + var2);
				}

				if (var4 == 623) {
					HZINZKXF var11 = HZINZKXF.method269(var3);
					boolean var12 = true;
					if (var11.field856 > 0) {
						var12 = method29(var11);
					}

					if (var12) {
						field328.method338(80);
						field328.method340(var3);
					}
				}

				if (var4 == 943) {
					HZINZKXF var13 = HZINZKXF.method269(var3);
					field150 = 1;
					field151 = var3;
					field152 = var13.field810;
					field431 = 0;
					field118 = true;
					String var14 = var13.field847;
					if (var14.indexOf(" ") != -1) {
						var14 = var14.substring(0, var14.indexOf(" "));
					}

					String var15 = var13.field847;
					if (var15.indexOf(" ") != -1) {
						var15 = var15.substring(var15.indexOf(" ") + 1);
					}

					field153 = var14 + " " + var13.field794 + " " + var15;

					if (field152 == 16) {
						field118 = true;
						field189 = 3;
						field241 = true;
					}
				} else {
					if (var4 == 58) {
						ZLSEKGJR var16 = field305[var5];
						if (var16 != null) {
							method6(0, var16.field1366[0], field398.field1366[0], false, 0, 0, 2, var16.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(231);
							field328.method340(field432);
							field328.method372(field434);
							field328.method372(field433);
							field328.method373(var5);
						}
					}

					if (var4 == 807) {
						boolean var17 = method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 0, field398.field1365[0], 0);
						if (!var17) {
							method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 1, field398.field1365[0], 1);
						}

						field51 = field490;
						field52 = field491;
						field54 = 2;
						field53 = 0;
						field328.method338(99);
						field328.method373(field256 + var2);
						field328.method372(var5);
						field328.method372(field151);
						field328.method340(field257 + var3);
					}

					if (var4 == 320) {
						field328.method338(165);
						field328.method374(var5);
						field328.method374(field433);
						field328.method340(var3);
						field328.method373(var2);
						field328.method374(field434);
						field328.method374(field432);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 478) {
						field328.method338(234);
						field328.method373(var3);
						field328.method373(var5);
						field328.method374(var2);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 1249) {
						HVTLSJTR var19 = HVTLSJTR.method254(var5);
						String var20;
						if (var19.field778 == null) {
							var20 = "It's a " + var19.field782 + ".";
						} else {
							var20 = new String(var19.field778);
						}

						method106("", var20, 0);
					}

					if (var4 == 641) {
						field328.method338(233);
						field328.method340(var2);
						field328.method340(var5);
						field328.method373(var3);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 461) {
						HDYGEGXY var21 = field349[var5];
						if (var21 != null) {
							method6(0, var21.field1366[0], field398.field1366[0], false, 0, 0, 2, var21.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(2);
							field328.method372(var5);
						}
					}

					if (var4 == 546) {
						field328.method338(221);
						field328.method374(var3);
						field328.method374(var2);
						field328.method372(var5);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 45 && method128(var2, var3, var5)) {
						field328.method338(28);
						field328.method372(var5 >> 14 & 0x7FFF);
						field328.method372(field256 + var2);
						field328.method372(field151);
						field328.method373(field257 + var3);
					}

					if (var4 == 652) {
						method128(var2, var3, var5);
						field328.method338(61);
						field328.method374(field257 + var3);
						field328.method340(field256 + var2);
						field328.method373(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 691) {
						ZLSEKGJR var22 = field305[var5];
						if (var22 != null) {
							method6(0, var22.field1366[0], field398.field1366[0], false, 0, 0, 2, var22.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field368 += var5;
							if (field368 >= 109) {
								field328.method338(68);
								field328.method340(23936);
								field368 = 0;
							}

							field328.method338(93);
							field328.method374(var5);
						}
					}

					if (var4 == 48) {
						field328.method338(80);
						field328.method340(var3);
						HZINZKXF var23 = HZINZKXF.method269(var3);
						if (var23.field857 != null && var23.field857[0][0] == 5) {
							int var24 = var23.field857[0][1];
							field117[var24] = 1 - field117[var24];
							method85(var24);
							field118 = true;
						}
					}

					if (var4 == 503) {
						String var25 = field146[arg0];
						int var26 = var25.indexOf("@whi@");
						if (var26 != -1) {
							long var27 = UJPWWGLO.method504(var25.substring(var26 + 5).trim());
							int var29 = -1;
							for (int var30 = 0; var30 < field439; var30++) {
								if (field80[var30] == var27) {
									var29 = var30;
									break;
								}
							}

							if (var29 != -1 && field221[var29] > 0) {
								field232 = true;
								field168 = 0;
								field320 = true;
								field414 = "";
								field283 = 3;
								field227 = field80[var29];
								field178 = "Enter message to send to " + field94[var29];
							}
						}
					}

					if (var4 == 743) {
						ZLSEKGJR var31 = field305[var5];
						if (var31 != null) {
							method6(0, var31.field1366[0], field398.field1366[0], false, 0, 0, 2, var31.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(108);
							field328.method372(var5);
						}
					}

					if (var4 == 518) {
						HDYGEGXY var32 = field349[var5];
						if (var32 != null) {
							method6(0, var32.field1366[0], field398.field1366[0], false, 0, 0, 2, var32.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(152);
							field328.method373(var5);
						}
					}

					if (var4 == 307) {
						method128(var2, var3, var5);
						field328.method338(176);
						field328.method372(field256 + var2);
						field328.method374(var5 >> 14 & 0x7FFF);
						field328.method340(field257 + var3);
					}

					if (var4 == 96) {
						field188++;
						if (field188 >= 124) {
							field328.method338(184);
							field328.method343(0);
							field188 = 0;
						}

						field328.method338(115);
						field328.method340(var2);
						field328.method373(var3);
						field328.method374(var5);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 405) {
						boolean var33 = method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 0, field398.field1365[0], 0);
						if (!var33) {
							method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 1, field398.field1365[0], 1);
						}

						field51 = field490;
						field52 = field491;
						field54 = 2;
						field53 = 0;
						field328.method338(117);
						field328.method373(var5);
						field328.method340(field257 + var3);
						field328.method372(field256 + var2);
					}

					if (var4 == 129) {
						field328.method338(59);
						field328.method374(var3);
						field328.method374(var2);
						field328.method340(var5);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 504) {
						method110();
					}

					if (var4 == 905) {
						field328.method338(215);
						field328.method372(var5);
						field328.method340(var2);
						field328.method374(var3);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 170) {
						field328.method338(164);
						field328.method373(var5);
						field328.method373(var3);
						field328.method373(var2);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 918 || var4 == 648 || var4 == 37 || var4 == 730) {
						String var35 = field146[arg0];
						int var36 = var35.indexOf("@whi@");
						if (var36 != -1) {
							long var37 = UJPWWGLO.method504(var35.substring(var36 + 5).trim());
							if (var4 == 918) {
								method84(var37);
							}

							if (var4 == 648) {
								method24(var37);
							}

							if (var4 == 37) {
								method50(var37);
							}

							if (var4 == 730) {
								method10(var37);
							}
						}
					}

					if (var4 == 309) {
						boolean var39 = method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 0, field398.field1365[0], 0);
						if (!var39) {
							method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 1, field398.field1365[0], 1);
						}

						field51 = field490;
						field52 = field491;
						field54 = 2;
						field53 = 0;
						field316++;
						if (field316 >= 91) {
							field328.method338(162);
							field316 = 0;
						}

						field328.method338(171);
						field328.method374(field257 + var3);
						field328.method374(var5);
						field328.method340(field256 + var2);
					}

					if (var4 == 1788) {
						int var41 = var5 >> 14 & 0x7FFF;
						NRKXAGEB var42 = NRKXAGEB.method400(var41);
						String var43;
						if (var42.field1030 == null) {
							var43 = "It's a " + var42.field1020 + ".";
						} else {
							var43 = new String(var42.field1030);
						}

						method106("", var43, 0);
					}

					if (var4 == 408) {
						HDYGEGXY var44 = field349[var5];
						if (var44 != null) {
							method6(0, var44.field1366[0], field398.field1366[0], false, 0, 0, 2, var44.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(187);
							field328.method374(var5);
						}
					}

					if (var4 == 465) {
						ZLSEKGJR var45 = field305[var5];
						if (var45 != null) {
							method6(0, var45.field1366[0], field398.field1366[0], false, 0, 0, 2, var45.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(54);
							field328.method372(var5);
							field328.method340(field151);
						}
					}

					if (var4 == 355) {
						HDYGEGXY var46 = field349[var5];
						if (var46 != null) {
							method6(0, var46.field1366[0], field398.field1366[0], false, 0, 0, 2, var46.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(129);
							field328.method372(var5);
						}
					}

					if (var4 == 940) {
						field67++;
						if (field67 >= 78) {
							field328.method338(17);
							field67 = 0;
						}

						field328.method338(70);
						field328.method340(var2);
						field328.method372(var3);
						field328.method340(var5);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 1187) {
						HVTLSJTR var47 = HVTLSJTR.method254(var5);
						HZINZKXF var48 = HZINZKXF.method269(var3);
						String var49;
						if (var48 != null && var48.field840[var2] >= 100000) {
							var49 = var48.field840[var2] + " x " + var47.field782;
						} else if (var47.field778 == null) {
							var49 = "It's a " + var47.field782 + ".";
						} else {
							var49 = new String(var47.field778);
						}

						method106("", var49, 0);
					}

					if (var4 == 916) {
						ZLSEKGJR var50 = field305[var5];
						if (var50 != null) {
							method6(0, var50.field1366[0], field398.field1366[0], false, 0, 0, 2, var50.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(206);
							field328.method373(var5);
						}
					}

					if (var4 == 1117) {
						ZLSEKGJR var51 = field305[var5];
						if (var51 != null) {
							GALAVQEJ var52 = var51.field1475;
							if (var52.field658 != null) {
								var52 = var52.method206();
							}

							if (var52 != null) {
								String var53;
								if (var52.field633 == null) {
									var53 = "It's a " + var52.field657 + ".";
								} else {
									var53 = new String(var52.field633);
								}

								method106("", var53, 0);
							}
						}
					}

					if (var4 == 872) {
						if (field132) {
							field113.method487(var2 - 4, var3 - 4);
						} else {
							field113.method487(field490 - 4, field491 - 4);
						}
					}

					if (var4 == 800) {
						boolean var54 = method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 0, field398.field1365[0], 0);
						if (!var54) {
							method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 1, field398.field1365[0], 1);
						}

						field51 = field490;
						field52 = field491;
						field54 = 2;
						field53 = 0;
						field328.method338(67);
						field328.method374(field434);
						field328.method372(field432);
						field328.method340(field257 + var3);
						field328.method372(field256 + var2);
						field328.method340(field433);
						field328.method373(var5);
					}

					if (var4 == 677 && method128(var2, var3, var5)) {
						field328.method338(190);
						field328.method374(var5 >> 14 & 0x7FFF);
						field328.method372(field432);
						field328.method373(field433);
						field328.method373(field256 + var2);
						field328.method373(field434);
						field328.method372(field257 + var3);
					}

					if (var4 == 185) {
						boolean var56 = method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 0, field398.field1365[0], 0);
						if (!var56) {
							method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 1, field398.field1365[0], 1);
						}

						field51 = field490;
						field52 = field491;
						field54 = 2;
						field53 = 0;
						field328.method338(45);
						field328.method373(field257 + var3);
						field328.method373(var5);
						field328.method373(field256 + var2);
					}

					if (var4 == 249) {
						ZLSEKGJR var58 = field305[var5];
						if (var58 != null) {
							method6(0, var58.field1366[0], field398.field1366[0], false, 0, 0, 2, var58.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(138);
							field328.method374(var5);
						}
					}

					if (var4 == 124 || var4 == 475) {
						String var59 = field146[arg0];
						int var60 = var59.indexOf("@whi@");
						if (var60 != -1) {
							var59 = var59.substring(var60 + 5).trim();
							String var61 = UJPWWGLO.method508(UJPWWGLO.method505(UJPWWGLO.method504(var59)));
							boolean var62 = false;
							for (int var63 = 0; var63 < field350; var63++) {
								HDYGEGXY var64 = field349[field351[var63]];
								if (var64 != null && var64.field734 != null && var64.field734.equalsIgnoreCase(var61)) {
									method6(0, var64.field1366[0], field398.field1366[0], false, 0, 0, 2, var64.field1365[0], 1, field398.field1365[0], 1);

									if (var4 == 124) {
										field328.method338(21);
										field328.method372(field351[var63]);
									}

									if (var4 == 475) {
										field328.method338(129);
										field328.method372(field351[var63]);
									}

									var62 = true;
									break;
								}
							}

							if (!var62) {
								method106("", "Unable to find " + var61, 0);
							}
						}
					}

					if (var4 == 318) {
						HDYGEGXY var65 = field349[var5];
						if (var65 != null) {
							method6(0, var65.field1366[0], field398.field1366[0], false, 0, 0, 2, var65.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(199);
							field328.method340(field151);
							field328.method372(var5);
						}
					}

					if (var4 == 265) {
						HDYGEGXY var66 = field349[var5];
						if (var66 != null) {
							method6(0, var66.field1366[0], field398.field1366[0], false, 0, 0, 2, var66.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(31);
							field328.method374(field433);
							field328.method374(var5);
							field328.method374(field434);
							field328.method340(field432);
						}
					}

					if (var4 == 107) {
						method121(field134);
						field134 = -1;
						field232 = true;
					}

					if (var4 == 948) {
						boolean var67 = method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 0, field398.field1365[0], 0);
						if (!var67) {
							method6(0, var3, field398.field1366[0], false, 0, 0, 2, var2, 1, field398.field1365[0], 1);
						}

						field51 = field490;
						field52 = field491;
						field54 = 2;
						field53 = 0;

						if ((field257 & 0x3) == 0) {
							field130++;
						}

						if (field130 >= 72) {
							field328.method338(245);
							field328.method343(0);
							field130 = 0;
						}

						field328.method338(79);
						field328.method372(var5);
						field328.method340(field257 + var3);
						field328.method374(field256 + var2);
					}

					if (var4 == 460) {
						field328.method338(179);
						field328.method340(var2);
						field328.method373(var3);
						field328.method374(var5);
						field328.method373(field151);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 458) {
						ZLSEKGJR var69 = field305[var5];
						if (var69 != null) {
							method6(0, var69.field1366[0], field398.field1366[0], false, 0, 0, 2, var69.field1365[0], 1, field398.field1365[0], 1);
							field51 = field490;
							field52 = field491;
							field54 = 2;
							field53 = 0;
							field328.method338(153);
							field328.method340(var5);
						}
					}

					if (var4 == 133) {
						field328.method338(66);
						field328.method373(var2);
						field328.method340(var5);
						field328.method340(var3);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					if (var4 == 345) {
						String var70 = field146[arg0];
						int var71 = var70.indexOf("@whi@");
						if (var71 != -1) {
							if (field278 == -1) {
								method110();
								field233 = var70.substring(var71 + 5).trim();
								field269 = false;
								field427 = field278 = HZINZKXF.field797;
							} else {
								method106("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}

					if (var4 == 673) {
						method128(var2, var3, var5);
						field328.method338(120);
						field328.method372(field257 + var3);
						field328.method374(var5 >> 14 & 0x7FFF);
						field328.method373(field256 + var2);
					}

					if (var4 == 513) {
						field328.method338(141);
						field328.method373(var5);
						field328.method373(var3);
						field328.method374(var2);
						field71 = 0;
						field72 = var3;
						field73 = var2;
						field74 = 2;
						if (HZINZKXF.method269(var3).field824 == field278) {
							field74 = 1;
						}

						if (HZINZKXF.method269(var3).field824 == field303) {
							field74 = 3;
						}
					}

					field431 = 0;
					field150 = 0;
					field118 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method56() {
		byte[] var1 = field254.method277("title.dat", null);
		ZWUMKFUX var2 = new ZWUMKFUX(var1, this);
		field140.method535();
		var2.method592(0, 0);
		field141.method535();
		var2.method592(-637, 0);
		field137.method535();
		var2.method592(-128, 0);
		field138.method535();
		var2.method592(-202, -371);
		field139.method535();
		var2.method592(-202, -171);
		field142.method535();
		var2.method592(0, -265);
		field143.method535();
		var2.method592(-562, -265);
		field144.method535();
		var2.method592(-128, -171);
		field145.method535();
		var2.method592(-562, -171);
		int[] var3 = new int[var2.field1506];
		for (int var4 = 0; var4 < var2.field1507; var4++) {
			for (int var5 = 0; var5 < var2.field1506; var5++) {
				var3[var5] = var2.field1505[var2.field1506 * var4 + var2.field1506 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1506; var6++) {
				var2.field1505[var2.field1506 * var4 + var6] = var3[var6];
			}
		}

		field140.method535();
		var2.method592(382, 0);
		field141.method535();
		var2.method592(-255, 0);
		field137.method535();
		var2.method592(254, 0);
		field138.method535();
		var2.method592(180, -371);
		field139.method535();
		var2.method592(180, -171);
		field142.method535();
		var2.method592(382, -265);
		field143.method535();
		var2.method592(-180, -265);
		field144.method535();
		var2.method592(254, -171);
		field145.method535();
		var2.method592(-180, -171);
		ZWUMKFUX var7 = new ZWUMKFUX(field254, "logo", 0);
		field137.method535();
		var7.method594(382 - var7.field1506 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.f(B)V")
	public final void method57() {
		if (field167 == null) {
			method78();
			field476 = null;
			field137 = null;
			field138 = null;
			field139 = null;
			field140 = null;
			field141 = null;
			field142 = null;
			field143 = null;
			field144 = null;
			field145 = null;
			field167 = new VOQVBLJN(96, 479, method92());
			field165 = new VOQVBLJN(156, 172, method92());
			NQLGXPRA.method391();
			field345.method442(0, 0);
			field164 = new VOQVBLJN(261, 190, method92());
			field166 = new VOQVBLJN(334, 512, method92());
			NQLGXPRA.method391();
			field330 = new VOQVBLJN(50, 496, method92());
			field331 = new VOQVBLJN(37, 269, method92());
			field332 = new VOQVBLJN(45, 249, method92());
			field224 = true;
			field166.method535();
			YFTZFAFG.field1440 = field49;
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method58() {
		if (field125 > 0) {
			method144();
		} else {
			method145("Connection lost", "Please wait - attempting to reestablish");
			field216 = 0;
			field184 = 0;
			YVLAOVKQ var1 = field127;
			field366 = false;
			field288 = 0;
			method138(field119, field120, true);

			if (!field366) {
				method144();
			}

			try {
				var1.method578();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ILHZINZKXF;)Z")
	public final boolean method59(HZINZKXF arg0) {
		int var2 = arg0.field856;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field146[field466] = "Remove @whi@" + arg0.field798;
				field208[field466] = 730;
				field466++;
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

		field146[field466] = "Remove @whi@" + field94[var2];
		field208[field466] = 37;
		field466++;
		field146[field466] = "Message @whi@" + field94[var2];
		field208[field466] = 503;
		field466++;
		return true;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method60() {
		field167.method535();
		YFTZFAFG.field1440 = field47;
		field346.method442(0, 0);

		if (field320) {
			field384.method212(0, 239, field178, 40);
			field384.method212(128, 239, field414 + "*", 60);
		} else if (field168 == 1) {
			field384.method212(0, 239, "Enter amount:", 40);
			field384.method212(128, 239, field82 + "*", 60);
		} else if (field168 == 2) {
			field384.method212(0, 239, "Enter name:", 40);
			field384.method212(128, 239, field82 + "*", 60);
		} else if (field390 != null) {
			field384.method212(0, 239, field390, 40);
			field384.method212(128, 239, "Click to continue", 60);
		} else if (field303 != -1) {
			method13(0, 0, HZINZKXF.method269(field303), 0);
		} else if (field134 == -1) {
			GCURPWTI var1 = field383;
			int var2 = 0;
			NQLGXPRA.method390(0, 77, 0, 463);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field43[var3] != null) {
					int var4 = field41[var3];
					int var5 = field237 + 70 - var2 * 14;
					String var6 = field42[var3];
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
							var1.method216(field43[var3], 4, var5, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field198 == 0 || field198 == 1 && method114(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field367[0].method442(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field367[1].method442(var8, var5 - 12);
								var8 += 14;
							}

							var1.method216(var6 + ":", var8, var5, 0);
							var8 += var1.method214(var6) + 8;
							var1.method216(field43[var3], var8, var5, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field276 == 0 && (var4 == 7 || field172 == 0 || field172 == 1 && method114(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method216("From", var9, var5, 0);
							int var11 = var9 + var1.method214("From ");
							if (var7 == 1) {
								field367[0].method442(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field367[1].method442(var11, var5 - 12);
								var11 += 14;
							}

							var1.method216(var6 + ":", var11, var5, 0);
							var11 += var1.method214(var6) + 8;
							var1.method216(field43[var3], var11, var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field156 == 0 || field156 == 1 && method114(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(var6 + " " + field43[var3], 4, var5, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field276 == 0 && field172 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(field43[var3], 4, var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field276 == 0 && field172 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method216("To " + var6 + ":", 4, var5, 0);
							var1.method216(field43[var3], var1.method214("To " + var6) + 12, var5, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field156 == 0 || field156 == 1 && method114(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method216(var6 + " " + field43[var3], 4, var5, 0x7E3200);
						}

						var2++;
					}
				}
			}

			NQLGXPRA.method389();
			field171 = var2 * 14 + 7;
			if (field171 < 78) {
				field171 = 78;
			}

			method34(field171, 463, 0, field171 - field237 - 77, 77);
			String var10;
			if (field398 == null || field398.field734 == null) {
				var10 = UJPWWGLO.method508(field119);
			} else {
				var10 = field398.field734;
			}

			var1.method216(var10 + ":", 4, 90, 0);
			var1.method216(field333 + "*", var1.method214(var10 + ": ") + 6, 90, 255);
			NQLGXPRA.method396(77, 0, 0, 479);
		} else {
			method13(0, 0, HZINZKXF.method269(field134), 0);
		}

		if (field132 && field99 == 2) {
			method108();
		}

		field167.method536(17, 357, field475);
		field166.method535();
		YFTZFAFG.field1440 = field49;
	}

	@ObfuscatedName("client.a(IIIIIILHZINZKXF;II)V")
	public final void method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, HZINZKXF arg6, int arg7) {
		if (field357) {
			field249 = 32;
		} else {
			field249 = 0;
		}

		field357 = false;
		if (arg0 >= arg3 && arg0 < arg3 + 16 && arg4 >= arg5 && arg4 < arg5 + 16) {
			arg6.field800 -= field84 * 4;

			if (arg1 == 1) {
				field118 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field232 = true;
			}
		} else if (arg0 >= arg3 && arg0 < arg3 + 16 && arg4 >= arg2 + arg5 - 16 && arg4 < arg2 + arg5) {
			arg6.field800 += field84 * 4;

			if (arg1 == 1) {
				field118 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field232 = true;
			}
		} else if (arg0 >= arg3 - field249 && arg0 < arg3 + field249 + 16 && arg4 >= arg5 + 16 && arg4 < arg2 + arg5 - 16 && field84 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg5 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg6.field800 = (arg7 - arg2) * var10 / var11;

			if (arg1 == 1) {
				field118 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field232 = true;
			}

			field357 = true;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method62() {
		for (int var1 = 0; var1 < field306; var1++) {
			int var2 = field307[var1];
			ZLSEKGJR var3 = field305[var2];
			if (var3 != null) {
				method63(var3.field1475.field656, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILXETERYIW;B)V")
	public final void method63(int arg0, XETERYIW arg1) {
		if (arg1.field1405 < 128 || arg1.field1406 < 128 || arg1.field1405 >= 13184 || arg1.field1406 >= 13184) {
			arg1.field1391 = -1;
			arg1.field1359 = -1;
			arg1.field1380 = 0;
			arg1.field1381 = 0;
			arg1.field1405 = arg1.field1365[0] * 128 + arg1.field1375 * 64;
			arg1.field1406 = arg1.field1366[0] * 128 + arg1.field1375 * 64;
			arg1.method549();
		}

		if (field398 == arg1 && (arg1.field1405 < 1536 || arg1.field1406 < 1536 || arg1.field1405 >= 11776 || arg1.field1406 >= 11776)) {
			arg1.field1391 = -1;
			arg1.field1359 = -1;
			arg1.field1380 = 0;
			arg1.field1381 = 0;
			arg1.field1405 = arg1.field1365[0] * 128 + arg1.field1375 * 64;
			arg1.field1406 = arg1.field1366[0] * 128 + arg1.field1375 * 64;
			arg1.method549();
		}

		if (arg1.field1380 > field453) {
			method64(arg1);
		} else if (arg1.field1381 >= field453) {
			method65(arg1);
		} else {
			method66(arg1);
		}

		method67(arg1);
		method68(arg1);
	}

	@ObfuscatedName("client.a(ILXETERYIW;)V")
	public final void method64(XETERYIW arg0) {
		int var2 = arg0.field1380 - field453;
		int var3 = arg0.field1376 * 128 + arg0.field1375 * 64;
		int var4 = arg0.field1378 * 128 + arg0.field1375 * 64;
		arg0.field1405 += (var3 - arg0.field1405) / var2;
		arg0.field1406 += (var4 - arg0.field1406) / var2;
		arg0.field1370 = 0;

		if (arg0.field1382 == 0) {
			arg0.field1385 = 1024;
		}

		if (arg0.field1382 == 1) {
			arg0.field1385 = 1536;
		}

		if (arg0.field1382 == 2) {
			arg0.field1385 = 0;
		}

		if (arg0.field1382 == 3) {
			arg0.field1385 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLXETERYIW;)V")
	public final void method65(XETERYIW arg0) {
		if (field453 == arg0.field1381 || arg0.field1391 == -1 || arg0.field1394 != 0 || arg0.field1393 + 1 > PNPNYEVW.field1058[arg0.field1391].method427(arg0.field1392)) {
			int var2 = arg0.field1381 - arg0.field1380;
			int var3 = field453 - arg0.field1380;
			int var4 = arg0.field1376 * 128 + arg0.field1375 * 64;
			int var5 = arg0.field1378 * 128 + arg0.field1375 * 64;
			int var6 = arg0.field1377 * 128 + arg0.field1375 * 64;
			int var7 = arg0.field1379 * 128 + arg0.field1375 * 64;
			arg0.field1405 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1406 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1370 = 0;

		if (arg0.field1382 == 0) {
			arg0.field1385 = 1024;
		}

		if (arg0.field1382 == 1) {
			arg0.field1385 = 1536;
		}

		if (arg0.field1382 == 2) {
			arg0.field1385 = 0;
		}

		if (arg0.field1382 == 3) {
			arg0.field1385 = 512;
		}

		arg0.field1407 = arg0.field1385;
	}

	@ObfuscatedName("client.a(LXETERYIW;B)V")
	public final void method66(XETERYIW arg0) {
		arg0.field1356 = arg0.field1403;
		if (arg0.field1383 == 0) {
			arg0.field1370 = 0;
		} else {
			if (arg0.field1391 != -1 && arg0.field1394 == 0) {
				PNPNYEVW var2 = PNPNYEVW.field1058[arg0.field1391];
				if (arg0.field1368 > 0 && var2.field1070 == 0) {
					arg0.field1370++;
					return;
				}

				if (arg0.field1368 <= 0 && var2.field1071 == 0) {
					arg0.field1370++;
					return;
				}
			}

			int var3 = arg0.field1405;
			int var4 = arg0.field1406;
			int var5 = arg0.field1365[arg0.field1383 - 1] * 128 + arg0.field1375 * 64;
			int var6 = arg0.field1366[arg0.field1383 - 1] * 128 + arg0.field1375 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1385 = 1280;
					} else if (var4 > var6) {
						arg0.field1385 = 1792;
					} else {
						arg0.field1385 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1385 = 768;
					} else if (var4 > var6) {
						arg0.field1385 = 256;
					} else {
						arg0.field1385 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1385 = 1024;
				} else {
					arg0.field1385 = 0;
				}

				int var7 = arg0.field1385 - arg0.field1407 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1400;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1399;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1402;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1401;
				}

				if (var8 == -1) {
					var8 = arg0.field1399;
				}

				arg0.field1356 = var8;
				int var9 = 4;
				if (arg0.field1407 != arg0.field1385 && arg0.field1355 == -1 && arg0.field1408 != 0) {
					var9 = 2;
				}

				if (arg0.field1383 > 2) {
					var9 = 6;
				}

				if (arg0.field1383 > 3) {
					var9 = 8;
				}

				if (arg0.field1370 > 0 && arg0.field1383 > 1) {
					var9 = 8;
					arg0.field1370--;
				}

				if (arg0.field1369[arg0.field1383 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1399 == arg0.field1356 && arg0.field1386 != -1) {
					arg0.field1356 = arg0.field1386;
				}

				if (var3 < var5) {
					arg0.field1405 += var9;
					if (arg0.field1405 > var5) {
						arg0.field1405 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1405 -= var9;
					if (arg0.field1405 < var5) {
						arg0.field1405 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1406 += var9;
					if (arg0.field1406 > var6) {
						arg0.field1406 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1406 -= var9;
					if (arg0.field1406 < var6) {
						arg0.field1406 = var6;
					}
				}

				if (arg0.field1405 == var5 && arg0.field1406 == var6) {
					arg0.field1383--;

					if (arg0.field1368 > 0) {
						arg0.field1368--;
						return;
					}
				}
			} else {
				arg0.field1405 = var5;
				arg0.field1406 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(ZLXETERYIW;)V")
	public final void method67(XETERYIW arg0) {
		if (arg0.field1408 != 0) {
			if (arg0.field1355 != -1 && arg0.field1355 < 32768) {
				ZLSEKGJR var2 = field305[arg0.field1355];
				if (var2 != null) {
					int var3 = arg0.field1405 - var2.field1405;
					int var4 = arg0.field1406 - var2.field1406;
					if (var3 != 0 || var4 != 0) {
						arg0.field1385 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1355 >= 32768) {
				int var5 = arg0.field1355 - 32768;
				if (field421 == var5) {
					var5 = field348;
				}

				HDYGEGXY var6 = field349[var5];
				if (var6 != null) {
					int var7 = arg0.field1405 - var6.field1405;
					int var8 = arg0.field1406 - var6.field1406;
					if (var7 != 0 || var8 != 0) {
						arg0.field1385 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1373 != 0 || arg0.field1374 != 0) && (arg0.field1383 == 0 || arg0.field1370 > 0)) {
				int var9 = arg0.field1405 - (arg0.field1373 - field256 - field256) * 64;
				int var10 = arg0.field1406 - (arg0.field1374 - field257 - field257) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1385 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1373 = 0;
				arg0.field1374 = 0;
			}

			int var11 = arg0.field1385 - arg0.field1407 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1408 || var11 > 2048 - arg0.field1408) {
					arg0.field1407 = arg0.field1385;
				} else if (var11 > 1024) {
					arg0.field1407 -= arg0.field1408;
				} else {
					arg0.field1407 += arg0.field1408;
				}

				arg0.field1407 &= 0x7FF;
				if (arg0.field1403 == arg0.field1356 && arg0.field1407 != arg0.field1385) {
					if (arg0.field1404 != -1) {
						arg0.field1356 = arg0.field1404;
						return;
					}

					arg0.field1356 = arg0.field1399;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLXETERYIW;)V")
	public final void method68(XETERYIW arg0) {
		arg0.field1384 = false;

		if (arg0.field1356 != -1) {
			PNPNYEVW var2 = PNPNYEVW.field1058[arg0.field1356];
			arg0.field1358++;
			if (arg0.field1357 < var2.field1059 && arg0.field1358 > var2.method427(arg0.field1357)) {
				arg0.field1358 = 0;
				arg0.field1357++;
			}

			if (arg0.field1357 >= var2.field1059) {
				arg0.field1358 = 0;
				arg0.field1357 = 0;
			}
		}

		if (arg0.field1359 != -1 && field453 >= arg0.field1362) {
			if (arg0.field1360 < 0) {
				arg0.field1360 = 0;
			}

			PNPNYEVW var3 = FXNZCBPL.field620[arg0.field1359].field624;
			arg0.field1361++;
			while (arg0.field1360 < var3.field1059 && arg0.field1361 > var3.method427(arg0.field1360)) {
				arg0.field1361 -= var3.method427(arg0.field1360);
				arg0.field1360++;
			}

			if (arg0.field1360 >= var3.field1059 && (arg0.field1360 < 0 || arg0.field1360 >= var3.field1059)) {
				arg0.field1359 = -1;
			}
		}

		if (arg0.field1391 != -1 && arg0.field1394 <= 1) {
			PNPNYEVW var4 = PNPNYEVW.field1058[arg0.field1391];
			if (var4.field1070 == 1 && arg0.field1368 > 0 && arg0.field1380 <= field453 && arg0.field1381 < field453) {
				arg0.field1394 = 1;
				return;
			}
		}

		if (arg0.field1391 != -1 && arg0.field1394 == 0) {
			PNPNYEVW var5 = PNPNYEVW.field1058[arg0.field1391];
			arg0.field1393++;
			while (arg0.field1392 < var5.field1059 && arg0.field1393 > var5.method427(arg0.field1392)) {
				arg0.field1393 -= var5.method427(arg0.field1392);
				arg0.field1392++;
			}

			if (arg0.field1392 >= var5.field1059) {
				arg0.field1392 -= var5.field1063;
				arg0.field1395++;
				if (arg0.field1395 >= var5.field1069) {
					arg0.field1391 = -1;
				}

				if (arg0.field1392 < 0 || arg0.field1392 >= var5.field1059) {
					arg0.field1391 = -1;
				}
			}

			arg0.field1384 = var5.field1065;
		}

		if (arg0.field1394 > 0) {
			arg0.field1394--;
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method69() {
		if (field173 == -1 || field239 != 2 && field476 == null) {
			if (field224) {
				method57();
				field224 = false;
				field454.method536(0, 4, field475);
				field455.method536(0, 357, field475);
				field456.method536(722, 4, field475);
				field457.method536(743, 205, field475);
				field458.method536(0, 0, field475);
				field459.method536(516, 4, field475);
				field460.method536(516, 205, field475);
				field461.method536(496, 357, field475);
				field462.method536(0, 338, field475);
				field118 = true;
				field232 = true;
				field241 = true;
				field413 = true;

				if (field239 != 2) {
					field166.method536(4, 4, field475);
					field165.method536(550, 4, field475);
				}
			}

			if (field239 == 2) {
				method118();
			}

			if (field132 && field99 == 1) {
				field118 = true;
			}

			if (field376 != -1) {
				boolean var3 = method123(field376, field247);
				if (var3) {
					field118 = true;
				}
			}

			if (field74 == 2) {
				field118 = true;
			}

			if (field244 == 2) {
				field118 = true;
			}

			if (field118) {
				method117();
				field118 = false;
			}

			if (field303 == -1) {
				field375.field800 = field171 - field237 - 77;

				if (field483 > 448 && field483 < 560 && field484 > 332) {
					method61(field483 - 17, -1, 77, 463, field484 - 357, 0, field375, field171);
				}

				int var4 = field171 - field375.field800 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field171 - 77) {
					var4 = field171 - 77;
				}

				if (field237 != var4) {
					field237 = var4;
					field232 = true;
				}
			}

			if (field303 != -1) {
				boolean var5 = method123(field303, field247);
				if (var5) {
					field232 = true;
				}
			}

			if (field74 == 3) {
				field232 = true;
			}

			if (field244 == 3) {
				field232 = true;
			}

			if (field390 != null) {
				field232 = true;
			}

			if (field132 && field99 == 2) {
				field232 = true;
			}

			if (field232) {
				method60();
				field232 = false;
			}

			if (field239 == 2) {
				method132();
				field165.method536(550, 4, field475);
			}

			if (field327 != -1) {
				field241 = true;
			}

			if (field241) {
				if (field327 != -1 && field327 == field189) {
					field327 = -1;
					field328.method338(121);
					field328.method339(field189);
				}

				field241 = false;
				field332.method535();
				field302.method442(0, 0);

				if (field376 == -1) {
					if (field222[field189] != -1) {
						if (field189 == 0) {
							field370.method442(22, 10);
						}

						if (field189 == 1) {
							field371.method442(54, 8);
						}

						if (field189 == 2) {
							field371.method442(82, 8);
						}

						if (field189 == 3) {
							field372.method442(110, 8);
						}

						if (field189 == 4) {
							field374.method442(153, 8);
						}

						if (field189 == 5) {
							field374.method442(181, 8);
						}

						if (field189 == 6) {
							field373.method442(209, 9);
						}
					}

					if (field222[0] != -1 && (field327 != 0 || field453 % 20 < 10)) {
						field38[0].method442(29, 13);
					}

					if (field222[1] != -1 && (field327 != 1 || field453 % 20 < 10)) {
						field38[1].method442(53, 11);
					}

					if (field222[2] != -1 && (field327 != 2 || field453 % 20 < 10)) {
						field38[2].method442(82, 11);
					}

					if (field222[3] != -1 && (field327 != 3 || field453 % 20 < 10)) {
						field38[3].method442(115, 12);
					}

					if (field222[4] != -1 && (field327 != 4 || field453 % 20 < 10)) {
						field38[4].method442(153, 13);
					}

					if (field222[5] != -1 && (field327 != 5 || field453 % 20 < 10)) {
						field38[5].method442(180, 11);
					}

					if (field222[6] != -1 && (field327 != 6 || field453 % 20 < 10)) {
						field38[6].method442(208, 13);
					}
				}

				field332.method536(516, 160, field475);
				field220++;
				if (field220 > 68) {
					field220 = 0;
					field328.method338(102);
				}

				field331.method535();
				field301.method442(0, 0);

				if (field376 == -1) {
					if (field222[field189] != -1) {
						if (field189 == 7) {
							field179.method442(42, 0);
						}

						if (field189 == 8) {
							field180.method442(74, 0);
						}

						if (field189 == 9) {
							field180.method442(102, 0);
						}

						if (field189 == 10) {
							field181.method442(130, 1);
						}

						if (field189 == 11) {
							field183.method442(173, 0);
						}

						if (field189 == 12) {
							field183.method442(201, 0);
						}

						if (field189 == 13) {
							field182.method442(229, 0);
						}
					}

					if (field222[8] != -1 && (field327 != 8 || field453 % 20 < 10)) {
						field38[7].method442(74, 2);
					}

					if (field222[9] != -1 && (field327 != 9 || field453 % 20 < 10)) {
						field38[8].method442(102, 3);
					}

					if (field222[10] != -1 && (field327 != 10 || field453 % 20 < 10)) {
						field38[9].method442(137, 4);
					}

					if (field222[11] != -1 && (field327 != 11 || field453 % 20 < 10)) {
						field38[10].method442(174, 2);
					}

					if (field222[12] != -1 && (field327 != 12 || field453 % 20 < 10)) {
						field38[11].method442(201, 2);
					}

					if (field222[13] != -1 && (field327 != 13 || field453 % 20 < 10)) {
						field38[12].method442(226, 2);
					}
				}

				field331.method536(496, 466, field475);
				field166.method535();
				YFTZFAFG.field1440 = field49;
			}

			if (field413) {
				field413 = false;
				field330.method535();
				field300.method442(0, 0);
				field383.method213(0xFFFFFF, true, 55, 28, "Public chat");

				if (field198 == 0) {
					field383.method213(0xFF00, true, 55, 41, "On");
				}

				if (field198 == 1) {
					field383.method213(0xFFFF00, true, 55, 41, "Friends");
				}

				if (field198 == 2) {
					field383.method213(0xFF0000, true, 55, 41, "Off");
				}

				if (field198 == 3) {
					field383.method213(0xFFFF, true, 55, 41, "Hide");
				}

				field383.method213(0xFFFFFF, true, 184, 28, "Private chat");

				if (field172 == 0) {
					field383.method213(0xFF00, true, 184, 41, "On");
				}

				if (field172 == 1) {
					field383.method213(0xFFFF00, true, 184, 41, "Friends");
				}

				if (field172 == 2) {
					field383.method213(0xFF0000, true, 184, 41, "Off");
				}

				field383.method213(0xFFFFFF, true, 324, 28, "Trade/compete");

				if (field156 == 0) {
					field383.method213(0xFF00, true, 324, 41, "On");
				}

				if (field156 == 1) {
					field383.method213(0xFFFF00, true, 324, 41, "Friends");
				}

				if (field156 == 2) {
					field383.method213(0xFF0000, true, 324, 41, "Off");
				}

				field383.method213(0xFFFFFF, true, 458, 33, "Report abuse");
				field330.method536(0, 453, field475);
				field166.method535();
				YFTZFAFG.field1440 = field49;
			}

			field247 = 0;
		} else {
			if (field239 == 2) {
				method123(field173, field247);

				if (field419 != -1) {
					method123(field419, field247);
				}

				field247 = 0;
				method40();
				field476.method535();
				YFTZFAFG.field1440 = field50;
				NQLGXPRA.method391();
				field224 = true;
				HZINZKXF var1 = HZINZKXF.method269(field173);
				if (var1.field819 == 512 && var1.field793 == 334 && var1.field792 == 0) {
					var1.field819 = 765;
					var1.field793 = 503;
				}

				method13(0, 0, var1, 0);

				if (field419 != -1) {
					HZINZKXF var2 = HZINZKXF.method269(field419);
					if (var2.field819 == 512 && var2.field793 == 334 && var2.field792 == 0) {
						var2.field819 = 765;
						var2.field793 = 503;
					}

					method13(0, 0, var2, 0);
				}

				if (field132) {
					method108();
				} else {
					method126();
					method7();
				}
			}

			field476.method536(0, 0, field475);
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method70() {
		if (field315 == 0) {
			int var1 = field473 / 2 - 80;
			int var2 = field474 / 2 + 20;
			var2 += 20;
			if (field489 == 1 && field490 >= var1 - 75 && field490 <= var1 + 75 && field491 >= var2 - 20 && field491 <= var2 + 20) {
				field315 = 3;
				field96 = 0;
			}

			int var3 = field473 / 2 + 80;
			if (field489 == 1 && field490 >= var3 - 75 && field490 <= var3 + 75 && field491 >= var2 - 20 && field491 <= var2 + 20) {
				field325 = "";
				field326 = "Enter your username & password.";
				field315 = 2;
				field96 = 0;
			}
		} else if (field315 == 2) {
			int var4 = field474 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field489 == 1 && field491 >= var4 - 15 && field491 < var4) {
				field96 = 0;
			}

			var4 += 15;
			if (field489 == 1 && field491 >= var4 - 15 && field491 < var4) {
				field96 = 1;
			}

			var4 += 15;
			int var5 = field473 / 2 - 80;
			int var6 = field474 / 2 + 50;
			var6 += 20;
			if (field489 == 1 && field490 >= var5 - 75 && field490 <= var5 + 75 && field491 >= var6 - 20 && field491 <= var6 + 20) {
				field288 = 0;
				method138(field119, field120, false);

				if (field366) {
					return;
				}
			}

			int var7 = field473 / 2 + 80;
			if (field489 == 1 && field490 >= var7 - 75 && field490 <= var7 + 75 && field491 >= var6 - 20 && field491 <= var6 + 20) {
				field315 = 0;
				field119 = "";
				field120 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method155();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field217.length(); var10++) {
					if (var8 == field217.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field96 == 0) {
					if (var8 == 8 && field119.length() > 0) {
						field119 = field119.substring(0, field119.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field96 = 1;
					}

					if (var9) {
						field119 = field119 + (char) var8;
					}

					if (field119.length() > 12) {
						field119 = field119.substring(0, 12);
					}
				} else if (field96 == 1) {
					if (var8 == 8 && field120.length() > 0) {
						field120 = field120.substring(0, field120.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field96 = 0;
					}

					if (var9) {
						field120 = field120 + (char) var8;
					}

					if (field120.length() > 20) {
						field120 = field120.substring(0, 20);
					}
				}
			}
		} else if (field315 == 3) {
			int var11 = field473 / 2;
			int var12 = field474 / 2 + 50;
			var12 += 20;
			if (field489 == 1 && field490 >= var11 - 75 && field490 <= var11 + 75 && field491 >= var12 - 20 && field491 <= var12 + 20) {
				field315 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method71(boolean arg0) {
		method81();
		field139.method535();
		field386.method442(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field315 == 0) {
			int var4 = var3 / 2 + 80;
			field382.method213(0x75A9A9, true, var2 / 2, var4, field36.field1334);
			int var5 = var3 / 2 - 20;
			field384.method213(0xFFFF00, true, var2 / 2, var5, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field387.method442(var6 - 73, var7 - 20);
			field384.method213(0xFFFFFF, true, var6, var7 + 5, "New User");
			int var8 = var2 / 2 + 80;
			field387.method442(var8 - 73, var7 - 20);
			field384.method213(0xFFFFFF, true, var8, var7 + 5, "Existing User");
		}

		if (field315 == 2) {
			int var9 = var3 / 2 - 40;
			if (field325.length() > 0) {
				field384.method213(0xFFFF00, true, var2 / 2, var9 - 15, field325);
				field384.method213(0xFFFF00, true, var2 / 2, var9, field326);
				var9 += 30;
			} else {
				field384.method213(0xFFFF00, true, var2 / 2, var9 - 7, field326);
				var9 += 30;
			}

			field384.method220(var9, "Username: " + field119 + (field96 == 0 & field453 % 40 < 20 ? "@yel@|" : ""), true, 0xFFFFFF, var2 / 2 - 90);
			var9 += 15;
			field384.method220(var9, "Password: " + UJPWWGLO.method509(field120) + (field96 == 1 & field453 % 40 < 20 ? "@yel@|" : ""), true, 0xFFFFFF, var2 / 2 - 88);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field387.method442(var10 - 73, var11 - 20);
				field384.method213(0xFFFFFF, true, var10, var11 + 5, "Login");
				int var12 = var2 / 2 + 80;
				field387.method442(var12 - 73, var11 - 20);
				field384.method213(0xFFFFFF, true, var12, var11 + 5, "Cancel");
			}
		}

		if (field315 == 3) {
			field384.method213(0xFFFF00, true, var2 / 2, var3 / 2 - 60, "Create a free account");
			int var13 = var3 / 2 - 35;
			field384.method213(0xFFFFFF, true, var2 / 2, var13, "To create a new account you need to");
			var13 += 15;
			field384.method213(0xFFFFFF, true, var2 / 2, var13, "go back to the main RuneScape webpage");
			var13 += 15;
			field384.method213(0xFFFFFF, true, var2 / 2, var13, "and choose the red 'create account'");
			var13 += 15;
			field384.method213(0xFFFFFF, true, var2 / 2, var13, "button at the top right of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field387.method442(var14 - 73, var15 - 20);
			field384.method213(0xFFFFFF, true, var14, var15 + 5, "Cancel");
		}

		field139.method536(202, 171, field475);

		if (field224) {
			field224 = false;
			field137.method536(128, 0, field475);
			field138.method536(202, 371, field475);
			field142.method536(0, 265, field475);
			field143.method536(562, 265, field475);
			field144.method536(128, 171, field475);
			field145.method536(562, 171, field475);
		}
	}

	@ObfuscatedName("client.a(ILNHEPCMLW;Z)V")
	public final void method72(int arg0, NHEPCMLW arg1) {
		field87 = 0;
		field352 = 0;
		method15(arg1, arg0);
		method79(arg1, arg0);
		method150(arg0, arg1);
		method21(arg0, arg1);

		for (int var3 = 0; var3 < field87; var3++) {
			int var4 = field88[var3];
			if (field453 != field349[var4].field1367) {
				field349[var4] = null;
			}
		}

		if (arg1.field965 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field965 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field350; var5++) {
			if (field349[field351[var5]] == null) {
				signlink.reporterror(field119 + " null entry in pl list - pos:" + var5 + " size:" + field350);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIILjava/lang/String;Ljava/lang/String;I)LINOFEYKQ;")
	public final INOFEYKQ method73(int arg0, int arg1, String arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field85[0] != null) {
				var6 = field85[0].method550(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field190.reset();
			field190.update(var6);
			int var8 = (int) field190.getValue();
			if (arg0 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new INOFEYKQ(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method32(arg4, "Requesting " + arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method86(arg3 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				NHEPCMLW var16 = new NHEPCMLW(var15);
				var16.field965 = 3;
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
						method32(arg4, "Loading " + arg2 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field85[0] != null) {
						field85[0].method551(var6.length, var6, arg1);
					}
				} catch (Exception var28) {
					field85[0] = null;
				}

				if (var6 != null) {
					field190.reset();
					field190.update(var6);
					int var23 = (int) field190.getValue();
					if (arg0 != var23) {
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
						method32(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						method32(arg4, var11 + " - Retrying in " + var25);
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

				field215 = !field215;
			}
		}

		return new INOFEYKQ(var6);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method74(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method74(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 339);

			if (arg0.length == 5) {
				field415 = Integer.parseInt(arg0[0]);
				field416 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method41();
				} else if (arg0[2].equals("highmem")) {
					method125();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field417 = false;
				} else if (arg0[3].equals("members")) {
					field417 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method151(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method75() {
		if (field239 == 2) {
			for (YCAXTCCQ var1 = (YCAXTCCQ) field359.method414(); var1 != null; var1 = (YCAXTCCQ) field359.method416()) {
				if (var1.field1425 > 0) {
					var1.field1425--;
				}

				if (var1.field1425 != 0) {
					if (var1.field1424 > 0) {
						var1.field1424--;
					}

					if (var1.field1424 == 0 && var1.field1422 >= 1 && var1.field1423 >= 1 && var1.field1422 <= 102 && var1.field1423 <= 102 && (var1.field1426 < 0 || GSYZIGPZ.method238(var1.field1428, var1.field1426))) {
						method26(var1.field1420, var1.field1422, var1.field1426, var1.field1428, var1.field1423, var1.field1421, var1.field1427);
						var1.field1424 = -1;

						if (var1.field1426 == var1.field1417 && var1.field1417 == -1) {
							var1.method336();
						} else if (var1.field1426 == var1.field1417 && var1.field1427 == var1.field1418 && var1.field1428 == var1.field1419) {
							var1.method336();
						}
					}
				} else if (var1.field1417 < 0 || GSYZIGPZ.method238(var1.field1419, var1.field1417)) {
					method26(var1.field1420, var1.field1422, var1.field1417, var1.field1419, var1.field1423, var1.field1421, var1.field1418);
					var1.method336();
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field478 != null) {
				return new URL("http://127.0.0.1:" + (field416 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.t(I)V")
	public final void method76() {
		field70 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field380) {
				field420++;
				method130();
				method130();
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

		field70 = false;
	}

	@ObfuscatedName("client.b(LNHEPCMLW;IB)V")
	public final void method77(NHEPCMLW arg0, int arg1) {
		for (int var3 = 0; var3 < field352; var3++) {
			int var4 = field353[var3];
			ZLSEKGJR var5 = field305[var4];
			int var6 = arg0.method349();
			if ((var6 & 0x10) != 0) {
				int var7 = arg0.method351();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg0.method369();
				if (var5.field1391 == var7 && var7 != -1) {
					int var9 = PNPNYEVW.field1058[var7].field1072;
					if (var9 == 1) {
						var5.field1392 = 0;
						var5.field1393 = 0;
						var5.field1394 = var8;
						var5.field1395 = 0;
					}

					if (var9 == 2) {
						var5.field1395 = 0;
					}
				} else if (var7 == -1 || var5.field1391 == -1 || PNPNYEVW.field1058[var7].field1066 >= PNPNYEVW.field1058[var5.field1391].field1066) {
					var5.field1391 = var7;
					var5.field1392 = 0;
					var5.field1393 = 0;
					var5.field1394 = var8;
					var5.field1395 = 0;
					var5.field1368 = var5.field1383;
				}
			}

			if ((var6 & 0x4) != 0) {
				int var10 = arg0.method369();
				int var11 = arg0.method367();
				var5.method546(var10, field453, var11);
				var5.field1388 = field453 + 300;
				var5.field1389 = arg0.method368();
				var5.field1390 = arg0.method367();
			}

			if ((var6 & 0x80) != 0) {
				int var12 = arg0.method368();
				int var13 = arg0.method367();
				var5.method546(var12, field453, var13);
				var5.field1388 = field453 + 300;
				var5.field1389 = arg0.method369();
				var5.field1390 = arg0.method349();
			}

			if ((var6 & 0x40) != 0) {
				var5.field1371 = arg0.method356();
				var5.field1364 = 100;
			}

			if ((var6 & 0x2) != 0) {
				var5.field1355 = arg0.method351();
				if (var5.field1355 == 0xFFFF) {
					var5.field1355 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field1373 = arg0.method376();
				var5.field1374 = arg0.method375();
			}

			if ((var6 & 0x1) != 0) {
				var5.field1475 = GALAVQEJ.method203(arg0.method377());
				var5.field1375 = var5.field1475.field656;
				var5.field1408 = var5.field1475.field649;
				var5.field1399 = var5.field1475.field636;
				var5.field1400 = var5.field1475.field659;
				var5.field1401 = var5.field1475.field635;
				var5.field1402 = var5.field1475.field646;
				var5.field1403 = var5.field1475.field666;
			}

			if ((var6 & 0x20) != 0) {
				var5.field1359 = arg0.method376();
				int var14 = arg0.method382();
				var5.field1363 = var14 >> 16;
				var5.field1362 = (var14 & 0xFFFF) + field453;
				var5.field1360 = 0;
				var5.field1361 = 0;

				if (var5.field1362 > field453) {
					var5.field1360 = -1;
				}

				if (var5.field1359 == 0xFFFF) {
					var5.field1359 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method78() {
		field380 = false;
		while (field70) {
			field380 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field386 = null;
		field387 = null;
		field298 = null;
		field441 = null;
		field442 = null;
		field443 = null;
		field444 = null;
		field210 = null;
		field211 = null;
		field196 = null;
		field197 = null;
		field63 = null;
		field64 = null;
	}

	@ObfuscatedName("client.a(ZLNHEPCMLW;I)V")
	public final void method79(NHEPCMLW arg0, int arg1) {
		int var3 = arg0.method360(8);
		if (var3 < field350) {
			for (int var4 = var3; var4 < field350; var4++) {
				field88[field87++] = field351[var4];
			}
		}

		if (var3 > field350) {
			signlink.reporterror(field119 + " Too many players");
			throw new RuntimeException("eek");
		}

		field350 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field351[var5];
			HDYGEGXY var7 = field349[var6];
			int var8 = arg0.method360(1);
			if (var8 == 0) {
				field351[field350++] = var6;
				var7.field1367 = field453;
			} else {
				int var9 = arg0.method360(2);
				if (var9 == 0) {
					field351[field350++] = var6;
					var7.field1367 = field453;
					field353[field352++] = var6;
				} else if (var9 == 1) {
					field351[field350++] = var6;
					var7.field1367 = field453;
					int var10 = arg0.method360(3);
					var7.method548(false, var10);
					int var11 = arg0.method360(1);
					if (var11 == 1) {
						field353[field352++] = var6;
					}
				} else if (var9 == 2) {
					field351[field350++] = var6;
					var7.field1367 = field453;
					int var12 = arg0.method360(3);
					var7.method548(true, var12);
					int var13 = arg0.method360(3);
					var7.method548(true, var13);
					int var14 = arg0.method360(1);
					if (var14 == 1) {
						field353[field352++] = var6;
					}
				} else if (var9 == 3) {
					field88[field87++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method80() {
		field400 = 0;
		for (int var1 = -1; var1 < field350 + field306; var1++) {
			XETERYIW var2;
			if (var1 == -1) {
				var2 = field398;
			} else if (var1 < field350) {
				var2 = field349[field351[var1]];
			} else {
				var2 = field305[field307[var1 - field350]];
			}

			if (var2 != null && var2.method250()) {
				if (var2 instanceof ZLSEKGJR) {
					GALAVQEJ var3 = ((ZLSEKGJR) var2).field1475;
					if (var3.field658 != null) {
						var3 = var3.method206();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field350) {
					GALAVQEJ var6 = ((ZLSEKGJR) var2).field1475;
					if (var6.field664 >= 0 && var6.field664 < field98.length) {
						method89(var2, var2.field1409 + 15);

						if (field337 > -1) {
							field98[var6.field664].method594(field337 - 12, field338 - 30);
						}
					}

					if (field329 == 1 && field307[var1 - field350] == field66 && field453 % 20 < 10) {
						method89(var2, var2.field1409 + 15);

						if (field337 > -1) {
							field355[0].method594(field337 - 12, field338 - 28);
						}
					}
				} else {
					int var4 = 30;
					HDYGEGXY var5 = (HDYGEGXY) var2;
					if (var5.field732 != -1 || var5.field718 != -1) {
						method89(var2, var2.field1409 + 15);

						if (field337 > -1) {
							if (var5.field732 != -1) {
								field273[var5.field732].method594(field337 - 12, field338 - var4);
								var4 += 25;
							}

							if (var5.field718 != -1) {
								field98[var5.field718].method594(field337 - 12, field338 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field329 == 10 && field351[var1] == field97) {
						method89(var2, var2.field1409 + 15);

						if (field337 > -1) {
							field355[1].method594(field337 - 12, field338 - var4);
						}
					}
				}

				if (var2.field1371 != null && (var1 >= field350 || field198 == 0 || field198 == 3 || field198 == 1 && method114(((HDYGEGXY) var2).field734))) {
					method89(var2, var2.field1409);

					if (field337 > -1 && field400 < field401) {
						field405[field400] = field384.method215(var2.field1371) / 2;
						field404[field400] = field384.field676;
						field402[field400] = field337;
						field403[field400] = field338;
						field406[field400] = var2.field1372;
						field407[field400] = var2.field1387;
						field408[field400] = var2.field1364;
						field409[field400++] = var2.field1371;

						if (field128 == 0 && var2.field1387 >= 1 && var2.field1387 <= 3) {
							field404[field400] += 10;
							field403[field400] += 5;
						}

						if (field128 == 0 && var2.field1387 == 4) {
							field405[field400] = 60;
						}

						if (field128 == 0 && var2.field1387 == 5) {
							field404[field400] += 5;
						}
					}
				}

				if (var2.field1388 > field453) {
					method89(var2, var2.field1409 + 15);

					if (field337 > -1) {
						int var7 = var2.field1389 * 30 / var2.field1390;
						if (var7 > 30) {
							var7 = 30;
						}

						NQLGXPRA.method393(field337 - 15, 0xFF00, 5, field338 - 3, var7);
						NQLGXPRA.method393(field337 + var7 - 15, 0xFF0000, 5, field338 - 3, 30 - var7);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1398[var8] > field453) {
						method89(var2, var2.field1409 / 2);

						if (field337 > -1) {
							if (var8 == 1) {
								field338 -= 20;
							}

							if (var8 == 2) {
								field337 -= 15;
								field338 -= 10;
							}

							if (var8 == 3) {
								field337 += 15;
								field338 -= 10;
							}

							field445[var2.field1397[var8]].method594(field337 - 12, field338 - 12);
							field382.method212(0, field337, String.valueOf(var2.field1396[var8]), field338 + 4);
							field382.method212(0xFFFFFF, field337 - 1, String.valueOf(var2.field1396[var8]), field338 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field400; var9++) {
			int var10 = field402[var9];
			int var11 = field403[var9];
			int var12 = field405[var9];
			int var13 = field404[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field403[var15] - field404[var15] && var11 - var13 < field403[var15] + 2 && var10 - var12 < field405[var15] + field402[var15] && var10 + var12 > field402[var15] - field405[var15] && field403[var15] - field404[var15] < var11) {
						var11 = field403[var15] - field404[var15];
						var14 = true;
					}
				}
			}

			field337 = field402[var9];
			field338 = field403[var9] = var11;
			String var16 = field409[var9];
			if (field128 == 0) {
				int var17 = 0xFFFF00;
				if (field406[var9] < 6) {
					var17 = field339[field406[var9]];
				}

				if (field406[var9] == 6) {
					var17 = field238 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field406[var9] == 7) {
					var17 = field238 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field406[var9] == 8) {
					var17 = field238 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field406[var9] == 9) {
					int var18 = 150 - field408[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field406[var9] == 10) {
					int var19 = 150 - field408[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field406[var9] == 11) {
					int var20 = 150 - field408[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field407[var9] == 0) {
					field384.method212(0, field337, var16, field338 + 1);
					field384.method212(var17, field337, var16, field338);
				}

				if (field407[var9] == 1) {
					field384.method217(field238, field338 + 1, 0, field337, var16);
					field384.method217(field238, field338, var17, field337, var16);
				}

				if (field407[var9] == 2) {
					field384.method218(var16, field337, field338 + 1, field238, 0);
					field384.method218(var16, field337, field338, field238, var17);
				}

				if (field407[var9] == 3) {
					field384.method219(150 - field408[var9], field238, field337, 0, var16, field338 + 1);
					field384.method219(150 - field408[var9], field238, field337, var17, var16, field338);
				}

				if (field407[var9] == 4) {
					int var21 = field384.method215(var16);
					int var22 = (150 - field408[var9]) * (var21 + 100) / 150;
					NQLGXPRA.method390(field337 - 50, 334, 0, field337 + 50);
					field384.method216(var16, field337 + 50 - var22, field338 + 1, 0);
					field384.method216(var16, field337 + 50 - var22, field338, var17);
					NQLGXPRA.method389();
				}

				if (field407[var9] == 5) {
					int var23 = 150 - field408[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					NQLGXPRA.method390(0, field338 + 5, field338 - field384.field676 - 1, 512);
					field384.method212(0, field337, var16, field338 + var24 + 1);
					field384.method212(var17, field337, var16, field338 + var24);
					NQLGXPRA.method389();
				}
			} else {
				field384.method212(0, field337, var16, field338 + 1);
				field384.method212(0xFFFF00, field337, var16, field338);
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method81() {
		if (field137 == null) {
			field476 = null;
			field167 = null;
			field165 = null;
			field164 = null;
			field166 = null;
			field330 = null;
			field331 = null;
			field332 = null;
			field140 = new VOQVBLJN(265, 128, method92());
			NQLGXPRA.method391();
			field141 = new VOQVBLJN(265, 128, method92());
			NQLGXPRA.method391();
			field137 = new VOQVBLJN(171, 509, method92());
			NQLGXPRA.method391();
			field138 = new VOQVBLJN(132, 360, method92());
			NQLGXPRA.method391();
			field139 = new VOQVBLJN(200, 360, method92());
			NQLGXPRA.method391();
			field142 = new VOQVBLJN(238, 202, method92());
			NQLGXPRA.method391();
			field143 = new VOQVBLJN(238, 203, method92());
			NQLGXPRA.method391();
			field144 = new VOQVBLJN(94, 74, method92());
			NQLGXPRA.method391();
			field145 = new VOQVBLJN(94, 75, method92());
			NQLGXPRA.method391();

			if (field254 != null) {
				method56();
				method141();
			}

			field224 = true;
		}
	}

	@ObfuscatedName("client.a(BLHZINZKXF;I)I")
	public final int method82(HZINZKXF arg0, int arg1) {
		if (arg0.field857 == null || arg1 >= arg0.field857.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field857[arg1];
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
					var8 = field360[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field428[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field92[var3[var5++]];
				}

				if (var7 == 4) {
					HZINZKXF var10 = HZINZKXF.method269(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < HVTLSJTR.field774 && (!HVTLSJTR.method254(var11).field762 || field417)) {
						for (int var12 = 0; var12 < var10.field842.length; var12++) {
							if (var11 + 1 == var10.field842[var12]) {
								var8 += var10.field840[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field117[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field270[field428[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field117[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field398.field725;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < ONPAPCUL.field1046; var13++) {
						if (ONPAPCUL.field1048[var13]) {
							var8 += field428[var13];
						}
					}
				}

				if (var7 == 10) {
					HZINZKXF var14 = HZINZKXF.method269(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < HVTLSJTR.field774 && (!HVTLSJTR.method254(var15).field762 || field417)) {
						for (int var16 = 0; var16 < var14.field842.length; var16++) {
							if (var14.field842[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field46;
				}

				if (var7 == 12) {
					var8 = field284;
				}

				if (var7 == 13) {
					int var17 = field117[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					OHEMVFER var20 = OHEMVFER.field1037[var19];
					int var21 = var20.field1039;
					int var22 = var20.field1040;
					int var23 = var20.field1041;
					int var24 = field362[var23 - var22];
					var8 = field117[var21] >> var22 & var24;
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
					var8 = (field398.field1405 >> 7) + field256;
				}

				if (var7 == 19) {
					var8 = (field398.field1406 >> 7) + field257;
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

	@ObfuscatedName("client.b(ILNHEPCMLW;I)V")
	public final void method83(int arg0, NHEPCMLW arg1) {
		while (arg1.field966 + 21 < arg0 * 8) {
			int var3 = arg1.method360(14);
			if (var3 == 16383) {
				break;
			}

			if (field305[var3] == null) {
				field305[var3] = new ZLSEKGJR();
			}

			ZLSEKGJR var4 = field305[var3];
			field307[field306++] = var3;
			var4.field1367 = field453;
			int var5 = arg1.method360(1);
			int var6 = arg1.method360(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method360(1);
			if (var7 == 1) {
				field353[field352++] = var3;
			}

			int var8 = arg1.method360(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1475 = GALAVQEJ.method203(arg1.method360(12));
			var4.field1375 = var4.field1475.field656;
			var4.field1408 = var4.field1475.field649;
			var4.field1399 = var4.field1475.field636;
			var4.field1400 = var4.field1475.field659;
			var4.field1401 = var4.field1475.field635;
			var4.field1402 = var4.field1475.field646;
			var4.field1403 = var4.field1475.field666;
			var4.method547(field398.field1365[0] + var8, field398.field1366[0] + var6, var5 == 1);
		}

		arg1.method361();
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method84(long arg0) {
		if (arg0 != 0L) {
			if (field439 >= 100 && field68 != 1) {
				method106("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field439 >= 200) {
				method106("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = UJPWWGLO.method508(UJPWWGLO.method505(arg0));
				for (int var4 = 0; var4 < field439; var4++) {
					if (field80[var4] == arg0) {
						method106("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field411; var5++) {
					if (field37[var5] == arg0) {
						method106("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field398.field734)) {
					field94[field439] = var3;
					field80[field439] = arg0;
					field221[field439] = 0;
					field439++;
					field118 = true;
					field328.method338(240);
					field328.method345(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method85(int arg0) {
		int var2 = LZWYDZNA.field940[arg0].field948;
		if (var2 != 0) {
			int var3 = field117[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					YFTZFAFG.method565(0.9D);
				}

				if (var3 == 2) {
					YFTZFAFG.method565(0.8D);
				}

				if (var3 == 3) {
					YFTZFAFG.method565(0.7D);
				}

				if (var3 == 4) {
					YFTZFAFG.method565(0.6D);
				}

				HVTLSJTR.field769.method588();
				field224 = true;
			}

			if (var2 == 3) {
				boolean var4 = field147;

				if (var3 == 0) {
					method51(0, field147);
					field147 = true;
				}

				if (var3 == 1) {
					method51(-400, field147);
					field147 = true;
				}

				if (var3 == 2) {
					method51(-800, field147);
					field147 = true;
				}

				if (var3 == 3) {
					method51(-1200, field147);
					field147 = true;
				}

				if (var3 == 4) {
					field147 = false;
				}

				if (field147 != var4 && !field418) {
					if (field147) {
						field148 = field136;
						field149 = true;
						field36.method532(2, field148);
					} else {
						method19();
					}

					field282 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field218 = true;
					method22(0);
				}

				if (var3 == 1) {
					field218 = true;
					method22(-400);
				}

				if (var3 == 2) {
					field218 = true;
					method22(-800);
				}

				if (var3 == 3) {
					field218 = true;
					method22(-1200);
				}

				if (var3 == 4) {
					field218 = false;
				}
			}

			if (var2 == 5) {
				field55 = var3;
			}

			if (var2 == 6) {
				field128 = var3;
			}

			if (var2 == 8) {
				field276 = var3;
				field232 = true;
			}

			if (var2 == 9) {
				field452 = var3;
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method86(String arg0) throws IOException {
		if (field215) {
			if (field314 != null) {
				try {
					field314.close();
				} catch (Exception var4) {
				}

				field314 = null;
			}

			field314 = method139(43595);
			field314.setSoTimeout(10000);
			InputStream var2 = field314.getInputStream();
			OutputStream var3 = field314.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(IIILHZINZKXF;IIII)V")
	public final void method87(int arg0, int arg1, HZINZKXF arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2.field792 == 0 && arg2.field846 != null && !arg2.field801 && (arg0 >= arg3 && arg4 >= arg1 && arg0 <= arg2.field819 + arg3 && arg4 <= arg2.field793 + arg1)) {
			int var8 = arg2.field846.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg2.field837[var9] + arg3;
				int var11 = arg2.field802[var9] + arg1 - arg5;
				HZINZKXF var12 = HZINZKXF.method269(arg2.field846[var9]);
				var10 += var12.field859;
				var11 += var12.field839;
				if ((var12.field862 >= 0 || var12.field811 != 0) && arg0 >= var10 && arg4 >= var11 && arg0 < var12.field819 + var10 && arg4 < var12.field793 + var11) {
					if (var12.field862 >= 0) {
						field334 = var12.field862;
					} else {
						field334 = var12.field796;
					}
				}

				if (var12.field792 == 8 && arg0 >= var10 && arg4 >= var11 && arg0 < var12.field819 + var10 && arg4 < var12.field793 + var11) {
					field324 = var12.field796;
				}

				if (var12.field792 == 0) {
					method87(arg0, var11, var12, var10, arg4, var12.field800, arg6);

					if (var12.field822 > var12.field793) {
						method61(arg0, arg6, var12.field793, var12.field819 + var10, arg4, var11, var12, var12.field822);
					}
				} else {
					if (var12.field849 == 1 && arg0 >= var10 && arg4 >= var11 && arg0 < var12.field819 + var10 && arg4 < var12.field793 + var11) {
						boolean var13 = false;
						if (var12.field856 != 0) {
							var13 = method59(var12);
						}

						if (!var13) {
							field146[field466] = var12.field848;
							field208[field466] = 623;
							field207[field466] = var12.field796;
							field466++;
						}
					}

					if (var12.field849 == 2 && field150 == 0 && arg0 >= var10 && arg4 >= var11 && arg0 < var12.field819 + var10 && arg4 < var12.field793 + var11) {
						String var14 = var12.field847;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field146[field466] = var14 + " @gre@" + var12.field794;
						field208[field466] = 943;
						field207[field466] = var12.field796;
						field466++;
					}

					if (var12.field849 == 3 && arg0 >= var10 && arg4 >= var11 && arg0 < var12.field819 + var10 && arg4 < var12.field793 + var11) {
						field146[field466] = "Close";

						if (arg6 == 3) {
							field208[field466] = 107;
						} else {
							field208[field466] = 504;
						}

						field207[field466] = var12.field796;
						field466++;
					}

					if (var12.field849 == 4 && arg0 >= var10 && arg4 >= var11 && arg0 < var12.field819 + var10 && arg4 < var12.field793 + var11) {
						field146[field466] = var12.field848;
						field208[field466] = 48;
						field207[field466] = var12.field796;
						field466++;
					}

					if (var12.field849 == 5 && arg0 >= var10 && arg4 >= var11 && arg0 < var12.field819 + var10 && arg4 < var12.field793 + var11) {
						field146[field466] = var12.field848;
						field208[field466] = 597;
						field207[field466] = var12.field796;
						field466++;
					}

					if (var12.field849 == 6 && !field163 && arg0 >= var10 && arg4 >= var11 && arg0 < var12.field819 + var10 && arg4 < var12.field793 + var11) {
						field146[field466] = var12.field848;
						field208[field466] = 214;
						field207[field466] = var12.field796;
						field466++;
					}

					if (var12.field792 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field793; var16++) {
							for (int var17 = 0; var17 < var12.field819; var17++) {
								int var18 = (var12.field817 + 32) * var17 + var10;
								int var19 = (var12.field790 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field829[var15];
									var19 += var12.field826[var15];
								}

								if (arg0 >= var18 && arg4 >= var19 && arg0 < var18 + 32 && arg4 < var19 + 32) {
									field295 = var15;
									field296 = var12.field796;

									if (var12.field842[var15] > 0) {
										HVTLSJTR var20 = HVTLSJTR.method254(var12.field842[var15] - 1);
										if (field431 == 1 && var12.field813) {
											if (field433 != var12.field796 || field432 != var15) {
												field146[field466] = "Use " + field435 + " with @lre@" + var20.field782;
												field208[field466] = 320;
												field209[field466] = var20.field771;
												field206[field466] = var15;
												field207[field466] = var12.field796;
												field466++;
											}
										} else if (field150 != 1 || !var12.field813) {
											if (var12.field813) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field772 != null && var20.field772[var21] != null) {
														field146[field466] = var20.field772[var21] + " @lre@" + var20.field782;

														if (var21 == 3) {
															field208[field466] = 478;
														}

														if (var21 == 4) {
															field208[field466] = 170;
														}

														field209[field466] = var20.field771;
														field206[field466] = var15;
														field207[field466] = var12.field796;
														field466++;
													} else if (var21 == 4) {
														field146[field466] = "Drop @lre@" + var20.field782;
														field208[field466] = 170;
														field209[field466] = var20.field771;
														field206[field466] = var15;
														field207[field466] = var12.field796;
														field466++;
													}
												}
											}

											if (var12.field841) {
												field146[field466] = "Use @lre@" + var20.field782;
												field208[field466] = 87;
												field209[field466] = var20.field771;
												field206[field466] = var15;
												field207[field466] = var12.field796;
												field466++;
											}

											if (var12.field813 && var20.field772 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field772[var22] != null) {
														field146[field466] = var20.field772[var22] + " @lre@" + var20.field782;

														if (var22 == 0) {
															field208[field466] = 641;
														}

														if (var22 == 1) {
															field208[field466] = 546;
														}

														if (var22 == 2) {
															field208[field466] = 129;
														}

														field209[field466] = var20.field771;
														field206[field466] = var15;
														field207[field466] = var12.field796;
														field466++;
													}
												}
											}

											if (var12.field850 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field850[var23] != null) {
														field146[field466] = var12.field850[var23] + " @lre@" + var20.field782;

														if (var23 == 0) {
															field208[field466] = 940;
														}

														if (var23 == 1) {
															field208[field466] = 905;
														}

														if (var23 == 2) {
															field208[field466] = 96;
														}

														if (var23 == 3) {
															field208[field466] = 513;
														}

														if (var23 == 4) {
															field208[field466] = 133;
														}

														field209[field466] = var20.field771;
														field206[field466] = var15;
														field207[field466] = var12.field796;
														field466++;
													}
												}
											}

											field146[field466] = "Examine @lre@" + var20.field782;
											field208[field466] = 1187;
											field209[field466] = var20.field771;
											field206[field466] = var15;
											field207[field466] = var12.field796;
											field466++;
										} else if ((field152 & 0x10) == 0x10) {
											field146[field466] = field153 + " @lre@" + var20.field782;
											field208[field466] = 460;
											field209[field466] = var20.field771;
											field206[field466] = var15;
											field207[field466] = var12.field796;
											field466++;
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

	@ObfuscatedName("client.i(Z)V")
	public final void method88() {
		if (field336 > 1) {
			field336--;
		}

		if (field125 > 0) {
			field125--;
		}

		for (int var1 = 0; var1 < 5 && method149(); var1++) {
		}

		if (field366) {
			synchronized (field65.field935) {
				if (!field438) {
					field65.field936 = 0;
				} else if (field489 != 0 || field65.field936 >= 40) {
					field328.method338(239);
					field328.method339(0);
					int var3 = field328.field965;
					int var4 = 0;
					for (int var5 = 0; var5 < field65.field936 && var3 - field328.field965 < 240; var5++) {
						var4++;
						int var6 = field65.field933[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field65.field934[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field65.field933[var5] == -1 && field65.field934[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field234 != var7 || field235 != var6) {
							int var9 = var7 - field234;
							field234 = var7;
							int var10 = var6 - field235;
							field235 = var6;

							if (field69 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field328.method340((field69 << 12) + (var9 << 6) + var10);
								field69 = 0;
							} else if (field69 < 8) {
								field328.method342((field69 << 19) + var8 + 0x800000);
								field69 = 0;
							} else {
								field328.method343((field69 << 19) + var8 - 0x40000000);
								field69 = 0;
							}
						} else if (field69 < 2047) {
							field69++;
						}
					}

					field328.method348(field328.field965 - var3);

					if (var4 >= field65.field936) {
						field65.field936 = 0;
					} else {
						field65.field936 -= var4;
						for (int var11 = 0; var11 < field65.field936; var11++) {
							field65.field934[var11] = field65.field934[var4 + var11];
							field65.field933[var11] = field65.field933[var4 + var11];
						}
					}
				}
			}

			if (field489 != 0) {
				long var12 = (field492 - field356) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field356 = field492;
				int var14 = field491;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field490;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field489 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field328.method338(254);
				field328.method381((var17 << 19) + (var18 << 20) + var16);
			}

			if (field312 > 0) {
				field312--;
			}

			if (field493[1] == 1 || field493[2] == 1 || field493[3] == 1 || field493[4] == 1) {
				field313 = true;
			}

			if (field313 && field312 <= 0) {
				field312 = 20;
				field313 = false;
				field328.method338(178);
				field328.method374(field291);
				field328.method374(field290);
			}

			if (field480 && !field388) {
				field388 = true;
				field328.method338(217);
				field328.method339(1);
			}

			if (!field480 && field388) {
				field388 = false;
				field328.method338(217);
				field328.method339(0);
			}

			method37();
			method75();
			method107();
			field262++;
			if (field262 > 1013) {
				field262 = 0;
				field328.method338(144);
				field328.method339(0);
				int var19 = field328.field965;
				field328.method339((int) (Math.random() * 256.0D));
				field328.method339(84);
				field328.method340(36060);

				if ((int) (Math.random() * 2.0D) == 0) {
					field328.method339(57);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field328.method339(112);
				}

				field328.method340(63934);
				field328.method339((int) (Math.random() * 256.0D));
				field328.method340((int) (Math.random() * 65536.0D));
				field328.method340((int) (Math.random() * 65536.0D));
				field328.method340(29666);
				field328.method348(field328.field965 - var19);
			}

			field123++;
			if (field123 > 750) {
				method58();
			}

			method39();
			method62();
			method42();
			field247++;

			if (field54 != 0) {
				field53 += 20;
				if (field53 >= 400) {
					field54 = 0;
				}
			}

			if (field74 != 0) {
				field71++;
				if (field71 >= 15) {
					if (field74 == 2) {
						field118 = true;
					}

					if (field74 == 3) {
						field232 = true;
					}

					field74 = 0;
				}
			}

			if (field244 != 0) {
				field195++;

				if (field483 > field245 + 5 || field483 < field245 - 5 || field484 > field246 + 5 || field484 < field246 - 5) {
					field231 = true;
				}

				if (field482 == 0) {
					if (field244 == 2) {
						field118 = true;
					}

					if (field244 == 3) {
						field232 = true;
					}

					field244 = 0;

					if (field231 && field195 >= 5) {
						field296 = -1;
						method126();

						if (field296 == field242 && field295 != field243) {
							HZINZKXF var20 = HZINZKXF.method269(field242);
							byte var21 = 0;
							if (field452 == 1 && var20.field856 == 206) {
								var21 = 1;
							}

							if (var20.field842[field295] <= 0) {
								var21 = 0;
							}

							if (var20.field821) {
								int var22 = field243;
								int var23 = field295;
								var20.field842[var23] = var20.field842[var22];
								var20.field840[var23] = var20.field840[var22];
								var20.field842[var22] = -1;
								var20.field840[var22] = 0;
							} else if (var21 == 1) {
								int var24 = field243;
								int var25 = field295;
								while (var24 != var25) {
									if (var24 > var25) {
										var20.method272(var24, var24 - 1);
										var24--;
									} else if (var24 < var25) {
										var20.method272(var24, var24 + 1);
										var24++;
									}
								}
							} else {
								var20.method272(field243, field295);
							}

							field328.method338(26);
							field328.method365(var21);
							field328.method374(field242);
							field328.method372(field295);
							field328.method340(field243);
						}
					} else if ((field55 == 1 || method28(field466 - 1)) && field466 > 2) {
						method119();
					} else if (field466 > 0) {
						method55(field466 - 1);
					}

					field71 = 10;
					field489 = 0;
				}
			}

			if (TEXKPKZX.field1246 != -1) {
				int var26 = TEXKPKZX.field1246;
				int var27 = TEXKPKZX.field1247;
				boolean var28 = method6(0, var27, field398.field1366[0], true, 0, 0, 0, var26, 0, field398.field1365[0], 0);
				TEXKPKZX.field1246 = -1;

				if (var28) {
					field51 = field490;
					field52 = field491;
					field54 = 1;
					field53 = 0;
				}
			}

			if (field489 == 1 && field390 != null) {
				field390 = null;
				field232 = true;
				field489 = 0;
			}

			method105();

			if (field173 == -1) {
				method109();
				method133();
				method98();
			}

			if (field482 == 1 || field489 == 1) {
				field84++;
			}

			if (field219 == 0 && field261 == 0 && field391 == 0) {
				if (field321 > 0) {
					field321--;
				}
			} else if (field321 < 100) {
				field321++;
				if (field321 == 100) {
					if (field219 != 0) {
						field232 = true;
					}

					if (field261 != 0) {
						field118 = true;
					}
				}
			}

			if (field239 == 2) {
				method36();
			}

			if (field239 == 2 && field342) {
				method8();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field343[var29]++;
			}

			method95();
			field135++;
			if (field135 > 1016) {
				field135 = 0;
				field328.method338(49);
				field328.method339(0);
				int var30 = field328.field965;
				field328.method340(16080);
				field328.method340((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field328.method339(254);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field328.method340(4084);
				}

				field328.method339(160);
				field328.method339(246);
				field328.method339(124);
				field328.method339((int) (Math.random() * 256.0D));
				field328.method340((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field328.method340(59156);
				}

				field328.method348(field328.field965 - var30);
			}

			field481++;
			if (field481 > 4500) {
				field125 = 250;
				field481 -= 500;
				field328.method338(195);
			}

			field187++;
			if (field187 > 500) {
				field187 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field77 += field78;
				}

				if ((var31 & 0x2) == 2) {
					field436 += field437;
				}

				if ((var31 & 0x4) == 4) {
					field105 += field106;
				}
			}

			if (field77 < -50) {
				field78 = 2;
			}

			if (field77 > 50) {
				field78 = -2;
			}

			if (field436 < -55) {
				field437 = 2;
			}

			if (field436 > 55) {
				field437 = -2;
			}

			if (field105 < -40) {
				field106 = 1;
			}

			if (field105 > 40) {
				field106 = -1;
			}

			field223++;
			if (field223 > 500) {
				field223 = 0;
				int var32 = (int) (Math.random() * 8.0D);
				if ((var32 & 0x1) == 1) {
					field274 += field275;
				}

				if ((var32 & 0x2) == 2) {
					field267 += field268;
				}
			}

			if (field274 < -60) {
				field275 = 2;
			}

			if (field274 > 60) {
				field275 = -2;
			}

			if (field267 < -20) {
				field268 = 1;
			}

			if (field267 > 10) {
				field268 = -1;
			}

			field124++;
			if (field124 > 50) {
				field328.method338(37);
			}

			try {
				if (field127 != null && field328.field965 > 0) {
					field127.method582(field328.field964, field328.field965, 0);
					field328.field965 = 0;
					field124 = 0;
				}
			} catch (IOException var34) {
				method58();
			} catch (Exception var35) {
				method144();
			}
		}
	}

	@ObfuscatedName("client.a(LXETERYIW;II)V")
	public final void method89(XETERYIW arg0, int arg1) {
		method90(arg0.field1406, arg0.field1405, arg1);
	}

	@ObfuscatedName("client.a(IIZI)V")
	public final void method90(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method52(field83, arg0, arg1) - arg2;
			arg1 -= field58;
			var4 -= field59;
			arg0 -= field60;
			int var5 = CSGBDGDY.field566[field61];
			int var6 = CSGBDGDY.field567[field61];
			int var7 = CSGBDGDY.field566[field62];
			int var8 = CSGBDGDY.field567[field62];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field337 = (var9 << 9) / arg0 + YFTZFAFG.field1434;
				field338 = (var11 << 9) / arg0 + YFTZFAFG.field1435;
			} else {
				field337 = -1;
				field338 = -1;
			}
		} else {
			field337 = -1;
			field338 = -1;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public void method91() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field420);

		if (field36 != null) {
			System.out.println("Od-cycle:" + field36.field1329);
		}

		System.out.println("loop-cycle:" + field453);
		System.out.println("draw-cycle:" + field214);
		System.out.println("ptype:" + field122);
		System.out.println("psize:" + field121);

		if (field127 != null) {
			field127.method583();
		}

		field472 = true;
	}

	@ObfuscatedName("client.b(Z)Ljava/awt/Component;")
	public final Component method92() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field478 != null) {
			return field478;
		}

		return this;
	}

	@ObfuscatedName("client.x(I)V")
	public final void method93() {
		method115();

		if (field54 == 1) {
			field463[field53 / 100].method594(field51 - 8 - 4, field52 - 8 - 4);
		}

		if (field54 == 2) {
			field463[field53 / 100 + 4].method594(field51 - 8 - 4, field52 - 8 - 4);
		}

		if (field40 != -1) {
			method123(field40, field247);
			method13(0, 0, HZINZKXF.method269(field40), 0);
		}

		if (field278 != -1) {
			method123(field278, field247);
			method13(0, 0, HZINZKXF.method269(field278), 0);
		}

		method124();

		if (!field132) {
			method126();
			method7();
		} else if (field99 == 0) {
			method108();
		}

		if (field112 == 1) {
			field34.method594(472, 296);
		}

		if (field93) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field471 < 30 && field418) {
				var3 = 0xFF0000;
			}

			if (field471 < 20 && !field418) {
				var3 = 0xFF0000;
			}

			field383.method211(var1, var2, "Fps:" + field471, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field418) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field418) {
				int var8 = 0xFF0000;
			}

			field383.method211(var1, var2, "Mem:" + var5 + "k", 0xFFFF00);
			var2 += 15;
		}

		if (field336 != 0) {
			int var9 = field336 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field383.method216("System update in: " + var10 + ":0" + var9, 4, 329, 0xFFFF00);
			} else {
				field383.method216("System update in: " + var10 + ":" + var9, 4, 329, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method94() {
		short var1 = 256;

		if (field265 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field265 > 768) {
					field441[var2] = method9(field443[var2], 1024 - field265, field442[var2]);
				} else if (field265 > 256) {
					field441[var2] = field443[var2];
				} else {
					field441[var2] = method9(field442[var2], 256 - field265, field443[var2]);
				}
			}
		} else if (field266 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field266 > 768) {
					field441[var3] = method9(field444[var3], 1024 - field266, field442[var3]);
				} else if (field266 > 256) {
					field441[var3] = field444[var3];
				} else {
					field441[var3] = method9(field442[var3], 256 - field266, field444[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field441[var4] = field442[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field140.field1348[var5] = field63.field1505[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field213[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field196[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field441[var12];
					int var15 = field140.field1348[var7];
					field140.field1348[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field140.method536(0, 0, field475);

		for (int var16 = 0; var16 < 33920; var16++) {
			field141.field1348[var16] = field64.field1505[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field213[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field196[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field441[var23];
					int var26 = field141.field1348[var18];
					field141.field1348[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field141.method536(637, 0, field475);
	}

	@ObfuscatedName("client.z(I)V")
	public final void method95() {
		while (true) {
			int var1 = method155();
			if (var1 == -1) {
				return;
			}

			if (field278 != -1 && field427 == field278) {
				if (var1 == 8 && field233.length() > 0) {
					field233 = field233.substring(0, field233.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field233.length() < 12) {
					field233 = field233 + (char) var1;
				}
			} else if (field320) {
				if (var1 >= 32 && var1 <= 122 && field414.length() < 80) {
					field414 = field414 + (char) var1;
					field232 = true;
				}

				if (var1 == 8 && field414.length() > 0) {
					field414 = field414.substring(0, field414.length() - 1);
					field232 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field320 = false;
					field232 = true;

					if (field283 == 1) {
						long var2 = UJPWWGLO.method504(field414);
						method84(var2);
					}

					if (field283 == 2 && field439 > 0) {
						long var4 = UJPWWGLO.method504(field414);
						method50(var4);
					}

					if (field283 == 3 && field414.length() > 0) {
						field328.method338(201);
						field328.method339(0);
						int var6 = field328.field965;
						field328.method345(field227);
						LSYVWAVF.method332(field328, field414);
						field328.method348(field328.field965 - var6);
						field414 = LSYVWAVF.method333(field414);
						field414 = KUSEVGYR.method302(field414);
						method106(UJPWWGLO.method508(UJPWWGLO.method505(field227)), field414, 6);

						if (field172 == 2) {
							field172 = 1;
							field413 = true;
							field328.method338(100);
							field328.method339(field198);
							field328.method339(field172);
							field328.method339(field156);
						}
					}

					if (field283 == 4 && field411 < 100) {
						long var7 = UJPWWGLO.method504(field414);
						method24(var7);
					}

					if (field283 == 5 && field411 > 0) {
						long var9 = UJPWWGLO.method504(field414);
						method10(var9);
					}
				}
			} else if (field168 == 1) {
				if (var1 >= 48 && var1 <= 57 && field82.length() < 10) {
					field82 = field82 + (char) var1;
					field232 = true;
				}

				if (var1 == 8 && field82.length() > 0) {
					field82 = field82.substring(0, field82.length() - 1);
					field232 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field82.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field82);
						} catch (Exception var21) {
						}

						field328.method338(146);
						field328.method343(var11);
					}

					field168 = 0;
					field232 = true;
				}
			} else if (field168 == 2) {
				if (var1 >= 32 && var1 <= 122 && field82.length() < 12) {
					field82 = field82 + (char) var1;
					field232 = true;
				}

				if (var1 == 8 && field82.length() > 0) {
					field82 = field82.substring(0, field82.length() - 1);
					field232 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field82.length() > 0) {
						field328.method338(98);
						field328.method345(UJPWWGLO.method504(field82));
					}

					field168 = 0;
					field232 = true;
				}
			} else if (field303 == -1 && field173 == -1) {
				if (var1 >= 32 && var1 <= 122 && field333.length() < 80) {
					field333 = field333 + (char) var1;
					field232 = true;
				}

				if (var1 == 8 && field333.length() > 0) {
					field333 = field333.substring(0, field333.length() - 1);
					field232 = true;
				}

				if ((var1 == 13 || var1 == 10) && field333.length() > 0) {
					if (field81 == 2) {
						if (field333.equals("::clientdrop")) {
							method58();
						}

						if (field333.equals("::lag")) {
							method91();
						}

						if (field333.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field36.method533(2); var12++) {
								field36.method522(2, var12, (byte) 1);
							}
						}

						if (field333.equals("::fpson")) {
							field93 = true;
						}

						if (field333.equals("::fpsoff")) {
							field93 = false;
						}

						if (field333.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field194[var13].field615[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field333.startsWith("::")) {
						field328.method338(247);
						field328.method339(field333.length() - 1);
						field328.method346(field333.substring(2));
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

						field328.method338(72);
						field328.method339(0);
						int var20 = field328.field965;
						field328.method365(var19);
						field328.method365(var17);
						field304.field965 = 0;
						LSYVWAVF.method332(field304, field333);
						field328.method385(field304.field965, 0, field304.field964);
						field328.method348(field328.field965 - var20);
						field333 = LSYVWAVF.method333(field333);
						field333 = KUSEVGYR.method302(field333);
						field398.field1371 = field333;
						field398.field1372 = var17;
						field398.field1387 = var19;
						field398.field1364 = 150;

						if (field81 == 2) {
							method106("@cr2@" + field398.field734, field398.field1371, 2);
						} else if (field81 == 1) {
							method106("@cr1@" + field398.field734, field398.field1371, 2);
						} else {
							method106(field398.field734, field398.field1371, 2);
						}

						if (field198 == 2) {
							field198 = 3;
							field413 = true;
							field328.method338(100);
							field328.method339(field198);
							field328.method339(field172);
							field328.method339(field156);
						}
					}

					field333 = "";
					field232 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method96(int arg0) {
		if (!field418) {
			for (int var2 = 0; var2 < field410.length; var2++) {
				int var3 = field410[var2];
				if (YFTZFAFG.field1448[var3] >= arg0) {
					RZWMPYWU var4 = YFTZFAFG.field1442[var3];
					int var5 = var4.field1182 * var4.field1181 - 1;
					int var6 = field247 * var4.field1181 * 2;
					byte[] var7 = var4.field1179;
					byte[] var8 = field191;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1179 = var8;
					field191 = var7;
					YFTZFAFG.method563(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBIIIII)V")
	public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		YCAXTCCQ var10 = null;
		for (YCAXTCCQ var11 = (YCAXTCCQ) field359.method414(); var11 != null; var11 = (YCAXTCCQ) field359.method416()) {
			if (var11.field1420 == arg1 && var11.field1422 == arg6 && var11.field1423 == arg0 && var11.field1421 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new YCAXTCCQ();
			var10.field1420 = arg1;
			var10.field1421 = arg3;
			var10.field1422 = arg6;
			var10.field1423 = arg0;
			method17(var10);
			field359.method411(var10);
		}

		var10.field1426 = arg2;
		var10.field1428 = arg7;
		var10.field1427 = arg4;
		var10.field1424 = arg8;
		var10.field1425 = arg5;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method98() {
		if (field489 == 1) {
			if (field490 >= 6 && field490 <= 106 && field491 >= 467 && field491 <= 499) {
				field198 = (field198 + 1) % 4;
				field413 = true;
				field232 = true;
				field328.method338(100);
				field328.method339(field198);
				field328.method339(field172);
				field328.method339(field156);
			}

			if (field490 >= 135 && field490 <= 235 && field491 >= 467 && field491 <= 499) {
				field172 = (field172 + 1) % 3;
				field413 = true;
				field232 = true;
				field328.method338(100);
				field328.method339(field198);
				field328.method339(field172);
				field328.method339(field156);
			}

			if (field490 >= 273 && field490 <= 373 && field491 >= 467 && field491 <= 499) {
				field156 = (field156 + 1) % 3;
				field413 = true;
				field232 = true;
				field328.method338(100);
				field328.method339(field198);
				field328.method339(field172);
				field328.method339(field156);
			}

			if (field490 >= 412 && field490 <= 512 && field491 >= 467 && field491 <= 499) {
				if (field278 == -1) {
					method110();
					field233 = "";
					field269 = false;
					field427 = field278 = HZINZKXF.field797;
					return;
				}

				method106("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LHZINZKXF;B)Z")
	public final boolean method99(HZINZKXF arg0) {
		if (arg0.field852 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field852.length; var2++) {
			int var3 = method82(arg0, var2);
			int var4 = arg0.field791[var2];
			if (arg0.field852[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field852[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field852[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.h(B)Ljava/lang/String;")
	public final String method100() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field478 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.A(I)V")
	public final void method101() {
		Graphics var1 = method92().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method154(1);

		if (field205) {
			field380 = false;
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

		if (field169) {
			field380 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field318) {
			field380 = false;
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

	@ObfuscatedName("client.i(B)V")
	public final void method102() {
		for (ZJEEQISS var1 = (ZJEEQISS) field297.method414(); var1 != null; var1 = (ZJEEQISS) field297.method416()) {
			if (field83 != var1.field1465 || var1.field1464) {
				var1.method336();
			} else if (field453 >= var1.field1472) {
				var1.method584(field247);

				if (var1.field1464) {
					var1.method336();
				} else {
					field113.method460(var1.field1466, 60, var1, var1.field1465, 0, -1, var1.field1467, var1.field1468, false);
				}
			}
		}
	}

	public final void init() {
		field415 = Integer.parseInt(getParameter("nodeid"));
		field416 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method41();
		} else {
			method125();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field417 = false;
		} else {
			field417 = true;
		}

		method152(503, 765);
	}

	@ObfuscatedName("client.j(B)Z")
	public final boolean method103() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean method104(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.B(I)V")
	public final void method105() {
		if (field244 == 0) {
			int var1 = field489;
			if (field150 == 1 && field490 >= 516 && field491 >= 160 && field490 <= 765 && field491 <= 205) {
				var1 = 0;
			}

			if (field132) {
				if (var1 != 1) {
					int var2 = field483;
					int var3 = field484;
					if (field99 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field99 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field99 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field100 - 10 || var2 > field102 + field100 + 10 || var3 < field101 - 10 || var3 > field103 + field101 + 10) {
						field132 = false;

						if (field99 == 1) {
							field118 = true;
						}

						if (field99 == 2) {
							field232 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field100;
					int var5 = field101;
					int var6 = field102;
					int var7 = field490;
					int var8 = field491;
					if (field99 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field99 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field99 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field466; var10++) {
						int var11 = (field466 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method55(var9);
					}

					field132 = false;

					if (field99 == 1) {
						field118 = true;
					}

					if (field99 == 2) {
						field232 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field466 > 0) {
					int var12 = field208[field466 - 1];
					if (var12 == 940 || var12 == 905 || var12 == 96 || var12 == 513 || var12 == 133 || var12 == 641 || var12 == 546 || var12 == 129 || var12 == 478 || var12 == 170 || var12 == 87 || var12 == 1187) {
						int var13 = field206[field466 - 1];
						int var14 = field207[field466 - 1];
						HZINZKXF var15 = HZINZKXF.method269(var14);
						if (var15.field843 || var15.field821) {
							field231 = false;
							field195 = 0;
							field242 = var14;
							field243 = var13;
							field244 = 2;
							field245 = field490;
							field246 = field491;

							if (HZINZKXF.method269(var14).field824 == field278) {
								field244 = 1;
							}

							if (HZINZKXF.method269(var14).field824 == field303) {
								field244 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field55 == 1 || method28(field466 - 1)) && field466 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field466 > 0) {
					method55(field466 - 1);
				}

				if (var1 != 2 || field466 <= 0) {
					return;
				}

				method119();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;I)V")
	public final void method106(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field134 != -1) {
			field390 = arg1;
			field489 = 0;
		}

		if (field303 == -1) {
			field232 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field41[var4] = field41[var4 - 1];
			field42[var4] = field42[var4 - 1];
			field43[var4] = field43[var4 - 1];
		}

		field41[0] = arg2;
		field42[0] = arg0;
		field43[0] = arg1;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method107() {
		for (int var1 = 0; var1 < field340; var1++) {
			if (field176[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field89[var1] != field90 || field389[var1] != field204) {
						NHEPCMLW var3 = KTPZRJZJ.method287(field389[var1], field89[var1]);
						if (System.currentTimeMillis() + var3.field965 / 22 > field86 / 22 + field279) {
							field86 = var3.field965;
							field279 = System.currentTimeMillis();

							if (method104(var3.field964, var3.field965)) {
								field90 = field89[var1];
								field204 = field389[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method103()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field176[var1] != -5) {
					field176[var1] = -5;
				} else {
					field340--;
					for (int var5 = var1; var5 < field340; var5++) {
						field89[var5] = field89[var5 + 1];
						field389[var5] = field389[var5 + 1];
						field176[var5] = field176[var5 + 1];
					}

					var1--;
				}
			} else {
				field176[var1]--;
			}
		}

		if (field282 > 0) {
			field282 -= 20;
			if (field282 < 0) {
				field282 = 0;
			}

			if (field282 == 0 && field147 && !field418) {
				field148 = field136;
				field149 = true;
				field36.method532(2, field148);
				return;
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method108() {
		int var1 = field100;
		int var2 = field101;
		int var3 = field102;
		int var4 = field103;
		int var5 = 0x5D5447;
		NQLGXPRA.method393(var1, var5, var4, var2, var3);
		NQLGXPRA.method393(var1 + 1, 0, 16, var2 + 1, var3 - 2);
		NQLGXPRA.method394(0, var2 + 18, var3 - 2, var4 - 19, var1 + 1);
		field384.method216("Choose Option", var1 + 3, var2 + 14, var5);
		int var6 = field483;
		int var7 = field484;
		if (field99 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field99 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field99 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field466; var8++) {
			int var9 = (field466 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field384.method220(var9, field146[var8], true, var10, var1 + 3);
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method109() {
		if (field216 == 0 && field489 == 1) {
			int var1 = field490 - 25 - 550;
			int var2 = field491 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field291 + field274 & 0x7FF;
				int var4 = YFTZFAFG.field1438[var3];
				int var5 = YFTZFAFG.field1439[var3];
				var4 = (field267 + 256) * var4 >> 8;
				var5 = (field267 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field398.field1405 + var6 >> 7;
				int var9 = field398.field1406 - var7 >> 7;
				boolean var10 = method6(0, var9, field398.field1366[0], true, 0, 0, 1, var8, 0, field398.field1365[0], 0);
				if (var10) {
					field328.method339(var1);
					field328.method339(var2);
					field328.method340(field291);
					field328.method339(57);
					field328.method339(field274);
					field328.method339(field267);
					field328.method339(89);
					field328.method340(field398.field1405);
					field328.method340(field398.field1406);
					field328.method339(field174);
					field328.method339(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method110() {
		field328.method338(241);

		if (field376 != -1) {
			method121(field376);
			field376 = -1;
			field118 = true;
			field163 = false;
			field241 = true;
		}

		if (field303 != -1) {
			method121(field303);
			field303 = -1;
			field232 = true;
			field163 = false;
		}

		if (field173 != -1) {
			method121(field173);
			field173 = -1;
			field224 = true;
		}

		if (field419 != -1) {
			method121(field419);
			field419 = -1;
		}

		if (field278 != -1) {
			method121(field278);
			field278 = -1;
		}
	}

	@ObfuscatedName("client.a(IILGALAVQEJ;II)V")
	public final void method111(int arg0, int arg1, GALAVQEJ arg2, int arg3) {
		if (field466 < 400) {
			if (arg2.field658 != null) {
				arg2 = arg2.method206();
			}

			if (arg2 != null && arg2.field663) {
				String var5 = arg2.field657;
				if (arg2.field652 != 0) {
					var5 = var5 + method5(arg2.field652, field398.field725) + " (level-" + arg2.field652 + ")";
				}

				if (field431 == 1) {
					field146[field466] = "Use " + field435 + " with @yel@" + var5;
					field208[field466] = 58;
					field209[field466] = arg0;
					field206[field466] = arg3;
					field207[field466] = arg1;
					field466++;
				} else if (field150 != 1) {
					if (arg2.field650 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field650[var6] != null && !arg2.field650[var6].equalsIgnoreCase("attack")) {
								field146[field466] = arg2.field650[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field208[field466] = 249;
								}

								if (var6 == 1) {
									field208[field466] = 691;
								}

								if (var6 == 2) {
									field208[field466] = 458;
								}

								if (var6 == 3) {
									field208[field466] = 916;
								}

								if (var6 == 4) {
									field208[field466] = 743;
								}

								field209[field466] = arg0;
								field206[field466] = arg3;
								field207[field466] = arg1;
								field466++;
							}
						}
					}

					if (arg2.field650 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field650[var7] != null && arg2.field650[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field652 > field398.field725) {
									var8 = 2000;
								}

								field146[field466] = arg2.field650[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field208[field466] = var8 + 249;
								}

								if (var7 == 1) {
									field208[field466] = var8 + 691;
								}

								if (var7 == 2) {
									field208[field466] = var8 + 458;
								}

								if (var7 == 3) {
									field208[field466] = var8 + 916;
								}

								if (var7 == 4) {
									field208[field466] = var8 + 743;
								}

								field209[field466] = arg0;
								field206[field466] = arg3;
								field207[field466] = arg1;
								field466++;
							}
						}
					}

					field146[field466] = "Examine @yel@" + var5;
					field208[field466] = 1117;
					field209[field466] = arg0;
					field206[field466] = arg3;
					field207[field466] = arg1;
					field466++;
				} else if ((field152 & 0x2) == 2) {
					field146[field466] = field153 + " @yel@" + var5;
					field208[field466] = 465;
					field209[field466] = arg0;
					field206[field466] = arg3;
					field207[field466] = arg1;
					field466++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method112(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IIILHDYGEGXY;LNHEPCMLW;)V")
	public final void method113(int arg0, int arg1, HDYGEGXY arg2, NHEPCMLW arg3) {
		if ((arg1 & 0x20) != 0) {
			int var5 = arg3.method375();
			if (var5 == 0xFFFF) {
				var5 = -1;
			}

			int var6 = arg3.method369();
			if (arg2.field1391 == var5 && var5 != -1) {
				int var7 = PNPNYEVW.field1058[var5].field1072;
				if (var7 == 1) {
					arg2.field1392 = 0;
					arg2.field1393 = 0;
					arg2.field1394 = var6;
					arg2.field1395 = 0;
				}

				if (var7 == 2) {
					arg2.field1395 = 0;
				}
			} else if (var5 == -1 || arg2.field1391 == -1 || PNPNYEVW.field1058[var5].field1066 >= PNPNYEVW.field1058[arg2.field1391].field1066) {
				arg2.field1391 = var5;
				arg2.field1392 = 0;
				arg2.field1393 = 0;
				arg2.field1394 = var6;
				arg2.field1395 = 0;
				arg2.field1368 = arg2.field1383;
			}
		}

		if ((arg1 & 0x100) != 0) {
			arg2.field1359 = arg3.method376();
			int var8 = arg3.method384();
			arg2.field1363 = var8 >> 16;
			arg2.field1362 = (var8 & 0xFFFF) + field453;
			arg2.field1360 = 0;
			arg2.field1361 = 0;

			if (arg2.field1362 > field453) {
				arg2.field1360 = -1;
			}

			if (arg2.field1359 == 0xFFFF) {
				arg2.field1359 = -1;
			}
		}

		if ((arg1 & 0x2) != 0) {
			int var9 = arg3.method349();
			int var10 = arg3.method367();
			arg2.method546(var9, field453, var10);
			arg2.field1388 = field453 + 300;
			arg2.field1389 = arg3.method369();
			arg2.field1390 = arg3.method349();
		}

		if ((arg1 & 0x40) != 0) {
			arg2.field1355 = arg3.method376();
			if (arg2.field1355 == 0xFFFF) {
				arg2.field1355 = -1;
			}
		}

		if ((arg1 & 0x400) != 0) {
			arg2.field1376 = arg3.method369();
			arg2.field1378 = arg3.method369();
			arg2.field1377 = arg3.method369();
			arg2.field1379 = arg3.method349();
			arg2.field1380 = arg3.method376() + field453;
			arg2.field1381 = arg3.method377() + field453;
			arg2.field1382 = arg3.method369();
			arg2.method549();
		}

		if ((arg1 & 0x4) != 0) {
			int var11 = arg3.method377();
			int var12 = arg3.method369();
			int var13 = arg3.method369();
			int var14 = arg3.field965;

			if (arg2.field734 != null && arg2.field733) {
				long var15 = UJPWWGLO.method504(arg2.field734);
				boolean var17 = false;
				if (var12 <= 1) {
					for (int var18 = 0; var18 < field411; var18++) {
						if (field37[var18] == var15) {
							var17 = true;
							break;
						}
					}
				}

				if (!var17 && field240 == 0) {
					try {
						field304.field965 = 0;
						arg3.method387(var13, field304.field964, 0);
						field304.field965 = 0;
						String var19 = LSYVWAVF.method331(var13, field304);
						var19 = KUSEVGYR.method302(var19);
						arg2.field1371 = var19;
						arg2.field1372 = var11 >> 8;
						arg2.field1387 = var11 & 0xFF;
						arg2.field1364 = 150;

						if (var12 == 2 || var12 == 3) {
							method106("@cr2@" + arg2.field734, var19, 1);
						} else if (var12 == 1) {
							method106("@cr1@" + arg2.field734, var19, 1);
						} else {
							method106(arg2.field734, var19, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field965 = var13 + var14;
		}

		if ((arg1 & 0x10) != 0) {
			arg2.field1373 = arg3.method351();
			arg2.field1374 = arg3.method376();
		}

		if ((arg1 & 0x200) != 0) {
			int var21 = arg3.method367();
			int var22 = arg3.method367();
			arg2.method546(var21, field453, var22);
			arg2.field1388 = field453 + 300;
			arg2.field1389 = arg3.method368();
			arg2.field1390 = arg3.method369();
		}

		if ((arg1 & 0x80) != 0) {
			arg2.field1371 = arg3.method356();
			if (arg2.field1371.charAt(0) == '~') {
				arg2.field1371 = arg2.field1371.substring(1);
				method106(arg2.field734, arg2.field1371, 2);
			} else if (field398 == arg2) {
				method106(arg2.field734, arg2.field1371, 2);
			}

			arg2.field1372 = 0;
			arg2.field1387 = 0;
			arg2.field1364 = 150;
		}

		if ((arg1 & 0x1) != 0) {
			int var23 = arg3.method368();
			byte[] var24 = new byte[var23];
			NHEPCMLW var25 = new NHEPCMLW(var24);
			arg3.method386(0, var24, var23);
			field354[arg0] = var25;
			arg2.method252(var25);
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method114(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field439; var2++) {
			if (arg0.equalsIgnoreCase(field94[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field398.field734)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method115() {
		if (field276 != 0) {
			GCURPWTI var1 = field383;
			int var2 = 0;
			if (field336 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field43[var3] != null) {
					int var4 = field41[var3];
					String var5 = field42[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field172 == 0 || field172 == 1 && method114(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method216("From", var8, var7, 0);
						var1.method216("From", var8, var7 - 1, 0xFFFF);
						int var11 = var8 + var1.method214("From ");
						if (var6 == 1) {
							field367[0].method442(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field367[1].method442(var11, var7 - 12);
							var11 += 14;
						}

						var1.method216(var5 + ": " + field43[var3], var11, var7, 0);
						var1.method216(var5 + ": " + field43[var3], var11, var7 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field172 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method216(field43[var3], 4, var9, 0);
						var1.method216(field43[var3], 4, var9 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field172 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method216("To " + var5 + ": " + field43[var3], 4, var10, 0);
						var1.method216("To " + var5 + ": " + field43[var3], 4, var10 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method116() {
		method32(20, "Starting up");

		if (signlink.sunjava) {
			field469 = 5;
		}

		if (field236) {
			field318 = true;
		} else {
			field236 = true;
			boolean var1 = false;
			String var2 = method100();
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

			if (var2.endsWith("192.168.1.224")) {
				var1 = true;
			}

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field85[var3] = new XGQETHKV(signlink.cache_idx[var3], var3 + 1, signlink.cache_dat, 500000);
					}
				}

				try {
					method146();
					field254 = method73(field322[1], 1, "title screen", "title", 25);
					field382 = new GCURPWTI(field254, false, "p11_full");
					field383 = new GCURPWTI(field254, false, "p12_full");
					field384 = new GCURPWTI(field254, false, "b12_full");
					field385 = new GCURPWTI(field254, true, "q8_full");
					method56();
					method141();
					INOFEYKQ var4 = method73(field322[2], 2, "config", "config", 30);
					INOFEYKQ var5 = method73(field322[3], 3, "interface", "interface", 35);
					INOFEYKQ var6 = method73(field322[4], 4, "2d graphics", "media", 40);
					INOFEYKQ var7 = method73(field322[6], 6, "textures", "textures", 45);
					INOFEYKQ var8 = method73(field322[7], 7, "chat system", "wordenc", 50);
					INOFEYKQ var9 = method73(field322[8], 8, "sound effects", "sounds", 55);
					field308 = new byte[4][104][104];
					field91 = new int[4][105][105];
					field113 = new TEXKPKZX(4, field91, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field194[var10] = new EAREBDMK(104, 104);
					}

					field186 = new ZWUMKFUX(512, 512);
					INOFEYKQ var11 = method73(field322[5], 5, "update list", "versionlist", 60);
					method32(60, "Connecting to update server");
					field36 = new VNVHYJAS();
					field36.method515(var11, this);
					KDJQGGIG.method281(field36.method516());
					CSGBDGDY.method157(field36.method533(0), field36);

					if (!field418) {
						field148 = 0;
						try {
							field148 = Integer.parseInt(getParameter("music"));
						} catch (Exception var72) {
						}

						field149 = true;
						field36.method532(2, field148);

						while (field36.method529() > 0) {
							method147();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field36.field1314 > 3) {
								method18("ondemand");
								return;
							}
						}
					}

					method32(65, "Requesting animations");
					int var12 = field36.method533(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field36.method532(1, var13);
					}

					while (field36.method529() > 0) {
						int var14 = var12 - field36.method529();
						if (var14 > 0) {
							method32(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method147();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field36.field1314 > 3) {
							method18("ondemand");
							return;
						}
					}

					method32(70, "Requesting models");
					int var15 = field36.method533(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field36.method524(var16);
						if ((var17 & 0x1) != 0) {
							field36.method532(0, var16);
						}
					}

					int var18 = field36.method529();
					while (field36.method529() > 0) {
						int var19 = var18 - field36.method529();
						if (var19 > 0) {
							method32(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method147();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field85[0] != null) {
						method32(75, "Requesting maps");
						field36.method532(3, field36.method520(47, 48, 0));
						field36.method532(3, field36.method520(47, 48, 1));
						field36.method532(3, field36.method520(48, 48, 0));
						field36.method532(3, field36.method520(48, 48, 1));
						field36.method532(3, field36.method520(49, 48, 0));
						field36.method532(3, field36.method520(49, 48, 1));
						field36.method532(3, field36.method520(47, 47, 0));
						field36.method532(3, field36.method520(47, 47, 1));
						field36.method532(3, field36.method520(48, 47, 0));
						field36.method532(3, field36.method520(48, 47, 1));
						field36.method532(3, field36.method520(48, 148, 0));
						field36.method532(3, field36.method520(48, 148, 1));
						int var20 = field36.method529();
						while (field36.method529() > 0) {
							int var21 = var20 - field36.method529();
							if (var21 > 0) {
								method32(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method147();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field36.method533(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field36.method524(var23);
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
							field36.method522(0, var23, var25);
						}
					}

					field36.method517(field417);

					if (!field418) {
						int var26 = field36.method533(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field36.method514(var27)) {
								field36.method522(2, var27, (byte) 1);
							}
						}
					}

					method32(80, "Unpacking media");
					field344 = new RZWMPYWU(var6, "invback", 0);
					field346 = new RZWMPYWU(var6, "chatback", 0);
					field345 = new RZWMPYWU(var6, "mapback", 0);
					field300 = new RZWMPYWU(var6, "backbase1", 0);
					field301 = new RZWMPYWU(var6, "backbase2", 0);
					field302 = new RZWMPYWU(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field38[var28] = new RZWMPYWU(var6, "sideicons", var28);
					}

					field412 = new ZWUMKFUX(var6, "compass", 0);
					field294 = new ZWUMKFUX(var6, "mapedge", 0);
					field294.method591();

					for (int var29 = 0; var29 < 72; var29++) {
						field464[var29] = new RZWMPYWU(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field299[var30] = new ZWUMKFUX(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field445[var31] = new ZWUMKFUX(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field273[var32] = new ZWUMKFUX(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field98[var33] = new ZWUMKFUX(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field355[var34] = new ZWUMKFUX(var6, "headicons_hint", var34);
					}

					field34 = new ZWUMKFUX(var6, "overlay_multiway", 0);
					field285 = new ZWUMKFUX(var6, "mapmarker", 0);
					field286 = new ZWUMKFUX(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field463[var35] = new ZWUMKFUX(var6, "cross", var35);
					}

					field447 = new ZWUMKFUX(var6, "mapdots", 0);
					field448 = new ZWUMKFUX(var6, "mapdots", 1);
					field449 = new ZWUMKFUX(var6, "mapdots", 2);
					field450 = new ZWUMKFUX(var6, "mapdots", 3);
					field451 = new ZWUMKFUX(var6, "mapdots", 4);
					field44 = new RZWMPYWU(var6, "scrollbar", 0);
					field45 = new RZWMPYWU(var6, "scrollbar", 1);
					field370 = new RZWMPYWU(var6, "redstone1", 0);
					field371 = new RZWMPYWU(var6, "redstone2", 0);
					field372 = new RZWMPYWU(var6, "redstone3", 0);
					field373 = new RZWMPYWU(var6, "redstone1", 0);
					field373.method439();
					field374 = new RZWMPYWU(var6, "redstone2", 0);
					field374.method439();
					field179 = new RZWMPYWU(var6, "redstone1", 0);
					field179.method440();
					field180 = new RZWMPYWU(var6, "redstone2", 0);
					field180.method440();
					field181 = new RZWMPYWU(var6, "redstone3", 0);
					field181.method440();
					field182 = new RZWMPYWU(var6, "redstone1", 0);
					field182.method439();
					field182.method440();
					field183 = new RZWMPYWU(var6, "redstone2", 0);
					field183.method439();
					field183.method440();

					for (int var36 = 0; var36 < 2; var36++) {
						field367[var36] = new RZWMPYWU(var6, "mod_icons", var36);
					}

					ZWUMKFUX var37 = new ZWUMKFUX(var6, "backleft1", 0);
					field454 = new VOQVBLJN(var37.field1507, var37.field1506, method92());
					var37.method592(0, 0);
					ZWUMKFUX var38 = new ZWUMKFUX(var6, "backleft2", 0);
					field455 = new VOQVBLJN(var38.field1507, var38.field1506, method92());
					var38.method592(0, 0);
					ZWUMKFUX var39 = new ZWUMKFUX(var6, "backright1", 0);
					field456 = new VOQVBLJN(var39.field1507, var39.field1506, method92());
					var39.method592(0, 0);
					ZWUMKFUX var40 = new ZWUMKFUX(var6, "backright2", 0);
					field457 = new VOQVBLJN(var40.field1507, var40.field1506, method92());
					var40.method592(0, 0);
					ZWUMKFUX var41 = new ZWUMKFUX(var6, "backtop1", 0);
					field458 = new VOQVBLJN(var41.field1507, var41.field1506, method92());
					var41.method592(0, 0);
					ZWUMKFUX var42 = new ZWUMKFUX(var6, "backvmid1", 0);
					field459 = new VOQVBLJN(var42.field1507, var42.field1506, method92());
					var42.method592(0, 0);
					ZWUMKFUX var43 = new ZWUMKFUX(var6, "backvmid2", 0);
					field460 = new VOQVBLJN(var43.field1507, var43.field1506, method92());
					var43.method592(0, 0);
					ZWUMKFUX var44 = new ZWUMKFUX(var6, "backvmid3", 0);
					field461 = new VOQVBLJN(var44.field1507, var44.field1506, method92());
					var44.method592(0, 0);
					ZWUMKFUX var45 = new ZWUMKFUX(var6, "backhmid2", 0);
					field462 = new VOQVBLJN(var45.field1507, var45.field1506, method92());
					var45.method592(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field299[var50] != null) {
							field299[var50].method590(var46 + var49, var48 + var49, var47 + var49);
						}

						if (field464[var50] != null) {
							field464[var50].method441(var46 + var49, var48 + var49, var47 + var49);
						}
					}

					method32(83, "Unpacking textures");
					YFTZFAFG.method561(var7);
					YFTZFAFG.method565(0.8D);
					YFTZFAFG.method560(20);
					method32(86, "Unpacking config");
					PNPNYEVW.method426(var4);
					NRKXAGEB.method402(var4);
					UMMMVDGS.method510(var4);
					HVTLSJTR.method255(var4);
					GALAVQEJ.method210(var4);
					RPRWOACX.method431(var4);
					FXNZCBPL.method200(var4);
					LZWYDZNA.method334(var4);
					OHEMVFER.method419(var4);
					HVTLSJTR.field786 = field417;

					if (!field418) {
						method32(90, "Unpacking sounds");
						byte[] var51 = var9.method277("sounds.dat", null);
						NHEPCMLW var52 = new NHEPCMLW(var51);
						KTPZRJZJ.method286(var52);
					}

					method32(95, "Unpacking interfaces");
					GCURPWTI[] var53 = new GCURPWTI[] { field382, field383, field384, field385 };
					HZINZKXF.method274(var6, var53, var5);
					method32(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field345.field1179[field345.field1181 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field381[var54] = var55;
						field369[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field345.field1179[field345.field1181 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field157[var58 - 5] = var59 - 25;
						field116[var58 - 5] = var60 - var59;
					}

					YFTZFAFG.method558(503, 765);
					field50 = YFTZFAFG.field1440;
					YFTZFAFG.method558(96, 479);
					field47 = YFTZFAFG.field1440;
					YFTZFAFG.method558(261, 190);
					field48 = YFTZFAFG.field1440;
					YFTZFAFG.method558(334, 512);
					field49 = YFTZFAFG.field1440;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = YFTZFAFG.field1438[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					TEXKPKZX.method485(334, 512, 500, 800, var62);
					KUSEVGYR.method292(var8);
					field65 = new LZVLFSBA(this);
					method74(field65, 10);
					DYEBQOMK.field600 = this;
					NRKXAGEB.field989 = this;
					GALAVQEJ.field645 = this;
				} catch (Exception var73) {
					signlink.reporterror("loaderror " + field335 + " " + field32);
					field205 = true;
				}
			} else {
				field169 = true;
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method117() {
		field164.method535();
		YFTZFAFG.field1440 = field48;
		field344.method442(0, 0);

		if (field376 != -1) {
			method13(0, 0, HZINZKXF.method269(field376), 0);
		} else if (field222[field189] != -1) {
			method13(0, 0, HZINZKXF.method269(field222[field189]), 0);
		}

		if (field132 && field99 == 1) {
			method108();
		}

		field164.method536(553, 205, field475);
		field166.method535();
		YFTZFAFG.field1440 = field49;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method118() {
		field238++;
		method14(true);
		method53(true);
		method14(false);
		method53(false);
		method27();
		method102();

		if (!field342) {
			int var1 = field290;
			if (field131 / 256 > var1) {
				var1 = field131 / 256;
			}

			if (field378[4] && field251[4] + 128 > var1) {
				var1 = field251[4] + 128;
			}

			int var2 = field291 + field105 & 0x7FF;
			method135(var1 * 3 + 600, field311, method52(field83, field398.field1406, field398.field1405) - 50, var2, var1, field310);
			field75++;
			if (field75 > 70) {
				field75 = 0;
				field328.method338(235);
			}
		}

		int var3;
		if (field342) {
			var3 = method48();
		} else {
			var3 = method47();
		}

		int var4 = field58;
		int var5 = field59;
		int var6 = field60;
		int var7 = field61;
		int var8 = field62;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field378[var9]) {
				int var10 = (int) (Math.random() * (field289[var9] * 2 + 1) + Math.sin(field399[var9] / 100.0D * field343[var9]) * field251[var9] - field289[var9]);
				if (var9 == 0) {
					field58 += var10;
				}

				if (var9 == 1) {
					field59 += var10;
				}

				if (var9 == 2) {
					field60 += var10;
				}

				if (var9 == 3) {
					field62 = field62 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field61 += var10;
					if (field61 < 128) {
						field61 = 128;
					}

					if (field61 > 383) {
						field61 = 383;
					}
				}
			}
		}

		int var11 = YFTZFAFG.field1449;
		CSGBDGDY.field561 = true;
		CSGBDGDY.field564 = 0;
		CSGBDGDY.field562 = field483 - 4;
		CSGBDGDY.field563 = field484 - 4;
		NQLGXPRA.method391();
		field113.method488(field62, field60, field61, field59, var3, field58);
		field113.method463();
		method80();
		method137();
		method96(var11);
		method93();
		field166.method536(4, 4, field475);
		field58 = var4;
		field59 = var5;
		field60 = var6;
		field61 = var7;
		field62 = var8;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method119() {
		int var1 = field384.method214("Choose Option");
		for (int var2 = 0; var2 < field466; var2++) {
			int var3 = field384.method214(field146[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field466 * 15 + 21;
		if (field490 > 4 && field491 > 4 && field490 < 516 && field491 < 338) {
			int var5 = field490 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field491 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field132 = true;
			field99 = 0;
			field100 = var5;
			field101 = var6;
			field102 = var1;
			field103 = field466 * 15 + 22;
		}

		if (field490 > 553 && field491 > 205 && field490 < 743 && field491 < 466) {
			int var7 = field490 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field491 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field132 = true;
			field99 = 1;
			field100 = var7;
			field101 = var8;
			field102 = var1;
			field103 = field466 * 15 + 22;
		}

		if (field490 > 17 && field491 > 357 && field490 < 496 && field491 < 453) {
			int var9 = field490 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field491 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field132 = true;
			field99 = 2;
			field100 = var9;
			field101 = var10;
			field102 = var1;
			field103 = field466 * 15 + 22;
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method120(int arg0, int arg1) {
		OCPYCLUF var3 = field226[field83][arg0][arg1];
		if (var3 == null) {
			field113.method470(field83, arg0, arg1);
		} else {
			int var4 = -99999999;
			FIJVWXBZ var5 = null;
			for (FIJVWXBZ var6 = (FIJVWXBZ) var3.method414(); var6 != null; var6 = (FIJVWXBZ) var3.method416()) {
				HVTLSJTR var7 = HVTLSJTR.method254(var6.field617);
				int var8 = var7.field749;
				if (var7.field787) {
					var8 = (var6.field616 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method412(var5);
			FIJVWXBZ var9 = null;
			FIJVWXBZ var10 = null;
			for (FIJVWXBZ var11 = (FIJVWXBZ) var3.method414(); var11 != null; var11 = (FIJVWXBZ) var3.method416()) {
				if (var5.field617 != var11.field617 && var9 == null) {
					var9 = var11;
				}

				if (var5.field617 != var11.field617 && var9.field617 != var11.field617 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field113.method456(var12, arg0, field83, method52(field83, arg1 * 128 + 64, arg0 * 128 + 64), var9, var10, var5, arg1);
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method121(int arg0) {
		HZINZKXF.method267(arg0);
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method122() {
		field56 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field309[var1] = -1;
			for (int var2 = 0; var2 < RPRWOACX.field1171; var2++) {
				if (!RPRWOACX.field1172[var2].field1178 && RPRWOACX.field1172[var2].field1173 == var1 + (field272 ? 0 : 7)) {
					field309[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZI)Z")
	public final boolean method123(int arg0, int arg1) {
		boolean var3 = false;
		HZINZKXF var4 = HZINZKXF.method269(arg0);
		for (int var5 = 0; var5 < var4.field846.length && var4.field846[var5] != -1; var5++) {
			HZINZKXF var6 = HZINZKXF.method269(var4.field846[var5]);
			if (var6.field792 == 1) {
				var3 |= method123(var6.field796, arg1);
			}

			if (var6.field792 == 6 && (var6.field808 != -1 || var6.field809 != -1)) {
				boolean var7 = method99(var6);
				int var8;
				if (var7) {
					var8 = var6.field809;
				} else {
					var8 = var6.field808;
				}

				if (var8 != -1) {
					PNPNYEVW var9 = PNPNYEVW.field1058[var8];
					var6.field804 += arg1;
					while (var6.field804 > var9.method427(var6.field835)) {
						var6.field804 -= var9.method427(var6.field835) + 1;
						var6.field835++;
						if (var6.field835 >= var9.field1059) {
							var6.field835 -= var9.field1063;
							if (var6.field835 < 0 || var6.field835 >= var9.field1059) {
								var6.field835 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field792 == 6 && var6.field799 != 0) {
				int var10 = var6.field799 >> 16;
				int var11 = var6.field799 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field831 = var6.field831 + var10 & 0x7FF;
				var6.field832 = var6.field832 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method124() {
		field240 = 0;
		int var1 = (field398.field1405 >> 7) + field256;
		int var2 = (field398.field1406 >> 7) + field257;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field240 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field240 = 1;
		}

		if (field240 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field240 = 0;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public static final void method125() {
		TEXKPKZX.field1212 = false;
		YFTZFAFG.field1429 = false;
		field418 = false;
		GSYZIGPZ.field682 = false;
		NRKXAGEB.field999 = false;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method126() {
		if (field244 == 0) {
			field146[0] = "Cancel";
			field208[0] = 1400;
			field466 = 1;
			if (field173 == -1) {
				method43();
				field334 = 0;
				field324 = 0;

				if (field483 > 4 && field484 > 4 && field483 < 516 && field484 < 338) {
					if (field278 == -1) {
						method35();
					} else {
						method87(field483, 4, HZINZKXF.method269(field278), 4, field484, 0, 0);
					}
				}

				if (field79 != field334) {
					field79 = field334;
				}

				if (field391 != field324) {
					field391 = field324;
				}

				field334 = 0;
				field324 = 0;

				if (field483 > 553 && field484 > 205 && field483 < 743 && field484 < 466) {
					if (field376 != -1) {
						method87(field483, 205, HZINZKXF.method269(field376), 553, field484, 0, 1);
					} else if (field222[field189] != -1) {
						method87(field483, 205, HZINZKXF.method269(field222[field189]), 553, field484, 0, 1);
					}
				}

				if (field334 != field129) {
					field118 = true;
					field129 = field334;
				}

				if (field324 != field261) {
					field118 = true;
					field261 = field324;
				}

				field334 = 0;
				field324 = 0;

				if (field483 > 17 && field484 > 357 && field483 < 496 && field484 < 453) {
					if (field303 != -1) {
						method87(field483, 357, HZINZKXF.method269(field303), 17, field484, 0, 2);
					} else if (field134 != -1) {
						method87(field483, 357, HZINZKXF.method269(field134), 17, field484, 0, 3);
					} else if (field484 < 434 && field483 < 426) {
						method127(field484 - 357, field483 - 17);
					}
				}

				if ((field303 != -1 || field134 != -1) && field341 != field334) {
					field232 = true;
					field341 = field334;
				}

				if ((field303 != -1 || field134 != -1) && field324 != field219) {
					field232 = true;
					field219 = field324;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field466 - 1; var2++) {
						if (field208[var2] < 1000 && field208[var2 + 1] > 1000) {
							String var3 = field146[var2];
							field146[var2] = field146[var2 + 1];
							field146[var2 + 1] = var3;
							int var4 = field208[var2];
							field208[var2] = field208[var2 + 1];
							field208[var2 + 1] = var4;
							int var5 = field206[var2];
							field206[var2] = field206[var2 + 1];
							field206[var2 + 1] = var5;
							int var6 = field207[var2];
							field207[var2] = field207[var2 + 1];
							field207[var2 + 1] = var6;
							int var7 = field209[var2];
							field209[var2] = field209[var2 + 1];
							field209[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field334 = 0;
				field324 = 0;
				method87(field483, 0, HZINZKXF.method269(field173), 0, field484, 0, 0);

				if (field79 != field334) {
					field79 = field334;
				}

				if (field391 != field324) {
					field391 = field324;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)V")
	public final void method127(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field43[var4] != null) {
				int var5 = field41[var4];
				int var6 = field237 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field42[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field198 == 0 || field198 == 1 && method114(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field398.field734)) {
						if (field81 >= 1) {
							field146[field466] = "Report abuse @whi@" + var7;
							field208[field466] = 345;
							field466++;
						}

						field146[field466] = "Add ignore @whi@" + var7;
						field208[field466] = 648;
						field466++;
						field146[field466] = "Add friend @whi@" + var7;
						field208[field466] = 918;
						field466++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field276 == 0 && (var5 == 7 || field172 == 0 || field172 == 1 && method114(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field81 >= 1) {
							field146[field466] = "Report abuse @whi@" + var7;
							field208[field466] = 345;
							field466++;
						}

						field146[field466] = "Add ignore @whi@" + var7;
						field208[field466] = 648;
						field466++;
						field146[field466] = "Add friend @whi@" + var7;
						field208[field466] = 918;
						field466++;
					}

					var3++;
				}

				if (var5 == 4 && (field156 == 0 || field156 == 1 && method114(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field146[field466] = "Accept trade @whi@" + var7;
						field208[field466] = 124;
						field466++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field276 == 0 && field172 < 2) {
					var3++;
				}

				if (var5 == 8 && (field156 == 0 || field156 == 1 && method114(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field146[field466] = "Accept challenge @whi@" + var7;
						field208[field466] = 475;
						field466++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method128(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field113.method479(field83, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			NRKXAGEB var8 = NRKXAGEB.method400(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field987;
				var10 = var8.field1017;
			} else {
				var9 = var8.field1017;
				var10 = var8.field987;
			}

			int var11 = var8.field1025;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method6(0, arg1, field398.field1366[0], false, var11, 0, 2, arg0, var9, field398.field1365[0], var10);
		} else {
			method6(var6 + 1, arg1, field398.field1366[0], false, 0, var7, 2, arg0, 0, field398.field1365[0], 0);
		}

		field51 = field490;
		field52 = field491;
		field54 = 2;
		field53 = 0;
		return true;
	}

	@ObfuscatedName("client.a(LNHEPCMLW;II)V")
	public final void method129(NHEPCMLW arg0, int arg1) {
		if (arg1 == 255) {
			int var3 = arg0.method376();
			int var4 = arg0.method367();
			int var5 = (var4 >> 4 & 0x7) + field280;
			int var6 = (var4 & 0x7) + field281;
			int var7 = arg0.method367();
			int var8 = var7 >> 2;
			int var9 = var7 & 0x3;
			int var10 = field323[var8];
			if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
				int var11 = field91[field83][var5][var6];
				int var12 = field91[field83][var5 + 1][var6];
				int var13 = field91[field83][var5 + 1][var6 + 1];
				int var14 = field91[field83][var5][var6 + 1];
				if (var10 == 0) {
					ZWNFLEQK var15 = field113.method471(field83, var6, var5);
					if (var15 != null) {
						int var16 = var15.field1503 >> 14 & 0x7FFF;
						if (var8 == 2) {
							var15.field1501 = new DYEBQOMK(var11, var3, false, var14, var13, var9 + 4, 2, var12, var16);
							var15.field1502 = new DYEBQOMK(var11, var3, false, var14, var13, var9 + 1 & 0x3, 2, var12, var16);
						} else {
							var15.field1501 = new DYEBQOMK(var11, var3, false, var14, var13, var9, var8, var12, var16);
						}
					}
				}

				if (var10 == 1) {
					JELBJPLJ var17 = field113.method472(field83, var5, var6);
					if (var17 != null) {
						var17.field881 = new DYEBQOMK(var11, var3, false, var14, var13, 0, 4, var12, var17.field882 >> 14 & 0x7FFF);
					}
				}

				if (var10 == 2) {
					LEFFCHBD var18 = field113.method473(field83, var5, var6);

					if (var8 == 11) {
						var8 = 10;
					}

					if (var18 != null) {
						var18.field920 = new DYEBQOMK(var11, var3, false, var14, var13, var9, var8, var12, var18.field928 >> 14 & 0x7FFF);
					}
				}

				if (var10 == 3) {
					MIDOWTYU var19 = field113.method474(var5, field83, var6);
					if (var19 != null) {
						var19.field958 = new DYEBQOMK(var11, var3, false, var14, var13, var9, 22, var12, var19.field959 >> 14 & 0x7FFF);
					}
				}
			}
		} else if (arg1 == 203) {
			int var20 = arg0.method369();
			int var21 = (var20 >> 4 & 0x7) + field280;
			int var22 = (var20 & 0x7) + field281;
			int var23 = arg0.method351();
			if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
				OCPYCLUF var24 = field226[field83][var21][var22];
				if (var24 != null) {
					for (FIJVWXBZ var25 = (FIJVWXBZ) var24.method414(); var25 != null; var25 = (FIJVWXBZ) var24.method416()) {
						if ((var23 & 0x7FFF) == var25.field617) {
							var25.method336();
							break;
						}
					}

					if (var24.method414() == null) {
						field226[field83][var21][var22] = null;
					}

					method120(var21, var22);
				}
			}
		} else {
			if (arg1 == 10) {
				int var26 = arg0.method349();
				int var27 = (var26 >> 4 & 0x7) + field280;
				int var28 = (var26 & 0x7) + field281;
				int var29 = arg0.method351();
				int var30 = arg0.method349();
				int var31 = var30 >> 4 & 0xF;
				int var32 = var30 & 0x7;
				if (field398.field1365[0] >= var27 - var31 && field398.field1365[0] <= var27 + var31 && field398.field1366[0] >= var28 - var31 && field398.field1366[0] <= var28 + var31 && field218 && !field418 && field340 < 50) {
					field89[field340] = var29;
					field389[field340] = var32;
					field176[field340] = KTPZRJZJ.field901[var29];
					field340++;
				}
			}

			if (arg1 == 150) {
				int var33 = arg0.method375();
				int var34 = arg0.method376();
				int var35 = arg0.method349();
				int var36 = (var35 >> 4 & 0x7) + field280;
				int var37 = (var35 & 0x7) + field281;
				if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
					FIJVWXBZ var38 = new FIJVWXBZ();
					var38.field617 = var34;
					var38.field616 = var33;

					if (field226[field83][var36][var37] == null) {
						field226[field83][var36][var37] = new OCPYCLUF();
					}

					field226[field83][var36][var37].method411(var38);
					method120(var36, var37);
				}
			} else if (arg1 == 75) {
				int var39 = arg0.method349();
				int var40 = (var39 >> 4 & 0x7) + field280;
				int var41 = (var39 & 0x7) + field281;
				int var42 = arg0.method351();
				int var43 = arg0.method349();
				int var44 = arg0.method351();
				if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
					var40 = var40 * 128 + 64;
					var41 = var41 * 128 + 64;
					ZJEEQISS var45 = new ZJEEQISS(field83, var40, field453, var42, method52(field83, var41, var40) - var43, var44, var41);
					field297.method411(var45);
				}
			} else if (arg1 == 42) {
				int var46 = arg0.method349();
				int var47 = (var46 >> 4 & 0x7) + field280;
				int var48 = (var46 & 0x7) + field281;
				int var49 = arg0.method351();
				int var50 = arg0.method351();
				int var51 = arg0.method351();
				if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
					OCPYCLUF var52 = field226[field83][var47][var48];
					if (var52 != null) {
						for (FIJVWXBZ var53 = (FIJVWXBZ) var52.method414(); var53 != null; var53 = (FIJVWXBZ) var52.method416()) {
							if ((var49 & 0x7FFF) == var53.field617 && var53.field616 == var50) {
								var53.field616 = var51;
								break;
							}
						}

						method120(var47, var48);
					}
				}
			} else {
				if (arg1 == 200) {
					byte var54 = arg0.method350();
					byte var55 = arg0.method370();
					int var56 = arg0.method367();
					int var57 = var56 >> 2;
					int var58 = var56 & 0x3;
					int var59 = field323[var57];
					byte var60 = arg0.method371();
					int var61 = arg0.method351();
					byte var62 = arg0.method370();
					int var63 = arg0.method351();
					int var64 = arg0.method376();
					int var65 = arg0.method377();
					int var66 = arg0.method368();
					int var67 = (var66 >> 4 & 0x7) + field280;
					int var68 = (var66 & 0x7) + field281;
					HDYGEGXY var69;
					if (field421 == var63) {
						var69 = field398;
					} else {
						var69 = field349[var63];
					}

					if (var69 != null) {
						NRKXAGEB var70 = NRKXAGEB.method400(var64);
						int var71 = field91[field83][var67][var68];
						int var72 = field91[field83][var67 + 1][var68];
						int var73 = field91[field83][var67 + 1][var68 + 1];
						int var74 = field91[field83][var67][var68 + 1];
						CSGBDGDY var75 = var70.method408(var57, var58, var71, var72, var73, var74, -1);
						if (var75 != null) {
							method97(var68, field83, -1, var59, 0, var61 + 1, var67, 0, var65 + 1);
							var69.field720 = field453 + var65;
							var69.field721 = field453 + var61;
							var69.field730 = var75;
							int var76 = var70.field987;
							int var77 = var70.field1017;
							if (var58 == 1 || var58 == 3) {
								var76 = var70.field1017;
								var77 = var70.field987;
							}

							var69.field727 = var67 * 128 + var76 * 64;
							var69.field729 = var68 * 128 + var77 * 64;
							var69.field728 = method52(field83, var69.field729, var69.field727);

							if (var62 > var55) {
								byte var78 = var62;
								var62 = var55;
								var55 = var78;
							}

							if (var60 > var54) {
								byte var79 = var60;
								var60 = var54;
								var54 = var79;
							}

							var69.field735 = var62 + var67;
							var69.field737 = var55 + var67;
							var69.field736 = var60 + var68;
							var69.field738 = var54 + var68;
						}
					}
				}

				if (arg1 == 238) {
					int var80 = arg0.method349();
					int var81 = (var80 >> 4 & 0x7) + field280;
					int var82 = (var80 & 0x7) + field281;
					int var83 = var81 + arg0.method350();
					int var84 = var82 + arg0.method350();
					int var85 = arg0.method352();
					int var86 = arg0.method351();
					int var87 = arg0.method349() * 4;
					int var88 = arg0.method349() * 4;
					int var89 = arg0.method351();
					int var90 = arg0.method351();
					int var91 = arg0.method349();
					int var92 = arg0.method349();
					if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var86 != 0xFFFF) {
						var81 = var81 * 128 + 64;
						var82 = var82 * 128 + 64;
						var83 = var83 * 128 + 64;
						var84 = var84 * 128 + 64;
						PXEWTQHA var93 = new PXEWTQHA(var82, var81, field453 + var90, field453 + var89, var85, field83, method52(field83, var82, var81) - var87, var86, var92, var88, var91);
						var93.method429(method52(field83, var84, var83) - var88, var83, var84, field453 + var89);
						field465.method411(var93);
					}
				} else if (arg1 == 241) {
					int var94 = arg0.method368();
					int var95 = (var94 >> 4 & 0x7) + field280;
					int var96 = (var94 & 0x7) + field281;
					int var97 = arg0.method376();
					int var98 = arg0.method368();
					int var99 = var98 >> 2;
					int var100 = var98 & 0x3;
					int var101 = field323[var99];
					if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
						method97(var96, field83, var97, var101, var100, -1, var95, var99, 0);
					}
				} else if (arg1 == 116) {
					int var102 = arg0.method376();
					int var103 = arg0.method377();
					int var104 = arg0.method349();
					int var105 = (var104 >> 4 & 0x7) + field280;
					int var106 = (var104 & 0x7) + field281;
					int var107 = arg0.method375();
					if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && field421 != var102) {
						FIJVWXBZ var108 = new FIJVWXBZ();
						var108.field617 = var107;
						var108.field616 = var103;

						if (field226[field83][var105][var106] == null) {
							field226[field83][var105][var106] = new OCPYCLUF();
						}

						field226[field83][var105][var106].method411(var108);
						method120(var105, var106);
					}
				} else if (arg1 == 2) {
					int var109 = arg0.method369();
					int var110 = (var109 >> 4 & 0x7) + field280;
					int var111 = (var109 & 0x7) + field281;
					int var112 = arg0.method367();
					int var113 = var112 >> 2;
					int var114 = var112 & 0x3;
					int var115 = field323[var113];
					if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
						method97(var111, field83, -1, var115, var114, -1, var110, var113, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method130() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field196[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field196[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field197[var10] = (field196[var10 - 1] + field196[var10 + 1] + field196[var10 - 128] + field196[var10 + 128]) / 4;
			}
		}

		field358 += 128;
		if (field358 > field210.length) {
			field358 -= field210.length;
			int var11 = (int) (Math.random() * 12.0D);
			method30(field298[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field197[var14 + 128] - field210[field358 + var14 & field210.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field196[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field213[var16] = field213[var16 + 1];
		}

		field213[var1 - 1] = (int) (Math.sin(field453 / 14.0D) * 16.0D + Math.sin(field453 / 15.0D) * 14.0D + Math.sin(field453 / 16.0D) * 12.0D);

		if (field265 > 0) {
			field265 -= 4;
		}

		if (field266 > 0) {
			field266 -= 4;
		}

		if (field265 == 0 && field266 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field265 = 1024;
			}

			if (var17 == 1) {
				field266 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIBLZWUMKFUX;)V")
	public final void method131(int arg0, int arg1, ZWUMKFUX arg2) {
		int var4 = field291 + field274 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = CSGBDGDY.field566[var4];
			int var7 = CSGBDGDY.field567[var4];
			var6 = var6 * 256 / (field267 + 256);
			var7 = var7 * 256 / (field267 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method600(var8 + 94 + 4 - arg2.field1510 / 2, 83 - var9 - arg2.field1511 / 2 - 4, field345);
			} else {
				arg2.method594(var8 + 94 + 4 - arg2.field1510 / 2, 83 - var9 - arg2.field1511 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method132() {
		field165.method535();

		if (field216 == 2) {
			byte[] var1 = field345.field1179;
			int[] var2 = NQLGXPRA.field977;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field412.method598(33, 256, field291, 0, field381, 33, field369, 0, 25, 25);
			field166.method535();
			YFTZFAFG.field1440 = field49;
		} else {
			int var5 = field291 + field274 & 0x7FF;
			int var6 = field398.field1405 / 32 + 48;
			int var7 = 464 - field398.field1406 / 32;
			field186.method598(146, field267 + 256, var5, 25, field157, 151, field116, 5, var7, var6);
			field412.method598(33, 256, field291, 0, field381, 33, field369, 0, 25, 25);

			for (int var8 = 0; var8 < field424; var8++) {
				int var9 = field425[var8] * 4 + 2 - field398.field1405 / 32;
				int var10 = field426[var8] * 4 + 2 - field398.field1406 / 32;
				method131(var10, var9, field57[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					OCPYCLUF var13 = field226[field83][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field398.field1405 / 32;
						int var15 = var12 * 4 + 2 - field398.field1406 / 32;
						method131(var15, var14, field447);
					}
				}
			}

			for (int var16 = 0; var16 < field306; var16++) {
				ZLSEKGJR var17 = field305[field307[var16]];
				if (var17 != null && var17.method250()) {
					GALAVQEJ var18 = var17.field1475;
					if (var18.field658 != null) {
						var18 = var18.method206();
					}

					if (var18 != null && var18.field651 && var18.field663) {
						int var19 = var17.field1405 / 32 - field398.field1405 / 32;
						int var20 = var17.field1406 / 32 - field398.field1406 / 32;
						method131(var20, var19, field448);
					}
				}
			}

			for (int var21 = 0; var21 < field350; var21++) {
				HDYGEGXY var22 = field349[field351[var21]];
				if (var22 != null && var22.method250()) {
					int var23 = var22.field1405 / 32 - field398.field1405 / 32;
					int var24 = var22.field1406 / 32 - field398.field1406 / 32;
					boolean var25 = false;
					long var26 = UJPWWGLO.method504(var22.field734);
					for (int var28 = 0; var28 < field439; var28++) {
						if (field80[var28] == var26 && field221[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field398.field731 != 0 && var22.field731 != 0 && field398.field731 == var22.field731) {
						var29 = true;
					}

					if (var25) {
						method131(var24, var23, field450);
					} else if (var29) {
						method131(var24, var23, field451);
					} else {
						method131(var24, var23, field449);
					}
				}
			}

			if (field329 != 0 && field453 % 20 < 10) {
				if (field329 == 1 && field66 >= 0 && field66 < field305.length) {
					ZLSEKGJR var30 = field305[field66];
					if (var30 != null) {
						int var31 = var30.field1405 / 32 - field398.field1405 / 32;
						int var32 = var30.field1406 / 32 - field398.field1406 / 32;
						method16(var32, var31, field286);
					}
				}

				if (field329 == 2) {
					int var33 = (field158 - field256) * 4 + 2 - field398.field1405 / 32;
					int var34 = (field159 - field257) * 4 + 2 - field398.field1406 / 32;
					method16(var34, var33, field286);
				}

				if (field329 == 10 && field97 >= 0 && field97 < field349.length) {
					HDYGEGXY var35 = field349[field97];
					if (var35 != null) {
						int var36 = var35.field1405 / 32 - field398.field1405 / 32;
						int var37 = var35.field1406 / 32 - field398.field1406 / 32;
						method16(var37, var36, field286);
					}
				}
			}

			if (field184 != 0) {
				int var38 = field184 * 4 + 2 - field398.field1405 / 32;
				int var39 = field185 * 4 + 2 - field398.field1406 / 32;
				method131(var39, var38, field285);
			}

			NQLGXPRA.method393(97, 0xFFFFFF, 3, 78, 3);
			field166.method535();
			YFTZFAFG.field1440 = field49;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method133() {
		if (field489 == 1) {
			if (field490 >= 539 && field490 <= 573 && field491 >= 169 && field491 < 205 && field222[0] != -1) {
				field118 = true;
				field189 = 0;
				field241 = true;
			}

			if (field490 >= 569 && field490 <= 599 && field491 >= 168 && field491 < 205 && field222[1] != -1) {
				field118 = true;
				field189 = 1;
				field241 = true;
			}

			if (field490 >= 597 && field490 <= 627 && field491 >= 168 && field491 < 205 && field222[2] != -1) {
				field118 = true;
				field189 = 2;
				field241 = true;
			}

			if (field490 >= 625 && field490 <= 669 && field491 >= 168 && field491 < 203 && field222[3] != -1) {
				field118 = true;
				field189 = 3;
				field241 = true;
			}

			if (field490 >= 666 && field490 <= 696 && field491 >= 168 && field491 < 205 && field222[4] != -1) {
				field118 = true;
				field189 = 4;
				field241 = true;
			}

			if (field490 >= 694 && field490 <= 724 && field491 >= 168 && field491 < 205 && field222[5] != -1) {
				field118 = true;
				field189 = 5;
				field241 = true;
			}

			if (field490 >= 722 && field490 <= 756 && field491 >= 169 && field491 < 205 && field222[6] != -1) {
				field118 = true;
				field189 = 6;
				field241 = true;
			}

			if (field490 >= 540 && field490 <= 574 && field491 >= 466 && field491 < 502 && field222[7] != -1) {
				field118 = true;
				field189 = 7;
				field241 = true;
			}

			if (field490 >= 572 && field490 <= 602 && field491 >= 466 && field491 < 503 && field222[8] != -1) {
				field118 = true;
				field189 = 8;
				field241 = true;
			}

			if (field490 >= 599 && field490 <= 629 && field491 >= 466 && field491 < 503 && field222[9] != -1) {
				field118 = true;
				field189 = 9;
				field241 = true;
			}

			if (field490 >= 627 && field490 <= 671 && field491 >= 467 && field491 < 502 && field222[10] != -1) {
				field118 = true;
				field189 = 10;
				field241 = true;
			}

			if (field490 >= 669 && field490 <= 699 && field491 >= 466 && field491 < 503 && field222[11] != -1) {
				field118 = true;
				field189 = 11;
				field241 = true;
			}

			if (field490 >= 696 && field490 <= 726 && field491 >= 466 && field491 < 503 && field222[12] != -1) {
				field118 = true;
				field189 = 12;
				field241 = true;
			}

			if (field490 >= 724 && field490 <= 758 && field491 >= 466 && field491 < 502 && field222[13] != -1) {
				field118 = true;
				field189 = 13;
				field241 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(LNHEPCMLW;II)V")
	public final void method134(NHEPCMLW arg0, int arg1) {
		field87 = 0;
		field352 = 0;
		method54(arg0, arg1);
		method83(arg1, arg0);
		method77(arg0, arg1);

		for (int var3 = 0; var3 < field87; var3++) {
			int var4 = field88[var3];
			if (field453 != field305[var4].field1367) {
				field305[var4].field1475 = null;
				field305[var4] = null;
			}
		}

		if (arg0.field965 != arg1) {
			signlink.reporterror(field119 + " size mismatch in getnpcpos - pos:" + arg0.field965 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field306; var5++) {
			if (field305[field307[var5]] == null) {
				signlink.reporterror(field119 + " null entry in npc list - pos:" + var5 + " size:" + field306);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = CSGBDGDY.field566[var7];
			int var13 = CSGBDGDY.field567[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = CSGBDGDY.field566[var8];
			int var16 = CSGBDGDY.field567[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field58 = arg5 - var9;
		field59 = arg2 - var10;
		field60 = arg1 - var11;
		field61 = arg4;
		field62 = arg3;
	}

	@ObfuscatedName("client.a(IIILHDYGEGXY;I)V")
	public final void method136(int arg0, int arg1, HDYGEGXY arg2, int arg3) {
		if (field398 != arg2 && field466 < 400) {
			String var5;
			if (arg2.field715 == 0) {
				var5 = arg2.field734 + method5(arg2.field725, field398.field725) + " (level-" + arg2.field725 + ")";
			} else {
				var5 = arg2.field734 + " (skill-" + arg2.field715 + ")";
			}

			if (field431 == 1) {
				field146[field466] = "Use " + field435 + " with @whi@" + var5;
				field208[field466] = 265;
				field209[field466] = arg0;
				field206[field466] = arg3;
				field207[field466] = arg1;
				field466++;
			} else if (field150 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field252[var6] != null) {
						field146[field466] = field252[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field252[var6].equalsIgnoreCase("attack")) {
							if (arg2.field725 > field398.field725) {
								var7 = 2000;
							}

							if (field398.field731 != 0 && arg2.field731 != 0) {
								if (field398.field731 == arg2.field731) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field253[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field208[field466] = var7 + 355;
						}

						if (var6 == 1) {
							field208[field466] = var7 + 518;
						}

						if (var6 == 2) {
							field208[field466] = var7 + 461;
						}

						if (var6 == 3) {
							field208[field466] = var7 + 996;
						}

						if (var6 == 4) {
							field208[field466] = var7 + 408;
						}

						field209[field466] = arg0;
						field206[field466] = arg3;
						field207[field466] = arg1;
						field466++;
					}
				}
			} else if ((field152 & 0x8) == 8) {
				field146[field466] = field153 + " @whi@" + var5;
				field208[field466] = 318;
				field209[field466] = arg0;
				field206[field466] = arg3;
				field207[field466] = arg1;
				field466++;
			}

			for (int var8 = 0; var8 < field466; var8++) {
				if (field208[var8] == 872) {
					field146[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method137() {
		if (field329 == 2) {
			method90((field159 - field257 << 7) + field162, (field158 - field256 << 7) + field161, field160 * 2);

			if (field337 > -1 && field453 % 20 < 10) {
				field355[0].method594(field337 - 12, field338 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method138(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field325 = "";
				field326 = "Connecting to server...";
				method71(true);
			}

			field127 = new YVLAOVKQ(this, method139(field416 + 43594));
			long var4 = UJPWWGLO.method504(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field328.field965 = 0;
			field328.method339(14);
			field328.method339(var6);
			field127.method582(field328.field964, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field127.method579();
			}

			int var8 = field127.method579();
			int var9 = var8;

			if (var8 == 0) {
				field127.method581(field379.field964, 0, 8);
				field379.field965 = 0;
				field133 = field379.method355();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field133 >> 32), (int) field133 };
				field328.field965 = 0;
				field328.method339(10);
				field328.method343(var10[0]);
				field328.method343(var10[1]);
				field328.method343(var10[2]);
				field328.method343(var10[3]);
				field328.method343(signlink.uid);
				field328.method346(arg0);
				field328.method346(arg1);
				field328.method364(field175, field115);
				field225.field965 = 0;

				if (arg2) {
					field225.method339(18);
				} else {
					field225.method339(16);
				}

				field225.method339(field328.field965 + 36 + 1 + 1 + 2);
				field225.method339(255);
				field225.method340(339);
				field225.method339(field418 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field225.method343(field322[var11]);
				}

				field225.method347(field328.field965, field328.field964, 0);
				field328.field969 = new IPEHOOFG(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field317 = new IPEHOOFG(var10);
				field127.method582(field225.field964, field225.field965, 0);
				var8 = field127.method579();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method138(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field81 = field127.method579();
				field438 = field127.method579() == 1;
				field356 = 0L;
				field69 = 0;
				field65.field936 = 0;
				field480 = true;
				field388 = true;
				field366 = true;
				field328.field965 = 0;
				field379.field965 = 0;
				field122 = -1;
				field363 = -1;
				field364 = -1;
				field365 = -1;
				field121 = 0;
				field123 = 0;
				field336 = 0;
				field125 = 0;
				field329 = 0;
				field466 = 0;
				field132 = false;
				field481 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field43[var13] = null;
				}

				field431 = 0;
				field150 = 0;
				field239 = 0;
				field340 = 0;
				field77 = (int) (Math.random() * 100.0D) - 50;
				field436 = (int) (Math.random() * 110.0D) - 55;
				field105 = (int) (Math.random() * 80.0D) - 40;
				field274 = (int) (Math.random() * 120.0D) - 60;
				field267 = (int) (Math.random() * 30.0D) - 20;
				field291 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field216 = 0;
				field35 = -1;
				field184 = 0;
				field185 = 0;
				field350 = 0;
				field306 = 0;

				for (int var14 = 0; var14 < field347; var14++) {
					field349[var14] = null;
					field354[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field305[var15] = null;
				}

				field398 = field349[field348] = new HDYGEGXY();
				field465.method418();
				field297.method418();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field226[var16][var17][var18] = null;
						}
					}
				}

				field359 = new OCPYCLUF();
				field440 = 0;
				field439 = 0;
				method121(field134);
				field134 = -1;
				method121(field303);
				field303 = -1;
				method121(field278);
				field278 = -1;
				method121(field173);
				field173 = -1;
				method121(field419);
				field419 = -1;
				method121(field376);
				field376 = -1;
				method121(field40);
				field40 = -1;
				field163 = false;
				field189 = 3;
				field168 = 0;
				field132 = false;
				field320 = false;
				field390 = null;
				field112 = 0;
				field327 = -1;
				field272 = true;
				method122();

				for (int var19 = 0; var19 < 5; var19++) {
					field212[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field252[var20] = null;
					field253[var20] = false;
				}

				field130 = 0;
				field188 = 0;
				field67 = 0;
				field316 = 0;
				field368 = 0;
				method57();
			} else if (var8 == 3) {
				field325 = "";
				field326 = "Invalid username or password.";
			} else if (var8 == 4) {
				field325 = "Your account has been disabled.";
				field326 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field325 = "Your account is already logged in.";
				field326 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field325 = "RuneScape has been updated!";
				field326 = "Please reload this page.";
			} else if (var8 == 7) {
				field325 = "This world is full.";
				field326 = "Please use a different world.";
			} else if (var8 == 8) {
				field325 = "Unable to connect.";
				field326 = "Login server offline.";
			} else if (var8 == 9) {
				field325 = "Login limit exceeded.";
				field326 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field325 = "Unable to connect.";
				field326 = "Bad session id.";
			} else if (var8 == 11) {
				field325 = "Login server rejected session.";
				field326 = "Please try again.";
			} else if (var8 == 12) {
				field325 = "You need a members account to login to this world.";
				field326 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field325 = "Could not complete login.";
				field326 = "Please try using a different world.";
			} else if (var8 == 14) {
				field325 = "The server is being updated.";
				field326 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field366 = true;
				field328.field965 = 0;
				field379.field965 = 0;
				field122 = -1;
				field363 = -1;
				field364 = -1;
				field365 = -1;
				field121 = 0;
				field123 = 0;
				field336 = 0;
				field466 = 0;
				field132 = false;
				field170 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field325 = "Login attempts exceeded.";
				field326 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field325 = "You are standing in a members-only area.";
				field326 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field325 = "Invalid loginserver requested";
				field326 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field127.method579();
				for (var21 += 3; var21 >= 0; var21--) {
					field325 = "You have only just left another world";
					field326 = "Your profile will be transferred in: " + var21;
					method71(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method138(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field325 = "Malformed login packet.";
				field326 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field325 = "Unexpected server response";
				field326 = "Please try using a different world.";
			} else if (var9 != 0) {
				field325 = "No response from server";
				field326 = "Please try using a different world.";
			} else if (field288 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field288++;
				method138(arg0, arg1, arg2);
			} else {
				field325 = "No response from loginserver";
				field326 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field325 = "";
			field326 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.J(I)Ljava/net/Socket;")
	public final Socket method139(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.g(II)V")
	public final void method140(int arg0) {
		HZINZKXF var2 = HZINZKXF.method269(arg0);
		for (int var3 = 0; var3 < var2.field846.length && var2.field846[var3] != -1; var3++) {
			HZINZKXF var4 = HZINZKXF.method269(var2.field846[var3]);
			if (var4.field792 == 1) {
				method140(var4.field796);
			}

			var4.field835 = 0;
			var4.field804 = 0;
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method141() {
		field386 = new RZWMPYWU(field254, "titlebox", 0);
		field387 = new RZWMPYWU(field254, "titlebutton", 0);
		field298 = new RZWMPYWU[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field298[var2] = new RZWMPYWU(field254, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field298[var3] = new RZWMPYWU(field254, "runes", (var3 & 0x3) + 12);
			}
		}

		field63 = new ZWUMKFUX(128, 265);
		field64 = new ZWUMKFUX(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field63.field1505[var4] = field140.field1348[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field64.field1505[var5] = field141.field1348[var5];
		}

		field442 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field442[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field442[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field442[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field442[var9 + 192] = 0xFFFFFF;
		}

		field443 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field443[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field443[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field443[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field443[var13 + 192] = 0xFFFFFF;
		}

		field444 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field444[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field444[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field444[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field444[var17 + 192] = 0xFFFFFF;
		}

		field441 = new int[256];
		field210 = new int[32768];
		field211 = new int[32768];
		method30(null);
		field196 = new int[32768];
		field197 = new int[32768];
		method32(10, "Connecting to fileserver");

		if (!field380) {
			field192 = true;
			field380 = true;
			method74(this, 2);
		}
	}

	@ObfuscatedName("client.b(ZLHZINZKXF;)V")
	public final void method142(HZINZKXF arg0) {
		int var2 = arg0.field856;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field440 == 0) {
				arg0.field798 = "Loading friend list";
				arg0.field849 = 0;
			} else if (var2 == 1 && field440 == 1) {
				arg0.field798 = "Connecting to friendserver";
				arg0.field849 = 0;
			} else if (var2 == 2 && field440 != 2) {
				arg0.field798 = "Please wait...";
				arg0.field849 = 0;
			} else {
				int var3 = field439;
				if (field440 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field798 = "";
					arg0.field849 = 0;
				} else {
					arg0.field798 = field94[var2];
					arg0.field849 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field439;
			if (field440 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field798 = "";
				arg0.field849 = 0;
			} else {
				if (field221[var2] == 0) {
					arg0.field798 = "@red@Offline";
				} else if (field221[var2] < 200) {
					if (field221[var2] == field415) {
						arg0.field798 = "@gre@World-" + (field221[var2] - 9);
					} else {
						arg0.field798 = "@yel@World-" + (field221[var2] - 9);
					}
				} else if (field221[var2] == field415) {
					arg0.field798 = "@gre@Classic" + (field221[var2] - 219);
				} else {
					arg0.field798 = "@yel@Classic" + (field221[var2] - 219);
				}

				arg0.field849 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field439;
			if (field440 != 2) {
				var5 = 0;
			}

			arg0.field822 = var5 * 15 + 20;
			if (arg0.field822 <= arg0.field793) {
				arg0.field822 = arg0.field793 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field440 == 0) {
				arg0.field798 = "Loading ignore list";
				arg0.field849 = 0;
			} else if (var2 == 1 && field440 == 0) {
				arg0.field798 = "Please wait...";
				arg0.field849 = 0;
			} else {
				int var6 = field411;
				if (field440 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field798 = "";
					arg0.field849 = 0;
				} else {
					arg0.field798 = UJPWWGLO.method508(UJPWWGLO.method505(field37[var2]));
					arg0.field849 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field822 = field411 * 15 + 20;
			if (arg0.field822 <= arg0.field793) {
				arg0.field822 = arg0.field793 + 1;
			}
		} else if (var2 == 327) {
			arg0.field831 = 150;
			arg0.field832 = (int) (Math.sin(field453 / 40.0D) * 256.0D) & 0x7FF;

			if (field56) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field309[var7];
					if (var8 >= 0 && !RPRWOACX.field1172[var8].method433()) {
						return;
					}
				}

				field56 = false;
				CSGBDGDY[] var9 = new CSGBDGDY[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field309[var11];
					if (var12 >= 0) {
						var9[var10++] = RPRWOACX.field1172[var12].method434();
					}
				}

				CSGBDGDY var13 = new CSGBDGDY(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field212[var14] != 0) {
						var13.method174(field154[var14][0], field154[var14][field212[var14]]);

						if (var14 == 1) {
							var13.method174(field277[0], field277[field212[var14]]);
						}
					}
				}

				var13.method167();
				var13.method168(PNPNYEVW.field1058[field398.field1403].field1060[0]);
				var13.method177(64, 850, -30, -50, -30, true);
				arg0.field806 = 5;
				arg0.field807 = 0;
				HZINZKXF.method266(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field429 == null) {
				field429 = arg0.field855;
				field430 = arg0.field851;
			}

			if (field272) {
				arg0.field855 = field430;
			} else {
				arg0.field855 = field429;
			}
		} else if (var2 == 325) {
			if (field429 == null) {
				field429 = arg0.field855;
				field430 = arg0.field851;
			}

			if (field272) {
				arg0.field855 = field429;
			} else {
				arg0.field855 = field430;
			}
		} else if (var2 == 600) {
			arg0.field798 = field233;
			if (field453 % 20 < 10) {
				arg0.field798 = arg0.field798 + "|";
			} else {
				arg0.field798 = arg0.field798 + " ";
			}
		} else if (var2 == 620) {
			if (field81 < 1) {
				arg0.field798 = "";
			} else if (field269) {
				arg0.field828 = 0xFF0000;
				arg0.field798 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field828 = 0xFFFFFF;
				arg0.field798 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field397 - field250;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field798 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field287 == 0) {
				arg0.field798 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field287 <= field397) {
				arg0.field798 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method143(field287);
			} else {
				int var17 = field397 + 14 - field287;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field798 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method143(field287) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field260 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field260 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field260 + " unread messages";
			}

			arg0.field798 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field422 > 0 && field422 <= field397 + 10) {
				arg0.field798 = "Last password change:\\n@gre@" + method143(field422);
			} else {
				arg0.field798 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 664) {
			if (field39 == 0) {
				arg0.field798 = "You have not yet set\\nany contact details.";
			}

			if (field39 == 1) {
				arg0.field798 = "Contact Details Last Set:\\n@gre@" + method143(field248);
			}

			if (field39 == 2) {
				arg0.field798 = "You need to set\\nnew contact details.";
			}
		} else if (var2 == 665) {
			if (field177 > 2 && !field417) {
				arg0.field798 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field177 > 2) {
				arg0.field798 = "\\n\\nYou have @gre@" + field177 + "@yel@ days of\\nmember credit remaining.";
			} else if (field177 > 0) {
				arg0.field798 = "You have @gre@" + field177 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field798 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field177 > 2 && !field417) {
				arg0.field798 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field177 > 0) {
				arg0.field798 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field798 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field287 > field397) {
				arg0.field798 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field798 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public final String method143(int arg0) {
		if (arg0 > field397 + 10) {
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

	@ObfuscatedName("client.o(B)V")
	public final void method144() {
		try {
			if (field127 != null) {
				field127.method578();
			}
		} catch (Exception var2) {
		}

		field127 = null;
		field366 = false;
		field315 = 0;
		field119 = "";
		field120 = "";
		method45();
		field113.method449();

		for (int var1 = 0; var1 < 4; var1++) {
			field194[var1].method188();
		}

		System.gc();
		method19();
		field136 = -1;
		field148 = -1;
		field282 = 0;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;)V")
	public final void method145(String arg0, String arg1) {
		if (field166 != null) {
			field166.method535();
			YFTZFAFG.field1440 = field49;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field383.method212(0, 257, arg0, var3);
			field383.method212(0xFFFFFF, 256, arg0, var3 - 1);
			var3 += 15;
			if (arg1 != null) {
				field383.method212(0, 257, arg1, var3);
				field383.method212(0xFFFFFF, 256, arg1, var3 - 1);
			}

			field166.method536(4, 4, field475);
		} else if (field476 != null) {
			field476.method535();
			YFTZFAFG.field1440 = field50;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			NQLGXPRA.method393(383 - var5 / 2, 0, var6, var4 - var6 / 2 - 5, var5);
			NQLGXPRA.method394(0xFFFFFF, var4 - var6 / 2 - 5, var5, var6, 383 - var5 / 2);

			if (arg1 != null) {
				var4 -= 7;
			}

			field383.method212(0, 383, arg0, var4);
			field383.method212(0xFFFFFF, 382, arg0, var4 - 1);
			var4 += 15;
			if (arg1 != null) {
				field383.method212(0, 383, arg1, var4);
				field383.method212(0xFFFFFF, 382, arg1, var4 - 1);
			}

			field476.method536(0, 0, field475);
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method146() {
		int var1 = 5;
		field322[8] = 0;
		int var2 = 0;
		while (field322[8] == 0) {
			String var3 = "Unknown problem";
			method32(20, "Connecting to web server");

			try {
				DataInputStream var4 = method86("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 339);
				NHEPCMLW var5 = new NHEPCMLW(new byte[40]);
				var4.readFully(var5.field964, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field322[var6] = var5.method354();
				}

				int var7 = var5.method354();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field322[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field322[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field322[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field322[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field322[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field322[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method32(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method32(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field215 = !field215;
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method147() {
		while (true) {
			ZRGWPKYE var1 = field36.method526();
			if (var1 == null) {
				return;
			}

			if (var1.field1492 == 0) {
				CSGBDGDY.method158(var1.field1494, var1.field1491);

				if ((field36.method524(var1.field1494) & 0x62) != 0) {
					field118 = true;

					if (field303 != -1 || field134 != -1) {
						field232 = true;
					}
				}
			}

			if (var1.field1492 == 1 && var1.field1491 != null) {
				KDJQGGIG.method282(var1.field1491);
			}

			if (var1.field1492 == 2 && field148 == var1.field1494 && var1.field1491 != null) {
				method11(var1.field1491, field149);
			}

			if (var1.field1492 == 3 && field239 == 1) {
				for (int var2 = 0; var2 < field394.length; var2++) {
					if (field229[var2] == var1.field1494) {
						field394[var2] = var1.field1491;

						if (var1.field1491 == null) {
							field229[var2] = -1;
						}

						break;
					}

					if (field230[var2] == var1.field1494) {
						field271[var2] = var1.field1491;

						if (var1.field1491 == null) {
							field230[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1492 == 93 && field36.method521(var1.field1494)) {
				GSYZIGPZ.method239(new NHEPCMLW(var1.field1491), field36);
			}
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method148(int arg0) {
		int[] var2 = field186.field1505;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field308[arg0][var7][var5] & 0x18) == 0) {
					field113.method484(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field308[arg0 + 1][var7][var5] & 0x8) != 0) {
					field113.method484(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field186.method589();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field308[arg0][var11][var10] & 0x18) == 0) {
					method44(var10, var9, var8, arg0, var11);
				}

				if (arg0 < 3 && (field308[arg0 + 1][var11][var10] & 0x8) != 0) {
					method44(var10, var9, var8, arg0 + 1, var11);
				}
			}
		}

		if (field166 != null) {
			field166.method535();
			YFTZFAFG.field1440 = field49;
		}

		field424 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field113.method478(field83, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = NRKXAGEB.method400(var14).field1031;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field194[field83].field615;
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

						field57[field424] = field299[var15];
						field425[field424] = var16;
						field426[field424] = var17;
						field424++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.L(I)Z")
	public final boolean method149() {
		if (field127 == null) {
			return false;
		}

		try {
			int var1 = field127.method580();
			if (var1 == 0) {
				return false;
			}

			if (field122 == -1) {
				field127.method581(field379.field964, 0, 1);
				field122 = field379.field964[0] & 0xFF;
				if (field317 != null) {
					field122 = field122 - field317.method278() & 0xFF;
				}

				field121 = HRZEMTBE.field741[field122];
				var1--;
			}

			if (field121 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field127.method581(field379.field964, 0, 1);
				field121 = field379.field964[0] & 0xFF;
				var1--;
			}

			if (field121 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field127.method581(field379.field964, 0, 2);
				field379.field965 = 0;
				field121 = field379.method351();
				var1 -= 2;
			}

			if (var1 < field121) {
				return false;
			}

			field379.field965 = 0;
			field127.method581(field379.field964, 0, field121);
			field123 = 0;
			field365 = field364;
			field364 = field363;
			field363 = field122;

			if (field122 == 46) {
				if (field189 == 12) {
					field118 = true;
				}

				field284 = field379.method352();
				field122 = -1;
				return true;
			}

			if (field122 == 38) {
				method72(field121, field379);
				field255 = false;
				field122 = -1;
				return true;
			}

			if (field122 == 221) {
				field320 = false;
				field168 = 2;
				field82 = "";
				field232 = true;
				field122 = -1;
				return true;
			}

			if (field122 == 59) {
				int var2 = field379.method351();
				int var3 = field379.method380();
				HZINZKXF var4 = HZINZKXF.method269(var2);
				if (var4.field808 != var3 || var3 == -1) {
					var4.field808 = var3;
					var4.field835 = 0;
					var4.field804 = 0;
				}

				field122 = -1;
				return true;
			}

			if (field122 == 170) {
				int var5 = field379.method375();
				int var6 = field379.method377();
				HZINZKXF.method269(var5).field806 = 1;
				HZINZKXF.method269(var5).field807 = var6;
				field122 = -1;
				return true;
			}

			if (field122 == 111) {
				field342 = true;
				field199 = field379.method349();
				field200 = field379.method349();
				field201 = field379.method351();
				field202 = field379.method349();
				field203 = field379.method349();
				if (field203 >= 100) {
					field58 = field199 * 128 + 64;
					field60 = field200 * 128 + 64;
					field59 = method52(field83, field60, field58) - field201;
				}

				field122 = -1;
				return true;
			}

			if (field122 == 67) {
				int var7 = field379.method377();
				int var8 = field379.method379();
				int var9 = field379.method352();
				HZINZKXF var10 = HZINZKXF.method269(var7);
				var10.field859 = var9;
				var10.field839 = var8;
				field122 = -1;
				return true;
			}

			if (field122 == 193) {
				field68 = field379.method368();
				field421 = field379.method351();
				field122 = -1;
				return true;
			}

			if (field122 == 176) {
				field440 = field379.method349();
				field118 = true;
				field122 = -1;
				return true;
			}

			if (field122 == 118) {
				for (int var11 = 0; var11 < field117.length; var11++) {
					if (field446[var11] != field117[var11]) {
						field117[var11] = field446[var11];
						method85(var11);
						field118 = true;
					}
				}

				field122 = -1;
				return true;
			}

			if (field122 == 163) {
				int var12 = field379.method377();
				byte var13 = field379.method370();
				field446[var12] = var13;

				if (field117[var12] != var13) {
					field117[var12] = var13;
					method85(var12);
					field118 = true;

					if (field134 != -1) {
						field232 = true;
					}
				}

				field122 = -1;
				return true;
			}

			if (field122 == 119) {
				long var14 = field379.method355();
				int var16 = field379.method354();
				int var17 = field379.method349();
				boolean var18 = false;
				for (int var19 = 0; var19 < 100; var19++) {
					if (field396[var19] == var16) {
						var18 = true;
						break;
					}
				}

				if (var17 <= 1) {
					for (int var20 = 0; var20 < field411; var20++) {
						if (field37[var20] == var14) {
							var18 = true;
							break;
						}
					}
				}

				if (!var18 && field240 == 0) {
					try {
						field396[field76] = var16;
						field76 = (field76 + 1) % 100;
						String var21 = LSYVWAVF.method331(field121 - 13, field379);
						if (var17 != 3) {
							var21 = KUSEVGYR.method302(var21);
						}

						if (var17 == 2 || var17 == 3) {
							method106("@cr2@" + UJPWWGLO.method508(UJPWWGLO.method505(var14)), var21, 7);
						} else if (var17 == 1) {
							method106("@cr1@" + UJPWWGLO.method508(UJPWWGLO.method505(var14)), var21, 7);
						} else {
							method106(UJPWWGLO.method508(UJPWWGLO.method505(var14)), var21, 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field122 = -1;
				return true;
			}

			if (field122 == 41) {
				method134(field379, field121);
				field122 = -1;
				return true;
			}

			if (field122 == 227) {
				field193 = field379.method382();
				field422 = field379.method376();
				field397 = field379.method376();
				field379.method375();
				field287 = field379.method375();
				field250 = field379.method375();
				field379.method351();
				field39 = field379.method369();
				field260 = field379.method377();
				field248 = field379.method377();
				field177 = field379.method351();
				signlink.dnslookup(UJPWWGLO.method507(field193));
				field122 = -1;
				return true;
			}

			if (field122 == 212) {
				int var23 = field379.method351();
				method140(var23);

				if (field376 != -1) {
					method121(field376);
					field376 = -1;
					field118 = true;
					field241 = true;
				}

				if (field173 != -1) {
					method121(field173);
					field173 = -1;
					field224 = true;
				}

				if (field419 != -1) {
					method121(field419);
					field419 = -1;
				}

				if (field278 != -1) {
					method121(field278);
					field278 = -1;
				}

				if (field303 != var23) {
					method121(field303);
					field303 = var23;
				}

				field163 = false;
				field232 = true;
				field122 = -1;
				return true;
			}

			if (field122 == 28) {
				int var24 = field379.method377();
				int var25 = field379.method376();
				method140(var24);

				if (var25 != -1) {
					method140(var25);
				}

				if (field278 != -1) {
					method121(field278);
					field278 = -1;
				}

				if (field376 != -1) {
					method121(field376);
					field376 = -1;
				}

				if (field303 != -1) {
					method121(field303);
					field303 = -1;
				}

				if (field173 != var24) {
					method121(field173);
					field173 = var24;
				}

				if (field419 != var24) {
					method121(field419);
					field419 = var25;
				}

				field168 = 0;
				field163 = false;
				field122 = -1;
				return true;
			}

			if (field122 == 190) {
				int var26 = field379.method380();
				if (var26 >= 0) {
					method140(var26);
				}

				if (field40 != var26) {
					method121(field40);
					field40 = var26;
				}

				field122 = -1;
				return true;
			}

			if (field122 == 23) {
				long var27 = field379.method355();
				int var29 = field379.method349();
				String var30 = UJPWWGLO.method508(UJPWWGLO.method505(var27));
				for (int var31 = 0; var31 < field439; var31++) {
					if (field80[var31] == var27) {
						if (field221[var31] != var29) {
							field221[var31] = var29;
							field118 = true;

							if (var29 > 0) {
								method106("", var30 + " has logged in.", 5);
							}

							if (var29 == 0) {
								method106("", var30 + " has logged out.", 5);
							}
						}

						var30 = null;
						break;
					}
				}

				if (var30 != null && field439 < 200) {
					field80[field439] = var27;
					field94[field439] = var30;
					field221[field439] = var29;
					field439++;
					field118 = true;
				}

				boolean var32 = false;
				while (!var32) {
					var32 = true;
					for (int var33 = 0; var33 < field439 - 1; var33++) {
						if (field221[var33] != field415 && field221[var33 + 1] == field415 || field221[var33] == 0 && field221[var33 + 1] != 0) {
							int var34 = field221[var33];
							field221[var33] = field221[var33 + 1];
							field221[var33 + 1] = var34;
							String var35 = field94[var33];
							field94[var33] = field94[var33 + 1];
							field94[var33 + 1] = var35;
							long var36 = field80[var33];
							field80[var33] = field80[var33 + 1];
							field80[var33 + 1] = var36;
							field118 = true;
							var32 = false;
						}
					}
				}

				field122 = -1;
				return true;
			}

			if (field122 == 229) {
				field118 = true;
				int var38 = field379.method351();
				HZINZKXF var39 = HZINZKXF.method269(var38);
				while (field379.field965 < field121) {
					int var40 = field379.method363();
					int var41 = field379.method351();
					int var42 = field379.method349();
					if (var42 == 255) {
						var42 = field379.method354();
					}

					if (var40 >= 0 && var40 < var39.field842.length) {
						var39.field842[var40] = var41;
						var39.field840[var40] = var42;
					}
				}

				field122 = -1;
				return true;
			}

			if (field122 == 216) {
				if (field189 == 12) {
					field118 = true;
				}

				field46 = field379.method349();
				field122 = -1;
				return true;
			}

			if (field122 == 76) {
				String var43 = field379.method356();
				int var44 = field379.method369();
				int var45 = field379.method349();
				if (var44 >= 1 && var44 <= 5) {
					if (var43.equalsIgnoreCase("null")) {
						var43 = null;
					}

					field252[var44 - 1] = var43;
					field253[var44 - 1] = var45 == 0;
				}

				field122 = -1;
				return true;
			}

			if (field122 == 52) {
				int var46 = field379.method349();
				int var47 = field379.method349();
				int var48 = field379.method349();
				int var49 = field379.method349();
				field378[var46] = true;
				field289[var46] = var47;
				field251[var46] = var48;
				field399[var46] = var49;
				field343[var46] = 0;
				field122 = -1;
				return true;
			}

			if (field122 == 5) {
				int var50 = field379.method377();
				HZINZKXF.method269(var50).field806 = 3;

				if (field398.field722 == null) {
					HZINZKXF.method269(var50).field807 = (field398.field723[11] << 5) + (field398.field723[8] << 10) + (field398.field723[0] << 15) + (field398.field714[0] << 25) + (field398.field714[4] << 20) + field398.field723[1];
				} else {
					HZINZKXF.method269(var50).field807 = (int) (field398.field722.field654 + 0x12345678L);
				}

				field122 = -1;
				return true;
			}

			if (field122 == 153) {
				field280 = field379.method369();
				field281 = field379.method349();

				while (field379.field965 < field121) {
					int var51 = field379.method349();
					method129(field379, var51);
				}

				field122 = -1;
				return true;
			}

			if (field122 == 11) {
				field327 = field379.method349();
				if (field327 == field189) {
					if (field327 == 3) {
						field189 = 1;
					} else {
						field189 = 3;
					}

					field118 = true;
				}

				field122 = -1;
				return true;
			}

			if (field122 == 162) {
				int var52 = field379.method351();
				method140(var52);

				if (field376 != -1) {
					method121(field376);
					field376 = -1;
					field118 = true;
					field241 = true;
				}

				if (field303 != -1) {
					method121(field303);
					field303 = -1;
					field232 = true;
				}

				if (field173 != -1) {
					method121(field173);
					field173 = -1;
					field224 = true;
				}

				if (field419 != -1) {
					method121(field419);
					field419 = -1;
				}

				if (field278 != var52) {
					method121(field278);
					field278 = var52;
				}

				if (field168 != 0) {
					field168 = 0;
					field232 = true;
				}

				field163 = false;
				field122 = -1;
				return true;
			}

			if (field122 == 233) {
				field342 = false;

				for (int var53 = 0; var53 < 5; var53++) {
					field378[var53] = false;
				}

				field122 = -1;
				return true;
			}

			if (field122 == 135) {
				field184 = 0;
				field122 = -1;
				return true;
			}

			if (field122 == 49) {
				int var54 = field379.method377();
				int var55 = field379.method351();

				if (field303 != -1) {
					method121(field303);
					field303 = -1;
					field232 = true;
				}

				if (field173 != -1) {
					method121(field173);
					field173 = -1;
					field224 = true;
				}

				if (field419 != -1) {
					method121(field419);
					field419 = -1;
				}

				if (field278 != var55) {
					method121(field278);
					field278 = var55;
				}

				if (field376 != var54) {
					method121(field376);
					field376 = var54;
				}

				if (field168 != 0) {
					field168 = 0;
					field232 = true;
				}

				field118 = true;
				field241 = true;
				field163 = false;
				field122 = -1;
				return true;
			}

			if (field122 == 102) {
				int var56 = field379.method375();
				HZINZKXF var57 = HZINZKXF.method269(var56);
				for (int var58 = 0; var58 < var57.field842.length; var58++) {
					var57.field842[var58] = -1;
					var57.field842[var58] = 0;
				}

				field122 = -1;
				return true;
			}

			if (field122 == 240) {
				field281 = field379.method349();
				field280 = field379.method368();
				for (int var59 = field280; var59 < field280 + 8; var59++) {
					for (int var60 = field281; var60 < field281 + 8; var60++) {
						if (field226[field83][var59][var60] != null) {
							field226[field83][var59][var60] = null;
							method120(var59, var60);
						}
					}
				}

				for (YCAXTCCQ var61 = (YCAXTCCQ) field359.method414(); var61 != null; var61 = (YCAXTCCQ) field359.method416()) {
					if (var61.field1422 >= field280 && var61.field1422 < field280 + 8 && var61.field1423 >= field281 && var61.field1423 < field281 + 8 && field83 == var61.field1420) {
						var61.field1425 = 0;
					}
				}

				field122 = -1;
				return true;
			}

			if (field122 == 151) {
				String var62 = field379.method356();
				if (var62.endsWith(":tradereq:")) {
					String var63 = var62.substring(0, var62.indexOf(":"));
					long var64 = UJPWWGLO.method504(var63);
					boolean var66 = false;
					for (int var67 = 0; var67 < field411; var67++) {
						if (field37[var67] == var64) {
							var66 = true;
							break;
						}
					}

					if (!var66 && field240 == 0) {
						method106(var63, "wishes to trade with you.", 4);
					}
				} else if (var62.endsWith(":duelreq:")) {
					String var68 = var62.substring(0, var62.indexOf(":"));
					long var69 = UJPWWGLO.method504(var68);
					boolean var71 = false;
					for (int var72 = 0; var72 < field411; var72++) {
						if (field37[var72] == var69) {
							var71 = true;
							break;
						}
					}

					if (!var71 && field240 == 0) {
						method106(var68, "wishes to duel with you.", 8);
					}
				} else if (var62.endsWith(":chalreq:")) {
					String var73 = var62.substring(0, var62.indexOf(":"));
					long var74 = UJPWWGLO.method504(var73);
					boolean var76 = false;
					for (int var77 = 0; var77 < field411; var77++) {
						if (field37[var77] == var74) {
							var76 = true;
							break;
						}
					}

					if (!var76 && field240 == 0) {
						String var78 = var62.substring(var62.indexOf(":") + 1, var62.length() - 9);
						method106(var73, var78, 8);
					}
				} else {
					method106("", var62, 0);
				}

				field122 = -1;
				return true;
			}

			if (field122 == 33) {
				for (int var79 = 0; var79 < field349.length; var79++) {
					if (field349[var79] != null) {
						field349[var79].field1391 = -1;
					}
				}

				for (int var80 = 0; var80 < field305.length; var80++) {
					if (field305[var80] != null) {
						field305[var80].field1391 = -1;
					}
				}

				field122 = -1;
				return true;
			}

			if (field122 == 223) {
				field118 = true;
				int var81 = field379.method351();
				HZINZKXF var82 = HZINZKXF.method269(var81);
				int var83 = field379.method351();
				for (int var84 = 0; var84 < var83; var84++) {
					var82.field842[var84] = field379.method375();
					int var85 = field379.method368();
					if (var85 == 255) {
						var85 = field379.method354();
					}

					var82.field840[var84] = var85;
				}

				for (int var86 = var83; var86 < var82.field842.length; var86++) {
					var82.field842[var86] = 0;
					var82.field840[var86] = 0;
				}

				field122 = -1;
				return true;
			}

			if (field122 == 83) {
				int var87 = field379.method375();
				method140(var87);

				if (field303 != -1) {
					method121(field303);
					field303 = -1;
					field232 = true;
				}

				if (field173 != -1) {
					method121(field173);
					field173 = -1;
					field224 = true;
				}

				if (field419 != -1) {
					method121(field419);
					field419 = -1;
				}

				if (field278 != -1) {
					method121(field278);
					field278 = -1;
				}

				if (field376 != var87) {
					method121(field376);
					field376 = var87;
				}

				if (field168 != 0) {
					field168 = 0;
					field232 = true;
				}

				field118 = true;
				field241 = true;
				field163 = false;
				field122 = -1;
				return true;
			}

			if (field122 != 9 && field122 != 99) {
				if (field122 == 60) {
					field281 = field379.method349();
					field280 = field379.method369();
					field122 = -1;
					return true;
				}

				if (field122 == 93) {
					int var138 = field379.method376();
					int var139 = field379.method375();
					HZINZKXF var140 = HZINZKXF.method269(var139);
					if (var140 != null && var140.field792 == 0) {
						if (var138 < 0) {
							var138 = 0;
						}

						if (var138 > var140.field822 - var140.field793) {
							var138 = var140.field822 - var140.field793;
						}

						var140.field800 = var138;
					}

					field122 = -1;
					return true;
				}

				if (field122 == 131) {
					field329 = field379.method349();
					if (field329 == 1) {
						field66 = field379.method351();
					}

					if (field329 >= 2 && field329 <= 6) {
						if (field329 == 2) {
							field161 = 64;
							field162 = 64;
						}

						if (field329 == 3) {
							field161 = 0;
							field162 = 64;
						}

						if (field329 == 4) {
							field161 = 128;
							field162 = 64;
						}

						if (field329 == 5) {
							field161 = 64;
							field162 = 0;
						}

						if (field329 == 6) {
							field161 = 64;
							field162 = 128;
						}

						field329 = 2;
						field158 = field379.method351();
						field159 = field379.method351();
						field160 = field379.method349();
					}

					if (field329 == 10) {
						field97 = field379.method351();
					}

					field122 = -1;
					return true;
				}

				if (field122 == 175) {
					String var141 = field379.method356();
					int var142 = field379.method375();
					HZINZKXF.method269(var142).field798 = var141;

					if (field222[field189] == HZINZKXF.method269(var142).field824) {
						field118 = true;
					}

					field122 = -1;
					return true;
				}

				if (field122 == 186) {
					field118 = true;
					int var143 = field379.method369();
					int var144 = field379.method383();
					int var145 = field379.method349();
					field92[var143] = var144;
					field360[var143] = var145;
					field428[var143] = 1;
					for (int var146 = 0; var146 < 98; var146++) {
						if (var144 >= field270[var146]) {
							field428[var143] = var146 + 2;
						}
					}

					field122 = -1;
					return true;
				}

				if (field122 == 35) {
					field336 = field379.method377() * 30;
					field122 = -1;
					return true;
				}

				if (field122 == 192) {
					field342 = true;
					field107 = field379.method349();
					field108 = field379.method349();
					field109 = field379.method351();
					field110 = field379.method349();
					field111 = field379.method349();
					if (field111 >= 100) {
						int var147 = field107 * 128 + 64;
						int var148 = field108 * 128 + 64;
						int var149 = method52(field83, var148, var147) - field109;
						int var150 = var147 - field58;
						int var151 = var149 - field59;
						int var152 = var148 - field60;
						int var153 = (int) Math.sqrt(var150 * var150 + var152 * var152);
						field61 = (int) (Math.atan2(var151, var153) * 325.949D) & 0x7FF;
						field62 = (int) (Math.atan2(var150, var152) * -325.949D) & 0x7FF;

						if (field61 < 128) {
							field61 = 128;
						}

						if (field61 > 383) {
							field61 = 383;
						}
					}

					field122 = -1;
					return true;
				}

				if (field122 != 10 && field122 != 42 && field122 != 200 && field122 != 116 && field122 != 75 && field122 != 238 && field122 != 203 && field122 != 150 && field122 != 255 && field122 != 2 && field122 != 241) {
					if (field122 == 132) {
						int var154 = field379.method351();
						int var155 = field379.method349();
						int var156 = field379.method351();
						if (field218 && !field418 && field340 < 50) {
							field89[field340] = var154;
							field389[field340] = var155;
							field176[field340] = KTPZRJZJ.field901[var154] + var156;
							field340++;
						}

						field122 = -1;
						return true;
					}

					if (field122 == 97) {
						field189 = field379.method349();
						field118 = true;
						field241 = true;
						field122 = -1;
						return true;
					}

					if (field122 == 13) {
						int var157 = field379.method378();
						if (field134 != var157) {
							method121(field134);
							field134 = var157;
						}

						field232 = true;
						field122 = -1;
						return true;
					}

					if (field122 == 107) {
						int var158 = field379.method376();
						int var159 = field379.method377();
						int var160 = var159 >> 10 & 0x1F;
						int var161 = var159 >> 5 & 0x1F;
						int var162 = var159 & 0x1F;
						HZINZKXF.method269(var158).field828 = (var162 << 3) + (var160 << 19) + (var161 << 11);
						field122 = -1;
						return true;
					}

					if (field122 == 195) {
						method144();
						field122 = -1;
						return false;
					}

					if (field122 == 204) {
						int var163 = field379.method375();
						int var164 = field379.method375();
						int var165 = field379.method376();
						HZINZKXF.method269(var165).field799 = (var163 << 16) + var164;
						field122 = -1;
						return true;
					}

					if (field122 == 51) {
						boolean var166 = field379.method368() == 1;
						int var167 = field379.method376();
						HZINZKXF.method269(var167).field801 = var166;
						field122 = -1;
						return true;
					}

					if (field122 == 149) {
						int var168 = field379.method377();
						int var169 = field379.method376();
						HZINZKXF.method269(var169).field806 = 2;
						HZINZKXF.method269(var169).field807 = var168;
						field122 = -1;
						return true;
					}

					if (field122 == 81) {
						int var170 = field379.method376();
						if (var170 == 0xFFFF) {
							var170 = -1;
						}

						if (field136 != var170 && field147 && !field418 && field282 == 0) {
							field148 = var170;
							field149 = true;
							field36.method532(2, field148);
						}

						field136 = var170;
						field122 = -1;
						return true;
					}

					if (field122 == 165) {
						int var171 = field379.method353();
						int var172 = field379.method351();
						if (field147 && !field418) {
							field148 = var172;
							field149 = false;
							field36.method532(2, field148);
							field282 = var171;
						}

						field122 = -1;
						return true;
					}

					if (field122 == 214) {
						int var173 = field379.method376();
						int var174 = field379.method351();
						int var175 = field379.method376();

						if (var173 == 0xFFFF) {
							HZINZKXF.method269(var174).field806 = 0;
							field122 = -1;
							return true;
						}

						HVTLSJTR var176 = HVTLSJTR.method254(var173);
						HZINZKXF.method269(var174).field806 = 4;
						HZINZKXF.method269(var174).field807 = var173;
						HZINZKXF.method269(var174).field831 = var176.field743;
						HZINZKXF.method269(var174).field832 = var176.field754;
						HZINZKXF.method269(var174).field830 = var176.field780 * 100 / var175;
						field122 = -1;
						return true;
					}

					if (field122 == 62) {
						field112 = field379.method349();
						field122 = -1;
						return true;
					}

					if (field122 == 199) {
						int var177 = field379.method349();
						int var178 = field379.method375();
						if (var178 == 0xFFFF) {
							var178 = -1;
						}

						if (field222[var177] != var178) {
							method121(field222[var177]);
							field222[var177] = var178;
						}

						field118 = true;
						field241 = true;
						field122 = -1;
						return true;
					}

					if (field122 == 64) {
						field320 = false;
						field168 = 1;
						field82 = "";
						field232 = true;
						field122 = -1;
						return true;
					}

					if (field122 == 245) {
						field216 = field379.method349();
						field122 = -1;
						return true;
					}

					if (field122 == 1) {
						field198 = field379.method349();
						field172 = field379.method349();
						field156 = field379.method349();
						field413 = true;
						field232 = true;
						field122 = -1;
						return true;
					}

					if (field122 == 27) {
						int var179 = field379.method377();
						int var180 = field379.method376();
						int var181 = field379.method376();
						int var182 = field379.method377();
						HZINZKXF.method269(var182).field831 = var180;
						HZINZKXF.method269(var182).field832 = var181;
						HZINZKXF.method269(var182).field830 = var179;
						field122 = -1;
						return true;
					}

					if (field122 == 196) {
						field411 = field121 / 8;
						for (int var183 = 0; var183 < field411; var183++) {
							field37[var183] = field379.method355();
						}

						field122 = -1;
						return true;
					}

					if (field122 == 8) {
						if (field376 != -1) {
							method121(field376);
							field376 = -1;
							field118 = true;
							field241 = true;
						}

						if (field303 != -1) {
							method121(field303);
							field303 = -1;
							field232 = true;
						}

						if (field173 != -1) {
							method121(field173);
							field173 = -1;
							field224 = true;
						}

						if (field419 != -1) {
							method121(field419);
							field419 = -1;
						}

						if (field278 != -1) {
							method121(field278);
							field278 = -1;
						}

						if (field168 != 0) {
							field168 = 0;
							field232 = true;
						}

						field163 = false;
						field122 = -1;
						return true;
					}

					if (field122 == 56) {
						int var184 = field379.method383();
						int var185 = field379.method376();
						field446[var185] = var184;

						if (field117[var185] != var184) {
							field117[var185] = var184;
							method85(var185);
							field118 = true;

							if (field134 != -1) {
								field232 = true;
							}
						}

						field122 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field122 + "," + field121 + " - " + field364 + "," + field365);
					method144();
					return true;
				}

				method129(field379, field122);
				field122 = -1;
				return true;
			}

			int var88 = field30;
			int var89 = field31;
			if (field122 == 9) {
				var89 = field379.method375();
				var88 = field379.method376();
				field155 = false;
			}

			if (field122 == 99) {
				var89 = field379.method375();
				var88 = field379.method377();
				field379.method359();

				for (int var90 = 0; var90 < 4; var90++) {
					for (int var91 = 0; var91 < 13; var91++) {
						for (int var92 = 0; var92 < 13; var92++) {
							int var93 = field379.method360(1);
							if (var93 == 1) {
								field423[var90][var91][var92] = field379.method360(26);
							} else {
								field423[var90][var91][var92] = -1;
							}
						}
					}
				}

				field379.method361();
				field155 = true;
			}

			if (field30 == var88 && field31 == var89 && field239 == 2) {
				field122 = -1;
				return true;
			}

			field30 = var88;
			field31 = var89;
			field256 = (field30 - 6) * 8;
			field257 = (field31 - 6) * 8;
			field361 = false;
			if ((field30 / 8 == 48 || field30 / 8 == 49) && field31 / 8 == 48) {
				field361 = true;
			}

			if (field30 / 8 == 48 && field31 / 8 == 148) {
				field361 = true;
			}

			field239 = 1;
			field170 = System.currentTimeMillis();
			method145("Loading - please wait.", null);

			if (field122 == 9) {
				int var94 = 0;
				for (int var95 = (field30 - 6) / 8; var95 <= (field30 + 6) / 8; var95++) {
					for (int var96 = (field31 - 6) / 8; var96 <= (field31 + 6) / 8; var96++) {
						var94++;
					}
				}

				field394 = new byte[var94][];
				field271 = new byte[var94][];
				field228 = new int[var94];
				field229 = new int[var94];
				field230 = new int[var94];
				int var97 = 0;
				for (int var98 = (field30 - 6) / 8; var98 <= (field30 + 6) / 8; var98++) {
					for (int var99 = (field31 - 6) / 8; var99 <= (field31 + 6) / 8; var99++) {
						field228[var97] = (var98 << 8) + var99;

						if (field361 && (var99 == 49 || var99 == 149 || var99 == 147 || var98 == 50 || var98 == 49 && var99 == 47)) {
							field229[var97] = -1;
							field230[var97] = -1;
							var97++;
						} else {
							int var100 = field229[var97] = field36.method520(var98, var99, 0);
							if (var100 != -1) {
								field36.method532(3, var100);
							}

							int var101 = field230[var97] = field36.method520(var98, var99, 1);
							if (var101 != -1) {
								field36.method532(3, var101);
							}

							var97++;
						}
					}
				}
			}

			if (field122 == 99) {
				int var102 = 0;
				int[] var103 = new int[676];
				for (int var104 = 0; var104 < 4; var104++) {
					for (int var105 = 0; var105 < 13; var105++) {
						for (int var106 = 0; var106 < 13; var106++) {
							int var107 = field423[var104][var105][var106];
							if (var107 != -1) {
								int var108 = var107 >> 14 & 0x3FF;
								int var109 = var107 >> 3 & 0x7FF;
								int var110 = (var108 / 8 << 8) + var109 / 8;
								for (int var111 = 0; var111 < var102; var111++) {
									if (var103[var111] == var110) {
										var110 = -1;
										break;
									}
								}

								if (var110 != -1) {
									var103[var102++] = var110;
								}
							}
						}
					}
				}

				field394 = new byte[var102][];
				field271 = new byte[var102][];
				field228 = new int[var102];
				field229 = new int[var102];
				field230 = new int[var102];
				for (int var112 = 0; var112 < var102; var112++) {
					int var113 = field228[var112] = var103[var112];
					int var114 = var113 >> 8 & 0xFF;
					int var115 = var113 & 0xFF;
					int var116 = field229[var112] = field36.method520(var114, var115, 0);
					if (var116 != -1) {
						field36.method532(3, var116);
					}

					int var117 = field230[var112] = field36.method520(var114, var115, 1);
					if (var117 != -1) {
						field36.method532(3, var117);
					}
				}
			}

			int var118 = field256 - field258;
			int var119 = field257 - field259;
			field258 = field256;
			field259 = field257;

			for (int var120 = 0; var120 < 16384; var120++) {
				ZLSEKGJR var121 = field305[var120];
				if (var121 != null) {
					for (int var122 = 0; var122 < 10; var122++) {
						var121.field1365[var122] -= var118;
						var121.field1366[var122] -= var119;
					}

					var121.field1405 -= var118 * 128;
					var121.field1406 -= var119 * 128;
				}
			}

			for (int var123 = 0; var123 < field347; var123++) {
				HDYGEGXY var124 = field349[var123];
				if (var124 != null) {
					for (int var125 = 0; var125 < 10; var125++) {
						var124.field1365[var125] -= var118;
						var124.field1366[var125] -= var119;
					}

					var124.field1405 -= var118 * 128;
					var124.field1406 -= var119 * 128;
				}
			}

			field255 = true;
			byte var126 = 0;
			byte var127 = 104;
			byte var128 = 1;
			if (var118 < 0) {
				var126 = 103;
				var127 = -1;
				var128 = -1;
			}

			byte var129 = 0;
			byte var130 = 104;
			byte var131 = 1;
			if (var119 < 0) {
				var129 = 103;
				var130 = -1;
				var131 = -1;
			}

			for (int var132 = var126; var132 != var127; var132 += var128) {
				for (int var133 = var129; var133 != var130; var133 += var131) {
					int var134 = var118 + var132;
					int var135 = var119 + var133;
					for (int var136 = 0; var136 < 4; var136++) {
						if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
							field226[var136][var132][var133] = field226[var136][var134][var135];
						} else {
							field226[var136][var132][var133] = null;
						}
					}
				}
			}

			for (YCAXTCCQ var137 = (YCAXTCCQ) field359.method414(); var137 != null; var137 = (YCAXTCCQ) field359.method416()) {
				var137.field1422 -= var118;
				var137.field1423 -= var119;
				if (var137.field1422 < 0 || var137.field1423 < 0 || var137.field1422 >= 104 || var137.field1423 >= 104) {
					var137.method336();
				}
			}

			if (field184 != 0) {
				field184 -= var118;
				field185 -= var119;
			}

			field342 = false;
			field122 = -1;
			return true;
		} catch (IOException var190) {
			method58();
		} catch (Exception var191) {
			String var187 = "T2 - " + field122 + "," + field364 + "," + field365 + " - " + field121 + "," + (field398.field1365[0] + field256) + "," + (field398.field1366[0] + field257) + " - ";
			for (int var188 = 0; var188 < field121 && var188 < 50; var188++) {
				var187 = var187 + field379.field964[var188] + ",";
			}

			signlink.reporterror(var187);
			method144();
		}

		return true;
	}

	@ObfuscatedName("client.b(ILNHEPCMLW;Z)V")
	public final void method150(int arg0, NHEPCMLW arg1) {
		while (arg1.field966 + 10 < arg0 * 8) {
			int var3 = arg1.method360(11);
			if (var3 == 2047) {
				break;
			}

			if (field349[var3] == null) {
				field349[var3] = new HDYGEGXY();
				if (field354[var3] != null) {
					field349[var3].method252(field354[var3]);
				}
			}

			field351[field350++] = var3;
			HDYGEGXY var4 = field349[var3];
			var4.field1367 = field453;
			int var5 = arg1.method360(1);
			int var6 = arg1.method360(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method360(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method360(1);
			if (var8 == 1) {
				field353[field352++] = var3;
			}

			var4.method547(field398.field1365[0] + var7, field398.field1366[0] + var6, var5 == 1);
		}

		arg1.method361();
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field270[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field362[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
