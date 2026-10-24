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
public final class client extends GRXJFORE {

	@ObfuscatedName("client.L")
	public int[] field64 = new int[50];

	@ObfuscatedName("client.O")
	public int field67 = 1;

	@ObfuscatedName("client.Q")
	public boolean field69 = true;

	@ObfuscatedName("client.R")
	public boolean field70 = false;

	@ObfuscatedName("client.U")
	public QQMJEFXK field73 = new QQMJEFXK();

	@ObfuscatedName("client.X")
	public WSNKRVXZ[] field75 = new WSNKRVXZ[32];

	@ObfuscatedName("client.Y")
	public boolean field76 = false;

	@ObfuscatedName("client.eb")
	public String field82 = "";

	@ObfuscatedName("client.ib")
	public int[] field85 = new int[1000];

	@ObfuscatedName("client.kb")
	public final int field86 = 100;

	@ObfuscatedName("client.lb")
	public int[] field87 = new int[100];

	@ObfuscatedName("client.zb")
	public int field98 = -1;

	@ObfuscatedName("client.Bb")
	public String field100 = "";

	@ObfuscatedName("client.Cb")
	public int field101 = -1;

	@ObfuscatedName("client.Fb")
	public WNCFPLWV field104 = WNCFPLWV.method490(1);

	@ObfuscatedName("client.Hb")
	public boolean field106 = false;

	@ObfuscatedName("client.Tb")
	public int field118 = -1;

	@ObfuscatedName("client.Vb")
	public int field120 = 2;

	@ObfuscatedName("client.Wb")
	public int field121 = 128;

	@ObfuscatedName("client.ac")
	public int field125 = -1;

	@ObfuscatedName("client.bc")
	public WAPMJSJO field126 = new WAPMJSJO();

	@ObfuscatedName("client.dc")
	public WSNKRVXZ[] field128 = new WSNKRVXZ[32];

	@ObfuscatedName("client.ec")
	public int field129 = 0x766654;

	@ObfuscatedName("client.fc")
	public int[] field130 = new int[7];

	@ObfuscatedName("client.pc")
	public String field139 = "";

	@ObfuscatedName("client.rc")
	public String[] field141 = new String[100];

	@ObfuscatedName("client.sc")
	public int[] field142 = new int[100];

	@ObfuscatedName("client.uc")
	public boolean field144 = false;

	@ObfuscatedName("client.vc")
	public boolean field145 = false;

	@ObfuscatedName("client.wc")
	public int[] field146 = new int[151];

	@ObfuscatedName("client.Jc")
	public boolean field159 = false;

	@ObfuscatedName("client.Mc")
	public boolean field161 = false;

	@ObfuscatedName("client.Sc")
	public boolean field167 = false;

	@ObfuscatedName("client.Uc")
	public boolean field169 = true;

	@ObfuscatedName("client.Vc")
	public int field170 = 78;

	@ObfuscatedName("client.id")
	public WAPMJSJO field183 = new WAPMJSJO();

	@ObfuscatedName("client.kd")
	public boolean field185 = false;

	@ObfuscatedName("client.qd")
	public SSCICQYX[] field191 = new SSCICQYX[2];

	@ObfuscatedName("client.sd")
	public long[] field193 = new long[200];

	@ObfuscatedName("client.vd")
	public int[] field195 = new int[256];

	@ObfuscatedName("client.Ed")
	public int[] field199 = new int[4000];

	@ObfuscatedName("client.Fd")
	public int[] field200 = new int[4000];

	@ObfuscatedName("client.Id")
	public SSCICQYX[] field201 = new SSCICQYX[100];

	@ObfuscatedName("client.Zd")
	public int[] field215 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.de")
	public boolean field219 = false;

	@ObfuscatedName("client.ee")
	public boolean field220 = false;

	@ObfuscatedName("client.fe")
	public long[] field221 = new long[100];

	@ObfuscatedName("client.pe")
	public int[] field229 = new int[5];

	@ObfuscatedName("client.te")
	public int field232 = -1;

	@ObfuscatedName("client.we")
	public int field235 = 2;

	@ObfuscatedName("client.Be")
	public int field237 = 2;

	@ObfuscatedName("client.Je")
	public String field245 = "";

	@ObfuscatedName("client.Ke")
	public String field246 = "";

	@ObfuscatedName("client.Le")
	public int field247 = 2048;

	@ObfuscatedName("client.Me")
	public int field248 = 2047;

	@ObfuscatedName("client.Ne")
	public WQWDCUWR[] field249 = new WQWDCUWR[field247];

	@ObfuscatedName("client.Pe")
	public int[] field251 = new int[field247];

	@ObfuscatedName("client.Re")
	public int[] field253 = new int[field247];

	@ObfuscatedName("client.Se")
	public WNCFPLWV[] field254 = new WNCFPLWV[field247];

	@ObfuscatedName("client.Xe")
	public int[] field259 = new int[1000];

	@ObfuscatedName("client.Ye")
	public int[] field260 = new int[1000];

	@ObfuscatedName("client.af")
	public int[] field261 = new int[5];

	@ObfuscatedName("client.ef")
	public WAPMJSJO field264 = new WAPMJSJO();

	@ObfuscatedName("client.gf")
	public boolean field266 = false;

	@ObfuscatedName("client.kf")
	public boolean field269 = true;

	@ObfuscatedName("client.lf")
	public TUZTEZTO[] field270 = new TUZTEZTO[5];

	@ObfuscatedName("client.mf")
	public WSNKRVXZ[] field271 = new WSNKRVXZ[1000];

	@ObfuscatedName("client.of")
	public String[] field272 = new String[5];

	@ObfuscatedName("client.pf")
	public boolean[] field273 = new boolean[5];

	@ObfuscatedName("client.vf")
	public volatile boolean field278 = false;

	@ObfuscatedName("client.wf")
	public volatile boolean field279 = false;

	@ObfuscatedName("client.yf")
	public int[] field281 = new int[5];

	@ObfuscatedName("client.zf")
	public int field282 = -1;

	@ObfuscatedName("client.Af")
	public int field283 = 0x23201B;

	@ObfuscatedName("client.Df")
	public volatile boolean field286 = false;

	@ObfuscatedName("client.Lf")
	public SSCICQYX[] field293 = new SSCICQYX[13];

	@ObfuscatedName("client.Xf")
	public int field304 = -1;

	@ObfuscatedName("client.bg")
	public int field306 = -1;

	@ObfuscatedName("client.dg")
	public int[] field307 = new int[LDKBVIZQ.field814];

	@ObfuscatedName("client.ig")
	public boolean field312 = false;

	@ObfuscatedName("client.jg")
	public String field313 = "";

	@ObfuscatedName("client.mg")
	public int[] field315 = new int[50];

	@ObfuscatedName("client.og")
	public int field317 = -1;

	@ObfuscatedName("client.pg")
	public int[] field318 = new int[100];

	@ObfuscatedName("client.qg")
	public String[] field319 = new String[100];

	@ObfuscatedName("client.rg")
	public String[] field320 = new String[100];

	@ObfuscatedName("client.tg")
	public boolean field322 = false;

	@ObfuscatedName("client.xg")
	public WSNKRVXZ[] field326 = new WSNKRVXZ[32];

	@ObfuscatedName("client.Eg")
	public WSNKRVXZ[] field333 = new WSNKRVXZ[8];

	@ObfuscatedName("client.Mg")
	public boolean field339 = false;

	@ObfuscatedName("client.Pg")
	public int field342 = 50;

	@ObfuscatedName("client.Qg")
	public int[] field343 = new int[field342];

	@ObfuscatedName("client.Rg")
	public int[] field344 = new int[field342];

	@ObfuscatedName("client.Sg")
	public int[] field345 = new int[field342];

	@ObfuscatedName("client.Tg")
	public int[] field346 = new int[field342];

	@ObfuscatedName("client.Ug")
	public int[] field347 = new int[field342];

	@ObfuscatedName("client.Vg")
	public int[] field348 = new int[field342];

	@ObfuscatedName("client.Wg")
	public int[] field349 = new int[field342];

	@ObfuscatedName("client.Xg")
	public String[] field350 = new String[field342];

	@ObfuscatedName("client.Yg")
	public int[] field351 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.ah")
	public WSNKRVXZ[] field353 = new WSNKRVXZ[20];

	@ObfuscatedName("client.bh")
	public int field354 = -1;

	@ObfuscatedName("client.wh")
	public boolean field374 = false;

	@ObfuscatedName("client.yh")
	public int[][] field376 = new int[104][104];

	@ObfuscatedName("client.Fh")
	public int field380 = 1;

	@ObfuscatedName("client.Gh")
	public byte[] field381 = new byte[16384];

	@ObfuscatedName("client.Ih")
	public String[] field382 = new String[500];

	@ObfuscatedName("client.Qh")
	public int[] field389 = new int[50];

	@ObfuscatedName("client.Rh")
	public String[] field390 = new String[200];

	@ObfuscatedName("client.Th")
	public int field392 = 3;

	@ObfuscatedName("client.Uh")
	public int field393 = -1;

	@ObfuscatedName("client.Wh")
	public boolean field395 = false;

	@ObfuscatedName("client.Xh")
	public int field396 = -1;

	@ObfuscatedName("client.Yh")
	public int field397 = -1;

	@ObfuscatedName("client.Zh")
	public int[] field398 = new int[33];

	@ObfuscatedName("client.ci")
	public boolean field401 = false;

	@ObfuscatedName("client.gi")
	public final int[] field405 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ji")
	public String field408 = "";

	@ObfuscatedName("client.ki")
	public String field409 = "";

	@ObfuscatedName("client.ri")
	public FUVVWALN[] field415 = new FUVVWALN[4];

	@ObfuscatedName("client.si")
	public int[] field416 = new int[200];

	@ObfuscatedName("client.vi")
	public int field417 = -1;

	@ObfuscatedName("client.xi")
	public int[] field419 = new int[151];

	@ObfuscatedName("client.yi")
	public int[] field420 = new int[LDKBVIZQ.field814];

	@ObfuscatedName("client.Ei")
	public boolean field426 = false;

	@ObfuscatedName("client.Gi")
	public WNCFPLWV field427 = WNCFPLWV.method490(1);

	@ObfuscatedName("client.Ii")
	public int[][][] field429 = new int[4][13][13];

	@ObfuscatedName("client.Ji")
	public WNCFPLWV field430 = new WNCFPLWV(new byte[5000]);

	@ObfuscatedName("client.Ki")
	public UGARWYIU[] field431 = new UGARWYIU[16384];

	@ObfuscatedName("client.Mi")
	public int[] field433 = new int[16384];

	@ObfuscatedName("client.Qi")
	public int[] field436 = new int[LDKBVIZQ.field814];

	@ObfuscatedName("client.Si")
	public int[] field438 = new int[9];

	@ObfuscatedName("client.Ui")
	public int[] field440 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Vi")
	public boolean field441 = true;

	@ObfuscatedName("client.Xi")
	public int[] field442 = new int[5];

	@ObfuscatedName("client.Zi")
	public boolean field444 = false;

	@ObfuscatedName("client.hj")
	public WSNKRVXZ[] field452 = new WSNKRVXZ[100];

	@ObfuscatedName("client.mj")
	public boolean field456 = false;

	@ObfuscatedName("client.uj")
	public int[] field463 = new int[500];

	@ObfuscatedName("client.vj")
	public int[] field464 = new int[500];

	@ObfuscatedName("client.wj")
	public int[] field465 = new int[500];

	@ObfuscatedName("client.xj")
	public int[] field466 = new int[500];

	@ObfuscatedName("client.Dj")
	public int field472 = -1;

	@ObfuscatedName("client.Ej")
	public int field473 = -1;

	@ObfuscatedName("client.Fj")
	public int[] field474 = new int[2000];

	@ObfuscatedName("client.Gj")
	public String field475 = "";

	@ObfuscatedName("client.Hj")
	public CRC32 field476 = new CRC32();

	@ObfuscatedName("client.Ij")
	public boolean field477 = true;

	@ObfuscatedName("client.Mj")
	public boolean[] field480 = new boolean[5];

	@ObfuscatedName("client.Qj")
	public int[][] field482 = new int[104][104];

	@ObfuscatedName("client.Sj")
	public int field483 = 0x4D4233;

	@ObfuscatedName("client.Uj")
	public boolean field485 = false;

	@ObfuscatedName("client.Vj")
	public String field486 = "";

	@ObfuscatedName("client.bk")
	public int[] field492 = new int[5];

	@ObfuscatedName("client.dk")
	public WNCFPLWV field493 = WNCFPLWV.method490(1);

	@ObfuscatedName("client.ek")
	public WAPMJSJO[][][] field494 = new WAPMJSJO[4][104][104];

	@ObfuscatedName("client.fk")
	public int[] field495 = new int[2000];

	@ObfuscatedName("client.gk")
	public int field496 = 0x332D25;

	@ObfuscatedName("client.hk")
	public int[][] field497 = new int[104][104];

	@ObfuscatedName("client.ik")
	public int[] field498 = new int[33];

	@ObfuscatedName("client.Ab")
	public static int[] field99 = new int[32];

	@ObfuscatedName("client.Ib")
	public static BigInteger field107 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.gc")
	public static int field131 = 10;

	@ObfuscatedName("client.ic")
	public static boolean field133 = true;

	@ObfuscatedName("client.Pc")
	public static int[] field164 = new int[99];

	@ObfuscatedName("client.He")
	public static final int[][] field243 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.cf")
	public static BigInteger field262 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.fi")
	public static String field404 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Ni")
	public static final int[] field434 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Db")
	public int field102;

	@ObfuscatedName("client.Eb")
	public int field103;

	@ObfuscatedName("client.Gb")
	public int field105;

	@ObfuscatedName("client.Jb")
	public int field108;

	@ObfuscatedName("client.Kb")
	public int field109;

	@ObfuscatedName("client.Lb")
	public int field110;

	@ObfuscatedName("client.Mb")
	public int field111;

	@ObfuscatedName("client.Nb")
	public int field112;

	@ObfuscatedName("client.Ob")
	public int field113;

	@ObfuscatedName("client.Pb")
	public int field114;

	@ObfuscatedName("client.Qb")
	public int field115;

	@ObfuscatedName("client.Rb")
	public int field116;

	@ObfuscatedName("client.Sb")
	public int field117;

	@ObfuscatedName("client.Ub")
	public int field119;

	@ObfuscatedName("client.Xb")
	public int field122;

	@ObfuscatedName("client.Yb")
	public int field123;

	@ObfuscatedName("client.Zb")
	public int field124;

	@ObfuscatedName("client.cc")
	public int field127;

	@ObfuscatedName("client.hc")
	public static int field132;

	@ObfuscatedName("client.nc")
	public int field138;

	@ObfuscatedName("client.qc")
	public int field140;

	@ObfuscatedName("client.tc")
	public int field143;

	@ObfuscatedName("client.xc")
	public int field147;

	@ObfuscatedName("client.yc")
	public int field148;

	@ObfuscatedName("client.zc")
	public int field149;

	@ObfuscatedName("client.Ac")
	public int field150;

	@ObfuscatedName("client.Bc")
	public int field151;

	@ObfuscatedName("client.Cc")
	public int field152;

	@ObfuscatedName("client.Dc")
	public int field153;

	@ObfuscatedName("client.Ec")
	public int field154;

	@ObfuscatedName("client.Fc")
	public int field155;

	@ObfuscatedName("client.Gc")
	public int field156;

	@ObfuscatedName("client.Ic")
	public int field158;

	@ObfuscatedName("client.Kc")
	public int field160;

	@ObfuscatedName("client.Nc")
	public int field162;

	@ObfuscatedName("client.Oc")
	public int field163;

	@ObfuscatedName("client.Qc")
	public int field165;

	@ObfuscatedName("client.Rc")
	public int field166;

	@ObfuscatedName("client.Tc")
	public int field168;

	@ObfuscatedName("client.Yc")
	public int field173;

	@ObfuscatedName("client.Zc")
	public int field174;

	@ObfuscatedName("client.ad")
	public int field175;

	@ObfuscatedName("client.bd")
	public int field176;

	@ObfuscatedName("client.jd")
	public int field184;

	@ObfuscatedName("client.nd")
	public int field188;

	@ObfuscatedName("client.od")
	public int field189;

	@ObfuscatedName("client.pd")
	public int field190;

	@ObfuscatedName("client.rd")
	public int field192;

	@ObfuscatedName("client.ud")
	public int field194;

	@ObfuscatedName("client.Cd")
	public int field198;

	@ObfuscatedName("client.Nd")
	public int field206;

	@ObfuscatedName("client.Rd")
	public int field210;

	@ObfuscatedName("client.Sd")
	public int field211;

	@ObfuscatedName("client.be")
	public int field217;

	@ObfuscatedName("client.ce")
	public int field218;

	@ObfuscatedName("client.ie")
	public int field224;

	@ObfuscatedName("client.ke")
	public static int field225;

	@ObfuscatedName("client.me")
	public int field227;

	@ObfuscatedName("client.re")
	public static int field230;

	@ObfuscatedName("client.ue")
	public int field233;

	@ObfuscatedName("client.ve")
	public int field234;

	@ObfuscatedName("client.Ae")
	public int field236;

	@ObfuscatedName("client.Oe")
	public int field250;

	@ObfuscatedName("client.Qe")
	public int field252;

	@ObfuscatedName("client.Te")
	public int field255;

	@ObfuscatedName("client.Ue")
	public int field256;

	@ObfuscatedName("client.We")
	public int field258;

	@ObfuscatedName("client.df")
	public int field263;

	@ObfuscatedName("client.ff")
	public int field265;

	@ObfuscatedName("client.hf")
	public int field267;

	@ObfuscatedName("client.jf")
	public int field268;

	@ObfuscatedName("client.xf")
	public int field280;

	@ObfuscatedName("client.Cf")
	public int field285;

	@ObfuscatedName("client.Ef")
	public int field287;

	@ObfuscatedName("client.Gf")
	public static int field288;

	@ObfuscatedName("client.Hf")
	public int field289;

	@ObfuscatedName("client.If")
	public int field290;

	@ObfuscatedName("client.Jf")
	public int field291;

	@ObfuscatedName("client.Kf")
	public int field292;

	@ObfuscatedName("client.Wf")
	public int field303;

	@ObfuscatedName("client.Yf")
	public static int field305;

	@ObfuscatedName("client.eg")
	public int field308;

	@ObfuscatedName("client.fg")
	public int field309;

	@ObfuscatedName("client.lg")
	public static int field314;

	@ObfuscatedName("client.ng")
	public int field316;

	@ObfuscatedName("client.sg")
	public int field321;

	@ObfuscatedName("client.ug")
	public int field323;

	@ObfuscatedName("client.vg")
	public int field324;

	@ObfuscatedName("client.wg")
	public int field325;

	@ObfuscatedName("client.zg")
	public int field328;

	@ObfuscatedName("client.Ag")
	public int field329;

	@ObfuscatedName("client.Gg")
	public static int field334;

	@ObfuscatedName("client.Jg")
	public int field336;

	@ObfuscatedName("client.Kg")
	public int field337;

	@ObfuscatedName("client.Lg")
	public int field338;

	@ObfuscatedName("client.Ng")
	public static int field340;

	@ObfuscatedName("client.Og")
	public int field341;

	@ObfuscatedName("client.ch")
	public int field355;

	@ObfuscatedName("client.dh")
	public int field356;

	@ObfuscatedName("client.eh")
	public int field357;

	@ObfuscatedName("client.fh")
	public int field358;

	@ObfuscatedName("client.gh")
	public int field359;

	@ObfuscatedName("client.hh")
	public int field360;

	@ObfuscatedName("client.xh")
	public int field375;

	@ObfuscatedName("client.zh")
	public int field377;

	@ObfuscatedName("client.Ch")
	public static int field378;

	@ObfuscatedName("client.Eh")
	public int field379;

	@ObfuscatedName("client.Ph")
	public int field388;

	@ObfuscatedName("client.Vh")
	public int field394;

	@ObfuscatedName("client.ei")
	public int field403;

	@ObfuscatedName("client.li")
	public static int field410;

	@ObfuscatedName("client.qi")
	public int field414;

	@ObfuscatedName("client.wi")
	public int field418;

	@ObfuscatedName("client.zi")
	public int field421;

	@ObfuscatedName("client.Ai")
	public int field422;

	@ObfuscatedName("client.Bi")
	public int field423;

	@ObfuscatedName("client.Ci")
	public int field424;

	@ObfuscatedName("client.Di")
	public int field425;

	@ObfuscatedName("client.Li")
	public int field432;

	@ObfuscatedName("client.Oi")
	public static int field435;

	@ObfuscatedName("client.Ri")
	public int field437;

	@ObfuscatedName("client.Ti")
	public int field439;

	@ObfuscatedName("client.Yi")
	public int field443;

	@ObfuscatedName("client.aj")
	public int field445;

	@ObfuscatedName("client.bj")
	public int field446;

	@ObfuscatedName("client.gj")
	public int field451;

	@ObfuscatedName("client.ij")
	public int field453;

	@ObfuscatedName("client.kj")
	public int field454;

	@ObfuscatedName("client.lj")
	public int field455;

	@ObfuscatedName("client.pj")
	public int field458;

	@ObfuscatedName("client.qj")
	public int field459;

	@ObfuscatedName("client.rj")
	public int field460;

	@ObfuscatedName("client.sj")
	public int field461;

	@ObfuscatedName("client.tj")
	public int field462;

	@ObfuscatedName("client.yj")
	public int field467;

	@ObfuscatedName("client.zj")
	public int field468;

	@ObfuscatedName("client.Aj")
	public int field469;

	@ObfuscatedName("client.Bj")
	public int field470;

	@ObfuscatedName("client.Cj")
	public int field471;

	@ObfuscatedName("client.Lj")
	public int field479;

	@ObfuscatedName("client.Tj")
	public static int field484;

	@ObfuscatedName("client.Wj")
	public int field487;

	@ObfuscatedName("client.Xj")
	public int field488;

	@ObfuscatedName("client.Yj")
	public int field489;

	@ObfuscatedName("client.ak")
	public int field491;

	@ObfuscatedName("client.jk")
	public int field499;

	@ObfuscatedName("client.kk")
	public int field500;

	@ObfuscatedName("client.lk")
	public int field501;

	@ObfuscatedName("client.nk")
	public static int field503;

	@ObfuscatedName("client.K")
	public int field63;

	@ObfuscatedName("client.M")
	public int field65;

	@ObfuscatedName("client.N")
	public int field66;

	@ObfuscatedName("client.P")
	public int field68;

	@ObfuscatedName("client.S")
	public int field71;

	@ObfuscatedName("client.T")
	public static int field72;

	@ObfuscatedName("client.V")
	public int field74;

	@ObfuscatedName("client.Z")
	public int field77;

	@ObfuscatedName("client.ab")
	public int field78;

	@ObfuscatedName("client.bb")
	public int field79;

	@ObfuscatedName("client.cb")
	public int field80;

	@ObfuscatedName("client.db")
	public int field81;

	@ObfuscatedName("client.hb")
	public int field84;

	@ObfuscatedName("client.ob")
	public static int field88;

	@ObfuscatedName("client.rb")
	public int field90;

	@ObfuscatedName("client.sb")
	public int field91;

	@ObfuscatedName("client.tb")
	public int field92;

	@ObfuscatedName("client.yb")
	public int field97;

	@ObfuscatedName("client.lc")
	public long field136;

	@ObfuscatedName("client.Hc")
	public long field157;

	@ObfuscatedName("client.Ie")
	public long field244;

	@ObfuscatedName("client.nj")
	public long field457;

	@ObfuscatedName("client.Zj")
	public long field490;

	@ObfuscatedName("client.sh")
	public BTJUXBKR field370;

	@ObfuscatedName("client.th")
	public BTJUXBKR field371;

	@ObfuscatedName("client.uh")
	public BTJUXBKR field372;

	@ObfuscatedName("client.vh")
	public BTJUXBKR field373;

	@ObfuscatedName("client.qf")
	public GYXQUUFC field274;

	@ObfuscatedName("client.rf")
	public GYXQUUFC field275;

	@ObfuscatedName("client.sf")
	public GYXQUUFC field276;

	@ObfuscatedName("client.tf")
	public GYXQUUFC field277;

	@ObfuscatedName("client.Mf")
	public GYXQUUFC field294;

	@ObfuscatedName("client.Nf")
	public GYXQUUFC field295;

	@ObfuscatedName("client.Of")
	public GYXQUUFC field296;

	@ObfuscatedName("client.Pf")
	public GYXQUUFC field297;

	@ObfuscatedName("client.Qf")
	public GYXQUUFC field298;

	@ObfuscatedName("client.Rf")
	public GYXQUUFC field299;

	@ObfuscatedName("client.Sf")
	public GYXQUUFC field300;

	@ObfuscatedName("client.Tf")
	public GYXQUUFC field301;

	@ObfuscatedName("client.Uf")
	public GYXQUUFC field302;

	@ObfuscatedName("client.ih")
	public GYXQUUFC field361;

	@ObfuscatedName("client.jh")
	public GYXQUUFC field362;

	@ObfuscatedName("client.kh")
	public GYXQUUFC field363;

	@ObfuscatedName("client.lh")
	public GYXQUUFC field364;

	@ObfuscatedName("client.mh")
	public GYXQUUFC field365;

	@ObfuscatedName("client.nh")
	public GYXQUUFC field366;

	@ObfuscatedName("client.oh")
	public GYXQUUFC field367;

	@ObfuscatedName("client.ph")
	public GYXQUUFC field368;

	@ObfuscatedName("client.qh")
	public GYXQUUFC field369;

	@ObfuscatedName("client.ni")
	public GYXQUUFC field411;

	@ObfuscatedName("client.oi")
	public GYXQUUFC field412;

	@ObfuscatedName("client.pi")
	public GYXQUUFC field413;

	@ObfuscatedName("client.Pj")
	public HKGQPBYJ field481;

	@ObfuscatedName("client.fb")
	public IKKPZVXM field83;

	@ObfuscatedName("client.mc")
	public KDQJDBED field137;

	@ObfuscatedName("client.bi")
	public MCPCRICF field400;

	@ObfuscatedName("client.ai")
	public RPFMUSNN field399;

	@ObfuscatedName("client.Wc")
	public SSCICQYX field171;

	@ObfuscatedName("client.Xc")
	public SSCICQYX field172;

	@ObfuscatedName("client.dd")
	public SSCICQYX field178;

	@ObfuscatedName("client.ed")
	public SSCICQYX field179;

	@ObfuscatedName("client.fd")
	public SSCICQYX field180;

	@ObfuscatedName("client.gd")
	public SSCICQYX field181;

	@ObfuscatedName("client.hd")
	public SSCICQYX field182;

	@ObfuscatedName("client.ld")
	public SSCICQYX field186;

	@ObfuscatedName("client.md")
	public SSCICQYX field187;

	@ObfuscatedName("client.Bg")
	public SSCICQYX field330;

	@ObfuscatedName("client.Cg")
	public SSCICQYX field331;

	@ObfuscatedName("client.Dg")
	public SSCICQYX field332;

	@ObfuscatedName("client.Jh")
	public SSCICQYX field383;

	@ObfuscatedName("client.Kh")
	public SSCICQYX field384;

	@ObfuscatedName("client.Lh")
	public SSCICQYX field385;

	@ObfuscatedName("client.Mh")
	public SSCICQYX field386;

	@ObfuscatedName("client.Nh")
	public SSCICQYX field387;

	@ObfuscatedName("client.cj")
	public SSCICQYX field447;

	@ObfuscatedName("client.dj")
	public SSCICQYX field448;

	@ObfuscatedName("client.ej")
	public SSCICQYX field449;

	@ObfuscatedName("client.Hi")
	public VAVAOKUB field428;

	@ObfuscatedName("client.Zg")
	public static WQWDCUWR field352;

	@ObfuscatedName("client.xd")
	public WSNKRVXZ field196;

	@ObfuscatedName("client.yd")
	public WSNKRVXZ field197;

	@ObfuscatedName("client.Vd")
	public WSNKRVXZ field213;

	@ObfuscatedName("client.Wd")
	public WSNKRVXZ field214;

	@ObfuscatedName("client.se")
	public WSNKRVXZ field231;

	@ObfuscatedName("client.Ce")
	public WSNKRVXZ field238;

	@ObfuscatedName("client.De")
	public WSNKRVXZ field239;

	@ObfuscatedName("client.Ee")
	public WSNKRVXZ field240;

	@ObfuscatedName("client.Fe")
	public WSNKRVXZ field241;

	@ObfuscatedName("client.Ge")
	public WSNKRVXZ field242;

	@ObfuscatedName("client.Ve")
	public WSNKRVXZ field257;

	@ObfuscatedName("client.Bf")
	public WSNKRVXZ field284;

	@ObfuscatedName("client.di")
	public WSNKRVXZ field402;

	@ObfuscatedName("client.hi")
	public WSNKRVXZ field406;

	@ObfuscatedName("client.ii")
	public WSNKRVXZ field407;

	@ObfuscatedName("client.cd")
	public String field177;

	@ObfuscatedName("client.Td")
	public String field212;

	@ObfuscatedName("client.Hg")
	public String field335;

	@ObfuscatedName("client.mk")
	public String field502;

	@ObfuscatedName("client.fj")
	public Socket field450;

	@ObfuscatedName("client.jc")
	public static boolean field134;

	@ObfuscatedName("client.oe")
	public static boolean field228;

	@ObfuscatedName("client.yg")
	public static boolean field327;

	@ObfuscatedName("client.qb")
	public static boolean field89;

	@ObfuscatedName("client.Jd")
	public int[] field202;

	@ObfuscatedName("client.Kd")
	public int[] field203;

	@ObfuscatedName("client.Ld")
	public int[] field204;

	@ObfuscatedName("client.Md")
	public int[] field205;

	@ObfuscatedName("client.Od")
	public int[] field207;

	@ObfuscatedName("client.Pd")
	public int[] field208;

	@ObfuscatedName("client.Qd")
	public int[] field209;

	@ObfuscatedName("client.ge")
	public int[] field222;

	@ObfuscatedName("client.he")
	public int[] field223;

	@ObfuscatedName("client.gg")
	public int[] field310;

	@ObfuscatedName("client.hg")
	public int[] field311;

	@ObfuscatedName("client.ub")
	public int[] field93;

	@ObfuscatedName("client.vb")
	public int[] field94;

	@ObfuscatedName("client.wb")
	public int[] field95;

	@ObfuscatedName("client.xb")
	public int[] field96;

	@ObfuscatedName("client.Sh")
	public SSCICQYX[] field391;

	@ObfuscatedName("client.kc")
	public byte[][] field135;

	@ObfuscatedName("client.ae")
	public byte[][] field216;

	@ObfuscatedName("client.le")
	public byte[][][] field226;

	@ObfuscatedName("client.Kj")
	public int[][][] field478;

