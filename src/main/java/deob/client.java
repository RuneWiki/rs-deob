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
public final class client extends FDVCDUHZ {

	@ObfuscatedName("client.J")
	public int field44 = 0x766654;

	@ObfuscatedName("client.K")
	public int field45 = 128;

	@ObfuscatedName("client.R")
	public JFFVPFLB[] field52 = new JFFVPFLB[5];

	@ObfuscatedName("client.U")
	public INLHDAGO field55 = INLHDAGO.method296(1);

	@ObfuscatedName("client.V")
	public boolean field56 = false;

	@ObfuscatedName("client.eb")
	public int field64 = 50;

	@ObfuscatedName("client.fb")
	public int[] field65 = new int[field64];

	@ObfuscatedName("client.gb")
	public int[] field66 = new int[field64];

	@ObfuscatedName("client.hb")
	public int[] field67 = new int[field64];

	@ObfuscatedName("client.ib")
	public int[] field68 = new int[field64];

	@ObfuscatedName("client.jb")
	public int[] field69 = new int[field64];

	@ObfuscatedName("client.kb")
	public int[] field70 = new int[field64];

	@ObfuscatedName("client.lb")
	public int[] field71 = new int[field64];

	@ObfuscatedName("client.mb")
	public String[] field72 = new String[field64];

	@ObfuscatedName("client.rb")
	public XKULRNBA[] field75 = new XKULRNBA[100];

	@ObfuscatedName("client.sb")
	public int field76 = -1;

	@ObfuscatedName("client.vb")
	public String field79 = "";

	@ObfuscatedName("client.Gb")
	public int[] field87 = new int[KYCUJUJI.field1058];

	@ObfuscatedName("client.Hb")
	public int field88 = -1;

	@ObfuscatedName("client.Rb")
	public int[][] field97 = new int[104][104];

	@ObfuscatedName("client.Ub")
	public final int[] field100 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Vb")
	public int[] field101 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.ec")
	public int[] field110 = new int[5];

	@ObfuscatedName("client.hc")
	public int[] field113 = new int[33];

	@ObfuscatedName("client.ic")
	public int field114 = 3;

	@ObfuscatedName("client.jc")
	public String[] field115 = new String[5];

	@ObfuscatedName("client.kc")
	public boolean[] field116 = new boolean[5];

	@ObfuscatedName("client.mc")
	public int[] field117 = new int[5];

	@ObfuscatedName("client.nc")
	public int[] field118 = new int[KYCUJUJI.field1058];

	@ObfuscatedName("client.pc")
	public int field119 = -1;

	@ObfuscatedName("client.qc")
	public CRC32 field120 = new CRC32();

	@ObfuscatedName("client.Ac")
	public int[] field130 = new int[5];

	@ObfuscatedName("client.Cc")
	public boolean field132 = false;

	@ObfuscatedName("client.Ec")
	public int field134 = 2;

	@ObfuscatedName("client.Fc")
	public int field135 = -1;

	@ObfuscatedName("client.Mc")
	public boolean field141 = false;

	@ObfuscatedName("client.Xc")
	public boolean field149 = true;

	@ObfuscatedName("client.ad")
	public int field151 = -1;

	@ObfuscatedName("client.bd")
	public int field152 = -1;

	@ObfuscatedName("client.id")
	public String field159 = "";

	@ObfuscatedName("client.jd")
	public String field160 = "";

	@ObfuscatedName("client.nd")
	public int[] field164 = new int[1000];

	@ObfuscatedName("client.pd")
	public XKULRNBA[] field166 = new XKULRNBA[8];

	@ObfuscatedName("client.qd")
	public int field167 = -1;

	@ObfuscatedName("client.ud")
	public boolean field168 = false;

	@ObfuscatedName("client.vd")
	public int[][] field169 = new int[104][104];

	@ObfuscatedName("client.wd")
	public int[] field170 = new int[2000];

	@ObfuscatedName("client.xd")
	public int[] field171 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.yd")
	public int[] field172 = new int[256];

	@ObfuscatedName("client.Id")
	public int[][] field180 = new int[104][104];

	@ObfuscatedName("client.Md")
	public int field183 = 1;

	@ObfuscatedName("client.Nd")
	public ROXEPOUC field184 = new ROXEPOUC();

	@ObfuscatedName("client.Rd")
	public volatile boolean field188 = false;

	@ObfuscatedName("client.Td")
	public boolean field190 = false;

	@ObfuscatedName("client.Vd")
	public boolean field191 = false;

	@ObfuscatedName("client.Xd")
	public INLHDAGO field192 = INLHDAGO.method296(1);

	@ObfuscatedName("client.Zd")
	public boolean field194 = false;

	@ObfuscatedName("client.ee")
	public int field198 = 2;

	@ObfuscatedName("client.ie")
	public String field202 = "";

	@ObfuscatedName("client.se")
	public boolean field209 = false;

	@ObfuscatedName("client.te")
	public HPPBIEYV field210 = new HPPBIEYV();

	@ObfuscatedName("client.Ae")
	public boolean field217 = false;

	@ObfuscatedName("client.Be")
	public int[] field218 = new int[100];

	@ObfuscatedName("client.Ce")
	public String[] field219 = new String[100];

	@ObfuscatedName("client.De")
	public String[] field220 = new String[100];

	@ObfuscatedName("client.Ee")
	public boolean field221 = false;

	@ObfuscatedName("client.Fe")
	public byte[] field222 = new byte[16384];

	@ObfuscatedName("client.Le")
	public boolean field228 = false;

	@ObfuscatedName("client.jf")
	public ROXEPOUC field247 = new ROXEPOUC();

	@ObfuscatedName("client.kf")
	public long[] field248 = new long[200];

	@ObfuscatedName("client.lf")
	public int field249 = 0x23201B;

	@ObfuscatedName("client.Bf")
	public int[] field264 = new int[151];

	@ObfuscatedName("client.Ff")
	public INLHDAGO field268 = new INLHDAGO(new byte[5000]);

	@ObfuscatedName("client.Gf")
	public CRBPLXHF[] field269 = new CRBPLXHF[16384];

	@ObfuscatedName("client.If")
	public int[] field271 = new int[16384];

	@ObfuscatedName("client.Jf")
	public int[] field272 = new int[151];

	@ObfuscatedName("client.Lf")
	public int field274 = -1;

	@ObfuscatedName("client.Mf")
	public boolean field275 = false;

	@ObfuscatedName("client.Of")
	public int field277 = -1;

	@ObfuscatedName("client.Pf")
	public int[] field278 = new int[33];

	@ObfuscatedName("client.Rf")
	public boolean field280 = true;

	@ObfuscatedName("client.Sf")
	public boolean field281 = false;

	@ObfuscatedName("client.Tf")
	public int[] field282 = new int[5];

	@ObfuscatedName("client.Uf")
	public String[] field283 = new String[500];

	@ObfuscatedName("client.Vf")
	public volatile boolean field284 = false;

	@ObfuscatedName("client.Xf")
	public boolean field285 = false;

	@ObfuscatedName("client.Yf")
	public boolean field286 = false;

	@ObfuscatedName("client.Zf")
	public ROXEPOUC field287 = new ROXEPOUC();

	@ObfuscatedName("client.ag")
	public XKULRNBA[] field288 = new XKULRNBA[20];

	@ObfuscatedName("client.fg")
	public int[] field292 = new int[KYCUJUJI.field1058];

	@ObfuscatedName("client.hg")
	public int[] field293 = new int[9];

	@ObfuscatedName("client.ig")
	public boolean field294 = false;

	@ObfuscatedName("client.ug")
	public boolean field306 = false;

	@ObfuscatedName("client.wg")
	public int[] field308 = new int[7];

	@ObfuscatedName("client.xg")
	public boolean field309 = true;

	@ObfuscatedName("client.zg")
	public int field311 = 0x4D4233;

	@ObfuscatedName("client.Bg")
	public int[] field313 = new int[2000];

	@ObfuscatedName("client.Fg")
	public int field315 = -1;

	@ObfuscatedName("client.Lg")
	public boolean field321 = true;

	@ObfuscatedName("client.Rg")
	public int[] field327 = new int[1000];

	@ObfuscatedName("client.Sg")
	public int[] field328 = new int[1000];

	@ObfuscatedName("client.Tg")
	public XKULRNBA[] field329 = new XKULRNBA[20];

	@ObfuscatedName("client.Yg")
	public XKULRNBA[] field333 = new XKULRNBA[1000];

	@ObfuscatedName("client.ah")
	public boolean field334 = false;

	@ObfuscatedName("client.ih")
	public String field342 = "";

	@ObfuscatedName("client.jh")
	public int[] field343 = new int[50];

	@ObfuscatedName("client.kh")
	public String field344 = "";

	@ObfuscatedName("client.lh")
	public String field345 = "";

	@ObfuscatedName("client.mh")
	public ROXEPOUC[][][] field346 = new ROXEPOUC[4][104][104];

	@ObfuscatedName("client.nh")
	public INLHDAGO field347 = INLHDAGO.method296(1);

	@ObfuscatedName("client.qh")
	public int field349 = 2;

	@ObfuscatedName("client.th")
	public BKYZHYRW[] field351 = new BKYZHYRW[13];

	@ObfuscatedName("client.xh")
	public String[] field354 = new String[200];

	@ObfuscatedName("client.zh")
	public final int field356 = 100;

	@ObfuscatedName("client.Ah")
	public int[] field357 = new int[100];

	@ObfuscatedName("client.Dh")
	public int field359 = 1;

	@ObfuscatedName("client.Eh")
	public int field360 = 78;

	@ObfuscatedName("client.Nh")
	public int field369 = 2048;

	@ObfuscatedName("client.Oh")
	public int field370 = 2047;

	@ObfuscatedName("client.Ph")
	public CXEZIPRQ[] field371 = new CXEZIPRQ[field369];

	@ObfuscatedName("client.Rh")
	public int[] field373 = new int[field369];

	@ObfuscatedName("client.Th")
	public int[] field375 = new int[field369];

	@ObfuscatedName("client.Uh")
	public INLHDAGO[] field376 = new INLHDAGO[field369];

	@ObfuscatedName("client.Yh")
	public int field378 = -1;

	@ObfuscatedName("client.ei")
	public String field383 = "";

	@ObfuscatedName("client.oi")
	public boolean field393 = true;

	@ObfuscatedName("client.pi")
	public int[] field394 = new int[50];

	@ObfuscatedName("client.qi")
	public boolean field395 = false;

	@ObfuscatedName("client.ti")
	public int[][][] field398 = new int[4][13][13];

	@ObfuscatedName("client.ui")
	public BKYZHYRW[] field399 = new BKYZHYRW[2];

	@ObfuscatedName("client.vi")
	public String field400 = "";

	@ObfuscatedName("client.wi")
	public int field401 = 0x332D25;

	@ObfuscatedName("client.zi")
	public boolean[] field404 = new boolean[5];

	@ObfuscatedName("client.Di")
	public long[] field407 = new long[100];

	@ObfuscatedName("client.Ti")
	public int[] field422 = new int[200];

	@ObfuscatedName("client.Ui")
	public UTWNPFGW[] field423 = new UTWNPFGW[4];

	@ObfuscatedName("client.Xi")
	public int[] field426 = new int[500];

	@ObfuscatedName("client.Yi")
	public int[] field427 = new int[500];

	@ObfuscatedName("client.Zi")
	public int[] field428 = new int[500];

	@ObfuscatedName("client.aj")
	public int[] field429 = new int[500];

	@ObfuscatedName("client.hj")
	public int[] field436 = new int[4000];

	@ObfuscatedName("client.ij")
	public int[] field437 = new int[4000];

	@ObfuscatedName("client.kj")
	public int[] field439 = new int[50];

	@ObfuscatedName("client.mj")
	public boolean field441 = false;

	@ObfuscatedName("client.pj")
	public boolean field444 = false;

	@ObfuscatedName("client.qj")
	public int field445 = -1;

	@ObfuscatedName("client.vj")
	public volatile boolean field449 = false;

	@ObfuscatedName("client.Aj")
	public boolean field454 = false;

	@ObfuscatedName("client.Gj")
	public int field460 = -1;

	@ObfuscatedName("client.Hj")
	public int field461 = -1;

	@ObfuscatedName("client.Mj")
	public boolean field465 = false;

	@ObfuscatedName("client.Nj")
	public int[] field466 = new int[5];

	@ObfuscatedName("client.Oj")
	public BKYZHYRW[] field467 = new BKYZHYRW[100];

	@ObfuscatedName("client.cc")
	public static BigInteger field108 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.ed")
	public static int field155 = 10;

	@ObfuscatedName("client.gd")
	public static boolean field157 = true;

	@ObfuscatedName("client.Nf")
	public static int[] field276 = new int[32];

	@ObfuscatedName("client.sg")
	public static int[] field304 = new int[99];

	@ObfuscatedName("client.tg")
	public static final int[] field305 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.ci")
	public static String field381 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.di")
	public static final int[][] field382 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.uj")
	public static BigInteger field448 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.ac")
	public int field106;

	@ObfuscatedName("client.bc")
	public static int field107;

	@ObfuscatedName("client.dc")
	public int field109;

	@ObfuscatedName("client.fc")
	public int field111;

	@ObfuscatedName("client.gc")
	public int field112;

	@ObfuscatedName("client.rc")
	public int field121;

	@ObfuscatedName("client.sc")
	public int field122;

	@ObfuscatedName("client.tc")
	public int field123;

	@ObfuscatedName("client.uc")
	public int field124;

	@ObfuscatedName("client.vc")
	public int field125;

	@ObfuscatedName("client.wc")
	public int field126;

	@ObfuscatedName("client.xc")
	public int field127;

	@ObfuscatedName("client.yc")
	public int field128;

	@ObfuscatedName("client.zc")
	public int field129;

	@ObfuscatedName("client.Dc")
	public int field133;

	@ObfuscatedName("client.Lc")
	public int field140;

	@ObfuscatedName("client.Rc")
	public int field143;

	@ObfuscatedName("client.Sc")
	public static int field144;

	@ObfuscatedName("client.Tc")
	public int field145;

	@ObfuscatedName("client.Uc")
	public int field146;

	@ObfuscatedName("client.Vc")
	public int field147;

	@ObfuscatedName("client.Yc")
	public int field150;

	@ObfuscatedName("client.dd")
	public int field154;

	@ObfuscatedName("client.fd")
	public static int field156;

	@ObfuscatedName("client.ld")
	public int field162;

	@ObfuscatedName("client.md")
	public int field163;

	@ObfuscatedName("client.od")
	public int field165;

	@ObfuscatedName("client.zd")
	public int field173;

	@ObfuscatedName("client.Bd")
	public static int field174;

	@ObfuscatedName("client.Cd")
	public int field175;

	@ObfuscatedName("client.Dd")
	public int field176;

	@ObfuscatedName("client.Ed")
	public int field177;

	@ObfuscatedName("client.Fd")
	public int field178;

	@ObfuscatedName("client.Ld")
	public int field182;

	@ObfuscatedName("client.Od")
	public int field185;

	@ObfuscatedName("client.Pd")
	public int field186;

	@ObfuscatedName("client.Qd")
	public int field187;

	@ObfuscatedName("client.Yd")
	public int field193;

	@ObfuscatedName("client.ae")
	public int field195;

	@ObfuscatedName("client.ce")
	public int field196;

	@ObfuscatedName("client.de")
	public int field197;

	@ObfuscatedName("client.ke")
	public int field203;

	@ObfuscatedName("client.le")
	public int field204;

	@ObfuscatedName("client.oe")
	public int field206;

	@ObfuscatedName("client.qe")
	public static int field207;

	@ObfuscatedName("client.re")
	public int field208;

	@ObfuscatedName("client.ue")
	public int field211;

	@ObfuscatedName("client.ve")
	public int field212;

	@ObfuscatedName("client.we")
	public int field213;

	@ObfuscatedName("client.xe")
	public int field214;

	@ObfuscatedName("client.ye")
	public int field215;

	@ObfuscatedName("client.ze")
	public int field216;

	@ObfuscatedName("client.Ge")
	public int field223;

	@ObfuscatedName("client.Ke")
	public int field227;

	@ObfuscatedName("client.Ne")
	public int field229;

	@ObfuscatedName("client.Te")
	public int field233;

	@ObfuscatedName("client.Ue")
	public int field234;

	@ObfuscatedName("client.Ve")
	public int field235;

	@ObfuscatedName("client.We")
	public int field236;

	@ObfuscatedName("client.Xe")
	public int field237;

	@ObfuscatedName("client.Ye")
	public int field238;

	@ObfuscatedName("client.of")
	public static int field252;

	@ObfuscatedName("client.pf")
	public int field253;

	@ObfuscatedName("client.qf")
	public int field254;

	@ObfuscatedName("client.sf")
	public int field256;

	@ObfuscatedName("client.Af")
	public int field263;

	@ObfuscatedName("client.Cf")
	public int field265;

	@ObfuscatedName("client.Df")
	public int field266;

	@ObfuscatedName("client.Ef")
	public int field267;

	@ObfuscatedName("client.Hf")
	public int field270;

	@ObfuscatedName("client.Kf")
	public int field273;

	@ObfuscatedName("client.Qf")
	public int field279;

	@ObfuscatedName("client.cg")
	public int field290;

	@ObfuscatedName("client.eg")
	public int field291;

	@ObfuscatedName("client.jg")
	public static int field295;

	@ObfuscatedName("client.og")
	public int field300;

	@ObfuscatedName("client.pg")
	public static int field301;

	@ObfuscatedName("client.vg")
	public int field307;

	@ObfuscatedName("client.yg")
	public int field310;

	@ObfuscatedName("client.Gg")
	public int field316;

	@ObfuscatedName("client.Hg")
	public int field317;

	@ObfuscatedName("client.Ig")
	public int field318;

	@ObfuscatedName("client.Jg")
	public int field319;

	@ObfuscatedName("client.Kg")
	public int field320;

	@ObfuscatedName("client.Mg")
	public int field322;

	@ObfuscatedName("client.Ng")
	public int field323;

	@ObfuscatedName("client.Og")
	public int field324;

	@ObfuscatedName("client.Pg")
	public int field325;

	@ObfuscatedName("client.Qg")
	public int field326;

	@ObfuscatedName("client.bh")
	public int field335;

	@ObfuscatedName("client.ch")
	public int field336;

	@ObfuscatedName("client.dh")
	public int field337;

	@ObfuscatedName("client.eh")
	public int field338;

	@ObfuscatedName("client.fh")
	public int field339;

	@ObfuscatedName("client.hh")
	public int field341;

	@ObfuscatedName("client.ph")
	public int field348;

	@ObfuscatedName("client.Ch")
	public int field358;

	@ObfuscatedName("client.Fh")
	public int field361;

	@ObfuscatedName("client.Gh")
	public int field362;

	@ObfuscatedName("client.Hh")
	public int field363;

	@ObfuscatedName("client.Ih")
	public int field364;

	@ObfuscatedName("client.Jh")
	public int field365;

	@ObfuscatedName("client.Lh")
	public static int field367;

	@ObfuscatedName("client.Qh")
	public int field372;

	@ObfuscatedName("client.Sh")
	public int field374;

	@ObfuscatedName("client.Wh")
	public int field377;

	@ObfuscatedName("client.bi")
	public static int field380;

	@ObfuscatedName("client.ri")
	public int field396;

	@ObfuscatedName("client.si")
	public int field397;

	@ObfuscatedName("client.xi")
	public int field402;

	@ObfuscatedName("client.yi")
	public int field403;

	@ObfuscatedName("client.Bi")
	public int field406;

	@ObfuscatedName("client.Vi")
	public int field424;

	@ObfuscatedName("client.bj")
	public int field430;

	@ObfuscatedName("client.cj")
	public int field431;

	@ObfuscatedName("client.dj")
	public int field432;

	@ObfuscatedName("client.ej")
	public int field433;

	@ObfuscatedName("client.fj")
	public int field434;

	@ObfuscatedName("client.jj")
	public static int field438;

	@ObfuscatedName("client.lj")
	public static int field440;

	@ObfuscatedName("client.wj")
	public int field450;

	@ObfuscatedName("client.xj")
	public int field451;

	@ObfuscatedName("client.zj")
	public static int field453;

	@ObfuscatedName("client.Bj")
	public int field455;

	@ObfuscatedName("client.Cj")
	public int field456;

	@ObfuscatedName("client.Dj")
	public int field457;

	@ObfuscatedName("client.Ej")
	public int field458;

	@ObfuscatedName("client.Fj")
	public int field459;

	@ObfuscatedName("client.L")
	public int field46;

	@ObfuscatedName("client.Jj")
	public int field462;

	@ObfuscatedName("client.Kj")
	public int field463;

	@ObfuscatedName("client.M")
	public int field47;

	@ObfuscatedName("client.N")
	public int field48;

	@ObfuscatedName("client.O")
	public int field49;

	@ObfuscatedName("client.S")
	public int field53;

	@ObfuscatedName("client.X")
	public int field57;

	@ObfuscatedName("client.Y")
	public int field58;

	@ObfuscatedName("client.Z")
	public int field59;

	@ObfuscatedName("client.ab")
	public int field60;

	@ObfuscatedName("client.bb")
	public int field61;

	@ObfuscatedName("client.cb")
	public int field62;

	@ObfuscatedName("client.db")
	public int field63;

	@ObfuscatedName("client.ub")
	public static int field78;

	@ObfuscatedName("client.wb")
	public int field80;

	@ObfuscatedName("client.xb")
	public int field81;

	@ObfuscatedName("client.yb")
	public int field82;

	@ObfuscatedName("client.zb")
	public int field83;

	@ObfuscatedName("client.Bb")
	public int field84;

	@ObfuscatedName("client.Cb")
	public int field85;

	@ObfuscatedName("client.Ib")
	public int field89;

	@ObfuscatedName("client.Jb")
	public int field90;

	@ObfuscatedName("client.Kb")
	public int field91;

	@ObfuscatedName("client.Lb")
	public int field92;

	@ObfuscatedName("client.Mb")
	public static int field93;

	@ObfuscatedName("client.Nb")
	public static int field94;

	@ObfuscatedName("client.Pb")
	public static int field95;

	@ObfuscatedName("client.Qb")
	public int field96;

	@ObfuscatedName("client.Sb")
	public int field98;

	@ObfuscatedName("client.Tb")
	public int field99;

	@ObfuscatedName("client.bg")
	public long field289;

	@ObfuscatedName("client.sh")
	public long field350;

	@ObfuscatedName("client.Lj")
	public long field464;

	@ObfuscatedName("client.tb")
	public long field77;

	@ObfuscatedName("client.Fb")
	public long field86;

	@ObfuscatedName("client.fe")
	public BKYZHYRW field199;

	@ObfuscatedName("client.ge")
	public BKYZHYRW field200;

	@ObfuscatedName("client.he")
	public BKYZHYRW field201;

	@ObfuscatedName("client.He")
	public BKYZHYRW field224;

	@ObfuscatedName("client.Ie")
	public BKYZHYRW field225;

	@ObfuscatedName("client.Je")
	public BKYZHYRW field226;

	@ObfuscatedName("client.cf")
	public BKYZHYRW field242;

	@ObfuscatedName("client.df")
	public BKYZHYRW field243;

	@ObfuscatedName("client.ef")
	public BKYZHYRW field244;

	@ObfuscatedName("client.ff")
	public BKYZHYRW field245;

	@ObfuscatedName("client.gf")
	public BKYZHYRW field246;

	@ObfuscatedName("client.vh")
	public BKYZHYRW field352;

	@ObfuscatedName("client.wh")
	public BKYZHYRW field353;

	@ObfuscatedName("client.Fi")
	public BKYZHYRW field408;

	@ObfuscatedName("client.Gi")
	public BKYZHYRW field409;

	@ObfuscatedName("client.Hi")
	public BKYZHYRW field410;

	@ObfuscatedName("client.Ii")
	public BKYZHYRW field411;

	@ObfuscatedName("client.Ji")
	public BKYZHYRW field412;

	@ObfuscatedName("client.sj")
	public BKYZHYRW field446;

	@ObfuscatedName("client.tj")
	public BKYZHYRW field447;

	@ObfuscatedName("client.gj")
	public static CXEZIPRQ field435;

	@ObfuscatedName("client.gh")
	public CXHZUTUD field340;

	@ObfuscatedName("client.yj")
	public DYBMLHQM field452;

	@ObfuscatedName("client.Wb")
	public JLICUWSE field102;

	@ObfuscatedName("client.Xb")
	public JLICUWSE field103;

	@ObfuscatedName("client.Yb")
	public JLICUWSE field104;

	@ObfuscatedName("client.Zb")
	public JLICUWSE field105;

	@ObfuscatedName("client.Ze")
	public LWAVUJVV field239;

	@ObfuscatedName("client.af")
	public LWAVUJVV field240;

	@ObfuscatedName("client.bf")
	public LWAVUJVV field241;

	@ObfuscatedName("client.kg")
	public LWAVUJVV field296;

	@ObfuscatedName("client.lg")
	public LWAVUJVV field297;

	@ObfuscatedName("client.mg")
	public LWAVUJVV field298;

	@ObfuscatedName("client.ng")
	public LWAVUJVV field299;

	@ObfuscatedName("client.fi")
	public LWAVUJVV field384;

	@ObfuscatedName("client.gi")
	public LWAVUJVV field385;

	@ObfuscatedName("client.hi")
	public LWAVUJVV field386;

	@ObfuscatedName("client.ii")
	public LWAVUJVV field387;

	@ObfuscatedName("client.ji")
	public LWAVUJVV field388;

	@ObfuscatedName("client.ki")
	public LWAVUJVV field389;

	@ObfuscatedName("client.li")
	public LWAVUJVV field390;

	@ObfuscatedName("client.mi")
	public LWAVUJVV field391;

	@ObfuscatedName("client.ni")
	public LWAVUJVV field392;

	@ObfuscatedName("client.Ki")
	public LWAVUJVV field413;

	@ObfuscatedName("client.Li")
	public LWAVUJVV field414;

	@ObfuscatedName("client.Mi")
	public LWAVUJVV field415;

	@ObfuscatedName("client.Ni")
	public LWAVUJVV field416;

	@ObfuscatedName("client.Oi")
	public LWAVUJVV field417;

	@ObfuscatedName("client.Pi")
	public LWAVUJVV field418;

	@ObfuscatedName("client.Qi")
	public LWAVUJVV field419;

	@ObfuscatedName("client.Ri")
	public LWAVUJVV field420;

	@ObfuscatedName("client.Si")
	public LWAVUJVV field421;

	@ObfuscatedName("client.Cg")
	public SKDZZMVP field314;

	@ObfuscatedName("client.Sd")
	public STZSJMNC field189;

	@ObfuscatedName("client.kd")
	public XKULRNBA field161;

	@ObfuscatedName("client.me")
	public XKULRNBA field205;

	@ObfuscatedName("client.tf")
	public XKULRNBA field257;

	@ObfuscatedName("client.uf")
	public XKULRNBA field258;

	@ObfuscatedName("client.vf")
	public XKULRNBA field259;

	@ObfuscatedName("client.wf")
	public XKULRNBA field260;

	@ObfuscatedName("client.xf")
	public XKULRNBA field261;

	@ObfuscatedName("client.Mh")
	public XKULRNBA field368;

	@ObfuscatedName("client.nj")
	public XKULRNBA field442;

	@ObfuscatedName("client.oj")
	public XKULRNBA field443;

	@ObfuscatedName("client.P")
	public XKULRNBA field50;

	@ObfuscatedName("client.Q")
	public XKULRNBA field51;

	@ObfuscatedName("client.ob")
	public XKULRNBA field73;

	@ObfuscatedName("client.pb")
	public XKULRNBA field74;

	@ObfuscatedName("client.Ai")
	public XRAHVOIV field405;

	@ObfuscatedName("client.Bc")
	public YZICXNNP field131;

	@ObfuscatedName("client.Wc")
	public String field148;

	@ObfuscatedName("client.Gd")
	public String field179;

	@ObfuscatedName("client.yh")
	public String field355;

	@ObfuscatedName("client.Kh")
	public String field366;

	@ObfuscatedName("client.cd")
	public Socket field153;

	@ObfuscatedName("client.hd")
	public static boolean field158;

	@ObfuscatedName("client.rf")
	public static boolean field255;

	@ObfuscatedName("client.Ag")
	public static boolean field312;

	@ObfuscatedName("client.T")
	public static boolean field54;

	@ObfuscatedName("client.Gc")
	public int[] field136;

	@ObfuscatedName("client.Hc")
	public int[] field137;

	@ObfuscatedName("client.Ic")
	public int[] field138;

	@ObfuscatedName("client.Jc")
	public int[] field139;

	@ObfuscatedName("client.Pe")
	public int[] field230;

	@ObfuscatedName("client.Qe")
	public int[] field231;

	@ObfuscatedName("client.Re")
	public int[] field232;

	@ObfuscatedName("client.mf")
	public int[] field250;

	@ObfuscatedName("client.nf")
	public int[] field251;

	@ObfuscatedName("client.qg")
	public int[] field302;

	@ObfuscatedName("client.rg")
	public int[] field303;

	@ObfuscatedName("client.Ug")
	public int[] field330;

	@ObfuscatedName("client.Vg")
	public int[] field331;

	@ObfuscatedName("client.Wg")
	public int[] field332;

	@ObfuscatedName("client.Zh")
	public BKYZHYRW[] field379;

	@ObfuscatedName("client.Kd")
	public byte[][] field181;

	@ObfuscatedName("client.Wi")
	public byte[][] field425;

	@ObfuscatedName("client.Nc")
	public byte[][][] field142;

