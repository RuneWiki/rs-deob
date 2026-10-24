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
public final class client extends EOQQYERM {

	@ObfuscatedName("client.Q")
	public String field47 = "";

	@ObfuscatedName("client.T")
	public int[] field49 = new int[9];

	@ObfuscatedName("client.U")
	public boolean field50 = false;

	@ObfuscatedName("client.lb")
	public boolean field64 = true;

	@ObfuscatedName("client.nb")
	public int[] field65 = new int[256];

	@ObfuscatedName("client.ob")
	public int field66 = -1;

	@ObfuscatedName("client.vb")
	public long[] field71 = new long[200];

	@ObfuscatedName("client.yb")
	public int[] field74 = new int[1000];

	@ObfuscatedName("client.zb")
	public String field75 = "";

	@ObfuscatedName("client.Ab")
	public String field76 = "";

	@ObfuscatedName("client.Eb")
	public int[] field80 = new int[50];

	@ObfuscatedName("client.Tb")
	public int field94 = 2;

	@ObfuscatedName("client.Ub")
	public String[] field95 = new String[500];

	@ObfuscatedName("client.Yb")
	public int[] field98 = new int[1000];

	@ObfuscatedName("client.Zb")
	public int[] field99 = new int[1000];

	@ObfuscatedName("client.ac")
	public FTMSICIZ field100 = FTMSICIZ.method201(1);

	@ObfuscatedName("client.hc")
	public boolean field107 = false;

	@ObfuscatedName("client.ic")
	public QGWIBVPG field108 = new QGWIBVPG();

	@ObfuscatedName("client.kc")
	public int field109 = -1;

	@ObfuscatedName("client.mc")
	public int[][][] field111 = new int[4][13][13];

	@ObfuscatedName("client.qc")
	public volatile boolean field113 = false;

	@ObfuscatedName("client.rc")
	public int[] field114 = new int[33];

	@ObfuscatedName("client.yc")
	public int[] field119 = new int[5];

	@ObfuscatedName("client.zc")
	public long[] field120 = new long[100];

	@ObfuscatedName("client.Fc")
	public boolean field124 = true;

	@ObfuscatedName("client.Gc")
	public final int[] field125 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Hc")
	public int[] field126 = new int[151];

	@ObfuscatedName("client.Nc")
	public boolean field132 = false;

	@ObfuscatedName("client.Zc")
	public int[] field144 = new int[500];

	@ObfuscatedName("client.ad")
	public int[] field145 = new int[500];

	@ObfuscatedName("client.bd")
	public int[] field146 = new int[500];

	@ObfuscatedName("client.cd")
	public int[] field147 = new int[500];

	@ObfuscatedName("client.ed")
	public boolean field148 = false;

	@ObfuscatedName("client.jd")
	public int field153 = -1;

	@ObfuscatedName("client.kd")
	public int field154 = 0x4D4233;

	@ObfuscatedName("client.od")
	public int field158 = 1;

	@ObfuscatedName("client.pd")
	public int field159 = -1;

	@ObfuscatedName("client.rd")
	public int[] field160 = new int[VQYNMSDV.field1305];

	@ObfuscatedName("client.td")
	public int[] field162 = new int[5];

	@ObfuscatedName("client.Ed")
	public boolean field171 = false;

	@ObfuscatedName("client.Gd")
	public int[] field173 = new int[50];

	@ObfuscatedName("client.Nd")
	public ITVAFKCK[] field180 = new ITVAFKCK[13];

	@ObfuscatedName("client.Ud")
	public QGWIBVPG field184 = new QGWIBVPG();

	@ObfuscatedName("client.Yd")
	public int field188 = -1;

	@ObfuscatedName("client.Zd")
	public int field189 = -1;

	@ObfuscatedName("client.ae")
	public boolean field190 = false;

	@ObfuscatedName("client.de")
	public int field193 = -1;

	@ObfuscatedName("client.he")
	public int[] field197 = new int[200];

	@ObfuscatedName("client.ie")
	public String field198 = "";

	@ObfuscatedName("client.me")
	public KUDWIDHU[] field200 = new KUDWIDHU[100];

	@ObfuscatedName("client.qe")
	public int field202 = 50;

	@ObfuscatedName("client.re")
	public int[] field203 = new int[field202];

	@ObfuscatedName("client.se")
	public int[] field204 = new int[field202];

	@ObfuscatedName("client.te")
	public int[] field205 = new int[field202];

	@ObfuscatedName("client.ue")
	public int[] field206 = new int[field202];

	@ObfuscatedName("client.ve")
	public int[] field207 = new int[field202];

	@ObfuscatedName("client.we")
	public int[] field208 = new int[field202];

	@ObfuscatedName("client.xe")
	public int[] field209 = new int[field202];

	@ObfuscatedName("client.ye")
	public String[] field210 = new String[field202];

	@ObfuscatedName("client.Ae")
	public boolean field211 = false;

	@ObfuscatedName("client.Ce")
	public boolean field213 = false;

	@ObfuscatedName("client.Ee")
	public int[] field215 = new int[151];

	@ObfuscatedName("client.Ge")
	public int[] field217 = new int[4000];

	@ObfuscatedName("client.He")
	public int[] field218 = new int[4000];

	@ObfuscatedName("client.Je")
	public boolean field220 = false;

	@ObfuscatedName("client.Ke")
	public int field221 = -1;

	@ObfuscatedName("client.Le")
	public KUDWIDHU[] field222 = new KUDWIDHU[20];

	@ObfuscatedName("client.Me")
	public volatile boolean field223 = false;

	@ObfuscatedName("client.Qe")
	public QGWIBVPG[][][] field227 = new QGWIBVPG[4][104][104];

	@ObfuscatedName("client.Re")
	public int[] field228 = new int[50];

	@ObfuscatedName("client.Se")
	public int[][] field229 = new int[104][104];

	@ObfuscatedName("client.Te")
	public boolean field230 = false;

	@ObfuscatedName("client.cf")
	public boolean field239 = true;

	@ObfuscatedName("client.gf")
	public ARIAIPRE[] field241 = new ARIAIPRE[5];

	@ObfuscatedName("client.hf")
	public FTMSICIZ field242 = FTMSICIZ.method201(1);

	@ObfuscatedName("client.jf")
	public int[][] field243 = new int[104][104];

	@ObfuscatedName("client.kf")
	public String field244 = "";

	@ObfuscatedName("client.vf")
	public String field254 = "";

	@ObfuscatedName("client.wf")
	public KUDWIDHU[] field255 = new KUDWIDHU[8];

	@ObfuscatedName("client.xf")
	public int[] field256 = new int[100];

	@ObfuscatedName("client.yf")
	public String[] field257 = new String[100];

	@ObfuscatedName("client.zf")
	public String[] field258 = new String[100];

	@ObfuscatedName("client.Kf")
	public String[] field268 = new String[5];

	@ObfuscatedName("client.Lf")
	public boolean[] field269 = new boolean[5];

	@ObfuscatedName("client.Mf")
	public boolean field270 = false;

	@ObfuscatedName("client.Nf")
	public String field271 = "";

	@ObfuscatedName("client.Pf")
	public int field272 = 3;

	@ObfuscatedName("client.Qf")
	public boolean field273 = false;

	@ObfuscatedName("client.Tf")
	public boolean field275 = false;

	@ObfuscatedName("client.ag")
	public ZSRJFSKK[] field282 = new ZSRJFSKK[4];

	@ObfuscatedName("client.bg")
	public PCARWQQC field283 = new PCARWQQC();

	@ObfuscatedName("client.cg")
	public String field284 = "";

	@ObfuscatedName("client.eg")
	public String[] field286 = new String[100];

	@ObfuscatedName("client.fg")
	public int[] field287 = new int[100];

	@ObfuscatedName("client.hg")
	public boolean field289 = false;

	@ObfuscatedName("client.ig")
	public boolean field290 = false;

	@ObfuscatedName("client.kg")
	public boolean[] field292 = new boolean[5];

	@ObfuscatedName("client.Ag")
	public int[] field306 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Dg")
	public int field309 = 128;

	@ObfuscatedName("client.Hg")
	public KUDWIDHU[] field313 = new KUDWIDHU[1000];

	@ObfuscatedName("client.Ig")
	public boolean field314 = false;

	@ObfuscatedName("client.Kg")
	public int field316 = 1;

	@ObfuscatedName("client.Og")
	public boolean field320 = true;

	@ObfuscatedName("client.Ug")
	public int[][] field326 = new int[104][104];

	@ObfuscatedName("client.ah")
	public CRC32 field330 = new CRC32();

	@ObfuscatedName("client.bh")
	public int[] field331 = new int[VQYNMSDV.field1305];

	@ObfuscatedName("client.dh")
	public boolean field333 = false;

	@ObfuscatedName("client.sh")
	public boolean field348 = false;

	@ObfuscatedName("client.wh")
	public int field351 = -1;

	@ObfuscatedName("client.zh")
	public boolean field354 = false;

	@ObfuscatedName("client.Ah")
	public final int field355 = 100;

	@ObfuscatedName("client.Bh")
	public int[] field356 = new int[100];

	@ObfuscatedName("client.Gh")
	public int field359 = 78;

	@ObfuscatedName("client.Hh")
	public int[] field360 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Ih")
	public int field361 = 0x332D25;

	@ObfuscatedName("client.Kh")
	public QGWIBVPG field363 = new QGWIBVPG();

	@ObfuscatedName("client.Nh")
	public int field366 = 2;

	@ObfuscatedName("client.Ph")
	public int field368 = 0x766654;

	@ObfuscatedName("client.Qh")
	public int[] field369 = new int[VQYNMSDV.field1305];

	@ObfuscatedName("client.gi")
	public int[] field383 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.ji")
	public boolean field386 = false;

	@ObfuscatedName("client.ki")
	public String field387 = "";

	@ObfuscatedName("client.li")
	public String field388 = "";

	@ObfuscatedName("client.ti")
	public int field395 = 2;

	@ObfuscatedName("client.ui")
	public KUDWIDHU[] field396 = new KUDWIDHU[32];

	@ObfuscatedName("client.vi")
	public KUDWIDHU[] field397 = new KUDWIDHU[32];

	@ObfuscatedName("client.zi")
	public String[] field400 = new String[200];

	@ObfuscatedName("client.Di")
	public FTMSICIZ field402 = new FTMSICIZ(new byte[5000]);

	@ObfuscatedName("client.Ei")
	public VMSVDNWD[] field403 = new VMSVDNWD[16384];

	@ObfuscatedName("client.Gi")
	public int[] field405 = new int[16384];

	@ObfuscatedName("client.Ki")
	public int[] field409 = new int[5];

	@ObfuscatedName("client.Mi")
	public volatile boolean field410 = false;

	@ObfuscatedName("client.Ni")
	public ITVAFKCK[] field411 = new ITVAFKCK[2];

	@ObfuscatedName("client.Qi")
	public int[] field413 = new int[33];

	@ObfuscatedName("client.Ui")
	public boolean field416 = false;

	@ObfuscatedName("client.cj")
	public byte[] field424 = new byte[16384];

	@ObfuscatedName("client.dj")
	public boolean field425 = false;

	@ObfuscatedName("client.fj")
	public int field427 = -1;

	@ObfuscatedName("client.gj")
	public KUDWIDHU[] field428 = new KUDWIDHU[32];

	@ObfuscatedName("client.lj")
	public int field433 = -1;

	@ObfuscatedName("client.mj")
	public int field434 = -1;

	@ObfuscatedName("client.nj")
	public int field435 = -1;

	@ObfuscatedName("client.oj")
	public int[] field436 = new int[7];

	@ObfuscatedName("client.pj")
	public int field437 = -1;

	@ObfuscatedName("client.sj")
	public int[] field440 = new int[2000];

	@ObfuscatedName("client.zj")
	public int field447 = -1;

	@ObfuscatedName("client.Gj")
	public FTMSICIZ field453 = FTMSICIZ.method201(1);

	@ObfuscatedName("client.Ij")
	public int[] field455 = new int[5];

	@ObfuscatedName("client.Kj")
	public int field457 = 2048;

	@ObfuscatedName("client.Lj")
	public int field458 = 2047;

	@ObfuscatedName("client.Mj")
	public YFPQHQAV[] field459 = new YFPQHQAV[field457];

	@ObfuscatedName("client.Oj")
	public int[] field461 = new int[field457];

	@ObfuscatedName("client.Qj")
	public int[] field463 = new int[field457];

	@ObfuscatedName("client.Rj")
	public FTMSICIZ[] field464 = new FTMSICIZ[field457];

	@ObfuscatedName("client.Tj")
	public int[] field466 = new int[5];

	@ObfuscatedName("client.Uj")
	public int field467 = 0x23201B;

	@ObfuscatedName("client.Vj")
	public boolean field468 = true;

	@ObfuscatedName("client.Xj")
	public int[] field470 = new int[2000];

	@ObfuscatedName("client.ck")
	public ITVAFKCK[] field474 = new ITVAFKCK[100];

	@ObfuscatedName("client.hk")
	public int field479 = -1;

	@ObfuscatedName("client.R")
	public static BigInteger field48 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Bb")
	public static int[] field77 = new int[99];

	@ObfuscatedName("client.Mb")
	public static int field88 = 10;

	@ObfuscatedName("client.Ob")
	public static boolean field90 = true;

	@ObfuscatedName("client.Ac")
	public static BigInteger field121 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Fd")
	public static final int[] field172 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Wg")
	public static String field327 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ji")
	public static final int[][] field408 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.ij")
	public static int[] field430 = new int[32];

	@ObfuscatedName("client.bc")
	public int field101;

	@ObfuscatedName("client.cc")
	public int field102;

	@ObfuscatedName("client.dc")
	public int field103;

	@ObfuscatedName("client.ec")
	public int field104;

	@ObfuscatedName("client.fc")
	public int field105;

	@ObfuscatedName("client.pc")
	public int field112;

	@ObfuscatedName("client.tc")
	public int field115;

	@ObfuscatedName("client.Ic")
	public int field127;

	@ObfuscatedName("client.Jc")
	public int field128;

	@ObfuscatedName("client.Kc")
	public int field129;

	@ObfuscatedName("client.Lc")
	public int field130;

	@ObfuscatedName("client.Mc")
	public int field131;

	@ObfuscatedName("client.Xc")
	public int field142;

	@ObfuscatedName("client.fd")
	public int field149;

	@ObfuscatedName("client.gd")
	public int field150;

	@ObfuscatedName("client.hd")
	public int field151;

	@ObfuscatedName("client.ld")
	public int field155;

	@ObfuscatedName("client.md")
	public static int field156;

	@ObfuscatedName("client.nd")
	public int field157;

	@ObfuscatedName("client.sd")
	public int field161;

	@ObfuscatedName("client.vd")
	public int field163;

	@ObfuscatedName("client.wd")
	public int field164;

	@ObfuscatedName("client.xd")
	public int field165;

	@ObfuscatedName("client.yd")
	public int field166;

	@ObfuscatedName("client.zd")
	public int field167;

	@ObfuscatedName("client.Bd")
	public int field168;

	@ObfuscatedName("client.Cd")
	public int field169;

	@ObfuscatedName("client.Dd")
	public int field170;

	@ObfuscatedName("client.Hd")
	public int field174;

	@ObfuscatedName("client.Od")
	public int field181;

	@ObfuscatedName("client.Vd")
	public int field185;

	@ObfuscatedName("client.Wd")
	public int field186;

	@ObfuscatedName("client.Xd")
	public int field187;

	@ObfuscatedName("client.be")
	public int field191;

	@ObfuscatedName("client.fe")
	public int field195;

	@ObfuscatedName("client.ge")
	public int field196;

	@ObfuscatedName("client.le")
	public int field199;

	@ObfuscatedName("client.pe")
	public int field201;

	@ObfuscatedName("client.Be")
	public int field212;

	@ObfuscatedName("client.Fe")
	public static int field216;

	@ObfuscatedName("client.Ie")
	public int field219;

	@ObfuscatedName("client.Ne")
	public int field224;

	@ObfuscatedName("client.Oe")
	public int field225;

	@ObfuscatedName("client.Pe")
	public int field226;

	@ObfuscatedName("client.Ue")
	public static int field231;

	@ObfuscatedName("client.Ve")
	public int field232;

	@ObfuscatedName("client.We")
	public int field233;

	@ObfuscatedName("client.Xe")
	public int field234;

	@ObfuscatedName("client.Ye")
	public int field235;

	@ObfuscatedName("client.Ze")
	public int field236;

	@ObfuscatedName("client.ef")
	public int field240;

	@ObfuscatedName("client.qf")
	public int field250;

	@ObfuscatedName("client.Rf")
	public int field274;

	@ObfuscatedName("client.Uf")
	public int field276;

	@ObfuscatedName("client.Vf")
	public int field277;

	@ObfuscatedName("client.Wf")
	public int field278;

	@ObfuscatedName("client.dg")
	public int field285;

	@ObfuscatedName("client.gg")
	public int field288;

	@ObfuscatedName("client.jg")
	public int field291;

	@ObfuscatedName("client.ng")
	public static int field294;

	@ObfuscatedName("client.pg")
	public int field296;

	@ObfuscatedName("client.rg")
	public int field297;

	@ObfuscatedName("client.sg")
	public int field298;

	@ObfuscatedName("client.ug")
	public int field300;

	@ObfuscatedName("client.vg")
	public int field301;

	@ObfuscatedName("client.Cg")
	public int field308;

	@ObfuscatedName("client.Eg")
	public int field310;

	@ObfuscatedName("client.Fg")
	public int field311;

	@ObfuscatedName("client.Gg")
	public int field312;

	@ObfuscatedName("client.Jg")
	public int field315;

	@ObfuscatedName("client.Lg")
	public int field317;

	@ObfuscatedName("client.Mg")
	public int field318;

	@ObfuscatedName("client.Ng")
	public int field319;

	@ObfuscatedName("client.Pg")
	public int field321;

	@ObfuscatedName("client.Qg")
	public int field322;

	@ObfuscatedName("client.Rg")
	public int field323;

	@ObfuscatedName("client.Sg")
	public int field324;

	@ObfuscatedName("client.Tg")
	public int field325;

	@ObfuscatedName("client.Xg")
	public int field328;

	@ObfuscatedName("client.Yg")
	public static int field329;

	@ObfuscatedName("client.eh")
	public int field334;

	@ObfuscatedName("client.fh")
	public int field335;

	@ObfuscatedName("client.gh")
	public int field336;

	@ObfuscatedName("client.hh")
	public int field337;

	@ObfuscatedName("client.ih")
	public int field338;

	@ObfuscatedName("client.jh")
	public int field339;

	@ObfuscatedName("client.kh")
	public int field340;

	@ObfuscatedName("client.lh")
	public int field341;

	@ObfuscatedName("client.mh")
	public int field342;

	@ObfuscatedName("client.nh")
	public int field343;

	@ObfuscatedName("client.uh")
	public int field349;

	@ObfuscatedName("client.xh")
	public int field352;

	@ObfuscatedName("client.yh")
	public int field353;

	@ObfuscatedName("client.Eh")
	public static int field358;

	@ObfuscatedName("client.Lh")
	public int field364;

	@ObfuscatedName("client.Mh")
	public int field365;

	@ObfuscatedName("client.Oh")
	public int field367;

	@ObfuscatedName("client.Sh")
	public int field370;

	@ObfuscatedName("client.Th")
	public int field371;

	@ObfuscatedName("client.Uh")
	public int field372;

	@ObfuscatedName("client.Vh")
	public int field373;

	@ObfuscatedName("client.Wh")
	public int field374;

	@ObfuscatedName("client.Zh")
	public static int field377;

	@ObfuscatedName("client.ai")
	public int field378;

	@ObfuscatedName("client.bi")
	public int field379;

	@ObfuscatedName("client.di")
	public int field380;

	@ObfuscatedName("client.ei")
	public int field381;

	@ObfuscatedName("client.hi")
	public int field384;

	@ObfuscatedName("client.ii")
	public int field385;

	@ObfuscatedName("client.ri")
	public int field393;

	@ObfuscatedName("client.si")
	public int field394;

	@ObfuscatedName("client.wi")
	public int field398;

	@ObfuscatedName("client.Bi")
	public static int field401;

	@ObfuscatedName("client.Fi")
	public int field404;

	@ObfuscatedName("client.Hi")
	public int field406;

	@ObfuscatedName("client.Ii")
	public int field407;

	@ObfuscatedName("client.Pi")
	public int field412;

	@ObfuscatedName("client.Ri")
	public int field414;

	@ObfuscatedName("client.Si")
	public int field415;

	@ObfuscatedName("client.Yi")
	public int field420;

	@ObfuscatedName("client.Zi")
	public int field421;

	@ObfuscatedName("client.aj")
	public int field422;

	@ObfuscatedName("client.bj")
	public static int field423;

	@ObfuscatedName("client.ej")
	public int field426;

	@ObfuscatedName("client.hj")
	public int field429;

	@ObfuscatedName("client.yj")
	public int field446;

	@ObfuscatedName("client.Bj")
	public int field448;

	@ObfuscatedName("client.Cj")
	public int field449;

	@ObfuscatedName("client.N")
	public int field45;

	@ObfuscatedName("client.Dj")
	public int field450;

	@ObfuscatedName("client.Ej")
	public int field451;

	@ObfuscatedName("client.Fj")
	public int field452;

	@ObfuscatedName("client.Jj")
	public int field456;

	@ObfuscatedName("client.O")
	public int field46;

	@ObfuscatedName("client.Nj")
	public int field460;

	@ObfuscatedName("client.Pj")
	public int field462;

	@ObfuscatedName("client.Sj")
	public static int field465;

	@ObfuscatedName("client.Yj")
	public int field471;

	@ObfuscatedName("client.Zj")
	public int field472;

	@ObfuscatedName("client.ak")
	public static int field473;

	@ObfuscatedName("client.dk")
	public int field475;

	@ObfuscatedName("client.ek")
	public int field476;

	@ObfuscatedName("client.fk")
	public int field477;

	@ObfuscatedName("client.gk")
	public int field478;

	@ObfuscatedName("client.ik")
	public int field480;

	@ObfuscatedName("client.kk")
	public static int field482;

	@ObfuscatedName("client.kb")
	public int field63;

	@ObfuscatedName("client.qb")
	public int field67;

	@ObfuscatedName("client.rb")
	public int field68;

	@ObfuscatedName("client.sb")
	public int field69;

	@ObfuscatedName("client.tb")
	public int field70;

	@ObfuscatedName("client.wb")
	public int field72;

	@ObfuscatedName("client.xb")
	public int field73;

	@ObfuscatedName("client.Cb")
	public int field78;

	@ObfuscatedName("client.Db")
	public int field79;

	@ObfuscatedName("client.Fb")
	public int field81;

	@ObfuscatedName("client.Gb")
	public int field82;

	@ObfuscatedName("client.Hb")
	public int field83;

	@ObfuscatedName("client.Ib")
	public int field84;

	@ObfuscatedName("client.Jb")
	public int field85;

	@ObfuscatedName("client.Kb")
	public int field86;

	@ObfuscatedName("client.Nb")
	public static int field89;

	@ObfuscatedName("client.Sb")
	public int field93;

	@ObfuscatedName("client.Vb")
	public int field96;

	@ObfuscatedName("client.Xb")
	public int field97;

	@ObfuscatedName("client.De")
	public long field214;

	@ObfuscatedName("client.og")
	public long field295;

	@ObfuscatedName("client.tg")
	public long field299;

	@ObfuscatedName("client.wg")
	public long field302;

	@ObfuscatedName("client.Rb")
	public long field92;

	@ObfuscatedName("client.Yc")
	public AKPFVPPG field143;

	@ObfuscatedName("client.oh")
	public CAMKASVY field344;

	@ObfuscatedName("client.ph")
	public CAMKASVY field345;

	@ObfuscatedName("client.qh")
	public CAMKASVY field346;

	@ObfuscatedName("client.rh")
	public CAMKASVY field347;

	@ObfuscatedName("client.Wj")
	public GFMKEKCW field469;

	@ObfuscatedName("client.Oc")
	public HZYGKZDT field133;

	@ObfuscatedName("client.Pc")
	public HZYGKZDT field134;

	@ObfuscatedName("client.Qc")
	public HZYGKZDT field135;

	@ObfuscatedName("client.Rc")
	public HZYGKZDT field136;

	@ObfuscatedName("client.Sc")
	public HZYGKZDT field137;

	@ObfuscatedName("client.Tc")
	public HZYGKZDT field138;

	@ObfuscatedName("client.Uc")
	public HZYGKZDT field139;

	@ObfuscatedName("client.Vc")
	public HZYGKZDT field140;

	@ObfuscatedName("client.Wc")
	public HZYGKZDT field141;

	@ObfuscatedName("client.sf")
	public HZYGKZDT field251;

	@ObfuscatedName("client.tf")
	public HZYGKZDT field252;

	@ObfuscatedName("client.uf")
	public HZYGKZDT field253;

	@ObfuscatedName("client.mi")
	public HZYGKZDT field389;

	@ObfuscatedName("client.ni")
	public HZYGKZDT field390;

	@ObfuscatedName("client.oi")
	public HZYGKZDT field391;

	@ObfuscatedName("client.pi")
	public HZYGKZDT field392;

	@ObfuscatedName("client.Y")
	public HZYGKZDT field53;

	@ObfuscatedName("client.Z")
	public HZYGKZDT field54;

	@ObfuscatedName("client.ab")
	public HZYGKZDT field55;

	@ObfuscatedName("client.bb")
	public HZYGKZDT field56;

	@ObfuscatedName("client.cb")
	public HZYGKZDT field57;

	@ObfuscatedName("client.db")
	public HZYGKZDT field58;

	@ObfuscatedName("client.eb")
	public HZYGKZDT field59;

	@ObfuscatedName("client.fb")
	public HZYGKZDT field60;

	@ObfuscatedName("client.gb")
	public HZYGKZDT field61;

	@ObfuscatedName("client.uc")
	public ITVAFKCK field116;

	@ObfuscatedName("client.vc")
	public ITVAFKCK field117;

	@ObfuscatedName("client.wc")
	public ITVAFKCK field118;

	@ObfuscatedName("client.Id")
	public ITVAFKCK field175;

	@ObfuscatedName("client.Jd")
	public ITVAFKCK field176;

	@ObfuscatedName("client.Kd")
	public ITVAFKCK field177;

	@ObfuscatedName("client.Ld")
	public ITVAFKCK field178;

	@ObfuscatedName("client.Md")
	public ITVAFKCK field179;

	@ObfuscatedName("client.Qd")
	public ITVAFKCK field182;

	@ObfuscatedName("client.Rd")
	public ITVAFKCK field183;

	@ObfuscatedName("client.af")
	public ITVAFKCK field237;

	@ObfuscatedName("client.bf")
	public ITVAFKCK field238;

	@ObfuscatedName("client.lf")
	public ITVAFKCK field245;

	@ObfuscatedName("client.mf")
	public ITVAFKCK field246;

	@ObfuscatedName("client.nf")
	public ITVAFKCK field247;

	@ObfuscatedName("client.of")
	public ITVAFKCK field248;

	@ObfuscatedName("client.pf")
	public ITVAFKCK field249;

	@ObfuscatedName("client.Vi")
	public ITVAFKCK field417;

	@ObfuscatedName("client.Wi")
	public ITVAFKCK field418;

	@ObfuscatedName("client.Xi")
	public ITVAFKCK field419;

	@ObfuscatedName("client.ee")
	public KUDWIDHU field194;

	@ObfuscatedName("client.Ff")
	public KUDWIDHU field263;

	@ObfuscatedName("client.yg")
	public KUDWIDHU field304;

	@ObfuscatedName("client.zg")
	public KUDWIDHU field305;

	@ObfuscatedName("client.Xh")
	public KUDWIDHU field375;

	@ObfuscatedName("client.Yh")
	public KUDWIDHU field376;

	@ObfuscatedName("client.fi")
	public KUDWIDHU field382;

	@ObfuscatedName("client.jj")
	public KUDWIDHU field431;

	@ObfuscatedName("client.kj")
	public KUDWIDHU field432;

	@ObfuscatedName("client.tj")
	public KUDWIDHU field441;

	@ObfuscatedName("client.uj")
	public KUDWIDHU field442;

	@ObfuscatedName("client.vj")
	public KUDWIDHU field443;

	@ObfuscatedName("client.wj")
	public KUDWIDHU field444;

	@ObfuscatedName("client.xj")
	public KUDWIDHU field445;

	@ObfuscatedName("client.Hj")
	public KUDWIDHU field454;

	@ObfuscatedName("client.ch")
	public LVBGZMMP field332;

	@ObfuscatedName("client.mg")
	public SRCZZRYO field293;

	@ObfuscatedName("client.lc")
	public XNSGYTEG field110;

	@ObfuscatedName("client.rj")
	public YEQNFKYU field439;

	@ObfuscatedName("client.jb")
	public static YFPQHQAV field62;

	@ObfuscatedName("client.id")
	public String field152;

	@ObfuscatedName("client.vh")
	public String field350;

	@ObfuscatedName("client.Dh")
	public String field357;

	@ObfuscatedName("client.Lb")
	public String field87;

	@ObfuscatedName("client.Bg")
	public Socket field307;

	@ObfuscatedName("client.gc")
	public static boolean field106;

	@ObfuscatedName("client.ce")
	public static boolean field192;

	@ObfuscatedName("client.xg")
	public static boolean field303;

	@ObfuscatedName("client.Pb")
	public static boolean field91;

	@ObfuscatedName("client.Cc")
	public int[] field122;

	@ObfuscatedName("client.Dc")
	public int[] field123;

	@ObfuscatedName("client.Af")
	public int[] field259;

	@ObfuscatedName("client.Bf")
	public int[] field260;

	@ObfuscatedName("client.Cf")
	public int[] field261;

	@ObfuscatedName("client.Df")
	public int[] field262;

	@ObfuscatedName("client.Gf")
	public int[] field264;

	@ObfuscatedName("client.Hf")
	public int[] field265;

	@ObfuscatedName("client.If")
	public int[] field266;

	@ObfuscatedName("client.Jf")
	public int[] field267;

	@ObfuscatedName("client.Xf")
	public int[] field279;

	@ObfuscatedName("client.Yf")
	public int[] field280;

	@ObfuscatedName("client.Zf")
	public int[] field281;

	@ObfuscatedName("client.W")
	public int[] field51;

	@ObfuscatedName("client.X")
	public int[] field52;

	@ObfuscatedName("client.Jh")
	public ITVAFKCK[] field362;

	@ObfuscatedName("client.yi")
	public byte[][] field399;

	@ObfuscatedName("client.M")
	public byte[][] field44;

	@ObfuscatedName("client.jk")
	public byte[][][] field481;

	@ObfuscatedName("client.qj")
	public int[][][] field438;

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method41(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field387 = "";
				field388 = "Connecting to server...";
				method100(true);
			}

			field293 = new SRCZZRYO(method73(field89 + 43594), this);
			long var4 = RPCTGZHI.method445(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field100.field535 = 0;
			field100.method203(14);
			field100.method203(var6);
			field293.method460(2, field100.field534, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field293.method457();
			}

			int var8 = field293.method457();
			int var9 = var8;

			if (var8 == 0) {
				field293.method459(field453.field534, 0, 8);
				field453.field535 = 0;
				field214 = field453.method219();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field214 >> 32), (int) field214 };
				field100.field535 = 0;
				field100.method203(10);
				field100.method207(var10[0]);
				field100.method207(var10[1]);
				field100.method207(var10[2]);
				field100.method207(var10[3]);
				field100.method207(signlink.uid);
				field100.method210(arg0);
				field100.method210(arg1);
				field100.method228(field48, field121);
				field242.field535 = 0;

				if (arg2) {
					field242.method203(18);
				} else {
					field242.method203(16);
				}

				field242.method203(field100.field535 + 36 + 1 + 1 + 2);
				field242.method203(255);
				field242.method204(372);
				field242.method203(field91 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field242.method207(field49[var11]);
				}

