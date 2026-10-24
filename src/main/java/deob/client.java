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
public final class client extends LJUNUWBY {

	@ObfuscatedName("client.O")
	public int[][] field106 = new int[104][104];

	@ObfuscatedName("client.Y")
	public int[] field116 = new int[5];

	@ObfuscatedName("client.hb")
	public int[] field125 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.jb")
	public final int field127 = 100;

	@ObfuscatedName("client.kb")
	public int[] field128 = new int[100];

	@ObfuscatedName("client.ob")
	public boolean field130 = false;

	@ObfuscatedName("client.rb")
	public int field133 = -1;

	@ObfuscatedName("client.wb")
	public int field135 = 78;

	@ObfuscatedName("client.Fb")
	public int[] field143 = new int[AYCGKLZG.field68];

	@ObfuscatedName("client.Gb")
	public volatile boolean field144 = false;

	@ObfuscatedName("client.Jb")
	public byte[] field147 = new byte[16384];

	@ObfuscatedName("client.Kb")
	public int field148 = -1;

	@ObfuscatedName("client.Mb")
	public int field150 = 2;

	@ObfuscatedName("client.Nb")
	public AIRMECOM[] field151 = new AIRMECOM[8];

	@ObfuscatedName("client.Ob")
	public AIRMECOM[] field152 = new AIRMECOM[32];

	@ObfuscatedName("client.Pb")
	public boolean field153 = false;

	@ObfuscatedName("client.Sb")
	public final int[] field156 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Tb")
	public int[] field157 = new int[50];

	@ObfuscatedName("client.bc")
	public boolean field164 = true;

	@ObfuscatedName("client.cc")
	public int[] field165 = new int[AYCGKLZG.field68];

	@ObfuscatedName("client.ec")
	public OJMMOVXV[] field167 = new OJMMOVXV[13];

	@ObfuscatedName("client.rc")
	public boolean field180 = false;

	@ObfuscatedName("client.sc")
	public int[] field181 = new int[4000];

	@ObfuscatedName("client.tc")
	public int[] field182 = new int[4000];

	@ObfuscatedName("client.Cc")
	public int field191 = -1;

	@ObfuscatedName("client.Fc")
	public int[] field194 = new int[2000];

	@ObfuscatedName("client.Hc")
	public int[] field195 = new int[33];

	@ObfuscatedName("client.Kc")
	public String[] field198 = new String[500];

	@ObfuscatedName("client.Lc")
	public int[] field199 = new int[2000];

	@ObfuscatedName("client.Mc")
	public boolean field200 = true;

	@ObfuscatedName("client.Oc")
	public boolean field202 = false;

	@ObfuscatedName("client.Vc")
	public int field209 = 0x4D4233;

	@ObfuscatedName("client.Xc")
	public boolean field211 = true;

	@ObfuscatedName("client.ad")
	public boolean field213 = false;

	@ObfuscatedName("client.dd")
	public int[] field215 = new int[151];

	@ObfuscatedName("client.fd")
	public String field217 = "";

	@ObfuscatedName("client.kd")
	public boolean field220 = false;

	@ObfuscatedName("client.od")
	public int[] field224 = new int[100];

	@ObfuscatedName("client.pd")
	public String[] field225 = new String[100];

	@ObfuscatedName("client.qd")
	public String[] field226 = new String[100];

	@ObfuscatedName("client.td")
	public int[] field227 = new int[5];

	@ObfuscatedName("client.wd")
	public AIRMECOM[] field229 = new AIRMECOM[20];

	@ObfuscatedName("client.Cd")
	public boolean field235 = false;

	@ObfuscatedName("client.Ed")
	public String[] field236 = new String[200];

	@ObfuscatedName("client.Id")
	public boolean field240 = false;

	@ObfuscatedName("client.Jd")
	public int[] field241 = new int[151];

	@ObfuscatedName("client.Kd")
	public RSWRPCHR field242 = new RSWRPCHR(new byte[5000]);

	@ObfuscatedName("client.Ld")
	public ITIWVLHR[] field243 = new ITIWVLHR[16384];

	@ObfuscatedName("client.Nd")
	public int[] field245 = new int[16384];

	@ObfuscatedName("client.Od")
	public int[] field246 = new int[7];

	@ObfuscatedName("client.Pd")
	public int[] field247 = new int[500];

	@ObfuscatedName("client.Qd")
	public int[] field248 = new int[500];

	@ObfuscatedName("client.Rd")
	public int[] field249 = new int[500];

	@ObfuscatedName("client.Sd")
	public int[] field250 = new int[500];

	@ObfuscatedName("client.Td")
	public boolean field251 = false;

	@ObfuscatedName("client.Vd")
	public boolean field253 = false;

	@ObfuscatedName("client.de")
	public int[] field259 = new int[1000];

	@ObfuscatedName("client.ee")
	public int[] field260 = new int[1000];

	@ObfuscatedName("client.ge")
	public int field262 = -1;

	@ObfuscatedName("client.he")
	public int[][][] field263 = new int[4][13][13];

	@ObfuscatedName("client.ke")
	public int[] field264 = new int[33];

	@ObfuscatedName("client.qe")
	public int[] field270 = new int[50];

	@ObfuscatedName("client.Ae")
	public RSWRPCHR field280 = RSWRPCHR.method376(1);

	@ObfuscatedName("client.Be")
	public int field281 = -1;

	@ObfuscatedName("client.Ce")
	public int[] field282 = new int[9];

	@ObfuscatedName("client.Le")
	public long[] field290 = new long[200];

	@ObfuscatedName("client.Me")
	public EZXKBAZY field291 = new EZXKBAZY();

	@ObfuscatedName("client.Se")
	public int field295 = 0x766654;

	@ObfuscatedName("client.Ue")
	public int field296 = 128;

	@ObfuscatedName("client.Ye")
	public RSWRPCHR field300 = RSWRPCHR.method376(1);

	@ObfuscatedName("client.bf")
	public boolean field301 = false;

	@ObfuscatedName("client.cf")
	public boolean field302 = false;

	@ObfuscatedName("client.hf")
	public int field305 = 0x332D25;

	@ObfuscatedName("client.kf")
	public EZXKBAZY field306 = new EZXKBAZY();

	@ObfuscatedName("client.qf")
	public IGMZHLWJ field312 = new IGMZHLWJ();

	@ObfuscatedName("client.vf")
	public int[] field316 = new int[AYCGKLZG.field68];

	@ObfuscatedName("client.wf")
	public String field317 = "";

	@ObfuscatedName("client.Bf")
	public AIRMECOM[] field320 = new AIRMECOM[100];

	@ObfuscatedName("client.Cf")
	public int[][] field321 = new int[104][104];

	@ObfuscatedName("client.Df")
	public int field322 = -1;

	@ObfuscatedName("client.Ef")
	public AIRMECOM[] field323 = new AIRMECOM[1000];

	@ObfuscatedName("client.If")
	public int[] field326 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Pf")
	public YXBFJZDP[] field333 = new YXBFJZDP[5];

	@ObfuscatedName("client.Uf")
	public int[] field338 = new int[50];

	@ObfuscatedName("client.Wf")
	public int field340 = -1;

	@ObfuscatedName("client.Yf")
	public int field342 = 2048;

	@ObfuscatedName("client.Zf")
	public int field343 = 2047;

	@ObfuscatedName("client.ag")
	public MVRUIIXW[] field344 = new MVRUIIXW[field342];

	@ObfuscatedName("client.cg")
	public int[] field346 = new int[field342];

	@ObfuscatedName("client.eg")
	public int[] field348 = new int[field342];

	@ObfuscatedName("client.fg")
	public RSWRPCHR[] field349 = new RSWRPCHR[field342];

	@ObfuscatedName("client.gg")
	public int field350 = -1;

	@ObfuscatedName("client.ig")
	public boolean field352 = false;

	@ObfuscatedName("client.og")
	public int[] field358 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.ug")
	public boolean field364 = false;

	@ObfuscatedName("client.wg")
	public OJMMOVXV[] field366 = new OJMMOVXV[100];

	@ObfuscatedName("client.yg")
	public boolean field367 = false;

	@ObfuscatedName("client.Bg")
	public int[] field370 = new int[5];

	@ObfuscatedName("client.Hg")
	public int field376 = 2;

	@ObfuscatedName("client.Jg")
	public int field378 = -1;

	@ObfuscatedName("client.Kg")
	public int field379 = -1;

	@ObfuscatedName("client.Ng")
	public int field382 = 3;

	@ObfuscatedName("client.Og")
	public int field383 = -1;

	@ObfuscatedName("client.Sg")
	public int field387 = 50;

	@ObfuscatedName("client.Tg")
	public int[] field388 = new int[field387];

	@ObfuscatedName("client.Ug")
	public int[] field389 = new int[field387];

	@ObfuscatedName("client.Vg")
	public int[] field390 = new int[field387];

	@ObfuscatedName("client.Wg")
	public int[] field391 = new int[field387];

	@ObfuscatedName("client.Xg")
	public int[] field392 = new int[field387];

	@ObfuscatedName("client.Yg")
	public int[] field393 = new int[field387];

	@ObfuscatedName("client.Zg")
	public int[] field394 = new int[field387];

	@ObfuscatedName("client.ah")
	public String[] field395 = new String[field387];

	@ObfuscatedName("client.fh")
	public int[] field400 = new int[5];

	@ObfuscatedName("client.hh")
	public int[] field402 = new int[1000];

	@ObfuscatedName("client.ih")
	public String field403 = "";

	@ObfuscatedName("client.vh")
	public int field414 = 1;

	@ObfuscatedName("client.zh")
	public boolean field417 = false;

	@ObfuscatedName("client.Eh")
	public String field422 = "";

	@ObfuscatedName("client.Fh")
	public String field423 = "";

	@ObfuscatedName("client.Jh")
	public int[] field427 = new int[5];

	@ObfuscatedName("client.Kh")
	public EZXKBAZY field428 = new EZXKBAZY();

	@ObfuscatedName("client.Nh")
	public String[] field430 = new String[5];

	@ObfuscatedName("client.Oh")
	public boolean[] field431 = new boolean[5];

	@ObfuscatedName("client.Rh")
	public boolean field433 = false;

	@ObfuscatedName("client.Zh")
	public boolean field441 = false;

	@ObfuscatedName("client.ai")
	public String field442 = "";

	@ObfuscatedName("client.bi")
	public boolean field443 = true;

	@ObfuscatedName("client.ci")
	public AIRMECOM[] field444 = new AIRMECOM[32];

	@ObfuscatedName("client.hi")
	public RSWRPCHR field449 = RSWRPCHR.method376(1);

	@ObfuscatedName("client.ii")
	public boolean field450 = false;

	@ObfuscatedName("client.ji")
	public volatile boolean field451 = false;

	@ObfuscatedName("client.ki")
	public String field452 = "";

	@ObfuscatedName("client.mi")
	public String[] field454 = new String[100];

	@ObfuscatedName("client.ni")
	public int[] field455 = new int[100];

	@ObfuscatedName("client.pi")
	public boolean field457 = false;

	@ObfuscatedName("client.Ai")
	public AIRMECOM[] field466 = new AIRMECOM[32];

	@ObfuscatedName("client.Fi")
	public boolean field471 = true;

	@ObfuscatedName("client.Ji")
	public OJMMOVXV[] field475 = new OJMMOVXV[2];

	@ObfuscatedName("client.Zi")
	public int field490 = 1;

	@ObfuscatedName("client.aj")
	public String field491 = "";

	@ObfuscatedName("client.bj")
	public String field492 = "";

	@ObfuscatedName("client.jj")
	public boolean field498 = false;

	@ObfuscatedName("client.wj")
	public int[] field511 = new int[200];

	@ObfuscatedName("client.xj")
	public int[][] field512 = new int[104][104];

	@ObfuscatedName("client.yj")
	public int[] field513 = new int[256];

	@ObfuscatedName("client.Bj")
	public long[] field515 = new long[100];

	@ObfuscatedName("client.Cj")
	public EZXKBAZY[][][] field516 = new EZXKBAZY[4][104][104];

	@ObfuscatedName("client.Dj")
	public boolean[] field517 = new boolean[5];

	@ObfuscatedName("client.Ej")
	public int field518 = -1;

	@ObfuscatedName("client.Fj")
	public int field519 = -1;

	@ObfuscatedName("client.Gj")
	public boolean field520 = false;

	@ObfuscatedName("client.Hj")
	public int field521 = -1;

	@ObfuscatedName("client.Nj")
	public KQTHKTBC[] field526 = new KQTHKTBC[4];

	@ObfuscatedName("client.Oj")
	public CRC32 field527 = new CRC32();

	@ObfuscatedName("client.Zj")
	public int field536 = 2;

	@ObfuscatedName("client.ak")
	public volatile boolean field537 = false;

	@ObfuscatedName("client.bk")
	public int field538 = -1;

	@ObfuscatedName("client.ck")
	public int field539 = 0x23201B;

	@ObfuscatedName("client.dk")
	public String field540 = "";

	@ObfuscatedName("client.ek")
	public int field541 = -1;

	@ObfuscatedName("client.lb")
	public static BigInteger field129 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.pb")
	public static final int[][] field131 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.gd")
	public static String field218 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ff")
	public static BigInteger field324 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Gf")
	public static int[] field325 = new int[32];

	@ObfuscatedName("client.Xh")
	public static int[] field439 = new int[99];

	@ObfuscatedName("client.ui")
	public static int field460 = 10;

	@ObfuscatedName("client.wi")
	public static boolean field462 = true;

	@ObfuscatedName("client.Ki")
	public static final int[] field476 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.J")
	public int field102;

	@ObfuscatedName("client.P")
	public int field107;

	@ObfuscatedName("client.gb")
	public static int field124;

	@ObfuscatedName("client.ib")
	public int field126;

	@ObfuscatedName("client.qb")
	public static int field132;

	@ObfuscatedName("client.ub")
	public int field134;

	@ObfuscatedName("client.xb")
	public static int field136;

	@ObfuscatedName("client.yb")
	public int field137;

	@ObfuscatedName("client.zb")
	public int field138;

	@ObfuscatedName("client.Ab")
	public int field139;

	@ObfuscatedName("client.Bb")
	public int field140;

	@ObfuscatedName("client.Cb")
	public int field141;

	@ObfuscatedName("client.Ib")
	public int field146;

	@ObfuscatedName("client.Lb")
	public int field149;

	@ObfuscatedName("client.Qb")
	public int field154;

	@ObfuscatedName("client.Rb")
	public int field155;

	@ObfuscatedName("client.Wb")
	public int field159;

	@ObfuscatedName("client.Xb")
	public int field160;

	@ObfuscatedName("client.Yb")
	public int field161;

	@ObfuscatedName("client.Zb")
	public static int field162;

	@ObfuscatedName("client.ac")
	public int field163;

	@ObfuscatedName("client.dc")
	public int field166;

	@ObfuscatedName("client.oc")
	public int field177;

	@ObfuscatedName("client.pc")
	public int field178;

	@ObfuscatedName("client.qc")
	public int field179;

	@ObfuscatedName("client.yc")
	public int field187;

	@ObfuscatedName("client.zc")
	public int field188;

	@ObfuscatedName("client.Ac")
	public int field189;

	@ObfuscatedName("client.Bc")
	public int field190;

	@ObfuscatedName("client.Dc")
	public int field192;

	@ObfuscatedName("client.Ec")
	public int field193;

	@ObfuscatedName("client.Nc")
	public int field201;

	@ObfuscatedName("client.Pc")
	public int field203;

	@ObfuscatedName("client.Qc")
	public int field204;

	@ObfuscatedName("client.Rc")
	public int field205;

	@ObfuscatedName("client.Sc")
	public int field206;

	@ObfuscatedName("client.Tc")
	public int field207;

	@ObfuscatedName("client.Uc")
	public int field208;

	@ObfuscatedName("client.Wc")
	public int field210;

	@ObfuscatedName("client.Zc")
	public int field212;

	@ObfuscatedName("client.bd")
	public static int field214;

	@ObfuscatedName("client.ed")
	public int field216;

	@ObfuscatedName("client.id")
	public int field219;

	@ObfuscatedName("client.nd")
	public int field223;

	@ObfuscatedName("client.vd")
	public int field228;

	@ObfuscatedName("client.xd")
	public int field230;

	@ObfuscatedName("client.yd")
	public int field231;

	@ObfuscatedName("client.zd")
	public int field232;

	@ObfuscatedName("client.Ad")
	public int field233;

	@ObfuscatedName("client.Bd")
	public int field234;

	@ObfuscatedName("client.Fd")
	public int field237;

	@ObfuscatedName("client.Gd")
	public static int field238;

	@ObfuscatedName("client.Hd")
	public int field239;

	@ObfuscatedName("client.Md")
	public int field244;

	@ObfuscatedName("client.Ud")
	public int field252;

	@ObfuscatedName("client.Zd")
	public int field255;

	@ObfuscatedName("client.ce")
	public int field258;

	@ObfuscatedName("client.fe")
	public int field261;

	@ObfuscatedName("client.le")
	public int field265;

	@ObfuscatedName("client.me")
	public int field266;

	@ObfuscatedName("client.ne")
	public int field267;

	@ObfuscatedName("client.oe")
	public int field268;

	@ObfuscatedName("client.pe")
	public int field269;

	@ObfuscatedName("client.De")
	public static int field283;

	@ObfuscatedName("client.Pe")
	public int field292;

	@ObfuscatedName("client.Qe")
	public int field293;

	@ObfuscatedName("client.Re")
	public int field294;

	@ObfuscatedName("client.Ve")
	public int field297;

	@ObfuscatedName("client.We")
	public int field298;

	@ObfuscatedName("client.Xe")
	public int field299;

	@ObfuscatedName("client.ff")
	public static int field304;

	@ObfuscatedName("client.sf")
	public int field314;

	@ObfuscatedName("client.uf")
	public int field315;

	@ObfuscatedName("client.xf")
	public int field318;

	@ObfuscatedName("client.zf")
	public int field319;

	@ObfuscatedName("client.Lf")
	public int field329;

	@ObfuscatedName("client.Mf")
	public int field330;

	@ObfuscatedName("client.Nf")
	public int field331;

	@ObfuscatedName("client.Qf")
	public int field334;

	@ObfuscatedName("client.Rf")
	public int field335;

	@ObfuscatedName("client.Sf")
	public int field336;

	@ObfuscatedName("client.Vf")
	public int field339;

	@ObfuscatedName("client.Xf")
	public int field341;

	@ObfuscatedName("client.bg")
	public int field345;

	@ObfuscatedName("client.dg")
	public int field347;

	@ObfuscatedName("client.jg")
	public static int field353;

	@ObfuscatedName("client.ng")
	public int field357;

	@ObfuscatedName("client.pg")
	public int field359;

	@ObfuscatedName("client.qg")
	public int field360;

	@ObfuscatedName("client.rg")
	public int field361;

	@ObfuscatedName("client.sg")
	public int field362;

	@ObfuscatedName("client.vg")
	public int field365;

	@ObfuscatedName("client.Ag")
	public int field369;

	@ObfuscatedName("client.Cg")
	public static int field371;

	@ObfuscatedName("client.Dg")
	public int field372;

	@ObfuscatedName("client.Eg")
	public int field373;

	@ObfuscatedName("client.Fg")
	public int field374;

	@ObfuscatedName("client.Gg")
	public int field375;

	@ObfuscatedName("client.Ig")
	public int field377;

	@ObfuscatedName("client.Lg")
	public int field380;

	@ObfuscatedName("client.Mg")
	public int field381;

	@ObfuscatedName("client.Pg")
	public int field384;

	@ObfuscatedName("client.Qg")
	public int field385;

	@ObfuscatedName("client.Rg")
	public int field386;

	@ObfuscatedName("client.bh")
	public int field396;

	@ObfuscatedName("client.ch")
	public int field397;

	@ObfuscatedName("client.dh")
	public int field398;

	@ObfuscatedName("client.eh")
	public int field399;

	@ObfuscatedName("client.gh")
	public int field401;

	@ObfuscatedName("client.jh")
	public int field404;

	@ObfuscatedName("client.kh")
	public int field405;

	@ObfuscatedName("client.lh")
	public int field406;

	@ObfuscatedName("client.mh")
	public int field407;

	@ObfuscatedName("client.nh")
	public int field408;

	@ObfuscatedName("client.oh")
	public int field409;

	@ObfuscatedName("client.ph")
	public int field410;

	@ObfuscatedName("client.qh")
	public static int field411;

	@ObfuscatedName("client.th")
	public int field412;

	@ObfuscatedName("client.uh")
	public int field413;

	@ObfuscatedName("client.Ah")
	public int field418;

	@ObfuscatedName("client.Bh")
	public int field419;

	@ObfuscatedName("client.Dh")
	public int field421;

	@ObfuscatedName("client.Gh")
	public int field424;

	@ObfuscatedName("client.Hh")
	public int field425;

	@ObfuscatedName("client.Ih")
	public static int field426;

	@ObfuscatedName("client.Mh")
	public int field429;

	@ObfuscatedName("client.Uh")
	public int field436;

	@ObfuscatedName("client.Yh")
	public int field440;

	@ObfuscatedName("client.li")
	public int field453;

	@ObfuscatedName("client.oi")
	public int field456;

	@ObfuscatedName("client.qi")
	public int field458;

	@ObfuscatedName("client.ti")
	public int field459;

	@ObfuscatedName("client.vi")
	public static int field461;

	@ObfuscatedName("client.yi")
	public int field464;

	@ObfuscatedName("client.zi")
	public int field465;

	@ObfuscatedName("client.Bi")
	public static int field467;

	@ObfuscatedName("client.Ci")
	public int field468;

	@ObfuscatedName("client.Di")
	public int field469;

	@ObfuscatedName("client.Ei")
	public int field470;

	@ObfuscatedName("client.Gi")
	public int field472;

	@ObfuscatedName("client.Hi")
	public int field473;

	@ObfuscatedName("client.Ii")
	public int field474;

	@ObfuscatedName("client.Mi")
	public int field477;

	@ObfuscatedName("client.Ni")
	public int field478;

	@ObfuscatedName("client.Oi")
	public int field479;

	@ObfuscatedName("client.Pi")
	public int field480;

	@ObfuscatedName("client.Qi")
	public int field481;

	@ObfuscatedName("client.Yi")
	public int field489;

	@ObfuscatedName("client.dj")
	public int field493;

	@ObfuscatedName("client.ej")
	public int field494;

	@ObfuscatedName("client.fj")
	public int field495;

	@ObfuscatedName("client.gj")
	public int field496;

	@ObfuscatedName("client.hj")
	public int field497;

	@ObfuscatedName("client.qj")
	public int field505;

	@ObfuscatedName("client.rj")
	public int field506;

	@ObfuscatedName("client.sj")
	public int field507;

	@ObfuscatedName("client.tj")
	public int field508;

	@ObfuscatedName("client.Ij")
	public int field522;

	@ObfuscatedName("client.Kj")
	public int field524;

	@ObfuscatedName("client.Lj")
	public int field525;

	@ObfuscatedName("client.Qj")
	public int field528;

	@ObfuscatedName("client.Tj")
	public int field531;

	@ObfuscatedName("client.Uj")
	public int field532;

	@ObfuscatedName("client.Vj")
	public int field533;

	@ObfuscatedName("client.Wj")
	public int field534;

	@ObfuscatedName("client.Yj")
	public int field535;

	@ObfuscatedName("client.Q")
	public long field108;

	@ObfuscatedName("client.R")
	public long field109;

	@ObfuscatedName("client.ef")
	public long field303;

	@ObfuscatedName("client.hg")
	public long field351;

	@ObfuscatedName("client.zg")
	public long field368;

	@ObfuscatedName("client.T")
	public AIRMECOM field111;

	@ObfuscatedName("client.U")
	public AIRMECOM field112;

	@ObfuscatedName("client.V")
	public AIRMECOM field113;

	@ObfuscatedName("client.W")
	public AIRMECOM field114;

	@ObfuscatedName("client.X")
	public AIRMECOM field115;

	@ObfuscatedName("client.Eb")
	public AIRMECOM field142;

	@ObfuscatedName("client.Ic")
	public AIRMECOM field196;

	@ObfuscatedName("client.Jc")
	public AIRMECOM field197;

	@ObfuscatedName("client.Xd")
	public AIRMECOM field254;

	@ObfuscatedName("client.ae")
	public AIRMECOM field256;

	@ObfuscatedName("client.be")
	public AIRMECOM field257;

	@ObfuscatedName("client.Jf")
	public AIRMECOM field327;

	@ObfuscatedName("client.Kf")
	public AIRMECOM field328;

	@ObfuscatedName("client.Of")
	public AIRMECOM field332;

	@ObfuscatedName("client.Ch")
	public AIRMECOM field420;

	@ObfuscatedName("client.uc")
	public EDIBXOXE field183;

	@ObfuscatedName("client.vc")
	public EDIBXOXE field184;

	@ObfuscatedName("client.wc")
	public EDIBXOXE field185;

	@ObfuscatedName("client.xc")
	public EDIBXOXE field186;

	@ObfuscatedName("client.kj")
	public FXNTEMPE field499;

	@ObfuscatedName("client.pf")
	public static MVRUIIXW field311;

	@ObfuscatedName("client.Ph")
	public NERZSWTZ field432;

	@ObfuscatedName("client.md")
	public NZNLPNYM field222;

	@ObfuscatedName("client.K")
	public OJMMOVXV field103;

	@ObfuscatedName("client.L")
	public OJMMOVXV field104;

	@ObfuscatedName("client.M")
	public OJMMOVXV field105;

	@ObfuscatedName("client.Ee")
	public OJMMOVXV field284;

	@ObfuscatedName("client.Fe")
	public OJMMOVXV field285;

	@ObfuscatedName("client.Ge")
	public OJMMOVXV field286;

	@ObfuscatedName("client.xh")
	public OJMMOVXV field415;

	@ObfuscatedName("client.yh")
	public OJMMOVXV field416;

	@ObfuscatedName("client.Vh")
	public OJMMOVXV field437;

	@ObfuscatedName("client.Wh")
	public OJMMOVXV field438;

	@ObfuscatedName("client.Ri")
	public OJMMOVXV field482;

	@ObfuscatedName("client.Si")
	public OJMMOVXV field483;

	@ObfuscatedName("client.Ti")
	public OJMMOVXV field484;

	@ObfuscatedName("client.Ui")
	public OJMMOVXV field485;

	@ObfuscatedName("client.Vi")
	public OJMMOVXV field486;

	@ObfuscatedName("client.lj")
	public OJMMOVXV field500;

	@ObfuscatedName("client.mj")
	public OJMMOVXV field501;

	@ObfuscatedName("client.nj")
	public OJMMOVXV field502;

	@ObfuscatedName("client.oj")
	public OJMMOVXV field503;

	@ObfuscatedName("client.pj")
	public OJMMOVXV field504;

	@ObfuscatedName("client.S")
	public OLIDOILN field110;

	@ObfuscatedName("client.fc")
	public PRSDKOTZ field168;

	@ObfuscatedName("client.gc")
	public PRSDKOTZ field169;

	@ObfuscatedName("client.hc")
	public PRSDKOTZ field170;

	@ObfuscatedName("client.ic")
	public PRSDKOTZ field171;

	@ObfuscatedName("client.jc")
	public PRSDKOTZ field172;

	@ObfuscatedName("client.kc")
	public PRSDKOTZ field173;

	@ObfuscatedName("client.lc")
	public PRSDKOTZ field174;

	@ObfuscatedName("client.mc")
	public PRSDKOTZ field175;

	@ObfuscatedName("client.nc")
	public PRSDKOTZ field176;

	@ObfuscatedName("client.re")
	public PRSDKOTZ field271;

	@ObfuscatedName("client.se")
	public PRSDKOTZ field272;

	@ObfuscatedName("client.te")
	public PRSDKOTZ field273;

	@ObfuscatedName("client.ue")
	public PRSDKOTZ field274;

	@ObfuscatedName("client.ve")
	public PRSDKOTZ field275;

	@ObfuscatedName("client.we")
	public PRSDKOTZ field276;

	@ObfuscatedName("client.xe")
	public PRSDKOTZ field277;

	@ObfuscatedName("client.ye")
	public PRSDKOTZ field278;

	@ObfuscatedName("client.ze")
	public PRSDKOTZ field279;

	@ObfuscatedName("client.Ie")
	public PRSDKOTZ field287;

	@ObfuscatedName("client.Je")
	public PRSDKOTZ field288;

	@ObfuscatedName("client.Ke")
	public PRSDKOTZ field289;

	@ObfuscatedName("client.lf")
	public PRSDKOTZ field307;

	@ObfuscatedName("client.mf")
	public PRSDKOTZ field308;

	@ObfuscatedName("client.nf")
	public PRSDKOTZ field309;

	@ObfuscatedName("client.of")
	public PRSDKOTZ field310;

	@ObfuscatedName("client.uj")
	public QJAHKUCY field509;

	@ObfuscatedName("client.Rj")
	public YJCKMNKP field529;

	@ObfuscatedName("client.Ub")
	public String field158;

	@ObfuscatedName("client.ld")
	public String field221;

	@ObfuscatedName("client.Tf")
	public String field337;

	@ObfuscatedName("client.tg")
	public String field363;

	@ObfuscatedName("client.Jj")
	public Socket field523;

	@ObfuscatedName("client.rf")
	public static boolean field313;

	@ObfuscatedName("client.xi")
	public static boolean field463;

	@ObfuscatedName("client.Wi")
	public static boolean field487;

	@ObfuscatedName("client.vj")
	public static boolean field510;

	@ObfuscatedName("client.Z")
	public int[] field117;

	@ObfuscatedName("client.ab")
	public int[] field118;

	@ObfuscatedName("client.bb")
	public int[] field119;

	@ObfuscatedName("client.cb")
	public int[] field120;

	@ObfuscatedName("client.db")
	public int[] field121;

	@ObfuscatedName("client.eb")
	public int[] field122;

	@ObfuscatedName("client.fb")
	public int[] field123;

	@ObfuscatedName("client.kg")
	public int[] field354;

	@ObfuscatedName("client.lg")
	public int[] field355;

	@ObfuscatedName("client.Sh")
	public int[] field434;

	@ObfuscatedName("client.Th")
	public int[] field435;

	@ObfuscatedName("client.di")
	public int[] field445;

	@ObfuscatedName("client.ei")
	public int[] field446;

	@ObfuscatedName("client.fi")
	public int[] field447;

	@ObfuscatedName("client.gi")
	public int[] field448;

	@ObfuscatedName("client.Hb")
	public OJMMOVXV[] field145;

	@ObfuscatedName("client.mg")
	public byte[][] field356;

	@ObfuscatedName("client.Aj")
	public byte[][] field514;

	@ObfuscatedName("client.Xi")
	public byte[][][] field488;

	@ObfuscatedName("client.Sj")
	public int[][][] field530;

