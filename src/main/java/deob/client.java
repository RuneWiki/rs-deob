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
public final class client extends NHAOTYHM {

	@ObfuscatedName("client.M")
	public RGCGKKUR field65 = RGCGKKUR.method443(1);

	@ObfuscatedName("client.N")
	public byte[] field66 = new byte[16384];

	@ObfuscatedName("client.T")
	public int field72 = -1;

	@ObfuscatedName("client.U")
	public int[] field73 = new int[50];

	@ObfuscatedName("client.V")
	public boolean field74 = false;

	@ObfuscatedName("client.X")
	public int field75 = -1;

	@ObfuscatedName("client.Z")
	public int[] field76 = new int[5];

	@ObfuscatedName("client.ab")
	public boolean field77 = false;

	@ObfuscatedName("client.bb")
	public int[] field78 = new int[151];

	@ObfuscatedName("client.fb")
	public int field82 = 50;

	@ObfuscatedName("client.gb")
	public int[] field83 = new int[field82];

	@ObfuscatedName("client.hb")
	public int[] field84 = new int[field82];

	@ObfuscatedName("client.ib")
	public int[] field85 = new int[field82];

	@ObfuscatedName("client.jb")
	public int[] field86 = new int[field82];

	@ObfuscatedName("client.kb")
	public int[] field87 = new int[field82];

	@ObfuscatedName("client.lb")
	public int[] field88 = new int[field82];

	@ObfuscatedName("client.mb")
	public int[] field89 = new int[field82];

	@ObfuscatedName("client.nb")
	public String[] field90 = new String[field82];

	@ObfuscatedName("client.qb")
	public WGRALUSQ[] field92 = new WGRALUSQ[13];

	@ObfuscatedName("client.rb")
	public int[] field93 = new int[2000];

	@ObfuscatedName("client.sb")
	public int field94 = 2048;

	@ObfuscatedName("client.tb")
	public int field95 = 2047;

	@ObfuscatedName("client.ub")
	public IGCQCHAY[] field96 = new IGCQCHAY[field94];

	@ObfuscatedName("client.wb")
	public int[] field98 = new int[field94];

	@ObfuscatedName("client.yb")
	public int[] field100 = new int[field94];

	@ObfuscatedName("client.zb")
	public RGCGKKUR[] field101 = new RGCGKKUR[field94];

	@ObfuscatedName("client.Ab")
	public long[] field102 = new long[100];

	@ObfuscatedName("client.Db")
	public int field105 = 1;

	@ObfuscatedName("client.Ib")
	public boolean field107 = false;

	@ObfuscatedName("client.Ob")
	public int[] field109 = new int[33];

	@ObfuscatedName("client.Qb")
	public int[] field111 = new int[200];

	@ObfuscatedName("client.Rb")
	public boolean field112 = false;

	@ObfuscatedName("client.Tb")
	public RGCGKKUR field114 = new RGCGKKUR(new byte[5000]);

	@ObfuscatedName("client.Ub")
	public NVHCJIOR[] field115 = new NVHCJIOR[16384];

	@ObfuscatedName("client.Wb")
	public int[] field117 = new int[16384];

	@ObfuscatedName("client.hc")
	public ZSWNSCUQ[] field127 = new ZSWNSCUQ[8];

	@ObfuscatedName("client.nc")
	public int[] field131 = new int[1000];

	@ObfuscatedName("client.vc")
	public boolean field138 = true;

	@ObfuscatedName("client.wc")
	public int field139 = 128;

	@ObfuscatedName("client.Dc")
	public int field145 = -1;

	@ObfuscatedName("client.Ec")
	public int field146 = -1;

	@ObfuscatedName("client.Jc")
	public boolean field151 = true;

	@ObfuscatedName("client.Kc")
	public int[] field152 = new int[5];

	@ObfuscatedName("client.Lc")
	public int[][] field153 = new int[104][104];

	@ObfuscatedName("client.Mc")
	public int[] field154 = new int[2000];

	@ObfuscatedName("client.Pc")
	public ZSWNSCUQ[] field156 = new ZSWNSCUQ[32];

	@ObfuscatedName("client.Qc")
	public int[] field157 = new int[5];

	@ObfuscatedName("client.Tc")
	public CEEJCAVA[][][] field160 = new CEEJCAVA[4][104][104];

	@ObfuscatedName("client.Uc")
	public int field161 = -1;

	@ObfuscatedName("client.Vc")
	public boolean field162 = false;

	@ObfuscatedName("client.bd")
	public String field167 = "";

	@ObfuscatedName("client.hd")
	public ASFXKKJM[] field172 = new ASFXKKJM[4];

	@ObfuscatedName("client.id")
	public String[] field173 = new String[500];

	@ObfuscatedName("client.rd")
	public int field180 = 0x766654;

	@ObfuscatedName("client.xd")
	public String[] field184 = new String[5];

	@ObfuscatedName("client.yd")
	public boolean[] field185 = new boolean[5];

	@ObfuscatedName("client.Fd")
	public int[][] field190 = new int[104][104];

	@ObfuscatedName("client.Kd")
	public boolean field195 = false;

	@ObfuscatedName("client.Ld")
	public CEEJCAVA field196 = new CEEJCAVA();

	@ObfuscatedName("client.Nd")
	public String field198 = "";

	@ObfuscatedName("client.Pd")
	public String[] field200 = new String[100];

	@ObfuscatedName("client.Qd")
	public int[] field201 = new int[100];

	@ObfuscatedName("client.Sd")
	public boolean field203 = false;

	@ObfuscatedName("client.be")
	public int field211 = -1;

	@ObfuscatedName("client.de")
	public String field213 = "";

	@ObfuscatedName("client.ge")
	public volatile boolean field216 = false;

	@ObfuscatedName("client.je")
	public boolean[] field218 = new boolean[5];

	@ObfuscatedName("client.ke")
	public int field219 = -1;

	@ObfuscatedName("client.me")
	public int[] field221 = new int[33];

	@ObfuscatedName("client.ne")
	public boolean field222 = false;

	@ObfuscatedName("client.oe")
	public String field223 = "";

	@ObfuscatedName("client.pe")
	public int[] field224 = new int[SSXUEZGZ.field1379];

	@ObfuscatedName("client.Ie")
	public int field241 = -1;

	@ObfuscatedName("client.Oe")
	public int field247 = 2;

	@ObfuscatedName("client.Pe")
	public long[] field248 = new long[200];

	@ObfuscatedName("client.Re")
	public int[] field250 = new int[151];

	@ObfuscatedName("client.Te")
	public int field252 = 0x332D25;

	@ObfuscatedName("client.af")
	public int[][][] field257 = new int[4][13][13];

	@ObfuscatedName("client.bf")
	public HOAULYFF[] field258 = new HOAULYFF[5];

	@ObfuscatedName("client.cf")
	public boolean field259 = false;

	@ObfuscatedName("client.ef")
	public int[] field261 = new int[1000];

	@ObfuscatedName("client.ff")
	public int[] field262 = new int[1000];

	@ObfuscatedName("client.uf")
	public int[] field276 = new int[50];

	@ObfuscatedName("client.yf")
	public boolean field278 = false;

	@ObfuscatedName("client.Af")
	public ZSWNSCUQ[] field279 = new ZSWNSCUQ[32];

	@ObfuscatedName("client.Bf")
	public int[] field280 = new int[5];

	@ObfuscatedName("client.Ef")
	public String field283 = "";

	@ObfuscatedName("client.Ff")
	public String field284 = "";

	@ObfuscatedName("client.If")
	public int field286 = 2;

	@ObfuscatedName("client.Kf")
	public int[] field287 = new int[SSXUEZGZ.field1379];

	@ObfuscatedName("client.Pf")
	public int[][] field292 = new int[104][104];

	@ObfuscatedName("client.Qf")
	public boolean field293 = false;

	@ObfuscatedName("client.Tf")
	public boolean field296 = false;

	@ObfuscatedName("client.Uf")
	public int field297 = -1;

	@ObfuscatedName("client.Yf")
	public int[] field301 = new int[SSXUEZGZ.field1379];

	@ObfuscatedName("client.bg")
	public int field304 = -1;

	@ObfuscatedName("client.cg")
	public final int[] field305 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.fg")
	public int[] field308 = new int[7];

	@ObfuscatedName("client.gg")
	public int field309 = 78;

	@ObfuscatedName("client.hg")
	public ZSWNSCUQ[] field310 = new ZSWNSCUQ[100];

	@ObfuscatedName("client.ig")
	public int[] field311 = new int[500];

	@ObfuscatedName("client.jg")
	public int[] field312 = new int[500];

	@ObfuscatedName("client.kg")
	public int[] field313 = new int[500];

	@ObfuscatedName("client.lg")
	public int[] field314 = new int[500];

	@ObfuscatedName("client.ng")
	public String field315 = "";

	@ObfuscatedName("client.og")
	public WGRALUSQ[] field316 = new WGRALUSQ[2];

	@ObfuscatedName("client.pg")
	public int field317 = 0x23201B;

	@ObfuscatedName("client.rg")
	public int field319 = -1;

	@ObfuscatedName("client.sg")
	public ZSWNSCUQ[] field320 = new ZSWNSCUQ[32];

	@ObfuscatedName("client.ug")
	public boolean field322 = false;

	@ObfuscatedName("client.Kg")
	public boolean field338 = false;

	@ObfuscatedName("client.Og")
	public String field342 = "";

	@ObfuscatedName("client.Sg")
	public boolean field345 = false;

	@ObfuscatedName("client.Ug")
	public RGCGKKUR field347 = RGCGKKUR.method443(1);

	@ObfuscatedName("client.Wg")
	public int field349 = -1;

	@ObfuscatedName("client.Xg")
	public int field350 = -1;

	@ObfuscatedName("client.Yg")
	public volatile boolean field351 = false;

	@ObfuscatedName("client.Zg")
	public boolean field352 = false;

	@ObfuscatedName("client.nh")
	public String field365 = "";

	@ObfuscatedName("client.oh")
	public String field366 = "";

	@ObfuscatedName("client.rh")
	public QUBPQDMQ field369 = new QUBPQDMQ();

	@ObfuscatedName("client.th")
	public int[] field370 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.yh")
	public boolean field374 = false;

	@ObfuscatedName("client.Ch")
	public int[] field377 = new int[100];

	@ObfuscatedName("client.Dh")
	public String[] field378 = new String[100];

	@ObfuscatedName("client.Eh")
	public String[] field379 = new String[100];

	@ObfuscatedName("client.Ih")
	public boolean field382 = false;

	@ObfuscatedName("client.Jh")
	public int[] field383 = new int[50];

	@ObfuscatedName("client.Mh")
	public boolean field386 = false;

	@ObfuscatedName("client.Oh")
	public ZSWNSCUQ[] field388 = new ZSWNSCUQ[20];

	@ObfuscatedName("client.Qh")
	public int[] field390 = new int[256];

	@ObfuscatedName("client.Sh")
	public int field392 = -1;

	@ObfuscatedName("client.Yh")
	public CRC32 field398 = new CRC32();

	@ObfuscatedName("client.ai")
	public String[] field400 = new String[200];

	@ObfuscatedName("client.gi")
	public int[] field405 = new int[4000];

	@ObfuscatedName("client.hi")
	public int[] field406 = new int[4000];

	@ObfuscatedName("client.mi")
	public boolean field411 = false;

	@ObfuscatedName("client.ti")
	public int field415 = 2;

	@ObfuscatedName("client.wi")
	public int field418 = 0x4D4233;

	@ObfuscatedName("client.Ui")
	public int[] field441 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.cj")
	public int field447 = 1;

	@ObfuscatedName("client.oj")
	public int field457 = -1;

	@ObfuscatedName("client.qj")
	public final int field459 = 100;

	@ObfuscatedName("client.rj")
	public int[] field460 = new int[100];

	@ObfuscatedName("client.sj")
	public boolean field461 = true;

	@ObfuscatedName("client.tj")
	public boolean field462 = true;

	@ObfuscatedName("client.uj")
	public RGCGKKUR field463 = RGCGKKUR.method443(1);

	@ObfuscatedName("client.vj")
	public int field464 = 3;

	@ObfuscatedName("client.zj")
	public boolean field467 = false;

	@ObfuscatedName("client.Hj")
	public WGRALUSQ[] field473 = new WGRALUSQ[100];

	@ObfuscatedName("client.Jj")
	public volatile boolean field475 = false;

	@ObfuscatedName("client.Lj")
	public CEEJCAVA field477 = new CEEJCAVA();

	@ObfuscatedName("client.Mj")
	public int field478 = -1;

	@ObfuscatedName("client.Oj")
	public int[] field480 = new int[5];

	@ObfuscatedName("client.Pj")
	public int[] field481 = new int[9];

	@ObfuscatedName("client.Rj")
	public CEEJCAVA field483 = new CEEJCAVA();

	@ObfuscatedName("client.Sj")
	public ZSWNSCUQ[] field484 = new ZSWNSCUQ[1000];

	@ObfuscatedName("client.Zj")
	public boolean field491 = false;

	@ObfuscatedName("client.bk")
	public boolean field493 = true;

	@ObfuscatedName("client.hk")
	public int[] field498 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Bb")
	public static int[] field103 = new int[32];

	@ObfuscatedName("client.le")
	public static final int[][] field220 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Je")
	public static int field242 = 10;

	@ObfuscatedName("client.Le")
	public static boolean field244 = true;

	@ObfuscatedName("client.ag")
	public static BigInteger field303 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ph")
	public static int[] field389 = new int[99];

	@ObfuscatedName("client.ii")
	public static String field407 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Zi")
	public static BigInteger field445 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.ak")
	public static final int[] field492 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Cb")
	public int field104;

	@ObfuscatedName("client.Eb")
	public int field106;

	@ObfuscatedName("client.Pb")
	public static int field110;

	@ObfuscatedName("client.Sb")
	public int field113;

	@ObfuscatedName("client.Vb")
	public int field116;

	@ObfuscatedName("client.Yb")
	public int field118;

	@ObfuscatedName("client.Zb")
	public int field119;

	@ObfuscatedName("client.ac")
	public int field120;

	@ObfuscatedName("client.bc")
	public int field121;

	@ObfuscatedName("client.cc")
	public int field122;

	@ObfuscatedName("client.dc")
	public int field123;

	@ObfuscatedName("client.mc")
	public int field130;

	@ObfuscatedName("client.oc")
	public int field132;

	@ObfuscatedName("client.pc")
	public int field133;

	@ObfuscatedName("client.qc")
	public int field134;

	@ObfuscatedName("client.rc")
	public int field135;

	@ObfuscatedName("client.sc")
	public int field136;

	@ObfuscatedName("client.xc")
	public int field140;

	@ObfuscatedName("client.yc")
	public int field141;

	@ObfuscatedName("client.zc")
	public int field142;

	@ObfuscatedName("client.Ac")
	public static int field143;

	@ObfuscatedName("client.Cc")
	public int field144;

	@ObfuscatedName("client.Ic")
	public int field150;

	@ObfuscatedName("client.Rc")
	public int field158;

	@ObfuscatedName("client.Sc")
	public int field159;

	@ObfuscatedName("client.Zc")
	public static int field166;

	@ObfuscatedName("client.dd")
	public int field168;

	@ObfuscatedName("client.ed")
	public int field169;

	@ObfuscatedName("client.fd")
	public int field170;

	@ObfuscatedName("client.gd")
	public int field171;

	@ObfuscatedName("client.ld")
	public int field174;

	@ObfuscatedName("client.md")
	public int field175;

	@ObfuscatedName("client.nd")
	public int field176;

	@ObfuscatedName("client.od")
	public int field177;

	@ObfuscatedName("client.wd")
	public int field183;

	@ObfuscatedName("client.Ed")
	public int field189;

	@ObfuscatedName("client.Gd")
	public int field191;

	@ObfuscatedName("client.Hd")
	public int field192;

	@ObfuscatedName("client.Id")
	public int field193;

	@ObfuscatedName("client.Jd")
	public int field194;

	@ObfuscatedName("client.Md")
	public int field197;

	@ObfuscatedName("client.Od")
	public int field199;

	@ObfuscatedName("client.Rd")
	public int field202;

	@ObfuscatedName("client.Td")
	public static int field204;

	@ObfuscatedName("client.Ud")
	public static int field205;

	@ObfuscatedName("client.Wd")
	public int field206;

	@ObfuscatedName("client.ce")
	public int field212;

	@ObfuscatedName("client.ee")
	public int field214;

	@ObfuscatedName("client.fe")
	public int field215;

	@ObfuscatedName("client.ie")
	public int field217;

	@ObfuscatedName("client.re")
	public int field226;

	@ObfuscatedName("client.ue")
	public int field229;

	@ObfuscatedName("client.ve")
	public int field230;

	@ObfuscatedName("client.we")
	public int field231;

	@ObfuscatedName("client.xe")
	public int field232;

	@ObfuscatedName("client.ye")
	public int field233;

	@ObfuscatedName("client.Ge")
	public int field239;

	@ObfuscatedName("client.He")
	public int field240;

	@ObfuscatedName("client.Ke")
	public static int field243;

	@ObfuscatedName("client.Ne")
	public int field246;

	@ObfuscatedName("client.Se")
	public int field251;

	@ObfuscatedName("client.Ue")
	public int field253;

	@ObfuscatedName("client.Ve")
	public int field254;

	@ObfuscatedName("client.We")
	public int field255;

	@ObfuscatedName("client.Ze")
	public int field256;

	@ObfuscatedName("client.df")
	public int field260;

	@ObfuscatedName("client.sf")
	public int field274;

	@ObfuscatedName("client.tf")
	public int field275;

	@ObfuscatedName("client.wf")
	public int field277;

	@ObfuscatedName("client.Cf")
	public int field281;

	@ObfuscatedName("client.Df")
	public int field282;

	@ObfuscatedName("client.Hf")
	public int field285;

	@ObfuscatedName("client.Rf")
	public int field294;

	@ObfuscatedName("client.Vf")
	public int field298;

	@ObfuscatedName("client.Wf")
	public int field299;

	@ObfuscatedName("client.Zf")
	public int field302;

	@ObfuscatedName("client.eg")
	public int field307;

	@ObfuscatedName("client.qg")
	public int field318;

	@ObfuscatedName("client.vg")
	public int field323;

	@ObfuscatedName("client.wg")
	public int field324;

	@ObfuscatedName("client.xg")
	public int field325;

	@ObfuscatedName("client.yg")
	public int field326;

	@ObfuscatedName("client.zg")
	public int field327;

	@ObfuscatedName("client.Fg")
	public int field333;

	@ObfuscatedName("client.Gg")
	public int field334;

	@ObfuscatedName("client.Jg")
	public int field337;

	@ObfuscatedName("client.Lg")
	public int field339;

	@ObfuscatedName("client.Mg")
	public int field340;

	@ObfuscatedName("client.Qg")
	public int field343;

	@ObfuscatedName("client.Rg")
	public int field344;

	@ObfuscatedName("client.Vg")
	public int field348;

	@ObfuscatedName("client.ah")
	public static int field353;

	@ObfuscatedName("client.ch")
	public int field354;

	@ObfuscatedName("client.eh")
	public int field356;

	@ObfuscatedName("client.fh")
	public int field357;

	@ObfuscatedName("client.gh")
	public int field358;

	@ObfuscatedName("client.hh")
	public static int field359;

	@ObfuscatedName("client.ih")
	public int field360;

	@ObfuscatedName("client.jh")
	public int field361;

	@ObfuscatedName("client.kh")
	public int field362;

	@ObfuscatedName("client.lh")
	public int field363;

	@ObfuscatedName("client.mh")
	public int field364;

	@ObfuscatedName("client.qh")
	public int field368;

	@ObfuscatedName("client.uh")
	public int field371;

	@ObfuscatedName("client.wh")
	public static int field373;

	@ObfuscatedName("client.Ah")
	public int field375;

	@ObfuscatedName("client.Bh")
	public int field376;

	@ObfuscatedName("client.Fh")
	public int field380;

	@ObfuscatedName("client.Gh")
	public int field381;

	@ObfuscatedName("client.Kh")
	public int field384;

	@ObfuscatedName("client.Nh")
	public int field387;

	@ObfuscatedName("client.Rh")
	public static int field391;

	@ObfuscatedName("client.Th")
	public int field393;

	@ObfuscatedName("client.Uh")
	public int field394;

	@ObfuscatedName("client.Vh")
	public int field395;

	@ObfuscatedName("client.Wh")
	public int field396;

	@ObfuscatedName("client.Xh")
	public int field397;

	@ObfuscatedName("client.Zh")
	public int field399;

	@ObfuscatedName("client.ci")
	public int field401;

	@ObfuscatedName("client.di")
	public int field402;

	@ObfuscatedName("client.fi")
	public static int field404;

	@ObfuscatedName("client.ji")
	public int field408;

	@ObfuscatedName("client.ki")
	public int field409;

	@ObfuscatedName("client.li")
	public int field410;

	@ObfuscatedName("client.qi")
	public int field413;

	@ObfuscatedName("client.si")
	public int field414;

	@ObfuscatedName("client.ui")
	public static int field416;

	@ObfuscatedName("client.vi")
	public int field417;

	@ObfuscatedName("client.Li")
	public int field432;

	@ObfuscatedName("client.Mi")
	public int field433;

	@ObfuscatedName("client.Ni")
	public int field434;

	@ObfuscatedName("client.Oi")
	public int field435;

	@ObfuscatedName("client.Pi")
	public int field436;

	@ObfuscatedName("client.Qi")
	public int field437;

	@ObfuscatedName("client.Ri")
	public int field438;

	@ObfuscatedName("client.Ti")
	public int field440;

	@ObfuscatedName("client.Vi")
	public int field442;

	@ObfuscatedName("client.bj")
	public int field446;

	@ObfuscatedName("client.ij")
	public static int field451;

	@ObfuscatedName("client.pj")
	public int field458;

	@ObfuscatedName("client.wj")
	public static int field465;

	@ObfuscatedName("client.yj")
	public int field466;

	@ObfuscatedName("client.Cj")
	public int field468;

	@ObfuscatedName("client.Dj")
	public int field469;

	@ObfuscatedName("client.Ej")
	public int field470;

	@ObfuscatedName("client.Fj")
	public int field471;

	@ObfuscatedName("client.Gj")
	public int field472;

	@ObfuscatedName("client.Ij")
	public int field474;

	@ObfuscatedName("client.Kj")
	public int field476;

	@ObfuscatedName("client.Qj")
	public int field482;

	@ObfuscatedName("client.Tj")
	public int field485;

	@ObfuscatedName("client.Uj")
	public int field486;

	@ObfuscatedName("client.dk")
	public int field494;

	@ObfuscatedName("client.ek")
	public int field495;

	@ObfuscatedName("client.fk")
	public int field496;

	@ObfuscatedName("client.ik")
	public static int field499;

	@ObfuscatedName("client.jk")
	public int field500;

	@ObfuscatedName("client.kk")
	public int field501;

	@ObfuscatedName("client.lk")
	public int field502;

	@ObfuscatedName("client.mk")
	public int field503;

	@ObfuscatedName("client.nk")
	public int field504;

	@ObfuscatedName("client.ok")
	public int field505;

	@ObfuscatedName("client.pk")
	public static int field506;

	@ObfuscatedName("client.qk")
	public int field507;

	@ObfuscatedName("client.L")
	public static int field64;

	@ObfuscatedName("client.cb")
	public static int field79;

	@ObfuscatedName("client.db")
	public int field80;

	@ObfuscatedName("client.eb")
	public int field81;

	@ObfuscatedName("client.vb")
	public int field97;

	@ObfuscatedName("client.xb")
	public int field99;

	@ObfuscatedName("client.td")
	public long field182;

	@ObfuscatedName("client.Qe")
	public long field249;

	@ObfuscatedName("client.Xf")
	public long field300;

	@ObfuscatedName("client.vh")
	public long field372;

	@ObfuscatedName("client.O")
	public long field67;

	@ObfuscatedName("client.Ng")
	public EKUSXTUB field341;

	@ObfuscatedName("client.rf")
	public ESUFCMYV field273;

	@ObfuscatedName("client.gf")
	public HVBGFDBD field263;

	@ObfuscatedName("client.hf")
	public HVBGFDBD field264;

	@ObfuscatedName("client.jf")
	public HVBGFDBD field265;

	@ObfuscatedName("client.kf")
	public HVBGFDBD field266;

	@ObfuscatedName("client.lf")
	public HVBGFDBD field267;

	@ObfuscatedName("client.mf")
	public HVBGFDBD field268;

	@ObfuscatedName("client.nf")
	public HVBGFDBD field269;

	@ObfuscatedName("client.of")
	public HVBGFDBD field270;

	@ObfuscatedName("client.pf")
	public HVBGFDBD field271;

	@ObfuscatedName("client.yi")
	public HVBGFDBD field420;

	@ObfuscatedName("client.zi")
	public HVBGFDBD field421;

	@ObfuscatedName("client.Ai")
	public HVBGFDBD field422;

	@ObfuscatedName("client.Ci")
	public HVBGFDBD field423;

	@ObfuscatedName("client.Di")
	public HVBGFDBD field424;

	@ObfuscatedName("client.Ei")
	public HVBGFDBD field425;

	@ObfuscatedName("client.Fi")
	public HVBGFDBD field426;

	@ObfuscatedName("client.Gi")
	public HVBGFDBD field427;

	@ObfuscatedName("client.Hi")
	public HVBGFDBD field428;

	@ObfuscatedName("client.Ii")
	public HVBGFDBD field429;

	@ObfuscatedName("client.Ji")
	public HVBGFDBD field430;

	@ObfuscatedName("client.Ki")
	public HVBGFDBD field431;

	@ObfuscatedName("client.P")
	public HVBGFDBD field68;

	@ObfuscatedName("client.Q")
	public HVBGFDBD field69;

	@ObfuscatedName("client.R")
	public HVBGFDBD field70;

	@ObfuscatedName("client.S")
	public HVBGFDBD field71;

	@ObfuscatedName("client.sd")
	public static IGCQCHAY field181;

	@ObfuscatedName("client.Nj")
	public JLGPBSNA field479;

	@ObfuscatedName("client.Lf")
	public MGTPXZHY field288;

	@ObfuscatedName("client.Mf")
	public MGTPXZHY field289;

	@ObfuscatedName("client.Nf")
	public MGTPXZHY field290;

	@ObfuscatedName("client.Of")
	public MGTPXZHY field291;

	@ObfuscatedName("client.fj")
	public NTGEPOMK field450;

	@ObfuscatedName("client.pb")
	public OUUKQIMK field91;

	@ObfuscatedName("client.Sf")
	public THBLNINF field295;

	@ObfuscatedName("client.Wc")
	public WGRALUSQ field163;

	@ObfuscatedName("client.Xc")
	public WGRALUSQ field164;

	@ObfuscatedName("client.Yc")
	public WGRALUSQ field165;

	@ObfuscatedName("client.pd")
	public WGRALUSQ field178;

	@ObfuscatedName("client.qd")
	public WGRALUSQ field179;

	@ObfuscatedName("client.Bd")
	public WGRALUSQ field186;

	@ObfuscatedName("client.Cd")
	public WGRALUSQ field187;

	@ObfuscatedName("client.Dd")
	public WGRALUSQ field188;

	@ObfuscatedName("client.Ag")
	public WGRALUSQ field328;

	@ObfuscatedName("client.Bg")
	public WGRALUSQ field329;

	@ObfuscatedName("client.Cg")
	public WGRALUSQ field330;

	@ObfuscatedName("client.Dg")
	public WGRALUSQ field331;

	@ObfuscatedName("client.Eg")
	public WGRALUSQ field332;

	@ObfuscatedName("client.Hg")
	public WGRALUSQ field335;

	@ObfuscatedName("client.Ig")
	public WGRALUSQ field336;

	@ObfuscatedName("client.jj")
	public WGRALUSQ field452;

	@ObfuscatedName("client.kj")
	public WGRALUSQ field453;

	@ObfuscatedName("client.lj")
	public WGRALUSQ field454;

	@ObfuscatedName("client.mj")
	public WGRALUSQ field455;

	@ObfuscatedName("client.nj")
	public WGRALUSQ field456;

	@ObfuscatedName("client.ic")
	public ZSWNSCUQ field128;

	@ObfuscatedName("client.jc")
	public ZSWNSCUQ field129;

	@ObfuscatedName("client.uc")
	public ZSWNSCUQ field137;

	@ObfuscatedName("client.qe")
	public ZSWNSCUQ field225;

	@ObfuscatedName("client.Be")
	public ZSWNSCUQ field234;

	@ObfuscatedName("client.Ce")
	public ZSWNSCUQ field235;

	@ObfuscatedName("client.De")
	public ZSWNSCUQ field236;

	@ObfuscatedName("client.Ee")
	public ZSWNSCUQ field237;

	@ObfuscatedName("client.Fe")
	public ZSWNSCUQ field238;

	@ObfuscatedName("client.Tg")
	public ZSWNSCUQ field346;

	@ObfuscatedName("client.ei")
	public ZSWNSCUQ field403;

	@ObfuscatedName("client.Wi")
	public ZSWNSCUQ field443;

	@ObfuscatedName("client.Xi")
	public ZSWNSCUQ field444;

	@ObfuscatedName("client.dj")
	public ZSWNSCUQ field448;

	@ObfuscatedName("client.ej")
	public ZSWNSCUQ field449;

	@ObfuscatedName("client.ec")
	public String field124;

	@ObfuscatedName("client.tg")
	public String field321;

	@ObfuscatedName("client.Lh")
	public String field385;

	@ObfuscatedName("client.gk")
	public String field497;

	@ObfuscatedName("client.dg")
	public Socket field306;

	@ObfuscatedName("client.Jb")
	public static boolean field108;

	@ObfuscatedName("client.Oc")
	public static boolean field155;

	@ObfuscatedName("client.Me")
	public static boolean field245;

	@ObfuscatedName("client.oi")
	public static boolean field412;

	@ObfuscatedName("client.fc")
	public int[] field125;

	@ObfuscatedName("client.gc")
	public int[] field126;

	@ObfuscatedName("client.Fc")
	public int[] field147;

	@ObfuscatedName("client.Gc")
	public int[] field148;

	@ObfuscatedName("client.Hc")
	public int[] field149;

	@ObfuscatedName("client.Xd")
	public int[] field207;

	@ObfuscatedName("client.Yd")
	public int[] field208;

	@ObfuscatedName("client.Zd")
	public int[] field209;

	@ObfuscatedName("client.ae")
	public int[] field210;

	@ObfuscatedName("client.se")
	public int[] field227;

	@ObfuscatedName("client.te")
	public int[] field228;

	@ObfuscatedName("client.Vj")
	public int[] field487;

	@ObfuscatedName("client.Wj")
	public int[] field488;

	@ObfuscatedName("client.Xj")
	public int[] field489;

	@ObfuscatedName("client.Yj")
	public int[] field490;

	@ObfuscatedName("client.Si")
	public WGRALUSQ[] field439;

	@ObfuscatedName("client.dh")
	public byte[][] field355;

	@ObfuscatedName("client.xi")
	public byte[][] field419;

	@ObfuscatedName("client.qf")
	public byte[][][] field272;

	@ObfuscatedName("client.ph")
	public int[][][] field367;

