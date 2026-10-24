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
public final class client extends BFZNZUKL {

	@ObfuscatedName("client.K")
	public boolean field63 = false;

	@ObfuscatedName("client.L")
	public String[] field64 = new String[500];

	@ObfuscatedName("client.M")
	public String field65 = "";

	@ObfuscatedName("client.O")
	public boolean field67 = false;

	@ObfuscatedName("client.Q")
	public String[] field69 = new String[200];

	@ObfuscatedName("client.S")
	public int[] field70 = new int[2000];

	@ObfuscatedName("client.Z")
	public QEHNWGKD[] field77 = new QEHNWGKD[1000];

	@ObfuscatedName("client.ab")
	public volatile boolean field78 = false;

	@ObfuscatedName("client.cb")
	public int[] field80 = new int[5];

	@ObfuscatedName("client.db")
	public boolean field81 = false;

	@ObfuscatedName("client.eb")
	public boolean field82 = false;

	@ObfuscatedName("client.lb")
	public boolean field89 = false;

	@ObfuscatedName("client.ob")
	public int[] field92 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.qb")
	public QEHNWGKD[] field93 = new QEHNWGKD[8];

	@ObfuscatedName("client.tb")
	public int field95 = 2;

	@ObfuscatedName("client.xb")
	public IJOSTBQT field99 = new IJOSTBQT();

	@ObfuscatedName("client.yb")
	public WOVRPCGT[][][] field100 = new WOVRPCGT[4][104][104];

	@ObfuscatedName("client.Hb")
	public BVXAXAEI[] field108 = new BVXAXAEI[13];

	@ObfuscatedName("client.Ib")
	public String field109 = "";

	@ObfuscatedName("client.Lb")
	public boolean field111 = true;

	@ObfuscatedName("client.Yb")
	public BVXAXAEI[] field120 = new BVXAXAEI[100];

	@ObfuscatedName("client.bc")
	public long[] field123 = new long[200];

	@ObfuscatedName("client.cc")
	public QEHNWGKD[] field124 = new QEHNWGKD[32];

	@ObfuscatedName("client.ec")
	public boolean field125 = false;

	@ObfuscatedName("client.gc")
	public int[] field127 = new int[100];

	@ObfuscatedName("client.hc")
	public String[] field128 = new String[100];

	@ObfuscatedName("client.ic")
	public String[] field129 = new String[100];

	@ObfuscatedName("client.jc")
	public WOVRPCGT field130 = new WOVRPCGT();

	@ObfuscatedName("client.lc")
	public int[] field132 = new int[5];

	@ObfuscatedName("client.pc")
	public int[] field136 = new int[ZMUSIVCS.field1516];

	@ObfuscatedName("client.rc")
	public int[] field137 = new int[7];

	@ObfuscatedName("client.tc")
	public int field139 = 50;

	@ObfuscatedName("client.uc")
	public int[] field140 = new int[field139];

	@ObfuscatedName("client.vc")
	public int[] field141 = new int[field139];

	@ObfuscatedName("client.wc")
	public int[] field142 = new int[field139];

	@ObfuscatedName("client.xc")
	public int[] field143 = new int[field139];

	@ObfuscatedName("client.yc")
	public int[] field144 = new int[field139];

	@ObfuscatedName("client.zc")
	public int[] field145 = new int[field139];

	@ObfuscatedName("client.Ac")
	public int[] field146 = new int[field139];

	@ObfuscatedName("client.Bc")
	public String[] field147 = new String[field139];

	@ObfuscatedName("client.Kc")
	public int[] field154 = new int[5];

	@ObfuscatedName("client.Mc")
	public int field156 = 0x4D4233;

	@ObfuscatedName("client.Pc")
	public int field158 = 0x23201B;

	@ObfuscatedName("client.Tc")
	public int[] field162 = new int[151];

	@ObfuscatedName("client.Uc")
	public int[] field163 = new int[5];

	@ObfuscatedName("client.cd")
	public int field171 = 2;

	@ObfuscatedName("client.xd")
	public int field188 = 0x766654;

	@ObfuscatedName("client.yd")
	public final int[] field189 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.zd")
	public int field190 = 78;

	@ObfuscatedName("client.Fd")
	public int field195 = -1;

	@ObfuscatedName("client.Gd")
	public int field196 = -1;

	@ObfuscatedName("client.Id")
	public int[] field198 = new int[151];

	@ObfuscatedName("client.Nd")
	public MNKDCXXG field203 = MNKDCXXG.method374(1);

	@ObfuscatedName("client.Od")
	public boolean field204 = false;

	@ObfuscatedName("client.Pd")
	public int field205 = -1;

	@ObfuscatedName("client.Qd")
	public int field206 = 0x332D25;

	@ObfuscatedName("client.Rd")
	public QEHNWGKD[] field207 = new QEHNWGKD[100];

	@ObfuscatedName("client.Sd")
	public boolean field208 = false;

	@ObfuscatedName("client.Wd")
	public QEHNWGKD[] field211 = new QEHNWGKD[20];

	@ObfuscatedName("client.fe")
	public int[] field219 = new int[500];

	@ObfuscatedName("client.ge")
	public int[] field220 = new int[500];

	@ObfuscatedName("client.he")
	public int[] field221 = new int[500];

	@ObfuscatedName("client.ie")
	public int[] field222 = new int[500];

	@ObfuscatedName("client.le")
	public int[][] field224 = new int[104][104];

	@ObfuscatedName("client.pe")
	public String field228 = "";

	@ObfuscatedName("client.qe")
	public String field229 = "";

	@ObfuscatedName("client.se")
	public boolean field230 = false;

	@ObfuscatedName("client.ue")
	public int field232 = 3;

	@ObfuscatedName("client.Ce")
	public int[] field239 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Je")
	public QEHNWGKD[] field245 = new QEHNWGKD[32];

	@ObfuscatedName("client.Ke")
	public boolean field246 = false;

	@ObfuscatedName("client.Oe")
	public int field248 = 2048;

	@ObfuscatedName("client.Pe")
	public int field249 = 2047;

	@ObfuscatedName("client.Qe")
	public CQCDOTXO[] field250 = new CQCDOTXO[field248];

	@ObfuscatedName("client.Se")
	public int[] field252 = new int[field248];

	@ObfuscatedName("client.Ue")
	public int[] field254 = new int[field248];

	@ObfuscatedName("client.Ve")
	public MNKDCXXG[] field255 = new MNKDCXXG[field248];

	@ObfuscatedName("client.Ze")
	public int[] field258 = new int[50];

	@ObfuscatedName("client.ef")
	public int field263 = -1;

	@ObfuscatedName("client.ff")
	public int field264 = -1;

	@ObfuscatedName("client.qf")
	public int[] field274 = new int[33];

	@ObfuscatedName("client.wf")
	public int field278 = -1;

	@ObfuscatedName("client.xf")
	public boolean field279 = false;

	@ObfuscatedName("client.Gf")
	public int field287 = -1;

	@ObfuscatedName("client.Hf")
	public int[] field288 = new int[50];

	@ObfuscatedName("client.Jf")
	public boolean field289 = false;

	@ObfuscatedName("client.Kf")
	public int field290 = -1;

	@ObfuscatedName("client.Of")
	public int[][][] field294 = new int[4][13][13];

	@ObfuscatedName("client.Wf")
	public int[] field302 = new int[ZMUSIVCS.field1516];

	@ObfuscatedName("client.Xf")
	public boolean field303 = false;

	@ObfuscatedName("client.Zf")
	public int field305 = -1;

	@ObfuscatedName("client.bg")
	public QEHNWGKD[] field306 = new QEHNWGKD[32];

	@ObfuscatedName("client.eg")
	public int field308 = -1;

	@ObfuscatedName("client.mg")
	public int field315 = -1;

	@ObfuscatedName("client.ng")
	public int[][] field316 = new int[104][104];

	@ObfuscatedName("client.pg")
	public int field317 = -1;

	@ObfuscatedName("client.ug")
	public boolean field322 = true;

	@ObfuscatedName("client.wg")
	public int[] field323 = new int[33];

	@ObfuscatedName("client.yg")
	public boolean field325 = false;

	@ObfuscatedName("client.zg")
	public boolean field326 = false;

	@ObfuscatedName("client.Ag")
	public int[][] field327 = new int[104][104];

	@ObfuscatedName("client.Bg")
	public String[] field328 = new String[5];

	@ObfuscatedName("client.Cg")
	public boolean[] field329 = new boolean[5];

	@ObfuscatedName("client.Jg")
	public boolean field335 = false;

	@ObfuscatedName("client.Pg")
	public MNKDCXXG field341 = new MNKDCXXG(new byte[5000]);

	@ObfuscatedName("client.Qg")
	public YQBVAFEO[] field342 = new YQBVAFEO[16384];

	@ObfuscatedName("client.Sg")
	public int[] field344 = new int[16384];

	@ObfuscatedName("client.Ug")
	public int[] field345 = new int[256];

	@ObfuscatedName("client.ah")
	public boolean field351 = false;

	@ObfuscatedName("client.ch")
	public int[] field353 = new int[200];

	@ObfuscatedName("client.dh")
	public boolean field354 = false;

	@ObfuscatedName("client.rh")
	public volatile boolean field367 = false;

	@ObfuscatedName("client.th")
	public int[] field369 = new int[1000];

	@ObfuscatedName("client.uh")
	public int[] field370 = new int[1000];

	@ObfuscatedName("client.vh")
	public boolean field371 = false;

	@ObfuscatedName("client.wh")
	public volatile boolean field372 = false;

	@ObfuscatedName("client.Ah")
	public int[] field376 = new int[9];

	@ObfuscatedName("client.Gh")
	public WOVRPCGT field382 = new WOVRPCGT();

	@ObfuscatedName("client.Th")
	public int field395 = 1;

	@ObfuscatedName("client.Wh")
	public WOVRPCGT field398 = new WOVRPCGT();

	@ObfuscatedName("client.fi")
	public MNKDCXXG field407 = MNKDCXXG.method374(1);

	@ObfuscatedName("client.gi")
	public int[] field408 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.ji")
	public MNKDCXXG field411 = MNKDCXXG.method374(1);

	@ObfuscatedName("client.ki")
	public WSLQJCTU[] field412 = new WSLQJCTU[5];

	@ObfuscatedName("client.oi")
	public int field415 = 2;

	@ObfuscatedName("client.pi")
	public int field416 = -1;

	@ObfuscatedName("client.wi")
	public boolean[] field422 = new boolean[5];

	@ObfuscatedName("client.Ci")
	public int[] field428 = new int[ZMUSIVCS.field1516];

	@ObfuscatedName("client.Oi")
	public int field438 = -1;

	@ObfuscatedName("client.Pi")
	public int[] field439 = new int[2000];

	@ObfuscatedName("client.Qi")
	public int[] field440 = new int[50];

	@ObfuscatedName("client.Ri")
	public int field441 = -1;

	@ObfuscatedName("client.Si")
	public BVXAXAEI[] field442 = new BVXAXAEI[2];

	@ObfuscatedName("client.Wi")
	public String field445 = "";

	@ObfuscatedName("client.Xi")
	public String field446 = "";

	@ObfuscatedName("client.ej")
	public int field452 = 1;

	@ObfuscatedName("client.fj")
	public int field453 = 128;

	@ObfuscatedName("client.kj")
	public long[] field458 = new long[100];

	@ObfuscatedName("client.mj")
	public byte[] field459 = new byte[16384];

	@ObfuscatedName("client.oj")
	public boolean field460 = true;

	@ObfuscatedName("client.sj")
	public boolean field463 = true;

	@ObfuscatedName("client.vj")
	public boolean field466 = false;

	@ObfuscatedName("client.yj")
	public int[] field469 = new int[1000];

	@ObfuscatedName("client.Bj")
	public String field470 = "";

	@ObfuscatedName("client.Ej")
	public boolean field473 = false;

	@ObfuscatedName("client.Rj")
	public String field484 = "";

	@ObfuscatedName("client.Tj")
	public String[] field486 = new String[100];

	@ObfuscatedName("client.Uj")
	public int[] field487 = new int[100];

	@ObfuscatedName("client.Wj")
	public boolean field489 = false;

	@ObfuscatedName("client.Zj")
	public boolean field491 = true;

	@ObfuscatedName("client.ak")
	public final int field492 = 100;

	@ObfuscatedName("client.bk")
	public int[] field493 = new int[100];

	@ObfuscatedName("client.ck")
	public int[] field494 = new int[4000];

	@ObfuscatedName("client.dk")
	public int[] field495 = new int[4000];

	@ObfuscatedName("client.gk")
	public String field496 = "";

	@ObfuscatedName("client.kk")
	public EKHWFCYP[] field498 = new EKHWFCYP[4];

	@ObfuscatedName("client.lk")
	public int field499 = -1;

	@ObfuscatedName("client.mk")
	public String field500 = "";

	@ObfuscatedName("client.nk")
	public CRC32 field501 = new CRC32();

	@ObfuscatedName("client.sk")
	public int[] field506 = new int[5];

	@ObfuscatedName("client.mc")
	public static BigInteger field133 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.nd")
	public static final int[] field181 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Ee")
	public static BigInteger field240 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.dg")
	public static final int[][] field307 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Eg")
	public static int field330 = 10;

	@ObfuscatedName("client.Gg")
	public static boolean field332 = true;

	@ObfuscatedName("client.nh")
	public static String field364 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Rh")
	public static int[] field393 = new int[32];

	@ObfuscatedName("client.wj")
	public static int[] field467 = new int[99];

	@ObfuscatedName("client.zb")
	public int field101;

	@ObfuscatedName("client.Ab")
	public int field102;

	@ObfuscatedName("client.Bb")
	public int field103;

	@ObfuscatedName("client.Cb")
	public int field104;

	@ObfuscatedName("client.Db")
	public int field105;

	@ObfuscatedName("client.Eb")
	public int field106;

	@ObfuscatedName("client.Fb")
	public int field107;

	@ObfuscatedName("client.Jb")
	public int field110;

	@ObfuscatedName("client.Pb")
	public static int field113;

	@ObfuscatedName("client.Qb")
	public int field114;

	@ObfuscatedName("client.Rb")
	public int field115;

	@ObfuscatedName("client.ac")
	public int field122;

	@ObfuscatedName("client.fc")
	public int field126;

	@ObfuscatedName("client.nc")
	public int field134;

	@ObfuscatedName("client.oc")
	public int field135;

	@ObfuscatedName("client.sc")
	public int field138;

	@ObfuscatedName("client.Ic")
	public int field152;

	@ObfuscatedName("client.Jc")
	public static int field153;

	@ObfuscatedName("client.Nc")
	public int field157;

	@ObfuscatedName("client.Qc")
	public int field159;

	@ObfuscatedName("client.Rc")
	public static int field160;

	@ObfuscatedName("client.Sc")
	public int field161;

	@ObfuscatedName("client.Zc")
	public int field168;

	@ObfuscatedName("client.ad")
	public int field169;

	@ObfuscatedName("client.bd")
	public int field170;

	@ObfuscatedName("client.id")
	public int field176;

	@ObfuscatedName("client.jd")
	public int field177;

	@ObfuscatedName("client.kd")
	public int field178;

	@ObfuscatedName("client.ld")
	public int field179;

	@ObfuscatedName("client.md")
	public int field180;

	@ObfuscatedName("client.ud")
	public int field185;

	@ObfuscatedName("client.wd")
	public int field187;

	@ObfuscatedName("client.Bd")
	public int field191;

	@ObfuscatedName("client.Cd")
	public int field192;

	@ObfuscatedName("client.Dd")
	public int field193;

	@ObfuscatedName("client.Ed")
	public int field194;

	@ObfuscatedName("client.Hd")
	public int field197;

	@ObfuscatedName("client.Jd")
	public int field199;

	@ObfuscatedName("client.Kd")
	public int field200;

	@ObfuscatedName("client.Ld")
	public int field201;

	@ObfuscatedName("client.Vd")
	public int field210;

	@ObfuscatedName("client.Xd")
	public static int field212;

	@ObfuscatedName("client.je")
	public static int field223;

	@ObfuscatedName("client.me")
	public int field225;

	@ObfuscatedName("client.ne")
	public int field226;

	@ObfuscatedName("client.oe")
	public int field227;

	@ObfuscatedName("client.Fe")
	public int field241;

	@ObfuscatedName("client.Ge")
	public static int field242;

	@ObfuscatedName("client.He")
	public int field243;

	@ObfuscatedName("client.Me")
	public int field247;

	@ObfuscatedName("client.Re")
	public int field251;

	@ObfuscatedName("client.Te")
	public int field253;

	@ObfuscatedName("client.We")
	public int field256;

	@ObfuscatedName("client.Ye")
	public int field257;

	@ObfuscatedName("client.af")
	public int field259;

	@ObfuscatedName("client.cf")
	public int field261;

	@ObfuscatedName("client.df")
	public int field262;

	@ObfuscatedName("client.tf")
	public int field275;

	@ObfuscatedName("client.uf")
	public int field276;

	@ObfuscatedName("client.vf")
	public static int field277;

	@ObfuscatedName("client.yf")
	public int field280;

	@ObfuscatedName("client.zf")
	public int field281;

	@ObfuscatedName("client.Af")
	public int field282;

	@ObfuscatedName("client.Bf")
	public int field283;

	@ObfuscatedName("client.Cf")
	public int field284;

	@ObfuscatedName("client.Df")
	public int field285;

	@ObfuscatedName("client.Lf")
	public int field291;

	@ObfuscatedName("client.Mf")
	public int field292;

	@ObfuscatedName("client.Nf")
	public static int field293;

	@ObfuscatedName("client.Qf")
	public int field296;

	@ObfuscatedName("client.Rf")
	public int field297;

	@ObfuscatedName("client.Sf")
	public int field298;

	@ObfuscatedName("client.Tf")
	public int field299;

	@ObfuscatedName("client.Uf")
	public int field300;

	@ObfuscatedName("client.Vf")
	public int field301;

	@ObfuscatedName("client.Yf")
	public int field304;

	@ObfuscatedName("client.fg")
	public int field309;

	@ObfuscatedName("client.gg")
	public int field310;

	@ObfuscatedName("client.hg")
	public int field311;

	@ObfuscatedName("client.ig")
	public int field312;

	@ObfuscatedName("client.jg")
	public int field313;

	@ObfuscatedName("client.kg")
	public int field314;

	@ObfuscatedName("client.sg")
	public int field320;

	@ObfuscatedName("client.tg")
	public int field321;

	@ObfuscatedName("client.xg")
	public int field324;

	@ObfuscatedName("client.Fg")
	public static int field331;

	@ObfuscatedName("client.Ig")
	public int field334;

	@ObfuscatedName("client.Rg")
	public int field343;

	@ObfuscatedName("client.Vg")
	public static int field346;

	@ObfuscatedName("client.Wg")
	public int field347;

	@ObfuscatedName("client.Xg")
	public int field348;

	@ObfuscatedName("client.Yg")
	public int field349;

	@ObfuscatedName("client.bh")
	public int field352;

	@ObfuscatedName("client.oh")
	public int field365;

	@ObfuscatedName("client.sh")
	public int field368;

	@ObfuscatedName("client.zh")
	public int field375;

	@ObfuscatedName("client.Bh")
	public int field377;

	@ObfuscatedName("client.Ch")
	public int field378;

	@ObfuscatedName("client.Dh")
	public int field379;

	@ObfuscatedName("client.Eh")
	public int field380;

	@ObfuscatedName("client.Fh")
	public int field381;

	@ObfuscatedName("client.Hh")
	public int field383;

	@ObfuscatedName("client.Ih")
	public int field384;

	@ObfuscatedName("client.Nh")
	public int field389;

	@ObfuscatedName("client.Oh")
	public int field390;

	@ObfuscatedName("client.Sh")
	public int field394;

	@ObfuscatedName("client.Uh")
	public static int field396;

	@ObfuscatedName("client.Xh")
	public int field399;

	@ObfuscatedName("client.Yh")
	public int field400;

	@ObfuscatedName("client.Zh")
	public int field401;

	@ObfuscatedName("client.ai")
	public int field402;

	@ObfuscatedName("client.bi")
	public int field403;

	@ObfuscatedName("client.ci")
	public int field404;

	@ObfuscatedName("client.hi")
	public static int field409;

	@ObfuscatedName("client.ii")
	public static int field410;

	@ObfuscatedName("client.mi")
	public static int field413;

	@ObfuscatedName("client.ni")
	public int field414;

	@ObfuscatedName("client.qi")
	public static int field417;

	@ObfuscatedName("client.ri")
	public int field418;

	@ObfuscatedName("client.xi")
	public int field423;

	@ObfuscatedName("client.yi")
	public int field424;

	@ObfuscatedName("client.zi")
	public int field425;

	@ObfuscatedName("client.Ai")
	public int field426;

	@ObfuscatedName("client.Bi")
	public int field427;

	@ObfuscatedName("client.Li")
	public int field436;

	@ObfuscatedName("client.Mi")
	public int field437;

	@ObfuscatedName("client.Ui")
	public int field443;

	@ObfuscatedName("client.Vi")
	public int field444;

	@ObfuscatedName("client.Zi")
	public int field447;

	@ObfuscatedName("client.aj")
	public int field448;

	@ObfuscatedName("client.bj")
	public int field449;

	@ObfuscatedName("client.cj")
	public int field450;

	@ObfuscatedName("client.dj")
	public int field451;

	@ObfuscatedName("client.gj")
	public int field454;

	@ObfuscatedName("client.hj")
	public int field455;

	@ObfuscatedName("client.ij")
	public int field456;

	@ObfuscatedName("client.qj")
	public int field461;

	@ObfuscatedName("client.rj")
	public int field462;

	@ObfuscatedName("client.tj")
	public static int field464;

	@ObfuscatedName("client.xj")
	public int field468;

	@ObfuscatedName("client.Cj")
	public int field471;

	@ObfuscatedName("client.Dj")
	public int field472;

	@ObfuscatedName("client.Fj")
	public int field474;

	@ObfuscatedName("client.Gj")
	public static int field475;

	@ObfuscatedName("client.Hj")
	public static int field476;

	@ObfuscatedName("client.Ij")
	public int field477;

	@ObfuscatedName("client.Pj")
	public int field482;

	@ObfuscatedName("client.Sj")
	public int field485;

	@ObfuscatedName("client.Vj")
	public int field488;

	@ObfuscatedName("client.hk")
	public int field497;

	@ObfuscatedName("client.ok")
	public int field502;

	@ObfuscatedName("client.pk")
	public int field503;

	@ObfuscatedName("client.qk")
	public int field504;

	@ObfuscatedName("client.rk")
	public int field505;

	@ObfuscatedName("client.J")
	public int field62;

	@ObfuscatedName("client.N")
	public int field66;

	@ObfuscatedName("client.P")
	public int field68;

	@ObfuscatedName("client.T")
	public int field71;

	@ObfuscatedName("client.U")
	public int field72;

	@ObfuscatedName("client.V")
	public int field73;

	@ObfuscatedName("client.W")
	public int field74;

	@ObfuscatedName("client.X")
	public int field75;

	@ObfuscatedName("client.Y")
	public int field76;

	@ObfuscatedName("client.bb")
	public static int field79;

	@ObfuscatedName("client.hb")
	public int field85;

	@ObfuscatedName("client.ib")
	public int field86;

	@ObfuscatedName("client.jb")
	public int field87;

	@ObfuscatedName("client.kb")
	public int field88;

	@ObfuscatedName("client.nb")
	public int field91;

	@ObfuscatedName("client.sb")
	public int field94;

	@ObfuscatedName("client.ub")
	public int field96;

	@ObfuscatedName("client.Ud")
	public long field209;

	@ObfuscatedName("client.te")
	public long field231;

	@ObfuscatedName("client.Pf")
	public long field295;

	@ObfuscatedName("client.ei")
	public long field406;

	@ObfuscatedName("client.jj")
	public long field457;

	@ObfuscatedName("client.ed")
	public BVXAXAEI field172;

	@ObfuscatedName("client.fd")
	public BVXAXAEI field173;

	@ObfuscatedName("client.gd")
	public BVXAXAEI field174;

	@ObfuscatedName("client.Yd")
	public BVXAXAEI field213;

	@ObfuscatedName("client.Zd")
	public BVXAXAEI field214;

	@ObfuscatedName("client.ae")
	public BVXAXAEI field215;

	@ObfuscatedName("client.be")
	public BVXAXAEI field216;

	@ObfuscatedName("client.ce")
	public BVXAXAEI field217;

	@ObfuscatedName("client.ve")
	public BVXAXAEI field233;

	@ObfuscatedName("client.we")
	public BVXAXAEI field234;

	@ObfuscatedName("client.xe")
	public BVXAXAEI field235;

	@ObfuscatedName("client.ye")
	public BVXAXAEI field236;

	@ObfuscatedName("client.ze")
	public BVXAXAEI field237;

	@ObfuscatedName("client.Kg")
	public BVXAXAEI field336;

	@ObfuscatedName("client.Lg")
	public BVXAXAEI field337;

	@ObfuscatedName("client.Mg")
	public BVXAXAEI field338;

	@ObfuscatedName("client.Ng")
	public BVXAXAEI field339;

	@ObfuscatedName("client.Og")
	public BVXAXAEI field340;

	@ObfuscatedName("client.fb")
	public BVXAXAEI field83;

	@ObfuscatedName("client.gb")
	public BVXAXAEI field84;

	@ObfuscatedName("client.ee")
	public static CQCDOTXO field218;

	@ObfuscatedName("client.td")
	public HFSXIPFN field184;

	@ObfuscatedName("client.Ec")
	public MEXICRKY field148;

	@ObfuscatedName("client.Fc")
	public MEXICRKY field149;

	@ObfuscatedName("client.Gc")
	public MEXICRKY field150;

	@ObfuscatedName("client.Hc")
	public MEXICRKY field151;

	@ObfuscatedName("client.gf")
	public MEXICRKY field265;

	@ObfuscatedName("client.hf")
	public MEXICRKY field266;

	@ObfuscatedName("client.jf")
	public MEXICRKY field267;

	@ObfuscatedName("client.kf")
	public MEXICRKY field268;

	@ObfuscatedName("client.lf")
	public MEXICRKY field269;

	@ObfuscatedName("client.mf")
	public MEXICRKY field270;

	@ObfuscatedName("client.nf")
	public MEXICRKY field271;

	@ObfuscatedName("client.of")
	public MEXICRKY field272;

	@ObfuscatedName("client.pf")
	public MEXICRKY field273;

	@ObfuscatedName("client.eh")
	public MEXICRKY field355;

	@ObfuscatedName("client.fh")
	public MEXICRKY field356;

	@ObfuscatedName("client.gh")
	public MEXICRKY field357;

	@ObfuscatedName("client.hh")
	public MEXICRKY field358;

	@ObfuscatedName("client.ih")
	public MEXICRKY field359;

	@ObfuscatedName("client.jh")
	public MEXICRKY field360;

	@ObfuscatedName("client.kh")
	public MEXICRKY field361;

	@ObfuscatedName("client.lh")
	public MEXICRKY field362;

	@ObfuscatedName("client.mh")
	public MEXICRKY field363;

	@ObfuscatedName("client.Kh")
	public MEXICRKY field386;

	@ObfuscatedName("client.Lh")
	public MEXICRKY field387;

	@ObfuscatedName("client.Mh")
	public MEXICRKY field388;

	@ObfuscatedName("client.uj")
	public NXFIIFAD field465;

	@ObfuscatedName("client.Qh")
	public OIFRHCSO field392;

	@ObfuscatedName("client.Lc")
	public QEHNWGKD field155;

	@ObfuscatedName("client.qd")
	public QEHNWGKD field182;

	@ObfuscatedName("client.rd")
	public QEHNWGKD field183;

	@ObfuscatedName("client.Md")
	public QEHNWGKD field202;

	@ObfuscatedName("client.xh")
	public QEHNWGKD field373;

	@ObfuscatedName("client.yh")
	public QEHNWGKD field374;

	@ObfuscatedName("client.Jh")
	public QEHNWGKD field385;

	@ObfuscatedName("client.Vh")
	public QEHNWGKD field397;

	@ObfuscatedName("client.Ei")
	public QEHNWGKD field429;

	@ObfuscatedName("client.Fi")
	public QEHNWGKD field430;

	@ObfuscatedName("client.Gi")
	public QEHNWGKD field431;

	@ObfuscatedName("client.Hi")
	public QEHNWGKD field432;

	@ObfuscatedName("client.Ii")
	public QEHNWGKD field433;

	@ObfuscatedName("client.Ji")
	public QEHNWGKD field434;

	@ObfuscatedName("client.Ki")
	public QEHNWGKD field435;

	@ObfuscatedName("client.kc")
	public UVSYUCDF field131;

	@ObfuscatedName("client.Mb")
	public UWINSVPX field112;

	@ObfuscatedName("client.Be")
	public XFJQTFBV field238;

	@ObfuscatedName("client.Jj")
	public XZMPLIVN field478;

	@ObfuscatedName("client.Kj")
	public XZMPLIVN field479;

	@ObfuscatedName("client.Lj")
	public XZMPLIVN field480;

	@ObfuscatedName("client.Mj")
	public XZMPLIVN field481;

	@ObfuscatedName("client.vd")
	public String field186;

	@ObfuscatedName("client.Ef")
	public String field286;

	@ObfuscatedName("client.Zg")
	public String field350;

	@ObfuscatedName("client.Qj")
	public String field483;

	@ObfuscatedName("client.mb")
	public Socket field90;

	@ObfuscatedName("client.Zb")
	public static boolean field121;

	@ObfuscatedName("client.Ie")
	public static boolean field244;

	@ObfuscatedName("client.Hg")
	public static boolean field333;

	@ObfuscatedName("client.ph")
	public static boolean field366;

	@ObfuscatedName("client.Sb")
	public int[] field116;

	@ObfuscatedName("client.Tb")
	public int[] field117;

	@ObfuscatedName("client.Ub")
	public int[] field118;

	@ObfuscatedName("client.Vb")
	public int[] field119;

	@ObfuscatedName("client.Vc")
	public int[] field164;

	@ObfuscatedName("client.Wc")
	public int[] field165;

	@ObfuscatedName("client.Xc")
	public int[] field166;

	@ObfuscatedName("client.Yc")
	public int[] field167;

	@ObfuscatedName("client.qg")
	public int[] field318;

	@ObfuscatedName("client.rg")
	public int[] field319;

	@ObfuscatedName("client.ti")
	public int[] field419;

	@ObfuscatedName("client.ui")
	public int[] field420;

	@ObfuscatedName("client.vi")
	public int[] field421;

	@ObfuscatedName("client.vb")
	public int[] field97;

	@ObfuscatedName("client.wb")
	public int[] field98;

	@ObfuscatedName("client.bf")
	public BVXAXAEI[] field260;

	@ObfuscatedName("client.hd")
	public byte[][] field175;

	@ObfuscatedName("client.Ph")
	public byte[][] field391;

	@ObfuscatedName("client.di")
	public byte[][][] field405;

	@ObfuscatedName("client.Xj")
	public int[][][] field490;