	@ObfuscatedName("client.b(II)V")
	public final void method21(int arg0) {
		IGMZHLWJ.method223(arg0);
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method22(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field488[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field530[var6][var4][var5] + field530[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field530[var6][var4][var5 + 1] + field530[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.d(I)I")
	public final int method23() {
		int var1 = 3;
		if (field496 < 310) {
			int var2 = field493 >> 7;
			int var3 = field495 >> 7;
			int var4 = field311.field1455 >> 7;
			int var5 = field311.field1456 >> 7;

			if ((field488[field319][var2][var3] & 0x4) != 0) {
				var1 = field319;
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

					if ((field488[field319][var2][var3] & 0x4) != 0) {
						var1 = field319;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field488[field319][var2][var3] & 0x4) != 0) {
							var1 = field319;
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

					if ((field488[field319][var2][var3] & 0x4) != 0) {
						var1 = field319;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field488[field319][var2][var3] & 0x4) != 0) {
							var1 = field319;
						}
					}
				}
			}
		}

		if ((field488[field319][field311.field1455 >> 7][field311.field1456 >> 7] & 0x4) != 0) {
			var1 = field319;
		}

		return var1;
	}

	@ObfuscatedName("client.e(I)I")
	public final int method24() {
		int var1 = method22(field493, field319, field495);
		if (var1 - field494 < 800 && (field488[field319][field493 >> 7][field495 >> 7] & 0x4) != 0) {
			return field319;
		}

		return 3;
	}

	@ObfuscatedName("client.f(I)V")
	public final void method25() {
		if (field807 == null) {
			method49();
			field168 = null;
			field169 = null;
			field170 = null;
			field171 = null;
			field172 = null;
			field173 = null;
			field174 = null;
			field175 = null;
			field176 = null;
			field310 = null;
			field308 = null;
			field307 = null;
			field309 = null;
			field287 = null;
			field288 = null;
			field289 = null;
			field807 = new PRSDKOTZ(503, 765, method99());
			field213 = true;
		}
	}

	public final void run() {
		if (field451) {
			method106();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IILRSWRPCHR;)V")
	public final void method26(int arg0, RSWRPCHR arg1) {
		field401 = 0;
		field347 = 0;
		method164(arg1, arg0);
		method107(arg1, arg0);
		method96(arg0, arg1);
		method125(arg1, arg0);

		for (int var3 = 0; var3 < field401; var3++) {
			int var4 = field402[var3];
			if (field353 != field344[var4].field1473) {
				field344[var4] = null;
			}
		}

		if (arg1.field1038 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1038 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field345; var5++) {
			if (field344[field346[var5]] == null) {
				signlink.reporterror(field491 + " null entry in pl list - pos:" + var5 + " size:" + field345);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method27() {
		field307.method351();
		XGNGXTLX.field1332 = field121;
		field284.method320(0, 0);

		if (field521 != -1) {
			method143(0, IGMZHLWJ.method215(field521), 0, 0);
		} else if (field326[field382] != -1) {
			method143(0, IGMZHLWJ.method215(field326[field382]), 0, 0);
		}

		if (field450 && field204 == 1) {
			method86();
		}

		field307.method352(553, 205, field806);
		field309.method351();
		XGNGXTLX.field1332 = field122;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field529.method568(arg1, arg2, arg3);
		if (var6 != 0) {
			int var7 = field529.method572(arg1, arg2, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg4;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field420.field13;
			int var12 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			URZZBDTU var14 = URZZBDTU.method450(var13);
			if (var14.field1175 == -1) {
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
				OJMMOVXV var15 = field366[var14.field1175];
				if (var15 != null) {
					int var16 = (var14.field1203 * 4 - var15.field911) / 2;
					int var17 = (var14.field1174 * 4 - var15.field912) / 2;
					var15.method320(arg2 * 4 + var16 + 48, (104 - arg3 - var14.field1174) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field529.method570(arg1, arg2, arg3);
		if (var18 != 0) {
			int var19 = field529.method572(arg1, arg2, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			URZZBDTU var23 = URZZBDTU.method450(var22);
			if (var23.field1175 != -1) {
				OJMMOVXV var24 = field366[var23.field1175];
				if (var24 != null) {
					int var25 = (var23.field1203 * 4 - var24.field911) / 2;
					int var26 = (var23.field1174 * 4 - var24.field912) / 2;
					var24.method320(arg2 * 4 + var25 + 48, (104 - arg3 - var23.field1174) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field420.field13;
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

		int var30 = field529.method571(arg1, arg2, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			URZZBDTU var32 = URZZBDTU.method450(var31);
			if (var32.field1175 != -1) {
				OJMMOVXV var33 = field366[var32.field1175];
				if (var33 != null) {
					int var34 = (var32.field1203 * 4 - var33.field911) / 2;
					int var35 = (var32.field1174 * 4 - var33.field912) / 2;
					var33.method320(arg2 * 4 + var34 + 48, (104 - arg3 - var32.field1174) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method29(String arg0) throws IOException {
		if (field202) {
			if (field523 != null) {
				try {
					field523.close();
				} catch (Exception var4) {
				}

				field523 = null;
			}

			field523 = method111(43595);
			field523.setSoTimeout(10000);
			InputStream var2 = field523.getInputStream();
			OutputStream var3 = field523.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(ILZJNNOVLJ;I)V")
	public final void method30(int arg0, ZJNNOVLJ arg1) {
		method31(arg0, arg1.field1456, arg1.field1455);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method31(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
			int var4 = method22(arg2, field319, arg1) - arg0;
			arg2 -= field493;
			var4 -= field494;
			arg1 -= field495;
			int var5 = WRJMHIDY.field1292[field496];
			int var6 = WRJMHIDY.field1293[field496];
			int var7 = WRJMHIDY.field1292[field497];
			int var8 = WRJMHIDY.field1293[field497];
			int var9 = arg1 * var7 + arg2 * var8 >> 16;
			arg1 = arg1 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field518 = (var9 << 9) / arg1 + XGNGXTLX.field1326;
				field519 = (var11 << 9) / arg1 + XGNGXTLX.field1327;
			} else {
				field518 = -1;
				field519 = -1;
			}
		} else {
			field518 = -1;
			field519 = -1;
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field809 != null) {
				return new URL("http://127.0.0.1:" + (field461 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method32() {
		field213 = true;
	}

	@ObfuscatedName("client.c(II)Z")
	public final boolean method33(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field249[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 954) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method34(boolean arg0) {
		if (field311.field1455 >> 7 == field418 && field311.field1456 >> 7 == field419) {
			field418 = 0;
		}

		int var2 = field345;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			MVRUIIXW var4;
			int var5;
			if (arg0) {
				var4 = field311;
				var5 = field343 << 14;
			} else {
				var4 = field344[field346[var3]];
				var5 = field346[var3] << 14;
			}

			if (var4 != null && var4.method228()) {
				var4.field862 = false;
				if ((field463 && field345 > 50 || field345 > 200) && !arg0 && var4.field1484 == var4.field1464) {
					var4.field862 = true;
				}

				int var6 = var4.field1455 >> 7;
				int var7 = var4.field1456 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field861 == null || field353 < var4.field876 || field353 >= var4.field877) {
						if ((var4.field1455 & 0x7F) == 0x40 && (var4.field1456 & 0x7F) == 0x40) {
							if (field106[var6][var7] == field193) {
								continue;
							}

							field106[var6][var7] = field193;
						}

						var4.field881 = method22(var4.field1455, field319, var4.field1456);
						field529.method553(var4, var4.field1472, var4.field1456, var4.field1457, var4.field881, var5, field319, 60, var4.field1455);
					} else {
						var4.field862 = false;
						var4.field881 = method22(var4.field1455, field319, var4.field1456);
						field529.method554(var4, var4.field868, var4.field1457, var4.field867, var5, var4.field881, 60, var4.field1455, var4.field1456, field319, var4.field869, var4.field870);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method35() {
		int var1 = field185.method181("Choose Option");
		for (int var2 = 0; var2 < field102; var2++) {
			int var3 = field185.method181(field198[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field102 * 15 + 21;
		if (field821 > 4 && field822 > 4 && field821 < 516 && field822 < 338) {
			int var5 = field821 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field822 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field450 = true;
			field204 = 0;
			field205 = var5;
			field206 = var6;
			field207 = var1;
			field208 = field102 * 15 + 22;
		}

		if (field821 > 553 && field822 > 205 && field821 < 743 && field822 < 466) {
			int var7 = field821 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field822 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field450 = true;
			field204 = 1;
			field205 = var7;
			field206 = var8;
			field207 = var1;
			field208 = field102 * 15 + 22;
		}

		if (field821 > 17 && field822 > 357 && field821 < 496 && field822 < 453) {
			int var9 = field821 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field822 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field450 = true;
			field204 = 2;
			field205 = var9;
			field206 = var10;
			field207 = var1;
			field208 = field102 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(LMVRUIIXW;IBII)V")
	public final void method36(MVRUIIXW arg0, int arg1, int arg2, int arg3) {
		if (field311 != arg0 && field102 < 400) {
			String var5;
			if (arg0.field857 == 0) {
				var5 = arg0.field863 + method100(field311.field875, arg0.field875) + " (level-" + arg0.field875 + ")";
			} else {
				var5 = arg0.field863 + " (skill-" + arg0.field857 + ")";
			}

			if (field359 == 1) {
				field198[field102] = "Use " + field363 + " with @whi@" + var5;
				field249[field102] = 189;
				field250[field102] = arg1;
				field247[field102] = arg3;
				field248[field102] = arg2;
				field102++;
			} else if (field334 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field430[var6] != null) {
						field198[field102] = field430[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field430[var6].equalsIgnoreCase("attack")) {
							if (arg0.field875 > field311.field875) {
								var7 = 2000;
							}

							if (field311.field874 != 0 && arg0.field874 != 0) {
								if (field311.field874 == arg0.field874) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field431[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field249[field102] = var7 + 173;
						}

						if (var6 == 1) {
							field249[field102] = var7 + 99;
						}

						if (var6 == 2) {
							field249[field102] = var7 + 117;
						}

						if (var6 == 3) {
							field249[field102] = var7 + 485;
						}

						if (var6 == 4) {
							field249[field102] = var7 + 929;
						}

						field250[field102] = arg1;
						field247[field102] = arg3;
						field248[field102] = arg2;
						field102++;
					}
				}
			} else if ((field336 & 0x8) == 8) {
				field198[field102] = field337 + " @whi@" + var5;
				field249[field102] = 943;
				field250[field102] = arg1;
				field247[field102] = arg3;
				field248[field102] = arg2;
				field102++;
			}

			for (int var8 = 0; var8 < field102; var8++) {
				if (field249[var8] == 14) {
					field198[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method37() {
		try {
			field378 = -1;
			field428.method210();
			field306.method210();
			XGNGXTLX.method517();
			method118();
			field529.method542();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field526[var1].method283();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field488[var2][var3][var4] = 0;
					}
				}
			}

			XAALPTAR var5 = new XAALPTAR(field488, 104, 104, field530);
			int var6 = field514.length;
			field449.method377(157);

			if (!field302) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field117[var7] >> 8) * 64 - field505;
					int var9 = (field117[var7] & 0xFF) * 64 - field506;
					byte[] var10 = field514[var7];
					if (var10 != null) {
						var5.method513(var9, var10, field526, var8, (field470 - 6) * 8, (field469 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field117[var11] >> 8) * 64 - field505;
					int var13 = (field117[var11] & 0xFF) * 64 - field506;
					byte[] var14 = field514[var11];
					if (var14 == null && field470 < 800) {
						var5.method496(var12, var13, 64, 64);
					}
				}

				field449.method377(157);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field356[var15];
					if (var16 != null) {
						int var17 = (field117[var15] >> 8) * 64 - field505;
						int var18 = (field117[var15] & 0xFF) * 64 - field506;
						var5.method505(var17, var18, field526, field529, var16);
					}
				}
			}

			if (field302) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field263[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field117.length; var29++) {
									if (field117[var29] == var28 && field514[var29] != null) {
										var5.method502(var24, (var27 & 0x7) * 8, field526, var20 * 8, var21 * 8, var25, var19, field514[var29], (var26 & 0x7) * 8);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method501(var20 * 8, var21 * 8, var19);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field263[0][var30][var31];
						if (var32 == -1) {
							var5.method496(var30 * 8, var31 * 8, 8, 8);
						}
					}
				}

				field449.method377(157);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field263[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field117.length; var42++) {
									if (field117[var42] == var41 && field356[var42] != null) {
										var5.method497(field356[var42], var34 * 8, (var40 & 0x7) * 8, var33, field526, var38, (var39 & 0x7) * 8, field529, var37, var35 * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field449.method377(157);
			var5.method494(field529, field526);

			if (field309 != null) {
				field309.method351();
				XGNGXTLX.field1332 = field122;
			}

			field449.method377(157);
			int var43 = XAALPTAR.field1303;
			if (var43 > field319) {
				var43 = field319;
			}

			if (var43 < field319 - 1) {
				int var44 = field319 - 1;
			}

			if (field463) {
				field529.method543(XAALPTAR.field1303);
			} else {
				field529.method543(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method82(var45, var46);
				}
			}

			method84();
		} catch (Exception var59) {
		}

		URZZBDTU.field1173.method3();

		if (field809 != null) {
			field449.method377(30);
			field449.method382(1057001181);
		}

		if (field463 && signlink.cache_dat != null) {
			int var48 = field509.method360(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field509.method364(var49);
				if ((var50 & 0x79) == 0) {
					WRJMHIDY.method465(var49);
				}
			}
		}

		System.gc();
		XGNGXTLX.method518(20);
		field509.method359();
		int var51 = (field469 - 6) / 8 - 1;
		int var52 = (field469 + 6) / 8 + 1;
		int var53 = (field470 - 6) / 8 - 1;
		int var54 = (field470 + 6) / 8 + 1;
		if (field130) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field509.method365(var55, 0, var56);
					if (var57 != -1) {
						field509.method373(var57, 3);
					}

					int var58 = field509.method365(var55, 1, var56);
					if (var58 != -1) {
						field509.method373(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method38() {
		field365 = 0;
		int var1 = (field311.field1455 >> 7) + field505;
		int var2 = (field311.field1456 >> 7) + field506;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field365 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field365 = 1;
		}

		if (field365 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field365 = 0;
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method39() {
		short var1 = 256;

		if (field464 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field464 > 768) {
					field445[var2] = method79(field447[var2], field446[var2], 1024 - field464);
				} else if (field464 > 256) {
					field445[var2] = field447[var2];
				} else {
					field445[var2] = method79(field446[var2], field447[var2], 256 - field464);
				}
			}
		} else if (field465 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field465 > 768) {
					field445[var3] = method79(field448[var3], field446[var3], 1024 - field465);
				} else if (field465 > 256) {
					field445[var3] = field448[var3];
				} else {
					field445[var3] = method79(field446[var3], field448[var3], 256 - field465);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field445[var4] = field446[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field171.field960[var5] = field327.field13[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field513[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field354[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field445[var12];
					int var15 = field171.field960[var7];
					field171.field960[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field171.method352(0, 0, field806);

		for (int var16 = 0; var16 < 33920; var16++) {
			field172.field960[var16] = field328.field13[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field513[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field354[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field445[var23];
					int var26 = field172.field960[var18];
					field172.field960[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field172.method352(637, 0, field806);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;B)V")
	public final void method40(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field538 != -1) {
			field158 = arg2;
			field820 = 0;
		}

		if (field379 == -1) {
			field251 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field224[var4] = field224[var4 - 1];
			field225[var4] = field225[var4 - 1];
			field226[var4] = field226[var4 - 1];
		}

		field224[0] = arg1;
		field225[0] = arg0;
		field226[0] = arg2;
	}

	@ObfuscatedName("client.a(ILRSWRPCHR;I)V")
	public final void method41(RSWRPCHR arg0, int arg1) {
		for (int var3 = 0; var3 < field347; var3++) {
			int var4 = field348[var3];
			ITIWVLHR var5 = field243[var4];
			int var6 = arg0.method388();
			if ((var6 & 0x10) != 0) {
				int var7 = arg0.method407();
				int var8 = arg0.method408();
				var5.method597(field353, var7, var8);
				var5.field1469 = field353 + 300;
				var5.field1470 = arg0.method407();
				var5.field1471 = arg0.method408();
			}

			if ((var6 & 0x80) != 0) {
				var5.field1481 = arg0.method416();
				var5.field1482 = arg0.method414();
			}

			if ((var6 & 0x8) != 0) {
				var5.field770 = EKQCVRVG.method199(arg0.method416());
				var5.field1453 = var5.field770.field608;
				var5.field1463 = var5.field770.field624;
				var5.field1477 = var5.field770.field615;
				var5.field1478 = var5.field770.field629;
				var5.field1479 = var5.field770.field600;
				var5.field1480 = var5.field770.field619;
				var5.field1464 = var5.field770.field627;
			}

			if ((var6 & 0x40) != 0) {
				int var9 = arg0.method388();
				int var10 = arg0.method406();
				var5.method597(field353, var9, var10);
				var5.field1469 = field353 + 300;
				var5.field1470 = arg0.method406();
				var5.field1471 = arg0.method388();
			}

			if ((var6 & 0x1) != 0) {
				var5.field1489 = arg0.method414();
				int var11 = arg0.method393();
				var5.field1493 = var11 >> 16;
				var5.field1492 = (var11 & 0xFFFF) + field353;
				var5.field1490 = 0;
				var5.field1491 = 0;

				if (var5.field1492 > field353) {
					var5.field1490 = -1;
				}

				if (var5.field1489 == 0xFFFF) {
					var5.field1489 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field1487 = arg0.method414();
				if (var5.field1487 == 0xFFFF) {
					var5.field1487 = -1;
				}
			}

			if ((var6 & 0x4) != 0) {
				int var12 = arg0.method416();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg0.method406();
				if (var5.field1496 == var12 && var12 != -1) {
					int var14 = LZZHVUJR.field832[var12].field846;
					if (var14 == 1) {
						var5.field1497 = 0;
						var5.field1498 = 0;
						var5.field1499 = var13;
						var5.field1500 = 0;
					}

					if (var14 == 2) {
						var5.field1500 = 0;
					}
				} else if (var12 == -1 || var5.field1496 == -1 || LZZHVUJR.field832[var12].field840 >= LZZHVUJR.field832[var5.field1496].field840) {
					var5.field1496 = var12;
					var5.field1497 = 0;
					var5.field1498 = 0;
					var5.field1499 = var13;
					var5.field1500 = 0;
					var5.field1468 = var5.field1466;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field1467 = arg0.method395();
				var5.field1474 = 100;
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field415.method320(arg3, arg1);
		field416.method320(arg3, arg1 + arg4 - 16);
		PGTLMTYR.method344(arg3, 16, arg4 - 32, arg1 + 16, field539);
		int var6 = (arg4 - 32) * arg4 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg0 / (arg2 - arg4);
		PGTLMTYR.method344(arg3, 16, var6, arg1 + var7 + 16, field209);
		PGTLMTYR.method349(field295, arg1 + var7 + 16, arg3, var6);
		PGTLMTYR.method349(field295, arg1 + var7 + 16, arg3 + 1, var6);
		PGTLMTYR.method347(arg1 + var7 + 16, field295, arg3, 16);
		PGTLMTYR.method347(arg1 + var7 + 17, field295, arg3, 16);
		PGTLMTYR.method349(field305, arg1 + var7 + 16, arg3 + 15, var6);
		PGTLMTYR.method349(field305, arg1 + var7 + 17, arg3 + 14, var6 - 1);
		PGTLMTYR.method347(arg1 + var7 + var6 + 15, field305, arg3, 16);
		PGTLMTYR.method347(arg1 + var7 + var6 + 14, field305, arg3 + 1, 15);
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method43(boolean arg0) {
		for (int var2 = 0; var2 < field244; var2++) {
			ITIWVLHR var3 = field243[field245[var2]];
			int var4 = (field245[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method228() && var3.field770.field613 == arg0 && var3.field770.method197()) {
				int var5 = var3.field1455 >> 7;
				int var6 = var3.field1456 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1453 == 1 && (var3.field1455 & 0x7F) == 0x40 && (var3.field1456 & 0x7F) == 0x40) {
						if (field106[var5][var6] == field193) {
							continue;
						}

						field106[var5][var6] = field193;
					}

					if (!var3.field770.field609) {
						var4 += Integer.MIN_VALUE;
					}

					field529.method553(var3, var3.field1472, var3.field1456, var3.field1457, method22(var3.field1455, field319, var3.field1456), var4, field319, (var3.field1453 - 1) * 64 + 60, var3.field1455);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method44(boolean arg0, byte[] arg1) {
		if (field471) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method45() {
		field386 = 0;
		for (int var1 = -1; var1 < field345 + field244; var1++) {
			ZJNNOVLJ var2;
			if (var1 == -1) {
				var2 = field311;
			} else if (var1 < field345) {
				var2 = field344[field346[var1]];
			} else {
				var2 = field243[field245[var1 - field345]];
			}

			if (var2 != null && var2.method228()) {
				if (var2 instanceof ITIWVLHR) {
					EKQCVRVG var3 = ((ITIWVLHR) var2).field770;
					if (var3.field612 != null) {
						var3 = var3.method194();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field345) {
					EKQCVRVG var6 = ((ITIWVLHR) var2).field770;
					if (var6.field603 >= 0 && var6.field603 < field444.length) {
						method30(var2.field1483 + 15, var2);

						if (field518 > -1) {
							field444[var6.field603].method9(field518 - 12, field519 - 30);
						}
					}

					if (field154 == 1 && field245[var1 - field345] == field314 && field353 % 20 < 10) {
						method30(var2.field1483 + 15, var2);

						if (field518 > -1) {
							field152[0].method9(field518 - 12, field519 - 28);
						}
					}
				} else {
					int var4 = 30;
					MVRUIIXW var5 = (MVRUIIXW) var2;
					if (var5.field872 != -1 || var5.field873 != -1) {
						method30(var2.field1483 + 15, var2);

						if (field518 > -1) {
							if (var5.field872 != -1) {
								field466[var5.field872].method9(field518 - 12, field519 - var4);
								var4 += 25;
							}

							if (var5.field873 != -1) {
								field444[var5.field873].method9(field518 - 12, field519 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field154 == 10 && field346[var1] == field369) {
						method30(var2.field1483 + 15, var2);

						if (field518 > -1) {
							field152[1].method9(field518 - 12, field519 - var4);
						}
					}
				}

				if (var2.field1467 != null && (var1 >= field345 || field339 == 0 || field339 == 3 || field339 == 1 && method126(((MVRUIIXW) var2).field863))) {
					method30(var2.field1483, var2);

					if (field518 > -1 && field386 < field387) {
						field391[field386] = field185.method182(var2.field1467) / 2;
						field390[field386] = field185.field590;
						field388[field386] = field518;
						field389[field386] = field519;
						field392[field386] = var2.field1494;
						field393[field386] = var2.field1458;
						field394[field386] = var2.field1474;
						field395[field386++] = var2.field1467;

						if (field421 == 0 && var2.field1458 >= 1 && var2.field1458 <= 3) {
							field390[field386] += 10;
							field389[field386] += 5;
						}

						if (field421 == 0 && var2.field1458 == 4) {
							field391[field386] = 60;
						}

						if (field421 == 0 && var2.field1458 == 5) {
							field390[field386] += 5;
						}
					}
				}

				if (var2.field1469 > field353) {
					method30(var2.field1483 + 15, var2);

					if (field518 > -1) {
						int var7 = var2.field1470 * 30 / var2.field1471;
						if (var7 > 30) {
							var7 = 30;
						}

						PGTLMTYR.method344(field518 - 15, var7, 5, field519 - 3, 0xFF00);
						PGTLMTYR.method344(field518 + var7 - 15, 30 - var7, 5, field519 - 3, 0xFF0000);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1462[var8] > field353) {
						method30(var2.field1483 / 2, var2);

						if (field518 > -1) {
							if (var8 == 1) {
								field519 -= 20;
							}

							if (var8 == 2) {
								field518 -= 15;
								field519 -= 10;
							}

							if (var8 == 3) {
								field518 += 15;
								field519 -= 10;
							}

							field229[var2.field1461[var8]].method9(field518 - 12, field519 - 12);
							field183.method179(0, field518, field519 + 4, String.valueOf(var2.field1460[var8]));
							field183.method179(0xFFFFFF, field518 - 1, field519 + 3, String.valueOf(var2.field1460[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field386; var9++) {
			int var10 = field388[var9];
			int var11 = field389[var9];
			int var12 = field391[var9];
			int var13 = field390[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field389[var15] - field390[var15] && var11 - var13 < field389[var15] + 2 && var10 - var12 < field391[var15] + field388[var15] && var10 + var12 > field388[var15] - field391[var15] && field389[var15] - field390[var15] < var11) {
						var11 = field389[var15] - field390[var15];
						var14 = true;
					}
				}
			}

			field518 = field388[var9];
			field519 = field389[var9] = var11;
			String var16 = field395[var9];
			if (field421 == 0) {
				int var17 = 0xFFFF00;
				if (field392[var9] < 6) {
					var17 = field358[field392[var9]];
				}

				if (field392[var9] == 6) {
					var17 = field193 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field392[var9] == 7) {
					var17 = field193 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field392[var9] == 8) {
					var17 = field193 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field392[var9] == 9) {
					int var18 = 150 - field394[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field392[var9] == 10) {
					int var19 = 150 - field394[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field392[var9] == 11) {
					int var20 = 150 - field394[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field393[var9] == 0) {
					field185.method179(0, field518, field519 + 1, var16);
					field185.method179(var17, field518, field519, var16);
				}

				if (field393[var9] == 1) {
					field185.method184(var16, field519 + 1, 0, field193, field518);
					field185.method184(var16, field519, var17, field193, field518);
				}

				if (field393[var9] == 2) {
					field185.method185(field193, var16, field518, 0, field519 + 1);
					field185.method185(field193, var16, field518, var17, field519);
				}

				if (field393[var9] == 3) {
					field185.method186(150 - field394[var9], field193, field519 + 1, var16, 0, field518);
					field185.method186(150 - field394[var9], field193, field519, var16, var17, field518);
				}

				if (field393[var9] == 4) {
					int var21 = field185.method182(var16);
					int var22 = (150 - field394[var9]) * (var21 + 100) / 150;
					PGTLMTYR.method341(0, field518 + 50, field518 - 50, 334);
					field185.method183(field518 + 50 - var22, 0, field519 + 1, var16);
					field185.method183(field518 + 50 - var22, var17, field519, var16);
					PGTLMTYR.method340();
				}

				if (field393[var9] == 5) {
					int var23 = 150 - field394[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					PGTLMTYR.method341(field519 - field185.field590 - 1, 512, 0, field519 + 5);
					field185.method179(0, field518, field519 + var24 + 1, var16);
					field185.method179(var17, field518, field519 + var24, var16);
					PGTLMTYR.method340();
				}
			} else {
				field185.method179(0, field518, field519 + 1, var16);
				field185.method179(0xFFFF00, field518, field519, var16);
			}
		}
	}

	@ObfuscatedName("client.a(IILEKQCVRVG;II)V")
	public final void method46(int arg0, EKQCVRVG arg1, int arg2, int arg3) {
		if (field102 < 400) {
			if (arg1.field612 != null) {
				arg1 = arg1.method194();
			}

			if (arg1 != null && arg1.field609) {
				String var5 = arg1.field594;
				if (arg1.field625 != 0) {
					var5 = var5 + method100(field311.field875, arg1.field625) + " (level-" + arg1.field625 + ")";
				}

				if (field359 == 1) {
					field198[field102] = "Use " + field363 + " with @yel@" + var5;
					field249[field102] = 442;
					field250[field102] = arg0;
					field247[field102] = arg2;
					field248[field102] = arg3;
					field102++;
				} else if (field334 != 1) {
					if (arg1.field595 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field595[var6] != null && !arg1.field595[var6].equalsIgnoreCase("attack")) {
								field198[field102] = arg1.field595[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field249[field102] = 674;
								}

								if (var6 == 1) {
									field249[field102] = 823;
								}

								if (var6 == 2) {
									field249[field102] = 732;
								}

								if (var6 == 3) {
									field249[field102] = 248;
								}

								if (var6 == 4) {
									field249[field102] = 229;
								}

								field250[field102] = arg0;
								field247[field102] = arg2;
								field248[field102] = arg3;
								field102++;
							}
						}
					}

					if (arg1.field595 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field595[var7] != null && arg1.field595[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field625 > field311.field875) {
									var8 = 2000;
								}

								field198[field102] = arg1.field595[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field249[field102] = var8 + 674;
								}

								if (var7 == 1) {
									field249[field102] = var8 + 823;
								}

								if (var7 == 2) {
									field249[field102] = var8 + 732;
								}

								if (var7 == 3) {
									field249[field102] = var8 + 248;
								}

								if (var7 == 4) {
									field249[field102] = var8 + 229;
								}

								field250[field102] = arg0;
								field247[field102] = arg2;
								field248[field102] = arg3;
								field102++;
							}
						}
					}

					field198[field102] = "Examine @yel@" + var5;
					field249[field102] = 1987;
					field250[field102] = arg0;
					field247[field102] = arg2;
					field248[field102] = arg3;
					field102++;
				} else if ((field336 & 0x2) == 2) {
					field198[field102] = field337 + " @yel@" + var5;
					field249[field102] = 507;
					field250[field102] = arg0;
					field247[field102] = arg2;
					field248[field102] = arg3;
					field102++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method47() {
		if (field373 == 0 && field820 == 1) {
			int var1 = field821 - 25 - 550;
			int var2 = field822 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field297 + field149 & 0x7FF;
				int var4 = XGNGXTLX.field1330[var3];
				int var5 = XGNGXTLX.field1331[var3];
				var4 = (field413 + 256) * var4 >> 8;
				var5 = (field413 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field311.field1455 + var6 >> 7;
				int var9 = field311.field1456 - var7 >> 7;
				boolean var10 = method77(0, 0, var8, 0, field311.field1475[0], field311.field1476[0], 0, var9, true, 1, 0);
				if (var10) {
					field449.method378(var1);
					field449.method378(var2);
					field449.method379(field297);
					field449.method378(57);
					field449.method378(field149);
					field449.method378(field413);
					field449.method378(89);
					field449.method379(field311.field1455);
					field449.method379(field311.field1456);
					field449.method378(field261);
					field449.method378(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;IILjava/lang/String;B)LFXNTEMPE;")
	public final FXNTEMPE method48(int arg0, String arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field333[0] != null) {
				var6 = field333[0].method593(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field527.reset();
			field527.update(var6);
			int var8 = (int) field527.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new FXNTEMPE(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method146(arg0, "Requesting " + arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method29(arg1 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				RSWRPCHR var16 = new RSWRPCHR(var15);
				var16.field1038 = 3;
				int var17 = var16.method392() + 6;
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
						method146(arg0, "Loading " + arg4 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field333[0] != null) {
						field333[0].method594(var6, var6.length, arg2);
					}
				} catch (Exception var28) {
					field333[0] = null;
				}

				if (var6 != null) {
					field527.reset();
					field527.update(var6);
					int var23 = (int) field527.getValue();
					if (arg3 != var23) {
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
						method146(arg0, "Game updated - please reload page");
						var25 = 10;
					} else {
						method146(arg0, var11 + " - Retrying in " + var25);
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

				field202 = !field202;
			}
		}

		return new FXNTEMPE(var6);
	}

	@ObfuscatedName("client.i(I)V")
	public final void method49() {
		field144 = false;
		while (field537) {
			field144 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field437 = null;
		field438 = null;
		field145 = null;
		field445 = null;
		field446 = null;
		field447 = null;
		field448 = null;
		field434 = null;
		field435 = null;
		field354 = null;
		field355 = null;
		field327 = null;
		field328 = null;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method50(int arg0) {
		int[] var2 = field420.field13;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field488[arg0][var7][var5] & 0x18) == 0) {
					field529.method577(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field488[arg0 + 1][var7][var5] & 0x8) != 0) {
					field529.method577(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field420.method4();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field488[arg0][var11][var10] & 0x18) == 0) {
					method28(var9, arg0, var11, var10, var8);
				}

				if (arg0 < 3 && (field488[arg0 + 1][var11][var10] & 0x8) != 0) {
					method28(var9, arg0 + 1, var11, var10, var8);
				}
			}
		}

		if (field309 != null) {
			field309.method351();
			XGNGXTLX.field1332 = field122;
		}

		field467++;
		if (field467 > 89) {
			field467 = 0;
			field449.method377(204);
		}

		field258 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field529.method571(field319, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = URZZBDTU.method450(var14).field1191;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field526[field319].field797;
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

						field323[field258] = field320[var15];
						field259[field258] = var16;
						field260[field258] = var17;
						field258++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)Z")
	public final boolean method51() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.k(I)V")
	public final void method52() {
		while (true) {
			ACXEOGCN var1 = field509.method368();
			if (var1 == null) {
				return;
			}

			if (var1.field9 == 0) {
				WRJMHIDY.method464(var1.field12, var1.field8);

				if ((field509.method364(var1.field8) & 0x62) != 0) {
					field364 = true;

					if (field379 != -1 || field538 != -1) {
						field251 = true;
					}
				}
			}

			if (var1.field9 == 1 && var1.field12 != null) {
				OZAHMTPS.method335(var1.field12);
			}

			if (var1.field9 == 2 && field163 == var1.field8 && var1.field12 != null) {
				method44(field164, var1.field12);
			}

			if (var1.field9 == 3 && field396 == 1) {
				for (int var2 = 0; var2 < field514.length; var2++) {
					if (field118[var2] == var1.field8) {
						field514[var2] = var1.field12;

						if (var1.field12 == null) {
							field118[var2] = -1;
						}

						break;
					}

					if (field119[var2] == var1.field8) {
						field356[var2] = var1.field12;

						if (var1.field12 == null) {
							field119[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field9 == 93 && field509.method358(var1.field8)) {
				XAALPTAR.method504(new RSWRPCHR(var1.field12), field509);
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method53() {
		try {
			int var1 = field311.field1455 + field535;
			int var2 = field311.field1456 + field375;
			if (field177 - var1 < -500 || field177 - var1 > 500 || field178 - var2 < -500 || field178 - var2 > 500) {
				field177 = var1;
				field178 = var2;
			}

			if (field177 != var1) {
				field177 += (var1 - field177) / 16;
			}

			if (field178 != var2) {
				field178 += (var2 - field178) / 16;
			}

			if (field824[1] == 1) {
				field298 += (-field298 - 24) / 2;
			} else if (field824[2] == 1) {
				field298 += (24 - field298) / 2;
			} else {
				field298 /= 2;
			}

			if (field824[3] == 1) {
				field299 += (12 - field299) / 2;
			} else if (field824[4] == 1) {
				field299 += (-field299 - 12) / 2;
			} else {
				field299 /= 2;
			}

			field297 = field298 / 2 + field297 & 0x7FF;
			field296 += field299 / 2;
			if (field296 < 128) {
				field296 = 128;
			}

			if (field296 > 383) {
				field296 = 383;
			}

			int var3 = field177 >> 7;
			int var4 = field178 >> 7;
			int var5 = method22(field177, field319, field178);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field319;
						if (var9 < 3 && (field488[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field530[var9][var7][var8];
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

			if (var11 > field440) {
				field440 += (var11 - field440) / 24;
			} else if (var11 < field440) {
				field440 += (var11 - field440) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field311.field1455 + "," + field311.field1456 + "," + field177 + "," + field178 + "," + field469 + "," + field470 + "," + field505 + "," + field506);
			throw new RuntimeException("eek");
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method54(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method54(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.m(I)V")
	public static final void method55() {
		YJCKMNKP.field1361 = true;
		XGNGXTLX.field1321 = true;
		field463 = true;
		XAALPTAR.field1309 = true;
		URZZBDTU.field1204 = true;
	}

	@ObfuscatedName("client.a(LIGMZHLWJ;Z)Z")
	public final boolean method56(IGMZHLWJ arg0) {
		int var2 = arg0.field734;
		if (field399 == 2) {
			if (var2 == 201) {
				field251 = true;
				field424 = 0;
				field457 = true;
				field540 = "";
				field201 = 1;
				field217 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field251 = true;
				field424 = 0;
				field457 = true;
				field540 = "";
				field201 = 2;
				field217 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field410 = 250;
			return true;
		}

		if (var2 == 501) {
			field251 = true;
			field424 = 0;
			field457 = true;
			field540 = "";
			field201 = 4;
			field217 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field251 = true;
			field424 = 0;
			field457 = true;
			field540 = "";
			field201 = 5;
			field217 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field246[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = MIIGCDHS.field849 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= MIIGCDHS.field849) {
							var5 = 0;
						}
					}

					if (!MIIGCDHS.field850[var5].field856 && MIIGCDHS.field850[var5].field851 == var3 + (field443 ? 0 : 7)) {
						break;
					}
				}

				field246[var3] = var5;
				field441 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field116[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field131[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field131[var6].length) {
					var8 = 0;
				}
			}

			field116[var6] = var8;
			field441 = true;
		}

		if (var2 == 324 && !field443) {
			field443 = true;
			method158();
		}

		if (var2 == 325 && field443) {
			field443 = false;
			method158();
		}

		if (var2 == 326) {
			field449.method377(95);
			field449.method378(field443 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field449.method378(field246[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field449.method378(field116[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field352 = !field352;
		}

		if (var2 >= 601 && var2 <= 613) {
			method145();

			if (field403.length() > 0) {
				field449.method377(71);
				field449.method384(DCKSLYWK.method168(field403));
				field449.method378(var2 - 601);
				field449.method378(field352 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method57() {
		if (field267 == 0) {
			int var1 = field820;
			if (field334 == 1 && field821 >= 516 && field822 >= 160 && field821 <= 765 && field822 <= 205) {
				var1 = 0;
			}

			if (field450) {
				if (var1 != 1) {
					int var2 = field814;
					int var3 = field815;
					if (field204 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field204 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field204 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field205 - 10 || var2 > field207 + field205 + 10 || var3 < field206 - 10 || var3 > field208 + field206 + 10) {
						field450 = false;

						if (field204 == 1) {
							field364 = true;
						}

						if (field204 == 2) {
							field251 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field205;
					int var5 = field206;
					int var6 = field207;
					int var7 = field821;
					int var8 = field822;
					if (field204 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field204 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field204 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field102; var10++) {
						int var11 = (field102 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method81(var9);
					}

					field450 = false;

					if (field204 == 1) {
						field364 = true;
					}

					if (field204 == 2) {
						field251 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field102 > 0) {
					int var12 = field249[field102 - 1];
					if (var12 == 372 || var12 == 648 || var12 == 627 || var12 == 555 || var12 == 395 || var12 == 653 || var12 == 828 || var12 == 233 || var12 == 804 || var12 == 918 || var12 == 937 || var12 == 1624) {
						int var13 = field247[field102 - 1];
						int var14 = field248[field102 - 1];
						IGMZHLWJ var15 = IGMZHLWJ.method215(var14);
						if (var15.field718 || var15.field694) {
							field433 = false;
							field436 = 0;
							field265 = var14;
							field266 = var13;
							field267 = 2;
							field268 = field821;
							field269 = field822;

							if (IGMZHLWJ.method215(var14).field706 == field383) {
								field267 = 1;
							}

							if (IGMZHLWJ.method215(var14).field706 == field379) {
								field267 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field252 == 1 || method33(field102 - 1)) && field102 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field102 > 0) {
					method81(field102 - 1);
				}

				if (var1 != 2 || field102 <= 0) {
					return;
				}

				method35();
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method58() {
		if (field396 == 2) {
			for (SYVEZPUN var1 = (SYVEZPUN) field291.method206(); var1 != null; var1 = (SYVEZPUN) field291.method208()) {
				if (var1.field1111 > 0) {
					var1.field1111--;
				}

				if (var1.field1111 != 0) {
					if (var1.field1119 > 0) {
						var1.field1119--;
					}

					if (var1.field1119 == 0 && var1.field1114 >= 1 && var1.field1115 >= 1 && var1.field1114 <= 102 && var1.field1115 <= 102 && (var1.field1116 < 0 || XAALPTAR.method492(var1.field1116, var1.field1118))) {
						method103(var1.field1113, var1.field1112, var1.field1117, var1.field1116, var1.field1118, var1.field1114, var1.field1115);
						var1.field1119 = -1;

						if (var1.field1116 == var1.field1108 && var1.field1108 == -1) {
							var1.method20();
						} else if (var1.field1116 == var1.field1108 && var1.field1117 == var1.field1109 && var1.field1118 == var1.field1110) {
							var1.method20();
						}
					}
				} else if (var1.field1108 < 0 || XAALPTAR.method492(var1.field1108, var1.field1110)) {
					method103(var1.field1113, var1.field1112, var1.field1109, var1.field1108, var1.field1110, var1.field1114, var1.field1115);
					var1.method20();
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)Ljava/lang/String;")
	public final String method59() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field809 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String method60(int arg0) {
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

	@ObfuscatedName("client.b(IILRSWRPCHR;)V")
	public final void method61(int arg0, RSWRPCHR arg1) {
		while (arg1.field1039 + 21 < arg0 * 8) {
			int var3 = arg1.method399(14);
			if (var3 == 16383) {
				break;
			}

			if (field243[var3] == null) {
				field243[var3] = new ITIWVLHR();
			}

			ITIWVLHR var4 = field243[var3];
			field245[field244++] = var3;
			var4.field1473 = field353;
			int var5 = arg1.method399(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method399(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method399(1);
			int var8 = arg1.method399(1);
			if (var8 == 1) {
				field348[field347++] = var3;
			}

			var4.field770 = EKQCVRVG.method199(arg1.method399(13));
			var4.field1453 = var4.field770.field608;
			var4.field1463 = var4.field770.field624;
			var4.field1477 = var4.field770.field615;
			var4.field1478 = var4.field770.field629;
			var4.field1479 = var4.field770.field600;
			var4.field1480 = var4.field770.field619;
			var4.field1464 = var4.field770.field627;
			var4.method600(var7 == 1, field311.field1476[0] + var5, field311.field1475[0] + var6);
		}

		arg1.method400();
	}

	@ObfuscatedName("client.q(I)V")
	public final void method62() {
		int var1 = field137 * 128 + 64;
		int var2 = field138 * 128 + 64;
		int var3 = method22(var1, field319, var2) - field139;

		if (field493 < var1) {
			field493 += (var1 - field493) * field141 / 1000 + field140;
			if (field493 > var1) {
				field493 = var1;
			}
		}

		if (field493 > var1) {
			field493 -= (field493 - var1) * field141 / 1000 + field140;
			if (field493 < var1) {
				field493 = var1;
			}
		}

		if (field494 < var3) {
			field494 += (var3 - field494) * field141 / 1000 + field140;
			if (field494 > var3) {
				field494 = var3;
			}
		}

		if (field494 > var3) {
			field494 -= (field494 - var3) * field141 / 1000 + field140;
			if (field494 < var3) {
				field494 = var3;
			}
		}

		if (field495 < var2) {
			field495 += (var2 - field495) * field141 / 1000 + field140;
			if (field495 > var2) {
				field495 = var2;
			}
		}

		if (field495 > var2) {
			field495 -= (field495 - var2) * field141 / 1000 + field140;
			if (field495 < var2) {
				field495 = var2;
			}
		}

		int var4 = field477 * 128 + 64;
		int var5 = field478 * 128 + 64;
		int var6 = method22(var4, field319, var5) - field479;
		int var7 = var4 - field493;
		int var8 = var6 - field494;
		int var9 = var5 - field495;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field496 < var11) {
			field496 += (var11 - field496) * field481 / 1000 + field480;
			if (field496 > var11) {
				field496 = var11;
			}
		}

		if (field496 > var11) {
			field496 -= (field496 - var11) * field481 / 1000 + field480;
			if (field496 < var11) {
				field496 = var11;
			}
		}

		int var13 = var12 - field497;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field497 += field481 * var13 / 1000 + field480;
			field497 &= 0x7FF;
		}

		if (var13 < 0) {
			field497 -= -var13 * field481 / 1000 + field480;
			field497 &= 0x7FF;
		}

		int var14 = var12 - field497;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field497 = var12;
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method63() {
		for (int var1 = 0; var1 < field377; var1++) {
			if (field338[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field157[var1] != field148 || field270[var1] != field322) {
						RSWRPCHR var3 = OOQAHIET.method329(field270[var1], field157[var1]);
						if (System.currentTimeMillis() + var3.field1038 / 22 > field397 / 22 + field368) {
							field397 = var3.field1038;
							field368 = System.currentTimeMillis();

							if (method88(var3.field1038, var3.field1037)) {
								field148 = field157[var1];
								field322 = field270[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method51()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field449.method377(149);
						field449.method379(field157[var1] & 0x7FFF);
					} else {
						field449.method377(149);
						field449.method379(-1);
					}
				}

				if (var2 && field338[var1] != -5) {
					field338[var1] = -5;
				} else {
					field377--;
					for (int var5 = var1; var5 < field377; var5++) {
						field157[var5] = field157[var5 + 1];
						field270[var5] = field270[var5 + 1];
						field338[var5] = field338[var5 + 1];
					}

					var1--;
				}
			} else {
				field338[var1]--;
			}
		}

		if (field146 > 0) {
			field146 -= 20;
			if (field146 < 0) {
				field146 = 0;
			}

			if (field146 == 0 && field471 && !field463) {
				field163 = field340;
				field164 = true;
				field509.method370(2, field163);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method64() {
		field308.method351();

		if (field373 == 2) {
			byte[] var1 = field285.field909;
			int[] var2 = PGTLMTYR.field950;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field142.method13(field297, 0, 0, field264, 256, field195, 33, 25, 33, 25);
			field309.method351();
			XGNGXTLX.field1332 = field122;
		} else {
			int var5 = field297 + field149 & 0x7FF;
			int var6 = field311.field1455 / 32 + 48;
			int var7 = 464 - field311.field1456 / 32;
			field420.method13(var5, 5, 25, field215, field413 + 256, field241, 151, var7, 146, var6);
			field142.method13(field297, 0, 0, field264, 256, field195, 33, 25, 33, 25);

			for (int var8 = 0; var8 < field258; var8++) {
				int var9 = field259[var8] * 4 + 2 - field311.field1455 / 32;
				int var10 = field260[var8] * 4 + 2 - field311.field1456 / 32;
				method149(var9, var10, field323[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					EZXKBAZY var13 = field516[field319][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field311.field1455 / 32;
						int var15 = var12 * 4 + 2 - field311.field1456 / 32;
						method149(var14, var15, field111);
					}
				}
			}

			for (int var16 = 0; var16 < field244; var16++) {
				ITIWVLHR var17 = field243[field245[var16]];
				if (var17 != null && var17.method228()) {
					EKQCVRVG var18 = var17.field770;
					if (var18.field612 != null) {
						var18 = var18.method194();
					}

					if (var18 != null && var18.field623 && var18.field609) {
						int var19 = var17.field1455 / 32 - field311.field1455 / 32;
						int var20 = var17.field1456 / 32 - field311.field1456 / 32;
						method149(var19, var20, field112);
					}
				}
			}

			for (int var21 = 0; var21 < field345; var21++) {
				MVRUIIXW var22 = field344[field346[var21]];
				if (var22 != null && var22.method228()) {
					int var23 = var22.field1455 / 32 - field311.field1455 / 32;
					int var24 = var22.field1456 / 32 - field311.field1456 / 32;
					boolean var25 = false;
					long var26 = DCKSLYWK.method168(var22.field863);
					for (int var28 = 0; var28 < field398; var28++) {
						if (field290[var28] == var26 && field511[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field311.field874 != 0 && var22.field874 != 0 && field311.field874 == var22.field874) {
						var29 = true;
					}

					if (var25) {
						method149(var23, var24, field114);
					} else if (var29) {
						method149(var23, var24, field115);
					} else {
						method149(var23, var24, field113);
					}
				}
			}

			if (field154 != 0 && field353 % 20 < 10) {
				if (field154 == 1 && field314 >= 0 && field314 < field243.length) {
					ITIWVLHR var30 = field243[field314];
					if (var30 != null) {
						int var31 = var30.field1455 / 32 - field311.field1455 / 32;
						int var32 = var30.field1456 / 32 - field311.field1456 / 32;
						method85(var31, field197, var32);
					}
				}

				if (field154 == 2) {
					int var33 = (field230 - field505) * 4 + 2 - field311.field1455 / 32;
					int var34 = (field231 - field506) * 4 + 2 - field311.field1456 / 32;
					method85(var33, field197, var34);
				}

				if (field154 == 10 && field369 >= 0 && field369 < field344.length) {
					MVRUIIXW var35 = field344[field369];
					if (var35 != null) {
						int var36 = var35.field1455 / 32 - field311.field1455 / 32;
						int var37 = var35.field1456 / 32 - field311.field1456 / 32;
						method85(var36, field197, var37);
					}
				}
			}

			if (field418 != 0) {
				int var38 = field418 * 4 + 2 - field311.field1455 / 32;
				int var39 = field419 * 4 + 2 - field311.field1456 / 32;
				method149(var38, var39, field196);
			}

			PGTLMTYR.method344(97, 3, 3, 78, 0xFFFFFF);
			field309.method351();
			XGNGXTLX.field1332 = field122;
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)V")
	public final void method65(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field453 = 0;
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

			field453 = 0;
			label46: for (int var7 = 0; var7 < RXDLPXNX.field1077; var7++) {
				RXDLPXNX var8 = RXDLPXNX.method433(var7);
				if (var8.field1091 == -1 && var8.field1076 != null) {
					String var9 = var8.field1076.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field454[field453] = var9;
					field455[field453] = var7;
					field453++;
					if (field453 >= field454.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method66() {
		if (field820 == 1) {
			if (field821 >= 539 && field821 <= 573 && field822 >= 169 && field822 < 205 && field326[0] != -1) {
				field364 = true;
				field382 = 0;
				field417 = true;
			}

			if (field821 >= 569 && field821 <= 599 && field822 >= 168 && field822 < 205 && field326[1] != -1) {
				field364 = true;
				field382 = 1;
				field417 = true;
			}

			if (field821 >= 597 && field821 <= 627 && field822 >= 168 && field822 < 205 && field326[2] != -1) {
				field364 = true;
				field382 = 2;
				field417 = true;
			}

			if (field821 >= 625 && field821 <= 669 && field822 >= 168 && field822 < 203 && field326[3] != -1) {
				field364 = true;
				field382 = 3;
				field417 = true;
			}

			if (field821 >= 666 && field821 <= 696 && field822 >= 168 && field822 < 205 && field326[4] != -1) {
				field364 = true;
				field382 = 4;
				field417 = true;
			}

			if (field821 >= 694 && field821 <= 724 && field822 >= 168 && field822 < 205 && field326[5] != -1) {
				field364 = true;
				field382 = 5;
				field417 = true;
			}

			if (field821 >= 722 && field821 <= 756 && field822 >= 169 && field822 < 205 && field326[6] != -1) {
				field364 = true;
				field382 = 6;
				field417 = true;
			}

			if (field821 >= 540 && field821 <= 574 && field822 >= 466 && field822 < 502 && field326[7] != -1) {
				field364 = true;
				field382 = 7;
				field417 = true;
			}

			if (field821 >= 572 && field821 <= 602 && field822 >= 466 && field822 < 503 && field326[8] != -1) {
				field364 = true;
				field382 = 8;
				field417 = true;
			}

			if (field821 >= 599 && field821 <= 629 && field822 >= 466 && field822 < 503 && field326[9] != -1) {
				field364 = true;
				field382 = 9;
				field417 = true;
			}

			if (field821 >= 627 && field821 <= 671 && field822 >= 467 && field822 < 502 && field326[10] != -1) {
				field364 = true;
				field382 = 10;
				field417 = true;
			}

			if (field821 >= 669 && field821 <= 699 && field822 >= 466 && field822 < 503 && field326[11] != -1) {
				field364 = true;
				field382 = 11;
				field417 = true;
			}

			if (field821 >= 696 && field821 <= 726 && field822 >= 466 && field822 < 503 && field326[12] != -1) {
				field364 = true;
				field382 = 12;
				field417 = true;
			}

			if (field821 >= 724 && field821 <= 758 && field822 >= 466 && field822 < 502 && field326[13] != -1) {
				field364 = true;
				field382 = 13;
				field417 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method67() {
		try {
			if (field110 != null) {
				field110.method322();
			}
		} catch (Exception var2) {
		}

		field110 = null;
		field240 = false;
		field524 = 0;
		field491 = "";
		field492 = "";
		method118();
		field529.method542();

		for (int var1 = 0; var1 < 4; var1++) {
			field526[var1].method283();
		}

		System.gc();
		method70();
		field340 = -1;
		field163 = -1;
		field146 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method68(String arg0, String arg1) {
		if (field309 != null) {
			field309.method351();
			XGNGXTLX.field1332 = field122;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field184.method179(0, 257, var3, arg1);
			field184.method179(0xFFFFFF, 256, var3 - 1, arg1);
			var3 += 15;
			if (arg0 != null) {
				field184.method179(0, 257, var3, arg0);
				field184.method179(0xFFFFFF, 256, var3 - 1, arg0);
			}

			field309.method352(4, 4, field806);
		} else if (field807 != null) {
			field807.method351();
			XGNGXTLX.field1332 = field123;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			PGTLMTYR.method344(383 - var5 / 2, var5, var6, var4 - var6 / 2 - 5, 0);
			PGTLMTYR.method345(0xFFFFFF, var5, 383 - var5 / 2, var6, var4 - var6 / 2 - 5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field184.method179(0, 383, var4, arg1);
			field184.method179(0xFFFFFF, 382, var4 - 1, arg1);
			var4 += 15;
			if (arg0 != null) {
				field184.method179(0, 383, var4, arg0);
				field184.method179(0xFFFFFF, 382, var4 - 1, arg0);
			}

			field807.method352(0, 0, field806);
		}
	}

	@ObfuscatedName("client.a(ILIGMZHLWJ;)Z")
	public final boolean method69(IGMZHLWJ arg0) {
		int var2 = arg0.field734;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field198[field102] = "Remove @whi@" + arg0.field687;
				field249[field102] = 126;
				field102++;
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

		field198[field102] = "Remove @whi@" + field236[var2];
		field249[field102] = 408;
		field102++;
		field198[field102] = "Message @whi@" + field236[var2];
		field249[field102] = 901;
		field102++;
		return true;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method70() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.c(IIII)Z")
	public final boolean method71(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field529.method572(field319, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			URZZBDTU var8 = URZZBDTU.method450(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1203;
				var10 = var8.field1174;
			} else {
				var9 = var8.field1174;
				var10 = var8.field1203;
			}

			int var11 = var8.field1167;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method77(var11, var9, arg0, 0, field311.field1475[0], field311.field1476[0], 0, arg1, false, 2, var10);
		} else {
			method77(0, 0, arg0, var6 + 1, field311.field1475[0], field311.field1476[0], var7, arg1, false, 2, 0);
		}

		field531 = field821;
		field532 = field822;
		field534 = 2;
		field533 = 0;
		return true;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method72() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field354[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field354[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field355[var10] = (field354[var10 - 1] + field354[var10 + 1] + field354[var10 - 128] + field354[var10 + 128]) / 4;
			}
		}

		field329 += 128;
		if (field329 > field434.length) {
			field329 -= field434.length;
			int var11 = (int) (Math.random() * 12.0D);
			method155(field145[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field355[var14 + 128] - field434[field329 + var14 & field434.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field354[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field513[var16] = field513[var16 + 1];
		}

		field513[var1 - 1] = (int) (Math.sin(field353 / 14.0D) * 16.0D + Math.sin(field353 / 15.0D) * 14.0D + Math.sin(field353 / 16.0D) * 12.0D);

		if (field464 > 0) {
			field464 -= 4;
		}

		if (field465 > 0) {
			field465 -= 4;
		}

		if (field464 == 0 && field465 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field464 = 1024;
			}

			if (var17 == 1) {
				field465 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method73() {
		if (field498 || field301 || field253) {
			method90();
		} else {
			field136++;

			if (field240) {
				method142();
			} else {
				method160(false);
			}

			field412 = 0;
		}
	}

	@ObfuscatedName("client.a(LIGMZHLWJ;B)V")
	public final void method74(IGMZHLWJ arg0) {
		int var2 = arg0.field734;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field399 == 0) {
				arg0.field687 = "Loading friend list";
				arg0.field672 = 0;
			} else if (var2 == 1 && field399 == 1) {
				arg0.field687 = "Connecting to friendserver";
				arg0.field672 = 0;
			} else if (var2 == 2 && field399 != 2) {
				arg0.field687 = "Please wait...";
				arg0.field672 = 0;
			} else {
				int var3 = field398;
				if (field399 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field687 = "";
					arg0.field672 = 0;
				} else {
					arg0.field687 = field236[var2];
					arg0.field672 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field398;
			if (field399 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field687 = "";
				arg0.field672 = 0;
			} else {
				if (field511[var2] == 0) {
					arg0.field687 = "@red@Offline";
				} else if (field511[var2] < 200) {
					if (field511[var2] == field460) {
						arg0.field687 = "@gre@World" + (field511[var2] - 9);
					} else {
						arg0.field687 = "@yel@World" + (field511[var2] - 9);
					}
				} else if (field511[var2] == field460) {
					arg0.field687 = "@gre@Classic" + (field511[var2] - 219);
				} else {
					arg0.field687 = "@yel@Classic" + (field511[var2] - 219);
				}

				arg0.field672 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field398;
			if (field399 != 2) {
				var5 = 0;
			}

			arg0.field674 = var5 * 15 + 20;
			if (arg0.field674 <= arg0.field724) {
				arg0.field674 = arg0.field724 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field399 == 0) {
				arg0.field687 = "Loading ignore list";
				arg0.field672 = 0;
			} else if (var2 == 1 && field399 == 0) {
				arg0.field687 = "Please wait...";
				arg0.field672 = 0;
			} else {
				int var6 = field228;
				if (field399 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field687 = "";
					arg0.field672 = 0;
				} else {
					arg0.field687 = DCKSLYWK.method172(DCKSLYWK.method169(field515[var2]));
					arg0.field672 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field674 = field228 * 15 + 20;
			if (arg0.field674 <= arg0.field724) {
				arg0.field674 = arg0.field724 + 1;
			}
		} else if (var2 == 327) {
			arg0.field702 = 150;
			arg0.field703 = (int) (Math.sin(field353 / 40.0D) * 256.0D) & 0x7FF;

			if (field441) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field246[var7];
					if (var8 >= 0 && !MIIGCDHS.field850[var8].method305()) {
						return;
					}
				}

				field441 = false;
				WRJMHIDY[] var9 = new WRJMHIDY[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field246[var11];
					if (var12 >= 0) {
						var9[var10++] = MIIGCDHS.field850[var12].method306();
					}
				}

				WRJMHIDY var13 = new WRJMHIDY(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field116[var14] != 0) {
						var13.method480(field131[var14][0], field131[var14][field116[var14]]);

						if (var14 == 1) {
							var13.method480(field476[0], field476[field116[var14]]);
						}
					}
				}

				var13.method473();
				var13.method474(LZZHVUJR.field832[field311.field1464].field834[0]);
				var13.method483(64, 850, -30, -50, -30, true);
				arg0.field743 = 5;
				arg0.field744 = 0;
				IGMZHLWJ.method218(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field256 == null) {
				field256 = arg0.field685;
				field257 = arg0.field729;
			}

			if (field443) {
				arg0.field685 = field257;
			} else {
				arg0.field685 = field256;
			}
		} else if (var2 == 325) {
			if (field256 == null) {
				field256 = arg0.field685;
				field257 = arg0.field729;
			}

			if (field443) {
				arg0.field685 = field256;
			} else {
				arg0.field685 = field257;
			}
		} else if (var2 == 600) {
			arg0.field687 = field403;
			if (field353 % 20 < 10) {
				arg0.field687 = arg0.field687 + "|";
			} else {
				arg0.field687 = arg0.field687 + " ";
			}
		} else if (var2 == 620) {
			if (field522 < 1) {
				arg0.field687 = "";
			} else if (field352) {
				arg0.field689 = 0xFF0000;
				arg0.field687 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field689 = 0xFFFFFF;
				arg0.field687 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field458 - field315;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field687 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field192 == 0) {
				arg0.field687 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field192 <= field458) {
				arg0.field687 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method75(field192);
			} else {
				int var17 = field458 + 14 - field192;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field687 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method75(field192) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field237 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field237 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field237 + " unread messages";
			}

			arg0.field687 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field107 > 0 && field107 <= field458 + 10) {
				arg0.field687 = "Last password change:\\n@gre@" + method75(field107);
			} else {
				arg0.field687 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field425 > 2 && !field462) {
				arg0.field687 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field425 > 2) {
				arg0.field687 = "\\n\\nYou have @gre@" + field425 + "@yel@ days of\\nmember credit remaining.";
			} else if (field425 > 0) {
				arg0.field687 = "You have @gre@" + field425 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field687 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field425 > 2 && !field462) {
				arg0.field687 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field425 > 0) {
				arg0.field687 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field687 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field192 > field458) {
				arg0.field687 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field687 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public final String method75(int arg0) {
		if (arg0 > field458 + 10) {
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

	@ObfuscatedName("client.a(IJ)V")
	public final void method76(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field228; var3++) {
				if (field515[var3] == arg0) {
					field228--;
					field364 = true;

					for (int var4 = var3; var4 < field228; var4++) {
						field515[var4] = field515[var4 + 1];
					}

					field449.method377(151);
					field449.method384(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIZII)Z")
	public final boolean method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field321[var14][var15] = 0;
				field512[var14][var15] = 99999999;
			}
		}

		int var16 = arg4;
		int var17 = arg5;
		field321[arg4][arg5] = 99;
		field512[arg4][arg5] = 0;
		byte var18 = 0;
		int var19 = 0;
		field181[var18] = arg4;
		int var35 = var18 + 1;
		field182[var18] = arg5;
		boolean var20 = false;
		int var21 = field181.length;
		int[][] var22 = field526[field319].field797;
		while (var35 != var19) {
			var16 = field181[var19];
			var17 = field182[var19];
			var19 = (var19 + 1) % var21;

			if (arg2 == var16 && arg7 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && field526[field319].method292(arg6, arg2, var16, arg7, arg3 - 1, var17)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && field526[field319].method293(arg2, var16, arg7, arg6, arg3 - 1, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg1 != 0 && arg10 != 0 && field526[field319].method294(arg7, var16, arg1, arg10, var17, arg0, arg2)) {
				var20 = true;
				break;
			}

			int var23 = field512[var16][var17] + 1;
			if (var16 > 0 && field321[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field181[var35] = var16 - 1;
				field182[var35] = var17;
				var35 = (var35 + 1) % var21;
				field321[var16 - 1][var17] = 2;
				field512[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field321[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field181[var35] = var16 + 1;
				field182[var35] = var17;
				var35 = (var35 + 1) % var21;
				field321[var16 + 1][var17] = 8;
				field512[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field321[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field181[var35] = var16;
				field182[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field321[var16][var17 - 1] = 1;
				field512[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field321[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field181[var35] = var16;
				field182[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field321[var16][var17 + 1] = 4;
				field512[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field321[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field181[var35] = var16 - 1;
				field182[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field321[var16 - 1][var17 - 1] = 3;
				field512[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field321[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field181[var35] = var16 + 1;
				field182[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field321[var16 + 1][var17 - 1] = 9;
				field512[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field321[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field181[var35] = var16 - 1;
				field182[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field321[var16 - 1][var17 + 1] = 6;
				field512[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field321[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field181[var35] = var16 + 1;
				field182[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field321[var16 + 1][var17 + 1] = 12;
				field512[var16 + 1][var17 + 1] = var23;
			}
		}

		field261 = 0;
		if (!var20) {
			if (arg8) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg2 - var25; var26 <= arg2 + var25; var26++) {
						for (int var27 = arg7 - var25; var27 <= arg7 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field512[var26][var27] < var24) {
								var24 = field512[var26][var27];
								var16 = var26;
								var17 = var27;
								field261 = 1;
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
		field181[var28] = var16;
		int var36 = var28 + 1;
		field182[var28] = var17;
		int var29;
		int var30 = var29 = field321[var16][var17];
		while (arg4 != var16 || arg5 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field181[var36] = var16;
				field182[var36++] = var17;
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

			var30 = field321[var16][var17];
		}

		if (var36 <= 0) {
			if (arg9 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field181[var36];
		int var33 = field182[var36];

		if (arg9 == 0) {
			field449.method377(165);
			field449.method378(var31 + var31 + 3);
		}

		if (arg9 == 1) {
			field449.method377(46);
			field449.method378(var31 + var31 + 3 + 14);
		}

		if (arg9 == 2) {
			field449.method377(197);
			field449.method378(var31 + var31 + 3);
		}

		field418 = field181[0];
		field419 = field182[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field449.method405(field181[var36] - var32);
			field449.method404(field182[var36] - var33);
		}

		field449.method413(field505 + var32);
		field449.method404(field824[5] == 1 ? 1 : 0);
		field449.method379(field506 + var33);
		return true;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method78() {
		if (!field498 && !field301 && !field253) {
			field353++;

			if (field240) {
				method116();
			} else {
				method147();
			}

			method52();
		}
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int method79(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.v(I)V")
	public static final void method80() {
		YJCKMNKP.field1361 = false;
		XGNGXTLX.field1321 = false;
		field463 = false;
		XAALPTAR.field1309 = false;
		URZZBDTU.field1204 = false;
	}

	@ObfuscatedName("client.f(II)V")
	public final void method81(int arg0) {
		if (arg0 >= 0) {
			int var2 = field247[arg0];
			int var3 = field248[arg0];
			int var4 = field249[arg0];
			int var5 = field250[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field424 != 0 && var4 != 1843) {
				field424 = 0;
				field251 = true;
			}

			if (var4 == 627) {
				field449.method377(27);
				field449.method412(var5);
				field449.method379(var3);
				field449.method413(var2);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 50) {
				field449.method377(187);
				field449.method379(var3);
				IGMZHLWJ var6 = IGMZHLWJ.method215(var3);
				if (var6.field730 != null && var6.field730[0][0] == 5) {
					int var7 = var6.field730[0][1];
					field194[var7] = 1 - field194[var7];
					method121(var7);
					field364 = true;
				}
			}

			if (var4 == 682) {
				IGMZHLWJ var8 = IGMZHLWJ.method215(var3);
				boolean var9 = true;
				if (var8.field734 > 0) {
					var9 = method56(var8);
				}

				if (var9) {
					field449.method377(187);
					field449.method379(var3);
				}
			}

			if (var4 == 233) {
				field304++;
				if (field304 >= 107) {
					field449.method377(51);
					field449.method382(0);
					field304 = 0;
				}

				field449.method377(100);
				field449.method379(var2);
				field449.method379(var5);
				field449.method379(var3);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 356 || var4 == 654) {
				String var10 = field198[arg0];
				int var11 = var10.indexOf("@whi@");
				if (var11 != -1) {
					var10 = var10.substring(var11 + 5).trim();
					String var12 = DCKSLYWK.method172(DCKSLYWK.method169(DCKSLYWK.method168(var10)));
					boolean var13 = false;
					for (int var14 = 0; var14 < field345; var14++) {
						MVRUIIXW var15 = field344[field346[var14]];
						if (var15 != null && var15.field863 != null && var15.field863.equalsIgnoreCase(var12)) {
							method77(0, 1, var15.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var15.field1476[0], false, 2, 1);

							if (var4 == 356) {
								field449.method377(110);
								field449.method412(field346[var14]);
							}

							if (var4 == 654) {
								field449.method377(161);
								field449.method379(field346[var14]);
							}

							var13 = true;
							break;
						}
					}

					if (!var13) {
						method40("", 0, "Unable to find " + var12);
					}
				}
			}

			if (var4 == 823) {
				ITIWVLHR var16 = field243[var5];
				if (var16 != null) {
					method77(0, 1, var16.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var16.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(172);
					field449.method379(var5);
				}
			}

			if (var4 == 40) {
				field449.method377(11);
				field449.method412(var5);
				field449.method379(var2);
				field449.method411(field335);
				field449.method379(var3);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 248) {
				ITIWVLHR var17 = field243[var5];
				if (var17 != null) {
					method77(0, 1, var17.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var17.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(211);
					field449.method411(var5);
				}
			}

			if (var4 == 617) {
				boolean var18 = method77(0, 0, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 0);
				if (!var18) {
					method77(0, 1, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 1);
				}

				field531 = field821;
				field532 = field822;
				field534 = 2;
				field533 = 0;
				field449.method377(215);
				field449.method379(field335);
				field449.method379(field506 + var3);
				field449.method411(field505 + var2);
				field449.method411(var5);
			}

			if (var4 == 14) {
				if (field450) {
					field529.method580(var3 - 4, var2 - 4);
				} else {
					field529.method580(field822 - 4, field821 - 4);
				}
			}

			if (var4 == 1684) {
				RXDLPXNX var20 = RXDLPXNX.method433(var5);
				String var21;
				if (var20.field1056 == null) {
					var21 = "It's a " + var20.field1076 + ".";
				} else {
					var21 = new String(var20.field1056);
				}

				method40("", 0, var21);
			}

			if (var4 == 186 && method71(var2, var3, var5)) {
				field449.method377(10);
				field449.method412(field335);
				field449.method379(var5 >> 14 & 0x7FFF);
				field449.method411(field505 + var2);
				field449.method411(field506 + var3);
			}

			if (var4 == 1987) {
				ITIWVLHR var22 = field243[var5];
				if (var22 != null) {
					EKQCVRVG var23 = var22.field770;
					if (var23.field612 != null) {
						var23 = var23.method194();
					}

					if (var23 != null) {
						String var24;
						if (var23.field596 == null) {
							var24 = "It's a " + var23.field594 + ".";
						} else {
							var24 = new String(var23.field596);
						}

						method40("", 0, var24);
					}
				}
			}

			if (var4 == 555) {
				field449.method377(171);
				field449.method412(var2);
				field449.method412(var5);
				field449.method412(var3);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 648) {
				field449.method377(103);
				field449.method411(var3);
				field449.method413(var5);
				field449.method411(var2);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 442) {
				ITIWVLHR var25 = field243[var5];
				if (var25 != null) {
					method77(0, 1, var25.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var25.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(108);
					field449.method379(field360);
					field449.method411(var5);
					field449.method379(field361);
					field449.method411(field362);
				}
			}

			if (var4 == 674) {
				ITIWVLHR var26 = field243[var5];
				if (var26 != null) {
					method77(0, 1, var26.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var26.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(220);
					field449.method379(var5);
				}
			}

			if (var4 == 443) {
				field449.method377(229);
				field449.method413(field361);
				field449.method411(var3);
				field449.method379(field360);
				field449.method379(var5);
				field449.method412(var2);
				field449.method413(field362);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 134) {
				boolean var27 = method77(0, 0, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 0);
				if (!var27) {
					method77(0, 1, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 1);
				}

				field531 = field821;
				field532 = field822;
				field534 = 2;
				field533 = 0;
				field132 += var5;
				if (field132 >= 60) {
					field449.method377(123);
					field132 = 0;
				}

				field449.method377(126);
				field449.method413(field505 + var2);
				field449.method379(field506 + var3);
				field449.method379(var5);
			}

			if (var4 == 1624) {
				RXDLPXNX var29 = RXDLPXNX.method433(var5);
				IGMZHLWJ var30 = IGMZHLWJ.method215(var3);
				String var31;
				if (var30 != null && var30.field699[var2] >= 100000) {
					var31 = var30.field699[var2] + " x " + var29.field1076;
				} else if (var29.field1056 == null) {
					var31 = "It's a " + var29.field1076 + ".";
				} else {
					var31 = new String(var29.field1056);
				}

				method40("", 0, var31);
			}

			if (var4 == 1891) {
				int var32 = var5 >> 14 & 0x7FFF;
				URZZBDTU var33 = URZZBDTU.method450(var32);
				String var34;
				if (var33.field1181 == null) {
					var34 = "It's a " + var33.field1207 + ".";
				} else {
					var34 = new String(var33.field1181);
				}

				method40("", 0, var34);
			}

			if (var4 == 858) {
				boolean var35 = method77(0, 0, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 0);
				if (!var35) {
					method77(0, 1, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 1);
				}

				field531 = field821;
				field532 = field822;
				field534 = 2;
				field533 = 0;
				field449.method377(122);
				field449.method412(field506 + var3);
				field449.method413(field505 + var2);
				field449.method411(var5);
			}

			if (var4 == 515) {
				method145();
			}

			if (var4 == 372) {
				field449.method377(94);
				field449.method412(var2);
				field449.method411(var3);
				field449.method412(var5);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 117) {
				MVRUIIXW var37 = field344[var5];
				if (var37 != null) {
					method77(0, 1, var37.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var37.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(82);
					field449.method379(var5);
				}
			}

			if (var4 == 852) {
				boolean var38 = method77(0, 0, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 0);
				if (!var38) {
					method77(0, 1, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 1);
				}

				field531 = field821;
				field532 = field822;
				field534 = 2;
				field533 = 0;
				field449.method377(179);
				field449.method413(field505 + var2);
				field449.method379(var5);
				field449.method413(field506 + var3);
			}

			if (var4 == 901) {
				String var40 = field198[arg0];
				int var41 = var40.indexOf("@whi@");
				if (var41 != -1) {
					long var42 = DCKSLYWK.method168(var40.substring(var41 + 5).trim());
					int var44 = -1;
					for (int var45 = 0; var45 < field398; var45++) {
						if (field290[var45] == var42) {
							var44 = var45;
							break;
						}
					}

					if (var44 != -1 && field511[var44] > 0) {
						field251 = true;
						field424 = 0;
						field457 = true;
						field540 = "";
						field201 = 3;
						field109 = field290[var44];
						field217 = "Enter message to send to " + field236[var44];
					}
				}
			}

			if (var4 == 944) {
				field449.method377(187);
				field449.method379(var3);
				IGMZHLWJ var46 = IGMZHLWJ.method215(var3);
				if (var46.field730 != null && var46.field730[0][0] == 5) {
					int var47 = var46.field730[0][1];
					if (field194[var47] != var46.field676[0]) {
						field194[var47] = var46.field676[0];
						method121(var47);
						field364 = true;
					}
				}
			}

			if (var4 == 1580) {
				method71(var2, var3, var5);
				field449.method377(150);
				field449.method412(field506 + var3);
				field449.method412(var5 >> 14 & 0x7FFF);
				field449.method413(field505 + var2);
			}

			if (var4 == 732) {
				ITIWVLHR var48 = field243[var5];
				if (var48 != null) {
					method77(0, 1, var48.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var48.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(55);
					field449.method413(var5);
				}
			}

			if (var4 == 943) {
				MVRUIIXW var49 = field344[var5];
				if (var49 != null) {
					method77(0, 1, var49.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var49.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(28);
					field449.method379(field335);
					field449.method412(var5);
				}
			}

			if (var4 == 99) {
				MVRUIIXW var50 = field344[var5];
				if (var50 != null) {
					method77(0, 1, var50.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var50.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(216);
					field449.method411(var5);
				}
			}

			if (var4 == 653) {
				field449.method377(243);
				field449.method379(var5);
				field449.method379(var3);
				field449.method379(var2);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 229) {
				ITIWVLHR var51 = field243[var5];
				if (var51 != null) {
					method77(0, 1, var51.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var51.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(217);
					field449.method411(var5);
				}
			}

			if (var4 == 809) {
				if ((field505 & 0x3) == 0) {
					field283++;
				}

				if (field283 >= 145) {
					field449.method377(210);
					field449.method381(0x3FCF95);
					field283 = 0;
				}

				method71(var2, var3, var5);
				field449.method377(198);
				field449.method412(var5 >> 14 & 0x7FFF);
				field449.method411(field505 + var2);
				field449.method413(field506 + var3);
			}

			if (var4 == 507) {
				ITIWVLHR var52 = field243[var5];
				if (var52 != null) {
					method77(0, 1, var52.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var52.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(44);
					field449.method413(var5);
					field449.method411(field335);
				}
			}

			if (var4 == 189) {
				MVRUIIXW var53 = field344[var5];
				if (var53 != null) {
					method77(0, 1, var53.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var53.field1476[0], false, 2, 1);
					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(1);
					field449.method411(var5);
					field449.method411(field360);
					field449.method413(field362);
					field449.method379(field361);
				}
			}

			if (var4 == 741 && method71(var2, var3, var5)) {
				field449.method377(213);
				field449.method379(field360);
				field449.method379(field361);
				field449.method413(field362);
				field449.method413(field505 + var2);
				field449.method379(field506 + var3);
				field449.method379(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 804) {
				field449.method377(223);
				field449.method379(var2);
				field449.method379(var5);
				field449.method411(var3);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 828) {
				field449.method377(196);
				field449.method411(var3);
				field449.method412(var2);
				field449.method413(var5);
				field187 = 0;
				field188 = var3;
				field189 = var2;
				field190 = 2;
				if (IGMZHLWJ.method215(var3).field706 == field383) {
					field190 = 1;
				}

				if (IGMZHLWJ.method215(var3).field706 == field379) {
					field190 = 3;
				}
			}

			if (var4 == 35) {
				method71(var2, var3, var5);
				field449.method377(131);
				field449.method411(var5 >> 14 & 0x7FFF);
				field449.method413(field505 + var2);
				field449.method412(field506 + var3);
			}

			if (var4 == 268) {
				IGMZHLWJ var54 = IGMZHLWJ.method215(var3);
				field334 = 1;
				field335 = var3;
				field336 = var54.field697;
				field359 = 0;
				field364 = true;
				String var55 = var54.field738;
				if (var55.indexOf(" ") != -1) {
					var55 = var55.substring(0, var55.indexOf(" "));
				}

				String var56 = var54.field738;
				if (var56.indexOf(" ") != -1) {
					var56 = var56.substring(var56.indexOf(" ") + 1);
				}

				field337 = var55 + " " + var54.field696 + " " + var56;

				if (field336 == 16) {
					field364 = true;
					field382 = 3;
					field417 = true;
				}
			} else {
				if (var4 == 918) {
					field449.method377(39);
					field449.method413(var2);
					field449.method412(var3);
					field449.method412(var5);
					field187 = 0;
					field188 = var3;
					field189 = var2;
					field190 = 2;
					if (IGMZHLWJ.method215(var3).field706 == field383) {
						field190 = 1;
					}

					if (IGMZHLWJ.method215(var3).field706 == field379) {
						field190 = 3;
					}
				}

				if (var4 == 723) {
					method21(field538);
					field538 = -1;
					field251 = true;
				}

				if (var4 == 737 && !field235) {
					field449.method377(72);
					field449.method379(var3);
					field235 = true;
				}

				if (var4 == 954 || var4 == 362 || var4 == 408 || var4 == 126) {
					String var57 = field198[arg0];
					int var58 = var57.indexOf("@whi@");
					if (var58 != -1) {
						long var59 = DCKSLYWK.method168(var57.substring(var58 + 5).trim());
						if (var4 == 954) {
							method101(var59);
						}

						if (var4 == 362) {
							method109(var59);
						}

						if (var4 == 408) {
							method133(var59);
						}

						if (var4 == 126) {
							method76(var59);
						}
					}
				}

				if (var4 == 485) {
					MVRUIIXW var61 = field344[var5];
					if (var61 != null) {
						method77(0, 1, var61.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var61.field1476[0], false, 2, 1);
						field531 = field821;
						field532 = field822;
						field534 = 2;
						field533 = 0;
						field449.method377(110);
						field449.method412(var5);
					}
				}

				if (var4 == 419) {
					boolean var62 = method77(0, 0, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 0);
					if (!var62) {
						method77(0, 1, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 1);
					}

					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field449.method377(205);
					field449.method411(field506 + var3);
					field449.method412(field360);
					field449.method413(field362);
					field449.method412(field361);
					field449.method413(var5);
					field449.method379(field505 + var2);
				}

				if (var4 == 71) {
					method71(var2, var3, var5);
					field449.method377(200);
					field449.method379(field506 + var3);
					field449.method379(field505 + var2);
					field449.method379(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 321) {
					field426++;
					if (field426 >= 64) {
						field449.method377(234);
						field449.method379(42770);
						field426 = 0;
					}

					method71(var2, var3, var5);
					field449.method377(115);
					field449.method411(field506 + var3);
					field449.method412(var5 >> 14 & 0x7FFF);
					field449.method413(field505 + var2);
				}

				if (var4 == 499) {
					boolean var64 = method77(0, 0, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 0);
					if (!var64) {
						method77(0, 1, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 1);
					}

					field531 = field821;
					field532 = field822;
					field534 = 2;
					field533 = 0;
					field162++;
					if (field162 >= 77) {
						field449.method377(203);
						field449.method381(0x4AD7A2);
						field162 = 0;
					}

					field449.method377(252);
					field449.method412(field505 + var2);
					field449.method411(field506 + var3);
					field449.method412(var5);
				}

				if (var4 == 937) {
					field359 = 1;
					field360 = var2;
					field361 = var3;
					field362 = var5;
					field363 = String.valueOf(RXDLPXNX.method433(var5).field1076);
					field334 = 0;
					field364 = true;
				} else {
					if (var4 == 929) {
						MVRUIIXW var66 = field344[var5];
						if (var66 != null) {
							method77(0, 1, var66.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var66.field1476[0], false, 2, 1);
							field531 = field821;
							field532 = field822;
							field534 = 2;
							field533 = 0;
							field449.method377(148);
							field449.method379(var5);
						}
					}

					if (var4 == 173) {
						MVRUIIXW var67 = field344[var5];
						if (var67 != null) {
							method77(0, 1, var67.field1475[0], 0, field311.field1475[0], field311.field1476[0], 0, var67.field1476[0], false, 2, 1);
							field531 = field821;
							field532 = field822;
							field534 = 2;
							field533 = 0;
							field449.method377(161);
							field449.method379(var5);
						}
					}

					if (var4 == 416) {
						boolean var68 = method77(0, 0, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 0);
						if (!var68) {
							method77(0, 1, var2, 0, field311.field1475[0], field311.field1476[0], 0, var3, false, 2, 1);
						}

						field531 = field821;
						field532 = field822;
						field534 = 2;
						field533 = 0;
						field124 += var5;
						if (field124 >= 93) {
							field449.method377(235);
							field449.method379(11880);
							field124 = 0;
						}

						field449.method377(135);
						field449.method379(var5);
						field449.method379(field505 + var2);
						field449.method411(field506 + var3);
					}

					if (var4 == 395) {
						field449.method377(224);
						field449.method411(var3);
						field449.method412(var5);
						field449.method413(var2);
						field187 = 0;
						field188 = var3;
						field189 = var2;
						field190 = 2;
						if (IGMZHLWJ.method215(var3).field706 == field383) {
							field190 = 1;
						}

						if (IGMZHLWJ.method215(var3).field706 == field379) {
							field190 = 3;
						}
					}

					if (var4 == 505) {
						String var70 = field198[arg0];
						int var71 = var70.indexOf("@whi@");
						if (var71 != -1) {
							if (field383 == -1) {
								method145();
								field403 = var70.substring(var71 + 5).trim();
								field352 = false;
								field133 = field383 = IGMZHLWJ.field741;
							} else {
								method40("", 0, "Please close the interface you have open before using 'report abuse'");
							}
						}
					}

					field359 = 0;
					field334 = 0;
					field364 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method82(int arg0, int arg1) {
		EZXKBAZY var3 = field516[field319][arg0][arg1];
		if (var3 == null) {
			field529.method563(field319, arg0, arg1);
		} else {
			int var4 = -99999999;
			JRQYDGTL var5 = null;
			for (JRQYDGTL var6 = (JRQYDGTL) var3.method206(); var6 != null; var6 = (JRQYDGTL) var3.method208()) {
				RXDLPXNX var7 = RXDLPXNX.method433(var6.field788);
				int var8 = var7.field1095;
				if (var7.field1093) {
					var8 = (var6.field789 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method204(var5);
			JRQYDGTL var9 = null;
			JRQYDGTL var10 = null;
			for (JRQYDGTL var11 = (JRQYDGTL) var3.method206(); var11 != null; var11 = (JRQYDGTL) var3.method208()) {
				if (var5.field788 != var11.field788 && var9 == null) {
					var9 = var11;
				}

				if (var5.field788 != var11.field788 && var9.field788 != var11.field788 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field529.method549(arg0, var9, var10, method22(arg0 * 128 + 64, field319, arg1 * 128 + 64), var5, field319, var12, arg1);
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method83() {
		field500 = null;
		field501 = null;
		field502 = null;
		field503 = null;
		field504 = null;
		field167 = null;
		field482 = null;
		field483 = null;
		field484 = null;
		field485 = null;
		field486 = null;
		field344 = null;
		field346 = null;
		field348 = null;
		field349 = null;
		field402 = null;
		field117 = null;
		field514 = null;
		field356 = null;
		field118 = null;
		field119 = null;
		field259 = null;
		field260 = null;
		field323 = null;
		field449 = null;
		field280 = null;
		field300 = null;
		field173 = null;
		field174 = null;
		field175 = null;
		field176 = null;
		field271 = null;
		field272 = null;
		field273 = null;
		field274 = null;
		field321 = null;
		field512 = null;
		field181 = null;
		field182 = null;
		field236 = null;
		field290 = null;
		field511 = null;
		field284 = null;
		field285 = null;
		field286 = null;

		if (field222 != null) {
			field222.field892 = false;
		}

		field222 = null;
		field111 = null;
		field112 = null;
		field113 = null;
		field114 = null;
		field115 = null;
		field103 = null;
		field104 = null;
		field105 = null;
		field247 = null;
		field248 = null;
		field249 = null;
		field250 = null;
		field198 = null;
		field147 = null;
		field106 = null;
		field287 = null;
		field288 = null;
		field289 = null;
		field242 = null;
		field307 = null;
		field308 = null;
		field309 = null;
		field310 = null;
		field332 = null;
		field275 = null;
		field276 = null;
		field277 = null;
		field278 = null;
		field279 = null;
		field530 = null;
		field488 = null;
		field529 = null;
		field526 = null;
		field516 = null;
		field291 = null;
		field171 = null;
		field172 = null;
		field168 = null;
		field169 = null;
		field170 = null;
		field243 = null;
		field245 = null;

		if (field509 != null) {
			field509.method366();
		}

		field509 = null;
		field142 = null;
		field229 = null;
		field466 = null;
		field444 = null;
		field152 = null;
		field151 = null;
		field420 = null;

		try {
			if (field110 != null) {
				field110.method322();
			}
		} catch (Exception var1) {
		}

		field110 = null;
		method70();
		field194 = null;
		field366 = null;
		field320 = null;
		field306 = null;
		field428 = null;
		method49();
		URZZBDTU.method459();
		EKQCVRVG.method201();
		RXDLPXNX.method430();
		IGMZHLWJ.method216();
		ZVWMVAWM.field1502 = null;
		MIIGCDHS.field850 = null;
		UNQQPHKT.field1151 = null;
		LZZHVUJR.field832 = null;
		TGYZPJQJ.field1121 = null;
		TGYZPJQJ.field1133 = null;
		WBROSLMK.field1209 = null;
		field807 = null;
		MVRUIIXW.field865 = null;
		XGNGXTLX.method514();
		YJCKMNKP.method541();
		WRJMHIDY.method462();
		OZAHMTPS.method336();
		System.gc();
	}

	@ObfuscatedName("client.e(B)V")
	public final void method84() {
		for (SYVEZPUN var1 = (SYVEZPUN) field291.method206(); var1 != null; var1 = (SYVEZPUN) field291.method208()) {
			if (var1.field1111 == -1) {
				var1.field1119 = 0;
				method94(var1);
			} else {
				var1.method20();
			}
		}
	}

	@ObfuscatedName("client.a(IBLAIRMECOM;I)V")
	public final void method85(int arg0, AIRMECOM arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field297 + field149 & 0x7FF;
			int var6 = WRJMHIDY.field1292[var5];
			int var7 = WRJMHIDY.field1293[var5];
			var6 = var6 * 256 / (field413 + 256);
			var7 = var7 * 256 / (field413 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field254.method14(20, var10, 15, 256, 20, 83 - var13 - 20, 15, var12 + 94 + 4 - 10);
		} else {
			method149(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method86() {
		int var1 = field205;
		int var2 = field206;
		int var3 = field207;
		int var4 = field208;
		int var5 = 0x5D5447;
		PGTLMTYR.method344(var1, var3, var4, var2, var5);
		PGTLMTYR.method344(var1 + 1, var3 - 2, 16, var2 + 1, 0);
		PGTLMTYR.method345(0, var3 - 2, var1 + 1, var4 - 19, var2 + 18);
		field185.method183(var1 + 3, var5, var2 + 14, "Choose Option");
		int var6 = field814;
		int var7 = field815;
		if (field204 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field204 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field204 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field102; var8++) {
			int var9 = (field102 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field185.method187(var1 + 3, field198[var8], var10, true, var9);
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method87() {
		field193++;
		method34(true);
		method43(true);
		method34(false);
		method43(false);
		method117();
		method97();

		if (!field220) {
			int var1 = field296;
			if (field440 / 256 > var1) {
				var1 = field440 / 256;
			}

			if (field517[4] && field400[4] + 128 > var1) {
				var1 = field400[4] + 128;
			}

			int var2 = field489 + field297 & 0x7FF;
			method110(var1, field178, var1 * 3 + 600, field177, method22(field311.field1455, field319, field311.field1456) - 50, var2);
			field214++;
			if (field214 > 154) {
				field214 = 0;
				field449.method377(146);
				field449.method382(0);
			}
		}

		int var3;
		if (field220) {
			var3 = method24();
		} else {
			var3 = method23();
		}

		int var4 = field493;
		int var5 = field494;
		int var6 = field495;
		int var7 = field496;
		int var8 = field497;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field517[var9]) {
				int var10 = (int) (Math.random() * (field227[var9] * 2 + 1) + Math.sin(field427[var9] / 100.0D * field370[var9]) * field400[var9] - field227[var9]);
				if (var9 == 0) {
					field493 += var10;
				}

				if (var9 == 1) {
					field494 += var10;
				}

				if (var9 == 2) {
					field495 += var10;
				}

				if (var9 == 3) {
					field497 = field497 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field496 += var10;
					if (field496 < 128) {
						field496 = 128;
					}

					if (field496 > 383) {
						field496 = 383;
					}
				}
			}
		}

		int var11 = XGNGXTLX.field1341;
		WRJMHIDY.field1287 = true;
		WRJMHIDY.field1290 = 0;
		WRJMHIDY.field1288 = field814 - 4;
		WRJMHIDY.field1289 = field815 - 4;
		PGTLMTYR.method342();
		field529.method581(field493, field496, field494, field495, field497, var3);
		field529.method556();
		method45();
		method108();
		method162(var11);
		method151();
		field309.method352(4, 4, field806);
		field493 = var4;
		field494 = var5;
		field495 = var6;
		field496 = var7;
		field497 = var8;
	}

	@ObfuscatedName("client.a(ZI[B)Z")
	public final boolean method88(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method89() {
		byte[] var1 = field499.method212("title.dat", null);
		AIRMECOM var2 = new AIRMECOM(var1, this);
		field171.method351();
		var2.method7(0, 0);
		field172.method351();
		var2.method7(0, -637);
		field168.method351();
		var2.method7(0, -128);
		field169.method351();
		var2.method7(-371, -202);
		field170.method351();
		var2.method7(-171, -202);
		field173.method351();
		var2.method7(-265, 0);
		field174.method351();
		var2.method7(-265, -562);
		field175.method351();
		var2.method7(-171, -128);
		field176.method351();
		var2.method7(-171, -562);
		int[] var3 = new int[var2.field14];
		for (int var4 = 0; var4 < var2.field15; var4++) {
			for (int var5 = 0; var5 < var2.field14; var5++) {
				var3[var5] = var2.field13[var2.field14 * var4 + var2.field14 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field14; var6++) {
				var2.field13[var2.field14 * var4 + var6] = var3[var6];
			}
		}

		field171.method351();
		var2.method7(0, 382);
		field172.method351();
		var2.method7(0, -255);
		field168.method351();
		var2.method7(0, 254);
		field169.method351();
		var2.method7(-371, 180);
		field170.method351();
		var2.method7(-171, 180);
		field173.method351();
		var2.method7(-265, 382);
		field174.method351();
		var2.method7(-265, -180);
		field175.method351();
		var2.method7(-171, 254);
		field176.method351();
		var2.method7(-171, -180);
		AIRMECOM var7 = new AIRMECOM(field499, "logo", 0);
		field168.method351();
		var7.method9(382 - var7.field14 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.x(I)V")
	public final void method90() {
		Graphics var1 = method99().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method298(1);

		if (field301) {
			field144 = false;
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

		if (field253) {
			field144 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field498) {
			field144 = false;
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

	@ObfuscatedName("client.y(I)V")
	public final void method91() {
		for (int var1 = -1; var1 < field345; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field343;
			} else {
				var2 = field346[var1];
			}

			MVRUIIXW var3 = field344[var2];
			if (var3 != null && var3.field1474 > 0) {
				var3.field1474--;
				if (var3.field1474 == 0) {
					var3.field1467 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field244; var4++) {
			int var5 = field245[var4];
			ITIWVLHR var6 = field243[var5];
			if (var6 != null && var6.field1474 > 0) {
				var6.field1474--;
				if (var6.field1474 == 0) {
					var6.field1467 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method92() {
		while (true) {
			int var1 = method299();
			if (var1 == -1) {
				return;
			}

			if (field383 != -1 && field383 == field133) {
				if (var1 == 8 && field403.length() > 0) {
					field403 = field403.substring(0, field403.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field403.length() < 12) {
					field403 = field403 + (char) var1;
				}
			} else if (field457) {
				if (var1 >= 32 && var1 <= 122 && field540.length() < 80) {
					field540 = field540 + (char) var1;
					field251 = true;
				}

				if (var1 == 8 && field540.length() > 0) {
					field540 = field540.substring(0, field540.length() - 1);
					field251 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field457 = false;
					field251 = true;

					if (field201 == 1) {
						long var2 = DCKSLYWK.method168(field540);
						method101(var2);
					}

					if (field201 == 2 && field398 > 0) {
						long var4 = DCKSLYWK.method168(field540);
						method133(var4);
					}

					if (field201 == 3 && field540.length() > 0) {
						field449.method377(139);
						field449.method378(0);
						int var6 = field449.field1038;
						field449.method384(field109);
						BOHPYYUF.method18(field449, field540);
						field449.method387(field449.field1038 - var6);
						field540 = BOHPYYUF.method19(field540);
						field540 = IXPHWLUO.method240(field540);
						method40(DCKSLYWK.method172(DCKSLYWK.method169(field109)), 6, field540);

						if (field160 == 2) {
							field160 = 1;
							field520 = true;
							field449.method377(19);
							field449.method378(field339);
							field449.method378(field160);
							field449.method378(field239);
						}
					}

					if (field201 == 4 && field228 < 100) {
						long var7 = DCKSLYWK.method168(field540);
						method109(var7);
					}

					if (field201 == 5 && field228 > 0) {
						long var9 = DCKSLYWK.method168(field540);
						method76(var9);
					}
				}
			} else if (field424 == 1) {
				if (var1 >= 48 && var1 <= 57 && field442.length() < 10) {
					field442 = field442 + (char) var1;
					field251 = true;
				}

				if (var1 == 8 && field442.length() > 0) {
					field442 = field442.substring(0, field442.length() - 1);
					field251 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field442.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field442);
						} catch (Exception var21) {
						}

						field449.method377(5);
						field449.method382(var11);
					}

					field424 = 0;
					field251 = true;
				}
			} else if (field424 == 2) {
				if (var1 >= 32 && var1 <= 122 && field442.length() < 12) {
					field442 = field442 + (char) var1;
					field251 = true;
				}

				if (var1 == 8 && field442.length() > 0) {
					field442 = field442.substring(0, field442.length() - 1);
					field251 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field442.length() > 0) {
						field449.method377(137);
						field449.method384(DCKSLYWK.method168(field442));
					}

					field424 = 0;
					field251 = true;
				}
			} else if (field424 == 3) {
				if (var1 >= 32 && var1 <= 122 && field442.length() < 40) {
					field442 = field442 + (char) var1;
					field251 = true;
				}

				if (var1 == 8 && field442.length() > 0) {
					field442 = field442.substring(0, field442.length() - 1);
					field251 = true;
				}
			} else if (field379 == -1 && field262 == -1) {
				if (var1 >= 32 && var1 <= 122 && field317.length() < 80) {
					field317 = field317 + (char) var1;
					field251 = true;
				}

				if (var1 == 8 && field317.length() > 0) {
					field317 = field317.substring(0, field317.length() - 1);
					field251 = true;
				}

				if ((var1 == 13 || var1 == 10) && field317.length() > 0) {
					if (field522 == 2) {
						if (field317.equals("::clientdrop")) {
							method95();
						}

						if (field317.equals("::lag")) {
							method98();
						}

						if (field317.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field509.method360(2); var12++) {
								field509.method361(var12, (byte) 1, 2);
							}
						}

						if (field317.equals("::fpson")) {
							field487 = true;
						}

						if (field317.equals("::fpsoff")) {
							field487 = false;
						}

						if (field317.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field526[var13].field797[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field317.startsWith("::")) {
						field449.method377(12);
						field449.method378(field317.length() - 1);
						field449.method385(field317.substring(2));
					} else {
						String var16 = field317.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field317 = field317.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field317 = field317.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field317 = field317.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field317 = field317.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field317 = field317.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field317 = field317.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field317 = field317.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field317 = field317.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field317 = field317.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field317 = field317.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field317 = field317.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field317 = field317.substring(6);
						}

						String var18 = field317.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field317 = field317.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field317 = field317.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field317 = field317.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field317 = field317.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field317 = field317.substring(6);
						}

						field449.method377(153);
						field449.method378(0);
						int var20 = field449.field1038;
						field449.method404(var19);
						field449.method405(var17);
						field242.field1038 = 0;
						BOHPYYUF.method18(field242, field317);
						field449.method425(0, field242.field1038, field242.field1037);
						field449.method387(field449.field1038 - var20);
						field317 = BOHPYYUF.method19(field317);
						field317 = IXPHWLUO.method240(field317);
						field311.field1467 = field317;
						field311.field1494 = var17;
						field311.field1458 = var19;
						field311.field1474 = 150;

						if (field522 == 2) {
							method40("@cr2@" + field311.field863, 2, field311.field1467);
						} else if (field522 == 1) {
							method40("@cr1@" + field311.field863, 2, field311.field1467);
						} else {
							method40(field311.field863, 2, field311.field1467);
						}

						if (field339 == 2) {
							field339 = 3;
							field520 = true;
							field449.method377(19);
							field449.method378(field339);
							field449.method378(field160);
							field449.method378(field239);
						}
					}

					field317 = "";
					field251 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method93() {
		field437 = new OJMMOVXV(field499, "titlebox", 0);
		field438 = new OJMMOVXV(field499, "titlebutton", 0);
		field145 = new OJMMOVXV[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field145[var1] = new OJMMOVXV(field499, "runes", var1);
		}

		field327 = new AIRMECOM(128, 265);
		field328 = new AIRMECOM(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field327.field13[var2] = field171.field960[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field328.field13[var3] = field172.field960[var3];
		}

		field446 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field446[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field446[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field446[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field446[var7 + 192] = 0xFFFFFF;
		}

		field447 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field447[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field447[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field447[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field447[var11 + 192] = 0xFFFFFF;
		}

		field448 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field448[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field448[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field448[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field448[var15 + 192] = 0xFFFFFF;
		}

		field445 = new int[256];
		field434 = new int[32768];
		field435 = new int[32768];
		method155(null);
		field354 = new int[32768];
		field355 = new int[32768];
		method146(10, "Connecting to fileserver");

		if (!field144) {
			field451 = true;
			field144 = true;
			method54(this, 2);
		}
	}

	@ObfuscatedName("client.a(LSYVEZPUN;I)V")
	public final void method94(SYVEZPUN arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1113 == 0) {
			var2 = field529.method568(arg0.field1112, arg0.field1114, arg0.field1115);
		}

		if (arg0.field1113 == 1) {
			var2 = field529.method569(arg0.field1114, arg0.field1112, arg0.field1115);
		}

		if (arg0.field1113 == 2) {
			var2 = field529.method570(arg0.field1112, arg0.field1114, arg0.field1115);
		}

		if (arg0.field1113 == 3) {
			var2 = field529.method571(arg0.field1112, arg0.field1114, arg0.field1115);
		}

		if (var2 != 0) {
			int var6 = field529.method572(arg0.field1112, arg0.field1114, arg0.field1115, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1108 = var3;
		arg0.field1110 = var4;
		arg0.field1109 = var5;
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method95() {
		if (field410 > 0) {
			method67();
		} else {
			method68("Please wait - attempting to reestablish", "Connection lost");
			field373 = 0;
			field418 = 0;
			OLIDOILN var1 = field110;
			field240 = false;
			field203 = 0;
			method167(field491, field492, true);

			if (!field240) {
				method67();
			}

			try {
				var1.method322();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(BILRSWRPCHR;)V")
	public final void method96(int arg0, RSWRPCHR arg1) {
		while (arg1.field1039 + 10 < arg0 * 8) {
			int var3 = arg1.method399(11);
			if (var3 == 2047) {
				break;
			}

			if (field344[var3] == null) {
				field344[var3] = new MVRUIIXW();
				if (field349[var3] != null) {
					field344[var3].method311(field349[var3]);
				}
			}

			field346[field345++] = var3;
			MVRUIIXW var4 = field344[var3];
			var4.field1473 = field353;
			int var5 = arg1.method399(1);
			int var6 = arg1.method399(1);
			if (var6 == 1) {
				field348[field347++] = var3;
			}

			int var7 = arg1.method399(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method399(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method600(var5 == 1, field311.field1476[0] + var7, field311.field1475[0] + var8);
		}

		arg1.method400();
	}

	@ObfuscatedName("client.A(I)V")
	public final void method97() {
		for (XTUDEFUJ var1 = (XTUDEFUJ) field428.method206(); var1 != null; var1 = (XTUDEFUJ) field428.method208()) {
			if (field319 != var1.field1356 || var1.field1353) {
				var1.method20();
			} else if (field353 >= var1.field1352) {
				var1.method536(field294);

				if (var1.field1353) {
					var1.method20();
				} else {
					field529.method553(var1, false, var1.field1358, 0, var1.field1359, -1, var1.field1356, 60, var1.field1357);
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public void method98() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field219);

		if (field509 != null) {
			System.out.println("Od-cycle:" + field509.field982);
		}

		System.out.println("loop-cycle:" + field353);
		System.out.println("draw-cycle:" + field136);
		System.out.println("ptype:" + field407);
		System.out.println("psize:" + field406);

		if (field110 != null) {
			field110.method327();
		}

		field803 = true;
	}

	@ObfuscatedName("client.c(Z)Ljava/awt/Component;")
	public final Component method99() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field809 != null) {
			return field809;
		}

		return this;
	}

	@ObfuscatedName("client.b(ZII)Ljava/lang/String;")
	public static final String method100(int arg0, int arg1) {
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

	@ObfuscatedName("client.b(IJ)V")
	public final void method101(long arg0) {
		if (arg0 != 0L) {
			if (field398 >= 100 && field381 != 1) {
				method40("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field398 >= 200) {
				method40("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = DCKSLYWK.method172(DCKSLYWK.method169(arg0));
				for (int var4 = 0; var4 < field398; var4++) {
					if (field290[var4] == arg0) {
						method40("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field228; var5++) {
					if (field515[var5] == arg0) {
						method40("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field311.field863)) {
					field236[field398] = var3;
					field290[field398] = arg0;
					field511[field398] = 0;
					field398++;
					field364 = true;
					field449.method377(145);
					field449.method384(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIILIGMZHLWJ;I)V")
	public final void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, IGMZHLWJ arg6, int arg7) {
		if (field153) {
			field459 = 32;
		} else {
			field459 = 0;
		}

		field153 = false;
		if (arg0 >= arg2 && arg0 < arg2 + 16 && arg7 >= arg1 && arg7 < arg1 + 16) {
			arg6.field736 -= field412 * 4;

			if (arg4 == 1) {
				field364 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field251 = true;
			}
		} else if (arg0 >= arg2 && arg0 < arg2 + 16 && arg7 >= arg1 + arg5 - 16 && arg7 < arg1 + arg5) {
			arg6.field736 += field412 * 4;

			if (arg4 == 1) {
				field364 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field251 = true;
			}
		} else if (arg0 >= arg2 - field459 && arg0 < arg2 + field459 + 16 && arg7 >= arg1 + 16 && arg7 < arg1 + arg5 - 16 && field412 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg1 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg6.field736 = (arg3 - arg5) * var10 / var11;

			if (arg4 == 1) {
				field364 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field251 = true;
			}

			field153 = true;
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(BIIIIIII)V")
	public final void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
			if (field463 && field319 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field529.method568(arg1, arg5, arg6);
			}

			if (arg0 == 1) {
				var8 = field529.method569(arg5, arg1, arg6);
			}

			if (arg0 == 2) {
				var8 = field529.method570(arg1, arg5, arg6);
			}

			if (arg0 == 3) {
				var8 = field529.method571(arg1, arg5, arg6);
			}

			if (var8 != 0) {
				int var12 = field529.method572(arg1, arg5, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field529.method559(arg6, arg5, arg1);
					URZZBDTU var16 = URZZBDTU.method450(var13);
					if (var16.field1163) {
						field526[arg1].method288(var14, var16.field1202, arg6, arg5, var15);
					}
				}

				if (arg0 == 1) {
					field529.method560(arg6, arg5, arg1);
				}

				if (arg0 == 2) {
					field529.method561(arg5, arg6, arg1);
					URZZBDTU var17 = URZZBDTU.method450(var13);
					if (var17.field1203 + arg5 > 103 || var17.field1203 + arg6 > 103 || var17.field1174 + arg5 > 103 || var17.field1174 + arg6 > 103) {
						return;
					}

					if (var17.field1163) {
						field526[arg1].method289(var17.field1202, var17.field1174, var15, arg6, arg5, var17.field1203);
					}
				}

				if (arg0 == 3) {
					field529.method562(arg1, arg6, arg5);
					URZZBDTU var18 = URZZBDTU.method450(var13);
					if (var18.field1163 && var18.field1162) {
						field526[arg1].method291(arg6, arg5);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field488[1][arg5][arg6] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				XAALPTAR.method510(arg5, arg1, var19, field530, arg4, arg2, arg3, arg6, field529, field526[arg1]);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LRSWRPCHR;II)V")
	public final void method104(RSWRPCHR arg0, int arg1) {
		field401 = 0;
		field347 = 0;
		method120(arg0, arg1);
		method61(arg1, arg0);
		method41(arg0, arg1);

		for (int var3 = 0; var3 < field401; var3++) {
			int var4 = field402[var3];
			if (field353 != field243[var4].field1473) {
				field243[var4].field770 = null;
				field243[var4] = null;
			}
		}

		if (arg0.field1038 != arg1) {
			signlink.reporterror(field491 + " size mismatch in getnpcpos - pos:" + arg0.field1038 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field244; var5++) {
			if (field243[field245[var5]] == null) {
				signlink.reporterror(field491 + " null entry in npc list - pos:" + var5 + " size:" + field244);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method105() {
		field310.method351();
		XGNGXTLX.field1332 = field120;
		field286.method320(0, 0);

		if (field457) {
			field185.method179(0, 239, 40, field217);
			field185.method179(128, 239, 60, field540 + "*");
		} else if (field424 == 1) {
			field185.method179(0, 239, 40, "Enter amount:");
			field185.method179(128, 239, 60, field442 + "*");
		} else if (field424 == 2) {
			field185.method179(0, 239, 40, "Enter name:");
			field185.method179(128, 239, 60, field442 + "*");
		} else if (field424 == 3) {
			if (field452 != field442) {
				method65(field442);
				field452 = field442;
			}

			EDIBXOXE var1 = field184;
			PGTLMTYR.method341(0, 463, 0, 77);

			for (int var2 = 0; var2 < field453; var2++) {
				int var3 = var2 * 14 + 18 - field456;
				if (var3 > 0 && var3 < 110) {
					var1.method179(0, 239, var3, field454[var2]);
				}
			}

			PGTLMTYR.method340();

			if (field453 > 5) {
				method42(field456, 0, field453 * 14 + 7, 463, 77);
			}

			if (field442.length() == 0) {
				field185.method179(255, 239, 40, "Enter object name");
			} else if (field453 == 0) {
				field185.method179(0, 239, 40, "No matching objects found, please shorten search");
			}

			var1.method179(0, 239, 90, field442 + "*");
			PGTLMTYR.method347(77, 0, 0, 479);
		} else if (field158 != null) {
			field185.method179(0, 239, 40, field158);
			field185.method179(128, 239, 60, "Click to continue");
		} else if (field379 != -1) {
			method143(0, IGMZHLWJ.method215(field379), 0, 0);
		} else if (field538 == -1) {
			EDIBXOXE var4 = field184;
			int var5 = 0;
			PGTLMTYR.method341(0, 463, 0, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field226[var6] != null) {
					int var7 = field224[var6];
					int var8 = field318 + 70 - var5 * 14;
					String var9 = field225[var6];
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
							var4.method183(4, 0, var8, field226[var6]);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field339 == 0 || field339 == 1 && method126(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field475[0].method320(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field475[1].method320(var11, var8 - 12);
								var11 += 14;
							}

							var4.method183(var11, 0, var8, var9 + ":");
							var11 += var4.method181(var9) + 8;
							var4.method183(var11, 255, var8, field226[var6]);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field429 == 0 && (var7 == 7 || field160 == 0 || field160 == 1 && method126(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method183(var12, 0, var8, "From");
							int var14 = var12 + var4.method181("From ");
							if (var10 == 1) {
								field475[0].method320(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field475[1].method320(var14, var8 - 12);
								var14 += 14;
							}

							var4.method183(var14, 0, var8, var9 + ":");
							var14 += var4.method181(var9) + 8;
							var4.method183(var14, 0x800000, var8, field226[var6]);
						}

						var5++;
					}

					if (var7 == 4 && (field239 == 0 || field239 == 1 && method126(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method183(4, 0x800080, var8, var9 + " " + field226[var6]);
						}

						var5++;
					}

					if (var7 == 5 && field429 == 0 && field160 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method183(4, 0x800000, var8, field226[var6]);
						}

						var5++;
					}

					if (var7 == 6 && field429 == 0 && field160 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method183(4, 0, var8, "To " + var9 + ":");
							var4.method183(var4.method181("To " + var9) + 12, 0x800000, var8, field226[var6]);
						}

						var5++;
					}

					if (var7 == 8 && (field239 == 0 || field239 == 1 && method126(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method183(4, 0x7E3200, var8, var9 + " " + field226[var6]);
						}

						var5++;
					}
				}
			}

			PGTLMTYR.method340();
			field135 = var5 * 14 + 7;
			if (field135 < 78) {
				field135 = 78;
			}

			method42(field135 - field318 - 77, 0, field135, 463, 77);
			String var13;
			if (field311 == null || field311.field863 == null) {
				var13 = DCKSLYWK.method172(field491);
			} else {
				var13 = field311.field863;
			}

			var4.method183(4, 0, 90, var13 + ":");
			var4.method183(var4.method181(var13 + ": ") + 6, 255, 90, field317 + "*");
			PGTLMTYR.method347(77, 0, 0, 479);
		} else {
			method143(0, IGMZHLWJ.method215(field538), 0, 0);
		}

		if (field450 && field204 == 2) {
			method86();
		}

		field310.method352(17, 357, field806);
		field309.method351();
		XGNGXTLX.field1332 = field122;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method106() {
		field537 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field144) {
				field219++;
				method72();
				method72();
				method39();
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

		field537 = false;
	}

	@ObfuscatedName("client.b(LRSWRPCHR;II)V")
	public final void method107(RSWRPCHR arg0, int arg1) {
		int var3 = arg0.method399(8);
		if (var3 < field345) {
			for (int var4 = var3; var4 < field345; var4++) {
				field402[field401++] = field346[var4];
			}
		}

		if (var3 > field345) {
			signlink.reporterror(field491 + " Too many players");
			throw new RuntimeException("eek");
		}

		field345 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field346[var5];
			MVRUIIXW var7 = field344[var6];
			int var8 = arg0.method399(1);
			if (var8 == 0) {
				field346[field345++] = var6;
				var7.field1473 = field353;
			} else {
				int var9 = arg0.method399(2);
				if (var9 == 0) {
					field346[field345++] = var6;
					var7.field1473 = field353;
					field348[field347++] = var6;
				} else if (var9 == 1) {
					field346[field345++] = var6;
					var7.field1473 = field353;
					int var10 = arg0.method399(3);
					var7.method599(false, var10);
					int var11 = arg0.method399(1);
					if (var11 == 1) {
						field348[field347++] = var6;
					}
				} else if (var9 == 2) {
					field346[field345++] = var6;
					var7.field1473 = field353;
					int var12 = arg0.method399(3);
					var7.method599(true, var12);
					int var13 = arg0.method399(3);
					var7.method599(true, var13);
					int var14 = arg0.method399(1);
					if (var14 == 1) {
						field348[field347++] = var6;
					}
				} else if (var9 == 3) {
					field402[field401++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method108() {
		if (field154 == 2) {
			method31(field232 * 2, (field231 - field506 << 7) + field234, (field230 - field505 << 7) + field233);

			if (field518 > -1 && field353 % 20 < 10) {
				field152[0].method9(field518 - 12, field519 - 28);
			}
		}
	}

	public final void init() {
		field460 = Integer.parseInt(getParameter("nodeid"));
		field461 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method55();
		} else {
			method80();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field462 = false;
		} else {
			field462 = true;
		}

		method296(765, 503);
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method109(long arg0) {
		if (arg0 != 0L) {
			if (field228 >= 100) {
				method40("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = DCKSLYWK.method172(DCKSLYWK.method169(arg0));
				for (int var4 = 0; var4 < field228; var4++) {
					if (field515[var4] == arg0) {
						method40("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field398; var5++) {
					if (field290[var5] == arg0) {
						method40("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field515[field228++] = arg0;
				field364 = true;
				field449.method377(112);
				field449.method384(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg5 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = WRJMHIDY.field1292[var7];
			int var13 = WRJMHIDY.field1293[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = WRJMHIDY.field1292[var8];
			int var16 = WRJMHIDY.field1293[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field493 = arg3 - var9;
		field494 = arg4 - var10;
		field495 = arg1 - var11;
		field496 = arg0;
		field497 = arg5;
	}

	@ObfuscatedName("client.D(I)Ljava/net/Socket;")
	public final Socket method111(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public static final String method112(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method113() {
		if (field102 >= 2 || field359 != 0 || field334 != 0) {
			String var1;
			if (field359 == 1 && field102 < 2) {
				var1 = "Use " + field363 + " with...";
			} else if (field334 == 1 && field102 < 2) {
				var1 = field337 + "...";
			} else {
				var1 = field198[field102 - 1];
			}

			if (field102 > 2) {
				var1 = var1 + "@whi@ / " + (field102 - 2) + " more options";
			}

			field185.method188(15, true, 4, 0xFFFFFF, var1, field353 / 1000);
		}
	}

	@ObfuscatedName("client.h(II)V")
	public final void method114(int arg0) {
		IGMZHLWJ var2 = IGMZHLWJ.method215(arg0);
		for (int var3 = 0; var3 < var2.field731.length && var2.field731[var3] != -1; var3++) {
			IGMZHLWJ var4 = IGMZHLWJ.method215(var2.field731[var3]);
			if (var4.field739 == 1) {
				method114(var4.field726);
			}

			var4.field722 = 0;
			var4.field705 = 0;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method115() {
		if (field168 == null) {
			field807 = null;
			field310 = null;
			field308 = null;
			field307 = null;
			field309 = null;
			field287 = null;
			field288 = null;
			field289 = null;
			field171 = new PRSDKOTZ(265, 128, method99());
			PGTLMTYR.method342();
			field172 = new PRSDKOTZ(265, 128, method99());
			PGTLMTYR.method342();
			field168 = new PRSDKOTZ(171, 509, method99());
			PGTLMTYR.method342();
			field169 = new PRSDKOTZ(132, 360, method99());
			PGTLMTYR.method342();
			field170 = new PRSDKOTZ(200, 360, method99());
			PGTLMTYR.method342();
			field173 = new PRSDKOTZ(238, 202, method99());
			PGTLMTYR.method342();
			field174 = new PRSDKOTZ(238, 203, method99());
			PGTLMTYR.method342();
			field175 = new PRSDKOTZ(94, 74, method99());
			PGTLMTYR.method342();
			field176 = new PRSDKOTZ(94, 75, method99());
			PGTLMTYR.method342();

			if (field499 != null) {
				method89();
				method93();
			}

			field213 = true;
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method116() {
		if (field166 > 1) {
			field166--;
		}

		if (field410 > 0) {
			field410--;
		}

		for (int var1 = 0; var1 < 5 && method163(); var1++) {
		}

		if (field240) {
			synchronized (field222.field893) {
				if (!field313) {
					field222.field889 = 0;
				} else if (field820 != 0 || field222.field889 >= 40) {
					field449.method377(238);
					field449.method378(0);
					int var3 = field449.field1038;
					int var4 = 0;
					for (int var5 = 0; var5 < field222.field889 && var3 - field449.field1038 < 240; var5++) {
						var4++;
						int var6 = field222.field890[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field222.field891[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field222.field890[var5] == -1 && field222.field891[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field330 != var7 || field331 != var6) {
							int var9 = var7 - field330;
							field330 = var7;
							int var10 = var6 - field331;
							field331 = var6;

							if (field468 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field449.method379((field468 << 12) + (var9 << 6) + var10);
								field468 = 0;
							} else if (field468 < 8) {
								field449.method381((field468 << 19) + var8 + 0x800000);
								field468 = 0;
							} else {
								field449.method382((field468 << 19) + var8 - 0x40000000);
								field468 = 0;
							}
						} else if (field468 < 2047) {
							field468++;
						}
					}

					field449.method387(field449.field1038 - var3);

					if (var4 >= field222.field889) {
						field222.field889 = 0;
					} else {
						field222.field889 -= var4;
						for (int var11 = 0; var11 < field222.field889; var11++) {
							field222.field891[var11] = field222.field891[var4 + var11];
							field222.field890[var11] = field222.field890[var4 + var11];
						}
					}
				}
			}

			if (field820 != 0) {
				long var12 = (field823 - field108) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field108 = field823;
				int var14 = field822;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field821;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field820 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field449.method377(133);
				field449.method421((var17 << 19) + (var18 << 20) + var16);
			}

			if (field179 > 0) {
				field179--;
			}

			if (field824[1] == 1 || field824[2] == 1 || field824[3] == 1 || field824[4] == 1) {
				field180 = true;
			}

			if (field180 && field179 <= 0) {
				field179 = 20;
				field180 = false;
				field449.method377(144);
				field449.method412(field296);
				field449.method412(field297);
			}

			if (field811 && !field211) {
				field211 = true;
				field449.method377(166);
				field449.method378(1);
			}

			if (!field811 && field211) {
				field211 = false;
				field449.method377(166);
				field449.method378(0);
			}

			method152();
			method58();
			method63();
			field408++;
			if (field408 > 750) {
				method95();
			}

			method130();
			method135();
			method91();
			field294++;

			if (field534 != 0) {
				field533 += 20;
				if (field533 >= 400) {
					field534 = 0;
				}
			}

			if (field190 != 0) {
				field187++;
				if (field187 >= 15) {
					if (field190 == 2) {
						field364 = true;
					}

					if (field190 == 3) {
						field251 = true;
					}

					field190 = 0;
				}
			}

			if (field267 != 0) {
				field436++;

				if (field814 > field268 + 5 || field814 < field268 - 5 || field815 > field269 + 5 || field815 < field269 - 5) {
					field433 = true;
				}

				if (field813 == 0) {
					if (field267 == 2) {
						field364 = true;
					}

					if (field267 == 3) {
						field251 = true;
					}

					field267 = 0;

					if (field433 && field436 >= 5) {
						field405 = -1;
						method127();

						if (field405 == field265 && field404 != field266) {
							IGMZHLWJ var19 = IGMZHLWJ.method215(field265);
							byte var20 = 0;
							if (field155 == 1 && var19.field734 == 206) {
								var20 = 1;
							}

							if (var19.field686[field404] <= 0) {
								var20 = 0;
							}

							if (var19.field694) {
								int var21 = field266;
								int var22 = field404;
								var19.field686[var22] = var19.field686[var21];
								var19.field699[var22] = var19.field699[var21];
								var19.field686[var21] = -1;
								var19.field699[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field266;
								int var24 = field404;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method217(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method217(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method217(field404, field266);
							}

							field449.method377(214);
							field449.method413(field265);
							field449.method413(field266);
							field449.method405(var20);
							field449.method412(field404);
						}
					} else if ((field252 == 1 || method33(field102 - 1)) && field102 > 2) {
						method35();
					} else if (field102 > 0) {
						method81(field102 - 1);
					}

					field187 = 10;
					field820 = 0;
				}
			}

			if (YJCKMNKP.field1395 != -1) {
				int var25 = YJCKMNKP.field1395;
				int var26 = YJCKMNKP.field1396;
				boolean var27 = method77(0, 0, var25, 0, field311.field1475[0], field311.field1476[0], 0, var26, true, 0, 0);
				YJCKMNKP.field1395 = -1;

				if (var27) {
					field531 = field821;
					field532 = field822;
					field534 = 1;
					field533 = 0;
				}
			}

			if (field820 == 1 && field158 != null) {
				field158 = null;
				field251 = true;
				field820 = 0;
			}

			method57();

			if (field262 == -1) {
				method47();
				method66();
				method159();
			}

			if (field813 == 1 || field820 == 1) {
				field412++;
			}

			if (field292 == 0 && field528 == 0 && field134 == 0) {
				if (field126 > 0) {
					field126--;
				}
			} else if (field126 < 100) {
				field126++;
				if (field126 == 100) {
					if (field292 != 0) {
						field251 = true;
					}

					if (field528 != 0) {
						field364 = true;
					}
				}
			}

			if (field396 == 2) {
				method53();
			}

			if (field396 == 2 && field220) {
				method62();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field370[var28]++;
			}

			method92();
			field812++;
			if (field812 > 4500) {
				field410 = 250;
				field812 -= 500;
				field449.method377(88);
			}

			field159++;
			if (field159 > 500) {
				field159 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field535 += field536;
				}

				if ((var29 & 0x2) == 2) {
					field375 += field376;
				}

				if ((var29 & 0x4) == 4) {
					field489 += field490;
				}
			}

			if (field535 < -50) {
				field536 = 2;
			}

			if (field535 > 50) {
				field536 = -2;
			}

			if (field375 < -55) {
				field376 = 2;
			}

			if (field375 > 55) {
				field376 = -2;
			}

			if (field489 < -40) {
				field490 = 1;
			}

			if (field489 > 40) {
				field490 = -1;
			}

			field212++;
			if (field212 > 500) {
				field212 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field149 += field150;
				}

				if ((var30 & 0x2) == 2) {
					field413 += field414;
				}
			}

			if (field149 < -60) {
				field150 = 2;
			}

			if (field149 > 60) {
				field150 = -2;
			}

			if (field413 < -20) {
				field414 = 1;
			}

			if (field413 > 10) {
				field414 = -1;
			}

			field238++;
			if (field238 > 57) {
				field238 = 0;
				field449.method377(143);
			}

			field409++;
			if (field409 > 50) {
				field449.method377(157);
			}

			try {
				if (field110 != null && field449.field1038 > 0) {
					field110.method326(0, field449.field1038, field449.field1037);
					field449.field1038 = 0;
					field409 = 0;
				}
			} catch (IOException var32) {
				method95();
			} catch (Exception var33) {
				method67();
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method117() {
		for (DGIXCFDO var1 = (DGIXCFDO) field306.method206(); var1 != null; var1 = (DGIXCFDO) field306.method208()) {
			if (field319 != var1.field563 || field353 > var1.field552) {
				var1.method20();
			} else if (field353 >= var1.field551) {
				if (var1.field562 > 0) {
					ITIWVLHR var2 = field243[var1.field562 - 1];
					if (var2 != null && var2.field1455 >= 0 && var2.field1455 < 13312 && var2.field1456 >= 0 && var2.field1456 < 13312) {
						var1.method176(var2.field1456, var2.field1455, method22(var2.field1455, var1.field563, var2.field1456) - var1.field547, field353);
					}
				}

				if (var1.field562 < 0) {
					int var3 = -var1.field562 - 1;
					MVRUIIXW var4;
					if (field350 == var3) {
						var4 = field311;
					} else {
						var4 = field344[var3];
					}

					if (var4 != null && var4.field1455 >= 0 && var4.field1455 < 13312 && var4.field1456 >= 0 && var4.field1456 < 13312) {
						var1.method176(var4.field1456, var4.field1455, method22(var4.field1455, var1.field563, var4.field1456) - var1.field547, field353);
					}
				}

				var1.method175(field294);
				field529.method553(var1, false, (int) var1.field549, var1.field565, (int) var1.field550, -1, field319, 60, (int) var1.field548);
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method118() {
		URZZBDTU.field1173.method3();
		URZZBDTU.field1161.method3();
		EKQCVRVG.field622.method3();
		RXDLPXNX.field1087.method3();
		RXDLPXNX.field1065.method3();
		MVRUIIXW.field865.method3();
		TGYZPJQJ.field1133.method3();
	}

	@ObfuscatedName("client.h(B)V")
	public final void method119() {
		if (field429 != 0) {
			EDIBXOXE var1 = field184;
			int var2 = 0;
			if (field166 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field226[var3] != null) {
					int var4 = field224[var3];
					String var5 = field225[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field160 == 0 || field160 == 1 && method126(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method183(var8, 0, var7, "From");
						var1.method183(var8, 0xFFFF, var7 - 1, "From");
						int var11 = var8 + var1.method181("From ");
						if (var6 == 1) {
							field475[0].method320(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field475[1].method320(var11, var7 - 12);
							var11 += 14;
						}

						var1.method183(var11, 0, var7, var5 + ": " + field226[var3]);
						var1.method183(var11, 0xFFFF, var7 - 1, var5 + ": " + field226[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field160 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method183(4, 0, var9, field226[var3]);
						var1.method183(4, 0xFFFF, var9 - 1, field226[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field160 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method183(4, 0, var10, "To " + var5 + ": " + field226[var3]);
						var1.method183(4, 0xFFFF, var10 - 1, "To " + var5 + ": " + field226[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLRSWRPCHR;I)V")
	public final void method120(RSWRPCHR arg0, int arg1) {
		arg0.method398();
		int var3 = arg0.method399(8);
		if (var3 < field244) {
			for (int var4 = var3; var4 < field244; var4++) {
				field402[field401++] = field245[var4];
			}
		}

		if (var3 > field244) {
			signlink.reporterror(field491 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field244 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field245[var5];
			ITIWVLHR var7 = field243[var6];
			int var8 = arg0.method399(1);
			if (var8 == 0) {
				field245[field244++] = var6;
				var7.field1473 = field353;
			} else {
				int var9 = arg0.method399(2);
				if (var9 == 0) {
					field245[field244++] = var6;
					var7.field1473 = field353;
					field348[field347++] = var6;
				} else if (var9 == 1) {
					field245[field244++] = var6;
					var7.field1473 = field353;
					int var10 = arg0.method399(3);
					var7.method599(false, var10);
					int var11 = arg0.method399(1);
					if (var11 == 1) {
						field348[field347++] = var6;
					}
				} else if (var9 == 2) {
					field245[field244++] = var6;
					var7.field1473 = field353;
					int var12 = arg0.method399(3);
					var7.method599(true, var12);
					int var13 = arg0.method399(3);
					var7.method599(true, var13);
					int var14 = arg0.method399(1);
					if (var14 == 1) {
						field348[field347++] = var6;
					}
				} else if (var9 == 3) {
					field402[field401++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method121(int arg0) {
		int var2 = WBROSLMK.field1209[arg0].field1217;
		if (var2 != 0) {
			int var3 = field194[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					XGNGXTLX.method523(0.9D);
				}

				if (var3 == 2) {
					XGNGXTLX.method523(0.8D);
				}

				if (var3 == 3) {
					XGNGXTLX.method523(0.7D);
				}

				if (var3 == 4) {
					XGNGXTLX.method523(0.6D);
				}

				RXDLPXNX.field1065.method3();
				field213 = true;
			}

			if (var2 == 3) {
				boolean var4 = field471;

				if (var3 == 0) {
					method129(0, field471);
					field471 = true;
				}

				if (var3 == 1) {
					method129(-400, field471);
					field471 = true;
				}

				if (var3 == 2) {
					method129(-800, field471);
					field471 = true;
				}

				if (var3 == 3) {
					method129(-1200, field471);
					field471 = true;
				}

				if (var3 == 4) {
					field471 = false;
				}

				if (field471 != var4 && !field463) {
					if (field471) {
						field163 = field340;
						field164 = true;
						field509.method370(2, field163);
					} else {
						method70();
					}

					field146 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field200 = true;
					method144(0);
				}

				if (var3 == 1) {
					field200 = true;
					method144(-400);
				}

				if (var3 == 2) {
					field200 = true;
					method144(-800);
				}

				if (var3 == 3) {
					field200 = true;
					method144(-1200);
				}

				if (var3 == 4) {
					field200 = false;
				}
			}

			if (var2 == 5) {
				field252 = var3;
			}

			if (var2 == 6) {
				field421 = var3;
			}

			if (var2 == 8) {
				field429 = var3;
				field251 = true;
			}

			if (var2 == 9) {
				field155 = var3;
			}
		}
	}

	@ObfuscatedName("client.c(IILRSWRPCHR;)V")
	public final void method122(int arg0, RSWRPCHR arg1) {
		if (arg0 == 65) {
			int var3 = arg1.method388();
			int var4 = (var3 >> 4 & 0x7) + field384;
			int var5 = (var3 & 0x7) + field385;
			int var6 = arg1.method390();
			int var7 = arg1.method388();
			int var8 = var7 >> 4 & 0xF;
			int var9 = var7 & 0x7;
			if (field311.field1475[0] >= var4 - var8 && field311.field1475[0] <= var4 + var8 && field311.field1476[0] >= var5 - var8 && field311.field1476[0] <= var5 + var8 && field200 && !field463 && field377 < 50) {
				field157[field377] = var6;
				field270[field377] = var9;
				field338[field377] = OOQAHIET.field935[var6];
				field377++;
			}
		}

		if (arg0 == 169) {
			int var10 = arg1.method407();
			int var11 = (var10 >> 4 & 0x7) + field384;
			int var12 = (var10 & 0x7) + field385;
			int var13 = arg1.method388();
			int var14 = var13 >> 2;
			int var15 = var13 & 0x3;
			int var16 = field156[var14];
			int var17 = arg1.method415();
			if (var11 >= 0 && var12 >= 0 && var11 < 103 && var12 < 103) {
				int var18 = field530[field319][var11][var12];
				int var19 = field530[field319][var11 + 1][var12];
				int var20 = field530[field319][var11 + 1][var12 + 1];
				int var21 = field530[field319][var11][var12 + 1];
				if (var16 == 0) {
					ZARVIRER var22 = field529.method564(var11, var12, field319);
					if (var22 != null) {
						int var23 = var22.field1444 >> 14 & 0x7FFF;
						if (var14 == 2) {
							var22.field1442 = new QMMKOHGT(var20, var23, var15 + 4, 2, var21, var19, var17, var18, false);
							var22.field1443 = new QMMKOHGT(var20, var23, var15 + 1 & 0x3, 2, var21, var19, var17, var18, false);
						} else {
							var22.field1442 = new QMMKOHGT(var20, var23, var15, var14, var21, var19, var17, var18, false);
						}
					}
				}

				if (var16 == 1) {
					SKOMTDVV var24 = field529.method565(var12, field319, var11);
					if (var24 != null) {
						var24.field1103 = new QMMKOHGT(var20, var24.field1104 >> 14 & 0x7FFF, 0, 4, var21, var19, var17, var18, false);
					}
				}

				if (var16 == 2) {
					OFCUPUZO var25 = field529.method566(var11, field319, var12);

					if (var14 == 11) {
						var14 = 10;
					}

					if (var25 != null) {
						var25.field899 = new QMMKOHGT(var20, var25.field907 >> 14 & 0x7FFF, var15, var14, var21, var19, var17, var18, false);
					}
				}

				if (var16 == 3) {
					UKQBAEGG var26 = field529.method567(var12, var11, field319);
					if (var26 != null) {
						var26.field1148 = new QMMKOHGT(var20, var26.field1149 >> 14 & 0x7FFF, var15, 22, var21, var19, var17, var18, false);
					}
				}
			}
		} else if (arg0 == 245) {
			int var27 = arg1.method390();
			int var28 = arg1.method408();
			int var29 = (var28 >> 4 & 0x7) + field384;
			int var30 = (var28 & 0x7) + field385;
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				EZXKBAZY var31 = field516[field319][var29][var30];
				if (var31 != null) {
					for (JRQYDGTL var32 = (JRQYDGTL) var31.method206(); var32 != null; var32 = (JRQYDGTL) var31.method208()) {
						if ((var27 & 0x7FFF) == var32.field788) {
							var32.method20();
							break;
						}
					}

					if (var31.method206() == null) {
						field516[field319][var29][var30] = null;
					}

					method82(var29, var30);
				}
			}
		} else if (arg0 == 165) {
			int var33 = arg1.method408();
			int var34 = var33 >> 2;
			int var35 = var33 & 0x3;
			int var36 = field156[var34];
			int var37 = arg1.method408();
			int var38 = (var37 >> 4 & 0x7) + field384;
			int var39 = (var37 & 0x7) + field385;
			if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
				method150(var36, -1, var39, field319, var35, var34, var38, -1, 0);
			}
		} else {
			if (arg0 == 238) {
				int var40 = arg1.method407();
				int var41 = (var40 >> 4 & 0x7) + field384;
				int var42 = (var40 & 0x7) + field385;
				int var43 = arg1.method414();
				byte var44 = arg1.method409();
				byte var45 = arg1.method410();
				int var46 = arg1.method415();
				int var47 = arg1.method415();
				int var48 = arg1.method406();
				int var49 = var48 >> 2;
				int var50 = var48 & 0x3;
				int var51 = field156[var49];
				byte var52 = arg1.method409();
				int var53 = arg1.method416();
				byte var54 = arg1.method389();
				MVRUIIXW var55;
				if (field350 == var43) {
					var55 = field311;
				} else {
					var55 = field344[var43];
				}

				if (var55 != null) {
					URZZBDTU var56 = URZZBDTU.method450(var53);
					int var57 = field530[field319][var41][var42];
					int var58 = field530[field319][var41 + 1][var42];
					int var59 = field530[field319][var41 + 1][var42 + 1];
					int var60 = field530[field319][var41][var42 + 1];
					WRJMHIDY var61 = var56.method457(var49, var50, var57, var58, var59, var60, -1);
					if (var61 != null) {
						method150(var51, -1, var42, field319, 0, 0, var41, var46 + 1, var47 + 1);
						var55.field876 = field353 + var47;
						var55.field877 = field353 + var46;
						var55.field861 = var61;
						int var62 = var56.field1203;
						int var63 = var56.field1174;
						if (var50 == 1 || var50 == 3) {
							var62 = var56.field1174;
							var63 = var56.field1203;
						}

						var55.field858 = var41 * 128 + var62 * 64;
						var55.field860 = var42 * 128 + var63 * 64;
						var55.field859 = method22(var55.field858, field319, var55.field860);

						if (var54 > var44) {
							byte var64 = var54;
							var54 = var44;
							var44 = var64;
						}

						if (var52 > var45) {
							byte var65 = var52;
							var52 = var45;
							var45 = var65;
						}

						var55.field867 = var41 + var54;
						var55.field869 = var41 + var44;
						var55.field868 = var42 + var52;
						var55.field870 = var42 + var45;
					}
				}
			}

			if (arg0 == 179) {
				int var66 = arg1.method406();
				int var67 = (var66 >> 4 & 0x7) + field384;
				int var68 = (var66 & 0x7) + field385;
				int var69 = arg1.method415();
				int var70 = arg1.method416();
				if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
					JRQYDGTL var71 = new JRQYDGTL();
					var71.field788 = var70;
					var71.field789 = var69;

					if (field516[field319][var67][var68] == null) {
						field516[field319][var67][var68] = new EZXKBAZY();
					}

					field516[field319][var67][var68].method203(var71);
					method82(var67, var68);
				}
			} else if (arg0 == 215) {
				int var72 = arg1.method416();
				int var73 = arg1.method407();
				int var74 = var73 >> 2;
				int var75 = var73 & 0x3;
				int var76 = field156[var74];
				int var77 = arg1.method408();
				int var78 = (var77 >> 4 & 0x7) + field384;
				int var79 = (var77 & 0x7) + field385;
				if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
					method150(var76, var72, var79, field319, var75, var74, var78, -1, 0);
				}
			} else if (arg0 == 237) {
				int var80 = arg1.method388();
				int var81 = (var80 >> 4 & 0x7) + field384;
				int var82 = (var80 & 0x7) + field385;
				int var83 = var81 + arg1.method389();
				int var84 = var82 + arg1.method389();
				int var85 = arg1.method391();
				int var86 = arg1.method390();
				int var87 = arg1.method388() * 4;
				int var88 = arg1.method388() * 4;
				int var89 = arg1.method390();
				int var90 = arg1.method390();
				int var91 = arg1.method388();
				int var92 = arg1.method388();
				if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var86 != 0xFFFF) {
					var81 = var81 * 128 + 64;
					var82 = var82 * 128 + 64;
					var83 = var83 * 128 + 64;
					var84 = var84 * 128 + 64;
					DGIXCFDO var93 = new DGIXCFDO(field353 + var90, var92, field353 + var89, var81, var82, var85, var88, field319, method22(var81, field319, var82) - var87, var91, var86);
					var93.method176(var84, var83, method22(var83, field319, var84) - var88, field353 + var89);
					field306.method203(var93);
				}
			} else if (arg0 == 48) {
				int var94 = arg1.method388();
				int var95 = (var94 >> 4 & 0x7) + field384;
				int var96 = (var94 & 0x7) + field385;
				int var97 = arg1.method390();
				int var98 = arg1.method388();
				int var99 = arg1.method390();
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					var95 = var95 * 128 + 64;
					var96 = var96 * 128 + 64;
					XTUDEFUJ var100 = new XTUDEFUJ(var97, var96, var99, var95, method22(var95, field319, var96) - var98, field319, field353);
					field428.method203(var100);
				}
			} else if (arg0 == 155) {
				int var101 = arg1.method408();
				int var102 = (var101 >> 4 & 0x7) + field384;
				int var103 = (var101 & 0x7) + field385;
				int var104 = arg1.method415();
				int var105 = arg1.method415();
				int var106 = arg1.method414();
				if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104 && field350 != var104) {
					JRQYDGTL var107 = new JRQYDGTL();
					var107.field788 = var105;
					var107.field789 = var106;

					if (field516[field319][var102][var103] == null) {
						field516[field319][var102][var103] = new EZXKBAZY();
					}

					field516[field319][var102][var103].method203(var107);
					method82(var102, var103);
				}
			} else if (arg0 == 189) {
				int var108 = arg1.method388();
				int var109 = (var108 >> 4 & 0x7) + field384;
				int var110 = (var108 & 0x7) + field385;
				int var111 = arg1.method390();
				int var112 = arg1.method390();
				int var113 = arg1.method390();
				if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
					EZXKBAZY var114 = field516[field319][var109][var110];
					if (var114 != null) {
						for (JRQYDGTL var115 = (JRQYDGTL) var114.method206(); var115 != null; var115 = (JRQYDGTL) var114.method208()) {
							if ((var111 & 0x7FFF) == var115.field788 && var115.field789 == var112) {
								var115.field789 = var113;
								break;
							}
						}

						method82(var109, var110);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(II)Ljava/lang/String;")
	public final String method123(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(ILRSWRPCHR;IZLMVRUIIXW;)V")
	public final void method124(int arg0, RSWRPCHR arg1, int arg2, MVRUIIXW arg3) {
		if ((arg2 & 0x80) != 0) {
			arg3.field1481 = arg1.method390();
			arg3.field1482 = arg1.method414();
		}

		if ((arg2 & 0x4) != 0) {
			arg3.field1467 = arg1.method395();
			if (arg3.field1467.charAt(0) == '~') {
				arg3.field1467 = arg3.field1467.substring(1);
				method40(arg3.field863, 2, arg3.field1467);
			} else if (field311 == arg3) {
				method40(arg3.field863, 2, arg3.field1467);
			}

			arg3.field1494 = 0;
			arg3.field1458 = 0;
			arg3.field1474 = 150;
		}

		if ((arg2 & 0x1) != 0) {
			arg3.field1487 = arg1.method390();
			if (arg3.field1487 == 0xFFFF) {
				arg3.field1487 = -1;
			}
		}

		if ((arg2 & 0x8) != 0) {
			int var5 = arg1.method388();
			int var6 = arg1.method388();
			arg3.method597(field353, var5, var6);
			arg3.field1469 = field353 + 300;
			arg3.field1470 = arg1.method406();
			arg3.field1471 = arg1.method408();
		}

		if ((arg2 & 0x400) != 0) {
			arg3.field1446 = arg1.method406();
			arg3.field1448 = arg1.method408();
			arg3.field1447 = arg1.method406();
			arg3.field1449 = arg1.method388();
			arg3.field1450 = arg1.method416() + field353;
			arg3.field1451 = arg1.method415() + field353;
			arg3.field1452 = arg1.method406();
			arg3.method598();
		}

		if ((arg2 & 0x20) != 0) {
			int var7 = arg1.method406();
			byte[] var8 = new byte[var7];
			RSWRPCHR var9 = new RSWRPCHR(var8);
			arg1.method397(var8, var7, 0);
			field349[arg0] = var9;
			arg3.method311(var9);
		}

		if ((arg2 & 0x100) != 0) {
			arg3.field1489 = arg1.method414();
			int var10 = arg1.method424();
			arg3.field1493 = var10 >> 16;
			arg3.field1492 = (var10 & 0xFFFF) + field353;
			arg3.field1490 = 0;
			arg3.field1491 = 0;

			if (arg3.field1492 > field353) {
				arg3.field1490 = -1;
			}

			if (arg3.field1489 == 0xFFFF) {
				arg3.field1489 = -1;
			}
		}

		if ((arg2 & 0x200) != 0) {
			int var11 = arg1.method408();
			int var12 = arg1.method408();
			arg3.method597(field353, var11, var12);
			arg3.field1469 = field353 + 300;
			arg3.field1470 = arg1.method408();
			arg3.field1471 = arg1.method408();
		}

		if ((arg2 & 0x2) != 0) {
			int var13 = arg1.method390();
			if (var13 == 0xFFFF) {
				var13 = -1;
			}

			int var14 = arg1.method408();
			if (arg3.field1496 == var13 && var13 != -1) {
				int var15 = LZZHVUJR.field832[var13].field846;
				if (var15 == 1) {
					arg3.field1497 = 0;
					arg3.field1498 = 0;
					arg3.field1499 = var14;
					arg3.field1500 = 0;
				}

				if (var15 == 2) {
					arg3.field1500 = 0;
				}
			} else if (var13 == -1 || arg3.field1496 == -1 || LZZHVUJR.field832[var13].field840 >= LZZHVUJR.field832[arg3.field1496].field840) {
				arg3.field1496 = var13;
				arg3.field1497 = 0;
				arg3.field1498 = 0;
				arg3.field1499 = var14;
				arg3.field1500 = 0;
				arg3.field1468 = arg3.field1466;
			}
		}

		if ((arg2 & 0x40) != 0) {
			int var16 = arg1.method390();
			int var17 = arg1.method406();
			int var18 = arg1.method406();
			int var19 = arg1.field1038;

			if (arg3.field863 != null && arg3.field879) {
				long var20 = DCKSLYWK.method168(arg3.field863);
				boolean var22 = false;
				if (var17 <= 1) {
					for (int var23 = 0; var23 < field228; var23++) {
						if (field515[var23] == var20) {
							var22 = true;
							break;
						}
					}
				}

				if (!var22 && field365 == 0) {
					try {
						field242.field1038 = 0;
						arg1.method426(0, field242.field1037, var18);
						field242.field1038 = 0;
						String var24 = BOHPYYUF.method17(field242, var18);
						var24 = IXPHWLUO.method240(var24);
						arg3.field1467 = var24;
						arg3.field1494 = var16 >> 8;
						arg3.field1458 = var16 & 0xFF;
						arg3.field1474 = 150;

						if (var17 == 2 || var17 == 3) {
							method40("@cr2@" + arg3.field863, 1, var24);
						} else if (var17 == 1) {
							method40("@cr1@" + arg3.field863, 1, var24);
						} else {
							method40(arg3.field863, 2, var24);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field1038 = var18 + var19;
		}
	}

	@ObfuscatedName("client.b(ILRSWRPCHR;I)V")
	public final void method125(RSWRPCHR arg0, int arg1) {
		for (int var3 = 0; var3 < field347; var3++) {
			int var4 = field348[var3];
			MVRUIIXW var5 = field344[var4];
			int var6 = arg0.method388();
			if ((var6 & 0x10) != 0) {
				var6 += arg0.method388() << 8;
			}

			method124(var4, arg0, var6, var5);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method126(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field398; var2++) {
			if (arg0.equalsIgnoreCase(field236[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field311.field863)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method127() {
		if (field267 == 0) {
			field198[0] = "Cancel";
			field249[0] = 1843;
			field102 = 1;
			if (field262 == -1) {
				method161();
				field161 = 0;
				field372 = 0;

				if (field814 > 4 && field815 > 4 && field814 < 516 && field815 < 338) {
					if (field383 == -1) {
						method148();
					} else {
						method132(IGMZHLWJ.method215(field383), field814, 4, 0, field815, 4, 0);
					}
				}

				if (field357 != field161) {
					field357 = field161;
				}

				if (field372 != field134) {
					field134 = field372;
				}

				field161 = 0;
				field372 = 0;

				if (field814 > 553 && field815 > 205 && field814 < 743 && field815 < 466) {
					if (field521 != -1) {
						method132(IGMZHLWJ.method215(field521), field814, 553, 1, field815, 205, 0);
					} else if (field326[field382] != -1) {
						method132(IGMZHLWJ.method215(field326[field382]), field814, 553, 1, field815, 205, 0);
					}
				}

				if (field255 != field161) {
					field364 = true;
					field255 = field161;
				}

				if (field528 != field372) {
					field364 = true;
					field528 = field372;
				}

				field161 = 0;
				field372 = 0;

				if (field814 > 17 && field815 > 357 && field814 < 496 && field815 < 453) {
					if (field379 != -1) {
						method132(IGMZHLWJ.method215(field379), field814, 17, 2, field815, 357, 0);
					} else if (field538 != -1) {
						method132(IGMZHLWJ.method215(field538), field814, 17, 3, field815, 357, 0);
					} else if (field815 < 434 && field814 < 426 && field424 == 0) {
						method128(field815 - 357, field814 - 17);
					}
				}

				if ((field379 != -1 || field538 != -1) && field341 != field161) {
					field251 = true;
					field341 = field161;
				}

				if ((field379 != -1 || field538 != -1) && field372 != field292) {
					field251 = true;
					field292 = field372;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field102 - 1; var2++) {
						if (field249[var2] < 1000 && field249[var2 + 1] > 1000) {
							String var3 = field198[var2];
							field198[var2] = field198[var2 + 1];
							field198[var2 + 1] = var3;
							int var4 = field249[var2];
							field249[var2] = field249[var2 + 1];
							field249[var2 + 1] = var4;
							int var5 = field247[var2];
							field247[var2] = field247[var2 + 1];
							field247[var2 + 1] = var5;
							int var6 = field248[var2];
							field248[var2] = field248[var2 + 1];
							field248[var2 + 1] = var6;
							int var7 = field250[var2];
							field250[var2] = field250[var2 + 1];
							field250[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field161 = 0;
				field372 = 0;
				method132(IGMZHLWJ.method215(field262), field814, 0, 0, field815, 0, 0);

				if (field357 != field161) {
					field357 = field161;
				}

				if (field372 != field134) {
					field134 = field372;
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method128(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field226[var4] != null) {
				int var5 = field224[var4];
				int var6 = field318 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field225[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field339 == 0 || field339 == 1 && method126(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field311.field863)) {
						if (field522 >= 1) {
							field198[field102] = "Report abuse @whi@" + var7;
							field249[field102] = 505;
							field102++;
						}

						field198[field102] = "Add ignore @whi@" + var7;
						field249[field102] = 362;
						field102++;
						field198[field102] = "Add friend @whi@" + var7;
						field249[field102] = 954;
						field102++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field429 == 0 && (var5 == 7 || field160 == 0 || field160 == 1 && method126(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field522 >= 1) {
							field198[field102] = "Report abuse @whi@" + var7;
							field249[field102] = 505;
							field102++;
						}

						field198[field102] = "Add ignore @whi@" + var7;
						field249[field102] = 362;
						field102++;
						field198[field102] = "Add friend @whi@" + var7;
						field249[field102] = 954;
						field102++;
					}

					var3++;
				}

				if (var5 == 4 && (field239 == 0 || field239 == 1 && method126(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field198[field102] = "Accept trade @whi@" + var7;
						field249[field102] = 356;
						field102++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field429 == 0 && field160 < 2) {
					var3++;
				}

				if (var5 == 8 && (field239 == 0 || field239 == 1 && method126(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field198[field102] = "Accept challenge @whi@" + var7;
						field249[field102] = 654;
						field102++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BIZ)V")
	public final void method129(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method130() {
		for (int var1 = -1; var1 < field345; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field343;
			} else {
				var2 = field346[var1];
			}

			MVRUIIXW var3 = field344[var2];
			if (var3 != null) {
				method136(1, var3);
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method131() {
		if (field310 == null) {
			method49();
			field807 = null;
			field168 = null;
			field169 = null;
			field170 = null;
			field171 = null;
			field172 = null;
			field173 = null;
			field174 = null;
			field175 = null;
			field176 = null;
			field310 = new PRSDKOTZ(96, 479, method99());
			field308 = new PRSDKOTZ(156, 172, method99());
			PGTLMTYR.method342();
			field285.method320(0, 0);
			field307 = new PRSDKOTZ(261, 190, method99());
			field309 = new PRSDKOTZ(334, 512, method99());
			PGTLMTYR.method342();
			field287 = new PRSDKOTZ(50, 496, method99());
			field288 = new PRSDKOTZ(37, 269, method99());
			field289 = new PRSDKOTZ(45, 249, method99());
			field213 = true;
			field309.method351();
			XGNGXTLX.field1332 = field122;
		}
	}

	@ObfuscatedName("client.a(LIGMZHLWJ;IIIBIII)V")
	public final void method132(IGMZHLWJ arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0.field739 == 0 && arg0.field731 != null && !arg0.field704 && (arg1 >= arg2 && arg4 >= arg5 && arg1 <= arg0.field717 + arg2 && arg4 <= arg0.field724 + arg5)) {
			int var8 = arg0.field731.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg0.field733[var9] + arg2;
				int var11 = arg0.field680[var9] + arg5 - arg6;
				IGMZHLWJ var12 = IGMZHLWJ.method215(arg0.field731[var9]);
				var10 += var12.field688;
				var11 += var12.field720;
				if ((var12.field712 >= 0 || var12.field714 != 0) && arg1 >= var10 && arg4 >= var11 && arg1 < var12.field717 + var10 && arg4 < var12.field724 + var11) {
					if (var12.field712 >= 0) {
						field161 = var12.field712;
					} else {
						field161 = var12.field726;
					}
				}

				if (var12.field739 == 8 && arg1 >= var10 && arg4 >= var11 && arg1 < var12.field717 + var10 && arg4 < var12.field724 + var11) {
					field372 = var12.field726;
				}

				if (var12.field739 == 0) {
					method132(var12, arg1, var10, arg3, arg4, var11, var12.field736);

					if (var12.field674 > var12.field724) {
						method102(arg1, var11, var12.field717 + var10, var12.field674, arg3, var12.field724, var12, arg4);
					}
				} else {
					if (var12.field672 == 1 && arg1 >= var10 && arg4 >= var11 && arg1 < var12.field717 + var10 && arg4 < var12.field724 + var11) {
						boolean var13 = false;
						if (var12.field734 != 0) {
							var13 = method69(var12);
						}

						if (!var13) {
							field198[field102] = var12.field679;
							field249[field102] = 682;
							field248[field102] = var12.field726;
							field102++;
						}
					}

					if (var12.field672 == 2 && field334 == 0 && arg1 >= var10 && arg4 >= var11 && arg1 < var12.field717 + var10 && arg4 < var12.field724 + var11) {
						String var14 = var12.field738;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field198[field102] = var14 + " @gre@" + var12.field696;
						field249[field102] = 268;
						field248[field102] = var12.field726;
						field102++;
					}

					if (var12.field672 == 3 && arg1 >= var10 && arg4 >= var11 && arg1 < var12.field717 + var10 && arg4 < var12.field724 + var11) {
						field198[field102] = "Close";

						if (arg3 == 3) {
							field249[field102] = 723;
						} else {
							field249[field102] = 515;
						}

						field248[field102] = var12.field726;
						field102++;
					}

					if (var12.field672 == 4 && arg1 >= var10 && arg4 >= var11 && arg1 < var12.field717 + var10 && arg4 < var12.field724 + var11) {
						field198[field102] = var12.field679;
						field249[field102] = 50;
						field248[field102] = var12.field726;
						field102++;
					}

					if (var12.field672 == 5 && arg1 >= var10 && arg4 >= var11 && arg1 < var12.field717 + var10 && arg4 < var12.field724 + var11) {
						field198[field102] = var12.field679;
						field249[field102] = 944;
						field248[field102] = var12.field726;
						field102++;
					}

					if (var12.field672 == 6 && !field235 && arg1 >= var10 && arg4 >= var11 && arg1 < var12.field717 + var10 && arg4 < var12.field724 + var11) {
						field198[field102] = var12.field679;
						field249[field102] = 737;
						field248[field102] = var12.field726;
						field102++;
					}

					if (var12.field739 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field724; var16++) {
							for (int var17 = 0; var17 < var12.field717; var17++) {
								int var18 = (var12.field732 + 32) * var17 + var10;
								int var19 = (var12.field691 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field693[var15];
									var19 += var12.field684[var15];
								}

								if (arg1 >= var18 && arg4 >= var19 && arg1 < var18 + 32 && arg4 < var19 + 32) {
									field404 = var15;
									field405 = var12.field726;

									if (var12.field686[var15] > 0) {
										RXDLPXNX var20 = RXDLPXNX.method433(var12.field686[var15] - 1);
										if (field359 == 1 && var12.field682) {
											if (field361 != var12.field726 || field360 != var15) {
												field198[field102] = "Use " + field363 + " with @lre@" + var20.field1076;
												field249[field102] = 443;
												field250[field102] = var20.field1062;
												field247[field102] = var15;
												field248[field102] = var12.field726;
												field102++;
											}
										} else if (field334 != 1 || !var12.field682) {
											if (var12.field682) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1057 != null && var20.field1057[var21] != null) {
														field198[field102] = var20.field1057[var21] + " @lre@" + var20.field1076;

														if (var21 == 3) {
															field249[field102] = 804;
														}

														if (var21 == 4) {
															field249[field102] = 918;
														}

														field250[field102] = var20.field1062;
														field247[field102] = var15;
														field248[field102] = var12.field726;
														field102++;
													} else if (var21 == 4) {
														field198[field102] = "Drop @lre@" + var20.field1076;
														field249[field102] = 918;
														field250[field102] = var20.field1062;
														field247[field102] = var15;
														field248[field102] = var12.field726;
														field102++;
													}
												}
											}

											if (var12.field740) {
												field198[field102] = "Use @lre@" + var20.field1076;
												field249[field102] = 937;
												field250[field102] = var20.field1062;
												field247[field102] = var15;
												field248[field102] = var12.field726;
												field102++;
											}

											if (var12.field682 && var20.field1057 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1057[var22] != null) {
														field198[field102] = var20.field1057[var22] + " @lre@" + var20.field1076;

														if (var22 == 0) {
															field249[field102] = 653;
														}

														if (var22 == 1) {
															field249[field102] = 828;
														}

														if (var22 == 2) {
															field249[field102] = 233;
														}

														field250[field102] = var20.field1062;
														field247[field102] = var15;
														field248[field102] = var12.field726;
														field102++;
													}
												}
											}

											if (var12.field713 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field713[var23] != null) {
														field198[field102] = var12.field713[var23] + " @lre@" + var20.field1076;

														if (var23 == 0) {
															field249[field102] = 372;
														}

														if (var23 == 1) {
															field249[field102] = 648;
														}

														if (var23 == 2) {
															field249[field102] = 627;
														}

														if (var23 == 3) {
															field249[field102] = 555;
														}

														if (var23 == 4) {
															field249[field102] = 395;
														}

														field250[field102] = var20.field1062;
														field247[field102] = var15;
														field248[field102] = var12.field726;
														field102++;
													}
												}
											}

											field198[field102] = "Examine @lre@" + var20.field1076;
											field249[field102] = 1624;
											field250[field102] = var20.field1062;
											field247[field102] = var15;
											field248[field102] = var12.field726;
											field102++;
										} else if ((field336 & 0x10) == 0x10) {
											field198[field102] = field337 + " @lre@" + var20.field1076;
											field249[field102] = 40;
											field250[field102] = var20.field1062;
											field247[field102] = var15;
											field248[field102] = var12.field726;
											field102++;
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

	@ObfuscatedName("client.b(ZJ)V")
	public final void method133(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field398; var3++) {
				if (field290[var3] == arg0) {
					field398--;
					field364 = true;

					for (int var4 = var3; var4 < field398; var4++) {
						field236[var4] = field236[var4 + 1];
						field511[var4] = field511[var4 + 1];
						field290[var4] = field290[var4 + 1];
					}

					field449.method377(174);
					field449.method384(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method134() {
		method146(20, "Starting up");

		if (signlink.sunjava) {
			field800 = 5;
		}

		if (field510) {
			field498 = true;
		} else {
			field510 = true;
			boolean var1 = false;
			String var2 = method59();
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
						field333[var3] = new YXBFJZDP(500000, var3 + 1, signlink.cache_idx[var3], signlink.cache_dat);
					}
				}

				try {
					method157();
					field499 = method48(25, "title", 1, field282[1], "title screen");
					field183 = new EDIBXOXE(field499, "p11_full", false);
					field184 = new EDIBXOXE(field499, "p12_full", false);
					field185 = new EDIBXOXE(field499, "b12_full", false);
					field186 = new EDIBXOXE(field499, "q8_full", true);
					method89();
					method93();
					FXNTEMPE var4 = method48(30, "config", 2, field282[2], "config");
					FXNTEMPE var5 = method48(35, "interface", 3, field282[3], "interface");
					FXNTEMPE var6 = method48(40, "media", 4, field282[4], "2d graphics");
					FXNTEMPE var7 = method48(45, "textures", 6, field282[6], "textures");
					FXNTEMPE var8 = method48(50, "wordenc", 7, field282[7], "chat system");
					FXNTEMPE var9 = method48(55, "sounds", 8, field282[8], "sound effects");
					field488 = new byte[4][104][104];
					field530 = new int[4][105][105];
					field529 = new YJCKMNKP(4, field530, 104, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field526[var10] = new KQTHKTBC(104, 104);
					}

					field420 = new AIRMECOM(512, 512);
					FXNTEMPE var11 = method48(60, "versionlist", 5, field282[5], "update list");
					method146(60, "Connecting to update server");
					field509 = new QJAHKUCY();
					field509.method357(var11, this);
					OZAHMTPS.method334(field509.method354());
					WRJMHIDY.method463(field509.method360(0), field509);

					if (!field463) {
						field163 = 0;
						field164 = true;
						field509.method370(2, field163);

						while (field509.method367() > 0) {
							method52();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field509.field997 > 3) {
								method166("ondemand");
								return;
							}
						}
					}

					method146(65, "Requesting animations");
					int var12 = field509.method360(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field509.method370(1, var13);
					}

					while (field509.method367() > 0) {
						int var14 = var12 - field509.method367();
						if (var14 > 0) {
							method146(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method52();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field509.field997 > 3) {
							method166("ondemand");
							return;
						}
					}

					method146(70, "Requesting models");
					int var15 = field509.method360(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field509.method364(var16);
						if ((var17 & 0x1) != 0) {
							field509.method370(0, var16);
						}
					}

					int var18 = field509.method367();
					while (field509.method367() > 0) {
						int var19 = var18 - field509.method367();
						if (var19 > 0) {
							method146(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method52();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field333[0] != null) {
						method146(75, "Requesting maps");
						field509.method370(3, field509.method365(47, 0, 48));
						field509.method370(3, field509.method365(47, 1, 48));
						field509.method370(3, field509.method365(48, 0, 48));
						field509.method370(3, field509.method365(48, 1, 48));
						field509.method370(3, field509.method365(49, 0, 48));
						field509.method370(3, field509.method365(49, 1, 48));
						field509.method370(3, field509.method365(47, 0, 47));
						field509.method370(3, field509.method365(47, 1, 47));
						field509.method370(3, field509.method365(48, 0, 47));
						field509.method370(3, field509.method365(48, 1, 47));
						field509.method370(3, field509.method365(48, 0, 148));
						field509.method370(3, field509.method365(48, 1, 148));
						int var20 = field509.method367();
						while (field509.method367() > 0) {
							int var21 = var20 - field509.method367();
							if (var21 > 0) {
								method146(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method52();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field509.method360(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field509.method364(var23);
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
							field509.method361(var23, var25, 0);
						}
					}

					field509.method355(field462);

					if (!field463) {
						int var26 = field509.method360(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field509.method372(var27)) {
								field509.method361(var27, (byte) 1, 2);
							}
						}
					}

					method146(80, "Unpacking media");
					field284 = new OJMMOVXV(var6, "invback", 0);
					field286 = new OJMMOVXV(var6, "chatback", 0);
					field285 = new OJMMOVXV(var6, "mapback", 0);
					field103 = new OJMMOVXV(var6, "backbase1", 0);
					field104 = new OJMMOVXV(var6, "backbase2", 0);
					field105 = new OJMMOVXV(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field167[var28] = new OJMMOVXV(var6, "sideicons", var28);
					}

					field142 = new AIRMECOM(var6, "compass", 0);
					field254 = new AIRMECOM(var6, "mapedge", 0);
					field254.method6();

					for (int var29 = 0; var29 < 72; var29++) {
						field366[var29] = new OJMMOVXV(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field320[var30] = new AIRMECOM(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field229[var31] = new AIRMECOM(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field466[var32] = new AIRMECOM(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field444[var33] = new AIRMECOM(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field152[var34] = new AIRMECOM(var6, "headicons_hint", var34);
					}

					field332 = new AIRMECOM(var6, "overlay_multiway", 0);
					field196 = new AIRMECOM(var6, "mapmarker", 0);
					field197 = new AIRMECOM(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field151[var35] = new AIRMECOM(var6, "cross", var35);
					}

					field111 = new AIRMECOM(var6, "mapdots", 0);
					field112 = new AIRMECOM(var6, "mapdots", 1);
					field113 = new AIRMECOM(var6, "mapdots", 2);
					field114 = new AIRMECOM(var6, "mapdots", 3);
					field115 = new AIRMECOM(var6, "mapdots", 4);
					field415 = new OJMMOVXV(var6, "scrollbar", 0);
					field416 = new OJMMOVXV(var6, "scrollbar", 1);
					field500 = new OJMMOVXV(var6, "redstone1", 0);
					field501 = new OJMMOVXV(var6, "redstone2", 0);
					field502 = new OJMMOVXV(var6, "redstone3", 0);
					field503 = new OJMMOVXV(var6, "redstone1", 0);
					field503.method317();
					field504 = new OJMMOVXV(var6, "redstone2", 0);
					field504.method317();
					field482 = new OJMMOVXV(var6, "redstone1", 0);
					field482.method318();
					field483 = new OJMMOVXV(var6, "redstone2", 0);
					field483.method318();
					field484 = new OJMMOVXV(var6, "redstone3", 0);
					field484.method318();
					field485 = new OJMMOVXV(var6, "redstone1", 0);
					field485.method317();
					field485.method318();
					field486 = new OJMMOVXV(var6, "redstone2", 0);
					field486.method317();
					field486.method318();

					for (int var36 = 0; var36 < 2; var36++) {
						field475[var36] = new OJMMOVXV(var6, "mod_icons", var36);
					}

					AIRMECOM var37 = new AIRMECOM(var6, "backleft1", 0);
					field271 = new PRSDKOTZ(var37.field15, var37.field14, method99());
					var37.method7(0, 0);
					AIRMECOM var38 = new AIRMECOM(var6, "backleft2", 0);
					field272 = new PRSDKOTZ(var38.field15, var38.field14, method99());
					var38.method7(0, 0);
					AIRMECOM var39 = new AIRMECOM(var6, "backright1", 0);
					field273 = new PRSDKOTZ(var39.field15, var39.field14, method99());
					var39.method7(0, 0);
					AIRMECOM var40 = new AIRMECOM(var6, "backright2", 0);
					field274 = new PRSDKOTZ(var40.field15, var40.field14, method99());
					var40.method7(0, 0);
					AIRMECOM var41 = new AIRMECOM(var6, "backtop1", 0);
					field275 = new PRSDKOTZ(var41.field15, var41.field14, method99());
					var41.method7(0, 0);
					AIRMECOM var42 = new AIRMECOM(var6, "backvmid1", 0);
					field276 = new PRSDKOTZ(var42.field15, var42.field14, method99());
					var42.method7(0, 0);
					AIRMECOM var43 = new AIRMECOM(var6, "backvmid2", 0);
					field277 = new PRSDKOTZ(var43.field15, var43.field14, method99());
					var43.method7(0, 0);
					AIRMECOM var44 = new AIRMECOM(var6, "backvmid3", 0);
					field278 = new PRSDKOTZ(var44.field15, var44.field14, method99());
					var44.method7(0, 0);
					AIRMECOM var45 = new AIRMECOM(var6, "backhmid2", 0);
					field279 = new PRSDKOTZ(var45.field15, var45.field14, method99());
					var45.method7(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field320[var50] != null) {
							field320[var50].method5(var48 + var49, var47 + var49, var46 + var49);
						}

						if (field366[var50] != null) {
							field366[var50].method319(var48 + var49, var47 + var49, var46 + var49);
						}
					}

					method146(83, "Unpacking textures");
					XGNGXTLX.method519(var7);
					XGNGXTLX.method523(0.8D);
					XGNGXTLX.method518(20);
					method146(86, "Unpacking config");
					LZZHVUJR.method300(var4);
					URZZBDTU.method452(var4);
					ZVWMVAWM.method601(var4);
					RXDLPXNX.method435(var4);
					EKQCVRVG.method196(var4);
					MIIGCDHS.method303(var4);
					TGYZPJQJ.method442(var4);
					WBROSLMK.method460(var4);
					JFFNRVFW.method268(var4);
					RXDLPXNX.field1069 = field462;

					if (!field463) {
						method146(90, "Unpacking sounds");
						byte[] var51 = var9.method212("sounds.dat", null);
						RSWRPCHR var52 = new RSWRPCHR(var51);
						OOQAHIET.method328(var52);
					}

					method146(95, "Unpacking interfaces");
					EDIBXOXE[] var53 = new EDIBXOXE[] { field183, field184, field185, field186 };
					IGMZHLWJ.method222(var53, var5, var6);
					method146(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field285.field909[field285.field911 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field195[var54] = var55;
						field264[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field285.field909[field285.field911 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field241[var58 - 5] = var59 - 25;
						field215[var58 - 5] = var60 - var59;
					}

					XGNGXTLX.method516(765, 503);
					field123 = XGNGXTLX.field1332;
					XGNGXTLX.method516(479, 96);
					field120 = XGNGXTLX.field1332;
					XGNGXTLX.method516(190, 261);
					field121 = XGNGXTLX.field1332;
					XGNGXTLX.method516(512, 334);
					field122 = XGNGXTLX.field1332;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = XGNGXTLX.field1330[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					YJCKMNKP.method578(334, var62, 500, 512, 800);
					IXPHWLUO.method230(var8);
					field222 = new NZNLPNYM(this);
					method54(field222, 10);
					QMMKOHGT.field1010 = this;
					URZZBDTU.field1197 = this;
					EKQCVRVG.field618 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field221 + " " + field210);
					field301 = true;
				}
			} else {
				field253 = true;
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method135() {
		field371++;
		if (field371 > 82) {
			field371 = 0;
			field449.method377(201);
		}

		for (int var1 = 0; var1 < field244; var1++) {
			int var2 = field245[var1];
			ITIWVLHR var3 = field243[var2];
			if (var3 != null) {
				method136(var3.field770.field608, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILZJNNOVLJ;)V")
	public final void method136(int arg0, ZJNNOVLJ arg1) {
		if (arg1.field1455 < 128 || arg1.field1456 < 128 || arg1.field1455 >= 13184 || arg1.field1456 >= 13184) {
			arg1.field1496 = -1;
			arg1.field1489 = -1;
			arg1.field1450 = 0;
			arg1.field1451 = 0;
			arg1.field1455 = arg1.field1475[0] * 128 + arg1.field1453 * 64;
			arg1.field1456 = arg1.field1476[0] * 128 + arg1.field1453 * 64;
			arg1.method598();
		}

		if (field311 == arg1 && (arg1.field1455 < 1536 || arg1.field1456 < 1536 || arg1.field1455 >= 11776 || arg1.field1456 >= 11776)) {
			arg1.field1496 = -1;
			arg1.field1489 = -1;
			arg1.field1450 = 0;
			arg1.field1451 = 0;
			arg1.field1455 = arg1.field1475[0] * 128 + arg1.field1453 * 64;
			arg1.field1456 = arg1.field1476[0] * 128 + arg1.field1453 * 64;
			arg1.method598();
		}

		if (arg1.field1450 > field353) {
			method137(arg1);
		} else if (arg1.field1451 >= field353) {
			method138(arg1);
		} else {
			method139(arg1);
		}

		method140(arg1);
		method141(arg1);
	}

	@ObfuscatedName("client.a(LZJNNOVLJ;I)V")
	public final void method137(ZJNNOVLJ arg0) {
		int var2 = arg0.field1450 - field353;
		int var3 = arg0.field1453 * 64 + arg0.field1446 * 128;
		int var4 = arg0.field1453 * 64 + arg0.field1448 * 128;
		arg0.field1455 += (var3 - arg0.field1455) / var2;
		arg0.field1456 += (var4 - arg0.field1456) / var2;
		arg0.field1454 = 0;

		if (arg0.field1452 == 0) {
			arg0.field1495 = 1024;
		}

		if (arg0.field1452 == 1) {
			arg0.field1495 = 1536;
		}

		if (arg0.field1452 == 2) {
			arg0.field1495 = 0;
		}

		if (arg0.field1452 == 3) {
			arg0.field1495 = 512;
		}
	}

	@ObfuscatedName("client.b(LZJNNOVLJ;I)V")
	public final void method138(ZJNNOVLJ arg0) {
		if (field353 == arg0.field1451 || arg0.field1496 == -1 || arg0.field1499 != 0 || arg0.field1498 + 1 > LZZHVUJR.field832[arg0.field1496].method301(arg0.field1497)) {
			int var2 = arg0.field1451 - arg0.field1450;
			int var3 = field353 - arg0.field1450;
			int var4 = arg0.field1453 * 64 + arg0.field1446 * 128;
			int var5 = arg0.field1453 * 64 + arg0.field1448 * 128;
			int var6 = arg0.field1453 * 64 + arg0.field1447 * 128;
			int var7 = arg0.field1453 * 64 + arg0.field1449 * 128;
			arg0.field1455 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1456 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1454 = 0;

		if (arg0.field1452 == 0) {
			arg0.field1495 = 1024;
		}

		if (arg0.field1452 == 1) {
			arg0.field1495 = 1536;
		}

		if (arg0.field1452 == 2) {
			arg0.field1495 = 0;
		}

		if (arg0.field1452 == 3) {
			arg0.field1495 = 512;
		}

		arg0.field1457 = arg0.field1495;
	}

	@ObfuscatedName("client.c(LZJNNOVLJ;I)V")
	public final void method139(ZJNNOVLJ arg0) {
		arg0.field1484 = arg0.field1464;
		if (arg0.field1466 == 0) {
			arg0.field1454 = 0;
		} else {
			if (arg0.field1496 != -1 && arg0.field1499 == 0) {
				LZZHVUJR var2 = LZZHVUJR.field832[arg0.field1496];
				if (arg0.field1468 > 0 && var2.field844 == 0) {
					arg0.field1454++;
					return;
				}

				if (arg0.field1468 <= 0 && var2.field845 == 0) {
					arg0.field1454++;
					return;
				}
			}

			int var3 = arg0.field1455;
			int var4 = arg0.field1456;
			int var5 = arg0.field1475[arg0.field1466 - 1] * 128 + arg0.field1453 * 64;
			int var6 = arg0.field1476[arg0.field1466 - 1] * 128 + arg0.field1453 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1495 = 1280;
					} else if (var4 > var6) {
						arg0.field1495 = 1792;
					} else {
						arg0.field1495 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1495 = 768;
					} else if (var4 > var6) {
						arg0.field1495 = 256;
					} else {
						arg0.field1495 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1495 = 1024;
				} else {
					arg0.field1495 = 0;
				}

				int var7 = arg0.field1495 - arg0.field1457 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1478;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1477;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1480;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1479;
				}

				if (var8 == -1) {
					var8 = arg0.field1477;
				}

				arg0.field1484 = var8;
				int var9 = 4;
				if (arg0.field1495 != arg0.field1457 && arg0.field1487 == -1 && arg0.field1463 != 0) {
					var9 = 2;
				}

				if (arg0.field1466 > 2) {
					var9 = 6;
				}

				if (arg0.field1466 > 3) {
					var9 = 8;
				}

				if (arg0.field1454 > 0 && arg0.field1466 > 1) {
					var9 = 8;
					arg0.field1454--;
				}

				if (arg0.field1488[arg0.field1466 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1484 == arg0.field1477 && arg0.field1459 != -1) {
					arg0.field1484 = arg0.field1459;
				}

				if (var3 < var5) {
					arg0.field1455 += var9;
					if (arg0.field1455 > var5) {
						arg0.field1455 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1455 -= var9;
					if (arg0.field1455 < var5) {
						arg0.field1455 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1456 += var9;
					if (arg0.field1456 > var6) {
						arg0.field1456 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1456 -= var9;
					if (arg0.field1456 < var6) {
						arg0.field1456 = var6;
					}
				}

				if (arg0.field1455 == var5 && arg0.field1456 == var6) {
					arg0.field1466--;

					if (arg0.field1468 > 0) {
						arg0.field1468--;
						return;
					}
				}
			} else {
				arg0.field1455 = var5;
				arg0.field1456 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(BLZJNNOVLJ;)V")
	public final void method140(ZJNNOVLJ arg0) {
		if (arg0.field1463 != 0) {
			if (arg0.field1487 != -1 && arg0.field1487 < 32768) {
				ITIWVLHR var2 = field243[arg0.field1487];
				if (var2 != null) {
					int var3 = arg0.field1455 - var2.field1455;
					int var4 = arg0.field1456 - var2.field1456;
					if (var3 != 0 || var4 != 0) {
						arg0.field1495 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1487 >= 32768) {
				int var5 = arg0.field1487 - 32768;
				if (field350 == var5) {
					var5 = field343;
				}

				MVRUIIXW var6 = field344[var5];
				if (var6 != null) {
					int var7 = arg0.field1455 - var6.field1455;
					int var8 = arg0.field1456 - var6.field1456;
					if (var7 != 0 || var8 != 0) {
						arg0.field1495 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1481 != 0 || arg0.field1482 != 0) && (arg0.field1466 == 0 || arg0.field1454 > 0)) {
				int var9 = arg0.field1455 - (arg0.field1481 - field505 - field505) * 64;
				int var10 = arg0.field1456 - (arg0.field1482 - field506 - field506) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1495 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1481 = 0;
				arg0.field1482 = 0;
			}

			int var11 = arg0.field1495 - arg0.field1457 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1463 || var11 > 2048 - arg0.field1463) {
					arg0.field1457 = arg0.field1495;
				} else if (var11 > 1024) {
					arg0.field1457 -= arg0.field1463;
				} else {
					arg0.field1457 += arg0.field1463;
				}

				arg0.field1457 &= 0x7FF;
				if (arg0.field1484 == arg0.field1464 && arg0.field1495 != arg0.field1457) {
					if (arg0.field1465 != -1) {
						arg0.field1484 = arg0.field1465;
						return;
					}

					arg0.field1484 = arg0.field1477;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILZJNNOVLJ;)V")
	public final void method141(ZJNNOVLJ arg0) {
		arg0.field1472 = false;

		if (arg0.field1484 != -1) {
			LZZHVUJR var2 = LZZHVUJR.field832[arg0.field1484];
			arg0.field1486++;
			if (arg0.field1485 < var2.field833 && arg0.field1486 > var2.method301(arg0.field1485)) {
				arg0.field1486 = 0;
				arg0.field1485++;
			}

			if (arg0.field1485 >= var2.field833) {
				arg0.field1486 = 0;
				arg0.field1485 = 0;
			}
		}

		if (arg0.field1489 != -1 && field353 >= arg0.field1492) {
			if (arg0.field1490 < 0) {
				arg0.field1490 = 0;
			}

			LZZHVUJR var3 = TGYZPJQJ.field1121[arg0.field1489].field1125;
			arg0.field1491++;
			while (arg0.field1490 < var3.field833 && arg0.field1491 > var3.method301(arg0.field1490)) {
				arg0.field1491 -= var3.method301(arg0.field1490);
				arg0.field1490++;
			}

			if (arg0.field1490 >= var3.field833 && (arg0.field1490 < 0 || arg0.field1490 >= var3.field833)) {
				arg0.field1489 = -1;
			}
		}

		if (arg0.field1496 != -1 && arg0.field1499 <= 1) {
			LZZHVUJR var4 = LZZHVUJR.field832[arg0.field1496];
			if (var4.field844 == 1 && arg0.field1468 > 0 && arg0.field1450 <= field353 && arg0.field1451 < field353) {
				arg0.field1499 = 1;
				return;
			}
		}

		if (arg0.field1496 != -1 && arg0.field1499 == 0) {
			LZZHVUJR var5 = LZZHVUJR.field832[arg0.field1496];
			arg0.field1498++;
			while (arg0.field1497 < var5.field833 && arg0.field1498 > var5.method301(arg0.field1497)) {
				arg0.field1498 -= var5.method301(arg0.field1497);
				arg0.field1497++;
			}

			if (arg0.field1497 >= var5.field833) {
				arg0.field1497 -= var5.field837;
				arg0.field1500++;
				if (arg0.field1500 >= var5.field843) {
					arg0.field1496 = -1;
				}

				if (arg0.field1497 < 0 || arg0.field1497 >= var5.field833) {
					arg0.field1496 = -1;
				}
			}

			arg0.field1472 = var5.field839;
		}

		if (arg0.field1499 > 0) {
			arg0.field1499--;
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method142() {
		if (field262 == -1 || field396 != 2 && field807 == null) {
			if (field213) {
				method131();
				field213 = false;
				field271.method352(0, 4, field806);
				field272.method352(0, 357, field806);
				field273.method352(722, 4, field806);
				field274.method352(743, 205, field806);
				field275.method352(0, 0, field806);
				field276.method352(516, 4, field806);
				field277.method352(516, 205, field806);
				field278.method352(496, 357, field806);
				field279.method352(0, 338, field806);
				field364 = true;
				field251 = true;
				field417 = true;
				field520 = true;

				if (field396 != 2) {
					field309.method352(4, 4, field806);
					field308.method352(550, 4, field806);
				}
			}

			if (field396 == 2) {
				method87();
			}

			if (field450 && field204 == 1) {
				field364 = true;
			}

			if (field521 != -1) {
				boolean var3 = method165(field294, field521);
				if (var3) {
					field364 = true;
				}
			}

			if (field190 == 2) {
				field364 = true;
			}

			if (field267 == 2) {
				field364 = true;
			}

			if (field364) {
				method27();
				field364 = false;
			}

			if (field379 == -1 && field424 == 0) {
				field312.field736 = field135 - field318 - 77;

				if (field814 > 448 && field814 < 560 && field815 > 332) {
					method102(field814 - 17, 0, 463, field135, -1, 77, field312, field815 - 357);
				}

				int var4 = field135 - field312.field736 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field135 - 77) {
					var4 = field135 - 77;
				}

				if (field318 != var4) {
					field318 = var4;
					field251 = true;
				}
			}

			if (field379 == -1 && field424 == 3) {
				int var5 = field453 * 14 + 7;
				field312.field736 = field456;

				if (field814 > 448 && field814 < 560 && field815 > 332) {
					method102(field814 - 17, 0, 463, var5, -1, 77, field312, field815 - 357);
				}

				int var6 = field312.field736;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field456 != var6) {
					field456 = var6;
					field251 = true;
				}
			}

			if (field379 != -1) {
				boolean var7 = method165(field294, field379);
				if (var7) {
					field251 = true;
				}
			}

			if (field190 == 3) {
				field251 = true;
			}

			if (field267 == 3) {
				field251 = true;
			}

			if (field158 != null) {
				field251 = true;
			}

			if (field450 && field204 == 2) {
				field251 = true;
			}

			if (field251) {
				method105();
				field251 = false;
			}

			if (field396 == 2) {
				method64();
				field308.method352(550, 4, field806);
			}

			if (field541 != -1) {
				field417 = true;
			}

			if (field417) {
				if (field541 != -1 && field541 == field382) {
					field541 = -1;
					field449.method377(20);
					field449.method378(field382);
				}

				field417 = false;
				field289.method351();
				field105.method320(0, 0);

				if (field521 == -1) {
					if (field326[field382] != -1) {
						if (field382 == 0) {
							field500.method320(22, 10);
						}

						if (field382 == 1) {
							field501.method320(54, 8);
						}

						if (field382 == 2) {
							field501.method320(82, 8);
						}

						if (field382 == 3) {
							field502.method320(110, 8);
						}

						if (field382 == 4) {
							field504.method320(153, 8);
						}

						if (field382 == 5) {
							field504.method320(181, 8);
						}

						if (field382 == 6) {
							field503.method320(209, 9);
						}
					}

					if (field326[0] != -1 && (field541 != 0 || field353 % 20 < 10)) {
						field167[0].method320(29, 13);
					}

					if (field326[1] != -1 && (field541 != 1 || field353 % 20 < 10)) {
						field167[1].method320(53, 11);
					}

					if (field326[2] != -1 && (field541 != 2 || field353 % 20 < 10)) {
						field167[2].method320(82, 11);
					}

					if (field326[3] != -1 && (field541 != 3 || field353 % 20 < 10)) {
						field167[3].method320(115, 12);
					}

					if (field326[4] != -1 && (field541 != 4 || field353 % 20 < 10)) {
						field167[4].method320(153, 13);
					}

					if (field326[5] != -1 && (field541 != 5 || field353 % 20 < 10)) {
						field167[5].method320(180, 11);
					}

					if (field326[6] != -1 && (field541 != 6 || field353 % 20 < 10)) {
						field167[6].method320(208, 13);
					}
				}

				field289.method352(516, 160, field806);
				field288.method351();
				field104.method320(0, 0);

				if (field521 == -1) {
					if (field326[field382] != -1) {
						if (field382 == 7) {
							field482.method320(42, 0);
						}

						if (field382 == 8) {
							field483.method320(74, 0);
						}

						if (field382 == 9) {
							field483.method320(102, 0);
						}

						if (field382 == 10) {
							field484.method320(130, 1);
						}

						if (field382 == 11) {
							field486.method320(173, 0);
						}

						if (field382 == 12) {
							field486.method320(201, 0);
						}

						if (field382 == 13) {
							field485.method320(229, 0);
						}
					}

					if (field326[8] != -1 && (field541 != 8 || field353 % 20 < 10)) {
						field167[7].method320(74, 2);
					}

					if (field326[9] != -1 && (field541 != 9 || field353 % 20 < 10)) {
						field167[8].method320(102, 3);
					}

					if (field326[10] != -1 && (field541 != 10 || field353 % 20 < 10)) {
						field167[9].method320(137, 4);
					}

					if (field326[11] != -1 && (field541 != 11 || field353 % 20 < 10)) {
						field167[10].method320(174, 2);
					}

					if (field326[12] != -1 && (field541 != 12 || field353 % 20 < 10)) {
						field167[11].method320(201, 2);
					}

					if (field326[13] != -1 && (field541 != 13 || field353 % 20 < 10)) {
						field167[12].method320(226, 2);
					}
				}

				field288.method352(496, 466, field806);
				field309.method351();
				XGNGXTLX.field1332 = field122;
			}

			if (field520) {
				field520 = false;
				field287.method351();
				field103.method320(0, 0);
				field184.method180(true, 0xFFFFFF, "Public chat", 28, 55);

				if (field339 == 0) {
					field184.method180(true, 0xFF00, "On", 41, 55);
				}

				if (field339 == 1) {
					field184.method180(true, 0xFFFF00, "Friends", 41, 55);
				}

				if (field339 == 2) {
					field184.method180(true, 0xFF0000, "Off", 41, 55);
				}

				if (field339 == 3) {
					field184.method180(true, 0xFFFF, "Hide", 41, 55);
				}

				field184.method180(true, 0xFFFFFF, "Private chat", 28, 184);

				if (field160 == 0) {
					field184.method180(true, 0xFF00, "On", 41, 184);
				}

				if (field160 == 1) {
					field184.method180(true, 0xFFFF00, "Friends", 41, 184);
				}

				if (field160 == 2) {
					field184.method180(true, 0xFF0000, "Off", 41, 184);
				}

				field184.method180(true, 0xFFFFFF, "Trade/compete", 28, 324);

				if (field239 == 0) {
					field184.method180(true, 0xFF00, "On", 41, 324);
				}

				if (field239 == 1) {
					field184.method180(true, 0xFFFF00, "Friends", 41, 324);
				}

				if (field239 == 2) {
					field184.method180(true, 0xFF0000, "Off", 41, 324);
				}

				field184.method180(true, 0xFFFFFF, "Report abuse", 33, 458);
				field287.method352(0, 453, field806);
				field309.method351();
				XGNGXTLX.field1332 = field122;
			}

			field294 = 0;
		} else {
			if (field396 == 2) {
				method165(field294, field262);

				if (field191 != -1) {
					method165(field294, field191);
				}

				field294 = 0;
				method25();
				field807.method351();
				XGNGXTLX.field1332 = field123;
				PGTLMTYR.method342();
				field213 = true;
				IGMZHLWJ var1 = IGMZHLWJ.method215(field262);
				if (var1.field717 == 512 && var1.field724 == 334 && var1.field739 == 0) {
					var1.field717 = 765;
					var1.field724 = 503;
				}

				method143(0, var1, 0, 0);

				if (field191 != -1) {
					IGMZHLWJ var2 = IGMZHLWJ.method215(field191);
					if (var2.field717 == 512 && var2.field724 == 334 && var2.field739 == 0) {
						var2.field717 = 765;
						var2.field724 = 503;
					}

					method143(0, var2, 0, 0);
				}

				if (field450) {
					method86();
				} else {
					method127();
					method113();
				}
			}

			field807.method352(0, 0, field806);
		}
	}

	@ObfuscatedName("client.a(ILIGMZHLWJ;IIZ)V")
	public final void method143(int arg0, IGMZHLWJ arg1, int arg2, int arg3) {
		if (arg1.field739 == 0 && arg1.field731 != null && (!arg1.field704 || field357 == arg1.field726 || field255 == arg1.field726 || field341 == arg1.field726)) {
			int var5 = PGTLMTYR.field955;
			int var6 = PGTLMTYR.field953;
			int var7 = PGTLMTYR.field956;
			int var8 = PGTLMTYR.field954;
			PGTLMTYR.method341(arg2, arg1.field717 + arg0, arg0, arg1.field724 + arg2);
			int var9 = arg1.field731.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field733[var10] + arg0;
				int var12 = arg1.field680[var10] + arg2 - arg3;
				IGMZHLWJ var13 = IGMZHLWJ.method215(arg1.field731[var10]);
				var11 += var13.field688;
				var12 += var13.field720;

				if (var13.field734 > 0) {
					method74(var13);
				}

				if (var13.field739 == 0) {
					if (var13.field736 > var13.field674 - var13.field724) {
						var13.field736 = var13.field674 - var13.field724;
					}

					if (var13.field736 < 0) {
						var13.field736 = 0;
					}

					method143(var11, var13, var12, var13.field736);

					if (var13.field674 > var13.field724) {
						method42(var13.field736, var12, var13.field674, var13.field717 + var11, var13.field724);
					}
				} else if (var13.field739 != 1) {
					if (var13.field739 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field724; var15++) {
							for (int var16 = 0; var16 < var13.field717; var16++) {
								int var17 = (var13.field732 + 32) * var16 + var11;
								int var18 = (var13.field691 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field693[var14];
									var18 += var13.field684[var14];
								}

								if (var13.field686[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field686[var14] - 1;
									if (var17 > PGTLMTYR.field955 - 32 && var17 < PGTLMTYR.field956 && var18 > PGTLMTYR.field953 - 32 && var18 < PGTLMTYR.field954 || field267 != 0 && field266 == var14) {
										int var22 = 0;
										if (field359 == 1 && field360 == var14 && field361 == var13.field726) {
											var22 = 0xFFFFFF;
										}

										AIRMECOM var23 = RXDLPXNX.method436(var22, var13.field699[var14], var21);
										if (var23 != null) {
											if (field267 != 0 && field266 == var14 && field265 == var13.field726) {
												var19 = field814 - field268;
												var20 = field815 - field269;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field436 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method11(128, var18 + var20, var17 + var19);

												if (var18 + var20 < PGTLMTYR.field953 && arg1.field736 > 0) {
													int var24 = (PGTLMTYR.field953 - var18 - var20) * field294 / 3;
													if (var24 > field294 * 10) {
														var24 = field294 * 10;
													}

													if (var24 > arg1.field736) {
														var24 = arg1.field736;
													}

													arg1.field736 -= var24;
													field269 += var24;
												}

												if (var18 + var20 + 32 > PGTLMTYR.field954 && arg1.field736 < arg1.field674 - arg1.field724) {
													int var25 = (var18 + var20 + 32 - PGTLMTYR.field954) * field294 / 3;
													if (var25 > field294 * 10) {
														var25 = field294 * 10;
													}

													if (var25 > arg1.field674 - arg1.field724 - arg1.field736) {
														var25 = arg1.field674 - arg1.field724 - arg1.field736;
													}

													arg1.field736 += var25;
													field269 -= var25;
												}
											} else if (field190 != 0 && field189 == var14 && field188 == var13.field726) {
												var23.method11(128, var18, var17);
											} else {
												var23.method9(var17, var18);
											}

											if (var23.field18 == 33 || var13.field699[var14] != 1) {
												int var26 = var13.field699[var14];
												field183.method183(var17 + var19 + 1, 0, var18 + var20 + 10, method112(var26));
												field183.method183(var17 + var19, 0xFFFF00, var18 + var20 + 9, method112(var26));
											}
										}
									}
								} else if (var13.field742 != null && var14 < 20) {
									AIRMECOM var27 = var13.field742[var14];
									if (var27 != null) {
										var27.method9(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field739 == 3) {
						boolean var28 = false;
						if (field341 == var13.field726 || field255 == var13.field726 || field357 == var13.field726) {
							var28 = true;
						}

						int var29;
						if (method156(var13)) {
							var29 = var13.field723;
							if (var28 && var13.field690 != 0) {
								var29 = var13.field690;
							}
						} else {
							var29 = var13.field689;
							if (var28 && var13.field714 != 0) {
								var29 = var13.field714;
							}
						}

						if (var13.field715 == 0) {
							if (var13.field692) {
								PGTLMTYR.method344(var11, var13.field717, var13.field724, var12, var29);
							} else {
								PGTLMTYR.method345(var29, var13.field717, var11, var13.field724, var12);
							}
						} else if (var13.field692) {
							PGTLMTYR.method343(var11, var13.field717, var29, var12, var13.field724, 256 - (var13.field715 & 0xFF));
						} else {
							PGTLMTYR.method346(var13.field717, var29, var12, var13.field724, var11, 256 - (var13.field715 & 0xFF));
						}
					} else if (var13.field739 == 4) {
						EDIBXOXE var30 = var13.field711;
						String var31 = var13.field687;
						boolean var32 = false;
						if (field341 == var13.field726 || field255 == var13.field726 || field357 == var13.field726) {
							var32 = true;
						}

						int var33;
						if (method156(var13)) {
							var33 = var13.field723;
							if (var32 && var13.field690 != 0) {
								var33 = var13.field690;
							}

							if (var13.field673.length() > 0) {
								var31 = var13.field673;
							}
						} else {
							var33 = var13.field689;
							if (var32 && var13.field714 != 0) {
								var33 = var13.field714;
							}
						}

						if (var13.field672 == 6 && field235) {
							var31 = "Please wait...";
							var33 = var13.field689;
						}

						if (PGTLMTYR.field951 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field590 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method123(method154(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method123(method154(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method123(method154(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method123(method154(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method123(method154(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field681) {
								var30.method180(var13.field683, var33, var41, var34, var13.field717 / 2 + var11);
							} else {
								var30.method187(var11, var41, var33, var13.field683, var34);
							}

							var34 += var30.field590;
						}
					} else if (var13.field739 == 5) {
						AIRMECOM var42;
						if (method156(var13)) {
							var42 = var13.field729;
						} else {
							var42 = var13.field685;
						}

						if (var42 != null) {
							var42.method9(var11, var12);
						}
					} else if (var13.field739 == 6) {
						int var43 = XGNGXTLX.field1326;
						int var44 = XGNGXTLX.field1327;
						XGNGXTLX.field1326 = var13.field717 / 2 + var11;
						XGNGXTLX.field1327 = var13.field724 / 2 + var12;
						int var45 = XGNGXTLX.field1330[var13.field702] * var13.field701 >> 16;
						int var46 = XGNGXTLX.field1331[var13.field702] * var13.field701 >> 16;
						boolean var47 = method156(var13);
						int var48;
						if (var47) {
							var48 = var13.field710;
						} else {
							var48 = var13.field709;
						}

						WRJMHIDY var49;
						if (var48 == -1) {
							var49 = var13.method220(-1, -1, var47);
						} else {
							LZZHVUJR var50 = LZZHVUJR.field832[var48];
							var49 = var13.method220(var50.field834[var13.field722], var50.field835[var13.field722], var47);
						}

						if (var49 != null) {
							var49.method487(0, var13.field703, 0, var13.field702, 0, var45, var46);
						}

						XGNGXTLX.field1326 = var43;
						XGNGXTLX.field1327 = var44;
					} else {
						if (var13.field739 == 7) {
							EDIBXOXE var51 = var13.field711;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field724; var53++) {
								for (int var54 = 0; var54 < var13.field717; var54++) {
									if (var13.field686[var52] > 0) {
										RXDLPXNX var55 = RXDLPXNX.method433(var13.field686[var52] - 1);
										String var56 = String.valueOf(var55.field1076);
										if (var55.field1093 || var13.field699[var52] != 1) {
											var56 = var56 + " x" + method60(var13.field699[var52]);
										}

										int var57 = (var13.field732 + 115) * var54 + var11;
										int var58 = (var13.field691 + 12) * var53 + var12;
										if (var13.field681) {
											var51.method180(var13.field683, var13.field689, var56, var58, var13.field717 / 2 + var57);
										} else {
											var51.method187(var57, var56, var13.field689, var13.field683, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field739 == 8 && (field292 == var13.field726 || field528 == var13.field726 || field134 == var13.field726) && field126 == 100) {
							int var59 = 0;
							int var60 = 0;
							EDIBXOXE var61 = field184;
							String var62 = var13.field687;
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

								int var65 = var61.method181(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field590 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field717 + var11 - var59 - 5;
							int var67 = var13.field724 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field717 + arg0) {
								var66 = arg1.field717 + arg0 - var59;
							}

							if (var60 + var67 > arg1.field724 + arg2) {
								var67 = arg1.field724 + arg2 - var60;
							}

							PGTLMTYR.method344(var66, var59, var60, var67, 0xFFFFA0);
							PGTLMTYR.method345(0, var59, var66, var60, var67);
							String var68 = var13.field687;
							int var69 = var61.field590 + var67 + 2;
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

								var61.method187(var66 + 3, var71, 0, false, var69);
								var69 += var61.field590 + 1;
							}
						}
					}
				}
			}

			PGTLMTYR.method341(var6, var7, var5, var8);
		}
	}

	@ObfuscatedName("client.k(II)V")
	public final void method144(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method145() {
		field449.method377(169);

		if (field521 != -1) {
			method21(field521);
			field521 = -1;
			field364 = true;
			field235 = false;
			field417 = true;
		}

		if (field379 != -1) {
			method21(field379);
			field379 = -1;
			field251 = true;
			field235 = false;
		}

		if (field262 != -1) {
			method21(field262);
			field262 = -1;
			field213 = true;
		}

		if (field191 != -1) {
			method21(field191);
			field191 = -1;
		}

		if (field383 != -1) {
			method21(field383);
			field383 = -1;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Z)V")
	public final void method146(int arg0, String arg1) {
		field210 = arg0;
		field221 = arg1;
		method115();

		if (field499 == null) {
			super.method146(arg0, arg1);
		} else {
			field170.method351();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field185.method179(0xFFFFFF, var3 / 2, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			PGTLMTYR.method345(0x8C1111, 304, var3 / 2 - 152, 34, var6);
			PGTLMTYR.method345(0, 302, var3 / 2 - 151, 32, var6 + 1);
			PGTLMTYR.method344(var3 / 2 - 150, arg0 * 3, 30, var6 + 2, 0x8C1111);
			PGTLMTYR.method344(arg0 * 3 + var3 / 2 - 150, 300 - arg0 * 3, 30, var6 + 2, 0);
			field185.method179(0xFFFFFF, var3 / 2, var4 / 2 + 5 - var5, arg1);
			field170.method352(202, 171, field806);

			if (field213) {
				field213 = false;

				if (!field144) {
					field171.method352(0, 0, field806);
					field172.method352(637, 0, field806);
				}

				field168.method352(128, 0, field806);
				field169.method352(202, 371, field806);
				field173.method352(0, 265, field806);
				field174.method352(562, 265, field806);
				field175.method352(128, 171, field806);
				field176.method352(562, 171, field806);
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method147() {
		if (field524 == 0) {
			int var1 = field804 / 2 - 80;
			int var2 = field805 / 2 + 20;
			var2 += 20;
			if (field820 == 1 && field821 >= var1 - 75 && field821 <= var1 + 75 && field822 >= var2 - 20 && field822 <= var2 + 20) {
				field524 = 3;
				field374 = 0;
			}

			int var3 = field804 / 2 + 80;
			if (field820 == 1 && field821 >= var3 - 75 && field821 <= var3 + 75 && field822 >= var2 - 20 && field822 <= var2 + 20) {
				field422 = "";
				field423 = "Enter your username & password.";
				field524 = 2;
				field374 = 0;
			}
		} else if (field524 == 2) {
			int var4 = field805 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field820 == 1 && field822 >= var4 - 15 && field822 < var4) {
				field374 = 0;
			}

			var4 += 15;
			if (field820 == 1 && field822 >= var4 - 15 && field822 < var4) {
				field374 = 1;
			}

			var4 += 15;
			int var5 = field804 / 2 - 80;
			int var6 = field805 / 2 + 50;
			var6 += 20;
			if (field820 == 1 && field821 >= var5 - 75 && field821 <= var5 + 75 && field822 >= var6 - 20 && field822 <= var6 + 20) {
				field203 = 0;
				method167(field491, field492, false);

				if (field240) {
					return;
				}
			}

			int var7 = field804 / 2 + 80;
			if (field820 == 1 && field821 >= var7 - 75 && field821 <= var7 + 75 && field822 >= var6 - 20 && field822 <= var6 + 20) {
				field524 = 0;
				field491 = "";
				field492 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method299();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field218.length(); var10++) {
					if (var8 == field218.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field374 == 0) {
					if (var8 == 8 && field491.length() > 0) {
						field491 = field491.substring(0, field491.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field374 = 1;
					}

					if (var9) {
						field491 = field491 + (char) var8;
					}

					if (field491.length() > 12) {
						field491 = field491.substring(0, 12);
					}
				} else if (field374 == 1) {
					if (var8 == 8 && field492.length() > 0) {
						field492 = field492.substring(0, field492.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field374 = 0;
					}

					if (var9) {
						field492 = field492 + (char) var8;
					}

					if (field492.length() > 20) {
						field492 = field492.substring(0, 20);
					}
				}
			}
		} else if (field524 == 3) {
			int var11 = field804 / 2;
			int var12 = field805 / 2 + 50;
			var12 += 20;
			if (field820 == 1 && field821 >= var11 - 75 && field821 <= var11 + 75 && field822 >= var12 - 20 && field822 <= var12 + 20) {
				field524 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method148() {
		if (field359 == 0 && field334 == 0) {
			field198[field102] = "Walk here";
			field249[field102] = 14;
			field247[field102] = field814;
			field248[field102] = field815;
			field102++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < WRJMHIDY.field1290; var2++) {
			int var3 = WRJMHIDY.field1291[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field529.method572(field319, var4, var5, var3) >= 0) {
					URZZBDTU var8 = URZZBDTU.method450(var7);
					if (var8.field1168 != null) {
						var8 = var8.method455();
					}

					if (var8 == null) {
						continue;
					}

					if (field359 == 1) {
						field198[field102] = "Use " + field363 + " with @cya@" + var8.field1207;
						field249[field102] = 741;
						field250[field102] = var3;
						field247[field102] = var4;
						field248[field102] = var5;
						field102++;
					} else if (field334 != 1) {
						if (var8.field1169 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1169[var9] != null) {
									field198[field102] = var8.field1169[var9] + " @cya@" + var8.field1207;

									if (var9 == 0) {
										field249[field102] = 321;
									}

									if (var9 == 1) {
										field249[field102] = 809;
									}

									if (var9 == 2) {
										field249[field102] = 35;
									}

									if (var9 == 3) {
										field249[field102] = 71;
									}

									if (var9 == 4) {
										field249[field102] = 1580;
									}

									field250[field102] = var3;
									field247[field102] = var4;
									field248[field102] = var5;
									field102++;
								}
							}
						}

						field198[field102] = "Examine @cya@" + var8.field1207;
						field249[field102] = 1891;
						field250[field102] = var8.field1198 << 14;
						field247[field102] = var4;
						field248[field102] = var5;
						field102++;
					} else if ((field336 & 0x4) == 4) {
						field198[field102] = field337 + " @cya@" + var8.field1207;
						field249[field102] = 186;
						field250[field102] = var3;
						field247[field102] = var4;
						field248[field102] = var5;
						field102++;
					}
				}

				if (var6 == 1) {
					ITIWVLHR var10 = field243[var7];
					if (var10.field770.field608 == 1 && (var10.field1455 & 0x7F) == 0x40 && (var10.field1456 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field244; var11++) {
							ITIWVLHR var12 = field243[field245[var11]];
							if (var12 != null && var10 != var12 && var12.field770.field608 == 1 && var10.field1455 == var12.field1455 && var10.field1456 == var12.field1456) {
								method46(field245[var11], var12.field770, var4, var5);
							}
						}

						for (int var13 = 0; var13 < field345; var13++) {
							MVRUIIXW var14 = field344[field346[var13]];
							if (var14 != null && var10.field1455 == var14.field1455 && var10.field1456 == var14.field1456) {
								method36(var14, field346[var13], var5, var4);
							}
						}
					}

					method46(var7, var10.field770, var4, var5);
				}

				if (var6 == 0) {
					MVRUIIXW var15 = field344[var7];
					if ((var15.field1455 & 0x7F) == 0x40 && (var15.field1456 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field244; var16++) {
							ITIWVLHR var17 = field243[field245[var16]];
							if (var17 != null && var17.field770.field608 == 1 && var15.field1455 == var17.field1455 && var15.field1456 == var17.field1456) {
								method46(field245[var16], var17.field770, var4, var5);
							}
						}

						for (int var18 = 0; var18 < field345; var18++) {
							MVRUIIXW var19 = field344[field346[var18]];
							if (var19 != null && var15 != var19 && var15.field1455 == var19.field1455 && var15.field1456 == var19.field1456) {
								method36(var19, field346[var18], var5, var4);
							}
						}
					}

					method36(var15, var7, var5, var4);
				}

				if (var6 == 3) {
					EZXKBAZY var20 = field516[field319][var4][var5];
					if (var20 != null) {
						for (JRQYDGTL var21 = (JRQYDGTL) var20.method207(); var21 != null; var21 = (JRQYDGTL) var20.method209()) {
							RXDLPXNX var22 = RXDLPXNX.method433(var21.field788);
							if (field359 == 1) {
								field198[field102] = "Use " + field363 + " with @lre@" + var22.field1076;
								field249[field102] = 419;
								field250[field102] = var21.field788;
								field247[field102] = var4;
								field248[field102] = var5;
								field102++;
							} else if (field334 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1089 != null && var22.field1089[var23] != null) {
										field198[field102] = var22.field1089[var23] + " @lre@" + var22.field1076;

										if (var23 == 0) {
											field249[field102] = 416;
										}

										if (var23 == 1) {
											field249[field102] = 858;
										}

										if (var23 == 2) {
											field249[field102] = 134;
										}

										if (var23 == 3) {
											field249[field102] = 852;
										}

										if (var23 == 4) {
											field249[field102] = 499;
										}

										field250[field102] = var21.field788;
										field247[field102] = var4;
										field248[field102] = var5;
										field102++;
									} else if (var23 == 2) {
										field198[field102] = "Take @lre@" + var22.field1076;
										field249[field102] = 134;
										field250[field102] = var21.field788;
										field247[field102] = var4;
										field248[field102] = var5;
										field102++;
									}
								}

								field198[field102] = "Examine @lre@" + var22.field1076;
								field249[field102] = 1684;
								field250[field102] = var21.field788;
								field247[field102] = var4;
								field248[field102] = var5;
								field102++;
							} else if ((field336 & 0x1) == 1) {
								field198[field102] = field337 + " @lre@" + var22.field1076;
								field249[field102] = 617;
								field250[field102] = var21.field788;
								field247[field102] = var4;
								field248[field102] = var5;
								field102++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BIILAIRMECOM;)V")
	public final void method149(int arg0, int arg1, AIRMECOM arg2) {
		int var4 = field297 + field149 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = WRJMHIDY.field1292[var4];
			int var7 = WRJMHIDY.field1293[var4];
			var6 = var6 * 256 / (field413 + 256);
			var7 = var7 * 256 / (field413 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method15(var8 + 94 + 4 - arg2.field18 / 2, 83 - var9 - arg2.field19 / 2 - 4, field285);
			} else {
				arg2.method9(var8 + 94 + 4 - arg2.field18 / 2, 83 - var9 - arg2.field19 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZIIII)V")
	public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		SYVEZPUN var10 = null;
		for (SYVEZPUN var11 = (SYVEZPUN) field291.method206(); var11 != null; var11 = (SYVEZPUN) field291.method208()) {
			if (var11.field1112 == arg3 && var11.field1114 == arg6 && var11.field1115 == arg2 && var11.field1113 == arg0) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new SYVEZPUN();
			var10.field1112 = arg3;
			var10.field1113 = arg0;
			var10.field1114 = arg6;
			var10.field1115 = arg2;
			method94(var10);
			field291.method203(var10);
		}

		var10.field1116 = arg1;
		var10.field1118 = arg5;
		var10.field1117 = arg4;
		var10.field1119 = arg8;
		var10.field1111 = arg7;
	}

	@ObfuscatedName("client.M(I)V")
	public final void method151() {
		method119();

		if (field534 == 1) {
			field151[field533 / 100].method9(field531 - 8 - 4, field532 - 8 - 4);
		}

		if (field534 == 2) {
			field151[field533 / 100 + 4].method9(field531 - 8 - 4, field532 - 8 - 4);
			field411++;
			if (field411 > 193) {
				field411 = 0;
				field449.method377(25);
				field449.method382(0);
			}
		}

		if (field281 != -1) {
			method165(field294, field281);
			method143(0, IGMZHLWJ.method215(field281), 0, 0);
		}

		if (field383 != -1) {
			method165(field294, field383);
			method143(0, IGMZHLWJ.method215(field383), 0, 0);
		}

		method38();

		if (!field450) {
			method127();
			method113();
		} else if (field204 == 0) {
			method86();
		}

		if (field216 == 1) {
			field332.method9(472, 296);
		}

		if (field487) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field802 < 30 && field463) {
				var3 = 0xFF0000;
			}

			if (field802 < 20 && !field463) {
				var3 = 0xFF0000;
			}

			field184.method178("Fps:" + field802, var3, var1, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field463) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field463) {
				int var8 = 0xFF0000;
			}

			field184.method178("Mem:" + var5 + "k", 0xFFFF00, var1, var2);
			var2 += 15;
		}

		if (field166 != 0) {
			int var9 = field166 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field184.method183(4, 0xFFFF00, 329, "System update in: " + var10 + ":0" + var9);
			} else {
				field184.method183(4, 0xFFFF00, 329, "System update in: " + var10 + ":" + var9);
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method152() {
		if (field463 && field396 == 2 && XAALPTAR.field1302 != field319) {
			method68(null, "Loading - please wait.");
			field396 = 1;
			field351 = System.currentTimeMillis();
		}

		if (field396 == 1) {
			int var1 = method153();
			if (var1 != 0 && System.currentTimeMillis() - field351 > 360000L) {
				signlink.reporterror(field491 + " glcfb " + field303 + "," + var1 + "," + field463 + "," + field333[0] + "," + field509.method367() + "," + field319 + "," + field469 + "," + field470);
				field351 = System.currentTimeMillis();
			}
		}

		if (field396 == 2 && field378 != field319) {
			field378 = field319;
			method50(field319);
		}
	}

	@ObfuscatedName("client.k(B)I")
	public final int method153() {
		for (int var1 = 0; var1 < field514.length; var1++) {
			if (field514[var1] == null && field118[var1] != -1) {
				return -1;
			}

			if (field356[var1] == null && field119[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field514.length; var3++) {
			byte[] var4 = field356[var3];
			if (var4 != null) {
				int var5 = (field117[var3] >> 8) * 64 - field505;
				int var6 = (field117[var3] & 0xFF) * 64 - field506;
				if (field302) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= XAALPTAR.method499(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field367) {
			return -4;
		} else {
			field396 = 2;
			XAALPTAR.field1302 = field319;
			method37();
			field449.method377(194);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IILIGMZHLWJ;)I")
	public final int method154(int arg0, IGMZHLWJ arg1) {
		if (arg1.field730 == null || arg0 >= arg1.field730.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field730[arg0];
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
					var8 = field165[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field143[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field316[var3[var5++]];
				}

				if (var7 == 4) {
					IGMZHLWJ var10 = IGMZHLWJ.method215(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < RXDLPXNX.field1077 && (!RXDLPXNX.method433(var11).field1050 || field462)) {
						for (int var12 = 0; var12 < var10.field686.length; var12++) {
							if (var11 + 1 == var10.field686[var12]) {
								var8 += var10.field699[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field194[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field439[field143[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field194[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field311.field875;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < AYCGKLZG.field68; var13++) {
						if (AYCGKLZG.field70[var13]) {
							var8 += field143[var13];
						}
					}
				}

				if (var7 == 10) {
					IGMZHLWJ var14 = IGMZHLWJ.method215(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < RXDLPXNX.field1077 && (!RXDLPXNX.method433(var15).field1050 || field462)) {
						for (int var16 = 0; var16 < var14.field686.length; var16++) {
							if (var14.field686[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field525;
				}

				if (var7 == 12) {
					var8 = field223;
				}

				if (var7 == 13) {
					int var17 = field194[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					JFFNRVFW var20 = JFFNRVFW.field779[var19];
					int var21 = var20.field781;
					int var22 = var20.field782;
					int var23 = var20.field783;
					int var24 = field325[var23 - var22];
					var8 = field194[var21] >> var22 & var24;
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
					var8 = (field311.field1455 >> 7) + field505;
				}

				if (var7 == 19) {
					var8 = (field311.field1456 >> 7) + field506;
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

	@ObfuscatedName("client.a(ILOJMMOVXV;)V")
	public final void method155(OJMMOVXV arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field434.length; var3++) {
			field434[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field434[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field435[var9] = (field434[var9 - 1] + field434[var9 + 1] + field434[var9 - 128] + field434[var9 + 128]) / 4;
				}
			}

			int[] var10 = field434;
			field434 = field435;
			field435 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field912; var12++) {
				for (int var13 = 0; var13 < arg0.field911; var13++) {
					if (arg0.field909[var11++] != 0) {
						int var14 = var13 + arg0.field913 + 16;
						int var15 = var12 + arg0.field914 + 16;
						int var16 = (var15 << 7) + var14;
						field434[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILIGMZHLWJ;)Z")
	public final boolean method156(IGMZHLWJ arg0) {
		if (arg0.field708 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field708.length; var2++) {
			int var3 = method154(var2, arg0);
			int var4 = arg0.field676[var2];
			if (arg0.field708[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field708[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field708[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method157() {
		int var1 = 5;
		field282[8] = 0;
		int var2 = 0;
		while (field282[8] == 0) {
			String var3 = "Unknown problem";
			method146(20, "Connecting to web server");

			try {
				DataInputStream var4 = method29("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 360);
				RSWRPCHR var5 = new RSWRPCHR(new byte[40]);
				var4.readFully(var5.field1037, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field282[var6] = var5.method393();
				}

				int var7 = var5.method393();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field282[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field282[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field282[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field282[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field282[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field282[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method146(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method146(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field202 = !field202;
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method158() {
		field441 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field246[var1] = -1;
			for (int var2 = 0; var2 < MIIGCDHS.field849; var2++) {
				if (!MIIGCDHS.field850[var2].field856 && MIIGCDHS.field850[var2].field851 == var1 + (field443 ? 0 : 7)) {
					field246[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method159() {
		if (field820 == 1) {
			if (field821 >= 6 && field821 <= 106 && field822 >= 467 && field822 <= 499) {
				field339 = (field339 + 1) % 4;
				field520 = true;
				field251 = true;
				field449.method377(19);
				field449.method378(field339);
				field449.method378(field160);
				field449.method378(field239);
			}

			if (field821 >= 135 && field821 <= 235 && field822 >= 467 && field822 <= 499) {
				field160 = (field160 + 1) % 3;
				field520 = true;
				field251 = true;
				field449.method377(19);
				field449.method378(field339);
				field449.method378(field160);
				field449.method378(field239);
			}

			if (field821 >= 273 && field821 <= 373 && field822 >= 467 && field822 <= 499) {
				field239 = (field239 + 1) % 3;
				field520 = true;
				field251 = true;
				field449.method377(19);
				field449.method378(field339);
				field449.method378(field160);
				field449.method378(field239);
			}

			if (field821 >= 412 && field821 <= 512 && field822 >= 467 && field822 <= 499) {
				if (field383 == -1) {
					method145();
					field403 = "";
					field352 = false;
					field133 = field383 = IGMZHLWJ.field741;
					return;
				}

				method40("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ZZ)V")
	public final void method160(boolean arg0) {
		method115();
		field170.method351();
		field437.method320(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field524 == 0) {
			int var4 = var3 / 2 + 80;
			field183.method180(true, 0x75A9A9, field509.field968, var4, var2 / 2);
			int var5 = var3 / 2 - 20;
			field185.method180(true, 0xFFFF00, "Welcome to RuneScape", var5, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field438.method320(var6 - 73, var7 - 20);
			field185.method180(true, 0xFFFFFF, "New User", var7 + 5, var6);
			int var8 = var2 / 2 + 80;
			field438.method320(var8 - 73, var7 - 20);
			field185.method180(true, 0xFFFFFF, "Existing User", var7 + 5, var8);
		}

		if (field524 == 2) {
			int var9 = var3 / 2 - 40;
			if (field422.length() > 0) {
				field185.method180(true, 0xFFFF00, field422, var9 - 15, var2 / 2);
				field185.method180(true, 0xFFFF00, field423, var9, var2 / 2);
				var9 += 30;
			} else {
				field185.method180(true, 0xFFFF00, field423, var9 - 7, var2 / 2);
				var9 += 30;
			}

			field185.method187(var2 / 2 - 90, "Username: " + field491 + (field374 == 0 & field353 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, true, var9);
			var9 += 15;
			field185.method187(var2 / 2 - 88, "Password: " + DCKSLYWK.method173(field492) + (field374 == 1 & field353 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, true, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field438.method320(var10 - 73, var11 - 20);
				field185.method180(true, 0xFFFFFF, "Login", var11 + 5, var10);
				int var12 = var2 / 2 + 80;
				field438.method320(var12 - 73, var11 - 20);
				field185.method180(true, 0xFFFFFF, "Cancel", var11 + 5, var12);
			}
		}

		if (field524 == 3) {
			field185.method180(true, 0xFFFF00, "Create a free account", var3 / 2 - 60, var2 / 2);
			int var13 = var3 / 2 - 35;
			field185.method180(true, 0xFFFFFF, "To create a new account you need to", var13, var2 / 2);
			var13 += 15;
			field185.method180(true, 0xFFFFFF, "go back to the main RuneScape webpage", var13, var2 / 2);
			var13 += 15;
			field185.method180(true, 0xFFFFFF, "and choose the 'create account'", var13, var2 / 2);
			var13 += 15;
			field185.method180(true, 0xFFFFFF, "button near the top of that page.", var13, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field438.method320(var14 - 73, var15 - 20);
			field185.method180(true, 0xFFFFFF, "Cancel", var15 + 5, var14);
		}

		field170.method352(202, 171, field806);

		if (field213) {
			field213 = false;
			field168.method352(128, 0, field806);
			field169.method352(202, 371, field806);
			field173.method352(0, 265, field806);
			field174.method352(562, 265, field806);
			field175.method352(128, 171, field806);
			field176.method352(562, 171, field806);
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method161() {
		if (field429 != 0) {
			int var1 = 0;
			if (field166 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field226[var2] != null) {
					int var3 = field224[var2];
					String var4 = field225[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field160 == 0 || field160 == 1 && method126(var4))) {
						int var8 = 329 - var1 * 13;
						if (field814 > 4 && field815 - 4 > var8 - 10 && field815 - 4 <= var8 + 3) {
							int var9 = field184.method181("From:  " + var4 + field226[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field814 < var9 + 4) {
								if (field522 >= 1) {
									field198[field102] = "Report abuse @whi@" + var4;
									field249[field102] = 2505;
									field102++;
								}

								field198[field102] = "Add ignore @whi@" + var4;
								field249[field102] = 2362;
								field102++;
								field198[field102] = "Add friend @whi@" + var4;
								field249[field102] = 2954;
								field102++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field160 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 360);

			if (arg0.length == 5) {
				field460 = Integer.parseInt(arg0[0]);
				field461 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method55();
				} else if (arg0[2].equals("highmem")) {
					method80();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field462 = false;
				} else if (arg0[3].equals("members")) {
					field462 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method295(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method162(int arg0) {
		if (!field463) {
			for (int var2 = 0; var2 < field125.length; var2++) {
				int var3 = field125[var2];
				if (XGNGXTLX.field1340[var3] >= arg0) {
					OJMMOVXV var4 = XGNGXTLX.field1334[var3];
					int var5 = var4.field912 * var4.field911 - 1;
					int var6 = field294 * var4.field911 * 2;
					byte[] var7 = var4.field909;
					byte[] var8 = field147;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field909 = var8;
					field147 = var7;
					XGNGXTLX.method521(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.P(I)Z")
	public final boolean method163() {
		if (field110 == null) {
			return false;
		}

		try {
			int var1 = field110.method324();
			if (var1 == 0) {
				return false;
			}

			if (field407 == -1) {
				field110.method325(field300.field1037, 0, 1);
				field407 = field300.field1037[0] & 0xFF;
				if (field432 != null) {
					field407 = field407 - field432.method312() & 0xFF;
				}

				field406 = HTTYKHQR.field669[field407];
				var1--;
			}

			if (field406 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field110.method325(field300.field1037, 0, 1);
				field406 = field300.field1037[0] & 0xFF;
				var1--;
			}

			if (field406 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field110.method325(field300.field1037, 0, 2);
				field300.field1038 = 0;
				field406 = field300.method390();
				var1 -= 2;
			}

			if (var1 < field406) {
				return false;
			}

			field300.field1038 = 0;
			field110.method325(field300.field1037, 0, field406);
			field408 = 0;
			field474 = field473;
			field473 = field472;
			field472 = field407;

			if (field407 != 65 && field407 != 189 && field407 != 238 && field407 != 155 && field407 != 48 && field407 != 237 && field407 != 245 && field407 != 179 && field407 != 169 && field407 != 165 && field407 != 215) {
				if (field407 == 130) {
					if (field521 != -1) {
						method21(field521);
						field521 = -1;
						field364 = true;
						field417 = true;
					}

					if (field379 != -1) {
						method21(field379);
						field379 = -1;
						field251 = true;
					}

					if (field262 != -1) {
						method21(field262);
						field262 = -1;
						field213 = true;
					}

					if (field191 != -1) {
						method21(field191);
						field191 = -1;
					}

					if (field383 != -1) {
						method21(field383);
						field383 = -1;
					}

					if (field424 != 0) {
						field424 = 0;
						field251 = true;
					}

					field235 = false;
					field407 = -1;
					return true;
				}

				if (field407 == 255) {
					field385 = field300.method408();
					field384 = field300.method388();

					while (field300.field1038 < field406) {
						int var2 = field300.method388();
						method122(var2, field300);
					}

					field407 = -1;
					return true;
				}

				if (field407 == 173) {
					int var3 = field300.method416();
					int var4 = field300.method390();
					IGMZHLWJ.method215(var3).field743 = 1;
					IGMZHLWJ.method215(var3).field744 = var4;
					field407 = -1;
					return true;
				}

				if (field407 == 11) {
					int var5 = field300.method414();
					int var6 = field300.method390();
					IGMZHLWJ.method215(var6).field743 = 2;
					IGMZHLWJ.method215(var6).field744 = var5;
					field407 = -1;
					return true;
				}

				if (field407 != 141) {
					if (field407 == 223) {
						field381 = field300.method406();
						field350 = field300.method414();
						field407 = -1;
						return true;
					}

					if (field407 == 114) {
						field364 = true;
						int var8 = field300.method390();
						IGMZHLWJ var9 = IGMZHLWJ.method215(var8);
						while (field300.field1038 < field406) {
							int var10 = field300.method402();
							int var11 = field300.method390();
							int var12 = field300.method388();
							if (var12 == 255) {
								var12 = field300.method393();
							}

							if (var10 >= 0 && var10 < var9.field686.length) {
								var9.field686[var10] = var11;
								var9.field699[var10] = var12;
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 185) {
						for (int var13 = 0; var13 < field344.length; var13++) {
							if (field344[var13] != null) {
								field344[var13].field1496 = -1;
							}
						}

						for (int var14 = 0; var14 < field243.length; var14++) {
							if (field243[var14] != null) {
								field243[var14].field1496 = -1;
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 24) {
						field220 = true;
						field137 = field300.method388();
						field138 = field300.method388();
						field139 = field300.method390();
						field140 = field300.method388();
						field141 = field300.method388();
						if (field141 >= 100) {
							field493 = field137 * 128 + 64;
							field495 = field138 * 128 + 64;
							field494 = method22(field493, field319, field495) - field139;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 242) {
						if (field382 == 12) {
							field364 = true;
						}

						field223 = field300.method391();
						field407 = -1;
						return true;
					}

					if (field407 == 137) {
						int var15 = field300.method414();
						if (var15 == 0xFFFF) {
							var15 = -1;
						}

						if (field340 != var15 && field471 && !field463 && field146 == 0) {
							field163 = var15;
							field164 = true;
							field509.method370(2, field163);
						}

						field340 = var15;
						field407 = -1;
						return true;
					}

					if (field407 == 208) {
						int var16 = field300.method420();
						int var17 = field300.method390();
						if (field471 && !field463) {
							field163 = var17;
							field164 = false;
							field509.method370(2, field163);
							field146 = var16;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 204) {
						int var18 = field300.method416();
						int var19 = field300.method388();

						if (var18 == 0xFFFF) {
							var18 = -1;
						}

						if (field326[var19] != var18) {
							method21(field326[var19]);
							field326[var19] = var18;
						}

						field364 = true;
						field417 = true;
						field407 = -1;
						return true;
					}

					if (field407 == 254) {
						String var20 = field300.method395();
						if (var20.endsWith(":tradereq:")) {
							String var21 = var20.substring(0, var20.indexOf(":"));
							long var22 = DCKSLYWK.method168(var21);
							boolean var24 = false;
							for (int var25 = 0; var25 < field228; var25++) {
								if (field515[var25] == var22) {
									var24 = true;
									break;
								}
							}

							if (!var24 && field365 == 0) {
								method40(var21, 4, "wishes to trade with you.");
							}
						} else if (var20.endsWith(":duelreq:")) {
							String var26 = var20.substring(0, var20.indexOf(":"));
							long var27 = DCKSLYWK.method168(var26);
							boolean var29 = false;
							for (int var30 = 0; var30 < field228; var30++) {
								if (field515[var30] == var27) {
									var29 = true;
									break;
								}
							}

							if (!var29 && field365 == 0) {
								method40(var26, 8, "wishes to duel with you.");
							}
						} else if (var20.endsWith(":chalreq:")) {
							String var31 = var20.substring(0, var20.indexOf(":"));
							long var32 = DCKSLYWK.method168(var31);
							boolean var34 = false;
							for (int var35 = 0; var35 < field228; var35++) {
								if (field515[var35] == var32) {
									var34 = true;
									break;
								}
							}

							if (!var34 && field365 == 0) {
								String var36 = var20.substring(var20.indexOf(":") + 1, var20.length() - 9);
								method40(var31, 8, var36);
							}
						} else {
							method40("", 0, var20);
						}

						field407 = -1;
						return true;
					}

					if (field407 == 53) {
						field166 = field300.method415() * 30;
						field407 = -1;
						return true;
					}

					if (field407 == 86) {
						method104(field300, field406);
						field407 = -1;
						return true;
					}

					if (field407 == 196) {
						int var37 = field300.method414();
						int var38 = field300.method415();
						int var39 = field300.method415();
						int var40 = field300.method416();
						IGMZHLWJ.method215(var40).field702 = var39;
						IGMZHLWJ.method215(var40).field703 = var38;
						IGMZHLWJ.method215(var40).field701 = var37;
						field407 = -1;
						return true;
					}

					if (field407 == 181) {
						int var41 = field300.method417();
						if (var41 >= 0) {
							method114(var41);
						}

						if (field281 != var41) {
							method21(field281);
							field281 = var41;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 56) {
						int var42 = field300.method390();
						int var43 = field300.method388();
						int var44 = field300.method390();
						if (var44 == 0xFFFF) {
							if (field377 < 50) {
								field157[field377] = (short) var42;
								field270[field377] = var43;
								field338[field377] = 0;
								field377++;
							}
						} else if (field200 && !field463 && field377 < 50) {
							field157[field377] = var42;
							field270[field377] = var43;
							field338[field377] = OOQAHIET.field935[var42] + var44;
							field377++;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 190) {
						field373 = field300.method388();
						field407 = -1;
						return true;
					}

					if (field407 == 180) {
						field364 = true;
						int var45 = field300.method408();
						int var46 = field300.method423();
						int var47 = field300.method408();
						field316[var45] = var46;
						field165[var45] = var47;
						field143[var45] = 1;
						for (int var48 = 0; var48 < 98; var48++) {
							if (var46 >= field439[var48]) {
								field143[var45] = var48 + 2;
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 222) {
						int var49 = field300.method388();
						int var50 = field300.method388();
						int var51 = field300.method388();
						int var52 = field300.method388();
						field517[var49] = true;
						field227[var49] = var50;
						field400[var49] = var51;
						field427[var49] = var52;
						field370[var49] = 0;
						field407 = -1;
						return true;
					}

					if (field407 == 16 || field407 == 101) {
						int var53 = field469;
						int var54 = field470;
						if (field407 == 16) {
							var54 = field300.method390();
							var53 = field300.method416();
							field302 = false;
						}

						if (field407 == 101) {
							field300.method398();

							for (int var55 = 0; var55 < 4; var55++) {
								for (int var56 = 0; var56 < 13; var56++) {
									for (int var57 = 0; var57 < 13; var57++) {
										int var58 = field300.method399(1);
										if (var58 == 1) {
											field263[var55][var56][var57] = field300.method399(26);
										} else {
											field263[var55][var56][var57] = -1;
										}
									}
								}
							}

							field300.method400();
							var53 = field300.method414();
							var54 = field300.method414();
							field302 = true;
						}

						if (field469 == var53 && field470 == var54 && field396 == 2) {
							field407 = -1;
							return true;
						}

						field469 = var53;
						field470 = var54;
						field505 = (field469 - 6) * 8;
						field506 = (field470 - 6) * 8;
						field130 = false;
						if ((field469 / 8 == 48 || field469 / 8 == 49) && field470 / 8 == 48) {
							field130 = true;
						}

						if (field469 / 8 == 48 && field470 / 8 == 148) {
							field130 = true;
						}

						field396 = 1;
						field351 = System.currentTimeMillis();
						method68(null, "Loading - please wait.");

						if (field407 == 16) {
							int var59 = 0;
							for (int var60 = (field469 - 6) / 8; var60 <= (field469 + 6) / 8; var60++) {
								for (int var61 = (field470 - 6) / 8; var61 <= (field470 + 6) / 8; var61++) {
									var59++;
								}
							}

							field514 = new byte[var59][];
							field356 = new byte[var59][];
							field117 = new int[var59];
							field118 = new int[var59];
							field119 = new int[var59];
							int var62 = 0;
							for (int var63 = (field469 - 6) / 8; var63 <= (field469 + 6) / 8; var63++) {
								for (int var64 = (field470 - 6) / 8; var64 <= (field470 + 6) / 8; var64++) {
									field117[var62] = (var63 << 8) + var64;

									if (field130 && (var64 == 49 || var64 == 149 || var64 == 147 || var63 == 50 || var63 == 49 && var64 == 47)) {
										field118[var62] = -1;
										field119[var62] = -1;
										var62++;
									} else {
										int var65 = field118[var62] = field509.method365(var63, 0, var64);
										if (var65 != -1) {
											field509.method370(3, var65);
										}

										int var66 = field119[var62] = field509.method365(var63, 1, var64);
										if (var66 != -1) {
											field509.method370(3, var66);
										}

										var62++;
									}
								}
							}
						}

						if (field407 == 101) {
							int var67 = 0;
							int[] var68 = new int[676];
							for (int var69 = 0; var69 < 4; var69++) {
								for (int var70 = 0; var70 < 13; var70++) {
									for (int var71 = 0; var71 < 13; var71++) {
										int var72 = field263[var69][var70][var71];
										if (var72 != -1) {
											int var73 = var72 >> 14 & 0x3FF;
											int var74 = var72 >> 3 & 0x7FF;
											int var75 = (var73 / 8 << 8) + var74 / 8;
											for (int var76 = 0; var76 < var67; var76++) {
												if (var68[var76] == var75) {
													var75 = -1;
													break;
												}
											}

											if (var75 != -1) {
												var68[var67++] = var75;
											}
										}
									}
								}
							}

							field514 = new byte[var67][];
							field356 = new byte[var67][];
							field117 = new int[var67];
							field118 = new int[var67];
							field119 = new int[var67];
							for (int var77 = 0; var77 < var67; var77++) {
								int var78 = field117[var77] = var68[var77];
								int var79 = var78 >> 8 & 0xFF;
								int var80 = var78 & 0xFF;
								int var81 = field118[var77] = field509.method365(var79, 0, var80);
								if (var81 != -1) {
									field509.method370(3, var81);
								}

								int var82 = field119[var77] = field509.method365(var79, 1, var80);
								if (var82 != -1) {
									field509.method370(3, var82);
								}
							}
						}

						int var83 = field505 - field507;
						int var84 = field506 - field508;
						field507 = field505;
						field508 = field506;

						for (int var85 = 0; var85 < 16384; var85++) {
							ITIWVLHR var86 = field243[var85];
							if (var86 != null) {
								for (int var87 = 0; var87 < 10; var87++) {
									var86.field1475[var87] -= var83;
									var86.field1476[var87] -= var84;
								}

								var86.field1455 -= var83 * 128;
								var86.field1456 -= var84 * 128;
							}
						}

						for (int var88 = 0; var88 < field342; var88++) {
							MVRUIIXW var89 = field344[var88];
							if (var89 != null) {
								for (int var90 = 0; var90 < 10; var90++) {
									var89.field1475[var90] -= var83;
									var89.field1476[var90] -= var84;
								}

								var89.field1455 -= var83 * 128;
								var89.field1456 -= var84 * 128;
							}
						}

						field367 = true;
						byte var91 = 0;
						byte var92 = 104;
						byte var93 = 1;
						if (var83 < 0) {
							var91 = 103;
							var92 = -1;
							var93 = -1;
						}

						byte var94 = 0;
						byte var95 = 104;
						byte var96 = 1;
						if (var84 < 0) {
							var94 = 103;
							var95 = -1;
							var96 = -1;
						}

						for (int var97 = var91; var97 != var92; var97 += var93) {
							for (int var98 = var94; var98 != var95; var98 += var96) {
								int var99 = var83 + var97;
								int var100 = var84 + var98;
								for (int var101 = 0; var101 < 4; var101++) {
									if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
										field516[var101][var97][var98] = field516[var101][var99][var100];
									} else {
										field516[var101][var97][var98] = null;
									}
								}
							}
						}

						for (SYVEZPUN var102 = (SYVEZPUN) field291.method206(); var102 != null; var102 = (SYVEZPUN) field291.method208()) {
							var102.field1114 -= var83;
							var102.field1115 -= var84;
							if (var102.field1114 < 0 || var102.field1115 < 0 || var102.field1114 >= 104 || var102.field1115 >= 104) {
								var102.method20();
							}
						}

						if (field418 != 0) {
							field418 -= var83;
							field419 -= var84;
						}

						field220 = false;
						field407 = -1;
						return true;
					}

					if (field407 == 103) {
						int var103 = field300.method416();
						int var104 = field300.method414();
						method114(var103);

						if (var104 != -1) {
							method114(var104);
						}

						if (field383 != -1) {
							method21(field383);
							field383 = -1;
						}

						if (field521 != -1) {
							method21(field521);
							field521 = -1;
						}

						if (field379 != -1) {
							method21(field379);
							field379 = -1;
						}

						if (field262 != var103) {
							method21(field262);
							field262 = var103;
						}

						if (field191 != var103) {
							method21(field191);
							field191 = var104;
						}

						field424 = 0;
						field235 = false;
						field407 = -1;
						return true;
					}

					if (field407 == 142) {
						int var105 = field300.method414();
						method114(var105);

						if (field521 != -1) {
							method21(field521);
							field521 = -1;
							field364 = true;
							field417 = true;
						}

						if (field379 != -1) {
							method21(field379);
							field379 = -1;
							field251 = true;
						}

						if (field262 != -1) {
							method21(field262);
							field262 = -1;
							field213 = true;
						}

						if (field191 != -1) {
							method21(field191);
							field191 = -1;
						}

						if (field383 != var105) {
							method21(field383);
							field383 = var105;
						}

						if (field424 != 0) {
							field424 = 0;
							field251 = true;
						}

						field235 = false;
						field407 = -1;
						return true;
					}

					if (field407 == 252) {
						int var106 = field300.method419();
						if (field538 != var106) {
							method21(field538);
							field538 = var106;
						}

						field251 = true;
						field407 = -1;
						return true;
					}

					if (field407 == 55) {
						field237 = field300.method390();
						field300.method388();
						field293 = field300.method424();
						field425 = field300.method390();
						field300.method414();
						field300.method390();
						field315 = field300.method414();
						field107 = field300.method415();
						field300.method390();
						field192 = field300.method414();
						field458 = field300.method416();
						signlink.dnslookup(DCKSLYWK.method171(field293));
						field407 = -1;
						return true;
					}

					if (field407 == 77) {
						int var107 = field300.method415();
						byte var108 = field300.method389();
						field199[var107] = var108;

						if (field194[var107] != var108) {
							field194[var107] = var108;
							method121(var107);
							field364 = true;

							if (field538 != -1) {
								field251 = true;
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 248) {
						field457 = false;
						field424 = 2;
						field442 = "";
						field251 = true;
						field407 = -1;
						return true;
					}

					if (field407 == 160) {
						field382 = field300.method388();
						field364 = true;
						field417 = true;
						field407 = -1;
						return true;
					}

					if (field407 == 123) {
						method67();
						field407 = -1;
						return false;
					}

					if (field407 == 228) {
						int var109 = field300.method390();
						method114(var109);

						if (field379 != -1) {
							method21(field379);
							field379 = -1;
							field251 = true;
						}

						if (field262 != -1) {
							method21(field262);
							field262 = -1;
							field213 = true;
						}

						if (field191 != -1) {
							method21(field191);
							field191 = -1;
						}

						if (field383 != -1) {
							method21(field383);
							field383 = -1;
						}

						if (field521 != var109) {
							method21(field521);
							field521 = var109;
						}

						if (field424 != 0) {
							field424 = 0;
							field251 = true;
						}

						field364 = true;
						field417 = true;
						field235 = false;
						field407 = -1;
						return true;
					}

					if (field407 == 124) {
						int var110 = field300.method414();
						int var111 = field300.method390();
						int var112 = field300.method414();
						IGMZHLWJ.method215(var112).field695 = (var110 << 16) + var111;
						field407 = -1;
						return true;
					}

					if (field407 == 133) {
						int var113 = field300.method416();
						int var114 = field300.method423();
						field199[var113] = var114;

						if (field194[var113] != var114) {
							field194[var113] = var114;
							method121(var113);
							field364 = true;

							if (field538 != -1) {
								field251 = true;
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 186) {
						if (field382 == 12) {
							field364 = true;
						}

						field525 = field300.method388();
						field407 = -1;
						return true;
					}

					if (field407 == 199) {
						field228 = field406 / 8;
						for (int var115 = 0; var115 < field228; var115++) {
							field515[var115] = field300.method394();
						}

						field407 = -1;
						return true;
					}

					if (field407 == 49) {
						long var116 = field300.method394();
						int var118 = field300.method388();
						String var119 = DCKSLYWK.method172(DCKSLYWK.method169(var116));
						for (int var120 = 0; var120 < field398; var120++) {
							if (field290[var120] == var116) {
								if (field511[var120] != var118) {
									field511[var120] = var118;
									field364 = true;

									if (var118 > 0) {
										method40("", 5, var119 + " has logged in.");
									}

									if (var118 == 0) {
										method40("", 5, var119 + " has logged out.");
									}
								}

								var119 = null;
								break;
							}
						}

						if (var119 != null && field398 < 200) {
							field290[field398] = var116;
							field236[field398] = var119;
							field511[field398] = var118;
							field398++;
							field364 = true;
						}

						boolean var121 = false;
						while (!var121) {
							var121 = true;
							for (int var122 = 0; var122 < field398 - 1; var122++) {
								if (field511[var122] != field460 && field511[var122 + 1] == field460 || field511[var122] == 0 && field511[var122 + 1] != 0) {
									int var123 = field511[var122];
									field511[var122] = field511[var122 + 1];
									field511[var122 + 1] = var123;
									String var124 = field236[var122];
									field236[var122] = field236[var122 + 1];
									field236[var122 + 1] = var124;
									long var125 = field290[var122];
									field290[var122] = field290[var122 + 1];
									field290[var122 + 1] = var125;
									field364 = true;
									var121 = false;
								}
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 83) {
						int var127 = field300.method415();
						int var128 = field300.method416();
						int var129 = field300.method416();
						if (var127 == 0xFFFF) {
							IGMZHLWJ.method215(var129).field743 = 0;
							field407 = -1;
							return true;
						}

						RXDLPXNX var130 = RXDLPXNX.method433(var127);
						IGMZHLWJ.method215(var129).field743 = 4;
						IGMZHLWJ.method215(var129).field744 = var127;
						IGMZHLWJ.method215(var129).field702 = var130.field1083;
						IGMZHLWJ.method215(var129).field703 = var130.field1080;
						IGMZHLWJ.method215(var129).field701 = var130.field1074 * 100 / var128;
						field407 = -1;
						return true;
					}

					if (field407 == 73) {
						int var131 = field300.method418();
						int var132 = field300.method390();
						int var133 = field300.method417();
						IGMZHLWJ var134 = IGMZHLWJ.method215(var132);
						var134.field688 = var131;
						var134.field720 = var133;
						field407 = -1;
						return true;
					}

					if (field407 == 52) {
						field541 = field300.method408();
						if (field541 == field382) {
							if (field541 == 3) {
								field382 = 1;
							} else {
								field382 = 3;
							}

							field364 = true;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 231) {
						field339 = field300.method388();
						field160 = field300.method388();
						field239 = field300.method388();
						field520 = true;
						field251 = true;
						field407 = -1;
						return true;
					}

					if (field407 == 195) {
						field154 = field300.method388();
						if (field154 == 1) {
							field314 = field300.method390();
						}

						if (field154 >= 2 && field154 <= 6) {
							if (field154 == 2) {
								field233 = 64;
								field234 = 64;
							}

							if (field154 == 3) {
								field233 = 0;
								field234 = 64;
							}

							if (field154 == 4) {
								field233 = 128;
								field234 = 64;
							}

							if (field154 == 5) {
								field233 = 64;
								field234 = 0;
							}

							if (field154 == 6) {
								field233 = 64;
								field234 = 128;
							}

							field154 = 2;
							field230 = field300.method390();
							field231 = field300.method390();
							field232 = field300.method388();
						}

						if (field154 == 10) {
							field369 = field300.method390();
						}

						field407 = -1;
						return true;
					}

					if (field407 == 92) {
						int var135 = field300.method414();
						IGMZHLWJ var136 = IGMZHLWJ.method215(var135);
						for (int var137 = 0; var137 < var136.field686.length; var137++) {
							var136.field686[var137] = -1;
							var136.field686[var137] = 0;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 115) {
						int var138 = field300.method414();
						int var139 = field300.method416();
						int var140 = var138 >> 10 & 0x1F;
						int var141 = var138 >> 5 & 0x1F;
						int var142 = var138 & 0x1F;
						IGMZHLWJ.method215(var139).field689 = (var142 << 3) + (var140 << 19) + (var141 << 11);
						field407 = -1;
						return true;
					}

					if (field407 == 211) {
						field220 = true;
						field477 = field300.method388();
						field478 = field300.method388();
						field479 = field300.method390();
						field480 = field300.method388();
						field481 = field300.method388();
						if (field481 >= 100) {
							int var143 = field477 * 128 + 64;
							int var144 = field478 * 128 + 64;
							int var145 = method22(var143, field319, var144) - field479;
							int var146 = var143 - field493;
							int var147 = var145 - field494;
							int var148 = var144 - field495;
							int var149 = (int) Math.sqrt(var146 * var146 + var148 * var148);
							field496 = (int) (Math.atan2(var147, var149) * 325.949D) & 0x7FF;
							field497 = (int) (Math.atan2(var146, var148) * -325.949D) & 0x7FF;

							if (field496 < 128) {
								field496 = 128;
							}

							if (field496 > 383) {
								field496 = 383;
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 139) {
						field216 = field300.method388();
						field407 = -1;
						return true;
					}

					if (field407 == 253) {
						field399 = field300.method388();
						field364 = true;
						field407 = -1;
						return true;
					}

					if (field407 == 164) {
						String var150 = field300.method395();
						int var151 = field300.method388();
						int var152 = field300.method406();
						if (var151 >= 1 && var151 <= 5) {
							if (var150.equalsIgnoreCase("null")) {
								var150 = null;
							}

							field430[var151 - 1] = var150;
							field431[var151 - 1] = var152 == 0;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 235) {
						field364 = true;
						int var153 = field300.method390();
						IGMZHLWJ var154 = IGMZHLWJ.method215(var153);
						int var155 = field300.method390();
						for (int var156 = 0; var156 < var155; var156++) {
							int var157 = field300.method406();
							if (var157 == 255) {
								var157 = field300.method422();
							}

							var154.field686[var156] = field300.method390();
							var154.field699[var156] = var157;
						}

						for (int var158 = var155; var158 < var154.field686.length; var158++) {
							var154.field686[var158] = 0;
							var154.field699[var158] = 0;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 75) {
						field385 = field300.method388();
						field384 = field300.method408();
						for (int var159 = field384; var159 < field384 + 8; var159++) {
							for (int var160 = field385; var160 < field385 + 8; var160++) {
								if (field516[field319][var159][var160] != null) {
									field516[field319][var159][var160] = null;
									method82(var159, var160);
								}
							}
						}

						for (SYVEZPUN var161 = (SYVEZPUN) field291.method206(); var161 != null; var161 = (SYVEZPUN) field291.method208()) {
							if (var161.field1114 >= field384 && var161.field1114 < field384 + 8 && var161.field1115 >= field385 && var161.field1115 < field385 + 8 && field319 == var161.field1112) {
								var161.field1111 = 0;
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 224) {
						method26(field406, field300);
						field367 = false;
						field407 = -1;
						return true;
					}

					if (field407 == 221) {
						int var162 = field300.method415();
						IGMZHLWJ.method215(var162).field743 = 3;

						if (field311.field878 == null) {
							IGMZHLWJ.method215(var162).field744 = (field311.field880[11] << 5) + (field311.field880[8] << 10) + (field311.field880[0] << 15) + (field311.field871[0] << 25) + (field311.field871[4] << 20) + field311.field880[1];
						} else {
							IGMZHLWJ.method215(var162).field744 = (int) (field311.field878.field597 + 0x12345678L);
						}

						field407 = -1;
						return true;
					}

					if (field407 == 38) {
						field457 = false;
						field424 = 1;
						field442 = "";
						field251 = true;
						field407 = -1;
						return true;
					}

					if (field407 == 176) {
						for (int var163 = 0; var163 < field194.length; var163++) {
							if (field199[var163] != field194[var163]) {
								field194[var163] = field199[var163];
								method121(var163);
								field364 = true;
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 168) {
						int var164 = field300.method416();
						int var165 = field300.method391();
						IGMZHLWJ var166 = IGMZHLWJ.method215(var164);
						if (var166.field709 != var165 || var165 == -1) {
							var166.field709 = var165;
							var166.field722 = 0;
							var166.field705 = 0;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 104) {
						String var167 = field300.method395();
						int var168 = field300.method414();
						IGMZHLWJ.method215(var168).field687 = var167;

						if (field326[field382] == IGMZHLWJ.method215(var168).field706) {
							field364 = true;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 72) {
						int var169 = field300.method415();
						method114(var169);

						if (field521 != -1) {
							method21(field521);
							field521 = -1;
							field364 = true;
							field417 = true;
						}

						if (field262 != -1) {
							method21(field262);
							field262 = -1;
							field213 = true;
						}

						if (field191 != -1) {
							method21(field191);
							field191 = -1;
						}

						if (field383 != -1) {
							method21(field383);
							field383 = -1;
						}

						if (field379 != var169) {
							method21(field379);
							field379 = var169;
						}

						field235 = false;
						field251 = true;
						field407 = -1;
						return true;
					}

					if (field407 == 152) {
						int var170 = field300.method415();
						boolean var171 = field300.method388() == 1;
						IGMZHLWJ.method215(var170).field704 = var171;
						field407 = -1;
						return true;
					}

					if (field407 == 17) {
						field384 = field300.method408();
						field385 = field300.method408();
						field407 = -1;
						return true;
					}

					if (field407 == 125) {
						int var172 = field300.method414();
						int var173 = field300.method415();

						if (field379 != -1) {
							method21(field379);
							field379 = -1;
							field251 = true;
						}

						if (field262 != -1) {
							method21(field262);
							field262 = -1;
							field213 = true;
						}

						if (field191 != -1) {
							method21(field191);
							field191 = -1;
						}

						if (field383 != var173) {
							method21(field383);
							field383 = var173;
						}

						if (field521 != var172) {
							method21(field521);
							field521 = var172;
						}

						if (field424 != 0) {
							field424 = 0;
							field251 = true;
						}

						field364 = true;
						field417 = true;
						field235 = false;
						field407 = -1;
						return true;
					}

					if (field407 == 226) {
						int var174 = field300.method390();
						int var175 = field300.method416();
						IGMZHLWJ var176 = IGMZHLWJ.method215(var175);
						if (var176 != null && var176.field739 == 0) {
							if (var174 < 0) {
								var174 = 0;
							}

							if (var174 > var176.field674 - var176.field724) {
								var174 = var176.field674 - var176.field724;
							}

							var176.field736 = var174;
						}

						field407 = -1;
						return true;
					}

					if (field407 == 134) {
						long var177 = field300.method394();
						int var179 = field300.method393();
						int var180 = field300.method388();
						boolean var181 = false;
						for (int var182 = 0; var182 < 100; var182++) {
							if (field128[var182] == var179) {
								var181 = true;
								break;
							}
						}

						if (var180 <= 1) {
							for (int var183 = 0; var183 < field228; var183++) {
								if (field515[var183] == var177) {
									var181 = true;
									break;
								}
							}
						}

						if (!var181 && field365 == 0) {
							try {
								field128[field380] = var179;
								field380 = (field380 + 1) % 100;
								String var184 = BOHPYYUF.method17(field300, field406 - 13);
								if (var180 != 3) {
									var184 = IXPHWLUO.method240(var184);
								}

								if (var180 == 2 || var180 == 3) {
									method40("@cr2@" + DCKSLYWK.method172(DCKSLYWK.method169(var177)), 7, var184);
								} else if (var180 == 1) {
									method40("@cr1@" + DCKSLYWK.method172(DCKSLYWK.method169(var177)), 7, var184);
								} else {
									method40(DCKSLYWK.method172(DCKSLYWK.method169(var177)), 3, var184);
								}
							} catch (Exception var189) {
								signlink.reporterror("cde1");
							}
						}

						field407 = -1;
						return true;
					}

					if (field407 == 40) {
						field418 = 0;
						field407 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field407 + "," + field406 + " - " + field473 + "," + field474);
					method67();
					return true;
				}

				field220 = false;

				for (int var7 = 0; var7 < 5; var7++) {
					field517[var7] = false;
				}

				field407 = -1;
				return true;
			}

			method122(field407, field300);
			field407 = -1;
			return true;
		} catch (IOException var190) {
			method95();
		} catch (Exception var191) {
			String var187 = "T2 - " + field407 + "," + field473 + "," + field474 + " - " + field406 + "," + (field311.field1475[0] + field505) + "," + (field311.field1476[0] + field506) + " - ";
			for (int var188 = 0; var188 < field406 && var188 < 50; var188++) {
				var187 = var187 + field300.field1037[var188] + ",";
			}

			signlink.reporterror(var187);
			method67();
		}

		return true;
	}

	@ObfuscatedName("client.a(LRSWRPCHR;ZI)V")
	public final void method164(RSWRPCHR arg0, int arg1) {
		arg0.method398();
		int var3 = arg0.method399(1);
		if (var3 != 0) {
			int var4 = arg0.method399(2);
			if (var4 == 0) {
				field348[field347++] = field343;
			} else if (var4 == 1) {
				int var5 = arg0.method399(3);
				field311.method599(false, var5);
				int var6 = arg0.method399(1);
				if (var6 == 1) {
					field348[field347++] = field343;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method399(3);
				field311.method599(true, var7);
				int var8 = arg0.method399(3);
				field311.method599(true, var8);
				int var9 = arg0.method399(1);
				if (var9 == 1) {
					field348[field347++] = field343;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method399(7);
				field319 = arg0.method399(2);
				int var11 = arg0.method399(1);
				int var12 = arg0.method399(1);
				if (var12 == 1) {
					field348[field347++] = field343;
				}

				int var13 = arg0.method399(7);
				field311.method600(var11 == 1, var10, var13);
			}
		}
	}

	@ObfuscatedName("client.a(IBI)Z")
	public final boolean method165(int arg0, int arg1) {
		boolean var3 = false;
		IGMZHLWJ var4 = IGMZHLWJ.method215(arg1);
		for (int var5 = 0; var5 < var4.field731.length && var4.field731[var5] != -1; var5++) {
			IGMZHLWJ var6 = IGMZHLWJ.method215(var4.field731[var5]);
			if (var6.field739 == 0) {
				var3 |= method165(arg0, var6.field726);
			}

			if (var6.field739 == 6 && (var6.field709 != -1 || var6.field710 != -1)) {
				boolean var7 = method156(var6);
				int var8;
				if (var7) {
					var8 = var6.field710;
				} else {
					var8 = var6.field709;
				}

				if (var8 != -1) {
					LZZHVUJR var9 = LZZHVUJR.field832[var8];
					var6.field705 += arg0;
					while (var6.field705 > var9.method301(var6.field722)) {
						var6.field705 -= var9.method301(var6.field722) + 1;
						var6.field722++;
						if (var6.field722 >= var9.field833) {
							var6.field722 -= var9.field837;
							if (var6.field722 < 0 || var6.field722 >= var9.field833) {
								var6.field722 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field739 == 6 && var6.field695 != 0) {
				int var10 = var6.field695 >> 16;
				int var11 = var6.field695 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field702 = var6.field702 + var10 & 0x7FF;
				var6.field703 = var6.field703 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void method166(String arg0) {
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

	@ObfuscatedName("client.b(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method167(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field422 = "";
				field423 = "Connecting to server...";
				method160(true);
			}

			field110 = new OLIDOILN(this, method111(field461 + 43594));
			long var4 = DCKSLYWK.method168(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field449.field1038 = 0;
			field449.method378(14);
			field449.method378(var6);
			field110.method326(0, 2, field449.field1037);

			for (int var7 = 0; var7 < 8; var7++) {
				field110.method323();
			}

			int var8 = field110.method323();
			int var9 = var8;

			if (var8 == 0) {
				field110.method325(field300.field1037, 0, 8);
				field300.field1038 = 0;
				field303 = field300.method394();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field303 >> 32), (int) field303 };
				field449.field1038 = 0;
				field449.method378(10);
				field449.method382(var10[0]);
				field449.method382(var10[1]);
				field449.method382(var10[2]);
				field449.method382(var10[3]);
				field449.method382(signlink.uid);
				field449.method385(arg0);
				field449.method385(arg1);
				field449.method403(field324, field129);
				field280.field1038 = 0;

				if (arg2) {
					field280.method378(18);
				} else {
					field280.method378(16);
				}

				field280.method378(field449.field1038 + 36 + 1 + 1 + 2);
				field280.method378(255);
				field280.method379(360);
				field280.method378(field463 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field280.method382(field282[var11]);
				}

				field280.method386(field449.field1038, field449.field1037, 0);
				field449.field1042 = new NERZSWTZ(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field432 = new NERZSWTZ(var10);
				field110.method326(0, field280.field1038, field280.field1037);
				var8 = field110.method323();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method167(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field522 = field110.method323();
				field313 = field110.method323() == 1;
				field108 = 0L;
				field468 = 0;
				field222.field889 = 0;
				field811 = true;
				field211 = true;
				field240 = true;
				field449.field1038 = 0;
				field300.field1038 = 0;
				field407 = -1;
				field472 = -1;
				field473 = -1;
				field474 = -1;
				field406 = 0;
				field408 = 0;
				field166 = 0;
				field410 = 0;
				field154 = 0;
				field102 = 0;
				field450 = false;
				field812 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field226[var13] = null;
				}

				field359 = 0;
				field334 = 0;
				field396 = 0;
				field377 = 0;
				field535 = (int) (Math.random() * 100.0D) - 50;
				field375 = (int) (Math.random() * 110.0D) - 55;
				field489 = (int) (Math.random() * 80.0D) - 40;
				field149 = (int) (Math.random() * 120.0D) - 60;
				field413 = (int) (Math.random() * 30.0D) - 20;
				field297 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field373 = 0;
				field378 = -1;
				field418 = 0;
				field419 = 0;
				field345 = 0;
				field244 = 0;

				for (int var14 = 0; var14 < field342; var14++) {
					field344[var14] = null;
					field349[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field243[var15] = null;
				}

				field311 = field344[field343] = new MVRUIIXW();
				field306.method210();
				field428.method210();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field516[var16][var17][var18] = null;
						}
					}
				}

				field291 = new EZXKBAZY();
				field399 = 0;
				field398 = 0;
				method21(field538);
				field538 = -1;
				method21(field379);
				field379 = -1;
				method21(field383);
				field383 = -1;
				method21(field262);
				field262 = -1;
				method21(field191);
				field191 = -1;
				method21(field521);
				field521 = -1;
				method21(field281);
				field281 = -1;
				field235 = false;
				field382 = 3;
				field424 = 0;
				field450 = false;
				field457 = false;
				field158 = null;
				field216 = 0;
				field541 = -1;
				field443 = true;
				method158();

				for (int var19 = 0; var19 < 5; var19++) {
					field116[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field430[var20] = null;
					field431[var20] = false;
				}

				field283 = 0;
				field162 = 0;
				field132 = 0;
				field304 = 0;
				field426 = 0;
				field124 = 0;
				method131();
			} else if (var8 == 3) {
				field422 = "";
				field423 = "Invalid username or password.";
			} else if (var8 == 4) {
				field422 = "Your account has been disabled.";
				field423 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field422 = "Your account is already logged in.";
				field423 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field422 = "RuneScape has been updated!";
				field423 = "Please reload this page.";
			} else if (var8 == 7) {
				field422 = "This world is full.";
				field423 = "Please use a different world.";
			} else if (var8 == 8) {
				field422 = "Unable to connect.";
				field423 = "Login server offline.";
			} else if (var8 == 9) {
				field422 = "Login limit exceeded.";
				field423 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field422 = "Unable to connect.";
				field423 = "Bad session id.";
			} else if (var8 == 11) {
				field422 = "Login server rejected session.";
				field423 = "Please try again.";
			} else if (var8 == 12) {
				field422 = "You need a members account to login to this world.";
				field423 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field422 = "Could not complete login.";
				field423 = "Please try using a different world.";
			} else if (var8 == 14) {
				field422 = "The server is being updated.";
				field423 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field240 = true;
				field449.field1038 = 0;
				field300.field1038 = 0;
				field407 = -1;
				field472 = -1;
				field473 = -1;
				field474 = -1;
				field406 = 0;
				field408 = 0;
				field166 = 0;
				field102 = 0;
				field450 = false;
				field351 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field422 = "Login attempts exceeded.";
				field423 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field422 = "You are standing in a members-only area.";
				field423 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field422 = "Invalid loginserver requested";
				field423 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field110.method323();
				for (var21 += 3; var21 >= 0; var21--) {
					field422 = "You have only just left another world";
					field423 = "Your profile will be transferred in: " + var21;
					method160(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method167(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field422 = "Malformed login packet.";
				field423 = "Please try again.";
			} else if (var8 == 23) {
				field422 = "This computers address has been blocked";
				field423 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field422 = "Unexpected server response";
				field423 = "Please try using a different world.";
			} else if (var9 != 0) {
				field422 = "No response from server";
				field423 = "Please try using a different world.";
			} else if (field203 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field203++;
				method167(arg0, arg1, arg2);
			} else {
				field422 = "No response from loginserver";
				field423 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field422 = "";
			field423 = "Error connecting to server.";
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field325[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field439[var3] = var2 / 4;
		}
	}
}