	@ObfuscatedName("client.g(I)V")
	public final void method27() {
		if (field451 == 0) {
			int var1 = field682 / 2 - 80;
			int var2 = field683 / 2 + 20;
			var2 += 20;
			if (field698 == 1 && field699 >= var1 - 75 && field699 <= var1 + 75 && field700 >= var2 - 20 && field700 <= var2 + 20) {
				field451 = 3;
				field316 = 0;
			}

			int var3 = field682 / 2 + 80;
			if (field698 == 1 && field699 >= var3 - 75 && field699 <= var3 + 75 && field700 >= var2 - 20 && field700 <= var2 + 20) {
				field408 = "";
				field409 = "Enter your username & password.";
				field451 = 2;
				field316 = 0;
			}
		} else if (field451 == 2) {
			int var4 = field683 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field698 == 1 && field700 >= var4 - 15 && field700 < var4) {
				field316 = 0;
			}

			var4 += 15;
			if (field698 == 1 && field700 >= var4 - 15 && field700 < var4) {
				field316 = 1;
			}

			var4 += 15;
			int var5 = field682 / 2 - 80;
			int var6 = field683 / 2 + 50;
			var6 += 20;
			if (field698 == 1 && field699 >= var5 - 75 && field699 <= var5 + 75 && field700 >= var6 - 20 && field700 <= var6 + 20) {
				field414 = 0;
				method47(field245, field246, false);

				if (field159) {
					return;
				}
			}

			int var7 = field682 / 2 + 80;
			if (field698 == 1 && field699 >= var7 - 75 && field699 <= var7 + 75 && field700 >= var6 - 20 && field700 <= var6 + 20) {
				field451 = 0;
				field245 = "";
				field246 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method244();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field404.length(); var10++) {
					if (var8 == field404.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field316 == 0) {
					if (var8 == 8 && field245.length() > 0) {
						field245 = field245.substring(0, field245.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field316 = 1;
					}

					if (var9) {
						field245 = field245 + (char) var8;
					}

					if (field245.length() > 12) {
						field245 = field245.substring(0, 12);
					}
				} else if (field316 == 1) {
					if (var8 == 8 && field246.length() > 0) {
						field246 = field246.substring(0, field246.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field316 = 0;
					}

					if (var9) {
						field246 = field246 + (char) var8;
					}

					if (field246.length() > 20) {
						field246 = field246.substring(0, 20);
					}
				}
			}
		} else if (field451 == 3) {
			int var11 = field682 / 2;
			int var12 = field683 / 2 + 50;
			var12 += 20;
			if (field698 == 1 && field699 >= var11 - 75 && field699 <= var11 + 75 && field700 >= var12 - 20 && field700 <= var12 + 20) {
				field451 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIBLBJGOYLYN;)V")
	public final void method28(int arg0, int arg1, int arg2, BJGOYLYN arg3) {
		if (field488 < 400) {
			if (arg3.field37 != null) {
				arg3 = arg3.method6();
			}

			if (arg3 != null && arg3.field23) {
				String var5 = arg3.field29;
				if (arg3.field41 != 0) {
					var5 = var5 + method115(arg3.field41, field352.field1435) + " (level-" + arg3.field41 + ")";
				}

				if (field173 == 1) {
					field382[field488] = "Use " + field177 + " with @yel@" + var5;
					field465[field488] = 625;
					field466[field488] = arg2;
					field463[field488] = arg1;
					field464[field488] = arg0;
					field488++;
				} else if (field499 != 1) {
					if (arg3.field33 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field33[var6] != null && !arg3.field33[var6].equalsIgnoreCase("attack")) {
								field382[field488] = arg3.field33[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field465[field488] = 884;
								}

								if (var6 == 1) {
									field465[field488] = 316;
								}

								if (var6 == 2) {
									field465[field488] = 369;
								}

								if (var6 == 3) {
									field465[field488] = 825;
								}

								if (var6 == 4) {
									field465[field488] = 708;
								}

								field466[field488] = arg2;
								field463[field488] = arg1;
								field464[field488] = arg0;
								field488++;
							}
						}
					}

					if (arg3.field33 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field33[var7] != null && arg3.field33[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field41 > field352.field1435) {
									var8 = 2000;
								}

								field382[field488] = arg3.field33[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field465[field488] = var8 + 884;
								}

								if (var7 == 1) {
									field465[field488] = var8 + 316;
								}

								if (var7 == 2) {
									field465[field488] = var8 + 369;
								}

								if (var7 == 3) {
									field465[field488] = var8 + 825;
								}

								if (var7 == 4) {
									field465[field488] = var8 + 708;
								}

								field466[field488] = arg2;
								field463[field488] = arg1;
								field464[field488] = arg0;
								field488++;
							}
						}
					}

					field382[field488] = "Examine @yel@" + var5;
					field465[field488] = 1250;
					field466[field488] = arg2;
					field463[field488] = arg1;
					field464[field488] = arg0;
					field488++;
				} else if ((field501 & 0x2) == 2) {
					field382[field488] = field502 + " @yel@" + var5;
					field465[field488] = 959;
					field466[field488] = arg2;
					field463[field488] = arg1;
					field464[field488] = arg0;
					field488++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method29(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field210; var2++) {
			if (arg0.equalsIgnoreCase(field390[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field352.field1427)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.h(I)Z")
	public final boolean method30() {
		if (field428 == null) {
			return false;
		}

		try {
			int var1 = field428.method476();
			if (var1 == 0) {
				return false;
			}

			if (field148 == -1) {
				field428.method477(field104.field1374, 0, 1);
				field148 = field104.field1374[0] & 0xFF;
				if (field137 != null) {
					field148 = field148 - field137.method317() & 0xFF;
				}

				field147 = JPVUKEAJ.field803[field148];
				var1--;
			}

			if (field147 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field428.method477(field104.field1374, 0, 1);
				field147 = field104.field1374[0] & 0xFF;
				var1--;
			}

			if (field147 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field428.method477(field104.field1374, 0, 2);
				field104.field1375 = 0;
				field147 = field104.method504();
				var1 -= 2;
			}

			if (var1 < field147) {
				return false;
			}

			field104.field1375 = 0;
			field428.method477(field104.field1374, 0, field147);
			field149 = 0;
			field92 = field91;
			field91 = field90;
			field90 = field148;

			if (field148 == 189) {
				int var2 = field104.method530();
				QQMJEFXK.method397(var2).field1055 = 3;

				if (field352.field1436 == null) {
					QQMJEFXK.method397(var2).field1056 = (field352.field1428[11] << 5) + (field352.field1428[8] << 10) + (field352.field1428[0] << 15) + (field352.field1433[0] << 25) + (field352.field1433[4] << 20) + field352.field1428[1];
				} else {
					QQMJEFXK.method397(var2).field1056 = (int) (field352.field1436.field26 + 0x12345678L);
				}

				field148 = -1;
				return true;
			}

			if (field148 == 80) {
				int var3 = field104.method505();
				int var4 = field104.method529();
				int var5 = field104.method533();
				QQMJEFXK var6 = QQMJEFXK.method397(var4);
				var6.field1118 = var3;
				var6.field1090 = var5;
				field148 = -1;
				return true;
			}

			if (field148 == 143) {
				int var7 = field104.method531();
				String var8 = field104.method509();
				QQMJEFXK.method397(var7).field1103 = var8;

				if (field351[field392] == QQMJEFXK.method397(var7).field1071) {
					field161 = true;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 29) {
				int var9 = field104.method531();
				QQMJEFXK var10 = QQMJEFXK.method397(var9);
				for (int var11 = 0; var11 < var10.field1086.length; var11++) {
					var10.field1086[var11] = -1;
					var10.field1086[var11] = 0;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 147) {
				int var12 = field104.method504();
				boolean var13 = field104.method521() == 1;
				QQMJEFXK.method397(var12).field1089 = var13;
				field148 = -1;
				return true;
			}

			if (field148 == 46) {
				if (field392 == 12) {
					field161 = true;
				}

				field303 = field104.method502();
				field148 = -1;
				return true;
			}

			if (field148 == 139) {
				field160 = field104.method502();
				field148 = -1;
				return true;
			}

			if (field148 == 214) {
				int var14 = field104.method532();
				if (field396 != var14) {
					method54(field396);
					field396 = var14;
				}

				field70 = true;
				field148 = -1;
				return true;
			}

			if (field148 == 7) {
				String var15 = field104.method509();
				int var16 = field104.method502();
				int var17 = field104.method522();
				if (var16 >= 1 && var16 <= 5) {
					if (var15.equalsIgnoreCase("null")) {
						var15 = null;
					}

					field272[var16 - 1] = var15;
					field273[var16 - 1] = var17 == 0;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 184) {
				field161 = true;
				int var18 = field104.method504();
				QQMJEFXK var19 = QQMJEFXK.method397(var18);
				while (field104.field1375 < field147) {
					int var20 = field104.method516();
					int var21 = field104.method504();
					int var22 = field104.method502();
					if (var22 == 255) {
						var22 = field104.method507();
					}

					if (var20 >= 0 && var20 < var19.field1086.length) {
						var19.field1086[var20] = var21;
						var19.field1066[var20] = var22;
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 237) {
				long var23 = field104.method508();
				int var25 = field104.method502();
				String var26 = HCBZAWVW.method290(HCBZAWVW.method287(var23));
				for (int var27 = 0; var27 < field210; var27++) {
					if (field193[var27] == var23) {
						if (field416[var27] != var25) {
							field416[var27] = var25;
							field161 = true;

							if (var25 > 0) {
								method44(5, "", var26 + " has logged in.");
							}

							if (var25 == 0) {
								method44(5, "", var26 + " has logged out.");
							}
						}

						var26 = null;
						break;
					}
				}

				if (var26 != null && field210 < 200) {
					field193[field210] = var23;
					field390[field210] = var26;
					field416[field210] = var25;
					field210++;
					field161 = true;
				}

				boolean var28 = false;
				while (!var28) {
					var28 = true;
					for (int var29 = 0; var29 < field210 - 1; var29++) {
						if (field416[var29] != field131 && field416[var29 + 1] == field131 || field416[var29] == 0 && field416[var29 + 1] != 0) {
							int var30 = field416[var29];
							field416[var29] = field416[var29 + 1];
							field416[var29 + 1] = var30;
							String var31 = field390[var29];
							field390[var29] = field390[var29 + 1];
							field390[var29 + 1] = var31;
							long var32 = field193[var29];
							field193[var29] = field193[var29 + 1];
							field193[var29 + 1] = var32;
							field161 = true;
							var28 = false;
						}
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 17) {
				int var34 = field104.method505();
				if (var34 >= 0) {
					method118(var34);
				}

				if (field393 != var34) {
					method54(field393);
					field393 = var34;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 190) {
				int var35 = field104.method532();
				int var36 = field104.method531();
				QQMJEFXK var37 = QQMJEFXK.method397(var36);
				if (var37.field1057 != var35 || var35 == -1) {
					var37.field1057 = var35;
					var37.field1106 = 0;
					var37.field1082 = 0;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 186) {
				byte var38 = field104.method524();
				int var39 = field104.method530();
				field495[var39] = var38;

				if (field474[var39] != var38) {
					field474[var39] = var38;
					method95(var39);
					field161 = true;

					if (field396 != -1) {
						field70 = true;
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 18) {
				field190 = field104.method522();
				field189 = field104.method522();
				for (int var40 = field189; var40 < field189 + 8; var40++) {
					for (int var41 = field190; var41 < field190 + 8; var41++) {
						if (field494[field188][var40][var41] != null) {
							field494[field188][var40][var41] = null;
							method113(var40, var41);
						}
					}
				}

				for (JMLHLOET var42 = (JMLHLOET) field264.method485(); var42 != null; var42 = (JMLHLOET) field264.method487()) {
					if (var42.field792 >= field189 && var42.field792 < field189 + 8 && var42.field793 >= field190 && var42.field793 < field190 + 8 && field188 == var42.field790) {
						var42.field794 = 0;
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 137) {
				field255 = 0;
				field148 = -1;
				return true;
			}

			if (field148 == 250) {
				int var43 = field104.method530();
				int var44 = field104.method520();

				if (var43 == 0xFFFF) {
					var43 = -1;
				}

				if (field351[var44] != var43) {
					method54(field351[var44]);
					field351[var44] = var43;
				}

				field161 = true;
				field167 = true;
				field148 = -1;
				return true;
			}

			if (field148 == 207) {
				field233 = field104.method531();
				field439 = field104.method529();
				field104.method531();
				field104.method529();
				field117 = field104.method536();
				field104.method530();
				field198 = field104.method530();
				field458 = field104.method529();
				field105 = field104.method529();
				field104.method521();
				field165 = field104.method504();
				signlink.dnslookup(HCBZAWVW.method289(field117));
				field148 = -1;
				return true;
			}

			if (field148 == 62) {
				field211 = field104.method502();
				field161 = true;
				field148 = -1;
				return true;
			}

			if (field148 == 255) {
				int var45 = field104.method504();
				int var46 = field104.method529();
				method118(var45);

				if (var46 != -1) {
					method118(var46);
				}

				if (field317 != -1) {
					method54(field317);
					field317 = -1;
				}

				if (field232 != -1) {
					method54(field232);
					field232 = -1;
				}

				if (field101 != -1) {
					method54(field101);
					field101 = -1;
				}

				if (field397 != var45) {
					method54(field397);
					field397 = var45;
				}

				if (field306 != var45) {
					method54(field306);
					field306 = var46;
				}

				field453 = 0;
				field145 = false;
				field148 = -1;
				return true;
			}

			if (field148 == 236) {
				int var47 = field104.method504();
				int var48 = field104.method537();
				field495[var47] = var48;

				if (field474[var47] != var48) {
					field474[var47] = var48;
					method95(var47);
					field161 = true;

					if (field396 != -1) {
						field70 = true;
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 231) {
				for (int var49 = 0; var49 < field474.length; var49++) {
					if (field495[var49] != field474[var49]) {
						field474[var49] = field495[var49];
						method95(var49);
						field161 = true;
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 64) {
				field417 = field104.method504();
				field71 = field104.method502();
				field148 = -1;
				return true;
			}

			if (field148 == 192) {
				int var50 = field104.method531();
				int var51 = field104.method504();
				QQMJEFXK.method397(var50).field1055 = 2;
				QQMJEFXK.method397(var50).field1056 = var51;
				field148 = -1;
				return true;
			}

			if (field148 == 134) {
				field190 = field104.method502();
				field189 = field104.method522();

				while (field104.field1375 < field147) {
					int var52 = field104.method502();
					method149(var52, field104);
				}

				field148 = -1;
				return true;
			}

			if (field148 == 59) {
				int var53 = field104.method504();
				method118(var53);

				if (field101 != -1) {
					method54(field101);
					field101 = -1;
					field70 = true;
				}

				if (field397 != -1) {
					method54(field397);
					field397 = -1;
					field185 = true;
				}

				if (field306 != -1) {
					method54(field306);
					field306 = -1;
				}

				if (field317 != -1) {
					method54(field317);
					field317 = -1;
				}

				if (field232 != var53) {
					method54(field232);
					field232 = var53;
				}

				if (field453 != 0) {
					field453 = 0;
					field70 = true;
				}

				field161 = true;
				field167 = true;
				field145 = false;
				field148 = -1;
				return true;
			}

			if (field148 == 217) {
				long var54 = field104.method508();
				int var56 = field104.method507();
				int var57 = field104.method502();
				boolean var58 = false;
				for (int var59 = 0; var59 < 100; var59++) {
					if (field87[var59] == var56) {
						var58 = true;
						break;
					}
				}

				if (var57 <= 1) {
					for (int var60 = 0; var60 < field489; var60++) {
						if (field221[var60] == var54) {
							var58 = true;
							break;
						}
					}
				}

				if (!var58 && field102 == 0) {
					try {
						field87[field377] = var56;
						field377 = (field377 + 1) % 100;
						String var61 = KJZMDELZ.method320(field147 - 13, field104);
						if (var57 != 3) {
							var61 = HBDSGKGH.method258(var61);
						}

						if (var57 == 2 || var57 == 3) {
							method44(7, "@cr2@" + HCBZAWVW.method290(HCBZAWVW.method287(var54)), var61);
						} else if (var57 == 1) {
							method44(7, "@cr1@" + HCBZAWVW.method290(HCBZAWVW.method287(var54)), var61);
						} else {
							method44(3, HCBZAWVW.method290(HCBZAWVW.method287(var54)), var61);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 168) {
				field161 = true;
				int var63 = field104.method520();
				int var64 = field104.method520();
				int var65 = field104.method507();
				field436[var63] = var65;
				field420[var63] = var64;
				field307[var63] = 1;
				for (int var66 = 0; var66 < 98; var66++) {
					if (var65 >= field164[var66]) {
						field307[var63] = var66 + 2;
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 203 || field148 == 89) {
				int var67 = field217;
				int var68 = field218;
				if (field148 == 203) {
					var67 = field104.method529();
					var68 = field104.method530();
					field401 = false;
				}

				if (field148 == 89) {
					var68 = field104.method530();
					field104.method512();

					for (int var69 = 0; var69 < 4; var69++) {
						for (int var70 = 0; var70 < 13; var70++) {
							for (int var71 = 0; var71 < 13; var71++) {
								int var72 = field104.method513(1);
								if (var72 == 1) {
									field429[var69][var70][var71] = field104.method513(26);
								} else {
									field429[var69][var70][var71] = -1;
								}
							}
						}
					}

					field104.method514();
					var67 = field104.method531();
					field401 = true;
				}

				if (field217 == var67 && field218 == var68 && field487 == 2) {
					field148 = -1;
					return true;
				}

				field217 = var67;
				field218 = var68;
				field289 = (field217 - 6) * 8;
				field290 = (field218 - 6) * 8;
				field395 = false;
				if ((field217 / 8 == 48 || field217 / 8 == 49) && field218 / 8 == 48) {
					field395 = true;
				}

				if (field217 / 8 == 48 && field218 / 8 == 148) {
					field395 = true;
				}

				field487 = 1;
				field457 = System.currentTimeMillis();
				method50("Loading - please wait.", null);

				if (field148 == 203) {
					int var73 = 0;
					for (int var74 = (field217 - 6) / 8; var74 <= (field217 + 6) / 8; var74++) {
						for (int var75 = (field218 - 6) / 8; var75 <= (field218 + 6) / 8; var75++) {
							var73++;
						}
					}

					field216 = new byte[var73][];
					field135 = new byte[var73][];
					field207 = new int[var73];
					field208 = new int[var73];
					field209 = new int[var73];
					int var76 = 0;
					for (int var77 = (field217 - 6) / 8; var77 <= (field217 + 6) / 8; var77++) {
						for (int var78 = (field218 - 6) / 8; var78 <= (field218 + 6) / 8; var78++) {
							field207[var76] = (var77 << 8) + var78;

							if (field395 && (var78 == 49 || var78 == 149 || var78 == 147 || var77 == 50 || var77 == 49 && var78 == 47)) {
								field208[var76] = -1;
								field209[var76] = -1;
								var76++;
							} else {
								int var79 = field208[var76] = field481.method298(var77, 0, var78);
								if (var79 != -1) {
									field481.method309(3, var79);
								}

								int var80 = field209[var76] = field481.method298(var77, 1, var78);
								if (var80 != -1) {
									field481.method309(3, var80);
								}

								var76++;
							}
						}
					}
				}

				if (field148 == 89) {
					int var81 = 0;
					int[] var82 = new int[676];
					for (int var83 = 0; var83 < 4; var83++) {
						for (int var84 = 0; var84 < 13; var84++) {
							for (int var85 = 0; var85 < 13; var85++) {
								int var86 = field429[var83][var84][var85];
								if (var86 != -1) {
									int var87 = var86 >> 14 & 0x3FF;
									int var88 = var86 >> 3 & 0x7FF;
									int var89 = (var87 / 8 << 8) + var88 / 8;
									for (int var90 = 0; var90 < var81; var90++) {
										if (var82[var90] == var89) {
											var89 = -1;
											break;
										}
									}

									if (var89 != -1) {
										var82[var81++] = var89;
									}
								}
							}
						}
					}

					field216 = new byte[var81][];
					field135 = new byte[var81][];
					field207 = new int[var81];
					field208 = new int[var81];
					field209 = new int[var81];
					for (int var91 = 0; var91 < var81; var91++) {
						int var92 = field207[var91] = var82[var91];
						int var93 = var92 >> 8 & 0xFF;
						int var94 = var92 & 0xFF;
						int var95 = field208[var91] = field481.method298(var93, 0, var94);
						if (var95 != -1) {
							field481.method309(3, var95);
						}

						int var96 = field209[var91] = field481.method298(var93, 1, var94);
						if (var96 != -1) {
							field481.method309(3, var96);
						}
					}
				}

				int var97 = field289 - field291;
				int var98 = field290 - field292;
				field291 = field289;
				field292 = field290;

				for (int var99 = 0; var99 < 16384; var99++) {
					UGARWYIU var100 = field431[var99];
					if (var100 != null) {
						for (int var101 = 0; var101 < 10; var101++) {
							var100.field1175[var101] -= var97;
							var100.field1176[var101] -= var98;
						}

						var100.field1195 -= var97 * 128;
						var100.field1196 -= var98 * 128;
					}
				}

				for (int var102 = 0; var102 < field247; var102++) {
					WQWDCUWR var103 = field249[var102];
					if (var103 != null) {
						for (int var104 = 0; var104 < 10; var104++) {
							var103.field1175[var104] -= var97;
							var103.field1176[var104] -= var98;
						}

						var103.field1195 -= var97 * 128;
						var103.field1196 -= var98 * 128;
					}
				}

				field374 = true;
				byte var105 = 0;
				byte var106 = 104;
				byte var107 = 1;
				if (var97 < 0) {
					var105 = 103;
					var106 = -1;
					var107 = -1;
				}

				byte var108 = 0;
				byte var109 = 104;
				byte var110 = 1;
				if (var98 < 0) {
					var108 = 103;
					var109 = -1;
					var110 = -1;
				}

				for (int var111 = var105; var111 != var106; var111 += var107) {
					for (int var112 = var108; var112 != var109; var112 += var110) {
						int var113 = var97 + var111;
						int var114 = var98 + var112;
						for (int var115 = 0; var115 < 4; var115++) {
							if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
								field494[var115][var111][var112] = field494[var115][var113][var114];
							} else {
								field494[var115][var111][var112] = null;
							}
						}
					}
				}

				for (JMLHLOET var116 = (JMLHLOET) field264.method485(); var116 != null; var116 = (JMLHLOET) field264.method487()) {
					var116.field792 -= var97;
					var116.field793 -= var98;
					if (var116.field792 < 0 || var116.field793 < 0 || var116.field792 >= 104 || var116.field793 >= 104) {
						var116.method327();
					}
				}

				if (field255 != 0) {
					field255 -= var97;
					field256 -= var98;
				}

				field106 = false;
				field148 = -1;
				return true;
			}

			if (field148 == 92) {
				int var117 = field104.method531();
				int var118 = field104.method530();
				int var119 = var117 >> 10 & 0x1F;
				int var120 = var117 >> 5 & 0x1F;
				int var121 = var117 & 0x1F;
				QQMJEFXK.method397(var118).field1122 = (var121 << 3) + (var119 << 19) + (var120 << 11);
				field148 = -1;
				return true;
			}

			if (field148 == 252) {
				int var122 = field104.method504();
				int var123 = field104.method502();
				int var124 = field104.method504();
				if (var124 == 0xFFFF) {
					if (field375 < 50) {
						field315[field375] = (short) var122;
						field64[field375] = var123;
						field389[field375] = 0;
						field375++;
					}
				} else if (field269 && !field134 && field375 < 50) {
					field315[field375] = var122;
					field64[field375] = var123;
					field389[field375] = URXFHLNO.field1338[var122] + var124;
					field375++;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 155) {
				field138 = field104.method502();
				field148 = -1;
				return true;
			}

			if (field148 == 132) {
				field106 = false;

				for (int var125 = 0; var125 < 5; var125++) {
					field480[var125] = false;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 220) {
				field394 = field104.method531() * 30;
				field148 = -1;
				return true;
			}

			if (field148 == 194) {
				int var126 = field104.method529();
				method118(var126);

				if (field232 != -1) {
					method54(field232);
					field232 = -1;
					field161 = true;
					field167 = true;
				}

				if (field101 != -1) {
					method54(field101);
					field101 = -1;
					field70 = true;
				}

				if (field397 != -1) {
					method54(field397);
					field397 = -1;
					field185 = true;
				}

				if (field306 != -1) {
					method54(field306);
					field306 = -1;
				}

				if (field317 != var126) {
					method54(field317);
					field317 = var126;
				}

				if (field453 != 0) {
					field453 = 0;
					field70 = true;
				}

				field145 = false;
				field148 = -1;
				return true;
			}

			if (field148 == 19) {
				method107(field104, field147);
				field148 = -1;
				return true;
			}

			if (field148 == 187) {
				method49();
				field148 = -1;
				return false;
			}

			if (field148 == 165) {
				for (int var127 = 0; var127 < field249.length; var127++) {
					if (field249[var127] != null) {
						field249[var127].field1162 = -1;
					}
				}

				for (int var128 = 0; var128 < field431.length; var128++) {
					if (field431[var128] != null) {
						field431[var128].field1162 = -1;
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 14) {
				if (field392 == 12) {
					field161 = true;
				}

				field325 = field104.method505();
				field148 = -1;
				return true;
			}

			if (field148 == 216) {
				field98 = field104.method522();
				if (field98 == field392) {
					if (field98 == 3) {
						field392 = 1;
					} else {
						field392 = 3;
					}

					field161 = true;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 111) {
				method42(field104, field147);
				field374 = false;
				field148 = -1;
				return true;
			}

			if (field148 == 63) {
				field144 = false;
				field453 = 1;
				field486 = "";
				field70 = true;
				field148 = -1;
				return true;
			}

			if (field148 == 116) {
				if (field232 != -1) {
					method54(field232);
					field232 = -1;
					field161 = true;
					field167 = true;
				}

				if (field101 != -1) {
					method54(field101);
					field101 = -1;
					field70 = true;
				}

				if (field397 != -1) {
					method54(field397);
					field397 = -1;
					field185 = true;
				}

				if (field306 != -1) {
					method54(field306);
					field306 = -1;
				}

				if (field317 != -1) {
					method54(field317);
					field317 = -1;
				}

				if (field453 != 0) {
					field453 = 0;
					field70 = true;
				}

				field145 = false;
				field148 = -1;
				return true;
			}

			if (field148 == 108) {
				int var129 = field104.method529();
				if (var129 == 0xFFFF) {
					var129 = -1;
				}

				if (field118 != var129 && field441 && !field134 && field194 == 0) {
					field68 = var129;
					field69 = true;
					field481.method309(2, field68);
				}

				field118 = var129;
				field148 = -1;
				return true;
			}

			if (field148 == 193) {
				int var130 = field104.method534();
				int var131 = field104.method530();
				if (field441 && !field134) {
					field68 = var131;
					field69 = false;
					field481.method309(2, field68);
					field194 = var130;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 227 || field148 == 206 || field148 == 152 || field148 == 79 || field148 == 177 || field148 == 185 || field148 == 45 || field148 == 94 || field148 == 115 || field148 == 57 || field148 == 101) {
				method149(field148, field104);
				field148 = -1;
				return true;
			}

			if (field148 == 244) {
				field489 = field147 / 8;
				for (int var132 = 0; var132 < field489; var132++) {
					field221[var132] = field104.method508();
				}

				field148 = -1;
				return true;
			}

			if (field148 == 251) {
				int var133 = field104.method530();
				int var134 = field104.method504();
				int var135 = field104.method530();
				QQMJEFXK.method397(var135).field1105 = (var133 << 16) + var134;
				field148 = -1;
				return true;
			}

			if (field148 == 107) {
				field144 = false;
				field453 = 2;
				field486 = "";
				field70 = true;
				field148 = -1;
				return true;
			}

			if (field148 == 97) {
				field168 = field104.method502();
				if (field168 == 1) {
					field206 = field104.method504();
				}

				if (field168 >= 2 && field168 <= 6) {
					if (field168 == 2) {
						field155 = 64;
						field156 = 64;
					}

					if (field168 == 3) {
						field155 = 0;
						field156 = 64;
					}

					if (field168 == 4) {
						field155 = 128;
						field156 = 64;
					}

					if (field168 == 5) {
						field155 = 64;
						field156 = 0;
					}

					if (field168 == 6) {
						field155 = 64;
						field156 = 128;
					}

					field168 = 2;
					field152 = field104.method504();
					field153 = field104.method504();
					field154 = field104.method502();
				}

				if (field168 == 10) {
					field321 = field104.method504();
				}

				field148 = -1;
				return true;
			}

			if (field148 == 5) {
				field324 = field104.method502();
				field265 = field104.method502();
				field97 = field104.method502();
				field312 = true;
				field70 = true;
				field148 = -1;
				return true;
			}

			if (field148 == 176) {
				int var136 = field104.method530();
				int var137 = field104.method504();
				QQMJEFXK var138 = QQMJEFXK.method397(var137);
				if (var138 != null && var138.field1116 == 0) {
					if (var136 < 0) {
						var136 = 0;
					}

					if (var136 > var138.field1059 - var138.field1113) {
						var136 = var138.field1059 - var138.field1113;
					}

					var138.field1112 = var136;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 167) {
				int var139 = field104.method531();
				int var140 = field104.method530();
				int var141 = field104.method504();
				if (var141 == 0xFFFF) {
					QQMJEFXK.method397(var139).field1055 = 0;
					field148 = -1;
					return true;
				}

				FROOEMOI var142 = FROOEMOI.method218(var141);
				QQMJEFXK.method397(var139).field1055 = 4;
				QQMJEFXK.method397(var139).field1056 = var141;
				QQMJEFXK.method397(var139).field1061 = var142.field639;
				QQMJEFXK.method397(var139).field1062 = var142.field648;
				QQMJEFXK.method397(var139).field1060 = var142.field633 * 100 / var140;
				field148 = -1;
				return true;
			}

			if (field148 == 93) {
				int var143 = field104.method531();
				method118(var143);

				if (field232 != -1) {
					method54(field232);
					field232 = -1;
					field161 = true;
					field167 = true;
				}

				if (field397 != -1) {
					method54(field397);
					field397 = -1;
					field185 = true;
				}

				if (field306 != -1) {
					method54(field306);
					field306 = -1;
				}

				if (field317 != -1) {
					method54(field317);
					field317 = -1;
				}

				if (field101 != var143) {
					method54(field101);
					field101 = var143;
				}

				field145 = false;
				field70 = true;
				field148 = -1;
				return true;
			}

			if (field148 == 50) {
				int var144 = field104.method531();
				int var145 = field104.method530();

				if (field101 != -1) {
					method54(field101);
					field101 = -1;
					field70 = true;
				}

				if (field397 != -1) {
					method54(field397);
					field397 = -1;
					field185 = true;
				}

				if (field306 != -1) {
					method54(field306);
					field306 = -1;
				}

				if (field317 != var144) {
					method54(field317);
					field317 = var144;
				}

				if (field232 != var145) {
					method54(field232);
					field232 = var145;
				}

				if (field453 != 0) {
					field453 = 0;
					field70 = true;
				}

				field161 = true;
				field167 = true;
				field145 = false;
				field148 = -1;
				return true;
			}

			if (field148 == 201) {
				int var146 = field104.method530();
				int var147 = field104.method531();
				QQMJEFXK.method397(var147).field1055 = 1;
				QQMJEFXK.method397(var147).field1056 = var146;
				field148 = -1;
				return true;
			}

			if (field148 == 99) {
				field161 = true;
				int var148 = field104.method504();
				QQMJEFXK var149 = QQMJEFXK.method397(var148);
				int var150 = field104.method504();
				for (int var151 = 0; var151 < var150; var151++) {
					int var152 = field104.method522();
					if (var152 == 255) {
						var152 = field104.method537();
					}

					var149.field1086[var151] = field104.method530();
					var149.field1066[var151] = var152;
				}

				for (int var153 = var150; var153 < var149.field1086.length; var153++) {
					var149.field1086[var153] = 0;
					var149.field1066[var153] = 0;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 159) {
				field106 = true;
				field77 = field104.method502();
				field78 = field104.method502();
				field79 = field104.method504();
				field80 = field104.method502();
				field81 = field104.method502();
				if (field81 >= 100) {
					int var154 = field77 * 128 + 64;
					int var155 = field78 * 128 + 64;
					int var156 = method133(var154, var155, field188) - field79;
					int var157 = var154 - field467;
					int var158 = var156 - field468;
					int var159 = var155 - field469;
					int var160 = (int) Math.sqrt(var157 * var157 + var159 * var159);
					field470 = (int) (Math.atan2(var158, var160) * 325.949D) & 0x7FF;
					field471 = (int) (Math.atan2(var157, var159) * -325.949D) & 0x7FF;

					if (field470 < 128) {
						field470 = 128;
					}

					if (field470 > 383) {
						field470 = 383;
					}
				}

				field148 = -1;
				return true;
			}

			if (field148 == 36) {
				field190 = field104.method521();
				field189 = field104.method520();
				field148 = -1;
				return true;
			}

			if (field148 == 118) {
				int var161 = field104.method529();
				int var162 = field104.method504();
				int var163 = field104.method504();
				int var164 = field104.method529();
				QQMJEFXK.method397(var161).field1061 = var163;
				QQMJEFXK.method397(var161).field1062 = var164;
				QQMJEFXK.method397(var161).field1060 = var162;
				field148 = -1;
				return true;
			}

			if (field148 == 130) {
				String var165 = field104.method509();
				if (var165.endsWith(":tradereq:")) {
					String var166 = var165.substring(0, var165.indexOf(":"));
					long var167 = HCBZAWVW.method286(var166);
					boolean var169 = false;
					for (int var170 = 0; var170 < field489; var170++) {
						if (field221[var170] == var167) {
							var169 = true;
							break;
						}
					}

					if (!var169 && field102 == 0) {
						method44(4, var166, "wishes to trade with you.");
					}
				} else if (var165.endsWith(":duelreq:")) {
					String var171 = var165.substring(0, var165.indexOf(":"));
					long var172 = HCBZAWVW.method286(var171);
					boolean var174 = false;
					for (int var175 = 0; var175 < field489; var175++) {
						if (field221[var175] == var172) {
							var174 = true;
							break;
						}
					}

					if (!var174 && field102 == 0) {
						method44(8, var171, "wishes to duel with you.");
					}
				} else if (var165.endsWith(":chalreq:")) {
					String var176 = var165.substring(0, var165.indexOf(":"));
					long var177 = HCBZAWVW.method286(var176);
					boolean var179 = false;
					for (int var180 = 0; var180 < field489; var180++) {
						if (field221[var180] == var177) {
							var179 = true;
							break;
						}
					}

					if (!var179 && field102 == 0) {
						String var181 = var165.substring(var165.indexOf(":") + 1, var165.length() - 9);
						method44(8, var176, var181);
					}
				} else {
					method44(0, "", var165);
				}

				field148 = -1;
				return true;
			}

			if (field148 == 2) {
				field392 = field104.method522();
				field161 = true;
				field167 = true;
				field148 = -1;
				return true;
			}

			if (field148 == 78) {
				field106 = true;
				field108 = field104.method502();
				field109 = field104.method502();
				field110 = field104.method504();
				field111 = field104.method502();
				field112 = field104.method502();
				if (field112 >= 100) {
					field467 = field108 * 128 + 64;
					field469 = field109 * 128 + 64;
					field468 = method133(field467, field469, field188) - field110;
				}

				field148 = -1;
				return true;
			}

			if (field148 == 129) {
				int var182 = field104.method502();
				int var183 = field104.method502();
				int var184 = field104.method502();
				int var185 = field104.method502();
				field480[var182] = true;
				field261[var182] = var183;
				field229[var182] = var184;
				field492[var182] = var185;
				field442[var182] = 0;
				field148 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field148 + "," + field147 + " - " + field91 + "," + field92);
			method49();
		} catch (IOException var190) {
			method114();
		} catch (Exception var191) {
			String var187 = "T2 - " + field148 + "," + field91 + "," + field92 + " - " + field147 + "," + (field352.field1175[0] + field289) + "," + (field352.field1176[0] + field290) + " - ";
			for (int var188 = 0; var188 < field147 && var188 < 50; var188++) {
				var187 = var187 + field104.field1374[var188] + ",";
			}

			signlink.reporterror(var187);
			method49();
		}

		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method31(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method31(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method32() {
		if (!field76 && !field322 && !field456) {
			field230++;

			if (field159) {
				method38();
			} else {
				method27();
			}

			method48();
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method33(boolean arg0) {
		if (field352.field1195 >> 7 == field255 && field352.field1196 >> 7 == field256) {
			field255 = 0;
		}

		int var2 = field250;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			WQWDCUWR var4;
			int var5;
			if (arg0) {
				var4 = field352;
				var5 = field248 << 14;
			} else {
				var4 = field249[field251[var3]];
				var5 = field251[var3] << 14;
			}

			if (var4 != null && var4.method408()) {
				var4.field1432 = false;
				if ((field134 && field250 > 50 || field250 > 200) && !arg0 && var4.field1199 == var4.field1149) {
					var4.field1432 = true;
				}

				int var6 = var4.field1195 >> 7;
				int var7 = var4.field1196 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1419 == null || field230 < var4.field1413 || field230 >= var4.field1414) {
						if ((var4.field1195 & 0x7F) == 0x40 && (var4.field1196 & 0x7F) == 0x40) {
							if (field482[var6][var7] == field268) {
								continue;
							}

							field482[var6][var7] = field268;
						}

						var4.field1412 = method133(var4.field1195, var4.field1196, field188);
						field400.method340(var4.field1153, field188, var4, var4.field1197, var4.field1196, 60, var4.field1412, var4.field1195, var5);
					} else {
						var4.field1432 = false;
						var4.field1412 = method133(var4.field1195, var4.field1196, field188);
						field400.method341(var4.field1197, var4.field1195, var4.field1196, var4.field1422, 60, var4.field1412, var5, var4, var4.field1423, var4.field1421, var4.field1424, field188);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = UNLYQRUD.field1330[var7];
			int var13 = UNLYQRUD.field1331[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = UNLYQRUD.field1330[var8];
			int var16 = UNLYQRUD.field1331[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field467 = arg5 - var9;
		field468 = arg0 - var10;
		field469 = arg4 - var11;
		field470 = arg1;
		field471 = arg3;
	}

	@ObfuscatedName("client.a(LWNCFPLWV;IZ)V")
	public final void method35(WNCFPLWV arg0, int arg1) {
		for (int var3 = 0; var3 < field252; var3++) {
			int var4 = field253[var3];
			UGARWYIU var5 = field431[var4];
			int var6 = arg0.method502();
			if ((var6 & 0x2) != 0) {
				var5.field1261 = BJGOYLYN.method4(arg0.method530());
				var5.field1177 = var5.field1261.field28;
				var5.field1169 = var5.field1261.field49;
				var5.field1185 = var5.field1261.field24;
				var5.field1186 = var5.field1261.field38;
				var5.field1187 = var5.field1261.field18;
				var5.field1188 = var5.field1261.field46;
				var5.field1149 = var5.field1261.field39;
			}

			if ((var6 & 0x40) != 0) {
				int var7 = arg0.method502();
				int var8 = arg0.method502();
				var5.method412(var8, field230, var7);
				var5.field1191 = field230 + 300;
				var5.field1192 = arg0.method502();
				var5.field1193 = arg0.method522();
			}

			if ((var6 & 0x80) != 0) {
				int var9 = arg0.method502();
				int var10 = arg0.method502();
				var5.method412(var10, field230, var9);
				var5.field1191 = field230 + 300;
				var5.field1192 = arg0.method520();
				var5.field1193 = arg0.method502();
			}

			if ((var6 & 0x4) != 0) {
				var5.field1190 = arg0.method529();
				if (var5.field1190 == 0xFFFF) {
					var5.field1190 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var11 = arg0.method529();
				if (var11 == 0xFFFF) {
					var11 = -1;
				}

				int var12 = arg0.method521();
				if (var5.field1162 == var11 && var11 != -1) {
					int var13 = PVVHTYPN.field1006[var11].field1020;
					if (var13 == 1) {
						var5.field1163 = 0;
						var5.field1164 = 0;
						var5.field1165 = var12;
						var5.field1166 = 0;
					}

					if (var13 == 2) {
						var5.field1166 = 0;
					}
				} else if (var11 == -1 || var5.field1162 == -1 || PVVHTYPN.field1006[var11].field1014 >= PVVHTYPN.field1006[var5.field1162].field1014) {
					var5.field1162 = var11;
					var5.field1163 = 0;
					var5.field1164 = 0;
					var5.field1165 = var12;
					var5.field1166 = 0;
					var5.field1194 = var5.field1180;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field1167 = arg0.method529();
				var5.field1168 = arg0.method504();
			}

			if ((var6 & 0x20) != 0) {
				var5.field1170 = arg0.method529();
				int var14 = arg0.method536();
				var5.field1174 = var14 >> 16;
				var5.field1173 = (var14 & 0xFFFF) + field230;
				var5.field1171 = 0;
				var5.field1172 = 0;

				if (var5.field1173 > field230) {
					var5.field1171 = -1;
				}

				if (var5.field1170 == 0xFFFF) {
					var5.field1170 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field1148 = arg0.method509();
				var5.field1202 = 100;
			}
		}
	}

	@ObfuscatedName("client.a(ILWNCFPLWV;I)V")
	public final void method36(int arg0, WNCFPLWV arg1) {
		while (arg1.field1376 + 10 < arg0 * 8) {
			int var3 = arg1.method513(11);
			if (var3 == 2047) {
				break;
			}

			if (field249[var3] == null) {
				field249[var3] = new WQWDCUWR();
				if (field254[var3] != null) {
					field249[var3].method544(field254[var3]);
				}
			}

			field251[field250++] = var3;
			WQWDCUWR var4 = field249[var3];
			var4.field1179 = field230;
			int var5 = arg1.method513(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method513(1);
			if (var6 == 1) {
				field253[field252++] = var3;
			}

			int var7 = arg1.method513(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method513(1);
			var4.method411(field352.field1175[0] + var5, var8 == 1, field352.field1176[0] + var7);
		}

		arg1.method514();
	}

	@ObfuscatedName("client.i(I)V")
	public final void method37() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field310[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field310[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field311[var10] = (field310[var10 - 1] + field310[var10 + 1] + field310[var10 - 128] + field310[var10 + 128]) / 4;
			}
		}

		field403 += 128;
		if (field403 > field222.length) {
			field403 -= field222.length;
			int var11 = (int) (Math.random() * 12.0D);
			method82(field391[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field311[var14 + 128] - field222[field403 + var14 & field222.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field310[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field195[var16] = field195[var16 + 1];
		}

		field195[var1 - 1] = (int) (Math.sin(field230 / 14.0D) * 16.0D + Math.sin(field230 / 15.0D) * 14.0D + Math.sin(field230 / 16.0D) * 12.0D);

		if (field162 > 0) {
			field162 -= 4;
		}

		if (field163 > 0) {
			field163 -= 4;
		}

		if (field162 == 0 && field163 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field162 = 1024;
			}

			if (var17 == 1) {
				field163 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method38() {
		if (field394 > 1) {
			field394--;
		}

		if (field151 > 0) {
			field151--;
		}

		for (int var1 = 0; var1 < 5 && method30(); var1++) {
		}

		if (field159) {
			synchronized (field83.field776) {
				if (!field89) {
					field83.field778 = 0;
				} else if (field698 != 0 || field83.field778 >= 40) {
					field427.method491(52);
					field427.method492(0);
					int var3 = field427.field1375;
					int var4 = 0;
					for (int var5 = 0; var5 < field83.field778 && var3 - field427.field1375 < 240; var5++) {
						var4++;
						int var6 = field83.field780[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field83.field775[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field83.field780[var5] == -1 && field83.field775[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field308 != var7 || field309 != var6) {
							int var9 = var7 - field308;
							field308 = var7;
							int var10 = var6 - field309;
							field309 = var6;

							if (field192 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field427.method493((field192 << 12) + (var9 << 6) + var10);
								field192 = 0;
							} else if (field192 < 8) {
								field427.method495((field192 << 19) + var8 + 0x800000);
								field192 = 0;
							} else {
								field427.method496((field192 << 19) + var8 - 0x40000000);
								field192 = 0;
							}
						} else if (field192 < 2047) {
							field192++;
						}
					}

					field427.method501(field427.field1375 - var3);

					if (var4 >= field83.field778) {
						field83.field778 = 0;
					} else {
						field83.field778 -= var4;
						for (int var11 = 0; var11 < field83.field778; var11++) {
							field83.field775[var11] = field83.field775[var4 + var11];
							field83.field780[var11] = field83.field780[var4 + var11];
						}
					}
				}
			}

			if (field698 != 0) {
				long var12 = (field701 - field136) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field136 = field701;
				int var14 = field700;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field699;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field698 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field427.method491(154);
				field427.method535((var17 << 19) + (var18 << 20) + var16);
			}

			if (field338 > 0) {
				field338--;
			}

			if (field702[1] == 1 || field702[2] == 1 || field702[3] == 1 || field702[4] == 1) {
				field339 = true;
			}

			if (field339 && field338 <= 0) {
				field338 = 20;
				field339 = false;
				field427.method491(6);
				field427.method526(field122);
				field427.method493(field121);
			}

			if (field689 && !field169) {
				field169 = true;
				field427.method491(107);
				field427.method492(1);
			}

			if (!field689 && field169) {
				field169 = false;
				field427.method491(107);
				field427.method492(0);
			}

			method150();
			method70();
			method83();
			field149++;
			if (field149 > 750) {
				method114();
			}

			method86();
			method158();
			method100();
			field158++;

			if (field462 != 0) {
				field461 += 20;
				if (field461 >= 400) {
					field462 = 0;
				}
			}

			if (field116 != 0) {
				field113++;
				if (field113 >= 15) {
					if (field116 == 2) {
						field161 = true;
					}

					if (field116 == 3) {
						field70 = true;
					}

					field116 = 0;
				}
			}

			if (field358 != 0) {
				field103++;

				if (field692 > field359 + 5 || field692 < field359 - 5 || field693 > field360 + 5 || field693 < field360 - 5) {
					field485 = true;
				}

				if (field691 == 0) {
					if (field358 == 2) {
						field161 = true;
					}

					if (field358 == 3) {
						field70 = true;
					}

					field358 = 0;

					if (field485 && field103 >= 5) {
						field329 = -1;
						method79();

						if (field356 == field329 && field357 != field328) {
							QQMJEFXK var19 = QQMJEFXK.method397(field356);
							byte var20 = 0;
							if (field287 == 1 && var19.field1081 == 206) {
								var20 = 1;
							}

							if (var19.field1086[field328] <= 0) {
								var20 = 0;
							}

							if (var19.field1075) {
								int var21 = field357;
								int var22 = field328;
								var19.field1086[var22] = var19.field1086[var21];
								var19.field1066[var22] = var19.field1066[var21];
								var19.field1086[var21] = -1;
								var19.field1066[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field357;
								int var24 = field328;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method398(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method398(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method398(field357, field328);
							}

							field427.method491(84);
							field427.method526(field328);
							field427.method493(field356);
							field427.method519(var20);
							field427.method493(field357);
						}
					} else if ((field388 == 1 || method84(field488 - 1)) && field488 > 2) {
						method72();
					} else if (field488 > 0) {
						method69(field488 - 1);
					}

					field113 = 10;
					field698 = 0;
				}
			}

			if (MCPCRICF.field870 != -1) {
				int var25 = MCPCRICF.field870;
				int var26 = MCPCRICF.field871;
				boolean var27 = method51(0, field352.field1176[0], field352.field1175[0], 0, var25, 0, 0, 0, 0, true, var26);
				MCPCRICF.field870 = -1;

				if (var27) {
					field459 = field699;
					field460 = field700;
					field462 = 1;
					field461 = 0;
				}
			}

			if (field698 == 1 && field335 != null) {
				field335 = null;
				field70 = true;
				field698 = 0;
			}

			method67();

			if (field397 == -1) {
				method55();
				method154();
				method52();
			}

			if (field691 == 1 || field698 == 1) {
				field454++;
			}

			if (field285 == 0 && field65 == 0 && field280 == 0) {
				if (field227 > 0) {
					field227--;
				}
			} else if (field227 < 100) {
				field227++;
				if (field227 == 100) {
					if (field285 != 0) {
						field70 = true;
					}

					if (field65 != 0) {
						field161 = true;
					}
				}
			}

			if (field487 == 2) {
				method138();
			}

			if (field487 == 2 && field106) {
				method156();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field442[var28]++;
			}

			method129();
			field690++;
			if (field690 > 4500) {
				field151 = 250;
				field690 -= 500;
				field427.method491(221);
			}

			field263++;
			if (field263 > 500) {
				field263 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field236 += field237;
				}

				if ((var29 & 0x2) == 2) {
					field234 += field235;
				}

				if ((var29 & 0x4) == 4) {
					field66 += field67;
				}
			}

			if (field236 < -50) {
				field237 = 2;
			}

			if (field236 > 50) {
				field237 = -2;
			}

			if (field234 < -55) {
				field235 = 2;
			}

			if (field234 > 55) {
				field235 = -2;
			}

			if (field66 < -40) {
				field67 = 1;
			}

			if (field66 > 40) {
				field67 = -1;
			}

			field184++;
			if (field184 > 500) {
				field184 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field119 += field120;
				}

				if ((var30 & 0x2) == 2) {
					field379 += field380;
				}
			}

			if (field119 < -60) {
				field120 = 2;
			}

			if (field119 > 60) {
				field120 = -2;
			}

			if (field379 < -20) {
				field380 = 1;
			}

			if (field379 > 10) {
				field380 = -1;
			}

			field435++;
			if (field435 > 1287) {
				field435 = 0;
				field427.method491(20);
				field427.method492(0);
				int var31 = field427.field1375;
				field427.method492(104);

				if ((int) (Math.random() * 2.0D) == 0) {
					field427.method492(249);
				}

				field427.method493(60855);
				field427.method492((int) (Math.random() * 256.0D));
				field427.method493(46023);
				field427.method492(143);
				field427.method493((int) (Math.random() * 65536.0D));
				field427.method492(165);
				field427.method493(49928);
				field427.method492((int) (Math.random() * 256.0D));
				field427.method501(field427.field1375 - var31);
			}

			field150++;
			if (field150 > 50) {
				field427.method491(186);
			}

			try {
				if (field428 != null && field427.field1375 > 0) {
					field428.method478(field427.field1374, 0, field427.field1375);
					field427.field1375 = 0;
					field150 = 0;
				}
			} catch (IOException var33) {
				method114();
			} catch (Exception var34) {
				method49();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		JMLHLOET var10 = null;
		for (JMLHLOET var11 = (JMLHLOET) field264.method485(); var11 != null; var11 = (JMLHLOET) field264.method487()) {
			if (var11.field790 == arg4 && var11.field792 == arg1 && var11.field793 == arg8 && var11.field791 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new JMLHLOET();
			var10.field790 = arg4;
			var10.field791 = arg3;
			var10.field792 = arg1;
			var10.field793 = arg8;
			method120(var10);
			field264.method482(var10);
		}

		var10.field795 = arg7;
		var10.field797 = arg6;
		var10.field796 = arg2;
		var10.field798 = arg5;
		var10.field794 = arg0;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(BILQQMJEFXK;II)V")
	public final void method40(int arg0, QQMJEFXK arg1, int arg2, int arg3) {
		if (arg1.field1116 == 0 && arg1.field1111 != null && (!arg1.field1089 || field437 == arg1.field1114 || field74 == arg1.field1114 || field443 == arg1.field1114)) {
			int var5 = ZLDPKUPX.field1510;
			int var6 = ZLDPKUPX.field1508;
			int var7 = ZLDPKUPX.field1511;
			int var8 = ZLDPKUPX.field1509;
			ZLDPKUPX.method594(arg1.field1113 + arg3, arg0, arg1.field1109 + arg0, arg3);
			int var9 = arg1.field1111.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field1083[var10] + arg0;
				int var12 = arg1.field1107[var10] + arg3 - arg2;
				QQMJEFXK var13 = QQMJEFXK.method397(arg1.field1111[var10]);
				var11 += var13.field1118;
				var12 += var13.field1090;

				if (var13.field1081 > 0) {
					method98(var13);
				}

				if (var13.field1116 == 0) {
					if (var13.field1112 > var13.field1059 - var13.field1113) {
						var13.field1112 = var13.field1059 - var13.field1113;
					}

					if (var13.field1112 < 0) {
						var13.field1112 = 0;
					}

					method40(var11, var13, var13.field1112, var12);

					if (var13.field1059 > var13.field1113) {
						method142(var12, var13.field1113, var13.field1109 + var11, var13.field1059, var13.field1112);
					}
				} else if (var13.field1116 != 1) {
					if (var13.field1116 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1113; var15++) {
							for (int var16 = 0; var16 < var13.field1109; var16++) {
								int var17 = (var13.field1079 + 32) * var16 + var11;
								int var18 = (var13.field1088 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1078[var14];
									var18 += var13.field1092[var14];
								}

								if (var13.field1086[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1086[var14] - 1;
									if (var17 > ZLDPKUPX.field1510 - 32 && var17 < ZLDPKUPX.field1511 && var18 > ZLDPKUPX.field1508 - 32 && var18 < ZLDPKUPX.field1509 || field358 != 0 && field357 == var14) {
										int var22 = 0;
										if (field173 == 1 && field174 == var14 && field175 == var13.field1114) {
											var22 = 0xFFFFFF;
										}

										WSNKRVXZ var23 = FROOEMOI.method224(var22, var13.field1066[var14], var21);
										if (var23 != null) {
											if (field358 != 0 && field357 == var14 && field356 == var13.field1114) {
												var19 = field692 - field359;
												var20 = field693 - field360;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field103 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method552(128, var17 + var19, var18 + var20);

												if (var18 + var20 < ZLDPKUPX.field1508 && arg1.field1112 > 0) {
													int var24 = (ZLDPKUPX.field1508 - var18 - var20) * field158 / 3;
													if (var24 > field158 * 10) {
														var24 = field158 * 10;
													}

													if (var24 > arg1.field1112) {
														var24 = arg1.field1112;
													}

													arg1.field1112 -= var24;
													field360 += var24;
												}

												if (var18 + var20 + 32 > ZLDPKUPX.field1509 && arg1.field1112 < arg1.field1059 - arg1.field1113) {
													int var25 = (var18 + var20 + 32 - ZLDPKUPX.field1509) * field158 / 3;
													if (var25 > field158 * 10) {
														var25 = field158 * 10;
													}

													if (var25 > arg1.field1059 - arg1.field1113 - arg1.field1112) {
														var25 = arg1.field1059 - arg1.field1113 - arg1.field1112;
													}

													arg1.field1112 += var25;
													field360 -= var25;
												}
											} else if (field116 != 0 && field115 == var14 && field114 == var13.field1114) {
												var23.method552(128, var17, var18);
											} else {
												var23.method550(var17, var18);
											}

											if (var23.field1442 == 33 || var13.field1066[var14] != 1) {
												int var26 = var13.field1066[var14];
												field370.method16(var17 + var19 + 1, 0, method119(var26), var18 + var20 + 10);
												field370.method16(var17 + var19, 0xFFFF00, method119(var26), var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field1070 != null && var14 < 20) {
									WSNKRVXZ var27 = var13.field1070[var14];
									if (var27 != null) {
										var27.method550(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1116 == 3) {
						boolean var28 = false;
						if (field443 == var13.field1114 || field74 == var13.field1114 || field437 == var13.field1114) {
							var28 = true;
						}

						int var29;
						if (method139(var13)) {
							var29 = var13.field1080;
							if (var28 && var13.field1076 != 0) {
								var29 = var13.field1076;
							}
						} else {
							var29 = var13.field1122;
							if (var28 && var13.field1068 != 0) {
								var29 = var13.field1068;
							}
						}

						if (var13.field1085 == 0) {
							if (var13.field1117) {
								ZLDPKUPX.method597(var13.field1109, var29, var13.field1113, var11, var12);
							} else {
								ZLDPKUPX.method598(var13.field1113, var13.field1109, var29, var12, var11);
							}
						} else if (var13.field1117) {
							ZLDPKUPX.method596(var12, 256 - (var13.field1085 & 0xFF), var13.field1113, var13.field1109, var11, var29);
						} else {
							ZLDPKUPX.method599(var12, var29, var11, var13.field1109, 256 - (var13.field1085 & 0xFF), var13.field1113);
						}
					} else if (var13.field1116 == 4) {
						BTJUXBKR var30 = var13.field1115;
						String var31 = var13.field1103;
						boolean var32 = false;
						if (field443 == var13.field1114 || field74 == var13.field1114 || field437 == var13.field1114) {
							var32 = true;
						}

						int var33;
						if (method139(var13)) {
							var33 = var13.field1080;
							if (var32 && var13.field1076 != 0) {
								var33 = var13.field1076;
							}

							if (var13.field1073.length() > 0) {
								var31 = var13.field1073;
							}
						} else {
							var33 = var13.field1122;
							if (var32 && var13.field1068 != 0) {
								var33 = var13.field1068;
							}
						}

						if (var13.field1063 == 6 && field145) {
							var31 = "Please wait...";
							var33 = var13.field1122;
						}

						if (ZLDPKUPX.field1506 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field60 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method77(method131(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method77(method131(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method77(method131(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method77(method131(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method77(method131(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field1065) {
								var30.method13(var41, var34, var13.field1077, var13.field1109 / 2 + var11, var33);
							} else {
								var30.method20(var13.field1077, var34, var33, var11, var41);
							}

							var34 += var30.field60;
						}
					} else if (var13.field1116 == 5) {
						WSNKRVXZ var42;
						if (method139(var13)) {
							var42 = var13.field1097;
						} else {
							var42 = var13.field1087;
						}

						if (var42 != null) {
							var42.method550(var11, var12);
						}
					} else if (var13.field1116 == 6) {
						int var43 = EHATXTET.field597;
						int var44 = EHATXTET.field598;
						EHATXTET.field597 = var13.field1109 / 2 + var11;
						EHATXTET.field598 = var13.field1113 / 2 + var12;
						int var45 = EHATXTET.field601[var13.field1061] * var13.field1060 >> 16;
						int var46 = EHATXTET.field602[var13.field1061] * var13.field1060 >> 16;
						boolean var47 = method139(var13);
						int var48;
						if (var47) {
							var48 = var13.field1058;
						} else {
							var48 = var13.field1057;
						}

						UNLYQRUD var49;
						if (var48 == -1) {
							var49 = var13.method400(-1, var47, -1);
						} else {
							PVVHTYPN var50 = PVVHTYPN.field1006[var48];
							var49 = var13.method400(var50.field1009[var13.field1106], var47, var50.field1008[var13.field1106]);
						}

						if (var49 != null) {
							var49.method463(0, var13.field1062, 0, var13.field1061, 0, var45, var46);
						}

						EHATXTET.field597 = var43;
						EHATXTET.field598 = var44;
					} else {
						if (var13.field1116 == 7) {
							BTJUXBKR var51 = var13.field1115;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1113; var53++) {
								for (int var54 = 0; var54 < var13.field1109; var54++) {
									if (var13.field1086[var52] > 0) {
										FROOEMOI var55 = FROOEMOI.method218(var13.field1086[var52] - 1);
										String var56 = String.valueOf(var55.field626);
										if (var55.field617 || var13.field1066[var52] != 1) {
											var56 = var56 + " x" + method130(var13.field1066[var52]);
										}

										int var57 = (var13.field1079 + 115) * var54 + var11;
										int var58 = (var13.field1088 + 12) * var53 + var12;
										if (var13.field1065) {
											var51.method13(var56, var58, var13.field1077, var13.field1109 / 2 + var57, var13.field1122);
										} else {
											var51.method20(var13.field1077, var58, var13.field1122, var57, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1116 == 8 && (field285 == var13.field1114 || field65 == var13.field1114 || field280 == var13.field1114) && field227 == 100) {
							int var59 = 0;
							int var60 = 0;
							BTJUXBKR var61 = field371;
							String var62 = var13.field1103;
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

								int var65 = var61.method14(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field60 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1109 + var11 - var59 - 5;
							int var67 = var13.field1113 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field1109 + arg0) {
								var66 = arg1.field1109 + arg0 - var59;
							}

							if (var60 + var67 > arg1.field1113 + arg3) {
								var67 = arg1.field1113 + arg3 - var60;
							}

							ZLDPKUPX.method597(var59, 0xFFFFA0, var60, var66, var67);
							ZLDPKUPX.method598(var60, var59, 0, var67, var66);
							String var68 = var13.field1103;
							int var69 = var61.field60 + var67 + 2;
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

								var61.method20(false, var69, 0, var66 + 3, var71);
								var69 += var61.field60 + 1;
							}
						}
					}
				}
			}

			ZLDPKUPX.method594(var8, var5, var7, var6);
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method41(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(LWNCFPLWV;IB)V")
	public final void method42(WNCFPLWV arg0, int arg1) {
		field84 = 0;
		field252 = 0;
		method109(arg0, arg1);
		method59(arg0, arg1);
		method36(arg1, arg0);
		method89(arg1, arg0);

		for (int var3 = 0; var3 < field84; var3++) {
			int var4 = field85[var3];
			if (field230 != field249[var4].field1179) {
				field249[var4] = null;
			}
		}

		if (arg0.field1375 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1375 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field250; var5++) {
			if (field249[field251[var5]] == null) {
				signlink.reporterror(field245 + " null entry in pl list - pos:" + var5 + " size:" + field250);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method43() {
		if (field168 == 2) {
			method112((field152 - field289 << 7) + field155, (field153 - field290 << 7) + field156, field154 * 2);

			if (field472 > -1 && field230 % 20 < 10) {
				field326[0].method550(field472 - 12, field473 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;B)V")
	public final void method44(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field396 != -1) {
			field335 = arg2;
			field698 = 0;
		}

		if (field101 == -1) {
			field70 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field318[var4] = field318[var4 - 1];
			field319[var4] = field319[var4 - 1];
			field320[var4] = field320[var4 - 1];
		}

		field318[0] = arg0;
		field319[0] = arg1;
		field320[0] = arg2;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method45(String arg0) {
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

	@ObfuscatedName("client.l(I)V")
	public final void method46() {
		field286 = false;
		while (field278) {
			field286 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field171 = null;
		field172 = null;
		field391 = null;
		field93 = null;
		field94 = null;
		field95 = null;
		field96 = null;
		field222 = null;
		field223 = null;
		field310 = null;
		field311 = null;
		field196 = null;
		field197 = null;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method47(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field408 = "";
				field409 = "Connecting to server...";
				method147(true);
			}

			field428 = new VAVAOKUB(method63(field132 + 43594), this);
			long var4 = HCBZAWVW.method286(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field427.field1375 = 0;
			field427.method492(14);
			field427.method492(var6);
			field428.method478(field427.field1374, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field428.method475();
			}

			int var8 = field428.method475();
			int var9 = var8;

			if (var8 == 0) {
				field428.method477(field104.field1374, 0, 8);
				field104.field1375 = 0;
				field244 = field104.method508();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field244 >> 32), (int) field244 };
				field427.field1375 = 0;
				field427.method492(10);
				field427.method496(var10[0]);
				field427.method496(var10[1]);
				field427.method496(var10[2]);
				field427.method496(var10[3]);
				field427.method496(signlink.uid);
				field427.method499(arg0);
				field427.method499(arg1);
				field427.method517(field262, field107);
				field493.field1375 = 0;

				if (arg2) {
					field493.method492(18);
				} else {
					field493.method492(16);
				}

				field493.method492(field427.field1375 + 36 + 1 + 1 + 2);
				field493.method492(255);
				field493.method493(373);
				field493.method492(field134 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field493.method496(field438[var11]);
				}

				field493.method500(0, field427.field1374, field427.field1375);
				field427.field1379 = new KDQJDBED(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field137 = new KDQJDBED(var10);
				field428.method478(field493.field1374, 0, field493.field1375);
				var8 = field428.method475();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method47(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field63 = field428.method475();
				field89 = field428.method475() == 1;
				field136 = 0L;
				field192 = 0;
				field83.field778 = 0;
				field689 = true;
				field169 = true;
				field159 = true;
				field427.field1375 = 0;
				field104.field1375 = 0;
				field148 = -1;
				field90 = -1;
				field91 = -1;
				field92 = -1;
				field147 = 0;
				field149 = 0;
				field394 = 0;
				field151 = 0;
				field168 = 0;
				field488 = 0;
				field426 = false;
				field690 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field320[var13] = null;
				}

				field173 = 0;
				field499 = 0;
				field487 = 0;
				field375 = 0;
				field236 = (int) (Math.random() * 100.0D) - 50;
				field234 = (int) (Math.random() * 110.0D) - 55;
				field66 = (int) (Math.random() * 80.0D) - 40;
				field119 = (int) (Math.random() * 120.0D) - 60;
				field379 = (int) (Math.random() * 30.0D) - 20;
				field122 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field160 = 0;
				field304 = -1;
				field255 = 0;
				field256 = 0;
				field250 = 0;
				field432 = 0;

				for (int var14 = 0; var14 < field247; var14++) {
					field249[var14] = null;
					field254[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field431[var15] = null;
				}

				field352 = field249[field248] = new WQWDCUWR();
				field126.method489();
				field183.method489();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field494[var16][var17][var18] = null;
						}
					}
				}

				field264 = new WAPMJSJO();
				field211 = 0;
				field210 = 0;
				method54(field396);
				field396 = -1;
				method54(field101);
				field101 = -1;
				method54(field317);
				field317 = -1;
				method54(field397);
				field397 = -1;
				method54(field306);
				field306 = -1;
				method54(field232);
				field232 = -1;
				method54(field393);
				field393 = -1;
				field145 = false;
				field392 = 3;
				field453 = 0;
				field426 = false;
				field144 = false;
				field335 = null;
				field138 = 0;
				field98 = -1;
				field477 = true;
				method121();

				for (int var19 = 0; var19 < 5; var19++) {
					field281[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field272[var20] = null;
					field273[var20] = false;
				}

				field378 = 0;
				field305 = 0;
				field225 = 0;
				field410 = 0;
				field288 = 0;
				method170();
			} else if (var8 == 3) {
				field408 = "";
				field409 = "Invalid username or password.";
			} else if (var8 == 4) {
				field408 = "Your account has been disabled.";
				field409 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field408 = "Your account is already logged in.";
				field409 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field408 = "RuneScape has been updated!";
				field409 = "Please reload this page.";
			} else if (var8 == 7) {
				field408 = "This world is full.";
				field409 = "Please use a different world.";
			} else if (var8 == 8) {
				field408 = "Unable to connect.";
				field409 = "Login server offline.";
			} else if (var8 == 9) {
				field408 = "Login limit exceeded.";
				field409 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field408 = "Unable to connect.";
				field409 = "Bad session id.";
			} else if (var8 == 12) {
				field408 = "You need a members account to login to this world.";
				field409 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field408 = "Could not complete login.";
				field409 = "Please try using a different world.";
			} else if (var8 == 14) {
				field408 = "The server is being updated.";
				field409 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field159 = true;
				field427.field1375 = 0;
				field104.field1375 = 0;
				field148 = -1;
				field90 = -1;
				field91 = -1;
				field92 = -1;
				field147 = 0;
				field149 = 0;
				field394 = 0;
				field488 = 0;
				field426 = false;
				field457 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field408 = "Login attempts exceeded.";
				field409 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field408 = "You are standing in a members-only area.";
				field409 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field408 = "Invalid loginserver requested";
				field409 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field428.method475();
				for (var21 += 3; var21 >= 0; var21--) {
					field408 = "You have only just left another world";
					field409 = "Your profile will be transferred in: " + var21;
					method147(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method47(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field408 = "Malformed login packet.";
				field409 = "Please try again.";
			} else if (var8 == 23) {
				field408 = "No reply from loginserver.";
				field409 = "Please try again.";
			} else if (var8 == 24) {
				field408 = "Error loading your profile.";
				field409 = "Please contact customer support.";
			} else if (var8 == 25) {
				field408 = "Unexpected loginserver response.";
				field409 = "Please try using a different world.";
			} else if (var8 == 26) {
				field408 = "This computers address has been blocked";
				field409 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field408 = "Unexpected server response";
				field409 = "Please try using a different world.";
			} else if (var9 != 0) {
				field408 = "No response from server";
				field409 = "Please try using a different world.";
			} else if (field414 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field414++;
				method47(arg0, arg1, arg2);
			} else {
				field408 = "No response from loginserver";
				field409 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field408 = "";
			field409 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method48() {
		while (true) {
			LVCMGOBA var1 = field481.method312();
			if (var1 == null) {
				return;
			}

			if (var1.field832 == 0) {
				UNLYQRUD.method440(var1.field835, var1.field833);

				if ((field481.method295(var1.field835) & 0x62) != 0) {
					field161 = true;

					if (field101 != -1 || field396 != -1) {
						field70 = true;
					}
				}
			}

			if (var1.field832 == 1 && var1.field833 != null) {
				DHMWVSMI.method175(var1.field833);
			}

			if (var1.field832 == 2 && field68 == var1.field835 && var1.field833 != null) {
				method92(field69, var1.field833);
			}

			if (var1.field832 == 3 && field487 == 1) {
				for (int var2 = 0; var2 < field216.length; var2++) {
					if (field208[var2] == var1.field835) {
						field216[var2] = var1.field833;

						if (var1.field833 == null) {
							field208[var2] = -1;
						}

						break;
					}

					if (field209[var2] == var1.field835) {
						field135[var2] = var1.field833;

						if (var1.field833 == null) {
							field209[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field832 == 93 && field481.method302(var1.field835)) {
				YTWJKTVW.method565(new WNCFPLWV(var1.field833), field481);
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method49() {
		try {
			if (field428 != null) {
				field428.method474();
			}
		} catch (Exception var2) {
		}

		field428 = null;
		field159 = false;
		field451 = 0;
		field245 = "";
		field246 = "";
		method125();
		field400.method329();

		for (int var1 = 0; var1 < 4; var1++) {
			field415[var1].method228();
		}

		System.gc();
		method81();
		field118 = -1;
		field68 = -1;
		field194 = 0;
	}

	@ObfuscatedName("client.a(BLjava/lang/String;Ljava/lang/String;)V")
	public final void method50(String arg0, String arg1) {
		if (field276 != null) {
			field276.method245();
			EHATXTET.field603 = field204;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field371.method12(var3, arg0, 257, 0);
			field371.method12(var3 - 1, arg0, 256, 0xFFFFFF);
			var3 += 15;
			if (arg1 != null) {
				field371.method12(var3, arg1, 257, 0);
				field371.method12(var3 - 1, arg1, 256, 0xFFFFFF);
			}

			field276.method246(4, field684, 4);
		} else if (field685 != null) {
			field685.method245();
			EHATXTET.field603 = field205;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			ZLDPKUPX.method597(var5, 0, var6, 383 - var5 / 2, var4 - 5 - var6 / 2);
			ZLDPKUPX.method598(var6, var5, 0xFFFFFF, var4 - var6 / 2 - 5, 383 - var5 / 2);

			if (arg1 != null) {
				var4 -= 7;
			}

			field371.method12(var4, arg0, 383, 0);
			field371.method12(var4 - 1, arg0, 382, 0xFFFFFF);
			var4 += 15;
			if (arg1 != null) {
				field371.method12(var4, arg1, 383, 0);
				field371.method12(var4 - 1, arg1, 382, 0xFFFFFF);
			}

			field685.method246(0, field684, 0);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIZZI)Z")
	public final boolean method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field376[var14][var15] = 0;
				field497[var14][var15] = 99999999;
			}
		}

		int var16 = arg2;
		int var17 = arg1;
		field376[arg2][arg1] = 99;
		field497[arg2][arg1] = 0;
		byte var18 = 0;
		int var19 = 0;
		field199[var18] = arg2;
		int var39 = var18 + 1;
		field200[var18] = arg1;
		boolean var20 = false;
		int var21 = field199.length;
		int[][] var22 = field415[field188].field667;
		while (var39 != var19) {
			var16 = field199[var19];
			var17 = field200[var19];
			var19 = (var19 + 1) % var21;

			if (arg4 == var16 && arg10 == var17) {
				var20 = true;
				break;
			}

			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && field415[field188].method237(var17, arg10, arg3, arg4, var16, arg7 - 1)) {
					var20 = true;
					break;
				}

				if (arg7 < 10 && field415[field188].method238(arg10, var17, arg3, arg7 - 1, arg4, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg6 != 0 && arg0 != 0 && field415[field188].method239(arg10, arg4, arg0, arg6, arg5, var16, var17)) {
				var20 = true;
				break;
			}

			int var23 = field497[var16][var17] + 1;
			if (var16 > 0 && field376[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field199[var39] = var16 - 1;
				field200[var39] = var17;
				var39 = (var39 + 1) % var21;
				field376[var16 - 1][var17] = 2;
				field497[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field376[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field199[var39] = var16 + 1;
				field200[var39] = var17;
				var39 = (var39 + 1) % var21;
				field376[var16 + 1][var17] = 8;
				field497[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field376[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field199[var39] = var16;
				field200[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field376[var16][var17 - 1] = 1;
				field497[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field376[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field199[var39] = var16;
				field200[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field376[var16][var17 + 1] = 4;
				field497[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field376[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field199[var39] = var16 - 1;
				field200[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field376[var16 - 1][var17 - 1] = 3;
				field497[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field376[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field199[var39] = var16 + 1;
				field200[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field376[var16 + 1][var17 - 1] = 9;
				field497[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field376[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field199[var39] = var16 - 1;
				field200[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field376[var16 - 1][var17 + 1] = 6;
				field497[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field376[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field199[var39] = var16 + 1;
				field200[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field376[var16 + 1][var17 + 1] = 12;
				field497[var16 + 1][var17 + 1] = var23;
			}
		}

		field491 = 0;
		if (!var20) {
			if (!arg9) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg4 - var26; var27 <= arg4 + var26; var27++) {
				for (int var28 = arg10 - var26; var28 <= arg10 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field497[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg4) {
							var29 = arg4 - var27;
						} else if (var27 > arg4 + arg6 - 1) {
							var29 = var27 + 1 - arg4 - arg6;
						}

						int var30 = 0;
						if (var28 < arg10) {
							var30 = arg10 - var28;
						} else if (var28 > arg0 + arg10 - 1) {
							var30 = var28 + 1 - arg0 - arg10;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field497[var27][var28] < var25) {
							var24 = var31;
							var25 = field497[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg2 == var16 && arg1 == var17) {
				return false;
			}

			field491 = 1;
		}

		byte var32 = 0;
		field199[var32] = var16;
		int var40 = var32 + 1;
		field200[var32] = var17;
		int var33;
		int var34 = var33 = field376[var16][var17];
		while (arg2 != var16 || arg1 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field199[var40] = var16;
				field200[var40++] = var17;
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

			var34 = field376[var16][var17];
		}

		if (var40 <= 0) {
			if (arg8 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field199[var40];
		int var37 = field200[var40];

		if (arg8 == 0) {
			field427.method491(67);
			field427.method492(var35 + var35 + 3);
		}

		if (arg8 == 1) {
			field427.method491(125);
			field427.method492(var35 + var35 + 3 + 14);
		}

		if (arg8 == 2) {
			field427.method491(10);
			field427.method492(var35 + var35 + 3);
		}

		field255 = field199[0];
		field256 = field200[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field427.method518(field199[var40] - var36);
			field427.method492(field200[var40] - var37);
		}

		field427.method526(field290 + var37);
		field427.method492(field702[5] == 1 ? 1 : 0);
		field427.method493(field289 + var36);
		return true;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method52() {
		if (field698 == 1) {
			if (field699 >= 6 && field699 <= 106 && field700 >= 467 && field700 <= 499) {
				field324 = (field324 + 1) % 4;
				field312 = true;
				field70 = true;
				field427.method491(8);
				field427.method492(field324);
				field427.method492(field265);
				field427.method492(field97);
			}

			if (field699 >= 135 && field699 <= 235 && field700 >= 467 && field700 <= 499) {
				field265 = (field265 + 1) % 3;
				field312 = true;
				field70 = true;
				field427.method491(8);
				field427.method492(field324);
				field427.method492(field265);
				field427.method492(field97);
			}

			if (field699 >= 273 && field699 <= 373 && field700 >= 467 && field700 <= 499) {
				field97 = (field97 + 1) % 3;
				field312 = true;
				field70 = true;
				field427.method491(8);
				field427.method492(field324);
				field427.method492(field265);
				field427.method492(field97);
			}

			if (field699 >= 412 && field699 <= 512 && field700 >= 467 && field700 <= 499) {
				if (field317 == -1) {
					method128();
					field100 = "";
					field220 = false;
					field354 = field317 = QQMJEFXK.field1067;
					return;
				}

				method44(0, "", "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method53(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field489; var3++) {
				if (field221[var3] == arg0) {
					field489--;
					field161 = true;

					for (int var4 = var3; var4 < field489; var4++) {
						field221[var4] = field221[var4 + 1];
					}

					field427.method491(35);
					field427.method498(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method54(int arg0) {
		QQMJEFXK.method399(arg0);
	}

	@ObfuscatedName("client.o(I)V")
	public final void method55() {
		if (field160 == 0 && field698 == 1) {
			int var1 = field699 - 25 - 550;
			int var2 = field700 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field122 + field119 & 0x7FF;
				int var4 = EHATXTET.field601[var3];
				int var5 = EHATXTET.field602[var3];
				var4 = (field379 + 256) * var4 >> 8;
				var5 = (field379 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field352.field1195 + var6 >> 7;
				int var9 = field352.field1196 - var7 >> 7;
				boolean var10 = method51(0, field352.field1176[0], field352.field1175[0], 0, var8, 0, 0, 0, 1, true, var9);
				if (var10) {
					field427.method492(var1);
					field427.method492(var2);
					field427.method493(field122);
					field427.method492(57);
					field427.method492(field119);
					field427.method492(field379);
					field427.method492(89);
					field427.method493(field352.field1195);
					field427.method493(field352.field1196);
					field427.method492(field491);
					field427.method492(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method56() {
		field171 = new SSCICQYX(field399, "titlebox", 0);
		field172 = new SSCICQYX(field399, "titlebutton", 0);
		field391 = new SSCICQYX[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field391[var1] = new SSCICQYX(field399, "runes", var1);
		}

		field196 = new WSNKRVXZ(128, 265);
		field197 = new WSNKRVXZ(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field196.field1437[var2] = field297.field708[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field197.field1437[var3] = field298.field708[var3];
		}

		field94 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field94[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field94[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field94[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field94[var7 + 192] = 0xFFFFFF;
		}

		field95 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field95[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field95[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field95[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field95[var11 + 192] = 0xFFFFFF;
		}

		field96 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field96[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field96[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field96[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field96[var15 + 192] = 0xFFFFFF;
		}

		field93 = new int[256];
		field222 = new int[32768];
		field223 = new int[32768];
		method82(null);
		field310 = new int[32768];
		field311 = new int[32768];
		method58(10, "Connecting to fileserver");

		if (!field286) {
			field279 = true;
			field286 = true;
			method31(this, 2);
		}
	}

	@ObfuscatedName("client.a(IZI)Z")
	public final boolean method57(int arg0, int arg1) {
		boolean var3 = false;
		QQMJEFXK var4 = QQMJEFXK.method397(arg0);
		for (int var5 = 0; var5 < var4.field1111.length && var4.field1111[var5] != -1; var5++) {
			QQMJEFXK var6 = QQMJEFXK.method397(var4.field1111[var5]);
			if (var6.field1116 == 0) {
				var3 |= method57(var6.field1114, arg1);
			}

			if (var6.field1116 == 6 && (var6.field1057 != -1 || var6.field1058 != -1)) {
				boolean var7 = method139(var6);
				int var8;
				if (var7) {
					var8 = var6.field1058;
				} else {
					var8 = var6.field1057;
				}

				if (var8 != -1) {
					PVVHTYPN var9 = PVVHTYPN.field1006[var8];
					var6.field1082 += arg1;
					while (var6.field1082 > var9.method390(var6.field1106)) {
						var6.field1082 -= var9.method390(var6.field1106);
						var6.field1106++;
						if (var6.field1106 >= var9.field1007) {
							var6.field1106 -= var9.field1011;
							if (var6.field1106 < 0 || var6.field1106 >= var9.field1007) {
								var6.field1106 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1116 == 6 && var6.field1105 != 0) {
				int var10 = var6.field1105 >> 16;
				int var11 = var6.field1105 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1061 = var6.field1061 + var10 & 0x7FF;
				var6.field1062 = var6.field1062 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(BILjava/lang/String;)V")
	public final void method58(int arg0, String arg1) {
		field446 = arg0;
		field212 = arg1;
		method140();

		if (field399 == null) {
			super.method58(arg0, arg1);
		} else {
			field296.method245();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field372.method12(var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", var3 / 2, 0xFFFFFF);
			int var6 = var4 / 2 - var5 - 18;
			ZLDPKUPX.method598(34, 304, 0x8C1111, var6, var3 / 2 - 152);
			ZLDPKUPX.method598(32, 302, 0, var6 + 1, var3 / 2 - 151);
			ZLDPKUPX.method597(arg0 * 3, 0x8C1111, 30, var3 / 2 - 150, var6 + 2);
			ZLDPKUPX.method597(300 - arg0 * 3, 0, 30, arg0 * 3 + var3 / 2 - 150, var6 + 2);
			field372.method12(var4 / 2 + 5 - var5, arg1, var3 / 2, 0xFFFFFF);
			field296.method246(171, field684, 202);

			if (field185) {
				field185 = false;

				if (!field286) {
					field297.method246(0, field684, 0);
					field298.method246(0, field684, 637);
				}

				field294.method246(0, field684, 128);
				field295.method246(371, field684, 202);
				field299.method246(265, field684, 0);
				field300.method246(265, field684, 562);
				field301.method246(171, field684, 128);
				field302.method246(171, field684, 562);
			}
		}
	}

	@ObfuscatedName("client.a(BLWNCFPLWV;I)V")
	public final void method59(WNCFPLWV arg0, int arg1) {
		int var3 = arg0.method513(8);
		if (var3 < field250) {
			for (int var4 = var3; var4 < field250; var4++) {
				field85[field84++] = field251[var4];
			}
		}

		if (var3 > field250) {
			signlink.reporterror(field245 + " Too many players");
			throw new RuntimeException("eek");
		}

		field250 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field251[var5];
			WQWDCUWR var7 = field249[var6];
			int var8 = arg0.method513(1);
			if (var8 == 0) {
				field251[field250++] = var6;
				var7.field1179 = field230;
			} else {
				int var9 = arg0.method513(2);
				if (var9 == 0) {
					field251[field250++] = var6;
					var7.field1179 = field230;
					field253[field252++] = var6;
				} else if (var9 == 1) {
					field251[field250++] = var6;
					var7.field1179 = field230;
					int var10 = arg0.method513(3);
					var7.method410(false, var10);
					int var11 = arg0.method513(1);
					if (var11 == 1) {
						field253[field252++] = var6;
					}
				} else if (var9 == 2) {
					field251[field250++] = var6;
					var7.field1179 = field230;
					int var12 = arg0.method513(3);
					var7.method410(true, var12);
					int var13 = arg0.method513(3);
					var7.method410(true, var13);
					int var14 = arg0.method513(1);
					if (var14 == 1) {
						field253[field252++] = var6;
					}
				} else if (var9 == 3) {
					field85[field84++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method60() {
		if (field685 == null) {
			method46();
			field294 = null;
			field295 = null;
			field296 = null;
			field297 = null;
			field298 = null;
			field299 = null;
			field300 = null;
			field301 = null;
			field302 = null;
			field277 = null;
			field275 = null;
			field274 = null;
			field276 = null;
			field411 = null;
			field412 = null;
			field413 = null;
			field685 = new GYXQUUFC(503, 765, method117());
			field185 = true;
		}
	}

	@ObfuscatedName("client.a(LWNCFPLWV;LWQWDCUWR;III)V")
	public final void method61(WNCFPLWV arg0, WQWDCUWR arg1, int arg2, int arg3) {
		if ((arg2 & 0x1) != 0) {
			int var5 = arg0.method504();
			if (var5 == 0xFFFF) {
				var5 = -1;
			}

			int var6 = arg0.method502();
			if (arg1.field1162 == var5 && var5 != -1) {
				int var7 = PVVHTYPN.field1006[var5].field1020;
				if (var7 == 1) {
					arg1.field1163 = 0;
					arg1.field1164 = 0;
					arg1.field1165 = var6;
					arg1.field1166 = 0;
				}

				if (var7 == 2) {
					arg1.field1166 = 0;
				}
			} else if (var5 == -1 || arg1.field1162 == -1 || PVVHTYPN.field1006[var5].field1014 >= PVVHTYPN.field1006[arg1.field1162].field1014) {
				arg1.field1162 = var5;
				arg1.field1163 = 0;
				arg1.field1164 = 0;
				arg1.field1165 = var6;
				arg1.field1166 = 0;
				arg1.field1194 = arg1.field1180;
			}
		}

		if ((arg2 & 0x200) != 0) {
			arg1.field1155 = arg0.method502();
			arg1.field1157 = arg0.method521();
			arg1.field1156 = arg0.method502();
			arg1.field1158 = arg0.method502();
			arg1.field1159 = arg0.method530() + field230;
			arg1.field1160 = arg0.method530() + field230;
			arg1.field1161 = arg0.method522();
			arg1.method409();
		}

		if ((arg2 & 0x80) != 0) {
			int var8 = arg0.method520();
			byte[] var9 = new byte[var8];
			WNCFPLWV var10 = new WNCFPLWV(var9);
			arg0.method539(0, var8, var9);
			field254[arg3] = var10;
			arg1.method544(var10);
		}

		if ((arg2 & 0x40) != 0) {
			arg1.field1148 = arg0.method509();
			if (arg1.field1148.charAt(0) == '~') {
				arg1.field1148 = arg1.field1148.substring(1);
				method44(2, arg1.field1427, arg1.field1148);
			} else if (field352 == arg1) {
				method44(2, arg1.field1427, arg1.field1148);
			}

			arg1.field1152 = 0;
			arg1.field1189 = 0;
			arg1.field1202 = 150;
		}

		if ((arg2 & 0x4) != 0) {
			arg1.field1167 = arg0.method529();
			arg1.field1168 = arg0.method529();
		}

		if ((arg2 & 0x10) != 0) {
			int var11 = arg0.method530();
			int var12 = arg0.method522();
			int var13 = arg0.method522();
			int var14 = arg0.field1375;

			if (arg1.field1427 != null && arg1.field1430) {
				long var15 = HCBZAWVW.method286(arg1.field1427);
				boolean var17 = false;
				if (var12 <= 1) {
					for (int var18 = 0; var18 < field489; var18++) {
						if (field221[var18] == var15) {
							var17 = true;
							break;
						}
					}
				}

				if (!var17 && field102 == 0) {
					try {
						field430.field1375 = 0;
						arg0.method538(0, var13, field430.field1374);
						field430.field1375 = 0;
						String var19 = KJZMDELZ.method320(var13, field430);
						var19 = HBDSGKGH.method258(var19);
						arg1.field1148 = var19;
						arg1.field1152 = var11 >> 8;
						arg1.field1189 = var11 & 0xFF;
						arg1.field1202 = 150;

						if (var12 == 2 || var12 == 3) {
							method44(1, "@cr2@" + arg1.field1427, var19);
						} else if (var12 == 1) {
							method44(1, "@cr1@" + arg1.field1427, var19);
						} else {
							method44(2, arg1.field1427, var19);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field1375 = var13 + var14;
		}

		if ((arg2 & 0x2) != 0) {
			arg1.field1190 = arg0.method530();
			if (arg1.field1190 == 0xFFFF) {
				arg1.field1190 = -1;
			}
		}

		if ((arg2 & 0x400) != 0) {
			arg1.field1170 = arg0.method530();
			int var21 = arg0.method537();
			arg1.field1174 = var21 >> 16;
			arg1.field1173 = (var21 & 0xFFFF) + field230;
			arg1.field1171 = 0;
			arg1.field1172 = 0;

			if (arg1.field1173 > field230) {
				arg1.field1171 = -1;
			}

			if (arg1.field1170 == 0xFFFF) {
				arg1.field1170 = -1;
			}
		}

		if ((arg2 & 0x8) != 0) {
			int var22 = arg0.method522();
			int var23 = arg0.method522();
			arg1.method412(var23, field230, var22);
			arg1.field1191 = field230 + 300;
			arg1.field1192 = arg0.method520();
			arg1.field1193 = arg0.method522();
		}

		if ((arg2 & 0x100) != 0) {
			int var24 = arg0.method522();
			int var25 = arg0.method520();
			arg1.method412(var25, field230, var24);
			arg1.field1191 = field230 + 300;
			arg1.field1192 = arg0.method522();
			arg1.field1193 = arg0.method521();
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method62() {
		for (RDFTSKWD var1 = (RDFTSKWD) field183.method485(); var1 != null; var1 = (RDFTSKWD) field183.method487()) {
			if (field188 != var1.field1144 || var1.field1142) {
				var1.method327();
			} else if (field230 >= var1.field1141) {
				var1.method407(field158);

				if (var1.field1142) {
					var1.method327();
				} else {
					field400.method340(false, var1.field1144, var1, 0, var1.field1146, 60, var1.field1147, var1.field1145, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)Ljava/net/Socket;")
	public final Socket method63(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.q(I)V")
	public static final void method64() {
		MCPCRICF.field836 = false;
		EHATXTET.field592 = false;
		field134 = false;
		YTWJKTVW.field1481 = false;
		DZZSWICG.field567 = false;
	}

	@ObfuscatedName("client.b(ILWNCFPLWV;I)V")
	public final void method65(WNCFPLWV arg0, int arg1) {
		while (arg0.field1376 + 21 < arg1 * 8) {
			int var3 = arg0.method513(14);
			if (var3 == 16383) {
				break;
			}

			if (field431[var3] == null) {
				field431[var3] = new UGARWYIU();
			}

			UGARWYIU var4 = field431[var3];
			field433[field432++] = var3;
			var4.field1179 = field230;
			int var5 = arg0.method513(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method513(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method513(1);
			if (var7 == 1) {
				field253[field252++] = var3;
			}

			int var8 = arg0.method513(1);
			var4.field1261 = BJGOYLYN.method4(arg0.method513(13));
			var4.field1177 = var4.field1261.field28;
			var4.field1169 = var4.field1261.field49;
			var4.field1185 = var4.field1261.field24;
			var4.field1186 = var4.field1261.field38;
			var4.field1187 = var4.field1261.field18;
			var4.field1188 = var4.field1261.field46;
			var4.field1149 = var4.field1261.field39;
			var4.method411(field352.field1175[0] + var5, var8 == 1, field352.field1176[0] + var6);
		}

		arg0.method514();
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method66(long arg0) {
		if (arg0 != 0L) {
			if (field210 >= 100 && field71 != 1) {
				method44(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field210 >= 200) {
				method44(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = HCBZAWVW.method290(HCBZAWVW.method287(arg0));
				for (int var4 = 0; var4 < field210; var4++) {
					if (field193[var4] == arg0) {
						method44(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field489; var5++) {
					if (field221[var5] == arg0) {
						method44(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field352.field1427)) {
					field390[field210] = var3;
					field193[field210] = arg0;
					field416[field210] = 0;
					field210++;
					field161 = true;
					field427.method491(128);
					field427.method498(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method67() {
		if (field358 == 0) {
			int var1 = field698;
			if (field499 == 1 && field699 >= 516 && field700 >= 160 && field699 <= 765 && field700 <= 205) {
				var1 = 0;
			}

			if (field426) {
				if (var1 != 1) {
					int var2 = field692;
					int var3 = field693;
					if (field421 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field421 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field421 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field422 - 10 || var2 > field424 + field422 + 10 || var3 < field423 - 10 || var3 > field425 + field423 + 10) {
						field426 = false;

						if (field421 == 1) {
							field161 = true;
						}

						if (field421 == 2) {
							field70 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field422;
					int var5 = field423;
					int var6 = field424;
					int var7 = field699;
					int var8 = field700;
					if (field421 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field421 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field421 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field488; var10++) {
						int var11 = (field488 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method69(var9);
					}

					field426 = false;

					if (field421 == 1) {
						field161 = true;
					}

					if (field421 == 2) {
						field70 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field488 > 0) {
					int var12 = field465[field488 - 1];
					if (var12 == 190 || var12 == 669 || var12 == 516 || var12 == 173 || var12 == 237 || var12 == 205 || var12 == 755 || var12 == 848 || var12 == 840 || var12 == 280 || var12 == 18 || var12 == 1156) {
						int var13 = field463[field488 - 1];
						int var14 = field464[field488 - 1];
						QQMJEFXK var15 = QQMJEFXK.method397(var14);
						if (var15.field1091 || var15.field1075) {
							field485 = false;
							field103 = 0;
							field356 = var14;
							field357 = var13;
							field358 = 2;
							field359 = field699;
							field360 = field700;

							if (QQMJEFXK.method397(var14).field1071 == field317) {
								field358 = 1;
							}

							if (QQMJEFXK.method397(var14).field1071 == field101) {
								field358 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field388 == 1 || method84(field488 - 1)) && field488 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field488 > 0) {
					method69(field488 - 1);
				}

				if (var1 != 2 || field488 <= 0) {
					return;
				}

				method72();
			}
		}
	}

	@ObfuscatedName("client.a(IILWQWDCUWR;II)V")
	public final void method68(int arg0, WQWDCUWR arg1, int arg2, int arg3) {
		if (field352 != arg1 && field488 < 400) {
			String var5;
			if (arg1.field1429 == 0) {
				var5 = arg1.field1427 + method115(arg1.field1435, field352.field1435) + " (level-" + arg1.field1435 + ")";
			} else {
				var5 = arg1.field1427 + " (skill-" + arg1.field1429 + ")";
			}

			if (field173 == 1) {
				field382[field488] = "Use " + field177 + " with @whi@" + var5;
				field465[field488] = 411;
				field466[field488] = arg0;
				field463[field488] = arg3;
				field464[field488] = arg2;
				field488++;
			} else if (field499 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field272[var6] != null) {
						field382[field488] = field272[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field272[var6].equalsIgnoreCase("attack")) {
							if (arg1.field1435 > field352.field1435) {
								var7 = 2000;
							}

							if (field352.field1426 != 0 && arg1.field1426 != 0) {
								if (field352.field1426 == arg1.field1426) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field273[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field465[field488] = var7 + 710;
						}

						if (var6 == 1) {
							field465[field488] = var7 + 116;
						}

						if (var6 == 2) {
							field465[field488] = var7 + 149;
						}

						if (var6 == 3) {
							field465[field488] = var7 + 750;
						}

						if (var6 == 4) {
							field465[field488] = var7 + 740;
						}

						field466[field488] = arg0;
						field463[field488] = arg3;
						field464[field488] = arg2;
						field488++;
					}
				}
			} else if ((field501 & 0x8) == 8) {
				field382[field488] = field502 + " @whi@" + var5;
				field465[field488] = 483;
				field466[field488] = arg0;
				field463[field488] = arg3;
				field464[field488] = arg2;
				field488++;
			}

			for (int var8 = 0; var8 < field488; var8++) {
				if (field465[var8] == 599) {
					field382[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method69(int arg0) {
		if (arg0 >= 0) {
			int var2 = field463[arg0];
			int var3 = field464[arg0];
			int var4 = field465[arg0];
			int var5 = field466[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field453 != 0 && var4 != 1725) {
				field453 = 0;
				field70 = true;
			}

			if (var4 == 497) {
				boolean var6 = method51(0, field352.field1176[0], field352.field1175[0], 0, var2, 0, 0, 0, 2, false, var3);
				if (!var6) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var2, 0, 1, 0, 2, false, var3);
				}

				field459 = field699;
				field460 = field700;
				field462 = 2;
				field461 = 0;
				field305++;
				if (field305 >= 114) {
					field427.method491(153);
					field427.method496(0);
					field305 = 0;
				}

				field427.method491(251);
				field427.method527(field290 + var3);
				field427.method528(var5);
				field427.method528(field289 + var2);
			}

			if (var4 == 560) {
				field427.method491(170);
				field427.method527(var5);
				field427.method527(var2);
				field427.method526(var3);
				field427.method526(field500);
				field113 = 0;
				field114 = var3;
				field115 = var2;
				field116 = 2;
				if (QQMJEFXK.method397(var3).field1071 == field317) {
					field116 = 1;
				}

				if (QQMJEFXK.method397(var3).field1071 == field101) {
					field116 = 3;
				}
			}

			if (var4 == 277 && method85(var2, var3, var5)) {
				field427.method491(185);
				field427.method526(field290 + var3);
				field427.method528(field289 + var2);
				field427.method526(field500);
				field427.method528(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 144) {
				field427.method491(176);
				field427.method493(var3);
				QQMJEFXK var8 = QQMJEFXK.method397(var3);
				if (var8.field1074 != null && var8.field1074[0][0] == 5) {
					int var9 = var8.field1074[0][1];
					field474[var9] = 1 - field474[var9];
					method95(var9);
					field161 = true;
				}
			}

			if (var4 == 1156) {
				FROOEMOI var10 = FROOEMOI.method218(var5);
				QQMJEFXK var11 = QQMJEFXK.method397(var3);
				String var12;
				if (var11 != null && var11.field1066[var2] >= 100000) {
					var12 = var11.field1066[var2] + " x " + var10.field626;
				} else if (var10.field660 == null) {
					var12 = "It's a " + var10.field626 + ".";
				} else {
					var12 = new String(var10.field660);
				}

				method44(0, "", var12);
			}

			if (var4 == 884) {
				UGARWYIU var13 = field431[var5];
				if (var13 != null) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var13.field1175[0], 0, 1, 0, 2, false, var13.field1176[0]);
					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(72);
					field427.method493(var5);
				}
			}

			if (var4 == 825) {
				UGARWYIU var14 = field431[var5];
				if (var14 != null) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var14.field1175[0], 0, 1, 0, 2, false, var14.field1176[0]);
					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field410 += var5;
					if (field410 >= 146) {
						field427.method491(245);
						field427.method493(3789);
						field410 = 0;
					}

					field427.method491(5);
					field427.method493(var5);
				}
			}

			if (var4 == 959) {
				UGARWYIU var15 = field431[var5];
				if (var15 != null) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var15.field1175[0], 0, 1, 0, 2, false, var15.field1176[0]);
					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(220);
					field427.method526(field500);
					field427.method493(var5);
				}
			}

			if (var4 == 264) {
				boolean var16 = method51(0, field352.field1176[0], field352.field1175[0], 0, var2, 0, 0, 0, 2, false, var3);
				if (!var16) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var2, 0, 1, 0, 2, false, var3);
				}

				field459 = field699;
				field460 = field700;
				field462 = 2;
				field461 = 0;
				field427.method491(181);
				field427.method528(field290 + var3);
				field427.method527(var5);
				field427.method527(field289 + var2);
			}

			if (var4 == 750) {
				WQWDCUWR var18 = field249[var5];
				if (var18 != null) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var18.field1175[0], 0, 1, 0, 2, false, var18.field1176[0]);
					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(14);
					field427.method493(var5);
				}
			}

			if (var4 == 840) {
				field427.method491(225);
				field427.method527(var5);
				field427.method527(var2);
				field427.method527(var3);
				field113 = 0;
				field114 = var3;
				field115 = var2;
				field116 = 2;
				if (QQMJEFXK.method397(var3).field1071 == field317) {
					field116 = 1;
				}

				if (QQMJEFXK.method397(var3).field1071 == field101) {
					field116 = 3;
				}
			}

			if (var4 == 265) {
				boolean var19 = method51(0, field352.field1176[0], field352.field1175[0], 0, var2, 0, 0, 0, 2, false, var3);
				if (!var19) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var2, 0, 1, 0, 2, false, var3);
				}

				field459 = field699;
				field460 = field700;
				field462 = 2;
				field461 = 0;
				field427.method491(41);
				field427.method526(field290 + var3);
				field427.method493(var5);
				field427.method493(field289 + var2);
			}

			if (var4 == 369) {
				UGARWYIU var21 = field431[var5];
				if (var21 != null) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var21.field1175[0], 0, 1, 0, 2, false, var21.field1176[0]);
					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(135);
					field427.method528(var5);
				}
			}

			if (var4 == 1250) {
				UGARWYIU var22 = field431[var5];
				if (var22 != null) {
					BJGOYLYN var23 = var22.field1261;
					if (var23.field37 != null) {
						var23 = var23.method6();
					}

					if (var23 != null) {
						String var24;
						if (var23.field15 == null) {
							var24 = "It's a " + var23.field29 + ".";
						} else {
							var24 = new String(var23.field15);
						}

						method44(0, "", var24);
					}
				}
			}

			if (var4 == 755) {
				field427.method491(149);
				field427.method527(var3);
				field427.method527(var2);
				field427.method493(var5);
				field113 = 0;
				field114 = var3;
				field115 = var2;
				field116 = 2;
				if (QQMJEFXK.method397(var3).field1071 == field317) {
					field116 = 1;
				}

				if (QQMJEFXK.method397(var3).field1071 == field101) {
					field116 = 3;
				}
			}

			if (var4 == 282) {
				QQMJEFXK var25 = QQMJEFXK.method397(var3);
				boolean var26 = true;
				if (var25.field1081 > 0) {
					var26 = method155(var25);
				}

				if (var26) {
					field427.method491(176);
					field427.method493(var3);
				}
			}

			if (var4 == 848) {
				field427.method491(143);
				field427.method526(var3);
				field427.method526(var2);
				field427.method493(var5);
				field113 = 0;
				field114 = var3;
				field115 = var2;
				field116 = 2;
				if (QQMJEFXK.method397(var3).field1071 == field317) {
					field116 = 1;
				}

				if (QQMJEFXK.method397(var3).field1071 == field101) {
					field116 = 3;
				}
			}

			if (var4 == 516) {
				field427.method491(142);
				field427.method527(var2);
				field427.method493(var3);
				field427.method526(var5);
				field113 = 0;
				field114 = var3;
				field115 = var2;
				field116 = 2;
				if (QQMJEFXK.method397(var3).field1071 == field317) {
					field116 = 1;
				}

				if (QQMJEFXK.method397(var3).field1071 == field101) {
					field116 = 3;
				}
			}

			if (var4 == 669) {
				field427.method491(187);
				field427.method527(var5);
				field427.method526(var3);
				field427.method528(var2);
				field113 = 0;
				field114 = var3;
				field115 = var2;
				field116 = 2;
				if (QQMJEFXK.method397(var3).field1071 == field317) {
					field116 = 1;
				}

				if (QQMJEFXK.method397(var3).field1071 == field101) {
					field116 = 3;
				}
			}

			if (var4 == 708) {
				UGARWYIU var27 = field431[var5];
				if (var27 != null) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var27.field1175[0], 0, 1, 0, 2, false, var27.field1176[0]);
					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(160);
					field427.method526(var5);
				}
			}

			if (var4 == 190) {
				field427.method491(183);
				field427.method526(var3);
				field427.method528(var5);
				field427.method527(var2);
				field113 = 0;
				field114 = var3;
				field115 = var2;
				field116 = 2;
				if (QQMJEFXK.method397(var3).field1071 == field317) {
					field116 = 1;
				}

				if (QQMJEFXK.method397(var3).field1071 == field101) {
					field116 = 3;
				}
			}

			if (var4 == 599) {
				if (field426) {
					field400.method367(var3 - 4, var2 - 4);
				} else {
					field400.method367(field700 - 4, field699 - 4);
				}
			}

			if (var4 == 1247) {
				FROOEMOI var28 = FROOEMOI.method218(var5);
				String var29;
				if (var28.field660 == null) {
					var29 = "It's a " + var28.field626 + ".";
				} else {
					var29 = new String(var28.field660);
				}

				method44(0, "", var29);
			}

			if (var4 == 625) {
				UGARWYIU var30 = field431[var5];
				if (var30 != null) {
					method51(1, field352.field1176[0], field352.field1175[0], 0, var30.field1175[0], 0, 1, 0, 2, false, var30.field1176[0]);
					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(82);
					field427.method527(field175);
					field427.method526(var5);
					field427.method528(field176);
					field427.method528(field174);
				}
			}

			if (var4 == 112) {
				field427.method491(172);
				field427.method528(field174);
				field427.method493(field176);
				field427.method493(var2);
				field427.method527(field175);
				field427.method528(var3);
				field427.method526(var5);
				field113 = 0;
				field114 = var3;
				field115 = var2;
				field116 = 2;
				if (QQMJEFXK.method397(var3).field1071 == field317) {
					field116 = 1;
				}

				if (QQMJEFXK.method397(var3).field1071 == field101) {
					field116 = 3;
				}
			}

			if (var4 == 18) {
				field173 = 1;
				field174 = var2;
				field175 = var3;
				field176 = var5;
				field177 = String.valueOf(FROOEMOI.method218(var5).field626);
				field499 = 0;
				field161 = true;
			} else {
				if (var4 == 393) {
					field427.method491(176);
					field427.method493(var3);
					QQMJEFXK var31 = QQMJEFXK.method397(var3);
					if (var31.field1074 != null && var31.field1074[0][0] == 5) {
						int var32 = var31.field1074[0][1];
						if (field474[var32] != var31.field1069[0]) {
							field474[var32] = var31.field1069[0];
							method95(var32);
							field161 = true;
						}
					}
				}

				if (var4 == 545) {
					String var33 = field382[arg0];
					int var34 = var33.indexOf("@whi@");
					if (var34 != -1) {
						if (field317 == -1) {
							method128();
							field100 = var33.substring(var34 + 5).trim();
							field220 = false;
							field354 = field317 = QQMJEFXK.field1067;
						} else {
							method44(0, "", "Please close the interface you have open before using 'report abuse'");
						}
					}
				}

				if (var4 == 964) {
					boolean var35 = method51(0, field352.field1176[0], field352.field1175[0], 0, var2, 0, 0, 0, 2, false, var3);
					if (!var35) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var2, 0, 1, 0, 2, false, var3);
					}

					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(31);
					field427.method526(field176);
					field427.method493(var5);
					field427.method527(field174);
					field427.method527(field290 + var3);
					field427.method526(field289 + var2);
					field427.method526(field175);
				}

				if (var4 == 237) {
					field427.method491(224);
					field427.method527(var2);
					field427.method526(var5);
					field427.method526(var3);
					field113 = 0;
					field114 = var3;
					field115 = var2;
					field116 = 2;
					if (QQMJEFXK.method397(var3).field1071 == field317) {
						field116 = 1;
					}

					if (QQMJEFXK.method397(var3).field1071 == field101) {
						field116 = 3;
					}
				}

				if (var4 == 710) {
					WQWDCUWR var37 = field249[var5];
					if (var37 != null) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var37.field1175[0], 0, 1, 0, 2, false, var37.field1176[0]);
						field459 = field699;
						field460 = field700;
						field462 = 2;
						field461 = 0;
						field427.method491(53);
						field427.method493(var5);
					}
				}

				if (var4 == 1436) {
					method85(var2, var3, var5);
					field427.method491(222);
					field427.method527(var5 >> 14 & 0x7FFF);
					field427.method527(field289 + var2);
					field427.method526(field290 + var3);
				}

				if (var4 == 194) {
					method128();
				}

				if (var4 == 756) {
					boolean var38 = method51(0, field352.field1176[0], field352.field1175[0], 0, var2, 0, 0, 0, 2, false, var3);
					if (!var38) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var2, 0, 1, 0, 2, false, var3);
					}

					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(248);
					field427.method528(var5);
					field427.method493(field289 + var2);
					field427.method527(field500);
					field427.method493(field290 + var3);
				}

				if (var4 == 448) {
					boolean var40 = method51(0, field352.field1176[0], field352.field1175[0], 0, var2, 0, 0, 0, 2, false, var3);
					if (!var40) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var2, 0, 1, 0, 2, false, var3);
					}

					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field427.method491(46);
					field427.method528(var5);
					field427.method493(field289 + var2);
					field427.method493(field290 + var3);
				}

				if (var4 == 52 || var4 == 285) {
					String var42 = field382[arg0];
					int var43 = var42.indexOf("@whi@");
					if (var43 != -1) {
						var42 = var42.substring(var43 + 5).trim();
						String var44 = HCBZAWVW.method290(HCBZAWVW.method287(HCBZAWVW.method286(var42)));
						boolean var45 = false;
						for (int var46 = 0; var46 < field250; var46++) {
							WQWDCUWR var47 = field249[field251[var46]];
							if (var47 != null && var47.field1427 != null && var47.field1427.equalsIgnoreCase(var44)) {
								method51(1, field352.field1176[0], field352.field1175[0], 0, var47.field1175[0], 0, 1, 0, 2, false, var47.field1176[0]);

								if (var4 == 52) {
									field427.method491(14);
									field427.method493(field251[var46]);
								}

								if (var4 == 285) {
									field427.method491(53);
									field427.method493(field251[var46]);
								}

								var45 = true;
								break;
							}
						}

						if (!var45) {
							method44(0, "", "Unable to find " + var44);
						}
					}
				}

				if (var4 == 134) {
					method85(var2, var3, var5);
					field427.method491(85);
					field427.method528(field290 + var3);
					field427.method527(field289 + var2);
					field427.method527(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 280) {
					field427.method491(106);
					field427.method526(var5);
					field427.method527(var3);
					field427.method526(var2);
					field113 = 0;
					field114 = var3;
					field115 = var2;
					field116 = 2;
					if (QQMJEFXK.method397(var3).field1071 == field317) {
						field116 = 1;
					}

					if (QQMJEFXK.method397(var3).field1071 == field101) {
						field116 = 3;
					}
				}

				if (var4 == 205) {
					field427.method491(109);
					field427.method493(var2);
					field427.method493(var3);
					field427.method527(var5);
					field113 = 0;
					field114 = var3;
					field115 = var2;
					field116 = 2;
					if (QQMJEFXK.method397(var3).field1071 == field317) {
						field116 = 1;
					}

					if (QQMJEFXK.method397(var3).field1071 == field101) {
						field116 = 3;
					}
				}

				if (var4 == 116) {
					WQWDCUWR var48 = field249[var5];
					if (var48 != null) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var48.field1175[0], 0, 1, 0, 2, false, var48.field1176[0]);
						field459 = field699;
						field460 = field700;
						field462 = 2;
						field461 = 0;
						field427.method491(254);
						field427.method526(var5);
					}
				}

				if (var4 == 1286) {
					int var49 = var5 >> 14 & 0x7FFF;
					DZZSWICG var50 = DZZSWICG.method184(var49);
					String var51;
					if (var50.field588 == null) {
						var51 = "It's a " + var50.field556 + ".";
					} else {
						var51 = new String(var50.field588);
					}

					method44(0, "", var51);
				}

				if (var4 == 203) {
					field378 += var3;
					if (field378 >= 77) {
						field427.method491(208);
						field427.method492(154);
						field378 = 0;
					}

					method85(var2, var3, var5);
					field427.method491(112);
					field427.method526(field289 + var2);
					field427.method526(field290 + var3);
					field427.method493(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 483) {
					WQWDCUWR var52 = field249[var5];
					if (var52 != null) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var52.field1175[0], 0, 1, 0, 2, false, var52.field1176[0]);
						field459 = field699;
						field460 = field700;
						field462 = 2;
						field461 = 0;
						field427.method491(66);
						field427.method493(field500);
						field427.method528(var5);
					}
				}

				if (var4 == 493 || var4 == 968 || var4 == 366 || var4 == 453) {
					String var53 = field382[arg0];
					int var54 = var53.indexOf("@whi@");
					if (var54 != -1) {
						long var55 = HCBZAWVW.method286(var53.substring(var54 + 5).trim());
						if (var4 == 493) {
							method66(var55);
						}

						if (var4 == 968) {
							method141(var55);
						}

						if (var4 == 366) {
							method167(var55);
						}

						if (var4 == 453) {
							method53(var55);
						}
					}
				}

				if (var4 == 886) {
					method85(var2, var3, var5);
					field427.method491(71);
					field427.method527(var5 >> 14 & 0x7FFF);
					field427.method527(field290 + var3);
					field427.method493(field289 + var2);
				}

				if (var4 == 645) {
					method85(var2, var3, var5);
					field427.method491(218);
					field427.method493(field290 + var3);
					field427.method528(field289 + var2);
					field427.method526(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 830) {
					boolean var57 = method51(0, field352.field1176[0], field352.field1175[0], 0, var2, 0, 0, 0, 2, false, var3);
					if (!var57) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var2, 0, 1, 0, 2, false, var3);
					}

					field459 = field699;
					field460 = field700;
					field462 = 2;
					field461 = 0;
					field225++;
					if (field225 >= 89) {
						field427.method491(73);
						field427.method492(156);
						field225 = 0;
					}

					field427.method491(54);
					field427.method528(field290 + var3);
					field427.method493(var5);
					field427.method528(field289 + var2);
				}

				if (var4 == 149) {
					WQWDCUWR var59 = field249[var5];
					if (var59 != null) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var59.field1175[0], 0, 1, 0, 2, false, var59.field1176[0]);
						field459 = field699;
						field460 = field700;
						field462 = 2;
						field461 = 0;
						field427.method491(147);
						field427.method493(var5);
					}
				}

				if (var4 == 740) {
					WQWDCUWR var60 = field249[var5];
					if (var60 != null) {
						method51(1, field352.field1176[0], field352.field1175[0], 0, var60.field1175[0], 0, 1, 0, 2, false, var60.field1176[0]);
						field459 = field699;
						field460 = field700;
						field462 = 2;
						field461 = 0;

						if ((var5 & 0x3) == 0) {
							field288++;
						}

						if (field288 >= 135) {
							field427.method491(127);
							field427.method493(42923);
							field288 = 0;
						}

						field427.method491(58);
						field427.method528(var5);
					}
				}

				if (var4 == 173) {
					field427.method491(237);
					field427.method493(var2);
					field427.method528(var3);
					field427.method527(var5);
					field113 = 0;
					field114 = var3;
					field115 = var2;
					field116 = 2;
					if (QQMJEFXK.method397(var3).field1071 == field317) {
						field116 = 1;
					}

					if (QQMJEFXK.method397(var3).field1071 == field101) {
						field116 = 3;
					}
				}

				if (var4 == 945) {
					String var61 = field382[arg0];
					int var62 = var61.indexOf("@whi@");
					if (var62 != -1) {
						long var63 = HCBZAWVW.method286(var61.substring(var62 + 5).trim());
						int var65 = -1;
						for (int var66 = 0; var66 < field210; var66++) {
							if (field193[var66] == var63) {
								var65 = var66;
								break;
							}
						}

						if (var65 != -1 && field416[var65] > 0) {
							field70 = true;
							field453 = 0;
							field144 = true;
							field82 = "";
							field267 = 3;
							field490 = field193[var65];
							field313 = "Enter message to send to " + field390[var65];
						}
					}
				}

				if (var4 == 507) {
					QQMJEFXK var67 = QQMJEFXK.method397(var3);
					field499 = 1;
					field500 = var3;
					field501 = var67.field1110;
					field173 = 0;
					field161 = true;
					String var68 = var67.field1064;
					if (var68.indexOf(" ") != -1) {
						var68 = var68.substring(0, var68.indexOf(" "));
					}

					String var69 = var67.field1064;
					if (var69.indexOf(" ") != -1) {
						var69 = var69.substring(var69.indexOf(" ") + 1);
					}

					field502 = var68 + " " + var67.field1102 + " " + var69;

					if (field501 == 16) {
						field161 = true;
						field392 = 3;
						field167 = true;
					}
				} else {
					if (var4 == 316) {
						UGARWYIU var70 = field431[var5];
						if (var70 != null) {
							method51(1, field352.field1176[0], field352.field1175[0], 0, var70.field1175[0], 0, 1, 0, 2, false, var70.field1176[0]);
							field459 = field699;
							field460 = field700;
							field462 = 2;
							field461 = 0;
							field427.method491(70);
							field427.method527(var5);
						}
					}

					if (var4 == 613 && method85(var2, var3, var5)) {
						field427.method491(59);
						field427.method527(field175);
						field427.method493(field289 + var2);
						field427.method528(var5 >> 14 & 0x7FFF);
						field427.method528(field176);
						field427.method527(field290 + var3);
						field427.method527(field174);
					}

					if (var4 == 411) {
						WQWDCUWR var71 = field249[var5];
						if (var71 != null) {
							method51(1, field352.field1176[0], field352.field1175[0], 0, var71.field1175[0], 0, 1, 0, 2, false, var71.field1176[0]);
							field459 = field699;
							field460 = field700;
							field462 = 2;
							field461 = 0;
							field427.method491(159);
							field427.method526(field176);
							field427.method527(field174);
							field427.method493(field175);
							field427.method493(var5);
						}
					}

					if (var4 == 588 && !field145) {
						field427.method491(182);
						field427.method493(var3);
						field145 = true;
					}

					if (var4 == 210) {
						method54(field396);
						field396 = -1;
						field70 = true;
					}

					field173 = 0;
					field499 = 0;
					field161 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method70() {
		if (field487 == 2) {
			for (JMLHLOET var1 = (JMLHLOET) field264.method485(); var1 != null; var1 = (JMLHLOET) field264.method487()) {
				if (var1.field794 > 0) {
					var1.field794--;
				}

				if (var1.field794 != 0) {
					if (var1.field798 > 0) {
						var1.field798--;
					}

					if (var1.field798 == 0 && var1.field792 >= 1 && var1.field793 >= 1 && var1.field792 <= 102 && var1.field793 <= 102 && (var1.field795 < 0 || YTWJKTVW.method575(var1.field795, var1.field797))) {
						method88(var1.field793, var1.field790, var1.field796, var1.field797, var1.field791, var1.field795, var1.field792);
						var1.field798 = -1;

						if (var1.field799 == var1.field795 && var1.field799 == -1) {
							var1.method327();
						} else if (var1.field799 == var1.field795 && var1.field800 == var1.field796 && var1.field801 == var1.field797) {
							var1.method327();
						}
					}
				} else if (var1.field799 < 0 || YTWJKTVW.method575(var1.field799, var1.field801)) {
					method88(var1.field793, var1.field790, var1.field800, var1.field801, var1.field791, var1.field799, var1.field792);
					var1.method327();
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method71() {
		field185 = true;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method72() {
		int var1 = field372.method14("Choose Option");
		for (int var2 = 0; var2 < field488; var2++) {
			int var3 = field372.method14(field382[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field488 * 15 + 21;
		if (field699 > 4 && field700 > 4 && field699 < 516 && field700 < 338) {
			int var5 = field699 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field700 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field426 = true;
			field421 = 0;
			field422 = var5;
			field423 = var6;
			field424 = var1;
			field425 = field488 * 15 + 22;
		}

		if (field699 > 553 && field700 > 205 && field699 < 743 && field700 < 466) {
			int var7 = field699 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field700 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field426 = true;
			field421 = 1;
			field422 = var7;
			field423 = var8;
			field424 = var1;
			field425 = field488 * 15 + 22;
		}

		if (field699 > 17 && field700 > 357 && field699 < 496 && field700 < 453) {
			int var9 = field699 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field700 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field426 = true;
			field421 = 2;
			field422 = var9;
			field423 = var10;
			field424 = var1;
			field425 = field488 * 15 + 22;
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method73() {
		field278 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field286) {
				field418++;
				method37();
				method37();
				method76();
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

		field278 = false;
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method74(int arg0) {
		int[] var2 = field257.field1437;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field226[arg0][var7][var5] & 0x18) == 0) {
					field400.method364(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field226[arg0 + 1][var7][var5] & 0x8) != 0) {
					field400.method364(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field257.method545();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field226[arg0][var11][var10] & 0x18) == 0) {
					method171(var9, arg0, var8, var11, var10);
				}

				if (arg0 < 3 && (field226[arg0 + 1][var11][var10] & 0x8) != 0) {
					method171(var9, arg0 + 1, var8, var11, var10);
				}
			}
		}

		if (field276 != null) {
			field276.method245();
			EHATXTET.field603 = field204;
		}

		field484++;
		if (field484 > 134) {
			field484 = 0;
			field427.method491(101);
			field427.method496(0);
		}

		field258 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field400.method358(field188, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = DZZSWICG.method184(var14).field570;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field415[field188].field667;
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

						field271[field258] = field452[var15];
						field259[field258] = var16;
						field260[field258] = var17;
						field258++;
					}
				}
			}
		}

		field72++;
		if (field72 > 196) {
			field72 = 0;
			field427.method491(23);
			field427.method492(203);
		}
	}

	@ObfuscatedName("client.f(B)V")
	public static final void method75() {
		MCPCRICF.field836 = true;
		EHATXTET.field592 = true;
		field134 = true;
		YTWJKTVW.field1481 = true;
		DZZSWICG.field567 = true;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method76() {
		short var1 = 256;

		if (field162 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field162 > 768) {
					field93[var2] = method169(1024 - field162, field95[var2], field94[var2]);
				} else if (field162 > 256) {
					field93[var2] = field95[var2];
				} else {
					field93[var2] = method169(256 - field162, field94[var2], field95[var2]);
				}
			}
		} else if (field163 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field163 > 768) {
					field93[var3] = method169(1024 - field163, field96[var3], field94[var3]);
				} else if (field163 > 256) {
					field93[var3] = field96[var3];
				} else {
					field93[var3] = method169(256 - field163, field94[var3], field96[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field93[var4] = field94[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field297.field708[var5] = field196.field1437[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field195[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field310[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field93[var12];
					int var15 = field297.field708[var7];
					field297.field708[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field297.method246(0, field684, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field298.field708[var16] = field197.field1437[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field195[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field310[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field93[var23];
					int var26 = field298.field708[var18];
					field298.field708[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field298.method246(0, field684, 637);
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public final String method77(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.h(B)V")
	public final void method78() {
		if (field166 != 0) {
			int var1 = 0;
			if (field394 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field320[var2] != null) {
					int var3 = field318[var2];
					String var4 = field319[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field265 == 0 || field265 == 1 && method29(var4))) {
						int var8 = 329 - var1 * 13;
						if (field692 > 4 && field693 - 4 > var8 - 10 && field693 - 4 <= var8 + 3) {
							int var9 = field371.method14("From:  " + var4 + field320[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field692 < var9 + 4) {
								if (field63 >= 1) {
									field382[field488] = "Report abuse @whi@" + var4;
									field465[field488] = 2545;
									field488++;
								}

								field382[field488] = "Add ignore @whi@" + var4;
								field465[field488] = 2968;
								field488++;
								field382[field488] = "Add friend @whi@" + var4;
								field465[field488] = 2493;
								field488++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field265 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method79() {
		if (field358 == 0) {
			field382[0] = "Cancel";
			field465[0] = 1725;
			field488 = 1;
			if (field397 == -1) {
				method78();
				field355 = 0;
				field455 = 0;

				if (field692 > 4 && field693 > 4 && field692 < 516 && field693 < 338) {
					if (field317 == -1) {
						method123();
					} else {
						method122(field693, 0, 0, 4, 4, QQMJEFXK.method397(field317), field692);
					}
				}

				if (field437 != field355) {
					field437 = field355;
				}

				if (field455 != field280) {
					field280 = field455;
				}

				field355 = 0;
				field455 = 0;

				if (field692 > 553 && field693 > 205 && field692 < 743 && field693 < 466) {
					if (field232 != -1) {
						method122(field693, 0, 1, 553, 205, QQMJEFXK.method397(field232), field692);
					} else if (field351[field392] != -1) {
						method122(field693, 0, 1, 553, 205, QQMJEFXK.method397(field351[field392]), field692);
					}
				}

				if (field74 != field355) {
					field161 = true;
					field74 = field355;
				}

				if (field65 != field455) {
					field161 = true;
					field65 = field455;
				}

				field355 = 0;
				field455 = 0;

				if (field692 > 17 && field693 > 357 && field692 < 496 && field693 < 453) {
					if (field101 != -1) {
						method122(field693, 0, 2, 17, 357, QQMJEFXK.method397(field101), field692);
					} else if (field396 != -1) {
						method122(field693, 0, 3, 17, 357, QQMJEFXK.method397(field396), field692);
					} else if (field693 < 434 && field692 < 426 && field453 == 0) {
						method103(field692 - 17, field693 - 357);
					}
				}

				if ((field101 != -1 || field396 != -1) && field443 != field355) {
					field70 = true;
					field443 = field355;
				}

				if ((field101 != -1 || field396 != -1) && field455 != field285) {
					field70 = true;
					field285 = field455;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field488 - 1; var2++) {
						if (field465[var2] < 1000 && field465[var2 + 1] > 1000) {
							String var3 = field382[var2];
							field382[var2] = field382[var2 + 1];
							field382[var2 + 1] = var3;
							int var4 = field465[var2];
							field465[var2] = field465[var2 + 1];
							field465[var2 + 1] = var4;
							int var5 = field463[var2];
							field463[var2] = field463[var2 + 1];
							field463[var2 + 1] = var5;
							int var6 = field464[var2];
							field464[var2] = field464[var2 + 1];
							field464[var2 + 1] = var6;
							int var7 = field466[var2];
							field466[var2] = field466[var2 + 1];
							field466[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field355 = 0;
				field455 = 0;
				method122(field693, 0, 0, 0, 0, QQMJEFXK.method397(field397), field692);

				if (field437 != field355) {
					field437 = field355;
				}

				if (field455 != field280) {
					field280 = field455;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)Z")
	public final boolean method80() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method81() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(ILSSCICQYX;)V")
	public final void method82(SSCICQYX arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field222.length; var3++) {
			field222[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field222[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field223[var9] = (field222[var9 - 1] + field222[var9 + 1] + field222[var9 - 128] + field222[var9 + 128]) / 4;
				}
			}

			int[] var10 = field222;
			field222 = field223;
			field223 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1237; var12++) {
				for (int var13 = 0; var13 < arg0.field1236; var13++) {
					if (arg0.field1234[var11++] != 0) {
						int var14 = var13 + arg0.field1238 + 16;
						int var15 = var12 + arg0.field1239 + 16;
						int var16 = (var15 << 7) + var14;
						field222[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method83() {
		for (int var1 = 0; var1 < field375; var1++) {
			if (field389[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field315[var1] != field282 || field64[var1] != field125) {
						WNCFPLWV var3 = URXFHLNO.method469(field315[var1], field64[var1]);
						if (System.currentTimeMillis() + var3.field1375 / 22 > field323 / 22 + field157) {
							field323 = var3.field1375;
							field157 = System.currentTimeMillis();

							if (method132(var3.field1374, var3.field1375)) {
								field282 = field315[var1];
								field125 = field64[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method80()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field427.method491(121);
						field427.method493(field315[var1] & 0x7FFF);
					} else {
						field427.method491(121);
						field427.method493(-1);
					}
				}

				if (var2 && field389[var1] != -5) {
					field389[var1] = -5;
				} else {
					field375--;
					for (int var5 = var1; var5 < field375; var5++) {
						field315[var5] = field315[var5 + 1];
						field64[var5] = field64[var5 + 1];
						field389[var5] = field389[var5 + 1];
					}

					var1--;
				}
			} else {
				field389[var1]--;
			}
		}

		if (field194 > 0) {
			field194 -= 20;
			if (field194 < 0) {
				field194 = 0;
			}

			if (field194 == 0 && field441 && !field134) {
				field68 = field118;
				field69 = true;
				field481.method309(2, field68);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(II)Z")
	public final boolean method84(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field465[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 493) {
			return true;
		}

		return false;
	}

	public final void run() {
		if (field279) {
			method73();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IBII)Z")
	public final boolean method85(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field400.method359(field188, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			DZZSWICG var8 = DZZSWICG.method184(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field561;
				var10 = var8.field580;
			} else {
				var9 = var8.field580;
				var10 = var8.field561;
			}

			int var11 = var8.field545;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method51(var10, field352.field1176[0], field352.field1175[0], 0, arg0, var11, var9, 0, 2, true, arg1);
		} else {
			method51(0, field352.field1176[0], field352.field1175[0], var7, arg0, 0, 0, var6 + 1, 2, true, arg1);
		}

		field459 = field699;
		field460 = field700;
		field462 = 2;
		field461 = 0;
		return true;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method86() {
		for (int var1 = -1; var1 < field250; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field248;
			} else {
				var2 = field251[var1];
			}

			WQWDCUWR var3 = field249[var2];
			if (var3 != null) {
				method159(var3, 1);
			}
		}

		field340++;
		if (field340 > 1881) {
			field340 = 0;
			field427.method491(207);
			field427.method492(0);
			int var4 = field427.field1375;
			field427.method492((int) (Math.random() * 256.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field427.method492(68);
			}

			field427.method493(46660);
			field427.method493((int) (Math.random() * 65536.0D));
			field427.method493(9575);
			field427.method493(41697);
			field427.method492(216);

			if ((int) (Math.random() * 2.0D) == 0) {
				field427.method493(36121);
			}

			field427.method493(64072);
			field427.method493(26089);
			field427.method501(field427.field1375 - var4);
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method87(boolean arg0) {
		for (int var2 = 0; var2 < field432; var2++) {
			UGARWYIU var3 = field431[field433[var2]];
			int var4 = (field433[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method408() && var3.field1261.field19 == arg0 && var3.field1261.method1()) {
				int var5 = var3.field1195 >> 7;
				int var6 = var3.field1196 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1177 == 1 && (var3.field1195 & 0x7F) == 0x40 && (var3.field1196 & 0x7F) == 0x40) {
						if (field482[var5][var6] == field268) {
							continue;
						}

						field482[var5][var6] = field268;
					}

					if (!var3.field1261.field23) {
						var4 += Integer.MIN_VALUE;
					}

					field400.method340(var3.field1153, field188, var3, var3.field1197, var3.field1196, (var3.field1177 - 1) * 64 + 60, method133(var3.field1195, var3.field1196, field188), var3.field1195, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
			if (field134 && field188 != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg4 == 0) {
				var8 = field400.method355(arg1, arg6, arg0);
			}

			if (arg4 == 1) {
				var8 = field400.method356(arg0, arg6, arg1);
			}

			if (arg4 == 2) {
				var8 = field400.method357(arg1, arg6, arg0);
			}

			if (arg4 == 3) {
				var8 = field400.method358(arg1, arg6, arg0);
			}

			if (var8 != 0) {
				int var12 = field400.method359(arg1, arg6, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg4 == 0) {
					field400.method346(arg0, arg6, arg1);
					DZZSWICG var16 = DZZSWICG.method184(var13);
					if (var16.field555) {
						field415[arg1].method233(var15, arg6, arg0, var16.field579, var14);
					}
				}

				if (arg4 == 1) {
					field400.method347(arg0, arg1, arg6);
				}

				if (arg4 == 2) {
					field400.method348(arg0, arg1, arg6);
					DZZSWICG var17 = DZZSWICG.method184(var13);
					if (var17.field561 + arg6 > 103 || var17.field561 + arg0 > 103 || var17.field580 + arg6 > 103 || var17.field580 + arg0 > 103) {
						return;
					}

					if (var17.field555) {
						field415[arg1].method234(arg6, var17.field579, var17.field580, var17.field561, arg0, var15);
					}
				}

				if (arg4 == 3) {
					field400.method349(arg0, arg1, arg6);
					DZZSWICG var18 = DZZSWICG.method184(var13);
					if (var18.field555 && var18.field569) {
						field415[arg1].method236(arg0, arg6);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (field226[1][arg6][arg0] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				YTWJKTVW.method560(field478, arg5, var19, arg0, field400, field415[arg1], arg3, arg1, arg2, arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILWNCFPLWV;)V")
	public final void method89(int arg0, WNCFPLWV arg1) {
		for (int var3 = 0; var3 < field252; var3++) {
			int var4 = field253[var3];
			WQWDCUWR var5 = field249[var4];
			int var6 = arg1.method502();
			if ((var6 & 0x20) != 0) {
				var6 += arg1.method502() << 8;
			}

			method61(arg1, var5, var6, var4);
		}
	}

	@ObfuscatedName("client.a(ILQQMJEFXK;)Z")
	public final boolean method90(QQMJEFXK arg0) {
		int var2 = arg0.field1081;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field382[field488] = "Remove @whi@" + arg0.field1103;
				field465[field488] = 453;
				field488++;
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

		field382[field488] = "Remove @whi@" + field390[var2];
		field465[field488] = 366;
		field488++;
		field382[field488] = "Message @whi@" + field390[var2];
		field465[field488] = 945;
		field488++;
		return true;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method91() {
		method101();

		if (field462 == 1) {
			field333[field461 / 100].method550(field459 - 8 - 4, field460 - 8 - 4);
		}

		if (field462 == 2) {
			field333[field461 / 100 + 4].method550(field459 - 8 - 4, field460 - 8 - 4);
		}

		if (field393 != -1) {
			method57(field393, field158);
			method40(0, QQMJEFXK.method397(field393), 0, 0);
		}

		if (field317 != -1) {
			method57(field317, field158);
			method40(0, QQMJEFXK.method397(field317), 0, 0);
		}

		method106();

		if (!field426) {
			method79();
			method143();
		} else if (field421 == 0) {
			method173();
		}

		if (field138 == 1) {
			field231.method550(472, 296);
		}

		if (field228) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field680 < 30 && field134) {
				var3 = 0xFF0000;
			}

			if (field680 < 20 && !field134) {
				var3 = 0xFF0000;
			}

			field371.method11("Fps:" + field680, var3, var2, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field134) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field134) {
				int var8 = 0xFF0000;
			}

			field371.method11("Mem:" + var5 + "k", 0xFFFF00, var2, var1);
			var2 += 15;
		}

		if (field394 != 0) {
			int var9 = field394 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field371.method16(4, 0xFFFF00, "System update in: " + var10 + ":0" + var9, 329);
			} else {
				field371.method16(4, 0xFFFF00, "System update in: " + var10 + ":" + var9, 329);
			}
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void method92(boolean arg0, byte[] arg1) {
		if (field441) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method93() {
		Graphics var1 = method117().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method243(1);

		if (field322) {
			field286 = false;
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

		if (field456) {
			field286 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field76) {
			field286 = false;
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

	@ObfuscatedName("client.e(Z)V")
	public final void method94() {
		field274.method245();
		EHATXTET.field603 = field203;
		field447.method428(0, 0);

		if (field232 != -1) {
			method40(0, QQMJEFXK.method397(field232), 0, 0);
		} else if (field351[field392] != -1) {
			method40(0, QQMJEFXK.method397(field351[field392]), 0, 0);
		}

		if (field426 && field421 == 1) {
			method173();
		}

		field274.method246(205, field684, 553);
		field276.method245();
		EHATXTET.field603 = field204;
	}

	@ObfuscatedName("client.e(II)V")
	public final void method95(int arg0) {
		int var2 = SLGAFVQN.field1219[arg0].field1227;
		if (var2 != 0) {
			int var3 = field474[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					EHATXTET.method207(0.9D);
				}

				if (var3 == 2) {
					EHATXTET.method207(0.8D);
				}

				if (var3 == 3) {
					EHATXTET.method207(0.7D);
				}

				if (var3 == 4) {
					EHATXTET.method207(0.6D);
				}

				FROOEMOI.field615.method181();
				field185 = true;
			}

			if (var2 == 3) {
				boolean var4 = field441;

				if (var3 == 0) {
					method41(0, field441);
					field441 = true;
				}

				if (var3 == 1) {
					method41(-400, field441);
					field441 = true;
				}

				if (var3 == 2) {
					method41(-800, field441);
					field441 = true;
				}

				if (var3 == 3) {
					method41(-1200, field441);
					field441 = true;
				}

				if (var3 == 4) {
					field441 = false;
				}

				if (field441 != var4 && !field134) {
					if (field441) {
						field68 = field118;
						field69 = true;
						field481.method309(2, field68);
					} else {
						method81();
					}

					field194 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field269 = true;
					method126(0);
				}

				if (var3 == 1) {
					field269 = true;
					method126(-400);
				}

				if (var3 == 2) {
					field269 = true;
					method126(-800);
				}

				if (var3 == 3) {
					field269 = true;
					method126(-1200);
				}

				if (var3 == 4) {
					field269 = false;
				}
			}

			if (var2 == 5) {
				field388 = var3;
			}

			if (var2 == 6) {
				field479 = var3;
			}

			if (var2 == 8) {
				field166 = var3;
				field70 = true;
			}

			if (var2 == 9) {
				field287 = var3;
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method96() {
		field341 = 0;
		for (int var1 = -1; var1 < field432 + field250; var1++) {
			RODHPQMW var2;
			if (var1 == -1) {
				var2 = field352;
			} else if (var1 < field250) {
				var2 = field249[field251[var1]];
			} else {
				var2 = field431[field433[var1 - field250]];
			}

			if (var2 != null && var2.method408()) {
				if (var2 instanceof UGARWYIU) {
					BJGOYLYN var3 = ((UGARWYIU) var2).field1261;
					if (var3.field37 != null) {
						var3 = var3.method6();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field250) {
					BJGOYLYN var6 = ((UGARWYIU) var2).field1261;
					if (var6.field43 >= 0 && var6.field43 < field75.length) {
						method111(var2, var2.field1151 + 15);

						if (field472 > -1) {
							field75[var6.field43].method550(field472 - 12, field473 - 30);
						}
					}

					if (field168 == 1 && field433[var1 - field250] == field206 && field230 % 20 < 10) {
						method111(var2, var2.field1151 + 15);

						if (field472 > -1) {
							field326[0].method550(field472 - 12, field473 - 28);
						}
					}
				} else {
					int var4 = 30;
					WQWDCUWR var5 = (WQWDCUWR) var2;
					if (var5.field1415 != -1 || var5.field1425 != -1) {
						method111(var2, var2.field1151 + 15);

						if (field472 > -1) {
							if (var5.field1415 != -1) {
								field128[var5.field1415].method550(field472 - 12, field473 - var4);
								var4 += 25;
							}

							if (var5.field1425 != -1) {
								field75[var5.field1425].method550(field472 - 12, field473 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field168 == 10 && field251[var1] == field321) {
						method111(var2, var2.field1151 + 15);

						if (field472 > -1) {
							field326[1].method550(field472 - 12, field473 - var4);
						}
					}
				}

				if (var2.field1148 != null && (var1 >= field250 || field324 == 0 || field324 == 3 || field324 == 1 && method29(((WQWDCUWR) var2).field1427))) {
					method111(var2, var2.field1151);

					if (field472 > -1 && field341 < field342) {
						field346[field341] = field372.method15(var2.field1148) / 2;
						field345[field341] = field372.field60;
						field343[field341] = field472;
						field344[field341] = field473;
						field347[field341] = var2.field1152;
						field348[field341] = var2.field1189;
						field349[field341] = var2.field1202;
						field350[field341++] = var2.field1148;

						if (field479 == 0 && var2.field1189 >= 1 && var2.field1189 <= 3) {
							field345[field341] += 10;
							field344[field341] += 5;
						}

						if (field479 == 0 && var2.field1189 == 4) {
							field346[field341] = 60;
						}

						if (field479 == 0 && var2.field1189 == 5) {
							field345[field341] += 5;
						}
					}
				}

				if (var2.field1191 > field230) {
					method111(var2, var2.field1151 + 15);

					if (field472 > -1) {
						int var7 = var2.field1192 * 30 / var2.field1193;
						if (var7 > 30) {
							var7 = 30;
						}

						ZLDPKUPX.method597(var7, 0xFF00, 5, field472 - 15, field473 - 3);
						ZLDPKUPX.method597(30 - var7, 0xFF0000, 5, field472 + var7 - 15, field473 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1183[var8] > field230) {
						method111(var2, var2.field1151 / 2);

						if (field472 > -1) {
							if (var8 == 1) {
								field473 -= 20;
							}

							if (var8 == 2) {
								field472 -= 15;
								field473 -= 10;
							}

							if (var8 == 3) {
								field472 += 15;
								field473 -= 10;
							}

							field353[var2.field1182[var8]].method550(field472 - 12, field473 - 12);
							field370.method12(field473 + 4, String.valueOf(var2.field1181[var8]), field472, 0);
							field370.method12(field473 + 3, String.valueOf(var2.field1181[var8]), field472 - 1, 0xFFFFFF);
						}
					}
				}
			}
		}

		field334++;
		if (field334 > 1667) {
			field334 = 0;
			field427.method491(33);
			field427.method492(0);
			int var9 = field427.field1375;
			field427.method493((int) (Math.random() * 65536.0D));
			field427.method493(56176);
			field427.method493(44384);
			field427.method492((int) (Math.random() * 256.0D));
			field427.method492((int) (Math.random() * 256.0D));
			field427.method493(5941);
			field427.method492((int) (Math.random() * 256.0D));
			field427.method492(94);
			field427.method492((int) (Math.random() * 256.0D));
			field427.method492(244);
			field427.method501(field427.field1375 - var9);
		}

		for (int var10 = 0; var10 < field341; var10++) {
			int var11 = field343[var10];
			int var12 = field344[var10];
			int var13 = field346[var10];
			int var14 = field345[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field344[var16] - field345[var16] && var12 - var14 < field344[var16] + 2 && var11 - var13 < field346[var16] + field343[var16] && var11 + var13 > field343[var16] - field346[var16] && field344[var16] - field345[var16] < var12) {
						var12 = field344[var16] - field345[var16];
						var15 = true;
					}
				}
			}

			field472 = field343[var10];
			field473 = field344[var10] = var12;
			String var17 = field350[var10];
			if (field479 == 0) {
				int var18 = 0xFFFF00;
				if (field347[var10] < 6) {
					var18 = field440[field347[var10]];
				}

				if (field347[var10] == 6) {
					var18 = field268 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field347[var10] == 7) {
					var18 = field268 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field347[var10] == 8) {
					var18 = field268 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field347[var10] == 9) {
					int var19 = 150 - field349[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field347[var10] == 10) {
					int var20 = 150 - field349[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field347[var10] == 11) {
					int var21 = 150 - field349[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field348[var10] == 0) {
					field372.method12(field473 + 1, var17, field472, 0);
					field372.method12(field473, var17, field472, var18);
				}

				if (field348[var10] == 1) {
					field372.method17(var17, 0, field472, field268, field473 + 1);
					field372.method17(var17, var18, field472, field268, field473);
				}

				if (field348[var10] == 2) {
					field372.method18(field472, field268, 0, field473 + 1, var17);
					field372.method18(field472, field268, var18, field473, var17);
				}

				if (field348[var10] == 3) {
					field372.method19(field268, field473 + 1, 0, 150 - field349[var10], var17, field472);
					field372.method19(field268, field473, var18, 150 - field349[var10], var17, field472);
				}

				if (field348[var10] == 4) {
					int var22 = field372.method15(var17);
					int var23 = (150 - field349[var10]) * (var22 + 100) / 150;
					ZLDPKUPX.method594(334, field472 - 50, field472 + 50, 0);
					field372.method16(field472 + 50 - var23, 0, var17, field473 + 1);
					field372.method16(field472 + 50 - var23, var18, var17, field473);
					ZLDPKUPX.method593();
				}

				if (field348[var10] == 5) {
					int var24 = 150 - field349[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					ZLDPKUPX.method594(field473 + 5, 0, 512, field473 - field372.field60 - 1);
					field372.method12(field473 + var25 + 1, var17, field472, 0);
					field372.method12(field473 + var25, var17, field472, var18);
					ZLDPKUPX.method593();
				}
			} else {
				field372.method12(field473 + 1, var17, field472, 0);
				field372.method12(field473, var17, field472, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method97(String arg0) throws IOException {
		if (field444) {
			if (field450 != null) {
				try {
					field450.close();
				} catch (Exception var4) {
				}

				field450 = null;
			}

			field450 = method63(43595);
			field450.setSoTimeout(10000);
			InputStream var2 = field450.getInputStream();
			OutputStream var3 = field450.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.b(ILQQMJEFXK;)V")
	public final void method98(QQMJEFXK arg0) {
		int var2 = arg0.field1081;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field211 == 0) {
				arg0.field1103 = "Loading friend list";
				arg0.field1063 = 0;
			} else if (var2 == 1 && field211 == 1) {
				arg0.field1103 = "Connecting to friendserver";
				arg0.field1063 = 0;
			} else if (var2 == 2 && field211 != 2) {
				arg0.field1103 = "Please wait...";
				arg0.field1063 = 0;
			} else {
				int var3 = field210;
				if (field211 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1103 = "";
					arg0.field1063 = 0;
				} else {
					arg0.field1103 = field390[var2];
					arg0.field1063 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field210;
			if (field211 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1103 = "";
				arg0.field1063 = 0;
			} else {
				if (field416[var2] == 0) {
					arg0.field1103 = "@red@Offline";
				} else if (field416[var2] < 200) {
					if (field416[var2] == field131) {
						arg0.field1103 = "@gre@World" + (field416[var2] - 9);
					} else {
						arg0.field1103 = "@yel@World" + (field416[var2] - 9);
					}
				} else if (field416[var2] == field131) {
					arg0.field1103 = "@gre@Classic" + (field416[var2] - 219);
				} else {
					arg0.field1103 = "@yel@Classic" + (field416[var2] - 219);
				}

				arg0.field1063 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field210;
			if (field211 != 2) {
				var5 = 0;
			}

			arg0.field1059 = var5 * 15 + 20;
			if (arg0.field1059 <= arg0.field1113) {
				arg0.field1059 = arg0.field1113 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field211 == 0) {
				arg0.field1103 = "Loading ignore list";
				arg0.field1063 = 0;
			} else if (var2 == 1 && field211 == 0) {
				arg0.field1103 = "Please wait...";
				arg0.field1063 = 0;
			} else {
				int var6 = field489;
				if (field211 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1103 = "";
					arg0.field1063 = 0;
				} else {
					arg0.field1103 = HCBZAWVW.method290(HCBZAWVW.method287(field221[var2]));
					arg0.field1063 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1059 = field489 * 15 + 20;
			if (arg0.field1059 <= arg0.field1113) {
				arg0.field1059 = arg0.field1113 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1061 = 150;
			arg0.field1062 = (int) (Math.sin(field230 / 40.0D) * 256.0D) & 0x7FF;

			if (field219) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field130[var7];
					if (var8 >= 0 && !SECEMLXT.field1211[var8].method417()) {
						return;
					}
				}

				field219 = false;
				UNLYQRUD[] var9 = new UNLYQRUD[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field130[var11];
					if (var12 >= 0) {
						var9[var10++] = SECEMLXT.field1211[var12].method418();
					}
				}

				UNLYQRUD var13 = new UNLYQRUD(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field281[var14] != 0) {
						var13.method456(field243[var14][0], field243[var14][field281[var14]]);

						if (var14 == 1) {
							var13.method456(field434[0], field434[field281[var14]]);
						}
					}
				}

				var13.method449();
				var13.method450(PVVHTYPN.field1006[field352.field1149].field1008[0]);
				var13.method459(64, 850, -30, -50, -30, true);
				arg0.field1055 = 5;
				arg0.field1056 = 0;
				QQMJEFXK.method405(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field213 == null) {
				field213 = arg0.field1087;
				field214 = arg0.field1097;
			}

			if (field477) {
				arg0.field1087 = field214;
			} else {
				arg0.field1087 = field213;
			}
		} else if (var2 == 325) {
			if (field213 == null) {
				field213 = arg0.field1087;
				field214 = arg0.field1097;
			}

			if (field477) {
				arg0.field1087 = field213;
			} else {
				arg0.field1087 = field214;
			}
		} else if (var2 == 600) {
			arg0.field1103 = field100;
			if (field230 % 20 < 10) {
				arg0.field1103 = arg0.field1103 + "|";
			} else {
				arg0.field1103 = arg0.field1103 + " ";
			}
		} else if (var2 == 620) {
			if (field63 < 1) {
				arg0.field1103 = "";
			} else if (field220) {
				arg0.field1122 = 0xFF0000;
				arg0.field1103 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1122 = 0xFFFFFF;
				arg0.field1103 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field105 - field165;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1103 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field458 == 0) {
				arg0.field1103 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field458 <= field105) {
				arg0.field1103 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method99(field458);
			} else {
				int var17 = field105 + 14 - field458;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1103 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method99(field458) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field439 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field439 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field439 + " unread messages";
			}

			arg0.field1103 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field233 > 0 && field233 <= field105 + 10) {
				arg0.field1103 = "Last password change:\\n@gre@" + method99(field233);
			} else {
				arg0.field1103 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field198 > 2 && !field133) {
				arg0.field1103 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field198 > 2) {
				arg0.field1103 = "\\n\\nYou have @gre@" + field198 + "@yel@ days of\\nmember credit remaining.";
			} else if (field198 > 0) {
				arg0.field1103 = "You have @gre@" + field198 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1103 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field198 > 2 && !field133) {
				arg0.field1103 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field198 > 0) {
				arg0.field1103 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1103 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field458 > field105) {
				arg0.field1103 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1103 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public final String method99(int arg0) {
		if (arg0 > field105 + 10) {
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

	@ObfuscatedName("client.y(I)V")
	public final void method100() {
		for (int var1 = -1; var1 < field250; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field248;
			} else {
				var2 = field251[var1];
			}

			WQWDCUWR var3 = field249[var2];
			if (var3 != null && var3.field1202 > 0) {
				var3.field1202--;
				if (var3.field1202 == 0) {
					var3.field1148 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field432; var4++) {
			int var5 = field433[var4];
			UGARWYIU var6 = field431[var5];
			if (var6 != null && var6.field1202 > 0) {
				var6.field1202--;
				if (var6.field1202 == 0) {
					var6.field1148 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method101() {
		if (field166 != 0) {
			BTJUXBKR var1 = field371;
			int var2 = 0;
			if (field394 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field320[var3] != null) {
					int var4 = field318[var3];
					String var5 = field319[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field265 == 0 || field265 == 1 && method29(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method16(var8, 0, "From", var7);
						var1.method16(var8, 0xFFFF, "From", var7 - 1);
						int var11 = var8 + var1.method14("From ");
						if (var6 == 1) {
							field191[0].method428(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field191[1].method428(var11, var7 - 12);
							var11 += 14;
						}

						var1.method16(var11, 0, var5 + ": " + field320[var3], var7);
						var1.method16(var11, 0xFFFF, var5 + ": " + field320[var3], var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field265 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method16(4, 0, field320[var3], var9);
						var1.method16(4, 0xFFFF, field320[var3], var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field265 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method16(4, 0, "To " + var5 + ": " + field320[var3], var10);
						var1.method16(4, 0xFFFF, "To " + var5 + ": " + field320[var3], var10 - 1);
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
	public final void method102() {
		method58(20, "Starting up");

		if (signlink.sunjava) {
			field678 = 5;
		}

		if (field327) {
			field76 = true;
		} else {
			field327 = true;
			boolean var1 = false;
			String var2 = method137();
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
						field270[var3] = new TUZTEZTO(signlink.cache_dat, signlink.cache_idx[var3], 600000, var3 + 1);
					}
				}

				try {
					method124();
					field399 = method110("title", field438[1], 1, "title screen", 25);
					field370 = new BTJUXBKR("p11_full", field399, false);
					field371 = new BTJUXBKR("p12_full", field399, false);
					field372 = new BTJUXBKR("b12_full", field399, false);
					field373 = new BTJUXBKR("q8_full", field399, true);
					method152();
					method56();
					RPFMUSNN var4 = method110("config", field438[2], 2, "config", 30);
					RPFMUSNN var5 = method110("interface", field438[3], 3, "interface", 35);
					RPFMUSNN var6 = method110("media", field438[4], 4, "2d graphics", 40);
					RPFMUSNN var7 = method110("textures", field438[6], 6, "textures", 45);
					RPFMUSNN var8 = method110("wordenc", field438[7], 7, "chat system", 50);
					RPFMUSNN var9 = method110("sounds", field438[8], 8, "sound effects", 55);
					field226 = new byte[4][104][104];
					field478 = new int[4][105][105];
					field400 = new MCPCRICF(104, field478, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field415[var10] = new FUVVWALN(104, 104);
					}

					field257 = new WSNKRVXZ(512, 512);
					RPFMUSNN var11 = method110("versionlist", field438[5], 5, "update list", 60);
					method58(60, "Connecting to update server");
					field481 = new HKGQPBYJ();
					field481.method301(var11, this);
					DHMWVSMI.method174(field481.method311());
					UNLYQRUD.method439(field481.method293(0), field481);

					if (!field134) {
						field68 = 0;
						field69 = true;
						field481.method309(2, field68);

						while (field481.method297() > 0) {
							method48();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}

							if (field481.field738 > 3) {
								method45("ondemand");
								return;
							}
						}
					}

					method58(65, "Requesting animations");
					int var12 = field481.method293(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field481.method309(1, var13);
					}

					while (field481.method297() > 0) {
						int var14 = var12 - field481.method297();
						if (var14 > 0) {
							method58(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method48();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}

						if (field481.field738 > 3) {
							method45("ondemand");
							return;
						}
					}

					method58(70, "Requesting models");
					int var15 = field481.method293(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field481.method295(var16);
						if ((var17 & 0x1) != 0) {
							field481.method309(0, var16);
						}
					}

					int var18 = field481.method297();
					while (field481.method297() > 0) {
						int var19 = var18 - field481.method297();
						if (var19 > 0) {
							method58(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method48();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field270[0] != null) {
						method58(75, "Requesting maps");
						field481.method309(3, field481.method298(47, 0, 48));
						field481.method309(3, field481.method298(47, 1, 48));
						field481.method309(3, field481.method298(48, 0, 48));
						field481.method309(3, field481.method298(48, 1, 48));
						field481.method309(3, field481.method298(49, 0, 48));
						field481.method309(3, field481.method298(49, 1, 48));
						field481.method309(3, field481.method298(47, 0, 47));
						field481.method309(3, field481.method298(47, 1, 47));
						field481.method309(3, field481.method298(48, 0, 47));
						field481.method309(3, field481.method298(48, 1, 47));
						field481.method309(3, field481.method298(48, 0, 148));
						field481.method309(3, field481.method298(48, 1, 148));
						int var20 = field481.method297();
						while (field481.method297() > 0) {
							int var21 = var20 - field481.method297();
							if (var21 > 0) {
								method58(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method48();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var22 = field481.method293(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field481.method295(var23);
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
							field481.method306(var23, 0, var25);
						}
					}

					field481.method294(field133);

					if (!field134) {
						int var26 = field481.method293(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field481.method299(var27)) {
								field481.method306(var27, 2, (byte) 1);
							}
						}
					}

					int var28 = field481.method293(0);
					for (int var29 = 0; var29 < var28; var29++) {
						int var30 = field481.method295(var29);
						if (var30 == 0 && field481.field725 < 200) {
							field481.method306(var29, 0, (byte) 1);
						}
					}

					method58(80, "Unpacking media");
					field447 = new SSCICQYX(var6, "invback", 0);
					field449 = new SSCICQYX(var6, "chatback", 0);
					field448 = new SSCICQYX(var6, "mapback", 0);
					field330 = new SSCICQYX(var6, "backbase1", 0);
					field331 = new SSCICQYX(var6, "backbase2", 0);
					field332 = new SSCICQYX(var6, "backhmid1", 0);

					for (int var31 = 0; var31 < 13; var31++) {
						field293[var31] = new SSCICQYX(var6, "sideicons", var31);
					}

					field402 = new WSNKRVXZ(var6, "compass", 0);
					field284 = new WSNKRVXZ(var6, "mapedge", 0);
					field284.method547();

					for (int var32 = 0; var32 < 72; var32++) {
						field201[var32] = new SSCICQYX(var6, "mapscene", var32);
					}

					for (int var33 = 0; var33 < 70; var33++) {
						field452[var33] = new WSNKRVXZ(var6, "mapfunction", var33);
					}

					for (int var34 = 0; var34 < 5; var34++) {
						field353[var34] = new WSNKRVXZ(var6, "hitmarks", var34);
					}

					for (int var35 = 0; var35 < 6; var35++) {
						field128[var35] = new WSNKRVXZ(var6, "headicons_pk", var35);
					}

					for (int var36 = 0; var36 < 9; var36++) {
						field75[var36] = new WSNKRVXZ(var6, "headicons_prayer", var36);
					}

					for (int var37 = 0; var37 < 6; var37++) {
						field326[var37] = new WSNKRVXZ(var6, "headicons_hint", var37);
					}

					field231 = new WSNKRVXZ(var6, "overlay_multiway", 0);
					field406 = new WSNKRVXZ(var6, "mapmarker", 0);
					field407 = new WSNKRVXZ(var6, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field333[var38] = new WSNKRVXZ(var6, "cross", var38);
					}

					field238 = new WSNKRVXZ(var6, "mapdots", 0);
					field239 = new WSNKRVXZ(var6, "mapdots", 1);
					field240 = new WSNKRVXZ(var6, "mapdots", 2);
					field241 = new WSNKRVXZ(var6, "mapdots", 3);
					field242 = new WSNKRVXZ(var6, "mapdots", 4);
					field186 = new SSCICQYX(var6, "scrollbar", 0);
					field187 = new SSCICQYX(var6, "scrollbar", 1);
					field383 = new SSCICQYX(var6, "redstone1", 0);
					field384 = new SSCICQYX(var6, "redstone2", 0);
					field385 = new SSCICQYX(var6, "redstone3", 0);
					field386 = new SSCICQYX(var6, "redstone1", 0);
					field386.method425();
					field387 = new SSCICQYX(var6, "redstone2", 0);
					field387.method425();
					field178 = new SSCICQYX(var6, "redstone1", 0);
					field178.method426();
					field179 = new SSCICQYX(var6, "redstone2", 0);
					field179.method426();
					field180 = new SSCICQYX(var6, "redstone3", 0);
					field180.method426();
					field181 = new SSCICQYX(var6, "redstone1", 0);
					field181.method425();
					field181.method426();
					field182 = new SSCICQYX(var6, "redstone2", 0);
					field182.method425();
					field182.method426();

					for (int var39 = 0; var39 < 2; var39++) {
						field191[var39] = new SSCICQYX(var6, "mod_icons", var39);
					}

					WSNKRVXZ var40 = new WSNKRVXZ(var6, "backleft1", 0);
					field361 = new GYXQUUFC(var40.field1439, var40.field1438, method117());
					var40.method548(0, 0);
					WSNKRVXZ var41 = new WSNKRVXZ(var6, "backleft2", 0);
					field362 = new GYXQUUFC(var41.field1439, var41.field1438, method117());
					var41.method548(0, 0);
					WSNKRVXZ var42 = new WSNKRVXZ(var6, "backright1", 0);
					field363 = new GYXQUUFC(var42.field1439, var42.field1438, method117());
					var42.method548(0, 0);
					WSNKRVXZ var43 = new WSNKRVXZ(var6, "backright2", 0);
					field364 = new GYXQUUFC(var43.field1439, var43.field1438, method117());
					var43.method548(0, 0);
					WSNKRVXZ var44 = new WSNKRVXZ(var6, "backtop1", 0);
					field365 = new GYXQUUFC(var44.field1439, var44.field1438, method117());
					var44.method548(0, 0);
					WSNKRVXZ var45 = new WSNKRVXZ(var6, "backvmid1", 0);
					field366 = new GYXQUUFC(var45.field1439, var45.field1438, method117());
					var45.method548(0, 0);
					WSNKRVXZ var46 = new WSNKRVXZ(var6, "backvmid2", 0);
					field367 = new GYXQUUFC(var46.field1439, var46.field1438, method117());
					var46.method548(0, 0);
					WSNKRVXZ var47 = new WSNKRVXZ(var6, "backvmid3", 0);
					field368 = new GYXQUUFC(var47.field1439, var47.field1438, method117());
					var47.method548(0, 0);
					WSNKRVXZ var48 = new WSNKRVXZ(var6, "backhmid2", 0);
					field369 = new GYXQUUFC(var48.field1439, var48.field1438, method117());
					var48.method548(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 100; var53++) {
						if (field452[var53] != null) {
							field452[var53].method546(var51 + var52, var50 + var52, var49 + var52);
						}

						if (field201[var53] != null) {
							field201[var53].method427(var51 + var52, var50 + var52, var49 + var52);
						}
					}

					method58(83, "Unpacking textures");
					EHATXTET.method203(var7);
					EHATXTET.method207(0.8D);
					EHATXTET.method202(20);
					method58(86, "Unpacking config");
					PVVHTYPN.method389(var4);
					DZZSWICG.method192(var4);
					OMGTLVPK.method381(var4);
					FROOEMOI.method215(var4);
					BJGOYLYN.method8(var4);
					SECEMLXT.method415(var4);
					TYXORIIC.method434(var4);
					SLGAFVQN.method421(var4);
					VKMARKYY.method480(var4);
					FROOEMOI.field631 = field133;

					if (!field134) {
						method58(90, "Unpacking sounds");
						byte[] var54 = var9.method414("sounds.dat", null);
						WNCFPLWV var55 = new WNCFPLWV(var54);
						URXFHLNO.method468(var55);
					}

					method58(95, "Unpacking interfaces");
					BTJUXBKR[] var56 = new BTJUXBKR[] { field370, field371, field372, field373 };
					QQMJEFXK.method402(var5, var56, var6);
					method58(100, "Preparing game engine");

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field448.field1234[field448.field1236 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field498[var57] = var58;
						field398[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field448.field1234[field448.field1236 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field419[var61 - 5] = var62 - 25;
						field146[var61 - 5] = var63 - var62;
					}

					EHATXTET.method200(503, 765);
					field205 = EHATXTET.field603;
					EHATXTET.method200(96, 479);
					field202 = EHATXTET.field603;
					EHATXTET.method200(261, 190);
					field203 = EHATXTET.field603;
					EHATXTET.method200(334, 512);
					field204 = EHATXTET.field603;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = EHATXTET.field601[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					MCPCRICF.method365(var65, 500, 512, 800, 334);
					HBDSGKGH.method248(var8);
					field83 = new IKKPZVXM(this);
					method31(field83, 10);
					HVMNUAXR.field764 = this;
					DZZSWICG.field571 = this;
					BJGOYLYN.field16 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field212 + " " + field446);
					field322 = true;
				}
			} else {
				field456 = true;
			}
		}
	}

	@ObfuscatedName("client.c(III)V")
	public final void method103(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field320[var4] != null) {
				int var5 = field318[var4];
				int var6 = field127 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field319[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field324 == 0 || field324 == 1 && method29(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field352.field1427)) {
						if (field63 >= 1) {
							field382[field488] = "Report abuse @whi@" + var7;
							field465[field488] = 545;
							field488++;
						}

						field382[field488] = "Add ignore @whi@" + var7;
						field465[field488] = 968;
						field488++;
						field382[field488] = "Add friend @whi@" + var7;
						field465[field488] = 493;
						field488++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field166 == 0 && (var5 == 7 || field265 == 0 || field265 == 1 && method29(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field63 >= 1) {
							field382[field488] = "Report abuse @whi@" + var7;
							field465[field488] = 545;
							field488++;
						}

						field382[field488] = "Add ignore @whi@" + var7;
						field465[field488] = 968;
						field488++;
						field382[field488] = "Add friend @whi@" + var7;
						field465[field488] = 493;
						field488++;
					}

					var3++;
				}

				if (var5 == 4 && (field97 == 0 || field97 == 1 && method29(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field382[field488] = "Accept trade @whi@" + var7;
						field465[field488] = 52;
						field488++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field166 == 0 && field265 < 2) {
					var3++;
				}

				if (var5 == 8 && (field97 == 0 || field97 == 1 && method29(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field382[field488] = "Accept challenge @whi@" + var7;
						field465[field488] = 285;
						field488++;
					}

					var3++;
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

	@ObfuscatedName("client.a(ILQQMJEFXK;IIIIIII)V")
	public final void method104(QQMJEFXK arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field266) {
			field224 = 32;
		} else {
			field224 = 0;
		}

		field266 = false;
		if (arg4 >= arg7 && arg4 < arg7 + 16 && arg2 >= arg3 && arg2 < arg3 + 16) {
			arg0.field1112 -= field454 * 4;

			if (arg5 == 1) {
				field161 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field70 = true;
			}
		} else if (arg4 >= arg7 && arg4 < arg7 + 16 && arg2 >= arg1 + arg3 - 16 && arg2 < arg1 + arg3) {
			arg0.field1112 += field454 * 4;

			if (arg5 == 1) {
				field161 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field70 = true;
			}
		} else if (arg4 >= arg7 - field224 && arg4 < arg7 + field224 + 16 && arg2 >= arg3 + 16 && arg2 < arg1 + arg3 - 16 && field454 > 0) {
			int var9 = (arg1 - 32) * arg1 / arg6;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg3 - var9 / 2 - 16;
			int var11 = arg1 - var9 - 32;
			arg0.field1112 = (arg6 - arg1) * var10 / var11;

			if (arg5 == 1) {
				field161 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field70 = true;
			}

			field266 = true;
		}
	}

	@ObfuscatedName("client.a(LWNCFPLWV;II)V")
	public final void method105(WNCFPLWV arg0, int arg1) {
		arg0.method512();
		int var3 = arg0.method513(8);
		if (var3 < field432) {
			for (int var4 = var3; var4 < field432; var4++) {
				field85[field84++] = field433[var4];
			}
		}

		if (var3 > field432) {
			signlink.reporterror(field245 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field432 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field433[var5];
			UGARWYIU var7 = field431[var6];
			int var8 = arg0.method513(1);
			if (var8 == 0) {
				field433[field432++] = var6;
				var7.field1179 = field230;
			} else {
				int var9 = arg0.method513(2);
				if (var9 == 0) {
					field433[field432++] = var6;
					var7.field1179 = field230;
					field253[field252++] = var6;
				} else if (var9 == 1) {
					field433[field432++] = var6;
					var7.field1179 = field230;
					int var10 = arg0.method513(3);
					var7.method410(false, var10);
					int var11 = arg0.method513(1);
					if (var11 == 1) {
						field253[field252++] = var6;
					}
				} else if (var9 == 2) {
					field433[field432++] = var6;
					var7.field1179 = field230;
					int var12 = arg0.method513(3);
					var7.method410(true, var12);
					int var13 = arg0.method513(3);
					var7.method410(true, var13);
					int var14 = arg0.method513(1);
					if (var14 == 1) {
						field253[field252++] = var6;
					}
				} else if (var9 == 3) {
					field85[field84++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method106() {
		field102 = 0;
		int var1 = (field352.field1195 >> 7) + field289;
		int var2 = (field352.field1196 >> 7) + field290;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field102 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field102 = 1;
		}

		if (field102 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field102 = 0;
		}
	}

	@ObfuscatedName("client.b(LWNCFPLWV;II)V")
	public final void method107(WNCFPLWV arg0, int arg1) {
		field84 = 0;
		field252 = 0;
		method105(arg0, arg1);
		method65(arg0, arg1);
		method35(arg0, arg1);

		for (int var3 = 0; var3 < field84; var3++) {
			int var4 = field85[var3];
			if (field230 != field431[var4].field1179) {
				field431[var4].field1261 = null;
				field431[var4] = null;
			}
		}

		if (arg0.field1375 != arg1) {
			signlink.reporterror(field245 + " size mismatch in getnpcpos - pos:" + arg0.field1375 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field432; var5++) {
			if (field431[field433[var5]] == null) {
				signlink.reporterror(field245 + " null entry in npc list - pos:" + var5 + " size:" + field432);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method108() {
		field275.method245();

		if (field160 == 2) {
			byte[] var1 = field448.field1234;
			int[] var2 = ZLDPKUPX.field1505;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field402.method554(field398, 25, 0, field122, 256, 0, 33, 33, field498, 25);
			field276.method245();
			EHATXTET.field603 = field204;
		} else {
			int var5 = field122 + field119 & 0x7FF;
			int var6 = field352.field1195 / 32 + 48;
			int var7 = 464 - field352.field1196 / 32;
			field257.method554(field146, var7, 25, var5, field379 + 256, 5, 146, 151, field419, var6);
			field402.method554(field398, 25, 0, field122, 256, 0, 33, 33, field498, 25);

			for (int var8 = 0; var8 < field258; var8++) {
				int var9 = field259[var8] * 4 + 2 - field352.field1195 / 32;
				int var10 = field260[var8] * 4 + 2 - field352.field1196 / 32;
				method127(var10, var9, field271[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					WAPMJSJO var13 = field494[field188][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field352.field1195 / 32;
						int var15 = var12 * 4 + 2 - field352.field1196 / 32;
						method127(var15, var14, field238);
					}
				}
			}

			for (int var16 = 0; var16 < field432; var16++) {
				UGARWYIU var17 = field431[field433[var16]];
				if (var17 != null && var17.method408()) {
					BJGOYLYN var18 = var17.field1261;
					if (var18.field37 != null) {
						var18 = var18.method6();
					}

					if (var18 != null && var18.field42 && var18.field23) {
						int var19 = var17.field1195 / 32 - field352.field1195 / 32;
						int var20 = var17.field1196 / 32 - field352.field1196 / 32;
						method127(var20, var19, field239);
					}
				}
			}

			for (int var21 = 0; var21 < field250; var21++) {
				WQWDCUWR var22 = field249[field251[var21]];
				if (var22 != null && var22.method408()) {
					int var23 = var22.field1195 / 32 - field352.field1195 / 32;
					int var24 = var22.field1196 / 32 - field352.field1196 / 32;
					boolean var25 = false;
					long var26 = HCBZAWVW.method286(var22.field1427);
					for (int var28 = 0; var28 < field210; var28++) {
						if (field193[var28] == var26 && field416[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field352.field1426 != 0 && var22.field1426 != 0 && field352.field1426 == var22.field1426) {
						var29 = true;
					}

					if (var25) {
						method127(var24, var23, field241);
					} else if (var29) {
						method127(var24, var23, field242);
					} else {
						method127(var24, var23, field240);
					}
				}
			}

			if (field168 != 0 && field230 % 20 < 10) {
				if (field168 == 1 && field206 >= 0 && field206 < field431.length) {
					UGARWYIU var30 = field431[field206];
					if (var30 != null) {
						int var31 = var30.field1195 / 32 - field352.field1195 / 32;
						int var32 = var30.field1196 / 32 - field352.field1196 / 32;
						method135(var32, var31, field407);
					}
				}

				if (field168 == 2) {
					int var33 = (field152 - field289) * 4 + 2 - field352.field1195 / 32;
					int var34 = (field153 - field290) * 4 + 2 - field352.field1196 / 32;
					method135(var34, var33, field407);
				}

				if (field168 == 10 && field321 >= 0 && field321 < field249.length) {
					WQWDCUWR var35 = field249[field321];
					if (var35 != null) {
						int var36 = var35.field1195 / 32 - field352.field1195 / 32;
						int var37 = var35.field1196 / 32 - field352.field1196 / 32;
						method135(var37, var36, field407);
					}
				}
			}

			if (field255 != 0) {
				int var38 = field255 * 4 + 2 - field352.field1195 / 32;
				int var39 = field256 * 4 + 2 - field352.field1196 / 32;
				method127(var39, var38, field406);
			}

			ZLDPKUPX.method597(3, 0xFFFFFF, 3, 97, 78);
			field276.method245();
			EHATXTET.field603 = field204;
		}
	}

	@ObfuscatedName("client.b(LWNCFPLWV;IZ)V")
	public final void method109(WNCFPLWV arg0, int arg1) {
		arg0.method512();
		int var3 = arg0.method513(1);
		if (var3 != 0) {
			int var4 = arg0.method513(2);
			if (var4 == 0) {
				field253[field252++] = field248;
			} else if (var4 == 1) {
				int var5 = arg0.method513(3);
				field352.method410(false, var5);
				int var6 = arg0.method513(1);
				if (var6 == 1) {
					field253[field252++] = field248;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method513(3);
				field352.method410(true, var7);
				int var8 = arg0.method513(3);
				field352.method410(true, var8);
				int var9 = arg0.method513(1);
				if (var9 == 1) {
					field253[field252++] = field248;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method513(1);
				field188 = arg0.method513(2);
				int var11 = arg0.method513(7);
				int var12 = arg0.method513(1);
				if (var12 == 1) {
					field253[field252++] = field248;
				}

				int var13 = arg0.method513(7);
				field352.method411(var11, var10 == 1, var13);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIILjava/lang/String;I)LRPFMUSNN;")
	public final RPFMUSNN method110(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field270[0] != null) {
				var6 = field270[0].method430(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field476.reset();
			field476.update(var6);
			int var8 = (int) field476.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new RPFMUSNN(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method58(arg4, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method97(arg0 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				WNCFPLWV var16 = new WNCFPLWV(var15);
				var16.field1375 = 3;
				int var17 = var16.method506() + 6;
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
						method58(arg4, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field270[0] != null) {
						field270[0].method431(var6, var6.length, arg2);
					}
				} catch (Exception var28) {
					field270[0] = null;
				}

				if (var6 != null) {
					field476.reset();
					field476.update(var6);
					int var23 = (int) field476.getValue();
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
						method58(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						method58(arg4, var11 + " - Retrying in " + var25);
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

				field444 = !field444;
			}
		}

		return new RPFMUSNN(var6);
	}

	@ObfuscatedName("client.a(LRODHPQMW;IB)V")
	public final void method111(RODHPQMW arg0, int arg1) {
		method112(arg0.field1195, arg0.field1196, arg1);
	}

	@ObfuscatedName("client.b(IBII)V")
	public final void method112(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = method133(arg0, arg1, field188) - arg2;
			arg0 -= field467;
			var4 -= field468;
			arg1 -= field469;
			int var5 = UNLYQRUD.field1330[field470];
			int var6 = UNLYQRUD.field1331[field470];
			int var7 = UNLYQRUD.field1330[field471];
			int var8 = UNLYQRUD.field1331[field471];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field472 = (var9 << 9) / arg1 + EHATXTET.field597;
				field473 = (var11 << 9) / arg1 + EHATXTET.field598;
			} else {
				field472 = -1;
				field473 = -1;
			}
		} else {
			field472 = -1;
			field473 = -1;
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method113(int arg0, int arg1) {
		WAPMJSJO var3 = field494[field188][arg0][arg1];
		if (var3 == null) {
			field400.method350(field188, arg0, arg1);
		} else {
			int var4 = -99999999;
			GUTBTNML var5 = null;
			for (GUTBTNML var6 = (GUTBTNML) var3.method485(); var6 != null; var6 = (GUTBTNML) var3.method487()) {
				FROOEMOI var7 = FROOEMOI.method218(var6.field707);
				int var8 = var7.field622;
				if (var7.field617) {
					var8 = (var6.field706 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method483(var5);
			GUTBTNML var9 = null;
			GUTBTNML var10 = null;
			for (GUTBTNML var11 = (GUTBTNML) var3.method485(); var11 != null; var11 = (GUTBTNML) var3.method487()) {
				if (var5.field707 != var11.field707 && var9 == null) {
					var9 = var11;
				}

				if (var5.field707 != var11.field707 && var9.field707 != var11.field707 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field400.method336(arg1, method133(arg0 * 128 + 64, arg1 * 128 + 64, field188), var10, var5, var12, var9, field188, arg0);
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method114() {
		if (field151 > 0) {
			method49();
		} else {
			method50("Connection lost", "Please wait - attempting to reestablish");
			field160 = 0;
			field255 = 0;
			VAVAOKUB var1 = field428;
			field159 = false;
			field414 = 0;
			method47(field245, field246, true);

			if (!field159) {
				method49();
			}

			try {
				var1.method474();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(BII)Ljava/lang/String;")
	public static final String method115(int arg0, int arg1) {
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

	public final void init() {
		field131 = Integer.parseInt(getParameter("nodeid"));
		field132 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method75();
		} else {
			method64();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field133 = false;
		} else {
			field133 = true;
		}

		method241(765, 503);
	}

	@ObfuscatedName("client.h(Z)V")
	public void method116() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field418);

		if (field481 != null) {
			System.out.println("Od-cycle:" + field481.field732);
		}

		System.out.println("loop-cycle:" + field230);
		System.out.println("draw-cycle:" + field88);
		System.out.println("ptype:" + field148);
		System.out.println("psize:" + field147);

		if (field428 != null) {
			field428.method479();
		}

		field681 = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final Component method117() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field687 != null) {
			return field687;
		}

		return this;
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method118(int arg0) {
		QQMJEFXK var2 = QQMJEFXK.method397(arg0);
		for (int var3 = 0; var3 < var2.field1111.length && var2.field1111[var3] != -1; var3++) {
			QQMJEFXK var4 = QQMJEFXK.method397(var2.field1111[var3]);
			if (var4.field1116 == 1) {
				method118(var4.field1114);
			}

			var4.field1106 = 0;
			var4.field1082 = 0;
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public static final String method119(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(LJMLHLOET;I)V")
	public final void method120(JMLHLOET arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field791 == 0) {
			var2 = field400.method355(arg0.field790, arg0.field792, arg0.field793);
		}

		if (arg0.field791 == 1) {
			var2 = field400.method356(arg0.field793, arg0.field792, arg0.field790);
		}

		if (arg0.field791 == 2) {
			var2 = field400.method357(arg0.field790, arg0.field792, arg0.field793);
		}

		if (arg0.field791 == 3) {
			var2 = field400.method358(arg0.field790, arg0.field792, arg0.field793);
		}

		if (var2 != 0) {
			int var6 = field400.method359(arg0.field790, arg0.field792, arg0.field793, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field799 = var3;
		arg0.field801 = var4;
		arg0.field800 = var5;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method121() {
		field219 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field130[var1] = -1;
			for (int var2 = 0; var2 < SECEMLXT.field1210; var2++) {
				if (!SECEMLXT.field1211[var2].field1217 && SECEMLXT.field1211[var2].field1212 == var1 + (field477 ? 0 : 7)) {
					field130[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIBLQQMJEFXK;I)V")
	public final void method122(int arg0, int arg1, int arg2, int arg3, int arg4, QQMJEFXK arg5, int arg6) {
		if (arg5.field1116 == 0 && arg5.field1111 != null && !arg5.field1089 && (arg6 >= arg3 && arg0 >= arg4 && arg6 <= arg5.field1109 + arg3 && arg0 <= arg5.field1113 + arg4)) {
			int var8 = arg5.field1111.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg5.field1083[var9] + arg3;
				int var11 = arg5.field1107[var9] + arg4 - arg1;
				QQMJEFXK var12 = QQMJEFXK.method397(arg5.field1111[var9]);
				var10 += var12.field1118;
				var11 += var12.field1090;
				if ((var12.field1120 >= 0 || var12.field1068 != 0) && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1109 + var10 && arg0 < var12.field1113 + var11) {
					if (var12.field1120 >= 0) {
						field355 = var12.field1120;
					} else {
						field355 = var12.field1114;
					}
				}

				if (var12.field1116 == 8 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1109 + var10 && arg0 < var12.field1113 + var11) {
					field455 = var12.field1114;
				}

				if (var12.field1116 == 0) {
					method122(arg0, var12.field1112, arg2, var10, var11, var12, arg6);

					if (var12.field1059 > var12.field1113) {
						method104(var12, var12.field1113, arg0, var11, arg6, arg2, var12.field1059, var12.field1109 + var10);
					}
				} else {
					if (var12.field1063 == 1 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1109 + var10 && arg0 < var12.field1113 + var11) {
						boolean var13 = false;
						if (var12.field1081 != 0) {
							var13 = method90(var12);
						}

						if (!var13) {
							field382[field488] = var12.field1119;
							field465[field488] = 282;
							field464[field488] = var12.field1114;
							field488++;
						}
					}

					if (var12.field1063 == 2 && field499 == 0 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1109 + var10 && arg0 < var12.field1113 + var11) {
						String var14 = var12.field1064;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field382[field488] = var14 + " @gre@" + var12.field1102;
						field465[field488] = 507;
						field464[field488] = var12.field1114;
						field488++;
					}

					if (var12.field1063 == 3 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1109 + var10 && arg0 < var12.field1113 + var11) {
						field382[field488] = "Close";

						if (arg2 == 3) {
							field465[field488] = 210;
						} else {
							field465[field488] = 194;
						}

						field464[field488] = var12.field1114;
						field488++;
					}

					if (var12.field1063 == 4 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1109 + var10 && arg0 < var12.field1113 + var11) {
						field382[field488] = var12.field1119;
						field465[field488] = 144;
						field464[field488] = var12.field1114;
						field488++;
					}

					if (var12.field1063 == 5 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1109 + var10 && arg0 < var12.field1113 + var11) {
						field382[field488] = var12.field1119;
						field465[field488] = 393;
						field464[field488] = var12.field1114;
						field488++;
					}

					if (var12.field1063 == 6 && !field145 && arg6 >= var10 && arg0 >= var11 && arg6 < var12.field1109 + var10 && arg0 < var12.field1113 + var11) {
						field382[field488] = var12.field1119;
						field465[field488] = 588;
						field464[field488] = var12.field1114;
						field488++;
					}

					if (var12.field1116 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1113; var16++) {
							for (int var17 = 0; var17 < var12.field1109; var17++) {
								int var18 = (var12.field1079 + 32) * var17 + var10;
								int var19 = (var12.field1088 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1078[var15];
									var19 += var12.field1092[var15];
								}

								if (arg6 >= var18 && arg0 >= var19 && arg6 < var18 + 32 && arg0 < var19 + 32) {
									field328 = var15;
									field329 = var12.field1114;

									if (var12.field1086[var15] > 0) {
										FROOEMOI var20 = FROOEMOI.method218(var12.field1086[var15] - 1);
										if (field173 == 1 && var12.field1100) {
											if (field175 != var12.field1114 || field174 != var15) {
												field382[field488] = "Use " + field177 + " with @lre@" + var20.field626;
												field465[field488] = 112;
												field466[field488] = var20.field646;
												field463[field488] = var15;
												field464[field488] = var12.field1114;
												field488++;
											}
										} else if (field499 != 1 || !var12.field1100) {
											if (var12.field1100) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field649 != null && var20.field649[var21] != null) {
														field382[field488] = var20.field649[var21] + " @lre@" + var20.field626;

														if (var21 == 3) {
															field465[field488] = 840;
														}

														if (var21 == 4) {
															field465[field488] = 280;
														}

														field466[field488] = var20.field646;
														field463[field488] = var15;
														field464[field488] = var12.field1114;
														field488++;
													} else if (var21 == 4) {
														field382[field488] = "Drop @lre@" + var20.field626;
														field465[field488] = 280;
														field466[field488] = var20.field646;
														field463[field488] = var15;
														field464[field488] = var12.field1114;
														field488++;
													}
												}
											}

											if (var12.field1121) {
												field382[field488] = "Use @lre@" + var20.field626;
												field465[field488] = 18;
												field466[field488] = var20.field646;
												field463[field488] = var15;
												field464[field488] = var12.field1114;
												field488++;
											}

											if (var12.field1100 && var20.field649 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field649[var22] != null) {
														field382[field488] = var20.field649[var22] + " @lre@" + var20.field626;

														if (var22 == 0) {
															field465[field488] = 205;
														}

														if (var22 == 1) {
															field465[field488] = 755;
														}

														if (var22 == 2) {
															field465[field488] = 848;
														}

														field466[field488] = var20.field646;
														field463[field488] = var15;
														field464[field488] = var12.field1114;
														field488++;
													}
												}
											}

											if (var12.field1104 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1104[var23] != null) {
														field382[field488] = var12.field1104[var23] + " @lre@" + var20.field626;

														if (var23 == 0) {
															field465[field488] = 190;
														}

														if (var23 == 1) {
															field465[field488] = 669;
														}

														if (var23 == 2) {
															field465[field488] = 516;
														}

														if (var23 == 3) {
															field465[field488] = 173;
														}

														if (var23 == 4) {
															field465[field488] = 237;
														}

														field466[field488] = var20.field646;
														field463[field488] = var15;
														field464[field488] = var12.field1114;
														field488++;
													}
												}
											}

											field382[field488] = "Examine @lre@" + var20.field626;
											field465[field488] = 1156;
											field466[field488] = var20.field646;
											field463[field488] = var15;
											field464[field488] = var12.field1114;
											field488++;
										} else if ((field501 & 0x10) == 0x10) {
											field382[field488] = field502 + " @lre@" + var20.field626;
											field465[field488] = 560;
											field466[field488] = var20.field646;
											field463[field488] = var15;
											field464[field488] = var12.field1114;
											field488++;
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
	public final void method123() {
		if (field173 == 0 && field499 == 0) {
			field382[field488] = "Walk here";
			field465[field488] = 599;
			field463[field488] = field692;
			field464[field488] = field693;
			field488++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < UNLYQRUD.field1328; var2++) {
			int var3 = UNLYQRUD.field1329[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field400.method359(field188, var4, var5, var3) >= 0) {
					DZZSWICG var8 = DZZSWICG.method184(var7);
					if (var8.field543 != null) {
						var8 = var8.method191();
					}

					if (var8 == null) {
						continue;
					}

					if (field173 == 1) {
						field382[field488] = "Use " + field177 + " with @cya@" + var8.field556;
						field465[field488] = 613;
						field466[field488] = var3;
						field463[field488] = var4;
						field464[field488] = var5;
						field488++;
					} else if (field499 != 1) {
						if (var8.field550 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field550[var9] != null) {
									field382[field488] = var8.field550[var9] + " @cya@" + var8.field556;

									if (var9 == 0) {
										field465[field488] = 203;
									}

									if (var9 == 1) {
										field465[field488] = 645;
									}

									if (var9 == 2) {
										field465[field488] = 134;
									}

									if (var9 == 3) {
										field465[field488] = 886;
									}

									if (var9 == 4) {
										field465[field488] = 1436;
									}

									field466[field488] = var3;
									field463[field488] = var4;
									field464[field488] = var5;
									field488++;
								}
							}
						}

						field382[field488] = "Examine @cya@" + var8.field556;
						field465[field488] = 1286;
						field466[field488] = var8.field552 << 14;
						field463[field488] = var4;
						field464[field488] = var5;
						field488++;
					} else if ((field501 & 0x4) == 4) {
						field382[field488] = field502 + " @cya@" + var8.field556;
						field465[field488] = 277;
						field466[field488] = var3;
						field463[field488] = var4;
						field464[field488] = var5;
						field488++;
					}
				}

				if (var6 == 1) {
					UGARWYIU var10 = field431[var7];
					if (var10.field1261.field28 == 1 && (var10.field1195 & 0x7F) == 0x40 && (var10.field1196 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field432; var11++) {
							UGARWYIU var12 = field431[field433[var11]];
							if (var12 != null && var10 != var12 && var12.field1261.field28 == 1 && var10.field1195 == var12.field1195 && var10.field1196 == var12.field1196) {
								method28(var5, var4, field433[var11], var12.field1261);
							}
						}

						for (int var13 = 0; var13 < field250; var13++) {
							WQWDCUWR var14 = field249[field251[var13]];
							if (var14 != null && var10.field1195 == var14.field1195 && var10.field1196 == var14.field1196) {
								method68(field251[var13], var14, var5, var4);
							}
						}
					}

					method28(var5, var4, var7, var10.field1261);
				}

				if (var6 == 0) {
					WQWDCUWR var15 = field249[var7];
					if ((var15.field1195 & 0x7F) == 0x40 && (var15.field1196 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field432; var16++) {
							UGARWYIU var17 = field431[field433[var16]];
							if (var17 != null && var17.field1261.field28 == 1 && var15.field1195 == var17.field1195 && var15.field1196 == var17.field1196) {
								method28(var5, var4, field433[var16], var17.field1261);
							}
						}

						for (int var18 = 0; var18 < field250; var18++) {
							WQWDCUWR var19 = field249[field251[var18]];
							if (var19 != null && var15 != var19 && var15.field1195 == var19.field1195 && var15.field1196 == var19.field1196) {
								method68(field251[var18], var19, var5, var4);
							}
						}
					}

					method68(var7, var15, var5, var4);
				}

				if (var6 == 3) {
					WAPMJSJO var20 = field494[field188][var4][var5];
					if (var20 != null) {
						for (GUTBTNML var21 = (GUTBTNML) var20.method486(); var21 != null; var21 = (GUTBTNML) var20.method488()) {
							FROOEMOI var22 = FROOEMOI.method218(var21.field707);
							if (field173 == 1) {
								field382[field488] = "Use " + field177 + " with @lre@" + var22.field626;
								field465[field488] = 964;
								field466[field488] = var21.field707;
								field463[field488] = var4;
								field464[field488] = var5;
								field488++;
							} else if (field499 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field638 != null && var22.field638[var23] != null) {
										field382[field488] = var22.field638[var23] + " @lre@" + var22.field626;

										if (var23 == 0) {
											field465[field488] = 448;
										}

										if (var23 == 1) {
											field465[field488] = 264;
										}

										if (var23 == 2) {
											field465[field488] = 830;
										}

										if (var23 == 3) {
											field465[field488] = 497;
										}

										if (var23 == 4) {
											field465[field488] = 265;
										}

										field466[field488] = var21.field707;
										field463[field488] = var4;
										field464[field488] = var5;
										field488++;
									} else if (var23 == 2) {
										field382[field488] = "Take @lre@" + var22.field626;
										field465[field488] = 830;
										field466[field488] = var21.field707;
										field463[field488] = var4;
										field464[field488] = var5;
										field488++;
									}
								}

								field382[field488] = "Examine @lre@" + var22.field626;
								field465[field488] = 1247;
								field466[field488] = var21.field707;
								field463[field488] = var4;
								field464[field488] = var5;
								field488++;
							} else if ((field501 & 0x1) == 1) {
								field382[field488] = field502 + " @lre@" + var22.field626;
								field465[field488] = 756;
								field466[field488] = var21.field707;
								field463[field488] = var4;
								field464[field488] = var5;
								field488++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method124() {
		int var1 = 5;
		field438[8] = 0;
		int var2 = 0;
		while (field438[8] == 0) {
			String var3 = "Unknown problem";
			method58(20, "Connecting to web server");

			try {
				DataInputStream var4 = method97("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 373);
				WNCFPLWV var5 = new WNCFPLWV(new byte[40]);
				var4.readFully(var5.field1374, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field438[var6] = var5.method507();
				}

				int var7 = var5.method507();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field438[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field438[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field438[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field438[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field438[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field438[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method58(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method58(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field444 = !field444;
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method125() {
		DZZSWICG.field581.method181();
		DZZSWICG.field544.method181();
		BJGOYLYN.field36.method181();
		FROOEMOI.field628.method181();
		FROOEMOI.field615.method181();
		WQWDCUWR.field1411.method181();
		TYXORIIC.field1260.method181();
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method126(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(IIZLWSNKRVXZ;)V")
	public final void method127(int arg0, int arg1, WSNKRVXZ arg2) {
		if (arg2 != null) {
			int var4 = field122 + field119 & 0x7FF;
			int var5 = arg0 * arg0 + arg1 * arg1;
			if (var5 <= 6400) {
				int var6 = UNLYQRUD.field1330[var4];
				int var7 = UNLYQRUD.field1331[var4];
				var6 = var6 * 256 / (field379 + 256);
				var7 = var7 * 256 / (field379 + 256);
				int var8 = arg0 * var6 + arg1 * var7 >> 16;
				int var9 = arg0 * var7 - arg1 * var6 >> 16;
				if (var5 > 2500) {
					arg2.method556(var8 + 94 + 4 - arg2.field1442 / 2, field448, 83 - var9 - arg2.field1443 / 2 - 4);
				} else {
					arg2.method550(var8 + 94 + 4 - arg2.field1442 / 2, 83 - var9 - arg2.field1443 / 2 - 4);
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method128() {
		field427.method491(178);

		if (field232 != -1) {
			method54(field232);
			field232 = -1;
			field161 = true;
			field145 = false;
			field167 = true;
		}

		if (field101 != -1) {
			method54(field101);
			field101 = -1;
			field70 = true;
			field145 = false;
		}

		if (field397 != -1) {
			method54(field397);
			field397 = -1;
			field185 = true;
		}

		if (field306 != -1) {
			method54(field306);
			field306 = -1;
		}

		if (field317 != -1) {
			method54(field317);
			field317 = -1;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method129() {
		while (true) {
			int var1 = method244();
			if (var1 == -1) {
				return;
			}

			if (field317 != -1 && field354 == field317) {
				if (var1 == 8 && field100.length() > 0) {
					field100 = field100.substring(0, field100.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field100.length() < 12) {
					field100 = field100 + (char) var1;
				}
			} else if (field144) {
				if (var1 >= 32 && var1 <= 122 && field82.length() < 80) {
					field82 = field82 + (char) var1;
					field70 = true;
				}

				if (var1 == 8 && field82.length() > 0) {
					field82 = field82.substring(0, field82.length() - 1);
					field70 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field144 = false;
					field70 = true;

					if (field267 == 1) {
						long var2 = HCBZAWVW.method286(field82);
						method66(var2);
					}

					if (field267 == 2 && field210 > 0) {
						long var4 = HCBZAWVW.method286(field82);
						method167(var4);
					}

					if (field267 == 3 && field82.length() > 0) {
						field427.method491(235);
						field427.method492(0);
						int var6 = field427.field1375;
						field427.method498(field490);
						KJZMDELZ.method321(field82, field427);
						field427.method501(field427.field1375 - var6);
						field82 = KJZMDELZ.method322(field82);
						field82 = HBDSGKGH.method258(field82);
						method44(6, HCBZAWVW.method290(HCBZAWVW.method287(field490)), field82);

						if (field265 == 2) {
							field265 = 1;
							field312 = true;
							field427.method491(8);
							field427.method492(field324);
							field427.method492(field265);
							field427.method492(field97);
						}
					}

					if (field267 == 4 && field489 < 100) {
						long var7 = HCBZAWVW.method286(field82);
						method141(var7);
					}

					if (field267 == 5 && field489 > 0) {
						long var9 = HCBZAWVW.method286(field82);
						method53(var9);
					}
				}
			} else if (field453 == 1) {
				if (var1 >= 48 && var1 <= 57 && field486.length() < 10) {
					field486 = field486 + (char) var1;
					field70 = true;
				}

				if (var1 == 8 && field486.length() > 0) {
					field486 = field486.substring(0, field486.length() - 1);
					field70 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field486.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field486);
						} catch (Exception var21) {
						}

						field427.method491(24);
						field427.method496(var11);
					}

					field453 = 0;
					field70 = true;
				}
			} else if (field453 == 2) {
				if (var1 >= 32 && var1 <= 122 && field486.length() < 12) {
					field486 = field486 + (char) var1;
					field70 = true;
				}

				if (var1 == 8 && field486.length() > 0) {
					field486 = field486.substring(0, field486.length() - 1);
					field70 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field486.length() > 0) {
						field427.method491(25);
						field427.method498(HCBZAWVW.method286(field486));
					}

					field453 = 0;
					field70 = true;
				}
			} else if (field453 == 3) {
				if (var1 >= 32 && var1 <= 122 && field486.length() < 40) {
					field486 = field486 + (char) var1;
					field70 = true;
				}

				if (var1 == 8 && field486.length() > 0) {
					field486 = field486.substring(0, field486.length() - 1);
					field70 = true;
				}
			} else if (field101 == -1 && field397 == -1) {
				if (var1 >= 32 && var1 <= 122 && field475.length() < 80) {
					field475 = field475 + (char) var1;
					field70 = true;
				}

				if (var1 == 8 && field475.length() > 0) {
					field475 = field475.substring(0, field475.length() - 1);
					field70 = true;
				}

				if ((var1 == 13 || var1 == 10) && field475.length() > 0) {
					if (field63 == 2) {
						if (field475.equals("::clientdrop")) {
							method114();
						}

						if (field475.equals("::lag")) {
							method116();
						}

						if (field475.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field481.method293(2); var12++) {
								field481.method306(var12, 2, (byte) 1);
							}
						}

						if (field475.equals("::fpson")) {
							field228 = true;
						}

						if (field475.equals("::fpsoff")) {
							field228 = false;
						}

						if (field475.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field415[var13].field667[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field475.startsWith("::")) {
						field427.method491(151);
						field427.method492(field475.length() - 1);
						field427.method499(field475.substring(2));
					} else {
						String var16 = field475.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field475 = field475.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field475 = field475.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field475 = field475.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field475 = field475.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field475 = field475.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field475 = field475.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field475 = field475.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field475 = field475.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field475 = field475.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field475 = field475.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field475 = field475.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field475 = field475.substring(6);
						}

						String var18 = field475.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field475 = field475.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field475 = field475.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field475 = field475.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field475 = field475.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field475 = field475.substring(6);
						}

						field427.method491(130);
						field427.method492(0);
						int var20 = field427.field1375;
						field427.method519(var17);
						field430.field1375 = 0;
						KJZMDELZ.method321(field475, field430);
						field427.method500(0, field430.field1374, field430.field1375);
						field427.method518(var19);
						field427.method501(field427.field1375 - var20);
						field475 = KJZMDELZ.method322(field475);
						field475 = HBDSGKGH.method258(field475);
						field352.field1148 = field475;
						field352.field1152 = var17;
						field352.field1189 = var19;
						field352.field1202 = 150;

						if (field63 == 2) {
							method44(2, "@cr2@" + field352.field1427, field352.field1148);
						} else if (field63 == 1) {
							method44(2, "@cr1@" + field352.field1427, field352.field1148);
						} else {
							method44(2, field352.field1427, field352.field1148);
						}

						if (field324 == 2) {
							field324 = 3;
							field312 = true;
							field427.method491(8);
							field427.method492(field324);
							field427.method492(field265);
							field427.method492(field97);
						}
					}

					field475 = "";
					field70 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method130(int arg0) {
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

	@ObfuscatedName("client.a(LQQMJEFXK;II)I")
	public final int method131(QQMJEFXK arg0, int arg1) {
		if (arg0.field1074 == null || arg1 >= arg0.field1074.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field1074[arg1];
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
					var8 = field420[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field307[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field436[var3[var5++]];
				}

				if (var7 == 4) {
					QQMJEFXK var10 = QQMJEFXK.method397(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < FROOEMOI.field624 && (!FROOEMOI.method218(var11).field640 || field133)) {
						for (int var12 = 0; var12 < var10.field1086.length; var12++) {
							if (var11 + 1 == var10.field1086[var12]) {
								var8 += var10.field1066[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field474[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field164[field307[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field474[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field352.field1435;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < LDKBVIZQ.field814; var13++) {
						if (LDKBVIZQ.field816[var13]) {
							var8 += field307[var13];
						}
					}
				}

				if (var7 == 10) {
					QQMJEFXK var14 = QQMJEFXK.method397(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < FROOEMOI.field624 && (!FROOEMOI.method218(var15).field640 || field133)) {
						for (int var16 = 0; var16 < var14.field1086.length; var16++) {
							if (var14.field1086[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field303;
				}

				if (var7 == 12) {
					var8 = field325;
				}

				if (var7 == 13) {
					int var17 = field474[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					VKMARKYY var20 = VKMARKYY.field1355[var19];
					int var21 = var20.field1357;
					int var22 = var20.field1358;
					int var23 = var20.field1359;
					int var24 = field99[var23 - var22];
					var8 = field474[var21] >> var22 & var24;
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
					var8 = (field352.field1195 >> 7) + field289;
				}

				if (var7 == 19) {
					var8 = (field352.field1196 >> 7) + field290;
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

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method132(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method133(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field226[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field478[var6][var4][var5] + field478[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field478[var6][var4][var5 + 1] + field478[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.D(I)V")
	public final void method134() {
		field268++;
		method33(true);
		method87(true);
		method33(false);
		method87(false);
		method136();
		method62();

		if (!field106) {
			int var1 = field121;
			if (field445 / 256 > var1) {
				var1 = field445 / 256;
			}

			if (field480[4] && field229[4] + 128 > var1) {
				var1 = field229[4] + 128;
			}

			int var2 = field66 + field122 & 0x7FF;
			method34(method133(field352.field1195, field352.field1196, field188) - 50, var1, var1 * 3 + 600, var2, field337, field336);
		}

		int var3;
		if (field106) {
			var3 = method146();
		} else {
			var3 = method145();
		}

		int var4 = field467;
		int var5 = field468;
		int var6 = field469;
		int var7 = field470;
		int var8 = field471;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field480[var9]) {
				int var10 = (int) (Math.random() * (field261[var9] * 2 + 1) + Math.sin(field492[var9] / 100.0D * field442[var9]) * field229[var9] - field261[var9]);
				if (var9 == 0) {
					field467 += var10;
				}

				if (var9 == 1) {
					field468 += var10;
				}

				if (var9 == 2) {
					field469 += var10;
				}

				if (var9 == 3) {
					field471 = field471 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field470 += var10;
					if (field470 < 128) {
						field470 = 128;
					}

					if (field470 > 383) {
						field470 = 383;
					}
				}
			}
		}

		int var11 = EHATXTET.field612;
		UNLYQRUD.field1325 = true;
		UNLYQRUD.field1328 = 0;
		UNLYQRUD.field1326 = field692 - 4;
		UNLYQRUD.field1327 = field693 - 4;
		ZLDPKUPX.method595();
		field400.method368(field469, field467, field468, field470, field471, var3);
		field400.method343();
		method96();
		method43();
		method144(var11);
		method91();
		field276.method246(4, field684, 4);
		field467 = var4;
		field468 = var5;
		field469 = var6;
		field470 = var7;
		field471 = var8;
	}

	@ObfuscatedName("client.a(IZILWSNKRVXZ;)V")
	public final void method135(int arg0, int arg1, WSNKRVXZ arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field122 + field119 & 0x7FF;
			int var6 = UNLYQRUD.field1330[var5];
			int var7 = UNLYQRUD.field1331[var5];
			var6 = var6 * 256 / (field379 + 256);
			var7 = var7 * 256 / (field379 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field284.method555(15, 20, 20, 15, var12 + 94 + 4 - 10, var10, 83 - var13 - 20, 256);
		} else {
			method127(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method136() {
		for (WNPAFFHH var1 = (WNPAFFHH) field126.method485(); var1 != null; var1 = (WNPAFFHH) field126.method487()) {
			if (field188 != var1.field1391 || field230 > var1.field1410) {
				var1.method327();
			} else if (field230 >= var1.field1409) {
				if (var1.field1408 > 0) {
					UGARWYIU var2 = field431[var1.field1408 - 1];
					if (var2 != null && var2.field1195 >= 0 && var2.field1195 < 13312 && var2.field1196 >= 0 && var2.field1196 < 13312) {
						var1.method541(var2.field1196, var2.field1195, method133(var2.field1195, var2.field1196, var1.field1391) - var1.field1390, field230);
					}
				}

				if (var1.field1408 < 0) {
					int var3 = -var1.field1408 - 1;
					WQWDCUWR var4;
					if (field417 == var3) {
						var4 = field352;
					} else {
						var4 = field249[var3];
					}

					if (var4 != null && var4.field1195 >= 0 && var4.field1195 < 13312 && var4.field1196 >= 0 && var4.field1196 < 13312) {
						var1.method541(var4.field1196, var4.field1195, method133(var4.field1195, var4.field1196, var1.field1391) - var1.field1390, field230);
					}
				}

				var1.method540(field158);
				field400.method340(false, field188, var1, var1.field1401, (int) var1.field1398, 60, (int) var1.field1399, (int) var1.field1397, -1);
			}
		}

		field314++;
		if (field314 > 1602) {
			field314 = 0;
			field427.method491(138);
			field427.method492(0);
			int var5 = field427.field1375;

			if ((int) (Math.random() * 2.0D) == 0) {
				field427.method492(0);
			}

			field427.method493(63187);
			field427.method492(25);
			field427.method492(148);
			field427.method492((int) (Math.random() * 256.0D));
			field427.method492(111);
			field427.method493(13097);
			field427.method492(50);

			if ((int) (Math.random() * 2.0D) == 0) {
				field427.method493(42137);
			}

			field427.method492((int) (Math.random() * 256.0D));
			field427.method501(field427.field1375 - var5);
		}
	}

	@ObfuscatedName("client.j(Z)Ljava/lang/String;")
	public final String method137() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field687 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.m(B)V")
	public final void method138() {
		try {
			int var1 = field352.field1195 + field236;
			int var2 = field352.field1196 + field234;
			if (field336 - var1 < -500 || field336 - var1 > 500 || field337 - var2 < -500 || field337 - var2 > 500) {
				field336 = var1;
				field337 = var2;
			}

			if (field336 != var1) {
				field336 += (var1 - field336) / 16;
			}

			if (field337 != var2) {
				field337 += (var2 - field337) / 16;
			}

			if (field702[1] == 1) {
				field123 += (-field123 - 24) / 2;
			} else if (field702[2] == 1) {
				field123 += (24 - field123) / 2;
			} else {
				field123 /= 2;
			}

			if (field702[3] == 1) {
				field124 += (12 - field124) / 2;
			} else if (field702[4] == 1) {
				field124 += (-field124 - 12) / 2;
			} else {
				field124 /= 2;
			}

			field122 = field123 / 2 + field122 & 0x7FF;
			field121 += field124 / 2;
			if (field121 < 128) {
				field121 = 128;
			}

			if (field121 > 383) {
				field121 = 383;
			}

			int var3 = field336 >> 7;
			int var4 = field337 >> 7;
			int var5 = method133(field336, field337, field188);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field188;
						if (var9 < 3 && (field226[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field478[var9][var7][var8];
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

			if (var11 > field445) {
				field445 += (var11 - field445) / 24;
			} else if (var11 < field445) {
				field445 += (var11 - field445) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field352.field1195 + "," + field352.field1196 + "," + field336 + "," + field337 + "," + field217 + "," + field218 + "," + field289 + "," + field290);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(LQQMJEFXK;B)Z")
	public final boolean method139(QQMJEFXK arg0) {
		if (arg0.field1094 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1094.length; var2++) {
			int var3 = method131(arg0, var2);
			int var4 = arg0.field1069[var2];
			if (arg0.field1094[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1094[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1094[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method140() {
		if (field294 == null) {
			field685 = null;
			field277 = null;
			field275 = null;
			field274 = null;
			field276 = null;
			field411 = null;
			field412 = null;
			field413 = null;
			field297 = new GYXQUUFC(265, 128, method117());
			ZLDPKUPX.method595();
			field298 = new GYXQUUFC(265, 128, method117());
			ZLDPKUPX.method595();
			field294 = new GYXQUUFC(171, 509, method117());
			ZLDPKUPX.method595();
			field295 = new GYXQUUFC(132, 360, method117());
			ZLDPKUPX.method595();
			field296 = new GYXQUUFC(200, 360, method117());
			ZLDPKUPX.method595();
			field299 = new GYXQUUFC(238, 202, method117());
			ZLDPKUPX.method595();
			field300 = new GYXQUUFC(238, 203, method117());
			ZLDPKUPX.method595();
			field301 = new GYXQUUFC(94, 74, method117());
			ZLDPKUPX.method595();
			field302 = new GYXQUUFC(94, 75, method117());
			ZLDPKUPX.method595();

			if (field399 != null) {
				method152();
				method56();
			}

			field185 = true;
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method141(long arg0) {
		if (arg0 != 0L) {
			if (field489 >= 100) {
				method44(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = HCBZAWVW.method290(HCBZAWVW.method287(arg0));
				for (int var4 = 0; var4 < field489; var4++) {
					if (field221[var4] == arg0) {
						method44(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field210; var5++) {
					if (field193[var5] == arg0) {
						method44(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field221[field489++] = arg0;
				field161 = true;
				field427.method491(200);
				field427.method498(arg0);
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field687 != null) {
				return new URL("http://127.0.0.1:" + (field132 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field186.method428(arg2, arg0);
		field187.method428(arg2, arg0 + arg1 - 16);
		ZLDPKUPX.method597(16, field283, arg1 - 32, arg2, arg0 + 16);
		int var6 = (arg1 - 32) * arg1 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg4 / (arg3 - arg1);
		ZLDPKUPX.method597(16, field483, var6, arg2, arg0 + var7 + 16);
		ZLDPKUPX.method602(var6, field129, arg0 + var7 + 16, arg2);
		ZLDPKUPX.method602(var6, field129, arg0 + var7 + 16, arg2 + 1);
		ZLDPKUPX.method600(arg0 + var7 + 16, field129, 16, arg2);
		ZLDPKUPX.method600(arg0 + var7 + 17, field129, 16, arg2);
		ZLDPKUPX.method602(var6, field496, arg0 + var7 + 16, arg2 + 15);
		ZLDPKUPX.method602(var6 - 1, field496, arg0 + var7 + 17, arg2 + 14);
		ZLDPKUPX.method600(arg0 + var7 + var6 + 15, field496, 16, arg2);
		ZLDPKUPX.method600(arg0 + var7 + var6 + 14, field496, 15, arg2 + 1);
	}

	@ObfuscatedName("client.G(I)V")
	public final void method143() {
		if (field488 >= 2 || field173 != 0 || field499 != 0) {
			String var1;
			if (field173 == 1 && field488 < 2) {
				var1 = "Use " + field177 + " with...";
			} else if (field499 == 1 && field488 < 2) {
				var1 = field502 + "...";
			} else {
				var1 = field382[field488 - 1];
			}

			if (field488 > 2) {
				var1 = var1 + "@whi@ / " + (field488 - 2) + " more options";
			}

			field372.method21(4, 15, true, field230 / 1000, var1, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method144(int arg0) {
		if (!field134) {
			for (int var2 = 0; var2 < field215.length; var2++) {
				int var3 = field215[var2];
				if (EHATXTET.field611[var3] >= arg0) {
					SSCICQYX var4 = EHATXTET.field605[var3];
					int var5 = var4.field1237 * var4.field1236 - 1;
					int var6 = field158 * var4.field1236 * 2;
					byte[] var7 = var4.field1234;
					byte[] var8 = field381;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1234 = var8;
					field381 = var7;
					EHATXTET.method205(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)I")
	public final int method145() {
		int var1 = 3;
		if (field470 < 310) {
			int var2 = field467 >> 7;
			int var3 = field469 >> 7;
			int var4 = field352.field1195 >> 7;
			int var5 = field352.field1196 >> 7;

			if ((field226[field188][var2][var3] & 0x4) != 0) {
				var1 = field188;
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

					if ((field226[field188][var2][var3] & 0x4) != 0) {
						var1 = field188;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field226[field188][var2][var3] & 0x4) != 0) {
							var1 = field188;
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

					if ((field226[field188][var2][var3] & 0x4) != 0) {
						var1 = field188;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field226[field188][var2][var3] & 0x4) != 0) {
							var1 = field188;
						}
					}
				}
			}
		}

		if ((field226[field188][field352.field1195 >> 7][field352.field1196 >> 7] & 0x4) != 0) {
			var1 = field188;
		}

		return var1;
	}

	@ObfuscatedName("client.k(Z)I")
	public final int method146() {
		int var1 = method133(field467, field469, field188);
		if (var1 - field468 < 800 && (field226[field188][field467 >> 7][field469 >> 7] & 0x4) != 0) {
			return field188;
		}

		return 3;
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void method147(boolean arg0) {
		method140();
		field296.method245();
		field171.method428(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field451 == 0) {
			int var4 = var3 / 2 + 80;
			field370.method13(field481.field754, var4, true, var2 / 2, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field372.method13("Welcome to RuneScape", var5, true, var2 / 2, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field172.method428(var6 - 73, var7 - 20);
			field372.method13("New User", var7 + 5, true, var6, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field172.method428(var8 - 73, var7 - 20);
			field372.method13("Existing User", var7 + 5, true, var8, 0xFFFFFF);
		}

		if (field451 == 2) {
			int var9 = var3 / 2 - 40;
			if (field408.length() > 0) {
				field372.method13(field408, var9 - 15, true, var2 / 2, 0xFFFF00);
				field372.method13(field409, var9, true, var2 / 2, 0xFFFF00);
				var9 += 30;
			} else {
				field372.method13(field409, var9 - 7, true, var2 / 2, 0xFFFF00);
				var9 += 30;
			}

			field372.method20(true, var9, 0xFFFFFF, var2 / 2 - 90, "Username: " + field245 + (field316 == 0 & field230 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field372.method20(true, var9, 0xFFFFFF, var2 / 2 - 88, "Password: " + HCBZAWVW.method291(field246) + (field316 == 1 & field230 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field172.method428(var10 - 73, var11 - 20);
				field372.method13("Login", var11 + 5, true, var10, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field172.method428(var12 - 73, var11 - 20);
				field372.method13("Cancel", var11 + 5, true, var12, 0xFFFFFF);
			}
		}

		if (field451 == 3) {
			field372.method13("Create a free account", var3 / 2 - 60, true, var2 / 2, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field372.method13("To create a new account you need to", var13, true, var2 / 2, 0xFFFFFF);
			var13 += 15;
			field372.method13("go back to the main RuneScape webpage", var13, true, var2 / 2, 0xFFFFFF);
			var13 += 15;
			field372.method13("and choose the 'create account'", var13, true, var2 / 2, 0xFFFFFF);
			var13 += 15;
			field372.method13("button near the top of that page.", var13, true, var2 / 2, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field172.method428(var14 - 73, var15 - 20);
			field372.method13("Cancel", var15 + 5, true, var14, 0xFFFFFF);
		}

		field296.method246(171, field684, 202);

		if (field185) {
			field185 = false;
			field294.method246(0, field684, 128);
			field295.method246(371, field684, 202);
			field299.method246(265, field684, 0);
			field300.method246(265, field684, 562);
			field301.method246(171, field684, 128);
			field302.method246(171, field684, 562);
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)V")
	public final void method148(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field140 = 0;
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

			field140 = 0;
			label46: for (int var7 = 0; var7 < FROOEMOI.field624; var7++) {
				FROOEMOI var8 = FROOEMOI.method218(var7);
				if (var8.field623 == -1 && var8.field626 != null) {
					String var9 = var8.field626.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field141[field140] = var9;
					field142[field140] = var7;
					field140++;
					if (field140 >= field141.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILWNCFPLWV;Z)V")
	public final void method149(int arg0, WNCFPLWV arg1) {
		if (arg0 == 101) {
			int var3 = arg1.method520();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = field405[var4];
			int var7 = arg1.method502();
			int var8 = (var7 >> 4 & 0x7) + field189;
			int var9 = (var7 & 0x7) + field190;
			int var10 = arg1.method504();
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
				method39(-1, var8, var5, var6, field188, 0, var4, var10, var9);
			}
		} else if (arg0 == 177) {
			int var11 = arg1.method502();
			int var12 = (var11 >> 4 & 0x7) + field189;
			int var13 = (var11 & 0x7) + field190;
			int var14 = arg1.method504();
			int var15 = arg1.method502();
			int var16 = arg1.method504();
			if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
				var12 = var12 * 128 + 64;
				var13 = var13 * 128 + 64;
				RDFTSKWD var17 = new RDFTSKWD(field188, var13, var16, var14, field230, method133(var12, var13, field188) - var15, var12);
				field183.method482(var17);
			}
		} else if (arg0 == 79) {
			int var18 = arg1.method520();
			int var19 = (var18 >> 4 & 0x7) + field189;
			int var20 = (var18 & 0x7) + field190;
			int var21 = arg1.method529();
			int var22 = arg1.method531();
			int var23 = arg1.method530();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && field417 != var21) {
				GUTBTNML var24 = new GUTBTNML();
				var24.field707 = var23;
				var24.field706 = var22;

				if (field494[field188][var19][var20] == null) {
					field494[field188][var19][var20] = new WAPMJSJO();
				}

				field494[field188][var19][var20].method482(var24);
				method113(var19, var20);
			}
		} else {
			if (arg0 == 152) {
				int var25 = arg1.method522();
				int var26 = (var25 >> 4 & 0x7) + field189;
				int var27 = (var25 & 0x7) + field190;
				byte var28 = arg1.method523();
				int var29 = arg1.method530();
				byte var30 = arg1.method525();
				byte var31 = arg1.method523();
				int var32 = arg1.method522();
				int var33 = var32 >> 2;
				int var34 = var32 & 0x3;
				int var35 = field405[var33];
				int var36 = arg1.method531();
				byte var37 = arg1.method503();
				int var38 = arg1.method529();
				int var39 = arg1.method530();
				WQWDCUWR var40;
				if (field417 == var38) {
					var40 = field352;
				} else {
					var40 = field249[var38];
				}

				if (var40 != null) {
					DZZSWICG var41 = DZZSWICG.method184(var36);
					int var42 = field478[field188][var26][var27];
					int var43 = field478[field188][var26 + 1][var27];
					int var44 = field478[field188][var26 + 1][var27 + 1];
					int var45 = field478[field188][var26][var27 + 1];
					UNLYQRUD var46 = var41.method190(var33, var34, var42, var43, var44, var45, -1);
					if (var46 != null) {
						method39(var29 + 1, var26, 0, var35, field188, var39 + 1, 0, -1, var27);
						var40.field1413 = field230 + var39;
						var40.field1414 = field230 + var29;
						var40.field1419 = var46;
						int var47 = var41.field561;
						int var48 = var41.field580;
						if (var34 == 1 || var34 == 3) {
							var47 = var41.field580;
							var48 = var41.field561;
						}

						var40.field1416 = var26 * 128 + var47 * 64;
						var40.field1418 = var27 * 128 + var48 * 64;
						var40.field1417 = method133(var40.field1416, var40.field1418, field188);

						if (var37 > var30) {
							byte var49 = var37;
							var37 = var30;
							var30 = var49;
						}

						if (var28 > var31) {
							byte var50 = var28;
							var28 = var31;
							var31 = var50;
						}

						var40.field1421 = var26 + var37;
						var40.field1423 = var26 + var30;
						var40.field1422 = var27 + var28;
						var40.field1424 = var27 + var31;
					}
				}
			}

			if (arg0 == 185) {
				int var51 = arg1.method502();
				int var52 = (var51 >> 4 & 0x7) + field189;
				int var53 = (var51 & 0x7) + field190;
				int var54 = var52 + arg1.method503();
				int var55 = var53 + arg1.method503();
				int var56 = arg1.method505();
				int var57 = arg1.method504();
				int var58 = arg1.method502() * 4;
				int var59 = arg1.method502() * 4;
				int var60 = arg1.method504();
				int var61 = arg1.method504();
				int var62 = arg1.method502();
				int var63 = arg1.method502();
				if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var57 != 0xFFFF) {
					var52 = var52 * 128 + 64;
					var53 = var53 * 128 + 64;
					var54 = var54 * 128 + 64;
					var55 = var55 * 128 + 64;
					WNPAFFHH var64 = new WNPAFFHH(field188, var59, var53, var63, var52, method133(var52, var53, field188) - var58, var62, field230 + var60, field230 + var61, var57, var56);
					var64.method541(var55, var54, method133(var54, var55, field188) - var59, field230 + var60);
					field126.method482(var64);
				}
			} else if (arg0 == 94) {
				int var65 = arg1.method531();
				int var66 = arg1.method529();
				int var67 = arg1.method522();
				int var68 = (var67 >> 4 & 0x7) + field189;
				int var69 = (var67 & 0x7) + field190;
				if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
					GUTBTNML var70 = new GUTBTNML();
					var70.field707 = var66;
					var70.field706 = var65;

					if (field494[field188][var68][var69] == null) {
						field494[field188][var68][var69] = new WAPMJSJO();
					}

					field494[field188][var68][var69].method482(var70);
					method113(var68, var69);
				}
			} else if (arg0 == 115) {
				int var71 = arg1.method531();
				int var72 = arg1.method521();
				int var73 = (var72 >> 4 & 0x7) + field189;
				int var74 = (var72 & 0x7) + field190;
				int var75 = arg1.method520();
				int var76 = var75 >> 2;
				int var77 = var75 & 0x3;
				int var78 = field405[var76];
				if (var73 >= 0 && var74 >= 0 && var73 < 103 && var74 < 103) {
					int var79 = field478[field188][var73][var74];
					int var80 = field478[field188][var73 + 1][var74];
					int var81 = field478[field188][var73 + 1][var74 + 1];
					int var82 = field478[field188][var73][var74 + 1];
					if (var78 == 0) {
						QWAZWUGC var83 = field400.method351(field188, var74, var73);
						if (var83 != null) {
							int var84 = var83.field1137 >> 14 & 0x7FFF;
							if (var76 == 2) {
								var83.field1135 = new HVMNUAXR(var81, var80, var82, false, var79, 2, var77 + 4, var84, var71);
								var83.field1136 = new HVMNUAXR(var81, var80, var82, false, var79, 2, var77 + 1 & 0x3, var84, var71);
							} else {
								var83.field1135 = new HVMNUAXR(var81, var80, var82, false, var79, var76, var77, var84, var71);
							}
						}
					}

					if (var78 == 1) {
						FZZMPIWJ var85 = field400.method352(var73, var74, field188);
						if (var85 != null) {
							var85.field673 = new HVMNUAXR(var81, var80, var82, false, var79, 4, 0, var85.field674 >> 14 & 0x7FFF, var71);
						}
					}

					if (var78 == 2) {
						ALQJAWNK var86 = field400.method353(var74, var73, field188);

						if (var76 == 11) {
							var76 = 10;
						}

						if (var86 != null) {
							var86.field5 = new HVMNUAXR(var81, var80, var82, false, var79, var76, var77, var86.field13 >> 14 & 0x7FFF, var71);
						}
					}

					if (var78 == 3) {
						DLRXYOMX var87 = field400.method354(var73, field188, var74);
						if (var87 != null) {
							var87.field533 = new HVMNUAXR(var81, var80, var82, false, var79, 22, var77, var87.field534 >> 14 & 0x7FFF, var71);
						}
					}
				}
			} else if (arg0 == 45) {
				int var88 = arg1.method531();
				int var89 = arg1.method521();
				int var90 = (var89 >> 4 & 0x7) + field189;
				int var91 = (var89 & 0x7) + field190;
				if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
					WAPMJSJO var92 = field494[field188][var90][var91];
					if (var92 != null) {
						for (GUTBTNML var93 = (GUTBTNML) var92.method485(); var93 != null; var93 = (GUTBTNML) var92.method487()) {
							if ((var88 & 0x7FFF) == var93.field707) {
								var93.method327();
								break;
							}
						}

						if (var92.method485() == null) {
							field494[field188][var90][var91] = null;
						}

						method113(var90, var91);
					}
				}
			} else if (arg0 == 57) {
				int var94 = arg1.method520();
				int var95 = var94 >> 2;
				int var96 = var94 & 0x3;
				int var97 = field405[var95];
				int var98 = arg1.method522();
				int var99 = (var98 >> 4 & 0x7) + field189;
				int var100 = (var98 & 0x7) + field190;
				if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
					method39(-1, var99, var96, var97, field188, 0, var95, -1, var100);
				}
			} else if (arg0 == 227) {
				int var101 = arg1.method502();
				int var102 = (var101 >> 4 & 0x7) + field189;
				int var103 = (var101 & 0x7) + field190;
				int var104 = arg1.method504();
				int var105 = arg1.method502();
				int var106 = var105 >> 4 & 0xF;
				int var107 = var105 & 0x7;
				if (field352.field1175[0] >= var102 - var106 && field352.field1175[0] <= var102 + var106 && field352.field1176[0] >= var103 - var106 && field352.field1176[0] <= var103 + var106 && field269 && !field134 && field375 < 50) {
					field315[field375] = var104;
					field64[field375] = var107;
					field389[field375] = URXFHLNO.field1338[var104];
					field375++;
				}
			} else if (arg0 == 206) {
				int var108 = arg1.method502();
				int var109 = (var108 >> 4 & 0x7) + field189;
				int var110 = (var108 & 0x7) + field190;
				int var111 = arg1.method504();
				int var112 = arg1.method504();
				int var113 = arg1.method504();
				if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
					WAPMJSJO var114 = field494[field188][var109][var110];
					if (var114 != null) {
						for (GUTBTNML var115 = (GUTBTNML) var114.method485(); var115 != null; var115 = (GUTBTNML) var114.method487()) {
							if ((var111 & 0x7FFF) == var115.field707 && var115.field706 == var112) {
								var115.field706 = var113;
								break;
							}
						}

						method113(var109, var110);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method150() {
		if (field134 && field487 == 2 && YTWJKTVW.field1482 != field188) {
			method50("Loading - please wait.", null);
			field487 = 1;
			field457 = System.currentTimeMillis();
		}

		if (field487 == 1) {
			int var1 = method151();
			if (var1 != 0 && System.currentTimeMillis() - field457 > 360000L) {
				signlink.reporterror(field245 + " glcfb " + field244 + "," + var1 + "," + field134 + "," + field270[0] + "," + field481.method297() + "," + field188 + "," + field217 + "," + field218);
				field457 = System.currentTimeMillis();
			}
		}

		if (field487 == 2 && field304 != field188) {
			field304 = field188;
			method74(field188);
		}
	}

	@ObfuscatedName("client.n(B)I")
	public final int method151() {
		for (int var1 = 0; var1 < field216.length; var1++) {
			if (field216[var1] == null && field208[var1] != -1) {
				return -1;
			}

			if (field135[var1] == null && field209[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field216.length; var3++) {
			byte[] var4 = field135[var3];
			if (var4 != null) {
				int var5 = (field207[var3] >> 8) * 64 - field289;
				int var6 = (field207[var3] & 0xFF) * 64 - field290;
				if (field401) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= YTWJKTVW.method571(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field374) {
			return -4;
		} else {
			field487 = 2;
			YTWJKTVW.field1482 = field188;
			method172();
			field427.method491(188);
			return 0;
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method152() {
		byte[] var1 = field399.method414("title.dat", null);
		WSNKRVXZ var2 = new WSNKRVXZ(var1, this);
		field297.method245();
		var2.method548(0, 0);
		field298.method245();
		var2.method548(0, -637);
		field294.method245();
		var2.method548(0, -128);
		field295.method245();
		var2.method548(-371, -202);
		field296.method245();
		var2.method548(-171, -202);
		field299.method245();
		var2.method548(-265, 0);
		field300.method245();
		var2.method548(-265, -562);
		field301.method245();
		var2.method548(-171, -128);
		field302.method245();
		var2.method548(-171, -562);
		int[] var3 = new int[var2.field1438];
		for (int var4 = 0; var4 < var2.field1439; var4++) {
			for (int var5 = 0; var5 < var2.field1438; var5++) {
				var3[var5] = var2.field1437[var2.field1438 * var4 + var2.field1438 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1438; var6++) {
				var2.field1437[var2.field1438 * var4 + var6] = var3[var6];
			}
		}

		field297.method245();
		var2.method548(0, 382);
		field298.method245();
		var2.method548(0, -255);
		field294.method245();
		var2.method548(0, 254);
		field295.method245();
		var2.method548(-371, 180);
		field296.method245();
		var2.method548(-171, 180);
		field299.method245();
		var2.method548(-265, 382);
		field300.method245();
		var2.method548(-265, -180);
		field301.method245();
		var2.method548(-171, 254);
		field302.method245();
		var2.method548(-171, -180);
		WSNKRVXZ var7 = new WSNKRVXZ(field399, "logo", 0);
		field294.method245();
		var7.method550(382 - var7.field1438 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.J(I)V")
	public final void method153() {
		for (JMLHLOET var1 = (JMLHLOET) field264.method485(); var1 != null; var1 = (JMLHLOET) field264.method487()) {
			if (var1.field794 == -1) {
				var1.field798 = 0;
				method120(var1);
			} else {
				var1.method327();
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method154() {
		if (field698 == 1) {
			if (field699 >= 539 && field699 <= 573 && field700 >= 169 && field700 < 205 && field351[0] != -1) {
				field161 = true;
				field392 = 0;
				field167 = true;
			}

			if (field699 >= 569 && field699 <= 599 && field700 >= 168 && field700 < 205 && field351[1] != -1) {
				field161 = true;
				field392 = 1;
				field167 = true;
			}

			if (field699 >= 597 && field699 <= 627 && field700 >= 168 && field700 < 205 && field351[2] != -1) {
				field161 = true;
				field392 = 2;
				field167 = true;
			}

			if (field699 >= 625 && field699 <= 669 && field700 >= 168 && field700 < 203 && field351[3] != -1) {
				field161 = true;
				field392 = 3;
				field167 = true;
			}

			if (field699 >= 666 && field699 <= 696 && field700 >= 168 && field700 < 205 && field351[4] != -1) {
				field161 = true;
				field392 = 4;
				field167 = true;
			}

			if (field699 >= 694 && field699 <= 724 && field700 >= 168 && field700 < 205 && field351[5] != -1) {
				field161 = true;
				field392 = 5;
				field167 = true;
			}

			if (field699 >= 722 && field699 <= 756 && field700 >= 169 && field700 < 205 && field351[6] != -1) {
				field161 = true;
				field392 = 6;
				field167 = true;
			}

			if (field699 >= 540 && field699 <= 574 && field700 >= 466 && field700 < 502 && field351[7] != -1) {
				field161 = true;
				field392 = 7;
				field167 = true;
			}

			if (field699 >= 572 && field699 <= 602 && field700 >= 466 && field700 < 503 && field351[8] != -1) {
				field161 = true;
				field392 = 8;
				field167 = true;
			}

			if (field699 >= 599 && field699 <= 629 && field700 >= 466 && field700 < 503 && field351[9] != -1) {
				field161 = true;
				field392 = 9;
				field167 = true;
			}

			if (field699 >= 627 && field699 <= 671 && field700 >= 467 && field700 < 502 && field351[10] != -1) {
				field161 = true;
				field392 = 10;
				field167 = true;
			}

			if (field699 >= 669 && field699 <= 699 && field700 >= 466 && field700 < 503 && field351[11] != -1) {
				field161 = true;
				field392 = 11;
				field167 = true;
			}

			if (field699 >= 696 && field699 <= 726 && field700 >= 466 && field700 < 503 && field351[12] != -1) {
				field161 = true;
				field392 = 12;
				field167 = true;
			}

			if (field699 >= 724 && field699 <= 758 && field700 >= 466 && field700 < 502 && field351[13] != -1) {
				field161 = true;
				field392 = 13;
				field167 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(LQQMJEFXK;B)Z")
	public final boolean method155(QQMJEFXK arg0) {
		int var2 = arg0.field1081;
		if (field211 == 2) {
			if (var2 == 201) {
				field70 = true;
				field453 = 0;
				field144 = true;
				field82 = "";
				field267 = 1;
				field313 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field70 = true;
				field453 = 0;
				field144 = true;
				field82 = "";
				field267 = 2;
				field313 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field151 = 250;
			return true;
		}

		if (var2 == 501) {
			field70 = true;
			field453 = 0;
			field144 = true;
			field82 = "";
			field267 = 4;
			field313 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field70 = true;
			field453 = 0;
			field144 = true;
			field82 = "";
			field267 = 5;
			field313 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field130[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = SECEMLXT.field1210 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= SECEMLXT.field1210) {
							var5 = 0;
						}
					}

					if (!SECEMLXT.field1211[var5].field1217 && SECEMLXT.field1211[var5].field1212 == var3 + (field477 ? 0 : 7)) {
						break;
					}
				}

				field130[var3] = var5;
				field219 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field281[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field243[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field243[var6].length) {
					var8 = 0;
				}
			}

			field281[var6] = var8;
			field219 = true;
		}

		if (var2 == 324 && !field477) {
			field477 = true;
			method121();
		}

		if (var2 == 325 && field477) {
			field477 = false;
			method121();
		}

		if (var2 == 326) {
			field427.method491(236);
			field427.method492(field477 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field427.method492(field130[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field427.method492(field281[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field220 = !field220;
		}

		if (var2 >= 601 && var2 <= 613) {
			method128();

			if (field100.length() > 0) {
				field427.method491(158);
				field427.method498(HCBZAWVW.method286(field100));
				field427.method492(var2 - 601);
				field427.method492(field220 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.L(I)V")
	public final void method156() {
		int var1 = field108 * 128 + 64;
		int var2 = field109 * 128 + 64;
		int var3 = method133(var1, var2, field188) - field110;

		if (field467 < var1) {
			field467 += (var1 - field467) * field112 / 1000 + field111;
			if (field467 > var1) {
				field467 = var1;
			}
		}

		if (field467 > var1) {
			field467 -= (field467 - var1) * field112 / 1000 + field111;
			if (field467 < var1) {
				field467 = var1;
			}
		}

		if (field468 < var3) {
			field468 += (var3 - field468) * field112 / 1000 + field111;
			if (field468 > var3) {
				field468 = var3;
			}
		}

		if (field468 > var3) {
			field468 -= (field468 - var3) * field112 / 1000 + field111;
			if (field468 < var3) {
				field468 = var3;
			}
		}

		if (field469 < var2) {
			field469 += (var2 - field469) * field112 / 1000 + field111;
			if (field469 > var2) {
				field469 = var2;
			}
		}

		if (field469 > var2) {
			field469 -= (field469 - var2) * field112 / 1000 + field111;
			if (field469 < var2) {
				field469 = var2;
			}
		}

		int var4 = field77 * 128 + 64;
		int var5 = field78 * 128 + 64;
		int var6 = method133(var4, var5, field188) - field79;
		int var7 = var4 - field467;
		int var8 = var6 - field468;
		int var9 = var5 - field469;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field470 < var11) {
			field470 += (var11 - field470) * field81 / 1000 + field80;
			if (field470 > var11) {
				field470 = var11;
			}
		}

		if (field470 > var11) {
			field470 -= (field470 - var11) * field81 / 1000 + field80;
			if (field470 < var11) {
				field470 = var11;
			}
		}

		int var13 = var12 - field471;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field471 += field81 * var13 / 1000 + field80;
			field471 &= 0x7FF;
		}

		if (var13 < 0) {
			field471 -= -var13 * field81 / 1000 + field80;
			field471 &= 0x7FF;
		}

		int var14 = var12 - field471;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field471 = var12;
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method157() {
		if (field76 || field322 || field456) {
			method93();
		} else {
			field88++;

			if (field159) {
				method165();
			} else {
				method147(false);
			}

			field454 = 0;
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method158() {
		for (int var1 = 0; var1 < field432; var1++) {
			int var2 = field433[var1];
			UGARWYIU var3 = field431[var2];
			if (var3 != null) {
				method159(var3, var3.field1261.field28);
			}
		}
	}

	@ObfuscatedName("client.a(ILRODHPQMW;I)V")
	public final void method159(RODHPQMW arg0, int arg1) {
		if (arg0.field1195 < 128 || arg0.field1196 < 128 || arg0.field1195 >= 13184 || arg0.field1196 >= 13184) {
			arg0.field1162 = -1;
			arg0.field1170 = -1;
			arg0.field1159 = 0;
			arg0.field1160 = 0;
			arg0.field1195 = arg0.field1175[0] * 128 + arg0.field1177 * 64;
			arg0.field1196 = arg0.field1176[0] * 128 + arg0.field1177 * 64;
			arg0.method409();
		}

		if (field352 == arg0 && (arg0.field1195 < 1536 || arg0.field1196 < 1536 || arg0.field1195 >= 11776 || arg0.field1196 >= 11776)) {
			arg0.field1162 = -1;
			arg0.field1170 = -1;
			arg0.field1159 = 0;
			arg0.field1160 = 0;
			arg0.field1195 = arg0.field1175[0] * 128 + arg0.field1177 * 64;
			arg0.field1196 = arg0.field1176[0] * 128 + arg0.field1177 * 64;
			arg0.method409();
		}

		if (arg0.field1159 > field230) {
			method160(arg0);
		} else if (arg0.field1160 >= field230) {
			method161(arg0);
		} else {
			method162(arg0);
		}

		method163(arg0);
		method164(arg0);
	}

	@ObfuscatedName("client.a(BLRODHPQMW;)V")
	public final void method160(RODHPQMW arg0) {
		int var2 = arg0.field1159 - field230;
		int var3 = arg0.field1177 * 64 + arg0.field1155 * 128;
		int var4 = arg0.field1177 * 64 + arg0.field1157 * 128;
		arg0.field1195 += (var3 - arg0.field1195) / var2;
		arg0.field1196 += (var4 - arg0.field1196) / var2;
		arg0.field1184 = 0;

		if (arg0.field1161 == 0) {
			arg0.field1198 = 1024;
		}

		if (arg0.field1161 == 1) {
			arg0.field1198 = 1536;
		}

		if (arg0.field1161 == 2) {
			arg0.field1198 = 0;
		}

		if (arg0.field1161 == 3) {
			arg0.field1198 = 512;
		}
	}

	@ObfuscatedName("client.a(ZLRODHPQMW;)V")
	public final void method161(RODHPQMW arg0) {
		if (field230 == arg0.field1160 || arg0.field1162 == -1 || arg0.field1165 != 0 || arg0.field1164 + 1 > PVVHTYPN.field1006[arg0.field1162].method390(arg0.field1163)) {
			int var2 = arg0.field1160 - arg0.field1159;
			int var3 = field230 - arg0.field1159;
			int var4 = arg0.field1177 * 64 + arg0.field1155 * 128;
			int var5 = arg0.field1177 * 64 + arg0.field1157 * 128;
			int var6 = arg0.field1177 * 64 + arg0.field1156 * 128;
			int var7 = arg0.field1177 * 64 + arg0.field1158 * 128;
			arg0.field1195 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1196 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1184 = 0;

		if (arg0.field1161 == 0) {
			arg0.field1198 = 1024;
		}

		if (arg0.field1161 == 1) {
			arg0.field1198 = 1536;
		}

		if (arg0.field1161 == 2) {
			arg0.field1198 = 0;
		}

		if (arg0.field1161 == 3) {
			arg0.field1198 = 512;
		}

		arg0.field1197 = arg0.field1198;
	}

	@ObfuscatedName("client.b(BLRODHPQMW;)V")
	public final void method162(RODHPQMW arg0) {
		arg0.field1199 = arg0.field1149;
		if (arg0.field1180 == 0) {
			arg0.field1184 = 0;
		} else {
			if (arg0.field1162 != -1 && arg0.field1165 == 0) {
				PVVHTYPN var2 = PVVHTYPN.field1006[arg0.field1162];
				if (arg0.field1194 > 0 && var2.field1018 == 0) {
					arg0.field1184++;
					return;
				}

				if (arg0.field1194 <= 0 && var2.field1019 == 0) {
					arg0.field1184++;
					return;
				}
			}

			int var3 = arg0.field1195;
			int var4 = arg0.field1196;
			int var5 = arg0.field1175[arg0.field1180 - 1] * 128 + arg0.field1177 * 64;
			int var6 = arg0.field1176[arg0.field1180 - 1] * 128 + arg0.field1177 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1198 = 1280;
					} else if (var4 > var6) {
						arg0.field1198 = 1792;
					} else {
						arg0.field1198 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1198 = 768;
					} else if (var4 > var6) {
						arg0.field1198 = 256;
					} else {
						arg0.field1198 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1198 = 1024;
				} else {
					arg0.field1198 = 0;
				}

				int var7 = arg0.field1198 - arg0.field1197 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1186;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1185;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1188;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1187;
				}

				if (var8 == -1) {
					var8 = arg0.field1185;
				}

				arg0.field1199 = var8;
				int var9 = 4;
				if (arg0.field1198 != arg0.field1197 && arg0.field1190 == -1 && arg0.field1169 != 0) {
					var9 = 2;
				}

				if (arg0.field1180 > 2) {
					var9 = 6;
				}

				if (arg0.field1180 > 3) {
					var9 = 8;
				}

				if (arg0.field1184 > 0 && arg0.field1180 > 1) {
					var9 = 8;
					arg0.field1184--;
				}

				if (arg0.field1178[arg0.field1180 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1199 == arg0.field1185 && arg0.field1154 != -1) {
					arg0.field1199 = arg0.field1154;
				}

				if (var3 < var5) {
					arg0.field1195 += var9;
					if (arg0.field1195 > var5) {
						arg0.field1195 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1195 -= var9;
					if (arg0.field1195 < var5) {
						arg0.field1195 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1196 += var9;
					if (arg0.field1196 > var6) {
						arg0.field1196 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1196 -= var9;
					if (arg0.field1196 < var6) {
						arg0.field1196 = var6;
					}
				}

				if (arg0.field1195 == var5 && arg0.field1196 == var6) {
					arg0.field1180--;

					if (arg0.field1194 > 0) {
						arg0.field1194--;
						return;
					}
				}
			} else {
				arg0.field1195 = var5;
				arg0.field1196 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ILRODHPQMW;)V")
	public final void method163(RODHPQMW arg0) {
		if (arg0.field1169 != 0) {
			if (arg0.field1190 != -1 && arg0.field1190 < 32768) {
				UGARWYIU var2 = field431[arg0.field1190];
				if (var2 != null) {
					int var3 = arg0.field1195 - var2.field1195;
					int var4 = arg0.field1196 - var2.field1196;
					if (var3 != 0 || var4 != 0) {
						arg0.field1198 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1190 >= 32768) {
				int var5 = arg0.field1190 - 32768;
				if (field417 == var5) {
					var5 = field248;
				}

				WQWDCUWR var6 = field249[var5];
				if (var6 != null) {
					int var7 = arg0.field1195 - var6.field1195;
					int var8 = arg0.field1196 - var6.field1196;
					if (var7 != 0 || var8 != 0) {
						arg0.field1198 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1167 != 0 || arg0.field1168 != 0) && (arg0.field1180 == 0 || arg0.field1184 > 0)) {
				int var9 = arg0.field1195 - (arg0.field1167 - field289 - field289) * 64;
				int var10 = arg0.field1196 - (arg0.field1168 - field290 - field290) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1198 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1167 = 0;
				arg0.field1168 = 0;
			}

			int var11 = arg0.field1198 - arg0.field1197 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1169 || var11 > 2048 - arg0.field1169) {
					arg0.field1197 = arg0.field1198;
				} else if (var11 > 1024) {
					arg0.field1197 -= arg0.field1169;
				} else {
					arg0.field1197 += arg0.field1169;
				}

				arg0.field1197 &= 0x7FF;
				if (arg0.field1199 == arg0.field1149 && arg0.field1198 != arg0.field1197) {
					if (arg0.field1150 != -1) {
						arg0.field1199 = arg0.field1150;
						return;
					}

					arg0.field1199 = arg0.field1185;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LRODHPQMW;Z)V")
	public final void method164(RODHPQMW arg0) {
		arg0.field1153 = false;

		if (arg0.field1199 != -1) {
			PVVHTYPN var2 = PVVHTYPN.field1006[arg0.field1199];
			arg0.field1201++;
			if (arg0.field1200 < var2.field1007 && arg0.field1201 > var2.method390(arg0.field1200)) {
				arg0.field1201 = 1;
				arg0.field1200++;
			}

			if (arg0.field1200 >= var2.field1007) {
				arg0.field1201 = 1;
				arg0.field1200 = 0;
			}
		}

		if (arg0.field1170 != -1 && field230 >= arg0.field1173) {
			if (arg0.field1171 < 0) {
				arg0.field1171 = 0;
			}

			PVVHTYPN var3 = TYXORIIC.field1248[arg0.field1170].field1252;
			arg0.field1172++;
			if (arg0.field1171 < var3.field1007 && arg0.field1172 > var3.method390(arg0.field1171)) {
				arg0.field1172 = 1;
				arg0.field1171++;
			}

			if (arg0.field1171 >= var3.field1007 && (arg0.field1171 < 0 || arg0.field1171 >= var3.field1007)) {
				arg0.field1170 = -1;
			}
		}

		if (arg0.field1162 != -1 && arg0.field1165 <= 1) {
			PVVHTYPN var4 = PVVHTYPN.field1006[arg0.field1162];
			if (var4.field1018 == 1 && arg0.field1194 > 0 && arg0.field1159 <= field230 && arg0.field1160 < field230) {
				arg0.field1165 = 1;
				return;
			}
		}

		if (arg0.field1162 != -1 && arg0.field1165 == 0) {
			PVVHTYPN var5 = PVVHTYPN.field1006[arg0.field1162];
			arg0.field1164++;
			if (arg0.field1163 < var5.field1007 && arg0.field1164 > var5.method390(arg0.field1163)) {
				arg0.field1164 = 1;
				arg0.field1163++;
			}

			if (arg0.field1163 >= var5.field1007) {
				arg0.field1163 -= var5.field1011;
				arg0.field1166++;
				if (arg0.field1166 >= var5.field1017) {
					arg0.field1162 = -1;
				}

				if (arg0.field1163 < 0 || arg0.field1163 >= var5.field1007) {
					arg0.field1162 = -1;
				}
			}

			arg0.field1153 = var5.field1013;
		}

		if (arg0.field1165 > 0) {
			arg0.field1165--;
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method165() {
		if (field397 == -1 || field487 != 2 && field685 == null) {
			if (field185) {
				method170();
				field185 = false;
				field361.method246(4, field684, 0);
				field362.method246(357, field684, 0);
				field363.method246(4, field684, 722);
				field364.method246(205, field684, 743);
				field365.method246(0, field684, 0);
				field366.method246(4, field684, 516);
				field367.method246(205, field684, 516);
				field368.method246(357, field684, 496);
				field369.method246(338, field684, 0);
				field161 = true;
				field70 = true;
				field167 = true;
				field312 = true;

				if (field487 != 2) {
					field276.method246(4, field684, 4);
					field275.method246(4, field684, 550);
				}
			}

			if (field487 == 2) {
				method134();
			}

			if (field426 && field421 == 1) {
				field161 = true;
			}

			if (field232 != -1) {
				boolean var3 = method57(field232, field158);
				if (var3) {
					field161 = true;
				}
			}

			if (field116 == 2) {
				field161 = true;
			}

			if (field358 == 2) {
				field161 = true;
			}

			if (field161) {
				method94();
				field161 = false;
			}

			if (field101 == -1 && field453 == 0) {
				field73.field1112 = field170 - field127 - 77;

				if (field692 > 448 && field692 < 560 && field693 > 332) {
					method104(field73, 77, field693 - 357, 0, field692 - 17, -1, field170, 463);
				}

				int var4 = field170 - field73.field1112 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field170 - 77) {
					var4 = field170 - 77;
				}

				if (field127 != var4) {
					field127 = var4;
					field70 = true;
				}
			}

			if (field101 == -1 && field453 == 3) {
				int var5 = field140 * 14 + 7;
				field73.field1112 = field143;

				if (field692 > 448 && field692 < 560 && field693 > 332) {
					method104(field73, 77, field693 - 357, 0, field692 - 17, -1, var5, 463);
				}

				int var6 = field73.field1112;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field143 != var6) {
					field143 = var6;
					field70 = true;
				}
			}

			if (field101 != -1) {
				boolean var7 = method57(field101, field158);
				if (var7) {
					field70 = true;
				}
			}

			if (field116 == 3) {
				field70 = true;
			}

			if (field358 == 3) {
				field70 = true;
			}

			if (field335 != null) {
				field70 = true;
			}

			if (field426 && field421 == 2) {
				field70 = true;
			}

			if (field70) {
				method166();
				field70 = false;
			}

			if (field487 == 2) {
				method108();
				field275.method246(4, field684, 550);
				field503++;
				if (field503 > 71) {
					field503 = 0;
					field427.method491(252);
				}
			}

			if (field98 != -1) {
				field167 = true;
			}

			if (field167) {
				if (field98 != -1 && field98 == field392) {
					field98 = -1;
					field427.method491(202);
					field427.method492(field392);
				}

				field167 = false;
				field413.method245();
				field332.method428(0, 0);

				if (field232 == -1) {
					if (field351[field392] != -1) {
						if (field392 == 0) {
							field383.method428(22, 10);
						}

						if (field392 == 1) {
							field384.method428(54, 8);
						}

						if (field392 == 2) {
							field384.method428(82, 8);
						}

						if (field392 == 3) {
							field385.method428(110, 8);
						}

						if (field392 == 4) {
							field387.method428(153, 8);
						}

						if (field392 == 5) {
							field387.method428(181, 8);
						}

						if (field392 == 6) {
							field386.method428(209, 9);
						}
					}

					if (field351[0] != -1 && (field98 != 0 || field230 % 20 < 10)) {
						field293[0].method428(29, 13);
					}

					if (field351[1] != -1 && (field98 != 1 || field230 % 20 < 10)) {
						field293[1].method428(53, 11);
					}

					if (field351[2] != -1 && (field98 != 2 || field230 % 20 < 10)) {
						field293[2].method428(82, 11);
					}

					if (field351[3] != -1 && (field98 != 3 || field230 % 20 < 10)) {
						field293[3].method428(115, 12);
					}

					if (field351[4] != -1 && (field98 != 4 || field230 % 20 < 10)) {
						field293[4].method428(153, 13);
					}

					if (field351[5] != -1 && (field98 != 5 || field230 % 20 < 10)) {
						field293[5].method428(180, 11);
					}

					if (field351[6] != -1 && (field98 != 6 || field230 % 20 < 10)) {
						field293[6].method428(208, 13);
					}
				}

				field413.method246(160, field684, 516);
				field412.method245();
				field331.method428(0, 0);

				if (field232 == -1) {
					if (field351[field392] != -1) {
						if (field392 == 7) {
							field178.method428(42, 0);
						}

						if (field392 == 8) {
							field179.method428(74, 0);
						}

						if (field392 == 9) {
							field179.method428(102, 0);
						}

						if (field392 == 10) {
							field180.method428(130, 1);
						}

						if (field392 == 11) {
							field182.method428(173, 0);
						}

						if (field392 == 12) {
							field182.method428(201, 0);
						}

						if (field392 == 13) {
							field181.method428(229, 0);
						}
					}

					if (field351[8] != -1 && (field98 != 8 || field230 % 20 < 10)) {
						field293[7].method428(74, 2);
					}

					if (field351[9] != -1 && (field98 != 9 || field230 % 20 < 10)) {
						field293[8].method428(102, 3);
					}

					if (field351[10] != -1 && (field98 != 10 || field230 % 20 < 10)) {
						field293[9].method428(137, 4);
					}

					if (field351[11] != -1 && (field98 != 11 || field230 % 20 < 10)) {
						field293[10].method428(174, 2);
					}

					if (field351[12] != -1 && (field98 != 12 || field230 % 20 < 10)) {
						field293[11].method428(201, 2);
					}

					if (field351[13] != -1 && (field98 != 13 || field230 % 20 < 10)) {
						field293[12].method428(226, 2);
					}
				}

				field412.method246(466, field684, 496);
				field276.method245();
				EHATXTET.field603 = field204;
			}

			if (field312) {
				field312 = false;
				field411.method245();
				field330.method428(0, 0);
				field371.method13("Public chat", 28, true, 55, 0xFFFFFF);

				if (field324 == 0) {
					field371.method13("On", 41, true, 55, 0xFF00);
				}

				if (field324 == 1) {
					field371.method13("Friends", 41, true, 55, 0xFFFF00);
				}

				if (field324 == 2) {
					field371.method13("Off", 41, true, 55, 0xFF0000);
				}

				if (field324 == 3) {
					field371.method13("Hide", 41, true, 55, 0xFFFF);
				}

				field371.method13("Private chat", 28, true, 184, 0xFFFFFF);

				if (field265 == 0) {
					field371.method13("On", 41, true, 184, 0xFF00);
				}

				if (field265 == 1) {
					field371.method13("Friends", 41, true, 184, 0xFFFF00);
				}

				if (field265 == 2) {
					field371.method13("Off", 41, true, 184, 0xFF0000);
				}

				field371.method13("Trade/compete", 28, true, 324, 0xFFFFFF);

				if (field97 == 0) {
					field371.method13("On", 41, true, 324, 0xFF00);
				}

				if (field97 == 1) {
					field371.method13("Friends", 41, true, 324, 0xFFFF00);
				}

				if (field97 == 2) {
					field371.method13("Off", 41, true, 324, 0xFF0000);
				}

				field371.method13("Report abuse", 33, true, 458, 0xFFFFFF);
				field411.method246(453, field684, 0);
				field276.method245();
				EHATXTET.field603 = field204;
			}

			field158 = 0;
		} else {
			if (field487 == 2) {
				method57(field397, field158);

				if (field306 != -1) {
					method57(field306, field158);
				}

				field158 = 0;
				method60();
				field685.method245();
				EHATXTET.field603 = field205;
				ZLDPKUPX.method595();
				field185 = true;
				QQMJEFXK var1 = QQMJEFXK.method397(field397);
				if (var1.field1109 == 512 && var1.field1113 == 334 && var1.field1116 == 0) {
					var1.field1109 = 765;
					var1.field1113 = 503;
				}

				method40(0, var1, 0, 0);

				if (field306 != -1) {
					QQMJEFXK var2 = QQMJEFXK.method397(field306);
					if (var2.field1109 == 512 && var2.field1113 == 334 && var2.field1116 == 0) {
						var2.field1109 = 765;
						var2.field1113 = 503;
					}

					method40(0, var2, 0, 0);
				}

				if (field426) {
					method173();
				} else {
					method79();
					method143();
				}
			}

			field685.method246(0, field684, 0);
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method166() {
		field277.method245();
		EHATXTET.field603 = field202;
		field449.method428(0, 0);

		if (field144) {
			field372.method12(40, field313, 239, 0);
			field372.method12(60, field82 + "*", 239, 128);
		} else if (field453 == 1) {
			field372.method12(40, "Enter amount:", 239, 0);
			field372.method12(60, field486 + "*", 239, 128);
		} else if (field453 == 2) {
			field372.method12(40, "Enter name:", 239, 0);
			field372.method12(60, field486 + "*", 239, 128);
		} else if (field453 == 3) {
			if (field486 != field139) {
				method148(field486);
				field139 = field486;
			}

			BTJUXBKR var1 = field371;
			ZLDPKUPX.method594(77, 0, 463, 0);

			for (int var2 = 0; var2 < field140; var2++) {
				int var3 = var2 * 14 + 18 - field143;
				if (var3 > 0 && var3 < 110) {
					var1.method12(var3, field141[var2], 239, 0);
				}
			}

			ZLDPKUPX.method593();

			if (field140 > 5) {
				method142(0, 77, 463, field140 * 14 + 7, field143);
			}

			if (field486.length() == 0) {
				field372.method12(40, "Enter object name", 239, 255);
			} else if (field140 == 0) {
				field372.method12(40, "No matching objects found, please shorten search", 239, 0);
			}

			var1.method12(90, field486 + "*", 239, 0);
			ZLDPKUPX.method600(77, 0, 479, 0);
		} else if (field335 != null) {
			field372.method12(40, field335, 239, 0);
			field372.method12(60, "Click to continue", 239, 128);
		} else if (field101 != -1) {
			method40(0, QQMJEFXK.method397(field101), 0, 0);
		} else if (field396 == -1) {
			BTJUXBKR var4 = field371;
			int var5 = 0;
			ZLDPKUPX.method594(77, 0, 463, 0);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field320[var6] != null) {
					int var7 = field318[var6];
					int var8 = field127 + 70 - var5 * 14;
					String var9 = field319[var6];
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
							var4.method16(4, 0, field320[var6], var8);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field324 == 0 || field324 == 1 && method29(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field191[0].method428(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field191[1].method428(var11, var8 - 12);
								var11 += 14;
							}

							var4.method16(var11, 0, var9 + ":", var8);
							var11 += var4.method14(var9) + 8;
							var4.method16(var11, 255, field320[var6], var8);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field166 == 0 && (var7 == 7 || field265 == 0 || field265 == 1 && method29(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method16(var12, 0, "From", var8);
							int var14 = var12 + var4.method14("From ");
							if (var10 == 1) {
								field191[0].method428(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field191[1].method428(var14, var8 - 12);
								var14 += 14;
							}

							var4.method16(var14, 0, var9 + ":", var8);
							var14 += var4.method14(var9) + 8;
							var4.method16(var14, 0x800000, field320[var6], var8);
						}

						var5++;
					}

					if (var7 == 4 && (field97 == 0 || field97 == 1 && method29(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method16(4, 0x800080, var9 + " " + field320[var6], var8);
						}

						var5++;
					}

					if (var7 == 5 && field166 == 0 && field265 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method16(4, 0x800000, field320[var6], var8);
						}

						var5++;
					}

					if (var7 == 6 && field166 == 0 && field265 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method16(4, 0, "To " + var9 + ":", var8);
							var4.method16(var4.method14("To " + var9) + 12, 0x800000, field320[var6], var8);
						}

						var5++;
					}

					if (var7 == 8 && (field97 == 0 || field97 == 1 && method29(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method16(4, 0x7E3200, var9 + " " + field320[var6], var8);
						}

						var5++;
					}
				}
			}

			ZLDPKUPX.method593();
			field170 = var5 * 14 + 7;
			if (field170 < 78) {
				field170 = 78;
			}

			method142(0, 77, 463, field170, field170 - field127 - 77);
			String var13;
			if (field352 == null || field352.field1427 == null) {
				var13 = HCBZAWVW.method290(field245);
			} else {
				var13 = field352.field1427;
			}

			var4.method16(4, 0, var13 + ":", 90);
			var4.method16(var4.method14(var13 + ": ") + 6, 255, field475 + "*", 90);
			ZLDPKUPX.method600(77, 0, 479, 0);
		} else {
			method40(0, QQMJEFXK.method397(field396), 0, 0);
		}

		if (field426 && field421 == 2) {
			method173();
		}

		field277.method246(357, field684, 17);
		field276.method245();
		EHATXTET.field603 = field204;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method167(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field210; var3++) {
				if (field193[var3] == arg0) {
					field210--;
					field161 = true;

					for (int var4 = var3; var4 < field210; var4++) {
						field390[var4] = field390[var4 + 1];
						field416[var4] = field416[var4 + 1];
						field193[var4] = field193[var4 + 1];
					}

					field427.method491(241);
					field427.method498(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method168() {
		field249 = null;
		field251 = null;
		field253 = null;
		field254 = null;
		field85 = null;
		field330 = null;
		field331 = null;
		field332 = null;

		if (field83 != null) {
			field83.field777 = false;
		}

		field83 = null;
		field431 = null;
		field433 = null;
		field376 = null;
		field497 = null;
		field199 = null;
		field200 = null;
		field293 = null;
		field411 = null;
		field412 = null;
		field413 = null;
		field361 = null;
		field362 = null;
		field363 = null;
		field364 = null;
		field178 = null;
		field179 = null;
		field180 = null;
		field181 = null;
		field182 = null;
		field257 = null;
		field238 = null;
		field239 = null;
		field240 = null;
		field241 = null;
		field242 = null;
		field494 = null;
		field264 = null;
		field402 = null;
		field353 = null;
		field128 = null;
		field75 = null;
		field326 = null;
		field333 = null;
		field474 = null;
		field299 = null;
		field300 = null;
		field301 = null;
		field302 = null;

		if (field481 != null) {
			field481.method308();
		}

		field481 = null;
		field427 = null;
		field493 = null;
		field104 = null;
		field463 = null;
		field464 = null;
		field465 = null;
		field466 = null;
		field382 = null;
		field430 = null;
		field383 = null;
		field384 = null;
		field385 = null;
		field386 = null;
		field387 = null;
		field381 = null;
		field365 = null;
		field366 = null;
		field367 = null;
		field368 = null;
		field369 = null;
		field259 = null;
		field260 = null;
		field271 = null;
		field274 = null;
		field275 = null;
		field276 = null;
		field277 = null;
		field482 = null;
		field478 = null;
		field226 = null;
		field400 = null;
		field415 = null;
		field447 = null;
		field448 = null;
		field449 = null;
		method81();

		try {
			if (field428 != null) {
				field428.method474();
			}
		} catch (Exception var1) {
		}

		field428 = null;
		field201 = null;
		field452 = null;
		field207 = null;
		field216 = null;
		field135 = null;
		field208 = null;
		field209 = null;
		field231 = null;
		field390 = null;
		field193 = null;
		field416 = null;
		field126 = null;
		field183 = null;
		field297 = null;
		field298 = null;
		field294 = null;
		field295 = null;
		field296 = null;
		method46();
		DZZSWICG.method187();
		BJGOYLYN.method3();
		FROOEMOI.method216();
		QQMJEFXK.method404();
		OMGTLVPK.field902 = null;
		SECEMLXT.field1211 = null;
		YZXULYZF.field1494 = null;
		PVVHTYPN.field1006 = null;
		TYXORIIC.field1248 = null;
		TYXORIIC.field1260 = null;
		SLGAFVQN.field1219 = null;
		field685 = null;
		WQWDCUWR.field1411 = null;
		EHATXTET.method198();
		MCPCRICF.method328();
		UNLYQRUD.method438();
		DHMWVSMI.method176();
		System.gc();
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int method169(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.M(I)V")
	public final void method170() {
		if (field277 == null) {
			method46();
			field685 = null;
			field294 = null;
			field295 = null;
			field296 = null;
			field297 = null;
			field298 = null;
			field299 = null;
			field300 = null;
			field301 = null;
			field302 = null;
			field277 = new GYXQUUFC(96, 479, method117());
			field275 = new GYXQUUFC(156, 172, method117());
			ZLDPKUPX.method595();
			field448.method428(0, 0);
			field274 = new GYXQUUFC(261, 190, method117());
			field276 = new GYXQUUFC(334, 512, method117());
			ZLDPKUPX.method595();
			field411 = new GYXQUUFC(50, 496, method117());
			field412 = new GYXQUUFC(37, 269, method117());
			field413 = new GYXQUUFC(45, 249, method117());
			field185 = true;
			field276.method245();
			EHATXTET.field603 = field204;
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method171(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field400.method355(arg1, arg3, arg4);
		if (var6 != 0) {
			int var7 = field400.method359(arg1, arg3, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field257.field1437;
			int var12 = (103 - arg4) * 512 * 4 + arg3 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			DZZSWICG var14 = DZZSWICG.method184(var13);
			if (var14.field585 == -1) {
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
				SSCICQYX var15 = field201[var14.field585];
				if (var15 != null) {
					int var16 = (var14.field561 * 4 - var15.field1236) / 2;
					int var17 = (var14.field580 * 4 - var15.field1237) / 2;
					var15.method428(arg3 * 4 + var16 + 48, (104 - arg4 - var14.field580) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field400.method357(arg1, arg3, arg4);
		if (var18 != 0) {
			int var19 = field400.method359(arg1, arg3, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			DZZSWICG var23 = DZZSWICG.method184(var22);
			if (var23.field585 != -1) {
				SSCICQYX var24 = field201[var23.field585];
				if (var24 != null) {
					int var25 = (var23.field561 * 4 - var24.field1236) / 2;
					int var26 = (var23.field580 * 4 - var24.field1237) / 2;
					var24.method428(arg3 * 4 + var25 + 48, (104 - arg4 - var23.field580) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field257.field1437;
				int var29 = (103 - arg4) * 512 * 4 + arg3 * 4 + 24624;
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

		int var30 = field400.method358(arg1, arg3, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			DZZSWICG var32 = DZZSWICG.method184(var31);
			if (var32.field585 != -1) {
				SSCICQYX var33 = field201[var32.field585];
				if (var33 != null) {
					int var34 = (var32.field561 * 4 - var33.field1236) / 2;
					int var35 = (var32.field580 * 4 - var33.field1237) / 2;
					var33.method428(arg3 * 4 + var34 + 48, (104 - arg4 - var32.field580) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 373);

			if (arg0.length == 5) {
				field131 = Integer.parseInt(arg0[0]);
				field132 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method75();
				} else if (arg0[2].equals("highmem")) {
					method64();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field133 = false;
				} else if (arg0[3].equals("members")) {
					field133 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method240(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method172() {
		try {
			field304 = -1;
			field183.method489();
			field126.method489();
			EHATXTET.method201();
			method125();
			field400.method329();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field415[var1].method228();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field226[var2][var3][var4] = 0;
					}
				}
			}

			YTWJKTVW var5 = new YTWJKTVW(104, field478, 104, field226);
			int var6 = field216.length;
			field427.method491(186);

			if (!field401) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field207[var7] >> 8) * 64 - field289;
					int var9 = (field207[var7] & 0xFF) * 64 - field290;
					byte[] var10 = field216[var7];
					if (var10 != null) {
						var5.method574(var9, (field217 - 6) * 8, var10, (field218 - 6) * 8, var8, field415);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field207[var11] >> 8) * 64 - field289;
					int var13 = (field207[var11] & 0xFF) * 64 - field290;
					byte[] var14 = field216[var11];
					if (var14 == null && field218 < 800) {
						var5.method562(var12, 64, var13, 64);
					}
				}

				field427.method491(186);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field135[var15];
					if (var16 != null) {
						int var17 = (field207[var15] >> 8) * 64 - field289;
						int var18 = (field207[var15] & 0xFF) * 64 - field290;
						var5.method570(field415, var16, var17, var18, field400);
					}
				}
			}

			if (field401) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field429[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field207.length; var29++) {
									if (field207[var29] == var28 && field216[var29] != null) {
										var5.method576((var27 & 0x7) * 8, var19, var21 * 8, field216[var29], (var26 & 0x7) * 8, field415, var20 * 8, var25, var24);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method566(var19, var20 * 8, var21 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field429[0][var30][var31];
						if (var32 == -1) {
							var5.method562(var30 * 8, 8, var31 * 8, 8);
						}
					}
				}

				field427.method491(186);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field429[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field207.length; var42++) {
									if (field207[var42] == var41 && field135[var42] != null) {
										var5.method561(var34 * 8, (var40 & 0x7) * 8, (var39 & 0x7) * 8, field135[var42], var38, var33, field400, var37, var35 * 8, field415);
										break;
									}
								}
							}
						}
					}
				}
			}

			field427.method491(186);
			var5.method567(field400, field415);

			if (field276 != null) {
				field276.method245();
				EHATXTET.field603 = field204;
			}

			field427.method491(186);
			int var43 = YTWJKTVW.field1472;
			if (var43 > field188) {
				var43 = field188;
			}

			if (var43 < field188 - 1) {
				int var44 = field188 - 1;
			}

			if (field134) {
				field400.method330(YTWJKTVW.field1472);
			} else {
				field400.method330(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method113(var45, var46);
				}
			}

			method153();
		} catch (Exception var59) {
		}

		DZZSWICG.field581.method181();

		if (field687 != null) {
			field427.method491(94);
			field427.method496(1057001181);
		}

		if (field134 && signlink.cache_dat != null) {
			int var48 = field481.method293(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field481.method295(var49);
				if ((var50 & 0x79) == 0) {
					UNLYQRUD.method441(var49);
				}
			}
		}

		System.gc();
		EHATXTET.method202(20);
		field481.method310();
		int var51 = (field217 - 6) / 8 - 1;
		int var52 = (field217 + 6) / 8 + 1;
		int var53 = (field218 - 6) / 8 - 1;
		int var54 = (field218 + 6) / 8 + 1;
		if (field395) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field481.method298(var55, 0, var56);
					if (var57 != -1) {
						field481.method296(3, var57);
					}

					int var58 = field481.method298(var55, 1, var56);
					if (var58 != -1) {
						field481.method296(3, var58);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method173() {
		int var1 = field422;
		int var2 = field423;
		int var3 = field424;
		int var4 = field425;
		int var5 = 0x5D5447;
		ZLDPKUPX.method597(var3, var5, var4, var1, var2);
		ZLDPKUPX.method597(var3 - 2, 0, 16, var1 + 1, var2 + 1);
		ZLDPKUPX.method598(var4 - 19, var3 - 2, 0, var2 + 18, var1 + 1);
		field372.method16(var1 + 3, var5, "Choose Option", var2 + 14);
		int var6 = field692;
		int var7 = field693;
		if (field421 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field421 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field421 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field488; var8++) {
			int var9 = (field488 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field372.method20(true, var9, var10, var1 + 3, field382[var8]);
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field99[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field164[var3] = var2 / 4;
		}
	}
}