	@ObfuscatedName("client.f(I)Ljava/net/Socket;")
	public final Socket method38(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field937 != null) {
				return new URL("http://127.0.0.1:" + (field243 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method39(int arg0) {
		QUBPQDMQ.method436(arg0);
	}

	@ObfuscatedName("client.a(ILRGCGKKUR;I)V")
	public final void method40(RGCGKKUR arg0, int arg1) {
		while (arg0.field1351 + 10 < arg1 * 8) {
			int var3 = arg0.method466(11);
			if (var3 == 2047) {
				break;
			}

			if (field96[var3] == null) {
				field96[var3] = new IGCQCHAY();
				if (field101[var3] != null) {
					field96[var3].method226(field101[var3]);
				}
			}

			field98[field97++] = var3;
			IGCQCHAY var4 = field96[var3];
			var4.field1241 = field205;
			int var5 = arg0.method466(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method466(1);
			if (var6 == 1) {
				field100[field99++] = var3;
			}

			int var7 = arg0.method466(1);
			int var8 = arg0.method466(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method419(field181.field1225[0] + var5, field181.field1226[0] + var8, var7 == 1);
		}

		arg0.method467();
	}

	@ObfuscatedName("client.a(ILRGCGKKUR;Z)V")
	public final void method41(int arg0, RGCGKKUR arg1) {
		arg1.method465();
		int var3 = arg1.method466(8);
		if (var3 < field116) {
			for (int var4 = var3; var4 < field116; var4++) {
				field131[field130++] = field117[var4];
			}
		}

		if (var3 > field116) {
			signlink.reporterror(field365 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field116 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field117[var5];
			NVHCJIOR var7 = field115[var6];
			int var8 = arg1.method466(1);
			if (var8 == 0) {
				field117[field116++] = var6;
				var7.field1241 = field205;
			} else {
				int var9 = arg1.method466(2);
				if (var9 == 0) {
					field117[field116++] = var6;
					var7.field1241 = field205;
					field100[field99++] = var6;
				} else if (var9 == 1) {
					field117[field116++] = var6;
					var7.field1241 = field205;
					int var10 = arg1.method466(3);
					var7.method420(var10, false);
					int var11 = arg1.method466(1);
					if (var11 == 1) {
						field100[field99++] = var6;
					}
				} else if (var9 == 2) {
					field117[field116++] = var6;
					var7.field1241 = field205;
					int var12 = arg1.method466(3);
					var7.method420(var12, true);
					int var13 = arg1.method466(3);
					var7.method420(var13, true);
					int var14 = arg1.method466(1);
					if (var14 == 1) {
						field100[field99++] = var6;
					}
				} else if (var9 == 3) {
					field131[field130++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method42() {
		int var1 = field290.method273("Choose Option");
		for (int var2 = 0; var2 < field118; var2++) {
			int var3 = field290.method273(field173[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field118 * 15 + 21;
		if (field949 > 4 && field950 > 4 && field949 < 516 && field950 < 338) {
			int var5 = field949 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field950 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field467 = true;
			field432 = 0;
			field433 = var5;
			field434 = var6;
			field435 = var1;
			field436 = field118 * 15 + 22;
		}

		if (field949 > 553 && field950 > 205 && field949 < 743 && field950 < 466) {
			int var7 = field949 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field950 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field467 = true;
			field432 = 1;
			field433 = var7;
			field434 = var8;
			field435 = var1;
			field436 = field118 * 15 + 22;
		}

		if (field949 > 17 && field950 > 357 && field949 < 496 && field950 < 453) {
			int var9 = field949 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field950 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field467 = true;
			field432 = 2;
			field433 = var9;
			field434 = var10;
			field435 = var1;
			field436 = field118 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method43() {
		if (field948 == 1) {
			if (field949 >= 539 && field949 <= 573 && field950 >= 169 && field950 < 205 && field498[0] != -1) {
				field259 = true;
				field464 = 0;
				field374 = true;
			}

			if (field949 >= 569 && field949 <= 599 && field950 >= 168 && field950 < 205 && field498[1] != -1) {
				field259 = true;
				field464 = 1;
				field374 = true;
			}

			if (field949 >= 597 && field949 <= 627 && field950 >= 168 && field950 < 205 && field498[2] != -1) {
				field259 = true;
				field464 = 2;
				field374 = true;
			}

			if (field949 >= 625 && field949 <= 669 && field950 >= 168 && field950 < 203 && field498[3] != -1) {
				field259 = true;
				field464 = 3;
				field374 = true;
			}

			if (field949 >= 666 && field949 <= 696 && field950 >= 168 && field950 < 205 && field498[4] != -1) {
				field259 = true;
				field464 = 4;
				field374 = true;
			}

			if (field949 >= 694 && field949 <= 724 && field950 >= 168 && field950 < 205 && field498[5] != -1) {
				field259 = true;
				field464 = 5;
				field374 = true;
			}

			if (field949 >= 722 && field949 <= 756 && field950 >= 169 && field950 < 205 && field498[6] != -1) {
				field259 = true;
				field464 = 6;
				field374 = true;
			}

			if (field949 >= 540 && field949 <= 574 && field950 >= 466 && field950 < 502 && field498[7] != -1) {
				field259 = true;
				field464 = 7;
				field374 = true;
			}

			if (field949 >= 572 && field949 <= 602 && field950 >= 466 && field950 < 503 && field498[8] != -1) {
				field259 = true;
				field464 = 8;
				field374 = true;
			}

			if (field949 >= 599 && field949 <= 629 && field950 >= 466 && field950 < 503 && field498[9] != -1) {
				field259 = true;
				field464 = 9;
				field374 = true;
			}

			if (field949 >= 627 && field949 <= 671 && field950 >= 467 && field950 < 502 && field498[10] != -1) {
				field259 = true;
				field464 = 10;
				field374 = true;
			}

			if (field949 >= 669 && field949 <= 699 && field950 >= 466 && field950 < 503 && field498[11] != -1) {
				field259 = true;
				field464 = 11;
				field374 = true;
			}

			if (field949 >= 696 && field949 <= 726 && field950 >= 466 && field950 < 503 && field498[12] != -1) {
				field259 = true;
				field464 = 12;
				field374 = true;
			}

			if (field949 >= 724 && field949 <= 758 && field950 >= 466 && field950 < 502 && field498[13] != -1) {
				field259 = true;
				field464 = 13;
				field374 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method44() {
		field335 = new WGRALUSQ(field273, "titlebox", 0);
		field336 = new WGRALUSQ(field273, "titlebutton", 0);
		field439 = new WGRALUSQ[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field439[var1] = new WGRALUSQ(field273, "runes", var1);
		}

		field443 = new ZSWNSCUQ(128, 265);
		field444 = new ZSWNSCUQ(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field443.field1511[var2] = field266.field669[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field444.field1511[var3] = field267.field669[var3];
		}

		field208 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field208[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field208[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field208[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field208[var7 + 192] = 0xFFFFFF;
		}

		field209 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field209[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field209[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field209[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field209[var11 + 192] = 0xFFFFFF;
		}

		field210 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field210[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field210[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field210[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field210[var15 + 192] = 0xFFFFFF;
		}

		field207 = new int[256];
		field125 = new int[32768];
		field126 = new int[32768];
		method60(null);
		field227 = new int[32768];
		field228 = new int[32768];
		method174("Connecting to fileserver", 10);

		if (!field216) {
			field475 = true;
			field216 = true;
			method123(this, 2);
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method45(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field272[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field367[var6][var4][var5] + field367[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field367[var6][var4][var5 + 1] + field367[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method46() {
		field113 = 0;
		int var1 = (field181.field1217 >> 7) + field191;
		int var2 = (field181.field1218 >> 7) + field192;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field113 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field113 = 1;
		}

		if (field113 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field113 = 0;
		}
	}

	@ObfuscatedName("client.a(ZLRGCGKKUR;I)V")
	public final void method47(RGCGKKUR arg0, int arg1) {
		while (arg0.field1351 + 21 < arg1 * 8) {
			int var3 = arg0.method466(14);
			if (var3 == 16383) {
				break;
			}

			if (field115[var3] == null) {
				field115[var3] = new NVHCJIOR();
			}

			NVHCJIOR var4 = field115[var3];
			field117[field116++] = var3;
			var4.field1241 = field205;
			int var5 = arg0.method466(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method466(1);
			if (var6 == 1) {
				field100[field99++] = var3;
			}

			int var7 = arg0.method466(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method466(1);
			var4.field1051 = XDDMQHDR.method585(arg0.method466(13));
			var4.field1204 = var4.field1051.field1497;
			var4.field1205 = var4.field1051.field1483;
			var4.field1237 = var4.field1051.field1491;
			var4.field1238 = var4.field1051.field1468;
			var4.field1239 = var4.field1051.field1489;
			var4.field1240 = var4.field1051.field1487;
			var4.field1234 = var4.field1051.field1495;
			var4.method419(field181.field1225[0] + var5, field181.field1226[0] + var7, var8 == 1);
		}

		arg0.method467();
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)V")
	public final void method48(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field199 = 0;
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

			field199 = 0;
			label46: for (int var7 = 0; var7 < BSBHBECI.field43; var7++) {
				BSBHBECI var8 = BSBHBECI.method22(var7);
				if (var8.field30 == -1 && var8.field55 != null) {
					String var9 = var8.field55.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field200[field199] = var9;
					field201[field199] = var7;
					field199++;
					if (field199 >= field200.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)Ljava/lang/String;")
	public final String method49() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field937 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IIIIILQUBPQDMQ;III)V")
	public final void method50(int arg0, int arg1, int arg2, int arg3, QUBPQDMQ arg4, int arg5, int arg6, int arg7) {
		if (field382) {
			field399 = 32;
		} else {
			field399 = 0;
		}

		field382 = false;
		if (arg1 >= arg3 && arg1 < arg3 + 16 && arg5 >= arg6 && arg5 < arg6 + 16) {
			arg4.field1298 -= field144 * 4;

			if (arg7 == 1) {
				field259 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field195 = true;
			}
		} else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg5 >= arg0 + arg6 - 16 && arg5 < arg0 + arg6) {
			arg4.field1298 += field144 * 4;

			if (arg7 == 1) {
				field259 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field195 = true;
			}
		} else if (arg1 >= arg3 - field399 && arg1 < arg3 + field399 + 16 && arg5 >= arg6 + 16 && arg5 < arg0 + arg6 - 16 && field144 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg5 - arg6 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg4.field1298 = (arg2 - arg0) * var10 / var11;

			if (arg7 == 1) {
				field259 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field195 = true;
			}

			field382 = true;
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method51(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method52() {
		while (true) {
			HEWLXUXO var1 = field450.method347();
			if (var1 == null) {
				return;
			}

			if (var1.field647 == 0) {
				NGYJLUVS.method289(var1.field651, var1.field648);

				if ((field450.method353(var1.field648) & 0x62) != 0) {
					field259 = true;

					if (field392 != -1 || field297 != -1) {
						field195 = true;
					}
				}
			}

			if (var1.field647 == 1 && var1.field651 != null) {
				PHDJZMLE.method425(var1.field651);
			}

			if (var1.field647 == 2 && field150 == var1.field648 && var1.field651 != null) {
				method120(var1.field651, field151);
			}

			if (var1.field647 == 3 && field387 == 1) {
				for (int var2 = 0; var2 < field419.length; var2++) {
					if (field148[var2] == var1.field648) {
						field419[var2] = var1.field651;

						if (var1.field651 == null) {
							field148[var2] = -1;
						}

						break;
					}

					if (field149[var2] == var1.field648) {
						field355[var2] = var1.field651;

						if (var1.field651 == null) {
							field149[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field647 == 93 && field450.method349(var1.field648)) {
				KPOYRTLL.method250(new RGCGKKUR(var1.field651), field450);
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method53() {
		if (field948 == 1) {
			if (field949 >= 6 && field949 <= 106 && field950 >= 467 && field950 <= 499) {
				field197 = (field197 + 1) % 4;
				field107 = true;
				field195 = true;
				field463.method444(50);
				field463.method445(field197);
				field463.method445(field294);
				field463.method445(field380);
			}

			if (field949 >= 135 && field949 <= 235 && field950 >= 467 && field950 <= 499) {
				field294 = (field294 + 1) % 3;
				field107 = true;
				field195 = true;
				field463.method444(50);
				field463.method445(field197);
				field463.method445(field294);
				field463.method445(field380);
			}

			if (field949 >= 273 && field949 <= 373 && field950 >= 467 && field950 <= 499) {
				field380 = (field380 + 1) % 3;
				field107 = true;
				field195 = true;
				field463.method444(50);
				field463.method445(field197);
				field463.method445(field294);
				field463.method445(field380);
			}

			if (field949 >= 412 && field949 <= 512 && field950 >= 467 && field950 <= 499) {
				if (field304 == -1) {
					method58();
					field213 = "";
					field491 = false;
					field75 = field304 = QUBPQDMQ.field1305;
					return;
				}

				method163("Please close the interface you have open before using 'report abuse'", 0, "");
				return;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method54() {
		int var1 = field229 * 128 + 64;
		int var2 = field230 * 128 + 64;
		int var3 = method45(var1, var2, field318) - field231;

		if (field393 < var1) {
			field393 += (var1 - field393) * field233 / 1000 + field232;
			if (field393 > var1) {
				field393 = var1;
			}
		}

		if (field393 > var1) {
			field393 -= (field393 - var1) * field233 / 1000 + field232;
			if (field393 < var1) {
				field393 = var1;
			}
		}

		if (field394 < var3) {
			field394 += (var3 - field394) * field233 / 1000 + field232;
			if (field394 > var3) {
				field394 = var3;
			}
		}

		if (field394 > var3) {
			field394 -= (field394 - var3) * field233 / 1000 + field232;
			if (field394 < var3) {
				field394 = var3;
			}
		}

		if (field395 < var2) {
			field395 += (var2 - field395) * field233 / 1000 + field232;
			if (field395 > var2) {
				field395 = var2;
			}
		}

		if (field395 > var2) {
			field395 -= (field395 - var2) * field233 / 1000 + field232;
			if (field395 < var2) {
				field395 = var2;
			}
		}

		field143++;
		if (field143 > 173) {
			field143 = 0;
			field463.method444(132);
			field463.method448(0x1123F0);
		}

		int var4 = field468 * 128 + 64;
		int var5 = field469 * 128 + 64;
		int var6 = method45(var4, var5, field318) - field470;
		int var7 = var4 - field393;
		int var8 = var6 - field394;
		int var9 = var5 - field395;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field396 < var11) {
			field396 += (var11 - field396) * field472 / 1000 + field471;
			if (field396 > var11) {
				field396 = var11;
			}
		}

		if (field396 > var11) {
			field396 -= (field396 - var11) * field472 / 1000 + field471;
			if (field396 < var11) {
				field396 = var11;
			}
		}

		int var13 = var12 - field397;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field397 += field472 * var13 / 1000 + field471;
			field397 &= 0x7FF;
		}

		if (var13 < 0) {
			field397 -= -var13 * field472 / 1000 + field471;
			field397 &= 0x7FF;
		}

		int var14 = var12 - field397;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field397 = var12;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method55() {
		try {
			int var1 = field181.field1217 + field246;
			int var2 = field181.field1218 + field285;
			if (field408 - var1 < -500 || field408 - var1 > 500 || field409 - var2 < -500 || field409 - var2 > 500) {
				field408 = var1;
				field409 = var2;
			}

			if (field408 != var1) {
				field408 += (var1 - field408) / 16;
			}

			if (field409 != var2) {
				field409 += (var2 - field409) / 16;
			}

			if (field952[1] == 1) {
				field141 += (-field141 - 24) / 2;
			} else if (field952[2] == 1) {
				field141 += (24 - field141) / 2;
			} else {
				field141 /= 2;
			}

			if (field952[3] == 1) {
				field142 += (12 - field142) / 2;
			} else if (field952[4] == 1) {
				field142 += (-field142 - 12) / 2;
			} else {
				field142 /= 2;
			}

			field140 = field141 / 2 + field140 & 0x7FF;
			field139 += field142 / 2;
			if (field139 < 128) {
				field139 = 128;
			}

			if (field139 > 383) {
				field139 = 383;
			}

			int var3 = field408 >> 7;
			int var4 = field409 >> 7;
			int var5 = method45(field408, field409, field318);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field318;
						if (var9 < 3 && (field272[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field367[var9][var7][var8];
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

			if (var11 > field206) {
				field206 += (var11 - field206) / 24;
			} else if (var11 < field206) {
				field206 += (var11 - field206) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field181.field1217 + "," + field181.field1218 + "," + field408 + "," + field409 + "," + field281 + "," + field282 + "," + field191 + "," + field192);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method56() {
		field71.method223();
		DABPNVTX.field519 = field487;
		field165.method566(0, 0);

		if (field203) {
			field290.method271(239, 0, field342, 40);
			field290.method271(239, 128, field223 + "*", 60);
		} else if (field357 == 1) {
			field290.method271(239, 0, "Enter amount:", 40);
			field290.method271(239, 128, field167 + "*", 60);
		} else if (field357 == 2) {
			field290.method271(239, 0, "Enter name:", 40);
			field290.method271(239, 128, field167 + "*", 60);
		} else if (field357 == 3) {
			if (field198 != field167) {
				method48(field167);
				field198 = field167;
			}

			MGTPXZHY var1 = field289;
			WNEQSCWL.method570(0, 77, 463, 0);

			for (int var2 = 0; var2 < field199; var2++) {
				int var3 = var2 * 14 + 18 - field202;
				if (var3 > 0 && var3 < 110) {
					var1.method271(239, 0, field200[var2], var3);
				}
			}

			WNEQSCWL.method569();

			if (field199 > 5) {
				method87(field199 * 14 + 7, 77, 463, 0, field202);
			}

			if (field167.length() == 0) {
				field290.method271(239, 255, "Enter object name", 40);
			} else if (field199 == 0) {
				field290.method271(239, 0, "No matching objects found, please shorten search", 40);
			}

			var1.method271(239, 0, field167 + "*", 90);
			WNEQSCWL.method576(0, 479, 77, 0);
		} else if (field321 != null) {
			field290.method271(239, 0, field321, 40);
			field290.method271(239, 128, "Click to continue", 60);
		} else if (field392 != -1) {
			method129(0, 0, QUBPQDMQ.method435(field392), 0);
		} else if (field297 == -1) {
			MGTPXZHY var4 = field289;
			int var5 = 0;
			WNEQSCWL.method570(0, 77, 463, 0);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field379[var6] != null) {
					int var7 = field377[var6];
					int var8 = field158 + 70 - var5 * 14;
					String var9 = field378[var6];
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
							var4.method275(0, field379[var6], var8, 4);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field197 == 0 || field197 == 1 && method90(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field316[0].method566(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field316[1].method566(var11, var8 - 12);
								var11 += 14;
							}

							var4.method275(0, var9 + ":", var8, var11);
							var11 += var4.method273(var9) + 8;
							var4.method275(255, field379[var6], var8, var11);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field254 == 0 && (var7 == 7 || field294 == 0 || field294 == 1 && method90(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method275(0, "From", var8, var12);
							int var14 = var12 + var4.method273("From ");
							if (var10 == 1) {
								field316[0].method566(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field316[1].method566(var14, var8 - 12);
								var14 += 14;
							}

							var4.method275(0, var9 + ":", var8, var14);
							var14 += var4.method273(var9) + 8;
							var4.method275(0x800000, field379[var6], var8, var14);
						}

						var5++;
					}

					if (var7 == 4 && (field380 == 0 || field380 == 1 && method90(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method275(0x800080, var9 + " " + field379[var6], var8, 4);
						}

						var5++;
					}

					if (var7 == 5 && field254 == 0 && field294 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method275(0x800000, field379[var6], var8, 4);
						}

						var5++;
					}

					if (var7 == 6 && field254 == 0 && field294 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method275(0, "To " + var9 + ":", var8, 4);
							var4.method275(0x800000, field379[var6], var8, var4.method273("To " + var9) + 12);
						}

						var5++;
					}

					if (var7 == 8 && (field380 == 0 || field380 == 1 && method90(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method275(0x7E3200, var9 + " " + field379[var6], var8, 4);
						}

						var5++;
					}
				}
			}

			WNEQSCWL.method569();
			field309 = var5 * 14 + 7;
			if (field309 < 78) {
				field309 = 78;
			}

			method87(field309, 77, 463, 0, field309 - field158 - 77);
			String var13;
			if (field181 == null || field181.field688 == null) {
				var13 = SJGLGRTK.method501(field365);
			} else {
				var13 = field181.field688;
			}

			var4.method275(0, var13 + ":", 90, 4);
			var4.method275(255, field315 + "*", 90, var4.method273(var13 + ": ") + 6);
			WNEQSCWL.method576(0, 479, 77, 0);
		} else {
			method129(0, 0, QUBPQDMQ.method435(field297), 0);
		}

		if (field467 && field432 == 2) {
			method155();
		}

		field71.method224(field934, 357, 17);
		field70.method223();
		DABPNVTX.field519 = field489;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method57() {
		if (field364 > 0) {
			method94();
		} else {
			method95("Please wait - attempting to reestablish", "Connection lost");
			field136 = 0;
			field401 = 0;
			THBLNINF var1 = field295;
			field162 = false;
			field440 = 0;
			method147(field365, field366, true);

			if (!field162) {
				method94();
			}

			try {
				var1.method506();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method58() {
		field463.method444(245);

		if (field161 != -1) {
			method39(field161);
			field161 = -1;
			field259 = true;
			field112 = false;
			field374 = true;
		}

		if (field392 != -1) {
			method39(field392);
			field392 = -1;
			field195 = true;
			field112 = false;
		}

		if (field350 != -1) {
			method39(field350);
			field350 = -1;
			field338 = true;
		}

		if (field72 != -1) {
			method39(field72);
			field72 = -1;
		}

		if (field304 != -1) {
			method39(field304);
			field304 = -1;
		}
	}

	@ObfuscatedName("client.p(I)Z")
	public final boolean method59() {
		if (field295 == null) {
			return false;
		}

		try {
			int var1 = field295.method508();
			if (var1 == 0) {
				return false;
			}

			if (field361 == -1) {
				field295.method509(field347.field1349, 0, 1);
				field361 = field347.field1349[0] & 0xFF;
				if (field479 != null) {
					field361 = field361 - field479.method236() & 0xFF;
				}

				field360 = JUQMNFXB.field740[field361];
				var1--;
			}

			if (field360 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field295.method509(field347.field1349, 0, 1);
				field360 = field347.field1349[0] & 0xFF;
				var1--;
			}

			if (field360 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field295.method509(field347.field1349, 0, 2);
				field347.field1350 = 0;
				field360 = field347.method457();
				var1 -= 2;
			}

			if (var1 < field360) {
				return false;
			}

			field347.field1350 = 0;
			field295.method509(field347.field1349, 0, field360);
			field362 = 0;
			field177 = field176;
			field176 = field175;
			field175 = field361;

			if (field361 == 228) {
				field203 = false;
				field357 = 2;
				field167 = "";
				field195 = true;
				field361 = -1;
				return true;
			}

			if (field361 == 25) {
				field203 = false;
				field357 = 1;
				field167 = "";
				field195 = true;
				field361 = -1;
				return true;
			}

			if (field361 == 141) {
				field259 = true;
				int var2 = field347.method457();
				QUBPQDMQ var3 = QUBPQDMQ.method435(var2);
				int var4 = field347.method457();
				for (int var5 = 0; var5 < var4; var5++) {
					int var6 = field347.method455();
					if (var6 == 255) {
						var6 = field347.method490();
					}

					var3.field1301[var5] = field347.method457();
					var3.field1292[var5] = var6;
				}

				for (int var7 = var4; var7 < var3.field1301.length; var7++) {
					var3.field1301[var7] = 0;
					var3.field1292[var7] = 0;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 169) {
				field485 = field347.method473();
				field486 = field347.method455();
				for (int var8 = field485; var8 < field485 + 8; var8++) {
					for (int var9 = field486; var9 < field486 + 8; var9++) {
						if (field160[field318][var8][var9] != null) {
							field160[field318][var8][var9] = null;
							method126(var8, var9);
						}
					}
				}

				for (HHSKUOEZ var10 = (HHSKUOEZ) field196.method33(); var10 != null; var10 = (HHSKUOEZ) field196.method35()) {
					if (var10.field657 >= field485 && var10.field657 < field485 + 8 && var10.field658 >= field486 && var10.field658 < field486 + 8 && field318 == var10.field655) {
						var10.field659 = 0;
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 156) {
				field77 = true;
				field229 = field347.method455();
				field230 = field347.method455();
				field231 = field347.method457();
				field232 = field347.method455();
				field233 = field347.method455();
				if (field233 >= 100) {
					field393 = field229 * 128 + 64;
					field395 = field230 * 128 + 64;
					field394 = method45(field393, field395, field318) - field231;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 121 || field361 == 30) {
				int var11 = field281;
				int var12 = field282;
				if (field361 == 121) {
					var12 = field347.method481();
					var11 = field347.method482();
					field293 = false;
				}

				if (field361 == 30) {
					field347.method465();

					for (int var13 = 0; var13 < 4; var13++) {
						for (int var14 = 0; var14 < 13; var14++) {
							for (int var15 = 0; var15 < 13; var15++) {
								int var16 = field347.method466(1);
								if (var16 == 1) {
									field257[var13][var14][var15] = field347.method466(26);
								} else {
									field257[var13][var14][var15] = -1;
								}
							}
						}
					}

					field347.method467();
					var12 = field347.method457();
					var11 = field347.method481();
					field293 = true;
				}

				if (field281 == var11 && field282 == var12 && field387 == 2) {
					field361 = -1;
					return true;
				}

				field281 = var11;
				field282 = var12;
				field191 = (field281 - 6) * 8;
				field192 = (field282 - 6) * 8;
				field345 = false;
				if ((field281 / 8 == 48 || field281 / 8 == 49) && field282 / 8 == 48) {
					field345 = true;
				}

				if (field281 / 8 == 48 && field282 / 8 == 148) {
					field345 = true;
				}

				field387 = 1;
				field249 = System.currentTimeMillis();
				method95(null, "Loading - please wait.");

				if (field361 == 121) {
					int var17 = 0;
					for (int var18 = (field281 - 6) / 8; var18 <= (field281 + 6) / 8; var18++) {
						for (int var19 = (field282 - 6) / 8; var19 <= (field282 + 6) / 8; var19++) {
							var17++;
						}
					}

					field419 = new byte[var17][];
					field355 = new byte[var17][];
					field147 = new int[var17];
					field148 = new int[var17];
					field149 = new int[var17];
					int var20 = 0;
					for (int var21 = (field281 - 6) / 8; var21 <= (field281 + 6) / 8; var21++) {
						for (int var22 = (field282 - 6) / 8; var22 <= (field282 + 6) / 8; var22++) {
							field147[var20] = (var21 << 8) + var22;

							if (field345 && (var22 == 49 || var22 == 149 || var22 == 147 || var21 == 50 || var21 == 49 && var22 == 47)) {
								field148[var20] = -1;
								field149[var20] = -1;
								var20++;
							} else {
								int var23 = field148[var20] = field450.method352(var22, var21, 0);
								if (var23 != -1) {
									field450.method337(3, var23);
								}

								int var24 = field149[var20] = field450.method352(var22, var21, 1);
								if (var24 != -1) {
									field450.method337(3, var24);
								}

								var20++;
							}
						}
					}
				}

				if (field361 == 30) {
					int var25 = 0;
					int[] var26 = new int[676];
					for (int var27 = 0; var27 < 4; var27++) {
						for (int var28 = 0; var28 < 13; var28++) {
							for (int var29 = 0; var29 < 13; var29++) {
								int var30 = field257[var27][var28][var29];
								if (var30 != -1) {
									int var31 = var30 >> 14 & 0x3FF;
									int var32 = var30 >> 3 & 0x7FF;
									int var33 = (var31 / 8 << 8) + var32 / 8;
									for (int var34 = 0; var34 < var25; var34++) {
										if (var26[var34] == var33) {
											var33 = -1;
											break;
										}
									}

									if (var33 != -1) {
										var26[var25++] = var33;
									}
								}
							}
						}
					}

					field419 = new byte[var25][];
					field355 = new byte[var25][];
					field147 = new int[var25];
					field148 = new int[var25];
					field149 = new int[var25];
					for (int var35 = 0; var35 < var25; var35++) {
						int var36 = field147[var35] = var26[var35];
						int var37 = var36 >> 8 & 0xFF;
						int var38 = var36 & 0xFF;
						int var39 = field148[var35] = field450.method352(var38, var37, 0);
						if (var39 != -1) {
							field450.method337(3, var39);
						}

						int var40 = field149[var35] = field450.method352(var38, var37, 1);
						if (var40 != -1) {
							field450.method337(3, var40);
						}
					}
				}

				int var41 = field191 - field193;
				int var42 = field192 - field194;
				field193 = field191;
				field194 = field192;

				for (int var43 = 0; var43 < 16384; var43++) {
					NVHCJIOR var44 = field115[var43];
					if (var44 != null) {
						for (int var45 = 0; var45 < 10; var45++) {
							var44.field1225[var45] -= var41;
							var44.field1226[var45] -= var42;
						}

						var44.field1217 -= var41 * 128;
						var44.field1218 -= var42 * 128;
					}
				}

				for (int var46 = 0; var46 < field94; var46++) {
					IGCQCHAY var47 = field96[var46];
					if (var47 != null) {
						for (int var48 = 0; var48 < 10; var48++) {
							var47.field1225[var48] -= var41;
							var47.field1226[var48] -= var42;
						}

						var47.field1217 -= var41 * 128;
						var47.field1218 -= var42 * 128;
					}
				}

				field352 = true;
				byte var49 = 0;
				byte var50 = 104;
				byte var51 = 1;
				if (var41 < 0) {
					var49 = 103;
					var50 = -1;
					var51 = -1;
				}

				byte var52 = 0;
				byte var53 = 104;
				byte var54 = 1;
				if (var42 < 0) {
					var52 = 103;
					var53 = -1;
					var54 = -1;
				}

				for (int var55 = var49; var55 != var50; var55 += var51) {
					for (int var56 = var52; var56 != var53; var56 += var54) {
						int var57 = var41 + var55;
						int var58 = var42 + var56;
						for (int var59 = 0; var59 < 4; var59++) {
							if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
								field160[var59][var55][var56] = field160[var59][var57][var58];
							} else {
								field160[var59][var55][var56] = null;
							}
						}
					}
				}

				for (HHSKUOEZ var60 = (HHSKUOEZ) field196.method33(); var60 != null; var60 = (HHSKUOEZ) field196.method35()) {
					var60.field657 -= var41;
					var60.field658 -= var42;
					if (var60.field657 < 0 || var60.field658 < 0 || var60.field657 >= 104 || var60.field658 >= 104) {
						var60.method505();
					}
				}

				if (field401 != 0) {
					field401 -= var41;
					field402 -= var42;
				}

				field77 = false;
				field361 = -1;
				return true;
			}

			if (field361 == 163) {
				int var61 = field347.method457();
				int var62 = field347.method475();

				if (var61 == 0xFFFF) {
					var61 = -1;
				}

				if (field498[var62] != var61) {
					method39(field498[var62]);
					field498[var62] = var61;
				}

				field259 = true;
				field374 = true;
				field361 = -1;
				return true;
			}

			if (field361 == 166) {
				method133(field360, field347);
				field352 = false;
				field361 = -1;
				return true;
			}

			if (field361 == 193) {
				int var63 = field347.method485();
				int var64 = field347.method482();
				QUBPQDMQ var65 = QUBPQDMQ.method435(var64);
				if (var65.field1279 != var63 || var63 == -1) {
					var65.field1279 = var63;
					var65.field1336 = 0;
					var65.field1278 = 0;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 36) {
				field339 = field347.method455();
				if (field339 == 1) {
					field106 = field347.method457();
				}

				if (field339 >= 2 && field339 <= 6) {
					if (field339 == 2) {
						field326 = 64;
						field327 = 64;
					}

					if (field339 == 3) {
						field326 = 0;
						field327 = 64;
					}

					if (field339 == 4) {
						field326 = 128;
						field327 = 64;
					}

					if (field339 == 5) {
						field326 = 64;
						field327 = 0;
					}

					if (field339 == 6) {
						field326 = 64;
						field327 = 128;
					}

					field339 = 2;
					field323 = field347.method457();
					field324 = field347.method457();
					field325 = field347.method455();
				}

				if (field339 == 10) {
					field217 = field347.method457();
				}

				field361 = -1;
				return true;
			}

			if (field361 == 107) {
				int var66 = field347.method481();
				QUBPQDMQ var67 = QUBPQDMQ.method435(var66);
				for (int var68 = 0; var68 < var67.field1301.length; var68++) {
					var67.field1301[var68] = -1;
					var67.field1301[var68] = 0;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 232) {
				field507 = field347.method455();
				field361 = -1;
				return true;
			}

			if (field361 == 235) {
				int var69 = field347.method482();
				int var70 = field347.method457();

				if (field392 != -1) {
					method39(field392);
					field392 = -1;
					field195 = true;
				}

				if (field350 != -1) {
					method39(field350);
					field350 = -1;
					field338 = true;
				}

				if (field72 != -1) {
					method39(field72);
					field72 = -1;
				}

				if (field304 != var70) {
					method39(field304);
					field304 = var70;
				}

				if (field161 != var69) {
					method39(field161);
					field161 = var69;
				}

				if (field357 != 0) {
					field357 = 0;
					field195 = true;
				}

				field259 = true;
				field374 = true;
				field112 = false;
				field361 = -1;
				return true;
			}

			if (field361 == 251) {
				byte var71 = field347.method456();
				int var72 = field347.method483();
				field93[var72] = var71;

				if (field154[var72] != var71) {
					field154[var72] = var71;
					method124(var72);
					field259 = true;

					if (field297 != -1) {
						field195 = true;
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 34) {
				int var73 = field347.method481();
				QUBPQDMQ.method435(var73).field1324 = 3;

				if (field181.field690 == null) {
					QUBPQDMQ.method435(var73).field1325 = (field181.field694[11] << 5) + (field181.field694[8] << 10) + (field181.field694[0] << 15) + (field181.field681[0] << 25) + (field181.field681[4] << 20) + field181.field694[1];
				} else {
					QUBPQDMQ.method435(var73).field1325 = (int) (field181.field690.field1463 + 0x12345678L);
				}

				field361 = -1;
				return true;
			}

			if (field361 == 154) {
				if (field464 == 12) {
					field259 = true;
				}

				field340 = field347.method458();
				field361 = -1;
				return true;
			}

			if (field361 == 26) {
				String var74 = field347.method462();
				int var75 = field347.method475();
				int var76 = field347.method474();
				if (var76 >= 1 && var76 <= 5) {
					if (var74.equalsIgnoreCase("null")) {
						var74 = null;
					}

					field184[var76 - 1] = var74;
					field185[var76 - 1] = var75 == 0;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 52) {
				field356 = field360 / 8;
				for (int var77 = 0; var77 < field356; var77++) {
					field102[var77] = field347.method461();
				}

				field361 = -1;
				return true;
			}

			if (field361 == 151) {
				int var78 = field347.method457();
				int var79 = field347.method457();
				int var80 = var78 >> 10 & 0x1F;
				int var81 = var78 >> 5 & 0x1F;
				int var82 = var78 & 0x1F;
				QUBPQDMQ.method435(var79).field1284 = (var82 << 3) + (var80 << 19) + (var81 << 11);
				field361 = -1;
				return true;
			}

			if (field361 == 18) {
				int var83 = field347.method482();
				int var84 = field347.method483();
				QUBPQDMQ.method435(var83).field1324 = 2;
				QUBPQDMQ.method435(var83).field1325 = var84;
				field361 = -1;
				return true;
			}

			if (field361 == 146) {
				field413 = field347.method455();
				field457 = field347.method483();
				field361 = -1;
				return true;
			}

			if (field361 == 152) {
				field464 = field347.method455();
				field259 = true;
				field374 = true;
				field361 = -1;
				return true;
			}

			if (field361 == 31) {
				String var85 = field347.method462();
				if (var85.endsWith(":tradereq:")) {
					String var86 = var85.substring(0, var85.indexOf(":"));
					long var87 = SJGLGRTK.method497(var86);
					boolean var89 = false;
					for (int var90 = 0; var90 < field356; var90++) {
						if (field102[var90] == var87) {
							var89 = true;
							break;
						}
					}

					if (!var89 && field113 == 0) {
						method163("wishes to trade with you.", 4, var86);
					}
				} else if (var85.endsWith(":duelreq:")) {
					String var91 = var85.substring(0, var85.indexOf(":"));
					long var92 = SJGLGRTK.method497(var91);
					boolean var94 = false;
					for (int var95 = 0; var95 < field356; var95++) {
						if (field102[var95] == var92) {
							var94 = true;
							break;
						}
					}

					if (!var94 && field113 == 0) {
						method163("wishes to duel with you.", 8, var91);
					}
				} else if (var85.endsWith(":chalreq:")) {
					String var96 = var85.substring(0, var85.indexOf(":"));
					long var97 = SJGLGRTK.method497(var96);
					boolean var99 = false;
					for (int var100 = 0; var100 < field356; var100++) {
						if (field102[var100] == var97) {
							var99 = true;
							break;
						}
					}

					if (!var99 && field113 == 0) {
						String var101 = var85.substring(var85.indexOf(":") + 1, var85.length() - 9);
						method163(var101, 8, var96);
					}
				} else {
					method163(var85, 0, "");
				}

				field361 = -1;
				return true;
			}

			if (field361 == 161) {
				method94();
				field361 = -1;
				return false;
			}

			if (field361 == 110) {
				int var102 = field347.method483();
				int var103 = field347.method457();
				QUBPQDMQ var104 = QUBPQDMQ.method435(var103);
				if (var104 != null && var104.field1326 == 0) {
					if (var102 < 0) {
						var102 = 0;
					}

					if (var102 > var104.field1296 - var104.field1299) {
						var102 = var104.field1296 - var104.field1299;
					}

					var104.field1298 = var102;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 85) {
				int var105 = field347.method457();
				int var106 = field347.method482();
				int var107 = field347.method482();
				int var108 = field347.method457();
				QUBPQDMQ.method435(var105).field1307 = var106;
				QUBPQDMQ.method435(var105).field1308 = var107;
				QUBPQDMQ.method435(var105).field1306 = var108;
				field361 = -1;
				return true;
			}

			if (field361 == 4) {
				int var109 = field347.method457();
				if (var109 == 0xFFFF) {
					var109 = -1;
				}

				if (field211 != var109 && field138 && !field245 && field348 == 0) {
					field150 = var109;
					field151 = true;
					field450.method337(2, field150);
				}

				field211 = var109;
				field361 = -1;
				return true;
			}

			if (field361 == 233) {
				int var110 = field347.method486();
				int var111 = field347.method457();
				if (field138 && !field245) {
					field150 = var111;
					field151 = false;
					field450.method337(2, field150);
					field348 = var110;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 102) {
				field485 = field347.method474();
				field486 = field347.method475();
				field361 = -1;
				return true;
			}

			if (field361 == 97) {
				long var112 = field347.method461();
				int var114 = field347.method460();
				int var115 = field347.method455();
				boolean var116 = false;
				for (int var117 = 0; var117 < 100; var117++) {
					if (field460[var117] == var114) {
						var116 = true;
						break;
					}
				}

				if (var115 <= 1) {
					for (int var118 = 0; var118 < field356; var118++) {
						if (field102[var118] == var112) {
							var116 = true;
							break;
						}
					}
				}

				if (!var116 && field113 == 0) {
					try {
						field460[field458] = var114;
						field458 = (field458 + 1) % 100;
						String var119 = ZRHRGDTH.method588(field347, field360 - 13);
						if (var115 != 3) {
							var119 = UCQYJOHJ.method524(var119);
						}

						if (var115 == 2 || var115 == 3) {
							method163(var119, 7, "@cr2@" + SJGLGRTK.method501(SJGLGRTK.method498(var112)));
						} else if (var115 == 1) {
							method163(var119, 7, "@cr1@" + SJGLGRTK.method501(SJGLGRTK.method498(var112)));
						} else {
							method163(var119, 3, SJGLGRTK.method501(SJGLGRTK.method498(var112)));
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 119) {
				int var121 = field347.method455();
				int var122 = field347.method455();
				int var123 = field347.method455();
				int var124 = field347.method455();
				field218[var121] = true;
				field480[var121] = var122;
				field157[var121] = var123;
				field152[var121] = var124;
				field280[var121] = 0;
				field361 = -1;
				return true;
			}

			if (field361 == 69 || field361 == 194 || field361 == 1 || field361 == 173 || field361 == 137 || field361 == 100 || field361 == 220 || field361 == 51 || field361 == 128 || field361 == 57 || field361 == 241) {
				method131(field347, field361);
				field361 = -1;
				return true;
			}

			if (field361 == 124) {
				int var125 = field347.method483();
				method173(var125);

				if (field161 != -1) {
					method39(field161);
					field161 = -1;
					field259 = true;
					field374 = true;
				}

				if (field350 != -1) {
					method39(field350);
					field350 = -1;
					field338 = true;
				}

				if (field72 != -1) {
					method39(field72);
					field72 = -1;
				}

				if (field304 != -1) {
					method39(field304);
					field304 = -1;
				}

				if (field392 != var125) {
					method39(field392);
					field392 = var125;
				}

				field112 = false;
				field195 = true;
				field361 = -1;
				return true;
			}

			if (field361 == 200) {
				field259 = true;
				int var126 = field347.method474();
				int var127 = field347.method475();
				int var128 = field347.method488();
				field287[var126] = var128;
				field301[var126] = var127;
				field224[var126] = 1;
				for (int var129 = 0; var129 < 98; var129++) {
					if (var128 >= field389[var129]) {
						field224[var126] = var129 + 2;
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 217) {
				int var130 = field347.method485();
				if (var130 >= 0) {
					method173(var130);
				}

				if (field319 != var130) {
					method39(field319);
					field319 = var130;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 174) {
				for (int var131 = 0; var131 < field154.length; var131++) {
					if (field93[var131] != field154[var131]) {
						field154[var131] = field93[var131];
						method124(var131);
						field259 = true;
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 236) {
				field219 = field347.method473();
				if (field464 == field219) {
					if (field219 == 3) {
						field464 = 1;
					} else {
						field464 = 3;
					}

					field259 = true;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 208) {
				method93(field360, field347);
				field361 = -1;
				return true;
			}

			if (field361 == 136) {
				field485 = field347.method455();
				field486 = field347.method475();

				while (field347.field1350 < field360) {
					int var132 = field347.method455();
					method131(field347, var132);
				}

				field361 = -1;
				return true;
			}

			if (field361 == 120) {
				int var133 = field347.method457();
				boolean var134 = field347.method475() == 1;
				QUBPQDMQ.method435(var133).field1302 = var134;
				field361 = -1;
				return true;
			}

			if (field361 == 167) {
				int var135 = field347.method457();
				int var136 = field347.method455();
				int var137 = field347.method457();
				if (var137 == 0xFFFF) {
					if (field183 < 50) {
						field383[field183] = (short) var135;
						field276[field183] = var136;
						field73[field183] = 0;
						field183++;
					}
				} else if (field493 && !field245 && field183 < 50) {
					field383[field183] = var135;
					field276[field183] = var136;
					field73[field183] = GRRWPPAT.field617[var135] + var137;
					field183++;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 58) {
				field77 = true;
				field468 = field347.method455();
				field469 = field347.method455();
				field470 = field347.method457();
				field471 = field347.method455();
				field472 = field347.method455();
				if (field472 >= 100) {
					int var138 = field468 * 128 + 64;
					int var139 = field469 * 128 + 64;
					int var140 = method45(var138, var139, field318) - field470;
					int var141 = var138 - field393;
					int var142 = var140 - field394;
					int var143 = var139 - field395;
					int var144 = (int) Math.sqrt(var141 * var141 + var143 * var143);
					field396 = (int) (Math.atan2(var142, var144) * 325.949D) & 0x7FF;
					field397 = (int) (Math.atan2(var141, var143) * -325.949D) & 0x7FF;

					if (field396 < 128) {
						field396 = 128;
					}

					if (field396 > 383) {
						field396 = 383;
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 132) {
				int var145 = field347.method457();
				method173(var145);

				if (field392 != -1) {
					method39(field392);
					field392 = -1;
					field195 = true;
				}

				if (field350 != -1) {
					method39(field350);
					field350 = -1;
					field338 = true;
				}

				if (field72 != -1) {
					method39(field72);
					field72 = -1;
				}

				if (field304 != -1) {
					method39(field304);
					field304 = -1;
				}

				if (field161 != var145) {
					method39(field161);
					field161 = var145;
				}

				if (field357 != 0) {
					field357 = 0;
					field195 = true;
				}

				field259 = true;
				field374 = true;
				field112 = false;
				field361 = -1;
				return true;
			}

			if (field361 == 10) {
				field417 = field347.method483() * 30;
				field361 = -1;
				return true;
			}

			if (field361 == 175) {
				int var146 = field347.method457();
				int var147 = field347.method482();
				QUBPQDMQ.method435(var146).field1324 = 1;
				QUBPQDMQ.method435(var146).field1325 = var147;
				field361 = -1;
				return true;
			}

			if (field361 == 245) {
				if (field464 == 12) {
					field259 = true;
				}

				field476 = field347.method455();
				field361 = -1;
				return true;
			}

			if (field361 == 239) {
				int var148 = field347.method457();
				String var149 = field347.method462();
				QUBPQDMQ.method435(var148).field1291 = var149;

				if (field498[field464] == QUBPQDMQ.method435(var148).field1295) {
					field259 = true;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 39) {
				field251 = field347.method482();
				field274 = field347.method482();
				field437 = field347.method481();
				field358 = field347.method457();
				field500 = field347.method482();
				field347.method483();
				field212 = field347.method488();
				field347.method457();
				field474 = field347.method483();
				field347.method481();
				field347.method474();
				signlink.dnslookup(SJGLGRTK.method500(field212));
				field361 = -1;
				return true;
			}

			if (field361 == 9) {
				int var150 = field347.method457();
				int var151 = field347.method483();
				method173(var150);

				if (var151 != -1) {
					method173(var151);
				}

				if (field304 != -1) {
					method39(field304);
					field304 = -1;
				}

				if (field161 != -1) {
					method39(field161);
					field161 = -1;
				}

				if (field392 != -1) {
					method39(field392);
					field392 = -1;
				}

				if (field350 != var150) {
					method39(field350);
					field350 = var150;
				}

				if (field72 != var150) {
					method39(field72);
					field72 = var151;
				}

				field357 = 0;
				field112 = false;
				field361 = -1;
				return true;
			}

			if (field361 == 98) {
				field197 = field347.method455();
				field294 = field347.method455();
				field380 = field347.method455();
				field107 = true;
				field195 = true;
				field361 = -1;
				return true;
			}

			if (field361 == 255) {
				int var152 = field347.method481();
				method173(var152);

				if (field161 != -1) {
					method39(field161);
					field161 = -1;
					field259 = true;
					field374 = true;
				}

				if (field392 != -1) {
					method39(field392);
					field392 = -1;
					field195 = true;
				}

				if (field350 != -1) {
					method39(field350);
					field350 = -1;
					field338 = true;
				}

				if (field72 != -1) {
					method39(field72);
					field72 = -1;
				}

				if (field304 != var152) {
					method39(field304);
					field304 = var152;
				}

				if (field357 != 0) {
					field357 = 0;
					field195 = true;
				}

				field112 = false;
				field361 = -1;
				return true;
			}

			if (field361 == 29) {
				field401 = 0;
				field361 = -1;
				return true;
			}

			if (field361 == 179) {
				for (int var153 = 0; var153 < field96.length; var153++) {
					if (field96[var153] != null) {
						field96[var153].field1211 = -1;
					}
				}

				for (int var154 = 0; var154 < field115.length; var154++) {
					if (field115[var154] != null) {
						field115[var154].field1211 = -1;
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 109) {
				int var155 = field347.method481();
				int var156 = field347.method488();
				field93[var155] = var156;

				if (field154[var155] != var156) {
					field154[var155] = var156;
					method124(var155);
					field259 = true;

					if (field297 != -1) {
						field195 = true;
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 24) {
				long var157 = field347.method461();
				int var159 = field347.method455();
				String var160 = SJGLGRTK.method501(SJGLGRTK.method498(var157));
				for (int var161 = 0; var161 < field375; var161++) {
					if (field248[var161] == var157) {
						if (field111[var161] != var159) {
							field111[var161] = var159;
							field259 = true;

							if (var159 > 0) {
								method163(var160 + " has logged in.", 5, "");
							}

							if (var159 == 0) {
								method163(var160 + " has logged out.", 5, "");
							}
						}

						var160 = null;
						break;
					}
				}

				if (var160 != null && field375 < 200) {
					field248[field375] = var157;
					field400[field375] = var160;
					field111[field375] = var159;
					field375++;
					field259 = true;
				}

				boolean var162 = false;
				while (!var162) {
					var162 = true;
					for (int var163 = 0; var163 < field375 - 1; var163++) {
						if (field111[var163] != field242 && field111[var163 + 1] == field242 || field111[var163] == 0 && field111[var163 + 1] != 0) {
							int var164 = field111[var163];
							field111[var163] = field111[var163 + 1];
							field111[var163 + 1] = var164;
							String var165 = field400[var163];
							field400[var163] = field400[var163 + 1];
							field400[var163 + 1] = var165;
							long var166 = field248[var163];
							field248[var163] = field248[var163 + 1];
							field248[var163 + 1] = var166;
							field259 = true;
							var162 = false;
						}
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 6) {
				int var168 = field347.method458();
				if (field297 != var168) {
					method39(field297);
					field297 = var168;
				}

				field195 = true;
				field361 = -1;
				return true;
			}

			if (field361 == 96) {
				field259 = true;
				int var169 = field347.method457();
				QUBPQDMQ var170 = QUBPQDMQ.method435(var169);
				while (field347.field1350 < field360) {
					int var171 = field347.method469();
					int var172 = field347.method457();
					int var173 = field347.method455();
					if (var173 == 255) {
						var173 = field347.method460();
					}

					if (var171 >= 0 && var171 < var170.field1301.length) {
						var170.field1301[var171] = var172;
						var170.field1292[var171] = var173;
					}
				}

				field361 = -1;
				return true;
			}

			if (field361 == 247) {
				int var174 = field347.method481();
				int var175 = field347.method457();
				int var176 = field347.method481();

				if (var174 == 0xFFFF) {
					QUBPQDMQ.method435(var175).field1324 = 0;
					field361 = -1;
					return true;
				}

				BSBHBECI var177 = BSBHBECI.method22(var174);
				QUBPQDMQ.method435(var175).field1324 = 4;
				QUBPQDMQ.method435(var175).field1325 = var174;
				QUBPQDMQ.method435(var175).field1307 = var177.field47;
				QUBPQDMQ.method435(var175).field1308 = var177.field61;
				QUBPQDMQ.method435(var175).field1306 = var177.field32 * 100 / var176;
				field361 = -1;
				return true;
			}

			if (field361 == 76) {
				if (field161 != -1) {
					method39(field161);
					field161 = -1;
					field259 = true;
					field374 = true;
				}

				if (field392 != -1) {
					method39(field392);
					field392 = -1;
					field195 = true;
				}

				if (field350 != -1) {
					method39(field350);
					field350 = -1;
					field338 = true;
				}

				if (field72 != -1) {
					method39(field72);
					field72 = -1;
				}

				if (field304 != -1) {
					method39(field304);
					field304 = -1;
				}

				if (field357 != 0) {
					field357 = 0;
					field195 = true;
				}

				field112 = false;
				field361 = -1;
				return true;
			}

			if (field361 == 243) {
				int var178 = field347.method457();
				int var179 = field347.method482();
				int var180 = field347.method481();
				QUBPQDMQ.method435(var179).field1323 = (var178 << 16) + var180;
				field361 = -1;
				return true;
			}

			if (field361 == 41) {
				field77 = false;

				for (int var181 = 0; var181 < 5; var181++) {
					field218[var181] = false;
				}

				field361 = -1;
				return true;
			}

			if (field361 == 64) {
				field376 = field347.method455();
				field259 = true;
				field361 = -1;
				return true;
			}

			if (field361 == 113) {
				field136 = field347.method455();
				field361 = -1;
				return true;
			}

			if (field361 == 246) {
				int var182 = field347.method484();
				int var183 = field347.method483();
				int var184 = field347.method485();
				QUBPQDMQ var185 = QUBPQDMQ.method435(var183);
				var185.field1320 = var184;
				var185.field1277 = var182;
				field361 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field361 + "," + field360 + " - " + field176 + "," + field177);
			method94();
		} catch (IOException var190) {
			method57();
		} catch (Exception var191) {
			String var187 = "T2 - " + field361 + "," + field176 + "," + field177 + " - " + field360 + "," + (field181.field1225[0] + field191) + "," + (field181.field1226[0] + field192) + " - ";
			for (int var188 = 0; var188 < field360 && var188 < 50; var188++) {
				var187 = var187 + field347.field1349[var188] + ",";
			}

			signlink.reporterror(var187);
			method94();
		}

		return true;
	}

	@ObfuscatedName("client.a(ILWGRALUSQ;)V")
	public final void method60(WGRALUSQ arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field125.length; var3++) {
			field125[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field125[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field126[var9] = (field125[var9 - 1] + field125[var9 + 1] + field125[var9 - 128] + field125[var9 + 128]) / 4;
				}
			}

			int[] var10 = field125;
			field125 = field126;
			field126 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1447; var12++) {
				for (int var13 = 0; var13 < arg0.field1446; var13++) {
					if (arg0.field1444[var11++] != 0) {
						int var14 = var13 + arg0.field1448 + 16;
						int var15 = var12 + arg0.field1449 + 16;
						int var16 = (var15 << 7) + var14;
						field125[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLQUBPQDMQ;)I")
	public final int method61(int arg0, QUBPQDMQ arg1) {
		if (arg1.field1341 == null || arg0 >= arg1.field1341.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1341[arg0];
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
					var8 = field301[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field224[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field287[var3[var5++]];
				}

				if (var7 == 4) {
					QUBPQDMQ var10 = QUBPQDMQ.method435(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < BSBHBECI.field43 && (!BSBHBECI.method22(var11).field17 || field244)) {
						for (int var12 = 0; var12 < var10.field1301.length; var12++) {
							if (var11 + 1 == var10.field1301[var12]) {
								var8 += var10.field1292[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field154[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field389[field224[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field154[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field181.field700;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < SSXUEZGZ.field1379; var13++) {
						if (SSXUEZGZ.field1381[var13]) {
							var8 += field224[var13];
						}
					}
				}

				if (var7 == 10) {
					QUBPQDMQ var14 = QUBPQDMQ.method435(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < BSBHBECI.field43 && (!BSBHBECI.method22(var15).field17 || field244)) {
						for (int var16 = 0; var16 < var14.field1301.length; var16++) {
							if (var14.field1301[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field476;
				}

				if (var7 == 12) {
					var8 = field340;
				}

				if (var7 == 13) {
					int var17 = field154[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					DPQEBGAZ var20 = DPQEBGAZ.field532[var19];
					int var21 = var20.field534;
					int var22 = var20.field535;
					int var23 = var20.field536;
					int var24 = field103[var23 - var22];
					var8 = field154[var21] >> var22 & var24;
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
					var8 = (field181.field1217 >> 7) + field191;
				}

				if (var7 == 19) {
					var8 = (field181.field1218 >> 7) + field192;
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

	@ObfuscatedName("client.q(I)V")
	public final void method62() {
		byte[] var1 = field273.method205("title.dat", null);
		ZSWNSCUQ var2 = new ZSWNSCUQ(var1, this);
		field266.method223();
		var2.method594(0, 0);
		field267.method223();
		var2.method594(-637, 0);
		field263.method223();
		var2.method594(-128, 0);
		field264.method223();
		var2.method594(-202, -371);
		field265.method223();
		var2.method594(-202, -171);
		field268.method223();
		var2.method594(0, -265);
		field269.method223();
		var2.method594(-562, -265);
		field270.method223();
		var2.method594(-128, -171);
		field271.method223();
		var2.method594(-562, -171);
		int[] var3 = new int[var2.field1512];
		for (int var4 = 0; var4 < var2.field1513; var4++) {
			for (int var5 = 0; var5 < var2.field1512; var5++) {
				var3[var5] = var2.field1511[var2.field1512 * var4 + var2.field1512 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1512; var6++) {
				var2.field1511[var2.field1512 * var4 + var6] = var3[var6];
			}
		}

		field266.method223();
		var2.method594(382, 0);
		field267.method223();
		var2.method594(-255, 0);
		field263.method223();
		var2.method594(254, 0);
		field264.method223();
		var2.method594(180, -371);
		field265.method223();
		var2.method594(180, -171);
		field268.method223();
		var2.method594(382, -265);
		field269.method223();
		var2.method594(-180, -265);
		field270.method223();
		var2.method594(254, -171);
		field271.method223();
		var2.method594(-180, -171);
		ZSWNSCUQ var7 = new ZSWNSCUQ(field273, "logo", 0);
		field263.method223();
		var7.method596(382 - var7.field1512 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method63(int arg0) {
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

	@ObfuscatedName("client.a(LRGCGKKUR;IB)V")
	public final void method64(RGCGKKUR arg0, int arg1) {
		for (int var3 = 0; var3 < field99; var3++) {
			int var4 = field100[var3];
			NVHCJIOR var5 = field115[var4];
			int var6 = arg0.method455();
			if ((var6 & 0x40) != 0) {
				var5.field1242 = arg0.method483();
				var5.field1243 = arg0.method481();
			}

			if ((var6 & 0x10) != 0) {
				int var7 = arg0.method455();
				int var8 = arg0.method475();
				var5.method421(field205, var7, var8);
				var5.field1190 = field205 + 300;
				var5.field1191 = arg0.method455();
				var5.field1192 = arg0.method475();
			}

			if ((var6 & 0x4) != 0) {
				var5.field1051 = XDDMQHDR.method585(arg0.method481());
				var5.field1204 = var5.field1051.field1497;
				var5.field1205 = var5.field1051.field1483;
				var5.field1237 = var5.field1051.field1491;
				var5.field1238 = var5.field1051.field1468;
				var5.field1239 = var5.field1051.field1489;
				var5.field1240 = var5.field1051.field1487;
				var5.field1234 = var5.field1051.field1495;
			}

			if ((var6 & 0x80) != 0) {
				var5.field1216 = arg0.method457();
				if (var5.field1216 == 0xFFFF) {
					var5.field1216 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				int var9 = arg0.method481();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				int var10 = arg0.method474();
				if (var5.field1211 == var9 && var9 != -1) {
					int var11 = KAIFCIAJ.field742[var9].field756;
					if (var11 == 1) {
						var5.field1212 = 0;
						var5.field1213 = 0;
						var5.field1214 = var10;
						var5.field1215 = 0;
					}

					if (var11 == 2) {
						var5.field1215 = 0;
					}
				} else if (var9 == -1 || var5.field1211 == -1 || KAIFCIAJ.field742[var9].field750 >= KAIFCIAJ.field742[var5.field1211].field750) {
					var5.field1211 = var9;
					var5.field1212 = 0;
					var5.field1213 = 0;
					var5.field1214 = var10;
					var5.field1215 = 0;
					var5.field1210 = var5.field1200;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.field1201 = arg0.method462();
				var5.field1224 = 100;
			}

			if ((var6 & 0x2) != 0) {
				int var12 = arg0.method475();
				int var13 = arg0.method455();
				var5.method421(field205, var12, var13);
				var5.field1190 = field205 + 300;
				var5.field1191 = arg0.method474();
				var5.field1192 = arg0.method475();
			}

			if ((var6 & 0x20) != 0) {
				var5.field1193 = arg0.method481();
				int var14 = arg0.method489();
				var5.field1197 = var14 >> 16;
				var5.field1196 = (var14 & 0xFFFF) + field205;
				var5.field1194 = 0;
				var5.field1195 = 0;

				if (var5.field1196 > field205) {
					var5.field1194 = -1;
				}

				if (var5.field1193 == 0xFFFF) {
					var5.field1193 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method65() {
		if (field503 == 0) {
			field173[0] = "Cancel";
			field313[0] = 1033;
			field118 = 1;
			if (field350 == -1) {
				method66();
				field371 = 0;
				field189 = 0;

				if (field942 > 4 && field943 > 4 && field942 < 516 && field943 < 338) {
					if (field304 == -1) {
						method167();
					} else {
						method169(field943, 4, 0, 4, 0, field942, QUBPQDMQ.method435(field304));
					}
				}

				if (field371 != field119) {
					field119 = field371;
				}

				if (field333 != field189) {
					field333 = field189;
				}

				field371 = 0;
				field189 = 0;

				if (field942 > 553 && field943 > 205 && field942 < 743 && field943 < 466) {
					if (field161 != -1) {
						method169(field943, 553, 0, 205, 1, field942, QUBPQDMQ.method435(field161));
					} else if (field498[field464] != -1) {
						method169(field943, 553, 0, 205, 1, field942, QUBPQDMQ.method435(field498[field464]));
					}
				}

				if (field371 != field334) {
					field259 = true;
					field334 = field371;
				}

				if (field438 != field189) {
					field259 = true;
					field438 = field189;
				}

				field371 = 0;
				field189 = 0;

				if (field942 > 17 && field943 > 357 && field942 < 496 && field943 < 453) {
					if (field392 != -1) {
						method169(field943, 17, 0, 357, 2, field942, QUBPQDMQ.method435(field392));
					} else if (field297 != -1) {
						method169(field943, 17, 0, 357, 3, field942, QUBPQDMQ.method435(field297));
					} else if (field943 < 434 && field942 < 426 && field357 == 0) {
						method104(field943 - 357, field942 - 17);
					}
				}

				if ((field392 != -1 || field297 != -1) && field371 != field343) {
					field195 = true;
					field343 = field371;
				}

				if ((field392 != -1 || field297 != -1) && field442 != field189) {
					field195 = true;
					field442 = field189;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field118 - 1; var2++) {
						if (field313[var2] < 1000 && field313[var2 + 1] > 1000) {
							String var3 = field173[var2];
							field173[var2] = field173[var2 + 1];
							field173[var2 + 1] = var3;
							int var4 = field313[var2];
							field313[var2] = field313[var2 + 1];
							field313[var2 + 1] = var4;
							int var5 = field311[var2];
							field311[var2] = field311[var2 + 1];
							field311[var2 + 1] = var5;
							int var6 = field312[var2];
							field312[var2] = field312[var2 + 1];
							field312[var2 + 1] = var6;
							int var7 = field314[var2];
							field314[var2] = field314[var2 + 1];
							field314[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field371 = 0;
				field189 = 0;
				method169(field943, 0, 0, 0, 0, field942, QUBPQDMQ.method435(field350));

				if (field371 != field119) {
					field119 = field371;
				}

				if (field333 != field189) {
					field333 = field189;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method66() {
		if (field254 != 0) {
			int var1 = 0;
			if (field417 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field379[var2] != null) {
					int var3 = field377[var2];
					String var4 = field378[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field294 == 0 || field294 == 1 && method90(var4))) {
						int var8 = 329 - var1 * 13;
						if (field942 > 4 && field943 - 4 > var8 - 10 && field943 - 4 <= var8 + 3) {
							int var9 = field289.method273("From:  " + var4 + field379[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field942 < var9 + 4) {
								if (field344 >= 1) {
									field173[field118] = "Report abuse @whi@" + var4;
									field313[field118] = 2541;
									field118++;
								}

								field173[field118] = "Add ignore @whi@" + var4;
								field313[field118] = 2997;
								field118++;
								field173[field118] = "Add friend @whi@" + var4;
								field313[field118] = 2138;
								field118++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field294 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method67() {
		for (int var1 = 0; var1 < field116; var1++) {
			int var2 = field117[var1];
			NVHCJIOR var3 = field115[var2];
			if (var3 != null) {
				method68(var3.field1051.field1497, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILOZYWPVDM;I)V")
	public final void method68(int arg0, OZYWPVDM arg1) {
		if (arg1.field1217 < 128 || arg1.field1218 < 128 || arg1.field1217 >= 13184 || arg1.field1218 >= 13184) {
			arg1.field1211 = -1;
			arg1.field1193 = -1;
			arg1.field1231 = 0;
			arg1.field1232 = 0;
			arg1.field1217 = arg1.field1225[0] * 128 + arg1.field1204 * 64;
			arg1.field1218 = arg1.field1226[0] * 128 + arg1.field1204 * 64;
			arg1.method422();
		}

		if (field181 == arg1 && (arg1.field1217 < 1536 || arg1.field1218 < 1536 || arg1.field1217 >= 11776 || arg1.field1218 >= 11776)) {
			arg1.field1211 = -1;
			arg1.field1193 = -1;
			arg1.field1231 = 0;
			arg1.field1232 = 0;
			arg1.field1217 = arg1.field1225[0] * 128 + arg1.field1204 * 64;
			arg1.field1218 = arg1.field1226[0] * 128 + arg1.field1204 * 64;
			arg1.method422();
		}

		if (arg1.field1231 > field205) {
			method69(arg1);
		} else if (arg1.field1232 >= field205) {
			method70(arg1);
		} else {
			method71(arg1);
		}

		method72(arg1);
		method73(arg1);
	}

	@ObfuscatedName("client.a(ZLOZYWPVDM;)V")
	public final void method69(OZYWPVDM arg0) {
		int var2 = arg0.field1231 - field205;
		int var3 = arg0.field1227 * 128 + arg0.field1204 * 64;
		int var4 = arg0.field1229 * 128 + arg0.field1204 * 64;
		arg0.field1217 += (var3 - arg0.field1217) / var2;
		arg0.field1218 += (var4 - arg0.field1218) / var2;
		arg0.field1198 = 0;

		if (arg0.field1233 == 0) {
			arg0.field1223 = 1024;
		}

		if (arg0.field1233 == 1) {
			arg0.field1223 = 1536;
		}

		if (arg0.field1233 == 2) {
			arg0.field1223 = 0;
		}

		if (arg0.field1233 == 3) {
			arg0.field1223 = 512;
		}
	}

	@ObfuscatedName("client.a(BLOZYWPVDM;)V")
	public final void method70(OZYWPVDM arg0) {
		if (field205 == arg0.field1232 || arg0.field1211 == -1 || arg0.field1214 != 0 || arg0.field1213 + 1 > KAIFCIAJ.field742[arg0.field1211].method240(arg0.field1212)) {
			int var2 = arg0.field1232 - arg0.field1231;
			int var3 = field205 - arg0.field1231;
			int var4 = arg0.field1227 * 128 + arg0.field1204 * 64;
			int var5 = arg0.field1229 * 128 + arg0.field1204 * 64;
			int var6 = arg0.field1228 * 128 + arg0.field1204 * 64;
			int var7 = arg0.field1230 * 128 + arg0.field1204 * 64;
			arg0.field1217 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1218 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1198 = 0;

		if (arg0.field1233 == 0) {
			arg0.field1223 = 1024;
		}

		if (arg0.field1233 == 1) {
			arg0.field1223 = 1536;
		}

		if (arg0.field1233 == 2) {
			arg0.field1223 = 0;
		}

		if (arg0.field1233 == 3) {
			arg0.field1223 = 512;
		}

		arg0.field1219 = arg0.field1223;
	}

	@ObfuscatedName("client.b(ZLOZYWPVDM;)V")
	public final void method71(OZYWPVDM arg0) {
		arg0.field1220 = arg0.field1234;
		if (arg0.field1200 == 0) {
			arg0.field1198 = 0;
		} else {
			if (arg0.field1211 != -1 && arg0.field1214 == 0) {
				KAIFCIAJ var2 = KAIFCIAJ.field742[arg0.field1211];
				if (arg0.field1210 > 0 && var2.field754 == 0) {
					arg0.field1198++;
					return;
				}

				if (arg0.field1210 <= 0 && var2.field755 == 0) {
					arg0.field1198++;
					return;
				}
			}

			int var3 = arg0.field1217;
			int var4 = arg0.field1218;
			int var5 = arg0.field1225[arg0.field1200 - 1] * 128 + arg0.field1204 * 64;
			int var6 = arg0.field1226[arg0.field1200 - 1] * 128 + arg0.field1204 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1223 = 1280;
					} else if (var4 > var6) {
						arg0.field1223 = 1792;
					} else {
						arg0.field1223 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1223 = 768;
					} else if (var4 > var6) {
						arg0.field1223 = 256;
					} else {
						arg0.field1223 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1223 = 1024;
				} else {
					arg0.field1223 = 0;
				}

				int var7 = arg0.field1223 - arg0.field1219 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1238;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1237;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1240;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1239;
				}

				if (var8 == -1) {
					var8 = arg0.field1237;
				}

				arg0.field1220 = var8;
				int var9 = 4;
				if (arg0.field1223 != arg0.field1219 && arg0.field1216 == -1 && arg0.field1205 != 0) {
					var9 = 2;
				}

				if (arg0.field1200 > 2) {
					var9 = 6;
				}

				if (arg0.field1200 > 3) {
					var9 = 8;
				}

				if (arg0.field1198 > 0 && arg0.field1200 > 1) {
					var9 = 8;
					arg0.field1198--;
				}

				if (arg0.field1209[arg0.field1200 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1237 == arg0.field1220 && arg0.field1199 != -1) {
					arg0.field1220 = arg0.field1199;
				}

				if (var3 < var5) {
					arg0.field1217 += var9;
					if (arg0.field1217 > var5) {
						arg0.field1217 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1217 -= var9;
					if (arg0.field1217 < var5) {
						arg0.field1217 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1218 += var9;
					if (arg0.field1218 > var6) {
						arg0.field1218 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1218 -= var9;
					if (arg0.field1218 < var6) {
						arg0.field1218 = var6;
					}
				}

				if (arg0.field1217 == var5 && arg0.field1218 == var6) {
					arg0.field1200--;

					if (arg0.field1210 > 0) {
						arg0.field1210--;
						return;
					}
				}
			} else {
				arg0.field1217 = var5;
				arg0.field1218 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(BLOZYWPVDM;)V")
	public final void method72(OZYWPVDM arg0) {
		if (arg0.field1205 != 0) {
			if (arg0.field1216 != -1 && arg0.field1216 < 32768) {
				NVHCJIOR var2 = field115[arg0.field1216];
				if (var2 != null) {
					int var3 = arg0.field1217 - var2.field1217;
					int var4 = arg0.field1218 - var2.field1218;
					if (var3 != 0 || var4 != 0) {
						arg0.field1223 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1216 >= 32768) {
				int var5 = arg0.field1216 - 32768;
				if (field457 == var5) {
					var5 = field95;
				}

				IGCQCHAY var6 = field96[var5];
				if (var6 != null) {
					int var7 = arg0.field1217 - var6.field1217;
					int var8 = arg0.field1218 - var6.field1218;
					if (var7 != 0 || var8 != 0) {
						arg0.field1223 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1242 != 0 || arg0.field1243 != 0) && (arg0.field1200 == 0 || arg0.field1198 > 0)) {
				int var9 = arg0.field1217 - (arg0.field1242 - field191 - field191) * 64;
				int var10 = arg0.field1218 - (arg0.field1243 - field192 - field192) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1223 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1242 = 0;
				arg0.field1243 = 0;
			}

			int var11 = arg0.field1223 - arg0.field1219 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1205 || var11 > 2048 - arg0.field1205) {
					arg0.field1219 = arg0.field1223;
				} else if (var11 > 1024) {
					arg0.field1219 -= arg0.field1205;
				} else {
					arg0.field1219 += arg0.field1205;
				}

				arg0.field1219 &= 0x7FF;
				if (arg0.field1234 == arg0.field1220 && arg0.field1223 != arg0.field1219) {
					if (arg0.field1235 != -1) {
						arg0.field1220 = arg0.field1235;
						return;
					}

					arg0.field1220 = arg0.field1237;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILOZYWPVDM;)V")
	public final void method73(OZYWPVDM arg0) {
		arg0.field1189 = false;

		if (arg0.field1220 != -1) {
			KAIFCIAJ var2 = KAIFCIAJ.field742[arg0.field1220];
			arg0.field1222++;
			if (arg0.field1221 < var2.field743 && arg0.field1222 > var2.method240(arg0.field1221)) {
				arg0.field1222 = 0;
				arg0.field1221++;
			}

			if (arg0.field1221 >= var2.field743) {
				arg0.field1222 = 0;
				arg0.field1221 = 0;
			}
		}

		if (arg0.field1193 != -1 && field205 >= arg0.field1196) {
			if (arg0.field1194 < 0) {
				arg0.field1194 = 0;
			}

			KAIFCIAJ var3 = FOXTQZWB.field603[arg0.field1193].field607;
			arg0.field1195++;
			while (arg0.field1194 < var3.field743 && arg0.field1195 > var3.method240(arg0.field1194)) {
				arg0.field1195 -= var3.method240(arg0.field1194);
				arg0.field1194++;
			}

			if (arg0.field1194 >= var3.field743 && (arg0.field1194 < 0 || arg0.field1194 >= var3.field743)) {
				arg0.field1193 = -1;
			}
		}

		if (arg0.field1211 != -1 && arg0.field1214 <= 1) {
			KAIFCIAJ var4 = KAIFCIAJ.field742[arg0.field1211];
			if (var4.field754 == 1 && arg0.field1210 > 0 && arg0.field1231 <= field205 && arg0.field1232 < field205) {
				arg0.field1214 = 1;
				return;
			}
		}

		if (arg0.field1211 != -1 && arg0.field1214 == 0) {
			KAIFCIAJ var5 = KAIFCIAJ.field742[arg0.field1211];
			arg0.field1213++;
			while (arg0.field1212 < var5.field743 && arg0.field1213 > var5.method240(arg0.field1212)) {
				arg0.field1213 -= var5.method240(arg0.field1212);
				arg0.field1212++;
			}

			if (arg0.field1212 >= var5.field743) {
				arg0.field1212 -= var5.field747;
				arg0.field1215++;
				if (arg0.field1215 >= var5.field753) {
					arg0.field1211 = -1;
				}

				if (arg0.field1212 < 0 || arg0.field1212 >= var5.field743) {
					arg0.field1211 = -1;
				}
			}

			arg0.field1189 = var5.field749;
		}

		if (arg0.field1214 > 0) {
			arg0.field1214--;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method74() {
		if (field350 == -1 || field387 != 2 && field935 == null) {
			if (field338) {
				method115();
				field338 = false;
				field423.method224(field934, 4, 0);
				field424.method224(field934, 357, 0);
				field425.method224(field934, 4, 722);
				field426.method224(field934, 205, 743);
				field427.method224(field934, 0, 0);
				field428.method224(field934, 4, 516);
				field429.method224(field934, 205, 516);
				field430.method224(field934, 357, 496);
				field431.method224(field934, 338, 0);
				field259 = true;
				field195 = true;
				field374 = true;
				field107 = true;

				if (field387 != 2) {
					field70.method224(field934, 4, 4);
					field69.method224(field934, 4, 550);
				}
			}

			if (field387 == 2) {
				method122();
			}

			if (field467 && field432 == 1) {
				field259 = true;
			}

			if (field161 != -1) {
				boolean var3 = method75(field302, field161);
				if (var3) {
					field259 = true;
				}
			}

			if (field171 == 2) {
				field259 = true;
			}

			if (field503 == 2) {
				field259 = true;
			}

			if (field259) {
				method181();
				field259 = false;
			}

			if (field392 == -1 && field357 == 0) {
				field369.field1298 = field309 - field158 - 77;

				if (field942 > 448 && field942 < 560 && field943 > 332) {
					method50(77, field942 - 17, field309, 463, field369, field943 - 357, 0, -1);
				}

				int var4 = field309 - field369.field1298 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field309 - 77) {
					var4 = field309 - 77;
				}

				if (field158 != var4) {
					field158 = var4;
					field195 = true;
				}
			}

			if (field392 == -1 && field357 == 3) {
				int var5 = field199 * 14 + 7;
				field369.field1298 = field202;

				if (field942 > 448 && field942 < 560 && field943 > 332) {
					method50(77, field942 - 17, var5, 463, field369, field943 - 357, 0, -1);
				}

				int var6 = field369.field1298;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field202 != var6) {
					field202 = var6;
					field195 = true;
				}
			}

			if (field392 != -1) {
				boolean var7 = method75(field302, field392);
				if (var7) {
					field195 = true;
				}
			}

			if (field171 == 3) {
				field195 = true;
			}

			if (field503 == 3) {
				field195 = true;
			}

			if (field321 != null) {
				field195 = true;
			}

			if (field467 && field432 == 2) {
				field195 = true;
			}

			if (field195) {
				method56();
				field195 = false;
			}

			if (field387 == 2) {
				method121();
				field69.method224(field934, 4, 550);
			}

			if (field219 != -1) {
				field374 = true;
			}

			if (field374) {
				if (field219 != -1 && field464 == field219) {
					field219 = -1;
					field463.method444(218);
					field463.method445(field464);
				}

				field374 = false;
				field422.method223();
				field188.method566(0, 0);

				if (field161 == -1) {
					if (field498[field464] != -1) {
						if (field464 == 0) {
							field328.method566(22, 10);
						}

						if (field464 == 1) {
							field329.method566(54, 8);
						}

						if (field464 == 2) {
							field329.method566(82, 8);
						}

						if (field464 == 3) {
							field330.method566(110, 8);
						}

						if (field464 == 4) {
							field332.method566(153, 8);
						}

						if (field464 == 5) {
							field332.method566(181, 8);
						}

						if (field464 == 6) {
							field331.method566(209, 9);
						}
					}

					if (field498[0] != -1 && (field219 != 0 || field205 % 20 < 10)) {
						field92[0].method566(29, 13);
					}

					if (field498[1] != -1 && (field219 != 1 || field205 % 20 < 10)) {
						field92[1].method566(53, 11);
					}

					if (field498[2] != -1 && (field219 != 2 || field205 % 20 < 10)) {
						field92[2].method566(82, 11);
					}

					if (field498[3] != -1 && (field219 != 3 || field205 % 20 < 10)) {
						field92[3].method566(115, 12);
					}

					if (field498[4] != -1 && (field219 != 4 || field205 % 20 < 10)) {
						field92[4].method566(153, 13);
					}

					if (field498[5] != -1 && (field219 != 5 || field205 % 20 < 10)) {
						field92[5].method566(180, 11);
					}

					if (field498[6] != -1 && (field219 != 6 || field205 % 20 < 10)) {
						field92[6].method566(208, 13);
					}
				}

				field422.method224(field934, 160, 516);
				field421.method223();
				field187.method566(0, 0);

				if (field161 == -1) {
					if (field498[field464] != -1) {
						if (field464 == 7) {
							field452.method566(42, 0);
						}

						if (field464 == 8) {
							field453.method566(74, 0);
						}

						if (field464 == 9) {
							field453.method566(102, 0);
						}

						if (field464 == 10) {
							field454.method566(130, 1);
						}

						if (field464 == 11) {
							field456.method566(173, 0);
						}

						if (field464 == 12) {
							field456.method566(201, 0);
						}

						if (field464 == 13) {
							field455.method566(229, 0);
						}
					}

					if (field498[8] != -1 && (field219 != 8 || field205 % 20 < 10)) {
						field92[7].method566(74, 2);
					}

					if (field498[9] != -1 && (field219 != 9 || field205 % 20 < 10)) {
						field92[8].method566(102, 3);
					}

					if (field498[10] != -1 && (field219 != 10 || field205 % 20 < 10)) {
						field92[9].method566(137, 4);
					}

					if (field498[11] != -1 && (field219 != 11 || field205 % 20 < 10)) {
						field92[10].method566(174, 2);
					}

					if (field498[12] != -1 && (field219 != 12 || field205 % 20 < 10)) {
						field92[11].method566(201, 2);
					}

					if (field498[13] != -1 && (field219 != 13 || field205 % 20 < 10)) {
						field92[12].method566(226, 2);
					}
				}

				field421.method224(field934, 466, 496);
				field70.method223();
				DABPNVTX.field519 = field489;
			}

			if (field107) {
				field107 = false;
				field420.method223();
				field186.method566(0, 0);
				field289.method272(28, 0xFFFFFF, true, 55, "Public chat");

				if (field197 == 0) {
					field289.method272(41, 0xFF00, true, 55, "On");
				}

				if (field197 == 1) {
					field289.method272(41, 0xFFFF00, true, 55, "Friends");
				}

				if (field197 == 2) {
					field289.method272(41, 0xFF0000, true, 55, "Off");
				}

				if (field197 == 3) {
					field289.method272(41, 0xFFFF, true, 55, "Hide");
				}

				field289.method272(28, 0xFFFFFF, true, 184, "Private chat");

				if (field294 == 0) {
					field289.method272(41, 0xFF00, true, 184, "On");
				}

				if (field294 == 1) {
					field289.method272(41, 0xFFFF00, true, 184, "Friends");
				}

				if (field294 == 2) {
					field289.method272(41, 0xFF0000, true, 184, "Off");
				}

				field289.method272(28, 0xFFFFFF, true, 324, "Trade/compete");

				if (field380 == 0) {
					field289.method272(41, 0xFF00, true, 324, "On");
				}

				if (field380 == 1) {
					field289.method272(41, 0xFFFF00, true, 324, "Friends");
				}

				if (field380 == 2) {
					field289.method272(41, 0xFF0000, true, 324, "Off");
				}

				field289.method272(33, 0xFFFFFF, true, 458, "Report abuse");
				field420.method224(field934, 453, 0);
				field70.method223();
				DABPNVTX.field519 = field489;
			}

			field302 = 0;
		} else {
			if (field387 == 2) {
				method75(field302, field350);

				if (field72 != -1) {
					method75(field302, field72);
				}

				field302 = 0;
				method112();
				field935.method223();
				DABPNVTX.field519 = field490;
				WNEQSCWL.method571();
				field338 = true;
				QUBPQDMQ var1 = QUBPQDMQ.method435(field350);
				if (var1.field1285 == 512 && var1.field1299 == 334 && var1.field1326 == 0) {
					var1.field1285 = 765;
					var1.field1299 = 503;
				}

				method129(0, 0, var1, 0);

				if (field72 != -1) {
					QUBPQDMQ var2 = QUBPQDMQ.method435(field72);
					if (var2.field1285 == 512 && var2.field1299 == 334 && var2.field1326 == 0) {
						var2.field1285 = 765;
						var2.field1299 = 503;
					}

					method129(0, 0, var2, 0);
				}

				if (field467) {
					method155();
				} else {
					method65();
					method102();
				}
			}

			field935.method224(field934, 0, 0);
		}
	}

	@ObfuscatedName("client.b(III)Z")
	public final boolean method75(int arg0, int arg1) {
		boolean var3 = false;
		QUBPQDMQ var4 = QUBPQDMQ.method435(arg1);
		for (int var5 = 0; var5 < var4.field1337.length && var4.field1337[var5] != -1; var5++) {
			QUBPQDMQ var6 = QUBPQDMQ.method435(var4.field1337[var5]);
			if (var6.field1326 == 0) {
				var3 |= method75(arg0, var6.field1309);
			}

			if (var6.field1326 == 6 && (var6.field1279 != -1 || var6.field1280 != -1)) {
				boolean var7 = method165(var6);
				int var8;
				if (var7) {
					var8 = var6.field1280;
				} else {
					var8 = var6.field1279;
				}

				if (var8 != -1) {
					KAIFCIAJ var9 = KAIFCIAJ.field742[var8];
					var6.field1278 += arg0;
					while (var6.field1278 > var9.method240(var6.field1336)) {
						var6.field1278 -= var9.method240(var6.field1336) + 1;
						var6.field1336++;
						if (var6.field1336 >= var9.field743) {
							var6.field1336 -= var9.field747;
							if (var6.field1336 < 0 || var6.field1336 >= var9.field743) {
								var6.field1336 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1326 == 6 && var6.field1323 != 0) {
				int var10 = var6.field1323 >> 16;
				int var11 = var6.field1323 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field1307 = var6.field1307 + var10 & 0x7FF;
				var6.field1308 = var6.field1308 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method76() {
		for (HHSKUOEZ var1 = (HHSKUOEZ) field196.method33(); var1 != null; var1 = (HHSKUOEZ) field196.method35()) {
			if (var1.field659 == -1) {
				var1.field660 = 0;
				method144(var1);
			} else {
				var1.method505();
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method77() {
		try {
			field478 = -1;
			field477.method37();
			field483.method37();
			field391++;
			if (field391 > 118) {
				field391 = 0;
				field463.method444(110);
				field463.method445(183);
			}

			DABPNVTX.method188();
			method108();
			field91.method364();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field172[var1].method5();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field272[var2][var3][var4] = 0;
					}
				}
			}

			KPOYRTLL var5 = new KPOYRTLL(104, 104, field272, field367);
			int var6 = field419.length;
			field463.method444(30);

			if (!field293) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field147[var7] >> 8) * 64 - field191;
					int var9 = (field147[var7] & 0xFF) * 64 - field192;
					byte[] var10 = field419[var7];
					if (var10 != null) {
						var5.method261(var8, (field282 - 6) * 8, var9, field172, var10, (field281 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field147[var11] >> 8) * 64 - field191;
					int var13 = (field147[var11] & 0xFF) * 64 - field192;
					byte[] var14 = field419[var11];
					if (var14 == null && field282 < 800) {
						var5.method256(64, var13, 64, var12);
					}
				}

				field110++;
				if (field110 > 155) {
					field110 = 0;
					field463.method444(160);
					field463.method448(0x132620);
				}

				field463.method444(30);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field355[var15];
					if (var16 != null) {
						int var17 = (field147[var15] >> 8) * 64 - field191;
						int var18 = (field147[var15] & 0xFF) * 64 - field192;
						var5.method251(var16, var18, var17, field91, field172);
					}
				}
			}

			if (field293) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field257[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field147.length; var29++) {
									if (field147[var29] == var28 && field419[var29] != null) {
										var5.method244(var20 * 8, var25, (var26 & 0x7) * 8, (var27 & 0x7) * 8, var21 * 8, var19, field419[var29], field172, var24);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method255(var20 * 8, var21 * 8, var19);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field257[0][var30][var31];
						if (var32 == -1) {
							var5.method256(8, var31 * 8, 8, var30 * 8);
						}
					}
				}

				field463.method444(30);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field257[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field147.length; var42++) {
									if (field147[var42] == var41 && field355[var42] != null) {
										var5.method245(field172, field355[var42], (var39 & 0x7) * 8, (var40 & 0x7) * 8, var37, var34 * 8, var33, var35 * 8, var38, field91);
										break;
									}
								}
							}
						}
					}
				}
			}

			field463.method444(30);
			var5.method259(field172, field91);

			if (field70 != null) {
				field70.method223();
				DABPNVTX.field519 = field489;
			}

			field463.method444(30);
			int var43 = KPOYRTLL.field792;
			if (var43 > field318) {
				var43 = field318;
			}

			if (var43 < field318 - 1) {
				int var44 = field318 - 1;
			}

			if (field245) {
				field91.method365(KPOYRTLL.field792);
			} else {
				field91.method365(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method126(var45, var46);
				}
			}

			method76();
		} catch (Exception var59) {
		}

		NNXJFXRX.field996.method442();

		if (field937 != null) {
			field463.method444(239);
			field463.method449(1057001181);
		}

		if (field245 && signlink.cache_dat != null) {
			int var48 = field450.method348(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field450.method353(var49);
				if ((var50 & 0x79) == 0) {
					NGYJLUVS.method290(var49);
				}
			}
		}

		System.gc();
		DABPNVTX.method189(20);
		field450.method343();
		int var51 = (field281 - 6) / 8 - 1;
		int var52 = (field281 + 6) / 8 + 1;
		int var53 = (field282 - 6) / 8 - 1;
		int var54 = (field282 + 6) / 8 + 1;
		if (field345) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field450.method352(var56, var55, 0);
					if (var57 != -1) {
						field450.method338(var57, 3);
					}

					int var58 = field450.method352(var56, var55, 1);
					if (var58 != -1) {
						field450.method338(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method78(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method79() {
		if (field339 == 2) {
			method137((field324 - field192 << 7) + field327, field325 * 2, (field323 - field191 << 7) + field326);

			if (field145 > -1 && field205 % 20 < 10) {
				field156[0].method596(field145 - 12, field146 - 28);
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method80() {
		for (int var1 = 0; var1 < field183; var1++) {
			if (field73[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field383[var1] != field241 || field276[var1] != field349) {
						RGCGKKUR var3 = GRRWPPAT.method212(field383[var1], field276[var1]);
						if (System.currentTimeMillis() + var3.field1350 / 22 > field482 / 22 + field182) {
							field482 = var3.field1350;
							field182 = System.currentTimeMillis();

							if (method105(var3.field1350, var3.field1349)) {
								field241 = field383[var1];
								field349 = field276[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method111()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field463.method444(142);
						field463.method446(field383[var1] & 0x7FFF);
					} else {
						field463.method444(142);
						field463.method446(-1);
					}
				}

				if (var2 && field73[var1] != -5) {
					field73[var1] = -5;
				} else {
					field183--;
					for (int var5 = var1; var5 < field183; var5++) {
						field383[var5] = field383[var5 + 1];
						field276[var5] = field276[var5 + 1];
						field73[var5] = field73[var5 + 1];
					}

					var1--;
				}
			} else {
				field73[var1]--;
			}
		}

		if (field348 > 0) {
			field348 -= 20;
			if (field348 < 0) {
				field348 = 0;
			}

			if (field348 == 0 && field138 && !field245) {
				field150 = field211;
				field151 = true;
				field450.method337(2, field150);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method81(String arg0) throws IOException {
		if (field296) {
			if (field306 != null) {
				try {
					field306.close();
				} catch (Exception var4) {
				}

				field306 = null;
			}

			field306 = method38(43595);
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

	@ObfuscatedName("client.t(I)V")
	public final void method82() {
		for (int var1 = -1; var1 < field97; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field95;
			} else {
				var2 = field98[var1];
			}

			IGCQCHAY var3 = field96[var2];
			if (var3 != null) {
				method68(1, var3);
			}
		}
	}

	@ObfuscatedName("client.a(LIGCQCHAY;LRGCGKKUR;III)V")
	public final void method83(IGCQCHAY arg0, RGCGKKUR arg1, int arg2, int arg3) {
		if ((arg3 & 0x40) != 0) {
			int var5 = arg1.method482();
			int var6 = arg1.method474();
			int var7 = arg1.method473();
			int var8 = arg1.field1350;

			if (arg0.field688 != null && arg0.field689) {
				long var9 = SJGLGRTK.method497(arg0.field688);
				boolean var11 = false;
				if (var6 <= 1) {
					for (int var12 = 0; var12 < field356; var12++) {
						if (field102[var12] == var9) {
							var11 = true;
							break;
						}
					}
				}

				if (!var11 && field113 == 0) {
					try {
						field114.field1350 = 0;
						arg1.method492(field114.field1349, var7, 0);
						field114.field1350 = 0;
						String var13 = ZRHRGDTH.method588(field114, var7);
						var13 = UCQYJOHJ.method524(var13);
						arg0.field1201 = var13;
						arg0.field1203 = var5 >> 8;
						arg0.field1236 = var5 & 0xFF;
						arg0.field1224 = 150;

						if (var6 == 2 || var6 == 3) {
							method163(var13, 1, "@cr2@" + arg0.field688);
						} else if (var6 == 1) {
							method163(var13, 1, "@cr1@" + arg0.field688);
						} else {
							method163(var13, 2, arg0.field688);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field1350 = var7 + var8;
		}

		if ((arg3 & 0x80) != 0) {
			int var15 = arg1.method474();
			byte[] var16 = new byte[var15];
			RGCGKKUR var17 = new RGCGKKUR(var16);
			arg1.method492(var16, var15, 0);
			field101[arg2] = var17;
			arg0.method226(var17);
		}

		if ((arg3 & 0x400) != 0) {
			arg0.field1193 = arg1.method483();
			int var18 = arg1.method490();
			arg0.field1197 = var18 >> 16;
			arg0.field1196 = (var18 & 0xFFFF) + field205;
			arg0.field1194 = 0;
			arg0.field1195 = 0;

			if (arg0.field1196 > field205) {
				arg0.field1194 = -1;
			}

			if (arg0.field1193 == 0xFFFF) {
				arg0.field1193 = -1;
			}
		}

		if ((arg3 & 0x1) != 0) {
			int var19 = arg1.method481();
			if (var19 == 0xFFFF) {
				var19 = -1;
			}

			int var20 = arg1.method473();
			if (arg0.field1211 == var19 && var19 != -1) {
				int var21 = KAIFCIAJ.field742[var19].field756;
				if (var21 == 1) {
					arg0.field1212 = 0;
					arg0.field1213 = 0;
					arg0.field1214 = var20;
					arg0.field1215 = 0;
				}

				if (var21 == 2) {
					arg0.field1215 = 0;
				}
			} else if (var19 == -1 || arg0.field1211 == -1 || KAIFCIAJ.field742[var19].field750 >= KAIFCIAJ.field742[arg0.field1211].field750) {
				arg0.field1211 = var19;
				arg0.field1212 = 0;
				arg0.field1213 = 0;
				arg0.field1214 = var20;
				arg0.field1215 = 0;
				arg0.field1210 = arg0.field1200;
			}
		}

		if ((arg3 & 0x100) != 0) {
			int var22 = arg1.method455();
			int var23 = arg1.method455();
			arg0.method421(field205, var22, var23);
			arg0.field1190 = field205 + 300;
			arg0.field1191 = arg1.method475();
			arg0.field1192 = arg1.method473();
		}

		if ((arg3 & 0x200) != 0) {
			arg0.field1227 = arg1.method475();
			arg0.field1229 = arg1.method474();
			arg0.field1228 = arg1.method455();
			arg0.field1230 = arg1.method474();
			arg0.field1231 = arg1.method483() + field205;
			arg0.field1232 = arg1.method482() + field205;
			arg0.field1233 = arg1.method475();
			arg0.method422();
		}

		if ((arg3 & 0x4) != 0) {
			arg0.field1216 = arg1.method482();
			if (arg0.field1216 == 0xFFFF) {
				arg0.field1216 = -1;
			}
		}

		if ((arg3 & 0x2) != 0) {
			arg0.field1242 = arg1.method483();
			arg0.field1243 = arg1.method481();
		}

		if ((arg3 & 0x10) != 0) {
			int var24 = arg1.method473();
			int var25 = arg1.method474();
			arg0.method421(field205, var24, var25);
			arg0.field1190 = field205 + 300;
			arg0.field1191 = arg1.method474();
			arg0.field1192 = arg1.method474();
		}

		if ((arg3 & 0x8) != 0) {
			arg0.field1201 = arg1.method462();
			if (arg0.field1201.charAt(0) == '~') {
				arg0.field1201 = arg0.field1201.substring(1);
				method163(arg0.field1201, 2, arg0.field688);
			} else if (field181 == arg0) {
				method163(arg0.field1201, 2, arg0.field688);
			}

			arg0.field1203 = 0;
			arg0.field1236 = 0;
			arg0.field1224 = 150;
		}
	}

	@ObfuscatedName("client.a(LQUBPQDMQ;I)V")
	public final void method84(QUBPQDMQ arg0) {
		int var2 = arg0.field1321;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field376 == 0) {
				arg0.field1291 = "Loading friend list";
				arg0.field1310 = 0;
			} else if (var2 == 1 && field376 == 1) {
				arg0.field1291 = "Connecting to friendserver";
				arg0.field1310 = 0;
			} else if (var2 == 2 && field376 != 2) {
				arg0.field1291 = "Please wait...";
				arg0.field1310 = 0;
			} else {
				int var3 = field375;
				if (field376 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1291 = "";
					arg0.field1310 = 0;
				} else {
					arg0.field1291 = field400[var2];
					arg0.field1310 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field375;
			if (field376 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1291 = "";
				arg0.field1310 = 0;
			} else {
				if (field111[var2] == 0) {
					arg0.field1291 = "@red@Offline";
				} else if (field111[var2] < 200) {
					if (field111[var2] == field242) {
						arg0.field1291 = "@gre@World" + (field111[var2] - 9);
					} else {
						arg0.field1291 = "@yel@World" + (field111[var2] - 9);
					}
				} else if (field111[var2] == field242) {
					arg0.field1291 = "@gre@Classic" + (field111[var2] - 219);
				} else {
					arg0.field1291 = "@yel@Classic" + (field111[var2] - 219);
				}

				arg0.field1310 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field375;
			if (field376 != 2) {
				var5 = 0;
			}

			arg0.field1296 = var5 * 15 + 20;
			if (arg0.field1296 <= arg0.field1299) {
				arg0.field1296 = arg0.field1299 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field376 == 0) {
				arg0.field1291 = "Loading ignore list";
				arg0.field1310 = 0;
			} else if (var2 == 1 && field376 == 0) {
				arg0.field1291 = "Please wait...";
				arg0.field1310 = 0;
			} else {
				int var6 = field356;
				if (field376 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1291 = "";
					arg0.field1310 = 0;
				} else {
					arg0.field1291 = SJGLGRTK.method501(SJGLGRTK.method498(field102[var2]));
					arg0.field1310 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1296 = field356 * 15 + 20;
			if (arg0.field1296 <= arg0.field1299) {
				arg0.field1296 = arg0.field1299 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1307 = 150;
			arg0.field1308 = (int) (Math.sin(field205 / 40.0D) * 256.0D) & 0x7FF;

			if (field386) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field308[var7];
					if (var8 >= 0 && !IIATCLSX.field702[var8].method232()) {
						return;
					}
				}

				field386 = false;
				NGYJLUVS[] var9 = new NGYJLUVS[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field308[var11];
					if (var12 >= 0) {
						var9[var10++] = IIATCLSX.field702[var12].method233();
					}
				}

				NGYJLUVS var13 = new NGYJLUVS(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field76[var14] != 0) {
						var13.method305(field220[var14][0], field220[var14][field76[var14]]);

						if (var14 == 1) {
							var13.method305(field492[0], field492[field76[var14]]);
						}
					}
				}

				var13.method298();
				var13.method299(KAIFCIAJ.field742[field181.field1234].field744[0]);
				var13.method308(64, 850, -30, -50, -30, true);
				arg0.field1324 = 5;
				arg0.field1325 = 0;
				QUBPQDMQ.method430(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field448 == null) {
				field448 = arg0.field1315;
				field449 = arg0.field1276;
			}

			if (field461) {
				arg0.field1315 = field449;
			} else {
				arg0.field1315 = field448;
			}
		} else if (var2 == 325) {
			if (field448 == null) {
				field448 = arg0.field1315;
				field449 = arg0.field1276;
			}

			if (field461) {
				arg0.field1315 = field448;
			} else {
				arg0.field1315 = field449;
			}
		} else if (var2 == 600) {
			arg0.field1291 = field213;
			if (field205 % 20 < 10) {
				arg0.field1291 = arg0.field1291 + "|";
			} else {
				arg0.field1291 = arg0.field1291 + " ";
			}
		} else if (var2 == 620) {
			if (field344 < 1) {
				arg0.field1291 = "";
			} else if (field491) {
				arg0.field1284 = 0xFF0000;
				arg0.field1291 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1284 = 0xFFFFFF;
				arg0.field1291 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field251 - field358;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1291 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field274 == 0) {
				arg0.field1291 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field274 <= field251) {
				arg0.field1291 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method85(field274);
			} else {
				int var17 = field251 + 14 - field274;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1291 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method85(field274) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field437 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field437 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field437 + " unread messages";
			}

			arg0.field1291 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field474 > 0 && field474 <= field251 + 10) {
				arg0.field1291 = "Last password change:\\n@gre@" + method85(field474);
			} else {
				arg0.field1291 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field500 > 2 && !field244) {
				arg0.field1291 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field500 > 2) {
				arg0.field1291 = "\\n\\nYou have @gre@" + field500 + "@yel@ days of\\nmember credit remaining.";
			} else if (field500 > 0) {
				arg0.field1291 = "You have @gre@" + field500 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1291 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field500 > 2 && !field244) {
				arg0.field1291 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field500 > 0) {
				arg0.field1291 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1291 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field274 > field251) {
				arg0.field1291 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1291 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public final String method85(int arg0) {
		if (arg0 > field251 + 10) {
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

	@ObfuscatedName("client.d(Z)V")
	public final void method86() {
		for (FFLRYPKA var1 = (FFLRYPKA) field477.method33(); var1 != null; var1 = (FFLRYPKA) field477.method35()) {
			if (field318 != var1.field596 || var1.field594) {
				var1.method505();
			} else if (field205 >= var1.field593) {
				var1.method207(field302);

				if (var1.field594) {
					var1.method505();
				} else {
					field91.method375(var1.field598, var1.field599, -1, 0, var1.field596, false, var1.field597, var1, 60);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBIIII)V")
	public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field178.method566(arg2, arg3);
		field179.method566(arg2, arg1 + arg3 - 16);
		WNEQSCWL.method573(arg3 + 16, arg2, field317, arg1 - 32, 16);
		int var6 = (arg1 - 32) * arg1 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg4 / (arg0 - arg1);
		WNEQSCWL.method573(arg3 + var7 + 16, arg2, field418, var6, 16);
		WNEQSCWL.method578(field180, var6, arg3 + var7 + 16, arg2);
		WNEQSCWL.method578(field180, var6, arg3 + var7 + 16, arg2 + 1);
		WNEQSCWL.method576(arg2, 16, arg3 + var7 + 16, field180);
		WNEQSCWL.method576(arg2, 16, arg3 + var7 + 17, field180);
		WNEQSCWL.method578(field252, var6, arg3 + var7 + 16, arg2 + 15);
		WNEQSCWL.method578(field252, var6 - 1, arg3 + 17 + var7, arg2 + 14);
		WNEQSCWL.method576(arg2, 16, arg3 + var7 + var6 + 15, field252);
		WNEQSCWL.method576(arg2 + 1, 15, arg3 + var7 + var6 + 14, field252);
	}

	@ObfuscatedName("client.u(I)V")
	public final void method88() {
		short var1 = 256;

		if (field298 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field298 > 768) {
					field207[var2] = method78(1024 - field298, field209[var2], field208[var2]);
				} else if (field298 > 256) {
					field207[var2] = field209[var2];
				} else {
					field207[var2] = method78(256 - field298, field208[var2], field209[var2]);
				}
			}
		} else if (field299 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field299 > 768) {
					field207[var3] = method78(1024 - field299, field210[var3], field208[var3]);
				} else if (field299 > 256) {
					field207[var3] = field210[var3];
				} else {
					field207[var3] = method78(256 - field299, field208[var3], field210[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field207[var4] = field208[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field266.field669[var5] = field443.field1511[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field390[var8] / var1;
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
					var12 = field207[var12];
					int var15 = field266.field669[var7];
					field266.field669[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field266.method224(field934, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field267.field669[var16] = field444.field1511[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field390[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field227[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field207[var23];
					int var26 = field267.field669[var18];
					field267.field669[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field267.method224(field934, 0, 637);
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static final String method89(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method90(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field375; var2++) {
			if (arg0.equalsIgnoreCase(field400[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field181.field688)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method91(boolean arg0) {
		method109();
		field265.method223();
		field335.method566(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field307 == 0) {
			int var4 = var3 / 2 + 80;
			field288.method272(var4, 0x75A9A9, true, var2 / 2, field450.field1022);
			int var5 = var3 / 2 - 20;
			field290.method272(var5, 0xFFFF00, true, var2 / 2, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field336.method566(var6 - 73, var7 - 20);
			field290.method272(var7 + 5, 0xFFFFFF, true, var6, "New User");
			int var8 = var2 / 2 + 80;
			field336.method566(var8 - 73, var7 - 20);
			field290.method272(var7 + 5, 0xFFFFFF, true, var8, "Existing User");
		}

		if (field307 == 2) {
			int var9 = var3 / 2 - 40;
			if (field283.length() > 0) {
				field290.method272(var9 - 15, 0xFFFF00, true, var2 / 2, field283);
				field290.method272(var9, 0xFFFF00, true, var2 / 2, field284);
				var9 += 30;
			} else {
				field290.method272(var9 - 7, 0xFFFF00, true, var2 / 2, field284);
				var9 += 30;
			}

			field290.method279("Username: " + field365 + (field466 == 0 & field205 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 90, var9, true, 0xFFFFFF);
			var9 += 15;
			field290.method279("Password: " + SJGLGRTK.method502(field366) + (field466 == 1 & field205 % 40 < 20 ? "@yel@|" : ""), var2 / 2 - 88, var9, true, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field336.method566(var10 - 73, var11 - 20);
				field290.method272(var11 + 5, 0xFFFFFF, true, var10, "Login");
				int var12 = var2 / 2 + 80;
				field336.method566(var12 - 73, var11 - 20);
				field290.method272(var11 + 5, 0xFFFFFF, true, var12, "Cancel");
			}
		}

		if (field307 == 3) {
			field290.method272(var3 / 2 - 60, 0xFFFF00, true, var2 / 2, "Create a free account");
			int var13 = var3 / 2 - 35;
			field290.method272(var13, 0xFFFFFF, true, var2 / 2, "To create a new account you need to");
			var13 += 15;
			field290.method272(var13, 0xFFFFFF, true, var2 / 2, "go back to the main RuneScape webpage");
			var13 += 15;
			field290.method272(var13, 0xFFFFFF, true, var2 / 2, "and choose the 'create account'");
			var13 += 15;
			field290.method272(var13, 0xFFFFFF, true, var2 / 2, "button near the top of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field336.method566(var14 - 73, var15 - 20);
			field290.method272(var15 + 5, 0xFFFFFF, true, var14, "Cancel");
		}

		field265.method224(field934, 171, 202);

		if (field338) {
			field338 = false;
			field263.method224(field934, 0, 128);
			field264.method224(field934, 371, 202);
			field268.method224(field934, 265, 0);
			field269.method224(field934, 265, 562);
			field270.method224(field934, 171, 128);
			field271.method224(field934, 171, 562);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method92() {
		field351 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field216) {
				field354++;
				method145();
				method145();
				method88();
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

		field351 = false;
	}

	@ObfuscatedName("client.a(IILRGCGKKUR;)V")
	public final void method93(int arg0, RGCGKKUR arg1) {
		field130 = 0;
		field99 = 0;
		method41(arg0, arg1);
		method47(arg1, arg0);
		method64(arg1, arg0);

		for (int var3 = 0; var3 < field130; var3++) {
			int var4 = field131[var3];
			if (field205 != field115[var4].field1241) {
				field115[var4].field1051 = null;
				field115[var4] = null;
			}
		}

		if (arg1.field1350 != arg0) {
			signlink.reporterror(field365 + " size mismatch in getnpcpos - pos:" + arg1.field1350 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field116; var5++) {
			if (field115[field117[var5]] == null) {
				signlink.reporterror(field365 + " null entry in npc list - pos:" + var5 + " size:" + field116);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method94() {
		try {
			if (field295 != null) {
				field295.method506();
			}
		} catch (Exception var2) {
		}

		field295 = null;
		field162 = false;
		field307 = 0;
		field365 = "";
		field366 = "";
		method108();
		field91.method364();

		for (int var1 = 0; var1 < 4; var1++) {
			field172[var1].method5();
		}

		System.gc();
		method166();
		field211 = -1;
		field150 = -1;
		field348 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;I)V")
	public final void method95(String arg0, String arg1) {
		if (field70 != null) {
			field70.method223();
			DABPNVTX.field519 = field489;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field289.method271(257, 0, arg1, var3);
			field289.method271(256, 0xFFFFFF, arg1, var3 - 1);
			var3 += 15;
			if (arg0 != null) {
				field289.method271(257, 0, arg0, var3);
				field289.method271(256, 0xFFFFFF, arg0, var3 - 1);
			}

			field70.method224(field934, 4, 4);
		} else if (field935 != null) {
			field935.method223();
			DABPNVTX.field519 = field490;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			WNEQSCWL.method573(var4 - var6 / 2 - 5, 383 - var5 / 2, 0, var6, var5);
			WNEQSCWL.method574(var6, var4 - var6 / 2 - 5, 383 - var5 / 2, 0xFFFFFF, var5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field289.method271(383, 0, arg1, var4);
			field289.method271(382, 0xFFFFFF, arg1, var4 - 1);
			var4 += 15;
			if (arg0 != null) {
				field289.method271(383, 0, arg0, var4);
				field289.method271(382, 0xFFFFFF, arg0, var4 - 1);
			}

			field935.method224(field934, 0, 0);
		}
	}

	@ObfuscatedName("client.a(LRGCGKKUR;II)V")
	public final void method96(RGCGKKUR arg0, int arg1) {
		arg0.method465();
		int var3 = arg0.method466(1);
		if (var3 != 0) {
			int var4 = arg0.method466(2);
			if (var4 == 0) {
				field100[field99++] = field95;
			} else if (var4 == 1) {
				int var5 = arg0.method466(3);
				field181.method420(var5, false);
				int var6 = arg0.method466(1);
				if (var6 == 1) {
					field100[field99++] = field95;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method466(3);
				field181.method420(var7, true);
				int var8 = arg0.method466(3);
				field181.method420(var8, true);
				int var9 = arg0.method466(1);
				if (var9 == 1) {
					field100[field99++] = field95;
				}
			} else if (var4 == 3) {
				field318 = arg0.method466(2);
				int var10 = arg0.method466(7);
				int var11 = arg0.method466(1);
				if (var11 == 1) {
					field100[field99++] = field95;
				}

				int var12 = arg0.method466(7);
				int var13 = arg0.method466(1);
				field181.method419(var10, var12, var13 == 1);
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method97() {
		if (field254 != 0) {
			MGTPXZHY var1 = field289;
			int var2 = 0;
			if (field417 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field379[var3] != null) {
					int var4 = field377[var3];
					String var5 = field378[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field294 == 0 || field294 == 1 && method90(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method275(0, "From", var7, var8);
						var1.method275(0xFFFF, "From", var7 - 1, var8);
						int var11 = var8 + var1.method273("From ");
						if (var6 == 1) {
							field316[0].method566(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field316[1].method566(var11, var7 - 12);
							var11 += 14;
						}

						var1.method275(0, var5 + ": " + field379[var3], var7, var11);
						var1.method275(0xFFFF, var5 + ": " + field379[var3], var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field294 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method275(0, field379[var3], var9, 4);
						var1.method275(0xFFFF, field379[var3], var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field294 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method275(0, "To " + var5 + ": " + field379[var3], var10, 4);
						var1.method275(0xFFFF, "To " + var5 + ": " + field379[var3], var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIIIIIIIII)V")
	public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		HHSKUOEZ var10 = null;
		for (HHSKUOEZ var11 = (HHSKUOEZ) field196.method33(); var11 != null; var11 = (HHSKUOEZ) field196.method35()) {
			if (var11.field655 == arg7 && var11.field657 == arg2 && var11.field658 == arg3 && var11.field656 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new HHSKUOEZ();
			var10.field655 = arg7;
			var10.field656 = arg6;
			var10.field657 = arg2;
			var10.field658 = arg3;
			method144(var10);
			field196.method30(var10);
		}

		var10.field661 = arg1;
		var10.field663 = arg5;
		var10.field662 = arg4;
		var10.field660 = arg0;
		var10.field659 = arg8;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method99(int arg0) {
		if (!field245) {
			for (int var2 = 0; var2 < field441.length; var2++) {
				int var3 = field441[var2];
				if (DABPNVTX.field527[var3] >= arg0) {
					WGRALUSQ var4 = DABPNVTX.field521[var3];
					int var5 = var4.field1447 * var4.field1446 - 1;
					int var6 = field302 * var4.field1446 * 2;
					byte[] var7 = var4.field1444;
					byte[] var8 = field66;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1444 = var8;
					field66 = var7;
					DABPNVTX.method192(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method100() {
		field386 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field308[var1] = -1;
			for (int var2 = 0; var2 < IIATCLSX.field701; var2++) {
				if (!IIATCLSX.field702[var2].field708 && IIATCLSX.field702[var2].field703 == var1 + (field461 ? 0 : 7)) {
					field308[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method101() {
		field338 = true;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method102() {
		if (field118 >= 2 || field120 != 0 || field494 != 0) {
			String var1;
			if (field120 == 1 && field118 < 2) {
				var1 = "Use " + field124 + " with...";
			} else if (field494 == 1 && field118 < 2) {
				var1 = field497 + "...";
			} else {
				var1 = field173[field118 - 1];
			}

			if (field118 > 2) {
				var1 = var1 + "@whi@ / " + (field118 - 2) + " more options";
			}

			field290.method280(15, var1, 4, true, 0xFFFFFF, field205 / 1000);
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method103() {
		for (int var1 = -1; var1 < field97; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field95;
			} else {
				var2 = field98[var1];
			}

			IGCQCHAY var3 = field96[var2];
			if (var3 != null && var3.field1224 > 0) {
				var3.field1224--;
				if (var3.field1224 == 0) {
					var3.field1201 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field116; var4++) {
			int var5 = field117[var4];
			NVHCJIOR var6 = field115[var5];
			if (var6 != null && var6.field1224 > 0) {
				var6.field1224--;
				if (var6.field1224 == 0) {
					var6.field1201 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBI)V")
	public final void method104(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field379[var4] != null) {
				int var5 = field377[var4];
				int var6 = field158 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field378[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field197 == 0 || field197 == 1 && method90(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field181.field688)) {
						if (field344 >= 1) {
							field173[field118] = "Report abuse @whi@" + var7;
							field313[field118] = 541;
							field118++;
						}

						field173[field118] = "Add ignore @whi@" + var7;
						field313[field118] = 997;
						field118++;
						field173[field118] = "Add friend @whi@" + var7;
						field313[field118] = 138;
						field118++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field254 == 0 && (var5 == 7 || field294 == 0 || field294 == 1 && method90(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field344 >= 1) {
							field173[field118] = "Report abuse @whi@" + var7;
							field313[field118] = 541;
							field118++;
						}

						field173[field118] = "Add ignore @whi@" + var7;
						field313[field118] = 997;
						field118++;
						field173[field118] = "Add friend @whi@" + var7;
						field313[field118] = 138;
						field118++;
					}

					var3++;
				}

				if (var5 == 4 && (field380 == 0 || field380 == 1 && method90(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field173[field118] = "Accept trade @whi@" + var7;
						field313[field118] = 119;
						field118++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field254 == 0 && field294 < 2) {
					var3++;
				}

				if (var5 == 8 && (field380 == 0 || field380 == 1 && method90(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field173[field118] = "Accept challenge @whi@" + var7;
						field313[field118] = 875;
						field118++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ[B)Z")
	public final boolean method105(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.k(B)V")
	public final void method106() {
		Graphics var1 = method128().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method320(1);

		if (field322) {
			field216 = false;
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

		if (field278) {
			field216 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field74) {
			field216 = false;
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

	@ObfuscatedName("client.b(IILRGCGKKUR;)V")
	public final void method107(int arg0, RGCGKKUR arg1) {
		for (int var3 = 0; var3 < field99; var3++) {
			int var4 = field100[var3];
			IGCQCHAY var5 = field96[var4];
			int var6 = arg1.method455();
			if ((var6 & 0x20) != 0) {
				var6 += arg1.method455() << 8;
			}

			method83(var5, arg1, var4, var6);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method108() {
		NNXJFXRX.field996.method442();
		NNXJFXRX.field983.method442();
		XDDMQHDR.field1494.method442();
		BSBHBECI.field15.method442();
		BSBHBECI.field23.method442();
		IGCQCHAY.field695.method442();
		FOXTQZWB.field615.method442();
	}

	@ObfuscatedName("client.A(I)V")
	public final void method109() {
		if (field263 == null) {
			field935 = null;
			field71 = null;
			field69 = null;
			field68 = null;
			field70 = null;
			field420 = null;
			field421 = null;
			field422 = null;
			field266 = new HVBGFDBD(method128(), 265, 128);
			WNEQSCWL.method571();
			field267 = new HVBGFDBD(method128(), 265, 128);
			WNEQSCWL.method571();
			field263 = new HVBGFDBD(method128(), 171, 509);
			WNEQSCWL.method571();
			field264 = new HVBGFDBD(method128(), 132, 360);
			WNEQSCWL.method571();
			field265 = new HVBGFDBD(method128(), 200, 360);
			WNEQSCWL.method571();
			field268 = new HVBGFDBD(method128(), 238, 202);
			WNEQSCWL.method571();
			field269 = new HVBGFDBD(method128(), 238, 203);
			WNEQSCWL.method571();
			field270 = new HVBGFDBD(method128(), 94, 74);
			WNEQSCWL.method571();
			field271 = new HVBGFDBD(method128(), 94, 75);
			WNEQSCWL.method571();

			if (field273 != null) {
				method62();
				method44();
			}

			field338 = true;
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method110(boolean arg0) {
		for (int var2 = 0; var2 < field116; var2++) {
			NVHCJIOR var3 = field115[field117[var2]];
			int var4 = (field117[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method229() && var3.field1051.field1472 == arg0 && var3.field1051.method586()) {
				int var5 = var3.field1217 >> 7;
				int var6 = var3.field1218 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1204 == 1 && (var3.field1217 & 0x7F) == 0x40 && (var3.field1218 & 0x7F) == 0x40) {
						if (field153[var5][var6] == field384) {
							continue;
						}

						field153[var5][var6] = field384;
					}

					if (!var3.field1051.field1467) {
						var4 += Integer.MIN_VALUE;
					}

					field91.method375(var3.field1218, method45(var3.field1217, var3.field1218, field318), var4, var3.field1219, field318, var3.field1189, var3.field1217, var3, (var3.field1204 - 1) * 64 + 60);
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)Z")
	public final boolean method111() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.C(I)V")
	public final void method112() {
		if (field935 == null) {
			method159();
			field263 = null;
			field264 = null;
			field265 = null;
			field266 = null;
			field267 = null;
			field268 = null;
			field269 = null;
			field270 = null;
			field271 = null;
			field71 = null;
			field69 = null;
			field68 = null;
			field70 = null;
			field420 = null;
			field421 = null;
			field422 = null;
			field935 = new HVBGFDBD(method128(), 503, 765);
			field338 = true;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method113() {
		method174("Starting up", 20);

		if (signlink.sunjava) {
			field928 = 5;
		}

		if (field155) {
			field74 = true;
		} else {
			field155 = true;
			boolean var1 = false;
			String var2 = method49();
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
						field258[var3] = new HOAULYFF(500000, var3 + 1, signlink.cache_dat, signlink.cache_idx[var3]);
					}
				}

				try {
					method178();
					field273 = method183(1, "title screen", 25, "title", field481[1]);
					field288 = new MGTPXZHY("p11_full", false, field273);
					field289 = new MGTPXZHY("p12_full", false, field273);
					field290 = new MGTPXZHY("b12_full", false, field273);
					field291 = new MGTPXZHY("q8_full", true, field273);
					method62();
					method44();
					ESUFCMYV var4 = method183(2, "config", 30, "config", field481[2]);
					ESUFCMYV var5 = method183(3, "interface", 35, "interface", field481[3]);
					ESUFCMYV var6 = method183(4, "2d graphics", 40, "media", field481[4]);
					ESUFCMYV var7 = method183(6, "textures", 45, "textures", field481[6]);
					ESUFCMYV var8 = method183(7, "chat system", 50, "wordenc", field481[7]);
					ESUFCMYV var9 = method183(8, "sound effects", 55, "sounds", field481[8]);
					field272 = new byte[4][104][104];
					field367 = new int[4][105][105];
					field91 = new OUUKQIMK(field367, 104, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field172[var10] = new ASFXKKJM(104, 104);
					}

					field403 = new ZSWNSCUQ(512, 512);
					ESUFCMYV var11 = method183(5, "update list", 60, "versionlist", field481[5]);
					method174("Connecting to update server", 60);
					field450 = new NTGEPOMK();
					field450.method342(var11, this);
					PHDJZMLE.method424(field450.method341());
					NGYJLUVS.method288(field450.method348(0), field450);

					if (!field245) {
						field150 = 0;
						field151 = true;
						field450.method337(2, field150);

						while (field450.method339() > 0) {
							method52();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field450.field1014 > 3) {
								method157("ondemand");
								return;
							}
						}
					}

					method174("Requesting animations", 65);
					int var12 = field450.method348(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field450.method337(1, var13);
					}

					while (field450.method339() > 0) {
						int var14 = var12 - field450.method339();
						if (var14 > 0) {
							method174("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method52();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field450.field1014 > 3) {
							method157("ondemand");
							return;
						}
					}

					method174("Requesting models", 70);
					int var15 = field450.method348(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field450.method353(var16);
						if ((var17 & 0x1) != 0) {
							field450.method337(0, var16);
						}
					}

					int var18 = field450.method339();
					while (field450.method339() > 0) {
						int var19 = var18 - field450.method339();
						if (var19 > 0) {
							method174("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method52();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field258[0] != null) {
						method174("Requesting maps", 75);
						field450.method337(3, field450.method352(48, 47, 0));
						field450.method337(3, field450.method352(48, 47, 1));
						field450.method337(3, field450.method352(48, 48, 0));
						field450.method337(3, field450.method352(48, 48, 1));
						field450.method337(3, field450.method352(48, 49, 0));
						field450.method337(3, field450.method352(48, 49, 1));
						field450.method337(3, field450.method352(47, 47, 0));
						field450.method337(3, field450.method352(47, 47, 1));
						field450.method337(3, field450.method352(47, 48, 0));
						field450.method337(3, field450.method352(47, 48, 1));
						field450.method337(3, field450.method352(148, 48, 0));
						field450.method337(3, field450.method352(148, 48, 1));
						int var20 = field450.method339();
						while (field450.method339() > 0) {
							int var21 = var20 - field450.method339();
							if (var21 > 0) {
								method174("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method52();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field450.method348(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field450.method353(var23);
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
							field450.method345(0, var25, var23);
						}
					}

					field450.method336(field244);

					if (!field245) {
						int var26 = field450.method348(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field450.method340(var27)) {
								field450.method345(2, (byte) 1, var27);
							}
						}
					}

					method174("Unpacking media", 80);
					field163 = new WGRALUSQ(var6, "invback", 0);
					field165 = new WGRALUSQ(var6, "chatback", 0);
					field164 = new WGRALUSQ(var6, "mapback", 0);
					field186 = new WGRALUSQ(var6, "backbase1", 0);
					field187 = new WGRALUSQ(var6, "backbase2", 0);
					field188 = new WGRALUSQ(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field92[var28] = new WGRALUSQ(var6, "sideicons", var28);
					}

					field346 = new ZSWNSCUQ(var6, "compass", 0);
					field225 = new ZSWNSCUQ(var6, "mapedge", 0);
					field225.method593();

					for (int var29 = 0; var29 < 72; var29++) {
						field473[var29] = new WGRALUSQ(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field310[var30] = new ZSWNSCUQ(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field388[var31] = new ZSWNSCUQ(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field279[var32] = new ZSWNSCUQ(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field320[var33] = new ZSWNSCUQ(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field156[var34] = new ZSWNSCUQ(var6, "headicons_hint", var34);
					}

					field137 = new ZSWNSCUQ(var6, "overlay_multiway", 0);
					field128 = new ZSWNSCUQ(var6, "mapmarker", 0);
					field129 = new ZSWNSCUQ(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field127[var35] = new ZSWNSCUQ(var6, "cross", var35);
					}

					field234 = new ZSWNSCUQ(var6, "mapdots", 0);
					field235 = new ZSWNSCUQ(var6, "mapdots", 1);
					field236 = new ZSWNSCUQ(var6, "mapdots", 2);
					field237 = new ZSWNSCUQ(var6, "mapdots", 3);
					field238 = new ZSWNSCUQ(var6, "mapdots", 4);
					field178 = new WGRALUSQ(var6, "scrollbar", 0);
					field179 = new WGRALUSQ(var6, "scrollbar", 1);
					field328 = new WGRALUSQ(var6, "redstone1", 0);
					field329 = new WGRALUSQ(var6, "redstone2", 0);
					field330 = new WGRALUSQ(var6, "redstone3", 0);
					field331 = new WGRALUSQ(var6, "redstone1", 0);
					field331.method563();
					field332 = new WGRALUSQ(var6, "redstone2", 0);
					field332.method563();
					field452 = new WGRALUSQ(var6, "redstone1", 0);
					field452.method564();
					field453 = new WGRALUSQ(var6, "redstone2", 0);
					field453.method564();
					field454 = new WGRALUSQ(var6, "redstone3", 0);
					field454.method564();
					field455 = new WGRALUSQ(var6, "redstone1", 0);
					field455.method563();
					field455.method564();
					field456 = new WGRALUSQ(var6, "redstone2", 0);
					field456.method563();
					field456.method564();

					for (int var36 = 0; var36 < 2; var36++) {
						field316[var36] = new WGRALUSQ(var6, "mod_icons", var36);
					}

					ZSWNSCUQ var37 = new ZSWNSCUQ(var6, "backleft1", 0);
					field423 = new HVBGFDBD(method128(), var37.field1513, var37.field1512);
					var37.method594(0, 0);
					ZSWNSCUQ var38 = new ZSWNSCUQ(var6, "backleft2", 0);
					field424 = new HVBGFDBD(method128(), var38.field1513, var38.field1512);
					var38.method594(0, 0);
					ZSWNSCUQ var39 = new ZSWNSCUQ(var6, "backright1", 0);
					field425 = new HVBGFDBD(method128(), var39.field1513, var39.field1512);
					var39.method594(0, 0);
					ZSWNSCUQ var40 = new ZSWNSCUQ(var6, "backright2", 0);
					field426 = new HVBGFDBD(method128(), var40.field1513, var40.field1512);
					var40.method594(0, 0);
					ZSWNSCUQ var41 = new ZSWNSCUQ(var6, "backtop1", 0);
					field427 = new HVBGFDBD(method128(), var41.field1513, var41.field1512);
					var41.method594(0, 0);
					ZSWNSCUQ var42 = new ZSWNSCUQ(var6, "backvmid1", 0);
					field428 = new HVBGFDBD(method128(), var42.field1513, var42.field1512);
					var42.method594(0, 0);
					ZSWNSCUQ var43 = new ZSWNSCUQ(var6, "backvmid2", 0);
					field429 = new HVBGFDBD(method128(), var43.field1513, var43.field1512);
					var43.method594(0, 0);
					ZSWNSCUQ var44 = new ZSWNSCUQ(var6, "backvmid3", 0);
					field430 = new HVBGFDBD(method128(), var44.field1513, var44.field1512);
					var44.method594(0, 0);
					ZSWNSCUQ var45 = new ZSWNSCUQ(var6, "backhmid2", 0);
					field431 = new HVBGFDBD(method128(), var45.field1513, var45.field1512);
					var45.method594(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field310[var50] != null) {
							field310[var50].method592(var47 + var49, var48 + var49, var46 + var49);
						}

						if (field473[var50] != null) {
							field473[var50].method565(var47 + var49, var48 + var49, var46 + var49);
						}
					}

					method174("Unpacking textures", 83);
					DABPNVTX.method190(var7);
					DABPNVTX.method194(0.8D);
					DABPNVTX.method189(20);
					method174("Unpacking config", 86);
					KAIFCIAJ.method239(var4);
					NNXJFXRX.method322(var4);
					UGHJOVKI.method552(var4);
					BSBHBECI.method25(var4);
					XDDMQHDR.method583(var4);
					IIATCLSX.method230(var4);
					FOXTQZWB.method208(var4);
					TLLQKWNZ.method512(var4);
					DPQEBGAZ.method202(var4);
					BSBHBECI.field19 = field244;

					if (!field245) {
						method174("Unpacking sounds", 90);
						byte[] var51 = var9.method205("sounds.dat", null);
						RGCGKKUR var52 = new RGCGKKUR(var51);
						GRRWPPAT.method211(var52);
					}

					method174("Unpacking interfaces", 95);
					MGTPXZHY[] var53 = new MGTPXZHY[] { field288, field289, field290, field291 };
					QUBPQDMQ.method438(var6, var53, var5);
					method174("Preparing game engine", 100);

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field164.field1444[field164.field1446 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field109[var54] = var55;
						field221[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field164.field1444[field164.field1446 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field78[var58 - 5] = var59 - 25;
						field250[var58 - 5] = var60 - var59;
					}

					DABPNVTX.method187(503, 765);
					field490 = DABPNVTX.field519;
					DABPNVTX.method187(96, 479);
					field487 = DABPNVTX.field519;
					DABPNVTX.method187(261, 190);
					field488 = DABPNVTX.field519;
					DABPNVTX.method187(334, 512);
					field489 = DABPNVTX.field519;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = DABPNVTX.field517[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					OUUKQIMK.method400(512, 334, var62, 500, 800);
					UCQYJOHJ.method514(var8);
					field341 = new EKUSXTUB(this);
					method123(field341, 10);
					QHSYTCMW.field1261 = this;
					NNXJFXRX.field967 = this;
					XDDMQHDR.field1493 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field385 + " " + field226);
					field322 = true;
				}
			} else {
				field278 = true;
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method114() {
		if (field307 == 0) {
			int var1 = field932 / 2 - 80;
			int var2 = field933 / 2 + 20;
			var2 += 20;
			if (field948 == 1 && field949 >= var1 - 75 && field949 <= var1 + 75 && field950 >= var2 - 20 && field950 <= var2 + 20) {
				field307 = 3;
				field466 = 0;
			}

			int var3 = field932 / 2 + 80;
			if (field948 == 1 && field949 >= var3 - 75 && field949 <= var3 + 75 && field950 >= var2 - 20 && field950 <= var2 + 20) {
				field283 = "";
				field284 = "Enter your username & password.";
				field307 = 2;
				field466 = 0;
			}
		} else if (field307 == 2) {
			int var4 = field933 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field948 == 1 && field950 >= var4 - 15 && field950 < var4) {
				field466 = 0;
			}

			var4 += 15;
			if (field948 == 1 && field950 >= var4 - 15 && field950 < var4) {
				field466 = 1;
			}

			var4 += 15;
			int var5 = field932 / 2 - 80;
			int var6 = field933 / 2 + 50;
			var6 += 20;
			if (field948 == 1 && field949 >= var5 - 75 && field949 <= var5 + 75 && field950 >= var6 - 20 && field950 <= var6 + 20) {
				field440 = 0;
				method147(field365, field366, false);

				if (field162) {
					return;
				}
			}

			int var7 = field932 / 2 + 80;
			if (field948 == 1 && field949 >= var7 - 75 && field949 <= var7 + 75 && field950 >= var6 - 20 && field950 <= var6 + 20) {
				field307 = 0;
				field365 = "";
				field366 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method321();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field407.length(); var10++) {
					if (var8 == field407.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field466 == 0) {
					if (var8 == 8 && field365.length() > 0) {
						field365 = field365.substring(0, field365.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field466 = 1;
					}

					if (var9) {
						field365 = field365 + (char) var8;
					}

					if (field365.length() > 12) {
						field365 = field365.substring(0, 12);
					}
				} else if (field466 == 1) {
					if (var8 == 8 && field366.length() > 0) {
						field366 = field366.substring(0, field366.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field466 = 0;
					}

					if (var9) {
						field366 = field366 + (char) var8;
					}

					if (field366.length() > 20) {
						field366 = field366.substring(0, 20);
					}
				}
			}
		} else if (field307 == 3) {
			int var11 = field932 / 2;
			int var12 = field933 / 2 + 50;
			var12 += 20;
			if (field948 == 1 && field949 >= var11 - 75 && field949 <= var11 + 75 && field950 >= var12 - 20 && field950 <= var12 + 20) {
				field307 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method115() {
		if (field71 == null) {
			method159();
			field935 = null;
			field263 = null;
			field264 = null;
			field265 = null;
			field266 = null;
			field267 = null;
			field268 = null;
			field269 = null;
			field270 = null;
			field271 = null;
			field71 = new HVBGFDBD(method128(), 96, 479);
			field69 = new HVBGFDBD(method128(), 156, 172);
			WNEQSCWL.method571();
			field164.method566(0, 0);
			field68 = new HVBGFDBD(method128(), 261, 190);
			field70 = new HVBGFDBD(method128(), 334, 512);
			WNEQSCWL.method571();
			field420 = new HVBGFDBD(method128(), 50, 496);
			field421 = new HVBGFDBD(method128(), 37, 269);
			field422 = new HVBGFDBD(method128(), 45, 249);
			field338 = true;
			field70.method223();
			DABPNVTX.field519 = field489;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method116() {
		if (field387 == 2) {
			for (HHSKUOEZ var1 = (HHSKUOEZ) field196.method33(); var1 != null; var1 = (HHSKUOEZ) field196.method35()) {
				if (var1.field659 > 0) {
					var1.field659--;
				}

				if (var1.field659 != 0) {
					if (var1.field660 > 0) {
						var1.field660--;
					}

					if (var1.field660 == 0 && var1.field657 >= 1 && var1.field658 >= 1 && var1.field657 <= 102 && var1.field658 <= 102 && (var1.field661 < 0 || KPOYRTLL.method247(var1.field661, var1.field663))) {
						method125(var1.field656, var1.field658, var1.field662, var1.field663, var1.field657, var1.field661, var1.field655);
						var1.field660 = -1;

						if (var1.field661 == var1.field652 && var1.field652 == -1) {
							var1.method505();
						} else if (var1.field661 == var1.field652 && var1.field662 == var1.field653 && var1.field663 == var1.field654) {
							var1.method505();
						}
					}
				} else if (var1.field652 < 0 || KPOYRTLL.method247(var1.field652, var1.field654)) {
					method125(var1.field656, var1.field658, var1.field653, var1.field654, var1.field657, var1.field652, var1.field655);
					var1.method505();
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method117(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field356; var3++) {
				if (field102[var3] == arg0) {
					field356--;
					field259 = true;

					for (int var4 = var3; var4 < field356; var4++) {
						field102[var4] = field102[var4 + 1];
					}

					field463.method444(202);
					field463.method451(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method118() {
		if (field245 && field387 == 2 && KPOYRTLL.field796 != field318) {
			method95(null, "Loading - please wait.");
			field387 = 1;
			field249 = System.currentTimeMillis();
		}

		if (field387 == 1) {
			int var1 = method119();
			if (var1 != 0 && System.currentTimeMillis() - field249 > 360000L) {
				signlink.reporterror(field365 + " glcfb " + field300 + "," + var1 + "," + field245 + "," + field258[0] + "," + field450.method339() + "," + field318 + "," + field281 + "," + field282);
				field249 = System.currentTimeMillis();
			}
		}

		if (field387 == 2 && field478 != field318) {
			field478 = field318;
			method156(field318);
		}
	}

	@ObfuscatedName("client.m(B)I")
	public final int method119() {
		for (int var1 = 0; var1 < field419.length; var1++) {
			if (field419[var1] == null && field148[var1] != -1) {
				return -1;
			}

			if (field355[var1] == null && field149[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field419.length; var3++) {
			byte[] var4 = field355[var3];
			if (var4 != null) {
				int var5 = (field147[var3] >> 8) * 64 - field191;
				int var6 = (field147[var3] & 0xFF) * 64 - field192;
				if (field293) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= KPOYRTLL.method263(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field352) {
			return -4;
		} else {
			field387 = 2;
			KPOYRTLL.field796 = field318;
			method77();
			field463.method444(92);
			return 0;
		}
	}

	public final void init() {
		field242 = Integer.parseInt(getParameter("nodeid"));
		field243 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method160();
		} else {
			method139();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field244 = false;
		} else {
			field244 = true;
		}

		method318(503, 765);
	}

	@ObfuscatedName("client.a([BZI)V")
	public final void method120(byte[] arg0, boolean arg1) {
		if (field138) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method121() {
		field69.method223();

		if (field136 == 2) {
			byte[] var1 = field164.field1444;
			int[] var2 = WNEQSCWL.field1452;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field346.method600(0, field221, 25, 0, 25, 256, 33, 33, field140, field109);
			field70.method223();
			DABPNVTX.field519 = field489;
		} else {
			int var5 = field414 + field140 & 0x7FF;
			int var6 = field181.field1217 / 32 + 48;
			int var7 = 464 - field181.field1218 / 32;
			field403.method600(5, field250, var6, 25, var7, field104 + 256, 146, 151, var5, field78);
			field346.method600(0, field221, 25, 0, 25, 256, 33, 33, field140, field109);

			for (int var8 = 0; var8 < field260; var8++) {
				int var9 = field261[var8] * 4 + 2 - field181.field1217 / 32;
				int var10 = field262[var8] * 4 + 2 - field181.field1218 / 32;
				method170(var10, var9, field484[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					CEEJCAVA var13 = field160[field318][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field181.field1217 / 32;
						int var15 = var12 * 4 + 2 - field181.field1218 / 32;
						method170(var15, var14, field234);
					}
				}
			}

			for (int var16 = 0; var16 < field116; var16++) {
				NVHCJIOR var17 = field115[field117[var16]];
				if (var17 != null && var17.method229()) {
					XDDMQHDR var18 = var17.field1051;
					if (var18.field1466 != null) {
						var18 = var18.method580();
					}

					if (var18 != null && var18.field1496 && var18.field1467) {
						int var19 = var17.field1217 / 32 - field181.field1217 / 32;
						int var20 = var17.field1218 / 32 - field181.field1218 / 32;
						method170(var20, var19, field235);
					}
				}
			}

			for (int var21 = 0; var21 < field97; var21++) {
				IGCQCHAY var22 = field96[field98[var21]];
				if (var22 != null && var22.method229()) {
					int var23 = var22.field1217 / 32 - field181.field1217 / 32;
					int var24 = var22.field1218 / 32 - field181.field1218 / 32;
					boolean var25 = false;
					long var26 = SJGLGRTK.method497(var22.field688);
					for (int var28 = 0; var28 < field375; var28++) {
						if (field248[var28] == var26 && field111[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field181.field687 != 0 && var22.field687 != 0 && field181.field687 == var22.field687) {
						var29 = true;
					}

					if (var25) {
						method170(var24, var23, field237);
					} else if (var29) {
						method170(var24, var23, field238);
					} else {
						method170(var24, var23, field236);
					}
				}
			}

			if (field339 != 0 && field205 % 20 < 10) {
				if (field339 == 1 && field106 >= 0 && field106 < field115.length) {
					NVHCJIOR var30 = field115[field106];
					if (var30 != null) {
						int var31 = var30.field1217 / 32 - field181.field1217 / 32;
						int var32 = var30.field1218 / 32 - field181.field1218 / 32;
						method138(field129, var31, var32);
					}
				}

				if (field339 == 2) {
					int var33 = (field323 - field191) * 4 + 2 - field181.field1217 / 32;
					int var34 = (field324 - field192) * 4 + 2 - field181.field1218 / 32;
					method138(field129, var33, var34);
				}

				if (field339 == 10 && field217 >= 0 && field217 < field96.length) {
					IGCQCHAY var35 = field96[field217];
					if (var35 != null) {
						int var36 = var35.field1217 / 32 - field181.field1217 / 32;
						int var37 = var35.field1218 / 32 - field181.field1218 / 32;
						method138(field129, var36, var37);
					}
				}
			}

			if (field401 != 0) {
				int var38 = field401 * 4 + 2 - field181.field1217 / 32;
				int var39 = field402 * 4 + 2 - field181.field1218 / 32;
				method170(var39, var38, field128);
			}

			WNEQSCWL.method573(78, 97, 0xFFFFFF, 3, 3);
			field70.method223();
			DABPNVTX.field519 = field489;
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method122() {
		field384++;
		method177(true);
		method110(true);
		method177(false);
		method110(false);
		method132();
		method86();

		if (!field77) {
			int var1 = field139;
			if (field206 / 256 > var1) {
				var1 = field206 / 256;
			}

			if (field218[4] && field157[4] + 128 > var1) {
				var1 = field157[4] + 128;
			}

			int var2 = field446 + field140 & 0x7FF;
			method172(method45(field181.field1217, field181.field1218, field318) - 50, var2, field408, var1, field409, var1 * 3 + 600);
		}

		int var3;
		if (field77) {
			var3 = method143();
		} else {
			var3 = method142();
		}

		int var4 = field393;
		int var5 = field394;
		int var6 = field395;
		int var7 = field396;
		int var8 = field397;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field218[var9]) {
				int var10 = (int) (Math.random() * (field480[var9] * 2 + 1) + Math.sin(field152[var9] / 100.0D * field280[var9]) * field157[var9] - field480[var9]);
				if (var9 == 0) {
					field393 += var10;
				}

				if (var9 == 1) {
					field394 += var10;
				}

				if (var9 == 2) {
					field395 += var10;
				}

				if (var9 == 3) {
					field397 = field397 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field396 += var10;
					if (field396 < 128) {
						field396 = 128;
					}

					if (field396 > 383) {
						field396 = 383;
					}
				}
			}
		}

		int var11 = DABPNVTX.field528;
		NGYJLUVS.field917 = true;
		NGYJLUVS.field920 = 0;
		NGYJLUVS.field918 = field942 - 4;
		NGYJLUVS.field919 = field943 - 4;
		WNEQSCWL.method571();
		field91.method403(field395, field394, field393, field397, field396, var3);
		field91.method378();
		method162();
		method79();
		method99(var11);
		method149();
		field70.method224(field934, 4, 4);
		field393 = var4;
		field394 = var5;
		field395 = var6;
		field396 = var7;
		field397 = var8;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method123(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method123(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method124(int arg0) {
		int var2 = TLLQKWNZ.field1393[arg0].field1401;
		if (var2 != 0) {
			int var3 = field154[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					DABPNVTX.method194(0.9D);
				}

				if (var3 == 2) {
					DABPNVTX.method194(0.8D);
				}

				if (var3 == 3) {
					DABPNVTX.method194(0.7D);
				}

				if (var3 == 4) {
					DABPNVTX.method194(0.6D);
				}

				BSBHBECI.field23.method442();
				field338 = true;
			}

			if (var2 == 3) {
				boolean var4 = field138;

				if (var3 == 0) {
					method51(0, field138);
					field138 = true;
				}

				if (var3 == 1) {
					method51(-400, field138);
					field138 = true;
				}

				if (var3 == 2) {
					method51(-800, field138);
					field138 = true;
				}

				if (var3 == 3) {
					method51(-1200, field138);
					field138 = true;
				}

				if (var3 == 4) {
					field138 = false;
				}

				if (field138 != var4 && !field245) {
					if (field138) {
						field150 = field211;
						field151 = true;
						field450.method337(2, field150);
					} else {
						method166();
					}

					field348 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field493 = true;
					method179(0);
				}

				if (var3 == 1) {
					field493 = true;
					method179(-400);
				}

				if (var3 == 2) {
					field493 = true;
					method179(-800);
				}

				if (var3 == 3) {
					field493 = true;
					method179(-1200);
				}

				if (var3 == 4) {
					field493 = false;
				}
			}

			if (var2 == 5) {
				field275 = var3;
			}

			if (var2 == 6) {
				field381 = var3;
			}

			if (var2 == 8) {
				field254 = var3;
				field195 = true;
			}

			if (var2 == 9) {
				field253 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZIII)V")
	public final void method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg1 >= 1 && arg4 <= 102 && arg1 <= 102) {
			if (field245 && field318 != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field91.method390(arg6, arg4, arg1);
			}

			if (arg0 == 1) {
				var8 = field91.method391(arg6, arg4, arg1);
			}

			if (arg0 == 2) {
				var8 = field91.method392(arg6, arg4, arg1);
			}

			if (arg0 == 3) {
				var8 = field91.method393(arg6, arg4, arg1);
			}

			if (var8 != 0) {
				int var12 = field91.method394(arg6, arg4, arg1, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field91.method381(arg1, arg6, arg4);
					NNXJFXRX var16 = NNXJFXRX.method323(var13);
					if (var16.field982) {
						field172[arg6].method10(arg1, var14, var16.field959, arg4, var15);
					}
				}

				if (arg0 == 1) {
					field91.method382(arg4, arg6, arg1);
				}

				if (arg0 == 2) {
					field91.method383(arg4, arg6, arg1);
					NNXJFXRX var17 = NNXJFXRX.method323(var13);
					if (var17.field997 + arg4 > 103 || var17.field997 + arg1 > 103 || var17.field987 + arg4 > 103 || var17.field987 + arg1 > 103) {
						return;
					}

					if (var17.field982) {
						field172[arg6].method11(var17.field997, arg4, var15, arg1, var17.field959, var17.field987);
					}
				}

				if (arg0 == 3) {
					field91.method384(arg4, arg1, arg6);
					NNXJFXRX var18 = NNXJFXRX.method323(var13);
					if (var18.field982 && var18.field973) {
						field172[arg6].method13(arg1, arg4);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (field272[1][arg4][arg1] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				KPOYRTLL.method253(field91, var19, arg6, arg3, field172[arg6], arg2, field367, arg5, arg1, arg4);
				return;
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method126(int arg0, int arg1) {
		CEEJCAVA var3 = field160[field318][arg0][arg1];
		if (var3 == null) {
			field91.method385(field318, arg0, arg1);
		} else {
			int var4 = -99999999;
			IMUKKQLH var5 = null;
			for (IMUKKQLH var6 = (IMUKKQLH) var3.method33(); var6 != null; var6 = (IMUKKQLH) var3.method35()) {
				BSBHBECI var7 = BSBHBECI.method22(var6.field710);
				int var8 = var7.field57;
				if (var7.field42) {
					var8 = (var6.field709 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method31(var5);
			IMUKKQLH var9 = null;
			IMUKKQLH var10 = null;
			for (IMUKKQLH var11 = (IMUKKQLH) var3.method33(); var11 != null; var11 = (IMUKKQLH) var3.method35()) {
				if (var5.field710 != var11.field710 && var9 == null) {
					var9 = var11;
				}

				if (var5.field710 != var11.field710 && var9.field710 != var11.field710 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field91.method371(var12, var5, var9, var10, arg0, field318, method45(arg0 * 128 + 64, arg1 * 128 + 64, field318), arg1);
		}
	}

	@ObfuscatedName("client.G(I)V")
	public void method127() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field354);

		if (field450 != null) {
			System.out.println("Od-cycle:" + field450.field1041);
		}

		System.out.println("loop-cycle:" + field205);
		System.out.println("draw-cycle:" + field166);
		System.out.println("ptype:" + field361);
		System.out.println("psize:" + field360);

		if (field295 != null) {
			field295.method511();
		}

		field931 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method128() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field937 != null) {
			return field937;
		}

		return this;
	}

	@ObfuscatedName("client.a(IIILQUBPQDMQ;I)V")
	public final void method129(int arg0, int arg1, QUBPQDMQ arg2, int arg3) {
		if (arg2.field1326 == 0 && arg2.field1337 != null && (!arg2.field1302 || field119 == arg2.field1309 || field334 == arg2.field1309 || field343 == arg2.field1309)) {
			int var5 = WNEQSCWL.field1457;
			int var6 = WNEQSCWL.field1455;
			int var7 = WNEQSCWL.field1458;
			int var8 = WNEQSCWL.field1456;
			WNEQSCWL.method570(arg0, arg2.field1299 + arg3, arg2.field1285 + arg0, arg3);
			int var9 = arg2.field1337.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field1273[var10] + arg0;
				int var12 = arg2.field1334[var10] + arg3 - arg1;
				QUBPQDMQ var13 = QUBPQDMQ.method435(arg2.field1337[var10]);
				var11 += var13.field1320;
				var12 += var13.field1277;

				if (var13.field1321 > 0) {
					method84(var13);
				}

				if (var13.field1326 == 0) {
					if (var13.field1298 > var13.field1296 - var13.field1299) {
						var13.field1298 = var13.field1296 - var13.field1299;
					}

					if (var13.field1298 < 0) {
						var13.field1298 = 0;
					}

					method129(var11, var13.field1298, var13, var12);

					if (var13.field1296 > var13.field1299) {
						method87(var13.field1296, var13.field1299, var13.field1285 + var11, var12, var13.field1298);
					}
				} else if (var13.field1326 != 1) {
					if (var13.field1326 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1299; var15++) {
							for (int var16 = 0; var16 < var13.field1285; var16++) {
								int var17 = (var13.field1304 + 32) * var16 + var11;
								int var18 = (var13.field1316 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1274[var14];
									var18 += var13.field1269[var14];
								}

								if (var13.field1301[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1301[var14] - 1;
									if (var17 > WNEQSCWL.field1457 - 32 && var17 < WNEQSCWL.field1458 && var18 > WNEQSCWL.field1455 - 32 && var18 < WNEQSCWL.field1456 || field503 != 0 && field502 == var14) {
										int var22 = 0;
										if (field120 == 1 && field121 == var14 && field122 == var13.field1309) {
											var22 = 0xFFFFFF;
										}

										ZSWNSCUQ var23 = BSBHBECI.method26(var13.field1292[var14], var22, var21);
										if (var23 != null) {
											if (field503 != 0 && field502 == var14 && field501 == var13.field1309) {
												var19 = field942 - field504;
												var20 = field943 - field505;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field174 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method598(var18 + var20, 128, var17 + var19);

												if (var18 + var20 < WNEQSCWL.field1455 && arg2.field1298 > 0) {
													int var24 = (WNEQSCWL.field1455 - var18 - var20) * field302 / 3;
													if (var24 > field302 * 10) {
														var24 = field302 * 10;
													}

													if (var24 > arg2.field1298) {
														var24 = arg2.field1298;
													}

													arg2.field1298 -= var24;
													field505 += var24;
												}

												if (var18 + var20 + 32 > WNEQSCWL.field1456 && arg2.field1298 < arg2.field1296 - arg2.field1299) {
													int var25 = (var18 + var20 + 32 - WNEQSCWL.field1456) * field302 / 3;
													if (var25 > field302 * 10) {
														var25 = field302 * 10;
													}

													if (var25 > arg2.field1296 - arg2.field1299 - arg2.field1298) {
														var25 = arg2.field1296 - arg2.field1299 - arg2.field1298;
													}

													arg2.field1298 += var25;
													field505 -= var25;
												}
											} else if (field171 != 0 && field170 == var14 && field169 == var13.field1309) {
												var23.method598(var18, 128, var17);
											} else {
												var23.method596(var17, var18);
											}

											if (var23.field1516 == 33 || var13.field1292[var14] != 1) {
												int var26 = var13.field1292[var14];
												field288.method275(0, method89(var26), var18 + var20 + 10, var17 + 1 + var19);
												field288.method275(0xFFFF00, method89(var26), var18 + var20 + 9, var17 + var19);
											}
										}
									}
								} else if (var13.field1282 != null && var14 < 20) {
									ZSWNSCUQ var27 = var13.field1282[var14];
									if (var27 != null) {
										var27.method596(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1326 == 3) {
						boolean var28 = false;
						if (field343 == var13.field1309 || field334 == var13.field1309 || field119 == var13.field1309) {
							var28 = true;
						}

						int var29;
						if (method165(var13)) {
							var29 = var13.field1270;
							if (var28 && var13.field1311 != 0) {
								var29 = var13.field1311;
							}
						} else {
							var29 = var13.field1284;
							if (var28 && var13.field1294 != 0) {
								var29 = var13.field1294;
							}
						}

						if (var13.field1333 == 0) {
							if (var13.field1329) {
								WNEQSCWL.method573(var12, var11, var29, var13.field1299, var13.field1285);
							} else {
								WNEQSCWL.method574(var13.field1299, var12, var11, var29, var13.field1285);
							}
						} else if (var13.field1329) {
							WNEQSCWL.method572(var13.field1299, 256 - (var13.field1333 & 0xFF), var12, var13.field1285, var11, var29);
						} else {
							WNEQSCWL.method575(var13.field1285, var13.field1299, var11, 256 - (var13.field1333 & 0xFF), var12, var29);
						}
					} else if (var13.field1326 == 4) {
						MGTPXZHY var30 = var13.field1328;
						String var31 = var13.field1291;
						boolean var32 = false;
						if (field343 == var13.field1309 || field334 == var13.field1309 || field119 == var13.field1309) {
							var32 = true;
						}

						int var33;
						if (method165(var13)) {
							var33 = var13.field1270;
							if (var32 && var13.field1311 != 0) {
								var33 = var13.field1311;
							}

							if (var13.field1290.length() > 0) {
								var31 = var13.field1290;
							}
						} else {
							var33 = var13.field1284;
							if (var32 && var13.field1294 != 0) {
								var33 = var13.field1294;
							}
						}

						if (var13.field1310 == 6 && field112) {
							var31 = "Please wait...";
							var33 = var13.field1284;
						}

						if (WNEQSCWL.field1453 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field824 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method175(method61(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method175(method61(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method175(method61(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method175(method61(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method175(method61(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1340) {
								var30.method272(var34, var33, var13.field1317, var13.field1285 / 2 + var11, var41);
							} else {
								var30.method279(var41, var11, var34, var13.field1317, var33);
							}

							var34 += var30.field824;
						}
					} else if (var13.field1326 == 5) {
						ZSWNSCUQ var42;
						if (method165(var13)) {
							var42 = var13.field1276;
						} else {
							var42 = var13.field1315;
						}

						if (var42 != null) {
							var42.method596(var11, var12);
						}
					} else if (var13.field1326 == 6) {
						int var43 = DABPNVTX.field513;
						int var44 = DABPNVTX.field514;
						DABPNVTX.field513 = var13.field1285 / 2 + var11;
						DABPNVTX.field514 = var13.field1299 / 2 + var12;
						int var45 = DABPNVTX.field517[var13.field1307] * var13.field1306 >> 16;
						int var46 = DABPNVTX.field518[var13.field1307] * var13.field1306 >> 16;
						boolean var47 = method165(var13);
						int var48;
						if (var47) {
							var48 = var13.field1280;
						} else {
							var48 = var13.field1279;
						}

						NGYJLUVS var49;
						if (var48 == -1) {
							var49 = var13.method439(-1, -1, var47);
						} else {
							KAIFCIAJ var50 = KAIFCIAJ.field742[var48];
							var49 = var13.method439(var50.field745[var13.field1336], var50.field744[var13.field1336], var47);
						}

						if (var49 != null) {
							var49.method312(0, var13.field1308, 0, var13.field1307, 0, var45, var46);
						}

						DABPNVTX.field513 = var43;
						DABPNVTX.field514 = var44;
					} else {
						if (var13.field1326 == 7) {
							MGTPXZHY var51 = var13.field1328;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1299; var53++) {
								for (int var54 = 0; var54 < var13.field1285; var54++) {
									if (var13.field1301[var52] > 0) {
										BSBHBECI var55 = BSBHBECI.method22(var13.field1301[var52] - 1);
										String var56 = String.valueOf(var55.field55);
										if (var55.field42 || var13.field1292[var52] != 1) {
											var56 = var56 + " x" + method63(var13.field1292[var52]);
										}

										int var57 = (var13.field1304 + 115) * var54 + var11;
										int var58 = (var13.field1316 + 12) * var53 + var12;
										if (var13.field1340) {
											var51.method272(var58, var13.field1284, var13.field1317, var13.field1285 / 2 + var57, var56);
										} else {
											var51.method279(var56, var57, var58, var13.field1317, var13.field1284);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1326 == 8 && (field442 == var13.field1309 || field438 == var13.field1309 || field333 == var13.field1309) && field255 == 100) {
							int var59 = 0;
							int var60 = 0;
							MGTPXZHY var61 = field289;
							String var62 = var13.field1291;
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

								var60 += var61.field824 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1285 + var11 - var59 - 5;
							int var67 = var13.field1299 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field1285 + arg0) {
								var66 = arg2.field1285 + arg0 - var59;
							}

							if (var60 + var67 > arg2.field1299 + arg3) {
								var67 = arg2.field1299 + arg3 - var60;
							}

							WNEQSCWL.method573(var67, var66, 0xFFFFA0, var60, var59);
							WNEQSCWL.method574(var60, var67, var66, 0, var59);
							String var68 = var13.field1291;
							int var69 = var61.field824 + var67 + 2;
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

								var61.method279(var71, var66 + 3, var69, false, 0);
								var69 += var61.field824 + 1;
							}
						}
					}
				}
			}

			WNEQSCWL.method570(var5, var8, var7, var6);
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method130() {
		if (field136 == 0 && field948 == 1) {
			int var1 = field949 - 25 - 550;
			int var2 = field950 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field414 + field140 & 0x7FF;
				int var4 = DABPNVTX.field517[var3];
				int var5 = DABPNVTX.field518[var3];
				var4 = (field104 + 256) * var4 >> 8;
				var5 = (field104 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field181.field1217 + var6 >> 7;
				int var9 = field181.field1218 - var7 >> 7;
				boolean var10 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, true, 1, var8, var9);
				if (var10) {
					field463.method445(var1);
					field463.method445(var2);
					field463.method446(field140);
					field463.method445(57);
					field463.method445(field414);
					field463.method445(field104);
					field463.method445(89);
					field463.method446(field181.field1217);
					field463.method446(field181.field1218);
					field463.method445(field277);
					field463.method445(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LRGCGKKUR;ZI)V")
	public final void method131(RGCGKKUR arg0, int arg1) {
		if (arg1 == 100) {
			int var3 = arg0.method455();
			int var4 = (var3 >> 4 & 0x7) + field485;
			int var5 = (var3 & 0x7) + field486;
			int var6 = var4 + arg0.method456();
			int var7 = var5 + arg0.method456();
			int var8 = arg0.method458();
			int var9 = arg0.method457();
			int var10 = arg0.method455() * 4;
			int var11 = arg0.method455() * 4;
			int var12 = arg0.method457();
			int var13 = arg0.method457();
			int var14 = arg0.method455();
			int var15 = arg0.method455();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 != 0xFFFF) {
				var4 = var4 * 128 + 64;
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				var7 = var7 * 128 + 64;
				HDKZMJGE var16 = new HDKZMJGE(var4, var11, var5, var14, var15, var8, method45(var4, var5, field318) - var10, var9, field205 + var13, field205 + var12, field318);
				var16.method217(var6, method45(var6, var7, field318) - var11, var7, field205 + var12);
				field483.method30(var16);
			}
		} else if (arg1 == 173) {
			int var17 = arg0.method483();
			int var18 = arg0.method482();
			int var19 = arg0.method474();
			int var20 = (var19 >> 4 & 0x7) + field485;
			int var21 = (var19 & 0x7) + field486;
			int var22 = arg0.method482();
			if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104 && field457 != var22) {
				IMUKKQLH var23 = new IMUKKQLH();
				var23.field710 = var18;
				var23.field709 = var17;

				if (field160[field318][var20][var21] == null) {
					field160[field318][var20][var21] = new CEEJCAVA();
				}

				field160[field318][var20][var21].method30(var23);
				method126(var20, var21);
			}
		} else if (arg1 == 241) {
			int var24 = arg0.method483();
			int var25 = arg0.method455();
			int var26 = (var25 >> 4 & 0x7) + field485;
			int var27 = (var25 & 0x7) + field486;
			int var28 = arg0.method455();
			int var29 = var28 >> 2;
			int var30 = var28 & 0x3;
			int var31 = field305[var29];
			if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
				method98(0, var24, var26, var27, var30, var29, var31, field318, -1);
			}
		} else {
			if (arg1 == 1) {
				int var32 = arg0.method482();
				int var33 = arg0.method481();
				byte var34 = arg0.method476();
				int var35 = arg0.method475();
				int var36 = var35 >> 2;
				int var37 = var35 & 0x3;
				int var38 = field305[var36];
				byte var39 = arg0.method477();
				int var40 = arg0.method482();
				int var41 = arg0.method482();
				byte var42 = arg0.method476();
				byte var43 = arg0.method476();
				int var44 = arg0.method474();
				int var45 = (var44 >> 4 & 0x7) + field485;
				int var46 = (var44 & 0x7) + field486;
				IGCQCHAY var47;
				if (field457 == var41) {
					var47 = field181;
				} else {
					var47 = field96[var41];
				}

				if (var47 != null) {
					NNXJFXRX var48 = NNXJFXRX.method323(var40);
					int var49 = field367[field318][var45][var46];
					int var50 = field367[field318][var45 + 1][var46];
					int var51 = field367[field318][var45 + 1][var46 + 1];
					int var52 = field367[field318][var45][var46 + 1];
					NGYJLUVS var53 = var48.method328(var36, var37, var49, var50, var51, var52, -1);
					if (var53 != null) {
						method98(var32 + 1, -1, var45, var46, 0, 0, var38, field318, var33 + 1);
						var47.field675 = field205 + var32;
						var47.field676 = field205 + var33;
						var47.field680 = var53;
						int var54 = var48.field997;
						int var55 = var48.field987;
						if (var37 == 1 || var37 == 3) {
							var54 = var48.field987;
							var55 = var48.field997;
						}

						var47.field677 = var45 * 128 + var54 * 64;
						var47.field679 = var46 * 128 + var55 * 64;
						var47.field678 = method45(var47.field677, var47.field679, field318);

						if (var34 > var39) {
							byte var56 = var34;
							var34 = var39;
							var39 = var56;
						}

						if (var42 > var43) {
							byte var57 = var42;
							var42 = var43;
							var43 = var57;
						}

						var47.field683 = var34 + var45;
						var47.field685 = var39 + var45;
						var47.field684 = var42 + var46;
						var47.field686 = var43 + var46;
					}
				}
			}

			if (arg1 == 69) {
				int var58 = arg0.method455();
				int var59 = (var58 >> 4 & 0x7) + field485;
				int var60 = (var58 & 0x7) + field486;
				int var61 = arg0.method457();
				int var62 = arg0.method455();
				int var63 = var62 >> 4 & 0xF;
				int var64 = var62 & 0x7;
				if (field181.field1225[0] >= var59 - var63 && field181.field1225[0] <= var59 + var63 && field181.field1226[0] >= var60 - var63 && field181.field1226[0] <= var60 + var63 && field493 && !field245 && field183 < 50) {
					field383[field183] = var61;
					field276[field183] = var64;
					field73[field183] = GRRWPPAT.field617[var61];
					field183++;
				}
			}

			if (arg1 == 57) {
				int var65 = arg0.method455();
				int var66 = var65 >> 2;
				int var67 = var65 & 0x3;
				int var68 = field305[var66];
				int var69 = arg0.method475();
				int var70 = (var69 >> 4 & 0x7) + field485;
				int var71 = (var69 & 0x7) + field486;
				if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
					method98(0, -1, var70, var71, var67, var66, var68, field318, -1);
				}
			} else if (arg1 == 220) {
				int var72 = arg0.method475();
				int var73 = (var72 >> 4 & 0x7) + field485;
				int var74 = (var72 & 0x7) + field486;
				int var75 = arg0.method481();
				if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
					CEEJCAVA var76 = field160[field318][var73][var74];
					if (var76 != null) {
						for (IMUKKQLH var77 = (IMUKKQLH) var76.method33(); var77 != null; var77 = (IMUKKQLH) var76.method35()) {
							if ((var75 & 0x7FFF) == var77.field710) {
								var77.method505();
								break;
							}
						}

						if (var76.method33() == null) {
							field160[field318][var73][var74] = null;
						}

						method126(var73, var74);
					}
				}
			} else if (arg1 == 194) {
				int var78 = arg0.method455();
				int var79 = (var78 >> 4 & 0x7) + field485;
				int var80 = (var78 & 0x7) + field486;
				int var81 = arg0.method457();
				int var82 = arg0.method457();
				int var83 = arg0.method457();
				if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
					CEEJCAVA var84 = field160[field318][var79][var80];
					if (var84 != null) {
						for (IMUKKQLH var85 = (IMUKKQLH) var84.method33(); var85 != null; var85 = (IMUKKQLH) var84.method35()) {
							if ((var81 & 0x7FFF) == var85.field710 && var85.field709 == var82) {
								var85.field709 = var83;
								break;
							}
						}

						method126(var79, var80);
					}
				}
			} else if (arg1 == 137) {
				int var86 = arg0.method455();
				int var87 = (var86 >> 4 & 0x7) + field485;
				int var88 = (var86 & 0x7) + field486;
				int var89 = arg0.method457();
				int var90 = arg0.method455();
				int var91 = arg0.method457();
				if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
					var87 = var87 * 128 + 64;
					var88 = var88 * 128 + 64;
					FFLRYPKA var92 = new FFLRYPKA(field205, var89, method45(var87, var88, field318) - var90, var88, var91, field318, var87);
					field477.method30(var92);
				}
			} else if (arg1 == 128) {
				int var93 = arg0.method457();
				int var94 = arg0.method455();
				int var95 = (var94 >> 4 & 0x7) + field485;
				int var96 = (var94 & 0x7) + field486;
				int var97 = arg0.method455();
				int var98 = var97 >> 2;
				int var99 = var97 & 0x3;
				int var100 = field305[var98];
				if (var95 >= 0 && var96 >= 0 && var95 < 103 && var96 < 103) {
					int var101 = field367[field318][var95][var96];
					int var102 = field367[field318][var95 + 1][var96];
					int var103 = field367[field318][var95 + 1][var96 + 1];
					int var104 = field367[field318][var95][var96 + 1];
					if (var100 == 0) {
						NPZGHJZQ var105 = field91.method386(field318, var96, var95);
						if (var105 != null) {
							int var106 = var105.field1010 >> 14 & 0x7FFF;
							if (var98 == 2) {
								var105.field1008 = new QHSYTCMW(var102, var99 + 4, var103, var104, 2, var101, var93, false, var106);
								var105.field1009 = new QHSYTCMW(var102, var99 + 1 & 0x3, var103, var104, 2, var101, var93, false, var106);
							} else {
								var105.field1008 = new QHSYTCMW(var102, var99, var103, var104, var98, var101, var93, false, var106);
							}
						}
					}

					if (var100 == 1) {
						NFJUXSBS var107 = field91.method387(var95, var96, field318);
						if (var107 != null) {
							var107.field851 = new QHSYTCMW(var102, 0, var103, var104, 4, var101, var93, false, var107.field852 >> 14 & 0x7FFF);
						}
					}

					if (var100 == 2) {
						ENMOFEEO var108 = field91.method388(var95, var96, field318);

						if (var98 == 11) {
							var98 = 10;
						}

						if (var108 != null) {
							var108.field576 = new QHSYTCMW(var102, var99, var103, var104, var98, var101, var93, false, var108.field584 >> 14 & 0x7FFF);
						}
					}

					if (var100 == 3) {
						YHCHDRVT var109 = field91.method389(field318, var96, var95);
						if (var109 != null) {
							var109.field1502 = new QHSYTCMW(var102, var99, var103, var104, 22, var101, var93, false, var109.field1503 >> 14 & 0x7FFF);
						}
					}
				}
			} else if (arg1 == 51) {
				int var110 = arg0.method483();
				int var111 = arg0.method474();
				int var112 = (var111 >> 4 & 0x7) + field485;
				int var113 = (var111 & 0x7) + field486;
				int var114 = arg0.method457();
				if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
					IMUKKQLH var115 = new IMUKKQLH();
					var115.field710 = var110;
					var115.field709 = var114;

					if (field160[field318][var112][var113] == null) {
						field160[field318][var112][var113] = new CEEJCAVA();
					}

					field160[field318][var112][var113].method30(var115);
					method126(var112, var113);
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method132() {
		for (HDKZMJGE var1 = (HDKZMJGE) field483.method33(); var1 != null; var1 = (HDKZMJGE) field483.method35()) {
			if (field318 != var1.field644 || field205 > var1.field630) {
				var1.method505();
			} else if (field205 >= var1.field629) {
				if (var1.field643 > 0) {
					NVHCJIOR var2 = field115[var1.field643 - 1];
					if (var2 != null && var2.field1217 >= 0 && var2.field1217 < 13312 && var2.field1218 >= 0 && var2.field1218 < 13312) {
						var1.method217(var2.field1217, method45(var2.field1217, var2.field1218, var1.field644) - var1.field639, var2.field1218, field205);
					}
				}

				if (var1.field643 < 0) {
					int var3 = -var1.field643 - 1;
					IGCQCHAY var4;
					if (field457 == var3) {
						var4 = field181;
					} else {
						var4 = field96[var3];
					}

					if (var4 != null && var4.field1217 >= 0 && var4.field1217 < 13312 && var4.field1218 >= 0 && var4.field1218 < 13312) {
						var1.method217(var4.field1217, method45(var4.field1217, var4.field1218, var1.field644) - var1.field639, var4.field1218, field205);
					}
				}

				var1.method218(field302);
				field91.method375((int) var1.field634, (int) var1.field635, -1, var1.field645, field318, false, (int) var1.field633, var1, 60);
			}
		}
	}

	@ObfuscatedName("client.b(ILRGCGKKUR;I)V")
	public final void method133(int arg0, RGCGKKUR arg1) {
		field130 = 0;
		field99 = 0;
		method96(arg1, arg0);
		method152(arg1, arg0);
		method40(arg1, arg0);
		method107(arg0, arg1);

		for (int var3 = 0; var3 < field130; var3++) {
			int var4 = field131[var3];
			if (field205 != field96[var4].field1241) {
				field96[var4] = null;
			}
		}

		if (arg1.field1350 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1350 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field97; var5++) {
			if (field96[field98[var5]] == null) {
				signlink.reporterror(field365 + " null entry in pl list - pos:" + var5 + " size:" + field97);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method134(long arg0) {
		if (arg0 != 0L) {
			if (field375 >= 100 && field413 != 1) {
				method163("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else if (field375 >= 200) {
				method163("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else {
				String var3 = SJGLGRTK.method501(SJGLGRTK.method498(arg0));
				for (int var4 = 0; var4 < field375; var4++) {
					if (field248[var4] == arg0) {
						method163(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field356; var5++) {
					if (field102[var5] == arg0) {
						method163("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field181.field688)) {
					field400[field375] = var3;
					field248[field375] = arg0;
					field111[field375] = 0;
					field375++;
					field259 = true;
					field463.method444(73);
					field463.method451(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(LQUBPQDMQ;I)Z")
	public final boolean method135(QUBPQDMQ arg0) {
		int var2 = arg0.field1321;
		if (field376 == 2) {
			if (var2 == 201) {
				field195 = true;
				field357 = 0;
				field203 = true;
				field223 = "";
				field368 = 1;
				field342 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field195 = true;
				field357 = 0;
				field203 = true;
				field223 = "";
				field368 = 2;
				field342 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field364 = 250;
			return true;
		}

		if (var2 == 501) {
			field195 = true;
			field357 = 0;
			field203 = true;
			field223 = "";
			field368 = 4;
			field342 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field195 = true;
			field357 = 0;
			field203 = true;
			field223 = "";
			field368 = 5;
			field342 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field308[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = IIATCLSX.field701 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= IIATCLSX.field701) {
							var5 = 0;
						}
					}

					if (!IIATCLSX.field702[var5].field708 && IIATCLSX.field702[var5].field703 == var3 + (field461 ? 0 : 7)) {
						break;
					}
				}

				field308[var3] = var5;
				field386 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field76[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field220[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field220[var6].length) {
					var8 = 0;
				}
			}

			field76[var6] = var8;
			field386 = true;
		}

		if (var2 == 324 && !field461) {
			field461 = true;
			method100();
		}

		if (var2 == 325 && field461) {
			field461 = false;
			method100();
		}

		if (var2 == 326) {
			field463.method444(140);
			field463.method445(field461 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field463.method445(field308[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field463.method445(field76[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field491 = !field491;
		}

		if (var2 >= 601 && var2 <= 613) {
			method58();

			if (field213.length() > 0) {
				field463.method444(187);
				field463.method451(SJGLGRTK.method497(field213));
				field463.method445(var2 - 601);
				field463.method445(field491 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.b(ILOZYWPVDM;I)V")
	public final void method136(OZYWPVDM arg0, int arg1) {
		method137(arg0.field1218, arg1, arg0.field1217);
	}

	@ObfuscatedName("client.a(IIZI)V")
	public final void method137(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method45(arg2, arg0, field318) - arg1;
			arg2 -= field393;
			var4 -= field394;
			arg0 -= field395;
			int var5 = NGYJLUVS.field922[field396];
			int var6 = NGYJLUVS.field923[field396];
			int var7 = NGYJLUVS.field922[field397];
			int var8 = NGYJLUVS.field923[field397];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field145 = (var9 << 9) / arg0 + DABPNVTX.field513;
				field146 = (var11 << 9) / arg0 + DABPNVTX.field514;
			} else {
				field145 = -1;
				field146 = -1;
			}
		} else {
			field145 = -1;
			field146 = -1;
		}
	}

	@ObfuscatedName("client.a(LZSWNSCUQ;ZII)V")
	public final void method138(ZSWNSCUQ arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field414 + field140 & 0x7FF;
			int var6 = NGYJLUVS.field922[var5];
			int var7 = NGYJLUVS.field923[var5];
			var6 = var6 * 256 / (field104 + 256);
			var7 = var7 * 256 / (field104 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field225.method601(var10, 83 - var13 - 20, var12 + 94 + 4 - 10, 20, 15, 256, 20, 15);
		} else {
			method170(arg2, arg1, arg0);
		}
	}

	public final void run() {
		if (field475) {
			method92();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.J(I)V")
	public static final void method139() {
		OUUKQIMK.field1101 = false;
		DABPNVTX.field508 = false;
		field245 = false;
		KPOYRTLL.field805 = false;
		NNXJFXRX.field971 = false;
	}

	@ObfuscatedName("client.f(II)V")
	public final void method140(int arg0) {
		if (arg0 >= 0) {
			int var2 = field311[arg0];
			int var3 = field312[arg0];
			int var4 = field313[arg0];
			int var5 = field314[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field357 != 0 && var4 != 1033) {
				field357 = 0;
				field195 = true;
			}

			if (var4 == 695 && method153(var3, var5, var2)) {
				field463.method444(106);
				field463.method480(field123);
				field463.method446(field192 + var3);
				field463.method478(field191 + var2);
				field463.method479(field122);
				field463.method478(field121);
				field463.method479(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 822) {
				IGCQCHAY var6 = field96[var5];
				if (var6 != null) {
					method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var6.field1225[0], var6.field1226[0]);
					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(190);
					field463.method479(field495);
					field463.method480(var5);
				}
			}

			if (var4 == 716) {
				IGCQCHAY var7 = field96[var5];
				if (var7 != null) {
					method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var7.field1225[0], var7.field1226[0]);
					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(169);
					field463.method478(var5);
				}
			}

			if (var4 == 549) {
				if (field467) {
					field91.method402(var3 - 4, var2 - 4);
				} else {
					field91.method402(field950 - 4, field949 - 4);
				}
			}

			if (var4 == 598) {
				QUBPQDMQ var8 = QUBPQDMQ.method435(var3);
				field494 = 1;
				field495 = var3;
				field496 = var8.field1318;
				field120 = 0;
				field259 = true;
				String var9 = var8.field1300;
				if (var9.indexOf(" ") != -1) {
					var9 = var9.substring(0, var9.indexOf(" "));
				}

				String var10 = var8.field1300;
				if (var10.indexOf(" ") != -1) {
					var10 = var10.substring(var10.indexOf(" ") + 1);
				}

				field497 = var9 + " " + var8.field1281 + " " + var10;

				if (field496 == 16) {
					field259 = true;
					field464 = 3;
					field374 = true;
				}
			} else if (var4 == 960) {
				field120 = 1;
				field121 = var2;
				field122 = var3;
				field123 = var5;
				field124 = String.valueOf(BSBHBECI.method22(var5).field55);
				field494 = 0;
				field259 = true;
			} else {
				if (var4 == 144) {
					NVHCJIOR var11 = field115[var5];
					if (var11 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var11.field1225[0], var11.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;

						if ((var5 & 0x3) == 0) {
							field359++;
						}

						if (field359 >= 106) {
							field463.method444(32);
							field463.method446(55586);
							field359 = 0;
						}

						field463.method444(18);
						field463.method479(var5);
					}
				}

				if (var4 == 480) {
					IGCQCHAY var12 = field96[var5];
					if (var12 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var12.field1225[0], var12.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field506 += var5;
						if (field506 >= 89) {
							field463.method444(85);
							field463.method449(0);
							field506 = 0;
						}

						field463.method444(113);
						field463.method446(var5);
					}
				}

				if (var4 == 744) {
					NVHCJIOR var13 = field115[var5];
					if (var13 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var13.field1225[0], var13.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field463.method444(105);
						field463.method446(var5);
					}
				}

				if (var4 == 651) {
					IGCQCHAY var14 = field96[var5];
					if (var14 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var14.field1225[0], var14.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field463.method444(138);
						field463.method478(var5);
					}
				}

				if (var4 == 541) {
					String var15 = field173[arg0];
					int var16 = var15.indexOf("@whi@");
					if (var16 != -1) {
						if (field304 == -1) {
							method58();
							field213 = var15.substring(var16 + 5).trim();
							field491 = false;
							field75 = field304 = QUBPQDMQ.field1305;
						} else {
							method163("Please close the interface you have open before using 'report abuse'", 0, "");
						}
					}
				}

				if (var4 == 881) {
					NVHCJIOR var17 = field115[var5];
					if (var17 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var17.field1225[0], var17.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field465 += var5;
						if (field465 >= 132) {
							field463.method444(20);
							field463.method449(0);
							field465 = 0;
						}

						field463.method444(148);
						field463.method480(var5);
					}
				}

				if (var4 == 125) {
					field463.method444(90);
					field463.method480(var5);
					field463.method478(var2);
					field463.method478(var3);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 579) {
					method58();
				}

				if (var4 == 183 && method153(var3, var5, var2)) {
					field463.method444(55);
					field463.method480(var5 >> 14 & 0x7FFF);
					field463.method446(field191 + var2);
					field463.method478(field192 + var3);
					field463.method479(field495);
				}

				if (var4 == 138 || var4 == 997 || var4 == 154 || var4 == 837) {
					String var18 = field173[arg0];
					int var19 = var18.indexOf("@whi@");
					if (var19 != -1) {
						long var20 = SJGLGRTK.method497(var18.substring(var19 + 5).trim());
						if (var4 == 138) {
							method134(var20);
						}

						if (var4 == 997) {
							method176(var20);
						}

						if (var4 == 154) {
							method151(var20);
						}

						if (var4 == 837) {
							method117(var20);
						}
					}
				}

				if (var4 == 322 && !field112) {
					field463.method444(185);
					field463.method446(var3);
					field112 = true;
				}

				if (var4 == 669) {
					boolean var22 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, false, 2, var2, var3);
					if (!var22) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var2, var3);
					}

					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(172);
					field463.method480(var5);
					field463.method480(field191 + var2);
					field463.method446(field192 + var3);
				}

				if (var4 == 551) {
					field463.method444(8);
					field463.method479(var5);
					field463.method478(var2);
					field463.method446(var3);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 559) {
					method39(field297);
					field297 = -1;
					field195 = true;
				}

				if (var4 == 264) {
					IGCQCHAY var24 = field96[var5];
					if (var24 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var24.field1225[0], var24.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field463.method444(75);
						field463.method478(var5);
					}
				}

				if (var4 == 78) {
					boolean var25 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, false, 2, var2, var3);
					if (!var25) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var2, var3);
					}

					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(119);
					field463.method479(field191 + var2);
					field463.method480(var5);
					field463.method480(field192 + var3);
				}

				if (var4 == 59) {
					NVHCJIOR var27 = field115[var5];
					if (var27 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var27.field1225[0], var27.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field463.method444(57);
						field463.method480(var5);
					}
				}

				if (var4 == 1103) {
					method153(var3, var5, var2);
					field463.method444(109);
					field463.method478(field192 + var3);
					field463.method478(field191 + var2);
					field463.method479(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 354) {
					NVHCJIOR var28 = field115[var5];
					if (var28 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var28.field1225[0], var28.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field463.method444(49);
						field463.method479(var5);
					}
				}

				if (var4 == 1977) {
					BSBHBECI var29 = BSBHBECI.method22(var5);
					String var30;
					if (var29.field36 == null) {
						var30 = "It's a " + var29.field55 + ".";
					} else {
						var30 = new String(var29.field36);
					}

					method163(var30, 0, "");
				}

				if (var4 == 891) {
					QUBPQDMQ var31 = QUBPQDMQ.method435(var3);
					boolean var32 = true;
					if (var31.field1321 > 0) {
						var32 = method135(var31);
					}

					if (var32) {
						field463.method444(211);
						field463.method446(var3);
					}
				}

				if (var4 == 163) {
					boolean var33 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, false, 2, var2, var3);
					if (!var33) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var2, var3);
					}

					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(86);
					field463.method446(field121);
					field463.method480(var5);
					field463.method478(field123);
					field463.method446(field122);
					field463.method478(field191 + var2);
					field463.method478(field192 + var3);
				}

				if (var4 == 288) {
					if ((field191 & 0x3) == 0) {
						field451++;
					}

					if (field451 >= 107) {
						field463.method444(156);
						field463.method449(0);
						field451 = 0;
					}

					method153(var3, var5, var2);
					field463.method444(7);
					field463.method478(field192 + var3);
					field463.method478(var5 >> 14 & 0x7FFF);
					field463.method446(field191 + var2);
				}

				if (var4 == 405) {
					IGCQCHAY var35 = field96[var5];
					if (var35 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var35.field1225[0], var35.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field463.method444(130);
						field463.method446(field122);
						field463.method480(var5);
						field463.method480(field123);
						field463.method478(field121);
					}
				}

				if (var4 == 740) {
					boolean var36 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, false, 2, var2, var3);
					if (!var36) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var2, var3);
					}

					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(192);
					field463.method480(field192 + var3);
					field463.method480(field191 + var2);
					field463.method480(var5);
				}

				if (var4 == 708) {
					NVHCJIOR var38 = field115[var5];
					if (var38 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var38.field1225[0], var38.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field463.method444(235);
						field463.method480(field122);
						field463.method480(field121);
						field463.method480(var5);
						field463.method446(field123);
					}
				}

				if (var4 == 840) {
					field463.method444(131);
					field463.method480(var2);
					field463.method446(var3);
					field463.method479(var5);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 1219) {
					NVHCJIOR var39 = field115[var5];
					if (var39 != null) {
						XDDMQHDR var40 = var39.field1051;
						if (var40.field1466 != null) {
							var40 = var40.method580();
						}

						if (var40 != null) {
							String var41;
							if (var40.field1470 == null) {
								var41 = "It's a " + var40.field1498 + ".";
							} else {
								var41 = new String(var40.field1470);
							}

							method163(var41, 0, "");
						}
					}
				}

				if (var4 == 769) {
					field353 += var3;
					if (field353 >= 97) {
						field463.method444(16);
						field463.method446(43274);
						field353 = 0;
					}

					method153(var3, var5, var2);
					field463.method444(145);
					field463.method480(field191 + var2);
					field463.method478(field192 + var3);
					field463.method478(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 682) {
					field463.method444(211);
					field463.method446(var3);
					QUBPQDMQ var42 = QUBPQDMQ.method435(var3);
					if (var42.field1341 != null && var42.field1341[0][0] == 5) {
						int var43 = var42.field1341[0][1];
						field154[var43] = 1 - field154[var43];
						method124(var43);
						field259 = true;
					}
				}

				if (var4 == 330) {
					field463.method444(78);
					field463.method446(var5);
					field463.method478(var3);
					field463.method446(var2);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 283) {
					IGCQCHAY var44 = field96[var5];
					if (var44 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var44.field1225[0], var44.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field204 += var5;
						if (field204 >= 88) {
							field463.method444(163);
							field463.method446(5996);
							field204 = 0;
						}

						field463.method444(99);
						field463.method446(var5);
					}
				}

				if (var4 == 688) {
					field416 += var5;
					if (field416 >= 119) {
						field463.method444(205);
						field463.method446(11544);
						field416 = 0;
					}

					field463.method444(242);
					field463.method479(var2);
					field463.method478(var5);
					field463.method478(var3);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 261) {
					field463.method444(183);
					field463.method479(var2);
					field463.method479(var3);
					field463.method480(var5);
					field463.method478(field495);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 946) {
					String var45 = field173[arg0];
					int var46 = var45.indexOf("@whi@");
					if (var46 != -1) {
						long var47 = SJGLGRTK.method497(var45.substring(var46 + 5).trim());
						int var49 = -1;
						for (int var50 = 0; var50 < field375; var50++) {
							if (field248[var50] == var47) {
								var49 = var50;
								break;
							}
						}

						if (var49 != -1 && field111[var49] > 0) {
							field195 = true;
							field357 = 0;
							field203 = true;
							field223 = "";
							field368 = 3;
							field67 = field248[var49];
							field342 = "Enter message to send to " + field400[var49];
						}
					}
				}

				if (var4 == 459) {
					if ((var3 & 0x3) == 0) {
						field404++;
					}

					if (field404 >= 78) {
						field463.method444(72);
						field463.method445(127);
						field404 = 0;
					}

					field463.method444(28);
					field463.method480(var3);
					field463.method478(var5);
					field463.method480(var2);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 550) {
					boolean var51 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, false, 2, var2, var3);
					if (!var51) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var2, var3);
					}

					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(250);
					field463.method480(field495);
					field463.method478(field191 + var2);
					field463.method478(field192 + var3);
					field463.method480(var5);
				}

				if (var4 == 1415) {
					int var53 = var5 >> 14 & 0x7FFF;
					NNXJFXRX var54 = NNXJFXRX.method323(var53);
					String var55;
					if (var54.field998 == null) {
						var55 = "It's a " + var54.field984 + ".";
					} else {
						var55 = new String(var54.field998);
					}

					method163(var55, 0, "");
				}

				if (var4 == 119 || var4 == 875) {
					String var56 = field173[arg0];
					int var57 = var56.indexOf("@whi@");
					if (var57 != -1) {
						var56 = var56.substring(var57 + 5).trim();
						String var58 = SJGLGRTK.method501(SJGLGRTK.method498(SJGLGRTK.method497(var56)));
						boolean var59 = false;
						for (int var60 = 0; var60 < field97; var60++) {
							IGCQCHAY var61 = field96[field98[var60]];
							if (var61 != null && var61.field688 != null && var61.field688.equalsIgnoreCase(var58)) {
								method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var61.field1225[0], var61.field1226[0]);

								if (var4 == 119) {
									field204 += var5;
									if (field204 >= 88) {
										field463.method444(163);
										field463.method446(5996);
										field204 = 0;
									}

									field463.method444(99);
									field463.method446(field98[var60]);
								}

								if (var4 == 875) {
									field463.method444(75);
									field463.method478(field98[var60]);
								}

								var59 = true;
								break;
							}
						}

						if (!var59) {
							method163("Unable to find " + var58, 0, "");
						}
					}
				}

				if (var4 == 813) {
					field463.method444(243);
					field463.method446(var3);
					field463.method479(var2);
					field463.method479(var5);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 1985) {
					BSBHBECI var62 = BSBHBECI.method22(var5);
					QUBPQDMQ var63 = QUBPQDMQ.method435(var3);
					String var64;
					if (var63 != null && var63.field1292[var2] >= 100000) {
						var64 = var63.field1292[var2] + " x " + var62.field55;
					} else if (var62.field36 == null) {
						var64 = "It's a " + var62.field55 + ".";
					} else {
						var64 = new String(var62.field36);
					}

					method163(var64, 0, "");
				}

				if (var4 == 548) {
					field463.method444(211);
					field463.method446(var3);
					QUBPQDMQ var65 = QUBPQDMQ.method435(var3);
					if (var65.field1341 != null && var65.field1341[0][0] == 5) {
						int var66 = var65.field1341[0][1];
						if (field154[var66] != var65.field1332[0]) {
							field154[var66] = var65.field1332[0];
							method124(var66);
							field259 = true;
						}
					}
				}

				if (var4 == 301) {
					method153(var3, var5, var2);
					field463.method444(41);
					field463.method479(var5 >> 14 & 0x7FFF);
					field463.method478(field192 + var3);
					field463.method479(field191 + var2);
				}

				if (var4 == 773) {
					field463.method444(35);
					field463.method480(var2);
					field463.method478(var3);
					field463.method479(var5);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 6) {
					if ((var5 & 0x3) == 0) {
						field499++;
					}

					if (field499 >= 93) {
						field463.method444(144);
						field463.method449(0);
						field499 = 0;
					}

					field463.method444(33);
					field463.method478(var5);
					field463.method480(var2);
					field463.method446(var3);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 126) {
					boolean var67 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, false, 2, var2, var3);
					if (!var67) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var2, var3);
					}

					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(27);
					field463.method478(var5);
					field463.method478(field191 + var2);
					field463.method478(field192 + var3);
				}

				if (var4 == 652) {
					method153(var3, var5, var2);
					field463.method444(189);
					field463.method478(var5 >> 14 & 0x7FFF);
					field463.method446(field192 + var3);
					field463.method478(field191 + var2);
				}

				if (var4 == 612) {
					field463.method444(69);
					field463.method478(field123);
					field463.method478(var3);
					field463.method478(field121);
					field463.method479(var5);
					field463.method479(field122);
					field463.method479(var2);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				if (var4 == 834) {
					NVHCJIOR var69 = field115[var5];
					if (var69 != null) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var69.field1225[0], var69.field1226[0]);
						field132 = field949;
						field133 = field950;
						field135 = 2;
						field134 = 0;
						field463.method444(83);
						field463.method480(var5);
						field463.method480(field495);
					}
				}

				if (var4 == 922) {
					boolean var70 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, false, 2, var2, var3);
					if (!var70) {
						method164(0, field181.field1226[0], 1, field181.field1225[0], 0, 1, 0, false, 2, var2, var3);
					}

					field132 = field949;
					field133 = field950;
					field135 = 2;
					field134 = 0;
					field463.method444(100);
					field463.method446(var5);
					field463.method480(field191 + var2);
					field463.method478(field192 + var3);
				}

				if (var4 == 616) {
					field463.method444(24);
					field463.method480(var5);
					field463.method478(var2);
					field463.method478(var3);
					field168 = 0;
					field169 = var3;
					field170 = var2;
					field171 = 2;
					if (QUBPQDMQ.method435(var3).field1295 == field304) {
						field171 = 1;
					}

					if (QUBPQDMQ.method435(var3).field1295 == field392) {
						field171 = 3;
					}
				}

				field120 = 0;
				field494 = 0;
				field259 = true;
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method141() {
		if (field417 > 1) {
			field417--;
		}

		if (field364 > 0) {
			field364--;
		}

		for (int var1 = 0; var1 < 5 && method59(); var1++) {
		}

		if (field162) {
			synchronized (field341.field567) {
				if (!field412) {
					field341.field566 = 0;
				} else if (field948 != 0 || field341.field566 >= 40) {
					field463.method444(80);
					field463.method445(0);
					int var3 = field463.field1350;
					int var4 = 0;
					for (int var5 = 0; var5 < field341.field566 && var3 - field463.field1350 < 240; var5++) {
						var4++;
						int var6 = field341.field571[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field341.field568[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field341.field571[var5] == -1 && field341.field568[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field239 != var7 || field240 != var6) {
							int var9 = var7 - field239;
							field239 = var7;
							int var10 = var6 - field240;
							field240 = var6;

							if (field80 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field463.method446((field80 << 12) + (var9 << 6) + var10);
								field80 = 0;
							} else if (field80 < 8) {
								field463.method448((field80 << 19) + var8 + 0x800000);
								field80 = 0;
							} else {
								field463.method449((field80 << 19) + var8 - 0x40000000);
								field80 = 0;
							}
						} else if (field80 < 2047) {
							field80++;
						}
					}

					field463.method454(field463.field1350 - var3);

					if (var4 >= field341.field566) {
						field341.field566 = 0;
					} else {
						field341.field566 -= var4;
						for (int var11 = 0; var11 < field341.field566; var11++) {
							field341.field568[var11] = field341.field568[var4 + var11];
							field341.field571[var11] = field341.field571[var4 + var11];
						}
					}
				}
			}

			if (field948 != 0) {
				long var12 = (field951 - field372) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field372 = field951;
				int var14 = field950;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field949;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field948 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field463.method444(48);
				field463.method487((var17 << 19) + (var18 << 20) + var16);
			}

			if (field410 > 0) {
				field410--;
			}

			if (field952[1] == 1 || field952[2] == 1 || field952[3] == 1 || field952[4] == 1) {
				field411 = true;
			}

			if (field411 && field410 <= 0) {
				field410 = 20;
				field411 = false;
				field463.method444(23);
				field463.method478(field140);
				field463.method480(field139);
			}

			if (field939 && !field462) {
				field462 = true;
				field463.method444(240);
				field463.method445(1);
			}

			if (!field939 && field462) {
				field462 = false;
				field463.method444(240);
				field463.method445(0);
			}

			method118();
			method116();
			method80();
			field362++;
			if (field362 > 750) {
				method57();
			}

			method82();
			method67();
			method103();
			field373++;
			if (field373 > 1465) {
				field373 = 0;
				field463.method444(2);
				field463.method445(0);
				int var19 = field463.field1350;
				field463.method445(49);

				if ((int) (Math.random() * 2.0D) == 0) {
					field463.method446(39379);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field463.method446(41943);
				}

				field463.method446(58974);
				field463.method445((int) (Math.random() * 256.0D));
				field463.method445((int) (Math.random() * 256.0D));
				field463.method446((int) (Math.random() * 65536.0D));
				field463.method446(51515);
				field463.method445(17);

				if ((int) (Math.random() * 2.0D) == 0) {
					field463.method445(167);
				}

				field463.method454(field463.field1350 - var19);
			}

			field302++;

			if (field135 != 0) {
				field134 += 20;
				if (field134 >= 400) {
					field135 = 0;
				}
			}

			if (field171 != 0) {
				field168++;
				if (field168 >= 15) {
					if (field171 == 2) {
						field259 = true;
					}

					if (field171 == 3) {
						field195 = true;
					}

					field171 = 0;
				}
			}

			if (field503 != 0) {
				field174++;

				if (field942 > field504 + 5 || field942 < field504 - 5 || field943 > field505 + 5 || field943 < field505 - 5) {
					field222 = true;
				}

				if (field941 == 0) {
					if (field503 == 2) {
						field259 = true;
					}

					if (field503 == 3) {
						field195 = true;
					}

					field503 = 0;

					if (field222 && field174 >= 5) {
						field215 = -1;
						method65();

						if (field501 == field215 && field502 != field214) {
							QUBPQDMQ var20 = QUBPQDMQ.method435(field501);
							byte var21 = 0;
							if (field253 == 1 && var20.field1321 == 206) {
								var21 = 1;
							}

							if (var20.field1301[field214] <= 0) {
								var21 = 0;
							}

							if (var20.field1312) {
								int var22 = field502;
								int var23 = field214;
								var20.field1301[var23] = var20.field1301[var22];
								var20.field1292[var23] = var20.field1292[var22];
								var20.field1301[var22] = -1;
								var20.field1292[var22] = 0;
							} else if (var21 == 1) {
								int var24 = field502;
								int var25 = field214;
								while (var24 != var25) {
									if (var24 > var25) {
										var20.method434(var24 - 1, var24);
										var24--;
									} else if (var24 < var25) {
										var20.method434(var24 + 1, var24);
										var24++;
									}
								}
							} else {
								var20.method434(field214, field502);
							}

							field463.method444(207);
							field463.method446(field214);
							field463.method479(field502);
							field463.method445(var21);
							field463.method478(field501);
						}
					} else if ((field275 == 1 || method150(field118 - 1)) && field118 > 2) {
						method42();
					} else if (field118 > 0) {
						method140(field118 - 1);
					}

					field168 = 10;
					field948 = 0;
				}
			}

			field64++;
			if (field64 > 61) {
				field64 = 0;
				field463.method444(166);
			}

			if (OUUKQIMK.field1135 != -1) {
				int var26 = OUUKQIMK.field1135;
				int var27 = OUUKQIMK.field1136;
				boolean var28 = method164(0, field181.field1226[0], 0, field181.field1225[0], 0, 0, 0, true, 0, var26, var27);
				OUUKQIMK.field1135 = -1;

				if (var28) {
					field132 = field949;
					field133 = field950;
					field135 = 1;
					field134 = 0;
				}
			}

			if (field948 == 1 && field321 != null) {
				field321 = null;
				field195 = true;
				field948 = 0;
			}

			method168();

			if (field350 == -1) {
				method130();
				method43();
				method53();
			}

			if (field941 == 1 || field948 == 1) {
				field144++;
			}

			if (field442 == 0 && field438 == 0 && field333 == 0) {
				if (field255 > 0) {
					field255--;
				}
			} else if (field255 < 100) {
				field255++;
				if (field255 == 100) {
					if (field442 != 0) {
						field195 = true;
					}

					if (field438 != 0) {
						field259 = true;
					}
				}
			}

			if (field387 == 2) {
				method55();
			}

			if (field387 == 2 && field77) {
				method54();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field280[var29]++;
			}

			method171();
			field940++;
			if (field940 > 4500) {
				field364 = 250;
				field940 -= 500;
				field463.method444(46);
			}

			field256++;
			if (field256 > 500) {
				field256 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field246 += field247;
				}

				if ((var30 & 0x2) == 2) {
					field285 += field286;
				}

				if ((var30 & 0x4) == 4) {
					field446 += field447;
				}
			}

			if (field246 < -50) {
				field247 = 2;
			}

			if (field246 > 50) {
				field247 = -2;
			}

			if (field285 < -55) {
				field286 = 2;
			}

			if (field285 > 55) {
				field286 = -2;
			}

			if (field446 < -40) {
				field447 = 1;
			}

			if (field446 > 40) {
				field447 = -1;
			}

			field337++;
			if (field337 > 500) {
				field337 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field414 += field415;
				}

				if ((var31 & 0x2) == 2) {
					field104 += field105;
				}
			}

			if (field414 < -60) {
				field415 = 2;
			}

			if (field414 > 60) {
				field415 = -2;
			}

			if (field104 < -20) {
				field105 = 1;
			}

			if (field104 > 10) {
				field105 = -1;
			}

			field363++;
			if (field363 > 50) {
				field463.method444(30);
			}

			try {
				if (field295 != null && field463.field1350 > 0) {
					field295.method510(0, field463.field1350, field463.field1349);
					field463.field1350 = 0;
					field363 = 0;
				}
			} catch (IOException var33) {
				method57();
			} catch (Exception var34) {
				method94();
			}
		}
	}

	@ObfuscatedName("client.f(Z)I")
	public final int method142() {
		int var1 = 3;
		if (field396 < 310) {
			int var2 = field393 >> 7;
			int var3 = field395 >> 7;
			int var4 = field181.field1217 >> 7;
			int var5 = field181.field1218 >> 7;

			if ((field272[field318][var2][var3] & 0x4) != 0) {
				var1 = field318;
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

					if ((field272[field318][var2][var3] & 0x4) != 0) {
						var1 = field318;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field272[field318][var2][var3] & 0x4) != 0) {
							var1 = field318;
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

					if ((field272[field318][var2][var3] & 0x4) != 0) {
						var1 = field318;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field272[field318][var2][var3] & 0x4) != 0) {
							var1 = field318;
						}
					}
				}
			}
		}

		if ((field272[field318][field181.field1217 >> 7][field181.field1218 >> 7] & 0x4) != 0) {
			var1 = field318;
		}

		return var1;
	}

	@ObfuscatedName("client.g(Z)I")
	public final int method143() {
		int var1 = method45(field393, field395, field318);
		if (var1 - field394 < 800 && (field272[field318][field393 >> 7][field395 >> 7] & 0x4) != 0) {
			return field318;
		}

		return 3;
	}

	@ObfuscatedName("client.a(LHHSKUOEZ;I)V")
	public final void method144(HHSKUOEZ arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field656 == 0) {
			var2 = field91.method390(arg0.field655, arg0.field657, arg0.field658);
		}

		if (arg0.field656 == 1) {
			var2 = field91.method391(arg0.field655, arg0.field657, arg0.field658);
		}

		if (arg0.field656 == 2) {
			var2 = field91.method392(arg0.field655, arg0.field657, arg0.field658);
		}

		if (arg0.field656 == 3) {
			var2 = field91.method393(arg0.field655, arg0.field657, arg0.field658);
		}

		if (var2 != 0) {
			int var6 = field91.method394(arg0.field655, arg0.field657, arg0.field658, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field652 = var3;
		arg0.field654 = var4;
		arg0.field653 = var5;
	}

	@ObfuscatedName("client.o(B)V")
	public final void method145() {
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

		field159 += 128;
		if (field159 > field125.length) {
			field159 -= field125.length;
			int var11 = (int) (Math.random() * 12.0D);
			method60(field439[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field228[var14 + 128] - field125[field159 + var14 & field125.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field227[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field390[var16] = field390[var16 + 1];
		}

		field390[var1 - 1] = (int) (Math.sin(field205 / 14.0D) * 16.0D + Math.sin(field205 / 15.0D) * 14.0D + Math.sin(field205 / 16.0D) * 12.0D);

		if (field298 > 0) {
			field298 -= 4;
		}

		if (field299 > 0) {
			field299 -= 4;
		}

		if (field298 == 0 && field299 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field298 = 1024;
			}

			if (var17 == 1) {
				field299 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method146(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method147(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field283 = "";
				field284 = "Connecting to server...";
				method91(true);
			}

			field295 = new THBLNINF(this, method38(field243 + 43594));
			long var4 = SJGLGRTK.method497(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field463.field1350 = 0;
			field463.method445(14);
			field463.method445(var6);
			field295.method510(0, 2, field463.field1349);

			for (int var7 = 0; var7 < 8; var7++) {
				field295.method507();
			}

			int var8 = field295.method507();
			int var9 = var8;

			if (var8 == 0) {
				field295.method509(field347.field1349, 0, 8);
				field347.field1350 = 0;
				field300 = field347.method461();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field300 >> 32), (int) field300 };
				field463.field1350 = 0;
				field463.method445(10);
				field463.method449(var10[0]);
				field463.method449(var10[1]);
				field463.method449(var10[2]);
				field463.method449(var10[3]);
				field463.method449(signlink.uid);
				field463.method452(arg0);
				field463.method452(arg1);
				field463.method470(field445, field303);
				field65.field1350 = 0;

				if (arg2) {
					field65.method445(18);
				} else {
					field65.method445(16);
				}

				field65.method445(field463.field1350 + 36 + 1 + 1 + 2);
				field65.method445(255);
				field65.method446(357);
				field65.method445(field245 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field65.method449(field481[var11]);
				}

				field65.method453(field463.field1349, field463.field1350, 0);
				field463.field1354 = new JLGPBSNA(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field479 = new JLGPBSNA(var10);
				field295.method510(0, field65.field1350, field65.field1349);
				var8 = field295.method507();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method147(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field344 = field295.method507();
				field412 = field295.method507() == 1;
				field372 = 0L;
				field80 = 0;
				field341.field566 = 0;
				field939 = true;
				field462 = true;
				field162 = true;
				field463.field1350 = 0;
				field347.field1350 = 0;
				field361 = -1;
				field175 = -1;
				field176 = -1;
				field177 = -1;
				field360 = 0;
				field362 = 0;
				field417 = 0;
				field364 = 0;
				field339 = 0;
				field118 = 0;
				field467 = false;
				field940 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field379[var13] = null;
				}

				field120 = 0;
				field494 = 0;
				field387 = 0;
				field183 = 0;
				field246 = (int) (Math.random() * 100.0D) - 50;
				field285 = (int) (Math.random() * 110.0D) - 55;
				field446 = (int) (Math.random() * 80.0D) - 40;
				field414 = (int) (Math.random() * 120.0D) - 60;
				field104 = (int) (Math.random() * 30.0D) - 20;
				field140 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field136 = 0;
				field478 = -1;
				field401 = 0;
				field402 = 0;
				field97 = 0;
				field116 = 0;

				for (int var14 = 0; var14 < field94; var14++) {
					field96[var14] = null;
					field101[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field115[var15] = null;
				}

				field181 = field96[field95] = new IGCQCHAY();
				field483.method37();
				field477.method37();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field160[var16][var17][var18] = null;
						}
					}
				}

				field196 = new CEEJCAVA();
				field376 = 0;
				field375 = 0;
				method39(field297);
				field297 = -1;
				method39(field392);
				field392 = -1;
				method39(field304);
				field304 = -1;
				method39(field350);
				field350 = -1;
				method39(field72);
				field72 = -1;
				method39(field161);
				field161 = -1;
				method39(field319);
				field319 = -1;
				field112 = false;
				field464 = 3;
				field357 = 0;
				field467 = false;
				field203 = false;
				field321 = null;
				field507 = 0;
				field219 = -1;
				field461 = true;
				method100();

				for (int var19 = 0; var19 < 5; var19++) {
					field76[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field184[var20] = null;
					field185[var20] = false;
				}

				field359 = 0;
				field204 = 0;
				field506 = 0;
				field353 = 0;
				field465 = 0;
				field499 = 0;
				field451 = 0;
				field416 = 0;
				field404 = 0;
				method115();
			} else if (var8 == 3) {
				field283 = "";
				field284 = "Invalid username or password.";
			} else if (var8 == 4) {
				field283 = "Your account has been disabled.";
				field284 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field283 = "Your account is already logged in.";
				field284 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field283 = "RuneScape has been updated!";
				field284 = "Please reload this page.";
			} else if (var8 == 7) {
				field283 = "This world is full.";
				field284 = "Please use a different world.";
			} else if (var8 == 8) {
				field283 = "Unable to connect.";
				field284 = "Login server offline.";
			} else if (var8 == 9) {
				field283 = "Login limit exceeded.";
				field284 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field283 = "Unable to connect.";
				field284 = "Bad session id.";
			} else if (var8 == 11) {
				field283 = "Login server rejected session.";
				field284 = "Please try again.";
			} else if (var8 == 12) {
				field283 = "You need a members account to login to this world.";
				field284 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field283 = "Could not complete login.";
				field284 = "Please try using a different world.";
			} else if (var8 == 14) {
				field283 = "The server is being updated.";
				field284 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field162 = true;
				field463.field1350 = 0;
				field347.field1350 = 0;
				field361 = -1;
				field175 = -1;
				field176 = -1;
				field177 = -1;
				field360 = 0;
				field362 = 0;
				field417 = 0;
				field118 = 0;
				field467 = false;
				field249 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field283 = "Login attempts exceeded.";
				field284 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field283 = "You are standing in a members-only area.";
				field284 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field283 = "Invalid loginserver requested";
				field284 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field295.method507();
				for (var21 += 3; var21 >= 0; var21--) {
					field283 = "You have only just left another world";
					field284 = "Your profile will be transferred in: " + var21;
					method91(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method147(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field283 = "Malformed login packet.";
				field284 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field283 = "Unexpected server response";
				field284 = "Please try using a different world.";
			} else if (var9 != 0) {
				field283 = "No response from server";
				field284 = "Please try using a different world.";
			} else if (field440 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field440++;
				method147(arg0, arg1, arg2);
			} else {
				field283 = "No response from loginserver";
				field284 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field283 = "";
			field284 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method148() {
		field160 = null;
		field196 = null;
		field463 = null;
		field65 = null;
		field347 = null;
		field163 = null;
		field164 = null;
		field165 = null;
		field266 = null;
		field267 = null;
		field263 = null;
		field264 = null;
		field265 = null;
		field68 = null;
		field69 = null;
		field70 = null;
		field71 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field430 = null;
		field431 = null;
		field154 = null;

		if (field341 != null) {
			field341.field570 = false;
		}

		field341 = null;
		field96 = null;
		field98 = null;
		field100 = null;
		field101 = null;
		field131 = null;
		field234 = null;
		field235 = null;
		field236 = null;
		field237 = null;
		field238 = null;

		try {
			if (field295 != null) {
				field295.method506();
			}
		} catch (Exception var1) {
		}

		field295 = null;
		field367 = null;
		field272 = null;
		field91 = null;
		field172 = null;
		field114 = null;
		field483 = null;
		field477 = null;
		field186 = null;
		field187 = null;
		field188 = null;
		field153 = null;
		field420 = null;
		field421 = null;
		field422 = null;
		field147 = null;
		field419 = null;
		field355 = null;
		field148 = null;
		field149 = null;
		field400 = null;
		field248 = null;
		field111 = null;
		field328 = null;
		field329 = null;
		field330 = null;
		field331 = null;
		field332 = null;
		field92 = null;
		field423 = null;
		field424 = null;
		field425 = null;
		field426 = null;
		field346 = null;
		field388 = null;
		field279 = null;
		field320 = null;
		field156 = null;
		field127 = null;

		if (field450 != null) {
			field450.method333();
		}

		field450 = null;
		field261 = null;
		field262 = null;
		field484 = null;
		field137 = null;
		field311 = null;
		field312 = null;
		field313 = null;
		field314 = null;
		field173 = null;
		field66 = null;
		field268 = null;
		field269 = null;
		field270 = null;
		field271 = null;
		field292 = null;
		field190 = null;
		field405 = null;
		field406 = null;
		method166();
		field115 = null;
		field117 = null;
		field403 = null;
		field452 = null;
		field453 = null;
		field454 = null;
		field455 = null;
		field456 = null;
		field473 = null;
		field310 = null;
		method159();
		NNXJFXRX.method331();
		XDDMQHDR.method582();
		BSBHBECI.method29();
		QUBPQDMQ.method437();
		UGHJOVKI.field1423 = null;
		IIATCLSX.field702 = null;
		LJYYVKCP.field808 = null;
		KAIFCIAJ.field742 = null;
		FOXTQZWB.field603 = null;
		FOXTQZWB.field615 = null;
		TLLQKWNZ.field1393 = null;
		field935 = null;
		IGCQCHAY.field695 = null;
		DABPNVTX.method185();
		OUUKQIMK.method363();
		NGYJLUVS.method287();
		PHDJZMLE.method426();
		System.gc();
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method149() {
		method97();

		if (field135 == 1) {
			field127[field134 / 100].method596(field132 - 8 - 4, field133 - 8 - 4);
		}

		if (field135 == 2) {
			field127[field134 / 100 + 4].method596(field132 - 8 - 4, field133 - 8 - 4);
		}

		if (field319 != -1) {
			method75(field302, field319);
			method129(0, 0, QUBPQDMQ.method435(field319), 0);
		}

		if (field304 != -1) {
			method75(field302, field304);
			method129(0, 0, QUBPQDMQ.method435(field304), 0);
		}

		method46();

		if (!field467) {
			method65();
			method102();
		} else if (field432 == 0) {
			method155();
		}

		if (field507 == 1) {
			field137.method596(472, 296);
		}

		if (field108) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field930 < 30 && field245) {
				var3 = 0xFF0000;
			}

			if (field930 < 20 && !field245) {
				var3 = 0xFF0000;
			}

			field289.method270(var2, var1, "Fps:" + field930, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field245) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field245) {
				int var8 = 0xFF0000;
			}

			field289.method270(var2, var1, "Mem:" + var5 + "k", 0xFFFF00);
			var2 += 15;
		}

		if (field417 != 0) {
			int var9 = field417 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field289.method275(0xFFFF00, "System update in: " + var10 + ":0" + var9, 329, 4);
			} else {
				field289.method275(0xFFFF00, "System update in: " + var10 + ":" + var9, 329, 4);
			}
		}
	}

	@ObfuscatedName("client.g(II)Z")
	public final boolean method150(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field313[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 138) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method151(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field375; var3++) {
				if (field248[var3] == arg0) {
					field375--;
					field259 = true;

					for (int var4 = var3; var4 < field375; var4++) {
						field400[var4] = field400[var4 + 1];
						field111[var4] = field111[var4 + 1];
						field248[var4] = field248[var4 + 1];
					}

					field463.method444(176);
					field463.method451(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LRGCGKKUR;ZI)V")
	public final void method152(RGCGKKUR arg0, int arg1) {
		int var3 = arg0.method466(8);
		if (var3 < field97) {
			for (int var4 = var3; var4 < field97; var4++) {
				field131[field130++] = field98[var4];
			}
		}

		if (var3 > field97) {
			signlink.reporterror(field365 + " Too many players");
			throw new RuntimeException("eek");
		}

		field97 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field98[var5];
			IGCQCHAY var7 = field96[var6];
			int var8 = arg0.method466(1);
			if (var8 == 0) {
				field98[field97++] = var6;
				var7.field1241 = field205;
			} else {
				int var9 = arg0.method466(2);
				if (var9 == 0) {
					field98[field97++] = var6;
					var7.field1241 = field205;
					field100[field99++] = var6;
				} else if (var9 == 1) {
					field98[field97++] = var6;
					var7.field1241 = field205;
					int var10 = arg0.method466(3);
					var7.method420(var10, false);
					int var11 = arg0.method466(1);
					if (var11 == 1) {
						field100[field99++] = var6;
					}
				} else if (var9 == 2) {
					field98[field97++] = var6;
					var7.field1241 = field205;
					int var12 = arg0.method466(3);
					var7.method420(var12, true);
					int var13 = arg0.method466(3);
					var7.method420(var13, true);
					int var14 = arg0.method466(1);
					if (var14 == 1) {
						field100[field99++] = var6;
					}
				} else if (var9 == 3) {
					field131[field130++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method153(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field91.method394(field318, arg2, arg0, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			NNXJFXRX var8 = NNXJFXRX.method323(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field997;
				var10 = var8.field987;
			} else {
				var9 = var8.field987;
				var10 = var8.field997;
			}

			int var11 = var8.field991;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method164(0, field181.field1226[0], var9, field181.field1225[0], var11, var10, 0, false, 2, arg2, arg0);
		} else {
			method164(var7, field181.field1226[0], 0, field181.field1225[0], 0, 0, var6 + 1, false, 2, arg2, arg0);
		}

		field132 = field949;
		field133 = field950;
		field135 = 2;
		field134 = 0;
		return true;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field91.method390(arg1, arg0, arg3);
		if (var6 != 0) {
			int var7 = field91.method394(arg1, arg0, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field403.field1511;
			int var12 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			NNXJFXRX var14 = NNXJFXRX.method323(var13);
			if (var14.field986 == -1) {
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
				WGRALUSQ var15 = field473[var14.field986];
				if (var15 != null) {
					int var16 = (var14.field997 * 4 - var15.field1446) / 2;
					int var17 = (var14.field987 * 4 - var15.field1447) / 2;
					var15.method566(arg0 * 4 + var16 + 48, (104 - arg3 - var14.field987) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field91.method392(arg1, arg0, arg3);
		if (var18 != 0) {
			int var19 = field91.method394(arg1, arg0, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			NNXJFXRX var23 = NNXJFXRX.method323(var22);
			if (var23.field986 != -1) {
				WGRALUSQ var24 = field473[var23.field986];
				if (var24 != null) {
					int var25 = (var23.field997 * 4 - var24.field1446) / 2;
					int var26 = (var23.field987 * 4 - var24.field1447) / 2;
					var24.method566(arg0 * 4 + var25 + 48, (104 - arg3 - var23.field987) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field403.field1511;
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

		int var30 = field91.method393(arg1, arg0, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			NNXJFXRX var32 = NNXJFXRX.method323(var31);
			if (var32.field986 != -1) {
				WGRALUSQ var33 = field473[var32.field986];
				if (var33 != null) {
					int var34 = (var32.field997 * 4 - var33.field1446) / 2;
					int var35 = (var32.field987 * 4 - var33.field1447) / 2;
					var33.method566(arg0 * 4 + var34 + 48, (104 - arg3 - var32.field987) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method155() {
		int var1 = field433;
		int var2 = field434;
		int var3 = field435;
		int var4 = field436;
		int var5 = 0x5D5447;
		WNEQSCWL.method573(var2, var1, var5, var4, var3);
		WNEQSCWL.method573(var2 + 1, var1 + 1, 0, 16, var3 - 2);
		WNEQSCWL.method574(var4 - 19, var2 + 18, var1 + 1, 0, var3 - 2);
		field290.method275(var5, "Choose Option", var2 + 14, var1 + 3);
		int var6 = field942;
		int var7 = field943;
		if (field432 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field432 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field432 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field118; var8++) {
			int var9 = (field118 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field290.method279(field173[var8], var1 + 3, var9, true, var10);
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method156(int arg0) {
		int[] var2 = field403.field1511;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field272[arg0][var7][var5] & 0x18) == 0) {
					field91.method399(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field272[arg0 + 1][var7][var5] & 0x8) != 0) {
					field91.method399(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field79++;
		if (field79 > 1496) {
			field79 = 0;
			field463.method444(26);
			field463.method445(0);
			int var8 = field463.field1350;
			field463.method446((int) (Math.random() * 65536.0D));
			field463.method445(189);
			field463.method446(45212);
			field463.method446((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field463.method445(89);
			}

			field463.method445(94);
			field463.method445(10);
			field463.method446(54243);
			field463.method445(88);

			if ((int) (Math.random() * 2.0D) == 0) {
				field463.method445(32);
			}

			field463.method454(field463.field1350 - var8);
		}

		int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field403.method591();

		for (int var11 = 1; var11 < 103; var11++) {
			for (int var12 = 1; var12 < 103; var12++) {
				if ((field272[arg0][var12][var11] & 0x18) == 0) {
					method154(var12, arg0, var9, var11, var10);
				}

				if (arg0 < 3 && (field272[arg0 + 1][var12][var11] & 0x8) != 0) {
					method154(var12, arg0 + 1, var9, var11, var10);
				}
			}
		}

		if (field70 != null) {
			field70.method223();
			DABPNVTX.field519 = field489;
		}

		field260 = 0;
		for (int var13 = 0; var13 < 104; var13++) {
			for (int var14 = 0; var14 < 104; var14++) {
				int var15 = field91.method393(field318, var13, var14);
				if (var15 != 0) {
					var15 = var15 >> 14 & 0x7FFF;
					int var16 = NNXJFXRX.method323(var15).field990;
					if (var16 >= 0) {
						int var17 = var13;
						int var18 = var14;
						if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
							byte var19 = 104;
							byte var20 = 104;
							int[][] var21 = field172[field318].field13;
							for (int var22 = 0; var22 < 10; var22++) {
								int var23 = (int) (Math.random() * 4.0D);
								if (var23 == 0 && var17 > 0 && var17 > var13 - 3 && (var21[var17 - 1][var18] & 0x1280108) == 0) {
									var17--;
								}

								if (var23 == 1 && var17 < var19 - 1 && var17 < var13 + 3 && (var21[var17 + 1][var18] & 0x1280180) == 0) {
									var17++;
								}

								if (var23 == 2 && var18 > 0 && var18 > var14 - 3 && (var21[var17][var18 - 1] & 0x1280102) == 0) {
									var18--;
								}

								if (var23 == 3 && var18 < var20 - 1 && var18 < var14 + 3 && (var21[var17][var18 + 1] & 0x1280120) == 0) {
									var18++;
								}
							}
						}

						field484[field260] = field310[var16];
						field261[field260] = var17;
						field262[field260] = var18;
						field260++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method157(String arg0) {
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

	@ObfuscatedName("client.a(IILXDDMQHDR;II)V")
	public final void method158(int arg0, XDDMQHDR arg1, int arg2, int arg3) {
		if (field118 < 400) {
			if (arg1.field1466 != null) {
				arg1 = arg1.method580();
			}

			if (arg1 != null && arg1.field1467) {
				String var5 = arg1.field1498;
				if (arg1.field1485 != 0) {
					var5 = var5 + method146(field181.field700, arg1.field1485) + " (level-" + arg1.field1485 + ")";
				}

				if (field120 == 1) {
					field173[field118] = "Use " + field124 + " with @yel@" + var5;
					field313[field118] = 708;
					field314[field118] = arg0;
					field311[field118] = arg3;
					field312[field118] = arg2;
					field118++;
				} else if (field494 != 1) {
					if (arg1.field1471 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field1471[var6] != null && !arg1.field1471[var6].equalsIgnoreCase("attack")) {
								field173[field118] = arg1.field1471[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field313[field118] = 744;
								}

								if (var6 == 1) {
									field313[field118] = 354;
								}

								if (var6 == 2) {
									field313[field118] = 59;
								}

								if (var6 == 3) {
									field313[field118] = 881;
								}

								if (var6 == 4) {
									field313[field118] = 144;
								}

								field314[field118] = arg0;
								field311[field118] = arg3;
								field312[field118] = arg2;
								field118++;
							}
						}
					}

					if (arg1.field1471 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field1471[var7] != null && arg1.field1471[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field1485 > field181.field700) {
									var8 = 2000;
								}

								field173[field118] = arg1.field1471[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field313[field118] = var8 + 744;
								}

								if (var7 == 1) {
									field313[field118] = var8 + 354;
								}

								if (var7 == 2) {
									field313[field118] = var8 + 59;
								}

								if (var7 == 3) {
									field313[field118] = var8 + 881;
								}

								if (var7 == 4) {
									field313[field118] = var8 + 144;
								}

								field314[field118] = arg0;
								field311[field118] = arg3;
								field312[field118] = arg2;
								field118++;
							}
						}
					}

					field173[field118] = "Examine @yel@" + var5;
					field313[field118] = 1219;
					field314[field118] = arg0;
					field311[field118] = arg3;
					field312[field118] = arg2;
					field118++;
				} else if ((field496 & 0x2) == 2) {
					field173[field118] = field497 + " @yel@" + var5;
					field313[field118] = 834;
					field314[field118] = arg0;
					field311[field118] = arg3;
					field312[field118] = arg2;
					field118++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method159() {
		field216 = false;
		while (field351) {
			field216 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field335 = null;
		field336 = null;
		field439 = null;
		field207 = null;
		field208 = null;
		field209 = null;
		field210 = null;
		field125 = null;
		field126 = null;
		field227 = null;
		field228 = null;
		field443 = null;
		field444 = null;
	}

	@ObfuscatedName("client.L(I)V")
	public static final void method160() {
		OUUKQIMK.field1101 = true;
		DABPNVTX.field508 = true;
		field245 = true;
		KPOYRTLL.field805 = true;
		NNXJFXRX.field971 = true;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 357);

			if (arg0.length == 5) {
				field242 = Integer.parseInt(arg0[0]);
				field243 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method160();
				} else if (arg0[2].equals("highmem")) {
					method139();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field244 = false;
				} else if (arg0[3].equals("members")) {
					field244 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method317(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.d(I)V")
	public final void method161() {
		if (field74 || field322 || field278) {
			method106();
		} else {
			field166++;

			if (field162) {
				method74();
			} else {
				method91(false);
			}

			field144 = 0;
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method162() {
		field81 = 0;
		for (int var1 = -1; var1 < field97 + field116; var1++) {
			OZYWPVDM var2;
			if (var1 == -1) {
				var2 = field181;
			} else if (var1 < field97) {
				var2 = field96[field98[var1]];
			} else {
				var2 = field115[field117[var1 - field97]];
			}

			if (var2 != null && var2.method229()) {
				if (var2 instanceof NVHCJIOR) {
					XDDMQHDR var3 = ((NVHCJIOR) var2).field1051;
					if (var3.field1466 != null) {
						var3 = var3.method580();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field97) {
					XDDMQHDR var6 = ((NVHCJIOR) var2).field1051;
					if (var6.field1479 >= 0 && var6.field1479 < field320.length) {
						method136(var2, var2.field1202 + 15);

						if (field145 > -1) {
							field320[var6.field1479].method596(field145 - 12, field146 - 30);
						}
					}

					if (field339 == 1 && field117[var1 - field97] == field106 && field205 % 20 < 10) {
						method136(var2, var2.field1202 + 15);

						if (field145 > -1) {
							field156[0].method596(field145 - 12, field146 - 28);
						}
					}
				} else {
					int var4 = 30;
					IGCQCHAY var5 = (IGCQCHAY) var2;
					if (var5.field699 != -1 || var5.field698 != -1) {
						method136(var2, var2.field1202 + 15);

						if (field145 > -1) {
							if (var5.field699 != -1) {
								field279[var5.field699].method596(field145 - 12, field146 - var4);
								var4 += 25;
							}

							if (var5.field698 != -1) {
								field320[var5.field698].method596(field145 - 12, field146 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field339 == 10 && field98[var1] == field217) {
						method136(var2, var2.field1202 + 15);

						if (field145 > -1) {
							field156[1].method596(field145 - 12, field146 - var4);
						}
					}
				}

				if (var2.field1201 != null && (var1 >= field97 || field197 == 0 || field197 == 3 || field197 == 1 && method90(((IGCQCHAY) var2).field688))) {
					method136(var2, var2.field1202);

					if (field145 > -1 && field81 < field82) {
						field86[field81] = field290.method274(var2.field1201) / 2;
						field85[field81] = field290.field824;
						field83[field81] = field145;
						field84[field81] = field146;
						field87[field81] = var2.field1203;
						field88[field81] = var2.field1236;
						field89[field81] = var2.field1224;
						field90[field81++] = var2.field1201;

						if (field381 == 0 && var2.field1236 >= 1 && var2.field1236 <= 3) {
							field85[field81] += 10;
							field84[field81] += 5;
						}

						if (field381 == 0 && var2.field1236 == 4) {
							field86[field81] = 60;
						}

						if (field381 == 0 && var2.field1236 == 5) {
							field85[field81] += 5;
						}
					}
				}

				if (var2.field1190 > field205) {
					method136(var2, var2.field1202 + 15);

					if (field145 > -1) {
						int var7 = var2.field1191 * 30 / var2.field1192;
						if (var7 > 30) {
							var7 = 30;
						}

						WNEQSCWL.method573(field146 - 3, field145 - 15, 0xFF00, 5, var7);
						WNEQSCWL.method573(field146 - 3, field145 - 15 + var7, 0xFF0000, 5, 30 - var7);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1208[var8] > field205) {
						method136(var2, var2.field1202 / 2);

						if (field145 > -1) {
							if (var8 == 1) {
								field146 -= 20;
							}

							if (var8 == 2) {
								field145 -= 15;
								field146 -= 10;
							}

							if (var8 == 3) {
								field145 += 15;
								field146 -= 10;
							}

							field388[var2.field1207[var8]].method596(field145 - 12, field146 - 12);
							field288.method271(field145, 0, String.valueOf(var2.field1206[var8]), field146 + 4);
							field288.method271(field145 - 1, 0xFFFFFF, String.valueOf(var2.field1206[var8]), field146 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field81; var9++) {
			int var10 = field83[var9];
			int var11 = field84[var9];
			int var12 = field86[var9];
			int var13 = field85[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field84[var15] - field85[var15] && var11 - var13 < field84[var15] + 2 && var10 - var12 < field86[var15] + field83[var15] && var10 + var12 > field83[var15] - field86[var15] && field84[var15] - field85[var15] < var11) {
						var11 = field84[var15] - field85[var15];
						var14 = true;
					}
				}
			}

			field145 = field83[var9];
			field146 = field84[var9] = var11;
			String var16 = field90[var9];
			if (field381 == 0) {
				int var17 = 0xFFFF00;
				if (field87[var9] < 6) {
					var17 = field370[field87[var9]];
				}

				if (field87[var9] == 6) {
					var17 = field384 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field87[var9] == 7) {
					var17 = field384 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field87[var9] == 8) {
					var17 = field384 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field87[var9] == 9) {
					int var18 = 150 - field89[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field87[var9] == 10) {
					int var19 = 150 - field89[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field87[var9] == 11) {
					int var20 = 150 - field89[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field88[var9] == 0) {
					field290.method271(field145, 0, var16, field146 + 1);
					field290.method271(field145, var17, var16, field146);
				}

				if (field88[var9] == 1) {
					field290.method276(var16, 0, field145, field146 + 1, field384);
					field290.method276(var16, var17, field145, field146, field384);
				}

				if (field88[var9] == 2) {
					field290.method277(field146 + 1, field145, field384, var16, 0);
					field290.method277(field146, field145, field384, var16, var17);
				}

				if (field88[var9] == 3) {
					field290.method278(150 - field89[var9], 0, field146 + 1, field145, field384, var16);
					field290.method278(150 - field89[var9], var17, field146, field145, field384, var16);
				}

				if (field88[var9] == 4) {
					int var21 = field290.method274(var16);
					int var22 = (150 - field89[var9]) * (var21 + 100) / 150;
					WNEQSCWL.method570(field145 - 50, 334, field145 + 50, 0);
					field290.method275(0, var16, field146 + 1, field145 + 50 - var22);
					field290.method275(var17, var16, field146, field145 + 50 - var22);
					WNEQSCWL.method569();
				}

				if (field88[var9] == 5) {
					int var23 = 150 - field89[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					WNEQSCWL.method570(0, field146 + 5, 512, field146 - field290.field824 - 1);
					field290.method271(field145, 0, var16, field146 + var24 + 1);
					field290.method271(field145, var17, var16, field146 + var24);
					WNEQSCWL.method569();
				}
			} else {
				field290.method271(field145, 0, var16, field146 + 1);
				field290.method271(field145, 0xFFFF00, var16, field146);
			}
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;ILjava/lang/String;)V")
	public final void method163(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field297 != -1) {
			field321 = arg0;
			field948 = 0;
		}

		if (field392 == -1) {
			field195 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field377[var4] = field377[var4 - 1];
			field378[var4] = field378[var4 - 1];
			field379[var4] = field379[var4 - 1];
		}

		field377[0] = arg1;
		field378[0] = arg2;
		field379[0] = arg0;
	}

	@ObfuscatedName("client.a(IIIIIIIIZIII)Z")
	public final boolean method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field292[var14][var15] = 0;
				field190[var14][var15] = 99999999;
			}
		}

		int var16 = arg3;
		int var17 = arg1;
		field292[arg3][arg1] = 99;
		field190[arg3][arg1] = 0;
		byte var18 = 0;
		int var19 = 0;
		field405[var18] = arg3;
		int var35 = var18 + 1;
		field406[var18] = arg1;
		boolean var20 = false;
		int var21 = field405.length;
		int[][] var22 = field172[field318].field13;
		while (var35 != var19) {
			var16 = field405[var19];
			var17 = field406[var19];
			var19 = (var19 + 1) % var21;

			if (arg9 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && field172[field318].method14(arg10, arg0, var17, arg6 - 1, var16, arg9)) {
					var20 = true;
					break;
				}

				if (arg6 < 10 && field172[field318].method15(var17, arg10, arg6 - 1, arg9, var16, arg0)) {
					var20 = true;
					break;
				}
			}

			if (arg2 != 0 && arg5 != 0 && field172[field318].method16(var17, arg5, arg4, arg2, arg10, var16, arg9)) {
				var20 = true;
				break;
			}

			int var23 = field190[var16][var17] + 1;
			if (var16 > 0 && field292[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field405[var35] = var16 - 1;
				field406[var35] = var17;
				var35 = (var35 + 1) % var21;
				field292[var16 - 1][var17] = 2;
				field190[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field292[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field405[var35] = var16 + 1;
				field406[var35] = var17;
				var35 = (var35 + 1) % var21;
				field292[var16 + 1][var17] = 8;
				field190[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field292[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field405[var35] = var16;
				field406[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field292[var16][var17 - 1] = 1;
				field190[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field292[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field405[var35] = var16;
				field406[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field292[var16][var17 + 1] = 4;
				field190[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field292[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field405[var35] = var16 - 1;
				field406[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field292[var16 - 1][var17 - 1] = 3;
				field190[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field292[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field405[var35] = var16 + 1;
				field406[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field292[var16 + 1][var17 - 1] = 9;
				field190[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field292[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field405[var35] = var16 - 1;
				field406[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field292[var16 - 1][var17 + 1] = 6;
				field190[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field292[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field405[var35] = var16 + 1;
				field406[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field292[var16 + 1][var17 + 1] = 12;
				field190[var16 + 1][var17 + 1] = var23;
			}
		}

		field277 = 0;
		if (!var20) {
			if (arg7) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg9 - var25; var26 <= arg9 + var25; var26++) {
						for (int var27 = arg10 - var25; var27 <= arg10 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field190[var26][var27] < var24) {
								var24 = field190[var26][var27];
								var16 = var26;
								var17 = var27;
								field277 = 1;
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
		field405[var28] = var16;
		int var36 = var28 + 1;
		field406[var28] = var17;
		int var29;
		int var30 = var29 = field292[var16][var17];
		while (arg3 != var16 || arg1 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field405[var36] = var16;
				field406[var36++] = var17;
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

			var30 = field292[var16][var17];
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
		int var32 = field405[var36];
		int var33 = field406[var36];

		if (arg8 == 0) {
			field463.method444(66);
			field463.method445(var31 + var31 + 3);
		}

		if (arg8 == 1) {
			field463.method444(77);
			field463.method445(var31 + var31 + 3 + 14);
		}

		if (arg8 == 2) {
			field463.method444(213);
			field463.method445(var31 + var31 + 3);
		}

		field401 = field405[0];
		field402 = field406[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field463.method445(field405[var36] - var32);
			field463.method471(field406[var36] - var33);
		}

		field463.method479(field191 + var32);
		field463.method478(field192 + var33);
		field463.method445(field952[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(ILQUBPQDMQ;)Z")
	public final boolean method165(QUBPQDMQ arg0) {
		if (arg0.field1338 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1338.length; var2++) {
			int var3 = method61(var2, arg0);
			int var4 = arg0.field1332[var2];
			if (arg0.field1338[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1338[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1338[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.N(I)V")
	public final void method166() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.O(I)V")
	public final void method167() {
		if (field120 == 0 && field494 == 0) {
			field173[field118] = "Walk here";
			field313[field118] = 549;
			field311[field118] = field942;
			field312[field118] = field943;
			field118++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < NGYJLUVS.field920; var2++) {
			int var3 = NGYJLUVS.field921[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field91.method394(field318, var4, var5, var3) >= 0) {
					NNXJFXRX var8 = NNXJFXRX.method323(var7);
					if (var8.field963 != null) {
						var8 = var8.method330();
					}

					if (var8 == null) {
						continue;
					}

					if (field120 == 1) {
						field173[field118] = "Use " + field124 + " with @cya@" + var8.field984;
						field313[field118] = 695;
						field314[field118] = var3;
						field311[field118] = var4;
						field312[field118] = var5;
						field118++;
					} else if (field494 != 1) {
						if (var8.field976 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field976[var9] != null) {
									field173[field118] = var8.field976[var9] + " @cya@" + var8.field984;

									if (var9 == 0) {
										field313[field118] = 652;
									}

									if (var9 == 1) {
										field313[field118] = 769;
									}

									if (var9 == 2) {
										field313[field118] = 288;
									}

									if (var9 == 3) {
										field313[field118] = 301;
									}

									if (var9 == 4) {
										field313[field118] = 1103;
									}

									field314[field118] = var3;
									field311[field118] = var4;
									field312[field118] = var5;
									field118++;
								}
							}
						}

						field173[field118] = "Examine @cya@" + var8.field984;
						field313[field118] = 1415;
						field314[field118] = var8.field961 << 14;
						field311[field118] = var4;
						field312[field118] = var5;
						field118++;
					} else if ((field496 & 0x4) == 4) {
						field173[field118] = field497 + " @cya@" + var8.field984;
						field313[field118] = 183;
						field314[field118] = var3;
						field311[field118] = var4;
						field312[field118] = var5;
						field118++;
					}
				}

				if (var6 == 1) {
					NVHCJIOR var10 = field115[var7];
					if (var10.field1051.field1497 == 1 && (var10.field1217 & 0x7F) == 0x40 && (var10.field1218 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field116; var11++) {
							NVHCJIOR var12 = field115[field117[var11]];
							if (var12 != null && var10 != var12 && var12.field1051.field1497 == 1 && var10.field1217 == var12.field1217 && var10.field1218 == var12.field1218) {
								method158(field117[var11], var12.field1051, var5, var4);
							}
						}

						for (int var13 = 0; var13 < field97; var13++) {
							IGCQCHAY var14 = field96[field98[var13]];
							if (var14 != null && var10.field1217 == var14.field1217 && var10.field1218 == var14.field1218) {
								method182(var4, var5, field98[var13], var14);
							}
						}
					}

					method158(var7, var10.field1051, var5, var4);
				}

				if (var6 == 0) {
					IGCQCHAY var15 = field96[var7];
					if ((var15.field1217 & 0x7F) == 0x40 && (var15.field1218 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field116; var16++) {
							NVHCJIOR var17 = field115[field117[var16]];
							if (var17 != null && var17.field1051.field1497 == 1 && var15.field1217 == var17.field1217 && var15.field1218 == var17.field1218) {
								method158(field117[var16], var17.field1051, var5, var4);
							}
						}

						for (int var18 = 0; var18 < field97; var18++) {
							IGCQCHAY var19 = field96[field98[var18]];
							if (var19 != null && var15 != var19 && var15.field1217 == var19.field1217 && var15.field1218 == var19.field1218) {
								method182(var4, var5, field98[var18], var19);
							}
						}
					}

					method182(var4, var5, var7, var15);
				}

				if (var6 == 3) {
					CEEJCAVA var20 = field160[field318][var4][var5];
					if (var20 != null) {
						for (IMUKKQLH var21 = (IMUKKQLH) var20.method34(); var21 != null; var21 = (IMUKKQLH) var20.method36()) {
							BSBHBECI var22 = BSBHBECI.method22(var21.field710);
							if (field120 == 1) {
								field173[field118] = "Use " + field124 + " with @lre@" + var22.field55;
								field313[field118] = 163;
								field314[field118] = var21.field710;
								field311[field118] = var4;
								field312[field118] = var5;
								field118++;
							} else if (field494 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field34 != null && var22.field34[var23] != null) {
										field173[field118] = var22.field34[var23] + " @lre@" + var22.field55;

										if (var23 == 0) {
											field313[field118] = 740;
										}

										if (var23 == 1) {
											field313[field118] = 126;
										}

										if (var23 == 2) {
											field313[field118] = 669;
										}

										if (var23 == 3) {
											field313[field118] = 922;
										}

										if (var23 == 4) {
											field313[field118] = 78;
										}

										field314[field118] = var21.field710;
										field311[field118] = var4;
										field312[field118] = var5;
										field118++;
									} else if (var23 == 2) {
										field173[field118] = "Take @lre@" + var22.field55;
										field313[field118] = 669;
										field314[field118] = var21.field710;
										field311[field118] = var4;
										field312[field118] = var5;
										field118++;
									}
								}

								field173[field118] = "Examine @lre@" + var22.field55;
								field313[field118] = 1977;
								field314[field118] = var21.field710;
								field311[field118] = var4;
								field312[field118] = var5;
								field118++;
							} else if ((field496 & 0x1) == 1) {
								field173[field118] = field497 + " @lre@" + var22.field55;
								field313[field118] = 550;
								field314[field118] = var21.field710;
								field311[field118] = var4;
								field312[field118] = var5;
								field118++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method168() {
		if (field503 == 0) {
			int var1 = field948;
			if (field494 == 1 && field949 >= 516 && field950 >= 160 && field949 <= 765 && field950 <= 205) {
				var1 = 0;
			}

			if (field467) {
				if (var1 != 1) {
					int var2 = field942;
					int var3 = field943;
					if (field432 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field432 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field432 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field433 - 10 || var2 > field435 + field433 + 10 || var3 < field434 - 10 || var3 > field436 + field434 + 10) {
						field467 = false;

						if (field432 == 1) {
							field259 = true;
						}

						if (field432 == 2) {
							field195 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field433;
					int var5 = field434;
					int var6 = field435;
					int var7 = field949;
					int var8 = field950;
					if (field432 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field432 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field432 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field118; var10++) {
						int var11 = (field118 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method140(var9);
					}

					field467 = false;

					if (field432 == 1) {
						field259 = true;
					}

					if (field432 == 2) {
						field195 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field118 > 0) {
					int var12 = field313[field118 - 1];
					if (var12 == 551 || var12 == 688 || var12 == 125 || var12 == 459 || var12 == 6 || var12 == 616 || var12 == 330 || var12 == 840 || var12 == 773 || var12 == 813 || var12 == 960 || var12 == 1985) {
						int var13 = field311[field118 - 1];
						int var14 = field312[field118 - 1];
						QUBPQDMQ var15 = QUBPQDMQ.method435(var14);
						if (var15.field1271 || var15.field1312) {
							field222 = false;
							field174 = 0;
							field501 = var14;
							field502 = var13;
							field503 = 2;
							field504 = field949;
							field505 = field950;

							if (QUBPQDMQ.method435(var14).field1295 == field304) {
								field503 = 1;
							}

							if (QUBPQDMQ.method435(var14).field1295 == field392) {
								field503 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field275 == 1 || method150(field118 - 1)) && field118 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field118 > 0) {
					method140(field118 - 1);
				}

				if (var1 != 2 || field118 <= 0) {
					return;
				}

				method42();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIILQUBPQDMQ;)V")
	public final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, QUBPQDMQ arg6) {
		if (arg6.field1326 == 0 && arg6.field1337 != null && !arg6.field1302 && (arg5 >= arg1 && arg0 >= arg3 && arg5 <= arg6.field1285 + arg1 && arg0 <= arg6.field1299 + arg3)) {
			int var8 = arg6.field1337.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg6.field1273[var9] + arg1;
				int var11 = arg6.field1334[var9] + arg3 - arg2;
				QUBPQDMQ var12 = QUBPQDMQ.method435(arg6.field1337[var9]);
				var10 += var12.field1320;
				var11 += var12.field1277;
				if ((var12.field1303 >= 0 || var12.field1294 != 0) && arg5 >= var10 && arg0 >= var11 && arg5 < var12.field1285 + var10 && arg0 < var12.field1299 + var11) {
					if (var12.field1303 >= 0) {
						field371 = var12.field1303;
					} else {
						field371 = var12.field1309;
					}
				}

				if (var12.field1326 == 8 && arg5 >= var10 && arg0 >= var11 && arg5 < var12.field1285 + var10 && arg0 < var12.field1299 + var11) {
					field189 = var12.field1309;
				}

				if (var12.field1326 == 0) {
					method169(arg0, var10, var12.field1298, var11, arg4, arg5, var12);

					if (var12.field1296 > var12.field1299) {
						method50(var12.field1299, arg5, var12.field1296, var12.field1285 + var10, var12, arg0, var11, arg4);
					}
				} else {
					if (var12.field1310 == 1 && arg5 >= var10 && arg0 >= var11 && arg5 < var12.field1285 + var10 && arg0 < var12.field1299 + var11) {
						boolean var13 = false;
						if (var12.field1321 != 0) {
							var13 = method184(var12);
						}

						if (!var13) {
							field173[field118] = var12.field1322;
							field313[field118] = 891;
							field312[field118] = var12.field1309;
							field118++;
						}
					}

					if (var12.field1310 == 2 && field494 == 0 && arg5 >= var10 && arg0 >= var11 && arg5 < var12.field1285 + var10 && arg0 < var12.field1299 + var11) {
						String var14 = var12.field1300;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field173[field118] = var14 + " @gre@" + var12.field1281;
						field313[field118] = 598;
						field312[field118] = var12.field1309;
						field118++;
					}

					if (var12.field1310 == 3 && arg5 >= var10 && arg0 >= var11 && arg5 < var12.field1285 + var10 && arg0 < var12.field1299 + var11) {
						field173[field118] = "Close";

						if (arg4 == 3) {
							field313[field118] = 559;
						} else {
							field313[field118] = 579;
						}

						field312[field118] = var12.field1309;
						field118++;
					}

					if (var12.field1310 == 4 && arg5 >= var10 && arg0 >= var11 && arg5 < var12.field1285 + var10 && arg0 < var12.field1299 + var11) {
						field173[field118] = var12.field1322;
						field313[field118] = 682;
						field312[field118] = var12.field1309;
						field118++;
					}

					if (var12.field1310 == 5 && arg5 >= var10 && arg0 >= var11 && arg5 < var12.field1285 + var10 && arg0 < var12.field1299 + var11) {
						field173[field118] = var12.field1322;
						field313[field118] = 548;
						field312[field118] = var12.field1309;
						field118++;
					}

					if (var12.field1310 == 6 && !field112 && arg5 >= var10 && arg0 >= var11 && arg5 < var12.field1285 + var10 && arg0 < var12.field1299 + var11) {
						field173[field118] = var12.field1322;
						field313[field118] = 322;
						field312[field118] = var12.field1309;
						field118++;
					}

					if (var12.field1326 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1299; var16++) {
							for (int var17 = 0; var17 < var12.field1285; var17++) {
								int var18 = (var12.field1304 + 32) * var17 + var10;
								int var19 = (var12.field1316 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1274[var15];
									var19 += var12.field1269[var15];
								}

								if (arg5 >= var18 && arg0 >= var19 && arg5 < var18 + 32 && arg0 < var19 + 32) {
									field214 = var15;
									field215 = var12.field1309;

									if (var12.field1301[var15] > 0) {
										BSBHBECI var20 = BSBHBECI.method22(var12.field1301[var15] - 1);
										if (field120 == 1 && var12.field1327) {
											if (field122 != var12.field1309 || field121 != var15) {
												field173[field118] = "Use " + field124 + " with @lre@" + var20.field55;
												field313[field118] = 612;
												field314[field118] = var20.field40;
												field311[field118] = var15;
												field312[field118] = var12.field1309;
												field118++;
											}
										} else if (field494 != 1 || !var12.field1327) {
											if (var12.field1327) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field35 != null && var20.field35[var21] != null) {
														field173[field118] = var20.field35[var21] + " @lre@" + var20.field55;

														if (var21 == 3) {
															field313[field118] = 773;
														}

														if (var21 == 4) {
															field313[field118] = 813;
														}

														field314[field118] = var20.field40;
														field311[field118] = var15;
														field312[field118] = var12.field1309;
														field118++;
													} else if (var21 == 4) {
														field173[field118] = "Drop @lre@" + var20.field55;
														field313[field118] = 813;
														field314[field118] = var20.field40;
														field311[field118] = var15;
														field312[field118] = var12.field1309;
														field118++;
													}
												}
											}

											if (var12.field1272) {
												field173[field118] = "Use @lre@" + var20.field55;
												field313[field118] = 960;
												field314[field118] = var20.field40;
												field311[field118] = var15;
												field312[field118] = var12.field1309;
												field118++;
											}

											if (var12.field1327 && var20.field35 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field35[var22] != null) {
														field173[field118] = var20.field35[var22] + " @lre@" + var20.field55;

														if (var22 == 0) {
															field313[field118] = 616;
														}

														if (var22 == 1) {
															field313[field118] = 330;
														}

														if (var22 == 2) {
															field313[field118] = 840;
														}

														field314[field118] = var20.field40;
														field311[field118] = var15;
														field312[field118] = var12.field1309;
														field118++;
													}
												}
											}

											if (var12.field1319 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1319[var23] != null) {
														field173[field118] = var12.field1319[var23] + " @lre@" + var20.field55;

														if (var23 == 0) {
															field313[field118] = 551;
														}

														if (var23 == 1) {
															field313[field118] = 688;
														}

														if (var23 == 2) {
															field313[field118] = 125;
														}

														if (var23 == 3) {
															field313[field118] = 459;
														}

														if (var23 == 4) {
															field313[field118] = 6;
														}

														field314[field118] = var20.field40;
														field311[field118] = var15;
														field312[field118] = var12.field1309;
														field118++;
													}
												}
											}

											field173[field118] = "Examine @lre@" + var20.field55;
											field313[field118] = 1985;
											field314[field118] = var20.field40;
											field311[field118] = var15;
											field312[field118] = var12.field1309;
											field118++;
										} else if ((field496 & 0x10) == 0x10) {
											field173[field118] = field497 + " @lre@" + var20.field55;
											field313[field118] = 261;
											field314[field118] = var20.field40;
											field311[field118] = var15;
											field312[field118] = var12.field1309;
											field118++;
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

	@ObfuscatedName("client.a(IIILZSWNSCUQ;)V")
	public final void method170(int arg0, int arg1, ZSWNSCUQ arg2) {
		int var4 = field414 + field140 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = NGYJLUVS.field922[var4];
			int var7 = NGYJLUVS.field923[var4];
			var6 = var6 * 256 / (field104 + 256);
			var7 = var7 * 256 / (field104 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method602(field164, var8 + 94 + 4 - arg2.field1516 / 2, 83 - var9 - arg2.field1517 / 2 - 4);
			} else {
				arg2.method596(var8 + 94 + 4 - arg2.field1516 / 2, 83 - var9 - arg2.field1517 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method171() {
		while (true) {
			int var1 = method321();
			if (var1 == -1) {
				return;
			}

			if (field304 != -1 && field75 == field304) {
				if (var1 == 8 && field213.length() > 0) {
					field213 = field213.substring(0, field213.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field213.length() < 12) {
					field213 = field213 + (char) var1;
				}
			} else if (field203) {
				if (var1 >= 32 && var1 <= 122 && field223.length() < 80) {
					field223 = field223 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field223.length() > 0) {
					field223 = field223.substring(0, field223.length() - 1);
					field195 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field203 = false;
					field195 = true;

					if (field368 == 1) {
						long var2 = SJGLGRTK.method497(field223);
						method134(var2);
					}

					if (field368 == 2 && field375 > 0) {
						long var4 = SJGLGRTK.method497(field223);
						method151(var4);
					}

					if (field368 == 3 && field223.length() > 0) {
						field463.method444(56);
						field463.method445(0);
						int var6 = field463.field1350;
						field463.method451(field67);
						ZRHRGDTH.method589(field463, field223);
						field463.method454(field463.field1350 - var6);
						field223 = ZRHRGDTH.method590(field223);
						field223 = UCQYJOHJ.method524(field223);
						method163(field223, 6, SJGLGRTK.method501(SJGLGRTK.method498(field67)));

						if (field294 == 2) {
							field294 = 1;
							field107 = true;
							field463.method444(50);
							field463.method445(field197);
							field463.method445(field294);
							field463.method445(field380);
						}
					}

					if (field368 == 4 && field356 < 100) {
						long var7 = SJGLGRTK.method497(field223);
						method176(var7);
					}

					if (field368 == 5 && field356 > 0) {
						long var9 = SJGLGRTK.method497(field223);
						method117(var9);
					}
				}
			} else if (field357 == 1) {
				if (var1 >= 48 && var1 <= 57 && field167.length() < 10) {
					field167 = field167 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field167.length() > 0) {
					field167 = field167.substring(0, field167.length() - 1);
					field195 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field167.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field167);
						} catch (Exception var21) {
						}

						field463.method444(175);
						field463.method449(var11);
					}

					field357 = 0;
					field195 = true;
				}
			} else if (field357 == 2) {
				if (var1 >= 32 && var1 <= 122 && field167.length() < 12) {
					field167 = field167 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field167.length() > 0) {
					field167 = field167.substring(0, field167.length() - 1);
					field195 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field167.length() > 0) {
						field463.method444(147);
						field463.method451(SJGLGRTK.method497(field167));
					}

					field357 = 0;
					field195 = true;
				}
			} else if (field357 == 3) {
				if (var1 >= 32 && var1 <= 122 && field167.length() < 40) {
					field167 = field167 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field167.length() > 0) {
					field167 = field167.substring(0, field167.length() - 1);
					field195 = true;
				}
			} else if (field392 == -1 && field350 == -1) {
				if (var1 >= 32 && var1 <= 122 && field315.length() < 80) {
					field315 = field315 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field315.length() > 0) {
					field315 = field315.substring(0, field315.length() - 1);
					field195 = true;
				}

				if ((var1 == 13 || var1 == 10) && field315.length() > 0) {
					if (field344 == 2) {
						if (field315.equals("::clientdrop")) {
							method57();
						}

						if (field315.equals("::lag")) {
							method127();
						}

						if (field315.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field450.method348(2); var12++) {
								field450.method345(2, (byte) 1, var12);
							}
						}

						if (field315.equals("::fpson")) {
							field108 = true;
						}

						if (field315.equals("::fpsoff")) {
							field108 = false;
						}

						if (field315.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field172[var13].field13[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field315.startsWith("::")) {
						field463.method444(225);
						field463.method445(field315.length() - 1);
						field463.method452(field315.substring(2));
					} else {
						String var16 = field315.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field315 = field315.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field315 = field315.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field315 = field315.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field315 = field315.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field315 = field315.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field315 = field315.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field315 = field315.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field315 = field315.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field315 = field315.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field315 = field315.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field315 = field315.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field315 = field315.substring(6);
						}

						String var18 = field315.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field315 = field315.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field315 = field315.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field315 = field315.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field315 = field315.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field315 = field315.substring(6);
						}

						field463.method444(91);
						field463.method445(0);
						int var20 = field463.field1350;
						field463.method471(var19);
						field114.field1350 = 0;
						ZRHRGDTH.method589(field114, field315);
						field463.method491(field114.field1349, field114.field1350, 0);
						field463.method472(var17);
						field463.method454(field463.field1350 - var20);
						field315 = ZRHRGDTH.method590(field315);
						field315 = UCQYJOHJ.method524(field315);
						field181.field1201 = field315;
						field181.field1203 = var17;
						field181.field1236 = var19;
						field181.field1224 = 150;

						if (field344 == 2) {
							method163(field181.field1201, 2, "@cr2@" + field181.field688);
						} else if (field344 == 1) {
							method163(field181.field1201, 2, "@cr1@" + field181.field688);
						} else {
							method163(field181.field1201, 2, field181.field688);
						}

						if (field197 == 2) {
							field197 = 3;
							field107 = true;
							field463.method444(50);
							field463.method445(field197);
							field463.method445(field294);
							field463.method445(field380);
						}
					}

					field315 = "";
					field195 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = NGYJLUVS.field922[var7];
			int var13 = NGYJLUVS.field923[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = NGYJLUVS.field922[var8];
			int var16 = NGYJLUVS.field923[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field393 = arg2 - var9;
		field394 = arg0 - var10;
		field395 = arg4 - var11;
		field396 = arg3;
		field397 = arg1;
	}

	@ObfuscatedName("client.h(II)V")
	public final void method173(int arg0) {
		QUBPQDMQ var2 = QUBPQDMQ.method435(arg0);
		for (int var3 = 0; var3 < var2.field1337.length && var2.field1337[var3] != -1; var3++) {
			QUBPQDMQ var4 = QUBPQDMQ.method435(var2.field1337[var3]);
			if (var4.field1326 == 1) {
				method173(var4.field1309);
			}

			var4.field1336 = 0;
			var4.field1278 = 0;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method174(String arg0, int arg1) {
		field226 = arg1;
		field385 = arg0;
		method109();

		if (field273 == null) {
			super.method174(arg0, arg1);
		} else {
			field265.method223();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field290.method271(var3 / 2, 0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			WNEQSCWL.method574(34, var6, var3 / 2 - 152, 0x8C1111, 304);
			WNEQSCWL.method574(32, var6 + 1, var3 / 2 - 151, 0, 302);
			WNEQSCWL.method573(var6 + 2, var3 / 2 - 150, 0x8C1111, 30, arg1 * 3);
			WNEQSCWL.method573(var6 + 2, arg1 * 3 + (var3 / 2 - 150), 0, 30, 300 - arg1 * 3);
			field290.method271(var3 / 2, 0xFFFFFF, arg0, var4 / 2 + 5 - var5);
			field265.method224(field934, 171, 202);

			if (field338) {
				field338 = false;

				if (!field216) {
					field266.method224(field934, 0, 0);
					field267.method224(field934, 0, 637);
				}

				field263.method224(field934, 0, 128);
				field264.method224(field934, 371, 202);
				field268.method224(field934, 265, 0);
				field269.method224(field934, 265, 562);
				field270.method224(field934, 171, 128);
				field271.method224(field934, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.i(II)Ljava/lang/String;")
	public final String method175(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method176(long arg0) {
		if (arg0 != 0L) {
			if (field356 >= 100) {
				method163("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = SJGLGRTK.method501(SJGLGRTK.method498(arg0));
				for (int var4 = 0; var4 < field356; var4++) {
					if (field102[var4] == arg0) {
						method163(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field375; var5++) {
					if (field248[var5] == arg0) {
						method163("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field102[field356++] = arg0;
				field259 = true;
				field463.method444(195);
				field463.method451(arg0);
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method177(boolean arg0) {
		if (field181.field1217 >> 7 == field401 && field181.field1218 >> 7 == field402) {
			field401 = 0;
		}

		int var2 = field97;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			IGCQCHAY var4;
			int var5;
			if (arg0) {
				var4 = field181;
				var5 = field95 << 14;
			} else {
				var4 = field96[field98[var3]];
				var5 = field98[var3] << 14;
			}

			if (var4 != null && var4.method229()) {
				var4.field691 = false;
				if ((field245 && field97 > 50 || field97 > 200) && !arg0 && var4.field1234 == var4.field1220) {
					var4.field691 = true;
				}

				int var6 = var4.field1217 >> 7;
				int var7 = var4.field1218 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field680 == null || field205 < var4.field675 || field205 >= var4.field676) {
						if ((var4.field1217 & 0x7F) == 0x40 && (var4.field1218 & 0x7F) == 0x40) {
							if (field153[var6][var7] == field384) {
								continue;
							}

							field153[var6][var7] = field384;
						}

						var4.field696 = method45(var4.field1217, var4.field1218, field318);
						field91.method375(var4.field1218, var4.field696, var5, var4.field1219, field318, var4.field1189, var4.field1217, var4, 60);
					} else {
						var4.field691 = false;
						var4.field696 = method45(var4.field1217, var4.field1218, field318);
						field91.method376(var4.field686, var4, var4.field683, field318, var4.field1218, var4.field1219, 60, var5, var4.field685, var4.field684, var4.field696, var4.field1217);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void method178() {
		int var1 = 5;
		field481[8] = 0;
		int var2 = 0;
		while (field481[8] == 0) {
			String var3 = "Unknown problem";
			method174("Connecting to web server", 20);

			try {
				DataInputStream var4 = method81("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 357);
				RGCGKKUR var5 = new RGCGKKUR(new byte[40]);
				var4.readFully(var5.field1349, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field481[var6] = var5.method460();
				}

				int var7 = var5.method460();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field481[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field481[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field481[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field481[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field481[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field481[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method174("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method174(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field296 = !field296;
			}
		}
	}

	@ObfuscatedName("client.j(II)V")
	public final void method179(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.b(I)V")
	public final void method180() {
		if (!field74 && !field322 && !field278) {
			field205++;

			if (field162) {
				method141();
			} else {
				method114();
			}

			method52();
		}
	}

	@ObfuscatedName("client.S(I)V")
	public final void method181() {
		field68.method223();
		DABPNVTX.field519 = field488;
		field163.method566(0, 0);

		if (field161 != -1) {
			method129(0, 0, QUBPQDMQ.method435(field161), 0);
		} else if (field498[field464] != -1) {
			method129(0, 0, QUBPQDMQ.method435(field498[field464]), 0);
		}

		if (field467 && field432 == 1) {
			method155();
		}

		field68.method224(field934, 205, 553);
		field70.method223();
		DABPNVTX.field519 = field489;
	}

	@ObfuscatedName("client.a(IIIILIGCQCHAY;)V")
	public final void method182(int arg0, int arg1, int arg2, IGCQCHAY arg3) {
		if (field181 != arg3 && field118 < 400) {
			String var5;
			if (arg3.field693 == 0) {
				var5 = arg3.field688 + method146(field181.field700, arg3.field700) + " (level-" + arg3.field700 + ")";
			} else {
				var5 = arg3.field688 + " (skill-" + arg3.field693 + ")";
			}

			if (field120 == 1) {
				field173[field118] = "Use " + field124 + " with @whi@" + var5;
				field313[field118] = 405;
				field314[field118] = arg2;
				field311[field118] = arg0;
				field312[field118] = arg1;
				field118++;
			} else if (field494 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field184[var6] != null) {
						field173[field118] = field184[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field184[var6].equalsIgnoreCase("attack")) {
							if (arg3.field700 > field181.field700) {
								var7 = 2000;
							}

							if (field181.field687 != 0 && arg3.field687 != 0) {
								if (field181.field687 == arg3.field687) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field185[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field313[field118] = var7 + 264;
						}

						if (var6 == 1) {
							field313[field118] = var7 + 480;
						}

						if (var6 == 2) {
							field313[field118] = var7 + 651;
						}

						if (var6 == 3) {
							field313[field118] = var7 + 283;
						}

						if (var6 == 4) {
							field313[field118] = var7 + 716;
						}

						field314[field118] = arg2;
						field311[field118] = arg0;
						field312[field118] = arg1;
						field118++;
					}
				}
			} else if ((field496 & 0x8) == 8) {
				field173[field118] = field497 + " @whi@" + var5;
				field313[field118] = 822;
				field314[field118] = arg2;
				field311[field118] = arg0;
				field312[field118] = arg1;
				field118++;
			}

			for (int var8 = 0; var8 < field118; var8++) {
				if (field313[var8] == 549) {
					field173[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;BI)LESUFCMYV;")
	public final ESUFCMYV method183(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field258[0] != null) {
				var6 = field258[0].method219(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field398.reset();
			field398.update(var6);
			int var8 = (int) field398.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new ESUFCMYV(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method174("Requesting " + arg1, arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method81(arg3 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				RGCGKKUR var16 = new RGCGKKUR(var15);
				var16.field1350 = 3;
				int var17 = var16.method459() + 6;
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
						method174("Loading " + arg1 + " - " + var22 + "%", arg2);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field258[0] != null) {
						field258[0].method220(var6.length, arg0, var6);
					}
				} catch (Exception var28) {
					field258[0] = null;
				}

				if (var6 != null) {
					field398.reset();
					field398.update(var6);
					int var23 = (int) field398.getValue();
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
						method174("Game updated - please reload page", arg2);
						var25 = 10;
					} else {
						method174(var11 + " - Retrying in " + var25, arg2);
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

				field296 = !field296;
			}
		}

		return new ESUFCMYV(var6);
	}

	@ObfuscatedName("client.a(LQUBPQDMQ;Z)Z")
	public final boolean method184(QUBPQDMQ arg0) {
		int var2 = arg0.field1321;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field173[field118] = "Remove @whi@" + arg0.field1291;
				field313[field118] = 837;
				field118++;
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

		field173[field118] = "Remove @whi@" + field400[var2];
		field313[field118] = 154;
		field118++;
		field173[field118] = "Message @whi@" + field400[var2];
		field313[field118] = 946;
		field118++;
		return true;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field103[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field389[var3] = var2 / 4;
		}
	}
}