	@ObfuscatedName("client.a(IIZ)V")
	public final void method27(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field129[var4] != null) {
				int var5 = field127[var4];
				int var6 = field225 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field128[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field157 == 0 || field157 == 1 && method30(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field218.field527)) {
						if (field115 >= 1) {
							field64[field471] = "Report abuse @whi@" + var7;
							field221[field471] = 989;
							field471++;
						}

						field64[field471] = "Add ignore @whi@" + var7;
						field221[field471] = 405;
						field471++;
						field64[field471] = "Add friend @whi@" + var7;
						field221[field471] = 9;
						field471++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field114 == 0 && (var5 == 7 || field472 == 0 || field472 == 1 && method30(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field115 >= 1) {
							field64[field471] = "Report abuse @whi@" + var7;
							field221[field471] = 989;
							field471++;
						}

						field64[field471] = "Add ignore @whi@" + var7;
						field221[field471] = 405;
						field471++;
						field64[field471] = "Add friend @whi@" + var7;
						field221[field471] = 9;
						field471++;
					}

					var3++;
				}

				if (var5 == 4 && (field110 == 0 || field110 == 1 && method30(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field64[field471] = "Accept trade @whi@" + var7;
						field221[field471] = 386;
						field471++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field114 == 0 && field472 < 2) {
					var3++;
				}

				if (var5 == 8 && (field110 == 0 || field110 == 1 && method30(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field64[field471] = "Accept challenge @whi@" + var7;
						field221[field471] = 679;
						field471++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIILIJOSTBQT;II)V")
	public final void method28(int arg0, int arg1, int arg2, int arg3, IJOSTBQT arg4, int arg5, int arg6) {
		if (arg4.field855 == 0 && arg4.field843 != null && !arg4.field846 && (arg5 >= arg3 && arg2 >= arg0 && arg5 <= arg4.field831 + arg3 && arg2 <= arg4.field857 + arg0)) {
			int var8 = arg4.field843.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg4.field810[var9] + arg3;
				int var11 = arg4.field802[var9] + arg0 - arg6;
				IJOSTBQT var12 = IJOSTBQT.method276(arg4.field843[var9]);
				var10 += var12.field848;
				var11 += var12.field872;
				if ((var12.field827 >= 0 || var12.field829 != 0) && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field831 + var10 && arg2 < var12.field857 + var11) {
					if (var12.field827 >= 0) {
						field247 = var12.field827;
					} else {
						field247 = var12.field842;
					}
				}

				if (var12.field855 == 8 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field831 + var10 && arg2 < var12.field857 + var11) {
					field291 = var12.field842;
				}

				if (var12.field855 == 0) {
					method28(var11, arg1, arg2, var10, var12, arg5, var12.field804);

					if (var12.field835 > var12.field857) {
						method117(var12.field835, arg2, var12.field857, arg1, var11, var12, arg5, var12.field831 + var10);
					}
				} else {
					if (var12.field867 == 1 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field831 + var10 && arg2 < var12.field857 + var11) {
						boolean var13 = false;
						if (var12.field849 != 0) {
							var13 = method55(var12);
						}

						if (!var13) {
							field64[field471] = var12.field819;
							field221[field471] = 781;
							field220[field471] = var12.field842;
							field471++;
						}
					}

					if (var12.field867 == 2 && field347 == 0 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field831 + var10 && arg2 < var12.field857 + var11) {
						String var14 = var12.field870;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field64[field471] = var14 + " @gre@" + var12.field861;
						field221[field471] = 758;
						field220[field471] = var12.field842;
						field471++;
					}

					if (var12.field867 == 3 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field831 + var10 && arg2 < var12.field857 + var11) {
						field64[field471] = "Close";

						if (arg1 == 3) {
							field221[field471] = 720;
						} else {
							field221[field471] = 252;
						}

						field220[field471] = var12.field842;
						field471++;
					}

					if (var12.field867 == 4 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field831 + var10 && arg2 < var12.field857 + var11) {
						field64[field471] = var12.field819;
						field221[field471] = 392;
						field220[field471] = var12.field842;
						field471++;
					}

					if (var12.field867 == 5 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field831 + var10 && arg2 < var12.field857 + var11) {
						field64[field471] = var12.field819;
						field221[field471] = 569;
						field220[field471] = var12.field842;
						field471++;
					}

					if (var12.field867 == 6 && !field466 && arg5 >= var10 && arg2 >= var11 && arg5 < var12.field831 + var10 && arg2 < var12.field857 + var11) {
						field64[field471] = var12.field819;
						field221[field471] = 198;
						field220[field471] = var12.field842;
						field471++;
					}

					if (var12.field855 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field857; var16++) {
							for (int var17 = 0; var17 < var12.field831; var17++) {
								int var18 = (var12.field836 + 32) * var17 + var10;
								int var19 = (var12.field850 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field800[var15];
									var19 += var12.field853[var15];
								}

								if (arg5 >= var18 && arg2 >= var19 && arg5 < var18 + 32 && arg2 < var19 + 32) {
									field313 = var15;
									field314 = var12.field842;

									if (var12.field830[var15] > 0) {
										RSPHUXRT var20 = RSPHUXRT.method475(var12.field830[var15] - 1);
										if (field282 == 1 && var12.field845) {
											if (field284 != var12.field842 || field283 != var15) {
												field64[field471] = "Use " + field286 + " with @lre@" + var20.field1229;
												field221[field471] = 858;
												field222[field471] = var20.field1222;
												field219[field471] = var15;
												field220[field471] = var12.field842;
												field471++;
											}
										} else if (field347 != 1 || !var12.field845) {
											if (var12.field845) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1206 != null && var20.field1206[var21] != null) {
														field64[field471] = var20.field1206[var21] + " @lre@" + var20.field1229;

														if (var21 == 3) {
															field221[field471] = 459;
														}

														if (var21 == 4) {
															field221[field471] = 257;
														}

														field222[field471] = var20.field1222;
														field219[field471] = var15;
														field220[field471] = var12.field842;
														field471++;
													} else if (var21 == 4) {
														field64[field471] = "Drop @lre@" + var20.field1229;
														field221[field471] = 257;
														field222[field471] = var20.field1222;
														field219[field471] = var15;
														field220[field471] = var12.field842;
														field471++;
													}
												}
											}

											if (var12.field840) {
												field64[field471] = "Use @lre@" + var20.field1229;
												field221[field471] = 108;
												field222[field471] = var20.field1222;
												field219[field471] = var15;
												field220[field471] = var12.field842;
												field471++;
											}

											if (var12.field845 && var20.field1206 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1206[var22] != null) {
														field64[field471] = var20.field1206[var22] + " @lre@" + var20.field1229;

														if (var22 == 0) {
															field221[field471] = 524;
														}

														if (var22 == 1) {
															field221[field471] = 239;
														}

														if (var22 == 2) {
															field221[field471] = 518;
														}

														field222[field471] = var20.field1222;
														field219[field471] = var15;
														field220[field471] = var12.field842;
														field471++;
													}
												}
											}

											if (var12.field832 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field832[var23] != null) {
														field64[field471] = var12.field832[var23] + " @lre@" + var20.field1229;

														if (var23 == 0) {
															field221[field471] = 627;
														}

														if (var23 == 1) {
															field221[field471] = 734;
														}

														if (var23 == 2) {
															field221[field471] = 304;
														}

														if (var23 == 3) {
															field221[field471] = 974;
														}

														if (var23 == 4) {
															field221[field471] = 380;
														}

														field222[field471] = var20.field1222;
														field219[field471] = var15;
														field220[field471] = var12.field842;
														field471++;
													}
												}
											}

											field64[field471] = "Examine @lre@" + var20.field1229;
											field221[field471] = 1194;
											field222[field471] = var20.field1222;
											field219[field471] = var15;
											field220[field471] = var12.field842;
											field471++;
										} else if ((field349 & 0x10) == 0x10) {
											field64[field471] = field350 + " @lre@" + var20.field1229;
											field221[field471] = 308;
											field222[field471] = var20.field1222;
											field219[field471] = var15;
											field220[field471] = var12.field842;
											field471++;
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

	@ObfuscatedName("client.f(I)Ljava/net/Socket;")
	public final Socket method29(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean method30(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field168; var2++) {
			if (arg0.equalsIgnoreCase(field69[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field218.field527)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.g(I)V")
	public final void method31() {
		if (field280 == 2) {
			for (ATHECRQB var1 = (ATHECRQB) field130.method543(); var1 != null; var1 = (ATHECRQB) field130.method545()) {
				if (var1.field12 > 0) {
					var1.field12--;
				}

				if (var1.field12 != 0) {
					if (var1.field1 > 0) {
						var1.field1--;
					}

					if (var1.field1 == 0 && var1.field4 >= 1 && var1.field5 >= 1 && var1.field4 <= 102 && var1.field5 <= 102 && (var1.field6 < 0 || XTTZZRNP.method574(var1.field6, var1.field8))) {
						method108(var1.field3, var1.field4, var1.field2, var1.field6, var1.field7, var1.field8, var1.field5);
						var1.field1 = -1;

						if (var1.field9 == var1.field6 && var1.field9 == -1) {
							var1.method14();
						} else if (var1.field9 == var1.field6 && var1.field7 == var1.field10 && var1.field8 == var1.field11) {
							var1.method14();
						}
					}
				} else if (var1.field9 < 0 || XTTZZRNP.method574(var1.field9, var1.field11)) {
					method108(var1.field3, var1.field4, var1.field2, var1.field9, var1.field10, var1.field11, var1.field5);
					var1.method14();
				}
			}

			field417++;
			if (field417 > 1691) {
				field417 = 0;
				field411.method375(121);
				field411.method376(0);
				int var2 = field411.field1055;

				if ((int) (Math.random() * 2.0D) == 0) {
					field411.method377(39382);
				}

				field411.method376(22);
				field411.method377(7771);
				field411.method377(31532);
				field411.method377(3548);

				if ((int) (Math.random() * 2.0D) == 0) {
					field411.method376(45);
				}

				field411.method377(19292);
				field411.method376((int) (Math.random() * 256.0D));
				field411.method376(208);
				field411.method376(18);
				field411.method385(field411.field1055 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method32() {
		if (field91 == 0) {
			int var1 = field19 / 2 - 80;
			int var2 = field20 / 2 + 20;
			var2 += 20;
			if (field35 == 1 && field36 >= var1 - 75 && field36 <= var1 + 75 && field37 >= var2 - 20 && field37 <= var2 + 20) {
				field91 = 3;
				field502 = 0;
			}

			int var3 = field19 / 2 + 80;
			if (field35 == 1 && field36 >= var3 - 75 && field36 <= var3 + 75 && field37 >= var2 - 20 && field37 <= var2 + 20) {
				field445 = "";
				field446 = "Enter your username & password.";
				field91 = 2;
				field502 = 0;
			}
		} else if (field91 == 2) {
			int var4 = field20 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field35 == 1 && field37 >= var4 - 15 && field37 < var4) {
				field502 = 0;
			}

			var4 += 15;
			if (field35 == 1 && field37 >= var4 - 15 && field37 < var4) {
				field502 = 1;
			}

			var4 += 15;
			int var5 = field19 / 2 - 80;
			int var6 = field20 / 2 + 50;
			var6 += 20;
			if (field35 == 1 && field36 >= var5 - 75 && field36 <= var5 + 75 && field37 >= var6 - 20 && field37 <= var6 + 20) {
				field68 = 0;
				method84(field228, field229, false);

				if (field351) {
					return;
				}
			}

			int var7 = field19 / 2 + 80;
			if (field35 == 1 && field36 >= var7 - 75 && field36 <= var7 + 75 && field37 >= var6 - 20 && field37 <= var6 + 20) {
				field91 = 0;
				field228 = "";
				field229 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method5();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field364.length(); var10++) {
					if (var8 == field364.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field502 == 0) {
					if (var8 == 8 && field228.length() > 0) {
						field228 = field228.substring(0, field228.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field502 = 1;
					}

					if (var9) {
						field228 = field228 + (char) var8;
					}

					if (field228.length() > 12) {
						field228 = field228.substring(0, 12);
					}
				} else if (field502 == 1) {
					if (var8 == 8 && field229.length() > 0) {
						field229 = field229.substring(0, field229.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field502 = 0;
					}

					if (var9) {
						field229 = field229 + (char) var8;
					}

					if (field229.length() > 20) {
						field229 = field229.substring(0, 20);
					}
				}
			}
		} else if (field91 == 3) {
			int var11 = field19 / 2;
			int var12 = field20 / 2 + 50;
			var12 += 20;
			if (field35 == 1 && field36 >= var11 - 75 && field36 <= var11 + 75 && field37 >= var12 - 20 && field37 <= var12 + 20) {
				field91 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method33() {
		for (int var1 = 0; var1 < field352; var1++) {
			if (field288[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field258[var1] != field438 || field440[var1] != field308) {
						MNKDCXXG var3 = CQXSYOPM.method172(field258[var1], field440[var1]);
						if (System.currentTimeMillis() + var3.field1055 / 22 > field243 / 22 + field406) {
							field243 = var3.field1055;
							field406 = System.currentTimeMillis();

							if (method122(var3.field1055, var3.field1054)) {
								field438 = field258[var1];
								field308 = field440[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method114()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field411.method375(60);
						field411.method377(field258[var1] & 0x7FFF);
					} else {
						field411.method375(60);
						field411.method377(-1);
					}
				}

				if (var2 && field288[var1] != -5) {
					field288[var1] = -5;
				} else {
					field352--;
					for (int var5 = var1; var5 < field352; var5++) {
						field258[var5] = field258[var5 + 1];
						field440[var5] = field440[var5 + 1];
						field288[var5] = field288[var5 + 1];
					}

					var1--;
				}
			} else {
				field288[var1]--;
			}
		}

		field464++;
		if (field464 > 70) {
			field464 = 0;
			field411.method375(36);
		}

		if (field474 > 0) {
			field474 -= 20;
			if (field474 < 0) {
				field474 = 0;
			}

			if (field474 == 0 && field491 && !field333) {
				field462 = field278;
				field463 = true;
				field112.method533(2, field462);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILMNKDCXXG;)V")
	public final void method34(int arg0, MNKDCXXG arg1) {
		int var3 = arg1.method397(8);
		if (var3 < field251) {
			for (int var4 = var3; var4 < field251; var4++) {
				field469[field468++] = field252[var4];
			}
		}

		if (var3 > field251) {
			signlink.reporterror(field228 + " Too many players");
			throw new RuntimeException("eek");
		}

		field251 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field252[var5];
			CQCDOTXO var7 = field250[var6];
			int var8 = arg1.method397(1);
			if (var8 == 0) {
				field252[field251++] = var6;
				var7.field608 = field476;
			} else {
				int var9 = arg1.method397(2);
				if (var9 == 0) {
					field252[field251++] = var6;
					var7.field608 = field476;
					field254[field253++] = var6;
				} else if (var9 == 1) {
					field252[field251++] = var6;
					var7.field608 = field476;
					int var10 = arg1.method397(3);
					var7.method206(var10, false);
					int var11 = arg1.method397(1);
					if (var11 == 1) {
						field254[field253++] = var6;
					}
				} else if (var9 == 2) {
					field252[field251++] = var6;
					var7.field608 = field476;
					int var12 = arg1.method397(3);
					var7.method206(var12, true);
					int var13 = arg1.method397(3);
					var7.method206(var13, true);
					int var14 = arg1.method397(1);
					if (var14 == 1) {
						field254[field253++] = var6;
					}
				} else if (var9 == 3) {
					field469[field468++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILMNKDCXXG;I)V")
	public final void method35(MNKDCXXG arg0, int arg1) {
		for (int var3 = 0; var3 < field253; var3++) {
			int var4 = field254[var3];
			CQCDOTXO var5 = field250[var4];
			int var6 = arg0.method386();
			if ((var6 & 0x1) != 0) {
				var6 += arg0.method386() << 8;
			}

			method74(var5, var6, arg0, var4);
		}
	}

	@ObfuscatedName("client.a(ZLMNKDCXXG;I)V")
	public final void method36(MNKDCXXG arg0, int arg1) {
		while (arg0.field1056 + 21 < arg1 * 8) {
			int var3 = arg0.method397(14);
			if (var3 == 16383) {
				break;
			}

			if (field342[var3] == null) {
				field342[var3] = new YQBVAFEO();
			}

			YQBVAFEO var4 = field342[var3];
			field344[field343++] = var3;
			var4.field608 = field476;
			int var5 = arg0.method397(1);
			int var6 = arg0.method397(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method397(1);
			if (var7 == 1) {
				field254[field253++] = var3;
			}

			int var8 = arg0.method397(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1501 = PFWIJTDA.method442(arg0.method397(13));
			var4.field587 = var4.field1501.field1136;
			var4.field611 = var4.field1501.field1141;
			var4.field593 = var4.field1501.field1126;
			var4.field594 = var4.field1501.field1120;
			var4.field595 = var4.field1501.field1142;
			var4.field596 = var4.field1501.field1144;
			var4.field625 = var4.field1501.field1152;
			var4.method204(field218.field591[0] + var6, var5 == 1, field218.field590[0] + var8);
		}

		arg0.method398();
	}

	@ObfuscatedName("client.h(I)V")
	public final void method37() {
		if (field333 && field280 == 2 && XTTZZRNP.field1430 != field404) {
			method119(null, "Loading - please wait.");
			field280 = 1;
			field231 = System.currentTimeMillis();
		}

		if (field280 == 1) {
			int var1 = method38();
			if (var1 != 0 && System.currentTimeMillis() - field231 > 360000L) {
				signlink.reporterror(field228 + " glcfb " + field457 + "," + var1 + "," + field333 + "," + field412[0] + "," + field112.method526() + "," + field404 + "," + field504 + "," + field505);
				field231 = System.currentTimeMillis();
			}
		}

		if (field280 == 2 && field404 != field205) {
			field205 = field404;
			method87(field404);
		}
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method38() {
		for (int var1 = 0; var1 < field391.length; var1++) {
			if (field391[var1] == null && field420[var1] != -1) {
				return -1;
			}

			if (field175[var1] == null && field421[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field391.length; var3++) {
			byte[] var4 = field175[var3];
			if (var4 != null) {
				int var5 = (field419[var3] >> 8) * 64 - field309;
				int var6 = (field419[var3] & 0xFF) * 64 - field310;
				if (field67) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= XTTZZRNP.method570(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field289) {
			return -4;
		} else {
			field280 = 2;
			XTTZZRNP.field1430 = field404;
			method58();
			field411.method375(95);
			return 0;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method39() {
		field475++;
		if (field475 > 170) {
			field475 = 0;
			field411.method375(127);
			field411.method380(0);
		}

		for (int var1 = 0; var1 < field343; var1++) {
			int var2 = field344[var1];
			YQBVAFEO var3 = field342[var2];
			if (var3 != null) {
				method40(var3.field1501.field1136, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILFHOAYGUJ;)V")
	public final void method40(int arg0, FHOAYGUJ arg1) {
		if (arg1.field615 < 128 || arg1.field616 < 128 || arg1.field615 >= 13184 || arg1.field616 >= 13184) {
			arg1.field602 = -1;
			arg1.field619 = -1;
			arg1.field584 = 0;
			arg1.field585 = 0;
			arg1.field615 = arg1.field590[0] * 128 + arg1.field587 * 64;
			arg1.field616 = arg1.field591[0] * 128 + arg1.field587 * 64;
			arg1.method203();
		}

		if (field218 == arg1 && (arg1.field615 < 1536 || arg1.field616 < 1536 || arg1.field615 >= 11776 || arg1.field616 >= 11776)) {
			arg1.field602 = -1;
			arg1.field619 = -1;
			arg1.field584 = 0;
			arg1.field585 = 0;
			arg1.field615 = arg1.field590[0] * 128 + arg1.field587 * 64;
			arg1.field616 = arg1.field591[0] * 128 + arg1.field587 * 64;
			arg1.method203();
		}

		if (arg1.field584 > field476) {
			method41(arg1);
		} else if (arg1.field585 >= field476) {
			method42(arg1);
		} else {
			method43(arg1);
		}

		method44(arg1);
		method45(arg1);
	}

	@ObfuscatedName("client.a(ILFHOAYGUJ;)V")
	public final void method41(FHOAYGUJ arg0) {
		int var2 = arg0.field584 - field476;
		int var3 = arg0.field587 * 64 + arg0.field580 * 128;
		int var4 = arg0.field587 * 64 + arg0.field582 * 128;
		arg0.field615 += (var3 - arg0.field615) / var2;
		arg0.field616 += (var4 - arg0.field616) / var2;
		arg0.field575 = 0;

		if (arg0.field586 == 0) {
			arg0.field618 = 1024;
		}

		if (arg0.field586 == 1) {
			arg0.field618 = 1536;
		}

		if (arg0.field586 == 2) {
			arg0.field618 = 0;
		}

		if (arg0.field586 == 3) {
			arg0.field618 = 512;
		}
	}

	@ObfuscatedName("client.a(LFHOAYGUJ;I)V")
	public final void method42(FHOAYGUJ arg0) {
		if (field476 == arg0.field585 || arg0.field602 == -1 || arg0.field605 != 0 || arg0.field604 + 1 > QBINVEVU.field1165[arg0.field602].method451(arg0.field603)) {
			int var2 = arg0.field585 - arg0.field584;
			int var3 = field476 - arg0.field584;
			int var4 = arg0.field587 * 64 + arg0.field580 * 128;
			int var5 = arg0.field587 * 64 + arg0.field582 * 128;
			int var6 = arg0.field587 * 64 + arg0.field581 * 128;
			int var7 = arg0.field587 * 64 + arg0.field583 * 128;
			arg0.field615 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field616 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field575 = 0;

		if (arg0.field586 == 0) {
			arg0.field618 = 1024;
		}

		if (arg0.field586 == 1) {
			arg0.field618 = 1536;
		}

		if (arg0.field586 == 2) {
			arg0.field618 = 0;
		}

		if (arg0.field586 == 3) {
			arg0.field618 = 512;
		}

		arg0.field617 = arg0.field618;
	}

	@ObfuscatedName("client.a(LFHOAYGUJ;B)V")
	public final void method43(FHOAYGUJ arg0) {
		arg0.field577 = arg0.field625;
		if (arg0.field624 == 0) {
			arg0.field575 = 0;
		} else {
			if (arg0.field602 != -1 && arg0.field605 == 0) {
				QBINVEVU var2 = QBINVEVU.field1165[arg0.field602];
				if (arg0.field601 > 0 && var2.field1177 == 0) {
					arg0.field575++;
					return;
				}

				if (arg0.field601 <= 0 && var2.field1178 == 0) {
					arg0.field575++;
					return;
				}
			}

			int var3 = arg0.field615;
			int var4 = arg0.field616;
			int var5 = arg0.field590[arg0.field624 - 1] * 128 + arg0.field587 * 64;
			int var6 = arg0.field591[arg0.field624 - 1] * 128 + arg0.field587 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field618 = 1280;
					} else if (var4 > var6) {
						arg0.field618 = 1792;
					} else {
						arg0.field618 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field618 = 768;
					} else if (var4 > var6) {
						arg0.field618 = 256;
					} else {
						arg0.field618 = 512;
					}
				} else if (var4 < var6) {
					arg0.field618 = 1024;
				} else {
					arg0.field618 = 0;
				}

				int var7 = arg0.field618 - arg0.field617 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field594;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field593;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field596;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field595;
				}

				if (var8 == -1) {
					var8 = arg0.field593;
				}

				arg0.field577 = var8;
				int var9 = 4;
				if (arg0.field618 != arg0.field617 && arg0.field597 == -1 && arg0.field611 != 0) {
					var9 = 2;
				}

				if (arg0.field624 > 2) {
					var9 = 6;
				}

				if (arg0.field624 > 3) {
					var9 = 8;
				}

				if (arg0.field575 > 0 && arg0.field624 > 1) {
					var9 = 8;
					arg0.field575--;
				}

				if (arg0.field627[arg0.field624 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field593 == arg0.field577 && arg0.field592 != -1) {
					arg0.field577 = arg0.field592;
				}

				if (var3 < var5) {
					arg0.field615 += var9;
					if (arg0.field615 > var5) {
						arg0.field615 = var5;
					}
				} else if (var3 > var5) {
					arg0.field615 -= var9;
					if (arg0.field615 < var5) {
						arg0.field615 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field616 += var9;
					if (arg0.field616 > var6) {
						arg0.field616 = var6;
					}
				} else if (var4 > var6) {
					arg0.field616 -= var9;
					if (arg0.field616 < var6) {
						arg0.field616 = var6;
					}
				}

				if (arg0.field615 == var5 && arg0.field616 == var6) {
					arg0.field624--;

					if (arg0.field601 > 0) {
						arg0.field601--;
						return;
					}
				}
			} else {
				arg0.field615 = var5;
				arg0.field616 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ZLFHOAYGUJ;)V")
	public final void method44(FHOAYGUJ arg0) {
		if (arg0.field611 != 0) {
			if (arg0.field597 != -1 && arg0.field597 < 32768) {
				YQBVAFEO var2 = field342[arg0.field597];
				if (var2 != null) {
					int var3 = arg0.field615 - var2.field615;
					int var4 = arg0.field616 - var2.field616;
					if (var3 != 0 || var4 != 0) {
						arg0.field618 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field597 >= 32768) {
				int var5 = arg0.field597 - 32768;
				if (field315 == var5) {
					var5 = field249;
				}

				CQCDOTXO var6 = field250[var5];
				if (var6 != null) {
					int var7 = arg0.field615 - var6.field615;
					int var8 = arg0.field616 - var6.field616;
					if (var7 != 0 || var8 != 0) {
						arg0.field618 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field609 != 0 || arg0.field610 != 0) && (arg0.field624 == 0 || arg0.field575 > 0)) {
				int var9 = arg0.field615 - (arg0.field609 - field309 - field309) * 64;
				int var10 = arg0.field616 - (arg0.field610 - field310 - field310) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field618 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field609 = 0;
				arg0.field610 = 0;
			}

			int var11 = arg0.field618 - arg0.field617 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field611 || var11 > 2048 - arg0.field611) {
					arg0.field617 = arg0.field618;
				} else if (var11 > 1024) {
					arg0.field617 -= arg0.field611;
				} else {
					arg0.field617 += arg0.field611;
				}

				arg0.field617 &= 0x7FF;
				if (arg0.field625 == arg0.field577 && arg0.field618 != arg0.field617) {
					if (arg0.field626 != -1) {
						arg0.field577 = arg0.field626;
						return;
					}

					arg0.field577 = arg0.field593;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LFHOAYGUJ;Z)V")
	public final void method45(FHOAYGUJ arg0) {
		arg0.field607 = false;

		if (arg0.field577 != -1) {
			QBINVEVU var2 = QBINVEVU.field1165[arg0.field577];
			arg0.field579++;
			if (arg0.field578 < var2.field1166 && arg0.field579 > var2.method451(arg0.field578)) {
				arg0.field579 = 0;
				arg0.field578++;
			}

			if (arg0.field578 >= var2.field1166) {
				arg0.field579 = 0;
				arg0.field578 = 0;
			}
		}

		if (arg0.field619 != -1 && field476 >= arg0.field622) {
			if (arg0.field620 < 0) {
				arg0.field620 = 0;
			}

			QBINVEVU var3 = OPHZBIVR.field1106[arg0.field619].field1110;
			arg0.field621++;
			while (arg0.field620 < var3.field1166 && arg0.field621 > var3.method451(arg0.field620)) {
				arg0.field621 -= var3.method451(arg0.field620);
				arg0.field620++;
			}

			if (arg0.field620 >= var3.field1166 && (arg0.field620 < 0 || arg0.field620 >= var3.field1166)) {
				arg0.field619 = -1;
			}
		}

		if (arg0.field602 != -1 && arg0.field605 <= 1) {
			QBINVEVU var4 = QBINVEVU.field1165[arg0.field602];
			if (var4.field1177 == 1 && arg0.field601 > 0 && arg0.field584 <= field476 && arg0.field585 < field476) {
				arg0.field605 = 1;
				return;
			}
		}

		if (arg0.field602 != -1 && arg0.field605 == 0) {
			QBINVEVU var5 = QBINVEVU.field1165[arg0.field602];
			arg0.field604++;
			while (arg0.field603 < var5.field1166 && arg0.field604 > var5.method451(arg0.field603)) {
				arg0.field604 -= var5.method451(arg0.field603);
				arg0.field603++;
			}

			if (arg0.field603 >= var5.field1166) {
				arg0.field603 -= var5.field1170;
				arg0.field606++;
				if (arg0.field606 >= var5.field1176) {
					arg0.field602 = -1;
				}

				if (arg0.field603 < 0 || arg0.field603 >= var5.field1166) {
					arg0.field602 = -1;
				}
			}

			arg0.field607 = var5.field1172;
		}

		if (arg0.field605 > 0) {
			arg0.field605--;
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method46() {
		if (field416 == -1 || field280 != 2 && field22 == null) {
			if (field325) {
				method142();
				field325 = false;
				field355.method361(field21, 0, 4);
				field356.method361(field21, 0, 357);
				field357.method361(field21, 722, 4);
				field358.method361(field21, 743, 205);
				field359.method361(field21, 0, 0);
				field360.method361(field21, 516, 4);
				field361.method361(field21, 516, 205);
				field362.method361(field21, 496, 357);
				field363.method361(field21, 0, 338);
				field230 = true;
				field303 = true;
				field63 = true;
				field204 = true;

				if (field280 != 2) {
					field150.method361(field21, 4, 4);
					field149.method361(field21, 550, 4);
				}
			}

			if (field280 == 2) {
				method149();
			}

			if (field354 && field71 == 1) {
				field230 = true;
			}

			if (field195 != -1) {
				boolean var3 = method154(field276, field195);
				if (var3) {
					field230 = true;
				}
			}

			if (field450 == 2) {
				field230 = true;
			}

			if (field401 == 2) {
				field230 = true;
			}

			if (field230) {
				method104();
				field230 = false;
			}

			if (field305 == -1 && field135 == 0) {
				field99.field804 = field190 - field225 - 77;

				if (field29 > 448 && field29 < 560 && field30 > 332) {
					method117(field190, field30 - 357, 77, -1, 0, field99, field29 - 17, 463);
				}

				int var4 = field190 - field99.field804 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field190 - 77) {
					var4 = field190 - 77;
				}

				if (field225 != var4) {
					field225 = var4;
					field303 = true;
				}

				field293++;
				if (field293 > 1669) {
					field293 = 0;
					field411.method375(231);
					field411.method376(0);
					int var5 = field411.field1055;
					field411.method376((int) (Math.random() * 256.0D));
					field411.method377(48380);

					if ((int) (Math.random() * 2.0D) == 0) {
						field411.method376(16);
					}

					field411.method377((int) (Math.random() * 65536.0D));
					field411.method376(185);

					if ((int) (Math.random() * 2.0D) == 0) {
						field411.method376(239);
					}

					field411.method377(62945);

					if ((int) (Math.random() * 2.0D) == 0) {
						field411.method377(14921);
					}

					if ((int) (Math.random() * 2.0D) == 0) {
						field411.method377(5088);
					}

					field411.method377(14155);
					field411.method385(field411.field1055 - var5);
				}
			}

			if (field305 == -1 && field135 == 3) {
				int var6 = field485 * 14 + 7;
				field99.field804 = field488;

				if (field29 > 448 && field29 < 560 && field30 > 332) {
					method117(var6, field30 - 357, 77, -1, 0, field99, field29 - 17, 463);
				}

				int var7 = field99.field804;
				if (var7 < 0) {
					var7 = 0;
				}

				if (var7 > var6 - 77) {
					var7 = var6 - 77;
				}

				if (field488 != var7) {
					field488 = var7;
					field303 = true;
				}
			}

			if (field305 != -1) {
				boolean var8 = method154(field276, field305);
				if (var8) {
					field303 = true;
				}
			}

			if (field450 == 3) {
				field303 = true;
			}

			if (field401 == 3) {
				field303 = true;
			}

			if (field186 != null) {
				field303 = true;
			}

			if (field354 && field71 == 2) {
				field303 = true;
			}

			if (field303) {
				method165();
				field303 = false;
			}

			if (field280 == 2) {
				method146();
				field149.method361(field21, 550, 4);
			}

			if (field317 != -1) {
				field63 = true;
			}

			if (field63) {
				if (field317 != -1 && field317 == field232) {
					field317 = -1;
					field411.method375(244);
					field411.method376(field232);
				}

				field63 = false;
				field388.method360();
				field217.method20(0, 0);

				if (field195 == -1) {
					if (field239[field232] != -1) {
						if (field232 == 0) {
							field233.method20(10, 22);
						}

						if (field232 == 1) {
							field234.method20(8, 54);
						}

						if (field232 == 2) {
							field234.method20(8, 82);
						}

						if (field232 == 3) {
							field235.method20(8, 110);
						}

						if (field232 == 4) {
							field237.method20(8, 153);
						}

						if (field232 == 5) {
							field237.method20(8, 181);
						}

						if (field232 == 6) {
							field236.method20(9, 209);
						}
					}

					if (field239[0] != -1 && (field317 != 0 || field476 % 20 < 10)) {
						field108[0].method20(13, 29);
					}

					if (field239[1] != -1 && (field317 != 1 || field476 % 20 < 10)) {
						field108[1].method20(11, 53);
					}

					if (field239[2] != -1 && (field317 != 2 || field476 % 20 < 10)) {
						field108[2].method20(11, 82);
					}

					if (field239[3] != -1 && (field317 != 3 || field476 % 20 < 10)) {
						field108[3].method20(12, 115);
					}

					if (field239[4] != -1 && (field317 != 4 || field476 % 20 < 10)) {
						field108[4].method20(13, 153);
					}

					if (field239[5] != -1 && (field317 != 5 || field476 % 20 < 10)) {
						field108[5].method20(11, 180);
					}

					if (field239[6] != -1 && (field317 != 6 || field476 % 20 < 10)) {
						field108[6].method20(13, 208);
					}
				}

				field388.method361(field21, 516, 160);
				field387.method360();
				field216.method20(0, 0);

				if (field195 == -1) {
					if (field239[field232] != -1) {
						if (field232 == 7) {
							field336.method20(0, 42);
						}

						if (field232 == 8) {
							field337.method20(0, 74);
						}

						if (field232 == 9) {
							field337.method20(0, 102);
						}

						if (field232 == 10) {
							field338.method20(1, 130);
						}

						if (field232 == 11) {
							field340.method20(0, 173);
						}

						if (field232 == 12) {
							field340.method20(0, 201);
						}

						if (field232 == 13) {
							field339.method20(0, 229);
						}
					}

					if (field239[8] != -1 && (field317 != 8 || field476 % 20 < 10)) {
						field108[7].method20(2, 74);
					}

					if (field239[9] != -1 && (field317 != 9 || field476 % 20 < 10)) {
						field108[8].method20(3, 102);
					}

					if (field239[10] != -1 && (field317 != 10 || field476 % 20 < 10)) {
						field108[9].method20(4, 137);
					}

					if (field239[11] != -1 && (field317 != 11 || field476 % 20 < 10)) {
						field108[10].method20(2, 174);
					}

					if (field239[12] != -1 && (field317 != 12 || field476 % 20 < 10)) {
						field108[11].method20(2, 201);
					}

					if (field239[13] != -1 && (field317 != 13 || field476 % 20 < 10)) {
						field108[12].method20(2, 226);
					}
				}

				field387.method361(field21, 496, 466);
				field150.method360();
				UNBQQGBL.field1270 = field166;
			}

			if (field204) {
				field204 = false;
				field386.method360();
				field215.method20(0, 0);
				field479.method586(0xFFFFFF, true, 28, 55, "Public chat");

				if (field157 == 0) {
					field479.method586(0xFF00, true, 41, 55, "On");
				}

				if (field157 == 1) {
					field479.method586(0xFFFF00, true, 41, 55, "Friends");
				}

				if (field157 == 2) {
					field479.method586(0xFF0000, true, 41, 55, "Off");
				}

				if (field157 == 3) {
					field479.method586(0xFFFF, true, 41, 55, "Hide");
				}

				field479.method586(0xFFFFFF, true, 28, 184, "Private chat");

				if (field472 == 0) {
					field479.method586(0xFF00, true, 41, 184, "On");
				}

				if (field472 == 1) {
					field479.method586(0xFFFF00, true, 41, 184, "Friends");
				}

				if (field472 == 2) {
					field479.method586(0xFF0000, true, 41, 184, "Off");
				}

				field479.method586(0xFFFFFF, true, 28, 324, "Trade/compete");

				if (field110 == 0) {
					field479.method586(0xFF00, true, 41, 324, "On");
				}

				if (field110 == 1) {
					field479.method586(0xFFFF00, true, 41, 324, "Friends");
				}

				if (field110 == 2) {
					field479.method586(0xFF0000, true, 41, 324, "Off");
				}

				field479.method586(0xFFFFFF, true, 33, 458, "Report abuse");
				field386.method361(field21, 0, 453);
				field150.method360();
				UNBQQGBL.field1270 = field166;
			}

			field276 = 0;
		} else {
			if (field280 == 2) {
				method154(field276, field416);

				if (field290 != -1) {
					method154(field276, field290);
				}

				field276 = 0;
				method53();
				field22.method360();
				UNBQQGBL.field1270 = field167;
				UJSJLLWF.method482();
				field325 = true;
				IJOSTBQT var1 = IJOSTBQT.method276(field416);
				if (var1.field831 == 512 && var1.field857 == 334 && var1.field855 == 0) {
					var1.field831 = 765;
					var1.field857 = 503;
				}

				method105(0, var1, 0, 0);

				if (field290 != -1) {
					IJOSTBQT var2 = IJOSTBQT.method276(field290);
					if (var2.field831 == 512 && var2.field857 == 334 && var2.field855 == 0) {
						var2.field831 = 765;
						var2.field857 = 503;
					}

					method105(0, var2, 0, 0);
				}

				if (field354) {
					method60();
				} else {
					method128();
					method100();
				}
			}

			field22.method361(field21, 0, 0);
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method47() {
		int var1 = field176 * 128 + 64;
		int var2 = field177 * 128 + 64;
		int var3 = method153(var2, var1, field404) - field178;

		if (field423 < var1) {
			field423 += (var1 - field423) * field180 / 1000 + field179;
			if (field423 > var1) {
				field423 = var1;
			}
		}

		if (field423 > var1) {
			field423 -= (field423 - var1) * field180 / 1000 + field179;
			if (field423 < var1) {
				field423 = var1;
			}
		}

		if (field424 < var3) {
			field424 += (var3 - field424) * field180 / 1000 + field179;
			if (field424 > var3) {
				field424 = var3;
			}
		}

		if (field424 > var3) {
			field424 -= (field424 - var3) * field180 / 1000 + field179;
			if (field424 < var3) {
				field424 = var3;
			}
		}

		if (field425 < var2) {
			field425 += (var2 - field425) * field180 / 1000 + field179;
			if (field425 > var2) {
				field425 = var2;
			}
		}

		if (field425 > var2) {
			field425 -= (field425 - var2) * field180 / 1000 + field179;
			if (field425 < var2) {
				field425 = var2;
			}
		}

		int var4 = field377 * 128 + 64;
		int var5 = field378 * 128 + 64;
		int var6 = method153(var5, var4, field404) - field379;
		int var7 = var4 - field423;
		int var8 = var6 - field424;
		int var9 = var5 - field425;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field426 < var11) {
			field426 += (var11 - field426) * field381 / 1000 + field380;
			if (field426 > var11) {
				field426 = var11;
			}
		}

		if (field426 > var11) {
			field426 -= (field426 - var11) * field381 / 1000 + field380;
			if (field426 < var11) {
				field426 = var11;
			}
		}

		int var13 = var12 - field427;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field427 += field381 * var13 / 1000 + field380;
			field427 &= 0x7FF;
		}

		if (var13 < 0) {
			field427 -= -var13 * field381 / 1000 + field380;
			field427 &= 0x7FF;
		}

		int var14 = var12 - field427;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field427 = var12;
		}
	}

	@ObfuscatedName("client.a(LIJOSTBQT;B)Z")
	public final boolean method48(IJOSTBQT arg0) {
		int var2 = arg0.field849;
		if (field169 == 2) {
			if (var2 == 201) {
				field303 = true;
				field135 = 0;
				field489 = true;
				field496 = "";
				field257 = 1;
				field470 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field303 = true;
				field135 = 0;
				field489 = true;
				field496 = "";
				field257 = 2;
				field470 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field301 = 250;
			return true;
		}

		if (var2 == 501) {
			field303 = true;
			field135 = 0;
			field489 = true;
			field496 = "";
			field257 = 4;
			field470 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field303 = true;
			field135 = 0;
			field489 = true;
			field496 = "";
			field257 = 5;
			field470 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field137[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = PQTOFCBD.field1156 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= PQTOFCBD.field1156) {
							var5 = 0;
						}
					}

					if (!PQTOFCBD.field1157[var5].field1163 && PQTOFCBD.field1157[var5].field1158 == var3 + (field111 ? 0 : 7)) {
						break;
					}
				}

				field137[var3] = var5;
				field371 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field163[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field307[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field307[var6].length) {
					var8 = 0;
				}
			}

			field163[var6] = var8;
			field371 = true;
		}

		if (var2 == 324 && !field111) {
			field111 = true;
			method49();
		}

		if (var2 == 325 && field111) {
			field111 = false;
			method49();
		}

		if (var2 == 326) {
			field411.method375(219);
			field411.method376(field111 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field411.method376(field137[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field411.method376(field163[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field335 = !field335;
		}

		if (var2 >= 601 && var2 <= 613) {
			method52();

			if (field500.length() > 0) {
				field411.method375(153);
				field411.method382(UJXMBJLW.method491(field500));
				field411.method376(var2 - 601);
				field411.method376(field335 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method49() {
		field371 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field137[var1] = -1;
			for (int var2 = 0; var2 < PQTOFCBD.field1156; var2++) {
				if (!PQTOFCBD.field1157[var2].field1163 && PQTOFCBD.field1157[var2].field1158 == var1 + (field111 ? 0 : 7)) {
					field137[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method50(int arg0) {
		IJOSTBQT.method275(arg0);
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = IRLTEWJP.field941[var7];
			int var13 = IRLTEWJP.field942[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = IRLTEWJP.field941[var8];
			int var16 = IRLTEWJP.field942[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field423 = arg3 - var9;
		field424 = arg0 - var10;
		field425 = arg5 - var11;
		field426 = arg1;
		field427 = arg2;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method52() {
		field411.method375(232);

		if (field195 != -1) {
			method50(field195);
			field195 = -1;
			field230 = true;
			field466 = false;
			field63 = true;
		}

		if (field305 != -1) {
			method50(field305);
			field305 = -1;
			field303 = true;
			field466 = false;
		}

		if (field416 != -1) {
			method50(field416);
			field416 = -1;
			field325 = true;
		}

		if (field290 != -1) {
			method50(field290);
			field290 = -1;
		}

		if (field499 != -1) {
			method50(field499);
			field499 = -1;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method53() {
		if (field22 == null) {
			method115();
			field265 = null;
			field266 = null;
			field267 = null;
			field268 = null;
			field269 = null;
			field270 = null;
			field271 = null;
			field272 = null;
			field273 = null;
			field151 = null;
			field149 = null;
			field148 = null;
			field150 = null;
			field386 = null;
			field387 = null;
			field388 = null;
			field22 = new MEXICRKY(503, 765, method11());
			field325 = true;
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method54(boolean arg0) {
		if (field218.field615 >> 7 == field383 && field218.field616 >> 7 == field384) {
			field383 = 0;
		}

		int var2 = field251;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			CQCDOTXO var4;
			int var5;
			if (arg0) {
				var4 = field218;
				var5 = field249 << 14;
			} else {
				var4 = field250[field252[var3]];
				var5 = field252[var3] << 14;
			}

			if (var4 != null && var4.method166()) {
				var4.field519 = false;
				if ((field333 && field251 > 50 || field251 > 200) && !arg0 && var4.field625 == var4.field577) {
					var4.field519 = true;
				}

				int var6 = var4.field615 >> 7;
				int var7 = var4.field616 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field524 == null || field476 < var4.field531 || field476 >= var4.field532) {
						if ((var4.field615 & 0x7F) == 0x40 && (var4.field616 & 0x7F) == 0x40) {
							if (field316[var6][var7] == field259) {
								continue;
							}

							field316[var6][var7] = field259;
						}

						var4.field520 = method153(var4.field616, var4.field615, field404);
						field184.method227(60, var4.field617, field404, var4.field607, var4.field615, var4, var4.field520, var4.field616, var5);
					} else {
						var4.field519 = false;
						var4.field520 = method153(var4.field616, var4.field615, field404);
						field184.method228(var4.field616, var4.field512, var4.field615, field404, var4.field509, var4.field510, 60, var4.field511, var5, var4.field520, var4.field617, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(LIJOSTBQT;B)Z")
	public final boolean method55(IJOSTBQT arg0) {
		int var2 = arg0.field849;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field64[field471] = "Remove @whi@" + arg0.field847;
				field221[field471] = 305;
				field471++;
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

		field64[field471] = "Remove @whi@" + field69[var2];
		field221[field471] = 953;
		field471++;
		field64[field471] = "Message @whi@" + field69[var2];
		field221[field471] = 503;
		field471++;
		return true;
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method56(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.d(II)V")
	public final void method57(int arg0, int arg1) {
		WOVRPCGT var3 = field100[field404][arg0][arg1];
		if (var3 == null) {
			field184.method237(field404, arg0, arg1);
		} else {
			int var4 = -99999999;
			EOQVVIAH var5 = null;
			for (EOQVVIAH var6 = (EOQVVIAH) var3.method543(); var6 != null; var6 = (EOQVVIAH) var3.method545()) {
				RSPHUXRT var7 = RSPHUXRT.method475(var6.field574);
				int var8 = var7.field1200;
				if (var7.field1223) {
					var8 = (var6.field573 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method541(var5);
			EOQVVIAH var9 = null;
			EOQVVIAH var10 = null;
			for (EOQVVIAH var11 = (EOQVVIAH) var3.method543(); var11 != null; var11 = (EOQVVIAH) var3.method545()) {
				if (var5.field574 != var11.field574 && var9 == null) {
					var9 = var11;
				}

				if (var5.field574 != var11.field574 && var9.field574 != var11.field574 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field184.method223(var9, field404, var10, var12, arg1, arg0, var5, method153(arg1 * 128 + 64, arg0 * 128 + 64, field404));
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method58() {
		try {
			field205 = -1;
			field398.method547();
			field382.method547();
			field346++;
			if (field346 > 142) {
				field346 = 0;
				field411.method375(140);
				field411.method376(232);
			}

			UNBQQGBL.method500();
			method72();
			field184.method216();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field498[var1].method191();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field405[var2][var3][var4] = 0;
					}
				}
			}

			XTTZZRNP var5 = new XTTZZRNP(field490, 104, field405, 104);
			int var6 = field391.length;
			field411.method375(71);

			if (!field67) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field419[var7] >> 8) * 64 - field309;
					int var9 = (field419[var7] & 0xFF) * 64 - field310;
					byte[] var10 = field391[var7];
					if (var10 != null) {
						var5.method565(var8, (field504 - 6) * 8, var10, field498, (field505 - 6) * 8, var9);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field419[var11] >> 8) * 64 - field309;
					int var13 = (field419[var11] & 0xFF) * 64 - field310;
					byte[] var14 = field391[var11];
					if (var14 == null && field505 < 800) {
						var5.method563(var13, 64, var12, 64);
					}
				}

				field411.method375(71);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field175[var15];
					if (var16 != null) {
						int var17 = (field419[var15] >> 8) * 64 - field309;
						int var18 = (field419[var15] & 0xFF) * 64 - field310;
						var5.method564(var18, var16, field184, field498, var17);
					}
				}
			}

			if (field67) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field294[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field419.length; var29++) {
									if (field419[var29] == var28 && field391[var29] != null) {
										var5.method572(var19, var21 * 8, field498, field391[var29], var24, (var27 & 0x7) * 8, (var26 & 0x7) * 8, var20 * 8, var25);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method582(var20 * 8, var19, var21 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field294[0][var30][var31];
						if (var32 == -1) {
							var5.method563(var31 * 8, 8, var30 * 8, 8);
						}
					}
				}

				field411.method375(71);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field294[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field419.length; var42++) {
									if (field419[var42] == var41 && field175[var42] != null) {
										var5.method577(var35 * 8, field498, var34 * 8, (var39 & 0x7) * 8, var33, var37, (var40 & 0x7) * 8, field175[var42], field184, var38);
										break;
									}
								}
							}
						}
					}
				}
			}

			field411.method375(71);
			var5.method567(field184, field498);

			if (field150 != null) {
				field150.method360();
				UNBQQGBL.field1270 = field166;
			}

			field411.method375(71);
			int var43 = XTTZZRNP.field1439;
			if (var43 > field404) {
				var43 = field404;
			}

			if (var43 < field404 - 1) {
				int var44 = field404 - 1;
			}

			if (field333) {
				field184.method217(XTTZZRNP.field1439);
			} else {
				field184.method217(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method57(var45, var46);
				}
			}

			method65();
		} catch (Exception var59) {
		}

		MIQWCPVG.field1012.method429();

		if (field24 != null) {
			field411.method375(63);
			field411.method380(1057001181);
		}

		if (field333 && signlink.cache_dat != null) {
			int var48 = field112.method531(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field112.method525(var49);
				if ((var50 & 0x79) == 0) {
					IRLTEWJP.method280(var49);
				}
			}
		}

		System.gc();
		UNBQQGBL.method501(20);
		field112.method517();
		int var51 = (field504 - 6) / 8 - 1;
		int var52 = (field504 + 6) / 8 + 1;
		int var53 = (field505 - 6) / 8 - 1;
		int var54 = (field505 + 6) / 8 + 1;
		if (field279) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field112.method519(var55, var56, 0);
					if (var57 != -1) {
						field112.method527(var57, 3);
					}

					int var58 = field112.method519(var55, var56, 1);
					if (var58 != -1) {
						field112.method527(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method59(boolean arg0) {
		for (int var2 = 0; var2 < field343; var2++) {
			YQBVAFEO var3 = field342[field344[var2]];
			int var4 = (field344[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method166() && var3.field1501.field1130 == arg0 && var3.field1501.method441()) {
				int var5 = var3.field615 >> 7;
				int var6 = var3.field616 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field587 == 1 && (var3.field615 & 0x7F) == 0x40 && (var3.field616 & 0x7F) == 0x40) {
						if (field316[var5][var6] == field259) {
							continue;
						}

						field316[var5][var6] = field259;
					}

					if (!var3.field1501.field1127) {
						var4 += Integer.MIN_VALUE;
					}

					field184.method227((var3.field587 - 1) * 64 + 60, var3.field617, field404, var3.field607, var3.field615, var3, method153(var3.field616, var3.field615, field404), var3.field616, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method60() {
		int var1 = field72;
		int var2 = field73;
		int var3 = field74;
		int var4 = field75;
		int var5 = 0x5D5447;
		UJSJLLWF.method484(var5, var1, var2, var4, var3);
		UJSJLLWF.method484(0, var1 + 1, var2 + 1, 16, var3 - 2);
		UJSJLLWF.method485(var2 + 18, var3 - 2, var1 + 1, 0, var4 - 19);
		field480.method589(var5, "Choose Option", var1 + 3, var2 + 14);
		int var6 = field29;
		int var7 = field30;
		if (field71 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field71 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field71 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field471; var8++) {
			int var9 = (field471 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field480.method593(var10, var1 + 3, true, var9, field64[var8]);
		}
	}

	@ObfuscatedName("client.a(LMNKDCXXG;II)V")
	public final void method61(MNKDCXXG arg0, int arg1) {
		field468 = 0;
		field253 = 0;
		method113(arg1, arg0);
		method36(arg0, arg1);
		method91(arg1, arg0);

		for (int var3 = 0; var3 < field468; var3++) {
			int var4 = field469[var3];
			if (field476 != field342[var4].field608) {
				field342[var4].field1501 = null;
				field342[var4] = null;
			}
		}

		if (arg0.field1055 != arg1) {
			signlink.reporterror(field228 + " size mismatch in getnpcpos - pos:" + arg0.field1055 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field343; var5++) {
			if (field342[field344[var5]] == null) {
				signlink.reporterror(field228 + " null entry in npc list - pos:" + var5 + " size:" + field343);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method62() {
		for (int var1 = -1; var1 < field251; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field249;
			} else {
				var2 = field252[var1];
			}

			CQCDOTXO var3 = field250[var2];
			if (var3 != null && var3.field629 > 0) {
				var3.field629--;
				if (var3.field629 == 0) {
					var3.field628 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field343; var4++) {
			int var5 = field344[var4];
			YQBVAFEO var6 = field342[var5];
			if (var6 != null && var6.field629 > 0) {
				var6.field629--;
				if (var6.field629 == 0) {
					var6.field628 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method63() {
		short var1 = 256;

		if (field436 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field436 > 768) {
					field116[var2] = method120(1024 - field436, field118[var2], field117[var2]);
				} else if (field436 > 256) {
					field116[var2] = field118[var2];
				} else {
					field116[var2] = method120(256 - field436, field117[var2], field118[var2]);
				}
			}
		} else if (field437 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field437 > 768) {
					field116[var3] = method120(1024 - field437, field119[var3], field117[var3]);
				} else if (field437 > 256) {
					field116[var3] = field119[var3];
				} else {
					field116[var3] = method120(256 - field437, field117[var3], field119[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field116[var4] = field117[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field268.field1001[var5] = field434.field1181[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field345[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field318[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field116[var12];
					int var15 = field268.field1001[var7];
					field268.field1001[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field268.method361(field21, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field269.field1001[var16] = field435.field1181[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field345[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field318[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field116[var23];
					int var26 = field269.field1001[var18];
					field269.field1001[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field269.method361(field21, 637, 0);
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method64(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.d(B)V")
	public final void method65() {
		for (ATHECRQB var1 = (ATHECRQB) field130.method543(); var1 != null; var1 = (ATHECRQB) field130.method545()) {
			if (var1.field12 == -1) {
				var1.field1 = 0;
				method129(var1);
			} else {
				var1.method14();
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method66() {
		if (field106 == 2) {
			method94((field101 - field309 << 7) + field104, field103 * 2, (field102 - field310 << 7) + field105);

			if (field263 > -1 && field476 % 20 < 10) {
				field306[0].method458(field264 - 28, field263 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(LBVXAXAEI;Z)V")
	public final void method67(BVXAXAEI arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field97.length; var3++) {
			field97[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field97[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field98[var9] = (field97[var9 - 1] + field97[var9 + 1] + field97[var9 - 128] + field97[var9 + 128]) / 4;
				}
			}

			int[] var10 = field97;
			field97 = field98;
			field98 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field49; var12++) {
				for (int var13 = 0; var13 < arg0.field48; var13++) {
					if (arg0.field46[var11++] != 0) {
						int var14 = var13 + arg0.field50 + 16;
						int var15 = var12 + arg0.field51 + 16;
						int var16 = (var15 << 7) + var14;
						field97[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method8() {
		if (field112 != null) {
			field112.method529();
		}

		field112 = null;
		field490 = null;
		field405 = null;
		field184 = null;
		field498 = null;

		try {
			if (field238 != null) {
				field238.method556();
			}
		} catch (Exception var1) {
		}

		field238 = null;
		field268 = null;
		field269 = null;
		field265 = null;
		field266 = null;
		field267 = null;
		field459 = null;
		field386 = null;
		field387 = null;
		field388 = null;
		field355 = null;
		field356 = null;
		field357 = null;
		field358 = null;
		field148 = null;
		field149 = null;
		field150 = null;
		field151 = null;
		field336 = null;
		field337 = null;
		field338 = null;
		field339 = null;
		field340 = null;
		field397 = null;
		field250 = null;
		field252 = null;
		field254 = null;
		field255 = null;
		field469 = null;

		if (field392 != null) {
			field392.field1099 = false;
		}

		field392 = null;
		field359 = null;
		field360 = null;
		field361 = null;
		field362 = null;
		field363 = null;
		field120 = null;
		field207 = null;
		field215 = null;
		field216 = null;
		field217 = null;
		method141();
		field385 = null;
		field369 = null;
		field370 = null;
		field77 = null;
		field419 = null;
		field391 = null;
		field175 = null;
		field420 = null;
		field421 = null;
		field341 = null;
		field411 = null;
		field203 = null;
		field407 = null;
		field342 = null;
		field344 = null;
		field429 = null;
		field430 = null;
		field431 = null;
		field432 = null;
		field433 = null;
		field233 = null;
		field234 = null;
		field235 = null;
		field236 = null;
		field237 = null;
		field439 = null;
		field155 = null;
		field211 = null;
		field245 = null;
		field124 = null;
		field306 = null;
		field93 = null;
		field172 = null;
		field173 = null;
		field174 = null;
		field108 = null;
		field219 = null;
		field220 = null;
		field221 = null;
		field222 = null;
		field64 = null;
		field270 = null;
		field271 = null;
		field272 = null;
		field273 = null;
		field327 = null;
		field224 = null;
		field494 = null;
		field495 = null;
		field100 = null;
		field130 = null;
		field316 = null;
		field382 = null;
		field398 = null;
		field69 = null;
		field123 = null;
		field353 = null;
		method115();
		MIQWCPVG.method369();
		PFWIJTDA.method443();
		RSPHUXRT.method478();
		IJOSTBQT.method269();
		EIBTXPJE.field556 = null;
		PQTOFCBD.field1157 = null;
		GMTYCKMT.field703 = null;
		QBINVEVU.field1165 = null;
		OPHZBIVR.field1106 = null;
		OPHZBIVR.field1118 = null;
		GQDAZHGX.field714 = null;
		field22 = null;
		CQCDOTXO.field514 = null;
		UNBQQGBL.method497();
		HFSXIPFN.method215();
		IRLTEWJP.method277();
		FIYHSKKC.method209();
		System.gc();
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method68(byte[] arg0, boolean arg1) {
		if (field491) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method69() {
		int var1 = field480.method587("Choose Option");
		for (int var2 = 0; var2 < field471; var2++) {
			int var3 = field480.method587(field64[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field471 * 15 + 21;
		if (field36 > 4 && field37 > 4 && field36 < 516 && field37 < 338) {
			int var5 = field36 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field37 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field354 = true;
			field71 = 0;
			field72 = var5;
			field73 = var6;
			field74 = var1;
			field75 = field471 * 15 + 22;
		}

		if (field36 > 553 && field37 > 205 && field36 < 743 && field37 < 466) {
			int var7 = field36 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field37 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field354 = true;
			field71 = 1;
			field72 = var7;
			field73 = var8;
			field74 = var1;
			field75 = field471 * 15 + 22;
		}

		if (field36 > 17 && field37 > 357 && field36 < 496 && field37 < 453) {
			int var9 = field36 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field37 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field354 = true;
			field71 = 2;
			field72 = var9;
			field73 = var10;
			field74 = var1;
			field75 = field471 * 15 + 22;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method70() {
		for (int var1 = -1; var1 < field251; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field249;
			} else {
				var2 = field252[var1];
			}

			CQCDOTXO var3 = field250[var2];
			if (var3 != null) {
				method40(1, var3);
			}
		}
	}

	@ObfuscatedName("client.b(BZ)V")
	public final void method71(boolean arg0) {
		method150();
		field267.method360();
		field213.method20(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field91 == 0) {
			int var4 = var3 / 2 + 80;
			field478.method586(0x75A9A9, true, var4, var2 / 2, field112.field1321);
			int var5 = var3 / 2 - 20;
			field480.method586(0xFFFF00, true, var5, var2 / 2, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field214.method20(var7 - 20, var6 - 73);
			field480.method586(0xFFFFFF, true, var7 + 5, var6, "New User");
			int var8 = var2 / 2 + 80;
			field214.method20(var7 - 20, var8 - 73);
			field480.method586(0xFFFFFF, true, var7 + 5, var8, "Existing User");
		}

		if (field91 == 2) {
			int var9 = var3 / 2 - 40;
			if (field445.length() > 0) {
				field480.method586(0xFFFF00, true, var9 - 15, var2 / 2, field445);
				field480.method586(0xFFFF00, true, var9, var2 / 2, field446);
				var9 += 30;
			} else {
				field480.method586(0xFFFF00, true, var9 - 7, var2 / 2, field446);
				var9 += 30;
			}

			field480.method593(0xFFFFFF, var2 / 2 - 90, true, var9, "Username: " + field228 + (field502 == 0 & field476 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field480.method593(0xFFFFFF, var2 / 2 - 88, true, var9, "Password: " + UJXMBJLW.method496(field229) + (field502 == 1 & field476 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field214.method20(var11 - 20, var10 - 73);
				field480.method586(0xFFFFFF, true, var11 + 5, var10, "Login");
				int var12 = var2 / 2 + 80;
				field214.method20(var11 - 20, var12 - 73);
				field480.method586(0xFFFFFF, true, var11 + 5, var12, "Cancel");
			}
		}

		if (field91 == 3) {
			field480.method586(0xFFFF00, true, var3 / 2 - 60, var2 / 2, "Create a free account");
			int var13 = var3 / 2 - 35;
			field480.method586(0xFFFFFF, true, var13, var2 / 2, "To create a new account you need to");
			var13 += 15;
			field480.method586(0xFFFFFF, true, var13, var2 / 2, "go back to the main RuneScape webpage");
			var13 += 15;
			field480.method586(0xFFFFFF, true, var13, var2 / 2, "and choose the 'create account'");
			var13 += 15;
			field480.method586(0xFFFFFF, true, var13, var2 / 2, "button near the top of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field214.method20(var15 - 20, var14 - 73);
			field480.method586(0xFFFFFF, true, var15 + 5, var14, "Cancel");
		}

		field267.method361(field21, 202, 171);

		if (field325) {
			field325 = false;
			field265.method361(field21, 128, 0);
			field266.method361(field21, 202, 371);
			field270.method361(field21, 0, 265);
			field271.method361(field21, 562, 265);
			field272.method361(field21, 128, 171);
			field273.method361(field21, 562, 171);
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field24 != null) {
				return new URL("http://127.0.0.1:" + (field331 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.f(B)V")
	public final void method72() {
		MIQWCPVG.field1012.method429();
		MIQWCPVG.field1025.method429();
		PFWIJTDA.field1139.method429();
		RSPHUXRT.field1209.method429();
		RSPHUXRT.field1231.method429();
		CQCDOTXO.field514.method429();
		OPHZBIVR.field1118.method429();
	}

	@ObfuscatedName("client.a(IBLjava/lang/String;)V")
	public final void method13(int arg0, String arg1) {
		field281 = arg0;
		field483 = arg1;
		method150();

		if (field465 == null) {
			super.method13(arg0, arg1);
		} else {
			field267.method360();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field480.method585(0xFFFFFF, var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			UJSJLLWF.method485(var6, 304, var3 / 2 - 152, 0x8C1111, 34);
			UJSJLLWF.method485(var6 + 1, 302, var3 / 2 - 151, 0, 32);
			UJSJLLWF.method484(0x8C1111, var3 / 2 - 150, var6 + 2, 30, arg0 * 3);
			UJSJLLWF.method484(0, arg0 * 3 + var3 / 2 - 150, var6 + 2, 30, 300 - arg0 * 3);
			field480.method585(0xFFFFFF, var4 / 2 + 5 - var5, var3 / 2, arg1);
			field267.method361(field21, 202, 171);

			if (field325) {
				field325 = false;

				if (!field372) {
					field268.method361(field21, 0, 0);
					field269.method361(field21, 637, 0);
				}

				field265.method361(field21, 128, 0);
				field266.method361(field21, 202, 371);
				field270.method361(field21, 0, 265);
				field271.method361(field21, 562, 265);
				field272.method361(field21, 128, 171);
				field273.method361(field21, 562, 171);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method73(String arg0) {
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

	@ObfuscatedName("client.a(ILCQCDOTXO;ILMNKDCXXG;I)V")
	public final void method74(CQCDOTXO arg0, int arg1, MNKDCXXG arg2, int arg3) {
		if ((arg1 & 0x4) != 0) {
			arg0.field597 = arg2.method414();
			if (arg0.field597 == 0xFFFF) {
				arg0.field597 = -1;
			}
		}

		if ((arg1 & 0x40) != 0) {
			int var5 = arg2.method405();
			byte[] var6 = new byte[var5];
			MNKDCXXG var7 = new MNKDCXXG(var6);
			arg2.method424(var6, 0, var5);
			field255[arg3] = var7;
			arg0.method170(var7);
		}

		if ((arg1 & 0x20) != 0) {
			arg0.field609 = arg2.method388();
			arg0.field610 = arg2.method388();
		}

		if ((arg1 & 0x8) != 0) {
			int var8 = arg2.method386();
			int var9 = arg2.method405();
			arg0.method205(field476, var9, var8);
			arg0.field612 = field476 + 300;
			arg0.field613 = arg2.method407();
			arg0.field614 = arg2.method405();
		}

		if ((arg1 & 0x100) != 0) {
			arg0.field619 = arg2.method388();
			int var10 = arg2.method423();
			arg0.field623 = var10 >> 16;
			arg0.field622 = (var10 & 0xFFFF) + field476;
			arg0.field620 = 0;
			arg0.field621 = 0;

			if (arg0.field622 > field476) {
				arg0.field620 = -1;
			}

			if (arg0.field619 == 0xFFFF) {
				arg0.field619 = -1;
			}
		}

		if ((arg1 & 0x10) != 0) {
			int var11 = arg2.method414();
			if (var11 == 0xFFFF) {
				var11 = -1;
			}

			int var12 = arg2.method386();
			if (arg0.field602 == var11 && var11 != -1) {
				int var13 = QBINVEVU.field1165[var11].field1179;
				if (var13 == 1) {
					arg0.field603 = 0;
					arg0.field604 = 0;
					arg0.field605 = var12;
					arg0.field606 = 0;
				}

				if (var13 == 2) {
					arg0.field606 = 0;
				}
			} else if (var11 == -1 || arg0.field602 == -1 || QBINVEVU.field1165[var11].field1173 >= QBINVEVU.field1165[arg0.field602].field1173) {
				arg0.field602 = var11;
				arg0.field603 = 0;
				arg0.field604 = 0;
				arg0.field605 = var12;
				arg0.field606 = 0;
				arg0.field601 = arg0.field624;
			}
		}

		if ((arg1 & 0x2) != 0) {
			int var14 = arg2.method414();
			int var15 = arg2.method406();
			int var16 = arg2.method406();
			int var17 = arg2.field1055;

			if (arg0.field527 != null && arg0.field516) {
				long var18 = UJXMBJLW.method491(arg0.field527);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < field292; var21++) {
						if (field458[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}

				if (!var20 && field262 == 0) {
					try {
						field341.field1055 = 0;
						arg2.method424(field341.field1054, 0, var16);
						field341.field1055 = 0;
						String var22 = YOLZIXCN.method600(var16, field341);
						var22 = LJNJPDAK.method328(var22);
						arg0.field628 = var22;
						arg0.field576 = var14 >> 8;
						arg0.field588 = var14 & 0xFF;
						arg0.field629 = 150;

						if (var15 == 2 || var15 == 3) {
							method121(var22, 1, "@cr2@" + arg0.field527);
						} else if (var15 == 1) {
							method121(var22, 1, "@cr1@" + arg0.field527);
						} else {
							method121(var22, 2, arg0.field527);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field1055 = var16 + var17;
		}

		if ((arg1 & 0x200) != 0) {
			arg0.field580 = arg2.method405();
			arg0.field582 = arg2.method405();
			arg0.field581 = arg2.method386();
			arg0.field583 = arg2.method405();
			arg0.field584 = arg2.method415() + field476;
			arg0.field585 = arg2.method415() + field476;
			arg0.field586 = arg2.method405();
			arg0.method203();
		}

		if ((arg1 & 0x80) != 0) {
			arg0.field628 = arg2.method393();
			if (arg0.field628.charAt(0) == '~') {
				arg0.field628 = arg0.field628.substring(1);
				method121(arg0.field628, 2, arg0.field527);
			} else if (field218 == arg0) {
				method121(arg0.field628, 2, arg0.field527);
			}

			arg0.field576 = 0;
			arg0.field588 = 0;
			arg0.field629 = 150;
		}

		if ((arg1 & 0x400) != 0) {
			int var24 = arg2.method407();
			int var25 = arg2.method386();
			arg0.method205(field476, var25, var24);
			arg0.field612 = field476 + 300;
			arg0.field613 = arg2.method407();
			arg0.field614 = arg2.method406();
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method75(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field168; var3++) {
				if (field123[var3] == arg0) {
					field168--;
					field230 = true;

					for (int var4 = var3; var4 < field168; var4++) {
						field69[var4] = field69[var4 + 1];
						field353[var4] = field353[var4 + 1];
						field123[var4] = field123[var4 + 1];
					}

					field411.method375(230);
					field411.method382(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method9() {
		if (field81 || field473 || field208) {
			method135();
		} else {
			field79++;

			if (field351) {
				method46();
			} else {
				method71(false);
			}

			field161 = 0;
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method76(long arg0) {
		if (arg0 != 0L) {
			if (field168 >= 100 && field497 != 1) {
				method121("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else if (field168 >= 200) {
				method121("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else {
				String var3 = UJXMBJLW.method495(UJXMBJLW.method492(arg0));
				for (int var4 = 0; var4 < field168; var4++) {
					if (field123[var4] == arg0) {
						method121(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field292; var5++) {
					if (field458[var5] == arg0) {
						method121("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(field218.field527)) {
					field69[field168] = var3;
					field123[field168] = arg0;
					field353[field168] = 0;
					field168++;
					field230 = true;
					field411.method375(40);
					field411.method382(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method77() {
		method145();

		if (field194 == 1) {
			field93[field193 / 100].method458(field192 - 8 - 4, field191 - 8 - 4);
		}

		if (field194 == 2) {
			field93[field193 / 100 + 4].method458(field192 - 8 - 4, field191 - 8 - 4);
		}

		if (field196 != -1) {
			method154(field276, field196);
			method105(0, IJOSTBQT.method276(field196), 0, 0);
		}

		if (field499 != -1) {
			method154(field276, field499);
			method105(0, IJOSTBQT.method276(field499), 0, 0);
		}

		method97();

		if (!field354) {
			method128();
			method100();
		} else if (field71 == 0) {
			method60();
		}

		if (field85 == 1) {
			field397.method458(296, 472);
		}

		if (field244) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field17 < 30 && field333) {
				var3 = 0xFF0000;
			}

			if (field17 < 20 && !field333) {
				var3 = 0xFF0000;
			}

			field479.method584(var2, "Fps:" + field17, var1, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field333) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field333) {
				int var8 = 0xFF0000;
			}

			field479.method584(var2, "Mem:" + var5 + "k", var1, 0xFFFF00);
			var2 += 15;
		}

		if (field197 != 0) {
			int var9 = field197 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field479.method589(0xFFFF00, "System update in: " + var10 + ":0" + var9, 4, 329);
			} else {
				field479.method589(0xFFFF00, "System update in: " + var10 + ":" + var9, 4, 329);
			}
		}
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method78(long arg0) {
		if (arg0 != 0L) {
			if (field292 >= 100) {
				method121("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = UJXMBJLW.method495(UJXMBJLW.method492(arg0));
				for (int var4 = 0; var4 < field292; var4++) {
					if (field458[var4] == arg0) {
						method121(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < field168; var5++) {
					if (field123[var5] == arg0) {
						method121("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				field458[field292++] = arg0;
				field230 = true;
				field411.method375(226);
				field411.method382(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIZI)V")
	public final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		ATHECRQB var10 = null;
		for (ATHECRQB var11 = (ATHECRQB) field130.method543(); var11 != null; var11 = (ATHECRQB) field130.method545()) {
			if (var11.field2 == arg7 && var11.field4 == arg4 && var11.field5 == arg1 && var11.field3 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new ATHECRQB();
			var10.field2 = arg7;
			var10.field3 = arg8;
			var10.field4 = arg4;
			var10.field5 = arg1;
			method129(var10);
			field130.method540(var10);
		}

		var10.field6 = arg5;
		var10.field8 = arg2;
		var10.field7 = arg0;
		var10.field1 = arg6;
		var10.field12 = arg3;
	}

	@ObfuscatedName("client.a(IIIZII)V")
	public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field83.method20(arg4, arg1);
		field84.method20(arg2 + arg4 - 16, arg1);
		UJSJLLWF.method484(field158, arg1, arg4 + 16, arg2 - 32, 16);
		int var6 = (arg2 - 32) * arg2 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg3 / (arg0 - arg2);
		UJSJLLWF.method484(field156, arg1, arg4 + var7 + 16, var6, 16);
		UJSJLLWF.method489(field188, arg1, var6, arg4 + var7 + 16);
		UJSJLLWF.method489(field188, arg1 + 1, var6, arg4 + var7 + 16);
		UJSJLLWF.method487(arg1, field188, 16, arg4 + var7 + 16);
		UJSJLLWF.method487(arg1, field188, 16, arg4 + var7 + 17);
		UJSJLLWF.method489(field206, arg1 + 15, var6, arg4 + var7 + 16);
		UJSJLLWF.method489(field206, arg1 + 14, var6 - 1, arg4 + var7 + 17);
		UJSJLLWF.method487(arg1, field206, 16, arg4 + var7 + var6 + 15);
		UJSJLLWF.method487(arg1 + 1, field206, 15, arg4 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.a(LMNKDCXXG;BI)V")
	public final void method81(MNKDCXXG arg0, int arg1) {
		if (arg1 == 239) {
			int var3 = arg0.method386();
			int var4 = (var3 >> 4 & 0x7) + field389;
			int var5 = (var3 & 0x7) + field390;
			int var6 = var4 + arg0.method387();
			int var7 = var5 + arg0.method387();
			int var8 = arg0.method389();
			int var9 = arg0.method388();
			int var10 = arg0.method386() * 4;
			int var11 = arg0.method386() * 4;
			int var12 = arg0.method388();
			int var13 = arg0.method388();
			int var14 = arg0.method386();
			int var15 = arg0.method386();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 != 0xFFFF) {
				var4 = var4 * 128 + 64;
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				var7 = var7 * 128 + 64;
				VVKZWHMC var16 = new VVKZWHMC(field404, field476 + var13, method153(var5, var4, field404) - var10, var4, var15, var14, var11, var5, field476 + var12, var8, var9);
				var16.method538(var7, var6, field476 + var12, method153(var7, var6, field404) - var11);
				field382.method540(var16);
			}
		} else if (arg1 == 197) {
			int var17 = arg0.method415();
			int var18 = arg0.method405();
			int var19 = var18 >> 2;
			int var20 = var18 & 0x3;
			int var21 = field189[var19];
			int var22 = arg0.method407();
			int var23 = (var22 >> 4 & 0x7) + field389;
			int var24 = (var22 & 0x7) + field390;
			if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
				method79(var20, var24, var19, -1, var23, var17, 0, field404, var21);
			}
		} else if (arg1 == 109) {
			int var25 = arg0.method386();
			int var26 = (var25 >> 4 & 0x7) + field389;
			int var27 = (var25 & 0x7) + field390;
			int var28 = arg0.method388();
			int var29 = arg0.method386();
			int var30 = arg0.method388();
			if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
				var26 = var26 * 128 + 64;
				var27 = var27 * 128 + 64;
				KSCKZMBT var31 = new KSCKZMBT(var28, var27, var26, method153(var27, var26, field404) - var29, field476, field404, var30);
				field398.method540(var31);
			}
		} else {
			if (arg1 == 49) {
				int var32 = arg0.method388();
				byte var33 = arg0.method408();
				byte var34 = arg0.method409();
				int var35 = arg0.method407();
				int var36 = var35 >> 2;
				int var37 = var35 & 0x3;
				int var38 = field189[var36];
				int var39 = arg0.method413();
				byte var40 = arg0.method409();
				int var41 = arg0.method413();
				byte var42 = arg0.method387();
				int var43 = arg0.method405();
				int var44 = (var43 >> 4 & 0x7) + field389;
				int var45 = (var43 & 0x7) + field390;
				int var46 = arg0.method414();
				CQCDOTXO var47;
				if (field315 == var32) {
					var47 = field218;
				} else {
					var47 = field250[var32];
				}

				if (var47 != null) {
					MIQWCPVG var48 = MIQWCPVG.method363(var46);
					int var49 = field490[field404][var44][var45];
					int var50 = field490[field404][var44 + 1][var45];
					int var51 = field490[field404][var44 + 1][var45 + 1];
					int var52 = field490[field404][var44][var45 + 1];
					IRLTEWJP var53 = var48.method365(var36, var37, var49, var50, var51, var52, -1);
					if (var53 != null) {
						method79(0, var45, 0, var39 + 1, var44, -1, var41 + 1, field404, var38);
						var47.field531 = field476 + var41;
						var47.field532 = field476 + var39;
						var47.field524 = var53;
						int var54 = var48.field1017;
						int var55 = var48.field1019;
						if (var37 == 1 || var37 == 3) {
							var54 = var48.field1019;
							var55 = var48.field1017;
						}

						var47.field521 = var44 * 128 + var54 * 64;
						var47.field523 = var45 * 128 + var55 * 64;
						var47.field522 = method153(var47.field523, var47.field521, field404);

						if (var34 > var33) {
							byte var56 = var34;
							var34 = var33;
							var33 = var56;
						}

						if (var40 > var42) {
							byte var57 = var40;
							var40 = var42;
							var42 = var57;
						}

						var47.field509 = var34 + var44;
						var47.field511 = var33 + var44;
						var47.field510 = var40 + var45;
						var47.field512 = var42 + var45;
					}
				}
			}

			if (arg1 == 150) {
				int var58 = arg0.method388();
				int var59 = arg0.method405();
				int var60 = (var59 >> 4 & 0x7) + field389;
				int var61 = (var59 & 0x7) + field390;
				int var62 = arg0.method415();
				int var63 = arg0.method413();
				if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && field315 != var62) {
					EOQVVIAH var64 = new EOQVVIAH();
					var64.field574 = var58;
					var64.field573 = var63;

					if (field100[field404][var60][var61] == null) {
						field100[field404][var60][var61] = new WOVRPCGT();
					}

					field100[field404][var60][var61].method540(var64);
					method57(var60, var61);
				}
			} else if (arg1 == 188) {
				int var65 = arg0.method386();
				int var66 = (var65 >> 4 & 0x7) + field389;
				int var67 = (var65 & 0x7) + field390;
				int var68 = arg0.method388();
				int var69 = arg0.method388();
				int var70 = arg0.method388();
				if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
					WOVRPCGT var71 = field100[field404][var66][var67];
					if (var71 != null) {
						for (EOQVVIAH var72 = (EOQVVIAH) var71.method543(); var72 != null; var72 = (EOQVVIAH) var71.method545()) {
							if ((var68 & 0x7FFF) == var72.field574 && var72.field573 == var69) {
								var72.field573 = var70;
								break;
							}
						}

						method57(var66, var67);
					}
				}
			} else if (arg1 == 127) {
				int var73 = arg0.method407();
				int var74 = (var73 >> 4 & 0x7) + field389;
				int var75 = (var73 & 0x7) + field390;
				int var76 = arg0.method414();
				int var77 = arg0.method415();
				if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
					EOQVVIAH var78 = new EOQVVIAH();
					var78.field574 = var76;
					var78.field573 = var77;

					if (field100[field404][var74][var75] == null) {
						field100[field404][var74][var75] = new WOVRPCGT();
					}

					field100[field404][var74][var75].method540(var78);
					method57(var74, var75);
				}
			} else if (arg1 == 27) {
				int var79 = arg0.method406();
				int var80 = (var79 >> 4 & 0x7) + field389;
				int var81 = (var79 & 0x7) + field390;
				int var82 = arg0.method415();
				if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
					WOVRPCGT var83 = field100[field404][var80][var81];
					if (var83 != null) {
						for (EOQVVIAH var84 = (EOQVVIAH) var83.method543(); var84 != null; var84 = (EOQVVIAH) var83.method545()) {
							if ((var82 & 0x7FFF) == var84.field574) {
								var84.method14();
								break;
							}
						}

						if (var83.method543() == null) {
							field100[field404][var80][var81] = null;
						}

						method57(var80, var81);
					}
				}
			} else if (arg1 == 113) {
				int var85 = arg0.method406();
				int var86 = var85 >> 2;
				int var87 = var85 & 0x3;
				int var88 = field189[var86];
				int var89 = arg0.method386();
				int var90 = (var89 >> 4 & 0x7) + field389;
				int var91 = (var89 & 0x7) + field390;
				if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
					method79(var87, var91, var86, -1, var90, -1, 0, field404, var88);
				}
			} else if (arg1 == 128) {
				int var92 = arg0.method386();
				int var93 = (var92 >> 4 & 0x7) + field389;
				int var94 = (var92 & 0x7) + field390;
				int var95 = arg0.method388();
				int var96 = arg0.method386();
				int var97 = var96 >> 4 & 0xF;
				int var98 = var96 & 0x7;
				if (field218.field590[0] >= var93 - var97 && field218.field590[0] <= var93 + var97 && field218.field591[0] >= var94 - var97 && field218.field591[0] <= var94 + var97 && field460 && !field333 && field352 < 50) {
					field258[field352] = var95;
					field440[field352] = var98;
					field288[field352] = CQXSYOPM.field534[var95];
					field352++;
				}
			} else if (arg1 == 205) {
				int var99 = arg0.method406();
				int var100 = var99 >> 2;
				int var101 = var99 & 0x3;
				int var102 = field189[var100];
				int var103 = arg0.method414();
				int var104 = arg0.method405();
				int var105 = (var104 >> 4 & 0x7) + field389;
				int var106 = (var104 & 0x7) + field390;
				if (var105 >= 0 && var106 >= 0 && var105 < 103 && var106 < 103) {
					int var107 = field490[field404][var105][var106];
					int var108 = field490[field404][var105 + 1][var106];
					int var109 = field490[field404][var105 + 1][var106 + 1];
					int var110 = field490[field404][var105][var106 + 1];
					if (var102 == 0) {
						LBHOPBDL var111 = field184.method238(var105, var106, field404);
						if (var111 != null) {
							int var112 = var111.field981 >> 14 & 0x7FFF;
							if (var100 == 2) {
								var111.field979 = new YSSTKYXW(2, var108, var103, var101 + 4, var107, var109, var112, var110, false);
								var111.field980 = new YSSTKYXW(2, var108, var103, var101 + 1 & 0x3, var107, var109, var112, var110, false);
							} else {
								var111.field979 = new YSSTKYXW(var100, var108, var103, var101, var107, var109, var112, var110, false);
							}
						}
					}

					if (var102 == 1) {
						RYCVOQPY var113 = field184.method239(var106, field404, var105);
						if (var113 != null) {
							var113.field1245 = new YSSTKYXW(4, var108, var103, 0, var107, var109, var113.field1246 >> 14 & 0x7FFF, var110, false);
						}
					}

					if (var102 == 2) {
						FTDLOGFW var114 = field184.method240(field404, var105, var106);

						if (var100 == 11) {
							var100 = 10;
						}

						if (var114 != null) {
							var114.field691 = new YSSTKYXW(var100, var108, var103, var101, var107, var109, var114.field699 >> 14 & 0x7FFF, var110, false);
						}
					}

					if (var102 == 3) {
						MRIFDBSW var115 = field184.method241(field404, var106, var105);
						if (var115 != null) {
							var115.field1070 = new YSSTKYXW(22, var108, var103, var101, var107, var109, var115.field1071 >> 14 & 0x7FFF, var110, false);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method82() {
		if (field401 == 0) {
			int var1 = field35;
			if (field347 == 1 && field36 >= 516 && field37 >= 160 && field36 <= 765 && field37 <= 205) {
				var1 = 0;
			}

			if (field354) {
				if (var1 != 1) {
					int var2 = field29;
					int var3 = field30;
					if (field71 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field71 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field71 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field72 - 10 || var2 > field74 + field72 + 10 || var3 < field73 - 10 || var3 > field75 + field73 + 10) {
						field354 = false;

						if (field71 == 1) {
							field230 = true;
						}

						if (field71 == 2) {
							field303 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field72;
					int var5 = field73;
					int var6 = field74;
					int var7 = field36;
					int var8 = field37;
					if (field71 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field71 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field71 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field471; var10++) {
						int var11 = (field471 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method148(var9);
					}

					field354 = false;

					if (field71 == 1) {
						field230 = true;
					}

					if (field71 == 2) {
						field303 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field471 > 0) {
					int var12 = field221[field471 - 1];
					if (var12 == 627 || var12 == 734 || var12 == 304 || var12 == 974 || var12 == 380 || var12 == 524 || var12 == 239 || var12 == 518 || var12 == 459 || var12 == 257 || var12 == 108 || var12 == 1194) {
						int var13 = field219[field471 - 1];
						int var14 = field220[field471 - 1];
						IJOSTBQT var15 = IJOSTBQT.method276(var14);
						if (var15.field807 || var15.field801) {
							field246 = false;
							field159 = 0;
							field399 = var14;
							field400 = var13;
							field401 = 2;
							field402 = field36;
							field403 = field37;

							if (IJOSTBQT.method276(var14).field871 == field499) {
								field401 = 1;
							}

							if (IJOSTBQT.method276(var14).field871 == field305) {
								field401 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field210 == 1 || method144(field471 - 1)) && field471 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field471 > 0) {
					method148(field471 - 1);
				}

				if (var1 != 2 || field471 <= 0) {
					return;
				}

				method69();
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method83() {
		int var1 = 5;
		field376[8] = 0;
		int var2 = 0;
		while (field376[8] == 0) {
			String var3 = "Unknown problem";
			method13(20, "Connecting to web server");

			try {
				DataInputStream var4 = method155("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 368);
				MNKDCXXG var5 = new MNKDCXXG(new byte[40]);
				var4.readFully(var5.field1054, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field376[var6] = var5.method391();
				}

				int var7 = var5.method391();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field376[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field376[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field376[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field376[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field376[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field376[8] == 0) {
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

				field326 = !field326;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method84(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field445 = "";
				field446 = "Connecting to server...";
				method71(true);
			}

			field238 = new XFJQTFBV(method29(field331 + 43594), this);
			long var4 = UJXMBJLW.method491(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field411.field1055 = 0;
			field411.method376(14);
			field411.method376(var6);
			field238.method560(0, field411.field1054, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field238.method557();
			}

			int var8 = field238.method557();
			int var9 = var8;

			if (var8 == 0) {
				field238.method559(field407.field1054, 0, 8);
				field407.field1055 = 0;
				field457 = field407.method392();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field457 >> 32), (int) field457 };
				field411.field1055 = 0;
				field411.method376(10);
				field411.method380(var10[0]);
				field411.method380(var10[1]);
				field411.method380(var10[2]);
				field411.method380(var10[3]);
				field411.method380(signlink.uid);
				field411.method383(arg0);
				field411.method383(arg1);
				field411.method401(field133, field240);
				field203.field1055 = 0;

				if (arg2) {
					field203.method376(18);
				} else {
					field203.method376(16);
				}

				field203.method376(field411.field1055 + 36 + 1 + 1 + 2);
				field203.method376(255);
				field203.method377(368);
				field203.method376(field333 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field203.method380(field376[var11]);
				}

				field203.method384(0, field411.field1055, field411.field1054);
				field411.field1059 = new UVSYUCDF(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field131 = new UVSYUCDF(var10);
				field238.method560(0, field203.field1054, field203.field1055);
				var8 = field238.method557();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method84(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field115 = field238.method557();
				field366 = field238.method557() == 1;
				field295 = 0L;
				field304 = 0;
				field392.field1103 = 0;
				field26 = true;
				field322 = true;
				field351 = true;
				field411.field1055 = 0;
				field407.field1055 = 0;
				field298 = -1;
				field199 = -1;
				field200 = -1;
				field201 = -1;
				field297 = 0;
				field299 = 0;
				field197 = 0;
				field301 = 0;
				field106 = 0;
				field471 = 0;
				field354 = false;
				field27 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field129[var13] = null;
				}

				field282 = 0;
				field347 = 0;
				field280 = 0;
				field352 = 0;
				field94 = (int) (Math.random() * 100.0D) - 50;
				field414 = (int) (Math.random() * 110.0D) - 55;
				field451 = (int) (Math.random() * 80.0D) - 40;
				field170 = (int) (Math.random() * 120.0D) - 60;
				field394 = (int) (Math.random() * 30.0D) - 20;
				field454 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field477 = 0;
				field205 = -1;
				field383 = 0;
				field384 = 0;
				field251 = 0;
				field343 = 0;

				for (int var14 = 0; var14 < field248; var14++) {
					field250[var14] = null;
					field255[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field342[var15] = null;
				}

				field218 = field250[field249] = new CQCDOTXO();
				field382.method547();
				field398.method547();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field100[var16][var17][var18] = null;
						}
					}
				}

				field130 = new WOVRPCGT();
				field169 = 0;
				field168 = 0;
				method50(field441);
				field441 = -1;
				method50(field305);
				field305 = -1;
				method50(field499);
				field499 = -1;
				method50(field416);
				field416 = -1;
				method50(field290);
				field290 = -1;
				method50(field195);
				field195 = -1;
				method50(field196);
				field196 = -1;
				field466 = false;
				field232 = 3;
				field135 = 0;
				field354 = false;
				field489 = false;
				field186 = null;
				field85 = 0;
				field317 = -1;
				field111 = true;
				method49();

				for (int var19 = 0; var19 < 5; var19++) {
					field163[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field328[var20] = null;
					field329[var20] = false;
				}

				field413 = 0;
				field242 = 0;
				field396 = 0;
				field409 = 0;
				field223 = 0;
				field160 = 0;
				field212 = 0;
				field410 = 0;
				field153 = 0;
				method142();
			} else if (var8 == 3) {
				field445 = "";
				field446 = "Invalid username or password.";
			} else if (var8 == 4) {
				field445 = "Your account has been disabled.";
				field446 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field445 = "Your account is already logged in.";
				field446 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field445 = "RuneScape has been updated!";
				field446 = "Please reload this page.";
			} else if (var8 == 7) {
				field445 = "This world is full.";
				field446 = "Please use a different world.";
			} else if (var8 == 8) {
				field445 = "Unable to connect.";
				field446 = "Login server offline.";
			} else if (var8 == 9) {
				field445 = "Login limit exceeded.";
				field446 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field445 = "Unable to connect.";
				field446 = "Bad session id.";
			} else if (var8 == 12) {
				field445 = "You need a members account to login to this world.";
				field446 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field445 = "Could not complete login.";
				field446 = "Please try using a different world.";
			} else if (var8 == 14) {
				field445 = "The server is being updated.";
				field446 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field351 = true;
				field411.field1055 = 0;
				field407.field1055 = 0;
				field298 = -1;
				field199 = -1;
				field200 = -1;
				field201 = -1;
				field297 = 0;
				field299 = 0;
				field197 = 0;
				field471 = 0;
				field354 = false;
				field231 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field445 = "Login attempts exceeded.";
				field446 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field445 = "You are standing in a members-only area.";
				field446 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field445 = "Invalid loginserver requested";
				field446 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field238.method557();
				for (var21 += 3; var21 >= 0; var21--) {
					field445 = "You have only just left another world";
					field446 = "Your profile will be transferred in: " + var21;
					method71(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method84(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field445 = "Malformed login packet.";
				field446 = "Please try again.";
			} else if (var8 == 23) {
				field445 = "No reply from loginserver.";
				field446 = "Please try again.";
			} else if (var8 == 24) {
				field445 = "Error loading your profile.";
				field446 = "Please contact customer support.";
			} else if (var8 == 25) {
				field445 = "Unexpected loginserver response.";
				field446 = "Please try using a different world.";
			} else if (var8 == 26) {
				field445 = "This computers address has been blocked";
				field446 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field445 = "Unexpected server response";
				field446 = "Please try using a different world.";
			} else if (var9 != 0) {
				field445 = "No response from server";
				field446 = "Please try using a different world.";
			} else if (field68 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field68++;
				method84(arg0, arg1, arg2);
			} else {
				field445 = "No response from loginserver";
				field446 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field445 = "";
			field446 = "Error connecting to server.";
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(ILMNKDCXXG;Z)V")
	public final void method85(int arg0, MNKDCXXG arg1) {
		arg1.method396();
		int var3 = arg1.method397(1);
		if (var3 != 0) {
			int var4 = arg1.method397(2);
			if (var4 == 0) {
				field254[field253++] = field249;
			} else if (var4 == 1) {
				int var5 = arg1.method397(3);
				field218.method206(var5, false);
				int var6 = arg1.method397(1);
				if (var6 == 1) {
					field254[field253++] = field249;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method397(3);
				field218.method206(var7, true);
				int var8 = arg1.method397(3);
				field218.method206(var8, true);
				int var9 = arg1.method397(1);
				if (var9 == 1) {
					field254[field253++] = field249;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method397(7);
				int var11 = arg1.method397(7);
				int var12 = arg1.method397(1);
				int var13 = arg1.method397(1);
				if (var13 == 1) {
					field254[field253++] = field249;
				}

				field404 = arg1.method397(2);
				field218.method204(var11, var12 == 1, var10);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field184.method242(arg4, arg2, arg1);
		if (var6 != 0) {
			int var7 = field184.method246(arg4, arg2, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg0;
			}

			int[] var11 = field385.field1181;
			int var12 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			MIQWCPVG var14 = MIQWCPVG.method363(var13);
			if (var14.field1022 == -1) {
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
				BVXAXAEI var15 = field120[var14.field1022];
				if (var15 != null) {
					int var16 = (var14.field1017 * 4 - var15.field48) / 2;
					int var17 = (var14.field1019 * 4 - var15.field49) / 2;
					var15.method20((104 - arg1 - var14.field1019) * 4 + var17 + 48, arg2 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field184.method244(arg4, arg2, arg1);
		if (var18 != 0) {
			int var19 = field184.method246(arg4, arg2, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			MIQWCPVG var23 = MIQWCPVG.method363(var22);
			if (var23.field1022 != -1) {
				BVXAXAEI var24 = field120[var23.field1022];
				if (var24 != null) {
					int var25 = (var23.field1017 * 4 - var24.field48) / 2;
					int var26 = (var23.field1019 * 4 - var24.field49) / 2;
					var24.method20((104 - arg1 - var23.field1019) * 4 + var26 + 48, arg2 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field385.field1181;
				int var29 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = field184.method245(arg4, arg2, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			MIQWCPVG var32 = MIQWCPVG.method363(var31);
			if (var32.field1022 != -1) {
				BVXAXAEI var33 = field120[var32.field1022];
				if (var33 != null) {
					int var34 = (var32.field1017 * 4 - var33.field48) / 2;
					int var35 = (var32.field1019 * 4 - var33.field49) / 2;
					var33.method20((104 - arg1 - var32.field1019) * 4 + var35 + 48, arg2 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method87(int arg0) {
		int[] var2 = field385.field1181;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field405[arg0][var7][var5] & 0x18) == 0) {
					field184.method251(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field405[arg0 + 1][var7][var5] & 0x8) != 0) {
					field184.method251(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field385.method453();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field405[arg0][var11][var10] & 0x18) == 0) {
					method86(var9, var10, var11, var8, arg0);
				}

				if (arg0 < 3 && (field405[arg0 + 1][var11][var10] & 0x8) != 0) {
					method86(var9, var10, var11, var8, arg0 + 1);
				}
			}
		}

		if (field150 != null) {
			field150.method360();
			UNBQQGBL.field1270 = field166;
		}

		field277++;
		if (field277 > 78) {
			field277 = 0;
			field411.method375(54);
		}

		field368 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field184.method245(field404, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = MIQWCPVG.method363(var14).field1020;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field498[field404].field572;
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

						field77[field368] = field207[var15];
						field369[field368] = var16;
						field370[field368] = var17;
						field368++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method88() {
		for (VVKZWHMC var1 = (VVKZWHMC) field382.method543(); var1 != null; var1 = (VVKZWHMC) field382.method545()) {
			if (field404 != var1.field1360 || field476 > var1.field1367) {
				var1.method14();
			} else if (field476 >= var1.field1366) {
				if (var1.field1363 > 0) {
					YQBVAFEO var2 = field342[var1.field1363 - 1];
					if (var2 != null && var2.field615 >= 0 && var2.field615 < 13312 && var2.field616 >= 0 && var2.field616 < 13312) {
						var1.method538(var2.field616, var2.field615, field476, method153(var2.field616, var2.field615, var1.field1360) - var1.field1359);
					}
				}

				if (var1.field1363 < 0) {
					int var3 = -var1.field1363 - 1;
					CQCDOTXO var4;
					if (field315 == var3) {
						var4 = field218;
					} else {
						var4 = field250[var3];
					}

					if (var4 != null && var4.field615 >= 0 && var4.field615 < 13312 && var4.field616 >= 0 && var4.field616 < 13312) {
						var1.method538(var4.field616, var4.field615, field476, method153(var4.field616, var4.field615, var1.field1360) - var1.field1359);
					}
				}

				var1.method539(field276);
				field184.method227(60, var1.field1371, field404, false, (int) var1.field1377, var1, (int) var1.field1379, (int) var1.field1378, -1);
			}
		}

		field113++;
		if (field113 > 1651) {
			field113 = 0;
			field411.method375(53);
			field411.method376(0);
			int var5 = field411.field1055;
			field411.method376(23);
			field411.method376((int) (Math.random() * 256.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field411.method377(20573);
			}

			field411.method377((int) (Math.random() * 65536.0D));
			field411.method377(6686);
			field411.method376(82);

			if ((int) (Math.random() * 2.0D) == 0) {
				field411.method376(58);
			}

			field411.method377(26100);
			field411.method377(64639);
			field411.method376(230);
			field411.method385(field411.field1055 - var5);
		}
	}

	@ObfuscatedName("client.a(ZIZ)V")
	public final void method89(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(LPFWIJTDA;IIIZ)V")
	public final void method90(PFWIJTDA arg0, int arg1, int arg2, int arg3) {
		if (field471 < 400) {
			if (arg0.field1128 != null) {
				arg0 = arg0.method437();
			}

			if (arg0 != null && arg0.field1127) {
				String var5 = arg0.field1150;
				if (arg0.field1145 != 0) {
					var5 = var5 + method125(field218.field518, arg0.field1145) + " (level-" + arg0.field1145 + ")";
				}

				if (field282 == 1) {
					field64[field471] = "Use " + field286 + " with @yel@" + var5;
					field221[field471] = 540;
					field222[field471] = arg1;
					field219[field471] = arg2;
					field220[field471] = arg3;
					field471++;
				} else if (field347 != 1) {
					if (arg0.field1137 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field1137[var6] != null && !arg0.field1137[var6].equalsIgnoreCase("attack")) {
								field64[field471] = arg0.field1137[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field221[field471] = 642;
								}

								if (var6 == 1) {
									field221[field471] = 418;
								}

								if (var6 == 2) {
									field221[field471] = 848;
								}

								if (var6 == 3) {
									field221[field471] = 462;
								}

								if (var6 == 4) {
									field221[field471] = 148;
								}

								field222[field471] = arg1;
								field219[field471] = arg2;
								field220[field471] = arg3;
								field471++;
							}
						}
					}

					if (arg0.field1137 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field1137[var7] != null && arg0.field1137[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field1145 > field218.field518) {
									var8 = 2000;
								}

								field64[field471] = arg0.field1137[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field221[field471] = var8 + 642;
								}

								if (var7 == 1) {
									field221[field471] = var8 + 418;
								}

								if (var7 == 2) {
									field221[field471] = var8 + 848;
								}

								if (var7 == 3) {
									field221[field471] = var8 + 462;
								}

								if (var7 == 4) {
									field221[field471] = var8 + 148;
								}

								field222[field471] = arg1;
								field219[field471] = arg2;
								field220[field471] = arg3;
								field471++;
							}
						}
					}

					field64[field471] = "Examine @yel@" + var5;
					field221[field471] = 1657;
					field222[field471] = arg1;
					field219[field471] = arg2;
					field220[field471] = arg3;
					field471++;
				} else if ((field349 & 0x2) == 2) {
					field64[field471] = field350 + " @yel@" + var5;
					field221[field471] = 85;
					field222[field471] = arg1;
					field219[field471] = arg2;
					field220[field471] = arg3;
					field471++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILMNKDCXXG;)V")
	public final void method91(int arg0, MNKDCXXG arg1) {
		for (int var3 = 0; var3 < field253; var3++) {
			int var4 = field254[var3];
			YQBVAFEO var5 = field342[var4];
			int var6 = arg1.method386();
			if ((var6 & 0x80) != 0) {
				var5.field597 = arg1.method414();
				if (var5.field597 == 0xFFFF) {
					var5.field597 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.field619 = arg1.method414();
				int var7 = arg1.method391();
				var5.field623 = var7 >> 16;
				var5.field622 = (var7 & 0xFFFF) + field476;
				var5.field620 = 0;
				var5.field621 = 0;

				if (var5.field622 > field476) {
					var5.field620 = -1;
				}

				if (var5.field619 == 0xFFFF) {
					var5.field619 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				int var8 = arg1.method386();
				int var9 = arg1.method407();
				var5.method205(field476, var9, var8);
				var5.field612 = field476 + 300;
				var5.field613 = arg1.method405();
				var5.field614 = arg1.method406();
			}

			if ((var6 & 0x4) != 0) {
				var5.field1501 = PFWIJTDA.method442(arg1.method414());
				var5.field587 = var5.field1501.field1136;
				var5.field611 = var5.field1501.field1141;
				var5.field593 = var5.field1501.field1126;
				var5.field594 = var5.field1501.field1120;
				var5.field595 = var5.field1501.field1142;
				var5.field596 = var5.field1501.field1144;
				var5.field625 = var5.field1501.field1152;
			}

			if ((var6 & 0x40) != 0) {
				var5.field628 = arg1.method393();
				var5.field629 = 100;
			}

			if ((var6 & 0x8) != 0) {
				int var10 = arg1.method415();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg1.method407();
				if (var5.field602 == var10 && var10 != -1) {
					int var12 = QBINVEVU.field1165[var10].field1179;
					if (var12 == 1) {
						var5.field603 = 0;
						var5.field604 = 0;
						var5.field605 = var11;
						var5.field606 = 0;
					}

					if (var12 == 2) {
						var5.field606 = 0;
					}
				} else if (var10 == -1 || var5.field602 == -1 || QBINVEVU.field1165[var10].field1173 >= QBINVEVU.field1165[var5.field602].field1173) {
					var5.field602 = var10;
					var5.field603 = 0;
					var5.field604 = 0;
					var5.field605 = var11;
					var5.field606 = 0;
					var5.field601 = var5.field624;
				}
			}

			if ((var6 & 0x10) != 0) {
				int var13 = arg1.method406();
				int var14 = arg1.method405();
				var5.method205(field476, var14, var13);
				var5.field612 = field476 + 300;
				var5.field613 = arg1.method405();
				var5.field614 = arg1.method407();
			}

			if ((var6 & 0x20) != 0) {
				var5.field609 = arg1.method388();
				var5.field610 = arg1.method414();
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method92(int arg0) {
		IJOSTBQT var2 = IJOSTBQT.method276(arg0);
		for (int var3 = 0; var3 < var2.field843.length && var2.field843[var3] != -1; var3++) {
			IJOSTBQT var4 = IJOSTBQT.method276(var2.field843[var3]);
			if (var4.field855 == 1) {
				method92(var4.field842);
			}

			var4.field833 = 0;
			var4.field825 = 0;
		}
	}

	public final void run() {
		if (field367) {
			method109();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(LFHOAYGUJ;II)V")
	public final void method93(FHOAYGUJ arg0, int arg1) {
		method94(arg0.field615, arg1, arg0.field616);
	}

	@ObfuscatedName("client.a(IZII)V")
	public final void method94(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = method153(arg2, arg0, field404) - arg1;
			arg0 -= field423;
			var4 -= field424;
			arg2 -= field425;
			int var5 = IRLTEWJP.field941[field426];
			int var6 = IRLTEWJP.field942[field426];
			int var7 = IRLTEWJP.field941[field427];
			int var8 = IRLTEWJP.field942[field427];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field263 = (var9 << 9) / arg2 + UNBQQGBL.field1264;
				field264 = (var11 << 9) / arg2 + UNBQQGBL.field1265;
			} else {
				field263 = -1;
				field264 = -1;
			}
		} else {
			field263 = -1;
			field264 = -1;
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method95() {
		field138 = 0;
		for (int var1 = -1; var1 < field343 + field251; var1++) {
			FHOAYGUJ var2;
			if (var1 == -1) {
				var2 = field218;
			} else if (var1 < field251) {
				var2 = field250[field252[var1]];
			} else {
				var2 = field342[field344[var1 - field251]];
			}

			if (var2 != null && var2.method166()) {
				if (var2 instanceof YQBVAFEO) {
					PFWIJTDA var3 = ((YQBVAFEO) var2).field1501;
					if (var3.field1128 != null) {
						var3 = var3.method437();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field251) {
					PFWIJTDA var6 = ((YQBVAFEO) var2).field1501;
					if (var6.field1153 >= 0 && var6.field1153 < field124.length) {
						method93(var2, var2.field589 + 15);

						if (field263 > -1) {
							field124[var6.field1153].method458(field264 - 30, field263 - 12);
						}
					}

					if (field106 == 1 && field344[var1 - field251] == field66 && field476 % 20 < 10) {
						method93(var2, var2.field589 + 15);

						if (field263 > -1) {
							field306[0].method458(field264 - 28, field263 - 12);
						}
					}
				} else {
					int var4 = 30;
					CQCDOTXO var5 = (CQCDOTXO) var2;
					if (var5.field507 != -1 || var5.field508 != -1) {
						method93(var2, var2.field589 + 15);

						if (field263 > -1) {
							if (var5.field507 != -1) {
								field245[var5.field507].method458(field264 - var4, field263 - 12);
								var4 += 25;
							}

							if (var5.field508 != -1) {
								field124[var5.field508].method458(field264 - var4, field263 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field106 == 10 && field252[var1] == field107) {
						method93(var2, var2.field589 + 15);

						if (field263 > -1) {
							field306[1].method458(field264 - var4, field263 - 12);
						}
					}
				}

				if (var2.field628 != null && (var1 >= field251 || field157 == 0 || field157 == 3 || field157 == 1 && method30(((CQCDOTXO) var2).field527))) {
					method93(var2, var2.field589);

					if (field263 > -1 && field138 < field139) {
						field143[field138] = field480.method588(var2.field628) / 2;
						field142[field138] = field480.field1478;
						field140[field138] = field263;
						field141[field138] = field264;
						field144[field138] = var2.field576;
						field145[field138] = var2.field588;
						field146[field138] = var2.field629;
						field147[field138++] = var2.field628;

						if (field134 == 0 && var2.field588 >= 1 && var2.field588 <= 3) {
							field142[field138] += 10;
							field141[field138] += 5;
						}

						if (field134 == 0 && var2.field588 == 4) {
							field143[field138] = 60;
						}

						if (field134 == 0 && var2.field588 == 5) {
							field142[field138] += 5;
						}
					}
				}

				if (var2.field612 > field476) {
					method93(var2, var2.field589 + 15);

					if (field263 > -1) {
						int var7 = var2.field613 * 30 / var2.field614;
						if (var7 > 30) {
							var7 = 30;
						}

						UJSJLLWF.method484(0xFF00, field263 - 15, field264 - 3, 5, var7);
						UJSJLLWF.method484(0xFF0000, field263 + var7 - 15, field264 - 3, 5, 30 - var7);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field600[var8] > field476) {
						method93(var2, var2.field589 / 2);

						if (field263 > -1) {
							if (var8 == 1) {
								field264 -= 20;
							}

							if (var8 == 2) {
								field263 -= 15;
								field264 -= 10;
							}

							if (var8 == 3) {
								field263 += 15;
								field264 -= 10;
							}

							field211[var2.field599[var8]].method458(field264 - 12, field263 - 12);
							field478.method585(0, field264 + 4, field263, String.valueOf(var2.field598[var8]));
							field478.method585(0xFFFFFF, field264 + 3, field263 - 1, String.valueOf(var2.field598[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field138; var9++) {
			int var10 = field140[var9];
			int var11 = field141[var9];
			int var12 = field143[var9];
			int var13 = field142[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field141[var15] - field142[var15] && var11 - var13 < field141[var15] + 2 && var10 - var12 < field143[var15] + field140[var15] && var10 + var12 > field140[var15] - field143[var15] && field141[var15] - field142[var15] < var11) {
						var11 = field141[var15] - field142[var15];
						var14 = true;
					}
				}
			}

			field263 = field140[var9];
			field264 = field141[var9] = var11;
			String var16 = field147[var9];
			if (field134 == 0) {
				int var17 = 0xFFFF00;
				if (field144[var9] < 6) {
					var17 = field92[field144[var9]];
				}

				if (field144[var9] == 6) {
					var17 = field259 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field144[var9] == 7) {
					var17 = field259 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field144[var9] == 8) {
					var17 = field259 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field144[var9] == 9) {
					int var18 = 150 - field146[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field144[var9] == 10) {
					int var19 = 150 - field146[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field144[var9] == 11) {
					int var20 = 150 - field146[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field145[var9] == 0) {
					field480.method585(0, field264 + 1, field263, var16);
					field480.method585(var17, field264, field263, var16);
				}

				if (field145[var9] == 1) {
					field480.method590(field263, var16, 0, field259, field264 + 1);
					field480.method590(field263, var16, var17, field259, field264);
				}

				if (field145[var9] == 2) {
					field480.method591(field259, field263, 0, field264 + 1, var16);
					field480.method591(field259, field263, var17, field264, var16);
				}

				if (field145[var9] == 3) {
					field480.method592(0, 150 - field146[var9], field264 + 1, field263, field259, var16);
					field480.method592(var17, 150 - field146[var9], field264, field263, field259, var16);
				}

				if (field145[var9] == 4) {
					int var21 = field480.method588(var16);
					int var22 = (150 - field146[var9]) * (var21 + 100) / 150;
					UJSJLLWF.method481(field263 - 50, 0, field263 + 50, 334);
					field480.method589(0, var16, field263 + 50 - var22, field264 + 1);
					field480.method589(var17, var16, field263 + 50 - var22, field264);
					UJSJLLWF.method480();
				}

				if (field145[var9] == 5) {
					int var23 = 150 - field146[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					UJSJLLWF.method481(0, field264 - field480.field1478 - 1, 512, field264 + 5);
					field480.method585(0, field264 + var24 + 1, field263, var16);
					field480.method585(var17, field264 + var24, field263, var16);
					UJSJLLWF.method480();
				}
			} else {
				field480.method585(0, field264 + 1, field263, var16);
				field480.method585(0xFFFF00, field264, field263, var16);
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method96(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field292; var3++) {
				if (field458[var3] == arg0) {
					field292--;
					field230 = true;

					for (int var4 = var3; var4 < field292; var4++) {
						field458[var4] = field458[var4 + 1];
					}

					field411.method375(115);
					field411.method382(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method97() {
		field262 = 0;
		int var1 = (field218.field615 >> 7) + field309;
		int var2 = (field218.field616 >> 7) + field310;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field262 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field262 = 1;
		}

		if (field262 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field262 = 0;
		}
	}

	@ObfuscatedName("client.i(Z)I")
	public final int method98() {
		int var1 = 3;
		if (field426 < 310) {
			int var2 = field423 >> 7;
			int var3 = field425 >> 7;
			int var4 = field218.field615 >> 7;
			int var5 = field218.field616 >> 7;

			if ((field405[field404][var2][var3] & 0x4) != 0) {
				var1 = field404;
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

					if ((field405[field404][var2][var3] & 0x4) != 0) {
						var1 = field404;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field405[field404][var2][var3] & 0x4) != 0) {
							var1 = field404;
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

					if ((field405[field404][var2][var3] & 0x4) != 0) {
						var1 = field404;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field405[field404][var2][var3] & 0x4) != 0) {
							var1 = field404;
						}
					}
				}
			}
		}

		if ((field405[field404][field218.field615 >> 7][field218.field616 >> 7] & 0x4) != 0) {
			var1 = field404;
		}

		return var1;
	}

	@ObfuscatedName("client.t(I)I")
	public final int method99() {
		int var1 = method153(field425, field423, field404);
		if (var1 - field424 < 800 && (field405[field404][field423 >> 7][field425 >> 7] & 0x4) != 0) {
			return field404;
		}

		return 3;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method100() {
		if (field471 >= 2 || field282 != 0 || field347 != 0) {
			String var1;
			if (field282 == 1 && field471 < 2) {
				var1 = "Use " + field286 + " with...";
			} else if (field347 == 1 && field471 < 2) {
				var1 = field350 + "...";
			} else {
				var1 = field64[field471 - 1];
			}

			if (field471 > 2) {
				var1 = var1 + "@whi@ / " + (field471 - 2) + " more options";
			}

			field480.method594(true, 4, var1, 0xFFFFFF, field476 / 1000, 15);
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method10() {
		field325 = true;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;IIILjava/lang/String;)LNXFIIFAD;")
	public final NXFIIFAD method101(int arg0, String arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field412[0] != null) {
				var6 = field412[0].method548(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field501.reset();
			field501.update(var6);
			int var8 = (int) field501.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new NXFIIFAD(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method13(arg3, "Requesting " + arg1);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method155(arg4 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				MNKDCXXG var16 = new MNKDCXXG(var15);
				var16.field1055 = 3;
				int var17 = var16.method390() + 6;
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
						method13(arg3, "Loading " + arg1 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field412[0] != null) {
						field412[0].method549(var6, arg0, var6.length);
					}
				} catch (Exception var28) {
					field412[0] = null;
				}

				if (var6 != null) {
					field501.reset();
					field501.update(var6);
					int var23 = (int) field501.getValue();
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
						method13(arg3, "Game updated - please reload page");
						var25 = 10;
					} else {
						method13(arg3, var11 + " - Retrying in " + var25);
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

				field326 = !field326;
			}
		}

		return new NXFIIFAD(var6);
	}

	@ObfuscatedName("client.a(ILIJOSTBQT;)Z")
	public final boolean method102(IJOSTBQT arg0) {
		if (arg0.field815 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field815.length; var2++) {
			int var3 = method103(var2, arg0);
			int var4 = arg0.field808[var2];
			if (arg0.field815[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field815[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field815[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IILIJOSTBQT;)I")
	public final int method103(int arg0, IJOSTBQT arg1) {
		if (arg1.field823 == null || arg0 >= arg1.field823.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field823[arg0];
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
					var8 = field136[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field302[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field428[var3[var5++]];
				}

				if (var7 == 4) {
					IJOSTBQT var10 = IJOSTBQT.method276(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < RSPHUXRT.field1195 && (!RSPHUXRT.method475(var11).field1217 || field332)) {
						for (int var12 = 0; var12 < var10.field830.length; var12++) {
							if (var11 + 1 == var10.field830[var12]) {
								var8 += var10.field817[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field439[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field467[field302[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field439[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field218.field518;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < ZMUSIVCS.field1516; var13++) {
						if (ZMUSIVCS.field1518[var13]) {
							var8 += field302[var13];
						}
					}
				}

				if (var7 == 10) {
					IJOSTBQT var14 = IJOSTBQT.method276(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < RSPHUXRT.field1195 && (!RSPHUXRT.method475(var15).field1217 || field332)) {
						for (int var16 = 0; var16 < var14.field830.length; var16++) {
							if (var14.field830[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field187;
				}

				if (var7 == 12) {
					var8 = field241;
				}

				if (var7 == 13) {
					int var17 = field439[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					NPQMEWIH var20 = NPQMEWIH.field1074[var19];
					int var21 = var20.field1076;
					int var22 = var20.field1077;
					int var23 = var20.field1078;
					int var24 = field393[var23 - var22];
					var8 = field439[var21] >> var22 & var24;
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
					var8 = (field218.field615 >> 7) + field309;
				}

				if (var7 == 19) {
					var8 = (field218.field616 >> 7) + field310;
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

	@ObfuscatedName("client.u(I)V")
	public final void method104() {
		field148.method360();
		UNBQQGBL.field1270 = field165;
		field172.method20(0, 0);

		if (field195 != -1) {
			method105(0, IJOSTBQT.method276(field195), 0, 0);
		} else if (field239[field232] != -1) {
			method105(0, IJOSTBQT.method276(field239[field232]), 0, 0);
		}

		if (field354 && field71 == 1) {
			method60();
		}

		field148.method361(field21, 553, 205);
		field150.method360();
		UNBQQGBL.field1270 = field166;
	}

	@ObfuscatedName("client.a(ILIJOSTBQT;IBI)V")
	public final void method105(int arg0, IJOSTBQT arg1, int arg2, int arg3) {
		if (arg1.field855 == 0 && arg1.field843 != null && (!arg1.field846 || field503 == arg1.field842 || field122 == arg1.field842 || field444 == arg1.field842)) {
			int var5 = UJSJLLWF.field1253;
			int var6 = UJSJLLWF.field1251;
			int var7 = UJSJLLWF.field1254;
			int var8 = UJSJLLWF.field1252;
			UJSJLLWF.method481(arg0, arg3, arg1.field831 + arg0, arg1.field857 + arg3);
			int var9 = arg1.field843.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field810[var10] + arg0;
				int var12 = arg1.field802[var10] + arg3 - arg2;
				IJOSTBQT var13 = IJOSTBQT.method276(arg1.field843[var10]);
				var11 += var13.field848;
				var12 += var13.field872;

				if (var13.field849 > 0) {
					method158(var13);
				}

				if (var13.field855 == 0) {
					if (var13.field804 > var13.field835 - var13.field857) {
						var13.field804 = var13.field835 - var13.field857;
					}

					if (var13.field804 < 0) {
						var13.field804 = 0;
					}

					method105(var11, var13, var13.field804, var12);

					if (var13.field835 > var13.field857) {
						method80(var13.field835, var13.field831 + var11, var13.field857, var13.field804, var12);
					}
				} else if (var13.field855 != 1) {
					if (var13.field855 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field857; var15++) {
							for (int var16 = 0; var16 < var13.field831; var16++) {
								int var17 = (var13.field836 + 32) * var16 + var11;
								int var18 = (var13.field850 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field800[var14];
									var18 += var13.field853[var14];
								}

								if (var13.field830[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field830[var14] - 1;
									if (var17 > UJSJLLWF.field1253 - 32 && var17 < UJSJLLWF.field1254 && var18 > UJSJLLWF.field1251 - 32 && var18 < UJSJLLWF.field1252 || field401 != 0 && field400 == var14) {
										int var22 = 0;
										if (field282 == 1 && field283 == var14 && field284 == var13.field842) {
											var22 = 0xFFFFFF;
										}

										QEHNWGKD var23 = RSPHUXRT.method468(var22, var13.field817[var14], var21);
										if (var23 != null) {
											if (field401 != 0 && field400 == var14 && field399 == var13.field842) {
												var19 = field29 - field402;
												var20 = field30 - field403;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field159 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method460(128, var17 + var19, var18 + var20);

												if (var18 + var20 < UJSJLLWF.field1251 && arg1.field804 > 0) {
													int var24 = (UJSJLLWF.field1251 - var18 - var20) * field276 / 3;
													if (var24 > field276 * 10) {
														var24 = field276 * 10;
													}

													if (var24 > arg1.field804) {
														var24 = arg1.field804;
													}

													arg1.field804 -= var24;
													field403 += var24;
												}

												if (var18 + var20 + 32 > UJSJLLWF.field1252 && arg1.field804 < arg1.field835 - arg1.field857) {
													int var25 = (var18 + var20 + 32 - UJSJLLWF.field1252) * field276 / 3;
													if (var25 > field276 * 10) {
														var25 = field276 * 10;
													}

													if (var25 > arg1.field835 - arg1.field857 - arg1.field804) {
														var25 = arg1.field835 - arg1.field857 - arg1.field804;
													}

													arg1.field804 += var25;
													field403 -= var25;
												}
											} else if (field450 != 0 && field449 == var14 && field448 == var13.field842) {
												var23.method460(128, var17, var18);
											} else {
												var23.method458(var18, var17);
											}

											if (var23.field1186 == 33 || var13.field817[var14] != 1) {
												int var26 = var13.field817[var14];
												field478.method589(0, method56(var26), var17 + var19 + 1, var18 + 10 + var20);
												field478.method589(0xFFFF00, method56(var26), var17 + var19, var18 + 9 + var20);
											}
										}
									}
								} else if (var13.field863 != null && var14 < 20) {
									QEHNWGKD var27 = var13.field863[var14];
									if (var27 != null) {
										var27.method458(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field855 == 3) {
						boolean var28 = false;
						if (field444 == var13.field842 || field122 == var13.field842 || field503 == var13.field842) {
							var28 = true;
						}

						int var29;
						if (method102(var13)) {
							var29 = var13.field834;
							if (var28 && var13.field869 != 0) {
								var29 = var13.field869;
							}
						} else {
							var29 = var13.field860;
							if (var28 && var13.field829 != 0) {
								var29 = var13.field829;
							}
						}

						if (var13.field803 == 0) {
							if (var13.field809) {
								UJSJLLWF.method484(var29, var11, var12, var13.field857, var13.field831);
							} else {
								UJSJLLWF.method485(var12, var13.field831, var11, var29, var13.field857);
							}
						} else if (var13.field809) {
							UJSJLLWF.method483(var13.field857, var12, var11, 256 - (var13.field803 & 0xFF), var29, var13.field831);
						} else {
							UJSJLLWF.method486(var29, var11, 256 - (var13.field803 & 0xFF), var12, var13.field857, var13.field831);
						}
					} else if (var13.field855 == 4) {
						XZMPLIVN var30 = var13.field868;
						String var31 = var13.field847;
						boolean var32 = false;
						if (field444 == var13.field842 || field122 == var13.field842 || field503 == var13.field842) {
							var32 = true;
						}

						int var33;
						if (method102(var13)) {
							var33 = var13.field834;
							if (var32 && var13.field869 != 0) {
								var33 = var13.field869;
							}

							if (var13.field818.length() > 0) {
								var31 = var13.field818;
							}
						} else {
							var33 = var13.field860;
							if (var32 && var13.field829 != 0) {
								var33 = var13.field829;
							}
						}

						if (var13.field867 == 6 && field466) {
							var31 = "Please wait...";
							var33 = var13.field860;
						}

						if (UJSJLLWF.field1249 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1478 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method64(method103(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method64(method103(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method64(method103(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method64(method103(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method64(method103(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field862) {
								var30.method586(var33, var13.field839, var34, var13.field831 / 2 + var11, var41);
							} else {
								var30.method593(var33, var11, var13.field839, var34, var41);
							}

							var34 += var30.field1478;
						}
					} else if (var13.field855 == 5) {
						QEHNWGKD var42;
						if (method102(var13)) {
							var42 = var13.field811;
						} else {
							var42 = var13.field826;
						}

						if (var42 != null) {
							var42.method458(var12, var11);
						}
					} else if (var13.field855 == 6) {
						int var43 = UNBQQGBL.field1264;
						int var44 = UNBQQGBL.field1265;
						UNBQQGBL.field1264 = var13.field831 / 2 + var11;
						UNBQQGBL.field1265 = var13.field857 / 2 + var12;
						int var45 = UNBQQGBL.field1268[var13.field813] * var13.field812 >> 16;
						int var46 = UNBQQGBL.field1269[var13.field813] * var13.field812 >> 16;
						boolean var47 = method102(var13);
						int var48;
						if (var47) {
							var48 = var13.field838;
						} else {
							var48 = var13.field837;
						}

						IRLTEWJP var49;
						if (var48 == -1) {
							var49 = var13.method268(var47, -1, -1);
						} else {
							QBINVEVU var50 = QBINVEVU.field1165[var48];
							var49 = var13.method268(var47, var50.field1168[var13.field833], var50.field1167[var13.field833]);
						}

						if (var49 != null) {
							var49.method302(0, var13.field814, 0, var13.field813, 0, var45, var46);
						}

						UNBQQGBL.field1264 = var43;
						UNBQQGBL.field1265 = var44;
					} else {
						if (var13.field855 == 7) {
							XZMPLIVN var51 = var13.field868;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field857; var53++) {
								for (int var54 = 0; var54 < var13.field831; var54++) {
									if (var13.field830[var52] > 0) {
										RSPHUXRT var55 = RSPHUXRT.method475(var13.field830[var52] - 1);
										String var56 = String.valueOf(var55.field1229);
										if (var55.field1223 || var13.field817[var52] != 1) {
											var56 = var56 + " x" + method134(var13.field817[var52]);
										}

										int var57 = (var13.field836 + 115) * var54 + var11;
										int var58 = (var13.field850 + 12) * var53 + var12;
										if (var13.field862) {
											var51.method586(var13.field860, var13.field839, var58, var13.field831 / 2 + var57, var56);
										} else {
											var51.method593(var13.field860, var57, var13.field839, var58, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field855 == 8 && (field296 == var13.field842 || field375 == var13.field842 || field96 == var13.field842) && field227 == 100) {
							int var59 = 0;
							int var60 = 0;
							XZMPLIVN var61 = field479;
							String var62 = var13.field847;
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

								int var65 = var61.method587(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1478 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field831 + var11 - var59 - 5;
							int var67 = var13.field857 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field831 + arg0) {
								var66 = arg1.field831 + arg0 - var59;
							}

							if (var60 + var67 > arg1.field857 + arg3) {
								var67 = arg1.field857 + arg3 - var60;
							}

							UJSJLLWF.method484(0xFFFFA0, var66, var67, var60, var59);
							UJSJLLWF.method485(var67, var59, var66, 0, var60);
							String var68 = var13.field847;
							int var69 = var61.field1478 + var67 + 2;
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

								var61.method593(0, var66 + 3, false, var69, var71);
								var69 += var61.field1478 + 1;
							}
						}
					}
				}
			}

			UJSJLLWF.method481(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("client.a(ILMNKDCXXG;B)V")
	public final void method106(int arg0, MNKDCXXG arg1) {
		field468 = 0;
		field253 = 0;
		method85(arg0, arg1);
		method34(arg0, arg1);
		method133(arg0, arg1);
		method35(arg1, arg0);

		for (int var3 = 0; var3 < field468; var3++) {
			int var4 = field469[var3];
			if (field476 != field250[var4].field608) {
				field250[var4] = null;
			}
		}

		if (arg1.field1055 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1055 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field251; var5++) {
			if (field250[field252[var5]] == null) {
				signlink.reporterror(field228 + " null entry in pl list - pos:" + var5 + " size:" + field251);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(LQEHNWGKD;III)V")
	public final void method107(QEHNWGKD arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field454 + field170 & 0x7FF;
			int var6 = IRLTEWJP.field941[var5];
			int var7 = IRLTEWJP.field942[var5];
			var6 = var6 * 256 / (field394 + 256);
			var7 = var7 * 256 / (field394 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field202.method463(83 - var13 - 20, 20, 256, var12 + 94 + 4 - 10, 15, 20, var10, 15);
		} else {
			method151(arg2, arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg6 >= 1 && arg1 <= 102 && arg6 <= 102) {
			if (field333 && field404 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field184.method242(arg2, arg1, arg6);
			}

			if (arg0 == 1) {
				var8 = field184.method243(arg1, arg6, arg2);
			}

			if (arg0 == 2) {
				var8 = field184.method244(arg2, arg1, arg6);
			}

			if (arg0 == 3) {
				var8 = field184.method245(arg2, arg1, arg6);
			}

			if (var8 != 0) {
				int var12 = field184.method246(arg2, arg1, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field184.method233(arg2, arg6, arg1);
					MIQWCPVG var16 = MIQWCPVG.method363(var13);
					if (var16.field1042) {
						field498[arg2].method196(arg1, var14, var15, arg6, var16.field1007);
					}
				}

				if (arg0 == 1) {
					field184.method234(arg6, arg1, arg2);
				}

				if (arg0 == 2) {
					field184.method235(arg2, arg1, arg6);
					MIQWCPVG var17 = MIQWCPVG.method363(var13);
					if (var17.field1017 + arg1 > 103 || var17.field1017 + arg6 > 103 || var17.field1019 + arg1 > 103 || var17.field1019 + arg6 > 103) {
						return;
					}

					if (var17.field1042) {
						field498[arg2].method197(arg1, var15, var17.field1017, arg6, var17.field1019, var17.field1007);
					}
				}

				if (arg0 == 3) {
					field184.method236(arg1, arg2, arg6);
					MIQWCPVG var18 = MIQWCPVG.method363(var13);
					if (var18.field1042 && var18.field1015) {
						field498[arg2].method199(arg6, arg1);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field405[1][arg1][arg6] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				XTTZZRNP.method568(arg1, var19, arg2, arg3, arg4, arg5, field498[arg2], field184, field490, arg6);
				return;
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.v(I)V")
	public final void method109() {
		field78 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field372) {
				field261++;
				method132();
				method132();
				method63();
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

		field78 = false;
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)V")
	public final void method110(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field485 = 0;
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

			field485 = 0;
			label46: for (int var7 = 0; var7 < RSPHUXRT.field1195; var7++) {
				RSPHUXRT var8 = RSPHUXRT.method475(var7);
				if (var8.field1201 == -1 && var8.field1229 != null) {
					String var9 = var8.field1229.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field486[field485] = var9;
					field487[field485] = var7;
					field485++;
					if (field485 >= field486.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method111() {
		byte[] var1 = field465.method431("title.dat", null);
		QEHNWGKD var2 = new QEHNWGKD(var1, this);
		field268.method360();
		var2.method456(0, 0);
		field269.method360();
		var2.method456(-637, 0);
		field265.method360();
		var2.method456(-128, 0);
		field266.method360();
		var2.method456(-202, -371);
		field267.method360();
		var2.method456(-202, -171);
		field270.method360();
		var2.method456(0, -265);
		field271.method360();
		var2.method456(-562, -265);
		field272.method360();
		var2.method456(-128, -171);
		field273.method360();
		var2.method456(-562, -171);
		int[] var3 = new int[var2.field1182];
		for (int var4 = 0; var4 < var2.field1183; var4++) {
			for (int var5 = 0; var5 < var2.field1182; var5++) {
				var3[var5] = var2.field1181[var2.field1182 * var4 + var2.field1182 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1182; var6++) {
				var2.field1181[var2.field1182 * var4 + var6] = var3[var6];
			}
		}

		field268.method360();
		var2.method456(382, 0);
		field269.method360();
		var2.method456(-255, 0);
		field265.method360();
		var2.method456(254, 0);
		field266.method360();
		var2.method456(180, -371);
		field267.method360();
		var2.method456(180, -171);
		field270.method360();
		var2.method456(382, -265);
		field271.method360();
		var2.method456(-180, -265);
		field272.method360();
		var2.method456(254, -171);
		field273.method360();
		var2.method456(-180, -171);
		QEHNWGKD var7 = new QEHNWGKD(field465, "logo", 0);
		field265.method360();
		var7.method458(18, 382 - var7.field1182 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IIIIIIIIIIIZ)Z")
	public final boolean method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field327[var14][var15] = 0;
				field224[var14][var15] = 99999999;
			}
		}

		int var16 = arg1;
		int var17 = arg3;
		field327[arg1][arg3] = 99;
		field224[arg1][arg3] = 0;
		byte var18 = 0;
		int var19 = 0;
		field494[var18] = arg1;
		int var39 = var18 + 1;
		field495[var18] = arg3;
		boolean var20 = false;
		int var21 = field494.length;
		int[][] var22 = field498[field404].field572;
		while (var39 != var19) {
			var16 = field494[var19];
			var17 = field495[var19];
			var19 = (var19 + 1) % var21;

			if (arg4 == var16 && arg7 == var17) {
				var20 = true;
				break;
			}

			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && field498[field404].method200(arg9 - 1, arg5, var16, arg7, var17, arg4)) {
					var20 = true;
					break;
				}

				if (arg9 < 10 && field498[field404].method201(arg7, arg9 - 1, arg5, arg4, var16, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg0 != 0 && arg2 != 0 && field498[field404].method202(arg2, var17, var16, arg4, arg0, arg7, arg8)) {
				var20 = true;
				break;
			}

			int var23 = field224[var16][var17] + 1;
			if (var16 > 0 && field327[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field494[var39] = var16 - 1;
				field495[var39] = var17;
				var39 = (var39 + 1) % var21;
				field327[var16 - 1][var17] = 2;
				field224[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field327[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field494[var39] = var16 + 1;
				field495[var39] = var17;
				var39 = (var39 + 1) % var21;
				field327[var16 + 1][var17] = 8;
				field224[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field327[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field494[var39] = var16;
				field495[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field327[var16][var17 - 1] = 1;
				field224[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field327[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field494[var39] = var16;
				field495[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field327[var16][var17 + 1] = 4;
				field224[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field327[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field494[var39] = var16 - 1;
				field495[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field327[var16 - 1][var17 - 1] = 3;
				field224[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field327[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field494[var39] = var16 + 1;
				field495[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field327[var16 + 1][var17 - 1] = 9;
				field224[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field327[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field494[var39] = var16 - 1;
				field495[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field327[var16 - 1][var17 + 1] = 6;
				field224[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field327[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field494[var39] = var16 + 1;
				field495[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field327[var16 + 1][var17 + 1] = 12;
				field224[var16 + 1][var17 + 1] = var23;
			}
		}

		field334 = 0;
		if (!var20) {
			if (!arg10) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg4 - var26; var27 <= arg4 + var26; var27++) {
				for (int var28 = arg7 - var26; var28 <= arg7 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field224[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg4) {
							var29 = arg4 - var27;
						} else if (var27 > arg0 + arg4 - 1) {
							var29 = var27 + 1 - arg0 - arg4;
						}

						int var30 = 0;
						if (var28 < arg7) {
							var30 = arg7 - var28;
						} else if (var28 > arg2 + arg7 - 1) {
							var30 = var28 + 1 - arg2 - arg7;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field224[var27][var28] < var25) {
							var24 = var31;
							var25 = field224[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg1 == var16 && arg3 == var17) {
				return false;
			}

			field334 = 1;
		}

		byte var32 = 0;
		field494[var32] = var16;
		int var40 = var32 + 1;
		field495[var32] = var17;
		int var33;
		int var34 = var33 = field327[var16][var17];
		while (arg1 != var16 || arg3 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field494[var40] = var16;
				field495[var40++] = var17;
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

			var34 = field327[var16][var17];
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
		int var36 = field494[var40];
		int var37 = field495[var40];

		if (arg6 == 0) {
			field411.method375(100);
			field411.method376(var35 + var35 + 3);
		}

		if (arg6 == 1) {
			field411.method375(158);
			field411.method376(var35 + var35 + 3 + 14);
		}

		if (arg6 == 2) {
			field411.method375(55);
			field411.method376(var35 + var35 + 3);
		}

		field411.method410(field310 + var37);
		field411.method377(field309 + var36);
		field383 = field494[0];
		field384 = field495[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field411.method403(field494[var40] - var36);
			field411.method404(field495[var40] - var37);
		}

		field411.method403(field39[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(IBLMNKDCXXG;)V")
	public final void method113(int arg0, MNKDCXXG arg1) {
		arg1.method396();
		int var3 = arg1.method397(8);
		if (var3 < field343) {
			for (int var4 = var3; var4 < field343; var4++) {
				field469[field468++] = field344[var4];
			}
		}

		if (var3 > field343) {
			signlink.reporterror(field228 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field343 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field344[var5];
			YQBVAFEO var7 = field342[var6];
			int var8 = arg1.method397(1);
			if (var8 == 0) {
				field344[field343++] = var6;
				var7.field608 = field476;
			} else {
				int var9 = arg1.method397(2);
				if (var9 == 0) {
					field344[field343++] = var6;
					var7.field608 = field476;
					field254[field253++] = var6;
				} else if (var9 == 1) {
					field344[field343++] = var6;
					var7.field608 = field476;
					int var10 = arg1.method397(3);
					var7.method206(var10, false);
					int var11 = arg1.method397(1);
					if (var11 == 1) {
						field254[field253++] = var6;
					}
				} else if (var9 == 2) {
					field344[field343++] = var6;
					var7.field608 = field476;
					int var12 = arg1.method397(3);
					var7.method206(var12, true);
					int var13 = arg1.method397(3);
					var7.method206(var13, true);
					int var14 = arg1.method397(1);
					if (var14 == 1) {
						field254[field253++] = var6;
					}
				} else if (var9 == 3) {
					field469[field468++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)Z")
	public final boolean method114() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method115() {
		field372 = false;
		while (field78) {
			field372 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field213 = null;
		field214 = null;
		field260 = null;
		field116 = null;
		field117 = null;
		field118 = null;
		field119 = null;
		field97 = null;
		field98 = null;
		field318 = null;
		field319 = null;
		field434 = null;
		field435 = null;
	}

	@ObfuscatedName("client.x(I)V")
	public final void method116() {
		try {
			int var1 = field218.field615 + field94;
			int var2 = field218.field616 + field414;
			if (field86 - var1 < -500 || field86 - var1 > 500 || field87 - var2 < -500 || field87 - var2 > 500) {
				field86 = var1;
				field87 = var2;
			}

			if (field86 != var1) {
				field86 += (var1 - field86) / 16;
			}

			if (field87 != var2) {
				field87 += (var2 - field87) / 16;
			}

			if (field39[1] == 1) {
				field455 += (-field455 - 24) / 2;
			} else if (field39[2] == 1) {
				field455 += (24 - field455) / 2;
			} else {
				field455 /= 2;
			}

			if (field39[3] == 1) {
				field456 += (12 - field456) / 2;
			} else if (field39[4] == 1) {
				field456 += (-field456 - 12) / 2;
			} else {
				field456 /= 2;
			}

			field454 = field455 / 2 + field454 & 0x7FF;
			field453 += field456 / 2;
			if (field453 < 128) {
				field453 = 128;
			}

			if (field453 > 383) {
				field453 = 383;
			}

			int var3 = field86 >> 7;
			int var4 = field87 >> 7;
			int var5 = method153(field87, field86, field404);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field404;
						if (var9 < 3 && (field405[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field490[var9][var7][var8];
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

			if (var11 > field275) {
				field275 += (var11 - field275) / 24;
			} else if (var11 < field275) {
				field275 += (var11 - field275) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field218.field615 + "," + field218.field616 + "," + field86 + "," + field87 + "," + field504 + "," + field505 + "," + field309 + "," + field310);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IIIIILIJOSTBQT;III)V")
	public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, IJOSTBQT arg5, int arg6, int arg7) {
		if (field125) {
			field126 = 32;
		} else {
			field126 = 0;
		}

		field125 = false;
		if (arg6 >= arg7 && arg6 < arg7 + 16 && arg1 >= arg4 && arg1 < arg4 + 16) {
			arg5.field804 -= field161 * 4;

			if (arg3 == 1) {
				field230 = true;
			}

			if (arg3 == 2 || arg3 == 3) {
				field303 = true;
			}
		} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg1 >= arg2 + arg4 - 16 && arg1 < arg2 + arg4) {
			arg5.field804 += field161 * 4;

			if (arg3 == 1) {
				field230 = true;
			}

			if (arg3 == 2 || arg3 == 3) {
				field303 = true;
			}
		} else if (arg6 >= arg7 - field126 && arg6 < arg7 + field126 + 16 && arg1 >= arg4 + 16 && arg1 < arg2 + arg4 - 16 && field161 > 0) {
			int var9 = (arg2 - 32) * arg2 / arg0;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg4 - var9 / 2 - 16;
			int var11 = arg2 - var9 - 32;
			arg5.field804 = (arg0 - arg2) * var10 / var11;

			if (arg3 == 1) {
				field230 = true;
			}

			if (arg3 == 2 || arg3 == 3) {
				field303 = true;
			}

			field125 = true;
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method118() {
		try {
			if (field238 != null) {
				field238.method556();
			}
		} catch (Exception var2) {
		}

		field238 = null;
		field351 = false;
		field91 = 0;
		field228 = "";
		field229 = "";
		method72();
		field184.method216();

		for (int var1 = 0; var1 < 4; var1++) {
			field498[var1].method191();
		}

		System.gc();
		method141();
		field278 = -1;
		field462 = -1;
		field474 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BLjava/lang/String;)V")
	public final void method119(String arg0, String arg1) {
		if (field150 != null) {
			field150.method360();
			UNBQQGBL.field1270 = field166;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field479.method585(0, var3, 257, arg1);
			field479.method585(0xFFFFFF, var3 - 1, 256, arg1);
			var3 += 15;
			if (arg0 != null) {
				field479.method585(0, var3, 257, arg0);
				field479.method585(0xFFFFFF, var3 - 1, 256, arg0);
			}

			field150.method361(field21, 4, 4);
		} else if (field22 != null) {
			field22.method360();
			UNBQQGBL.field1270 = field167;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			UJSJLLWF.method484(0, 383 - var5 / 2, var4 - 5 - var6 / 2, var6, var5);
			UJSJLLWF.method485(var4 - var6 / 2 - 5, var5, 383 - var5 / 2, 0xFFFFFF, var6);

			if (arg0 != null) {
				var4 -= 7;
			}

			field479.method585(0, var4, 383, arg1);
			field479.method585(0xFFFFFF, var4 - 1, 382, arg1);
			var4 += 15;
			if (arg0 != null) {
				field479.method585(0, var4, 383, arg0);
				field479.method585(0xFFFFFF, var4 - 1, 382, arg0);
			}

			field22.method361(field21, 0, 0);
		}
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

	@ObfuscatedName("client.a(IIII)I")
	public final int method120(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;I)V")
	public final void method121(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field441 != -1) {
			field186 = arg0;
			field35 = 0;
		}

		if (field305 == -1) {
			field303 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field127[var4] = field127[var4 - 1];
			field128[var4] = field128[var4 - 1];
			field129[var4] = field129[var4 - 1];
		}

		field127[0] = arg1;
		field128[0] = arg2;
		field129[0] = arg0;
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method122(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.b(I)V")
	public final void method7() {
		if (!field81 && !field473 && !field208) {
			field476++;

			if (field351) {
				method162();
			} else {
				method32();
			}

			method160();
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method123(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(ZIILCQCDOTXO;I)V")
	public final void method124(int arg0, int arg1, CQCDOTXO arg2, int arg3) {
		if (field218 != arg2 && field471 < 400) {
			String var5;
			if (arg2.field526 == 0) {
				var5 = arg2.field527 + method125(field218.field518, arg2.field518) + " (level-" + arg2.field518 + ")";
			} else {
				var5 = arg2.field527 + " (skill-" + arg2.field526 + ")";
			}

			if (field282 == 1) {
				field64[field471] = "Use " + field286 + " with @whi@" + var5;
				field221[field471] = 783;
				field222[field471] = arg0;
				field219[field471] = arg1;
				field220[field471] = arg3;
				field471++;
			} else if (field347 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field328[var6] != null) {
						field64[field471] = field328[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field328[var6].equalsIgnoreCase("attack")) {
							if (arg2.field518 > field218.field518) {
								var7 = 2000;
							}

							if (field218.field513 != 0 && arg2.field513 != 0) {
								if (field218.field513 == arg2.field513) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field329[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field221[field471] = var7 + 197;
						}

						if (var6 == 1) {
							field221[field471] = var7 + 2;
						}

						if (var6 == 2) {
							field221[field471] = var7 + 309;
						}

						if (var6 == 3) {
							field221[field471] = var7 + 471;
						}

						if (var6 == 4) {
							field221[field471] = var7 + 217;
						}

						field222[field471] = arg0;
						field219[field471] = arg1;
						field220[field471] = arg3;
						field471++;
					}
				}
			} else if ((field349 & 0x8) == 8) {
				field64[field471] = field350 + " @whi@" + var5;
				field221[field471] = 359;
				field222[field471] = arg0;
				field219[field471] = arg1;
				field220[field471] = arg3;
				field471++;
			}

			for (int var8 = 0; var8 < field471; var8++) {
				if (field221[var8] == 957) {
					field64[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	public final void init() {
		field330 = Integer.parseInt(getParameter("nodeid"));
		field331 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method164();
		} else {
			method156();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field332 = false;
		} else {
			field332 = true;
		}

		method2(765, 503);
	}

	@ObfuscatedName("client.b(IZI)Ljava/lang/String;")
	public static final String method125(int arg0, int arg1) {
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

	@ObfuscatedName("client.y(I)V")
	public final void method126() {
		if (field282 == 0 && field347 == 0) {
			field64[field471] = "Walk here";
			field221[field471] = 957;
			field219[field471] = field29;
			field220[field471] = field30;
			field471++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < IRLTEWJP.field939; var2++) {
			int var3 = IRLTEWJP.field940[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field184.method246(field404, var4, var5, var3) >= 0) {
					MIQWCPVG var8 = MIQWCPVG.method363(var7);
					if (var8.field1008 != null) {
						var8 = var8.method368();
					}

					if (var8 == null) {
						continue;
					}

					if (field282 == 1) {
						field64[field471] = "Use " + field286 + " with @cya@" + var8.field1024;
						field221[field471] = 230;
						field222[field471] = var3;
						field219[field471] = var4;
						field220[field471] = var5;
						field471++;
					} else if (field347 != 1) {
						if (var8.field1053 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1053[var9] != null) {
									field64[field471] = var8.field1053[var9] + " @cya@" + var8.field1024;

									if (var9 == 0) {
										field221[field471] = 641;
									}

									if (var9 == 1) {
										field221[field471] = 204;
									}

									if (var9 == 2) {
										field221[field471] = 181;
									}

									if (var9 == 3) {
										field221[field471] = 929;
									}

									if (var9 == 4) {
										field221[field471] = 1129;
									}

									field222[field471] = var3;
									field219[field471] = var4;
									field220[field471] = var5;
									field471++;
								}
							}
						}

						field64[field471] = "Examine @cya@" + var8.field1024;
						field221[field471] = 1927;
						field222[field471] = var8.field1040 << 14;
						field219[field471] = var4;
						field220[field471] = var5;
						field471++;
					} else if ((field349 & 0x4) == 4) {
						field64[field471] = field350 + " @cya@" + var8.field1024;
						field221[field471] = 370;
						field222[field471] = var3;
						field219[field471] = var4;
						field220[field471] = var5;
						field471++;
					}
				}

				if (var6 == 1) {
					YQBVAFEO var10 = field342[var7];
					if (var10.field1501.field1136 == 1 && (var10.field615 & 0x7F) == 0x40 && (var10.field616 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field343; var11++) {
							YQBVAFEO var12 = field342[field344[var11]];
							if (var12 != null && var10 != var12 && var12.field1501.field1136 == 1 && var10.field615 == var12.field615 && var10.field616 == var12.field616) {
								method90(var12.field1501, field344[var11], var4, var5);
							}
						}

						for (int var13 = 0; var13 < field251; var13++) {
							CQCDOTXO var14 = field250[field252[var13]];
							if (var14 != null && var10.field615 == var14.field615 && var10.field616 == var14.field616) {
								method124(field252[var13], var4, var14, var5);
							}
						}
					}

					method90(var10.field1501, var7, var4, var5);
				}

				if (var6 == 0) {
					CQCDOTXO var15 = field250[var7];
					if ((var15.field615 & 0x7F) == 0x40 && (var15.field616 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field343; var16++) {
							YQBVAFEO var17 = field342[field344[var16]];
							if (var17 != null && var17.field1501.field1136 == 1 && var15.field615 == var17.field615 && var15.field616 == var17.field616) {
								method90(var17.field1501, field344[var16], var4, var5);
							}
						}

						for (int var18 = 0; var18 < field251; var18++) {
							CQCDOTXO var19 = field250[field252[var18]];
							if (var19 != null && var15 != var19 && var15.field615 == var19.field615 && var15.field616 == var19.field616) {
								method124(field252[var18], var4, var19, var5);
							}
						}
					}

					method124(var7, var4, var15, var5);
				}

				if (var6 == 3) {
					WOVRPCGT var20 = field100[field404][var4][var5];
					if (var20 != null) {
						for (EOQVVIAH var21 = (EOQVVIAH) var20.method544(); var21 != null; var21 = (EOQVVIAH) var20.method546()) {
							RSPHUXRT var22 = RSPHUXRT.method475(var21.field574);
							if (field282 == 1) {
								field64[field471] = "Use " + field286 + " with @lre@" + var22.field1229;
								field221[field471] = 271;
								field222[field471] = var21.field574;
								field219[field471] = var4;
								field220[field471] = var5;
								field471++;
							} else if (field347 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1215 != null && var22.field1215[var23] != null) {
										field64[field471] = var22.field1215[var23] + " @lre@" + var22.field1229;

										if (var23 == 0) {
											field221[field471] = 42;
										}

										if (var23 == 1) {
											field221[field471] = 895;
										}

										if (var23 == 2) {
											field221[field471] = 852;
										}

										if (var23 == 3) {
											field221[field471] = 172;
										}

										if (var23 == 4) {
											field221[field471] = 493;
										}

										field222[field471] = var21.field574;
										field219[field471] = var4;
										field220[field471] = var5;
										field471++;
									} else if (var23 == 2) {
										field64[field471] = "Take @lre@" + var22.field1229;
										field221[field471] = 852;
										field222[field471] = var21.field574;
										field219[field471] = var4;
										field220[field471] = var5;
										field471++;
									}
								}

								field64[field471] = "Examine @lre@" + var22.field1229;
								field221[field471] = 1253;
								field222[field471] = var21.field574;
								field219[field471] = var4;
								field220[field471] = var5;
								field471++;
							} else if ((field349 & 0x1) == 1) {
								field64[field471] = field350 + " @lre@" + var22.field1229;
								field221[field471] = 602;
								field222[field471] = var21.field574;
								field219[field471] = var4;
								field220[field471] = var5;
								field471++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)Ljava/lang/String;")
	public final String method127() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field24 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.i(B)V")
	public final void method128() {
		if (field401 == 0) {
			field64[0] = "Cancel";
			field221[0] = 1086;
			field471 = 1;
			if (field416 == -1) {
				method140();
				field247 = 0;
				field291 = 0;

				if (field29 > 4 && field30 > 4 && field29 < 516 && field30 < 338) {
					if (field499 == -1) {
						method126();
					} else {
						method28(4, 0, field30, 4, IJOSTBQT.method276(field499), field29, 0);
					}
				}

				if (field503 != field247) {
					field503 = field247;
				}

				if (field96 != field291) {
					field96 = field291;
				}

				field247 = 0;
				field291 = 0;

				if (field29 > 553 && field30 > 205 && field29 < 743 && field30 < 466) {
					if (field195 != -1) {
						method28(205, 1, field30, 553, IJOSTBQT.method276(field195), field29, 0);
					} else if (field239[field232] != -1) {
						method28(205, 1, field30, 553, IJOSTBQT.method276(field239[field232]), field29, 0);
					}
				}

				if (field247 != field122) {
					field230 = true;
					field122 = field247;
				}

				if (field375 != field291) {
					field230 = true;
					field375 = field291;
				}

				field247 = 0;
				field291 = 0;

				if (field29 > 17 && field30 > 357 && field29 < 496 && field30 < 453) {
					if (field305 != -1) {
						method28(357, 2, field30, 17, IJOSTBQT.method276(field305), field29, 0);
					} else if (field441 != -1) {
						method28(357, 3, field30, 17, IJOSTBQT.method276(field441), field29, 0);
					} else if (field30 < 434 && field29 < 426 && field135 == 0) {
						method27(field30 - 357, field29 - 17);
					}
				}

				if ((field305 != -1 || field441 != -1) && field444 != field247) {
					field303 = true;
					field444 = field247;
				}

				if ((field305 != -1 || field441 != -1) && field296 != field291) {
					field303 = true;
					field296 = field291;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field471 - 1; var2++) {
						if (field221[var2] < 1000 && field221[var2 + 1] > 1000) {
							String var3 = field64[var2];
							field64[var2] = field64[var2 + 1];
							field64[var2 + 1] = var3;
							int var4 = field221[var2];
							field221[var2] = field221[var2 + 1];
							field221[var2 + 1] = var4;
							int var5 = field219[var2];
							field219[var2] = field219[var2 + 1];
							field219[var2 + 1] = var5;
							int var6 = field220[var2];
							field220[var2] = field220[var2 + 1];
							field220[var2 + 1] = var6;
							int var7 = field222[var2];
							field222[var2] = field222[var2 + 1];
							field222[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field247 = 0;
				field291 = 0;
				method28(0, 0, field30, 0, IJOSTBQT.method276(field416), field29, 0);

				if (field503 != field247) {
					field503 = field247;
				}

				if (field96 != field291) {
					field96 = field291;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLATHECRQB;)V")
	public final void method129(ATHECRQB arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field3 == 0) {
			var2 = field184.method242(arg0.field2, arg0.field4, arg0.field5);
		}

		if (arg0.field3 == 1) {
			var2 = field184.method243(arg0.field4, arg0.field5, arg0.field2);
		}

		if (arg0.field3 == 2) {
			var2 = field184.method244(arg0.field2, arg0.field4, arg0.field5);
		}

		if (arg0.field3 == 3) {
			var2 = field184.method245(arg0.field2, arg0.field4, arg0.field5);
		}

		if (var2 != 0) {
			int var6 = field184.method246(arg0.field2, arg0.field4, arg0.field5, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field9 = var3;
		arg0.field11 = var4;
		arg0.field10 = var5;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method130() {
		for (KSCKZMBT var1 = (KSCKZMBT) field398.method543(); var1 != null; var1 = (KSCKZMBT) field398.method545()) {
			if (field404 != var1.field965 || var1.field970) {
				var1.method14();
			} else if (field476 >= var1.field969) {
				var1.method317(field276);

				if (var1.field970) {
					var1.method14();
				} else {
					field184.method227(60, 0, var1.field965, false, var1.field966, var1, var1.field968, var1.field967, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method131() {
		field213 = new BVXAXAEI(field465, "titlebox", 0);
		field214 = new BVXAXAEI(field465, "titlebutton", 0);
		field260 = new BVXAXAEI[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field260[var1] = new BVXAXAEI(field465, "runes", var1);
		}

		field434 = new QEHNWGKD(128, 265);
		field435 = new QEHNWGKD(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field434.field1181[var2] = field268.field1001[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field435.field1181[var3] = field269.field1001[var3];
		}

		field117 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field117[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field117[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field117[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field117[var7 + 192] = 0xFFFFFF;
		}

		field118 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field118[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field118[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field118[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field118[var11 + 192] = 0xFFFFFF;
		}

		field119 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field119[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field119[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field119[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field119[var15 + 192] = 0xFFFFFF;
		}

		field116 = new int[256];
		field97 = new int[32768];
		field98 = new int[32768];
		method67(null);
		field318 = new int[32768];
		field319 = new int[32768];
		method13(10, "Connecting to fileserver");

		if (!field372) {
			field367 = true;
			field372 = true;
			method12(this, 2);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method132() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field318[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field318[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field319[var10] = (field318[var10 - 1] + field318[var10 + 1] + field318[var10 - 128] + field318[var10 + 128]) / 4;
			}
		}

		field185 += 128;
		if (field185 > field97.length) {
			field185 -= field97.length;
			int var11 = (int) (Math.random() * 12.0D);
			method67(field260[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field319[var14 + 128] - field97[field185 + var14 & field97.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field318[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field345[var16] = field345[var16 + 1];
		}

		field345[var1 - 1] = (int) (Math.sin(field476 / 14.0D) * 16.0D + Math.sin(field476 / 15.0D) * 14.0D + Math.sin(field476 / 16.0D) * 12.0D);

		if (field436 > 0) {
			field436 -= 4;
		}

		if (field437 > 0) {
			field437 -= 4;
		}

		if (field436 == 0 && field437 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field436 = 1024;
			}

			if (var17 == 1) {
				field437 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILMNKDCXXG;Z)V")
	public final void method133(int arg0, MNKDCXXG arg1) {
		while (arg1.field1056 + 10 < arg0 * 8) {
			int var3 = arg1.method397(11);
			if (var3 == 2047) {
				break;
			}

			if (field250[var3] == null) {
				field250[var3] = new CQCDOTXO();
				if (field255[var3] != null) {
					field250[var3].method170(field255[var3]);
				}
			}

			field252[field251++] = var3;
			CQCDOTXO var4 = field250[var3];
			var4.field608 = field476;
			int var5 = arg1.method397(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method397(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method397(1);
			int var8 = arg1.method397(1);
			if (var8 == 1) {
				field254[field253++] = var3;
			}

			var4.method204(field218.field591[0] + var5, var7 == 1, field218.field590[0] + var6);
		}

		arg1.method398();
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public static final String method134(int arg0) {
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

	@ObfuscatedName("client.n(Z)V")
	public final void method135() {
		Graphics var1 = method11().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method4(1);

		if (field473) {
			field372 = false;
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

		if (field208) {
			field372 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field81) {
			field372 = false;
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

	@ObfuscatedName("client.A(I)V")
	public final void method136() {
		if (field477 == 0 && field35 == 1) {
			int var1 = field36 - 25 - 550;
			int var2 = field37 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field454 + field170 & 0x7FF;
				int var4 = UNBQQGBL.field1268[var3];
				int var5 = UNBQQGBL.field1269[var3];
				var4 = (field394 + 256) * var4 >> 8;
				var5 = (field394 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field218.field615 + var6 >> 7;
				int var9 = field218.field616 - var7 >> 7;
				boolean var10 = method112(0, field218.field590[0], 0, field218.field591[0], var8, 0, 1, var9, 0, 0, true);
				if (var10) {
					field411.method376(var1);
					field411.method376(var2);
					field411.method377(field454);
					field411.method376(57);
					field411.method376(field170);
					field411.method376(field394);
					field411.method376(89);
					field411.method377(field218.field615);
					field411.method377(field218.field616);
					field411.method376(field334);
					field411.method376(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method137(int arg0) {
		int var2 = GQDAZHGX.field714[arg0].field722;
		if (var2 != 0) {
			int var3 = field439[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					UNBQQGBL.method506(0.9D);
				}

				if (var3 == 2) {
					UNBQQGBL.method506(0.8D);
				}

				if (var3 == 3) {
					UNBQQGBL.method506(0.7D);
				}

				if (var3 == 4) {
					UNBQQGBL.method506(0.6D);
				}

				RSPHUXRT.field1231.method429();
				field325 = true;
			}

			if (var2 == 3) {
				boolean var4 = field491;

				if (var3 == 0) {
					method89(field491, 0);
					field491 = true;
				}

				if (var3 == 1) {
					method89(field491, -400);
					field491 = true;
				}

				if (var3 == 2) {
					method89(field491, -800);
					field491 = true;
				}

				if (var3 == 3) {
					method89(field491, -1200);
					field491 = true;
				}

				if (var3 == 4) {
					field491 = false;
				}

				if (field491 != var4 && !field333) {
					if (field491) {
						field462 = field278;
						field463 = true;
						field112.method533(2, field462);
					} else {
						method141();
					}

					field474 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field460 = true;
					method123(0);
				}

				if (var3 == 1) {
					field460 = true;
					method123(-400);
				}

				if (var3 == 2) {
					field460 = true;
					method123(-800);
				}

				if (var3 == 3) {
					field460 = true;
					method123(-1200);
				}

				if (var3 == 4) {
					field460 = false;
				}
			}

			if (var2 == 5) {
				field210 = var3;
			}

			if (var2 == 6) {
				field134 = var3;
			}

			if (var2 == 8) {
				field114 = var3;
				field303 = true;
			}

			if (var2 == 9) {
				field256 = var3;
			}
		}
	}

	@ObfuscatedName("client.o(Z)Z")
	public final boolean method138() {
		if (field238 == null) {
			return false;
		}

		try {
			int var1 = field238.method558();
			if (var1 == 0) {
				return false;
			}

			if (field298 == -1) {
				field238.method559(field407.field1054, 0, 1);
				field298 = field407.field1054[0] & 0xFF;
				if (field131 != null) {
					field298 = field298 - field131.method514() & 0xFF;
				}

				field297 = DJUBFVHP.field541[field298];
				var1--;
			}

			if (field297 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field238.method559(field407.field1054, 0, 1);
				field297 = field407.field1054[0] & 0xFF;
				var1--;
			}

			if (field297 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field238.method559(field407.field1054, 0, 2);
				field407.field1055 = 0;
				field297 = field407.method388();
				var1 -= 2;
			}

			if (var1 < field297) {
				return false;
			}

			field407.field1055 = 0;
			field238.method559(field407.field1054, 0, field297);
			field299 = 0;
			field201 = field200;
			field200 = field199;
			field199 = field298;

			if (field298 == 159) {
				int var2 = field407.method413();
				int var3 = field407.method415();
				IJOSTBQT.method276(var3).field805 = 2;
				IJOSTBQT.method276(var3).field806 = var2;
				field298 = -1;
				return true;
			}

			if (field298 == 89) {
				int var4 = field407.method417();
				int var5 = field407.method418();
				int var6 = field407.method415();
				IJOSTBQT var7 = IJOSTBQT.method276(var6);
				var7.field848 = var5;
				var7.field872 = var4;
				field298 = -1;
				return true;
			}

			if (field298 == 123) {
				int var8 = field407.method413();
				int var9 = field407.method423();
				field70[var8] = var9;

				if (field439[var8] != var9) {
					field439[var8] = var9;
					method137(var8);
					field230 = true;

					if (field441 != -1) {
						field303 = true;
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 152) {
				if (field195 != -1) {
					method50(field195);
					field195 = -1;
					field230 = true;
					field63 = true;
				}

				if (field305 != -1) {
					method50(field305);
					field305 = -1;
					field303 = true;
				}

				if (field416 != -1) {
					method50(field416);
					field416 = -1;
					field325 = true;
				}

				if (field290 != -1) {
					method50(field290);
					field290 = -1;
				}

				if (field499 != -1) {
					method50(field499);
					field499 = -1;
				}

				if (field135 != 0) {
					field135 = 0;
					field303 = true;
				}

				field466 = false;
				field298 = -1;
				return true;
			}

			if (field298 == 227) {
				method61(field407, field297);
				field298 = -1;
				return true;
			}

			if (field298 == 225) {
				long var10 = field407.method392();
				int var12 = field407.method391();
				int var13 = field407.method386();
				boolean var14 = false;
				for (int var15 = 0; var15 < 100; var15++) {
					if (field493[var15] == var12) {
						var14 = true;
						break;
					}
				}

				if (var13 <= 1) {
					for (int var16 = 0; var16 < field292; var16++) {
						if (field458[var16] == var10) {
							var14 = true;
							break;
						}
					}
				}

				if (!var14 && field262 == 0) {
					try {
						field493[field461] = var12;
						field461 = (field461 + 1) % 100;
						String var17 = YOLZIXCN.method600(field297 - 13, field407);
						if (var13 != 3) {
							var17 = LJNJPDAK.method328(var17);
						}

						if (var13 == 2 || var13 == 3) {
							method121(var17, 7, "@cr2@" + UJXMBJLW.method495(UJXMBJLW.method492(var10)));
						} else if (var13 == 1) {
							method121(var17, 7, "@cr1@" + UJXMBJLW.method495(UJXMBJLW.method492(var10)));
						} else {
							method121(var17, 3, UJXMBJLW.method495(UJXMBJLW.method492(var10)));
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 85) {
				field157 = field407.method386();
				field472 = field407.method386();
				field110 = field407.method386();
				field204 = true;
				field303 = true;
				field298 = -1;
				return true;
			}

			if (field298 == 107) {
				boolean var19 = field407.method406() == 1;
				int var20 = field407.method388();
				IJOSTBQT.method276(var20).field846 = var19;
				field298 = -1;
				return true;
			}

			if (field298 == 242) {
				field106 = field407.method386();
				if (field106 == 1) {
					field66 = field407.method388();
				}

				if (field106 >= 2 && field106 <= 6) {
					if (field106 == 2) {
						field104 = 64;
						field105 = 64;
					}

					if (field106 == 3) {
						field104 = 0;
						field105 = 64;
					}

					if (field106 == 4) {
						field104 = 128;
						field105 = 64;
					}

					if (field106 == 5) {
						field104 = 64;
						field105 = 0;
					}

					if (field106 == 6) {
						field104 = 64;
						field105 = 128;
					}

					field106 = 2;
					field101 = field407.method388();
					field102 = field407.method388();
					field103 = field407.method386();
				}

				if (field106 == 10) {
					field107 = field407.method388();
				}

				field298 = -1;
				return true;
			}

			if (field298 == 216) {
				int var21 = field407.method388();
				method92(var21);

				if (field195 != -1) {
					method50(field195);
					field195 = -1;
					field230 = true;
					field63 = true;
				}

				if (field305 != -1) {
					method50(field305);
					field305 = -1;
					field303 = true;
				}

				if (field416 != -1) {
					method50(field416);
					field416 = -1;
					field325 = true;
				}

				if (field290 != -1) {
					method50(field290);
					field290 = -1;
				}

				if (field499 != var21) {
					method50(field499);
					field499 = var21;
				}

				if (field135 != 0) {
					field135 = 0;
					field303 = true;
				}

				field466 = false;
				field298 = -1;
				return true;
			}

			if (field298 == 50) {
				field226 = field407.method414();
				field482 = field407.method388();
				field407.method415();
				field365 = field407.method422();
				field407.method407();
				field407.method415();
				field62 = field407.method388();
				field76 = field407.method413();
				field418 = field407.method414();
				field407.method415();
				field443 = field407.method414();
				signlink.dnslookup(UJXMBJLW.method494(field365));
				field298 = -1;
				return true;
			}

			if (field298 == 135) {
				field85 = field407.method386();
				field298 = -1;
				return true;
			}

			if (field298 == 163) {
				field230 = true;
				int var22 = field407.method388();
				IJOSTBQT var23 = IJOSTBQT.method276(var22);
				while (field407.field1055 < field297) {
					int var24 = field407.method400();
					int var25 = field407.method388();
					int var26 = field407.method386();
					if (var26 == 255) {
						var26 = field407.method391();
					}

					if (var24 >= 0 && var24 < var23.field830.length) {
						var23.field830[var24] = var25;
						var23.field817[var24] = var26;
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 3) {
				field317 = field407.method406();
				if (field317 == field232) {
					if (field317 == 3) {
						field232 = 1;
					} else {
						field232 = 3;
					}

					field230 = true;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 250) {
				field390 = field407.method386();
				field389 = field407.method405();
				field298 = -1;
				return true;
			}

			if (field298 == 10) {
				int var27 = field407.method388();
				int var28 = field407.method415();

				if (field305 != -1) {
					method50(field305);
					field305 = -1;
					field303 = true;
				}

				if (field416 != -1) {
					method50(field416);
					field416 = -1;
					field325 = true;
				}

				if (field290 != -1) {
					method50(field290);
					field290 = -1;
				}

				if (field499 != var27) {
					method50(field499);
					field499 = var27;
				}

				if (field195 != var28) {
					method50(field195);
					field195 = var28;
				}

				if (field135 != 0) {
					field135 = 0;
					field303 = true;
				}

				field230 = true;
				field63 = true;
				field466 = false;
				field298 = -1;
				return true;
			}

			if (field298 == 38) {
				int var29 = field407.method388();
				method92(var29);

				if (field305 != -1) {
					method50(field305);
					field305 = -1;
					field303 = true;
				}

				if (field416 != -1) {
					method50(field416);
					field416 = -1;
					field325 = true;
				}

				if (field290 != -1) {
					method50(field290);
					field290 = -1;
				}

				if (field499 != -1) {
					method50(field499);
					field499 = -1;
				}

				if (field195 != var29) {
					method50(field195);
					field195 = var29;
				}

				if (field135 != 0) {
					field135 = 0;
					field303 = true;
				}

				field230 = true;
				field63 = true;
				field466 = false;
				field298 = -1;
				return true;
			}

			if (field298 == 139) {
				int var30 = field407.method413();
				IJOSTBQT var31 = IJOSTBQT.method276(var30);
				for (int var32 = 0; var32 < var31.field830.length; var32++) {
					var31.field830[var32] = -1;
					var31.field830[var32] = 0;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 128 || field298 == 188 || field298 == 49 || field298 == 150 || field298 == 109 || field298 == 239 || field298 == 27 || field298 == 127 || field298 == 205 || field298 == 113 || field298 == 197) {
				method81(field407, field298);
				field298 = -1;
				return true;
			}

			if (field298 == 124) {
				field197 = field407.method388() * 30;
				field298 = -1;
				return true;
			}

			if (field298 == 176) {
				method106(field297, field407);
				field289 = false;
				field298 = -1;
				return true;
			}

			if (field298 == 16) {
				int var33 = field407.method386();
				int var34 = field407.method386();
				int var35 = field407.method386();
				int var36 = field407.method386();
				field422[var33] = true;
				field80[var33] = var34;
				field506[var33] = var35;
				field132[var33] = var36;
				field154[var33] = 0;
				field298 = -1;
				return true;
			}

			if (field298 == 144) {
				int var37 = field407.method413();
				IJOSTBQT.method276(var37).field805 = 3;

				if (field218.field530 == null) {
					IJOSTBQT.method276(var37).field806 = (field218.field515[11] << 5) + (field218.field515[8] << 10) + (field218.field515[0] << 15) + (field218.field529[0] << 25) + (field218.field529[4] << 20) + field218.field515[1];
				} else {
					IJOSTBQT.method276(var37).field806 = (int) (field218.field530.field1122 + 0x12345678L);
				}

				field298 = -1;
				return true;
			}

			if (field298 == 93) {
				int var38 = field407.method416();
				if (var38 >= 0) {
					method92(var38);
				}

				if (field196 != var38) {
					method50(field196);
					field196 = var38;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 115) {
				field489 = false;
				field135 = 2;
				field65 = "";
				field303 = true;
				field298 = -1;
				return true;
			}

			if (field298 == 181) {
				field477 = field407.method386();
				field298 = -1;
				return true;
			}

			if (field298 == 96) {
				int var39 = field407.method414();
				method92(var39);

				if (field195 != -1) {
					method50(field195);
					field195 = -1;
					field230 = true;
					field63 = true;
				}

				if (field416 != -1) {
					method50(field416);
					field416 = -1;
					field325 = true;
				}

				if (field290 != -1) {
					method50(field290);
					field290 = -1;
				}

				if (field499 != -1) {
					method50(field499);
					field499 = -1;
				}

				if (field305 != var39) {
					method50(field305);
					field305 = var39;
				}

				field466 = false;
				field303 = true;
				field298 = -1;
				return true;
			}

			if (field298 == 90) {
				int var40 = field407.method417();
				if (field441 != var40) {
					method50(field441);
					field441 = var40;
				}

				field303 = true;
				field298 = -1;
				return true;
			}

			if (field298 == 6) {
				int var41 = field407.method415();
				if (var41 == 0xFFFF) {
					var41 = -1;
				}

				if (field278 != var41 && field491 && !field333 && field474 == 0) {
					field462 = var41;
					field463 = true;
					field112.method533(2, field462);
				}

				field278 = var41;
				field298 = -1;
				return true;
			}

			if (field298 == 147) {
				int var42 = field407.method414();
				int var43 = field407.method419();
				if (field491 && !field333) {
					field462 = var42;
					field463 = false;
					field112.method533(2, field462);
					field474 = var43;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 207) {
				field230 = true;
				int var44 = field407.method388();
				IJOSTBQT var45 = IJOSTBQT.method276(var44);
				int var46 = field407.method388();
				for (int var47 = 0; var47 < var46; var47++) {
					var45.field830[var47] = field407.method415();
					int var48 = field407.method405();
					if (var48 == 255) {
						var48 = field407.method423();
					}

					var45.field817[var47] = var48;
				}

				for (int var49 = var46; var49 < var45.field830.length; var49++) {
					var45.field830[var49] = 0;
					var45.field817[var49] = 0;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 232) {
				field82 = true;
				field377 = field407.method386();
				field378 = field407.method386();
				field379 = field407.method388();
				field380 = field407.method386();
				field381 = field407.method386();
				if (field381 >= 100) {
					int var50 = field377 * 128 + 64;
					int var51 = field378 * 128 + 64;
					int var52 = method153(var51, var50, field404) - field379;
					int var53 = var50 - field423;
					int var54 = var52 - field424;
					int var55 = var51 - field425;
					int var56 = (int) Math.sqrt(var53 * var53 + var55 * var55);
					field426 = (int) (Math.atan2(var54, var56) * 325.949D) & 0x7FF;
					field427 = (int) (Math.atan2(var53, var55) * -325.949D) & 0x7FF;

					if (field426 < 128) {
						field426 = 128;
					}

					if (field426 > 383) {
						field426 = 383;
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 177) {
				int var57 = field407.method414();
				int var58 = field407.method388();
				int var59 = field407.method414();
				IJOSTBQT.method276(var58).field816 = (var57 << 16) + var59;
				field298 = -1;
				return true;
			}

			if (field298 == 28) {
				int var60 = field407.method413();
				int var61 = field407.method406();

				if (var60 == 0xFFFF) {
					var60 = -1;
				}

				if (field239[var61] != var60) {
					method50(field239[var61]);
					field239[var61] = var60;
				}

				field230 = true;
				field63 = true;
				field298 = -1;
				return true;
			}

			if (field298 == 138) {
				field489 = false;
				field135 = 1;
				field65 = "";
				field303 = true;
				field298 = -1;
				return true;
			}

			if (field298 == 98) {
				int var62 = field407.method388();
				int var63 = field407.method386();
				int var64 = field407.method388();
				if (var64 == 0xFFFF) {
					if (field352 < 50) {
						field258[field352] = (short) var62;
						field440[field352] = var63;
						field288[field352] = 0;
						field352++;
					}
				} else if (field460 && !field333 && field352 < 50) {
					field258[field352] = var62;
					field440[field352] = var63;
					field288[field352] = CQXSYOPM.field534[var62] + var64;
					field352++;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 29) {
				method118();
				field298 = -1;
				return false;
			}

			if (field298 == 208) {
				int var65 = field407.method414();
				int var66 = field407.method415();
				method92(var66);

				if (var65 != -1) {
					method92(var65);
				}

				if (field499 != -1) {
					method50(field499);
					field499 = -1;
				}

				if (field195 != -1) {
					method50(field195);
					field195 = -1;
				}

				if (field305 != -1) {
					method50(field305);
					field305 = -1;
				}

				if (field416 != var66) {
					method50(field416);
					field416 = var66;
				}

				if (field290 != var66) {
					method50(field290);
					field290 = var65;
				}

				field135 = 0;
				field466 = false;
				field298 = -1;
				return true;
			}

			if (field298 == 212) {
				String var67 = field407.method393();
				int var68 = field407.method415();
				IJOSTBQT.method276(var68).field847 = var67;

				if (field239[field232] == IJOSTBQT.method276(var68).field871) {
					field230 = true;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 221 || field298 == 164) {
				int var69 = field504;
				int var70 = field505;
				if (field298 == 221) {
					var70 = field407.method415();
					var69 = field407.method414();
					field67 = false;
				}

				if (field298 == 164) {
					field407.method396();

					for (int var71 = 0; var71 < 4; var71++) {
						for (int var72 = 0; var72 < 13; var72++) {
							for (int var73 = 0; var73 < 13; var73++) {
								int var74 = field407.method397(1);
								if (var74 == 1) {
									field294[var71][var72][var73] = field407.method397(26);
								} else {
									field294[var71][var72][var73] = -1;
								}
							}
						}
					}

					field407.method398();
					var70 = field407.method415();
					var69 = field407.method415();
					field67 = true;
				}

				if (field504 == var69 && field505 == var70 && field280 == 2) {
					field298 = -1;
					return true;
				}

				field504 = var69;
				field505 = var70;
				field309 = (field504 - 6) * 8;
				field310 = (field505 - 6) * 8;
				field279 = false;
				if ((field504 / 8 == 48 || field504 / 8 == 49) && field505 / 8 == 48) {
					field279 = true;
				}

				if (field504 / 8 == 48 && field505 / 8 == 148) {
					field279 = true;
				}

				field280 = 1;
				field231 = System.currentTimeMillis();
				method119(null, "Loading - please wait.");

				if (field298 == 221) {
					int var75 = 0;
					for (int var76 = (field504 - 6) / 8; var76 <= (field504 + 6) / 8; var76++) {
						for (int var77 = (field505 - 6) / 8; var77 <= (field505 + 6) / 8; var77++) {
							var75++;
						}
					}

					field391 = new byte[var75][];
					field175 = new byte[var75][];
					field419 = new int[var75];
					field420 = new int[var75];
					field421 = new int[var75];
					int var78 = 0;
					for (int var79 = (field504 - 6) / 8; var79 <= (field504 + 6) / 8; var79++) {
						for (int var80 = (field505 - 6) / 8; var80 <= (field505 + 6) / 8; var80++) {
							field419[var78] = (var79 << 8) + var80;

							if (field279 && (var80 == 49 || var80 == 149 || var80 == 147 || var79 == 50 || var79 == 49 && var80 == 47)) {
								field420[var78] = -1;
								field421[var78] = -1;
								var78++;
							} else {
								int var81 = field420[var78] = field112.method519(var79, var80, 0);
								if (var81 != -1) {
									field112.method533(3, var81);
								}

								int var82 = field421[var78] = field112.method519(var79, var80, 1);
								if (var82 != -1) {
									field112.method533(3, var82);
								}

								var78++;
							}
						}
					}
				}

				if (field298 == 164) {
					int var83 = 0;
					int[] var84 = new int[676];
					for (int var85 = 0; var85 < 4; var85++) {
						for (int var86 = 0; var86 < 13; var86++) {
							for (int var87 = 0; var87 < 13; var87++) {
								int var88 = field294[var85][var86][var87];
								if (var88 != -1) {
									int var89 = var88 >> 14 & 0x3FF;
									int var90 = var88 >> 3 & 0x7FF;
									int var91 = (var89 / 8 << 8) + var90 / 8;
									for (int var92 = 0; var92 < var83; var92++) {
										if (var84[var92] == var91) {
											var91 = -1;
											break;
										}
									}

									if (var91 != -1) {
										var84[var83++] = var91;
									}
								}
							}
						}
					}

					field391 = new byte[var83][];
					field175 = new byte[var83][];
					field419 = new int[var83];
					field420 = new int[var83];
					field421 = new int[var83];
					for (int var93 = 0; var93 < var83; var93++) {
						int var94 = field419[var93] = var84[var93];
						int var95 = var94 >> 8 & 0xFF;
						int var96 = var94 & 0xFF;
						int var97 = field420[var93] = field112.method519(var95, var96, 0);
						if (var97 != -1) {
							field112.method533(3, var97);
						}

						int var98 = field421[var93] = field112.method519(var95, var96, 1);
						if (var98 != -1) {
							field112.method533(3, var98);
						}
					}
				}

				int var99 = field309 - field311;
				int var100 = field310 - field312;
				field311 = field309;
				field312 = field310;

				for (int var101 = 0; var101 < 16384; var101++) {
					YQBVAFEO var102 = field342[var101];
					if (var102 != null) {
						for (int var103 = 0; var103 < 10; var103++) {
							var102.field590[var103] -= var99;
							var102.field591[var103] -= var100;
						}

						var102.field615 -= var99 * 128;
						var102.field616 -= var100 * 128;
					}
				}

				for (int var104 = 0; var104 < field248; var104++) {
					CQCDOTXO var105 = field250[var104];
					if (var105 != null) {
						for (int var106 = 0; var106 < 10; var106++) {
							var105.field590[var106] -= var99;
							var105.field591[var106] -= var100;
						}

						var105.field615 -= var99 * 128;
						var105.field616 -= var100 * 128;
					}
				}

				field289 = true;
				byte var107 = 0;
				byte var108 = 104;
				byte var109 = 1;
				if (var99 < 0) {
					var107 = 103;
					var108 = -1;
					var109 = -1;
				}

				byte var110 = 0;
				byte var111 = 104;
				byte var112 = 1;
				if (var100 < 0) {
					var110 = 103;
					var111 = -1;
					var112 = -1;
				}

				for (int var113 = var107; var113 != var108; var113 += var109) {
					for (int var114 = var110; var114 != var111; var114 += var112) {
						int var115 = var99 + var113;
						int var116 = var100 + var114;
						for (int var117 = 0; var117 < 4; var117++) {
							if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
								field100[var117][var113][var114] = field100[var117][var115][var116];
							} else {
								field100[var117][var113][var114] = null;
							}
						}
					}
				}

				for (ATHECRQB var118 = (ATHECRQB) field130.method543(); var118 != null; var118 = (ATHECRQB) field130.method545()) {
					var118.field4 -= var99;
					var118.field5 -= var100;
					if (var118.field4 < 0 || var118.field5 < 0 || var118.field4 >= 104 || var118.field5 >= 104) {
						var118.method14();
					}
				}

				if (field383 != 0) {
					field383 -= var99;
					field384 -= var100;
				}

				field82 = false;
				field298 = -1;
				return true;
			}

			if (field298 == 120) {
				field82 = true;
				field176 = field407.method386();
				field177 = field407.method386();
				field178 = field407.method388();
				field179 = field407.method386();
				field180 = field407.method386();
				if (field180 >= 100) {
					field423 = field176 * 128 + 64;
					field425 = field177 * 128 + 64;
					field424 = method153(field425, field423, field404) - field178;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 61) {
				int var119 = field407.method413();
				int var120 = field407.method416();
				IJOSTBQT var121 = IJOSTBQT.method276(var119);
				if (var121.field837 != var120 || var120 == -1) {
					var121.field837 = var120;
					var121.field833 = 0;
					var121.field825 = 0;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 254) {
				if (field232 == 12) {
					field230 = true;
				}

				field187 = field407.method386();
				field298 = -1;
				return true;
			}

			if (field298 == 193) {
				byte var122 = field407.method409();
				int var123 = field407.method415();
				field70[var123] = var122;

				if (field439[var123] != var122) {
					field439[var123] = var122;
					method137(var123);
					field230 = true;

					if (field441 != -1) {
						field303 = true;
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 52) {
				long var124 = field407.method392();
				int var126 = field407.method386();
				String var127 = UJXMBJLW.method495(UJXMBJLW.method492(var124));
				for (int var128 = 0; var128 < field168; var128++) {
					if (field123[var128] == var124) {
						if (field353[var128] != var126) {
							field353[var128] = var126;
							field230 = true;

							if (var126 > 0) {
								method121(var127 + " has logged in.", 5, "");
							}

							if (var126 == 0) {
								method121(var127 + " has logged out.", 5, "");
							}
						}

						var127 = null;
						break;
					}
				}

				if (var127 != null && field168 < 200) {
					field123[field168] = var124;
					field69[field168] = var127;
					field353[field168] = var126;
					field168++;
					field230 = true;
				}

				boolean var129 = false;
				while (!var129) {
					var129 = true;
					for (int var130 = 0; var130 < field168 - 1; var130++) {
						if (field353[var130] != field330 && field353[var130 + 1] == field330 || field353[var130] == 0 && field353[var130 + 1] != 0) {
							int var131 = field353[var130];
							field353[var130] = field353[var130 + 1];
							field353[var130 + 1] = var131;
							String var132 = field69[var130];
							field69[var130] = field69[var130 + 1];
							field69[var130 + 1] = var132;
							long var133 = field123[var130];
							field123[var130] = field123[var130 + 1];
							field123[var130 + 1] = var133;
							field230 = true;
							var129 = false;
						}
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 105) {
				field169 = field407.method386();
				field230 = true;
				field298 = -1;
				return true;
			}

			if (field298 == 129) {
				String var135 = field407.method393();
				if (var135.endsWith(":tradereq:")) {
					String var136 = var135.substring(0, var135.indexOf(":"));
					long var137 = UJXMBJLW.method491(var136);
					boolean var139 = false;
					for (int var140 = 0; var140 < field292; var140++) {
						if (field458[var140] == var137) {
							var139 = true;
							break;
						}
					}

					if (!var139 && field262 == 0) {
						method121("wishes to trade with you.", 4, var136);
					}
				} else if (var135.endsWith(":duelreq:")) {
					String var141 = var135.substring(0, var135.indexOf(":"));
					long var142 = UJXMBJLW.method491(var141);
					boolean var144 = false;
					for (int var145 = 0; var145 < field292; var145++) {
						if (field458[var145] == var142) {
							var144 = true;
							break;
						}
					}

					if (!var144 && field262 == 0) {
						method121("wishes to duel with you.", 8, var141);
					}
				} else if (var135.endsWith(":chalreq:")) {
					String var146 = var135.substring(0, var135.indexOf(":"));
					long var147 = UJXMBJLW.method491(var146);
					boolean var149 = false;
					for (int var150 = 0; var150 < field292; var150++) {
						if (field458[var150] == var147) {
							var149 = true;
							break;
						}
					}

					if (!var149 && field262 == 0) {
						String var151 = var135.substring(var135.indexOf(":") + 1, var135.length() - 9);
						method121(var151, 8, var146);
					}
				} else {
					method121(var135, 0, "");
				}

				field298 = -1;
				return true;
			}

			if (field298 == 230) {
				field82 = false;

				for (int var152 = 0; var152 < 5; var152++) {
					field422[var152] = false;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 171) {
				field230 = true;
				int var153 = field407.method406();
				int var154 = field407.method421();
				int var155 = field407.method386();
				field428[var155] = var154;
				field136[var155] = var153;
				field302[var155] = 1;
				for (int var156 = 0; var156 < 98; var156++) {
					if (var154 >= field467[var156]) {
						field302[var155] = var156 + 2;
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 116) {
				int var157 = field407.method405();
				int var158 = field407.method406();
				String var159 = field407.method393();
				if (var157 >= 1 && var157 <= 5) {
					if (var159.equalsIgnoreCase("null")) {
						var159 = null;
					}

					field328[var157 - 1] = var159;
					field329[var157 - 1] = var158 == 0;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 20) {
				if (field232 == 12) {
					field230 = true;
				}

				field241 = field407.method389();
				field298 = -1;
				return true;
			}

			if (field298 == 194) {
				field389 = field407.method407();
				field390 = field407.method405();

				while (field407.field1055 < field297) {
					int var160 = field407.method386();
					method81(field407, var160);
				}

				field298 = -1;
				return true;
			}

			if (field298 == 14) {
				for (int var161 = 0; var161 < field439.length; var161++) {
					if (field70[var161] != field439[var161]) {
						field439[var161] = field70[var161];
						method137(var161);
						field230 = true;
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 103) {
				int var162 = field407.method388();
				int var163 = field407.method388();
				int var164 = var163 >> 10 & 0x1F;
				int var165 = var163 >> 5 & 0x1F;
				int var166 = var163 & 0x1F;
				IJOSTBQT.method276(var162).field860 = (var166 << 3) + (var164 << 19) + (var165 << 11);
				field298 = -1;
				return true;
			}

			if (field298 == 168) {
				field315 = field407.method415();
				field497 = field407.method405();
				field298 = -1;
				return true;
			}

			if (field298 == 253) {
				field383 = 0;
				field298 = -1;
				return true;
			}

			if (field298 == 173) {
				int var167 = field407.method413();
				int var168 = field407.method388();
				int var169 = field407.method413();
				if (var168 == 0xFFFF) {
					IJOSTBQT.method276(var169).field805 = 0;
					field298 = -1;
					return true;
				}

				RSPHUXRT var170 = RSPHUXRT.method475(var168);
				IJOSTBQT.method276(var169).field805 = 4;
				IJOSTBQT.method276(var169).field806 = var168;
				IJOSTBQT.method276(var169).field813 = var170.field1232;
				IJOSTBQT.method276(var169).field814 = var170.field1221;
				IJOSTBQT.method276(var169).field812 = var170.field1203 * 100 / var167;
				field298 = -1;
				return true;
			}

			if (field298 == 59) {
				field232 = field407.method407();
				field230 = true;
				field63 = true;
				field298 = -1;
				return true;
			}

			if (field298 == 32) {
				for (int var171 = 0; var171 < field250.length; var171++) {
					if (field250[var171] != null) {
						field250[var171].field602 = -1;
					}
				}

				for (int var172 = 0; var172 < field342.length; var172++) {
					if (field342[var172] != null) {
						field342[var172].field602 = -1;
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 40) {
				int var173 = field407.method413();
				int var174 = field407.method415();
				IJOSTBQT var175 = IJOSTBQT.method276(var174);
				if (var175 != null && var175.field855 == 0) {
					if (var173 < 0) {
						var173 = 0;
					}

					if (var173 > var175.field835 - var175.field857) {
						var173 = var175.field835 - var175.field857;
					}

					var175.field804 = var173;
				}

				field298 = -1;
				return true;
			}

			if (field298 == 246) {
				field292 = field297 / 8;
				for (int var176 = 0; var176 < field292; var176++) {
					field458[var176] = field407.method392();
				}

				field298 = -1;
				return true;
			}

			if (field298 == 201) {
				field390 = field407.method386();
				field389 = field407.method407();
				for (int var177 = field389; var177 < field389 + 8; var177++) {
					for (int var178 = field390; var178 < field390 + 8; var178++) {
						if (field100[field404][var177][var178] != null) {
							field100[field404][var177][var178] = null;
							method57(var177, var178);
						}
					}
				}

				for (ATHECRQB var179 = (ATHECRQB) field130.method543(); var179 != null; var179 = (ATHECRQB) field130.method545()) {
					if (var179.field4 >= field389 && var179.field4 < field389 + 8 && var179.field5 >= field390 && var179.field5 < field390 + 8 && field404 == var179.field2) {
						var179.field12 = 0;
					}
				}

				field298 = -1;
				return true;
			}

			if (field298 == 80) {
				int var180 = field407.method388();
				int var181 = field407.method413();
				int var182 = field407.method413();
				int var183 = field407.method414();
				IJOSTBQT.method276(var181).field813 = var182;
				IJOSTBQT.method276(var181).field814 = var183;
				IJOSTBQT.method276(var181).field812 = var180;
				field298 = -1;
				return true;
			}

			if (field298 == 15) {
				int var184 = field407.method388();
				int var185 = field407.method413();
				IJOSTBQT.method276(var184).field805 = 1;
				IJOSTBQT.method276(var184).field806 = var185;
				field298 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field298 + "," + field297 + " - " + field200 + "," + field201);
			method118();
		} catch (IOException var190) {
			method161();
		} catch (Exception var191) {
			String var187 = "T2 - " + field298 + "," + field200 + "," + field201 + " - " + field297 + "," + (field218.field590[0] + field309) + "," + (field218.field591[0] + field310) + " - ";
			for (int var188 = 0; var188 < field297 && var188 < 50; var188++) {
				var187 = var187 + field407.field1054[var188] + ",";
			}

			signlink.reporterror(var187);
			method118();
		}

		return true;
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		method13(20, "Starting up");

		if (signlink.sunjava) {
			field15 = 5;
		}

		if (field121) {
			field81 = true;
		} else {
			field121 = true;
			boolean var1 = false;
			String var2 = method127();
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
						field412[var3] = new WSLQJCTU(500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method83();
					field465 = method101(1, "title screen", field376[1], 25, "title");
					field478 = new XZMPLIVN(field465, false, "p11_full");
					field479 = new XZMPLIVN(field465, false, "p12_full");
					field480 = new XZMPLIVN(field465, false, "b12_full");
					field481 = new XZMPLIVN(field465, true, "q8_full");
					method111();
					method131();
					NXFIIFAD var4 = method101(2, "config", field376[2], 30, "config");
					NXFIIFAD var5 = method101(3, "interface", field376[3], 35, "interface");
					NXFIIFAD var6 = method101(4, "2d graphics", field376[4], 40, "media");
					NXFIIFAD var7 = method101(6, "textures", field376[6], 45, "textures");
					NXFIIFAD var8 = method101(7, "chat system", field376[7], 50, "wordenc");
					NXFIIFAD var9 = method101(8, "sound effects", field376[8], 55, "sounds");
					field405 = new byte[4][104][104];
					field490 = new int[4][105][105];
					field184 = new HFSXIPFN(field490, 104, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field498[var10] = new EKHWFCYP(104, 104);
					}

					field385 = new QEHNWGKD(512, 512);
					NXFIIFAD var11 = method101(5, "update list", field376[5], 60, "versionlist");
					method13(60, "Connecting to update server");
					field112 = new UWINSVPX();
					field112.method537(var11, this);
					FIYHSKKC.method207(field112.method528());
					IRLTEWJP.method278(field112.method531(0), field112);

					if (!field333) {
						field462 = 0;
						field463 = true;
						field112.method533(2, field462);

						while (field112.method526() > 0) {
							method160();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field112.field1315 > 3) {
								method73("ondemand");
								return;
							}
						}
					}

					method13(65, "Requesting animations");
					int var12 = field112.method531(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field112.method533(1, var13);
					}

					while (field112.method526() > 0) {
						int var14 = var12 - field112.method526();
						if (var14 > 0) {
							method13(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method160();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field112.field1315 > 3) {
							method73("ondemand");
							return;
						}
					}

					method13(70, "Requesting models");
					int var15 = field112.method531(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field112.method525(var16);
						if ((var17 & 0x1) != 0) {
							field112.method533(0, var16);
						}
					}

					int var18 = field112.method526();
					while (field112.method526() > 0) {
						int var19 = var18 - field112.method526();
						if (var19 > 0) {
							method13(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method160();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field412[0] != null) {
						method13(75, "Requesting maps");
						field112.method533(3, field112.method519(47, 48, 0));
						field112.method533(3, field112.method519(47, 48, 1));
						field112.method533(3, field112.method519(48, 48, 0));
						field112.method533(3, field112.method519(48, 48, 1));
						field112.method533(3, field112.method519(49, 48, 0));
						field112.method533(3, field112.method519(49, 48, 1));
						field112.method533(3, field112.method519(47, 47, 0));
						field112.method533(3, field112.method519(47, 47, 1));
						field112.method533(3, field112.method519(48, 47, 0));
						field112.method533(3, field112.method519(48, 47, 1));
						field112.method533(3, field112.method519(48, 148, 0));
						field112.method533(3, field112.method519(48, 148, 1));
						int var20 = field112.method526();
						while (field112.method526() > 0) {
							int var21 = var20 - field112.method526();
							if (var21 > 0) {
								method13(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method160();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field112.method531(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field112.method525(var23);
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
							field112.method536(0, var23, var25);
						}
					}

					field112.method532(field332);

					if (!field333) {
						int var26 = field112.method531(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field112.method522(var27)) {
								field112.method536(2, var27, (byte) 1);
							}
						}
					}

					method13(80, "Unpacking media");
					field172 = new BVXAXAEI(var6, "invback", 0);
					field174 = new BVXAXAEI(var6, "chatback", 0);
					field173 = new BVXAXAEI(var6, "mapback", 0);
					field215 = new BVXAXAEI(var6, "backbase1", 0);
					field216 = new BVXAXAEI(var6, "backbase2", 0);
					field217 = new BVXAXAEI(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field108[var28] = new BVXAXAEI(var6, "sideicons", var28);
					}

					field155 = new QEHNWGKD(var6, "compass", 0);
					field202 = new QEHNWGKD(var6, "mapedge", 0);
					field202.method455();

					for (int var29 = 0; var29 < 72; var29++) {
						field120[var29] = new BVXAXAEI(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 70; var30++) {
						field207[var30] = new QEHNWGKD(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field211[var31] = new QEHNWGKD(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field245[var32] = new QEHNWGKD(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field124[var33] = new QEHNWGKD(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field306[var34] = new QEHNWGKD(var6, "headicons_hint", var34);
					}

					field397 = new QEHNWGKD(var6, "overlay_multiway", 0);
					field373 = new QEHNWGKD(var6, "mapmarker", 0);
					field374 = new QEHNWGKD(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field93[var35] = new QEHNWGKD(var6, "cross", var35);
					}

					field429 = new QEHNWGKD(var6, "mapdots", 0);
					field430 = new QEHNWGKD(var6, "mapdots", 1);
					field431 = new QEHNWGKD(var6, "mapdots", 2);
					field432 = new QEHNWGKD(var6, "mapdots", 3);
					field433 = new QEHNWGKD(var6, "mapdots", 4);
					field83 = new BVXAXAEI(var6, "scrollbar", 0);
					field84 = new BVXAXAEI(var6, "scrollbar", 1);
					field233 = new BVXAXAEI(var6, "redstone1", 0);
					field234 = new BVXAXAEI(var6, "redstone2", 0);
					field235 = new BVXAXAEI(var6, "redstone3", 0);
					field236 = new BVXAXAEI(var6, "redstone1", 0);
					field236.method17();
					field237 = new BVXAXAEI(var6, "redstone2", 0);
					field237.method17();
					field336 = new BVXAXAEI(var6, "redstone1", 0);
					field336.method18();
					field337 = new BVXAXAEI(var6, "redstone2", 0);
					field337.method18();
					field338 = new BVXAXAEI(var6, "redstone3", 0);
					field338.method18();
					field339 = new BVXAXAEI(var6, "redstone1", 0);
					field339.method17();
					field339.method18();
					field340 = new BVXAXAEI(var6, "redstone2", 0);
					field340.method17();
					field340.method18();

					for (int var36 = 0; var36 < 2; var36++) {
						field442[var36] = new BVXAXAEI(var6, "mod_icons", var36);
					}

					QEHNWGKD var37 = new QEHNWGKD(var6, "backleft1", 0);
					field355 = new MEXICRKY(var37.field1183, var37.field1182, method11());
					var37.method456(0, 0);
					QEHNWGKD var38 = new QEHNWGKD(var6, "backleft2", 0);
					field356 = new MEXICRKY(var38.field1183, var38.field1182, method11());
					var38.method456(0, 0);
					QEHNWGKD var39 = new QEHNWGKD(var6, "backright1", 0);
					field357 = new MEXICRKY(var39.field1183, var39.field1182, method11());
					var39.method456(0, 0);
					QEHNWGKD var40 = new QEHNWGKD(var6, "backright2", 0);
					field358 = new MEXICRKY(var40.field1183, var40.field1182, method11());
					var40.method456(0, 0);
					QEHNWGKD var41 = new QEHNWGKD(var6, "backtop1", 0);
					field359 = new MEXICRKY(var41.field1183, var41.field1182, method11());
					var41.method456(0, 0);
					QEHNWGKD var42 = new QEHNWGKD(var6, "backvmid1", 0);
					field360 = new MEXICRKY(var42.field1183, var42.field1182, method11());
					var42.method456(0, 0);
					QEHNWGKD var43 = new QEHNWGKD(var6, "backvmid2", 0);
					field361 = new MEXICRKY(var43.field1183, var43.field1182, method11());
					var43.method456(0, 0);
					QEHNWGKD var44 = new QEHNWGKD(var6, "backvmid3", 0);
					field362 = new MEXICRKY(var44.field1183, var44.field1182, method11());
					var44.method456(0, 0);
					QEHNWGKD var45 = new QEHNWGKD(var6, "backhmid2", 0);
					field363 = new MEXICRKY(var45.field1183, var45.field1182, method11());
					var45.method456(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field207[var50] != null) {
							field207[var50].method454(var47 + var49, var46 + var49, var48 + var49);
						}

						if (field120[var50] != null) {
							field120[var50].method19(var47 + var49, var46 + var49, var48 + var49);
						}
					}

					method13(83, "Unpacking textures");
					UNBQQGBL.method502(var7);
					UNBQQGBL.method506(0.8D);
					UNBQQGBL.method501(20);
					method13(86, "Unpacking config");
					QBINVEVU.method450(var4);
					MIQWCPVG.method370(var4);
					EIBTXPJE.method187(var4);
					RSPHUXRT.method466(var4);
					PFWIJTDA.method438(var4);
					PQTOFCBD.method444(var4);
					OPHZBIVR.method433(var4);
					GQDAZHGX.method213(var4);
					NPQMEWIH.method425(var4);
					RSPHUXRT.field1239 = field332;

					if (!field333) {
						method13(90, "Unpacking sounds");
						byte[] var51 = var9.method431("sounds.dat", null);
						MNKDCXXG var52 = new MNKDCXXG(var51);
						CQXSYOPM.method171(var52);
					}

					method13(95, "Unpacking interfaces");
					XZMPLIVN[] var53 = new XZMPLIVN[] { field478, field479, field480, field481 };
					IJOSTBQT.method274(var53, var5, var6);
					method13(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field173.field46[field173.field48 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field323[var54] = var55;
						field274[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field173.field46[field173.field48 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field198[var58 - 5] = var59 - 25;
						field162[var58 - 5] = var60 - var59;
					}

					UNBQQGBL.method499(765, 503);
					field167 = UNBQQGBL.field1270;
					UNBQQGBL.method499(479, 96);
					field164 = UNBQQGBL.field1270;
					UNBQQGBL.method499(190, 261);
					field165 = UNBQQGBL.field1270;
					UNBQQGBL.method499(512, 334);
					field166 = UNBQQGBL.field1270;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = UNBQQGBL.field1268[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					HFSXIPFN.method252(var62, 334, 500, 800, 512);
					LJNJPDAK.method318(var8);
					field392 = new OIFRHCSO(this);
					method12(field392, 10);
					YSSTKYXW.field1512 = this;
					MIQWCPVG.field1030 = this;
					PFWIJTDA.field1125 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field483 + " " + field281);
					field473 = true;
				}
			} else {
				field208 = true;
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method139() {
		while (true) {
			int var1 = method5();
			if (var1 == -1) {
				return;
			}

			if (field499 != -1 && field499 == field287) {
				if (var1 == 8 && field500.length() > 0) {
					field500 = field500.substring(0, field500.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field500.length() < 12) {
					field500 = field500 + (char) var1;
				}
			} else if (field489) {
				if (var1 >= 32 && var1 <= 122 && field496.length() < 80) {
					field496 = field496 + (char) var1;
					field303 = true;
				}

				if (var1 == 8 && field496.length() > 0) {
					field496 = field496.substring(0, field496.length() - 1);
					field303 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field489 = false;
					field303 = true;

					if (field257 == 1) {
						long var2 = UJXMBJLW.method491(field496);
						method76(var2);
					}

					if (field257 == 2 && field168 > 0) {
						long var4 = UJXMBJLW.method491(field496);
						method75(var4);
					}

					if (field257 == 3 && field496.length() > 0) {
						field411.method375(21);
						field411.method376(0);
						int var6 = field411.field1055;
						field411.method382(field209);
						YOLZIXCN.method601(field496, field411);
						field411.method385(field411.field1055 - var6);
						field496 = YOLZIXCN.method602(field496);
						field496 = LJNJPDAK.method328(field496);
						method121(field496, 6, UJXMBJLW.method495(UJXMBJLW.method492(field209)));

						if (field472 == 2) {
							field472 = 1;
							field204 = true;
							field411.method375(34);
							field411.method376(field157);
							field411.method376(field472);
							field411.method376(field110);
						}
					}

					if (field257 == 4 && field292 < 100) {
						long var7 = UJXMBJLW.method491(field496);
						method78(var7);
					}

					if (field257 == 5 && field292 > 0) {
						long var9 = UJXMBJLW.method491(field496);
						method96(var9);
					}
				}
			} else if (field135 == 1) {
				if (var1 >= 48 && var1 <= 57 && field65.length() < 10) {
					field65 = field65 + (char) var1;
					field303 = true;
				}

				if (var1 == 8 && field65.length() > 0) {
					field65 = field65.substring(0, field65.length() - 1);
					field303 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field65.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field65);
						} catch (Exception var21) {
						}

						field411.method375(227);
						field411.method380(var11);
					}

					field135 = 0;
					field303 = true;
				}
			} else if (field135 == 2) {
				if (var1 >= 32 && var1 <= 122 && field65.length() < 12) {
					field65 = field65 + (char) var1;
					field303 = true;
				}

				if (var1 == 8 && field65.length() > 0) {
					field65 = field65.substring(0, field65.length() - 1);
					field303 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field65.length() > 0) {
						field411.method375(99);
						field411.method382(UJXMBJLW.method491(field65));
					}

					field135 = 0;
					field303 = true;
				}
			} else if (field135 == 3) {
				if (var1 >= 32 && var1 <= 122 && field65.length() < 40) {
					field65 = field65 + (char) var1;
					field303 = true;
				}

				if (var1 == 8 && field65.length() > 0) {
					field65 = field65.substring(0, field65.length() - 1);
					field303 = true;
				}
			} else if (field305 == -1 && field416 == -1) {
				if (var1 >= 32 && var1 <= 122 && field109.length() < 80) {
					field109 = field109 + (char) var1;
					field303 = true;
				}

				if (var1 == 8 && field109.length() > 0) {
					field109 = field109.substring(0, field109.length() - 1);
					field303 = true;
				}

				if ((var1 == 13 || var1 == 10) && field109.length() > 0) {
					if (field115 == 2) {
						if (field109.equals("::clientdrop")) {
							method161();
						}

						if (field109.equals("::lag")) {
							method147();
						}

						if (field109.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field112.method531(2); var12++) {
								field112.method536(2, var12, (byte) 1);
							}
						}

						if (field109.equals("::fpson")) {
							field244 = true;
						}

						if (field109.equals("::fpsoff")) {
							field244 = false;
						}

						if (field109.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field498[var13].field572[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field109.startsWith("::")) {
						field411.method375(32);
						field411.method376(field109.length() - 1);
						field411.method383(field109.substring(2));
					} else {
						String var16 = field109.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field109 = field109.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field109 = field109.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field109 = field109.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field109 = field109.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field109 = field109.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field109 = field109.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field109 = field109.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field109 = field109.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field109 = field109.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field109 = field109.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field109 = field109.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field109 = field109.substring(6);
						}

						String var18 = field109.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field109 = field109.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field109 = field109.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field109 = field109.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field109 = field109.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field109 = field109.substring(6);
						}

						field411.method375(68);
						field411.method376(0);
						int var20 = field411.field1055;
						field411.method376(var17);
						field411.method402(var19);
						field341.field1055 = 0;
						YOLZIXCN.method601(field109, field341);
						field411.method384(0, field341.field1055, field341.field1054);
						field411.method385(field411.field1055 - var20);
						field109 = YOLZIXCN.method602(field109);
						field109 = LJNJPDAK.method328(field109);
						field218.field628 = field109;
						field218.field576 = var17;
						field218.field588 = var19;
						field218.field629 = 150;

						if (field115 == 2) {
							method121(field218.field628, 2, "@cr2@" + field218.field527);
						} else if (field115 == 1) {
							method121(field218.field628, 2, "@cr1@" + field218.field527);
						} else {
							method121(field218.field628, 2, field218.field527);
						}

						if (field157 == 2) {
							field157 = 3;
							field204 = true;
							field411.method375(34);
							field411.method376(field157);
							field411.method376(field472);
							field411.method376(field110);
						}
					}

					field109 = "";
					field303 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method140() {
		if (field114 != 0) {
			int var1 = 0;
			if (field197 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field129[var2] != null) {
					int var3 = field127[var2];
					String var4 = field128[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field472 == 0 || field472 == 1 && method30(var4))) {
						int var8 = 329 - var1 * 13;
						if (field29 > 4 && field30 - 4 > var8 - 10 && field30 - 4 <= var8 + 3) {
							int var9 = field479.method587("From:  " + var4 + field129[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field29 < var9 + 4) {
								if (field115 >= 1) {
									field64[field471] = "Report abuse @whi@" + var4;
									field221[field471] = 2989;
									field471++;
								}

								field64[field471] = "Add ignore @whi@" + var4;
								field221[field471] = 2405;
								field471++;
								field64[field471] = "Add friend @whi@" + var4;
								field221[field471] = 2009;
								field471++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field472 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method141() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.C(I)V")
	public final void method142() {
		if (field151 == null) {
			method115();
			field22 = null;
			field265 = null;
			field266 = null;
			field267 = null;
			field268 = null;
			field269 = null;
			field270 = null;
			field271 = null;
			field272 = null;
			field273 = null;
			field151 = new MEXICRKY(96, 479, method11());
			field149 = new MEXICRKY(156, 172, method11());
			UJSJLLWF.method482();
			field173.method20(0, 0);
			field148 = new MEXICRKY(261, 190, method11());
			field150 = new MEXICRKY(334, 512, method11());
			UJSJLLWF.method482();
			field386 = new MEXICRKY(50, 496, method11());
			field387 = new MEXICRKY(37, 269, method11());
			field388 = new MEXICRKY(45, 249, method11());
			field325 = true;
			field150.method360();
			UNBQQGBL.field1270 = field166;
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method143() {
		if (field35 == 1) {
			if (field36 >= 539 && field36 <= 573 && field37 >= 169 && field37 < 205 && field239[0] != -1) {
				field230 = true;
				field232 = 0;
				field63 = true;
			}

			if (field36 >= 569 && field36 <= 599 && field37 >= 168 && field37 < 205 && field239[1] != -1) {
				field230 = true;
				field232 = 1;
				field63 = true;
			}

			if (field36 >= 597 && field36 <= 627 && field37 >= 168 && field37 < 205 && field239[2] != -1) {
				field230 = true;
				field232 = 2;
				field63 = true;
			}

			if (field36 >= 625 && field36 <= 669 && field37 >= 168 && field37 < 203 && field239[3] != -1) {
				field230 = true;
				field232 = 3;
				field63 = true;
			}

			if (field36 >= 666 && field36 <= 696 && field37 >= 168 && field37 < 205 && field239[4] != -1) {
				field230 = true;
				field232 = 4;
				field63 = true;
			}

			if (field36 >= 694 && field36 <= 724 && field37 >= 168 && field37 < 205 && field239[5] != -1) {
				field230 = true;
				field232 = 5;
				field63 = true;
			}

			if (field36 >= 722 && field36 <= 756 && field37 >= 169 && field37 < 205 && field239[6] != -1) {
				field230 = true;
				field232 = 6;
				field63 = true;
			}

			if (field36 >= 540 && field36 <= 574 && field37 >= 466 && field37 < 502 && field239[7] != -1) {
				field230 = true;
				field232 = 7;
				field63 = true;
			}

			if (field36 >= 572 && field36 <= 602 && field37 >= 466 && field37 < 503 && field239[8] != -1) {
				field230 = true;
				field232 = 8;
				field63 = true;
			}

			if (field36 >= 599 && field36 <= 629 && field37 >= 466 && field37 < 503 && field239[9] != -1) {
				field230 = true;
				field232 = 9;
				field63 = true;
			}

			if (field36 >= 627 && field36 <= 671 && field37 >= 467 && field37 < 502 && field239[10] != -1) {
				field230 = true;
				field232 = 10;
				field63 = true;
			}

			if (field36 >= 669 && field36 <= 699 && field37 >= 466 && field37 < 503 && field239[11] != -1) {
				field230 = true;
				field232 = 11;
				field63 = true;
			}

			if (field36 >= 696 && field36 <= 726 && field37 >= 466 && field37 < 503 && field239[12] != -1) {
				field230 = true;
				field232 = 12;
				field63 = true;
			}

			if (field36 >= 724 && field36 <= 758 && field37 >= 466 && field37 < 502 && field239[13] != -1) {
				field230 = true;
				field232 = 13;
				field63 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.g(II)Z")
	public final boolean method144(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field221[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 9) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method145() {
		if (field114 != 0) {
			XZMPLIVN var1 = field479;
			int var2 = 0;
			if (field197 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field129[var3] != null) {
					int var4 = field127[var3];
					String var5 = field128[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field472 == 0 || field472 == 1 && method30(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method589(0, "From", var8, var7);
						var1.method589(0xFFFF, "From", var8, var7 - 1);
						int var11 = var8 + var1.method587("From ");
						if (var6 == 1) {
							field442[0].method20(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field442[1].method20(var7 - 12, var11);
							var11 += 14;
						}

						var1.method589(0, var5 + ": " + field129[var3], var11, var7);
						var1.method589(0xFFFF, var5 + ": " + field129[var3], var11, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field472 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method589(0, field129[var3], 4, var9);
						var1.method589(0xFFFF, field129[var3], 4, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field472 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method589(0, "To " + var5 + ": " + field129[var3], 4, var10);
						var1.method589(0xFFFF, "To " + var5 + ": " + field129[var3], 4, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method146() {
		field149.method360();

		if (field477 == 2) {
			byte[] var1 = field173.field46;
			int[] var2 = UJSJLLWF.field1248;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field155.method462(33, 25, 25, 256, 0, field323, field454, field274, 33, 0);
			field150.method360();
			UNBQQGBL.field1270 = field166;
		} else {
			int var5 = field454 + field170 & 0x7FF;
			int var6 = field218.field615 / 32 + 48;
			int var7 = 464 - field218.field616 / 32;
			field385.method462(146, var6, var7, field394 + 256, 5, field198, var5, field162, 151, 25);
			field155.method462(33, 25, 25, 256, 0, field323, field454, field274, 33, 0);

			for (int var8 = 0; var8 < field368; var8++) {
				int var9 = field369[var8] * 4 + 2 - field218.field615 / 32;
				int var10 = field370[var8] * 4 + 2 - field218.field616 / 32;
				method151(var9, field77[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					WOVRPCGT var13 = field100[field404][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field218.field615 / 32;
						int var15 = var12 * 4 + 2 - field218.field616 / 32;
						method151(var14, field429, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field343; var16++) {
				YQBVAFEO var17 = field342[field344[var16]];
				if (var17 != null && var17.method166()) {
					PFWIJTDA var18 = var17.field1501;
					if (var18.field1128 != null) {
						var18 = var18.method437();
					}

					if (var18 != null && var18.field1131 && var18.field1127) {
						int var19 = var17.field615 / 32 - field218.field615 / 32;
						int var20 = var17.field616 / 32 - field218.field616 / 32;
						method151(var19, field430, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field251; var21++) {
				CQCDOTXO var22 = field250[field252[var21]];
				if (var22 != null && var22.method166()) {
					int var23 = var22.field615 / 32 - field218.field615 / 32;
					int var24 = var22.field616 / 32 - field218.field616 / 32;
					boolean var25 = false;
					long var26 = UJXMBJLW.method491(var22.field527);
					for (int var28 = 0; var28 < field168; var28++) {
						if (field123[var28] == var26 && field353[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field218.field513 != 0 && var22.field513 != 0 && field218.field513 == var22.field513) {
						var29 = true;
					}

					if (var25) {
						method151(var23, field432, var24);
					} else if (var29) {
						method151(var23, field433, var24);
					} else {
						method151(var23, field431, var24);
					}
				}
			}

			if (field106 != 0 && field476 % 20 < 10) {
				if (field106 == 1 && field66 >= 0 && field66 < field342.length) {
					YQBVAFEO var30 = field342[field66];
					if (var30 != null) {
						int var31 = var30.field615 / 32 - field218.field615 / 32;
						int var32 = var30.field616 / 32 - field218.field616 / 32;
						method107(field374, var32, var31);
					}
				}

				if (field106 == 2) {
					int var33 = (field101 - field309) * 4 + 2 - field218.field615 / 32;
					int var34 = (field102 - field310) * 4 + 2 - field218.field616 / 32;
					method107(field374, var34, var33);
				}

				if (field106 == 10 && field107 >= 0 && field107 < field250.length) {
					CQCDOTXO var35 = field250[field107];
					if (var35 != null) {
						int var36 = var35.field615 / 32 - field218.field615 / 32;
						int var37 = var35.field616 / 32 - field218.field616 / 32;
						method107(field374, var37, var36);
					}
				}
			}

			if (field383 != 0) {
				int var38 = field383 * 4 + 2 - field218.field615 / 32;
				int var39 = field384 * 4 + 2 - field218.field616 / 32;
				method151(var38, field373, var39);
			}

			UJSJLLWF.method484(0xFFFFFF, 97, 78, 3, 3);
			field150.method360();
			UNBQQGBL.field1270 = field166;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public void method147() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field261);

		if (field112 != null) {
			System.out.println("Od-cycle:" + field112.field1298);
		}

		System.out.println("loop-cycle:" + field476);
		System.out.println("draw-cycle:" + field79);
		System.out.println("ptype:" + field298);
		System.out.println("psize:" + field297);

		if (field238 != null) {
			field238.method561();
		}

		field18 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field24 != null) {
			return field24;
		}

		return this;
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method148(int arg0) {
		if (arg0 >= 0) {
			int var2 = field219[arg0];
			int var3 = field220[arg0];
			int var4 = field221[arg0];
			int var5 = field222[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field135 != 0 && var4 != 1086) {
				field135 = 0;
				field303 = true;
			}

			if (var4 == 503) {
				String var6 = field64[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					long var8 = UJXMBJLW.method491(var6.substring(var7 + 5).trim());
					int var10 = -1;
					for (int var11 = 0; var11 < field168; var11++) {
						if (field123[var11] == var8) {
							var10 = var11;
							break;
						}
					}

					if (var10 != -1 && field353[var10] > 0) {
						field303 = true;
						field135 = 0;
						field489 = true;
						field496 = "";
						field257 = 3;
						field209 = field123[var10];
						field470 = "Enter message to send to " + field69[var10];
					}
				}
			}

			if (var4 == 230 && method152(var3, var5, var2)) {
				field411.method375(29);
				field411.method410(field283);
				field411.method377(field310 + var3);
				field411.method410(var5 >> 14 & 0x7FFF);
				field411.method412(field285);
				field411.method410(field309 + var2);
				field411.method377(field284);
			}

			if (var4 == 1253) {
				RSPHUXRT var12 = RSPHUXRT.method475(var5);
				String var13;
				if (var12.field1218 == null) {
					var13 = "It's a " + var12.field1229 + ".";
				} else {
					var13 = new String(var12.field1218);
				}

				method121(var13, 0, "");
			}

			if (var4 == 85) {
				YQBVAFEO var14 = field342[var5];
				if (var14 != null) {
					method112(1, field218.field590[0], 1, field218.field591[0], var14.field590[0], 0, 2, var14.field591[0], 0, 0, false);
					field191 = field36;
					field192 = field37;
					field194 = 2;
					field193 = 0;
					field411.method375(6);
					field411.method377(field348);
					field411.method412(var5);
				}
			}

			if (var4 == 42) {
				boolean var15 = method112(0, field218.field590[0], 0, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
				if (!var15) {
					method112(1, field218.field590[0], 1, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
				}

				field191 = field36;
				field192 = field37;
				field194 = 2;
				field193 = 0;
				field413 += var3;
				if (field413 >= 120) {
					field411.method375(83);
					field413 = 0;
				}

				field411.method375(125);
				field411.method411(field309 + var2);
				field411.method410(var5);
				field411.method412(field310 + var3);
			}

			if (var4 == 271) {
				boolean var17 = method112(0, field218.field590[0], 0, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
				if (!var17) {
					method112(1, field218.field590[0], 1, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
				}

				field191 = field36;
				field192 = field37;
				field194 = 2;
				field193 = 0;
				field411.method375(134);
				field411.method377(var5);
				field411.method411(field283);
				field411.method412(field309 + var2);
				field411.method411(field284);
				field411.method410(field285);
				field411.method377(field310 + var3);
			}

			if (var4 == 217) {
				CQCDOTXO var19 = field250[var5];
				if (var19 != null) {
					method112(1, field218.field590[0], 1, field218.field591[0], var19.field590[0], 0, 2, var19.field591[0], 0, 0, false);
					field191 = field36;
					field192 = field37;
					field194 = 2;
					field193 = 0;
					field212 += var5;
					if (field212 >= 143) {
						field411.method375(1);
						field212 = 0;
					}

					field411.method375(234);
					field411.method410(var5);
				}
			}

			if (var4 == 781) {
				IJOSTBQT var20 = IJOSTBQT.method276(var3);
				boolean var21 = true;
				if (var20.field849 > 0) {
					var21 = method48(var20);
				}

				if (var21) {
					field411.method375(252);
					field411.method377(var3);
				}
			}

			if (var4 == 257) {
				field411.method375(155);
				field411.method411(var2);
				field411.method412(var3);
				field411.method377(var5);
				field447 = 0;
				field448 = var3;
				field449 = var2;
				field450 = 2;
				if (IJOSTBQT.method276(var3).field871 == field499) {
					field450 = 1;
				}

				if (IJOSTBQT.method276(var3).field871 == field305) {
					field450 = 3;
				}
			}

			if (var4 == 198 && !field466) {
				field411.method375(154);
				field411.method377(var3);
				field466 = true;
			}

			if (var4 == 734) {
				field411.method375(128);
				field411.method410(var2);
				field411.method377(var3);
				field411.method410(var5);
				field447 = 0;
				field448 = var3;
				field449 = var2;
				field450 = 2;
				if (IJOSTBQT.method276(var3).field871 == field499) {
					field450 = 1;
				}

				if (IJOSTBQT.method276(var3).field871 == field305) {
					field450 = 3;
				}
			}

			if (var4 == 204) {
				method152(var3, var5, var2);
				field411.method375(62);
				field411.method377(var5 >> 14 & 0x7FFF);
				field411.method412(field309 + var2);
				field411.method377(field310 + var3);
			}

			if (var4 == 642) {
				YQBVAFEO var22 = field342[var5];
				if (var22 != null) {
					method112(1, field218.field590[0], 1, field218.field591[0], var22.field590[0], 0, 2, var22.field591[0], 0, 0, false);
					field191 = field36;
					field192 = field37;
					field194 = 2;
					field193 = 0;
					field242 += var5;
					if (field242 >= 149) {
						field411.method375(89);
						field411.method380(0);
						field242 = 0;
					}

					field411.method375(162);
					field411.method412(var5);
				}
			}

			if (var4 == 386 || var4 == 679) {
				String var23 = field64[arg0];
				int var24 = var23.indexOf("@whi@");
				if (var24 != -1) {
					var23 = var23.substring(var24 + 5).trim();
					String var25 = UJXMBJLW.method495(UJXMBJLW.method492(UJXMBJLW.method491(var23)));
					boolean var26 = false;
					for (int var27 = 0; var27 < field251; var27++) {
						CQCDOTXO var28 = field250[field252[var27]];
						if (var28 != null && var28.field527 != null && var28.field527.equalsIgnoreCase(var25)) {
							method112(1, field218.field590[0], 1, field218.field591[0], var28.field590[0], 0, 2, var28.field591[0], 0, 0, false);

							if (var4 == 386) {
								field411.method375(119);
								field411.method412(field252[var27]);
							}

							if (var4 == 679) {
								field411.method375(151);
								field411.method411(field252[var27]);
							}

							var26 = true;
							break;
						}
					}

					if (!var26) {
						method121("Unable to find " + var25, 0, "");
					}
				}
			}

			if (var4 == 641) {
				field160 += var2;
				if (field160 >= 118) {
					field411.method375(90);
					field411.method376(4);
					field160 = 0;
				}

				method152(var3, var5, var2);
				field411.method375(194);
				field411.method377(field310 + var3);
				field411.method411(var5 >> 14 & 0x7FFF);
				field411.method412(field309 + var2);
			}

			if (var4 == 783) {
				CQCDOTXO var29 = field250[var5];
				if (var29 != null) {
					method112(1, field218.field590[0], 1, field218.field591[0], var29.field590[0], 0, 2, var29.field591[0], 0, 0, false);
					field191 = field36;
					field192 = field37;
					field194 = 2;
					field193 = 0;
					field411.method375(120);
					field411.method411(field284);
					field411.method377(field283);
					field411.method410(var5);
					field411.method412(field285);
				}
			}

			if (var4 == 108) {
				field282 = 1;
				field283 = var2;
				field284 = var3;
				field285 = var5;
				field286 = String.valueOf(RSPHUXRT.method475(var5).field1229);
				field347 = 0;
				field230 = true;
			} else {
				if (var4 == 858) {
					field411.method375(8);
					field411.method377(field283);
					field411.method377(var3);
					field411.method411(field285);
					field411.method410(var2);
					field411.method377(field284);
					field411.method411(var5);
					field447 = 0;
					field448 = var3;
					field449 = var2;
					field450 = 2;
					if (IJOSTBQT.method276(var3).field871 == field499) {
						field450 = 1;
					}

					if (IJOSTBQT.method276(var3).field871 == field305) {
						field450 = 3;
					}
				}

				if (var4 == 540) {
					YQBVAFEO var30 = field342[var5];
					if (var30 != null) {
						method112(1, field218.field590[0], 1, field218.field591[0], var30.field590[0], 0, 2, var30.field591[0], 0, 0, false);
						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field411.method375(65);
						field411.method377(field283);
						field411.method410(var5);
						field411.method410(field285);
						field411.method377(field284);
					}
				}

				if (var4 == 252) {
					method52();
				}

				if (var4 == 181) {
					if ((var3 & 0x3) == 0) {
						field396++;
					}

					if (field396 >= 80) {
						field411.method375(143);
						field396 = 0;
					}

					method152(var3, var5, var2);
					field411.method375(61);
					field411.method377(field310 + var3);
					field411.method410(var5 >> 14 & 0x7FFF);
					field411.method411(field309 + var2);
				}

				if (var4 == 172) {
					boolean var31 = method112(0, field218.field590[0], 0, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
					if (!var31) {
						method112(1, field218.field590[0], 1, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
					}

					field191 = field36;
					field192 = field37;
					field194 = 2;
					field193 = 0;
					field411.method375(103);
					field411.method410(field310 + var3);
					field411.method411(var5);
					field411.method377(field309 + var2);
				}

				if (var4 == 1927) {
					int var33 = var5 >> 14 & 0x7FFF;
					MIQWCPVG var34 = MIQWCPVG.method363(var33);
					String var35;
					if (var34.field1043 == null) {
						var35 = "It's a " + var34.field1024 + ".";
					} else {
						var35 = new String(var34.field1043);
					}

					method121(var35, 0, "");
				}

				if (var4 == 957) {
					if (field354) {
						field184.method254(var2 - 4, var3 - 4);
					} else {
						field184.method254(field36 - 4, field37 - 4);
					}
				}

				if (var4 == 720) {
					method50(field441);
					field441 = -1;
					field303 = true;
				}

				if (var4 == 1129) {
					method152(var3, var5, var2);
					field411.method375(85);
					field411.method410(field309 + var2);
					field411.method412(field310 + var3);
					field411.method411(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 148) {
					YQBVAFEO var36 = field342[var5];
					if (var36 != null) {
						method112(1, field218.field590[0], 1, field218.field591[0], var36.field590[0], 0, 2, var36.field591[0], 0, 0, false);
						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field411.method375(255);
						field411.method410(var5);
					}
				}

				if (var4 == 197) {
					CQCDOTXO var37 = field250[var5];
					if (var37 != null) {
						method112(1, field218.field590[0], 1, field218.field591[0], var37.field590[0], 0, 2, var37.field591[0], 0, 0, false);
						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field411.method375(151);
						field411.method411(var5);
					}
				}

				if (var4 == 974) {
					field411.method375(192);
					field411.method410(var5);
					field411.method411(var2);
					field411.method411(var3);
					field447 = 0;
					field448 = var3;
					field449 = var2;
					field450 = 2;
					if (IJOSTBQT.method276(var3).field871 == field499) {
						field450 = 1;
					}

					if (IJOSTBQT.method276(var3).field871 == field305) {
						field450 = 3;
					}
				}

				if (var4 == 989) {
					String var38 = field64[arg0];
					int var39 = var38.indexOf("@whi@");
					if (var39 != -1) {
						if (field499 == -1) {
							method52();
							field500 = var38.substring(var39 + 5).trim();
							field335 = false;
							field287 = field499 = IJOSTBQT.field852;
						} else {
							method121("Please close the interface you have open before using 'report abuse'", 0, "");
						}
					}
				}

				if (var4 == 309) {
					CQCDOTXO var40 = field250[var5];
					if (var40 != null) {
						method112(1, field218.field590[0], 1, field218.field591[0], var40.field590[0], 0, 2, var40.field591[0], 0, 0, false);
						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field411.method375(132);
						field411.method410(var5);
					}
				}

				if (var4 == 462) {
					YQBVAFEO var41 = field342[var5];
					if (var41 != null) {
						method112(1, field218.field590[0], 1, field218.field591[0], var41.field590[0], 0, 2, var41.field591[0], 0, 0, false);
						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field411.method375(22);
						field411.method410(var5);
					}
				}

				if (var4 == 758) {
					IJOSTBQT var42 = IJOSTBQT.method276(var3);
					field347 = 1;
					field348 = var3;
					field349 = var42.field854;
					field282 = 0;
					field230 = true;
					String var43 = var42.field870;
					if (var43.indexOf(" ") != -1) {
						var43 = var43.substring(0, var43.indexOf(" "));
					}

					String var44 = var42.field870;
					if (var44.indexOf(" ") != -1) {
						var44 = var44.substring(var44.indexOf(" ") + 1);
					}

					field350 = var43 + " " + var42.field861 + " " + var44;

					if (field349 == 16) {
						field230 = true;
						field232 = 3;
						field63 = true;
					}
				} else {
					if (var4 == 627) {
						field411.method375(222);
						field411.method411(var5);
						field411.method377(var2);
						field411.method377(var3);
						field447 = 0;
						field448 = var3;
						field449 = var2;
						field450 = 2;
						if (IJOSTBQT.method276(var3).field871 == field499) {
							field450 = 1;
						}

						if (IJOSTBQT.method276(var3).field871 == field305) {
							field450 = 3;
						}
					}

					if (var4 == 304) {
						field411.method375(204);
						field411.method412(var3);
						field411.method412(var5);
						field411.method377(var2);
						field447 = 0;
						field448 = var3;
						field449 = var2;
						field450 = 2;
						if (IJOSTBQT.method276(var3).field871 == field499) {
							field450 = 1;
						}

						if (IJOSTBQT.method276(var3).field871 == field305) {
							field450 = 3;
						}
					}

					if (var4 == 459) {
						field153 += var2;
						if (field153 >= 85) {
							field411.method375(247);
							field411.method380(0);
							field153 = 0;
						}

						field411.method375(16);
						field411.method412(var5);
						field411.method412(var3);
						field411.method412(var2);
						field447 = 0;
						field448 = var3;
						field449 = var2;
						field450 = 2;
						if (IJOSTBQT.method276(var3).field871 == field499) {
							field450 = 1;
						}

						if (IJOSTBQT.method276(var3).field871 == field305) {
							field450 = 3;
						}
					}

					if (var4 == 602) {
						boolean var45 = method112(0, field218.field590[0], 0, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
						if (!var45) {
							method112(1, field218.field590[0], 1, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
						}

						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field411.method375(78);
						field411.method377(var5);
						field411.method410(field348);
						field411.method377(field309 + var2);
						field411.method410(field310 + var3);
					}

					if (var4 == 493) {
						boolean var47 = method112(0, field218.field590[0], 0, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
						if (!var47) {
							method112(1, field218.field590[0], 1, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
						}

						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field411.method375(42);
						field411.method410(field310 + var3);
						field411.method411(field309 + var2);
						field411.method411(var5);
					}

					if (var4 == 1194) {
						RSPHUXRT var49 = RSPHUXRT.method475(var5);
						IJOSTBQT var50 = IJOSTBQT.method276(var3);
						String var51;
						if (var50 != null && var50.field817[var2] >= 100000) {
							var51 = var50.field817[var2] + " x " + var49.field1229;
						} else if (var49.field1218 == null) {
							var51 = "It's a " + var49.field1229 + ".";
						} else {
							var51 = new String(var49.field1218);
						}

						method121(var51, 0, "");
					}

					if (var4 == 929) {
						method152(var3, var5, var2);
						field411.method375(112);
						field411.method411(field310 + var3);
						field411.method377(field309 + var2);
						field411.method411(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 370 && method152(var3, var5, var2)) {
						field411.method375(146);
						field411.method412(field348);
						field411.method377(field310 + var3);
						field411.method412(field309 + var2);
						field411.method377(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 848) {
						YQBVAFEO var52 = field342[var5];
						if (var52 != null) {
							method112(1, field218.field590[0], 1, field218.field591[0], var52.field590[0], 0, 2, var52.field591[0], 0, 0, false);
							field191 = field36;
							field192 = field37;
							field194 = 2;
							field193 = 0;
							field411.method375(239);
							field411.method410(var5);
						}
					}

					if (var4 == 524) {
						field411.method375(174);
						field411.method377(var5);
						field411.method410(var2);
						field411.method410(var3);
						field447 = 0;
						field448 = var3;
						field449 = var2;
						field450 = 2;
						if (IJOSTBQT.method276(var3).field871 == field499) {
							field450 = 1;
						}

						if (IJOSTBQT.method276(var3).field871 == field305) {
							field450 = 3;
						}
					}

					if (var4 == 380) {
						field411.method375(30);
						field411.method412(var2);
						field411.method410(var5);
						field411.method411(var3);
						field447 = 0;
						field448 = var3;
						field449 = var2;
						field450 = 2;
						if (IJOSTBQT.method276(var3).field871 == field499) {
							field450 = 1;
						}

						if (IJOSTBQT.method276(var3).field871 == field305) {
							field450 = 3;
						}
					}

					if (var4 == 392) {
						field411.method375(252);
						field411.method377(var3);
						IJOSTBQT var53 = IJOSTBQT.method276(var3);
						if (var53.field823 != null && var53.field823[0][0] == 5) {
							int var54 = var53.field823[0][1];
							field439[var54] = 1 - field439[var54];
							method137(var54);
							field230 = true;
						}
					}

					if (var4 == 569) {
						field411.method375(252);
						field411.method377(var3);
						IJOSTBQT var55 = IJOSTBQT.method276(var3);
						if (var55.field823 != null && var55.field823[0][0] == 5) {
							int var56 = var55.field823[0][1];
							if (field439[var56] != var55.field808[0]) {
								field439[var56] = var55.field808[0];
								method137(var56);
								field230 = true;
							}
						}
					}

					if (var4 == 1657) {
						YQBVAFEO var57 = field342[var5];
						if (var57 != null) {
							PFWIJTDA var58 = var57.field1501;
							if (var58.field1128 != null) {
								var58 = var58.method437();
							}

							if (var58 != null) {
								String var59;
								if (var58.field1140 == null) {
									var59 = "It's a " + var58.field1150 + ".";
								} else {
									var59 = new String(var58.field1140);
								}

								method121(var59, 0, "");
							}
						}
					}

					if (var4 == 518) {
						field411.method375(136);
						field411.method411(var3);
						field411.method411(var2);
						field411.method377(var5);
						field447 = 0;
						field448 = var3;
						field449 = var2;
						field450 = 2;
						if (IJOSTBQT.method276(var3).field871 == field499) {
							field450 = 1;
						}

						if (IJOSTBQT.method276(var3).field871 == field305) {
							field450 = 3;
						}
					}

					if (var4 == 2) {
						CQCDOTXO var60 = field250[var5];
						if (var60 != null) {
							method112(1, field218.field590[0], 1, field218.field591[0], var60.field590[0], 0, 2, var60.field591[0], 0, 0, false);
							field191 = field36;
							field192 = field37;
							field194 = 2;
							field193 = 0;
							field223 += var5;
							if (field223 >= 141) {
								field411.method375(152);
								field411.method379(0x8E29D8);
								field223 = 0;
							}

							field411.method375(184);
							field411.method411(var5);
						}
					}

					if (var4 == 418) {
						YQBVAFEO var61 = field342[var5];
						if (var61 != null) {
							method112(1, field218.field590[0], 1, field218.field591[0], var61.field590[0], 0, 2, var61.field591[0], 0, 0, false);
							field191 = field36;
							field192 = field37;
							field194 = 2;
							field193 = 0;
							field411.method375(44);
							field411.method377(var5);
						}
					}

					if (var4 == 308) {
						field411.method375(173);
						field411.method412(field348);
						field411.method377(var5);
						field411.method411(var2);
						field411.method411(var3);
						field447 = 0;
						field448 = var3;
						field449 = var2;
						field450 = 2;
						if (IJOSTBQT.method276(var3).field871 == field499) {
							field450 = 1;
						}

						if (IJOSTBQT.method276(var3).field871 == field305) {
							field450 = 3;
						}
					}

					if (var4 == 852) {
						boolean var62 = method112(0, field218.field590[0], 0, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
						if (!var62) {
							method112(1, field218.field590[0], 1, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
						}

						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field409++;
						if (field409 >= 112) {
							field411.method375(74);
							field411.method380(0);
							field409 = 0;
						}

						field411.method375(23);
						field411.method410(var5);
						field411.method412(field310 + var3);
						field411.method410(field309 + var2);
					}

					if (var4 == 471) {
						CQCDOTXO var64 = field250[var5];
						if (var64 != null) {
							method112(1, field218.field590[0], 1, field218.field591[0], var64.field590[0], 0, 2, var64.field591[0], 0, 0, false);
							field191 = field36;
							field192 = field37;
							field194 = 2;
							field193 = 0;
							field411.method375(119);
							field411.method412(var5);
						}
					}

					if (var4 == 9 || var4 == 405 || var4 == 953 || var4 == 305) {
						String var65 = field64[arg0];
						int var66 = var65.indexOf("@whi@");
						if (var66 != -1) {
							long var67 = UJXMBJLW.method491(var65.substring(var66 + 5).trim());
							if (var4 == 9) {
								method76(var67);
							}

							if (var4 == 405) {
								method78(var67);
							}

							if (var4 == 953) {
								method75(var67);
							}

							if (var4 == 305) {
								method96(var67);
							}
						}
					}

					if (var4 == 239) {
						field411.method375(215);
						field411.method410(var5);
						field411.method410(var3);
						field411.method410(var2);
						field447 = 0;
						field448 = var3;
						field449 = var2;
						field450 = 2;
						if (IJOSTBQT.method276(var3).field871 == field499) {
							field450 = 1;
						}

						if (IJOSTBQT.method276(var3).field871 == field305) {
							field450 = 3;
						}
					}

					if (var4 == 359) {
						CQCDOTXO var69 = field250[var5];
						if (var69 != null) {
							method112(1, field218.field590[0], 1, field218.field591[0], var69.field590[0], 0, 2, var69.field591[0], 0, 0, false);
							field191 = field36;
							field192 = field37;
							field194 = 2;
							field193 = 0;
							field411.method375(228);
							field411.method377(field348);
							field411.method411(var5);
						}
					}

					if (var4 == 895) {
						boolean var70 = method112(0, field218.field590[0], 0, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
						if (!var70) {
							method112(1, field218.field590[0], 1, field218.field591[0], var2, 0, 2, var3, 0, 0, false);
						}

						field191 = field36;
						field192 = field37;
						field194 = 2;
						field193 = 0;
						field410 += field310;
						if (field410 >= 124) {
							field411.method375(212);
							field411.method376(253);
							field410 = 0;
						}

						field411.method375(59);
						field411.method377(field309 + var2);
						field411.method377(var5);
						field411.method412(field310 + var3);
					}

					field282 = 0;
					field347 = 0;
					field230 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method149() {
		field259++;
		method54(true);
		method59(true);
		method54(false);
		method59(false);
		method88();
		method130();

		if (!field82) {
			int var1 = field453;
			if (field275 / 256 > var1) {
				var1 = field275 / 256;
			}

			if (field422[4] && field506[4] + 128 > var1) {
				var1 = field506[4] + 128;
			}

			int var2 = field454 + field451 & 0x7FF;
			method51(method153(field218.field616, field218.field615, field404) - 50, var1, var2, field86, var1 * 3 + 600, field87);
		}

		int var3;
		if (field82) {
			var3 = method99();
		} else {
			var3 = method98();
		}

		int var4 = field423;
		int var5 = field424;
		int var6 = field425;
		int var7 = field426;
		int var8 = field427;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field422[var9]) {
				int var10 = (int) (Math.random() * (field80[var9] * 2 + 1) + Math.sin(field132[var9] / 100.0D * field154[var9]) * field506[var9] - field80[var9]);
				if (var9 == 0) {
					field423 += var10;
				}

				if (var9 == 1) {
					field424 += var10;
				}

				if (var9 == 2) {
					field425 += var10;
				}

				if (var9 == 3) {
					field427 = field427 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field426 += var10;
					if (field426 < 128) {
						field426 = 128;
					}

					if (field426 > 383) {
						field426 = 383;
					}
				}
			}
		}

		int var11 = UNBQQGBL.field1279;
		IRLTEWJP.field936 = true;
		IRLTEWJP.field939 = 0;
		IRLTEWJP.field937 = field29 - 4;
		IRLTEWJP.field938 = field30 - 4;
		UJSJLLWF.method482();
		field184.method255(field424, field427, field425, field423, var3, field426);
		field184.method230();
		method95();
		method66();
		method163(var11);
		method77();
		field150.method361(field21, 4, 4);
		field423 = var4;
		field424 = var5;
		field425 = var6;
		field426 = var7;
		field427 = var8;
	}

	@ObfuscatedName("client.n(B)V")
	public final void method150() {
		if (field265 == null) {
			field22 = null;
			field151 = null;
			field149 = null;
			field148 = null;
			field150 = null;
			field386 = null;
			field387 = null;
			field388 = null;
			field268 = new MEXICRKY(265, 128, method11());
			UJSJLLWF.method482();
			field269 = new MEXICRKY(265, 128, method11());
			UJSJLLWF.method482();
			field265 = new MEXICRKY(171, 509, method11());
			UJSJLLWF.method482();
			field266 = new MEXICRKY(132, 360, method11());
			UJSJLLWF.method482();
			field267 = new MEXICRKY(200, 360, method11());
			UJSJLLWF.method482();
			field270 = new MEXICRKY(238, 202, method11());
			UJSJLLWF.method482();
			field271 = new MEXICRKY(238, 203, method11());
			UJSJLLWF.method482();
			field272 = new MEXICRKY(94, 74, method11());
			UJSJLLWF.method482();
			field273 = new MEXICRKY(94, 75, method11());
			UJSJLLWF.method482();

			if (field465 != null) {
				method111();
				method131();
			}

			field325 = true;
		}
	}

	@ObfuscatedName("client.a(ILQEHNWGKD;II)V")
	public final void method151(int arg0, QEHNWGKD arg1, int arg2) {
		if (arg1 != null) {
			int var4 = field454 + field170 & 0x7FF;
			int var5 = arg0 * arg0 + arg2 * arg2;
			if (var5 <= 6400) {
				int var6 = IRLTEWJP.field941[var4];
				int var7 = IRLTEWJP.field942[var4];
				var6 = var6 * 256 / (field394 + 256);
				var7 = var7 * 256 / (field394 + 256);
				int var8 = arg0 * var7 + arg2 * var6 >> 16;
				int var9 = arg2 * var7 - arg0 * var6 >> 16;
				if (var5 > 2500) {
					arg1.method464(field173, var8 + 94 + 4 - arg1.field1186 / 2, 83 - var9 - arg1.field1187 / 2 - 4);
				} else {
					arg1.method458(83 - var9 - arg1.field1187 / 2 - 4, var8 + 94 - arg1.field1186 / 2 + 4);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIZ)Z")
	public final boolean method152(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field184.method246(field404, arg2, arg0, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			MIQWCPVG var8 = MIQWCPVG.method363(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1017;
				var10 = var8.field1019;
			} else {
				var9 = var8.field1019;
				var10 = var8.field1017;
			}

			int var11 = var8.field1048;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method112(var9, field218.field590[0], var10, field218.field591[0], arg2, 0, 2, arg0, var11, 0, true);
		} else {
			method112(0, field218.field590[0], 0, field218.field591[0], arg2, var7, 2, arg0, 0, var6 + 1, true);
		}

		field191 = field36;
		field192 = field37;
		field194 = 2;
		field193 = 0;
		return true;
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method153(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field405[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field490[var6][var4][var5] + field490[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field490[var6][var4][var5 + 1] + field490[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(III)Z")
	public final boolean method154(int arg0, int arg1) {
		boolean var3 = false;
		IJOSTBQT var4 = IJOSTBQT.method276(arg1);
		for (int var5 = 0; var5 < var4.field843.length && var4.field843[var5] != -1; var5++) {
			IJOSTBQT var6 = IJOSTBQT.method276(var4.field843[var5]);
			if (var6.field855 == 0) {
				var3 |= method154(arg0, var6.field842);
			}

			if (var6.field855 == 6 && (var6.field837 != -1 || var6.field838 != -1)) {
				boolean var7 = method102(var6);
				int var8;
				if (var7) {
					var8 = var6.field838;
				} else {
					var8 = var6.field837;
				}

				if (var8 != -1) {
					QBINVEVU var9 = QBINVEVU.field1165[var8];
					var6.field825 += arg0;
					while (var6.field825 > var9.method451(var6.field833)) {
						var6.field825 -= var9.method451(var6.field833) + 1;
						var6.field833++;
						if (var6.field833 >= var9.field1166) {
							var6.field833 -= var9.field1170;
							if (var6.field833 < 0 || var6.field833 >= var9.field1166) {
								var6.field833 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field855 == 6 && var6.field816 != 0) {
				int var10 = var6.field816 >> 16;
				int var11 = var6.field816 << 16 >> 16;
				var10 = arg0 * var10;
				var11 = arg0 * var11;
				var6.field813 = var6.field813 + var10 & 0x7FF;
				var6.field814 = var6.field814 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method155(String arg0) throws IOException {
		if (field326) {
			if (field90 != null) {
				try {
					field90.close();
				} catch (Exception var4) {
				}

				field90 = null;
			}

			field90 = method29(43595);
			field90.setSoTimeout(10000);
			InputStream var2 = field90.getInputStream();
			OutputStream var3 = field90.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.G(I)V")
	public static final void method156() {
		HFSXIPFN.field729 = false;
		UNBQQGBL.field1259 = false;
		field333 = false;
		XTTZZRNP.field1426 = false;
		MIQWCPVG.field1051 = false;
	}

	@ObfuscatedName("client.o(B)V")
	public final void method157() {
		if (field35 == 1) {
			if (field36 >= 6 && field36 <= 106 && field37 >= 467 && field37 <= 499) {
				field157 = (field157 + 1) % 4;
				field204 = true;
				field303 = true;
				field411.method375(34);
				field411.method376(field157);
				field411.method376(field472);
				field411.method376(field110);
			}

			if (field36 >= 135 && field36 <= 235 && field37 >= 467 && field37 <= 499) {
				field472 = (field472 + 1) % 3;
				field204 = true;
				field303 = true;
				field411.method375(34);
				field411.method376(field157);
				field411.method376(field472);
				field411.method376(field110);
			}

			if (field36 >= 273 && field36 <= 373 && field37 >= 467 && field37 <= 499) {
				field110 = (field110 + 1) % 3;
				field204 = true;
				field303 = true;
				field411.method375(34);
				field411.method376(field157);
				field411.method376(field472);
				field411.method376(field110);
			}

			if (field36 >= 412 && field36 <= 512 && field37 >= 467 && field37 <= 499) {
				if (field499 == -1) {
					method52();
					field500 = "";
					field335 = false;
					field287 = field499 = IJOSTBQT.field852;
					return;
				}

				method121("Please close the interface you have open before using 'report abuse'", 0, "");
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LIJOSTBQT;I)V")
	public final void method158(IJOSTBQT arg0) {
		int var2 = arg0.field849;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field169 == 0) {
				arg0.field847 = "Loading friend list";
				arg0.field867 = 0;
			} else if (var2 == 1 && field169 == 1) {
				arg0.field847 = "Connecting to friendserver";
				arg0.field867 = 0;
			} else if (var2 == 2 && field169 != 2) {
				arg0.field847 = "Please wait...";
				arg0.field867 = 0;
			} else {
				int var3 = field168;
				if (field169 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field847 = "";
					arg0.field867 = 0;
				} else {
					arg0.field847 = field69[var2];
					arg0.field867 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field168;
			if (field169 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field847 = "";
				arg0.field867 = 0;
			} else {
				if (field353[var2] == 0) {
					arg0.field847 = "@red@Offline";
				} else if (field353[var2] < 200) {
					if (field353[var2] == field330) {
						arg0.field847 = "@gre@World" + (field353[var2] - 9);
					} else {
						arg0.field847 = "@yel@World" + (field353[var2] - 9);
					}
				} else if (field353[var2] == field330) {
					arg0.field847 = "@gre@Classic" + (field353[var2] - 219);
				} else {
					arg0.field847 = "@yel@Classic" + (field353[var2] - 219);
				}

				arg0.field867 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field168;
			if (field169 != 2) {
				var5 = 0;
			}

			arg0.field835 = var5 * 15 + 20;
			if (arg0.field835 <= arg0.field857) {
				arg0.field835 = arg0.field857 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field169 == 0) {
				arg0.field847 = "Loading ignore list";
				arg0.field867 = 0;
			} else if (var2 == 1 && field169 == 0) {
				arg0.field847 = "Please wait...";
				arg0.field867 = 0;
			} else {
				int var6 = field292;
				if (field169 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field847 = "";
					arg0.field867 = 0;
				} else {
					arg0.field847 = UJXMBJLW.method495(UJXMBJLW.method492(field458[var2]));
					arg0.field867 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field835 = field292 * 15 + 20;
			if (arg0.field835 <= arg0.field857) {
				arg0.field835 = arg0.field857 + 1;
			}
		} else if (var2 == 327) {
			arg0.field813 = 150;
			arg0.field814 = (int) (Math.sin(field476 / 40.0D) * 256.0D) & 0x7FF;

			if (field371) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field137[var7];
					if (var8 >= 0 && !PQTOFCBD.field1157[var8].method446()) {
						return;
					}
				}

				field371 = false;
				IRLTEWJP[] var9 = new IRLTEWJP[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field137[var11];
					if (var12 >= 0) {
						var9[var10++] = PQTOFCBD.field1157[var12].method447();
					}
				}

				IRLTEWJP var13 = new IRLTEWJP(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field163[var14] != 0) {
						var13.method295(field307[var14][0], field307[var14][field163[var14]]);

						if (var14 == 1) {
							var13.method295(field181[0], field181[field163[var14]]);
						}
					}
				}

				var13.method288();
				var13.method289(QBINVEVU.field1165[field218.field625].field1167[0]);
				var13.method298(64, 850, -30, -50, -30, true);
				arg0.field805 = 5;
				arg0.field806 = 0;
				IJOSTBQT.method270(5, 0, var13);
			}
		} else if (var2 == 324) {
			if (field182 == null) {
				field182 = arg0.field826;
				field183 = arg0.field811;
			}

			if (field111) {
				arg0.field826 = field183;
			} else {
				arg0.field826 = field182;
			}
		} else if (var2 == 325) {
			if (field182 == null) {
				field182 = arg0.field826;
				field183 = arg0.field811;
			}

			if (field111) {
				arg0.field826 = field182;
			} else {
				arg0.field826 = field183;
			}
		} else if (var2 == 600) {
			arg0.field847 = field500;
			if (field476 % 20 < 10) {
				arg0.field847 = arg0.field847 + "|";
			} else {
				arg0.field847 = arg0.field847 + " ";
			}
		} else if (var2 == 620) {
			if (field115 < 1) {
				arg0.field847 = "";
			} else if (field335) {
				arg0.field860 = 0xFF0000;
				arg0.field847 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field860 = 0xFFFFFF;
				arg0.field847 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field418 - field482;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field847 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field62 == 0) {
				arg0.field847 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field62 <= field418) {
				arg0.field847 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method159(field62);
			} else {
				int var17 = field418 + 14 - field62;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field847 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method159(field62) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field76 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field76 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field76 + " unread messages";
			}

			arg0.field847 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field443 > 0 && field443 <= field418 + 10) {
				arg0.field847 = "Last password change:\\n@gre@" + method159(field443);
			} else {
				arg0.field847 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field226 > 2 && !field332) {
				arg0.field847 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field226 > 2) {
				arg0.field847 = "\\n\\nYou have @gre@" + field226 + "@yel@ days of\\nmember credit remaining.";
			} else if (field226 > 0) {
				arg0.field847 = "You have @gre@" + field226 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field847 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field226 > 2 && !field332) {
				arg0.field847 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field226 > 0) {
				arg0.field847 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field847 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field62 > field418) {
				arg0.field847 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field847 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public final String method159(int arg0) {
		if (arg0 > field418 + 10) {
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

	@ObfuscatedName("client.r(Z)V")
	public final void method160() {
		while (true) {
			VLOPFRWW var1 = field112.method534();
			if (var1 == null) {
				return;
			}

			if (var1.field1353 == 0) {
				IRLTEWJP.method279(var1.field1351, var1.field1352);

				if ((field112.method525(var1.field1351) & 0x62) != 0) {
					field230 = true;

					if (field305 != -1 || field441 != -1) {
						field303 = true;
					}
				}
			}

			if (var1.field1353 == 1 && var1.field1352 != null) {
				FIYHSKKC.method208(var1.field1352);
			}

			if (var1.field1353 == 2 && field462 == var1.field1351 && var1.field1352 != null) {
				method68(var1.field1352, field463);
			}

			if (var1.field1353 == 3 && field280 == 1) {
				for (int var2 = 0; var2 < field391.length; var2++) {
					if (field420[var2] == var1.field1351) {
						field391[var2] = var1.field1352;

						if (var1.field1352 == null) {
							field420[var2] = -1;
						}

						break;
					}

					if (field421[var2] == var1.field1351) {
						field175[var2] = var1.field1352;

						if (var1.field1352 == null) {
							field421[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1353 == 93 && field112.method521(var1.field1351)) {
				XTTZZRNP.method579(new MNKDCXXG(var1.field1352), field112);
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method161() {
		if (field301 > 0) {
			method118();
		} else {
			method119("Please wait - attempting to reestablish", "Connection lost");
			field477 = 0;
			field383 = 0;
			XFJQTFBV var1 = field238;
			field351 = false;
			field68 = 0;
			method84(field228, field229, true);

			if (!field351) {
				method118();
			}

			try {
				var1.method556();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method162() {
		if (field197 > 1) {
			field197--;
		}

		if (field301 > 0) {
			field301--;
		}

		for (int var1 = 0; var1 < 5 && method138(); var1++) {
		}

		if (field351) {
			synchronized (field392.field1100) {
				if (!field366) {
					field392.field1103 = 0;
				} else if (field35 != 0 || field392.field1103 >= 40) {
					field411.method375(13);
					field411.method376(0);
					int var3 = field411.field1055;
					int var4 = 0;
					for (int var5 = 0; var5 < field392.field1103 && var3 - field411.field1055 < 240; var5++) {
						var4++;
						int var6 = field392.field1104[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field392.field1101[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field392.field1104[var5] == -1 && field392.field1101[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field320 != var7 || field321 != var6) {
							int var9 = var7 - field320;
							field320 = var7;
							int var10 = var6 - field321;
							field321 = var6;

							if (field304 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field411.method377((field304 << 12) + (var9 << 6) + var10);
								field304 = 0;
							} else if (field304 < 8) {
								field411.method379((field304 << 19) + var8 + 0x800000);
								field304 = 0;
							} else {
								field411.method380((field304 << 19) + var8 - 0x40000000);
								field304 = 0;
							}
						} else if (field304 < 2047) {
							field304++;
						}
					}

					field411.method385(field411.field1055 - var3);

					if (var4 >= field392.field1103) {
						field392.field1103 = 0;
					} else {
						field392.field1103 -= var4;
						for (int var11 = 0; var11 < field392.field1103; var11++) {
							field392.field1101[var11] = field392.field1101[var4 + var11];
							field392.field1104[var11] = field392.field1104[var4 + var11];
						}
					}
				}
			}

			if (field35 != 0) {
				long var12 = (field38 - field295) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field295 = field38;
				int var14 = field37;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field36;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field35 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field411.method375(209);
				field411.method420((var17 << 19) + (var18 << 20) + var16);
			}

			if (field88 > 0) {
				field88--;
			}

			if (field39[1] == 1 || field39[2] == 1 || field39[3] == 1 || field39[4] == 1) {
				field89 = true;
			}

			if (field89 && field88 <= 0) {
				field88 = 20;
				field89 = false;
				field411.method375(107);
				field411.method411(field453);
				field411.method411(field454);
			}

			if (field26 && !field322) {
				field322 = true;
				field411.method375(12);
				field411.method376(1);
			}

			if (!field26 && field322) {
				field322 = false;
				field411.method375(12);
				field411.method376(0);
			}

			method37();
			method31();
			method33();
			field299++;
			if (field299 > 750) {
				method161();
			}

			method70();
			method39();
			method62();
			field276++;

			if (field194 != 0) {
				field193 += 20;
				if (field193 >= 400) {
					field194 = 0;
				}
			}

			if (field450 != 0) {
				field447++;
				if (field447 >= 15) {
					if (field450 == 2) {
						field230 = true;
					}

					if (field450 == 3) {
						field303 = true;
					}

					field450 = 0;
				}
			}

			if (field401 != 0) {
				field159++;

				if (field29 > field402 + 5 || field29 < field402 - 5 || field30 > field403 + 5 || field30 < field403 - 5) {
					field246 = true;
				}

				if (field28 == 0) {
					if (field401 == 2) {
						field230 = true;
					}

					if (field401 == 3) {
						field303 = true;
					}

					field401 = 0;

					if (field246 && field159 >= 5) {
						field314 = -1;
						method128();

						if (field399 == field314 && field400 != field313) {
							IJOSTBQT var19 = IJOSTBQT.method276(field399);
							byte var20 = 0;
							if (field256 == 1 && var19.field849 == 206) {
								var20 = 1;
							}

							if (var19.field830[field313] <= 0) {
								var20 = 0;
							}

							if (var19.field801) {
								int var21 = field400;
								int var22 = field313;
								var19.field830[var22] = var19.field830[var21];
								var19.field817[var22] = var19.field817[var21];
								var19.field830[var21] = -1;
								var19.field817[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field400;
								int var24 = field313;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method272(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method272(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method272(field313, field400);
							}

							field411.method375(216);
							field411.method412(field400);
							field411.method377(field313);
							field411.method404(var20);
							field411.method410(field399);
						}
					} else if ((field210 == 1 || method144(field471 - 1)) && field471 > 2) {
						method69();
					} else if (field471 > 0) {
						method148(field471 - 1);
					}

					field447 = 10;
					field35 = 0;
				}
			}

			if (HFSXIPFN.field763 != -1) {
				int var25 = HFSXIPFN.field763;
				int var26 = HFSXIPFN.field764;
				boolean var27 = method112(0, field218.field590[0], 0, field218.field591[0], var25, 0, 0, var26, 0, 0, true);
				HFSXIPFN.field763 = -1;

				if (var27) {
					field191 = field36;
					field192 = field37;
					field194 = 1;
					field193 = 0;
				}
			}

			if (field35 == 1 && field186 != null) {
				field186 = null;
				field303 = true;
				field35 = 0;
			}

			method82();

			if (field416 == -1) {
				method136();
				method143();
				method157();
			}

			if (field28 == 1 || field35 == 1) {
				field161++;
			}

			if (field296 == 0 && field375 == 0 && field96 == 0) {
				if (field227 > 0) {
					field227--;
				}
			} else if (field227 < 100) {
				field227++;
				if (field227 == 100) {
					if (field296 != 0) {
						field303 = true;
					}

					if (field375 != 0) {
						field230 = true;
					}
				}
			}

			if (field280 == 2) {
				method116();
			}

			if (field280 == 2 && field82) {
				method47();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field154[var28]++;
			}

			method139();
			field27++;
			if (field27 > 4500) {
				field301 = 250;
				field27 -= 500;
				field411.method375(224);
			}

			field152++;
			if (field152 > 500) {
				field152 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field94 += field95;
				}

				if ((var29 & 0x2) == 2) {
					field414 += field415;
				}

				if ((var29 & 0x4) == 4) {
					field451 += field452;
				}
			}

			if (field94 < -50) {
				field95 = 2;
			}

			if (field94 > 50) {
				field95 = -2;
			}

			if (field414 < -55) {
				field415 = 2;
			}

			if (field414 > 55) {
				field415 = -2;
			}

			if (field451 < -40) {
				field452 = 1;
			}

			if (field451 > 40) {
				field452 = -1;
			}

			field324++;
			if (field324 > 500) {
				field324 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field170 += field171;
				}

				if ((var30 & 0x2) == 2) {
					field394 += field395;
				}
			}

			if (field170 < -60) {
				field171 = 2;
			}

			if (field170 > 60) {
				field171 = -2;
			}

			if (field394 < -20) {
				field395 = 1;
			}

			if (field394 > 10) {
				field395 = -1;
			}

			field300++;
			if (field300 > 50) {
				field411.method375(71);
			}

			try {
				if (field238 != null && field411.field1055 > 0) {
					field238.method560(0, field411.field1054, field411.field1055);
					field411.field1055 = 0;
					field300 = 0;
				}
			} catch (IOException var32) {
				method161();
			} catch (Exception var33) {
				method118();
			}
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method163(int arg0) {
		if (!field333) {
			for (int var2 = 0; var2 < field408.length; var2++) {
				int var3 = field408[var2];
				if (UNBQQGBL.field1278[var3] >= arg0) {
					BVXAXAEI var4 = UNBQQGBL.field1272[var3];
					int var5 = var4.field49 * var4.field48 - 1;
					int var6 = field276 * var4.field48 * 2;
					byte[] var7 = var4.field46;
					byte[] var8 = field459;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field46 = var8;
					field459 = var7;
					UNBQQGBL.method504(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public static final void method164() {
		HFSXIPFN.field729 = true;
		UNBQQGBL.field1259 = true;
		field333 = true;
		XTTZZRNP.field1426 = true;
		MIQWCPVG.field1051 = true;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 368);

			if (arg0.length == 5) {
				field330 = Integer.parseInt(arg0[0]);
				field331 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method164();
				} else if (arg0[2].equals("highmem")) {
					method156();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field332 = false;
				} else if (arg0[3].equals("members")) {
					field332 = true;
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

	@ObfuscatedName("client.s(Z)V")
	public final void method165() {
		field151.method360();
		UNBQQGBL.field1270 = field164;
		field174.method20(0, 0);

		if (field489) {
			field480.method585(0, 40, 239, field470);
			field480.method585(128, 60, 239, field496 + "*");
		} else if (field135 == 1) {
			field480.method585(0, 40, 239, "Enter amount:");
			field480.method585(128, 60, 239, field65 + "*");
		} else if (field135 == 2) {
			field480.method585(0, 40, 239, "Enter name:");
			field480.method585(128, 60, 239, field65 + "*");
		} else if (field135 == 3) {
			if (field65 != field484) {
				method110(field65);
				field484 = field65;
			}

			XZMPLIVN var1 = field479;
			UJSJLLWF.method481(0, 0, 463, 77);

			for (int var2 = 0; var2 < field485; var2++) {
				int var3 = var2 * 14 + 18 - field488;
				if (var3 > 0 && var3 < 110) {
					var1.method585(0, var3, 239, field486[var2]);
				}
			}

			UJSJLLWF.method480();

			if (field485 > 5) {
				method80(field485 * 14 + 7, 463, 77, field488, 0);
			}

			if (field65.length() == 0) {
				field480.method585(255, 40, 239, "Enter object name");
			} else if (field485 == 0) {
				field480.method585(0, 40, 239, "No matching objects found, please shorten search");
			}

			var1.method585(0, 90, 239, field65 + "*");
			UJSJLLWF.method487(0, 0, 479, 77);
		} else if (field186 != null) {
			field480.method585(0, 40, 239, field186);
			field480.method585(128, 60, 239, "Click to continue");
		} else if (field305 != -1) {
			method105(0, IJOSTBQT.method276(field305), 0, 0);
		} else if (field441 == -1) {
			XZMPLIVN var4 = field479;
			int var5 = 0;
			UJSJLLWF.method481(0, 0, 463, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field129[var6] != null) {
					int var7 = field127[var6];
					int var8 = field225 + 70 - var5 * 14;
					String var9 = field128[var6];
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
							var4.method589(0, field129[var6], 4, var8);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field157 == 0 || field157 == 1 && method30(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field442[0].method20(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field442[1].method20(var8 - 12, var11);
								var11 += 14;
							}

							var4.method589(0, var9 + ":", var11, var8);
							var11 += var4.method587(var9) + 8;
							var4.method589(255, field129[var6], var11, var8);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field114 == 0 && (var7 == 7 || field472 == 0 || field472 == 1 && method30(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method589(0, "From", var12, var8);
							int var14 = var12 + var4.method587("From ");
							if (var10 == 1) {
								field442[0].method20(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field442[1].method20(var8 - 12, var14);
								var14 += 14;
							}

							var4.method589(0, var9 + ":", var14, var8);
							var14 += var4.method587(var9) + 8;
							var4.method589(0x800000, field129[var6], var14, var8);
						}

						var5++;
					}

					if (var7 == 4 && (field110 == 0 || field110 == 1 && method30(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method589(0x800080, var9 + " " + field129[var6], 4, var8);
						}

						var5++;
					}

					if (var7 == 5 && field114 == 0 && field472 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method589(0x800000, field129[var6], 4, var8);
						}

						var5++;
					}

					if (var7 == 6 && field114 == 0 && field472 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method589(0, "To " + var9 + ":", 4, var8);
							var4.method589(0x800000, field129[var6], var4.method587("To " + var9) + 12, var8);
						}

						var5++;
					}

					if (var7 == 8 && (field110 == 0 || field110 == 1 && method30(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method589(0x7E3200, var9 + " " + field129[var6], 4, var8);
						}

						var5++;
					}
				}
			}

			UJSJLLWF.method480();
			field190 = var5 * 14 + 7;
			if (field190 < 78) {
				field190 = 78;
			}

			method80(field190, 463, 77, field190 - field225 - 77, 0);
			String var13;
			if (field218 == null || field218.field527 == null) {
				var13 = UJXMBJLW.method495(field228);
			} else {
				var13 = field218.field527;
			}

			var4.method589(0, var13 + ":", 4, 90);
			var4.method589(255, field109 + "*", var4.method587(var13 + ": ") + 6, 90);
			UJSJLLWF.method487(0, 0, 479, 77);
		} else {
			method105(0, IJOSTBQT.method276(field441), 0, 0);
		}

		if (field354 && field71 == 2) {
			method60();
		}

		field151.method361(field21, 17, 357);
		field150.method360();
		UNBQQGBL.field1270 = field166;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field393[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field467[var3] = var2 / 4;
		}
	}
}
