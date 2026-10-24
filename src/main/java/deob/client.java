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
public final class client extends SXKUAOFD {

	@ObfuscatedName("client.L")
	public int field101 = 50;

	@ObfuscatedName("client.M")
	public int[] field102 = new int[field101];

	@ObfuscatedName("client.N")
	public int[] field103 = new int[field101];

	@ObfuscatedName("client.O")
	public int[] field104 = new int[field101];

	@ObfuscatedName("client.P")
	public int[] field105 = new int[field101];

	@ObfuscatedName("client.Q")
	public int[] field106 = new int[field101];

	@ObfuscatedName("client.R")
	public int[] field107 = new int[field101];

	@ObfuscatedName("client.S")
	public int[] field108 = new int[field101];

	@ObfuscatedName("client.T")
	public String[] field109 = new String[field101];

	@ObfuscatedName("client.U")
	public boolean field110 = false;

	@ObfuscatedName("client.Z")
	public int field114 = 0x332D25;

	@ObfuscatedName("client.ab")
	public int[] field115 = new int[500];

	@ObfuscatedName("client.bb")
	public int[] field116 = new int[500];

	@ObfuscatedName("client.cb")
	public int[] field117 = new int[500];

	@ObfuscatedName("client.db")
	public int[] field118 = new int[500];

	@ObfuscatedName("client.fb")
	public RAOZRSKX[] field119 = new RAOZRSKX[2];

	@ObfuscatedName("client.hb")
	public boolean field120 = false;

	@ObfuscatedName("client.ib")
	public int field121 = -1;

	@ObfuscatedName("client.kb")
	public int[] field123 = new int[151];

	@ObfuscatedName("client.lb")
	public long[] field124 = new long[200];

	@ObfuscatedName("client.nb")
	public String field126 = "";

	@ObfuscatedName("client.ub")
	public int[] field133 = new int[50];

	@ObfuscatedName("client.zb")
	public int field137 = 2;

	@ObfuscatedName("client.Ab")
	public String[] field138 = new String[200];

	@ObfuscatedName("client.Nb")
	public RUPQNTVM[] field151 = new RUPQNTVM[4];

	@ObfuscatedName("client.Ob")
	public ZXKMWHPZ field152 = new ZXKMWHPZ();

	@ObfuscatedName("client.Pb")
	public ZXKMWHPZ field153 = new ZXKMWHPZ();

	@ObfuscatedName("client.Rb")
	public volatile boolean field154 = false;

	@ObfuscatedName("client.Sb")
	public String field155 = "";

	@ObfuscatedName("client.Wb")
	public boolean field157 = false;

	@ObfuscatedName("client.ac")
	public int field161 = -1;

	@ObfuscatedName("client.bc")
	public boolean field162 = false;

	@ObfuscatedName("client.sc")
	public NDGQUJMA[] field178 = new NDGQUJMA[8];

	@ObfuscatedName("client.uc")
	public boolean field180 = false;

	@ObfuscatedName("client.Kc")
	public int field193 = 2;

	@ObfuscatedName("client.Mc")
	public int[] field195 = new int[200];

	@ObfuscatedName("client.Nc")
	public long[] field196 = new long[100];

	@ObfuscatedName("client.Oc")
	public boolean field197 = false;

	@ObfuscatedName("client.Tc")
	public String field202 = "";

	@ObfuscatedName("client.Vc")
	public ZXKMWHPZ field204 = new ZXKMWHPZ();

	@ObfuscatedName("client.Xc")
	public int[] field205 = new int[33];

	@ObfuscatedName("client.Yc")
	public boolean field206 = false;

	@ObfuscatedName("client.bd")
	public int[] field207 = new int[2000];

	@ObfuscatedName("client.cd")
	public final int field208 = 100;

	@ObfuscatedName("client.dd")
	public int[] field209 = new int[100];

	@ObfuscatedName("client.nd")
	public boolean field218 = false;

	@ObfuscatedName("client.qd")
	public boolean field221 = true;

	@ObfuscatedName("client.td")
	public int[] field223 = new int[33];

	@ObfuscatedName("client.Ad")
	public FMDWWBSX field227 = new FMDWWBSX();

	@ObfuscatedName("client.Cd")
	public boolean field229 = false;

	@ObfuscatedName("client.Dd")
	public int[] field230 = new int[9];

	@ObfuscatedName("client.Od")
	public boolean field239 = false;

	@ObfuscatedName("client.be")
	public String field252 = "";

	@ObfuscatedName("client.de")
	public String[] field254 = new String[100];

	@ObfuscatedName("client.ee")
	public int[] field255 = new int[100];

	@ObfuscatedName("client.ge")
	public boolean field257 = false;

	@ObfuscatedName("client.je")
	public int field259 = -1;

	@ObfuscatedName("client.le")
	public boolean field261 = false;

	@ObfuscatedName("client.me")
	public String field262 = "";

	@ObfuscatedName("client.ne")
	public String field263 = "";

	@ObfuscatedName("client.we")
	public int field272 = -1;

	@ObfuscatedName("client.ye")
	public int field273 = 2048;

	@ObfuscatedName("client.ze")
	public int field274 = 2047;

	@ObfuscatedName("client.Ae")
	public IOPHRJNF[] field275 = new IOPHRJNF[field273];

	@ObfuscatedName("client.Ce")
	public int[] field277 = new int[field273];

	@ObfuscatedName("client.Ee")
	public int[] field279 = new int[field273];

	@ObfuscatedName("client.Fe")
	public BFQIDHPO[] field280 = new BFQIDHPO[field273];

	@ObfuscatedName("client.Ge")
	public boolean field281 = false;

	@ObfuscatedName("client.He")
	public int[][][] field282 = new int[4][13][13];

	@ObfuscatedName("client.Qe")
	public int field290 = 0x766654;

	@ObfuscatedName("client.Ve")
	public boolean[] field295 = new boolean[5];

	@ObfuscatedName("client.bf")
	public boolean field301 = false;

	@ObfuscatedName("client.ef")
	public int[][] field304 = new int[104][104];

	@ObfuscatedName("client.lf")
	public int[] field310 = new int[50];

	@ObfuscatedName("client.sf")
	public int[] field317 = new int[256];

	@ObfuscatedName("client.tf")
	public BFQIDHPO field318 = BFQIDHPO.method42(1);

	@ObfuscatedName("client.uf")
	public int field319 = -1;

	@ObfuscatedName("client.xf")
	public int[] field322 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.yf")
	public int field323 = -1;

	@ObfuscatedName("client.Af")
	public boolean field325 = false;

	@ObfuscatedName("client.Ef")
	public NDGQUJMA[] field328 = new NDGQUJMA[32];

	@ObfuscatedName("client.Ff")
	public String field329 = "";

	@ObfuscatedName("client.Gf")
	public String field330 = "";

	@ObfuscatedName("client.If")
	public int[] field331 = new int[4000];

	@ObfuscatedName("client.Jf")
	public int[] field332 = new int[4000];

	@ObfuscatedName("client.Of")
	public boolean field336 = false;

	@ObfuscatedName("client.Qf")
	public int[] field338 = new int[1000];

	@ObfuscatedName("client.Rf")
	public int[] field339 = new int[1000];

	@ObfuscatedName("client.Sf")
	public volatile boolean field340 = false;

	@ObfuscatedName("client.Tf")
	public int[] field341 = new int[JJRWUNEJ.field870];

	@ObfuscatedName("client.Uf")
	public int field342 = 3;

	@ObfuscatedName("client.Vf")
	public final int[] field343 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Xf")
	public String[] field344 = new String[500];

	@ObfuscatedName("client.Yf")
	public int[] field345 = new int[151];

	@ObfuscatedName("client.Zf")
	public int field346 = 0x23201B;

	@ObfuscatedName("client.bg")
	public int[] field347 = new int[JJRWUNEJ.field870];

	@ObfuscatedName("client.dg")
	public int field349 = -1;

	@ObfuscatedName("client.kg")
	public boolean field355 = true;

	@ObfuscatedName("client.og")
	public String[] field358 = new String[5];

	@ObfuscatedName("client.pg")
	public boolean[] field359 = new boolean[5];

	@ObfuscatedName("client.qg")
	public boolean field360 = false;

	@ObfuscatedName("client.xg")
	public CRC32 field366 = new CRC32();

	@ObfuscatedName("client.Cg")
	public int field369 = -1;

	@ObfuscatedName("client.Eg")
	public int field371 = 2;

	@ObfuscatedName("client.Fg")
	public int field372 = 128;

	@ObfuscatedName("client.Kg")
	public int[] field376 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Lg")
	public int[] field377 = new int[5];

	@ObfuscatedName("client.Qg")
	public int[] field379 = new int[JJRWUNEJ.field870];

	@ObfuscatedName("client.Rg")
	public int[] field380 = new int[5];

	@ObfuscatedName("client.Ug")
	public BFQIDHPO field382 = BFQIDHPO.method42(1);

	@ObfuscatedName("client.Vg")
	public int field383 = -1;

	@ObfuscatedName("client.Xg")
	public int field385 = 78;

	@ObfuscatedName("client.ch")
	public int[][] field390 = new int[104][104];

	@ObfuscatedName("client.gh")
	public int[][] field394 = new int[104][104];

	@ObfuscatedName("client.kh")
	public BFQIDHPO field397 = BFQIDHPO.method42(1);

	@ObfuscatedName("client.lh")
	public int[] field398 = new int[5];

	@ObfuscatedName("client.mh")
	public boolean field399 = false;

	@ObfuscatedName("client.nh")
	public String field400 = "";

	@ObfuscatedName("client.oh")
	public BFQIDHPO field401 = new BFQIDHPO(new byte[5000]);

	@ObfuscatedName("client.ph")
	public BFCMZACY[] field402 = new BFCMZACY[16384];

	@ObfuscatedName("client.rh")
	public int[] field404 = new int[16384];

	@ObfuscatedName("client.sh")
	public int[] field405 = new int[5];

	@ObfuscatedName("client.Fh")
	public int[] field418 = new int[5];

	@ObfuscatedName("client.Gh")
	public int field419 = -1;

	@ObfuscatedName("client.Hh")
	public byte[] field420 = new byte[16384];

	@ObfuscatedName("client.Nh")
	public RAOZRSKX[] field425 = new RAOZRSKX[13];

	@ObfuscatedName("client.Qh")
	public boolean field428 = false;

	@ObfuscatedName("client.Wh")
	public boolean field434 = true;

	@ObfuscatedName("client.Xh")
	public NDGQUJMA[] field435 = new NDGQUJMA[1000];

	@ObfuscatedName("client.ai")
	public boolean field438 = true;

	@ObfuscatedName("client.ci")
	public NDGQUJMA[] field440 = new NDGQUJMA[32];

	@ObfuscatedName("client.di")
	public ZXKMWHPZ[][][] field441 = new ZXKMWHPZ[4][104][104];

	@ObfuscatedName("client.ni")
	public int field450 = -1;

	@ObfuscatedName("client.ui")
	public boolean field457 = true;

	@ObfuscatedName("client.zi")
	public int field461 = 1;

	@ObfuscatedName("client.Ji")
	public int field470 = -1;

	@ObfuscatedName("client.Ki")
	public int field471 = -1;

	@ObfuscatedName("client.Mi")
	public int[] field473 = new int[1000];

	@ObfuscatedName("client.Oi")
	public String field475 = "";

	@ObfuscatedName("client.Si")
	public RAOZRSKX[] field479 = new RAOZRSKX[100];

	@ObfuscatedName("client.Wi")
	public int field483 = 0x4D4233;

	@ObfuscatedName("client.Xi")
	public volatile boolean field484 = false;

	@ObfuscatedName("client.dj")
	public boolean field490 = false;

	@ObfuscatedName("client.fj")
	public int field492 = 1;

	@ObfuscatedName("client.gj")
	public int[] field493 = new int[2000];

	@ObfuscatedName("client.nj")
	public boolean field497 = false;

	@ObfuscatedName("client.yj")
	public int field506 = -1;

	@ObfuscatedName("client.Cj")
	public boolean field510 = false;

	@ObfuscatedName("client.Dj")
	public int[] field511 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Kj")
	public NDGQUJMA[] field518 = new NDGQUJMA[100];

	@ObfuscatedName("client.Mj")
	public int field519 = -1;

	@ObfuscatedName("client.Rj")
	public VXBCLRCG[] field522 = new VXBCLRCG[5];

	@ObfuscatedName("client.Sj")
	public int[] field523 = new int[100];

	@ObfuscatedName("client.Tj")
	public String[] field524 = new String[100];

	@ObfuscatedName("client.Uj")
	public String[] field525 = new String[100];

	@ObfuscatedName("client.Wj")
	public int[] field526 = new int[7];

	@ObfuscatedName("client.Yj")
	public NDGQUJMA[] field527 = new NDGQUJMA[20];

	@ObfuscatedName("client.ik")
	public int[] field537 = new int[50];

	@ObfuscatedName("client.jk")
	public int field538 = -1;

	@ObfuscatedName("client.lk")
	public NDGQUJMA[] field540 = new NDGQUJMA[32];

	@ObfuscatedName("client.zc")
	public static BigInteger field184 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Bc")
	public static String field186 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Rc")
	public static BigInteger field200 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.zd")
	public static int[] field226 = new int[32];

	@ObfuscatedName("client.Hd")
	public static final int[] field233 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Le")
	public static int field285 = 10;

	@ObfuscatedName("client.Ne")
	public static boolean field287 = true;

	@ObfuscatedName("client.wj")
	public static final int[][] field505 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.hk")
	public static int[] field536 = new int[99];

	@ObfuscatedName("client.K")
	public int field100;

	@ObfuscatedName("client.V")
	public static int field111;

	@ObfuscatedName("client.W")
	public int field112;

	@ObfuscatedName("client.jb")
	public int field122;

	@ObfuscatedName("client.mb")
	public static int field125;

	@ObfuscatedName("client.ob")
	public int field127;

	@ObfuscatedName("client.pb")
	public int field128;

	@ObfuscatedName("client.qb")
	public int field129;

	@ObfuscatedName("client.vb")
	public int field134;

	@ObfuscatedName("client.wb")
	public int field135;

	@ObfuscatedName("client.yb")
	public int field136;

	@ObfuscatedName("client.Kb")
	public int field148;

	@ObfuscatedName("client.Lb")
	public int field149;

	@ObfuscatedName("client.Mb")
	public int field150;

	@ObfuscatedName("client.Xb")
	public int field158;

	@ObfuscatedName("client.Yb")
	public int field159;

	@ObfuscatedName("client.Zb")
	public int field160;

	@ObfuscatedName("client.cc")
	public int field163;

	@ObfuscatedName("client.dc")
	public int field164;

	@ObfuscatedName("client.ec")
	public int field165;

	@ObfuscatedName("client.fc")
	public int field166;

	@ObfuscatedName("client.gc")
	public int field167;

	@ObfuscatedName("client.ic")
	public int field168;

	@ObfuscatedName("client.jc")
	public static int field169;

	@ObfuscatedName("client.pc")
	public int field175;

	@ObfuscatedName("client.qc")
	public int field176;

	@ObfuscatedName("client.vc")
	public int field181;

	@ObfuscatedName("client.wc")
	public int field182;

	@ObfuscatedName("client.xc")
	public int field183;

	@ObfuscatedName("client.Ac")
	public int field185;

	@ObfuscatedName("client.Jc")
	public int field192;

	@ObfuscatedName("client.Lc")
	public int field194;

	@ObfuscatedName("client.Pc")
	public int field198;

	@ObfuscatedName("client.Qc")
	public int field199;

	@ObfuscatedName("client.Sc")
	public int field201;

	@ObfuscatedName("client.Uc")
	public int field203;

	@ObfuscatedName("client.ed")
	public int field210;

	@ObfuscatedName("client.fd")
	public int field211;

	@ObfuscatedName("client.gd")
	public int field212;

	@ObfuscatedName("client.hd")
	public int field213;

	@ObfuscatedName("client.id")
	public int field214;

	@ObfuscatedName("client.ld")
	public int field216;

	@ObfuscatedName("client.md")
	public static int field217;

	@ObfuscatedName("client.od")
	public int field219;

	@ObfuscatedName("client.pd")
	public int field220;

	@ObfuscatedName("client.rd")
	public int field222;

	@ObfuscatedName("client.Bd")
	public int field228;

	@ObfuscatedName("client.Fd")
	public int field232;

	@ObfuscatedName("client.Pd")
	public int field240;

	@ObfuscatedName("client.Ud")
	public int field245;

	@ObfuscatedName("client.Vd")
	public int field246;

	@ObfuscatedName("client.Wd")
	public int field247;

	@ObfuscatedName("client.Xd")
	public int field248;

	@ObfuscatedName("client.Yd")
	public int field249;

	@ObfuscatedName("client.Zd")
	public int field250;

	@ObfuscatedName("client.ae")
	public int field251;

	@ObfuscatedName("client.ce")
	public int field253;

	@ObfuscatedName("client.fe")
	public int field256;

	@ObfuscatedName("client.ke")
	public int field260;

	@ObfuscatedName("client.Be")
	public int field276;

	@ObfuscatedName("client.De")
	public int field278;

	@ObfuscatedName("client.Ie")
	public static int field283;

	@ObfuscatedName("client.Ke")
	public int field284;

	@ObfuscatedName("client.Me")
	public static int field286;

	@ObfuscatedName("client.Pe")
	public static int field289;

	@ObfuscatedName("client.Re")
	public int field291;

	@ObfuscatedName("client.Se")
	public int field292;

	@ObfuscatedName("client.Te")
	public int field293;

	@ObfuscatedName("client.Ue")
	public int field294;

	@ObfuscatedName("client.We")
	public static int field296;

	@ObfuscatedName("client.Ye")
	public int field298;

	@ObfuscatedName("client.Ze")
	public int field299;

	@ObfuscatedName("client.af")
	public int field300;

	@ObfuscatedName("client.ff")
	public int field305;

	@ObfuscatedName("client.gf")
	public int field306;

	@ObfuscatedName("client.hf")
	public int field307;

	@ObfuscatedName("client.jf")
	public int field308;

	@ObfuscatedName("client.kf")
	public int field309;

	@ObfuscatedName("client.mf")
	public static int field311;

	@ObfuscatedName("client.rf")
	public int field316;

	@ObfuscatedName("client.zf")
	public int field324;

	@ObfuscatedName("client.Cf")
	public static int field326;

	@ObfuscatedName("client.Lf")
	public int field333;

	@ObfuscatedName("client.Mf")
	public int field334;

	@ObfuscatedName("client.Pf")
	public int field337;

	@ObfuscatedName("client.cg")
	public int field348;

	@ObfuscatedName("client.fg")
	public int field350;

	@ObfuscatedName("client.gg")
	public int field351;

	@ObfuscatedName("client.hg")
	public int field352;

	@ObfuscatedName("client.ig")
	public int field353;

	@ObfuscatedName("client.jg")
	public int field354;

	@ObfuscatedName("client.sg")
	public int field361;

	@ObfuscatedName("client.tg")
	public int field362;

	@ObfuscatedName("client.ug")
	public int field363;

	@ObfuscatedName("client.vg")
	public int field364;

	@ObfuscatedName("client.wg")
	public int field365;

	@ObfuscatedName("client.yg")
	public int field367;

	@ObfuscatedName("client.Bg")
	public int field368;

	@ObfuscatedName("client.Dg")
	public int field370;

	@ObfuscatedName("client.Gg")
	public int field373;

	@ObfuscatedName("client.Hg")
	public int field374;

	@ObfuscatedName("client.Ig")
	public int field375;

	@ObfuscatedName("client.Og")
	public int field378;

	@ObfuscatedName("client.Sg")
	public static int field381;

	@ObfuscatedName("client.dh")
	public int field391;

	@ObfuscatedName("client.eh")
	public int field392;

	@ObfuscatedName("client.fh")
	public int field393;

	@ObfuscatedName("client.jh")
	public int field396;

	@ObfuscatedName("client.qh")
	public int field403;

	@ObfuscatedName("client.uh")
	public int field407;

	@ObfuscatedName("client.Eh")
	public int field417;

	@ObfuscatedName("client.Ih")
	public int field421;

	@ObfuscatedName("client.Jh")
	public int field422;

	@ObfuscatedName("client.Kh")
	public int field423;

	@ObfuscatedName("client.Lh")
	public int field424;

	@ObfuscatedName("client.Oh")
	public int field426;

	@ObfuscatedName("client.Rh")
	public int field429;

	@ObfuscatedName("client.Sh")
	public int field430;

	@ObfuscatedName("client.Th")
	public int field431;

	@ObfuscatedName("client.Uh")
	public int field432;

	@ObfuscatedName("client.Yh")
	public int field436;

	@ObfuscatedName("client.bi")
	public int field439;

	@ObfuscatedName("client.ei")
	public int field442;

	@ObfuscatedName("client.fi")
	public int field443;

	@ObfuscatedName("client.ii")
	public int field446;

	@ObfuscatedName("client.ji")
	public int field447;

	@ObfuscatedName("client.ki")
	public int field448;

	@ObfuscatedName("client.li")
	public int field449;

	@ObfuscatedName("client.oi")
	public int field451;

	@ObfuscatedName("client.pi")
	public int field452;

	@ObfuscatedName("client.qi")
	public int field453;

	@ObfuscatedName("client.ri")
	public int field454;

	@ObfuscatedName("client.si")
	public int field455;

	@ObfuscatedName("client.ti")
	public int field456;

	@ObfuscatedName("client.xi")
	public static int field459;

	@ObfuscatedName("client.yi")
	public int field460;

	@ObfuscatedName("client.Gi")
	public int field468;

	@ObfuscatedName("client.Hi")
	public static int field469;

	@ObfuscatedName("client.Li")
	public int field472;

	@ObfuscatedName("client.Pi")
	public int field476;

	@ObfuscatedName("client.Qi")
	public int field477;

	@ObfuscatedName("client.Ri")
	public int field478;

	@ObfuscatedName("client.Ti")
	public int field480;

	@ObfuscatedName("client.Ui")
	public int field481;

	@ObfuscatedName("client.Vi")
	public int field482;

	@ObfuscatedName("client.Yi")
	public int field485;

	@ObfuscatedName("client.Zi")
	public static int field486;

	@ObfuscatedName("client.cj")
	public int field489;

	@ObfuscatedName("client.ej")
	public int field491;

	@ObfuscatedName("client.jj")
	public int field494;

	@ObfuscatedName("client.kj")
	public int field495;

	@ObfuscatedName("client.lj")
	public int field496;

	@ObfuscatedName("client.pj")
	public int field498;

	@ObfuscatedName("client.qj")
	public int field499;

	@ObfuscatedName("client.rj")
	public int field500;

	@ObfuscatedName("client.vj")
	public int field504;

	@ObfuscatedName("client.Fj")
	public static int field513;

	@ObfuscatedName("client.Jj")
	public int field517;

	@ObfuscatedName("client.Oj")
	public int field520;

	@ObfuscatedName("client.Qj")
	public static int field521;

	@ObfuscatedName("client.bk")
	public int field530;

	@ObfuscatedName("client.ck")
	public int field531;

	@ObfuscatedName("client.dk")
	public int field532;

	@ObfuscatedName("client.ek")
	public int field533;

	@ObfuscatedName("client.fk")
	public int field534;

	@ObfuscatedName("client.gk")
	public int field535;

	@ObfuscatedName("client.kk")
	public int field539;

	@ObfuscatedName("client.mk")
	public int field541;

	@ObfuscatedName("client.Xe")
	public long field297;

	@ObfuscatedName("client.ih")
	public long field395;

	@ObfuscatedName("client.wi")
	public long field458;

	@ObfuscatedName("client.Fi")
	public long field467;

	@ObfuscatedName("client.bj")
	public long field488;

	@ObfuscatedName("client.Qd")
	public BKBLJVKV field241;

	@ObfuscatedName("client.Rd")
	public BKBLJVKV field242;

	@ObfuscatedName("client.Sd")
	public BKBLJVKV field243;

	@ObfuscatedName("client.Td")
	public BKBLJVKV field244;

	@ObfuscatedName("client.Ni")
	public BPHGILGU field474;

	@ObfuscatedName("client.Ej")
	public static IOPHRJNF field512;

	@ObfuscatedName("client.jd")
	public NDGQUJMA field215;

	@ObfuscatedName("client.Jd")
	public NDGQUJMA field234;

	@ObfuscatedName("client.Kd")
	public NDGQUJMA field235;

	@ObfuscatedName("client.Ld")
	public NDGQUJMA field236;

	@ObfuscatedName("client.Md")
	public NDGQUJMA field237;

	@ObfuscatedName("client.Nd")
	public NDGQUJMA field238;

	@ObfuscatedName("client.cf")
	public NDGQUJMA field302;

	@ObfuscatedName("client.vf")
	public NDGQUJMA field320;

	@ObfuscatedName("client.wf")
	public NDGQUJMA field321;

	@ObfuscatedName("client.Nf")
	public NDGQUJMA field335;

	@ObfuscatedName("client.gi")
	public NDGQUJMA field444;

	@ObfuscatedName("client.hi")
	public NDGQUJMA field445;

	@ObfuscatedName("client.aj")
	public NDGQUJMA field487;

	@ObfuscatedName("client.Zj")
	public NDGQUJMA field528;

	@ObfuscatedName("client.ak")
	public NDGQUJMA field529;

	@ObfuscatedName("client.yd")
	public PJTXDRVG field225;

	@ObfuscatedName("client.kc")
	public RAOZRSKX field170;

	@ObfuscatedName("client.lc")
	public RAOZRSKX field171;

	@ObfuscatedName("client.mc")
	public RAOZRSKX field172;

	@ObfuscatedName("client.nc")
	public RAOZRSKX field173;

	@ObfuscatedName("client.oc")
	public RAOZRSKX field174;

	@ObfuscatedName("client.Cc")
	public RAOZRSKX field187;

	@ObfuscatedName("client.Dc")
	public RAOZRSKX field188;

	@ObfuscatedName("client.of")
	public RAOZRSKX field313;

	@ObfuscatedName("client.pf")
	public RAOZRSKX field314;

	@ObfuscatedName("client.qf")
	public RAOZRSKX field315;

	@ObfuscatedName("client.Ai")
	public RAOZRSKX field462;

	@ObfuscatedName("client.Bi")
	public RAOZRSKX field463;

	@ObfuscatedName("client.Ci")
	public RAOZRSKX field464;

	@ObfuscatedName("client.Di")
	public RAOZRSKX field465;

	@ObfuscatedName("client.Ei")
	public RAOZRSKX field466;

	@ObfuscatedName("client.sj")
	public RAOZRSKX field501;

	@ObfuscatedName("client.tj")
	public RAOZRSKX field502;

	@ObfuscatedName("client.uj")
	public RAOZRSKX field503;

	@ObfuscatedName("client.Hj")
	public RAOZRSKX field515;

	@ObfuscatedName("client.Ij")
	public RAOZRSKX field516;

	@ObfuscatedName("client.Zh")
	public VSQMPWOM field437;

	@ObfuscatedName("client.Wg")
	public WMQKHABS field384;

	@ObfuscatedName("client.rc")
	public ZPYOGBCY field177;

	@ObfuscatedName("client.Ph")
	public ZRJULOYY field427;

	@ObfuscatedName("client.Bb")
	public ZTWZAULT field139;

	@ObfuscatedName("client.Cb")
	public ZTWZAULT field140;

	@ObfuscatedName("client.Db")
	public ZTWZAULT field141;

	@ObfuscatedName("client.Eb")
	public ZTWZAULT field142;

	@ObfuscatedName("client.Fb")
	public ZTWZAULT field143;

	@ObfuscatedName("client.Gb")
	public ZTWZAULT field144;

	@ObfuscatedName("client.Hb")
	public ZTWZAULT field145;

	@ObfuscatedName("client.Ib")
	public ZTWZAULT field146;

	@ObfuscatedName("client.Jb")
	public ZTWZAULT field147;

	@ObfuscatedName("client.Gc")
	public ZTWZAULT field189;

	@ObfuscatedName("client.Hc")
	public ZTWZAULT field190;

	@ObfuscatedName("client.Ic")
	public ZTWZAULT field191;

	@ObfuscatedName("client.se")
	public ZTWZAULT field268;

	@ObfuscatedName("client.te")
	public ZTWZAULT field269;

	@ObfuscatedName("client.ue")
	public ZTWZAULT field270;

	@ObfuscatedName("client.ve")
	public ZTWZAULT field271;

	@ObfuscatedName("client.vh")
	public ZTWZAULT field408;

	@ObfuscatedName("client.wh")
	public ZTWZAULT field409;

	@ObfuscatedName("client.xh")
	public ZTWZAULT field410;

	@ObfuscatedName("client.yh")
	public ZTWZAULT field411;

	@ObfuscatedName("client.zh")
	public ZTWZAULT field412;

	@ObfuscatedName("client.Ah")
	public ZTWZAULT field413;

	@ObfuscatedName("client.Bh")
	public ZTWZAULT field414;

	@ObfuscatedName("client.Ch")
	public ZTWZAULT field415;

	@ObfuscatedName("client.Dh")
	public ZTWZAULT field416;

	@ObfuscatedName("client.rb")
	public String field130;

	@ObfuscatedName("client.df")
	public String field303;

	@ObfuscatedName("client.Vh")
	public String field433;

	@ObfuscatedName("client.Gj")
	public String field514;

	@ObfuscatedName("client.Ed")
	public Socket field231;

	@ObfuscatedName("client.X")
	public static boolean field113;

	@ObfuscatedName("client.tc")
	public static boolean field179;

	@ObfuscatedName("client.Oe")
	public static boolean field288;

	@ObfuscatedName("client.Df")
	public static boolean field327;

	@ObfuscatedName("client.sb")
	public int[] field131;

	@ObfuscatedName("client.tb")
	public int[] field132;

	@ObfuscatedName("client.oe")
	public int[] field264;

	@ObfuscatedName("client.pe")
	public int[] field265;

	@ObfuscatedName("client.qe")
	public int[] field266;

	@ObfuscatedName("client.re")
	public int[] field267;

	@ObfuscatedName("client.mg")
	public int[] field356;

	@ObfuscatedName("client.ng")
	public int[] field357;

	@ObfuscatedName("client.Yg")
	public int[] field386;

	@ObfuscatedName("client.Zg")
	public int[] field387;

	@ObfuscatedName("client.ah")
	public int[] field388;

	@ObfuscatedName("client.bh")
	public int[] field389;

	@ObfuscatedName("client.zj")
	public int[] field507;

	@ObfuscatedName("client.Aj")
	public int[] field508;

	@ObfuscatedName("client.Bj")
	public int[] field509;

	@ObfuscatedName("client.ud")
	public RAOZRSKX[] field224;

	@ObfuscatedName("client.ie")
	public byte[][] field258;

	@ObfuscatedName("client.nf")
	public byte[][] field312;

	@ObfuscatedName("client.th")
	public byte[][][] field406;

	@ObfuscatedName("client.Vb")
	public int[][][] field156;

