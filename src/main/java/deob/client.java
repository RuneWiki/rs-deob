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
public final class client extends IVVPRVRY {

	@ObfuscatedName("client.K")
	public String field104 = "";

	@ObfuscatedName("client.L")
	public String field105 = "";

	@ObfuscatedName("client.P")
	public int[] field107 = new int[1000];

	@ObfuscatedName("client.Q")
	public int[] field108 = new int[1000];

	@ObfuscatedName("client.R")
	public int field109 = -1;

	@ObfuscatedName("client.Y")
	public byte[] field115 = new byte[16384];

	@ObfuscatedName("client.db")
	public JONKABPT[] field118 = new JONKABPT[100];

	@ObfuscatedName("client.eb")
	public String field119 = "";

	@ObfuscatedName("client.mb")
	public int field126 = 0x766654;

	@ObfuscatedName("client.ob")
	public int field128 = -1;

	@ObfuscatedName("client.rb")
	public int field131 = 3;

	@ObfuscatedName("client.sb")
	public CKBTFRZM field132 = CKBTFRZM.method32(1);

	@ObfuscatedName("client.Db")
	public JQZFCGYF[] field140 = new JQZFCGYF[13];

	@ObfuscatedName("client.Hb")
	public int[] field143 = new int[50];

	@ObfuscatedName("client.Ib")
	public int[] field144 = new int[151];

	@ObfuscatedName("client.Lb")
	public boolean field147 = true;

	@ObfuscatedName("client.Nb")
	public int[][] field149 = new int[104][104];

	@ObfuscatedName("client.dc")
	public int field164 = 2;

	@ObfuscatedName("client.hc")
	public int[] field168 = new int[500];

	@ObfuscatedName("client.ic")
	public int[] field169 = new int[500];

	@ObfuscatedName("client.jc")
	public int[] field170 = new int[500];

	@ObfuscatedName("client.kc")
	public int[] field171 = new int[500];

	@ObfuscatedName("client.lc")
	public int[] field172 = new int[5];

	@ObfuscatedName("client.oc")
	public int field175 = 2048;

	@ObfuscatedName("client.pc")
	public int field176 = 2047;

	@ObfuscatedName("client.qc")
	public GPPDQFCV[] field177 = new GPPDQFCV[field175];

	@ObfuscatedName("client.sc")
	public int[] field179 = new int[field175];

	@ObfuscatedName("client.uc")
	public int[] field181 = new int[field175];

	@ObfuscatedName("client.vc")
	public CKBTFRZM[] field182 = new CKBTFRZM[field175];

	@ObfuscatedName("client.wc")
	public boolean field183 = false;

	@ObfuscatedName("client.xc")
	public int field184 = -1;

	@ObfuscatedName("client.Qc")
	public CKBTFRZM field200 = new CKBTFRZM(new byte[5000]);

	@ObfuscatedName("client.Rc")
	public TKXONZKI[] field201 = new TKXONZKI[16384];

	@ObfuscatedName("client.Tc")
	public int[] field203 = new int[16384];

	@ObfuscatedName("client.Vc")
	public int field204 = -1;

	@ObfuscatedName("client.Yc")
	public int[] field205 = new int[5];

	@ObfuscatedName("client.Zc")
	public int field206 = 78;

	@ObfuscatedName("client.bd")
	public int[] field208 = new int[PFNGYNZB.field1102];

	@ObfuscatedName("client.ld")
	public int[] field218 = new int[PFNGYNZB.field1102];

	@ObfuscatedName("client.md")
	public int field219 = -1;

	@ObfuscatedName("client.pd")
	public boolean field222 = false;

	@ObfuscatedName("client.Nd")
	public boolean field246 = false;

	@ObfuscatedName("client.Rd")
	public CKBTFRZM field250 = CKBTFRZM.method32(1);

	@ObfuscatedName("client.Wd")
	public JQZFCGYF[] field255 = new JQZFCGYF[100];

	@ObfuscatedName("client.ce")
	public int field260 = 0x4D4233;

	@ObfuscatedName("client.ee")
	public int field261 = -1;

	@ObfuscatedName("client.fe")
	public int[] field262 = new int[5];

	@ObfuscatedName("client.ie")
	public final int field265 = 100;

	@ObfuscatedName("client.je")
	public int[] field266 = new int[100];

	@ObfuscatedName("client.te")
	public int[] field275 = new int[5];

	@ObfuscatedName("client.ue")
	public int[] field276 = new int[PFNGYNZB.field1102];

	@ObfuscatedName("client.Ce")
	public String[] field283 = new String[200];

	@ObfuscatedName("client.Ee")
	public int[] field285 = new int[33];

	@ObfuscatedName("client.Ie")
	public boolean field287 = false;

	@ObfuscatedName("client.Je")
	public int field288 = 0x23201B;

	@ObfuscatedName("client.Me")
	public int[] field290 = new int[7];

	@ObfuscatedName("client.Oe")
	public ICYHAEVI[] field292 = new ICYHAEVI[5];

	@ObfuscatedName("client.Pe")
	public String[] field293 = new String[500];

	@ObfuscatedName("client.Qe")
	public ONADPAJP[] field294 = new ONADPAJP[4];

	@ObfuscatedName("client.Se")
	public volatile boolean field296 = false;

	@ObfuscatedName("client.Ue")
	public int[] field298 = new int[1000];

	@ObfuscatedName("client.Ve")
	public WUVIEXOA field299 = new WUVIEXOA();

	@ObfuscatedName("client.We")
	public CRC32 field300 = new CRC32();

	@ObfuscatedName("client.Xe")
	public final int[] field301 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ye")
	public WUVIEXOA field302 = new WUVIEXOA();

	@ObfuscatedName("client.af")
	public int[] field304 = new int[100];

	@ObfuscatedName("client.bf")
	public String[] field305 = new String[100];

	@ObfuscatedName("client.cf")
	public String[] field306 = new String[100];

	@ObfuscatedName("client.gf")
	public int field310 = 2;

	@ObfuscatedName("client.hf")
	public volatile boolean field311 = false;

	@ObfuscatedName("client.jf")
	public int field312 = -1;

	@ObfuscatedName("client.of")
	public int field316 = 2;

	@ObfuscatedName("client.uf")
	public int field321 = 128;

	@ObfuscatedName("client.zf")
	public int field326 = -1;

	@ObfuscatedName("client.Cf")
	public boolean field328 = true;

	@ObfuscatedName("client.If")
	public String field334 = "";

	@ObfuscatedName("client.Kf")
	public int[] field336 = new int[2000];

	@ObfuscatedName("client.Lf")
	public int field337 = -1;

	@ObfuscatedName("client.Nf")
	public WUVIEXOA[][][] field338 = new WUVIEXOA[4][104][104];

	@ObfuscatedName("client.Uf")
	public boolean field345 = false;

	@ObfuscatedName("client.Vf")
	public boolean field346 = false;

	@ObfuscatedName("client.Zf")
	public int[] field347 = new int[151];

	@ObfuscatedName("client.dg")
	public int[] field350 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.eg")
	public int[][] field351 = new int[104][104];

	@ObfuscatedName("client.ig")
	public int[][] field355 = new int[104][104];

	@ObfuscatedName("client.lg")
	public int field356 = 0x332D25;

	@ObfuscatedName("client.mg")
	public int[] field357 = new int[33];

	@ObfuscatedName("client.tg")
	public boolean field364 = true;

	@ObfuscatedName("client.vg")
	public int field365 = -1;

	@ObfuscatedName("client.wg")
	public boolean field366 = false;

	@ObfuscatedName("client.Ag")
	public JONKABPT[] field370 = new JONKABPT[20];

	@ObfuscatedName("client.Tg")
	public int field389 = -1;

	@ObfuscatedName("client.Ug")
	public int field390 = -1;

	@ObfuscatedName("client.ah")
	public boolean field396 = false;

	@ObfuscatedName("client.bh")
	public boolean field397 = true;

	@ObfuscatedName("client.dh")
	public WUVIEXOA field398 = new WUVIEXOA();

	@ObfuscatedName("client.eh")
	public JQZFCGYF[] field399 = new JQZFCGYF[2];

	@ObfuscatedName("client.jh")
	public int field403 = -1;

	@ObfuscatedName("client.kh")
	public int[] field404 = new int[256];

	@ObfuscatedName("client.lh")
	public int field405 = -1;

	@ObfuscatedName("client.nh")
	public int[] field407 = new int[50];

	@ObfuscatedName("client.vh")
	public boolean[] field414 = new boolean[5];

	@ObfuscatedName("client.wh")
	public int[][][] field415 = new int[4][13][13];

	@ObfuscatedName("client.Ch")
	public JONKABPT[] field421 = new JONKABPT[8];

	@ObfuscatedName("client.Fh")
	public JONKABPT[] field424 = new JONKABPT[1000];

	@ObfuscatedName("client.Kh")
	public int[] field429 = new int[4000];

	@ObfuscatedName("client.Lh")
	public int[] field430 = new int[4000];

	@ObfuscatedName("client.Mh")
	public boolean field431 = false;

	@ObfuscatedName("client.Nh")
	public boolean field432 = false;

	@ObfuscatedName("client.Sh")
	public int[] field436 = new int[200];

	@ObfuscatedName("client.Uh")
	public boolean field437 = false;

	@ObfuscatedName("client.Vh")
	public volatile boolean field438 = false;

	@ObfuscatedName("client.Xh")
	public boolean field439 = false;

	@ObfuscatedName("client.Zh")
	public boolean field441 = false;

	@ObfuscatedName("client.bi")
	public long[] field443 = new long[100];

	@ObfuscatedName("client.di")
	public String field445 = "";

	@ObfuscatedName("client.ei")
	public boolean field446 = false;

	@ObfuscatedName("client.hi")
	public boolean field449 = false;

	@ObfuscatedName("client.ii")
	public int[] field450 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.ji")
	public long[] field451 = new long[200];

	@ObfuscatedName("client.oi")
	public int[] field456 = new int[2000];

	@ObfuscatedName("client.ti")
	public FDUKJGTQ field460 = new FDUKJGTQ();

	@ObfuscatedName("client.wi")
	public JONKABPT[] field463 = new JONKABPT[20];

	@ObfuscatedName("client.xi")
	public String[] field464 = new String[5];

	@ObfuscatedName("client.yi")
	public boolean[] field465 = new boolean[5];

	@ObfuscatedName("client.Ni")
	public int[] field476 = new int[50];

	@ObfuscatedName("client.bj")
	public boolean field487 = false;

	@ObfuscatedName("client.ij")
	public int field493 = 1;

	@ObfuscatedName("client.kj")
	public int field495 = 1;

	@ObfuscatedName("client.lj")
	public boolean field496 = false;

	@ObfuscatedName("client.nj")
	public int field498 = 50;

	@ObfuscatedName("client.oj")
	public int[] field499 = new int[field498];

	@ObfuscatedName("client.pj")
	public int[] field500 = new int[field498];

	@ObfuscatedName("client.qj")
	public int[] field501 = new int[field498];

	@ObfuscatedName("client.rj")
	public int[] field502 = new int[field498];

	@ObfuscatedName("client.sj")
	public int[] field503 = new int[field498];

	@ObfuscatedName("client.tj")
	public int[] field504 = new int[field498];

	@ObfuscatedName("client.uj")
	public int[] field505 = new int[field498];

	@ObfuscatedName("client.vj")
	public String[] field506 = new String[field498];

	@ObfuscatedName("client.wj")
	public boolean field507 = false;

	@ObfuscatedName("client.xj")
	public boolean field508 = false;

	@ObfuscatedName("client.yj")
	public int[] field509 = new int[5];

	@ObfuscatedName("client.Cj")
	public boolean field511 = true;

	@ObfuscatedName("client.Dj")
	public String field512 = "";

	@ObfuscatedName("client.Ej")
	public String field513 = "";

	@ObfuscatedName("client.Fj")
	public String field514 = "";

	@ObfuscatedName("client.Hj")
	public int[] field515 = new int[9];

	@ObfuscatedName("client.Nj")
	public String field520 = "";

	@ObfuscatedName("client.Pj")
	public CKBTFRZM field521 = CKBTFRZM.method32(1);

	@ObfuscatedName("client.Rj")
	public boolean field523 = false;

	@ObfuscatedName("client.Uj")
	public boolean field525 = false;

	@ObfuscatedName("client.Vj")
	public boolean field526 = false;

	@ObfuscatedName("client.nc")
	public static int[] field174 = new int[32];

	@ObfuscatedName("client.qd")
	public static int field223 = 10;

	@ObfuscatedName("client.sd")
	public static boolean field225 = true;

	@ObfuscatedName("client.Ed")
	public static BigInteger field237 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Be")
	public static int[] field282 = new int[99];

	@ObfuscatedName("client.fg")
	public static final int[] field352 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Jh")
	public static String field428 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.qi")
	public static final int[][] field458 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Kj")
	public static BigInteger field517 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.O")
	public int field106;

	@ObfuscatedName("client.X")
	public int field114;

	@ObfuscatedName("client.Z")
	public int field116;

	@ObfuscatedName("client.bb")
	public int field117;

	@ObfuscatedName("client.fb")
	public int field120;

	@ObfuscatedName("client.hb")
	public int field121;

	@ObfuscatedName("client.nb")
	public static int field127;

	@ObfuscatedName("client.pb")
	public int field129;

	@ObfuscatedName("client.qb")
	public int field130;

	@ObfuscatedName("client.wb")
	public static int field134;

	@ObfuscatedName("client.xb")
	public int field135;

	@ObfuscatedName("client.yb")
	public int field136;

	@ObfuscatedName("client.zb")
	public int field137;

	@ObfuscatedName("client.Bb")
	public int field139;

	@ObfuscatedName("client.Eb")
	public int field141;

	@ObfuscatedName("client.Gb")
	public int field142;

	@ObfuscatedName("client.Jb")
	public int field145;

	@ObfuscatedName("client.Kb")
	public static int field146;

	@ObfuscatedName("client.Mb")
	public int field148;

	@ObfuscatedName("client.Qb")
	public int field152;

	@ObfuscatedName("client.Rb")
	public int field153;

	@ObfuscatedName("client.Sb")
	public int field154;

	@ObfuscatedName("client.Tb")
	public int field155;

	@ObfuscatedName("client.Ub")
	public int field156;

	@ObfuscatedName("client.Vb")
	public int field157;

	@ObfuscatedName("client.Xb")
	public int field158;

	@ObfuscatedName("client.Yb")
	public int field159;

	@ObfuscatedName("client.Zb")
	public int field160;

	@ObfuscatedName("client.ac")
	public int field161;

	@ObfuscatedName("client.bc")
	public int field162;

	@ObfuscatedName("client.cc")
	public int field163;

	@ObfuscatedName("client.gc")
	public int field167;

	@ObfuscatedName("client.mc")
	public int field173;

	@ObfuscatedName("client.rc")
	public int field178;

	@ObfuscatedName("client.tc")
	public int field180;

	@ObfuscatedName("client.yc")
	public int field185;

	@ObfuscatedName("client.zc")
	public int field186;

	@ObfuscatedName("client.Hc")
	public int field193;

	@ObfuscatedName("client.Jc")
	public int field194;

	@ObfuscatedName("client.Kc")
	public int field195;

	@ObfuscatedName("client.Sc")
	public int field202;

	@ObfuscatedName("client.ad")
	public static int field207;

	@ObfuscatedName("client.od")
	public int field221;

	@ObfuscatedName("client.rd")
	public static int field224;

	@ObfuscatedName("client.Fd")
	public int field238;

	@ObfuscatedName("client.Gd")
	public int field239;

	@ObfuscatedName("client.Hd")
	public int field240;

	@ObfuscatedName("client.Id")
	public int field241;

	@ObfuscatedName("client.Kd")
	public int field243;

	@ObfuscatedName("client.Ld")
	public int field244;

	@ObfuscatedName("client.Md")
	public int field245;

	@ObfuscatedName("client.Od")
	public int field247;

	@ObfuscatedName("client.Pd")
	public static int field248;

	@ObfuscatedName("client.Qd")
	public static int field249;

	@ObfuscatedName("client.Vd")
	public int field254;

	@ObfuscatedName("client.Zd")
	public int field257;

	@ObfuscatedName("client.ge")
	public int field263;

	@ObfuscatedName("client.he")
	public int field264;

	@ObfuscatedName("client.ke")
	public int field267;

	@ObfuscatedName("client.le")
	public int field268;

	@ObfuscatedName("client.me")
	public int field269;

	@ObfuscatedName("client.ne")
	public int field270;

	@ObfuscatedName("client.oe")
	public int field271;

	@ObfuscatedName("client.ve")
	public static int field277;

	@ObfuscatedName("client.ye")
	public int field279;

	@ObfuscatedName("client.ze")
	public int field280;

	@ObfuscatedName("client.De")
	public int field284;

	@ObfuscatedName("client.Ge")
	public static int field286;

	@ObfuscatedName("client.Le")
	public int field289;

	@ObfuscatedName("client.Ne")
	public int field291;

	@ObfuscatedName("client.Re")
	public int field295;

	@ObfuscatedName("client.Te")
	public int field297;

	@ObfuscatedName("client.ff")
	public int field309;

	@ObfuscatedName("client.kf")
	public int field313;

	@ObfuscatedName("client.lf")
	public int field314;

	@ObfuscatedName("client.nf")
	public int field315;

	@ObfuscatedName("client.vf")
	public int field322;

	@ObfuscatedName("client.wf")
	public int field323;

	@ObfuscatedName("client.xf")
	public int field324;

	@ObfuscatedName("client.Bf")
	public int field327;

	@ObfuscatedName("client.Jf")
	public static int field335;

	@ObfuscatedName("client.Of")
	public int field339;

	@ObfuscatedName("client.Pf")
	public int field340;

	@ObfuscatedName("client.Qf")
	public int field341;

	@ObfuscatedName("client.Rf")
	public int field342;

	@ObfuscatedName("client.Tf")
	public int field344;

	@ObfuscatedName("client.ag")
	public int field348;

	@ObfuscatedName("client.gg")
	public int field353;

	@ObfuscatedName("client.hg")
	public int field354;

	@ObfuscatedName("client.ng")
	public int field358;

	@ObfuscatedName("client.og")
	public int field359;

	@ObfuscatedName("client.pg")
	public int field360;

	@ObfuscatedName("client.qg")
	public int field361;

	@ObfuscatedName("client.rg")
	public int field362;

	@ObfuscatedName("client.sg")
	public int field363;

	@ObfuscatedName("client.xg")
	public static int field367;

	@ObfuscatedName("client.yg")
	public int field368;

	@ObfuscatedName("client.zg")
	public int field369;

	@ObfuscatedName("client.Cg")
	public int field372;

	@ObfuscatedName("client.Dg")
	public int field373;

	@ObfuscatedName("client.Eg")
	public int field374;

	@ObfuscatedName("client.Fg")
	public int field375;

	@ObfuscatedName("client.Gg")
	public int field376;

	@ObfuscatedName("client.Hg")
	public int field377;

	@ObfuscatedName("client.Jg")
	public int field379;

	@ObfuscatedName("client.Kg")
	public int field380;

	@ObfuscatedName("client.Lg")
	public int field381;

	@ObfuscatedName("client.Mg")
	public int field382;

	@ObfuscatedName("client.Ng")
	public int field383;

	@ObfuscatedName("client.Og")
	public int field384;

	@ObfuscatedName("client.Pg")
	public int field385;

	@ObfuscatedName("client.Qg")
	public int field386;

	@ObfuscatedName("client.Rg")
	public int field387;

	@ObfuscatedName("client.Sg")
	public int field388;

	@ObfuscatedName("client.Vg")
	public int field391;

	@ObfuscatedName("client.Wg")
	public int field392;

	@ObfuscatedName("client.Xg")
	public int field393;

	@ObfuscatedName("client.Yg")
	public int field394;

	@ObfuscatedName("client.Zg")
	public int field395;

	@ObfuscatedName("client.fh")
	public static int field400;

	@ObfuscatedName("client.mh")
	public int field406;

	@ObfuscatedName("client.oh")
	public int field408;

	@ObfuscatedName("client.xh")
	public int field416;

	@ObfuscatedName("client.yh")
	public int field417;

	@ObfuscatedName("client.zh")
	public int field418;

	@ObfuscatedName("client.Ah")
	public int field419;

	@ObfuscatedName("client.Bh")
	public int field420;

	@ObfuscatedName("client.Gh")
	public int field425;

	@ObfuscatedName("client.Hh")
	public int field426;

	@ObfuscatedName("client.Ih")
	public static int field427;

	@ObfuscatedName("client.Ph")
	public static int field433;

	@ObfuscatedName("client.Qh")
	public int field434;

	@ObfuscatedName("client.Rh")
	public int field435;

	@ObfuscatedName("client.Yh")
	public int field440;

	@ObfuscatedName("client.ai")
	public int field442;

	@ObfuscatedName("client.fi")
	public static int field447;

	@ObfuscatedName("client.gi")
	public int field448;

	@ObfuscatedName("client.pi")
	public int field457;

	@ObfuscatedName("client.vi")
	public static int field462;

	@ObfuscatedName("client.zi")
	public int field466;

	@ObfuscatedName("client.Ei")
	public int field468;

	@ObfuscatedName("client.Fi")
	public int field469;

	@ObfuscatedName("client.Gi")
	public int field470;

	@ObfuscatedName("client.Hi")
	public int field471;

	@ObfuscatedName("client.Ii")
	public int field472;

	@ObfuscatedName("client.Ji")
	public int field473;

	@ObfuscatedName("client.Ki")
	public int field474;

	@ObfuscatedName("client.Li")
	public int field475;

	@ObfuscatedName("client.Yi")
	public int field484;

	@ObfuscatedName("client.Zi")
	public int field485;

	@ObfuscatedName("client.aj")
	public int field486;

	@ObfuscatedName("client.dj")
	public int field488;

	@ObfuscatedName("client.ej")
	public int field489;

	@ObfuscatedName("client.fj")
	public int field490;

	@ObfuscatedName("client.hj")
	public int field492;

	@ObfuscatedName("client.jj")
	public int field494;

	@ObfuscatedName("client.mj")
	public int field497;

	@ObfuscatedName("client.Aj")
	public int field510;

	@ObfuscatedName("client.Lj")
	public static int field518;

	@ObfuscatedName("client.Mj")
	public static int field519;

	@ObfuscatedName("client.Qj")
	public static int field522;

	@ObfuscatedName("client.Tj")
	public int field524;

	@ObfuscatedName("client.nd")
	public long field220;

	@ObfuscatedName("client.xe")
	public long field278;

	@ObfuscatedName("client.Ze")
	public long field303;

	@ObfuscatedName("client.ki")
	public long field452;

	@ObfuscatedName("client.Ai")
	public long field467;

	@ObfuscatedName("client.Xd")
	public CWPTWZXW field256;

	@ObfuscatedName("client.Ij")
	public EAXVDNXA field516;

	@ObfuscatedName("client.pf")
	public EEDCHWRL field317;

	@ObfuscatedName("client.Dc")
	public FETXLXVZ field189;

	@ObfuscatedName("client.Ec")
	public FETXLXVZ field190;

	@ObfuscatedName("client.Fc")
	public FETXLXVZ field191;

	@ObfuscatedName("client.Gc")
	public FETXLXVZ field192;

	@ObfuscatedName("client.cd")
	public FETXLXVZ field209;

	@ObfuscatedName("client.dd")
	public FETXLXVZ field210;

	@ObfuscatedName("client.ed")
	public FETXLXVZ field211;

	@ObfuscatedName("client.fd")
	public FETXLXVZ field212;

	@ObfuscatedName("client.gd")
	public FETXLXVZ field213;

	@ObfuscatedName("client.hd")
	public FETXLXVZ field214;

	@ObfuscatedName("client.id")
	public FETXLXVZ field215;

	@ObfuscatedName("client.jd")
	public FETXLXVZ field216;

	@ObfuscatedName("client.kd")
	public FETXLXVZ field217;

	@ObfuscatedName("client.vd")
	public FETXLXVZ field228;

	@ObfuscatedName("client.wd")
	public FETXLXVZ field229;

	@ObfuscatedName("client.xd")
	public FETXLXVZ field230;

	@ObfuscatedName("client.yd")
	public FETXLXVZ field231;

	@ObfuscatedName("client.zd")
	public FETXLXVZ field232;

	@ObfuscatedName("client.Ad")
	public FETXLXVZ field233;

	@ObfuscatedName("client.Bd")
	public FETXLXVZ field234;

	@ObfuscatedName("client.Cd")
	public FETXLXVZ field235;

	@ObfuscatedName("client.Dd")
	public FETXLXVZ field236;

	@ObfuscatedName("client.rf")
	public FETXLXVZ field318;

	@ObfuscatedName("client.sf")
	public FETXLXVZ field319;

	@ObfuscatedName("client.tf")
	public FETXLXVZ field320;

	@ObfuscatedName("client.Qi")
	public static GPPDQFCV field477;

	@ObfuscatedName("client.Bc")
	public JONKABPT field187;

	@ObfuscatedName("client.Cc")
	public JONKABPT field188;

	@ObfuscatedName("client.Pc")
	public JONKABPT field199;

	@ObfuscatedName("client.Ae")
	public JONKABPT field281;

	@ObfuscatedName("client.gh")
	public JONKABPT field401;

	@ObfuscatedName("client.hh")
	public JONKABPT field402;

	@ObfuscatedName("client.qh")
	public JONKABPT field409;

	@ObfuscatedName("client.rh")
	public JONKABPT field410;

	@ObfuscatedName("client.sh")
	public JONKABPT field411;

	@ObfuscatedName("client.th")
	public JONKABPT field412;

	@ObfuscatedName("client.uh")
	public JONKABPT field413;

	@ObfuscatedName("client.Dh")
	public JONKABPT field422;

	@ObfuscatedName("client.Eh")
	public JONKABPT field423;

	@ObfuscatedName("client.Wi")
	public JONKABPT field483;

	@ObfuscatedName("client.ec")
	public JQZFCGYF field165;

	@ObfuscatedName("client.fc")
	public JQZFCGYF field166;

	@ObfuscatedName("client.Sd")
	public JQZFCGYF field251;

	@ObfuscatedName("client.Td")
	public JQZFCGYF field252;

	@ObfuscatedName("client.Ud")
	public JQZFCGYF field253;

	@ObfuscatedName("client.ae")
	public JQZFCGYF field258;

	@ObfuscatedName("client.be")
	public JQZFCGYF field259;

	@ObfuscatedName("client.qe")
	public JQZFCGYF field272;

	@ObfuscatedName("client.re")
	public JQZFCGYF field273;

	@ObfuscatedName("client.se")
	public JQZFCGYF field274;

	@ObfuscatedName("client.Df")
	public JQZFCGYF field329;

	@ObfuscatedName("client.Ef")
	public JQZFCGYF field330;

	@ObfuscatedName("client.Ff")
	public JQZFCGYF field331;

	@ObfuscatedName("client.Gf")
	public JQZFCGYF field332;

	@ObfuscatedName("client.Hf")
	public JQZFCGYF field333;

	@ObfuscatedName("client.Ri")
	public JQZFCGYF field478;

	@ObfuscatedName("client.Si")
	public JQZFCGYF field479;

	@ObfuscatedName("client.Ti")
	public JQZFCGYF field480;

	@ObfuscatedName("client.Ui")
	public JQZFCGYF field481;

	@ObfuscatedName("client.Vi")
	public JQZFCGYF field482;

	@ObfuscatedName("client.ib")
	public OSNNCWUM field122;

	@ObfuscatedName("client.jb")
	public OSNNCWUM field123;

	@ObfuscatedName("client.kb")
	public OSNNCWUM field124;

	@ObfuscatedName("client.lb")
	public OSNNCWUM field125;

	@ObfuscatedName("client.cg")
	public PJNVYQWL field349;

	@ObfuscatedName("client.yf")
	public TTQEUGTP field325;

	@ObfuscatedName("client.Sf")
	public UGKPKMOJ field343;

	@ObfuscatedName("client.Jd")
	public String field242;

	@ObfuscatedName("client.Bg")
	public String field371;

	@ObfuscatedName("client.si")
	public String field459;

	@ObfuscatedName("client.gj")
	public String field491;

	@ObfuscatedName("client.Ab")
	public Socket field138;

	@ObfuscatedName("client.td")
	public static boolean field226;

	@ObfuscatedName("client.Ig")
	public static boolean field378;

	@ObfuscatedName("client.ci")
	public static boolean field444;

	@ObfuscatedName("client.Wj")
	public static boolean field527;

	@ObfuscatedName("client.T")
	public int[] field110;

	@ObfuscatedName("client.U")
	public int[] field111;

	@ObfuscatedName("client.V")
	public int[] field112;

	@ObfuscatedName("client.W")
	public int[] field113;

	@ObfuscatedName("client.Lc")
	public int[] field196;

	@ObfuscatedName("client.Mc")
	public int[] field197;

	@ObfuscatedName("client.Nc")
	public int[] field198;

	@ObfuscatedName("client.df")
	public int[] field307;

	@ObfuscatedName("client.ef")
	public int[] field308;

	@ObfuscatedName("client.li")
	public int[] field453;

	@ObfuscatedName("client.mi")
	public int[] field454;

	@ObfuscatedName("client.ni")
	public int[] field455;

	@ObfuscatedName("client.Xj")
	public int[] field528;

	@ObfuscatedName("client.Yj")
	public int[] field529;

	@ObfuscatedName("client.vb")
	public JQZFCGYF[] field133;

	@ObfuscatedName("client.Ob")
	public byte[][] field150;

	@ObfuscatedName("client.ud")
	public byte[][] field227;

	@ObfuscatedName("client.ui")
	public byte[][][] field461;

	@ObfuscatedName("client.Pb")
	public int[][][] field151;

