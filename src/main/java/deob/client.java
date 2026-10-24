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
public final class client extends AMTYETOI {

	@ObfuscatedName("client.H")
	public IBHVCUAH[] field90 = new IBHVCUAH[1000];

	@ObfuscatedName("client.M")
	public int field94 = 2;

	@ObfuscatedName("client.N")
	public int[] field95 = new int[4000];

	@ObfuscatedName("client.O")
	public int[] field96 = new int[4000];

	@ObfuscatedName("client.P")
	public boolean[] field97 = new boolean[5];

	@ObfuscatedName("client.S")
	public int field99 = 128;

	@ObfuscatedName("client.Y")
	public int field105 = 3;

	@ObfuscatedName("client.Z")
	public int field106 = -1;

	@ObfuscatedName("client.bb")
	public int[] field107 = new int[33];

	@ObfuscatedName("client.cb")
	public String[] field108 = new String[5];

	@ObfuscatedName("client.db")
	public boolean[] field109 = new boolean[5];

	@ObfuscatedName("client.hb")
	public int field113 = 50;

	@ObfuscatedName("client.ib")
	public int[] field114 = new int[field113];

	@ObfuscatedName("client.jb")
	public int[] field115 = new int[field113];

	@ObfuscatedName("client.kb")
	public int[] field116 = new int[field113];

	@ObfuscatedName("client.lb")
	public int[] field117 = new int[field113];

	@ObfuscatedName("client.mb")
	public int[] field118 = new int[field113];

	@ObfuscatedName("client.nb")
	public int[] field119 = new int[field113];

	@ObfuscatedName("client.ob")
	public int[] field120 = new int[field113];

	@ObfuscatedName("client.pb")
	public String[] field121 = new String[field113];

	@ObfuscatedName("client.Ib")
	public boolean field137 = false;

	@ObfuscatedName("client.Jb")
	public int[] field138 = new int[200];

	@ObfuscatedName("client.Yb")
	public int[] field151 = new int[9];

	@ObfuscatedName("client.Zb")
	public int[] field152 = new int[BLHISNVT.field32];

	@ObfuscatedName("client.ac")
	public String field153 = "";

	@ObfuscatedName("client.bc")
	public boolean field154 = false;

	@ObfuscatedName("client.cc")
	public int field155 = 78;

	@ObfuscatedName("client.dc")
	public volatile boolean field156 = false;

	@ObfuscatedName("client.tc")
	public int field171 = 2;

	@ObfuscatedName("client.Dc")
	public URASIGRB field181 = new URASIGRB();

	@ObfuscatedName("client.Ic")
	public int[] field186 = new int[50];

	@ObfuscatedName("client.Lc")
	public int[] field189 = new int[BLHISNVT.field32];

	@ObfuscatedName("client.id")
	public CRC32 field209 = new CRC32();

	@ObfuscatedName("client.jd")
	public String field210 = "";

	@ObfuscatedName("client.kd")
	public String field211 = "";

	@ObfuscatedName("client.md")
	public int field213 = -1;

	@ObfuscatedName("client.nd")
	public boolean field214 = true;

	@ObfuscatedName("client.rd")
	public boolean field217 = false;

	@ObfuscatedName("client.sd")
	public int[] field218 = new int[500];

	@ObfuscatedName("client.td")
	public int[] field219 = new int[500];

	@ObfuscatedName("client.ud")
	public int[] field220 = new int[500];

	@ObfuscatedName("client.vd")
	public int[] field221 = new int[500];

	@ObfuscatedName("client.Dd")
	public boolean field228 = false;

	@ObfuscatedName("client.Jd")
	public int[] field234 = new int[151];

	@ObfuscatedName("client.Kd")
	public boolean field235 = false;

	@ObfuscatedName("client.Md")
	public int field237 = -1;

	@ObfuscatedName("client.Ud")
	public boolean field244 = false;

	@ObfuscatedName("client.Wd")
	public int field245 = 0x332D25;

	@ObfuscatedName("client.Zd")
	public int[] field247 = new int[BLHISNVT.field32];

	@ObfuscatedName("client.ce")
	public boolean field250 = true;

	@ObfuscatedName("client.de")
	public int[] field251 = new int[2000];

	@ObfuscatedName("client.ee")
	public int[] field252 = new int[50];

	@ObfuscatedName("client.ge")
	public int[] field254 = new int[1000];

	@ObfuscatedName("client.he")
	public int[] field255 = new int[1000];

	@ObfuscatedName("client.ke")
	public int field258 = 1;

	@ObfuscatedName("client.me")
	public UAWAYCTK field259 = UAWAYCTK.method443(1);

	@ObfuscatedName("client.pe")
	public int[] field261 = new int[1000];

	@ObfuscatedName("client.qe")
	public int field262 = -1;

	@ObfuscatedName("client.re")
	public String field263 = "";

	@ObfuscatedName("client.se")
	public boolean field264 = false;

	@ObfuscatedName("client.te")
	public IBHVCUAH[] field265 = new IBHVCUAH[20];

	@ObfuscatedName("client.we")
	public String[] field267 = new String[500];

	@ObfuscatedName("client.xe")
	public LYHLTGUG field268 = new LYHLTGUG();

	@ObfuscatedName("client.Ce")
	public int[][] field273 = new int[104][104];

	@ObfuscatedName("client.De")
	public int field274 = 0x766654;

	@ObfuscatedName("client.Ee")
	public long[] field275 = new long[200];

	@ObfuscatedName("client.Le")
	public UAWAYCTK field281 = UAWAYCTK.method443(1);

	@ObfuscatedName("client.Me")
	public int[] field282 = new int[151];

	@ObfuscatedName("client.Ze")
	public boolean field294 = false;

	@ObfuscatedName("client.cf")
	public int field297 = -1;

	@ObfuscatedName("client.df")
	public int field298 = -1;

	@ObfuscatedName("client.ef")
	public String field299 = "";

	@ObfuscatedName("client.hf")
	public int[] field301 = new int[5];

	@ObfuscatedName("client.mf")
	public int field305 = 1;

	@ObfuscatedName("client.pf")
	public int field307 = -1;

	@ObfuscatedName("client.rf")
	public int field308 = 0x4D4233;

	@ObfuscatedName("client.sf")
	public int[] field309 = new int[2000];

	@ObfuscatedName("client.vf")
	public int field312 = -1;

	@ObfuscatedName("client.wf")
	public int field313 = -1;

	@ObfuscatedName("client.xf")
	public String field314 = "";

	@ObfuscatedName("client.yf")
	public String field315 = "";

	@ObfuscatedName("client.Bf")
	public final int field318 = 100;

	@ObfuscatedName("client.Cf")
	public int[] field319 = new int[100];

	@ObfuscatedName("client.Df")
	public UAWAYCTK field320 = UAWAYCTK.method443(1);

	@ObfuscatedName("client.Ef")
	public UAWAYCTK field321 = new UAWAYCTK(new byte[5000]);

	@ObfuscatedName("client.Ff")
	public JKNLPRIU[] field322 = new JKNLPRIU[16384];

	@ObfuscatedName("client.Hf")
	public int[] field324 = new int[16384];

	@ObfuscatedName("client.Kf")
	public boolean field327 = true;

	@ObfuscatedName("client.Pf")
	public int field332 = -1;

	@ObfuscatedName("client.Rf")
	public int field334 = 2;

	@ObfuscatedName("client.bg")
	public volatile boolean field343 = false;

	@ObfuscatedName("client.cg")
	public String field344 = "";

	@ObfuscatedName("client.eg")
	public XHDQQNIR[] field345 = new XHDQQNIR[100];

	@ObfuscatedName("client.fg")
	public int[] field346 = new int[33];

	@ObfuscatedName("client.ng")
	public long[] field353 = new long[100];

	@ObfuscatedName("client.sg")
	public int field358 = 0x23201B;

	@ObfuscatedName("client.vg")
	public int[] field360 = new int[5];

	@ObfuscatedName("client.wg")
	public String field361 = "";

	@ObfuscatedName("client.xg")
	public boolean field362 = false;

	@ObfuscatedName("client.Ag")
	public boolean field365 = false;

	@ObfuscatedName("client.Bg")
	public boolean field366 = false;

	@ObfuscatedName("client.Cg")
	public int field367 = -1;

	@ObfuscatedName("client.Fg")
	public int[] field370 = new int[5];

	@ObfuscatedName("client.Gg")
	public int[] field371 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Wg")
	public MQOIEGDZ[] field385 = new MQOIEGDZ[5];

	@ObfuscatedName("client.Xg")
	public boolean field386 = false;

	@ObfuscatedName("client.hh")
	public CGGBZSOS[] field394 = new CGGBZSOS[4];

	@ObfuscatedName("client.mh")
	public URASIGRB field398 = new URASIGRB();

	@ObfuscatedName("client.nh")
	public int[] field399 = new int[5];

	@ObfuscatedName("client.ph")
	public volatile boolean field400 = false;

	@ObfuscatedName("client.rh")
	public boolean field401 = false;

	@ObfuscatedName("client.vh")
	public boolean field405 = false;

	@ObfuscatedName("client.zh")
	public URASIGRB field408 = new URASIGRB();

	@ObfuscatedName("client.Bh")
	public IBHVCUAH[] field409 = new IBHVCUAH[8];

	@ObfuscatedName("client.Ch")
	public IBHVCUAH[] field410 = new IBHVCUAH[32];

	@ObfuscatedName("client.Dh")
	public IBHVCUAH[] field411 = new IBHVCUAH[32];

	@ObfuscatedName("client.Eh")
	public int field412 = 2048;

	@ObfuscatedName("client.Fh")
	public int field413 = 2047;

	@ObfuscatedName("client.Gh")
	public UFGXOLGK[] field414 = new UFGXOLGK[field412];

	@ObfuscatedName("client.Ih")
	public int[] field416 = new int[field412];

	@ObfuscatedName("client.Kh")
	public int[] field418 = new int[field412];

	@ObfuscatedName("client.Lh")
	public UAWAYCTK[] field419 = new UAWAYCTK[field412];

	@ObfuscatedName("client.Mh")
	public int field420 = -1;

	@ObfuscatedName("client.Nh")
	public int[] field421 = new int[50];

	@ObfuscatedName("client.ai")
	public boolean field429 = false;

	@ObfuscatedName("client.di")
	public byte[] field432 = new byte[16384];

	@ObfuscatedName("client.ji")
	public boolean field438 = false;

	@ObfuscatedName("client.ki")
	public XHDQQNIR[] field439 = new XHDQQNIR[2];

	@ObfuscatedName("client.mi")
	public boolean field441 = false;

	@ObfuscatedName("client.ni")
	public boolean field442 = false;

	@ObfuscatedName("client.pi")
	public IBHVCUAH[] field444 = new IBHVCUAH[100];

	@ObfuscatedName("client.ri")
	public boolean field446 = false;

	@ObfuscatedName("client.zi")
	public boolean field454 = true;

	@ObfuscatedName("client.Ji")
	public int[] field464 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Qi")
	public boolean field470 = true;

	@ObfuscatedName("client.Si")
	public int field471 = -1;

	@ObfuscatedName("client.Vi")
	public int field472 = -1;

	@ObfuscatedName("client.Wi")
	public int[][] field473 = new int[104][104];

	@ObfuscatedName("client.aj")
	public int[] field475 = new int[256];

	@ObfuscatedName("client.bj")
	public int[][] field476 = new int[104][104];

	@ObfuscatedName("client.cj")
	public int[] field477 = new int[5];

	@ObfuscatedName("client.dj")
	public int[] field478 = new int[7];

	@ObfuscatedName("client.ej")
	public boolean field479 = false;

	@ObfuscatedName("client.mj")
	public boolean field486 = false;

	@ObfuscatedName("client.pj")
	public int[] field489 = new int[100];

	@ObfuscatedName("client.qj")
	public String[] field490 = new String[100];

	@ObfuscatedName("client.rj")
	public String[] field491 = new String[100];

	@ObfuscatedName("client.sj")
	public int field492 = -1;

	@ObfuscatedName("client.uj")
	public IBHVCUAH[] field494 = new IBHVCUAH[32];

	@ObfuscatedName("client.vj")
	public XHDQQNIR[] field495 = new XHDQQNIR[13];

	@ObfuscatedName("client.Bj")
	public int[][][] field501 = new int[4][13][13];

	@ObfuscatedName("client.Cj")
	public final int[] field502 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ej")
	public boolean field504 = false;

	@ObfuscatedName("client.Mj")
	public URASIGRB[][][] field512 = new URASIGRB[4][104][104];

	@ObfuscatedName("client.Nj")
	public String[] field513 = new String[200];

	@ObfuscatedName("client.R")
	public static final int[] field98 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.fc")
	public static int[] field158 = new int[32];

	@ObfuscatedName("client.oc")
	public static int field166 = 10;

	@ObfuscatedName("client.qc")
	public static boolean field168 = true;

	@ObfuscatedName("client.ue")
	public static final int[][] field266 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.kf")
	public static BigInteger field303 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Dg")
	public static BigInteger field368 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.yh")
	public static int[] field407 = new int[99];

	@ObfuscatedName("client.Ii")
	public static String field463 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.T")
	public int field100;

	@ObfuscatedName("client.U")
	public int field101;

	@ObfuscatedName("client.V")
	public int field102;

	@ObfuscatedName("client.W")
	public int field103;

	@ObfuscatedName("client.eb")
	public int field110;

	@ObfuscatedName("client.gb")
	public int field112;

	@ObfuscatedName("client.tb")
	public int field124;

	@ObfuscatedName("client.ub")
	public int field125;

	@ObfuscatedName("client.vb")
	public int field126;

	@ObfuscatedName("client.xb")
	public static int field128;

	@ObfuscatedName("client.zb")
	public int field129;

	@ObfuscatedName("client.Ab")
	public int field130;

	@ObfuscatedName("client.Bb")
	public int field131;

	@ObfuscatedName("client.Cb")
	public int field132;

	@ObfuscatedName("client.Db")
	public int field133;

	@ObfuscatedName("client.Hb")
	public int field136;

	@ObfuscatedName("client.Lb")
	public static int field140;

	@ObfuscatedName("client.Xb")
	public static int field150;

	@ObfuscatedName("client.ec")
	public int field157;

	@ObfuscatedName("client.gc")
	public int field159;

	@ObfuscatedName("client.hc")
	public int field160;

	@ObfuscatedName("client.ic")
	public int field161;

	@ObfuscatedName("client.jc")
	public int field162;

	@ObfuscatedName("client.kc")
	public int field163;

	@ObfuscatedName("client.mc")
	public int field164;

	@ObfuscatedName("client.pc")
	public static int field167;

	@ObfuscatedName("client.sc")
	public int field170;

	@ObfuscatedName("client.Ec")
	public int field182;

	@ObfuscatedName("client.Fc")
	public int field183;

	@ObfuscatedName("client.Gc")
	public int field184;

	@ObfuscatedName("client.Hc")
	public int field185;

	@ObfuscatedName("client.Jc")
	public int field187;

	@ObfuscatedName("client.Kc")
	public int field188;

	@ObfuscatedName("client.Mc")
	public int field190;

	@ObfuscatedName("client.Nc")
	public int field191;

	@ObfuscatedName("client.Oc")
	public int field192;

	@ObfuscatedName("client.Pc")
	public int field193;

	@ObfuscatedName("client.Sc")
	public int field194;

	@ObfuscatedName("client.Tc")
	public int field195;

	@ObfuscatedName("client.Uc")
	public int field196;

	@ObfuscatedName("client.Vc")
	public int field197;

	@ObfuscatedName("client.Wc")
	public int field198;

	@ObfuscatedName("client.Xc")
	public int field199;

	@ObfuscatedName("client.cd")
	public int field203;

	@ObfuscatedName("client.dd")
	public int field204;

	@ObfuscatedName("client.hd")
	public int field208;

	@ObfuscatedName("client.qd")
	public static int field216;

	@ObfuscatedName("client.wd")
	public int field222;

	@ObfuscatedName("client.xd")
	public int field223;

	@ObfuscatedName("client.yd")
	public int field224;

	@ObfuscatedName("client.zd")
	public int field225;

	@ObfuscatedName("client.Ad")
	public int field226;

	@ObfuscatedName("client.Bd")
	public int field227;

	@ObfuscatedName("client.Ed")
	public int field229;

	@ObfuscatedName("client.Fd")
	public int field230;

	@ObfuscatedName("client.Gd")
	public int field231;

	@ObfuscatedName("client.Hd")
	public int field232;

	@ObfuscatedName("client.Id")
	public int field233;

	@ObfuscatedName("client.Ld")
	public int field236;

	@ObfuscatedName("client.Nd")
	public int field238;

	@ObfuscatedName("client.ae")
	public int field248;

	@ObfuscatedName("client.be")
	public int field249;

	@ObfuscatedName("client.fe")
	public int field253;

	@ObfuscatedName("client.ie")
	public int field256;

	@ObfuscatedName("client.je")
	public int field257;

	@ObfuscatedName("client.oe")
	public int field260;

	@ObfuscatedName("client.Ke")
	public int field280;

	@ObfuscatedName("client.Oe")
	public static int field284;

	@ObfuscatedName("client.Ue")
	public int field289;

	@ObfuscatedName("client.af")
	public int field295;

	@ObfuscatedName("client.bf")
	public int field296;

	@ObfuscatedName("client.ff")
	public static int field300;

	@ObfuscatedName("client.jf")
	public int field302;

	@ObfuscatedName("client.lf")
	public int field304;

	@ObfuscatedName("client.nf")
	public static int field306;

	@ObfuscatedName("client.tf")
	public int field310;

	@ObfuscatedName("client.uf")
	public int field311;

	@ObfuscatedName("client.zf")
	public int field316;

	@ObfuscatedName("client.Gf")
	public int field323;

	@ObfuscatedName("client.If")
	public int field325;

	@ObfuscatedName("client.Jf")
	public int field326;

	@ObfuscatedName("client.Of")
	public int field331;

	@ObfuscatedName("client.Qf")
	public int field333;

	@ObfuscatedName("client.Sf")
	public int field335;

	@ObfuscatedName("client.Tf")
	public int field336;

	@ObfuscatedName("client.Uf")
	public int field337;

	@ObfuscatedName("client.Yf")
	public int field340;

	@ObfuscatedName("client.Zf")
	public int field341;

	@ObfuscatedName("client.ag")
	public int field342;

	@ObfuscatedName("client.lg")
	public int field352;

	@ObfuscatedName("client.og")
	public int field354;

	@ObfuscatedName("client.pg")
	public int field355;

	@ObfuscatedName("client.rg")
	public int field357;

	@ObfuscatedName("client.tg")
	public int field359;

	@ObfuscatedName("client.yg")
	public int field363;

	@ObfuscatedName("client.zg")
	public int field364;

	@ObfuscatedName("client.Og")
	public static int field379;

	@ObfuscatedName("client.Pg")
	public int field380;

	@ObfuscatedName("client.Qg")
	public int field381;

	@ObfuscatedName("client.Rg")
	public int field382;

	@ObfuscatedName("client.Sg")
	public int field383;

	@ObfuscatedName("client.Tg")
	public static int field384;

	@ObfuscatedName("client.Yg")
	public int field387;

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

	@ObfuscatedName("client.ih")
	public int field395;

	@ObfuscatedName("client.jh")
	public int field396;

	@ObfuscatedName("client.kh")
	public int field397;

	@ObfuscatedName("client.xh")
	public int field406;

	@ObfuscatedName("client.Hh")
	public int field415;

	@ObfuscatedName("client.Jh")
	public int field417;

	@ObfuscatedName("client.Oh")
	public int field422;

	@ObfuscatedName("client.Uh")
	public int field424;

	@ObfuscatedName("client.Vh")
	public int field425;

	@ObfuscatedName("client.Xh")
	public int field426;

	@ObfuscatedName("client.Yh")
	public int field427;

	@ObfuscatedName("client.Zh")
	public int field428;

	@ObfuscatedName("client.ei")
	public int field433;

	@ObfuscatedName("client.fi")
	public int field434;

	@ObfuscatedName("client.gi")
	public int field435;

	@ObfuscatedName("client.hi")
	public int field436;

	@ObfuscatedName("client.li")
	public static int field440;

	@ObfuscatedName("client.qi")
	public static int field445;

	@ObfuscatedName("client.yi")
	public int field453;

	@ObfuscatedName("client.Ai")
	public int field455;

	@ObfuscatedName("client.Bi")
	public int field456;

	@ObfuscatedName("client.Ci")
	public int field457;

	@ObfuscatedName("client.Di")
	public int field458;

	@ObfuscatedName("client.Ei")
	public int field459;

	@ObfuscatedName("client.Fi")
	public int field460;

	@ObfuscatedName("client.Gi")
	public int field461;

	@ObfuscatedName("client.Hi")
	public static int field462;

	@ObfuscatedName("client.Ki")
	public int field465;

	@ObfuscatedName("client.Li")
	public int field466;

	@ObfuscatedName("client.Mi")
	public int field467;

	@ObfuscatedName("client.Oi")
	public int field468;

	@ObfuscatedName("client.gj")
	public int field480;

	@ObfuscatedName("client.hj")
	public int field481;

	@ObfuscatedName("client.ij")
	public static int field482;

	@ObfuscatedName("client.jj")
	public int field483;

	@ObfuscatedName("client.kj")
	public int field484;

	@ObfuscatedName("client.lj")
	public int field485;

	@ObfuscatedName("client.nj")
	public int field487;

	@ObfuscatedName("client.oj")
	public int field488;

	@ObfuscatedName("client.tj")
	public int field493;

	@ObfuscatedName("client.Dj")
	public int field503;

	@ObfuscatedName("client.Jj")
	public int field509;

	@ObfuscatedName("client.Kj")
	public int field510;

	@ObfuscatedName("client.Lj")
	public int field511;

	@ObfuscatedName("client.Oj")
	public int field514;

	@ObfuscatedName("client.Pj")
	public int field515;

	@ObfuscatedName("client.Qj")
	public int field516;

	@ObfuscatedName("client.Rj")
	public int field517;

	@ObfuscatedName("client.Sj")
	public int field518;

	@ObfuscatedName("client.I")
	public int field91;

	@ObfuscatedName("client.K")
	public int field92;

	@ObfuscatedName("client.L")
	public int field93;

	@ObfuscatedName("client.Od")
	public long field239;

	@ObfuscatedName("client.Lf")
	public long field328;

	@ObfuscatedName("client.Sh")
	public long field423;

	@ObfuscatedName("client.ci")
	public long field431;

	@ObfuscatedName("client.Xi")
	public long field474;

	@ObfuscatedName("client.Je")
	public DUZSRFJE field279;

	@ObfuscatedName("client.bi")
	public ELICEBAH field430;

	@ObfuscatedName("client.pd")
	public IBHVCUAH field215;

	@ObfuscatedName("client.Sd")
	public IBHVCUAH field243;

	@ObfuscatedName("client.ye")
	public IBHVCUAH field269;

	@ObfuscatedName("client.ze")
	public IBHVCUAH field270;

	@ObfuscatedName("client.Ae")
	public IBHVCUAH field271;

	@ObfuscatedName("client.Be")
	public IBHVCUAH field272;

	@ObfuscatedName("client.qg")
	public IBHVCUAH field356;

	@ObfuscatedName("client.Mg")
	public IBHVCUAH field377;

	@ObfuscatedName("client.wi")
	public IBHVCUAH field451;

	@ObfuscatedName("client.xi")
	public IBHVCUAH field452;

	@ObfuscatedName("client.wj")
	public IBHVCUAH field496;

	@ObfuscatedName("client.xj")
	public IBHVCUAH field497;

	@ObfuscatedName("client.yj")
	public IBHVCUAH field498;

	@ObfuscatedName("client.zj")
	public IBHVCUAH field499;

	@ObfuscatedName("client.Aj")
	public IBHVCUAH field500;

	@ObfuscatedName("client.Ve")
	public IDBGYHWK field290;

	@ObfuscatedName("client.We")
	public IDBGYHWK field291;

	@ObfuscatedName("client.Xe")
	public IDBGYHWK field292;

	@ObfuscatedName("client.Ye")
	public IDBGYHWK field293;

	@ObfuscatedName("client.Xf")
	public OBOSMEDX field339;

	@ObfuscatedName("client.Mb")
	public PKTDMNAV field141;

	@ObfuscatedName("client.Nb")
	public PKTDMNAV field142;

	@ObfuscatedName("client.Ob")
	public PKTDMNAV field143;

	@ObfuscatedName("client.Pb")
	public PKTDMNAV field144;

	@ObfuscatedName("client.Qb")
	public PKTDMNAV field145;

	@ObfuscatedName("client.Rb")
	public PKTDMNAV field146;

	@ObfuscatedName("client.Sb")
	public PKTDMNAV field147;

	@ObfuscatedName("client.Tb")
	public PKTDMNAV field148;

	@ObfuscatedName("client.Ub")
	public PKTDMNAV field149;

	@ObfuscatedName("client.uc")
	public PKTDMNAV field172;

	@ObfuscatedName("client.vc")
	public PKTDMNAV field173;

	@ObfuscatedName("client.wc")
	public PKTDMNAV field174;

	@ObfuscatedName("client.xc")
	public PKTDMNAV field175;

	@ObfuscatedName("client.yc")
	public PKTDMNAV field176;

	@ObfuscatedName("client.zc")
	public PKTDMNAV field177;

	@ObfuscatedName("client.Ac")
	public PKTDMNAV field178;

	@ObfuscatedName("client.Bc")
	public PKTDMNAV field179;

	@ObfuscatedName("client.Cc")
	public PKTDMNAV field180;

	@ObfuscatedName("client.si")
	public PKTDMNAV field447;

	@ObfuscatedName("client.ti")
	public PKTDMNAV field448;

	@ObfuscatedName("client.ui")
	public PKTDMNAV field449;

	@ObfuscatedName("client.vi")
	public PKTDMNAV field450;

	@ObfuscatedName("client.Fj")
	public PKTDMNAV field505;

	@ObfuscatedName("client.Gj")
	public PKTDMNAV field506;

	@ObfuscatedName("client.Hj")
	public PKTDMNAV field507;

	@ObfuscatedName("client.Ij")
	public RVLWVPJQ field508;

	@ObfuscatedName("client.Ng")
	public static UFGXOLGK field378;

	@ObfuscatedName("client.nc")
	public VXFBFZWJ field165;

	@ObfuscatedName("client.ld")
	public VZIKSEDY field212;

	@ObfuscatedName("client.Fb")
	public XHDQQNIR field134;

	@ObfuscatedName("client.Gb")
	public XHDQQNIR field135;

	@ObfuscatedName("client.Yc")
	public XHDQQNIR field200;

	@ObfuscatedName("client.Zc")
	public XHDQQNIR field201;

	@ObfuscatedName("client.ad")
	public XHDQQNIR field202;

	@ObfuscatedName("client.ed")
	public XHDQQNIR field205;

	@ObfuscatedName("client.fd")
	public XHDQQNIR field206;

	@ObfuscatedName("client.Fe")
	public XHDQQNIR field276;

	@ObfuscatedName("client.Ge")
	public XHDQQNIR field277;

	@ObfuscatedName("client.He")
	public XHDQQNIR field278;

	@ObfuscatedName("client.gg")
	public XHDQQNIR field347;

	@ObfuscatedName("client.hg")
	public XHDQQNIR field348;

	@ObfuscatedName("client.ig")
	public XHDQQNIR field349;

	@ObfuscatedName("client.jg")
	public XHDQQNIR field350;

	@ObfuscatedName("client.kg")
	public XHDQQNIR field351;

	@ObfuscatedName("client.Hg")
	public XHDQQNIR field372;

	@ObfuscatedName("client.Ig")
	public XHDQQNIR field373;

	@ObfuscatedName("client.Jg")
	public XHDQQNIR field374;

	@ObfuscatedName("client.Kg")
	public XHDQQNIR field375;

	@ObfuscatedName("client.Lg")
	public XHDQQNIR field376;

	@ObfuscatedName("client.fb")
	public String field111;

	@ObfuscatedName("client.wb")
	public String field127;

	@ObfuscatedName("client.Wf")
	public String field338;

	@ObfuscatedName("client.ii")
	public String field437;

	@ObfuscatedName("client.gd")
	public Socket field207;

	@ObfuscatedName("client.X")
	public static boolean field104;

	@ObfuscatedName("client.rc")
	public static boolean field169;

	@ObfuscatedName("client.Ne")
	public static boolean field283;

	@ObfuscatedName("client.Eg")
	public static boolean field369;

	@ObfuscatedName("client.qb")
	public int[] field122;

	@ObfuscatedName("client.rb")
	public int[] field123;

	@ObfuscatedName("client.Pd")
	public int[] field240;

	@ObfuscatedName("client.Qd")
	public int[] field241;

	@ObfuscatedName("client.Rd")
	public int[] field242;

	@ObfuscatedName("client.Pe")
	public int[] field285;

	@ObfuscatedName("client.Qe")
	public int[] field286;

	@ObfuscatedName("client.Re")
	public int[] field287;

	@ObfuscatedName("client.Se")
	public int[] field288;

	@ObfuscatedName("client.Mf")
	public int[] field329;

	@ObfuscatedName("client.Nf")
	public int[] field330;

	@ObfuscatedName("client.sh")
	public int[] field402;

	@ObfuscatedName("client.th")
	public int[] field403;

	@ObfuscatedName("client.uh")
	public int[] field404;

	@ObfuscatedName("client.Xd")
	public XHDQQNIR[] field246;

	@ObfuscatedName("client.Kb")
	public byte[][] field139;

	@ObfuscatedName("client.oi")
	public byte[][] field443;

	@ObfuscatedName("client.Pi")
	public byte[][][] field469;

	@ObfuscatedName("client.Af")
	public int[][][] field317;