	@ObfuscatedName("client.d(Z)V")
	public final void method150() {
		for (LDXKRJQR var1 = (LDXKRJQR) field204.method598(); var1 != null; var1 = (LDXKRJQR) field204.method600()) {
			if (field199 != var1.field899 || field459 > var1.field884) {
				var1.method329();
			} else if (field459 >= var1.field883) {
				if (var1.field895 > 0) {
					BFCMZACY var2 = field402[var1.field895 - 1];
					if (var2 != null && var2.field756 >= 0 && var2.field756 < 13312 && var2.field757 >= 0 && var2.field757 < 13312) {
						var1.method337(field459, var2.field756, var2.field757, method190(var2.field757, var1.field899, var2.field756) - var1.field888);
					}
				}

				if (var1.field895 < 0) {
					int var3 = -var1.field895 - 1;
					IOPHRJNF var4;
					if (field121 == var3) {
						var4 = field512;
					} else {
						var4 = field275[var3];
					}

					if (var4 != null && var4.field756 >= 0 && var4.field756 < 13312 && var4.field757 >= 0 && var4.field757 < 13312) {
						var1.method337(field459, var4.field756, var4.field757, method190(var4.field757, var1.field899, var4.field756) - var1.field888);
					}
				}

				var1.method336(field517);
				field225.method384(var1.field897, field199, (int) var1.field901, 60, (int) var1.field902, var1, -1, false, (int) var1.field900);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method151(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field262 = "";
				field263 = "Connecting to server...";
				method189(true);
			}

			field177 = new ZPYOGBCY(method283(field286 + 43594), this);
			long var4 = JQPXVJFJ.method323(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field382.field10 = 0;
			field382.method44(14);
			field382.method44(var6);
			field177.method590(2, field382.field9, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field177.method587();
			}

			int var8 = field177.method587();
			int var9 = var8;

			if (var8 == 0) {
				field177.method589(field318.field9, 0, 8);
				field318.field10 = 0;
				field395 = field318.method60();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field395 >> 32), (int) field395 };
				field382.field10 = 0;
				field382.method44(10);
				field382.method48(var10[0]);
				field382.method48(var10[1]);
				field382.method48(var10[2]);
				field382.method48(var10[3]);
				field382.method48(signlink.uid);
				field382.method51(arg0);
				field382.method51(arg1);
				field382.method69(field200, field184);
				field397.field10 = 0;

				if (arg2) {
					field397.method44(18);
				} else {
					field397.method44(16);
				}

				field397.method44(field382.field10 + 36 + 1 + 1 + 2);
				field397.method44(255);
				field397.method45(367);
				field397.method44(field288 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field397.method48(field230[var11]);
				}

				field397.method52(field382.field9, field382.field10, 0);
				field382.field14 = new WMQKHABS(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field384 = new WMQKHABS(var10);
				field177.method590(field397.field10, field397.field9, 0);
				var8 = field177.method587();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method151(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field194 = field177.method587();
				field327 = field177.method587() == 1;
				field297 = 0L;
				field378 = 0;
				field427.field1502 = 0;
				field1213 = true;
				field457 = true;
				field180 = true;
				field382.field10 = 0;
				field318.field10 = 0;
				field164 = -1;
				field480 = -1;
				field481 = -1;
				field482 = -1;
				field163 = 0;
				field165 = 0;
				field168 = 0;
				field167 = 0;
				field181 = 0;
				field260 = 0;
				field229 = false;
				field1214 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field525[var13] = null;
				}

				field429 = 0;
				field127 = 0;
				field185 = 0;
				field175 = 0;
				field136 = (int) (Math.random() * 100.0D) - 50;
				field192 = (int) (Math.random() * 110.0D) - 55;
				field491 = (int) (Math.random() * 80.0D) - 40;
				field370 = (int) (Math.random() * 120.0D) - 60;
				field460 = (int) (Math.random() * 30.0D) - 20;
				field373 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field219 = 0;
				field538 = -1;
				field333 = 0;
				field334 = 0;
				field276 = 0;
				field403 = 0;

				for (int var14 = 0; var14 < field273; var14++) {
					field275[var14] = null;
					field280[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field402[var15] = null;
				}

				field512 = field275[field274] = new IOPHRJNF();
				field204.method602();
				field153.method602();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field441[var16][var17][var18] = null;
						}
					}
				}

				field152 = new ZXKMWHPZ();
				field393 = 0;
				field392 = 0;
				method205(field450);
				field450 = -1;
				method205(field369);
				field369 = -1;
				method205(field383);
				field383 = -1;
				method205(field272);
				field272 = -1;
				method205(field349);
				field349 = -1;
				method205(field519);
				field519 = -1;
				method205(field419);
				field419 = -1;
				field218 = false;
				field342 = 3;
				field530 = 0;
				field229 = false;
				field257 = false;
				field514 = null;
				field134 = 0;
				field506 = -1;
				field438 = true;
				method288();

				for (int var19 = 0; var19 < 5; var19++) {
					field398[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field358[var20] = null;
					field359[var20] = false;
				}

				field513 = 0;
				field486 = 0;
				field521 = 0;
				field381 = 0;
				field111 = 0;
				field289 = 0;
				method236();
			} else if (var8 == 3) {
				field262 = "";
				field263 = "Invalid username or password.";
			} else if (var8 == 4) {
				field262 = "Your account has been disabled.";
				field263 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field262 = "Your account is already logged in.";
				field263 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field262 = "RuneScape has been updated!";
				field263 = "Please reload this page.";
			} else if (var8 == 7) {
				field262 = "This world is full.";
				field263 = "Please use a different world.";
			} else if (var8 == 8) {
				field262 = "Unable to connect.";
				field263 = "Login server offline.";
			} else if (var8 == 9) {
				field262 = "Login limit exceeded.";
				field263 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field262 = "Unable to connect.";
				field263 = "Bad session id.";
			} else if (var8 == 12) {
				field262 = "You need a members account to login to this world.";
				field263 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field262 = "Could not complete login.";
				field263 = "Please try using a different world.";
			} else if (var8 == 14) {
				field262 = "The server is being updated.";
				field263 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field180 = true;
				field382.field10 = 0;
				field318.field10 = 0;
				field164 = -1;
				field480 = -1;
				field481 = -1;
				field482 = -1;
				field163 = 0;
				field165 = 0;
				field168 = 0;
				field260 = 0;
				field229 = false;
				field458 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field262 = "Login attempts exceeded.";
				field263 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field262 = "You are standing in a members-only area.";
				field263 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field262 = "Invalid loginserver requested";
				field263 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field177.method587();
				for (var21 += 3; var21 >= 0; var21--) {
					field262 = "You have only just left another world";
					field263 = "Your profile will be transferred in: " + var21;
					method189(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method151(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field262 = "Malformed login packet.";
				field263 = "Please try again.";
			} else if (var8 == 23) {
				field262 = "No reply from loginserver.";
				field263 = "Please try again.";
			} else if (var8 == 24) {
				field262 = "Error loading your profile.";
				field263 = "Please contact customer support.";
			} else if (var8 == 25) {
				field262 = "Unexpected loginserver response.";
				field263 = "Please try using a different world.";
			} else if (var8 == 26) {
				field262 = "This computers address has been blocked";
				field263 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field262 = "Unexpected server response";
				field263 = "Please try using a different world.";
			} else if (var9 != 0) {
				field262 = "No response from server";
				field263 = "Please try using a different world.";
			} else if (field150 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field150++;
				method151(arg0, arg1, arg2);
			} else {
				field262 = "No response from loginserver";
				field263 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field262 = "";
			field263 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IILBFQIDHPO;)V")
	public final void method152(int arg0, BFQIDHPO arg1) {
		field472 = 0;
		field278 = 0;
		method178(arg1, arg0);
		method250(arg0, arg1);
		method285(arg0, arg1);

		for (int var3 = 0; var3 < field472; var3++) {
			int var4 = field473[var3];
			if (field459 != field402[var4].field755) {
				field402[var4].field8 = null;
				field402[var4] = null;
			}
		}

		if (arg1.field10 != arg0) {
			signlink.reporterror(field329 + " size mismatch in getnpcpos - pos:" + arg1.field10 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field403; var5++) {
			if (field402[field404[var5]] == null) {
				signlink.reporterror(field329 + " null entry in npc list - pos:" + var5 + " size:" + field403);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.e(I)Z")
	public final boolean method153() {
		if (field177 == null) {
			return false;
		}

		try {
			int var1 = field177.method588();
			if (var1 == 0) {
				return false;
			}

			if (field164 == -1) {
				field177.method589(field318.field9, 0, 1);
				field164 = field318.field9[0] & 0xFF;
				if (field384 != null) {
					field164 = field164 - field384.method534() & 0xFF;
				}

				field163 = DFMPKBRT.field605[field164];
				var1--;
			}

			if (field163 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field177.method589(field318.field9, 0, 1);
				field163 = field318.field9[0] & 0xFF;
				var1--;
			}

			if (field163 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field177.method589(field318.field9, 0, 2);
				field318.field10 = 0;
				field163 = field318.method56();
				var1 -= 2;
			}

			if (var1 < field163) {
				return false;
			}

			field318.field10 = 0;
			field177.method589(field318.field9, 0, field163);
			field165 = 0;
			field482 = field481;
			field481 = field480;
			field480 = field164;

			if (field164 == 250) {
				field399 = true;
				int var2 = field318.method73();
				int var3 = field318.method59();
				int var4 = field318.method54();
				field341[var4] = var3;
				field379[var4] = var2;
				field347[var4] = 1;
				for (int var5 = 0; var5 < 98; var5++) {
					if (var3 >= field536[var5]) {
						field347[var4] = var5 + 2;
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 38) {
				int var6 = field318.method82();
				method201(var6);

				if (field369 != -1) {
					method205(field369);
					field369 = -1;
					field157 = true;
				}

				if (field272 != -1) {
					method205(field272);
					field272 = -1;
					field490 = true;
				}

				if (field349 != -1) {
					method205(field349);
					field349 = -1;
				}

				if (field383 != -1) {
					method205(field383);
					field383 = -1;
				}

				if (field519 != var6) {
					method205(field519);
					field519 = var6;
				}

				if (field530 != 0) {
					field530 = 0;
					field157 = true;
				}

				field399 = true;
				field336 = true;
				field218 = false;
				field164 = -1;
				return true;
			}

			if (field164 == 153) {
				int var7 = field318.method81();
				int var8 = field318.method83();

				if (field369 != -1) {
					method205(field369);
					field369 = -1;
					field157 = true;
				}

				if (field272 != -1) {
					method205(field272);
					field272 = -1;
					field490 = true;
				}

				if (field349 != -1) {
					method205(field349);
					field349 = -1;
				}

				if (field383 != var8) {
					method205(field383);
					field383 = var8;
				}

				if (field519 != var7) {
					method205(field519);
					field519 = var7;
				}

				if (field530 != 0) {
					field530 = 0;
					field157 = true;
				}

				field399 = true;
				field336 = true;
				field218 = false;
				field164 = -1;
				return true;
			}

			if (field164 == 198) {
				String var9 = field318.method61();
				if (var9.endsWith(":tradereq:")) {
					String var10 = var9.substring(0, var9.indexOf(":"));
					long var11 = JQPXVJFJ.method323(var10);
					boolean var13 = false;
					for (int var14 = 0; var14 < field396; var14++) {
						if (field196[var14] == var11) {
							var13 = true;
							break;
						}
					}

					if (!var13 && field426 == 0) {
						method192(var10, "wishes to trade with you.", 4);
					}
				} else if (var9.endsWith(":duelreq:")) {
					String var15 = var9.substring(0, var9.indexOf(":"));
					long var16 = JQPXVJFJ.method323(var15);
					boolean var18 = false;
					for (int var19 = 0; var19 < field396; var19++) {
						if (field196[var19] == var16) {
							var18 = true;
							break;
						}
					}

					if (!var18 && field426 == 0) {
						method192(var15, "wishes to duel with you.", 8);
					}
				} else if (var9.endsWith(":chalreq:")) {
					String var20 = var9.substring(0, var9.indexOf(":"));
					long var21 = JQPXVJFJ.method323(var20);
					boolean var23 = false;
					for (int var24 = 0; var24 < field396; var24++) {
						if (field196[var24] == var21) {
							var23 = true;
							break;
						}
					}

					if (!var23 && field426 == 0) {
						String var25 = var9.substring(var9.indexOf(":") + 1, var9.length() - 9);
						method192(var20, var25, 8);
					}
				} else {
					method192("", var9, 0);
				}

				field164 = -1;
				return true;
			}

			if (field164 == 220) {
				field257 = false;
				field530 = 2;
				field400 = "";
				field157 = true;
				field164 = -1;
				return true;
			}

			if (field164 == 14) {
				int var26 = field318.method84();
				int var27 = field318.method83();
				int var28 = field318.method85();
				FMDWWBSX var29 = FMDWWBSX.method306(var27);
				var29.field674 = var28;
				var29.field660 = var26;
				field164 = -1;
				return true;
			}

			if (field164 == 216) {
				int var30 = field318.method56();
				int var31 = field318.method54();
				int var32 = field318.method56();
				if (var32 == 0xFFFF) {
					if (field175 < 50) {
						field310[field175] = (short) var30;
						field537[field175] = var31;
						field133[field175] = 0;
						field175++;
					}
				} else if (field355 && !field288 && field175 < 50) {
					field310[field175] = var30;
					field537[field175] = var31;
					field133[field175] = LOEGFAGM.field906[var30] + var32;
					field175++;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 149) {
				field181 = field318.method54();
				if (field181 == 1) {
					field158 = field318.method56();
				}

				if (field181 >= 2 && field181 <= 6) {
					if (field181 == 2) {
						field213 = 64;
						field214 = 64;
					}

					if (field181 == 3) {
						field213 = 0;
						field214 = 64;
					}

					if (field181 == 4) {
						field213 = 128;
						field214 = 64;
					}

					if (field181 == 5) {
						field213 = 64;
						field214 = 0;
					}

					if (field181 == 6) {
						field213 = 64;
						field214 = 128;
					}

					field181 = 2;
					field210 = field318.method56();
					field211 = field318.method56();
					field212 = field318.method54();
				}

				if (field181 == 10) {
					field368 = field318.method56();
				}

				field164 = -1;
				return true;
			}

			if (field164 == 142) {
				field396 = field163 / 8;
				for (int var33 = 0; var33 < field396; var33++) {
					field196[var33] = field318.method60();
				}

				field164 = -1;
				return true;
			}

			if (field164 == 10) {
				field442 = field318.method54();
				field443 = field318.method75();
				field164 = -1;
				return true;
			}

			if (field164 == 110) {
				field399 = true;
				int var34 = field318.method56();
				FMDWWBSX var35 = FMDWWBSX.method306(var34);
				while (field318.field10 < field163) {
					int var36 = field318.method68();
					int var37 = field318.method56();
					int var38 = field318.method54();
					if (var38 == 255) {
						var38 = field318.method59();
					}

					if (var36 >= 0 && var36 < var35.field624.length) {
						var35.field624[var36] = var37;
						var35.field664[var36] = var38;
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 226) {
				int var39 = field318.method81();
				method201(var39);

				if (field519 != -1) {
					method205(field519);
					field519 = -1;
					field399 = true;
					field336 = true;
				}

				if (field369 != -1) {
					method205(field369);
					field369 = -1;
					field157 = true;
				}

				if (field272 != -1) {
					method205(field272);
					field272 = -1;
					field490 = true;
				}

				if (field349 != -1) {
					method205(field349);
					field349 = -1;
				}

				if (field383 != var39) {
					method205(field383);
					field383 = var39;
				}

				if (field530 != 0) {
					field530 = 0;
					field157 = true;
				}

				field218 = false;
				field164 = -1;
				return true;
			}

			if (field164 == 36) {
				field333 = 0;
				field164 = -1;
				return true;
			}

			if (field164 == 168) {
				field393 = field318.method54();
				field399 = true;
				field164 = -1;
				return true;
			}

			if (field164 == 121) {
				int var40 = field318.method82();
				int var41 = field318.method83();
				int var42 = var41 >> 10 & 0x1F;
				int var43 = var41 >> 5 & 0x1F;
				int var44 = var41 & 0x1F;
				FMDWWBSX.method306(var40).field625 = (var44 << 3) + (var42 << 19) + (var43 << 11);
				field164 = -1;
				return true;
			}

			if (field164 == 155) {
				int var45 = field318.method86();
				if (var45 >= 0) {
					method201(var45);
				}

				if (field419 != var45) {
					method205(field419);
					field419 = var45;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 208) {
				int var46 = field318.method83();
				FMDWWBSX.method306(var46).field668 = 3;

				if (field512.field808 == null) {
					FMDWWBSX.method306(var46).field669 = (field512.field806[11] << 5) + (field512.field806[8] << 10) + (field512.field806[0] << 15) + (field512.field815[0] << 25) + (field512.field815[4] << 20) + field512.field806[1];
				} else {
					FMDWWBSX.method306(var46).field669 = (int) (field512.field808.field1154 + 0x12345678L);
				}

				field164 = -1;
				return true;
			}

			if (field164 == 1) {
				int var47 = field318.method56();
				int var48 = field318.method81();
				int var49 = field318.method83();
				int var50 = field318.method82();
				FMDWWBSX.method306(var47).field677 = var50;
				FMDWWBSX.method306(var47).field678 = var48;
				FMDWWBSX.method306(var47).field676 = var49;
				field164 = -1;
				return true;
			}

			if (field164 == 122) {
				int var51 = field318.method54();
				int var52 = field318.method54();
				int var53 = field318.method54();
				int var54 = field318.method54();
				field295[var51] = true;
				field380[var51] = var52;
				field418[var51] = var53;
				field405[var51] = var54;
				field377[var51] = 0;
				field164 = -1;
				return true;
			}

			if (field164 == 123) {
				int var55 = field318.method56();
				boolean var56 = field318.method73() == 1;
				FMDWWBSX.method306(var55).field670 = var56;
				field164 = -1;
				return true;
			}

			if (field164 == 201) {
				int var57 = field318.method73();
				int var58 = field318.method81();
				if (var58 == 0xFFFF) {
					var58 = -1;
				}

				if (field376[var57] != var58) {
					method205(field376[var57]);
					field376[var57] = var58;
				}

				field399 = true;
				field336 = true;
				field164 = -1;
				return true;
			}

			if (field164 == 108) {
				field168 = field318.method81() * 30;
				field164 = -1;
				return true;
			}

			if (field164 == 170) {
				field120 = true;
				field531 = field318.method54();
				field532 = field318.method54();
				field533 = field318.method56();
				field534 = field318.method54();
				field535 = field318.method54();
				if (field535 >= 100) {
					field452 = field531 * 128 + 64;
					field454 = field532 * 128 + 64;
					field453 = method190(field454, field199, field452) - field533;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 227) {
				field506 = field318.method74();
				if (field506 == field342) {
					if (field506 == 3) {
						field342 = 1;
					} else {
						field342 = 3;
					}

					field399 = true;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 152) {
				int var59 = field318.method81();
				int var60 = field318.method56();
				FMDWWBSX var61 = FMDWWBSX.method306(var60);
				if (var61 != null && var61.field691 == 0) {
					if (var59 < 0) {
						var59 = 0;
					}

					if (var59 > var61.field665 - var61.field650) {
						var59 = var61.field665 - var61.field650;
					}

					var61.field692 = var59;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 53) {
				int var62 = field318.method83();
				int var63 = field318.method81();
				FMDWWBSX.method306(var62).field668 = 1;
				FMDWWBSX.method306(var62).field669 = var63;
				field164 = -1;
				return true;
			}

			if (field164 == 19) {
				field442 = field318.method74();
				field443 = field318.method74();

				while (field318.field10 < field163) {
					int var64 = field318.method54();
					method272(var64, field318);
				}

				field164 = -1;
				return true;
			}

			if (field164 == 235) {
				field134 = field318.method54();
				field164 = -1;
				return true;
			}

			if (field164 == 47) {
				String var65 = field318.method61();
				int var66 = field318.method54();
				int var67 = field318.method73();
				if (var67 >= 1 && var67 <= 5) {
					if (var65.equalsIgnoreCase("null")) {
						var65 = null;
					}

					field358[var67 - 1] = var65;
					field359[var67 - 1] = var66 == 0;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 75) {
				int var68 = field318.method56();
				int var69 = field318.method83();
				int var70 = field318.method81();
				FMDWWBSX.method306(var69).field649 = (var70 << 16) + var68;
				field164 = -1;
				return true;
			}

			if (field164 == 99) {
				field121 = field318.method56();
				field222 = field318.method75();
				field164 = -1;
				return true;
			}

			if (field164 == 181) {
				for (int var71 = 0; var71 < field275.length; var71++) {
					if (field275[var71] != null) {
						field275[var71].field741 = -1;
					}
				}

				for (int var72 = 0; var72 < field402.length; var72++) {
					if (field402[var72] != null) {
						field402[var72].field741 = -1;
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 45) {
				long var73 = field318.method60();
				int var75 = field318.method59();
				int var76 = field318.method54();
				boolean var77 = false;
				for (int var78 = 0; var78 < 100; var78++) {
					if (field209[var78] == var75) {
						var77 = true;
						break;
					}
				}

				if (var76 <= 1) {
					for (int var79 = 0; var79 < field396; var79++) {
						if (field196[var79] == var73) {
							var77 = true;
							break;
						}
					}
				}

				if (!var77 && field426 == 0) {
					try {
						field209[field436] = var75;
						field436 = (field436 + 1) % 100;
						String var80 = OSSLGBQQ.method369(field318, field163 - 13);
						if (var76 != 3) {
							var80 = AYSHFCKR.method11(var80);
						}

						if (var76 == 2 || var76 == 3) {
							method192("@cr2@" + JQPXVJFJ.method327(JQPXVJFJ.method324(var73)), var80, 7);
						} else if (var76 == 1) {
							method192("@cr1@" + JQPXVJFJ.method327(JQPXVJFJ.method324(var73)), var80, 7);
						} else {
							method192(JQPXVJFJ.method327(JQPXVJFJ.method324(var73)), var80, 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 243 || field164 == 46) {
				int var82 = field148;
				int var83 = field149;
				if (field164 == 243) {
					var82 = field318.method83();
					var83 = field318.method56();
					field110 = false;
				}

				if (field164 == 46) {
					var82 = field318.method83();
					var83 = field318.method81();
					field318.method64();

					for (int var84 = 0; var84 < 4; var84++) {
						for (int var85 = 0; var85 < 13; var85++) {
							for (int var86 = 0; var86 < 13; var86++) {
								int var87 = field318.method65(1);
								if (var87 == 1) {
									field282[var84][var85][var86] = field318.method65(26);
								} else {
									field282[var84][var85][var86] = -1;
								}
							}
						}
					}

					field318.method66();
					field110 = true;
				}

				if (field148 == var82 && field149 == var83 && field185 == 2) {
					field164 = -1;
					return true;
				}

				field148 = var82;
				field149 = var83;
				field291 = (field148 - 6) * 8;
				field292 = (field149 - 6) * 8;
				field206 = false;
				if ((field148 / 8 == 48 || field148 / 8 == 49) && field149 / 8 == 48) {
					field206 = true;
				}

				if (field148 / 8 == 48 && field149 / 8 == 148) {
					field206 = true;
				}

				field185 = 1;
				field458 = System.currentTimeMillis();
				method230(null, "Loading - please wait.");

				if (field164 == 243) {
					int var88 = 0;
					for (int var89 = (field148 - 6) / 8; var89 <= (field148 + 6) / 8; var89++) {
						for (int var90 = (field149 - 6) / 8; var90 <= (field149 + 6) / 8; var90++) {
							var88++;
						}
					}

					field312 = new byte[var88][];
					field258 = new byte[var88][];
					field507 = new int[var88];
					field508 = new int[var88];
					field509 = new int[var88];
					int var91 = 0;
					for (int var92 = (field148 - 6) / 8; var92 <= (field148 + 6) / 8; var92++) {
						for (int var93 = (field149 - 6) / 8; var93 <= (field149 + 6) / 8; var93++) {
							field507[var91] = (var92 << 8) + var93;

							if (field206 && (var93 == 49 || var93 == 149 || var93 == 147 || var92 == 50 || var92 == 49 && var93 == 47)) {
								field508[var91] = -1;
								field509[var91] = -1;
								var91++;
							} else {
								int var94 = field508[var91] = field474.method129(var92, 0, var93);
								if (var94 != -1) {
									field474.method118(3, var94);
								}

								int var95 = field509[var91] = field474.method129(var92, 1, var93);
								if (var95 != -1) {
									field474.method118(3, var95);
								}

								var91++;
							}
						}
					}
				}

				if (field164 == 46) {
					int var96 = 0;
					int[] var97 = new int[676];
					for (int var98 = 0; var98 < 4; var98++) {
						for (int var99 = 0; var99 < 13; var99++) {
							for (int var100 = 0; var100 < 13; var100++) {
								int var101 = field282[var98][var99][var100];
								if (var101 != -1) {
									int var102 = var101 >> 14 & 0x3FF;
									int var103 = var101 >> 3 & 0x7FF;
									int var104 = (var102 / 8 << 8) + var103 / 8;
									for (int var105 = 0; var105 < var96; var105++) {
										if (var97[var105] == var104) {
											var104 = -1;
											break;
										}
									}

									if (var104 != -1) {
										var97[var96++] = var104;
									}
								}
							}
						}
					}

					field312 = new byte[var96][];
					field258 = new byte[var96][];
					field507 = new int[var96];
					field508 = new int[var96];
					field509 = new int[var96];
					for (int var106 = 0; var106 < var96; var106++) {
						int var107 = field507[var106] = var97[var106];
						int var108 = var107 >> 8 & 0xFF;
						int var109 = var107 & 0xFF;
						int var110 = field508[var106] = field474.method129(var108, 0, var109);
						if (var110 != -1) {
							field474.method118(3, var110);
						}

						int var111 = field509[var106] = field474.method129(var108, 1, var109);
						if (var111 != -1) {
							field474.method118(3, var111);
						}
					}
				}

				int var112 = field291 - field293;
				int var113 = field292 - field294;
				field293 = field291;
				field294 = field292;

				for (int var114 = 0; var114 < 16384; var114++) {
					BFCMZACY var115 = field402[var114];
					if (var115 != null) {
						for (int var116 = 0; var116 < 10; var116++) {
							var115.field776[var116] -= var112;
							var115.field777[var116] -= var113;
						}

						var115.field756 -= var112 * 128;
						var115.field757 -= var113 * 128;
					}
				}

				for (int var117 = 0; var117 < field273; var117++) {
					IOPHRJNF var118 = field275[var117];
					if (var118 != null) {
						for (int var119 = 0; var119 < 10; var119++) {
							var118.field776[var119] -= var112;
							var118.field777[var119] -= var113;
						}

						var118.field756 -= var112 * 128;
						var118.field757 -= var113 * 128;
					}
				}

				field325 = true;
				byte var120 = 0;
				byte var121 = 104;
				byte var122 = 1;
				if (var112 < 0) {
					var120 = 103;
					var121 = -1;
					var122 = -1;
				}

				byte var123 = 0;
				byte var124 = 104;
				byte var125 = 1;
				if (var113 < 0) {
					var123 = 103;
					var124 = -1;
					var125 = -1;
				}

				for (int var126 = var120; var126 != var121; var126 += var122) {
					for (int var127 = var123; var127 != var124; var127 += var125) {
						int var128 = var112 + var126;
						int var129 = var113 + var127;
						for (int var130 = 0; var130 < 4; var130++) {
							if (var128 >= 0 && var129 >= 0 && var128 < 104 && var129 < 104) {
								field441[var130][var126][var127] = field441[var130][var128][var129];
							} else {
								field441[var130][var126][var127] = null;
							}
						}
					}
				}

				for (IYAQHTAH var131 = (IYAQHTAH) field152.method598(); var131 != null; var131 = (IYAQHTAH) field152.method600()) {
					var131.field847 -= var112;
					var131.field848 -= var113;
					if (var131.field847 < 0 || var131.field848 < 0 || var131.field847 >= 104 || var131.field848 >= 104) {
						var131.method329();
					}
				}

				if (field333 != 0) {
					field333 -= var112;
					field334 -= var113;
				}

				field120 = false;
				field164 = -1;
				return true;
			}

			if (field164 == 240) {
				if (field342 == 12) {
					field399 = true;
				}

				field240 = field318.method54();
				field164 = -1;
				return true;
			}

			if (field164 == 92) {
				int var132 = field318.method83();
				int var133 = field318.method86();
				FMDWWBSX var134 = FMDWWBSX.method306(var132);
				if (var134.field661 != var133 || var133 == -1) {
					var134.field661 = var133;
					var134.field636 = 0;
					var134.field626 = 0;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 222) {
				field442 = field318.method75();
				field443 = field318.method73();
				for (int var135 = field442; var135 < field442 + 8; var135++) {
					for (int var136 = field443; var136 < field443 + 8; var136++) {
						if (field441[field199][var135][var136] != null) {
							field441[field199][var135][var136] = null;
							method213(var135, var136);
						}
					}
				}

				for (IYAQHTAH var137 = (IYAQHTAH) field152.method598(); var137 != null; var137 = (IYAQHTAH) field152.method600()) {
					if (var137.field847 >= field442 && var137.field847 < field442 + 8 && var137.field848 >= field443 && var137.field848 < field443 + 8 && field199 == var137.field845) {
						var137.field844 = 0;
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 129) {
				int var138 = field318.method56();
				FMDWWBSX var139 = FMDWWBSX.method306(var138);
				for (int var140 = 0; var140 < var139.field624.length; var140++) {
					var139.field624[var140] = -1;
					var139.field624[var140] = 0;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 207) {
				field504 = field318.method54();
				field365 = field318.method54();
				field494 = field318.method54();
				field428 = true;
				field157 = true;
				field164 = -1;
				return true;
			}

			if (field164 == 171) {
				field342 = field318.method54();
				field399 = true;
				field336 = true;
				field164 = -1;
				return true;
			}

			if (field164 == 73) {
				int var141 = field318.method82();
				int var142 = field318.method81();
				FMDWWBSX.method306(var142).field668 = 2;
				FMDWWBSX.method306(var142).field669 = var141;
				field164 = -1;
				return true;
			}

			if (field164 == 159) {
				int var143 = field318.method56();
				int var144 = field318.method82();
				method201(var143);

				if (var144 != -1) {
					method201(var144);
				}

				if (field383 != -1) {
					method205(field383);
					field383 = -1;
				}

				if (field519 != -1) {
					method205(field519);
					field519 = -1;
				}

				if (field369 != -1) {
					method205(field369);
					field369 = -1;
				}

				if (field272 != var143) {
					method205(field272);
					field272 = var143;
				}

				if (field349 != var143) {
					method205(field349);
					field349 = var144;
				}

				field530 = 0;
				field218 = false;
				field164 = -1;
				return true;
			}

			if (field164 == 5) {
				int var145 = field318.method86();
				if (field450 != var145) {
					method205(field450);
					field450 = var145;
				}

				field157 = true;
				field164 = -1;
				return true;
			}

			if (field164 == 78) {
				method152(field163, field318);
				field164 = -1;
				return true;
			}

			if (field164 == 205) {
				field219 = field318.method54();
				field164 = -1;
				return true;
			}

			if (field164 == 252) {
				method229();
				field164 = -1;
				return false;
			}

			if (field164 == 228) {
				if (field519 != -1) {
					method205(field519);
					field519 = -1;
					field399 = true;
					field336 = true;
				}

				if (field369 != -1) {
					method205(field369);
					field369 = -1;
					field157 = true;
				}

				if (field272 != -1) {
					method205(field272);
					field272 = -1;
					field490 = true;
				}

				if (field349 != -1) {
					method205(field349);
					field349 = -1;
				}

				if (field383 != -1) {
					method205(field383);
					field383 = -1;
				}

				if (field530 != 0) {
					field530 = 0;
					field157 = true;
				}

				field218 = false;
				field164 = -1;
				return true;
			}

			if (field164 == 61) {
				long var146 = field318.method60();
				int var148 = field318.method54();
				String var149 = JQPXVJFJ.method327(JQPXVJFJ.method324(var146));
				for (int var150 = 0; var150 < field392; var150++) {
					if (field124[var150] == var146) {
						if (field195[var150] != var148) {
							field195[var150] = var148;
							field399 = true;

							if (var148 > 0) {
								method192("", var149 + " has logged in.", 5);
							}

							if (var148 == 0) {
								method192("", var149 + " has logged out.", 5);
							}
						}

						var149 = null;
						break;
					}
				}

				if (var149 != null && field392 < 200) {
					field124[field392] = var146;
					field138[field392] = var149;
					field195[field392] = var148;
					field392++;
					field399 = true;
				}

				boolean var151 = false;
				while (!var151) {
					var151 = true;
					for (int var152 = 0; var152 < field392 - 1; var152++) {
						if (field195[var152] != field285 && field195[var152 + 1] == field285 || field195[var152] == 0 && field195[var152 + 1] != 0) {
							int var153 = field195[var152];
							field195[var152] = field195[var152 + 1];
							field195[var152 + 1] = var153;
							String var154 = field138[var152];
							field138[var152] = field138[var152 + 1];
							field138[var152 + 1] = var154;
							long var155 = field124[var152];
							field124[var152] = field124[var152 + 1];
							field124[var152 + 1] = var155;
							field399 = true;
							var151 = false;
						}
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 113) {
				field120 = false;

				for (int var157 = 0; var157 < 5; var157++) {
					field295[var157] = false;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 23) {
				if (field342 == 12) {
					field399 = true;
				}

				field485 = field318.method57();
				field164 = -1;
				return true;
			}

			if (field164 == 4) {
				for (int var158 = 0; var158 < field493.length; var158++) {
					if (field493[var158] != field207[var158]) {
						field493[var158] = field207[var158];
						method155(var158);
						field399 = true;
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 157) {
				field257 = false;
				field530 = 1;
				field400 = "";
				field157 = true;
				field164 = -1;
				return true;
			}

			if (field164 == 7) {
				int var159 = field318.method83();
				int var160 = field318.method83();
				int var161 = field318.method82();
				if (var160 == 0xFFFF) {
					FMDWWBSX.method306(var161).field668 = 0;
					field164 = -1;
					return true;
				}

				RBNCRAAP var162 = RBNCRAAP.method456(var160);
				FMDWWBSX.method306(var161).field668 = 4;
				FMDWWBSX.method306(var161).field669 = var160;
				FMDWWBSX.method306(var161).field677 = var162.field1064;
				FMDWWBSX.method306(var161).field678 = var162.field1077;
				FMDWWBSX.method306(var161).field676 = var162.field1096 * 100 / var159;
				field164 = -1;
				return true;
			}

			if (field164 == 83) {
				field120 = true;
				field350 = field318.method54();
				field351 = field318.method54();
				field352 = field318.method56();
				field353 = field318.method54();
				field354 = field318.method54();
				if (field354 >= 100) {
					int var163 = field350 * 128 + 64;
					int var164 = field351 * 128 + 64;
					int var165 = method190(var164, field199, var163) - field352;
					int var166 = var163 - field452;
					int var167 = var165 - field453;
					int var168 = var164 - field454;
					int var169 = (int) Math.sqrt(var166 * var166 + var168 * var168);
					field455 = (int) (Math.atan2(var167, var169) * 325.949D) & 0x7FF;
					field456 = (int) (Math.atan2(var166, var168) * -325.949D) & 0x7FF;

					if (field455 < 128) {
						field455 = 128;
					}

					if (field455 > 383) {
						field455 = 383;
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 141) {
				int var170 = field318.method81();
				method201(var170);

				if (field519 != -1) {
					method205(field519);
					field519 = -1;
					field399 = true;
					field336 = true;
				}

				if (field272 != -1) {
					method205(field272);
					field272 = -1;
					field490 = true;
				}

				if (field349 != -1) {
					method205(field349);
					field349 = -1;
				}

				if (field383 != -1) {
					method205(field383);
					field383 = -1;
				}

				if (field369 != var170) {
					method205(field369);
					field369 = var170;
				}

				field218 = false;
				field157 = true;
				field164 = -1;
				return true;
			}

			if (field164 == 184) {
				field367 = field318.method82();
				field216 = field318.method83();
				field318.method82();
				field284 = field318.method59();
				field324 = field318.method56();
				field318.method83();
				field318.method54();
				field520 = field318.method83();
				field498 = field318.method56();
				field500 = field318.method82();
				field318.method82();
				signlink.dnslookup(JQPXVJFJ.method326(field284));
				field164 = -1;
				return true;
			}

			if (field164 == 245) {
				field399 = true;
				int var171 = field318.method56();
				FMDWWBSX var172 = FMDWWBSX.method306(var171);
				int var173 = field318.method56();
				for (int var174 = 0; var174 < var173; var174++) {
					var172.field624[var174] = field318.method81();
					int var175 = field318.method74();
					if (var175 == 255) {
						var175 = field318.method59();
					}

					var172.field664[var174] = var175;
				}

				for (int var176 = var173; var176 < var172.field624.length; var176++) {
					var172.field624[var176] = 0;
					var172.field664[var176] = 0;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 65) {
				int var177 = field318.method81();
				String var178 = field318.method61();
				FMDWWBSX.method306(var177).field638 = var178;

				if (field376[field342] == FMDWWBSX.method306(var177).field630) {
					field399 = true;
				}

				field164 = -1;
				return true;
			}

			if (field164 == 26 || field164 == 215 || field164 == 27 || field164 == 192 || field164 == 204 || field164 == 12 || field164 == 62 || field164 == 33 || field164 == 76 || field164 == 11 || field164 == 106) {
				method272(field164, field318);
				field164 = -1;
				return true;
			}

			if (field164 == 253) {
				int var179 = field318.method82();
				int var180 = field318.method89();
				field207[var179] = var180;

				if (field493[var179] != var180) {
					field493[var179] = var180;
					method155(var179);
					field399 = true;

					if (field450 != -1) {
						field157 = true;
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 224) {
				method177(field163, field318);
				field325 = false;
				field164 = -1;
				return true;
			}

			if (field164 == 128) {
				int var181 = field318.method56();
				byte var182 = field318.method77();
				field207[var181] = var182;

				if (field493[var181] != var182) {
					field493[var181] = var182;
					method155(var181);
					field399 = true;

					if (field450 != -1) {
						field157 = true;
					}
				}

				field164 = -1;
				return true;
			}

			if (field164 == 191) {
				int var183 = field318.method56();
				if (var183 == 0xFFFF) {
					var183 = -1;
				}

				if (field259 != var183 && field434 && !field288 && field539 == 0) {
					field220 = var183;
					field221 = true;
					field474.method118(2, field220);
				}

				field259 = var183;
				field164 = -1;
				return true;
			}

			if (field164 == 247) {
				int var184 = field318.method81();
				int var185 = field318.method87();
				if (field434 && !field288) {
					field220 = var184;
					field221 = false;
					field474.method118(2, field220);
					field539 = var185;
				}

				field164 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field164 + "," + field163 + " - " + field481 + "," + field482);
			method229();
		} catch (IOException var190) {
			method154();
		} catch (Exception var191) {
			String var187 = "T2 - " + field164 + "," + field481 + "," + field482 + " - " + field163 + "," + (field512.field776[0] + field291) + "," + (field512.field777[0] + field292) + " - ";
			for (int var188 = 0; var188 < field163 && var188 < 50; var188++) {
				var187 = var187 + field318.field9[var188] + ",";
			}

			signlink.reporterror(var187);
			method229();
		}

		return true;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method154() {
		if (field167 > 0) {
			method229();
		} else {
			method230("Please wait - attempting to reestablish", "Connection lost");
			field219 = 0;
			field333 = 0;
			ZPYOGBCY var1 = field177;
			field180 = false;
			field150 = 0;
			method151(field329, field330, true);

			if (!field180) {
				method229();
			}

			try {
				var1.method586();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method155(int arg0) {
		int var2 = ONRKYVGF.field920[arg0].field928;
		if (var2 != 0) {
			int var3 = field493[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					PKGGFQZB.method433(0.9D);
				}

				if (var3 == 2) {
					PKGGFQZB.method433(0.8D);
				}

				if (var3 == 3) {
					PKGGFQZB.method433(0.7D);
				}

				if (var3 == 4) {
					PKGGFQZB.method433(0.6D);
				}

				RBNCRAAP.field1067.method497();
				field490 = true;
			}

			if (var2 == 3) {
				boolean var4 = field434;

				if (var3 == 0) {
					method241(0, field434);
					field434 = true;
				}

				if (var3 == 1) {
					method241(-400, field434);
					field434 = true;
				}

				if (var3 == 2) {
					method241(-800, field434);
					field434 = true;
				}

				if (var3 == 3) {
					method241(-1200, field434);
					field434 = true;
				}

				if (var3 == 4) {
					field434 = false;
				}

				if (field434 != var4 && !field288) {
					if (field434) {
						field220 = field259;
						field221 = true;
						field474.method118(2, field220);
					} else {
						method212();
					}

					field539 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field355 = true;
					method280(0);
				}

				if (var3 == 1) {
					field355 = true;
					method280(-400);
				}

				if (var3 == 2) {
					field355 = true;
					method280(-800);
				}

				if (var3 == 3) {
					field355 = true;
					method280(-1200);
				}

				if (var3 == 4) {
					field355 = false;
				}
			}

			if (var2 == 5) {
				field348 = var3;
			}

			if (var2 == 6) {
				field246 = var3;
			}

			if (var2 == 8) {
				field478 = var3;
				field157 = true;
			}

			if (var2 == 9) {
				field160 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(ILFMDWWBSX;)V")
	public final void method156(FMDWWBSX arg0) {
		int var2 = arg0.field679;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field393 == 0) {
				arg0.field638 = "Loading friend list";
				arg0.field689 = 0;
			} else if (var2 == 1 && field393 == 1) {
				arg0.field638 = "Connecting to friendserver";
				arg0.field689 = 0;
			} else if (var2 == 2 && field393 != 2) {
				arg0.field638 = "Please wait...";
				arg0.field689 = 0;
			} else {
				int var3 = field392;
				if (field393 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field638 = "";
					arg0.field689 = 0;
				} else {
					arg0.field638 = field138[var2];
					arg0.field689 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field392;
			if (field393 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field638 = "";
				arg0.field689 = 0;
			} else {
				if (field195[var2] == 0) {
					arg0.field638 = "@red@Offline";
				} else if (field195[var2] < 200) {
					if (field195[var2] == field285) {
						arg0.field638 = "@gre@World" + (field195[var2] - 9);
					} else {
						arg0.field638 = "@yel@World" + (field195[var2] - 9);
					}
				} else if (field195[var2] == field285) {
					arg0.field638 = "@gre@Classic" + (field195[var2] - 219);
				} else {
					arg0.field638 = "@yel@Classic" + (field195[var2] - 219);
				}

				arg0.field689 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field392;
			if (field393 != 2) {
				var5 = 0;
			}

			arg0.field665 = var5 * 15 + 20;
			if (arg0.field665 <= arg0.field650) {
				arg0.field665 = arg0.field650 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field393 == 0) {
				arg0.field638 = "Loading ignore list";
				arg0.field689 = 0;
			} else if (var2 == 1 && field393 == 0) {
				arg0.field638 = "Please wait...";
				arg0.field689 = 0;
			} else {
				int var6 = field396;
				if (field393 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field638 = "";
					arg0.field689 = 0;
				} else {
					arg0.field638 = JQPXVJFJ.method327(JQPXVJFJ.method324(field196[var2]));
					arg0.field689 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field665 = field396 * 15 + 20;
			if (arg0.field665 <= arg0.field650) {
				arg0.field665 = arg0.field650 + 1;
			}
		} else if (var2 == 327) {
			arg0.field677 = 150;
			arg0.field678 = (int) (Math.sin(field459 / 40.0D) * 256.0D) & 0x7FF;

			if (field497) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field526[var7];
					if (var8 >= 0 && !OQTNTOVY.field944[var8].method365()) {
						return;
					}
				}

				field497 = false;
				XBVYIDUH[] var9 = new XBVYIDUH[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field526[var11];
					if (var12 >= 0) {
						var9[var10++] = OQTNTOVY.field944[var12].method366();
					}
				}

				XBVYIDUH var13 = new XBVYIDUH(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field398[var14] != 0) {
						var13.method555(field505[var14][0], field505[var14][field398[var14]]);

						if (var14 == 1) {
							var13.method555(field233[0], field233[field398[var14]]);
						}
					}
				}

				var13.method548();
				var13.method549(SPUHKLMC.field1176[field512.field734].field1178[0]);
				var13.method558(64, 850, -30, -50, -30, true);
				arg0.field668 = 5;
				arg0.field669 = 0;
				FMDWWBSX.method307(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field320 == null) {
				field320 = arg0.field688;
				field321 = arg0.field658;
			}

			if (field438) {
				arg0.field688 = field321;
			} else {
				arg0.field688 = field320;
			}
		} else if (var2 == 325) {
			if (field320 == null) {
				field320 = arg0.field688;
				field321 = arg0.field658;
			}

			if (field438) {
				arg0.field688 = field320;
			} else {
				arg0.field688 = field321;
			}
		} else if (var2 == 600) {
			arg0.field638 = field475;
			if (field459 % 20 < 10) {
				arg0.field638 = arg0.field638 + "|";
			} else {
				arg0.field638 = arg0.field638 + " ";
			}
		} else if (var2 == 620) {
			if (field194 < 1) {
				arg0.field638 = "";
			} else if (field239) {
				arg0.field625 = 0xFF0000;
				arg0.field638 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field625 = 0xFFFFFF;
				arg0.field638 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field367 - field216;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field638 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field500 == 0) {
				arg0.field638 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field500 <= field367) {
				arg0.field638 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method157(field500);
			} else {
				int var17 = field367 + 14 - field500;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field638 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method157(field500) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field498 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field498 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field498 + " unread messages";
			}

			arg0.field638 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field324 > 0 && field324 <= field367 + 10) {
				arg0.field638 = "Last password change:\\n@gre@" + method157(field324);
			} else {
				arg0.field638 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field520 > 2 && !field287) {
				arg0.field638 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field520 > 2) {
				arg0.field638 = "\\n\\nYou have @gre@" + field520 + "@yel@ days of\\nmember credit remaining.";
			} else if (field520 > 0) {
				arg0.field638 = "You have @gre@" + field520 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field638 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field520 > 2 && !field287) {
				arg0.field638 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field520 > 0) {
				arg0.field638 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field638 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field500 > field367) {
				arg0.field638 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field638 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public final String method157(int arg0) {
		if (arg0 > field367 + 10) {
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

	@ObfuscatedName("client.f(I)Ljava/lang/String;")
	public final String method158() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1211 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.g(I)V")
	public final void method159() {
		field426 = 0;
		int var1 = (field512.field756 >> 7) + field291;
		int var2 = (field512.field757 >> 7) + field292;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field426 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field426 = 1;
		}

		if (field426 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field426 = 0;
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method160() {
		if (field288 && field185 == 2 && RQCEQFSS.field1102 != field199) {
			method230(null, "Loading - please wait.");
			field185 = 1;
			field458 = System.currentTimeMillis();
		}

		if (field185 == 1) {
			int var1 = method161();
			if (var1 != 0 && System.currentTimeMillis() - field458 > 360000L) {
				signlink.reporterror(field329 + " glcfb " + field395 + "," + var1 + "," + field288 + "," + field522[0] + "," + field474.method116() + "," + field199 + "," + field148 + "," + field149);
				field458 = System.currentTimeMillis();
			}
		}

		if (field185 == 2 && field538 != field199) {
			field538 = field199;
			method278(field199);
		}
	}

	@ObfuscatedName("client.h(I)I")
	public final int method161() {
		for (int var1 = 0; var1 < field312.length; var1++) {
			if (field312[var1] == null && field508[var1] != -1) {
				return -1;
			}

			if (field258[var1] == null && field509[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field312.length; var3++) {
			byte[] var4 = field258[var3];
			if (var4 != null) {
				int var5 = (field507[var3] >> 8) * 64 - field291;
				int var6 = (field507[var3] & 0xFF) * 64 - field292;
				if (field110) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= RQCEQFSS.method466(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field325) {
			return -4;
		} else {
			field185 = 2;
			RQCEQFSS.field1102 = field199;
			method173();
			field382.method43(178);
			return 0;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method162() {
		method169("Starting up", 20);

		if (signlink.sunjava) {
			field1202 = 5;
		}

		if (field179) {
			field510 = true;
		} else {
			field179 = true;
			boolean var1 = false;
			String var2 = method158();
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
						field522[var3] = new VXBCLRCG(signlink.cache_idx[var3], var3 + 1, 500000, signlink.cache_dat);
					}
				}

				try {
					method223();
					field437 = method242("title screen", 1, 25, "title", field230[1]);
					field241 = new BKBLJVKV("p11_full", false, field437);
					field242 = new BKBLJVKV("p12_full", false, field437);
					field243 = new BKBLJVKV("b12_full", false, field437);
					field244 = new BKBLJVKV("q8_full", true, field437);
					method232();
					method195();
					VSQMPWOM var4 = method242("config", 2, 30, "config", field230[2]);
					VSQMPWOM var5 = method242("interface", 3, 35, "interface", field230[3]);
					VSQMPWOM var6 = method242("2d graphics", 4, 40, "media", field230[4]);
					VSQMPWOM var7 = method242("textures", 6, 45, "textures", field230[6]);
					VSQMPWOM var8 = method242("chat system", 7, 50, "wordenc", field230[7]);
					VSQMPWOM var9 = method242("sound effects", 8, 55, "sounds", field230[8]);
					field406 = new byte[4][104][104];
					field156 = new int[4][105][105];
					field225 = new PJTXDRVG(104, 4, 104, field156);

					for (int var10 = 0; var10 < 4; var10++) {
						field151[var10] = new RUPQNTVM(104, 104);
					}

					field335 = new NDGQUJMA(512, 512);
					VSQMPWOM var11 = method242("update list", 5, 60, "versionlist", field230[5]);
					method169("Connecting to update server", 60);
					field474 = new BPHGILGU();
					field474.method130(var11, this);
					BKYAWERN.method111(field474.method135());
					XBVYIDUH.method538(field474.method122(0), field474);

					if (!field288) {
						field220 = 0;
						field221 = true;
						field474.method118(2, field220);

						while (field474.method116() > 0) {
							method193();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field474.field82 > 3) {
								method275("ondemand");
								return;
							}
						}
					}

					method169("Requesting animations", 65);
					int var12 = field474.method122(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field474.method118(1, var13);
					}

					while (field474.method116() > 0) {
						int var14 = var12 - field474.method116();
						if (var14 > 0) {
							method169("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method193();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field474.field82 > 3) {
							method275("ondemand");
							return;
						}
					}

					method169("Requesting models", 70);
					int var15 = field474.method122(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field474.method121(var16);
						if ((var17 & 0x1) != 0) {
							field474.method118(0, var16);
						}
					}

					int var18 = field474.method116();
					while (field474.method116() > 0) {
						int var19 = var18 - field474.method116();
						if (var19 > 0) {
							method169("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method193();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field522[0] != null) {
						method169("Requesting maps", 75);
						field474.method118(3, field474.method129(47, 0, 48));
						field474.method118(3, field474.method129(47, 1, 48));
						field474.method118(3, field474.method129(48, 0, 48));
						field474.method118(3, field474.method129(48, 1, 48));
						field474.method118(3, field474.method129(49, 0, 48));
						field474.method118(3, field474.method129(49, 1, 48));
						field474.method118(3, field474.method129(47, 0, 47));
						field474.method118(3, field474.method129(47, 1, 47));
						field474.method118(3, field474.method129(48, 0, 47));
						field474.method118(3, field474.method129(48, 1, 47));
						field474.method118(3, field474.method129(48, 0, 148));
						field474.method118(3, field474.method129(48, 1, 148));
						int var20 = field474.method116();
						while (field474.method116() > 0) {
							int var21 = var20 - field474.method116();
							if (var21 > 0) {
								method169("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method193();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field474.method122(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field474.method121(var23);
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
							field474.method136(0, var23, var25);
						}
					}

					field474.method123(field287);

					if (!field288) {
						int var26 = field474.method122(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field474.method117(var27)) {
								field474.method136(2, var27, (byte) 1);
							}
						}
					}

					method169("Unpacking media", 80);
					field313 = new RAOZRSKX(var6, "invback", 0);
					field315 = new RAOZRSKX(var6, "chatback", 0);
					field314 = new RAOZRSKX(var6, "mapback", 0);
					field501 = new RAOZRSKX(var6, "backbase1", 0);
					field502 = new RAOZRSKX(var6, "backbase2", 0);
					field503 = new RAOZRSKX(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field425[var28] = new RAOZRSKX(var6, "sideicons", var28);
					}

					field487 = new NDGQUJMA(var6, "compass", 0);
					field302 = new NDGQUJMA(var6, "mapedge", 0);
					field302.method350();

					for (int var29 = 0; var29 < 72; var29++) {
						field479[var29] = new RAOZRSKX(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 70; var30++) {
						field518[var30] = new NDGQUJMA(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field527[var31] = new NDGQUJMA(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field328[var32] = new NDGQUJMA(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field440[var33] = new NDGQUJMA(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field540[var34] = new NDGQUJMA(var6, "headicons_hint", var34);
					}

					field215 = new NDGQUJMA(var6, "overlay_multiway", 0);
					field528 = new NDGQUJMA(var6, "mapmarker", 0);
					field529 = new NDGQUJMA(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field178[var35] = new NDGQUJMA(var6, "cross", var35);
					}

					field234 = new NDGQUJMA(var6, "mapdots", 0);
					field235 = new NDGQUJMA(var6, "mapdots", 1);
					field236 = new NDGQUJMA(var6, "mapdots", 2);
					field237 = new NDGQUJMA(var6, "mapdots", 3);
					field238 = new NDGQUJMA(var6, "mapdots", 4);
					field515 = new RAOZRSKX(var6, "scrollbar", 0);
					field516 = new RAOZRSKX(var6, "scrollbar", 1);
					field170 = new RAOZRSKX(var6, "redstone1", 0);
					field171 = new RAOZRSKX(var6, "redstone2", 0);
					field172 = new RAOZRSKX(var6, "redstone3", 0);
					field173 = new RAOZRSKX(var6, "redstone1", 0);
					field173.method443();
					field174 = new RAOZRSKX(var6, "redstone2", 0);
					field174.method443();
					field462 = new RAOZRSKX(var6, "redstone1", 0);
					field462.method444();
					field463 = new RAOZRSKX(var6, "redstone2", 0);
					field463.method444();
					field464 = new RAOZRSKX(var6, "redstone3", 0);
					field464.method444();
					field465 = new RAOZRSKX(var6, "redstone1", 0);
					field465.method443();
					field465.method444();
					field466 = new RAOZRSKX(var6, "redstone2", 0);
					field466.method443();
					field466.method444();

					for (int var36 = 0; var36 < 2; var36++) {
						field119[var36] = new RAOZRSKX(var6, "mod_icons", var36);
					}

					NDGQUJMA var37 = new NDGQUJMA(var6, "backleft1", 0);
					field408 = new ZTWZAULT(method271(), var37.field913, var37.field914);
					var37.method351(0, 0);
					NDGQUJMA var38 = new NDGQUJMA(var6, "backleft2", 0);
					field409 = new ZTWZAULT(method271(), var38.field913, var38.field914);
					var38.method351(0, 0);
					NDGQUJMA var39 = new NDGQUJMA(var6, "backright1", 0);
					field410 = new ZTWZAULT(method271(), var39.field913, var39.field914);
					var39.method351(0, 0);
					NDGQUJMA var40 = new NDGQUJMA(var6, "backright2", 0);
					field411 = new ZTWZAULT(method271(), var40.field913, var40.field914);
					var40.method351(0, 0);
					NDGQUJMA var41 = new NDGQUJMA(var6, "backtop1", 0);
					field412 = new ZTWZAULT(method271(), var41.field913, var41.field914);
					var41.method351(0, 0);
					NDGQUJMA var42 = new NDGQUJMA(var6, "backvmid1", 0);
					field413 = new ZTWZAULT(method271(), var42.field913, var42.field914);
					var42.method351(0, 0);
					NDGQUJMA var43 = new NDGQUJMA(var6, "backvmid2", 0);
					field414 = new ZTWZAULT(method271(), var43.field913, var43.field914);
					var43.method351(0, 0);
					NDGQUJMA var44 = new NDGQUJMA(var6, "backvmid3", 0);
					field415 = new ZTWZAULT(method271(), var44.field913, var44.field914);
					var44.method351(0, 0);
					NDGQUJMA var45 = new NDGQUJMA(var6, "backhmid2", 0);
					field416 = new ZTWZAULT(method271(), var45.field913, var45.field914);
					var45.method351(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field518[var50] != null) {
							field518[var50].method349(var46 + var49, var47 + var49, var48 + var49);
						}

						if (field479[var50] != null) {
							field479[var50].method445(var46 + var49, var47 + var49, var48 + var49);
						}
					}

					method169("Unpacking textures", 83);
					PKGGFQZB.method429(var7);
					PKGGFQZB.method433(0.8D);
					PKGGFQZB.method428(20);
					method169("Unpacking config", 86);
					SPUHKLMC.method506(var4);
					YCVHWRKK.method577(var4);
					GJDLZXKK.method311(var4);
					RBNCRAAP.method458(var4);
					SHKUIFHF.method503(var4);
					OQTNTOVY.method363(var4);
					CRSWMDQF.method297(var4);
					ONRKYVGF.method361(var4);
					USQYPEQB.method519(var4);
					RBNCRAAP.field1100 = field287;

					if (!field288) {
						method169("Unpacking sounds", 90);
						byte[] var51 = var9.method526("sounds.dat", null);
						BFQIDHPO var52 = new BFQIDHPO(var51);
						LOEGFAGM.method338(var52);
					}

					method169("Unpacking interfaces", 95);
					BKBLJVKV[] var53 = new BKBLJVKV[] { field241, field242, field243, field244 };
					FMDWWBSX.method301(var5, var53, var6);
					method169("Preparing game engine", 100);

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field314.field1045[field314.field1047 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field205[var54] = var55;
						field223[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field314.field1045[field314.field1047 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field345[var58 - 5] = var59 - 25;
						field123[var58 - 5] = var60 - var59;
					}

					PKGGFQZB.method426(765, 503);
					field389 = PKGGFQZB.field1028;
					PKGGFQZB.method426(479, 96);
					field386 = PKGGFQZB.field1028;
					PKGGFQZB.method426(190, 261);
					field387 = PKGGFQZB.field1028;
					PKGGFQZB.method426(512, 334);
					field388 = PKGGFQZB.field1028;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = PKGGFQZB.field1026[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					PJTXDRVG.method409(var62, 334, 500, 800, 512);
					AYSHFCKR.method1(var8);
					field427 = new ZRJULOYY(this);
					method180(field427, 10);
					VXTLNFMD.field1334 = this;
					YCVHWRKK.field1460 = this;
					SHKUIFHF.field1150 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field303 + " " + field407);
					field162 = true;
				}
			} else {
				field360 = true;
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method163(long arg0) {
		if (arg0 != 0L) {
			if (field392 >= 100 && field222 != 1) {
				method192("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field392 >= 200) {
				method192("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = JQPXVJFJ.method327(JQPXVJFJ.method324(arg0));
				for (int var4 = 0; var4 < field392; var4++) {
					if (field124[var4] == arg0) {
						method192("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field396; var5++) {
					if (field196[var5] == arg0) {
						method192("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field512.field819)) {
					field138[field392] = var3;
					field124[field392] = arg0;
					field195[field392] = 0;
					field392++;
					field399 = true;
					field382.method43(23);
					field382.method50(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method164() {
		for (ITKUXCXG var1 = (ITKUXCXG) field153.method598(); var1 != null; var1 = (ITKUXCXG) field153.method600()) {
			if (field199 != var1.field832 || var1.field831) {
				var1.method329();
			} else if (field459 >= var1.field836) {
				var1.method322(field517);

				if (var1.field831) {
					var1.method329();
				} else {
					field225.method384(0, var1.field832, var1.field834, 60, var1.field835, var1, -1, false, var1.field833);
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method165() {
		if (field1209 == null) {
			method235();
			field139 = null;
			field140 = null;
			field141 = null;
			field142 = null;
			field143 = null;
			field144 = null;
			field145 = null;
			field146 = null;
			field147 = null;
			field271 = null;
			field269 = null;
			field268 = null;
			field270 = null;
			field189 = null;
			field190 = null;
			field191 = null;
			field1209 = new ZTWZAULT(method271(), 765, 503);
			field490 = true;
		}
	}

	@ObfuscatedName("client.j(I)V")
	public static final void method166() {
		PJTXDRVG.field954 = false;
		PKGGFQZB.field1017 = false;
		field288 = false;
		RQCEQFSS.field1101 = false;
		YCVHWRKK.field1449 = false;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method167() {
		if (field168 > 1) {
			field168--;
		}

		if (field167 > 0) {
			field167--;
		}

		for (int var1 = 0; var1 < 5 && method153(); var1++) {
		}

		if (field180) {
			synchronized (field427.field1507) {
				if (!field327) {
					field427.field1502 = 0;
				} else if (field1222 != 0 || field427.field1502 >= 40) {
					field382.method43(158);
					field382.method44(0);
					int var3 = field382.field10;
					int var4 = 0;
					for (int var5 = 0; var5 < field427.field1502 && var3 - field382.field10 < 240; var5++) {
						var4++;
						int var6 = field427.field1505[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field427.field1503[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field427.field1505[var5] == -1 && field427.field1503[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field182 != var7 || field183 != var6) {
							int var9 = var7 - field182;
							field182 = var7;
							int var10 = var6 - field183;
							field183 = var6;

							if (field378 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field382.method45((field378 << 12) + (var9 << 6) + var10);
								field378 = 0;
							} else if (field378 < 8) {
								field382.method47((field378 << 19) + var8 + 0x800000);
								field378 = 0;
							} else {
								field382.method48((field378 << 19) + var8 - 0x40000000);
								field378 = 0;
							}
						} else if (field378 < 2047) {
							field378++;
						}
					}

					field382.method53(field382.field10 - var3);

					if (var4 >= field427.field1502) {
						field427.field1502 = 0;
					} else {
						field427.field1502 -= var4;
						for (int var11 = 0; var11 < field427.field1502; var11++) {
							field427.field1503[var11] = field427.field1503[var4 + var11];
							field427.field1505[var11] = field427.field1505[var4 + var11];
						}
					}
				}
			}

			if (field1222 != 0) {
				long var12 = (field1225 - field297) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field297 = field1225;
				int var14 = field1224;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1223;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1222 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field382.method43(126);
				field382.method48((var17 << 19) + (var18 << 20) + var16);
			}

			if (field300 > 0) {
				field300--;
			}

			if (field1226[1] == 1 || field1226[2] == 1 || field1226[3] == 1 || field1226[4] == 1) {
				field301 = true;
			}

			if (field301 && field300 <= 0) {
				field300 = 20;
				field301 = false;
				field382.method43(165);
				field382.method45(field372);
				field382.method79(field373);
			}

			if (field1213 && !field457) {
				field457 = true;
				field382.method43(207);
				field382.method44(1);
			}

			if (!field1213 && field457) {
				field457 = false;
				field382.method43(207);
				field382.method44(0);
			}

			method160();
			method289();
			method174();
			field311++;
			if (field311 > 87) {
				field311 = 0;
				field382.method43(1);
			}

			field165++;
			if (field165 > 750) {
				method154();
			}

			method191();
			method262();
			method237();
			field283++;
			if (field283 > 75) {
				field283 = 0;
				field382.method43(22);
			}

			field517++;

			if (field449 != 0) {
				field448 += 20;
				if (field448 >= 400) {
					field449 = 0;
				}
			}

			if (field424 != 0) {
				field421++;
				if (field421 >= 15) {
					if (field424 == 2) {
						field399 = true;
					}

					if (field424 == 3) {
						field157 = true;
					}

					field424 = 0;
				}
			}

			if (field307 != 0) {
				field176++;

				if (field1216 > field308 + 5 || field1216 < field308 - 5 || field1217 > field309 + 5 || field1217 < field309 - 5) {
					field261 = true;
				}

				if (field1215 == 0) {
					if (field307 == 2) {
						field399 = true;
					}

					if (field307 == 3) {
						field157 = true;
					}

					field307 = 0;

					if (field261 && field176 >= 5) {
						field364 = -1;
						method240();

						if (field364 == field305 && field363 != field306) {
							FMDWWBSX var19 = FMDWWBSX.method306(field305);
							byte var20 = 0;
							if (field160 == 1 && var19.field679 == 206) {
								var20 = 1;
							}

							if (var19.field624[field363] <= 0) {
								var20 = 0;
							}

							if (var19.field628) {
								int var21 = field306;
								int var22 = field363;
								var19.field624[var22] = var19.field624[var21];
								var19.field664[var22] = var19.field664[var21];
								var19.field624[var21] = -1;
								var19.field664[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field306;
								int var24 = field363;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method302(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method302(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method302(field306, field363);
							}

							field382.method43(217);
							field382.method71(var20);
							field382.method79(field305);
							field382.method79(field306);
							field382.method79(field363);
						}
					} else if ((field348 == 1 || method206(field260 - 1)) && field260 > 2) {
						method176();
					} else if (field260 > 0) {
						method248(field260 - 1);
					}

					field421 = 10;
					field1222 = 0;
				}
			}

			field469++;
			if (field469 > 1083) {
				field469 = 0;
				field382.method43(44);
				field382.method44(0);
				int var25 = field382.field10;

				if ((int) (Math.random() * 2.0D) == 0) {
					field382.method44(197);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field382.method44(248);
				}

				field382.method45((int) (Math.random() * 65536.0D));
				field382.method44(169);
				field382.method44((int) (Math.random() * 256.0D));
				field382.method45((int) (Math.random() * 65536.0D));
				field382.method44(192);
				field382.method44(124);

				if ((int) (Math.random() * 2.0D) == 0) {
					field382.method44(81);
				}

				field382.method45((int) (Math.random() * 65536.0D));
				field382.method53(field382.field10 - var25);
			}

			if (PJTXDRVG.field988 != -1) {
				int var26 = PJTXDRVG.field988;
				int var27 = PJTXDRVG.field989;
				boolean var28 = method217(0, 0, var27, true, 0, var26, 0, field512.field776[0], field512.field777[0], 0, 0);
				PJTXDRVG.field988 = -1;

				if (var28) {
					field446 = field1223;
					field447 = field1224;
					field449 = 1;
					field448 = 0;
				}
			}

			if (field1222 == 1 && field514 != null) {
				field514 = null;
				field157 = true;
				field1222 = 0;
			}

			method243();

			if (field272 == -1) {
				method294();
				method226();
				method182();
			}

			if (field1215 == 1 || field1222 == 1) {
				field476++;
			}

			if (field112 == 0 && field159 == 0 && field203 == 0) {
				if (field201 > 0) {
					field201--;
				}
			} else if (field201 < 100) {
				field201++;
				if (field201 == 100) {
					if (field112 != 0) {
						field157 = true;
					}

					if (field159 != 0) {
						field399 = true;
					}
				}
			}

			if (field185 == 2) {
				method256();
			}

			if (field185 == 2 && field120) {
				method295();
			}

			for (int var29 = 0; var29 < 5; var29++) {
				field377[var29]++;
			}

			method233();
			field1214++;
			if (field1214 > 4500) {
				field167 = 250;
				field1214 -= 500;
				field382.method43(82);
			}

			field362++;
			if (field362 > 500) {
				field362 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field136 += field137;
				}

				if ((var30 & 0x2) == 2) {
					field192 += field193;
				}

				if ((var30 & 0x4) == 4) {
					field491 += field492;
				}
			}

			if (field136 < -50) {
				field137 = 2;
			}

			if (field136 > 50) {
				field137 = -2;
			}

			if (field192 < -55) {
				field193 = 2;
			}

			if (field192 > 55) {
				field193 = -2;
			}

			if (field491 < -40) {
				field492 = 1;
			}

			if (field491 > 40) {
				field492 = -1;
			}

			field489++;
			if (field489 > 500) {
				field489 = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 1) {
					field370 += field371;
				}

				if ((var31 & 0x2) == 2) {
					field460 += field461;
				}
			}

			if (field370 < -60) {
				field371 = 2;
			}

			if (field370 > 60) {
				field371 = -2;
			}

			if (field460 < -20) {
				field461 = 1;
			}

			if (field460 > 10) {
				field461 = -1;
			}

			field166++;
			if (field166 > 50) {
				field382.method43(54);
			}

			try {
				if (field177 != null && field382.field10 > 0) {
					field177.method590(field382.field10, field382.field9, 0);
					field382.field10 = 0;
					field166 = 0;
				}
			} catch (IOException var33) {
				method154();
			} catch (Exception var34) {
				method229();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		IYAQHTAH var10 = null;
		for (IYAQHTAH var11 = (IYAQHTAH) field152.method598(); var11 != null; var11 = (IYAQHTAH) field152.method600()) {
			if (var11.field845 == arg7 && var11.field847 == arg6 && var11.field848 == arg1 && var11.field846 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new IYAQHTAH();
			var10.field845 = arg7;
			var10.field846 = arg2;
			var10.field847 = arg6;
			var10.field848 = arg1;
			method293(var10);
			field152.method595(var10);
		}

		var10.field849 = arg4;
		var10.field851 = arg8;
		var10.field850 = arg0;
		var10.field840 = arg3;
		var10.field844 = arg5;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IB)V")
	public final void method169(String arg0, int arg1) {
		field407 = arg1;
		field303 = arg0;
		method254();

		if (field437 == null) {
			super.method169(arg0, arg1);
		} else {
			field141.method592();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field243.method96(var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...", var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			CCFLBOBS.method144(var6, 0x8C1111, var3 / 2 - 152, 34, 304);
			CCFLBOBS.method144(var6 + 1, 0, var3 / 2 - 151, 32, 302);
			CCFLBOBS.method143(0x8C1111, var3 / 2 - 150, var6 + 2, arg1 * 3, 30);
			CCFLBOBS.method143(0, arg1 * 3 + var3 / 2 - 150, var6 + 2, 300 - arg1 * 3, 30);
			field243.method96(var4 / 2 + 5 - var5, 0xFFFFFF, arg0, var3 / 2);
			field141.method593(field1208, 202, 171);

			if (field490) {
				field490 = false;

				if (!field154) {
					field142.method593(field1208, 0, 0);
					field143.method593(field1208, 637, 0);
				}

				field139.method593(field1208, 128, 0);
				field140.method593(field1208, 202, 371);
				field144.method593(field1208, 0, 265);
				field145.method593(field1208, 562, 265);
				field146.method593(field1208, 128, 171);
				field147.method593(field1208, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static final String method170(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IJ)V")
	public final void method171(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field396; var3++) {
				if (field196[var3] == arg0) {
					field396--;
					field399 = true;

					for (int var4 = var3; var4 < field396; var4++) {
						field196[var4] = field196[var4 + 1];
					}

					field382.method43(12);
					field382.method50(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method172() {
		field271.method592();
		PKGGFQZB.field1028 = field386;
		field315.method446(0, 0);

		if (field257) {
			field243.method96(40, 0, field155, 239);
			field243.method96(60, 128, field126 + "*", 239);
		} else if (field530 == 1) {
			field243.method96(40, 0, "Enter amount:", 239);
			field243.method96(60, 128, field400 + "*", 239);
		} else if (field530 == 2) {
			field243.method96(40, 0, "Enter name:", 239);
			field243.method96(60, 128, field400 + "*", 239);
		} else if (field530 == 3) {
			if (field400 != field252) {
				method238(field400);
				field252 = field400;
			}

			BKBLJVKV var1 = field242;
			CCFLBOBS.method140(0, 0, 463, 77);

			for (int var2 = 0; var2 < field253; var2++) {
				int var3 = var2 * 14 + 18 - field256;
				if (var3 > 0 && var3 < 110) {
					var1.method96(var3, 0, field254[var2], 239);
				}
			}

			CCFLBOBS.method139();

			if (field253 > 5) {
				method292(463, 0, field256, field253 * 14 + 7, 77);
			}

			if (field400.length() == 0) {
				field243.method96(40, 255, "Enter object name", 239);
			} else if (field253 == 0) {
				field243.method96(40, 0, "No matching objects found, please shorten search", 239);
			}

			var1.method96(90, 0, field400 + "*", 239);
			CCFLBOBS.method146(479, 0, 0, 77);
		} else if (field514 != null) {
			field243.method96(40, 0, field514, 239);
			field243.method96(60, 128, "Click to continue", 239);
		} else if (field369 != -1) {
			method208(0, 0, 0, FMDWWBSX.method306(field369));
		} else if (field450 == -1) {
			BKBLJVKV var4 = field242;
			int var5 = 0;
			CCFLBOBS.method140(0, 0, 463, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field525[var6] != null) {
					int var7 = field523[var6];
					int var8 = field468 + 70 - var5 * 14;
					String var9 = field524[var6];
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
							var4.method100(var8, field525[var6], 4, 0);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field504 == 0 || field504 == 1 && method247(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field119[0].method446(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field119[1].method446(var8 - 12, var11);
								var11 += 14;
							}

							var4.method100(var8, var9 + ":", var11, 0);
							var11 += var4.method98(var9) + 8;
							var4.method100(var8, field525[var6], var11, 255);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field478 == 0 && (var7 == 7 || field365 == 0 || field365 == 1 && method247(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method100(var8, "From", var12, 0);
							int var14 = var12 + var4.method98("From ");
							if (var10 == 1) {
								field119[0].method446(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field119[1].method446(var8 - 12, var14);
								var14 += 14;
							}

							var4.method100(var8, var9 + ":", var14, 0);
							var14 += var4.method98(var9) + 8;
							var4.method100(var8, field525[var6], var14, 0x800000);
						}

						var5++;
					}

					if (var7 == 4 && (field494 == 0 || field494 == 1 && method247(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method100(var8, var9 + " " + field525[var6], 4, 0x800080);
						}

						var5++;
					}

					if (var7 == 5 && field478 == 0 && field365 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method100(var8, field525[var6], 4, 0x800000);
						}

						var5++;
					}

					if (var7 == 6 && field478 == 0 && field365 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method100(var8, "To " + var9 + ":", 4, 0);
							var4.method100(var8, field525[var6], var4.method98("To " + var9) + 12, 0x800000);
						}

						var5++;
					}

					if (var7 == 8 && (field494 == 0 || field494 == 1 && method247(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method100(var8, var9 + " " + field525[var6], 4, 0x7E3200);
						}

						var5++;
					}
				}
			}

			CCFLBOBS.method139();
			field385 = var5 * 14 + 7;
			if (field385 < 78) {
				field385 = 78;
			}

			method292(463, 0, field385 - field468 - 77, field385, 77);
			String var13;
			if (field512 == null || field512.field819 == null) {
				var13 = JQPXVJFJ.method327(field329);
			} else {
				var13 = field512.field819;
			}

			var4.method100(90, var13 + ":", 4, 0);
			var4.method100(90, field202 + "*", var4.method98(var13 + ": ") + 6, 255);
			CCFLBOBS.method146(479, 0, 0, 77);
		} else {
			method208(0, 0, 0, FMDWWBSX.method306(field450));
		}

		if (field229 && field247 == 2) {
			method184();
		}

		field271.method593(field1208, 17, 357);
		field270.method592();
		PKGGFQZB.field1028 = field388;
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method173() {
		try {
			field538 = -1;
			field153.method602();
			field204.method602();
			PKGGFQZB.method427();
			method225();
			field225.method373();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field151[var1].method483();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field406[var2][var3][var4] = 0;
					}
				}
			}

			RQCEQFSS var5 = new RQCEQFSS(field406, field156, 104, 104);
			int var6 = field312.length;
			field382.method43(54);

			if (!field110) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field507[var7] >> 8) * 64 - field291;
					int var9 = (field507[var7] & 0xFF) * 64 - field292;
					byte[] var10 = field312[var7];
					if (var10 != null) {
						var5.method463(var10, (field149 - 6) * 8, (field148 - 6) * 8, field151, var8, var9);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field507[var11] >> 8) * 64 - field291;
					int var13 = (field507[var11] & 0xFF) * 64 - field292;
					byte[] var14 = field312[var11];
					if (var14 == null && field149 < 800) {
						var5.method462(64, 64, var13, var12);
					}
				}

				field382.method43(54);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field258[var15];
					if (var16 != null) {
						int var17 = (field507[var15] >> 8) * 64 - field291;
						int var18 = (field507[var15] & 0xFF) * 64 - field292;
						var5.method464(var18, var17, field225, var16, field151);
					}
				}
			}

			if (field110) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field282[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field507.length; var29++) {
									if (field507[var29] == var28 && field312[var29] != null) {
										var5.method467(var25, (var26 & 0x7) * 8, var21 * 8, var19, field312[var29], field151, var20 * 8, (var27 & 0x7) * 8, var24);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method461(var20 * 8, var19, var21 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field282[0][var30][var31];
						if (var32 == -1) {
							var5.method462(8, 8, var31 * 8, var30 * 8);
						}
					}
				}

				field382.method43(54);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field282[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field507.length; var42++) {
									if (field507[var42] == var41 && field258[var42] != null) {
										var5.method476((var40 & 0x7) * 8, var35 * 8, field225, var38, var33, field151, (var39 & 0x7) * 8, field258[var42], var37, var34 * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field382.method43(54);
			var5.method474(field225, field151);

			if (field270 != null) {
				field270.method592();
				PKGGFQZB.field1028 = field388;
			}

			field382.method43(54);
			int var43 = RQCEQFSS.field1119;
			if (var43 > field199) {
				var43 = field199;
			}

			if (var43 < field199 - 1) {
				int var44 = field199 - 1;
			}

			if (field288) {
				field225.method374(RQCEQFSS.field1119);
			} else {
				field225.method374(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method213(var45, var46);
				}
			}

			method252();
		} catch (Exception var59) {
		}

		YCVHWRKK.field1454.method497();

		if (field1211 != null) {
			field382.method43(120);
			field382.method48(1057001181);
		}

		if (field288 && signlink.cache_dat != null) {
			int var48 = field474.method122(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field474.method121(var49);
				if ((var50 & 0x79) == 0) {
					XBVYIDUH.method540(var49);
				}
			}
		}

		System.gc();
		PKGGFQZB.method428(20);
		field474.method132();
		int var51 = (field148 - 6) / 8 - 1;
		int var52 = (field148 + 6) / 8 + 1;
		int var53 = (field149 - 6) / 8 - 1;
		int var54 = (field149 + 6) / 8 + 1;
		if (field206) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field474.method129(var55, 0, var56);
					if (var57 != -1) {
						field474.method133(3, var57);
					}

					int var58 = field474.method129(var55, 1, var56);
					if (var58 != -1) {
						field474.method133(3, var58);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method174() {
		for (int var1 = 0; var1 < field175; var1++) {
			if (field133[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field310[var1] != field161 || field537[var1] != field323) {
						BFQIDHPO var3 = LOEGFAGM.method339(field537[var1], field310[var1]);
						if (System.currentTimeMillis() + var3.field10 / 22 > field391 / 22 + field488) {
							field391 = var3.field10;
							field488 = System.currentTimeMillis();

							if (method234(var3.field10, var3.field9)) {
								field161 = field310[var1];
								field323 = field537[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method246()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field382.method43(156);
						field382.method45(field310[var1] & 0x7FFF);
					} else {
						field382.method43(156);
						field382.method45(-1);
					}
				}

				if (var2 && field133[var1] != -5) {
					field133[var1] = -5;
				} else {
					field175--;
					for (int var5 = var1; var5 < field175; var5++) {
						field310[var5] = field310[var5 + 1];
						field537[var5] = field537[var5 + 1];
						field133[var5] = field133[var5 + 1];
					}

					var1--;
				}
			} else {
				field133[var1]--;
			}
		}

		if (field539 > 0) {
			field539 -= 20;
			if (field539 < 0) {
				field539 = 0;
			}

			if (field539 == 0 && field434 && !field288) {
				field220 = field259;
				field221 = true;
				field474.method118(2, field220);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(III)V")
	public final void method175(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field525[var4] != null) {
				int var5 = field523[var4];
				int var6 = field468 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field524[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field504 == 0 || field504 == 1 && method247(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field512.field819)) {
						if (field194 >= 1) {
							field344[field260] = "Report abuse @whi@" + var7;
							field117[field260] = 414;
							field260++;
						}

						field344[field260] = "Add ignore @whi@" + var7;
						field117[field260] = 872;
						field260++;
						field344[field260] = "Add friend @whi@" + var7;
						field117[field260] = 106;
						field260++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field478 == 0 && (var5 == 7 || field365 == 0 || field365 == 1 && method247(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field194 >= 1) {
							field344[field260] = "Report abuse @whi@" + var7;
							field117[field260] = 414;
							field260++;
						}

						field344[field260] = "Add ignore @whi@" + var7;
						field117[field260] = 872;
						field260++;
						field344[field260] = "Add friend @whi@" + var7;
						field117[field260] = 106;
						field260++;
					}

					var3++;
				}

				if (var5 == 4 && (field494 == 0 || field494 == 1 && method247(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field344[field260] = "Accept trade @whi@" + var7;
						field117[field260] = 416;
						field260++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field478 == 0 && field365 < 2) {
					var3++;
				}

				if (var5 == 8 && (field494 == 0 || field494 == 1 && method247(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field344[field260] = "Accept challenge @whi@" + var7;
						field117[field260] = 918;
						field260++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method176() {
		int var1 = field243.method98("Choose Option");
		for (int var2 = 0; var2 < field260; var2++) {
			int var3 = field243.method98(field344[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field260 * 15 + 21;
		if (field1223 > 4 && field1224 > 4 && field1223 < 516 && field1224 < 338) {
			int var5 = field1223 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1224 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field229 = true;
			field247 = 0;
			field248 = var5;
			field249 = var6;
			field250 = var1;
			field251 = field260 * 15 + 22;
		}

		if (field1223 > 553 && field1224 > 205 && field1223 < 743 && field1224 < 466) {
			int var7 = field1223 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1224 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field229 = true;
			field247 = 1;
			field248 = var7;
			field249 = var8;
			field250 = var1;
			field251 = field260 * 15 + 22;
		}

		if (field1223 > 17 && field1224 > 357 && field1223 < 496 && field1224 < 453) {
			int var9 = field1223 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1224 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field229 = true;
			field247 = 2;
			field248 = var9;
			field249 = var10;
			field250 = var1;
			field251 = field260 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(IILBFQIDHPO;)V")
	public final void method177(int arg0, BFQIDHPO arg1) {
		field472 = 0;
		field278 = 0;
		method257(arg0, arg1);
		method222(arg0, arg1);
		method251(arg0, arg1);
		method183(arg0, arg1);

		for (int var3 = 0; var3 < field472; var3++) {
			int var4 = field473[var3];
			if (field459 != field275[var4].field755) {
				field275[var4] = null;
			}
		}

		if (arg1.field10 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field10 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field276; var5++) {
			if (field275[field277[var5]] == null) {
				signlink.reporterror(field329 + " null entry in pl list - pos:" + var5 + " size:" + field276);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(BLBFQIDHPO;I)V")
	public final void method178(BFQIDHPO arg0, int arg1) {
		arg0.method64();
		int var3 = arg0.method65(8);
		if (var3 < field403) {
			for (int var4 = var3; var4 < field403; var4++) {
				field473[field472++] = field404[var4];
			}
		}

		if (var3 > field403) {
			signlink.reporterror(field329 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field403 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field404[var5];
			BFCMZACY var7 = field402[var6];
			int var8 = arg0.method65(1);
			if (var8 == 0) {
				field404[field403++] = var6;
				var7.field755 = field459;
			} else {
				int var9 = arg0.method65(2);
				if (var9 == 0) {
					field404[field403++] = var6;
					var7.field755 = field459;
					field279[field278++] = var6;
				} else if (var9 == 1) {
					field404[field403++] = var6;
					var7.field755 = field459;
					int var10 = arg0.method65(3);
					var7.method317(var10, false);
					int var11 = arg0.method65(1);
					if (var11 == 1) {
						field279[field278++] = var6;
					}
				} else if (var9 == 2) {
					field404[field403++] = var6;
					var7.field755 = field459;
					int var12 = arg0.method65(3);
					var7.method317(var12, true);
					int var13 = arg0.method65(3);
					var7.method317(var13, true);
					int var14 = arg0.method65(1);
					if (var14 == 1) {
						field279[field278++] = var6;
					}
				} else if (var9 == 3) {
					field473[field472++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method179(int arg0) {
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

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method180(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method180(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(ILNDGQUJMA;II)V")
	public final void method181(int arg0, NDGQUJMA arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field373 + field370 & 0x7FF;
			int var6 = XBVYIDUH.field1415[var5];
			int var7 = XBVYIDUH.field1416[var5];
			var6 = var6 * 256 / (field460 + 256);
			var7 = var7 * 256 / (field460 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field302.method358(83 - var13 - 20, 15, var10, 20, 15, 20, 256, var12 + 94 + 4 - 10);
		} else {
			method202(arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method182() {
		if (field1222 == 1) {
			if (field1223 >= 6 && field1223 <= 106 && field1224 >= 467 && field1224 <= 499) {
				field504 = (field504 + 1) % 4;
				field428 = true;
				field157 = true;
				field382.method43(83);
				field382.method44(field504);
				field382.method44(field365);
				field382.method44(field494);
			}

			if (field1223 >= 135 && field1223 <= 235 && field1224 >= 467 && field1224 <= 499) {
				field365 = (field365 + 1) % 3;
				field428 = true;
				field157 = true;
				field382.method43(83);
				field382.method44(field504);
				field382.method44(field365);
				field382.method44(field494);
			}

			if (field1223 >= 273 && field1223 <= 373 && field1224 >= 467 && field1224 <= 499) {
				field494 = (field494 + 1) % 3;
				field428 = true;
				field157 = true;
				field382.method43(83);
				field382.method44(field504);
				field382.method44(field365);
				field382.method44(field494);
			}

			if (field1223 >= 412 && field1223 <= 512 && field1224 >= 467 && field1224 <= 499) {
				if (field383 == -1) {
					method260();
					field475 = "";
					field239 = false;
					field319 = field383 = FMDWWBSX.field651;
					return;
				}

				method192("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ILBFQIDHPO;Z)V")
	public final void method183(int arg0, BFQIDHPO arg1) {
		for (int var3 = 0; var3 < field278; var3++) {
			int var4 = field279[var3];
			IOPHRJNF var5 = field275[var4];
			int var6 = arg1.method54();
			if ((var6 & 0x20) != 0) {
				var6 += arg1.method54() << 8;
			}

			method281(var5, var4, var6, arg1);
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method184() {
		int var1 = field248;
		int var2 = field249;
		int var3 = field250;
		int var4 = field251;
		int var5 = 0x5D5447;
		CCFLBOBS.method143(var5, var1, var2, var3, var4);
		CCFLBOBS.method143(0, var1 + 1, var2 + 1, var3 - 2, 16);
		CCFLBOBS.method144(var2 + 18, 0, var1 + 1, var4 - 19, var3 - 2);
		field243.method100(var2 + 14, "Choose Option", var1 + 3, var5);
		int var6 = field1216;
		int var7 = field1217;
		if (field247 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field247 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field247 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field260; var8++) {
			int var9 = (field260 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field243.method104(true, var9, var1 + 3, var10, field344[var8]);
		}
	}

	@ObfuscatedName("client.o(I)V")
	public static final void method185() {
		PJTXDRVG.field954 = true;
		PKGGFQZB.field1017 = true;
		field288 = true;
		RQCEQFSS.field1101 = true;
		YCVHWRKK.field1449 = true;
	}

	@ObfuscatedName("client.a(IIBIIIII)V")
	public final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 1 && arg4 >= 1 && arg3 <= 102 && arg4 <= 102) {
			if (field288 && field199 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field225.method399(arg2, arg3, arg4);
			}

			if (arg1 == 1) {
				var8 = field225.method400(arg2, arg3, arg4);
			}

			if (arg1 == 2) {
				var8 = field225.method401(arg2, arg3, arg4);
			}

			if (arg1 == 3) {
				var8 = field225.method402(arg2, arg3, arg4);
			}

			if (var8 != 0) {
				int var12 = field225.method403(arg2, arg3, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field225.method390(arg4, arg3, arg2);
					YCVHWRKK var16 = YCVHWRKK.method575(var13);
					if (var16.field1488) {
						field151[arg2].method488(var14, arg3, arg4, var16.field1459, var15);
					}
				}

				if (arg1 == 1) {
					field225.method391(arg2, arg3, arg4);
				}

				if (arg1 == 2) {
					field225.method392(arg4, arg3, arg2);
					YCVHWRKK var17 = YCVHWRKK.method575(var13);
					if (var17.field1462 + arg3 > 103 || var17.field1462 + arg4 > 103 || var17.field1470 + arg3 > 103 || var17.field1470 + arg4 > 103) {
						return;
					}

					if (var17.field1488) {
						field151[arg2].method489(var17.field1470, var17.field1462, var15, arg4, arg3, var17.field1459);
					}
				}

				if (arg1 == 3) {
					field225.method393(arg4, arg3, arg2);
					YCVHWRKK var18 = YCVHWRKK.method575(var13);
					if (var18.field1488 && var18.field1456) {
						field151[arg2].method491(arg3, arg4);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field406[1][arg3][arg4] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				RQCEQFSS.method472(var19, arg2, field156, arg5, arg0, arg4, arg6, arg3, field151[arg2], field225);
				return;
			}
		}
	}

	@ObfuscatedName("client.p(I)I")
	public final int method187() {
		int var1 = 3;
		if (field455 < 310) {
			field296++;
			if (field296 > 143) {
				field296 = 0;
				field382.method43(60);
				field382.method44(254);
			}

			int var2 = field452 >> 7;
			int var3 = field454 >> 7;
			int var4 = field512.field756 >> 7;
			int var5 = field512.field757 >> 7;

			if ((field406[field199][var2][var3] & 0x4) != 0) {
				var1 = field199;
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

					if ((field406[field199][var2][var3] & 0x4) != 0) {
						var1 = field199;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field406[field199][var2][var3] & 0x4) != 0) {
							var1 = field199;
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

					if ((field406[field199][var2][var3] & 0x4) != 0) {
						var1 = field199;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field406[field199][var2][var3] & 0x4) != 0) {
							var1 = field199;
						}
					}
				}
			}
		}

		if ((field406[field199][field512.field756 >> 7][field512.field757 >> 7] & 0x4) != 0) {
			var1 = field199;
		}

		return var1;
	}

	@ObfuscatedName("client.j(Z)I")
	public final int method188() {
		int var1 = method190(field454, field199, field452);
		if (var1 - field453 < 800 && (field406[field199][field452 >> 7][field454 >> 7] & 0x4) != 0) {
			return field199;
		}

		return 3;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method189(boolean arg0) {
		method254();
		field141.method592();
		field187.method446(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field232 == 0) {
			int var4 = var3 / 2 + 80;
			field241.method97(true, field474.field61, 0x75A9A9, var4, var2 / 2);
			int var5 = var3 / 2 - 20;
			field243.method97(true, "Welcome to RuneScape", 0xFFFF00, var5, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field188.method446(var7 - 20, var6 - 73);
			field243.method97(true, "New User", 0xFFFFFF, var7 + 5, var6);
			int var8 = var2 / 2 + 80;
			field188.method446(var7 - 20, var8 - 73);
			field243.method97(true, "Existing User", 0xFFFFFF, var7 + 5, var8);
		}

		if (field232 == 2) {
			int var9 = var3 / 2 - 40;
			if (field262.length() > 0) {
				field243.method97(true, field262, 0xFFFF00, var9 - 15, var2 / 2);
				field243.method97(true, field263, 0xFFFF00, var9, var2 / 2);
				var9 += 30;
			} else {
				field243.method97(true, field263, 0xFFFF00, var9 - 7, var2 / 2);
				var9 += 30;
			}

			field243.method104(true, var9, var2 / 2 - 90, 0xFFFFFF, "Username: " + field329 + (field135 == 0 & field459 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field243.method104(true, var9, var2 / 2 - 88, 0xFFFFFF, "Password: " + JQPXVJFJ.method328(field330) + (field135 == 1 & field459 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field188.method446(var11 - 20, var10 - 73);
				field243.method97(true, "Login", 0xFFFFFF, var11 + 5, var10);
				int var12 = var2 / 2 + 80;
				field188.method446(var11 - 20, var12 - 73);
				field243.method97(true, "Cancel", 0xFFFFFF, var11 + 5, var12);
			}
		}

		if (field232 == 3) {
			field243.method97(true, "Create a free account", 0xFFFF00, var3 / 2 - 60, var2 / 2);
			int var13 = var3 / 2 - 35;
			field243.method97(true, "To create a new account you need to", 0xFFFFFF, var13, var2 / 2);
			var13 += 15;
			field243.method97(true, "go back to the main RuneScape webpage", 0xFFFFFF, var13, var2 / 2);
			var13 += 15;
			field243.method97(true, "and choose the 'create account'", 0xFFFFFF, var13, var2 / 2);
			var13 += 15;
			field243.method97(true, "button near the top of that page.", 0xFFFFFF, var13, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field188.method446(var15 - 20, var14 - 73);
			field243.method97(true, "Cancel", 0xFFFFFF, var15 + 5, var14);
		}

		field141.method593(field1208, 202, 171);

		if (field490) {
			field490 = false;
			field139.method593(field1208, 128, 0);
			field140.method593(field1208, 202, 371);
			field144.method593(field1208, 0, 265);
			field145.method593(field1208, 562, 265);
			field146.method593(field1208, 128, 171);
			field147.method593(field1208, 562, 171);
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method190(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field406[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field156[var6][var4][var5] + field156[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field156[var6][var4][var5 + 1] + field156[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method191() {
		for (int var1 = -1; var1 < field276; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field274;
			} else {
				var2 = field277[var1];
			}

			IOPHRJNF var3 = field275[var2];
			if (var3 != null) {
				method263(1, var3);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;II)V")
	public final void method192(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field450 != -1) {
			field514 = arg1;
			field1222 = 0;
		}

		if (field369 == -1) {
			field157 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field523[var4] = field523[var4 - 1];
			field524[var4] = field524[var4 - 1];
			field525[var4] = field525[var4 - 1];
		}

		field523[0] = arg2;
		field524[0] = arg0;
		field525[0] = arg1;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method193() {
		while (true) {
			QWHFLOAQ var1 = field474.method127();
			if (var1 == null) {
				return;
			}

			if (var1.field1040 == 0) {
				XBVYIDUH.method539(var1.field1042, var1.field1043);

				if ((field474.method121(var1.field1042) & 0x62) != 0) {
					field399 = true;

					if (field369 != -1 || field450 != -1) {
						field157 = true;
					}
				}
			}

			if (var1.field1040 == 1 && var1.field1043 != null) {
				BKYAWERN.method112(var1.field1043);
			}

			if (var1.field1040 == 2 && field220 == var1.field1042 && var1.field1043 != null) {
				method200(var1.field1043, field221);
			}

			if (var1.field1040 == 3 && field185 == 1) {
				for (int var2 = 0; var2 < field312.length; var2++) {
					if (field508[var2] == var1.field1042) {
						field312[var2] = var1.field1043;

						if (var1.field1043 == null) {
							field508[var2] = -1;
						}

						break;
					}

					if (field509[var2] == var1.field1042) {
						field258[var2] = var1.field1043;

						if (var1.field1043 == null) {
							field509[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1040 == 93 && field474.method128(var1.field1042)) {
				RQCEQFSS.method475(field474, new BFQIDHPO(var1.field1043));
			}
		}
	}

	@ObfuscatedName("client.a(LFMDWWBSX;Z)Z")
	public final boolean method194(FMDWWBSX arg0) {
		if (arg0.field620 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field620.length; var2++) {
			int var3 = method244(arg0, var2);
			int var4 = arg0.field647[var2];
			if (arg0.field620[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field620[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field620[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method195() {
		field187 = new RAOZRSKX(field437, "titlebox", 0);
		field188 = new RAOZRSKX(field437, "titlebutton", 0);
		field224 = new RAOZRSKX[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field224[var1] = new RAOZRSKX(field437, "runes", var1);
		}

		field444 = new NDGQUJMA(128, 265);
		field445 = new NDGQUJMA(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field444.field912[var2] = field142.field1508[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field445.field912[var3] = field143.field1508[var3];
		}

		field265 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field265[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field265[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field265[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field265[var7 + 192] = 0xFFFFFF;
		}

		field266 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field266[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field266[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field266[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field266[var11 + 192] = 0xFFFFFF;
		}

		field267 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field267[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field267[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field267[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field267[var15 + 192] = 0xFFFFFF;
		}

		field264 = new int[256];
		field131 = new int[32768];
		field132 = new int[32768];
		method277(null);
		field356 = new int[32768];
		field357 = new int[32768];
		method169("Connecting to fileserver", 10);

		if (!field154) {
			field340 = true;
			field154 = true;
			method180(this, 2);
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method196() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field356[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field356[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field357[var10] = (field356[var10 - 1] + field356[var10 + 1] + field356[var10 - 128] + field356[var10 + 128]) / 4;
			}
		}

		field477 += 128;
		if (field477 > field131.length) {
			field477 -= field131.length;
			int var11 = (int) (Math.random() * 12.0D);
			method277(field224[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field357[var14 + 128] - field131[field477 + var14 & field131.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field356[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field317[var16] = field317[var16 + 1];
		}

		field317[var1 - 1] = (int) (Math.sin(field459 / 14.0D) * 16.0D + Math.sin(field459 / 15.0D) * 14.0D + Math.sin(field459 / 16.0D) * 12.0D);

		if (field495 > 0) {
			field495 -= 4;
		}

		if (field496 > 0) {
			field496 -= 4;
		}

		if (field495 == 0 && field496 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field495 = 1024;
			}

			if (var17 == 1) {
				field496 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public static final String method197(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method198(boolean arg0) {
		for (int var2 = 0; var2 < field403; var2++) {
			BFCMZACY var3 = field402[field404[var2]];
			int var4 = (field404[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method41() && var3.field8.field1173 == arg0 && var3.field8.method498()) {
				int var5 = var3.field756 >> 7;
				int var6 = var3.field757 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field746 == 1 && (var3.field756 & 0x7F) == 0x40 && (var3.field757 & 0x7F) == 0x40) {
						if (field304[var5][var6] == field122) {
							continue;
						}

						field304[var5][var6] = field122;
					}

					if (!var3.field8.field1149) {
						var4 += Integer.MIN_VALUE;
					}

					field225.method384(var3.field758, field199, var3.field757, (var3.field746 - 1) * 64 + 60, method190(var3.field757, field199, var3.field756), var3, var4, var3.field787, var3.field756);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method199(String arg0) throws IOException {
		if (field281) {
			if (field231 != null) {
				try {
					field231.close();
				} catch (Exception var4) {
				}

				field231 = null;
			}

			field231 = method283(43595);
			field231.setSoTimeout(10000);
			InputStream var2 = field231.getInputStream();
			OutputStream var3 = field231.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a([BZZ)V")
	public final void method200(byte[] arg0, boolean arg1) {
		if (field434) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method201(int arg0) {
		FMDWWBSX var2 = FMDWWBSX.method306(arg0);
		for (int var3 = 0; var3 < var2.field648.length && var2.field648[var3] != -1; var3++) {
			FMDWWBSX var4 = FMDWWBSX.method306(var2.field648[var3]);
			if (var4.field691 == 1) {
				method201(var4.field683);
			}

			var4.field636 = 0;
			var4.field626 = 0;
		}
	}

	@ObfuscatedName("client.a(BILNDGQUJMA;I)V")
	public final void method202(int arg0, NDGQUJMA arg1, int arg2) {
		if (arg1 != null) {
			int var4 = field373 + field370 & 0x7FF;
			int var5 = arg0 * arg0 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = XBVYIDUH.field1415[var4];
				int var7 = XBVYIDUH.field1416[var4];
				var6 = var6 * 256 / (field460 + 256);
				var7 = var7 * 256 / (field460 + 256);
				int var8 = arg0 * var7 + arg2 * var6 >> 16;
				int var9 = arg2 * var7 - arg0 * var6 >> 16;
				if (var5 > 2500) {
					arg1.method359(var8 + 94 + 4 - arg1.field917 / 2, 83 - var9 - arg1.field918 / 2 - 4, field314);
				} else {
					arg1.method353(83 - var9 - arg1.field918 / 2 - 4, var8 + 94 - arg1.field917 / 2 + 4);
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method203() {
		method253();

		if (field449 == 1) {
			field178[field448 / 100].method353(field447 - 8 - 4, field446 - 8 - 4);
		}

		if (field449 == 2) {
			field178[field448 / 100 + 4].method353(field447 - 8 - 4, field446 - 8 - 4);
			field169++;
			if (field169 > 80) {
				field169 = 0;
				field382.method43(171);
			}
		}

		if (field419 != -1) {
			method287(field419, field517);
			method208(0, 0, 0, FMDWWBSX.method306(field419));
		}

		if (field383 != -1) {
			method287(field383, field517);
			method208(0, 0, 0, FMDWWBSX.method306(field383));
		}

		method159();

		if (!field229) {
			method240();
			method255();
		} else if (field247 == 0) {
			method184();
		}

		if (field134 == 1) {
			field215.method353(296, 472);
		}

		if (field113) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1204 < 30 && field288) {
				var3 = 0xFF0000;
			}

			if (field1204 < 20 && !field288) {
				var3 = 0xFF0000;
			}

			field242.method95(var3, "Fps:" + field1204, var2, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field288) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field288) {
				int var8 = 0xFF0000;
			}

			field242.method95(0xFFFF00, "Mem:" + var5 + "k", var2, var1);
			var2 += 15;
		}

		if (field168 != 0) {
			int var9 = field168 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field242.method100(329, "System update in: " + var10 + ":0" + var9, 4, 0xFFFF00);
			} else {
				field242.method100(329, "System update in: " + var10 + ":" + var9, 4, 0xFFFF00);
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
	public final void method204(long arg0) {
		if (arg0 != 0L) {
			if (field396 >= 100) {
				method192("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = JQPXVJFJ.method327(JQPXVJFJ.method324(arg0));
				for (int var4 = 0; var4 < field396; var4++) {
					if (field196[var4] == arg0) {
						method192("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field392; var5++) {
					if (field124[var5] == arg0) {
						method192("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field196[field396++] = arg0;
				field399 = true;
				field382.method43(233);
				field382.method50(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method205(int arg0) {
		FMDWWBSX.method308(arg0);
	}

	@ObfuscatedName("client.b(II)Z")
	public final boolean method206(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field117[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 106) {
			return true;
		}

		return false;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1211 != null) {
				return new URL("http://127.0.0.1:" + (field286 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIIILFMDWWBSX;II)V")
	public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, FMDWWBSX arg5, int arg6, int arg7) {
		if (field197) {
			field228 = 32;
		} else {
			field228 = 0;
		}

		field197 = false;
		if (arg7 >= arg0 && arg7 < arg0 + 16 && arg4 >= arg6 && arg4 < arg6 + 16) {
			arg5.field692 -= field476 * 4;

			if (arg3 == 1) {
				field399 = true;
			}

			if (arg3 == 2 || arg3 == 3) {
				field157 = true;
			}
		} else if (arg7 >= arg0 && arg7 < arg0 + 16 && arg4 >= arg2 + arg6 - 16 && arg4 < arg2 + arg6) {
			arg5.field692 += field476 * 4;

			if (arg3 == 1) {
				field399 = true;
			}

			if (arg3 == 2 || arg3 == 3) {
				field157 = true;
			}
		} else if (arg7 >= arg0 - field228 && arg7 < arg0 + field228 + 16 && arg4 >= arg6 + 16 && arg4 < arg2 + arg6 - 16 && field476 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg4 - arg6 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg5.field692 = (arg1 - arg2) * var10 / var11;

			if (arg3 == 1) {
				field399 = true;
			}

			if (arg3 == 2 || arg3 == 3) {
				field157 = true;
			}

			field197 = true;
		}
	}

	@ObfuscatedName("client.a(IIILFMDWWBSX;Z)V")
	public final void method208(int arg0, int arg1, int arg2, FMDWWBSX arg3) {
		if (arg3.field691 == 0 && arg3.field648 != null && (!arg3.field670 || field451 == arg3.field683 || field198 == arg3.field683 || field316 == arg3.field683)) {
			int var5 = CCFLBOBS.field95;
			int var6 = CCFLBOBS.field93;
			int var7 = CCFLBOBS.field96;
			int var8 = CCFLBOBS.field94;
			CCFLBOBS.method140(arg1, arg2, arg3.field655 + arg1, arg3.field650 + arg2);
			int var9 = arg3.field648.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field622[var10] + arg1;
				int var12 = arg3.field690[var10] + arg2 - arg0;
				FMDWWBSX var13 = FMDWWBSX.method306(arg3.field648[var10]);
				var11 += var13.field674;
				var12 += var13.field660;

				if (var13.field679 > 0) {
					method156(var13);
				}

				if (var13.field691 == 0) {
					if (var13.field692 > var13.field665 - var13.field650) {
						var13.field692 = var13.field665 - var13.field650;
					}

					if (var13.field692 < 0) {
						var13.field692 = 0;
					}

					method208(var13.field692, var11, var12, var13);

					if (var13.field665 > var13.field650) {
						method292(var13.field655 + var11, var12, var13.field692, var13.field665, var13.field650);
					}
				} else if (var13.field691 != 1) {
					if (var13.field691 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field650; var15++) {
							for (int var16 = 0; var16 < var13.field655; var16++) {
								int var17 = (var13.field629 + 32) * var16 + var11;
								int var18 = (var13.field656 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field675[var14];
									var18 += var13.field654[var14];
								}

								if (var13.field624[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field624[var14] - 1;
									if (var17 > CCFLBOBS.field95 - 32 && var17 < CCFLBOBS.field96 && var18 > CCFLBOBS.field93 - 32 && var18 < CCFLBOBS.field94 || field307 != 0 && field306 == var14) {
										int var22 = 0;
										if (field429 == 1 && field430 == var14 && field431 == var13.field683) {
											var22 = 0xFFFFFF;
										}

										NDGQUJMA var23 = RBNCRAAP.method457(var22, var21, var13.field664[var14]);
										if (var23 != null) {
											if (field307 != 0 && field306 == var14 && field305 == var13.field683) {
												var19 = field1216 - field308;
												var20 = field1217 - field309;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field176 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method355(128, var18 + var20, var17 + var19);

												if (var18 + var20 < CCFLBOBS.field93 && arg3.field692 > 0) {
													int var24 = (CCFLBOBS.field93 - var18 - var20) * field517 / 3;
													if (var24 > field517 * 10) {
														var24 = field517 * 10;
													}

													if (var24 > arg3.field692) {
														var24 = arg3.field692;
													}

													arg3.field692 -= var24;
													field309 += var24;
												}

												if (var18 + var20 + 32 > CCFLBOBS.field94 && arg3.field692 < arg3.field665 - arg3.field650) {
													int var25 = (var18 + var20 + 32 - CCFLBOBS.field94) * field517 / 3;
													if (var25 > field517 * 10) {
														var25 = field517 * 10;
													}

													if (var25 > arg3.field665 - arg3.field650 - arg3.field692) {
														var25 = arg3.field665 - arg3.field650 - arg3.field692;
													}

													arg3.field692 += var25;
													field309 -= var25;
												}
											} else if (field424 != 0 && field423 == var14 && field422 == var13.field683) {
												var23.method355(128, var18, var17);
											} else {
												var23.method353(var18, var17);
											}

											if (var23.field917 == 33 || var13.field664[var14] != 1) {
												int var26 = var13.field664[var14];
												field241.method100(var18 + var20 + 10, method197(var26), var17 + var19 + 1, 0);
												field241.method100(var18 + var20 + 9, method197(var26), var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field666 != null && var14 < 20) {
									NDGQUJMA var27 = var13.field666[var14];
									if (var27 != null) {
										var27.method353(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field691 == 3) {
						boolean var28 = false;
						if (field316 == var13.field683 || field198 == var13.field683 || field451 == var13.field683) {
							var28 = true;
						}

						int var29;
						if (method194(var13)) {
							var29 = var13.field633;
							if (var28 && var13.field686 != 0) {
								var29 = var13.field686;
							}
						} else {
							var29 = var13.field625;
							if (var28 && var13.field663 != 0) {
								var29 = var13.field663;
							}
						}

						if (var13.field631 == 0) {
							if (var13.field682) {
								CCFLBOBS.method143(var29, var11, var12, var13.field655, var13.field650);
							} else {
								CCFLBOBS.method144(var12, var29, var11, var13.field650, var13.field655);
							}
						} else if (var13.field682) {
							CCFLBOBS.method142(var13.field650, var29, var11, var13.field655, var12, 256 - (var13.field631 & 0xFF));
						} else {
							CCFLBOBS.method145(var13.field655, var11, var12, var13.field650, 256 - (var13.field631 & 0xFF), var29);
						}
					} else if (var13.field691 == 4) {
						BKBLJVKV var30 = var13.field681;
						String var31 = var13.field638;
						boolean var32 = false;
						if (field316 == var13.field683 || field198 == var13.field683 || field451 == var13.field683) {
							var32 = true;
						}

						int var33;
						if (method194(var13)) {
							var33 = var13.field633;
							if (var32 && var13.field686 != 0) {
								var33 = var13.field686;
							}

							if (var13.field671.length() > 0) {
								var31 = var13.field671;
							}
						} else {
							var33 = var13.field625;
							if (var32 && var13.field663 != 0) {
								var33 = var13.field663;
							}
						}

						if (var13.field689 == 6 && field218) {
							var31 = "Please wait...";
							var33 = var13.field625;
						}

						if (CCFLBOBS.field91 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field39 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method239(method244(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method239(method244(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method239(method244(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method239(method244(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method239(method244(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field642) {
								var30.method97(var13.field635, var41, var33, var34, var13.field655 / 2 + var11);
							} else {
								var30.method104(var13.field635, var34, var11, var33, var41);
							}

							var34 += var30.field39;
						}
					} else if (var13.field691 == 5) {
						NDGQUJMA var42;
						if (method194(var13)) {
							var42 = var13.field658;
						} else {
							var42 = var13.field688;
						}

						if (var42 != null) {
							var42.method353(var12, var11);
						}
					} else if (var13.field691 == 6) {
						int var43 = PKGGFQZB.field1022;
						int var44 = PKGGFQZB.field1023;
						PKGGFQZB.field1022 = var13.field655 / 2 + var11;
						PKGGFQZB.field1023 = var13.field650 / 2 + var12;
						int var45 = PKGGFQZB.field1026[var13.field677] * var13.field676 >> 16;
						int var46 = PKGGFQZB.field1027[var13.field677] * var13.field676 >> 16;
						boolean var47 = method194(var13);
						int var48;
						if (var47) {
							var48 = var13.field662;
						} else {
							var48 = var13.field661;
						}

						XBVYIDUH var49;
						if (var48 == -1) {
							var49 = var13.method304(-1, -1, var47);
						} else {
							SPUHKLMC var50 = SPUHKLMC.field1176[var48];
							var49 = var13.method304(var50.field1179[var13.field636], var50.field1178[var13.field636], var47);
						}

						if (var49 != null) {
							var49.method562(0, var13.field678, 0, var13.field677, 0, var45, var46);
						}

						PKGGFQZB.field1022 = var43;
						PKGGFQZB.field1023 = var44;
					} else {
						if (var13.field691 == 7) {
							BKBLJVKV var51 = var13.field681;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field650; var53++) {
								for (int var54 = 0; var54 < var13.field655; var54++) {
									if (var13.field624[var52] > 0) {
										RBNCRAAP var55 = RBNCRAAP.method456(var13.field624[var52] - 1);
										String var56 = String.valueOf(var55.field1078);
										if (var55.field1066 || var13.field664[var52] != 1) {
											var56 = var56 + " x" + method179(var13.field664[var52]);
										}

										int var57 = (var13.field629 + 115) * var54 + var11;
										int var58 = (var13.field656 + 12) * var53 + var12;
										if (var13.field642) {
											var51.method97(var13.field635, var56, var13.field625, var58, var13.field655 / 2 + var57);
										} else {
											var51.method104(var13.field635, var58, var57, var13.field625, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field691 == 8 && (field112 == var13.field683 || field159 == var13.field683 || field203 == var13.field683) && field201 == 100) {
							int var59 = 0;
							int var60 = 0;
							BKBLJVKV var61 = field242;
							String var62 = var13.field638;
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

								int var65 = var61.method98(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field39 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field655 + var11 - var59 - 5;
							int var67 = var13.field650 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg3.field655 + arg1) {
								var66 = arg3.field655 + arg1 - var59;
							}

							if (var60 + var67 > arg3.field650 + arg2) {
								var67 = arg3.field650 + arg2 - var60;
							}

							CCFLBOBS.method143(0xFFFFA0, var66, var67, var59, var60);
							CCFLBOBS.method144(var67, 0, var66, var60, var59);
							String var68 = var13.field638;
							int var69 = var61.field39 + var67 + 2;
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

								var61.method104(false, var69, var66 + 3, 0, var71);
								var69 += var61.field39 + 1;
							}
						}
					}
				}
			}

			CCFLBOBS.method140(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("client.a(LFMDWWBSX;I)Z")
	public final boolean method209(FMDWWBSX arg0) {
		int var2 = arg0.field679;
		if (field393 == 2) {
			if (var2 == 201) {
				field157 = true;
				field530 = 0;
				field257 = true;
				field126 = "";
				field541 = 1;
				field155 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field157 = true;
				field530 = 0;
				field257 = true;
				field126 = "";
				field541 = 2;
				field155 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field167 = 250;
			return true;
		}

		if (var2 == 501) {
			field157 = true;
			field530 = 0;
			field257 = true;
			field126 = "";
			field541 = 4;
			field155 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field157 = true;
			field530 = 0;
			field257 = true;
			field126 = "";
			field541 = 5;
			field155 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field526[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = OQTNTOVY.field943 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= OQTNTOVY.field943) {
							var5 = 0;
						}
					}

					if (!OQTNTOVY.field944[var5].field950 && OQTNTOVY.field944[var5].field945 == var3 + (field438 ? 0 : 7)) {
						break;
					}
				}

				field526[var3] = var5;
				field497 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field398[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field505[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field505[var6].length) {
					var8 = 0;
				}
			}

			field398[var6] = var8;
			field497 = true;
		}

		if (var2 == 324 && !field438) {
			field438 = true;
			method288();
		}

		if (var2 == 325 && field438) {
			field438 = false;
			method288();
		}

		if (var2 == 326) {
			field382.method43(163);
			field382.method44(field438 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field382.method44(field526[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field382.method44(field398[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field239 = !field239;
		}

		if (var2 >= 601 && var2 <= 613) {
			method260();

			if (field475.length() > 0) {
				field382.method43(139);
				field382.method50(JQPXVJFJ.method323(field475));
				field382.method44(var2 - 601);
				field382.method44(field239 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(IIIIIILFMDWWBSX;I)V")
	public final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, FMDWWBSX arg5, int arg6) {
		if (arg5.field691 == 0 && arg5.field648 != null && !arg5.field670 && (arg0 >= arg1 && arg3 >= arg2 && arg0 <= arg5.field655 + arg1 && arg3 <= arg5.field650 + arg2)) {
			int var8 = arg5.field648.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg5.field622[var9] + arg1;
				int var11 = arg5.field690[var9] + arg2 - arg6;
				FMDWWBSX var12 = FMDWWBSX.method306(arg5.field648[var9]);
				var10 += var12.field674;
				var11 += var12.field660;
				if ((var12.field640 >= 0 || var12.field663 != 0) && arg0 >= var10 && arg3 >= var11 && arg0 < var12.field655 + var10 && arg3 < var12.field650 + var11) {
					if (var12.field640 >= 0) {
						field361 = var12.field640;
					} else {
						field361 = var12.field683;
					}
				}

				if (var12.field691 == 8 && arg0 >= var10 && arg3 >= var11 && arg0 < var12.field655 + var10 && arg3 < var12.field650 + var11) {
					field245 = var12.field683;
				}

				if (var12.field691 == 0) {
					method210(arg0, var10, var11, arg3, arg4, var12, var12.field692);

					if (var12.field665 > var12.field650) {
						method207(var12.field655 + var10, var12.field665, var12.field650, arg4, arg3, var12, var11, arg0);
					}
				} else {
					if (var12.field689 == 1 && arg0 >= var10 && arg3 >= var11 && arg0 < var12.field655 + var10 && arg3 < var12.field650 + var11) {
						boolean var13 = false;
						if (var12.field679 != 0) {
							var13 = method245(var12);
						}

						if (!var13) {
							field344[field260] = var12.field659;
							field117[field260] = 253;
							field116[field260] = var12.field683;
							field260++;
						}
					}

					if (var12.field689 == 2 && field127 == 0 && arg0 >= var10 && arg3 >= var11 && arg0 < var12.field655 + var10 && arg3 < var12.field650 + var11) {
						String var14 = var12.field680;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field344[field260] = var14 + " @gre@" + var12.field632;
						field117[field260] = 565;
						field116[field260] = var12.field683;
						field260++;
					}

					if (var12.field689 == 3 && arg0 >= var10 && arg3 >= var11 && arg0 < var12.field655 + var10 && arg3 < var12.field650 + var11) {
						field344[field260] = "Close";

						if (arg4 == 3) {
							field117[field260] = 827;
						} else {
							field117[field260] = 727;
						}

						field116[field260] = var12.field683;
						field260++;
					}

					if (var12.field689 == 4 && arg0 >= var10 && arg3 >= var11 && arg0 < var12.field655 + var10 && arg3 < var12.field650 + var11) {
						field344[field260] = var12.field659;
						field117[field260] = 125;
						field116[field260] = var12.field683;
						field260++;
					}

					if (var12.field689 == 5 && arg0 >= var10 && arg3 >= var11 && arg0 < var12.field655 + var10 && arg3 < var12.field650 + var11) {
						field344[field260] = var12.field659;
						field117[field260] = 14;
						field116[field260] = var12.field683;
						field260++;
					}

					if (var12.field689 == 6 && !field218 && arg0 >= var10 && arg3 >= var11 && arg0 < var12.field655 + var10 && arg3 < var12.field650 + var11) {
						field344[field260] = var12.field659;
						field117[field260] = 683;
						field116[field260] = var12.field683;
						field260++;
					}

					if (var12.field691 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field650; var16++) {
							for (int var17 = 0; var17 < var12.field655; var17++) {
								int var18 = (var12.field629 + 32) * var17 + var10;
								int var19 = (var12.field656 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field675[var15];
									var19 += var12.field654[var15];
								}

								if (arg0 >= var18 && arg3 >= var19 && arg0 < var18 + 32 && arg3 < var19 + 32) {
									field363 = var15;
									field364 = var12.field683;

									if (var12.field624[var15] > 0) {
										RBNCRAAP var20 = RBNCRAAP.method456(var12.field624[var15] - 1);
										if (field429 == 1 && var12.field641) {
											if (field431 != var12.field683 || field430 != var15) {
												field344[field260] = "Use " + field433 + " with @lre@" + var20.field1078;
												field117[field260] = 151;
												field118[field260] = var20.field1068;
												field115[field260] = var15;
												field116[field260] = var12.field683;
												field260++;
											}
										} else if (field127 != 1 || !var12.field641) {
											if (var12.field641) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1075 != null && var20.field1075[var21] != null) {
														field344[field260] = var20.field1075[var21] + " @lre@" + var20.field1078;

														if (var21 == 3) {
															field117[field260] = 508;
														}

														if (var21 == 4) {
															field117[field260] = 959;
														}

														field118[field260] = var20.field1068;
														field115[field260] = var15;
														field116[field260] = var12.field683;
														field260++;
													} else if (var21 == 4) {
														field344[field260] = "Drop @lre@" + var20.field1078;
														field117[field260] = 959;
														field118[field260] = var20.field1068;
														field115[field260] = var15;
														field116[field260] = var12.field683;
														field260++;
													}
												}
											}

											if (var12.field667) {
												field344[field260] = "Use @lre@" + var20.field1078;
												field117[field260] = 286;
												field118[field260] = var20.field1068;
												field115[field260] = var15;
												field116[field260] = var12.field683;
												field260++;
											}

											if (var12.field641 && var20.field1075 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1075[var22] != null) {
														field344[field260] = var20.field1075[var22] + " @lre@" + var20.field1078;

														if (var22 == 0) {
															field117[field260] = 500;
														}

														if (var22 == 1) {
															field117[field260] = 360;
														}

														if (var22 == 2) {
															field117[field260] = 986;
														}

														field118[field260] = var20.field1068;
														field115[field260] = var15;
														field116[field260] = var12.field683;
														field260++;
													}
												}
											}

											if (var12.field644 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field644[var23] != null) {
														field344[field260] = var12.field644[var23] + " @lre@" + var20.field1078;

														if (var23 == 0) {
															field117[field260] = 191;
														}

														if (var23 == 1) {
															field117[field260] = 603;
														}

														if (var23 == 2) {
															field117[field260] = 972;
														}

														if (var23 == 3) {
															field117[field260] = 517;
														}

														if (var23 == 4) {
															field117[field260] = 788;
														}

														field118[field260] = var20.field1068;
														field115[field260] = var15;
														field116[field260] = var12.field683;
														field260++;
													}
												}
											}

											field344[field260] = "Examine @lre@" + var20.field1078;
											field117[field260] = 1690;
											field118[field260] = var20.field1068;
											field115[field260] = var15;
											field116[field260] = var12.field683;
											field260++;
										} else if ((field129 & 0x10) == 0x10) {
											field344[field260] = field130 + " @lre@" + var20.field1078;
											field117[field260] = 817;
											field118[field260] = var20.field1068;
											field115[field260] = var15;
											field116[field260] = var12.field683;
											field260++;
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

	@ObfuscatedName("client.v(I)V")
	public final void method211() {
		field268.method592();
		PKGGFQZB.field1028 = field387;
		field313.method446(0, 0);

		if (field519 != -1) {
			method208(0, 0, 0, FMDWWBSX.method306(field519));
		} else if (field376[field342] != -1) {
			method208(0, 0, 0, FMDWWBSX.method306(field376[field342]));
		}

		if (field229 && field247 == 1) {
			method184();
		}

		field268.method593(field1208, 553, 205);
		field270.method592();
		PKGGFQZB.field1028 = field388;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method212() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.c(II)V")
	public final void method213(int arg0, int arg1) {
		ZXKMWHPZ var3 = field441[field199][arg0][arg1];
		if (var3 == null) {
			field225.method394(field199, arg0, arg1);
		} else {
			int var4 = -99999999;
			FGBEUODV var5 = null;
			for (FGBEUODV var6 = (FGBEUODV) var3.method598(); var6 != null; var6 = (FGBEUODV) var3.method600()) {
				RBNCRAAP var7 = RBNCRAAP.method456(var6.field618);
				int var8 = var7.field1055;
				if (var7.field1066) {
					var8 = (var6.field619 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method596(var5);
			FGBEUODV var9 = null;
			FGBEUODV var10 = null;
			for (FGBEUODV var11 = (FGBEUODV) var3.method598(); var11 != null; var11 = (FGBEUODV) var3.method600()) {
				if (var5.field618 != var11.field618 && var9 == null) {
					var9 = var11;
				}

				if (var5.field618 != var11.field618 && var9.field618 != var11.field618 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field225.method380(var9, arg1, var12, method190(arg1 * 128 + 64, field199, arg0 * 128 + 64), var10, arg0, field199, var5);
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method214() {
		if (field181 == 2) {
			method259(field212 * 2, (field210 - field291 << 7) + field213, (field211 - field292 << 7) + field214);

			if (field470 > -1 && field459 % 20 < 10) {
				field540[0].method353(field471 - 28, field470 - 12);
			}
		}
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method215(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field225.method403(field199, arg0, arg2, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		field125++;
		if (field125 > 119) {
			field125 = 0;
			field382.method43(240);
			field382.method44(120);
		}

		if (var6 == 10 || var6 == 11 || var6 == 22) {
			YCVHWRKK var8 = YCVHWRKK.method575(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1462;
				var10 = var8.field1470;
			} else {
				var9 = var8.field1470;
				var10 = var8.field1462;
			}

			int var11 = var8.field1478;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method217(0, var11, arg2, true, var9, arg0, 2, field512.field776[0], field512.field777[0], var10, 0);
		} else {
			method217(var7, 0, arg2, true, 0, arg0, 2, field512.field776[0], field512.field777[0], 0, var6 + 1);
		}

		field446 = field1223;
		field447 = field1224;
		field449 = 2;
		field448 = 0;
		return true;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method216() {
		if (field474 != null) {
			field474.method124();
		}

		field474 = null;

		try {
			if (field177 != null) {
				field177.method586();
			}
		} catch (Exception var1) {
		}

		field177 = null;
		field382 = null;
		field397 = null;
		field318 = null;
		field313 = null;
		field314 = null;
		field315 = null;
		field462 = null;
		field463 = null;
		field464 = null;
		field465 = null;
		field466 = null;

		if (field427 != null) {
			field427.field1506 = false;
		}

		field427 = null;
		field401 = null;
		field335 = null;
		field402 = null;
		field404 = null;
		field215 = null;
		field275 = null;
		field277 = null;
		field279 = null;
		field280 = null;
		field473 = null;
		field493 = null;
		field138 = null;
		field124 = null;
		field195 = null;
		field425 = null;
		field304 = null;
		field142 = null;
		field143 = null;
		field139 = null;
		field140 = null;
		field141 = null;
		field408 = null;
		field409 = null;
		field410 = null;
		field411 = null;
		field234 = null;
		field235 = null;
		field236 = null;
		field237 = null;
		field238 = null;
		field204 = null;
		field153 = null;
		field390 = null;
		field394 = null;
		field331 = null;
		field332 = null;
		field338 = null;
		field339 = null;
		field435 = null;
		method212();
		field170 = null;
		field171 = null;
		field172 = null;
		field173 = null;
		field174 = null;
		field507 = null;
		field312 = null;
		field258 = null;
		field508 = null;
		field509 = null;
		field479 = null;
		field518 = null;
		field268 = null;
		field269 = null;
		field270 = null;
		field271 = null;
		field156 = null;
		field406 = null;
		field225 = null;
		field151 = null;
		field412 = null;
		field413 = null;
		field414 = null;
		field415 = null;
		field416 = null;
		field487 = null;
		field527 = null;
		field328 = null;
		field440 = null;
		field540 = null;
		field178 = null;
		field501 = null;
		field502 = null;
		field503 = null;
		field189 = null;
		field190 = null;
		field191 = null;
		field420 = null;
		field441 = null;
		field152 = null;
		field144 = null;
		field145 = null;
		field146 = null;
		field147 = null;
		field115 = null;
		field116 = null;
		field117 = null;
		field118 = null;
		field344 = null;
		method235();
		YCVHWRKK.method576();
		SHKUIFHF.method500();
		RBNCRAAP.method451();
		FMDWWBSX.method310();
		GJDLZXKK.field722 = null;
		OQTNTOVY.field944 = null;
		FCHZSPYS.field606 = null;
		SPUHKLMC.field1176 = null;
		CRSWMDQF.field543 = null;
		CRSWMDQF.field555 = null;
		ONRKYVGF.field920 = null;
		field1209 = null;
		IOPHRJNF.field797 = null;
		PKGGFQZB.method424();
		PJTXDRVG.method372();
		XBVYIDUH.method537();
		BKYAWERN.method113();
		System.gc();
	}

	@ObfuscatedName("client.a(IIIZBIIIIIII)Z")
	public final boolean method217(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field390[var14][var15] = 0;
				field394[var14][var15] = 99999999;
			}
		}

		int var16 = arg7;
		int var17 = arg8;
		field390[arg7][arg8] = 99;
		field394[arg7][arg8] = 0;
		byte var18 = 0;
		int var19 = 0;
		field331[var18] = arg7;
		int var39 = var18 + 1;
		field332[var18] = arg8;
		boolean var20 = false;
		int var21 = field331.length;
		int[][] var22 = field151[field199].field1130;
		while (var39 != var19) {
			var16 = field331[var19];
			var17 = field332[var19];
			var19 = (var19 + 1) % var21;

			if (arg5 == var16 && arg2 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field151[field199].method492(arg5, arg0, arg10 - 1, arg2, var17, var16)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field151[field199].method493(arg0, arg5, arg2, var16, arg10 - 1, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg4 != 0 && arg9 != 0 && field151[field199].method494(arg9, var17, arg4, var16, arg2, arg5, arg1)) {
				var20 = true;
				break;
			}

			int var23 = field394[var16][var17] + 1;
			if (var16 > 0 && field390[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field331[var39] = var16 - 1;
				field332[var39] = var17;
				var39 = (var39 + 1) % var21;
				field390[var16 - 1][var17] = 2;
				field394[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field390[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field331[var39] = var16 + 1;
				field332[var39] = var17;
				var39 = (var39 + 1) % var21;
				field390[var16 + 1][var17] = 8;
				field394[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field390[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field331[var39] = var16;
				field332[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field390[var16][var17 - 1] = 1;
				field394[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field390[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field331[var39] = var16;
				field332[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field390[var16][var17 + 1] = 4;
				field394[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field390[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field331[var39] = var16 - 1;
				field332[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field390[var16 - 1][var17 - 1] = 3;
				field394[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field390[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field331[var39] = var16 + 1;
				field332[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field390[var16 + 1][var17 - 1] = 9;
				field394[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field390[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field331[var39] = var16 - 1;
				field332[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field390[var16 - 1][var17 + 1] = 6;
				field394[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field390[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field331[var39] = var16 + 1;
				field332[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field390[var16 + 1][var17 + 1] = 12;
				field394[var16 + 1][var17 + 1] = var23;
			}
		}

		field499 = 0;
		if (!var20) {
			if (!arg3) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg5 - var26; var27 <= arg5 + var26; var27++) {
				for (int var28 = arg2 - var26; var28 <= arg2 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field394[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg5) {
							var29 = arg5 - var27;
						} else if (var27 > arg4 + arg5 - 1) {
							var29 = var27 + 1 - arg4 - arg5;
						}

						int var30 = 0;
						if (var28 < arg2) {
							var30 = arg2 - var28;
						} else if (var28 > arg2 + arg9 - 1) {
							var30 = var28 + 1 - arg2 - arg9;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field394[var27][var28] < var25) {
							var24 = var31;
							var25 = field394[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg7 == var16 && arg8 == var17) {
				return false;
			}

			field499 = 1;
		}

		byte var32 = 0;
		field331[var32] = var16;
		int var40 = var32 + 1;
		field332[var32] = var17;
		int var33;
		int var34 = var33 = field390[var16][var17];
		while (arg7 != var16 || arg8 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field331[var40] = var16;
				field332[var40++] = var17;
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

			var34 = field390[var16][var17];
		}

		if (var40 <= 0) {
			if (arg6 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field331[var40];
		int var37 = field332[var40];

		if (arg6 == 0) {
			field382.method43(129);
			field382.method44(var35 + var35 + 3);
		}

		if (arg6 == 1) {
			field382.method43(132);
			field382.method44(var35 + var35 + 3 + 14);
		}

		if (arg6 == 2) {
			field382.method43(211);
			field382.method44(var35 + var35 + 3);
		}

		field382.method72(field1226[5] == 1 ? 1 : 0);
		field382.method45(field292 + var37);
		field333 = field331[0];
		field334 = field332[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field382.method44(field331[var40] - var36);
			field382.method72(field332[var40] - var37);
		}

		field382.method79(field291 + var36);
		return true;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method218() {
		field100 = 0;
		for (int var1 = -1; var1 < field403 + field276; var1++) {
			HCCLTVPO var2;
			if (var1 == -1) {
				var2 = field512;
			} else if (var1 < field276) {
				var2 = field275[field277[var1]];
			} else {
				var2 = field402[field404[var1 - field276]];
			}

			if (var2 != null && var2.method41()) {
				if (var2 instanceof BFCMZACY) {
					SHKUIFHF var3 = ((BFCMZACY) var2).field8;
					if (var3.field1167 != null) {
						var3 = var3.method504();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field276) {
					SHKUIFHF var6 = ((BFCMZACY) var2).field8;
					if (var6.field1169 >= 0 && var6.field1169 < field440.length) {
						method258(var2, var2.field788 + 15);

						if (field470 > -1) {
							field440[var6.field1169].method353(field471 - 30, field470 - 12);
						}
					}

					if (field181 == 1 && field404[var1 - field276] == field158 && field459 % 20 < 10) {
						method258(var2, var2.field788 + 15);

						if (field470 > -1) {
							field540[0].method353(field471 - 28, field470 - 12);
						}
					}
				} else {
					int var4 = 30;
					IOPHRJNF var5 = (IOPHRJNF) var2;
					if (var5.field799 != -1 || var5.field805 != -1) {
						method258(var2, var2.field788 + 15);

						if (field470 > -1) {
							if (var5.field799 != -1) {
								field328[var5.field799].method353(field471 - var4, field470 - 12);
								var4 += 25;
							}

							if (var5.field805 != -1) {
								field440[var5.field805].method353(field471 - var4, field470 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field181 == 10 && field277[var1] == field368) {
						method258(var2, var2.field788 + 15);

						if (field470 > -1) {
							field540[1].method353(field471 - var4, field470 - 12);
						}
					}
				}

				if (var2.field786 != null && (var1 >= field276 || field504 == 0 || field504 == 3 || field504 == 1 && method247(((IOPHRJNF) var2).field819))) {
					method258(var2, var2.field788);

					if (field470 > -1 && field100 < field101) {
						field105[field100] = field243.method99(var2.field786) / 2;
						field104[field100] = field243.field39;
						field102[field100] = field470;
						field103[field100] = field471;
						field106[field100] = var2.field748;
						field107[field100] = var2.field759;
						field108[field100] = var2.field779;
						field109[field100++] = var2.field786;

						if (field246 == 0 && var2.field759 >= 1 && var2.field759 <= 3) {
							field104[field100] += 10;
							field103[field100] += 5;
						}

						if (field246 == 0 && var2.field759 == 4) {
							field105[field100] = 60;
						}

						if (field246 == 0 && var2.field759 == 5) {
							field104[field100] += 5;
						}
					}
				}

				if (var2.field780 > field459) {
					method258(var2, var2.field788 + 15);

					if (field470 > -1) {
						int var7 = var2.field781 * 30 / var2.field782;
						if (var7 > 30) {
							var7 = 30;
						}

						CCFLBOBS.method143(0xFF00, field470 - 15, field471 - 3, var7, 5);
						CCFLBOBS.method143(0xFF0000, field470 + var7 - 15, field471 - 3, 30 - var7, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field751[var8] > field459) {
						method258(var2, var2.field788 / 2);

						if (field470 > -1) {
							if (var8 == 1) {
								field471 -= 20;
							}

							if (var8 == 2) {
								field470 -= 15;
								field471 -= 10;
							}

							if (var8 == 3) {
								field470 += 15;
								field471 -= 10;
							}

							field527[var2.field750[var8]].method353(field471 - 12, field470 - 12);
							field241.method96(field471 + 4, 0, String.valueOf(var2.field749[var8]), field470);
							field241.method96(field471 + 3, 0xFFFFFF, String.valueOf(var2.field749[var8]), field470 - 1);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field100; var9++) {
			int var10 = field102[var9];
			int var11 = field103[var9];
			int var12 = field105[var9];
			int var13 = field104[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field103[var15] - field104[var15] && var11 - var13 < field103[var15] + 2 && var10 - var12 < field105[var15] + field102[var15] && var10 + var12 > field102[var15] - field105[var15] && field103[var15] - field104[var15] < var11) {
						var11 = field103[var15] - field104[var15];
						var14 = true;
					}
				}
			}

			field470 = field102[var9];
			field471 = field103[var9] = var11;
			String var16 = field109[var9];
			if (field246 == 0) {
				int var17 = 0xFFFF00;
				if (field106[var9] < 6) {
					var17 = field511[field106[var9]];
				}

				if (field106[var9] == 6) {
					var17 = field122 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field106[var9] == 7) {
					var17 = field122 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field106[var9] == 8) {
					var17 = field122 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field106[var9] == 9) {
					int var18 = 150 - field108[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field106[var9] == 10) {
					int var19 = 150 - field108[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field106[var9] == 11) {
					int var20 = 150 - field108[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field107[var9] == 0) {
					field243.method96(field471 + 1, 0, var16, field470);
					field243.method96(field471, var17, var16, field470);
				}

				if (field107[var9] == 1) {
					field243.method101(field471 + 1, var16, field470, field122, 0);
					field243.method101(field471, var16, field470, field122, var17);
				}

				if (field107[var9] == 2) {
					field243.method102(field122, field471 + 1, 0, field470, var16);
					field243.method102(field122, field471, var17, field470, var16);
				}

				if (field107[var9] == 3) {
					field243.method103(150 - field108[var9], 0, field470, field471 + 1, var16, field122);
					field243.method103(150 - field108[var9], var17, field470, field471, var16, field122);
				}

				if (field107[var9] == 4) {
					int var21 = field243.method99(var16);
					int var22 = (150 - field108[var9]) * (var21 + 100) / 150;
					CCFLBOBS.method140(field470 - 50, 0, field470 + 50, 334);
					field243.method100(field471 + 1, var16, field470 + 50 - var22, 0);
					field243.method100(field471, var16, field470 + 50 - var22, var17);
					CCFLBOBS.method139();
				}

				if (field107[var9] == 5) {
					int var23 = 150 - field108[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					CCFLBOBS.method140(0, field471 - field243.field39 - 1, 512, field471 + 5);
					field243.method96(field471 + var24 + 1, 0, var16, field470);
					field243.method96(field471 + var24, var17, var16, field470);
					CCFLBOBS.method139();
				}
			} else {
				field243.method96(field471 + 1, 0, var16, field470);
				field243.method96(field471, 0xFFFF00, var16, field470);
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method219() {
		short var1 = 256;

		if (field495 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field495 > 768) {
					field264[var2] = method282(field266[var2], field265[var2], 1024 - field495);
				} else if (field495 > 256) {
					field264[var2] = field266[var2];
				} else {
					field264[var2] = method282(field265[var2], field266[var2], 256 - field495);
				}
			}
		} else if (field496 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field496 > 768) {
					field264[var3] = method282(field267[var3], field265[var3], 1024 - field496);
				} else if (field496 > 256) {
					field264[var3] = field267[var3];
				} else {
					field264[var3] = method282(field265[var3], field267[var3], 256 - field496);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field264[var4] = field265[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field142.field1508[var5] = field444.field912[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field317[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field356[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field264[var12];
					int var15 = field142.field1508[var7];
					field142.field1508[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field142.method593(field1208, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field143.field1508[var16] = field445.field912[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field317[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field356[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field264[var23];
					int var26 = field143.field1508[var18];
					field143.field1508[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field143.method593(field1208, 637, 0);
	}

	@ObfuscatedName("client.b(B)V")
	public final void method220() {
		field269.method592();

		if (field219 == 2) {
			byte[] var1 = field314.field1045;
			int[] var2 = CCFLBOBS.field90;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field487.method357(field223, 25, field373, 0, 256, field205, 33, 0, 25, 33);
			field270.method592();
			PKGGFQZB.field1028 = field388;
		} else {
			int var5 = field373 + field370 & 0x7FF;
			int var6 = field512.field756 / 32 + 48;
			int var7 = 464 - field512.field757 / 32;
			field335.method357(field123, var6, var5, 5, field460 + 256, field345, 151, 25, var7, 146);
			field487.method357(field223, 25, field373, 0, 256, field205, 33, 0, 25, 33);

			for (int var8 = 0; var8 < field337; var8++) {
				int var9 = field338[var8] * 4 + 2 - field512.field756 / 32;
				int var10 = field339[var8] * 4 + 2 - field512.field757 / 32;
				method202(var9, field435[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					ZXKMWHPZ var13 = field441[field199][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field512.field756 / 32;
						int var15 = var12 * 4 + 2 - field512.field757 / 32;
						method202(var14, field234, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field403; var16++) {
				BFCMZACY var17 = field402[field404[var16]];
				if (var17 != null && var17.method41()) {
					SHKUIFHF var18 = var17.field8;
					if (var18.field1167 != null) {
						var18 = var18.method504();
					}

					if (var18 != null && var18.field1139 && var18.field1149) {
						int var19 = var17.field756 / 32 - field512.field756 / 32;
						int var20 = var17.field757 / 32 - field512.field757 / 32;
						method202(var19, field235, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field276; var21++) {
				IOPHRJNF var22 = field275[field277[var21]];
				if (var22 != null && var22.method41()) {
					int var23 = var22.field756 / 32 - field512.field756 / 32;
					int var24 = var22.field757 / 32 - field512.field757 / 32;
					boolean var25 = false;
					long var26 = JQPXVJFJ.method323(var22.field819);
					for (int var28 = 0; var28 < field392; var28++) {
						if (field124[var28] == var26 && field195[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field512.field796 != 0 && var22.field796 != 0 && field512.field796 == var22.field796) {
						var29 = true;
					}

					if (var25) {
						method202(var23, field237, var24);
					} else if (var29) {
						method202(var23, field238, var24);
					} else {
						method202(var23, field236, var24);
					}
				}
			}

			if (field181 != 0 && field459 % 20 < 10) {
				if (field181 == 1 && field158 >= 0 && field158 < field402.length) {
					BFCMZACY var30 = field402[field158];
					if (var30 != null) {
						int var31 = var30.field756 / 32 - field512.field756 / 32;
						int var32 = var30.field757 / 32 - field512.field757 / 32;
						method181(var32, field529, var31);
					}
				}

				if (field181 == 2) {
					int var33 = (field210 - field291) * 4 + 2 - field512.field756 / 32;
					int var34 = (field211 - field292) * 4 + 2 - field512.field757 / 32;
					method181(var34, field529, var33);
				}

				if (field181 == 10 && field368 >= 0 && field368 < field275.length) {
					IOPHRJNF var35 = field275[field368];
					if (var35 != null) {
						int var36 = var35.field756 / 32 - field512.field756 / 32;
						int var37 = var35.field757 / 32 - field512.field757 / 32;
						method181(var37, field529, var36);
					}
				}
			}

			if (field333 != 0) {
				int var38 = field333 * 4 + 2 - field512.field756 / 32;
				int var39 = field334 * 4 + 2 - field512.field757 / 32;
				method202(var38, field528, var39);
			}

			CCFLBOBS.method143(0xFFFFFF, 97, 78, 3, 3);
			field270.method592();
			PKGGFQZB.field1028 = field388;
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method221() {
		if (field478 != 0) {
			int var1 = 0;
			if (field168 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field525[var2] != null) {
					int var3 = field523[var2];
					String var4 = field524[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field365 == 0 || field365 == 1 && method247(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1216 > 4 && field1217 - 4 > var8 - 10 && field1217 - 4 <= var8 + 3) {
							int var9 = field242.method98("From:  " + var4 + field525[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1216 < var9 + 4) {
								if (field194 >= 1) {
									field344[field260] = "Report abuse @whi@" + var4;
									field117[field260] = 2414;
									field260++;
								}

								field344[field260] = "Add ignore @whi@" + var4;
								field117[field260] = 2872;
								field260++;
								field344[field260] = "Add friend @whi@" + var4;
								field117[field260] = 2106;
								field260++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field365 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLBFQIDHPO;)V")
	public final void method222(int arg0, BFQIDHPO arg1) {
		int var3 = arg1.method65(8);
		if (var3 < field276) {
			for (int var4 = var3; var4 < field276; var4++) {
				field473[field472++] = field277[var4];
			}
		}

		if (var3 > field276) {
			signlink.reporterror(field329 + " Too many players");
			throw new RuntimeException("eek");
		}

		field276 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field277[var5];
			IOPHRJNF var7 = field275[var6];
			int var8 = arg1.method65(1);
			if (var8 == 0) {
				field277[field276++] = var6;
				var7.field755 = field459;
			} else {
				int var9 = arg1.method65(2);
				if (var9 == 0) {
					field277[field276++] = var6;
					var7.field755 = field459;
					field279[field278++] = var6;
				} else if (var9 == 1) {
					field277[field276++] = var6;
					var7.field755 = field459;
					int var10 = arg1.method65(3);
					var7.method317(var10, false);
					int var11 = arg1.method65(1);
					if (var11 == 1) {
						field279[field278++] = var6;
					}
				} else if (var9 == 2) {
					field277[field276++] = var6;
					var7.field755 = field459;
					int var12 = arg1.method65(3);
					var7.method317(var12, true);
					int var13 = arg1.method65(3);
					var7.method317(var13, true);
					int var14 = arg1.method65(1);
					if (var14 == 1) {
						field279[field278++] = var6;
					}
				} else if (var9 == 3) {
					field473[field472++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method223() {
		int var1 = 5;
		field230[8] = 0;
		int var2 = 0;
		while (field230[8] == 0) {
			String var3 = "Unknown problem";
			method169("Connecting to web server", 20);

			try {
				DataInputStream var4 = method199("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 367);
				BFQIDHPO var5 = new BFQIDHPO(new byte[40]);
				var4.readFully(var5.field9, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field230[var6] = var5.method59();
				}

				int var7 = var5.method59();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field230[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field230[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field230[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field230[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field230[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field230[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method169("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method169(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field281 = !field281;
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method224() {
		field484 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field154) {
				field417++;
				method196();
				method196();
				method219();
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

		field484 = false;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method225() {
		YCVHWRKK.field1454.method497();
		YCVHWRKK.field1479.method497();
		SHKUIFHF.field1143.method497();
		RBNCRAAP.field1093.method497();
		RBNCRAAP.field1067.method497();
		IOPHRJNF.field797.method497();
		CRSWMDQF.field555.method497();
	}

	@ObfuscatedName("client.c(B)V")
	public final void method226() {
		if (field1222 == 1) {
			if (field1223 >= 539 && field1223 <= 573 && field1224 >= 169 && field1224 < 205 && field376[0] != -1) {
				field399 = true;
				field342 = 0;
				field336 = true;
			}

			if (field1223 >= 569 && field1223 <= 599 && field1224 >= 168 && field1224 < 205 && field376[1] != -1) {
				field399 = true;
				field342 = 1;
				field336 = true;
			}

			if (field1223 >= 597 && field1223 <= 627 && field1224 >= 168 && field1224 < 205 && field376[2] != -1) {
				field399 = true;
				field342 = 2;
				field336 = true;
			}

			if (field1223 >= 625 && field1223 <= 669 && field1224 >= 168 && field1224 < 203 && field376[3] != -1) {
				field399 = true;
				field342 = 3;
				field336 = true;
			}

			if (field1223 >= 666 && field1223 <= 696 && field1224 >= 168 && field1224 < 205 && field376[4] != -1) {
				field399 = true;
				field342 = 4;
				field336 = true;
			}

			if (field1223 >= 694 && field1223 <= 724 && field1224 >= 168 && field1224 < 205 && field376[5] != -1) {
				field399 = true;
				field342 = 5;
				field336 = true;
			}

			if (field1223 >= 722 && field1223 <= 756 && field1224 >= 169 && field1224 < 205 && field376[6] != -1) {
				field399 = true;
				field342 = 6;
				field336 = true;
			}

			if (field1223 >= 540 && field1223 <= 574 && field1224 >= 466 && field1224 < 502 && field376[7] != -1) {
				field399 = true;
				field342 = 7;
				field336 = true;
			}

			if (field1223 >= 572 && field1223 <= 602 && field1224 >= 466 && field1224 < 503 && field376[8] != -1) {
				field399 = true;
				field342 = 8;
				field336 = true;
			}

			if (field1223 >= 599 && field1223 <= 629 && field1224 >= 466 && field1224 < 503 && field376[9] != -1) {
				field399 = true;
				field342 = 9;
				field336 = true;
			}

			if (field1223 >= 627 && field1223 <= 671 && field1224 >= 467 && field1224 < 502 && field376[10] != -1) {
				field399 = true;
				field342 = 10;
				field336 = true;
			}

			if (field1223 >= 669 && field1223 <= 699 && field1224 >= 466 && field1224 < 503 && field376[11] != -1) {
				field399 = true;
				field342 = 11;
				field336 = true;
			}

			if (field1223 >= 696 && field1223 <= 726 && field1224 >= 466 && field1224 < 503 && field376[12] != -1) {
				field399 = true;
				field342 = 12;
				field336 = true;
			}

			if (field1223 >= 724 && field1223 <= 758 && field1224 >= 466 && field1224 < 502 && field376[13] != -1) {
				field399 = true;
				field342 = 13;
				field336 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIILIOPHRJNF;I)V")
	public final void method227(int arg0, int arg1, IOPHRJNF arg2, int arg3) {
		if (field512 != arg2 && field260 < 400) {
			String var5;
			if (arg2.field800 == 0) {
				var5 = arg2.field819 + method170(field512.field821, arg2.field821) + " (level-" + arg2.field821 + ")";
			} else {
				var5 = arg2.field819 + " (skill-" + arg2.field800 + ")";
			}

			if (field429 == 1) {
				field344[field260] = "Use " + field433 + " with @whi@" + var5;
				field117[field260] = 453;
				field118[field260] = arg0;
				field115[field260] = arg3;
				field116[field260] = arg1;
				field260++;
			} else if (field127 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field358[var6] != null) {
						field344[field260] = field358[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field358[var6].equalsIgnoreCase("attack")) {
							if (arg2.field821 > field512.field821) {
								var7 = 2000;
							}

							if (field512.field796 != 0 && arg2.field796 != 0) {
								if (field512.field796 == arg2.field796) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field359[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field117[field260] = var7 + 403;
						}

						if (var6 == 1) {
							field117[field260] = var7 + 124;
						}

						if (var6 == 2) {
							field117[field260] = var7 + 764;
						}

						if (var6 == 3) {
							field117[field260] = var7 + 246;
						}

						if (var6 == 4) {
							field117[field260] = var7 + 329;
						}

						field118[field260] = arg0;
						field115[field260] = arg3;
						field116[field260] = arg1;
						field260++;
					}
				}
			} else if ((field129 & 0x8) == 8) {
				field344[field260] = field130 + " @whi@" + var5;
				field117[field260] = 322;
				field118[field260] = arg0;
				field115[field260] = arg3;
				field116[field260] = arg1;
				field260++;
			}

			for (int var8 = 0; var8 < field260; var8++) {
				if (field117[var8] == 903) {
					field344[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = XBVYIDUH.field1415[var7];
			int var13 = XBVYIDUH.field1416[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = XBVYIDUH.field1415[var8];
			int var16 = XBVYIDUH.field1416[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field452 = arg3 - var9;
		field453 = arg2 - var10;
		field454 = arg1 - var11;
		field455 = arg5;
		field456 = arg0;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method229() {
		try {
			if (field177 != null) {
				field177.method586();
			}
		} catch (Exception var2) {
		}

		field177 = null;
		field180 = false;
		field232 = 0;
		field329 = "";
		field330 = "";
		method225();
		field225.method373();

		for (int var1 = 0; var1 < 4; var1++) {
			field151[var1].method483();
		}

		System.gc();
		method212();
		field259 = -1;
		field220 = -1;
		field539 = 0;
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;Ljava/lang/String;)V")
	public final void method230(String arg0, String arg1) {
		if (field270 != null) {
			field270.method592();
			PKGGFQZB.field1028 = field388;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field242.method96(var3, 0, arg1, 257);
			field242.method96(var3 - 1, 0xFFFFFF, arg1, 256);
			var3 += 15;
			if (arg0 != null) {
				field242.method96(var3, 0, arg0, 257);
				field242.method96(var3 - 1, 0xFFFFFF, arg0, 256);
			}

			field270.method593(field1208, 4, 4);
		} else if (field1209 != null) {
			field1209.method592();
			PKGGFQZB.field1028 = field389;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			CCFLBOBS.method143(0, 383 - var5 / 2, var4 - 5 - var6 / 2, var5, var6);
			CCFLBOBS.method144(var4 - var6 / 2 - 5, 0xFFFFFF, 383 - var5 / 2, var6, var5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field242.method96(var4, 0, arg1, 383);
			field242.method96(var4 - 1, 0xFFFFFF, arg1, 382);
			var4 += 15;
			if (arg0 != null) {
				field242.method96(var4, 0, arg0, 383);
				field242.method96(var4 - 1, 0xFFFFFF, arg0, 382);
			}

			field1209.method593(field1208, 0, 0);
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method231(int arg0) {
		if (!field288) {
			for (int var2 = 0; var2 < field322.length; var2++) {
				int var3 = field322[var2];
				if (PKGGFQZB.field1036[var3] >= arg0) {
					RAOZRSKX var4 = PKGGFQZB.field1030[var3];
					int var5 = var4.field1048 * var4.field1047 - 1;
					int var6 = field517 * var4.field1047 * 2;
					byte[] var7 = var4.field1045;
					byte[] var8 = field420;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1045 = var8;
					field420 = var7;
					PKGGFQZB.method431(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method232() {
		byte[] var1 = field437.method526("title.dat", null);
		NDGQUJMA var2 = new NDGQUJMA(var1, this);
		field142.method592();
		var2.method351(0, 0);
		field143.method592();
		var2.method351(0, -637);
		field139.method592();
		var2.method351(0, -128);
		field140.method592();
		var2.method351(-371, -202);
		field141.method592();
		var2.method351(-171, -202);
		field144.method592();
		var2.method351(-265, 0);
		field145.method592();
		var2.method351(-265, -562);
		field146.method592();
		var2.method351(-171, -128);
		field147.method592();
		var2.method351(-171, -562);
		int[] var3 = new int[var2.field913];
		for (int var4 = 0; var4 < var2.field914; var4++) {
			for (int var5 = 0; var5 < var2.field913; var5++) {
				var3[var5] = var2.field912[var2.field913 * var4 + var2.field913 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field913; var6++) {
				var2.field912[var2.field913 * var4 + var6] = var3[var6];
			}
		}

		field142.method592();
		var2.method351(0, 382);
		field143.method592();
		var2.method351(0, -255);
		field139.method592();
		var2.method351(0, 254);
		field140.method592();
		var2.method351(-371, 180);
		field141.method592();
		var2.method351(-171, 180);
		field144.method592();
		var2.method351(-265, 382);
		field145.method592();
		var2.method351(-265, -180);
		field146.method592();
		var2.method351(-171, 254);
		field147.method592();
		var2.method351(-171, -180);
		NDGQUJMA var7 = new NDGQUJMA(field437, "logo", 0);
		field139.method592();
		var7.method353(18, 382 - var7.field913 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.d(B)V")
	public final void method233() {
		field326++;
		if (field326 > 122) {
			field326 = 0;
			field382.method43(58);
			field382.method48(0);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method518();
					if (var1 == -1) {
						return;
					}

					if (field383 != -1 && field383 == field319) {
						break;
					}

					if (field257) {
						if (var1 >= 32 && var1 <= 122 && field126.length() < 80) {
							field126 = field126 + (char) var1;
							field157 = true;
						}

						if (var1 == 8 && field126.length() > 0) {
							field126 = field126.substring(0, field126.length() - 1);
							field157 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field257 = false;
							field157 = true;

							if (field541 == 1) {
								long var2 = JQPXVJFJ.method323(field126);
								method163(var2);
							}

							if (field541 == 2 && field392 > 0) {
								long var4 = JQPXVJFJ.method323(field126);
								method290(var4);
							}

							if (field541 == 3 && field126.length() > 0) {
								field382.method43(21);
								field382.method44(0);
								int var6 = field382.field10;
								field382.method50(field467);
								OSSLGBQQ.method370(field382, field126);
								field382.method53(field382.field10 - var6);
								field126 = OSSLGBQQ.method371(field126);
								field126 = AYSHFCKR.method11(field126);
								method192(JQPXVJFJ.method327(JQPXVJFJ.method324(field467)), field126, 6);

								if (field365 == 2) {
									field365 = 1;
									field428 = true;
									field382.method43(83);
									field382.method44(field504);
									field382.method44(field365);
									field382.method44(field494);
								}
							}

							if (field541 == 4 && field396 < 100) {
								long var7 = JQPXVJFJ.method323(field126);
								method204(var7);
							}

							if (field541 == 5 && field396 > 0) {
								long var9 = JQPXVJFJ.method323(field126);
								method171(var9);
							}
						}
					} else if (field530 == 1) {
						if (var1 >= 48 && var1 <= 57 && field400.length() < 10) {
							field400 = field400 + (char) var1;
							field157 = true;
						}

						if (var1 == 8 && field400.length() > 0) {
							field400 = field400.substring(0, field400.length() - 1);
							field157 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field400.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field400);
								} catch (Exception var21) {
								}

								field382.method43(234);
								field382.method48(var11);
							}

							field530 = 0;
							field157 = true;
						}
					} else if (field530 == 2) {
						if (var1 >= 32 && var1 <= 122 && field400.length() < 12) {
							field400 = field400 + (char) var1;
							field157 = true;
						}

						if (var1 == 8 && field400.length() > 0) {
							field400 = field400.substring(0, field400.length() - 1);
							field157 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field400.length() > 0) {
								field382.method43(40);
								field382.method50(JQPXVJFJ.method323(field400));
							}

							field530 = 0;
							field157 = true;
						}
					} else if (field530 == 3) {
						if (var1 >= 32 && var1 <= 122 && field400.length() < 40) {
							field400 = field400 + (char) var1;
							field157 = true;
						}

						if (var1 == 8 && field400.length() > 0) {
							field400 = field400.substring(0, field400.length() - 1);
							field157 = true;
						}
					} else if (field369 == -1 && field272 == -1) {
						if (var1 >= 32 && var1 <= 122 && field202.length() < 80) {
							field202 = field202 + (char) var1;
							field157 = true;
						}

						if (var1 == 8 && field202.length() > 0) {
							field202 = field202.substring(0, field202.length() - 1);
							field157 = true;
						}

						if ((var1 == 13 || var1 == 10) && field202.length() > 0) {
							if (field194 == 2) {
								if (field202.equals("::clientdrop")) {
									method154();
								}

								if (field202.equals("::lag")) {
									method270();
								}

								if (field202.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field474.method122(2); var12++) {
										field474.method136(2, var12, (byte) 1);
									}
								}

								if (field202.equals("::fpson")) {
									field113 = true;
								}

								if (field202.equals("::fpsoff")) {
									field113 = false;
								}

								if (field202.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field151[var13].field1130[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field202.startsWith("::")) {
								field382.method43(33);
								field382.method44(field202.length() - 1);
								field382.method51(field202.substring(2));
							} else {
								String var16 = field202.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field202 = field202.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field202 = field202.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field202 = field202.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field202 = field202.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field202 = field202.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field202 = field202.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field202 = field202.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field202 = field202.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field202 = field202.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field202 = field202.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field202 = field202.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field202 = field202.substring(6);
								}

								String var18 = field202.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field202 = field202.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field202 = field202.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field202 = field202.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field202 = field202.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field202 = field202.substring(6);
								}

								field382.method43(183);
								field382.method44(0);
								int var20 = field382.field10;
								field382.method70(var17);
								field401.field10 = 0;
								OSSLGBQQ.method370(field401, field202);
								field382.method90(0, field401.field9, field401.field10);
								field382.method70(var19);
								field382.method53(field382.field10 - var20);
								field202 = OSSLGBQQ.method371(field202);
								field202 = AYSHFCKR.method11(field202);
								field512.field786 = field202;
								field512.field748 = var17;
								field512.field759 = var19;
								field512.field779 = 150;

								if (field194 == 2) {
									method192("@cr2@" + field512.field819, field512.field786, 2);
								} else if (field194 == 1) {
									method192("@cr1@" + field512.field819, field512.field786, 2);
								} else {
									method192(field512.field819, field512.field786, 2);
								}

								if (field504 == 2) {
									field504 = 3;
									field428 = true;
									field382.method43(83);
									field382.method44(field504);
									field382.method44(field365);
									field382.method44(field494);
								}
							}

							field202 = "";
							field157 = true;
						}
					}
				}

				if (var1 == 8 && field475.length() > 0) {
					field475 = field475.substring(0, field475.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field475.length() < 12) {
				field475 = field475 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.a(ZI[B)Z")
	public final boolean method234(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.e(B)V")
	public final void method235() {
		field154 = false;
		while (field484) {
			field154 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field187 = null;
		field188 = null;
		field224 = null;
		field264 = null;
		field265 = null;
		field266 = null;
		field267 = null;
		field131 = null;
		field132 = null;
		field356 = null;
		field357 = null;
		field444 = null;
		field445 = null;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method236() {
		if (field271 == null) {
			method235();
			field1209 = null;
			field139 = null;
			field140 = null;
			field141 = null;
			field142 = null;
			field143 = null;
			field144 = null;
			field145 = null;
			field146 = null;
			field147 = null;
			field271 = new ZTWZAULT(method271(), 479, 96);
			field269 = new ZTWZAULT(method271(), 172, 156);
			CCFLBOBS.method141();
			field314.method446(0, 0);
			field268 = new ZTWZAULT(method271(), 190, 261);
			field270 = new ZTWZAULT(method271(), 512, 334);
			CCFLBOBS.method141();
			field189 = new ZTWZAULT(method271(), 496, 50);
			field190 = new ZTWZAULT(method271(), 269, 37);
			field191 = new ZTWZAULT(method271(), 249, 45);
			field490 = true;
			field270.method592();
			PKGGFQZB.field1028 = field388;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method237() {
		for (int var1 = -1; var1 < field276; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field274;
			} else {
				var2 = field277[var1];
			}

			IOPHRJNF var3 = field275[var2];
			if (var3 != null && var3.field779 > 0) {
				var3.field779--;
				if (var3.field779 == 0) {
					var3.field786 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field403; var4++) {
			int var5 = field404[var4];
			BFCMZACY var6 = field402[var5];
			if (var6 != null && var6.field779 > 0) {
				var6.field779--;
				if (var6.field779 == 0) {
					var6.field786 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public final void method238(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field253 = 0;
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

			field253 = 0;
			label46: for (int var7 = 0; var7 < RBNCRAAP.field1094; var7++) {
				RBNCRAAP var8 = RBNCRAAP.method456(var7);
				if (var8.field1062 == -1 && var8.field1078 != null) {
					String var9 = var8.field1078.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field254[field253] = var9;
					field255[field253] = var7;
					field253++;
					if (field253 >= field254.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method239(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.F(I)V")
	public final void method240() {
		if (field307 == 0) {
			field344[0] = "Cancel";
			field117[0] = 1844;
			field260 = 1;
			if (field272 == -1) {
				method221();
				field361 = 0;
				field245 = 0;

				if (field1216 > 4 && field1217 > 4 && field1216 < 516 && field1217 < 338) {
					if (field383 == -1) {
						method274();
					} else {
						method210(field1216, 4, 4, field1217, 0, FMDWWBSX.method306(field383), 0);
					}
				}

				if (field451 != field361) {
					field451 = field361;
				}

				if (field245 != field203) {
					field203 = field245;
				}

				field361 = 0;
				field245 = 0;

				if (field1216 > 553 && field1217 > 205 && field1216 < 743 && field1217 < 466) {
					if (field519 != -1) {
						method210(field1216, 553, 205, field1217, 1, FMDWWBSX.method306(field519), 0);
					} else if (field376[field342] != -1) {
						method210(field1216, 553, 205, field1217, 1, FMDWWBSX.method306(field376[field342]), 0);
					}
				}

				if (field361 != field198) {
					field399 = true;
					field198 = field361;
				}

				if (field245 != field159) {
					field399 = true;
					field159 = field245;
				}

				field361 = 0;
				field245 = 0;

				if (field1216 > 17 && field1217 > 357 && field1216 < 496 && field1217 < 453) {
					if (field369 != -1) {
						method210(field1216, 17, 357, field1217, 2, FMDWWBSX.method306(field369), 0);
					} else if (field450 != -1) {
						method210(field1216, 17, 357, field1217, 3, FMDWWBSX.method306(field450), 0);
					} else if (field1217 < 434 && field1216 < 426 && field530 == 0) {
						method175(field1217 - 357, field1216 - 17);
					}
				}

				if ((field369 != -1 || field450 != -1) && field361 != field316) {
					field157 = true;
					field316 = field361;
				}

				if ((field369 != -1 || field450 != -1) && field245 != field112) {
					field157 = true;
					field112 = field245;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field260 - 1; var2++) {
						if (field117[var2] < 1000 && field117[var2 + 1] > 1000) {
							String var3 = field344[var2];
							field344[var2] = field344[var2 + 1];
							field344[var2 + 1] = var3;
							int var4 = field117[var2];
							field117[var2] = field117[var2 + 1];
							field117[var2 + 1] = var4;
							int var5 = field115[var2];
							field115[var2] = field115[var2 + 1];
							field115[var2 + 1] = var5;
							int var6 = field116[var2];
							field116[var2] = field116[var2 + 1];
							field116[var2 + 1] = var6;
							int var7 = field118[var2];
							field118[var2] = field118[var2 + 1];
							field118[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field361 = 0;
				field245 = 0;
				method210(field1216, 0, 0, field1217, 0, FMDWWBSX.method306(field272), 0);

				if (field451 != field361) {
					field451 = field361;
				}

				if (field245 != field203) {
					field203 = field245;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method241(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;IILjava/lang/String;I)LVSQMPWOM;")
	public final VSQMPWOM method242(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field522[0] != null) {
				var6 = field522[0].method529(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field366.reset();
			field366.update(var6);
			int var8 = (int) field366.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new VSQMPWOM(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method169("Requesting " + arg0, arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method199(arg3 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				BFQIDHPO var16 = new BFQIDHPO(var15);
				var16.field10 = 3;
				int var17 = var16.method58() + 6;
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
						method169("Loading " + arg0 + " - " + var22 + "%", arg2);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field522[0] != null) {
						field522[0].method530(arg1, var6.length, var6);
					}
				} catch (Exception var28) {
					field522[0] = null;
				}

				if (var6 != null) {
					field366.reset();
					field366.update(var6);
					int var23 = (int) field366.getValue();
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
						method169("Game updated - please reload page", arg2);
						var25 = 10;
					} else {
						method169(var11 + " - Retrying in " + var25, arg2);
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

				field281 = !field281;
			}
		}

		return new VSQMPWOM(var6);
	}

	@ObfuscatedName("client.G(I)V")
	public final void method243() {
		if (field307 == 0) {
			int var1 = field1222;
			if (field127 == 1 && field1223 >= 516 && field1224 >= 160 && field1223 <= 765 && field1224 <= 205) {
				var1 = 0;
			}

			if (field229) {
				if (var1 != 1) {
					int var2 = field1216;
					int var3 = field1217;
					if (field247 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field247 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field247 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field248 - 10 || var2 > field250 + field248 + 10 || var3 < field249 - 10 || var3 > field251 + field249 + 10) {
						field229 = false;

						if (field247 == 1) {
							field399 = true;
						}

						if (field247 == 2) {
							field157 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field248;
					int var5 = field249;
					int var6 = field250;
					int var7 = field1223;
					int var8 = field1224;
					if (field247 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field247 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field247 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field260; var10++) {
						int var11 = (field260 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method248(var9);
					}

					field229 = false;

					if (field247 == 1) {
						field399 = true;
					}

					if (field247 == 2) {
						field157 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field260 > 0) {
					int var12 = field117[field260 - 1];
					if (var12 == 191 || var12 == 603 || var12 == 972 || var12 == 517 || var12 == 788 || var12 == 500 || var12 == 360 || var12 == 986 || var12 == 508 || var12 == 959 || var12 == 286 || var12 == 1690) {
						int var13 = field115[field260 - 1];
						int var14 = field116[field260 - 1];
						FMDWWBSX var15 = FMDWWBSX.method306(var14);
						if (var15.field639 || var15.field628) {
							field261 = false;
							field176 = 0;
							field305 = var14;
							field306 = var13;
							field307 = 2;
							field308 = field1223;
							field309 = field1224;

							if (FMDWWBSX.method306(var14).field630 == field383) {
								field307 = 1;
							}

							if (FMDWWBSX.method306(var14).field630 == field369) {
								field307 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field348 == 1 || method206(field260 - 1)) && field260 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field260 > 0) {
					method248(field260 - 1);
				}

				if (var1 != 2 || field260 <= 0) {
					return;
				}

				method176();
			}
		}
	}

	@ObfuscatedName("client.a(ILFMDWWBSX;I)I")
	public final int method244(FMDWWBSX arg0, int arg1) {
		if (arg0.field627 == null || arg1 >= arg0.field627.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field627[arg1];
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
					var8 = field379[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field347[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field341[var3[var5++]];
				}

				if (var7 == 4) {
					FMDWWBSX var10 = FMDWWBSX.method306(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < RBNCRAAP.field1094 && (!RBNCRAAP.method456(var11).field1072 || field287)) {
						for (int var12 = 0; var12 < var10.field624.length; var12++) {
							if (var11 + 1 == var10.field624[var12]) {
								var8 += var10.field664[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field493[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field536[field347[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field493[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field512.field821;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < JJRWUNEJ.field870; var13++) {
						if (JJRWUNEJ.field872[var13]) {
							var8 += field347[var13];
						}
					}
				}

				if (var7 == 10) {
					FMDWWBSX var14 = FMDWWBSX.method306(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < RBNCRAAP.field1094 && (!RBNCRAAP.method456(var15).field1072 || field287)) {
						for (int var16 = 0; var16 < var14.field624.length; var16++) {
							if (var14.field624[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field240;
				}

				if (var7 == 12) {
					var8 = field485;
				}

				if (var7 == 13) {
					int var17 = field493[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					USQYPEQB var20 = USQYPEQB.field1259[var19];
					int var21 = var20.field1261;
					int var22 = var20.field1262;
					int var23 = var20.field1263;
					int var24 = field226[var23 - var22];
					var8 = field493[var21] >> var22 & var24;
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
					var8 = (field512.field756 >> 7) + field291;
				}

				if (var7 == 19) {
					var8 = (field512.field757 >> 7) + field292;
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

	@ObfuscatedName("client.b(ILFMDWWBSX;)Z")
	public final boolean method245(FMDWWBSX arg0) {
		int var2 = arg0.field679;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field344[field260] = "Remove @whi@" + arg0.field638;
				field117[field260] = 281;
				field260++;
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

		field344[field260] = "Remove @whi@" + field138[var2];
		field117[field260] = 921;
		field260++;
		field344[field260] = "Message @whi@" + field138[var2];
		field117[field260] = 694;
		field260++;
		return true;
	}

	@ObfuscatedName("client.m(Z)Z")
	public final boolean method246() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)Z")
	public final boolean method247(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field392; var2++) {
			if (arg0.equalsIgnoreCase(field138[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field512.field819)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method248(int arg0) {
		if (arg0 >= 0) {
			int var2 = field115[arg0];
			int var3 = field116[arg0];
			int var4 = field117[arg0];
			int var5 = field118[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field530 != 0 && var4 != 1844) {
				field530 = 0;
				field157 = true;
			}

			if (var4 == 416 || var4 == 918) {
				String var6 = field344[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					var6 = var6.substring(var7 + 5).trim();
					String var8 = JQPXVJFJ.method327(JQPXVJFJ.method324(JQPXVJFJ.method323(var6)));
					boolean var9 = false;
					for (int var10 = 0; var10 < field276; var10++) {
						IOPHRJNF var11 = field275[field277[var10]];
						if (var11 != null && var11.field819 != null && var11.field819.equalsIgnoreCase(var8)) {
							method217(0, 0, var11.field777[0], false, 1, var11.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);

							if (var4 == 416) {
								field382.method43(195);
								field382.method79(field277[var10]);
							}

							if (var4 == 918) {
								if ((var5 & 0x3) == 0) {
									field513++;
								}

								if (field513 >= 112) {
									field382.method43(13);
									field513 = 0;
								}

								field382.method43(176);
								field382.method45(field277[var10]);
							}

							var9 = true;
							break;
						}
					}

					if (!var9) {
						method192("", "Unable to find " + var8, 0);
					}
				}
			}

			if (var4 == 124) {
				IOPHRJNF var12 = field275[var5];
				if (var12 != null) {
					method217(0, 0, var12.field777[0], false, 1, var12.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field111++;
					if (field111 >= 85) {
						field382.method43(212);
						field382.method48(0);
						field111 = 0;
					}

					field382.method43(251);
					field382.method79(var5);
				}
			}

			if (var4 == 5) {
				boolean var13 = method217(0, 0, var3, false, 0, var2, 2, field512.field776[0], field512.field777[0], 0, 0);
				if (!var13) {
					method217(0, 0, var3, false, 1, var2, 2, field512.field776[0], field512.field777[0], 1, 0);
				}

				field446 = field1223;
				field447 = field1224;
				field449 = 2;
				field448 = 0;
				field382.method43(14);
				field382.method45(field291 + var2);
				field382.method80(var5);
				field382.method78(field292 + var3);
			}

			if (var4 == 530) {
				method215(var2, var5, var3);
				field382.method43(185);
				field382.method45(field292 + var3);
				field382.method78(field291 + var2);
				field382.method78(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 125) {
				field382.method43(50);
				field382.method45(var3);
				FMDWWBSX var15 = FMDWWBSX.method306(var3);
				if (var15.field627 != null && var15.field627[0][0] == 5) {
					int var16 = var15.field627[0][1];
					field493[var16] = 1 - field493[var16];
					method155(var16);
					field399 = true;
				}
			}

			if (var4 == 986) {
				field382.method43(63);
				field382.method45(var5);
				field382.method79(var3);
				field382.method80(var2);
				field421 = 0;
				field422 = var3;
				field423 = var2;
				field424 = 2;
				if (FMDWWBSX.method306(var3).field630 == field383) {
					field424 = 1;
				}

				if (FMDWWBSX.method306(var3).field630 == field369) {
					field424 = 3;
				}
			}

			if (var4 == 191) {
				field382.method43(201);
				field382.method79(var2);
				field382.method79(var3);
				field382.method79(var5);
				field421 = 0;
				field422 = var3;
				field423 = var2;
				field424 = 2;
				if (FMDWWBSX.method306(var3).field630 == field383) {
					field424 = 1;
				}

				if (FMDWWBSX.method306(var3).field630 == field369) {
					field424 = 3;
				}
			}

			if (var4 == 58) {
				method215(var2, var5, var3);
				field382.method43(86);
				field382.method78(field292 + var3);
				field382.method79(field291 + var2);
				field382.method45(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 1690) {
				RBNCRAAP var17 = RBNCRAAP.method456(var5);
				FMDWWBSX var18 = FMDWWBSX.method306(var3);
				String var19;
				if (var18 != null && var18.field664[var2] >= 100000) {
					var19 = var18.field664[var2] + " x " + var17.field1078;
				} else if (var17.field1085 == null) {
					var19 = "It's a " + var17.field1078 + ".";
				} else {
					var19 = new String(var17.field1085);
				}

				method192("", var19, 0);
			}

			if (var4 == 788) {
				field382.method43(113);
				field382.method80(var3);
				field382.method45(var2);
				field382.method78(var5);
				field421 = 0;
				field422 = var3;
				field423 = var2;
				field424 = 2;
				if (FMDWWBSX.method306(var3).field630 == field383) {
					field424 = 1;
				}

				if (FMDWWBSX.method306(var3).field630 == field369) {
					field424 = 3;
				}
			}

			if (var4 == 760 && method215(var2, var5, var3)) {
				field382.method43(213);
				field382.method45(var5 >> 14 & 0x7FFF);
				field382.method45(field431);
				field382.method80(field291 + var2);
				field382.method79(field432);
				field382.method78(field430);
				field382.method80(field292 + var3);
			}

			if (var4 == 827) {
				method205(field450);
				field450 = -1;
				field157 = true;
			}

			if (var4 == 482) {
				boolean var20 = method217(0, 0, var3, false, 0, var2, 2, field512.field776[0], field512.field777[0], 0, 0);
				if (!var20) {
					method217(0, 0, var3, false, 1, var2, 2, field512.field776[0], field512.field777[0], 1, 0);
				}

				field446 = field1223;
				field447 = field1224;
				field449 = 2;
				field448 = 0;
				field382.method43(11);
				field382.method79(field291 + var2);
				field382.method45(var5);
				field382.method78(field292 + var3);
				field382.method45(field128);
			}

			if (var4 == 329) {
				IOPHRJNF var22 = field275[var5];
				if (var22 != null) {
					method217(0, 0, var22.field777[0], false, 1, var22.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field382.method43(84);
					field382.method45(var5);
				}
			}

			if (var4 == 903) {
				if (field229) {
					field225.method411(var2 - 4, var3 - 4);
				} else {
					field225.method411(field1223 - 4, field1224 - 4);
				}
			}

			if (var4 == 307) {
				boolean var23 = method217(0, 0, var3, false, 0, var2, 2, field512.field776[0], field512.field777[0], 0, 0);
				if (!var23) {
					method217(0, 0, var3, false, 1, var2, 2, field512.field776[0], field512.field777[0], 1, 0);
				}

				field446 = field1223;
				field447 = field1224;
				field449 = 2;
				field448 = 0;
				field382.method43(215);
				field382.method79(field292 + var3);
				field382.method79(var5);
				field382.method79(field291 + var2);
			}

			if (var4 == 817) {
				field382.method43(224);
				field382.method78(var2);
				field382.method78(field128);
				field382.method79(var3);
				field382.method80(var5);
				field421 = 0;
				field422 = var3;
				field423 = var2;
				field424 = 2;
				if (FMDWWBSX.method306(var3).field630 == field383) {
					field424 = 1;
				}

				if (FMDWWBSX.method306(var3).field630 == field369) {
					field424 = 3;
				}
			}

			if (var4 == 414) {
				String var25 = field344[arg0];
				int var26 = var25.indexOf("@whi@");
				if (var26 != -1) {
					if (field383 == -1) {
						method260();
						field475 = var25.substring(var26 + 5).trim();
						field239 = false;
						field319 = field383 = FMDWWBSX.field651;
					} else {
						method192("", "Please close the interface you have open before using 'report abuse'", 0);
					}
				}
			}

			if (var4 == 995) {
				boolean var27 = method217(0, 0, var3, false, 0, var2, 2, field512.field776[0], field512.field777[0], 0, 0);
				if (!var27) {
					method217(0, 0, var3, false, 1, var2, 2, field512.field776[0], field512.field777[0], 1, 0);
				}

				field446 = field1223;
				field447 = field1224;
				field449 = 2;
				field448 = 0;

				if ((field291 & 0x3) == 0) {
					field289++;
				}

				if (field289 >= 130) {
					field382.method43(150);
					field382.method44(244);
					field289 = 0;
				}

				field382.method43(30);
				field382.method79(field292 + var3);
				field382.method45(field291 + var2);
				field382.method78(var5);
			}

			if (var4 == 1237) {
				method215(var2, var5, var3);
				field382.method43(236);
				field382.method80(field291 + var2);
				field382.method78(var5 >> 14 & 0x7FFF);
				field382.method79(field292 + var3);
			}

			if (var4 == 500) {
				field382.method43(71);
				field382.method45(var5);
				field382.method45(var2);
				field382.method80(var3);
				field421 = 0;
				field422 = var3;
				field423 = var2;
				field424 = 2;
				if (FMDWWBSX.method306(var3).field630 == field383) {
					field424 = 1;
				}

				if (FMDWWBSX.method306(var3).field630 == field369) {
					field424 = 3;
				}
			}

			if (var4 == 977) {
				BFCMZACY var29 = field402[var5];
				if (var29 != null) {
					method217(0, 0, var29.field777[0], false, 1, var29.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;

					if ((var5 & 0x3) == 0) {
						field381++;
					}

					if (field381 >= 126) {
						field382.method43(235);
						field382.method47(0x4AAB68);
						field381 = 0;
					}

					field382.method43(99);
					field382.method78(var5);
				}
			}

			if (var4 == 322) {
				IOPHRJNF var30 = field275[var5];
				if (var30 != null) {
					method217(0, 0, var30.field777[0], false, 1, var30.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field382.method43(96);
					field382.method45(field128);
					field382.method80(var5);
				}
			}

			if (var4 == 526) {
				BFCMZACY var31 = field402[var5];
				if (var31 != null) {
					method217(0, 0, var31.field777[0], false, 1, var31.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field486 += var5;
					if (field486 >= 144) {
						field382.method43(48);
						field486 = 0;
					}

					field382.method43(216);
					field382.method79(var5);
				}
			}

			if (var4 == 112) {
				BFCMZACY var32 = field402[var5];
				if (var32 != null) {
					method217(0, 0, var32.field777[0], false, 1, var32.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field382.method43(117);
					field382.method45(var5);
				}
			}

			if (var4 == 304) {
				method215(var2, var5, var3);
				field382.method43(119);
				field382.method78(field291 + var2);
				field382.method80(var5 >> 14 & 0x7FFF);
				field382.method78(field292 + var3);
			}

			if (var4 == 246) {
				IOPHRJNF var33 = field275[var5];
				if (var33 != null) {
					method217(0, 0, var33.field777[0], false, 1, var33.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field382.method43(195);
					field382.method79(var5);
				}
			}

			if (var4 == 360) {
				field382.method43(61);
				field382.method45(var3);
				field382.method78(var2);
				field382.method45(var5);
				field421 = 0;
				field422 = var3;
				field423 = var2;
				field424 = 2;
				if (FMDWWBSX.method306(var3).field630 == field383) {
					field424 = 1;
				}

				if (FMDWWBSX.method306(var3).field630 == field369) {
					field424 = 3;
				}
			}

			if (var4 == 453) {
				IOPHRJNF var34 = field275[var5];
				if (var34 != null) {
					method217(0, 0, var34.field777[0], false, 1, var34.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field382.method43(103);
					field382.method80(field431);
					field382.method80(field432);
					field382.method78(var5);
					field382.method80(field430);
				}
			}

			if (var4 == 517) {
				field382.method43(98);
				field382.method79(var2);
				field382.method78(var5);
				field382.method79(var3);
				field421 = 0;
				field422 = var3;
				field423 = var2;
				field424 = 2;
				if (FMDWWBSX.method306(var3).field630 == field383) {
					field424 = 1;
				}

				if (FMDWWBSX.method306(var3).field630 == field369) {
					field424 = 3;
				}
			}

			if (var4 == 1260) {
				RBNCRAAP var35 = RBNCRAAP.method456(var5);
				String var36;
				if (var35.field1085 == null) {
					var36 = "It's a " + var35.field1078 + ".";
				} else {
					var36 = new String(var35.field1085);
				}

				method192("", var36, 0);
			}

			if (var4 == 764) {
				IOPHRJNF var37 = field275[var5];
				if (var37 != null) {
					method217(0, 0, var37.field777[0], false, 1, var37.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field382.method43(34);
					field382.method78(var5);
				}
			}

			if (var4 == 1170) {
				BFCMZACY var38 = field402[var5];
				if (var38 != null) {
					SHKUIFHF var39 = var38.field8;
					if (var39.field1167 != null) {
						var39 = var39.method504();
					}

					if (var39 != null) {
						String var40;
						if (var39.field1142 == null) {
							var40 = "It's a " + var39.field1157 + ".";
						} else {
							var40 = new String(var39.field1142);
						}

						method192("", var40, 0);
					}
				}
			}

			if (var4 == 565) {
				FMDWWBSX var41 = FMDWWBSX.method306(var3);
				field127 = 1;
				field128 = var3;
				field129 = var41.field643;
				field429 = 0;
				field399 = true;
				String var42 = var41.field680;
				if (var42.indexOf(" ") != -1) {
					var42 = var42.substring(0, var42.indexOf(" "));
				}

				String var43 = var41.field680;
				if (var43.indexOf(" ") != -1) {
					var43 = var43.substring(var43.indexOf(" ") + 1);
				}

				field130 = var42 + " " + var41.field632 + " " + var43;

				if (field129 == 16) {
					field399 = true;
					field342 = 3;
					field336 = true;
				}
			} else {
				if (var4 == 947) {
					BFCMZACY var44 = field402[var5];
					if (var44 != null) {
						method217(0, 0, var44.field777[0], false, 1, var44.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
						field446 = field1223;
						field447 = field1224;
						field449 = 2;
						field448 = 0;
						field382.method43(137);
						field382.method79(field128);
						field382.method79(var5);
					}
				}

				if (var4 == 694) {
					String var45 = field344[arg0];
					int var46 = var45.indexOf("@whi@");
					if (var46 != -1) {
						long var47 = JQPXVJFJ.method323(var45.substring(var46 + 5).trim());
						int var49 = -1;
						for (int var50 = 0; var50 < field392; var50++) {
							if (field124[var50] == var47) {
								var49 = var50;
								break;
							}
						}

						if (var49 != -1 && field195[var49] > 0) {
							field157 = true;
							field530 = 0;
							field257 = true;
							field126 = "";
							field541 = 3;
							field467 = field124[var49];
							field155 = "Enter message to send to " + field138[var49];
						}
					}
				}

				if (var4 == 14) {
					field382.method43(50);
					field382.method45(var3);
					FMDWWBSX var51 = FMDWWBSX.method306(var3);
					if (var51.field627 != null && var51.field627[0][0] == 5) {
						int var52 = var51.field627[0][1];
						if (field493[var52] != var51.field647[0]) {
							field493[var52] = var51.field647[0];
							method155(var52);
							field399 = true;
						}
					}
				}

				if (var4 == 479) {
					method215(var2, var5, var3);
					field382.method43(59);
					field382.method79(field292 + var3);
					field382.method45(field291 + var2);
					field382.method45(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 959) {
					field382.method43(65);
					field382.method80(var5);
					field382.method80(var2);
					field382.method79(var3);
					field421 = 0;
					field422 = var3;
					field423 = var2;
					field424 = 2;
					if (FMDWWBSX.method306(var3).field630 == field383) {
						field424 = 1;
					}

					if (FMDWWBSX.method306(var3).field630 == field369) {
						field424 = 3;
					}
				}

				if (var4 == 270) {
					boolean var53 = method217(0, 0, var3, false, 0, var2, 2, field512.field776[0], field512.field777[0], 0, 0);
					if (!var53) {
						method217(0, 0, var3, false, 1, var2, 2, field512.field776[0], field512.field777[0], 1, 0);
					}

					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field382.method43(62);
					field382.method45(field292 + var3);
					field382.method45(var5);
					field382.method79(field291 + var2);
				}

				if (var4 == 508) {
					field382.method43(193);
					field382.method45(var2);
					field382.method80(var3);
					field382.method80(var5);
					field421 = 0;
					field422 = var3;
					field423 = var2;
					field424 = 2;
					if (FMDWWBSX.method306(var3).field630 == field383) {
						field424 = 1;
					}

					if (FMDWWBSX.method306(var3).field630 == field369) {
						field424 = 3;
					}
				}

				if (var4 == 403) {
					IOPHRJNF var55 = field275[var5];
					if (var55 != null) {
						method217(0, 0, var55.field777[0], false, 1, var55.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
						field446 = field1223;
						field447 = field1224;
						field449 = 2;
						field448 = 0;

						if ((var5 & 0x3) == 0) {
							field513++;
						}

						if (field513 >= 112) {
							field382.method43(13);
							field513 = 0;
						}

						field382.method43(176);
						field382.method45(var5);
					}
				}

				if (var4 == 106 || var4 == 872 || var4 == 921 || var4 == 281) {
					String var56 = field344[arg0];
					int var57 = var56.indexOf("@whi@");
					if (var57 != -1) {
						long var58 = JQPXVJFJ.method323(var56.substring(var57 + 5).trim());
						if (var4 == 106) {
							method163(var58);
						}

						if (var4 == 872) {
							method204(var58);
						}

						if (var4 == 921) {
							method290(var58);
						}

						if (var4 == 281) {
							method171(var58);
						}
					}
				}

				if (var4 == 253) {
					FMDWWBSX var60 = FMDWWBSX.method306(var3);
					boolean var61 = true;
					if (var60.field679 > 0) {
						var61 = method209(var60);
					}

					if (var61) {
						field382.method43(50);
						field382.method45(var3);
					}
				}

				if (var4 == 435) {
					boolean var62 = method217(0, 0, var3, false, 0, var2, 2, field512.field776[0], field512.field777[0], 0, 0);
					if (!var62) {
						method217(0, 0, var3, false, 1, var2, 2, field512.field776[0], field512.field777[0], 1, 0);
					}

					field446 = field1223;
					field447 = field1224;
					field449 = 2;
					field448 = 0;
					field521 += var5;
					if (field521 >= 111) {
						field382.method43(73);
						field382.method47(0x60A2A2);
						field521 = 0;
					}

					field382.method43(67);
					field382.method79(field291 + var2);
					field382.method80(var5);
					field382.method79(field292 + var3);
				}

				if (var4 == 151) {
					field382.method43(169);
					field382.method79(var2);
					field382.method80(field432);
					field382.method79(field431);
					field382.method79(var5);
					field382.method78(var3);
					field382.method78(field430);
					field421 = 0;
					field422 = var3;
					field423 = var2;
					field424 = 2;
					if (FMDWWBSX.method306(var3).field630 == field383) {
						field424 = 1;
					}

					if (FMDWWBSX.method306(var3).field630 == field369) {
						field424 = 3;
					}
				}

				if (var4 == 709) {
					BFCMZACY var64 = field402[var5];
					if (var64 != null) {
						method217(0, 0, var64.field777[0], false, 1, var64.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
						field446 = field1223;
						field447 = field1224;
						field449 = 2;
						field448 = 0;
						field382.method43(39);
						field382.method80(var5);
					}
				}

				if (var4 == 286) {
					field429 = 1;
					field430 = var2;
					field431 = var3;
					field432 = var5;
					field433 = String.valueOf(RBNCRAAP.method456(var5).field1078);
					field127 = 0;
					field399 = true;
				} else {
					if (var4 == 727) {
						method260();
					}

					if (var4 == 1551) {
						int var65 = var5 >> 14 & 0x7FFF;
						YCVHWRKK var66 = YCVHWRKK.method575(var65);
						String var67;
						if (var66.field1468 == null) {
							var67 = "It's a " + var66.field1455 + ".";
						} else {
							var67 = new String(var66.field1468);
						}

						method192("", var67, 0);
					}

					if (var4 == 963) {
						BFCMZACY var68 = field402[var5];
						if (var68 != null) {
							method217(0, 0, var68.field777[0], false, 1, var68.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
							field446 = field1223;
							field447 = field1224;
							field449 = 2;
							field448 = 0;
							field382.method43(206);
							field382.method45(field432);
							field382.method78(field431);
							field382.method80(field430);
							field382.method79(var5);
						}
					}

					if (var4 == 741) {
						BFCMZACY var69 = field402[var5];
						if (var69 != null) {
							method217(0, 0, var69.field777[0], false, 1, var69.field776[0], 2, field512.field776[0], field512.field777[0], 1, 0);
							field446 = field1223;
							field447 = field1224;
							field449 = 2;
							field448 = 0;
							field382.method43(10);
							field382.method79(var5);
						}
					}

					if (var4 == 212) {
						boolean var70 = method217(0, 0, var3, false, 0, var2, 2, field512.field776[0], field512.field777[0], 0, 0);
						if (!var70) {
							method217(0, 0, var3, false, 1, var2, 2, field512.field776[0], field512.field777[0], 1, 0);
						}

						field446 = field1223;
						field447 = field1224;
						field449 = 2;
						field448 = 0;
						field382.method43(226);
						field382.method78(field291 + var2);
						field382.method45(var5);
						field382.method45(field431);
						field382.method78(field430);
						field382.method79(field292 + var3);
						field382.method79(field432);
					}

					if (var4 == 683 && !field218) {
						field382.method43(105);
						field382.method45(var3);
						field218 = true;
					}

					if (var4 == 603) {
						field382.method43(159);
						field382.method79(var5);
						field382.method80(var3);
						field382.method45(var2);
						field421 = 0;
						field422 = var3;
						field423 = var2;
						field424 = 2;
						if (FMDWWBSX.method306(var3).field630 == field383) {
							field424 = 1;
						}

						if (FMDWWBSX.method306(var3).field630 == field369) {
							field424 = 3;
						}
					}

					if (var4 == 972) {
						field382.method43(244);
						field382.method80(var5);
						field382.method80(var3);
						field382.method79(var2);
						field421 = 0;
						field422 = var3;
						field423 = var2;
						field424 = 2;
						if (FMDWWBSX.method306(var3).field630 == field383) {
							field424 = 1;
						}

						if (FMDWWBSX.method306(var3).field630 == field369) {
							field424 = 3;
						}
					}

					if (var4 == 625 && method215(var2, var5, var3)) {
						field382.method43(173);
						field382.method79(field291 + var2);
						field382.method80(field128);
						field382.method79(var5 >> 14 & 0x7FFF);
						field382.method45(field292 + var3);
					}

					field429 = 0;
					field127 = 0;
					field399 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method249(boolean arg0) {
		if (field512.field756 >> 7 == field333 && field512.field757 >> 7 == field334) {
			field333 = 0;
		}

		int var2 = field276;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			IOPHRJNF var4;
			int var5;
			if (arg0) {
				var4 = field512;
				var5 = field274 << 14;
			} else {
				var4 = field275[field277[var3]];
				var5 = field277[var3] << 14;
			}

			if (var4 != null && var4.method41()) {
				var4.field814 = false;
				if ((field288 && field276 > 50 || field276 > 200) && !arg0 && var4.field752 == var4.field734) {
					var4.field814 = true;
				}

				int var6 = var4.field756 >> 7;
				int var7 = var4.field757 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field804 == null || field459 < var4.field816 || field459 >= var4.field817) {
						if ((var4.field756 & 0x7F) == 0x40 && (var4.field757 & 0x7F) == 0x40) {
							if (field304[var6][var7] == field122) {
								continue;
							}

							field304[var6][var7] = field122;
						}

						var4.field798 = method190(var4.field757, field199, var4.field756);
						field225.method384(var4.field758, field199, var4.field757, 60, var4.field798, var4, var5, var4.field787, var4.field756);
					} else {
						var4.field814 = false;
						var4.field798 = method190(var4.field757, field199, var4.field756);
						field225.method385(var4, var4.field757, field199, var4.field756, var4.field810, var5, var4.field758, var4.field798, var4.field813, 60, var4.field811, var4.field812);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(IILBFQIDHPO;)V")
	public final void method250(int arg0, BFQIDHPO arg1) {
		while (arg1.field11 + 21 < arg0 * 8) {
			int var3 = arg1.method65(14);
			if (var3 == 16383) {
				break;
			}

			if (field402[var3] == null) {
				field402[var3] = new BFCMZACY();
			}

			BFCMZACY var4 = field402[var3];
			field404[field403++] = var3;
			var4.field755 = field459;
			var4.field8 = SHKUIFHF.method501(arg1.method65(13));
			int var5 = arg1.method65(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method65(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method65(1);
			int var8 = arg1.method65(1);
			if (var8 == 1) {
				field279[field278++] = var3;
			}

			var4.field746 = var4.field8.field1153;
			var4.field766 = var4.field8.field1148;
			var4.field736 = var4.field8.field1163;
			var4.field737 = var4.field8.field1165;
			var4.field738 = var4.field8.field1141;
			var4.field739 = var4.field8.field1168;
			var4.field734 = var4.field8.field1172;
			var4.method316(field512.field777[0] + var6, var7 == 1, field512.field776[0] + var5);
		}

		arg1.method66();
	}

	@ObfuscatedName("client.a(ILBFQIDHPO;B)V")
	public final void method251(int arg0, BFQIDHPO arg1) {
		while (arg1.field11 + 10 < arg0 * 8) {
			int var3 = arg1.method65(11);
			if (var3 == 2047) {
				break;
			}

			if (field275[var3] == null) {
				field275[var3] = new IOPHRJNF();
				if (field280[var3] != null) {
					field275[var3].method321(field280[var3]);
				}
			}

			field277[field276++] = var3;
			IOPHRJNF var4 = field275[var3];
			var4.field755 = field459;
			int var5 = arg1.method65(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method65(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method65(1);
			int var8 = arg1.method65(1);
			if (var8 == 1) {
				field279[field278++] = var3;
			}

			var4.method316(field512.field777[0] + var6, var7 == 1, field512.field776[0] + var5);
		}

		arg1.method66();
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method252() {
		for (IYAQHTAH var1 = (IYAQHTAH) field152.method598(); var1 != null; var1 = (IYAQHTAH) field152.method600()) {
			if (var1.field844 == -1) {
				var1.field840 = 0;
				method293(var1);
			} else {
				var1.method329();
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method253() {
		if (field478 != 0) {
			BKBLJVKV var1 = field242;
			int var2 = 0;
			if (field168 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field525[var3] != null) {
					int var4 = field523[var3];
					String var5 = field524[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field365 == 0 || field365 == 1 && method247(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method100(var7, "From", var8, 0);
						var1.method100(var7 - 1, "From", var8, 0xFFFF);
						int var11 = var8 + var1.method98("From ");
						if (var6 == 1) {
							field119[0].method446(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field119[1].method446(var7 - 12, var11);
							var11 += 14;
						}

						var1.method100(var7, var5 + ": " + field525[var3], var11, 0);
						var1.method100(var7 - 1, var5 + ": " + field525[var3], var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field365 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method100(var9, field525[var3], 4, 0);
						var1.method100(var9 - 1, field525[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field365 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method100(var10, "To " + var5 + ": " + field525[var3], 4, 0);
						var1.method100(var10 - 1, "To " + var5 + ": " + field525[var3], 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method254() {
		if (field139 == null) {
			field1209 = null;
			field271 = null;
			field269 = null;
			field268 = null;
			field270 = null;
			field189 = null;
			field190 = null;
			field191 = null;
			field142 = new ZTWZAULT(method271(), 128, 265);
			CCFLBOBS.method141();
			field143 = new ZTWZAULT(method271(), 128, 265);
			CCFLBOBS.method141();
			field139 = new ZTWZAULT(method271(), 509, 171);
			CCFLBOBS.method141();
			field140 = new ZTWZAULT(method271(), 360, 132);
			CCFLBOBS.method141();
			field141 = new ZTWZAULT(method271(), 360, 200);
			CCFLBOBS.method141();
			field144 = new ZTWZAULT(method271(), 202, 238);
			CCFLBOBS.method141();
			field145 = new ZTWZAULT(method271(), 203, 238);
			CCFLBOBS.method141();
			field146 = new ZTWZAULT(method271(), 74, 94);
			CCFLBOBS.method141();
			field147 = new ZTWZAULT(method271(), 75, 94);
			CCFLBOBS.method141();

			if (field437 != null) {
				method232();
				method195();
			}

			field490 = true;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method255() {
		if (field260 >= 2 || field429 != 0 || field127 != 0) {
			String var1;
			if (field429 == 1 && field260 < 2) {
				var1 = "Use " + field433 + " with...";
			} else if (field127 == 1 && field260 < 2) {
				var1 = field130 + "...";
			} else {
				var1 = field344[field260 - 1];
			}

			if (field260 > 2) {
				var1 = var1 + "@whi@ / " + (field260 - 2) + " more options";
			}

			field243.method105(field459 / 1000, 15, 0xFFFFFF, 4, true, var1);
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method256() {
		try {
			int var1 = field512.field756 + field136;
			int var2 = field512.field757 + field192;
			if (field298 - var1 < -500 || field298 - var1 > 500 || field299 - var2 < -500 || field299 - var2 > 500) {
				field298 = var1;
				field299 = var2;
			}

			if (field298 != var1) {
				field298 += (var1 - field298) / 16;
			}

			if (field299 != var2) {
				field299 += (var2 - field299) / 16;
			}

			if (field1226[1] == 1) {
				field374 += (-field374 - 24) / 2;
			} else if (field1226[2] == 1) {
				field374 += (24 - field374) / 2;
			} else {
				field374 /= 2;
			}

			if (field1226[3] == 1) {
				field375 += (12 - field375) / 2;
			} else if (field1226[4] == 1) {
				field375 += (-field375 - 12) / 2;
			} else {
				field375 /= 2;
			}

			field373 = field374 / 2 + field373 & 0x7FF;
			field372 += field375 / 2;
			if (field372 < 128) {
				field372 = 128;
			}

			if (field372 > 383) {
				field372 = 383;
			}

			int var3 = field298 >> 7;
			int var4 = field299 >> 7;
			int var5 = method190(field299, field199, field298);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field199;
						if (var9 < 3 && (field406[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field156[var9][var7][var8];
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

			if (var11 > field439) {
				field439 += (var11 - field439) / 24;
			} else if (var11 < field439) {
				field439 += (var11 - field439) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field512.field756 + "," + field512.field757 + "," + field298 + "," + field299 + "," + field148 + "," + field149 + "," + field291 + "," + field292);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.b(ILBFQIDHPO;Z)V")
	public final void method257(int arg0, BFQIDHPO arg1) {
		arg1.method64();
		int var3 = arg1.method65(1);
		if (var3 != 0) {
			int var4 = arg1.method65(2);
			if (var4 == 0) {
				field279[field278++] = field274;
			} else if (var4 == 1) {
				int var5 = arg1.method65(3);
				field512.method317(var5, false);
				int var6 = arg1.method65(1);
				if (var6 == 1) {
					field279[field278++] = field274;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method65(3);
				field512.method317(var7, true);
				int var8 = arg1.method65(3);
				field512.method317(var8, true);
				int var9 = arg1.method65(1);
				if (var9 == 1) {
					field279[field278++] = field274;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method65(7);
				field199 = arg1.method65(2);
				int var11 = arg1.method65(1);
				int var12 = arg1.method65(7);
				int var13 = arg1.method65(1);
				if (var13 == 1) {
					field279[field278++] = field274;
				}

				field512.method316(var10, var11 == 1, var12);
			}
		}
	}

	@ObfuscatedName("client.a(LHCCLTVPO;II)V")
	public final void method258(HCCLTVPO arg0, int arg1) {
		method259(arg1, arg0.field756, arg0.field757);
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method259(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
			int var4 = method190(arg2, field199, arg1) - arg0;
			arg1 -= field452;
			var4 -= field453;
			arg2 -= field454;
			int var5 = XBVYIDUH.field1415[field455];
			int var6 = XBVYIDUH.field1416[field455];
			int var7 = XBVYIDUH.field1415[field456];
			int var8 = XBVYIDUH.field1416[field456];
			int var9 = arg1 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field470 = (var9 << 9) / arg2 + PKGGFQZB.field1022;
				field471 = (var11 << 9) / arg2 + PKGGFQZB.field1023;
			} else {
				field470 = -1;
				field471 = -1;
			}
		} else {
			field470 = -1;
			field471 = -1;
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method260() {
		field382.method43(51);

		if (field519 != -1) {
			method205(field519);
			field519 = -1;
			field399 = true;
			field218 = false;
			field336 = true;
		}

		if (field369 != -1) {
			method205(field369);
			field369 = -1;
			field157 = true;
			field218 = false;
		}

		if (field272 != -1) {
			method205(field272);
			field272 = -1;
			field490 = true;
		}

		if (field349 != -1) {
			method205(field349);
			field349 = -1;
		}

		if (field383 != -1) {
			method205(field383);
			field383 = -1;
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method261() {
		field490 = true;
	}

	@ObfuscatedName("client.J(I)V")
	public final void method262() {
		for (int var1 = 0; var1 < field403; var1++) {
			int var2 = field404[var1];
			BFCMZACY var3 = field402[var2];
			if (var3 != null) {
				method263(var3.field8.field1153, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILHCCLTVPO;)V")
	public final void method263(int arg0, HCCLTVPO arg1) {
		if (arg1.field756 < 128 || arg1.field757 < 128 || arg1.field756 >= 13184 || arg1.field757 >= 13184) {
			arg1.field741 = -1;
			arg1.field760 = -1;
			arg1.field771 = 0;
			arg1.field772 = 0;
			arg1.field756 = arg1.field776[0] * 128 + arg1.field746 * 64;
			arg1.field757 = arg1.field777[0] * 128 + arg1.field746 * 64;
			arg1.method315();
		}

		if (field512 == arg1 && (arg1.field756 < 1536 || arg1.field757 < 1536 || arg1.field756 >= 11776 || arg1.field757 >= 11776)) {
			arg1.field741 = -1;
			arg1.field760 = -1;
			arg1.field771 = 0;
			arg1.field772 = 0;
			arg1.field756 = arg1.field776[0] * 128 + arg1.field746 * 64;
			arg1.field757 = arg1.field777[0] * 128 + arg1.field746 * 64;
			arg1.method315();
		}

		if (arg1.field771 > field459) {
			method264(arg1);
		} else if (arg1.field772 >= field459) {
			method265(arg1);
		} else {
			method266(arg1);
		}

		method267(arg1);
		method268(arg1);
	}

	@ObfuscatedName("client.a(ILHCCLTVPO;)V")
	public final void method264(HCCLTVPO arg0) {
		int var2 = arg0.field771 - field459;
		int var3 = arg0.field767 * 128 + arg0.field746 * 64;
		int var4 = arg0.field769 * 128 + arg0.field746 * 64;
		arg0.field756 += (var3 - arg0.field756) / var2;
		arg0.field757 += (var4 - arg0.field757) / var2;
		arg0.field765 = 0;

		if (arg0.field773 == 0) {
			arg0.field774 = 1024;
		}

		if (arg0.field773 == 1) {
			arg0.field774 = 1536;
		}

		if (arg0.field773 == 2) {
			arg0.field774 = 0;
		}

		if (arg0.field773 == 3) {
			arg0.field774 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLHCCLTVPO;)V")
	public final void method265(HCCLTVPO arg0) {
		if (field459 == arg0.field772 || arg0.field741 == -1 || arg0.field744 != 0 || arg0.field743 + 1 > SPUHKLMC.field1176[arg0.field741].method507(arg0.field742)) {
			int var2 = arg0.field772 - arg0.field771;
			int var3 = field459 - arg0.field771;
			int var4 = arg0.field767 * 128 + arg0.field746 * 64;
			int var5 = arg0.field769 * 128 + arg0.field746 * 64;
			int var6 = arg0.field768 * 128 + arg0.field746 * 64;
			int var7 = arg0.field770 * 128 + arg0.field746 * 64;
			arg0.field756 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field757 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field765 = 0;

		if (arg0.field773 == 0) {
			arg0.field774 = 1024;
		}

		if (arg0.field773 == 1) {
			arg0.field774 = 1536;
		}

		if (arg0.field773 == 2) {
			arg0.field774 = 0;
		}

		if (arg0.field773 == 3) {
			arg0.field774 = 512;
		}

		arg0.field758 = arg0.field774;
	}

	@ObfuscatedName("client.b(ZLHCCLTVPO;)V")
	public final void method266(HCCLTVPO arg0) {
		arg0.field752 = arg0.field734;
		if (arg0.field775 == 0) {
			arg0.field765 = 0;
		} else {
			if (arg0.field741 != -1 && arg0.field744 == 0) {
				SPUHKLMC var2 = SPUHKLMC.field1176[arg0.field741];
				if (arg0.field740 > 0 && var2.field1188 == 0) {
					arg0.field765++;
					return;
				}

				if (arg0.field740 <= 0 && var2.field1189 == 0) {
					arg0.field765++;
					return;
				}
			}

			int var3 = arg0.field756;
			int var4 = arg0.field757;
			int var5 = arg0.field776[arg0.field775 - 1] * 128 + arg0.field746 * 64;
			int var6 = arg0.field777[arg0.field775 - 1] * 128 + arg0.field746 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field774 = 1280;
					} else if (var4 > var6) {
						arg0.field774 = 1792;
					} else {
						arg0.field774 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field774 = 768;
					} else if (var4 > var6) {
						arg0.field774 = 256;
					} else {
						arg0.field774 = 512;
					}
				} else if (var4 < var6) {
					arg0.field774 = 1024;
				} else {
					arg0.field774 = 0;
				}

				int var7 = arg0.field774 - arg0.field758 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field737;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field736;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field739;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field738;
				}

				if (var8 == -1) {
					var8 = arg0.field736;
				}

				arg0.field752 = var8;
				int var9 = 4;
				if (arg0.field774 != arg0.field758 && arg0.field747 == -1 && arg0.field766 != 0) {
					var9 = 2;
				}

				if (arg0.field775 > 2) {
					var9 = 6;
				}

				if (arg0.field775 > 3) {
					var9 = 8;
				}

				if (arg0.field765 > 0 && arg0.field775 > 1) {
					var9 = 8;
					arg0.field765--;
				}

				if (arg0.field783[arg0.field775 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field752 == arg0.field736 && arg0.field778 != -1) {
					arg0.field752 = arg0.field778;
				}

				if (var3 < var5) {
					arg0.field756 += var9;
					if (arg0.field756 > var5) {
						arg0.field756 = var5;
					}
				} else if (var3 > var5) {
					arg0.field756 -= var9;
					if (arg0.field756 < var5) {
						arg0.field756 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field757 += var9;
					if (arg0.field757 > var6) {
						arg0.field757 = var6;
					}
				} else if (var4 > var6) {
					arg0.field757 -= var9;
					if (arg0.field757 < var6) {
						arg0.field757 = var6;
					}
				}

				if (arg0.field756 == var5 && arg0.field757 == var6) {
					arg0.field775--;

					if (arg0.field740 > 0) {
						arg0.field740--;
						return;
					}
				}
			} else {
				arg0.field756 = var5;
				arg0.field757 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LHCCLTVPO;Z)V")
	public final void method267(HCCLTVPO arg0) {
		if (arg0.field766 != 0) {
			if (arg0.field747 != -1 && arg0.field747 < 32768) {
				BFCMZACY var2 = field402[arg0.field747];
				if (var2 != null) {
					int var3 = arg0.field756 - var2.field756;
					int var4 = arg0.field757 - var2.field757;
					if (var3 != 0 || var4 != 0) {
						arg0.field774 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field747 >= 32768) {
				int var5 = arg0.field747 - 32768;
				if (field121 == var5) {
					var5 = field274;
				}

				IOPHRJNF var6 = field275[var5];
				if (var6 != null) {
					int var7 = arg0.field756 - var6.field756;
					int var8 = arg0.field757 - var6.field757;
					if (var7 != 0 || var8 != 0) {
						arg0.field774 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field784 != 0 || arg0.field785 != 0) && (arg0.field775 == 0 || arg0.field765 > 0)) {
				int var9 = arg0.field756 - (arg0.field784 - field291 - field291) * 64;
				int var10 = arg0.field757 - (arg0.field785 - field292 - field292) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field774 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field784 = 0;
				arg0.field785 = 0;
			}

			int var11 = arg0.field774 - arg0.field758 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field766 || var11 > 2048 - arg0.field766) {
					arg0.field758 = arg0.field774;
				} else if (var11 > 1024) {
					arg0.field758 -= arg0.field766;
				} else {
					arg0.field758 += arg0.field766;
				}

				arg0.field758 &= 0x7FF;
				if (arg0.field752 == arg0.field734 && arg0.field774 != arg0.field758) {
					if (arg0.field735 != -1) {
						arg0.field752 = arg0.field735;
						return;
					}

					arg0.field752 = arg0.field736;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LHCCLTVPO;I)V")
	public final void method268(HCCLTVPO arg0) {
		arg0.field787 = false;

		if (arg0.field752 != -1) {
			SPUHKLMC var2 = SPUHKLMC.field1176[arg0.field752];
			arg0.field754++;
			if (arg0.field753 < var2.field1177 && arg0.field754 > var2.method507(arg0.field753)) {
				arg0.field754 = 0;
				arg0.field753++;
			}

			if (arg0.field753 >= var2.field1177) {
				arg0.field754 = 0;
				arg0.field753 = 0;
			}
		}

		if (arg0.field760 != -1 && field459 >= arg0.field763) {
			if (arg0.field761 < 0) {
				arg0.field761 = 0;
			}

			SPUHKLMC var3 = CRSWMDQF.field543[arg0.field760].field547;
			arg0.field762++;
			while (arg0.field761 < var3.field1177 && arg0.field762 > var3.method507(arg0.field761)) {
				arg0.field762 -= var3.method507(arg0.field761);
				arg0.field761++;
			}

			if (arg0.field761 >= var3.field1177 && (arg0.field761 < 0 || arg0.field761 >= var3.field1177)) {
				arg0.field760 = -1;
			}
		}

		if (arg0.field741 != -1 && arg0.field744 <= 1) {
			SPUHKLMC var4 = SPUHKLMC.field1176[arg0.field741];
			if (var4.field1188 == 1 && arg0.field740 > 0 && arg0.field771 <= field459 && arg0.field772 < field459) {
				arg0.field744 = 1;
				return;
			}
		}

		if (arg0.field741 != -1 && arg0.field744 == 0) {
			SPUHKLMC var5 = SPUHKLMC.field1176[arg0.field741];
			arg0.field743++;
			while (arg0.field742 < var5.field1177 && arg0.field743 > var5.method507(arg0.field742)) {
				arg0.field743 -= var5.method507(arg0.field742);
				arg0.field742++;
			}

			if (arg0.field742 >= var5.field1177) {
				arg0.field742 -= var5.field1181;
				arg0.field745++;
				if (arg0.field745 >= var5.field1187) {
					arg0.field741 = -1;
				}

				if (arg0.field742 < 0 || arg0.field742 >= var5.field1177) {
					arg0.field741 = -1;
				}
			}

			arg0.field787 = var5.field1183;
		}

		if (arg0.field744 > 0) {
			arg0.field744--;
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method269() {
		if (field272 == -1 || field185 != 2 && field1209 == null) {
			if (field490) {
				method236();
				field490 = false;
				field408.method593(field1208, 0, 4);
				field409.method593(field1208, 0, 357);
				field410.method593(field1208, 722, 4);
				field411.method593(field1208, 743, 205);
				field412.method593(field1208, 0, 0);
				field413.method593(field1208, 516, 4);
				field414.method593(field1208, 516, 205);
				field415.method593(field1208, 496, 357);
				field416.method593(field1208, 0, 338);
				field399 = true;
				field157 = true;
				field336 = true;
				field428 = true;

				if (field185 != 2) {
					field270.method593(field1208, 4, 4);
					field269.method593(field1208, 550, 4);
				}
			}

			if (field185 == 2) {
				method296();
			}

			if (field229 && field247 == 1) {
				field399 = true;
			}

			if (field519 != -1) {
				boolean var3 = method287(field519, field517);
				if (var3) {
					field399 = true;
				}
			}

			if (field424 == 2) {
				field399 = true;
			}

			if (field307 == 2) {
				field399 = true;
			}

			if (field399) {
				method211();
				field399 = false;
			}

			if (field369 == -1 && field530 == 0) {
				field227.field692 = field385 - field468 - 77;

				if (field1216 > 448 && field1216 < 560 && field1217 > 332) {
					method207(463, field385, 77, -1, field1217 - 357, field227, 0, field1216 - 17);
				}

				int var4 = field385 - field227.field692 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field385 - 77) {
					var4 = field385 - 77;
				}

				if (field468 != var4) {
					field468 = var4;
					field157 = true;
				}
			}

			if (field369 == -1 && field530 == 3) {
				int var5 = field253 * 14 + 7;
				field227.field692 = field256;

				if (field1216 > 448 && field1216 < 560 && field1217 > 332) {
					method207(463, var5, 77, -1, field1217 - 357, field227, 0, field1216 - 17);
				}

				int var6 = field227.field692;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field256 != var6) {
					field256 = var6;
					field157 = true;
				}
			}

			if (field369 != -1) {
				boolean var7 = method287(field369, field517);
				if (var7) {
					field157 = true;
				}
			}

			if (field424 == 3) {
				field157 = true;
			}

			if (field307 == 3) {
				field157 = true;
			}

			if (field514 != null) {
				field157 = true;
			}

			if (field229 && field247 == 2) {
				field157 = true;
			}

			if (field157) {
				method172();
				field157 = false;
			}

			if (field185 == 2) {
				method220();
				field269.method593(field1208, 550, 4);
			}

			if (field506 != -1) {
				field336 = true;
			}

			if (field336) {
				if (field506 != -1 && field506 == field342) {
					field506 = -1;
					field382.method43(76);
					field382.method44(field342);
				}

				field336 = false;
				field191.method592();
				field503.method446(0, 0);

				if (field519 == -1) {
					if (field376[field342] != -1) {
						if (field342 == 0) {
							field170.method446(10, 22);
						}

						if (field342 == 1) {
							field171.method446(8, 54);
						}

						if (field342 == 2) {
							field171.method446(8, 82);
						}

						if (field342 == 3) {
							field172.method446(8, 110);
						}

						if (field342 == 4) {
							field174.method446(8, 153);
						}

						if (field342 == 5) {
							field174.method446(8, 181);
						}

						if (field342 == 6) {
							field173.method446(9, 209);
						}
					}

					if (field376[0] != -1 && (field506 != 0 || field459 % 20 < 10)) {
						field425[0].method446(13, 29);
					}

					if (field376[1] != -1 && (field506 != 1 || field459 % 20 < 10)) {
						field425[1].method446(11, 53);
					}

					if (field376[2] != -1 && (field506 != 2 || field459 % 20 < 10)) {
						field425[2].method446(11, 82);
					}

					if (field376[3] != -1 && (field506 != 3 || field459 % 20 < 10)) {
						field425[3].method446(12, 115);
					}

					if (field376[4] != -1 && (field506 != 4 || field459 % 20 < 10)) {
						field425[4].method446(13, 153);
					}

					if (field376[5] != -1 && (field506 != 5 || field459 % 20 < 10)) {
						field425[5].method446(11, 180);
					}

					if (field376[6] != -1 && (field506 != 6 || field459 % 20 < 10)) {
						field425[6].method446(13, 208);
					}
				}

				field191.method593(field1208, 516, 160);
				field190.method592();
				field502.method446(0, 0);

				if (field519 == -1) {
					if (field376[field342] != -1) {
						if (field342 == 7) {
							field462.method446(0, 42);
						}

						if (field342 == 8) {
							field463.method446(0, 74);
						}

						if (field342 == 9) {
							field463.method446(0, 102);
						}

						if (field342 == 10) {
							field464.method446(1, 130);
						}

						if (field342 == 11) {
							field466.method446(0, 173);
						}

						if (field342 == 12) {
							field466.method446(0, 201);
						}

						if (field342 == 13) {
							field465.method446(0, 229);
						}
					}

					if (field376[8] != -1 && (field506 != 8 || field459 % 20 < 10)) {
						field425[7].method446(2, 74);
					}

					if (field376[9] != -1 && (field506 != 9 || field459 % 20 < 10)) {
						field425[8].method446(3, 102);
					}

					if (field376[10] != -1 && (field506 != 10 || field459 % 20 < 10)) {
						field425[9].method446(4, 137);
					}

					if (field376[11] != -1 && (field506 != 11 || field459 % 20 < 10)) {
						field425[10].method446(2, 174);
					}

					if (field376[12] != -1 && (field506 != 12 || field459 % 20 < 10)) {
						field425[11].method446(2, 201);
					}

					if (field376[13] != -1 && (field506 != 13 || field459 % 20 < 10)) {
						field425[12].method446(2, 226);
					}
				}

				field190.method593(field1208, 496, 466);
				field270.method592();
				PKGGFQZB.field1028 = field388;
			}

			if (field428) {
				field428 = false;
				field189.method592();
				field501.method446(0, 0);
				field242.method97(true, "Public chat", 0xFFFFFF, 28, 55);

				if (field504 == 0) {
					field242.method97(true, "On", 0xFF00, 41, 55);
				}

				if (field504 == 1) {
					field242.method97(true, "Friends", 0xFFFF00, 41, 55);
				}

				if (field504 == 2) {
					field242.method97(true, "Off", 0xFF0000, 41, 55);
				}

				if (field504 == 3) {
					field242.method97(true, "Hide", 0xFFFF, 41, 55);
				}

				field242.method97(true, "Private chat", 0xFFFFFF, 28, 184);

				if (field365 == 0) {
					field242.method97(true, "On", 0xFF00, 41, 184);
				}

				if (field365 == 1) {
					field242.method97(true, "Friends", 0xFFFF00, 41, 184);
				}

				if (field365 == 2) {
					field242.method97(true, "Off", 0xFF0000, 41, 184);
				}

				field242.method97(true, "Trade/compete", 0xFFFFFF, 28, 324);

				if (field494 == 0) {
					field242.method97(true, "On", 0xFF00, 41, 324);
				}

				if (field494 == 1) {
					field242.method97(true, "Friends", 0xFFFF00, 41, 324);
				}

				if (field494 == 2) {
					field242.method97(true, "Off", 0xFF0000, 41, 324);
				}

				field242.method97(true, "Report abuse", 0xFFFFFF, 33, 458);
				field189.method593(field1208, 0, 453);
				field270.method592();
				PKGGFQZB.field1028 = field388;
			}

			field517 = 0;
		} else {
			if (field185 == 2) {
				method287(field272, field517);

				if (field349 != -1) {
					method287(field349, field517);
				}

				field517 = 0;
				method165();
				field1209.method592();
				PKGGFQZB.field1028 = field389;
				CCFLBOBS.method141();
				field490 = true;
				FMDWWBSX var1 = FMDWWBSX.method306(field272);
				if (var1.field655 == 512 && var1.field650 == 334 && var1.field691 == 0) {
					var1.field655 = 765;
					var1.field650 = 503;
				}

				method208(0, 0, 0, var1);

				if (field349 != -1) {
					FMDWWBSX var2 = FMDWWBSX.method306(field349);
					if (var2.field655 == 512 && var2.field650 == 334 && var2.field691 == 0) {
						var2.field655 = 765;
						var2.field650 = 503;
					}

					method208(0, 0, 0, var2);
				}

				if (field229) {
					method184();
				} else {
					method240();
					method255();
				}
			}

			field1209.method593(field1208, 0, 0);
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 367);

			if (arg0.length == 5) {
				field285 = Integer.parseInt(arg0[0]);
				field286 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method185();
				} else if (arg0[2].equals("highmem")) {
					method166();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field287 = false;
				} else if (arg0[3].equals("members")) {
					field287 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method514(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.L(I)V")
	public void method270() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field417);

		if (field474 != null) {
			System.out.println("Od-cycle:" + field474.field78);
		}

		System.out.println("loop-cycle:" + field459);
		System.out.println("draw-cycle:" + field217);
		System.out.println("ptype:" + field164);
		System.out.println("psize:" + field163);

		if (field177 != null) {
			field177.method591();
		}

		field1205 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method271() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1211 != null) {
			return field1211;
		}

		return this;
	}

	@ObfuscatedName("client.a(ZILBFQIDHPO;)V")
	public final void method272(int arg0, BFQIDHPO arg1) {
		if (arg0 == 106) {
			int var3 = arg1.method83();
			int var4 = arg1.method73();
			int var5 = (var4 >> 4 & 0x7) + field442;
			int var6 = (var4 & 0x7) + field443;
			int var7 = arg1.method74();
			int var8 = var7 >> 2;
			int var9 = var7 & 0x3;
			int var10 = field343[var8];
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				method168(var9, var6, var10, 0, var3, -1, var5, field199, var8);
			}
		} else {
			if (arg0 == 26) {
				int var11 = arg1.method54();
				int var12 = (var11 >> 4 & 0x7) + field442;
				int var13 = (var11 & 0x7) + field443;
				int var14 = arg1.method56();
				int var15 = arg1.method54();
				int var16 = var15 >> 4 & 0xF;
				int var17 = var15 & 0x7;
				if (field512.field776[0] >= var12 - var16 && field512.field776[0] <= var12 + var16 && field512.field777[0] >= var13 - var16 && field512.field777[0] <= var13 + var16 && field355 && !field288 && field175 < 50) {
					field310[field175] = var14;
					field537[field175] = var17;
					field133[field175] = LOEGFAGM.field906[var14];
					field175++;
				}
			}

			if (arg0 == 27) {
				int var18 = arg1.method75();
				int var19 = var18 >> 2;
				int var20 = var18 & 0x3;
				int var21 = field343[var19];
				byte var22 = arg1.method76();
				byte var23 = arg1.method77();
				int var24 = arg1.method56();
				byte var25 = arg1.method76();
				byte var26 = arg1.method55();
				int var27 = arg1.method74();
				int var28 = (var27 >> 4 & 0x7) + field442;
				int var29 = (var27 & 0x7) + field443;
				int var30 = arg1.method83();
				int var31 = arg1.method56();
				int var32 = arg1.method56();
				IOPHRJNF var33;
				if (field121 == var31) {
					var33 = field512;
				} else {
					var33 = field275[var31];
				}

				if (var33 != null) {
					YCVHWRKK var34 = YCVHWRKK.method575(var32);
					int var35 = field156[field199][var28][var29];
					int var36 = field156[field199][var28 + 1][var29];
					int var37 = field156[field199][var28 + 1][var29 + 1];
					int var38 = field156[field199][var28][var29 + 1];
					XBVYIDUH var39 = var34.method580(var19, var20, var35, var36, var37, var38, -1);
					if (var39 != null) {
						method168(0, var29, var21, var24 + 1, -1, var30 + 1, var28, field199, 0);
						var33.field816 = field459 + var24;
						var33.field817 = field459 + var30;
						var33.field804 = var39;
						int var40 = var34.field1462;
						int var41 = var34.field1470;
						if (var20 == 1 || var20 == 3) {
							var40 = var34.field1470;
							var41 = var34.field1462;
						}

						var33.field801 = var28 * 128 + var40 * 64;
						var33.field803 = var29 * 128 + var41 * 64;
						var33.field802 = method190(var33.field803, field199, var33.field801);

						if (var26 > var25) {
							byte var42 = var26;
							var26 = var25;
							var25 = var42;
						}

						if (var22 > var23) {
							byte var43 = var22;
							var22 = var23;
							var23 = var43;
						}

						var33.field810 = var26 + var28;
						var33.field812 = var25 + var28;
						var33.field811 = var22 + var29;
						var33.field813 = var23 + var29;
					}
				}
			}

			if (arg0 == 11) {
				int var44 = arg1.method73();
				int var45 = var44 >> 2;
				int var46 = var44 & 0x3;
				int var47 = field343[var45];
				int var48 = arg1.method75();
				int var49 = (var48 >> 4 & 0x7) + field442;
				int var50 = (var48 & 0x7) + field443;
				if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
					method168(var46, var50, var47, 0, -1, -1, var49, field199, var45);
				}
			} else if (arg0 == 204) {
				int var51 = arg1.method54();
				int var52 = (var51 >> 4 & 0x7) + field442;
				int var53 = (var51 & 0x7) + field443;
				int var54 = arg1.method56();
				int var55 = arg1.method54();
				int var56 = arg1.method56();
				if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
					var52 = var52 * 128 + 64;
					var53 = var53 * 128 + 64;
					ITKUXCXG var57 = new ITKUXCXG(var56, field199, var53, field459, method190(var53, field199, var52) - var55, var52, var54);
					field153.method595(var57);
				}
			} else if (arg0 == 215) {
				int var58 = arg1.method54();
				int var59 = (var58 >> 4 & 0x7) + field442;
				int var60 = (var58 & 0x7) + field443;
				int var61 = arg1.method56();
				int var62 = arg1.method56();
				int var63 = arg1.method56();
				if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
					ZXKMWHPZ var64 = field441[field199][var59][var60];
					if (var64 != null) {
						for (FGBEUODV var65 = (FGBEUODV) var64.method598(); var65 != null; var65 = (FGBEUODV) var64.method600()) {
							if ((var61 & 0x7FFF) == var65.field618 && var65.field619 == var62) {
								var65.field619 = var63;
								break;
							}
						}

						method213(var59, var60);
					}
				}
			} else if (arg0 == 192) {
				int var66 = arg1.method83();
				int var67 = arg1.method73();
				int var68 = (var67 >> 4 & 0x7) + field442;
				int var69 = (var67 & 0x7) + field443;
				int var70 = arg1.method82();
				int var71 = arg1.method82();
				if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && field121 != var71) {
					FGBEUODV var72 = new FGBEUODV();
					var72.field618 = var70;
					var72.field619 = var66;

					if (field441[field199][var68][var69] == null) {
						field441[field199][var68][var69] = new ZXKMWHPZ();
					}

					field441[field199][var68][var69].method595(var72);
					method213(var68, var69);
				}
			} else if (arg0 == 33) {
				int var73 = arg1.method82();
				int var74 = arg1.method54();
				int var75 = (var74 >> 4 & 0x7) + field442;
				int var76 = (var74 & 0x7) + field443;
				int var77 = arg1.method82();
				if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
					FGBEUODV var78 = new FGBEUODV();
					var78.field618 = var73;
					var78.field619 = var77;

					if (field441[field199][var75][var76] == null) {
						field441[field199][var75][var76] = new ZXKMWHPZ();
					}

					field441[field199][var75][var76].method595(var78);
					method213(var75, var76);
				}
			} else if (arg0 == 12) {
				int var79 = arg1.method54();
				int var80 = (var79 >> 4 & 0x7) + field442;
				int var81 = (var79 & 0x7) + field443;
				int var82 = var80 + arg1.method55();
				int var83 = var81 + arg1.method55();
				int var84 = arg1.method57();
				int var85 = arg1.method56();
				int var86 = arg1.method54() * 4;
				int var87 = arg1.method54() * 4;
				int var88 = arg1.method56();
				int var89 = arg1.method56();
				int var90 = arg1.method54();
				int var91 = arg1.method54();
				if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var85 != 0xFFFF) {
					var80 = var80 * 128 + 64;
					var81 = var81 * 128 + 64;
					var82 = var82 * 128 + 64;
					var83 = var83 * 128 + 64;
					LDXKRJQR var92 = new LDXKRJQR(field199, field459 + var89, var91, var84, var87, var90, method190(var81, field199, var80) - var86, var81, var85, var80, field459 + var88);
					var92.method337(field459 + var88, var82, var83, method190(var83, field199, var82) - var87);
					field204.method595(var92);
				}
			} else if (arg0 == 62) {
				int var93 = arg1.method82();
				int var94 = arg1.method73();
				int var95 = (var94 >> 4 & 0x7) + field442;
				int var96 = (var94 & 0x7) + field443;
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					ZXKMWHPZ var97 = field441[field199][var95][var96];
					if (var97 != null) {
						for (FGBEUODV var98 = (FGBEUODV) var97.method598(); var98 != null; var98 = (FGBEUODV) var97.method600()) {
							if ((var93 & 0x7FFF) == var98.field618) {
								var98.method329();
								break;
							}
						}

						if (var97.method598() == null) {
							field441[field199][var95][var96] = null;
						}

						method213(var95, var96);
					}
				}
			} else if (arg0 == 76) {
				int var99 = arg1.method81();
				int var100 = arg1.method75();
				int var101 = (var100 >> 4 & 0x7) + field442;
				int var102 = (var100 & 0x7) + field443;
				int var103 = arg1.method73();
				int var104 = var103 >> 2;
				int var105 = var103 & 0x3;
				int var106 = field343[var104];
				if (var101 >= 0 && var102 >= 0 && var101 < 103 && var102 < 103) {
					int var107 = field156[field199][var101][var102];
					int var108 = field156[field199][var101 + 1][var102];
					int var109 = field156[field199][var101 + 1][var102 + 1];
					int var110 = field156[field199][var101][var102 + 1];
					if (var106 == 0) {
						ITBQWJFL var111 = field225.method395(field199, var101, var102);
						if (var111 != null) {
							int var112 = var111.field829 >> 14 & 0x7FFF;
							if (var104 == 2) {
								var111.field827 = new VXTLNFMD(var110, var112, false, var107, var105 + 4, var108, var109, 2, var99);
								var111.field828 = new VXTLNFMD(var110, var112, false, var107, var105 + 1 & 0x3, var108, var109, 2, var99);
							} else {
								var111.field827 = new VXTLNFMD(var110, var112, false, var107, var105, var108, var109, var104, var99);
							}
						}
					}

					if (var106 == 1) {
						FTCIRGQQ var113 = field225.method396(var101, field199, var102);
						if (var113 != null) {
							var113.field698 = new VXTLNFMD(var110, var113.field699 >> 14 & 0x7FFF, false, var107, 0, var108, var109, 4, var99);
						}
					}

					if (var106 == 2) {
						UYZWZAUN var114 = field225.method397(var101, var102, field199);

						if (var104 == 11) {
							var104 = 10;
						}

						if (var114 != null) {
							var114.field1272 = new VXTLNFMD(var110, var114.field1280 >> 14 & 0x7FFF, false, var107, var105, var108, var109, var104, var99);
						}
					}

					if (var106 == 3) {
						WLVXDGWH var115 = field225.method398(field199, var101, var102);
						if (var115 != null) {
							var115.field1338 = new VXTLNFMD(var110, var115.field1339 >> 14 & 0x7FFF, false, var107, var105, var108, var109, 22, var99);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method273(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field225.method399(arg2, arg3, arg0);
		if (var6 != 0) {
			int var7 = field225.method403(arg2, arg3, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field335.field912;
			int var12 = (103 - arg0) * 512 * 4 + arg3 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			YCVHWRKK var14 = YCVHWRKK.method575(var13);
			if (var14.field1463 == -1) {
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
				RAOZRSKX var15 = field479[var14.field1463];
				if (var15 != null) {
					int var16 = (var14.field1462 * 4 - var15.field1047) / 2;
					int var17 = (var14.field1470 * 4 - var15.field1048) / 2;
					var15.method446((104 - arg0 - var14.field1470) * 4 + var17 + 48, arg3 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field225.method401(arg2, arg3, arg0);
		if (var18 != 0) {
			int var19 = field225.method403(arg2, arg3, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			YCVHWRKK var23 = YCVHWRKK.method575(var22);
			if (var23.field1463 != -1) {
				RAOZRSKX var24 = field479[var23.field1463];
				if (var24 != null) {
					int var25 = (var23.field1462 * 4 - var24.field1047) / 2;
					int var26 = (var23.field1470 * 4 - var24.field1048) / 2;
					var24.method446((104 - arg0 - var23.field1470) * 4 + var26 + 48, arg3 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field335.field912;
				int var29 = (103 - arg0) * 512 * 4 + arg3 * 4 + 24624;
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

		int var30 = field225.method402(arg2, arg3, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			YCVHWRKK var32 = YCVHWRKK.method575(var31);
			if (var32.field1463 != -1) {
				RAOZRSKX var33 = field479[var32.field1463];
				if (var33 != null) {
					int var34 = (var32.field1462 * 4 - var33.field1047) / 2;
					int var35 = (var32.field1470 * 4 - var33.field1048) / 2;
					var33.method446((104 - arg0 - var32.field1470) * 4 + var35 + 48, arg3 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method274() {
		if (field429 == 0 && field127 == 0) {
			field344[field260] = "Walk here";
			field117[field260] = 903;
			field115[field260] = field1216;
			field116[field260] = field1217;
			field260++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < XBVYIDUH.field1413; var2++) {
			int var3 = XBVYIDUH.field1414[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field225.method403(field199, var4, var5, var3) >= 0) {
					YCVHWRKK var8 = YCVHWRKK.method575(var7);
					if (var8.field1451 != null) {
						var8 = var8.method584();
					}

					if (var8 == null) {
						continue;
					}

					if (field429 == 1) {
						field344[field260] = "Use " + field433 + " with @cya@" + var8.field1455;
						field117[field260] = 760;
						field118[field260] = var3;
						field115[field260] = var4;
						field116[field260] = var5;
						field260++;
					} else if (field127 != 1) {
						if (var8.field1466 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1466[var9] != null) {
									field344[field260] = var8.field1466[var9] + " @cya@" + var8.field1455;

									if (var9 == 0) {
										field117[field260] = 530;
									}

									if (var9 == 1) {
										field117[field260] = 479;
									}

									if (var9 == 2) {
										field117[field260] = 304;
									}

									if (var9 == 3) {
										field117[field260] = 58;
									}

									if (var9 == 4) {
										field117[field260] = 1237;
									}

									field118[field260] = var3;
									field115[field260] = var4;
									field116[field260] = var5;
									field260++;
								}
							}
						}

						field344[field260] = "Examine @cya@" + var8.field1455;
						field117[field260] = 1551;
						field118[field260] = var8.field1457 << 14;
						field115[field260] = var4;
						field116[field260] = var5;
						field260++;
					} else if ((field129 & 0x4) == 4) {
						field344[field260] = field130 + " @cya@" + var8.field1455;
						field117[field260] = 625;
						field118[field260] = var3;
						field115[field260] = var4;
						field116[field260] = var5;
						field260++;
					}
				}

				if (var6 == 1) {
					BFCMZACY var10 = field402[var7];
					if (var10.field8.field1153 == 1 && (var10.field756 & 0x7F) == 0x40 && (var10.field757 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field403; var11++) {
							BFCMZACY var12 = field402[field404[var11]];
							if (var12 != null && var10 != var12 && var12.field8.field1153 == 1 && var10.field756 == var12.field756 && var10.field757 == var12.field757) {
								method291(var12.field8, var4, var5, field404[var11]);
							}
						}

						for (int var13 = 0; var13 < field276; var13++) {
							IOPHRJNF var14 = field275[field277[var13]];
							if (var14 != null && var10.field756 == var14.field756 && var10.field757 == var14.field757) {
								method227(field277[var13], var5, var14, var4);
							}
						}
					}

					method291(var10.field8, var4, var5, var7);
				}

				if (var6 == 0) {
					IOPHRJNF var15 = field275[var7];
					if ((var15.field756 & 0x7F) == 0x40 && (var15.field757 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field403; var16++) {
							BFCMZACY var17 = field402[field404[var16]];
							if (var17 != null && var17.field8.field1153 == 1 && var15.field756 == var17.field756 && var15.field757 == var17.field757) {
								method291(var17.field8, var4, var5, field404[var16]);
							}
						}

						for (int var18 = 0; var18 < field276; var18++) {
							IOPHRJNF var19 = field275[field277[var18]];
							if (var19 != null && var15 != var19 && var15.field756 == var19.field756 && var15.field757 == var19.field757) {
								method227(field277[var18], var5, var19, var4);
							}
						}
					}

					method227(var7, var5, var15, var4);
				}

				if (var6 == 3) {
					ZXKMWHPZ var20 = field441[field199][var4][var5];
					if (var20 != null) {
						for (FGBEUODV var21 = (FGBEUODV) var20.method599(); var21 != null; var21 = (FGBEUODV) var20.method601()) {
							RBNCRAAP var22 = RBNCRAAP.method456(var21.field618);
							if (field429 == 1) {
								field344[field260] = "Use " + field433 + " with @lre@" + var22.field1078;
								field117[field260] = 212;
								field118[field260] = var21.field618;
								field115[field260] = var4;
								field116[field260] = var5;
								field260++;
							} else if (field127 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1073 != null && var22.field1073[var23] != null) {
										field344[field260] = var22.field1073[var23] + " @lre@" + var22.field1078;

										if (var23 == 0) {
											field117[field260] = 5;
										}

										if (var23 == 1) {
											field117[field260] = 270;
										}

										if (var23 == 2) {
											field117[field260] = 435;
										}

										if (var23 == 3) {
											field117[field260] = 995;
										}

										if (var23 == 4) {
											field117[field260] = 307;
										}

										field118[field260] = var21.field618;
										field115[field260] = var4;
										field116[field260] = var5;
										field260++;
									} else if (var23 == 2) {
										field344[field260] = "Take @lre@" + var22.field1078;
										field117[field260] = 435;
										field118[field260] = var21.field618;
										field115[field260] = var4;
										field116[field260] = var5;
										field260++;
									}
								}

								field344[field260] = "Examine @lre@" + var22.field1078;
								field117[field260] = 1260;
								field118[field260] = var21.field618;
								field115[field260] = var4;
								field116[field260] = var5;
								field260++;
							} else if ((field129 & 0x1) == 1) {
								field344[field260] = field130 + " @lre@" + var22.field1078;
								field117[field260] = 482;
								field118[field260] = var21.field618;
								field115[field260] = var4;
								field116[field260] = var5;
								field260++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method275(String arg0) {
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

	@ObfuscatedName("client.b(I)V")
	public final void method276() {
		if (field510 || field162 || field360) {
			method284();
		} else {
			field217++;

			if (field180) {
				method269();
			} else {
				method189(false);
			}

			field476 = 0;
		}
	}

	@ObfuscatedName("client.a(ILRAOZRSKX;)V")
	public final void method277(RAOZRSKX arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field131.length; var3++) {
			field131[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field131[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field132[var9] = (field131[var9 - 1] + field131[var9 + 1] + field131[var9 - 128] + field131[var9 + 128]) / 4;
				}
			}

			int[] var10 = field131;
			field131 = field132;
			field132 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1048; var12++) {
				for (int var13 = 0; var13 < arg0.field1047; var13++) {
					if (arg0.field1045[var11++] != 0) {
						int var14 = var13 + arg0.field1049 + 16;
						int var15 = var12 + arg0.field1050 + 16;
						int var16 = (var15 << 7) + var14;
						field131[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(IB)V")
	public final void method278(int arg0) {
		int[] var2 = field335.field912;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field406[arg0][var7][var5] & 0x18) == 0) {
					field225.method408(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field406[arg0 + 1][var7][var5] & 0x8) != 0) {
					field225.method408(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field335.method348();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field406[arg0][var11][var10] & 0x18) == 0) {
					method273(var10, var8, arg0, var11, var9);
				}

				if (arg0 < 3 && (field406[arg0 + 1][var11][var10] & 0x8) != 0) {
					method273(var10, var8, arg0 + 1, var11, var9);
				}
			}
		}

		if (field270 != null) {
			field270.method592();
			PKGGFQZB.field1028 = field388;
		}

		field337 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field225.method402(field199, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = YCVHWRKK.method575(var14).field1469;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field151[field199].field1130;
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

						field435[field337] = field518[var15];
						field338[field337] = var16;
						field339[field337] = var17;
						field337++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method279() {
		if (!field510 && !field162 && !field360) {
			field459++;

			if (field180) {
				method167();
			} else {
				method286();
			}

			method193();
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method280(int arg0) {
		signlink.wavevol = arg0;
	}

	public final void init() {
		field285 = Integer.parseInt(getParameter("nodeid"));
		field286 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method185();
		} else {
			method166();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field287 = false;
		} else {
			field287 = true;
		}

		method515(765, 503);
	}

	@ObfuscatedName("client.a(LIOPHRJNF;ZIILBFQIDHPO;)V")
	public final void method281(IOPHRJNF arg0, int arg1, int arg2, BFQIDHPO arg3) {
		if ((arg2 & 0x4) != 0) {
			arg0.field747 = arg3.method81();
			if (arg0.field747 == 0xFFFF) {
				arg0.field747 = -1;
			}
		}

		if ((arg2 & 0x80) != 0) {
			int var5 = arg3.method54();
			byte[] var6 = new byte[var5];
			BFQIDHPO var7 = new BFQIDHPO(var6);
			arg3.method63(0, var6, var5);
			field280[arg1] = var7;
			arg0.method321(var7);
		}

		if ((arg2 & 0x100) != 0) {
			arg0.field767 = arg3.method75();
			arg0.field769 = arg3.method54();
			arg0.field768 = arg3.method54();
			arg0.field770 = arg3.method75();
			arg0.field771 = arg3.method81() + field459;
			arg0.field772 = arg3.method81() + field459;
			arg0.field773 = arg3.method74();
			arg0.method315();
		}

		if ((arg2 & 0x1) != 0) {
			int var8 = arg3.method56();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			int var9 = arg3.method74();
			if (arg0.field741 == var8 && var8 != -1) {
				int var10 = SPUHKLMC.field1176[var8].field1190;
				if (var10 == 1) {
					arg0.field742 = 0;
					arg0.field743 = 0;
					arg0.field744 = var9;
					arg0.field745 = 0;
				}

				if (var10 == 2) {
					arg0.field745 = 0;
				}
			} else if (var8 == -1 || arg0.field741 == -1 || SPUHKLMC.field1176[var8].field1184 >= SPUHKLMC.field1176[arg0.field741].field1184) {
				arg0.field741 = var8;
				arg0.field742 = 0;
				arg0.field743 = 0;
				arg0.field744 = var9;
				arg0.field745 = 0;
				arg0.field740 = arg0.field775;
			}
		}

		if ((arg2 & 0x2) != 0) {
			arg0.field784 = arg3.method56();
			arg0.field785 = arg3.method82();
		}

		if ((arg2 & 0x400) != 0) {
			int var11 = arg3.method74();
			int var12 = arg3.method54();
			arg0.method318(field459, var12, var11);
			arg0.field780 = field459 + 300;
			arg0.field781 = arg3.method54();
			arg0.field782 = arg3.method73();
		}

		if ((arg2 & 0x200) != 0) {
			arg0.field760 = arg3.method82();
			int var13 = arg3.method88();
			arg0.field764 = var13 >> 16;
			arg0.field763 = (var13 & 0xFFFF) + field459;
			arg0.field761 = 0;
			arg0.field762 = 0;

			if (arg0.field763 > field459) {
				arg0.field761 = -1;
			}

			if (arg0.field760 == 0xFFFF) {
				arg0.field760 = -1;
			}
		}

		if ((arg2 & 0x8) != 0) {
			arg0.field786 = arg3.method61();
			if (arg0.field786.charAt(0) == '~') {
				arg0.field786 = arg0.field786.substring(1);
				method192(arg0.field819, arg0.field786, 2);
			} else if (field512 == arg0) {
				method192(arg0.field819, arg0.field786, 2);
			}

			arg0.field748 = 0;
			arg0.field759 = 0;
			arg0.field779 = 150;
		}

		if ((arg2 & 0x40) != 0) {
			int var14 = arg3.method56();
			int var15 = arg3.method73();
			int var16 = arg3.method73();
			int var17 = arg3.field10;

			if (arg0.field819 != null && arg0.field818) {
				long var18 = JQPXVJFJ.method323(arg0.field819);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < field396; var21++) {
						if (field196[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}

				if (!var20 && field426 == 0) {
					try {
						field401.field10 = 0;
						arg3.method63(0, field401.field9, var16);
						field401.field10 = 0;
						String var22 = OSSLGBQQ.method369(field401, var16);
						var22 = AYSHFCKR.method11(var22);
						arg0.field786 = var22;
						arg0.field748 = var14 >> 8;
						arg0.field759 = var14 & 0xFF;
						arg0.field779 = 150;

						if (var15 == 2 || var15 == 3) {
							method192("@cr2@" + arg0.field819, var22, 1);
						} else if (var15 == 1) {
							method192("@cr1@" + arg0.field819, var22, 1);
						} else {
							method192(arg0.field819, var22, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field10 = var16 + var17;
		}

		if ((arg2 & 0x10) != 0) {
			int var24 = arg3.method54();
			int var25 = arg3.method75();
			arg0.method318(field459, var25, var24);
			arg0.field780 = field459 + 300;
			arg0.field781 = arg3.method74();
			arg0.field782 = arg3.method54();
		}
	}

	public final void run() {
		if (field340) {
			method224();
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

	@ObfuscatedName("client.d(IIII)I")
	public final int method282(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.M(I)Ljava/net/Socket;")
	public final Socket method283(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.N(I)V")
	public final void method284() {
		Graphics var1 = method271().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method517(1);

		if (field162) {
			field154 = false;
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

		if (field360) {
			field154 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field510) {
			field154 = false;
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

	@ObfuscatedName("client.d(IILBFQIDHPO;)V")
	public final void method285(int arg0, BFQIDHPO arg1) {
		for (int var3 = 0; var3 < field278; var3++) {
			int var4 = field279[var3];
			BFCMZACY var5 = field402[var4];
			int var6 = arg1.method54();
			if ((var6 & 0x20) != 0) {
				var5.field786 = arg1.method61();
				var5.field779 = 100;
			}

			if ((var6 & 0x10) != 0) {
				int var7 = arg1.method73();
				int var8 = arg1.method74();
				var5.method318(field459, var8, var7);
				var5.field780 = field459 + 300;
				var5.field781 = arg1.method54();
				var5.field782 = arg1.method75();
			}

			if ((var6 & 0x1) != 0) {
				var5.field784 = arg1.method81();
				var5.field785 = arg1.method56();
			}

			if ((var6 & 0x40) != 0) {
				var5.field8 = SHKUIFHF.method501(arg1.method56());
				var5.field746 = var5.field8.field1153;
				var5.field766 = var5.field8.field1148;
				var5.field736 = var5.field8.field1163;
				var5.field737 = var5.field8.field1165;
				var5.field738 = var5.field8.field1141;
				var5.field739 = var5.field8.field1168;
				var5.field734 = var5.field8.field1172;
			}

			if ((var6 & 0x80) != 0) {
				var5.field747 = arg1.method83();
				if (var5.field747 == 0xFFFF) {
					var5.field747 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				int var9 = arg1.method75();
				int var10 = arg1.method74();
				var5.method318(field459, var10, var9);
				var5.field780 = field459 + 300;
				var5.field781 = arg1.method54();
				var5.field782 = arg1.method54();
			}

			if ((var6 & 0x8) != 0) {
				int var11 = arg1.method81();
				if (var11 == 0xFFFF) {
					var11 = -1;
				}

				int var12 = arg1.method75();
				if (var5.field741 == var11 && var11 != -1) {
					int var13 = SPUHKLMC.field1176[var11].field1190;
					if (var13 == 1) {
						var5.field742 = 0;
						var5.field743 = 0;
						var5.field744 = var12;
						var5.field745 = 0;
					}

					if (var13 == 2) {
						var5.field745 = 0;
					}
				} else if (var11 == -1 || var5.field741 == -1 || SPUHKLMC.field1176[var11].field1184 >= SPUHKLMC.field1176[var5.field741].field1184) {
					var5.field741 = var11;
					var5.field742 = 0;
					var5.field743 = 0;
					var5.field744 = var12;
					var5.field745 = 0;
					var5.field740 = var5.field775;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field760 = arg1.method81();
				int var14 = arg1.method59();
				var5.field764 = var14 >> 16;
				var5.field763 = (var14 & 0xFFFF) + field459;
				var5.field761 = 0;
				var5.field762 = 0;

				if (var5.field763 > field459) {
					var5.field761 = -1;
				}

				if (var5.field760 == 0xFFFF) {
					var5.field760 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method286() {
		if (field232 == 0) {
			int var1 = field1206 / 2 - 80;
			int var2 = field1207 / 2 + 20;
			var2 += 20;
			if (field1222 == 1 && field1223 >= var1 - 75 && field1223 <= var1 + 75 && field1224 >= var2 - 20 && field1224 <= var2 + 20) {
				field232 = 3;
				field135 = 0;
			}

			int var3 = field1206 / 2 + 80;
			if (field1222 == 1 && field1223 >= var3 - 75 && field1223 <= var3 + 75 && field1224 >= var2 - 20 && field1224 <= var2 + 20) {
				field262 = "";
				field263 = "Enter your username & password.";
				field232 = 2;
				field135 = 0;
			}
		} else if (field232 == 2) {
			int var4 = field1207 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1222 == 1 && field1224 >= var4 - 15 && field1224 < var4) {
				field135 = 0;
			}

			var4 += 15;
			if (field1222 == 1 && field1224 >= var4 - 15 && field1224 < var4) {
				field135 = 1;
			}

			var4 += 15;
			int var5 = field1206 / 2 - 80;
			int var6 = field1207 / 2 + 50;
			var6 += 20;
			if (field1222 == 1 && field1223 >= var5 - 75 && field1223 <= var5 + 75 && field1224 >= var6 - 20 && field1224 <= var6 + 20) {
				field150 = 0;
				method151(field329, field330, false);

				if (field180) {
					return;
				}
			}

			int var7 = field1206 / 2 + 80;
			if (field1222 == 1 && field1223 >= var7 - 75 && field1223 <= var7 + 75 && field1224 >= var6 - 20 && field1224 <= var6 + 20) {
				field232 = 0;
				field329 = "";
				field330 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method518();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field186.length(); var10++) {
					if (var8 == field186.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field135 == 0) {
					if (var8 == 8 && field329.length() > 0) {
						field329 = field329.substring(0, field329.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field135 = 1;
					}

					if (var9) {
						field329 = field329 + (char) var8;
					}

					if (field329.length() > 12) {
						field329 = field329.substring(0, 12);
					}
				} else if (field135 == 1) {
					if (var8 == 8 && field330.length() > 0) {
						field330 = field330.substring(0, field330.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field135 = 0;
					}

					if (var9) {
						field330 = field330 + (char) var8;
					}

					if (field330.length() > 20) {
						field330 = field330.substring(0, 20);
					}
				}
			}
		} else if (field232 == 3) {
			int var11 = field1206 / 2;
			int var12 = field1207 / 2 + 50;
			var12 += 20;
			if (field1222 == 1 && field1223 >= var11 - 75 && field1223 <= var11 + 75 && field1224 >= var12 - 20 && field1224 <= var12 + 20) {
				field232 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZI)Z")
	public final boolean method287(int arg0, int arg1) {
		boolean var3 = false;
		FMDWWBSX var4 = FMDWWBSX.method306(arg0);
		for (int var5 = 0; var5 < var4.field648.length && var4.field648[var5] != -1; var5++) {
			FMDWWBSX var6 = FMDWWBSX.method306(var4.field648[var5]);
			if (var6.field691 == 0) {
				var3 |= method287(var6.field683, arg1);
			}

			if (var6.field691 == 6 && (var6.field661 != -1 || var6.field662 != -1)) {
				boolean var7 = method194(var6);
				int var8;
				if (var7) {
					var8 = var6.field662;
				} else {
					var8 = var6.field661;
				}

				if (var8 != -1) {
					SPUHKLMC var9 = SPUHKLMC.field1176[var8];
					var6.field626 += arg1;
					while (var6.field626 > var9.method507(var6.field636)) {
						var6.field626 -= var9.method507(var6.field636) + 1;
						var6.field636++;
						if (var6.field636 >= var9.field1177) {
							var6.field636 -= var9.field1181;
							if (var6.field636 < 0 || var6.field636 >= var9.field1177) {
								var6.field636 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field691 == 6 && var6.field649 != 0) {
				int var10 = var6.field649 >> 16;
				int var11 = var6.field649 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field677 = var6.field677 + var10 & 0x7FF;
				var6.field678 = var6.field678 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method288() {
		field497 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field526[var1] = -1;
			for (int var2 = 0; var2 < OQTNTOVY.field943; var2++) {
				if (!OQTNTOVY.field944[var2].field950 && OQTNTOVY.field944[var2].field945 == var1 + (field438 ? 0 : 7)) {
					field526[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method289() {
		if (field185 == 2) {
			for (IYAQHTAH var1 = (IYAQHTAH) field152.method598(); var1 != null; var1 = (IYAQHTAH) field152.method600()) {
				if (var1.field844 > 0) {
					var1.field844--;
				}

				if (var1.field844 != 0) {
					if (var1.field840 > 0) {
						var1.field840--;
					}

					if (var1.field840 == 0 && var1.field847 >= 1 && var1.field848 >= 1 && var1.field847 <= 102 && var1.field848 <= 102 && (var1.field849 < 0 || RQCEQFSS.method469(var1.field849, var1.field851))) {
						method186(var1.field851, var1.field846, var1.field845, var1.field847, var1.field848, var1.field849, var1.field850);
						var1.field840 = -1;

						if (var1.field849 == var1.field841 && var1.field841 == -1) {
							var1.method329();
						} else if (var1.field849 == var1.field841 && var1.field850 == var1.field842 && var1.field851 == var1.field843) {
							var1.method329();
						}
					}
				} else if (var1.field841 < 0 || RQCEQFSS.method469(var1.field841, var1.field843)) {
					method186(var1.field843, var1.field846, var1.field845, var1.field847, var1.field848, var1.field841, var1.field842);
					var1.method329();
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method290(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field392; var3++) {
				if (field124[var3] == arg0) {
					field392--;
					field399 = true;

					for (int var4 = var3; var4 < field392; var4++) {
						field138[var4] = field138[var4 + 1];
						field195[var4] = field195[var4 + 1];
						field124[var4] = field124[var4 + 1];
					}

					field382.method43(19);
					field382.method50(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LSHKUIFHF;IIIZ)V")
	public final void method291(SHKUIFHF arg0, int arg1, int arg2, int arg3) {
		if (field260 < 400) {
			if (arg0.field1167 != null) {
				arg0 = arg0.method504();
			}

			if (arg0 != null && arg0.field1149) {
				String var5 = arg0.field1157;
				if (arg0.field1159 != 0) {
					var5 = var5 + method170(field512.field821, arg0.field1159) + " (level-" + arg0.field1159 + ")";
				}

				if (field429 == 1) {
					field344[field260] = "Use " + field433 + " with @yel@" + var5;
					field117[field260] = 963;
					field118[field260] = arg3;
					field115[field260] = arg1;
					field116[field260] = arg2;
					field260++;
				} else if (field127 != 1) {
					if (arg0.field1138 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field1138[var6] != null && !arg0.field1138[var6].equalsIgnoreCase("attack")) {
								field344[field260] = arg0.field1138[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field117[field260] = 977;
								}

								if (var6 == 1) {
									field117[field260] = 112;
								}

								if (var6 == 2) {
									field117[field260] = 709;
								}

								if (var6 == 3) {
									field117[field260] = 526;
								}

								if (var6 == 4) {
									field117[field260] = 741;
								}

								field118[field260] = arg3;
								field115[field260] = arg1;
								field116[field260] = arg2;
								field260++;
							}
						}
					}

					if (arg0.field1138 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field1138[var7] != null && arg0.field1138[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field1159 > field512.field821) {
									var8 = 2000;
								}

								field344[field260] = arg0.field1138[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field117[field260] = var8 + 977;
								}

								if (var7 == 1) {
									field117[field260] = var8 + 112;
								}

								if (var7 == 2) {
									field117[field260] = var8 + 709;
								}

								if (var7 == 3) {
									field117[field260] = var8 + 526;
								}

								if (var7 == 4) {
									field117[field260] = var8 + 741;
								}

								field118[field260] = arg3;
								field115[field260] = arg1;
								field116[field260] = arg2;
								field260++;
							}
						}
					}

					field344[field260] = "Examine @yel@" + var5;
					field117[field260] = 1170;
					field118[field260] = arg3;
					field115[field260] = arg1;
					field116[field260] = arg2;
					field260++;
				} else if ((field129 & 0x2) == 2) {
					field344[field260] = field130 + " @yel@" + var5;
					field117[field260] = 947;
					field118[field260] = arg3;
					field115[field260] = arg1;
					field116[field260] = arg2;
					field260++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZIII)V")
	public final void method292(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field515.method446(arg1, arg0);
		field516.method446(arg1 + arg4 - 16, arg0);
		CCFLBOBS.method143(field346, arg0, arg1 + 16, 16, arg4 - 32);
		int var6 = (arg4 - 32) * arg4 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg3 - arg4);
		CCFLBOBS.method143(field483, arg0, arg1 + var7 + 16, 16, var6);
		CCFLBOBS.method148(field290, var6, arg0, arg1 + var7 + 16);
		CCFLBOBS.method148(field290, var6, arg0 + 1, arg1 + 16 + var7);
		CCFLBOBS.method146(16, arg0, field290, arg1 + var7 + 16);
		CCFLBOBS.method146(16, arg0, field290, arg1 + var7 + 17);
		CCFLBOBS.method148(field114, var6, arg0 + 15, arg1 + 16 + var7);
		CCFLBOBS.method148(field114, var6 - 1, arg0 + 14, arg1 + var7 + 17);
		CCFLBOBS.method146(16, arg0, field114, arg1 + var7 + var6 + 15);
		CCFLBOBS.method146(15, arg0 + 1, field114, arg1 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.a(LIYAQHTAH;B)V")
	public final void method293(IYAQHTAH arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field846 == 0) {
			var2 = field225.method399(arg0.field845, arg0.field847, arg0.field848);
		}

		if (arg0.field846 == 1) {
			var2 = field225.method400(arg0.field845, arg0.field847, arg0.field848);
		}

		if (arg0.field846 == 2) {
			var2 = field225.method401(arg0.field845, arg0.field847, arg0.field848);
		}

		if (arg0.field846 == 3) {
			var2 = field225.method402(arg0.field845, arg0.field847, arg0.field848);
		}

		if (var2 != 0) {
			int var6 = field225.method403(arg0.field845, arg0.field847, arg0.field848, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field841 = var3;
		arg0.field843 = var4;
		arg0.field842 = var5;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method294() {
		if (field219 == 0 && field1222 == 1) {
			int var1 = field1223 - 25 - 550;
			int var2 = field1224 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field373 + field370 & 0x7FF;
				int var4 = PKGGFQZB.field1026[var3];
				int var5 = PKGGFQZB.field1027[var3];
				var4 = (field460 + 256) * var4 >> 8;
				var5 = (field460 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field512.field756 + var6 >> 7;
				int var9 = field512.field757 - var7 >> 7;
				boolean var10 = method217(0, 0, var9, true, 0, var8, 1, field512.field776[0], field512.field777[0], 0, 0);
				if (var10) {
					field382.method44(var1);
					field382.method44(var2);
					field382.method45(field373);
					field382.method44(57);
					field382.method44(field370);
					field382.method44(field460);
					field382.method44(89);
					field382.method45(field512.field756);
					field382.method45(field512.field757);
					field382.method44(field499);
					field382.method44(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method295() {
		int var1 = field531 * 128 + 64;
		int var2 = field532 * 128 + 64;
		int var3 = method190(var2, field199, var1) - field533;

		if (field452 < var1) {
			field452 += (var1 - field452) * field535 / 1000 + field534;
			if (field452 > var1) {
				field452 = var1;
			}
		}

		if (field452 > var1) {
			field452 -= (field452 - var1) * field535 / 1000 + field534;
			if (field452 < var1) {
				field452 = var1;
			}
		}

		if (field453 < var3) {
			field453 += (var3 - field453) * field535 / 1000 + field534;
			if (field453 > var3) {
				field453 = var3;
			}
		}

		if (field453 > var3) {
			field453 -= (field453 - var3) * field535 / 1000 + field534;
			if (field453 < var3) {
				field453 = var3;
			}
		}

		if (field454 < var2) {
			field454 += (var2 - field454) * field535 / 1000 + field534;
			if (field454 > var2) {
				field454 = var2;
			}
		}

		if (field454 > var2) {
			field454 -= (field454 - var2) * field535 / 1000 + field534;
			if (field454 < var2) {
				field454 = var2;
			}
		}

		int var4 = field350 * 128 + 64;
		int var5 = field351 * 128 + 64;
		int var6 = method190(var5, field199, var4) - field352;
		int var7 = var4 - field452;
		int var8 = var6 - field453;
		int var9 = var5 - field454;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field455 < var11) {
			field455 += (var11 - field455) * field354 / 1000 + field353;
			if (field455 > var11) {
				field455 = var11;
			}
		}

		if (field455 > var11) {
			field455 -= (field455 - var11) * field354 / 1000 + field353;
			if (field455 < var11) {
				field455 = var11;
			}
		}

		int var13 = var12 - field456;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field456 += field354 * var13 / 1000 + field353;
			field456 &= 0x7FF;
		}

		if (var13 < 0) {
			field456 -= -var13 * field354 / 1000 + field353;
			field456 &= 0x7FF;
		}

		int var14 = var12 - field456;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field456 = var12;
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method296() {
		field122++;
		method249(true);
		method198(true);
		method249(false);
		method198(false);
		method150();
		method164();

		if (!field120) {
			int var1 = field372;
			if (field439 / 256 > var1) {
				var1 = field439 / 256;
			}

			if (field295[4] && field418[4] + 128 > var1) {
				var1 = field418[4] + 128;
			}

			int var2 = field491 + field373 & 0x7FF;
			method228(var2, field299, method190(field512.field757, field199, field512.field756) - 50, field298, var1 * 3 + 600, var1);
		}

		int var3;
		if (field120) {
			var3 = method188();
		} else {
			var3 = method187();
		}

		int var4 = field452;
		int var5 = field453;
		int var6 = field454;
		int var7 = field455;
		int var8 = field456;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field295[var9]) {
				int var10 = (int) (Math.random() * (field380[var9] * 2 + 1) + Math.sin(field405[var9] / 100.0D * field377[var9]) * field418[var9] - field380[var9]);
				if (var9 == 0) {
					field452 += var10;
				}

				if (var9 == 1) {
					field453 += var10;
				}

				if (var9 == 2) {
					field454 += var10;
				}

				if (var9 == 3) {
					field456 = field456 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field455 += var10;
					if (field455 < 128) {
						field455 = 128;
					}

					if (field455 > 383) {
						field455 = 383;
					}
				}
			}
		}

		int var11 = PKGGFQZB.field1037;
		XBVYIDUH.field1410 = true;
		XBVYIDUH.field1413 = 0;
		XBVYIDUH.field1411 = field1216 - 4;
		XBVYIDUH.field1412 = field1217 - 4;
		CCFLBOBS.method141();
		field225.method412(var3, field454, field453, field455, field452, field456);
		field225.method387();
		method218();
		method214();
		method231(var11);
		method203();
		field270.method593(field1208, 4, 4);
		field452 = var4;
		field453 = var5;
		field454 = var6;
		field455 = var7;
		field456 = var8;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field226[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field536[var3] = var2 / 4;
		}
	}
}