	@ObfuscatedName("client.a(ZLFDUKJGTQ;I)I")
	public final int method83(FDUKJGTQ arg0, int arg1) {
		if (arg0.field684 == null || arg1 >= arg0.field684.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field684[arg1];
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
					var8 = field218[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field208[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field276[var3[var5++]];
				}

				if (var7 == 4) {
					FDUKJGTQ var10 = FDUKJGTQ.field705[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < PTCSWKBP.field1120 && (!PTCSWKBP.method489(var11).field1165 || field225)) {
						for (int var12 = 0; var12 < var10.field711.length; var12++) {
							if (var11 + 1 == var10.field711[var12]) {
								var8 += var10.field708[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field336[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field282[field208[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field336[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field477.field829;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < PFNGYNZB.field1102; var13++) {
						if (PFNGYNZB.field1104[var13]) {
							var8 += field208[var13];
						}
					}
				}

				if (var7 == 10) {
					FDUKJGTQ var14 = FDUKJGTQ.field705[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < PTCSWKBP.field1120 && (!PTCSWKBP.method489(var15).field1165 || field225)) {
						for (int var16 = 0; var16 < var14.field711.length; var16++) {
							if (var14.field711[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field245;
				}

				if (var7 == 12) {
					var8 = field116;
				}

				if (var7 == 13) {
					int var17 = field336[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					ZESTMKXA var20 = ZESTMKXA.field1479[var19];
					int var21 = var20.field1481;
					int var22 = var20.field1482;
					int var23 = var20.field1483;
					int var24 = field174[var23 - var22];
					var8 = field336[var21] >> var22 & var24;
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
					var8 = (field477.field1347 >> 7) + field468;
				}

				if (var7 == 19) {
					var8 = (field477.field1348 >> 7) + field469;
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

	@ObfuscatedName("client.d(I)V")
	public final void method84() {
		if (field360 == 0) {
			int var1 = field955;
			if (field488 == 1 && field956 >= 516 && field957 >= 160 && field956 <= 765 && field957 <= 205) {
				var1 = 0;
			}

			if (field287) {
				if (var1 != 1) {
					int var2 = field949;
					int var3 = field950;
					if (field384 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field384 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field384 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field385 - 10 || var2 > field387 + field385 + 10 || var3 < field386 - 10 || var3 > field388 + field386 + 10) {
						field287 = false;

						if (field384 == 1) {
							field366 = true;
						}

						if (field384 == 2) {
							field496 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field385;
					int var5 = field386;
					int var6 = field387;
					int var7 = field956;
					int var8 = field957;
					if (field384 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field384 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field384 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field264; var10++) {
						int var11 = (field264 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method118(var9);
					}

					field287 = false;

					if (field384 == 1) {
						field366 = true;
					}

					if (field384 == 2) {
						field496 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field264 > 0) {
					int var12 = field170[field264 - 1];
					if (var12 == 848 || var12 == 672 || var12 == 808 || var12 == 365 || var12 == 881 || var12 == 602 || var12 == 454 || var12 == 306 || var12 == 894 || var12 == 369 || var12 == 979 || var12 == 1435) {
						int var13 = field168[field264 - 1];
						int var14 = field169[field264 - 1];
						FDUKJGTQ var15 = FDUKJGTQ.field705[var14];
						if (var15.field675 || var15.field722) {
							field246 = false;
							field167 = 0;
							field358 = var14;
							field359 = var13;
							field360 = 2;
							field361 = field956;
							field362 = field957;

							if (FDUKJGTQ.field705[var14].field715 == field219) {
								field360 = 1;
							}

							if (FDUKJGTQ.field705[var14].field715 == field403) {
								field360 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field524 == 1 || method182(field264 - 1)) && field264 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field264 > 0) {
					method118(field264 - 1);
				}

				if (var1 != 2 || field264 <= 0) {
					return;
				}

				method150();
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.e(I)V")
	public final void method85() {
		if (field360 == 0) {
			field293[0] = "Cancel";
			field170[0] = 1484;
			field264 = 1;
			method210();
			field121 = 0;

			if (field949 > 4 && field950 > 4 && field949 < 516 && field950 < 338) {
				if (field219 == -1) {
					method104();
				} else {
					method169(field949, 0, 4, 4, FDUKJGTQ.field705[field219], field950);
				}
			}

			if (field263 != field121) {
				field263 = field121;
			}

			field121 = 0;

			if (field949 > 553 && field950 > 205 && field949 < 743 && field950 < 466) {
				if (field405 != -1) {
					method169(field949, 0, 205, 553, FDUKJGTQ.field705[field405], field950);
				} else if (field350[field131] != -1) {
					method169(field949, 0, 205, 553, FDUKJGTQ.field705[field350[field131]], field950);
				}
			}

			if (field121 != field114) {
				field366 = true;
				field114 = field121;
			}

			field121 = 0;

			if (field949 > 17 && field950 > 357 && field949 < 496 && field950 < 453) {
				if (field403 != -1) {
					method169(field949, 0, 357, 17, FDUKJGTQ.field705[field403], field950);
				} else if (field950 < 434 && field949 < 426) {
					method124(field949 - 17, field950 - 357);
				}
			}

			if (field403 != -1 && field152 != field121) {
				field496 = true;
				field152 = field121;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field264 - 1; var2++) {
					if (field170[var2] < 1000 && field170[var2 + 1] > 1000) {
						String var3 = field293[var2];
						field293[var2] = field293[var2 + 1];
						field293[var2 + 1] = var3;
						int var4 = field170[var2];
						field170[var2] = field170[var2 + 1];
						field170[var2 + 1] = var4;
						int var5 = field168[var2];
						field168[var2] = field168[var2 + 1];
						field168[var2 + 1] = var5;
						int var6 = field169[var2];
						field169[var2] = field169[var2 + 1];
						field169[var2 + 1] = var6;
						int var7 = field171[var2];
						field171[var2] = field171[var2 + 1];
						field171[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method86() {
		field441 = true;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method87() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.f(I)V")
	public final void method88() {
		short var1 = 256;

		if (field313 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field313 > 768) {
					field110[var2] = method100(1024 - field313, field111[var2], field112[var2]);
				} else if (field313 > 256) {
					field110[var2] = field112[var2];
				} else {
					field110[var2] = method100(256 - field313, field112[var2], field111[var2]);
				}
			}
		} else if (field314 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field314 > 768) {
					field110[var3] = method100(1024 - field314, field111[var3], field113[var3]);
				} else if (field314 > 256) {
					field110[var3] = field113[var3];
				} else {
					field110[var3] = method100(256 - field314, field113[var3], field111[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field110[var4] = field111[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field212.field730[var5] = field422.field999[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field404[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field528[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field110[var12];
					int var15 = field212.field730[var7];
					field212.field730[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field212.method290(0, 0, field941);

		for (int var16 = 0; var16 < 33920; var16++) {
			field213.field730[var16] = field423.field999[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field404[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field528[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field110[var23];
					int var26 = field213.field730[var18];
					field213.field730[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field213.method290(0, 637, field941);
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field165.method442(arg2, arg0);
		field166.method442(arg1 + arg2 - 16, arg0);
		JJXDTORW.method417(arg2 + 16, arg1 - 32, arg0, 16, field288);
		int var6 = (arg1 - 32) * arg1 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg3 / (arg4 - arg1);
		JJXDTORW.method417(arg2 + var7 + 16, var6, arg0, 16, field260);
		JJXDTORW.method422(arg0, field126, arg2 + var7 + 16, var6);
		JJXDTORW.method422(arg0 + 1, field126, arg2 + var7 + 16, var6);
		JJXDTORW.method420(field126, arg2 + var7 + 16, arg0, 16);
		JJXDTORW.method420(field126, arg2 + var7 + 17, arg0, 16);
		JJXDTORW.method422(arg0 + 15, field356, arg2 + var7 + 16, var6);
		JJXDTORW.method422(arg0 + 14, field356, arg2 + var7 + 17, var6 - 1);
		JJXDTORW.method420(field356, arg2 + var7 + var6 + 15, arg0, 16);
		JJXDTORW.method420(field356, arg2 + var7 + var6 + 14, arg0 + 1, 15);
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method90(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.g(I)V")
	public final void method91() {
		field526 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field290[var1] = -1;
			for (int var2 = 0; var2 < IDSYSMIG.field908; var2++) {
				if (!IDSYSMIG.field909[var2].field915 && IDSYSMIG.field909[var2].field910 == var1 + (field397 ? 0 : 7)) {
					field290[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method92() {
		if (field157 > 0) {
			method99();
		} else {
			field191.method289();
			field123.method464(144, 0, 257, "Connection lost");
			field123.method464(143, 0xFFFFFF, 256, "Connection lost");
			field123.method464(159, 0, 257, "Please wait - attempting to reestablish");
			field123.method464(158, 0xFFFFFF, 256, "Please wait - attempting to reestablish");
			field191.method290(4, 4, field941);
			field348 = 0;
			field279 = 0;
			CWPTWZXW var1 = field256;
			field439 = false;
			field173 = 0;
			method195(field104, field105, true);

			if (!field439) {
				method99();
			}

			try {
				var1.method229();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method93() {
		for (VJJXMLOH var1 = (VJJXMLOH) field398.method585(); var1 != null; var1 = (VJJXMLOH) field398.method587()) {
			if (field375 != var1.field1447 || field277 > var1.field1432) {
				var1.method450();
			} else if (field277 >= var1.field1431) {
				if (var1.field1435 > 0) {
					TKXONZKI var2 = field201[var1.field1435 - 1];
					if (var2 != null && var2.field1347 >= 0 && var2.field1347 < 13312 && var2.field1348 >= 0 && var2.field1348 < 13312) {
						var1.method576(method194(var1.field1447, var2.field1347, var2.field1348) - var1.field1428, var2.field1347, var2.field1348, field277);
					}
				}

				if (var1.field1435 < 0) {
					int var3 = -var1.field1435 - 1;
					GPPDQFCV var4;
					if (field337 == var3) {
						var4 = field477;
					} else {
						var4 = field177[var3];
					}

					if (var4 != null && var4.field1347 >= 0 && var4.field1347 < 13312 && var4.field1348 >= 0 && var4.field1348 < 13312) {
						var1.method576(method194(var1.field1447, var4.field1347, var4.field1348) - var1.field1428, var4.field1347, var4.field1348, field277);
					}
				}

				var1.method577(field392);
				field343.method518(false, 60, var1, var1.field1445, -1, (int) var1.field1442, field375, (int) var1.field1443, (int) var1.field1444);
			}
		}

		field248++;
		if (field248 > 1045) {
			field248 = 0;
			field521.method33(234);
			field521.method34(0);
			int var5 = field521.field92;

			if ((int) (Math.random() * 2.0D) == 0) {
				field521.method35(60614);
			}

			field521.method34(170);
			field521.method35((int) (Math.random() * 65536.0D));
			field521.method35(42459);
			field521.method35(33342);
			field521.method34((int) (Math.random() * 256.0D));
			field521.method35(17955);

			if ((int) (Math.random() * 2.0D) == 0) {
				field521.method34(56);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field521.method35(37865);
			}

			field521.method35(33168);
			field521.method43(field521.field92 - var5);
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method94() {
		field497 = 0;
		for (int var1 = -1; var1 < field202 + field178; var1++) {
			UKYMLOIC var2;
			if (var1 == -1) {
				var2 = field477;
			} else if (var1 < field178) {
				var2 = field177[field179[var1]];
			} else {
				var2 = field201[field203[var1 - field178]];
			}

			if (var2 != null && var2.method368()) {
				if (var2 instanceof TKXONZKI) {
					BXXPAJNW var3 = ((TKXONZKI) var2).field1188;
					if (var3.field69 != null) {
						var3 = var3.method27();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field178) {
					BXXPAJNW var7 = ((TKXONZKI) var2).field1188;
					if (var7.field62 >= 0 && var7.field62 < field370.length) {
						method164(var2, var2.field1346 + 15);

						if (field389 > -1) {
							field370[var7.field62].method429(field390 - 30, field389 - 12);
						}
					}

					if (field344 == 1 && field203[var1 - field178] == field244 && field277 % 20 < 10) {
						method164(var2, var2.field1346 + 15);

						if (field389 > -1) {
							field370[2].method429(field390 - 28, field389 - 12);
						}
					}
				} else {
					int var4 = 30;
					GPPDQFCV var5 = (GPPDQFCV) var2;
					if (var5.field820 != 0) {
						method164(var2, var2.field1346 + 15);

						if (field389 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field820 & 1 << var6) != 0) {
									field370[var6].method429(field390 - var4, field389 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field344 == 10 && field179[var1] == field117) {
						method164(var2, var2.field1346 + 15);

						if (field389 > -1) {
							field370[7].method429(field390 - var4, field389 - 12);
						}
					}
				}

				if (var2.field1307 != null && (var1 >= field178 || field466 == 0 || field466 == 3 || field466 == 1 && method219(((GPPDQFCV) var2).field839))) {
					method164(var2, var2.field1346);

					if (field389 > -1 && field497 < field498) {
						field502[field497] = field124.method467(var2.field1307) / 2;
						field501[field497] = field124.field1099;
						field499[field497] = field389;
						field500[field497] = field390;
						field503[field497] = var2.field1306;
						field504[field497] = var2.field1312;
						field505[field497] = var2.field1335;
						field506[field497++] = var2.field1307;

						if (field295 == 0 && var2.field1312 >= 1 && var2.field1312 <= 3) {
							field501[field497] += 10;
							field500[field497] += 5;
						}

						if (field295 == 0 && var2.field1312 == 4) {
							field502[field497] = 60;
						}

						if (field295 == 0 && var2.field1312 == 5) {
							field501[field497] += 5;
						}
					}
				}

				if (var2.field1308 > field277) {
					method164(var2, var2.field1346 + 15);

					if (field389 > -1) {
						int var8 = var2.field1309 * 30 / var2.field1310;
						if (var8 > 30) {
							var8 = 30;
						}

						JJXDTORW.method417(field390 - 3, 5, field389 - 15, var8, 0xFF00);
						JJXDTORW.method417(field390 - 3, 5, field389 + var8 - 15, 30 - var8, 0xFF0000);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1327[var9] > field277) {
						method164(var2, var2.field1346 / 2);

						if (field389 > -1) {
							if (var9 == 1) {
								field390 -= 20;
							}

							if (var9 == 2) {
								field389 -= 15;
								field390 -= 10;
							}

							if (var9 == 3) {
								field389 += 15;
								field390 -= 10;
							}

							field463[var2.field1326[var9]].method429(field390 - 12, field389 - 12);
							field122.method464(field390 + 4, 0, field389, String.valueOf(var2.field1325[var9]));
							field122.method464(field390 + 3, 0xFFFFFF, field389 - 1, String.valueOf(var2.field1325[var9]));
						}
					}
				}
			}
		}

		field433++;
		if (field433 > 1331) {
			field433 = 0;
			field521.method33(54);
			field521.method34(0);
			int var10 = field521.field92;

			if ((int) (Math.random() * 2.0D) == 0) {
				field521.method35(42239);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field521.method35(18928);
			}

			field521.method34(21);
			field521.method34(14);
			field521.method34((int) (Math.random() * 256.0D));
			field521.method34(10);
			field521.method35(29609);

			if ((int) (Math.random() * 2.0D) == 0) {
				field521.method35(22957);
			}

			field521.method34(245);
			field521.method34(50);
			field521.method43(field521.field92 - var10);
		}

		for (int var11 = 0; var11 < field497; var11++) {
			int var12 = field499[var11];
			int var13 = field500[var11];
			int var14 = field502[var11];
			int var15 = field501[var11];
			boolean var16 = true;
			while (var16) {
				var16 = false;
				for (int var17 = 0; var17 < var11; var17++) {
					if (var13 + 2 > field500[var17] - field501[var17] && var13 - var15 < field500[var17] + 2 && var12 - var14 < field502[var17] + field499[var17] && var12 + var14 > field499[var17] - field502[var17] && field500[var17] - field501[var17] < var13) {
						var13 = field500[var17] - field501[var17];
						var16 = true;
					}
				}
			}

			field389 = field499[var11];
			field390 = field500[var11] = var13;
			String var18 = field506[var11];
			if (field295 == 0) {
				int var19 = 0xFFFF00;
				if (field503[var11] < 6) {
					var19 = field450[field503[var11]];
				}

				if (field503[var11] == 6) {
					var19 = field457 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field503[var11] == 7) {
					var19 = field457 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field503[var11] == 8) {
					var19 = field457 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field503[var11] == 9) {
					int var20 = 150 - field505[var11];
					if (var20 < 50) {
						var19 = var20 * 1280 + 0xFF0000;
					} else if (var20 < 100) {
						var19 = 0xFFFF00 - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var19 = (var20 - 100) * 5 + 0xFF00;
					}
				}

				if (field503[var11] == 10) {
					int var21 = 150 - field505[var11];
					if (var21 < 50) {
						var19 = var21 * 5 + 0xFF0000;
					} else if (var21 < 100) {
						var19 = 0xFF00FF - (var21 - 50) * 0x50000;
					} else if (var21 < 150) {
						var19 = (var21 - 100) * 0x50000 + 255 - (var21 - 100) * 5;
					}
				}

				if (field503[var11] == 11) {
					int var22 = 150 - field505[var11];
					if (var22 < 50) {
						var19 = 0xFFFFFF - var22 * 327685;
					} else if (var22 < 100) {
						var19 = (var22 - 50) * 327685 + 0xFF00;
					} else if (var22 < 150) {
						var19 = 0xFFFFFF - (var22 - 100) * 0x50000;
					}
				}

				if (field504[var11] == 0) {
					field124.method464(field390 + 1, 0, field389, var18);
					field124.method464(field390, var19, field389, var18);
				}

				if (field504[var11] == 1) {
					field124.method469(field457, field390 + 1, var18, field389, 0);
					field124.method469(field457, field390, var18, field389, var19);
				}

				if (field504[var11] == 2) {
					field124.method470(var18, field457, field390 + 1, 0, field389);
					field124.method470(var18, field457, field390, var19, field389);
				}

				if (field504[var11] == 3) {
					field124.method471(field457, 0, 150 - field505[var11], var18, field389, field390 + 1);
					field124.method471(field457, var19, 150 - field505[var11], var18, field389, field390);
				}

				if (field504[var11] == 4) {
					int var23 = field124.method467(var18);
					int var24 = (150 - field505[var11]) * (var23 + 100) / 150;
					JJXDTORW.method414(field389 - 50, field389 + 50, 0, 334);
					field124.method468(var18, field390 + 1, 0, field389 + 50 - var24);
					field124.method468(var18, field390, var19, field389 + 50 - var24);
					JJXDTORW.method413();
				}

				if (field504[var11] == 5) {
					int var25 = 150 - field505[var11];
					int var26 = 0;
					if (var25 < 25) {
						var26 = var25 - 25;
					} else if (var25 > 125) {
						var26 = var25 - 125;
					}

					JJXDTORW.method414(0, 512, field390 - field124.field1099 - 1, field390 + 5);
					field124.method464(field390 + var26 + 1, 0, field389, var18);
					field124.method464(field390 + var26, var19, field389, var18);
					JJXDTORW.method413();
				}
			} else {
				field124.method464(field390 + 1, 0, field389, var18);
				field124.method464(field390, 0xFFFF00, field389, var18);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 1 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
			if (field226 && field375 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field343.method533(arg2, arg6, arg0);
			}

			if (arg1 == 1) {
				var8 = field343.method534(arg0, arg6, arg2);
			}

			if (arg1 == 2) {
				var8 = field343.method535(arg2, arg6, arg0);
			}

			if (arg1 == 3) {
				var8 = field343.method536(arg2, arg6, arg0);
			}

			if (var8 != 0) {
				int var12 = field343.method537(arg2, arg6, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field343.method524(arg0, arg6, arg2);
					VCGOMUBN var16 = VCGOMUBN.method568(var13);
					if (var16.field1396) {
						field294[arg2].method456(var15, var14, arg6, arg0, var16.field1419);
					}
				}

				if (arg1 == 1) {
					field343.method525(arg0, arg6, arg2);
				}

				if (arg1 == 2) {
					field343.method526(arg6, arg0, arg2);
					VCGOMUBN var17 = VCGOMUBN.method568(var13);
					if (var17.field1420 + arg6 > 103 || var17.field1420 + arg0 > 103 || var17.field1392 + arg6 > 103 || var17.field1392 + arg0 > 103) {
						return;
					}

					if (var17.field1396) {
						field294[arg2].method457(var17.field1419, arg0, var17.field1420, var17.field1392, arg6, var15);
					}
				}

				if (arg1 == 3) {
					field343.method527(arg6, arg0, arg2);
					VCGOMUBN var18 = VCGOMUBN.method568(var13);
					if (var18.field1396 && var18.field1389) {
						field294[arg2].method459(arg0, arg6);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field461[1][arg6][arg0] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				BRNLHXCU.method12(arg6, arg5, arg0, field151, field343, field294[arg2], arg4, arg2, var19, arg3);
				return;
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method96() {
		for (int var1 = -1; var1 < field178; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field176;
			} else {
				var2 = field179[var1];
			}

			GPPDQFCV var3 = field177[var2];
			if (var3 != null) {
				method156(1, var3);
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method97() {
		int var1 = field385;
		int var2 = field386;
		int var3 = field387;
		int var4 = field388;
		int var5 = 0x5D5447;
		JJXDTORW.method417(var2, var4, var1, var3, var5);
		JJXDTORW.method417(var2 + 1, 16, var1 + 1, var3 - 2, 0);
		JJXDTORW.method418(var3 - 2, var4 - 19, 0, var2 + 18, var1 + 1);
		field124.method468("Choose Option", var2 + 14, var5, var1 + 3);
		int var6 = field949;
		int var7 = field950;
		if (field384 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field384 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field384 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field264; var8++) {
			int var9 = (field264 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field124.method472(var1 + 3, true, var10, var9, field293[var8]);
		}
	}

	@ObfuscatedName("client.a(ZIZ)V")
	public final void method98(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method99() {
		try {
			if (field256 != null) {
				field256.method229();
			}
		} catch (Exception var2) {
		}

		field256 = null;
		field439 = false;
		field139 = 0;
		field104 = "";
		field105 = "";
		method198();
		field343.method507();

		for (int var1 = 0; var1 < 4; var1++) {
			field294[var1].method451();
		}

		System.gc();
		method87();
		field326 = -1;
		field327 = -1;
		field129 = 0;
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method100(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(IZLCKBTFRZM;)V")
	public final void method101(int arg0, CKBTFRZM arg1) {
		field297 = 0;
		field180 = 0;
		method135(arg0, arg1);
		method149(arg1, arg0);
		method196(arg0, arg1);
		method123(arg0, arg1);

		for (int var3 = 0; var3 < field297; var3++) {
			int var4 = field298[var3];
			if (field277 != field177[var4].field1329) {
				field177[var4] = null;
			}
		}

		if (arg1.field92 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field92 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field178; var5++) {
			if (field177[field179[var5]] == null) {
				signlink.reporterror(field104 + " null entry in pl list - pos:" + var5 + " size:" + field178);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method102() {
		method218();

		if (field475 == 1) {
			field421[field474 / 100].method429(field473 - 8 - 4, field472 - 8 - 4);
			field447++;
			if (field447 > 68) {
				field447 = 0;
				field521.method33(64);
			}
		}

		if (field475 == 2) {
			field421[field474 / 100 + 4].method429(field473 - 8 - 4, field472 - 8 - 4);
		}

		if (field204 != -1) {
			method188(field392, field204);
			method215(0, FDUKJGTQ.field705[field204], 0, 0);
		}

		if (field219 != -1) {
			method188(field392, field219);
			method215(0, FDUKJGTQ.field705[field219], 0, 0);
		}

		method103();

		if (!field287) {
			method85();
			method170();
		} else if (field384 == 0) {
			method97();
		}

		if (field363 == 1) {
			field370[1].method429(296, 472);
		}

		if (field444) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field937 < 15) {
				var3 = 0xFF0000;
			}

			field123.method463("Fps:" + field937, var3, var2, var1);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field226) {
				int var7 = 0xFF0000;
			}

			field123.method463("Mem:" + var5 + "k", 0xFFFF00, var2, var1);
			var2 += 15;
		}

		if (field195 != 0) {
			int var8 = field195 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field123.method468("System update in: " + var9 + ":0" + var8, 329, 0xFFFF00, 4);
			} else {
				field123.method468("System update in: " + var9 + ":" + var8, 329, 0xFFFF00, 4);
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method103() {
		field193 = 0;
		int var1 = (field477.field1347 >> 7) + field468;
		int var2 = (field477.field1348 >> 7) + field469;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field193 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field193 = 1;
		}

		if (field193 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field193 = 0;
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method104() {
		if (field238 == 0 && field488 == 0) {
			field293[field264] = "Walk here";
			field170[field264] = 665;
			field168[field264] = field949;
			field169[field264] = field950;
			field264++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < GFYXEFQY.field814; var2++) {
			int var3 = GFYXEFQY.field815[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field343.method537(field375, var4, var5, var3) >= 0) {
					VCGOMUBN var8 = VCGOMUBN.method568(var7);
					if (var8.field1412 != null) {
						var8 = var8.method573();
					}

					if (var8 == null) {
						continue;
					}

					if (field238 == 1) {
						field293[field264] = "Use " + field242 + " with @cya@" + var8.field1403;
						field170[field264] = 782;
						field171[field264] = var3;
						field168[field264] = var4;
						field169[field264] = var5;
						field264++;
					} else if (field488 != 1) {
						if (var8.field1417 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1417[var9] != null) {
									field293[field264] = var8.field1417[var9] + " @cya@" + var8.field1403;

									if (var9 == 0) {
										field170[field264] = 717;
									}

									if (var9 == 1) {
										field170[field264] = 97;
									}

									if (var9 == 2) {
										field170[field264] = 346;
									}

									if (var9 == 3) {
										field170[field264] = 51;
									}

									if (var9 == 4) {
										field170[field264] = 1281;
									}

									field171[field264] = var3;
									field168[field264] = var4;
									field169[field264] = var5;
									field264++;
								}
							}
						}

						field293[field264] = "Examine @cya@" + var8.field1403;
						field170[field264] = 1431;
						field171[field264] = var8.field1413 << 14;
						field168[field264] = var4;
						field169[field264] = var5;
						field264++;
					} else if ((field490 & 0x4) == 4) {
						field293[field264] = field491 + " @cya@" + var8.field1403;
						field170[field264] = 392;
						field171[field264] = var3;
						field168[field264] = var4;
						field169[field264] = var5;
						field264++;
					}
				}

				if (var6 == 1) {
					TKXONZKI var10 = field201[var7];
					if (var10.field1188.field77 == 1 && (var10.field1347 & 0x7F) == 0x40 && (var10.field1348 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field202; var11++) {
							TKXONZKI var12 = field201[field203[var11]];
							if (var12 != null && var10 != var12 && var12.field1188.field77 == 1 && var10.field1347 == var12.field1347 && var10.field1348 == var12.field1348) {
								method142(var5, var12.field1188, field203[var11], var4);
							}
						}

						for (int var13 = 0; var13 < field178; var13++) {
							GPPDQFCV var14 = field177[field179[var13]];
							if (var14 != null && var10.field1347 == var14.field1347 && var10.field1348 == var14.field1348) {
								method217(var4, var5, var14, field179[var13]);
							}
						}
					}

					method142(var5, var10.field1188, var7, var4);
				}

				if (var6 == 0) {
					GPPDQFCV var15 = field177[var7];
					if ((var15.field1347 & 0x7F) == 0x40 && (var15.field1348 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field202; var16++) {
							TKXONZKI var17 = field201[field203[var16]];
							if (var17 != null && var17.field1188.field77 == 1 && var15.field1347 == var17.field1347 && var15.field1348 == var17.field1348) {
								method142(var5, var17.field1188, field203[var16], var4);
							}
						}

						for (int var18 = 0; var18 < field178; var18++) {
							GPPDQFCV var19 = field177[field179[var18]];
							if (var19 != null && var15 != var19 && var15.field1347 == var19.field1347 && var15.field1348 == var19.field1348) {
								method217(var4, var5, var19, field179[var18]);
							}
						}
					}

					method217(var4, var5, var15, var7);
				}

				if (var6 == 3) {
					WUVIEXOA var20 = field338[field375][var4][var5];
					if (var20 != null) {
						for (TRUVKLSN var21 = (TRUVKLSN) var20.method586(); var21 != null; var21 = (TRUVKLSN) var20.method588()) {
							PTCSWKBP var22 = PTCSWKBP.method489(var21.field1190);
							if (field238 == 1) {
								field293[field264] = "Use " + field242 + " with @lre@" + var22.field1118;
								field170[field264] = 507;
								field171[field264] = var21.field1190;
								field168[field264] = var4;
								field169[field264] = var5;
								field264++;
							} else if (field488 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1150 != null && var22.field1150[var23] != null) {
										field293[field264] = var22.field1150[var23] + " @lre@" + var22.field1118;

										if (var23 == 0) {
											field170[field264] = 215;
										}

										if (var23 == 1) {
											field170[field264] = 877;
										}

										if (var23 == 2) {
											field170[field264] = 246;
										}

										if (var23 == 3) {
											field170[field264] = 321;
										}

										if (var23 == 4) {
											field170[field264] = 247;
										}

										field171[field264] = var21.field1190;
										field168[field264] = var4;
										field169[field264] = var5;
										field264++;
									} else if (var23 == 2) {
										field293[field264] = "Take @lre@" + var22.field1118;
										field170[field264] = 246;
										field171[field264] = var21.field1190;
										field168[field264] = var4;
										field169[field264] = var5;
										field264++;
									}
								}

								field293[field264] = "Examine @lre@" + var22.field1118;
								field170[field264] = 1685;
								field171[field264] = var21.field1190;
								field168[field264] = var4;
								field169[field264] = var5;
								field264++;
							} else if ((field490 & 0x1) == 1) {
								field293[field264] = field491 + " @lre@" + var22.field1118;
								field170[field264] = 53;
								field171[field264] = var21.field1190;
								field168[field264] = var4;
								field169[field264] = var5;
								field264++;
							}
						}
					}
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 309);

			if (arg0.length == 5) {
				field223 = Integer.parseInt(arg0[0]);
				field224 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method126();
				} else if (arg0[2].equals("highmem")) {
					method132();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field225 = false;
				} else if (arg0[3].equals("members")) {
					field225 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method399(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method105() {
		field258 = new JQZFCGYF(field516, "titlebox", 0);
		field259 = new JQZFCGYF(field516, "titlebutton", 0);
		field133 = new JQZFCGYF[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field133[var2] = new JQZFCGYF(field516, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field133[var3] = new JQZFCGYF(field516, "runes", (var3 & 0x3) + 12);
			}
		}

		field422 = new JONKABPT(128, 265);
		field423 = new JONKABPT(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field422.field999[var4] = field212.field730[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field423.field999[var5] = field213.field730[var5];
		}

		field111 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field111[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field111[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field111[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field111[var9 + 192] = 0xFFFFFF;
		}

		field112 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field112[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field112[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field112[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field112[var13 + 192] = 0xFFFFFF;
		}

		field113 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field113[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field113[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field113[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field113[var17 + 192] = 0xFFFFFF;
		}

		field110 = new int[256];
		field307 = new int[32768];
		field308 = new int[32768];
		method186(null);
		field528 = new int[32768];
		field529 = new int[32768];
		method200("Connecting to fileserver", 10);

		if (!field311) {
			field296 = true;
			field311 = true;
			method117(this, 2);
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void method106(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public final String method107(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.d(B)V")
	public final void method108() {
		if (field139 == 0) {
			int var1 = field939 / 2 - 80;
			int var2 = field940 / 2 + 20;
			var2 += 20;
			if (field955 == 1 && field956 >= var1 - 75 && field956 <= var1 + 75 && field957 >= var2 - 20 && field957 <= var2 + 20) {
				field139 = 3;
				field510 = 0;
			}

			int var3 = field939 / 2 + 80;
			if (field955 == 1 && field956 >= var3 - 75 && field956 <= var3 + 75 && field957 >= var2 - 20 && field957 <= var2 + 20) {
				field513 = "";
				field514 = "Enter your username & password.";
				field139 = 2;
				field510 = 0;
			}
		} else if (field139 == 2) {
			int var4 = field940 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field955 == 1 && field957 >= var4 - 15 && field957 < var4) {
				field510 = 0;
			}

			var4 += 15;
			if (field955 == 1 && field957 >= var4 - 15 && field957 < var4) {
				field510 = 1;
			}

			var4 += 15;
			int var5 = field939 / 2 - 80;
			int var6 = field940 / 2 + 50;
			var6 += 20;
			if (field955 == 1 && field956 >= var5 - 75 && field956 <= var5 + 75 && field957 >= var6 - 20 && field957 <= var6 + 20) {
				field173 = 0;
				method195(field104, field105, false);

				if (field439) {
					return;
				}
			}

			int var7 = field939 / 2 + 80;
			if (field955 == 1 && field956 >= var7 - 75 && field956 <= var7 + 75 && field957 >= var6 - 20 && field957 <= var6 + 20) {
				field139 = 0;
				field104 = "";
				field105 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method403();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field428.length(); var10++) {
					if (var8 == field428.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field510 == 0) {
					if (var8 == 8 && field104.length() > 0) {
						field104 = field104.substring(0, field104.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field510 = 1;
					}

					if (var9) {
						field104 = field104 + (char) var8;
					}

					if (field104.length() > 12) {
						field104 = field104.substring(0, 12);
					}
				} else if (field510 == 1) {
					if (var8 == 8 && field105.length() > 0) {
						field105 = field105.substring(0, field105.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field510 = 0;
					}

					if (var9) {
						field105 = field105 + (char) var8;
					}

					if (field105.length() > 20) {
						field105 = field105.substring(0, 20);
					}
				}
			}
		} else if (field139 == 3) {
			int var11 = field939 / 2;
			int var12 = field940 / 2 + 50;
			var12 += 20;
			if (field955 == 1 && field956 >= var11 - 75 && field956 <= var11 + 75 && field957 >= var12 - 20 && field957 <= var12 + 20) {
				field139 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method109() {
		while (true) {
			GVYJCWHX var1 = field317.method257();
			if (var1 == null) {
				return;
			}

			if (var1.field847 == 0) {
				GFYXEFQY.method339(var1.field846, var1.field848);

				if ((field317.method258(var1.field846) & 0x62) != 0) {
					field366 = true;

					if (field403 != -1) {
						field496 = true;
					}
				}
			}

			if (var1.field847 == 1 && var1.field848 != null) {
				ERVJQNCY.method279(var1.field848);
			}

			if (var1.field847 == 2 && field327 == var1.field846 && var1.field848 != null) {
				method106(field328, var1.field848);
			}

			if (var1.field847 == 3 && field376 == 1) {
				for (int var2 = 0; var2 < field227.length; var2++) {
					if (field454[var2] == var1.field846) {
						field227[var2] = var1.field848;

						if (var1.field848 == null) {
							field454[var2] = -1;
						}

						break;
					}

					if (field455[var2] == var1.field846) {
						field150[var2] = var1.field848;

						if (var1.field848 == null) {
							field455[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field847 == 93 && field317.method275(var1.field846)) {
				BRNLHXCU.method18(new CKBTFRZM(var1.field848), field317);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method110(String arg0) {
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

	@ObfuscatedName("client.b(II)V")
	public final void method111(int arg0) {
		int var2 = DIPZNIAB.field556[arg0].field564;
		if (var2 != 0) {
			int var3 = field336[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					DMXMSPET.method246(0.9D);
				}

				if (var3 == 2) {
					DMXMSPET.method246(0.8D);
				}

				if (var3 == 3) {
					DMXMSPET.method246(0.7D);
				}

				if (var3 == 4) {
					DMXMSPET.method246(0.6D);
				}

				PTCSWKBP.field1126.method3();
				field441 = true;
			}

			if (var2 == 3) {
				boolean var4 = field147;

				if (var3 == 0) {
					method98(0, field147);
					field147 = true;
				}

				if (var3 == 1) {
					method98(-400, field147);
					field147 = true;
				}

				if (var3 == 2) {
					method98(-800, field147);
					field147 = true;
				}

				if (var3 == 3) {
					method98(-1200, field147);
					field147 = true;
				}

				if (var3 == 4) {
					field147 = false;
				}

				if (field147 != var4 && !field226) {
					if (field147) {
						field327 = field326;
						field328 = true;
						field317.method259(2, field327);
					} else {
						method87();
					}

					field129 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field511 = true;
					method90(0);
				}

				if (var3 == 1) {
					field511 = true;
					method90(-400);
				}

				if (var3 == 2) {
					field511 = true;
					method90(-800);
				}

				if (var3 == 3) {
					field511 = true;
					method90(-1200);
				}

				if (var3 == 4) {
					field511 = false;
				}
			}

			if (var2 == 5) {
				field524 = var3;
			}

			if (var2 == 6) {
				field295 = var3;
			}

			if (var2 == 8) {
				field257 = var3;
				field496 = true;
			}

			if (var2 == 9) {
				field247 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IIZI)Z")
	public final boolean method112(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field343.method537(field375, arg2, arg0, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			VCGOMUBN var8 = VCGOMUBN.method568(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1420;
				var10 = var8.field1392;
			} else {
				var9 = var8.field1392;
				var10 = var8.field1420;
			}

			int var11 = var8.field1411;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method180(2, var10, var9, arg0, 0, field477.field1345[0], field477.field1344[0], false, 0, var11, arg2);
		} else {
			method180(2, 0, 0, arg0, var7, field477.field1345[0], field477.field1344[0], false, var6 + 1, 0, arg2);
		}

		field472 = field956;
		field473 = field957;
		field475 = 2;
		field474 = 0;
		return true;
	}

	@ObfuscatedName("client.a(LFDUKJGTQ;I)Z")
	public final boolean method113(FDUKJGTQ arg0) {
		int var2 = arg0.field703;
		if (field369 == 2) {
			if (var2 == 201) {
				field496 = true;
				field408 = 0;
				field507 = true;
				field445 = "";
				field289 = 1;
				field334 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field496 = true;
				field408 = 0;
				field507 = true;
				field445 = "";
				field289 = 2;
				field334 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field157 = 250;
			return true;
		}

		if (var2 == 501) {
			field496 = true;
			field408 = 0;
			field507 = true;
			field445 = "";
			field289 = 4;
			field334 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field496 = true;
			field408 = 0;
			field507 = true;
			field445 = "";
			field289 = 5;
			field334 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field290[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = IDSYSMIG.field908 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= IDSYSMIG.field908) {
							var5 = 0;
						}
					}

					if (!IDSYSMIG.field909[var5].field915 && IDSYSMIG.field909[var5].field910 == var3 + (field397 ? 0 : 7)) {
						break;
					}
				}

				field290[var3] = var5;
				field526 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field262[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field458[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field458[var6].length) {
					var8 = 0;
				}
			}

			field262[var6] = var8;
			field526 = true;
		}

		if (var2 == 324 && !field397) {
			field397 = true;
			method91();
		}

		if (var2 == 325 && field397) {
			field397 = false;
			method91();
		}

		if (var2 == 326) {
			field521.method33(22);
			field521.method34(field397 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field521.method34(field290[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field521.method34(field262[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field431 = !field431;
		}

		if (var2 >= 601 && var2 <= 612) {
			method154();

			if (field512.length() > 0) {
				field521.method33(109);
				field521.method40(IGDXKDJL.method388(field512));
				field521.method34(var2 - 601);
				field521.method34(field431 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method114(long arg0) {
		if (arg0 != 0L) {
			if (field406 >= 100) {
				method181("", "Your ignore list is full. Max of 100 hit", 0);
			} else {
				String var3 = IGDXKDJL.method392(IGDXKDJL.method389(arg0));
				for (int var4 = 0; var4 < field406; var4++) {
					if (field443[var4] == arg0) {
						method181("", var3 + " is already on your ignore list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field368; var5++) {
					if (field451[var5] == arg0) {
						method181("", "Please remove " + var3 + " from your friend list first", 0);
						return;
					}
				}

				field443[field406++] = arg0;
				field366 = true;
				field521.method33(49);
				field521.method40(arg0);
			}
		}
	}

	public final void run() {
		if (field296) {
			method140();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method115() {
		if (field487 || field345 || field446) {
			method192();
		} else {
			field146++;

			if (field439) {
				method162();
			} else {
				method177(false);
			}

			field243 = 0;
		}
	}

	@ObfuscatedName("client.a(IILCKBTFRZM;)V")
	public final void method116(int arg0, CKBTFRZM arg1) {
		field297 = 0;
		field180 = 0;
		method141(arg0, arg1);
		method119(arg1, arg0);
		method134(arg0, arg1);

		for (int var3 = 0; var3 < field297; var3++) {
			int var4 = field298[var3];
			if (field277 != field201[var4].field1329) {
				field201[var4].field1188 = null;
				field201[var4] = null;
			}
		}

		if (arg1.field92 != arg0) {
			signlink.reporterror(field104 + " size mismatch in getnpcpos - pos:" + arg1.field92 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field202; var5++) {
			if (field201[field203[var5]] == null) {
				signlink.reporterror(field104 + " null entry in npc list - pos:" + var5 + " size:" + field202);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method117(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method117(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method118(int arg0) {
		if (arg0 >= 0) {
			if (field408 != 0) {
				field408 = 0;
				field496 = true;
			}

			int var2 = field168[arg0];
			int var3 = field169[arg0];
			int var4 = field170[arg0];
			int var5 = field171[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 665) {
				if (field287) {
					field343.method545(var3 - 4, var2 - 4);
				} else {
					field343.method545(field957 - 4, field956 - 4);
				}
			}

			if (var4 == 933) {
				GPPDQFCV var6 = field177[var5];
				if (var6 != null) {
					method180(2, 1, 1, var6.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var6.field1344[0]);
					field472 = field956;
					field473 = field957;
					field475 = 2;
					field474 = 0;
					field521.method33(241);
					field521.method68(var5);
				}
			}

			if (var4 == 53) {
				boolean var7 = method180(2, 0, 0, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
				if (!var7) {
					method180(2, 1, 1, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
				}

				field472 = field956;
				field473 = field957;
				field475 = 2;
				field474 = 0;
				field521.method33(200);
				field521.method69(var5);
				field521.method70(field469 + var3);
				field521.method69(field468 + var2);
				field521.method68(field489);
			}

			if (var4 == 303) {
				GPPDQFCV var9 = field177[var5];
				if (var9 != null) {
					method180(2, 1, 1, var9.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var9.field1344[0]);
					field472 = field956;
					field473 = field957;
					field475 = 2;
					field474 = 0;
					field521.method33(164);
					field521.method70(var5);
				}
			}

			if (var4 == 586) {
				field521.method33(117);
				field521.method35(var3);
				FDUKJGTQ var10 = FDUKJGTQ.field705[var3];
				if (var10.field684 != null && var10.field684[0][0] == 5) {
					int var11 = var10.field684[0][1];
					if (field336[var11] != var10.field718[0]) {
						field336[var11] = var10.field718[0];
						method111(var11);
						field366 = true;
					}
				}
			}

			if (var4 == 672) {
				field521.method33(84);
				field521.method70(var5);
				field521.method68(var3);
				field521.method68(var2);
				field339 = 0;
				field340 = var3;
				field341 = var2;
				field342 = 2;
				if (FDUKJGTQ.field705[var3].field715 == field219) {
					field342 = 1;
				}

				if (FDUKJGTQ.field705[var3].field715 == field403) {
					field342 = 3;
				}
			}

			if (var4 == 743) {
				TKXONZKI var12 = field201[var5];
				if (var12 != null) {
					method180(2, 1, 1, var12.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var12.field1344[0]);
					field472 = field956;
					field473 = field957;
					field475 = 2;
					field474 = 0;
					field521.method33(2);
					field521.method68(field489);
					field521.method69(var5);
				}
			}

			if (var4 == 144 || var4 == 84 || var4 == 813 || var4 == 52) {
				String var13 = field293[arg0];
				int var14 = var13.indexOf("@whi@");
				if (var14 != -1) {
					long var15 = IGDXKDJL.method388(var13.substring(var14 + 5).trim());
					if (var4 == 144) {
						method145(var15);
					}

					if (var4 == 84) {
						method114(var15);
					}

					if (var4 == 813) {
						method131(var15);
					}

					if (var4 == 52) {
						method146(var15);
					}
				}
			}

			if (var4 == 994 && !field183) {
				field521.method33(52);
				field521.method35(var3);
				field183 = true;
			}

			if (var4 == 1281) {
				field518 += var5;
				if (field518 >= 130) {
					field521.method33(251);
					field521.method34(16);
					field518 = 0;
				}

				method112(var3, var5, var2);
				field521.method33(123);
				field521.method68(var5 >> 14 & 0x7FFF);
				field521.method70(field469 + var3);
				field521.method70(field468 + var2);
			}

			if (var4 == 710) {
				FDUKJGTQ var17 = FDUKJGTQ.field705[var3];
				boolean var18 = true;
				if (var17.field703 > 0) {
					var18 = method113(var17);
				}

				if (var18) {
					field521.method33(117);
					field521.method35(var3);
				}
			}

			if (var4 == 979) {
				field238 = 1;
				field239 = var2;
				field240 = var3;
				field241 = var5;
				field242 = PTCSWKBP.method489(var5).field1118;
				field488 = 0;
				field366 = true;
			} else {
				if (var4 == 718) {
					GPPDQFCV var19 = field177[var5];
					if (var19 != null) {
						method180(2, 1, 1, var19.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var19.field1344[0]);
						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;
						field521.method33(138);
						field521.method35(var5);
					}
				}

				if (var4 == 903) {
					field521.method33(117);
					field521.method35(var3);
					FDUKJGTQ var20 = FDUKJGTQ.field705[var3];
					if (var20.field684 != null && var20.field684[0][0] == 5) {
						int var21 = var20.field684[0][1];
						field336[var21] = 1 - field336[var21];
						method111(var21);
						field366 = true;
					}
				}

				if (var4 == 736) {
					TKXONZKI var22 = field201[var5];
					if (var22 != null) {
						method180(2, 1, 1, var22.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var22.field1344[0]);
						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;
						field521.method33(16);
						field521.method70(var5);
					}
				}

				if (var4 == 1685) {
					PTCSWKBP var23 = PTCSWKBP.method489(var5);
					String var24;
					if (var23.field1123 == null) {
						var24 = "It's a " + var23.field1118 + ".";
					} else {
						var24 = new String(var23.field1123);
					}

					method181("", var24, 0);
				}

				if (var4 == 1072) {
					TKXONZKI var25 = field201[var5];
					if (var25 != null) {
						BXXPAJNW var26 = var25.field1188;
						if (var26.field69 != null) {
							var26 = var26.method27();
						}

						if (var26 != null) {
							String var27;
							if (var26.field66 == null) {
								var27 = "It's a " + var26.field83 + ".";
							} else {
								var27 = new String(var26.field66);
							}

							method181("", var27, 0);
						}
					}
				}

				if (var4 == 454) {
					field521.method33(126);
					field521.method35(var3);
					field521.method70(var2);
					field521.method35(var5);
					field339 = 0;
					field340 = var3;
					field341 = var2;
					field342 = 2;
					if (FDUKJGTQ.field705[var3].field715 == field219) {
						field342 = 1;
					}

					if (FDUKJGTQ.field705[var3].field715 == field403) {
						field342 = 3;
					}
				}

				if (var4 == 529) {
					GPPDQFCV var28 = field177[var5];
					if (var28 != null) {
						method180(2, 1, 1, var28.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var28.field1344[0]);
						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;
						field521.method33(44);
						field521.method68(var5);
					}
				}

				if (var4 == 832 || var4 == 105) {
					String var29 = field293[arg0];
					int var30 = var29.indexOf("@whi@");
					if (var30 != -1) {
						var29 = var29.substring(var30 + 5).trim();
						String var31 = IGDXKDJL.method392(IGDXKDJL.method389(IGDXKDJL.method388(var29)));
						boolean var32 = false;
						for (int var33 = 0; var33 < field178; var33++) {
							GPPDQFCV var34 = field177[field179[var33]];
							if (var34 != null && var34.field839 != null && var34.field839.equalsIgnoreCase(var31)) {
								method180(2, 1, 1, var34.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var34.field1344[0]);

								if (var4 == 832) {
									field521.method33(138);
									field521.method35(field179[var33]);
								}

								if (var4 == 105) {
									field521.method33(164);
									field521.method70(field179[var33]);
								}

								var32 = true;
								break;
							}
						}

						if (!var32) {
							method181("", "Unable to find " + var31, 0);
						}
					}
				}

				if (var4 == 175) {
					FDUKJGTQ var35 = FDUKJGTQ.field705[var3];
					field488 = 1;
					field489 = var3;
					field490 = var35.field687;
					field238 = 0;
					field366 = true;
					String var36 = var35.field720;
					if (var36.indexOf(" ") != -1) {
						var36 = var36.substring(0, var36.indexOf(" "));
					}

					String var37 = var35.field720;
					if (var37.indexOf(" ") != -1) {
						var37 = var37.substring(var37.indexOf(" ") + 1);
					}

					field491 = var36 + " " + var35.field714 + " " + var37;

					if (field490 == 16) {
						field366 = true;
						field131 = 3;
						field437 = true;
					}
				} else {
					if (var4 == 247) {
						boolean var38 = method180(2, 0, 0, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						if (!var38) {
							method180(2, 1, 1, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						}

						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;
						field521.method33(159);
						field521.method35(field469 + var3);
						field521.method69(var5);
						field521.method35(field468 + var2);
					}

					if (var4 == 776) {
						GPPDQFCV var40 = field177[var5];
						if (var40 != null) {
							method180(2, 1, 1, var40.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var40.field1344[0]);
							field472 = field956;
							field473 = field957;
							field475 = 2;
							field474 = 0;
							field521.method33(242);
							field521.method35(field489);
							field521.method70(var5);
						}
					}

					if (var4 == 392 && method112(var3, var5, var2)) {
						field521.method33(53);
						field521.method35(field469 + var3);
						field521.method70(var5 >> 14 & 0x7FFF);
						field521.method69(field468 + var2);
						field521.method68(field489);
					}

					if (var4 == 306) {
						field367 += var5;
						if (field367 >= 118) {
							field521.method33(163);
							field521.method37(0x5D2CC1);
							field367 = 0;
						}

						field521.method33(20);
						field521.method69(var3);
						field521.method69(var2);
						field521.method35(var5);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 877) {
						boolean var41 = method180(2, 0, 0, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						if (!var41) {
							method180(2, 1, 1, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						}

						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;
						field521.method33(216);
						field521.method70(var5);
						field521.method68(field468 + var2);
						field521.method68(field469 + var3);
					}

					if (var4 == 210) {
						String var43 = field293[arg0];
						int var44 = var43.indexOf("@whi@");
						if (var44 != -1) {
							long var45 = IGDXKDJL.method388(var43.substring(var44 + 5).trim());
							int var47 = -1;
							for (int var48 = 0; var48 < field368; var48++) {
								if (field451[var48] == var45) {
									var47 = var48;
									break;
								}
							}

							if (var47 != -1 && field436[var47] > 0) {
								field496 = true;
								field408 = 0;
								field507 = true;
								field445 = "";
								field289 = 3;
								field220 = field451[var47];
								field334 = "Enter message to send to " + field283[var47];
							}
						}
					}

					if (var4 == 186) {
						TKXONZKI var49 = field201[var5];
						if (var49 != null) {
							method180(2, 1, 1, var49.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var49.field1344[0]);
							field472 = field956;
							field473 = field957;
							field475 = 2;
							field474 = 0;
							field521.method33(172);
							field521.method68(field241);
							field521.method69(var5);
							field521.method70(field240);
							field521.method70(field239);
						}
					}

					if (var4 == 507) {
						boolean var50 = method180(2, 0, 0, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						if (!var50) {
							method180(2, 1, 1, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						}

						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;
						field521.method33(217);
						field521.method69(field469 + var3);
						field521.method70(var5);
						field521.method70(field241);
						field521.method35(field240);
						field521.method69(field468 + var2);
						field521.method68(field239);
					}

					if (var4 == 97) {
						method112(var3, var5, var2);
						field521.method33(203);
						field521.method35(var5 >> 14 & 0x7FFF);
						field521.method70(field468 + var2);
						field521.method35(field469 + var3);
					}

					if (var4 == 1435) {
						PTCSWKBP var52 = PTCSWKBP.method489(var5);
						FDUKJGTQ var53 = FDUKJGTQ.field705[var3];
						String var54;
						if (var53 != null && var53.field708[var2] >= 100000) {
							var54 = var53.field708[var2] + " x " + var52.field1118;
						} else if (var52.field1123 == null) {
							var54 = "It's a " + var52.field1118 + ".";
						} else {
							var54 = new String(var52.field1123);
						}

						method181("", var54, 0);
					}

					if (var4 == 683) {
						field521.method33(76);
						field521.method68(var2);
						field521.method70(var3);
						field521.method69(field241);
						field521.method68(var5);
						field521.method68(field239);
						field521.method35(field240);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 614) {
						GPPDQFCV var55 = field177[var5];
						if (var55 != null) {
							method180(2, 1, 1, var55.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var55.field1344[0]);
							field472 = field956;
							field473 = field957;
							field475 = 2;
							field474 = 0;
							field521.method33(33);
							field521.method70(field241);
							field521.method68(field239);
							field521.method70(var5);
							field521.method70(field240);
						}
					}

					if (var4 == 860) {
						TKXONZKI var56 = field201[var5];
						if (var56 != null) {
							method180(2, 1, 1, var56.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var56.field1344[0]);
							field472 = field956;
							field473 = field957;
							field475 = 2;
							field474 = 0;
							field521.method33(185);
							field521.method69(var5);
						}
					}

					if (var4 == 782 && method112(var3, var5, var2)) {
						field521.method33(38);
						field521.method68(field239);
						field521.method70(var5 >> 14 & 0x7FFF);
						field521.method35(field240);
						field521.method70(field468 + var2);
						field521.method68(field241);
						field521.method70(field469 + var3);
					}

					if (var4 == 848) {
						if ((var3 & 0x3) == 0) {
							field249++;
						}

						if (field249 >= 71) {
							field521.method33(115);
							field521.method35(52081);
							field249 = 0;
						}

						field521.method33(91);
						field521.method69(var3);
						field521.method69(var5);
						field521.method68(var2);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 215) {
						boolean var57 = method180(2, 0, 0, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						if (!var57) {
							method180(2, 1, 1, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						}

						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;

						if ((var3 & 0x3) == 0) {
							field127++;
						}

						if (field127 >= 78) {
							field521.method33(148);
							field521.method35(30493);
							field127 = 0;
						}

						field521.method33(83);
						field521.method70(var5);
						field521.method68(field469 + var3);
						field521.method70(field468 + var2);
					}

					if (var4 == 1431) {
						int var59 = var5 >> 14 & 0x7FFF;
						VCGOMUBN var60 = VCGOMUBN.method568(var59);
						String var61;
						if (var60.field1416 == null) {
							var61 = "It's a " + var60.field1403 + ".";
						} else {
							var61 = new String(var60.field1416);
						}

						method181("", var61, 0);
					}

					if (var4 == 717) {
						method112(var3, var5, var2);
						field521.method33(59);
						field521.method70(field468 + var2);
						field521.method70(var5 >> 14 & 0x7FFF);
						field521.method35(field469 + var3);
					}

					if (var4 == 781) {
						TKXONZKI var62 = field201[var5];
						if (var62 != null) {
							method180(2, 1, 1, var62.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var62.field1344[0]);
							field472 = field956;
							field473 = field957;
							field475 = 2;
							field474 = 0;
							field286 += var5;
							if (field286 >= 88) {
								field521.method33(68);
								field521.method35(23699);
								field286 = 0;
							}

							field521.method33(30);
							field521.method35(var5);
						}
					}

					if (var4 == 346) {
						field427 += field468;
						if (field427 >= 119) {
							field521.method33(183);
							field427 = 0;
						}

						method112(var3, var5, var2);
						field521.method33(80);
						field521.method68(field469 + var3);
						field521.method68(var5 >> 14 & 0x7FFF);
						field521.method68(field468 + var2);
					}

					if (var4 == 808) {
						field521.method33(96);
						field521.method70(var3);
						field521.method35(var5);
						field521.method70(var2);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 152) {
						String var63 = field293[arg0];
						int var64 = var63.indexOf("@whi@");
						if (var64 != -1) {
							if (field219 == -1) {
								method154();
								field512 = var63.substring(var64 + 5).trim();
								field431 = false;

								for (int var65 = 0; var65 < FDUKJGTQ.field705.length; var65++) {
									if (FDUKJGTQ.field705[var65] != null && FDUKJGTQ.field705[var65].field703 == 600) {
										field109 = field219 = FDUKJGTQ.field705[var65].field715;
										break;
									}
								}
							} else {
								method181("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}

					if (var4 == 365) {
						field521.method33(32);
						field521.method35(var3);
						field521.method69(var5);
						field521.method70(var2);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 51) {
						method112(var3, var5, var2);
						field521.method33(19);
						field521.method70(field469 + var3);
						field521.method69(field468 + var2);
						field521.method69(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 246) {
						boolean var66 = method180(2, 0, 0, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						if (!var66) {
							method180(2, 1, 1, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						}

						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;
						field521.method33(78);
						field521.method70(field469 + var3);
						field521.method68(var5);
						field521.method70(field468 + var2);
					}

					if (var4 == 881) {
						field521.method33(235);
						field521.method35(var2);
						field521.method68(var3);
						field521.method68(var5);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 321) {
						boolean var68 = method180(2, 0, 0, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						if (!var68) {
							method180(2, 1, 1, var3, 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var2);
						}

						field472 = field956;
						field473 = field957;
						field475 = 2;
						field474 = 0;
						field522++;
						if (field522 >= 110) {
							field521.method33(169);
							field521.method38(0);
							field522 = 0;
						}

						field521.method33(94);
						field521.method69(var5);
						field521.method68(field468 + var2);
						field521.method70(field469 + var3);
					}

					if (var4 == 657) {
						GPPDQFCV var70 = field177[var5];
						if (var70 != null) {
							method180(2, 1, 1, var70.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var70.field1344[0]);
							field472 = field956;
							field473 = field957;
							field475 = 2;
							field474 = 0;
							field521.method33(5);
							field521.method35(var5);
						}
					}

					if (var4 == 894) {
						field521.method33(166);
						field521.method68(var2);
						field521.method35(var3);
						field521.method70(var5);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 602) {
						field521.method33(140);
						field521.method68(var2);
						field521.method70(var3);
						field521.method70(var5);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 161) {
						TKXONZKI var71 = field201[var5];
						if (var71 != null) {
							method180(2, 1, 1, var71.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var71.field1344[0]);
							field472 = field956;
							field473 = field957;
							field475 = 2;
							field474 = 0;
							field521.method33(93);
							field521.method69(var5);
						}
					}

					if (var4 == 883) {
						method154();
					}

					if (var4 == 369) {
						field521.method33(165);
						field521.method68(var3);
						field521.method68(var2);
						field521.method70(var5);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 374) {
						field521.method33(73);
						field521.method69(var2);
						field521.method70(var3);
						field521.method70(var5);
						field521.method69(field489);
						field339 = 0;
						field340 = var3;
						field341 = var2;
						field342 = 2;
						if (FDUKJGTQ.field705[var3].field715 == field219) {
							field342 = 1;
						}

						if (FDUKJGTQ.field705[var3].field715 == field403) {
							field342 = 3;
						}
					}

					if (var4 == 22) {
						TKXONZKI var72 = field201[var5];
						if (var72 != null) {
							method180(2, 1, 1, var72.field1345[0], 0, field477.field1345[0], field477.field1344[0], false, 0, 0, var72.field1344[0]);
							field472 = field956;
							field473 = field957;
							field475 = 2;
							field474 = 0;
							field521.method33(233);
							field521.method69(var5);
						}
					}

					field238 = 0;
					field488 = 0;
					field366 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LCKBTFRZM;II)V")
	public final void method119(CKBTFRZM arg0, int arg1) {
		while (arg0.field93 + 21 < arg1 * 8) {
			int var3 = arg0.method55(14);
			if (var3 == 16383) {
				break;
			}

			if (field201[var3] == null) {
				field201[var3] = new TKXONZKI();
			}

			TKXONZKI var4 = field201[var3];
			field203[field202++] = var3;
			var4.field1329 = field277;
			int var5 = arg0.method55(1);
			if (var5 == 1) {
				field181[field180++] = var3;
			}

			var4.field1188 = BXXPAJNW.method31(arg0.method55(12));
			int var6 = arg0.method55(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.method55(1);
			int var8 = arg0.method55(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1319 = var4.field1188.field77;
			var4.field1305 = var4.field1188.field74;
			var4.field1353 = var4.field1188.field65;
			var4.field1354 = var4.field1188.field56;
			var4.field1355 = var4.field1188.field68;
			var4.field1356 = var4.field1188.field76;
			var4.field1303 = var4.field1188.field63;
			var4.method559(field477.field1345[0] + var8, field477.field1344[0] + var6, var7 == 1);
		}

		arg0.method56();
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method120(int arg0) {
		int[] var2 = field281.field999;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field461[arg0][var7][var5] & 0x18) == 0) {
					field343.method542(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field461[arg0 + 1][var7][var5] & 0x8) != 0) {
					field343.method542(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field281.method424();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field461[arg0][var11][var10] & 0x18) == 0) {
					method148(var11, arg0, var8, var9, var10);
				}

				if (arg0 < 3 && (field461[arg0 + 1][var11][var10] & 0x8) != 0) {
					method148(var11, arg0 + 1, var8, var9, var10);
				}
			}
		}

		field191.method289();
		field106 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field343.method536(field375, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = VCGOMUBN.method568(var14).field1391;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field294[field375].field1092;
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

						field424[field106] = field118[var15];
						field107[field106] = var16;
						field108[field106] = var17;
						field106++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method121() {
		for (int var1 = 0; var1 < field254; var1++) {
			if (field143[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field476[var1] != field312 || field407[var1] != field184) {
						CKBTFRZM var3 = PKMPUSCK.method483(field407[var1], field476[var1]);
						if (System.currentTimeMillis() + var3.field92 / 22 > field435 / 22 + field278) {
							field435 = var3.field92;
							field278 = System.currentTimeMillis();

							if (method221(var3.field92, var3.field91)) {
								field312 = field476[var1];
								field184 = field407[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method166()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field143[var1] != -5) {
					field143[var1] = -5;
				} else {
					field254--;
					for (int var5 = var1; var5 < field254; var5++) {
						field476[var5] = field476[var5 + 1];
						field407[var5] = field407[var5 + 1];
						field143[var5] = field143[var5 + 1];
					}

					var1--;
				}
			} else {
				field143[var1]--;
			}
		}

		if (field129 > 0) {
			field129 -= 20;
			if (field129 < 0) {
				field129 = 0;
			}

			if (field129 == 0 && field147 && !field226) {
				field327 = field326;
				field328 = true;
				field317.method259(2, field327);
				return;
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method122() {
		field189.method289();
		DMXMSPET.field581 = field197;
		field251.method442(0, 0);

		if (field405 != -1) {
			method215(0, FDUKJGTQ.field705[field405], 0, 0);
		} else if (field350[field131] != -1) {
			method215(0, FDUKJGTQ.field705[field350[field131]], 0, 0);
		}

		if (field287 && field384 == 1) {
			method97();
		}

		field189.method290(205, 553, field941);
		field191.method289();
		DMXMSPET.field581 = field198;
	}

	@ObfuscatedName("client.a(ILCKBTFRZM;B)V")
	public final void method123(int arg0, CKBTFRZM arg1) {
		for (int var3 = 0; var3 < field180; var3++) {
			int var4 = field181[var3];
			GPPDQFCV var5 = field177[var4];
			int var6 = arg1.method44();
			if ((var6 & 0x10) != 0) {
				var6 += arg1.method44() << 8;
			}

			method183(arg1, var4, var6, var5);
		}
	}

	@ObfuscatedName("client.a(IIB)V")
	public final void method124(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field306[var4] != null) {
				int var5 = field304[var4];
				int var6 = field120 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field305[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field466 == 0 || field466 == 1 && method219(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field477.field839)) {
						if (field194 >= 1) {
							field293[field264] = "Report abuse @whi@" + var7;
							field170[field264] = 152;
							field264++;
						}

						field293[field264] = "Add ignore @whi@" + var7;
						field170[field264] = 84;
						field264++;
						field293[field264] = "Add friend @whi@" + var7;
						field170[field264] = 144;
						field264++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field257 == 0 && (var5 == 7 || field291 == 0 || field291 == 1 && method219(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field194 >= 1) {
							field293[field264] = "Report abuse @whi@" + var7;
							field170[field264] = 152;
							field264++;
						}

						field293[field264] = "Add ignore @whi@" + var7;
						field170[field264] = 84;
						field264++;
						field293[field264] = "Add friend @whi@" + var7;
						field170[field264] = 144;
						field264++;
					}

					var3++;
				}

				if (var5 == 4 && (field353 == 0 || field353 == 1 && method219(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field293[field264] = "Accept trade @whi@" + var7;
						field170[field264] = 832;
						field264++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field257 == 0 && field291 < 2) {
					var3++;
				}

				if (var5 == 8 && (field353 == 0 || field353 == 1 && method219(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field293[field264] = "Accept challenge @whi@" + var7;
						field170[field264] = 105;
						field264++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)Ljava/lang/String;")
	public final String method125() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field944 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.i(Z)V")
	public static final void method126() {
		UGKPKMOJ.field1222 = true;
		DMXMSPET.field570 = true;
		field226 = true;
		BRNLHXCU.field54 = true;
		VCGOMUBN.field1421 = true;
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method127(boolean arg0) {
		if (field477.field1347 >> 7 == field279 && field477.field1348 >> 7 == field280) {
			field279 = 0;
		}

		int var2 = field178;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			GPPDQFCV var4;
			int var5;
			if (arg0) {
				var4 = field477;
				var5 = field176 << 14;
			} else {
				var4 = field177[field179[var3]];
				var5 = field179[var3] << 14;
			}

			if (var4 != null && var4.method368()) {
				var4.field830 = false;
				if ((field226 && field178 > 50 || field178 > 200) && !arg0 && var4.field1350 == var4.field1303) {
					var4.field830 = true;
				}

				int var6 = var4.field1347 >> 7;
				int var7 = var4.field1348 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field835 == null || field277 < var4.field842 || field277 >= var4.field843) {
						if ((var4.field1347 & 0x7F) == 0x40 && (var4.field1348 & 0x7F) == 0x40) {
							if (field351[var6][var7] == field457) {
								continue;
							}

							field351[var6][var7] = field457;
						}

						var4.field828 = method194(field375, var4.field1347, var4.field1348);
						field343.method518(var4.field1302, 60, var4, var4.field1349, var5, var4.field1347, field375, var4.field1348, var4.field828);
					} else {
						var4.field830 = false;
						var4.field828 = method194(field375, var4.field1347, var4.field1348);
						field343.method519(var4.field1349, var5, var4.field825, var4.field1348, var4.field823, var4.field826, var4, var4.field828, field375, 60, var4.field1347, var4.field824);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(LFDUKJGTQ;I)V")
	public final void method128(FDUKJGTQ arg0) {
		int var2 = arg0.field703;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field369 == 0) {
				arg0.field672 = "Loading friend list";
				arg0.field670 = 0;
			} else if (var2 == 1 && field369 == 1) {
				arg0.field672 = "Connecting to friendserver";
				arg0.field670 = 0;
			} else if (var2 == 2 && field369 != 2) {
				arg0.field672 = "Please wait...";
				arg0.field670 = 0;
			} else {
				int var3 = field368;
				if (field369 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field672 = "";
					arg0.field670 = 0;
				} else {
					arg0.field672 = field283[var2];
					arg0.field670 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field368;
			if (field369 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field672 = "";
				arg0.field670 = 0;
			} else {
				if (field436[var2] == 0) {
					arg0.field672 = "@red@Offline";
				} else if (field436[var2] == field223) {
					arg0.field672 = "@gre@World-" + (field436[var2] - 9);
				} else {
					arg0.field672 = "@yel@World-" + (field436[var2] - 9);
				}

				arg0.field670 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field368;
			if (field369 != 2) {
				var5 = 0;
			}

			arg0.field704 = var5 * 15 + 20;
			if (arg0.field704 <= arg0.field713) {
				arg0.field704 = arg0.field713 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field369 == 0) {
				arg0.field672 = "Loading ignore list";
				arg0.field670 = 0;
			} else if (var2 == 1 && field369 == 0) {
				arg0.field672 = "Please wait...";
				arg0.field670 = 0;
			} else {
				int var6 = field406;
				if (field369 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field672 = "";
					arg0.field670 = 0;
				} else {
					arg0.field672 = IGDXKDJL.method392(IGDXKDJL.method389(field443[var2]));
					arg0.field670 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field704 = field406 * 15 + 20;
			if (arg0.field704 <= arg0.field713) {
				arg0.field704 = arg0.field713 + 1;
			}
		} else if (var2 == 327) {
			arg0.field682 = 150;
			arg0.field683 = (int) (Math.sin(field277 / 40.0D) * 256.0D) & 0x7FF;

			if (field526) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field290[var7];
					if (var8 >= 0 && !IDSYSMIG.field909[var8].method384()) {
						return;
					}
				}

				field526 = false;
				GFYXEFQY[] var9 = new GFYXEFQY[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field290[var11];
					if (var12 >= 0) {
						var9[var10++] = IDSYSMIG.field909[var12].method385();
					}
				}

				GFYXEFQY var13 = new GFYXEFQY(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field262[var14] != 0) {
						var13.method355(field458[var14][0], field458[var14][field262[var14]]);

						if (var14 == 1) {
							var13.method355(field352[0], field352[field262[var14]]);
						}
					}
				}

				var13.method348();
				var13.method349(KIRTNGZJ.field1015[field477.field1303].field1017[0]);
				var13.method358(64, 850, -30, -50, -30, true);
				arg0.field679 = 5;
				arg0.field680 = 0;
				FDUKJGTQ.method284(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field187 == null) {
				field187 = arg0.field698;
				field188 = arg0.field692;
			}

			if (field397) {
				arg0.field698 = field188;
			} else {
				arg0.field698 = field187;
			}
		} else if (var2 == 325) {
			if (field187 == null) {
				field187 = arg0.field698;
				field188 = arg0.field692;
			}

			if (field397) {
				arg0.field698 = field187;
			} else {
				arg0.field698 = field188;
			}
		} else if (var2 == 600) {
			arg0.field672 = field512;
			if (field277 % 20 < 10) {
				arg0.field672 = arg0.field672 + "|";
			} else {
				arg0.field672 = arg0.field672 + " ";
			}
		} else if (var2 == 613) {
			if (field194 < 1) {
				arg0.field672 = "";
			} else if (field431) {
				arg0.field721 = 0xFF0000;
				arg0.field672 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field721 = 0xFFFFFF;
				arg0.field672 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field145 == 0) {
				arg0.field672 = "";
			} else {
				String var15;
				if (field442 == 0) {
					var15 = "earlier today";
				} else if (field442 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field442 + " days ago";
				}

				arg0.field672 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field377 == 0) {
				arg0.field672 = "0 unread messages";
				arg0.field721 = 0xFFFF00;
			}

			if (field377 == 1) {
				arg0.field672 = "1 unread message";
				arg0.field721 = 0xFF00;
			}

			if (field377 > 1) {
				arg0.field672 = field377 + " unread messages";
				arg0.field721 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field221 == 201) {
				if (field148 == 1) {
					arg0.field672 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field672 = "";
				}
			} else if (field221 == 200) {
				arg0.field672 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field221 == 0) {
					var16 = "Earlier today";
				} else if (field221 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field221 + " days ago";
				}

				arg0.field672 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field221 == 201) {
				if (field148 == 1) {
					arg0.field672 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field672 = "";
				}
			} else if (field221 == 200) {
				arg0.field672 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field672 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field221 == 201) {
				if (field148 == 1) {
					arg0.field672 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field672 = "";
				}
			} else if (field221 == 200) {
				arg0.field672 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field672 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method129(boolean arg0) {
		for (int var2 = 0; var2 < field202; var2++) {
			TKXONZKI var3 = field201[field203[var2]];
			int var4 = (field203[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method368() && var3.field1188.field55 == arg0) {
				int var5 = var3.field1347 >> 7;
				int var6 = var3.field1348 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1319 == 1 && (var3.field1347 & 0x7F) == 0x40 && (var3.field1348 & 0x7F) == 0x40) {
						if (field351[var5][var6] == field457) {
							continue;
						}

						field351[var5][var6] = field457;
					}

					field343.method518(var3.field1302, (var3.field1319 - 1) * 64 + 60, var3, var3.field1349, var4, var3.field1347, field375, var3.field1348, method194(field375, var3.field1347, var3.field1348));
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method130() {
		if (field209 == null) {
			field942 = null;
			field192 = null;
			field190 = null;
			field189 = null;
			field191 = null;
			field318 = null;
			field319 = null;
			field320 = null;
			field212 = new FETXLXVZ(method190(), 128, 265);
			JJXDTORW.method415();
			field213 = new FETXLXVZ(method190(), 128, 265);
			JJXDTORW.method415();
			field209 = new FETXLXVZ(method190(), 509, 171);
			JJXDTORW.method415();
			field210 = new FETXLXVZ(method190(), 360, 132);
			JJXDTORW.method415();
			field211 = new FETXLXVZ(method190(), 360, 200);
			JJXDTORW.method415();
			field214 = new FETXLXVZ(method190(), 202, 238);
			JJXDTORW.method415();
			field215 = new FETXLXVZ(method190(), 203, 238);
			JJXDTORW.method415();
			field216 = new FETXLXVZ(method190(), 74, 94);
			JJXDTORW.method415();
			field217 = new FETXLXVZ(method190(), 75, 94);
			JJXDTORW.method415();

			if (field516 != null) {
				method213();
				method105();
			}

			field441 = true;
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method131(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field368; var3++) {
				if (field451[var3] == arg0) {
					field368--;
					field366 = true;

					for (int var4 = var3; var4 < field368; var4++) {
						field283[var4] = field283[var4 + 1];
						field436[var4] = field436[var4 + 1];
						field451[var4] = field451[var4 + 1];
					}

					field521.method33(62);
					field521.method40(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public static final void method132() {
		UGKPKMOJ.field1222 = false;
		DMXMSPET.field570 = false;
		field226 = false;
		BRNLHXCU.field54 = false;
		VCGOMUBN.field1421 = false;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method133() {
		if (field955 == 1) {
			if (field956 >= 6 && field956 <= 106 && field957 >= 467 && field957 <= 499) {
				field466 = (field466 + 1) % 4;
				field523 = true;
				field496 = true;
				field521.method33(174);
				field521.method34(field466);
				field521.method34(field291);
				field521.method34(field353);
			}

			if (field956 >= 135 && field956 <= 235 && field957 >= 467 && field957 <= 499) {
				field291 = (field291 + 1) % 3;
				field523 = true;
				field496 = true;
				field521.method33(174);
				field521.method34(field466);
				field521.method34(field291);
				field521.method34(field353);
			}

			if (field956 >= 273 && field956 <= 373 && field957 >= 467 && field957 <= 499) {
				field353 = (field353 + 1) % 3;
				field523 = true;
				field496 = true;
				field521.method33(174);
				field521.method34(field466);
				field521.method34(field291);
				field521.method34(field353);
			}

			if (field956 >= 412 && field956 <= 512 && field957 >= 467 && field957 <= 499) {
				if (field219 == -1) {
					method154();
					field512 = "";
					field431 = false;

					for (int var1 = 0; var1 < FDUKJGTQ.field705.length; var1++) {
						if (FDUKJGTQ.field705[var1] != null && FDUKJGTQ.field705[var1].field703 == 600) {
							field109 = field219 = FDUKJGTQ.field705[var1].field715;
							return;
						}
					}

					return;
				}

				method181("", "Please close the interface you have open before using 'report abuse'", 0);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IILCKBTFRZM;)V")
	public final void method134(int arg0, CKBTFRZM arg1) {
		for (int var3 = 0; var3 < field180; var3++) {
			int var4 = field181[var3];
			TKXONZKI var5 = field201[var4];
			int var6 = arg1.method44();
			if ((var6 & 0x4) != 0) {
				int var7 = arg1.method71();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg1.method62();
				if (var5.field1320 == var7 && var7 != -1) {
					int var9 = KIRTNGZJ.field1015[var7].field1029;
					if (var9 == 1) {
						var5.field1321 = 0;
						var5.field1322 = 0;
						var5.field1323 = var8;
						var5.field1324 = 0;
					}

					if (var9 == 2) {
						var5.field1324 = 0;
					}
				} else if (var7 == -1 || var5.field1320 == -1 || KIRTNGZJ.field1015[var7].field1023 >= KIRTNGZJ.field1015[var5.field1320].field1023) {
					var5.field1320 = var7;
					var5.field1321 = 0;
					var5.field1322 = 0;
					var5.field1323 = var8;
					var5.field1324 = 0;
					var5.field1313 = var5.field1336;
				}
			}

			if ((var6 & 0x8) != 0) {
				int var10 = arg1.method62();
				int var11 = arg1.method64();
				var5.method558(var10, var11, field277);
				var5.field1308 = field277 + 300;
				var5.field1309 = arg1.method64();
				var5.field1310 = arg1.method64();
			}

			if ((var6 & 0x40) != 0) {
				var5.field1188 = BXXPAJNW.method31(arg1.method73());
				var5.field1319 = var5.field1188.field77;
				var5.field1305 = var5.field1188.field74;
				var5.field1353 = var5.field1188.field65;
				var5.field1354 = var5.field1188.field56;
				var5.field1355 = var5.field1188.field68;
				var5.field1356 = var5.field1188.field76;
				var5.field1303 = var5.field1188.field63;
			}

			if ((var6 & 0x1) != 0) {
				var5.field1314 = arg1.method72();
				int var12 = arg1.method78();
				var5.field1318 = var12 >> 16;
				var5.field1317 = (var12 & 0xFFFF) + field277;
				var5.field1315 = 0;
				var5.field1316 = 0;

				if (var5.field1317 > field277) {
					var5.field1315 = -1;
				}

				if (var5.field1314 == 0xFFFF) {
					var5.field1314 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				int var13 = arg1.method64();
				int var14 = arg1.method62();
				var5.method558(var13, var14, field277);
				var5.field1308 = field277 + 300;
				var5.field1309 = arg1.method63();
				var5.field1310 = arg1.method62();
			}

			if ((var6 & 0x80) != 0) {
				var5.field1331 = arg1.method72();
				var5.field1332 = arg1.method73();
			}

			if ((var6 & 0x10) != 0) {
				var5.field1330 = arg1.method72();
				if (var5.field1330 == 0xFFFF) {
					var5.field1330 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field1307 = arg1.method51();
				var5.field1335 = 100;
			}
		}
	}

	@ObfuscatedName("client.c(IILCKBTFRZM;)V")
	public final void method135(int arg0, CKBTFRZM arg1) {
		arg1.method54();
		int var3 = arg1.method55(1);
		if (var3 != 0) {
			int var4 = arg1.method55(2);
			if (var4 == 0) {
				field181[field180++] = field176;
			} else if (var4 == 1) {
				int var5 = arg1.method55(3);
				field477.method561(false, var5);
				int var6 = arg1.method55(1);
				if (var6 == 1) {
					field181[field180++] = field176;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method55(3);
				field477.method561(true, var7);
				int var8 = arg1.method55(3);
				field477.method561(true, var8);
				int var9 = arg1.method55(1);
				if (var9 == 1) {
					field181[field180++] = field176;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method55(7);
				int var11 = arg1.method55(1);
				if (var11 == 1) {
					field181[field180++] = field176;
				}

				int var12 = arg1.method55(1);
				field375 = arg1.method55(2);
				int var13 = arg1.method55(7);
				field477.method559(var13, var10, var12 == 1);
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method136() {
		if (!field487 && !field345 && !field446) {
			field277++;

			if (field439) {
				method143();
			} else {
				method108();
			}

			method109();
		}
	}

	@ObfuscatedName("client.a(ILJONKABPT;II)V")
	public final void method137(int arg0, JONKABPT arg1, int arg2) {
		int var4 = field322 + field309 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = GFYXEFQY.field816[var4];
			int var7 = GFYXEFQY.field817[var4];
			var6 = var6 * 256 / (field492 + 256);
			var7 = var7 * 256 / (field492 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method435(field252, var8 + 94 + 4 - arg1.field1004 / 2, 83 - var9 - arg1.field1005 / 2 - 4);
			} else {
				arg1.method429(83 - var9 - arg1.field1005 / 2 - 4, var8 + 94 - arg1.field1004 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method138() {
		for (XGJADJOY var1 = (XGJADJOY) field299.method585(); var1 != null; var1 = (XGJADJOY) field299.method587()) {
			if (field375 != var1.field1466 || var1.field1474) {
				var1.method450();
			} else if (field277 >= var1.field1471) {
				var1.method590(field392);

				if (var1.field1474) {
					var1.method450();
				} else {
					field343.method518(false, 60, var1, 0, -1, var1.field1467, var1.field1466, var1.field1468, var1.field1469);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILCKBTFRZM;Z)V")
	public final void method139(int arg0, CKBTFRZM arg1) {
		if (arg0 == 78) {
			int var3 = arg1.method73();
			int var4 = arg1.method62();
			int var5 = (var4 >> 4 & 0x7) + field425;
			int var6 = (var4 & 0x7) + field426;
			int var7 = arg1.method62();
			int var8 = var7 >> 2;
			int var9 = var7 & 0x3;
			int var10 = field301[var8];
			int var11 = arg1.method46();
			byte var12 = arg1.method65();
			int var13 = arg1.method71();
			byte var14 = arg1.method45();
			byte var15 = arg1.method66();
			int var16 = arg1.method46();
			byte var17 = arg1.method67();
			GPPDQFCV var18;
			if (field337 == var16) {
				var18 = field477;
			} else {
				var18 = field177[var16];
			}

			if (var18 != null) {
				VCGOMUBN var19 = VCGOMUBN.method568(var13);
				int var20 = field151[field375][var5][var6];
				int var21 = field151[field375][var5 + 1][var6];
				int var22 = field151[field375][var5 + 1][var6 + 1];
				int var23 = field151[field375][var5][var6 + 1];
				GFYXEFQY var24 = var19.method569(var8, var9, var20, var21, var22, var23, -1);
				if (var24 != null) {
					method167(var11 + 1, var3 + 1, var10, field375, var6, var5, 0, -1, 0);
					var18.field842 = field277 + var3;
					var18.field843 = field277 + var11;
					var18.field835 = var24;
					int var25 = var19.field1420;
					int var26 = var19.field1392;
					if (var9 == 1 || var9 == 3) {
						var25 = var19.field1392;
						var26 = var19.field1420;
					}

					var18.field832 = var5 * 128 + var25 * 64;
					var18.field834 = var6 * 128 + var26 * 64;
					var18.field833 = method194(field375, var18.field832, var18.field834);

					if (var15 > var17) {
						byte var27 = var15;
						var15 = var17;
						var17 = var27;
					}

					if (var14 > var12) {
						byte var28 = var14;
						var14 = var12;
						var12 = var28;
					}

					var18.field823 = var5 + var15;
					var18.field825 = var5 + var17;
					var18.field824 = var6 + var14;
					var18.field826 = var6 + var12;
				}
			}
		}

		if (arg0 == 219) {
			int var29 = arg1.method71();
			int var30 = arg1.method63();
			int var31 = var30 >> 2;
			int var32 = var30 & 0x3;
			int var33 = field301[var31];
			int var34 = arg1.method63();
			int var35 = (var34 >> 4 & 0x7) + field425;
			int var36 = (var34 & 0x7) + field426;
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				method167(-1, 0, var33, field375, var36, var35, var32, var29, var31);
			}
		} else if (arg0 == 7) {
			int var37 = arg1.method64();
			int var38 = var37 >> 2;
			int var39 = var37 & 0x3;
			int var40 = field301[var38];
			int var41 = arg1.method64();
			int var42 = (var41 >> 4 & 0x7) + field425;
			int var43 = (var41 & 0x7) + field426;
			int var44 = arg1.method73();
			if (var42 >= 0 && var43 >= 0 && var42 < 103 && var43 < 103) {
				int var45 = field151[field375][var42][var43];
				int var46 = field151[field375][var42 + 1][var43];
				int var47 = field151[field375][var42 + 1][var43 + 1];
				int var48 = field151[field375][var42][var43 + 1];
				if (var40 == 0) {
					OLWEODKY var49 = field343.method529(var43, var42, field375);
					if (var49 != null) {
						int var50 = var49.field1086 >> 14 & 0x7FFF;
						if (var38 == 2) {
							var49.field1084 = new MSKEMKWR(var46, var48, var50, var39 + 4, var47, var45, false, var44, 2);
							var49.field1085 = new MSKEMKWR(var46, var48, var50, var39 + 1 & 0x3, var47, var45, false, var44, 2);
						} else {
							var49.field1084 = new MSKEMKWR(var46, var48, var50, var39, var47, var45, false, var44, var38);
						}
					}
				}

				if (var40 == 1) {
					IFDZZUQL var51 = field343.method530(field375, var43, var42);
					if (var51 != null) {
						var51.field921 = new MSKEMKWR(var46, var48, var51.field922 >> 14 & 0x7FFF, 0, var47, var45, false, var44, 4);
					}
				}

				if (var40 == 2) {
					KPIJSAEN var52 = field343.method531(var43, var42, field375);

					if (var38 == 11) {
						var38 = 10;
					}

					if (var52 != null) {
						var52.field1035 = new MSKEMKWR(var46, var48, var52.field1043 >> 14 & 0x7FFF, var39, var47, var45, false, var44, var38);
					}
				}

				if (var40 == 3) {
					UKYRAUGO var53 = field343.method532(var43, field375, var42);
					if (var53 != null) {
						var53.field1360 = new MSKEMKWR(var46, var48, var53.field1361 >> 14 & 0x7FFF, var39, var47, var45, false, var44, 22);
					}
				}
			}
		} else if (arg0 == 90) {
			int var54 = arg1.method63();
			int var55 = (var54 >> 4 & 0x7) + field425;
			int var56 = (var54 & 0x7) + field426;
			int var57 = arg1.method72();
			int var58 = arg1.method72();
			int var59 = arg1.method71();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104 && field337 != var58) {
				TRUVKLSN var60 = new TRUVKLSN();
				var60.field1190 = var59;
				var60.field1189 = var57;

				if (field338[field375][var55][var56] == null) {
					field338[field375][var55][var56] = new WUVIEXOA();
				}

				field338[field375][var55][var56].method582(var60);
				method209(var55, var56);
			}
		} else if (arg0 == 198) {
			int var61 = arg1.method44();
			int var62 = (var61 >> 4 & 0x7) + field425;
			int var63 = (var61 & 0x7) + field426;
			int var64 = arg1.method46();
			int var65 = arg1.method44();
			int var66 = arg1.method46();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
				var62 = var62 * 128 + 64;
				var63 = var63 * 128 + 64;
				XGJADJOY var67 = new XGJADJOY(var66, var64, field277, field375, var62, method194(field375, var62, var63) - var65, var63);
				field299.method582(var67);
			}
		} else if (arg0 == 172) {
			int var68 = arg1.method46();
			int var69 = arg1.method64();
			int var70 = (var69 >> 4 & 0x7) + field425;
			int var71 = (var69 & 0x7) + field426;
			if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
				WUVIEXOA var72 = field338[field375][var70][var71];
				if (var72 != null) {
					for (TRUVKLSN var73 = (TRUVKLSN) var72.method585(); var73 != null; var73 = (TRUVKLSN) var72.method587()) {
						if ((var68 & 0x7FFF) == var73.field1190) {
							var73.method450();
							break;
						}
					}

					if (var72.method585() == null) {
						field338[field375][var70][var71] = null;
					}

					method209(var70, var71);
				}
			}
		} else if (arg0 == 208) {
			int var74 = arg1.method44();
			int var75 = (var74 >> 4 & 0x7) + field425;
			int var76 = (var74 & 0x7) + field426;
			int var77 = var75 + arg1.method45();
			int var78 = var76 + arg1.method45();
			int var79 = arg1.method47();
			int var80 = arg1.method46();
			int var81 = arg1.method44() * 4;
			int var82 = arg1.method44() * 4;
			int var83 = arg1.method46();
			int var84 = arg1.method46();
			int var85 = arg1.method44();
			int var86 = arg1.method44();
			if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104 && var80 != 0xFFFF) {
				var75 = var75 * 128 + 64;
				var76 = var76 * 128 + 64;
				var77 = var77 * 128 + 64;
				var78 = var78 * 128 + 64;
				VJJXMLOH var87 = new VJJXMLOH(var79, var75, method194(field375, var75, var76) - var81, field277 + var84, var82, var80, var85, var76, var86, field277 + var83, field375);
				var87.method576(method194(field375, var77, var78) - var82, var77, var78, field277 + var83);
				field398.method582(var87);
			}
		} else {
			if (arg0 == 192) {
				int var88 = arg1.method44();
				int var89 = (var88 >> 4 & 0x7) + field425;
				int var90 = (var88 & 0x7) + field426;
				int var91 = arg1.method46();
				int var92 = arg1.method44();
				int var93 = var92 >> 4 & 0xF;
				int var94 = var92 & 0x7;
				if (field477.field1344[0] >= var89 - var93 && field477.field1344[0] <= var89 + var93 && field477.field1345[0] >= var90 - var93 && field477.field1345[0] <= var90 + var93 && field511 && !field226 && field254 < 50) {
					field476[field254] = var91;
					field407[field254] = var94;
					field143[field254] = PKMPUSCK.field1112[var91];
					field254++;
				}
			}

			if (arg0 == 182) {
				int var95 = arg1.method64();
				int var96 = var95 >> 2;
				int var97 = var95 & 0x3;
				int var98 = field301[var96];
				int var99 = arg1.method44();
				int var100 = (var99 >> 4 & 0x7) + field425;
				int var101 = (var99 & 0x7) + field426;
				if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
					method167(-1, 0, var98, field375, var101, var100, var97, -1, var96);
				}
			} else if (arg0 == 241) {
				int var102 = arg1.method62();
				int var103 = (var102 >> 4 & 0x7) + field425;
				int var104 = (var102 & 0x7) + field426;
				int var105 = arg1.method46();
				int var106 = arg1.method72();
				if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
					TRUVKLSN var107 = new TRUVKLSN();
					var107.field1190 = var105;
					var107.field1189 = var106;

					if (field338[field375][var103][var104] == null) {
						field338[field375][var103][var104] = new WUVIEXOA();
					}

					field338[field375][var103][var104].method582(var107);
					method209(var103, var104);
				}
			} else if (arg0 == 76) {
				int var108 = arg1.method44();
				int var109 = (var108 >> 4 & 0x7) + field425;
				int var110 = (var108 & 0x7) + field426;
				int var111 = arg1.method46();
				int var112 = arg1.method46();
				int var113 = arg1.method46();
				if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
					WUVIEXOA var114 = field338[field375][var109][var110];
					if (var114 != null) {
						for (TRUVKLSN var115 = (TRUVKLSN) var114.method585(); var115 != null; var115 = (TRUVKLSN) var114.method587()) {
							if ((var111 & 0x7FFF) == var115.field1190 && var115.field1189 == var112) {
								var115.field1189 = var113;
								break;
							}
						}

						method209(var109, var110);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method140() {
		field438 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field311) {
				field130++;
				method191();
				method191();
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

		field438 = false;
	}

	@ObfuscatedName("client.a(ZILCKBTFRZM;)V")
	public final void method141(int arg0, CKBTFRZM arg1) {
		arg1.method54();
		int var3 = arg1.method55(8);
		if (var3 < field202) {
			for (int var4 = var3; var4 < field202; var4++) {
				field298[field297++] = field203[var4];
			}
		}

		if (var3 > field202) {
			signlink.reporterror(field104 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field202 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field203[var5];
			TKXONZKI var7 = field201[var6];
			int var8 = arg1.method55(1);
			if (var8 == 0) {
				field203[field202++] = var6;
				var7.field1329 = field277;
			} else {
				int var9 = arg1.method55(2);
				if (var9 == 0) {
					field203[field202++] = var6;
					var7.field1329 = field277;
					field181[field180++] = var6;
				} else if (var9 == 1) {
					field203[field202++] = var6;
					var7.field1329 = field277;
					int var10 = arg1.method55(3);
					var7.method561(false, var10);
					int var11 = arg1.method55(1);
					if (var11 == 1) {
						field181[field180++] = var6;
					}
				} else if (var9 == 2) {
					field203[field202++] = var6;
					var7.field1329 = field277;
					int var12 = arg1.method55(3);
					var7.method561(true, var12);
					int var13 = arg1.method55(3);
					var7.method561(true, var13);
					int var14 = arg1.method55(1);
					if (var14 == 1) {
						field181[field180++] = var6;
					}
				} else if (var9 == 3) {
					field298[field297++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILBXXPAJNW;II)V")
	public final void method142(int arg0, BXXPAJNW arg1, int arg2, int arg3) {
		if (field264 < 400) {
			if (arg1.field69 != null) {
				arg1 = arg1.method27();
			}

			if (arg1 != null) {
				String var5 = arg1.field83;
				if (arg1.field67 != 0) {
					var5 = var5 + method223(field477.field829, arg1.field67) + " (level-" + arg1.field67 + ")";
				}

				if (field238 == 1) {
					field293[field264] = "Use " + field242 + " with @yel@" + var5;
					field170[field264] = 186;
					field171[field264] = arg2;
					field168[field264] = arg3;
					field169[field264] = arg0;
					field264++;
				} else if (field488 != 1) {
					if (arg1.field57 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field57[var6] != null && !arg1.field57[var6].equalsIgnoreCase("attack")) {
								field293[field264] = arg1.field57[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field170[field264] = 781;
								}

								if (var6 == 1) {
									field170[field264] = 860;
								}

								if (var6 == 2) {
									field170[field264] = 161;
								}

								if (var6 == 3) {
									field170[field264] = 22;
								}

								if (var6 == 4) {
									field170[field264] = 736;
								}

								field171[field264] = arg2;
								field168[field264] = arg3;
								field169[field264] = arg0;
								field264++;
							}
						}
					}

					if (arg1.field57 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field57[var7] != null && arg1.field57[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field67 > field477.field829) {
									var8 = 2000;
								}

								field293[field264] = arg1.field57[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field170[field264] = var8 + 781;
								}

								if (var7 == 1) {
									field170[field264] = var8 + 860;
								}

								if (var7 == 2) {
									field170[field264] = var8 + 161;
								}

								if (var7 == 3) {
									field170[field264] = var8 + 22;
								}

								if (var7 == 4) {
									field170[field264] = var8 + 736;
								}

								field171[field264] = arg2;
								field168[field264] = arg3;
								field169[field264] = arg0;
								field264++;
							}
						}
					}

					field293[field264] = "Examine @yel@" + var5;
					field170[field264] = 1072;
					field171[field264] = arg2;
					field168[field264] = arg3;
					field169[field264] = arg0;
					field264++;
				} else if ((field490 & 0x2) == 2) {
					field293[field264] = field491 + " @yel@" + var5;
					field170[field264] = 743;
					field171[field264] = arg2;
					field168[field264] = arg3;
					field169[field264] = arg0;
					field264++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method143() {
		if (field195 > 1) {
			field195--;
		}

		if (field157 > 0) {
			field157--;
		}

		for (int var1 = 0; var1 < 5 && method152(); var1++) {
		}

		if (field439) {
			synchronized (field325.field1195) {
				if (!field378) {
					field325.field1193 = 0;
				} else if (field955 != 0 || field325.field1193 >= 40) {
					field521.method33(129);
					field521.method34(0);
					int var3 = field521.field92;
					int var4 = 0;
					for (int var5 = 0; var5 < field325.field1193 && var3 - field521.field92 < 240; var5++) {
						var4++;
						int var6 = field325.field1194[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field325.field1192[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field325.field1194[var5] == -1 && field325.field1192[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field135 != var7 || field136 != var6) {
							int var9 = var7 - field135;
							field135 = var7;
							int var10 = var6 - field136;
							field136 = var6;

							if (field374 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field521.method35((field374 << 12) + (var9 << 6) + var10);
								field374 = 0;
							} else if (field374 < 8) {
								field521.method37((field374 << 19) + var8 + 0x800000);
								field374 = 0;
							} else {
								field521.method38((field374 << 19) + var8 - 0x40000000);
								field374 = 0;
							}
						} else if (field374 < 2047) {
							field374++;
						}
					}

					field521.method43(field521.field92 - var3);

					if (var4 >= field325.field1193) {
						field325.field1193 = 0;
					} else {
						field325.field1193 -= var4;
						for (int var11 = 0; var11 < field325.field1193; var11++) {
							field325.field1192[var11] = field325.field1192[var4 + var11];
							field325.field1194[var11] = field325.field1194[var4 + var11];
						}
					}
				}
			}

			if (field955 != 0) {
				long var12 = (field958 - field303) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field303 = field958;
				int var14 = field957;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field956;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field955 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field521.method33(57);
				field521.method77((var17 << 19) + (var18 << 20) + var16);
			}

			if (field395 > 0) {
				field395--;
			}

			if (field959[1] == 1 || field959[2] == 1 || field959[3] == 1 || field959[4] == 1) {
				field396 = true;
			}

			if (field396 && field395 <= 0) {
				field395 = 20;
				field396 = false;
				field521.method33(187);
				field521.method68(field321);
				field521.method69(field322);
			}

			if (field946 && !field364) {
				field364 = true;
				field521.method33(186);
				field521.method34(1);
			}

			if (!field946 && field364) {
				field364 = false;
				field521.method33(186);
				field521.method34(0);
			}

			method207();
			method153();
			method121();
			field155++;
			if (field155 > 750) {
				method92();
			}

			method96();
			method155();
			method178();
			field392++;

			if (field475 != 0) {
				field474 += 20;
				if (field474 >= 400) {
					field475 = 0;
				}
			}

			if (field342 != 0) {
				field339++;
				if (field339 >= 15) {
					if (field342 == 2) {
						field366 = true;
					}

					if (field342 == 3) {
						field496 = true;
					}

					field342 = 0;
				}
			}

			if (field360 != 0) {
				field167++;

				if (field949 > field361 + 5 || field949 < field361 - 5 || field950 > field362 + 5 || field950 < field362 - 5) {
					field246 = true;
				}

				if (field948 == 0) {
					if (field360 == 2) {
						field366 = true;
					}

					if (field360 == 3) {
						field496 = true;
					}

					field360 = 0;

					if (field246 && field167 >= 5) {
						field373 = -1;
						method85();

						if (field373 == field358 && field372 != field359) {
							FDUKJGTQ var19 = FDUKJGTQ.field705[field358];
							byte var20 = 0;
							if (field247 == 1 && var19.field703 == 206) {
								var20 = 1;
							}

							if (var19.field711[field372] <= 0) {
								var20 = 0;
							}

							if (var19.field722) {
								int var21 = field359;
								int var22 = field372;
								var19.field711[var22] = var19.field711[var21];
								var19.field708[var22] = var19.field708[var21];
								var19.field711[var21] = -1;
								var19.field708[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field359;
								int var24 = field372;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method288(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method288(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method288(field359, field372);
							}

							field521.method33(170);
							field521.method68(field372);
							field521.method69(field358);
							field521.method34(var20);
							field521.method35(field359);
						}
					} else if ((field524 == 1 || method182(field264 - 1)) && field264 > 2) {
						method150();
					} else if (field264 > 0) {
						method118(field264 - 1);
					}

					field339 = 10;
					field955 = 0;
				}
			}

			field462++;
			if (field462 > 132) {
				field462 = 0;
				field521.method33(11);
				field521.method38(0);
			}

			if (UGKPKMOJ.field1256 != -1) {
				int var25 = UGKPKMOJ.field1256;
				int var26 = UGKPKMOJ.field1257;
				boolean var27 = method180(0, 0, 0, var26, 0, field477.field1345[0], field477.field1344[0], true, 0, 0, var25);
				UGKPKMOJ.field1256 = -1;

				if (var27) {
					field472 = field956;
					field473 = field957;
					field475 = 1;
					field474 = 0;
				}
			}

			if (field955 == 1 && field371 != null) {
				field371 = null;
				field496 = true;
				field955 = 0;
			}

			method84();
			method205();
			method224();
			method133();

			if (field948 == 1 || field955 == 1) {
				field243++;
			}

			if (field376 == 2) {
				method184();
			}

			if (field376 == 2 && field222) {
				method172();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field275[var28]++;
			}

			method222();
			field947++;
			if (field947 > 4500) {
				field157 = 250;
				field947 -= 500;
				field521.method33(153);
			}

			field284++;
			if (field284 > 500) {
				field284 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field315 += field316;
				}

				if ((var29 & 0x2) == 2) {
					field163 += field164;
				}

				if ((var29 & 0x4) == 4) {
					field494 += field495;
				}
			}

			if (field315 < -50) {
				field316 = 2;
			}

			if (field315 > 50) {
				field316 = -2;
			}

			if (field163 < -55) {
				field164 = 2;
			}

			if (field163 > 55) {
				field164 = -2;
			}

			if (field494 < -40) {
				field495 = 1;
			}

			if (field494 > 40) {
				field495 = -1;
			}

			field440++;
			if (field440 > 500) {
				field440 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field309 += field310;
				}

				if ((var30 & 0x2) == 2) {
					field492 += field493;
				}
			}

			if (field309 < -60) {
				field310 = 2;
			}

			if (field309 > 60) {
				field310 = -2;
			}

			if (field492 < -20) {
				field493 = 1;
			}

			if (field492 > 10) {
				field493 = -1;
			}

			field156++;
			if (field156 > 50) {
				field521.method33(107);
			}

			try {
				if (field256 != null && field521.field92 > 0) {
					field256.method233(field521.field91, field521.field92, 0);
					field521.field92 = 0;
					field156 = 0;
				}
			} catch (IOException var32) {
				method92();
			} catch (Exception var33) {
				method99();
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method144() {
		field192.method289();
		DMXMSPET.field581 = field196;
		field253.method442(0, 0);

		if (field507) {
			field124.method464(40, 0, 239, field334);
			field124.method464(60, 128, 239, field445 + "*");
		} else if (field408 == 1) {
			field124.method464(40, 0, 239, "Enter amount:");
			field124.method464(60, 128, 239, field520 + "*");
		} else if (field408 == 2) {
			field124.method464(40, 0, 239, "Enter name:");
			field124.method464(60, 128, 239, field520 + "*");
		} else if (field371 != null) {
			field124.method464(40, 0, 239, field371);
			field124.method464(60, 128, 239, "Click to continue");
		} else if (field403 != -1) {
			method215(0, FDUKJGTQ.field705[field403], 0, 0);
		} else if (field365 == -1) {
			OSNNCWUM var1 = field123;
			int var2 = 0;
			JJXDTORW.method414(0, 463, 0, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field306[var3] != null) {
					int var4 = field304[var3];
					int var5 = field120 + 70 - var2 * 14;
					String var6 = field305[var3];
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
							var1.method468(field306[var3], var5, 0, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field466 == 0 || field466 == 1 && method219(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field399[0].method442(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field399[1].method442(var5 - 12, var8);
								var8 += 14;
							}

							var1.method468(var6 + ":", var5, 0, var8);
							var8 += var1.method466(var6) + 8;
							var1.method468(field306[var3], var5, 255, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field257 == 0 && (var4 == 7 || field291 == 0 || field291 == 1 && method219(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method468("From", var5, 0, var9);
							int var11 = var9 + var1.method466("From ");
							if (var7 == 1) {
								field399[0].method442(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field399[1].method442(var5 - 12, var11);
								var11 += 14;
							}

							var1.method468(var6 + ":", var5, 0, var11);
							var11 += var1.method466(var6) + 8;
							var1.method468(field306[var3], var5, 0x800000, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field353 == 0 || field353 == 1 && method219(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method468(var6 + " " + field306[var3], var5, 0x800080, 4);
						}

						var2++;
					}

					if (var4 == 5 && field257 == 0 && field291 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method468(field306[var3], var5, 0x800000, 4);
						}

						var2++;
					}

					if (var4 == 6 && field257 == 0 && field291 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method468("To " + var6 + ":", var5, 0, 4);
							var1.method468(field306[var3], var5, 0x800000, var1.method466("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field353 == 0 || field353 == 1 && method219(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method468(var6 + " " + field306[var3], var5, 0x7E3200, 4);
						}

						var2++;
					}
				}
			}

			JJXDTORW.method413();
			field206 = var2 * 14 + 7;
			if (field206 < 78) {
				field206 = 78;
			}

			method89(463, 77, 0, field206 - field120 - 77, field206);
			String var10;
			if (field477 == null || field477.field839 == null) {
				var10 = IGDXKDJL.method392(field104);
			} else {
				var10 = field477.field839;
			}

			var1.method468(var10 + ":", 90, 0, 4);
			var1.method468(field119 + "*", 90, 255, var1.method466(var10 + ": ") + 6);
			JJXDTORW.method420(0, 77, 0, 479);
		} else {
			method215(0, FDUKJGTQ.field705[field365], 0, 0);
		}

		if (field287 && field384 == 2) {
			method97();
		}

		field192.method290(357, 17, field941);
		field191.method289();
		DMXMSPET.field581 = field198;
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method145(long arg0) {
		if (arg0 != 0L) {
			if (field368 >= 100 && field137 != 1) {
				method181("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else if (field368 >= 200) {
				method181("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
			} else {
				String var3 = IGDXKDJL.method392(IGDXKDJL.method389(arg0));
				for (int var4 = 0; var4 < field368; var4++) {
					if (field451[var4] == arg0) {
						method181("", var3 + " is already on your friend list", 0);
						return;
					}
				}

				for (int var5 = 0; var5 < field406; var5++) {
					if (field443[var5] == arg0) {
						method181("", "Please remove " + var3 + " from your ignore list first", 0);
						return;
					}
				}

				if (!var3.equals(field477.field839)) {
					field283[field368] = var3;
					field451[field368] = arg0;
					field436[field368] = 0;
					field368++;
					field366 = true;
					field521.method33(122);
					field521.method40(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method146(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field406; var3++) {
				if (field443[var3] == arg0) {
					field406--;
					field366 = true;

					for (int var4 = var3; var4 < field406; var4++) {
						field443[var4] = field443[var4 + 1];
					}

					field521.method33(180);
					field521.method40(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method147() {
		int var1 = 5;
		field515[8] = 0;
		int var2 = 0;
		while (field515[8] == 0) {
			String var3 = "Unknown problem";
			method200("Connecting to web server", 20);

			try {
				DataInputStream var4 = method199("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 309);
				CKBTFRZM var5 = new CKBTFRZM(new byte[40]);
				var4.readFully(var5.field91, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field515[var6] = var5.method49();
				}

				int var7 = var5.method49();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field515[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field515[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field515[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field515[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field515[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field515[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method200("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method200(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field432 = !field432;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZI)V")
	public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field343.method533(arg1, arg0, arg4);
		if (var6 != 0) {
			int var7 = field343.method537(arg1, arg0, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field281.field999;
			int var12 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			VCGOMUBN var14 = VCGOMUBN.method568(var13);
			if (var14.field1381 == -1) {
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
				JQZFCGYF var15 = field255[var14.field1381];
				if (var15 != null) {
					int var16 = (var14.field1420 * 4 - var15.field1008) / 2;
					int var17 = (var14.field1392 * 4 - var15.field1009) / 2;
					var15.method442((104 - arg4 - var14.field1392) * 4 + var17 + 48, arg0 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field343.method535(arg1, arg0, arg4);
		if (var18 != 0) {
			int var19 = field343.method537(arg1, arg0, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			VCGOMUBN var23 = VCGOMUBN.method568(var22);
			if (var23.field1381 != -1) {
				JQZFCGYF var24 = field255[var23.field1381];
				if (var24 != null) {
					int var25 = (var23.field1420 * 4 - var24.field1008) / 2;
					int var26 = (var23.field1392 * 4 - var24.field1009) / 2;
					var24.method442((104 - arg4 - var23.field1392) * 4 + var26 + 48, arg0 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field281.field999;
				int var29 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = field343.method536(arg1, arg0, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			VCGOMUBN var32 = VCGOMUBN.method568(var31);
			if (var32.field1381 != -1) {
				JQZFCGYF var33 = field255[var32.field1381];
				if (var33 != null) {
					int var34 = (var32.field1420 * 4 - var33.field1008) / 2;
					int var35 = (var32.field1392 * 4 - var33.field1009) / 2;
					var33.method442((104 - arg4 - var32.field1392) * 4 + var35 + 48, arg0 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LCKBTFRZM;IB)V")
	public final void method149(CKBTFRZM arg0, int arg1) {
		int var3 = arg0.method55(8);
		if (var3 < field178) {
			for (int var4 = var3; var4 < field178; var4++) {
				field298[field297++] = field179[var4];
			}
		}

		if (var3 > field178) {
			signlink.reporterror(field104 + " Too many players");
			throw new RuntimeException("eek");
		}

		field178 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field179[var5];
			GPPDQFCV var7 = field177[var6];
			int var8 = arg0.method55(1);
			if (var8 == 0) {
				field179[field178++] = var6;
				var7.field1329 = field277;
			} else {
				int var9 = arg0.method55(2);
				if (var9 == 0) {
					field179[field178++] = var6;
					var7.field1329 = field277;
					field181[field180++] = var6;
				} else if (var9 == 1) {
					field179[field178++] = var6;
					var7.field1329 = field277;
					int var10 = arg0.method55(3);
					var7.method561(false, var10);
					int var11 = arg0.method55(1);
					if (var11 == 1) {
						field181[field180++] = var6;
					}
				} else if (var9 == 2) {
					field179[field178++] = var6;
					var7.field1329 = field277;
					int var12 = arg0.method55(3);
					var7.method561(true, var12);
					int var13 = arg0.method55(3);
					var7.method561(true, var13);
					int var14 = arg0.method55(1);
					if (var14 == 1) {
						field181[field180++] = var6;
					}
				} else if (var9 == 3) {
					field298[field297++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method150() {
		int var1 = field124.method466("Choose Option");
		for (int var2 = 0; var2 < field264; var2++) {
			int var3 = field124.method466(field293[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field264 * 15 + 21;
		if (field956 > 4 && field957 > 4 && field956 < 516 && field957 < 338) {
			int var5 = field956 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field957 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field287 = true;
			field384 = 0;
			field385 = var5;
			field386 = var6;
			field387 = var1;
			field388 = field264 * 15 + 22;
		}

		if (field956 > 553 && field957 > 205 && field956 < 743 && field957 < 466) {
			int var7 = field956 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field957 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field287 = true;
			field384 = 1;
			field385 = var7;
			field386 = var8;
			field387 = var1;
			field388 = field264 * 15 + 22;
		}

		if (field956 > 17 && field957 > 357 && field956 < 496 && field957 < 453) {
			int var9 = field956 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field957 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field287 = true;
			field384 = 2;
			field385 = var9;
			field386 = var10;
			field387 = var1;
			field388 = field264 * 15 + 22;
		}
	}

	@ObfuscatedName("client.c(BI)Ljava/lang/String;")
	public static final String method151(int arg0) {
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

	@ObfuscatedName("client.r(I)Z")
	public final boolean method152() {
		if (field256 == null) {
			return false;
		}

		try {
			int var1 = field256.method231();
			if (var1 == 0) {
				return false;
			}

			if (field154 == -1) {
				field256.method232(field250.field91, 0, 1);
				field154 = field250.field91[0] & 0xFF;
				if (field349 != null) {
					field154 = field154 - field349.method479() & 0xFF;
				}

				field153 = CRNURPOL.field544[field154];
				var1--;
			}

			if (field153 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field256.method232(field250.field91, 0, 1);
				field153 = field250.field91[0] & 0xFF;
				var1--;
			}

			if (field153 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field256.method232(field250.field91, 0, 2);
				field250.field92 = 0;
				field153 = field250.method46();
				var1 -= 2;
			}

			if (var1 < field153) {
				return false;
			}

			field250.field92 = 0;
			field256.method232(field250.field91, 0, field153);
			field155 = 0;
			field486 = field485;
			field485 = field484;
			field484 = field154;

			if (field154 == 116) {
				field279 = 0;
				field154 = -1;
				return true;
			}

			if (field154 == 31) {
				int var2 = field250.method71();
				int var3 = field250.method49();
				field456[var2] = var3;

				if (field336[var2] != var3) {
					field336[var2] = var3;
					method111(var2);
					field366 = true;

					if (field365 != -1) {
						field496 = true;
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 106) {
				if (field405 != -1) {
					field405 = -1;
					field366 = true;
					field437 = true;
				}

				if (field403 != -1) {
					field403 = -1;
					field496 = true;
				}

				if (field408 != 0) {
					field408 = 0;
					field496 = true;
				}

				field219 = -1;
				field183 = false;
				field154 = -1;
				return true;
			}

			if (field154 == 96) {
				int var4 = field250.method72();
				int var5 = field250.method46();
				int var6 = field250.method46();
				int var7 = field250.method46();
				FDUKJGTQ.field705[var5].field682 = var7;
				FDUKJGTQ.field705[var5].field683 = var6;
				FDUKJGTQ.field705[var5].field681 = var4;
				field154 = -1;
				return true;
			}

			if (field154 == 126) {
				int var8 = field250.method73();
				method185(var8);

				if (field403 != -1) {
					field403 = -1;
					field496 = true;
				}

				if (field408 != 0) {
					field408 = 0;
					field496 = true;
				}

				field405 = var8;
				field366 = true;
				field437 = true;
				field219 = -1;
				field183 = false;
				field154 = -1;
				return true;
			}

			if (field154 == 61) {
				int var9 = field250.method72();
				int var10 = field250.method73();
				FDUKJGTQ.field705[var9].field679 = 2;
				FDUKJGTQ.field705[var9].field680 = var10;
				field154 = -1;
				return true;
			}

			if (field154 == 171) {
				field406 = field153 / 8;
				for (int var11 = 0; var11 < field406; var11++) {
					field443[var11] = field250.method50();
				}

				field154 = -1;
				return true;
			}

			if (field154 == 214) {
				field131 = field250.method44();
				field366 = true;
				field437 = true;
				field154 = -1;
				return true;
			}

			if (field154 == 229) {
				String var12 = field250.method51();
				int var13 = field250.method46();
				FDUKJGTQ.field705[var13].field672 = var12;

				if (field350[field131] == FDUKJGTQ.field705[var13].field715) {
					field366 = true;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 163) {
				field426 = field250.method64();
				field425 = field250.method64();

				while (field250.field92 < field153) {
					int var14 = field250.method44();
					method139(var14, field250);
				}

				field154 = -1;
				return true;
			}

			if (field154 == 109) {
				method116(field153, field250);
				field154 = -1;
				return true;
			}

			if (field154 == 26) {
				String var15 = field250.method51();
				if (var15.endsWith(":tradereq:")) {
					String var16 = var15.substring(0, var15.indexOf(":"));
					long var17 = IGDXKDJL.method388(var16);
					boolean var19 = false;
					for (int var20 = 0; var20 < field406; var20++) {
						if (field443[var20] == var17) {
							var19 = true;
							break;
						}
					}

					if (!var19 && field193 == 0) {
						method181(var16, "wishes to trade with you.", 4);
					}
				} else if (var15.endsWith(":duelreq:")) {
					String var21 = var15.substring(0, var15.indexOf(":"));
					long var22 = IGDXKDJL.method388(var21);
					boolean var24 = false;
					for (int var25 = 0; var25 < field406; var25++) {
						if (field443[var25] == var22) {
							var24 = true;
							break;
						}
					}

					if (!var24 && field193 == 0) {
						method181(var21, "wishes to duel with you.", 8);
					}
				} else if (var15.endsWith(":chalreq:")) {
					String var26 = var15.substring(0, var15.indexOf(":"));
					long var27 = IGDXKDJL.method388(var26);
					boolean var29 = false;
					for (int var30 = 0; var30 < field406; var30++) {
						if (field443[var30] == var27) {
							var29 = true;
							break;
						}
					}

					if (!var29 && field193 == 0) {
						String var31 = var15.substring(var15.indexOf(":") + 1, var15.length() - 9);
						method181(var26, var31, 8);
					}
				} else {
					method181("", var15, 0);
				}

				field154 = -1;
				return true;
			}

			if (field154 == 157) {
				field348 = field250.method44();
				field154 = -1;
				return true;
			}

			if (field154 == 177) {
				field366 = true;
				int var32 = field250.method46();
				FDUKJGTQ var33 = FDUKJGTQ.field705[var32];
				int var34 = field250.method46();
				for (int var35 = 0; var35 < var34; var35++) {
					int var36 = field250.method64();
					if (var36 == 255) {
						var36 = field250.method80();
					}

					var33.field711[var35] = field250.method73();
					var33.field708[var35] = var36;
				}

				for (int var37 = var34; var37 < var33.field711.length; var37++) {
					var33.field711[var37] = 0;
					var33.field708[var37] = 0;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 192 || field154 == 76 || field154 == 78 || field154 == 90 || field154 == 198 || field154 == 208 || field154 == 172 || field154 == 241 || field154 == 7 || field154 == 182 || field154 == 219) {
				method139(field154, field250);
				field154 = -1;
				return true;
			}

			if (field154 == 115) {
				int var38 = field250.method73();
				int var39 = field250.method73();
				FDUKJGTQ var40 = FDUKJGTQ.field705[var38];
				if (var40 != null && var40.field667 == 0) {
					if (var39 < 0) {
						var39 = 0;
					}

					if (var39 > var40.field704 - var40.field713) {
						var39 = var40.field704 - var40.field713;
					}

					var40.field707 = var39;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 117) {
				long var41 = field250.method50();
				int var43 = field250.method44();
				String var44 = IGDXKDJL.method392(IGDXKDJL.method389(var41));
				for (int var45 = 0; var45 < field368; var45++) {
					if (field451[var45] == var41) {
						if (field436[var45] != var43) {
							field436[var45] = var43;
							field366 = true;

							if (var43 > 0) {
								method181("", var44 + " has logged in.", 5);
							}

							if (var43 == 0) {
								method181("", var44 + " has logged out.", 5);
							}
						}

						var44 = null;
						break;
					}
				}

				if (var44 != null && field368 < 200) {
					field451[field368] = var41;
					field283[field368] = var44;
					field436[field368] = var43;
					field368++;
					field366 = true;
				}

				boolean var46 = false;
				while (!var46) {
					var46 = true;
					for (int var47 = 0; var47 < field368 - 1; var47++) {
						if (field436[var47] != field223 && field436[var47 + 1] == field223 || field436[var47] == 0 && field436[var47 + 1] != 0) {
							int var48 = field436[var47];
							field436[var47] = field436[var47 + 1];
							field436[var47 + 1] = var48;
							String var49 = field283[var47];
							field283[var47] = field283[var47 + 1];
							field283[var47 + 1] = var49;
							long var50 = field451[var47];
							field451[var47] = field451[var47 + 1];
							field451[var47 + 1] = var50;
							field366 = true;
							var46 = false;
						}
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 148) {
				field261 = field250.method62();
				if (field261 == field131) {
					if (field261 == 3) {
						field131 = 1;
					} else {
						field131 = 3;
					}

					field366 = true;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 18) {
				int var52 = field250.method75();
				int var53 = field250.method46();
				int var54 = field250.method76();
				FDUKJGTQ var55 = FDUKJGTQ.field705[var53];
				var55.field706 = var52;
				var55.field685 = var54;
				field154 = -1;
				return true;
			}

			if (field154 == 175) {
				int var56 = field250.method46();
				int var57 = field250.method44();
				int var58 = field250.method46();
				if (field511 && !field226 && field254 < 50) {
					field476[field254] = var56;
					field407[field254] = var57;
					field143[field254] = PKMPUSCK.field1112[var56] + var58;
					field254++;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 70) {
				int var59 = field250.method72();
				int var60 = field250.method73();

				if (field403 != -1) {
					field403 = -1;
					field496 = true;
				}

				if (field408 != 0) {
					field408 = 0;
					field496 = true;
				}

				field219 = var59;
				field405 = var60;
				field366 = true;
				field437 = true;
				field183 = false;
				field154 = -1;
				return true;
			}

			if (field154 == 12) {
				int var61 = field250.method72();
				int var62 = field250.method46();
				int var63 = field250.method71();
				if (var61 == 0xFFFF) {
					FDUKJGTQ.field705[var63].field679 = 0;
					field154 = -1;
					return true;
				}

				PTCSWKBP var64 = PTCSWKBP.method489(var61);
				FDUKJGTQ.field705[var63].field679 = 4;
				FDUKJGTQ.field705[var63].field680 = var61;
				FDUKJGTQ.field705[var63].field682 = var64.field1129;
				FDUKJGTQ.field705[var63].field683 = var64.field1139;
				FDUKJGTQ.field705[var63].field681 = var64.field1144 * 100 / var62;
				field154 = -1;
				return true;
			}

			if (field154 == 168) {
				field426 = field250.method44();
				field425 = field250.method64();
				field154 = -1;
				return true;
			}

			if (field154 == 92) {
				int var65 = field250.method73();
				FDUKJGTQ var66 = FDUKJGTQ.field705[var65];
				for (int var67 = 0; var67 < var66.field711.length; var67++) {
					var66.field711[var67] = -1;
					var66.field711[var67] = 0;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 151) {
				for (int var68 = 0; var68 < field177.length; var68++) {
					if (field177[var68] != null) {
						field177[var68].field1320 = -1;
					}
				}

				for (int var69 = 0; var69 < field201.length; var69++) {
					if (field201[var69] != null) {
						field201[var69].field1320 = -1;
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 223) {
				field377 = field250.method71();
				field442 = field250.method46();
				field221 = field250.method63();
				field145 = field250.method79();
				field148 = field250.method62();
				if (field145 != 0 && field219 == -1) {
					signlink.dnslookup(IGDXKDJL.method391(field145));
					method154();
					short var70 = 650;
					if (field221 != 201 || field148 == 1) {
						var70 = 655;
					}

					field512 = "";
					field431 = false;

					for (int var71 = 0; var71 < FDUKJGTQ.field705.length; var71++) {
						if (FDUKJGTQ.field705[var71] != null && FDUKJGTQ.field705[var71].field703 == var70) {
							field219 = FDUKJGTQ.field705[var71].field715;
							break;
						}
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 202) {
				int var72 = field250.method72();
				if (var72 == 0xFFFF) {
					var72 = -1;
				}

				if (field326 != var72 && field147 && !field226 && field129 == 0) {
					field327 = var72;
					field328 = true;
					field317.method259(2, field327);
				}

				field326 = var72;
				field154 = -1;
				return true;
			}

			if (field154 == 85) {
				int var73 = field250.method71();
				int var74 = field250.method46();
				if (field147 && !field226) {
					field327 = var73;
					field328 = false;
					field317.method259(2, field327);
					field129 = var74;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 60) {
				field222 = true;
				field158 = field250.method44();
				field159 = field250.method44();
				field160 = field250.method46();
				field161 = field250.method44();
				field162 = field250.method44();
				if (field162 >= 100) {
					int var75 = field158 * 128 + 64;
					int var76 = field159 * 128 + 64;
					int var77 = method194(field375, var75, var76) - field160;
					int var78 = var75 - field267;
					int var79 = var77 - field268;
					int var80 = var76 - field269;
					int var81 = (int) Math.sqrt(var78 * var78 + var80 * var80);
					field270 = (int) (Math.atan2(var79, var81) * 325.949D) & 0x7FF;
					field271 = (int) (Math.atan2(var78, var80) * -325.949D) & 0x7FF;

					if (field270 < 128) {
						field270 = 128;
					}

					if (field270 > 383) {
						field270 = 383;
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 210) {
				field507 = false;
				field408 = 1;
				field520 = "";
				field496 = true;
				field154 = -1;
				return true;
			}

			if (field154 == 176) {
				int var82 = field250.method46();
				int var83 = field250.method74();
				FDUKJGTQ var84 = FDUKJGTQ.field705[var82];
				var84.field725 = var83;

				if (var83 == -1) {
					var84.field674 = 0;
					var84.field693 = 0;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 239) {
				field137 = field250.method64();
				field337 = field250.method73();
				field154 = -1;
				return true;
			}

			if (field154 == 56) {
				field222 = false;

				for (int var85 = 0; var85 < 5; var85++) {
					field414[var85] = false;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 189) {
				field425 = field250.method63();
				field426 = field250.method63();
				for (int var86 = field425; var86 < field425 + 8; var86++) {
					for (int var87 = field426; var87 < field426 + 8; var87++) {
						if (field338[field375][var86][var87] != null) {
							field338[field375][var86][var87] = null;
							method209(var86, var87);
						}
					}
				}

				for (QVTBMRGW var88 = (QVTBMRGW) field302.method585(); var88 != null; var88 = (QVTBMRGW) field302.method587()) {
					if (var88.field1176 >= field425 && var88.field1176 < field425 + 8 && var88.field1177 >= field426 && var88.field1177 < field426 + 8 && field375 == var88.field1174) {
						var88.field1166 = 0;
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 111) {
				if (field131 == 12) {
					field366 = true;
				}

				field116 = field250.method47();
				field154 = -1;
				return true;
			}

			if (field154 == 44) {
				boolean var89 = field250.method63() == 1;
				int var90 = field250.method73();
				FDUKJGTQ.field705[var90].field716 = var89;
				field154 = -1;
				return true;
			}

			if (field154 == 114) {
				if (field131 == 12) {
					field366 = true;
				}

				field245 = field250.method44();
				field154 = -1;
				return true;
			}

			if (field154 == 128) {
				field222 = true;
				field416 = field250.method44();
				field417 = field250.method44();
				field418 = field250.method46();
				field419 = field250.method44();
				field420 = field250.method44();
				if (field420 >= 100) {
					field267 = field416 * 128 + 64;
					field269 = field417 * 128 + 64;
					field268 = method194(field375, field267, field269) - field418;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 51) {
				int var91 = field250.method47();
				if (var91 >= 0) {
					method185(var91);
				}

				field204 = var91;
				field154 = -1;
				return true;
			}

			if (field154 == 181) {
				int var92 = field250.method46();
				int var93 = field250.method72();
				int var94 = var92 >> 10 & 0x1F;
				int var95 = var92 >> 5 & 0x1F;
				int var96 = var92 & 0x1F;
				FDUKJGTQ.field705[var93].field721 = (var96 << 3) + (var94 << 19) + (var95 << 11);
				field154 = -1;
				return true;
			}

			if (field154 == 244) {
				int var97 = field250.method74();
				field365 = var97;
				field496 = true;
				field154 = -1;
				return true;
			}

			if (field154 == 226) {
				field366 = true;
				int var98 = field250.method62();
				int var99 = field250.method79();
				int var100 = field250.method63();
				field276[var98] = var99;
				field218[var98] = var100;
				field208[var98] = 1;
				for (int var101 = 0; var101 < 98; var101++) {
					if (var99 >= field282[var101]) {
						field208[var98] = var101 + 2;
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 159) {
				int var102 = field250.method71();
				byte var103 = field250.method66();
				field456[var102] = var103;

				if (field336[var102] != var103) {
					field336[var102] = var103;
					method111(var102);
					field366 = true;

					if (field365 != -1) {
						field496 = true;
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 224) {
				field369 = field250.method44();
				field366 = true;
				field154 = -1;
				return true;
			}

			if (field154 == 141) {
				field366 = true;
				int var104 = field250.method46();
				FDUKJGTQ var105 = FDUKJGTQ.field705[var104];
				while (field250.field92 < field153) {
					int var106 = field250.method58();
					int var107 = field250.method46();
					int var108 = field250.method44();
					if (var108 == 255) {
						var108 = field250.method49();
					}

					if (var106 >= 0 && var106 < var105.field711.length) {
						var105.field711[var106] = var107;
						var105.field708[var106] = var108;
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 64) {
				field195 = field250.method71() * 30;
				field154 = -1;
				return true;
			}

			if (field154 == 63) {
				int var109 = field250.method71();
				int var110 = field250.method73();
				FDUKJGTQ.field705[var110].field679 = 1;
				FDUKJGTQ.field705[var110].field680 = var109;
				field154 = -1;
				return true;
			}

			if (field154 == 167) {
				int var111 = field250.method64();
				int var112 = field250.method62();
				String var113 = field250.method51();
				if (var111 >= 1 && var111 <= 5) {
					if (var113.equalsIgnoreCase("null")) {
						var113 = null;
					}

					field464[var111 - 1] = var113;
					field465[var111 - 1] = var112 == 0;
				}

				field154 = -1;
				return true;
			}

			if (field154 == 21) {
				int var114 = field250.method73();
				int var115 = field250.method63();

				if (var114 == 0xFFFF) {
					var114 = -1;
				}

				field350[var115] = var114;
				field366 = true;
				field437 = true;
				field154 = -1;
				return true;
			}

			if (field154 == 57 || field154 == 122) {
				int var116 = field185;
				int var117 = field186;
				if (field154 == 57) {
					var117 = field250.method73();
					var116 = field250.method71();
					field346 = false;
				}

				if (field154 == 122) {
					var116 = field250.method46();
					var117 = field250.method73();
					field250.method54();

					for (int var118 = 0; var118 < 4; var118++) {
						for (int var119 = 0; var119 < 13; var119++) {
							for (int var120 = 0; var120 < 13; var120++) {
								int var121 = field250.method55(1);
								if (var121 == 1) {
									field415[var118][var119][var120] = field250.method55(26);
								} else {
									field415[var118][var119][var120] = -1;
								}
							}
						}
					}

					field250.method56();
					field346 = true;
				}

				if (field185 == var116 && field186 == var117 && field376 == 2) {
					field154 = -1;
					return true;
				}

				field185 = var116;
				field186 = var117;
				field468 = (field185 - 6) * 8;
				field469 = (field186 - 6) * 8;
				field525 = false;
				if ((field185 / 8 == 48 || field185 / 8 == 49) && field186 / 8 == 48) {
					field525 = true;
				}

				if (field185 / 8 == 48 && field186 / 8 == 148) {
					field525 = true;
				}

				field376 = 1;
				field467 = System.currentTimeMillis();
				field191.method289();
				field123.method464(151, 0, 257, "Loading - please wait.");
				field123.method464(150, 0xFFFFFF, 256, "Loading - please wait.");
				field191.method290(4, 4, field941);

				if (field154 == 57) {
					int var122 = 0;
					for (int var123 = (field185 - 6) / 8; var123 <= (field185 + 6) / 8; var123++) {
						for (int var124 = (field186 - 6) / 8; var124 <= (field186 + 6) / 8; var124++) {
							var122++;
						}
					}

					field227 = new byte[var122][];
					field150 = new byte[var122][];
					field453 = new int[var122];
					field454 = new int[var122];
					field455 = new int[var122];
					int var125 = 0;
					for (int var126 = (field185 - 6) / 8; var126 <= (field185 + 6) / 8; var126++) {
						for (int var127 = (field186 - 6) / 8; var127 <= (field186 + 6) / 8; var127++) {
							field453[var125] = (var126 << 8) + var127;

							if (field525 && (var127 == 49 || var127 == 149 || var127 == 147 || var126 == 50 || var126 == 49 && var127 == 47)) {
								field454[var125] = -1;
								field455[var125] = -1;
								var125++;
							} else {
								int var128 = field454[var125] = field317.method260(0, var127, var126);
								if (var128 != -1) {
									field317.method259(3, var128);
								}

								int var129 = field455[var125] = field317.method260(1, var127, var126);
								if (var129 != -1) {
									field317.method259(3, var129);
								}

								var125++;
							}
						}
					}
				}

				if (field154 == 122) {
					int var130 = 0;
					int[] var131 = new int[676];
					for (int var132 = 0; var132 < 4; var132++) {
						for (int var133 = 0; var133 < 13; var133++) {
							for (int var134 = 0; var134 < 13; var134++) {
								int var135 = field415[var132][var133][var134];
								if (var135 != -1) {
									int var136 = var135 >> 14 & 0x3FF;
									int var137 = var135 >> 3 & 0x7FF;
									int var138 = (var136 / 8 << 8) + var137 / 8;
									for (int var139 = 0; var139 < var130; var139++) {
										if (var131[var139] == var138) {
											var138 = -1;
											break;
										}
									}

									if (var138 != -1) {
										var131[var130++] = var138;
									}
								}
							}
						}
					}

					field227 = new byte[var130][];
					field150 = new byte[var130][];
					field453 = new int[var130];
					field454 = new int[var130];
					field455 = new int[var130];
					for (int var140 = 0; var140 < var130; var140++) {
						int var141 = field453[var140] = var131[var140];
						int var142 = var141 >> 8 & 0xFF;
						int var143 = var141 & 0xFF;
						int var144 = field454[var140] = field317.method260(0, var143, var142);
						if (var144 != -1) {
							field317.method259(3, var144);
						}

						int var145 = field455[var140] = field317.method260(1, var143, var142);
						if (var145 != -1) {
							field317.method259(3, var145);
						}
					}
				}

				int var146 = field468 - field470;
				int var147 = field469 - field471;
				field470 = field468;
				field471 = field469;

				for (int var148 = 0; var148 < 16384; var148++) {
					TKXONZKI var149 = field201[var148];
					if (var149 != null) {
						for (int var150 = 0; var150 < 10; var150++) {
							var149.field1344[var150] -= var146;
							var149.field1345[var150] -= var147;
						}

						var149.field1347 -= var146 * 128;
						var149.field1348 -= var147 * 128;
					}
				}

				for (int var151 = 0; var151 < field175; var151++) {
					GPPDQFCV var152 = field177[var151];
					if (var152 != null) {
						for (int var153 = 0; var153 < 10; var153++) {
							var152.field1344[var153] -= var146;
							var152.field1345[var153] -= var147;
						}

						var152.field1347 -= var146 * 128;
						var152.field1348 -= var147 * 128;
					}
				}

				field508 = true;
				byte var154 = 0;
				byte var155 = 104;
				byte var156 = 1;
				if (var146 < 0) {
					var154 = 103;
					var155 = -1;
					var156 = -1;
				}

				byte var157 = 0;
				byte var158 = 104;
				byte var159 = 1;
				if (var147 < 0) {
					var157 = 103;
					var158 = -1;
					var159 = -1;
				}

				for (int var160 = var154; var160 != var155; var160 += var156) {
					for (int var161 = var157; var161 != var158; var161 += var159) {
						int var162 = var146 + var160;
						int var163 = var147 + var161;
						for (int var164 = 0; var164 < 4; var164++) {
							if (var162 >= 0 && var163 >= 0 && var162 < 104 && var163 < 104) {
								field338[var164][var160][var161] = field338[var164][var162][var163];
							} else {
								field338[var164][var160][var161] = null;
							}
						}
					}
				}

				for (QVTBMRGW var165 = (QVTBMRGW) field302.method585(); var165 != null; var165 = (QVTBMRGW) field302.method587()) {
					var165.field1176 -= var146;
					var165.field1177 -= var147;
					if (var165.field1176 < 0 || var165.field1177 < 0 || var165.field1176 >= 104 || var165.field1177 >= 104) {
						var165.method450();
					}
				}

				if (field279 != 0) {
					field279 -= var146;
					field280 -= var147;
				}

				field222 = false;
				field154 = -1;
				return true;
			}

			if (field154 == 213) {
				int var166 = field250.method72();
				method185(var166);

				if (field405 != -1) {
					field405 = -1;
					field366 = true;
					field437 = true;
				}

				if (field403 != -1) {
					field403 = -1;
					field496 = true;
				}

				if (field408 != 0) {
					field408 = 0;
					field496 = true;
				}

				field219 = var166;
				field183 = false;
				field154 = -1;
				return true;
			}

			if (field154 == 81) {
				method101(field153, field250);
				field508 = false;
				field154 = -1;
				return true;
			}

			if (field154 == 9) {
				method99();
				field154 = -1;
				return false;
			}

			if (field154 == 102) {
				field363 = field250.method44();
				field154 = -1;
				return true;
			}

			if (field154 == 200) {
				int var167 = field250.method46();
				method185(var167);

				if (field405 != -1) {
					field405 = -1;
					field366 = true;
					field437 = true;
				}

				field403 = var167;
				field496 = true;
				field219 = -1;
				field183 = false;
				field154 = -1;
				return true;
			}

			if (field154 == 254) {
				long var168 = field250.method50();
				int var170 = field250.method49();
				int var171 = field250.method44();
				boolean var172 = false;
				for (int var173 = 0; var173 < 100; var173++) {
					if (field266[var173] == var170) {
						var172 = true;
						break;
					}
				}

				if (var171 <= 1) {
					for (int var174 = 0; var174 < field406; var174++) {
						if (field443[var174] == var168) {
							var172 = true;
							break;
						}
					}
				}

				if (!var172 && field193 == 0) {
					try {
						field266[field434] = var170;
						field434 = (field434 + 1) % 100;
						String var175 = IDJBPKZF.method379(field153 - 13, field250);
						if (var171 != 3) {
							var175 = FZULSWUT.method305(var175);
						}

						if (var171 == 2 || var171 == 3) {
							method181("@cr2@" + IGDXKDJL.method392(IGDXKDJL.method389(var168)), var175, 7);
						} else if (var171 == 1) {
							method181("@cr1@" + IGDXKDJL.method392(IGDXKDJL.method389(var168)), var175, 7);
						} else {
							method181(IGDXKDJL.method392(IGDXKDJL.method389(var168)), var175, 3);
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field154 = -1;
				return true;
			}

			if (field154 == 204) {
				field507 = false;
				field408 = 2;
				field520 = "";
				field496 = true;
				field154 = -1;
				return true;
			}

			if (field154 == 124) {
				int var177 = field250.method44();
				int var178 = field250.method44();
				int var179 = field250.method44();
				int var180 = field250.method44();
				field414[var177] = true;
				field509[var177] = var178;
				field172[var177] = var179;
				field205[var177] = var180;
				field275[var177] = 0;
				field154 = -1;
				return true;
			}

			if (field154 == 80) {
				int var181 = field250.method46();
				FDUKJGTQ.field705[var181].field679 = 3;

				if (field477.field821 == null) {
					FDUKJGTQ.field705[var181].field680 = (field477.field841[11] << 5) + (field477.field841[8] << 10) + (field477.field841[0] << 15) + (field477.field840[0] << 25) + (field477.field840[4] << 20) + field477.field841[1];
				} else {
					FDUKJGTQ.field705[var181].field680 = (int) (field477.field821.field70 + 0x12345678L);
				}

				field154 = -1;
				return true;
			}

			if (field154 == 193) {
				field344 = field250.method44();
				if (field344 == 1) {
					field244 = field250.method46();
				}

				if (field344 >= 2 && field344 <= 6) {
					if (field344 == 2) {
						field382 = 64;
						field383 = 64;
					}

					if (field344 == 3) {
						field382 = 0;
						field383 = 64;
					}

					if (field344 == 4) {
						field382 = 128;
						field383 = 64;
					}

					if (field344 == 5) {
						field382 = 64;
						field383 = 0;
					}

					if (field344 == 6) {
						field382 = 64;
						field383 = 128;
					}

					field344 = 2;
					field379 = field250.method46();
					field380 = field250.method46();
					field381 = field250.method44();
				}

				if (field344 == 10) {
					field117 = field250.method46();
				}

				field154 = -1;
				return true;
			}

			if (field154 == 65) {
				field466 = field250.method44();
				field291 = field250.method44();
				field353 = field250.method44();
				field523 = true;
				field496 = true;
				field154 = -1;
				return true;
			}

			if (field154 == 178) {
				for (int var182 = 0; var182 < field336.length; var182++) {
					if (field456[var182] != field336[var182]) {
						field336[var182] = field456[var182];
						method111(var182);
						field366 = true;
					}
				}

				field154 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field154 + "," + field153 + " - " + field485 + "," + field486);
			method99();
		} catch (IOException var187) {
			method92();
		} catch (Exception var188) {
			String var184 = "T2 - " + field154 + "," + field485 + "," + field486 + " - " + field153 + "," + (field477.field1344[0] + field468) + "," + (field477.field1345[0] + field469) + " - ";
			for (int var185 = 0; var185 < field153 && var185 < 50; var185++) {
				var184 = var184 + field250.field91[var185] + ",";
			}

			signlink.reporterror(var184);
			method99();
		}

		return true;
	}

	@ObfuscatedName("client.s(I)V")
	public final void method153() {
		if (field376 == 2) {
			for (QVTBMRGW var1 = (QVTBMRGW) field302.method585(); var1 != null; var1 = (QVTBMRGW) field302.method587()) {
				if (var1.field1166 > 0) {
					var1.field1166--;
				}

				if (var1.field1166 != 0) {
					if (var1.field1173 > 0) {
						var1.field1173--;
					}

					if (var1.field1173 == 0 && var1.field1176 >= 1 && var1.field1177 >= 1 && var1.field1176 <= 102 && var1.field1177 <= 102 && (var1.field1167 < 0 || BRNLHXCU.method5(var1.field1167, var1.field1169))) {
						method95(var1.field1177, var1.field1175, var1.field1174, var1.field1168, var1.field1169, var1.field1167, var1.field1176);
						var1.field1173 = -1;

						if (var1.field1170 == var1.field1167 && var1.field1170 == -1) {
							var1.method450();
						} else if (var1.field1170 == var1.field1167 && var1.field1171 == var1.field1168 && var1.field1172 == var1.field1169) {
							var1.method450();
						}
					}
				} else if (var1.field1170 < 0 || BRNLHXCU.method5(var1.field1170, var1.field1172)) {
					method95(var1.field1177, var1.field1175, var1.field1174, var1.field1171, var1.field1172, var1.field1170, var1.field1176);
					var1.method450();
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method154() {
		field521.method33(212);

		if (field405 != -1) {
			field405 = -1;
			field366 = true;
			field183 = false;
			field437 = true;
		}

		if (field403 != -1) {
			field403 = -1;
			field496 = true;
			field183 = false;
		}

		field219 = -1;
	}

	@ObfuscatedName("client.u(I)V")
	public final void method155() {
		for (int var1 = 0; var1 < field202; var1++) {
			int var2 = field203[var1];
			TKXONZKI var3 = field201[var2];
			if (var3 != null) {
				method156(var3.field1188.field77, var3);
			}
		}
	}

	@ObfuscatedName("client.a(ILUKYMLOIC;I)V")
	public final void method156(int arg0, UKYMLOIC arg1) {
		if (arg1.field1347 < 128 || arg1.field1348 < 128 || arg1.field1347 >= 13184 || arg1.field1348 >= 13184) {
			arg1.field1320 = -1;
			arg1.field1314 = -1;
			arg1.field1341 = 0;
			arg1.field1342 = 0;
			arg1.field1347 = arg1.field1344[0] * 128 + arg1.field1319 * 64;
			arg1.field1348 = arg1.field1345[0] * 128 + arg1.field1319 * 64;
			arg1.method560();
		}

		if (field477 == arg1 && (arg1.field1347 < 1536 || arg1.field1348 < 1536 || arg1.field1347 >= 11776 || arg1.field1348 >= 11776)) {
			arg1.field1320 = -1;
			arg1.field1314 = -1;
			arg1.field1341 = 0;
			arg1.field1342 = 0;
			arg1.field1347 = arg1.field1344[0] * 128 + arg1.field1319 * 64;
			arg1.field1348 = arg1.field1345[0] * 128 + arg1.field1319 * 64;
			arg1.method560();
		}

		if (arg1.field1341 > field277) {
			method157(arg1);
		} else if (arg1.field1342 >= field277) {
			method158(arg1);
		} else {
			method159(arg1);
		}

		method160(arg1);
		method161(arg1);
	}

	@ObfuscatedName("client.a(ZLUKYMLOIC;)V")
	public final void method157(UKYMLOIC arg0) {
		int var2 = arg0.field1341 - field277;
		int var3 = arg0.field1337 * 128 + arg0.field1319 * 64;
		int var4 = arg0.field1339 * 128 + arg0.field1319 * 64;
		arg0.field1347 += (var3 - arg0.field1347) / var2;
		arg0.field1348 += (var4 - arg0.field1348) / var2;
		arg0.field1311 = 0;

		if (arg0.field1343 == 0) {
			arg0.field1328 = 1024;
		}

		if (arg0.field1343 == 1) {
			arg0.field1328 = 1536;
		}

		if (arg0.field1343 == 2) {
			arg0.field1328 = 0;
		}

		if (arg0.field1343 == 3) {
			arg0.field1328 = 512;
		}
	}

	@ObfuscatedName("client.a(LUKYMLOIC;I)V")
	public final void method158(UKYMLOIC arg0) {
		if (field277 == arg0.field1342 || arg0.field1320 == -1 || arg0.field1323 != 0 || arg0.field1322 + 1 > KIRTNGZJ.field1015[arg0.field1320].method445(arg0.field1321)) {
			int var2 = arg0.field1342 - arg0.field1341;
			int var3 = field277 - arg0.field1341;
			int var4 = arg0.field1337 * 128 + arg0.field1319 * 64;
			int var5 = arg0.field1339 * 128 + arg0.field1319 * 64;
			int var6 = arg0.field1338 * 128 + arg0.field1319 * 64;
			int var7 = arg0.field1340 * 128 + arg0.field1319 * 64;
			arg0.field1347 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1348 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1311 = 0;

		if (arg0.field1343 == 0) {
			arg0.field1328 = 1024;
		}

		if (arg0.field1343 == 1) {
			arg0.field1328 = 1536;
		}

		if (arg0.field1343 == 2) {
			arg0.field1328 = 0;
		}

		if (arg0.field1343 == 3) {
			arg0.field1328 = 512;
		}

		arg0.field1349 = arg0.field1328;
	}

	@ObfuscatedName("client.b(LUKYMLOIC;I)V")
	public final void method159(UKYMLOIC arg0) {
		arg0.field1350 = arg0.field1303;
		if (arg0.field1336 == 0) {
			arg0.field1311 = 0;
		} else {
			if (arg0.field1320 != -1 && arg0.field1323 == 0) {
				KIRTNGZJ var2 = KIRTNGZJ.field1015[arg0.field1320];
				if (arg0.field1313 > 0 && var2.field1027 == 0) {
					arg0.field1311++;
					return;
				}

				if (arg0.field1313 <= 0 && var2.field1028 == 0) {
					arg0.field1311++;
					return;
				}
			}

			int var3 = arg0.field1347;
			int var4 = arg0.field1348;
			int var5 = arg0.field1344[arg0.field1336 - 1] * 128 + arg0.field1319 * 64;
			int var6 = arg0.field1345[arg0.field1336 - 1] * 128 + arg0.field1319 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1328 = 1280;
					} else if (var4 > var6) {
						arg0.field1328 = 1792;
					} else {
						arg0.field1328 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1328 = 768;
					} else if (var4 > var6) {
						arg0.field1328 = 256;
					} else {
						arg0.field1328 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1328 = 1024;
				} else {
					arg0.field1328 = 0;
				}

				int var7 = arg0.field1328 - arg0.field1349 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1354;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1353;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1356;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1355;
				}

				if (var8 == -1) {
					var8 = arg0.field1353;
				}

				arg0.field1350 = var8;
				int var9 = 4;
				if (arg0.field1349 != arg0.field1328 && arg0.field1330 == -1 && arg0.field1305 != 0) {
					var9 = 2;
				}

				if (arg0.field1336 > 2) {
					var9 = 6;
				}

				if (arg0.field1336 > 3) {
					var9 = 8;
				}

				if (arg0.field1311 > 0 && arg0.field1336 > 1) {
					var9 = 8;
					arg0.field1311--;
				}

				if (arg0.field1334[arg0.field1336 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1353 == arg0.field1350 && arg0.field1333 != -1) {
					arg0.field1350 = arg0.field1333;
				}

				if (var3 < var5) {
					arg0.field1347 += var9;
					if (arg0.field1347 > var5) {
						arg0.field1347 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1347 -= var9;
					if (arg0.field1347 < var5) {
						arg0.field1347 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1348 += var9;
					if (arg0.field1348 > var6) {
						arg0.field1348 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1348 -= var9;
					if (arg0.field1348 < var6) {
						arg0.field1348 = var6;
					}
				}

				if (arg0.field1347 == var5 && arg0.field1348 == var6) {
					arg0.field1336--;

					if (arg0.field1313 > 0) {
						arg0.field1313--;
						return;
					}
				}
			} else {
				arg0.field1347 = var5;
				arg0.field1348 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(BLUKYMLOIC;)V")
	public final void method160(UKYMLOIC arg0) {
		if (arg0.field1305 != 0) {
			if (arg0.field1330 != -1 && arg0.field1330 < 32768) {
				TKXONZKI var2 = field201[arg0.field1330];
				if (var2 != null) {
					int var3 = arg0.field1347 - var2.field1347;
					int var4 = arg0.field1348 - var2.field1348;
					if (var3 != 0 || var4 != 0) {
						arg0.field1328 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1330 >= 32768) {
				int var5 = arg0.field1330 - 32768;
				if (field337 == var5) {
					var5 = field176;
				}

				GPPDQFCV var6 = field177[var5];
				if (var6 != null) {
					int var7 = arg0.field1347 - var6.field1347;
					int var8 = arg0.field1348 - var6.field1348;
					if (var7 != 0 || var8 != 0) {
						arg0.field1328 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1331 != 0 || arg0.field1332 != 0) && (arg0.field1336 == 0 || arg0.field1311 > 0)) {
				int var9 = arg0.field1347 - (arg0.field1331 - field468 - field468) * 64;
				int var10 = arg0.field1348 - (arg0.field1332 - field469 - field469) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1328 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1331 = 0;
				arg0.field1332 = 0;
			}

			int var11 = arg0.field1328 - arg0.field1349 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1305 || var11 > 2048 - arg0.field1305) {
					arg0.field1349 = arg0.field1328;
				} else if (var11 > 1024) {
					arg0.field1349 -= arg0.field1305;
				} else {
					arg0.field1349 += arg0.field1305;
				}

				arg0.field1349 &= 0x7FF;
				if (arg0.field1350 == arg0.field1303 && arg0.field1349 != arg0.field1328) {
					if (arg0.field1304 != -1) {
						arg0.field1350 = arg0.field1304;
						return;
					}

					arg0.field1350 = arg0.field1353;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(LUKYMLOIC;I)V")
	public final void method161(UKYMLOIC arg0) {
		arg0.field1302 = false;

		if (arg0.field1350 != -1) {
			KIRTNGZJ var2 = KIRTNGZJ.field1015[arg0.field1350];
			arg0.field1352++;
			if (arg0.field1351 < var2.field1016 && arg0.field1352 > var2.method445(arg0.field1351)) {
				arg0.field1352 = 0;
				arg0.field1351++;
			}

			if (arg0.field1351 >= var2.field1016) {
				arg0.field1352 = 0;
				arg0.field1351 = 0;
			}
		}

		if (arg0.field1314 != -1 && field277 >= arg0.field1317) {
			if (arg0.field1315 < 0) {
				arg0.field1315 = 0;
			}

			KIRTNGZJ var3 = UYLUCQNM.field1364[arg0.field1314].field1368;
			arg0.field1316++;
			while (arg0.field1315 < var3.field1016 && arg0.field1316 > var3.method445(arg0.field1315)) {
				arg0.field1316 -= var3.method445(arg0.field1315);
				arg0.field1315++;
			}

			if (arg0.field1315 >= var3.field1016 && (arg0.field1315 < 0 || arg0.field1315 >= var3.field1016)) {
				arg0.field1314 = -1;
			}
		}

		if (arg0.field1320 != -1 && arg0.field1323 <= 1) {
			KIRTNGZJ var4 = KIRTNGZJ.field1015[arg0.field1320];
			if (var4.field1027 == 1 && arg0.field1313 > 0 && arg0.field1341 <= field277 && arg0.field1342 < field277) {
				arg0.field1323 = 1;
				return;
			}
		}

		if (arg0.field1320 != -1 && arg0.field1323 == 0) {
			KIRTNGZJ var5 = KIRTNGZJ.field1015[arg0.field1320];
			arg0.field1322++;
			while (arg0.field1321 < var5.field1016 && arg0.field1322 > var5.method445(arg0.field1321)) {
				arg0.field1322 -= var5.method445(arg0.field1321);
				arg0.field1321++;
			}

			if (arg0.field1321 >= var5.field1016) {
				arg0.field1321 -= var5.field1020;
				arg0.field1324++;
				if (arg0.field1324 >= var5.field1026) {
					arg0.field1320 = -1;
				}

				if (arg0.field1321 < 0 || arg0.field1321 >= var5.field1016) {
					arg0.field1320 = -1;
				}
			}

			arg0.field1302 = var5.field1022;
		}

		if (arg0.field1323 > 0) {
			arg0.field1323--;
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method162() {
		if (field441) {
			field441 = false;
			field228.method290(4, 0, field941);
			field229.method290(357, 0, field941);
			field230.method290(4, 722, field941);
			field231.method290(205, 743, field941);
			field232.method290(0, 0, field941);
			field233.method290(4, 516, field941);
			field234.method290(205, 516, field941);
			field235.method290(357, 496, field941);
			field236.method290(338, 0, field941);
			field366 = true;
			field496 = true;
			field437 = true;
			field523 = true;

			if (field376 != 2) {
				field191.method290(4, 4, field941);
				field190.method290(4, 550, field941);
			}
		}

		if (field376 == 2) {
			method201();
		}

		if (field287 && field384 == 1) {
			field366 = true;
		}

		if (field405 != -1) {
			boolean var1 = method188(field392, field405);
			if (var1) {
				field366 = true;
			}
		}

		if (field342 == 2) {
			field366 = true;
		}

		if (field360 == 2) {
			field366 = true;
		}

		if (field366) {
			method122();
			field366 = false;
		}

		if (field403 == -1) {
			field460.field707 = field206 - field120 - 77;

			if (field949 > 448 && field949 < 560 && field950 > 332) {
				method193(463, 0, field949 - 17, field460, false, 77, field950 - 357, field206);
			}

			int var2 = field206 - field460.field707 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field206 - 77) {
				var2 = field206 - 77;
			}

			if (field120 != var2) {
				field120 = var2;
				field496 = true;
			}

			field335++;
			if (field335 > 79) {
				field335 = 0;
				field521.method33(40);
			}
		}

		if (field403 != -1) {
			boolean var3 = method188(field392, field403);
			if (var3) {
				field496 = true;
			}
		}

		if (field342 == 3) {
			field496 = true;
		}

		if (field360 == 3) {
			field496 = true;
		}

		if (field371 != null) {
			field496 = true;
		}

		if (field287 && field384 == 2) {
			field496 = true;
		}

		if (field496) {
			method144();
			field496 = false;
		}

		if (field376 == 2) {
			method173();
			field190.method290(4, 550, field941);
		}

		if (field261 != -1) {
			field437 = true;
		}

		if (field437) {
			if (field261 != -1 && field261 == field131) {
				field261 = -1;
				field521.method33(86);
				field521.method34(field131);
			}

			field437 = false;
			field320.method289();
			field274.method442(0, 0);

			if (field405 == -1) {
				if (field350[field131] != -1) {
					if (field131 == 0) {
						field478.method442(10, 22);
					}

					if (field131 == 1) {
						field479.method442(8, 54);
					}

					if (field131 == 2) {
						field479.method442(8, 82);
					}

					if (field131 == 3) {
						field480.method442(8, 110);
					}

					if (field131 == 4) {
						field482.method442(8, 153);
					}

					if (field131 == 5) {
						field482.method442(8, 181);
					}

					if (field131 == 6) {
						field481.method442(9, 209);
					}
				}

				if (field350[0] != -1 && (field261 != 0 || field277 % 20 < 10)) {
					field140[0].method442(13, 29);
				}

				if (field350[1] != -1 && (field261 != 1 || field277 % 20 < 10)) {
					field140[1].method442(11, 53);
				}

				if (field350[2] != -1 && (field261 != 2 || field277 % 20 < 10)) {
					field140[2].method442(11, 82);
				}

				if (field350[3] != -1 && (field261 != 3 || field277 % 20 < 10)) {
					field140[3].method442(12, 115);
				}

				if (field350[4] != -1 && (field261 != 4 || field277 % 20 < 10)) {
					field140[4].method442(13, 153);
				}

				if (field350[5] != -1 && (field261 != 5 || field277 % 20 < 10)) {
					field140[5].method442(11, 180);
				}

				if (field350[6] != -1 && (field261 != 6 || field277 % 20 < 10)) {
					field140[6].method442(13, 208);
				}
			}

			field320.method290(160, 516, field941);
			field519++;
			if (field519 > 1334) {
				field519 = 0;
				field521.method33(133);
				field521.method34(0);
				int var4 = field521.field92;
				field521.method34(223);
				field521.method34((int) (Math.random() * 256.0D));
				field521.method35(43763);

				if ((int) (Math.random() * 2.0D) == 0) {
					field521.method34(158);
				}

				field521.method34((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field521.method34(187);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field521.method34(197);
				}

				field521.method35(49718);
				field521.method34((int) (Math.random() * 256.0D));
				field521.method35(61183);
				field521.method43(field521.field92 - var4);
			}

			field319.method289();
			field273.method442(0, 0);

			if (field405 == -1) {
				if (field350[field131] != -1) {
					if (field131 == 7) {
						field329.method442(0, 42);
					}

					if (field131 == 8) {
						field330.method442(0, 74);
					}

					if (field131 == 9) {
						field330.method442(0, 102);
					}

					if (field131 == 10) {
						field331.method442(1, 130);
					}

					if (field131 == 11) {
						field333.method442(0, 173);
					}

					if (field131 == 12) {
						field333.method442(0, 201);
					}

					if (field131 == 13) {
						field332.method442(0, 229);
					}
				}

				if (field350[8] != -1 && (field261 != 8 || field277 % 20 < 10)) {
					field140[7].method442(2, 74);
				}

				if (field350[9] != -1 && (field261 != 9 || field277 % 20 < 10)) {
					field140[8].method442(3, 102);
				}

				if (field350[10] != -1 && (field261 != 10 || field277 % 20 < 10)) {
					field140[9].method442(4, 137);
				}

				if (field350[11] != -1 && (field261 != 11 || field277 % 20 < 10)) {
					field140[10].method442(2, 174);
				}

				if (field350[12] != -1 && (field261 != 12 || field277 % 20 < 10)) {
					field140[11].method442(2, 201);
				}

				if (field350[13] != -1 && (field261 != 13 || field277 % 20 < 10)) {
					field140[12].method442(2, 226);
				}
			}

			field319.method290(466, 496, field941);
			field191.method289();
		}

		if (field523) {
			field523 = false;
			field318.method289();
			field272.method442(0, 0);
			field123.method465(55, "Public chat", 28, 0xFFFFFF, true);

			if (field466 == 0) {
				field123.method465(55, "On", 41, 0xFF00, true);
			}

			if (field466 == 1) {
				field123.method465(55, "Friends", 41, 0xFFFF00, true);
			}

			if (field466 == 2) {
				field123.method465(55, "Off", 41, 0xFF0000, true);
			}

			if (field466 == 3) {
				field123.method465(55, "Hide", 41, 0xFFFF, true);
			}

			field123.method465(184, "Private chat", 28, 0xFFFFFF, true);

			if (field291 == 0) {
				field123.method465(184, "On", 41, 0xFF00, true);
			}

			if (field291 == 1) {
				field123.method465(184, "Friends", 41, 0xFFFF00, true);
			}

			if (field291 == 2) {
				field123.method465(184, "Off", 41, 0xFF0000, true);
			}

			field123.method465(324, "Trade/compete", 28, 0xFFFFFF, true);

			if (field353 == 0) {
				field123.method465(324, "On", 41, 0xFF00, true);
			}

			if (field353 == 1) {
				field123.method465(324, "Friends", 41, 0xFFFF00, true);
			}

			if (field353 == 2) {
				field123.method465(324, "Off", 41, 0xFF0000, true);
			}

			field123.method465(458, "Report abuse", 33, 0xFFFFFF, true);
			field318.method290(453, 0, field941);
			field191.method289();
		}

		field392 = 0;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = GFYXEFQY.field816[var7];
			int var13 = GFYXEFQY.field817[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = GFYXEFQY.field816[var8];
			int var16 = GFYXEFQY.field817[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field267 = arg5 - var9;
		field268 = arg1 - var10;
		field269 = arg2 - var11;
		field270 = arg4;
		field271 = arg0;
	}

	@ObfuscatedName("client.a(BLUKYMLOIC;I)V")
	public final void method164(UKYMLOIC arg0, int arg1) {
		method165(arg0.field1348, arg1, arg0.field1347);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method165(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method194(field375, arg2, arg0) - arg1;
			arg2 -= field267;
			var4 -= field268;
			arg0 -= field269;
			int var5 = GFYXEFQY.field816[field270];
			int var6 = GFYXEFQY.field817[field270];
			int var7 = GFYXEFQY.field816[field271];
			int var8 = GFYXEFQY.field817[field271];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field389 = (var9 << 9) / arg0 + DMXMSPET.field575;
				field390 = (var11 << 9) / arg0 + DMXMSPET.field576;
			} else {
				field389 = -1;
				field390 = -1;
			}
		} else {
			field389 = -1;
			field390 = -1;
		}
	}

	@ObfuscatedName("client.v(I)Z")
	public final boolean method166() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		QVTBMRGW var10 = null;
		for (QVTBMRGW var11 = (QVTBMRGW) field302.method585(); var11 != null; var11 = (QVTBMRGW) field302.method587()) {
			if (var11.field1174 == arg3 && var11.field1176 == arg5 && var11.field1177 == arg4 && var11.field1175 == arg2) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new QVTBMRGW();
			var10.field1174 = arg3;
			var10.field1175 = arg2;
			var10.field1176 = arg5;
			var10.field1177 = arg4;
			method171(var10);
			field302.method582(var10);
		}

		var10.field1167 = arg7;
		var10.field1169 = arg8;
		var10.field1168 = arg6;
		var10.field1173 = arg1;
		var10.field1166 = arg0;
	}

	@ObfuscatedName("client.w(I)Ljava/net/Socket;")
	public final Socket method168(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(IIIILFDUKJGTQ;BI)V")
	public final void method169(int arg0, int arg1, int arg2, int arg3, FDUKJGTQ arg4, int arg5) {
		if (arg4.field667 == 0 && arg4.field696 != null && !arg4.field716 && (arg0 >= arg3 && arg5 >= arg2 && arg0 <= arg4.field694 + arg3 && arg5 <= arg4.field713 + arg2)) {
			int var7 = arg4.field696.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg4.field689[var8] + arg3;
				int var10 = arg4.field676[var8] + arg2 - arg1;
				FDUKJGTQ var11 = FDUKJGTQ.field705[arg4.field696[var8]];
				var9 += var11.field706;
				var10 += var11.field685;
				if ((var11.field710 >= 0 || var11.field702 != 0) && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field694 + var9 && arg5 < var11.field713 + var10) {
					if (var11.field710 >= 0) {
						field121 = var11.field710;
					} else {
						field121 = var11.field673;
					}
				}

				if (var11.field667 == 0) {
					method169(arg0, var11.field707, var10, var9, var11, arg5);

					if (var11.field704 > var11.field713) {
						method193(var11.field694 + var9, var10, arg0, var11, true, var11.field713, arg5, var11.field704);
					}
				} else {
					if (var11.field670 == 1 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field694 + var9 && arg5 < var11.field713 + var10) {
						boolean var12 = false;
						if (var11.field703 != 0) {
							var12 = method211(var11);
						}

						if (!var12) {
							field293[field264] = var11.field723;
							field170[field264] = 710;
							field169[field264] = var11.field673;
							field264++;
						}
					}

					if (var11.field670 == 2 && field488 == 0 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field694 + var9 && arg5 < var11.field713 + var10) {
						String var13 = var11.field720;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field293[field264] = var13 + " @gre@" + var11.field714;
						field170[field264] = 175;
						field169[field264] = var11.field673;
						field264++;
					}

					if (var11.field670 == 3 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field694 + var9 && arg5 < var11.field713 + var10) {
						field293[field264] = "Close";
						field170[field264] = 883;
						field169[field264] = var11.field673;
						field264++;
					}

					if (var11.field670 == 4 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field694 + var9 && arg5 < var11.field713 + var10) {
						field293[field264] = var11.field723;
						field170[field264] = 903;
						field169[field264] = var11.field673;
						field264++;
					}

					if (var11.field670 == 5 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field694 + var9 && arg5 < var11.field713 + var10) {
						field293[field264] = var11.field723;
						field170[field264] = 586;
						field169[field264] = var11.field673;
						field264++;
					}

					if (var11.field670 == 6 && !field183 && arg0 >= var9 && arg5 >= var10 && arg0 < var11.field694 + var9 && arg5 < var11.field713 + var10) {
						field293[field264] = var11.field723;
						field170[field264] = 994;
						field169[field264] = var11.field673;
						field264++;
					}

					if (var11.field667 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field713; var15++) {
							for (int var16 = 0; var16 < var11.field694; var16++) {
								int var17 = (var11.field729 + 32) * var16 + var9;
								int var18 = (var11.field728 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field712[var14];
									var18 += var11.field690[var14];
								}

								if (arg0 >= var17 && arg5 >= var18 && arg0 < var17 + 32 && arg5 < var18 + 32) {
									field372 = var14;
									field373 = var11.field673;

									if (var11.field711[var14] > 0) {
										PTCSWKBP var19 = PTCSWKBP.method489(var11.field711[var14] - 1);
										if (field238 == 1 && var11.field724) {
											if (field240 != var11.field673 || field239 != var14) {
												field293[field264] = "Use " + field242 + " with @lre@" + var19.field1118;
												field170[field264] = 683;
												field171[field264] = var19.field1134;
												field168[field264] = var14;
												field169[field264] = var11.field673;
												field264++;
											}
										} else if (field488 != 1 || !var11.field724) {
											if (var11.field724) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field1152 != null && var19.field1152[var20] != null) {
														field293[field264] = var19.field1152[var20] + " @lre@" + var19.field1118;

														if (var20 == 3) {
															field170[field264] = 894;
														}

														if (var20 == 4) {
															field170[field264] = 369;
														}

														field171[field264] = var19.field1134;
														field168[field264] = var14;
														field169[field264] = var11.field673;
														field264++;
													} else if (var20 == 4) {
														field293[field264] = "Drop @lre@" + var19.field1118;
														field170[field264] = 369;
														field171[field264] = var19.field1134;
														field168[field264] = var14;
														field169[field264] = var11.field673;
														field264++;
													}
												}
											}

											if (var11.field717) {
												field293[field264] = "Use @lre@" + var19.field1118;
												field170[field264] = 979;
												field171[field264] = var19.field1134;
												field168[field264] = var14;
												field169[field264] = var11.field673;
												field264++;
											}

											if (var11.field724 && var19.field1152 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field1152[var21] != null) {
														field293[field264] = var19.field1152[var21] + " @lre@" + var19.field1118;

														if (var21 == 0) {
															field170[field264] = 602;
														}

														if (var21 == 1) {
															field170[field264] = 454;
														}

														if (var21 == 2) {
															field170[field264] = 306;
														}

														field171[field264] = var19.field1134;
														field168[field264] = var14;
														field169[field264] = var11.field673;
														field264++;
													}
												}
											}

											if (var11.field727 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field727[var22] != null) {
														field293[field264] = var11.field727[var22] + " @lre@" + var19.field1118;

														if (var22 == 0) {
															field170[field264] = 848;
														}

														if (var22 == 1) {
															field170[field264] = 672;
														}

														if (var22 == 2) {
															field170[field264] = 808;
														}

														if (var22 == 3) {
															field170[field264] = 365;
														}

														if (var22 == 4) {
															field170[field264] = 881;
														}

														field171[field264] = var19.field1134;
														field168[field264] = var14;
														field169[field264] = var11.field673;
														field264++;
													}
												}
											}

											field293[field264] = "Examine @lre@" + var19.field1118;
											field170[field264] = 1435;
											field171[field264] = var19.field1134;
											field168[field264] = var14;
											field169[field264] = var11.field673;
											field264++;
										} else if ((field490 & 0x10) == 0x10) {
											field293[field264] = field491 + " @lre@" + var19.field1118;
											field170[field264] = 374;
											field171[field264] = var19.field1134;
											field168[field264] = var14;
											field169[field264] = var11.field673;
											field264++;
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

	@ObfuscatedName("client.m(Z)V")
	public final void method170() {
		if (field264 >= 2 || field238 != 0 || field488 != 0) {
			String var1;
			if (field238 == 1 && field264 < 2) {
				var1 = "Use " + field242 + " with...";
			} else if (field488 == 1 && field264 < 2) {
				var1 = field491 + "...";
			} else {
				var1 = field293[field264 - 1];
			}

			if (field264 > 2) {
				var1 = var1 + "@whi@ / " + (field264 - 2) + " more options";
			}

			field124.method473(field277 / 1000, 0xFFFFFF, 15, true, var1, 4);
		}
	}

	@ObfuscatedName("client.a(ZLQVTBMRGW;)V")
	public final void method171(QVTBMRGW arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field1175 == 0) {
			var2 = field343.method533(arg0.field1174, arg0.field1176, arg0.field1177);
		}

		if (arg0.field1175 == 1) {
			var2 = field343.method534(arg0.field1177, arg0.field1176, arg0.field1174);
		}

		if (arg0.field1175 == 2) {
			var2 = field343.method535(arg0.field1174, arg0.field1176, arg0.field1177);
		}

		if (arg0.field1175 == 3) {
			var2 = field343.method536(arg0.field1174, arg0.field1176, arg0.field1177);
		}

		if (var2 != 0) {
			int var6 = field343.method537(arg0.field1174, arg0.field1176, arg0.field1177, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field1170 = var3;
		arg0.field1172 = var4;
		arg0.field1171 = var5;
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method172() {
		int var1 = field416 * 128 + 64;
		int var2 = field417 * 128 + 64;
		int var3 = method194(field375, var1, var2) - field418;

		if (field267 < var1) {
			field267 += (var1 - field267) * field420 / 1000 + field419;
			if (field267 > var1) {
				field267 = var1;
			}
		}

		if (field267 > var1) {
			field267 -= (field267 - var1) * field420 / 1000 + field419;
			if (field267 < var1) {
				field267 = var1;
			}
		}

		if (field268 < var3) {
			field268 += (var3 - field268) * field420 / 1000 + field419;
			if (field268 > var3) {
				field268 = var3;
			}
		}

		if (field268 > var3) {
			field268 -= (field268 - var3) * field420 / 1000 + field419;
			if (field268 < var3) {
				field268 = var3;
			}
		}

		if (field269 < var2) {
			field269 += (var2 - field269) * field420 / 1000 + field419;
			if (field269 > var2) {
				field269 = var2;
			}
		}

		if (field269 > var2) {
			field269 -= (field269 - var2) * field420 / 1000 + field419;
			if (field269 < var2) {
				field269 = var2;
			}
		}

		int var4 = field158 * 128 + 64;
		int var5 = field159 * 128 + 64;
		int var6 = method194(field375, var4, var5) - field160;
		int var7 = var4 - field267;
		int var8 = var6 - field268;
		int var9 = var5 - field269;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field270 < var11) {
			field270 += (var11 - field270) * field162 / 1000 + field161;
			if (field270 > var11) {
				field270 = var11;
			}
		}

		if (field270 > var11) {
			field270 -= (field270 - var11) * field162 / 1000 + field161;
			if (field270 < var11) {
				field270 = var11;
			}
		}

		int var13 = var12 - field271;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field271 += field162 * var13 / 1000 + field161;
			field271 &= 0x7FF;
		}

		if (var13 < 0) {
			field271 -= -var13 * field162 / 1000 + field161;
			field271 &= 0x7FF;
		}

		int var14 = var12 - field271;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field271 = var12;
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method173() {
		field190.method289();

		if (field348 == 2) {
			byte[] var1 = field252.field1006;
			int[] var2 = JJXDTORW.field964;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field199.method433(field357, 256, field285, 33, 25, 0, 33, 0, field322, 25);
			field191.method289();
		} else {
			int var5 = field322 + field309 & 0x7FF;
			int var6 = field477.field1347 / 32 + 48;
			int var7 = 464 - field477.field1348 / 32;
			field281.method433(field144, field492 + 256, field347, 151, var6, 25, 146, 5, var5, var7);
			field199.method433(field357, 256, field285, 33, 25, 0, 33, 0, field322, 25);

			for (int var8 = 0; var8 < field106; var8++) {
				int var9 = field107[var8] * 4 + 2 - field477.field1347 / 32;
				int var10 = field108[var8] * 4 + 2 - field477.field1348 / 32;
				method137(var9, field424[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					WUVIEXOA var13 = field338[field375][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field477.field1347 / 32;
						int var15 = var12 * 4 + 2 - field477.field1348 / 32;
						method137(var14, field409, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field202; var16++) {
				TKXONZKI var17 = field201[field203[var16]];
				if (var17 != null && var17.method368()) {
					BXXPAJNW var18 = var17.field1188;
					if (var18.field69 != null) {
						var18 = var18.method27();
					}

					if (var18 != null && var18.field85) {
						int var19 = var17.field1347 / 32 - field477.field1347 / 32;
						int var20 = var17.field1348 / 32 - field477.field1348 / 32;
						method137(var19, field410, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field178; var21++) {
				GPPDQFCV var22 = field177[field179[var21]];
				if (var22 != null && var22.method368()) {
					int var23 = var22.field1347 / 32 - field477.field1347 / 32;
					int var24 = var22.field1348 / 32 - field477.field1348 / 32;
					boolean var25 = false;
					long var26 = IGDXKDJL.method388(var22.field839);
					for (int var28 = 0; var28 < field368; var28++) {
						if (field451[var28] == var26 && field436[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field477.field844 != 0 && var22.field844 != 0 && field477.field844 == var22.field844) {
						var29 = true;
					}

					if (var25) {
						method137(var23, field412, var24);
					} else if (var29) {
						method137(var23, field413, var24);
					} else {
						method137(var23, field411, var24);
					}
				}
			}

			if (field344 != 0 && field277 % 20 < 10) {
				if (field344 == 1 && field244 >= 0 && field244 < field201.length) {
					TKXONZKI var30 = field201[field244];
					if (var30 != null) {
						int var31 = var30.field1347 / 32 - field477.field1347 / 32;
						int var32 = var30.field1348 / 32 - field477.field1348 / 32;
						method187(field402, var31, var32);
					}
				}

				if (field344 == 2) {
					int var33 = (field379 - field468) * 4 + 2 - field477.field1347 / 32;
					int var34 = (field380 - field469) * 4 + 2 - field477.field1348 / 32;
					method187(field402, var33, var34);
				}

				if (field344 == 10 && field117 >= 0 && field117 < field177.length) {
					GPPDQFCV var35 = field177[field117];
					if (var35 != null) {
						int var36 = var35.field1347 / 32 - field477.field1347 / 32;
						int var37 = var35.field1348 / 32 - field477.field1348 / 32;
						method187(field402, var36, var37);
					}
				}
			}

			if (field279 != 0) {
				int var38 = field279 * 4 + 2 - field477.field1347 / 32;
				int var39 = field280 * 4 + 2 - field477.field1348 / 32;
				method137(var38, field401, var39);
			}

			JJXDTORW.method417(78, 3, 97, 3, 0xFFFFFF);
			field191.method289();
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method174(int arg0) {
		if (!field226) {
			if (DMXMSPET.field589[17] >= arg0) {
				JQZFCGYF var2 = DMXMSPET.field583[17];
				int var3 = var2.field1009 * var2.field1008 - 1;
				int var4 = field392 * var2.field1008 * 2;
				byte[] var5 = var2.field1006;
				byte[] var6 = field115;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field1006 = var6;
				field115 = var5;
				DMXMSPET.method244(17);
			}

			if (DMXMSPET.field589[24] >= arg0) {
				JQZFCGYF var8 = DMXMSPET.field583[24];
				int var9 = var8.field1009 * var8.field1008 - 1;
				int var10 = field392 * var8.field1008 * 2;
				byte[] var11 = var8.field1006;
				byte[] var12 = field115;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field1006 = var12;
				field115 = var11;
				DMXMSPET.method244(24);
				field134++;
				if (field134 > 190) {
					field134 = 0;
					field521.method33(25);
					field521.method34(89);
				}
			}

			if (DMXMSPET.field589[34] >= arg0) {
				JQZFCGYF var14 = DMXMSPET.field583[34];
				int var15 = var14.field1009 * var14.field1008 - 1;
				int var16 = field392 * var14.field1008 * 2;
				byte[] var17 = var14.field1006;
				byte[] var18 = field115;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field1006 = var18;
				field115 = var17;
				DMXMSPET.method244(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method175() {
		for (QVTBMRGW var1 = (QVTBMRGW) field302.method585(); var1 != null; var1 = (QVTBMRGW) field302.method587()) {
			if (var1.field1166 == -1) {
				var1.field1173 = 0;
				method171(var1);
			} else {
				var1.method450();
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method176() {
		signlink.reporterror = false;

		try {
			if (field256 != null) {
				field256.method229();
			}
		} catch (Exception var1) {
		}

		field256 = null;
		method87();

		if (field325 != null) {
			field325.field1196 = false;
		}

		field325 = null;
		field317.method270();
		field317 = null;
		field200 = null;
		field521 = null;
		field132 = null;
		field250 = null;
		field453 = null;
		field227 = null;
		field150 = null;
		field454 = null;
		field455 = null;
		field151 = null;
		field461 = null;
		field343 = null;
		field294 = null;
		field149 = null;
		field355 = null;
		field429 = null;
		field430 = null;
		field115 = null;
		field189 = null;
		field190 = null;
		field191 = null;
		field192 = null;
		field318 = null;
		field319 = null;
		field320 = null;
		field228 = null;
		field229 = null;
		field230 = null;
		field231 = null;
		field232 = null;
		field233 = null;
		field234 = null;
		field235 = null;
		field236 = null;
		field251 = null;
		field252 = null;
		field253 = null;
		field272 = null;
		field273 = null;
		field274 = null;
		field140 = null;
		field478 = null;
		field479 = null;
		field480 = null;
		field481 = null;
		field482 = null;
		field329 = null;
		field330 = null;
		field331 = null;
		field332 = null;
		field333 = null;
		field199 = null;
		field463 = null;
		field370 = null;
		field421 = null;
		field409 = null;
		field410 = null;
		field411 = null;
		field412 = null;
		field413 = null;
		field255 = null;
		field118 = null;
		field351 = null;
		field177 = null;
		field179 = null;
		field181 = null;
		field182 = null;
		field298 = null;
		field201 = null;
		field203 = null;
		field338 = null;
		field302 = null;
		field398 = null;
		field299 = null;
		field168 = null;
		field169 = null;
		field170 = null;
		field171 = null;
		field293 = null;
		field336 = null;
		field107 = null;
		field108 = null;
		field424 = null;
		field281 = null;
		field283 = null;
		field451 = null;
		field436 = null;
		field212 = null;
		field213 = null;
		field209 = null;
		field210 = null;
		field211 = null;
		field214 = null;
		field215 = null;
		field216 = null;
		field217 = null;
		method179();
		VCGOMUBN.method570();
		BXXPAJNW.method30();
		PTCSWKBP.method499();
		CMUBOYNL.field531 = null;
		IDSYSMIG.field909 = null;
		FDUKJGTQ.field705 = null;
		SUISWUJC.field1178 = null;
		KIRTNGZJ.field1015 = null;
		UYLUCQNM.field1364 = null;
		UYLUCQNM.field1376 = null;
		DIPZNIAB.field556 = null;
		field942 = null;
		GPPDQFCV.field838 = null;
		DMXMSPET.method237();
		UGKPKMOJ.method506();
		GFYXEFQY.method337();
		ERVJQNCY.method280();
		System.gc();
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method177(boolean arg0) {
		method130();
		field211.method289();
		field258.method442(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field139 == 0) {
			int var4 = var3 / 2 + 80;
			field122.method465(var2 / 2, field317.field642, var4, 0x75A9A9, true);
			int var5 = var3 / 2 - 20;
			field124.method465(var2 / 2, "Welcome to RuneScape", var5, 0xFFFF00, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field259.method442(var7 - 20, var6 - 73);
			field124.method465(var6, "New User", var7 + 5, 0xFFFFFF, true);
			int var8 = var2 / 2 + 80;
			field259.method442(var7 - 20, var8 - 73);
			field124.method465(var8, "Existing User", var7 + 5, 0xFFFFFF, true);
		}

		if (field139 == 2) {
			int var9 = var3 / 2 - 40;
			if (field513.length() > 0) {
				field124.method465(var2 / 2, field513, var9 - 15, 0xFFFF00, true);
				field124.method465(var2 / 2, field514, var9, 0xFFFF00, true);
				var9 += 30;
			} else {
				field124.method465(var2 / 2, field514, var9 - 7, 0xFFFF00, true);
				var9 += 30;
			}

			field124.method472(var2 / 2 - 90, true, 0xFFFFFF, var9, "Username: " + field104 + (field510 == 0 & field277 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field124.method472(var2 / 2 - 88, true, 0xFFFFFF, var9, "Password: " + IGDXKDJL.method393(field105) + (field510 == 1 & field277 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field259.method442(var11 - 20, var10 - 73);
				field124.method465(var10, "Login", var11 + 5, 0xFFFFFF, true);
				int var12 = var2 / 2 + 80;
				field259.method442(var11 - 20, var12 - 73);
				field124.method465(var12, "Cancel", var11 + 5, 0xFFFFFF, true);
			}
		}

		if (field139 == 3) {
			field124.method465(var2 / 2, "Create a free account", var3 / 2 - 60, 0xFFFF00, true);
			int var13 = var3 / 2 - 35;
			field124.method465(var2 / 2, "To create a new account you need to", var13, 0xFFFFFF, true);
			var13 += 15;
			field124.method465(var2 / 2, "go back to the main RuneScape webpage", var13, 0xFFFFFF, true);
			var13 += 15;
			field124.method465(var2 / 2, "and choose the red 'create account'", var13, 0xFFFFFF, true);
			var13 += 15;
			field124.method465(var2 / 2, "button at the top right of that page.", var13, 0xFFFFFF, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field259.method442(var15 - 20, var14 - 73);
			field124.method465(var14, "Cancel", var15 + 5, 0xFFFFFF, true);
		}

		field211.method290(171, 202, field941);

		if (field441) {
			field441 = false;
			field209.method290(0, 128, field941);
			field210.method290(371, 202, field941);
			field214.method290(265, 0, field941);
			field215.method290(265, 562, field941);
			field216.method290(171, 128, field941);
			field217.method290(171, 562, field941);
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method178() {
		for (int var1 = -1; var1 < field178; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field176;
			} else {
				var2 = field179[var1];
			}

			GPPDQFCV var3 = field177[var2];
			if (var3 != null && var3.field1335 > 0) {
				var3.field1335--;
				if (var3.field1335 == 0) {
					var3.field1307 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field202; var4++) {
			int var5 = field203[var4];
			TKXONZKI var6 = field201[var5];
			if (var6 != null && var6.field1335 > 0) {
				var6.field1335--;
				if (var6.field1335 == 0) {
					var6.field1307 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method179() {
		field311 = false;
		while (field438) {
			field311 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field258 = null;
		field259 = null;
		field133 = null;
		field110 = null;
		field111 = null;
		field112 = null;
		field113 = null;
		field307 = null;
		field308 = null;
		field528 = null;
		field529 = null;
		field422 = null;
		field423 = null;
	}

	@ObfuscatedName("client.a(IIBIIIIIZIII)Z")
	public final boolean method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field149[var14][var15] = 0;
				field355[var14][var15] = 99999999;
			}
		}

		int var16 = arg6;
		int var17 = arg5;
		field149[arg6][arg5] = 99;
		field355[arg6][arg5] = 0;
		byte var18 = 0;
		int var19 = 0;
		field429[var18] = arg6;
		int var35 = var18 + 1;
		field430[var18] = arg5;
		boolean var20 = false;
		int var21 = field429.length;
		int[][] var22 = field294[field375].field1092;
		while (var35 != var19) {
			var16 = field429[var19];
			var17 = field430[var19];
			var19 = (var19 + 1) % var21;

			if (arg10 == var16 && arg3 == var17) {
				var20 = true;
				break;
			}

			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && field294[field375].method460(var16, var17, arg4, arg3, arg10, arg8 - 1)) {
					var20 = true;
					break;
				}

				if (arg8 < 10 && field294[field375].method461(arg10, arg8 - 1, arg3, var16, arg4, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg2 != 0 && arg1 != 0 && field294[field375].method462(arg9, arg3, var16, arg1, var17, arg10, arg2)) {
				var20 = true;
				break;
			}

			int var23 = field355[var16][var17] + 1;
			if (var16 > 0 && field149[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field429[var35] = var16 - 1;
				field430[var35] = var17;
				var35 = (var35 + 1) % var21;
				field149[var16 - 1][var17] = 2;
				field355[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field149[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field429[var35] = var16 + 1;
				field430[var35] = var17;
				var35 = (var35 + 1) % var21;
				field149[var16 + 1][var17] = 8;
				field355[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field149[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field429[var35] = var16;
				field430[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field149[var16][var17 - 1] = 1;
				field355[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field149[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field429[var35] = var16;
				field430[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field149[var16][var17 + 1] = 4;
				field355[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field149[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field429[var35] = var16 - 1;
				field430[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field149[var16 - 1][var17 - 1] = 3;
				field355[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field149[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field429[var35] = var16 + 1;
				field430[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field149[var16 + 1][var17 - 1] = 9;
				field355[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field149[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field429[var35] = var16 - 1;
				field430[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field149[var16 - 1][var17 + 1] = 6;
				field355[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field149[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field429[var35] = var16 + 1;
				field430[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field149[var16 + 1][var17 + 1] = 12;
				field355[var16 + 1][var17 + 1] = var23;
			}
		}

		field141 = 0;
		if (!var20) {
			if (arg7) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg10 - var25; var26 <= arg10 + var25; var26++) {
						for (int var27 = arg3 - var25; var27 <= arg3 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field355[var26][var27] < var24) {
								var24 = field355[var26][var27];
								var16 = var26;
								var17 = var27;
								field141 = 1;
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
		field429[var28] = var16;
		int var36 = var28 + 1;
		field430[var28] = var17;
		int var29;
		int var30 = var29 = field149[var16][var17];
		while (arg6 != var16 || arg5 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field429[var36] = var16;
				field430[var36++] = var17;
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

			var30 = field149[var16][var17];
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
		int var32 = field429[var36];
		int var33 = field430[var36];
		field400 += var31;
		if (field400 >= 81) {
			field521.method33(135);
			field521.method34(54);
			field400 = 0;
		}

		if (arg0 == 0) {
			field521.method33(39);
			field521.method34(var31 + var31 + 3);
		}

		if (arg0 == 1) {
			field521.method33(82);
			field521.method34(var31 + var31 + 3 + 14);
		}

		if (arg0 == 2) {
			field521.method33(144);
			field521.method34(var31 + var31 + 3);
		}

		field521.method70(field468 + var32);
		field521.method35(field469 + var33);
		field279 = field429[0];
		field280 = field430[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field521.method61(field429[var36] - var32);
			field521.method60(field430[var36] - var33);
		}

		field521.method61(field959[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;I)V")
	public final void method181(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && field365 != -1) {
			field371 = arg1;
			field955 = 0;
		}

		if (field403 == -1) {
			field496 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field304[var4] = field304[var4 - 1];
			field305[var4] = field305[var4 - 1];
			field306[var4] = field306[var4 - 1];
		}

		field304[0] = arg2;
		field305[0] = arg0;
		field306[0] = arg1;
	}

	@ObfuscatedName("client.c(ZI)Z")
	public final boolean method182(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field170[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 144) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ILCKBTFRZM;IILGPPDQFCV;)V")
	public final void method183(CKBTFRZM arg0, int arg1, int arg2, GPPDQFCV arg3) {
		if ((arg2 & 0x400) != 0) {
			arg3.field1314 = arg0.method46();
			int var5 = arg0.method78();
			arg3.field1318 = var5 >> 16;
			arg3.field1317 = (var5 & 0xFFFF) + field277;
			arg3.field1315 = 0;
			arg3.field1316 = 0;

			if (arg3.field1317 > field277) {
				arg3.field1315 = -1;
			}

			if (arg3.field1314 == 0xFFFF) {
				arg3.field1314 = -1;
			}
		}

		if ((arg2 & 0x40) != 0) {
			int var6 = arg0.method64();
			byte[] var7 = new byte[var6];
			CKBTFRZM var8 = new CKBTFRZM(var7);
			arg0.method53(var7, 0, var6);
			field182[arg1] = var8;
			arg3.method367(var8);
		}

		if ((arg2 & 0x80) != 0) {
			arg3.field1330 = arg0.method71();
			if (arg3.field1330 == 0xFFFF) {
				arg3.field1330 = -1;
			}
		}

		if ((arg2 & 0x100) != 0) {
			int var9 = arg0.method62();
			int var10 = arg0.method62();
			arg3.method558(var9, var10, field277);
			arg3.field1308 = field277 + 300;
			arg3.field1309 = arg0.method44();
			arg3.field1310 = arg0.method64();
		}

		if ((arg2 & 0x8) != 0) {
			int var11 = arg0.method73();
			if (var11 == 0xFFFF) {
				var11 = -1;
			}

			int var12 = arg0.method62();
			if (arg3.field1320 == var11 && var11 != -1) {
				int var13 = KIRTNGZJ.field1015[var11].field1029;
				if (var13 == 1) {
					arg3.field1321 = 0;
					arg3.field1322 = 0;
					arg3.field1323 = var12;
					arg3.field1324 = 0;
				}

				if (var13 == 2) {
					arg3.field1324 = 0;
				}
			} else if (var11 == -1 || arg3.field1320 == -1 || KIRTNGZJ.field1015[var11].field1023 >= KIRTNGZJ.field1015[arg3.field1320].field1023) {
				arg3.field1320 = var11;
				arg3.field1321 = 0;
				arg3.field1322 = 0;
				arg3.field1323 = var12;
				arg3.field1324 = 0;
				arg3.field1313 = arg3.field1336;
			}
		}

		if ((arg2 & 0x20) != 0) {
			arg3.field1307 = arg0.method51();
			if (arg3.field1307.charAt(0) == '~') {
				arg3.field1307 = arg3.field1307.substring(1);
				method181(arg3.field839, arg3.field1307, 2);
			} else if (field477 == arg3) {
				method181(arg3.field839, arg3.field1307, 2);
			}

			arg3.field1306 = 0;
			arg3.field1312 = 0;
			arg3.field1335 = 150;
		}

		if ((arg2 & 0x1) != 0) {
			int var14 = arg0.method62();
			int var15 = arg0.method64();
			arg3.method558(var14, var15, field277);
			arg3.field1308 = field277 + 300;
			arg3.field1309 = arg0.method62();
			arg3.field1310 = arg0.method63();
		}

		if ((arg2 & 0x2) != 0) {
			arg3.field1331 = arg0.method71();
			arg3.field1332 = arg0.method72();
		}

		if ((arg2 & 0x200) != 0) {
			arg3.field1337 = arg0.method63();
			arg3.field1339 = arg0.method44();
			arg3.field1338 = arg0.method64();
			arg3.field1340 = arg0.method64();
			arg3.field1341 = arg0.method73() + field277;
			arg3.field1342 = arg0.method73() + field277;
			arg3.field1343 = arg0.method44();
			arg3.method560();
		}

		if ((arg2 & 0x4) != 0) {
			int var16 = arg0.method71();
			int var17 = arg0.method62();
			int var18 = arg0.method63();
			int var19 = arg0.field92;

			if (arg3.field839 != null && arg3.field836) {
				long var20 = IGDXKDJL.method388(arg3.field839);
				boolean var22 = false;
				if (var17 <= 1) {
					for (int var23 = 0; var23 < field406; var23++) {
						if (field443[var23] == var20) {
							var22 = true;
							break;
						}
					}
				}

				if (!var22 && field193 == 0) {
					try {
						field200.field92 = 0;
						arg0.method82(var18, 0, field200.field91);
						field200.field92 = 0;
						String var24 = IDJBPKZF.method379(var18, field200);
						var24 = FZULSWUT.method305(var24);
						arg3.field1307 = var24;
						arg3.field1306 = var16 >> 8;
						arg3.field1312 = var16 & 0xFF;
						arg3.field1335 = 150;

						if (var17 == 2 || var17 == 3) {
							method181("@cr2@" + arg3.field839, var24, 1);
						} else if (var17 == 1) {
							method181("@cr1@" + arg3.field839, var24, 1);
						} else {
							method181(arg3.field839, var24, 2);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field92 = var18 + var19;
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method184() {
		try {
			int var1 = field477.field1347 + field315;
			int var2 = field477.field1348 + field163;
			if (field393 - var1 < -500 || field393 - var1 > 500 || field394 - var2 < -500 || field394 - var2 > 500) {
				field393 = var1;
				field394 = var2;
			}

			if (field393 != var1) {
				field393 += (var1 - field393) / 16;
			}

			if (field394 != var2) {
				field394 += (var2 - field394) / 16;
			}

			if (field959[1] == 1) {
				field323 += (-field323 - 24) / 2;
			} else if (field959[2] == 1) {
				field323 += (24 - field323) / 2;
			} else {
				field323 /= 2;
			}

			if (field959[3] == 1) {
				field324 += (12 - field324) / 2;
			} else if (field959[4] == 1) {
				field324 += (-field324 - 12) / 2;
			} else {
				field324 /= 2;
			}

			field322 = field323 / 2 + field322 & 0x7FF;
			field321 += field324 / 2;
			if (field321 < 128) {
				field321 = 128;
			}

			if (field321 > 383) {
				field321 = 383;
			}

			int var3 = field393 >> 7;
			int var4 = field394 >> 7;
			int var5 = method194(field375, field393, field394);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field375;
						if (var9 < 3 && (field461[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field151[var9][var7][var8];
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

			if (var11 > field391) {
				field391 += (var11 - field391) / 24;
			} else if (var11 < field391) {
				field391 += (var11 - field391) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field477.field1347 + "," + field477.field1348 + "," + field393 + "," + field394 + "," + field185 + "," + field186 + "," + field468 + "," + field469);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method185(int arg0) {
		FDUKJGTQ var2 = FDUKJGTQ.field705[arg0];
		for (int var3 = 0; var3 < var2.field696.length && var2.field696[var3] != -1; var3++) {
			FDUKJGTQ var4 = FDUKJGTQ.field705[var2.field696[var3]];
			if (var4.field667 == 1) {
				method185(var4.field673);
			}

			var4.field674 = 0;
			var4.field693 = 0;
		}
	}

	@ObfuscatedName("client.a(LJQZFCGYF;I)V")
	public final void method186(JQZFCGYF arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field307.length; var3++) {
			field307[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field307[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field308[var9] = (field307[var9 - 1] + field307[var9 + 1] + field307[var9 - 128] + field307[var9 + 128]) / 4;
				}
			}

			int[] var10 = field307;
			field307 = field308;
			field308 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1009; var12++) {
				for (int var13 = 0; var13 < arg0.field1008; var13++) {
					if (arg0.field1006[var11++] != 0) {
						int var14 = var13 + arg0.field1010 + 16;
						int var15 = var12 + arg0.field1011 + 16;
						int var16 = (var15 << 7) + var14;
						field307[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LJONKABPT;III)V")
	public final void method187(JONKABPT arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field322 + field309 & 0x7FF;
			int var6 = GFYXEFQY.field816[var5];
			int var7 = GFYXEFQY.field817[var5];
			var6 = var6 * 256 / (field492 + 256);
			var7 = var7 * 256 / (field492 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field483.method434(83 - var13 - 20, 20, 15, 20, 256, 15, var12 + 94 + 4 - 10, var10);
		} else {
			method137(arg1, arg0, arg2);
		}
	}

	@ObfuscatedName("client.a(IIZ)Z")
	public final boolean method188(int arg0, int arg1) {
		boolean var3 = false;
		FDUKJGTQ var4 = FDUKJGTQ.field705[arg1];
		for (int var5 = 0; var5 < var4.field696.length && var4.field696[var5] != -1; var5++) {
			FDUKJGTQ var6 = FDUKJGTQ.field705[var4.field696[var5]];
			if (var6.field667 == 1) {
				var3 |= method188(arg0, var6.field673);
			}

			if (var6.field667 == 6 && (var6.field725 != -1 || var6.field726 != -1)) {
				boolean var7 = method214(var6);
				int var8;
				if (var7) {
					var8 = var6.field726;
				} else {
					var8 = var6.field725;
				}

				if (var8 != -1) {
					KIRTNGZJ var9 = KIRTNGZJ.field1015[var8];
					var6.field693 += arg0;
					while (var6.field693 > var9.method445(var6.field674)) {
						var6.field693 -= var9.method445(var6.field674) + 1;
						var6.field674++;
						if (var6.field674 >= var9.field1016) {
							var6.field674 -= var9.field1020;
							if (var6.field674 < 0 || var6.field674 >= var9.field1016) {
								var6.field674 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.x(I)V")
	public void method189() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field130);

		if (field317 != null) {
			System.out.println("Od-cycle:" + field317.field638);
		}

		System.out.println("loop-cycle:" + field277);
		System.out.println("draw-cycle:" + field146);
		System.out.println("ptype:" + field154);
		System.out.println("psize:" + field153);

		if (field256 != null) {
			field256.method234();
		}

		field938 = true;
	}

	@ObfuscatedName("client.c(I)Ljava/awt/Component;")
	public final Component method190() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field944 != null) {
			return field944;
		}

		return this;
	}

	@ObfuscatedName("client.y(I)V")
	public final void method191() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field528[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field528[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field529[var10] = (field528[var10 - 1] + field528[var10 + 1] + field528[var10 - 128] + field528[var10 + 128]) / 4;
			}
		}

		field354 += 128;
		if (field354 > field307.length) {
			field354 -= field307.length;
			int var11 = (int) (Math.random() * 12.0D);
			method186(field133[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field529[var14 + 128] - field307[field354 + var14 & field307.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field528[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field404[var16] = field404[var16 + 1];
		}

		field404[var1 - 1] = (int) (Math.sin(field277 / 14.0D) * 16.0D + Math.sin(field277 / 15.0D) * 14.0D + Math.sin(field277 / 16.0D) * 12.0D);

		if (field313 > 0) {
			field313 -= 4;
		}

		if (field314 > 0) {
			field314 -= 4;
		}

		if (field313 == 0 && field314 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field313 = 1024;
			}

			if (var17 == 1) {
				field314 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method192() {
		Graphics var1 = method190().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method402(1);

		if (field345) {
			field311 = false;
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
			field311 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field487) {
			field311 = false;
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

	@ObfuscatedName("client.a(IIILFDUKJGTQ;ZIIII)V")
	public final void method193(int arg0, int arg1, int arg2, FDUKJGTQ arg3, boolean arg4, int arg5, int arg6, int arg7) {
		if (field449) {
			field448 = 32;
		} else {
			field448 = 0;
		}

		field449 = false;
		if (arg2 >= arg0 && arg2 < arg0 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
			arg3.field707 -= field243 * 4;

			if (arg4) {
				field366 = true;
				return;
			}
		} else if (arg2 >= arg0 && arg2 < arg0 + 16 && arg6 >= arg1 + arg5 - 16 && arg6 < arg1 + arg5) {
			arg3.field707 += field243 * 4;

			if (arg4) {
				field366 = true;
				return;
			}
		} else if (arg2 >= arg0 - field448 && arg2 < arg0 + field448 + 16 && arg6 >= arg1 + 16 && arg6 < arg1 + arg5 - 16 && field243 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg1 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg3.field707 = (arg7 - arg5) * var10 / var11;

			if (arg4) {
				field366 = true;
			}

			field449 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method194(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field461[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field151[var6][var4][var5] + field151[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field151[var6][var4][var5 + 1] + field151[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method195(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field513 = "";
				field514 = "Connecting to server...";
				method177(true);
			}

			field256 = new CWPTWZXW(this, method168(field224 + 43594));
			long var4 = IGDXKDJL.method388(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field521.field92 = 0;
			field521.method34(14);
			field521.method34(var6);
			field256.method233(field521.field91, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field256.method230();
			}

			int var8 = field256.method230();
			int var9 = var8;

			if (var8 == 0) {
				field256.method232(field250.field91, 0, 8);
				field250.field92 = 0;
				field452 = field250.method50();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field452 >> 32), (int) field452 };
				field521.field92 = 0;
				field521.method34(10);
				field521.method38(var10[0]);
				field521.method38(var10[1]);
				field521.method38(var10[2]);
				field521.method38(var10[3]);
				field521.method38(signlink.uid);
				field521.method41(arg0);
				field521.method41(arg1);
				field521.method59(field237, field517);
				field132.field92 = 0;

				if (arg2) {
					field132.method34(18);
				} else {
					field132.method34(16);
				}

				field132.method34(field521.field92 + 36 + 1 + 1 + 2);
				field132.method34(255);
				field132.method35(309);
				field132.method34(field226 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field132.method38(field515[var11]);
				}

				field132.method42(field521.field91, 0, field521.field92);
				field521.field96 = new PJNVYQWL(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field349 = new PJNVYQWL(var10);
				field256.method233(field132.field91, field132.field92, 0);
				var8 = field256.method230();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method195(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field194 = field256.method230();
				field378 = field256.method230() == 1;
				field303 = 0L;
				field374 = 0;
				field325.field1193 = 0;
				field946 = true;
				field364 = true;
				field439 = true;
				field521.field92 = 0;
				field250.field92 = 0;
				field154 = -1;
				field484 = -1;
				field485 = -1;
				field486 = -1;
				field153 = 0;
				field155 = 0;
				field195 = 0;
				field157 = 0;
				field344 = 0;
				field264 = 0;
				field287 = false;
				field947 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field306[var13] = null;
				}

				field238 = 0;
				field488 = 0;
				field376 = 0;
				field254 = 0;
				field315 = (int) (Math.random() * 100.0D) - 50;
				field163 = (int) (Math.random() * 110.0D) - 55;
				field494 = (int) (Math.random() * 80.0D) - 40;
				field309 = (int) (Math.random() * 120.0D) - 60;
				field492 = (int) (Math.random() * 30.0D) - 20;
				field322 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field348 = 0;
				field128 = -1;
				field279 = 0;
				field280 = 0;
				field178 = 0;
				field202 = 0;

				for (int var14 = 0; var14 < field175; var14++) {
					field177[var14] = null;
					field182[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field201[var15] = null;
				}

				field477 = field177[field176] = new GPPDQFCV();
				field398.method589();
				field299.method589();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field338[var16][var17][var18] = null;
						}
					}
				}

				field302 = new WUVIEXOA();
				field369 = 0;
				field368 = 0;
				field365 = -1;
				field403 = -1;
				field219 = -1;
				field405 = -1;
				field204 = -1;
				field183 = false;
				field131 = 3;
				field408 = 0;
				field287 = false;
				field507 = false;
				field371 = null;
				field363 = 0;
				field261 = -1;
				field397 = true;
				method91();

				for (int var19 = 0; var19 < 5; var19++) {
					field262[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field464[var20] = null;
					field465[var20] = false;
				}

				field400 = 0;
				field286 = 0;
				field249 = 0;
				field127 = 0;
				field518 = 0;
				field427 = 0;
				field522 = 0;
				field367 = 0;
				method212();
			} else if (var8 == 3) {
				field513 = "";
				field514 = "Invalid username or password.";
			} else if (var8 == 4) {
				field513 = "Your account has been disabled.";
				field514 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field513 = "Your account is already logged in.";
				field514 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field513 = "RuneScape has been updated!";
				field514 = "Please reload this page.";
			} else if (var8 == 7) {
				field513 = "This world is full.";
				field514 = "Please use a different world.";
			} else if (var8 == 8) {
				field513 = "Unable to connect.";
				field514 = "Login server offline.";
			} else if (var8 == 9) {
				field513 = "Login limit exceeded.";
				field514 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field513 = "Unable to connect.";
				field514 = "Bad session id.";
			} else if (var8 == 11) {
				field514 = "Login server rejected session.";
				field514 = "Please try again.";
			} else if (var8 == 12) {
				field513 = "You need a members account to login to this world.";
				field514 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field513 = "Could not complete login.";
				field514 = "Please try using a different world.";
			} else if (var8 == 14) {
				field513 = "The server is being updated.";
				field514 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field439 = true;
				field521.field92 = 0;
				field250.field92 = 0;
				field154 = -1;
				field484 = -1;
				field485 = -1;
				field486 = -1;
				field153 = 0;
				field155 = 0;
				field195 = 0;
				field264 = 0;
				field287 = false;
				field467 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field513 = "Login attempts exceeded.";
				field514 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field513 = "You are standing in a members-only area.";
				field514 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field513 = "Invalid loginserver requested";
				field514 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field256.method230(); var21 >= 0; var21--) {
					field513 = "You have only just left another world";
					field514 = "Your profile will be transferred in: " + var21 + " seconds";
					method177(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method195(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field513 = "Unexpected server response";
				field514 = "Please try using a different world.";
			} else if (var9 != 0) {
				field513 = "No response from server";
				field514 = "Please try using a different world.";
			} else if (field173 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field173++;
				method195(arg0, arg1, arg2);
			} else {
				field513 = "No response from loginserver";
				field514 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field513 = "";
			field514 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.d(IILCKBTFRZM;)V")
	public final void method196(int arg0, CKBTFRZM arg1) {
		while (arg1.field93 + 10 < arg0 * 8) {
			int var3 = arg1.method55(11);
			if (var3 == 2047) {
				break;
			}

			if (field177[var3] == null) {
				field177[var3] = new GPPDQFCV();
				if (field182[var3] != null) {
					field177[var3].method367(field182[var3]);
				}
			}

			field179[field178++] = var3;
			GPPDQFCV var4 = field177[var3];
			var4.field1329 = field277;
			int var5 = arg1.method55(1);
			if (var5 == 1) {
				field181[field180++] = var3;
			}

			int var6 = arg1.method55(1);
			int var7 = arg1.method55(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method55(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method559(field477.field1345[0] + var8, field477.field1344[0] + var7, var6 == 1);
		}

		arg1.method56();
	}

	@ObfuscatedName("client.a()V")
	public final void method197() {
		method200("Starting up", 20);

		if (signlink.sunjava) {
			field935 = 5;
		}

		if (field527) {
			field487 = true;
		} else {
			field527 = true;
			boolean var1 = false;
			String var2 = method125();
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
						field292[var3] = new ICYHAEVI(500000, var3 + 1, signlink.cache_dat, signlink.cache_idx[var3]);
					}
				}

				try {
					method147();
					field516 = method220(1, "title screen", "title", field515[1], 25);
					field122 = new OSNNCWUM(field516, "p11_full", false);
					field123 = new OSNNCWUM(field516, "p12_full", false);
					field124 = new OSNNCWUM(field516, "b12_full", false);
					field125 = new OSNNCWUM(field516, "q8_full", true);
					method213();
					method105();
					EAXVDNXA var4 = method220(2, "config", "config", field515[2], 30);
					EAXVDNXA var5 = method220(3, "interface", "interface", field515[3], 35);
					EAXVDNXA var6 = method220(4, "2d graphics", "media", field515[4], 40);
					EAXVDNXA var7 = method220(6, "textures", "textures", field515[6], 45);
					EAXVDNXA var8 = method220(7, "chat system", "wordenc", field515[7], 50);
					EAXVDNXA var9 = method220(8, "sound effects", "sounds", field515[8], 55);
					field461 = new byte[4][104][104];
					field151 = new int[4][105][105];
					field343 = new UGKPKMOJ(104, 4, 104, field151);

					for (int var10 = 0; var10 < 4; var10++) {
						field294[var10] = new ONADPAJP(104, 104);
					}

					field281 = new JONKABPT(512, 512);
					EAXVDNXA var11 = method220(5, "update list", "versionlist", field515[5], 60);
					method200("Connecting to update server", 60);
					field317 = new EEDCHWRL();
					field317.method267(var11, this);
					ERVJQNCY.method278(field317.method272());
					GFYXEFQY.method338(field317.method276(0), field317);

					if (!field226) {
						field327 = 0;
						try {
							field327 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field328 = true;
						field317.method259(2, field327);

						while (field317.method268() > 0) {
							method109();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field317.field635 > 3) {
								method110("ondemand");
								return;
							}
						}
					}

					method200("Requesting animations", 65);
					int var12 = field317.method276(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field317.method259(1, var13);
					}

					while (field317.method268() > 0) {
						int var14 = var12 - field317.method268();
						if (var14 > 0) {
							method200("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method109();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field317.field635 > 3) {
							method110("ondemand");
							return;
						}
					}

					method200("Requesting models", 70);
					int var15 = field317.method276(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field317.method258(var16);
						if ((var17 & 0x1) != 0) {
							field317.method259(0, var16);
						}
					}

					int var18 = field317.method268();
					while (field317.method268() > 0) {
						int var19 = var18 - field317.method268();
						if (var19 > 0) {
							method200("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method109();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field292[0] != null) {
						method200("Requesting maps", 75);
						field317.method259(3, field317.method260(0, 48, 47));
						field317.method259(3, field317.method260(1, 48, 47));
						field317.method259(3, field317.method260(0, 48, 48));
						field317.method259(3, field317.method260(1, 48, 48));
						field317.method259(3, field317.method260(0, 48, 49));
						field317.method259(3, field317.method260(1, 48, 49));
						field317.method259(3, field317.method260(0, 47, 47));
						field317.method259(3, field317.method260(1, 47, 47));
						field317.method259(3, field317.method260(0, 47, 48));
						field317.method259(3, field317.method260(1, 47, 48));
						field317.method259(3, field317.method260(0, 148, 48));
						field317.method259(3, field317.method260(1, 148, 48));
						int var20 = field317.method268();
						while (field317.method268() > 0) {
							int var21 = var20 - field317.method268();
							if (var21 > 0) {
								method200("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method109();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field317.method276(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field317.method258(var23);
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
							field317.method271(0, var23, var25);
						}
					}

					field317.method262(field225);

					if (!field226) {
						int var26 = field317.method276(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field317.method261(var27)) {
								field317.method271(2, var27, (byte) 1);
							}
						}
					}

					method200("Unpacking media", 80);
					field251 = new JQZFCGYF(var6, "invback", 0);
					field253 = new JQZFCGYF(var6, "chatback", 0);
					field252 = new JQZFCGYF(var6, "mapback", 0);
					field272 = new JQZFCGYF(var6, "backbase1", 0);
					field273 = new JQZFCGYF(var6, "backbase2", 0);
					field274 = new JQZFCGYF(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field140[var28] = new JQZFCGYF(var6, "sideicons", var28);
					}

					field199 = new JONKABPT(var6, "compass", 0);
					field483 = new JONKABPT(var6, "mapedge", 0);
					field483.method426();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field255[var29] = new JQZFCGYF(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field118[var30] = new JONKABPT(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field463[var31] = new JONKABPT(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field370[var32] = new JONKABPT(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field401 = new JONKABPT(var6, "mapmarker", 0);
					field402 = new JONKABPT(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field421[var33] = new JONKABPT(var6, "cross", var33);
					}

					field409 = new JONKABPT(var6, "mapdots", 0);
					field410 = new JONKABPT(var6, "mapdots", 1);
					field411 = new JONKABPT(var6, "mapdots", 2);
					field412 = new JONKABPT(var6, "mapdots", 3);
					field413 = new JONKABPT(var6, "mapdots", 4);
					field165 = new JQZFCGYF(var6, "scrollbar", 0);
					field166 = new JQZFCGYF(var6, "scrollbar", 1);
					field478 = new JQZFCGYF(var6, "redstone1", 0);
					field479 = new JQZFCGYF(var6, "redstone2", 0);
					field480 = new JQZFCGYF(var6, "redstone3", 0);
					field481 = new JQZFCGYF(var6, "redstone1", 0);
					field481.method439();
					field482 = new JQZFCGYF(var6, "redstone2", 0);
					field482.method439();
					field329 = new JQZFCGYF(var6, "redstone1", 0);
					field329.method440();
					field330 = new JQZFCGYF(var6, "redstone2", 0);
					field330.method440();
					field331 = new JQZFCGYF(var6, "redstone3", 0);
					field331.method440();
					field332 = new JQZFCGYF(var6, "redstone1", 0);
					field332.method439();
					field332.method440();
					field333 = new JQZFCGYF(var6, "redstone2", 0);
					field333.method439();
					field333.method440();

					for (int var34 = 0; var34 < 2; var34++) {
						field399[var34] = new JQZFCGYF(var6, "mod_icons", var34);
					}

					JONKABPT var35 = new JONKABPT(var6, "backleft1", 0);
					field228 = new FETXLXVZ(method190(), var35.field1000, var35.field1001);
					var35.method427(0, 0);
					JONKABPT var36 = new JONKABPT(var6, "backleft2", 0);
					field229 = new FETXLXVZ(method190(), var36.field1000, var36.field1001);
					var36.method427(0, 0);
					JONKABPT var37 = new JONKABPT(var6, "backright1", 0);
					field230 = new FETXLXVZ(method190(), var37.field1000, var37.field1001);
					var37.method427(0, 0);
					JONKABPT var38 = new JONKABPT(var6, "backright2", 0);
					field231 = new FETXLXVZ(method190(), var38.field1000, var38.field1001);
					var38.method427(0, 0);
					JONKABPT var39 = new JONKABPT(var6, "backtop1", 0);
					field232 = new FETXLXVZ(method190(), var39.field1000, var39.field1001);
					var39.method427(0, 0);
					JONKABPT var40 = new JONKABPT(var6, "backvmid1", 0);
					field233 = new FETXLXVZ(method190(), var40.field1000, var40.field1001);
					var40.method427(0, 0);
					JONKABPT var41 = new JONKABPT(var6, "backvmid2", 0);
					field234 = new FETXLXVZ(method190(), var41.field1000, var41.field1001);
					var41.method427(0, 0);
					JONKABPT var42 = new JONKABPT(var6, "backvmid3", 0);
					field235 = new FETXLXVZ(method190(), var42.field1000, var42.field1001);
					var42.method427(0, 0);
					JONKABPT var43 = new JONKABPT(var6, "backhmid2", 0);
					field236 = new FETXLXVZ(method190(), var43.field1000, var43.field1001);
					var43.method427(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field118[var48] != null) {
							field118[var48].method425(var44 + var47, var46 + var47, var45 + var47);
						}

						if (field255[var48] != null) {
							field255[var48].method441(var44 + var47, var46 + var47, var45 + var47);
						}
					}

					method200("Unpacking textures", 83);
					DMXMSPET.method242(var7);
					DMXMSPET.method246(0.8D);
					DMXMSPET.method241(20);
					method200("Unpacking config", 86);
					KIRTNGZJ.method444(var4);
					VCGOMUBN.method574(var4);
					CMUBOYNL.method225(var4);
					PTCSWKBP.method494(var4);
					BXXPAJNW.method28(var4);
					IDSYSMIG.method382(var4);
					UYLUCQNM.method562(var4);
					DIPZNIAB.method235(var4);
					ZESTMKXA.method591(var4);
					PTCSWKBP.field1136 = field225;

					if (!field226) {
						method200("Unpacking sounds", 90);
						byte[] var49 = var9.method255("sounds.dat", null);
						CKBTFRZM var50 = new CKBTFRZM(var49);
						PKMPUSCK.method482(var50);
					}

					method200("Unpacking interfaces", 95);
					OSNNCWUM[] var51 = new OSNNCWUM[] { field122, field123, field124, field125 };
					FDUKJGTQ.method287(var6, var51, var5);
					method200("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field252.field1006[field252.field1008 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field357[var52] = var53;
						field285[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field252.field1006[field252.field1008 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field144[var56 - 5] = var57 - 25;
						field347[var56 - 5] = var58 - var57;
					}

					DMXMSPET.method239(479, 96);
					field196 = DMXMSPET.field581;
					DMXMSPET.method239(190, 261);
					field197 = DMXMSPET.field581;
					DMXMSPET.method239(512, 334);
					field198 = DMXMSPET.field581;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = DMXMSPET.field579[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					UGKPKMOJ.method543(800, 334, 500, var60, 512);
					FZULSWUT.method295(var8);
					field325 = new TTQEUGTP(this);
					method117(field325, 10);
					MSKEMKWR.field1073 = this;
					VCGOMUBN.field1395 = this;
					BXXPAJNW.field72 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field459 + " " + field142);
					field345 = true;
				}
			} else {
				field446 = true;
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method198() {
		VCGOMUBN.field1394.method3();
		VCGOMUBN.field1405.method3();
		BXXPAJNW.field60.method3();
		PTCSWKBP.field1131.method3();
		PTCSWKBP.field1126.method3();
		GPPDQFCV.field838.method3();
		UYLUCQNM.field1376.method3();
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method199(String arg0) throws IOException {
		if (field432) {
			if (field138 != null) {
				try {
					field138.close();
				} catch (Exception var4) {
				}

				field138 = null;
			}

			field138 = method168(43595);
			field138.setSoTimeout(10000);
			InputStream var2 = field138.getInputStream();
			OutputStream var3 = field138.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void method200(String arg0, int arg1) {
		field142 = arg1;
		field459 = arg0;
		method130();

		if (field516 == null) {
			super.method200(arg0, arg1);
		} else {
			field211.method289();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field124.method464(var4 / 2 - var5 - 26, 0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			JJXDTORW.method418(304, 34, 0x8C1111, var6, var3 / 2 - 152);
			JJXDTORW.method418(302, 32, 0, var6 + 1, var3 / 2 - 151);
			JJXDTORW.method417(var6 + 2, 30, var3 / 2 - 150, arg1 * 3, 0x8C1111);
			JJXDTORW.method417(var6 + 2, 30, arg1 * 3 + var3 / 2 - 150, 300 - arg1 * 3, 0);
			field124.method464(var4 / 2 + 5 - var5, 0xFFFFFF, var3 / 2, arg0);
			field211.method290(171, 202, field941);

			if (field441) {
				field441 = false;

				if (!field311) {
					field212.method290(0, 0, field941);
					field213.method290(0, 637, field941);
				}

				field209.method290(0, 128, field941);
				field210.method290(371, 202, field941);
				field214.method290(265, 0, field941);
				field215.method290(265, 562, field941);
				field216.method290(171, 128, field941);
				field217.method290(171, 562, field941);
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method201() {
		field457++;
		method127(true);
		method129(true);
		method127(false);
		method129(false);
		method93();
		method138();

		if (!field222) {
			int var1 = field321;
			if (field391 / 256 > var1) {
				var1 = field391 / 256;
			}

			if (field414[4] && field172[4] + 128 > var1) {
				var1 = field172[4] + 128;
			}

			int var2 = field494 + field322 & 0x7FF;
			method163(var2, method194(field375, field477.field1347, field477.field1348) - 50, field394, var1 * 3 + 600, var1, field393);
		}

		int var3;
		if (field222) {
			var3 = method203();
		} else {
			var3 = method202();
		}

		int var4 = field267;
		int var5 = field268;
		int var6 = field269;
		int var7 = field270;
		int var8 = field271;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field414[var9]) {
				int var10 = (int) (Math.random() * (field509[var9] * 2 + 1) + Math.sin(field205[var9] / 100.0D * field275[var9]) * field172[var9] - field509[var9]);
				if (var9 == 0) {
					field267 += var10;
				}

				if (var9 == 1) {
					field268 += var10;
				}

				if (var9 == 2) {
					field269 += var10;
				}

				if (var9 == 3) {
					field271 = field271 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field270 += var10;
					if (field270 < 128) {
						field270 = 128;
					}

					if (field270 > 383) {
						field270 = 383;
					}
				}
			}
		}

		int var11 = DMXMSPET.field590;
		GFYXEFQY.field811 = true;
		GFYXEFQY.field814 = 0;
		GFYXEFQY.field812 = field949 - 4;
		GFYXEFQY.field813 = field950 - 4;
		JJXDTORW.method415();
		field343.method546(field270, field271, var3, field269, field267, field268);
		field343.method521();
		method94();
		method204();
		method174(var11);
		method102();
		field191.method290(4, 4, field941);
		field267 = var4;
		field268 = var5;
		field269 = var6;
		field270 = var7;
		field271 = var8;
	}

	@ObfuscatedName("client.B(I)I")
	public final int method202() {
		int var1 = 3;
		if (field270 < 310) {
			field207++;
			if (field207 > 73) {
				field207 = 0;
				field521.method33(112);
			}

			int var2 = field267 >> 7;
			int var3 = field269 >> 7;
			int var4 = field477.field1347 >> 7;
			int var5 = field477.field1348 >> 7;

			if ((field461[field375][var2][var3] & 0x4) != 0) {
				var1 = field375;
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

					if ((field461[field375][var2][var3] & 0x4) != 0) {
						var1 = field375;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field461[field375][var2][var3] & 0x4) != 0) {
							var1 = field375;
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

					if ((field461[field375][var2][var3] & 0x4) != 0) {
						var1 = field375;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field461[field375][var2][var3] & 0x4) != 0) {
							var1 = field375;
						}
					}
				}
			}
		}

		if ((field461[field375][field477.field1347 >> 7][field477.field1348 >> 7] & 0x4) != 0) {
			var1 = field375;
		}

		return var1;
	}

	@ObfuscatedName("client.C(I)I")
	public final int method203() {
		int var1 = method194(field375, field267, field269);
		if (var1 - field268 < 800 && (field461[field375][field267 >> 7][field269 >> 7] & 0x4) != 0) {
			return field375;
		}

		return 3;
	}

	public final void init() {
		field223 = Integer.parseInt(getParameter("nodeid"));
		field224 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method126();
		} else {
			method132();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field225 = false;
		} else {
			field225 = true;
		}

		method400(503, 765);
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.D(I)V")
	public final void method204() {
		if (field344 == 2) {
			method165((field380 - field469 << 7) + field383, field381 * 2, (field379 - field468 << 7) + field382);

			if (field389 > -1 && field277 % 20 < 10) {
				field370[2].method429(field390 - 28, field389 - 12);
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method205() {
		if (field348 == 0 && field955 == 1) {
			int var1 = field956 - 25 - 550;
			int var2 = field957 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field322 + field309 & 0x7FF;
				int var4 = DMXMSPET.field579[var3];
				int var5 = DMXMSPET.field580[var3];
				var4 = (field492 + 256) * var4 >> 8;
				var5 = (field492 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field477.field1347 + var6 >> 7;
				int var9 = field477.field1348 - var7 >> 7;
				boolean var10 = method180(1, 0, 0, var9, 0, field477.field1345[0], field477.field1344[0], true, 0, 0, var8);
				if (var10) {
					field521.method34(var1);
					field521.method34(var2);
					field521.method35(field322);
					field521.method34(57);
					field521.method34(field309);
					field521.method34(field492);
					field521.method34(89);
					field521.method35(field477.field1347);
					field521.method35(field477.field1348);
					field521.method34(field141);
					field521.method34(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(ZI)Ljava/lang/String;")
	public static final String method206(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method207() {
		if (field226 && field376 == 2 && BRNLHXCU.field51 != field375) {
			field191.method289();
			field123.method464(151, 0, 257, "Loading - please wait.");
			field123.method464(150, 0xFFFFFF, 256, "Loading - please wait.");
			field191.method290(4, 4, field941);
			field376 = 1;
			field467 = System.currentTimeMillis();
		}

		if (field376 == 1) {
			int var1 = method208();
			if (var1 != 0 && System.currentTimeMillis() - field467 > 360000L) {
				signlink.reporterror(field104 + " glcfb " + field452 + "," + var1 + "," + field226 + "," + field292[0] + "," + field317.method268() + "," + field375 + "," + field185 + "," + field186);
				field467 = System.currentTimeMillis();
			}
		}

		if (field376 == 2 && field375 != field128) {
			field128 = field375;
			method120(field375);
		}
	}

	@ObfuscatedName("client.q(Z)I")
	public final int method208() {
		for (int var1 = 0; var1 < field227.length; var1++) {
			if (field227[var1] == null && field454[var1] != -1) {
				return -1;
			}

			if (field150[var1] == null && field455[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field227.length; var3++) {
			byte[] var4 = field150[var3];
			if (var4 != null) {
				int var5 = (field453[var3] >> 8) * 64 - field468;
				int var6 = (field453[var3] & 0xFF) * 64 - field469;
				if (field346) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= BRNLHXCU.method20(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field508) {
			return -4;
		} else {
			field376 = 2;
			BRNLHXCU.field51 = field375;
			method216();
			field521.method33(167);
			return 0;
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method209(int arg0, int arg1) {
		WUVIEXOA var3 = field338[field375][arg0][arg1];
		if (var3 == null) {
			field343.method528(field375, arg0, arg1);
		} else {
			int var4 = -99999999;
			TRUVKLSN var5 = null;
			for (TRUVKLSN var6 = (TRUVKLSN) var3.method585(); var6 != null; var6 = (TRUVKLSN) var3.method587()) {
				PTCSWKBP var7 = PTCSWKBP.method489(var6.field1190);
				int var8 = var7.field1128;
				if (var7.field1143) {
					var8 = (var6.field1189 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method583(var5);
			TRUVKLSN var9 = null;
			TRUVKLSN var10 = null;
			for (TRUVKLSN var11 = (TRUVKLSN) var3.method585(); var11 != null; var11 = (TRUVKLSN) var3.method587()) {
				if (var5.field1190 != var11.field1190 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1190 != var11.field1190 && var9.field1190 != var11.field1190 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field343.method514(field375, arg0, arg1, var9, var5, method194(field375, arg0 * 128 + 64, arg1 * 128 + 64), var12, var10);
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method210() {
		if (field257 != 0) {
			int var1 = 0;
			if (field195 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field306[var2] != null) {
					int var3 = field304[var2];
					String var4 = field305[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field291 == 0 || field291 == 1 && method219(var4))) {
						int var8 = 329 - var1 * 13;
						if (field949 > 4 && field950 - 4 > var8 - 10 && field950 - 4 <= var8 + 3) {
							int var9 = field123.method466("From:  " + var4 + field306[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field949 < var9 + 4) {
								if (field194 >= 1) {
									field293[field264] = "Report abuse @whi@" + var4;
									field170[field264] = 2152;
									field264++;
								}

								field293[field264] = "Add ignore @whi@" + var4;
								field170[field264] = 2084;
								field264++;
								field293[field264] = "Add friend @whi@" + var4;
								field170[field264] = 2144;
								field264++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field291 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LFDUKJGTQ;B)Z")
	public final boolean method211(FDUKJGTQ arg0) {
		int var2 = arg0.field703;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field293[field264] = "Remove @whi@" + arg0.field672;
				field170[field264] = 52;
				field264++;
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

		field293[field264] = "Remove @whi@" + field283[var2];
		field170[field264] = 813;
		field264++;
		field293[field264] = "Message @whi@" + field283[var2];
		field170[field264] = 210;
		field264++;
		return true;
	}

	@ObfuscatedName("client.p(B)V")
	public final void method212() {
		if (field192 == null) {
			method179();
			field942 = null;
			field209 = null;
			field210 = null;
			field211 = null;
			field212 = null;
			field213 = null;
			field214 = null;
			field215 = null;
			field216 = null;
			field217 = null;
			field192 = new FETXLXVZ(method190(), 479, 96);
			field190 = new FETXLXVZ(method190(), 172, 156);
			JJXDTORW.method415();
			field252.method442(0, 0);
			field189 = new FETXLXVZ(method190(), 190, 261);
			field191 = new FETXLXVZ(method190(), 512, 334);
			JJXDTORW.method415();
			field318 = new FETXLXVZ(method190(), 496, 50);
			field319 = new FETXLXVZ(method190(), 269, 37);
			field320 = new FETXLXVZ(method190(), 249, 45);
			field441 = true;
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method213() {
		byte[] var1 = field516.method255("title.dat", null);
		JONKABPT var2 = new JONKABPT(var1, this);
		field212.method289();
		var2.method427(0, 0);
		field213.method289();
		var2.method427(0, -637);
		field209.method289();
		var2.method427(0, -128);
		field210.method289();
		var2.method427(-371, -202);
		field211.method289();
		var2.method427(-171, -202);
		field214.method289();
		var2.method427(-265, 0);
		field215.method289();
		var2.method427(-265, -562);
		field216.method289();
		var2.method427(-171, -128);
		field217.method289();
		var2.method427(-171, -562);
		int[] var3 = new int[var2.field1000];
		for (int var4 = 0; var4 < var2.field1001; var4++) {
			for (int var5 = 0; var5 < var2.field1000; var5++) {
				var3[var5] = var2.field999[var2.field1000 * var4 + var2.field1000 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1000; var6++) {
				var2.field999[var2.field1000 * var4 + var6] = var3[var6];
			}
		}

		field212.method289();
		var2.method427(0, 382);
		field213.method289();
		var2.method427(0, -255);
		field209.method289();
		var2.method427(0, 254);
		field210.method289();
		var2.method427(-371, 180);
		field211.method289();
		var2.method427(-171, 180);
		field214.method289();
		var2.method427(-265, 382);
		field215.method289();
		var2.method427(-265, -180);
		field216.method289();
		var2.method427(-171, 254);
		field217.method289();
		var2.method427(-171, -180);
		JONKABPT var7 = new JONKABPT(field516, "logo", 0);
		field209.method289();
		var7.method429(18, 382 - var7.field1000 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(ZLFDUKJGTQ;)Z")
	public final boolean method214(FDUKJGTQ arg0) {
		if (arg0.field691 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field691.length; var2++) {
			int var3 = method83(arg0, var2);
			int var4 = arg0.field718[var2];
			if (arg0.field691[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field691[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field691[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(IILFDUKJGTQ;II)V")
	public final void method215(int arg0, FDUKJGTQ arg1, int arg2, int arg3) {
		if (arg1.field667 == 0 && arg1.field696 != null && (!arg1.field716 || field263 == arg1.field673 || field114 == arg1.field673 || field152 == arg1.field673)) {
			int var5 = JJXDTORW.field969;
			int var6 = JJXDTORW.field967;
			int var7 = JJXDTORW.field970;
			int var8 = JJXDTORW.field968;
			JJXDTORW.method414(arg3, arg1.field694 + arg3, arg0, arg1.field713 + arg0);
			int var9 = arg1.field696.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field689[var10] + arg3;
				int var12 = arg1.field676[var10] + arg0 - arg2;
				FDUKJGTQ var13 = FDUKJGTQ.field705[arg1.field696[var10]];
				var11 += var13.field706;
				var12 += var13.field685;

				if (var13.field703 > 0) {
					method128(var13);
				}

				if (var13.field667 == 0) {
					if (var13.field707 > var13.field704 - var13.field713) {
						var13.field707 = var13.field704 - var13.field713;
					}

					if (var13.field707 < 0) {
						var13.field707 = 0;
					}

					method215(var12, var13, var13.field707, var11);

					if (var13.field704 > var13.field713) {
						method89(var13.field694 + var11, var13.field713, var12, var13.field707, var13.field704);
					}
				} else if (var13.field667 != 1) {
					if (var13.field667 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field713; var15++) {
							for (int var16 = 0; var16 < var13.field694; var16++) {
								int var17 = (var13.field729 + 32) * var16 + var11;
								int var18 = (var13.field728 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field712[var14];
									var18 += var13.field690[var14];
								}

								if (var13.field711[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field711[var14] - 1;
									if (var17 > JJXDTORW.field969 - 32 && var17 < JJXDTORW.field970 && var18 > JJXDTORW.field967 - 32 && var18 < JJXDTORW.field968 || field360 != 0 && field359 == var14) {
										int var22 = 0;
										if (field238 == 1 && field239 == var14 && field240 == var13.field673) {
											var22 = 0xFFFFFF;
										}

										JONKABPT var23 = PTCSWKBP.method492(var21, var13.field708[var14], var22);
										if (var23 != null) {
											if (field360 != 0 && field359 == var14 && field358 == var13.field673) {
												var19 = field949 - field361;
												var20 = field950 - field362;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field167 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method431(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < JJXDTORW.field967 && arg1.field707 > 0) {
													int var24 = (JJXDTORW.field967 - var18 - var20) * field392 / 3;
													if (var24 > field392 * 10) {
														var24 = field392 * 10;
													}

													if (var24 > arg1.field707) {
														var24 = arg1.field707;
													}

													arg1.field707 -= var24;
													field362 += var24;
												}

												if (var18 + var20 + 32 > JJXDTORW.field968 && arg1.field707 < arg1.field704 - arg1.field713) {
													int var25 = (var18 + var20 + 32 - JJXDTORW.field968) * field392 / 3;
													if (var25 > field392 * 10) {
														var25 = field392 * 10;
													}

													if (var25 > arg1.field704 - arg1.field713 - arg1.field707) {
														var25 = arg1.field704 - arg1.field713 - arg1.field707;
													}

													arg1.field707 += var25;
													field362 -= var25;
												}
											} else if (field342 != 0 && field341 == var14 && field340 == var13.field673) {
												var23.method431(var18, var17, 128);
											} else {
												var23.method429(var18, var17);
											}

											if (var23.field1004 == 33 || var13.field708[var14] != 1) {
												int var26 = var13.field708[var14];
												field122.method468(method206(var26), var18 + var20 + 10, 0, var17 + var19 + 1);
												field122.method468(method206(var26), var18 + var20 + 9, 0xFFFF00, var17 + var19);
											}
										}
									}
								} else if (var13.field688 != null && var14 < 20) {
									JONKABPT var27 = var13.field688[var14];
									if (var27 != null) {
										var27.method429(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field667 == 3) {
						boolean var28 = false;
						if (field152 == var13.field673 || field114 == var13.field673 || field263 == var13.field673) {
							var28 = true;
						}

						int var29;
						if (method214(var13)) {
							var29 = var13.field700;
							if (var28 && var13.field677 != 0) {
								var29 = var13.field677;
							}
						} else {
							var29 = var13.field721;
							if (var28 && var13.field702 != 0) {
								var29 = var13.field702;
							}
						}

						if (var13.field697 == 0) {
							if (var13.field686) {
								JJXDTORW.method417(var12, var13.field713, var11, var13.field694, var29);
							} else {
								JJXDTORW.method418(var13.field694, var13.field713, var29, var12, var11);
							}
						} else if (var13.field686) {
							JJXDTORW.method416(var11, var13.field713, var29, var13.field694, var12, 256 - (var13.field697 & 0xFF));
						} else {
							JJXDTORW.method419(var11, var12, 256 - (var13.field697 & 0xFF), var29, var13.field694, var13.field713);
						}
					} else if (var13.field667 == 4) {
						OSNNCWUM var30 = var13.field709;
						String var31 = var13.field672;
						boolean var32 = false;
						if (field152 == var13.field673 || field114 == var13.field673 || field263 == var13.field673) {
							var32 = true;
						}

						int var33;
						if (method214(var13)) {
							var33 = var13.field700;
							if (var32 && var13.field677 != 0) {
								var33 = var13.field677;
							}

							if (var13.field666.length() > 0) {
								var31 = var13.field666;
							}
						} else {
							var33 = var13.field721;
							if (var32 && var13.field702 != 0) {
								var33 = var13.field702;
							}
						}

						if (var13.field670 == 6 && field183) {
							var31 = "Please wait...";
							var33 = var13.field721;
						}

						if (JJXDTORW.field965 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1099 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method107(method83(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method107(method83(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method107(method83(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method107(method83(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method107(method83(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field719) {
								var30.method465(var13.field694 / 2 + var11, var41, var34, var33, var13.field678);
							} else {
								var30.method472(var11, var13.field678, var33, var34, var41);
							}

							var34 += var30.field1099;
						}
					} else if (var13.field667 == 5) {
						JONKABPT var42;
						if (method214(var13)) {
							var42 = var13.field692;
						} else {
							var42 = var13.field698;
						}

						if (var42 != null) {
							var42.method429(var12, var11);
						}
					} else if (var13.field667 == 6) {
						int var43 = DMXMSPET.field575;
						int var44 = DMXMSPET.field576;
						DMXMSPET.field575 = var13.field694 / 2 + var11;
						DMXMSPET.field576 = var13.field713 / 2 + var12;
						int var45 = DMXMSPET.field579[var13.field682] * var13.field681 >> 16;
						int var46 = DMXMSPET.field580[var13.field682] * var13.field681 >> 16;
						boolean var47 = method214(var13);
						int var48;
						if (var47) {
							var48 = var13.field726;
						} else {
							var48 = var13.field725;
						}

						GFYXEFQY var49;
						if (var48 == -1) {
							var49 = var13.method285(-1, -1, var47);
						} else {
							KIRTNGZJ var50 = KIRTNGZJ.field1015[var48];
							var49 = var13.method285(var50.field1017[var13.field674], var50.field1018[var13.field674], var47);
						}

						if (var49 != null) {
							var49.method361(0, var13.field683, 0, var13.field682, 0, var45, var46);
						}

						DMXMSPET.field575 = var43;
						DMXMSPET.field576 = var44;
					} else if (var13.field667 == 7) {
						OSNNCWUM var51 = var13.field709;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field713; var53++) {
							for (int var54 = 0; var54 < var13.field694; var54++) {
								if (var13.field711[var52] > 0) {
									PTCSWKBP var55 = PTCSWKBP.method489(var13.field711[var52] - 1);
									String var56 = var55.field1118;
									if (var55.field1143 || var13.field708[var52] != 1) {
										var56 = var56 + " x" + method151(var13.field708[var52]);
									}

									int var57 = (var13.field729 + 115) * var54 + var11;
									int var58 = (var13.field728 + 12) * var53 + var12;
									if (var13.field719) {
										var51.method465(var13.field694 / 2 + var57, var56, var58, var13.field721, var13.field678);
									} else {
										var51.method472(var57, var13.field678, var13.field721, var58, var56);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			JJXDTORW.method414(var5, var7, var6, var8);
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method216() {
		try {
			field128 = -1;
			field299.method589();
			field398.method589();
			DMXMSPET.method240();
			method198();
			field343.method507();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field294[var1].method451();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field461[var2][var3][var4] = 0;
					}
				}
			}

			BRNLHXCU var5 = new BRNLHXCU(104, field151, field461, 104);
			int var6 = field227.length;
			BRNLHXCU.field54 = UGKPKMOJ.field1222;
			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = field453[var7] >> 8;
				int var9 = field453[var7] & 0xFF;
				if (var8 == 33 && var9 >= 71 && var9 <= 73) {
					BRNLHXCU.field54 = false;
				}
			}

			if (BRNLHXCU.field54) {
				field343.method508(field375);
			} else {
				field343.method508(0);
			}

			field521.method33(107);

			if (!field346) {
				for (int var10 = 0; var10 < var6; var10++) {
					int var11 = (field453[var10] >> 8) * 64 - field468;
					int var12 = (field453[var10] & 0xFF) * 64 - field469;
					byte[] var13 = field227[var10];
					if (var13 != null) {
						var5.method14(var11, var13, (field185 - 6) * 8, var12, (field186 - 6) * 8, field294);
					}
				}

				for (int var14 = 0; var14 < var6; var14++) {
					int var15 = (field453[var14] >> 8) * 64 - field468;
					int var16 = (field453[var14] & 0xFF) * 64 - field469;
					byte[] var17 = field227[var14];
					if (var17 == null && field186 < 800) {
						var5.method13(64, var15, var16, 64);
					}
				}

				field521.method33(107);

				for (int var18 = 0; var18 < var6; var18++) {
					byte[] var19 = field150[var18];
					if (var19 != null) {
						int var20 = (field453[var18] >> 8) * 64 - field468;
						int var21 = (field453[var18] & 0xFF) * 64 - field469;
						var5.method21(var21, field294, field343, var19, var20);
					}
				}
			}

			if (field346) {
				for (int var22 = 0; var22 < 4; var22++) {
					for (int var23 = 0; var23 < 13; var23++) {
						for (int var24 = 0; var24 < 13; var24++) {
							int var25 = field415[var22][var23][var24];
							if (var25 != -1) {
								int var26 = var25 >> 24 & 0x3;
								int var27 = var25 >> 1 & 0x3;
								int var28 = var25 >> 14 & 0x3FF;
								int var29 = var25 >> 3 & 0x7FF;
								int var30 = (var28 / 8 << 8) + var29 / 8;
								for (int var31 = 0; var31 < field453.length; var31++) {
									if (field453[var31] == var30 && field227[var31] != null) {
										var5.method19(var23 * 8, (var29 & 0x7) * 8, (var28 & 0x7) * 8, field294, var22, var24 * 8, var26, field227[var31], var27);
										break;
									}
								}
							}
						}
					}
				}

				for (int var32 = 0; var32 < 13; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						int var34 = field415[0][var32][var33];
						if (var34 == -1) {
							var5.method13(8, var32 * 8, var33 * 8, 8);
						}
					}
				}

				field521.method33(107);

				for (int var35 = 0; var35 < 4; var35++) {
					for (int var36 = 0; var36 < 13; var36++) {
						for (int var37 = 0; var37 < 13; var37++) {
							int var38 = field415[var35][var36][var37];
							if (var38 != -1) {
								int var39 = var38 >> 24 & 0x3;
								int var40 = var38 >> 1 & 0x3;
								int var41 = var38 >> 14 & 0x3FF;
								int var42 = var38 >> 3 & 0x7FF;
								int var43 = (var41 / 8 << 8) + var42 / 8;
								for (int var44 = 0; var44 < field453.length; var44++) {
									if (field453[var44] == var43 && field150[var44] != null) {
										var5.method16(var36 * 8, field343, field150[var44], var39, var35, (var42 & 0x7) * 8, var40, (var41 & 0x7) * 8, field294, var37 * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field521.method33(107);
			var5.method17(field343, field294);
			field191.method289();
			field521.method33(107);

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method209(var45, var46);
				}
			}

			method175();
		} catch (Exception var59) {
		}

		VCGOMUBN.field1394.method3();

		if (field944 != null) {
			field521.method33(46);
			field521.method38(1057001181);
		}

		if (field226 && signlink.cache_dat != null) {
			int var48 = field317.method276(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field317.method258(var49);
				if ((var50 & 0x79) == 0) {
					GFYXEFQY.method340(var49);
				}
			}
		}

		System.gc();
		DMXMSPET.method241(20);
		field317.method256();
		int var51 = (field185 - 6) / 8 - 1;
		int var52 = (field185 + 6) / 8 + 1;
		int var53 = (field186 - 6) / 8 - 1;
		int var54 = (field186 + 6) / 8 + 1;
		if (field525) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field317.method260(0, var56, var55);
					if (var57 != -1) {
						field317.method277(3, var57);
					}

					int var58 = field317.method260(1, var56, var55);
					if (var58 != -1) {
						field317.method277(3, var58);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILGPPDQFCV;II)V")
	public final void method217(int arg0, int arg1, GPPDQFCV arg2, int arg3) {
		if (field477 != arg2 && field264 < 400) {
			String var5;
			if (arg2.field831 == 0) {
				var5 = arg2.field839 + method223(field477.field829, arg2.field829) + " (level-" + arg2.field829 + ")";
			} else {
				var5 = arg2.field839 + " (skill-" + arg2.field831 + ")";
			}

			if (field238 == 1) {
				field293[field264] = "Use " + field242 + " with @whi@" + var5;
				field170[field264] = 614;
				field171[field264] = arg3;
				field168[field264] = arg0;
				field169[field264] = arg1;
				field264++;
			} else if (field488 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field464[var6] != null) {
						field293[field264] = field464[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field464[var6].equalsIgnoreCase("attack")) {
							if (arg2.field829 > field477.field829) {
								var7 = 2000;
							}

							if (field477.field844 != 0 && arg2.field844 != 0) {
								if (field477.field844 == arg2.field844) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field465[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field170[field264] = var7 + 303;
						}

						if (var6 == 1) {
							field170[field264] = var7 + 657;
						}

						if (var6 == 2) {
							field170[field264] = var7 + 933;
						}

						if (var6 == 3) {
							field170[field264] = var7 + 718;
						}

						if (var6 == 4) {
							field170[field264] = var7 + 529;
						}

						field171[field264] = arg3;
						field168[field264] = arg0;
						field169[field264] = arg1;
						field264++;
					}
				}
			} else if ((field490 & 0x8) == 8) {
				field293[field264] = field491 + " @whi@" + var5;
				field170[field264] = 776;
				field171[field264] = arg3;
				field168[field264] = arg0;
				field169[field264] = arg1;
				field264++;
			}

			for (int var8 = 0; var8 < field264; var8++) {
				if (field170[var8] == 665) {
					field293[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method218() {
		if (field257 != 0) {
			OSNNCWUM var1 = field123;
			int var2 = 0;
			if (field195 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field306[var3] != null) {
					int var4 = field304[var3];
					String var5 = field305[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field291 == 0 || field291 == 1 && method219(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method468("From", var7, 0, var8);
						var1.method468("From", var7 - 1, 0xFFFF, var8);
						int var11 = var8 + var1.method466("From ");
						if (var6 == 1) {
							field399[0].method442(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field399[1].method442(var7 - 12, var11);
							var11 += 14;
						}

						var1.method468(var5 + ": " + field306[var3], var7, 0, var11);
						var1.method468(var5 + ": " + field306[var3], var7 - 1, 0xFFFF, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field291 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method468(field306[var3], var9, 0, 4);
						var1.method468(field306[var3], var9 - 1, 0xFFFF, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field291 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method468("To " + var5 + ": " + field306[var3], var10, 0, 4);
						var1.method468("To " + var5 + ": " + field306[var3], var10 - 1, 0xFFFF, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method219(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field368; var2++) {
			if (arg0.equalsIgnoreCase(field283[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field477.field839)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;II)LEAXVDNXA;")
	public final EAXVDNXA method220(int arg0, String arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field292[0] != null) {
				var6 = field292[0].method375(arg0);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field300.reset();
			field300.update(var6);
			int var8 = (int) field300.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new EAXVDNXA(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method200("Requesting " + arg1, arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method199(arg2 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				CKBTFRZM var16 = new CKBTFRZM(var15);
				var16.field92 = 3;
				int var17 = var16.method48() + 6;
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
						method200("Loading " + arg1 + " - " + var22 + "%", arg4);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field292[0] != null) {
						field292[0].method376(var6.length, arg0, var6);
					}
				} catch (Exception var28) {
					field292[0] = null;
				}

				if (var6 != null) {
					field300.reset();
					field300.update(var6);
					int var23 = (int) field300.getValue();
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
						method200("Game updated - please reload page", arg4);
						var25 = 10;
					} else {
						method200(var11 + " - Retrying in " + var25, arg4);
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

				field432 = !field432;
			}
		}

		return new EAXVDNXA(var6);
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field944 != null) {
				return new URL("http://127.0.0.1:" + (field224 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method221(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.r(Z)V")
	public final void method222() {
		while (true) {
			int var1 = method403();
			if (var1 == -1) {
				return;
			}

			if (field219 != -1 && field219 == field109) {
				if (var1 == 8 && field512.length() > 0) {
					field512 = field512.substring(0, field512.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field512.length() < 12) {
					field512 = field512 + (char) var1;
				}
			} else if (field507) {
				if (var1 >= 32 && var1 <= 122 && field445.length() < 80) {
					field445 = field445 + (char) var1;
					field496 = true;
				}

				if (var1 == 8 && field445.length() > 0) {
					field445 = field445.substring(0, field445.length() - 1);
					field496 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field507 = false;
					field496 = true;

					if (field289 == 1) {
						long var2 = IGDXKDJL.method388(field445);
						method145(var2);
					}

					if (field289 == 2 && field368 > 0) {
						long var4 = IGDXKDJL.method388(field445);
						method131(var4);
					}

					if (field289 == 3 && field445.length() > 0) {
						field521.method33(127);
						field521.method34(0);
						int var6 = field521.field92;
						field521.method40(field220);
						IDJBPKZF.method380(field445, field521);
						field521.method43(field521.field92 - var6);
						field445 = IDJBPKZF.method381(field445);
						field445 = FZULSWUT.method305(field445);
						method181(IGDXKDJL.method392(IGDXKDJL.method389(field220)), field445, 6);

						if (field291 == 2) {
							field291 = 1;
							field523 = true;
							field521.method33(174);
							field521.method34(field466);
							field521.method34(field291);
							field521.method34(field353);
						}
					}

					if (field289 == 4 && field406 < 100) {
						long var7 = IGDXKDJL.method388(field445);
						method114(var7);
					}

					if (field289 == 5 && field406 > 0) {
						long var9 = IGDXKDJL.method388(field445);
						method146(var9);
					}
				}
			} else if (field408 == 1) {
				if (var1 >= 48 && var1 <= 57 && field520.length() < 10) {
					field520 = field520 + (char) var1;
					field496 = true;
				}

				if (var1 == 8 && field520.length() > 0) {
					field520 = field520.substring(0, field520.length() - 1);
					field496 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field520.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field520);
						} catch (Exception var21) {
						}

						field521.method33(220);
						field521.method38(var11);
					}

					field408 = 0;
					field496 = true;
				}
			} else if (field408 == 2) {
				if (var1 >= 32 && var1 <= 122 && field520.length() < 12) {
					field520 = field520 + (char) var1;
					field496 = true;
				}

				if (var1 == 8 && field520.length() > 0) {
					field520 = field520.substring(0, field520.length() - 1);
					field496 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field520.length() > 0) {
						field521.method33(15);
						field521.method40(IGDXKDJL.method388(field520));
					}

					field408 = 0;
					field496 = true;
				}
			} else if (field403 == -1) {
				if (var1 >= 32 && var1 <= 122 && field119.length() < 80) {
					field119 = field119 + (char) var1;
					field496 = true;
				}

				if (var1 == 8 && field119.length() > 0) {
					field119 = field119.substring(0, field119.length() - 1);
					field496 = true;
				}

				if ((var1 == 13 || var1 == 10) && field119.length() > 0) {
					if (field194 == 2) {
						if (field119.equals("::clientdrop")) {
							method92();
						}

						if (field119.equals("::lag")) {
							method189();
						}

						if (field119.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field317.method276(2); var12++) {
								field317.method271(2, var12, (byte) 1);
							}
						}

						if (field119.equals("::fpson")) {
							field444 = true;
						}

						if (field119.equals("::fpsoff")) {
							field444 = false;
						}

						if (field119.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field294[var13].field1092[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field119.startsWith("::")) {
						field521.method33(238);
						field521.method34(field119.length() - 1);
						field521.method41(field119.substring(2));
					} else {
						String var16 = field119.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field119 = field119.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field119 = field119.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field119 = field119.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field119 = field119.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field119 = field119.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field119 = field119.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field119 = field119.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field119 = field119.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field119 = field119.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field119 = field119.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field119 = field119.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field119 = field119.substring(6);
						}

						String var18 = field119.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field119 = field119.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field119 = field119.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field119 = field119.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field119 = field119.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field119 = field119.substring(6);
						}

						field521.method33(245);
						field521.method34(0);
						int var20 = field521.field92;
						field521.method60(var19);
						field521.method34(var17);
						field200.field92 = 0;
						IDJBPKZF.method380(field119, field200);
						field521.method81(0, field200.field91, field200.field92);
						field521.method43(field521.field92 - var20);
						field119 = IDJBPKZF.method381(field119);
						field119 = FZULSWUT.method305(field119);
						field477.field1307 = field119;
						field477.field1306 = var17;
						field477.field1312 = var19;
						field477.field1335 = 150;

						if (field194 == 2) {
							method181("@cr2@" + field477.field839, field477.field1307, 2);
						} else if (field194 == 1) {
							method181("@cr1@" + field477.field839, field477.field1307, 2);
						} else {
							method181(field477.field839, field477.field1307, 2);
						}

						if (field466 == 2) {
							field466 = 3;
							field523 = true;
							field521.method33(174);
							field521.method34(field466);
							field521.method34(field291);
							field521.method34(field353);
						}
					}

					field119 = "";
					field496 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(III)Ljava/lang/String;")
	public static final String method223(int arg0, int arg1) {
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

	@ObfuscatedName("client.s(Z)V")
	public final void method224() {
		if (field955 == 1) {
			if (field956 >= 539 && field956 <= 573 && field957 >= 169 && field957 < 205 && field350[0] != -1) {
				field366 = true;
				field131 = 0;
				field437 = true;
			}

			if (field956 >= 569 && field956 <= 599 && field957 >= 168 && field957 < 205 && field350[1] != -1) {
				field366 = true;
				field131 = 1;
				field437 = true;
			}

			if (field956 >= 597 && field956 <= 627 && field957 >= 168 && field957 < 205 && field350[2] != -1) {
				field366 = true;
				field131 = 2;
				field437 = true;
			}

			if (field956 >= 625 && field956 <= 669 && field957 >= 168 && field957 < 203 && field350[3] != -1) {
				field366 = true;
				field131 = 3;
				field437 = true;
			}

			if (field956 >= 666 && field956 <= 696 && field957 >= 168 && field957 < 205 && field350[4] != -1) {
				field366 = true;
				field131 = 4;
				field437 = true;
			}

			if (field956 >= 694 && field956 <= 724 && field957 >= 168 && field957 < 205 && field350[5] != -1) {
				field366 = true;
				field131 = 5;
				field437 = true;
			}

			if (field956 >= 722 && field956 <= 756 && field957 >= 169 && field957 < 205 && field350[6] != -1) {
				field366 = true;
				field131 = 6;
				field437 = true;
			}

			if (field956 >= 540 && field956 <= 574 && field957 >= 466 && field957 < 502 && field350[7] != -1) {
				field366 = true;
				field131 = 7;
				field437 = true;
			}

			if (field956 >= 572 && field956 <= 602 && field957 >= 466 && field957 < 503 && field350[8] != -1) {
				field366 = true;
				field131 = 8;
				field437 = true;
			}

			if (field956 >= 599 && field956 <= 629 && field957 >= 466 && field957 < 503 && field350[9] != -1) {
				field366 = true;
				field131 = 9;
				field437 = true;
			}

			if (field956 >= 627 && field956 <= 671 && field957 >= 467 && field957 < 502 && field350[10] != -1) {
				field366 = true;
				field131 = 10;
				field437 = true;
			}

			if (field956 >= 669 && field956 <= 699 && field957 >= 466 && field957 < 503 && field350[11] != -1) {
				field366 = true;
				field131 = 11;
				field437 = true;
			}

			if (field956 >= 696 && field956 <= 726 && field957 >= 466 && field957 < 503 && field350[12] != -1) {
				field366 = true;
				field131 = 12;
				field437 = true;
			}

			if (field956 >= 724 && field956 <= 758 && field957 >= 466 && field957 < 502 && field350[13] != -1) {
				field366 = true;
				field131 = 13;
				field437 = true;
				return;
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field174[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field282[var3] = var2 / 4;
		}
	}
}