	@ObfuscatedName("client.a(B)V")
	public final void method40() {
		for (int var1 = 0; var1 < field323; var1++) {
			int var2 = field324[var1];
			JKNLPRIU var3 = field322[var2];
			if (var3 != null) {
				method41(var3.field750.field736, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILTTYUWHXI;)V")
	public final void method41(int arg0, TTYUWHXI arg1) {
		if (arg1.field1235 < 128 || arg1.field1236 < 128 || arg1.field1235 >= 13184 || arg1.field1236 >= 13184) {
			arg1.field1196 = -1;
			arg1.field1210 = -1;
			arg1.field1206 = 0;
			arg1.field1207 = 0;
			arg1.field1235 = arg1.field1228[0] * 128 + arg1.field1230 * 64;
			arg1.field1236 = arg1.field1229[0] * 128 + arg1.field1230 * 64;
			arg1.method440();
		}

		if (field378 == arg1 && (arg1.field1235 < 1536 || arg1.field1236 < 1536 || arg1.field1235 >= 11776 || arg1.field1236 >= 11776)) {
			arg1.field1196 = -1;
			arg1.field1210 = -1;
			arg1.field1206 = 0;
			arg1.field1207 = 0;
			arg1.field1235 = arg1.field1228[0] * 128 + arg1.field1230 * 64;
			arg1.field1236 = arg1.field1229[0] * 128 + arg1.field1230 * 64;
			arg1.method440();
		}

		if (arg1.field1206 > field306) {
			method42(arg1);
		} else if (arg1.field1207 >= field306) {
			method43(arg1);
		} else {
			method44(arg1);
		}

		method45(arg1);
		method46(arg1);
	}

	@ObfuscatedName("client.a(LTTYUWHXI;Z)V")
	public final void method42(TTYUWHXI arg0) {
		int var2 = arg0.field1206 - field306;
		int var3 = arg0.field1230 * 64 + arg0.field1202 * 128;
		int var4 = arg0.field1230 * 64 + arg0.field1204 * 128;
		arg0.field1235 += (var3 - arg0.field1235) / var2;
		arg0.field1236 += (var4 - arg0.field1236) / var2;
		arg0.field1209 = 0;

		if (arg0.field1208 == 0) {
			arg0.field1247 = 1024;
		}

		if (arg0.field1208 == 1) {
			arg0.field1247 = 1536;
		}

		if (arg0.field1208 == 2) {
			arg0.field1247 = 0;
		}

		if (arg0.field1208 == 3) {
			arg0.field1247 = 512;
		}
	}

	@ObfuscatedName("client.b(LTTYUWHXI;Z)V")
	public final void method43(TTYUWHXI arg0) {
		if (field306 == arg0.field1207 || arg0.field1196 == -1 || arg0.field1199 != 0 || arg0.field1198 + 1 > RIUJHZLL.field1112[arg0.field1196].method414(arg0.field1197)) {
			int var2 = arg0.field1207 - arg0.field1206;
			int var3 = field306 - arg0.field1206;
			int var4 = arg0.field1230 * 64 + arg0.field1202 * 128;
			int var5 = arg0.field1230 * 64 + arg0.field1204 * 128;
			int var6 = arg0.field1230 * 64 + arg0.field1203 * 128;
			int var7 = arg0.field1230 * 64 + arg0.field1205 * 128;
			arg0.field1235 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1236 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1209 = 0;

		if (arg0.field1208 == 0) {
			arg0.field1247 = 1024;
		}

		if (arg0.field1208 == 1) {
			arg0.field1247 = 1536;
		}

		if (arg0.field1208 == 2) {
			arg0.field1247 = 0;
		}

		if (arg0.field1208 == 3) {
			arg0.field1247 = 512;
		}

		arg0.field1237 = arg0.field1247;
	}

	@ObfuscatedName("client.a(LTTYUWHXI;B)V")
	public final void method44(TTYUWHXI arg0) {
		arg0.field1238 = arg0.field1220;
		if (arg0.field1201 == 0) {
			arg0.field1209 = 0;
		} else {
			if (arg0.field1196 != -1 && arg0.field1199 == 0) {
				RIUJHZLL var2 = RIUJHZLL.field1112[arg0.field1196];
				if (arg0.field1233 > 0 && var2.field1124 == 0) {
					arg0.field1209++;
					return;
				}

				if (arg0.field1233 <= 0 && var2.field1125 == 0) {
					arg0.field1209++;
					return;
				}
			}

			int var3 = arg0.field1235;
			int var4 = arg0.field1236;
			int var5 = arg0.field1228[arg0.field1201 - 1] * 128 + arg0.field1230 * 64;
			int var6 = arg0.field1229[arg0.field1201 - 1] * 128 + arg0.field1230 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1247 = 1280;
					} else if (var4 > var6) {
						arg0.field1247 = 1792;
					} else {
						arg0.field1247 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1247 = 768;
					} else if (var4 > var6) {
						arg0.field1247 = 256;
					} else {
						arg0.field1247 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1247 = 1024;
				} else {
					arg0.field1247 = 0;
				}

				int var7 = arg0.field1247 - arg0.field1237 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1224;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1223;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1226;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1225;
				}

				if (var8 == -1) {
					var8 = arg0.field1223;
				}

				arg0.field1238 = var8;
				int var9 = 4;
				if (arg0.field1247 != arg0.field1237 && arg0.field1242 == -1 && arg0.field1231 != 0) {
					var9 = 2;
				}

				if (arg0.field1201 > 2) {
					var9 = 6;
				}

				if (arg0.field1201 > 3) {
					var9 = 8;
				}

				if (arg0.field1209 > 0 && arg0.field1201 > 1) {
					var9 = 8;
					arg0.field1209--;
				}

				if (arg0.field1241[arg0.field1201 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1238 == arg0.field1223 && arg0.field1227 != -1) {
					arg0.field1238 = arg0.field1227;
				}

				if (var3 < var5) {
					arg0.field1235 += var9;
					if (arg0.field1235 > var5) {
						arg0.field1235 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1235 -= var9;
					if (arg0.field1235 < var5) {
						arg0.field1235 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1236 += var9;
					if (arg0.field1236 > var6) {
						arg0.field1236 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1236 -= var9;
					if (arg0.field1236 < var6) {
						arg0.field1236 = var6;
					}
				}

				if (arg0.field1235 == var5 && arg0.field1236 == var6) {
					arg0.field1201--;

					if (arg0.field1233 > 0) {
						arg0.field1233--;
						return;
					}
				}
			} else {
				arg0.field1235 = var5;
				arg0.field1236 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LTTYUWHXI;I)V")
	public final void method45(TTYUWHXI arg0) {
		if (arg0.field1231 != 0) {
			if (arg0.field1242 != -1 && arg0.field1242 < 32768) {
				JKNLPRIU var2 = field322[arg0.field1242];
				if (var2 != null) {
					int var3 = arg0.field1235 - var2.field1235;
					int var4 = arg0.field1236 - var2.field1236;
					if (var3 != 0 || var4 != 0) {
						arg0.field1247 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1242 >= 32768) {
				int var5 = arg0.field1242 - 32768;
				if (field332 == var5) {
					var5 = field413;
				}

				UFGXOLGK var6 = field414[var5];
				if (var6 != null) {
					int var7 = arg0.field1235 - var6.field1235;
					int var8 = arg0.field1236 - var6.field1236;
					if (var7 != 0 || var8 != 0) {
						arg0.field1247 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1243 != 0 || arg0.field1244 != 0) && (arg0.field1201 == 0 || arg0.field1209 > 0)) {
				int var9 = arg0.field1235 - (arg0.field1243 - field224 - field224) * 64;
				int var10 = arg0.field1236 - (arg0.field1244 - field225 - field225) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1247 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1243 = 0;
				arg0.field1244 = 0;
			}

			int var11 = arg0.field1247 - arg0.field1237 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1231 || var11 > 2048 - arg0.field1231) {
					arg0.field1237 = arg0.field1247;
				} else if (var11 > 1024) {
					arg0.field1237 -= arg0.field1231;
				} else {
					arg0.field1237 += arg0.field1231;
				}

				arg0.field1237 &= 0x7FF;
				if (arg0.field1238 == arg0.field1220 && arg0.field1247 != arg0.field1237) {
					if (arg0.field1221 != -1) {
						arg0.field1238 = arg0.field1221;
						return;
					}

					arg0.field1238 = arg0.field1223;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILTTYUWHXI;)V")
	public final void method46(TTYUWHXI arg0) {
		arg0.field1234 = false;

		if (arg0.field1238 != -1) {
			RIUJHZLL var2 = RIUJHZLL.field1112[arg0.field1238];
			arg0.field1240++;
			if (arg0.field1239 < var2.field1113 && arg0.field1240 > var2.method414(arg0.field1239)) {
				arg0.field1240 = 0;
				arg0.field1239++;
			}

			if (arg0.field1239 >= var2.field1113) {
				arg0.field1240 = 0;
				arg0.field1239 = 0;
			}
		}

		if (arg0.field1210 != -1 && field306 >= arg0.field1213) {
			if (arg0.field1211 < 0) {
				arg0.field1211 = 0;
			}

			RIUJHZLL var3 = PMDEXOWJ.field1086[arg0.field1210].field1090;
			arg0.field1212++;
			while (arg0.field1211 < var3.field1113 && arg0.field1212 > var3.method414(arg0.field1211)) {
				arg0.field1212 -= var3.method414(arg0.field1211);
				arg0.field1211++;
			}

			if (arg0.field1211 >= var3.field1113 && (arg0.field1211 < 0 || arg0.field1211 >= var3.field1113)) {
				arg0.field1210 = -1;
			}
		}

		if (arg0.field1196 != -1 && arg0.field1199 <= 1) {
			RIUJHZLL var4 = RIUJHZLL.field1112[arg0.field1196];
			if (var4.field1124 == 1 && arg0.field1233 > 0 && arg0.field1206 <= field306 && arg0.field1207 < field306) {
				arg0.field1199 = 1;
				return;
			}
		}

		if (arg0.field1196 != -1 && arg0.field1199 == 0) {
			RIUJHZLL var5 = RIUJHZLL.field1112[arg0.field1196];
			arg0.field1198++;
			while (arg0.field1197 < var5.field1113 && arg0.field1198 > var5.method414(arg0.field1197)) {
				arg0.field1198 -= var5.method414(arg0.field1197);
				arg0.field1197++;
			}

			if (arg0.field1197 >= var5.field1113) {
				arg0.field1197 -= var5.field1117;
				arg0.field1200++;
				if (arg0.field1200 >= var5.field1123) {
					arg0.field1196 = -1;
				}

				if (arg0.field1197 < 0 || arg0.field1197 >= var5.field1113) {
					arg0.field1196 = -1;
				}
			}

			arg0.field1234 = var5.field1119;
		}

		if (arg0.field1199 > 0) {
			arg0.field1199--;
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method47() {
		if (field365) {
			field365 = false;
			field141.method400(4, 0, field9);
			field142.method400(357, 0, field9);
			field143.method400(4, 722, field9);
			field144.method400(205, 743, field9);
			field145.method400(0, 0, field9);
			field146.method400(4, 516, field9);
			field147.method400(205, 516, field9);
			field148.method400(357, 496, field9);
			field149.method400(338, 0, field9);
			field429 = true;
			field362 = true;
			field401 = true;
			field405 = true;

			if (field393 != 2) {
				field449.method400(4, 4, field9);
				field448.method400(4, 550, field9);
			}

			field482++;
			if (field482 > 92) {
				field482 = 0;
				field281.method444(248);
			}
		}

		if (field393 == 2) {
			method101();
		}

		if (field504 && field388 == 1) {
			field429 = true;
		}

		if (field492 != -1) {
			boolean var1 = method154(field492, field511);
			if (var1) {
				field429 = true;
			}
		}

		if (field193 == 2) {
			field429 = true;
		}

		if (field516 == 2) {
			field429 = true;
		}

		if (field429) {
			method112();
			field429 = false;
		}

		if (field298 == -1) {
			field268.field798 = field155 - field352 - 77;

			if (field17 > 448 && field17 < 560 && field18 > 332) {
				method120(77, field155, field17 - 17, 0, 463, -1, field268, field18 - 357);
			}

			int var2 = field155 - field268.field798 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field155 - 77) {
				var2 = field155 - 77;
			}

			if (field352 != var2) {
				field352 = var2;
				field362 = true;
			}
		}

		if (field298 != -1) {
			boolean var3 = method154(field298, field511);
			if (var3) {
				field362 = true;
			}
		}

		if (field193 == 3) {
			field362 = true;
		}

		if (field516 == 3) {
			field362 = true;
		}

		if (field338 != null) {
			field362 = true;
		}

		if (field504 && field388 == 2) {
			field362 = true;
		}

		if (field362) {
			method86();
			field362 = false;
		}

		if (field393 == 2) {
			method49();
			field448.method400(4, 550, field9);
		}

		if (field237 != -1) {
			field401 = true;
		}

		if (field401) {
			if (field237 != -1 && field237 == field105) {
				field237 = -1;
				field281.method444(132);
				field281.method445(field105);
			}

			field401 = false;
			field507.method399();
			field202.method555(0, 0);

			if (field492 == -1) {
				if (field371[field105] != -1) {
					if (field105 == 0) {
						field372.method555(22, 10);
					}

					if (field105 == 1) {
						field373.method555(54, 8);
					}

					if (field105 == 2) {
						field373.method555(82, 8);
					}

					if (field105 == 3) {
						field374.method555(110, 8);
					}

					if (field105 == 4) {
						field376.method555(153, 8);
					}

					if (field105 == 5) {
						field376.method555(181, 8);
					}

					if (field105 == 6) {
						field375.method555(209, 9);
					}
				}

				if (field371[0] != -1 && (field237 != 0 || field306 % 20 < 10)) {
					field495[0].method555(29, 13);
				}

				if (field371[1] != -1 && (field237 != 1 || field306 % 20 < 10)) {
					field495[1].method555(53, 11);
				}

				if (field371[2] != -1 && (field237 != 2 || field306 % 20 < 10)) {
					field495[2].method555(82, 11);
				}

				if (field371[3] != -1 && (field237 != 3 || field306 % 20 < 10)) {
					field495[3].method555(115, 12);
				}

				if (field371[4] != -1 && (field237 != 4 || field306 % 20 < 10)) {
					field495[4].method555(153, 13);
				}

				if (field371[5] != -1 && (field237 != 5 || field306 % 20 < 10)) {
					field495[5].method555(180, 11);
				}

				if (field371[6] != -1 && (field237 != 6 || field306 % 20 < 10)) {
					field495[6].method555(208, 13);
				}
			}

			field507.method400(160, 516, field9);
			field506.method399();
			field201.method555(0, 0);

			if (field492 == -1) {
				if (field371[field105] != -1) {
					if (field105 == 7) {
						field347.method555(42, 0);
					}

					if (field105 == 8) {
						field348.method555(74, 0);
					}

					if (field105 == 9) {
						field348.method555(102, 0);
					}

					if (field105 == 10) {
						field349.method555(130, 1);
					}

					if (field105 == 11) {
						field351.method555(173, 0);
					}

					if (field105 == 12) {
						field351.method555(201, 0);
					}

					if (field105 == 13) {
						field350.method555(229, 0);
					}
				}

				if (field371[8] != -1 && (field237 != 8 || field306 % 20 < 10)) {
					field495[7].method555(74, 2);
				}

				if (field371[9] != -1 && (field237 != 9 || field306 % 20 < 10)) {
					field495[8].method555(102, 3);
				}

				if (field371[10] != -1 && (field237 != 10 || field306 % 20 < 10)) {
					field495[9].method555(137, 4);
				}

				if (field371[11] != -1 && (field237 != 11 || field306 % 20 < 10)) {
					field495[10].method555(174, 2);
				}

				if (field371[12] != -1 && (field237 != 12 || field306 % 20 < 10)) {
					field495[11].method555(201, 2);
				}

				if (field371[13] != -1 && (field237 != 13 || field306 % 20 < 10)) {
					field495[12].method555(226, 2);
				}
			}

			field506.method400(466, 496, field9);
			field449.method399();
		}

		if (field405) {
			field405 = false;
			field505.method399();
			field200.method555(0, 0);
			field291.method242(0xFFFFFF, true, "Public chat", 55, 28);

			if (field503 == 0) {
				field291.method242(0xFF00, true, "On", 55, 41);
			}

			if (field503 == 1) {
				field291.method242(0xFFFF00, true, "Friends", 55, 41);
			}

			if (field503 == 2) {
				field291.method242(0xFF0000, true, "Off", 55, 41);
			}

			if (field503 == 3) {
				field291.method242(0xFFFF, true, "Hide", 55, 41);
			}

			field291.method242(0xFFFFFF, true, "Private chat", 184, 28);

			if (field311 == 0) {
				field291.method242(0xFF00, true, "On", 184, 41);
			}

			if (field311 == 1) {
				field291.method242(0xFFFF00, true, "Friends", 184, 41);
			}

			if (field311 == 2) {
				field291.method242(0xFF0000, true, "Off", 184, 41);
			}

			field291.method242(0xFFFFFF, true, "Trade/compete", 324, 28);

			if (field455 == 0) {
				field291.method242(0xFF00, true, "On", 324, 41);
			}

			if (field455 == 1) {
				field291.method242(0xFFFF00, true, "Friends", 324, 41);
			}

			if (field455 == 2) {
				field291.method242(0xFF0000, true, "Off", 324, 41);
			}

			field291.method242(0xFFFFFF, true, "Report abuse", 458, 33);
			field505.method400(453, 0, field9);
			field449.method399();
		}

		field511 = 0;
	}

	@ObfuscatedName("client.a(II)V")
	public final void method48(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method49() {
		field448.method399();

		if (field481 == 2) {
			byte[] var1 = field277.field1447;
			int[] var2 = TTGPXKMD.field1186;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field215.method236(33, 33, 25, field107, field100, field346, 25, 0, 256, 0);
			field449.method399();
		} else {
			int var5 = field170 + field100 & 0x7FF;
			int var6 = field378.field1235 / 32 + 48;
			int var7 = 464 - field378.field1236 / 32;
			field356.method236(146, 151, var6, field234, var5, field282, var7, 5, field257 + 256, 25);
			field215.method236(33, 33, 25, field107, field100, field346, 25, 0, 256, 0);

			for (int var8 = 0; var8 < field253; var8++) {
				int var9 = field254[var8] * 4 + 2 - field378.field1235 / 32;
				int var10 = field255[var8] * 4 + 2 - field378.field1236 / 32;
				method100(var9, var10, field90[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					URASIGRB var13 = field512[field480][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field378.field1235 / 32;
						int var15 = var12 * 4 + 2 - field378.field1236 / 32;
						method100(var14, var15, field496);
					}
				}
			}

			for (int var16 = 0; var16 < field323; var16++) {
				JKNLPRIU var17 = field322[field324[var16]];
				if (var17 != null && var17.method287()) {
					JKAPIYZO var18 = var17.field750;
					if (var18.field720 != null) {
						var18 = var18.method282();
					}

					if (var18 != null && var18.field726 && var18.field713) {
						int var19 = var17.field1235 / 32 - field378.field1235 / 32;
						int var20 = var17.field1236 / 32 - field378.field1236 / 32;
						method100(var19, var20, field497);
					}
				}
			}

			for (int var21 = 0; var21 < field415; var21++) {
				UFGXOLGK var22 = field414[field416[var21]];
				if (var22 != null && var22.method287()) {
					int var23 = var22.field1235 / 32 - field378.field1235 / 32;
					int var24 = var22.field1236 / 32 - field378.field1236 / 32;
					boolean var25 = false;
					long var26 = VTCTQQUO.method508(var22.field1283);
					for (int var28 = 0; var28 < field396; var28++) {
						if (field275[var28] == var26 && field138[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field378.field1269 != 0 && var22.field1269 != 0 && field378.field1269 == var22.field1269) {
						var29 = true;
					}

					if (var25) {
						method100(var23, var24, field499);
					} else if (var29) {
						method100(var23, var24, field500);
					} else {
						method100(var23, var24, field498);
					}
				}
			}

			if (field363 != 0 && field306 % 20 < 10) {
				if (field363 == 1 && field236 >= 0 && field236 < field322.length) {
					JKNLPRIU var30 = field322[field236];
					if (var30 != null) {
						int var31 = var30.field1235 / 32 - field378.field1235 / 32;
						int var32 = var30.field1236 / 32 - field378.field1236 / 32;
						method159(var32, field272, var31);
					}
				}

				if (field363 == 2) {
					int var33 = (field194 - field224) * 4 + 2 - field378.field1235 / 32;
					int var34 = (field195 - field225) * 4 + 2 - field378.field1236 / 32;
					method159(var34, field272, var33);
				}

				if (field363 == 10 && field310 >= 0 && field310 < field414.length) {
					UFGXOLGK var35 = field414[field310];
					if (var35 != null) {
						int var36 = var35.field1235 / 32 - field378.field1235 / 32;
						int var37 = var35.field1236 / 32 - field378.field1236 / 32;
						method159(var37, field272, var36);
					}
				}
			}

			if (field354 != 0) {
				int var38 = field354 * 4 + 2 - field378.field1235 / 32;
				int var39 = field355 * 4 + 2 - field378.field1236 / 32;
				method100(var38, var39, field271);
			}

			TTGPXKMD.method432(0xFFFFFF, 78, 3, 97, 3);
			field449.method399();
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		DOIBONME var10 = null;
		for (DOIBONME var11 = (DOIBONME) field408.method503(); var11 != null; var11 = (DOIBONME) field408.method505()) {
			if (var11.field552 == arg1 && var11.field554 == arg3 && var11.field555 == arg6 && var11.field553 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new DOIBONME();
			var10.field552 = arg1;
			var10.field553 = arg8;
			var10.field554 = arg3;
			var10.field555 = arg6;
			method164(var10);
			field408.method500(var10);
		}

		var10.field544 = arg5;
		var10.field546 = arg7;
		var10.field545 = arg0;
		var10.field551 = arg4;
		var10.field550 = arg2;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method51() {
		if (field187 != 0) {
			IDBGYHWK var1 = field291;
			int var2 = 0;
			if (field468 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field491[var3] != null) {
					int var4 = field489[var3];
					String var5 = field490[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field311 == 0 || field311 == 1 && method79(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method245(0, var8, var7, "From");
						var1.method245(0xFFFF, var8, var7 - 1, "From");
						int var11 = var8 + var1.method243("From ");
						if (var6 == 1) {
							field439[0].method555(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field439[1].method555(var11, var7 - 12);
							var11 += 14;
						}

						var1.method245(0, var11, var7, var5 + ": " + field491[var3]);
						var1.method245(0xFFFF, var11, var7 - 1, var5 + ": " + field491[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field311 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method245(0, 4, var9, field491[var3]);
						var1.method245(0xFFFF, 4, var9 - 1, field491[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field311 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method245(0, 4, var10, "To " + var5 + ": " + field491[var3]);
						var1.method245(0xFFFF, 4, var10 - 1, "To " + var5 + ": " + field491[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method52() {
		for (int var1 = -1; var1 < field415; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field413;
			} else {
				var2 = field416[var1];
			}

			UFGXOLGK var3 = field414[var2];
			if (var3 != null && var3.field1222 > 0) {
				var3.field1222--;
				if (var3.field1222 == 0) {
					var3.field1232 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field323; var4++) {
			int var5 = field324[var4];
			JKNLPRIU var6 = field322[var5];
			if (var6 != null && var6.field1222 > 0) {
				var6.field1222--;
				if (var6.field1222 == 0) {
					var6.field1232 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LLYHLTGUG;I)V")
	public final void method53(LYHLTGUG arg0) {
		int var2 = arg0.field828;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field397 == 0) {
				arg0.field854 = "Loading friend list";
				arg0.field795 = 0;
			} else if (var2 == 1 && field397 == 1) {
				arg0.field854 = "Connecting to friendserver";
				arg0.field795 = 0;
			} else if (var2 == 2 && field397 != 2) {
				arg0.field854 = "Please wait...";
				arg0.field795 = 0;
			} else {
				int var3 = field396;
				if (field397 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field854 = "";
					arg0.field795 = 0;
				} else {
					arg0.field854 = field513[var2];
					arg0.field795 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field396;
			if (field397 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field854 = "";
				arg0.field795 = 0;
			} else {
				if (field138[var2] == 0) {
					arg0.field854 = "@red@Offline";
				} else if (field138[var2] < 200) {
					if (field138[var2] == field166) {
						arg0.field854 = "@gre@World-" + (field138[var2] - 9);
					} else {
						arg0.field854 = "@yel@World-" + (field138[var2] - 9);
					}
				} else if (field138[var2] == field166) {
					arg0.field854 = "@gre@Classic" + (field138[var2] - 219);
				} else {
					arg0.field854 = "@yel@Classic" + (field138[var2] - 219);
				}

				arg0.field795 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field396;
			if (field397 != 2) {
				var5 = 0;
			}

			arg0.field832 = var5 * 15 + 20;
			if (arg0.field832 <= arg0.field855) {
				arg0.field832 = arg0.field855 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field397 == 0) {
				arg0.field854 = "Loading ignore list";
				arg0.field795 = 0;
			} else if (var2 == 1 && field397 == 0) {
				arg0.field854 = "Please wait...";
				arg0.field795 = 0;
			} else {
				int var6 = field222;
				if (field397 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field854 = "";
					arg0.field795 = 0;
				} else {
					arg0.field854 = VTCTQQUO.method512(VTCTQQUO.method509(field353[var2]));
					arg0.field795 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field832 = field222 * 15 + 20;
			if (arg0.field832 <= arg0.field855) {
				arg0.field832 = arg0.field855 + 1;
			}
		} else if (var2 == 327) {
			arg0.field823 = 150;
			arg0.field824 = (int) (Math.sin(field306 / 40.0D) * 256.0D) & 0x7FF;

			if (field264) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field478[var7];
					if (var8 >= 0 && !NRLTHETF.field954[var8].method335()) {
						return;
					}
				}

				field264 = false;
				WEVRTBOZ[] var9 = new WEVRTBOZ[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field478[var11];
					if (var12 >= 0) {
						var9[var10++] = NRLTHETF.field954[var12].method336();
					}
				}

				WEVRTBOZ var13 = new WEVRTBOZ(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field360[var14] != 0) {
						var13.method539(field266[var14][0], field266[var14][field360[var14]]);

						if (var14 == 1) {
							var13.method539(field98[0], field98[field360[var14]]);
						}
					}
				}

				var13.method532();
				var13.method533(RIUJHZLL.field1112[field378.field1220].field1114[0]);
				var13.method542(64, 850, -30, -50, -30, true);
				arg0.field791 = 5;
				arg0.field792 = 0;
				LYHLTGUG.method306(0, var13, 5);
			}
		} else if (var2 == 324) {
			if (field269 == null) {
				field269 = arg0.field837;
				field270 = arg0.field802;
			}

			if (field454) {
				arg0.field837 = field270;
			} else {
				arg0.field837 = field269;
			}
		} else if (var2 == 325) {
			if (field269 == null) {
				field269 = arg0.field837;
				field270 = arg0.field802;
			}

			if (field454) {
				arg0.field837 = field269;
			} else {
				arg0.field837 = field270;
			}
		} else if (var2 == 600) {
			arg0.field854 = field361;
			if (field306 % 20 < 10) {
				arg0.field854 = arg0.field854 + "|";
			} else {
				arg0.field854 = arg0.field854 + " ";
			}
		} else if (var2 == 620) {
			if (field103 < 1) {
				arg0.field854 = "";
			} else if (field441) {
				arg0.field851 = 0xFF0000;
				arg0.field854 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field851 = 0xFFFFFF;
				arg0.field854 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field325 == 0) {
				arg0.field854 = "";
			} else {
				String var15;
				if (field453 == 0) {
					var15 = "earlier today";
				} else if (field453 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field453 + " days ago";
				}

				arg0.field854 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field248 == 0) {
				arg0.field854 = "0 unread messages";
				arg0.field851 = 0xFFFF00;
			}

			if (field248 == 1) {
				arg0.field854 = "1 unread message";
				arg0.field851 = 0xFF00;
			}

			if (field248 > 1) {
				arg0.field854 = field248 + " unread messages";
				arg0.field851 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field406 == 201) {
				if (field296 == 1) {
					arg0.field854 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field854 = "";
				}
			} else if (field406 == 200) {
				arg0.field854 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field406 == 0) {
					var16 = "Earlier today";
				} else if (field406 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field406 + " days ago";
				}

				arg0.field854 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field406 == 201) {
				if (field296 == 1) {
					arg0.field854 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field854 = "";
				}
			} else if (field406 == 200) {
				arg0.field854 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field854 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field406 == 201) {
				if (field296 == 1) {
					arg0.field854 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field854 = "";
				}
			} else if (field406 == 200) {
				arg0.field854 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field854 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method54(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field396; var3++) {
				if (field275[var3] == arg0) {
					field396--;
					field429 = true;

					for (int var4 = var3; var4 < field396; var4++) {
						field513[var4] = field513[var4 + 1];
						field138[var4] = field138[var4 + 1];
						field275[var4] = field275[var4 + 1];
					}

					field281.method444(222);
					field281.method451(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method55() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field262 != -1 && field262 == field213) {
				if (var1 == 8 && field361.length() > 0) {
					field361 = field361.substring(0, field361.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field361.length() < 12) {
					field361 = field361 + (char) var1;
				}
			} else if (field294) {
				if (var1 >= 32 && var1 <= 122 && field153.length() < 80) {
					field153 = field153 + (char) var1;
					field362 = true;
				}

				if (var1 == 8 && field153.length() > 0) {
					field153 = field153.substring(0, field153.length() - 1);
					field362 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field294 = false;
					field362 = true;

					if (field280 == 1) {
						long var2 = VTCTQQUO.method508(field153);
						method173(var2);
					}

					if (field280 == 2 && field396 > 0) {
						long var4 = VTCTQQUO.method508(field153);
						method54(var4);
					}

					if (field280 == 3 && field153.length() > 0) {
						field281.method444(242);
						field281.method445(0);
						int var6 = field281.field1252;
						field281.method451(field239);
						CHVNTVHC.method38(field153, field281);
						field281.method454(field281.field1252 - var6);
						field153 = CHVNTVHC.method39(field153);
						field153 = ZCOZUVWP.method567(field153);
						method104(VTCTQQUO.method512(VTCTQQUO.method509(field239)), field153, 6);

						if (field311 == 2) {
							field311 = 1;
							field405 = true;
							field281.method444(4);
							field281.method445(field503);
							field281.method445(field311);
							field281.method445(field455);
						}
					}

					if (field280 == 4 && field222 < 100) {
						long var7 = VTCTQQUO.method508(field153);
						method106(var7);
					}

					if (field280 == 5 && field222 > 0) {
						long var9 = VTCTQQUO.method508(field153);
						method111(var9);
					}
				}
			} else if (field493 == 1) {
				if (var1 >= 48 && var1 <= 57 && field299.length() < 10) {
					field299 = field299 + (char) var1;
					field362 = true;
				}

				if (var1 == 8 && field299.length() > 0) {
					field299 = field299.substring(0, field299.length() - 1);
					field362 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field299.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field299);
						} catch (Exception var21) {
						}

						field281.method444(243);
						field281.method449(var11);
					}

					field493 = 0;
					field362 = true;
				}
			} else if (field493 == 2) {
				if (var1 >= 32 && var1 <= 122 && field299.length() < 12) {
					field299 = field299 + (char) var1;
					field362 = true;
				}

				if (var1 == 8 && field299.length() > 0) {
					field299 = field299.substring(0, field299.length() - 1);
					field362 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field299.length() > 0) {
						field281.method444(52);
						field281.method451(VTCTQQUO.method508(field299));
					}

					field493 = 0;
					field362 = true;
				}
			} else if (field298 == -1) {
				if (var1 >= 32 && var1 <= 122 && field344.length() < 80) {
					field344 = field344 + (char) var1;
					field362 = true;
				}

				if (var1 == 8 && field344.length() > 0) {
					field344 = field344.substring(0, field344.length() - 1);
					field362 = true;
				}

				if ((var1 == 13 || var1 == 10) && field344.length() > 0) {
					if (field103 == 2) {
						if (field344.equals("::clientdrop")) {
							method150();
						}

						if (field344.equals("::lag")) {
							method108();
						}

						if (field344.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field430.method191(2); var12++) {
								field430.method201(2, (byte) 1, var12);
							}
						}

						if (field344.equals("::fpson")) {
							field104 = true;
						}

						if (field344.equals("::fpsoff")) {
							field104 = false;
						}

						if (field344.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field394[var13].field86[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field344.startsWith("::")) {
						field281.method444(216);
						field281.method445(field344.length() - 1);
						field281.method452(field344.substring(2));
					} else {
						String var16 = field344.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field344 = field344.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field344 = field344.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field344 = field344.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field344 = field344.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field344 = field344.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field344 = field344.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field344 = field344.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field344 = field344.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field344 = field344.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field344 = field344.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field344 = field344.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field344 = field344.substring(6);
						}

						String var18 = field344.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field344 = field344.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field344 = field344.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field344 = field344.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field344 = field344.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field344 = field344.substring(6);
						}

						field281.method444(173);
						field281.method445(0);
						int var20 = field281.field1252;
						field281.method471(var19);
						field321.field1252 = 0;
						CHVNTVHC.method38(field344, field321);
						field281.method492(field321.field1251, 0, field321.field1252);
						field281.method445(var17);
						field281.method454(field281.field1252 - var20);
						field344 = CHVNTVHC.method39(field344);
						field344 = ZCOZUVWP.method567(field344);
						field378.field1232 = field344;
						field378.field1215 = var17;
						field378.field1216 = var19;
						field378.field1222 = 150;

						if (field103 == 2) {
							method104("@cr2@" + field378.field1283, field378.field1232, 2);
						} else if (field103 == 1) {
							method104("@cr1@" + field378.field1283, field378.field1232, 2);
						} else {
							method104(field378.field1283, field378.field1232, 2);
						}

						if (field503 == 2) {
							field503 = 3;
							field405 = true;
							field281.method444(4);
							field281.method445(field503);
							field281.method445(field311);
							field281.method445(field455);
						}
					}

					field344 = "";
					field362 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method56(boolean arg0) {
		method135();
		field174.method399();
		field134.method555(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field208 == 0) {
			int var4 = var3 / 2 + 80;
			field290.method242(0x75A9A9, true, field430.field590, var2 / 2, var4);
			int var5 = var3 / 2 - 20;
			field292.method242(0xFFFF00, true, "Welcome to RuneScape", var2 / 2, var5);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field135.method555(var6 - 73, var7 - 20);
			field292.method242(0xFFFFFF, true, "New User", var6, var7 + 5);
			int var8 = var2 / 2 + 80;
			field135.method555(var8 - 73, var7 - 20);
			field292.method242(0xFFFFFF, true, "Existing User", var8, var7 + 5);
		}

		if (field208 == 2) {
			int var9 = var3 / 2 - 40;
			if (field210.length() > 0) {
				field292.method242(0xFFFF00, true, field210, var2 / 2, var9 - 15);
				field292.method242(0xFFFF00, true, field211, var2 / 2, var9);
				var9 += 30;
			} else {
				field292.method242(0xFFFF00, true, field211, var2 / 2, var9 - 7);
				var9 += 30;
			}

			field292.method249(true, "Username: " + field314 + (field428 == 0 & field306 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var2 / 2 - 90, var9);
			var9 += 15;
			field292.method249(true, "Password: " + VTCTQQUO.method513(field315) + (field428 == 1 & field306 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, var2 / 2 - 88, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field135.method555(var10 - 73, var11 - 20);
				field292.method242(0xFFFFFF, true, "Login", var10, var11 + 5);
				int var12 = var2 / 2 + 80;
				field135.method555(var12 - 73, var11 - 20);
				field292.method242(0xFFFFFF, true, "Cancel", var12, var11 + 5);
			}
		}

		if (field208 == 3) {
			field292.method242(0xFFFF00, true, "Create a free account", var2 / 2, var3 / 2 - 60);
			int var13 = var3 / 2 - 35;
			field292.method242(0xFFFFFF, true, "To create a new account you need to", var2 / 2, var13);
			var13 += 15;
			field292.method242(0xFFFFFF, true, "go back to the main RuneScape webpage", var2 / 2, var13);
			var13 += 15;
			field292.method242(0xFFFFFF, true, "and choose the red 'create account'", var2 / 2, var13);
			var13 += 15;
			field292.method242(0xFFFFFF, true, "button at the top right of that page.", var2 / 2, var13);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field135.method555(var14 - 73, var15 - 20);
			field292.method242(0xFFFFFF, true, "Cancel", var14, var15 + 5);
		}

		field174.method400(171, 202, field9);

		if (field365) {
			field365 = false;
			field172.method400(0, 128, field9);
			field173.method400(371, 202, field9);
			field177.method400(265, 0, field9);
			field178.method400(265, 562, field9);
			field179.method400(171, 128, field9);
			field180.method400(171, 562, field9);
		}
	}

	@ObfuscatedName("client.a(ZIIIIIII)V")
	public final void method57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
			if (field169 && field480 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field339.method368(arg1, arg3, arg6);
			}

			if (arg4 == 1) {
				var8 = field339.method369(arg6, arg3, arg1);
			}

			if (arg4 == 2) {
				var8 = field339.method370(arg1, arg3, arg6);
			}

			if (arg4 == 3) {
				var8 = field339.method371(arg1, arg3, arg6);
			}

			if (var8 != 0) {
				int var12 = field339.method372(arg1, arg3, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field339.method359(arg1, arg6, arg3);
					BQKZHFKO var16 = BQKZHFKO.method24(var13);
					if (var16.field71) {
						field394[arg1].method30(arg6, var16.field45, var14, var15, arg3);
					}
				}

				if (arg4 == 1) {
					field339.method360(arg3, arg6, arg1);
				}

				if (arg4 == 2) {
					field339.method361(arg3, arg6, arg1);
					BQKZHFKO var17 = BQKZHFKO.method24(var13);
					if (var17.field65 + arg3 > 103 || var17.field65 + arg6 > 103 || var17.field53 + arg3 > 103 || var17.field53 + arg6 > 103) {
						return;
					}

					if (var17.field71) {
						field394[arg1].method31(var17.field45, var17.field53, arg3, var15, arg6, var17.field65);
					}
				}

				if (arg4 == 3) {
					field339.method362(arg1, arg6, arg3);
					BQKZHFKO var18 = BQKZHFKO.method24(var13);
					if (var18.field71 && var18.field36) {
						field394[arg1].method33(arg6, arg3);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field469[1][arg3][arg6] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				IJMWYKME.method274(arg0, arg3, arg2, arg5, field339, var19, field394[arg1], arg1, field317, arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILLYHLTGUG;)I")
	public final int method58(int arg0, LYHLTGUG arg1) {
		if (arg1.field838 == null || arg0 >= arg1.field838.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field838[arg0];
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
					var8 = field152[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field189[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field247[var3[var5++]];
				}

				if (var7 == 4) {
					LYHLTGUG var10 = LYHLTGUG.field839[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < MHOZCPTF.field922 && (!MHOZCPTF.method322(var11).field917 || field168)) {
						for (int var12 = 0; var12 < var10.field843.length; var12++) {
							if (var11 + 1 == var10.field843[var12]) {
								var8 += var10.field796[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field251[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field407[field189[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field251[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field378.field1275;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < BLHISNVT.field32; var13++) {
						if (BLHISNVT.field34[var13]) {
							var8 += field189[var13];
						}
					}
				}

				if (var7 == 10) {
					LYHLTGUG var14 = LYHLTGUG.field839[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < MHOZCPTF.field922 && (!MHOZCPTF.method322(var15).field917 || field168)) {
						for (int var16 = 0; var16 < var14.field843.length; var16++) {
							if (var14.field843[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field185;
				}

				if (var7 == 12) {
					var8 = field136;
				}

				if (var7 == 13) {
					int var17 = field251[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					UNSYPSHF var20 = UNSYPSHF.field1291[var19];
					int var21 = var20.field1293;
					int var22 = var20.field1294;
					int var23 = var20.field1295;
					int var24 = field158[var23 - var22];
					var8 = field251[var21] >> var22 & var24;
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
					var8 = (field378.field1235 >> 7) + field224;
				}

				if (var7 == 19) {
					var8 = (field378.field1236 >> 7) + field225;
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

	@ObfuscatedName("client.a([BIB)Z")
	public final boolean method59(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.f(I)V")
	public final void method60() {
		try {
			int var1 = field378.field1235 + field333;
			int var2 = field378.field1236 + field93;
			if (field483 - var1 < -500 || field483 - var1 > 500 || field484 - var2 < -500 || field484 - var2 > 500) {
				field483 = var1;
				field484 = var2;
			}

			if (field483 != var1) {
				field483 += (var1 - field483) / 16;
			}

			if (field484 != var2) {
				field484 += (var2 - field484) / 16;
			}

			if (field27[1] == 1) {
				field101 += (-field101 - 24) / 2;
			} else if (field27[2] == 1) {
				field101 += (24 - field101) / 2;
			} else {
				field101 /= 2;
			}

			if (field27[3] == 1) {
				field102 += (12 - field102) / 2;
			} else if (field27[4] == 1) {
				field102 += (-field102 - 12) / 2;
			} else {
				field102 /= 2;
			}

			field100 = field101 / 2 + field100 & 0x7FF;
			field99 += field102 / 2;
			if (field99 < 128) {
				field99 = 128;
			}

			if (field99 > 383) {
				field99 = 383;
			}

			int var3 = field483 >> 7;
			int var4 = field484 >> 7;
			int var5 = method72(field484, field483, field480);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field480;
						if (var9 < 3 && (field469[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field317[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			field140++;
			if (field140 > 184) {
				field140 = 0;
				field281.method444(129);
				field281.method446(12882);
			}

			int var11 = var6 * 192;
			if (var11 > 98048) {
				var11 = 98048;
			}

			if (var11 < 32768) {
				var11 = 32768;
			}

			if (var11 > field302) {
				field302 += (var11 - field302) / 24;
			} else if (var11 < field302) {
				field302 += (var11 - field302) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field378.field1235 + "," + field378.field1236 + "," + field483 + "," + field484 + "," + field487 + "," + field488 + "," + field224 + "," + field225);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(ILUAWAYCTK;I)V")
	public final void method61(UAWAYCTK arg0, int arg1) {
		arg0.method465();
		int var3 = arg0.method466(8);
		if (var3 < field323) {
			for (int var4 = var3; var4 < field323; var4++) {
				field261[field260++] = field324[var4];
			}
		}

		if (var3 > field323) {
			signlink.reporterror(field314 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field323 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field324[var5];
			JKNLPRIU var7 = field322[var6];
			int var8 = arg0.method466(1);
			if (var8 == 0) {
				field324[field323++] = var6;
				var7.field1245 = field306;
			} else {
				int var9 = arg0.method466(2);
				if (var9 == 0) {
					field324[field323++] = var6;
					var7.field1245 = field306;
					field418[field417++] = var6;
				} else if (var9 == 1) {
					field324[field323++] = var6;
					var7.field1245 = field306;
					int var10 = arg0.method466(3);
					var7.method439(false, var10);
					int var11 = arg0.method466(1);
					if (var11 == 1) {
						field418[field417++] = var6;
					}
				} else if (var9 == 2) {
					field324[field323++] = var6;
					var7.field1245 = field306;
					int var12 = arg0.method466(3);
					var7.method439(true, var12);
					int var13 = arg0.method466(3);
					var7.method439(true, var13);
					int var14 = arg0.method466(1);
					if (var14 == 1) {
						field418[field417++] = var6;
					}
				} else if (var9 == 3) {
					field261[field260++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method62(int arg0) {
		if (arg0 >= 0) {
			if (field493 != 0) {
				field493 = 0;
				field362 = true;
			}

			int var2 = field218[arg0];
			int var3 = field219[arg0];
			int var4 = field220[arg0];
			int var5 = field221[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 406 || var4 == 853) {
				String var6 = field267[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					var6 = var6.substring(var7 + 5).trim();
					String var8 = VTCTQQUO.method512(VTCTQQUO.method509(VTCTQQUO.method508(var6)));
					boolean var9 = false;
					for (int var10 = 0; var10 < field415; var10++) {
						UFGXOLGK var11 = field414[field416[var10]];
						if (var11 != null && var11.field1283 != null && var11.field1283.equalsIgnoreCase(var8)) {
							method71(var11.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var11.field1229[0], 2);

							if (var4 == 406) {
								field281.method444(218);
								field281.method480(field416[var10]);
							}

							if (var4 == 853) {
								field281.method444(170);
								field281.method481(field416[var10]);
							}

							var9 = true;
							break;
						}
					}

					if (!var9) {
						method104("", "Unable to find " + var8, 0);
					}
				}
			}

			if (var4 == 842) {
				field281.method444(149);
				field281.method481(var5);
				field281.method480(var3);
				field281.method479(var2);
				field190 = 0;
				field191 = var3;
				field192 = var2;
				field193 = 2;
				if (LYHLTGUG.field839[var3].field806 == field262) {
					field193 = 1;
				}

				if (LYHLTGUG.field839[var3].field806 == field298) {
					field193 = 3;
				}
			}

			if (var4 == 532) {
				field281.method444(35);
				field281.method446(var2);
				field281.method480(var5);
				field281.method446(var3);
				field190 = 0;
				field191 = var3;
				field192 = var2;
				field193 = 2;
				if (LYHLTGUG.field839[var3].field806 == field262) {
					field193 = 1;
				}

				if (LYHLTGUG.field839[var3].field806 == field298) {
					field193 = 3;
				}
			}

			if (var4 == 153) {
				JKNLPRIU var12 = field322[var5];
				if (var12 != null) {
					method71(var12.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var12.field1229[0], 2);
					field380 = field24;
					field381 = field25;
					field383 = 2;
					field382 = 0;
					field281.method444(36);
					field281.method479(var5);
				}
			}

			if (var4 == 69) {
				field281.method444(44);
				field281.method480(var3);
				field281.method446(var2);
				field281.method479(var5);
				field190 = 0;
				field191 = var3;
				field192 = var2;
				field193 = 2;
				if (LYHLTGUG.field839[var3].field806 == field262) {
					field193 = 1;
				}

				if (LYHLTGUG.field839[var3].field806 == field298) {
					field193 = 3;
				}
			}

			if (var4 == 904) {
				if (field504) {
					field339.method380(var2 - 4, var3 - 4);
				} else {
					field339.method380(field24 - 4, field25 - 4);
				}
			}

			if (var4 == 118) {
				field281.method444(209);
				field281.method446(var3);
				field281.method480(var5);
				field281.method481(var2);
				field190 = 0;
				field191 = var3;
				field192 = var2;
				field193 = 2;
				if (LYHLTGUG.field839[var3].field806 == field262) {
					field193 = 1;
				}

				if (LYHLTGUG.field839[var3].field806 == field298) {
					field193 = 3;
				}
			}

			if (var4 == 35) {
				field281.method444(88);
				field281.method481(var5);
				field281.method479(var3);
				field281.method479(var2);
				field190 = 0;
				field191 = var3;
				field192 = var2;
				field193 = 2;
				if (LYHLTGUG.field839[var3].field806 == field262) {
					field193 = 1;
				}

				if (LYHLTGUG.field839[var3].field806 == field298) {
					field193 = 3;
				}
			}

			if (var4 == 775) {
				field281.method444(192);
				field281.method481(var2);
				field281.method446(var3);
				field281.method446(var5);
				field281.method479(field125);
				field190 = 0;
				field191 = var3;
				field192 = var2;
				field193 = 2;
				if (LYHLTGUG.field839[var3].field806 == field262) {
					field193 = 1;
				}

				if (LYHLTGUG.field839[var3].field806 == field298) {
					field193 = 3;
				}
			}

			if (var4 == 978) {
				method143();
			}

			if (var4 == 749) {
				JKNLPRIU var13 = field322[var5];
				if (var13 != null) {
					method71(var13.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var13.field1229[0], 2);
					field380 = field24;
					field381 = field25;
					field383 = 2;
					field382 = 0;
					field128 += var5;
					if (field128 >= 134) {
						field281.method444(99);
						field281.method449(0);
						field128 = 0;
					}

					field281.method444(136);
					field281.method480(var5);
				}
			}

			if (var4 == 863) {
				UFGXOLGK var14 = field414[var5];
				if (var14 != null) {
					method71(var14.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var14.field1229[0], 2);
					field380 = field24;
					field381 = field25;
					field383 = 2;
					field382 = 0;
					field281.method444(113);
					field281.method481(var5);
					field281.method481(field435);
					field281.method446(field436);
					field281.method479(field434);
				}
			}

			if (var4 == 551) {
				method110(var2, var5, var3);
				field281.method444(9);
				field281.method446(field225 + var3);
				field281.method446(var5 >> 14 & 0x7FFF);
				field281.method480(field224 + var2);
			}

			if (var4 == 734) {
				field281.method444(153);
				field281.method446(var3);
				LYHLTGUG var15 = LYHLTGUG.field839[var3];
				if (var15.field838 != null && var15.field838[0][0] == 5) {
					int var16 = var15.field838[0][1];
					field251[var16] = 1 - field251[var16];
					method165(var16);
					field429 = true;
				}
			}

			if (var4 == 14) {
				boolean var17 = method71(var2, false, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
				if (!var17) {
					method71(var2, false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
				}

				field380 = field24;
				field381 = field25;
				field383 = 2;
				field382 = 0;
				field281.method444(198);
				field281.method479(var5);
				field281.method480(field225 + var3);
				field281.method479(field224 + var2);
			}

			if (var4 == 761 || var4 == 157 || var4 == 280 || var4 == 279) {
				String var19 = field267[arg0];
				int var20 = var19.indexOf("@whi@");
				if (var20 != -1) {
					long var21 = VTCTQQUO.method508(var19.substring(var20 + 5).trim());
					if (var4 == 761) {
						method173(var21);
					}

					if (var4 == 157) {
						method106(var21);
					}

					if (var4 == 280) {
						method54(var21);
					}

					if (var4 == 279) {
						method111(var21);
					}
				}
			}

			if (var4 == 186) {
				boolean var23 = method71(var2, false, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
				if (!var23) {
					method71(var2, false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
				}

				field380 = field24;
				field381 = field25;
				field383 = 2;
				field382 = 0;
				field281.method444(114);
				field281.method446(var5);
				field281.method446(field225 + var3);
				field281.method446(field224 + var2);
			}

			if (var4 == 1822) {
				JKNLPRIU var25 = field322[var5];
				if (var25 != null) {
					JKAPIYZO var26 = var25.field750;
					if (var26.field720 != null) {
						var26 = var26.method282();
					}

					if (var26 != null) {
						String var27;
						if (var26.field714 == null) {
							var27 = "It's a " + var26.field716 + ".";
						} else {
							var27 = new String(var26.field714);
						}

						method104("", var27, 0);
					}
				}
			}

			if (var4 == 915) {
				boolean var28 = method71(var2, false, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
				if (!var28) {
					method71(var2, false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
				}

				field380 = field24;
				field381 = field25;
				field383 = 2;
				field382 = 0;

				if ((var3 & 0x3) == 0) {
					field445++;
				}

				if (field445 >= 149) {
					field281.method444(244);
					field281.method445(161);
					field445 = 0;
				}

				field281.method444(109);
				field281.method481(field225 + var3);
				field281.method479(var5);
				field281.method446(field224 + var2);
			}

			if (var4 == 1969) {
				MHOZCPTF var30 = MHOZCPTF.method322(var5);
				LYHLTGUG var31 = LYHLTGUG.field839[var3];
				String var32;
				if (var31 != null && var31.field796[var2] >= 100000) {
					var32 = var31.field796[var2] + " x " + var30.field886;
				} else if (var30.field911 == null) {
					var32 = "It's a " + var30.field886 + ".";
				} else {
					var32 = new String(var30.field911);
				}

				method104("", var32, 0);
			}

			if (var4 == 870) {
				LYHLTGUG var33 = LYHLTGUG.field839[var3];
				field124 = 1;
				field125 = var3;
				field126 = var33.field805;
				field433 = 0;
				field429 = true;
				String var34 = var33.field856;
				if (var34.indexOf(" ") != -1) {
					var34 = var34.substring(0, var34.indexOf(" "));
				}

				String var35 = var33.field856;
				if (var35.indexOf(" ") != -1) {
					var35 = var35.substring(var35.indexOf(" ") + 1);
				}

				field127 = var34 + " " + var33.field845 + " " + var35;

				if (field126 == 16) {
					field429 = true;
					field105 = 3;
					field401 = true;
				}
			} else {
				if (var4 == 194) {
					String var36 = field267[arg0];
					int var37 = var36.indexOf("@whi@");
					if (var37 != -1) {
						if (field262 == -1) {
							method143();
							field361 = var36.substring(var37 + 5).trim();
							field441 = false;

							for (int var38 = 0; var38 < LYHLTGUG.field839.length; var38++) {
								if (LYHLTGUG.field839[var38] != null && LYHLTGUG.field839[var38].field828 == 600) {
									field213 = field262 = LYHLTGUG.field839[var38].field806;
									break;
								}
							}
						} else {
							method104("", "Please close the interface you have open before using 'report abuse'", 0);
						}
					}
				}

				if (var4 == 534) {
					boolean var39 = method71(var2, false, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
					if (!var39) {
						method71(var2, false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
					}

					field380 = field24;
					field381 = field25;
					field383 = 2;
					field382 = 0;
					field281.method444(30);
					field281.method446(field225 + var3);
					field281.method446(field436);
					field281.method480(field435);
					field281.method479(var5);
					field281.method480(field224 + var2);
					field281.method481(field434);
				}

				if (var4 == 457) {
					JKNLPRIU var41 = field322[var5];
					if (var41 != null) {
						method71(var41.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var41.field1229[0], 2);
						field380 = field24;
						field381 = field25;
						field383 = 2;
						field382 = 0;
						field281.method444(228);
						field281.method479(var5);
					}
				}

				if (var4 == 102 && method110(var2, var5, var3)) {
					field281.method444(96);
					field281.method480(field434);
					field281.method479(var5 >> 14 & 0x7FFF);
					field281.method446(field435);
					field281.method480(field225 + var3);
					field281.method481(field436);
					field281.method446(field224 + var2);
				}

				if (var4 == 698) {
					method110(var2, var5, var3);
					field281.method444(134);
					field281.method480(field225 + var3);
					field281.method481(var5 >> 14 & 0x7FFF);
					field281.method480(field224 + var2);
				}

				if (var4 == 222) {
					UFGXOLGK var42 = field414[var5];
					if (var42 != null) {
						method71(var42.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var42.field1229[0], 2);
						field380 = field24;
						field381 = field25;
						field383 = 2;
						field382 = 0;
						field281.method444(139);
						field281.method446(var5);
						field281.method480(field125);
					}
				}

				if (var4 == 255 && method110(var2, var5, var3)) {
					field281.method444(183);
					field281.method480(var5 >> 14 & 0x7FFF);
					field281.method481(field125);
					field281.method479(field225 + var3);
					field281.method481(field224 + var2);
				}

				if (var4 == 73) {
					String var43 = field267[arg0];
					int var44 = var43.indexOf("@whi@");
					if (var44 != -1) {
						long var45 = VTCTQQUO.method508(var43.substring(var44 + 5).trim());
						int var47 = -1;
						for (int var48 = 0; var48 < field396; var48++) {
							if (field275[var48] == var45) {
								var47 = var48;
								break;
							}
						}

						if (var47 != -1 && field138[var47] > 0) {
							field362 = true;
							field493 = 0;
							field294 = true;
							field153 = "";
							field280 = 3;
							field239 = field275[var47];
							field263 = "Enter message to send to " + field513[var47];
						}
					}
				}

				if (var4 == 568) {
					method110(var2, var5, var3);
					field281.method444(148);
					field281.method481(field224 + var2);
					field281.method481(var5 >> 14 & 0x7FFF);
					field281.method480(field225 + var3);
				}

				if (var4 == 962) {
					UFGXOLGK var49 = field414[var5];
					if (var49 != null) {
						method71(var49.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var49.field1229[0], 2);
						field380 = field24;
						field381 = field25;
						field383 = 2;
						field382 = 0;
						field216 += var5;
						if (field216 >= 107) {
							field281.method444(11);
							field216 = 0;
						}

						field281.method444(50);
						field281.method480(var5);
					}
				}

				if (var4 == 208) {
					field281.method444(15);
					field281.method446(field434);
					field281.method481(field436);
					field281.method480(var3);
					field281.method481(field435);
					field281.method480(var5);
					field281.method446(var2);
					field190 = 0;
					field191 = var3;
					field192 = var2;
					field193 = 2;
					if (LYHLTGUG.field839[var3].field806 == field262) {
						field193 = 1;
					}

					if (LYHLTGUG.field839[var3].field806 == field298) {
						field193 = 3;
					}
				}

				if (var4 == 267) {
					UFGXOLGK var50 = field414[var5];
					if (var50 != null) {
						method71(var50.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var50.field1229[0], 2);
						field380 = field24;
						field381 = field25;
						field383 = 2;
						field382 = 0;
						field281.method444(170);
						field281.method481(var5);
					}
				}

				if (var4 == 187) {
					UFGXOLGK var51 = field414[var5];
					if (var51 != null) {
						method71(var51.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var51.field1229[0], 2);
						field380 = field24;
						field381 = field25;
						field383 = 2;
						field382 = 0;
						field281.method444(241);
						field281.method481(var5);
					}
				}

				if (var4 == 1554) {
					int var52 = var5 >> 14 & 0x7FFF;
					BQKZHFKO var53 = BQKZHFKO.method24(var52);
					String var54;
					if (var53.field63 == null) {
						var54 = "It's a " + var53.field50 + ".";
					} else {
						var54 = new String(var53.field63);
					}

					method104("", var54, 0);
				}

				if (var4 == 650) {
					field281.method444(250);
					field281.method481(var2);
					field281.method481(var5);
					field281.method479(var3);
					field190 = 0;
					field191 = var3;
					field192 = var2;
					field193 = 2;
					if (LYHLTGUG.field839[var3].field806 == field262) {
						field193 = 1;
					}

					if (LYHLTGUG.field839[var3].field806 == field298) {
						field193 = 3;
					}
				}

				if (var4 == 821) {
					field281.method444(64);
					field281.method446(var5);
					field281.method481(var3);
					field281.method480(var2);
					field190 = 0;
					field191 = var3;
					field192 = var2;
					field193 = 2;
					if (LYHLTGUG.field839[var3].field806 == field262) {
						field193 = 1;
					}

					if (LYHLTGUG.field839[var3].field806 == field298) {
						field193 = 3;
					}
				}

				if (var4 == 1892) {
					MHOZCPTF var55 = MHOZCPTF.method322(var5);
					String var56;
					if (var55.field911 == null) {
						var56 = "It's a " + var55.field886 + ".";
					} else {
						var56 = new String(var55.field911);
					}

					method104("", var56, 0);
				}

				if (var4 == 479) {
					field281.method444(135);
					field281.method481(var5);
					field281.method480(var2);
					field281.method481(var3);
					field190 = 0;
					field191 = var3;
					field192 = var2;
					field193 = 2;
					if (LYHLTGUG.field839[var3].field806 == field262) {
						field193 = 1;
					}

					if (LYHLTGUG.field839[var3].field806 == field298) {
						field193 = 3;
					}
				}

				if (var4 == 681) {
					field433 = 1;
					field434 = var2;
					field435 = var3;
					field436 = var5;
					field437 = MHOZCPTF.method322(var5).field886;
					field124 = 0;
					field429 = true;
				} else {
					if (var4 == 861) {
						field106 = -1;
						field362 = true;
					}

					if (var4 == 597) {
						field281.method444(153);
						field281.method446(var3);
						LYHLTGUG var57 = LYHLTGUG.field839[var3];
						if (var57.field838 != null && var57.field838[0][0] == 5) {
							int var58 = var57.field838[0][1];
							if (field251[var58] != var57.field829[0]) {
								field251[var58] = var57.field829[0];
								method165(var58);
								field429 = true;
							}
						}
					}

					if (var4 == 1500) {
						method110(var2, var5, var3);
						field281.method444(111);
						field281.method479(field225 + var3);
						field281.method479(field224 + var2);
						field281.method479(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 217 && !field442) {
						field281.method444(189);
						field281.method446(var3);
						field442 = true;
					}

					if (var4 == 951) {
						LYHLTGUG var59 = LYHLTGUG.field839[var3];
						boolean var60 = true;
						if (var59.field828 > 0) {
							var60 = method167(var59);
						}

						if (var60) {
							field281.method444(153);
							field281.method446(var3);
						}
					}

					if (var4 == 610) {
						JKNLPRIU var61 = field322[var5];
						if (var61 != null) {
							method71(var61.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var61.field1229[0], 2);
							field380 = field24;
							field381 = field25;
							field383 = 2;
							field382 = 0;
							field281.method444(142);
							field281.method446(var5);
							field281.method446(field125);
						}
					}

					if (var4 == 397) {
						JKNLPRIU var62 = field322[var5];
						if (var62 != null) {
							method71(var62.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var62.field1229[0], 2);
							field380 = field24;
							field381 = field25;
							field383 = 2;
							field382 = 0;
							field281.method444(204);
							field281.method481(field435);
							field281.method480(field434);
							field281.method446(field436);
							field281.method481(var5);
						}
					}

					if (var4 == 468) {
						boolean var63 = method71(var2, false, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
						if (!var63) {
							method71(var2, false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
						}

						field380 = field24;
						field381 = field25;
						field383 = 2;
						field382 = 0;
						field281.method444(246);
						field281.method479(var5);
						field281.method446(field225 + var3);
						field281.method480(field125);
						field281.method480(field224 + var2);
					}

					if (var4 == 149) {
						field281.method444(172);
						field281.method446(var2);
						field281.method481(var3);
						field281.method479(var5);
						field190 = 0;
						field191 = var3;
						field192 = var2;
						field193 = 2;
						if (LYHLTGUG.field839[var3].field806 == field262) {
							field193 = 1;
						}

						if (LYHLTGUG.field839[var3].field806 == field298) {
							field193 = 3;
						}
					}

					if (var4 == 684) {
						if ((var2 & 0x3) == 0) {
							field284++;
						}

						if (field284 >= 99) {
							field281.method444(119);
							field284 = 0;
						}

						field281.method444(76);
						field281.method480(var5);
						field281.method481(var3);
						field281.method479(var2);
						field190 = 0;
						field191 = var3;
						field192 = var2;
						field193 = 2;
						if (LYHLTGUG.field839[var3].field806 == field262) {
							field193 = 1;
						}

						if (LYHLTGUG.field839[var3].field806 == field298) {
							field193 = 3;
						}
					}

					if (var4 == 401) {
						boolean var65 = method71(var2, false, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
						if (!var65) {
							method71(var2, false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
						}

						field380 = field24;
						field381 = field25;
						field383 = 2;
						field382 = 0;
						field440++;
						if (field440 >= 128) {
							field281.method444(146);
							field281.method445(124);
							field440 = 0;
						}

						field281.method444(144);
						field281.method481(var5);
						field281.method446(field225 + var3);
						field281.method479(field224 + var2);
					}

					if (var4 == 560) {
						JKNLPRIU var67 = field322[var5];
						if (var67 != null) {
							method71(var67.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var67.field1229[0], 2);
							field380 = field24;
							field381 = field25;
							field383 = 2;
							field382 = 0;
							field281.method444(247);
							field281.method479(var5);
						}
					}

					if (var4 == 634) {
						UFGXOLGK var68 = field414[var5];
						if (var68 != null) {
							method71(var68.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var68.field1229[0], 2);
							field380 = field24;
							field381 = field25;
							field383 = 2;
							field382 = 0;
							field281.method444(218);
							field281.method480(var5);
						}
					}

					if (var4 == 275) {
						UFGXOLGK var69 = field414[var5];
						if (var69 != null) {
							method71(var69.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var69.field1229[0], 2);
							field380 = field24;
							field381 = field25;
							field383 = 2;
							field382 = 0;
							field281.method444(23);
							field281.method480(var5);
						}
					}

					if (var4 == 388) {
						method110(var2, var5, var3);
						field281.method444(226);
						field281.method479(field224 + var2);
						field281.method479(field225 + var3);
						field281.method479(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 109) {
						boolean var70 = method71(var2, false, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
						if (!var70) {
							method71(var2, false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var3, 2);
						}

						field380 = field24;
						field381 = field25;
						field383 = 2;
						field382 = 0;
						field281.method444(47);
						field281.method480(var5);
						field281.method479(field225 + var3);
						field281.method481(field224 + var2);
					}

					if (var4 == 735) {
						JKNLPRIU var72 = field322[var5];
						if (var72 != null) {
							method71(var72.field1228[0], false, 1, 1, 0, field378.field1229[0], field378.field1228[0], 0, 0, var72.field1229[0], 2);
							field380 = field24;
							field381 = field25;
							field383 = 2;
							field382 = 0;
							field281.method444(2);
							field281.method446(var5);
						}
					}

					field433 = 0;
					field124 = 0;
					field429 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method63(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(LUAWAYCTK;BI)V")
	public final void method64(UAWAYCTK arg0, int arg1) {
		for (int var3 = 0; var3 < field417; var3++) {
			int var4 = field418[var3];
			UFGXOLGK var5 = field414[var4];
			int var6 = arg0.method455();
			if ((var6 & 0x20) != 0) {
				var6 += arg0.method455() << 8;
			}

			method90(var6, var5, var4, arg0);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method65() {
		byte[] var1 = field508.method424("title.dat", null);
		IBHVCUAH var2 = new IBHVCUAH(var1, this);
		field175.method399();
		var2.method230(0, 0);
		field176.method399();
		var2.method230(-637, 0);
		field172.method399();
		var2.method230(-128, 0);
		field173.method399();
		var2.method230(-202, -371);
		field174.method399();
		var2.method230(-202, -171);
		field177.method399();
		var2.method230(0, -265);
		field178.method399();
		var2.method230(-562, -265);
		field179.method399();
		var2.method230(-128, -171);
		field180.method399();
		var2.method230(-562, -171);
		int[] var3 = new int[var2.field653];
		for (int var4 = 0; var4 < var2.field654; var4++) {
			for (int var5 = 0; var5 < var2.field653; var5++) {
				var3[var5] = var2.field652[var2.field653 * var4 + var2.field653 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field653; var6++) {
				var2.field652[var2.field653 * var4 + var6] = var3[var6];
			}
		}

		field175.method399();
		var2.method230(382, 0);
		field176.method399();
		var2.method230(-255, 0);
		field172.method399();
		var2.method230(254, 0);
		field173.method399();
		var2.method230(180, -371);
		field174.method399();
		var2.method230(180, -171);
		field177.method399();
		var2.method230(382, -265);
		field178.method399();
		var2.method230(-180, -265);
		field179.method399();
		var2.method230(254, -171);
		field180.method399();
		var2.method230(-180, -171);
		IBHVCUAH var7 = new IBHVCUAH(field508, "logo", 0);
		field172.method399();
		var7.method232(382 - var7.field653 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.c(II)V")
	public final void method66(int arg0, int arg1) {
		URASIGRB var3 = field512[field480][arg0][arg1];
		if (var3 == null) {
			field339.method363(field480, arg0, arg1);
		} else {
			int var4 = -99999999;
			KWSTKWPH var5 = null;
			for (KWSTKWPH var6 = (KWSTKWPH) var3.method503(); var6 != null; var6 = (KWSTKWPH) var3.method505()) {
				MHOZCPTF var7 = MHOZCPTF.method322(var6.field774);
				int var8 = var7.field902;
				if (var7.field914) {
					var8 = (var6.field775 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method501(var5);
			KWSTKWPH var9 = null;
			KWSTKWPH var10 = null;
			for (KWSTKWPH var11 = (KWSTKWPH) var3.method503(); var11 != null; var11 = (KWSTKWPH) var3.method505()) {
				if (var5.field774 != var11.field774 && var9 == null) {
					var9 = var11;
				}

				if (var5.field774 != var11.field774 && var9.field774 != var11.field774 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field339.method349(arg0, var12, method72(arg1 * 128 + 64, arg0 * 128 + 64, field480), arg1, var9, var5, var10, field480);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method67(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field210 = "";
				field211 = "Connecting to server...";
				method56(true);
			}

			field279 = new DUZSRFJE(this, method99(field167 + 43594));
			long var4 = VTCTQQUO.method508(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field281.field1252 = 0;
			field281.method445(14);
			field281.method445(var6);
			field279.method178(0, field281.field1251, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field279.method175();
			}

			int var8 = field279.method175();
			int var9 = var8;

			if (var8 == 0) {
				field279.method177(field320.field1251, 0, 8);
				field320.field1252 = 0;
				field423 = field320.method461();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field423 >> 32), (int) field423 };
				field281.field1252 = 0;
				field281.method445(10);
				field281.method449(var10[0]);
				field281.method449(var10[1]);
				field281.method449(var10[2]);
				field281.method449(var10[3]);
				field281.method449(signlink.uid);
				field281.method452(arg0);
				field281.method452(arg1);
				field281.method470(field368, field303);
				field259.field1252 = 0;

				if (arg2) {
					field259.method445(18);
				} else {
					field259.method445(16);
				}

				field259.method445(field281.field1252 + 36 + 1 + 1 + 2);
				field259.method445(255);
				field259.method446(333);
				field259.method445(field169 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field259.method449(field151[var11]);
				}

				field259.method453(field281.field1251, 0, field281.field1252);
				field281.field1256 = new VZIKSEDY(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field212 = new VZIKSEDY(var10);
				field279.method178(0, field259.field1251, field259.field1252);
				var8 = field279.method175();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method67(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field103 = field279.method175();
				field369 = field279.method175() == 1;
				field474 = 0L;
				field199 = 0;
				field165.field1347 = 0;
				field14 = true;
				field250 = true;
				field217 = true;
				field281.field1252 = 0;
				field320.field1252 = 0;
				field458 = -1;
				field340 = -1;
				field341 = -1;
				field342 = -1;
				field457 = 0;
				field459 = 0;
				field468 = 0;
				field461 = 0;
				field363 = 0;
				field110 = 0;
				field504 = false;
				field15 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field491[var13] = null;
				}

				field433 = 0;
				field124 = 0;
				field393 = 0;
				field182 = 0;
				field333 = (int) (Math.random() * 100.0D) - 50;
				field93 = (int) (Math.random() * 110.0D) - 55;
				field304 = (int) (Math.random() * 80.0D) - 40;
				field170 = (int) (Math.random() * 120.0D) - 60;
				field257 = (int) (Math.random() * 30.0D) - 20;
				field100 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field481 = 0;
				field367 = -1;
				field354 = 0;
				field355 = 0;
				field415 = 0;
				field323 = 0;

				for (int var14 = 0; var14 < field412; var14++) {
					field414[var14] = null;
					field419[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field322[var15] = null;
				}

				field378 = field414[field413] = new UFGXOLGK();
				field181.method507();
				field398.method507();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field512[var16][var17][var18] = null;
						}
					}
				}

				field408 = new URASIGRB();
				field397 = 0;
				field396 = 0;
				field106 = -1;
				field298 = -1;
				field262 = -1;
				field471 = -1;
				field492 = -1;
				field297 = -1;
				field442 = false;
				field105 = 3;
				field493 = 0;
				field504 = false;
				field294 = false;
				field338 = null;
				field249 = 0;
				field237 = -1;
				field454 = true;
				method146();

				for (int var19 = 0; var19 < 5; var19++) {
					field360[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field108[var20] = null;
					field109[var20] = false;
				}

				field445 = 0;
				field128 = 0;
				field216 = 0;
				field440 = 0;
				field284 = 0;
				method168();
			} else if (var8 == 3) {
				field210 = "";
				field211 = "Invalid username or password.";
			} else if (var8 == 4) {
				field210 = "Your account has been disabled.";
				field211 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field210 = "Your account is already logged in.";
				field211 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field210 = "RuneScape has been updated!";
				field211 = "Please reload this page.";
			} else if (var8 == 7) {
				field210 = "This world is full.";
				field211 = "Please use a different world.";
			} else if (var8 == 8) {
				field210 = "Unable to connect.";
				field211 = "Login server offline.";
			} else if (var8 == 9) {
				field210 = "Login limit exceeded.";
				field211 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field210 = "Unable to connect.";
				field211 = "Bad session id.";
			} else if (var8 == 11) {
				field210 = "Login server rejected session.";
				field211 = "Please try again.";
			} else if (var8 == 12) {
				field210 = "You need a members account to login to this world.";
				field211 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field210 = "Could not complete login.";
				field211 = "Please try using a different world.";
			} else if (var8 == 14) {
				field210 = "The server is being updated.";
				field211 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field217 = true;
				field281.field1252 = 0;
				field320.field1252 = 0;
				field458 = -1;
				field340 = -1;
				field341 = -1;
				field342 = -1;
				field457 = 0;
				field459 = 0;
				field468 = 0;
				field110 = 0;
				field504 = false;
				field328 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field210 = "Login attempts exceeded.";
				field211 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field210 = "You are standing in a members-only area.";
				field211 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field210 = "Invalid loginserver requested";
				field211 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field279.method175();
				for (var21 += 3; var21 >= 0; var21--) {
					field210 = "You have only just left another world";
					field211 = "Your profile will be transferred in: " + var21;
					method56(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method67(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field210 = "Malformed login packet.";
				field211 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field210 = "Unexpected server response";
				field211 = "Please try using a different world.";
			} else if (var9 != 0) {
				field210 = "No response from server";
				field211 = "Please try using a different world.";
			} else if (field426 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field426++;
				method67(arg0, arg1, arg2);
			} else {
				field210 = "No response from loginserver";
				field211 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field210 = "";
			field211 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Z)V")
	public final void method13(int arg0, String arg1) {
		field359 = arg0;
		field111 = arg1;
		method135();

		if (field508 == null) {
			super.method13(arg0, arg1);
		} else {
			field174.method399();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field292.method241(var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...", 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			TTGPXKMD.method433(var3 / 2 - 152, var6, 304, 0x8C1111, 34);
			TTGPXKMD.method433(var3 / 2 - 151, var6 + 1, 302, 0, 32);
			TTGPXKMD.method432(0x8C1111, var6 + 2, 30, var3 / 2 - 150, arg0 * 3);
			TTGPXKMD.method432(0, var6 + 2, 30, arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3);
			field292.method241(var4 / 2 + 5 - var5, var3 / 2, arg1, 0xFFFFFF);
			field174.method400(171, 202, field9);

			if (field365) {
				field365 = false;

				if (!field343) {
					field175.method400(0, 0, field9);
					field176.method400(0, 637, field9);
				}

				field172.method400(0, 128, field9);
				field173.method400(371, 202, field9);
				field177.method400(265, 0, field9);
				field178.method400(265, 562, field9);
				field179.method400(171, 128, field9);
				field180.method400(171, 562, field9);
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method68() {
		if (field481 == 0 && field23 == 1) {
			int var1 = field24 - 25 - 550;
			int var2 = field25 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field170 + field100 & 0x7FF;
				int var4 = JXPUZKMY.field760[var3];
				int var5 = JXPUZKMY.field761[var3];
				var4 = (field257 + 256) * var4 >> 8;
				var5 = (field257 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field378.field1235 + var6 >> 7;
				int var9 = field378.field1236 - var7 >> 7;
				boolean var10 = method71(var8, true, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var9, 1);
				if (var10) {
					field281.method445(var1);
					field281.method445(var2);
					field281.method446(field100);
					field281.method445(57);
					field281.method445(field170);
					field281.method445(field257);
					field281.method445(89);
					field281.method446(field378.field1235);
					field281.method446(field378.field1236);
					field281.method445(field223);
					field281.method445(63);
					return;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 333);

			if (arg0.length == 5) {
				field166 = Integer.parseInt(arg0[0]);
				field167 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method153();
				} else if (arg0[2].equals("highmem")) {
					method95();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field168 = false;
				} else if (arg0[3].equals("members")) {
					field168 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method1(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
	public final String method69(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.h(I)V")
	public final void method70() {
		BQKZHFKO.field60.method208();
		BQKZHFKO.field44.method208();
		JKAPIYZO.field747.method208();
		MHOZCPTF.field892.method208();
		MHOZCPTF.field904.method208();
		UFGXOLGK.field1264.method208();
		PMDEXOWJ.field1098.method208();
	}

	@ObfuscatedName("client.a(IZIIIIIIIIII)Z")
	public final boolean method71(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field476[var14][var15] = 0;
				field273[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg5;
		field476[arg6][arg5] = 99;
		field273[arg6][arg5] = 0;
		byte var18 = 0;
		int var19 = 0;
		field95[var18] = arg6;
		int var35 = var18 + 1;
		field96[var18] = arg5;
		boolean var20 = false;
		int var21 = field95.length;
		int[][] var22 = field394[field480].field86;
		while (var35 != var19) {
			var16 = field95[var19];
			var17 = field96[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}

			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && field394[field480].method34(var17, var16, arg9, arg7 - 1, arg0, arg4)) {
					var20 = true;
					break;
				}

				if (arg7 < 10 && field394[field480].method35(arg7 - 1, var17, arg0, var16, arg4, arg9)) {
					var20 = true;
					break;
				}
			}

			if (arg2 != 0 && arg3 != 0 && field394[field480].method36(arg3, arg8, arg0, arg2, var16, var17, arg9)) {
				var20 = true;
				break;
			}

			int var23 = field273[var16][var17] + 1;
			if (var16 > 0 && field476[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field95[var35] = var16 - 1;
				field96[var35] = var17;
				var35 = (var35 + 1) % var21;
				field476[var16 - 1][var17] = 2;
				field273[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field476[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field95[var35] = var16 + 1;
				field96[var35] = var17;
				var35 = (var35 + 1) % var21;
				field476[var16 + 1][var17] = 8;
				field273[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field476[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field95[var35] = var16;
				field96[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field476[var16][var17 - 1] = 1;
				field273[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field476[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field95[var35] = var16;
				field96[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field476[var16][var17 + 1] = 4;
				field273[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field476[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field95[var35] = var16 - 1;
				field96[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field476[var16 - 1][var17 - 1] = 3;
				field273[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field476[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field95[var35] = var16 + 1;
				field96[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field476[var16 + 1][var17 - 1] = 9;
				field273[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field476[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field95[var35] = var16 - 1;
				field96[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field476[var16 - 1][var17 + 1] = 6;
				field273[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field476[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field95[var35] = var16 + 1;
				field96[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field476[var16 + 1][var17 + 1] = 12;
				field273[var16 + 1][var17 + 1] = var23;
			}
		}

		field223 = 0;
		if (!var20) {
			if (arg1) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg0 - var25; var26 <= arg0 + var25; var26++) {
						for (int var27 = arg9 - var25; var27 <= arg9 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field273[var26][var27] < var24) {
								var24 = field273[var26][var27];
								var16 = var26;
								var17 = var27;
								field223 = 1;
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
		field95[var28] = var16;
		int var36 = var28 + 1;
		field96[var28] = var17;
		int var29;
		int var30 = var29 = field476[var16][var17];
		while (arg6 != var16 || arg5 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field95[var36] = var16;
				field96[var36++] = var17;
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

			var30 = field476[var16][var17];
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
		int var32 = field95[var36];
		int var33 = field96[var36];

		if (arg10 == 0) {
			field281.method444(115);
			field281.method445(var31 + var31 + 3);
		}

		if (arg10 == 1) {
			field281.method444(16);
			field281.method445(var31 + var31 + 3 + 14);
		}

		if (arg10 == 2) {
			field281.method444(251);
			field281.method445(var31 + var31 + 3);
		}

		field281.method472(field27[5] == 1 ? 1 : 0);
		field281.method446(field224 + var32);
		field354 = field95[0];
		field355 = field96[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field281.method472(field95[var36] - var32);
			field281.method472(field96[var36] - var33);
		}

		field281.method480(field225 + var33);
		return true;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method72(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field469[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field317[var6][var4][var5] + field317[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field317[var6][var4][var5 + 1] + field317[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method73() {
		if (field23 == 1) {
			if (field24 >= 539 && field24 <= 573 && field25 >= 169 && field25 < 205 && field371[0] != -1) {
				field429 = true;
				field105 = 0;
				field401 = true;
			}

			if (field24 >= 569 && field24 <= 599 && field25 >= 168 && field25 < 205 && field371[1] != -1) {
				field429 = true;
				field105 = 1;
				field401 = true;
			}

			if (field24 >= 597 && field24 <= 627 && field25 >= 168 && field25 < 205 && field371[2] != -1) {
				field429 = true;
				field105 = 2;
				field401 = true;
			}

			if (field24 >= 625 && field24 <= 669 && field25 >= 168 && field25 < 203 && field371[3] != -1) {
				field429 = true;
				field105 = 3;
				field401 = true;
			}

			if (field24 >= 666 && field24 <= 696 && field25 >= 168 && field25 < 205 && field371[4] != -1) {
				field429 = true;
				field105 = 4;
				field401 = true;
			}

			if (field24 >= 694 && field24 <= 724 && field25 >= 168 && field25 < 205 && field371[5] != -1) {
				field429 = true;
				field105 = 5;
				field401 = true;
			}

			if (field24 >= 722 && field24 <= 756 && field25 >= 169 && field25 < 205 && field371[6] != -1) {
				field429 = true;
				field105 = 6;
				field401 = true;
			}

			if (field24 >= 540 && field24 <= 574 && field25 >= 466 && field25 < 502 && field371[7] != -1) {
				field429 = true;
				field105 = 7;
				field401 = true;
			}

			if (field24 >= 572 && field24 <= 602 && field25 >= 466 && field25 < 503 && field371[8] != -1) {
				field429 = true;
				field105 = 8;
				field401 = true;
			}

			if (field24 >= 599 && field24 <= 629 && field25 >= 466 && field25 < 503 && field371[9] != -1) {
				field429 = true;
				field105 = 9;
				field401 = true;
			}

			if (field24 >= 627 && field24 <= 671 && field25 >= 467 && field25 < 502 && field371[10] != -1) {
				field429 = true;
				field105 = 10;
				field401 = true;
			}

			if (field24 >= 669 && field24 <= 699 && field25 >= 466 && field25 < 503 && field371[11] != -1) {
				field429 = true;
				field105 = 11;
				field401 = true;
			}

			if (field24 >= 696 && field24 <= 726 && field25 >= 466 && field25 < 503 && field371[12] != -1) {
				field429 = true;
				field105 = 12;
				field401 = true;
			}

			if (field24 >= 724 && field24 <= 758 && field25 >= 466 && field25 < 502 && field371[13] != -1) {
				field429 = true;
				field105 = 13;
				field401 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method74() {
		int var1 = field292.method243("Choose Option");
		for (int var2 = 0; var2 < field110; var2++) {
			int var3 = field292.method243(field267[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field110 * 15 + 21;
		if (field24 > 4 && field25 > 4 && field24 < 516 && field25 < 338) {
			int var5 = field24 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field25 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field504 = true;
			field388 = 0;
			field389 = var5;
			field390 = var6;
			field391 = var1;
			field392 = field110 * 15 + 22;
		}

		if (field24 > 553 && field25 > 205 && field24 < 743 && field25 < 466) {
			int var7 = field24 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field25 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field504 = true;
			field388 = 1;
			field389 = var7;
			field390 = var8;
			field391 = var1;
			field392 = field110 * 15 + 22;
		}

		if (field24 > 17 && field25 > 357 && field24 < 496 && field25 < 453) {
			int var9 = field24 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field25 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field504 = true;
			field388 = 2;
			field389 = var9;
			field390 = var10;
			field391 = var1;
			field392 = field110 * 15 + 22;
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method75(int arg0) {
		int[] var2 = field356.field652;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field469[arg0][var7][var5] & 0x18) == 0) {
					field339.method377(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field469[arg0 + 1][var7][var5] & 0x8) != 0) {
					field339.method377(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		field384++;
		if (field384 > 58) {
			field384 = 0;
			field281.method444(79);
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field356.method227();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field469[arg0][var11][var10] & 0x18) == 0) {
					method126(var9, var10, arg0, var8, var11);
				}

				if (arg0 < 3 && (field469[arg0 + 1][var11][var10] & 0x8) != 0) {
					method126(var9, var10, arg0 + 1, var8, var11);
				}
			}
		}

		field449.method399();
		field379++;
		if (field379 > 1279) {
			field379 = 0;
			field281.method444(93);
			field281.method445(0);
			int var12 = field281.field1252;
			field281.method446((int) (Math.random() * 65536.0D));
			field281.method445(5);
			field281.method446((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field281.method445(190);
			}

			field281.method446((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field281.method445(224);
			}

			field281.method445(142);
			field281.method445((int) (Math.random() * 256.0D));
			field281.method445((int) (Math.random() * 256.0D));
			field281.method446((int) (Math.random() * 65536.0D));
			field281.method454(field281.field1252 - var12);
		}

		field253 = 0;
		for (int var13 = 0; var13 < 104; var13++) {
			for (int var14 = 0; var14 < 104; var14++) {
				int var15 = field339.method371(field480, var13, var14);
				if (var15 != 0) {
					var15 = var15 >> 14 & 0x7FFF;
					int var16 = BQKZHFKO.method24(var15).field48;
					if (var16 >= 0) {
						int var17 = var13;
						int var18 = var14;
						if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
							byte var19 = 104;
							byte var20 = 104;
							int[][] var21 = field394[field480].field86;
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

						field90[field253] = field444[var16];
						field254[field253] = var17;
						field255[field253] = var18;
						field253++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method76() {
		if (field187 != 0) {
			int var1 = 0;
			if (field468 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field491[var2] != null) {
					int var3 = field489[var2];
					String var4 = field490[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field311 == 0 || field311 == 1 && method79(var4))) {
						int var8 = 329 - var1 * 13;
						if (field17 > 4 && field18 - 4 > var8 - 10 && field18 - 4 <= var8 + 3) {
							int var9 = field291.method243("From:  " + var4 + field491[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field17 < var9 + 4) {
								if (field103 >= 1) {
									field267[field110] = "Report abuse @whi@" + var4;
									field220[field110] = 2194;
									field110++;
								}

								field267[field110] = "Add ignore @whi@" + var4;
								field220[field110] = 2157;
								field110++;
								field267[field110] = "Add friend @whi@" + var4;
								field220[field110] = 2761;
								field110++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field311 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method77(boolean arg0) {
		if (field378.field1235 >> 7 == field354 && field378.field1236 >> 7 == field355) {
			field354 = 0;
		}

		int var2 = field415;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			UFGXOLGK var4;
			int var5;
			if (arg0) {
				var4 = field378;
				var5 = field413 << 14;
			} else {
				var4 = field414[field416[var3]];
				var5 = field416[var3] << 14;
			}

			if (var4 != null && var4.method287()) {
				var4.field1281 = false;
				if ((field169 && field415 > 50 || field415 > 200) && !arg0 && var4.field1238 == var4.field1220) {
					var4.field1281 = true;
				}

				int var6 = var4.field1235 >> 7;
				int var7 = var4.field1236 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1280 == null || field306 < var4.field1284 || field306 >= var4.field1285) {
						if ((var4.field1235 & 0x7F) == 0x40 && (var4.field1236 & 0x7F) == 0x40) {
							if (field473[var6][var7] == field289) {
								continue;
							}

							field473[var6][var7] = field289;
						}

						var4.field1267 = method72(var4.field1236, var4.field1235, field480);
						field339.method353(60, var4.field1235, var4.field1237, var5, var4.field1267, field480, var4.field1236, var4, var4.field1234);
					} else {
						var4.field1281 = false;
						var4.field1267 = method72(var4.field1236, var4.field1235, field480);
						field339.method354(var4.field1236, var5, var4.field1288, var4.field1289, 60, field480, var4.field1287, var4, var4.field1237, var4.field1286, var4.field1235, var4.field1267);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method78() {
		try {
			if (field279 != null) {
				field279.method174();
			}
		} catch (Exception var2) {
		}

		field279 = null;
		field217 = false;
		field208 = 0;
		field314 = "";
		field315 = "";
		method70();
		field339.method342();

		for (int var1 = 0; var1 < 4; var1++) {
			field394[var1].method25();
		}

		System.gc();
		method123();
		field420 = -1;
		field326 = -1;
		field183 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method79(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field396; var2++) {
			if (arg0.equalsIgnoreCase(field513[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field378.field1283)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(IZ)Ljava/lang/String;")
	public static final String method80(int arg0) {
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

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method81(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IBLUAWAYCTK;)V")
	public final void method82(int arg0, UAWAYCTK arg1) {
		arg1.method465();
		int var3 = arg1.method466(1);
		if (var3 != 0) {
			int var4 = arg1.method466(2);
			if (var4 == 0) {
				field418[field417++] = field413;
			} else if (var4 == 1) {
				int var5 = arg1.method466(3);
				field378.method439(false, var5);
				int var6 = arg1.method466(1);
				if (var6 == 1) {
					field418[field417++] = field413;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method466(3);
				field378.method439(true, var7);
				int var8 = arg1.method466(3);
				field378.method439(true, var8);
				int var9 = arg1.method466(1);
				if (var9 == 1) {
					field418[field417++] = field413;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method466(1);
				field480 = arg1.method466(2);
				int var11 = arg1.method466(7);
				int var12 = arg1.method466(1);
				if (var12 == 1) {
					field418[field417++] = field413;
				}

				int var13 = arg1.method466(7);
				field378.method441(var13, var10 == 1, var11);
			}
		}
	}

	@ObfuscatedName("client.a(BLXHDQQNIR;)V")
	public final void method83(XHDQQNIR arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field329.length; var3++) {
			field329[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field329[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field330[var9] = (field329[var9 - 1] + field329[var9 + 1] + field329[var9 - 128] + field329[var9 + 128]) / 4;
				}
			}

			int[] var10 = field329;
			field329 = field330;
			field330 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1450; var12++) {
				for (int var13 = 0; var13 < arg0.field1449; var13++) {
					if (arg0.field1447[var11++] != 0) {
						int var14 = var13 + arg0.field1451 + 16;
						int var15 = var12 + arg0.field1452 + 16;
						int var16 = (var15 << 7) + var14;
						field329[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method7() {
		if (!field366 && !field479 && !field446) {
			field306++;

			if (field217) {
				method144();
			} else {
				method132();
			}

			method166();
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method84() {
		if (field169 && field393 == 2 && IJMWYKME.field698 != field480) {
			field449.method399();
			field291.method241(151, 257, "Loading - please wait.", 0);
			field291.method241(150, 256, "Loading - please wait.", 0xFFFFFF);
			field449.method400(4, 4, field9);
			field393 = 1;
			field328 = System.currentTimeMillis();
		}

		if (field393 == 1) {
			int var1 = method85();
			if (var1 != 0 && System.currentTimeMillis() - field328 > 360000L) {
				signlink.reporterror(field314 + " glcfb " + field423 + "," + var1 + "," + field169 + "," + field385[0] + "," + field430.method204() + "," + field480 + "," + field487 + "," + field488);
				field328 = System.currentTimeMillis();
			}
		}

		if (field393 == 2 && field480 != field367) {
			field367 = field480;
			method75(field480);
		}
	}

	@ObfuscatedName("client.i(Z)I")
	public final int method85() {
		for (int var1 = 0; var1 < field139.length; var1++) {
			if (field139[var1] == null && field241[var1] != -1) {
				return -1;
			}

			if (field443[var1] == null && field242[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field139.length; var3++) {
			byte[] var4 = field443[var3];
			if (var4 != null) {
				int var5 = (field240[var3] >> 8) * 64 - field224;
				int var6 = (field240[var3] & 0xFF) * 64 - field225;
				if (field438) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= IJMWYKME.method270(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field244) {
			return -4;
		} else {
			field393 = 2;
			IJMWYKME.field698 = field480;
			method160();
			field281.method444(14);
			return 0;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method86() {
		field450.method399();
		JXPUZKMY.field762 = field402;
		field278.method555(0, 0);

		if (field294) {
			field292.method241(40, 239, field263, 0);
			field292.method241(60, 239, field153 + "*", 128);
		} else if (field493 == 1) {
			field292.method241(40, 239, "Enter amount:", 0);
			field292.method241(60, 239, field299 + "*", 128);
		} else if (field493 == 2) {
			field292.method241(40, 239, "Enter name:", 0);
			field292.method241(60, 239, field299 + "*", 128);
		} else if (field338 != null) {
			field292.method241(40, 239, field338, 0);
			field292.method241(60, 239, "Click to continue", 128);
		} else if (field298 != -1) {
			method130(0, 0, LYHLTGUG.field839[field298], 0);
		} else if (field106 == -1) {
			IDBGYHWK var1 = field291;
			int var2 = 0;
			TTGPXKMD.method429(0, 463, 77, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field491[var3] != null) {
					int var4 = field489[var3];
					int var5 = field352 + 70 - var2 * 14;
					String var6 = field490[var3];
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
							var1.method245(0, 4, var5, field491[var3]);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field503 == 0 || field503 == 1 && method79(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field439[0].method555(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field439[1].method555(var8, var5 - 12);
								var8 += 14;
							}

							var1.method245(0, var8, var5, var6 + ":");
							var8 += var1.method243(var6) + 8;
							var1.method245(255, var8, var5, field491[var3]);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field187 == 0 && (var4 == 7 || field311 == 0 || field311 == 1 && method79(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method245(0, var9, var5, "From");
							int var11 = var9 + var1.method243("From ");
							if (var7 == 1) {
								field439[0].method555(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field439[1].method555(var11, var5 - 12);
								var11 += 14;
							}

							var1.method245(0, var11, var5, var6 + ":");
							var11 += var1.method243(var6) + 8;
							var1.method245(0x800000, var11, var5, field491[var3]);
						}

						var2++;
					}

					if (var4 == 4 && (field455 == 0 || field455 == 1 && method79(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method245(0x800080, 4, var5, var6 + " " + field491[var3]);
						}

						var2++;
					}

					if (var4 == 5 && field187 == 0 && field311 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method245(0x800000, 4, var5, field491[var3]);
						}

						var2++;
					}

					if (var4 == 6 && field187 == 0 && field311 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method245(0, 4, var5, "To " + var6 + ":");
							var1.method245(0x800000, var1.method243("To " + var6) + 12, var5, field491[var3]);
						}

						var2++;
					}

					if (var4 == 8 && (field455 == 0 || field455 == 1 && method79(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method245(0x7E3200, 4, var5, var6 + " " + field491[var3]);
						}

						var2++;
					}
				}
			}

			TTGPXKMD.method428();
			field155 = var2 * 14 + 7;
			if (field155 < 78) {
				field155 = 78;
			}

			method155(field155, 77, 0, 463, field155 - field352 - 77);
			String var10;
			if (field378 == null || field378.field1283 == null) {
				var10 = VTCTQQUO.method512(field314);
			} else {
				var10 = field378.field1283;
			}

			var1.method245(0, 4, 90, var10 + ":");
			var1.method245(255, var1.method243(var10 + ": ") + 6, 90, field344 + "*");
			TTGPXKMD.method435(77, 479, 0, 0);
		} else {
			method130(0, 0, LYHLTGUG.field839[field106], 0);
		}

		if (field504 && field388 == 2) {
			method89();
		}

		field450.method400(357, 17, field9);
		field449.method399();
		JXPUZKMY.field762 = field404;
	}

	@ObfuscatedName("client.a(LUAWAYCTK;II)V")
	public final void method87(UAWAYCTK arg0, int arg1) {
		while (arg0.field1253 + 10 < arg1 * 8) {
			int var3 = arg0.method466(11);
			if (var3 == 2047) {
				break;
			}

			if (field414[var3] == null) {
				field414[var3] = new UFGXOLGK();
				if (field419[var3] != null) {
					field414[var3].method496(field419[var3]);
				}
			}

			field416[field415++] = var3;
			UFGXOLGK var4 = field414[var3];
			var4.field1245 = field306;
			int var5 = arg0.method466(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method466(1);
			if (var6 == 1) {
				field418[field417++] = var3;
			}

			int var7 = arg0.method466(1);
			int var8 = arg0.method466(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method441(field378.field1229[0] + var8, var7 == 1, field378.field1228[0] + var5);
		}

		arg0.method467();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(Z[BB)V")
	public final void method88(boolean arg0, byte[] arg1) {
		if (field470) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method89() {
		int var1 = field389;
		int var2 = field390;
		int var3 = field391;
		int var4 = field392;
		int var5 = 0x5D5447;
		TTGPXKMD.method432(var5, var2, var4, var1, var3);
		TTGPXKMD.method432(0, var2 + 1, 16, var1 + 1, var3 - 2);
		TTGPXKMD.method433(var1 + 1, var2 + 18, var3 - 2, 0, var4 - 19);
		field292.method245(var5, var1 + 3, var2 + 14, "Choose Option");
		int var6 = field17;
		int var7 = field18;
		if (field388 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field388 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field388 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field110; var8++) {
			int var9 = (field110 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field292.method249(true, field267[var8], var10, var1 + 3, var9);
		}
	}

	@ObfuscatedName("client.a(ILUFGXOLGK;ILUAWAYCTK;I)V")
	public final void method90(int arg0, UFGXOLGK arg1, int arg2, UAWAYCTK arg3) {
		if ((arg0 & 0x200) != 0) {
			arg1.field1210 = arg3.method457();
			int var5 = arg3.method489();
			arg1.field1214 = var5 >> 16;
			arg1.field1213 = (var5 & 0xFFFF) + field306;
			arg1.field1211 = 0;
			arg1.field1212 = 0;

			if (arg1.field1213 > field306) {
				arg1.field1211 = -1;
			}

			if (arg1.field1210 == 0xFFFF) {
				arg1.field1210 = -1;
			}
		}

		if ((arg0 & 0x400) != 0) {
			arg1.field1202 = arg3.method455();
			arg1.field1204 = arg3.method475();
			arg1.field1203 = arg3.method474();
			arg1.field1205 = arg3.method475();
			arg1.field1206 = arg3.method483() + field306;
			arg1.field1207 = arg3.method484() + field306;
			arg1.field1208 = arg3.method475();
			arg1.method440();
		}

		if ((arg0 & 0x10) != 0) {
			arg1.field1242 = arg3.method484();
			if (arg1.field1242 == 0xFFFF) {
				arg1.field1242 = -1;
			}
		}

		if ((arg0 & 0x1) != 0) {
			int var6 = arg3.method483();
			int var7 = arg3.method474();
			int var8 = arg3.method474();
			int var9 = arg3.field1252;

			if (arg1.field1283 != null && arg1.field1268) {
				long var10 = VTCTQQUO.method508(arg1.field1283);
				boolean var12 = false;
				if (var7 <= 1) {
					for (int var13 = 0; var13 < field222; var13++) {
						if (field353[var13] == var10) {
							var12 = true;
							break;
						}
					}
				}

				if (!var12 && field422 == 0) {
					try {
						field321.field1252 = 0;
						arg3.method494(var8, field321.field1251, 0);
						field321.field1252 = 0;
						String var14 = CHVNTVHC.method37(field321, var8);
						var14 = ZCOZUVWP.method567(var14);
						arg1.field1232 = var14;
						arg1.field1215 = var6 >> 8;
						arg1.field1216 = var6 & 0xFF;
						arg1.field1222 = 150;

						if (var7 == 2 || var7 == 3) {
							method104("@cr2@" + arg1.field1283, var14, 1);
						} else if (var7 == 1) {
							method104("@cr1@" + arg1.field1283, var14, 1);
						} else {
							method104(arg1.field1283, var14, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field1252 = var8 + var9;
		}

		if ((arg0 & 0x8) != 0) {
			arg1.field1232 = arg3.method462();
			if (arg1.field1232.charAt(0) == '~') {
				arg1.field1232 = arg1.field1232.substring(1);
				method104(arg1.field1283, arg1.field1232, 2);
			} else if (field378 == arg1) {
				method104(arg1.field1283, arg1.field1232, 2);
			}

			arg1.field1215 = 0;
			arg1.field1216 = 0;
			arg1.field1222 = 150;
		}

		if ((arg0 & 0x100) != 0) {
			int var16 = arg3.method476();
			int var17 = arg3.method455();
			arg1.method442(var17, field306, var16);
			arg1.field1217 = field306 + 300;
			arg1.field1218 = arg3.method474();
			arg1.field1219 = arg3.method475();
		}

		if ((arg0 & 0x80) != 0) {
			arg1.field1243 = arg3.method457();
			arg1.field1244 = arg3.method484();
		}

		if ((arg0 & 0x40) != 0) {
			int var18 = arg3.method475();
			byte[] var19 = new byte[var18];
			UAWAYCTK var20 = new UAWAYCTK(var19);
			arg3.method493(var18, var19, 0);
			field419[arg2] = var20;
			arg1.method496(var20);
		}

		if ((arg0 & 0x4) != 0) {
			int var21 = arg3.method475();
			int var22 = arg3.method474();
			arg1.method442(var22, field306, var21);
			arg1.field1217 = field306 + 300;
			arg1.field1218 = arg3.method455();
			arg1.field1219 = arg3.method476();
		}

		if ((arg0 & 0x2) != 0) {
			int var23 = arg3.method483();
			if (var23 == 0xFFFF) {
				var23 = -1;
			}

			int var24 = arg3.method475();
			if (arg1.field1196 == var23 && var23 != -1) {
				int var25 = RIUJHZLL.field1112[var23].field1126;
				if (var25 == 1) {
					arg1.field1197 = 0;
					arg1.field1198 = 0;
					arg1.field1199 = var24;
					arg1.field1200 = 0;
				}

				if (var25 == 2) {
					arg1.field1200 = 0;
					return;
				}
			} else if (var23 == -1 || arg1.field1196 == -1 || RIUJHZLL.field1112[var23].field1120 >= RIUJHZLL.field1112[arg1.field1196].field1120) {
				arg1.field1196 = var23;
				arg1.field1197 = 0;
				arg1.field1198 = 0;
				arg1.field1199 = var24;
				arg1.field1200 = 0;
				arg1.field1233 = arg1.field1201;
			}
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int method91(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(I)V")
	public final void method8() {
		signlink.reporterror = false;

		try {
			if (field279 != null) {
				field279.method174();
			}
		} catch (Exception var1) {
		}

		field279 = null;
		method123();

		if (field165 != null) {
			field165.field1345 = false;
		}

		field165 = null;
		field430.method188();
		field430 = null;
		field321 = null;
		field281 = null;
		field259 = null;
		field320 = null;
		field240 = null;
		field139 = null;
		field443 = null;
		field241 = null;
		field242 = null;
		field317 = null;
		field469 = null;
		field339 = null;
		field394 = null;
		field476 = null;
		field273 = null;
		field95 = null;
		field96 = null;
		field432 = null;
		field447 = null;
		field448 = null;
		field449 = null;
		field450 = null;
		field505 = null;
		field506 = null;
		field507 = null;
		field141 = null;
		field142 = null;
		field143 = null;
		field144 = null;
		field145 = null;
		field146 = null;
		field147 = null;
		field148 = null;
		field149 = null;
		field276 = null;
		field277 = null;
		field278 = null;
		field200 = null;
		field201 = null;
		field202 = null;
		field495 = null;
		field372 = null;
		field373 = null;
		field374 = null;
		field375 = null;
		field376 = null;
		field347 = null;
		field348 = null;
		field349 = null;
		field350 = null;
		field351 = null;
		field215 = null;
		field265 = null;
		field494 = null;
		field411 = null;
		field410 = null;
		field409 = null;
		field377 = null;
		field496 = null;
		field497 = null;
		field498 = null;
		field499 = null;
		field500 = null;
		field345 = null;
		field444 = null;
		field473 = null;
		field414 = null;
		field416 = null;
		field418 = null;
		field419 = null;
		field261 = null;
		field322 = null;
		field324 = null;
		field512 = null;
		field408 = null;
		field181 = null;
		field398 = null;
		field218 = null;
		field219 = null;
		field220 = null;
		field221 = null;
		field267 = null;
		field251 = null;
		field254 = null;
		field255 = null;
		field90 = null;
		field356 = null;
		field513 = null;
		field275 = null;
		field138 = null;
		field175 = null;
		field176 = null;
		field172 = null;
		field173 = null;
		field174 = null;
		field177 = null;
		field178 = null;
		field179 = null;
		field180 = null;
		method142();
		BQKZHFKO.method18();
		JKAPIYZO.method279();
		MHOZCPTF.method323();
		ECJPTPHH.field567 = null;
		NRLTHETF.field954 = null;
		LYHLTGUG.field839 = null;
		YXKFKFLF.field1481 = null;
		RIUJHZLL.field1112 = null;
		PMDEXOWJ.field1086 = null;
		PMDEXOWJ.field1098 = null;
		RRCEOPDB.field1137 = null;
		field10 = null;
		UFGXOLGK.field1264 = null;
		JXPUZKMY.method288();
		OBOSMEDX.method341();
		WEVRTBOZ.method521();
		HJEXDJAH.method216();
		System.gc();
	}

	@ObfuscatedName("client.b(LUAWAYCTK;BI)V")
	public final void method92(UAWAYCTK arg0, int arg1) {
		for (int var3 = 0; var3 < field417; var3++) {
			int var4 = field418[var3];
			JKNLPRIU var5 = field322[var4];
			int var6 = arg0.method455();
			if ((var6 & 0x4) != 0) {
				var5.field1232 = arg0.method462();
				var5.field1222 = 100;
			}

			if ((var6 & 0x1) != 0) {
				var5.field1210 = arg0.method484();
				int var7 = arg0.method489();
				var5.field1214 = var7 >> 16;
				var5.field1213 = (var7 & 0xFFFF) + field306;
				var5.field1211 = 0;
				var5.field1212 = 0;

				if (var5.field1213 > field306) {
					var5.field1211 = -1;
				}

				if (var5.field1210 == 0xFFFF) {
					var5.field1210 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var8 = arg0.method455();
				int var9 = arg0.method475();
				var5.method442(var9, field306, var8);
				var5.field1217 = field306 + 300;
				var5.field1218 = arg0.method455();
				var5.field1219 = arg0.method475();
			}

			if ((var6 & 0x40) != 0) {
				var5.field1242 = arg0.method483();
				if (var5.field1242 == 0xFFFF) {
					var5.field1242 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				int var10 = arg0.method474();
				int var11 = arg0.method474();
				var5.method442(var11, field306, var10);
				var5.field1217 = field306 + 300;
				var5.field1218 = arg0.method455();
				var5.field1219 = arg0.method476();
			}

			if ((var6 & 0x20) != 0) {
				int var12 = arg0.method484();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg0.method474();
				if (var5.field1196 == var12 && var12 != -1) {
					int var14 = RIUJHZLL.field1112[var12].field1126;
					if (var14 == 1) {
						var5.field1197 = 0;
						var5.field1198 = 0;
						var5.field1199 = var13;
						var5.field1200 = 0;
					}

					if (var14 == 2) {
						var5.field1200 = 0;
					}
				} else if (var12 == -1 || var5.field1196 == -1 || RIUJHZLL.field1112[var12].field1120 >= RIUJHZLL.field1112[var5.field1196].field1120) {
					var5.field1196 = var12;
					var5.field1197 = 0;
					var5.field1198 = 0;
					var5.field1199 = var13;
					var5.field1200 = 0;
					var5.field1233 = var5.field1201;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field750 = JKAPIYZO.method284(arg0.method457());
				var5.field1230 = var5.field750.field736;
				var5.field1231 = var5.field750.field743;
				var5.field1223 = var5.field750.field728;
				var5.field1224 = var5.field750.field745;
				var5.field1225 = var5.field750.field724;
				var5.field1226 = var5.field750.field739;
				var5.field1220 = var5.field750.field722;
			}

			if ((var6 & 0x10) != 0) {
				var5.field1243 = arg0.method484();
				var5.field1244 = arg0.method482();
			}
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method93(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field491[var4] != null) {
				int var5 = field489[var4];
				int var6 = field352 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field490[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field503 == 0 || field503 == 1 && method79(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field378.field1283)) {
						if (field103 >= 1) {
							field267[field110] = "Report abuse @whi@" + var7;
							field220[field110] = 194;
							field110++;
						}

						field267[field110] = "Add ignore @whi@" + var7;
						field220[field110] = 157;
						field110++;
						field267[field110] = "Add friend @whi@" + var7;
						field220[field110] = 761;
						field110++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field187 == 0 && (var5 == 7 || field311 == 0 || field311 == 1 && method79(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field103 >= 1) {
							field267[field110] = "Report abuse @whi@" + var7;
							field220[field110] = 194;
							field110++;
						}

						field267[field110] = "Add ignore @whi@" + var7;
						field220[field110] = 157;
						field110++;
						field267[field110] = "Add friend @whi@" + var7;
						field220[field110] = 761;
						field110++;
					}

					var3++;
				}

				if (var5 == 4 && (field455 == 0 || field455 == 1 && method79(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field267[field110] = "Accept trade @whi@" + var7;
						field220[field110] = 406;
						field110++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field187 == 0 && field311 < 2) {
					var3++;
				}

				if (var5 == 8 && (field455 == 0 || field455 == 1 && method79(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field267[field110] = "Accept challenge @whi@" + var7;
						field220[field110] = 853;
						field110++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)Z")
	public final boolean method94(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field220[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 761) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.l(I)V")
	public static final void method95() {
		OBOSMEDX.field963 = false;
		JXPUZKMY.field751 = false;
		field169 = false;
		IJMWYKME.field686 = false;
		BQKZHFKO.field47 = false;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method12(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method12(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IILJKAPIYZO;II)V")
	public final void method96(int arg0, JKAPIYZO arg1, int arg2, int arg3) {
		if (field110 < 400) {
			if (arg1.field720 != null) {
				arg1 = arg1.method282();
			}

			if (arg1 != null && arg1.field713) {
				String var5 = arg1.field716;
				if (arg1.field723 != 0) {
					var5 = var5 + method81(arg1.field723, field378.field1275) + " (level-" + arg1.field723 + ")";
				}

				if (field433 == 1) {
					field267[field110] = "Use " + field437 + " with @yel@" + var5;
					field220[field110] = 397;
					field221[field110] = arg3;
					field218[field110] = arg0;
					field219[field110] = arg2;
					field110++;
				} else if (field124 != 1) {
					if (arg1.field749 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field749[var6] != null && !arg1.field749[var6].equalsIgnoreCase("attack")) {
								field267[field110] = arg1.field749[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field220[field110] = 457;
								}

								if (var6 == 1) {
									field220[field110] = 749;
								}

								if (var6 == 2) {
									field220[field110] = 735;
								}

								if (var6 == 3) {
									field220[field110] = 153;
								}

								if (var6 == 4) {
									field220[field110] = 560;
								}

								field221[field110] = arg3;
								field218[field110] = arg0;
								field219[field110] = arg2;
								field110++;
							}
						}
					}

					if (arg1.field749 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field749[var7] != null && arg1.field749[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field723 > field378.field1275) {
									var8 = 2000;
								}

								field267[field110] = arg1.field749[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field220[field110] = var8 + 457;
								}

								if (var7 == 1) {
									field220[field110] = var8 + 749;
								}

								if (var7 == 2) {
									field220[field110] = var8 + 735;
								}

								if (var7 == 3) {
									field220[field110] = var8 + 153;
								}

								if (var7 == 4) {
									field220[field110] = var8 + 560;
								}

								field221[field110] = arg3;
								field218[field110] = arg0;
								field219[field110] = arg2;
								field110++;
							}
						}
					}

					field267[field110] = "Examine @yel@" + var5;
					field220[field110] = 1822;
					field221[field110] = arg3;
					field218[field110] = arg0;
					field219[field110] = arg2;
					field110++;
				} else if ((field126 & 0x2) == 2) {
					field267[field110] = field127 + " @yel@" + var5;
					field220[field110] = 610;
					field221[field110] = arg3;
					field218[field110] = arg0;
					field219[field110] = arg2;
					field110++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLLYHLTGUG;)Z")
	public final boolean method97(LYHLTGUG arg0) {
		if (arg0.field834 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field834.length; var2++) {
			int var3 = method58(var2, arg0);
			int var4 = arg0.field829[var2];
			if (arg0.field834[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field834[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field834[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method98() {
		if (field393 == 2) {
			for (DOIBONME var1 = (DOIBONME) field408.method503(); var1 != null; var1 = (DOIBONME) field408.method505()) {
				if (var1.field550 > 0) {
					var1.field550--;
				}

				if (var1.field550 != 0) {
					if (var1.field551 > 0) {
						var1.field551--;
					}

					if (var1.field551 == 0 && var1.field554 >= 1 && var1.field555 >= 1 && var1.field554 <= 102 && var1.field555 <= 102 && (var1.field544 < 0 || IJMWYKME.method259(var1.field546, var1.field544))) {
						method57(var1.field544, var1.field552, var1.field545, var1.field554, var1.field553, var1.field546, var1.field555);
						var1.field551 = -1;

						if (var1.field547 == var1.field544 && var1.field547 == -1) {
							var1.method398();
						} else if (var1.field547 == var1.field544 && var1.field548 == var1.field545 && var1.field549 == var1.field546) {
							var1.method398();
						}
					}
				} else if (var1.field547 < 0 || IJMWYKME.method259(var1.field549, var1.field547)) {
					method57(var1.field547, var1.field552, var1.field548, var1.field554, var1.field553, var1.field549, var1.field555);
					var1.method398();
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)Ljava/net/Socket;")
	public final Socket method99(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(IILIBHVCUAH;I)V")
	public final void method100(int arg0, int arg1, IBHVCUAH arg2) {
		int var4 = field170 + field100 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = WEVRTBOZ.field1426[var4];
			int var7 = WEVRTBOZ.field1427[var4];
			var6 = var6 * 256 / (field257 + 256);
			var7 = var7 * 256 / (field257 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method238(83 - var9 - arg2.field658 / 2 - 4, field277, var8 + 94 + 4 - arg2.field657 / 2);
			} else {
				arg2.method232(var8 + 94 + 4 - arg2.field657 / 2, 83 - var9 - arg2.field658 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method101() {
		field289++;
		method77(true);
		method122(true);
		method77(false);
		method122(false);
		method161();
		method170();

		if (!field235) {
			int var1 = field99;
			if (field302 / 256 > var1) {
				var1 = field302 / 256;
			}

			if (field97[4] && field301[4] + 128 > var1) {
				var1 = field301[4] + 128;
			}

			int var2 = field304 + field100 & 0x7FF;
			method103(var2, field484, field483, var1 * 3 + 600, var1, method72(field378.field1236, field378.field1235, field480) - 50);
			field150++;
			if (field150 > 1252) {
				field150 = 0;
				field281.method444(191);
				field281.method445(0);
				int var3 = field281.field1252;
				field281.method446((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field281.method446(29307);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field281.method445(10);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field281.method445(104);
				}

				field281.method446(34003);
				field281.method445(235);

				if ((int) (Math.random() * 2.0D) == 0) {
					field281.method446(64940);
				}

				field281.method445(242);

				if ((int) (Math.random() * 2.0D) == 0) {
					field281.method446(64309);
				}

				field281.method445(174);
				field281.method454(field281.field1252 - var3);
			}
		}

		int var4;
		if (field235) {
			var4 = method141();
		} else {
			var4 = method140();
		}

		int var5 = field159;
		int var6 = field160;
		int var7 = field161;
		int var8 = field162;
		int var9 = field163;

		for (int var10 = 0; var10 < 5; var10++) {
			if (field97[var10]) {
				int var11 = (int) (Math.random() * (field477[var10] * 2 + 1) + Math.sin(field370[var10] / 100.0D * field399[var10]) * field301[var10] - field477[var10]);
				if (var10 == 0) {
					field159 += var11;
				}

				if (var10 == 1) {
					field160 += var11;
				}

				if (var10 == 2) {
					field161 += var11;
				}

				if (var10 == 3) {
					field163 = field163 + var11 & 0x7FF;
				}

				if (var10 == 4) {
					field162 += var11;
					if (field162 < 128) {
						field162 = 128;
					}

					if (field162 > 383) {
						field162 = 383;
					}
				}
			}
		}

		int var12 = JXPUZKMY.field771;
		WEVRTBOZ.field1421 = true;
		WEVRTBOZ.field1424 = 0;
		WEVRTBOZ.field1422 = field17 - 4;
		WEVRTBOZ.field1423 = field18 - 4;
		TTGPXKMD.method430();
		field339.method381(field161, field159, field163, field162, field160, var4);
		field339.method356();
		method125();
		method133();
		method139(var12);
		method114();
		field449.method400(4, 4, field9);
		field159 = var5;
		field160 = var6;
		field161 = var7;
		field162 = var8;
		field163 = var9;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method102(String arg0) {
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

	@ObfuscatedName("client.a(IZIIIII)V")
	public final void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = WEVRTBOZ.field1426[var7];
			int var13 = WEVRTBOZ.field1427[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = WEVRTBOZ.field1426[var8];
			int var16 = WEVRTBOZ.field1427[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field159 = arg2 - var9;
		field160 = arg5 - var10;
		field161 = arg1 - var11;
		field162 = arg4;
		field163 = arg0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IZ)V")
	public final void method104(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field106 != -1) {
			field338 = arg1;
			field23 = 0;
		}

		if (field298 == -1) {
			field362 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field489[var4] = field489[var4 - 1];
			field490[var4] = field490[var4 - 1];
			field491[var4] = field491[var4 - 1];
		}

		field489[0] = arg2;
		field490[0] = arg0;
		field491[0] = arg1;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method105() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field479) {
			field343 = false;
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

		if (field446) {
			field343 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field366) {
			field343 = false;
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

	@ObfuscatedName("client.a(JI)V")
	public final void method106(long arg0) {
		if (arg0 != 0L) {
			if (field222 >= 100) {
				method104("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = VTCTQQUO.method512(VTCTQQUO.method509(arg0));
				for (int var4 = 0; var4 < field222; var4++) {
					if (field353[var4] == arg0) {
						method104("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field396; var5++) {
					if (field275[var5] == arg0) {
						method104("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field353[field222++] = arg0;
				field429 = true;
				field281.method444(12);
				field281.method451(arg0);
			}
		}
	}

	@ObfuscatedName("client.o(I)Ljava/lang/String;")
	public final String method107() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field12 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field3 = 5;
		}

		if (field283) {
			field366 = true;
		} else {
			field283 = true;
			boolean var1 = false;
			String var2 = method107();
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
						field385[var3] = new MQOIEGDZ(signlink.cache_idx[var3], var3 + 1, 500000, signlink.cache_dat);
					}
				}

				try {
					method134();
					field508 = method118("title", field151[1], 25, "title screen", 1);
					field290 = new IDBGYHWK("p11_full", field508, false);
					field291 = new IDBGYHWK("p12_full", field508, false);
					field292 = new IDBGYHWK("b12_full", field508, false);
					field293 = new IDBGYHWK("q8_full", field508, true);
					method65();
					method109();
					RVLWVPJQ var4 = method118("config", field151[2], 30, "config", 2);
					RVLWVPJQ var5 = method118("interface", field151[3], 35, "interface", 3);
					RVLWVPJQ var6 = method118("media", field151[4], 40, "2d graphics", 4);
					RVLWVPJQ var7 = method118("textures", field151[6], 45, "textures", 6);
					RVLWVPJQ var8 = method118("wordenc", field151[7], 50, "chat system", 7);
					RVLWVPJQ var9 = method118("sounds", field151[8], 55, "sound effects", 8);
					field469 = new byte[4][104][104];
					field317 = new int[4][105][105];
					field339 = new OBOSMEDX(4, 104, field317, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field394[var10] = new CGGBZSOS(104, 104);
					}

					field356 = new IBHVCUAH(512, 512);
					RVLWVPJQ var11 = method118("versionlist", field151[5], 60, "update list", 5);
					method13(60, "Connecting to update server");
					field430 = new ELICEBAH();
					field430.method196(var11, this);
					HJEXDJAH.method214(field430.method194());
					WEVRTBOZ.method522(field430.method191(0), field430);

					if (!field169) {
						field326 = 0;
						try {
							field326 = Integer.parseInt(getParameter("music"));
						} catch (Exception var72) {
						}

						field327 = true;
						field430.method184(2, field326);

						while (field430.method204() > 0) {
							method166();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field430.field601 > 3) {
								method102("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field430.method191(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field430.method184(1, var13);
					}

					while (field430.method204() > 0) {
						int var14 = var12 - field430.method204();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method166();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field430.field601 > 3) {
							method102("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field430.method191(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field430.method200(var16);
						if ((var17 & 0x1) != 0) {
							field430.method184(0, var16);
						}
					}

					int var18 = field430.method204();
					while (field430.method204() > 0) {
						int var19 = var18 - field430.method204();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method166();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field385[0] != null) {
						method13(75, "Requesting maps");
						field430.method184(3, field430.method199(48, 0, 47));
						field430.method184(3, field430.method199(48, 1, 47));
						field430.method184(3, field430.method199(48, 0, 48));
						field430.method184(3, field430.method199(48, 1, 48));
						field430.method184(3, field430.method199(48, 0, 49));
						field430.method184(3, field430.method199(48, 1, 49));
						field430.method184(3, field430.method199(47, 0, 47));
						field430.method184(3, field430.method199(47, 1, 47));
						field430.method184(3, field430.method199(47, 0, 48));
						field430.method184(3, field430.method199(47, 1, 48));
						field430.method184(3, field430.method199(148, 0, 48));
						field430.method184(3, field430.method199(148, 1, 48));
						int var20 = field430.method204();
						while (field430.method204() > 0) {
							int var21 = var20 - field430.method204();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method166();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field430.method191(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field430.method200(var23);
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
							field430.method201(0, var25, var23);
						}
					}

					field430.method202(field168);

					if (!field169) {
						int var26 = field430.method191(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field430.method186(var27)) {
								field430.method201(2, (byte) 1, var27);
							}
						}
					}

					method13(80, "Unpacking media");
					field276 = new XHDQQNIR(var6, "invback", 0);
					field278 = new XHDQQNIR(var6, "chatback", 0);
					field277 = new XHDQQNIR(var6, "mapback", 0);
					field200 = new XHDQQNIR(var6, "backbase1", 0);
					field201 = new XHDQQNIR(var6, "backbase2", 0);
					field202 = new XHDQQNIR(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field495[var28] = new XHDQQNIR(var6, "sideicons", var28);
					}

					field215 = new IBHVCUAH(var6, "compass", 0);
					field243 = new IBHVCUAH(var6, "mapedge", 0);
					field243.method229();

					for (int var29 = 0; var29 < 72; var29++) {
						field345[var29] = new XHDQQNIR(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field444[var30] = new IBHVCUAH(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field265[var31] = new IBHVCUAH(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field494[var32] = new IBHVCUAH(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field411[var33] = new IBHVCUAH(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field410[var34] = new IBHVCUAH(var6, "headicons_hint", var34);
					}

					field377 = new IBHVCUAH(var6, "overlay_multiway", 0);
					field271 = new IBHVCUAH(var6, "mapmarker", 0);
					field272 = new IBHVCUAH(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field409[var35] = new IBHVCUAH(var6, "cross", var35);
					}

					field496 = new IBHVCUAH(var6, "mapdots", 0);
					field497 = new IBHVCUAH(var6, "mapdots", 1);
					field498 = new IBHVCUAH(var6, "mapdots", 2);
					field499 = new IBHVCUAH(var6, "mapdots", 3);
					field500 = new IBHVCUAH(var6, "mapdots", 4);
					field205 = new XHDQQNIR(var6, "scrollbar", 0);
					field206 = new XHDQQNIR(var6, "scrollbar", 1);
					field372 = new XHDQQNIR(var6, "redstone1", 0);
					field373 = new XHDQQNIR(var6, "redstone2", 0);
					field374 = new XHDQQNIR(var6, "redstone3", 0);
					field375 = new XHDQQNIR(var6, "redstone1", 0);
					field375.method552();
					field376 = new XHDQQNIR(var6, "redstone2", 0);
					field376.method552();
					field347 = new XHDQQNIR(var6, "redstone1", 0);
					field347.method553();
					field348 = new XHDQQNIR(var6, "redstone2", 0);
					field348.method553();
					field349 = new XHDQQNIR(var6, "redstone3", 0);
					field349.method553();
					field350 = new XHDQQNIR(var6, "redstone1", 0);
					field350.method552();
					field350.method553();
					field351 = new XHDQQNIR(var6, "redstone2", 0);
					field351.method552();
					field351.method553();

					for (int var36 = 0; var36 < 2; var36++) {
						field439[var36] = new XHDQQNIR(var6, "mod_icons", var36);
					}

					IBHVCUAH var37 = new IBHVCUAH(var6, "backleft1", 0);
					field141 = new PKTDMNAV(var37.field653, method11(), var37.field654);
					var37.method230(0, 0);
					IBHVCUAH var38 = new IBHVCUAH(var6, "backleft2", 0);
					field142 = new PKTDMNAV(var38.field653, method11(), var38.field654);
					var38.method230(0, 0);
					IBHVCUAH var39 = new IBHVCUAH(var6, "backright1", 0);
					field143 = new PKTDMNAV(var39.field653, method11(), var39.field654);
					var39.method230(0, 0);
					IBHVCUAH var40 = new IBHVCUAH(var6, "backright2", 0);
					field144 = new PKTDMNAV(var40.field653, method11(), var40.field654);
					var40.method230(0, 0);
					IBHVCUAH var41 = new IBHVCUAH(var6, "backtop1", 0);
					field145 = new PKTDMNAV(var41.field653, method11(), var41.field654);
					var41.method230(0, 0);
					IBHVCUAH var42 = new IBHVCUAH(var6, "backvmid1", 0);
					field146 = new PKTDMNAV(var42.field653, method11(), var42.field654);
					var42.method230(0, 0);
					IBHVCUAH var43 = new IBHVCUAH(var6, "backvmid2", 0);
					field147 = new PKTDMNAV(var43.field653, method11(), var43.field654);
					var43.method230(0, 0);
					IBHVCUAH var44 = new IBHVCUAH(var6, "backvmid3", 0);
					field148 = new PKTDMNAV(var44.field653, method11(), var44.field654);
					var44.method230(0, 0);
					IBHVCUAH var45 = new IBHVCUAH(var6, "backhmid2", 0);
					field149 = new PKTDMNAV(var45.field653, method11(), var45.field654);
					var45.method230(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field444[var50] != null) {
							field444[var50].method228(var47 + var49, var48 + var49, var46 + var49);
						}

						if (field345[var50] != null) {
							field345[var50].method554(var47 + var49, var48 + var49, var46 + var49);
						}
					}

					method13(83, "Unpacking textures");
					JXPUZKMY.method293(var7);
					JXPUZKMY.method297(0.8D);
					JXPUZKMY.method292(20);
					method13(86, "Unpacking config");
					RIUJHZLL.method413(var4);
					BQKZHFKO.method15(var4);
					ECJPTPHH.method180(var4);
					MHOZCPTF.method316(var4);
					JKAPIYZO.method285(var4);
					NRLTHETF.method333(var4);
					PMDEXOWJ.method402(var4);
					RRCEOPDB.method421(var4);
					UNSYPSHF.method498(var4);
					MHOZCPTF.field889 = field168;

					if (!field169) {
						method13(90, "Unpacking sounds");
						byte[] var51 = var9.method424("sounds.dat", null);
						UAWAYCTK var52 = new UAWAYCTK(var51);
						HNYSLMKN.method219(var52);
					}

					method13(95, "Unpacking interfaces");
					IDBGYHWK[] var53 = new IDBGYHWK[] { field290, field291, field292, field293 };
					LYHLTGUG.method307(var6, var53, var5);
					method13(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field277.field1447[field277.field1449 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field346[var54] = var55;
						field107[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field277.field1447[field277.field1449 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field282[var58 - 5] = var59 - 25;
						field234[var58 - 5] = var60 - var59;
					}

					JXPUZKMY.method290(479, 96);
					field402 = JXPUZKMY.field762;
					JXPUZKMY.method290(190, 261);
					field403 = JXPUZKMY.field762;
					JXPUZKMY.method290(512, 334);
					field404 = JXPUZKMY.field762;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = JXPUZKMY.field760[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					OBOSMEDX.method378(var62, 800, 512, 500, 334);
					ZCOZUVWP.method557(var8);
					field165 = new VXFBFZWJ(this);
					method12(field165, 10);
					JBYEFPCA.field704 = this;
					BQKZHFKO.field70 = this;
					JKAPIYZO.field744 = this;
				} catch (Exception var73) {
					signlink.reporterror("loaderror " + field111 + " " + field359);
					field479 = true;
				}
			} else {
				field446 = true;
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public void method108() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field395);

		if (field430 != null) {
			System.out.println("Od-cycle:" + field430.field579);
		}

		System.out.println("loop-cycle:" + field306);
		System.out.println("draw-cycle:" + field300);
		System.out.println("ptype:" + field458);
		System.out.println("psize:" + field457);

		if (field279 != null) {
			field279.method179();
		}

		field6 = true;
	}

	@ObfuscatedName("client.e(Z)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field12 != null) {
			return field12;
		}

		return this;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method109() {
		field134 = new XHDQQNIR(field508, "titlebox", 0);
		field135 = new XHDQQNIR(field508, "titlebutton", 0);
		field246 = new XHDQQNIR[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field246[var2] = new XHDQQNIR(field508, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field246[var3] = new XHDQQNIR(field508, "runes", (var3 & 0x3) + 12);
			}
		}

		field451 = new IBHVCUAH(128, 265);
		field452 = new IBHVCUAH(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field451.field652[var4] = field175.field1079[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field452.field652[var5] = field176.field1079[var5];
		}

		field286 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field286[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field286[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field286[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field286[var9 + 192] = 0xFFFFFF;
		}

		field287 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field287[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field287[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field287[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field287[var13 + 192] = 0xFFFFFF;
		}

		field288 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field288[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field288[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field288[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field288[var17 + 192] = 0xFFFFFF;
		}

		field285 = new int[256];
		field329 = new int[32768];
		field330 = new int[32768];
		method83(null);
		field122 = new int[32768];
		field123 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field343) {
			field156 = true;
			field343 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method110(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field339.method372(field480, arg0, arg2, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			BQKZHFKO var8 = BQKZHFKO.method24(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field65;
				var10 = var8.field53;
			} else {
				var9 = var8.field53;
				var10 = var8.field65;
			}

			int var11 = var8.field41;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method71(arg0, false, var9, var10, 0, field378.field1229[0], field378.field1228[0], 0, var11, arg2, 2);
		} else {
			method71(arg0, false, 0, 0, var7, field378.field1229[0], field378.field1228[0], var6 + 1, 0, arg2, 2);
		}

		field380 = field24;
		field381 = field25;
		field383 = 2;
		field382 = 0;
		return true;
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method111(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field222; var3++) {
				if (field353[var3] == arg0) {
					field222--;
					field429 = true;

					for (int var4 = var3; var4 < field222; var4++) {
						field353[var4] = field353[var4 + 1];
					}

					field281.method444(107);
					field281.method451(arg0);
					return;
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field12 != null) {
				return new URL("http://127.0.0.1:" + (field167 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.f(B)V")
	public final void method112() {
		field447.method399();
		JXPUZKMY.field762 = field403;
		field276.method555(0, 0);

		if (field492 != -1) {
			method130(0, 0, LYHLTGUG.field839[field492], 0);
		} else if (field371[field105] != -1) {
			method130(0, 0, LYHLTGUG.field839[field371[field105]], 0);
		}

		if (field504 && field388 == 1) {
			method89();
		}

		field447.method400(205, 553, field9);
		field449.method399();
		JXPUZKMY.field762 = field404;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method113() {
		int var1 = field129 * 128 + 64;
		int var2 = field130 * 128 + 64;
		int var3 = method72(var2, var1, field480) - field131;

		if (field159 < var1) {
			field159 += (var1 - field159) * field133 / 1000 + field132;
			if (field159 > var1) {
				field159 = var1;
			}
		}

		if (field159 > var1) {
			field159 -= (field159 - var1) * field133 / 1000 + field132;
			if (field159 < var1) {
				field159 = var1;
			}
		}

		if (field160 < var3) {
			field160 += (var3 - field160) * field133 / 1000 + field132;
			if (field160 > var3) {
				field160 = var3;
			}
		}

		if (field160 > var3) {
			field160 -= (field160 - var3) * field133 / 1000 + field132;
			if (field160 < var3) {
				field160 = var3;
			}
		}

		if (field161 < var2) {
			field161 += (var2 - field161) * field133 / 1000 + field132;
			if (field161 > var2) {
				field161 = var2;
			}
		}

		if (field161 > var2) {
			field161 -= (field161 - var2) * field133 / 1000 + field132;
			if (field161 < var2) {
				field161 = var2;
			}
		}

		int var4 = field229 * 128 + 64;
		int var5 = field230 * 128 + 64;
		int var6 = method72(var5, var4, field480) - field231;
		int var7 = var4 - field159;
		int var8 = var6 - field160;
		int var9 = var5 - field161;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field162 < var11) {
			field162 += (var11 - field162) * field233 / 1000 + field232;
			if (field162 > var11) {
				field162 = var11;
			}
		}

		if (field162 > var11) {
			field162 -= (field162 - var11) * field233 / 1000 + field232;
			if (field162 < var11) {
				field162 = var11;
			}
		}

		int var13 = var12 - field163;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field163 += field233 * var13 / 1000 + field232;
			field163 &= 0x7FF;
		}

		if (var13 < 0) {
			field163 -= -var13 * field233 / 1000 + field232;
			field163 &= 0x7FF;
		}

		int var14 = var12 - field163;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field163 = var12;
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method114() {
		method51();

		if (field383 == 1) {
			field409[field382 / 100].method232(field380 - 8 - 4, field381 - 8 - 4);
		}

		if (field383 == 2) {
			field409[field382 / 100 + 4].method232(field380 - 8 - 4, field381 - 8 - 4);
		}

		if (field297 != -1) {
			method154(field297, field511);
			method130(0, 0, LYHLTGUG.field839[field297], 0);
		}

		if (field262 != -1) {
			method154(field262, field511);
			method130(0, 0, LYHLTGUG.field839[field262], 0);
		}

		method116();

		if (!field504) {
			method157();
			method138();
		} else if (field388 == 0) {
			method89();
		}

		if (field249 == 1) {
			field377.method232(472, 296);
		}

		if (field104) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field5 < 15) {
				var3 = 0xFF0000;
			}

			field291.method240("Fps:" + field5, var1, var3, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field169) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field169) {
				int var8 = 0xFF0000;
			}

			field291.method240("Mem:" + var5 + "k", var1, 0xFFFF00, var2);
			var2 += 15;
		}

		if (field468 != 0) {
			int var9 = field468 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field291.method245(0xFFFF00, 4, 329, "System update in: " + var10 + ":0" + var9);
			} else {
				field291.method245(0xFFFF00, 4, 329, "System update in: " + var10 + ":" + var9);
			}
		}
	}

	@ObfuscatedName("client.a(BLUAWAYCTK;I)V")
	public final void method115(UAWAYCTK arg0, int arg1) {
		int var3 = arg0.method466(8);
		if (var3 < field415) {
			for (int var4 = var3; var4 < field415; var4++) {
				field261[field260++] = field416[var4];
			}
		}

		if (var3 > field415) {
			signlink.reporterror(field314 + " Too many players");
			throw new RuntimeException("eek");
		}

		field415 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field416[var5];
			UFGXOLGK var7 = field414[var6];
			int var8 = arg0.method466(1);
			if (var8 == 0) {
				field416[field415++] = var6;
				var7.field1245 = field306;
			} else {
				int var9 = arg0.method466(2);
				if (var9 == 0) {
					field416[field415++] = var6;
					var7.field1245 = field306;
					field418[field417++] = var6;
				} else if (var9 == 1) {
					field416[field415++] = var6;
					var7.field1245 = field306;
					int var10 = arg0.method466(3);
					var7.method439(false, var10);
					int var11 = arg0.method466(1);
					if (var11 == 1) {
						field418[field417++] = var6;
					}
				} else if (var9 == 2) {
					field416[field415++] = var6;
					var7.field1245 = field306;
					int var12 = arg0.method466(3);
					var7.method439(true, var12);
					int var13 = arg0.method466(3);
					var7.method439(true, var13);
					int var14 = arg0.method466(1);
					if (var14 == 1) {
						field418[field417++] = var6;
					}
				} else if (var9 == 3) {
					field261[field260++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method116() {
		field422 = 0;
		int var1 = (field378.field1235 >> 7) + field224;
		int var2 = (field378.field1236 >> 7) + field225;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field422 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field422 = 1;
		}

		if (field422 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field422 = 0;
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method117() {
		for (int var1 = 0; var1 < field182; var1++) {
			if (field186[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field421[var1] != field307 || field252[var1] != field472) {
						UAWAYCTK var3 = HNYSLMKN.method220(field421[var1], field252[var1]);
						if (System.currentTimeMillis() + var3.field1252 / 22 > field466 / 22 + field431) {
							field466 = var3.field1252;
							field431 = System.currentTimeMillis();

							if (method59(var3.field1251, var3.field1252)) {
								field307 = field421[var1];
								field472 = field252[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method128()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field186[var1] != -5) {
					field186[var1] = -5;
				} else {
					field182--;
					for (int var5 = var1; var5 < field182; var5++) {
						field421[var5] = field421[var5 + 1];
						field252[var5] = field252[var5 + 1];
						field186[var5] = field186[var5 + 1];
					}

					var1--;
				}
			} else {
				field186[var1]--;
			}
		}

		if (field183 > 0) {
			field183 -= 20;
			if (field183 < 0) {
				field183 = 0;
			}

			if (field183 == 0 && field470 && !field169) {
				field326 = field420;
				field327 = true;
				field430.method184(2, field326);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IILjava/lang/String;II)LRVLWVPJQ;")
	public final RVLWVPJQ method118(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field385[0] != null) {
				var6 = field385[0].method328(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field209.reset();
			field209.update(var6);
			int var8 = (int) field209.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new RVLWVPJQ(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13(arg2, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method151(arg0 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				UAWAYCTK var16 = new UAWAYCTK(var15);
				var16.field1252 = 3;
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
						method13(arg2, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field385[0] != null) {
						field385[0].method329(arg4, var6.length, var6);
					}
				} catch (Exception var28) {
					field385[0] = null;
				}

				if (var6 != null) {
					field209.reset();
					field209.update(var6);
					int var23 = (int) field209.getValue();
					if (arg1 != var23) {
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
						method13(arg2, "Game updated - please reload page");
						var25 = 10;
					} else {
						method13(arg2, var11 + " - Retrying in " + var25);
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

				field154 = !field154;
			}
		}

		return new RVLWVPJQ(var6);
	}

	@ObfuscatedName("client.m(Z)Z")
	public final boolean method119() {
		if (field279 == null) {
			return false;
		}

		try {
			int var1 = field279.method176();
			if (var1 == 0) {
				return false;
			}

			if (field458 == -1) {
				field279.method177(field320.field1251, 0, 1);
				field458 = field320.field1251[0] & 0xFF;
				if (field212 != null) {
					field458 = field458 - field212.method518() & 0xFF;
				}

				field457 = PTKUSBXX.field1100[field458];
				var1--;
			}

			if (field457 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field279.method177(field320.field1251, 0, 1);
				field457 = field320.field1251[0] & 0xFF;
				var1--;
			}

			if (field457 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field279.method177(field320.field1251, 0, 2);
				field320.field1252 = 0;
				field457 = field320.method457();
				var1 -= 2;
			}

			if (var1 < field457) {
				return false;
			}

			field320.field1252 = 0;
			field279.method177(field320.field1251, 0, field457);
			field459 = 0;
			field342 = field341;
			field341 = field340;
			field340 = field458;

			if (field458 == 203) {
				field248 = field320.method457();
				field325 = field320.method491();
				field296 = field320.method476();
				field453 = field320.method482();
				field406 = field320.method474();
				if (field325 != 0 && field262 == -1) {
					signlink.dnslookup(VTCTQQUO.method511(field325));
					method143();
					short var2 = 650;
					if (field406 != 201 || field296 == 1) {
						var2 = 655;
					}

					field361 = "";
					field441 = false;

					for (int var3 = 0; var3 < LYHLTGUG.field839.length; var3++) {
						if (LYHLTGUG.field839[var3] != null && LYHLTGUG.field839[var3].field828 == var2) {
							field262 = LYHLTGUG.field839[var3].field806;
							break;
						}
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 250) {
				int var4 = field320.method455();
				int var5 = field320.method455();
				int var6 = field320.method455();
				int var7 = field320.method455();
				field97[var4] = true;
				field477[var4] = var5;
				field301[var4] = var6;
				field370[var4] = var7;
				field399[var4] = 0;
				field458 = -1;
				return true;
			}

			if (field458 == 57) {
				if (field105 == 12) {
					field429 = true;
				}

				field136 = field320.method458();
				field458 = -1;
				return true;
			}

			if (field458 == 198) {
				field237 = field320.method476();
				if (field237 == field105) {
					if (field237 == 3) {
						field105 = 1;
					} else {
						field105 = 3;
					}

					field429 = true;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 116 || field458 == 177 || field458 == 147 || field458 == 155 || field458 == 126 || field458 == 137 || field458 == 105 || field458 == 113 || field458 == 170 || field458 == 234 || field458 == 217) {
				method124(field458, field320);
				field458 = -1;
				return true;
			}

			if (field458 == 140) {
				field249 = field320.method455();
				field458 = -1;
				return true;
			}

			if (field458 == 136) {
				int var8 = field320.method482();
				int var9 = field320.method482();
				int var10 = var9 >> 10 & 0x1F;
				int var11 = var9 >> 5 & 0x1F;
				int var12 = var9 & 0x1F;
				LYHLTGUG.field839[var8].field851 = (var12 << 3) + (var10 << 19) + (var11 << 11);
				field458 = -1;
				return true;
			}

			if (field458 == 131) {
				field105 = field320.method455();
				field429 = true;
				field401 = true;
				field458 = -1;
				return true;
			}

			if (field458 == 158) {
				field294 = false;
				field493 = 2;
				field299 = "";
				field362 = true;
				field458 = -1;
				return true;
			}

			if (field458 == 36 || field458 == 62) {
				int var13 = field487;
				int var14 = field488;
				if (field458 == 36) {
					var14 = field320.method457();
					var13 = field320.method483();
					field438 = false;
				}

				if (field458 == 62) {
					var13 = field320.method457();
					field320.method465();

					for (int var15 = 0; var15 < 4; var15++) {
						for (int var16 = 0; var16 < 13; var16++) {
							for (int var17 = 0; var17 < 13; var17++) {
								int var18 = field320.method466(1);
								if (var18 == 1) {
									field501[var15][var16][var17] = field320.method466(26);
								} else {
									field501[var15][var16][var17] = -1;
								}
							}
						}
					}

					field320.method467();
					var14 = field320.method483();
					field438 = true;
				}

				if (field487 == var13 && field488 == var14 && field393 == 2) {
					field458 = -1;
					return true;
				}

				field487 = var13;
				field488 = var14;
				field224 = (field487 - 6) * 8;
				field225 = (field488 - 6) * 8;
				field137 = false;
				if ((field487 / 8 == 48 || field487 / 8 == 49) && field488 / 8 == 48) {
					field137 = true;
				}

				if (field487 / 8 == 48 && field488 / 8 == 148) {
					field137 = true;
				}

				field393 = 1;
				field328 = System.currentTimeMillis();
				field449.method399();
				field291.method241(151, 257, "Loading - please wait.", 0);
				field291.method241(150, 256, "Loading - please wait.", 0xFFFFFF);
				field449.method400(4, 4, field9);

				if (field458 == 36) {
					int var19 = 0;
					for (int var20 = (field487 - 6) / 8; var20 <= (field487 + 6) / 8; var20++) {
						for (int var21 = (field488 - 6) / 8; var21 <= (field488 + 6) / 8; var21++) {
							var19++;
						}
					}

					field139 = new byte[var19][];
					field443 = new byte[var19][];
					field240 = new int[var19];
					field241 = new int[var19];
					field242 = new int[var19];
					int var22 = 0;
					for (int var23 = (field487 - 6) / 8; var23 <= (field487 + 6) / 8; var23++) {
						for (int var24 = (field488 - 6) / 8; var24 <= (field488 + 6) / 8; var24++) {
							field240[var22] = (var23 << 8) + var24;

							if (field137 && (var24 == 49 || var24 == 149 || var24 == 147 || var23 == 50 || var23 == 49 && var24 == 47)) {
								field241[var22] = -1;
								field242[var22] = -1;
								var22++;
							} else {
								int var25 = field241[var22] = field430.method199(var24, 0, var23);
								if (var25 != -1) {
									field430.method184(3, var25);
								}

								int var26 = field242[var22] = field430.method199(var24, 1, var23);
								if (var26 != -1) {
									field430.method184(3, var26);
								}

								var22++;
							}
						}
					}
				}

				if (field458 == 62) {
					int var27 = 0;
					int[] var28 = new int[676];
					for (int var29 = 0; var29 < 4; var29++) {
						for (int var30 = 0; var30 < 13; var30++) {
							for (int var31 = 0; var31 < 13; var31++) {
								int var32 = field501[var29][var30][var31];
								if (var32 != -1) {
									int var33 = var32 >> 14 & 0x3FF;
									int var34 = var32 >> 3 & 0x7FF;
									int var35 = (var33 / 8 << 8) + var34 / 8;
									for (int var36 = 0; var36 < var27; var36++) {
										if (var28[var36] == var35) {
											var35 = -1;
											break;
										}
									}

									if (var35 != -1) {
										var28[var27++] = var35;
									}
								}
							}
						}
					}

					field139 = new byte[var27][];
					field443 = new byte[var27][];
					field240 = new int[var27];
					field241 = new int[var27];
					field242 = new int[var27];
					for (int var37 = 0; var37 < var27; var37++) {
						int var38 = field240[var37] = var28[var37];
						int var39 = var38 >> 8 & 0xFF;
						int var40 = var38 & 0xFF;
						int var41 = field241[var37] = field430.method199(var40, 0, var39);
						if (var41 != -1) {
							field430.method184(3, var41);
						}

						int var42 = field242[var37] = field430.method199(var40, 1, var39);
						if (var42 != -1) {
							field430.method184(3, var42);
						}
					}
				}

				int var43 = field224 - field226;
				int var44 = field225 - field227;
				field226 = field224;
				field227 = field225;

				for (int var45 = 0; var45 < 16384; var45++) {
					JKNLPRIU var46 = field322[var45];
					if (var46 != null) {
						for (int var47 = 0; var47 < 10; var47++) {
							var46.field1228[var47] -= var43;
							var46.field1229[var47] -= var44;
						}

						var46.field1235 -= var43 * 128;
						var46.field1236 -= var44 * 128;
					}
				}

				for (int var48 = 0; var48 < field412; var48++) {
					UFGXOLGK var49 = field414[var48];
					if (var49 != null) {
						for (int var50 = 0; var50 < 10; var50++) {
							var49.field1228[var50] -= var43;
							var49.field1229[var50] -= var44;
						}

						var49.field1235 -= var43 * 128;
						var49.field1236 -= var44 * 128;
					}
				}

				field244 = true;
				byte var51 = 0;
				byte var52 = 104;
				byte var53 = 1;
				if (var43 < 0) {
					var51 = 103;
					var52 = -1;
					var53 = -1;
				}

				byte var54 = 0;
				byte var55 = 104;
				byte var56 = 1;
				if (var44 < 0) {
					var54 = 103;
					var55 = -1;
					var56 = -1;
				}

				for (int var57 = var51; var57 != var52; var57 += var53) {
					for (int var58 = var54; var58 != var55; var58 += var56) {
						int var59 = var43 + var57;
						int var60 = var44 + var58;
						for (int var61 = 0; var61 < 4; var61++) {
							if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
								field512[var61][var57][var58] = field512[var61][var59][var60];
							} else {
								field512[var61][var57][var58] = null;
							}
						}
					}
				}

				for (DOIBONME var62 = (DOIBONME) field408.method503(); var62 != null; var62 = (DOIBONME) field408.method505()) {
					var62.field554 -= var43;
					var62.field555 -= var44;
					if (var62.field554 < 0 || var62.field555 < 0 || var62.field554 >= 104 || var62.field555 >= 104) {
						var62.method398();
					}
				}

				if (field354 != 0) {
					field354 -= var43;
					field355 -= var44;
				}

				field235 = false;
				field458 = -1;
				return true;
			}

			if (field458 == 90) {
				field363 = field320.method455();
				if (field363 == 1) {
					field236 = field320.method457();
				}

				if (field363 >= 2 && field363 <= 6) {
					if (field363 == 2) {
						field197 = 64;
						field198 = 64;
					}

					if (field363 == 3) {
						field197 = 0;
						field198 = 64;
					}

					if (field363 == 4) {
						field197 = 128;
						field198 = 64;
					}

					if (field363 == 5) {
						field197 = 64;
						field198 = 0;
					}

					if (field363 == 6) {
						field197 = 64;
						field198 = 128;
					}

					field363 = 2;
					field194 = field320.method457();
					field195 = field320.method457();
					field196 = field320.method455();
				}

				if (field363 == 10) {
					field310 = field320.method457();
				}

				field458 = -1;
				return true;
			}

			if (field458 == 31) {
				int var63 = field320.method458();
				int var64 = field320.method486();
				int var65 = field320.method457();
				LYHLTGUG var66 = LYHLTGUG.field839[var65];
				var66.field808 = var63;
				var66.field812 = var64;
				field458 = -1;
				return true;
			}

			if (field458 == 190) {
				int var67 = field320.method484();
				int var68 = field320.method484();
				LYHLTGUG.field839[var67].field791 = 1;
				LYHLTGUG.field839[var67].field792 = var68;
				field458 = -1;
				return true;
			}

			if (field458 == 132) {
				int var69 = field320.method457();
				int var70 = field320.method483();
				int var71 = field320.method483();
				LYHLTGUG.field839[var71].field803 = (var69 << 16) + var70;
				field458 = -1;
				return true;
			}

			if (field458 == 0) {
				field397 = field320.method455();
				field429 = true;
				field458 = -1;
				return true;
			}

			if (field458 == 8) {
				int var72 = field320.method484();
				int var73 = field320.method490();
				field309[var72] = var73;

				if (field251[var72] != var73) {
					field251[var72] = var73;
					method165(var72);
					field429 = true;

					if (field106 != -1) {
						field362 = true;
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 161) {
				method137(field320, field457);
				field244 = false;
				field458 = -1;
				return true;
			}

			if (field458 == 2) {
				field294 = false;
				field493 = 1;
				field299 = "";
				field362 = true;
				field458 = -1;
				return true;
			}

			if (field458 == 75) {
				field335 = field320.method455();
				field336 = field320.method474();
				for (int var74 = field335; var74 < field335 + 8; var74++) {
					for (int var75 = field336; var75 < field336 + 8; var75++) {
						if (field512[field480][var74][var75] != null) {
							field512[field480][var74][var75] = null;
							method66(var74, var75);
						}
					}
				}

				for (DOIBONME var76 = (DOIBONME) field408.method503(); var76 != null; var76 = (DOIBONME) field408.method505()) {
					if (var76.field554 >= field335 && var76.field554 < field335 + 8 && var76.field555 >= field336 && var76.field555 < field336 + 8 && field480 == var76.field552) {
						var76.field550 = 0;
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 145) {
				field235 = true;
				field129 = field320.method455();
				field130 = field320.method455();
				field131 = field320.method457();
				field132 = field320.method455();
				field133 = field320.method455();
				if (field133 >= 100) {
					field159 = field129 * 128 + 64;
					field161 = field130 * 128 + 64;
					field160 = method72(field161, field159, field480) - field131;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 12) {
				int var77 = field320.method484();
				method136(var77);
				field262 = -1;
				field492 = -1;
				field298 = -1;
				field493 = 0;
				field442 = false;
				field471 = var77;
				field458 = -1;
				return true;
			}

			if (field458 == 35) {
				field481 = field320.method455();
				field458 = -1;
				return true;
			}

			if (field458 == 168) {
				field235 = false;

				for (int var78 = 0; var78 < 5; var78++) {
					field97[var78] = false;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 253) {
				field354 = 0;
				field458 = -1;
				return true;
			}

			if (field458 == 207) {
				field429 = true;
				int var79 = field320.method457();
				LYHLTGUG var80 = LYHLTGUG.field839[var79];
				while (field320.field1252 < field457) {
					int var81 = field320.method469();
					int var82 = field320.method457();
					int var83 = field320.method455();
					if (var83 == 255) {
						var83 = field320.method460();
					}

					if (var81 >= 0 && var81 < var80.field843.length) {
						var80.field843[var81] = var82;
						var80.field796[var81] = var83;
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 247) {
				long var84 = field320.method461();
				int var86 = field320.method460();
				int var87 = field320.method455();
				boolean var88 = false;
				for (int var89 = 0; var89 < 100; var89++) {
					if (field319[var89] == var86) {
						var88 = true;
						break;
					}
				}

				if (var87 <= 1) {
					for (int var90 = 0; var90 < field222; var90++) {
						if (field353[var90] == var84) {
							var88 = true;
							break;
						}
					}
				}

				if (!var88 && field422 == 0) {
					try {
						field319[field91] = var86;
						field91 = (field91 + 1) % 100;
						String var91 = CHVNTVHC.method37(field320, field457 - 13);
						if (var87 != 3) {
							var91 = ZCOZUVWP.method567(var91);
						}

						if (var87 == 2 || var87 == 3) {
							method104("@cr2@" + VTCTQQUO.method512(VTCTQQUO.method509(var84)), var91, 7);
						} else if (var87 == 1) {
							method104("@cr1@" + VTCTQQUO.method512(VTCTQQUO.method509(var84)), var91, 7);
						} else {
							method104(VTCTQQUO.method512(VTCTQQUO.method509(var84)), var91, 3);
						}
					} catch (Exception var190) {
						signlink.reporterror("cde1");
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 19) {
				for (int var93 = 0; var93 < field251.length; var93++) {
					if (field309[var93] != field251[var93]) {
						field251[var93] = field309[var93];
						method165(var93);
						field429 = true;
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 25) {
				int var94 = field320.method458();
				if (var94 >= 0) {
					method136(var94);
				}

				field297 = var94;
				field458 = -1;
				return true;
			}

			if (field458 == 58) {
				method148(field320, field457);
				field458 = -1;
				return true;
			}

			if (field458 == 72) {
				boolean var95 = field320.method474() == 1;
				int var96 = field320.method482();
				LYHLTGUG.field839[var96].field852 = var95;
				field458 = -1;
				return true;
			}

			if (field458 == 11) {
				field332 = field320.method483();
				field331 = field320.method476();
				field458 = -1;
				return true;
			}

			if (field458 == 135) {
				field429 = true;
				int var97 = field320.method457();
				LYHLTGUG var98 = LYHLTGUG.field839[var97];
				int var99 = field320.method457();
				for (int var100 = 0; var100 < var99; var100++) {
					var98.field843[var100] = field320.method483();
					int var101 = field320.method475();
					if (var101 == 255) {
						var101 = field320.method489();
					}

					var98.field796[var100] = var101;
				}

				for (int var102 = var99; var102 < var98.field843.length; var102++) {
					var98.field843[var102] = 0;
					var98.field796[var102] = 0;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 193) {
				String var103 = field320.method462();
				if (var103.endsWith(":tradereq:")) {
					String var104 = var103.substring(0, var103.indexOf(":"));
					long var105 = VTCTQQUO.method508(var104);
					boolean var107 = false;
					for (int var108 = 0; var108 < field222; var108++) {
						if (field353[var108] == var105) {
							var107 = true;
							break;
						}
					}

					if (!var107 && field422 == 0) {
						method104(var104, "wishes to trade with you.", 4);
					}
				} else if (var103.endsWith(":duelreq:")) {
					String var109 = var103.substring(0, var103.indexOf(":"));
					long var110 = VTCTQQUO.method508(var109);
					boolean var112 = false;
					for (int var113 = 0; var113 < field222; var113++) {
						if (field353[var113] == var110) {
							var112 = true;
							break;
						}
					}

					if (!var112 && field422 == 0) {
						method104(var109, "wishes to duel with you.", 8);
					}
				} else if (var103.endsWith(":chalreq:")) {
					String var114 = var103.substring(0, var103.indexOf(":"));
					long var115 = VTCTQQUO.method508(var114);
					boolean var117 = false;
					for (int var118 = 0; var118 < field222; var118++) {
						if (field353[var118] == var115) {
							var117 = true;
							break;
						}
					}

					if (!var117 && field422 == 0) {
						String var119 = var103.substring(var103.indexOf(":") + 1, var103.length() - 9);
						method104(var114, var119, 8);
					}
				} else {
					method104("", var103, 0);
				}

				field458 = -1;
				return true;
			}

			if (field458 == 182) {
				byte var120 = field320.method477();
				int var121 = field320.method484();
				field309[var121] = var120;

				if (field251[var121] != var120) {
					field251[var121] = var120;
					method165(var121);
					field429 = true;

					if (field106 != -1) {
						field362 = true;
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 187) {
				field335 = field320.method455();
				field336 = field320.method475();

				while (field320.field1252 < field457) {
					int var122 = field320.method455();
					method124(var122, field320);
				}

				field458 = -1;
				return true;
			}

			if (field458 == 178) {
				int var123 = field320.method457();
				int var124 = field320.method482();

				if (field298 != -1) {
					field298 = -1;
					field362 = true;
				}

				if (field493 != 0) {
					field493 = 0;
					field362 = true;
				}

				field262 = var123;
				field492 = var124;
				field429 = true;
				field401 = true;
				field442 = false;
				field458 = -1;
				return true;
			}

			if (field458 == 205) {
				for (int var125 = 0; var125 < field414.length; var125++) {
					if (field414[var125] != null) {
						field414[var125].field1196 = -1;
					}
				}

				for (int var126 = 0; var126 < field322.length; var126++) {
					if (field322[var126] != null) {
						field322[var126].field1196 = -1;
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 33) {
				int var127 = field320.method484();
				int var128 = field320.method486();
				LYHLTGUG var129 = LYHLTGUG.field839[var127];
				if (var129.field830 != var128 || var128 == -1) {
					var129.field830 = var128;
					var129.field848 = 0;
					var129.field850 = 0;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 39) {
				int var130 = field320.method483();
				int var131 = field320.method457();
				int var132 = field320.method457();
				int var133 = field320.method482();
				LYHLTGUG.field839[var132].field823 = var133;
				LYHLTGUG.field839[var132].field824 = var130;
				LYHLTGUG.field839[var132].field822 = var131;
				field458 = -1;
				return true;
			}

			if (field458 == 91) {
				field222 = field457 / 8;
				for (int var134 = 0; var134 < field222; var134++) {
					field353[var134] = field320.method461();
				}

				field458 = -1;
				return true;
			}

			if (field458 == 38) {
				int var135 = field320.method482();
				int var136 = field320.method483();
				LYHLTGUG.field839[var136].field791 = 2;
				LYHLTGUG.field839[var136].field792 = var135;
				field458 = -1;
				return true;
			}

			if (field458 == 87) {
				int var137 = field320.method482();
				method136(var137);

				if (field298 != -1) {
					field298 = -1;
					field362 = true;
				}

				if (field493 != 0) {
					field493 = 0;
					field362 = true;
				}

				if (field471 != -1) {
					field471 = -1;
					field365 = true;
				}

				field492 = var137;
				field429 = true;
				field401 = true;
				field262 = -1;
				field442 = false;
				field458 = -1;
				return true;
			}

			if (field458 == 184) {
				long var138 = field320.method461();
				int var140 = field320.method455();
				String var141 = VTCTQQUO.method512(VTCTQQUO.method509(var138));
				for (int var142 = 0; var142 < field396; var142++) {
					if (field275[var142] == var138) {
						if (field138[var142] != var140) {
							field138[var142] = var140;
							field429 = true;

							if (var140 > 0) {
								method104("", var141 + " has logged in.", 5);
							}

							if (var140 == 0) {
								method104("", var141 + " has logged out.", 5);
							}
						}

						var141 = null;
						break;
					}
				}

				if (var141 != null && field396 < 200) {
					field275[field396] = var138;
					field513[field396] = var141;
					field138[field396] = var140;
					field396++;
					field429 = true;
				}

				boolean var143 = false;
				while (!var143) {
					var143 = true;
					for (int var144 = 0; var144 < field396 - 1; var144++) {
						if (field138[var144] != field166 && field138[var144 + 1] == field166 || field138[var144] == 0 && field138[var144 + 1] != 0) {
							int var145 = field138[var144];
							field138[var144] = field138[var144 + 1];
							field138[var144 + 1] = var145;
							String var146 = field513[var144];
							field513[var144] = field513[var144 + 1];
							field513[var144 + 1] = var146;
							long var147 = field275[var144];
							field275[var144] = field275[var144 + 1];
							field275[var144 + 1] = var147;
							field429 = true;
							var143 = false;
						}
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 189) {
				field503 = field320.method455();
				field311 = field320.method455();
				field455 = field320.method455();
				field405 = true;
				field362 = true;
				field458 = -1;
				return true;
			}

			if (field458 == 220) {
				int var149 = field320.method482();
				LYHLTGUG.field839[var149].field791 = 3;

				if (field378.field1276 == null) {
					LYHLTGUG.field839[var149].field792 = (field378.field1266[11] << 5) + (field378.field1266[8] << 10) + (field378.field1266[0] << 15) + (field378.field1271[0] << 25) + (field378.field1271[4] << 20) + field378.field1266[1];
				} else {
					LYHLTGUG.field839[var149].field792 = (int) (field378.field1276.field715 + 0x12345678L);
				}

				field458 = -1;
				return true;
			}

			if (field458 == 238) {
				field468 = field320.method483() * 30;
				field458 = -1;
				return true;
			}

			if (field458 == 4) {
				field336 = field320.method476();
				field335 = field320.method455();
				field458 = -1;
				return true;
			}

			if (field458 == 197) {
				int var150 = field320.method485();
				field106 = var150;
				field362 = true;
				field458 = -1;
				return true;
			}

			if (field458 == 77) {
				int var151 = field320.method457();
				int var152 = field320.method455();

				if (var151 == 0xFFFF) {
					var151 = -1;
				}

				field371[var152] = var151;
				field429 = true;
				field401 = true;
				field458 = -1;
				return true;
			}

			if (field458 == 20) {
				if (field105 == 12) {
					field429 = true;
				}

				field185 = field320.method455();
				field458 = -1;
				return true;
			}

			if (field458 == 10) {
				if (field492 != -1) {
					field492 = -1;
					field429 = true;
					field401 = true;
				}

				if (field298 != -1) {
					field298 = -1;
					field362 = true;
				}

				if (field471 != -1) {
					field471 = -1;
					field365 = true;
				}

				if (field493 != 0) {
					field493 = 0;
					field362 = true;
				}

				field262 = -1;
				field442 = false;
				field458 = -1;
				return true;
			}

			if (field458 == 48) {
				field235 = true;
				field229 = field320.method455();
				field230 = field320.method455();
				field231 = field320.method457();
				field232 = field320.method455();
				field233 = field320.method455();
				if (field233 >= 100) {
					int var153 = field229 * 128 + 64;
					int var154 = field230 * 128 + 64;
					int var155 = method72(var154, var153, field480) - field231;
					int var156 = var153 - field159;
					int var157 = var155 - field160;
					int var158 = var154 - field161;
					int var159 = (int) Math.sqrt(var156 * var156 + var158 * var158);
					field162 = (int) (Math.atan2(var157, var159) * 325.949D) & 0x7FF;
					field163 = (int) (Math.atan2(var156, var158) * -325.949D) & 0x7FF;

					if (field162 < 128) {
						field162 = 128;
					}

					if (field162 > 383) {
						field162 = 383;
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 175) {
				int var160 = field320.method482();
				LYHLTGUG var161 = LYHLTGUG.field839[var160];
				for (int var162 = 0; var162 < var161.field843.length; var162++) {
					var161.field843[var162] = -1;
					var161.field843[var162] = 0;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 166) {
				int var163 = field320.method483();
				method136(var163);

				if (field492 != -1) {
					field492 = -1;
					field429 = true;
					field401 = true;
				}

				if (field471 != -1) {
					field471 = -1;
					field365 = true;
				}

				field298 = var163;
				field362 = true;
				field262 = -1;
				field442 = false;
				field458 = -1;
				return true;
			}

			if (field458 == 139) {
				method78();
				field458 = -1;
				return false;
			}

			if (field458 == 119) {
				String var164 = field320.method462();
				int var165 = field320.method457();
				LYHLTGUG.field839[var165].field854 = var164;

				if (field371[field105] == LYHLTGUG.field839[var165].field806) {
					field429 = true;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 85) {
				int var166 = field320.method475();
				String var167 = field320.method462();
				int var168 = field320.method455();
				if (var166 >= 1 && var166 <= 5) {
					if (var167.equalsIgnoreCase("null")) {
						var167 = null;
					}

					field108[var166 - 1] = var167;
					field109[var166 - 1] = var168 == 0;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 52) {
				int var169 = field320.method482();
				if (var169 == 0xFFFF) {
					var169 = -1;
				}

				if (field420 != var169 && field470 && !field169 && field183 == 0) {
					field326 = var169;
					field327 = true;
					field430.method184(2, field326);
				}

				field420 = var169;
				field458 = -1;
				return true;
			}

			if (field458 == 146) {
				int var170 = field320.method487();
				int var171 = field320.method457();
				if (field470 && !field169) {
					field326 = var171;
					field327 = false;
					field430.method184(2, field326);
					field183 = var170;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 60) {
				field429 = true;
				int var172 = field320.method490();
				int var173 = field320.method475();
				int var174 = field320.method475();
				field247[var173] = var172;
				field152[var173] = var174;
				field189[var173] = 1;
				for (int var175 = 0; var175 < 98; var175++) {
					if (var172 >= field407[var175]) {
						field189[var173] = var175 + 2;
					}
				}

				field458 = -1;
				return true;
			}

			if (field458 == 208) {
				int var176 = field320.method457();
				int var177 = field320.method455();
				int var178 = field320.method457();
				if (field214 && !field169 && field182 < 50) {
					field421[field182] = var176;
					field252[field182] = var177;
					field186[field182] = HNYSLMKN.field637[var176] + var178;
					field182++;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 5) {
				int var179 = field320.method483();
				int var180 = field320.method484();
				LYHLTGUG var181 = LYHLTGUG.field839[var179];
				if (var181 != null && var181.field799 == 0) {
					if (var180 < 0) {
						var180 = 0;
					}

					if (var180 > var181.field832 - var181.field855) {
						var180 = var181.field832 - var181.field855;
					}

					var181.field798 = var180;
				}

				field458 = -1;
				return true;
			}

			if (field458 == 111) {
				int var182 = field320.method482();
				method136(var182);

				if (field492 != -1) {
					field492 = -1;
					field429 = true;
					field401 = true;
				}

				if (field298 != -1) {
					field298 = -1;
					field362 = true;
				}

				if (field471 != -1) {
					field471 = -1;
					field365 = true;
				}

				if (field493 != 0) {
					field493 = 0;
					field362 = true;
				}

				field262 = var182;
				field442 = false;
				field458 = -1;
				return true;
			}

			if (field458 == 142) {
				int var183 = field320.method484();
				int var184 = field320.method483();
				int var185 = field320.method482();
				if (var185 == 0xFFFF) {
					LYHLTGUG.field839[var184].field791 = 0;
					field458 = -1;
					return true;
				}

				MHOZCPTF var186 = MHOZCPTF.method322(var185);
				LYHLTGUG.field839[var184].field791 = 4;
				LYHLTGUG.field839[var184].field792 = var185;
				LYHLTGUG.field839[var184].field823 = var186.field884;
				LYHLTGUG.field839[var184].field824 = var186.field881;
				LYHLTGUG.field839[var184].field822 = var186.field905 * 100 / var183;
				field458 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field458 + "," + field457 + " - " + field341 + "," + field342);
			method78();
		} catch (IOException var191) {
			method150();
		} catch (Exception var192) {
			String var188 = "T2 - " + field458 + "," + field341 + "," + field342 + " - " + field457 + "," + (field378.field1228[0] + field224) + "," + (field378.field1229[0] + field225) + " - ";
			for (int var189 = 0; var189 < field457 && var189 < 50; var189++) {
				var188 = var188 + field320.field1251[var189] + ",";
			}

			signlink.reporterror(var188);
			method78();
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIIIILLYHLTGUG;I)V")
	public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, LYHLTGUG arg6, int arg7) {
		if (field228) {
			field238 = 32;
		} else {
			field238 = 0;
		}

		field228 = false;
		if (arg2 >= arg4 && arg2 < arg4 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
			arg6.field798 -= field184 * 4;

			if (arg5 == 1) {
				field429 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field362 = true;
			}
		} else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg7 >= arg0 + arg3 - 16 && arg7 < arg0 + arg3) {
			arg6.field798 += field184 * 4;

			if (arg5 == 1) {
				field429 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field362 = true;
			}
		} else if (arg2 >= arg4 - field238 && arg2 < arg4 + field238 + 16 && arg7 >= arg3 + 16 && arg7 < arg0 + arg3 - 16 && field184 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg3 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg6.field798 = (arg1 - arg0) * var10 / var11;

			if (arg5 == 1) {
				field429 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field362 = true;
			}

			field228 = true;
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method121(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method122(boolean arg0) {
		for (int var2 = 0; var2 < field323; var2++) {
			JKNLPRIU var3 = field322[field324[var2]];
			int var4 = (field324[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method287() && var3.field750.field741 == arg0 && var3.field750.method280()) {
				int var5 = var3.field1235 >> 7;
				int var6 = var3.field1236 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1230 == 1 && (var3.field1235 & 0x7F) == 0x40 && (var3.field1236 & 0x7F) == 0x40) {
						if (field473[var5][var6] == field289) {
							continue;
						}

						field473[var5][var6] = field289;
					}

					if (!var3.field750.field713) {
						var4 += Integer.MIN_VALUE;
					}

					field339.method353((var3.field1230 - 1) * 64 + 60, var3.field1235, var3.field1237, var4, method72(var3.field1236, var3.field1235, field480), field480, var3.field1236, var3, var3.field1234);
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method123() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(IILUAWAYCTK;)V")
	public final void method124(int arg0, UAWAYCTK arg1) {
		if (arg0 == 105) {
			int var3 = arg1.method474();
			int var4 = (var3 >> 4 & 0x7) + field335;
			int var5 = (var3 & 0x7) + field336;
			int var6 = arg1.method484();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				URASIGRB var7 = field512[field480][var4][var5];
				if (var7 != null) {
					for (KWSTKWPH var8 = (KWSTKWPH) var7.method503(); var8 != null; var8 = (KWSTKWPH) var7.method505()) {
						if ((var6 & 0x7FFF) == var8.field774) {
							var8.method398();
							break;
						}
					}

					if (var7.method503() == null) {
						field512[field480][var4][var5] = null;
					}

					method66(var4, var5);
				}
			}
		} else {
			if (arg0 == 147) {
				byte var9 = arg1.method477();
				int var10 = arg1.method484();
				int var11 = arg1.method483();
				byte var12 = arg1.method478();
				int var13 = arg1.method455();
				int var14 = (var13 >> 4 & 0x7) + field335;
				int var15 = (var13 & 0x7) + field336;
				byte var16 = arg1.method478();
				int var17 = arg1.method476();
				int var18 = var17 >> 2;
				int var19 = var17 & 0x3;
				int var20 = field502[var18];
				byte var21 = arg1.method477();
				int var22 = arg1.method484();
				int var23 = arg1.method457();
				UFGXOLGK var24;
				if (field332 == var11) {
					var24 = field378;
				} else {
					var24 = field414[var11];
				}

				if (var24 != null) {
					BQKZHFKO var25 = BQKZHFKO.method24(var10);
					int var26 = field317[field480][var14][var15];
					int var27 = field317[field480][var14 + 1][var15];
					int var28 = field317[field480][var14 + 1][var15 + 1];
					int var29 = field317[field480][var14][var15 + 1];
					WEVRTBOZ var30 = var25.method20(var18, var19, var26, var27, var28, var29, -1);
					if (var30 != null) {
						method50(0, field480, var22 + 1, var14, var23 + 1, -1, var15, 0, var20);
						var24.field1284 = field306 + var23;
						var24.field1285 = field306 + var22;
						var24.field1280 = var30;
						int var31 = var25.field65;
						int var32 = var25.field53;
						if (var19 == 1 || var19 == 3) {
							var31 = var25.field53;
							var32 = var25.field65;
						}

						var24.field1277 = var14 * 128 + var31 * 64;
						var24.field1279 = var15 * 128 + var32 * 64;
						var24.field1278 = method72(var24.field1279, var24.field1277, field480);

						if (var16 > var9) {
							byte var33 = var16;
							var16 = var9;
							var9 = var33;
						}

						if (var12 > var21) {
							byte var34 = var12;
							var12 = var21;
							var21 = var34;
						}

						var24.field1286 = var14 + var16;
						var24.field1288 = var9 + var14;
						var24.field1287 = var12 + var15;
						var24.field1289 = var15 + var21;
					}
				}
			}

			if (arg0 == 177) {
				int var35 = arg1.method455();
				int var36 = (var35 >> 4 & 0x7) + field335;
				int var37 = (var35 & 0x7) + field336;
				int var38 = arg1.method457();
				int var39 = arg1.method457();
				int var40 = arg1.method457();
				if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
					URASIGRB var41 = field512[field480][var36][var37];
					if (var41 != null) {
						for (KWSTKWPH var42 = (KWSTKWPH) var41.method503(); var42 != null; var42 = (KWSTKWPH) var41.method505()) {
							if ((var38 & 0x7FFF) == var42.field774 && var42.field775 == var39) {
								var42.field775 = var40;
								break;
							}
						}

						method66(var36, var37);
					}
				}
			} else if (arg0 == 170) {
				int var43 = arg1.method476();
				int var44 = var43 >> 2;
				int var45 = var43 & 0x3;
				int var46 = field502[var44];
				int var47 = arg1.method483();
				int var48 = arg1.method475();
				int var49 = (var48 >> 4 & 0x7) + field335;
				int var50 = (var48 & 0x7) + field336;
				if (var49 >= 0 && var50 >= 0 && var49 < 103 && var50 < 103) {
					int var51 = field317[field480][var49][var50];
					int var52 = field317[field480][var49 + 1][var50];
					int var53 = field317[field480][var49 + 1][var50 + 1];
					int var54 = field317[field480][var49][var50 + 1];
					if (var46 == 0) {
						RHPEPMYB var55 = field339.method364(var50, field480, var49);
						if (var55 != null) {
							int var56 = var55.field1109 >> 14 & 0x7FFF;
							if (var44 == 2) {
								var55.field1107 = new JBYEFPCA(var52, var47, var54, var56, var53, 2, var45 + 4, var51, false);
								var55.field1108 = new JBYEFPCA(var52, var47, var54, var56, var53, 2, var45 + 1 & 0x3, var51, false);
							} else {
								var55.field1107 = new JBYEFPCA(var52, var47, var54, var56, var53, var44, var45, var51, false);
							}
						}
					}

					if (var46 == 1) {
						YCORPECD var57 = field339.method365(field480, var50, var49);
						if (var57 != null) {
							var57.field1478 = new JBYEFPCA(var52, var47, var54, var57.field1479 >> 14 & 0x7FFF, var53, 4, 0, var51, false);
						}
					}

					if (var46 == 2) {
						KYNACCRF var58 = field339.method366(var50, var49, field480);

						if (var44 == 11) {
							var44 = 10;
						}

						if (var58 != null) {
							var58.field780 = new JBYEFPCA(var52, var47, var54, var58.field788 >> 14 & 0x7FFF, var53, var44, var45, var51, false);
						}
					}

					if (var46 == 3) {
						IGKQCLHR var59 = field339.method367(field480, var50, var49);
						if (var59 != null) {
							var59.field671 = new JBYEFPCA(var52, var47, var54, var59.field672 >> 14 & 0x7FFF, var53, 22, var45, var51, false);
						}
					}
				}
			} else if (arg0 == 217) {
				int var60 = arg1.method455();
				int var61 = var60 >> 2;
				int var62 = var60 & 0x3;
				int var63 = field502[var61];
				int var64 = arg1.method474();
				int var65 = (var64 >> 4 & 0x7) + field335;
				int var66 = (var64 & 0x7) + field336;
				int var67 = arg1.method484();
				if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
					method50(var62, field480, -1, var65, 0, var67, var66, var61, var63);
				}
			} else {
				if (arg0 == 116) {
					int var68 = arg1.method455();
					int var69 = (var68 >> 4 & 0x7) + field335;
					int var70 = (var68 & 0x7) + field336;
					int var71 = arg1.method457();
					int var72 = arg1.method455();
					int var73 = var72 >> 4 & 0xF;
					int var74 = var72 & 0x7;
					if (field378.field1228[0] >= var69 - var73 && field378.field1228[0] <= var69 + var73 && field378.field1229[0] >= var70 - var73 && field378.field1229[0] <= var70 + var73 && field214 && !field169 && field182 < 50) {
						field421[field182] = var71;
						field252[field182] = var74;
						field186[field182] = HNYSLMKN.field637[var71];
						field182++;
					}
				}

				if (arg0 == 234) {
					int var75 = arg1.method455();
					int var76 = var75 >> 2;
					int var77 = var75 & 0x3;
					int var78 = field502[var76];
					int var79 = arg1.method474();
					int var80 = (var79 >> 4 & 0x7) + field335;
					int var81 = (var79 & 0x7) + field336;
					if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
						method50(var77, field480, -1, var80, 0, -1, var81, var76, var78);
					}
				} else if (arg0 == 137) {
					int var82 = arg1.method455();
					int var83 = (var82 >> 4 & 0x7) + field335;
					int var84 = (var82 & 0x7) + field336;
					int var85 = var83 + arg1.method456();
					int var86 = var84 + arg1.method456();
					int var87 = arg1.method458();
					int var88 = arg1.method457();
					int var89 = arg1.method455() * 4;
					int var90 = arg1.method455() * 4;
					int var91 = arg1.method457();
					int var92 = arg1.method457();
					int var93 = arg1.method455();
					int var94 = arg1.method455();
					if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var88 != 0xFFFF) {
						var83 = var83 * 128 + 64;
						var84 = var84 * 128 + 64;
						var85 = var85 * 128 + 64;
						var86 = var86 * 128 + 64;
						TIUPWCPE var95 = new TIUPWCPE(field306 + var91, var84, var87, var83, field480, var90, var88, var93, var94, method72(var84, var83, field480) - var89, field306 + var92);
						var95.method425(method72(var86, var85, field480) - var90, var85, var86, field306 + var91);
						field181.method500(var95);
					}
				} else if (arg0 == 155) {
					int var96 = arg1.method484();
					int var97 = arg1.method476();
					int var98 = (var97 >> 4 & 0x7) + field335;
					int var99 = (var97 & 0x7) + field336;
					int var100 = arg1.method457();
					int var101 = arg1.method484();
					if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && field332 != var101) {
						KWSTKWPH var102 = new KWSTKWPH();
						var102.field774 = var100;
						var102.field775 = var96;

						if (field512[field480][var98][var99] == null) {
							field512[field480][var98][var99] = new URASIGRB();
						}

						field512[field480][var98][var99].method500(var102);
						method66(var98, var99);
					}
				} else if (arg0 == 113) {
					int var103 = arg1.method482();
					int var104 = arg1.method475();
					int var105 = (var104 >> 4 & 0x7) + field335;
					int var106 = (var104 & 0x7) + field336;
					int var107 = arg1.method482();
					if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
						KWSTKWPH var108 = new KWSTKWPH();
						var108.field774 = var103;
						var108.field775 = var107;

						if (field512[field480][var105][var106] == null) {
							field512[field480][var105][var106] = new URASIGRB();
						}

						field512[field480][var105][var106].method500(var108);
						method66(var105, var106);
					}
				} else if (arg0 == 126) {
					int var109 = arg1.method455();
					int var110 = (var109 >> 4 & 0x7) + field335;
					int var111 = (var109 & 0x7) + field336;
					int var112 = arg1.method457();
					int var113 = arg1.method455();
					int var114 = arg1.method457();
					if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
						var110 = var110 * 128 + 64;
						var111 = var111 * 128 + 64;
						HSFTIQUW var115 = new HSFTIQUW(var110, field306, field480, var114, method72(var111, var110, field480) - var113, var111, var112);
						field398.method500(var115);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method125() {
		field112 = 0;
		for (int var1 = -1; var1 < field415 + field323; var1++) {
			TTYUWHXI var2;
			if (var1 == -1) {
				var2 = field378;
			} else if (var1 < field415) {
				var2 = field414[field416[var1]];
			} else {
				var2 = field322[field324[var1 - field415]];
			}

			if (var2 != null && var2.method287()) {
				if (var2 instanceof JKNLPRIU) {
					JKAPIYZO var3 = ((JKNLPRIU) var2).field750;
					if (var3.field720 != null) {
						var3 = var3.method282();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field415) {
					JKAPIYZO var6 = ((JKNLPRIU) var2).field750;
					if (var6.field746 >= 0 && var6.field746 < field411.length) {
						method162(var2.field1246 + 15, var2);

						if (field312 > -1) {
							field411[var6.field746].method232(field312 - 12, field313 - 30);
						}
					}

					if (field363 == 1 && field324[var1 - field415] == field236 && field306 % 20 < 10) {
						method162(var2.field1246 + 15, var2);

						if (field312 > -1) {
							field410[0].method232(field312 - 12, field313 - 28);
						}
					}
				} else {
					int var4 = 30;
					UFGXOLGK var5 = (UFGXOLGK) var2;
					if (var5.field1270 != -1 || var5.field1273 != -1) {
						method162(var2.field1246 + 15, var2);

						if (field312 > -1) {
							if (var5.field1270 != -1) {
								field494[var5.field1270].method232(field312 - 12, field313 - var4);
								var4 += 25;
							}

							if (var5.field1273 != -1) {
								field411[var5.field1273].method232(field312 - 12, field313 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field363 == 10 && field416[var1] == field310) {
						method162(var2.field1246 + 15, var2);

						if (field312 > -1) {
							field410[1].method232(field312 - 12, field313 - var4);
						}
					}
				}

				if (var2.field1232 != null && (var1 >= field415 || field503 == 0 || field503 == 3 || field503 == 1 && method79(((UFGXOLGK) var2).field1283))) {
					method162(var2.field1246, var2);

					if (field312 > -1 && field112 < field113) {
						field117[field112] = field292.method244(var2.field1232) / 2;
						field116[field112] = field292.field665;
						field114[field112] = field312;
						field115[field112] = field313;
						field118[field112] = var2.field1215;
						field119[field112] = var2.field1216;
						field120[field112] = var2.field1222;
						field121[field112++] = var2.field1232;

						if (field337 == 0 && var2.field1216 >= 1 && var2.field1216 <= 3) {
							field116[field112] += 10;
							field115[field112] += 5;
						}

						if (field337 == 0 && var2.field1216 == 4) {
							field117[field112] = 60;
						}

						if (field337 == 0 && var2.field1216 == 5) {
							field116[field112] += 5;
						}
					}
				}

				if (var2.field1217 > field306) {
					method162(var2.field1246 + 15, var2);

					if (field312 > -1) {
						int var7 = var2.field1218 * 30 / var2.field1219;
						if (var7 > 30) {
							var7 = 30;
						}

						TTGPXKMD.method432(0xFF00, field313 - 3, 5, field312 - 15, var7);
						TTGPXKMD.method432(0xFF0000, field313 - 3, 5, field312 + var7 - 15, 30 - var7);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1250[var8] > field306) {
						method162(var2.field1246 / 2, var2);

						if (field312 > -1) {
							if (var8 == 1) {
								field313 -= 20;
							}

							if (var8 == 2) {
								field312 -= 15;
								field313 -= 10;
							}

							if (var8 == 3) {
								field312 += 15;
								field313 -= 10;
							}

							field265[var2.field1249[var8]].method232(field312 - 12, field313 - 12);
							field290.method241(field313 + 4, field312, String.valueOf(var2.field1248[var8]), 0);
							field290.method241(field313 + 3, field312 - 1, String.valueOf(var2.field1248[var8]), 0xFFFFFF);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field112; var9++) {
			int var10 = field114[var9];
			int var11 = field115[var9];
			int var12 = field117[var9];
			int var13 = field116[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field115[var15] - field116[var15] && var11 - var13 < field115[var15] + 2 && var10 - var12 < field117[var15] + field114[var15] && var10 + var12 > field114[var15] - field117[var15] && field115[var15] - field116[var15] < var11) {
						var11 = field115[var15] - field116[var15];
						var14 = true;
					}
				}
			}

			field312 = field114[var9];
			field313 = field115[var9] = var11;
			String var16 = field121[var9];
			if (field337 == 0) {
				int var17 = 0xFFFF00;
				if (field118[var9] < 6) {
					var17 = field464[field118[var9]];
				}

				if (field118[var9] == 6) {
					var17 = field289 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field118[var9] == 7) {
					var17 = field289 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field118[var9] == 8) {
					var17 = field289 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field118[var9] == 9) {
					int var18 = 150 - field120[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field118[var9] == 10) {
					int var19 = 150 - field120[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field118[var9] == 11) {
					int var20 = 150 - field120[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field119[var9] == 0) {
					field292.method241(field313 + 1, field312, var16, 0);
					field292.method241(field313, field312, var16, var17);
				}

				if (field119[var9] == 1) {
					field292.method246(field313 + 1, var16, field289, 0, field312);
					field292.method246(field313, var16, field289, var17, field312);
				}

				if (field119[var9] == 2) {
					field292.method247(0, field289, field313 + 1, var16, field312);
					field292.method247(var17, field289, field313, var16, field312);
				}

				if (field119[var9] == 3) {
					field292.method248(field289, 0, field312, var16, 150 - field120[var9], field313 + 1);
					field292.method248(field289, var17, field312, var16, 150 - field120[var9], field313);
				}

				if (field119[var9] == 4) {
					int var21 = field292.method244(var16);
					int var22 = (150 - field120[var9]) * (var21 + 100) / 150;
					TTGPXKMD.method429(0, field312 + 50, 334, field312 - 50);
					field292.method245(0, field312 + 50 - var22, field313 + 1, var16);
					field292.method245(var17, field312 + 50 - var22, field313, var16);
					TTGPXKMD.method428();
				}

				if (field119[var9] == 5) {
					int var23 = 150 - field120[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					TTGPXKMD.method429(field313 - field292.field665 - 1, 512, field313 + 5, 0);
					field292.method241(field313 + var24 + 1, field312, var16, 0);
					field292.method241(field313 + var24, field312, var16, var17);
					TTGPXKMD.method428();
				}
			} else {
				field292.method241(field313 + 1, field312, var16, 0);
				field292.method241(field313, field312, var16, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method10() {
		field365 = true;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field339.method368(arg2, arg4, arg1);
		if (var6 != 0) {
			int var7 = field339.method372(arg2, arg4, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field356.field652;
			int var12 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			BQKZHFKO var14 = BQKZHFKO.method24(var13);
			if (var14.field40 == -1) {
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
				XHDQQNIR var15 = field345[var14.field40];
				if (var15 != null) {
					int var16 = (var14.field65 * 4 - var15.field1449) / 2;
					int var17 = (var14.field53 * 4 - var15.field1450) / 2;
					var15.method555(arg4 * 4 + var16 + 48, (104 - arg1 - var14.field53) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field339.method370(arg2, arg4, arg1);
		if (var18 != 0) {
			int var19 = field339.method372(arg2, arg4, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			BQKZHFKO var23 = BQKZHFKO.method24(var22);
			if (var23.field40 != -1) {
				XHDQQNIR var24 = field345[var23.field40];
				if (var24 != null) {
					int var25 = (var23.field65 * 4 - var24.field1449) / 2;
					int var26 = (var23.field53 * 4 - var24.field1450) / 2;
					var24.method555(arg4 * 4 + var25 + 48, (104 - arg1 - var23.field53) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field356.field652;
				int var29 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
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

		int var30 = field339.method371(arg2, arg4, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			BQKZHFKO var32 = BQKZHFKO.method24(var31);
			if (var32.field40 != -1) {
				XHDQQNIR var33 = field345[var32.field40];
				if (var33 != null) {
					int var34 = (var32.field65 * 4 - var33.field1449) / 2;
					int var35 = (var32.field53 * 4 - var33.field1450) / 2;
					var33.method555(arg4 * 4 + var34 + 48, (104 - arg1 - var32.field53) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method127() {
		field400 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field343) {
				field395++;
				method129();
				method129();
				method145();
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

		field400 = false;
	}

	@ObfuscatedName("client.w(I)Z")
	public final boolean method128() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.x(I)V")
	public final void method129() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field122[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field122[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field123[var10] = (field122[var10 - 1] + field122[var10 + 1] + field122[var10 - 128] + field122[var10 + 128]) / 4;
			}
		}

		field467 += 128;
		if (field467 > field329.length) {
			field467 -= field329.length;
			int var11 = (int) (Math.random() * 12.0D);
			method83(field246[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field123[var14 + 128] - field329[field467 + var14 & field329.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field122[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field475[var16] = field475[var16 + 1];
		}

		field475[var1 - 1] = (int) (Math.sin(field306 / 14.0D) * 16.0D + Math.sin(field306 / 15.0D) * 14.0D + Math.sin(field306 / 16.0D) * 12.0D);

		if (field424 > 0) {
			field424 -= 4;
		}

		if (field425 > 0) {
			field425 -= 4;
		}

		if (field424 == 0 && field425 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field424 = 1024;
			}

			if (var17 == 1) {
				field425 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILLYHLTGUG;BI)V")
	public final void method130(int arg0, int arg1, LYHLTGUG arg2, int arg3) {
		if (arg2.field799 == 0 && arg2.field804 != null && (!arg2.field852 || field157 == arg2.field814 || field357 == arg2.field814 || field316 == arg2.field814)) {
			int var5 = TTGPXKMD.field1191;
			int var6 = TTGPXKMD.field1189;
			int var7 = TTGPXKMD.field1192;
			int var8 = TTGPXKMD.field1190;
			TTGPXKMD.method429(arg0, arg2.field826 + arg1, arg2.field855 + arg0, arg1);
			int var9 = arg2.field804.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field801[var10] + arg1;
				int var12 = arg2.field844[var10] + arg0 - arg3;
				LYHLTGUG var13 = LYHLTGUG.field839[arg2.field804[var10]];
				var11 += var13.field808;
				var12 += var13.field812;

				if (var13.field828 > 0) {
					method53(var13);
				}

				if (var13.field799 == 0) {
					if (var13.field798 > var13.field832 - var13.field855) {
						var13.field798 = var13.field832 - var13.field855;
					}

					if (var13.field798 < 0) {
						var13.field798 = 0;
					}

					method130(var12, var11, var13, var13.field798);

					if (var13.field832 > var13.field855) {
						method155(var13.field832, var13.field855, var12, var13.field826 + var11, var13.field798);
					}
				} else if (var13.field799 != 1) {
					if (var13.field799 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field855; var15++) {
							for (int var16 = 0; var16 < var13.field826; var16++) {
								int var17 = (var13.field847 + 32) * var16 + var11;
								int var18 = (var13.field817 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field853[var14];
									var18 += var13.field793[var14];
								}

								if (var13.field843[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field843[var14] - 1;
									if (var17 > TTGPXKMD.field1191 - 32 && var17 < TTGPXKMD.field1192 && var18 > TTGPXKMD.field1189 - 32 && var18 < TTGPXKMD.field1190 || field516 != 0 && field515 == var14) {
										int var22 = 0;
										if (field433 == 1 && field434 == var14 && field435 == var13.field814) {
											var22 = 0xFFFFFF;
										}

										IBHVCUAH var23 = MHOZCPTF.method314(var22, var21, var13.field796[var14]);
										if (var23 != null) {
											if (field516 != 0 && field515 == var14 && field514 == var13.field814) {
												var19 = field17 - field517;
												var20 = field18 - field518;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field427 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method234(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < TTGPXKMD.field1189 && arg2.field798 > 0) {
													int var24 = (TTGPXKMD.field1189 - var18 - var20) * field511 / 3;
													if (var24 > field511 * 10) {
														var24 = field511 * 10;
													}

													if (var24 > arg2.field798) {
														var24 = arg2.field798;
													}

													arg2.field798 -= var24;
													field518 += var24;
												}

												if (var18 + var20 + 32 > TTGPXKMD.field1190 && arg2.field798 < arg2.field832 - arg2.field855) {
													int var25 = (var18 + var20 + 32 - TTGPXKMD.field1190) * field511 / 3;
													if (var25 > field511 * 10) {
														var25 = field511 * 10;
													}

													if (var25 > arg2.field832 - arg2.field855 - arg2.field798) {
														var25 = arg2.field832 - arg2.field855 - arg2.field798;
													}

													arg2.field798 += var25;
													field518 -= var25;
												}
											} else if (field193 != 0 && field192 == var14 && field191 == var13.field814) {
												var23.method234(var17, 128, var18);
											} else {
												var23.method232(var17, var18);
											}

											if (var23.field657 == 33 || var13.field796[var14] != 1) {
												int var26 = var13.field796[var14];
												field290.method245(0, var17 + var19 + 1, var18 + 10 + var20, method121(var26));
												field290.method245(0xFFFF00, var17 + var19, var18 + 9 + var20, method121(var26));
											}
										}
									}
								} else if (var13.field821 != null && var14 < 20) {
									IBHVCUAH var27 = var13.field821[var14];
									if (var27 != null) {
										var27.method232(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field799 == 3) {
						boolean var28 = false;
						if (field316 == var13.field814 || field357 == var13.field814 || field157 == var13.field814) {
							var28 = true;
						}

						int var29;
						if (method97(var13)) {
							var29 = var13.field841;
							if (var28 && var13.field840 != 0) {
								var29 = var13.field840;
							}
						} else {
							var29 = var13.field851;
							if (var28 && var13.field827 != 0) {
								var29 = var13.field827;
							}
						}

						if (var13.field797 == 0) {
							if (var13.field807) {
								TTGPXKMD.method432(var29, var12, var13.field855, var11, var13.field826);
							} else {
								TTGPXKMD.method433(var11, var12, var13.field826, var29, var13.field855);
							}
						} else if (var13.field807) {
							TTGPXKMD.method431(var11, var13.field826, var29, 256 - (var13.field797 & 0xFF), var12, var13.field855);
						} else {
							TTGPXKMD.method434(var12, 256 - (var13.field797 & 0xFF), var11, var13.field826, var29, var13.field855);
						}
					} else if (var13.field799 == 4) {
						IDBGYHWK var30 = var13.field835;
						String var31 = var13.field854;
						boolean var32 = false;
						if (field316 == var13.field814 || field357 == var13.field814 || field157 == var13.field814) {
							var32 = true;
						}

						int var33;
						if (method97(var13)) {
							var33 = var13.field841;
							if (var32 && var13.field840 != 0) {
								var33 = var13.field840;
							}

							if (var13.field836.length() > 0) {
								var31 = var13.field836;
							}
						} else {
							var33 = var13.field851;
							if (var32 && var13.field827 != 0) {
								var33 = var13.field827;
							}
						}

						if (var13.field795 == 6 && field442) {
							var31 = "Please wait...";
							var33 = var13.field851;
						}

						if (TTGPXKMD.field1187 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field665 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method69(method58(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method69(method58(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method69(method58(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method69(method58(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method69(method58(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field815) {
								var30.method242(var33, var13.field790, var41, var13.field826 / 2 + var11, var34);
							} else {
								var30.method249(var13.field790, var41, var33, var11, var34);
							}

							var34 += var30.field665;
						}
					} else if (var13.field799 == 5) {
						IBHVCUAH var42;
						if (method97(var13)) {
							var42 = var13.field802;
						} else {
							var42 = var13.field837;
						}

						if (var42 != null) {
							var42.method232(var11, var12);
						}
					} else if (var13.field799 == 6) {
						int var43 = JXPUZKMY.field756;
						int var44 = JXPUZKMY.field757;
						JXPUZKMY.field756 = var13.field826 / 2 + var11;
						JXPUZKMY.field757 = var13.field855 / 2 + var12;
						int var45 = JXPUZKMY.field760[var13.field823] * var13.field822 >> 16;
						int var46 = JXPUZKMY.field761[var13.field823] * var13.field822 >> 16;
						boolean var47 = method97(var13);
						int var48;
						if (var47) {
							var48 = var13.field831;
						} else {
							var48 = var13.field830;
						}

						WEVRTBOZ var49;
						if (var48 == -1) {
							var49 = var13.method305(-1, var47, -1);
						} else {
							RIUJHZLL var50 = RIUJHZLL.field1112[var48];
							var49 = var13.method305(var50.field1114[var13.field848], var47, var50.field1115[var13.field848]);
						}

						if (var49 != null) {
							var49.method545(0, var13.field824, 0, var13.field823, 0, var45, var46);
						}

						JXPUZKMY.field756 = var43;
						JXPUZKMY.field757 = var44;
					} else {
						if (var13.field799 == 7) {
							IDBGYHWK var51 = var13.field835;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field855; var53++) {
								for (int var54 = 0; var54 < var13.field826; var54++) {
									if (var13.field843[var52] > 0) {
										MHOZCPTF var55 = MHOZCPTF.method322(var13.field843[var52] - 1);
										String var56 = var55.field886;
										if (var55.field914 || var13.field796[var52] != 1) {
											var56 = var56 + " x" + method80(var13.field796[var52]);
										}

										int var57 = (var13.field847 + 115) * var54 + var11;
										int var58 = (var13.field817 + 12) * var53 + var12;
										if (var13.field815) {
											var51.method242(var13.field851, var13.field790, var56, var13.field826 / 2 + var57, var58);
										} else {
											var51.method249(var13.field790, var56, var13.field851, var57, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field799 == 8 && (field387 == var13.field814 || field465 == var13.field814 || field164 == var13.field814)) {
							int var59 = 0;
							int var60 = 0;
							IDBGYHWK var61 = field291;
							String var62 = var13.field854;
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

								int var65 = var61.method243(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field665 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field826 + var11 - var59 - 5;
							int var67 = var13.field855 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = field434 + 5;
							}

							TTGPXKMD.method432(0xFFFFA0, var67, var60, var66, var59);
							TTGPXKMD.method433(var66, var67, var59, 0, var60);
							String var68 = var13.field854;
							int var69 = var61.field665 + var67 + 2;
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

								var61.method249(false, var71, 0, var66 + 3, var69);
								var69 += var61.field665 + 1;
							}
						}
					}
				}
			}

			TTGPXKMD.method429(var6, var7, var8, var5);
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method131() {
		for (DOIBONME var1 = (DOIBONME) field408.method503(); var1 != null; var1 = (DOIBONME) field408.method505()) {
			if (var1.field550 == -1) {
				var1.field551 = 0;
				method164(var1);
			} else {
				var1.method398();
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method132() {
		if (field208 == 0) {
			int var1 = field7 / 2 - 80;
			int var2 = field8 / 2 + 20;
			var2 += 20;
			if (field23 == 1 && field24 >= var1 - 75 && field24 <= var1 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field208 = 3;
				field428 = 0;
			}

			int var3 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var3 - 75 && field24 <= var3 + 75 && field25 >= var2 - 20 && field25 <= var2 + 20) {
				field210 = "";
				field211 = "Enter your username & password.";
				field208 = 2;
				field428 = 0;
			}
		} else if (field208 == 2) {
			int var4 = field8 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field428 = 0;
			}

			var4 += 15;
			if (field23 == 1 && field25 >= var4 - 15 && field25 < var4) {
				field428 = 1;
			}

			var4 += 15;
			int var5 = field7 / 2 - 80;
			int var6 = field8 / 2 + 50;
			var6 += 20;
			if (field23 == 1 && field24 >= var5 - 75 && field24 <= var5 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field426 = 0;
				method67(field314, field315, false);

				if (field217) {
					return;
				}
			}

			int var7 = field7 / 2 + 80;
			if (field23 == 1 && field24 >= var7 - 75 && field24 <= var7 + 75 && field25 >= var6 - 20 && field25 <= var6 + 20) {
				field208 = 0;
				field314 = "";
				field315 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field463.length(); var10++) {
					if (var8 == field463.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field428 == 0) {
					if (var8 == 8 && field314.length() > 0) {
						field314 = field314.substring(0, field314.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field428 = 1;
					}

					if (var9) {
						field314 = field314 + (char) var8;
					}

					if (field314.length() > 12) {
						field314 = field314.substring(0, 12);
					}
				} else if (field428 == 1) {
					if (var8 == 8 && field315.length() > 0) {
						field315 = field315.substring(0, field315.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field428 = 0;
					}

					if (var9) {
						field315 = field315 + (char) var8;
					}

					if (field315.length() > 20) {
						field315 = field315.substring(0, 20);
					}
				}
			}
		} else if (field208 == 3) {
			int var11 = field7 / 2;
			int var12 = field8 / 2 + 50;
			var12 += 20;
			if (field23 == 1 && field24 >= var11 - 75 && field24 <= var11 + 75 && field25 >= var12 - 20 && field25 <= var12 + 20) {
				field208 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method133() {
		if (field363 == 2) {
			method163((field194 - field224 << 7) + field197, field196 * 2, (field195 - field225 << 7) + field198);

			if (field312 > -1 && field306 % 20 < 10) {
				field410[0].method232(field312 - 12, field313 - 28);
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method134() {
		int var1 = 5;
		field151[8] = 0;
		int var2 = 0;
		while (field151[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method151("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 333);
				UAWAYCTK var5 = new UAWAYCTK(new byte[40]);
				var4.readFully(var5.field1251, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field151[var6] = var5.method460();
				}

				int var7 = var5.method460();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field151[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field151[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field151[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field151[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field151[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field151[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method13(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method13(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field154 = !field154;
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method135() {
		if (field172 == null) {
			field10 = null;
			field450 = null;
			field448 = null;
			field447 = null;
			field449 = null;
			field505 = null;
			field506 = null;
			field507 = null;
			field175 = new PKTDMNAV(128, method11(), 265);
			TTGPXKMD.method430();
			field176 = new PKTDMNAV(128, method11(), 265);
			TTGPXKMD.method430();
			field172 = new PKTDMNAV(509, method11(), 171);
			TTGPXKMD.method430();
			field173 = new PKTDMNAV(360, method11(), 132);
			TTGPXKMD.method430();
			field174 = new PKTDMNAV(360, method11(), 200);
			TTGPXKMD.method430();
			field177 = new PKTDMNAV(202, method11(), 238);
			TTGPXKMD.method430();
			field178 = new PKTDMNAV(203, method11(), 238);
			TTGPXKMD.method430();
			field179 = new PKTDMNAV(74, method11(), 94);
			TTGPXKMD.method430();
			field180 = new PKTDMNAV(75, method11(), 94);
			TTGPXKMD.method430();

			if (field508 != null) {
				method65();
				method109();
			}

			field365 = true;
		}
	}

	@ObfuscatedName("client.d(IZ)V")
	public final void method136(int arg0) {
		LYHLTGUG var2 = LYHLTGUG.field839[arg0];
		for (int var3 = 0; var3 < var2.field804.length && var2.field804[var3] != -1; var3++) {
			LYHLTGUG var4 = LYHLTGUG.field839[var2.field804[var3]];
			if (var4.field799 == 1) {
				method136(var4.field814);
			}

			var4.field848 = 0;
			var4.field850 = 0;
		}
	}

	@ObfuscatedName("client.a(LUAWAYCTK;IZ)V")
	public final void method137(UAWAYCTK arg0, int arg1) {
		field260 = 0;
		field417 = 0;
		method82(arg1, arg0);
		method115(arg0, arg1);
		method87(arg0, arg1);
		method64(arg0, arg1);

		for (int var3 = 0; var3 < field260; var3++) {
			int var4 = field261[var3];
			if (field306 != field414[var4].field1245) {
				field414[var4] = null;
			}
		}

		if (arg0.field1252 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1252 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field415; var5++) {
			if (field414[field416[var5]] == null) {
				signlink.reporterror(field314 + " null entry in pl list - pos:" + var5 + " size:" + field415);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method138() {
		if (field110 >= 2 || field433 != 0 || field124 != 0) {
			String var1;
			if (field433 == 1 && field110 < 2) {
				var1 = "Use " + field437 + " with...";
			} else if (field124 == 1 && field110 < 2) {
				var1 = field127 + "...";
			} else {
				var1 = field267[field110 - 1];
			}

			if (field110 > 2) {
				var1 = var1 + "@whi@ / " + (field110 - 2) + " more options";
			}

			field292.method250(field306 / 1000, var1, 0xFFFFFF, 4, 15, true);
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method139(int arg0) {
		if (!field169) {
			if (JXPUZKMY.field770[17] >= arg0) {
				XHDQQNIR var2 = JXPUZKMY.field764[17];
				int var3 = var2.field1450 * var2.field1449 - 1;
				int var4 = field511 * var2.field1449 * 2;
				byte[] var5 = var2.field1447;
				byte[] var6 = field432;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1447 = var6;
				field432 = var5;
				JXPUZKMY.method295(17);
			}

			if (JXPUZKMY.field770[24] >= arg0) {
				XHDQQNIR var8 = JXPUZKMY.field764[24];
				int var9 = var8.field1450 * var8.field1449 - 1;
				int var10 = field511 * var8.field1449 * 2;
				byte[] var11 = var8.field1447;
				byte[] var12 = field432;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field1447 = var12;
				field432 = var11;
				JXPUZKMY.method295(24);
			}

			if (JXPUZKMY.field770[34] >= arg0) {
				XHDQQNIR var14 = JXPUZKMY.field764[34];
				int var15 = var14.field1450 * var14.field1449 - 1;
				int var16 = field511 * var14.field1449 * 2;
				byte[] var17 = var14.field1447;
				byte[] var18 = field432;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field1447 = var18;
				field432 = var17;
				JXPUZKMY.method295(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.B(I)I")
	public final int method140() {
		int var1 = 3;
		if (field162 < 310) {
			int var2 = field159 >> 7;
			int var3 = field161 >> 7;
			int var4 = field378.field1235 >> 7;
			int var5 = field378.field1236 >> 7;

			if ((field469[field480][var2][var3] & 0x4) != 0) {
				var1 = field480;
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

					if ((field469[field480][var2][var3] & 0x4) != 0) {
						var1 = field480;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field469[field480][var2][var3] & 0x4) != 0) {
							var1 = field480;
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

					if ((field469[field480][var2][var3] & 0x4) != 0) {
						var1 = field480;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field469[field480][var2][var3] & 0x4) != 0) {
							var1 = field480;
						}
					}
				}
			}
		}

		if ((field469[field480][field378.field1235 >> 7][field378.field1236 >> 7] & 0x4) != 0) {
			var1 = field480;
		}

		return var1;
	}

	@ObfuscatedName("client.C(I)I")
	public final int method141() {
		int var1 = method72(field161, field159, field480);
		if (var1 - field160 < 800 && (field469[field480][field159 >> 7][field161 >> 7] & 0x4) != 0) {
			return field480;
		}

		return 3;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method142() {
		field343 = false;
		while (field400) {
			field343 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field134 = null;
		field135 = null;
		field246 = null;
		field285 = null;
		field286 = null;
		field287 = null;
		field288 = null;
		field329 = null;
		field330 = null;
		field122 = null;
		field123 = null;
		field451 = null;
		field452 = null;
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method143() {
		field281.method444(165);

		if (field492 != -1) {
			field492 = -1;
			field429 = true;
			field442 = false;
			field401 = true;
		}

		if (field298 != -1) {
			field298 = -1;
			field362 = true;
			field442 = false;
		}

		if (field471 != -1) {
			field471 = -1;
			field365 = true;
		}

		field262 = -1;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method144() {
		if (field468 > 1) {
			field468--;
		}

		if (field461 > 0) {
			field461--;
		}

		for (int var1 = 0; var1 < 5 && method119(); var1++) {
		}

		if (field217) {
			synchronized (field165.field1349) {
				if (!field369) {
					field165.field1347 = 0;
				} else if (field23 != 0 || field165.field1347 >= 40) {
					field281.method444(95);
					field281.method445(0);
					int var3 = field281.field1252;
					int var4 = 0;
					for (int var5 = 0; var5 < field165.field1347 && var3 - field281.field1252 < 240; var5++) {
						var4++;
						int var6 = field165.field1350[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field165.field1348[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field165.field1350[var5] == -1 && field165.field1348[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field509 != var7 || field510 != var6) {
							int var9 = var7 - field509;
							field509 = var7;
							int var10 = var6 - field510;
							field510 = var6;

							if (field199 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field281.method446((field199 << 12) + (var9 << 6) + var10);
								field199 = 0;
							} else if (field199 < 8) {
								field281.method448((field199 << 19) + var8 + 0x800000);
								field199 = 0;
							} else {
								field281.method449((field199 << 19) + var8 - 0x40000000);
								field199 = 0;
							}
						} else if (field199 < 2047) {
							field199++;
						}
					}

					field281.method454(field281.field1252 - var3);

					if (var4 >= field165.field1347) {
						field165.field1347 = 0;
					} else {
						field165.field1347 -= var4;
						for (int var11 = 0; var11 < field165.field1347; var11++) {
							field165.field1348[var11] = field165.field1348[var4 + var11];
							field165.field1350[var11] = field165.field1350[var4 + var11];
						}
					}
				}
			}

			if (field23 != 0) {
				long var12 = (field26 - field474) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field474 = field26;
				int var14 = field25;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field24;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field23 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field281.method444(217);
				field281.method488((var17 << 19) + (var18 << 20) + var16);
			}

			if (field485 > 0) {
				field485--;
			}

			if (field27[1] == 1 || field27[2] == 1 || field27[3] == 1 || field27[4] == 1) {
				field486 = true;
			}

			if (field486 && field485 <= 0) {
				field485 = 20;
				field486 = false;
				field281.method444(239);
				field281.method481(field99);
				field281.method446(field100);
			}

			if (field14 && !field250) {
				field250 = true;
				field281.method444(207);
				field281.method445(1);
			}

			if (!field14 && field250) {
				field250 = false;
				field281.method444(207);
				field281.method445(0);
			}

			method84();
			method98();
			method117();
			field459++;
			if (field459 > 750) {
				method150();
			}

			method147();
			method40();
			method52();
			field511++;

			if (field383 != 0) {
				field382 += 20;
				if (field382 >= 400) {
					field383 = 0;
				}
			}

			if (field193 != 0) {
				field190++;
				if (field190 >= 15) {
					if (field193 == 2) {
						field429 = true;
					}

					if (field193 == 3) {
						field362 = true;
					}

					field193 = 0;
				}
			}

			if (field516 != 0) {
				field427++;

				if (field17 > field517 + 5 || field17 < field517 - 5 || field18 > field518 + 5 || field18 < field518 - 5) {
					field386 = true;
				}

				if (field16 == 0) {
					if (field516 == 2) {
						field429 = true;
					}

					if (field516 == 3) {
						field362 = true;
					}

					field516 = 0;

					if (field386 && field427 >= 5) {
						field204 = -1;
						method157();

						if (field514 == field204 && field515 != field203) {
							LYHLTGUG var19 = LYHLTGUG.field839[field514];
							byte var20 = 0;
							if (field188 == 1 && var19.field828 == 206) {
								var20 = 1;
							}

							if (var19.field843[field203] <= 0) {
								var20 = 0;
							}

							if (var19.field811) {
								int var21 = field515;
								int var22 = field203;
								var19.field843[var22] = var19.field843[var21];
								var19.field796[var22] = var19.field796[var21];
								var19.field843[var21] = -1;
								var19.field796[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field515;
								int var24 = field203;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method309(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method309(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method309(field515, field203);
							}

							field281.method444(159);
							field281.method480(field203);
							field281.method481(field514);
							field281.method446(field515);
							field281.method473(var20);
						}
					} else if ((field92 == 1 || method94(field110 - 1)) && field110 > 2) {
						method74();
					} else if (field110 > 0) {
						method62(field110 - 1);
					}

					field190 = 10;
					field23 = 0;
				}
			}

			if (OBOSMEDX.field997 != -1) {
				int var25 = OBOSMEDX.field997;
				int var26 = OBOSMEDX.field998;
				boolean var27 = method71(var25, true, 0, 0, 0, field378.field1229[0], field378.field1228[0], 0, 0, var26, 0);
				OBOSMEDX.field997 = -1;

				if (var27) {
					field380 = field24;
					field381 = field25;
					field383 = 1;
					field382 = 0;
				}
			}

			if (field23 == 1 && field338 != null) {
				field338 = null;
				field362 = true;
				field23 = 0;
			}

			method171();
			method68();
			method73();
			method158();

			if (field16 == 1 || field23 == 1) {
				field184++;
			}

			if (field393 == 2) {
				method60();
			}

			if (field393 == 2 && field235) {
				method113();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field399[var28]++;
			}

			method55();
			field15++;
			if (field15 > 4500) {
				field461 = 250;
				field15 -= 500;
				field281.method444(214);
			}

			field295++;
			if (field295 > 500) {
				field295 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field333 += field334;
				}

				if ((var29 & 0x2) == 2) {
					field93 += field94;
				}

				if ((var29 & 0x4) == 4) {
					field304 += field305;
				}
			}

			if (field333 < -50) {
				field334 = 2;
			}

			if (field333 > 50) {
				field334 = -2;
			}

			if (field93 < -55) {
				field94 = 2;
			}

			if (field93 > 55) {
				field94 = -2;
			}

			if (field304 < -40) {
				field305 = 1;
			}

			if (field304 > 40) {
				field305 = -1;
			}

			field364++;
			if (field364 > 500) {
				field364 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field170 += field171;
				}

				if ((var30 & 0x2) == 2) {
					field257 += field258;
				}
			}

			if (field170 < -60) {
				field171 = 2;
			}

			if (field170 > 60) {
				field171 = -2;
			}

			if (field257 < -20) {
				field258 = 1;
			}

			if (field257 > 10) {
				field258 = -1;
			}

			field460++;
			if (field460 > 50) {
				field281.method444(161);
			}

			try {
				if (field279 != null && field281.field1252 > 0) {
					field279.method178(0, field281.field1251, field281.field1252);
					field281.field1252 = 0;
					field460 = 0;
				}
			} catch (IOException var32) {
				method150();
			} catch (Exception var33) {
				method78();
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method145() {
		short var1 = 256;

		if (field424 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field424 > 768) {
					field285[var2] = method91(1024 - field424, field286[var2], field287[var2]);
				} else if (field424 > 256) {
					field285[var2] = field287[var2];
				} else {
					field285[var2] = method91(256 - field424, field287[var2], field286[var2]);
				}
			}
		} else if (field425 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field425 > 768) {
					field285[var3] = method91(1024 - field425, field286[var3], field288[var3]);
				} else if (field425 > 256) {
					field285[var3] = field288[var3];
				} else {
					field285[var3] = method91(256 - field425, field288[var3], field286[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field285[var4] = field286[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field175.field1079[var5] = field451.field652[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field475[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field122[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field285[var12];
					int var15 = field175.field1079[var7];
					field175.field1079[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field175.method400(0, 0, field9);

		for (int var16 = 0; var16 < 33920; var16++) {
			field176.field1079[var16] = field452.field652[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field475[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field122[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field285[var23];
					int var26 = field176.field1079[var18];
					field176.field1079[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field176.method400(0, 637, field9);
	}

	@ObfuscatedName("client.G(I)V")
	public final void method146() {
		field264 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field478[var1] = -1;
			for (int var2 = 0; var2 < NRLTHETF.field953; var2++) {
				if (!NRLTHETF.field954[var2].field960 && NRLTHETF.field954[var2].field955 == var1 + (field454 ? 0 : 7)) {
					field478[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method147() {
		for (int var1 = -1; var1 < field415; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field413;
			} else {
				var2 = field416[var1];
			}

			UFGXOLGK var3 = field414[var2];
			if (var3 != null) {
				method41(1, var3);
			}
		}
	}

	@ObfuscatedName("client.b(LUAWAYCTK;II)V")
	public final void method148(UAWAYCTK arg0, int arg1) {
		field260 = 0;
		field417 = 0;
		method61(arg0, arg1);
		method149(arg1, arg0);
		method92(arg0, arg1);

		for (int var3 = 0; var3 < field260; var3++) {
			int var4 = field261[var3];
			if (field306 != field322[var4].field1245) {
				field322[var4].field750 = null;
				field322[var4] = null;
			}
		}

		if (arg0.field1252 != arg1) {
			signlink.reporterror(field314 + " size mismatch in getnpcpos - pos:" + arg0.field1252 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field323; var5++) {
			if (field322[field324[var5]] == null) {
				signlink.reporterror(field314 + " null entry in npc list - pos:" + var5 + " size:" + field323);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(IILUAWAYCTK;)V")
	public final void method149(int arg0, UAWAYCTK arg1) {
		while (arg1.field1253 + 21 < arg0 * 8) {
			int var3 = arg1.method466(14);
			if (var3 == 16383) {
				break;
			}

			if (field322[var3] == null) {
				field322[var3] = new JKNLPRIU();
			}

			JKNLPRIU var4 = field322[var3];
			field324[field323++] = var3;
			var4.field1245 = field306;
			var4.field750 = JKAPIYZO.method284(arg1.method466(12));
			int var5 = arg1.method466(1);
			if (var5 == 1) {
				field418[field417++] = var3;
			}

			int var6 = arg1.method466(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method466(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method466(1);
			var4.field1230 = var4.field750.field736;
			var4.field1231 = var4.field750.field743;
			var4.field1223 = var4.field750.field728;
			var4.field1224 = var4.field750.field745;
			var4.field1225 = var4.field750.field724;
			var4.field1226 = var4.field750.field739;
			var4.field1220 = var4.field750.field722;
			var4.method441(field378.field1229[0] + var7, var8 == 1, field378.field1228[0] + var6);
		}

		arg1.method467();
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method150() {
		if (field461 > 0) {
			method78();
		} else {
			field449.method399();
			field291.method241(144, 257, "Connection lost", 0);
			field291.method241(143, 256, "Connection lost", 0xFFFFFF);
			field291.method241(159, 257, "Please wait - attempting to reestablish", 0);
			field291.method241(158, 256, "Please wait - attempting to reestablish", 0xFFFFFF);
			field449.method400(4, 4, field9);
			field481 = 0;
			field354 = 0;
			DUZSRFJE var1 = field279;
			field217 = false;
			field426 = 0;
			method67(field314, field315, true);

			if (!field217) {
				method78();
			}

			try {
				var1.method174();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method151(String arg0) throws IOException {
		if (field154) {
			if (field207 != null) {
				try {
					field207.close();
				} catch (Exception var4) {
				}

				field207 = null;
			}

			field207 = method99(43595);
			field207.setSoTimeout(10000);
			InputStream var2 = field207.getInputStream();
			OutputStream var3 = field207.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(LLYHLTGUG;B)Z")
	public final boolean method152(LYHLTGUG arg0) {
		int var2 = arg0.field828;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field267[field110] = "Remove @whi@" + arg0.field854;
				field220[field110] = 279;
				field110++;
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

		field267[field110] = "Remove @whi@" + field513[var2];
		field220[field110] = 280;
		field110++;
		field267[field110] = "Message @whi@" + field513[var2];
		field220[field110] = 73;
		field110++;
		return true;
	}

	@ObfuscatedName("client.H(I)V")
	public static final void method153() {
		OBOSMEDX.field963 = true;
		JXPUZKMY.field751 = true;
		field169 = true;
		IJMWYKME.field686 = true;
		BQKZHFKO.field47 = true;
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method154(int arg0, int arg1) {
		boolean var3 = false;
		LYHLTGUG var4 = LYHLTGUG.field839[arg0];
		for (int var5 = 0; var5 < var4.field804.length && var4.field804[var5] != -1; var5++) {
			LYHLTGUG var6 = LYHLTGUG.field839[var4.field804[var5]];
			if (var6.field799 == 1) {
				var3 |= method154(var6.field814, arg1);
			}

			if (var6.field799 == 6 && (var6.field830 != -1 || var6.field831 != -1)) {
				boolean var7 = method97(var6);
				int var8;
				if (var7) {
					var8 = var6.field831;
				} else {
					var8 = var6.field830;
				}

				if (var8 != -1) {
					RIUJHZLL var9 = RIUJHZLL.field1112[var8];
					var6.field850 += arg1;
					while (var6.field850 > var9.method414(var6.field848)) {
						var6.field850 -= var9.method414(var6.field848) + 1;
						var6.field848++;
						if (var6.field848 >= var9.field1113) {
							var6.field848 -= var9.field1117;
							if (var6.field848 < 0 || var6.field848 >= var9.field1113) {
								var6.field848 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field799 == 6 && var6.field803 != 0) {
				int var10 = var6.field803 >> 16;
				int var11 = var6.field803 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field823 = var6.field823 + var10 & 0x7FF;
				var6.field824 = var6.field824 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field205.method555(arg3, arg2);
		field206.method555(arg3, arg1 + arg2 - 16);
		TTGPXKMD.method432(field358, arg2 + 16, arg1 - 32, arg3, 16);
		int var6 = (arg1 - 32) * arg1 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg4 / (arg0 - arg1);
		TTGPXKMD.method432(field308, arg2 + var7 + 16, var6, arg3, 16);
		TTGPXKMD.method437(field274, arg3, var6, arg2 + var7 + 16);
		TTGPXKMD.method437(field274, arg3 + 1, var6, arg2 + var7 + 16);
		TTGPXKMD.method435(arg2 + var7 + 16, 16, field274, arg3);
		TTGPXKMD.method435(arg2 + var7 + 17, 16, field274, arg3);
		TTGPXKMD.method437(field245, arg3 + 15, var6, arg2 + var7 + 16);
		TTGPXKMD.method437(field245, arg3 + 14, var6 - 1, arg2 + var7 + 17);
		TTGPXKMD.method435(arg2 + var7 + var6 + 15, 16, field245, arg3);
		TTGPXKMD.method435(arg2 + var7 + var6 + 14, 15, field245, arg3 + 1);
	}

	@ObfuscatedName("client.a(IILUFGXOLGK;II)V")
	public final void method156(int arg0, int arg1, UFGXOLGK arg2, int arg3) {
		if (field378 != arg2 && field110 < 400) {
			String var5;
			if (arg2.field1272 == 0) {
				var5 = arg2.field1283 + method81(arg2.field1275, field378.field1275) + " (level-" + arg2.field1275 + ")";
			} else {
				var5 = arg2.field1283 + " (skill-" + arg2.field1272 + ")";
			}

			if (field433 == 1) {
				field267[field110] = "Use " + field437 + " with @whi@" + var5;
				field220[field110] = 863;
				field221[field110] = arg1;
				field218[field110] = arg3;
				field219[field110] = arg0;
				field110++;
			} else if (field124 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field108[var6] != null) {
						field267[field110] = field108[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field108[var6].equalsIgnoreCase("attack")) {
							if (arg2.field1275 > field378.field1275) {
								var7 = 2000;
							}

							if (field378.field1269 != 0 && arg2.field1269 != 0) {
								if (field378.field1269 == arg2.field1269) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field109[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field220[field110] = var7 + 267;
						}

						if (var6 == 1) {
							field220[field110] = var7 + 962;
						}

						if (var6 == 2) {
							field220[field110] = var7 + 275;
						}

						if (var6 == 3) {
							field220[field110] = var7 + 634;
						}

						if (var6 == 4) {
							field220[field110] = var7 + 187;
						}

						field221[field110] = arg1;
						field218[field110] = arg3;
						field219[field110] = arg0;
						field110++;
					}
				}
			} else if ((field126 & 0x8) == 8) {
				field267[field110] = field127 + " @whi@" + var5;
				field220[field110] = 222;
				field221[field110] = arg1;
				field218[field110] = arg3;
				field219[field110] = arg0;
				field110++;
			}

			for (int var8 = 0; var8 < field110; var8++) {
				if (field220[var8] == 904) {
					field267[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	public final void run() {
		if (field156) {
			method127();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method157() {
		if (field516 == 0) {
			field267[0] = "Cancel";
			field220[0] = 1966;
			field110 = 1;
			method76();
			field456 = 0;
			field256 = 0;

			if (field17 > 4 && field18 > 4 && field17 < 516 && field18 < 338) {
				if (field262 == -1) {
					method172();
				} else {
					method169(LYHLTGUG.field839[field262], 0, field17, 4, 0, field18, 4);
				}
			}

			if (field456 != field157) {
				field157 = field456;
			}

			if (field256 != field164) {
				field164 = field256;
			}

			field456 = 0;
			field256 = 0;

			if (field17 > 553 && field18 > 205 && field17 < 743 && field18 < 466) {
				if (field492 != -1) {
					method169(LYHLTGUG.field839[field492], 1, field17, 205, 0, field18, 553);
				} else if (field371[field105] != -1) {
					method169(LYHLTGUG.field839[field371[field105]], 1, field17, 205, 0, field18, 553);
				}
			}

			if (field456 != field357) {
				field429 = true;
				field357 = field456;
			}

			if (field465 != field256) {
				field429 = true;
				field465 = field256;
			}

			field456 = 0;
			field256 = 0;

			if (field17 > 17 && field18 > 357 && field17 < 496 && field18 < 453) {
				if (field298 != -1) {
					method169(LYHLTGUG.field839[field298], 2, field17, 357, 0, field18, 17);
				} else if (field106 != -1) {
					method169(LYHLTGUG.field839[field106], 3, field17, 357, 0, field18, 17);
				} else if (field18 < 434 && field17 < 426) {
					method93(field17 - 17, field18 - 357);
				}
			}

			if (field298 != -1 && field456 != field316) {
				field362 = true;
				field316 = field456;
			}

			if (field298 != -1 && field387 != field256) {
				field362 = true;
				field387 = field256;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field110 - 1; var2++) {
					if (field220[var2] < 1000 && field220[var2 + 1] > 1000) {
						String var3 = field267[var2];
						field267[var2] = field267[var2 + 1];
						field267[var2 + 1] = var3;
						int var4 = field220[var2];
						field220[var2] = field220[var2 + 1];
						field220[var2 + 1] = var4;
						int var5 = field218[var2];
						field218[var2] = field218[var2 + 1];
						field218[var2 + 1] = var5;
						int var6 = field219[var2];
						field219[var2] = field219[var2 + 1];
						field219[var2 + 1] = var6;
						int var7 = field221[var2];
						field221[var2] = field221[var2 + 1];
						field221[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method158() {
		if (field23 == 1) {
			if (field24 >= 6 && field24 <= 106 && field25 >= 467 && field25 <= 499) {
				field503 = (field503 + 1) % 4;
				field405 = true;
				field362 = true;
				field281.method444(4);
				field281.method445(field503);
				field281.method445(field311);
				field281.method445(field455);
			}

			if (field24 >= 135 && field24 <= 235 && field25 >= 467 && field25 <= 499) {
				field311 = (field311 + 1) % 3;
				field405 = true;
				field362 = true;
				field281.method444(4);
				field281.method445(field503);
				field281.method445(field311);
				field281.method445(field455);
			}

			if (field24 >= 273 && field24 <= 373 && field25 >= 467 && field25 <= 499) {
				field455 = (field455 + 1) % 3;
				field405 = true;
				field362 = true;
				field281.method444(4);
				field281.method445(field503);
				field281.method445(field311);
				field281.method445(field455);
			}

			if (field24 >= 412 && field24 <= 512 && field25 >= 467 && field25 <= 499) {
				if (field262 == -1) {
					method143();
					field361 = "";
					field441 = false;

					for (int var1 = 0; var1 < LYHLTGUG.field839.length; var1++) {
						if (LYHLTGUG.field839[var1] != null && LYHLTGUG.field839[var1].field828 == 600) {
							field213 = field262 = LYHLTGUG.field839[var1].field806;
							return;
						}
					}

					return;
				}

				method104("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IILIBHVCUAH;I)V")
	public final void method159(int arg0, IBHVCUAH arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field170 + field100 & 0x7FF;
			int var6 = WEVRTBOZ.field1426[var5];
			int var7 = WEVRTBOZ.field1427[var5];
			var6 = var6 * 256 / (field257 + 256);
			var7 = var7 * 256 / (field257 + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field243.method237(var10, 15, 83 - var13 - 20, 256, 15, 20, var12 + 94 + 4 - 10, 20);
		} else {
			method100(arg2, arg0, arg1);
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method160() {
		try {
			field367 = -1;
			field398.method507();
			field181.method507();
			field462++;
			if (field462 > 118) {
				field462 = 0;
				field281.method444(118);
				field281.method449(0);
			}

			JXPUZKMY.method291();
			method70();
			field339.method342();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field394[var1].method25();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field469[var2][var3][var4] = 0;
					}
				}
			}

			IJMWYKME var5 = new IJMWYKME(104, 104, field317, field469);
			int var6 = field139.length;
			field281.method444(161);

			if (!field438) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field240[var7] >> 8) * 64 - field224;
					int var9 = (field240[var7] & 0xFF) * 64 - field225;
					byte[] var10 = field139[var7];
					if (var10 != null) {
						var5.method276(var8, (field488 - 6) * 8, (field487 - 6) * 8, field394, var10, var9);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field240[var11] >> 8) * 64 - field224;
					int var13 = (field240[var11] & 0xFF) * 64 - field225;
					byte[] var14 = field139[var11];
					if (var14 == null && field488 < 800) {
						var5.method256(var12, 64, var13, 64);
					}
				}

				field281.method444(161);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field443[var15];
					if (var16 != null) {
						int var17 = (field240[var15] >> 8) * 64 - field224;
						int var18 = (field240[var15] & 0xFF) * 64 - field225;
						var5.method264(var18, var16, field394, field339, var17);
					}
				}
			}

			if (field438) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field501[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field240.length; var28++) {
									if (field240[var28] == var27 && field139[var28] != null) {
										var5.method258(var24, var21 * 8, field139[var28], field394, var20 * 8, var23, (var26 & 0x7) * 8, (var25 & 0x7) * 8, var19);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field501[0][var29][var30];
						if (var31 == -1) {
							var5.method256(var29 * 8, 8, var30 * 8, 8);
						}
					}
				}

				field281.method444(161);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field501[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field240.length; var41++) {
									if (field240[var41] == var40 && field443[var41] != null) {
										var5.method273((var38 & 0x7) * 8, var33 * 8, var34 * 8, field443[var41], var37, var32, field339, (var39 & 0x7) * 8, var36, field394);
										break;
									}
								}
							}
						}
					}
				}
			}

			field281.method444(161);
			var5.method260(field394, field339);
			field449.method399();
			field281.method444(161);
			int var42 = IJMWYKME.field678;
			if (var42 > field480) {
				var42 = field480;
			}

			if (var42 < field480 - 1) {
				int var43 = field480 - 1;
			}

			if (field169) {
				field339.method343(IJMWYKME.field678);
			} else {
				field339.method343(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method66(var44, var45);
				}
			}

			method131();
		} catch (Exception var58) {
		}

		BQKZHFKO.field60.method208();

		if (field12 != null) {
			field281.method444(37);
			field281.method449(1057001181);
		}

		if (field169 && signlink.cache_dat != null) {
			int var47 = field430.method191(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field430.method200(var48);
				if ((var49 & 0x79) == 0) {
					WEVRTBOZ.method524(var48);
				}
			}
		}

		System.gc();
		JXPUZKMY.method292(20);
		field430.method185();
		int var50 = (field487 - 6) / 8 - 1;
		int var51 = (field487 + 6) / 8 + 1;
		int var52 = (field488 - 6) / 8 - 1;
		int var53 = (field488 + 6) / 8 + 1;
		if (field137) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field430.method199(var55, 0, var54);
					if (var56 != -1) {
						field430.method195(var56, 3);
					}

					int var57 = field430.method199(var55, 1, var54);
					if (var57 != -1) {
						field430.method195(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method161() {
		for (TIUPWCPE var1 = (TIUPWCPE) field181.method503(); var1 != null; var1 = (TIUPWCPE) field181.method505()) {
			if (field480 != var1.field1168 || field306 > var1.field1176) {
				var1.method398();
			} else if (field306 >= var1.field1175) {
				if (var1.field1166 > 0) {
					JKNLPRIU var2 = field322[var1.field1166 - 1];
					if (var2 != null && var2.field1235 >= 0 && var2.field1235 < 13312 && var2.field1236 >= 0 && var2.field1236 < 13312) {
						var1.method425(method72(var2.field1236, var2.field1235, var1.field1168) - var1.field1174, var2.field1235, var2.field1236, field306);
					}
				}

				if (var1.field1166 < 0) {
					int var3 = -var1.field1166 - 1;
					UFGXOLGK var4;
					if (field332 == var3) {
						var4 = field378;
					} else {
						var4 = field414[var3];
					}

					if (var4 != null && var4.field1235 >= 0 && var4.field1235 < 13312 && var4.field1236 >= 0 && var4.field1236 < 13312) {
						var1.method425(method72(var4.field1236, var4.field1235, var1.field1168) - var1.field1174, var4.field1235, var4.field1236, field306);
					}
				}

				var1.method426(field511);
				field339.method353(60, (int) var1.field1161, var1.field1159, -1, (int) var1.field1163, field480, (int) var1.field1162, var1, false);
			}
		}
	}

	@ObfuscatedName("client.a(IZLTTYUWHXI;)V")
	public final void method162(int arg0, TTYUWHXI arg1) {
		method163(arg1.field1235, arg0, arg1.field1236);
	}

	@ObfuscatedName("client.a(IIIB)V")
	public final void method163(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method72(arg2, arg0, field480) - arg1;
			arg0 -= field159;
			var4 -= field160;
			arg2 -= field161;
			int var5 = WEVRTBOZ.field1426[field162];
			int var6 = WEVRTBOZ.field1427[field162];
			int var7 = WEVRTBOZ.field1426[field163];
			int var8 = WEVRTBOZ.field1427[field163];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field312 = (var9 << 9) / arg2 + JXPUZKMY.field756;
				field313 = (var11 << 9) / arg2 + JXPUZKMY.field757;
			} else {
				field312 = -1;
				field313 = -1;
			}
		} else {
			field312 = -1;
			field313 = -1;
		}
	}

	@ObfuscatedName("client.a(ILDOIBONME;)V")
	public final void method164(DOIBONME arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field553 == 0) {
			var2 = field339.method368(arg0.field552, arg0.field554, arg0.field555);
		}

		if (arg0.field553 == 1) {
			var2 = field339.method369(arg0.field555, arg0.field554, arg0.field552);
		}

		if (arg0.field553 == 2) {
			var2 = field339.method370(arg0.field552, arg0.field554, arg0.field555);
		}

		if (arg0.field553 == 3) {
			var2 = field339.method371(arg0.field552, arg0.field554, arg0.field555);
		}

		if (var2 != 0) {
			int var6 = field339.method372(arg0.field552, arg0.field554, arg0.field555, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field547 = var3;
		arg0.field549 = var4;
		arg0.field548 = var5;
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method165(int arg0) {
		int var2 = RRCEOPDB.field1137[arg0].field1145;
		if (var2 != 0) {
			int var3 = field251[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					JXPUZKMY.method297(0.9D);
				}

				if (var3 == 2) {
					JXPUZKMY.method297(0.8D);
				}

				if (var3 == 3) {
					JXPUZKMY.method297(0.7D);
				}

				if (var3 == 4) {
					JXPUZKMY.method297(0.6D);
				}

				MHOZCPTF.field904.method208();
				field365 = true;
			}

			if (var2 == 3) {
				boolean var4 = field470;

				if (var3 == 0) {
					method63(0, field470);
					field470 = true;
				}

				if (var3 == 1) {
					method63(-400, field470);
					field470 = true;
				}

				if (var3 == 2) {
					method63(-800, field470);
					field470 = true;
				}

				if (var3 == 3) {
					method63(-1200, field470);
					field470 = true;
				}

				if (var3 == 4) {
					field470 = false;
				}

				if (field470 != var4 && !field169) {
					if (field470) {
						field326 = field420;
						field327 = true;
						field430.method184(2, field326);
					} else {
						method123();
					}

					field183 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field214 = true;
					method48(0);
				}

				if (var3 == 1) {
					field214 = true;
					method48(-400);
				}

				if (var3 == 2) {
					field214 = true;
					method48(-800);
				}

				if (var3 == 3) {
					field214 = true;
					method48(-1200);
				}

				if (var3 == 4) {
					field214 = false;
				}
			}

			if (var2 == 5) {
				field92 = var3;
			}

			if (var2 == 6) {
				field337 = var3;
			}

			if (var2 == 8) {
				field187 = var3;
				field362 = true;
			}

			if (var2 == 9) {
				field188 = var3;
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method166() {
		while (true) {
			VVUONHHF var1 = field430.method197();
			if (var1 == null) {
				return;
			}

			if (var1.field1340 == 0) {
				WEVRTBOZ.method523(var1.field1342, var1.field1341);

				if ((field430.method200(var1.field1341) & 0x62) != 0) {
					field429 = true;

					if (field298 != -1) {
						field362 = true;
					}
				}
			}

			if (var1.field1340 == 1 && var1.field1342 != null) {
				HJEXDJAH.method215(var1.field1342);
			}

			if (var1.field1340 == 2 && field326 == var1.field1341 && var1.field1342 != null) {
				method88(field327, var1.field1342);
			}

			if (var1.field1340 == 3 && field393 == 1) {
				for (int var2 = 0; var2 < field139.length; var2++) {
					if (field241[var2] == var1.field1341) {
						field139[var2] = var1.field1342;

						if (var1.field1342 == null) {
							field241[var2] = -1;
						}

						break;
					}

					if (field242[var2] == var1.field1341) {
						field443[var2] = var1.field1342;

						if (var1.field1342 == null) {
							field242[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1340 == 93 && field430.method187(var1.field1341)) {
				IJMWYKME.method265(field430, new UAWAYCTK(var1.field1342));
			}
		}
	}

	@ObfuscatedName("client.b(LLYHLTGUG;I)Z")
	public final boolean method167(LYHLTGUG arg0) {
		int var2 = arg0.field828;
		if (field397 == 2) {
			if (var2 == 201) {
				field362 = true;
				field493 = 0;
				field294 = true;
				field153 = "";
				field280 = 1;
				field263 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field362 = true;
				field493 = 0;
				field294 = true;
				field153 = "";
				field280 = 2;
				field263 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field461 = 250;
			return true;
		}

		if (var2 == 501) {
			field362 = true;
			field493 = 0;
			field294 = true;
			field153 = "";
			field280 = 4;
			field263 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field362 = true;
			field493 = 0;
			field294 = true;
			field153 = "";
			field280 = 5;
			field263 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field478[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = NRLTHETF.field953 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= NRLTHETF.field953) {
							var5 = 0;
						}
					}

					if (!NRLTHETF.field954[var5].field960 && NRLTHETF.field954[var5].field955 == var3 + (field454 ? 0 : 7)) {
						break;
					}
				}

				field478[var3] = var5;
				field264 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field360[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field266[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field266[var6].length) {
					var8 = 0;
				}
			}

			field360[var6] = var8;
			field264 = true;
		}

		if (var2 == 324 && !field454) {
			field454 = true;
			method146();
		}

		if (var2 == 325 && field454) {
			field454 = false;
			method146();
		}

		if (var2 == 326) {
			field281.method444(19);
			field281.method445(field454 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field281.method445(field478[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field281.method445(field360[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field441 = !field441;
		}

		if (var2 >= 601 && var2 <= 613) {
			method143();

			if (field361.length() > 0) {
				field281.method444(190);
				field281.method451(VTCTQQUO.method508(field361));
				field281.method445(var2 - 601);
				field281.method445(field441 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method168() {
		if (field450 == null) {
			method142();
			field10 = null;
			field172 = null;
			field173 = null;
			field174 = null;
			field175 = null;
			field176 = null;
			field177 = null;
			field178 = null;
			field179 = null;
			field180 = null;
			field450 = new PKTDMNAV(479, method11(), 96);
			field448 = new PKTDMNAV(172, method11(), 156);
			TTGPXKMD.method430();
			field277.method555(0, 0);
			field447 = new PKTDMNAV(190, method11(), 261);
			field449 = new PKTDMNAV(512, method11(), 334);
			TTGPXKMD.method430();
			field505 = new PKTDMNAV(496, method11(), 50);
			field506 = new PKTDMNAV(269, method11(), 37);
			field507 = new PKTDMNAV(249, method11(), 45);
			field365 = true;
		}
	}

	public final void init() {
		field166 = Integer.parseInt(getParameter("nodeid"));
		field167 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method153();
		} else {
			method95();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field168 = false;
		} else {
			field168 = true;
		}

		method2(503, 765);
	}

	@ObfuscatedName("client.a(LLYHLTGUG;IIIIIII)V")
	public final void method169(LYHLTGUG arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0.field799 == 0 && arg0.field804 != null && !arg0.field852 && (arg2 >= arg6 && arg5 >= arg3 && arg2 <= arg0.field826 + arg6 && arg5 <= arg0.field855 + arg3)) {
			int var8 = arg0.field804.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg0.field801[var9] + arg6;
				int var11 = arg0.field844[var9] + arg3 - arg4;
				LYHLTGUG var12 = LYHLTGUG.field839[arg0.field804[var9]];
				var10 += var12.field808;
				var11 += var12.field812;
				if ((var12.field809 >= 0 || var12.field827 != 0) && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field826 + var10 && arg5 < var12.field855 + var11) {
					if (var12.field809 >= 0) {
						field456 = var12.field809;
					} else {
						field456 = var12.field814;
					}
				}

				if (var12.field799 == 8 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field826 + var10 && arg5 < var12.field855 + var11) {
					field256 = var12.field814;
				}

				if (var12.field799 == 0) {
					method169(var12, arg1, arg2, var11, var12.field798, arg5, var10);

					if (var12.field832 > var12.field855) {
						method120(var12.field855, var12.field832, arg2, var11, var12.field826 + var10, arg1, var12, arg5);
					}
				} else {
					if (var12.field795 == 1 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field826 + var10 && arg5 < var12.field855 + var11) {
						boolean var13 = false;
						if (var12.field828 != 0) {
							var13 = method152(var12);
						}

						if (!var13) {
							field267[field110] = var12.field846;
							field220[field110] = 951;
							field219[field110] = var12.field814;
							field110++;
						}
					}

					if (var12.field795 == 2 && field124 == 0 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field826 + var10 && arg5 < var12.field855 + var11) {
						String var14 = var12.field856;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field267[field110] = var14 + " @gre@" + var12.field845;
						field220[field110] = 870;
						field219[field110] = var12.field814;
						field110++;
					}

					if (var12.field795 == 3 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field826 + var10 && arg5 < var12.field855 + var11) {
						field267[field110] = "Close";

						if (arg1 == 3) {
							field220[field110] = 861;
						} else {
							field220[field110] = 978;
						}

						field219[field110] = var12.field814;
						field110++;
					}

					if (var12.field795 == 4 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field826 + var10 && arg5 < var12.field855 + var11) {
						field267[field110] = var12.field846;
						field220[field110] = 734;
						field219[field110] = var12.field814;
						field110++;
					}

					if (var12.field795 == 5 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field826 + var10 && arg5 < var12.field855 + var11) {
						field267[field110] = var12.field846;
						field220[field110] = 597;
						field219[field110] = var12.field814;
						field110++;
					}

					if (var12.field795 == 6 && !field442 && arg2 >= var10 && arg5 >= var11 && arg2 < var12.field826 + var10 && arg5 < var12.field855 + var11) {
						field267[field110] = var12.field846;
						field220[field110] = 217;
						field219[field110] = var12.field814;
						field110++;
					}

					if (var12.field799 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field855; var16++) {
							for (int var17 = 0; var17 < var12.field826; var17++) {
								int var18 = (var12.field847 + 32) * var17 + var10;
								int var19 = (var12.field817 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field853[var15];
									var19 += var12.field793[var15];
								}

								if (arg2 >= var18 && arg5 >= var19 && arg2 < var18 + 32 && arg5 < var19 + 32) {
									field203 = var15;
									field204 = var12.field814;

									if (var12.field843[var15] > 0) {
										MHOZCPTF var20 = MHOZCPTF.method322(var12.field843[var15] - 1);
										if (field433 == 1 && var12.field800) {
											if (field435 != var12.field814 || field434 != var15) {
												field267[field110] = "Use " + field437 + " with @lre@" + var20.field886;
												field220[field110] = 208;
												field221[field110] = var20.field888;
												field218[field110] = var15;
												field219[field110] = var12.field814;
												field110++;
											}
										} else if (field124 != 1 || !var12.field800) {
											if (var12.field800) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field909 != null && var20.field909[var21] != null) {
														field267[field110] = var20.field909[var21] + " @lre@" + var20.field886;

														if (var21 == 3) {
															field220[field110] = 532;
														}

														if (var21 == 4) {
															field220[field110] = 69;
														}

														field221[field110] = var20.field888;
														field218[field110] = var15;
														field219[field110] = var12.field814;
														field110++;
													} else if (var21 == 4) {
														field267[field110] = "Drop @lre@" + var20.field886;
														field220[field110] = 69;
														field221[field110] = var20.field888;
														field218[field110] = var15;
														field219[field110] = var12.field814;
														field110++;
													}
												}
											}

											if (var12.field816) {
												field267[field110] = "Use @lre@" + var20.field886;
												field220[field110] = 681;
												field221[field110] = var20.field888;
												field218[field110] = var15;
												field219[field110] = var12.field814;
												field110++;
											}

											if (var12.field800 && var20.field909 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field909[var22] != null) {
														field267[field110] = var20.field909[var22] + " @lre@" + var20.field886;

														if (var22 == 0) {
															field220[field110] = 650;
														}

														if (var22 == 1) {
															field220[field110] = 118;
														}

														if (var22 == 2) {
															field220[field110] = 821;
														}

														field221[field110] = var20.field888;
														field218[field110] = var15;
														field219[field110] = var12.field814;
														field110++;
													}
												}
											}

											if (var12.field810 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field810[var23] != null) {
														field267[field110] = var12.field810[var23] + " @lre@" + var20.field886;

														if (var23 == 0) {
															field220[field110] = 35;
														}

														if (var23 == 1) {
															field220[field110] = 479;
														}

														if (var23 == 2) {
															field220[field110] = 684;
														}

														if (var23 == 3) {
															field220[field110] = 842;
														}

														if (var23 == 4) {
															field220[field110] = 149;
														}

														field221[field110] = var20.field888;
														field218[field110] = var15;
														field219[field110] = var12.field814;
														field110++;
													}
												}
											}

											field267[field110] = "Examine @lre@" + var20.field886;
											field220[field110] = 1969;
											field221[field110] = var20.field888;
											field218[field110] = var15;
											field219[field110] = var12.field814;
											field110++;
										} else if ((field126 & 0x10) == 0x10) {
											field267[field110] = field127 + " @lre@" + var20.field886;
											field220[field110] = 775;
											field221[field110] = var20.field888;
											field218[field110] = var15;
											field219[field110] = var12.field814;
											field110++;
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

	@ObfuscatedName("client.q(Z)V")
	public final void method170() {
		for (HSFTIQUW var1 = (HSFTIQUW) field398.method503(); var1 != null; var1 = (HSFTIQUW) field398.method505()) {
			if (field480 != var1.field646 || var1.field651) {
				var1.method398();
			} else if (field306 >= var1.field643) {
				var1.method226(field511);

				if (var1.field651) {
					var1.method398();
				} else {
					field339.method353(60, var1.field647, 0, -1, var1.field649, var1.field646, var1.field648, var1, false);
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method9() {
		if (field366 || field479 || field446) {
			method105();
		} else {
			field300++;

			if (field217) {
				method47();
			} else {
				method56(false);
			}

			field184 = 0;
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method171() {
		if (field516 == 0) {
			int var1 = field23;
			if (field124 == 1 && field24 >= 516 && field25 >= 160 && field24 <= 765 && field25 <= 205) {
				var1 = 0;
			}

			if (field504) {
				if (var1 != 1) {
					int var2 = field17;
					int var3 = field18;
					if (field388 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field388 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field388 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field389 - 10 || var2 > field391 + field389 + 10 || var3 < field390 - 10 || var3 > field392 + field390 + 10) {
						field504 = false;

						if (field388 == 1) {
							field429 = true;
						}

						if (field388 == 2) {
							field362 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field389;
					int var5 = field390;
					int var6 = field391;
					int var7 = field24;
					int var8 = field25;
					if (field388 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field388 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field388 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field110; var10++) {
						int var11 = (field110 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method62(var9);
					}

					field504 = false;

					if (field388 == 1) {
						field429 = true;
					}

					if (field388 == 2) {
						field362 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field110 > 0) {
					int var12 = field220[field110 - 1];
					if (var12 == 35 || var12 == 479 || var12 == 684 || var12 == 842 || var12 == 149 || var12 == 650 || var12 == 118 || var12 == 821 || var12 == 532 || var12 == 69 || var12 == 681 || var12 == 1969) {
						int var13 = field218[field110 - 1];
						int var14 = field219[field110 - 1];
						LYHLTGUG var15 = LYHLTGUG.field839[var14];
						if (var15.field842 || var15.field811) {
							field386 = false;
							field427 = 0;
							field514 = var14;
							field515 = var13;
							field516 = 2;
							field517 = field24;
							field518 = field25;

							if (LYHLTGUG.field839[var14].field806 == field262) {
								field516 = 1;
							}

							if (LYHLTGUG.field839[var14].field806 == field298) {
								field516 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field92 == 1 || method94(field110 - 1)) && field110 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field110 > 0) {
					method62(field110 - 1);
				}

				if (var1 != 2 || field110 <= 0) {
					return;
				}

				method74();
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method172() {
		if (field433 == 0 && field124 == 0) {
			field267[field110] = "Walk here";
			field220[field110] = 904;
			field218[field110] = field17;
			field219[field110] = field18;
			field110++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < WEVRTBOZ.field1424; var2++) {
			int var3 = WEVRTBOZ.field1425[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field339.method372(field480, var4, var5, var3) >= 0) {
					BQKZHFKO var8 = BQKZHFKO.method24(var7);
					if (var8.field37 != null) {
						var8 = var8.method17();
					}

					if (var8 == null) {
						continue;
					}

					if (field433 == 1) {
						field267[field110] = "Use " + field437 + " with @cya@" + var8.field50;
						field220[field110] = 102;
						field221[field110] = var3;
						field218[field110] = var4;
						field219[field110] = var5;
						field110++;
					} else if (field124 != 1) {
						if (var8.field68 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field68[var9] != null) {
									field267[field110] = var8.field68[var9] + " @cya@" + var8.field50;

									if (var9 == 0) {
										field220[field110] = 551;
									}

									if (var9 == 1) {
										field220[field110] = 568;
									}

									if (var9 == 2) {
										field220[field110] = 698;
									}

									if (var9 == 3) {
										field220[field110] = 388;
									}

									if (var9 == 4) {
										field220[field110] = 1500;
									}

									field221[field110] = var3;
									field218[field110] = var4;
									field219[field110] = var5;
									field110++;
								}
							}
						}

						field267[field110] = "Examine @cya@" + var8.field50;
						field220[field110] = 1554;
						field221[field110] = var8.field58 << 14;
						field218[field110] = var4;
						field219[field110] = var5;
						field110++;
					} else if ((field126 & 0x4) == 4) {
						field267[field110] = field127 + " @cya@" + var8.field50;
						field220[field110] = 255;
						field221[field110] = var3;
						field218[field110] = var4;
						field219[field110] = var5;
						field110++;
					}
				}

				if (var6 == 1) {
					JKNLPRIU var10 = field322[var7];
					if (var10.field750.field736 == 1 && (var10.field1235 & 0x7F) == 0x40 && (var10.field1236 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field323; var11++) {
							JKNLPRIU var12 = field322[field324[var11]];
							if (var12 != null && var10 != var12 && var12.field750.field736 == 1 && var10.field1235 == var12.field1235 && var10.field1236 == var12.field1236) {
								method96(var4, var12.field750, var5, field324[var11]);
							}
						}

						for (int var13 = 0; var13 < field415; var13++) {
							UFGXOLGK var14 = field414[field416[var13]];
							if (var14 != null && var10.field1235 == var14.field1235 && var10.field1236 == var14.field1236) {
								method156(var5, field416[var13], var14, var4);
							}
						}
					}

					method96(var4, var10.field750, var5, var7);
				}

				if (var6 == 0) {
					UFGXOLGK var15 = field414[var7];
					if ((var15.field1235 & 0x7F) == 0x40 && (var15.field1236 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field323; var16++) {
							JKNLPRIU var17 = field322[field324[var16]];
							if (var17 != null && var17.field750.field736 == 1 && var15.field1235 == var17.field1235 && var15.field1236 == var17.field1236) {
								method96(var4, var17.field750, var5, field324[var16]);
							}
						}

						for (int var18 = 0; var18 < field415; var18++) {
							UFGXOLGK var19 = field414[field416[var18]];
							if (var19 != null && var15 != var19 && var15.field1235 == var19.field1235 && var15.field1236 == var19.field1236) {
								method156(var5, field416[var18], var19, var4);
							}
						}
					}

					method156(var5, var7, var15, var4);
				}

				if (var6 == 3) {
					URASIGRB var20 = field512[field480][var4][var5];
					if (var20 != null) {
						for (KWSTKWPH var21 = (KWSTKWPH) var20.method504(); var21 != null; var21 = (KWSTKWPH) var20.method506()) {
							MHOZCPTF var22 = MHOZCPTF.method322(var21.field774);
							if (field433 == 1) {
								field267[field110] = "Use " + field437 + " with @lre@" + var22.field886;
								field220[field110] = 534;
								field221[field110] = var21.field774;
								field218[field110] = var4;
								field219[field110] = var5;
								field110++;
							} else if (field124 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field906 != null && var22.field906[var23] != null) {
										field267[field110] = var22.field906[var23] + " @lre@" + var22.field886;

										if (var23 == 0) {
											field220[field110] = 915;
										}

										if (var23 == 1) {
											field220[field110] = 109;
										}

										if (var23 == 2) {
											field220[field110] = 14;
										}

										if (var23 == 3) {
											field220[field110] = 186;
										}

										if (var23 == 4) {
											field220[field110] = 401;
										}

										field221[field110] = var21.field774;
										field218[field110] = var4;
										field219[field110] = var5;
										field110++;
									} else if (var23 == 2) {
										field267[field110] = "Take @lre@" + var22.field886;
										field220[field110] = 14;
										field221[field110] = var21.field774;
										field218[field110] = var4;
										field219[field110] = var5;
										field110++;
									}
								}

								field267[field110] = "Examine @lre@" + var22.field886;
								field220[field110] = 1892;
								field221[field110] = var21.field774;
								field218[field110] = var4;
								field219[field110] = var5;
								field110++;
							} else if ((field126 & 0x1) == 1) {
								field267[field110] = field127 + " @lre@" + var22.field886;
								field220[field110] = 468;
								field221[field110] = var21.field774;
								field218[field110] = var4;
								field219[field110] = var5;
								field110++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method173(long arg0) {
		if (arg0 != 0L) {
			if (field396 >= 100 && field331 != 1) {
				method104("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field396 >= 200) {
				method104("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = VTCTQQUO.method512(VTCTQQUO.method509(arg0));
				for (int var4 = 0; var4 < field396; var4++) {
					if (field275[var4] == arg0) {
						method104("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field222; var5++) {
					if (field353[var5] == arg0) {
						method104("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field378.field1283)) {
					field513[field396] = var3;
					field275[field396] = arg0;
					field138[field396] = 0;
					field396++;
					field429 = true;
					field281.method444(27);
					field281.method451(arg0);
				}
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field158[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field407[var3] = var2 / 4;
		}
	}
}