	@ObfuscatedName("client.zf")
	public int[][][] field262;

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method17(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.e(I)V")
	public final void method18() {
		if (field154 == 0) {
			int var1 = field707 / 2 - 80;
			int var2 = field708 / 2 + 20;
			var2 += 20;
			if (field723 == 1 && field724 >= var1 - 75 && field724 <= var1 + 75 && field725 >= var2 - 20 && field725 <= var2 + 20) {
				field154 = 3;
				field273 = 0;
			}

			int var3 = field707 / 2 + 80;
			if (field723 == 1 && field724 >= var3 - 75 && field724 <= var3 + 75 && field725 >= var2 - 20 && field725 <= var2 + 20) {
				field159 = "";
				field160 = "Enter your username & password.";
				field154 = 2;
				field273 = 0;
			}
		} else if (field154 == 2) {
			int var4 = field708 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field723 == 1 && field725 >= var4 - 15 && field725 < var4) {
				field273 = 0;
			}

			var4 += 15;
			if (field723 == 1 && field725 >= var4 - 15 && field725 < var4) {
				field273 = 1;
			}

			var4 += 15;
			int var5 = field707 / 2 - 80;
			int var6 = field708 / 2 + 50;
			var6 += 20;
			if (field723 == 1 && field724 >= var5 - 75 && field724 <= var5 + 75 && field725 >= var6 - 20 && field725 <= var6 + 20) {
				field223 = 0;
				method47(field344, field345, false);

				if (field168) {
					return;
				}
			}

			int var7 = field707 / 2 + 80;
			if (field723 == 1 && field724 >= var7 - 75 && field724 <= var7 + 75 && field725 >= var6 - 20 && field725 <= var6 + 20) {
				field154 = 0;
				field344 = "";
				field345 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method256();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field381.length(); var10++) {
					if (var8 == field381.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field273 == 0) {
					if (var8 == 8 && field344.length() > 0) {
						field344 = field344.substring(0, field344.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field273 = 1;
					}

					if (var9) {
						field344 = field344 + (char) var8;
					}

					if (field344.length() > 12) {
						field344 = field344.substring(0, 12);
					}
				} else if (field273 == 1) {
					if (var8 == 8 && field345.length() > 0) {
						field345 = field345.substring(0, field345.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field273 = 0;
					}

					if (var9) {
						field345 = field345 + (char) var8;
					}

					if (field345.length() > 20) {
						field345 = field345.substring(0, 20);
					}
				}
			}
		} else if (field154 == 3) {
			int var11 = field707 / 2;
			int var12 = field708 / 2 + 50;
			var12 += 20;
			if (field723 == 1 && field724 >= var11 - 75 && field724 <= var11 + 75 && field725 >= var12 - 20 && field725 <= var12 + 20) {
				field154 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method19() {
		field165 = 0;
		int var1 = (field435.field781 >> 7) + field126;
		int var2 = (field435.field782 >> 7) + field127;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field165 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field165 = 1;
		}

		if (field165 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field165 = 0;
		}
	}

	@ObfuscatedName("client.a(IILXKULRNBA;I)V")
	public final void method20(int arg0, int arg1, XKULRNBA arg2) {
		int var4 = field46 + field197 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = DHUPIIUL.field607[var4];
			int var7 = DHUPIIUL.field608[var4];
			var6 = var6 * 256 / (field358 + 256);
			var7 = var7 * 256 / (field358 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method520(var8 + 94 + 4 - arg2.field1365 / 2, field225, 83 - var9 - arg2.field1366 / 2 - 4);
			} else {
				arg2.method514(83 - var9 - arg2.field1366 / 2 - 4, var8 + 94 - arg2.field1365 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		PAWLWNVI var10 = null;
		for (PAWLWNVI var11 = (PAWLWNVI) field184.method427(); var11 != null; var11 = (PAWLWNVI) field184.method429()) {
			if (var11.field1137 == arg1 && var11.field1139 == arg2 && var11.field1140 == arg0 && var11.field1138 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new PAWLWNVI();
			var10.field1137 = arg1;
			var10.field1138 = arg8;
			var10.field1139 = arg2;
			var10.field1140 = arg0;
			method57(var10);
			field184.method424(var10);
		}

		var10.field1143 = arg4;
		var10.field1145 = arg5;
		var10.field1144 = arg6;
		var10.field1141 = arg7;
		var10.field1142 = arg3;
	}

	@ObfuscatedName("client.a(IZZ)V")
	public final void method22(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method23() {
		try {
			if (field131 != null) {
				field131.method583();
			}
		} catch (Exception var2) {
		}

		field131 = null;
		field168 = false;
		field154 = 0;
		field344 = "";
		field345 = "";
		method63();
		field405.method527();

		for (int var1 = 0; var1 < 4; var1++) {
			field423[var1].method484();
		}

		System.gc();
		method88();
		field167 = -1;
		field279 = -1;
		field212 = 0;
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method24(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method25(String arg0) {
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

	@ObfuscatedName("client.h(I)V")
	public final void method26() {
		for (PAWLWNVI var1 = (PAWLWNVI) field184.method427(); var1 != null; var1 = (PAWLWNVI) field184.method429()) {
			if (var1.field1142 == -1) {
				var1.field1141 = 0;
				method57(var1);
			} else {
				var1.method234();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIZLHPPBIEYV;I)V")
	public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, HPPBIEYV arg7) {
		if (field275) {
			field406 = 32;
		} else {
			field406 = 0;
		}

		field275 = false;
		if (arg3 >= arg4 && arg3 < arg4 + 16 && arg1 >= arg2 && arg1 < arg2 + 16) {
			arg7.field949 -= field377 * 4;

			if (arg6) {
				field294 = true;
				return;
			}
		} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg1 >= arg0 + arg2 - 16 && arg1 < arg0 + arg2) {
			arg7.field949 += field377 * 4;

			if (arg6) {
				field294 = true;
				return;
			}
		} else if (arg3 >= arg4 - field406 && arg3 < arg4 + field406 + 16 && arg1 >= arg2 + 16 && arg1 < arg0 + arg2 - 16 && field377 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg5;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg2 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg7.field949 = (arg5 - arg0) * var10 / var11;

			if (arg6) {
				field294 = true;
			}

			field275 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method28() {
		field352 = new BKYZHYRW(field452, "titlebox", 0);
		field353 = new BKYZHYRW(field452, "titlebutton", 0);
		field379 = new BKYZHYRW[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field379[var2] = new BKYZHYRW(field452, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field379[var3] = new BKYZHYRW(field452, "runes", (var3 & 0x3) + 12);
			}
		}

		field442 = new XKULRNBA(128, 265);
		field443 = new XKULRNBA(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field442.field1360[var4] = field387.field1061[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field443.field1360[var5] = field388.field1061[var5];
		}

		field137 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field137[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field137[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field137[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field137[var9 + 192] = 0xFFFFFF;
		}

		field138 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field138[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field138[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field138[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field138[var13 + 192] = 0xFFFFFF;
		}

		field139 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field139[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field139[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field139[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field139[var17 + 192] = 0xFFFFFF;
		}

		field136 = new int[256];
		field250 = new int[32768];
		field251 = new int[32768];
		method125(null);
		field302 = new int[32768];
		field303 = new int[32768];
		method120("Connecting to fileserver", 10);

		if (!field449) {
			field284 = true;
			field449 = true;
			method113(this, 2);
		}
	}

	@ObfuscatedName("client.i(I)Z")
	public final boolean method29() {
		if (field131 == null) {
			return false;
		}

		try {
			int var1 = field131.method585();
			if (var1 == 0) {
				return false;
			}

			if (field362 == -1) {
				field131.method586(field55.field968, 0, 1);
				field362 = field55.field968[0] & 0xFF;
				if (field314 != null) {
					field362 = field362 - field314.method481() & 0xFF;
				}

				field361 = ZSVVPODM.field1484[field362];
				var1--;
			}

			if (field361 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field131.method586(field55.field968, 0, 1);
				field361 = field55.field968[0] & 0xFF;
				var1--;
			}

			if (field361 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field131.method586(field55.field968, 0, 2);
				field55.field969 = 0;
				field361 = field55.method310();
				var1 -= 2;
			}

			if (var1 < field361) {
				return false;
			}

			field55.field969 = 0;
			field131.method586(field55.field968, 0, field361);
			field363 = 0;
			field324 = field323;
			field323 = field322;
			field322 = field362;

			if (field362 == 203) {
				field119 = field55.method325();
				if (field119 == field114) {
					if (field119 == 3) {
						field114 = 1;
					} else {
						field114 = 3;
					}

					field294 = true;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 49) {
				field294 = true;
				int var2 = field55.method310();
				HPPBIEYV var3 = HPPBIEYV.field925[var2];
				while (field55.field969 < field361) {
					int var4 = field55.method322();
					int var5 = field55.method310();
					int var6 = field55.method308();
					if (var6 == 255) {
						var6 = field55.method313();
					}

					if (var4 >= 0 && var4 < var3.field931.length) {
						var3.field931[var4] = var5;
						var3.field937[var4] = var6;
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 124) {
				String var7 = field55.method315();
				int var8 = field55.method308();
				int var9 = field55.method308();
				if (var9 >= 1 && var9 <= 5) {
					if (var7.equalsIgnoreCase("null")) {
						var7 = null;
					}

					field115[var9 - 1] = var7;
					field116[var9 - 1] = var8 == 0;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 63) {
				field203 = 0;
				field362 = -1;
				return true;
			}

			if (field362 == 215) {
				int var10 = field55.method337();
				int var11 = field55.method334();
				HPPBIEYV var12 = HPPBIEYV.field925[var11];
				var12.field953 = var10;

				if (var10 == -1) {
					var12.field919 = 0;
					var12.field928 = 0;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 89) {
				int var13 = field55.method334();
				int var14 = field55.method335();
				int var15 = field55.method310();
				if (var14 == 0xFFFF) {
					HPPBIEYV.field925[var15].field961 = 0;
					field362 = -1;
					return true;
				}

				HFWXROSJ var16 = HFWXROSJ.method286(var14);
				HPPBIEYV.field925[var15].field961 = 4;
				HPPBIEYV.field925[var15].field962 = var14;
				HPPBIEYV.field925[var15].field909 = var16.field869;
				HPPBIEYV.field925[var15].field910 = var16.field898;
				HPPBIEYV.field925[var15].field908 = var16.field884 * 100 / var13;
				field362 = -1;
				return true;
			}

			if (field362 == 225) {
				int var17 = field55.method308();
				int var18 = field55.method308();
				int var19 = field55.method308();
				int var20 = field55.method308();
				field404[var17] = true;
				field110[var17] = var18;
				field466[var17] = var19;
				field282[var17] = var20;
				field117[var17] = 0;
				field362 = -1;
				return true;
			}

			if (field362 == 58) {
				int var21 = field55.method336();
				int var22 = field55.method336();
				int var23 = field55.method335();
				HPPBIEYV var24 = HPPBIEYV.field925[var23];
				var24.field950 = var22;
				var24.field914 = var21;
				field362 = -1;
				return true;
			}

			if (field362 == 237) {
				field265 = field55.method308();
				field362 = -1;
				return true;
			}

			if (field362 == 205) {
				String var25 = field55.method315();
				int var26 = field55.method334();
				HPPBIEYV.field925[var26].field917 = var25;

				if (field171[field114] == HPPBIEYV.field925[var26].field952) {
					field294 = true;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 207) {
				int var27 = field55.method333();
				int var28 = field55.method333();

				if (field315 != -1) {
					field315 = -1;
					field194 = true;
				}

				if (field454) {
					field454 = false;
					field194 = true;
				}

				field135 = var28;
				field378 = var27;
				field294 = true;
				field56 = true;
				field444 = false;
				field362 = -1;
				return true;
			}

			if (field362 == 167) {
				int var29 = field55.method311();
				field460 = var29;
				field194 = true;
				field362 = -1;
				return true;
			}

			if (field362 == 162) {
				field294 = true;
				int var30 = field55.method308();
				int var31 = field55.method338();
				int var32 = field55.method325();
				field118[var32] = var31;
				field292[var32] = var30;
				field87[var32] = 1;
				for (int var33 = 0; var33 < 98; var33++) {
					if (var31 >= field304[var33]) {
						field87[var32] = var33 + 2;
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 173) {
				int var34 = field55.method334();
				method138(var34);

				if (field378 != -1) {
					field378 = -1;
					field294 = true;
					field56 = true;
				}

				field315 = var34;
				field194 = true;
				field135 = -1;
				field444 = false;
				field362 = -1;
				return true;
			}

			if (field362 == 113 || field362 == 106 || field362 == 149 || field362 == 229 || field362 == 166 || field362 == 234 || field362 == 90 || field362 == 240 || field362 == 22 || field362 == 134 || field362 == 57) {
				method140(field362, field55);
				field362 = -1;
				return true;
			}

			if (field362 == 102) {
				field141 = true;
				field121 = field55.method308();
				field122 = field55.method308();
				field123 = field55.method310();
				field124 = field55.method308();
				field125 = field55.method308();
				if (field125 >= 100) {
					field335 = field121 * 128 + 64;
					field337 = field122 * 128 + 64;
					field336 = method99(field337, field150, field335) - field123;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 103) {
				int var35 = field55.method333();
				if (var35 == 0xFFFF) {
					var35 = -1;
				}

				if (field167 != var35 && field321 && !field158 && field212 == 0) {
					field279 = var35;
					field280 = true;
					field340.method171(2, field279);
				}

				field167 = var35;
				field362 = -1;
				return true;
			}

			if (field362 == 194) {
				int var36 = field55.method333();
				int var37 = field55.method310();
				if (field321 && !field158) {
					field279 = var37;
					field280 = false;
					field340.method171(2, field279);
					field212 = var36;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 199) {
				int var38 = field55.method339();
				int var39 = field55.method310();
				field170[var39] = var38;

				if (field313[var39] != var38) {
					field313[var39] = var38;
					method61(var39);
					field294 = true;

					if (field460 != -1) {
						field194 = true;
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 117) {
				int var40 = field55.method333();
				int var41 = field55.method334();
				HPPBIEYV var42 = HPPBIEYV.field925[var41];
				if (var42 != null && var42.field904 == 0) {
					if (var40 < 0) {
						var40 = 0;
					}

					if (var40 > var42.field946 - var42.field924) {
						var40 = var42.field946 - var42.field924;
					}

					var42.field949 = var40;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 188) {
				int var43 = field55.method310();
				int var44 = field55.method308();
				int var45 = field55.method310();
				if (field149 && !field158 && field57 < 50) {
					field343[field57] = var43;
					field394[field57] = var44;
					field439[field57] = FMUEZRNA.field750[var43] + var45;
					field57++;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 214) {
				boolean var46 = field55.method326() == 1;
				int var47 = field55.method334();
				HPPBIEYV.field925[var47].field951 = var46;
				field362 = -1;
				return true;
			}

			if (field362 == 242) {
				field403 = field55.method327();
				field256 = field55.method333();
				field291 = field55.method326();
				field84 = field55.method334();
				field196 = field55.method338();
				if (field196 != 0 && field135 == -1) {
					signlink.dnslookup(RTZFXINE.method472(field196));
					method147();
					short var48 = 650;
					if (field291 != 201 || field403 == 1) {
						var48 = 655;
					}

					field400 = "";
					field441 = false;

					for (int var49 = 0; var49 < HPPBIEYV.field925.length; var49++) {
						if (HPPBIEYV.field925[var49] != null && HPPBIEYV.field925[var49].field916 == var48) {
							field135 = HPPBIEYV.field925[var49].field952;
							break;
						}
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 75) {
				if (field114 == 12) {
					field294 = true;
				}

				field111 = field55.method311();
				field362 = -1;
				return true;
			}

			if (field362 == 176) {
				field83 = field55.method325();
				field82 = field55.method325();
				for (int var50 = field82; var50 < field82 + 8; var50++) {
					for (int var51 = field83; var51 < field83 + 8; var51++) {
						if (field346[field150][var50][var51] != null) {
							field346[field150][var50][var51] = null;
							method107(var50, var51);
						}
					}
				}

				for (PAWLWNVI var52 = (PAWLWNVI) field184.method427(); var52 != null; var52 = (PAWLWNVI) field184.method429()) {
					if (var52.field1139 >= field82 && var52.field1139 < field82 + 8 && var52.field1140 >= field83 && var52.field1140 < field83 + 8 && field150 == var52.field1137) {
						var52.field1142 = 0;
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 28) {
				long var53 = field55.method314();
				int var55 = field55.method308();
				String var56 = RTZFXINE.method473(RTZFXINE.method470(var53));
				for (int var57 = 0; var57 < field80; var57++) {
					if (field248[var57] == var53) {
						if (field422[var57] != var55) {
							field422[var57] = var55;
							field294 = true;

							if (var55 > 0) {
								method46("", 5, var56 + " has logged in.");
							}

							if (var55 == 0) {
								method46("", 5, var56 + " has logged out.");
							}
						}

						var56 = null;
						break;
					}
				}

				if (var56 != null && field80 < 200) {
					field248[field80] = var53;
					field354[field80] = var56;
					field422[field80] = var55;
					field80++;
					field294 = true;
				}

				boolean var58 = false;
				while (!var58) {
					var58 = true;
					for (int var59 = 0; var59 < field80 - 1; var59++) {
						if (field422[var59] != field155 && field422[var59 + 1] == field155 || field422[var59] == 0 && field422[var59 + 1] != 0) {
							int var60 = field422[var59];
							field422[var59] = field422[var59 + 1];
							field422[var59 + 1] = var60;
							String var61 = field354[var59];
							field354[var59] = field354[var59 + 1];
							field354[var59 + 1] = var61;
							long var62 = field248[var59];
							field248[var59] = field248[var59 + 1];
							field248[var59 + 1] = var62;
							field294 = true;
							var58 = false;
						}
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 67) {
				method42(field55, field361);
				field362 = -1;
				return true;
			}

			if (field362 == 31) {
				field325 = field361 / 8;
				for (int var64 = 0; var64 < field325; var64++) {
					field407[var64] = field55.method314();
				}

				field362 = -1;
				return true;
			}

			if (field362 == 249) {
				int var65 = field55.method334();
				HPPBIEYV var66 = HPPBIEYV.field925[var65];
				for (int var67 = 0; var67 < var66.field931.length; var67++) {
					var66.field931[var67] = -1;
					var66.field931[var67] = 0;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 85) {
				field341 = field55.method308();
				field362 = -1;
				return true;
			}

			if (field362 == 10) {
				int var68 = field55.method308();
				int var69 = field55.method335();
				if (var69 == 0xFFFF) {
					var69 = -1;
				}

				field171[var68] = var69;
				field294 = true;
				field56 = true;
				field362 = -1;
				return true;
			}

			if (field362 == 34) {
				method23();
				field362 = -1;
				return false;
			}

			if (field362 == 119) {
				for (int var70 = 0; var70 < field313.length; var70++) {
					if (field313[var70] != field170[var70]) {
						field313[var70] = field170[var70];
						method61(var70);
						field294 = true;
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 182) {
				field162 = field55.method325();
				field76 = field55.method335();
				field362 = -1;
				return true;
			}

			if (field362 == 50) {
				field294 = true;
				int var71 = field55.method310();
				HPPBIEYV var72 = HPPBIEYV.field925[var71];
				int var73 = field55.method310();
				for (int var74 = 0; var74 < var73; var74++) {
					int var75 = field55.method325();
					if (var75 == 255) {
						var75 = field55.method339();
					}

					var72.field931[var74] = field55.method310();
					var72.field937[var74] = var75;
				}

				for (int var76 = var73; var76 < var72.field931.length; var76++) {
					var72.field931[var76] = 0;
					var72.field937[var76] = 0;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 55) {
				field81 = field55.method308();
				field294 = true;
				field362 = -1;
				return true;
			}

			if (field362 == 184) {
				field141 = false;

				for (int var77 = 0; var77 < 5; var77++) {
					field404[var77] = false;
				}

				field362 = -1;
				return true;
			}

			if (field362 == 153) {
				int var78 = field55.method310();
				method138(var78);

				if (field315 != -1) {
					field315 = -1;
					field194 = true;
				}

				if (field454) {
					field454 = false;
					field194 = true;
				}

				field378 = var78;
				field294 = true;
				field56 = true;
				field135 = -1;
				field444 = false;
				field362 = -1;
				return true;
			}

			if (field362 == 9) {
				if (field378 != -1) {
					field378 = -1;
					field294 = true;
					field56 = true;
				}

				if (field315 != -1) {
					field315 = -1;
					field194 = true;
				}

				if (field454) {
					field454 = false;
					field194 = true;
				}

				field135 = -1;
				field444 = false;
				field362 = -1;
				return true;
			}

			if (field362 == 139) {
				int var79 = field55.method334();
				method138(var79);

				if (field378 != -1) {
					field378 = -1;
					field294 = true;
					field56 = true;
				}

				if (field315 != -1) {
					field315 = -1;
					field194 = true;
				}

				if (field454) {
					field454 = false;
					field194 = true;
				}

				field135 = var79;
				field444 = false;
				field362 = -1;
				return true;
			}

			if (field362 == 111) {
				field114 = field55.method308();
				field294 = true;
				field56 = true;
				field362 = -1;
				return true;
			}

			if (field362 == 233) {
				long var80 = field55.method314();
				int var82 = field55.method313();
				int var83 = field55.method308();
				boolean var84 = false;
				for (int var85 = 0; var85 < 100; var85++) {
					if (field357[var85] == var82) {
						var84 = true;
						break;
					}
				}

				if (var83 <= 1) {
					for (int var86 = 0; var86 < field325; var86++) {
						if (field407[var86] == var80) {
							var84 = true;
							break;
						}
					}
				}

				if (!var84 && field165 == 0) {
					try {
						field357[field98] = var82;
						field98 = (field98 + 1) % 100;
						String var87 = ENTKOOQW.method249(field55, field361 - 13);
						if (var83 != 3) {
							var87 = MVRIVVEE.method390(var87);
						}

						if (var83 == 2 || var83 == 3) {
							method46("@cr2@" + RTZFXINE.method473(RTZFXINE.method470(var80)), 7, var87);
						} else if (var83 == 1) {
							method46("@cr1@" + RTZFXINE.method473(RTZFXINE.method470(var80)), 7, var87);
						} else {
							method46(RTZFXINE.method473(RTZFXINE.method470(var80)), 3, var87);
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 107) {
				method133(field361, field55);
				field286 = false;
				field362 = -1;
				return true;
			}

			if (field362 == 24) {
				int var89 = field55.method333();
				int var90 = field55.method333();
				int var91 = field55.method335();
				int var92 = field55.method310();
				HPPBIEYV.field925[var92].field909 = var91;
				HPPBIEYV.field925[var92].field910 = var90;
				HPPBIEYV.field925[var92].field908 = var89;
				field362 = -1;
				return true;
			}

			if (field362 == 121) {
				field190 = false;
				field454 = true;
				field342 = "";
				field194 = true;
				field362 = -1;
				return true;
			}

			if (field362 == 189) {
				int var93 = field55.method334();
				int var94 = field55.method310();
				int var95 = var93 >> 10 & 0x1F;
				int var96 = var93 >> 5 & 0x1F;
				int var97 = var93 & 0x1F;
				HPPBIEYV.field925[var94].field941 = (var97 << 3) + (var95 << 19) + (var96 << 11);
				field362 = -1;
				return true;
			}

			if (field362 == 193) {
				field263 = field55.method308();
				if (field263 == 1) {
					field310 = field55.method310();
				}

				if (field263 >= 2 && field263 <= 6) {
					if (field263 == 2) {
						field319 = 64;
						field320 = 64;
					}

					if (field263 == 3) {
						field319 = 0;
						field320 = 64;
					}

					if (field263 == 4) {
						field319 = 128;
						field320 = 64;
					}

					if (field263 == 5) {
						field319 = 64;
						field320 = 0;
					}

					if (field263 == 6) {
						field319 = 64;
						field320 = 128;
					}

					field263 = 2;
					field316 = field55.method310();
					field317 = field55.method310();
					field318 = field55.method308();
				}

				if (field263 == 10) {
					field112 = field55.method310();
				}

				field362 = -1;
				return true;
			}

			if (field362 == 104) {
				int var98 = field55.method336();
				if (var98 >= 0) {
					method138(var98);
				}

				field461 = var98;
				field362 = -1;
				return true;
			}

			if (field362 == 120) {
				byte var99 = field55.method329();
				int var100 = field55.method335();
				field170[var100] = var99;

				if (field313[var100] != var99) {
					field313[var100] = var99;
					method61(var100);
					field294 = true;

					if (field460 != -1) {
						field194 = true;
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 154) {
				field83 = field55.method326();
				field82 = field55.method326();
				field362 = -1;
				return true;
			}

			if (field362 == 255) {
				String var101 = field55.method315();
				if (var101.endsWith(":tradereq:")) {
					String var102 = var101.substring(0, var101.indexOf(":"));
					long var103 = RTZFXINE.method469(var102);
					boolean var105 = false;
					for (int var106 = 0; var106 < field325; var106++) {
						if (field407[var106] == var103) {
							var105 = true;
							break;
						}
					}

					if (!var105 && field165 == 0) {
						method46(var102, 4, "wishes to trade with you.");
					}
				} else if (var101.endsWith(":duelreq:")) {
					String var107 = var101.substring(0, var101.indexOf(":"));
					long var108 = RTZFXINE.method469(var107);
					boolean var110 = false;
					for (int var111 = 0; var111 < field325; var111++) {
						if (field407[var111] == var108) {
							var110 = true;
							break;
						}
					}

					if (!var110 && field165 == 0) {
						method46(var107, 8, "wishes to duel with you.");
					}
				} else if (var101.endsWith(":chalreq:")) {
					String var112 = var101.substring(0, var101.indexOf(":"));
					long var113 = RTZFXINE.method469(var112);
					boolean var115 = false;
					for (int var116 = 0; var116 < field325; var116++) {
						if (field407[var116] == var113) {
							var115 = true;
							break;
						}
					}

					if (!var115 && field165 == 0) {
						String var117 = var101.substring(var101.indexOf(":") + 1, var101.length() - 9);
						method46(var112, 8, var117);
					}
				} else {
					method46("", 0, var101);
				}

				field362 = -1;
				return true;
			}

			if (field362 == 129) {
				field424 = field55.method308();
				field307 = field55.method308();
				field186 = field55.method308();
				field191 = true;
				field194 = true;
				field362 = -1;
				return true;
			}

			if (field362 == 86 || field362 == 178) {
				int var118 = field462;
				int var119 = field463;
				if (field362 == 86) {
					var119 = field55.method333();
					var118 = field55.method310();
					field395 = false;
				}

				if (field362 == 178) {
					field55.method318();

					for (int var120 = 0; var120 < 4; var120++) {
						for (int var121 = 0; var121 < 13; var121++) {
							for (int var122 = 0; var122 < 13; var122++) {
								int var123 = field55.method319(1);
								if (var123 == 1) {
									field398[var120][var121][var122] = field55.method319(26);
								} else {
									field398[var120][var121][var122] = -1;
								}
							}
						}
					}

					field55.method320();
					var119 = field55.method335();
					var118 = field55.method310();
					field395 = true;
				}

				if (field462 == var118 && field463 == var119 && field109 == 2) {
					field362 = -1;
					return true;
				}

				field462 = var118;
				field463 = var119;
				field126 = (field462 - 6) * 8;
				field127 = (field463 - 6) * 8;
				field221 = false;
				if ((field462 / 8 == 48 || field462 / 8 == 49) && field463 / 8 == 48) {
					field221 = true;
				}

				if (field462 / 8 == 48 && field463 / 8 == 148) {
					field221 = true;
				}

				field109 = 1;
				field86 = System.currentTimeMillis();
				field298.method376();
				field103.method356(151, 0, "Loading - please wait.", 257);
				field103.method356(150, 0xFFFFFF, "Loading - please wait.", 256);
				field298.method377(field709, 4, 4);

				if (field362 == 86) {
					int var124 = 0;
					for (int var125 = (field462 - 6) / 8; var125 <= (field462 + 6) / 8; var125++) {
						for (int var126 = (field463 - 6) / 8; var126 <= (field463 + 6) / 8; var126++) {
							var124++;
						}
					}

					field425 = new byte[var124][];
					field181 = new byte[var124][];
					field230 = new int[var124];
					field231 = new int[var124];
					field232 = new int[var124];
					int var127 = 0;
					for (int var128 = (field462 - 6) / 8; var128 <= (field462 + 6) / 8; var128++) {
						for (int var129 = (field463 - 6) / 8; var129 <= (field463 + 6) / 8; var129++) {
							field230[var127] = (var128 << 8) + var129;

							if (field221 && (var129 == 49 || var129 == 149 || var129 == 147 || var128 == 50 || var128 == 49 && var129 == 47)) {
								field231[var127] = -1;
								field232[var127] = -1;
								var127++;
							} else {
								int var130 = field231[var127] = field340.method169(var129, var128, 0);
								if (var130 != -1) {
									field340.method171(3, var130);
								}

								int var131 = field232[var127] = field340.method169(var129, var128, 1);
								if (var131 != -1) {
									field340.method171(3, var131);
								}

								var127++;
							}
						}
					}
				}

				if (field362 == 178) {
					int var132 = 0;
					int[] var133 = new int[676];
					for (int var134 = 0; var134 < 4; var134++) {
						for (int var135 = 0; var135 < 13; var135++) {
							for (int var136 = 0; var136 < 13; var136++) {
								int var137 = field398[var134][var135][var136];
								if (var137 != -1) {
									int var138 = var137 >> 14 & 0x3FF;
									int var139 = var137 >> 3 & 0x7FF;
									int var140 = (var138 / 8 << 8) + var139 / 8;
									for (int var141 = 0; var141 < var132; var141++) {
										if (var133[var141] == var140) {
											var140 = -1;
											break;
										}
									}

									if (var140 != -1) {
										var133[var132++] = var140;
									}
								}
							}
						}
					}

					field425 = new byte[var132][];
					field181 = new byte[var132][];
					field230 = new int[var132];
					field231 = new int[var132];
					field232 = new int[var132];
					for (int var142 = 0; var142 < var132; var142++) {
						int var143 = field230[var142] = var133[var142];
						int var144 = var143 >> 8 & 0xFF;
						int var145 = var143 & 0xFF;
						int var146 = field231[var142] = field340.method169(var145, var144, 0);
						if (var146 != -1) {
							field340.method171(3, var146);
						}

						int var147 = field232[var142] = field340.method169(var145, var144, 1);
						if (var147 != -1) {
							field340.method171(3, var147);
						}
					}
				}

				int var148 = field126 - field128;
				int var149 = field127 - field129;
				field128 = field126;
				field129 = field127;

				for (int var150 = 0; var150 < 16384; var150++) {
					CRBPLXHF var151 = field269[var150];
					if (var151 != null) {
						for (int var152 = 0; var152 < 10; var152++) {
							var151.field772[var152] -= var148;
							var151.field773[var152] -= var149;
						}

						var151.field781 -= var148 * 128;
						var151.field782 -= var149 * 128;
					}
				}

				for (int var153 = 0; var153 < field369; var153++) {
					CXEZIPRQ var154 = field371[var153];
					if (var154 != null) {
						for (int var155 = 0; var155 < 10; var155++) {
							var154.field772[var155] -= var148;
							var154.field773[var155] -= var149;
						}

						var154.field781 -= var148 * 128;
						var154.field782 -= var149 * 128;
					}
				}

				field286 = true;
				byte var156 = 0;
				byte var157 = 104;
				byte var158 = 1;
				if (var148 < 0) {
					var156 = 103;
					var157 = -1;
					var158 = -1;
				}

				byte var159 = 0;
				byte var160 = 104;
				byte var161 = 1;
				if (var149 < 0) {
					var159 = 103;
					var160 = -1;
					var161 = -1;
				}

				for (int var162 = var156; var162 != var157; var162 += var158) {
					for (int var163 = var159; var163 != var160; var163 += var161) {
						int var164 = var148 + var162;
						int var165 = var149 + var163;
						for (int var166 = 0; var166 < 4; var166++) {
							if (var164 >= 0 && var165 >= 0 && var164 < 104 && var165 < 104) {
								field346[var166][var162][var163] = field346[var166][var164][var165];
							} else {
								field346[var166][var162][var163] = null;
							}
						}
					}
				}

				for (PAWLWNVI var167 = (PAWLWNVI) field184.method427(); var167 != null; var167 = (PAWLWNVI) field184.method429()) {
					var167.field1139 -= var148;
					var167.field1140 -= var149;
					if (var167.field1139 < 0 || var167.field1140 < 0 || var167.field1139 >= 104 || var167.field1140 >= 104) {
						var167.method234();
					}
				}

				if (field203 != 0) {
					field203 -= var148;
					field204 -= var149;
				}

				field141 = false;
				field362 = -1;
				return true;
			}

			if (field362 == 78) {
				field266 = field55.method310() * 30;
				field362 = -1;
				return true;
			}

			if (field362 == 36) {
				for (int var168 = 0; var168 < field371.length; var168++) {
					if (field371[var168] != null) {
						field371[var168].field794 = -1;
					}
				}

				for (int var169 = 0; var169 < field269.length; var169++) {
					if (field269[var169] != null) {
						field269[var169].field794 = -1;
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 2) {
				int var170 = field55.method310();
				HPPBIEYV.field925[var170].field961 = 3;

				if (field435.field475 == null) {
					HPPBIEYV.field925[var170].field962 = (field435.field482[11] << 5) + (field435.field482[8] << 10) + (field435.field482[0] << 15) + (field435.field479[0] << 25) + (field435.field479[4] << 20) + field435.field482[1];
				} else {
					HPPBIEYV.field925[var170].field962 = (int) (field435.field475.field658 + 0x12345678L);
				}

				field362 = -1;
				return true;
			}

			if (field362 == 163) {
				int var171 = field55.method333();
				int var172 = field55.method335();
				HPPBIEYV.field925[var172].field961 = 1;
				HPPBIEYV.field925[var172].field962 = var171;
				field362 = -1;
				return true;
			}

			if (field362 == 40) {
				if (field114 == 12) {
					field294 = true;
				}

				field211 = field55.method308();
				field362 = -1;
				return true;
			}

			if (field362 == 33) {
				field141 = true;
				field430 = field55.method308();
				field431 = field55.method308();
				field432 = field55.method310();
				field433 = field55.method308();
				field434 = field55.method308();
				if (field434 >= 100) {
					int var173 = field430 * 128 + 64;
					int var174 = field431 * 128 + 64;
					int var175 = method99(var174, field150, var173) - field432;
					int var176 = var173 - field335;
					int var177 = var175 - field336;
					int var178 = var174 - field337;
					int var179 = (int) Math.sqrt(var176 * var176 + var178 * var178);
					field338 = (int) (Math.atan2(var177, var179) * 325.949D) & 0x7FF;
					field339 = (int) (Math.atan2(var176, var178) * -325.949D) & 0x7FF;

					if (field338 < 128) {
						field338 = 128;
					}

					if (field338 > 383) {
						field338 = 383;
					}
				}

				field362 = -1;
				return true;
			}

			if (field362 == 144) {
				field83 = field55.method326();
				field82 = field55.method326();

				while (field55.field969 < field361) {
					int var180 = field55.method308();
					method140(var180, field55);
				}

				field362 = -1;
				return true;
			}

			if (field362 == 142) {
				int var181 = field55.method335();
				int var182 = field55.method310();
				HPPBIEYV.field925[var182].field961 = 2;
				HPPBIEYV.field925[var182].field962 = var181;
				field362 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field362 + "," + field361 + " - " + field323 + "," + field324);
			method23();
		} catch (IOException var187) {
			method150();
		} catch (Exception var188) {
			String var184 = "T2 - " + field362 + "," + field323 + "," + field324 + " - " + field361 + "," + (field435.field772[0] + field126) + "," + (field435.field773[0] + field127) + " - ";
			for (int var185 = 0; var185 < field361 && var185 < 50; var185++) {
				var184 = var184 + field55.field968[var185] + ",";
			}

			signlink.reporterror(var184);
			method23();
		}

		return true;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method30() {
		for (int var1 = -1; var1 < field372; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field370;
			} else {
				var2 = field373[var1];
			}

			CXEZIPRQ var3 = field371[var2];
			if (var3 != null && var3.field778 > 0) {
				var3.field778--;
				if (var3.field778 == 0) {
					var3.field759 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field270; var4++) {
			int var5 = field271[var4];
			CRBPLXHF var6 = field269[var5];
			if (var6 != null && var6.field778 > 0) {
				var6.field778--;
				if (var6.field778 == 0) {
					var6.field759 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILHPPBIEYV;I)V")
	public final void method31(int arg0, int arg1, HPPBIEYV arg2, int arg3) {
		if (arg2.field904 == 0 && arg2.field948 != null && (!arg2.field951 || field187 == arg2.field959 || field290 == arg2.field959 || field402 == arg2.field959)) {
			int var5 = RSDCQVXF.field1197;
			int var6 = RSDCQVXF.field1195;
			int var7 = RSDCQVXF.field1198;
			int var8 = RSDCQVXF.field1196;
			RSDCQVXF.method455(arg2.field926 + arg3, arg2.field924 + arg1, arg1, arg3);
			int var9 = arg2.field948.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field963[var10] + arg3;
				int var12 = arg2.field960[var10] + arg1 - arg0;
				HPPBIEYV var13 = HPPBIEYV.field925[arg2.field948[var10]];
				var11 += var13.field950;
				var12 += var13.field914;

				if (var13.field916 > 0) {
					method92(var13);
				}

				if (var13.field904 == 0) {
					if (var13.field949 > var13.field946 - var13.field924) {
						var13.field949 = var13.field946 - var13.field924;
					}

					if (var13.field949 < 0) {
						var13.field949 = 0;
					}

					method31(var13.field949, var12, var13, var11);

					if (var13.field946 > var13.field924) {
						method145(var13.field924, var12, var13.field926 + var11, var13.field946, var13.field949);
					}
				} else if (var13.field904 != 1) {
					if (var13.field904 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field924; var15++) {
							for (int var16 = 0; var16 < var13.field926; var16++) {
								int var17 = (var13.field905 + 32) * var16 + var11;
								int var18 = (var13.field907 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field934[var14];
									var18 += var13.field942[var14];
								}

								if (var13.field931[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field931[var14] - 1;
									if (var17 > RSDCQVXF.field1197 - 32 && var17 < RSDCQVXF.field1198 && var18 > RSDCQVXF.field1195 - 32 && var18 < RSDCQVXF.field1196 || field457 != 0 && field456 == var14) {
										int var22 = 0;
										if (field175 == 1 && field176 == var14 && field177 == var13.field959) {
											var22 = 0xFFFFFF;
										}

										XKULRNBA var23 = HFWXROSJ.method282(var13.field937[var14], var22, var21);
										if (var23 != null) {
											if (field457 != 0 && field456 == var14 && field455 == var13.field959) {
												var19 = field717 - field458;
												var20 = field718 - field459;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field227 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method516(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < RSDCQVXF.field1195 && arg2.field949 > 0) {
													int var24 = (RSDCQVXF.field1195 - var18 - var20) * field229 / 3;
													if (var24 > field229 * 10) {
														var24 = field229 * 10;
													}

													if (var24 > arg2.field949) {
														var24 = arg2.field949;
													}

													arg2.field949 -= var24;
													field459 += var24;
												}

												if (var18 + var20 + 32 > RSDCQVXF.field1196 && arg2.field949 < arg2.field946 - arg2.field924) {
													int var25 = (var18 + var20 + 32 - RSDCQVXF.field1196) * field229 / 3;
													if (var25 > field229 * 10) {
														var25 = field229 * 10;
													}

													if (var25 > arg2.field946 - arg2.field924 - arg2.field949) {
														var25 = arg2.field946 - arg2.field924 - arg2.field949;
													}

													arg2.field949 += var25;
													field459 -= var25;
												}
											} else if (field238 != 0 && field237 == var14 && field236 == var13.field959) {
												var23.method516(var18, var17, 128);
											} else {
												var23.method514(var18, var17);
											}

											if (var23.field1365 == 33 || var13.field937[var14] != 1) {
												int var26 = var13.field937[var14];
												field102.method360(var17 + var19 + 1, 0, method17(var26), var18 + var20 + 10);
												field102.method360(var17 + var19, 0xFFFF00, method17(var26), var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field957 != null && var14 < 20) {
									XKULRNBA var27 = var13.field957[var14];
									if (var27 != null) {
										var27.method514(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field904 == 3) {
						boolean var28 = false;
						if (field402 == var13.field959 || field290 == var13.field959 || field187 == var13.field959) {
							var28 = true;
						}

						int var29;
						if (method55(var13)) {
							var29 = var13.field929;
							if (var28 && var13.field912 != 0) {
								var29 = var13.field912;
							}
						} else {
							var29 = var13.field941;
							if (var28 && var13.field956 != 0) {
								var29 = var13.field956;
							}
						}

						if (var13.field958 == 0) {
							if (var13.field918) {
								RSDCQVXF.method458(var13.field926, var29, var12, var11, var13.field924);
							} else {
								RSDCQVXF.method459(var29, var11, var13.field926, var13.field924, var12);
							}
						} else if (var13.field918) {
							RSDCQVXF.method457(256 - (var13.field958 & 0xFF), var29, var13.field924, var11, var13.field926, var12);
						} else {
							RSDCQVXF.method460(var13.field924, var11, var12, var29, 256 - (var13.field958 & 0xFF), var13.field926);
						}
					} else if (var13.field904 == 4) {
						JLICUWSE var30 = var13.field921;
						String var31 = var13.field917;
						boolean var32 = false;
						if (field402 == var13.field959 || field290 == var13.field959 || field187 == var13.field959) {
							var32 = true;
						}

						int var33;
						if (method55(var13)) {
							var33 = var13.field929;
							if (var32 && var13.field912 != 0) {
								var33 = var13.field912;
							}

							if (var13.field913.length() > 0) {
								var31 = var13.field913;
							}
						} else {
							var33 = var13.field941;
							if (var32 && var13.field956 != 0) {
								var33 = var13.field956;
							}
						}

						if (var13.field915 == 6 && field444) {
							var31 = "Please wait...";
							var33 = var13.field941;
						}

						if (RSDCQVXF.field1193 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1050 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method43(method144(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method43(method144(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method43(method144(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method43(method144(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method43(method144(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field936) {
								var30.method357(var13.field964, var13.field926 / 2 + var11, var33, var41, var34);
							} else {
								var30.method364(var33, var34, var11, var13.field964, var41);
							}

							var34 += var30.field1050;
						}
					} else if (var13.field904 == 5) {
						XKULRNBA var42;
						if (method55(var13)) {
							var42 = var13.field945;
						} else {
							var42 = var13.field947;
						}

						if (var42 != null) {
							var42.method514(var12, var11);
						}
					} else if (var13.field904 == 6) {
						int var43 = DKTEWQXO.field624;
						int var44 = DKTEWQXO.field625;
						DKTEWQXO.field624 = var13.field926 / 2 + var11;
						DKTEWQXO.field625 = var13.field924 / 2 + var12;
						int var45 = DKTEWQXO.field628[var13.field909] * var13.field908 >> 16;
						int var46 = DKTEWQXO.field629[var13.field909] * var13.field908 >> 16;
						boolean var47 = method55(var13);
						int var48;
						if (var47) {
							var48 = var13.field954;
						} else {
							var48 = var13.field953;
						}

						DHUPIIUL var49;
						if (var48 == -1) {
							var49 = var13.method294(-1, var47, -1);
						} else {
							HARRRJHW var50 = HARRRJHW.field840[var48];
							var49 = var13.method294(var50.field843[var13.field919], var47, var50.field842[var13.field919]);
						}

						if (var49 != null) {
							var49.method211(0, var13.field910, 0, var13.field909, 0, var45, var46);
						}

						DKTEWQXO.field624 = var43;
						DKTEWQXO.field625 = var44;
					} else if (var13.field904 == 7) {
						JLICUWSE var51 = var13.field921;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field924; var53++) {
							for (int var54 = 0; var54 < var13.field926; var54++) {
								if (var13.field931[var52] > 0) {
									HFWXROSJ var55 = HFWXROSJ.method286(var13.field931[var52] - 1);
									String var56 = var55.field890;
									if (var55.field856 || var13.field937[var52] != 1) {
										var56 = var56 + " x" + method156(var13.field937[var52]);
									}

									int var57 = (var13.field905 + 115) * var54 + var11;
									int var58 = (var13.field907 + 12) * var53 + var12;
									if (var13.field936) {
										var51.method357(var13.field964, var13.field926 / 2 + var57, var13.field941, var56, var58);
									} else {
										var51.method364(var13.field941, var58, var57, var13.field964, var56);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			RSDCQVXF.method455(var7, var8, var6, var5);
		}
	}

	@ObfuscatedName("client.a(ILHPPBIEYV;)Z")
	public final boolean method32(HPPBIEYV arg0) {
		int var2 = arg0.field916;
		if (field81 == 2) {
			if (var2 == 201) {
				field194 = true;
				field454 = false;
				field190 = true;
				field202 = "";
				field85 = 1;
				field383 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field194 = true;
				field454 = false;
				field190 = true;
				field202 = "";
				field85 = 2;
				field383 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field365 = 250;
			return true;
		}

		if (var2 == 501) {
			field194 = true;
			field454 = false;
			field190 = true;
			field202 = "";
			field85 = 4;
			field383 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field194 = true;
			field454 = false;
			field190 = true;
			field202 = "";
			field85 = 5;
			field383 = "Enter name of player to delete from list";
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
							var5 = FIQZIGZB.field741 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= FIQZIGZB.field741) {
							var5 = 0;
						}
					}

					if (!FIQZIGZB.field742[var5].field748 && FIQZIGZB.field742[var5].field743 == var3 + (field393 ? 0 : 7)) {
						break;
					}
				}

				field308[var3] = var5;
				field285 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field130[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field382[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field382[var6].length) {
					var8 = 0;
				}
			}

			field130[var6] = var8;
			field285 = true;
		}

		if (var2 == 324 && !field393) {
			field393 = true;
			method109();
		}

		if (var2 == 325 && field393) {
			field393 = false;
			method109();
		}

		if (var2 == 326) {
			field347.method297(21);
			field347.method298(field393 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field347.method298(field308[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field347.method298(field130[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field441 = !field441;
		}

		if (var2 >= 601 && var2 <= 612) {
			method147();

			if (field400.length() > 0) {
				field347.method297(222);
				field347.method304(RTZFXINE.method469(field400));
				field347.method298(var2 - 601);
				field347.method298(field441 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(BILINLHDAGO;)V")
	public final void method33(int arg0, INLHDAGO arg1) {
		for (int var3 = 0; var3 < field374; var3++) {
			int var4 = field375[var3];
			CXEZIPRQ var5 = field371[var4];
			int var6 = arg1.method308();
			if ((var6 & 0x1) != 0) {
				var6 += arg1.method308() << 8;
			}

			method154(arg1, var4, var5, var6);
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method34(boolean arg0) {
		for (int var2 = 0; var2 < field270; var2++) {
			CRBPLXHF var3 = field269[field271[var2]];
			int var4 = (field271[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method161() && var3.field473.field667 == arg0) {
				int var5 = var3.field781 >> 7;
				int var6 = var3.field782 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field808 == 1 && (var3.field781 & 0x7F) == 0x40 && (var3.field782 & 0x7F) == 0x40) {
						if (field97[var5][var6] == field213) {
							continue;
						}

						field97[var5][var6] = field213;
					}

					field405.method538(var3.field782, field150, var3.field781, var3.field758, (var3.field808 - 1) * 64 + 60, var3, var4, var3.field783, method99(var3.field782, field150, var3.field781));
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method35(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field80; var3++) {
				if (field248[var3] == arg0) {
					field80--;
					field294 = true;

					for (int var4 = var3; var4 < field80; var4++) {
						field354[var4] = field354[var4 + 1];
						field422[var4] = field422[var4 + 1];
						field248[var4] = field248[var4 + 1];
					}

					field347.method297(110);
					field347.method304(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILCXEZIPRQ;IZ)V")
	public final void method36(int arg0, int arg1, CXEZIPRQ arg2, int arg3) {
		if (field435 != arg2 && field233 < 400) {
			String var5;
			if (arg2.field477 == 0) {
				var5 = arg2.field474 + method130(arg2.field478, field435.field478) + " (level-" + arg2.field478 + ")";
			} else {
				var5 = arg2.field474 + " (skill-" + arg2.field477 + ")";
			}

			if (field175 == 1) {
				field283[field233] = "Use " + field179 + " with @whi@" + var5;
				field428[field233] = 78;
				field429[field233] = arg3;
				field426[field233] = arg1;
				field427[field233] = arg0;
				field233++;
			} else if (field145 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field115[var6] != null) {
						field283[field233] = field115[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field115[var6].equalsIgnoreCase("attack")) {
							if (arg2.field478 > field435.field478) {
								var7 = 2000;
							}

							if (field435.field489 != 0 && arg2.field489 != 0) {
								if (field435.field489 == arg2.field489) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field116[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field428[field233] = var7 + 888;
						}

						if (var6 == 1) {
							field428[field233] = var7 + 341;
						}

						if (var6 == 2) {
							field428[field233] = var7 + 758;
						}

						if (var6 == 3) {
							field428[field233] = var7 + 437;
						}

						if (var6 == 4) {
							field428[field233] = var7 + 608;
						}

						field429[field233] = arg3;
						field426[field233] = arg1;
						field427[field233] = arg0;
						field233++;
					}
				}
			} else if ((field147 & 0x8) == 8) {
				field283[field233] = field148 + " @whi@" + var5;
				field428[field233] = 469;
				field429[field233] = arg3;
				field426[field233] = arg1;
				field427[field233] = arg0;
				field233++;
			}

			for (int var8 = 0; var8 < field233; var8++) {
				if (field428[var8] == 89) {
					field283[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method37() {
		field296.method376();
		DKTEWQXO.field630 = field331;
		field224.method10(0, 0);

		if (field378 != -1) {
			method31(0, 0, HPPBIEYV.field925[field378], 0);
		} else if (field171[field114] != -1) {
			method31(0, 0, HPPBIEYV.field925[field171[field114]], 0);
		}

		if (field281 && field58 == 1) {
			method54();
		}

		field296.method377(field709, 553, 205);
		field298.method376();
		DKTEWQXO.field630 = field332;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method38() {
		field209 = true;
	}

	@ObfuscatedName("client.c(II)Z")
	public final boolean method39(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field428[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 726) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method40() {
		if (field723 == 1) {
			if (field724 >= 6 && field724 <= 106 && field725 >= 467 && field725 <= 499) {
				field424 = (field424 + 1) % 4;
				field191 = true;
				field194 = true;
				field347.method297(50);
				field347.method298(field424);
				field347.method298(field307);
				field347.method298(field186);
			}

			if (field724 >= 135 && field724 <= 235 && field725 >= 467 && field725 <= 499) {
				field307 = (field307 + 1) % 3;
				field191 = true;
				field194 = true;
				field347.method297(50);
				field347.method298(field424);
				field347.method298(field307);
				field347.method298(field186);
			}

			if (field724 >= 273 && field724 <= 373 && field725 >= 467 && field725 <= 499) {
				field186 = (field186 + 1) % 3;
				field191 = true;
				field194 = true;
				field347.method297(50);
				field347.method298(field424);
				field347.method298(field307);
				field347.method298(field186);
			}

			if (field724 >= 412 && field724 <= 512 && field725 >= 467 && field725 <= 499) {
				if (field135 == -1) {
					method147();
					field400 = "";
					field441 = false;

					for (int var1 = 0; var1 < HPPBIEYV.field925.length; var1++) {
						if (HPPBIEYV.field925[var1] != null && HPPBIEYV.field925[var1].field916 == 600) {
							field277 = field135 = HPPBIEYV.field925[var1].field952;
							return;
						}
					}

					return;
				}

				method46("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method41(int arg0) {
		int[] var2 = field205.field1360;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field142[arg0][var7][var5] & 0x18) == 0) {
					field405.method562(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field142[arg0 + 1][var7][var5] & 0x8) != 0) {
					field405.method562(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field205.method509();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field142[arg0][var11][var10] & 0x18) == 0) {
					method143(var9, var10, var8, var11, arg0);
				}

				if (arg0 < 3 && (field142[arg0 + 1][var11][var10] & 0x8) != 0) {
					method143(var9, var10, var8, var11, arg0 + 1);
				}
			}
		}

		field298.method376();
		field438++;
		if (field438 > 1408) {
			field438 = 0;
			field347.method297(245);
			field347.method298(0);
			int var12 = field347.field969;
			field347.method299(59308);
			field347.method299((int) (Math.random() * 65536.0D));
			field347.method298((int) (Math.random() * 256.0D));
			field347.method299((int) (Math.random() * 65536.0D));
			field347.method299(30947);
			field347.method299((int) (Math.random() * 65536.0D));
			field347.method299((int) (Math.random() * 65536.0D));
			field347.method298(181);
			field347.method298(44);

			if ((int) (Math.random() * 2.0D) == 0) {
				field347.method298(97);
			}

			field347.method307(field347.field969 - var12);
		}

		field326 = 0;
		for (int var13 = 0; var13 < 104; var13++) {
			for (int var14 = 0; var14 < 104; var14++) {
				int var15 = field405.method556(field150, var13, var14);
				if (var15 != 0) {
					var15 = var15 >> 14 & 0x7FFF;
					int var16 = UVSOAWGE.method501(var15).field1308;
					if (var16 >= 0) {
						int var17 = var13;
						int var18 = var14;
						if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
							byte var19 = 104;
							byte var20 = 104;
							int[][] var21 = field423[field150].field1297;
							for (int var22 = 0; var22 < 10; var22++) {
								int var23 = (int) (Math.random() * 4.0D);
								if (var23 == 0 && var17 > 0 && var17 > var13 - 3 && (var21[var17 - 1][var18] & 0x280108) == 0) {
									var17--;
								}

								if (var23 == 1 && var17 < var19 - 1 && var17 < var13 + 3 && (var21[var17 + 1][var18] & 0x280180) == 0) {
									var17++;
								}

								if (var23 == 2 && var18 > 0 && var18 > var14 - 3 && (var21[var17][var18 - 1] & 0x280102) == 0) {
									var18--;
								}

								if (var23 == 3 && var18 < var20 - 1 && var18 < var14 + 3 && (var21[var17][var18 + 1] & 0x280120) == 0) {
									var18++;
								}
							}
						}

						field333[field326] = field75[var16];
						field327[field326] = var17;
						field328[field326] = var18;
						field326++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILINLHDAGO;I)V")
	public final void method42(INLHDAGO arg0, int arg1) {
		field163 = 0;
		field374 = 0;
		method137(arg0, arg1);
		method118(arg0, arg1);
		method72(arg1, arg0);

		for (int var3 = 0; var3 < field163; var3++) {
			int var4 = field164[var3];
			if (field301 != field269[var4].field760) {
				field269[var4].field473 = null;
				field269[var4] = null;
			}
		}

		if (arg0.field969 != arg1) {
			signlink.reporterror(field344 + " size mismatch in getnpcpos - pos:" + arg0.field969 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field270; var5++) {
			if (field269[field271[var5]] == null) {
				signlink.reporterror(field344 + " null entry in npc list - pos:" + var5 + " size:" + field270);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public final String method43(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(B)V")
	public final void method44() {
		try {
			int var1 = field435.field781 + field348;
			int var2 = field435.field782 + field133;
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

			if (field727[1] == 1) {
				field47 += (-field47 - 24) / 2;
			} else if (field727[2] == 1) {
				field47 += (24 - field47) / 2;
			} else {
				field47 /= 2;
			}

			if (field727[3] == 1) {
				field48 += (12 - field48) / 2;
			} else if (field727[4] == 1) {
				field48 += (-field48 - 12) / 2;
			} else {
				field48 /= 2;
			}

			field46 = field47 / 2 + field46 & 0x7FF;
			field45 += field48 / 2;
			if (field45 < 128) {
				field45 = 128;
			}

			if (field45 > 383) {
				field45 = 383;
			}

			int var3 = field214 >> 7;
			int var4 = field215 >> 7;
			int var5 = method99(field215, field150, field214);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field150;
						if (var9 < 3 && (field142[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field262[var9][var7][var8];
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

			if (var11 > field99) {
				field99 += (var11 - field99) / 24;
			} else if (var11 < field99) {
				field99 += (var11 - field99) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field435.field781 + "," + field435.field782 + "," + field214 + "," + field215 + "," + field462 + "," + field463 + "," + field126 + "," + field127);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method45(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ZILjava/lang/String;)V")
	public final void method46(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field460 != -1) {
			field366 = arg2;
			field723 = 0;
		}

		if (field315 == -1) {
			field194 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field218[var4] = field218[var4 - 1];
			field219[var4] = field219[var4 - 1];
			field220[var4] = field220[var4 - 1];
		}

		field218[0] = arg1;
		field219[0] = arg0;
		field220[0] = arg2;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method47(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field159 = "";
				field160 = "Connecting to server...";
				method84(true);
			}

			field131 = new YZICXNNP(method112(field156 + 43594), this);
			long var4 = RTZFXINE.method469(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field347.field969 = 0;
			field347.method298(14);
			field347.method298(var6);
			field131.method587(0, field347.field968, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field131.method584();
			}

			int var8 = field131.method584();
			int var9 = var8;

			if (var8 == 0) {
				field131.method586(field55.field968, 0, 8);
				field55.field969 = 0;
				field464 = field55.method314();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field464 >> 32), (int) field464 };
				field347.field969 = 0;
				field347.method298(10);
				field347.method302(var10[0]);
				field347.method302(var10[1]);
				field347.method302(var10[2]);
				field347.method302(var10[3]);
				field347.method302(signlink.uid);
				field347.method305(arg0);
				field347.method305(arg1);
				field347.method323(field108, field448);
				field192.field969 = 0;

				if (arg2) {
					field192.method298(18);
				} else {
					field192.method298(16);
				}

				field192.method298(field347.field969 + 36 + 1 + 1 + 2);
				field192.method298(255);
				field192.method299(307);
				field192.method298(field158 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field192.method302(field293[var11]);
				}

				field192.method306(field347.field969, 0, field347.field968);
				field347.field973 = new SKDZZMVP(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field314 = new SKDZZMVP(var10);
				field131.method587(0, field192.field968, field192.field969);
				var8 = field131.method584();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method47(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field195 = field131.method584();
				field54 = field131.method584() == 1;
				field77 = 0L;
				field106 = 0;
				field189.field1269 = 0;
				field714 = true;
				field309 = true;
				field168 = true;
				field347.field969 = 0;
				field55.field969 = 0;
				field362 = -1;
				field322 = -1;
				field323 = -1;
				field324 = -1;
				field361 = 0;
				field363 = 0;
				field266 = 0;
				field365 = 0;
				field263 = 0;
				field233 = 0;
				field281 = false;
				field715 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field220[var13] = null;
				}

				field175 = 0;
				field145 = 0;
				field109 = 0;
				field57 = 0;
				field348 = (int) (Math.random() * 100.0D) - 50;
				field133 = (int) (Math.random() * 110.0D) - 55;
				field182 = (int) (Math.random() * 80.0D) - 40;
				field197 = (int) (Math.random() * 120.0D) - 60;
				field358 = (int) (Math.random() * 30.0D) - 20;
				field46 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field265 = 0;
				field274 = -1;
				field203 = 0;
				field204 = 0;
				field372 = 0;
				field270 = 0;

				for (int var14 = 0; var14 < field369; var14++) {
					field371[var14] = null;
					field376[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field269[var15] = null;
				}

				field435 = field371[field370] = new CXEZIPRQ();
				field247.method431();
				field287.method431();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field346[var16][var17][var18] = null;
						}
					}
				}

				field184 = new ROXEPOUC();
				field81 = 0;
				field80 = 0;
				field460 = -1;
				field315 = -1;
				field135 = -1;
				field378 = -1;
				field461 = -1;
				field444 = false;
				field114 = 3;
				field454 = false;
				field281 = false;
				field190 = false;
				field366 = null;
				field341 = 0;
				field119 = -1;
				field393 = true;
				method109();

				for (int var19 = 0; var19 < 5; var19++) {
					field130[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field115[var20] = null;
					field116[var20] = false;
				}

				field207 = 0;
				field295 = 0;
				field252 = 0;
				field93 = 0;
				field95 = 0;
				field367 = 0;
				field380 = 0;
				field174 = 0;
				method117();
			} else if (var8 == 3) {
				field159 = "";
				field160 = "Invalid username or password.";
			} else if (var8 == 4) {
				field159 = "Your account has been disabled.";
				field160 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field159 = "Your account is already logged in.";
				field160 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field159 = "RuneScape has been updated!";
				field160 = "Please reload this page.";
			} else if (var8 == 7) {
				field159 = "This world is full.";
				field160 = "Please use a different world.";
			} else if (var8 == 8) {
				field159 = "Unable to connect.";
				field160 = "Login server offline.";
			} else if (var8 == 9) {
				field159 = "Login limit exceeded.";
				field160 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field159 = "Unable to connect.";
				field160 = "Bad session id.";
			} else if (var8 == 11) {
				field160 = "Login server rejected session.";
				field160 = "Please try again.";
			} else if (var8 == 12) {
				field159 = "You need a members account to login to this world.";
				field160 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field159 = "Could not complete login.";
				field160 = "Please try using a different world.";
			} else if (var8 == 14) {
				field159 = "The server is being updated.";
				field160 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field168 = true;
				field347.field969 = 0;
				field55.field969 = 0;
				field362 = -1;
				field322 = -1;
				field323 = -1;
				field324 = -1;
				field361 = 0;
				field363 = 0;
				field266 = 0;
				field233 = 0;
				field281 = false;
				field86 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field159 = "Login attempts exceeded.";
				field160 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field159 = "You are standing in a members-only area.";
				field160 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field159 = "Invalid loginserver requested";
				field160 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field131.method584(); var21 >= 0; var21--) {
					field159 = "You have only just left another world";
					field160 = "Your profile will be transferred in: " + var21 + " seconds";
					method84(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method47(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field159 = "Unexpected server response";
				field160 = "Please try using a different world.";
			} else if (var9 != 0) {
				field159 = "No response from server";
				field160 = "Please try using a different world.";
			} else if (field223 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field223++;
				method47(arg0, arg1, arg2);
			} else {
				field159 = "No response from loginserver";
				field160 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field159 = "";
			field160 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method48() {
		field63 = 0;
		for (int var1 = -1; var1 < field372 + field270; var1++) {
			FWNRUNYO var2;
			if (var1 == -1) {
				var2 = field435;
			} else if (var1 < field372) {
				var2 = field371[field373[var1]];
			} else {
				var2 = field269[field271[var1 - field372]];
			}

			if (var2 != null && var2.method161()) {
				if (var2 instanceof CRBPLXHF) {
					DOBKXCMM var3 = ((CRBPLXHF) var2).field473;
					if (var3.field664 != null) {
						var3 = var3.method240();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field372) {
					DOBKXCMM var7 = ((CRBPLXHF) var2).field473;
					if (var7.field660 >= 0 && var7.field660 < field329.length) {
						method100(var2.field806 + 15, var2);

						if (field151 > -1) {
							field329[var7.field660].method514(field152 - 30, field151 - 12);
						}
					}

					if (field263 == 1 && field271[var1 - field372] == field310 && field301 % 20 < 10) {
						method100(var2.field806 + 15, var2);

						if (field151 > -1) {
							field329[2].method514(field152 - 28, field151 - 12);
						}
					}
				} else {
					int var4 = 30;
					CXEZIPRQ var5 = (CXEZIPRQ) var2;
					if (var5.field483 != 0) {
						method100(var2.field806 + 15, var2);

						if (field151 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field483 & 1 << var6) != 0) {
									field329[var6].method514(field152 - var4, field151 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field263 == 10 && field373[var1] == field112) {
						method100(var2.field806 + 15, var2);

						if (field151 > -1) {
							field329[7].method514(field152 - var4, field151 - 12);
						}
					}
				}

				if (var2.field759 != null && (var1 >= field372 || field424 == 0 || field424 == 3 || field424 == 1 && method106(((CXEZIPRQ) var2).field474))) {
					method100(var2.field806, var2);

					if (field151 > -1 && field63 < field64) {
						field68[field63] = field104.method359(var2.field759) / 2;
						field67[field63] = field104.field1050;
						field65[field63] = field151;
						field66[field63] = field152;
						field69[field63] = var2.field780;
						field70[field63] = var2.field799;
						field71[field63] = var2.field778;
						field72[field63++] = var2.field759;

						if (field267 == 0 && var2.field799 >= 1 && var2.field799 <= 3) {
							field67[field63] += 10;
							field66[field63] += 5;
						}

						if (field267 == 0 && var2.field799 == 4) {
							field68[field63] = 60;
						}

						if (field267 == 0 && var2.field799 == 5) {
							field67[field63] += 5;
						}
					}
				}

				if (var2.field784 > field301) {
					method100(var2.field806 + 15, var2);

					if (field151 > -1) {
						int var8 = var2.field785 * 30 / var2.field786;
						if (var8 > 30) {
							var8 = 30;
						}

						RSDCQVXF.method458(var8, 0xFF00, field152 - 3, field151 - 15, 5);
						RSDCQVXF.method458(30 - var8, 0xFF0000, field152 - 3, field151 - 15 + var8, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field793[var9] > field301) {
						method100(var2.field806 / 2, var2);

						if (field151 > -1) {
							if (var9 == 1) {
								field152 -= 20;
							}

							if (var9 == 2) {
								field151 -= 15;
								field152 -= 10;
							}

							if (var9 == 3) {
								field151 += 15;
								field152 -= 10;
							}

							field288[var2.field792[var9]].method514(field152 - 12, field151 - 12);
							field102.method356(field152 + 4, 0, String.valueOf(var2.field791[var9]), field151);
							field102.method356(field152 + 3, 0xFFFFFF, String.valueOf(var2.field791[var9]), field151 - 1);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field63; var10++) {
			int var11 = field65[var10];
			int var12 = field66[var10];
			int var13 = field68[var10];
			int var14 = field67[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field66[var16] - field67[var16] && var12 - var14 < field66[var16] + 2 && var11 - var13 < field68[var16] + field65[var16] && var11 + var13 > field65[var16] - field68[var16] && field66[var16] - field67[var16] < var12) {
						var12 = field66[var16] - field67[var16];
						var15 = true;
					}
				}
			}

			field151 = field65[var10];
			field152 = field66[var10] = var12;
			String var17 = field72[var10];
			if (field267 == 0) {
				int var18 = 0xFFFF00;
				if (field69[var10] < 6) {
					var18 = field101[field69[var10]];
				}

				if (field69[var10] == 6) {
					var18 = field213 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field69[var10] == 7) {
					var18 = field213 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field69[var10] == 8) {
					var18 = field213 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field69[var10] == 9) {
					int var19 = 150 - field71[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field69[var10] == 10) {
					int var20 = 150 - field71[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field69[var10] == 11) {
					int var21 = 150 - field71[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field70[var10] == 0) {
					field104.method356(field152 + 1, 0, var17, field151);
					field104.method356(field152, var18, var17, field151);
				}

				if (field70[var10] == 1) {
					field104.method361(field213, var17, field151, field152 + 1, 0);
					field104.method361(field213, var17, field151, field152, var18);
				}

				if (field70[var10] == 2) {
					field104.method362(field213, var17, field152 + 1, 0, field151);
					field104.method362(field213, var17, field152, var18, field151);
				}

				if (field70[var10] == 3) {
					field104.method363(field213, field152 + 1, 150 - field71[var10], 0, var17, field151);
					field104.method363(field213, field152, 150 - field71[var10], var18, var17, field151);
				}

				if (field70[var10] == 4) {
					int var22 = field104.method359(var17);
					int var23 = (150 - field71[var10]) * (var22 + 100) / 150;
					RSDCQVXF.method455(field151 + 50, 334, 0, field151 - 50);
					field104.method360(field151 + 50 - var23, 0, var17, field152 + 1);
					field104.method360(field151 + 50 - var23, var18, var17, field152);
					RSDCQVXF.method454();
				}

				if (field70[var10] == 5) {
					int var24 = 150 - field71[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					RSDCQVXF.method455(512, field152 + 5, field152 - field104.field1050 - 1, 0);
					field104.method356(field152 + var25 + 1, 0, var17, field151);
					field104.method356(field152 + var25, var18, var17, field151);
					RSDCQVXF.method454();
				}
			} else {
				field104.method356(field152 + 1, 0, var17, field151);
				field104.method356(field152, 0xFFFF00, var17, field151);
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method49() {
		if (field384 == null) {
			field710 = null;
			field299 = null;
			field297 = null;
			field296 = null;
			field298 = null;
			field239 = null;
			field240 = null;
			field241 = null;
			field387 = new LWAVUJVV(128, 265, method136());
			RSDCQVXF.method456();
			field388 = new LWAVUJVV(128, 265, method136());
			RSDCQVXF.method456();
			field384 = new LWAVUJVV(509, 171, method136());
			RSDCQVXF.method456();
			field385 = new LWAVUJVV(360, 132, method136());
			RSDCQVXF.method456();
			field386 = new LWAVUJVV(360, 200, method136());
			RSDCQVXF.method456();
			field389 = new LWAVUJVV(202, 238, method136());
			RSDCQVXF.method456();
			field390 = new LWAVUJVV(203, 238, method136());
			RSDCQVXF.method456();
			field391 = new LWAVUJVV(74, 94, method136());
			RSDCQVXF.method456();
			field392 = new LWAVUJVV(75, 94, method136());
			RSDCQVXF.method456();

			if (field452 != null) {
				method94();
				method28();
			}

			field209 = true;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method50() {
		field297.method376();

		if (field265 == 2) {
			byte[] var1 = field225.field27;
			int[] var2 = RSDCQVXF.field1192;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field368.method518(field46, 33, 0, 33, 0, 25, field113, 256, 25, field278);
			field298.method376();
		} else {
			int var5 = field46 + field197 & 0x7FF;
			int var6 = field435.field781 / 32 + 48;
			int var7 = 464 - field435.field782 / 32;
			field205.method518(var5, 146, 5, 151, 25, var7, field272, field358 + 256, var6, field264);
			field368.method518(field46, 33, 0, 33, 0, 25, field113, 256, 25, field278);

			for (int var8 = 0; var8 < field326; var8++) {
				int var9 = field327[var8] * 4 + 2 - field435.field781 / 32;
				int var10 = field328[var8] * 4 + 2 - field435.field782 / 32;
				method20(var9, var10, field333[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					ROXEPOUC var13 = field346[field150][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field435.field781 / 32;
						int var15 = var12 * 4 + 2 - field435.field782 / 32;
						method20(var14, var15, field257);
					}
				}
			}

			for (int var16 = 0; var16 < field270; var16++) {
				CRBPLXHF var17 = field269[field271[var16]];
				if (var17 != null && var17.method161()) {
					DOBKXCMM var18 = var17.field473;
					if (var18.field664 != null) {
						var18 = var18.method240();
					}

					if (var18 != null && var18.field653) {
						int var19 = var17.field781 / 32 - field435.field781 / 32;
						int var20 = var17.field782 / 32 - field435.field782 / 32;
						method20(var19, var20, field258);
					}
				}
			}

			for (int var21 = 0; var21 < field372; var21++) {
				CXEZIPRQ var22 = field371[field373[var21]];
				if (var22 != null && var22.method161()) {
					int var23 = var22.field781 / 32 - field435.field781 / 32;
					int var24 = var22.field782 / 32 - field435.field782 / 32;
					boolean var25 = false;
					long var26 = RTZFXINE.method469(var22.field474);
					for (int var28 = 0; var28 < field80; var28++) {
						if (field248[var28] == var26 && field422[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field435.field489 != 0 && var22.field489 != 0 && field435.field489 == var22.field489) {
						var29 = true;
					}

					if (var25) {
						method20(var23, var24, field260);
					} else if (var29) {
						method20(var23, var24, field261);
					} else {
						method20(var23, var24, field259);
					}
				}
			}

			if (field263 != 0 && field301 % 20 < 10) {
				if (field263 == 1 && field310 >= 0 && field310 < field269.length) {
					CRBPLXHF var30 = field269[field310];
					if (var30 != null) {
						int var31 = var30.field781 / 32 - field435.field781 / 32;
						int var32 = var30.field782 / 32 - field435.field782 / 32;
						method98(var32, field51, var31);
					}
				}

				if (field263 == 2) {
					int var33 = (field316 - field126) * 4 + 2 - field435.field781 / 32;
					int var34 = (field317 - field127) * 4 + 2 - field435.field782 / 32;
					method98(var34, field51, var33);
				}

				if (field263 == 10 && field112 >= 0 && field112 < field371.length) {
					CXEZIPRQ var35 = field371[field112];
					if (var35 != null) {
						int var36 = var35.field781 / 32 - field435.field781 / 32;
						int var37 = var35.field782 / 32 - field435.field782 / 32;
						method98(var37, field51, var36);
					}
				}
			}

			if (field203 != 0) {
				int var38 = field203 * 4 + 2 - field435.field781 / 32;
				int var39 = field204 * 4 + 2 - field435.field782 / 32;
				method20(var38, var39, field50);
			}

			RSDCQVXF.method458(3, 0xFFFFFF, 78, 97, 3);
			field298.method376();
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method51() {
		field188 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field449) {
				field206++;
				method91();
				method91();
				method146();
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

		field188 = false;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method52() {
		signlink.reporterror = false;

		try {
			if (field131 != null) {
				field131.method583();
			}
		} catch (Exception var1) {
		}

		field131 = null;
		method88();

		if (field189 != null) {
			field189.field1264 = false;
		}

		field189 = null;
		field340.method166();
		field340 = null;
		field268 = null;
		field347 = null;
		field192 = null;
		field55 = null;
		field230 = null;
		field425 = null;
		field181 = null;
		field231 = null;
		field232 = null;
		field262 = null;
		field142 = null;
		field405 = null;
		field423 = null;
		field180 = null;
		field169 = null;
		field436 = null;
		field437 = null;
		field222 = null;
		field296 = null;
		field297 = null;
		field298 = null;
		field299 = null;
		field239 = null;
		field240 = null;
		field241 = null;
		field413 = null;
		field414 = null;
		field415 = null;
		field416 = null;
		field417 = null;
		field418 = null;
		field419 = null;
		field420 = null;
		field421 = null;
		field224 = null;
		field225 = null;
		field226 = null;
		field199 = null;
		field200 = null;
		field201 = null;
		field351 = null;
		field242 = null;
		field243 = null;
		field244 = null;
		field245 = null;
		field246 = null;
		field408 = null;
		field409 = null;
		field410 = null;
		field411 = null;
		field412 = null;
		field368 = null;
		field288 = null;
		field329 = null;
		field166 = null;
		field257 = null;
		field258 = null;
		field259 = null;
		field260 = null;
		field261 = null;
		field467 = null;
		field75 = null;
		field97 = null;
		field371 = null;
		field373 = null;
		field375 = null;
		field376 = null;
		field164 = null;
		field269 = null;
		field271 = null;
		field346 = null;
		field184 = null;
		field247 = null;
		field287 = null;
		field426 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field283 = null;
		field313 = null;
		field327 = null;
		field328 = null;
		field333 = null;
		field205 = null;
		field354 = null;
		field248 = null;
		field422 = null;
		field387 = null;
		field388 = null;
		field384 = null;
		field385 = null;
		field386 = null;
		field389 = null;
		field390 = null;
		field391 = null;
		field392 = null;
		method116();
		UVSOAWGE.method500();
		DOBKXCMM.method241();
		HFWXROSJ.method278();
		SCDBMUNA.field1215 = null;
		FIQZIGZB.field742 = null;
		HPPBIEYV.field925 = null;
		FGALEXKG.field731 = null;
		HARRRJHW.field840 = null;
		YTBPTACV.field1460 = null;
		YTBPTACV.field1472 = null;
		VJTDBWRW.field1346 = null;
		field710 = null;
		CXEZIPRQ.field480 = null;
		DKTEWQXO.method217();
		XRAHVOIV.method526();
		DHUPIIUL.method187();
		BWSGQYNU.method14();
		System.gc();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method53() {
		if (field175 == 0 && field145 == 0) {
			field283[field233] = "Walk here";
			field428[field233] = 89;
			field426[field233] = field717;
			field427[field233] = field718;
			field233++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < DHUPIIUL.field605; var2++) {
			int var3 = DHUPIIUL.field606[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field405.method557(field150, var4, var5, var3) >= 0) {
					UVSOAWGE var8 = UVSOAWGE.method501(var7);
					if (var8.field1343 != null) {
						var8 = var8.method499();
					}

					if (var8 == null) {
						continue;
					}

					if (field175 == 1) {
						field283[field233] = "Use " + field179 + " with @cya@" + var8.field1312;
						field428[field233] = 317;
						field429[field233] = var3;
						field426[field233] = var4;
						field427[field233] = var5;
						field233++;
					} else if (field145 != 1) {
						if (var8.field1314 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1314[var9] != null) {
									field283[field233] = var8.field1314[var9] + " @cya@" + var8.field1312;

									if (var9 == 0) {
										field428[field233] = 607;
									}

									if (var9 == 1) {
										field428[field233] = 872;
									}

									if (var9 == 2) {
										field428[field233] = 323;
									}

									if (var9 == 3) {
										field428[field233] = 113;
									}

									if (var9 == 4) {
										field428[field233] = 1416;
									}

									field429[field233] = var3;
									field426[field233] = var4;
									field427[field233] = var5;
									field233++;
								}
							}
						}

						field283[field233] = "Examine @cya@" + var8.field1312;
						field428[field233] = 1033;
						field429[field233] = var8.field1304 << 14;
						field426[field233] = var4;
						field427[field233] = var5;
						field233++;
					} else if ((field147 & 0x4) == 4) {
						field283[field233] = field148 + " @cya@" + var8.field1312;
						field428[field233] = 364;
						field429[field233] = var3;
						field426[field233] = var4;
						field427[field233] = var5;
						field233++;
					}
				}

				if (var6 == 1) {
					CRBPLXHF var10 = field269[var7];
					if (var10.field473.field680 == 1 && (var10.field781 & 0x7F) == 0x40 && (var10.field782 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field270; var11++) {
							CRBPLXHF var12 = field269[field271[var11]];
							if (var12 != null && var10 != var12 && var12.field473.field680 == 1 && var10.field781 == var12.field781 && var10.field782 == var12.field782) {
								method96(var12.field473, var5, var4, field271[var11]);
							}
						}

						for (int var13 = 0; var13 < field372; var13++) {
							CXEZIPRQ var14 = field371[field373[var13]];
							if (var14 != null && var10.field781 == var14.field781 && var10.field782 == var14.field782) {
								method36(var5, var4, var14, field373[var13]);
							}
						}
					}

					method96(var10.field473, var5, var4, var7);
				}

				if (var6 == 0) {
					CXEZIPRQ var15 = field371[var7];
					if ((var15.field781 & 0x7F) == 0x40 && (var15.field782 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field270; var16++) {
							CRBPLXHF var17 = field269[field271[var16]];
							if (var17 != null && var17.field473.field680 == 1 && var15.field781 == var17.field781 && var15.field782 == var17.field782) {
								method96(var17.field473, var5, var4, field271[var16]);
							}
						}

						for (int var18 = 0; var18 < field372; var18++) {
							CXEZIPRQ var19 = field371[field373[var18]];
							if (var19 != null && var15 != var19 && var15.field781 == var19.field781 && var15.field782 == var19.field782) {
								method36(var5, var4, var19, field373[var18]);
							}
						}
					}

					method36(var5, var4, var15, var7);
				}

				if (var6 == 3) {
					ROXEPOUC var20 = field346[field150][var4][var5];
					if (var20 != null) {
						for (YPNBIJGC var21 = (YPNBIJGC) var20.method428(); var21 != null; var21 = (YPNBIJGC) var20.method430()) {
							HFWXROSJ var22 = HFWXROSJ.method286(var21.field1458);
							if (field175 == 1) {
								field283[field233] = "Use " + field179 + " with @lre@" + var22.field890;
								field428[field233] = 633;
								field429[field233] = var21.field1458;
								field426[field233] = var4;
								field427[field233] = var5;
								field233++;
							} else if (field145 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field858 != null && var22.field858[var23] != null) {
										field283[field233] = var22.field858[var23] + " @lre@" + var22.field890;

										if (var23 == 0) {
											field428[field233] = 143;
										}

										if (var23 == 1) {
											field428[field233] = 62;
										}

										if (var23 == 2) {
											field428[field233] = 473;
										}

										if (var23 == 3) {
											field428[field233] = 959;
										}

										if (var23 == 4) {
											field428[field233] = 985;
										}

										field429[field233] = var21.field1458;
										field426[field233] = var4;
										field427[field233] = var5;
										field233++;
									} else if (var23 == 2) {
										field283[field233] = "Take @lre@" + var22.field890;
										field428[field233] = 473;
										field429[field233] = var21.field1458;
										field426[field233] = var4;
										field427[field233] = var5;
										field233++;
									}
								}

								field283[field233] = "Examine @lre@" + var22.field890;
								field428[field233] = 1385;
								field429[field233] = var21.field1458;
								field426[field233] = var4;
								field427[field233] = var5;
								field233++;
							} else if ((field147 & 0x1) == 1) {
								field283[field233] = field148 + " @lre@" + var22.field890;
								field428[field233] = 122;
								field429[field233] = var21.field1458;
								field426[field233] = var4;
								field427[field233] = var5;
								field233++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method54() {
		int var1 = field59;
		int var2 = field60;
		int var3 = field61;
		int var4 = field62;
		int var5 = 0x5D5447;
		RSDCQVXF.method458(var3, var5, var2, var1, var4);
		RSDCQVXF.method458(var3 - 2, 0, var2 + 1, var1 + 1, 16);
		RSDCQVXF.method459(0, var1 + 1, var3 - 2, var4 - 19, var2 + 18);
		field104.method360(var1 + 3, var5, "Choose Option", var2 + 14);
		int var6 = field717;
		int var7 = field718;
		if (field58 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field58 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field58 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field233; var8++) {
			int var9 = (field233 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field104.method364(var10, var9, var1 + 3, true, field283[var8]);
		}
	}

	@ObfuscatedName("client.a(LHPPBIEYV;Z)Z")
	public final boolean method55(HPPBIEYV arg0) {
		if (arg0.field943 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field943.length; var2++) {
			int var3 = method144(arg0, var2);
			int var4 = arg0.field920[var2];
			if (arg0.field943[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field943[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field943[var2] == 4) {
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
	public final void method56(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field325; var3++) {
				if (field407[var3] == arg0) {
					field325--;
					field294 = true;

					for (int var4 = var3; var4 < field325; var4++) {
						field407[var4] = field407[var4 + 1];
					}

					field347.method297(227);
					field347.method304(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LPAWLWNVI;I)V")
	public final void method57(PAWLWNVI arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1138 == 0) {
			var2 = field405.method553(arg0.field1137, arg0.field1139, arg0.field1140);
		}

		if (arg0.field1138 == 1) {
			var2 = field405.method554(arg0.field1137, arg0.field1140, arg0.field1139);
		}

		if (arg0.field1138 == 2) {
			var2 = field405.method555(arg0.field1137, arg0.field1139, arg0.field1140);
		}

		if (arg0.field1138 == 3) {
			var2 = field405.method556(arg0.field1137, arg0.field1139, arg0.field1140);
		}

		if (var2 != 0) {
			int var6 = field405.method557(arg0.field1137, arg0.field1139, arg0.field1140, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1134 = var3;
		arg0.field1136 = var4;
		arg0.field1135 = var5;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method58() {
		for (SDZHMORV var1 = (SDZHMORV) field247.method427(); var1 != null; var1 = (SDZHMORV) field247.method429()) {
			if (field150 != var1.field1232 || field301 > var1.field1239) {
				var1.method234();
			} else if (field301 >= var1.field1238) {
				if (var1.field1229 > 0) {
					CRBPLXHF var2 = field269[var1.field1229 - 1];
					if (var2 != null && var2.field781 >= 0 && var2.field781 < 13312 && var2.field782 >= 0 && var2.field782 < 13312) {
						var1.method479(var2.field781, var2.field782, field301, method99(var2.field782, var1.field1232, var2.field781) - var1.field1237);
					}
				}

				if (var1.field1229 < 0) {
					int var3 = -var1.field1229 - 1;
					CXEZIPRQ var4;
					if (field76 == var3) {
						var4 = field435;
					} else {
						var4 = field371[var3];
					}

					if (var4 != null && var4.field781 >= 0 && var4.field781 < 13312 && var4.field782 >= 0 && var4.field782 < 13312) {
						var1.method479(var4.field781, var4.field782, field301, method99(var4.field782, var1.field1232, var4.field781) - var1.field1237);
					}
				}

				var1.method480(field229);
				field405.method538((int) var1.field1245, field150, (int) var1.field1244, false, 60, var1, -1, var1.field1249, (int) var1.field1246);
			}
		}

		field107++;
		if (field107 > 58) {
			field107 = 0;
			field347.method297(83);
		}
	}

	@ObfuscatedName("client.a(ZLHPPBIEYV;)Z")
	public final boolean method59(HPPBIEYV arg0) {
		int var2 = arg0.field916;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field283[field233] = "Remove @whi@" + arg0.field917;
				field428[field233] = 200;
				field233++;
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

		field283[field233] = "Remove @whi@" + field354[var2];
		field428[field233] = 649;
		field233++;
		field283[field233] = "Message @whi@" + field354[var2];
		field428[field233] = 456;
		field233++;
		return true;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method60() {
		while (true) {
			CNNODYJR var1 = field340.method182();
			if (var1 == null) {
				return;
			}

			if (var1.field469 == 0) {
				DHUPIIUL.method189(var1.field470, var1.field472);

				if ((field340.method165(var1.field470) & 0x62) != 0) {
					field294 = true;

					if (field315 != -1) {
						field194 = true;
					}
				}
			}

			if (var1.field469 == 1 && var1.field472 != null) {
				BWSGQYNU.method13(var1.field472);
			}

			if (var1.field469 == 2 && field279 == var1.field470 && var1.field472 != null) {
				method139(field280, var1.field472);
			}

			if (var1.field469 == 3 && field109 == 1) {
				for (int var2 = 0; var2 < field425.length; var2++) {
					if (field231[var2] == var1.field470) {
						field425[var2] = var1.field472;

						if (var1.field472 == null) {
							field231[var2] = -1;
						}

						break;
					}

					if (field232[var2] == var1.field470) {
						field181[var2] = var1.field472;

						if (var1.field472 == null) {
							field232[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field469 == 93 && field340.method176(var1.field470)) {
				RRREBNUU.method437(field340, new INLHDAGO(var1.field472));
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method61(int arg0) {
		int var2 = VJTDBWRW.field1346[arg0].field1354;
		if (var2 != 0) {
			int var3 = field313[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					DKTEWQXO.method226(0.9D);
				}

				if (var3 == 2) {
					DKTEWQXO.method226(0.8D);
				}

				if (var3 == 3) {
					DKTEWQXO.method226(0.7D);
				}

				if (var3 == 4) {
					DKTEWQXO.method226(0.6D);
				}

				HFWXROSJ.field867.method423();
				field209 = true;
			}

			if (var2 == 3) {
				boolean var4 = field321;

				if (var3 == 0) {
					method22(0, field321);
					field321 = true;
				}

				if (var3 == 1) {
					method22(-400, field321);
					field321 = true;
				}

				if (var3 == 2) {
					method22(-800, field321);
					field321 = true;
				}

				if (var3 == 3) {
					method22(-1200, field321);
					field321 = true;
				}

				if (var3 == 4) {
					field321 = false;
				}

				if (field321 != var4 && !field158) {
					if (field321) {
						field279 = field167;
						field280 = true;
						field340.method171(2, field279);
					} else {
						method88();
					}

					field212 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field149 = true;
					method45(0);
				}

				if (var3 == 1) {
					field149 = true;
					method45(-400);
				}

				if (var3 == 2) {
					field149 = true;
					method45(-800);
				}

				if (var3 == 3) {
					field149 = true;
					method45(-1200);
				}

				if (var3 == 4) {
					field149 = false;
				}
			}

			if (var2 == 5) {
				field49 = var3;
			}

			if (var2 == 6) {
				field267 = var3;
			}

			if (var2 == 8) {
				field173 = var3;
				field194 = true;
			}

			if (var2 == 9) {
				field300 = var3;
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method62() {
		if (field266 > 1) {
			field266--;
		}

		if (field365 > 0) {
			field365--;
		}

		for (int var1 = 0; var1 < 5 && method29(); var1++) {
		}

		if (field168) {
			synchronized (field189.field1265) {
				if (!field54) {
					field189.field1269 = 0;
				} else if (field723 != 0 || field189.field1269 >= 40) {
					field347.method297(20);
					field347.method298(0);
					int var3 = field347.field969;
					int var4 = 0;
					for (int var5 = 0; var5 < field189.field1269 && var3 - field347.field969 < 240; var5++) {
						var4++;
						int var6 = field189.field1266[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field189.field1268[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field189.field1266[var5] == -1 && field189.field1268[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field396 != var7 || field397 != var6) {
							int var9 = var7 - field396;
							field396 = var7;
							int var10 = var6 - field397;
							field397 = var6;

							if (field106 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field347.method299((field106 << 12) + (var9 << 6) + var10);
								field106 = 0;
							} else if (field106 < 8) {
								field347.method301((field106 << 19) + var8 + 0x800000);
								field106 = 0;
							} else {
								field347.method302((field106 << 19) + var8 - 0x40000000);
								field106 = 0;
							}
						} else if (field106 < 2047) {
							field106++;
						}
					}

					field347.method307(field347.field969 - var3);

					if (var4 >= field189.field1269) {
						field189.field1269 = 0;
					} else {
						field189.field1269 -= var4;
						for (int var11 = 0; var11 < field189.field1269; var11++) {
							field189.field1268[var11] = field189.field1268[var4 + var11];
							field189.field1266[var11] = field189.field1266[var4 + var11];
						}
					}
				}
			}

			if (field723 != 0) {
				long var12 = (field726 - field77) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field77 = field726;
				int var14 = field725;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field724;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field723 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field347.method297(56);
				field347.method302((var17 << 19) + (var18 << 20) + var16);
			}

			if (field216 > 0) {
				field216--;
			}

			if (field727[1] == 1 || field727[2] == 1 || field727[3] == 1 || field727[4] == 1) {
				field217 = true;
			}

			if (field217 && field216 <= 0) {
				field216 = 20;
				field217 = false;
				field347.method297(133);
				field347.method331(field46);
				field347.method299(field45);
			}

			if (field714 && !field309) {
				field309 = true;
				field347.method297(29);
				field347.method298(1);
			}

			if (!field714 && field309) {
				field309 = false;
				field347.method297(29);
				field347.method298(0);
			}

			method69();
			method90();
			method105();
			field363++;
			if (field363 > 750) {
				method150();
			}

			method158();
			method75();
			method30();
			field229++;

			if (field92 != 0) {
				field91 += 20;
				if (field91 >= 400) {
					field92 = 0;
				}
			}

			if (field238 != 0) {
				field235++;
				if (field235 >= 15) {
					if (field238 == 2) {
						field294 = true;
					}

					if (field238 == 3) {
						field194 = true;
					}

					field238 = 0;
				}
			}

			if (field457 != 0) {
				field227++;

				if (field717 > field458 + 5 || field717 < field458 - 5 || field718 > field459 + 5 || field718 < field459 - 5) {
					field334 = true;
				}

				if (field716 == 0) {
					if (field457 == 2) {
						field294 = true;
					}

					if (field457 == 3) {
						field194 = true;
					}

					field457 = 0;

					if (field334 && field227 >= 5) {
						field254 = -1;
						method89();

						if (field455 == field254 && field456 != field253) {
							HPPBIEYV var19 = HPPBIEYV.field925[field455];
							byte var20 = 0;
							if (field300 == 1 && var19.field916 == 206) {
								var20 = 1;
							}

							if (var19.field931[field253] <= 0) {
								var20 = 0;
							}

							if (var19.field944) {
								int var21 = field456;
								int var22 = field253;
								var19.field931[var22] = var19.field931[var21];
								var19.field937[var22] = var19.field937[var21];
								var19.field931[var21] = -1;
								var19.field937[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field456;
								int var24 = field253;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method293(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method293(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method293(field253, field456);
							}

							field347.method297(128);
							field347.method324(var20);
							field347.method299(field253);
							field347.method299(field456);
							field347.method330(field455);
						}
					} else if ((field49 == 1 || method39(field233 - 1)) && field233 > 2) {
						method93();
					} else if (field233 > 0) {
						method127(field233 - 1);
					}

					field235 = 10;
					field723 = 0;
				}
			}

			field453++;
			if (field453 > 1254) {
				field453 = 0;
				field347.method297(81);
				field347.method298(0);
				int var25 = field347.field969;
				field347.method299((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field347.method298(76);
				}

				field347.method298(84);
				field347.method299(19496);

				if ((int) (Math.random() * 2.0D) == 0) {
					field347.method298(230);
				}

				field347.method298(174);

				if ((int) (Math.random() * 2.0D) == 0) {
					field347.method298(218);
				}

				field347.method298(119);

				if ((int) (Math.random() * 2.0D) == 0) {
					field347.method299(48565);
				}

				field347.method299(10883);
				field347.method307(field347.field969 - var25);
			}

			if (XRAHVOIV.field1426 != -1) {
				int var26 = XRAHVOIV.field1426;
				int var27 = XRAHVOIV.field1427;
				boolean var28 = method73(0, 0, 0, var26, 0, var27, true, field435.field772[0], 0, 0, field435.field773[0]);
				XRAHVOIV.field1426 = -1;

				if (var28) {
					field89 = field724;
					field90 = field725;
					field92 = 1;
					field91 = 0;
				}
			}

			if (field723 == 1 && field366 != null) {
				field366 = null;
				field194 = true;
				field723 = 0;
			}

			method95();
			method157();
			method65();
			method40();

			if (field716 == 1 || field723 == 1) {
				field377++;
			}

			if (field109 == 2) {
				method44();
			}

			if (field109 == 2 && field141) {
				method68();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field117[var29]++;
			}

			method153();
			field715++;
			if (field715 > 4500) {
				field365 = 250;
				field715 -= 500;
				field347.method297(219);
			}

			field96++;
			if (field96 > 500) {
				field96 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field348 += field349;
				}

				if ((var30 & 0x2) == 2) {
					field133 += field134;
				}

				if ((var30 & 0x4) == 4) {
					field182 += field183;
				}
			}

			if (field348 < -50) {
				field349 = 2;
			}

			if (field348 > 50) {
				field349 = -2;
			}

			if (field133 < -55) {
				field134 = 2;
			}

			if (field133 > 55) {
				field134 = -2;
			}

			if (field182 < -40) {
				field183 = 1;
			}

			if (field182 > 40) {
				field183 = -1;
			}

			field208++;
			if (field208 > 500) {
				field208 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field197 += field198;
				}

				if ((var31 & 0x2) == 2) {
					field358 += field359;
				}
			}

			if (field197 < -60) {
				field198 = 2;
			}

			if (field197 > 60) {
				field198 = -2;
			}

			if (field358 < -20) {
				field359 = 1;
			}

			if (field358 > 10) {
				field359 = -1;
			}

			field364++;
			if (field364 > 50) {
				field347.method297(250);
			}

			try {
				if (field131 != null && field347.field969 > 0) {
					field131.method587(0, field347.field968, field347.field969);
					field347.field969 = 0;
					field364 = 0;
				}
			} catch (IOException var33) {
				method150();
			} catch (Exception var34) {
				method23();
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method63() {
		UVSOAWGE.field1340.method423();
		UVSOAWGE.field1299.method423();
		DOBKXCMM.field666.method423();
		HFWXROSJ.field876.method423();
		HFWXROSJ.field867.method423();
		CXEZIPRQ.field480.method423();
		YTBPTACV.field1472.method423();
	}

	@ObfuscatedName("client.f(Z)Ljava/lang/String;")
	public final String method64() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field712 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.r(I)V")
	public final void method65() {
		if (field723 == 1) {
			if (field724 >= 539 && field724 <= 573 && field725 >= 169 && field725 < 205 && field171[0] != -1) {
				field294 = true;
				field114 = 0;
				field56 = true;
			}

			if (field724 >= 569 && field724 <= 599 && field725 >= 168 && field725 < 205 && field171[1] != -1) {
				field294 = true;
				field114 = 1;
				field56 = true;
			}

			if (field724 >= 597 && field724 <= 627 && field725 >= 168 && field725 < 205 && field171[2] != -1) {
				field294 = true;
				field114 = 2;
				field56 = true;
			}

			if (field724 >= 625 && field724 <= 669 && field725 >= 168 && field725 < 203 && field171[3] != -1) {
				field294 = true;
				field114 = 3;
				field56 = true;
			}

			if (field724 >= 666 && field724 <= 696 && field725 >= 168 && field725 < 205 && field171[4] != -1) {
				field294 = true;
				field114 = 4;
				field56 = true;
			}

			if (field724 >= 694 && field724 <= 724 && field725 >= 168 && field725 < 205 && field171[5] != -1) {
				field294 = true;
				field114 = 5;
				field56 = true;
			}

			if (field724 >= 722 && field724 <= 756 && field725 >= 169 && field725 < 205 && field171[6] != -1) {
				field294 = true;
				field114 = 6;
				field56 = true;
			}

			if (field724 >= 540 && field724 <= 574 && field725 >= 466 && field725 < 502 && field171[7] != -1) {
				field294 = true;
				field114 = 7;
				field56 = true;
			}

			if (field724 >= 572 && field724 <= 602 && field725 >= 466 && field725 < 503 && field171[8] != -1) {
				field294 = true;
				field114 = 8;
				field56 = true;
			}

			if (field724 >= 599 && field724 <= 629 && field725 >= 466 && field725 < 503 && field171[9] != -1) {
				field294 = true;
				field114 = 9;
				field56 = true;
			}

			if (field724 >= 627 && field724 <= 671 && field725 >= 467 && field725 < 502 && field171[10] != -1) {
				field294 = true;
				field114 = 10;
				field56 = true;
			}

			if (field724 >= 669 && field724 <= 699 && field725 >= 466 && field725 < 503 && field171[11] != -1) {
				field294 = true;
				field114 = 11;
				field56 = true;
			}

			if (field724 >= 696 && field724 <= 726 && field725 >= 466 && field725 < 503 && field171[12] != -1) {
				field294 = true;
				field114 = 12;
				field56 = true;
			}

			if (field724 >= 724 && field724 <= 758 && field725 >= 466 && field725 < 502 && field171[13] != -1) {
				field294 = true;
				field114 = 13;
				field56 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method66() {
		for (PIYQORZV var1 = (PIYQORZV) field287.method427(); var1 != null; var1 = (PIYQORZV) field287.method429()) {
			if (field150 != var1.field1146 || var1.field1152) {
				var1.method234();
			} else if (field301 >= var1.field1153) {
				var1.method420(field229);

				if (var1.field1152) {
					var1.method234();
				} else {
					field405.method538(var1.field1148, var1.field1146, var1.field1147, false, 60, var1, -1, 0, var1.field1149);
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

	@ObfuscatedName("client.a(ZJ)V")
	public final void method67(long arg0) {
		if (arg0 != 0L) {
			if (field325 >= 100) {
				method46("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = RTZFXINE.method473(RTZFXINE.method470(arg0));
				for (int var4 = 0; var4 < field325; var4++) {
					if (field407[var4] == arg0) {
						method46("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field80; var5++) {
					if (field248[var5] == arg0) {
						method46("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field407[field325++] = arg0;
				field294 = true;
				field347.method297(197);
				field347.method304(arg0);
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method68() {
		int var1 = field121 * 128 + 64;
		int var2 = field122 * 128 + 64;
		int var3 = method99(var2, field150, var1) - field123;

		if (field335 < var1) {
			field335 += (var1 - field335) * field125 / 1000 + field124;
			if (field335 > var1) {
				field335 = var1;
			}
		}

		if (field335 > var1) {
			field335 -= (field335 - var1) * field125 / 1000 + field124;
			if (field335 < var1) {
				field335 = var1;
			}
		}

		if (field336 < var3) {
			field336 += (var3 - field336) * field125 / 1000 + field124;
			if (field336 > var3) {
				field336 = var3;
			}
		}

		if (field336 > var3) {
			field336 -= (field336 - var3) * field125 / 1000 + field124;
			if (field336 < var3) {
				field336 = var3;
			}
		}

		if (field337 < var2) {
			field337 += (var2 - field337) * field125 / 1000 + field124;
			if (field337 > var2) {
				field337 = var2;
			}
		}

		if (field337 > var2) {
			field337 -= (field337 - var2) * field125 / 1000 + field124;
			if (field337 < var2) {
				field337 = var2;
			}
		}

		int var4 = field430 * 128 + 64;
		int var5 = field431 * 128 + 64;
		int var6 = method99(var5, field150, var4) - field432;
		int var7 = var4 - field335;
		int var8 = var6 - field336;
		int var9 = var5 - field337;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field338 < var11) {
			field338 += (var11 - field338) * field434 / 1000 + field433;
			if (field338 > var11) {
				field338 = var11;
			}
		}

		if (field338 > var11) {
			field338 -= (field338 - var11) * field434 / 1000 + field433;
			if (field338 < var11) {
				field338 = var11;
			}
		}

		int var13 = var12 - field339;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field339 += field434 * var13 / 1000 + field433;
			field339 &= 0x7FF;
		}

		if (var13 < 0) {
			field339 -= -var13 * field434 / 1000 + field433;
			field339 &= 0x7FF;
		}

		int var14 = var12 - field339;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field339 = var12;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method69() {
		if (field158 && field109 == 2 && RRREBNUU.field1173 != field150) {
			field298.method376();
			field103.method356(151, 0, "Loading - please wait.", 257);
			field103.method356(150, 0xFFFFFF, "Loading - please wait.", 256);
			field298.method377(field709, 4, 4);
			field109 = 1;
			field86 = System.currentTimeMillis();
		}

		if (field109 == 1) {
			int var1 = method70();
			if (var1 != 0 && System.currentTimeMillis() - field86 > 360000L) {
				signlink.reporterror(field344 + " glcfb " + field464 + "," + var1 + "," + field158 + "," + field52[0] + "," + field340.method179() + "," + field150 + "," + field462 + "," + field463);
				field86 = System.currentTimeMillis();
			}
		}

		if (field109 == 2 && field274 != field150) {
			field274 = field150;
			method41(field150);
		}
	}

	@ObfuscatedName("client.t(I)I")
	public final int method70() {
		for (int var1 = 0; var1 < field425.length; var1++) {
			if (field425[var1] == null && field231[var1] != -1) {
				return -1;
			}

			if (field181[var1] == null && field232[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field425.length; var3++) {
			byte[] var4 = field181[var3];
			if (var4 != null) {
				int var5 = (field230[var3] >> 8) * 64 - field126;
				int var6 = (field230[var3] & 0xFF) * 64 - field127;
				if (field395) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= RRREBNUU.method442(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field286) {
			return -4;
		} else {
			field109 = 2;
			RRREBNUU.field1173 = field150;
			method119();
			field347.method297(201);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IIIIZIII)V")
	public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg0 >= 1 && arg4 <= 102 && arg0 <= 102) {
			if (field158 && field150 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field405.method553(arg5, arg4, arg0);
			}

			if (arg1 == 1) {
				var8 = field405.method554(arg5, arg0, arg4);
			}

			if (arg1 == 2) {
				var8 = field405.method555(arg5, arg4, arg0);
			}

			if (arg1 == 3) {
				var8 = field405.method556(arg5, arg4, arg0);
			}

			if (var8 != 0) {
				int var12 = field405.method557(arg5, arg4, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field405.method544(arg0, arg4, arg5);
					UVSOAWGE var16 = UVSOAWGE.method501(var13);
					if (var16.field1311) {
						field423[arg5].method489(var15, var16.field1316, arg4, arg0, var14);
					}
				}

				if (arg1 == 1) {
					field405.method545(arg4, arg0, arg5);
				}

				if (arg1 == 2) {
					field405.method546(arg4, arg0, arg5);
					UVSOAWGE var17 = UVSOAWGE.method501(var13);
					if (var17.field1300 + arg4 > 103 || var17.field1300 + arg0 > 103 || var17.field1332 + arg4 > 103 || var17.field1332 + arg0 > 103) {
						return;
					}

					if (var17.field1311) {
						field423[arg5].method490(var15, arg4, var17.field1332, var17.field1300, var17.field1316, arg0);
					}
				}

				if (arg1 == 3) {
					field405.method547(arg4, arg0, arg5);
					UVSOAWGE var18 = UVSOAWGE.method501(var13);
					if (var18.field1311 && var18.field1318) {
						field423[arg5].method492(arg0, arg4);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field142[1][arg4][arg0] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				RRREBNUU.method447(field423[arg5], arg5, arg2, var19, arg6, field405, arg0, arg4, arg3, field262);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZLINLHDAGO;)V")
	public final void method72(int arg0, INLHDAGO arg1) {
		for (int var3 = 0; var3 < field374; var3++) {
			int var4 = field375[var3];
			CRBPLXHF var5 = field269[var4];
			int var6 = arg1.method308();
			if ((var6 & 0x40) != 0) {
				var5.field809 = arg1.method334();
				var5.field810 = arg1.method310();
			}

			if ((var6 & 0x20) != 0) {
				var5.field800 = arg1.method335();
				int var7 = arg1.method338();
				var5.field804 = var7 >> 16;
				var5.field803 = (var7 & 0xFFFF) + field301;
				var5.field801 = 0;
				var5.field802 = 0;

				if (var5.field803 > field301) {
					var5.field801 = -1;
				}

				if (var5.field800 == 0xFFFF) {
					var5.field800 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field473 = DOBKXCMM.method239(arg1.method335());
				var5.field808 = var5.field473.field680;
				var5.field761 = var5.field473.field649;
				var5.field787 = var5.field473.field678;
				var5.field788 = var5.field473.field679;
				var5.field789 = var5.field473.field656;
				var5.field790 = var5.field473.field671;
				var5.field756 = var5.field473.field645;
			}

			if ((var6 & 0x10) != 0) {
				int var8 = arg1.method327();
				int var9 = arg1.method308();
				var5.method270(var8, field301, var9);
				var5.field784 = field301 + 300;
				var5.field785 = arg1.method308();
				var5.field786 = arg1.method327();
			}

			if ((var6 & 0x8) != 0) {
				var5.field759 = arg1.method315();
				var5.field778 = 100;
			}

			if ((var6 & 0x4) != 0) {
				var5.field807 = arg1.method334();
				if (var5.field807 == 0xFFFF) {
					var5.field807 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var10 = arg1.method334();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg1.method308();
				if (var5.field794 == var10 && var10 != -1) {
					int var12 = HARRRJHW.field840[var10].field854;
					if (var12 == 1) {
						var5.field795 = 0;
						var5.field796 = 0;
						var5.field797 = var11;
						var5.field798 = 0;
					}

					if (var12 == 2) {
						var5.field798 = 0;
					}
				} else if (var10 == -1 || var5.field794 == -1 || HARRRJHW.field840[var10].field848 >= HARRRJHW.field840[var5.field794].field848) {
					var5.field794 = var10;
					var5.field795 = 0;
					var5.field796 = 0;
					var5.field797 = var11;
					var5.field798 = 0;
					var5.field764 = var5.field777;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var13 = arg1.method308();
				int var14 = arg1.method326();
				var5.method270(var13, field301, var14);
				var5.field784 = field301 + 300;
				var5.field785 = arg1.method327();
				var5.field786 = arg1.method327();
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field712 != null) {
				return new URL("http://127.0.0.1:" + (field156 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIIIIZIIII)Z")
	public final boolean method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field180[var14][var15] = 0;
				field169[var14][var15] = 99999999;
			}
		}

		int var16 = arg7;
		int var17 = arg10;
		field180[arg7][arg10] = 99;
		field169[arg7][arg10] = 0;
		byte var18 = 0;
		int var19 = 0;
		field436[var18] = arg7;
		int var35 = var18 + 1;
		field437[var18] = arg10;
		boolean var20 = false;
		int var21 = field436.length;
		int[][] var22 = field423[field150].field1297;
		while (var35 != var19) {
			var16 = field436[var19];
			var17 = field437[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg5 == var17) {
				var20 = true;
				break;
			}

			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && field423[field150].method493(arg5, var17, var16, arg4 - 1, arg3, arg9)) {
					var20 = true;
					break;
				}

				if (arg4 < 10 && field423[field150].method494(arg9, var17, arg5, var16, arg4 - 1, arg3)) {
					var20 = true;
					break;
				}
			}

			if (arg2 != 0 && arg8 != 0 && field423[field150].method495(var17, var16, arg3, arg5, arg2, arg8, arg1)) {
				var20 = true;
				break;
			}

			int var23 = field169[var16][var17] + 1;
			if (var16 > 0 && field180[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				field436[var35] = var16 - 1;
				field437[var35] = var17;
				var35 = (var35 + 1) % var21;
				field180[var16 - 1][var17] = 2;
				field169[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field180[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				field436[var35] = var16 + 1;
				field437[var35] = var17;
				var35 = (var35 + 1) % var21;
				field180[var16 + 1][var17] = 8;
				field169[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field180[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field436[var35] = var16;
				field437[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field180[var16][var17 - 1] = 1;
				field169[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field180[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field436[var35] = var16;
				field437[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field180[var16][var17 + 1] = 4;
				field169[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field180[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field436[var35] = var16 - 1;
				field437[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field180[var16 - 1][var17 - 1] = 3;
				field169[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field180[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				field436[var35] = var16 + 1;
				field437[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field180[var16 + 1][var17 - 1] = 9;
				field169[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field180[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field436[var35] = var16 - 1;
				field437[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field180[var16 - 1][var17 + 1] = 6;
				field169[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field180[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				field436[var35] = var16 + 1;
				field437[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field180[var16 + 1][var17 + 1] = 12;
				field169[var16 + 1][var17 + 1] = var23;
			}
		}

		field53 = 0;
		if (!var20) {
			if (arg6) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg3 - var25; var26 <= arg3 + var25; var26++) {
						for (int var27 = arg5 - var25; var27 <= arg5 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field169[var26][var27] < var24) {
								var24 = field169[var26][var27];
								var16 = var26;
								var17 = var27;
								field53 = 1;
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
		field436[var28] = var16;
		int var36 = var28 + 1;
		field437[var28] = var17;
		int var29;
		int var30 = var29 = field180[var16][var17];
		while (arg7 != var16 || arg10 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field436[var36] = var16;
				field437[var36++] = var17;
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

			var30 = field180[var16][var17];
		}

		if (var36 <= 0) {
			if (arg0 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field436[var36];
		int var33 = field437[var36];

		if (arg0 == 0) {
			field347.method297(186);
			field347.method298(var31 + var31 + 3);
		}

		if (arg0 == 1) {
			field347.method297(95);
			field347.method298(var31 + var31 + 3 + 14);
		}

		if (arg0 == 2) {
			field347.method297(64);
			field347.method298(var31 + var31 + 3);
		}

		field203 = field436[0];
		field204 = field437[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field347.method324(field436[var36] - var32);
			field347.method324(field437[var36] - var33);
		}

		field347.method332(field127 + var33);
		field347.method331(field126 + var32);
		field347.method298(field727[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(ZLINLHDAGO;I)V")
	public final void method74(INLHDAGO arg0, int arg1) {
		int var3 = arg0.method319(8);
		if (var3 < field372) {
			for (int var4 = var3; var4 < field372; var4++) {
				field164[field163++] = field373[var4];
			}
		}

		if (var3 > field372) {
			signlink.reporterror(field344 + " Too many players");
			throw new RuntimeException("eek");
		}

		field372 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field373[var5];
			CXEZIPRQ var7 = field371[var6];
			int var8 = arg0.method319(1);
			if (var8 == 0) {
				field373[field372++] = var6;
				var7.field760 = field301;
			} else {
				int var9 = arg0.method319(2);
				if (var9 == 0) {
					field373[field372++] = var6;
					var7.field760 = field301;
					field375[field374++] = var6;
				} else if (var9 == 1) {
					field373[field372++] = var6;
					var7.field760 = field301;
					int var10 = arg0.method319(3);
					var7.method272(false, var10);
					int var11 = arg0.method319(1);
					if (var11 == 1) {
						field375[field374++] = var6;
					}
				} else if (var9 == 2) {
					field373[field372++] = var6;
					var7.field760 = field301;
					int var12 = arg0.method319(3);
					var7.method272(true, var12);
					int var13 = arg0.method319(3);
					var7.method272(true, var13);
					int var14 = arg0.method319(1);
					if (var14 == 1) {
						field375[field374++] = var6;
					}
				} else if (var9 == 3) {
					field164[field163++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method75() {
		for (int var1 = 0; var1 < field270; var1++) {
			int var2 = field271[var1];
			CRBPLXHF var3 = field269[var2];
			if (var3 != null) {
				method76(var3.field473.field680, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILFWNRUNYO;)V")
	public final void method76(int arg0, FWNRUNYO arg1) {
		if (arg1.field781 < 128 || arg1.field782 < 128 || arg1.field781 >= 13184 || arg1.field782 >= 13184) {
			arg1.field794 = -1;
			arg1.field800 = -1;
			arg1.field769 = 0;
			arg1.field770 = 0;
			arg1.field781 = arg1.field772[0] * 128 + arg1.field808 * 64;
			arg1.field782 = arg1.field773[0] * 128 + arg1.field808 * 64;
			arg1.method269();
		}

		if (field435 == arg1 && (arg1.field781 < 1536 || arg1.field782 < 1536 || arg1.field781 >= 11776 || arg1.field782 >= 11776)) {
			arg1.field794 = -1;
			arg1.field800 = -1;
			arg1.field769 = 0;
			arg1.field770 = 0;
			arg1.field781 = arg1.field772[0] * 128 + arg1.field808 * 64;
			arg1.field782 = arg1.field773[0] * 128 + arg1.field808 * 64;
			arg1.method269();
		}

		if (arg1.field769 > field301) {
			method77(arg1);
		} else if (arg1.field770 >= field301) {
			method78(arg1);
		} else {
			method79(arg1);
		}

		method80(arg1);
		method81(arg1);
	}

	@ObfuscatedName("client.a(LFWNRUNYO;I)V")
	public final void method77(FWNRUNYO arg0) {
		int var2 = arg0.field769 - field301;
		int var3 = arg0.field808 * 64 + arg0.field765 * 128;
		int var4 = arg0.field808 * 64 + arg0.field767 * 128;
		arg0.field781 += (var3 - arg0.field781) / var2;
		arg0.field782 += (var4 - arg0.field782) / var2;
		arg0.field805 = 0;

		if (arg0.field771 == 0) {
			arg0.field779 = 1024;
		}

		if (arg0.field771 == 1) {
			arg0.field779 = 1536;
		}

		if (arg0.field771 == 2) {
			arg0.field779 = 0;
		}

		if (arg0.field771 == 3) {
			arg0.field779 = 512;
		}
	}

	@ObfuscatedName("client.a(ILFWNRUNYO;)V")
	public final void method78(FWNRUNYO arg0) {
		if (field301 == arg0.field770 || arg0.field794 == -1 || arg0.field797 != 0 || arg0.field796 + 1 > HARRRJHW.field840[arg0.field794].method275(arg0.field795)) {
			int var2 = arg0.field770 - arg0.field769;
			int var3 = field301 - arg0.field769;
			int var4 = arg0.field808 * 64 + arg0.field765 * 128;
			int var5 = arg0.field808 * 64 + arg0.field767 * 128;
			int var6 = arg0.field808 * 64 + arg0.field766 * 128;
			int var7 = arg0.field808 * 64 + arg0.field768 * 128;
			arg0.field781 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field782 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field805 = 0;

		if (arg0.field771 == 0) {
			arg0.field779 = 1024;
		}

		if (arg0.field771 == 1) {
			arg0.field779 = 1536;
		}

		if (arg0.field771 == 2) {
			arg0.field779 = 0;
		}

		if (arg0.field771 == 3) {
			arg0.field779 = 512;
		}

		arg0.field783 = arg0.field779;
	}

	@ObfuscatedName("client.b(LFWNRUNYO;I)V")
	public final void method79(FWNRUNYO arg0) {
		arg0.field774 = arg0.field756;
		if (arg0.field777 == 0) {
			arg0.field805 = 0;
		} else {
			if (arg0.field794 != -1 && arg0.field797 == 0) {
				HARRRJHW var2 = HARRRJHW.field840[arg0.field794];
				if (arg0.field764 > 0 && var2.field852 == 0) {
					arg0.field805++;
					return;
				}

				if (arg0.field764 <= 0 && var2.field853 == 0) {
					arg0.field805++;
					return;
				}
			}

			int var3 = arg0.field781;
			int var4 = arg0.field782;
			int var5 = arg0.field772[arg0.field777 - 1] * 128 + arg0.field808 * 64;
			int var6 = arg0.field773[arg0.field777 - 1] * 128 + arg0.field808 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field779 = 1280;
					} else if (var4 > var6) {
						arg0.field779 = 1792;
					} else {
						arg0.field779 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field779 = 768;
					} else if (var4 > var6) {
						arg0.field779 = 256;
					} else {
						arg0.field779 = 512;
					}
				} else if (var4 < var6) {
					arg0.field779 = 1024;
				} else {
					arg0.field779 = 0;
				}

				int var7 = arg0.field779 - arg0.field783 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field788;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field787;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field790;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field789;
				}

				if (var8 == -1) {
					var8 = arg0.field787;
				}

				arg0.field774 = var8;
				int var9 = 4;
				if (arg0.field783 != arg0.field779 && arg0.field807 == -1 && arg0.field761 != 0) {
					var9 = 2;
				}

				if (arg0.field777 > 2) {
					var9 = 6;
				}

				if (arg0.field777 > 3) {
					var9 = 8;
				}

				if (arg0.field805 > 0 && arg0.field777 > 1) {
					var9 = 8;
					arg0.field805--;
				}

				if (arg0.field762[arg0.field777 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field787 == arg0.field774 && arg0.field763 != -1) {
					arg0.field774 = arg0.field763;
				}

				if (var3 < var5) {
					arg0.field781 += var9;
					if (arg0.field781 > var5) {
						arg0.field781 = var5;
					}
				} else if (var3 > var5) {
					arg0.field781 -= var9;
					if (arg0.field781 < var5) {
						arg0.field781 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field782 += var9;
					if (arg0.field782 > var6) {
						arg0.field782 = var6;
					}
				} else if (var4 > var6) {
					arg0.field782 -= var9;
					if (arg0.field782 < var6) {
						arg0.field782 = var6;
					}
				}

				if (arg0.field781 == var5 && arg0.field782 == var6) {
					arg0.field777--;

					if (arg0.field764 > 0) {
						arg0.field764--;
						return;
					}
				}
			} else {
				arg0.field781 = var5;
				arg0.field782 = var6;
			}
		}
	}

	@ObfuscatedName("client.c(LFWNRUNYO;I)V")
	public final void method80(FWNRUNYO arg0) {
		if (arg0.field761 != 0) {
			if (arg0.field807 != -1 && arg0.field807 < 32768) {
				CRBPLXHF var2 = field269[arg0.field807];
				if (var2 != null) {
					int var3 = arg0.field781 - var2.field781;
					int var4 = arg0.field782 - var2.field782;
					if (var3 != 0 || var4 != 0) {
						arg0.field779 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field807 >= 32768) {
				int var5 = arg0.field807 - 32768;
				if (field76 == var5) {
					var5 = field370;
				}

				CXEZIPRQ var6 = field371[var5];
				if (var6 != null) {
					int var7 = arg0.field781 - var6.field781;
					int var8 = arg0.field782 - var6.field782;
					if (var7 != 0 || var8 != 0) {
						arg0.field779 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field809 != 0 || arg0.field810 != 0) && (arg0.field777 == 0 || arg0.field805 > 0)) {
				int var9 = arg0.field781 - (arg0.field809 - field126 - field126) * 64;
				int var10 = arg0.field782 - (arg0.field810 - field127 - field127) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field779 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field809 = 0;
				arg0.field810 = 0;
			}

			int var11 = arg0.field779 - arg0.field783 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field761 || var11 > 2048 - arg0.field761) {
					arg0.field783 = arg0.field779;
				} else if (var11 > 1024) {
					arg0.field783 -= arg0.field761;
				} else {
					arg0.field783 += arg0.field761;
				}

				arg0.field783 &= 0x7FF;
				if (arg0.field774 == arg0.field756 && arg0.field783 != arg0.field779) {
					if (arg0.field757 != -1) {
						arg0.field774 = arg0.field757;
						return;
					}

					arg0.field774 = arg0.field787;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(LFWNRUNYO;I)V")
	public final void method81(FWNRUNYO arg0) {
		arg0.field758 = false;

		if (arg0.field774 != -1) {
			HARRRJHW var2 = HARRRJHW.field840[arg0.field774];
			arg0.field776++;
			if (arg0.field775 < var2.field841 && arg0.field776 > var2.method275(arg0.field775)) {
				arg0.field776 = 0;
				arg0.field775++;
			}

			if (arg0.field775 >= var2.field841) {
				arg0.field776 = 0;
				arg0.field775 = 0;
			}
		}

		if (arg0.field800 != -1 && field301 >= arg0.field803) {
			if (arg0.field801 < 0) {
				arg0.field801 = 0;
			}

			HARRRJHW var3 = YTBPTACV.field1460[arg0.field800].field1464;
			arg0.field802++;
			while (arg0.field801 < var3.field841 && arg0.field802 > var3.method275(arg0.field801)) {
				arg0.field802 -= var3.method275(arg0.field801);
				arg0.field801++;
			}

			if (arg0.field801 >= var3.field841 && (arg0.field801 < 0 || arg0.field801 >= var3.field841)) {
				arg0.field800 = -1;
			}
		}

		if (arg0.field794 != -1 && arg0.field797 <= 1) {
			HARRRJHW var4 = HARRRJHW.field840[arg0.field794];
			if (var4.field852 == 1 && arg0.field764 > 0 && arg0.field769 <= field301 && arg0.field770 < field301) {
				arg0.field797 = 1;
				return;
			}
		}

		if (arg0.field794 != -1 && arg0.field797 == 0) {
			HARRRJHW var5 = HARRRJHW.field840[arg0.field794];
			arg0.field796++;
			while (arg0.field795 < var5.field841 && arg0.field796 > var5.method275(arg0.field795)) {
				arg0.field796 -= var5.method275(arg0.field795);
				arg0.field795++;
			}

			if (arg0.field795 >= var5.field841) {
				arg0.field795 -= var5.field845;
				arg0.field798++;
				if (arg0.field798 >= var5.field851) {
					arg0.field794 = -1;
				}

				if (arg0.field795 < 0 || arg0.field795 >= var5.field841) {
					arg0.field794 = -1;
				}
			}

			arg0.field758 = var5.field847;
		}

		if (arg0.field797 > 0) {
			arg0.field797--;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method82() {
		if (field209) {
			field209 = false;
			field413.method377(field709, 0, 4);
			field414.method377(field709, 0, 357);
			field415.method377(field709, 722, 4);
			field416.method377(field709, 743, 205);
			field417.method377(field709, 0, 0);
			field418.method377(field709, 516, 4);
			field419.method377(field709, 516, 205);
			field420.method377(field709, 496, 357);
			field421.method377(field709, 0, 338);
			field294 = true;
			field194 = true;
			field56 = true;
			field191 = true;

			if (field109 != 2) {
				field298.method377(field709, 4, 4);
				field297.method377(field709, 550, 4);
			}

			field440++;
			if (field440 > 1058) {
				field440 = 0;
				field347.method297(85);
				field347.method298(0);
				int var1 = field347.field969;
				field347.method299(59547);
				field347.method299((int) (Math.random() * 65536.0D));
				field347.method299((int) (Math.random() * 65536.0D));
				field347.method299(56213);
				field347.method299((int) (Math.random() * 65536.0D));
				field347.method299(58192);
				field347.method299((int) (Math.random() * 65536.0D));
				field347.method299(37698);
				field347.method299((int) (Math.random() * 65536.0D));
				field347.method298((int) (Math.random() * 256.0D));
				field347.method307(field347.field969 - var1);
			}
		}

		if (field109 == 2) {
			method131();
		}

		if (field281 && field58 == 1) {
			field294 = true;
		}

		if (field378 != -1) {
			boolean var2 = method121(field229, field378);
			if (var2) {
				field294 = true;
			}
		}

		if (field238 == 2) {
			field294 = true;
		}

		if (field457 == 2) {
			field294 = true;
		}

		if (field294) {
			method37();
			field294 = false;
		}

		field94++;
		if (field94 > 98) {
			field94 = 0;
			field347.method297(231);
		}

		if (field315 == -1) {
			field210.field949 = field360 - field143 - 77;

			if (field717 > 448 && field717 < 560 && field718 > 332) {
				method27(77, field718 - 357, 0, field717 - 17, 463, field360, false, field210);
			}

			int var3 = field360 - field210.field949 - 77;
			if (var3 < 0) {
				var3 = 0;
			}

			if (var3 > field360 - 77) {
				var3 = field360 - 77;
			}

			if (field143 != var3) {
				field143 = var3;
				field194 = true;
			}

			field144++;
			if (field144 > 118) {
				field144 = 0;
				field347.method297(194);
				field347.method301(0xA0947B);
			}
		}

		if (field315 != -1) {
			boolean var4 = method121(field229, field315);
			if (var4) {
				field194 = true;
			}
		}

		if (field238 == 3) {
			field194 = true;
		}

		if (field457 == 3) {
			field194 = true;
		}

		if (field366 != null) {
			field194 = true;
		}

		if (field281 && field58 == 2) {
			field194 = true;
		}

		if (field194) {
			method126();
			field194 = false;
		}

		if (field109 == 2) {
			method50();
			field297.method377(field709, 550, 4);
		}

		if (field119 != -1) {
			field56 = true;
		}

		if (field56) {
			if (field119 != -1 && field119 == field114) {
				field119 = -1;
				field347.method297(131);
				field347.method298(field114);
			}

			field56 = false;
			field241.method376();
			field201.method10(0, 0);

			if (field378 == -1) {
				if (field171[field114] != -1) {
					if (field114 == 0) {
						field242.method10(10, 22);
					}

					if (field114 == 1) {
						field243.method10(8, 54);
					}

					if (field114 == 2) {
						field243.method10(8, 82);
					}

					if (field114 == 3) {
						field244.method10(8, 110);
					}

					if (field114 == 4) {
						field246.method10(8, 153);
					}

					if (field114 == 5) {
						field246.method10(8, 181);
					}

					if (field114 == 6) {
						field245.method10(9, 209);
					}
				}

				if (field171[0] != -1 && (field119 != 0 || field301 % 20 < 10)) {
					field351[0].method10(13, 29);
				}

				if (field171[1] != -1 && (field119 != 1 || field301 % 20 < 10)) {
					field351[1].method10(11, 53);
				}

				if (field171[2] != -1 && (field119 != 2 || field301 % 20 < 10)) {
					field351[2].method10(11, 82);
				}

				if (field171[3] != -1 && (field119 != 3 || field301 % 20 < 10)) {
					field351[3].method10(12, 115);
				}

				if (field171[4] != -1 && (field119 != 4 || field301 % 20 < 10)) {
					field351[4].method10(13, 153);
				}

				if (field171[5] != -1 && (field119 != 5 || field301 % 20 < 10)) {
					field351[5].method10(11, 180);
				}

				if (field171[6] != -1 && (field119 != 6 || field301 % 20 < 10)) {
					field351[6].method10(13, 208);
				}
			}

			field241.method377(field709, 516, 160);
			field240.method376();
			field200.method10(0, 0);

			if (field378 == -1) {
				if (field171[field114] != -1) {
					if (field114 == 7) {
						field408.method10(0, 42);
					}

					if (field114 == 8) {
						field409.method10(0, 74);
					}

					if (field114 == 9) {
						field409.method10(0, 102);
					}

					if (field114 == 10) {
						field410.method10(1, 130);
					}

					if (field114 == 11) {
						field412.method10(0, 173);
					}

					if (field114 == 12) {
						field412.method10(0, 201);
					}

					if (field114 == 13) {
						field411.method10(0, 229);
					}
				}

				if (field171[8] != -1 && (field119 != 8 || field301 % 20 < 10)) {
					field351[7].method10(2, 74);
				}

				if (field171[9] != -1 && (field119 != 9 || field301 % 20 < 10)) {
					field351[8].method10(3, 102);
				}

				if (field171[10] != -1 && (field119 != 10 || field301 % 20 < 10)) {
					field351[9].method10(4, 137);
				}

				if (field171[11] != -1 && (field119 != 11 || field301 % 20 < 10)) {
					field351[10].method10(2, 174);
				}

				if (field171[12] != -1 && (field119 != 12 || field301 % 20 < 10)) {
					field351[11].method10(2, 201);
				}

				if (field171[13] != -1 && (field119 != 13 || field301 % 20 < 10)) {
					field351[12].method10(2, 226);
				}
			}

			field240.method377(field709, 496, 466);
			field298.method376();
		}

		if (field191) {
			field191 = false;
			field239.method376();
			field199.method10(0, 0);
			field103.method357(true, 55, 0xFFFFFF, "Public chat", 28);

			if (field424 == 0) {
				field103.method357(true, 55, 0xFF00, "On", 41);
			}

			if (field424 == 1) {
				field103.method357(true, 55, 0xFFFF00, "Friends", 41);
			}

			if (field424 == 2) {
				field103.method357(true, 55, 0xFF0000, "Off", 41);
			}

			if (field424 == 3) {
				field103.method357(true, 55, 0xFFFF, "Hide", 41);
			}

			field103.method357(true, 184, 0xFFFFFF, "Private chat", 28);

			if (field307 == 0) {
				field103.method357(true, 184, 0xFF00, "On", 41);
			}

			if (field307 == 1) {
				field103.method357(true, 184, 0xFFFF00, "Friends", 41);
			}

			if (field307 == 2) {
				field103.method357(true, 184, 0xFF0000, "Off", 41);
			}

			field103.method357(true, 324, 0xFFFFFF, "Trade/compete", 28);

			if (field186 == 0) {
				field103.method357(true, 324, 0xFF00, "On", 41);
			}

			if (field186 == 1) {
				field103.method357(true, 324, 0xFFFF00, "Friends", 41);
			}

			if (field186 == 2) {
				field103.method357(true, 324, 0xFF0000, "Off", 41);
			}

			field103.method357(true, 458, 0xFFFFFF, "Report abuse", 33);
			field239.method377(field709, 0, 453);
			field298.method376();
		}

		field229 = 0;
	}

	@ObfuscatedName("client.v(I)V")
	public static final void method83() {
		XRAHVOIV.field1392 = false;
		DKTEWQXO.field619 = false;
		field158 = false;
		RRREBNUU.field1168 = false;
		UVSOAWGE.field1305 = false;
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method84(boolean arg0) {
		method49();
		field386.method376();
		field352.method10(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field154 == 0) {
			int var4 = var3 / 2 + 80;
			field102.method357(true, var2 / 2, 0x75A9A9, field340.field517, var4);
			int var5 = var3 / 2 - 20;
			field104.method357(true, var2 / 2, 0xFFFF00, "Welcome to RuneScape", var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field353.method10(var7 - 20, var6 - 73);
			field104.method357(true, var6, 0xFFFFFF, "New User", var7 + 5);
			int var8 = var2 / 2 + 80;
			field353.method10(var7 - 20, var8 - 73);
			field104.method357(true, var8, 0xFFFFFF, "Existing User", var7 + 5);
		}

		if (field154 == 2) {
			int var9 = var3 / 2 - 40;
			if (field159.length() > 0) {
				field104.method357(true, var2 / 2, 0xFFFF00, field159, var9 - 15);
				field104.method357(true, var2 / 2, 0xFFFF00, field160, var9);
				var9 += 30;
			} else {
				field104.method357(true, var2 / 2, 0xFFFF00, field160, var9 - 7);
				var9 += 30;
			}

			field104.method364(0xFFFFFF, var9, var2 / 2 - 90, true, "Username: " + field344 + (field273 == 0 & field301 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field104.method364(0xFFFFFF, var9, var2 / 2 - 88, true, "Password: " + RTZFXINE.method474(field345) + (field273 == 1 & field301 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field353.method10(var11 - 20, var10 - 73);
				field104.method357(true, var10, 0xFFFFFF, "Login", var11 + 5);
				int var12 = var2 / 2 + 80;
				field353.method10(var11 - 20, var12 - 73);
				field104.method357(true, var12, 0xFFFFFF, "Cancel", var11 + 5);
			}
		}

		if (field154 == 3) {
			field104.method357(true, var2 / 2, 0xFFFF00, "Create a free account", var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field104.method357(true, var2 / 2, 0xFFFFFF, "To create a new account you need to", var13);
			var13 += 15;
			field104.method357(true, var2 / 2, 0xFFFFFF, "go back to the main RuneScape webpage", var13);
			var13 += 15;
			field104.method357(true, var2 / 2, 0xFFFFFF, "and choose the red 'create account'", var13);
			var13 += 15;
			field104.method357(true, var2 / 2, 0xFFFFFF, "button at the top right of that page.", var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field353.method10(var15 - 20, var14 - 73);
			field104.method357(true, var14, 0xFFFFFF, "Cancel", var15 + 5);
		}

		field386.method377(field709, 202, 171);

		if (field209) {
			field209 = false;
			field384.method377(field709, 128, 0);
			field385.method377(field709, 202, 371);
			field389.method377(field709, 0, 265);
			field390.method377(field709, 562, 265);
			field391.method377(field709, 128, 171);
			field392.method377(field709, 562, 171);
		}
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int method85(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.w(I)I")
	public final int method86() {
		int var1 = 3;
		if (field338 < 310) {
			int var2 = field335 >> 7;
			int var3 = field337 >> 7;
			int var4 = field435.field781 >> 7;
			int var5 = field435.field782 >> 7;

			if ((field142[field150][var2][var3] & 0x4) != 0) {
				var1 = field150;
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

					if ((field142[field150][var2][var3] & 0x4) != 0) {
						var1 = field150;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field142[field150][var2][var3] & 0x4) != 0) {
							var1 = field150;
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

					if ((field142[field150][var2][var3] & 0x4) != 0) {
						var1 = field150;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field142[field150][var2][var3] & 0x4) != 0) {
							var1 = field150;
						}
					}
				}
			}
		}

		if ((field142[field150][field435.field781 >> 7][field435.field782 >> 7] & 0x4) != 0) {
			var1 = field150;
		}

		return var1;
	}

	@ObfuscatedName("client.x(I)I")
	public final int method87() {
		int var1 = method99(field337, field150, field335);
		if (var1 - field336 < 800 && (field142[field150][field335 >> 7][field337 >> 7] & 0x4) != 0) {
			return field150;
		}

		return 3;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method88() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.g(B)V")
	public final void method89() {
		if (field457 == 0) {
			field283[0] = "Cancel";
			field428[0] = 1013;
			field233 = 1;
			method123();
			field193 = 0;

			if (field717 > 4 && field718 > 4 && field717 < 516 && field718 < 338) {
				if (field135 == -1) {
					method53();
				} else {
					method102(field717, field718, 4, HPPBIEYV.field925[field135], 4, 0);
				}
			}

			if (field193 != field187) {
				field187 = field193;
			}

			field193 = 0;

			if (field717 > 553 && field718 > 205 && field717 < 743 && field718 < 466) {
				if (field378 != -1) {
					method102(field717, field718, 553, HPPBIEYV.field925[field378], 205, 0);
				} else if (field171[field114] != -1) {
					method102(field717, field718, 553, HPPBIEYV.field925[field171[field114]], 205, 0);
				}
			}

			if (field290 != field193) {
				field294 = true;
				field290 = field193;
			}

			field193 = 0;

			if (field717 > 17 && field718 > 357 && field717 < 496 && field718 < 453) {
				if (field315 != -1) {
					method102(field717, field718, 17, HPPBIEYV.field925[field315], 357, 0);
				} else if (field718 < 434 && field717 < 426) {
					method132(field717 - 17, field718 - 357);
				}
			}

			if (field315 != -1 && field402 != field193) {
				field194 = true;
				field402 = field193;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field233 - 1; var2++) {
					if (field428[var2] < 1000 && field428[var2 + 1] > 1000) {
						String var3 = field283[var2];
						field283[var2] = field283[var2 + 1];
						field283[var2 + 1] = var3;
						int var4 = field428[var2];
						field428[var2] = field428[var2 + 1];
						field428[var2 + 1] = var4;
						int var5 = field426[var2];
						field426[var2] = field426[var2 + 1];
						field426[var2 + 1] = var5;
						int var6 = field427[var2];
						field427[var2] = field427[var2 + 1];
						field427[var2 + 1] = var6;
						int var7 = field429[var2];
						field429[var2] = field429[var2 + 1];
						field429[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method90() {
		if (field109 == 2) {
			for (PAWLWNVI var1 = (PAWLWNVI) field184.method427(); var1 != null; var1 = (PAWLWNVI) field184.method429()) {
				if (var1.field1142 > 0) {
					var1.field1142--;
				}

				if (var1.field1142 != 0) {
					if (var1.field1141 > 0) {
						var1.field1141--;
					}

					if (var1.field1141 == 0 && var1.field1139 >= 1 && var1.field1140 >= 1 && var1.field1139 <= 102 && var1.field1140 <= 102 && (var1.field1143 < 0 || RRREBNUU.method432(var1.field1145, var1.field1143))) {
						method71(var1.field1140, var1.field1138, var1.field1145, var1.field1143, var1.field1139, var1.field1137, var1.field1144);
						var1.field1141 = -1;

						if (var1.field1143 == var1.field1134 && var1.field1134 == -1) {
							var1.method234();
						} else if (var1.field1143 == var1.field1134 && var1.field1144 == var1.field1135 && var1.field1145 == var1.field1136) {
							var1.method234();
						}
					}
				} else if (var1.field1134 < 0 || RRREBNUU.method432(var1.field1136, var1.field1134)) {
					method71(var1.field1140, var1.field1138, var1.field1136, var1.field1134, var1.field1139, var1.field1137, var1.field1135);
					var1.method234();
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method91() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field302[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field302[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field303[var10] = (field302[var10 - 1] + field302[var10 + 1] + field302[var10 - 128] + field302[var10 + 128]) / 4;
			}
		}

		field140 += 128;
		if (field140 > field250.length) {
			field140 -= field250.length;
			int var11 = (int) (Math.random() * 12.0D);
			method125(field379[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field303[var14 + 128] - field250[field140 + var14 & field250.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field302[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field172[var16] = field172[var16 + 1];
		}

		field172[var1 - 1] = (int) (Math.sin(field301 / 14.0D) * 16.0D + Math.sin(field301 / 15.0D) * 14.0D + Math.sin(field301 / 16.0D) * 12.0D);

		if (field450 > 0) {
			field450 -= 4;
		}

		if (field451 > 0) {
			field451 -= 4;
		}

		if (field450 == 0 && field451 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field450 = 1024;
			}

			if (var17 == 1) {
				field451 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LHPPBIEYV;I)V")
	public final void method92(HPPBIEYV arg0) {
		int var2 = arg0.field916;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field81 == 0) {
				arg0.field917 = "Loading friend list";
				arg0.field915 = 0;
			} else if (var2 == 1 && field81 == 1) {
				arg0.field917 = "Connecting to friendserver";
				arg0.field915 = 0;
			} else if (var2 == 2 && field81 != 2) {
				arg0.field917 = "Please wait...";
				arg0.field915 = 0;
			} else {
				int var3 = field80;
				if (field81 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field917 = "";
					arg0.field915 = 0;
				} else {
					arg0.field917 = field354[var2];
					arg0.field915 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field80;
			if (field81 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field917 = "";
				arg0.field915 = 0;
			} else {
				if (field422[var2] == 0) {
					arg0.field917 = "@red@Offline";
				} else if (field422[var2] == field155) {
					arg0.field917 = "@gre@World-" + (field422[var2] - 9);
				} else {
					arg0.field917 = "@yel@World-" + (field422[var2] - 9);
				}

				arg0.field915 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field80;
			if (field81 != 2) {
				var5 = 0;
			}

			arg0.field946 = var5 * 15 + 20;
			if (arg0.field946 <= arg0.field924) {
				arg0.field946 = arg0.field924 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field81 == 0) {
				arg0.field917 = "Loading ignore list";
				arg0.field915 = 0;
			} else if (var2 == 1 && field81 == 0) {
				arg0.field917 = "Please wait...";
				arg0.field915 = 0;
			} else {
				int var6 = field325;
				if (field81 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field917 = "";
					arg0.field915 = 0;
				} else {
					arg0.field917 = RTZFXINE.method473(RTZFXINE.method470(field407[var2]));
					arg0.field915 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field946 = field325 * 15 + 20;
			if (arg0.field946 <= arg0.field924) {
				arg0.field946 = arg0.field924 + 1;
			}
		} else if (var2 == 327) {
			arg0.field909 = 150;
			arg0.field910 = (int) (Math.sin(field301 / 40.0D) * 256.0D) & 0x7FF;

			if (field285) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field308[var7];
					if (var8 >= 0 && !FIQZIGZB.field742[var8].method259()) {
						return;
					}
				}

				field285 = false;
				DHUPIIUL[] var9 = new DHUPIIUL[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field308[var11];
					if (var12 >= 0) {
						var9[var10++] = FIQZIGZB.field742[var12].method260();
					}
				}

				DHUPIIUL var13 = new DHUPIIUL(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field130[var14] != 0) {
						var13.method205(field382[var14][0], field382[var14][field130[var14]]);

						if (var14 == 1) {
							var13.method205(field305[0], field305[field130[var14]]);
						}
					}
				}

				var13.method198();
				var13.method199(HARRRJHW.field840[field435.field756].field842[0]);
				var13.method208(64, 850, -30, -50, -30, true);
				arg0.field961 = 5;
				arg0.field962 = 0;
				HPPBIEYV.method290(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field73 == null) {
				field73 = arg0.field947;
				field74 = arg0.field945;
			}

			if (field393) {
				arg0.field947 = field74;
			} else {
				arg0.field947 = field73;
			}
		} else if (var2 == 325) {
			if (field73 == null) {
				field73 = arg0.field947;
				field74 = arg0.field945;
			}

			if (field393) {
				arg0.field947 = field73;
			} else {
				arg0.field947 = field74;
			}
		} else if (var2 == 600) {
			arg0.field917 = field400;
			if (field301 % 20 < 10) {
				arg0.field917 = arg0.field917 + "|";
			} else {
				arg0.field917 = arg0.field917 + " ";
			}
		} else if (var2 == 613) {
			if (field195 < 1) {
				arg0.field917 = "";
			} else if (field441) {
				arg0.field941 = 0xFF0000;
				arg0.field917 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field941 = 0xFFFFFF;
				arg0.field917 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field196 == 0) {
				arg0.field917 = "";
			} else {
				String var15;
				if (field84 == 0) {
					var15 = "earlier today";
				} else if (field84 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field84 + " days ago";
				}

				arg0.field917 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field256 == 0) {
				arg0.field917 = "0 unread messages";
				arg0.field941 = 0xFFFF00;
			}

			if (field256 == 1) {
				arg0.field917 = "1 unread message";
				arg0.field941 = 0xFF00;
			}

			if (field256 > 1) {
				arg0.field917 = field256 + " unread messages";
				arg0.field941 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field291 == 201) {
				if (field403 == 1) {
					arg0.field917 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field917 = "";
				}
			} else if (field291 == 200) {
				arg0.field917 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field291 == 0) {
					var16 = "Earlier today";
				} else if (field291 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field291 + " days ago";
				}

				arg0.field917 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field291 == 201) {
				if (field403 == 1) {
					arg0.field917 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field917 = "";
				}
			} else if (field291 == 200) {
				arg0.field917 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field917 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field291 == 201) {
				if (field403 == 1) {
					arg0.field917 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field917 = "";
				}
			} else if (field291 == 200) {
				arg0.field917 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field917 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method93() {
		int var1 = field104.method358("Choose Option");
		for (int var2 = 0; var2 < field233; var2++) {
			int var3 = field104.method358(field283[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field233 * 15 + 21;
		if (field724 > 4 && field725 > 4 && field724 < 516 && field725 < 338) {
			int var5 = field724 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field725 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field281 = true;
			field58 = 0;
			field59 = var5;
			field60 = var6;
			field61 = var1;
			field62 = field233 * 15 + 22;
		}

		if (field724 > 553 && field725 > 205 && field724 < 743 && field725 < 466) {
			int var7 = field724 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field725 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field281 = true;
			field58 = 1;
			field59 = var7;
			field60 = var8;
			field61 = var1;
			field62 = field233 * 15 + 22;
		}

		if (field724 > 17 && field725 > 357 && field724 < 496 && field725 < 453) {
			int var9 = field724 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field725 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field281 = true;
			field58 = 2;
			field59 = var9;
			field60 = var10;
			field61 = var1;
			field62 = field233 * 15 + 22;
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method94() {
		byte[] var1 = field452.method248("title.dat", null);
		XKULRNBA var2 = new XKULRNBA(var1, this);
		field387.method376();
		var2.method512(0, 0);
		field388.method376();
		var2.method512(0, -637);
		field384.method376();
		var2.method512(0, -128);
		field385.method376();
		var2.method512(-371, -202);
		field386.method376();
		var2.method512(-171, -202);
		field389.method376();
		var2.method512(-265, 0);
		field390.method376();
		var2.method512(-265, -562);
		field391.method376();
		var2.method512(-171, -128);
		field392.method376();
		var2.method512(-171, -562);
		int[] var3 = new int[var2.field1361];
		for (int var4 = 0; var4 < var2.field1362; var4++) {
			for (int var5 = 0; var5 < var2.field1361; var5++) {
				var3[var5] = var2.field1360[var2.field1361 * var4 + var2.field1361 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1361; var6++) {
				var2.field1360[var2.field1361 * var4 + var6] = var3[var6];
			}
		}

		field387.method376();
		var2.method512(0, 382);
		field388.method376();
		var2.method512(0, -255);
		field384.method376();
		var2.method512(0, 254);
		field385.method376();
		var2.method512(-371, 180);
		field386.method376();
		var2.method512(-171, 180);
		field389.method376();
		var2.method512(-265, 382);
		field390.method376();
		var2.method512(-265, -180);
		field391.method376();
		var2.method512(-171, 254);
		field392.method376();
		var2.method512(-171, -180);
		XKULRNBA var7 = new XKULRNBA(field452, "logo", 0);
		field384.method376();
		var7.method514(18, 382 - var7.field1361 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method95() {
		if (field457 == 0) {
			int var1 = field723;
			if (field145 == 1 && field724 >= 516 && field725 >= 160 && field724 <= 765 && field725 <= 205) {
				var1 = 0;
			}

			if (field281) {
				if (var1 != 1) {
					int var2 = field717;
					int var3 = field718;
					if (field58 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field58 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field58 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field59 - 10 || var2 > field61 + field59 + 10 || var3 < field60 - 10 || var3 > field62 + field60 + 10) {
						field281 = false;

						if (field58 == 1) {
							field294 = true;
						}

						if (field58 == 2) {
							field194 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field59;
					int var5 = field60;
					int var6 = field61;
					int var7 = field724;
					int var8 = field725;
					if (field58 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field58 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field58 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field233; var10++) {
						int var11 = (field233 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method127(var9);
					}

					field281 = false;

					if (field58 == 1) {
						field294 = true;
					}

					if (field58 == 2) {
						field194 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field233 > 0) {
					int var12 = field428[field233 - 1];
					if (var12 == 969 || var12 == 138 || var12 == 572 || var12 == 314 || var12 == 391 || var12 == 835 || var12 == 56 || var12 == 470 || var12 == 759 || var12 == 290 || var12 == 654 || var12 == 1790) {
						int var13 = field426[field233 - 1];
						int var14 = field427[field233 - 1];
						HPPBIEYV var15 = HPPBIEYV.field925[var14];
						if (var15.field955 || var15.field944) {
							field334 = false;
							field227 = 0;
							field455 = var14;
							field456 = var13;
							field457 = 2;
							field458 = field724;
							field459 = field725;

							if (HPPBIEYV.field925[var14].field952 == field135) {
								field457 = 1;
							}

							if (HPPBIEYV.field925[var14].field952 == field315) {
								field457 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field49 == 1 || method39(field233 - 1)) && field233 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field233 > 0) {
					method127(field233 - 1);
				}

				if (var1 != 2 || field233 <= 0) {
					return;
				}

				method93();
			}
		}
	}

	@ObfuscatedName("client.a(LDOBKXCMM;IZII)V")
	public final void method96(DOBKXCMM arg0, int arg1, int arg2, int arg3) {
		if (field233 < 400) {
			if (arg0.field664 != null) {
				arg0 = arg0.method240();
			}

			if (arg0 != null) {
				String var5 = arg0.field669;
				if (arg0.field668 != 0) {
					var5 = var5 + method130(arg0.field668, field435.field478) + " (level-" + arg0.field668 + ")";
				}

				if (field175 == 1) {
					field283[field233] = "Use " + field179 + " with @yel@" + var5;
					field428[field233] = 370;
					field429[field233] = arg3;
					field426[field233] = arg2;
					field427[field233] = arg1;
					field233++;
				} else if (field145 != 1) {
					if (arg0.field665 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field665[var6] != null && !arg0.field665[var6].equalsIgnoreCase("attack")) {
								field283[field233] = arg0.field665[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field428[field233] = 601;
								}

								if (var6 == 1) {
									field428[field233] = 942;
								}

								if (var6 == 2) {
									field428[field233] = 496;
								}

								if (var6 == 3) {
									field428[field233] = 335;
								}

								if (var6 == 4) {
									field428[field233] = 617;
								}

								field429[field233] = arg3;
								field426[field233] = arg2;
								field427[field233] = arg1;
								field233++;
							}
						}
					}

					if (arg0.field665 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field665[var7] != null && arg0.field665[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field668 > field435.field478) {
									var8 = 2000;
								}

								field283[field233] = arg0.field665[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field428[field233] = var8 + 601;
								}

								if (var7 == 1) {
									field428[field233] = var8 + 942;
								}

								if (var7 == 2) {
									field428[field233] = var8 + 496;
								}

								if (var7 == 3) {
									field428[field233] = var8 + 335;
								}

								if (var7 == 4) {
									field428[field233] = var8 + 617;
								}

								field429[field233] = arg3;
								field426[field233] = arg2;
								field427[field233] = arg1;
								field233++;
							}
						}
					}

					field283[field233] = "Examine @yel@" + var5;
					field428[field233] = 1258;
					field429[field233] = arg3;
					field426[field233] = arg2;
					field427[field233] = arg1;
					field233++;
				} else if ((field147 & 0x2) == 2) {
					field283[field233] = field148 + " @yel@" + var5;
					field428[field233] = 595;
					field429[field233] = arg3;
					field426[field233] = arg2;
					field427[field233] = arg1;
					field233++;
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

	@ObfuscatedName("client.a(Ljava/lang/String;IILjava/lang/String;II)LDYBMLHQM;")
	public final DYBMLHQM method97(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field52[0] != null) {
				var6 = field52[0].method351(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field120.reset();
			field120.update(var6);
			int var8 = (int) field120.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new DYBMLHQM(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method120("Requesting " + arg0, arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method108(arg3 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				INLHDAGO var16 = new INLHDAGO(var15);
				var16.field969 = 3;
				int var17 = var16.method312() + 6;
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
						method120("Loading " + arg0 + " - " + var22 + "%", arg1);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field52[0] != null) {
						field52[0].method352(arg2, var6.length, var6);
					}
				} catch (Exception var28) {
					field52[0] = null;
				}

				if (var6 != null) {
					field120.reset();
					field120.update(var6);
					int var23 = (int) field120.getValue();
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
						method120("Game updated - please reload page", arg1);
						var25 = 10;
					} else {
						method120(var11 + " - Retrying in " + var25, arg1);
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

				field465 = !field465;
			}
		}

		return new DYBMLHQM(var6);
	}

	@ObfuscatedName("client.b(IILXKULRNBA;I)V")
	public final void method98(int arg0, XKULRNBA arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field46 + field197 & 0x7FF;
			int var6 = DHUPIIUL.field607[var5];
			int var7 = DHUPIIUL.field608[var5];
			var6 = var6 * 256 / (field358 + 256);
			var7 = var7 * 256 / (field358 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field161.method519(20, 20, 15, var10, 256, 15, var12 + 94 + 4 - 10, 83 - var13 - 20);
		} else {
			method20(arg2, arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method99(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field142[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field262[var6][var4][var5] + field262[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field262[var6][var4][var5 + 1] + field262[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(ILFWNRUNYO;I)V")
	public final void method100(int arg0, FWNRUNYO arg1) {
		method101(arg1.field782, arg1.field781, arg0);
	}

	@ObfuscatedName("client.a(IZII)V")
	public final void method101(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method99(arg0, field150, arg1) - arg2;
			arg1 -= field335;
			var4 -= field336;
			arg0 -= field337;
			int var5 = DHUPIIUL.field607[field338];
			int var6 = DHUPIIUL.field608[field338];
			int var7 = DHUPIIUL.field607[field339];
			int var8 = DHUPIIUL.field608[field339];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field151 = (var9 << 9) / arg0 + DKTEWQXO.field624;
				field152 = (var11 << 9) / arg0 + DKTEWQXO.field625;
			} else {
				field151 = -1;
				field152 = -1;
			}
		} else {
			field151 = -1;
			field152 = -1;
		}
	}

	@ObfuscatedName("client.a(IIILHPPBIEYV;IZI)V")
	public final void method102(int arg0, int arg1, int arg2, HPPBIEYV arg3, int arg4, int arg5) {
		if (arg3.field904 == 0 && arg3.field948 != null && !arg3.field951 && (arg0 >= arg2 && arg1 >= arg4 && arg0 <= arg3.field926 + arg2 && arg1 <= arg3.field924 + arg4)) {
			int var7 = arg3.field948.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.field963[var8] + arg2;
				int var10 = arg3.field960[var8] + arg4 - arg5;
				HPPBIEYV var11 = HPPBIEYV.field925[arg3.field948[var8]];
				var9 += var11.field950;
				var10 += var11.field914;
				if ((var11.field923 >= 0 || var11.field956 != 0) && arg0 >= var9 && arg1 >= var10 && arg0 < var11.field926 + var9 && arg1 < var11.field924 + var10) {
					if (var11.field923 >= 0) {
						field193 = var11.field923;
					} else {
						field193 = var11.field959;
					}
				}

				if (var11.field904 == 0) {
					method102(arg0, arg1, var9, var11, var10, var11.field949);

					if (var11.field946 > var11.field924) {
						method27(var11.field924, arg1, var10, arg0, var11.field926 + var9, var11.field946, true, var11);
					}
				} else {
					if (var11.field915 == 1 && arg0 >= var9 && arg1 >= var10 && arg0 < var11.field926 + var9 && arg1 < var11.field924 + var10) {
						boolean var12 = false;
						if (var11.field916 != 0) {
							var12 = method59(var11);
						}

						if (!var12) {
							field283[field233] = var11.field933;
							field428[field233] = 863;
							field427[field233] = var11.field959;
							field233++;
						}
					}

					if (var11.field915 == 2 && field145 == 0 && arg0 >= var9 && arg1 >= var10 && arg0 < var11.field926 + var9 && arg1 < var11.field924 + var10) {
						String var13 = var11.field939;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field283[field233] = var13 + " @gre@" + var11.field965;
						field428[field233] = 367;
						field427[field233] = var11.field959;
						field233++;
					}

					if (var11.field915 == 3 && arg0 >= var9 && arg1 >= var10 && arg0 < var11.field926 + var9 && arg1 < var11.field924 + var10) {
						field283[field233] = "Close";
						field428[field233] = 925;
						field427[field233] = var11.field959;
						field233++;
					}

					if (var11.field915 == 4 && arg0 >= var9 && arg1 >= var10 && arg0 < var11.field926 + var9 && arg1 < var11.field924 + var10) {
						field283[field233] = var11.field933;
						field428[field233] = 646;
						field427[field233] = var11.field959;
						field233++;
					}

					if (var11.field915 == 5 && arg0 >= var9 && arg1 >= var10 && arg0 < var11.field926 + var9 && arg1 < var11.field924 + var10) {
						field283[field233] = var11.field933;
						field428[field233] = 243;
						field427[field233] = var11.field959;
						field233++;
					}

					if (var11.field915 == 6 && !field444 && arg0 >= var9 && arg1 >= var10 && arg0 < var11.field926 + var9 && arg1 < var11.field924 + var10) {
						field283[field233] = var11.field933;
						field428[field233] = 832;
						field427[field233] = var11.field959;
						field233++;
					}

					if (var11.field904 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field924; var15++) {
							for (int var16 = 0; var16 < var11.field926; var16++) {
								int var17 = (var11.field905 + 32) * var16 + var9;
								int var18 = (var11.field907 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field934[var14];
									var18 += var11.field942[var14];
								}

								if (arg0 >= var17 && arg1 >= var18 && arg0 < var17 + 32 && arg1 < var18 + 32) {
									field253 = var14;
									field254 = var11.field959;

									if (var11.field931[var14] > 0) {
										HFWXROSJ var19 = HFWXROSJ.method286(var11.field931[var14] - 1);
										if (field175 == 1 && var11.field938) {
											if (field177 != var11.field959 || field176 != var14) {
												field283[field233] = "Use " + field179 + " with @lre@" + var19.field890;
												field428[field233] = 436;
												field429[field233] = var19.field892;
												field426[field233] = var14;
												field427[field233] = var11.field959;
												field233++;
											}
										} else if (field145 != 1 || !var11.field938) {
											if (var11.field938) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field870 != null && var19.field870[var20] != null) {
														field283[field233] = var19.field870[var20] + " @lre@" + var19.field890;

														if (var20 == 3) {
															field428[field233] = 759;
														}

														if (var20 == 4) {
															field428[field233] = 290;
														}

														field429[field233] = var19.field892;
														field426[field233] = var14;
														field427[field233] = var11.field959;
														field233++;
													} else if (var20 == 4) {
														field283[field233] = "Drop @lre@" + var19.field890;
														field428[field233] = 290;
														field429[field233] = var19.field892;
														field426[field233] = var14;
														field427[field233] = var11.field959;
														field233++;
													}
												}
											}

											if (var11.field935) {
												field283[field233] = "Use @lre@" + var19.field890;
												field428[field233] = 654;
												field429[field233] = var19.field892;
												field426[field233] = var14;
												field427[field233] = var11.field959;
												field233++;
											}

											if (var11.field938 && var19.field870 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field870[var21] != null) {
														field283[field233] = var19.field870[var21] + " @lre@" + var19.field890;

														if (var21 == 0) {
															field428[field233] = 835;
														}

														if (var21 == 1) {
															field428[field233] = 56;
														}

														if (var21 == 2) {
															field428[field233] = 470;
														}

														field429[field233] = var19.field892;
														field426[field233] = var14;
														field427[field233] = var11.field959;
														field233++;
													}
												}
											}

											if (var11.field911 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field911[var22] != null) {
														field283[field233] = var11.field911[var22] + " @lre@" + var19.field890;

														if (var22 == 0) {
															field428[field233] = 969;
														}

														if (var22 == 1) {
															field428[field233] = 138;
														}

														if (var22 == 2) {
															field428[field233] = 572;
														}

														if (var22 == 3) {
															field428[field233] = 314;
														}

														if (var22 == 4) {
															field428[field233] = 391;
														}

														field429[field233] = var19.field892;
														field426[field233] = var14;
														field427[field233] = var11.field959;
														field233++;
													}
												}
											}

											field283[field233] = "Examine @lre@" + var19.field890;
											field428[field233] = 1790;
											field429[field233] = var19.field892;
											field426[field233] = var14;
											field427[field233] = var11.field959;
											field233++;
										} else if ((field147 & 0x10) == 0x10) {
											field283[field233] = field148 + " @lre@" + var19.field890;
											field428[field233] = 350;
											field429[field233] = var19.field892;
											field426[field233] = var14;
											field427[field233] = var11.field959;
											field233++;
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

	@ObfuscatedName("client.b(ZJ)V")
	public final void method103(long arg0) {
		if (arg0 != 0L) {
			if (field80 >= 100 && field162 != 1) {
				method46("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field80 >= 200) {
				method46("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = RTZFXINE.method473(RTZFXINE.method470(arg0));
				for (int var4 = 0; var4 < field80; var4++) {
					if (field248[var4] == arg0) {
						method46("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field325; var5++) {
					if (field407[var5] == arg0) {
						method46("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field435.field474)) {
					field354[field80] = var3;
					field248[field80] = arg0;
					field422[field80] = 0;
					field80++;
					field294 = true;
					field347.method297(70);
					field347.method304(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method104() {
		if (field263 == 2) {
			method101((field317 - field127 << 7) + field320, (field316 - field126 << 7) + field319, field318 * 2);

			if (field151 > -1 && field301 % 20 < 10) {
				field329[2].method514(field152 - 28, field151 - 12);
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method105() {
		for (int var1 = 0; var1 < field57; var1++) {
			if (field439[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field343[var1] != field88 || field394[var1] != field445) {
						INLHDAGO var3 = FMUEZRNA.method264(field394[var1], field343[var1]);
						if (System.currentTimeMillis() + var3.field969 / 22 > field185 / 22 + field350) {
							field185 = var3.field969;
							field350 = System.currentTimeMillis();

							if (method24(var3.field969, var3.field968)) {
								field88 = field343[var1];
								field445 = field394[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method151()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field439[var1] != -5) {
					field439[var1] = -5;
				} else {
					field57--;
					for (int var5 = var1; var5 < field57; var5++) {
						field343[var5] = field343[var5 + 1];
						field394[var5] = field394[var5 + 1];
						field439[var5] = field439[var5 + 1];
					}

					var1--;
				}
			} else {
				field439[var1]--;
			}
		}

		if (field212 > 0) {
			field212 -= 20;
			if (field212 < 0) {
				field212 = 0;
			}

			if (field212 == 0 && field321 && !field158) {
				field279 = field167;
				field280 = true;
				field340.method171(2, field279);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method106(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field80; var2++) {
			if (arg0.equalsIgnoreCase(field354[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field435.field474)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method107(int arg0, int arg1) {
		ROXEPOUC var3 = field346[field150][arg0][arg1];
		if (var3 == null) {
			field405.method548(field150, arg0, arg1);
		} else {
			int var4 = -99999999;
			YPNBIJGC var5 = null;
			for (YPNBIJGC var6 = (YPNBIJGC) var3.method427(); var6 != null; var6 = (YPNBIJGC) var3.method429()) {
				HFWXROSJ var7 = HFWXROSJ.method286(var6.field1458);
				int var8 = var7.field885;
				if (var7.field856) {
					var8 = (var6.field1457 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method425(var5);
			YPNBIJGC var9 = null;
			YPNBIJGC var10 = null;
			for (YPNBIJGC var11 = (YPNBIJGC) var3.method427(); var11 != null; var11 = (YPNBIJGC) var3.method429()) {
				if (var5.field1458 != var11.field1458 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1458 != var11.field1458 && var9.field1458 != var11.field1458 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field405.method534(var5, var9, var10, arg1, arg0, field150, var12, method99(arg1 * 128 + 64, field150, arg0 * 128 + 64));
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method108(String arg0) throws IOException {
		if (field465) {
			if (field153 != null) {
				try {
					field153.close();
				} catch (Exception var4) {
				}

				field153 = null;
			}

			field153 = method112(43595);
			field153.setSoTimeout(10000);
			InputStream var2 = field153.getInputStream();
			OutputStream var3 = field153.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.D(I)V")
	public final void method109() {
		field285 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field308[var1] = -1;
			for (int var2 = 0; var2 < FIQZIGZB.field741; var2++) {
				if (!FIQZIGZB.field742[var2].field748 && FIQZIGZB.field742[var2].field743 == var1 + (field393 ? 0 : 7)) {
					field308[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method110() {
		method152();

		if (field92 == 1) {
			field166[field91 / 100].method514(field90 - 8 - 4, field89 - 8 - 4);
		}

		if (field92 == 2) {
			field166[field91 / 100 + 4].method514(field90 - 8 - 4, field89 - 8 - 4);
		}

		if (field461 != -1) {
			method121(field229, field461);
			method31(0, 0, HPPBIEYV.field925[field461], 0);
		}

		if (field135 != -1) {
			method121(field229, field135);
			method31(0, 0, HPPBIEYV.field925[field135], 0);
		}

		method19();

		if (!field281) {
			method89();
			method115();
		} else if (field58 == 0) {
			method54();
		}

		if (field341 == 1) {
			field329[1].method514(296, 472);
		}

		if (field255) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field705 < 15) {
				var3 = 0xFF0000;
			}

			field103.method355("Fps:" + field705, var3, var2, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field158) {
				int var7 = 0xFF0000;
			}

			field103.method355("Mem:" + var5 + "k", 0xFFFF00, var2, var1);
			var2 += 15;
		}

		if (field266 != 0) {
			int var8 = field266 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field103.method360(4, 0xFFFF00, "System update in: " + var9 + ":0" + var8, 329);
			} else {
				field103.method360(4, 0xFFFF00, "System update in: " + var9 + ":" + var8, 329);
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method111() {
		if (!field306 && !field228 && !field132) {
			field301++;

			if (field168) {
				method62();
			} else {
				method18();
			}

			method60();
		}
	}

	public final void init() {
		field155 = Integer.parseInt(getParameter("nodeid"));
		field156 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method155();
		} else {
			method83();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field157 = false;
		} else {
			field157 = true;
		}

		method253(503, 765);
	}

	@ObfuscatedName("client.E(I)Ljava/net/Socket;")
	public final Socket method112(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method113(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method113(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method114() {
		if (field306 || field228 || field132) {
			method142();
		} else {
			field78++;

			if (field168) {
				method82();
			} else {
				method84(false);
			}

			field377 = 0;
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 307);

			if (arg0.length == 5) {
				field155 = Integer.parseInt(arg0[0]);
				field156 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method155();
				} else if (arg0[2].equals("highmem")) {
					method83();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field157 = false;
				} else if (arg0[3].equals("members")) {
					field157 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method252(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method115() {
		if (field233 >= 2 || field175 != 0 || field145 != 0) {
			String var1;
			if (field175 == 1 && field233 < 2) {
				var1 = "Use " + field179 + " with...";
			} else if (field145 == 1 && field233 < 2) {
				var1 = field148 + "...";
			} else {
				var1 = field283[field233 - 1];
			}

			if (field233 > 2) {
				var1 = var1 + "@whi@ / " + (field233 - 2) + " more options";
			}

			field104.method365(15, true, var1, 0xFFFFFF, field301 / 1000, 4);
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method116() {
		field449 = false;
		while (field188) {
			field449 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field352 = null;
		field353 = null;
		field379 = null;
		field136 = null;
		field137 = null;
		field138 = null;
		field139 = null;
		field250 = null;
		field251 = null;
		field302 = null;
		field303 = null;
		field442 = null;
		field443 = null;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method117() {
		if (field299 == null) {
			method116();
			field710 = null;
			field384 = null;
			field385 = null;
			field386 = null;
			field387 = null;
			field388 = null;
			field389 = null;
			field390 = null;
			field391 = null;
			field392 = null;
			field299 = new LWAVUJVV(479, 96, method136());
			field297 = new LWAVUJVV(172, 156, method136());
			RSDCQVXF.method456();
			field225.method10(0, 0);
			field296 = new LWAVUJVV(190, 261, method136());
			field298 = new LWAVUJVV(512, 334, method136());
			RSDCQVXF.method456();
			field239 = new LWAVUJVV(496, 50, method136());
			field240 = new LWAVUJVV(269, 37, method136());
			field241 = new LWAVUJVV(249, 45, method136());
			field209 = true;
		}
	}

	@ObfuscatedName("client.b(ILINLHDAGO;I)V")
	public final void method118(INLHDAGO arg0, int arg1) {
		while (arg0.field970 + 21 < arg1 * 8) {
			int var3 = arg0.method319(14);
			if (var3 == 16383) {
				break;
			}

			if (field269[var3] == null) {
				field269[var3] = new CRBPLXHF();
			}

			CRBPLXHF var4 = field269[var3];
			field271[field270++] = var3;
			var4.field760 = field301;
			int var5 = arg0.method319(1);
			if (var5 == 1) {
				field375[field374++] = var3;
			}

			int var6 = arg0.method319(1);
			int var7 = arg0.method319(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method319(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field473 = DOBKXCMM.method239(arg0.method319(12));
			var4.field808 = var4.field473.field680;
			var4.field761 = var4.field473.field649;
			var4.field787 = var4.field473.field678;
			var4.field788 = var4.field473.field679;
			var4.field789 = var4.field473.field656;
			var4.field790 = var4.field473.field671;
			var4.field756 = var4.field473.field645;
			var4.method271(field435.field772[0] + var8, field435.field773[0] + var7, var6 == 1);
		}

		arg0.method320();
	}

	@ObfuscatedName("client.k(B)V")
	public final void method119() {
		try {
			field274 = -1;
			field287.method431();
			field247.method431();
			DKTEWQXO.method220();
			method63();
			field405.method527();

			for (int var1 = 0; var1 < 4; var1++) {
				field423[var1].method484();
			}

			System.gc();

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field142[var2][var3][var4] = 0;
					}
				}
			}

			RRREBNUU var5 = new RRREBNUU(field262, field142, 104, 104);
			int var6 = field425.length;
			RRREBNUU.field1168 = XRAHVOIV.field1392;
			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = field230[var7] >> 8;
				int var9 = field230[var7] & 0xFF;
				if (var8 == 33 && var9 >= 71 && var9 <= 73) {
					RRREBNUU.field1168 = false;
				}
			}

			if (RRREBNUU.field1168) {
				field405.method528(field150);
			} else {
				field405.method528(0);
			}

			field347.method297(250);

			if (!field395) {
				for (int var10 = 0; var10 < var6; var10++) {
					int var11 = (field230[var10] >> 8) * 64 - field126;
					int var12 = (field230[var10] & 0xFF) * 64 - field127;
					byte[] var13 = field425[var10];
					if (var13 != null) {
						var5.method438((field462 - 6) * 8, (field463 - 6) * 8, var11, var13, var12);
					}
				}

				for (int var14 = 0; var14 < var6; var14++) {
					int var15 = (field230[var14] >> 8) * 64 - field126;
					int var16 = (field230[var14] & 0xFF) * 64 - field127;
					byte[] var17 = field425[var14];
					if (var17 == null && field463 < 800) {
						var5.method452(var16, 64, var15, 64);
					}
				}

				field347.method297(250);

				for (int var18 = 0; var18 < var6; var18++) {
					byte[] var19 = field181[var18];
					if (var19 != null) {
						int var20 = (field230[var18] >> 8) * 64 - field126;
						int var21 = (field230[var18] & 0xFF) * 64 - field127;
						var5.method450(field423, var20, field405, var21, var19);
					}
				}
			}

			if (field395) {
				for (int var22 = 0; var22 < 4; var22++) {
					for (int var23 = 0; var23 < 13; var23++) {
						for (int var24 = 0; var24 < 13; var24++) {
							int var25 = field398[var22][var23][var24];
							if (var25 != -1) {
								int var26 = var25 >> 24 & 0x3;
								int var27 = var25 >> 1 & 0x3;
								int var28 = var25 >> 14 & 0x3FF;
								int var29 = var25 >> 3 & 0x7FF;
								int var30 = (var28 / 8 << 8) + var29 / 8;
								for (int var31 = 0; var31 < field230.length; var31++) {
									if (field230[var31] == var30 && field425[var31] != null) {
										var5.method435((var28 & 0x7) * 8, field425[var31], var23 * 8, var27, var24 * 8, var22, var26, (var29 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var32 = 0; var32 < 13; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						int var34 = field398[0][var32][var33];
						if (var34 == -1) {
							var5.method452(var33 * 8, 8, var32 * 8, 8);
						}
					}
				}

				field347.method297(250);

				for (int var35 = 0; var35 < 4; var35++) {
					for (int var36 = 0; var36 < 13; var36++) {
						for (int var37 = 0; var37 < 13; var37++) {
							int var38 = field398[var35][var36][var37];
							if (var38 != -1) {
								int var39 = var38 >> 24 & 0x3;
								int var40 = var38 >> 1 & 0x3;
								int var41 = var38 >> 14 & 0x3FF;
								int var42 = var38 >> 3 & 0x7FF;
								int var43 = (var41 / 8 << 8) + var42 / 8;
								for (int var44 = 0; var44 < field230.length; var44++) {
									if (field230[var44] == var43 && field181[var44] != null) {
										var5.method433(var36 * 8, (var42 & 0x7) * 8, var39, field181[var44], (var41 & 0x7) * 8, field405, field423, var37 * 8, var40, var35);
										break;
									}
								}
							}
						}
					}
				}
			}

			field347.method297(250);
			var5.method436(field423, field405);
			field298.method376();
			field347.method297(250);

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method107(var45, var46);
				}
			}

			method26();
		} catch (Exception var59) {
		}

		UVSOAWGE.field1340.method423();

		if (field712 != null) {
			field347.method297(3);
			field347.method302(1057001181);
		}

		if (field158 && signlink.cache_dat != null) {
			int var48 = field340.method186(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field340.method165(var49);
				if ((var50 & 0x79) == 0) {
					DHUPIIUL.method190(var49);
				}
			}
		}

		System.gc();
		DKTEWQXO.method221(20);
		field340.method185();
		int var51 = (field462 - 6) / 8 - 1;
		int var52 = (field462 + 6) / 8 + 1;
		int var53 = (field463 - 6) / 8 - 1;
		int var54 = (field463 + 6) / 8 + 1;
		if (field221) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field340.method169(var56, var55, 0);
					if (var57 != -1) {
						field340.method172(var57, 3);
					}

					int var58 = field340.method169(var56, var55, 1);
					if (var58 != -1) {
						field340.method172(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method120(String arg0, int arg1) {
		field234 = arg1;
		field355 = arg0;
		method49();

		if (field452 == null) {
			super.method120(arg0, arg1);
		} else {
			field386.method376();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field104.method356(var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...", var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			RSDCQVXF.method459(0x8C1111, var3 / 2 - 152, 304, 34, var6);
			RSDCQVXF.method459(0, var3 / 2 - 151, 302, 32, var6 + 1);
			RSDCQVXF.method458(arg1 * 3, 0x8C1111, var6 + 2, var3 / 2 - 150, 30);
			RSDCQVXF.method458(300 - arg1 * 3, 0, var6 + 2, arg1 * 3 + (var3 / 2 - 150), 30);
			field104.method356(var4 / 2 + 5 - var5, 0xFFFFFF, arg0, var3 / 2);
			field386.method377(field709, 202, 171);

			if (field209) {
				field209 = false;

				if (!field449) {
					field387.method377(field709, 0, 0);
					field388.method377(field709, 637, 0);
				}

				field384.method377(field709, 128, 0);
				field385.method377(field709, 202, 371);
				field389.method377(field709, 0, 265);
				field390.method377(field709, 562, 265);
				field391.method377(field709, 128, 171);
				field392.method377(field709, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.b(III)Z")
	public final boolean method121(int arg0, int arg1) {
		boolean var3 = false;
		HPPBIEYV var4 = HPPBIEYV.field925[arg1];
		for (int var5 = 0; var5 < var4.field948.length && var4.field948[var5] != -1; var5++) {
			HPPBIEYV var6 = HPPBIEYV.field925[var4.field948[var5]];
			if (var6.field904 == 1) {
				var3 |= method121(arg0, var6.field959);
			}

			if (var6.field904 == 6 && (var6.field953 != -1 || var6.field954 != -1)) {
				boolean var7 = method55(var6);
				int var8;
				if (var7) {
					var8 = var6.field954;
				} else {
					var8 = var6.field953;
				}

				if (var8 != -1) {
					HARRRJHW var9 = HARRRJHW.field840[var8];
					var6.field928 += arg0;
					while (var6.field928 > var9.method275(var6.field919)) {
						var6.field928 -= var9.method275(var6.field919) + 1;
						var6.field919++;
						if (var6.field919 >= var9.field841) {
							var6.field919 -= var9.field845;
							if (var6.field919 < 0 || var6.field919 >= var9.field841) {
								var6.field919 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method122(boolean arg0) {
		if (field435.field781 >> 7 == field203 && field435.field782 >> 7 == field204) {
			field203 = 0;
		}

		int var2 = field372;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			CXEZIPRQ var4;
			int var5;
			if (arg0) {
				var4 = field435;
				var5 = field370 << 14;
			} else {
				var4 = field371[field373[var3]];
				var5 = field373[var3] << 14;
			}

			if (var4 != null && var4.method161()) {
				var4.field488 = false;
				if ((field158 && field372 > 50 || field372 > 200) && !arg0 && var4.field774 == var4.field756) {
					var4.field488 = true;
				}

				int var6 = var4.field781 >> 7;
				int var7 = var4.field782 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field498 == null || field301 < var4.field484 || field301 >= var4.field485) {
						if ((var4.field781 & 0x7F) == 0x40 && (var4.field782 & 0x7F) == 0x40) {
							if (field97[var6][var7] == field213) {
								continue;
							}

							field97[var6][var7] = field213;
						}

						var4.field481 = method99(var4.field782, field150, var4.field781);
						field405.method538(var4.field782, field150, var4.field781, var4.field758, 60, var4, var5, var4.field783, var4.field481);
					} else {
						var4.field488 = false;
						var4.field481 = method99(var4.field782, field150, var4.field781);
						field405.method539(field150, var4.field481, var4.field491, var4.field783, var4.field493, var5, var4.field781, var4.field494, var4.field492, var4.field782, var4, 60);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method123() {
		if (field173 != 0) {
			int var1 = 0;
			if (field266 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field220[var2] != null) {
					int var3 = field218[var2];
					String var4 = field219[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field307 == 0 || field307 == 1 && method106(var4))) {
						int var8 = 329 - var1 * 13;
						if (field717 > 4 && field718 - 4 > var8 - 10 && field718 - 4 <= var8 + 3) {
							int var9 = field103.method358("From:  " + var4 + field220[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field717 < var9 + 4) {
								if (field195 >= 1) {
									field283[field233] = "Report abuse @whi@" + var4;
									field428[field233] = 2596;
									field233++;
								}

								field283[field233] = "Add ignore @whi@" + var4;
								field428[field233] = 2505;
								field233++;
								field283[field233] = "Add friend @whi@" + var4;
								field428[field233] = 2726;
								field233++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field307 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(ILINLHDAGO;I)V")
	public final void method124(INLHDAGO arg0, int arg1) {
		arg0.method318();
		int var3 = arg0.method319(1);
		if (var3 != 0) {
			int var4 = arg0.method319(2);
			if (var4 == 0) {
				field375[field374++] = field370;
			} else if (var4 == 1) {
				int var5 = arg0.method319(3);
				field435.method272(false, var5);
				int var6 = arg0.method319(1);
				if (var6 == 1) {
					field375[field374++] = field370;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method319(3);
				field435.method272(true, var7);
				int var8 = arg0.method319(3);
				field435.method272(true, var8);
				int var9 = arg0.method319(1);
				if (var9 == 1) {
					field375[field374++] = field370;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method319(1);
				if (var10 == 1) {
					field375[field374++] = field370;
				}

				int var11 = arg0.method319(1);
				int var12 = arg0.method319(7);
				int var13 = arg0.method319(7);
				field150 = arg0.method319(2);
				field435.method271(var13, var12, var11 == 1);
			}
		}
	}

	@ObfuscatedName("client.a(LBKYZHYRW;I)V")
	public final void method125(BKYZHYRW arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field250.length; var3++) {
			field250[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field250[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field251[var9] = (field250[var9 - 1] + field250[var9 + 1] + field250[var9 - 128] + field250[var9 + 128]) / 4;
				}
			}

			int[] var10 = field250;
			field250 = field251;
			field251 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field30; var12++) {
				for (int var13 = 0; var13 < arg0.field29; var13++) {
					if (arg0.field27[var11++] != 0) {
						int var14 = var13 + arg0.field31 + 16;
						int var15 = var12 + arg0.field32 + 16;
						int var16 = (var15 << 7) + var14;
						field250[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method126() {
		field299.method376();
		DKTEWQXO.field630 = field330;
		field226.method10(0, 0);

		if (field190) {
			field104.method356(40, 0, field383, 239);
			field104.method356(60, 128, field202 + "*", 239);
		} else if (field454) {
			field104.method356(40, 0, "Enter amount:", 239);
			field104.method356(60, 128, field342 + "*", 239);
		} else if (field366 != null) {
			field104.method356(40, 0, field366, 239);
			field104.method356(60, 128, "Click to continue", 239);
		} else if (field315 != -1) {
			method31(0, 0, HPPBIEYV.field925[field315], 0);
		} else if (field460 == -1) {
			JLICUWSE var1 = field103;
			int var2 = 0;
			RSDCQVXF.method455(463, 77, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field220[var3] != null) {
					int var4 = field218[var3];
					int var5 = field143 + 70 - var2 * 14;
					String var6 = field219[var3];
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
							var1.method360(4, 0, field220[var3], var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field424 == 0 || field424 == 1 && method106(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field399[0].method10(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field399[1].method10(var5 - 12, var8);
								var8 += 14;
							}

							var1.method360(var8, 0, var6 + ":", var5);
							var8 += var1.method358(var6) + 8;
							var1.method360(var8, 255, field220[var3], var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field173 == 0 && (var4 == 7 || field307 == 0 || field307 == 1 && method106(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method360(var9, 0, "From", var5);
							int var11 = var9 + var1.method358("From ");
							if (var7 == 1) {
								field399[0].method10(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field399[1].method10(var5 - 12, var11);
								var11 += 14;
							}

							var1.method360(var11, 0, var6 + ":", var5);
							var11 += var1.method358(var6) + 8;
							var1.method360(var11, 0x800000, field220[var3], var5);
						}

						var2++;
					}

					if (var4 == 4 && (field186 == 0 || field186 == 1 && method106(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method360(4, 0x800080, var6 + " " + field220[var3], var5);
						}

						var2++;
					}

					if (var4 == 5 && field173 == 0 && field307 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method360(4, 0x800000, field220[var3], var5);
						}

						var2++;
					}

					if (var4 == 6 && field173 == 0 && field307 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method360(4, 0, "To " + var6 + ":", var5);
							var1.method360(var1.method358("To " + var6) + 12, 0x800000, field220[var3], var5);
						}

						var2++;
					}

					if (var4 == 8 && (field186 == 0 || field186 == 1 && method106(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method360(4, 0x7E3200, var6 + " " + field220[var3], var5);
						}

						var2++;
					}
				}
			}

			RSDCQVXF.method454();
			field360 = var2 * 14 + 7;
			if (field360 < 78) {
				field360 = 78;
			}

			method145(77, 0, 463, field360, field360 - field143 - 77);
			String var10;
			if (field435 == null || field435.field474 == null) {
				var10 = RTZFXINE.method473(field344);
			} else {
				var10 = field435.field474;
			}

			var1.method360(4, 0, var10 + ":", 90);
			var1.method360(var1.method358(var10 + ": ") + 6, 255, field79 + "*", 90);
			RSDCQVXF.method461(479, 0, 77, 0);
		} else {
			method31(0, 0, HPPBIEYV.field925[field460], 0);
		}

		if (field281 && field58 == 2) {
			method54();
		}

		field299.method377(field709, 17, 357);
		field298.method376();
		DKTEWQXO.field630 = field332;
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method127(int arg0) {
		if (arg0 >= 0) {
			if (field454) {
				field454 = false;
				field194 = true;
			}

			int var2 = field426[arg0];
			int var3 = field427[arg0];
			int var4 = field428[arg0];
			int var5 = field429[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 601) {
				CRBPLXHF var6 = field269[var5];
				if (var6 != null) {
					method73(2, 0, 1, var6.field772[0], 0, var6.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field347.method297(135);
					field347.method330(var5);
				}
			}

			if (var4 == 633) {
				boolean var7 = method73(2, 0, 0, var2, 0, var3, false, field435.field772[0], 0, 0, field435.field773[0]);
				if (!var7) {
					method73(2, 0, 1, var2, 0, var3, false, field435.field772[0], 1, 0, field435.field773[0]);
				}

				field89 = field724;
				field90 = field725;
				field92 = 2;
				field91 = 0;
				field347.method297(18);
				field347.method332(field177);
				field347.method331(field176);
				field347.method332(field178);
				field347.method332(var5);
				field347.method299(field127 + var3);
				field347.method299(field126 + var2);
			}

			if (var4 == 835) {
				field347.method297(40);
				field347.method330(var3);
				field347.method299(var2);
				field347.method331(var5);
				field235 = 0;
				field236 = var3;
				field237 = var2;
				field238 = 2;
				if (HPPBIEYV.field925[var3].field952 == field135) {
					field238 = 1;
				}

				if (HPPBIEYV.field925[var3].field952 == field315) {
					field238 = 3;
				}
			}

			if (var4 == 572) {
				field347.method297(92);
				field347.method330(var3);
				field347.method330(var2);
				field347.method332(var5);
				field235 = 0;
				field236 = var3;
				field237 = var2;
				field238 = 2;
				if (HPPBIEYV.field925[var3].field952 == field135) {
					field238 = 1;
				}

				if (HPPBIEYV.field925[var3].field952 == field315) {
					field238 = 3;
				}
			}

			if (var4 == 832 && !field444) {
				field347.method297(61);
				field347.method299(var3);
				field444 = true;
			}

			if (var4 == 888) {
				CXEZIPRQ var9 = field371[var5];
				if (var9 != null) {
					method73(2, 0, 1, var9.field772[0], 0, var9.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field347.method297(157);
					field347.method332(var5);
				}
			}

			if (var4 == 1033) {
				int var10 = var5 >> 14 & 0x7FFF;
				UVSOAWGE var11 = UVSOAWGE.method501(var10);
				String var12;
				if (var11.field1331 == null) {
					var12 = "It's a " + var11.field1312 + ".";
				} else {
					var12 = new String(var11.field1331);
				}

				method46("", 0, var12);
			}

			if (var4 == 62) {
				boolean var13 = method73(2, 0, 0, var2, 0, var3, false, field435.field772[0], 0, 0, field435.field773[0]);
				if (!var13) {
					method73(2, 0, 1, var2, 0, var3, false, field435.field772[0], 1, 0, field435.field773[0]);
				}

				field89 = field724;
				field90 = field725;
				field92 = 2;
				field91 = 0;
				field367 += field126;
				if (field367 >= 86) {
					field347.method297(72);
					field347.method299(10341);
					field367 = 0;
				}

				field347.method297(242);
				field347.method332(var5);
				field347.method332(field127 + var3);
				field347.method331(field126 + var2);
			}

			if (var4 == 758) {
				CXEZIPRQ var15 = field371[var5];
				if (var15 != null) {
					method73(2, 0, 1, var15.field772[0], 0, var15.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field347.method297(137);
					field347.method299(var5);
				}
			}

			if (var4 == 469) {
				CXEZIPRQ var16 = field371[var5];
				if (var16 != null) {
					method73(2, 0, 1, var16.field772[0], 0, var16.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field347.method297(213);
					field347.method332(field146);
					field347.method331(var5);
				}
			}

			if (var4 == 726 || var4 == 505 || var4 == 649 || var4 == 200) {
				String var17 = field283[arg0];
				int var18 = var17.indexOf("@whi@");
				if (var18 != -1) {
					long var19 = RTZFXINE.method469(var17.substring(var18 + 5).trim());
					if (var4 == 726) {
						method103(var19);
					}

					if (var4 == 505) {
						method67(var19);
					}

					if (var4 == 649) {
						method35(var19);
					}

					if (var4 == 200) {
						method56(var19);
					}
				}
			}

			if (var4 == 470) {
				field347.method297(106);
				field347.method332(var3);
				field347.method299(var2);
				field347.method331(var5);
				field235 = 0;
				field236 = var3;
				field237 = var2;
				field238 = 2;
				if (HPPBIEYV.field925[var3].field952 == field135) {
					field238 = 1;
				}

				if (HPPBIEYV.field925[var3].field952 == field315) {
					field238 = 3;
				}
			}

			if (var4 == 654) {
				field175 = 1;
				field176 = var2;
				field177 = var3;
				field178 = var5;
				field179 = HFWXROSJ.method286(var5).field890;
				field145 = 0;
				field294 = true;
			} else if (var4 == 367) {
				HPPBIEYV var21 = HPPBIEYV.field925[var3];
				field145 = 1;
				field146 = var3;
				field147 = var21.field922;
				field175 = 0;
				field294 = true;
				String var22 = var21.field939;
				if (var22.indexOf(" ") != -1) {
					var22 = var22.substring(0, var22.indexOf(" "));
				}

				String var23 = var21.field939;
				if (var23.indexOf(" ") != -1) {
					var23 = var23.substring(var23.indexOf(" ") + 1);
				}

				field148 = var22 + " " + var21.field965 + " " + var23;

				if (field147 == 16) {
					field294 = true;
					field114 = 3;
					field56 = true;
				}
			} else {
				if (var4 == 985) {
					boolean var24 = method73(2, 0, 0, var2, 0, var3, false, field435.field772[0], 0, 0, field435.field773[0]);
					if (!var24) {
						method73(2, 0, 1, var2, 0, var3, false, field435.field772[0], 1, 0, field435.field773[0]);
					}

					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field347.method297(123);
					field347.method332(var5);
					field347.method299(field127 + var3);
					field347.method299(field126 + var2);
				}

				if (var4 == 290) {
					if ((var5 & 0x3) == 0) {
						field207++;
					}

					if (field207 >= 84) {
						field347.method297(48);
						field347.method299(3240);
						field207 = 0;
					}

					field347.method297(232);
					field347.method331(var3);
					field347.method331(var2);
					field347.method330(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 314) {
					field347.method297(69);
					field347.method330(var3);
					field347.method299(var2);
					field347.method330(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 969) {
					field347.method297(183);
					field347.method330(var3);
					field347.method331(var2);
					field347.method331(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 1385) {
					HFWXROSJ var26 = HFWXROSJ.method286(var5);
					String var27;
					if (var26.field899 == null) {
						var27 = "It's a " + var26.field890 + ".";
					} else {
						var27 = new String(var26.field899);
					}

					method46("", 0, var27);
				}

				if (var4 == 323) {
					method148(var2, var3, var5);
					field347.method297(249);
					field347.method299(var5 >> 14 & 0x7FFF);
					field347.method330(field127 + var3);
					field347.method331(field126 + var2);
				}

				if (var4 == 122) {
					boolean var28 = method73(2, 0, 0, var2, 0, var3, false, field435.field772[0], 0, 0, field435.field773[0]);
					if (!var28) {
						method73(2, 0, 1, var2, 0, var3, false, field435.field772[0], 1, 0, field435.field773[0]);
					}

					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field347.method297(200);
					field347.method299(field146);
					field347.method299(var5);
					field347.method331(field127 + var3);
					field347.method331(field126 + var2);
				}

				if (var4 == 113) {
					method148(var2, var3, var5);
					field347.method297(102);
					field347.method330(var5 >> 14 & 0x7FFF);
					field347.method299(field127 + var3);
					field347.method299(field126 + var2);
				}

				if (var4 == 925) {
					method147();
				}

				if (var4 == 496) {
					CRBPLXHF var30 = field269[var5];
					if (var30 != null) {
						method73(2, 0, 1, var30.field772[0], 0, var30.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;

						if ((var5 & 0x3) == 0) {
							field93++;
						}

						if (field93 >= 86) {
							field347.method297(47);
							field347.method302(0);
							field93 = 0;
						}

						field347.method297(155);
						field347.method299(var5);
					}
				}

				if (var4 == 596) {
					String var31 = field283[arg0];
					int var32 = var31.indexOf("@whi@");
					if (var32 != -1) {
						if (field135 == -1) {
							method147();
							field400 = var31.substring(var32 + 5).trim();
							field441 = false;

							for (int var33 = 0; var33 < HPPBIEYV.field925.length; var33++) {
								if (HPPBIEYV.field925[var33] != null && HPPBIEYV.field925[var33].field916 == 600) {
									field277 = field135 = HPPBIEYV.field925[var33].field952;
									break;
								}
							}
						} else {
							method46("", 0, "Please close the interface you have open before using 'report abuse'");
						}
					}
				}

				if (var4 == 393 || var4 == 752) {
					String var34 = field283[arg0];
					int var35 = var34.indexOf("@whi@");
					if (var35 != -1) {
						var34 = var34.substring(var35 + 5).trim();
						String var36 = RTZFXINE.method473(RTZFXINE.method470(RTZFXINE.method469(var34)));
						boolean var37 = false;
						for (int var38 = 0; var38 < field372; var38++) {
							CXEZIPRQ var39 = field371[field373[var38]];
							if (var39 != null && var39.field474 != null && var39.field474.equalsIgnoreCase(var36)) {
								method73(2, 0, 1, var39.field772[0], 0, var39.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);

								if (var4 == 393) {
									field347.method297(221);
									field347.method332(field373[var38]);
								}

								if (var4 == 752) {
									field347.method297(157);
									field347.method332(field373[var38]);
								}

								var37 = true;
								break;
							}
						}

						if (!var37) {
							method46("", 0, "Unable to find " + var36);
						}
					}
				}

				if (var4 == 646) {
					field347.method297(107);
					field347.method299(var3);
					HPPBIEYV var40 = HPPBIEYV.field925[var3];
					if (var40.field930 != null && var40.field930[0][0] == 5) {
						int var41 = var40.field930[0][1];
						field313[var41] = 1 - field313[var41];
						method61(var41);
						field294 = true;
					}
				}

				if (var4 == 350) {
					field347.method297(1);
					field347.method299(field146);
					field347.method332(var3);
					field347.method332(var2);
					field347.method330(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 863) {
					HPPBIEYV var42 = HPPBIEYV.field925[var3];
					boolean var43 = true;
					if (var42.field916 > 0) {
						var43 = method32(var42);
					}

					if (var43) {
						field347.method297(107);
						field347.method299(var3);
					}
				}

				if (var4 == 436) {
					field347.method297(26);
					field347.method330(field177);
					field347.method299(field176);
					field347.method330(field178);
					field347.method330(var3);
					field347.method331(var2);
					field347.method299(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 437) {
					CXEZIPRQ var44 = field371[var5];
					if (var44 != null) {
						method73(2, 0, 1, var44.field772[0], 0, var44.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field347.method297(221);
						field347.method332(var5);
					}
				}

				if (var4 == 456) {
					String var45 = field283[arg0];
					int var46 = var45.indexOf("@whi@");
					if (var46 != -1) {
						long var47 = RTZFXINE.method469(var45.substring(var46 + 5).trim());
						int var49 = -1;
						for (int var50 = 0; var50 < field80; var50++) {
							if (field248[var50] == var47) {
								var49 = var50;
								break;
							}
						}

						if (var49 != -1 && field422[var49] > 0) {
							field194 = true;
							field454 = false;
							field190 = true;
							field202 = "";
							field85 = 3;
							field289 = field248[var49];
							field383 = "Enter message to send to " + field354[var49];
						}
					}
				}

				if (var4 == 370) {
					CRBPLXHF var51 = field269[var5];
					if (var51 != null) {
						method73(2, 0, 1, var51.field772[0], 0, var51.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field347.method297(169);
						field347.method332(field177);
						field347.method330(field176);
						field347.method299(field178);
						field347.method331(var5);
					}
				}

				if (var4 == 595) {
					CRBPLXHF var52 = field269[var5];
					if (var52 != null) {
						method73(2, 0, 1, var52.field772[0], 0, var52.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field347.method297(247);
						field347.method299(field146);
						field347.method331(var5);
					}
				}

				if (var4 == 364 && method148(var2, var3, var5)) {
					field347.method297(210);
					field347.method299(field146);
					field347.method330(var5 >> 14 & 0x7FFF);
					field347.method331(field127 + var3);
					field347.method330(field126 + var2);
				}

				if (var4 == 959) {
					boolean var53 = method73(2, 0, 0, var2, 0, var3, false, field435.field772[0], 0, 0, field435.field773[0]);
					if (!var53) {
						method73(2, 0, 1, var2, 0, var3, false, field435.field772[0], 1, 0, field435.field773[0]);
					}

					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field347.method297(184);
					field347.method332(var5);
					field347.method332(field127 + var3);
					field347.method299(field126 + var2);
				}

				if (var4 == 607) {
					method148(var2, var3, var5);
					field347.method297(76);
					field347.method299(var5 >> 14 & 0x7FFF);
					field347.method331(field127 + var3);
					field347.method332(field126 + var2);
				}

				if (var4 == 1258) {
					CRBPLXHF var55 = field269[var5];
					if (var55 != null) {
						DOBKXCMM var56 = var55.field473;
						if (var56.field664 != null) {
							var56 = var56.method240();
						}

						if (var56 != null) {
							String var57;
							if (var56.field648 == null) {
								var57 = "It's a " + var56.field669 + ".";
							} else {
								var57 = new String(var56.field648);
							}

							method46("", 0, var57);
						}
					}
				}

				if (var4 == 1790) {
					HFWXROSJ var58 = HFWXROSJ.method286(var5);
					HPPBIEYV var59 = HPPBIEYV.field925[var3];
					String var60;
					if (var59 != null && var59.field937[var2] >= 100000) {
						var60 = var59.field937[var2] + " x " + var58.field890;
					} else if (var58.field899 == null) {
						var60 = "It's a " + var58.field890 + ".";
					} else {
						var60 = new String(var58.field899);
					}

					method46("", 0, var60);
				}

				if (var4 == 608) {
					CXEZIPRQ var61 = field371[var5];
					if (var61 != null) {
						method73(2, 0, 1, var61.field772[0], 0, var61.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field347.method297(134);
						field347.method332(var5);
					}
				}

				if (var4 == 335) {
					CRBPLXHF var62 = field269[var5];
					if (var62 != null) {
						method73(2, 0, 1, var62.field772[0], 0, var62.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field174 += var5;
						if (field174 >= 148) {
							field347.method297(252);
							field347.method299(47761);
							field174 = 0;
						}

						field347.method297(73);
						field347.method299(var5);
					}
				}

				if (var4 == 341) {
					CXEZIPRQ var63 = field371[var5];
					if (var63 != null) {
						method73(2, 0, 1, var63.field772[0], 0, var63.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field380 += var5;
						if (field380 >= 142) {
							field347.method297(35);
							field347.method301(0x2C7C12);
							field380 = 0;
						}

						field347.method297(145);
						field347.method331(var5);
					}
				}

				if (var4 == 317 && method148(var2, var3, var5)) {
					field347.method297(28);
					field347.method330(field177);
					field347.method330(field176);
					field347.method332(field178);
					field347.method330(var5 >> 14 & 0x7FFF);
					field347.method331(field127 + var3);
					field347.method299(field126 + var2);
				}

				if (var4 == 391) {
					field295 += var3;
					if (field295 >= 102) {
						field347.method297(190);
						field347.method298(224);
						field295 = 0;
					}

					field347.method297(53);
					field347.method330(var3);
					field347.method330(var2);
					field347.method330(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 78) {
					CXEZIPRQ var64 = field371[var5];
					if (var64 != null) {
						method73(2, 0, 1, var64.field772[0], 0, var64.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field347.method297(165);
						field347.method331(field177);
						field347.method299(field176);
						field347.method331(field178);
						field347.method331(var5);
					}
				}

				if (var4 == 617) {
					CRBPLXHF var65 = field269[var5];
					if (var65 != null) {
						method73(2, 0, 1, var65.field772[0], 0, var65.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field347.method297(243);
						field347.method299(var5);
					}
				}

				if (var4 == 138) {
					field347.method297(220);
					field347.method299(var3);
					field347.method330(var2);
					field347.method299(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 872) {
					field95++;
					if (field95 >= 93) {
						field347.method297(30);
						field347.method302(0);
						field95 = 0;
					}

					method148(var2, var3, var5);
					field347.method297(80);
					field347.method331(var5 >> 14 & 0x7FFF);
					field347.method330(field127 + var3);
					field347.method332(field126 + var2);
				}

				if (var4 == 56) {
					field347.method297(226);
					field347.method332(var3);
					field347.method299(var2);
					field347.method299(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 143) {
					boolean var66 = method73(2, 0, 0, var2, 0, var3, false, field435.field772[0], 0, 0, field435.field773[0]);
					if (!var66) {
						method73(2, 0, 1, var2, 0, var3, false, field435.field772[0], 1, 0, field435.field773[0]);
					}

					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field347.method297(14);
					field347.method331(var5);
					field347.method299(field127 + var3);
					field347.method331(field126 + var2);
				}

				if (var4 == 243) {
					field347.method297(107);
					field347.method299(var3);
					HPPBIEYV var68 = HPPBIEYV.field925[var3];
					if (var68.field930 != null && var68.field930[0][0] == 5) {
						int var69 = var68.field930[0][1];
						if (field313[var69] != var68.field920[0]) {
							field313[var69] = var68.field920[0];
							method61(var69);
							field294 = true;
						}
					}
				}

				if (var4 == 759) {
					field347.method297(122);
					field347.method299(var3);
					field347.method332(var2);
					field347.method332(var5);
					field235 = 0;
					field236 = var3;
					field237 = var2;
					field238 = 2;
					if (HPPBIEYV.field925[var3].field952 == field135) {
						field238 = 1;
					}

					if (HPPBIEYV.field925[var3].field952 == field315) {
						field238 = 3;
					}
				}

				if (var4 == 473) {
					boolean var70 = method73(2, 0, 0, var2, 0, var3, false, field435.field772[0], 0, 0, field435.field773[0]);
					if (!var70) {
						method73(2, 0, 1, var2, 0, var3, false, field435.field772[0], 1, 0, field435.field773[0]);
					}

					field89 = field724;
					field90 = field725;
					field92 = 2;
					field91 = 0;
					field252++;
					if (field252 >= 106) {
						field347.method297(230);
						field347.method301(0xF6781A);
						field252 = 0;
					}

					field347.method297(115);
					field347.method299(var5);
					field347.method331(field127 + var3);
					field347.method330(field126 + var2);
				}

				if (var4 == 89) {
					if (field281) {
						field405.method565(var2 - 4, var3 - 4);
					} else {
						field405.method565(field724 - 4, field725 - 4);
					}
				}

				if (var4 == 942) {
					CRBPLXHF var72 = field269[var5];
					if (var72 != null) {
						method73(2, 0, 1, var72.field772[0], 0, var72.field773[0], false, field435.field772[0], 1, 0, field435.field773[0]);
						field89 = field724;
						field90 = field725;
						field92 = 2;
						field91 = 0;
						field347.method297(248);
						field347.method299(var5);
					}
				}

				if (var4 == 1416) {
					method148(var2, var3, var5);
					field347.method297(96);
					field347.method299(var5 >> 14 & 0x7FFF);
					field347.method332(field127 + var3);
					field347.method331(field126 + var2);
				}

				field175 = 0;
				field145 = 0;
				field294 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IBLINLHDAGO;)V")
	public final void method128(int arg0, INLHDAGO arg1) {
		while (arg1.field970 + 10 < arg0 * 8) {
			int var3 = arg1.method319(11);
			if (var3 == 2047) {
				break;
			}

			if (field371[var3] == null) {
				field371[var3] = new CXEZIPRQ();
				if (field376[var3] != null) {
					field371[var3].method163(field376[var3]);
				}
			}

			field373[field372++] = var3;
			CXEZIPRQ var4 = field371[var3];
			var4.field760 = field301;
			int var5 = arg1.method319(1);
			if (var5 == 1) {
				field375[field374++] = var3;
			}

			int var6 = arg1.method319(1);
			int var7 = arg1.method319(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method319(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method271(field435.field772[0] + var8, field435.field773[0] + var7, var6 == 1);
		}

		arg1.method320();
	}

	@ObfuscatedName("client.G(I)V")
	public final void method129() {
		int var1 = 5;
		field293[8] = 0;
		int var2 = 0;
		while (field293[8] == 0) {
			String var3 = "Unknown problem";
			method120("Connecting to web server", 20);

			try {
				DataInputStream var4 = method108("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 307);
				INLHDAGO var5 = new INLHDAGO(new byte[40]);
				var4.readFully(var5.field968, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field293[var6] = var5.method313();
				}

				int var7 = var5.method313();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field293[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field293[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field293[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field293[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field293[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field293[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method120("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method120(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field465 = !field465;
			}
		}
	}

	@ObfuscatedName("client.b(IZI)Ljava/lang/String;")
	public static final String method130(int arg0, int arg1) {
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

	@ObfuscatedName("client.l(B)V")
	public final void method131() {
		field213++;
		method122(true);
		method34(true);
		method122(false);
		method34(false);
		method58();
		method66();

		if (!field141) {
			int var1 = field45;
			if (field99 / 256 > var1) {
				var1 = field99 / 256;
			}

			if (field404[4] && field466[4] + 128 > var1) {
				var1 = field466[4] + 128;
			}

			int var2 = field46 + field182 & 0x7FF;
			method141(field215, var1, var1 * 3 + 600, var2, field214, method99(field435.field782, field150, field435.field781) - 50);
		}

		int var3;
		if (field141) {
			var3 = method87();
		} else {
			var3 = method86();
		}

		int var4 = field335;
		int var5 = field336;
		int var6 = field337;
		int var7 = field338;
		int var8 = field339;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field404[var9]) {
				int var10 = (int) (Math.random() * (field110[var9] * 2 + 1) + Math.sin(field282[var9] / 100.0D * field117[var9]) * field466[var9] - field110[var9]);
				if (var9 == 0) {
					field335 += var10;
				}

				if (var9 == 1) {
					field336 += var10;
				}

				if (var9 == 2) {
					field337 += var10;
				}

				if (var9 == 3) {
					field339 = field339 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field338 += var10;
					if (field338 < 128) {
						field338 = 128;
					}

					if (field338 > 383) {
						field338 = 383;
					}
				}
			}
		}

		int var11 = DKTEWQXO.field639;
		DHUPIIUL.field602 = true;
		DHUPIIUL.field605 = 0;
		DHUPIIUL.field603 = field717 - 4;
		DHUPIIUL.field604 = field718 - 4;
		RSDCQVXF.method456();
		field405.method566(field339, field337, field338, var3, field335, field336);
		field405.method541();
		method48();
		method104();
		method134(var11);
		method110();
		field298.method377(field709, 4, 4);
		field335 = var4;
		field336 = var5;
		field337 = var6;
		field338 = var7;
		field339 = var8;
	}

	@ObfuscatedName("client.c(III)V")
	public final void method132(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field220[var4] != null) {
				int var5 = field218[var4];
				int var6 = field143 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field219[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field424 == 0 || field424 == 1 && method106(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field435.field474)) {
						if (field195 >= 1) {
							field283[field233] = "Report abuse @whi@" + var7;
							field428[field233] = 596;
							field233++;
						}

						field283[field233] = "Add ignore @whi@" + var7;
						field428[field233] = 505;
						field233++;
						field283[field233] = "Add friend @whi@" + var7;
						field428[field233] = 726;
						field233++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field173 == 0 && (var5 == 7 || field307 == 0 || field307 == 1 && method106(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field195 >= 1) {
							field283[field233] = "Report abuse @whi@" + var7;
							field428[field233] = 596;
							field233++;
						}

						field283[field233] = "Add ignore @whi@" + var7;
						field428[field233] = 505;
						field233++;
						field283[field233] = "Add friend @whi@" + var7;
						field428[field233] = 726;
						field233++;
					}

					var3++;
				}

				if (var5 == 4 && (field186 == 0 || field186 == 1 && method106(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field283[field233] = "Accept trade @whi@" + var7;
						field428[field233] = 393;
						field233++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field173 == 0 && field307 < 2) {
					var3++;
				}

				if (var5 == 8 && (field186 == 0 || field186 == 1 && method106(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field283[field233] = "Accept challenge @whi@" + var7;
						field428[field233] = 752;
						field233++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILINLHDAGO;)V")
	public final void method133(int arg0, INLHDAGO arg1) {
		field163 = 0;
		field374 = 0;
		method124(arg1, arg0);
		method74(arg1, arg0);
		method128(arg0, arg1);
		method33(arg0, arg1);

		for (int var3 = 0; var3 < field163; var3++) {
			int var4 = field164[var3];
			if (field301 != field371[var4].field760) {
				field371[var4] = null;
			}
		}

		if (arg1.field969 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field969 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field372; var5++) {
			if (field371[field373[var5]] == null) {
				signlink.reporterror(field344 + " null entry in pl list - pos:" + var5 + " size:" + field372);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method134(int arg0) {
		if (!field158) {
			if (DKTEWQXO.field638[17] >= arg0) {
				BKYZHYRW var2 = DKTEWQXO.field632[17];
				int var3 = var2.field30 * var2.field29 - 1;
				int var4 = field229 * var2.field29 * 2;
				byte[] var5 = var2.field27;
				byte[] var6 = field222;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field27 = var6;
				field222 = var5;
				DKTEWQXO.method224(17);
			}

			if (DKTEWQXO.field638[24] >= arg0) {
				BKYZHYRW var8 = DKTEWQXO.field632[24];
				int var9 = var8.field30 * var8.field29 - 1;
				int var10 = field229 * var8.field29 * 2;
				byte[] var11 = var8.field27;
				byte[] var12 = field222;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field27 = var12;
				field222 = var11;
				DKTEWQXO.method224(24);
			}

			if (DKTEWQXO.field638[34] >= arg0) {
				BKYZHYRW var14 = DKTEWQXO.field632[34];
				int var15 = var14.field30 * var14.field29 - 1;
				int var16 = field229 * var14.field29 * 2;
				byte[] var17 = var14.field27;
				byte[] var18 = field222;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field27 = var18;
				field222 = var17;
				DKTEWQXO.method224(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public void method135() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field206);

		if (field340 != null) {
			System.out.println("Od-cycle:" + field340.field535);
		}

		System.out.println("loop-cycle:" + field301);
		System.out.println("draw-cycle:" + field78);
		System.out.println("ptype:" + field362);
		System.out.println("psize:" + field361);

		if (field131 != null) {
			field131.method588();
		}

		field706 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method136() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field712 != null) {
			return field712;
		}

		return this;
	}

	@ObfuscatedName("client.a(LINLHDAGO;ZI)V")
	public final void method137(INLHDAGO arg0, int arg1) {
		arg0.method318();
		int var3 = arg0.method319(8);
		if (var3 < field270) {
			for (int var4 = var3; var4 < field270; var4++) {
				field164[field163++] = field271[var4];
			}
		}

		if (var3 > field270) {
			signlink.reporterror(field344 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field270 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field271[var5];
			CRBPLXHF var7 = field269[var6];
			int var8 = arg0.method319(1);
			if (var8 == 0) {
				field271[field270++] = var6;
				var7.field760 = field301;
			} else {
				int var9 = arg0.method319(2);
				if (var9 == 0) {
					field271[field270++] = var6;
					var7.field760 = field301;
					field375[field374++] = var6;
				} else if (var9 == 1) {
					field271[field270++] = var6;
					var7.field760 = field301;
					int var10 = arg0.method319(3);
					var7.method272(false, var10);
					int var11 = arg0.method319(1);
					if (var11 == 1) {
						field375[field374++] = var6;
					}
				} else if (var9 == 2) {
					field271[field270++] = var6;
					var7.field760 = field301;
					int var12 = arg0.method319(3);
					var7.method272(true, var12);
					int var13 = arg0.method319(3);
					var7.method272(true, var13);
					int var14 = arg0.method319(1);
					if (var14 == 1) {
						field375[field374++] = var6;
					}
				} else if (var9 == 3) {
					field164[field163++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method138(int arg0) {
		HPPBIEYV var2 = HPPBIEYV.field925[arg0];
		for (int var3 = 0; var3 < var2.field948.length && var2.field948[var3] != -1; var3++) {
			HPPBIEYV var4 = HPPBIEYV.field925[var2.field948[var3]];
			if (var4.field904 == 1) {
				method138(var4.field959);
			}

			var4.field919 = 0;
			var4.field928 = 0;
		}
	}

	@ObfuscatedName("client.a(ZB[B)V")
	public final void method139(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.d(ILINLHDAGO;I)V")
	public final void method140(int arg0, INLHDAGO arg1) {
		if (arg0 == 134) {
			int var3 = arg1.method326();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field100[var4];
			int var7 = arg1.method325();
			int var8 = (var7 >> 4 & 0x7) + field82;
			int var9 = (var7 & 0x7) + field83;
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
				method21(var9, field150, var8, -1, -1, var4, var5, 0, var6);
			}
		} else if (arg0 == 57) {
			int var10 = arg1.method335();
			int var11 = arg1.method325();
			int var12 = var11 >> 2;
			int var13 = var11 & 0x3;
			int var14 = field100[var12];
			int var15 = arg1.method327();
			int var16 = (var15 >> 4 & 0x7) + field82;
			int var17 = (var15 & 0x7) + field83;
			if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
				method21(var17, field150, var16, -1, var10, var12, var13, 0, var14);
			}
		} else if (arg0 == 166) {
			int var18 = arg1.method308();
			int var19 = (var18 >> 4 & 0x7) + field82;
			int var20 = (var18 & 0x7) + field83;
			int var21 = arg1.method310();
			int var22 = arg1.method308();
			int var23 = arg1.method310();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				var19 = var19 * 128 + 64;
				var20 = var20 * 128 + 64;
				PIYQORZV var24 = new PIYQORZV(var21, method99(var20, field150, var19) - var22, field301, field150, var19, var23, var20);
				field287.method424(var24);
			}
		} else {
			if (arg0 == 113) {
				int var25 = arg1.method308();
				int var26 = (var25 >> 4 & 0x7) + field82;
				int var27 = (var25 & 0x7) + field83;
				int var28 = arg1.method310();
				int var29 = arg1.method308();
				int var30 = var29 >> 4 & 0xF;
				int var31 = var29 & 0x7;
				if (field435.field772[0] >= var26 - var30 && field435.field772[0] <= var26 + var30 && field435.field773[0] >= var27 - var30 && field435.field773[0] <= var27 + var30 && field149 && !field158 && field57 < 50) {
					field343[field57] = var28;
					field394[field57] = var31;
					field439[field57] = FMUEZRNA.field750[var28];
					field57++;
				}
			}

			if (arg0 == 240) {
				int var32 = arg1.method335();
				int var33 = arg1.method310();
				int var34 = arg1.method325();
				int var35 = (var34 >> 4 & 0x7) + field82;
				int var36 = (var34 & 0x7) + field83;
				if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
					YPNBIJGC var37 = new YPNBIJGC();
					var37.field1458 = var33;
					var37.field1457 = var32;

					if (field346[field150][var35][var36] == null) {
						field346[field150][var35][var36] = new ROXEPOUC();
					}

					field346[field150][var35][var36].method424(var37);
					method107(var35, var36);
				}
			} else if (arg0 == 90) {
				int var38 = arg1.method334();
				int var39 = arg1.method325();
				int var40 = (var39 >> 4 & 0x7) + field82;
				int var41 = (var39 & 0x7) + field83;
				if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
					ROXEPOUC var42 = field346[field150][var40][var41];
					if (var42 != null) {
						for (YPNBIJGC var43 = (YPNBIJGC) var42.method427(); var43 != null; var43 = (YPNBIJGC) var42.method429()) {
							if ((var38 & 0x7FFF) == var43.field1458) {
								var43.method234();
								break;
							}
						}

						if (var42.method427() == null) {
							field346[field150][var40][var41] = null;
						}

						method107(var40, var41);
					}
				}
			} else if (arg0 == 234) {
				int var44 = arg1.method308();
				int var45 = (var44 >> 4 & 0x7) + field82;
				int var46 = (var44 & 0x7) + field83;
				int var47 = var45 + arg1.method309();
				int var48 = var46 + arg1.method309();
				int var49 = arg1.method311();
				int var50 = arg1.method310();
				int var51 = arg1.method308() * 4;
				int var52 = arg1.method308() * 4;
				int var53 = arg1.method310();
				int var54 = arg1.method310();
				int var55 = arg1.method308();
				int var56 = arg1.method308();
				if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var50 != 0xFFFF) {
					var45 = var45 * 128 + 64;
					var46 = var46 * 128 + 64;
					var47 = var47 * 128 + 64;
					var48 = var48 * 128 + 64;
					SDZHMORV var57 = new SDZHMORV(var55, field301 + var54, var46, method99(var46, field150, var45) - var51, var45, var56, field301 + var53, field150, var49, var52, var50);
					var57.method479(var47, var48, field301 + var53, method99(var48, field150, var47) - var52);
					field247.method424(var57);
				}
			} else if (arg0 == 22) {
				int var58 = arg1.method310();
				int var59 = arg1.method327();
				int var60 = var59 >> 2;
				int var61 = var59 & 0x3;
				int var62 = field100[var60];
				int var63 = arg1.method308();
				int var64 = (var63 >> 4 & 0x7) + field82;
				int var65 = (var63 & 0x7) + field83;
				if (var64 >= 0 && var65 >= 0 && var64 < 103 && var65 < 103) {
					int var66 = field262[field150][var64][var65];
					int var67 = field262[field150][var64 + 1][var65];
					int var68 = field262[field150][var64 + 1][var65 + 1];
					int var69 = field262[field150][var64][var65 + 1];
					if (var62 == 0) {
						IWELYSOI var70 = field405.method549(var64, field150, var65);
						if (var70 != null) {
							int var71 = var70.field1037 >> 14 & 0x7FFF;
							if (var60 == 2) {
								var70.field1035 = new GXBMUAVX(false, var67, var71, var69, var58, var68, var61 + 4, 2, var66);
								var70.field1036 = new GXBMUAVX(false, var67, var71, var69, var58, var68, var61 + 1 & 0x3, 2, var66);
							} else {
								var70.field1035 = new GXBMUAVX(false, var67, var71, var69, var58, var68, var61, var60, var66);
							}
						}
					}

					if (var62 == 1) {
						DJMBHHYP var72 = field405.method550(var64, var65, field150);
						if (var72 != null) {
							var72.field616 = new GXBMUAVX(false, var67, var72.field617 >> 14 & 0x7FFF, var69, var58, var68, 0, 4, var66);
						}
					}

					if (var62 == 2) {
						GOSPCWDM var73 = field405.method551(var65, field150, var64);

						if (var60 == 11) {
							var60 = 10;
						}

						if (var73 != null) {
							var73.field815 = new GXBMUAVX(false, var67, var73.field823 >> 14 & 0x7FFF, var69, var58, var68, var61, var60, var66);
						}
					}

					if (var62 == 3) {
						NGXGZADY var74 = field405.method552(field150, var64, var65);
						if (var74 != null) {
							var74.field1130 = new GXBMUAVX(false, var67, var74.field1131 >> 14 & 0x7FFF, var69, var58, var68, var61, 22, var66);
						}
					}
				}
			} else {
				if (arg0 == 149) {
					byte var75 = arg1.method329();
					byte var76 = arg1.method328();
					byte var77 = arg1.method328();
					byte var78 = arg1.method329();
					int var79 = arg1.method334();
					int var80 = arg1.method310();
					int var81 = arg1.method335();
					int var82 = arg1.method334();
					int var83 = arg1.method308();
					int var84 = var83 >> 2;
					int var85 = var83 & 0x3;
					int var86 = field100[var84];
					int var87 = arg1.method308();
					int var88 = (var87 >> 4 & 0x7) + field82;
					int var89 = (var87 & 0x7) + field83;
					CXEZIPRQ var90;
					if (field76 == var79) {
						var90 = field435;
					} else {
						var90 = field371[var79];
					}

					if (var90 != null) {
						UVSOAWGE var91 = UVSOAWGE.method501(var82);
						int var92 = field262[field150][var88][var89];
						int var93 = field262[field150][var88 + 1][var89];
						int var94 = field262[field150][var88 + 1][var89 + 1];
						int var95 = field262[field150][var88][var89 + 1];
						DHUPIIUL var96 = var91.method506(var84, var85, var92, var93, var94, var95, -1);
						if (var96 != null) {
							method21(var89, field150, var88, var80 + 1, -1, 0, 0, var81 + 1, var86);
							var90.field484 = field301 + var81;
							var90.field485 = field301 + var80;
							var90.field498 = var96;
							int var97 = var91.field1300;
							int var98 = var91.field1332;
							if (var85 == 1 || var85 == 3) {
								var97 = var91.field1332;
								var98 = var91.field1300;
							}

							var90.field495 = var88 * 128 + var97 * 64;
							var90.field497 = var89 * 128 + var98 * 64;
							var90.field496 = method99(var90.field497, field150, var90.field495);

							if (var78 > var76) {
								byte var99 = var78;
								var78 = var76;
								var76 = var99;
							}

							if (var77 > var75) {
								byte var100 = var77;
								var77 = var75;
								var75 = var100;
							}

							var90.field491 = var78 + var88;
							var90.field493 = var76 + var88;
							var90.field492 = var77 + var89;
							var90.field494 = var75 + var89;
						}
					}
				}

				if (arg0 == 106) {
					int var101 = arg1.method308();
					int var102 = (var101 >> 4 & 0x7) + field82;
					int var103 = (var101 & 0x7) + field83;
					int var104 = arg1.method310();
					int var105 = arg1.method310();
					int var106 = arg1.method310();
					if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
						ROXEPOUC var107 = field346[field150][var102][var103];
						if (var107 != null) {
							for (YPNBIJGC var108 = (YPNBIJGC) var107.method427(); var108 != null; var108 = (YPNBIJGC) var107.method429()) {
								if ((var104 & 0x7FFF) == var108.field1458 && var108.field1457 == var105) {
									var108.field1457 = var106;
									break;
								}
							}

							method107(var102, var103);
						}
					}
				} else if (arg0 == 229) {
					int var109 = arg1.method310();
					int var110 = arg1.method335();
					int var111 = arg1.method334();
					int var112 = arg1.method308();
					int var113 = (var112 >> 4 & 0x7) + field82;
					int var114 = (var112 & 0x7) + field83;
					if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104 && field76 != var109) {
						YPNBIJGC var115 = new YPNBIJGC();
						var115.field1458 = var111;
						var115.field1457 = var110;

						if (field346[field150][var113][var114] == null) {
							field346[field150][var113][var114] = new ROXEPOUC();
						}

						field346[field150][var113][var114].method424(var115);
						method107(var113, var114);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBIIIII)V")
	public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = DHUPIIUL.field607[var7];
			int var13 = DHUPIIUL.field608[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = DHUPIIUL.field607[var8];
			int var16 = DHUPIIUL.field608[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field335 = arg4 - var9;
		field336 = arg5 - var10;
		field337 = arg0 - var11;
		field338 = arg1;
		field339 = arg3;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method142() {
		Graphics var1 = method136().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method255(1);

		if (field228) {
			field449 = false;
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

		if (field132) {
			field449 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field306) {
			field449 = false;
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

	@ObfuscatedName("client.a(ZIIIII)V")
	public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field405.method553(arg4, arg3, arg1);
		if (var6 != 0) {
			int var7 = field405.method557(arg4, arg3, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field205.field1360;
			int var12 = (103 - arg1) * 512 * 4 + arg3 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			UVSOAWGE var14 = UVSOAWGE.method501(var13);
			if (var14.field1336 == -1) {
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
				BKYZHYRW var15 = field467[var14.field1336];
				if (var15 != null) {
					int var16 = (var14.field1300 * 4 - var15.field29) / 2;
					int var17 = (var14.field1332 * 4 - var15.field30) / 2;
					var15.method10((104 - arg1 - var14.field1332) * 4 + var17 + 48, arg3 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field405.method555(arg4, arg3, arg1);
		if (var18 != 0) {
			int var19 = field405.method557(arg4, arg3, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			UVSOAWGE var23 = UVSOAWGE.method501(var22);
			if (var23.field1336 != -1) {
				BKYZHYRW var24 = field467[var23.field1336];
				if (var24 != null) {
					int var25 = (var23.field1300 * 4 - var24.field29) / 2;
					int var26 = (var23.field1332 * 4 - var24.field30) / 2;
					var24.method10((104 - arg1 - var23.field1332) * 4 + var26 + 48, arg3 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field205.field1360;
				int var29 = (103 - arg1) * 512 * 4 + arg3 * 4 + 24624;
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

		int var30 = field405.method556(arg4, arg3, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			UVSOAWGE var32 = UVSOAWGE.method501(var31);
			if (var32.field1336 != -1) {
				BKYZHYRW var33 = field467[var32.field1336];
				if (var33 != null) {
					int var34 = (var32.field1300 * 4 - var33.field29) / 2;
					int var35 = (var32.field1332 * 4 - var33.field30) / 2;
					var33.method10((104 - arg1 - var32.field1332) * 4 + var35 + 48, arg3 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LHPPBIEYV;ZI)I")
	public final int method144(HPPBIEYV arg0, int arg1) {
		if (arg0.field930 == null || arg1 >= arg0.field930.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field930[arg1];
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
					var8 = field292[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field87[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field118[var3[var5++]];
				}

				if (var7 == 4) {
					HPPBIEYV var10 = HPPBIEYV.field925[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < HFWXROSJ.field895 && (!HFWXROSJ.method286(var11).field873 || field157)) {
						for (int var12 = 0; var12 < var10.field931.length; var12++) {
							if (var11 + 1 == var10.field931[var12]) {
								var8 += var10.field937[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field313[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field304[field87[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field313[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field435.field478;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < KYCUJUJI.field1058; var13++) {
						if (KYCUJUJI.field1060[var13]) {
							var8 += field87[var13];
						}
					}
				}

				if (var7 == 10) {
					HPPBIEYV var14 = HPPBIEYV.field925[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < HFWXROSJ.field895 && (!HFWXROSJ.method286(var15).field873 || field157)) {
						for (int var16 = 0; var16 < var14.field931.length; var16++) {
							if (var14.field931[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field211;
				}

				if (var7 == 12) {
					var8 = field111;
				}

				if (var7 == 13) {
					int var17 = field313[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					MWRUKLPF var20 = MWRUKLPF.field1119[var19];
					int var21 = var20.field1121;
					int var22 = var20.field1122;
					int var23 = var20.field1123;
					int var24 = field276[var23 - var22];
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
					var8 = (field435.field781 >> 7) + field126;
				}

				if (var7 == 19) {
					var8 = (field435.field782 >> 7) + field127;
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

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field446.method10(arg1, arg2);
		field447.method10(arg0 + arg1 - 16, arg2);
		RSDCQVXF.method458(16, field249, arg1 + 16, arg2, arg0 - 32);
		int var6 = (arg0 - 32) * arg0 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg4 / (arg3 - arg0);
		RSDCQVXF.method458(16, field311, arg1 + var7 + 16, arg2, var6);
		RSDCQVXF.method463(arg1 + var7 + 16, arg2, field44, var6);
		RSDCQVXF.method463(arg1 + var7 + 16, arg2 + 1, field44, var6);
		RSDCQVXF.method461(16, arg2, arg1 + var7 + 16, field44);
		RSDCQVXF.method461(16, arg2, arg1 + var7 + 17, field44);
		RSDCQVXF.method463(arg1 + var7 + 16, arg2 + 15, field401, var6);
		RSDCQVXF.method463(arg1 + var7 + 17, arg2 + 14, field401, var6 - 1);
		RSDCQVXF.method461(16, arg2, arg1 + var7 + var6 + 15, field401);
		RSDCQVXF.method461(15, arg2 + 1, arg1 + 14 + var7 + var6, field401);
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method146() {
		short var1 = 256;

		if (field450 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field450 > 768) {
					field136[var2] = method85(field137[var2], 1024 - field450, field138[var2]);
				} else if (field450 > 256) {
					field136[var2] = field138[var2];
				} else {
					field136[var2] = method85(field138[var2], 256 - field450, field137[var2]);
				}
			}
		} else if (field451 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field451 > 768) {
					field136[var3] = method85(field137[var3], 1024 - field451, field139[var3]);
				} else if (field451 > 256) {
					field136[var3] = field139[var3];
				} else {
					field136[var3] = method85(field139[var3], 256 - field451, field137[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field136[var4] = field137[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field387.field1061[var5] = field442.field1360[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field172[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field302[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field136[var12];
					int var15 = field387.field1061[var7];
					field387.field1061[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field387.method377(field709, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field388.field1061[var16] = field443.field1360[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field172[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field302[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field136[var23];
					int var26 = field388.field1061[var18];
					field388.field1061[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field388.method377(field709, 637, 0);
	}

	@ObfuscatedName("client.m(B)V")
	public final void method147() {
		field347.method297(217);

		if (field378 != -1) {
			field378 = -1;
			field294 = true;
			field444 = false;
			field56 = true;
		}

		if (field315 != -1) {
			field315 = -1;
			field194 = true;
			field444 = false;
		}

		field135 = -1;
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method148(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field405.method557(field150, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			UVSOAWGE var8 = UVSOAWGE.method501(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1300;
				var10 = var8.field1332;
			} else {
				var9 = var8.field1332;
				var10 = var8.field1300;
			}

			int var11 = var8.field1301;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method73(2, var11, var9, arg0, 0, arg1, false, field435.field772[0], var10, 0, field435.field773[0]);
		} else {
			method73(2, 0, 0, arg0, var6 + 1, arg1, false, field435.field772[0], 0, var7, field435.field773[0]);
		}

		field89 = field724;
		field90 = field725;
		field92 = 2;
		field91 = 0;
		return true;
	}

	@ObfuscatedName("client.a()V")
	public final void method149() {
		method120("Starting up", 20);

		if (signlink.sunjava) {
			field703 = 5;
		}

		if (field312) {
			field306 = true;
		} else {
			field312 = true;
			boolean var1 = false;
			String var2 = method64();
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
						field52[var3] = new JFFVPFLB(500000, signlink.cache_dat, signlink.cache_idx[var3], var3 + 1);
					}
				}

				try {
					method129();
					field452 = method97("title screen", 25, 1, "title", field293[1]);
					field102 = new JLICUWSE("p11_full", false, field452);
					field103 = new JLICUWSE("p12_full", false, field452);
					field104 = new JLICUWSE("b12_full", false, field452);
					field105 = new JLICUWSE("q8_full", true, field452);
					method94();
					method28();
					DYBMLHQM var4 = method97("config", 30, 2, "config", field293[2]);
					DYBMLHQM var5 = method97("interface", 35, 3, "interface", field293[3]);
					DYBMLHQM var6 = method97("2d graphics", 40, 4, "media", field293[4]);
					DYBMLHQM var7 = method97("textures", 45, 6, "textures", field293[6]);
					DYBMLHQM var8 = method97("chat system", 50, 7, "wordenc", field293[7]);
					DYBMLHQM var9 = method97("sound effects", 55, 8, "sounds", field293[8]);
					field142 = new byte[4][104][104];
					field262 = new int[4][105][105];
					field405 = new XRAHVOIV(104, field262, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field423[var10] = new UTWNPFGW(104, 104);
					}

					field205 = new XKULRNBA(512, 512);
					DYBMLHQM var11 = method97("update list", 60, 5, "versionlist", field293[5]);
					method120("Connecting to update server", 60);
					field340 = new CXHZUTUD();
					field340.method170(var11, this);
					BWSGQYNU.method12(field340.method177());
					DHUPIIUL.method188(field340.method186(0), field340);

					if (!field158) {
						field279 = 0;
						try {
							field279 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field280 = true;
						field340.method171(2, field279);

						while (field340.method179() > 0) {
							method60();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field340.field503 > 3) {
								method25("ondemand");
								return;
							}
						}
					}

					method120("Requesting animations", 65);
					int var12 = field340.method186(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field340.method171(1, var13);
					}

					while (field340.method179() > 0) {
						int var14 = var12 - field340.method179();
						if (var14 > 0) {
							method120("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method60();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field340.field503 > 3) {
							method25("ondemand");
							return;
						}
					}

					method120("Requesting models", 70);
					int var15 = field340.method186(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field340.method165(var16);
						if ((var17 & 0x1) != 0) {
							field340.method171(0, var16);
						}
					}

					int var18 = field340.method179();
					while (field340.method179() > 0) {
						int var19 = var18 - field340.method179();
						if (var19 > 0) {
							method120("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method60();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field52[0] != null) {
						method120("Requesting maps", 75);
						field340.method171(3, field340.method169(48, 47, 0));
						field340.method171(3, field340.method169(48, 47, 1));
						field340.method171(3, field340.method169(48, 48, 0));
						field340.method171(3, field340.method169(48, 48, 1));
						field340.method171(3, field340.method169(48, 49, 0));
						field340.method171(3, field340.method169(48, 49, 1));
						field340.method171(3, field340.method169(47, 47, 0));
						field340.method171(3, field340.method169(47, 47, 1));
						field340.method171(3, field340.method169(47, 48, 0));
						field340.method171(3, field340.method169(47, 48, 1));
						field340.method171(3, field340.method169(148, 48, 0));
						field340.method171(3, field340.method169(148, 48, 1));
						int var20 = field340.method179();
						while (field340.method179() > 0) {
							int var21 = var20 - field340.method179();
							if (var21 > 0) {
								method120("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method60();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field340.method186(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field340.method165(var23);
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
							field340.method174(var23, 0, var25);
						}
					}

					field340.method168(field157);

					if (!field158) {
						int var26 = field340.method186(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field340.method184(var27)) {
								field340.method174(var27, 2, (byte) 1);
							}
						}
					}

					method120("Unpacking media", 80);
					field224 = new BKYZHYRW(var6, "invback", 0);
					field226 = new BKYZHYRW(var6, "chatback", 0);
					field225 = new BKYZHYRW(var6, "mapback", 0);
					field199 = new BKYZHYRW(var6, "backbase1", 0);
					field200 = new BKYZHYRW(var6, "backbase2", 0);
					field201 = new BKYZHYRW(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field351[var28] = new BKYZHYRW(var6, "sideicons", var28);
					}

					field368 = new XKULRNBA(var6, "compass", 0);
					field161 = new XKULRNBA(var6, "mapedge", 0);
					field161.method511();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field467[var29] = new BKYZHYRW(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field75[var30] = new XKULRNBA(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field288[var31] = new XKULRNBA(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field329[var32] = new XKULRNBA(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field50 = new XKULRNBA(var6, "mapmarker", 0);
					field51 = new XKULRNBA(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field166[var33] = new XKULRNBA(var6, "cross", var33);
					}

					field257 = new XKULRNBA(var6, "mapdots", 0);
					field258 = new XKULRNBA(var6, "mapdots", 1);
					field259 = new XKULRNBA(var6, "mapdots", 2);
					field260 = new XKULRNBA(var6, "mapdots", 3);
					field261 = new XKULRNBA(var6, "mapdots", 4);
					field446 = new BKYZHYRW(var6, "scrollbar", 0);
					field447 = new BKYZHYRW(var6, "scrollbar", 1);
					field242 = new BKYZHYRW(var6, "redstone1", 0);
					field243 = new BKYZHYRW(var6, "redstone2", 0);
					field244 = new BKYZHYRW(var6, "redstone3", 0);
					field245 = new BKYZHYRW(var6, "redstone1", 0);
					field245.method7();
					field246 = new BKYZHYRW(var6, "redstone2", 0);
					field246.method7();
					field408 = new BKYZHYRW(var6, "redstone1", 0);
					field408.method8();
					field409 = new BKYZHYRW(var6, "redstone2", 0);
					field409.method8();
					field410 = new BKYZHYRW(var6, "redstone3", 0);
					field410.method8();
					field411 = new BKYZHYRW(var6, "redstone1", 0);
					field411.method7();
					field411.method8();
					field412 = new BKYZHYRW(var6, "redstone2", 0);
					field412.method7();
					field412.method8();

					for (int var34 = 0; var34 < 2; var34++) {
						field399[var34] = new BKYZHYRW(var6, "mod_icons", var34);
					}

					XKULRNBA var35 = new XKULRNBA(var6, "backleft1", 0);
					field413 = new LWAVUJVV(var35.field1361, var35.field1362, method136());
					var35.method512(0, 0);
					XKULRNBA var36 = new XKULRNBA(var6, "backleft2", 0);
					field414 = new LWAVUJVV(var36.field1361, var36.field1362, method136());
					var36.method512(0, 0);
					XKULRNBA var37 = new XKULRNBA(var6, "backright1", 0);
					field415 = new LWAVUJVV(var37.field1361, var37.field1362, method136());
					var37.method512(0, 0);
					XKULRNBA var38 = new XKULRNBA(var6, "backright2", 0);
					field416 = new LWAVUJVV(var38.field1361, var38.field1362, method136());
					var38.method512(0, 0);
					XKULRNBA var39 = new XKULRNBA(var6, "backtop1", 0);
					field417 = new LWAVUJVV(var39.field1361, var39.field1362, method136());
					var39.method512(0, 0);
					XKULRNBA var40 = new XKULRNBA(var6, "backvmid1", 0);
					field418 = new LWAVUJVV(var40.field1361, var40.field1362, method136());
					var40.method512(0, 0);
					XKULRNBA var41 = new XKULRNBA(var6, "backvmid2", 0);
					field419 = new LWAVUJVV(var41.field1361, var41.field1362, method136());
					var41.method512(0, 0);
					XKULRNBA var42 = new XKULRNBA(var6, "backvmid3", 0);
					field420 = new LWAVUJVV(var42.field1361, var42.field1362, method136());
					var42.method512(0, 0);
					XKULRNBA var43 = new XKULRNBA(var6, "backhmid2", 0);
					field421 = new LWAVUJVV(var43.field1361, var43.field1362, method136());
					var43.method512(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field75[var48] != null) {
							field75[var48].method510(var45 + var47, var46 + var47, var44 + var47);
						}

						if (field467[var48] != null) {
							field467[var48].method9(var45 + var47, var46 + var47, var44 + var47);
						}
					}

					method120("Unpacking textures", 83);
					DKTEWQXO.method222(var7);
					DKTEWQXO.method226(0.8D);
					DKTEWQXO.method221(20);
					method120("Unpacking config", 86);
					HARRRJHW.method274(var4);
					UVSOAWGE.method504(var4);
					SCDBMUNA.method475(var4);
					HFWXROSJ.method281(var4);
					DOBKXCMM.method238(var4);
					FIQZIGZB.method257(var4);
					YTBPTACV.method580(var4);
					VJTDBWRW.method507(var4);
					MWRUKLPF.method418(var4);
					HFWXROSJ.field865 = field157;

					if (!field158) {
						method120("Unpacking sounds", 90);
						byte[] var49 = var9.method248("sounds.dat", null);
						INLHDAGO var50 = new INLHDAGO(var49);
						FMUEZRNA.method263(var50);
					}

					method120("Unpacking interfaces", 95);
					JLICUWSE[] var51 = new JLICUWSE[] { field102, field103, field104, field105 };
					HPPBIEYV.method291(var5, var51, var6);
					method120("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field225.field27[field225.field29 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field278[var52] = var53;
						field113[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field225.field27[field225.field29 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field264[var56 - 5] = var57 - 25;
						field272[var56 - 5] = var58 - var57;
					}

					DKTEWQXO.method219(479, 96);
					field330 = DKTEWQXO.field630;
					DKTEWQXO.method219(190, 261);
					field331 = DKTEWQXO.field630;
					DKTEWQXO.method219(512, 334);
					field332 = DKTEWQXO.field630;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = DKTEWQXO.field628[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					XRAHVOIV.method563(var60, 800, 500, 334, 512);
					MVRIVVEE.method380(var8);
					field189 = new STZSJMNC(this);
					method113(field189, 10);
					GXBMUAVX.field832 = this;
					UVSOAWGE.field1327 = this;
					DOBKXCMM.field675 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field355 + " " + field234);
					field228 = true;
				}
			} else {
				field132 = true;
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method150() {
		if (field365 > 0) {
			method23();
		} else {
			field298.method376();
			field103.method356(144, 0, "Connection lost", 257);
			field103.method356(143, 0xFFFFFF, "Connection lost", 256);
			field103.method356(159, 0, "Please wait - attempting to reestablish", 257);
			field103.method356(158, 0xFFFFFF, "Please wait - attempting to reestablish", 256);
			field298.method377(field709, 4, 4);
			field265 = 0;
			field203 = 0;
			YZICXNNP var1 = field131;
			field168 = false;
			field223 = 0;
			method47(field344, field345, true);

			if (!field168) {
				method23();
			}

			try {
				var1.method583();
			} catch (Exception var2) {
			}
		}
	}

	public final void run() {
		if (field284) {
			method51();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.o(Z)Z")
	public final boolean method151() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method152() {
		if (field173 != 0) {
			JLICUWSE var1 = field103;
			int var2 = 0;
			if (field266 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field220[var3] != null) {
					int var4 = field218[var3];
					String var5 = field219[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field307 == 0 || field307 == 1 && method106(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method360(var8, 0, "From", var7);
						var1.method360(var8, 0xFFFF, "From", var7 - 1);
						int var11 = var8 + var1.method358("From ");
						if (var6 == 1) {
							field399[0].method10(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field399[1].method10(var7 - 12, var11);
							var11 += 14;
						}

						var1.method360(var11, 0, var5 + ": " + field220[var3], var7);
						var1.method360(var11, 0xFFFF, var5 + ": " + field220[var3], var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field307 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method360(4, 0, field220[var3], var9);
						var1.method360(4, 0xFFFF, field220[var3], var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field307 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method360(4, 0, "To " + var5 + ": " + field220[var3], var10);
						var1.method360(4, 0xFFFF, "To " + var5 + ": " + field220[var3], var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method153() {
		while (true) {
			int var1 = method256();
			if (var1 == -1) {
				return;
			}

			if (field135 != -1 && field277 == field135) {
				if (var1 == 8 && field400.length() > 0) {
					field400 = field400.substring(0, field400.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field400.length() < 12) {
					field400 = field400 + (char) var1;
				}
			} else if (field190) {
				if (var1 >= 32 && var1 <= 122 && field202.length() < 80) {
					field202 = field202 + (char) var1;
					field194 = true;
				}

				if (var1 == 8 && field202.length() > 0) {
					field202 = field202.substring(0, field202.length() - 1);
					field194 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field190 = false;
					field194 = true;

					if (field85 == 1) {
						long var2 = RTZFXINE.method469(field202);
						method103(var2);
					}

					if (field85 == 2 && field80 > 0) {
						long var4 = RTZFXINE.method469(field202);
						method35(var4);
					}

					if (field85 == 3 && field202.length() > 0) {
						field347.method297(59);
						field347.method298(0);
						int var6 = field347.field969;
						field347.method304(field289);
						ENTKOOQW.method250(field347, field202);
						field347.method307(field347.field969 - var6);
						field202 = ENTKOOQW.method251(field202);
						field202 = MVRIVVEE.method390(field202);
						method46(RTZFXINE.method473(RTZFXINE.method470(field289)), 6, field202);

						if (field307 == 2) {
							field307 = 1;
							field191 = true;
							field347.method297(50);
							field347.method298(field424);
							field347.method298(field307);
							field347.method298(field186);
						}
					}

					if (field85 == 4 && field325 < 100) {
						long var7 = RTZFXINE.method469(field202);
						method67(var7);
					}

					if (field85 == 5 && field325 > 0) {
						long var9 = RTZFXINE.method469(field202);
						method56(var9);
					}
				}
			} else if (field454) {
				if (var1 >= 48 && var1 <= 57 && field342.length() < 10) {
					field342 = field342 + (char) var1;
					field194 = true;
				}

				if (var1 == 8 && field342.length() > 0) {
					field342 = field342.substring(0, field342.length() - 1);
					field194 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field342.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field342);
						} catch (Exception var19) {
						}

						field347.method297(212);
						field347.method302(var11);
					}

					field454 = false;
					field194 = true;
				}
			} else if (field315 == -1) {
				if (var1 >= 32 && var1 <= 122 && field79.length() < 80) {
					field79 = field79 + (char) var1;
					field194 = true;
				}

				if (var1 == 8 && field79.length() > 0) {
					field79 = field79.substring(0, field79.length() - 1);
					field194 = true;
				}

				if ((var1 == 13 || var1 == 10) && field79.length() > 0) {
					if (field195 == 2) {
						if (field79.equals("::clientdrop")) {
							method150();
						}

						if (field79.equals("::lag")) {
							method135();
						}

						if (field79.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field340.method186(2); var12++) {
								field340.method174(var12, 2, (byte) 1);
							}
						}

						if (field79.equals("::fpson")) {
							field255 = true;
						}

						if (field79.equals("::fpsoff")) {
							field255 = false;
						}

						if (field79.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								field423[var13].method484();
							}
						}
					}

					if (field79.startsWith("::")) {
						field347.method297(149);
						field347.method298(field79.length() - 1);
						field347.method305(field79.substring(2));
					} else {
						String var14 = field79.toLowerCase();
						byte var15 = 0;
						if (var14.startsWith("yellow:")) {
							var15 = 0;
							field79 = field79.substring(7);
						} else if (var14.startsWith("red:")) {
							var15 = 1;
							field79 = field79.substring(4);
						} else if (var14.startsWith("green:")) {
							var15 = 2;
							field79 = field79.substring(6);
						} else if (var14.startsWith("cyan:")) {
							var15 = 3;
							field79 = field79.substring(5);
						} else if (var14.startsWith("purple:")) {
							var15 = 4;
							field79 = field79.substring(7);
						} else if (var14.startsWith("white:")) {
							var15 = 5;
							field79 = field79.substring(6);
						} else if (var14.startsWith("flash1:")) {
							var15 = 6;
							field79 = field79.substring(7);
						} else if (var14.startsWith("flash2:")) {
							var15 = 7;
							field79 = field79.substring(7);
						} else if (var14.startsWith("flash3:")) {
							var15 = 8;
							field79 = field79.substring(7);
						} else if (var14.startsWith("glow1:")) {
							var15 = 9;
							field79 = field79.substring(6);
						} else if (var14.startsWith("glow2:")) {
							var15 = 10;
							field79 = field79.substring(6);
						} else if (var14.startsWith("glow3:")) {
							var15 = 11;
							field79 = field79.substring(6);
						}

						String var16 = field79.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("wave:")) {
							var17 = 1;
							field79 = field79.substring(5);
						} else if (var16.startsWith("wave2:")) {
							var17 = 2;
							field79 = field79.substring(6);
						} else if (var16.startsWith("shake:")) {
							var17 = 3;
							field79 = field79.substring(6);
						} else if (var16.startsWith("scroll:")) {
							var17 = 4;
							field79 = field79.substring(7);
						} else if (var16.startsWith("slide:")) {
							var17 = 5;
							field79 = field79.substring(6);
						}

						field347.method297(211);
						field347.method298(0);
						int var18 = field347.field969;
						field268.field969 = 0;
						ENTKOOQW.method250(field268, field79);
						field347.method340(field268.field969, 0, field268.field968);
						field347.method324(var17);
						field347.method324(var15);
						field347.method307(field347.field969 - var18);
						field79 = ENTKOOQW.method251(field79);
						field79 = MVRIVVEE.method390(field79);
						field435.field759 = field79;
						field435.field780 = var15;
						field435.field799 = var17;
						field435.field778 = 150;

						if (field195 == 2) {
							method46("@cr2@" + field435.field474, 2, field435.field759);
						} else if (field195 == 1) {
							method46("@cr1@" + field435.field474, 2, field435.field759);
						} else {
							method46(field435.field474, 2, field435.field759);
						}

						if (field424 == 2) {
							field424 = 3;
							field191 = true;
							field347.method297(50);
							field347.method298(field424);
							field347.method298(field307);
							field347.method298(field186);
						}
					}

					field79 = "";
					field194 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LINLHDAGO;IILCXEZIPRQ;I)V")
	public final void method154(INLHDAGO arg0, int arg1, CXEZIPRQ arg2, int arg3) {
		if ((arg3 & 0x100) != 0) {
			int var5 = arg0.method327();
			int var6 = arg0.method308();
			arg2.method270(var5, field301, var6);
			arg2.field784 = field301 + 300;
			arg2.field785 = arg0.method325();
			arg2.field786 = arg0.method327();
		}

		if ((arg3 & 0x200) != 0) {
			arg2.field765 = arg0.method326();
			arg2.field767 = arg0.method326();
			arg2.field766 = arg0.method326();
			arg2.field768 = arg0.method326();
			arg2.field769 = arg0.method333() + field301;
			arg2.field770 = arg0.method310() + field301;
			arg2.field771 = arg0.method326();
			arg2.method269();
		}

		if ((arg3 & 0x400) != 0) {
			arg2.field800 = arg0.method334();
			int var7 = arg0.method313();
			arg2.field804 = var7 >> 16;
			arg2.field803 = (var7 & 0xFFFF) + field301;
			arg2.field801 = 0;
			arg2.field802 = 0;

			if (arg2.field803 > field301) {
				arg2.field801 = -1;
			}

			if (arg2.field800 == 0xFFFF) {
				arg2.field800 = -1;
			}
		}

		if ((arg3 & 0x8) != 0) {
			int var8 = arg0.method333();
			int var9 = arg0.method327();
			int var10 = arg0.method327();
			int var11 = arg0.field969;

			if (arg2.field474 != null && arg2.field487) {
				long var12 = RTZFXINE.method469(arg2.field474);
				boolean var14 = false;
				if (var9 <= 1) {
					for (int var15 = 0; var15 < field325; var15++) {
						if (field407[var15] == var12) {
							var14 = true;
							break;
						}
					}
				}

				if (!var14 && field165 == 0) {
					try {
						field268.field969 = 0;
						arg0.method341(0, var10, field268.field968);
						field268.field969 = 0;
						String var16 = ENTKOOQW.method249(field268, var10);
						var16 = MVRIVVEE.method390(var16);
						arg2.field759 = var16;
						arg2.field780 = var8 >> 8;
						arg2.field799 = var8 & 0xFF;
						arg2.field778 = 150;

						if (var9 == 2 || var9 == 3) {
							method46("@cr2@" + arg2.field474, 1, var16);
						} else if (var9 == 1) {
							method46("@cr1@" + arg2.field474, 1, var16);
						} else {
							method46(arg2.field474, 2, var16);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field969 = var10 + var11;
		}

		if ((arg3 & 0x80) != 0) {
			arg2.field809 = arg0.method334();
			arg2.field810 = arg0.method333();
		}

		if ((arg3 & 0x10) != 0) {
			int var18 = arg0.method327();
			int var19 = arg0.method326();
			arg2.method270(var18, field301, var19);
			arg2.field784 = field301 + 300;
			arg2.field785 = arg0.method327();
			arg2.field786 = arg0.method325();
		}

		if ((arg3 & 0x4) != 0) {
			arg2.field759 = arg0.method315();
			if (arg2.field759.charAt(0) == '~') {
				arg2.field759 = arg2.field759.substring(1);
				method46(arg2.field474, 2, arg2.field759);
			} else if (field435 == arg2) {
				method46(arg2.field474, 2, arg2.field759);
			}

			arg2.field780 = 0;
			arg2.field799 = 0;
			arg2.field778 = 150;
		}

		if ((arg3 & 0x40) != 0) {
			arg2.field807 = arg0.method333();
			if (arg2.field807 == 0xFFFF) {
				arg2.field807 = -1;
			}
		}

		if ((arg3 & 0x2) != 0) {
			int var20 = arg0.method334();
			if (var20 == 0xFFFF) {
				var20 = -1;
			}

			int var21 = arg0.method325();
			if (arg2.field794 == var20 && var20 != -1) {
				int var22 = HARRRJHW.field840[var20].field854;
				if (var22 == 1) {
					arg2.field795 = 0;
					arg2.field796 = 0;
					arg2.field797 = var21;
					arg2.field798 = 0;
				}

				if (var22 == 2) {
					arg2.field798 = 0;
				}
			} else if (var20 == -1 || arg2.field794 == -1 || HARRRJHW.field840[var20].field848 >= HARRRJHW.field840[arg2.field794].field848) {
				arg2.field794 = var20;
				arg2.field795 = 0;
				arg2.field796 = 0;
				arg2.field797 = var21;
				arg2.field798 = 0;
				arg2.field764 = arg2.field777;
			}
		}

		if ((arg3 & 0x20) != 0) {
			int var23 = arg0.method308();
			byte[] var24 = new byte[var23];
			INLHDAGO var25 = new INLHDAGO(var24);
			arg0.method342(var24, 0, var23);
			field376[arg1] = var25;
			arg2.method163(var25);
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public static final void method155() {
		XRAHVOIV.field1392 = true;
		DKTEWQXO.field619 = true;
		field158 = true;
		RRREBNUU.field1168 = true;
		UVSOAWGE.field1305 = true;
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method156(int arg0) {
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

	@ObfuscatedName("client.n(B)V")
	public final void method157() {
		if (field265 == 0 && field723 == 1) {
			int var1 = field724 - 25 - 550;
			int var2 = field725 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field46 + field197 & 0x7FF;
				int var4 = DKTEWQXO.field628[var3];
				int var5 = DKTEWQXO.field629[var3];
				var4 = (field358 + 256) * var4 >> 8;
				var5 = (field358 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field435.field781 + var6 >> 7;
				int var9 = field435.field782 - var7 >> 7;
				boolean var10 = method73(1, 0, 0, var8, 0, var9, true, field435.field772[0], 0, 0, field435.field773[0]);
				if (var10) {
					field347.method298(var1);
					field347.method298(var2);
					field347.method299(field46);
					field347.method298(57);
					field347.method298(field197);
					field347.method298(field358);
					field347.method298(89);
					field347.method299(field435.field781);
					field347.method299(field435.field782);
					field347.method298(field53);
					field347.method298(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method158() {
		for (int var1 = -1; var1 < field372; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field370;
			} else {
				var2 = field373[var1];
			}

			CXEZIPRQ var3 = field371[var2];
			if (var3 != null) {
				method76(1, var3);
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field276[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field304[var3] = var2 / 4;
		}
	}
}
