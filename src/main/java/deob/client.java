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
public final class client extends RMDQJLZZ {

	@ObfuscatedName("client.M")
	public TQYMAXSO field83 = TQYMAXSO.method456(1);

	@ObfuscatedName("client.P")
	public boolean field85 = false;

	@ObfuscatedName("client.R")
	public VCTXURSE[] field87 = new VCTXURSE[100];

	@ObfuscatedName("client.T")
	public int field88 = -1;

	@ObfuscatedName("client.W")
	public int[] field91 = new int[50];

	@ObfuscatedName("client.X")
	public TQYMAXSO field92 = TQYMAXSO.method456(1);

	@ObfuscatedName("client.cb")
	public int field96 = -1;

	@ObfuscatedName("client.db")
	public boolean field97 = false;

	@ObfuscatedName("client.fb")
	public int field98 = -1;

	@ObfuscatedName("client.gb")
	public final int[] field99 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.hb")
	public boolean field100 = true;

	@ObfuscatedName("client.ib")
	public String field101 = "";

	@ObfuscatedName("client.jb")
	public int[] field102 = new int[5];

	@ObfuscatedName("client.mb")
	public TPUDHOHI[] field105 = new TPUDHOHI[32];

	@ObfuscatedName("client.rb")
	public int[][] field110 = new int[104][104];

	@ObfuscatedName("client.tb")
	public TQYMAXSO field112 = new TQYMAXSO(new byte[5000]);

	@ObfuscatedName("client.ub")
	public GYKYBIID[] field113 = new GYKYBIID[16384];

	@ObfuscatedName("client.wb")
	public int[] field115 = new int[16384];

	@ObfuscatedName("client.xb")
	public int field116 = -1;

	@ObfuscatedName("client.yb")
	public int field117 = -1;

	@ObfuscatedName("client.zb")
	public int[] field118 = new int[200];

	@ObfuscatedName("client.Ab")
	public TPUDHOHI[] field119 = new TPUDHOHI[1000];

	@ObfuscatedName("client.Bb")
	public int field120 = -1;

	@ObfuscatedName("client.Cb")
	public String field121 = "";

	@ObfuscatedName("client.Db")
	public String field122 = "";

	@ObfuscatedName("client.Eb")
	public int[] field123 = new int[151];

	@ObfuscatedName("client.Fb")
	public CRZPTUPR[][][] field124 = new CRZPTUPR[4][104][104];

	@ObfuscatedName("client.Ib")
	public CRC32 field126 = new CRC32();

	@ObfuscatedName("client.Kb")
	public boolean field128 = true;

	@ObfuscatedName("client.Mb")
	public int field130 = -1;

	@ObfuscatedName("client.Sb")
	public boolean field135 = false;

	@ObfuscatedName("client.ec")
	public VCTXURSE[] field147 = new VCTXURSE[2];

	@ObfuscatedName("client.kc")
	public boolean field153 = false;

	@ObfuscatedName("client.mc")
	public boolean field154 = false;

	@ObfuscatedName("client.oc")
	public int field156 = 2;

	@ObfuscatedName("client.tc")
	public int field160 = -1;

	@ObfuscatedName("client.uc")
	public int[] field161 = new int[4000];

	@ObfuscatedName("client.vc")
	public int[] field162 = new int[4000];

	@ObfuscatedName("client.wc")
	public int[] field163 = new int[5];

	@ObfuscatedName("client.yc")
	public int[] field165 = new int[5];

	@ObfuscatedName("client.Cc")
	public int field166 = -1;

	@ObfuscatedName("client.Fc")
	public int field167 = -1;

	@ObfuscatedName("client.Gc")
	public OMJBPTVL field168 = new OMJBPTVL();

	@ObfuscatedName("client.Tc")
	public int field177 = 0x23201B;

	@ObfuscatedName("client.Yc")
	public int[] field182 = new int[151];

	@ObfuscatedName("client.Zc")
	public int[] field183 = new int[256];

	@ObfuscatedName("client.ad")
	public int field184 = 78;

	@ObfuscatedName("client.ed")
	public int[][] field188 = new int[104][104];

	@ObfuscatedName("client.gd")
	public int field190 = 2;

	@ObfuscatedName("client.md")
	public int field196 = 50;

	@ObfuscatedName("client.nd")
	public int[] field197 = new int[field196];

	@ObfuscatedName("client.od")
	public int[] field198 = new int[field196];

	@ObfuscatedName("client.pd")
	public int[] field199 = new int[field196];

	@ObfuscatedName("client.qd")
	public int[] field200 = new int[field196];

	@ObfuscatedName("client.rd")
	public int[] field201 = new int[field196];

	@ObfuscatedName("client.sd")
	public int[] field202 = new int[field196];

	@ObfuscatedName("client.td")
	public int[] field203 = new int[field196];

	@ObfuscatedName("client.ud")
	public String[] field204 = new String[field196];

	@ObfuscatedName("client.vd")
	public boolean field205 = false;

	@ObfuscatedName("client.yd")
	public CRZPTUPR field208 = new CRZPTUPR();

	@ObfuscatedName("client.Fd")
	public long[] field215 = new long[200];

	@ObfuscatedName("client.Kd")
	public int[][][] field218 = new int[4][13][13];

	@ObfuscatedName("client.Pd")
	public boolean field223 = false;

	@ObfuscatedName("client.ce")
	public TPUDHOHI[] field234 = new TPUDHOHI[32];

	@ObfuscatedName("client.fe")
	public boolean field236 = false;

	@ObfuscatedName("client.ie")
	public boolean field239 = false;

	@ObfuscatedName("client.le")
	public int[] field241 = new int[DQSKKFHM.field562];

	@ObfuscatedName("client.pe")
	public int field245 = 1;

	@ObfuscatedName("client.xe")
	public String[] field253 = new String[5];

	@ObfuscatedName("client.ye")
	public boolean[] field254 = new boolean[5];

	@ObfuscatedName("client.Ae")
	public boolean field255 = false;

	@ObfuscatedName("client.Fe")
	public boolean field260 = false;

	@ObfuscatedName("client.Ge")
	public int field261 = 128;

	@ObfuscatedName("client.Le")
	public int field266 = 2;

	@ObfuscatedName("client.Ne")
	public boolean field267 = false;

	@ObfuscatedName("client.Pe")
	public TPUDHOHI[] field268 = new TPUDHOHI[8];

	@ObfuscatedName("client.Ze")
	public int[] field276 = new int[1000];

	@ObfuscatedName("client.ff")
	public long[] field282 = new long[100];

	@ObfuscatedName("client.hf")
	public int[] field284 = new int[5];

	@ObfuscatedName("client.of")
	public TQYMAXSO field290 = TQYMAXSO.method456(1);

	@ObfuscatedName("client.Af")
	public String field301 = "";

	@ObfuscatedName("client.Ff")
	public boolean field305 = false;

	@ObfuscatedName("client.Of")
	public volatile boolean field313 = false;

	@ObfuscatedName("client.Pf")
	public boolean field314 = false;

	@ObfuscatedName("client.Qf")
	public TPUDHOHI[] field315 = new TPUDHOHI[32];

	@ObfuscatedName("client.Rf")
	public boolean field316 = true;

	@ObfuscatedName("client.Sf")
	public int[] field317 = new int[2000];

	@ObfuscatedName("client.Uf")
	public int field318 = 0x4D4233;

	@ObfuscatedName("client.Wf")
	public int[] field320 = new int[DQSKKFHM.field562];

	@ObfuscatedName("client.eg")
	public int field326 = -1;

	@ObfuscatedName("client.gg")
	public String field327 = "";

	@ObfuscatedName("client.mg")
	public boolean field333 = false;

	@ObfuscatedName("client.tg")
	public boolean[] field340 = new boolean[5];

	@ObfuscatedName("client.ug")
	public int[] field341 = new int[2000];

	@ObfuscatedName("client.xg")
	public int[] field343 = new int[9];

	@ObfuscatedName("client.yg")
	public String[] field344 = new String[200];

	@ObfuscatedName("client.Ag")
	public CRZPTUPR field346 = new CRZPTUPR();

	@ObfuscatedName("client.Bg")
	public int[] field347 = new int[100];

	@ObfuscatedName("client.Cg")
	public String[] field348 = new String[100];

	@ObfuscatedName("client.Dg")
	public String[] field349 = new String[100];

	@ObfuscatedName("client.Lg")
	public int[] field354 = new int[33];

	@ObfuscatedName("client.Ng")
	public int field356 = 3;

	@ObfuscatedName("client.Rg")
	public int field360 = -1;

	@ObfuscatedName("client.Sg")
	public String[] field361 = new String[500];

	@ObfuscatedName("client.Tg")
	public boolean field362 = true;

	@ObfuscatedName("client.Yg")
	public int field364 = 2048;

	@ObfuscatedName("client.Zg")
	public int field365 = 2047;

	@ObfuscatedName("client.ah")
	public DEHYKQII[] field366 = new DEHYKQII[field364];

	@ObfuscatedName("client.ch")
	public int[] field368 = new int[field364];

	@ObfuscatedName("client.eh")
	public int[] field370 = new int[field364];

	@ObfuscatedName("client.fh")
	public TQYMAXSO[] field371 = new TQYMAXSO[field364];

	@ObfuscatedName("client.nh")
	public int[][] field377 = new int[104][104];

	@ObfuscatedName("client.vh")
	public String field385 = "";

	@ObfuscatedName("client.Ch")
	public boolean field392 = false;

	@ObfuscatedName("client.Dh")
	public final int field393 = 100;

	@ObfuscatedName("client.Eh")
	public int[] field394 = new int[100];

	@ObfuscatedName("client.Fh")
	public String field395 = "";

	@ObfuscatedName("client.Gh")
	public String field396 = "";

	@ObfuscatedName("client.Ih")
	public boolean field398 = false;

	@ObfuscatedName("client.Jh")
	public int[] field399 = new int[33];

	@ObfuscatedName("client.Lh")
	public int field400 = 0x766654;

	@ObfuscatedName("client.Th")
	public int[] field408 = new int[1000];

	@ObfuscatedName("client.Uh")
	public int[] field409 = new int[1000];

	@ObfuscatedName("client.Vh")
	public byte[] field410 = new byte[16384];

	@ObfuscatedName("client.Wh")
	public boolean field411 = true;

	@ObfuscatedName("client.Yh")
	public UEKAQTXH[] field413 = new UEKAQTXH[5];

	@ObfuscatedName("client.Zh")
	public int[] field414 = new int[DQSKKFHM.field562];

	@ObfuscatedName("client.ci")
	public int field417 = -1;

	@ObfuscatedName("client.ni")
	public int field427 = -1;

	@ObfuscatedName("client.pi")
	public int field428 = -1;

	@ObfuscatedName("client.qi")
	public int[] field429 = new int[7];

	@ObfuscatedName("client.Ci")
	public boolean field439 = false;

	@ObfuscatedName("client.Ei")
	public boolean field440 = false;

	@ObfuscatedName("client.Fi")
	public int[] field441 = new int[50];

	@ObfuscatedName("client.Gi")
	public String field442 = "";

	@ObfuscatedName("client.Ii")
	public String[] field444 = new String[100];

	@ObfuscatedName("client.Ji")
	public int[] field445 = new int[100];

	@ObfuscatedName("client.Li")
	public boolean field447 = false;

	@ObfuscatedName("client.Ni")
	public TPUDHOHI[] field449 = new TPUDHOHI[20];

	@ObfuscatedName("client.Wi")
	public int[] field458 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.aj")
	public boolean field461 = false;

	@ObfuscatedName("client.mj")
	public UDXVXGJJ[] field472 = new UDXVXGJJ[4];

	@ObfuscatedName("client.nj")
	public String field473 = "";

	@ObfuscatedName("client.oj")
	public int[] field474 = new int[500];

	@ObfuscatedName("client.pj")
	public int[] field475 = new int[500];

	@ObfuscatedName("client.qj")
	public int[] field476 = new int[500];

	@ObfuscatedName("client.rj")
	public int[] field477 = new int[500];

	@ObfuscatedName("client.yj")
	public int[] field482 = new int[50];

	@ObfuscatedName("client.Bj")
	public int field485 = 1;

	@ObfuscatedName("client.Cj")
	public int[] field486 = new int[5];

	@ObfuscatedName("client.Dj")
	public volatile boolean field487 = false;

	@ObfuscatedName("client.Oj")
	public boolean field497 = false;

	@ObfuscatedName("client.Tj")
	public int[] field502 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Uj")
	public VCTXURSE[] field503 = new VCTXURSE[13];

	@ObfuscatedName("client.Wj")
	public int[] field505 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.ek")
	public int field512 = -1;

	@ObfuscatedName("client.qk")
	public TPUDHOHI[] field521 = new TPUDHOHI[100];

	@ObfuscatedName("client.rk")
	public int field522 = 0x332D25;

	@ObfuscatedName("client.sk")
	public volatile boolean field523 = false;

	@ObfuscatedName("client.uk")
	public CRZPTUPR field525 = new CRZPTUPR();

	@ObfuscatedName("client.wd")
	public static int[] field206 = new int[99];

	@ObfuscatedName("client.je")
	public static BigInteger field240 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.me")
	public static final int[][] field242 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Se")
	public static int[] field271 = new int[32];

	@ObfuscatedName("client.Hf")
	public static BigInteger field306 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.wi")
	public static int field434 = 10;

	@ObfuscatedName("client.yi")
	public static boolean field436 = true;

	@ObfuscatedName("client.Qj")
	public static final int[] field499 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Xj")
	public static String field506 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.kb")
	public int field103;

	@ObfuscatedName("client.lb")
	public int field104;

	@ObfuscatedName("client.nb")
	public int field106;

	@ObfuscatedName("client.pb")
	public int field108;

	@ObfuscatedName("client.qb")
	public static int field109;

	@ObfuscatedName("client.sb")
	public static int field111;

	@ObfuscatedName("client.vb")
	public int field114;

	@ObfuscatedName("client.Gb")
	public int field125;

	@ObfuscatedName("client.Jb")
	public int field127;

	@ObfuscatedName("client.Lb")
	public int field129;

	@ObfuscatedName("client.Nb")
	public int field131;

	@ObfuscatedName("client.Pb")
	public int field132;

	@ObfuscatedName("client.Qb")
	public int field133;

	@ObfuscatedName("client.Rb")
	public int field134;

	@ObfuscatedName("client.cc")
	public int field145;

	@ObfuscatedName("client.dc")
	public int field146;

	@ObfuscatedName("client.nc")
	public int field155;

	@ObfuscatedName("client.qc")
	public int field158;

	@ObfuscatedName("client.rc")
	public int field159;

	@ObfuscatedName("client.xc")
	public int field164;

	@ObfuscatedName("client.Ic")
	public static int field169;

	@ObfuscatedName("client.Jc")
	public int field170;

	@ObfuscatedName("client.Mc")
	public int field172;

	@ObfuscatedName("client.Nc")
	public int field173;

	@ObfuscatedName("client.Sc")
	public int field176;

	@ObfuscatedName("client.Uc")
	public int field178;

	@ObfuscatedName("client.Vc")
	public static int field179;

	@ObfuscatedName("client.Wc")
	public int field180;

	@ObfuscatedName("client.Xc")
	public int field181;

	@ObfuscatedName("client.bd")
	public int field185;

	@ObfuscatedName("client.cd")
	public int field186;

	@ObfuscatedName("client.dd")
	public int field187;

	@ObfuscatedName("client.fd")
	public int field189;

	@ObfuscatedName("client.kd")
	public static int field194;

	@ObfuscatedName("client.ld")
	public int field195;

	@ObfuscatedName("client.xd")
	public int field207;

	@ObfuscatedName("client.zd")
	public static int field209;

	@ObfuscatedName("client.Ad")
	public int field210;

	@ObfuscatedName("client.Bd")
	public int field211;

	@ObfuscatedName("client.Jd")
	public int field217;

	@ObfuscatedName("client.Od")
	public int field222;

	@ObfuscatedName("client.Qd")
	public int field224;

	@ObfuscatedName("client.Td")
	public static int field227;

	@ObfuscatedName("client.Ud")
	public int field228;

	@ObfuscatedName("client.Wd")
	public int field229;

	@ObfuscatedName("client.Xd")
	public int field230;

	@ObfuscatedName("client.Yd")
	public int field231;

	@ObfuscatedName("client.Zd")
	public int field232;

	@ObfuscatedName("client.ae")
	public int field233;

	@ObfuscatedName("client.he")
	public int field238;

	@ObfuscatedName("client.ne")
	public int field243;

	@ObfuscatedName("client.oe")
	public int field244;

	@ObfuscatedName("client.re")
	public int field247;

	@ObfuscatedName("client.se")
	public int field248;

	@ObfuscatedName("client.te")
	public int field249;

	@ObfuscatedName("client.ue")
	public int field250;

	@ObfuscatedName("client.ve")
	public int field251;

	@ObfuscatedName("client.we")
	public int field252;

	@ObfuscatedName("client.De")
	public static int field258;

	@ObfuscatedName("client.Ee")
	public int field259;

	@ObfuscatedName("client.He")
	public int field262;

	@ObfuscatedName("client.Ie")
	public int field263;

	@ObfuscatedName("client.Je")
	public int field264;

	@ObfuscatedName("client.Ke")
	public int field265;

	@ObfuscatedName("client.Re")
	public int field270;

	@ObfuscatedName("client.Ue")
	public static int field272;

	@ObfuscatedName("client.Ve")
	public static int field273;

	@ObfuscatedName("client.We")
	public int field274;

	@ObfuscatedName("client.Ye")
	public int field275;

	@ObfuscatedName("client.af")
	public int field277;

	@ObfuscatedName("client.bf")
	public int field278;

	@ObfuscatedName("client.yf")
	public int field300;

	@ObfuscatedName("client.Cf")
	public static int field302;

	@ObfuscatedName("client.Df")
	public int field303;

	@ObfuscatedName("client.If")
	public int field307;

	@ObfuscatedName("client.Jf")
	public int field308;

	@ObfuscatedName("client.Kf")
	public int field309;

	@ObfuscatedName("client.Mf")
	public static int field311;

	@ObfuscatedName("client.ag")
	public int field324;

	@ObfuscatedName("client.cg")
	public int field325;

	@ObfuscatedName("client.hg")
	public int field328;

	@ObfuscatedName("client.ig")
	public int field329;

	@ObfuscatedName("client.jg")
	public int field330;

	@ObfuscatedName("client.kg")
	public int field331;

	@ObfuscatedName("client.lg")
	public int field332;

	@ObfuscatedName("client.ng")
	public static int field334;

	@ObfuscatedName("client.og")
	public int field335;

	@ObfuscatedName("client.pg")
	public int field336;

	@ObfuscatedName("client.qg")
	public int field337;

	@ObfuscatedName("client.rg")
	public int field338;

	@ObfuscatedName("client.sg")
	public int field339;

	@ObfuscatedName("client.vg")
	public int field342;

	@ObfuscatedName("client.Fg")
	public int field350;

	@ObfuscatedName("client.Ig")
	public int field351;

	@ObfuscatedName("client.Mg")
	public int field355;

	@ObfuscatedName("client.Pg")
	public int field358;

	@ObfuscatedName("client.Qg")
	public int field359;

	@ObfuscatedName("client.Xg")
	public static int field363;

	@ObfuscatedName("client.bh")
	public int field367;

	@ObfuscatedName("client.dh")
	public int field369;

	@ObfuscatedName("client.ih")
	public int field372;

	@ObfuscatedName("client.jh")
	public int field373;

	@ObfuscatedName("client.kh")
	public int field374;

	@ObfuscatedName("client.lh")
	public int field375;

	@ObfuscatedName("client.oh")
	public int field378;

	@ObfuscatedName("client.ph")
	public int field379;

	@ObfuscatedName("client.qh")
	public int field380;

	@ObfuscatedName("client.uh")
	public int field384;

	@ObfuscatedName("client.wh")
	public int field386;

	@ObfuscatedName("client.xh")
	public int field387;

	@ObfuscatedName("client.yh")
	public int field388;

	@ObfuscatedName("client.zh")
	public int field389;

	@ObfuscatedName("client.Ah")
	public int field390;

	@ObfuscatedName("client.Bh")
	public int field391;

	@ObfuscatedName("client.Mh")
	public int field401;

	@ObfuscatedName("client.Rh")
	public int field406;

	@ObfuscatedName("client.Sh")
	public int field407;

	@ObfuscatedName("client.Xh")
	public int field412;

	@ObfuscatedName("client.ai")
	public int field415;

	@ObfuscatedName("client.bi")
	public int field416;

	@ObfuscatedName("client.di")
	public int field418;

	@ObfuscatedName("client.ei")
	public int field419;

	@ObfuscatedName("client.fi")
	public int field420;

	@ObfuscatedName("client.gi")
	public int field421;

	@ObfuscatedName("client.hi")
	public static int field422;

	@ObfuscatedName("client.ii")
	public int field423;

	@ObfuscatedName("client.ji")
	public int field424;

	@ObfuscatedName("client.ki")
	public int field425;

	@ObfuscatedName("client.li")
	public int field426;

	@ObfuscatedName("client.xi")
	public static int field435;

	@ObfuscatedName("client.Ai")
	public int field438;

	@ObfuscatedName("client.Hi")
	public int field443;

	@ObfuscatedName("client.Ki")
	public int field446;

	@ObfuscatedName("client.Pi")
	public int field451;

	@ObfuscatedName("client.Qi")
	public int field452;

	@ObfuscatedName("client.Ri")
	public int field453;

	@ObfuscatedName("client.Si")
	public int field454;

	@ObfuscatedName("client.Ti")
	public int field455;

	@ObfuscatedName("client.Ui")
	public int field456;

	@ObfuscatedName("client.Vi")
	public static int field457;

	@ObfuscatedName("client.Yi")
	public int field459;

	@ObfuscatedName("client.Zi")
	public int field460;

	@ObfuscatedName("client.cj")
	public int field462;

	@ObfuscatedName("client.vj")
	public int field480;

	@ObfuscatedName("client.wj")
	public int field481;

	@ObfuscatedName("client.zj")
	public static int field483;

	@ObfuscatedName("client.Aj")
	public int field484;

	@ObfuscatedName("client.Ej")
	public int field488;

	@ObfuscatedName("client.Gj")
	public int field489;

	@ObfuscatedName("client.Hj")
	public int field490;

	@ObfuscatedName("client.Ij")
	public int field491;

	@ObfuscatedName("client.Jj")
	public int field492;

	@ObfuscatedName("client.Kj")
	public int field493;

	@ObfuscatedName("client.Lj")
	public int field494;

	@ObfuscatedName("client.Mj")
	public int field495;

	@ObfuscatedName("client.Nj")
	public int field496;

	@ObfuscatedName("client.Rj")
	public int field500;

	@ObfuscatedName("client.Sj")
	public int field501;

	@ObfuscatedName("client.Vj")
	public int field504;

	@ObfuscatedName("client.Zj")
	public int field507;

	@ObfuscatedName("client.ak")
	public int field508;

	@ObfuscatedName("client.bk")
	public int field509;

	@ObfuscatedName("client.ck")
	public int field510;

	@ObfuscatedName("client.dk")
	public int field511;

	@ObfuscatedName("client.fk")
	public static int field513;

	@ObfuscatedName("client.nk")
	public int field519;

	@ObfuscatedName("client.ok")
	public int field520;

	@ObfuscatedName("client.I")
	public int field81;

	@ObfuscatedName("client.K")
	public int field82;

	@ObfuscatedName("client.U")
	public int field89;

	@ObfuscatedName("client.V")
	public int field90;

	@ObfuscatedName("client.pc")
	public long field157;

	@ObfuscatedName("client.ee")
	public long field235;

	@ObfuscatedName("client.ge")
	public long field237;

	@ObfuscatedName("client.Ef")
	public long field304;

	@ObfuscatedName("client.O")
	public long field84;

	@ObfuscatedName("client.Qe")
	public static DEHYKQII field269;

	@ObfuscatedName("client.Kc")
	public HJOZCGZH field171;

	@ObfuscatedName("client.bb")
	public LBXRBQZX field95;

	@ObfuscatedName("client.Oi")
	public MPMWDRAA field450;

	@ObfuscatedName("client.tk")
	public MRWOUQJV field524;

	@ObfuscatedName("client.sh")
	public SXKKBWPU field382;

	@ObfuscatedName("client.Rd")
	public TPUDHOHI field225;

	@ObfuscatedName("client.Sd")
	public TPUDHOHI field226;

	@ObfuscatedName("client.jf")
	public TPUDHOHI field285;

	@ObfuscatedName("client.kf")
	public TPUDHOHI field286;

	@ObfuscatedName("client.lf")
	public TPUDHOHI field287;

	@ObfuscatedName("client.mf")
	public TPUDHOHI field288;

	@ObfuscatedName("client.nf")
	public TPUDHOHI field289;

	@ObfuscatedName("client.Lf")
	public TPUDHOHI field310;

	@ObfuscatedName("client.zg")
	public TPUDHOHI field345;

	@ObfuscatedName("client.Jg")
	public TPUDHOHI field352;

	@ObfuscatedName("client.Kg")
	public TPUDHOHI field353;

	@ObfuscatedName("client.th")
	public TPUDHOHI field383;

	@ObfuscatedName("client.Mi")
	public TPUDHOHI field448;

	@ObfuscatedName("client.sj")
	public TPUDHOHI field478;

	@ObfuscatedName("client.tj")
	public TPUDHOHI field479;

	@ObfuscatedName("client.hd")
	public VCTXURSE field191;

	@ObfuscatedName("client.id")
	public VCTXURSE field192;

	@ObfuscatedName("client.jd")
	public VCTXURSE field193;

	@ObfuscatedName("client.Dd")
	public VCTXURSE field213;

	@ObfuscatedName("client.Ed")
	public VCTXURSE field214;

	@ObfuscatedName("client.Xf")
	public VCTXURSE field321;

	@ObfuscatedName("client.Yf")
	public VCTXURSE field322;

	@ObfuscatedName("client.Zf")
	public VCTXURSE field323;

	@ObfuscatedName("client.hj")
	public VCTXURSE field467;

	@ObfuscatedName("client.ij")
	public VCTXURSE field468;

	@ObfuscatedName("client.jj")
	public VCTXURSE field469;

	@ObfuscatedName("client.kj")
	public VCTXURSE field470;

	@ObfuscatedName("client.lj")
	public VCTXURSE field471;

	@ObfuscatedName("client.hk")
	public VCTXURSE field514;

	@ObfuscatedName("client.ik")
	public VCTXURSE field515;

	@ObfuscatedName("client.jk")
	public VCTXURSE field516;

	@ObfuscatedName("client.kk")
	public VCTXURSE field517;

	@ObfuscatedName("client.lk")
	public VCTXURSE field518;

	@ObfuscatedName("client.Y")
	public VCTXURSE field93;

	@ObfuscatedName("client.Z")
	public VCTXURSE field94;

	@ObfuscatedName("client.Tb")
	public VFZXUVTW field136;

	@ObfuscatedName("client.Ub")
	public VFZXUVTW field137;

	@ObfuscatedName("client.Vb")
	public VFZXUVTW field138;

	@ObfuscatedName("client.Wb")
	public VFZXUVTW field139;

	@ObfuscatedName("client.Xb")
	public VFZXUVTW field140;

	@ObfuscatedName("client.Yb")
	public VFZXUVTW field141;

	@ObfuscatedName("client.Zb")
	public VFZXUVTW field142;

	@ObfuscatedName("client.ac")
	public VFZXUVTW field143;

	@ObfuscatedName("client.bc")
	public VFZXUVTW field144;

	@ObfuscatedName("client.cf")
	public VFZXUVTW field279;

	@ObfuscatedName("client.df")
	public VFZXUVTW field280;

	@ObfuscatedName("client.ef")
	public VFZXUVTW field281;

	@ObfuscatedName("client.pf")
	public VFZXUVTW field291;

	@ObfuscatedName("client.qf")
	public VFZXUVTW field292;

	@ObfuscatedName("client.rf")
	public VFZXUVTW field293;

	@ObfuscatedName("client.sf")
	public VFZXUVTW field294;

	@ObfuscatedName("client.tf")
	public VFZXUVTW field295;

	@ObfuscatedName("client.uf")
	public VFZXUVTW field296;

	@ObfuscatedName("client.vf")
	public VFZXUVTW field297;

	@ObfuscatedName("client.wf")
	public VFZXUVTW field298;

	@ObfuscatedName("client.xf")
	public VFZXUVTW field299;

	@ObfuscatedName("client.dj")
	public VFZXUVTW field463;

	@ObfuscatedName("client.ej")
	public VFZXUVTW field464;

	@ObfuscatedName("client.fj")
	public VFZXUVTW field465;

	@ObfuscatedName("client.gj")
	public VFZXUVTW field466;

	@ObfuscatedName("client.Hh")
	public XSRHTFUZ field397;

	@ObfuscatedName("client.fc")
	public ZGPIKWUW field148;

	@ObfuscatedName("client.gc")
	public ZGPIKWUW field149;

	@ObfuscatedName("client.hc")
	public ZGPIKWUW field150;

	@ObfuscatedName("client.ic")
	public ZGPIKWUW field151;

	@ObfuscatedName("client.gf")
	public String field283;

	@ObfuscatedName("client.mh")
	public String field376;

	@ObfuscatedName("client.rh")
	public String field381;

	@ObfuscatedName("client.Q")
	public String field86;

	@ObfuscatedName("client.ob")
	public Socket field107;

	@ObfuscatedName("client.Cd")
	public static boolean field212;

	@ObfuscatedName("client.Vf")
	public static boolean field319;

	@ObfuscatedName("client.Og")
	public static boolean field357;

	@ObfuscatedName("client.zi")
	public static boolean field437;

	@ObfuscatedName("client.Oc")
	public int[] field174;

	@ObfuscatedName("client.Pc")
	public int[] field175;

	@ObfuscatedName("client.Ld")
	public int[] field219;

	@ObfuscatedName("client.Md")
	public int[] field220;

	@ObfuscatedName("client.Nd")
	public int[] field221;

	@ObfuscatedName("client.Be")
	public int[] field256;

	@ObfuscatedName("client.Ce")
	public int[] field257;

	@ObfuscatedName("client.Nh")
	public int[] field402;

	@ObfuscatedName("client.Oh")
	public int[] field403;

	@ObfuscatedName("client.Ph")
	public int[] field404;

	@ObfuscatedName("client.Qh")
	public int[] field405;

	@ObfuscatedName("client.ri")
	public int[] field430;

	@ObfuscatedName("client.si")
	public int[] field431;

	@ObfuscatedName("client.ti")
	public int[] field432;

	@ObfuscatedName("client.ui")
	public int[] field433;

	@ObfuscatedName("client.Gd")
	public VCTXURSE[] field216;

	@ObfuscatedName("client.jc")
	public byte[][] field152;

	@ObfuscatedName("client.Pj")
	public byte[][] field498;

	@ObfuscatedName("client.Nf")
	public byte[][][] field312;

	@ObfuscatedName("client.qe")
	public int[][][] field246;