				field242.method211(0, field100.field534, field100.field535);
				field100.field539 = new YEQNFKYU(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field439 = new YEQNFKYU(var10);
				field293.method460(field242.field535, field242.field534, 0);
				var8 = field293.method457();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method41(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field142 = field293.method457();
				field106 = field293.method457() == 1;
				field299 = 0L;
				field298 = 0;
				field469.field568 = 0;
				field510 = true;
				field468 = true;
				field230 = true;
				field100.field535 = 0;
				field453.field535 = 0;
				field371 = -1;
				field101 = -1;
				field102 = -1;
				field103 = -1;
				field370 = 0;
				field372 = 0;
				field456 = 0;
				field374 = 0;
				field480 = 0;
				field364 = 0;
				field211 = false;
				field511 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field258[var13] = null;
				}

				field83 = 0;
				field149 = 0;
				field328 = 0;
				field63 = 0;
				field93 = (int) (Math.random() * 100.0D) - 50;
				field394 = (int) (Math.random() * 110.0D) - 55;
				field315 = (int) (Math.random() * 80.0D) - 40;
				field365 = (int) (Math.random() * 120.0D) - 60;
				field157 = (int) (Math.random() * 30.0D) - 20;
				field310 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field82 = 0;
				field189 = -1;
				field380 = 0;
				field381 = 0;
				field460 = 0;
				field404 = 0;

				for (int var14 = 0; var14 < field457; var14++) {
					field459[var14] = null;
					field464[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field403[var15] = null;
				}

				field62 = field459[field458] = new YFPQHQAV();
				field108.method426();
				field184.method426();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field227[var16][var17][var18] = null;
						}
					}
				}

				field363 = new QGWIBVPG();
				field196 = 0;
				field195 = 0;
				method50(field159);
				field159 = -1;
				method50(field153);
				field153 = -1;
				method50(field109);
				field109 = -1;
				method50(field221);
				field221 = -1;
				method50(field435);
				field435 = -1;
				method50(field437);
				field437 = -1;
				method50(field427);
				field427 = -1;
				field190 = false;
				field272 = 3;
				field81 = 0;
				field211 = false;
				field289 = false;
				field350 = null;
				field96 = 0;
				field193 = -1;
				field64 = true;
				method131();

				for (int var19 = 0; var19 < 5; var19++) {
					field162[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field268[var20] = null;
					field269[var20] = false;
				}

				field358 = 0;
				field377 = 0;
				field465 = 0;
				field473 = 0;
				field294 = 0;
				method182();
			} else if (var8 == 3) {
				field387 = "";
				field388 = "Invalid username or password.";
			} else if (var8 == 4) {
				field387 = "Your account has been disabled.";
				field388 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field387 = "Your account is already logged in.";
				field388 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field387 = "RuneScape has been updated!";
				field388 = "Please reload this page.";
			} else if (var8 == 7) {
				field387 = "This world is full.";
				field388 = "Please use a different world.";
			} else if (var8 == 8) {
				field387 = "Unable to connect.";
				field388 = "Login server offline.";
			} else if (var8 == 9) {
				field387 = "Login limit exceeded.";
				field388 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field387 = "Unable to connect.";
				field388 = "Bad session id.";
			} else if (var8 == 12) {
				field387 = "You need a members account to login to this world.";
				field388 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field387 = "Could not complete login.";
				field388 = "Please try using a different world.";
			} else if (var8 == 14) {
				field387 = "The server is being updated.";
				field388 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field230 = true;
				field100.field535 = 0;
				field453.field535 = 0;
				field371 = -1;
				field101 = -1;
				field102 = -1;
				field103 = -1;
				field370 = 0;
				field372 = 0;
				field456 = 0;
				field364 = 0;
				field211 = false;
				field295 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field387 = "Login attempts exceeded.";
				field388 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field387 = "You are standing in a members-only area.";
				field388 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field387 = "Invalid loginserver requested";
				field388 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field293.method457();
				for (var21 += 3; var21 >= 0; var21--) {
					field387 = "You have only just left another world";
					field388 = "Your profile will be transferred in: " + var21;
					method100(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method41(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field387 = "Malformed login packet.";
				field388 = "Please try again.";
			} else if (var8 == 23) {
				field387 = "No reply from loginserver.";
				field388 = "Please try again.";
			} else if (var8 == 24) {
				field387 = "Error loading your profile.";
				field388 = "Please contact customer support.";
			} else if (var8 == 25) {
				field387 = "Unexpected loginserver response.";
				field388 = "Please try using a different world.";
			} else if (var8 == 26) {
				field387 = "This computers address has been blocked";
				field388 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field387 = "Unexpected server response";
				field388 = "Please try using a different world.";
			} else if (var9 != 0) {
				field387 = "No response from server";
				field388 = "Please try using a different world.";
			} else if (field112 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field112++;
				method41(arg0, arg1, arg2);
			} else {
				field387 = "No response from loginserver";
				field388 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field387 = "";
			field388 = "Error connecting to server.";
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 372);

			if (arg0.length == 5) {
				field88 = Integer.parseInt(arg0[0]);
				field89 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method59();
				} else if (arg0[2].equals("highmem")) {
					method184();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field90 = false;
				} else if (arg0[3].equals("members")) {
					field90 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method189(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IZ[B)Z")
	public final boolean method42(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.f(I)V")
	public final void method43() {
		if (field82 == 0 && field519 == 1) {
			int var1 = field520 - 25 - 550;
			int var2 = field521 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field365 + field310 & 0x7FF;
				int var4 = ZUDKHAVN.field1490[var3];
				int var5 = ZUDKHAVN.field1491[var3];
				var4 = (field157 + 256) * var4 >> 8;
				var5 = (field157 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field62.field1082 + var6 >> 7;
				int var9 = field62.field1083 - var7 >> 7;
				boolean var10 = method164(var9, 1, 0, 0, 0, field62.field1086[0], field62.field1085[0], true, var8, 0, 0);
				if (var10) {
					field100.method203(var1);
					field100.method203(var2);
					field100.method204(field310);
					field100.method203(57);
					field100.method203(field365);
					field100.method203(field157);
					field100.method203(89);
					field100.method204(field62.field1082);
					field100.method204(field62.field1083);
					field100.method203(field78);
					field100.method203(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)V")
	public final void method44(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field285 = 0;
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

			field285 = 0;
			label46: for (int var7 = 0; var7 < NCBEIRPV.field838; var7++) {
				NCBEIRPV var8 = NCBEIRPV.method390(var7);
				if (var8.field844 == -1 && var8.field833 != null) {
					String var9 = var8.field833.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field286[field285] = var9;
					field287[field285] = var7;
					field285++;
					if (field285 >= field286.length) {
						return;
					}
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

	@ObfuscatedName("client.a(IILPCARWQQC;IIIIII)V")
	public final void method45(int arg0, int arg1, PCARWQQC arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field348) {
			field379 = 32;
		} else {
			field379 = 0;
		}

		field348 = false;
		if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
			arg2.field905 -= field185 * 4;

			if (arg0 == 1) {
				field333 = true;
			}

			if (arg0 == 2 || arg0 == 3) {
				field386 = true;
			}
		} else if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 >= arg3 + arg4 - 16 && arg7 < arg3 + arg4) {
			arg2.field905 += field185 * 4;

			if (arg0 == 1) {
				field333 = true;
			}

			if (arg0 == 2 || arg0 == 3) {
				field386 = true;
			}
		} else if (arg6 >= arg1 - field379 && arg6 < arg1 + field379 + 16 && arg7 >= arg3 + 16 && arg7 < arg3 + arg4 - 16 && field185 > 0) {
			int var9 = (arg4 - 32) * arg4 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg3 - var9 / 2 - 16;
			int var11 = arg4 - var9 - 32;
			arg2.field905 = (arg5 - arg4) * var10 / var11;

			if (arg0 == 1) {
				field333 = true;
			}

			if (arg0 == 2 || arg0 == 3) {
				field386 = true;
			}

			field348 = true;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method46() {
		field446++;
		method185(true);
		method118(true);
		method185(false);
		method118(false);
		method94();
		method99();

		if (!field273) {
			int var1 = field309;
			if (field72 / 256 > var1) {
				var1 = field72 / 256;
			}

			if (field292[4] && field455[4] + 128 > var1) {
				var1 = field455[4] + 128;
			}

			int var2 = field315 + field310 & 0x7FF;
			method157(field169, method106(field62.field1082, field349, field62.field1083) - 50, field168, var1 * 3 + 600, var2, var1);
		}

		int var3;
		if (field273) {
			var3 = method146();
		} else {
			var3 = method145();
		}

		int var4 = field232;
		int var5 = field233;
		int var6 = field234;
		int var7 = field235;
		int var8 = field236;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field292[var9]) {
				int var10 = (int) (Math.random() * (field409[var9] * 2 + 1) + Math.sin(field466[var9] / 100.0D * field119[var9]) * field455[var9] - field409[var9]);
				if (var9 == 0) {
					field232 += var10;
				}

				if (var9 == 1) {
					field233 += var10;
				}

				if (var9 == 2) {
					field234 += var10;
				}

				if (var9 == 3) {
					field236 = field236 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field235 += var10;
					if (field235 < 128) {
						field235 = 128;
					}

					if (field235 > 383) {
						field235 = 383;
					}
				}
			}
		}

		int var11 = ZUDKHAVN.field1501;
		KUGNQTGL.field728 = true;
		KUGNQTGL.field731 = 0;
		KUGNQTGL.field729 = field513 - 4;
		KUGNQTGL.field730 = field514 - 4;
		CBERHIHM.method31();
		field110.method526(field235, field232, field236, field233, field234, var3);
		field110.method501();
		method152();
		method67();
		method105(var11);
		method163();
		field391.method295(4, field505, 4);
		field232 = var4;
		field233 = var5;
		field234 = var6;
		field235 = var7;
		field236 = var8;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method47(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field110.method513(arg4, arg2, arg3);
		if (var6 != 0) {
			int var7 = field110.method517(arg4, arg2, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field382.field658;
			int var12 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			PZYCJUKA var14 = PZYCJUKA.method409(var13);
			if (var14.field1010 == -1) {
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
				ITVAFKCK var15 = field474[var14.field1010];
				if (var15 != null) {
					int var16 = (var14.field982 * 4 - var15.field607) / 2;
					int var17 = (var14.field977 * 4 - var15.field608) / 2;
					var15.method304(arg2 * 4 + var16 + 48, (104 - arg3 - var14.field977) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field110.method515(arg4, arg2, arg3);
		if (var18 != 0) {
			int var19 = field110.method517(arg4, arg2, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			PZYCJUKA var23 = PZYCJUKA.method409(var22);
			if (var23.field1010 != -1) {
				ITVAFKCK var24 = field474[var23.field1010];
				if (var24 != null) {
					int var25 = (var23.field982 * 4 - var24.field607) / 2;
					int var26 = (var23.field977 * 4 - var24.field608) / 2;
					var24.method304(arg2 * 4 + var25 + 48, (104 - arg3 - var23.field977) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field382.field658;
				int var29 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = field110.method516(arg4, arg2, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			PZYCJUKA var32 = PZYCJUKA.method409(var31);
			if (var32.field1010 != -1) {
				ITVAFKCK var33 = field474[var32.field1010];
				if (var33 != null) {
					int var34 = (var32.field982 * 4 - var33.field607) / 2;
					int var35 = (var32.field977 * 4 - var33.field608) / 2;
					var33.method304(arg2 * 4 + var34 + 48, (104 - arg3 - var32.field977) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method48(int arg0, int arg1) {
		QGWIBVPG var3 = field227[field349][arg0][arg1];
		if (var3 == null) {
			field110.method508(field349, arg0, arg1);
		} else {
			int var4 = -99999999;
			CCYSOVSO var5 = null;
			for (CCYSOVSO var6 = (CCYSOVSO) var3.method422(); var6 != null; var6 = (CCYSOVSO) var3.method424()) {
				NCBEIRPV var7 = NCBEIRPV.method390(var6.field34);
				int var8 = var7.field843;
				if (var7.field858) {
					var8 = (var6.field35 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method420(var5);
			CCYSOVSO var9 = null;
			CCYSOVSO var10 = null;
			for (CCYSOVSO var11 = (CCYSOVSO) var3.method422(); var11 != null; var11 = (CCYSOVSO) var3.method424()) {
				if (var5.field34 != var11.field34 && var9 == null) {
					var9 = var11;
				}

				if (var5.field34 != var11.field34 && var9.field34 != var11.field34 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field110.method494(var5, arg0, field349, var9, var12, method106(arg0 * 128 + 64, field349, arg1 * 128 + 64), var10, arg1);
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method49() {
		field113 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field223) {
				field300++;
				method125();
				method125();
				method169();
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

		field113 = false;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method50(int arg0) {
		PCARWQQC.method396(arg0);
	}

	@ObfuscatedName("client.a(LFTMSICIZ;II)V")
	public final void method51(FTMSICIZ arg0, int arg1) {
		int var3 = arg0.method224(8);
		if (var3 < field460) {
			for (int var4 = var3; var4 < field460; var4++) {
				field74[field73++] = field461[var4];
			}
		}

		if (var3 > field460) {
			signlink.reporterror(field75 + " Too many players");
			throw new RuntimeException("eek");
		}

		field460 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field461[var5];
			YFPQHQAV var7 = field459[var6];
			int var8 = arg0.method224(1);
			if (var8 == 0) {
				field461[field460++] = var6;
				var7.field1100 = field231;
			} else {
				int var9 = arg0.method224(2);
				if (var9 == 0) {
					field461[field460++] = var6;
					var7.field1100 = field231;
					field463[field462++] = var6;
				} else if (var9 == 1) {
					field461[field460++] = var6;
					var7.field1100 = field231;
					int var10 = arg0.method224(3);
					var7.method430(var10, false);
					int var11 = arg0.method224(1);
					if (var11 == 1) {
						field463[field462++] = var6;
					}
				} else if (var9 == 2) {
					field461[field460++] = var6;
					var7.field1100 = field231;
					int var12 = arg0.method224(3);
					var7.method430(var12, true);
					int var13 = arg0.method224(3);
					var7.method430(var13, true);
					int var14 = arg0.method224(1);
					if (var14 == 1) {
						field463[field462++] = var6;
					}
				} else if (var9 == 3) {
					field74[field73++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LFTMSICIZ;II)V")
	public final void method52(FTMSICIZ arg0, int arg1) {
		field73 = 0;
		field462 = 0;
		method56(arg1, arg0);
		method93(arg1, arg0);
		method132(arg0, arg1);

		for (int var3 = 0; var3 < field73; var3++) {
			int var4 = field74[var3];
			if (field231 != field403[var4].field1100) {
				field403[var4].field1304 = null;
				field403[var4] = null;
			}
		}

		if (arg0.field535 != arg1) {
			signlink.reporterror(field75 + " size mismatch in getnpcpos - pos:" + arg0.field535 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field404; var5++) {
			if (field403[field405[var5]] == null) {
				signlink.reporterror(field75 + " null entry in npc list - pos:" + var5 + " size:" + field404);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method53() {
		if (field374 > 0) {
			method138();
		} else {
			method139("Please wait - attempting to reestablish", "Connection lost");
			field82 = 0;
			field380 = 0;
			SRCZZRYO var1 = field293;
			field230 = false;
			field112 = 0;
			method41(field75, field76, true);

			if (!field230) {
				method138();
			}

			try {
				var1.method456();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method54() {
		int var1 = field346.method15("Choose Option");
		for (int var2 = 0; var2 < field364; var2++) {
			int var3 = field346.method15(field95[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field364 * 15 + 21;
		if (field520 > 4 && field521 > 4 && field520 < 516 && field521 < 338) {
			int var5 = field520 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field521 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field211 = true;
			field163 = 0;
			field164 = var5;
			field165 = var6;
			field166 = var1;
			field167 = field364 * 15 + 22;
		}

		if (field520 > 553 && field521 > 205 && field520 < 743 && field521 < 466) {
			int var7 = field520 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field521 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field211 = true;
			field163 = 1;
			field164 = var7;
			field165 = var8;
			field166 = var1;
			field167 = field364 * 15 + 22;
		}

		if (field520 > 17 && field521 > 357 && field520 < 496 && field521 < 453) {
			int var9 = field520 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field521 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field211 = true;
			field163 = 2;
			field164 = var9;
			field165 = var10;
			field166 = var1;
			field167 = field364 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method55(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field195; var3++) {
				if (field71[var3] == arg0) {
					field195--;
					field333 = true;

					for (int var4 = var3; var4 < field195; var4++) {
						field400[var4] = field400[var4 + 1];
						field197[var4] = field197[var4 + 1];
						field71[var4] = field71[var4 + 1];
					}

					field100.method202(99);
					field100.method209(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILFTMSICIZ;I)V")
	public final void method56(int arg0, FTMSICIZ arg1) {
		arg1.method223();
		int var3 = arg1.method224(8);
		if (var3 < field404) {
			for (int var4 = var3; var4 < field404; var4++) {
				field74[field73++] = field405[var4];
			}
		}

		if (var3 > field404) {
			signlink.reporterror(field75 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field404 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field405[var5];
			VMSVDNWD var7 = field403[var6];
			int var8 = arg1.method224(1);
			if (var8 == 0) {
				field405[field404++] = var6;
				var7.field1100 = field231;
			} else {
				int var9 = arg1.method224(2);
				if (var9 == 0) {
					field405[field404++] = var6;
					var7.field1100 = field231;
					field463[field462++] = var6;
				} else if (var9 == 1) {
					field405[field404++] = var6;
					var7.field1100 = field231;
					int var10 = arg1.method224(3);
					var7.method430(var10, false);
					int var11 = arg1.method224(1);
					if (var11 == 1) {
						field463[field462++] = var6;
					}
				} else if (var9 == 2) {
					field405[field404++] = var6;
					var7.field1100 = field231;
					int var12 = arg1.method224(3);
					var7.method430(var12, true);
					int var13 = arg1.method224(3);
					var7.method430(var13, true);
					int var14 = arg1.method224(1);
					if (var14 == 1) {
						field463[field462++] = var6;
					}
				} else if (var9 == 3) {
					field74[field73++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method57() {
		if (!field290 && !field270 && !field107) {
			field231++;

			if (field230) {
				method72();
			} else {
				method70();
			}

			method165();
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method58() {
		field291 = 0;
		int var1 = (field62.field1082 >> 7) + field67;
		int var2 = (field62.field1083 >> 7) + field68;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field291 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field291 = 1;
		}

		if (field291 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field291 = 0;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public static final void method59() {
		XNSGYTEG.field1321 = true;
		ZUDKHAVN.field1481 = true;
		field91 = true;
		YIGACPUG.field1432 = true;
		PZYCJUKA.field1005 = true;
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method60(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field110.method517(field349, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			PZYCJUKA var8 = PZYCJUKA.method409(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field982;
				var10 = var8.field977;
			} else {
				var9 = var8.field977;
				var10 = var8.field982;
			}

			int var11 = var8.field970;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method164(arg2, 2, var11, 0, var9, field62.field1086[0], field62.field1085[0], true, arg1, var10, 0);
		} else {
			method164(arg2, 2, 0, var7, 0, field62.field1086[0], field62.field1085[0], true, arg1, 0, var6 + 1);
		}

		field334 = field520;
		field335 = field521;
		field337 = 2;
		field336 = 0;
		return true;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method61() {
		if (field290 || field270 || field107) {
			method149();
		} else {
			field423++;

			if (field230) {
				method85();
			} else {
				method100(false);
			}

			field185 = 0;
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method62(int arg0, int arg1) {
		boolean var3 = false;
		PCARWQQC var4 = PCARWQQC.method394(arg0);
		for (int var5 = 0; var5 < var4.field891.length && var4.field891[var5] != -1; var5++) {
			PCARWQQC var6 = PCARWQQC.method394(var4.field891[var5]);
			if (var6.field920 == 0) {
				var3 |= method62(var6.field895, arg1);
			}

			if (var6.field920 == 6 && (var6.field883 != -1 || var6.field884 != -1)) {
				boolean var7 = method74(var6);
				int var8;
				if (var7) {
					var8 = var6.field884;
				} else {
					var8 = var6.field883;
				}

				if (var8 != -1) {
					PQTJDTHH var9 = PQTJDTHH.field951[var8];
					var6.field896 += arg1;
					while (var6.field896 > var9.method405(var6.field881)) {
						var6.field896 -= var9.method405(var6.field881);
						var6.field881++;
						if (var6.field881 >= var9.field952) {
							var6.field881 -= var9.field956;
							if (var6.field881 < 0 || var6.field881 >= var9.field952) {
								var6.field881 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field920 == 6 && var6.field886 != 0) {
				int var10 = var6.field886 >> 16;
				int var11 = var6.field886 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field923 = var6.field923 + var10 & 0x7FF;
				var6.field924 = var6.field924 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method63() {
		field390.method294();

		if (field82 == 2) {
			byte[] var1 = field418.field605;
			int[] var2 = CBERHIHM.field24;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field194.method322(33, field310, 256, field114, 33, field413, 0, 25, 25, 0);
			field391.method294();
			ZUDKHAVN.field1492 = field266;
		} else {
			int var5 = field365 + field310 & 0x7FF;
			int var6 = field62.field1082 / 32 + 48;
			int var7 = 464 - field62.field1083 / 32;
			field382.method322(151, var5, field157 + 256, field215, 146, field126, 5, var6, var7, 25);
			field194.method322(33, field310, 256, field114, 33, field413, 0, 25, 25, 0);

			for (int var8 = 0; var8 < field97; var8++) {
				int var9 = field98[var8] * 4 + 2 - field62.field1082 / 32;
				int var10 = field99[var8] * 4 + 2 - field62.field1083 / 32;
				method136(var9, field313[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					QGWIBVPG var13 = field227[field349][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field62.field1082 / 32;
						int var15 = var12 * 4 + 2 - field62.field1083 / 32;
						method136(var14, field441, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field404; var16++) {
				VMSVDNWD var17 = field403[field405[var16]];
				if (var17 != null && var17.method433()) {
					RDFTXEYV var18 = var17.field1304;
					if (var18.field1191 != null) {
						var18 = var18.method436();
					}

					if (var18 != null && var18.field1166 && var18.field1183) {
						int var19 = var17.field1082 / 32 - field62.field1082 / 32;
						int var20 = var17.field1083 / 32 - field62.field1083 / 32;
						method136(var19, field442, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field460; var21++) {
				YFPQHQAV var22 = field459[field461[var21]];
				if (var22 != null && var22.method433()) {
					int var23 = var22.field1082 / 32 - field62.field1082 / 32;
					int var24 = var22.field1083 / 32 - field62.field1083 / 32;
					boolean var25 = false;
					long var26 = RPCTGZHI.method445(var22.field1423);
					for (int var28 = 0; var28 < field195; var28++) {
						if (field71[var28] == var26 && field197[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field62.field1408 != 0 && var22.field1408 != 0 && field62.field1408 == var22.field1408) {
						var29 = true;
					}

					if (var25) {
						method136(var23, field444, var24);
					} else if (var29) {
						method136(var23, field445, var24);
					} else {
						method136(var23, field443, var24);
					}
				}
			}

			if (field480 != 0 && field231 % 20 < 10) {
				if (field480 == 1 && field301 >= 0 && field301 < field403.length) {
					VMSVDNWD var30 = field403[field301];
					if (var30 != null) {
						int var31 = var30.field1082 / 32 - field62.field1082 / 32;
						int var32 = var30.field1083 / 32 - field62.field1083 / 32;
						method98(var32, var31, field432);
					}
				}

				if (field480 == 2) {
					int var33 = (field321 - field67) * 4 + 2 - field62.field1082 / 32;
					int var34 = (field322 - field68) * 4 + 2 - field62.field1083 / 32;
					method98(var34, var33, field432);
				}

				if (field480 == 10 && field429 >= 0 && field429 < field459.length) {
					YFPQHQAV var35 = field459[field429];
					if (var35 != null) {
						int var36 = var35.field1082 / 32 - field62.field1082 / 32;
						int var37 = var35.field1083 / 32 - field62.field1083 / 32;
						method98(var37, var36, field432);
					}
				}
			}

			if (field380 != 0) {
				int var38 = field380 * 4 + 2 - field62.field1082 / 32;
				int var39 = field381 * 4 + 2 - field62.field1083 / 32;
				method136(var38, field431, var39);
			}

			CBERHIHM.method33(97, 0xFFFFFF, 78, 3, 3);
			field391.method294();
			ZUDKHAVN.field1492 = field266;
		}
	}

	public final void init() {
		field88 = Integer.parseInt(getParameter("nodeid"));
		field89 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method59();
		} else {
			method184();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field90 = false;
		} else {
			field90 = true;
		}

		method190(765, 503);
	}

	@ObfuscatedName("client.b(B)V")
	public final void method64() {
		field220 = true;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method65() {
		int var1 = field127 * 128 + 64;
		int var2 = field128 * 128 + 64;
		int var3 = method106(var1, field349, var2) - field129;

		if (field232 < var1) {
			field232 += (var1 - field232) * field131 / 1000 + field130;
			if (field232 > var1) {
				field232 = var1;
			}
		}

		if (field232 > var1) {
			field232 -= (field232 - var1) * field131 / 1000 + field130;
			if (field232 < var1) {
				field232 = var1;
			}
		}

		if (field233 < var3) {
			field233 += (var3 - field233) * field131 / 1000 + field130;
			if (field233 > var3) {
				field233 = var3;
			}
		}

		if (field233 > var3) {
			field233 -= (field233 - var3) * field131 / 1000 + field130;
			if (field233 < var3) {
				field233 = var3;
			}
		}

		if (field234 < var2) {
			field234 += (var2 - field234) * field131 / 1000 + field130;
			if (field234 > var2) {
				field234 = var2;
			}
		}

		if (field234 > var2) {
			field234 -= (field234 - var2) * field131 / 1000 + field130;
			if (field234 < var2) {
				field234 = var2;
			}
		}

		int var4 = field448 * 128 + 64;
		int var5 = field449 * 128 + 64;
		int var6 = method106(var4, field349, var5) - field450;
		int var7 = var4 - field232;
		int var8 = var6 - field233;
		int var9 = var5 - field234;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field235 < var11) {
			field235 += (var11 - field235) * field452 / 1000 + field451;
			if (field235 > var11) {
				field235 = var11;
			}
		}

		if (field235 > var11) {
			field235 -= (field235 - var11) * field452 / 1000 + field451;
			if (field235 < var11) {
				field235 = var11;
			}
		}

		int var13 = var12 - field236;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field236 += field452 * var13 / 1000 + field451;
			field236 &= 0x7FF;
		}

		if (var13 < 0) {
			field236 -= -var13 * field452 / 1000 + field451;
			field236 &= 0x7FF;
		}

		int var14 = var12 - field236;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field236 = var12;
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method66() {
		byte[] var1 = field143.method7("title.dat", null);
		KUDWIDHU var2 = new KUDWIDHU(var1, this);
		field136.method294();
		var2.method316(0, 0);
		field137.method294();
		var2.method316(-637, 0);
		field133.method294();
		var2.method316(-128, 0);
		field134.method294();
		var2.method316(-202, -371);
		field135.method294();
		var2.method316(-202, -171);
		field138.method294();
		var2.method316(0, -265);
		field139.method294();
		var2.method316(-562, -265);
		field140.method294();
		var2.method316(-128, -171);
		field141.method294();
		var2.method316(-562, -171);
		int[] var3 = new int[var2.field659];
		for (int var4 = 0; var4 < var2.field660; var4++) {
			for (int var5 = 0; var5 < var2.field659; var5++) {
				var3[var5] = var2.field658[var2.field659 * var4 + var2.field659 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field659; var6++) {
				var2.field658[var2.field659 * var4 + var6] = var3[var6];
			}
		}

		field136.method294();
		var2.method316(382, 0);
		field137.method294();
		var2.method316(-255, 0);
		field133.method294();
		var2.method316(254, 0);
		field134.method294();
		var2.method316(180, -371);
		field135.method294();
		var2.method316(180, -171);
		field138.method294();
		var2.method316(382, -265);
		field139.method294();
		var2.method316(-180, -265);
		field140.method294();
		var2.method316(254, -171);
		field141.method294();
		var2.method316(-180, -171);
		KUDWIDHU var7 = new KUDWIDHU(field143, "logo", 0);
		field133.method294();
		var7.method318(382 - var7.field659 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.k(I)V")
	public final void method67() {
		if (field480 == 2) {
			method151(field323 * 2, (field322 - field68 << 7) + field325, (field321 - field67 << 7) + field324);

			if (field433 > -1 && field231 % 20 < 10) {
				field397[0].method318(field433 - 12, field434 - 28);
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method68(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.l(I)Z")
	public final boolean method69() {
		if (field293 == null) {
			return false;
		}

		try {
			int var1 = field293.method458();
			if (var1 == 0) {
				return false;
			}

			if (field371 == -1) {
				field293.method459(field453.field534, 0, 1);
				field371 = field453.field534[0] & 0xFF;
				if (field439 != null) {
					field371 = field371 - field439.method544() & 0xFF;
				}

				field370 = KPOSBDAA.field657[field371];
				var1--;
			}

			if (field370 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field293.method459(field453.field534, 0, 1);
				field370 = field453.field534[0] & 0xFF;
				var1--;
			}

			if (field370 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field293.method459(field453.field534, 0, 2);
				field453.field535 = 0;
				field370 = field453.method215();
				var1 -= 2;
			}

			if (var1 < field370) {
				return false;
			}

			field453.field535 = 0;
			field293.method459(field453.field534, 0, field370);
			field372 = 0;
			field103 = field102;
			field102 = field101;
			field101 = field371;

			if (field371 == 185) {
				int var2 = field453.method243();
				int var3 = field453.method242();
				PCARWQQC.method394(var3).field914 = 1;
				PCARWQQC.method394(var3).field915 = var2;
				field371 = -1;
				return true;
			}

			if (field371 == 148) {
				field333 = true;
				int var4 = field453.method215();
				PCARWQQC var5 = PCARWQQC.method394(var4);
				while (field453.field535 < field370) {
					int var6 = field453.method227();
					int var7 = field453.method215();
					int var8 = field453.method213();
					if (var8 == 255) {
						var8 = field453.method218();
					}

					if (var6 >= 0 && var6 < var5.field885.length) {
						var5.field885[var6] = var7;
						var5.field931[var6] = var8;
					}
				}

				field371 = -1;
				return true;
			}

			if (field371 == 159) {
				field273 = true;
				field448 = field453.method213();
				field449 = field453.method213();
				field450 = field453.method215();
				field451 = field453.method213();
				field452 = field453.method213();
				if (field452 >= 100) {
					int var9 = field448 * 128 + 64;
					int var10 = field449 * 128 + 64;
					int var11 = method106(var9, field349, var10) - field450;
					int var12 = var9 - field232;
					int var13 = var11 - field233;
					int var14 = var10 - field234;
					int var15 = (int) Math.sqrt(var12 * var12 + var14 * var14);
					field235 = (int) (Math.atan2(var13, var15) * 325.949D) & 0x7FF;
					field236 = (int) (Math.atan2(var12, var14) * -325.949D) & 0x7FF;

					if (field235 < 128) {
						field235 = 128;
					}

					if (field235 > 383) {
						field235 = 383;
					}
				}

				field371 = -1;
				return true;
			}

			if (field371 == 138) {
				field289 = false;
				field81 = 1;
				field244 = "";
				field386 = true;
				field371 = -1;
				return true;
			}

			if (field371 == 43) {
				field471 = field453.method233();
				field472 = field453.method232();

				while (field453.field535 < field370) {
					int var16 = field453.method213();
					method183(field453, var16);
				}

				field371 = -1;
				return true;
			}

			if (field371 == 69) {
				field333 = true;
				int var17 = field453.method250();
				int var18 = field453.method232();
				int var19 = field453.method232();
				field160[var19] = var17;
				field331[var19] = var18;
				field369[var19] = 1;
				for (int var20 = 0; var20 < 98; var20++) {
					if (var17 >= field77[var20]) {
						field369[var19] = var20 + 2;
					}
				}

				field371 = -1;
				return true;
			}

			if (field371 == 137) {
				field289 = false;
				field81 = 2;
				field244 = "";
				field386 = true;
				field371 = -1;
				return true;
			}

			if (field371 == 183) {
				String var21 = field453.method220();
				int var22 = field453.method241();
				PCARWQQC.method394(var22).field942 = var21;

				if (field383[field272] == PCARWQQC.method394(var22).field930) {
					field333 = true;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 122) {
				int var23 = field453.method215();
				int var24 = field453.method243();
				int var25 = field453.method215();
				PCARWQQC.method394(var25).field886 = (var24 << 16) + var23;
				field371 = -1;
				return true;
			}

			if (field371 == 161) {
				int var26 = field453.method243();
				byte var27 = field453.method235();
				field440[var26] = var27;

				if (field470[var26] != var27) {
					field470[var26] = var27;
					method113(var26);
					field333 = true;

					if (field159 != -1) {
						field386 = true;
					}
				}

				field371 = -1;
				return true;
			}

			if (field371 == 16) {
				int var28 = field453.method243();
				int var29 = field453.method242();

				if (field153 != -1) {
					method50(field153);
					field153 = -1;
					field386 = true;
				}

				if (field221 != -1) {
					method50(field221);
					field221 = -1;
					field220 = true;
				}

				if (field435 != -1) {
					method50(field435);
					field435 = -1;
				}

				if (field109 != var29) {
					method50(field109);
					field109 = var29;
				}

				if (field437 != var28) {
					method50(field437);
					field437 = var28;
				}

				if (field81 != 0) {
					field81 = 0;
					field386 = true;
				}

				field333 = true;
				field148 = true;
				field190 = false;
				field371 = -1;
				return true;
			}

			if (field371 == 112) {
				for (int var30 = 0; var30 < field459.length; var30++) {
					if (field459[var30] != null) {
						field459[var30].field1105 = -1;
					}
				}

				for (int var31 = 0; var31 < field403.length; var31++) {
					if (field403[var31] != null) {
						field403[var31].field1105 = -1;
					}
				}

				field371 = -1;
				return true;
			}

			if (field371 == 163) {
				int var32 = field453.method242();
				if (var32 == 0xFFFF) {
					var32 = -1;
				}

				if (field66 != var32 && field124 && !field91 && field104 == 0) {
					field319 = var32;
					field320 = true;
					field332.method366(2, field319);
				}

				field66 = var32;
				field371 = -1;
				return true;
			}

			if (field371 == 157) {
				int var33 = field453.method241();
				int var34 = field453.method246();
				if (field124 && !field91) {
					field319 = var33;
					field320 = false;
					field332.method366(2, field319);
					field104 = var34;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 109) {
				int var35 = field453.method215();
				boolean var36 = field453.method233() == 1;
				PCARWQQC.method394(var35).field877 = var36;
				field371 = -1;
				return true;
			}

			if (field371 == 24) {
				field380 = 0;
				field371 = -1;
				return true;
			}

			if (field371 == 87) {
				int var37 = field453.method242();
				PCARWQQC.method394(var37).field914 = 3;

				if (field62.field1398 == null) {
					PCARWQQC.method394(var37).field915 = (field62.field1410[11] << 5) + (field62.field1410[8] << 10) + (field62.field1410[0] << 15) + (field62.field1401[0] << 25) + (field62.field1401[4] << 20) + field62.field1410[1];
				} else {
					PCARWQQC.method394(var37).field915 = (int) (field62.field1398.field1193 + 0x12345678L);
				}

				field371 = -1;
				return true;
			}

			if (field371 == 191) {
				int var38 = field453.method242();
				int var39 = field453.method241();
				method181(var38);

				if (var39 != -1) {
					method181(var39);
				}

				if (field109 != -1) {
					method50(field109);
					field109 = -1;
				}

				if (field437 != -1) {
					method50(field437);
					field437 = -1;
				}

				if (field153 != -1) {
					method50(field153);
					field153 = -1;
				}

				if (field221 != var38) {
					method50(field221);
					field221 = var38;
				}

				if (field435 != var38) {
					method50(field435);
					field435 = var39;
				}

				field81 = 0;
				field190 = false;
				field371 = -1;
				return true;
			}

			if (field371 == 240) {
				method138();
				field371 = -1;
				return false;
			}

			if (field371 == 64) {
				field453.method215();
				field453.method233();
				field453.method215();
				field278 = field453.method249();
				field45 = field453.method241();
				field181 = field453.method215();
				field367 = field453.method241();
				field226 = field453.method241();
				field105 = field453.method215();
				field453.method241();
				field212 = field453.method242();
				signlink.dnslookup(RPCTGZHI.method448(field278));
				field371 = -1;
				return true;
			}

			if (field371 == 167) {
				field277 = field453.method213();
				field393 = field453.method213();
				field412 = field453.method213();
				field132 = true;
				field386 = true;
				field371 = -1;
				return true;
			}

			if (field371 == 124) {
				int var40 = field453.method216();
				int var41 = field453.method242();
				PCARWQQC var42 = PCARWQQC.method394(var41);
				if (var42.field883 != var40 || var40 == -1) {
					var42.field883 = var40;
					var42.field881 = 0;
					var42.field896 = 0;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 118) {
				if (field437 != -1) {
					method50(field437);
					field437 = -1;
					field333 = true;
					field148 = true;
				}

				if (field153 != -1) {
					method50(field153);
					field153 = -1;
					field386 = true;
				}

				if (field221 != -1) {
					method50(field221);
					field221 = -1;
					field220 = true;
				}

				if (field435 != -1) {
					method50(field435);
					field435 = -1;
				}

				if (field109 != -1) {
					method50(field109);
					field109 = -1;
				}

				if (field81 != 0) {
					field81 = 0;
					field386 = true;
				}

				field190 = false;
				field371 = -1;
				return true;
			}

			if (field371 == 133) {
				int var43 = field453.method241();
				int var44 = field453.method242();
				PCARWQQC var45 = PCARWQQC.method394(var44);
				if (var45 != null && var45.field920 == 0) {
					if (var43 < 0) {
						var43 = 0;
					}

					if (var43 > var45.field925 - var45.field933) {
						var43 = var45.field925 - var45.field933;
					}

					var45.field905 = var43;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 145) {
				field240 = field370 / 8;
				for (int var46 = 0; var46 < field240; var46++) {
					field120[var46] = field453.method219();
				}

				field371 = -1;
				return true;
			}

			if (field371 == 239) {
				field273 = true;
				field127 = field453.method213();
				field128 = field453.method213();
				field129 = field453.method215();
				field130 = field453.method213();
				field131 = field453.method213();
				if (field131 >= 100) {
					field232 = field127 * 128 + 64;
					field234 = field128 * 128 + 64;
					field233 = method106(field232, field349, field234) - field129;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 219) {
				field456 = field453.method242() * 30;
				field371 = -1;
				return true;
			}

			if (field371 == 156) {
				int var47 = field453.method241();
				PCARWQQC var48 = PCARWQQC.method394(var47);
				for (int var49 = 0; var49 < var48.field885.length; var49++) {
					var48.field885[var49] = -1;
					var48.field885[var49] = 0;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 58) {
				int var50 = field453.method245();
				int var51 = field453.method215();
				int var52 = field453.method216();
				PCARWQQC var53 = PCARWQQC.method394(var51);
				var53.field894 = var52;
				var53.field941 = var50;
				field371 = -1;
				return true;
			}

			if (field371 == 151) {
				field272 = field453.method232();
				field333 = true;
				field148 = true;
				field371 = -1;
				return true;
			}

			if (field371 == 173) {
				int var54 = field453.method242();
				int var55 = field453.method243();
				int var56 = var55 >> 10 & 0x1F;
				int var57 = var55 >> 5 & 0x1F;
				int var58 = var55 & 0x1F;
				PCARWQQC.method394(var54).field887 = (var58 << 3) + (var56 << 19) + (var57 << 11);
				field371 = -1;
				return true;
			}

			if (field371 == 218) {
				int var59 = field453.method241();
				int var60 = field453.method242();
				int var61 = field453.method242();

				if (var59 == 0xFFFF) {
					PCARWQQC.method394(var60).field914 = 0;
					field371 = -1;
					return true;
				}

				NCBEIRPV var62 = NCBEIRPV.method390(var59);
				PCARWQQC.method394(var60).field914 = 4;
				PCARWQQC.method394(var60).field915 = var59;
				PCARWQQC.method394(var60).field923 = var62.field852;
				PCARWQQC.method394(var60).field924 = var62.field842;
				PCARWQQC.method394(var60).field922 = var62.field851 * 100 / var61;
				field371 = -1;
				return true;
			}

			if (field371 == 246) {
				int var63 = field453.method245();
				if (var63 >= 0) {
					method181(var63);
				}

				if (field427 != var63) {
					method50(field427);
					field427 = var63;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 254) {
				method155(field453, field370);
				field314 = false;
				field371 = -1;
				return true;
			}

			if (field371 == 71) {
				method52(field453, field370);
				field371 = -1;
				return true;
			}

			if (field371 == 42) {
				String var64 = field453.method220();
				if (var64.endsWith(":tradereq:")) {
					String var65 = var64.substring(0, var64.indexOf(":"));
					long var66 = RPCTGZHI.method445(var65);
					boolean var68 = false;
					for (int var69 = 0; var69 < field240; var69++) {
						if (field120[var69] == var66) {
							var68 = true;
							break;
						}
					}

					if (!var68 && field291 == 0) {
						method177("wishes to trade with you.", var65, 4);
					}
				} else if (var64.endsWith(":duelreq:")) {
					String var70 = var64.substring(0, var64.indexOf(":"));
					long var71 = RPCTGZHI.method445(var70);
					boolean var73 = false;
					for (int var74 = 0; var74 < field240; var74++) {
						if (field120[var74] == var71) {
							var73 = true;
							break;
						}
					}

					if (!var73 && field291 == 0) {
						method177("wishes to duel with you.", var70, 8);
					}
				} else if (var64.endsWith(":chalreq:")) {
					String var75 = var64.substring(0, var64.indexOf(":"));
					long var76 = RPCTGZHI.method445(var75);
					boolean var78 = false;
					for (int var79 = 0; var79 < field240; var79++) {
						if (field120[var79] == var76) {
							var78 = true;
							break;
						}
					}

					if (!var78 && field291 == 0) {
						String var80 = var64.substring(var64.indexOf(":") + 1, var64.length() - 9);
						method177(var80, var75, 8);
					}
				} else {
					method177(var64, "", 0);
				}

				field371 = -1;
				return true;
			}

			if (field371 == 228) {
				if (field272 == 12) {
					field333 = true;
				}

				field385 = field453.method216();
				field371 = -1;
				return true;
			}

			if (field371 == 227) {
				int var81 = field453.method215();
				int var82 = field453.method213();
				int var83 = field453.method215();
				if (var83 == 0xFFFF) {
					if (field63 < 50) {
						field80[field63] = (short) var81;
						field173[field63] = var82;
						field228[field63] = 0;
						field63++;
					}
				} else if (field239 && !field91 && field63 < 50) {
					field80[field63] = var81;
					field173[field63] = var82;
					field228[field63] = TBRIOEDI.field1284[var81] + var83;
					field63++;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 252) {
				int var84 = field453.method242();
				int var85 = field453.method241();
				int var86 = field453.method241();
				int var87 = field453.method241();
				PCARWQQC.method394(var85).field923 = var84;
				PCARWQQC.method394(var85).field924 = var86;
				PCARWQQC.method394(var85).field922 = var87;
				field371 = -1;
				return true;
			}

			if (field371 == 235) {
				long var88 = field453.method219();
				int var90 = field453.method213();
				String var91 = RPCTGZHI.method449(RPCTGZHI.method446(var88));
				for (int var92 = 0; var92 < field195; var92++) {
					if (field71[var92] == var88) {
						if (field197[var92] != var90) {
							field197[var92] = var90;
							field333 = true;

							if (var90 > 0) {
								method177(var91 + " has logged in.", "", 5);
							}

							if (var90 == 0) {
								method177(var91 + " has logged out.", "", 5);
							}
						}

						var91 = null;
						break;
					}
				}

				if (var91 != null && field195 < 200) {
					field71[field195] = var88;
					field400[field195] = var91;
					field197[field195] = var90;
					field195++;
					field333 = true;
				}

				boolean var93 = false;
				while (!var93) {
					var93 = true;
					for (int var94 = 0; var94 < field195 - 1; var94++) {
						if (field197[var94] != field88 && field197[var94 + 1] == field88 || field197[var94] == 0 && field197[var94 + 1] != 0) {
							int var95 = field197[var94];
							field197[var94] = field197[var94 + 1];
							field197[var94 + 1] = var95;
							String var96 = field400[var94];
							field400[var94] = field400[var94 + 1];
							field400[var94 + 1] = var96;
							long var97 = field71[var94];
							field71[var94] = field71[var94 + 1];
							field71[var94 + 1] = var97;
							field333 = true;
							var93 = false;
						}
					}
				}

				field371 = -1;
				return true;
			}

			if (field371 == 189) {
				field82 = field453.method213();
				field371 = -1;
				return true;
			}

			if (field371 == 210) {
				int var99 = field453.method213();
				int var100 = field453.method213();
				String var101 = field453.method220();
				if (var99 >= 1 && var99 <= 5) {
					if (var101.equalsIgnoreCase("null")) {
						var101 = null;
					}

					field268[var99 - 1] = var101;
					field269[var99 - 1] = var100 == 0;
				}

				field371 = -1;
				return true;
			}

			if (field371 == 217) {
				field193 = field453.method232();
				if (field272 == field193) {
					if (field193 == 3) {
						field272 = 1;
					} else {
						field272 = 3;
					}

					field333 = true;
				}

				field371 = -1;
				return true;
			}

			if (field371 != 176 && field371 != 174 && field371 != 32 && field371 != 121 && field371 != 53 && field371 != 54 && field371 != 9 && field371 != 253 && field371 != 162 && field371 != 17 && field371 != 182) {
				if (field371 == 102) {
					int var102 = field453.method249();
					int var103 = field453.method243();
					field440[var103] = var102;

					if (field470[var103] != var102) {
						field470[var103] = var102;
						method113(var103);
						field333 = true;

						if (field159 != -1) {
							field386 = true;
						}
					}

					field371 = -1;
					return true;
				}

				if (field371 == 153) {
					int var104 = field453.method244();
					if (field159 != var104) {
						method50(field159);
						field159 = var104;
					}

					field386 = true;
					field371 = -1;
					return true;
				}

				if (field371 == 78) {
					field472 = field453.method232();
					field471 = field453.method234();
					field371 = -1;
					return true;
				}

				if (field371 == 82) {
					field96 = field453.method213();
					field371 = -1;
					return true;
				}

				if (field371 == 44) {
					int var105 = field453.method233();
					int var106 = field453.method242();
					if (var106 == 0xFFFF) {
						var106 = -1;
					}

					if (field383[var105] != var106) {
						method50(field383[var105]);
						field383[var105] = var106;
					}

					field333 = true;
					field148 = true;
					field371 = -1;
					return true;
				}

				if (field371 == 103) {
					field46 = field453.method234();
					field351 = field453.method215();
					field371 = -1;
					return true;
				}

				if (field371 == 150) {
					field196 = field453.method213();
					field333 = true;
					field371 = -1;
					return true;
				}

				if (field371 == 243) {
					field273 = false;

					for (int var107 = 0; var107 < 5; var107++) {
						field292[var107] = false;
					}

					field371 = -1;
					return true;
				}

				if (field371 == 86) {
					int var108 = field453.method241();
					int var109 = field453.method242();
					PCARWQQC.method394(var108).field914 = 2;
					PCARWQQC.method394(var108).field915 = var109;
					field371 = -1;
					return true;
				}

				if (field371 == 77) {
					field480 = field453.method213();
					if (field480 == 1) {
						field301 = field453.method215();
					}

					if (field480 >= 2 && field480 <= 6) {
						if (field480 == 2) {
							field324 = 64;
							field325 = 64;
						}

						if (field480 == 3) {
							field324 = 0;
							field325 = 64;
						}

						if (field480 == 4) {
							field324 = 128;
							field325 = 64;
						}

						if (field480 == 5) {
							field324 = 64;
							field325 = 0;
						}

						if (field480 == 6) {
							field324 = 64;
							field325 = 128;
						}

						field480 = 2;
						field321 = field453.method215();
						field322 = field453.method215();
						field323 = field453.method213();
					}

					if (field480 == 10) {
						field429 = field453.method215();
					}

					field371 = -1;
					return true;
				}

				if (field371 != 184) {
					if (field371 == 48) {
						for (int var119 = 0; var119 < field470.length; var119++) {
							if (field470[var119] != field440[var119]) {
								field470[var119] = field440[var119];
								method113(var119);
								field333 = true;
							}
						}

						field371 = -1;
						return true;
					}

					if (field371 == 52) {
						field472 = field453.method232();
						field471 = field453.method232();
						for (int var120 = field471; var120 < field471 + 8; var120++) {
							for (int var121 = field472; var121 < field472 + 8; var121++) {
								if (field227[field349][var120][var121] != null) {
									field227[field349][var120][var121] = null;
									method48(var120, var121);
								}
							}
						}

						for (CUNUEMWX var122 = (CUNUEMWX) field363.method422(); var122 != null; var122 = (CUNUEMWX) field363.method424()) {
							if (var122.field493 >= field471 && var122.field493 < field471 + 8 && var122.field494 >= field472 && var122.field494 < field472 + 8 && field349 == var122.field491) {
								var122.field486 = 0;
							}
						}

						field371 = -1;
						return true;
					}

					if (field371 == 166) {
						field333 = true;
						int var123 = field453.method215();
						PCARWQQC var124 = PCARWQQC.method394(var123);
						int var125 = field453.method215();
						for (int var126 = 0; var126 < var125; var126++) {
							var124.field885[var126] = field453.method242();
							int var127 = field453.method213();
							if (var127 == 255) {
								var127 = field453.method248();
							}

							var124.field931[var126] = var127;
						}

						for (int var128 = var125; var128 < var124.field885.length; var128++) {
							var124.field885[var128] = 0;
							var124.field931[var128] = 0;
						}

						field371 = -1;
						return true;
					}

					if (field371 == 139) {
						int var129 = field453.method215();
						method181(var129);

						if (field153 != -1) {
							method50(field153);
							field153 = -1;
							field386 = true;
						}

						if (field221 != -1) {
							method50(field221);
							field221 = -1;
							field220 = true;
						}

						if (field435 != -1) {
							method50(field435);
							field435 = -1;
						}

						if (field109 != -1) {
							method50(field109);
							field109 = -1;
						}

						if (field437 != var129) {
							method50(field437);
							field437 = var129;
						}

						if (field81 != 0) {
							field81 = 0;
							field386 = true;
						}

						field333 = true;
						field148 = true;
						field190 = false;
						field371 = -1;
						return true;
					}

					if (field371 == 178) {
						if (field272 == 12) {
							field333 = true;
						}

						field421 = field453.method213();
						field371 = -1;
						return true;
					}

					if (field371 == 50) {
						int var130 = field453.method241();
						method181(var130);

						if (field437 != -1) {
							method50(field437);
							field437 = -1;
							field333 = true;
							field148 = true;
						}

						if (field153 != -1) {
							method50(field153);
							field153 = -1;
							field386 = true;
						}

						if (field221 != -1) {
							method50(field221);
							field221 = -1;
							field220 = true;
						}

						if (field435 != -1) {
							method50(field435);
							field435 = -1;
						}

						if (field109 != var130) {
							method50(field109);
							field109 = var130;
						}

						if (field81 != 0) {
							field81 = 0;
							field386 = true;
						}

						field190 = false;
						field371 = -1;
						return true;
					}

					if (field371 == 2) {
						int var131 = field453.method215();
						method181(var131);

						if (field437 != -1) {
							method50(field437);
							field437 = -1;
							field333 = true;
							field148 = true;
						}

						if (field221 != -1) {
							method50(field221);
							field221 = -1;
							field220 = true;
						}

						if (field435 != -1) {
							method50(field435);
							field435 = -1;
						}

						if (field109 != -1) {
							method50(field109);
							field109 = -1;
						}

						if (field153 != var131) {
							method50(field153);
							field153 = var131;
						}

						field190 = false;
						field386 = true;
						field371 = -1;
						return true;
					}

					if (field371 == 233 || field371 == 179) {
						int var132 = field406;
						int var133 = field407;
						if (field371 == 233) {
							var132 = field453.method242();
							var133 = field453.method241();
							field425 = false;
						}

						if (field371 == 179) {
							var132 = field453.method242();
							field453.method223();

							for (int var134 = 0; var134 < 4; var134++) {
								for (int var135 = 0; var135 < 13; var135++) {
									for (int var136 = 0; var136 < 13; var136++) {
										int var137 = field453.method224(1);
										if (var137 == 1) {
											field111[var134][var135][var136] = field453.method224(26);
										} else {
											field111[var134][var135][var136] = -1;
										}
									}
								}
							}

							field453.method225();
							var133 = field453.method215();
							field425 = true;
						}

						if (field406 == var132 && field407 == var133 && field328 == 2) {
							field371 = -1;
							return true;
						}

						field406 = var132;
						field407 = var133;
						field67 = (field406 - 6) * 8;
						field68 = (field407 - 6) * 8;
						field275 = false;
						if ((field406 / 8 == 48 || field406 / 8 == 49) && field407 / 8 == 48) {
							field275 = true;
						}

						if (field406 / 8 == 48 && field407 / 8 == 148) {
							field275 = true;
						}

						field328 = 1;
						field295 = System.currentTimeMillis();
						method139(null, "Loading - please wait.");

						if (field371 == 233) {
							int var138 = 0;
							for (int var139 = (field406 - 6) / 8; var139 <= (field406 + 6) / 8; var139++) {
								for (int var140 = (field407 - 6) / 8; var140 <= (field407 + 6) / 8; var140++) {
									var138++;
								}
							}

							field44 = new byte[var138][];
							field399 = new byte[var138][];
							field279 = new int[var138];
							field280 = new int[var138];
							field281 = new int[var138];
							int var141 = 0;
							for (int var142 = (field406 - 6) / 8; var142 <= (field406 + 6) / 8; var142++) {
								for (int var143 = (field407 - 6) / 8; var143 <= (field407 + 6) / 8; var143++) {
									field279[var141] = (var142 << 8) + var143;

									if (field275 && (var143 == 49 || var143 == 149 || var143 == 147 || var142 == 50 || var142 == 49 && var143 == 47)) {
										field280[var141] = -1;
										field281[var141] = -1;
										var141++;
									} else {
										int var144 = field280[var141] = field332.method371(var143, 0, var142);
										if (var144 != -1) {
											field332.method366(3, var144);
										}

										int var145 = field281[var141] = field332.method371(var143, 1, var142);
										if (var145 != -1) {
											field332.method366(3, var145);
										}

										var141++;
									}
								}
							}
						}

						if (field371 == 179) {
							int var146 = 0;
							int[] var147 = new int[676];
							for (int var148 = 0; var148 < 4; var148++) {
								for (int var149 = 0; var149 < 13; var149++) {
									for (int var150 = 0; var150 < 13; var150++) {
										int var151 = field111[var148][var149][var150];
										if (var151 != -1) {
											int var152 = var151 >> 14 & 0x3FF;
											int var153 = var151 >> 3 & 0x7FF;
											int var154 = (var152 / 8 << 8) + var153 / 8;
											for (int var155 = 0; var155 < var146; var155++) {
												if (var147[var155] == var154) {
													var154 = -1;
													break;
												}
											}

											if (var154 != -1) {
												var147[var146++] = var154;
											}
										}
									}
								}
							}

							field44 = new byte[var146][];
							field399 = new byte[var146][];
							field279 = new int[var146];
							field280 = new int[var146];
							field281 = new int[var146];
							for (int var156 = 0; var156 < var146; var156++) {
								int var157 = field279[var156] = var147[var156];
								int var158 = var157 >> 8 & 0xFF;
								int var159 = var157 & 0xFF;
								int var160 = field280[var156] = field332.method371(var159, 0, var158);
								if (var160 != -1) {
									field332.method366(3, var160);
								}

								int var161 = field281[var156] = field332.method371(var159, 1, var158);
								if (var161 != -1) {
									field332.method366(3, var161);
								}
							}
						}

						int var162 = field67 - field69;
						int var163 = field68 - field70;
						field69 = field67;
						field70 = field68;

						for (int var164 = 0; var164 < 16384; var164++) {
							VMSVDNWD var165 = field403[var164];
							if (var165 != null) {
								for (int var166 = 0; var166 < 10; var166++) {
									var165.field1085[var166] -= var162;
									var165.field1086[var166] -= var163;
								}

								var165.field1082 -= var162 * 128;
								var165.field1083 -= var163 * 128;
							}
						}

						for (int var167 = 0; var167 < field457; var167++) {
							YFPQHQAV var168 = field459[var167];
							if (var168 != null) {
								for (int var169 = 0; var169 < 10; var169++) {
									var168.field1085[var169] -= var162;
									var168.field1086[var169] -= var163;
								}

								var168.field1082 -= var162 * 128;
								var168.field1083 -= var163 * 128;
							}
						}

						field314 = true;
						byte var170 = 0;
						byte var171 = 104;
						byte var172 = 1;
						if (var162 < 0) {
							var170 = 103;
							var171 = -1;
							var172 = -1;
						}

						byte var173 = 0;
						byte var174 = 104;
						byte var175 = 1;
						if (var163 < 0) {
							var173 = 103;
							var174 = -1;
							var175 = -1;
						}

						for (int var176 = var170; var176 != var171; var176 += var172) {
							for (int var177 = var173; var177 != var174; var177 += var175) {
								int var178 = var162 + var176;
								int var179 = var163 + var177;
								for (int var180 = 0; var180 < 4; var180++) {
									if (var178 >= 0 && var179 >= 0 && var178 < 104 && var179 < 104) {
										field227[var180][var176][var177] = field227[var180][var178][var179];
									} else {
										field227[var180][var176][var177] = null;
									}
								}
							}
						}

						for (CUNUEMWX var181 = (CUNUEMWX) field363.method422(); var181 != null; var181 = (CUNUEMWX) field363.method424()) {
							var181.field493 -= var162;
							var181.field494 -= var163;
							if (var181.field493 < 0 || var181.field494 < 0 || var181.field493 >= 104 || var181.field494 >= 104) {
								var181.method418();
							}
						}

						if (field380 != 0) {
							field380 -= var162;
							field381 -= var163;
						}

						field273 = false;
						field371 = -1;
						return true;
					}

					if (field371 == 141) {
						int var182 = field453.method213();
						int var183 = field453.method213();
						int var184 = field453.method213();
						int var185 = field453.method213();
						field292[var182] = true;
						field409[var182] = var183;
						field455[var182] = var184;
						field466[var182] = var185;
						field119[var182] = 0;
						field371 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field371 + "," + field370 + " - " + field102 + "," + field103);
					method138();
					return true;
				}

				long var110 = field453.method219();
				int var112 = field453.method218();
				int var113 = field453.method213();
				boolean var114 = false;
				for (int var115 = 0; var115 < 100; var115++) {
					if (field356[var115] == var112) {
						var114 = true;
						break;
					}
				}

				if (var113 <= 1) {
					for (int var116 = 0; var116 < field240; var116++) {
						if (field120[var116] == var110) {
							var114 = true;
							break;
						}
					}
				}

				if (!var114 && field291 == 0) {
					try {
						field356[field155] = var112;
						field155 = (field155 + 1) % 100;
						String var117 = RJOTKPCV.method442(field453, field370 - 13);
						if (var113 != 3) {
							var117 = GSWNKABU.method264(var117);
						}

						if (var113 == 2 || var113 == 3) {
							method177(var117, "@cr2@" + RPCTGZHI.method449(RPCTGZHI.method446(var110)), 7);
						} else if (var113 == 1) {
							method177(var117, "@cr1@" + RPCTGZHI.method449(RPCTGZHI.method446(var110)), 7);
						} else {
							method177(var117, RPCTGZHI.method449(RPCTGZHI.method446(var110)), 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field371 = -1;
				return true;
			}

			method183(field453, field371);
			field371 = -1;
			return true;
		} catch (IOException var190) {
			method53();
		} catch (Exception var191) {
			String var187 = "T2 - " + field371 + "," + field102 + "," + field103 + " - " + field370 + "," + (field62.field1085[0] + field67) + "," + (field62.field1086[0] + field68) + " - ";
			for (int var188 = 0; var188 < field370 && var188 < 50; var188++) {
				var187 = var187 + field453.field534[var188] + ",";
			}

			signlink.reporterror(var187);
			method138();
		}

		return true;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method70() {
		if (field308 == 0) {
			int var1 = field503 / 2 - 80;
			int var2 = field504 / 2 + 20;
			var2 += 20;
			if (field519 == 1 && field520 >= var1 - 75 && field520 <= var1 + 75 && field521 >= var2 - 20 && field521 <= var2 + 20) {
				field308 = 3;
				field274 = 0;
			}

			int var3 = field503 / 2 + 80;
			if (field519 == 1 && field520 >= var3 - 75 && field520 <= var3 + 75 && field521 >= var2 - 20 && field521 <= var2 + 20) {
				field387 = "";
				field388 = "Enter your username & password.";
				field308 = 2;
				field274 = 0;
			}
		} else if (field308 == 2) {
			int var4 = field504 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field519 == 1 && field521 >= var4 - 15 && field521 < var4) {
				field274 = 0;
			}

			var4 += 15;
			if (field519 == 1 && field521 >= var4 - 15 && field521 < var4) {
				field274 = 1;
			}

			var4 += 15;
			int var5 = field503 / 2 - 80;
			int var6 = field504 / 2 + 50;
			var6 += 20;
			if (field519 == 1 && field520 >= var5 - 75 && field520 <= var5 + 75 && field521 >= var6 - 20 && field521 <= var6 + 20) {
				field112 = 0;
				method41(field75, field76, false);

				if (field230) {
					return;
				}
			}

			int var7 = field503 / 2 + 80;
			if (field519 == 1 && field520 >= var7 - 75 && field520 <= var7 + 75 && field521 >= var6 - 20 && field521 <= var6 + 20) {
				field308 = 0;
				field75 = "";
				field76 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method193();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field327.length(); var10++) {
					if (var8 == field327.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field274 == 0) {
					if (var8 == 8 && field75.length() > 0) {
						field75 = field75.substring(0, field75.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field274 = 1;
					}

					if (var9) {
						field75 = field75 + (char) var8;
					}

					if (field75.length() > 12) {
						field75 = field75.substring(0, 12);
					}
				} else if (field274 == 1) {
					if (var8 == 8 && field76.length() > 0) {
						field76 = field76.substring(0, field76.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field274 = 0;
					}

					if (var9) {
						field76 = field76 + (char) var8;
					}

					if (field76.length() > 20) {
						field76 = field76.substring(0, 20);
					}
				}
			}
		} else if (field308 == 3) {
			int var11 = field503 / 2;
			int var12 = field504 / 2 + 50;
			var12 += 20;
			if (field519 == 1 && field520 >= var11 - 75 && field520 <= var11 + 75 && field521 >= var12 - 20 && field521 <= var12 + 20) {
				field308 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZILPCARWQQC;I)V")
	public final void method71(int arg0, int arg1, PCARWQQC arg2, int arg3) {
		if (arg2.field920 == 0 && arg2.field891 != null && (!arg2.field877 || field384 == arg2.field895 || field199 == arg2.field895 || field161 == arg2.field895)) {
			int var5 = CBERHIHM.field29;
			int var6 = CBERHIHM.field27;
			int var7 = CBERHIHM.field30;
			int var8 = CBERHIHM.field28;
			CBERHIHM.method30(arg2.field933 + arg3, arg3, arg0, arg2.field943 + arg0);
			int var9 = arg2.field891.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field909[var10] + arg0;
				int var12 = arg2.field911[var10] + arg3 - arg1;
				PCARWQQC var13 = PCARWQQC.method394(arg2.field891[var10]);
				var11 += var13.field894;
				var12 += var13.field941;

				if (var13.field903 > 0) {
					method159(var13);
				}

				if (var13.field920 == 0) {
					if (var13.field905 > var13.field925 - var13.field933) {
						var13.field905 = var13.field925 - var13.field933;
					}

					if (var13.field905 < 0) {
						var13.field905 = 0;
					}

					method71(var11, var13.field905, var13, var12);

					if (var13.field925 > var13.field933) {
						method97(var13.field905, var13.field943 + var11, var13.field933, var12, var13.field925);
					}
				} else if (var13.field920 != 1) {
					if (var13.field920 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field933; var15++) {
							for (int var16 = 0; var16 < var13.field943; var16++) {
								int var17 = (var13.field949 + 32) * var16 + var11;
								int var18 = (var13.field928 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field944[var14];
									var18 += var13.field945[var14];
								}

								if (var13.field885[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field885[var14] - 1;
									if (var17 > CBERHIHM.field29 - 32 && var17 < CBERHIHM.field30 && var18 > CBERHIHM.field27 - 32 && var18 < CBERHIHM.field28 || field340 != 0 && field339 == var14) {
										int var22 = 0;
										if (field83 == 1 && field84 == var14 && field85 == var13.field895) {
											var22 = 0xFFFFFF;
										}

										KUDWIDHU var23 = NCBEIRPV.method386(var21, var13.field931[var14], var22);
										if (var23 != null) {
											if (field340 != 0 && field339 == var14 && field338 == var13.field895) {
												var19 = field513 - field341;
												var20 = field514 - field342;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field297 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method320(128, var18 + var20, var17 + var19);

												if (var18 + var20 < CBERHIHM.field27 && arg2.field905 > 0) {
													int var24 = (CBERHIHM.field27 - var18 - var20) * field296 / 3;
													if (var24 > field296 * 10) {
														var24 = field296 * 10;
													}

													if (var24 > arg2.field905) {
														var24 = arg2.field905;
													}

													arg2.field905 -= var24;
													field342 += var24;
												}

												if (var18 + var20 + 32 > CBERHIHM.field28 && arg2.field905 < arg2.field925 - arg2.field933) {
													int var25 = (var18 + var20 + 32 - CBERHIHM.field28) * field296 / 3;
													if (var25 > field296 * 10) {
														var25 = field296 * 10;
													}

													if (var25 > arg2.field925 - arg2.field933 - arg2.field905) {
														var25 = arg2.field925 - arg2.field933 - arg2.field905;
													}

													arg2.field905 += var25;
													field342 -= var25;
												}
											} else if (field478 != 0 && field477 == var14 && field476 == var13.field895) {
												var23.method320(128, var18, var17);
											} else {
												var23.method318(var17, var18);
											}

											if (var23.field663 == 33 || var13.field931[var14] != 1) {
												int var26 = var13.field931[var14];
												field344.method17(method87(var26), var17 + var19 + 1, var18 + 10 + var20, 0);
												field344.method17(method87(var26), var17 + var19, var18 + 9 + var20, 0xFFFF00);
											}
										}
									}
								} else if (var13.field898 != null && var14 < 20) {
									KUDWIDHU var27 = var13.field898[var14];
									if (var27 != null) {
										var27.method318(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field920 == 3) {
						boolean var28 = false;
						if (field161 == var13.field895 || field199 == var13.field895 || field384 == var13.field895) {
							var28 = true;
						}

						int var29;
						if (method74(var13)) {
							var29 = var13.field940;
							if (var28 && var13.field912 != 0) {
								var29 = var13.field912;
							}
						} else {
							var29 = var13.field887;
							if (var28 && var13.field913 != 0) {
								var29 = var13.field913;
							}
						}

						if (var13.field882 == 0) {
							if (var13.field907) {
								CBERHIHM.method33(var11, var29, var12, var13.field933, var13.field943);
							} else {
								CBERHIHM.method34(var13.field943, var13.field933, var29, var11, var12);
							}
						} else if (var13.field907) {
							CBERHIHM.method32(var11, var13.field943, var13.field933, var29, 256 - (var13.field882 & 0xFF), var12);
						} else {
							CBERHIHM.method35(var11, var13.field943, var13.field933, 256 - (var13.field882 & 0xFF), var12, var29);
						}
					} else if (var13.field920 == 4) {
						CAMKASVY var30 = var13.field879;
						String var31 = var13.field942;
						boolean var32 = false;
						if (field161 == var13.field895 || field199 == var13.field895 || field384 == var13.field895) {
							var32 = true;
						}

						int var33;
						if (method74(var13)) {
							var33 = var13.field940;
							if (var32 && var13.field912 != 0) {
								var33 = var13.field912;
							}

							if (var13.field901.length() > 0) {
								var31 = var13.field901;
							}
						} else {
							var33 = var13.field887;
							if (var32 && var13.field913 != 0) {
								var33 = var13.field913;
							}
						}

						if (var13.field906 == 6 && field190) {
							var31 = "Please wait...";
							var33 = var13.field887;
						}

						if (CBERHIHM.field25 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field21 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method133(method168(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method133(method168(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method133(method168(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method133(method168(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method133(method168(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field878) {
								var30.method14(var13.field889, var13.field943 / 2 + var11, var41, var34, var33);
							} else {
								var30.method21(var11, var34, var13.field889, var41, var33);
							}

							var34 += var30.field21;
						}
					} else if (var13.field920 == 5) {
						KUDWIDHU var42;
						if (method74(var13)) {
							var42 = var13.field934;
						} else {
							var42 = var13.field908;
						}

						if (var42 != null) {
							var42.method318(var11, var12);
						}
					} else if (var13.field920 == 6) {
						int var43 = ZUDKHAVN.field1486;
						int var44 = ZUDKHAVN.field1487;
						ZUDKHAVN.field1486 = var13.field943 / 2 + var11;
						ZUDKHAVN.field1487 = var13.field933 / 2 + var12;
						int var45 = ZUDKHAVN.field1490[var13.field923] * var13.field922 >> 16;
						int var46 = ZUDKHAVN.field1491[var13.field923] * var13.field922 >> 16;
						boolean var47 = method74(var13);
						int var48;
						if (var47) {
							var48 = var13.field884;
						} else {
							var48 = var13.field883;
						}

						KUGNQTGL var49;
						if (var48 == -1) {
							var49 = var13.method398(-1, -1, var47);
						} else {
							PQTJDTHH var50 = PQTJDTHH.field951[var48];
							var49 = var13.method398(var50.field953[var13.field881], var50.field954[var13.field881], var47);
						}

						if (var49 != null) {
							var49.method351(0, var13.field924, 0, var13.field923, 0, var45, var46);
						}

						ZUDKHAVN.field1486 = var43;
						ZUDKHAVN.field1487 = var44;
					} else {
						if (var13.field920 == 7) {
							CAMKASVY var51 = var13.field879;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field933; var53++) {
								for (int var54 = 0; var54 < var13.field943; var54++) {
									if (var13.field885[var52] > 0) {
										NCBEIRPV var55 = NCBEIRPV.method390(var13.field885[var52] - 1);
										String var56 = String.valueOf(var55.field833);
										if (var55.field858 || var13.field931[var52] != 1) {
											var56 = var56 + " x" + method137(var13.field931[var52]);
										}

										int var57 = (var13.field949 + 115) * var54 + var11;
										int var58 = (var13.field928 + 12) * var53 + var12;
										if (var13.field878) {
											var51.method14(var13.field889, var13.field943 / 2 + var57, var56, var58, var13.field887);
										} else {
											var51.method21(var57, var58, var13.field889, var56, var13.field887);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field920 == 8 && (field398 == var13.field895 || field224 == var13.field895 || field276 == var13.field895) && field79 == 100) {
							int var59 = 0;
							int var60 = 0;
							CAMKASVY var61 = field345;
							String var62 = var13.field942;
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

								int var65 = var61.method15(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field21 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field943 + var11 - var59 - 5;
							int var67 = var13.field933 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field943 + arg0) {
								var66 = arg2.field943 + arg0 - var59;
							}

							if (var60 + var67 > arg2.field933 + arg3) {
								var67 = arg2.field933 + arg3 - var60;
							}

							CBERHIHM.method33(var66, 0xFFFFA0, var67, var60, var59);
							CBERHIHM.method34(var59, var60, 0, var66, var67);
							String var68 = var13.field942;
							int var69 = var61.field21 + var67 + 2;
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

								var61.method21(var66 + 3, var69, false, var71, 0);
								var69 += var61.field21 + 1;
							}
						}
					}
				}
			}

			CBERHIHM.method30(var8, var6, var5, var7);
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method72() {
		if (field456 > 1) {
			field456--;
		}

		if (field374 > 0) {
			field374--;
		}

		for (int var1 = 0; var1 < 5 && method69(); var1++) {
		}

		if (field230) {
			synchronized (field469.field566) {
				if (!field106) {
					field469.field568 = 0;
				} else if (field519 != 0 || field469.field568 >= 40) {
					field100.method202(124);
					field100.method203(0);
					int var3 = field100.field535;
					int var4 = 0;
					for (int var5 = 0; var5 < field469.field568 && var3 - field100.field535 < 240; var5++) {
						var4++;
						int var6 = field469.field565[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field469.field567[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field469.field565[var5] == -1 && field469.field567[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field186 != var7 || field187 != var6) {
							int var9 = var7 - field186;
							field186 = var7;
							int var10 = var6 - field187;
							field187 = var6;

							if (field298 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field100.method204((field298 << 12) + (var9 << 6) + var10);
								field298 = 0;
							} else if (field298 < 8) {
								field100.method206((field298 << 19) + var8 + 0x800000);
								field298 = 0;
							} else {
								field100.method207((field298 << 19) + var8 - 0x40000000);
								field298 = 0;
							}
						} else if (field298 < 2047) {
							field298++;
						}
					}

					field100.method212(field100.field535 - var3);

					if (var4 >= field469.field568) {
						field469.field568 = 0;
					} else {
						field469.field568 -= var4;
						for (int var11 = 0; var11 < field469.field568; var11++) {
							field469.field567[var11] = field469.field567[var4 + var11];
							field469.field565[var11] = field469.field565[var4 + var11];
						}
					}
				}
			}

			if (field519 != 0) {
				long var12 = (field522 - field299) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field299 = field522;
				int var14 = field521;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field520;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field519 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field100.method202(144);
				field100.method247((var17 << 19) + (var18 << 20) + var16);
			}

			if (field170 > 0) {
				field170--;
			}

			if (field523[1] == 1 || field523[2] == 1 || field523[3] == 1 || field523[4] == 1) {
				field171 = true;
			}

			if (field171 && field170 <= 0) {
				field170 = 20;
				field171 = false;
				field100.method202(29);
				field100.method239(field310);
				field100.method204(field309);
			}

			if (field510 && !field468) {
				field468 = true;
				field100.method202(40);
				field100.method203(1);
			}

			if (!field510 && field468) {
				field468 = false;
				field100.method202(40);
				field100.method203(0);
			}

			method127();
			method153();
			method173();
			field372++;
			if (field372 > 750) {
				method53();
			}

			method95();
			method78();
			method91();
			field296++;

			if (field337 != 0) {
				field336 += 20;
				if (field336 >= 400) {
					field337 = 0;
				}
			}

			if (field478 != 0) {
				field475++;
				if (field475 >= 15) {
					if (field478 == 2) {
						field333 = true;
					}

					if (field478 == 3) {
						field386 = true;
					}

					field478 = 0;
				}
			}

			if (field340 != 0) {
				field297++;

				if (field513 > field341 + 5 || field513 < field341 - 5 || field514 > field342 + 5 || field514 < field342 - 5) {
					field50 = true;
				}

				if (field512 == 0) {
					if (field340 == 2) {
						field333 = true;
					}

					if (field340 == 3) {
						field386 = true;
					}

					field340 = 0;

					if (field50 && field297 >= 5) {
						field353 = -1;
						method88();

						if (field353 == field338 && field352 != field339) {
							PCARWQQC var19 = PCARWQQC.method394(field338);
							byte var20 = 0;
							if (field426 == 1 && var19.field903 == 206) {
								var20 = 1;
							}

							if (var19.field885[field352] <= 0) {
								var20 = 0;
							}

							if (var19.field900) {
								int var21 = field339;
								int var22 = field352;
								var19.field885[var22] = var19.field885[var21];
								var19.field931[var22] = var19.field931[var21];
								var19.field885[var21] = -1;
								var19.field931[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field339;
								int var24 = field352;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method402(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method402(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method402(field339, field352);
							}

							field100.method202(162);
							field100.method238(field352);
							field100.method238(field338);
							field100.method238(field339);
							field100.method231(var20);
						}
					} else if ((field250 == 1 || method178(field364 - 1)) && field364 > 2) {
						method54();
					} else if (field364 > 0) {
						method90(field364 - 1);
					}

					field475 = 10;
					field519 = 0;
				}
			}

			field329++;
			if (field329 > 1660) {
				field329 = 0;
				field100.method202(226);
				field100.method203(0);
				int var25 = field100.field535;
				field100.method204(39982);

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method203(167);
				}

				field100.method203((int) (Math.random() * 256.0D));
				field100.method204((int) (Math.random() * 65536.0D));
				field100.method204((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method203(156);
				}

				field100.method203(6);
				field100.method204((int) (Math.random() * 65536.0D));
				field100.method203(101);
				field100.method204(17446);
				field100.method212(field100.field535 - var25);
			}

			if (XNSGYTEG.field1355 != -1) {
				int var26 = XNSGYTEG.field1355;
				int var27 = XNSGYTEG.field1356;
				boolean var28 = method164(var27, 0, 0, 0, 0, field62.field1086[0], field62.field1085[0], true, var26, 0, 0);
				XNSGYTEG.field1355 = -1;

				if (var28) {
					field334 = field520;
					field335 = field521;
					field337 = 1;
					field336 = 0;
				}
			}

			if (field519 == 1 && field350 != null) {
				field350 = null;
				field386 = true;
				field519 = 0;
			}

			method166();

			if (field221 == -1) {
				method43();
				method96();
				method102();
			}

			if (field512 == 1 || field519 == 1) {
				field185++;
			}

			if (field398 == 0 && field224 == 0 && field276 == 0) {
				if (field79 > 0) {
					field79--;
				}
			} else if (field79 < 100) {
				field79++;
				if (field79 == 100) {
					if (field398 != 0) {
						field386 = true;
					}

					if (field224 != 0) {
						field333 = true;
					}
				}
			}

			if (field328 == 2) {
				method167();
			}

			if (field328 == 2 && field273) {
				method65();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field119[var29]++;
			}

			method77();
			field482++;
			if (field482 > 99) {
				field482 = 0;
				field100.method202(252);
			}

			field511++;
			if (field511 > 4500) {
				field374 = 250;
				field511 -= 500;
				field100.method202(245);
			}

			field191++;
			if (field191 > 500) {
				field191 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field93 += field94;
				}

				if ((var30 & 0x2) == 2) {
					field394 += field395;
				}

				if ((var30 & 0x4) == 4) {
					field315 += field316;
				}
			}

			if (field93 < -50) {
				field94 = 2;
			}

			if (field93 > 50) {
				field94 = -2;
			}

			if (field394 < -55) {
				field395 = 2;
			}

			if (field394 > 55) {
				field395 = -2;
			}

			if (field315 < -40) {
				field316 = 1;
			}

			if (field315 > 40) {
				field316 = -1;
			}

			field219++;
			if (field219 > 500) {
				field219 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field365 += field366;
				}

				if ((var31 & 0x2) == 2) {
					field157 += field158;
				}
			}

			if (field365 < -60) {
				field366 = 2;
			}

			if (field365 > 60) {
				field366 = -2;
			}

			if (field157 < -20) {
				field158 = 1;
			}

			if (field157 > 10) {
				field158 = -1;
			}

			field373++;
			if (field373 > 50) {
				field100.method202(225);
			}

			try {
				if (field293 != null && field100.field535 > 0) {
					field293.method460(field100.field535, field100.field534, 0);
					field100.field535 = 0;
					field373 = 0;
				}
			} catch (IOException var33) {
				method53();
			} catch (Exception var34) {
				method138();
			}
		}
	}

	@ObfuscatedName("client.n(I)Ljava/net/Socket;")
	public final Socket method73(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(BLPCARWQQC;)Z")
	public final boolean method74(PCARWQQC arg0) {
		if (arg0.field897 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field897.length; var2++) {
			int var3 = method168(arg0, var2);
			int var4 = arg0.field902[var2];
			if (arg0.field897[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field897[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field897[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method75(long arg0) {
		if (arg0 != 0L) {
			if (field240 >= 100) {
				method177("Your ignore list is full. Max of 100 hit", "", 0);
			} else {
				String var3 = RPCTGZHI.method449(RPCTGZHI.method446(arg0));
				for (int var4 = 0; var4 < field240; var4++) {
					if (field120[var4] == arg0) {
						method177(var3 + " is already on your ignore list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field195; var5++) {
					if (field71[var5] == arg0) {
						method177("Please remove " + var3 + " from your friend list first", "", 0);
						return;
					}
				}

				field120[field240++] = arg0;
				field333 = true;
				field100.method202(82);
				field100.method209(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method76(String arg0) throws IOException {
		if (field354) {
			if (field307 != null) {
				try {
					field307.close();
				} catch (Exception var4) {
				}

				field307 = null;
			}

			field307 = method73(43595);
			field307.setSoTimeout(10000);
			InputStream var2 = field307.getInputStream();
			OutputStream var3 = field307.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.o(I)V")
	public final void method77() {
		while (true) {
			int var1 = method193();
			if (var1 == -1) {
				return;
			}

			if (field109 != -1 && field479 == field109) {
				if (var1 == 8 && field198.length() > 0) {
					field198 = field198.substring(0, field198.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field198.length() < 12) {
					field198 = field198 + (char) var1;
				}
			} else if (field289) {
				if (var1 >= 32 && var1 <= 122 && field254.length() < 80) {
					field254 = field254 + (char) var1;
					field386 = true;
				}

				if (var1 == 8 && field254.length() > 0) {
					field254 = field254.substring(0, field254.length() - 1);
					field386 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field289 = false;
					field386 = true;

					if (field420 == 1) {
						long var2 = RPCTGZHI.method445(field254);
						method111(var2);
					}

					if (field420 == 2 && field195 > 0) {
						long var4 = RPCTGZHI.method445(field254);
						method55(var4);
					}

					if (field420 == 3 && field254.length() > 0) {
						field100.method202(201);
						field100.method203(0);
						int var6 = field100.field535;
						field100.method209(field302);
						RJOTKPCV.method443(field254, field100);
						field100.method212(field100.field535 - var6);
						field254 = RJOTKPCV.method444(field254);
						field254 = GSWNKABU.method264(field254);
						method177(field254, RPCTGZHI.method449(RPCTGZHI.method446(field302)), 6);

						if (field393 == 2) {
							field393 = 1;
							field132 = true;
							field100.method202(206);
							field100.method203(field277);
							field100.method203(field393);
							field100.method203(field412);
						}
					}

					if (field420 == 4 && field240 < 100) {
						long var7 = RPCTGZHI.method445(field254);
						method75(var7);
					}

					if (field420 == 5 && field240 > 0) {
						long var9 = RPCTGZHI.method445(field254);
						method141(var9);
					}
				}
			} else if (field81 == 1) {
				if (var1 >= 48 && var1 <= 57 && field244.length() < 10) {
					field244 = field244 + (char) var1;
					field386 = true;
				}

				if (var1 == 8 && field244.length() > 0) {
					field244 = field244.substring(0, field244.length() - 1);
					field386 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field244.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field244);
						} catch (Exception var21) {
						}

						field100.method202(172);
						field100.method207(var11);
					}

					field81 = 0;
					field386 = true;
				}
			} else if (field81 == 2) {
				if (var1 >= 32 && var1 <= 122 && field244.length() < 12) {
					field244 = field244 + (char) var1;
					field386 = true;
				}

				if (var1 == 8 && field244.length() > 0) {
					field244 = field244.substring(0, field244.length() - 1);
					field386 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field244.length() > 0) {
						field100.method202(3);
						field100.method209(RPCTGZHI.method445(field244));
					}

					field81 = 0;
					field386 = true;
				}
			} else if (field81 == 3) {
				if (var1 >= 32 && var1 <= 122 && field244.length() < 40) {
					field244 = field244 + (char) var1;
					field386 = true;
				}

				if (var1 == 8 && field244.length() > 0) {
					field244 = field244.substring(0, field244.length() - 1);
					field386 = true;
				}
			} else if (field153 == -1 && field221 == -1) {
				if (var1 >= 32 && var1 <= 122 && field47.length() < 80) {
					field47 = field47 + (char) var1;
					field386 = true;
				}

				if (var1 == 8 && field47.length() > 0) {
					field47 = field47.substring(0, field47.length() - 1);
					field386 = true;
				}

				if ((var1 == 13 || var1 == 10) && field47.length() > 0) {
					if (field142 == 2) {
						if (field47.equals("::clientdrop")) {
							method53();
						}

						if (field47.equals("::lag")) {
							method108();
						}

						if (field47.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field332.method359(2); var12++) {
								field332.method365(2, (byte) 1, var12);
							}
						}

						if (field47.equals("::fpson")) {
							field192 = true;
						}

						if (field47.equals("::fpsoff")) {
							field192 = false;
						}

						if (field47.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field282[var13].field1480[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field47.startsWith("::")) {
						field100.method202(153);
						field100.method203(field47.length() - 1);
						field100.method210(field47.substring(2));
					} else {
						String var16 = field47.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field47 = field47.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field47 = field47.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field47 = field47.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field47 = field47.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field47 = field47.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field47 = field47.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field47 = field47.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field47 = field47.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field47 = field47.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field47 = field47.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field47 = field47.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field47 = field47.substring(6);
						}

						String var18 = field47.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field47 = field47.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field47 = field47.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field47 = field47.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field47 = field47.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field47 = field47.substring(6);
						}

						field100.method202(57);
						field100.method203(0);
						int var20 = field100.field535;
						field100.method230(var19);
						field100.method229(var17);
						field402.field535 = 0;
						RJOTKPCV.method443(field47, field402);
						field100.method251(0, field402.field535, field402.field534);
						field100.method212(field100.field535 - var20);
						field47 = RJOTKPCV.method444(field47);
						field47 = GSWNKABU.method264(field47);
						field62.field1101 = field47;
						field62.field1111 = var17;
						field62.field1120 = var19;
						field62.field1123 = 150;

						if (field142 == 2) {
							method177(field62.field1101, "@cr2@" + field62.field1423, 2);
						} else if (field142 == 1) {
							method177(field62.field1101, "@cr1@" + field62.field1423, 2);
						} else {
							method177(field62.field1101, field62.field1423, 2);
						}

						if (field277 == 2) {
							field277 = 3;
							field132 = true;
							field100.method202(206);
							field100.method203(field277);
							field100.method203(field393);
							field100.method203(field412);
						}
					}

					field47 = "";
					field386 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method78() {
		for (int var1 = 0; var1 < field404; var1++) {
			int var2 = field405[var1];
			VMSVDNWD var3 = field403[var2];
			if (var3 != null) {
				method79(var3.field1304.field1186, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILQQSLPTGQ;)V")
	public final void method79(int arg0, QQSLPTGQ arg1) {
		if (arg1.field1082 < 128 || arg1.field1083 < 128 || arg1.field1082 >= 13184 || arg1.field1083 >= 13184) {
			arg1.field1105 = -1;
			arg1.field1077 = -1;
			arg1.field1091 = 0;
			arg1.field1092 = 0;
			arg1.field1082 = arg1.field1085[0] * 128 + arg1.field1095 * 64;
			arg1.field1083 = arg1.field1086[0] * 128 + arg1.field1095 * 64;
			arg1.method429();
		}

		if (field62 == arg1 && (arg1.field1082 < 1536 || arg1.field1083 < 1536 || arg1.field1082 >= 11776 || arg1.field1083 >= 11776)) {
			arg1.field1105 = -1;
			arg1.field1077 = -1;
			arg1.field1091 = 0;
			arg1.field1092 = 0;
			arg1.field1082 = arg1.field1085[0] * 128 + arg1.field1095 * 64;
			arg1.field1083 = arg1.field1086[0] * 128 + arg1.field1095 * 64;
			arg1.method429();
		}

		if (arg1.field1091 > field231) {
			method80(arg1);
		} else if (arg1.field1092 >= field231) {
			method81(arg1);
		} else {
			method82(arg1);
		}

		method83(arg1);
		method84(arg1);
	}

	@ObfuscatedName("client.a(LQQSLPTGQ;Z)V")
	public final void method80(QQSLPTGQ arg0) {
		int var2 = arg0.field1091 - field231;
		int var3 = arg0.field1095 * 64 + arg0.field1087 * 128;
		int var4 = arg0.field1095 * 64 + arg0.field1089 * 128;
		arg0.field1082 += (var3 - arg0.field1082) / var2;
		arg0.field1083 += (var4 - arg0.field1083) / var2;
		arg0.field1112 = 0;

		if (arg0.field1093 == 0) {
			arg0.field1127 = 1024;
		}

		if (arg0.field1093 == 1) {
			arg0.field1127 = 1536;
		}

		if (arg0.field1093 == 2) {
			arg0.field1127 = 0;
		}

		if (arg0.field1093 == 3) {
			arg0.field1127 = 512;
		}
	}

	@ObfuscatedName("client.b(LQQSLPTGQ;Z)V")
	public final void method81(QQSLPTGQ arg0) {
		if (field231 == arg0.field1092 || arg0.field1105 == -1 || arg0.field1108 != 0 || arg0.field1107 + 1 > PQTJDTHH.field951[arg0.field1105].method405(arg0.field1106)) {
			int var2 = arg0.field1092 - arg0.field1091;
			int var3 = field231 - arg0.field1091;
			int var4 = arg0.field1095 * 64 + arg0.field1087 * 128;
			int var5 = arg0.field1095 * 64 + arg0.field1089 * 128;
			int var6 = arg0.field1095 * 64 + arg0.field1088 * 128;
			int var7 = arg0.field1095 * 64 + arg0.field1090 * 128;
			arg0.field1082 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1083 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1112 = 0;

		if (arg0.field1093 == 0) {
			arg0.field1127 = 1024;
		}

		if (arg0.field1093 == 1) {
			arg0.field1127 = 1536;
		}

		if (arg0.field1093 == 2) {
			arg0.field1127 = 0;
		}

		if (arg0.field1093 == 3) {
			arg0.field1127 = 512;
		}

		arg0.field1084 = arg0.field1127;
	}

	@ObfuscatedName("client.a(LQQSLPTGQ;I)V")
	public final void method82(QQSLPTGQ arg0) {
		arg0.field1102 = arg0.field1113;
		if (arg0.field1131 == 0) {
			arg0.field1112 = 0;
		} else {
			if (arg0.field1105 != -1 && arg0.field1108 == 0) {
				PQTJDTHH var2 = PQTJDTHH.field951[arg0.field1105];
				if (arg0.field1094 > 0 && var2.field963 == 0) {
					arg0.field1112++;
					return;
				}

				if (arg0.field1094 <= 0 && var2.field964 == 0) {
					arg0.field1112++;
					return;
				}
			}

			int var3 = arg0.field1082;
			int var4 = arg0.field1083;
			int var5 = arg0.field1085[arg0.field1131 - 1] * 128 + arg0.field1095 * 64;
			int var6 = arg0.field1086[arg0.field1131 - 1] * 128 + arg0.field1095 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1127 = 1280;
					} else if (var4 > var6) {
						arg0.field1127 = 1792;
					} else {
						arg0.field1127 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1127 = 768;
					} else if (var4 > var6) {
						arg0.field1127 = 256;
					} else {
						arg0.field1127 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1127 = 1024;
				} else {
					arg0.field1127 = 0;
				}

				int var7 = arg0.field1127 - arg0.field1084 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1097;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1096;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1099;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1098;
				}

				if (var8 == -1) {
					var8 = arg0.field1096;
				}

				arg0.field1102 = var8;
				int var9 = 4;
				if (arg0.field1127 != arg0.field1084 && arg0.field1110 == -1 && arg0.field1121 != 0) {
					var9 = 2;
				}

				if (arg0.field1131 > 2) {
					var9 = 6;
				}

				if (arg0.field1131 > 3) {
					var9 = 8;
				}

				if (arg0.field1112 > 0 && arg0.field1131 > 1) {
					var9 = 8;
					arg0.field1112--;
				}

				if (arg0.field1117[arg0.field1131 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1102 == arg0.field1096 && arg0.field1116 != -1) {
					arg0.field1102 = arg0.field1116;
				}

				if (var3 < var5) {
					arg0.field1082 += var9;
					if (arg0.field1082 > var5) {
						arg0.field1082 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1082 -= var9;
					if (arg0.field1082 < var5) {
						arg0.field1082 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1083 += var9;
					if (arg0.field1083 > var6) {
						arg0.field1083 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1083 -= var9;
					if (arg0.field1083 < var6) {
						arg0.field1083 = var6;
					}
				}

				if (arg0.field1082 == var5 && arg0.field1083 == var6) {
					arg0.field1131--;

					if (arg0.field1094 > 0) {
						arg0.field1094--;
						return;
					}
				}
			} else {
				arg0.field1082 = var5;
				arg0.field1083 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(BLQQSLPTGQ;)V")
	public final void method83(QQSLPTGQ arg0) {
		if (arg0.field1121 != 0) {
			if (arg0.field1110 != -1 && arg0.field1110 < 32768) {
				VMSVDNWD var2 = field403[arg0.field1110];
				if (var2 != null) {
					int var3 = arg0.field1082 - var2.field1082;
					int var4 = arg0.field1083 - var2.field1083;
					if (var3 != 0 || var4 != 0) {
						arg0.field1127 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1110 >= 32768) {
				int var5 = arg0.field1110 - 32768;
				if (field351 == var5) {
					var5 = field458;
				}

				YFPQHQAV var6 = field459[var5];
				if (var6 != null) {
					int var7 = arg0.field1082 - var6.field1082;
					int var8 = arg0.field1083 - var6.field1083;
					if (var7 != 0 || var8 != 0) {
						arg0.field1127 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1118 != 0 || arg0.field1119 != 0) && (arg0.field1131 == 0 || arg0.field1112 > 0)) {
				int var9 = arg0.field1082 - (arg0.field1118 - field67 - field67) * 64;
				int var10 = arg0.field1083 - (arg0.field1119 - field68 - field68) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1127 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1118 = 0;
				arg0.field1119 = 0;
			}

			int var11 = arg0.field1127 - arg0.field1084 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1121 || var11 > 2048 - arg0.field1121) {
					arg0.field1084 = arg0.field1127;
				} else if (var11 > 1024) {
					arg0.field1084 -= arg0.field1121;
				} else {
					arg0.field1084 += arg0.field1121;
				}

				arg0.field1084 &= 0x7FF;
				if (arg0.field1113 == arg0.field1102 && arg0.field1127 != arg0.field1084) {
					if (arg0.field1114 != -1) {
						arg0.field1102 = arg0.field1114;
						return;
					}

					arg0.field1102 = arg0.field1096;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LQQSLPTGQ;I)V")
	public final void method84(QQSLPTGQ arg0) {
		arg0.field1115 = false;

		if (arg0.field1102 != -1) {
			PQTJDTHH var2 = PQTJDTHH.field951[arg0.field1102];
			arg0.field1104++;
			if (arg0.field1103 < var2.field952 && arg0.field1104 > var2.method405(arg0.field1103)) {
				arg0.field1104 = 1;
				arg0.field1103++;
			}

			if (arg0.field1103 >= var2.field952) {
				arg0.field1104 = 1;
				arg0.field1103 = 0;
			}
		}

		if (arg0.field1077 != -1 && field231 >= arg0.field1080) {
			if (arg0.field1078 < 0) {
				arg0.field1078 = 0;
			}

			PQTJDTHH var3 = JXKRPXFX.field632[arg0.field1077].field636;
			arg0.field1079++;
			if (arg0.field1078 < var3.field952 && arg0.field1079 > var3.method405(arg0.field1078)) {
				arg0.field1079 = 1;
				arg0.field1078++;
			}

			if (arg0.field1078 >= var3.field952 && (arg0.field1078 < 0 || arg0.field1078 >= var3.field952)) {
				arg0.field1077 = -1;
			}
		}

		if (arg0.field1105 != -1 && arg0.field1108 <= 1) {
			PQTJDTHH var4 = PQTJDTHH.field951[arg0.field1105];
			if (var4.field963 == 1 && arg0.field1094 > 0 && arg0.field1091 <= field231 && arg0.field1092 < field231) {
				arg0.field1108 = 1;
				return;
			}
		}

		if (arg0.field1105 != -1 && arg0.field1108 == 0) {
			PQTJDTHH var5 = PQTJDTHH.field951[arg0.field1105];
			arg0.field1107++;
			if (arg0.field1106 < var5.field952 && arg0.field1107 > var5.method405(arg0.field1106)) {
				arg0.field1107 = 1;
				arg0.field1106++;
			}

			if (arg0.field1106 >= var5.field952) {
				arg0.field1106 -= var5.field956;
				arg0.field1109++;
				if (arg0.field1109 >= var5.field962) {
					arg0.field1105 = -1;
				}

				if (arg0.field1106 < 0 || arg0.field1106 >= var5.field952) {
					arg0.field1105 = -1;
				}
			}

			arg0.field1115 = var5.field958;
		}

		if (arg0.field1108 > 0) {
			arg0.field1108--;
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method85() {
		if (field221 == -1 || field328 != 2 && field506 == null) {
			if (field220) {
				method182();
				field220 = false;
				field53.method295(4, field505, 0);
				field54.method295(357, field505, 0);
				field55.method295(4, field505, 722);
				field56.method295(205, field505, 743);
				field57.method295(0, field505, 0);
				field58.method295(4, field505, 516);
				field59.method295(205, field505, 516);
				field60.method295(357, field505, 496);
				field61.method295(338, field505, 0);
				field333 = true;
				field386 = true;
				field148 = true;
				field132 = true;

				if (field328 != 2) {
					field391.method295(4, field505, 4);
					field390.method295(4, field505, 550);
				}
			}

			if (field328 == 2) {
				method46();
			}

			if (field211 && field163 == 1) {
				field333 = true;
			}

			if (field437 != -1) {
				boolean var3 = method62(field437, field296);
				if (var3) {
					field333 = true;
				}
			}

			if (field478 == 2) {
				field333 = true;
			}

			if (field340 == 2) {
				field333 = true;
			}

			if (field333) {
				method130();
				field333 = false;
			}

			if (field153 == -1 && field81 == 0) {
				field283.field905 = field359 - field174 - 77;

				if (field513 > 448 && field513 < 560 && field514 > 332) {
					method45(-1, 463, field283, 0, 77, field359, field513 - 17, field514 - 357);
				}

				int var4 = field359 - field283.field905 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field359 - 77) {
					var4 = field359 - 77;
				}

				if (field174 != var4) {
					field174 = var4;
					field386 = true;
				}
			}

			if (field153 == -1 && field81 == 3) {
				int var5 = field285 * 14 + 7;
				field283.field905 = field288;

				if (field513 > 448 && field513 < 560 && field514 > 332) {
					method45(-1, 463, field283, 0, 77, var5, field513 - 17, field514 - 357);
				}

				int var6 = field283.field905;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field288 != var6) {
					field288 = var6;
					field386 = true;
				}
			}

			if (field153 != -1) {
				boolean var7 = method62(field153, field296);
				if (var7) {
					field386 = true;
				}
			}

			if (field478 == 3) {
				field386 = true;
			}

			if (field340 == 3) {
				field386 = true;
			}

			if (field350 != null) {
				field386 = true;
			}

			if (field211 && field163 == 2) {
				field386 = true;
			}

			if (field386) {
				method148();
				field386 = false;
			}

			if (field328 == 2) {
				method63();
				field390.method295(4, field505, 550);
			}

			if (field193 != -1) {
				field148 = true;
			}

			if (field148) {
				if (field193 != -1 && field272 == field193) {
					field193 = -1;
					field100.method202(19);
					field100.method203(field272);
				}

				field148 = false;
				field253.method294();
				field118.method304(0, 0);

				if (field437 == -1) {
					if (field383[field272] != -1) {
						if (field272 == 0) {
							field245.method304(22, 10);
						}

						if (field272 == 1) {
							field246.method304(54, 8);
						}

						if (field272 == 2) {
							field246.method304(82, 8);
						}

						if (field272 == 3) {
							field247.method304(110, 8);
						}

						if (field272 == 4) {
							field249.method304(153, 8);
						}

						if (field272 == 5) {
							field249.method304(181, 8);
						}

						if (field272 == 6) {
							field248.method304(209, 9);
						}
					}

					if (field383[0] != -1 && (field193 != 0 || field231 % 20 < 10)) {
						field180[0].method304(29, 13);
					}

					if (field383[1] != -1 && (field193 != 1 || field231 % 20 < 10)) {
						field180[1].method304(53, 11);
					}

					if (field383[2] != -1 && (field193 != 2 || field231 % 20 < 10)) {
						field180[2].method304(82, 11);
					}

					if (field383[3] != -1 && (field193 != 3 || field231 % 20 < 10)) {
						field180[3].method304(115, 12);
					}

					if (field383[4] != -1 && (field193 != 4 || field231 % 20 < 10)) {
						field180[4].method304(153, 13);
					}

					if (field383[5] != -1 && (field193 != 5 || field231 % 20 < 10)) {
						field180[5].method304(180, 11);
					}

					if (field383[6] != -1 && (field193 != 6 || field231 % 20 < 10)) {
						field180[6].method304(208, 13);
					}
				}

				field253.method295(160, field505, 516);
				field252.method294();
				field117.method304(0, 0);

				if (field437 == -1) {
					if (field383[field272] != -1) {
						if (field272 == 7) {
							field175.method304(42, 0);
						}

						if (field272 == 8) {
							field176.method304(74, 0);
						}

						if (field272 == 9) {
							field176.method304(102, 0);
						}

						if (field272 == 10) {
							field177.method304(130, 1);
						}

						if (field272 == 11) {
							field179.method304(173, 0);
						}

						if (field272 == 12) {
							field179.method304(201, 0);
						}

						if (field272 == 13) {
							field178.method304(229, 0);
						}
					}

					if (field383[8] != -1 && (field193 != 8 || field231 % 20 < 10)) {
						field180[7].method304(74, 2);
					}

					if (field383[9] != -1 && (field193 != 9 || field231 % 20 < 10)) {
						field180[8].method304(102, 3);
					}

					if (field383[10] != -1 && (field193 != 10 || field231 % 20 < 10)) {
						field180[9].method304(137, 4);
					}

					if (field383[11] != -1 && (field193 != 11 || field231 % 20 < 10)) {
						field180[10].method304(174, 2);
					}

					if (field383[12] != -1 && (field193 != 12 || field231 % 20 < 10)) {
						field180[11].method304(201, 2);
					}

					if (field383[13] != -1 && (field193 != 13 || field231 % 20 < 10)) {
						field180[12].method304(226, 2);
					}
				}

				field252.method295(466, field505, 496);
				field391.method294();
				ZUDKHAVN.field1492 = field266;
			}

			if (field132) {
				field132 = false;
				field251.method294();
				field116.method304(0, 0);
				field345.method14(true, 55, "Public chat", 28, 0xFFFFFF);

				if (field277 == 0) {
					field345.method14(true, 55, "On", 41, 0xFF00);
				}

				if (field277 == 1) {
					field345.method14(true, 55, "Friends", 41, 0xFFFF00);
				}

				if (field277 == 2) {
					field345.method14(true, 55, "Off", 41, 0xFF0000);
				}

				if (field277 == 3) {
					field345.method14(true, 55, "Hide", 41, 0xFFFF);
				}

				field345.method14(true, 184, "Private chat", 28, 0xFFFFFF);

				if (field393 == 0) {
					field345.method14(true, 184, "On", 41, 0xFF00);
				}

				if (field393 == 1) {
					field345.method14(true, 184, "Friends", 41, 0xFFFF00);
				}

				if (field393 == 2) {
					field345.method14(true, 184, "Off", 41, 0xFF0000);
				}

				field345.method14(true, 324, "Trade/compete", 28, 0xFFFFFF);

				if (field412 == 0) {
					field345.method14(true, 324, "On", 41, 0xFF00);
				}

				if (field412 == 1) {
					field345.method14(true, 324, "Friends", 41, 0xFFFF00);
				}

				if (field412 == 2) {
					field345.method14(true, 324, "Off", 41, 0xFF0000);
				}

				field345.method14(true, 458, "Report abuse", 33, 0xFFFFFF);
				field251.method295(453, field505, 0);
				field391.method294();
				ZUDKHAVN.field1492 = field266;
			}

			field296 = 0;
		} else {
			if (field328 == 2) {
				method62(field221, field296);

				if (field435 != -1) {
					method62(field435, field296);
				}

				field296 = 0;
				method112();
				field506.method294();
				ZUDKHAVN.field1492 = field267;
				CBERHIHM.method31();
				field220 = true;
				PCARWQQC var1 = PCARWQQC.method394(field221);
				if (var1.field943 == 512 && var1.field933 == 334 && var1.field920 == 0) {
					var1.field943 = 765;
					var1.field933 = 503;
				}

				method71(0, 0, var1, 0);

				if (field435 != -1) {
					PCARWQQC var2 = PCARWQQC.method394(field435);
					if (var2.field943 == 512 && var2.field933 == 334 && var2.field920 == 0) {
						var2.field943 = 765;
						var2.field933 = 503;
					}

					method71(0, 0, var2, 0);
				}

				if (field211) {
					method114();
				} else {
					method88();
					method110();
				}
			}

			field506.method295(0, field505, 0);
		}
	}

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method86(int arg0, int arg1) {
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

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field508 != null) {
				return new URL("http://127.0.0.1:" + (field89 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public static final String method87(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.p(I)V")
	public final void method88() {
		if (field340 == 0) {
			field95[0] = "Cancel";
			field146[0] = 1290;
			field364 = 1;
			if (field221 == -1) {
				method143();
				field422 = 0;
				field414 = 0;

				if (field513 > 4 && field514 > 4 && field513 < 516 && field514 < 338) {
					if (field109 == -1) {
						method89();
					} else {
						method161(4, PCARWQQC.method394(field109), 0, field513, field514, 0, 4);
					}
				}

				if (field422 != field384) {
					field384 = field422;
				}

				if (field414 != field276) {
					field276 = field414;
				}

				field422 = 0;
				field414 = 0;

				if (field513 > 553 && field514 > 205 && field513 < 743 && field514 < 466) {
					if (field437 != -1) {
						method161(553, PCARWQQC.method394(field437), 1, field513, field514, 0, 205);
					} else if (field383[field272] != -1) {
						method161(553, PCARWQQC.method394(field383[field272]), 1, field513, field514, 0, 205);
					}
				}

				if (field422 != field199) {
					field333 = true;
					field199 = field422;
				}

				if (field414 != field224) {
					field333 = true;
					field224 = field414;
				}

				field422 = 0;
				field414 = 0;

				if (field513 > 17 && field514 > 357 && field513 < 496 && field514 < 453) {
					if (field153 != -1) {
						method161(17, PCARWQQC.method394(field153), 2, field513, field514, 0, 357);
					} else if (field159 != -1) {
						method161(17, PCARWQQC.method394(field159), 3, field513, field514, 0, 357);
					} else if (field514 < 434 && field513 < 426 && field81 == 0) {
						method117(field514 - 357, field513 - 17);
					}
				}

				if ((field153 != -1 || field159 != -1) && field422 != field161) {
					field386 = true;
					field161 = field422;
				}

				if ((field153 != -1 || field159 != -1) && field414 != field398) {
					field386 = true;
					field398 = field414;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field364 - 1; var2++) {
						if (field146[var2] < 1000 && field146[var2 + 1] > 1000) {
							String var3 = field95[var2];
							field95[var2] = field95[var2 + 1];
							field95[var2 + 1] = var3;
							int var4 = field146[var2];
							field146[var2] = field146[var2 + 1];
							field146[var2 + 1] = var4;
							int var5 = field144[var2];
							field144[var2] = field144[var2 + 1];
							field144[var2 + 1] = var5;
							int var6 = field145[var2];
							field145[var2] = field145[var2 + 1];
							field145[var2 + 1] = var6;
							int var7 = field147[var2];
							field147[var2] = field147[var2 + 1];
							field147[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field422 = 0;
				field414 = 0;
				method161(0, PCARWQQC.method394(field221), 0, field513, field514, 0, 0);

				if (field422 != field384) {
					field384 = field422;
				}

				if (field414 != field276) {
					field276 = field414;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method89() {
		if (field83 == 0 && field149 == 0) {
			field95[field364] = "Walk here";
			field146[field364] = 763;
			field144[field364] = field513;
			field145[field364] = field514;
			field364++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < KUGNQTGL.field731; var2++) {
			int var3 = KUGNQTGL.field732[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field110.method517(field349, var4, var5, var3) >= 0) {
					PZYCJUKA var8 = PZYCJUKA.method409(var7);
					if (var8.field1014 != null) {
						var8 = var8.method410();
					}

					if (var8 == null) {
						continue;
					}

					if (field83 == 1) {
						field95[field364] = "Use " + field87 + " with @cya@" + var8.field994;
						field146[field364] = 725;
						field147[field364] = var3;
						field144[field364] = var4;
						field145[field364] = var5;
						field364++;
					} else if (field149 != 1) {
						if (var8.field993 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field993[var9] != null) {
									field95[field364] = var8.field993[var9] + " @cya@" + var8.field994;

									if (var9 == 0) {
										field146[field364] = 837;
									}

									if (var9 == 1) {
										field146[field364] = 337;
									}

									if (var9 == 2) {
										field146[field364] = 101;
									}

									if (var9 == 3) {
										field146[field364] = 840;
									}

									if (var9 == 4) {
										field146[field364] = 1173;
									}

									field147[field364] = var3;
									field144[field364] = var4;
									field145[field364] = var5;
									field364++;
								}
							}
						}

						field95[field364] = "Examine @cya@" + var8.field994;
						field146[field364] = 1030;
						field147[field364] = var8.field1012 << 14;
						field144[field364] = var4;
						field145[field364] = var5;
						field364++;
					} else if ((field151 & 0x4) == 4) {
						field95[field364] = field152 + " @cya@" + var8.field994;
						field146[field364] = 865;
						field147[field364] = var3;
						field144[field364] = var4;
						field145[field364] = var5;
						field364++;
					}
				}

				if (var6 == 1) {
					VMSVDNWD var10 = field403[var7];
					if (var10.field1304.field1186 == 1 && (var10.field1082 & 0x7F) == 0x40 && (var10.field1083 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field404; var11++) {
							VMSVDNWD var12 = field403[field405[var11]];
							if (var12 != null && var10 != var12 && var12.field1304.field1186 == 1 && var10.field1082 == var12.field1082 && var10.field1083 == var12.field1083) {
								method180(field405[var11], var4, var5, var12.field1304);
							}
						}

						for (int var13 = 0; var13 < field460; var13++) {
							YFPQHQAV var14 = field459[field461[var13]];
							if (var14 != null && var10.field1082 == var14.field1082 && var10.field1083 == var14.field1083) {
								method147(var5, var14, var4, field461[var13]);
							}
						}
					}

					method180(var7, var4, var5, var10.field1304);
				}

				if (var6 == 0) {
					YFPQHQAV var15 = field459[var7];
					if ((var15.field1082 & 0x7F) == 0x40 && (var15.field1083 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field404; var16++) {
							VMSVDNWD var17 = field403[field405[var16]];
							if (var17 != null && var17.field1304.field1186 == 1 && var15.field1082 == var17.field1082 && var15.field1083 == var17.field1083) {
								method180(field405[var16], var4, var5, var17.field1304);
							}
						}

						for (int var18 = 0; var18 < field460; var18++) {
							YFPQHQAV var19 = field459[field461[var18]];
							if (var19 != null && var15 != var19 && var15.field1082 == var19.field1082 && var15.field1083 == var19.field1083) {
								method147(var5, var19, var4, field461[var18]);
							}
						}
					}

					method147(var5, var15, var4, var7);
				}

				if (var6 == 3) {
					QGWIBVPG var20 = field227[field349][var4][var5];
					if (var20 != null) {
						for (CCYSOVSO var21 = (CCYSOVSO) var20.method423(); var21 != null; var21 = (CCYSOVSO) var20.method425()) {
							NCBEIRPV var22 = NCBEIRPV.method390(var21.field34);
							if (field83 == 1) {
								field95[field364] = "Use " + field87 + " with @lre@" + var22.field833;
								field146[field364] = 641;
								field147[field364] = var21.field34;
								field144[field364] = var4;
								field145[field364] = var5;
								field364++;
							} else if (field149 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field845 != null && var22.field845[var23] != null) {
										field95[field364] = var22.field845[var23] + " @lre@" + var22.field833;

										if (var23 == 0) {
											field146[field364] = 429;
										}

										if (var23 == 1) {
											field146[field364] = 367;
										}

										if (var23 == 2) {
											field146[field364] = 595;
										}

										if (var23 == 3) {
											field146[field364] = 155;
										}

										if (var23 == 4) {
											field146[field364] = 180;
										}

										field147[field364] = var21.field34;
										field144[field364] = var4;
										field145[field364] = var5;
										field364++;
									} else if (var23 == 2) {
										field95[field364] = "Take @lre@" + var22.field833;
										field146[field364] = 595;
										field147[field364] = var21.field34;
										field144[field364] = var4;
										field145[field364] = var5;
										field364++;
									}
								}

								field95[field364] = "Examine @lre@" + var22.field833;
								field146[field364] = 1635;
								field147[field364] = var21.field34;
								field144[field364] = var4;
								field145[field364] = var5;
								field364++;
							} else if ((field151 & 0x1) == 1) {
								field95[field364] = field152 + " @lre@" + var22.field833;
								field146[field364] = 540;
								field147[field364] = var21.field34;
								field144[field364] = var4;
								field145[field364] = var5;
								field364++;
							}
						}
					}
				}
			}
		}
	}

	public final void run() {
		if (field410) {
			method49();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method90(int arg0) {
		if (arg0 >= 0) {
			int var2 = field144[arg0];
			int var3 = field145[arg0];
			int var4 = field146[arg0];
			int var5 = field147[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field81 != 0 && var4 != 1290) {
				field81 = 0;
				field386 = true;
			}

			if (var4 == 865 && method60(var5, var2, var3)) {
				field100.method202(156);
				field100.method238(field150);
				field100.method238(field67 + var2);
				field100.method240(var5 >> 14 & 0x7FFF);
				field100.method238(field68 + var3);
			}

			if (var4 == 1030) {
				int var6 = var5 >> 14 & 0x7FFF;
				PZYCJUKA var7 = PZYCJUKA.method409(var6);
				String var8;
				if (var7.field984 == null) {
					var8 = "It's a " + var7.field994 + ".";
				} else {
					var8 = new String(var7.field984);
				}

				method177(var8, "", 0);
			}

			if (var4 == 4) {
				field100.method202(208);
				field100.method240(var3);
				field100.method239(var5);
				field100.method239(var2);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 595) {
				boolean var9 = method164(var3, 2, 0, 0, 0, field62.field1086[0], field62.field1085[0], false, var2, 0, 0);
				if (!var9) {
					method164(var3, 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var2, 1, 0);
				}

				field334 = field520;
				field335 = field521;
				field337 = 2;
				field336 = 0;
				field100.method202(170);
				field100.method204(field68 + var3);
				field100.method240(var5);
				field100.method204(field67 + var2);
			}

			if (var4 == 155) {
				boolean var11 = method164(var3, 2, 0, 0, 0, field62.field1086[0], field62.field1085[0], false, var2, 0, 0);
				if (!var11) {
					method164(var3, 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var2, 1, 0);
				}

				field334 = field520;
				field335 = field521;
				field337 = 2;
				field336 = 0;
				field100.method202(28);
				field100.method238(field68 + var3);
				field100.method204(var5);
				field100.method240(field67 + var2);
			}

			if (var4 == 476) {
				VMSVDNWD var13 = field403[var5];
				if (var13 != null) {
					method164(var13.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var13.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(86);
					field100.method238(var5);
				}
			}

			if (var4 == 545) {
				YFPQHQAV var14 = field459[var5];
				if (var14 != null) {
					method164(var14.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var14.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(142);
					field100.method239(var5);
				}
			}

			if (var4 == 143 || var4 == 950 || var4 == 140 || var4 == 9) {
				String var15 = field95[arg0];
				int var16 = var15.indexOf("@whi@");
				if (var16 != -1) {
					long var17 = RPCTGZHI.method445(var15.substring(var16 + 5).trim());
					if (var4 == 143) {
						method111(var17);
					}

					if (var4 == 950) {
						method75(var17);
					}

					if (var4 == 140) {
						method55(var17);
					}

					if (var4 == 9) {
						method141(var17);
					}
				}
			}

			if (var4 == 891) {
				YFPQHQAV var19 = field459[var5];
				if (var19 != null) {
					method164(var19.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var19.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(216);
					field100.method240(var5);
				}
			}

			if (var4 == 223) {
				YFPQHQAV var20 = field459[var5];
				if (var20 != null) {
					method164(var20.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var20.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(74);
					field100.method240(field85);
					field100.method238(field86);
					field100.method240(field84);
					field100.method204(var5);
				}
			}

			if (var4 == 800) {
				VMSVDNWD var21 = field403[var5];
				if (var21 != null) {
					method164(var21.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var21.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(66);
					field100.method238(field86);
					field100.method240(field84);
					field100.method204(var5);
					field100.method240(field85);
				}
			}

			if (var4 == 367) {
				boolean var22 = method164(var3, 2, 0, 0, 0, field62.field1086[0], field62.field1085[0], false, var2, 0, 0);
				if (!var22) {
					method164(var3, 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var2, 1, 0);
				}

				field334 = field520;
				field335 = field521;
				field337 = 2;
				field336 = 0;
				field100.method202(42);
				field100.method239(var5);
				field100.method204(field68 + var3);
				field100.method238(field67 + var2);
			}

			if (var4 == 422) {
				field100.method202(241);
				field100.method238(var5);
				field100.method204(var2);
				field100.method204(var3);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 1635) {
				NCBEIRPV var24 = NCBEIRPV.method390(var5);
				String var25;
				if (var24.field850 == null) {
					var25 = "It's a " + var24.field833 + ".";
				} else {
					var25 = new String(var24.field850);
				}

				method177(var25, "", 0);
			}

			if (var4 == 490) {
				if ((var5 & 0x3) == 0) {
					field358++;
				}

				if (field358 >= 63) {
					field100.method202(193);
					field100.method206(0x6E92E4);
					field358 = 0;
				}

				field100.method202(126);
				field100.method240(var2);
				field100.method240(var3);
				field100.method240(var5);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 51) {
				field100.method202(164);
				field100.method240(field86);
				field100.method238(var2);
				field100.method204(var5);
				field100.method239(field85);
				field100.method238(var3);
				field100.method238(field84);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 763) {
				if (field211) {
					field110.method525(var3 - 4, var2 - 4);
				} else {
					field110.method525(field521 - 4, field520 - 4);
				}
			}

			if (var4 == 486) {
				field100.method202(146);
				field100.method240(var2);
				field100.method240(var3);
				field100.method239(var5);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 992) {
				VMSVDNWD var26 = field403[var5];
				if (var26 != null) {
					method164(var26.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var26.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(128);
					field100.method239(var5);
				}
			}

			if (var4 == 856) {
				field100.method202(47);
				field100.method204(var2);
				field100.method239(var5);
				field100.method204(var3);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 113) {
				field100.method202(207);
				field100.method240(var5);
				field100.method240(var3);
				field100.method240(var2);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 531) {
				method170();
			}

			if (var4 == 337) {
				method60(var5, var2, var3);
				field100.method202(224);
				field100.method240(var5 >> 14 & 0x7FFF);
				field100.method204(field67 + var2);
				field100.method239(field68 + var3);
			}

			if (var4 == 365) {
				YFPQHQAV var27 = field459[var5];
				if (var27 != null) {
					method164(var27.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var27.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(236);
					field100.method239(var5);
				}
			}

			if (var4 == 83) {
				VMSVDNWD var28 = field403[var5];
				if (var28 != null) {
					method164(var28.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var28.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(18);
					field100.method238(field150);
					field100.method238(var5);
				}
			}

			if (var4 == 286) {
				VMSVDNWD var29 = field403[var5];
				if (var29 != null) {
					method164(var29.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var29.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(182);
					field100.method238(var5);
				}
			}

			if (var4 == 840) {
				if ((field67 & 0x3) == 0) {
					field294++;
				}

				if (field294 >= 52) {
					field100.method202(168);
					field294 = 0;
				}

				method60(var5, var2, var3);
				field100.method202(195);
				field100.method240(field67 + var2);
				field100.method239(field68 + var3);
				field100.method240(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 489) {
				field100.method202(36);
				field100.method238(var2);
				field100.method239(var3);
				field100.method239(var5);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 269) {
				method50(field159);
				field159 = -1;
				field386 = true;
			}

			if (var4 == 363) {
				String var30 = field95[arg0];
				int var31 = var30.indexOf("@whi@");
				if (var31 != -1) {
					long var32 = RPCTGZHI.method445(var30.substring(var31 + 5).trim());
					int var34 = -1;
					for (int var35 = 0; var35 < field195; var35++) {
						if (field71[var35] == var32) {
							var34 = var35;
							break;
						}
					}

					if (var34 != -1 && field197[var34] > 0) {
						field386 = true;
						field81 = 0;
						field289 = true;
						field254 = "";
						field420 = 3;
						field302 = field71[var34];
						field271 = "Enter message to send to " + field400[var34];
					}
				}
			}

			if (var4 == 1314) {
				NCBEIRPV var36 = NCBEIRPV.method390(var5);
				PCARWQQC var37 = PCARWQQC.method394(var3);
				String var38;
				if (var37 != null && var37.field931[var2] >= 100000) {
					var38 = var37.field931[var2] + " x " + var36.field833;
				} else if (var36.field850 == null) {
					var38 = "It's a " + var36.field833 + ".";
				} else {
					var38 = new String(var36.field850);
				}

				method177(var38, "", 0);
			}

			if (var4 == 555) {
				YFPQHQAV var39 = field459[var5];
				if (var39 != null) {
					method164(var39.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var39.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(25);
					field100.method238(var5);
					field100.method204(field150);
				}
			}

			if (var4 == 94) {
				YFPQHQAV var40 = field459[var5];
				if (var40 != null) {
					method164(var40.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var40.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;

					if ((var5 & 0x3) == 0) {
						field465++;
					}

					if (field465 >= 144) {
						field100.method202(44);
						field100.method204(4239);
						field465 = 0;
					}

					field100.method202(108);
					field100.method239(var5);
				}
			}

			if (var4 == 1 && !field190) {
				field100.method202(223);
				field100.method204(var3);
				field190 = true;
			}

			if (var4 == 1738) {
				VMSVDNWD var41 = field403[var5];
				if (var41 != null) {
					RDFTXEYV var42 = var41.field1304;
					if (var42.field1191 != null) {
						var42 = var42.method436();
					}

					if (var42 != null) {
						String var43;
						if (var42.field1184 == null) {
							var43 = "It's a " + var42.field1165 + ".";
						} else {
							var43 = new String(var42.field1184);
						}

						method177(var43, "", 0);
					}
				}
			}

			if (var4 == 741) {
				PCARWQQC var44 = PCARWQQC.method394(var3);
				boolean var45 = true;
				if (var44.field903 > 0) {
					var45 = method121(var44);
				}

				if (var45) {
					field100.method202(16);
					field100.method204(var3);
				}
			}

			if (var4 == 540) {
				boolean var46 = method164(var3, 2, 0, 0, 0, field62.field1086[0], field62.field1085[0], false, var2, 0, 0);
				if (!var46) {
					method164(var3, 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var2, 1, 0);
				}

				field334 = field520;
				field335 = field521;
				field337 = 2;
				field336 = 0;
				field100.method202(34);
				field100.method240(field67 + var2);
				field100.method240(var5);
				field100.method238(field68 + var3);
				field100.method239(field150);
			}

			if (var4 == 641) {
				boolean var48 = method164(var3, 2, 0, 0, 0, field62.field1086[0], field62.field1085[0], false, var2, 0, 0);
				if (!var48) {
					method164(var3, 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var2, 1, 0);
				}

				field334 = field520;
				field335 = field521;
				field337 = 2;
				field336 = 0;
				field100.method202(59);
				field100.method204(field67 + var2);
				field100.method238(field68 + var3);
				field100.method204(var5);
				field100.method240(field84);
				field100.method238(field85);
				field100.method239(field86);
			}

			if (var4 == 315) {
				field100.method202(137);
				field100.method204(var5);
				field100.method204(var2);
				field100.method239(var3);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 101) {
				method60(var5, var2, var3);
				field100.method202(177);
				field100.method238(field67 + var2);
				field100.method238(var5 >> 14 & 0x7FFF);
				field100.method204(field68 + var3);
			}

			if (var4 == 319) {
				VMSVDNWD var50 = field403[var5];
				if (var50 != null) {
					method164(var50.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var50.field1085[0], 1, 0);
					field334 = field520;
					field335 = field521;
					field337 = 2;
					field336 = 0;
					field100.method202(6);
					field100.method238(var5);
				}
			}

			if (var4 == 725 && method60(var5, var2, var3)) {
				field100.method202(95);
				field100.method239(var5 >> 14 & 0x7FFF);
				field100.method204(field68 + var3);
				field100.method238(field84);
				field100.method238(field86);
				field100.method239(field85);
				field100.method238(field67 + var2);
			}

			if (var4 == 837) {
				method60(var5, var2, var3);
				field100.method202(110);
				field100.method240(var5 >> 14 & 0x7FFF);
				field100.method240(field68 + var3);
				field100.method204(field67 + var2);
			}

			if (var4 == 243) {
				String var51 = field95[arg0];
				int var52 = var51.indexOf("@whi@");
				if (var52 != -1) {
					if (field109 == -1) {
						method170();
						field198 = var51.substring(var52 + 5).trim();
						field416 = false;
						field479 = field109 = PCARWQQC.field880;
					} else {
						method177("Please close the interface you have open before using 'report abuse'", "", 0);
					}
				}
			}

			if (var4 == 793 || var4 == 510) {
				String var53 = field95[arg0];
				int var54 = var53.indexOf("@whi@");
				if (var54 != -1) {
					var53 = var53.substring(var54 + 5).trim();
					String var55 = RPCTGZHI.method449(RPCTGZHI.method446(RPCTGZHI.method445(var53)));
					boolean var56 = false;
					for (int var57 = 0; var57 < field460; var57++) {
						YFPQHQAV var58 = field459[field461[var57]];
						if (var58 != null && var58.field1423 != null && var58.field1423.equalsIgnoreCase(var55)) {
							method164(var58.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var58.field1085[0], 1, 0);

							if (var4 == 793) {
								if ((var5 & 0x3) == 0) {
									field465++;
								}

								if (field465 >= 144) {
									field100.method202(44);
									field100.method204(4239);
									field465 = 0;
								}

								field100.method202(108);
								field100.method239(field461[var57]);
							}

							if (var4 == 510) {
								if ((var5 & 0x3) == 0) {
									field473++;
								}

								if (field473 >= 138) {
									field100.method202(145);
									field100.method206(0x426CAD);
									field473 = 0;
								}

								field100.method202(70);
								field100.method239(field461[var57]);
							}

							var56 = true;
							break;
						}
					}

					if (!var56) {
						method177("Unable to find " + var55, "", 0);
					}
				}
			}

			if (var4 == 906) {
				field100.method202(45);
				field100.method240(var5);
				field100.method238(var2);
				field100.method238(field150);
				field100.method239(var3);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 682) {
				field100.method202(91);
				field100.method238(var2);
				field100.method238(var5);
				field100.method238(var3);
				field475 = 0;
				field476 = var3;
				field477 = var2;
				field478 = 2;
				if (PCARWQQC.method394(var3).field930 == field109) {
					field478 = 1;
				}

				if (PCARWQQC.method394(var3).field930 == field153) {
					field478 = 3;
				}
			}

			if (var4 == 417) {
				field100.method202(16);
				field100.method204(var3);
				PCARWQQC var59 = PCARWQQC.method394(var3);
				if (var59.field937 != null && var59.field937[0][0] == 5) {
					int var60 = var59.field937[0][1];
					if (field470[var60] != var59.field902[0]) {
						field470[var60] = var59.field902[0];
						method113(var60);
						field333 = true;
					}
				}
			}

			if (var4 == 180) {
				boolean var61 = method164(var3, 2, 0, 0, 0, field62.field1086[0], field62.field1085[0], false, var2, 0, 0);
				if (!var61) {
					method164(var3, 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var2, 1, 0);
				}

				field334 = field520;
				field335 = field521;
				field337 = 2;
				field336 = 0;
				field100.method202(27);
				field100.method238(var5);
				field100.method238(field68 + var3);
				field100.method239(field67 + var2);
			}

			if (var4 == 429) {
				boolean var63 = method164(var3, 2, 0, 0, 0, field62.field1086[0], field62.field1085[0], false, var2, 0, 0);
				if (!var63) {
					method164(var3, 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var2, 1, 0);
				}

				field334 = field520;
				field335 = field521;
				field337 = 2;
				field336 = 0;
				field100.method202(84);
				field100.method239(field68 + var3);
				field100.method204(field67 + var2);
				field100.method239(var5);
			}

			if (var4 == 529) {
				field83 = 1;
				field84 = var2;
				field85 = var3;
				field86 = var5;
				field87 = String.valueOf(NCBEIRPV.method390(var5).field833);
				field149 = 0;
				field333 = true;
			} else if (var4 == 508) {
				PCARWQQC var65 = PCARWQQC.method394(var3);
				field149 = 1;
				field150 = var3;
				field151 = var65.field939;
				field83 = 0;
				field333 = true;
				String var66 = var65.field893;
				if (var66.indexOf(" ") != -1) {
					var66 = var66.substring(0, var66.indexOf(" "));
				}

				String var67 = var65.field893;
				if (var67.indexOf(" ") != -1) {
					var67 = var67.substring(var67.indexOf(" ") + 1);
				}

				field152 = var66 + " " + var65.field932 + " " + var67;

				if (field151 == 16) {
					field333 = true;
					field272 = 3;
					field148 = true;
				}
			} else {
				if (var4 == 1173) {
					if ((var5 & 0x3) == 0) {
						field377++;
					}

					if (field377 >= 112) {
						field100.method202(232);
						field100.method204(63273);
						field377 = 0;
					}

					method60(var5, var2, var3);
					field100.method202(50);
					field100.method239(field67 + var2);
					field100.method240(field68 + var3);
					field100.method204(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 416) {
					YFPQHQAV var68 = field459[var5];
					if (var68 != null) {
						method164(var68.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var68.field1085[0], 1, 0);
						field334 = field520;
						field335 = field521;
						field337 = 2;
						field336 = 0;

						if ((var5 & 0x3) == 0) {
							field473++;
						}

						if (field473 >= 138) {
							field100.method202(145);
							field100.method206(0x426CAD);
							field473 = 0;
						}

						field100.method202(70);
						field100.method239(var5);
					}
				}

				if (var4 == 593) {
					field100.method202(190);
					field100.method240(var2);
					field100.method204(var5);
					field100.method240(var3);
					field475 = 0;
					field476 = var3;
					field477 = var2;
					field478 = 2;
					if (PCARWQQC.method394(var3).field930 == field109) {
						field478 = 1;
					}

					if (PCARWQQC.method394(var3).field930 == field153) {
						field478 = 3;
					}
				}

				if (var4 == 923) {
					field100.method202(16);
					field100.method204(var3);
					PCARWQQC var69 = PCARWQQC.method394(var3);
					if (var69.field937 != null && var69.field937[0][0] == 5) {
						int var70 = var69.field937[0][1];
						field470[var70] = 1 - field470[var70];
						method113(var70);
						field333 = true;
					}
				}

				if (var4 == 434) {
					VMSVDNWD var71 = field403[var5];
					if (var71 != null) {
						method164(var71.field1086[0], 2, 0, 0, 1, field62.field1086[0], field62.field1085[0], false, var71.field1085[0], 1, 0);
						field334 = field520;
						field335 = field521;
						field337 = 2;
						field336 = 0;
						field100.method202(147);
						field100.method204(var5);
					}
				}

				field83 = 0;
				field149 = 0;
				field333 = true;
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method91() {
		for (int var1 = -1; var1 < field460; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field458;
			} else {
				var2 = field461[var1];
			}

			YFPQHQAV var3 = field459[var2];
			if (var3 != null && var3.field1123 > 0) {
				var3.field1123--;
				if (var3.field1123 == 0) {
					var3.field1101 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field404; var4++) {
			int var5 = field405[var4];
			VMSVDNWD var6 = field403[var5];
			if (var6 != null && var6.field1123 > 0) {
				var6.field1123--;
				if (var6.field1123 == 0) {
					var6.field1101 = null;
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

	@ObfuscatedName("client.a(IIIZ)I")
	public final int method92(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ZILFTMSICIZ;)V")
	public final void method93(int arg0, FTMSICIZ arg1) {
		while (arg1.field536 + 21 < arg0 * 8) {
			int var3 = arg1.method224(14);
			if (var3 == 16383) {
				break;
			}

			if (field403[var3] == null) {
				field403[var3] = new VMSVDNWD();
			}

			VMSVDNWD var4 = field403[var3];
			field405[field404++] = var3;
			var4.field1100 = field231;
			int var5 = arg1.method224(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method224(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method224(1);
			if (var7 == 1) {
				field463[field462++] = var3;
			}

			int var8 = arg1.method224(1);
			var4.field1304 = RDFTXEYV.method439(arg1.method224(13));
			var4.field1095 = var4.field1304.field1186;
			var4.field1121 = var4.field1304.field1192;
			var4.field1096 = var4.field1304.field1175;
			var4.field1097 = var4.field1304.field1172;
			var4.field1098 = var4.field1304.field1177;
			var4.field1099 = var4.field1304.field1170;
			var4.field1113 = var4.field1304.field1194;
			var4.method432(field62.field1085[0] + var5, var8 == 1, field62.field1086[0] + var6);
		}

		arg1.method225();
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method94() {
		for (QIFJGOLN var1 = (QIFJGOLN) field108.method422(); var1 != null; var1 = (QIFJGOLN) field108.method424()) {
			if (field349 != var1.field1046 || field231 > var1.field1045) {
				var1.method418();
			} else if (field231 >= var1.field1044) {
				if (var1.field1034 > 0) {
					VMSVDNWD var2 = field403[var1.field1034 - 1];
					if (var2 != null && var2.field1082 >= 0 && var2.field1082 < 13312 && var2.field1083 >= 0 && var2.field1083 < 13312) {
						var1.method427(method106(var2.field1082, var1.field1046, var2.field1083) - var1.field1043, field231, var2.field1082, var2.field1083);
					}
				}

				if (var1.field1034 < 0) {
					int var3 = -var1.field1034 - 1;
					YFPQHQAV var4;
					if (field351 == var3) {
						var4 = field62;
					} else {
						var4 = field459[var3];
					}

					if (var4 != null && var4.field1082 >= 0 && var4.field1082 < 13312 && var4.field1083 >= 0 && var4.field1083 < 13312) {
						var1.method427(method106(var4.field1082, var1.field1046, var4.field1083) - var1.field1043, field231, var4.field1082, var4.field1083);
					}
				}

				var1.method428(field296);
				field110.method498((int) var1.field1051, var1, (int) var1.field1049, 60, (int) var1.field1050, var1.field1038, field349, false, -1);
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method95() {
		for (int var1 = -1; var1 < field460; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field458;
			} else {
				var2 = field461[var1];
			}

			YFPQHQAV var3 = field459[var2];
			if (var3 != null) {
				method79(1, var3);
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method96() {
		if (field519 == 1) {
			if (field520 >= 539 && field520 <= 573 && field521 >= 169 && field521 < 205 && field383[0] != -1) {
				field333 = true;
				field272 = 0;
				field148 = true;
			}

			if (field520 >= 569 && field520 <= 599 && field521 >= 168 && field521 < 205 && field383[1] != -1) {
				field333 = true;
				field272 = 1;
				field148 = true;
			}

			if (field520 >= 597 && field520 <= 627 && field521 >= 168 && field521 < 205 && field383[2] != -1) {
				field333 = true;
				field272 = 2;
				field148 = true;
			}

			if (field520 >= 625 && field520 <= 669 && field521 >= 168 && field521 < 203 && field383[3] != -1) {
				field333 = true;
				field272 = 3;
				field148 = true;
			}

			if (field520 >= 666 && field520 <= 696 && field521 >= 168 && field521 < 205 && field383[4] != -1) {
				field333 = true;
				field272 = 4;
				field148 = true;
			}

			if (field520 >= 694 && field520 <= 724 && field521 >= 168 && field521 < 205 && field383[5] != -1) {
				field333 = true;
				field272 = 5;
				field148 = true;
			}

			if (field520 >= 722 && field520 <= 756 && field521 >= 169 && field521 < 205 && field383[6] != -1) {
				field333 = true;
				field272 = 6;
				field148 = true;
			}

			if (field520 >= 540 && field520 <= 574 && field521 >= 466 && field521 < 502 && field383[7] != -1) {
				field333 = true;
				field272 = 7;
				field148 = true;
			}

			if (field520 >= 572 && field520 <= 602 && field521 >= 466 && field521 < 503 && field383[8] != -1) {
				field333 = true;
				field272 = 8;
				field148 = true;
			}

			if (field520 >= 599 && field520 <= 629 && field521 >= 466 && field521 < 503 && field383[9] != -1) {
				field333 = true;
				field272 = 9;
				field148 = true;
			}

			if (field520 >= 627 && field520 <= 671 && field521 >= 467 && field521 < 502 && field383[10] != -1) {
				field333 = true;
				field272 = 10;
				field148 = true;
			}

			if (field520 >= 669 && field520 <= 699 && field521 >= 466 && field521 < 503 && field383[11] != -1) {
				field333 = true;
				field272 = 11;
				field148 = true;
			}

			if (field520 >= 696 && field520 <= 726 && field521 >= 466 && field521 < 503 && field383[12] != -1) {
				field333 = true;
				field272 = 12;
				field148 = true;
			}

			if (field520 >= 724 && field520 <= 758 && field521 >= 466 && field521 < 502 && field383[13] != -1) {
				field333 = true;
				field272 = 13;
				field148 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field182.method304(arg1, arg3);
		field183.method304(arg1, arg2 + arg3 - 16);
		CBERHIHM.method33(arg1, field467, arg3 + 16, arg2 - 32, 16);
		int var6 = (arg2 - 32) * arg2 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg0 / (arg4 - arg2);
		CBERHIHM.method33(arg1, field154, arg3 + var7 + 16, var6, 16);
		CBERHIHM.method38(var6, field368, arg3 + var7 + 16, arg1);
		CBERHIHM.method38(var6, field368, arg3 + var7 + 16, arg1 + 1);
		CBERHIHM.method36(arg3 + var7 + 16, arg1, field368, 16);
		CBERHIHM.method36(arg3 + var7 + 17, arg1, field368, 16);
		CBERHIHM.method38(var6, field361, arg3 + var7 + 16, arg1 + 15);
		CBERHIHM.method38(var6 - 1, field361, arg3 + var7 + 17, arg1 + 14);
		CBERHIHM.method36(arg3 + var7 + var6 + 15, arg1, field361, 16);
		CBERHIHM.method36(arg3 + var7 + var6 + 14, arg1 + 1, field361, 15);
	}

	@ObfuscatedName("client.a(IIZLKUDWIDHU;)V")
	public final void method98(int arg0, int arg1, KUDWIDHU arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field365 + field310 & 0x7FF;
			int var6 = KUGNQTGL.field733[var5];
			int var7 = KUGNQTGL.field734[var5];
			var6 = var6 * 256 / (field157 + 256);
			var7 = var7 * 256 / (field157 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field263.method323(20, 83 - var13 - 20, 256, var12 + 94 + 4 - 10, var10, 15, 20, 15);
		} else {
			method136(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method99() {
		for (ZVYASFEK var1 = (ZVYASFEK) field184.method422(); var1 != null; var1 = (ZVYASFEK) field184.method424()) {
			if (field349 != var1.field1504 || var1.field1508) {
				var1.method418();
			} else if (field231 >= var1.field1512) {
				var1.method605(field296);

				if (var1.field1508) {
					var1.method418();
				} else {
					field110.method498(var1.field1507, var1, var1.field1505, 60, var1.field1506, 0, var1.field1504, false, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method100(boolean arg0) {
		method140();
		field135.method294();
		field237.method304(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field308 == 0) {
			int var4 = var3 / 2 + 80;
			field344.method14(true, var2 / 2, field332.field776, var4, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field346.method14(true, var2 / 2, "Welcome to RuneScape", var5, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field238.method304(var6 - 73, var7 - 20);
			field346.method14(true, var6, "New User", var7 + 5, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field238.method304(var8 - 73, var7 - 20);
			field346.method14(true, var8, "Existing User", var7 + 5, 0xFFFFFF);
		}

		if (field308 == 2) {
			int var9 = var3 / 2 - 40;
			if (field387.length() > 0) {
				field346.method14(true, var2 / 2, field387, var9 - 15, 0xFFFF00);
				field346.method14(true, var2 / 2, field388, var9, 0xFFFF00);
				var9 += 30;
			} else {
				field346.method14(true, var2 / 2, field388, var9 - 7, 0xFFFF00);
				var9 += 30;
			}

			field346.method21(var2 / 2 - 90, var9, true, "Username: " + field75 + (field274 == 0 & field231 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF);
			var9 += 15;
			field346.method21(var2 / 2 - 88, var9, true, "Password: " + RPCTGZHI.method450(field76) + (field274 == 1 & field231 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field238.method304(var10 - 73, var11 - 20);
				field346.method14(true, var10, "Login", var11 + 5, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field238.method304(var12 - 73, var11 - 20);
				field346.method14(true, var12, "Cancel", var11 + 5, 0xFFFFFF);
			}
		}

		if (field308 == 3) {
			field346.method14(true, var2 / 2, "Create a free account", var3 / 2 - 60, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field346.method14(true, var2 / 2, "To create a new account you need to", var13, 0xFFFFFF);
			var13 += 15;
			field346.method14(true, var2 / 2, "go back to the main RuneScape webpage", var13, 0xFFFFFF);
			var13 += 15;
			field346.method14(true, var2 / 2, "and choose the 'create account'", var13, 0xFFFFFF);
			var13 += 15;
			field346.method14(true, var2 / 2, "button near the top of that page.", var13, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field238.method304(var14 - 73, var15 - 20);
			field346.method14(true, var14, "Cancel", var15 + 5, 0xFFFFFF);
		}

		field135.method295(171, field505, 202);

		if (field220) {
			field220 = false;
			field133.method295(0, field505, 128);
			field134.method295(371, field505, 202);
			field138.method295(265, field505, 0);
			field139.method295(265, field505, 562);
			field140.method295(171, field505, 128);
			field141.method295(171, field505, 562);
		}
	}

	@ObfuscatedName("client.a(LPCARWQQC;I)Z")
	public final boolean method101(PCARWQQC arg0) {
		int var2 = arg0.field903;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field95[field364] = "Remove @whi@" + arg0.field942;
				field146[field364] = 9;
				field364++;
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

		field95[field364] = "Remove @whi@" + field400[var2];
		field146[field364] = 140;
		field364++;
		field95[field364] = "Message @whi@" + field400[var2];
		field146[field364] = 363;
		field364++;
		return true;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method102() {
		if (field519 == 1) {
			if (field520 >= 6 && field520 <= 106 && field521 >= 467 && field521 <= 499) {
				field277 = (field277 + 1) % 4;
				field132 = true;
				field386 = true;
				field100.method202(206);
				field100.method203(field277);
				field100.method203(field393);
				field100.method203(field412);
			}

			if (field520 >= 135 && field520 <= 235 && field521 >= 467 && field521 <= 499) {
				field393 = (field393 + 1) % 3;
				field132 = true;
				field386 = true;
				field100.method202(206);
				field100.method203(field277);
				field100.method203(field393);
				field100.method203(field412);
			}

			if (field520 >= 273 && field520 <= 373 && field521 >= 467 && field521 <= 499) {
				field412 = (field412 + 1) % 3;
				field132 = true;
				field386 = true;
				field100.method202(206);
				field100.method203(field277);
				field100.method203(field393);
				field100.method203(field412);
			}

			if (field520 >= 412 && field520 <= 512 && field521 >= 467 && field521 <= 499) {
				if (field109 == -1) {
					method170();
					field198 = "";
					field416 = false;
					field479 = field109 = PCARWQQC.field880;
					return;
				}

				method177("Please close the interface you have open before using 'report abuse'", "", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method103() {
		field243 = null;
		field279 = null;
		field44 = null;
		field399 = null;
		field280 = null;
		field281 = null;
		field227 = null;
		field363 = null;
		field175 = null;
		field176 = null;
		field177 = null;
		field178 = null;
		field179 = null;
		field98 = null;
		field99 = null;
		field313 = null;
		field417 = null;
		field418 = null;
		field419 = null;
		field100 = null;
		field242 = null;
		field453 = null;
		field403 = null;
		field405 = null;
		field400 = null;
		field71 = null;
		field197 = null;
		field194 = null;
		field222 = null;
		field396 = null;
		field428 = null;
		field397 = null;
		field255 = null;
		field382 = null;
		method129();
		field251 = null;
		field252 = null;
		field253 = null;
		field138 = null;
		field139 = null;
		field140 = null;
		field141 = null;
		field53 = null;
		field54 = null;
		field55 = null;
		field56 = null;
		field245 = null;
		field246 = null;
		field247 = null;
		field248 = null;
		field249 = null;
		field459 = null;
		field461 = null;
		field463 = null;
		field464 = null;
		field74 = null;
		field424 = null;
		field180 = null;
		field116 = null;
		field117 = null;
		field118 = null;
		field438 = null;
		field481 = null;
		field110 = null;
		field282 = null;
		field136 = null;
		field137 = null;
		field133 = null;
		field134 = null;
		field135 = null;
		field454 = null;
		field57 = null;
		field58 = null;
		field59 = null;
		field60 = null;
		field61 = null;

		if (field469 != null) {
			field469.field564 = false;
		}

		field469 = null;
		field470 = null;
		field441 = null;
		field442 = null;
		field443 = null;
		field444 = null;
		field445 = null;
		field229 = null;
		field326 = null;
		field217 = null;
		field218 = null;

		if (field332 != null) {
			field332.method363();
		}

		field332 = null;
		field402 = null;

		try {
			if (field293 != null) {
				field293.method456();
			}
		} catch (Exception var1) {
		}

		field293 = null;
		field389 = null;
		field390 = null;
		field391 = null;
		field392 = null;
		field144 = null;
		field145 = null;
		field146 = null;
		field147 = null;
		field95 = null;
		field108 = null;
		field184 = null;
		field474 = null;
		field200 = null;
		method135();
		PZYCJUKA.method415();
		RDFTXEYV.method438();
		NCBEIRPV.method382();
		PCARWQQC.method400();
		TFMGYYZY.field1291 = null;
		XPVGEAJJ.field1385 = null;
		MOVKABVL.field792 = null;
		PQTJDTHH.field951 = null;
		JXKRPXFX.field632 = null;
		JXKRPXFX.field644 = null;
		IFGHRSOU.field590 = null;
		field506 = null;
		YFPQHQAV.field1400 = null;
		ZUDKHAVN.method588();
		XNSGYTEG.method486();
		KUGNQTGL.method326();
		SCWTQUFK.method453();
		System.gc();
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method104(String arg0) {
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

	@ObfuscatedName("client.b(IZ)V")
	public final void method105(int arg0) {
		if (!field91) {
			for (int var2 = 0; var2 < field306.length; var2++) {
				int var3 = field306[var2];
				if (ZUDKHAVN.field1500[var3] >= arg0) {
					ITVAFKCK var4 = ZUDKHAVN.field1494[var3];
					int var5 = var4.field608 * var4.field607 - 1;
					int var6 = field296 * var4.field607 * 2;
					byte[] var7 = var4.field605;
					byte[] var8 = field424;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field605 = var8;
					field424 = var7;
					ZUDKHAVN.method595(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBII)I")
	public final int method106(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field481[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field438[var6][var4][var5] + field438[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field438[var6][var4][var5 + 1] + field438[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method107(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method107(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.i(B)V")
	public void method108() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field300);

		if (field332 != null) {
			System.out.println("Od-cycle:" + field332.field753);
		}

		System.out.println("loop-cycle:" + field231);
		System.out.println("draw-cycle:" + field423);
		System.out.println("ptype:" + field371);
		System.out.println("psize:" + field370);

		if (field293 != null) {
			field293.method461();
		}

		field502 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method109() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field508 != null) {
			return field508;
		}

		return this;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method110() {
		if (field364 >= 2 || field83 != 0 || field149 != 0) {
			String var1;
			if (field83 == 1 && field364 < 2) {
				var1 = "Use " + field87 + " with...";
			} else if (field149 == 1 && field364 < 2) {
				var1 = field152 + "...";
			} else {
				var1 = field95[field364 - 1];
			}

			if (field364 > 2) {
				var1 = var1 + "@whi@ / " + (field364 - 2) + " more options";
			}

			field346.method22(field231 / 1000, var1, 4, true, 0xFFFFFF, 15);
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method111(long arg0) {
		if (arg0 != 0L) {
			if (field195 >= 100 && field46 != 1) {
				method177("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else if (field195 >= 200) {
				method177("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			} else {
				String var3 = RPCTGZHI.method449(RPCTGZHI.method446(arg0));
				for (int var4 = 0; var4 < field195; var4++) {
					if (field71[var4] == arg0) {
						method177(var3 + " is already on your friend list", "", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field240; var5++) {
					if (field120[var5] == arg0) {
						method177("Please remove " + var3 + " from your ignore list first", "", 0);
						return;
					}
				}

				if (!var3.equals(field62.field1423)) {
					field400[field195] = var3;
					field71[field195] = arg0;
					field197[field195] = 0;
					field195++;
					field333 = true;
					field100.method202(253);
					field100.method209(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method112() {
		if (field506 == null) {
			method135();
			field133 = null;
			field134 = null;
			field135 = null;
			field136 = null;
			field137 = null;
			field138 = null;
			field139 = null;
			field140 = null;
			field141 = null;
			field392 = null;
			field390 = null;
			field389 = null;
			field391 = null;
			field251 = null;
			field252 = null;
			field253 = null;
			field506 = new HZYGKZDT(method109(), 765, 503);
			field220 = true;
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method113(int arg0) {
		int var2 = IFGHRSOU.field590[arg0].field598;
		if (var2 != 0) {
			int var3 = field470[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					ZUDKHAVN.method597(0.9D);
				}

				if (var3 == 2) {
					ZUDKHAVN.method597(0.8D);
				}

				if (var3 == 3) {
					ZUDKHAVN.method597(0.7D);
				}

				if (var3 == 4) {
					ZUDKHAVN.method597(0.6D);
				}

				NCBEIRPV.field866.method200();
				field220 = true;
			}

			if (var2 == 3) {
				boolean var4 = field124;

				if (var3 == 0) {
					method162(field124, 0);
					field124 = true;
				}

				if (var3 == 1) {
					method162(field124, -400);
					field124 = true;
				}

				if (var3 == 2) {
					method162(field124, -800);
					field124 = true;
				}

				if (var3 == 3) {
					method162(field124, -1200);
					field124 = true;
				}

				if (var3 == 4) {
					field124 = false;
				}

				if (field124 != var4 && !field91) {
					if (field124) {
						field319 = field66;
						field320 = true;
						field332.method366(2, field319);
					} else {
						method129();
					}

					field104 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field239 = true;
					method68(0);
				}

				if (var3 == 1) {
					field239 = true;
					method68(-400);
				}

				if (var3 == 2) {
					field239 = true;
					method68(-800);
				}

				if (var3 == 3) {
					field239 = true;
					method68(-1200);
				}

				if (var3 == 4) {
					field239 = false;
				}
			}

			if (var2 == 5) {
				field250 = var3;
			}

			if (var2 == 6) {
				field115 = var3;
			}

			if (var2 == 8) {
				field225 = var3;
				field386 = true;
			}

			if (var2 == 9) {
				field426 = var3;
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method114() {
		int var1 = field164;
		int var2 = field165;
		int var3 = field166;
		int var4 = field167;
		int var5 = 0x5D5447;
		CBERHIHM.method33(var1, var5, var2, var4, var3);
		CBERHIHM.method33(var1 + 1, 0, var2 + 1, 16, var3 - 2);
		CBERHIHM.method34(var3 - 2, var4 - 19, 0, var1 + 1, var2 + 18);
		field346.method17("Choose Option", var1 + 3, var2 + 14, var5);
		int var6 = field513;
		int var7 = field514;
		if (field163 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field163 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field163 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field364; var8++) {
			int var9 = (field364 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field346.method21(var1 + 3, var9, true, field95[var8], var10);
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method115(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field195; var2++) {
			if (arg0.equalsIgnoreCase(field400[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field62.field1423)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(LFTMSICIZ;ZIILYFPQHQAV;)V")
	public final void method116(FTMSICIZ arg0, int arg1, int arg2, YFPQHQAV arg3) {
		if ((arg1 & 0x20) != 0) {
			int var5 = arg0.method242();
			if (var5 == 0xFFFF) {
				var5 = -1;
			}

			int var6 = arg0.method233();
			if (arg3.field1105 == var5 && var5 != -1) {
				int var7 = PQTJDTHH.field951[var5].field965;
				if (var7 == 1) {
					arg3.field1106 = 0;
					arg3.field1107 = 0;
					arg3.field1108 = var6;
					arg3.field1109 = 0;
				}

				if (var7 == 2) {
					arg3.field1109 = 0;
				}
			} else if (var5 == -1 || arg3.field1105 == -1 || PQTJDTHH.field951[var5].field959 >= PQTJDTHH.field951[arg3.field1105].field959) {
				arg3.field1105 = var5;
				arg3.field1106 = 0;
				arg3.field1107 = 0;
				arg3.field1108 = var6;
				arg3.field1109 = 0;
				arg3.field1094 = arg3.field1131;
			}
		}

		if ((arg1 & 0x40) != 0) {
			int var8 = arg0.method213();
			byte[] var9 = new byte[var8];
			FTMSICIZ var10 = new FTMSICIZ(var9);
			arg0.method222(0, var9, var8);
			field464[arg2] = var10;
			arg3.method548(var10);
		}

		if ((arg1 & 0x80) != 0) {
			arg3.field1101 = arg0.method220();
			if (arg3.field1101.charAt(0) == '~') {
				arg3.field1101 = arg3.field1101.substring(1);
				method177(arg3.field1101, arg3.field1423, 2);
			} else if (field62 == arg3) {
				method177(arg3.field1101, arg3.field1423, 2);
			}

			arg3.field1111 = 0;
			arg3.field1120 = 0;
			arg3.field1123 = 150;
		}

		if ((arg1 & 0x4) != 0) {
			int var11 = arg0.method233();
			int var12 = arg0.method213();
			arg3.method431(var12, var11, field231);
			arg3.field1128 = field231 + 300;
			arg3.field1129 = arg0.method233();
			arg3.field1130 = arg0.method234();
		}

		if ((arg1 & 0x8) != 0) {
			int var13 = arg0.method215();
			int var14 = arg0.method234();
			int var15 = arg0.method233();
			int var16 = arg0.field535;

			if (arg3.field1423 != null && arg3.field1411) {
				long var17 = RPCTGZHI.method445(arg3.field1423);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field240; var20++) {
						if (field120[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field291 == 0) {
					try {
						field402.field535 = 0;
						arg0.method252(0, field402.field534, var15);
						field402.field535 = 0;
						String var21 = RJOTKPCV.method442(field402, var15);
						var21 = GSWNKABU.method264(var21);
						arg3.field1101 = var21;
						arg3.field1111 = var13 >> 8;
						arg3.field1120 = var13 & 0xFF;
						arg3.field1123 = 150;

						if (var14 == 2 || var14 == 3) {
							method177(var21, "@cr2@" + arg3.field1423, 1);
						} else if (var14 == 1) {
							method177(var21, "@cr1@" + arg3.field1423, 1);
						} else {
							method177(var21, arg3.field1423, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field535 = var15 + var16;
		}

		if ((arg1 & 0x100) != 0) {
			arg3.field1077 = arg0.method215();
			int var23 = arg0.method249();
			arg3.field1081 = var23 >> 16;
			arg3.field1080 = (var23 & 0xFFFF) + field231;
			arg3.field1078 = 0;
			arg3.field1079 = 0;

			if (arg3.field1080 > field231) {
				arg3.field1078 = -1;
			}

			if (arg3.field1077 == 0xFFFF) {
				arg3.field1077 = -1;
			}
		}

		if ((arg1 & 0x400) != 0) {
			int var24 = arg0.method213();
			int var25 = arg0.method232();
			arg3.method431(var25, var24, field231);
			arg3.field1128 = field231 + 300;
			arg3.field1129 = arg0.method233();
			arg3.field1130 = arg0.method233();
		}

		if ((arg1 & 0x1) != 0) {
			arg3.field1118 = arg0.method242();
			arg3.field1119 = arg0.method242();
		}

		if ((arg1 & 0x200) != 0) {
			arg3.field1087 = arg0.method213();
			arg3.field1089 = arg0.method233();
			arg3.field1088 = arg0.method234();
			arg3.field1090 = arg0.method213();
			arg3.field1091 = arg0.method215() + field231;
			arg3.field1092 = arg0.method215() + field231;
			arg3.field1093 = arg0.method232();
			arg3.method429();
		}

		if ((arg1 & 0x2) != 0) {
			arg3.field1110 = arg0.method215();
			if (arg3.field1110 == 0xFFFF) {
				arg3.field1110 = -1;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(BII)V")
	public final void method117(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field258[var4] != null) {
				int var5 = field256[var4];
				int var6 = field174 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field257[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field277 == 0 || field277 == 1 && method115(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field62.field1423)) {
						if (field142 >= 1) {
							field95[field364] = "Report abuse @whi@" + var7;
							field146[field364] = 243;
							field364++;
						}

						field95[field364] = "Add ignore @whi@" + var7;
						field146[field364] = 950;
						field364++;
						field95[field364] = "Add friend @whi@" + var7;
						field146[field364] = 143;
						field364++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field225 == 0 && (var5 == 7 || field393 == 0 || field393 == 1 && method115(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field142 >= 1) {
							field95[field364] = "Report abuse @whi@" + var7;
							field146[field364] = 243;
							field364++;
						}

						field95[field364] = "Add ignore @whi@" + var7;
						field146[field364] = 950;
						field364++;
						field95[field364] = "Add friend @whi@" + var7;
						field146[field364] = 143;
						field364++;
					}

					var3++;
				}

				if (var5 == 4 && (field412 == 0 || field412 == 1 && method115(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field95[field364] = "Accept trade @whi@" + var7;
						field146[field364] = 793;
						field364++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field225 == 0 && field393 < 2) {
					var3++;
				}

				if (var5 == 8 && (field412 == 0 || field412 == 1 && method115(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field95[field364] = "Accept challenge @whi@" + var7;
						field146[field364] = 510;
						field364++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method118(boolean arg0) {
		for (int var2 = 0; var2 < field404; var2++) {
			VMSVDNWD var3 = field403[field405[var2]];
			int var4 = (field405[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method433() && var3.field1304.field1178 == arg0 && var3.field1304.method434()) {
				int var5 = var3.field1082 >> 7;
				int var6 = var3.field1083 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1095 == 1 && (var3.field1082 & 0x7F) == 0x40 && (var3.field1083 & 0x7F) == 0x40) {
						if (field243[var5][var6] == field446) {
							continue;
						}

						field243[var5][var6] = field446;
					}

					if (!var3.field1304.field1183) {
						var4 += Integer.MIN_VALUE;
					}

					field110.method498(method106(var3.field1082, field349, var3.field1083), var3, var3.field1082, (var3.field1095 - 1) * 64 + 60, var3.field1083, var3.field1084, field349, var3.field1115, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(LCUNUEMWX;I)V")
	public final void method119(CUNUEMWX arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field492 == 0) {
			var2 = field110.method513(arg0.field491, arg0.field493, arg0.field494);
		}

		if (arg0.field492 == 1) {
			var2 = field110.method514(arg0.field491, arg0.field493, arg0.field494);
		}

		if (arg0.field492 == 2) {
			var2 = field110.method515(arg0.field491, arg0.field493, arg0.field494);
		}

		if (arg0.field492 == 3) {
			var2 = field110.method516(arg0.field491, arg0.field493, arg0.field494);
		}

		if (var2 != 0) {
			int var6 = field110.method517(arg0.field491, arg0.field493, arg0.field494, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field483 = var3;
		arg0.field485 = var4;
		arg0.field484 = var5;
	}

	@ObfuscatedName("client.a()V")
	public final void method120() {
		method172("Starting up", 20);

		if (signlink.sunjava) {
			field499 = 5;
		}

		if (field303) {
			field290 = true;
		} else {
			field303 = true;
			boolean var1 = false;
			String var2 = method187();
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
						field241[var3] = new ARIAIPRE(var3 + 1, signlink.cache_dat, signlink.cache_idx[var3], 600000);
					}
				}

				try {
					method123();
					field143 = method179("title screen", 1, field49[1], 25, "title");
					field344 = new CAMKASVY(field143, "p11_full", false);
					field345 = new CAMKASVY(field143, "p12_full", false);
					field346 = new CAMKASVY(field143, "b12_full", false);
					field347 = new CAMKASVY(field143, "q8_full", true);
					method66();
					method144();
					AKPFVPPG var4 = method179("config", 2, field49[2], 30, "config");
					AKPFVPPG var5 = method179("interface", 3, field49[3], 35, "interface");
					AKPFVPPG var6 = method179("2d graphics", 4, field49[4], 40, "media");
					AKPFVPPG var7 = method179("textures", 6, field49[6], 45, "textures");
					AKPFVPPG var8 = method179("chat system", 7, field49[7], 50, "wordenc");
					AKPFVPPG var9 = method179("sound effects", 8, field49[8], 55, "sounds");
					field481 = new byte[4][104][104];
					field438 = new int[4][105][105];
					field110 = new XNSGYTEG(104, field438, 104, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field282[var10] = new ZSRJFSKK(104, 104);
					}

					field382 = new KUDWIDHU(512, 512);
					AKPFVPPG var11 = method179("update list", 5, field49[5], 60, "versionlist");
					method172("Connecting to update server", 60);
					field332 = new LVBGZMMP();
					field332.method373(var11, this);
					SCWTQUFK.method451(field332.method369());
					KUGNQTGL.method327(field332.method359(0), field332);

					if (!field91) {
						field319 = 0;
						field320 = true;
						field332.method366(2, field319);

						while (field332.method377() > 0) {
							method165();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}

							if (field332.field760 > 3) {
								method104("ondemand");
								return;
							}
						}
					}

					method172("Requesting animations", 65);
					int var12 = field332.method359(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field332.method366(1, var13);
					}

					while (field332.method377() > 0) {
						int var14 = var12 - field332.method377();
						if (var14 > 0) {
							method172("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method165();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}

						if (field332.field760 > 3) {
							method104("ondemand");
							return;
						}
					}

					method172("Requesting models", 70);
					int var15 = field332.method359(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field332.method374(var16);
						if ((var17 & 0x1) != 0) {
							field332.method366(0, var16);
						}
					}

					int var18 = field332.method377();
					while (field332.method377() > 0) {
						int var19 = var18 - field332.method377();
						if (var19 > 0) {
							method172("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method165();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field241[0] != null) {
						method172("Requesting maps", 75);
						field332.method366(3, field332.method371(48, 0, 47));
						field332.method366(3, field332.method371(48, 1, 47));
						field332.method366(3, field332.method371(48, 0, 48));
						field332.method366(3, field332.method371(48, 1, 48));
						field332.method366(3, field332.method371(48, 0, 49));
						field332.method366(3, field332.method371(48, 1, 49));
						field332.method366(3, field332.method371(47, 0, 47));
						field332.method366(3, field332.method371(47, 1, 47));
						field332.method366(3, field332.method371(47, 0, 48));
						field332.method366(3, field332.method371(47, 1, 48));
						field332.method366(3, field332.method371(148, 0, 48));
						field332.method366(3, field332.method371(148, 1, 48));
						int var20 = field332.method377();
						while (field332.method377() > 0) {
							int var21 = var20 - field332.method377();
							if (var21 > 0) {
								method172("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method165();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var22 = field332.method359(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field332.method374(var23);
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
							field332.method365(0, var25, var23);
						}
					}

					field332.method360(field90);

					if (!field91) {
						int var26 = field332.method359(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field332.method367(var27)) {
								field332.method365(2, (byte) 1, var27);
							}
						}
					}

					int var28 = field332.method359(0);
					for (int var29 = 0; var29 < var28; var29++) {
						int var30 = field332.method374(var29);
						if (var30 == 0 && field332.field757 < 200) {
							field332.method365(0, (byte) 1, var29);
						}
					}

					method172("Unpacking media", 80);
					field417 = new ITVAFKCK(var6, "invback", 0);
					field419 = new ITVAFKCK(var6, "chatback", 0);
					field418 = new ITVAFKCK(var6, "mapback", 0);
					field116 = new ITVAFKCK(var6, "backbase1", 0);
					field117 = new ITVAFKCK(var6, "backbase2", 0);
					field118 = new ITVAFKCK(var6, "backhmid1", 0);

					for (int var31 = 0; var31 < 13; var31++) {
						field180[var31] = new ITVAFKCK(var6, "sideicons", var31);
					}

					field194 = new KUDWIDHU(var6, "compass", 0);
					field263 = new KUDWIDHU(var6, "mapedge", 0);
					field263.method315();

					for (int var32 = 0; var32 < 72; var32++) {
						field474[var32] = new ITVAFKCK(var6, "mapscene", var32);
					}

					for (int var33 = 0; var33 < 70; var33++) {
						field200[var33] = new KUDWIDHU(var6, "mapfunction", var33);
					}

					for (int var34 = 0; var34 < 5; var34++) {
						field222[var34] = new KUDWIDHU(var6, "hitmarks", var34);
					}

					for (int var35 = 0; var35 < 6; var35++) {
						field396[var35] = new KUDWIDHU(var6, "headicons_pk", var35);
					}

					for (int var36 = 0; var36 < 9; var36++) {
						field428[var36] = new KUDWIDHU(var6, "headicons_prayer", var36);
					}

					for (int var37 = 0; var37 < 6; var37++) {
						field397[var37] = new KUDWIDHU(var6, "headicons_hint", var37);
					}

					field454 = new KUDWIDHU(var6, "overlay_multiway", 0);
					field431 = new KUDWIDHU(var6, "mapmarker", 0);
					field432 = new KUDWIDHU(var6, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field255[var38] = new KUDWIDHU(var6, "cross", var38);
					}

					field441 = new KUDWIDHU(var6, "mapdots", 0);
					field442 = new KUDWIDHU(var6, "mapdots", 1);
					field443 = new KUDWIDHU(var6, "mapdots", 2);
					field444 = new KUDWIDHU(var6, "mapdots", 3);
					field445 = new KUDWIDHU(var6, "mapdots", 4);
					field182 = new ITVAFKCK(var6, "scrollbar", 0);
					field183 = new ITVAFKCK(var6, "scrollbar", 1);
					field245 = new ITVAFKCK(var6, "redstone1", 0);
					field246 = new ITVAFKCK(var6, "redstone2", 0);
					field247 = new ITVAFKCK(var6, "redstone3", 0);
					field248 = new ITVAFKCK(var6, "redstone1", 0);
					field248.method301();
					field249 = new ITVAFKCK(var6, "redstone2", 0);
					field249.method301();
					field175 = new ITVAFKCK(var6, "redstone1", 0);
					field175.method302();
					field176 = new ITVAFKCK(var6, "redstone2", 0);
					field176.method302();
					field177 = new ITVAFKCK(var6, "redstone3", 0);
					field177.method302();
					field178 = new ITVAFKCK(var6, "redstone1", 0);
					field178.method301();
					field178.method302();
					field179 = new ITVAFKCK(var6, "redstone2", 0);
					field179.method301();
					field179.method302();

					for (int var39 = 0; var39 < 2; var39++) {
						field411[var39] = new ITVAFKCK(var6, "mod_icons", var39);
					}

					KUDWIDHU var40 = new KUDWIDHU(var6, "backleft1", 0);
					field53 = new HZYGKZDT(method109(), var40.field659, var40.field660);
					var40.method316(0, 0);
					KUDWIDHU var41 = new KUDWIDHU(var6, "backleft2", 0);
					field54 = new HZYGKZDT(method109(), var41.field659, var41.field660);
					var41.method316(0, 0);
					KUDWIDHU var42 = new KUDWIDHU(var6, "backright1", 0);
					field55 = new HZYGKZDT(method109(), var42.field659, var42.field660);
					var42.method316(0, 0);
					KUDWIDHU var43 = new KUDWIDHU(var6, "backright2", 0);
					field56 = new HZYGKZDT(method109(), var43.field659, var43.field660);
					var43.method316(0, 0);
					KUDWIDHU var44 = new KUDWIDHU(var6, "backtop1", 0);
					field57 = new HZYGKZDT(method109(), var44.field659, var44.field660);
					var44.method316(0, 0);
					KUDWIDHU var45 = new KUDWIDHU(var6, "backvmid1", 0);
					field58 = new HZYGKZDT(method109(), var45.field659, var45.field660);
					var45.method316(0, 0);
					KUDWIDHU var46 = new KUDWIDHU(var6, "backvmid2", 0);
					field59 = new HZYGKZDT(method109(), var46.field659, var46.field660);
					var46.method316(0, 0);
					KUDWIDHU var47 = new KUDWIDHU(var6, "backvmid3", 0);
					field60 = new HZYGKZDT(method109(), var47.field659, var47.field660);
					var47.method316(0, 0);
					KUDWIDHU var48 = new KUDWIDHU(var6, "backhmid2", 0);
					field61 = new HZYGKZDT(method109(), var48.field659, var48.field660);
					var48.method316(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 100; var53++) {
						if (field200[var53] != null) {
							field200[var53].method314(var50 + var52, var51 + var52, var49 + var52);
						}

						if (field474[var53] != null) {
							field474[var53].method303(var50 + var52, var51 + var52, var49 + var52);
						}
					}

					method172("Unpacking textures", 83);
					ZUDKHAVN.method593(var7);
					ZUDKHAVN.method597(0.8D);
					ZUDKHAVN.method592(20);
					method172("Unpacking config", 86);
					PQTJDTHH.method404(var4);
					PZYCJUKA.method412(var4);
					TFMGYYZY.method468(var4);
					NCBEIRPV.method389(var4);
					RDFTXEYV.method441(var4);
					XPVGEAJJ.method538(var4);
					JXKRPXFX.method306(var4);
					IFGHRSOU.method297(var4);
					NSTEZBJV.method392(var4);
					NCBEIRPV.field821 = field90;

					if (!field91) {
						method172("Unpacking sounds", 90);
						byte[] var54 = var9.method7("sounds.dat", null);
						FTMSICIZ var55 = new FTMSICIZ(var54);
						TBRIOEDI.method462(var55);
					}

					method172("Unpacking interfaces", 95);
					CAMKASVY[] var56 = new CAMKASVY[] { field344, field345, field346, field347 };
					PCARWQQC.method401(var56, var6, var5);
					method172("Preparing game engine", 100);

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field418.field605[field418.field607 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field114[var57] = var58;
						field413[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field418.field605[field418.field607 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field215[var61 - 5] = var62 - 25;
						field126[var61 - 5] = var63 - var62;
					}

					ZUDKHAVN.method590(503, 765);
					field267 = ZUDKHAVN.field1492;
					ZUDKHAVN.method590(96, 479);
					field264 = ZUDKHAVN.field1492;
					ZUDKHAVN.method590(261, 190);
					field265 = ZUDKHAVN.field1492;
					ZUDKHAVN.method590(334, 512);
					field266 = ZUDKHAVN.field1492;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = ZUDKHAVN.field1490[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					XNSGYTEG.method523(var65, 334, 512, 800, 500);
					GSWNKABU.method254(var8);
					field469 = new GFMKEKCW(this);
					method107(field469, 10);
					GEKFXIMX.field550 = this;
					PZYCJUKA.field1008 = this;
					RDFTXEYV.field1190 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field357 + " " + field378);
					field270 = true;
				}
			} else {
				field107 = true;
			}
		}
	}

	@ObfuscatedName("client.b(LPCARWQQC;I)Z")
	public final boolean method121(PCARWQQC arg0) {
		int var2 = arg0.field903;
		if (field196 == 2) {
			if (var2 == 201) {
				field386 = true;
				field81 = 0;
				field289 = true;
				field254 = "";
				field420 = 1;
				field271 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field386 = true;
				field81 = 0;
				field289 = true;
				field254 = "";
				field420 = 2;
				field271 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field374 = 250;
			return true;
		}

		if (var2 == 501) {
			field386 = true;
			field81 = 0;
			field289 = true;
			field254 = "";
			field420 = 4;
			field271 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field386 = true;
			field81 = 0;
			field289 = true;
			field254 = "";
			field420 = 5;
			field271 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field436[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = XPVGEAJJ.field1384 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= XPVGEAJJ.field1384) {
							var5 = 0;
						}
					}

					if (!XPVGEAJJ.field1385[var5].field1391 && XPVGEAJJ.field1385[var5].field1386 == var3 + (field64 ? 0 : 7)) {
						break;
					}
				}

				field436[var3] = var5;
				field213 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field162[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field408[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field408[var6].length) {
					var8 = 0;
				}
			}

			field162[var6] = var8;
			field213 = true;
		}

		if (var2 == 324 && !field64) {
			field64 = true;
			method131();
		}

		if (var2 == 325 && field64) {
			field64 = false;
			method131();
		}

		if (var2 == 326) {
			field100.method202(118);
			field100.method203(field64 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field100.method203(field436[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field100.method203(field162[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field416 = !field416;
		}

		if (var2 >= 601 && var2 <= 613) {
			method170();

			if (field198.length() > 0) {
				field100.method202(167);
				field100.method209(RPCTGZHI.method445(field198));
				field100.method203(var2 - 601);
				field100.method203(field416 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(ZLITVAFKCK;)V")
	public final void method122(ITVAFKCK arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field122.length; var3++) {
			field122[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field122[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field123[var9] = (field122[var9 - 1] + field122[var9 + 1] + field122[var9 - 128] + field122[var9 + 128]) / 4;
				}
			}

			int[] var10 = field122;
			field122 = field123;
			field123 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field608; var12++) {
				for (int var13 = 0; var13 < arg0.field607; var13++) {
					if (arg0.field605[var11++] != 0) {
						int var14 = var13 + arg0.field609 + 16;
						int var15 = var12 + arg0.field610 + 16;
						int var16 = (var15 << 7) + var14;
						field122[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method123() {
		int var1 = 5;
		field49[8] = 0;
		int var2 = 0;
		while (field49[8] == 0) {
			String var3 = "Unknown problem";
			method172("Connecting to web server", 20);

			try {
				DataInputStream var4 = method76("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 372);
				FTMSICIZ var5 = new FTMSICIZ(new byte[40]);
				var4.readFully(var5.field534, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field49[var6] = var5.method218();
				}

				int var7 = var5.method218();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field49[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field49[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field49[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field49[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field49[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field49[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method172("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method172(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field354 = !field354;
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method124() {
		if (field225 != 0) {
			CAMKASVY var1 = field345;
			int var2 = 0;
			if (field456 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field258[var3] != null) {
					int var4 = field256[var3];
					String var5 = field257[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field393 == 0 || field393 == 1 && method115(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method17("From", var8, var7, 0);
						var1.method17("From", var8, var7 - 1, 0xFFFF);
						int var11 = var8 + var1.method15("From ");
						if (var6 == 1) {
							field411[0].method304(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field411[1].method304(var11, var7 - 12);
							var11 += 14;
						}

						var1.method17(var5 + ": " + field258[var3], var11, var7, 0);
						var1.method17(var5 + ": " + field258[var3], var11, var7 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field393 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method17(field258[var3], 4, var9, 0);
						var1.method17(field258[var3], 4, var9 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field393 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method17("To " + var5 + ": " + field258[var3], 4, var10, 0);
						var1.method17("To " + var5 + ": " + field258[var3], 4, var10 - 1, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method125() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field51[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field51[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field52[var10] = (field51[var10 - 1] + field51[var10 + 1] + field51[var10 - 128] + field51[var10 + 128]) / 4;
			}
		}

		field343 += 128;
		if (field343 > field122.length) {
			field343 -= field122.length;
			int var11 = (int) (Math.random() * 12.0D);
			method122(field362[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field52[var14 + 128] - field122[field343 + var14 & field122.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field51[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field65[var16] = field65[var16 + 1];
		}

		field65[var1 - 1] = (int) (Math.sin(field231 / 14.0D) * 16.0D + Math.sin(field231 / 15.0D) * 14.0D + Math.sin(field231 / 16.0D) * 12.0D);

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

	@ObfuscatedName("client.x(I)V")
	public final void method126() {
		try {
			field189 = -1;
			field184.method426();
			field108.method426();
			ZUDKHAVN.method591();
			method186();
			field110.method487();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field282[var1].method576();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field481[var2][var3][var4] = 0;
					}
				}
			}

			YIGACPUG var5 = new YIGACPUG(field438, 104, field481, 104);
			int var6 = field44.length;
			field100.method202(225);

			if (!field425) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field279[var7] >> 8) * 64 - field67;
					int var9 = (field279[var7] & 0xFF) * 64 - field68;
					byte[] var10 = field44[var7];
					if (var10 != null) {
						var5.method566(field282, var9, (field407 - 6) * 8, var10, var8, (field406 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field279[var11] >> 8) * 64 - field67;
					int var13 = (field279[var11] & 0xFF) * 64 - field68;
					byte[] var14 = field44[var11];
					if (var14 == null && field407 < 800) {
						var5.method564(var13, var12, 64, 64);
					}
				}

				field100.method202(225);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field399[var15];
					if (var16 != null) {
						int var17 = (field279[var15] >> 8) * 64 - field67;
						int var18 = (field279[var15] & 0xFF) * 64 - field68;
						var5.method569(var17, var18, field282, var16, field110);
					}
				}
			}

			if (field425) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field111[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field279.length; var29++) {
									if (field279[var29] == var28 && field44[var29] != null) {
										var5.method550(field44[var29], var21 * 8, (var27 & 0x7) * 8, var24, (var26 & 0x7) * 8, var25, var19, field282, var20 * 8);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method551(var21 * 8, var19, var20 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field111[0][var30][var31];
						if (var32 == -1) {
							var5.method564(var31 * 8, var30 * 8, 8, 8);
						}
					}
				}

				field100.method202(225);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field111[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field279.length; var42++) {
									if (field279[var42] == var41 && field399[var42] != null) {
										var5.method556(var38, var37, var34 * 8, var35 * 8, field110, (var39 & 0x7) * 8, field399[var42], var33, field282, (var40 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field100.method202(225);
			var5.method568(field110, field282);

			if (field391 != null) {
				field391.method294();
				ZUDKHAVN.field1492 = field266;
			}

			field100.method202(225);
			int var43 = YIGACPUG.field1429;
			if (var43 > field349) {
				var43 = field349;
			}

			if (var43 < field349 - 1) {
				int var44 = field349 - 1;
			}

			if (field91) {
				field110.method488(YIGACPUG.field1429);
			} else {
				field110.method488(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method48(var45, var46);
				}
			}

			method142();
		} catch (Exception var59) {
		}

		PZYCJUKA.field991.method200();

		if (field508 != null) {
			field100.method202(133);
			field100.method207(1057001181);
		}

		if (field91 && signlink.cache_dat != null) {
			int var48 = field332.method359(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field332.method374(var49);
				if ((var50 & 0x79) == 0) {
					KUGNQTGL.method329(var49);
				}
			}
		}

		System.gc();
		ZUDKHAVN.method592(20);
		field332.method357();
		int var51 = (field406 - 6) / 8 - 1;
		int var52 = (field406 + 6) / 8 + 1;
		int var53 = (field407 - 6) / 8 - 1;
		int var54 = (field407 + 6) / 8 + 1;
		if (field275) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field332.method371(var56, 0, var55);
					if (var57 != -1) {
						field332.method368(var57, 3);
					}

					int var58 = field332.method371(var56, 1, var55);
					if (var58 != -1) {
						field332.method368(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method127() {
		if (field91 && field328 == 2 && YIGACPUG.field1433 != field349) {
			method139(null, "Loading - please wait.");
			field328 = 1;
			field295 = System.currentTimeMillis();
		}

		if (field328 == 1) {
			int var1 = method128();
			if (var1 != 0 && System.currentTimeMillis() - field295 > 360000L) {
				signlink.reporterror(field75 + " glcfb " + field214 + "," + var1 + "," + field91 + "," + field241[0] + "," + field332.method377() + "," + field349 + "," + field406 + "," + field407);
				field295 = System.currentTimeMillis();
			}
		}

		if (field328 == 2 && field349 != field189) {
			field189 = field349;
			method134(field349);
		}
	}

	@ObfuscatedName("client.k(B)I")
	public final int method128() {
		for (int var1 = 0; var1 < field44.length; var1++) {
			if (field44[var1] == null && field280[var1] != -1) {
				return -1;
			}

			if (field399[var1] == null && field281[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field44.length; var3++) {
			byte[] var4 = field399[var3];
			if (var4 != null) {
				int var5 = (field279[var3] >> 8) * 64 - field67;
				int var6 = (field279[var3] & 0xFF) * 64 - field68;
				if (field425) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= YIGACPUG.method567(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field314) {
			return -4;
		} else {
			field328 = 2;
			YIGACPUG.field1433 = field349;
			method126();
			field100.method202(21);
			return 0;
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method129() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.A(I)V")
	public final void method130() {
		field389.method294();
		ZUDKHAVN.field1492 = field265;
		field417.method304(0, 0);

		if (field437 != -1) {
			method71(0, 0, PCARWQQC.method394(field437), 0);
		} else if (field383[field272] != -1) {
			method71(0, 0, PCARWQQC.method394(field383[field272]), 0);
		}

		if (field211 && field163 == 1) {
			method114();
		}

		field389.method295(205, field505, 553);
		field391.method294();
		ZUDKHAVN.field1492 = field266;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method131() {
		field213 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field436[var1] = -1;
			for (int var2 = 0; var2 < XPVGEAJJ.field1384; var2++) {
				if (!XPVGEAJJ.field1385[var2].field1391 && XPVGEAJJ.field1385[var2].field1386 == var1 + (field64 ? 0 : 7)) {
					field436[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LFTMSICIZ;IB)V")
	public final void method132(FTMSICIZ arg0, int arg1) {
		for (int var3 = 0; var3 < field462; var3++) {
			int var4 = field463[var3];
			VMSVDNWD var5 = field403[var4];
			int var6 = arg0.method213();
			if ((var6 & 0x4) != 0) {
				int var7 = arg0.method213();
				int var8 = arg0.method213();
				var5.method431(var8, var7, field231);
				var5.field1128 = field231 + 300;
				var5.field1129 = arg0.method233();
				var5.field1130 = arg0.method233();
			}

			if ((var6 & 0x8) != 0) {
				int var9 = arg0.method213();
				int var10 = arg0.method213();
				var5.method431(var10, var9, field231);
				var5.field1128 = field231 + 300;
				var5.field1129 = arg0.method213();
				var5.field1130 = arg0.method234();
			}

			if ((var6 & 0x10) != 0) {
				var5.field1304 = RDFTXEYV.method439(arg0.method215());
				var5.field1095 = var5.field1304.field1186;
				var5.field1121 = var5.field1304.field1192;
				var5.field1096 = var5.field1304.field1175;
				var5.field1097 = var5.field1304.field1172;
				var5.field1098 = var5.field1304.field1177;
				var5.field1099 = var5.field1304.field1170;
				var5.field1113 = var5.field1304.field1194;
			}

			if ((var6 & 0x2) != 0) {
				var5.field1118 = arg0.method215();
				var5.field1119 = arg0.method242();
			}

			if ((var6 & 0x80) != 0) {
				int var11 = arg0.method215();
				if (var11 == 0xFFFF) {
					var11 = -1;
				}

				int var12 = arg0.method213();
				if (var5.field1105 == var11 && var11 != -1) {
					int var13 = PQTJDTHH.field951[var11].field965;
					if (var13 == 1) {
						var5.field1106 = 0;
						var5.field1107 = 0;
						var5.field1108 = var12;
						var5.field1109 = 0;
					}

					if (var13 == 2) {
						var5.field1109 = 0;
					}
				} else if (var11 == -1 || var5.field1105 == -1 || PQTJDTHH.field951[var11].field959 >= PQTJDTHH.field951[var5.field1105].field959) {
					var5.field1105 = var11;
					var5.field1106 = 0;
					var5.field1107 = 0;
					var5.field1108 = var12;
					var5.field1109 = 0;
					var5.field1094 = var5.field1131;
				}
			}

			if ((var6 & 0x40) != 0) {
				var5.field1110 = arg0.method243();
				if (var5.field1110 == 0xFFFF) {
					var5.field1110 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.field1101 = arg0.method220();
				var5.field1123 = 100;
			}

			if ((var6 & 0x20) != 0) {
				var5.field1077 = arg0.method243();
				int var14 = arg0.method250();
				var5.field1081 = var14 >> 16;
				var5.field1080 = (var14 & 0xFFFF) + field231;
				var5.field1078 = 0;
				var5.field1079 = 0;

				if (var5.field1080 > field231) {
					var5.field1078 = -1;
				}

				if (var5.field1077 == 0xFFFF) {
					var5.field1077 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public final String method133(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method134(int arg0) {
		int[] var2 = field382.field658;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field481[arg0][var7][var5] & 0x18) == 0) {
					field110.method522(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field481[arg0 + 1][var7][var5] & 0x8) != 0) {
					field110.method522(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field382.method313();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field481[arg0][var11][var10] & 0x18) == 0) {
					method47(var9, var8, var11, var10, arg0);
				}

				if (arg0 < 3 && (field481[arg0 + 1][var11][var10] & 0x8) != 0) {
					method47(var9, var8, var11, var10, arg0 + 1);
				}
			}
		}

		if (field391 != null) {
			field391.method294();
			ZUDKHAVN.field1492 = field266;
		}

		field97 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field110.method516(field349, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = PZYCJUKA.method409(var14).field975;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field282[field349].field1480;
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

						field313[field97] = field200[var15];
						field98[field97] = var16;
						field99[field97] = var17;
						field97++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method135() {
		field223 = false;
		while (field113) {
			field223 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field237 = null;
		field238 = null;
		field362 = null;
		field259 = null;
		field260 = null;
		field261 = null;
		field262 = null;
		field122 = null;
		field123 = null;
		field51 = null;
		field52 = null;
		field375 = null;
		field376 = null;
	}

	@ObfuscatedName("client.a(ILKUDWIDHU;II)V")
	public final void method136(int arg0, KUDWIDHU arg1, int arg2) {
		if (arg1 != null) {
			int var4 = field365 + field310 & 0x7FF;
			int var5 = arg0 * arg0 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = KUGNQTGL.field733[var4];
				int var7 = KUGNQTGL.field734[var4];
				var6 = var6 * 256 / (field157 + 256);
				var7 = var7 * 256 / (field157 + 256);
				int var8 = arg0 * var7 + arg2 * var6 >> 16;
				int var9 = arg2 * var7 - arg0 * var6 >> 16;
				if (var5 > 2500) {
					arg1.method324(field418, 83 - var9 - arg1.field664 / 2 - 4, var8 + 94 - arg1.field663 / 2 + 4);
				} else {
					arg1.method318(var8 + 94 + 4 - arg1.field663 / 2, 83 - var9 - arg1.field664 / 2 - 4);
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method137(int arg0) {
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

	@ObfuscatedName("client.h(Z)V")
	public final void method138() {
		try {
			if (field293 != null) {
				field293.method456();
			}
		} catch (Exception var2) {
		}

		field293 = null;
		field230 = false;
		field308 = 0;
		field75 = "";
		field76 = "";
		method186();
		field110.method487();

		for (int var1 = 0; var1 < 4; var1++) {
			field282[var1].method576();
		}

		System.gc();
		method129();
		field66 = -1;
		field319 = -1;
		field104 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method139(String arg0, String arg1) {
		if (field391 != null) {
			field391.method294();
			ZUDKHAVN.field1492 = field266;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field345.method13(257, var3, arg1, 0);
			field345.method13(256, var3 - 1, arg1, 0xFFFFFF);
			var3 += 15;
			if (arg0 != null) {
				field345.method13(257, var3, arg0, 0);
				field345.method13(256, var3 - 1, arg0, 0xFFFFFF);
			}

			field391.method295(4, field505, 4);
		} else if (field506 != null) {
			field506.method294();
			ZUDKHAVN.field1492 = field267;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			CBERHIHM.method33(383 - var5 / 2, 0, var4 - var6 / 2 - 5, var6, var5);
			CBERHIHM.method34(var5, var6, 0xFFFFFF, 383 - var5 / 2, var4 - 5 - var6 / 2);

			if (arg0 != null) {
				var4 -= 7;
			}

			field345.method13(383, var4, arg1, 0);
			field345.method13(382, var4 - 1, arg1, 0xFFFFFF);
			var4 += 15;
			if (arg0 != null) {
				field345.method13(383, var4, arg0, 0);
				field345.method13(382, var4 - 1, arg0, 0xFFFFFF);
			}

			field506.method295(0, field505, 0);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method140() {
		if (field133 == null) {
			field506 = null;
			field392 = null;
			field390 = null;
			field389 = null;
			field391 = null;
			field251 = null;
			field252 = null;
			field253 = null;
			field136 = new HZYGKZDT(method109(), 128, 265);
			CBERHIHM.method31();
			field137 = new HZYGKZDT(method109(), 128, 265);
			CBERHIHM.method31();
			field133 = new HZYGKZDT(method109(), 509, 171);
			CBERHIHM.method31();
			field134 = new HZYGKZDT(method109(), 360, 132);
			CBERHIHM.method31();
			field135 = new HZYGKZDT(method109(), 360, 200);
			CBERHIHM.method31();
			field138 = new HZYGKZDT(method109(), 202, 238);
			CBERHIHM.method31();
			field139 = new HZYGKZDT(method109(), 203, 238);
			CBERHIHM.method31();
			field140 = new HZYGKZDT(method109(), 74, 94);
			CBERHIHM.method31();
			field141 = new HZYGKZDT(method109(), 75, 94);
			CBERHIHM.method31();

			if (field143 != null) {
				method66();
				method144();
			}

			field220 = true;
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method141(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field240; var3++) {
				if (field120[var3] == arg0) {
					field240--;
					field333 = true;

					for (int var4 = var3; var4 < field240; var4++) {
						field120[var4] = field120[var4 + 1];
					}

					field100.method202(188);
					field100.method209(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method142() {
		for (CUNUEMWX var1 = (CUNUEMWX) field363.method422(); var1 != null; var1 = (CUNUEMWX) field363.method424()) {
			if (var1.field486 == -1) {
				var1.field487 = 0;
				method119(var1);
			} else {
				var1.method418();
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method143() {
		if (field225 != 0) {
			int var1 = 0;
			if (field456 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field258[var2] != null) {
					int var3 = field256[var2];
					String var4 = field257[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field393 == 0 || field393 == 1 && method115(var4))) {
						int var8 = 329 - var1 * 13;
						if (field513 > 4 && field514 - 4 > var8 - 10 && field514 - 4 <= var8 + 3) {
							int var9 = field345.method15("From:  " + var4 + field258[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field513 < var9 + 4) {
								if (field142 >= 1) {
									field95[field364] = "Report abuse @whi@" + var4;
									field146[field364] = 2243;
									field364++;
								}

								field95[field364] = "Add ignore @whi@" + var4;
								field146[field364] = 2950;
								field364++;
								field95[field364] = "Add friend @whi@" + var4;
								field146[field364] = 2143;
								field364++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field393 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method144() {
		field237 = new ITVAFKCK(field143, "titlebox", 0);
		field238 = new ITVAFKCK(field143, "titlebutton", 0);
		field362 = new ITVAFKCK[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field362[var1] = new ITVAFKCK(field143, "runes", var1);
		}

		field375 = new KUDWIDHU(128, 265);
		field376 = new KUDWIDHU(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field375.field658[var2] = field136.field583[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field376.field658[var3] = field137.field583[var3];
		}

		field260 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field260[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field260[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field260[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field260[var7 + 192] = 0xFFFFFF;
		}

		field261 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field261[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field261[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field261[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field261[var11 + 192] = 0xFFFFFF;
		}

		field262 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field262[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field262[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field262[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field262[var15 + 192] = 0xFFFFFF;
		}

		field259 = new int[256];
		field122 = new int[32768];
		field123 = new int[32768];
		method122(null);
		field51 = new int[32768];
		field52 = new int[32768];
		method172("Connecting to fileserver", 10);

		if (!field223) {
			field410 = true;
			field223 = true;
			method107(this, 2);
		}
	}

	@ObfuscatedName("client.F(I)I")
	public final int method145() {
		int var1 = 3;
		if (field235 < 310) {
			int var2 = field232 >> 7;
			int var3 = field234 >> 7;
			int var4 = field62.field1082 >> 7;
			int var5 = field62.field1083 >> 7;

			if ((field481[field349][var2][var3] & 0x4) != 0) {
				var1 = field349;
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

					if ((field481[field349][var2][var3] & 0x4) != 0) {
						var1 = field349;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field481[field349][var2][var3] & 0x4) != 0) {
							var1 = field349;
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

					if ((field481[field349][var2][var3] & 0x4) != 0) {
						var1 = field349;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field481[field349][var2][var3] & 0x4) != 0) {
							var1 = field349;
						}
					}
				}
			}
		}

		if ((field481[field349][field62.field1082 >> 7][field62.field1083 >> 7] & 0x4) != 0) {
			var1 = field349;
		}

		return var1;
	}

	@ObfuscatedName("client.G(I)I")
	public final int method146() {
		int var1 = method106(field232, field349, field234);
		if (var1 - field233 < 800 && (field481[field349][field232 >> 7][field234 >> 7] & 0x4) != 0) {
			return field349;
		}

		return 3;
	}

	@ObfuscatedName("client.a(BILYFPQHQAV;II)V")
	public final void method147(int arg0, YFPQHQAV arg1, int arg2, int arg3) {
		if (field62 != arg1 && field364 < 400) {
			String var5;
			if (arg1.field1412 == 0) {
				var5 = arg1.field1423 + method86(field62.field1422, arg1.field1422) + " (level-" + arg1.field1422 + ")";
			} else {
				var5 = arg1.field1423 + " (skill-" + arg1.field1412 + ")";
			}

			if (field83 == 1) {
				field95[field364] = "Use " + field87 + " with @whi@" + var5;
				field146[field364] = 223;
				field147[field364] = arg3;
				field144[field364] = arg2;
				field145[field364] = arg0;
				field364++;
			} else if (field149 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field268[var6] != null) {
						field95[field364] = field268[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field268[var6].equalsIgnoreCase("attack")) {
							if (arg1.field1422 > field62.field1422) {
								var7 = 2000;
							}

							if (field62.field1408 != 0 && arg1.field1408 != 0) {
								if (field62.field1408 == arg1.field1408) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field269[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field146[field364] = var7 + 416;
						}

						if (var6 == 1) {
							field146[field364] = var7 + 365;
						}

						if (var6 == 2) {
							field146[field364] = var7 + 891;
						}

						if (var6 == 3) {
							field146[field364] = var7 + 94;
						}

						if (var6 == 4) {
							field146[field364] = var7 + 545;
						}

						field147[field364] = arg3;
						field144[field364] = arg2;
						field145[field364] = arg0;
						field364++;
					}
				}
			} else if ((field151 & 0x8) == 8) {
				field95[field364] = field152 + " @whi@" + var5;
				field146[field364] = 555;
				field147[field364] = arg3;
				field144[field364] = arg2;
				field145[field364] = arg0;
				field364++;
			}

			for (int var8 = 0; var8 < field364; var8++) {
				if (field146[var8] == 763) {
					field95[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method148() {
		field392.method294();
		ZUDKHAVN.field1492 = field264;
		field419.method304(0, 0);

		if (field289) {
			field346.method13(239, 40, field271, 0);
			field346.method13(239, 60, field254 + "*", 128);
		} else if (field81 == 1) {
			field346.method13(239, 40, "Enter amount:", 0);
			field346.method13(239, 60, field244 + "*", 128);
		} else if (field81 == 2) {
			field346.method13(239, 40, "Enter name:", 0);
			field346.method13(239, 60, field244 + "*", 128);
		} else if (field81 == 3) {
			if (field284 != field244) {
				method44(field244);
				field284 = field244;
			}

			CAMKASVY var1 = field345;
			CBERHIHM.method30(77, 0, 0, 463);

			for (int var2 = 0; var2 < field285; var2++) {
				int var3 = var2 * 14 + 18 - field288;
				if (var3 > 0 && var3 < 110) {
					var1.method13(239, var3, field286[var2], 0);
				}
			}

			CBERHIHM.method29();

			if (field285 > 5) {
				method97(field288, 463, 77, 0, field285 * 14 + 7);
			}

			if (field244.length() == 0) {
				field346.method13(239, 40, "Enter object name", 255);
			} else if (field285 == 0) {
				field346.method13(239, 40, "No matching objects found, please shorten search", 0);
			}

			var1.method13(239, 90, field244 + "*", 0);
			CBERHIHM.method36(77, 0, 0, 479);
		} else if (field350 != null) {
			field346.method13(239, 40, field350, 0);
			field346.method13(239, 60, "Click to continue", 128);
		} else if (field153 != -1) {
			method71(0, 0, PCARWQQC.method394(field153), 0);
		} else if (field159 == -1) {
			CAMKASVY var4 = field345;
			int var5 = 0;
			CBERHIHM.method30(77, 0, 0, 463);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field258[var6] != null) {
					int var7 = field256[var6];
					int var8 = field174 + 70 - var5 * 14;
					String var9 = field257[var6];
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
							var4.method17(field258[var6], 4, var8, 0);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field277 == 0 || field277 == 1 && method115(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field411[0].method304(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field411[1].method304(var11, var8 - 12);
								var11 += 14;
							}

							var4.method17(var9 + ":", var11, var8, 0);
							var11 += var4.method15(var9) + 8;
							var4.method17(field258[var6], var11, var8, 255);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field225 == 0 && (var7 == 7 || field393 == 0 || field393 == 1 && method115(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method17("From", var12, var8, 0);
							int var14 = var12 + var4.method15("From ");
							if (var10 == 1) {
								field411[0].method304(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field411[1].method304(var14, var8 - 12);
								var14 += 14;
							}

							var4.method17(var9 + ":", var14, var8, 0);
							var14 += var4.method15(var9) + 8;
							var4.method17(field258[var6], var14, var8, 0x800000);
						}

						var5++;
					}

					if (var7 == 4 && (field412 == 0 || field412 == 1 && method115(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method17(var9 + " " + field258[var6], 4, var8, 0x800080);
						}

						var5++;
					}

					if (var7 == 5 && field225 == 0 && field393 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method17(field258[var6], 4, var8, 0x800000);
						}

						var5++;
					}

					if (var7 == 6 && field225 == 0 && field393 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method17("To " + var9 + ":", 4, var8, 0);
							var4.method17(field258[var6], var4.method15("To " + var9) + 12, var8, 0x800000);
						}

						var5++;
					}

					if (var7 == 8 && (field412 == 0 || field412 == 1 && method115(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method17(var9 + " " + field258[var6], 4, var8, 0x7E3200);
						}

						var5++;
					}
				}
			}

			CBERHIHM.method29();
			field359 = var5 * 14 + 7;
			if (field359 < 78) {
				field359 = 78;
			}

			method97(field359 - field174 - 77, 463, 77, 0, field359);
			String var13;
			if (field62 == null || field62.field1423 == null) {
				var13 = RPCTGZHI.method449(field75);
			} else {
				var13 = field62.field1423;
			}

			var4.method17(var13 + ":", 4, 90, 0);
			var4.method17(field47 + "*", var4.method15(var13 + ": ") + 6, 90, 255);
			CBERHIHM.method36(77, 0, 0, 479);
		} else {
			method71(0, 0, PCARWQQC.method394(field159), 0);
		}

		if (field211 && field163 == 2) {
			method114();
		}

		field392.method295(357, field505, 17);
		field391.method294();
		ZUDKHAVN.field1492 = field266;
	}

	@ObfuscatedName("client.H(I)V")
	public final void method149() {
		Graphics var1 = method109().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method192(1);

		if (field270) {
			field223 = false;
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

		if (field107) {
			field223 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field290) {
			field223 = false;
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

	@ObfuscatedName("client.a(LQQSLPTGQ;BI)V")
	public final void method150(QQSLPTGQ arg0, int arg1) {
		method151(arg1, arg0.field1083, arg0.field1082);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method151(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method106(arg2, field349, arg1) - arg0;
			arg2 -= field232;
			var4 -= field233;
			arg1 -= field234;
			int var5 = KUGNQTGL.field733[field235];
			int var6 = KUGNQTGL.field734[field235];
			int var7 = KUGNQTGL.field733[field236];
			int var8 = KUGNQTGL.field734[field236];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field433 = (var9 << 9) / arg1 + ZUDKHAVN.field1486;
				field434 = (var11 << 9) / arg1 + ZUDKHAVN.field1487;
			} else {
				field433 = -1;
				field434 = -1;
			}
		} else {
			field433 = -1;
			field434 = -1;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method152() {
		field201 = 0;
		for (int var1 = -1; var1 < field460 + field404; var1++) {
			QQSLPTGQ var2;
			if (var1 == -1) {
				var2 = field62;
			} else if (var1 < field460) {
				var2 = field459[field461[var1]];
			} else {
				var2 = field403[field405[var1 - field460]];
			}

			if (var2 != null && var2.method433()) {
				if (var2 instanceof VMSVDNWD) {
					RDFTXEYV var3 = ((VMSVDNWD) var2).field1304;
					if (var3.field1191 != null) {
						var3 = var3.method436();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field460) {
					RDFTXEYV var6 = ((VMSVDNWD) var2).field1304;
					if (var6.field1176 >= 0 && var6.field1176 < field428.length) {
						method150(var2, var2.field1122 + 15);

						if (field433 > -1) {
							field428[var6.field1176].method318(field433 - 12, field434 - 30);
						}
					}

					if (field480 == 1 && field405[var1 - field460] == field301 && field231 % 20 < 10) {
						method150(var2, var2.field1122 + 15);

						if (field433 > -1) {
							field397[0].method318(field433 - 12, field434 - 28);
						}
					}
				} else {
					int var4 = 30;
					YFPQHQAV var5 = (YFPQHQAV) var2;
					if (var5.field1409 != -1 || var5.field1403 != -1) {
						method150(var2, var2.field1122 + 15);

						if (field433 > -1) {
							if (var5.field1409 != -1) {
								field396[var5.field1409].method318(field433 - 12, field434 - var4);
								var4 += 25;
							}

							if (var5.field1403 != -1) {
								field428[var5.field1403].method318(field433 - 12, field434 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field480 == 10 && field461[var1] == field429) {
						method150(var2, var2.field1122 + 15);

						if (field433 > -1) {
							field397[1].method318(field433 - 12, field434 - var4);
						}
					}
				}

				if (var2.field1101 != null && (var1 >= field460 || field277 == 0 || field277 == 3 || field277 == 1 && method115(((YFPQHQAV) var2).field1423))) {
					method150(var2, var2.field1122);

					if (field433 > -1 && field201 < field202) {
						field206[field201] = field346.method16(var2.field1101) / 2;
						field205[field201] = field346.field21;
						field203[field201] = field433;
						field204[field201] = field434;
						field207[field201] = var2.field1111;
						field208[field201] = var2.field1120;
						field209[field201] = var2.field1123;
						field210[field201++] = var2.field1101;

						if (field115 == 0 && var2.field1120 >= 1 && var2.field1120 <= 3) {
							field205[field201] += 10;
							field204[field201] += 5;
						}

						if (field115 == 0 && var2.field1120 == 4) {
							field206[field201] = 60;
						}

						if (field115 == 0 && var2.field1120 == 5) {
							field205[field201] += 5;
						}
					}
				}

				if (var2.field1128 > field231) {
					method150(var2, var2.field1122 + 15);

					if (field433 > -1) {
						int var7 = var2.field1129 * 30 / var2.field1130;
						if (var7 > 30) {
							var7 = 30;
						}

						CBERHIHM.method33(field433 - 15, 0xFF00, field434 - 3, 5, var7);
						CBERHIHM.method33(field433 + var7 - 15, 0xFF0000, field434 - 3, 5, 30 - var7);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1126[var8] > field231) {
						method150(var2, var2.field1122 / 2);

						if (field433 > -1) {
							if (var8 == 1) {
								field434 -= 20;
							}

							if (var8 == 2) {
								field433 -= 15;
								field434 -= 10;
							}

							if (var8 == 3) {
								field433 += 15;
								field434 -= 10;
							}

							field222[var2.field1125[var8]].method318(field433 - 12, field434 - 12);
							field344.method13(field433, field434 + 4, String.valueOf(var2.field1124[var8]), 0);
							field344.method13(field433 - 1, field434 + 3, String.valueOf(var2.field1124[var8]), 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field201; var9++) {
			int var10 = field203[var9];
			int var11 = field204[var9];
			int var12 = field206[var9];
			int var13 = field205[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field204[var15] - field205[var15] && var11 - var13 < field204[var15] + 2 && var10 - var12 < field206[var15] + field203[var15] && var10 + var12 > field203[var15] - field206[var15] && field204[var15] - field205[var15] < var11) {
						var11 = field204[var15] - field205[var15];
						var14 = true;
					}
				}
			}

			field433 = field203[var9];
			field434 = field204[var9] = var11;
			String var16 = field210[var9];
			if (field115 == 0) {
				int var17 = 0xFFFF00;
				if (field207[var9] < 6) {
					var17 = field360[field207[var9]];
				}

				if (field207[var9] == 6) {
					var17 = field446 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field207[var9] == 7) {
					var17 = field446 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field207[var9] == 8) {
					var17 = field446 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field207[var9] == 9) {
					int var18 = 150 - field209[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field207[var9] == 10) {
					int var19 = 150 - field209[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field207[var9] == 11) {
					int var20 = 150 - field209[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field208[var9] == 0) {
					field346.method13(field433, field434 + 1, var16, 0);
					field346.method13(field433, field434, var16, var17);
				}

				if (field208[var9] == 1) {
					field346.method18(var16, field433, field434 + 1, 0, field446);
					field346.method18(var16, field433, field434, var17, field446);
				}

				if (field208[var9] == 2) {
					field346.method19(field434 + 1, field446, var16, field433, 0);
					field346.method19(field434, field446, var16, field433, var17);
				}

				if (field208[var9] == 3) {
					field346.method20(150 - field209[var9], field434 + 1, 0, var16, field433, field446);
					field346.method20(150 - field209[var9], field434, var17, var16, field433, field446);
				}

				if (field208[var9] == 4) {
					int var21 = field346.method16(var16);
					int var22 = (150 - field209[var9]) * (var21 + 100) / 150;
					CBERHIHM.method30(334, 0, field433 - 50, field433 + 50);
					field346.method17(var16, field433 + 50 - var22, field434 + 1, 0);
					field346.method17(var16, field433 + 50 - var22, field434, var17);
					CBERHIHM.method29();
				}

				if (field208[var9] == 5) {
					int var23 = 150 - field209[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					CBERHIHM.method30(field434 + 5, field434 - field346.field21 - 1, 0, 512);
					field346.method13(field433, field434 + var24 + 1, var16, 0);
					field346.method13(field433, field434 + var24, var16, var17);
					CBERHIHM.method29();
				}
			} else {
				field346.method13(field433, field434 + 1, var16, 0);
				field346.method13(field433, field434, var16, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method153() {
		if (field328 == 2) {
			for (CUNUEMWX var1 = (CUNUEMWX) field363.method422(); var1 != null; var1 = (CUNUEMWX) field363.method424()) {
				if (var1.field486 > 0) {
					var1.field486--;
				}

				if (var1.field486 != 0) {
					if (var1.field487 > 0) {
						var1.field487--;
					}

					if (var1.field487 == 0 && var1.field493 >= 1 && var1.field494 >= 1 && var1.field493 <= 102 && var1.field494 <= 102 && (var1.field488 < 0 || YIGACPUG.method562(var1.field490, var1.field488))) {
						method154(var1.field493, var1.field490, var1.field489, var1.field488, var1.field491, var1.field494, var1.field492);
						var1.field487 = -1;

						if (var1.field488 == var1.field483 && var1.field483 == -1) {
							var1.method418();
						} else if (var1.field488 == var1.field483 && var1.field489 == var1.field484 && var1.field490 == var1.field485) {
							var1.method418();
						}
					}
				} else if (var1.field483 < 0 || YIGACPUG.method562(var1.field485, var1.field483)) {
					method154(var1.field493, var1.field485, var1.field484, var1.field483, var1.field491, var1.field494, var1.field492);
					var1.method418();
				}
			}

			field401++;
			if (field401 > 1775) {
				field401 = 0;
				field100.method202(161);
				field100.method203(0);
				int var2 = field100.field535;
				field100.method204(13807);
				field100.method204(63614);

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method203(173);
				}

				field100.method203((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method203(76);
				}

				field100.method204(61477);

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method204(27808);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method204(55754);
				}

				field100.method203(211);
				field100.method203(248);
				field100.method212(field100.field535 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIII)V")
	public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg5 >= 1 && arg0 <= 102 && arg5 <= 102) {
			if (field91 && field349 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field110.method513(arg4, arg0, arg5);
			}

			if (arg6 == 1) {
				var8 = field110.method514(arg4, arg0, arg5);
			}

			if (arg6 == 2) {
				var8 = field110.method515(arg4, arg0, arg5);
			}

			if (arg6 == 3) {
				var8 = field110.method516(arg4, arg0, arg5);
			}

			if (var8 != 0) {
				int var12 = field110.method517(arg4, arg0, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field110.method504(arg5, arg4, arg0);
					PZYCJUKA var16 = PZYCJUKA.method409(var13);
					if (var16.field976) {
						field282[arg4].method581(arg5, var15, var16.field1011, arg0, var14);
					}
				}

				if (arg6 == 1) {
					field110.method505(arg5, arg0, arg4);
				}

				if (arg6 == 2) {
					field110.method506(arg5, arg0, arg4);
					PZYCJUKA var17 = PZYCJUKA.method409(var13);
					if (var17.field982 + arg0 > 103 || var17.field982 + arg5 > 103 || var17.field977 + arg0 > 103 || var17.field977 + arg5 > 103) {
						return;
					}

					if (var17.field976) {
						field282[arg4].method582(arg0, var17.field1011, var17.field977, arg5, var17.field982, var15);
					}
				}

				if (arg6 == 3) {
					field110.method507(arg0, arg4, arg5);
					PZYCJUKA var18 = PZYCJUKA.method409(var13);
					if (var18.field976 && var18.field980) {
						field282[arg4].method584(arg5, arg0);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field481[1][arg0][arg5] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				YIGACPUG.method571(arg0, field110, arg2, arg1, field282[arg4], arg5, var19, field438, arg4, arg3);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILFTMSICIZ;I)V")
	public final void method155(FTMSICIZ arg0, int arg1) {
		field73 = 0;
		field462 = 0;
		method176(arg0, arg1);
		method51(arg0, arg1);
		method175(arg1, arg0);
		method171(arg0, arg1);

		for (int var3 = 0; var3 < field73; var3++) {
			int var4 = field74[var3];
			if (field231 != field459[var4].field1100) {
				field459[var4] = null;
			}
		}

		if (arg0.field535 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field535 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field460; var5++) {
			if (field459[field461[var5]] == null) {
				signlink.reporterror(field75 + " null entry in pl list - pos:" + var5 + " size:" + field460);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		CUNUEMWX var10 = null;
		for (CUNUEMWX var11 = (CUNUEMWX) field363.method422(); var11 != null; var11 = (CUNUEMWX) field363.method424()) {
			if (var11.field491 == arg4 && var11.field493 == arg7 && var11.field494 == arg6 && var11.field492 == arg5) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new CUNUEMWX();
			var10.field491 = arg4;
			var10.field492 = arg5;
			var10.field493 = arg7;
			var10.field494 = arg6;
			method119(var10);
			field363.method419(var10);
		}

		var10.field488 = arg0;
		var10.field490 = arg8;
		var10.field489 = arg3;
		var10.field487 = arg2;
		var10.field486 = arg1;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = KUGNQTGL.field733[var7];
			int var13 = KUGNQTGL.field734[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = KUGNQTGL.field733[var8];
			int var16 = KUGNQTGL.field734[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field232 = arg2 - var9;
		field233 = arg1 - var10;
		field234 = arg0 - var11;
		field235 = arg5;
		field236 = arg4;
	}

	@ObfuscatedName("client.K(I)Z")
	public final boolean method158() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.b(BLPCARWQQC;)V")
	public final void method159(PCARWQQC arg0) {
		int var2 = arg0.field903;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field196 == 0) {
				arg0.field942 = "Loading friend list";
				arg0.field906 = 0;
			} else if (var2 == 1 && field196 == 1) {
				arg0.field942 = "Connecting to friendserver";
				arg0.field906 = 0;
			} else if (var2 == 2 && field196 != 2) {
				arg0.field942 = "Please wait...";
				arg0.field906 = 0;
			} else {
				int var3 = field195;
				if (field196 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field942 = "";
					arg0.field906 = 0;
				} else {
					arg0.field942 = field400[var2];
					arg0.field906 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field195;
			if (field196 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field942 = "";
				arg0.field906 = 0;
			} else {
				if (field197[var2] == 0) {
					arg0.field942 = "@red@Offline";
				} else if (field197[var2] < 200) {
					if (field197[var2] == field88) {
						arg0.field942 = "@gre@World" + (field197[var2] - 9);
					} else {
						arg0.field942 = "@yel@World" + (field197[var2] - 9);
					}
				} else if (field197[var2] == field88) {
					arg0.field942 = "@gre@Classic" + (field197[var2] - 219);
				} else {
					arg0.field942 = "@yel@Classic" + (field197[var2] - 219);
				}

				arg0.field906 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field195;
			if (field196 != 2) {
				var5 = 0;
			}

			arg0.field925 = var5 * 15 + 20;
			if (arg0.field925 <= arg0.field933) {
				arg0.field925 = arg0.field933 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field196 == 0) {
				arg0.field942 = "Loading ignore list";
				arg0.field906 = 0;
			} else if (var2 == 1 && field196 == 0) {
				arg0.field942 = "Please wait...";
				arg0.field906 = 0;
			} else {
				int var6 = field240;
				if (field196 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field942 = "";
					arg0.field906 = 0;
				} else {
					arg0.field942 = RPCTGZHI.method449(RPCTGZHI.method446(field120[var2]));
					arg0.field906 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field925 = field240 * 15 + 20;
			if (arg0.field925 <= arg0.field933) {
				arg0.field925 = arg0.field933 + 1;
			}
		} else if (var2 == 327) {
			arg0.field923 = 150;
			arg0.field924 = (int) (Math.sin(field231 / 40.0D) * 256.0D) & 0x7FF;

			if (field213) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field436[var7];
					if (var8 >= 0 && !XPVGEAJJ.field1385[var8].method540()) {
						return;
					}
				}

				field213 = false;
				KUGNQTGL[] var9 = new KUGNQTGL[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field436[var11];
					if (var12 >= 0) {
						var9[var10++] = XPVGEAJJ.field1385[var12].method541();
					}
				}

				KUGNQTGL var13 = new KUGNQTGL(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field162[var14] != 0) {
						var13.method344(field408[var14][0], field408[var14][field162[var14]]);

						if (var14 == 1) {
							var13.method344(field172[0], field172[field162[var14]]);
						}
					}
				}

				var13.method337();
				var13.method338(PQTJDTHH.field951[field62.field1113].field953[0]);
				var13.method347(64, 850, -30, -50, -30, true);
				arg0.field914 = 5;
				arg0.field915 = 0;
				PCARWQQC.method399(5, 0, var13);
			}
		} else if (var2 == 324) {
			if (field304 == null) {
				field304 = arg0.field908;
				field305 = arg0.field934;
			}

			if (field64) {
				arg0.field908 = field305;
			} else {
				arg0.field908 = field304;
			}
		} else if (var2 == 325) {
			if (field304 == null) {
				field304 = arg0.field908;
				field305 = arg0.field934;
			}

			if (field64) {
				arg0.field908 = field304;
			} else {
				arg0.field908 = field305;
			}
		} else if (var2 == 600) {
			arg0.field942 = field198;
			if (field231 % 20 < 10) {
				arg0.field942 = arg0.field942 + "|";
			} else {
				arg0.field942 = arg0.field942 + " ";
			}
		} else if (var2 == 620) {
			if (field142 < 1) {
				arg0.field942 = "";
			} else if (field416) {
				arg0.field887 = 0xFF0000;
				arg0.field942 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field887 = 0xFFFFFF;
				arg0.field942 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field212 - field226;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field942 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field105 == 0) {
				arg0.field942 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field105 <= field212) {
				arg0.field942 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method160(field105);
			} else {
				int var17 = field212 + 14 - field105;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field942 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method160(field105) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field181 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field181 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field181 + " unread messages";
			}

			arg0.field942 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field367 > 0 && field367 <= field212 + 10) {
				arg0.field942 = "Last password change:\\n@gre@" + method160(field367);
			} else {
				arg0.field942 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field45 > 2 && !field90) {
				arg0.field942 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field45 > 2) {
				arg0.field942 = "\\n\\nYou have @gre@" + field45 + "@yel@ days of\\nmember credit remaining.";
			} else if (field45 > 0) {
				arg0.field942 = "You have @gre@" + field45 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field942 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field45 > 2 && !field90) {
				arg0.field942 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field45 > 0) {
				arg0.field942 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field942 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field105 > field212) {
				arg0.field942 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field942 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public final String method160(int arg0) {
		if (arg0 > field212 + 10) {
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

	@ObfuscatedName("client.a(ILPCARWQQC;IBIIII)V")
	public final void method161(int arg0, PCARWQQC arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1.field920 == 0 && arg1.field891 != null && !arg1.field877 && (arg3 >= arg0 && arg4 >= arg6 && arg3 <= arg1.field943 + arg0 && arg4 <= arg1.field933 + arg6)) {
			int var8 = arg1.field891.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg1.field909[var9] + arg0;
				int var11 = arg1.field911[var9] + arg6 - arg5;
				PCARWQQC var12 = PCARWQQC.method394(arg1.field891[var9]);
				var10 += var12.field894;
				var11 += var12.field941;
				if ((var12.field890 >= 0 || var12.field913 != 0) && arg3 >= var10 && arg4 >= var11 && arg3 < var12.field943 + var10 && arg4 < var12.field933 + var11) {
					if (var12.field890 >= 0) {
						field422 = var12.field890;
					} else {
						field422 = var12.field895;
					}
				}

				if (var12.field920 == 8 && arg3 >= var10 && arg4 >= var11 && arg3 < var12.field943 + var10 && arg4 < var12.field933 + var11) {
					field414 = var12.field895;
				}

				if (var12.field920 == 0) {
					method161(var10, var12, arg2, arg3, arg4, var12.field905, var11);

					if (var12.field925 > var12.field933) {
						method45(arg2, var12.field943 + var10, var12, var11, var12.field933, var12.field925, arg3, arg4);
					}
				} else {
					if (var12.field906 == 1 && arg3 >= var10 && arg4 >= var11 && arg3 < var12.field943 + var10 && arg4 < var12.field933 + var11) {
						boolean var13 = false;
						if (var12.field903 != 0) {
							var13 = method101(var12);
						}

						if (!var13) {
							field95[field364] = var12.field919;
							field146[field364] = 741;
							field145[field364] = var12.field895;
							field364++;
						}
					}

					if (var12.field906 == 2 && field149 == 0 && arg3 >= var10 && arg4 >= var11 && arg3 < var12.field943 + var10 && arg4 < var12.field933 + var11) {
						String var14 = var12.field893;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field95[field364] = var14 + " @gre@" + var12.field932;
						field146[field364] = 508;
						field145[field364] = var12.field895;
						field364++;
					}

					if (var12.field906 == 3 && arg3 >= var10 && arg4 >= var11 && arg3 < var12.field943 + var10 && arg4 < var12.field933 + var11) {
						field95[field364] = "Close";

						if (arg2 == 3) {
							field146[field364] = 269;
						} else {
							field146[field364] = 531;
						}

						field145[field364] = var12.field895;
						field364++;
					}

					if (var12.field906 == 4 && arg3 >= var10 && arg4 >= var11 && arg3 < var12.field943 + var10 && arg4 < var12.field933 + var11) {
						field95[field364] = var12.field919;
						field146[field364] = 923;
						field145[field364] = var12.field895;
						field364++;
					}

					if (var12.field906 == 5 && arg3 >= var10 && arg4 >= var11 && arg3 < var12.field943 + var10 && arg4 < var12.field933 + var11) {
						field95[field364] = var12.field919;
						field146[field364] = 417;
						field145[field364] = var12.field895;
						field364++;
					}

					if (var12.field906 == 6 && !field190 && arg3 >= var10 && arg4 >= var11 && arg3 < var12.field943 + var10 && arg4 < var12.field933 + var11) {
						field95[field364] = var12.field919;
						field146[field364] = 1;
						field145[field364] = var12.field895;
						field364++;
					}

					if (var12.field920 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field933; var16++) {
							for (int var17 = 0; var17 < var12.field943; var17++) {
								int var18 = (var12.field949 + 32) * var17 + var10;
								int var19 = (var12.field928 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field944[var15];
									var19 += var12.field945[var15];
								}

								if (arg3 >= var18 && arg4 >= var19 && arg3 < var18 + 32 && arg4 < var19 + 32) {
									field352 = var15;
									field353 = var12.field895;

									if (var12.field885[var15] > 0) {
										NCBEIRPV var20 = NCBEIRPV.method390(var12.field885[var15] - 1);
										if (field83 == 1 && var12.field899) {
											if (field85 != var12.field895 || field84 != var15) {
												field95[field364] = "Use " + field87 + " with @lre@" + var20.field833;
												field146[field364] = 51;
												field147[field364] = var20.field841;
												field144[field364] = var15;
												field145[field364] = var12.field895;
												field364++;
											}
										} else if (field149 != 1 || !var12.field899) {
											if (var12.field899) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field834 != null && var20.field834[var21] != null) {
														field95[field364] = var20.field834[var21] + " @lre@" + var20.field833;

														if (var21 == 3) {
															field146[field364] = 4;
														}

														if (var21 == 4) {
															field146[field364] = 856;
														}

														field147[field364] = var20.field841;
														field144[field364] = var15;
														field145[field364] = var12.field895;
														field364++;
													} else if (var21 == 4) {
														field95[field364] = "Drop @lre@" + var20.field833;
														field146[field364] = 856;
														field147[field364] = var20.field841;
														field144[field364] = var15;
														field145[field364] = var12.field895;
														field364++;
													}
												}
											}

											if (var12.field917) {
												field95[field364] = "Use @lre@" + var20.field833;
												field146[field364] = 529;
												field147[field364] = var20.field841;
												field144[field364] = var15;
												field145[field364] = var12.field895;
												field364++;
											}

											if (var12.field899 && var20.field834 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field834[var22] != null) {
														field95[field364] = var20.field834[var22] + " @lre@" + var20.field833;

														if (var22 == 0) {
															field146[field364] = 682;
														}

														if (var22 == 1) {
															field146[field364] = 486;
														}

														if (var22 == 2) {
															field146[field364] = 593;
														}

														field147[field364] = var20.field841;
														field144[field364] = var15;
														field145[field364] = var12.field895;
														field364++;
													}
												}
											}

											if (var12.field929 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field929[var23] != null) {
														field95[field364] = var12.field929[var23] + " @lre@" + var20.field833;

														if (var23 == 0) {
															field146[field364] = 113;
														}

														if (var23 == 1) {
															field146[field364] = 490;
														}

														if (var23 == 2) {
															field146[field364] = 489;
														}

														if (var23 == 3) {
															field146[field364] = 315;
														}

														if (var23 == 4) {
															field146[field364] = 422;
														}

														field147[field364] = var20.field841;
														field144[field364] = var15;
														field145[field364] = var12.field895;
														field364++;
													}
												}
											}

											field95[field364] = "Examine @lre@" + var20.field833;
											field146[field364] = 1314;
											field147[field364] = var20.field841;
											field144[field364] = var15;
											field145[field364] = var12.field895;
											field364++;
										} else if ((field151 & 0x10) == 0x10) {
											field95[field364] = field152 + " @lre@" + var20.field833;
											field146[field364] = 906;
											field147[field364] = var20.field841;
											field144[field364] = var15;
											field145[field364] = var12.field895;
											field364++;
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

	@ObfuscatedName("client.a(ZII)V")
	public final void method162(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method163() {
		method124();

		if (field337 == 1) {
			field255[field336 / 100].method318(field334 - 8 - 4, field335 - 8 - 4);
		}

		if (field337 == 2) {
			field255[field336 / 100 + 4].method318(field334 - 8 - 4, field335 - 8 - 4);
			field156++;
			if (field156 > 1088) {
				field156 = 0;
				field100.method202(158);
				field100.method203(0);
				int var1 = field100.field535;
				field100.method203(191);
				field100.method204((int) (Math.random() * 65536.0D));
				field100.method203(252);
				field100.method204((int) (Math.random() * 65536.0D));
				field100.method204(57323);

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method204(6617);
				}

				field100.method204((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method203(218);
				}

				field100.method204(45149);
				field100.method203((int) (Math.random() * 256.0D));
				field100.method212(field100.field535 - var1);
			}
		}

		if (field427 != -1) {
			method62(field427, field296);
			method71(0, 0, PCARWQQC.method394(field427), 0);
		}

		if (field109 != -1) {
			method62(field109, field296);
			method71(0, 0, PCARWQQC.method394(field109), 0);
		}

		method58();

		if (!field211) {
			method88();
			method110();
		} else if (field163 == 0) {
			method114();
		}

		if (field96 == 1) {
			field454.method318(472, 296);
		}

		if (field192) {
			short var2 = 507;
			int var3 = 20;
			int var4 = 0xFFFF00;
			if (field501 < 30 && field91) {
				var4 = 0xFF0000;
			}

			if (field501 < 20 && !field91) {
				var4 = 0xFF0000;
			}

			field345.method12(var2, var3, "Fps:" + field501, var4);
			var3 += 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 0xFFFF00;

			if (var6 > 0x2000000 && field91) {
				int var8 = 0xFF0000;
			}

			if (var6 > 0x4000000 && !field91) {
				int var9 = 0xFF0000;
			}

			field345.method12(var2, var3, "Mem:" + var6 + "k", 0xFFFF00);
			var3 += 15;
		}

		if (field456 != 0) {
			int var10 = field456 / 50;
			int var11 = var10 / 60;
			var10 %= 60;
			if (var10 < 10) {
				field345.method17("System update in: " + var11 + ":0" + var10, 4, 329, 0xFFFF00);
			} else {
				field345.method17("System update in: " + var11 + ":" + var10, 4, 329, 0xFFFF00);
			}

			field216++;
			if (field216 > 1677) {
				field216 = 0;
				field100.method202(211);
				field100.method203(0);
				int var12 = field100.field535;
				field100.method203(151);
				field100.method204(56197);
				field100.method204((int) (Math.random() * 65536.0D));
				field100.method203(200);
				field100.method203(125);
				field100.method204((int) (Math.random() * 65536.0D));
				field100.method203(53);
				field100.method204(49325);

				if ((int) (Math.random() * 2.0D) == 0) {
					field100.method204(62961);
				}

				field100.method204(38474);
				field100.method212(field100.field535 - var12);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIZIBII)Z")
	public final boolean method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field229[var14][var15] = 0;
				field326[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg5;
		field229[arg6][arg5] = 99;
		field326[arg6][arg5] = 0;
		byte var18 = 0;
		int var19 = 0;
		field217[var18] = arg6;
		int var39 = var18 + 1;
		field218[var18] = arg5;
		boolean var20 = false;
		int var21 = field217.length;
		int[][] var22 = field282[field349].field1480;
		while (var39 != var19) {
			var16 = field217[var19];
			var17 = field218[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field282[field349].method585(arg0, arg3, arg10 - 1, var17, arg8, var16)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field282[field349].method586(arg3, arg0, var17, arg10 - 1, var16, arg8)) {
					var20 = true;
					break;
				}
			}

			if (arg4 != 0 && arg9 != 0 && field282[field349].method587(var17, var16, arg9, arg0, arg8, arg4, arg2)) {
				var20 = true;
				break;
			}

			int var23 = field326[var16][var17] + 1;
			if (var16 > 0 && field229[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field217[var39] = var16 - 1;
				field218[var39] = var17;
				var39 = (var39 + 1) % var21;
				field229[var16 - 1][var17] = 2;
				field326[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field229[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field217[var39] = var16 + 1;
				field218[var39] = var17;
				var39 = (var39 + 1) % var21;
				field229[var16 + 1][var17] = 8;
				field326[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field229[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field217[var39] = var16;
				field218[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field229[var16][var17 - 1] = 1;
				field326[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field229[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field217[var39] = var16;
				field218[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field229[var16][var17 + 1] = 4;
				field326[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field229[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field217[var39] = var16 - 1;
				field218[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field229[var16 - 1][var17 - 1] = 3;
				field326[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field229[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field217[var39] = var16 + 1;
				field218[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field229[var16 + 1][var17 - 1] = 9;
				field326[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field229[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field217[var39] = var16 - 1;
				field218[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field229[var16 - 1][var17 + 1] = 6;
				field326[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field229[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field217[var39] = var16 + 1;
				field218[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field229[var16 + 1][var17 + 1] = 12;
				field326[var16 + 1][var17 + 1] = var23;
			}
		}

		field78 = 0;
		if (!var20) {
			if (!arg7) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg8 - var26; var27 <= arg8 + var26; var27++) {
				for (int var28 = arg0 - var26; var28 <= arg0 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field326[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg8) {
							var29 = arg8 - var27;
						} else if (var27 > arg4 + arg8 - 1) {
							var29 = var27 + 1 - arg4 - arg8;
						}

						int var30 = 0;
						if (var28 < arg0) {
							var30 = arg0 - var28;
						} else if (var28 > arg0 + arg9 - 1) {
							var30 = var28 + 1 - arg0 - arg9;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field326[var27][var28] < var25) {
							var24 = var31;
							var25 = field326[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg6 == var16 && arg5 == var17) {
				return false;
			}

			field78 = 1;
		}

		byte var32 = 0;
		field217[var32] = var16;
		int var40 = var32 + 1;
		field218[var32] = var17;
		int var33;
		int var34 = var33 = field229[var16][var17];
		while (arg6 != var16 || arg5 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field217[var40] = var16;
				field218[var40++] = var17;
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

			var34 = field229[var16][var17];
		}

		if (var40 <= 0) {
			if (arg1 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field217[var40];
		int var37 = field218[var40];

		if (arg1 == 0) {
			field100.method202(130);
			field100.method203(var35 + var35 + 3);
		}

		if (arg1 == 1) {
			field100.method202(97);
			field100.method203(var35 + var35 + 3 + 14);
		}

		if (arg1 == 2) {
			field100.method202(32);
			field100.method203(var35 + var35 + 3);
		}

		field380 = field217[0];
		field381 = field218[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field100.method231(field217[var40] - var36);
			field100.method229(field218[var40] - var37);
		}

		field100.method204(field68 + var37);
		field100.method239(field67 + var36);
		field100.method231(field523[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method165() {
		while (true) {
			WNUCRRKP var1 = field332.method372();
			if (var1 == null) {
				return;
			}

			if (var1.field1310 == 0) {
				KUGNQTGL.method328(var1.field1308, var1.field1311);

				if ((field332.method374(var1.field1308) & 0x62) != 0) {
					field333 = true;

					if (field153 != -1 || field159 != -1) {
						field386 = true;
					}
				}
			}

			if (var1.field1310 == 1 && var1.field1311 != null) {
				SCWTQUFK.method452(var1.field1311);
			}

			if (var1.field1310 == 2 && field319 == var1.field1308 && var1.field1311 != null) {
				method174(field320, var1.field1311);
			}

			if (var1.field1310 == 3 && field328 == 1) {
				for (int var2 = 0; var2 < field44.length; var2++) {
					if (field280[var2] == var1.field1308) {
						field44[var2] = var1.field1311;

						if (var1.field1311 == null) {
							field280[var2] = -1;
						}

						break;
					}

					if (field281[var2] == var1.field1308) {
						field399[var2] = var1.field1311;

						if (var1.field1311 == null) {
							field281[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1310 == 93 && field332.method364(var1.field1308)) {
				YIGACPUG.method552(field332, new FTMSICIZ(var1.field1311));
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method166() {
		if (field340 == 0) {
			int var1 = field519;
			if (field149 == 1 && field520 >= 516 && field521 >= 160 && field520 <= 765 && field521 <= 205) {
				var1 = 0;
			}

			if (field211) {
				if (var1 != 1) {
					int var2 = field513;
					int var3 = field514;
					if (field163 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field163 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field163 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field164 - 10 || var2 > field166 + field164 + 10 || var3 < field165 - 10 || var3 > field167 + field165 + 10) {
						field211 = false;

						if (field163 == 1) {
							field333 = true;
						}

						if (field163 == 2) {
							field386 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field164;
					int var5 = field165;
					int var6 = field166;
					int var7 = field520;
					int var8 = field521;
					if (field163 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field163 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field163 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field364; var10++) {
						int var11 = (field364 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method90(var9);
					}

					field211 = false;

					if (field163 == 1) {
						field333 = true;
					}

					if (field163 == 2) {
						field386 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field364 > 0) {
					int var12 = field146[field364 - 1];
					if (var12 == 113 || var12 == 490 || var12 == 489 || var12 == 315 || var12 == 422 || var12 == 682 || var12 == 486 || var12 == 593 || var12 == 4 || var12 == 856 || var12 == 529 || var12 == 1314) {
						int var13 = field144[field364 - 1];
						int var14 = field145[field364 - 1];
						PCARWQQC var15 = PCARWQQC.method394(var14);
						if (var15.field916 || var15.field900) {
							field50 = false;
							field297 = 0;
							field338 = var14;
							field339 = var13;
							field340 = 2;
							field341 = field520;
							field342 = field521;

							if (PCARWQQC.method394(var14).field930 == field109) {
								field340 = 1;
							}

							if (PCARWQQC.method394(var14).field930 == field153) {
								field340 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field250 == 1 || method178(field364 - 1)) && field364 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field364 > 0) {
					method90(field364 - 1);
				}

				if (var1 != 2 || field364 <= 0) {
					return;
				}

				method54();
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method167() {
		try {
			int var1 = field62.field1082 + field93;
			int var2 = field62.field1083 + field394;
			if (field168 - var1 < -500 || field168 - var1 > 500 || field169 - var2 < -500 || field169 - var2 > 500) {
				field168 = var1;
				field169 = var2;
			}

			if (field168 != var1) {
				field168 += (var1 - field168) / 16;
			}

			if (field169 != var2) {
				field169 += (var2 - field169) / 16;
			}

			if (field523[1] == 1) {
				field311 += (-field311 - 24) / 2;
			} else if (field523[2] == 1) {
				field311 += (24 - field311) / 2;
			} else {
				field311 /= 2;
			}

			if (field523[3] == 1) {
				field312 += (12 - field312) / 2;
			} else if (field523[4] == 1) {
				field312 += (-field312 - 12) / 2;
			} else {
				field312 /= 2;
			}

			field310 = field311 / 2 + field310 & 0x7FF;
			field309 += field312 / 2;
			if (field309 < 128) {
				field309 = 128;
			}

			if (field309 > 383) {
				field309 = 383;
			}

			int var3 = field168 >> 7;
			int var4 = field169 >> 7;
			int var5 = method106(field168, field349, field169);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field349;
						if (var9 < 3 && (field481[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field438[var9][var7][var8];
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

			if (var11 > field72) {
				field72 += (var11 - field72) / 24;
			} else if (var11 < field72) {
				field72 += (var11 - field72) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field62.field1082 + "," + field62.field1083 + "," + field168 + "," + field169 + "," + field406 + "," + field407 + "," + field67 + "," + field68);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(BLPCARWQQC;I)I")
	public final int method168(PCARWQQC arg0, int arg1) {
		if (arg0.field937 == null || arg1 >= arg0.field937.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field937[arg1];
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
					var8 = field331[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field369[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field160[var3[var5++]];
				}

				if (var7 == 4) {
					PCARWQQC var10 = PCARWQQC.method394(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < NCBEIRPV.field838 && (!NCBEIRPV.method390(var11).field847 || field90)) {
						for (int var12 = 0; var12 < var10.field885.length; var12++) {
							if (var11 + 1 == var10.field885[var12]) {
								var8 += var10.field931[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field470[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field77[field369[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field470[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field62.field1422;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < VQYNMSDV.field1305; var13++) {
						if (VQYNMSDV.field1307[var13]) {
							var8 += field369[var13];
						}
					}
				}

				if (var7 == 10) {
					PCARWQQC var14 = PCARWQQC.method394(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < NCBEIRPV.field838 && (!NCBEIRPV.method390(var15).field847 || field90)) {
						for (int var16 = 0; var16 < var14.field885.length; var16++) {
							if (var14.field885[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field421;
				}

				if (var7 == 12) {
					var8 = field385;
				}

				if (var7 == 13) {
					int var17 = field470[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					NSTEZBJV var20 = NSTEZBJV.field868[var19];
					int var21 = var20.field870;
					int var22 = var20.field871;
					int var23 = var20.field872;
					int var24 = field430[var23 - var22];
					var8 = field470[var21] >> var22 & var24;
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
					var8 = (field62.field1082 >> 7) + field67;
				}

				if (var7 == 19) {
					var8 = (field62.field1083 >> 7) + field68;
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

	@ObfuscatedName("client.O(I)V")
	public final void method169() {
		short var1 = 256;

		if (field317 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field317 > 768) {
					field259[var2] = method92(1024 - field317, field261[var2], field260[var2]);
				} else if (field317 > 256) {
					field259[var2] = field261[var2];
				} else {
					field259[var2] = method92(256 - field317, field260[var2], field261[var2]);
				}
			}
		} else if (field318 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field318 > 768) {
					field259[var3] = method92(1024 - field318, field262[var3], field260[var3]);
				} else if (field318 > 256) {
					field259[var3] = field262[var3];
				} else {
					field259[var3] = method92(256 - field318, field260[var3], field262[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field259[var4] = field260[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field136.field583[var5] = field375.field658[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field65[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field51[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field259[var12];
					int var15 = field136.field583[var7];
					field136.field583[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field136.method295(0, field505, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field137.field583[var16] = field376.field658[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field65[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field51[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field259[var23];
					int var26 = field137.field583[var18];
					field137.field583[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field137.method295(0, field505, 637);
	}

	@ObfuscatedName("client.P(I)V")
	public final void method170() {
		field100.method202(155);

		if (field437 != -1) {
			method50(field437);
			field437 = -1;
			field333 = true;
			field190 = false;
			field148 = true;
		}

		if (field153 != -1) {
			method50(field153);
			field153 = -1;
			field386 = true;
			field190 = false;
		}

		if (field221 != -1) {
			method50(field221);
			field221 = -1;
			field220 = true;
		}

		if (field435 != -1) {
			method50(field435);
			field435 = -1;
		}

		if (field109 != -1) {
			method50(field109);
			field109 = -1;
		}
	}

	@ObfuscatedName("client.a(LFTMSICIZ;BI)V")
	public final void method171(FTMSICIZ arg0, int arg1) {
		for (int var3 = 0; var3 < field462; var3++) {
			int var4 = field463[var3];
			YFPQHQAV var5 = field459[var4];
			int var6 = arg0.method213();
			if ((var6 & 0x10) != 0) {
				var6 += arg0.method213() << 8;
			}

			method116(arg0, var6, var4, var5);
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;I)V")
	public final void method172(String arg0, int arg1) {
		field378 = arg1;
		field357 = arg0;
		method140();

		if (field143 == null) {
			super.method172(arg0, arg1);
		} else {
			field135.method294();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field346.method13(var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			CBERHIHM.method34(304, 34, 0x8C1111, var3 / 2 - 152, var6);
			CBERHIHM.method34(302, 32, 0, var3 / 2 - 151, var6 + 1);
			CBERHIHM.method33(var3 / 2 - 150, 0x8C1111, var6 + 2, 30, arg1 * 3);
			CBERHIHM.method33(arg1 * 3 + var3 / 2 - 150, 0, var6 + 2, 30, 300 - arg1 * 3);
			field346.method13(var3 / 2, var4 / 2 + 5 - var5, arg0, 0xFFFFFF);
			field135.method295(171, field505, 202);

			if (field220) {
				field220 = false;

				if (!field223) {
					field136.method295(0, field505, 0);
					field137.method295(0, field505, 637);
				}

				field133.method295(0, field505, 128);
				field134.method295(371, field505, 202);
				field138.method295(265, field505, 0);
				field139.method295(265, field505, 562);
				field140.method295(171, field505, 128);
				field141.method295(171, field505, 562);
			}
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method173() {
		for (int var1 = 0; var1 < field63; var1++) {
			if (field228[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field80[var1] != field188 || field173[var1] != field447) {
						FTMSICIZ var3 = TBRIOEDI.method463(field80[var1], field173[var1]);
						if (System.currentTimeMillis() + var3.field535 / 22 > field415 / 22 + field92) {
							field415 = var3.field535;
							field92 = System.currentTimeMillis();

							if (method42(var3.field535, var3.field534)) {
								field188 = field80[var1];
								field447 = field173[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method158()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field100.method202(1);
						field100.method204(field80[var1] & 0x7FFF);
					} else {
						field100.method202(1);
						field100.method204(-1);
					}
				}

				if (var2 && field228[var1] != -5) {
					field228[var1] = -5;
				} else {
					field63--;
					for (int var5 = var1; var5 < field63; var5++) {
						field80[var5] = field80[var5 + 1];
						field173[var5] = field173[var5 + 1];
						field228[var5] = field228[var5 + 1];
					}

					var1--;
				}
			} else {
				field228[var1]--;
			}
		}

		if (field104 > 0) {
			field104 -= 20;
			if (field104 < 0) {
				field104 = 0;
			}

			if (field104 == 0 && field124 && !field91) {
				field319 = field66;
				field320 = true;
				field332.method366(2, field319);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void method174(boolean arg0, byte[] arg1) {
		if (field124) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.a(ILFTMSICIZ;Z)V")
	public final void method175(int arg0, FTMSICIZ arg1) {
		while (arg1.field536 + 10 < arg0 * 8) {
			int var3 = arg1.method224(11);
			if (var3 == 2047) {
				break;
			}

			if (field459[var3] == null) {
				field459[var3] = new YFPQHQAV();
				if (field464[var3] != null) {
					field459[var3].method548(field464[var3]);
				}
			}

			field461[field460++] = var3;
			YFPQHQAV var4 = field459[var3];
			var4.field1100 = field231;
			int var5 = arg1.method224(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method224(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method224(1);
			if (var7 == 1) {
				field463[field462++] = var3;
			}

			int var8 = arg1.method224(1);
			var4.method432(field62.field1085[0] + var6, var8 == 1, field62.field1086[0] + var5);
		}

		arg1.method225();
	}

	@ObfuscatedName("client.a(LFTMSICIZ;IZ)V")
	public final void method176(FTMSICIZ arg0, int arg1) {
		arg0.method223();
		int var3 = arg0.method224(1);
		if (var3 != 0) {
			int var4 = arg0.method224(2);
			if (var4 == 0) {
				field463[field462++] = field458;
			} else if (var4 == 1) {
				int var5 = arg0.method224(3);
				field62.method430(var5, false);
				int var6 = arg0.method224(1);
				if (var6 == 1) {
					field463[field462++] = field458;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method224(3);
				field62.method430(var7, true);
				int var8 = arg0.method224(3);
				field62.method430(var8, true);
				int var9 = arg0.method224(1);
				if (var9 == 1) {
					field463[field462++] = field458;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method224(1);
				if (var10 == 1) {
					field463[field462++] = field458;
				}

				int var11 = arg0.method224(7);
				int var12 = arg0.method224(7);
				int var13 = arg0.method224(1);
				field349 = arg0.method224(2);
				field62.method432(var11, var13 == 1, var12);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;II)V")
	public final void method177(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field159 != -1) {
			field350 = arg0;
			field519 = 0;
		}

		if (field153 == -1) {
			field386 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field256[var4] = field256[var4 - 1];
			field257[var4] = field257[var4 - 1];
			field258[var4] = field258[var4 - 1];
		}

		field256[0] = arg2;
		field257[0] = arg1;
		field258[0] = arg0;
	}

	@ObfuscatedName("client.g(II)Z")
	public final boolean method178(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field146[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 143) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIILjava/lang/String;I)LAKPFVPPG;")
	public final AKPFVPPG method179(String arg0, int arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field241[0] != null) {
				var6 = field241[0].method8(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field330.reset();
			field330.update(var6);
			int var8 = (int) field330.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new AKPFVPPG(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method172("Requesting " + arg0, arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method76(arg4 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				FTMSICIZ var16 = new FTMSICIZ(var15);
				var16.field535 = 3;
				int var17 = var16.method217() + 6;
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
						method172("Loading " + arg0 + " - " + var22 + "%", arg3);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field241[0] != null) {
						field241[0].method9(var6, var6.length, arg1);
					}
				} catch (Exception var28) {
					field241[0] = null;
				}

				if (var6 != null) {
					field330.reset();
					field330.update(var6);
					int var23 = (int) field330.getValue();
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
						method172("Game updated - please reload page", arg3);
						var25 = 10;
					} else {
						method172(var11 + " - Retrying in " + var25, arg3);
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

				field354 = !field354;
			}
		}

		return new AKPFVPPG(var6);
	}

	@ObfuscatedName("client.a(IIZILRDFTXEYV;)V")
	public final void method180(int arg0, int arg1, int arg2, RDFTXEYV arg3) {
		if (field364 < 400) {
			if (arg3.field1191 != null) {
				arg3 = arg3.method436();
			}

			if (arg3 != null && arg3.field1183) {
				String var5 = arg3.field1165;
				if (arg3.field1161 != 0) {
					var5 = var5 + method86(field62.field1422, arg3.field1161) + " (level-" + arg3.field1161 + ")";
				}

				if (field83 == 1) {
					field95[field364] = "Use " + field87 + " with @yel@" + var5;
					field146[field364] = 800;
					field147[field364] = arg0;
					field144[field364] = arg1;
					field145[field364] = arg2;
					field364++;
				} else if (field149 != 1) {
					if (arg3.field1196 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field1196[var6] != null && !arg3.field1196[var6].equalsIgnoreCase("attack")) {
								field95[field364] = arg3.field1196[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field146[field364] = 992;
								}

								if (var6 == 1) {
									field146[field364] = 286;
								}

								if (var6 == 2) {
									field146[field364] = 434;
								}

								if (var6 == 3) {
									field146[field364] = 319;
								}

								if (var6 == 4) {
									field146[field364] = 476;
								}

								field147[field364] = arg0;
								field144[field364] = arg1;
								field145[field364] = arg2;
								field364++;
							}
						}
					}

					if (arg3.field1196 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field1196[var7] != null && arg3.field1196[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field1161 > field62.field1422) {
									var8 = 2000;
								}

								field95[field364] = arg3.field1196[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field146[field364] = var8 + 992;
								}

								if (var7 == 1) {
									field146[field364] = var8 + 286;
								}

								if (var7 == 2) {
									field146[field364] = var8 + 434;
								}

								if (var7 == 3) {
									field146[field364] = var8 + 319;
								}

								if (var7 == 4) {
									field146[field364] = var8 + 476;
								}

								field147[field364] = arg0;
								field144[field364] = arg1;
								field145[field364] = arg2;
								field364++;
							}
						}
					}

					field95[field364] = "Examine @yel@" + var5;
					field146[field364] = 1738;
					field147[field364] = arg0;
					field144[field364] = arg1;
					field145[field364] = arg2;
					field364++;
				} else if ((field151 & 0x2) == 2) {
					field95[field364] = field152 + " @yel@" + var5;
					field146[field364] = 83;
					field147[field364] = arg0;
					field144[field364] = arg1;
					field145[field364] = arg2;
					field364++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method181(int arg0) {
		PCARWQQC var2 = PCARWQQC.method394(arg0);
		for (int var3 = 0; var3 < var2.field891.length && var2.field891[var3] != -1; var3++) {
			PCARWQQC var4 = PCARWQQC.method394(var2.field891[var3]);
			if (var4.field920 == 1) {
				method181(var4.field895);
			}

			var4.field881 = 0;
			var4.field896 = 0;
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method182() {
		if (field392 == null) {
			method135();
			field506 = null;
			field133 = null;
			field134 = null;
			field135 = null;
			field136 = null;
			field137 = null;
			field138 = null;
			field139 = null;
			field140 = null;
			field141 = null;
			field392 = new HZYGKZDT(method109(), 479, 96);
			field390 = new HZYGKZDT(method109(), 172, 156);
			CBERHIHM.method31();
			field418.method304(0, 0);
			field389 = new HZYGKZDT(method109(), 190, 261);
			field391 = new HZYGKZDT(method109(), 512, 334);
			CBERHIHM.method31();
			field251 = new HZYGKZDT(method109(), 496, 50);
			field252 = new HZYGKZDT(method109(), 269, 37);
			field253 = new HZYGKZDT(method109(), 249, 45);
			field220 = true;
			field391.method294();
			ZUDKHAVN.field1492 = field266;
		}
	}

	@ObfuscatedName("client.c(LFTMSICIZ;II)V")
	public final void method183(FTMSICIZ arg0, int arg1) {
		if (arg1 == 17) {
			int var3 = arg0.method234();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field125[var4];
			int var7 = arg0.method213();
			int var8 = (var7 >> 4 & 0x7) + field471;
			int var9 = (var7 & 0x7) + field472;
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
				method156(-1, -1, 0, var5, field349, var6, var9, var8, var4);
			}
		} else if (arg1 == 121) {
			int var10 = arg0.method242();
			int var11 = arg0.method234();
			int var12 = (var11 >> 4 & 0x7) + field471;
			int var13 = (var11 & 0x7) + field472;
			int var14 = arg0.method242();
			int var15 = arg0.method242();
			if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && field351 != var10) {
				CCYSOVSO var16 = new CCYSOVSO();
				var16.field34 = var14;
				var16.field35 = var15;

				if (field227[field349][var12][var13] == null) {
					field227[field349][var12][var13] = new QGWIBVPG();
				}

				field227[field349][var12][var13].method419(var16);
				method48(var12, var13);
			}
		} else if (arg1 == 253) {
			int var17 = arg0.method242();
			int var18 = arg0.method215();
			int var19 = arg0.method213();
			int var20 = (var19 >> 4 & 0x7) + field471;
			int var21 = (var19 & 0x7) + field472;
			if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
				CCYSOVSO var22 = new CCYSOVSO();
				var22.field34 = var17;
				var22.field35 = var18;

				if (field227[field349][var20][var21] == null) {
					field227[field349][var20][var21] = new QGWIBVPG();
				}

				field227[field349][var20][var21].method419(var22);
				method48(var20, var21);
			}
		} else {
			if (arg1 == 32) {
				byte var23 = arg0.method237();
				byte var24 = arg0.method237();
				int var25 = arg0.method234();
				int var26 = (var25 >> 4 & 0x7) + field471;
				int var27 = (var25 & 0x7) + field472;
				byte var28 = arg0.method214();
				int var29 = arg0.method241();
				int var30 = arg0.method242();
				int var31 = arg0.method232();
				int var32 = var31 >> 2;
				int var33 = var31 & 0x3;
				int var34 = field125[var32];
				byte var35 = arg0.method236();
				int var36 = arg0.method243();
				int var37 = arg0.method242();
				YFPQHQAV var38;
				if (field351 == var36) {
					var38 = field62;
				} else {
					var38 = field459[var36];
				}

				if (var38 != null) {
					PZYCJUKA var39 = PZYCJUKA.method409(var30);
					int var40 = field438[field349][var26][var27];
					int var41 = field438[field349][var26 + 1][var27];
					int var42 = field438[field349][var26 + 1][var27 + 1];
					int var43 = field438[field349][var26][var27 + 1];
					KUGNQTGL var44 = var39.method413(var32, var33, var40, var41, var42, var43, -1);
					if (var44 != null) {
						method156(-1, var29 + 1, var37 + 1, 0, field349, var34, var27, var26, 0);
						var38.field1419 = field231 + var37;
						var38.field1420 = field231 + var29;
						var38.field1407 = var44;
						int var45 = var39.field982;
						int var46 = var39.field977;
						if (var33 == 1 || var33 == 3) {
							var45 = var39.field977;
							var46 = var39.field982;
						}

						var38.field1404 = var26 * 128 + var45 * 64;
						var38.field1406 = var27 * 128 + var46 * 64;
						var38.field1405 = method106(var38.field1404, field349, var38.field1406);

						if (var35 > var23) {
							byte var47 = var35;
							var35 = var23;
							var23 = var47;
						}

						if (var24 > var28) {
							byte var48 = var24;
							var24 = var28;
							var28 = var48;
						}

						var38.field1415 = var26 + var35;
						var38.field1417 = var23 + var26;
						var38.field1416 = var24 + var27;
						var38.field1418 = var27 + var28;
					}
				}
			}

			if (arg1 == 162) {
				int var49 = arg0.method213();
				int var50 = var49 >> 2;
				int var51 = var49 & 0x3;
				int var52 = field125[var50];
				int var53 = arg0.method233();
				int var54 = (var53 >> 4 & 0x7) + field471;
				int var55 = (var53 & 0x7) + field472;
				int var56 = arg0.method215();
				if (var54 >= 0 && var55 >= 0 && var54 < 103 && var55 < 103) {
					int var57 = field438[field349][var54][var55];
					int var58 = field438[field349][var54 + 1][var55];
					int var59 = field438[field349][var54 + 1][var55 + 1];
					int var60 = field438[field349][var54][var55 + 1];
					if (var52 == 0) {
						KWYTIVHS var61 = field110.method509(field349, var54, var55);
						if (var61 != null) {
							int var62 = var61.field744 >> 14 & 0x7FFF;
							if (var50 == 2) {
								var61.field742 = new GEKFXIMX(var62, var58, var57, 2, var56, var60, var59, var51 + 4, false);
								var61.field743 = new GEKFXIMX(var62, var58, var57, 2, var56, var60, var59, var51 + 1 & 0x3, false);
							} else {
								var61.field742 = new GEKFXIMX(var62, var58, var57, var50, var56, var60, var59, var51, false);
							}
						}
					}

					if (var52 == 1) {
						CJSYVZQM var63 = field110.method510(field349, var55, var54);
						if (var63 != null) {
							var63.field41 = new GEKFXIMX(var63.field42 >> 14 & 0x7FFF, var58, var57, 4, var56, var60, var59, 0, false);
						}
					}

					if (var52 == 2) {
						RFIYHDQM var64 = field110.method511(var55, var54, field349);

						if (var50 == 11) {
							var50 = 10;
						}

						if (var64 != null) {
							var64.field1202 = new GEKFXIMX(var64.field1210 >> 14 & 0x7FFF, var58, var57, var50, var56, var60, var59, var51, false);
						}
					}

					if (var52 == 3) {
						QZZDNTBO var65 = field110.method512(field349, var55, var54);
						if (var65 != null) {
							var65.field1135 = new GEKFXIMX(var65.field1136 >> 14 & 0x7FFF, var58, var57, 22, var56, var60, var59, var51, false);
						}
					}
				}
			} else if (arg1 == 174) {
				int var66 = arg0.method213();
				int var67 = (var66 >> 4 & 0x7) + field471;
				int var68 = (var66 & 0x7) + field472;
				int var69 = arg0.method215();
				int var70 = arg0.method215();
				int var71 = arg0.method215();
				if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
					QGWIBVPG var72 = field227[field349][var67][var68];
					if (var72 != null) {
						for (CCYSOVSO var73 = (CCYSOVSO) var72.method422(); var73 != null; var73 = (CCYSOVSO) var72.method424()) {
							if ((var69 & 0x7FFF) == var73.field34 && var73.field35 == var70) {
								var73.field35 = var71;
								break;
							}
						}

						method48(var67, var68);
					}
				}
			} else if (arg1 == 9) {
				int var74 = arg0.method215();
				int var75 = arg0.method233();
				int var76 = (var75 >> 4 & 0x7) + field471;
				int var77 = (var75 & 0x7) + field472;
				if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
					QGWIBVPG var78 = field227[field349][var76][var77];
					if (var78 != null) {
						for (CCYSOVSO var79 = (CCYSOVSO) var78.method422(); var79 != null; var79 = (CCYSOVSO) var78.method424()) {
							if ((var74 & 0x7FFF) == var79.field34) {
								var79.method418();
								break;
							}
						}

						if (var78.method422() == null) {
							field227[field349][var76][var77] = null;
						}

						method48(var76, var77);
					}
				}
			} else if (arg1 == 53) {
				int var80 = arg0.method213();
				int var81 = (var80 >> 4 & 0x7) + field471;
				int var82 = (var80 & 0x7) + field472;
				int var83 = arg0.method215();
				int var84 = arg0.method213();
				int var85 = arg0.method215();
				if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
					var81 = var81 * 128 + 64;
					var82 = var82 * 128 + 64;
					ZVYASFEK var86 = new ZVYASFEK(var81, var85, field231, field349, method106(var81, field349, var82) - var84, var83, var82);
					field184.method419(var86);
				}
			} else {
				if (arg1 == 176) {
					int var87 = arg0.method213();
					int var88 = (var87 >> 4 & 0x7) + field471;
					int var89 = (var87 & 0x7) + field472;
					int var90 = arg0.method215();
					int var91 = arg0.method213();
					int var92 = var91 >> 4 & 0xF;
					int var93 = var91 & 0x7;
					if (field62.field1085[0] >= var88 - var92 && field62.field1085[0] <= var88 + var92 && field62.field1086[0] >= var89 - var92 && field62.field1086[0] <= var89 + var92 && field239 && !field91 && field63 < 50) {
						field80[field63] = var90;
						field173[field63] = var93;
						field228[field63] = TBRIOEDI.field1284[var90];
						field63++;
					}
				}

				if (arg1 == 54) {
					int var94 = arg0.method213();
					int var95 = (var94 >> 4 & 0x7) + field471;
					int var96 = (var94 & 0x7) + field472;
					int var97 = var95 + arg0.method214();
					int var98 = var96 + arg0.method214();
					int var99 = arg0.method216();
					int var100 = arg0.method215();
					int var101 = arg0.method213() * 4;
					int var102 = arg0.method213() * 4;
					int var103 = arg0.method215();
					int var104 = arg0.method215();
					int var105 = arg0.method213();
					int var106 = arg0.method213();
					if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104 && var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104 && var100 != 0xFFFF) {
						var95 = var95 * 128 + 64;
						var96 = var96 * 128 + 64;
						var97 = var97 * 128 + 64;
						var98 = var98 * 128 + 64;
						QIFJGOLN var107 = new QIFJGOLN(method106(var95, field349, var96) - var101, field231 + var103, var95, var96, var105, var106, var100, var99, field231 + var104, var102, field349);
						var107.method427(method106(var97, field349, var98) - var102, field231 + var103, var97, var98);
						field108.method419(var107);
					}
				} else if (arg1 == 182) {
					int var108 = arg0.method243();
					int var109 = arg0.method232();
					int var110 = var109 >> 2;
					int var111 = var109 & 0x3;
					int var112 = field125[var110];
					int var113 = arg0.method234();
					int var114 = (var113 >> 4 & 0x7) + field471;
					int var115 = (var113 & 0x7) + field472;
					if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
						method156(var108, -1, 0, var111, field349, var112, var115, var114, var110);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.R(I)V")
	public static final void method184() {
		XNSGYTEG.field1321 = false;
		ZUDKHAVN.field1481 = false;
		field91 = false;
		YIGACPUG.field1432 = false;
		PZYCJUKA.field1005 = false;
	}

	@ObfuscatedName("client.d(IZ)V")
	public final void method185(boolean arg0) {
		if (field62.field1082 >> 7 == field380 && field62.field1083 >> 7 == field381) {
			field380 = 0;
		}

		int var2 = field460;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			YFPQHQAV var4;
			int var5;
			if (arg0) {
				var4 = field62;
				var5 = field458 << 14;
			} else {
				var4 = field459[field461[var3]];
				var5 = field461[var3] << 14;
			}

			if (var4 != null && var4.method433()) {
				var4.field1399 = false;
				if ((field91 && field460 > 50 || field460 > 200) && !arg0 && var4.field1113 == var4.field1102) {
					var4.field1399 = true;
				}

				int var6 = var4.field1082 >> 7;
				int var7 = var4.field1083 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1407 == null || field231 < var4.field1419 || field231 >= var4.field1420) {
						if ((var4.field1082 & 0x7F) == 0x40 && (var4.field1083 & 0x7F) == 0x40) {
							if (field243[var6][var7] == field446) {
								continue;
							}

							field243[var6][var7] = field446;
						}

						var4.field1402 = method106(var4.field1082, field349, var4.field1083);
						field110.method498(var4.field1402, var4, var4.field1082, 60, var4.field1083, var4.field1084, field349, var4.field1115, var5);
					} else {
						var4.field1399 = false;
						var4.field1402 = method106(var4.field1082, field349, var4.field1083);
						field110.method499(var4.field1415, var4.field1416, var4.field1084, var4, field349, 60, var4.field1082, var4.field1418, var4.field1417, var4.field1402, var5, var4.field1083);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.S(I)V")
	public final void method186() {
		PZYCJUKA.field991.method200();
		PZYCJUKA.field990.method200();
		RDFTXEYV.field1181.method200();
		NCBEIRPV.field856.method200();
		NCBEIRPV.field866.method200();
		YFPQHQAV.field1400.method200();
		JXKRPXFX.field644.method200();
	}

	@ObfuscatedName("client.m(B)Ljava/lang/String;")
	public final String method187() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field508 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field77[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field430[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