	@ObfuscatedName("client.b(Z)V")
	public final void method29() {
		short var1 = 256;

		if (field519 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field519 > 768) {
					field430[var2] = method52(field432[var2], field431[var2], 1024 - field519);
				} else if (field519 > 256) {
					field430[var2] = field432[var2];
				} else {
					field430[var2] = method52(field431[var2], field432[var2], 256 - field519);
				}
			}
		} else if (field520 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field520 > 768) {
					field430[var3] = method52(field433[var3], field431[var3], 1024 - field520);
				} else if (field520 > 256) {
					field430[var3] = field433[var3];
				} else {
					field430[var3] = method52(field431[var3], field433[var3], 256 - field520);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field430[var4] = field431[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field139.field1320[var5] = field352.field1255[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field183[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field174[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field430[var12];
					int var15 = field139.field1320[var7];
					field139.field1320[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field139.method542(0, 0, field1176);

		for (int var16 = 0; var16 < 33920; var16++) {
			field140.field1320[var16] = field353.field1255[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field183[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field174[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field430[var23];
					int var26 = field140.field1320[var18];
					field140.field1320[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field140.method542(0, 637, field1176);
	}

	@ObfuscatedName("client.a(LTQYMAXSO;II)V")
	public final void method30(TQYMAXSO arg0, int arg1) {
		for (int var3 = 0; var3 < field369; var3++) {
			int var4 = field370[var3];
			GYKYBIID var5 = field113[var4];
			int var6 = arg0.method468();
			if ((var6 & 0x4) != 0) {
				var5.field686 = arg0.method497();
				var5.field687 = arg0.method497();
			}

			if ((var6 & 0x80) != 0) {
				var5.field722 = arg0.method496();
				int var7 = arg0.method502();
				var5.field726 = var7 >> 16;
				var5.field725 = (var7 & 0xFFFF) + field258;
				var5.field723 = 0;
				var5.field724 = 0;

				if (var5.field725 > field258) {
					var5.field723 = -1;
				}

				if (var5.field722 == 0xFFFF) {
					var5.field722 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var8 = arg0.method498();
				if (var8 == 0xFFFF) {
					var8 = -1;
				}

				int var9 = arg0.method468();
				if (var5.field717 == var8 && var8 != -1) {
					int var10 = LMDSPIVT.field867[var8].field881;
					if (var10 == 1) {
						var5.field718 = 0;
						var5.field719 = 0;
						var5.field720 = var9;
						var5.field721 = 0;
					}

					if (var10 == 2) {
						var5.field721 = 0;
					}
				} else if (var8 == -1 || var5.field717 == -1 || LMDSPIVT.field867[var8].field875 >= LMDSPIVT.field867[var5.field717].field875) {
					var5.field717 = var8;
					var5.field718 = 0;
					var5.field719 = 0;
					var5.field720 = var9;
					var5.field721 = 0;
					var5.field704 = var5.field716;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field705 = arg0.method497();
				if (var5.field705 == 0xFFFF) {
					var5.field705 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field707 = arg0.method475();
				var5.field683 = 100;
			}

			if ((var6 & 0x10) != 0) {
				var5.field625 = YANZSPIT.method563(arg0.method470());
				var5.field737 = var5.field625.field1393;
				var5.field708 = var5.field625.field1406;
				var5.field727 = var5.field625.field1417;
				var5.field728 = var5.field625.field1400;
				var5.field729 = var5.field625.field1425;
				var5.field730 = var5.field625.field1410;
				var5.field693 = var5.field625.field1395;
			}

			if ((var6 & 0x40) != 0) {
				int var11 = arg0.method487();
				int var12 = arg0.method468();
				var5.method229(var11, field258, var12);
				var5.field709 = field258 + 300;
				var5.field710 = arg0.method468();
				var5.field711 = arg0.method489();
			}

			if ((var6 & 0x2) != 0) {
				int var13 = arg0.method489();
				int var14 = arg0.method489();
				var5.method229(var13, field258, var14);
				var5.field709 = field258 + 300;
				var5.field710 = arg0.method487();
				var5.field711 = arg0.method488();
			}
		}
	}

	@ObfuscatedName("client.a(LDEHYKQII;IZII)V")
	public final void method31(DEHYKQII arg0, int arg1, int arg2, int arg3) {
		if (field269 != arg0 && field401 < 400) {
			String var5;
			if (arg0.field529 == 0) {
				var5 = arg0.field541 + method99(arg0.field533, field269.field533) + " (level-" + arg0.field533 + ")";
			} else {
				var5 = arg0.field541 + " (skill-" + arg0.field529 + ")";
			}

			if (field372 == 1) {
				field361[field401] = "Use " + field376 + " with @whi@" + var5;
				field476[field401] = 493;
				field477[field401] = arg1;
				field474[field401] = arg2;
				field475[field401] = arg3;
				field401++;
			} else if (field378 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field253[var6] != null) {
						field361[field401] = field253[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field253[var6].equalsIgnoreCase("attack")) {
							if (arg0.field533 > field269.field533) {
								var7 = 2000;
							}

							if (field269.field528 != 0 && arg0.field528 != 0) {
								if (field269.field528 == arg0.field528) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field254[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field476[field401] = var7 + 753;
						}

						if (var6 == 1) {
							field476[field401] = var7 + 148;
						}

						if (var6 == 2) {
							field476[field401] = var7 + 914;
						}

						if (var6 == 3) {
							field476[field401] = var7 + 772;
						}

						if (var6 == 4) {
							field476[field401] = var7 + 963;
						}

						field477[field401] = arg1;
						field474[field401] = arg2;
						field475[field401] = arg3;
						field401++;
					}
				}
			} else if ((field380 & 0x8) == 8) {
				field361[field401] = field381 + " @whi@" + var5;
				field476[field401] = 452;
				field477[field401] = arg1;
				field474[field401] = arg2;
				field475[field401] = arg3;
				field401++;
			}

			for (int var8 = 0; var8 < field401; var8++) {
				if (field476[var8] == 134) {
					field361[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	public final void init() {
		field434 = Integer.parseInt(getParameter("nodeid"));
		field435 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method134();
		} else {
			method118();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field436 = false;
		} else {
			field436 = true;
		}

		method415(765, 503);
	}

	@ObfuscatedName("client.e(I)V")
	public final void method32() {
		int var1 = 5;
		field343[8] = 0;
		int var2 = 0;
		while (field343[8] == 0) {
			String var3 = "Unknown problem";
			method61(20, "Connecting to web server");

			try {
				DataInputStream var4 = method172("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 363);
				TQYMAXSO var5 = new TQYMAXSO(new byte[40]);
				var4.readFully(var5.field1262, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field343[var6] = var5.method473();
				}

				int var7 = var5.method473();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field343[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field343[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field343[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field343[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field343[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field343[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method61(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method61(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field461 = !field461;
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method33() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.g(I)Z")
	public final boolean method34() {
		if (field95 == null) {
			return false;
		}

		try {
			int var1 = field95.method275();
			if (var1 == 0) {
				return false;
			}

			if (field230 == -1) {
				field95.method276(field290.field1262, 0, 1);
				field230 = field290.field1262[0] & 0xFF;
				if (field524 != null) {
					field230 = field230 - field524.method335() & 0xFF;
				}

				field229 = WYXDKUQW.field1386[field230];
				var1--;
			}

			if (field229 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field95.method276(field290.field1262, 0, 1);
				field229 = field290.field1262[0] & 0xFF;
				var1--;
			}

			if (field229 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field95.method276(field290.field1262, 0, 2);
				field290.field1263 = 0;
				field229 = field290.method470();
				var1 -= 2;
			}

			if (var1 < field229) {
				return false;
			}

			field290.field1263 = 0;
			field95.method276(field290.field1262, 0, field229);
			field231 = 0;
			field187 = field186;
			field186 = field185;
			field185 = field230;

			if (field230 == 163) {
				method53();
				field230 = -1;
				return false;
			}

			if (field230 == 56) {
				method77(field229, field290);
				field154 = false;
				field230 = -1;
				return true;
			}

			if (field230 == 183) {
				long var2 = field290.method474();
				int var4 = field290.method473();
				int var5 = field290.method468();
				boolean var6 = false;
				for (int var7 = 0; var7 < 100; var7++) {
					if (field394[var7] == var4) {
						var6 = true;
						break;
					}
				}

				if (var5 <= 1) {
					for (int var8 = 0; var8 < field146; var8++) {
						if (field282[var8] == var2) {
							var6 = true;
							break;
						}
					}
				}

				if (!var6 && field259 == 0) {
					try {
						field394[field412] = var4;
						field412 = (field412 + 1) % 100;
						String var9 = BXSNHAGP.method26(field229 - 13, field290);
						if (var5 != 3) {
							var9 = OWMPGCSS.method377(var9);
						}

						if (var5 == 2 || var5 == 3) {
							method133("@cr2@" + PZGHUCRX.method409(PZGHUCRX.method406(var2)), var9, 7);
						} else if (var5 == 1) {
							method133("@cr1@" + PZGHUCRX.method409(PZGHUCRX.method406(var2)), var9, 7);
						} else {
							method133(PZGHUCRX.method409(PZGHUCRX.method406(var2)), var9, 3);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 24) {
				field255 = true;
				int var11 = field290.method489();
				int var12 = field290.method504();
				int var13 = field290.method468();
				field320[var11] = var12;
				field414[var11] = var13;
				field241[var11] = 1;
				for (int var14 = 0; var14 < 98; var14++) {
					if (var12 >= field206[var14]) {
						field241[var11] = var14 + 2;
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 245) {
				int var15 = field290.method499();
				if (var15 >= 0) {
					method143(var15);
				}

				if (field96 != var15) {
					method80(field96);
					field96 = var15;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 209) {
				if (field356 == 12) {
					field255 = true;
				}

				field496 = field290.method468();
				field230 = -1;
				return true;
			}

			if (field230 == 150) {
				field501 = field290.method468();
				field255 = true;
				field230 = -1;
				return true;
			}

			if (field230 == 51) {
				field89 = field290.method488();
				field90 = field290.method488();

				while (field290.field1263 < field229) {
					int var16 = field290.method468();
					method113(var16, field290);
				}

				field230 = -1;
				return true;
			}

			if (field230 == 43) {
				int var17 = field290.method497();
				int var18 = field290.method496();
				method143(var18);

				if (var17 != -1) {
					method143(var17);
				}

				if (field88 != -1) {
					method80(field88);
					field88 = -1;
				}

				if (field120 != -1) {
					method80(field120);
					field120 = -1;
				}

				if (field98 != -1) {
					method80(field98);
					field98 = -1;
				}

				if (field326 != var18) {
					method80(field326);
					field326 = var18;
				}

				if (field428 != var18) {
					method80(field428);
					field428 = var17;
				}

				field384 = 0;
				field439 = false;
				field230 = -1;
				return true;
			}

			if (field230 == 242) {
				field85 = true;
				field247 = field290.method468();
				field248 = field290.method468();
				field249 = field290.method470();
				field250 = field290.method468();
				field251 = field290.method468();
				if (field251 >= 100) {
					int var19 = field247 * 128 + 64;
					int var20 = field248 * 128 + 64;
					int var21 = method109(var20, var19, field211) - field249;
					int var22 = var19 - field328;
					int var23 = var21 - field329;
					int var24 = var20 - field330;
					int var25 = (int) Math.sqrt(var22 * var22 + var24 * var24);
					field331 = (int) (Math.atan2(var23, var25) * 325.949D) & 0x7FF;
					field332 = (int) (Math.atan2(var22, var24) * -325.949D) & 0x7FF;

					if (field331 < 128) {
						field331 = 128;
					}

					if (field331 > 383) {
						field331 = 383;
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 87) {
				int var26 = field290.method468();
				String var27 = field290.method475();
				int var28 = field290.method487();
				if (var28 >= 1 && var28 <= 5) {
					if (var27.equalsIgnoreCase("null")) {
						var27 = null;
					}

					field253[var28 - 1] = var27;
					field254[var28 - 1] = var26 == 0;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 110) {
				field447 = false;
				field384 = 1;
				field301 = "";
				field153 = true;
				field230 = -1;
				return true;
			}

			if (field230 == 18) {
				long var29 = field290.method474();
				int var31 = field290.method468();
				String var32 = PZGHUCRX.method409(PZGHUCRX.method406(var29));
				for (int var33 = 0; var33 < field500; var33++) {
					if (field215[var33] == var29) {
						if (field118[var33] != var31) {
							field118[var33] = var31;
							field255 = true;

							if (var31 > 0) {
								method133("", var32 + " has logged in.", 5);
							}

							if (var31 == 0) {
								method133("", var32 + " has logged out.", 5);
							}
						}

						var32 = null;
						break;
					}
				}

				if (var32 != null && field500 < 200) {
					field215[field500] = var29;
					field344[field500] = var32;
					field118[field500] = var31;
					field500++;
					field255 = true;
				}

				boolean var34 = false;
				while (!var34) {
					var34 = true;
					for (int var35 = 0; var35 < field500 - 1; var35++) {
						if (field118[var35] != field434 && field118[var35 + 1] == field434 || field118[var35] == 0 && field118[var35 + 1] != 0) {
							int var36 = field118[var35];
							field118[var35] = field118[var35 + 1];
							field118[var35 + 1] = var36;
							String var37 = field344[var35];
							field344[var35] = field344[var35 + 1];
							field344[var35 + 1] = var37;
							long var38 = field215[var35];
							field215[var35] = field215[var35 + 1];
							field215[var35 + 1] = var38;
							field255 = true;
							var34 = false;
						}
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 138) {
				int var40 = field290.method497();
				int var41 = field290.method497();
				OMJBPTVL var42 = OMJBPTVL.method359(var40);
				if (var42 != null && var42.field1008 == 0) {
					if (var41 < 0) {
						var41 = 0;
					}

					if (var41 > var42.field1060 - var42.field1037) {
						var41 = var42.field1060 - var42.field1037;
					}

					var42.field1061 = var41;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 37) {
				int var43 = field290.method497();
				int var44 = field290.method496();
				int var45 = field290.method470();
				if (var45 == 0xFFFF) {
					OMJBPTVL.method359(var44).field1009 = 0;
					field230 = -1;
					return true;
				}

				YDSJAZFL var46 = YDSJAZFL.method575(var45);
				OMJBPTVL.method359(var44).field1009 = 4;
				OMJBPTVL.method359(var44).field1010 = var45;
				OMJBPTVL.method359(var44).field1014 = var46.field1475;
				OMJBPTVL.method359(var44).field1015 = var46.field1454;
				OMJBPTVL.method359(var44).field1013 = var46.field1430 * 100 / var43;
				field230 = -1;
				return true;
			}

			if (field230 == 169) {
				int var47 = field290.method470();
				int var48 = field290.method468();
				int var49 = field290.method470();
				if (var49 == 0xFFFF) {
					if (field125 < 50) {
						field482[field125] = (short) var47;
						field441[field125] = var48;
						field91[field125] = 0;
						field125++;
					}
				} else if (field411 && !field437 && field125 < 50) {
					field482[field125] = var47;
					field441[field125] = var48;
					field91[field125] = WBMSJJDO.field1332[var47] + var49;
					field125++;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 7) {
				int var50 = field290.method470();
				int var51 = field290.method497();
				int var52 = var51 >> 10 & 0x1F;
				int var53 = var51 >> 5 & 0x1F;
				int var54 = var51 & 0x1F;
				OMJBPTVL.method359(var50).field1070 = (var54 << 3) + (var52 << 19) + (var53 << 11);
				field230 = -1;
				return true;
			}

			if (field230 == 250) {
				int var55 = field290.method470();
				int var56 = field290.method498();

				if (field98 != -1) {
					method80(field98);
					field98 = -1;
					field153 = true;
				}

				if (field326 != -1) {
					method80(field326);
					field326 = -1;
					field223 = true;
				}

				if (field428 != -1) {
					method80(field428);
					field428 = -1;
				}

				if (field88 != var55) {
					method80(field88);
					field88 = var55;
				}

				if (field120 != var56) {
					method80(field120);
					field120 = var56;
				}

				if (field384 != 0) {
					field384 = 0;
					field153 = true;
				}

				field255 = true;
				field398 = true;
				field439 = false;
				field230 = -1;
				return true;
			}

			if (field230 == 237) {
				int var57 = field290.method470();
				int var58 = field290.method473();
				field317[var57] = var58;

				if (field341[var57] != var58) {
					field341[var57] = var58;
					method138(var57);
					field255 = true;

					if (field512 != -1) {
						field153 = true;
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 21) {
				byte var59 = field290.method492();
				int var60 = field290.method470();
				field317[var60] = var59;

				if (field341[var60] != var59) {
					field341[var60] = var59;
					method138(var60);
					field255 = true;

					if (field512 != -1) {
						field153 = true;
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 71) {
				field255 = true;
				int var61 = field290.method470();
				OMJBPTVL var62 = OMJBPTVL.method359(var61);
				int var63 = field290.method470();
				for (int var64 = 0; var64 < var63; var64++) {
					int var65 = field290.method488();
					if (var65 == 255) {
						var65 = field290.method503();
					}

					var62.field1030[var64] = field290.method470();
					var62.field1071[var64] = var65;
				}

				for (int var66 = var63; var66 < var62.field1030.length; var66++) {
					var62.field1030[var66] = 0;
					var62.field1071[var66] = 0;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 26) {
				field277 = field290.method496();
				field290.method497();
				field290.method487();
				field131 = field290.method470();
				field173 = field290.method503();
				field210 = field290.method496();
				field290.method498();
				field462 = field290.method496();
				field324 = field290.method497();
				field290.method470();
				field164 = field290.method498();
				signlink.dnslookup(PZGHUCRX.method408(field173));
				field230 = -1;
				return true;
			}

			if (field230 == 146) {
				field356 = field290.method489();
				field255 = true;
				field398 = true;
				field230 = -1;
				return true;
			}

			if (field230 == 33) {
				int var67 = field290.method468();
				int var68 = field290.method468();
				int var69 = field290.method468();
				int var70 = field290.method468();
				field340[var67] = true;
				field486[var67] = var68;
				field284[var67] = var69;
				field165[var67] = var70;
				field102[var67] = 0;
				field230 = -1;
				return true;
			}

			if (field230 == 46) {
				int var71 = field290.method470();
				method143(var71);

				if (field98 != -1) {
					method80(field98);
					field98 = -1;
					field153 = true;
				}

				if (field326 != -1) {
					method80(field326);
					field326 = -1;
					field223 = true;
				}

				if (field428 != -1) {
					method80(field428);
					field428 = -1;
				}

				if (field88 != -1) {
					method80(field88);
					field88 = -1;
				}

				if (field120 != var71) {
					method80(field120);
					field120 = var71;
				}

				if (field384 != 0) {
					field384 = 0;
					field153 = true;
				}

				field255 = true;
				field398 = true;
				field439 = false;
				field230 = -1;
				return true;
			}

			if (field230 == 90) {
				int var72 = field290.method498();
				method143(var72);

				if (field120 != -1) {
					method80(field120);
					field120 = -1;
					field255 = true;
					field398 = true;
				}

				if (field98 != -1) {
					method80(field98);
					field98 = -1;
					field153 = true;
				}

				if (field326 != -1) {
					method80(field326);
					field326 = -1;
					field223 = true;
				}

				if (field428 != -1) {
					method80(field428);
					field428 = -1;
				}

				if (field88 != var72) {
					method80(field88);
					field88 = var72;
				}

				if (field384 != 0) {
					field384 = 0;
					field153 = true;
				}

				field439 = false;
				field230 = -1;
				return true;
			}

			if (field230 == 66) {
				field146 = field229 / 8;
				for (int var73 = 0; var73 < field146; var73++) {
					field282[var73] = field290.method474();
				}

				field230 = -1;
				return true;
			}

			if (field230 == 104) {
				field90 = field290.method487();
				field89 = field290.method488();
				for (int var74 = field89; var74 < field89 + 8; var74++) {
					for (int var75 = field90; var75 < field90 + 8; var75++) {
						if (field124[field211][var74][var75] != null) {
							field124[field211][var74][var75] = null;
							method98(var74, var75);
						}
					}
				}

				for (KOXMDHST var76 = (KOXMDHST) field346.method179(); var76 != null; var76 = (KOXMDHST) field346.method181()) {
					if (var76.field853 >= field89 && var76.field853 < field89 + 8 && var76.field854 >= field90 && var76.field854 < field90 + 8 && field211 == var76.field851) {
						var76.field847 = 0;
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 94) {
				for (int var77 = 0; var77 < field341.length; var77++) {
					if (field341[var77] != field317[var77]) {
						field341[var77] = field317[var77];
						method138(var77);
						field255 = true;
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 123) {
				int var78 = field290.method497();
				boolean var79 = field290.method489() == 1;
				OMJBPTVL.method359(var78).field1036 = var79;
				field230 = -1;
				return true;
			}

			if (field230 == 177) {
				field166 = field290.method468();
				if (field356 == field166) {
					if (field166 == 3) {
						field356 = 1;
					} else {
						field356 = 3;
					}

					field255 = true;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 59) {
				field85 = false;

				for (int var80 = 0; var80 < 5; var80++) {
					field340[var80] = false;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 225) {
				int var81 = field290.method470();
				int var82 = field290.method497();
				OMJBPTVL.method359(var82).field1009 = 2;
				OMJBPTVL.method359(var82).field1010 = var81;
				field230 = -1;
				return true;
			}

			if (field230 == 189) {
				int var83 = field290.method500();
				if (field512 != var83) {
					method80(field512);
					field512 = var83;
				}

				field153 = true;
				field230 = -1;
				return true;
			}

			if (field230 == 188) {
				field89 = field290.method487();
				field90 = field290.method489();
				field230 = -1;
				return true;
			}

			if (field230 == 25) {
				int var84 = field290.method498();
				int var85 = field290.method498();
				OMJBPTVL.method359(var85).field1009 = 1;
				OMJBPTVL.method359(var85).field1010 = var84;
				field230 = -1;
				return true;
			}

			if (field230 == 100) {
				field255 = true;
				int var86 = field290.method470();
				OMJBPTVL var87 = OMJBPTVL.method359(var86);
				while (field290.field1263 < field229) {
					int var88 = field290.method482();
					int var89 = field290.method470();
					int var90 = field290.method468();
					if (var90 == 255) {
						var90 = field290.method473();
					}

					if (var88 >= 0 && var88 < var87.field1030.length) {
						var87.field1030[var88] = var89;
						var87.field1071[var88] = var90;
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 190) {
				field85 = true;
				field491 = field290.method468();
				field492 = field290.method468();
				field493 = field290.method470();
				field494 = field290.method468();
				field495 = field290.method468();
				if (field495 >= 100) {
					field328 = field491 * 128 + 64;
					field330 = field492 * 128 + 64;
					field329 = method109(field330, field328, field211) - field493;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 252) {
				String var91 = field290.method475();
				if (var91.endsWith(":tradereq:")) {
					String var92 = var91.substring(0, var91.indexOf(":"));
					long var93 = PZGHUCRX.method405(var92);
					boolean var95 = false;
					for (int var96 = 0; var96 < field146; var96++) {
						if (field282[var96] == var93) {
							var95 = true;
							break;
						}
					}

					if (!var95 && field259 == 0) {
						method133(var92, "wishes to trade with you.", 4);
					}
				} else if (var91.endsWith(":duelreq:")) {
					String var97 = var91.substring(0, var91.indexOf(":"));
					long var98 = PZGHUCRX.method405(var97);
					boolean var100 = false;
					for (int var101 = 0; var101 < field146; var101++) {
						if (field282[var101] == var98) {
							var100 = true;
							break;
						}
					}

					if (!var100 && field259 == 0) {
						method133(var97, "wishes to duel with you.", 8);
					}
				} else if (var91.endsWith(":chalreq:")) {
					String var102 = var91.substring(0, var91.indexOf(":"));
					long var103 = PZGHUCRX.method405(var102);
					boolean var105 = false;
					for (int var106 = 0; var106 < field146; var106++) {
						if (field282[var106] == var103) {
							var105 = true;
							break;
						}
					}

					if (!var105 && field259 == 0) {
						String var107 = var91.substring(var91.indexOf(":") + 1, var91.length() - 9);
						method133(var102, var107, 8);
					}
				} else {
					method133("", var91, 0);
				}

				field230 = -1;
				return true;
			}

			if (field230 == 8) {
				int var108 = field290.method498();
				int var109 = field290.method500();
				OMJBPTVL var110 = OMJBPTVL.method359(var108);
				if (var110.field1056 != var109 || var109 == -1) {
					var110.field1056 = var109;
					var110.field1029 = 0;
					var110.field1021 = 0;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 127) {
				int var111 = field290.method470();
				String var112 = field290.method475();
				OMJBPTVL.method359(var111).field1047 = var112;

				if (field502[field356] == OMJBPTVL.method359(var111).field1045) {
					field255 = true;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 93) {
				if (field120 != -1) {
					method80(field120);
					field120 = -1;
					field255 = true;
					field398 = true;
				}

				if (field98 != -1) {
					method80(field98);
					field98 = -1;
					field153 = true;
				}

				if (field326 != -1) {
					method80(field326);
					field326 = -1;
					field223 = true;
				}

				if (field428 != -1) {
					method80(field428);
					field428 = -1;
				}

				if (field88 != -1) {
					method80(field88);
					field88 = -1;
				}

				if (field384 != 0) {
					field384 = 0;
					field153 = true;
				}

				field439 = false;
				field230 = -1;
				return true;
			}

			if (field230 == 243) {
				int var113 = field290.method498();
				int var114 = field290.method500();
				int var115 = field290.method471();
				OMJBPTVL var116 = OMJBPTVL.method359(var113);
				var116.field1012 = var115;
				var116.field1062 = var114;
				field230 = -1;
				return true;
			}

			if (field230 == 185 || field230 == 47 || field230 == 128 || field230 == 210 || field230 == 160 || field230 == 187 || field230 == 91 || field230 == 69 || field230 == 255 || field230 == 103 || field230 == 14) {
				method113(field230, field290);
				field230 = -1;
				return true;
			}

			if (field230 == 113) {
				field243 = field290.method498() * 30;
				field230 = -1;
				return true;
			}

			if (field230 == 55) {
				int var117 = field290.method496();
				int var118 = field290.method498();
				int var119 = field290.method496();
				OMJBPTVL.method359(var118).field1023 = (var117 << 16) + var119;
				field230 = -1;
				return true;
			}

			if (field230 == 251) {
				int var120 = field290.method497();
				if (var120 == 0xFFFF) {
					var120 = -1;
				}

				if (field167 != var120 && field100 && !field437 && field252 == 0) {
					field127 = var120;
					field128 = true;
					field171.method213(2, field127);
				}

				field167 = var120;
				field230 = -1;
				return true;
			}

			if (field230 == 41) {
				int var121 = field290.method498();
				int var122 = field290.method472();
				if (field100 && !field437) {
					field127 = var121;
					field128 = false;
					field171.method213(2, field127);
					field252 = var122;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 108) {
				int var123 = field290.method496();
				int var124 = field290.method497();
				int var125 = field290.method470();
				int var126 = field290.method498();
				OMJBPTVL.method359(var124).field1014 = var126;
				OMJBPTVL.method359(var124).field1015 = var123;
				OMJBPTVL.method359(var124).field1013 = var125;
				field230 = -1;
				return true;
			}

			if (field230 == 173) {
				for (int var127 = 0; var127 < field366.length; var127++) {
					if (field366[var127] != null) {
						field366[var127].field717 = -1;
					}
				}

				for (int var128 = 0; var128 < field113.length; var128++) {
					if (field113[var128] != null) {
						field113[var128].field717 = -1;
					}
				}

				field230 = -1;
				return true;
			}

			if (field230 == 99) {
				method169(field290, field229);
				field230 = -1;
				return true;
			}

			if (field230 == 229) {
				int var129 = field290.method496();
				method143(var129);

				if (field120 != -1) {
					method80(field120);
					field120 = -1;
					field255 = true;
					field398 = true;
				}

				if (field326 != -1) {
					method80(field326);
					field326 = -1;
					field223 = true;
				}

				if (field428 != -1) {
					method80(field428);
					field428 = -1;
				}

				if (field88 != -1) {
					method80(field88);
					field88 = -1;
				}

				if (field98 != var129) {
					method80(field98);
					field98 = var129;
				}

				field439 = false;
				field153 = true;
				field230 = -1;
				return true;
			}

			if (field230 == 85) {
				field300 = field290.method468();
				field355 = field290.method468();
				field228 = field290.method468();
				field333 = true;
				field153 = true;
				field230 = -1;
				return true;
			}

			if (field230 == 171) {
				field130 = field290.method498();
				field350 = field290.method488();
				field230 = -1;
				return true;
			}

			if (field230 == 12) {
				if (field356 == 12) {
					field255 = true;
				}

				field145 = field290.method471();
				field230 = -1;
				return true;
			}

			if (field230 == 95 || field230 == 81) {
				int var130 = field103;
				int var131 = field104;
				if (field230 == 95) {
					var131 = field290.method498();
					var130 = field290.method497();
					field97 = false;
				}

				if (field230 == 81) {
					var131 = field290.method498();
					field290.method478();

					for (int var132 = 0; var132 < 4; var132++) {
						for (int var133 = 0; var133 < 13; var133++) {
							for (int var134 = 0; var134 < 13; var134++) {
								int var135 = field290.method479(1);
								if (var135 == 1) {
									field218[var132][var133][var134] = field290.method479(26);
								} else {
									field218[var132][var133][var134] = -1;
								}
							}
						}
					}

					field290.method480();
					var130 = field290.method497();
					field97 = true;
				}

				if (field103 == var130 && field104 == var131 && field82 == 2) {
					field230 = -1;
					return true;
				}

				field103 = var130;
				field104 = var131;
				field418 = (field103 - 6) * 8;
				field419 = (field104 - 6) * 8;
				field236 = false;
				if ((field103 / 8 == 48 || field103 / 8 == 49) && field104 / 8 == 48) {
					field236 = true;
				}

				if (field103 / 8 == 48 && field104 / 8 == 148) {
					field236 = true;
				}

				field82 = 1;
				field237 = System.currentTimeMillis();
				method54("Loading - please wait.", null);

				if (field230 == 95) {
					int var136 = 0;
					for (int var137 = (field103 - 6) / 8; var137 <= (field103 + 6) / 8; var137++) {
						for (int var138 = (field104 - 6) / 8; var138 <= (field104 + 6) / 8; var138++) {
							var136++;
						}
					}

					field498 = new byte[var136][];
					field152 = new byte[var136][];
					field219 = new int[var136];
					field220 = new int[var136];
					field221 = new int[var136];
					int var139 = 0;
					for (int var140 = (field103 - 6) / 8; var140 <= (field103 + 6) / 8; var140++) {
						for (int var141 = (field104 - 6) / 8; var141 <= (field104 + 6) / 8; var141++) {
							field219[var139] = (var140 << 8) + var141;

							if (field236 && (var141 == 49 || var141 == 149 || var141 == 147 || var140 == 50 || var140 == 49 && var141 == 47)) {
								field220[var139] = -1;
								field221[var139] = -1;
								var139++;
							} else {
								int var142 = field220[var139] = field171.method207(var141, var140, 0);
								if (var142 != -1) {
									field171.method213(3, var142);
								}

								int var143 = field221[var139] = field171.method207(var141, var140, 1);
								if (var143 != -1) {
									field171.method213(3, var143);
								}

								var139++;
							}
						}
					}
				}

				if (field230 == 81) {
					int var144 = 0;
					int[] var145 = new int[676];
					for (int var146 = 0; var146 < 4; var146++) {
						for (int var147 = 0; var147 < 13; var147++) {
							for (int var148 = 0; var148 < 13; var148++) {
								int var149 = field218[var146][var147][var148];
								if (var149 != -1) {
									int var150 = var149 >> 14 & 0x3FF;
									int var151 = var149 >> 3 & 0x7FF;
									int var152 = (var150 / 8 << 8) + var151 / 8;
									for (int var153 = 0; var153 < var144; var153++) {
										if (var145[var153] == var152) {
											var152 = -1;
											break;
										}
									}

									if (var152 != -1) {
										var145[var144++] = var152;
									}
								}
							}
						}
					}

					field498 = new byte[var144][];
					field152 = new byte[var144][];
					field219 = new int[var144];
					field220 = new int[var144];
					field221 = new int[var144];
					for (int var154 = 0; var154 < var144; var154++) {
						int var155 = field219[var154] = var145[var154];
						int var156 = var155 >> 8 & 0xFF;
						int var157 = var155 & 0xFF;
						int var158 = field220[var154] = field171.method207(var157, var156, 0);
						if (var158 != -1) {
							field171.method213(3, var158);
						}

						int var159 = field221[var154] = field171.method207(var157, var156, 1);
						if (var159 != -1) {
							field171.method213(3, var159);
						}
					}
				}

				int var160 = field418 - field420;
				int var161 = field419 - field421;
				field420 = field418;
				field421 = field419;

				for (int var162 = 0; var162 < 16384; var162++) {
					GYKYBIID var163 = field113[var162];
					if (var163 != null) {
						for (int var164 = 0; var164 < 10; var164++) {
							var163.field731[var164] -= var160;
							var163.field732[var164] -= var161;
						}

						var163.field734 -= var160 * 128;
						var163.field735 -= var161 * 128;
					}
				}

				for (int var165 = 0; var165 < field364; var165++) {
					DEHYKQII var166 = field366[var165];
					if (var166 != null) {
						for (int var167 = 0; var167 < 10; var167++) {
							var166.field731[var167] -= var160;
							var166.field732[var167] -= var161;
						}

						var166.field734 -= var160 * 128;
						var166.field735 -= var161 * 128;
					}
				}

				field154 = true;
				byte var168 = 0;
				byte var169 = 104;
				byte var170 = 1;
				if (var160 < 0) {
					var168 = 103;
					var169 = -1;
					var170 = -1;
				}

				byte var171 = 0;
				byte var172 = 104;
				byte var173 = 1;
				if (var161 < 0) {
					var171 = 103;
					var172 = -1;
					var173 = -1;
				}

				for (int var174 = var168; var174 != var169; var174 += var170) {
					for (int var175 = var171; var175 != var172; var175 += var173) {
						int var176 = var160 + var174;
						int var177 = var161 + var175;
						for (int var178 = 0; var178 < 4; var178++) {
							if (var176 >= 0 && var177 >= 0 && var176 < 104 && var177 < 104) {
								field124[var178][var174][var175] = field124[var178][var176][var177];
							} else {
								field124[var178][var174][var175] = null;
							}
						}
					}
				}

				for (KOXMDHST var179 = (KOXMDHST) field346.method179(); var179 != null; var179 = (KOXMDHST) field346.method181()) {
					var179.field853 -= var160;
					var179.field854 -= var161;
					if (var179.field853 < 0 || var179.field854 < 0 || var179.field853 >= 104 || var179.field854 >= 104) {
						var179.method272();
					}
				}

				if (field308 != 0) {
					field308 -= var160;
					field309 -= var161;
				}

				field85 = false;
				field230 = -1;
				return true;
			}

			if (field230 == 133) {
				field308 = 0;
				field230 = -1;
				return true;
			}

			if (field230 == 101) {
				int var180 = field290.method470();
				int var181 = field290.method488();

				if (var180 == 0xFFFF) {
					var180 = -1;
				}

				if (field502[var181] != var180) {
					method80(field502[var181]);
					field502[var181] = var180;
				}

				field255 = true;
				field398 = true;
				field230 = -1;
				return true;
			}

			if (field230 == 220) {
				int var182 = field290.method498();
				OMJBPTVL.method359(var182).field1009 = 3;

				if (field269.field550 == null) {
					OMJBPTVL.method359(var182).field1010 = (field269.field532[11] << 5) + (field269.field532[8] << 10) + (field269.field532[0] << 15) + (field269.field530[0] << 25) + (field269.field530[4] << 20) + field269.field532[1];
				} else {
					OMJBPTVL.method359(var182).field1010 = (int) (field269.field550.field1405 + 0x12345678L);
				}

				field230 = -1;
				return true;
			}

			if (field230 == 30) {
				field178 = field290.method468();
				field230 = -1;
				return true;
			}

			if (field230 == 80) {
				field504 = field290.method468();
				field230 = -1;
				return true;
			}

			if (field230 == 155) {
				field180 = field290.method468();
				if (field180 == 1) {
					field224 = field290.method470();
				}

				if (field180 >= 2 && field180 <= 6) {
					if (field180 == 2) {
						field390 = 64;
						field391 = 64;
					}

					if (field180 == 3) {
						field390 = 0;
						field391 = 64;
					}

					if (field180 == 4) {
						field390 = 128;
						field391 = 64;
					}

					if (field180 == 5) {
						field390 = 64;
						field391 = 0;
					}

					if (field180 == 6) {
						field390 = 64;
						field391 = 128;
					}

					field180 = 2;
					field387 = field290.method470();
					field388 = field290.method470();
					field389 = field290.method468();
				}

				if (field180 == 10) {
					field481 = field290.method470();
				}

				field230 = -1;
				return true;
			}

			if (field230 == 186) {
				int var183 = field290.method470();
				OMJBPTVL var184 = OMJBPTVL.method359(var183);
				for (int var185 = 0; var185 < var184.field1030.length; var185++) {
					var184.field1030[var185] = -1;
					var184.field1030[var185] = 0;
				}

				field230 = -1;
				return true;
			}

			if (field230 == 211) {
				field447 = false;
				field384 = 2;
				field301 = "";
				field153 = true;
				field230 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field230 + "," + field229 + " - " + field186 + "," + field187);
			method53();
		} catch (IOException var190) {
			method60();
		} catch (Exception var191) {
			String var187 = "T2 - " + field230 + "," + field186 + "," + field187 + " - " + field229 + "," + (field269.field731[0] + field418) + "," + (field269.field732[0] + field419) + " - ";
			for (int var188 = 0; var188 < field229 && var188 < 50; var188++) {
				var187 = var187 + field290.field1262[var188] + ",";
			}

			signlink.reporterror(var187);
			method53();
		}

		return true;
	}

	@ObfuscatedName("client.h(I)V")
	public final void method35() {
		for (int var1 = 0; var1 < field125; var1++) {
			if (field91[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field482[var1] != field160 || field441[var1] != field417) {
						TQYMAXSO var3 = WBMSJJDO.method545(field441[var1], field482[var1]);
						if (System.currentTimeMillis() + var3.field1263 / 22 > field406 / 22 + field84) {
							field406 = var3.field1263;
							field84 = System.currentTimeMillis();

							if (method140(var3.field1262, var3.field1263)) {
								field160 = field482[var1];
								field417 = field441[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method57()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field83.method457(189);
						field83.method459(field482[var1] & 0x7FFF);
					} else {
						field83.method457(189);
						field83.method459(-1);
					}
				}

				if (var2 && field91[var1] != -5) {
					field91[var1] = -5;
				} else {
					field125--;
					for (int var5 = var1; var5 < field125; var5++) {
						field482[var5] = field482[var5 + 1];
						field441[var5] = field441[var5 + 1];
						field91[var5] = field91[var5 + 1];
					}

					var1--;
				}
			} else {
				field91[var1]--;
			}
		}

		if (field252 > 0) {
			field252 -= 20;
			if (field252 < 0) {
				field252 = 0;
			}

			if (field252 == 0 && field100 && !field437) {
				field127 = field167;
				field128 = true;
				field171.method213(2, field127);
				return;
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method36() {
		if (field504 == 0 && field1190 == 1) {
			int var1 = field1191 - 25 - 550;
			int var2 = field1192 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field265 + field262 & 0x7FF;
				int var4 = SNMMFOLO.field1216[var3];
				int var5 = SNMMFOLO.field1217[var3];
				var4 = (field484 + 256) * var4 >> 8;
				var5 = (field484 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field269.field734 + var6 >> 7;
				int var9 = field269.field735 - var7 >> 7;
				boolean var10 = method73(0, 0, 1, true, 0, 0, field269.field732[0], var9, 0, var8, field269.field731[0]);
				if (var10) {
					field83.method458(var1);
					field83.method458(var2);
					field83.method459(field262);
					field83.method458(57);
					field83.method458(field265);
					field83.method458(field484);
					field83.method458(89);
					field83.method459(field269.field734);
					field83.method459(field269.field735);
					field83.method458(field274);
					field83.method458(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)Z")
	public final boolean method37(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field476[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 646) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method38() {
		for (LQFXNPID var1 = (LQFXNPID) field208.method179(); var1 != null; var1 = (LQFXNPID) field208.method181()) {
			if (field211 != var1.field887 || var1.field886) {
				var1.method272();
			} else if (field258 >= var1.field883) {
				var1.method282(field172);

				if (var1.field886) {
					var1.method272();
				} else {
					field450.method295(var1.field889, -1, var1.field887, var1.field888, var1, 60, 0, false, var1.field890);
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method39() {
		while (true) {
			VOTBAEIQ var1 = field171.method214();
			if (var1 == null) {
				return;
			}

			if (var1.field1327 == 0) {
				KDWDYCIL.method244(var1.field1329, var1.field1330);

				if ((field171.method220(var1.field1330) & 0x62) != 0) {
					field255 = true;

					if (field98 != -1 || field512 != -1) {
						field153 = true;
					}
				}
			}

			if (var1.field1327 == 1 && var1.field1329 != null) {
				SGSYCWFB.method420(var1.field1329);
			}

			if (var1.field1327 == 2 && field127 == var1.field1330 && var1.field1329 != null) {
				method144(field128, var1.field1329);
			}

			if (var1.field1327 == 3 && field82 == 1) {
				for (int var2 = 0; var2 < field498.length; var2++) {
					if (field220[var2] == var1.field1330) {
						field498[var2] = var1.field1329;

						if (var1.field1329 == null) {
							field220[var2] = -1;
						}

						break;
					}

					if (field221[var2] == var1.field1330) {
						field152[var2] = var1.field1329;

						if (var1.field1329 == null) {
							field221[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1327 == 93 && field171.method205(var1.field1330)) {
				AGPNOIRK.method14(field171, new TQYMAXSO(var1.field1329));
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method40(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method41(boolean arg0) {
		if (field269.field734 >> 7 == field308 && field269.field735 >> 7 == field309) {
			field308 = 0;
		}

		int var2 = field367;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			DEHYKQII var4;
			int var5;
			if (arg0) {
				var4 = field269;
				var5 = field365 << 14;
			} else {
				var4 = field366[field368[var3]];
				var5 = field368[var3] << 14;
			}

			if (var4 != null && var4.method188()) {
				var4.field536 = false;
				if ((field437 && field367 > 50 || field367 > 200) && !arg0 && var4.field713 == var4.field693) {
					var4.field536 = true;
				}

				int var6 = var4.field734 >> 7;
				int var7 = var4.field735 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field545 == null || field258 < var4.field534 || field258 >= var4.field535) {
						if ((var4.field734 & 0x7F) == 0x40 && (var4.field735 & 0x7F) == 0x40) {
							if (field377[var6][var7] == field490) {
								continue;
							}

							field377[var6][var7] = field490;
						}

						var4.field540 = method109(var4.field735, var4.field734, field211);
						field450.method295(var4.field735, var5, field211, var4.field734, var4, 60, var4.field736, var4.field706, var4.field540);
					} else {
						var4.field536 = false;
						var4.field540 = method109(var4.field735, var4.field734, field211);
						field450.method296(60, var4.field734, var4.field735, var4.field736, var4.field547, var5, var4.field546, var4, var4.field540, var4.field549, var4.field548, field211);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method42() {
		WEWSMZTU.field1380.method232();
		WEWSMZTU.field1355.method232();
		YANZSPIT.field1399.method232();
		YDSJAZFL.field1441.method232();
		YDSJAZFL.field1449.method232();
		DEHYKQII.field538.method232();
		QUXKFXEA.field1160.method232();
	}

	@ObfuscatedName("client.a(BIILTPUDHOHI;)V")
	public final void method43(int arg0, int arg1, TPUDHOHI arg2) {
		if (arg2 != null) {
			int var4 = field265 + field262 & 0x7FF;
			int var5 = arg0 * arg0 + arg1 * arg1;
			if (var5 <= 6400) {
				int var6 = KDWDYCIL.field828[var4];
				int var7 = KDWDYCIL.field829[var4];
				var6 = var6 * 256 / (field484 + 256);
				var7 = var7 * 256 / (field484 + 256);
				int var8 = arg0 * var6 + arg1 * var7 >> 16;
				int var9 = arg0 * var7 - arg1 * var6 >> 16;
				if (var5 > 2500) {
					arg2.method454(83 - var9 - arg2.field1261 / 2 - 4, var8 + 94 - arg2.field1260 / 2 + 4, field192);
				} else {
					arg2.method448(var8 + 94 + 4 - arg2.field1260 / 2, 83 - var9 - arg2.field1261 / 2 - 4);
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method44() {
		field464.method541();

		if (field504 == 2) {
			byte[] var1 = field192.field1312;
			int[] var2 = MVOWZCMY.field977;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field345.method452(0, field354, 25, 256, 33, 33, 25, 0, field399, field262);
			field465.method541();
			SNMMFOLO.field1218 = field404;
		} else {
			int var5 = field265 + field262 & 0x7FF;
			int var6 = field269.field734 / 32 + 48;
			int var7 = 464 - field269.field735 / 32;
			field310.method452(25, field123, var6, field484 + 256, 151, 146, var7, 5, field182, var5);
			field345.method452(0, field354, 25, 256, 33, 33, 25, 0, field399, field262);

			for (int var8 = 0; var8 < field407; var8++) {
				int var9 = field408[var8] * 4 + 2 - field269.field734 / 32;
				int var10 = field409[var8] * 4 + 2 - field269.field735 / 32;
				method43(var10, var9, field119[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					CRZPTUPR var13 = field124[field211][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field269.field734 / 32;
						int var15 = var12 * 4 + 2 - field269.field735 / 32;
						method43(var15, var14, field285);
					}
				}
			}

			for (int var16 = 0; var16 < field114; var16++) {
				GYKYBIID var17 = field113[field115[var16]];
				if (var17 != null && var17.method188()) {
					YANZSPIT var18 = var17.field625;
					if (var18.field1413 != null) {
						var18 = var18.method568();
					}

					if (var18 != null && var18.field1408 && var18.field1409) {
						int var19 = var17.field734 / 32 - field269.field734 / 32;
						int var20 = var17.field735 / 32 - field269.field735 / 32;
						method43(var20, var19, field286);
					}
				}
			}

			for (int var21 = 0; var21 < field367; var21++) {
				DEHYKQII var22 = field366[field368[var21]];
				if (var22 != null && var22.method188()) {
					int var23 = var22.field734 / 32 - field269.field734 / 32;
					int var24 = var22.field735 / 32 - field269.field735 / 32;
					boolean var25 = false;
					long var26 = PZGHUCRX.method405(var22.field541);
					for (int var28 = 0; var28 < field500; var28++) {
						if (field215[var28] == var26 && field118[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field269.field528 != 0 && var22.field528 != 0 && field269.field528 == var22.field528) {
						var29 = true;
					}

					if (var25) {
						method43(var24, var23, field288);
					} else if (var29) {
						method43(var24, var23, field289);
					} else {
						method43(var24, var23, field287);
					}
				}
			}

			if (field180 != 0 && field258 % 20 < 10) {
				if (field180 == 1 && field224 >= 0 && field224 < field113.length) {
					GYKYBIID var30 = field113[field224];
					if (var30 != null) {
						int var31 = var30.field734 / 32 - field269.field734 / 32;
						int var32 = var30.field735 / 32 - field269.field735 / 32;
						method88(field226, var32, var31);
					}
				}

				if (field180 == 2) {
					int var33 = (field387 - field418) * 4 + 2 - field269.field734 / 32;
					int var34 = (field388 - field419) * 4 + 2 - field269.field735 / 32;
					method88(field226, var34, var33);
				}

				if (field180 == 10 && field481 >= 0 && field481 < field366.length) {
					DEHYKQII var35 = field366[field481];
					if (var35 != null) {
						int var36 = var35.field734 / 32 - field269.field734 / 32;
						int var37 = var35.field735 / 32 - field269.field735 / 32;
						method88(field226, var37, var36);
					}
				}
			}

			if (field308 != 0) {
				int var38 = field308 * 4 + 2 - field269.field734 / 32;
				int var39 = field309 * 4 + 2 - field269.field735 / 32;
				method43(var39, var38, field225);
			}

			MVOWZCMY.method345(3, 0xFFFFFF, 97, 3, 78);
			field465.method541();
			SNMMFOLO.field1218 = field404;
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method45(int arg0) {
		if (!field437) {
			for (int var2 = 0; var2 < field505.length; var2++) {
				int var3 = field505[var2];
				if (SNMMFOLO.field1226[var3] >= arg0) {
					VCTXURSE var4 = SNMMFOLO.field1220[var3];
					int var5 = var4.field1315 * var4.field1314 - 1;
					int var6 = field172 * var4.field1314 * 2;
					byte[] var7 = var4.field1312;
					byte[] var8 = field410;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1312 = var8;
					field410 = var7;
					SNMMFOLO.method431(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method46() {
		if (!field392 && !field440 && !field205) {
			field258++;

			if (field305) {
				method51();
			} else {
				method75();
			}

			method39();
		}
	}

	@ObfuscatedName("client.a(ZILTQYMAXSO;)V")
	public final void method47(int arg0, TQYMAXSO arg1) {
		arg1.method478();
		int var3 = arg1.method479(1);
		if (var3 != 0) {
			int var4 = arg1.method479(2);
			if (var4 == 0) {
				field370[field369++] = field365;
			} else if (var4 == 1) {
				int var5 = arg1.method479(3);
				field269.method226(false, var5);
				int var6 = arg1.method479(1);
				if (var6 == 1) {
					field370[field369++] = field365;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method479(3);
				field269.method226(true, var7);
				int var8 = arg1.method479(3);
				field269.method226(true, var8);
				int var9 = arg1.method479(1);
				if (var9 == 1) {
					field370[field369++] = field365;
				}
			} else if (var4 == 3) {
				field211 = arg1.method479(2);
				int var10 = arg1.method479(7);
				int var11 = arg1.method479(7);
				int var12 = arg1.method479(1);
				int var13 = arg1.method479(1);
				if (var13 == 1) {
					field370[field369++] = field365;
				}

				field269.method227(var12 == 1, var10, var11);
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method48() {
		if (field325 != 0) {
			ZGPIKWUW var1 = field149;
			int var2 = 0;
			if (field243 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field349[var3] != null) {
					int var4 = field347[var3];
					String var5 = field348[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field355 == 0 || field355 == 1 && method65(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method594(var7, 0, "From", var8);
						var1.method594(var7 - 1, 0xFFFF, "From", var8);
						int var11 = var8 + var1.method592("From ");
						if (var6 == 1) {
							field147[0].method539(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field147[1].method539(var11, var7 - 12);
							var11 += 14;
						}

						var1.method594(var7, 0, var5 + ": " + field349[var3], var11);
						var1.method594(var7 - 1, 0xFFFF, var5 + ": " + field349[var3], var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field355 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method594(var9, 0, field349[var3], 4);
						var1.method594(var9 - 1, 0xFFFF, field349[var3], 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field355 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method594(var10, 0, "To " + var5 + ": " + field349[var3], 4);
						var1.method594(var10 - 1, 0xFFFF, "To " + var5 + ": " + field349[var3], 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLOMJBPTVL;)Z")
	public final boolean method49(OMJBPTVL arg0) {
		int var2 = arg0.field1054;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field361[field401] = "Remove @whi@" + arg0.field1047;
				field476[field401] = 366;
				field401++;
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

		field361[field401] = "Remove @whi@" + field344[var2];
		field476[field401] = 978;
		field401++;
		field361[field401] = "Message @whi@" + field344[var2];
		field476[field401] = 34;
		field401++;
		return true;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method50() {
		Graphics var1 = method167().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method417(1);

		if (field440) {
			field487 = false;
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

		if (field205) {
			field487 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field392) {
			field487 = false;
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

	@ObfuscatedName("client.o(I)V")
	public final void method51() {
		if (field243 > 1) {
			field243--;
		}

		if (field233 > 0) {
			field233--;
		}

		for (int var1 = 0; var1 < 5 && method34(); var1++) {
		}

		if (field305) {
			synchronized (field397.field1389) {
				if (!field319) {
					field397.field1388 = 0;
				} else if (field1190 != 0 || field397.field1388 >= 40) {
					field83.method457(0);
					field83.method458(0);
					int var3 = field83.field1263;
					int var4 = 0;
					for (int var5 = 0; var5 < field397.field1388 && var3 - field83.field1263 < 240; var5++) {
						var4++;
						int var6 = field397.field1391[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field397.field1390[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field397.field1391[var5] == -1 && field397.field1390[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field459 != var7 || field460 != var6) {
							int var9 = var7 - field459;
							field459 = var7;
							int var10 = var6 - field460;
							field460 = var6;

							if (field415 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field83.method459((field415 << 12) + (var9 << 6) + var10);
								field415 = 0;
							} else if (field415 < 8) {
								field83.method461((field415 << 19) + var8 + 0x800000);
								field415 = 0;
							} else {
								field83.method462((field415 << 19) + var8 - 0x40000000);
								field415 = 0;
							}
						} else if (field415 < 2047) {
							field415++;
						}
					}

					field83.method467(field83.field1263 - var3);

					if (var4 >= field397.field1388) {
						field397.field1388 = 0;
					} else {
						field397.field1388 -= var4;
						for (int var11 = 0; var11 < field397.field1388; var11++) {
							field397.field1390[var11] = field397.field1390[var4 + var11];
							field397.field1391[var11] = field397.field1391[var4 + var11];
						}
					}
				}
			}

			if (field1190 != 0) {
				long var12 = (field1193 - field235) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field235 = field1193;
				int var14 = field1192;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1191;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1190 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field83.method457(3);
				field83.method501((var17 << 19) + (var18 << 20) + var16);
			}

			if (field134 > 0) {
				field134--;
			}

			if (field1194[1] == 1 || field1194[2] == 1 || field1194[3] == 1 || field1194[4] == 1) {
				field135 = true;
			}

			if (field135 && field134 <= 0) {
				field134 = 20;
				field135 = false;
				field83.method457(83);
				field83.method493(field261);
				field83.method493(field262);
			}

			if (field1181 && !field316) {
				field316 = true;
				field83.method457(174);
				field83.method458(1);
			}

			if (!field1181 && field316) {
				field316 = false;
				field83.method457(174);
				field83.method458(0);
			}

			method147();
			method175();
			method35();
			field231++;
			if (field231 > 750) {
				method60();
			}

			method100();
			method121();
			method171();
			field172++;

			if (field426 != 0) {
				field425 += 20;
				if (field425 >= 400) {
					field426 = 0;
				}
			}

			if (field510 != 0) {
				field507++;
				if (field507 >= 15) {
					if (field510 == 2) {
						field255 = true;
					}

					if (field510 == 3) {
						field153 = true;
					}

					field510 = 0;
				}
			}

			if (field337 != 0) {
				field351++;

				if (field1184 > field338 + 5 || field1184 < field338 - 5 || field1185 > field339 + 5 || field1185 < field339 - 5) {
					field497 = true;
				}

				if (field1183 == 0) {
					if (field337 == 2) {
						field255 = true;
					}

					if (field337 == 3) {
						field153 = true;
					}

					field337 = 0;

					if (field497 && field351 >= 5) {
						field159 = -1;
						method157();

						if (field335 == field159 && field336 != field158) {
							OMJBPTVL var19 = OMJBPTVL.method359(field335);
							byte var20 = 0;
							if (field451 == 1 && var19.field1054 == 206) {
								var20 = 1;
							}

							if (var19.field1030[field158] <= 0) {
								var20 = 0;
							}

							if (var19.field1002) {
								int var21 = field336;
								int var22 = field158;
								var19.field1030[var22] = var19.field1030[var21];
								var19.field1071[var22] = var19.field1071[var21];
								var19.field1030[var21] = -1;
								var19.field1071[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field336;
								int var24 = field158;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method356(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method356(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method356(field158, field336);
							}

							field83.method457(97);
							field83.method494(field158);
							field83.method494(field335);
							field83.method484(var20);
							field83.method495(field336);
						}
					} else if ((field81 == 1 || method37(field401 - 1)) && field401 > 2) {
						method164();
					} else if (field401 > 0) {
						method163(field401 - 1);
					}

					field507 = 10;
					field1190 = 0;
				}
			}

			if (MPMWDRAA.field926 != -1) {
				int var25 = MPMWDRAA.field926;
				int var26 = MPMWDRAA.field927;
				boolean var27 = method73(0, 0, 0, true, 0, 0, field269.field732[0], var26, 0, var25, field269.field731[0]);
				MPMWDRAA.field926 = -1;

				if (var27) {
					field423 = field1191;
					field424 = field1192;
					field426 = 1;
					field425 = 0;
				}
			}

			if (field1190 == 1 && field283 != null) {
				field283 = null;
				field153 = true;
				field1190 = 0;
			}

			method162();

			if (field326 == -1) {
				method36();
				method68();
				method116();
			}

			if (field1183 == 1 || field1190 == 1) {
				field307++;
			}

			if (field238 == 0 && field438 == 0 && field342 == 0) {
				if (field217 > 0) {
					field217--;
				}
			} else if (field217 < 100) {
				field217++;
				if (field217 == 100) {
					if (field238 != 0) {
						field153 = true;
					}

					if (field438 != 0) {
						field255 = true;
					}
				}
			}

			if (field82 == 2) {
				method59();
			}

			if (field82 == 2 && field85) {
				method120();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field102[var28]++;
			}

			method146();
			field1182++;
			if (field1182 > 4500) {
				field233 = 250;
				field1182 -= 500;
				field83.method457(61);
			}

			field386++;
			if (field386 > 500) {
				field386 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field189 += field190;
				}

				if ((var29 & 0x2) == 2) {
					field155 += field156;
				}

				if ((var29 & 0x4) == 4) {
					field244 += field245;
				}
			}

			if (field189 < -50) {
				field190 = 2;
			}

			if (field189 > 50) {
				field190 = -2;
			}

			if (field155 < -55) {
				field156 = 2;
			}

			if (field155 > 55) {
				field156 = -2;
			}

			if (field244 < -40) {
				field245 = 1;
			}

			if (field244 > 40) {
				field245 = -1;
			}

			field222++;
			if (field222 > 500) {
				field222 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field265 += field266;
				}

				if ((var30 & 0x2) == 2) {
					field484 += field485;
				}
			}

			if (field265 < -60) {
				field266 = 2;
			}

			if (field265 > 60) {
				field266 = -2;
			}

			if (field484 < -20) {
				field485 = 1;
			}

			if (field484 > 10) {
				field485 = -1;
			}

			field232++;
			if (field232 > 50) {
				field83.method457(235);
			}

			try {
				if (field95 != null && field83.field1263 > 0) {
					field95.method277(field83.field1263, 0, field83.field1262);
					field83.field1263 = 0;
					field232 = 0;
				}
			} catch (IOException var32) {
				method60();
			} catch (Exception var33) {
				method53();
			}
		}
	}

	@ObfuscatedName("client.a(IIIZ)I")
	public final int method52(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method53() {
		try {
			if (field95 != null) {
				field95.method273();
			}
		} catch (Exception var2) {
		}

		field95 = null;
		field305 = false;
		field108 = 0;
		field395 = "";
		field396 = "";
		method42();
		field450.method284();

		for (int var1 = 0; var1 < 4; var1++) {
			field472[var1].method515();
		}

		System.gc();
		method33();
		field167 = -1;
		field127 = -1;
		field252 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method54(String arg0, String arg1) {
		if (field465 != null) {
			field465.method541();
			SNMMFOLO.field1218 = field404;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field149.method590(0, 257, arg0, var3);
			field149.method590(0xFFFFFF, 256, arg0, var3 - 1);
			var3 += 15;
			if (arg1 != null) {
				field149.method590(0, 257, arg1, var3);
				field149.method590(0xFFFFFF, 256, arg1, var3 - 1);
			}

			field465.method542(4, 4, field1176);
		} else if (field1177 != null) {
			field1177.method541();
			SNMMFOLO.field1218 = field405;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			MVOWZCMY.method345(var5, 0, 383 - var5 / 2, var6, var4 - var6 / 2 - 5);
			MVOWZCMY.method346(383 - var5 / 2, 0xFFFFFF, var4 - var6 / 2 - 5, var5, var6);

			if (arg1 != null) {
				var4 -= 7;
			}

			field149.method590(0, 383, arg0, var4);
			field149.method590(0xFFFFFF, 382, arg0, var4 - 1);
			var4 += 15;
			if (arg1 != null) {
				field149.method590(0, 383, arg1, var4);
				field149.method590(0xFFFFFF, 382, arg1, var4 - 1);
			}

			field1177.method542(0, 0, field1176);
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method55(long arg0) {
		if (arg0 != 0L) {
			if (field146 >= 100) {
				method133("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = PZGHUCRX.method409(PZGHUCRX.method406(arg0));
				for (int var4 = 0; var4 < field146; var4++) {
					if (field282[var4] == arg0) {
						method133("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field500; var5++) {
					if (field215[var5] == arg0) {
						method133("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field282[field146++] = arg0;
				field255 = true;
				field83.method457(240);
				field83.method464(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(IBI)Z")
	public final boolean method56(int arg0, int arg1) {
		boolean var3 = false;
		OMJBPTVL var4 = OMJBPTVL.method359(arg0);
		for (int var5 = 0; var5 < var4.field1018.length && var4.field1018[var5] != -1; var5++) {
			OMJBPTVL var6 = OMJBPTVL.method359(var4.field1018[var5]);
			if (var6.field1008 == 0) {
				var3 |= method56(var6.field1065, arg1);
			}

			if (var6.field1008 == 6 && (var6.field1056 != -1 || var6.field1057 != -1)) {
				boolean var7 = method105(var6);
				int var8;
				if (var7) {
					var8 = var6.field1057;
				} else {
					var8 = var6.field1056;
				}

				if (var8 != -1) {
					LMDSPIVT var9 = LMDSPIVT.field867[var8];
					var6.field1021 += arg1;
					while (var6.field1021 > var9.method280(var6.field1029)) {
						var6.field1021 -= var9.method280(var6.field1029) + 1;
						var6.field1029++;
						if (var6.field1029 >= var9.field868) {
							var6.field1029 -= var9.field872;
							if (var6.field1029 < 0 || var6.field1029 >= var9.field868) {
								var6.field1029 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1008 == 6 && var6.field1023 != 0) {
				int var10 = var6.field1023 >> 16;
				int var11 = var6.field1023 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1014 = var6.field1014 + var10 & 0x7FF;
				var6.field1015 = var6.field1015 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.p(I)Z")
	public final boolean method57() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.q(I)V")
	public final void method58() {
		field313 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field487) {
				field303++;
				method96();
				method96();
				method29();
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

		field313 = false;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method59() {
		try {
			int var1 = field269.field734 + field189;
			int var2 = field269.field735 + field155;
			if (field132 - var1 < -500 || field132 - var1 > 500 || field133 - var2 < -500 || field133 - var2 > 500) {
				field132 = var1;
				field133 = var2;
			}

			if (field132 != var1) {
				field132 += (var1 - field132) / 16;
			}

			if (field133 != var2) {
				field133 += (var2 - field133) / 16;
			}

			if (field1194[1] == 1) {
				field263 += (-field263 - 24) / 2;
			} else if (field1194[2] == 1) {
				field263 += (24 - field263) / 2;
			} else {
				field263 /= 2;
			}

			if (field1194[3] == 1) {
				field264 += (12 - field264) / 2;
			} else if (field1194[4] == 1) {
				field264 += (-field264 - 12) / 2;
			} else {
				field264 /= 2;
			}

			field262 = field263 / 2 + field262 & 0x7FF;
			field261 += field264 / 2;
			if (field261 < 128) {
				field261 = 128;
			}

			if (field261 > 383) {
				field261 = 383;
			}

			int var3 = field132 >> 7;
			int var4 = field133 >> 7;
			int var5 = method109(field133, field132, field211);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field211;
						if (var9 < 3 && (field312[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field246[var9][var7][var8];
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

			if (var11 > field176) {
				field176 += (var11 - field176) / 24;
			} else if (var11 < field176) {
				field176 += (var11 - field176) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field269.field734 + "," + field269.field735 + "," + field132 + "," + field133 + "," + field103 + "," + field104 + "," + field418 + "," + field419);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method60() {
		if (field233 > 0) {
			method53();
		} else {
			method54("Connection lost", "Please wait - attempting to reestablish");
			field504 = 0;
			field308 = 0;
			LBXRBQZX var1 = field95;
			field305 = false;
			field511 = 0;
			method173(field395, field396, true);

			if (!field305) {
				method53();
			}

			try {
				var1.method273();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(IBLjava/lang/String;)V")
	public final void method61(int arg0, String arg1) {
		field207 = arg0;
		field86 = arg1;
		method168();

		if (field382 == null) {
			super.method61(arg0, arg1);
		} else {
			field138.method541();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field150.method590(0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			MVOWZCMY.method346(var3 / 2 - 152, 0x8C1111, var6, 304, 34);
			MVOWZCMY.method346(var3 / 2 - 151, 0, var6 + 1, 302, 32);
			MVOWZCMY.method345(arg0 * 3, 0x8C1111, var3 / 2 - 150, 30, var6 + 2);
			MVOWZCMY.method345(300 - arg0 * 3, 0, arg0 * 3 + var3 / 2 - 150, 30, var6 + 2);
			field150.method590(0xFFFFFF, var3 / 2, arg1, var4 / 2 + 5 - var5);
			field138.method542(171, 202, field1176);

			if (field223) {
				field223 = false;

				if (!field487) {
					field139.method542(0, 0, field1176);
					field140.method542(0, 637, field1176);
				}

				field136.method542(0, 128, field1176);
				field137.method542(371, 202, field1176);
				field141.method542(265, 0, field1176);
				field142.method542(265, 562, field1176);
				field143.method542(171, 128, field1176);
				field144.method542(171, 562, field1176);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIILOMJBPTVL;III)V")
	public final void method62(int arg0, int arg1, int arg2, int arg3, OMJBPTVL arg4, int arg5, int arg6, int arg7) {
		if (field314) {
			field181 = 32;
		} else {
			field181 = 0;
		}

		field314 = false;
		if (arg7 >= arg1 && arg7 < arg1 + 16 && arg3 >= arg6 && arg3 < arg6 + 16) {
			arg4.field1061 -= field307 * 4;

			if (arg5 == 1) {
				field255 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field153 = true;
			}
		} else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg3 >= arg0 + arg6 - 16 && arg3 < arg0 + arg6) {
			arg4.field1061 += field307 * 4;

			if (arg5 == 1) {
				field255 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field153 = true;
			}
		} else if (arg7 >= arg1 - field181 && arg7 < arg1 + field181 + 16 && arg3 >= arg6 + 16 && arg3 < arg0 + arg6 - 16 && field307 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg6 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg4.field1061 = (arg2 - arg0) * var10 / var11;

			if (arg5 == 1) {
				field255 = true;
			}

			if (arg5 == 2 || arg5 == 3) {
				field153 = true;
			}

			field314 = true;
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 2048 - arg5 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg1;
		if (var7 != 0) {
			int var12 = KDWDYCIL.field828[var7];
			int var13 = KDWDYCIL.field829[var7];
			int var14 = var10 * var13 - arg1 * var12 >> 16;
			var11 = var10 * var12 + arg1 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = KDWDYCIL.field828[var8];
			int var16 = KDWDYCIL.field829[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field328 = arg4 - var9;
		field329 = arg3 - var10;
		field330 = arg0 - var11;
		field331 = arg2;
		field332 = arg5;
	}

	@ObfuscatedName("client.a(IIBIILOMJBPTVL;II)V")
	public final void method64(int arg0, int arg1, int arg2, int arg3, OMJBPTVL arg4, int arg5, int arg6) {
		if (arg4.field1008 == 0 && arg4.field1018 != null && !arg4.field1036 && (arg2 >= arg0 && arg6 >= arg1 && arg2 <= arg4.field1064 + arg0 && arg6 <= arg4.field1037 + arg1)) {
			int var8 = arg4.field1018.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg4.field1063[var9] + arg0;
				int var11 = arg4.field1053[var9] + arg1 - arg3;
				OMJBPTVL var12 = OMJBPTVL.method359(arg4.field1018[var9]);
				var10 += var12.field1012;
				var11 += var12.field1062;
				if ((var12.field1017 >= 0 || var12.field1072 != 0) && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1064 + var10 && arg6 < var12.field1037 + var11) {
					if (var12.field1017 >= 0) {
						field359 = var12.field1017;
					} else {
						field359 = var12.field1065;
					}
				}

				if (var12.field1008 == 8 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1064 + var10 && arg6 < var12.field1037 + var11) {
					field488 = var12.field1065;
				}

				if (var12.field1008 == 0) {
					method64(var10, var11, arg2, var12.field1061, var12, arg5, arg6);

					if (var12.field1060 > var12.field1037) {
						method62(var12.field1037, var12.field1064 + var10, var12.field1060, arg6, var12, arg5, var11, arg2);
					}
				} else {
					if (var12.field1026 == 1 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1064 + var10 && arg6 < var12.field1037 + var11) {
						boolean var13 = false;
						if (var12.field1054 != 0) {
							var13 = method49(var12);
						}

						if (!var13) {
							field361[field401] = var12.field1004;
							field476[field401] = 451;
							field475[field401] = var12.field1065;
							field401++;
						}
					}

					if (var12.field1026 == 2 && field378 == 0 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1064 + var10 && arg6 < var12.field1037 + var11) {
						String var14 = var12.field1031;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field361[field401] = var14 + " @gre@" + var12.field1048;
						field476[field401] = 746;
						field475[field401] = var12.field1065;
						field401++;
					}

					if (var12.field1026 == 3 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1064 + var10 && arg6 < var12.field1037 + var11) {
						field361[field401] = "Close";

						if (arg5 == 3) {
							field476[field401] = 424;
						} else {
							field476[field401] = 618;
						}

						field475[field401] = var12.field1065;
						field401++;
					}

					if (var12.field1026 == 4 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1064 + var10 && arg6 < var12.field1037 + var11) {
						field361[field401] = var12.field1004;
						field476[field401] = 226;
						field475[field401] = var12.field1065;
						field401++;
					}

					if (var12.field1026 == 5 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1064 + var10 && arg6 < var12.field1037 + var11) {
						field361[field401] = var12.field1004;
						field476[field401] = 737;
						field475[field401] = var12.field1065;
						field401++;
					}

					if (var12.field1026 == 6 && !field439 && arg2 >= var10 && arg6 >= var11 && arg2 < var12.field1064 + var10 && arg6 < var12.field1037 + var11) {
						field361[field401] = var12.field1004;
						field476[field401] = 655;
						field475[field401] = var12.field1065;
						field401++;
					}

					if (var12.field1008 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1037; var16++) {
							for (int var17 = 0; var17 < var12.field1064; var17++) {
								int var18 = (var12.field1016 + 32) * var17 + var10;
								int var19 = (var12.field1051 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1006[var15];
									var19 += var12.field1022[var15];
								}

								if (arg2 >= var18 && arg6 >= var19 && arg2 < var18 + 32 && arg6 < var19 + 32) {
									field158 = var15;
									field159 = var12.field1065;

									if (var12.field1030[var15] > 0) {
										YDSJAZFL var20 = YDSJAZFL.method575(var12.field1030[var15] - 1);
										if (field372 == 1 && var12.field1066) {
											if (field374 != var12.field1065 || field373 != var15) {
												field361[field401] = "Use " + field376 + " with @lre@" + var20.field1476;
												field476[field401] = 940;
												field477[field401] = var20.field1433;
												field474[field401] = var15;
												field475[field401] = var12.field1065;
												field401++;
											}
										} else if (field378 != 1 || !var12.field1066) {
											if (var12.field1066) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1458 != null && var20.field1458[var21] != null) {
														field361[field401] = var20.field1458[var21] + " @lre@" + var20.field1476;

														if (var21 == 3) {
															field476[field401] = 800;
														}

														if (var21 == 4) {
															field476[field401] = 529;
														}

														field477[field401] = var20.field1433;
														field474[field401] = var15;
														field475[field401] = var12.field1065;
														field401++;
													} else if (var21 == 4) {
														field361[field401] = "Drop @lre@" + var20.field1476;
														field476[field401] = 529;
														field477[field401] = var20.field1433;
														field474[field401] = var15;
														field475[field401] = var12.field1065;
														field401++;
													}
												}
											}

											if (var12.field1039) {
												field361[field401] = "Use @lre@" + var20.field1476;
												field476[field401] = 11;
												field477[field401] = var20.field1433;
												field474[field401] = var15;
												field475[field401] = var12.field1065;
												field401++;
											}

											if (var12.field1066 && var20.field1458 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1458[var22] != null) {
														field361[field401] = var20.field1458[var22] + " @lre@" + var20.field1476;

														if (var22 == 0) {
															field476[field401] = 8;
														}

														if (var22 == 1) {
															field476[field401] = 581;
														}

														if (var22 == 2) {
															field476[field401] = 197;
														}

														field477[field401] = var20.field1433;
														field474[field401] = var15;
														field475[field401] = var12.field1065;
														field401++;
													}
												}
											}

											if (var12.field1042 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1042[var23] != null) {
														field361[field401] = var12.field1042[var23] + " @lre@" + var20.field1476;

														if (var23 == 0) {
															field476[field401] = 378;
														}

														if (var23 == 1) {
															field476[field401] = 350;
														}

														if (var23 == 2) {
															field476[field401] = 236;
														}

														if (var23 == 3) {
															field476[field401] = 815;
														}

														if (var23 == 4) {
															field476[field401] = 519;
														}

														field477[field401] = var20.field1433;
														field474[field401] = var15;
														field475[field401] = var12.field1065;
														field401++;
													}
												}
											}

											field361[field401] = "Examine @lre@" + var20.field1476;
											field476[field401] = 1107;
											field477[field401] = var20.field1433;
											field474[field401] = var15;
											field475[field401] = var12.field1065;
											field401++;
										} else if ((field380 & 0x10) == 0x10) {
											field361[field401] = field381 + " @lre@" + var20.field1476;
											field476[field401] = 666;
											field477[field401] = var20.field1433;
											field474[field401] = var15;
											field475[field401] = var12.field1065;
											field401++;
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

	@ObfuscatedName("client.a(Ljava/lang/String;Z)Z")
	public final boolean method65(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field500; var2++) {
			if (arg0.equalsIgnoreCase(field344[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field269.field541)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(LOMJBPTVL;B)Z")
	public final boolean method66(OMJBPTVL arg0) {
		int var2 = arg0.field1054;
		if (field501 == 2) {
			if (var2 == 201) {
				field153 = true;
				field384 = 0;
				field447 = true;
				field473 = "";
				field358 = 1;
				field385 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field153 = true;
				field384 = 0;
				field447 = true;
				field473 = "";
				field358 = 2;
				field385 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field233 = 250;
			return true;
		}

		if (var2 == 501) {
			field153 = true;
			field384 = 0;
			field447 = true;
			field473 = "";
			field358 = 4;
			field385 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field153 = true;
			field384 = 0;
			field447 = true;
			field473 = "";
			field358 = 5;
			field385 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field429[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = DOOZRHTX.field554 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= DOOZRHTX.field554) {
							var5 = 0;
						}
					}

					if (!DOOZRHTX.field555[var5].field561 && DOOZRHTX.field555[var5].field556 == var3 + (field362 ? 0 : 7)) {
						break;
					}
				}

				field429[var3] = var5;
				field239 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field163[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field242[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field242[var6].length) {
					var8 = 0;
				}
			}

			field163[var6] = var8;
			field239 = true;
		}

		if (var2 == 324 && !field362) {
			field362 = true;
			method174();
		}

		if (var2 == 325 && field362) {
			field362 = false;
			method174();
		}

		if (var2 == 326) {
			field83.method457(199);
			field83.method458(field362 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field83.method458(field429[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field83.method458(field163[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field267 = !field267;
		}

		if (var2 >= 601 && var2 <= 613) {
			method119();

			if (field327.length() > 0) {
				field83.method457(144);
				field83.method464(PZGHUCRX.method405(field327));
				field83.method458(var2 - 601);
				field83.method458(field267 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method67(String arg0) {
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

	@ObfuscatedName("client.e(B)V")
	public final void method68() {
		if (field1190 == 1) {
			if (field1191 >= 539 && field1191 <= 573 && field1192 >= 169 && field1192 < 205 && field502[0] != -1) {
				field255 = true;
				field356 = 0;
				field398 = true;
			}

			if (field1191 >= 569 && field1191 <= 599 && field1192 >= 168 && field1192 < 205 && field502[1] != -1) {
				field255 = true;
				field356 = 1;
				field398 = true;
			}

			if (field1191 >= 597 && field1191 <= 627 && field1192 >= 168 && field1192 < 205 && field502[2] != -1) {
				field255 = true;
				field356 = 2;
				field398 = true;
			}

			if (field1191 >= 625 && field1191 <= 669 && field1192 >= 168 && field1192 < 203 && field502[3] != -1) {
				field255 = true;
				field356 = 3;
				field398 = true;
			}

			if (field1191 >= 666 && field1191 <= 696 && field1192 >= 168 && field1192 < 205 && field502[4] != -1) {
				field255 = true;
				field356 = 4;
				field398 = true;
			}

			if (field1191 >= 694 && field1191 <= 724 && field1192 >= 168 && field1192 < 205 && field502[5] != -1) {
				field255 = true;
				field356 = 5;
				field398 = true;
			}

			if (field1191 >= 722 && field1191 <= 756 && field1192 >= 169 && field1192 < 205 && field502[6] != -1) {
				field255 = true;
				field356 = 6;
				field398 = true;
			}

			if (field1191 >= 540 && field1191 <= 574 && field1192 >= 466 && field1192 < 502 && field502[7] != -1) {
				field255 = true;
				field356 = 7;
				field398 = true;
			}

			if (field1191 >= 572 && field1191 <= 602 && field1192 >= 466 && field1192 < 503 && field502[8] != -1) {
				field255 = true;
				field356 = 8;
				field398 = true;
			}

			if (field1191 >= 599 && field1191 <= 629 && field1192 >= 466 && field1192 < 503 && field502[9] != -1) {
				field255 = true;
				field356 = 9;
				field398 = true;
			}

			if (field1191 >= 627 && field1191 <= 671 && field1192 >= 467 && field1192 < 502 && field502[10] != -1) {
				field255 = true;
				field356 = 10;
				field398 = true;
			}

			if (field1191 >= 669 && field1191 <= 699 && field1192 >= 466 && field1192 < 503 && field502[11] != -1) {
				field255 = true;
				field356 = 11;
				field398 = true;
			}

			if (field1191 >= 696 && field1191 <= 726 && field1192 >= 466 && field1192 < 503 && field502[12] != -1) {
				field255 = true;
				field356 = 12;
				field398 = true;
			}

			if (field1191 >= 724 && field1191 <= 758 && field1192 >= 466 && field1192 < 502 && field502[13] != -1) {
				field255 = true;
				field356 = 13;
				field398 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LTQYMAXSO;IB)V")
	public final void method69(TQYMAXSO arg0, int arg1) {
		while (arg0.field1264 + 10 < arg1 * 8) {
			int var3 = arg0.method479(11);
			if (var3 == 2047) {
				break;
			}

			if (field366[var3] == null) {
				field366[var3] = new DEHYKQII();
				if (field371[var3] != null) {
					field366[var3].method187(field371[var3]);
				}
			}

			field368[field367++] = var3;
			DEHYKQII var4 = field366[var3];
			var4.field689 = field258;
			int var5 = arg0.method479(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method479(1);
			int var7 = arg0.method479(1);
			if (var7 == 1) {
				field370[field369++] = var3;
			}

			int var8 = arg0.method479(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method227(var6 == 1, field269.field731[0] + var8, field269.field732[0] + var5);
		}

		arg0.method480();
	}

	@ObfuscatedName("client.b(IIB)V")
	public final void method70(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field349[var4] != null) {
				int var5 = field347[var4];
				int var6 = field106 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field348[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field300 == 0 || field300 == 1 && method65(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field269.field541)) {
						if (field270 >= 1) {
							field361[field401] = "Report abuse @whi@" + var7;
							field476[field401] = 550;
							field401++;
						}

						field361[field401] = "Add ignore @whi@" + var7;
						field476[field401] = 955;
						field401++;
						field361[field401] = "Add friend @whi@" + var7;
						field476[field401] = 646;
						field401++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field325 == 0 && (var5 == 7 || field355 == 0 || field355 == 1 && method65(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field270 >= 1) {
							field361[field401] = "Report abuse @whi@" + var7;
							field476[field401] = 550;
							field401++;
						}

						field361[field401] = "Add ignore @whi@" + var7;
						field476[field401] = 955;
						field401++;
						field361[field401] = "Add friend @whi@" + var7;
						field476[field401] = 646;
						field401++;
					}

					var3++;
				}

				if (var5 == 4 && (field228 == 0 || field228 == 1 && method65(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field361[field401] = "Accept trade @whi@" + var7;
						field476[field401] = 365;
						field401++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field325 == 0 && field355 < 2) {
					var3++;
				}

				if (var5 == 8 && (field228 == 0 || field228 == 1 && method65(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field361[field401] = "Accept challenge @whi@" + var7;
						field476[field401] = 355;
						field401++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZZ)V")
	public final void method71(boolean arg0) {
		method168();
		field138.method541();
		field93.method539(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field108 == 0) {
			int var4 = var3 / 2 + 80;
			field148.method591(var4, var2 / 2, true, field171.field645, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field150.method591(var5, var2 / 2, true, "Welcome to RuneScape", 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field94.method539(var6 - 73, var7 - 20);
			field150.method591(var7 + 5, var6, true, "New User", 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field94.method539(var8 - 73, var7 - 20);
			field150.method591(var7 + 5, var8, true, "Existing User", 0xFFFFFF);
		}

		if (field108 == 2) {
			int var9 = var3 / 2 - 40;
			if (field121.length() > 0) {
				field150.method591(var9 - 15, var2 / 2, true, field121, 0xFFFF00);
				field150.method591(var9, var2 / 2, true, field122, 0xFFFF00);
				var9 += 30;
			} else {
				field150.method591(var9 - 7, var2 / 2, true, field122, 0xFFFF00);
				var9 += 30;
			}

			field150.method598(0xFFFFFF, var2 / 2 - 90, true, var9, "Username: " + field395 + (field170 == 0 & field258 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field150.method598(0xFFFFFF, var2 / 2 - 88, true, var9, "Password: " + PZGHUCRX.method410(field396) + (field170 == 1 & field258 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field94.method539(var10 - 73, var11 - 20);
				field150.method591(var11 + 5, var10, true, "Login", 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field94.method539(var12 - 73, var11 - 20);
				field150.method591(var11 + 5, var12, true, "Cancel", 0xFFFFFF);
			}
		}

		if (field108 == 3) {
			field150.method591(var3 / 2 - 60, var2 / 2, true, "Create a free account", 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field150.method591(var13, var2 / 2, true, "To create a new account you need to", 0xFFFFFF);
			var13 += 15;
			field150.method591(var13, var2 / 2, true, "go back to the main RuneScape webpage", 0xFFFFFF);
			var13 += 15;
			field150.method591(var13, var2 / 2, true, "and choose the 'create account'", 0xFFFFFF);
			var13 += 15;
			field150.method591(var13, var2 / 2, true, "button near the top of that page.", 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field94.method539(var14 - 73, var15 - 20);
			field150.method591(var15 + 5, var14, true, "Cancel", 0xFFFFFF);
		}

		field138.method542(171, 202, field1176);

		if (field223) {
			field223 = false;
			field136.method542(0, 128, field1176);
			field137.method542(371, 202, field1176);
			field141.method542(265, 0, field1176);
			field142.method542(265, 562, field1176);
			field143.method542(171, 128, field1176);
			field144.method542(171, 562, field1176);
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method72() {
		int var1 = field453;
		int var2 = field454;
		int var3 = field455;
		int var4 = field456;
		int var5 = 0x5D5447;
		MVOWZCMY.method345(var3, var5, var1, var4, var2);
		MVOWZCMY.method345(var3 - 2, 0, var1 + 1, 16, var2 + 1);
		MVOWZCMY.method346(var1 + 1, 0, var2 + 18, var3 - 2, var4 - 19);
		field150.method594(var2 + 14, var5, "Choose Option", var1 + 3);
		int var6 = field1184;
		int var7 = field1185;
		if (field452 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field452 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field452 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field401; var8++) {
			int var9 = (field401 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field150.method598(var10, var1 + 3, true, var9, field361[var8]);
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 363);

			if (arg0.length == 5) {
				field434 = Integer.parseInt(arg0[0]);
				field435 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method134();
				} else if (arg0[2].equals("highmem")) {
					method118();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field436 = false;
				} else if (arg0[3].equals("members")) {
					field436 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method414(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IIIIZIIIIIII)Z")
	public final boolean method73(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field188[var14][var15] = 0;
				field110[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg6;
		field188[arg10][arg6] = 99;
		field110[arg10][arg6] = 0;
		byte var18 = 0;
		int var19 = 0;
		field161[var18] = arg10;
		int var39 = var18 + 1;
		field162[var18] = arg6;
		boolean var20 = false;
		int var21 = field161.length;
		int[][] var22 = field472[field211].field1280;
		while (var39 != var19) {
			var16 = field161[var19];
			var17 = field162[var19];
			var19 = (var19 + 1) % var21;

			if (arg9 == var16 && arg7 == var17) {
				var20 = true;
				break;
			}

			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && field472[field211].method524(var16, arg9, arg4, var17, arg1 - 1, arg7)) {
					var20 = true;
					break;
				}

				if (arg1 < 10 && field472[field211].method525(arg4, var17, arg1 - 1, arg7, arg9, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg0 != 0 && arg5 != 0 && field472[field211].method526(arg8, arg5, arg0, var16, var17, arg9, arg7)) {
				var20 = true;
				break;
			}

			int var23 = field110[var16][var17] + 1;
			if (var16 > 0 && field188[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field161[var39] = var16 - 1;
				field162[var39] = var17;
				var39 = (var39 + 1) % var21;
				field188[var16 - 1][var17] = 2;
				field110[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field188[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field161[var39] = var16 + 1;
				field162[var39] = var17;
				var39 = (var39 + 1) % var21;
				field188[var16 + 1][var17] = 8;
				field110[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field188[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field161[var39] = var16;
				field162[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field188[var16][var17 - 1] = 1;
				field110[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field188[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field161[var39] = var16;
				field162[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field188[var16][var17 + 1] = 4;
				field110[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field188[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field161[var39] = var16 - 1;
				field162[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field188[var16 - 1][var17 - 1] = 3;
				field110[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field188[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field161[var39] = var16 + 1;
				field162[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field188[var16 + 1][var17 - 1] = 9;
				field110[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field188[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field161[var39] = var16 - 1;
				field162[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field188[var16 - 1][var17 + 1] = 6;
				field110[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field188[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field161[var39] = var16 + 1;
				field162[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field188[var16 + 1][var17 + 1] = 12;
				field110[var16 + 1][var17 + 1] = var23;
			}
		}

		field274 = 0;
		if (!var20) {
			if (!arg3) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg9 - var26; var27 <= arg9 + var26; var27++) {
				for (int var28 = arg7 - var26; var28 <= arg7 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field110[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg9) {
							var29 = arg9 - var27;
						} else if (var27 > arg0 + arg9 - 1) {
							var29 = var27 + 1 - arg0 - arg9;
						}

						int var30 = 0;
						if (var28 < arg7) {
							var30 = arg7 - var28;
						} else if (var28 > arg5 + arg7 - 1) {
							var30 = var28 + 1 - arg5 - arg7;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field110[var27][var28] < var25) {
							var24 = var31;
							var25 = field110[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg10 == var16 && arg6 == var17) {
				return false;
			}

			field274 = 1;
		}

		byte var32 = 0;
		field161[var32] = var16;
		int var40 = var32 + 1;
		field162[var32] = var17;
		int var33;
		int var34 = var33 = field188[var16][var17];
		while (arg10 != var16 || arg6 != var17) {
			if (var33 != var34) {
				var33 = var34;
				field161[var40] = var16;
				field162[var40++] = var17;
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

			var34 = field188[var16][var17];
		}

		if (var40 <= 0) {
			if (arg2 == 1) {
				return false;
			}

			return true;
		}

		int var35 = var40;
		if (var40 > 25) {
			var35 = 25;
		}

		var40--;
		int var36 = field161[var40];
		int var37 = field162[var40];

		if (arg2 == 0) {
			field83.method457(125);
			field83.method458(var35 + var35 + 3);
		}

		if (arg2 == 1) {
			field83.method457(209);
			field83.method458(var35 + var35 + 3 + 14);
		}

		if (arg2 == 2) {
			field83.method457(39);
			field83.method458(var35 + var35 + 3);
		}

		field83.method495(field419 + var37);
		field83.method458(field1194[5] == 1 ? 1 : 0);
		field83.method459(field418 + var36);
		field308 = field161[0];
		field309 = field162[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field83.method484(field161[var40] - var36);
			field83.method485(field162[var40] - var37);
		}

		return true;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field450.method310(arg3, arg1, arg2);
		if (var6 != 0) {
			int var7 = field450.method314(arg3, arg1, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field310.field1255;
			int var12 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			WEWSMZTU var14 = WEWSMZTU.method555(var13);
			if (var14.field1352 == -1) {
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
				VCTXURSE var15 = field87[var14.field1352];
				if (var15 != null) {
					int var16 = (var14.field1349 * 4 - var15.field1314) / 2;
					int var17 = (var14.field1384 * 4 - var15.field1315) / 2;
					var15.method539(arg1 * 4 + var16 + 48, (104 - arg2 - var14.field1384) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field450.method312(arg3, arg1, arg2);
		if (var18 != 0) {
			int var19 = field450.method314(arg3, arg1, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			WEWSMZTU var23 = WEWSMZTU.method555(var22);
			if (var23.field1352 != -1) {
				VCTXURSE var24 = field87[var23.field1352];
				if (var24 != null) {
					int var25 = (var23.field1349 * 4 - var24.field1314) / 2;
					int var26 = (var23.field1384 * 4 - var24.field1315) / 2;
					var24.method539(arg1 * 4 + var25 + 48, (104 - arg2 - var23.field1384) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field310.field1255;
				int var29 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field450.method313(arg3, arg1, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			WEWSMZTU var32 = WEWSMZTU.method555(var31);
			if (var32.field1352 != -1) {
				VCTXURSE var33 = field87[var32.field1352];
				if (var33 != null) {
					int var34 = (var32.field1349 * 4 - var33.field1314) / 2;
					int var35 = (var32.field1384 * 4 - var33.field1315) / 2;
					var33.method539(arg1 * 4 + var34 + 48, (104 - arg2 - var32.field1384) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method75() {
		if (field108 == 0) {
			int var1 = field1174 / 2 - 80;
			int var2 = field1175 / 2 + 20;
			var2 += 20;
			if (field1190 == 1 && field1191 >= var1 - 75 && field1191 <= var1 + 75 && field1192 >= var2 - 20 && field1192 <= var2 + 20) {
				field108 = 3;
				field170 = 0;
			}

			int var3 = field1174 / 2 + 80;
			if (field1190 == 1 && field1191 >= var3 - 75 && field1191 <= var3 + 75 && field1192 >= var2 - 20 && field1192 <= var2 + 20) {
				field121 = "";
				field122 = "Enter your username & password.";
				field108 = 2;
				field170 = 0;
			}
		} else if (field108 == 2) {
			int var4 = field1175 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1190 == 1 && field1192 >= var4 - 15 && field1192 < var4) {
				field170 = 0;
			}

			var4 += 15;
			if (field1190 == 1 && field1192 >= var4 - 15 && field1192 < var4) {
				field170 = 1;
			}

			var4 += 15;
			int var5 = field1174 / 2 - 80;
			int var6 = field1175 / 2 + 50;
			var6 += 20;
			if (field1190 == 1 && field1191 >= var5 - 75 && field1191 <= var5 + 75 && field1192 >= var6 - 20 && field1192 <= var6 + 20) {
				field511 = 0;
				method173(field395, field396, false);

				if (field305) {
					return;
				}
			}

			int var7 = field1174 / 2 + 80;
			if (field1190 == 1 && field1191 >= var7 - 75 && field1191 <= var7 + 75 && field1192 >= var6 - 20 && field1192 <= var6 + 20) {
				field108 = 0;
				field395 = "";
				field396 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method418();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field506.length(); var10++) {
					if (var8 == field506.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field170 == 0) {
					if (var8 == 8 && field395.length() > 0) {
						field395 = field395.substring(0, field395.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field170 = 1;
					}

					if (var9) {
						field395 = field395 + (char) var8;
					}

					if (field395.length() > 12) {
						field395 = field395.substring(0, 12);
					}
				} else if (field170 == 1) {
					if (var8 == 8 && field396.length() > 0) {
						field396 = field396.substring(0, field396.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field170 = 0;
					}

					if (var9) {
						field396 = field396 + (char) var8;
					}

					if (field396.length() > 20) {
						field396 = field396.substring(0, 20);
					}
				}
			}
		} else if (field108 == 3) {
			int var11 = field1174 / 2;
			int var12 = field1175 / 2 + 50;
			var12 += 20;
			if (field1190 == 1 && field1191 >= var11 - 75 && field1191 <= var11 + 75 && field1192 >= var12 - 20 && field1192 <= var12 + 20) {
				field108 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IZLTQYMAXSO;)V")
	public final void method76(int arg0, TQYMAXSO arg1) {
		arg1.method478();
		int var3 = arg1.method479(8);
		if (var3 < field114) {
			for (int var4 = var3; var4 < field114; var4++) {
				field276[field275++] = field115[var4];
			}
		}

		if (var3 > field114) {
			signlink.reporterror(field395 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field114 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field115[var5];
			GYKYBIID var7 = field113[var6];
			int var8 = arg1.method479(1);
			if (var8 == 0) {
				field115[field114++] = var6;
				var7.field689 = field258;
			} else {
				int var9 = arg1.method479(2);
				if (var9 == 0) {
					field115[field114++] = var6;
					var7.field689 = field258;
					field370[field369++] = var6;
				} else if (var9 == 1) {
					field115[field114++] = var6;
					var7.field689 = field258;
					int var10 = arg1.method479(3);
					var7.method226(false, var10);
					int var11 = arg1.method479(1);
					if (var11 == 1) {
						field370[field369++] = var6;
					}
				} else if (var9 == 2) {
					field115[field114++] = var6;
					var7.field689 = field258;
					int var12 = arg1.method479(3);
					var7.method226(true, var12);
					int var13 = arg1.method479(3);
					var7.method226(true, var13);
					int var14 = arg1.method479(1);
					if (var14 == 1) {
						field370[field369++] = var6;
					}
				} else if (var9 == 3) {
					field276[field275++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZLTQYMAXSO;)V")
	public final void method77(int arg0, TQYMAXSO arg1) {
		field275 = 0;
		field369 = 0;
		method47(arg0, arg1);
		method165(arg0, arg1);
		method69(arg1, arg0);
		method86(arg1, arg0);

		for (int var3 = 0; var3 < field275; var3++) {
			int var4 = field276[var3];
			if (field258 != field366[var4].field689) {
				field366[var4] = null;
			}
		}

		if (arg1.field1263 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1263 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field367; var5++) {
			if (field366[field368[var5]] == null) {
				signlink.reporterror(field395 + " null entry in pl list - pos:" + var5 + " size:" + field367);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method78(boolean arg0) {
		for (int var2 = 0; var2 < field114; var2++) {
			GYKYBIID var3 = field113[field115[var2]];
			int var4 = (field115[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method188() && var3.field625.field1422 == arg0 && var3.field625.method567()) {
				int var5 = var3.field734 >> 7;
				int var6 = var3.field735 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field737 == 1 && (var3.field734 & 0x7F) == 0x40 && (var3.field735 & 0x7F) == 0x40) {
						if (field377[var5][var6] == field490) {
							continue;
						}

						field377[var5][var6] = field490;
					}

					if (!var3.field625.field1409) {
						var4 += Integer.MIN_VALUE;
					}

					field450.method295(var3.field735, var4, field211, var3.field734, var3, (var3.field737 - 1) * 64 + 60, var3.field736, var3.field706, method109(var3.field735, var3.field734, field211));
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static final String method79(int arg0) {
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

	@ObfuscatedName("client.a(IB)V")
	public final void method80(int arg0) {
		OMJBPTVL.method360(arg0);
	}

	@ObfuscatedName("client.a(ILOMJBPTVL;)V")
	public final void method81(OMJBPTVL arg0) {
		int var2 = arg0.field1054;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field501 == 0) {
				arg0.field1047 = "Loading friend list";
				arg0.field1026 = 0;
			} else if (var2 == 1 && field501 == 1) {
				arg0.field1047 = "Connecting to friendserver";
				arg0.field1026 = 0;
			} else if (var2 == 2 && field501 != 2) {
				arg0.field1047 = "Please wait...";
				arg0.field1026 = 0;
			} else {
				int var3 = field500;
				if (field501 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1047 = "";
					arg0.field1026 = 0;
				} else {
					arg0.field1047 = field344[var2];
					arg0.field1026 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field500;
			if (field501 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1047 = "";
				arg0.field1026 = 0;
			} else {
				if (field118[var2] == 0) {
					arg0.field1047 = "@red@Offline";
				} else if (field118[var2] < 200) {
					if (field118[var2] == field434) {
						arg0.field1047 = "@gre@World" + (field118[var2] - 9);
					} else {
						arg0.field1047 = "@yel@World" + (field118[var2] - 9);
					}
				} else if (field118[var2] == field434) {
					arg0.field1047 = "@gre@Classic" + (field118[var2] - 219);
				} else {
					arg0.field1047 = "@yel@Classic" + (field118[var2] - 219);
				}

				arg0.field1026 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field500;
			if (field501 != 2) {
				var5 = 0;
			}

			arg0.field1060 = var5 * 15 + 20;
			if (arg0.field1060 <= arg0.field1037) {
				arg0.field1060 = arg0.field1037 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field501 == 0) {
				arg0.field1047 = "Loading ignore list";
				arg0.field1026 = 0;
			} else if (var2 == 1 && field501 == 0) {
				arg0.field1047 = "Please wait...";
				arg0.field1026 = 0;
			} else {
				int var6 = field146;
				if (field501 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1047 = "";
					arg0.field1026 = 0;
				} else {
					arg0.field1047 = PZGHUCRX.method409(PZGHUCRX.method406(field282[var2]));
					arg0.field1026 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1060 = field146 * 15 + 20;
			if (arg0.field1060 <= arg0.field1037) {
				arg0.field1060 = arg0.field1037 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1014 = 150;
			arg0.field1015 = (int) (Math.sin(field258 / 40.0D) * 256.0D) & 0x7FF;

			if (field239) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field429[var7];
					if (var8 >= 0 && !DOOZRHTX.field555[var8].method191()) {
						return;
					}
				}

				field239 = false;
				KDWDYCIL[] var9 = new KDWDYCIL[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field429[var11];
					if (var12 >= 0) {
						var9[var10++] = DOOZRHTX.field555[var12].method192();
					}
				}

				KDWDYCIL var13 = new KDWDYCIL(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field163[var14] != 0) {
						var13.method260(field242[var14][0], field242[var14][field163[var14]]);

						if (var14 == 1) {
							var13.method260(field499[0], field499[field163[var14]]);
						}
					}
				}

				var13.method253();
				var13.method254(LMDSPIVT.field867[field269.field693].field869[0]);
				var13.method263(64, 850, -30, -50, -30, true);
				arg0.field1009 = 5;
				arg0.field1010 = 0;
				OMJBPTVL.method361(var13, 5, 0);
			}
		} else if (var2 == 324) {
			if (field478 == null) {
				field478 = arg0.field1052;
				field479 = arg0.field1020;
			}

			if (field362) {
				arg0.field1052 = field479;
			} else {
				arg0.field1052 = field478;
			}
		} else if (var2 == 325) {
			if (field478 == null) {
				field478 = arg0.field1052;
				field479 = arg0.field1020;
			}

			if (field362) {
				arg0.field1052 = field478;
			} else {
				arg0.field1052 = field479;
			}
		} else if (var2 == 600) {
			arg0.field1047 = field327;
			if (field258 % 20 < 10) {
				arg0.field1047 = arg0.field1047 + "|";
			} else {
				arg0.field1047 = arg0.field1047 + " ";
			}
		} else if (var2 == 620) {
			if (field270 < 1) {
				arg0.field1047 = "";
			} else if (field267) {
				arg0.field1070 = 0xFF0000;
				arg0.field1047 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1070 = 0xFFFFFF;
				arg0.field1047 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field277 - field164;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1047 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field462 == 0) {
				arg0.field1047 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field462 <= field277) {
				arg0.field1047 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method82(field462);
			} else {
				int var17 = field277 + 14 - field462;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1047 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method82(field462) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field324 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field324 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field324 + " unread messages";
			}

			arg0.field1047 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field210 > 0 && field210 <= field277 + 10) {
				arg0.field1047 = "Last password change:\\n@gre@" + method82(field210);
			} else {
				arg0.field1047 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field131 > 2 && !field436) {
				arg0.field1047 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field131 > 2) {
				arg0.field1047 = "\\n\\nYou have @gre@" + field131 + "@yel@ days of\\nmember credit remaining.";
			} else if (field131 > 0) {
				arg0.field1047 = "You have @gre@" + field131 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1047 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field131 > 2 && !field436) {
				arg0.field1047 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field131 > 0) {
				arg0.field1047 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1047 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field462 > field277) {
				arg0.field1047 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1047 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public final String method82(int arg0) {
		if (arg0 > field277 + 10) {
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

	@ObfuscatedName("client.f(B)V")
	public final void method83() {
		if (field466 == null) {
			method90();
			field1177 = null;
			field136 = null;
			field137 = null;
			field138 = null;
			field139 = null;
			field140 = null;
			field141 = null;
			field142 = null;
			field143 = null;
			field144 = null;
			field466 = new VFZXUVTW(96, 479, method167());
			field464 = new VFZXUVTW(156, 172, method167());
			MVOWZCMY.method343();
			field192.method539(0, 0);
			field463 = new VFZXUVTW(261, 190, method167());
			field465 = new VFZXUVTW(334, 512, method167());
			MVOWZCMY.method343();
			field279 = new VFZXUVTW(50, 496, method167());
			field280 = new VFZXUVTW(37, 269, method167());
			field281 = new VFZXUVTW(45, 249, method167());
			field223 = true;
			field465.method541();
			SNMMFOLO.field1218 = field404;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method84() {
		field195 = 0;
		for (int var1 = -1; var1 < field367 + field114; var1++) {
			JFHWDRLM var2;
			if (var1 == -1) {
				var2 = field269;
			} else if (var1 < field367) {
				var2 = field366[field368[var1]];
			} else {
				var2 = field113[field115[var1 - field367]];
			}

			if (var2 != null && var2.method188()) {
				if (var2 instanceof GYKYBIID) {
					YANZSPIT var3 = ((GYKYBIID) var2).field625;
					if (var3.field1413 != null) {
						var3 = var3.method568();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field367) {
					YANZSPIT var6 = ((GYKYBIID) var2).field625;
					if (var6.field1419 >= 0 && var6.field1419 < field315.length) {
						method154(var2, var2.field695 + 15);

						if (field116 > -1) {
							field315[var6.field1419].method448(field116 - 12, field117 - 30);
						}
					}

					if (field180 == 1 && field115[var1 - field367] == field224 && field258 % 20 < 10) {
						method154(var2, var2.field695 + 15);

						if (field116 > -1) {
							field105[0].method448(field116 - 12, field117 - 28);
						}
					}
				} else {
					int var4 = 30;
					DEHYKQII var5 = (DEHYKQII) var2;
					if (var5.field551 != -1 || var5.field553 != -1) {
						method154(var2, var2.field695 + 15);

						if (field116 > -1) {
							if (var5.field551 != -1) {
								field234[var5.field551].method448(field116 - 12, field117 - var4);
								var4 += 25;
							}

							if (var5.field553 != -1) {
								field315[var5.field553].method448(field116 - 12, field117 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field180 == 10 && field368[var1] == field481) {
						method154(var2, var2.field695 + 15);

						if (field116 > -1) {
							field105[1].method448(field116 - 12, field117 - var4);
						}
					}
				}

				if (var2.field707 != null && (var1 >= field367 || field300 == 0 || field300 == 3 || field300 == 1 && method65(((DEHYKQII) var2).field541))) {
					method154(var2, var2.field695);

					if (field116 > -1 && field195 < field196) {
						field200[field195] = field150.method593(var2.field707) / 2;
						field199[field195] = field150.field1508;
						field197[field195] = field116;
						field198[field195] = field117;
						field201[field195] = var2.field733;
						field202[field195] = var2.field712;
						field203[field195] = var2.field683;
						field204[field195++] = var2.field707;

						if (field278 == 0 && var2.field712 >= 1 && var2.field712 <= 3) {
							field199[field195] += 10;
							field198[field195] += 5;
						}

						if (field278 == 0 && var2.field712 == 4) {
							field200[field195] = 60;
						}

						if (field278 == 0 && var2.field712 == 5) {
							field199[field195] += 5;
						}
					}
				}

				if (var2.field709 > field258) {
					method154(var2, var2.field695 + 15);

					if (field116 > -1) {
						int var7 = var2.field710 * 30 / var2.field711;
						if (var7 > 30) {
							var7 = 30;
						}

						MVOWZCMY.method345(var7, 0xFF00, field116 - 15, 5, field117 - 3);
						MVOWZCMY.method345(30 - var7, 0xFF0000, field116 + var7 - 15, 5, field117 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field692[var8] > field258) {
						method154(var2, var2.field695 / 2);

						if (field116 > -1) {
							if (var8 == 1) {
								field117 -= 20;
							}

							if (var8 == 2) {
								field116 -= 15;
								field117 -= 10;
							}

							if (var8 == 3) {
								field116 += 15;
								field117 -= 10;
							}

							field449[var2.field691[var8]].method448(field116 - 12, field117 - 12);
							field148.method590(0, field116, String.valueOf(var2.field690[var8]), field117 + 4);
							field148.method590(0xFFFFFF, field116 - 1, String.valueOf(var2.field690[var8]), field117 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field195; var9++) {
			int var10 = field197[var9];
			int var11 = field198[var9];
			int var12 = field200[var9];
			int var13 = field199[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field198[var15] - field199[var15] && var11 - var13 < field198[var15] + 2 && var10 - var12 < field200[var15] + field197[var15] && var10 + var12 > field197[var15] - field200[var15] && field198[var15] - field199[var15] < var11) {
						var11 = field198[var15] - field199[var15];
						var14 = true;
					}
				}
			}

			field116 = field197[var9];
			field117 = field198[var9] = var11;
			String var16 = field204[var9];
			if (field278 == 0) {
				int var17 = 0xFFFF00;
				if (field201[var9] < 6) {
					var17 = field458[field201[var9]];
				}

				if (field201[var9] == 6) {
					var17 = field490 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field201[var9] == 7) {
					var17 = field490 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field201[var9] == 8) {
					var17 = field490 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field201[var9] == 9) {
					int var18 = 150 - field203[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field201[var9] == 10) {
					int var19 = 150 - field203[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field201[var9] == 11) {
					int var20 = 150 - field203[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field202[var9] == 0) {
					field150.method590(0, field116, var16, field117 + 1);
					field150.method590(var17, field116, var16, field117);
				}

				if (field202[var9] == 1) {
					field150.method595(field117 + 1, field116, 0, var16, field490);
					field150.method595(field117, field116, var17, var16, field490);
				}

				if (field202[var9] == 2) {
					field150.method596(field490, field116, field117 + 1, var16, 0);
					field150.method596(field490, field116, field117, var16, var17);
				}

				if (field202[var9] == 3) {
					field150.method597(var16, field117 + 1, field490, 150 - field203[var9], 0, field116);
					field150.method597(var16, field117, field490, 150 - field203[var9], var17, field116);
				}

				if (field202[var9] == 4) {
					int var21 = field150.method593(var16);
					int var22 = (150 - field203[var9]) * (var21 + 100) / 150;
					MVOWZCMY.method342(0, field116 - 50, field116 + 50, 334);
					field150.method594(field117 + 1, 0, var16, field116 + 50 - var22);
					field150.method594(field117, var17, var16, field116 + 50 - var22);
					MVOWZCMY.method341();
				}

				if (field202[var9] == 5) {
					int var23 = 150 - field203[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					MVOWZCMY.method342(field117 - field150.field1508 - 1, 0, 512, field117 + 5);
					field150.method590(0, field116, var16, field117 + var24 + 1);
					field150.method590(var17, field116, var16, field117 + var24);
					MVOWZCMY.method341();
				}
			} else {
				field150.method590(0, field116, var16, field117 + 1);
				field150.method590(0xFFFF00, field116, var16, field117);
			}
		}
	}

	@ObfuscatedName("client.a(IZIIII)V")
	public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field213.method539(arg3, arg0);
		field214.method539(arg3, arg0 + arg1 - 16);
		MVOWZCMY.method345(16, field177, arg3, arg1 - 32, arg0 + 16);
		int var6 = (arg1 - 32) * arg1 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg4 / (arg2 - arg1);
		MVOWZCMY.method345(16, field318, arg3, var6, arg0 + var7 + 16);
		MVOWZCMY.method350(arg0 + var7 + 16, field400, var6, arg3);
		MVOWZCMY.method350(arg0 + var7 + 16, field400, var6, arg3 + 1);
		MVOWZCMY.method348(field400, arg0 + var7 + 16, arg3, 16);
		MVOWZCMY.method348(field400, arg0 + var7 + 17, arg3, 16);
		MVOWZCMY.method350(arg0 + var7 + 16, field522, var6, arg3 + 15);
		MVOWZCMY.method350(arg0 + var7 + 17, field522, var6 - 1, arg3 + 14);
		MVOWZCMY.method348(field522, arg0 + var7 + var6 + 15, arg3, 16);
		MVOWZCMY.method348(field522, arg0 + var7 + var6 + 14, arg3 + 1, 15);
	}

	@ObfuscatedName("client.b(LTQYMAXSO;II)V")
	public final void method86(TQYMAXSO arg0, int arg1) {
		for (int var3 = 0; var3 < field369; var3++) {
			int var4 = field370[var3];
			DEHYKQII var5 = field366[var4];
			int var6 = arg0.method468();
			if ((var6 & 0x40) != 0) {
				var6 += arg0.method468() << 8;
			}

			method104(arg0, var4, var5, var6);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method87() {
		for (KOXMDHST var1 = (KOXMDHST) field346.method179(); var1 != null; var1 = (KOXMDHST) field346.method181()) {
			if (var1.field847 == -1) {
				var1.field855 = 0;
				method91(var1);
			} else {
				var1.method272();
			}
		}
	}

	@ObfuscatedName("client.a(LTPUDHOHI;ZII)V")
	public final void method88(TPUDHOHI arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field265 + field262 & 0x7FF;
			int var6 = KDWDYCIL.field828[var5];
			int var7 = KDWDYCIL.field829[var5];
			var6 = var6 * 256 / (field484 + 256);
			var7 = var7 * 256 / (field484 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field383.method453(20, 256, 15, var10, 20, var12 + 94 + 4 - 10, 83 - var13 - 20, 15);
		} else {
			method43(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.a(IIIILOMJBPTVL;)V")
	public final void method89(int arg0, int arg1, int arg2, OMJBPTVL arg3) {
		if (arg3.field1008 == 0 && arg3.field1018 != null && (!arg3.field1036 || field489 == arg3.field1065 || field129 == arg3.field1065 || field480 == arg3.field1065)) {
			int var5 = MVOWZCMY.field982;
			int var6 = MVOWZCMY.field980;
			int var7 = MVOWZCMY.field983;
			int var8 = MVOWZCMY.field981;
			MVOWZCMY.method342(arg0, arg1, arg3.field1064 + arg1, arg3.field1037 + arg0);
			int var9 = arg3.field1018.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field1063[var10] + arg1;
				int var12 = arg3.field1053[var10] + arg0 - arg2;
				OMJBPTVL var13 = OMJBPTVL.method359(arg3.field1018[var10]);
				var11 += var13.field1012;
				var12 += var13.field1062;

				if (var13.field1054 > 0) {
					method81(var13);
				}

				if (var13.field1008 == 0) {
					if (var13.field1061 > var13.field1060 - var13.field1037) {
						var13.field1061 = var13.field1060 - var13.field1037;
					}

					if (var13.field1061 < 0) {
						var13.field1061 = 0;
					}

					method89(var12, var11, var13.field1061, var13);

					if (var13.field1060 > var13.field1037) {
						method85(var12, var13.field1037, var13.field1060, var13.field1064 + var11, var13.field1061);
					}
				} else if (var13.field1008 != 1) {
					if (var13.field1008 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1037; var15++) {
							for (int var16 = 0; var16 < var13.field1064; var16++) {
								int var17 = (var13.field1016 + 32) * var16 + var11;
								int var18 = (var13.field1051 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1006[var14];
									var18 += var13.field1022[var14];
								}

								if (var13.field1030[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1030[var14] - 1;
									if (var17 > MVOWZCMY.field982 - 32 && var17 < MVOWZCMY.field983 && var18 > MVOWZCMY.field980 - 32 && var18 < MVOWZCMY.field981 || field337 != 0 && field336 == var14) {
										int var22 = 0;
										if (field372 == 1 && field373 == var14 && field374 == var13.field1065) {
											var22 = 0xFFFFFF;
										}

										TPUDHOHI var23 = YDSJAZFL.method573(var21, var13.field1071[var14], var22);
										if (var23 != null) {
											if (field337 != 0 && field336 == var14 && field335 == var13.field1065) {
												var19 = field1184 - field338;
												var20 = field1185 - field339;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field351 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method450(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < MVOWZCMY.field980 && arg3.field1061 > 0) {
													int var24 = (MVOWZCMY.field980 - var18 - var20) * field172 / 3;
													if (var24 > field172 * 10) {
														var24 = field172 * 10;
													}

													if (var24 > arg3.field1061) {
														var24 = arg3.field1061;
													}

													arg3.field1061 -= var24;
													field339 += var24;
												}

												if (var18 + var20 + 32 > MVOWZCMY.field981 && arg3.field1061 < arg3.field1060 - arg3.field1037) {
													int var25 = (var18 + var20 + 32 - MVOWZCMY.field981) * field172 / 3;
													if (var25 > field172 * 10) {
														var25 = field172 * 10;
													}

													if (var25 > arg3.field1060 - arg3.field1037 - arg3.field1061) {
														var25 = arg3.field1060 - arg3.field1037 - arg3.field1061;
													}

													arg3.field1061 += var25;
													field339 -= var25;
												}
											} else if (field510 != 0 && field509 == var14 && field508 == var13.field1065) {
												var23.method450(var18, var17, 128);
											} else {
												var23.method448(var17, var18);
											}

											if (var23.field1260 == 33 || var13.field1071[var14] != 1) {
												int var26 = var13.field1071[var14];
												field148.method594(var18 + var20 + 10, 0, method117(var26), var17 + var19 + 1);
												field148.method594(var18 + var20 + 9, 0xFFFF00, method117(var26), var17 + var19);
											}
										}
									}
								} else if (var13.field1040 != null && var14 < 20) {
									TPUDHOHI var27 = var13.field1040[var14];
									if (var27 != null) {
										var27.method448(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1008 == 3) {
						boolean var28 = false;
						if (field480 == var13.field1065 || field129 == var13.field1065 || field489 == var13.field1065) {
							var28 = true;
						}

						int var29;
						if (method105(var13)) {
							var29 = var13.field1043;
							if (var28 && var13.field1024 != 0) {
								var29 = var13.field1024;
							}
						} else {
							var29 = var13.field1070;
							if (var28 && var13.field1072 != 0) {
								var29 = var13.field1072;
							}
						}

						if (var13.field1050 == 0) {
							if (var13.field1049) {
								MVOWZCMY.method345(var13.field1064, var29, var11, var13.field1037, var12);
							} else {
								MVOWZCMY.method346(var11, var29, var12, var13.field1064, var13.field1037);
							}
						} else if (var13.field1049) {
							MVOWZCMY.method344(var13.field1064, var11, var29, var12, 256 - (var13.field1050 & 0xFF), var13.field1037);
						} else {
							MVOWZCMY.method347(256 - (var13.field1050 & 0xFF), var13.field1037, var13.field1064, var12, var11, var29);
						}
					} else if (var13.field1008 == 4) {
						ZGPIKWUW var30 = var13.field1027;
						String var31 = var13.field1047;
						boolean var32 = false;
						if (field480 == var13.field1065 || field129 == var13.field1065 || field489 == var13.field1065) {
							var32 = true;
						}

						int var33;
						if (method105(var13)) {
							var33 = var13.field1043;
							if (var32 && var13.field1024 != 0) {
								var33 = var13.field1024;
							}

							if (var13.field1007.length() > 0) {
								var31 = var13.field1007;
							}
						} else {
							var33 = var13.field1070;
							if (var32 && var13.field1072 != 0) {
								var33 = var13.field1072;
							}
						}

						if (var13.field1026 == 6 && field439) {
							var31 = "Please wait...";
							var33 = var13.field1070;
						}

						if (MVOWZCMY.field978 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1508 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method159(method135(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method159(method135(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method159(method135(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method159(method135(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method159(method135(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1033) {
								var30.method591(var34, var13.field1064 / 2 + var11, var13.field1028, var41, var33);
							} else {
								var30.method598(var33, var11, var13.field1028, var34, var41);
							}

							var34 += var30.field1508;
						}
					} else if (var13.field1008 == 5) {
						TPUDHOHI var42;
						if (method105(var13)) {
							var42 = var13.field1020;
						} else {
							var42 = var13.field1052;
						}

						if (var42 != null) {
							var42.method448(var11, var12);
						}
					} else if (var13.field1008 == 6) {
						int var43 = SNMMFOLO.field1212;
						int var44 = SNMMFOLO.field1213;
						SNMMFOLO.field1212 = var13.field1064 / 2 + var11;
						SNMMFOLO.field1213 = var13.field1037 / 2 + var12;
						int var45 = SNMMFOLO.field1216[var13.field1014] * var13.field1013 >> 16;
						int var46 = SNMMFOLO.field1217[var13.field1014] * var13.field1013 >> 16;
						boolean var47 = method105(var13);
						int var48;
						if (var47) {
							var48 = var13.field1057;
						} else {
							var48 = var13.field1056;
						}

						KDWDYCIL var49;
						if (var48 == -1) {
							var49 = var13.method353(var47, -1, -1);
						} else {
							LMDSPIVT var50 = LMDSPIVT.field867[var48];
							var49 = var13.method353(var47, var50.field869[var13.field1029], var50.field870[var13.field1029]);
						}

						if (var49 != null) {
							var49.method267(0, var13.field1015, 0, var13.field1014, 0, var45, var46);
						}

						SNMMFOLO.field1212 = var43;
						SNMMFOLO.field1213 = var44;
					} else {
						if (var13.field1008 == 7) {
							ZGPIKWUW var51 = var13.field1027;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1037; var53++) {
								for (int var54 = 0; var54 < var13.field1064; var54++) {
									if (var13.field1030[var52] > 0) {
										YDSJAZFL var55 = YDSJAZFL.method575(var13.field1030[var52] - 1);
										String var56 = String.valueOf(var55.field1476);
										if (var55.field1468 || var13.field1071[var52] != 1) {
											var56 = var56 + " x" + method79(var13.field1071[var52]);
										}

										int var57 = (var13.field1016 + 115) * var54 + var11;
										int var58 = (var13.field1051 + 12) * var53 + var12;
										if (var13.field1033) {
											var51.method591(var58, var13.field1064 / 2 + var57, var13.field1028, var56, var13.field1070);
										} else {
											var51.method598(var13.field1070, var57, var13.field1028, var58, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1008 == 8 && (field238 == var13.field1065 || field438 == var13.field1065 || field342 == var13.field1065) && field217 == 100) {
							int var59 = 0;
							int var60 = 0;
							ZGPIKWUW var61 = field149;
							String var62 = var13.field1047;
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

								int var65 = var61.method592(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1508 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1064 + var11 - var59 - 5;
							int var67 = var13.field1037 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg3.field1064 + arg1) {
								var66 = arg3.field1064 + arg1 - var59;
							}

							if (var60 + var67 > arg3.field1037 + arg0) {
								var67 = arg3.field1037 + arg0 - var60;
							}

							MVOWZCMY.method345(var59, 0xFFFFA0, var66, var60, var67);
							MVOWZCMY.method346(var66, 0, var67, var59, var60);
							String var68 = var13.field1047;
							int var69 = var61.field1508 + var67 + 2;
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

								var61.method598(0, var66 + 3, false, var69, var71);
								var69 += var61.field1508 + 1;
							}
						}
					}
				}
			}

			MVOWZCMY.method342(var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method90() {
		field487 = false;
		while (field313) {
			field487 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field93 = null;
		field94 = null;
		field216 = null;
		field430 = null;
		field431 = null;
		field432 = null;
		field433 = null;
		field256 = null;
		field257 = null;
		field174 = null;
		field175 = null;
		field352 = null;
		field353 = null;
	}

	@ObfuscatedName("client.a(ILKOXMDHST;)V")
	public final void method91(KOXMDHST arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field852 == 0) {
			var2 = field450.method310(arg0.field851, arg0.field853, arg0.field854);
		}

		if (arg0.field852 == 1) {
			var2 = field450.method311(arg0.field854, arg0.field851, arg0.field853);
		}

		if (arg0.field852 == 2) {
			var2 = field450.method312(arg0.field851, arg0.field853, arg0.field854);
		}

		if (arg0.field852 == 3) {
			var2 = field450.method313(arg0.field851, arg0.field853, arg0.field854);
		}

		if (var2 != 0) {
			int var6 = field450.method314(arg0.field851, arg0.field853, arg0.field854, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field848 = var3;
		arg0.field850 = var4;
		arg0.field849 = var5;
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method92(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field500; var3++) {
				if (field215[var3] == arg0) {
					field500--;
					field255 = true;

					for (int var4 = var3; var4 < field500; var4++) {
						field344[var4] = field344[var4 + 1];
						field118[var4] = field118[var4 + 1];
						field215[var4] = field215[var4 + 1];
					}

					field83.method457(52);
					field83.method464(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method93() {
		method48();

		if (field426 == 1) {
			field268[field425 / 100].method448(field423 - 8 - 4, field424 - 8 - 4);
		}

		if (field426 == 2) {
			field268[field425 / 100 + 4].method448(field423 - 8 - 4, field424 - 8 - 4);
		}

		if (field96 != -1) {
			method56(field96, field172);
			method89(0, 0, 0, OMJBPTVL.method359(field96));
		}

		if (field88 != -1) {
			method56(field88, field172);
			method89(0, 0, 0, OMJBPTVL.method359(field88));
		}

		method111();

		if (!field260) {
			method157();
			method153();
		} else if (field452 == 0) {
			method72();
		}

		if (field178 == 1) {
			field448.method448(472, 296);
		}

		if (field212) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field1172 < 30 && field437) {
				var3 = 0xFF0000;
			}

			if (field1172 < 20 && !field437) {
				var3 = 0xFF0000;
			}

			field149.method589(var2, "Fps:" + field1172, var1, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field437) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field437) {
				int var8 = 0xFF0000;
			}

			field149.method589(var2, "Mem:" + var5 + "k", var1, 0xFFFF00);
			var2 += 15;
		}

		if (field243 != 0) {
			int var9 = field243 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field149.method594(329, 0xFFFF00, "System update in: " + var10 + ":0" + var9, 4);
			} else {
				field149.method594(329, 0xFFFF00, "System update in: " + var10 + ":" + var9, 4);
			}

			field457++;
			if (field457 > 73) {
				field457 = 0;
				field83.method457(110);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIZIIII)V")
	public final void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 >= 1 && arg2 >= 1 && arg5 <= 102 && arg2 <= 102) {
			if (field437 && field211 != arg0) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg6 == 0) {
				var8 = field450.method310(arg0, arg5, arg2);
			}

			if (arg6 == 1) {
				var8 = field450.method311(arg2, arg0, arg5);
			}

			if (arg6 == 2) {
				var8 = field450.method312(arg0, arg5, arg2);
			}

			if (arg6 == 3) {
				var8 = field450.method313(arg0, arg5, arg2);
			}

			if (var8 != 0) {
				int var12 = field450.method314(arg0, arg5, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg6 == 0) {
					field450.method301(arg0, arg2, arg5);
					WEWSMZTU var16 = WEWSMZTU.method555(var13);
					if (var16.field1343) {
						field472[arg0].method520(var16.field1383, var15, arg5, arg2, var14);
					}
				}

				if (arg6 == 1) {
					field450.method302(arg2, arg5, arg0);
				}

				if (arg6 == 2) {
					field450.method303(arg2, arg0, arg5);
					WEWSMZTU var17 = WEWSMZTU.method555(var13);
					if (var17.field1349 + arg5 > 103 || var17.field1349 + arg2 > 103 || var17.field1384 + arg5 > 103 || var17.field1384 + arg2 > 103) {
						return;
					}

					if (var17.field1343) {
						field472[arg0].method521(arg2, var17.field1349, var17.field1383, var15, var17.field1384, arg5);
					}
				}

				if (arg6 == 3) {
					field450.method304(arg2, arg0, arg5);
					WEWSMZTU var18 = WEWSMZTU.method555(var13);
					if (var18.field1343 && var18.field1378) {
						field472[arg0].method523(arg2, arg5);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg0;
				if (arg0 < 3 && (field312[1][arg5][arg2] & 0x2) == 2) {
					var19 = arg0 + 1;
				}

				AGPNOIRK.method16(arg5, arg0, arg3, field472[arg0], arg4, var19, arg2, field450, arg1, field246);
				return;
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method95() {
		field93 = new VCTXURSE(field382, "titlebox", 0);
		field94 = new VCTXURSE(field382, "titlebutton", 0);
		field216 = new VCTXURSE[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field216[var1] = new VCTXURSE(field382, "runes", var1);
		}

		field352 = new TPUDHOHI(128, 265);
		field353 = new TPUDHOHI(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field352.field1255[var2] = field139.field1320[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field353.field1255[var3] = field140.field1320[var3];
		}

		field431 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field431[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field431[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field431[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field431[var7 + 192] = 0xFFFFFF;
		}

		field432 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field432[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field432[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field432[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field432[var11 + 192] = 0xFFFFFF;
		}

		field433 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field433[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field433[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field433[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field433[var15 + 192] = 0xFFFFFF;
		}

		field430 = new int[256];
		field256 = new int[32768];
		field257 = new int[32768];
		method139(null);
		field174 = new int[32768];
		field175 = new int[32768];
		method61(10, "Connecting to fileserver");

		if (!field487) {
			field523 = true;
			field487 = true;
			method108(this, 2);
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method96() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field174[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field174[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field175[var10] = (field174[var10 - 1] + field174[var10 + 1] + field174[var10 - 128] + field174[var10 + 128]) / 4;
			}
		}

		field416 += 128;
		if (field416 > field256.length) {
			field416 -= field256.length;
			int var11 = (int) (Math.random() * 12.0D);
			method139(field216[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field175[var14 + 128] - field256[field416 + var14 & field256.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field174[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field183[var16] = field183[var16 + 1];
		}

		field183[var1 - 1] = (int) (Math.sin(field258 / 14.0D) * 16.0D + Math.sin(field258 / 15.0D) * 14.0D + Math.sin(field258 / 16.0D) * 12.0D);

		if (field519 > 0) {
			field519 -= 4;
		}

		if (field520 > 0) {
			field520 -= 4;
		}

		if (field519 == 0 && field520 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field519 = 1024;
			}

			if (var17 == 1) {
				field520 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method97() {
		if (field1177 == null) {
			method90();
			field136 = null;
			field137 = null;
			field138 = null;
			field139 = null;
			field140 = null;
			field141 = null;
			field142 = null;
			field143 = null;
			field144 = null;
			field466 = null;
			field464 = null;
			field463 = null;
			field465 = null;
			field279 = null;
			field280 = null;
			field281 = null;
			field1177 = new VFZXUVTW(503, 765, method167());
			field223 = true;
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method98(int arg0, int arg1) {
		CRZPTUPR var3 = field124[field211][arg0][arg1];
		if (var3 == null) {
			field450.method305(field211, arg0, arg1);
		} else {
			int var4 = -99999999;
			FIMDEAMY var5 = null;
			for (FIMDEAMY var6 = (FIMDEAMY) var3.method179(); var6 != null; var6 = (FIMDEAMY) var3.method181()) {
				YDSJAZFL var7 = YDSJAZFL.method575(var6.field624);
				int var8 = var7.field1444;
				if (var7.field1468) {
					var8 = (var6.field623 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method177(var5);
			FIMDEAMY var9 = null;
			FIMDEAMY var10 = null;
			for (FIMDEAMY var11 = (FIMDEAMY) var3.method179(); var11 != null; var11 = (FIMDEAMY) var3.method181()) {
				if (var5.field624 != var11.field624 && var9 == null) {
					var9 = var11;
				}

				if (var5.field624 != var11.field624 && var9.field624 != var11.field624 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field450.method291(field211, var9, var12, method109(arg1 * 128 + 64, arg0 * 128 + 64, field211), var10, arg1, var5, arg0);
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method99(int arg0, int arg1) {
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

	@ObfuscatedName("client.i(B)V")
	public final void method100() {
		for (int var1 = -1; var1 < field367; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field365;
			} else {
				var2 = field368[var1];
			}

			DEHYKQII var3 = field366[var2];
			if (var3 != null) {
				method122(1, var3);
			}
		}

		field227++;
		if (field227 > 109) {
			field227 = 0;
			field83.method457(129);
			field83.method462(0);
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.j(B)Ljava/lang/String;")
	public final String method101() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1179 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.y(I)V")
	public final void method102() {
		for (VCMSZAQJ var1 = (VCMSZAQJ) field525.method179(); var1 != null; var1 = (VCMSZAQJ) field525.method181()) {
			if (field211 != var1.field1311 || field258 > var1.field1305) {
				var1.method272();
			} else if (field258 >= var1.field1304) {
				if (var1.field1300 > 0) {
					GYKYBIID var2 = field113[var1.field1300 - 1];
					if (var2 != null && var2.field734 >= 0 && var2.field734 < 13312 && var2.field735 >= 0 && var2.field735 < 13312) {
						var1.method532(method109(var2.field735, var2.field734, var1.field1311) - var1.field1309, var2.field734, field258, var2.field735);
					}
				}

				if (var1.field1300 < 0) {
					int var3 = -var1.field1300 - 1;
					DEHYKQII var4;
					if (field130 == var3) {
						var4 = field269;
					} else {
						var4 = field366[var3];
					}

					if (var4 != null && var4.field734 >= 0 && var4.field734 < 13312 && var4.field735 >= 0 && var4.field735 < 13312) {
						var1.method532(method109(var4.field735, var4.field734, var1.field1311) - var1.field1309, var4.field734, field258, var4.field735);
					}
				}

				var1.method533(field172);
				field450.method295((int) var1.field1296, -1, field211, (int) var1.field1295, var1, 60, var1.field1302, false, (int) var1.field1297);
			}
		}
	}

	@ObfuscatedName("client.a(IIBI)Z")
	public final boolean method103(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field450.method314(field211, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			WEWSMZTU var8 = WEWSMZTU.method555(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1349;
				var10 = var8.field1384;
			} else {
				var9 = var8.field1384;
				var10 = var8.field1349;
			}

			int var11 = var8.field1346;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method73(var9, 0, 2, true, 0, var10, field269.field732[0], arg1, var11, arg0, field269.field731[0]);
		} else {
			method73(0, var6 + 1, 2, true, var7, 0, field269.field732[0], arg1, 0, arg0, field269.field731[0]);
		}

		field423 = field1191;
		field424 = field1192;
		field426 = 2;
		field425 = 0;
		return true;
	}

	@ObfuscatedName("client.a(ILTQYMAXSO;ILDEHYKQII;I)V")
	public final void method104(TQYMAXSO arg0, int arg1, DEHYKQII arg2, int arg3) {
		if ((arg3 & 0x400) != 0) {
			arg2.field722 = arg0.method470();
			int var5 = arg0.method503();
			arg2.field726 = var5 >> 16;
			arg2.field725 = (var5 & 0xFFFF) + field258;
			arg2.field723 = 0;
			arg2.field724 = 0;

			if (arg2.field725 > field258) {
				arg2.field723 = -1;
			}

			if (arg2.field722 == 0xFFFF) {
				arg2.field722 = -1;
			}
		}

		if ((arg3 & 0x10) != 0) {
			arg2.field707 = arg0.method475();
			if (arg2.field707.charAt(0) == '~') {
				arg2.field707 = arg2.field707.substring(1);
				method133(arg2.field541, arg2.field707, 2);
			} else if (field269 == arg2) {
				method133(arg2.field541, arg2.field707, 2);
			}

			arg2.field733 = 0;
			arg2.field712 = 0;
			arg2.field683 = 150;
		}

		if ((arg3 & 0x100) != 0) {
			arg2.field696 = arg0.method468();
			arg2.field698 = arg0.method488();
			arg2.field697 = arg0.method489();
			arg2.field699 = arg0.method488();
			arg2.field700 = arg0.method498() + field258;
			arg2.field701 = arg0.method498() + field258;
			arg2.field702 = arg0.method468();
			arg2.method228();
		}

		if ((arg3 & 0x80) != 0) {
			arg2.field705 = arg0.method496();
			if (arg2.field705 == 0xFFFF) {
				arg2.field705 = -1;
			}
		}

		if ((arg3 & 0x2) != 0) {
			int var6 = arg0.method470();
			int var7 = arg0.method487();
			int var8 = arg0.method489();
			int var9 = arg0.field1263;

			if (arg2.field541 != null && arg2.field539) {
				long var10 = PZGHUCRX.method405(arg2.field541);
				boolean var12 = false;
				if (var7 <= 1) {
					for (int var13 = 0; var13 < field146; var13++) {
						if (field282[var13] == var10) {
							var12 = true;
							break;
						}
					}
				}

				if (!var12 && field259 == 0) {
					try {
						field112.field1263 = 0;
						arg0.method506(field112.field1262, 0, var8);
						field112.field1263 = 0;
						String var14 = BXSNHAGP.method26(var8, field112);
						var14 = OWMPGCSS.method377(var14);
						arg2.field707 = var14;
						arg2.field733 = var6 >> 8;
						arg2.field712 = var6 & 0xFF;
						arg2.field683 = 150;

						if (var7 == 2 || var7 == 3) {
							method133("@cr2@" + arg2.field541, var14, 1);
						} else if (var7 == 1) {
							method133("@cr1@" + arg2.field541, var14, 1);
						} else {
							method133(arg2.field541, var14, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field1263 = var8 + var9;
		}

		if ((arg3 & 0x8) != 0) {
			arg2.field686 = arg0.method470();
			arg2.field687 = arg0.method498();
		}

		if ((arg3 & 0x1) != 0) {
			int var16 = arg0.method498();
			if (var16 == 0xFFFF) {
				var16 = -1;
			}

			int var17 = arg0.method487();
			if (arg2.field717 == var16 && var16 != -1) {
				int var18 = LMDSPIVT.field867[var16].field881;
				if (var18 == 1) {
					arg2.field718 = 0;
					arg2.field719 = 0;
					arg2.field720 = var17;
					arg2.field721 = 0;
				}

				if (var18 == 2) {
					arg2.field721 = 0;
				}
			} else if (var16 == -1 || arg2.field717 == -1 || LMDSPIVT.field867[var16].field875 >= LMDSPIVT.field867[arg2.field717].field875) {
				arg2.field717 = var16;
				arg2.field718 = 0;
				arg2.field719 = 0;
				arg2.field720 = var17;
				arg2.field721 = 0;
				arg2.field704 = arg2.field716;
			}
		}

		if ((arg3 & 0x200) != 0) {
			int var19 = arg0.method487();
			int var20 = arg0.method487();
			arg2.method229(var19, field258, var20);
			arg2.field709 = field258 + 300;
			arg2.field710 = arg0.method488();
			arg2.field711 = arg0.method488();
		}

		if ((arg3 & 0x4) != 0) {
			int var21 = arg0.method489();
			byte[] var22 = new byte[var21];
			TQYMAXSO var23 = new TQYMAXSO(var22);
			arg0.method477(0, var21, var22);
			field371[arg1] = var23;
			arg2.method187(var23);
		}

		if ((arg3 & 0x20) != 0) {
			int var24 = arg0.method488();
			int var25 = arg0.method488();
			arg2.method229(var24, field258, var25);
			arg2.field709 = field258 + 300;
			arg2.field710 = arg0.method468();
			arg2.field711 = arg0.method489();
		}
	}

	@ObfuscatedName("client.a(LOMJBPTVL;I)Z")
	public final boolean method105(OMJBPTVL arg0) {
		if (arg0.field1059 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1059.length; var2++) {
			int var3 = method135(var2, arg0);
			int var4 = arg0.field1055[var2];
			if (arg0.field1059[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1059[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1059[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(ZZI)V")
	public final void method106(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(IILTQYMAXSO;)V")
	public final void method107(int arg0, TQYMAXSO arg1) {
		while (arg1.field1264 + 21 < arg0 * 8) {
			int var3 = arg1.method479(14);
			if (var3 == 16383) {
				break;
			}

			if (field113[var3] == null) {
				field113[var3] = new GYKYBIID();
			}

			GYKYBIID var4 = field113[var3];
			field115[field114++] = var3;
			var4.field689 = field258;
			int var5 = arg1.method479(1);
			int var6 = arg1.method479(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.field625 = YANZSPIT.method563(arg1.method479(13));
			int var7 = arg1.method479(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method479(1);
			if (var8 == 1) {
				field370[field369++] = var3;
			}

			var4.field737 = var4.field625.field1393;
			var4.field708 = var4.field625.field1406;
			var4.field727 = var4.field625.field1417;
			var4.field728 = var4.field625.field1400;
			var4.field729 = var4.field625.field1425;
			var4.field730 = var4.field625.field1410;
			var4.field693 = var4.field625.field1395;
			var4.method227(var5 == 1, field269.field731[0] + var7, field269.field732[0] + var6);
		}

		arg1.method480();
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method108(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method108(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.b(IIBI)I")
	public final int method109(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field312[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field246[var6][var4][var5] + field246[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field246[var6][var4][var5 + 1] + field246[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method110() {
		field223 = true;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.k(B)V")
	public final void method111() {
		field259 = 0;
		int var1 = (field269.field734 >> 7) + field418;
		int var2 = (field269.field735 >> 7) + field419;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field259 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field259 = 1;
		}

		if (field259 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field259 = 0;
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method112() {
		byte[] var1 = field382.method442("title.dat", null);
		TPUDHOHI var2 = new TPUDHOHI(var1, this);
		field139.method541();
		var2.method446(0, 0);
		field140.method541();
		var2.method446(0, -637);
		field136.method541();
		var2.method446(0, -128);
		field137.method541();
		var2.method446(-371, -202);
		field138.method541();
		var2.method446(-171, -202);
		field141.method541();
		var2.method446(-265, 0);
		field142.method541();
		var2.method446(-265, -562);
		field143.method541();
		var2.method446(-171, -128);
		field144.method541();
		var2.method446(-171, -562);
		int[] var3 = new int[var2.field1256];
		for (int var4 = 0; var4 < var2.field1257; var4++) {
			for (int var5 = 0; var5 < var2.field1256; var5++) {
				var3[var5] = var2.field1255[var2.field1256 * var4 + var2.field1256 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1256; var6++) {
				var2.field1255[var2.field1256 * var4 + var6] = var3[var6];
			}
		}

		field139.method541();
		var2.method446(0, 382);
		field140.method541();
		var2.method446(0, -255);
		field136.method541();
		var2.method446(0, 254);
		field137.method541();
		var2.method446(-371, 180);
		field138.method541();
		var2.method446(-171, 180);
		field141.method541();
		var2.method446(-265, 382);
		field142.method541();
		var2.method446(-265, -180);
		field143.method541();
		var2.method446(-171, 254);
		field144.method541();
		var2.method446(-171, -180);
		TPUDHOHI var7 = new TPUDHOHI(field382, "logo", 0);
		field136.method541();
		var7.method448(382 - var7.field1256 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(BILTQYMAXSO;)V")
	public final void method113(int arg0, TQYMAXSO arg1) {
		if (arg0 == 187) {
			int var3 = arg1.method468();
			int var4 = (var3 >> 4 & 0x7) + field89;
			int var5 = (var3 & 0x7) + field90;
			int var6 = var4 + arg1.method469();
			int var7 = var5 + arg1.method469();
			int var8 = arg1.method471();
			int var9 = arg1.method470();
			int var10 = arg1.method468() * 4;
			int var11 = arg1.method468() * 4;
			int var12 = arg1.method470();
			int var13 = arg1.method470();
			int var14 = arg1.method468();
			int var15 = arg1.method468();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var9 != 0xFFFF) {
				var4 = var4 * 128 + 64;
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				var7 = var7 * 128 + 64;
				VCMSZAQJ var16 = new VCMSZAQJ(field258 + var12, var14, var8, var5, method109(var5, var4, field211) - var10, field211, var11, var15, var9, field258 + var13, var4);
				var16.method532(method109(var7, var6, field211) - var11, var6, field258 + var12, var7);
				field525.method176(var16);
			}
		} else if (arg0 == 160) {
			int var17 = arg1.method468();
			int var18 = (var17 >> 4 & 0x7) + field89;
			int var19 = (var17 & 0x7) + field90;
			int var20 = arg1.method470();
			int var21 = arg1.method468();
			int var22 = arg1.method470();
			if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
				var18 = var18 * 128 + 64;
				var19 = var19 * 128 + 64;
				LQFXNPID var23 = new LQFXNPID(field211, method109(var19, var18, field211) - var21, field258, var18, var22, var20, var19);
				field208.method176(var23);
			}
		} else {
			if (arg0 == 185) {
				int var24 = arg1.method468();
				int var25 = (var24 >> 4 & 0x7) + field89;
				int var26 = (var24 & 0x7) + field90;
				int var27 = arg1.method470();
				int var28 = arg1.method468();
				int var29 = var28 >> 4 & 0xF;
				int var30 = var28 & 0x7;
				if (field269.field731[0] >= var25 - var29 && field269.field731[0] <= var25 + var29 && field269.field732[0] >= var26 - var29 && field269.field732[0] <= var26 + var29 && field411 && !field437 && field125 < 50) {
					field482[field125] = var27;
					field441[field125] = var30;
					field91[field125] = WBMSJJDO.field1332[var27];
					field125++;
				}
			}

			if (arg0 == 14) {
				int var31 = arg1.method489();
				int var32 = (var31 >> 4 & 0x7) + field89;
				int var33 = (var31 & 0x7) + field90;
				int var34 = arg1.method488();
				int var35 = var34 >> 2;
				int var36 = var34 & 0x3;
				int var37 = field99[var35];
				int var38 = arg1.method496();
				if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
					method149(var38, 0, var32, var37, -1, var36, field211, var35, var33);
				}
			} else if (arg0 == 91) {
				int var39 = arg1.method489();
				int var40 = (var39 >> 4 & 0x7) + field89;
				int var41 = (var39 & 0x7) + field90;
				int var42 = arg1.method498();
				if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
					CRZPTUPR var43 = field124[field211][var40][var41];
					if (var43 != null) {
						for (FIMDEAMY var44 = (FIMDEAMY) var43.method179(); var44 != null; var44 = (FIMDEAMY) var43.method181()) {
							if ((var42 & 0x7FFF) == var44.field624) {
								var44.method272();
								break;
							}
						}

						if (var43.method179() == null) {
							field124[field211][var40][var41] = null;
						}

						method98(var40, var41);
					}
				}
			} else {
				if (arg0 == 128) {
					int var45 = arg1.method496();
					int var46 = arg1.method468();
					int var47 = (var46 >> 4 & 0x7) + field89;
					int var48 = (var46 & 0x7) + field90;
					int var49 = arg1.method497();
					int var50 = arg1.method470();
					int var51 = arg1.method470();
					int var52 = arg1.method468();
					int var53 = var52 >> 2;
					int var54 = var52 & 0x3;
					int var55 = field99[var53];
					byte var56 = arg1.method490();
					byte var57 = arg1.method490();
					byte var58 = arg1.method491();
					byte var59 = arg1.method490();
					DEHYKQII var60;
					if (field130 == var51) {
						var60 = field269;
					} else {
						var60 = field366[var51];
					}

					if (var60 != null) {
						WEWSMZTU var61 = WEWSMZTU.method555(var50);
						int var62 = field246[field211][var47][var48];
						int var63 = field246[field211][var47 + 1][var48];
						int var64 = field246[field211][var47 + 1][var48 + 1];
						int var65 = field246[field211][var47][var48 + 1];
						KDWDYCIL var66 = var61.method556(var53, var54, var62, var63, var64, var65, -1);
						if (var66 != null) {
							method149(-1, var49 + 1, var47, var55, var45 + 1, 0, field211, 0, var48);
							var60.field534 = field258 + var49;
							var60.field535 = field258 + var45;
							var60.field545 = var66;
							int var67 = var61.field1349;
							int var68 = var61.field1384;
							if (var54 == 1 || var54 == 3) {
								var67 = var61.field1384;
								var68 = var61.field1349;
							}

							var60.field542 = var47 * 128 + var67 * 64;
							var60.field544 = var48 * 128 + var68 * 64;
							var60.field543 = method109(var60.field544, var60.field542, field211);

							if (var58 > var59) {
								byte var69 = var58;
								var58 = var59;
								var59 = var69;
							}

							if (var56 > var57) {
								byte var70 = var56;
								var56 = var57;
								var57 = var70;
							}

							var60.field546 = var47 + var58;
							var60.field548 = var47 + var59;
							var60.field547 = var48 + var56;
							var60.field549 = var48 + var57;
						}
					}
				}

				if (arg0 == 103) {
					int var71 = arg1.method489();
					int var72 = var71 >> 2;
					int var73 = var71 & 0x3;
					int var74 = field99[var72];
					int var75 = arg1.method487();
					int var76 = (var75 >> 4 & 0x7) + field89;
					int var77 = (var75 & 0x7) + field90;
					if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
						method149(-1, 0, var76, var74, -1, var73, field211, var72, var77);
					}
				} else if (arg0 == 255) {
					int var78 = arg1.method497();
					int var79 = arg1.method488();
					int var80 = (var79 >> 4 & 0x7) + field89;
					int var81 = (var79 & 0x7) + field90;
					int var82 = arg1.method468();
					int var83 = var82 >> 2;
					int var84 = var82 & 0x3;
					int var85 = field99[var83];
					if (var80 >= 0 && var81 >= 0 && var80 < 103 && var81 < 103) {
						int var86 = field246[field211][var80][var81];
						int var87 = field246[field211][var80 + 1][var81];
						int var88 = field246[field211][var80 + 1][var81 + 1];
						int var89 = field246[field211][var80][var81 + 1];
						if (var85 == 0) {
							KJEXEAAS var90 = field450.method306(field211, var80, var81);
							if (var90 != null) {
								int var91 = var90.field839 >> 14 & 0x7FFF;
								if (var83 == 2) {
									var90.field837 = new NTLPGIRW(var89, var91, var87, false, var84 + 4, 2, var88, var78, var86);
									var90.field838 = new NTLPGIRW(var89, var91, var87, false, var84 + 1 & 0x3, 2, var88, var78, var86);
								} else {
									var90.field837 = new NTLPGIRW(var89, var91, var87, false, var84, var83, var88, var78, var86);
								}
							}
						}

						if (var85 == 1) {
							ZZDGFDWT var92 = field450.method307(field211, var81, var80);
							if (var92 != null) {
								var92.field1516 = new NTLPGIRW(var89, var92.field1517 >> 14 & 0x7FFF, var87, false, 0, 4, var88, var78, var86);
							}
						}

						if (var85 == 2) {
							ZACLXEQP var93 = field450.method308(var81, field211, var80);

							if (var83 == 11) {
								var83 = 10;
							}

							if (var93 != null) {
								var93.field1484 = new NTLPGIRW(var89, var93.field1492 >> 14 & 0x7FFF, var87, false, var84, var83, var88, var78, var86);
							}
						}

						if (var85 == 3) {
							ORVSYYVN var94 = field450.method309(var80, var81, field211);
							if (var94 != null) {
								var94.field1077 = new NTLPGIRW(var89, var94.field1078 >> 14 & 0x7FFF, var87, false, var84, 22, var88, var78, var86);
							}
						}
					}
				} else if (arg0 == 210) {
					int var95 = arg1.method470();
					int var96 = arg1.method488();
					int var97 = (var96 >> 4 & 0x7) + field89;
					int var98 = (var96 & 0x7) + field90;
					int var99 = arg1.method496();
					int var100 = arg1.method498();
					if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104 && field130 != var99) {
						FIMDEAMY var101 = new FIMDEAMY();
						var101.field624 = var95;
						var101.field623 = var100;

						if (field124[field211][var97][var98] == null) {
							field124[field211][var97][var98] = new CRZPTUPR();
						}

						field124[field211][var97][var98].method176(var101);
						method98(var97, var98);
					}
				} else if (arg0 == 47) {
					int var102 = arg1.method468();
					int var103 = (var102 >> 4 & 0x7) + field89;
					int var104 = (var102 & 0x7) + field90;
					int var105 = arg1.method470();
					int var106 = arg1.method470();
					int var107 = arg1.method470();
					if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
						CRZPTUPR var108 = field124[field211][var103][var104];
						if (var108 != null) {
							for (FIMDEAMY var109 = (FIMDEAMY) var108.method179(); var109 != null; var109 = (FIMDEAMY) var108.method181()) {
								if ((var105 & 0x7FFF) == var109.field624 && var109.field623 == var106) {
									var109.field623 = var107;
									break;
								}
							}

							method98(var103, var104);
						}
					}
				} else if (arg0 == 69) {
					int var110 = arg1.method489();
					int var111 = (var110 >> 4 & 0x7) + field89;
					int var112 = (var110 & 0x7) + field90;
					int var113 = arg1.method497();
					int var114 = arg1.method496();
					if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
						FIMDEAMY var115 = new FIMDEAMY();
						var115.field624 = var114;
						var115.field623 = var113;

						if (field124[field211][var111][var112] == null) {
							field124[field211][var111][var112] = new CRZPTUPR();
						}

						field124[field211][var111][var112].method176(var115);
						method98(var111, var112);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method114() {
		field490++;
		method41(true);
		method78(true);
		method41(false);
		method78(false);
		method102();
		method38();

		if (!field85) {
			int var1 = field261;
			if (field176 / 256 > var1) {
				var1 = field176 / 256;
			}

			if (field340[4] && field284[4] + 128 > var1) {
				var1 = field284[4] + 128;
			}

			int var2 = field262 + field244 & 0x7FF;
			method63(field133, var1 * 3 + 600, var1, method109(field269.field735, field269.field734, field211) - 50, field132, var2);
		}

		int var3;
		if (field85) {
			var3 = method151();
		} else {
			var3 = method150();
		}

		int var4 = field328;
		int var5 = field329;
		int var6 = field330;
		int var7 = field331;
		int var8 = field332;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field340[var9]) {
				int var10 = (int) (Math.random() * (field486[var9] * 2 + 1) + Math.sin(field165[var9] / 100.0D * field102[var9]) * field284[var9] - field486[var9]);
				if (var9 == 0) {
					field328 += var10;
				}

				if (var9 == 1) {
					field329 += var10;
				}

				if (var9 == 2) {
					field330 += var10;
				}

				if (var9 == 3) {
					field332 = field332 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field331 += var10;
					if (field331 < 128) {
						field331 = 128;
					}

					if (field331 > 383) {
						field331 = 383;
					}
				}
			}
		}

		int var11 = SNMMFOLO.field1227;
		KDWDYCIL.field823 = true;
		KDWDYCIL.field826 = 0;
		KDWDYCIL.field824 = field1184 - 4;
		KDWDYCIL.field825 = field1185 - 4;
		MVOWZCMY.method343();
		field450.method323(field330, field331, var3, field329, field328, field332);
		field450.method298();
		method84();
		method156();
		method45(var11);
		method93();
		field465.method542(4, 4, field1176);
		field328 = var4;
		field329 = var5;
		field330 = var6;
		field331 = var7;
		field332 = var8;
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method115(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field146; var3++) {
				if (field282[var3] == arg0) {
					field146--;
					field255 = true;

					for (int var4 = var3; var4 < field146; var4++) {
						field282[var4] = field282[var4 + 1];
					}

					field83.method457(185);
					field83.method464(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method116() {
		if (field1190 == 1) {
			if (field1191 >= 6 && field1191 <= 106 && field1192 >= 467 && field1192 <= 499) {
				field300 = (field300 + 1) % 4;
				field333 = true;
				field153 = true;
				field83.method457(232);
				field83.method458(field300);
				field83.method458(field355);
				field83.method458(field228);
			}

			if (field1191 >= 135 && field1191 <= 235 && field1192 >= 467 && field1192 <= 499) {
				field355 = (field355 + 1) % 3;
				field333 = true;
				field153 = true;
				field83.method457(232);
				field83.method458(field300);
				field83.method458(field355);
				field83.method458(field228);
			}

			if (field1191 >= 273 && field1191 <= 373 && field1192 >= 467 && field1192 <= 499) {
				field228 = (field228 + 1) % 3;
				field333 = true;
				field153 = true;
				field83.method457(232);
				field83.method458(field300);
				field83.method458(field355);
				field83.method458(field228);
			}

			if (field1191 >= 412 && field1191 <= 512 && field1192 >= 467 && field1192 <= 499) {
				if (field88 == -1) {
					method119();
					field327 = "";
					field267 = false;
					field360 = field88 = OMJBPTVL.field1041;
					return;
				}

				method133("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method117(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.z(I)V")
	public static final void method118() {
		MPMWDRAA.field892 = false;
		SNMMFOLO.field1207 = false;
		field437 = false;
		AGPNOIRK.field12 = false;
		WEWSMZTU.field1381 = false;
	}

	@ObfuscatedName("client.l(B)V")
	public final void method119() {
		field83.method457(188);

		if (field120 != -1) {
			method80(field120);
			field120 = -1;
			field255 = true;
			field439 = false;
			field398 = true;
		}

		if (field98 != -1) {
			method80(field98);
			field98 = -1;
			field153 = true;
			field439 = false;
		}

		if (field326 != -1) {
			method80(field326);
			field326 = -1;
			field223 = true;
		}

		if (field428 != -1) {
			method80(field428);
			field428 = -1;
		}

		if (field88 != -1) {
			method80(field88);
			field88 = -1;
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method120() {
		int var1 = field491 * 128 + 64;
		int var2 = field492 * 128 + 64;
		int var3 = method109(var2, var1, field211) - field493;

		if (field328 < var1) {
			field328 += (var1 - field328) * field495 / 1000 + field494;
			if (field328 > var1) {
				field328 = var1;
			}
		}

		if (field328 > var1) {
			field328 -= (field328 - var1) * field495 / 1000 + field494;
			if (field328 < var1) {
				field328 = var1;
			}
		}

		if (field329 < var3) {
			field329 += (var3 - field329) * field495 / 1000 + field494;
			if (field329 > var3) {
				field329 = var3;
			}
		}

		if (field329 > var3) {
			field329 -= (field329 - var3) * field495 / 1000 + field494;
			if (field329 < var3) {
				field329 = var3;
			}
		}

		if (field330 < var2) {
			field330 += (var2 - field330) * field495 / 1000 + field494;
			if (field330 > var2) {
				field330 = var2;
			}
		}

		if (field330 > var2) {
			field330 -= (field330 - var2) * field495 / 1000 + field494;
			if (field330 < var2) {
				field330 = var2;
			}
		}

		int var4 = field247 * 128 + 64;
		int var5 = field248 * 128 + 64;
		int var6 = method109(var5, var4, field211) - field249;
		int var7 = var4 - field328;
		int var8 = var6 - field329;
		int var9 = var5 - field330;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field331 < var11) {
			field331 += (var11 - field331) * field251 / 1000 + field250;
			if (field331 > var11) {
				field331 = var11;
			}
		}

		if (field331 > var11) {
			field331 -= (field331 - var11) * field251 / 1000 + field250;
			if (field331 < var11) {
				field331 = var11;
			}
		}

		int var13 = var12 - field332;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field332 += field251 * var13 / 1000 + field250;
			field332 &= 0x7FF;
		}

		if (var13 < 0) {
			field332 -= -var13 * field251 / 1000 + field250;
			field332 &= 0x7FF;
		}

		int var14 = var12 - field332;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field332 = var12;
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method121() {
		for (int var1 = 0; var1 < field114; var1++) {
			int var2 = field115[var1];
			GYKYBIID var3 = field113[var2];
			if (var3 != null) {
				method122(var3.field625.field1393, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IZLJFHWDRLM;)V")
	public final void method122(int arg0, JFHWDRLM arg1) {
		if (arg1.field734 < 128 || arg1.field735 < 128 || arg1.field734 >= 13184 || arg1.field735 >= 13184) {
			arg1.field717 = -1;
			arg1.field722 = -1;
			arg1.field700 = 0;
			arg1.field701 = 0;
			arg1.field734 = arg1.field731[0] * 128 + arg1.field737 * 64;
			arg1.field735 = arg1.field732[0] * 128 + arg1.field737 * 64;
			arg1.method228();
		}

		if (field269 == arg1 && (arg1.field734 < 1536 || arg1.field735 < 1536 || arg1.field734 >= 11776 || arg1.field735 >= 11776)) {
			arg1.field717 = -1;
			arg1.field722 = -1;
			arg1.field700 = 0;
			arg1.field701 = 0;
			arg1.field734 = arg1.field731[0] * 128 + arg1.field737 * 64;
			arg1.field735 = arg1.field732[0] * 128 + arg1.field737 * 64;
			arg1.method228();
		}

		if (arg1.field700 > field258) {
			method123(arg1);
		} else if (arg1.field701 >= field258) {
			method124(arg1);
		} else {
			method125(arg1);
		}

		method126(arg1);
		method127(arg1);
	}

	@ObfuscatedName("client.a(ILJFHWDRLM;)V")
	public final void method123(JFHWDRLM arg0) {
		int var2 = arg0.field700 - field258;
		int var3 = arg0.field737 * 64 + arg0.field696 * 128;
		int var4 = arg0.field737 * 64 + arg0.field698 * 128;
		arg0.field734 += (var3 - arg0.field734) / var2;
		arg0.field735 += (var4 - arg0.field735) / var2;
		arg0.field703 = 0;

		if (arg0.field702 == 0) {
			arg0.field685 = 1024;
		}

		if (arg0.field702 == 1) {
			arg0.field685 = 1536;
		}

		if (arg0.field702 == 2) {
			arg0.field685 = 0;
		}

		if (arg0.field702 == 3) {
			arg0.field685 = 512;
		}
	}

	@ObfuscatedName("client.a(LJFHWDRLM;Z)V")
	public final void method124(JFHWDRLM arg0) {
		if (field258 == arg0.field701 || arg0.field717 == -1 || arg0.field720 != 0 || arg0.field719 + 1 > LMDSPIVT.field867[arg0.field717].method280(arg0.field718)) {
			int var2 = arg0.field701 - arg0.field700;
			int var3 = field258 - arg0.field700;
			int var4 = arg0.field737 * 64 + arg0.field696 * 128;
			int var5 = arg0.field737 * 64 + arg0.field698 * 128;
			int var6 = arg0.field737 * 64 + arg0.field697 * 128;
			int var7 = arg0.field737 * 64 + arg0.field699 * 128;
			arg0.field734 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field735 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field703 = 0;

		if (arg0.field702 == 0) {
			arg0.field685 = 1024;
		}

		if (arg0.field702 == 1) {
			arg0.field685 = 1536;
		}

		if (arg0.field702 == 2) {
			arg0.field685 = 0;
		}

		if (arg0.field702 == 3) {
			arg0.field685 = 512;
		}

		arg0.field736 = arg0.field685;
	}

	@ObfuscatedName("client.b(ILJFHWDRLM;)V")
	public final void method125(JFHWDRLM arg0) {
		arg0.field713 = arg0.field693;
		if (arg0.field716 == 0) {
			arg0.field703 = 0;
		} else {
			if (arg0.field717 != -1 && arg0.field720 == 0) {
				LMDSPIVT var2 = LMDSPIVT.field867[arg0.field717];
				if (arg0.field704 > 0 && var2.field879 == 0) {
					arg0.field703++;
					return;
				}

				if (arg0.field704 <= 0 && var2.field880 == 0) {
					arg0.field703++;
					return;
				}
			}

			int var3 = arg0.field734;
			int var4 = arg0.field735;
			int var5 = arg0.field731[arg0.field716 - 1] * 128 + arg0.field737 * 64;
			int var6 = arg0.field732[arg0.field716 - 1] * 128 + arg0.field737 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field685 = 1280;
					} else if (var4 > var6) {
						arg0.field685 = 1792;
					} else {
						arg0.field685 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field685 = 768;
					} else if (var4 > var6) {
						arg0.field685 = 256;
					} else {
						arg0.field685 = 512;
					}
				} else if (var4 < var6) {
					arg0.field685 = 1024;
				} else {
					arg0.field685 = 0;
				}

				int var7 = arg0.field685 - arg0.field736 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field728;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field727;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field730;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field729;
				}

				if (var8 == -1) {
					var8 = arg0.field727;
				}

				arg0.field713 = var8;
				int var9 = 4;
				if (arg0.field736 != arg0.field685 && arg0.field705 == -1 && arg0.field708 != 0) {
					var9 = 2;
				}

				if (arg0.field716 > 2) {
					var9 = 6;
				}

				if (arg0.field716 > 3) {
					var9 = 8;
				}

				if (arg0.field703 > 0 && arg0.field716 > 1) {
					var9 = 8;
					arg0.field703--;
				}

				if (arg0.field684[arg0.field716 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field727 == arg0.field713 && arg0.field688 != -1) {
					arg0.field713 = arg0.field688;
				}

				if (var3 < var5) {
					arg0.field734 += var9;
					if (arg0.field734 > var5) {
						arg0.field734 = var5;
					}
				} else if (var3 > var5) {
					arg0.field734 -= var9;
					if (arg0.field734 < var5) {
						arg0.field734 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field735 += var9;
					if (arg0.field735 > var6) {
						arg0.field735 = var6;
					}
				} else if (var4 > var6) {
					arg0.field735 -= var9;
					if (arg0.field735 < var6) {
						arg0.field735 = var6;
					}
				}

				if (arg0.field734 == var5 && arg0.field735 == var6) {
					arg0.field716--;

					if (arg0.field704 > 0) {
						arg0.field704--;
						return;
					}
				}
			} else {
				arg0.field734 = var5;
				arg0.field735 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(BLJFHWDRLM;)V")
	public final void method126(JFHWDRLM arg0) {
		if (arg0.field708 != 0) {
			if (arg0.field705 != -1 && arg0.field705 < 32768) {
				GYKYBIID var2 = field113[arg0.field705];
				if (var2 != null) {
					int var3 = arg0.field734 - var2.field734;
					int var4 = arg0.field735 - var2.field735;
					if (var3 != 0 || var4 != 0) {
						arg0.field685 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field705 >= 32768) {
				int var5 = arg0.field705 - 32768;
				if (field130 == var5) {
					var5 = field365;
				}

				DEHYKQII var6 = field366[var5];
				if (var6 != null) {
					int var7 = arg0.field734 - var6.field734;
					int var8 = arg0.field735 - var6.field735;
					if (var7 != 0 || var8 != 0) {
						arg0.field685 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field686 != 0 || arg0.field687 != 0) && (arg0.field716 == 0 || arg0.field703 > 0)) {
				int var9 = arg0.field734 - (arg0.field686 - field418 - field418) * 64;
				int var10 = arg0.field735 - (arg0.field687 - field419 - field419) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field685 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field686 = 0;
				arg0.field687 = 0;
			}

			int var11 = arg0.field685 - arg0.field736 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field708 || var11 > 2048 - arg0.field708) {
					arg0.field736 = arg0.field685;
				} else if (var11 > 1024) {
					arg0.field736 -= arg0.field708;
				} else {
					arg0.field736 += arg0.field708;
				}

				arg0.field736 &= 0x7FF;
				if (arg0.field713 == arg0.field693 && arg0.field736 != arg0.field685) {
					if (arg0.field694 != -1) {
						arg0.field713 = arg0.field694;
						return;
					}

					arg0.field713 = arg0.field727;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LJFHWDRLM;I)V")
	public final void method127(JFHWDRLM arg0) {
		arg0.field706 = false;

		if (arg0.field713 != -1) {
			LMDSPIVT var2 = LMDSPIVT.field867[arg0.field713];
			arg0.field715++;
			if (arg0.field714 < var2.field868 && arg0.field715 > var2.method280(arg0.field714)) {
				arg0.field715 = 0;
				arg0.field714++;
			}

			if (arg0.field714 >= var2.field868) {
				arg0.field715 = 0;
				arg0.field714 = 0;
			}
		}

		if (arg0.field722 != -1 && field258 >= arg0.field725) {
			if (arg0.field723 < 0) {
				arg0.field723 = 0;
			}

			LMDSPIVT var3 = QUXKFXEA.field1148[arg0.field722].field1152;
			arg0.field724++;
			while (arg0.field723 < var3.field868 && arg0.field724 > var3.method280(arg0.field723)) {
				arg0.field724 -= var3.method280(arg0.field723);
				arg0.field723++;
			}

			if (arg0.field723 >= var3.field868 && (arg0.field723 < 0 || arg0.field723 >= var3.field868)) {
				arg0.field722 = -1;
			}
		}

		if (arg0.field717 != -1 && arg0.field720 <= 1) {
			LMDSPIVT var4 = LMDSPIVT.field867[arg0.field717];
			if (var4.field879 == 1 && arg0.field704 > 0 && arg0.field700 <= field258 && arg0.field701 < field258) {
				arg0.field720 = 1;
				return;
			}
		}

		if (arg0.field717 != -1 && arg0.field720 == 0) {
			LMDSPIVT var5 = LMDSPIVT.field867[arg0.field717];
			arg0.field719++;
			while (arg0.field718 < var5.field868 && arg0.field719 > var5.method280(arg0.field718)) {
				arg0.field719 -= var5.method280(arg0.field718);
				arg0.field718++;
			}

			if (arg0.field718 >= var5.field868) {
				arg0.field718 -= var5.field872;
				arg0.field721++;
				if (arg0.field721 >= var5.field878) {
					arg0.field717 = -1;
				}

				if (arg0.field718 < 0 || arg0.field718 >= var5.field868) {
					arg0.field717 = -1;
				}
			}

			arg0.field706 = var5.field874;
		}

		if (arg0.field720 > 0) {
			arg0.field720--;
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method128() {
		if (field326 == -1 || field82 != 2 && field1177 == null) {
			if (field223) {
				method83();
				field223 = false;
				field291.method542(4, 0, field1176);
				field292.method542(357, 0, field1176);
				field293.method542(4, 722, field1176);
				field294.method542(205, 743, field1176);
				field295.method542(0, 0, field1176);
				field296.method542(4, 516, field1176);
				field297.method542(205, 516, field1176);
				field298.method542(357, 496, field1176);
				field299.method542(338, 0, field1176);
				field255 = true;
				field153 = true;
				field398 = true;
				field333 = true;

				if (field82 != 2) {
					field465.method542(4, 4, field1176);
					field464.method542(4, 550, field1176);
				}
			}

			if (field82 == 2) {
				method114();
			}

			if (field260 && field452 == 1) {
				field255 = true;
			}

			if (field120 != -1) {
				boolean var3 = method56(field120, field172);
				if (var3) {
					field255 = true;
				}
			}

			if (field510 == 2) {
				field255 = true;
			}

			if (field337 == 2) {
				field255 = true;
			}

			if (field255) {
				method145();
				field255 = false;
			}

			if (field98 == -1 && field384 == 0) {
				field168.field1061 = field184 - field106 - 77;

				if (field1184 > 448 && field1184 < 560 && field1185 > 332) {
					method62(77, 463, field184, field1185 - 357, field168, -1, 0, field1184 - 17);
				}

				int var4 = field184 - field168.field1061 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field184 - 77) {
					var4 = field184 - 77;
				}

				if (field106 != var4) {
					field106 = var4;
					field153 = true;
				}

				field272++;
				if (field272 > 156) {
					field272 = 0;
					field83.method457(80);
					field83.method458(96);
				}
			}

			if (field98 == -1 && field384 == 3) {
				int var5 = field443 * 14 + 7;
				field168.field1061 = field446;

				if (field1184 > 448 && field1184 < 560 && field1185 > 332) {
					method62(77, 463, var5, field1185 - 357, field168, -1, 0, field1184 - 17);
				}

				int var6 = field168.field1061;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field446 != var6) {
					field446 = var6;
					field153 = true;
				}
			}

			if (field98 != -1) {
				boolean var7 = method56(field98, field172);
				if (var7) {
					field153 = true;
				}
			}

			if (field510 == 3) {
				field153 = true;
			}

			if (field337 == 3) {
				field153 = true;
			}

			if (field283 != null) {
				field153 = true;
			}

			if (field260 && field452 == 2) {
				field153 = true;
			}

			if (field153) {
				method142();
				field153 = false;
			}

			if (field82 == 2) {
				method44();
				field464.method542(4, 550, field1176);
			}

			if (field166 != -1) {
				field398 = true;
			}

			if (field398) {
				if (field166 != -1 && field356 == field166) {
					field166 = -1;
					field83.method457(255);
					field83.method458(field356);
				}

				field398 = false;
				field281.method541();
				field323.method539(0, 0);

				if (field120 == -1) {
					if (field502[field356] != -1) {
						if (field356 == 0) {
							field514.method539(22, 10);
						}

						if (field356 == 1) {
							field515.method539(54, 8);
						}

						if (field356 == 2) {
							field515.method539(82, 8);
						}

						if (field356 == 3) {
							field516.method539(110, 8);
						}

						if (field356 == 4) {
							field518.method539(153, 8);
						}

						if (field356 == 5) {
							field518.method539(181, 8);
						}

						if (field356 == 6) {
							field517.method539(209, 9);
						}
					}

					if (field502[0] != -1 && (field166 != 0 || field258 % 20 < 10)) {
						field503[0].method539(29, 13);
					}

					if (field502[1] != -1 && (field166 != 1 || field258 % 20 < 10)) {
						field503[1].method539(53, 11);
					}

					if (field502[2] != -1 && (field166 != 2 || field258 % 20 < 10)) {
						field503[2].method539(82, 11);
					}

					if (field502[3] != -1 && (field166 != 3 || field258 % 20 < 10)) {
						field503[3].method539(115, 12);
					}

					if (field502[4] != -1 && (field166 != 4 || field258 % 20 < 10)) {
						field503[4].method539(153, 13);
					}

					if (field502[5] != -1 && (field166 != 5 || field258 % 20 < 10)) {
						field503[5].method539(180, 11);
					}

					if (field502[6] != -1 && (field166 != 6 || field258 % 20 < 10)) {
						field503[6].method539(208, 13);
					}
				}

				field281.method542(160, 516, field1176);
				field194++;
				if (field194 > 61) {
					field194 = 0;
					field83.method457(1);
				}

				field280.method541();
				field322.method539(0, 0);

				if (field120 == -1) {
					if (field502[field356] != -1) {
						if (field356 == 7) {
							field467.method539(42, 0);
						}

						if (field356 == 8) {
							field468.method539(74, 0);
						}

						if (field356 == 9) {
							field468.method539(102, 0);
						}

						if (field356 == 10) {
							field469.method539(130, 1);
						}

						if (field356 == 11) {
							field471.method539(173, 0);
						}

						if (field356 == 12) {
							field471.method539(201, 0);
						}

						if (field356 == 13) {
							field470.method539(229, 0);
						}
					}

					if (field502[8] != -1 && (field166 != 8 || field258 % 20 < 10)) {
						field503[7].method539(74, 2);
					}

					if (field502[9] != -1 && (field166 != 9 || field258 % 20 < 10)) {
						field503[8].method539(102, 3);
					}

					if (field502[10] != -1 && (field166 != 10 || field258 % 20 < 10)) {
						field503[9].method539(137, 4);
					}

					if (field502[11] != -1 && (field166 != 11 || field258 % 20 < 10)) {
						field503[10].method539(174, 2);
					}

					if (field502[12] != -1 && (field166 != 12 || field258 % 20 < 10)) {
						field503[11].method539(201, 2);
					}

					if (field502[13] != -1 && (field166 != 13 || field258 % 20 < 10)) {
						field503[12].method539(226, 2);
					}
				}

				field280.method542(466, 496, field1176);
				field465.method541();
				SNMMFOLO.field1218 = field404;
			}

			if (field333) {
				field333 = false;
				field279.method541();
				field321.method539(0, 0);
				field149.method591(28, 55, true, "Public chat", 0xFFFFFF);

				if (field300 == 0) {
					field149.method591(41, 55, true, "On", 0xFF00);
				}

				if (field300 == 1) {
					field149.method591(41, 55, true, "Friends", 0xFFFF00);
				}

				if (field300 == 2) {
					field149.method591(41, 55, true, "Off", 0xFF0000);
				}

				if (field300 == 3) {
					field149.method591(41, 55, true, "Hide", 0xFFFF);
				}

				field149.method591(28, 184, true, "Private chat", 0xFFFFFF);

				if (field355 == 0) {
					field149.method591(41, 184, true, "On", 0xFF00);
				}

				if (field355 == 1) {
					field149.method591(41, 184, true, "Friends", 0xFFFF00);
				}

				if (field355 == 2) {
					field149.method591(41, 184, true, "Off", 0xFF0000);
				}

				field149.method591(28, 324, true, "Trade/compete", 0xFFFFFF);

				if (field228 == 0) {
					field149.method591(41, 324, true, "On", 0xFF00);
				}

				if (field228 == 1) {
					field149.method591(41, 324, true, "Friends", 0xFFFF00);
				}

				if (field228 == 2) {
					field149.method591(41, 324, true, "Off", 0xFF0000);
				}

				field149.method591(33, 458, true, "Report abuse", 0xFFFFFF);
				field279.method542(453, 0, field1176);
				field465.method541();
				SNMMFOLO.field1218 = field404;
			}

			field172 = 0;
		} else {
			if (field82 == 2) {
				method56(field326, field172);

				if (field428 != -1) {
					method56(field428, field172);
				}

				field172 = 0;
				method97();
				field1177.method541();
				SNMMFOLO.field1218 = field405;
				MVOWZCMY.method343();
				field223 = true;
				OMJBPTVL var1 = OMJBPTVL.method359(field326);
				if (var1.field1064 == 512 && var1.field1037 == 334 && var1.field1008 == 0) {
					var1.field1064 = 765;
					var1.field1037 = 503;
				}

				method89(0, 0, 0, var1);

				if (field428 != -1) {
					OMJBPTVL var2 = OMJBPTVL.method359(field428);
					if (var2.field1064 == 512 && var2.field1037 == 334 && var2.field1008 == 0) {
						var2.field1064 = 765;
						var2.field1037 = 503;
					}

					method89(0, 0, 0, var2);
				}

				if (field260) {
					method72();
				} else {
					method157();
					method153();
				}
			}

			field1177.method542(0, 0, field1176);
		}
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method129(int arg0) {
		int[] var2 = field310.field1255;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field312[arg0][var7][var5] & 0x18) == 0) {
					field450.method319(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field312[arg0 + 1][var7][var5] & 0x8) != 0) {
					field450.method319(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field310.method443();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field312[arg0][var11][var10] & 0x18) == 0) {
					method74(var8, var11, var10, arg0, var9);
				}

				if (arg0 < 3 && (field312[arg0 + 1][var11][var10] & 0x8) != 0) {
					method74(var8, var11, var10, arg0 + 1, var9);
				}
			}
		}

		if (field465 != null) {
			field465.method541();
			SNMMFOLO.field1218 = field404;
		}

		field179++;
		if (field179 > 1530) {
			field179 = 0;
			field83.method457(221);
			field83.method458(0);
			int var12 = field83.field1263;

			if ((int) (Math.random() * 2.0D) == 0) {
				field83.method458(208);
			}

			field83.method459(61880);

			if ((int) (Math.random() * 2.0D) == 0) {
				field83.method459(9307);
			}

			field83.method459((int) (Math.random() * 65536.0D));
			field83.method459((int) (Math.random() * 65536.0D));

			if ((int) (Math.random() * 2.0D) == 0) {
				field83.method458(227);
			}

			field83.method459((int) (Math.random() * 65536.0D));
			field83.method459(6023);
			field83.method458(127);
			field83.method459(54661);
			field83.method467(field83.field1263 - var12);
		}

		field407 = 0;
		for (int var13 = 0; var13 < 104; var13++) {
			for (int var14 = 0; var14 < 104; var14++) {
				int var15 = field450.method313(field211, var13, var14);
				if (var15 != 0) {
					var15 = var15 >> 14 & 0x7FFF;
					int var16 = WEWSMZTU.method555(var15).field1373;
					if (var16 >= 0) {
						int var17 = var13;
						int var18 = var14;
						if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
							byte var19 = 104;
							byte var20 = 104;
							int[][] var21 = field472[field211].field1280;
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

						field119[field407] = field521[var16];
						field408[field407] = var17;
						field409[field407] = var18;
						field407++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;BILjava/lang/String;)LSXKKBWPU;")
	public final SXKKBWPU method130(int arg0, int arg1, String arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field413[0] != null) {
				var6 = field413[0].method527(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field126.reset();
			field126.update(var6);
			int var8 = (int) field126.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new SXKKBWPU(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method61(arg3, "Requesting " + arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method172(arg2 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				TQYMAXSO var16 = new TQYMAXSO(var15);
				var16.field1263 = 3;
				int var17 = var16.method472() + 6;
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
						method61(arg3, "Loading " + arg4 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field413[0] != null) {
						field413[0].method528(var6.length, var6, arg0);
					}
				} catch (Exception var28) {
					field413[0] = null;
				}

				if (var6 != null) {
					field126.reset();
					field126.update(var6);
					int var23 = (int) field126.getValue();
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
						method61(arg3, "Game updated - please reload page");
						var25 = 10;
					} else {
						method61(arg3, var11 + " - Retrying in " + var25);
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

				field461 = !field461;
			}
		}

		return new SXKKBWPU(var6);
	}

	@ObfuscatedName("client.a(ILYANZSPIT;IZI)V")
	public final void method131(int arg0, YANZSPIT arg1, int arg2, int arg3) {
		if (field401 < 400) {
			if (arg1.field1413 != null) {
				arg1 = arg1.method568();
			}

			if (arg1 != null && arg1.field1409) {
				String var5 = arg1.field1418;
				if (arg1.field1397 != 0) {
					var5 = var5 + method99(arg1.field1397, field269.field533) + " (level-" + arg1.field1397 + ")";
				}

				if (field372 == 1) {
					field361[field401] = "Use " + field376 + " with @yel@" + var5;
					field476[field401] = 776;
					field477[field401] = arg0;
					field474[field401] = arg2;
					field475[field401] = arg3;
					field401++;
				} else if (field378 != 1) {
					if (arg1.field1414 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field1414[var6] != null && !arg1.field1414[var6].equalsIgnoreCase("attack")) {
								field361[field401] = arg1.field1414[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field476[field401] = 184;
								}

								if (var6 == 1) {
									field476[field401] = 49;
								}

								if (var6 == 2) {
									field476[field401] = 356;
								}

								if (var6 == 3) {
									field476[field401] = 80;
								}

								if (var6 == 4) {
									field476[field401] = 113;
								}

								field477[field401] = arg0;
								field474[field401] = arg2;
								field475[field401] = arg3;
								field401++;
							}
						}
					}

					if (arg1.field1414 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field1414[var7] != null && arg1.field1414[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field1397 > field269.field533) {
									var8 = 2000;
								}

								field361[field401] = arg1.field1414[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field476[field401] = var8 + 184;
								}

								if (var7 == 1) {
									field476[field401] = var8 + 49;
								}

								if (var7 == 2) {
									field476[field401] = var8 + 356;
								}

								if (var7 == 3) {
									field476[field401] = var8 + 80;
								}

								if (var7 == 4) {
									field476[field401] = var8 + 113;
								}

								field477[field401] = arg0;
								field474[field401] = arg2;
								field475[field401] = arg3;
								field401++;
							}
						}
					}

					field361[field401] = "Examine @yel@" + var5;
					field476[field401] = 1827;
					field477[field401] = arg0;
					field474[field401] = arg2;
					field475[field401] = arg3;
					field401++;
				} else if ((field380 & 0x2) == 2) {
					field361[field401] = field381 + " @yel@" + var5;
					field476[field401] = 719;
					field477[field401] = arg0;
					field474[field401] = arg2;
					field475[field401] = arg3;
					field401++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method132() {
		field410 = null;
		field87 = null;
		field521 = null;
		field474 = null;
		field475 = null;
		field476 = null;
		field477 = null;
		field361 = null;
		field341 = null;
		method33();

		if (field397 != null) {
			field397.field1387 = false;
		}

		field397 = null;
		field408 = null;
		field409 = null;
		field119 = null;
		field525 = null;
		field208 = null;
		field344 = null;
		field215 = null;
		field118 = null;
		field377 = null;
		field219 = null;
		field498 = null;
		field152 = null;
		field220 = null;
		field221 = null;
		field514 = null;
		field515 = null;
		field516 = null;
		field517 = null;
		field518 = null;

		if (field171 != null) {
			field171.method202();
		}

		field171 = null;
		field291 = null;
		field292 = null;
		field293 = null;
		field294 = null;
		field124 = null;
		field346 = null;
		field139 = null;
		field140 = null;
		field136 = null;
		field137 = null;
		field138 = null;
		field285 = null;
		field286 = null;
		field287 = null;
		field288 = null;
		field289 = null;
		field321 = null;
		field322 = null;
		field323 = null;
		field366 = null;
		field368 = null;
		field370 = null;
		field371 = null;
		field276 = null;
		field141 = null;
		field142 = null;
		field143 = null;
		field144 = null;
		field246 = null;
		field312 = null;
		field450 = null;
		field472 = null;
		field463 = null;
		field464 = null;
		field465 = null;
		field466 = null;

		try {
			if (field95 != null) {
				field95.method273();
			}
		} catch (Exception var1) {
		}

		field95 = null;
		field83 = null;
		field92 = null;
		field290 = null;
		field112 = null;
		field448 = null;
		field345 = null;
		field449 = null;
		field234 = null;
		field315 = null;
		field105 = null;
		field268 = null;
		field295 = null;
		field296 = null;
		field297 = null;
		field298 = null;
		field299 = null;
		field113 = null;
		field115 = null;
		field503 = null;
		field467 = null;
		field468 = null;
		field469 = null;
		field470 = null;
		field471 = null;
		field188 = null;
		field110 = null;
		field161 = null;
		field162 = null;
		field279 = null;
		field280 = null;
		field281 = null;
		field310 = null;
		field191 = null;
		field192 = null;
		field193 = null;
		method90();
		WEWSMZTU.method560();
		YANZSPIT.method562();
		YDSJAZFL.method577();
		OMJBPTVL.method362();
		JZNGGVQB.field748 = null;
		DOOZRHTX.field555 = null;
		EELFHNVU.field588 = null;
		LMDSPIVT.field867 = null;
		QUXKFXEA.field1148 = null;
		QUXKFXEA.field1160 = null;
		MUUMFTDK.field962 = null;
		field1177 = null;
		DEHYKQII.field538 = null;
		SNMMFOLO.method424();
		MPMWDRAA.method283();
		KDWDYCIL.method242();
		SGSYCWFB.method421();
		System.gc();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;BI)V")
	public final void method133(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field512 != -1) {
			field283 = arg1;
			field1190 = 0;
		}

		if (field98 == -1) {
			field153 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field347[var4] = field347[var4 - 1];
			field348[var4] = field348[var4 - 1];
			field349[var4] = field349[var4 - 1];
		}

		field347[0] = arg2;
		field348[0] = arg0;
		field349[0] = arg1;
	}

	@ObfuscatedName("client.A(I)V")
	public static final void method134() {
		MPMWDRAA.field892 = true;
		SNMMFOLO.field1207 = true;
		field437 = true;
		AGPNOIRK.field12 = true;
		WEWSMZTU.field1381 = true;
	}

	@ObfuscatedName("client.a(ILOMJBPTVL;B)I")
	public final int method135(int arg0, OMJBPTVL arg1) {
		if (arg1.field1019 == null || arg0 >= arg1.field1019.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1019[arg0];
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
					var8 = field414[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field241[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field320[var3[var5++]];
				}

				if (var7 == 4) {
					OMJBPTVL var10 = OMJBPTVL.method359(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < YDSJAZFL.field1451 && (!YDSJAZFL.method575(var11).field1431 || field436)) {
						for (int var12 = 0; var12 < var10.field1030.length; var12++) {
							if (var11 + 1 == var10.field1030[var12]) {
								var8 += var10.field1071[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field341[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field206[field241[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field341[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field269.field533;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < DQSKKFHM.field562; var13++) {
						if (DQSKKFHM.field564[var13]) {
							var8 += field241[var13];
						}
					}
				}

				if (var7 == 10) {
					OMJBPTVL var14 = OMJBPTVL.method359(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < YDSJAZFL.field1451 && (!YDSJAZFL.method575(var15).field1431 || field436)) {
						for (int var16 = 0; var16 < var14.field1030.length; var16++) {
							if (var14.field1030[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field496;
				}

				if (var7 == 12) {
					var8 = field145;
				}

				if (var7 == 13) {
					int var17 = field341[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					ATLVWFDY var20 = ATLVWFDY.field69[var19];
					int var21 = var20.field71;
					int var22 = var20.field72;
					int var23 = var20.field73;
					int var24 = field271[var23 - var22];
					var8 = field341[var21] >> var22 & var24;
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
					var8 = (field269.field734 >> 7) + field418;
				}

				if (var7 == 19) {
					var8 = (field269.field735 >> 7) + field419;
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

	@ObfuscatedName("client.B(I)V")
	public final void method136() {
		if (field325 != 0) {
			int var1 = 0;
			if (field243 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field349[var2] != null) {
					int var3 = field347[var2];
					String var4 = field348[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field355 == 0 || field355 == 1 && method65(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1184 > 4 && field1185 - 4 > var8 - 10 && field1185 - 4 <= var8 + 3) {
							int var9 = field149.method592("From:  " + var4 + field349[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1184 < var9 + 4) {
								if (field270 >= 1) {
									field361[field401] = "Report abuse @whi@" + var4;
									field476[field401] = 2550;
									field401++;
								}

								field361[field401] = "Add ignore @whi@" + var4;
								field476[field401] = 2955;
								field401++;
								field361[field401] = "Add friend @whi@" + var4;
								field476[field401] = 2646;
								field401++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field355 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method137() {
		if (field392 || field440 || field205) {
			method50();
		} else {
			field169++;

			if (field305) {
				method128();
			} else {
				method71(false);
			}

			field307 = 0;
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method138(int arg0) {
		int var2 = MUUMFTDK.field962[arg0].field970;
		if (var2 != 0) {
			int var3 = field341[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					SNMMFOLO.method433(0.9D);
				}

				if (var3 == 2) {
					SNMMFOLO.method433(0.8D);
				}

				if (var3 == 3) {
					SNMMFOLO.method433(0.7D);
				}

				if (var3 == 4) {
					SNMMFOLO.method433(0.6D);
				}

				YDSJAZFL.field1449.method232();
				field223 = true;
			}

			if (var2 == 3) {
				boolean var4 = field100;

				if (var3 == 0) {
					method106(field100, 0);
					field100 = true;
				}

				if (var3 == 1) {
					method106(field100, -400);
					field100 = true;
				}

				if (var3 == 2) {
					method106(field100, -800);
					field100 = true;
				}

				if (var3 == 3) {
					method106(field100, -1200);
					field100 = true;
				}

				if (var3 == 4) {
					field100 = false;
				}

				if (field100 != var4 && !field437) {
					if (field100) {
						field127 = field167;
						field128 = true;
						field171.method213(2, field127);
					} else {
						method33();
					}

					field252 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field411 = true;
					method40(0);
				}

				if (var3 == 1) {
					field411 = true;
					method40(-400);
				}

				if (var3 == 2) {
					field411 = true;
					method40(-800);
				}

				if (var3 == 3) {
					field411 = true;
					method40(-1200);
				}

				if (var3 == 4) {
					field411 = false;
				}
			}

			if (var2 == 5) {
				field81 = var3;
			}

			if (var2 == 6) {
				field278 = var3;
			}

			if (var2 == 8) {
				field325 = var3;
				field153 = true;
			}

			if (var2 == 9) {
				field451 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(LVCTXURSE;I)V")
	public final void method139(VCTXURSE arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field256.length; var3++) {
			field256[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field256[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field257[var9] = (field256[var9 - 1] + field256[var9 + 1] + field256[var9 - 128] + field256[var9 + 128]) / 4;
				}
			}

			int[] var10 = field256;
			field256 = field257;
			field257 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1315; var12++) {
				for (int var13 = 0; var13 < arg0.field1314; var13++) {
					if (arg0.field1312[var11++] != 0) {
						int var14 = var13 + arg0.field1316 + 16;
						int var15 = var12 + arg0.field1317 + 16;
						int var16 = (var15 << 7) + var14;
						field256[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method140(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.C(I)V")
	public final void method141() {
		if (field372 == 0 && field378 == 0) {
			field361[field401] = "Walk here";
			field476[field401] = 134;
			field474[field401] = field1184;
			field475[field401] = field1185;
			field401++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < KDWDYCIL.field826; var2++) {
			int var3 = KDWDYCIL.field827[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field450.method314(field211, var4, var5, var3) >= 0) {
					WEWSMZTU var8 = WEWSMZTU.method555(var7);
					if (var8.field1354 != null) {
						var8 = var8.method557();
					}

					if (var8 == null) {
						continue;
					}

					if (field372 == 1) {
						field361[field401] = "Use " + field376 + " with @cya@" + var8.field1382;
						field476[field401] = 413;
						field477[field401] = var3;
						field474[field401] = var4;
						field475[field401] = var5;
						field401++;
					} else if (field378 != 1) {
						if (var8.field1372 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1372[var9] != null) {
									field361[field401] = var8.field1372[var9] + " @cya@" + var8.field1382;

									if (var9 == 0) {
										field476[field401] = 286;
									}

									if (var9 == 1) {
										field476[field401] = 88;
									}

									if (var9 == 2) {
										field476[field401] = 377;
									}

									if (var9 == 3) {
										field476[field401] = 383;
									}

									if (var9 == 4) {
										field476[field401] = 1536;
									}

									field477[field401] = var3;
									field474[field401] = var4;
									field475[field401] = var5;
									field401++;
								}
							}
						}

						field361[field401] = "Examine @cya@" + var8.field1382;
						field476[field401] = 1273;
						field477[field401] = var8.field1353 << 14;
						field474[field401] = var4;
						field475[field401] = var5;
						field401++;
					} else if ((field380 & 0x4) == 4) {
						field361[field401] = field381 + " @cya@" + var8.field1382;
						field476[field401] = 382;
						field477[field401] = var3;
						field474[field401] = var4;
						field475[field401] = var5;
						field401++;
					}
				}

				if (var6 == 1) {
					GYKYBIID var10 = field113[var7];
					if (var10.field625.field1393 == 1 && (var10.field734 & 0x7F) == 0x40 && (var10.field735 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field114; var11++) {
							GYKYBIID var12 = field113[field115[var11]];
							if (var12 != null && var10 != var12 && var12.field625.field1393 == 1 && var10.field734 == var12.field734 && var10.field735 == var12.field735) {
								method131(field115[var11], var12.field625, var4, var5);
							}
						}

						for (int var13 = 0; var13 < field367; var13++) {
							DEHYKQII var14 = field366[field368[var13]];
							if (var14 != null && var10.field734 == var14.field734 && var10.field735 == var14.field735) {
								method31(var14, field368[var13], var4, var5);
							}
						}
					}

					method131(var7, var10.field625, var4, var5);
				}

				if (var6 == 0) {
					DEHYKQII var15 = field366[var7];
					if ((var15.field734 & 0x7F) == 0x40 && (var15.field735 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field114; var16++) {
							GYKYBIID var17 = field113[field115[var16]];
							if (var17 != null && var17.field625.field1393 == 1 && var15.field734 == var17.field734 && var15.field735 == var17.field735) {
								method131(field115[var16], var17.field625, var4, var5);
							}
						}

						for (int var18 = 0; var18 < field367; var18++) {
							DEHYKQII var19 = field366[field368[var18]];
							if (var19 != null && var15 != var19 && var15.field734 == var19.field734 && var15.field735 == var19.field735) {
								method31(var19, field368[var18], var4, var5);
							}
						}
					}

					method31(var15, var7, var4, var5);
				}

				if (var6 == 3) {
					CRZPTUPR var20 = field124[field211][var4][var5];
					if (var20 != null) {
						for (FIMDEAMY var21 = (FIMDEAMY) var20.method180(); var21 != null; var21 = (FIMDEAMY) var20.method182()) {
							YDSJAZFL var22 = YDSJAZFL.method575(var21.field624);
							if (field372 == 1) {
								field361[field401] = "Use " + field376 + " with @lre@" + var22.field1476;
								field476[field401] = 380;
								field477[field401] = var21.field624;
								field474[field401] = var4;
								field475[field401] = var5;
								field401++;
							} else if (field378 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1474 != null && var22.field1474[var23] != null) {
										field361[field401] = var22.field1474[var23] + " @lre@" + var22.field1476;

										if (var23 == 0) {
											field476[field401] = 409;
										}

										if (var23 == 1) {
											field476[field401] = 4;
										}

										if (var23 == 2) {
											field476[field401] = 856;
										}

										if (var23 == 3) {
											field476[field401] = 145;
										}

										if (var23 == 4) {
											field476[field401] = 756;
										}

										field477[field401] = var21.field624;
										field474[field401] = var4;
										field475[field401] = var5;
										field401++;
									} else if (var23 == 2) {
										field361[field401] = "Take @lre@" + var22.field1476;
										field476[field401] = 856;
										field477[field401] = var21.field624;
										field474[field401] = var4;
										field475[field401] = var5;
										field401++;
									}
								}

								field361[field401] = "Examine @lre@" + var22.field1476;
								field476[field401] = 1438;
								field477[field401] = var21.field624;
								field474[field401] = var4;
								field475[field401] = var5;
								field401++;
							} else if ((field380 & 0x1) == 1) {
								field361[field401] = field381 + " @lre@" + var22.field1476;
								field476[field401] = 545;
								field477[field401] = var21.field624;
								field474[field401] = var4;
								field475[field401] = var5;
								field401++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method142() {
		field466.method541();
		SNMMFOLO.field1218 = field402;
		field193.method539(0, 0);

		if (field447) {
			field150.method590(0, 239, field385, 40);
			field150.method590(128, 239, field473 + "*", 60);
		} else if (field384 == 1) {
			field150.method590(0, 239, "Enter amount:", 40);
			field150.method590(128, 239, field301 + "*", 60);
		} else if (field384 == 2) {
			field150.method590(0, 239, "Enter name:", 40);
			field150.method590(128, 239, field301 + "*", 60);
		} else if (field384 == 3) {
			if (field442 != field301) {
				method170(field301);
				field442 = field301;
			}

			ZGPIKWUW var1 = field149;
			MVOWZCMY.method342(0, 0, 463, 77);

			for (int var2 = 0; var2 < field443; var2++) {
				int var3 = var2 * 14 + 18 - field446;
				if (var3 > 0 && var3 < 110) {
					var1.method590(0, 239, field444[var2], var3);
				}
			}

			MVOWZCMY.method341();

			if (field443 > 5) {
				method85(0, 77, field443 * 14 + 7, 463, field446);
			}

			if (field301.length() == 0) {
				field150.method590(255, 239, "Enter object name", 40);
			} else if (field443 == 0) {
				field150.method590(0, 239, "No matching objects found, please shorten search", 40);
			}

			var1.method590(0, 239, field301 + "*", 90);
			MVOWZCMY.method348(0, 77, 0, 479);
		} else if (field283 != null) {
			field150.method590(0, 239, field283, 40);
			field150.method590(128, 239, "Click to continue", 60);
		} else if (field98 != -1) {
			method89(0, 0, 0, OMJBPTVL.method359(field98));
		} else if (field512 == -1) {
			ZGPIKWUW var4 = field149;
			int var5 = 0;
			MVOWZCMY.method342(0, 0, 463, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field349[var6] != null) {
					int var7 = field347[var6];
					int var8 = field106 + 70 - var5 * 14;
					String var9 = field348[var6];
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
							var4.method594(var8, 0, field349[var6], 4);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field300 == 0 || field300 == 1 && method65(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field147[0].method539(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field147[1].method539(var11, var8 - 12);
								var11 += 14;
							}

							var4.method594(var8, 0, var9 + ":", var11);
							var11 += var4.method592(var9) + 8;
							var4.method594(var8, 255, field349[var6], var11);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field325 == 0 && (var7 == 7 || field355 == 0 || field355 == 1 && method65(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method594(var8, 0, "From", var12);
							int var14 = var12 + var4.method592("From ");
							if (var10 == 1) {
								field147[0].method539(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field147[1].method539(var14, var8 - 12);
								var14 += 14;
							}

							var4.method594(var8, 0, var9 + ":", var14);
							var14 += var4.method592(var9) + 8;
							var4.method594(var8, 0x800000, field349[var6], var14);
						}

						var5++;
					}

					if (var7 == 4 && (field228 == 0 || field228 == 1 && method65(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method594(var8, 0x800080, var9 + " " + field349[var6], 4);
						}

						var5++;
					}

					if (var7 == 5 && field325 == 0 && field355 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method594(var8, 0x800000, field349[var6], 4);
						}

						var5++;
					}

					if (var7 == 6 && field325 == 0 && field355 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method594(var8, 0, "To " + var9 + ":", 4);
							var4.method594(var8, 0x800000, field349[var6], var4.method592("To " + var9) + 12);
						}

						var5++;
					}

					if (var7 == 8 && (field228 == 0 || field228 == 1 && method65(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method594(var8, 0x7E3200, var9 + " " + field349[var6], 4);
						}

						var5++;
					}
				}
			}

			MVOWZCMY.method341();
			field184 = var5 * 14 + 7;
			if (field184 < 78) {
				field184 = 78;
			}

			method85(0, 77, field184, 463, field184 - field106 - 77);
			String var13;
			if (field269 == null || field269.field541 == null) {
				var13 = PZGHUCRX.method409(field395);
			} else {
				var13 = field269.field541;
			}

			var4.method594(90, 0, var13 + ":", 4);
			var4.method594(90, 255, field101 + "*", var4.method592(var13 + ": ") + 6);
			MVOWZCMY.method348(0, 77, 0, 479);
		} else {
			method89(0, 0, 0, OMJBPTVL.method359(field512));
		}

		if (field260 && field452 == 2) {
			method72();
		}

		field466.method542(357, 17, field1176);
		field465.method541();
		SNMMFOLO.field1218 = field404;
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method143(int arg0) {
		OMJBPTVL var2 = OMJBPTVL.method359(arg0);
		for (int var3 = 0; var3 < var2.field1018.length && var2.field1018[var3] != -1; var3++) {
			OMJBPTVL var4 = OMJBPTVL.method359(var2.field1018[var3]);
			if (var4.field1008 == 1) {
				method143(var4.field1065);
			}

			var4.field1029 = 0;
			var4.field1021 = 0;
		}
	}

	@ObfuscatedName("client.a(BZ[B)V")
	public final void method144(boolean arg0, byte[] arg1) {
		if (field100) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1179 != null) {
				return new URL("http://127.0.0.1:" + (field435 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.E(I)V")
	public final void method145() {
		field463.method541();
		SNMMFOLO.field1218 = field403;
		field191.method539(0, 0);

		if (field120 != -1) {
			method89(0, 0, 0, OMJBPTVL.method359(field120));
		} else if (field502[field356] != -1) {
			method89(0, 0, 0, OMJBPTVL.method359(field502[field356]));
		}

		if (field260 && field452 == 1) {
			method72();
		}

		field463.method542(205, 553, field1176);
		field465.method541();
		SNMMFOLO.field1218 = field404;
	}

	@ObfuscatedName("client.o(B)V")
	public final void method146() {
		field273++;
		if (field273 > 114) {
			field273 = 0;
			field83.method457(239);
			field83.method461(0xE57DAC);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method418();
					if (var1 == -1) {
						return;
					}

					if (field88 != -1 && field88 == field360) {
						break;
					}

					if (field447) {
						if (var1 >= 32 && var1 <= 122 && field473.length() < 80) {
							field473 = field473 + (char) var1;
							field153 = true;
						}

						if (var1 == 8 && field473.length() > 0) {
							field473 = field473.substring(0, field473.length() - 1);
							field153 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field447 = false;
							field153 = true;

							if (field358 == 1) {
								long var2 = PZGHUCRX.method405(field473);
								method160(var2);
							}

							if (field358 == 2 && field500 > 0) {
								long var4 = PZGHUCRX.method405(field473);
								method92(var4);
							}

							if (field358 == 3 && field473.length() > 0) {
								field83.method457(135);
								field83.method458(0);
								int var6 = field83.field1263;
								field83.method464(field157);
								BXSNHAGP.method27(field473, field83);
								field83.method467(field83.field1263 - var6);
								field473 = BXSNHAGP.method28(field473);
								field473 = OWMPGCSS.method377(field473);
								method133(PZGHUCRX.method409(PZGHUCRX.method406(field157)), field473, 6);

								if (field355 == 2) {
									field355 = 1;
									field333 = true;
									field83.method457(232);
									field83.method458(field300);
									field83.method458(field355);
									field83.method458(field228);
								}
							}

							if (field358 == 4 && field146 < 100) {
								long var7 = PZGHUCRX.method405(field473);
								method55(var7);
							}

							if (field358 == 5 && field146 > 0) {
								long var9 = PZGHUCRX.method405(field473);
								method115(var9);
							}
						}
					} else if (field384 == 1) {
						if (var1 >= 48 && var1 <= 57 && field301.length() < 10) {
							field301 = field301 + (char) var1;
							field153 = true;
						}

						if (var1 == 8 && field301.length() > 0) {
							field301 = field301.substring(0, field301.length() - 1);
							field153 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field301.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field301);
								} catch (Exception var21) {
								}

								field83.method457(151);
								field83.method462(var11);
							}

							field384 = 0;
							field153 = true;
						}
					} else if (field384 == 2) {
						if (var1 >= 32 && var1 <= 122 && field301.length() < 12) {
							field301 = field301 + (char) var1;
							field153 = true;
						}

						if (var1 == 8 && field301.length() > 0) {
							field301 = field301.substring(0, field301.length() - 1);
							field153 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field301.length() > 0) {
								field83.method457(158);
								field83.method464(PZGHUCRX.method405(field301));
							}

							field384 = 0;
							field153 = true;
						}
					} else if (field384 == 3) {
						if (var1 >= 32 && var1 <= 122 && field301.length() < 40) {
							field301 = field301 + (char) var1;
							field153 = true;
						}

						if (var1 == 8 && field301.length() > 0) {
							field301 = field301.substring(0, field301.length() - 1);
							field153 = true;
						}
					} else if (field98 == -1 && field326 == -1) {
						if (var1 >= 32 && var1 <= 122 && field101.length() < 80) {
							field101 = field101 + (char) var1;
							field153 = true;
						}

						if (var1 == 8 && field101.length() > 0) {
							field101 = field101.substring(0, field101.length() - 1);
							field153 = true;
						}

						if ((var1 == 13 || var1 == 10) && field101.length() > 0) {
							if (field270 == 2) {
								if (field101.equals("::clientdrop")) {
									method60();
								}

								if (field101.equals("::lag")) {
									method166();
								}

								if (field101.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field171.method206(2); var12++) {
										field171.method211((byte) 1, var12, 2);
									}
								}

								if (field101.equals("::fpson")) {
									field212 = true;
								}

								if (field101.equals("::fpsoff")) {
									field212 = false;
								}

								if (field101.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field472[var13].field1280[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field101.startsWith("::")) {
								field83.method457(124);
								field83.method458(field101.length() - 1);
								field83.method465(field101.substring(2));
							} else {
								String var16 = field101.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field101 = field101.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field101 = field101.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field101 = field101.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field101 = field101.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field101 = field101.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field101 = field101.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field101 = field101.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field101 = field101.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field101 = field101.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field101 = field101.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field101 = field101.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field101 = field101.substring(6);
								}

								String var18 = field101.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field101 = field101.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field101 = field101.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field101 = field101.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field101 = field101.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field101 = field101.substring(6);
								}

								field83.method457(75);
								field83.method458(0);
								int var20 = field83.field1263;
								field83.method486(var17);
								field83.method485(var19);
								field112.field1263 = 0;
								BXSNHAGP.method27(field101, field112);
								field83.method505(field112.field1262, 0, field112.field1263);
								field83.method467(field83.field1263 - var20);
								field101 = BXSNHAGP.method28(field101);
								field101 = OWMPGCSS.method377(field101);
								field269.field707 = field101;
								field269.field733 = var17;
								field269.field712 = var19;
								field269.field683 = 150;

								if (field270 == 2) {
									method133("@cr2@" + field269.field541, field269.field707, 2);
								} else if (field270 == 1) {
									method133("@cr1@" + field269.field541, field269.field707, 2);
								} else {
									method133(field269.field541, field269.field707, 2);
								}

								if (field300 == 2) {
									field300 = 3;
									field333 = true;
									field83.method457(232);
									field83.method458(field300);
									field83.method458(field355);
									field83.method458(field228);
								}
							}

							field101 = "";
							field153 = true;
						}
					}
				}

				if (var1 == 8 && field327.length() > 0) {
					field327 = field327.substring(0, field327.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field327.length() < 12) {
				field327 = field327 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method147() {
		if (field437 && field82 == 2 && AGPNOIRK.field5 != field211) {
			method54("Loading - please wait.", null);
			field82 = 1;
			field237 = System.currentTimeMillis();
		}

		if (field82 == 1) {
			int var1 = method148();
			if (var1 != 0 && System.currentTimeMillis() - field237 > 360000L) {
				signlink.reporterror(field395 + " glcfb " + field304 + "," + var1 + "," + field437 + "," + field413[0] + "," + field171.method210() + "," + field211 + "," + field103 + "," + field104);
				field237 = System.currentTimeMillis();
			}
		}

		if (field82 == 2 && field427 != field211) {
			field427 = field211;
			method129(field211);
		}
	}

	@ObfuscatedName("client.G(I)I")
	public final int method148() {
		for (int var1 = 0; var1 < field498.length; var1++) {
			if (field498[var1] == null && field220[var1] != -1) {
				return -1;
			}

			if (field152[var1] == null && field221[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field498.length; var3++) {
			byte[] var4 = field152[var3];
			if (var4 != null) {
				int var5 = (field219[var3] >> 8) * 64 - field418;
				int var6 = (field219[var3] & 0xFF) * 64 - field419;
				if (field97) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= AGPNOIRK.method15(var5, var6, var4);
			}
		}

		if (!var2) {
			return -3;
		} else if (field154) {
			return -4;
		} else {
			field82 = 2;
			AGPNOIRK.field5 = field211;
			method152();
			field83.method457(103);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IIBIIIIIII)V")
	public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		KOXMDHST var10 = null;
		for (KOXMDHST var11 = (KOXMDHST) field346.method179(); var11 != null; var11 = (KOXMDHST) field346.method181()) {
			if (var11.field851 == arg6 && var11.field853 == arg2 && var11.field854 == arg8 && var11.field852 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new KOXMDHST();
			var10.field851 = arg6;
			var10.field852 = arg3;
			var10.field853 = arg2;
			var10.field854 = arg8;
			method91(var10);
			field346.method176(var10);
		}

		var10.field844 = arg0;
		var10.field846 = arg7;
		var10.field845 = arg5;
		var10.field855 = arg1;
		var10.field847 = arg4;
	}

	@ObfuscatedName("client.H(I)I")
	public final int method150() {
		int var1 = 3;
		if (field331 < 310) {
			int var2 = field328 >> 7;
			int var3 = field330 >> 7;
			int var4 = field269.field734 >> 7;
			int var5 = field269.field735 >> 7;

			if ((field312[field211][var2][var3] & 0x4) != 0) {
				var1 = field211;
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

					if ((field312[field211][var2][var3] & 0x4) != 0) {
						var1 = field211;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field312[field211][var2][var3] & 0x4) != 0) {
							var1 = field211;
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

					if ((field312[field211][var2][var3] & 0x4) != 0) {
						var1 = field211;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field312[field211][var2][var3] & 0x4) != 0) {
							var1 = field211;
						}
					}
				}
			}
		}

		if ((field312[field211][field269.field734 >> 7][field269.field735 >> 7] & 0x4) != 0) {
			var1 = field211;
		}

		return var1;
	}

	@ObfuscatedName("client.p(B)I")
	public final int method151() {
		int var1 = method109(field330, field328, field211);
		if (var1 - field329 < 800 && (field312[field211][field328 >> 7][field330 >> 7] & 0x4) != 0) {
			return field211;
		}

		return 3;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method152() {
		try {
			field427 = -1;
			field208.method183();
			field525.method183();
			SNMMFOLO.method427();
			method42();
			field450.method284();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field472[var1].method515();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field312[var2][var3][var4] = 0;
					}
				}
			}

			AGPNOIRK var5 = new AGPNOIRK(field312, 104, field246, 104);
			int var6 = field498.length;
			field83.method457(235);

			if (!field97) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field219[var7] >> 8) * 64 - field418;
					int var9 = (field219[var7] & 0xFF) * 64 - field419;
					byte[] var10 = field498[var7];
					if (var10 != null) {
						var5.method23(var8, field472, (field103 - 6) * 8, var10, (field104 - 6) * 8, var9);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field219[var11] >> 8) * 64 - field418;
					int var13 = (field219[var11] & 0xFF) * 64 - field419;
					byte[] var14 = field498[var11];
					if (var14 == null && field104 < 800) {
						var5.method8(64, 64, var12, var13);
					}
				}

				field83.method457(235);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field152[var15];
					if (var16 != null) {
						int var17 = (field219[var15] >> 8) * 64 - field418;
						int var18 = (field219[var15] & 0xFF) * 64 - field419;
						var5.method21(var17, field450, field472, var18, var16);
					}
				}
			}

			if (field97) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field218[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field219.length; var29++) {
									if (field219[var29] == var28 && field498[var29] != null) {
										var5.method19(field498[var29], var21 * 8, (var27 & 0x7) * 8, var19, var20 * 8, var24, (var26 & 0x7) * 8, field472, var25);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method4(var20 * 8, var19, var21 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field218[0][var30][var31];
						if (var32 == -1) {
							var5.method8(8, 8, var30 * 8, var31 * 8);
						}
					}
				}

				field83.method457(235);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field218[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field219.length; var42++) {
									if (field219[var42] == var41 && field152[var42] != null) {
										var5.method13(var38, var33, var34 * 8, field152[var42], (var40 & 0x7) * 8, var37, field450, var35 * 8, field472, (var39 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field83.method457(235);
			var5.method9(field450, field472);

			if (field465 != null) {
				field465.method541();
				SNMMFOLO.field1218 = field404;
			}

			field83.method457(235);
			int var43 = AGPNOIRK.field1;
			if (var43 > field211) {
				var43 = field211;
			}

			if (var43 < field211 - 1) {
				int var44 = field211 - 1;
			}

			if (field437) {
				field450.method285(AGPNOIRK.field1);
			} else {
				field450.method285(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method98(var45, var46);
				}
			}

			field209++;
			if (field209 > 85) {
				field209 = 0;
				field83.method457(253);
			}

			method87();
		} catch (Exception var59) {
		}

		WEWSMZTU.field1380.method232();

		if (field1179 != null) {
			field83.method457(85);
			field83.method462(1057001181);
		}

		if (field437 && signlink.cache_dat != null) {
			int var48 = field171.method206(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field171.method220(var49);
				if ((var50 & 0x79) == 0) {
					KDWDYCIL.method245(var49);
				}
			}
		}

		System.gc();
		SNMMFOLO.method428(20);
		field171.method200();
		int var51 = (field103 - 6) / 8 - 1;
		int var52 = (field103 + 6) / 8 + 1;
		int var53 = (field104 - 6) / 8 - 1;
		int var54 = (field104 + 6) / 8 + 1;
		if (field236) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field171.method207(var56, var55, 0);
					if (var57 != -1) {
						field171.method203(var57, 3);
					}

					int var58 = field171.method207(var56, var55, 1);
					if (var58 != -1) {
						field171.method203(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method153() {
		if (field401 >= 2 || field372 != 0 || field378 != 0) {
			String var1;
			if (field372 == 1 && field401 < 2) {
				var1 = "Use " + field376 + " with...";
			} else if (field378 == 1 && field401 < 2) {
				var1 = field381 + "...";
			} else {
				var1 = field361[field401 - 1];
			}

			if (field401 > 2) {
				var1 = var1 + "@whi@ / " + (field401 - 2) + " more options";
			}

			field150.method599(field258 / 1000, var1, 4, true, 15, 0xFFFFFF);
		}
	}

	@ObfuscatedName("client.a(LJFHWDRLM;IZ)V")
	public final void method154(JFHWDRLM arg0, int arg1) {
		method155(arg0.field735, arg0.field734, arg1);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method155(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method109(arg0, arg1, field211) - arg2;
			arg1 -= field328;
			var4 -= field329;
			arg0 -= field330;
			int var5 = KDWDYCIL.field828[field331];
			int var6 = KDWDYCIL.field829[field331];
			int var7 = KDWDYCIL.field828[field332];
			int var8 = KDWDYCIL.field829[field332];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field116 = (var9 << 9) / arg0 + SNMMFOLO.field1212;
				field117 = (var11 << 9) / arg0 + SNMMFOLO.field1213;
			} else {
				field116 = -1;
				field117 = -1;
			}
		} else {
			field116 = -1;
			field117 = -1;
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method156() {
		if (field180 == 2) {
			method155((field388 - field419 << 7) + field391, (field387 - field418 << 7) + field390, field389 * 2);

			if (field116 > -1 && field258 % 20 < 10) {
				field105[0].method448(field116 - 12, field117 - 28);
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method157() {
		if (field337 == 0) {
			field361[0] = "Cancel";
			field476[0] = 1423;
			field401 = 1;
			if (field326 == -1) {
				method136();
				field359 = 0;
				field488 = 0;

				if (field1184 > 4 && field1185 > 4 && field1184 < 516 && field1185 < 338) {
					if (field88 == -1) {
						method141();
					} else {
						method64(4, 4, field1184, 0, OMJBPTVL.method359(field88), 0, field1185);
					}
				}

				if (field489 != field359) {
					field489 = field359;
				}

				if (field488 != field342) {
					field342 = field488;
				}

				field359 = 0;
				field488 = 0;

				if (field1184 > 553 && field1185 > 205 && field1184 < 743 && field1185 < 466) {
					if (field120 != -1) {
						method64(553, 205, field1184, 0, OMJBPTVL.method359(field120), 1, field1185);
					} else if (field502[field356] != -1) {
						method64(553, 205, field1184, 0, OMJBPTVL.method359(field502[field356]), 1, field1185);
					}
				}

				if (field359 != field129) {
					field255 = true;
					field129 = field359;
				}

				if (field488 != field438) {
					field255 = true;
					field438 = field488;
				}

				field359 = 0;
				field488 = 0;

				if (field1184 > 17 && field1185 > 357 && field1184 < 496 && field1185 < 453) {
					if (field98 != -1) {
						method64(17, 357, field1184, 0, OMJBPTVL.method359(field98), 2, field1185);
					} else if (field512 != -1) {
						method64(17, 357, field1184, 0, OMJBPTVL.method359(field512), 3, field1185);
					} else if (field1185 < 434 && field1184 < 426 && field384 == 0) {
						method70(field1184 - 17, field1185 - 357);
					}
				}

				if ((field98 != -1 || field512 != -1) && field480 != field359) {
					field153 = true;
					field480 = field359;
				}

				if ((field98 != -1 || field512 != -1) && field488 != field238) {
					field153 = true;
					field238 = field488;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field401 - 1; var2++) {
						if (field476[var2] < 1000 && field476[var2 + 1] > 1000) {
							String var3 = field361[var2];
							field361[var2] = field361[var2 + 1];
							field361[var2 + 1] = var3;
							int var4 = field476[var2];
							field476[var2] = field476[var2 + 1];
							field476[var2 + 1] = var4;
							int var5 = field474[var2];
							field474[var2] = field474[var2 + 1];
							field474[var2 + 1] = var5;
							int var6 = field475[var2];
							field475[var2] = field475[var2 + 1];
							field475[var2 + 1] = var6;
							int var7 = field477[var2];
							field477[var2] = field477[var2 + 1];
							field477[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field359 = 0;
				field488 = 0;
				method64(0, 0, field1184, 0, OMJBPTVL.method359(field326), 0, field1185);

				if (field489 != field359) {
					field489 = field359;
				}

				if (field488 != field342) {
					field342 = field488;
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method158() {
		method61(20, "Starting up");

		if (signlink.sunjava) {
			field1170 = 5;
		}

		if (field357) {
			field392 = true;
		} else {
			field357 = true;
			boolean var1 = false;
			String var2 = method101();
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
						field413[var3] = new UEKAQTXH(signlink.cache_idx[var3], 500000, var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method32();
					field382 = method130(1, field343[1], "title", 25, "title screen");
					field148 = new ZGPIKWUW(field382, "p11_full", false);
					field149 = new ZGPIKWUW(field382, "p12_full", false);
					field150 = new ZGPIKWUW(field382, "b12_full", false);
					field151 = new ZGPIKWUW(field382, "q8_full", true);
					method112();
					method95();
					SXKKBWPU var4 = method130(2, field343[2], "config", 30, "config");
					SXKKBWPU var5 = method130(3, field343[3], "interface", 35, "interface");
					SXKKBWPU var6 = method130(4, field343[4], "media", 40, "2d graphics");
					SXKKBWPU var7 = method130(6, field343[6], "textures", 45, "textures");
					SXKKBWPU var8 = method130(7, field343[7], "wordenc", 50, "chat system");
					SXKKBWPU var9 = method130(8, field343[8], "sounds", 55, "sound effects");
					field312 = new byte[4][104][104];
					field246 = new int[4][105][105];
					field450 = new MPMWDRAA(field246, 104, 4, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field472[var10] = new UDXVXGJJ(104, 104);
					}

					field310 = new TPUDHOHI(512, 512);
					SXKKBWPU var11 = method130(5, field343[5], "versionlist", 60, "update list");
					method61(60, "Connecting to update server");
					field171 = new HJOZCGZH();
					field171.method209(var11, this);
					SGSYCWFB.method419(field171.method208());
					KDWDYCIL.method243(field171.method206(0), field171);

					if (!field437) {
						field127 = 0;
						field128 = true;
						field171.method213(2, field127);

						while (field171.method210() > 0) {
							method39();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field171.field630 > 3) {
								method67("ondemand");
								return;
							}
						}
					}

					method61(65, "Requesting animations");
					int var12 = field171.method206(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field171.method213(1, var13);
					}

					while (field171.method210() > 0) {
						int var14 = var12 - field171.method210();
						if (var14 > 0) {
							method61(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method39();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field171.field630 > 3) {
							method67("ondemand");
							return;
						}
					}

					method61(70, "Requesting models");
					int var15 = field171.method206(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field171.method220(var16);
						if ((var17 & 0x1) != 0) {
							field171.method213(0, var16);
						}
					}

					int var18 = field171.method210();
					while (field171.method210() > 0) {
						int var19 = var18 - field171.method210();
						if (var19 > 0) {
							method61(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method39();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field413[0] != null) {
						method61(75, "Requesting maps");
						field171.method213(3, field171.method207(48, 47, 0));
						field171.method213(3, field171.method207(48, 47, 1));
						field171.method213(3, field171.method207(48, 48, 0));
						field171.method213(3, field171.method207(48, 48, 1));
						field171.method213(3, field171.method207(48, 49, 0));
						field171.method213(3, field171.method207(48, 49, 1));
						field171.method213(3, field171.method207(47, 47, 0));
						field171.method213(3, field171.method207(47, 47, 1));
						field171.method213(3, field171.method207(47, 48, 0));
						field171.method213(3, field171.method207(47, 48, 1));
						field171.method213(3, field171.method207(148, 48, 0));
						field171.method213(3, field171.method207(148, 48, 1));
						int var20 = field171.method210();
						while (field171.method210() > 0) {
							int var21 = var20 - field171.method210();
							if (var21 > 0) {
								method61(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method39();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field171.method206(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field171.method220(var23);
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
							field171.method211(var25, var23, 0);
						}
					}

					field171.method218(field436);

					if (!field437) {
						int var26 = field171.method206(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field171.method201(var27)) {
								field171.method211((byte) 1, var27, 2);
							}
						}
					}

					method61(80, "Unpacking media");
					field191 = new VCTXURSE(var6, "invback", 0);
					field193 = new VCTXURSE(var6, "chatback", 0);
					field192 = new VCTXURSE(var6, "mapback", 0);
					field321 = new VCTXURSE(var6, "backbase1", 0);
					field322 = new VCTXURSE(var6, "backbase2", 0);
					field323 = new VCTXURSE(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field503[var28] = new VCTXURSE(var6, "sideicons", var28);
					}

					field345 = new TPUDHOHI(var6, "compass", 0);
					field383 = new TPUDHOHI(var6, "mapedge", 0);
					field383.method445();

					for (int var29 = 0; var29 < 72; var29++) {
						field87[var29] = new VCTXURSE(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 70; var30++) {
						field521[var30] = new TPUDHOHI(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field449[var31] = new TPUDHOHI(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field234[var32] = new TPUDHOHI(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field315[var33] = new TPUDHOHI(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field105[var34] = new TPUDHOHI(var6, "headicons_hint", var34);
					}

					field448 = new TPUDHOHI(var6, "overlay_multiway", 0);
					field225 = new TPUDHOHI(var6, "mapmarker", 0);
					field226 = new TPUDHOHI(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field268[var35] = new TPUDHOHI(var6, "cross", var35);
					}

					field285 = new TPUDHOHI(var6, "mapdots", 0);
					field286 = new TPUDHOHI(var6, "mapdots", 1);
					field287 = new TPUDHOHI(var6, "mapdots", 2);
					field288 = new TPUDHOHI(var6, "mapdots", 3);
					field289 = new TPUDHOHI(var6, "mapdots", 4);
					field213 = new VCTXURSE(var6, "scrollbar", 0);
					field214 = new VCTXURSE(var6, "scrollbar", 1);
					field514 = new VCTXURSE(var6, "redstone1", 0);
					field515 = new VCTXURSE(var6, "redstone2", 0);
					field516 = new VCTXURSE(var6, "redstone3", 0);
					field517 = new VCTXURSE(var6, "redstone1", 0);
					field517.method536();
					field518 = new VCTXURSE(var6, "redstone2", 0);
					field518.method536();
					field467 = new VCTXURSE(var6, "redstone1", 0);
					field467.method537();
					field468 = new VCTXURSE(var6, "redstone2", 0);
					field468.method537();
					field469 = new VCTXURSE(var6, "redstone3", 0);
					field469.method537();
					field470 = new VCTXURSE(var6, "redstone1", 0);
					field470.method536();
					field470.method537();
					field471 = new VCTXURSE(var6, "redstone2", 0);
					field471.method536();
					field471.method537();

					for (int var36 = 0; var36 < 2; var36++) {
						field147[var36] = new VCTXURSE(var6, "mod_icons", var36);
					}

					TPUDHOHI var37 = new TPUDHOHI(var6, "backleft1", 0);
					field291 = new VFZXUVTW(var37.field1257, var37.field1256, method167());
					var37.method446(0, 0);
					TPUDHOHI var38 = new TPUDHOHI(var6, "backleft2", 0);
					field292 = new VFZXUVTW(var38.field1257, var38.field1256, method167());
					var38.method446(0, 0);
					TPUDHOHI var39 = new TPUDHOHI(var6, "backright1", 0);
					field293 = new VFZXUVTW(var39.field1257, var39.field1256, method167());
					var39.method446(0, 0);
					TPUDHOHI var40 = new TPUDHOHI(var6, "backright2", 0);
					field294 = new VFZXUVTW(var40.field1257, var40.field1256, method167());
					var40.method446(0, 0);
					TPUDHOHI var41 = new TPUDHOHI(var6, "backtop1", 0);
					field295 = new VFZXUVTW(var41.field1257, var41.field1256, method167());
					var41.method446(0, 0);
					TPUDHOHI var42 = new TPUDHOHI(var6, "backvmid1", 0);
					field296 = new VFZXUVTW(var42.field1257, var42.field1256, method167());
					var42.method446(0, 0);
					TPUDHOHI var43 = new TPUDHOHI(var6, "backvmid2", 0);
					field297 = new VFZXUVTW(var43.field1257, var43.field1256, method167());
					var43.method446(0, 0);
					TPUDHOHI var44 = new TPUDHOHI(var6, "backvmid3", 0);
					field298 = new VFZXUVTW(var44.field1257, var44.field1256, method167());
					var44.method446(0, 0);
					TPUDHOHI var45 = new TPUDHOHI(var6, "backhmid2", 0);
					field299 = new VFZXUVTW(var45.field1257, var45.field1256, method167());
					var45.method446(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field521[var50] != null) {
							field521[var50].method444(var47 + var49, var48 + var49, var46 + var49);
						}

						if (field87[var50] != null) {
							field87[var50].method538(var47 + var49, var48 + var49, var46 + var49);
						}
					}

					method61(83, "Unpacking textures");
					SNMMFOLO.method429(var7);
					SNMMFOLO.method433(0.8D);
					SNMMFOLO.method428(20);
					method61(86, "Unpacking config");
					LMDSPIVT.method279(var4);
					WEWSMZTU.method559(var4);
					JZNGGVQB.method238(var4);
					YDSJAZFL.method574(var4);
					YANZSPIT.method565(var4);
					DOOZRHTX.method189(var4);
					QUXKFXEA.method411(var4);
					MUUMFTDK.method338(var4);
					ATLVWFDY.method24(var4);
					YDSJAZFL.field1442 = field436;

					if (!field437) {
						method61(90, "Unpacking sounds");
						byte[] var51 = var9.method442("sounds.dat", null);
						TQYMAXSO var52 = new TQYMAXSO(var51);
						WBMSJJDO.method544(var52);
					}

					method61(95, "Unpacking interfaces");
					ZGPIKWUW[] var53 = new ZGPIKWUW[] { field148, field149, field150, field151 };
					OMJBPTVL.method355(var6, var5, var53);
					method61(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field192.field1312[field192.field1314 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field354[var54] = var55;
						field399[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field192.field1312[field192.field1314 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field123[var58 - 5] = var59 - 25;
						field182[var58 - 5] = var60 - var59;
					}

					SNMMFOLO.method426(503, 765);
					field405 = SNMMFOLO.field1218;
					SNMMFOLO.method426(96, 479);
					field402 = SNMMFOLO.field1218;
					SNMMFOLO.method426(261, 190);
					field403 = SNMMFOLO.field1218;
					SNMMFOLO.method426(334, 512);
					field404 = SNMMFOLO.field1218;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = SNMMFOLO.field1216[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					MPMWDRAA.method320(800, 334, 512, 500, var62);
					OWMPGCSS.method367(var8);
					field397 = new XSRHTFUZ(this);
					method108(field397, 10);
					NTLPGIRW.field991 = this;
					WEWSMZTU.field1368 = this;
					YANZSPIT.field1428 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field86 + " " + field207);
					field440 = true;
				}
			} else {
				field205 = true;
			}
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method159(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.b(JZ)V")
	public final void method160(long arg0) {
		if (arg0 != 0L) {
			if (field500 >= 100 && field350 != 1) {
				method133("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field500 >= 200) {
				method133("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = PZGHUCRX.method409(PZGHUCRX.method406(arg0));
				for (int var4 = 0; var4 < field500; var4++) {
					if (field215[var4] == arg0) {
						method133("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field146; var5++) {
					if (field282[var5] == arg0) {
						method133("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field269.field541)) {
					field344[field500] = var3;
					field215[field500] = arg0;
					field118[field500] = 0;
					field500++;
					field255 = true;
					field83.method457(66);
					field83.method464(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.L(I)Ljava/net/Socket;")
	public final Socket method161(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.M(I)V")
	public final void method162() {
		if (field337 == 0) {
			int var1 = field1190;
			if (field378 == 1 && field1191 >= 516 && field1192 >= 160 && field1191 <= 765 && field1192 <= 205) {
				var1 = 0;
			}

			if (field260) {
				if (var1 != 1) {
					int var2 = field1184;
					int var3 = field1185;
					if (field452 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field452 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field452 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field453 - 10 || var2 > field455 + field453 + 10 || var3 < field454 - 10 || var3 > field456 + field454 + 10) {
						field260 = false;

						if (field452 == 1) {
							field255 = true;
						}

						if (field452 == 2) {
							field153 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field453;
					int var5 = field454;
					int var6 = field455;
					int var7 = field1191;
					int var8 = field1192;
					if (field452 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field452 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field452 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field401; var10++) {
						int var11 = (field401 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method163(var9);
					}

					field260 = false;

					if (field452 == 1) {
						field255 = true;
					}

					if (field452 == 2) {
						field153 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field401 > 0) {
					int var12 = field476[field401 - 1];
					if (var12 == 378 || var12 == 350 || var12 == 236 || var12 == 815 || var12 == 519 || var12 == 8 || var12 == 581 || var12 == 197 || var12 == 800 || var12 == 529 || var12 == 11 || var12 == 1107) {
						int var13 = field474[field401 - 1];
						int var14 = field475[field401 - 1];
						OMJBPTVL var15 = OMJBPTVL.method359(var14);
						if (var15.field1005 || var15.field1002) {
							field497 = false;
							field351 = 0;
							field335 = var14;
							field336 = var13;
							field337 = 2;
							field338 = field1191;
							field339 = field1192;

							if (OMJBPTVL.method359(var14).field1045 == field88) {
								field337 = 1;
							}

							if (OMJBPTVL.method359(var14).field1045 == field98) {
								field337 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field81 == 1 || method37(field401 - 1)) && field401 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field401 > 0) {
					method163(field401 - 1);
				}

				if (var1 != 2 || field401 <= 0) {
					return;
				}

				method164();
			}
		}
	}

	@ObfuscatedName("client.h(II)V")
	public final void method163(int arg0) {
		if (arg0 >= 0) {
			int var2 = field474[arg0];
			int var3 = field475[arg0];
			int var4 = field476[arg0];
			int var5 = field477[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field384 != 0 && var4 != 1423) {
				field384 = 0;
				field153 = true;
			}

			if (var4 == 1273) {
				int var6 = var5 >> 14 & 0x7FFF;
				WEWSMZTU var7 = WEWSMZTU.method555(var6);
				String var8;
				if (var7.field1364 == null) {
					var8 = "It's a " + var7.field1382 + ".";
				} else {
					var8 = new String(var7.field1364);
				}

				method133("", var8, 0);
			}

			if (var4 == 756) {
				boolean var9 = method73(0, 0, 2, false, 0, 0, field269.field732[0], var3, 0, var2, field269.field731[0]);
				if (!var9) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var3, 0, var2, field269.field731[0]);
				}

				field423 = field1191;
				field424 = field1192;
				field426 = 2;
				field425 = 0;
				field83.method457(92);
				field83.method493(field418 + var2);
				field83.method495(field419 + var3);
				field83.method459(var5);
			}

			if (var4 == 350) {
				field83.method457(145);
				field83.method493(var5);
				field83.method494(var2);
				field83.method459(var3);
				field507 = 0;
				field508 = var3;
				field509 = var2;
				field510 = 2;
				if (OMJBPTVL.method359(var3).field1045 == field88) {
					field510 = 1;
				}

				if (OMJBPTVL.method359(var3).field1045 == field98) {
					field510 = 3;
				}
			}

			if (var4 == 380) {
				boolean var11 = method73(0, 0, 2, false, 0, 0, field269.field732[0], var3, 0, var2, field269.field731[0]);
				if (!var11) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var3, 0, var2, field269.field731[0]);
				}

				field423 = field1191;
				field424 = field1192;
				field426 = 2;
				field425 = 0;
				field83.method457(43);
				field83.method493(field374);
				field83.method493(field375);
				field83.method493(field419 + var3);
				field83.method459(var5);
				field83.method494(field418 + var2);
				field83.method493(field373);
			}

			if (var4 == 963) {
				DEHYKQII var13 = field366[var5];
				if (var13 != null) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var13.field732[0], 0, var13.field731[0], field269.field731[0]);
					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field483++;
					if (field483 >= 54) {
						field83.method457(234);
						field83.method461(0xE09CD5);
						field483 = 0;
					}

					field83.method457(30);
					field83.method495(var5);
				}
			}

			if (var4 == 383) {
				method103(var2, var3, var5);
				field83.method457(20);
				field83.method494(var5 >> 14 & 0x7FFF);
				field83.method495(field419 + var3);
				field83.method495(field418 + var2);
			}

			if (var4 == 1827) {
				GYKYBIID var14 = field113[var5];
				if (var14 != null) {
					YANZSPIT var15 = var14.field625;
					if (var15.field1413 != null) {
						var15 = var15.method568();
					}

					if (var15 != null) {
						String var16;
						if (var15.field1420 == null) {
							var16 = "It's a " + var15.field1418 + ".";
						} else {
							var16 = new String(var15.field1420);
						}

						method133("", var16, 0);
					}
				}
			}

			if (var4 == 452) {
				DEHYKQII var17 = field366[var5];
				if (var17 != null) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var17.field732[0], 0, var17.field731[0], field269.field731[0]);
					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field83.method457(217);
					field83.method495(field379);
					field83.method459(var5);
				}
			}

			if (var4 == 753) {
				DEHYKQII var18 = field366[var5];
				if (var18 != null) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var18.field732[0], 0, var18.field731[0], field269.field731[0]);
					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field83.method457(38);
					field83.method494(var5);
				}
			}

			if (var4 == 34) {
				String var19 = field361[arg0];
				int var20 = var19.indexOf("@whi@");
				if (var20 != -1) {
					long var21 = PZGHUCRX.method405(var19.substring(var20 + 5).trim());
					int var23 = -1;
					for (int var24 = 0; var24 < field500; var24++) {
						if (field215[var24] == var21) {
							var23 = var24;
							break;
						}
					}

					if (var23 != -1 && field118[var23] > 0) {
						field153 = true;
						field384 = 0;
						field447 = true;
						field473 = "";
						field358 = 3;
						field157 = field215[var23];
						field385 = "Enter message to send to " + field344[var23];
					}
				}
			}

			if (var4 == 184) {
				GYKYBIID var25 = field113[var5];
				if (var25 != null) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var25.field732[0], 0, var25.field731[0], field269.field731[0]);
					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field83.method457(14);
					field83.method459(var5);
				}
			}

			if (var4 == 493) {
				DEHYKQII var26 = field366[var5];
				if (var26 != null) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var26.field732[0], 0, var26.field731[0], field269.field731[0]);
					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field83.method457(169);
					field83.method494(field375);
					field83.method494(field373);
					field83.method493(var5);
					field83.method459(field374);
				}
			}

			if (var4 == 8) {
				field83.method457(86);
				field83.method459(var2);
				field83.method493(var3);
				field83.method494(var5);
				field507 = 0;
				field508 = var3;
				field509 = var2;
				field510 = 2;
				if (OMJBPTVL.method359(var3).field1045 == field88) {
					field510 = 1;
				}

				if (OMJBPTVL.method359(var3).field1045 == field98) {
					field510 = 3;
				}
			}

			if (var4 == 666) {
				field83.method457(247);
				field83.method495(var3);
				field83.method493(var5);
				field83.method459(field379);
				field83.method495(var2);
				field507 = 0;
				field508 = var3;
				field509 = var2;
				field510 = 2;
				if (OMJBPTVL.method359(var3).field1045 == field88) {
					field510 = 1;
				}

				if (OMJBPTVL.method359(var3).field1045 == field98) {
					field510 = 3;
				}
			}

			if (var4 == 550) {
				String var27 = field361[arg0];
				int var28 = var27.indexOf("@whi@");
				if (var28 != -1) {
					if (field88 == -1) {
						method119();
						field327 = var27.substring(var28 + 5).trim();
						field267 = false;
						field360 = field88 = OMJBPTVL.field1041;
					} else {
						method133("", "Please close the interface you have open before using 'report abuse'", 0);
					}
				}
			}

			if (var4 == 424) {
				method80(field512);
				field512 = -1;
				field153 = true;
			}

			if (var4 == 772) {
				DEHYKQII var29 = field366[var5];
				if (var29 != null) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var29.field732[0], 0, var29.field731[0], field269.field731[0]);
					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field83.method457(166);
					field83.method459(var5);
				}
			}

			if (var4 == 145) {
				boolean var30 = method73(0, 0, 2, false, 0, 0, field269.field732[0], var3, 0, var2, field269.field731[0]);
				if (!var30) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var3, 0, var2, field269.field731[0]);
				}

				field423 = field1191;
				field424 = field1192;
				field426 = 2;
				field425 = 0;
				field83.method457(214);
				field83.method493(field418 + var2);
				field83.method459(field419 + var3);
				field83.method494(var5);
			}

			if (var4 == 236) {
				field513 += var5;
				if (field513 >= 64) {
					field83.method457(54);
					field83.method459(19877);
					field513 = 0;
				}

				field83.method457(193);
				field83.method495(var3);
				field83.method493(var2);
				field83.method495(var5);
				field507 = 0;
				field508 = var3;
				field509 = var2;
				field510 = 2;
				if (OMJBPTVL.method359(var3).field1045 == field88) {
					field510 = 1;
				}

				if (OMJBPTVL.method359(var3).field1045 == field98) {
					field510 = 3;
				}
			}

			if (var4 == 655 && !field439) {
				field83.method457(120);
				field83.method459(var3);
				field439 = true;
			}

			if (var4 == 49) {
				GYKYBIID var32 = field113[var5];
				if (var32 != null) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var32.field732[0], 0, var32.field731[0], field269.field731[0]);
					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field83.method457(21);
					field83.method459(var5);
				}
			}

			if (var4 == 519) {
				field83.method457(251);
				field83.method494(var5);
				field83.method493(var3);
				field83.method493(var2);
				field507 = 0;
				field508 = var3;
				field509 = var2;
				field510 = 2;
				if (OMJBPTVL.method359(var3).field1045 == field88) {
					field510 = 1;
				}

				if (OMJBPTVL.method359(var3).field1045 == field98) {
					field510 = 3;
				}
			}

			if (var4 == 378) {
				field422 += var3;
				if (field422 >= 131) {
					field83.method457(87);
					field83.method461(0x1BA89A);
					field422 = 0;
				}

				field83.method457(215);
				field83.method495(var5);
				field83.method459(var2);
				field83.method494(var3);
				field507 = 0;
				field508 = var3;
				field509 = var2;
				field510 = 2;
				if (OMJBPTVL.method359(var3).field1045 == field88) {
					field510 = 1;
				}

				if (OMJBPTVL.method359(var3).field1045 == field98) {
					field510 = 3;
				}
			}

			if (var4 == 409) {
				boolean var33 = method73(0, 0, 2, false, 0, 0, field269.field732[0], var3, 0, var2, field269.field731[0]);
				if (!var33) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var3, 0, var2, field269.field731[0]);
				}

				field423 = field1191;
				field424 = field1192;
				field426 = 2;
				field425 = 0;
				field83.method457(197);
				field83.method495(field418 + var2);
				field83.method494(var5);
				field83.method494(field419 + var3);
			}

			if (var4 == 451) {
				OMJBPTVL var35 = OMJBPTVL.method359(var3);
				boolean var36 = true;
				if (var35.field1054 > 0) {
					var36 = method66(var35);
				}

				if (var36) {
					field83.method457(210);
					field83.method459(var3);
				}
			}

			if (var4 == 815) {
				field83.method457(178);
				field83.method495(var3);
				field83.method459(var2);
				field83.method494(var5);
				field507 = 0;
				field508 = var3;
				field509 = var2;
				field510 = 2;
				if (OMJBPTVL.method359(var3).field1045 == field88) {
					field510 = 1;
				}

				if (OMJBPTVL.method359(var3).field1045 == field98) {
					field510 = 3;
				}
			}

			if (var4 == 80) {
				GYKYBIID var37 = field113[var5];
				if (var37 != null) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var37.field732[0], 0, var37.field731[0], field269.field731[0]);
					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field111++;
					if (field111 >= 79) {
						field83.method457(224);
						field83.method459(41106);
						field111 = 0;
					}

					field83.method457(136);
					field83.method459(var5);
				}
			}

			if (var4 == 1107) {
				YDSJAZFL var38 = YDSJAZFL.method575(var5);
				OMJBPTVL var39 = OMJBPTVL.method359(var3);
				String var40;
				if (var39 != null && var39.field1071[var2] >= 100000) {
					var40 = var39.field1071[var2] + " x " + var38.field1476;
				} else if (var38.field1432 == null) {
					var40 = "It's a " + var38.field1476 + ".";
				} else {
					var40 = new String(var38.field1432);
				}

				method133("", var40, 0);
			}

			if (var4 == 618) {
				method119();
			}

			if (var4 == 413 && method103(var2, var3, var5)) {
				field83.method457(220);
				field83.method495(field375);
				field83.method495(field419 + var3);
				field83.method459(field418 + var2);
				field83.method459(field373);
				field83.method494(var5 >> 14 & 0x7FFF);
				field83.method493(field374);
			}

			if (var4 == 365 || var4 == 355) {
				String var41 = field361[arg0];
				int var42 = var41.indexOf("@whi@");
				if (var42 != -1) {
					var41 = var41.substring(var42 + 5).trim();
					String var43 = PZGHUCRX.method409(PZGHUCRX.method406(PZGHUCRX.method405(var41)));
					boolean var44 = false;
					for (int var45 = 0; var45 < field367; var45++) {
						DEHYKQII var46 = field366[field368[var45]];
						if (var46 != null && var46.field541 != null && var46.field541.equalsIgnoreCase(var43)) {
							method73(1, 0, 2, false, 0, 1, field269.field732[0], var46.field732[0], 0, var46.field731[0], field269.field731[0]);

							if (var4 == 365) {
								field83.method457(166);
								field83.method459(field368[var45]);
							}

							if (var4 == 355) {
								field83.method457(38);
								field83.method494(field368[var45]);
							}

							var44 = true;
							break;
						}
					}

					if (!var44) {
						method133("", "Unable to find " + var43, 0);
					}
				}
			}

			if (var4 == 545) {
				boolean var47 = method73(0, 0, 2, false, 0, 0, field269.field732[0], var3, 0, var2, field269.field731[0]);
				if (!var47) {
					method73(1, 0, 2, false, 0, 1, field269.field732[0], var3, 0, var2, field269.field731[0]);
				}

				field423 = field1191;
				field424 = field1192;
				field426 = 2;
				field425 = 0;
				field83.method457(96);
				field83.method493(field418 + var2);
				field83.method459(var5);
				field83.method459(field379);
				field83.method494(field419 + var3);
			}

			if (var4 == 377) {
				method103(var2, var3, var5);
				field83.method457(162);
				field83.method495(field419 + var3);
				field83.method494(field418 + var2);
				field83.method459(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 11) {
				field372 = 1;
				field373 = var2;
				field374 = var3;
				field375 = var5;
				field376 = String.valueOf(YDSJAZFL.method575(var5).field1476);
				field378 = 0;
				field255 = true;
			} else {
				if (var4 == 382 && method103(var2, var3, var5)) {
					field83.method457(154);
					field83.method494(var5 >> 14 & 0x7FFF);
					field83.method459(field418 + var2);
					field83.method459(field379);
					field83.method493(field419 + var3);
				}

				if (var4 == 719) {
					GYKYBIID var49 = field113[var5];
					if (var49 != null) {
						method73(1, 0, 2, false, 0, 1, field269.field732[0], var49.field732[0], 0, var49.field731[0], field269.field731[0]);
						field423 = field1191;
						field424 = field1192;
						field426 = 2;
						field425 = 0;
						field83.method457(183);
						field83.method493(field379);
						field83.method495(var5);
					}
				}

				if (var4 == 737) {
					field83.method457(210);
					field83.method459(var3);
					OMJBPTVL var50 = OMJBPTVL.method359(var3);
					if (var50.field1019 != null && var50.field1019[0][0] == 5) {
						int var51 = var50.field1019[0][1];
						if (field341[var51] != var50.field1055[0]) {
							field341[var51] = var50.field1055[0];
							method138(var51);
							field255 = true;
						}
					}
				}

				if (var4 == 646 || var4 == 955 || var4 == 978 || var4 == 366) {
					String var52 = field361[arg0];
					int var53 = var52.indexOf("@whi@");
					if (var53 != -1) {
						long var54 = PZGHUCRX.method405(var52.substring(var53 + 5).trim());
						if (var4 == 646) {
							method160(var54);
						}

						if (var4 == 955) {
							method55(var54);
						}

						if (var4 == 978) {
							method92(var54);
						}

						if (var4 == 366) {
							method115(var54);
						}
					}
				}

				if (var4 == 134) {
					if (field260) {
						field450.method322(var2 - 4, var3 - 4);
					} else {
						field450.method322(field1191 - 4, field1192 - 4);
					}
				}

				if (var4 == 581) {
					field83.method457(173);
					field83.method494(var5);
					field83.method493(var3);
					field83.method493(var2);
					field507 = 0;
					field508 = var3;
					field509 = var2;
					field510 = 2;
					if (OMJBPTVL.method359(var3).field1045 == field88) {
						field510 = 1;
					}

					if (OMJBPTVL.method359(var3).field1045 == field98) {
						field510 = 3;
					}
				}

				if (var4 == 113) {
					GYKYBIID var56 = field113[var5];
					if (var56 != null) {
						method73(1, 0, 2, false, 0, 1, field269.field732[0], var56.field732[0], 0, var56.field731[0], field269.field731[0]);
						field423 = field1191;
						field424 = field1192;
						field426 = 2;
						field425 = 0;
						field363 += var5;
						if (field363 >= 105) {
							field83.method457(51);
							field83.method458(125);
							field363 = 0;
						}

						field83.method457(246);
						field83.method494(var5);
					}
				}

				if (var4 == 148) {
					DEHYKQII var57 = field366[var5];
					if (var57 != null) {
						method73(1, 0, 2, false, 0, 1, field269.field732[0], var57.field732[0], 0, var57.field731[0], field269.field731[0]);
						field423 = field1191;
						field424 = field1192;
						field426 = 2;
						field425 = 0;
						field83.method457(168);
						field83.method494(var5);
					}
				}

				if (var4 == 800) {
					field311 += var3;
					if (field311 >= 136) {
						field83.method457(191);
						field83.method459(46982);
						field311 = 0;
					}

					field83.method457(44);
					field83.method494(var2);
					field83.method493(var3);
					field83.method494(var5);
					field507 = 0;
					field508 = var3;
					field509 = var2;
					field510 = 2;
					if (OMJBPTVL.method359(var3).field1045 == field88) {
						field510 = 1;
					}

					if (OMJBPTVL.method359(var3).field1045 == field98) {
						field510 = 3;
					}
				}

				if (var4 == 4) {
					boolean var58 = method73(0, 0, 2, false, 0, 0, field269.field732[0], var3, 0, var2, field269.field731[0]);
					if (!var58) {
						method73(1, 0, 2, false, 0, 1, field269.field732[0], var3, 0, var2, field269.field731[0]);
					}

					field423 = field1191;
					field424 = field1192;
					field426 = 2;
					field425 = 0;
					field83.method457(213);
					field83.method459(field418 + var2);
					field83.method495(field419 + var3);
					field83.method495(var5);
				}

				if (var4 == 1536) {
					method103(var2, var3, var5);
					field83.method457(78);
					field83.method493(field418 + var2);
					field83.method495(field419 + var3);
					field83.method494(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 940) {
					field83.method457(137);
					field83.method495(field374);
					field83.method493(field375);
					field83.method493(var2);
					field83.method459(var3);
					field83.method459(field373);
					field83.method494(var5);
					field507 = 0;
					field508 = var3;
					field509 = var2;
					field510 = 2;
					if (OMJBPTVL.method359(var3).field1045 == field88) {
						field510 = 1;
					}

					if (OMJBPTVL.method359(var3).field1045 == field98) {
						field510 = 3;
					}
				}

				if (var4 == 88) {
					field334 += var3;
					if (field334 >= 84) {
						field83.method457(7);
						field83.method459(20732);
						field334 = 0;
					}

					method103(var2, var3, var5);
					field83.method457(37);
					field83.method495(field419 + var3);
					field83.method494(var5 >> 14 & 0x7FFF);
					field83.method494(field418 + var2);
				}

				if (var4 == 746) {
					OMJBPTVL var60 = OMJBPTVL.method359(var3);
					field378 = 1;
					field379 = var3;
					field380 = var60.field1073;
					field372 = 0;
					field255 = true;
					String var61 = var60.field1031;
					if (var61.indexOf(" ") != -1) {
						var61 = var61.substring(0, var61.indexOf(" "));
					}

					String var62 = var60.field1031;
					if (var62.indexOf(" ") != -1) {
						var62 = var62.substring(var62.indexOf(" ") + 1);
					}

					field381 = var61 + " " + var60.field1048 + " " + var62;

					if (field380 == 16) {
						field255 = true;
						field356 = 3;
						field398 = true;
					}
				} else {
					if (var4 == 226) {
						field83.method457(210);
						field83.method459(var3);
						OMJBPTVL var63 = OMJBPTVL.method359(var3);
						if (var63.field1019 != null && var63.field1019[0][0] == 5) {
							int var64 = var63.field1019[0][1];
							field341[var64] = 1 - field341[var64];
							method138(var64);
							field255 = true;
						}
					}

					if (var4 == 776) {
						GYKYBIID var65 = field113[var5];
						if (var65 != null) {
							method73(1, 0, 2, false, 0, 1, field269.field732[0], var65.field732[0], 0, var65.field731[0], field269.field731[0]);
							field423 = field1191;
							field424 = field1192;
							field426 = 2;
							field425 = 0;
							field83.method457(111);
							field83.method493(var5);
							field83.method495(field375);
							field83.method494(field374);
							field83.method495(field373);
						}
					}

					if (var4 == 914) {
						DEHYKQII var66 = field366[var5];
						if (var66 != null) {
							method73(1, 0, 2, false, 0, 1, field269.field732[0], var66.field732[0], 0, var66.field731[0], field269.field731[0]);
							field423 = field1191;
							field424 = field1192;
							field426 = 2;
							field425 = 0;
							field83.method457(4);
							field83.method459(var5);
						}
					}

					if (var4 == 856) {
						boolean var67 = method73(0, 0, 2, false, 0, 0, field269.field732[0], var3, 0, var2, field269.field731[0]);
						if (!var67) {
							method73(1, 0, 2, false, 0, 1, field269.field732[0], var3, 0, var2, field269.field731[0]);
						}

						field423 = field1191;
						field424 = field1192;
						field426 = 2;
						field425 = 0;
						field83.method457(2);
						field83.method494(field418 + var2);
						field83.method494(field419 + var3);
						field83.method495(var5);
					}

					if (var4 == 197) {
						field83.method457(33);
						field83.method495(var5);
						field83.method495(var3);
						field83.method459(var2);
						field507 = 0;
						field508 = var3;
						field509 = var2;
						field510 = 2;
						if (OMJBPTVL.method359(var3).field1045 == field88) {
							field510 = 1;
						}

						if (OMJBPTVL.method359(var3).field1045 == field98) {
							field510 = 3;
						}
					}

					if (var4 == 286) {
						field302++;
						if (field302 >= 89) {
							field83.method457(241);
							field83.method462(0);
							field302 = 0;
						}

						method103(var2, var3, var5);
						field83.method457(161);
						field83.method495(field419 + var3);
						field83.method494(var5 >> 14 & 0x7FFF);
						field83.method459(field418 + var2);
					}

					if (var4 == 356) {
						GYKYBIID var69 = field113[var5];
						if (var69 != null) {
							method73(1, 0, 2, false, 0, 1, field269.field732[0], var69.field732[0], 0, var69.field731[0], field269.field731[0]);
							field423 = field1191;
							field424 = field1192;
							field426 = 2;
							field425 = 0;
							field83.method457(116);
							field83.method495(var5);
						}
					}

					if (var4 == 529) {
						field83.method457(248);
						field83.method493(var2);
						field83.method459(var5);
						field83.method493(var3);
						field507 = 0;
						field508 = var3;
						field509 = var2;
						field510 = 2;
						if (OMJBPTVL.method359(var3).field1045 == field88) {
							field510 = 1;
						}

						if (OMJBPTVL.method359(var3).field1045 == field98) {
							field510 = 3;
						}
					}

					if (var4 == 1438) {
						YDSJAZFL var70 = YDSJAZFL.method575(var5);
						String var71;
						if (var70.field1432 == null) {
							var71 = "It's a " + var70.field1476 + ".";
						} else {
							var71 = new String(var70.field1432);
						}

						method133("", var71, 0);
					}

					field372 = 0;
					field378 = 0;
					field255 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void method164() {
		int var1 = field150.method592("Choose Option");
		for (int var2 = 0; var2 < field401; var2++) {
			int var3 = field150.method592(field361[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field401 * 15 + 21;
		if (field1191 > 4 && field1192 > 4 && field1191 < 516 && field1192 < 338) {
			int var5 = field1191 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1192 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field260 = true;
			field452 = 0;
			field453 = var5;
			field454 = var6;
			field455 = var1;
			field456 = field401 * 15 + 22;
		}

		if (field1191 > 553 && field1192 > 205 && field1191 < 743 && field1192 < 466) {
			int var7 = field1191 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1192 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field260 = true;
			field452 = 1;
			field453 = var7;
			field454 = var8;
			field455 = var1;
			field456 = field401 * 15 + 22;
		}

		if (field1191 > 17 && field1192 > 357 && field1191 < 496 && field1192 < 453) {
			int var9 = field1191 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1192 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field260 = true;
			field452 = 2;
			field453 = var9;
			field454 = var10;
			field455 = var1;
			field456 = field401 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(IILTQYMAXSO;)V")
	public final void method165(int arg0, TQYMAXSO arg1) {
		int var3 = arg1.method479(8);
		if (var3 < field367) {
			for (int var4 = var3; var4 < field367; var4++) {
				field276[field275++] = field368[var4];
			}
		}

		if (var3 > field367) {
			signlink.reporterror(field395 + " Too many players");
			throw new RuntimeException("eek");
		}

		field367 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field368[var5];
			DEHYKQII var7 = field366[var6];
			int var8 = arg1.method479(1);
			if (var8 == 0) {
				field368[field367++] = var6;
				var7.field689 = field258;
			} else {
				int var9 = arg1.method479(2);
				if (var9 == 0) {
					field368[field367++] = var6;
					var7.field689 = field258;
					field370[field369++] = var6;
				} else if (var9 == 1) {
					field368[field367++] = var6;
					var7.field689 = field258;
					int var10 = arg1.method479(3);
					var7.method226(false, var10);
					int var11 = arg1.method479(1);
					if (var11 == 1) {
						field370[field369++] = var6;
					}
				} else if (var9 == 2) {
					field368[field367++] = var6;
					var7.field689 = field258;
					int var12 = arg1.method479(3);
					var7.method226(true, var12);
					int var13 = arg1.method479(3);
					var7.method226(true, var13);
					int var14 = arg1.method479(1);
					if (var14 == 1) {
						field370[field369++] = var6;
					}
				} else if (var9 == 3) {
					field276[field275++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public void method166() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field303);

		if (field171 != null) {
			System.out.println("Od-cycle:" + field171.field657);
		}

		System.out.println("loop-cycle:" + field258);
		System.out.println("draw-cycle:" + field169);
		System.out.println("ptype:" + field230);
		System.out.println("psize:" + field229);

		if (field95 != null) {
			field95.method278();
		}

		field1173 = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public final Component method167() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1179 != null) {
			return field1179;
		}

		return this;
	}

	@ObfuscatedName("client.s(B)V")
	public final void method168() {
		if (field136 == null) {
			field1177 = null;
			field466 = null;
			field464 = null;
			field463 = null;
			field465 = null;
			field279 = null;
			field280 = null;
			field281 = null;
			field139 = new VFZXUVTW(265, 128, method167());
			MVOWZCMY.method343();
			field140 = new VFZXUVTW(265, 128, method167());
			MVOWZCMY.method343();
			field136 = new VFZXUVTW(171, 509, method167());
			MVOWZCMY.method343();
			field137 = new VFZXUVTW(132, 360, method167());
			MVOWZCMY.method343();
			field138 = new VFZXUVTW(200, 360, method167());
			MVOWZCMY.method343();
			field141 = new VFZXUVTW(238, 202, method167());
			MVOWZCMY.method343();
			field142 = new VFZXUVTW(238, 203, method167());
			MVOWZCMY.method343();
			field143 = new VFZXUVTW(94, 74, method167());
			MVOWZCMY.method343();
			field144 = new VFZXUVTW(94, 75, method167());
			MVOWZCMY.method343();

			if (field382 != null) {
				method112();
				method95();
			}

			field223 = true;
		}
	}

	@ObfuscatedName("client.c(LTQYMAXSO;II)V")
	public final void method169(TQYMAXSO arg0, int arg1) {
		field275 = 0;
		field369 = 0;
		method76(arg1, arg0);
		method107(arg1, arg0);
		method30(arg0, arg1);

		for (int var3 = 0; var3 < field275; var3++) {
			int var4 = field276[var3];
			if (field258 != field113[var4].field689) {
				field113[var4].field625 = null;
				field113[var4] = null;
			}
		}

		if (arg0.field1263 != arg1) {
			signlink.reporterror(field395 + " size mismatch in getnpcpos - pos:" + arg0.field1263 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field114; var5++) {
			if (field113[field115[var5]] == null) {
				signlink.reporterror(field395 + " null entry in npc list - pos:" + var5 + " size:" + field114);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)V")
	public final void method170(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field443 = 0;
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

			field443 = 0;
			label46: for (int var7 = 0; var7 < YDSJAZFL.field1451; var7++) {
				YDSJAZFL var8 = YDSJAZFL.method575(var7);
				if (var8.field1467 == -1 && var8.field1476 != null) {
					String var9 = var8.field1476.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field444[field443] = var9;
					field445[field443] = var7;
					field443++;
					if (field443 >= field444.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method171() {
		for (int var1 = -1; var1 < field367; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field365;
			} else {
				var2 = field368[var1];
			}

			DEHYKQII var3 = field366[var2];
			if (var3 != null && var3.field683 > 0) {
				var3.field683--;
				if (var3.field683 == 0) {
					var3.field707 = null;
				}
			}
		}

		field109++;
		if (field109 > 61) {
			field109 = 0;
			field83.method457(138);
		}

		for (int var4 = 0; var4 < field114; var4++) {
			int var5 = field115[var4];
			GYKYBIID var6 = field113[var5];
			if (var6 != null && var6.field683 > 0) {
				var6.field683--;
				if (var6.field683 == 0) {
					var6.field707 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method172(String arg0) throws IOException {
		if (field461) {
			if (field107 != null) {
				try {
					field107.close();
				} catch (Exception var4) {
				}

				field107 = null;
			}

			field107 = method161(43595);
			field107.setSoTimeout(10000);
			InputStream var2 = field107.getInputStream();
			OutputStream var3 = field107.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method173(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field121 = "";
				field122 = "Connecting to server...";
				method71(true);
			}

			field95 = new LBXRBQZX(method161(field435 + 43594), this);
			long var4 = PZGHUCRX.method405(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field83.field1263 = 0;
			field83.method458(14);
			field83.method458(var6);
			field95.method277(2, 0, field83.field1262);

			for (int var7 = 0; var7 < 8; var7++) {
				field95.method274();
			}

			int var8 = field95.method274();
			int var9 = var8;

			if (var8 == 0) {
				field95.method276(field290.field1262, 0, 8);
				field290.field1263 = 0;
				field304 = field290.method474();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field304 >> 32), (int) field304 };
				field83.field1263 = 0;
				field83.method458(10);
				field83.method462(var10[0]);
				field83.method462(var10[1]);
				field83.method462(var10[2]);
				field83.method462(var10[3]);
				field83.method462(signlink.uid);
				field83.method465(arg0);
				field83.method465(arg1);
				field83.method483(field240, field306);
				field92.field1263 = 0;

				if (arg2) {
					field92.method458(18);
				} else {
					field92.method458(16);
				}

				field92.method458(field83.field1263 + 36 + 1 + 1 + 2);
				field92.method458(255);
				field92.method459(363);
				field92.method458(field437 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field92.method462(field343[var11]);
				}

				field92.method466(field83.field1263, field83.field1262, 0);
				field83.field1267 = new MRWOUQJV(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field524 = new MRWOUQJV(var10);
				field95.method277(field92.field1263, 0, field92.field1262);
				var8 = field95.method274();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method173(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field270 = field95.method274();
				field319 = field95.method274() == 1;
				field235 = 0L;
				field415 = 0;
				field397.field1388 = 0;
				field1181 = true;
				field316 = true;
				field305 = true;
				field83.field1263 = 0;
				field290.field1263 = 0;
				field230 = -1;
				field185 = -1;
				field186 = -1;
				field187 = -1;
				field229 = 0;
				field231 = 0;
				field243 = 0;
				field233 = 0;
				field180 = 0;
				field401 = 0;
				field260 = false;
				field1182 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field349[var13] = null;
				}

				field372 = 0;
				field378 = 0;
				field82 = 0;
				field125 = 0;
				field189 = (int) (Math.random() * 100.0D) - 50;
				field155 = (int) (Math.random() * 110.0D) - 55;
				field244 = (int) (Math.random() * 80.0D) - 40;
				field265 = (int) (Math.random() * 120.0D) - 60;
				field484 = (int) (Math.random() * 30.0D) - 20;
				field262 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field504 = 0;
				field427 = -1;
				field308 = 0;
				field309 = 0;
				field367 = 0;
				field114 = 0;

				for (int var14 = 0; var14 < field364; var14++) {
					field366[var14] = null;
					field371[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field113[var15] = null;
				}

				field269 = field366[field365] = new DEHYKQII();
				field525.method183();
				field208.method183();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field124[var16][var17][var18] = null;
						}
					}
				}

				field346 = new CRZPTUPR();
				field501 = 0;
				field500 = 0;
				method80(field512);
				field512 = -1;
				method80(field98);
				field98 = -1;
				method80(field88);
				field88 = -1;
				method80(field326);
				field326 = -1;
				method80(field428);
				field428 = -1;
				method80(field120);
				field120 = -1;
				method80(field96);
				field96 = -1;
				field439 = false;
				field356 = 3;
				field384 = 0;
				field260 = false;
				field447 = false;
				field283 = null;
				field178 = 0;
				field166 = -1;
				field362 = true;
				method174();

				for (int var19 = 0; var19 < 5; var19++) {
					field163[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field253[var20] = null;
					field254[var20] = false;
				}

				field422 = 0;
				field483 = 0;
				field111 = 0;
				field363 = 0;
				field513 = 0;
				field334 = 0;
				field311 = 0;
				field302 = 0;
				method83();
			} else if (var8 == 3) {
				field121 = "";
				field122 = "Invalid username or password.";
			} else if (var8 == 4) {
				field121 = "Your account has been disabled.";
				field122 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field121 = "Your account is already logged in.";
				field122 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field121 = "RuneScape has been updated!";
				field122 = "Please reload this page.";
			} else if (var8 == 7) {
				field121 = "This world is full.";
				field122 = "Please use a different world.";
			} else if (var8 == 8) {
				field121 = "Unable to connect.";
				field122 = "Login server offline.";
			} else if (var8 == 9) {
				field121 = "Login limit exceeded.";
				field122 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field121 = "Unable to connect.";
				field122 = "Bad session id.";
			} else if (var8 == 11) {
				field121 = "Login server rejected session.";
				field122 = "Please try again.";
			} else if (var8 == 12) {
				field121 = "You need a members account to login to this world.";
				field122 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field121 = "Could not complete login.";
				field122 = "Please try using a different world.";
			} else if (var8 == 14) {
				field121 = "The server is being updated.";
				field122 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field305 = true;
				field83.field1263 = 0;
				field290.field1263 = 0;
				field230 = -1;
				field185 = -1;
				field186 = -1;
				field187 = -1;
				field229 = 0;
				field231 = 0;
				field243 = 0;
				field401 = 0;
				field260 = false;
				field237 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field121 = "Login attempts exceeded.";
				field122 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field121 = "You are standing in a members-only area.";
				field122 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field121 = "Invalid loginserver requested";
				field122 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field95.method274();
				for (var21 += 3; var21 >= 0; var21--) {
					field121 = "You have only just left another world";
					field122 = "Your profile will be transferred in: " + var21;
					method71(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method173(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field121 = "Malformed login packet.";
				field122 = "Please try again.";
			} else if (var8 == 23) {
				field121 = "No reply from loginserver.";
				field122 = "Please try again.";
			} else if (var8 == 24) {
				field121 = "Error loading your profile.";
				field122 = "Please contact customer support.";
			} else if (var8 == 25) {
				field121 = "Unexpected loginserver response.";
				field122 = "Please try using a different world.";
			} else if (var8 == 26) {
				field121 = "This computers address has been blocked";
				field122 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field121 = "Unexpected server response";
				field122 = "Please try using a different world.";
			} else if (var9 != 0) {
				field121 = "No response from server";
				field122 = "Please try using a different world.";
			} else if (field511 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field511++;
				method173(arg0, arg1, arg2);
			} else {
				field121 = "No response from loginserver";
				field122 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field121 = "";
			field122 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method174() {
		field239 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field429[var1] = -1;
			for (int var2 = 0; var2 < DOOZRHTX.field554; var2++) {
				if (!DOOZRHTX.field555[var2].field561 && DOOZRHTX.field555[var2].field556 == var1 + (field362 ? 0 : 7)) {
					field429[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method175() {
		if (field82 == 2) {
			for (KOXMDHST var1 = (KOXMDHST) field346.method179(); var1 != null; var1 = (KOXMDHST) field346.method181()) {
				if (var1.field847 > 0) {
					var1.field847--;
				}

				if (var1.field847 != 0) {
					if (var1.field855 > 0) {
						var1.field855--;
					}

					if (var1.field855 == 0 && var1.field853 >= 1 && var1.field854 >= 1 && var1.field853 <= 102 && var1.field854 <= 102 && (var1.field844 < 0 || AGPNOIRK.method18(var1.field844, var1.field846))) {
						method94(var1.field851, var1.field846, var1.field854, var1.field844, var1.field845, var1.field853, var1.field852);
						var1.field855 = -1;

						if (var1.field848 == var1.field844 && var1.field848 == -1) {
							var1.method272();
						} else if (var1.field848 == var1.field844 && var1.field849 == var1.field845 && var1.field850 == var1.field846) {
							var1.method272();
						}
					}
				} else if (var1.field848 < 0 || AGPNOIRK.method18(var1.field848, var1.field850)) {
					method94(var1.field851, var1.field850, var1.field854, var1.field848, var1.field849, var1.field853, var1.field852);
					var1.method272();
				}
			}
		}
	}

	public final void run() {
		if (field523) {
			method58();
		} else {
			super.run();
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field206[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field271[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
