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
public final class client extends AUOBNYCU {

	@ObfuscatedName("client.P")
	public String field154 = "";

	@ObfuscatedName("client.Q")
	public String field155 = "";

	@ObfuscatedName("client.S")
	public CRC32 field157 = new CRC32();

	@ObfuscatedName("client.V")
	public int[] field160 = new int[4000];

	@ObfuscatedName("client.W")
	public int[] field161 = new int[4000];

	@ObfuscatedName("client.db")
	public int[] field168 = new int[5];

	@ObfuscatedName("client.pb")
	public String field178 = "";

	@ObfuscatedName("client.Hb")
	public int[] field196 = new int[TAMKZUGY.field1182];

	@ObfuscatedName("client.Qb")
	public EILHLJCE field200 = EILHLJCE.method212(1);

	@ObfuscatedName("client.Rb")
	public int field201 = -1;

	@ObfuscatedName("client.Yb")
	public EILHLJCE field208 = new EILHLJCE(new byte[5000]);

	@ObfuscatedName("client.Zb")
	public ONCZAQCQ[] field209 = new ONCZAQCQ[16384];

	@ObfuscatedName("client.bc")
	public int[] field211 = new int[16384];

	@ObfuscatedName("client.mc")
	public String field221 = "";

	@ObfuscatedName("client.uc")
	public int field229 = -1;

	@ObfuscatedName("client.zc")
	public boolean field234 = false;

	@ObfuscatedName("client.Ac")
	public int[] field235 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Cc")
	public FLJWGVEY field236 = new FLJWGVEY();

	@ObfuscatedName("client.Ec")
	public volatile boolean field237 = false;

	@ObfuscatedName("client.Gc")
	public boolean field238 = false;

	@ObfuscatedName("client.Hc")
	public int field239 = -1;

	@ObfuscatedName("client.Ic")
	public boolean field240 = false;

	@ObfuscatedName("client.Jc")
	public int[] field241 = new int[50];

	@ObfuscatedName("client.Kc")
	public volatile boolean field242 = false;

	@ObfuscatedName("client.Pc")
	public String[] field245 = new String[500];

	@ObfuscatedName("client.Rc")
	public int field246 = -1;

	@ObfuscatedName("client.Yc")
	public boolean field252 = true;

	@ObfuscatedName("client.ed")
	public int field255 = 2;

	@ObfuscatedName("client.id")
	public int field257 = 0x332D25;

	@ObfuscatedName("client.jd")
	public int field258 = -1;

	@ObfuscatedName("client.ld")
	public boolean field260 = false;

	@ObfuscatedName("client.qd")
	public int field265 = 0x4D4233;

	@ObfuscatedName("client.rd")
	public ODBDSPMH[] field266 = new ODBDSPMH[32];

	@ObfuscatedName("client.td")
	public int[] field268 = new int[50];

	@ObfuscatedName("client.ud")
	public FCRLGSQA[] field269 = new FCRLGSQA[100];

	@ObfuscatedName("client.wd")
	public int[] field271 = new int[9];

	@ObfuscatedName("client.xd")
	public final int[] field272 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.yd")
	public FLJWGVEY field273 = new FLJWGVEY();

	@ObfuscatedName("client.Cd")
	public int[] field276 = new int[2000];

	@ObfuscatedName("client.Od")
	public int field288 = 2;

	@ObfuscatedName("client.ce")
	public final int field300 = 100;

	@ObfuscatedName("client.de")
	public int[] field301 = new int[100];

	@ObfuscatedName("client.fe")
	public int[] field303 = new int[256];

	@ObfuscatedName("client.he")
	public int[] field304 = new int[33];

	@ObfuscatedName("client.je")
	public boolean[] field306 = new boolean[5];

	@ObfuscatedName("client.ke")
	public int[] field307 = new int[500];

	@ObfuscatedName("client.le")
	public int[] field308 = new int[500];

	@ObfuscatedName("client.me")
	public int[] field309 = new int[500];

	@ObfuscatedName("client.ne")
	public int[] field310 = new int[500];

	@ObfuscatedName("client.pe")
	public ODBDSPMH[] field311 = new ODBDSPMH[32];

	@ObfuscatedName("client.re")
	public volatile boolean field313 = false;

	@ObfuscatedName("client.se")
	public int[] field314 = new int[151];

	@ObfuscatedName("client.we")
	public int[] field318 = new int[1000];

	@ObfuscatedName("client.ye")
	public int field319 = 0x23201B;

	@ObfuscatedName("client.Ae")
	public int[] field321 = new int[1000];

	@ObfuscatedName("client.Be")
	public int[] field322 = new int[1000];

	@ObfuscatedName("client.Ce")
	public ODBDSPMH[] field323 = new ODBDSPMH[8];

	@ObfuscatedName("client.De")
	public int field324 = 3;

	@ObfuscatedName("client.Ee")
	public ODBDSPMH[] field325 = new ODBDSPMH[32];

	@ObfuscatedName("client.Ke")
	public IRYXZZFE field331 = new IRYXZZFE();

	@ObfuscatedName("client.Le")
	public ODBDSPMH[] field332 = new ODBDSPMH[1000];

	@ObfuscatedName("client.Qe")
	public int field335 = -1;

	@ObfuscatedName("client.Re")
	public boolean field336 = true;

	@ObfuscatedName("client.Se")
	public int field337 = 78;

	@ObfuscatedName("client.We")
	public ODBDSPMH[] field341 = new ODBDSPMH[100];

	@ObfuscatedName("client.Xe")
	public DYTTVJNT[] field342 = new DYTTVJNT[4];

	@ObfuscatedName("client.bf")
	public int[] field346 = new int[7];

	@ObfuscatedName("client.cf")
	public int field347 = -1;

	@ObfuscatedName("client.df")
	public int field348 = -1;

	@ObfuscatedName("client.ef")
	public boolean field349 = false;

	@ObfuscatedName("client.ff")
	public int[] field350 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.mf")
	public boolean field356 = false;

	@ObfuscatedName("client.nf")
	public int[] field357 = new int[5];

	@ObfuscatedName("client.rf")
	public int[] field361 = new int[33];

	@ObfuscatedName("client.tf")
	public FLJWGVEY[][][] field362 = new FLJWGVEY[4][104][104];

	@ObfuscatedName("client.vf")
	public boolean field364 = false;

	@ObfuscatedName("client.wf")
	public int[][] field365 = new int[104][104];

	@ObfuscatedName("client.cg")
	public String field397 = "";

	@ObfuscatedName("client.hg")
	public boolean field400 = false;

	@ObfuscatedName("client.og")
	public boolean field407 = true;

	@ObfuscatedName("client.rg")
	public int[] field408 = new int[200];

	@ObfuscatedName("client.wg")
	public int field413 = 50;

	@ObfuscatedName("client.xg")
	public int[] field414 = new int[field413];

	@ObfuscatedName("client.yg")
	public int[] field415 = new int[field413];

	@ObfuscatedName("client.zg")
	public int[] field416 = new int[field413];

	@ObfuscatedName("client.Ag")
	public int[] field417 = new int[field413];

	@ObfuscatedName("client.Bg")
	public int[] field418 = new int[field413];

	@ObfuscatedName("client.Cg")
	public int[] field419 = new int[field413];

	@ObfuscatedName("client.Dg")
	public int[] field420 = new int[field413];

	@ObfuscatedName("client.Eg")
	public String[] field421 = new String[field413];

	@ObfuscatedName("client.Gg")
	public byte[] field423 = new byte[16384];

	@ObfuscatedName("client.Jg")
	public boolean field426 = false;

	@ObfuscatedName("client.Sg")
	public boolean field435 = false;

	@ObfuscatedName("client.Vg")
	public boolean field438 = true;

	@ObfuscatedName("client.Wg")
	public boolean field439 = false;

	@ObfuscatedName("client.bh")
	public boolean field444 = false;

	@ObfuscatedName("client.ch")
	public FCRLGSQA[] field445 = new FCRLGSQA[2];

	@ObfuscatedName("client.dh")
	public int[][][] field446 = new int[4][13][13];

	@ObfuscatedName("client.eh")
	public FCRLGSQA[] field447 = new FCRLGSQA[13];

	@ObfuscatedName("client.ih")
	public int field450 = -1;

	@ObfuscatedName("client.rh")
	public boolean field457 = false;

	@ObfuscatedName("client.sh")
	public boolean field458 = false;

	@ObfuscatedName("client.uh")
	public boolean field460 = false;

	@ObfuscatedName("client.vh")
	public String field461 = "";

	@ObfuscatedName("client.wh")
	public String field462 = "";

	@ObfuscatedName("client.Bh")
	public long[] field467 = new long[200];

	@ObfuscatedName("client.Ch")
	public int field468 = -1;

	@ObfuscatedName("client.Dh")
	public int[][] field469 = new int[104][104];

	@ObfuscatedName("client.Eh")
	public int field470 = 0x766654;

	@ObfuscatedName("client.Gh")
	public String[] field472 = new String[200];

	@ObfuscatedName("client.Ih")
	public FLJWGVEY field474 = new FLJWGVEY();

	@ObfuscatedName("client.Qh")
	public int field480 = -1;

	@ObfuscatedName("client.Rh")
	public int[] field481 = new int[5];

	@ObfuscatedName("client.Xh")
	public int[] field487 = new int[151];

	@ObfuscatedName("client.Yh")
	public boolean field488 = false;

	@ObfuscatedName("client.Zh")
	public int[][] field489 = new int[104][104];

	@ObfuscatedName("client.ai")
	public boolean field490 = false;

	@ObfuscatedName("client.bi")
	public boolean field491 = false;

	@ObfuscatedName("client.li")
	public BDNJGDVN[] field500 = new BDNJGDVN[5];

	@ObfuscatedName("client.mi")
	public int[] field501 = new int[50];

	@ObfuscatedName("client.ni")
	public int field502 = -1;

	@ObfuscatedName("client.pi")
	public int[] field503 = new int[100];

	@ObfuscatedName("client.qi")
	public String[] field504 = new String[100];

	@ObfuscatedName("client.ri")
	public String[] field505 = new String[100];

	@ObfuscatedName("client.ti")
	public int field507 = 2048;

	@ObfuscatedName("client.ui")
	public int field508 = 2047;

	@ObfuscatedName("client.vi")
	public AWOZVMFS[] field509 = new AWOZVMFS[field507];

	@ObfuscatedName("client.xi")
	public int[] field511 = new int[field507];

	@ObfuscatedName("client.zi")
	public int[] field513 = new int[field507];

	@ObfuscatedName("client.Ai")
	public EILHLJCE[] field514 = new EILHLJCE[field507];

	@ObfuscatedName("client.Ci")
	public int[] field516 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Gi")
	public int field519 = 2;

	@ObfuscatedName("client.Ii")
	public long[] field520 = new long[100];

	@ObfuscatedName("client.Ji")
	public boolean field521 = false;

	@ObfuscatedName("client.Xi")
	public int[] field534 = new int[5];

	@ObfuscatedName("client.aj")
	public String[] field536 = new String[5];

	@ObfuscatedName("client.bj")
	public boolean[] field537 = new boolean[5];

	@ObfuscatedName("client.cj")
	public String field538 = "";

	@ObfuscatedName("client.fj")
	public int field541 = 1;

	@ObfuscatedName("client.gj")
	public int[] field542 = new int[TAMKZUGY.field1182];

	@ObfuscatedName("client.lj")
	public int field546 = -1;

	@ObfuscatedName("client.nj")
	public int field547 = -1;

	@ObfuscatedName("client.sj")
	public boolean field552 = true;

	@ObfuscatedName("client.tj")
	public boolean field553 = false;

	@ObfuscatedName("client.wj")
	public int field556 = 1;

	@ObfuscatedName("client.Aj")
	public EILHLJCE field558 = EILHLJCE.method212(1);

	@ObfuscatedName("client.Cj")
	public EILHLJCE field560 = EILHLJCE.method212(1);

	@ObfuscatedName("client.Hj")
	public boolean field565 = false;

	@ObfuscatedName("client.Ij")
	public int field566 = -1;

	@ObfuscatedName("client.Kj")
	public int field568 = -1;

	@ObfuscatedName("client.Lj")
	public int field569 = 128;

	@ObfuscatedName("client.Uj")
	public int[] field578 = new int[TAMKZUGY.field1182];

	@ObfuscatedName("client.Vj")
	public boolean field579 = false;

	@ObfuscatedName("client.Wj")
	public int[] field580 = new int[2000];

	@ObfuscatedName("client.Yj")
	public ODBDSPMH[] field582 = new ODBDSPMH[20];

	@ObfuscatedName("client.Zj")
	public int[] field583 = new int[5];

	@ObfuscatedName("client.bk")
	public String field585 = "";

	@ObfuscatedName("client.cc")
	public static int field212 = 10;

	@ObfuscatedName("client.ec")
	public static boolean field214 = true;

	@ObfuscatedName("client.md")
	public static BigInteger field261 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.of")
	public static BigInteger field358 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.sg")
	public static final int[][] field409 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Lh")
	public static int[] field476 = new int[32];

	@ObfuscatedName("client.ij")
	public static final int[] field544 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.ak")
	public static int[] field584 = new int[99];

	@ObfuscatedName("client.ck")
	public static String field586 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.K")
	public int field149;

	@ObfuscatedName("client.L")
	public int field150;

	@ObfuscatedName("client.M")
	public int field151;

	@ObfuscatedName("client.N")
	public int field152;

	@ObfuscatedName("client.O")
	public int field153;

	@ObfuscatedName("client.R")
	public int field156;

	@ObfuscatedName("client.T")
	public int field158;

	@ObfuscatedName("client.U")
	public int field159;

	@ObfuscatedName("client.Y")
	public int field163;

	@ObfuscatedName("client.Z")
	public int field164;

	@ObfuscatedName("client.ab")
	public int field165;

	@ObfuscatedName("client.bb")
	public int field166;

	@ObfuscatedName("client.cb")
	public int field167;

	@ObfuscatedName("client.eb")
	public int field169;

	@ObfuscatedName("client.fb")
	public int field170;

	@ObfuscatedName("client.gb")
	public int field171;

	@ObfuscatedName("client.hb")
	public int field172;

	@ObfuscatedName("client.ib")
	public int field173;

	@ObfuscatedName("client.vb")
	public static int field184;

	@ObfuscatedName("client.wb")
	public int field185;

	@ObfuscatedName("client.xb")
	public int field186;

	@ObfuscatedName("client.Mb")
	public int field199;

	@ObfuscatedName("client.Sb")
	public int field202;

	@ObfuscatedName("client.Tb")
	public int field203;

	@ObfuscatedName("client.Ub")
	public int field204;

	@ObfuscatedName("client.Vb")
	public int field205;

	@ObfuscatedName("client.Wb")
	public int field206;

	@ObfuscatedName("client.Xb")
	public int field207;

	@ObfuscatedName("client.ac")
	public int field210;

	@ObfuscatedName("client.dc")
	public static int field213;

	@ObfuscatedName("client.hc")
	public int field217;

	@ObfuscatedName("client.lc")
	public int field220;

	@ObfuscatedName("client.nc")
	public int field222;

	@ObfuscatedName("client.oc")
	public static int field223;

	@ObfuscatedName("client.pc")
	public int field224;

	@ObfuscatedName("client.qc")
	public int field225;

	@ObfuscatedName("client.rc")
	public int field226;

	@ObfuscatedName("client.sc")
	public int field227;

	@ObfuscatedName("client.tc")
	public int field228;

	@ObfuscatedName("client.xc")
	public int field232;

	@ObfuscatedName("client.yc")
	public int field233;

	@ObfuscatedName("client.Lc")
	public static int field243;

	@ObfuscatedName("client.Nc")
	public int field244;

	@ObfuscatedName("client.Sc")
	public int field247;

	@ObfuscatedName("client.Uc")
	public int field248;

	@ObfuscatedName("client.Vc")
	public static int field249;

	@ObfuscatedName("client.Xc")
	public int field251;

	@ObfuscatedName("client.dd")
	public int field254;

	@ObfuscatedName("client.hd")
	public int field256;

	@ObfuscatedName("client.kd")
	public static int field259;

	@ObfuscatedName("client.nd")
	public int field262;

	@ObfuscatedName("client.sd")
	public int field267;

	@ObfuscatedName("client.Dd")
	public int field277;

	@ObfuscatedName("client.Ed")
	public int field278;

	@ObfuscatedName("client.Fd")
	public int field279;

	@ObfuscatedName("client.Gd")
	public int field280;

	@ObfuscatedName("client.Hd")
	public int field281;

	@ObfuscatedName("client.Nd")
	public int field287;

	@ObfuscatedName("client.Pd")
	public int field289;

	@ObfuscatedName("client.be")
	public static int field299;

	@ObfuscatedName("client.ee")
	public static int field302;

	@ObfuscatedName("client.ie")
	public int field305;

	@ObfuscatedName("client.qe")
	public int field312;

	@ObfuscatedName("client.te")
	public int field315;

	@ObfuscatedName("client.ue")
	public int field316;

	@ObfuscatedName("client.ve")
	public int field317;

	@ObfuscatedName("client.ze")
	public int field320;

	@ObfuscatedName("client.Fe")
	public int field326;

	@ObfuscatedName("client.Ge")
	public int field327;

	@ObfuscatedName("client.He")
	public int field328;

	@ObfuscatedName("client.Ie")
	public int field329;

	@ObfuscatedName("client.Je")
	public int field330;

	@ObfuscatedName("client.Oe")
	public int field333;

	@ObfuscatedName("client.Ye")
	public int field343;

	@ObfuscatedName("client.Ze")
	public static int field344;

	@ObfuscatedName("client.af")
	public int field345;

	@ObfuscatedName("client.gf")
	public int field351;

	@ObfuscatedName("client.hf")
	public static int field352;

	@ObfuscatedName("client.jf")
	public int field353;

	@ObfuscatedName("client.kf")
	public int field354;

	@ObfuscatedName("client.lf")
	public int field355;

	@ObfuscatedName("client.pf")
	public int field359;

	@ObfuscatedName("client.qf")
	public int field360;

	@ObfuscatedName("client.xf")
	public int field366;

	@ObfuscatedName("client.zf")
	public int field368;

	@ObfuscatedName("client.Af")
	public int field369;

	@ObfuscatedName("client.Bf")
	public int field370;

	@ObfuscatedName("client.Cf")
	public int field371;

	@ObfuscatedName("client.Uf")
	public int field389;

	@ObfuscatedName("client.Vf")
	public int field390;

	@ObfuscatedName("client.Wf")
	public int field391;

	@ObfuscatedName("client.Xf")
	public int field392;

	@ObfuscatedName("client.Yf")
	public int field393;

	@ObfuscatedName("client.Zf")
	public int field394;

	@ObfuscatedName("client.ag")
	public int field395;

	@ObfuscatedName("client.dg")
	public int field398;

	@ObfuscatedName("client.fg")
	public int field399;

	@ObfuscatedName("client.ig")
	public int field401;

	@ObfuscatedName("client.ng")
	public int field406;

	@ObfuscatedName("client.vg")
	public int field412;

	@ObfuscatedName("client.Fg")
	public int field422;

	@ObfuscatedName("client.Hg")
	public int field424;

	@ObfuscatedName("client.Ig")
	public int field425;

	@ObfuscatedName("client.Pg")
	public int field432;

	@ObfuscatedName("client.Qg")
	public int field433;

	@ObfuscatedName("client.Rg")
	public int field434;

	@ObfuscatedName("client.Tg")
	public int field436;

	@ObfuscatedName("client.Ug")
	public int field437;

	@ObfuscatedName("client.gh")
	public int field448;

	@ObfuscatedName("client.hh")
	public int field449;

	@ObfuscatedName("client.jh")
	public int field451;

	@ObfuscatedName("client.kh")
	public int field452;

	@ObfuscatedName("client.lh")
	public int field453;

	@ObfuscatedName("client.mh")
	public int field454;

	@ObfuscatedName("client.nh")
	public int field455;

	@ObfuscatedName("client.oh")
	public static int field456;

	@ObfuscatedName("client.th")
	public int field459;

	@ObfuscatedName("client.yh")
	public static int field464;

	@ObfuscatedName("client.zh")
	public int field465;

	@ObfuscatedName("client.Fh")
	public int field471;

	@ObfuscatedName("client.Hh")
	public int field473;

	@ObfuscatedName("client.Jh")
	public static int field475;

	@ObfuscatedName("client.Nh")
	public int field477;

	@ObfuscatedName("client.Oh")
	public int field478;

	@ObfuscatedName("client.Ph")
	public int field479;

	@ObfuscatedName("client.ci")
	public int field492;

	@ObfuscatedName("client.di")
	public int field493;

	@ObfuscatedName("client.ei")
	public int field494;

	@ObfuscatedName("client.fi")
	public int field495;

	@ObfuscatedName("client.hi")
	public int field497;

	@ObfuscatedName("client.ii")
	public int field498;

	@ObfuscatedName("client.ki")
	public static int field499;

	@ObfuscatedName("client.si")
	public int field506;

	@ObfuscatedName("client.wi")
	public int field510;

	@ObfuscatedName("client.yi")
	public int field512;

	@ObfuscatedName("client.Bi")
	public int field515;

	@ObfuscatedName("client.Ei")
	public static int field517;

	@ObfuscatedName("client.Fi")
	public int field518;

	@ObfuscatedName("client.Li")
	public int field523;

	@ObfuscatedName("client.Mi")
	public int field524;

	@ObfuscatedName("client.Ni")
	public int field525;

	@ObfuscatedName("client.Oi")
	public int field526;

	@ObfuscatedName("client.Pi")
	public int field527;

	@ObfuscatedName("client.Qi")
	public int field528;

	@ObfuscatedName("client.Ri")
	public int field529;

	@ObfuscatedName("client.Si")
	public int field530;

	@ObfuscatedName("client.Ti")
	public int field531;

	@ObfuscatedName("client.Ui")
	public int field532;

	@ObfuscatedName("client.Vi")
	public static int field533;

	@ObfuscatedName("client.Zi")
	public int field535;

	@ObfuscatedName("client.dj")
	public int field539;

	@ObfuscatedName("client.ej")
	public int field540;

	@ObfuscatedName("client.oj")
	public int field548;

	@ObfuscatedName("client.pj")
	public int field549;

	@ObfuscatedName("client.qj")
	public int field550;

	@ObfuscatedName("client.rj")
	public int field551;

	@ObfuscatedName("client.uj")
	public int field554;

	@ObfuscatedName("client.vj")
	public int field555;

	@ObfuscatedName("client.xj")
	public int field557;

	@ObfuscatedName("client.Dj")
	public int field561;

	@ObfuscatedName("client.Jj")
	public int field567;

	@ObfuscatedName("client.Mj")
	public int field570;

	@ObfuscatedName("client.Nj")
	public int field571;

	@ObfuscatedName("client.Oj")
	public int field572;

	@ObfuscatedName("client.Pj")
	public int field573;

	@ObfuscatedName("client.Qj")
	public int field574;

	@ObfuscatedName("client.Rj")
	public int field575;

	@ObfuscatedName("client.Tj")
	public int field577;

	@ObfuscatedName("client.nb")
	public long field177;

	@ObfuscatedName("client.ic")
	public long field218;

	@ObfuscatedName("client.od")
	public long field263;

	@ObfuscatedName("client.yf")
	public long field367;

	@ObfuscatedName("client.Ah")
	public long field466;

	@ObfuscatedName("client.Ki")
	public ABBBHPCA field522;

	@ObfuscatedName("client.pd")
	public static AWOZVMFS field264;

	@ObfuscatedName("client.Md")
	public BBMKAXRK field286;

	@ObfuscatedName("client.vc")
	public FCRLGSQA field230;

	@ObfuscatedName("client.wc")
	public FCRLGSQA field231;

	@ObfuscatedName("client.Ef")
	public FCRLGSQA field373;

	@ObfuscatedName("client.Ff")
	public FCRLGSQA field374;

	@ObfuscatedName("client.Gf")
	public FCRLGSQA field375;

	@ObfuscatedName("client.Hf")
	public FCRLGSQA field376;

	@ObfuscatedName("client.If")
	public FCRLGSQA field377;

	@ObfuscatedName("client.Rf")
	public FCRLGSQA field386;

	@ObfuscatedName("client.Sf")
	public FCRLGSQA field387;

	@ObfuscatedName("client.Tf")
	public FCRLGSQA field388;

	@ObfuscatedName("client.Kg")
	public FCRLGSQA field427;

	@ObfuscatedName("client.Lg")
	public FCRLGSQA field428;

	@ObfuscatedName("client.Mg")
	public FCRLGSQA field429;

	@ObfuscatedName("client.Ng")
	public FCRLGSQA field430;

	@ObfuscatedName("client.Og")
	public FCRLGSQA field431;

	@ObfuscatedName("client.Sh")
	public FCRLGSQA field482;

	@ObfuscatedName("client.Th")
	public FCRLGSQA field483;

	@ObfuscatedName("client.Uh")
	public FCRLGSQA field484;

	@ObfuscatedName("client.Vh")
	public FCRLGSQA field485;

	@ObfuscatedName("client.Wh")
	public FCRLGSQA field486;

	@ObfuscatedName("client.Jf")
	public MCYRKBJU field378;

	@ObfuscatedName("client.Kf")
	public MCYRKBJU field379;

	@ObfuscatedName("client.Lf")
	public MCYRKBJU field380;

	@ObfuscatedName("client.Mf")
	public MCYRKBJU field381;

	@ObfuscatedName("client.J")
	public ODBDSPMH field148;

	@ObfuscatedName("client.qb")
	public ODBDSPMH field179;

	@ObfuscatedName("client.rb")
	public ODBDSPMH field180;

	@ObfuscatedName("client.sb")
	public ODBDSPMH field181;

	@ObfuscatedName("client.tb")
	public ODBDSPMH field182;

	@ObfuscatedName("client.ub")
	public ODBDSPMH field183;

	@ObfuscatedName("client.Wc")
	public ODBDSPMH field250;

	@ObfuscatedName("client.Ad")
	public ODBDSPMH field274;

	@ObfuscatedName("client.Bd")
	public ODBDSPMH field275;

	@ObfuscatedName("client.Te")
	public ODBDSPMH field338;

	@ObfuscatedName("client.Ue")
	public ODBDSPMH field339;

	@ObfuscatedName("client.bg")
	public ODBDSPMH field396;

	@ObfuscatedName("client.Fj")
	public ODBDSPMH field563;

	@ObfuscatedName("client.Gj")
	public ODBDSPMH field564;

	@ObfuscatedName("client.Xj")
	public ODBDSPMH field581;

	@ObfuscatedName("client.yb")
	public UKPRFGXO field187;

	@ObfuscatedName("client.zb")
	public UKPRFGXO field188;

	@ObfuscatedName("client.Ab")
	public UKPRFGXO field189;

	@ObfuscatedName("client.Bb")
	public UKPRFGXO field190;

	@ObfuscatedName("client.Cb")
	public UKPRFGXO field191;

	@ObfuscatedName("client.Db")
	public UKPRFGXO field192;

	@ObfuscatedName("client.Eb")
	public UKPRFGXO field193;

	@ObfuscatedName("client.Fb")
	public UKPRFGXO field194;

	@ObfuscatedName("client.Gb")
	public UKPRFGXO field195;

	@ObfuscatedName("client.Id")
	public UKPRFGXO field282;

	@ObfuscatedName("client.Jd")
	public UKPRFGXO field283;

	@ObfuscatedName("client.Kd")
	public UKPRFGXO field284;

	@ObfuscatedName("client.Sd")
	public UKPRFGXO field290;

	@ObfuscatedName("client.Td")
	public UKPRFGXO field291;

	@ObfuscatedName("client.Ud")
	public UKPRFGXO field292;

	@ObfuscatedName("client.Vd")
	public UKPRFGXO field293;

	@ObfuscatedName("client.Wd")
	public UKPRFGXO field294;

	@ObfuscatedName("client.Xd")
	public UKPRFGXO field295;

	@ObfuscatedName("client.Yd")
	public UKPRFGXO field296;

	@ObfuscatedName("client.Zd")
	public UKPRFGXO field297;

	@ObfuscatedName("client.ae")
	public UKPRFGXO field298;

	@ObfuscatedName("client.Xg")
	public UKPRFGXO field440;

	@ObfuscatedName("client.Yg")
	public UKPRFGXO field441;

	@ObfuscatedName("client.Zg")
	public UKPRFGXO field442;

	@ObfuscatedName("client.ah")
	public UKPRFGXO field443;

	@ObfuscatedName("client.kc")
	public ULPROSHL field219;

	@ObfuscatedName("client.uf")
	public XOHMKFIT field363;

	@ObfuscatedName("client.Ej")
	public YPXEHIVX field562;

	@ObfuscatedName("client.hj")
	public YSAVREBH field543;

	@ObfuscatedName("client.Ld")
	public String field285;

	@ObfuscatedName("client.gi")
	public String field496;

	@ObfuscatedName("client.jj")
	public String field545;

	@ObfuscatedName("client.Sj")
	public String field576;

	@ObfuscatedName("client.X")
	public Socket field162;

	@ObfuscatedName("client.fc")
	public static boolean field215;

	@ObfuscatedName("client.ad")
	public static boolean field253;

	@ObfuscatedName("client.Pe")
	public static boolean field334;

	@ObfuscatedName("client.xh")
	public static boolean field463;

	@ObfuscatedName("client.jb")
	public int[] field174;

	@ObfuscatedName("client.kb")
	public int[] field175;

	@ObfuscatedName("client.lb")
	public int[] field176;

	@ObfuscatedName("client.Kb")
	public int[] field197;

	@ObfuscatedName("client.Lb")
	public int[] field198;

	@ObfuscatedName("client.Nf")
	public int[] field382;

	@ObfuscatedName("client.Of")
	public int[] field383;

	@ObfuscatedName("client.Pf")
	public int[] field384;

	@ObfuscatedName("client.Qf")
	public int[] field385;

	@ObfuscatedName("client.jg")
	public int[] field402;

	@ObfuscatedName("client.kg")
	public int[] field403;

	@ObfuscatedName("client.lg")
	public int[] field404;

	@ObfuscatedName("client.mg")
	public int[] field405;

	@ObfuscatedName("client.tg")
	public int[] field410;

	@ObfuscatedName("client.ug")
	public int[] field411;

	@ObfuscatedName("client.Ve")
	public FCRLGSQA[] field340;

	@ObfuscatedName("client.vd")
	public byte[][] field270;

	@ObfuscatedName("client.Df")
	public byte[][] field372;

	@ObfuscatedName("client.gc")
	public byte[][][] field216;

	@ObfuscatedName("client.Bj")
	public int[][][] field559;

	@ObfuscatedName("client.a(LIRYXZZFE;II)I")
	public final int method44(IRYXZZFE arg0, int arg1) {
		if (arg0.field825 == null || arg1 >= arg0.field825.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field825[arg1];
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
					var8 = field542[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field578[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field196[var3[var5++]];
				}

				if (var7 == 4) {
					IRYXZZFE var10 = IRYXZZFE.method329(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < XLZQSPZS.field1339 && (!XLZQSPZS.method526(var11).field1315 || field214)) {
						for (int var12 = 0; var12 < var10.field829.length; var12++) {
							if (var11 + 1 == var10.field829[var12]) {
								var8 += var10.field791[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field580[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field584[field578[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field580[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field264.field110;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < TAMKZUGY.field1182; var13++) {
						if (TAMKZUGY.field1184[var13]) {
							var8 += field578[var13];
						}
					}
				}

				if (var7 == 10) {
					IRYXZZFE var14 = IRYXZZFE.method329(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < XLZQSPZS.field1339 && (!XLZQSPZS.method526(var15).field1315 || field214)) {
						for (int var16 = 0; var16 < var14.field829.length; var16++) {
							if (var14.field829[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field217;
				}

				if (var7 == 12) {
					var8 = field156;
				}

				if (var7 == 13) {
					int var17 = field580[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					SRLFLGUY var20 = SRLFLGUY.field1160[var19];
					int var21 = var20.field1162;
					int var22 = var20.field1163;
					int var23 = var20.field1164;
					int var24 = field476[var23 - var22];
					var8 = field580[var21] >> var22 & var24;
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
					var8 = (field264.field62 >> 7) + field548;
				}

				if (var7 == 19) {
					var8 = (field264.field63 >> 7) + field549;
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

	@ObfuscatedName("client.a(LIRYXZZFE;B)Z")
	public final boolean method45(IRYXZZFE arg0) {
		if (arg0.field785 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field785.length; var2++) {
			int var3 = method44(arg0, var2);
			int var4 = arg0.field783[var2];
			if (arg0.field785[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field785[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field785[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method46(String arg0) {
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

	@ObfuscatedName("client.b(Z)V")
	public final void method47() {
		if (field220 != 0) {
			int var1 = 0;
			if (field422 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field505[var2] != null) {
					int var3 = field503[var2];
					String var4 = field504[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field315 == 0 || field315 == 1 && method179(var4))) {
						int var8 = 329 - var1 * 13;
						if (field83 > 4 && field84 - 4 > var8 - 10 && field84 - 4 <= var8 + 3) {
							int var9 = field379.method375("From:  " + var4 + field505[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field83 < var9 + 4) {
								if (field166 >= 1) {
									field245[field368] = "Report abuse @whi@" + var4;
									field309[field368] = 2787;
									field368++;
								}

								field245[field368] = "Add ignore @whi@" + var4;
								field309[field368] = 2379;
								field368++;
								field245[field368] = "Add friend @whi@" + var4;
								field309[field368] = 2696;
								field368++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field315 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method48() {
		field441.method463();

		if (field535 == 2) {
			byte[] var1 = field387.field696;
			int[] var2 = IFHRXNFO.field759;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field581.method408(256, 33, field570, 33, 25, field361, 0, field304, 0, 25);
			field442.method463();
			GBZDHVLZ.field717 = field384;
		} else {
			int var5 = field570 + field287 & 0x7FF;
			int var6 = field264.field62 / 32 + 48;
			int var7 = 464 - field264.field63 / 32;
			field396.method408(field540 + 256, 146, var5, 151, var6, field314, 5, field487, 25, var7);
			field581.method408(256, 33, field570, 33, 25, field361, 0, field304, 0, 25);

			for (int var8 = 0; var8 < field320; var8++) {
				int var9 = field321[var8] * 4 + 2 - field264.field62 / 32;
				int var10 = field322[var8] * 4 + 2 - field264.field63 / 32;
				method178(field332[var8], var10, var9);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					FLJWGVEY var13 = field362[field165][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field264.field62 / 32;
						int var15 = var12 * 4 + 2 - field264.field63 / 32;
						method178(field179, var15, var14);
					}
				}
			}

			for (int var16 = 0; var16 < field210; var16++) {
				ONCZAQCQ var17 = field209[field211[var16]];
				if (var17 != null && var17.method10()) {
					NPWLDXJE var18 = var17.field1059;
					if (var18.field979 != null) {
						var18 = var18.method389();
					}

					if (var18 != null && var18.field992 && var18.field988) {
						int var19 = var17.field62 / 32 - field264.field62 / 32;
						int var20 = var17.field63 / 32 - field264.field63 / 32;
						method178(field180, var20, var19);
					}
				}
			}

			for (int var21 = 0; var21 < field510; var21++) {
				AWOZVMFS var22 = field509[field511[var21]];
				if (var22 != null && var22.method10()) {
					int var23 = var22.field62 / 32 - field264.field62 / 32;
					int var24 = var22.field63 / 32 - field264.field63 / 32;
					boolean var25 = false;
					long var26 = LGOZNEAG.method366(var22.field117);
					for (int var28 = 0; var28 < field158; var28++) {
						if (field467[var28] == var26 && field408[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field264.field118 != 0 && var22.field118 != 0 && field264.field118 == var22.field118) {
						var29 = true;
					}

					if (var25) {
						method178(field182, var24, var23);
					} else if (var29) {
						method178(field183, var24, var23);
					} else {
						method178(field181, var24, var23);
					}
				}
			}

			if (field251 != 0 && field499 % 20 < 10) {
				if (field251 == 1 && field515 >= 0 && field515 < field209.length) {
					ONCZAQCQ var30 = field209[field515];
					if (var30 != null) {
						int var31 = var30.field62 / 32 - field264.field62 / 32;
						int var32 = var30.field63 / 32 - field264.field63 / 32;
						method115(field275, var32, var31);
					}
				}

				if (field251 == 2) {
					int var33 = (field149 - field548) * 4 + 2 - field264.field62 / 32;
					int var34 = (field150 - field549) * 4 + 2 - field264.field63 / 32;
					method115(field275, var34, var33);
				}

				if (field251 == 10 && field222 >= 0 && field222 < field509.length) {
					AWOZVMFS var35 = field509[field222];
					if (var35 != null) {
						int var36 = var35.field62 / 32 - field264.field62 / 32;
						int var37 = var35.field63 / 32 - field264.field63 / 32;
						method115(field275, var37, var36);
					}
				}
			}

			if (field394 != 0) {
				int var38 = field394 * 4 + 2 - field264.field62 / 32;
				int var39 = field395 * 4 + 2 - field264.field63 / 32;
				method178(field274, var39, var38);
			}

			IFHRXNFO.method315(0xFFFFFF, 97, 3, 3, 78);
			field442.method463();
			GBZDHVLZ.field717 = field384;
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method49() {
		int var1 = field278;
		int var2 = field279;
		int var3 = field280;
		int var4 = field281;
		int var5 = 0x5D5447;
		IFHRXNFO.method315(var5, var1, var3, var4, var2);
		IFHRXNFO.method315(0, var1 + 1, var3 - 2, 16, var2 + 1);
		IFHRXNFO.method316(var2 + 18, var3 - 2, var1 + 1, var4 - 19, 0);
		field380.method377("Choose Option", var2 + 14, var1 + 3, var5);
		int var6 = field83;
		int var7 = field84;
		if (field277 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field277 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field277 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field368; var8++) {
			int var9 = (field368 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field380.method381(var1 + 3, var9, true, var10, field245[var8]);
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method50(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field505[var4] != null) {
				int var5 = field503[var4];
				int var6 = field316 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field504[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field449 == 0 || field449 == 1 && method179(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field264.field117)) {
						if (field166 >= 1) {
							field245[field368] = "Report abuse @whi@" + var7;
							field309[field368] = 787;
							field368++;
						}

						field245[field368] = "Add ignore @whi@" + var7;
						field309[field368] = 379;
						field368++;
						field245[field368] = "Add friend @whi@" + var7;
						field309[field368] = 696;
						field368++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field220 == 0 && (var5 == 7 || field315 == 0 || field315 == 1 && method179(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field166 >= 1) {
							field245[field368] = "Report abuse @whi@" + var7;
							field309[field368] = 787;
							field368++;
						}

						field245[field368] = "Add ignore @whi@" + var7;
						field309[field368] = 379;
						field368++;
						field245[field368] = "Add friend @whi@" + var7;
						field309[field368] = 696;
						field368++;
					}

					var3++;
				}

				if (var5 == 4 && (field343 == 0 || field343 == 1 && method179(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field245[field368] = "Accept trade @whi@" + var7;
						field309[field368] = 940;
						field368++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field220 == 0 && field315 < 2) {
					var3++;
				}

				if (var5 == 8 && (field343 == 0 || field343 == 1 && method179(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field245[field368] = "Accept challenge @whi@" + var7;
						field309[field368] = 113;
						field368++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method51(int arg0) {
		if (arg0 >= 0) {
			if (field567 != 0) {
				field567 = 0;
				field579 = true;
			}

			int var2 = field307[arg0];
			int var3 = field308[arg0];
			int var4 = field309[arg0];
			int var5 = field310[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 281) {
				field352 += var3;
				if (field352 >= 82) {
					field560.method213(182);
					field352 = 0;
				}

				field560.method213(255);
				field560.method215(var2);
				field560.method250(var5);
				field560.method250(var3);
				field451 = 0;
				field452 = var3;
				field453 = var2;
				field454 = 2;
				if (IRYXZZFE.method329(var3).field777 == field239) {
					field454 = 1;
				}

				if (IRYXZZFE.method329(var3).field777 == field450) {
					field454 = 3;
				}
			}

			if (var4 == 946) {
				field560.method213(17);
				field560.method250(var2);
				field560.method250(var5);
				field560.method215(var3);
				field451 = 0;
				field452 = var3;
				field453 = var2;
				field454 = 2;
				if (IRYXZZFE.method329(var3).field777 == field239) {
					field454 = 1;
				}

				if (IRYXZZFE.method329(var3).field777 == field450) {
					field454 = 3;
				}
			}

			if (var4 == 1335) {
				ONCZAQCQ var6 = field209[var5];
				if (var6 != null) {
					NPWLDXJE var7 = var6.field1059;
					if (var7.field979 != null) {
						var7 = var7.method389();
					}

					if (var7 != null) {
						String var8;
						if (var7.field1006 == null) {
							var8 = "It's a " + var7.field1001 + ".";
						} else {
							var8 = new String(var7.field1006);
						}

						method126(0, var8, "");
					}
				}
			}

			if (var4 == 426) {
				IRYXZZFE var9 = IRYXZZFE.method329(var3);
				boolean var10 = true;
				if (var9.field773 > 0) {
					var10 = method56(var9);
				}

				if (var10) {
					field560.method213(208);
					field560.method215(var3);
				}
			}

			if (var4 == 377) {
				field560.method213(226);
				field560.method251(var2);
				field560.method215(var5);
				field560.method249(var3);
				field451 = 0;
				field452 = var3;
				field453 = var2;
				field454 = 2;
				if (IRYXZZFE.method329(var3).field777 == field239) {
					field454 = 1;
				}

				if (IRYXZZFE.method329(var3).field777 == field450) {
					field454 = 3;
				}
			}

			if (var4 == 405 && !field400) {
				field560.method213(154);
				field560.method215(var3);
				field400 = true;
			}

			if (var4 == 275) {
				boolean var11 = method155(var2, var3, 2, 0, field264.field35[0], false, 0, field264.field34[0], 0, 0, 0);
				if (!var11) {
					method155(var2, var3, 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
				}

				field224 = field90;
				field225 = field91;
				field227 = 2;
				field226 = 0;
				field560.method213(143);
				field560.method249(field549 + var3);
				field560.method250(var5);
				field560.method249(field548 + var2);
			}

			if (var4 == 515) {
				ONCZAQCQ var13 = field209[var5];
				if (var13 != null) {
					method155(var13.field34[0], var13.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
					field224 = field90;
					field225 = field91;
					field227 = 2;
					field226 = 0;
					field560.method213(16);
					field560.method250(var5);
				}
			}

			if (var4 == 951) {
				field560.method213(208);
				field560.method215(var3);
				IRYXZZFE var14 = IRYXZZFE.method329(var3);
				if (var14.field825 != null && var14.field825[0][0] == 5) {
					int var15 = var14.field825[0][1];
					if (field580[var15] != var14.field783[0]) {
						field580[var15] = var14.field783[0];
						method132(var15);
						field488 = true;
					}
				}
			}

			if (var4 == 983) {
				ONCZAQCQ var16 = field209[var5];
				if (var16 != null) {
					method155(var16.field34[0], var16.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
					field224 = field90;
					field225 = field91;
					field227 = 2;
					field226 = 0;
					field560.method213(158);
					field560.method249(var5);
				}
			}

			if (var4 == 646) {
				ONCZAQCQ var17 = field209[var5];
				if (var17 != null) {
					method155(var17.field34[0], var17.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
					field224 = field90;
					field225 = field91;
					field227 = 2;
					field226 = 0;
					field560.method213(48);
					field560.method215(field494);
					field560.method249(field495);
					field560.method249(var5);
					field560.method249(field493);
				}
			}

			if (var4 == 1) {
				field560.method213(73);
				field560.method250(var3);
				field560.method250(var5);
				field560.method215(var2);
				field451 = 0;
				field452 = var3;
				field453 = var2;
				field454 = 2;
				if (IRYXZZFE.method329(var3).field777 == field239) {
					field454 = 1;
				}

				if (IRYXZZFE.method329(var3).field777 == field450) {
					field454 = 3;
				}
			}

			if (var4 == 98) {
				boolean var18 = method155(var2, var3, 2, 0, field264.field35[0], false, 0, field264.field34[0], 0, 0, 0);
				if (!var18) {
					method155(var2, var3, 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
				}

				field224 = field90;
				field225 = field91;
				field227 = 2;
				field226 = 0;
				field560.method213(105);
				field560.method251(field549 + var3);
				field560.method249(var5);
				field560.method250(field548 + var2);
			}

			if (var4 == 582) {
				IRYXZZFE var20 = IRYXZZFE.method329(var3);
				field573 = 1;
				field574 = var3;
				field575 = var20.field820;
				field492 = 0;
				field488 = true;
				String var21 = var20.field821;
				if (var21.indexOf(" ") != -1) {
					var21 = var21.substring(0, var21.indexOf(" "));
				}

				String var22 = var20.field821;
				if (var22.indexOf(" ") != -1) {
					var22 = var22.substring(var22.indexOf(" ") + 1);
				}

				field576 = var21 + " " + var20.field779 + " " + var22;

				if (field575 == 16) {
					field488 = true;
					field324 = 3;
					field238 = true;
				}
			} else {
				if (var4 == 403) {
					ONCZAQCQ var23 = field209[var5];
					if (var23 != null) {
						method155(var23.field34[0], var23.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
						field224 = field90;
						field225 = field91;
						field227 = 2;
						field226 = 0;
						field560.method213(21);
						field560.method249(var5);
						field560.method249(field574);
					}
				}

				if (var4 == 703) {
					AWOZVMFS var24 = field509[var5];
					if (var24 != null) {
						method155(var24.field34[0], var24.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
						field224 = field90;
						field225 = field91;
						field227 = 2;
						field226 = 0;
						field560.method213(189);
						field560.method250(var5);
						field560.method215(field494);
						field560.method250(field493);
						field560.method249(field495);
					}
				}

				if (var4 == 419 && method101(var2, var5, var3)) {
					field560.method213(18);
					field560.method251(field495);
					field560.method250(var5 >> 14 & 0x7FFF);
					field560.method215(field493);
					field560.method249(field548 + var2);
					field560.method251(field494);
					field560.method215(field549 + var3);
				}

				if (var4 == 621) {
					AWOZVMFS var25 = field509[var5];
					if (var25 != null) {
						method155(var25.field34[0], var25.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
						field224 = field90;
						field225 = field91;
						field227 = 2;
						field226 = 0;
						field560.method213(170);
						field560.method250(field574);
						field560.method215(var5);
					}
				}

				if (var4 == 184) {
					boolean var26 = method155(var2, var3, 2, 0, field264.field35[0], false, 0, field264.field34[0], 0, 0, 0);
					if (!var26) {
						method155(var2, var3, 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
					}

					field224 = field90;
					field225 = field91;
					field227 = 2;
					field226 = 0;
					field560.method213(41);
					field560.method215(var5);
					field560.method251(field549 + var3);
					field560.method215(field548 + var2);
				}

				if (var4 == 985) {
					field299 += var3;
					if (field299 >= 145) {
						field560.method213(100);
						field299 = 0;
					}

					method101(var2, var5, var3);
					field560.method213(59);
					field560.method215(var5 >> 14 & 0x7FFF);
					field560.method249(field549 + var3);
					field560.method250(field548 + var2);
				}

				if (var4 == 883) {
					AWOZVMFS var28 = field509[var5];
					if (var28 != null) {
						method155(var28.field34[0], var28.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
						field224 = field90;
						field225 = field91;
						field227 = 2;
						field226 = 0;
						field560.method213(99);
						field560.method251(var5);
					}
				}

				if (var4 == 16) {
					if (field349) {
						field363.method566(var2 - 4, var3 - 4);
					} else {
						field363.method566(field90 - 4, field91 - 4);
					}
				}

				if (var4 == 208) {
					method88();
				}

				if (var4 == 1577) {
					method101(var2, var5, var3);
					field560.method213(206);
					field560.method251(field548 + var2);
					field560.method249(field549 + var3);
					field560.method215(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 787) {
					String var29 = field245[arg0];
					int var30 = var29.indexOf("@whi@");
					if (var30 != -1) {
						if (field239 == -1) {
							method88();
							field538 = var29.substring(var30 + 5).trim();
							field439 = false;
							field547 = field239 = IRYXZZFE.field769;
						} else {
							method126(0, "Please close the interface you have open before using 'report abuse'", "");
						}
					}
				}

				if (var4 == 157 && method101(var2, var5, var3)) {
					field560.method213(90);
					field560.method215(field549 + var3);
					field560.method250(var5 >> 14 & 0x7FFF);
					field560.method215(field548 + var2);
					field560.method251(field574);
				}

				if (var4 == 62) {
					boolean var31 = method155(var2, var3, 2, 0, field264.field35[0], false, 0, field264.field34[0], 0, 0, 0);
					if (!var31) {
						method155(var2, var3, 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
					}

					field224 = field90;
					field225 = field91;
					field227 = 2;
					field226 = 0;
					field560.method213(113);
					field560.method250(field493);
					field560.method249(field549 + var3);
					field560.method250(field495);
					field560.method251(field494);
					field560.method215(field548 + var2);
					field560.method215(var5);
				}

				if (var4 == 391) {
					field560.method213(174);
					field560.method250(var2);
					field560.method251(var5);
					field560.method249(var3);
					field451 = 0;
					field452 = var3;
					field453 = var2;
					field454 = 2;
					if (IRYXZZFE.method329(var3).field777 == field239) {
						field454 = 1;
					}

					if (IRYXZZFE.method329(var3).field777 == field450) {
						field454 = 3;
					}
				}

				if (var4 == 233) {
					AWOZVMFS var33 = field509[var5];
					if (var33 != null) {
						method155(var33.field34[0], var33.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
						field224 = field90;
						field225 = field91;
						field227 = 2;
						field226 = 0;
						field560.method213(190);
						field560.method215(var5);
					}
				}

				if (var4 == 81) {
					boolean var34 = method155(var2, var3, 2, 0, field264.field35[0], false, 0, field264.field34[0], 0, 0, 0);
					if (!var34) {
						method155(var2, var3, 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
					}

					field224 = field90;
					field225 = field91;
					field227 = 2;
					field226 = 0;
					field560.method213(12);
					field560.method250(var5);
					field560.method215(field549 + var3);
					field560.method251(field548 + var2);
				}

				if (var4 == 696 || var4 == 379 || var4 == 526 || var4 == 212) {
					String var36 = field245[arg0];
					int var37 = var36.indexOf("@whi@");
					if (var37 != -1) {
						long var38 = LGOZNEAG.method366(var36.substring(var37 + 5).trim());
						if (var4 == 696) {
							method68(var38);
						}

						if (var4 == 379) {
							method57(var38);
						}

						if (var4 == 526) {
							method61(var38);
						}

						if (var4 == 212) {
							method114(var38);
						}
					}
				}

				if (var4 == 1184) {
					XLZQSPZS var40 = XLZQSPZS.method526(var5);
					String var41;
					if (var40.field1333 == null) {
						var41 = "It's a " + var40.field1338 + ".";
					} else {
						var41 = new String(var40.field1333);
					}

					method126(0, var41, "");
				}

				if (var4 == 963) {
					field492 = 1;
					field493 = var2;
					field494 = var3;
					field495 = var5;
					field496 = XLZQSPZS.method526(var5).field1338;
					field573 = 0;
					field488 = true;
				} else {
					if (var4 == 447) {
						ONCZAQCQ var42 = field209[var5];
						if (var42 != null) {
							method155(var42.field34[0], var42.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
							field224 = field90;
							field225 = field91;
							field227 = 2;
							field226 = 0;
							field560.method213(163);
							field560.method250(var5);
						}
					}

					if (var4 == 940 || var4 == 113) {
						String var43 = field245[arg0];
						int var44 = var43.indexOf("@whi@");
						if (var44 != -1) {
							var43 = var43.substring(var44 + 5).trim();
							String var45 = LGOZNEAG.method370(LGOZNEAG.method367(LGOZNEAG.method366(var43)));
							boolean var46 = false;
							for (int var47 = 0; var47 < field510; var47++) {
								AWOZVMFS var48 = field509[field511[var47]];
								if (var48 != null && var48.field117 != null && var48.field117.equalsIgnoreCase(var45)) {
									method155(var48.field34[0], var48.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);

									if (var4 == 940) {
										field560.method213(162);
										field560.method215(field511[var47]);
									}

									if (var4 == 113) {
										field560.method213(99);
										field560.method251(field511[var47]);
									}

									var46 = true;
									break;
								}
							}

							if (!var46) {
								method126(0, "Unable to find " + var45, "");
							}
						}
					}

					if (var4 == 482) {
						method146(field566);
						field566 = -1;
						field579 = true;
					}

					if (var4 == 896) {
						AWOZVMFS var49 = field509[var5];
						if (var49 != null) {
							method155(var49.field34[0], var49.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
							field224 = field90;
							field225 = field91;
							field227 = 2;
							field226 = 0;
							field560.method213(162);
							field560.method215(var5);
						}
					}

					if (var4 == 789) {
						field560.method213(14);
						field560.method251(field574);
						field560.method215(var5);
						field560.method249(var3);
						field560.method250(var2);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (IRYXZZFE.method329(var3).field777 == field239) {
							field454 = 1;
						}

						if (IRYXZZFE.method329(var3).field777 == field450) {
							field454 = 3;
						}
					}

					if (var4 == 766) {
						method101(var2, var5, var3);
						field560.method213(217);
						field560.method251(field548 + var2);
						field560.method249(field549 + var3);
						field560.method249(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 247) {
						String var50 = field245[arg0];
						int var51 = var50.indexOf("@whi@");
						if (var51 != -1) {
							long var52 = LGOZNEAG.method366(var50.substring(var51 + 5).trim());
							int var54 = -1;
							for (int var55 = 0; var55 < field158; var55++) {
								if (field467[var55] == var52) {
									var54 = var55;
									break;
								}
							}

							if (var54 != -1 && field408[var54] > 0) {
								field579 = true;
								field567 = 0;
								field553 = true;
								field221 = "";
								field465 = 3;
								field177 = field467[var54];
								field585 = "Enter message to send to " + field472[var54];
							}
						}
					}

					if (var4 == 277) {
						field184++;
						if (field184 >= 132) {
							field560.method213(95);
							field560.method218(0);
							field184 = 0;
						}

						field560.method213(93);
						field560.method250(var3);
						field560.method250(var2);
						field560.method215(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (IRYXZZFE.method329(var3).field777 == field239) {
							field454 = 1;
						}

						if (IRYXZZFE.method329(var3).field777 == field450) {
							field454 = 3;
						}
					}

					if (var4 == 359) {
						AWOZVMFS var56 = field509[var5];
						if (var56 != null) {
							method155(var56.field34[0], var56.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
							field224 = field90;
							field225 = field91;
							field227 = 2;
							field226 = 0;
							field560.method213(134);
							field560.method249(var5);
						}
					}

					if (var4 == 530) {
						field560.method213(19);
						field560.method249(var3);
						field560.method249(var2);
						field560.method251(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (IRYXZZFE.method329(var3).field777 == field239) {
							field454 = 1;
						}

						if (IRYXZZFE.method329(var3).field777 == field450) {
							field454 = 3;
						}
					}

					if (var4 == 485) {
						field560.method213(117);
						field560.method251(var5);
						field560.method249(var2);
						field560.method251(var3);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (IRYXZZFE.method329(var3).field777 == field239) {
							field454 = 1;
						}

						if (IRYXZZFE.method329(var3).field777 == field450) {
							field454 = 3;
						}
					}

					if (var4 == 538) {
						boolean var57 = method155(var2, var3, 2, 0, field264.field35[0], false, 0, field264.field34[0], 0, 0, 0);
						if (!var57) {
							method155(var2, var3, 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
						}

						field224 = field90;
						field225 = field91;
						field227 = 2;
						field226 = 0;
						field560.method213(104);
						field560.method250(field548 + var2);
						field560.method215(field549 + var3);
						field560.method249(field574);
						field560.method215(var5);
					}

					if (var4 == 689) {
						boolean var59 = method155(var2, var3, 2, 0, field264.field35[0], false, 0, field264.field34[0], 0, 0, 0);
						if (!var59) {
							method155(var2, var3, 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
						}

						field224 = field90;
						field225 = field91;
						field227 = 2;
						field226 = 0;
						field223 += var3;
						if (field223 >= 102) {
							field560.method213(30);
							field560.method218(0);
							field223 = 0;
						}

						field560.method213(57);
						field560.method215(var5);
						field560.method215(field548 + var2);
						field560.method250(field549 + var3);
					}

					if (var4 == 790) {
						field560.method213(208);
						field560.method215(var3);
						IRYXZZFE var61 = IRYXZZFE.method329(var3);
						if (var61.field825 != null && var61.field825[0][0] == 5) {
							int var62 = var61.field825[0][1];
							field580[var62] = 1 - field580[var62];
							method132(var62);
							field488 = true;
						}
					}

					if (var4 == 1870) {
						XLZQSPZS var63 = XLZQSPZS.method526(var5);
						IRYXZZFE var64 = IRYXZZFE.method329(var3);
						String var65;
						if (var64 != null && var64.field791[var2] >= 100000) {
							var65 = var64.field791[var2] + " x " + var63.field1338;
						} else if (var63.field1333 == null) {
							var65 = "It's a " + var63.field1338 + ".";
						} else {
							var65 = new String(var63.field1333);
						}

						method126(0, var65, "");
					}

					if (var4 == 256) {
						method101(var2, var5, var3);
						field560.method213(102);
						field560.method249(field548 + var2);
						field560.method250(field549 + var3);
						field560.method250(var5 >> 14 & 0x7FFF);
					}

					if (var4 == 588) {
						method101(var2, var5, var3);
						field560.method213(9);
						field560.method249(field549 + var3);
						field560.method250(var5 >> 14 & 0x7FFF);
						field560.method251(field548 + var2);
					}

					if (var4 == 152) {
						if ((var2 & 0x3) == 0) {
							field475++;
						}

						if (field475 >= 129) {
							field560.method213(87);
							field560.method215(37562);
							field475 = 0;
						}

						field560.method213(176);
						field560.method215(var3);
						field560.method215(var2);
						field560.method215(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (IRYXZZFE.method329(var3).field777 == field239) {
							field454 = 1;
						}

						if (IRYXZZFE.method329(var3).field777 == field450) {
							field454 = 3;
						}
					}

					if (var4 == 145) {
						AWOZVMFS var66 = field509[var5];
						if (var66 != null) {
							method155(var66.field34[0], var66.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
							field224 = field90;
							field225 = field91;
							field227 = 2;
							field226 = 0;
							field259 += var5;
							if (field259 >= 50) {
								field560.method213(164);
								field560.method217(0x3A9711);
								field259 = 0;
							}

							field560.method213(54);
							field560.method250(var5);
						}
					}

					if (var4 == 1327) {
						int var67 = var5 >> 14 & 0x7FFF;
						DQLJXYPC var68 = DQLJXYPC.method192(var67);
						String var69;
						if (var68.field624 == null) {
							var69 = "It's a " + var68.field662 + ".";
						} else {
							var69 = new String(var68.field624);
						}

						method126(0, var69, "");
					}

					if (var4 == 24) {
						ONCZAQCQ var70 = field209[var5];
						if (var70 != null) {
							method155(var70.field34[0], var70.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
							field224 = field90;
							field225 = field91;
							field227 = 2;
							field226 = 0;
							field560.method213(76);
							field560.method251(var5);
						}
					}

					if (var4 == 851) {
						ONCZAQCQ var71 = field209[var5];
						if (var71 != null) {
							method155(var71.field34[0], var71.field35[0], 2, 1, field264.field35[0], false, 0, field264.field34[0], 0, 1, 0);
							field224 = field90;
							field225 = field91;
							field227 = 2;
							field226 = 0;

							if ((var5 & 0x3) == 0) {
								field249++;
							}

							if (field249 >= 111) {
								field560.method213(199);
								field560.method218(0);
								field249 = 0;
							}

							field560.method213(37);
							field560.method215(var5);
						}
					}

					if (var4 == 395) {
						field560.method213(137);
						field560.method249(var3);
						field560.method215(field494);
						field560.method249(field495);
						field560.method250(field493);
						field560.method250(var2);
						field560.method249(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (IRYXZZFE.method329(var3).field777 == field239) {
							field454 = 1;
						}

						if (IRYXZZFE.method329(var3).field777 == field450) {
							field454 = 3;
						}
					}

					if (var4 == 181) {
						field560.method213(140);
						field560.method249(var2);
						field560.method250(var3);
						field560.method251(var5);
						field451 = 0;
						field452 = var3;
						field453 = var2;
						field454 = 2;
						if (IRYXZZFE.method329(var3).field777 == field239) {
							field454 = 1;
						}

						if (IRYXZZFE.method329(var3).field777 == field450) {
							field454 = 3;
						}
					}

					field492 = 0;
					field573 = 0;
					field488 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method52(int arg0, int arg1) {
		boolean var3 = false;
		IRYXZZFE var4 = IRYXZZFE.method329(arg0);
		for (int var5 = 0; var5 < var4.field793.length && var4.field793[var5] != -1; var5++) {
			IRYXZZFE var6 = IRYXZZFE.method329(var4.field793[var5]);
			if (var6.field804 == 1) {
				var3 |= method52(var6.field796, arg1);
			}

			if (var6.field804 == 6 && (var6.field780 != -1 || var6.field781 != -1)) {
				boolean var7 = method45(var6);
				int var8;
				if (var7) {
					var8 = var6.field781;
				} else {
					var8 = var6.field780;
				}

				if (var8 != -1) {
					ODMBIHRM var9 = ODMBIHRM.field1035[var8];
					var6.field840 += arg1;
					while (var6.field840 > var9.method413(var6.field830)) {
						var6.field840 -= var9.method413(var6.field830) + 1;
						var6.field830++;
						if (var6.field830 >= var9.field1036) {
							var6.field830 -= var9.field1040;
							if (var6.field830 < 0 || var6.field830 >= var9.field1036) {
								var6.field830 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field804 == 6 && var6.field794 != 0) {
				int var10 = var6.field794 >> 16;
				int var11 = var6.field794 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field832 = var6.field832 + var10 & 0x7FF;
				var6.field833 = var6.field833 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static final String method53(int arg0) {
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

	@ObfuscatedName("client.b(BI)V")
	public final void method54(int arg0) {
		if (!field215) {
			for (int var2 = 0; var2 < field235.length; var2++) {
				int var3 = field235[var2];
				if (GBZDHVLZ.field725[var3] >= arg0) {
					FCRLGSQA var4 = GBZDHVLZ.field719[var3];
					int var5 = var4.field699 * var4.field698 - 1;
					int var6 = field401 * var4.field698 * 2;
					byte[] var7 = var4.field696;
					byte[] var8 = field423;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field696 = var8;
					field423 = var7;
					GBZDHVLZ.method287(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZI)V")
	public final void method55(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field430.method270(arg3, arg4);
		field431.method270(arg3, arg1 + arg4 - 16);
		IFHRXNFO.method315(field319, arg3, 16, arg1 - 32, arg4 + 16);
		int var6 = (arg1 - 32) * arg1 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg0 / (arg2 - arg1);
		IFHRXNFO.method315(field265, arg3, 16, var6, arg4 + var7 + 16);
		IFHRXNFO.method320(arg3, field470, arg4 + var7 + 16, var6);
		IFHRXNFO.method320(arg3 + 1, field470, arg4 + var7 + 16, var6);
		IFHRXNFO.method318(16, arg4 + var7 + 16, arg3, field470);
		IFHRXNFO.method318(16, arg4 + var7 + 17, arg3, field470);
		IFHRXNFO.method320(arg3 + 15, field257, arg4 + var7 + 16, var6);
		IFHRXNFO.method320(arg3 + 14, field257, arg4 + var7 + 17, var6 - 1);
		IFHRXNFO.method318(16, arg4 + var7 + var6 + 15, arg3, field257);
		IFHRXNFO.method318(15, arg4 + var7 + var6 + 14, arg3 + 1, field257);
	}

	@ObfuscatedName("client.a(BLIRYXZZFE;)Z")
	public final boolean method56(IRYXZZFE arg0) {
		int var2 = arg0.field773;
		if (field159 == 2) {
			if (var2 == 201) {
				field579 = true;
				field567 = 0;
				field553 = true;
				field221 = "";
				field465 = 1;
				field585 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field579 = true;
				field567 = 0;
				field553 = true;
				field221 = "";
				field465 = 2;
				field585 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field393 = 250;
			return true;
		}

		if (var2 == 501) {
			field579 = true;
			field567 = 0;
			field553 = true;
			field221 = "";
			field465 = 4;
			field585 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field579 = true;
			field567 = 0;
			field553 = true;
			field221 = "";
			field465 = 5;
			field585 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field346[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = TFKCMRVE.field1185 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= TFKCMRVE.field1185) {
							var5 = 0;
						}
					}

					if (!TFKCMRVE.field1186[var5].field1192 && TFKCMRVE.field1186[var5].field1187 == var3 + (field552 ? 0 : 7)) {
						break;
					}
				}

				field346[var3] = var5;
				field234 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field583[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field409[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field409[var6].length) {
					var8 = 0;
				}
			}

			field583[var6] = var8;
			field234 = true;
		}

		if (var2 == 324 && !field552) {
			field552 = true;
			method80();
		}

		if (var2 == 325 && field552) {
			field552 = false;
			method80();
		}

		if (var2 == 326) {
			field560.method213(205);
			field560.method214(field552 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field560.method214(field346[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field560.method214(field583[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field439 = !field439;
		}

		if (var2 >= 601 && var2 <= 613) {
			method88();

			if (field538.length() > 0) {
				field560.method213(3);
				field560.method220(LGOZNEAG.method366(field538));
				field560.method214(var2 - 601);
				field560.method214(field439 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method57(long arg0) {
		if (arg0 != 0L) {
			if (field203 >= 100) {
				method126(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = LGOZNEAG.method370(LGOZNEAG.method367(arg0));
				for (int var4 = 0; var4 < field203; var4++) {
					if (field520[var4] == arg0) {
						method126(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field158; var5++) {
					if (field467[var5] == arg0) {
						method126(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field520[field203++] = arg0;
				field488 = true;
				field560.method213(71);
				field560.method220(arg0);
			}
		}
	}

	@ObfuscatedName("client.g(I)Ljava/lang/String;")
	public final String method58() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field78 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.h(I)Z")
	public final boolean method59() {
		if (field522 == null) {
			return false;
		}

		try {
			int var1 = field522.method3();
			if (var1 == 0) {
				return false;
			}

			if (field390 == -1) {
				field522.method4(field200.field683, 0, 1);
				field390 = field200.field683[0] & 0xFF;
				if (field562 != null) {
					field390 = field390 - field562.method580() & 0xFF;
				}

				field389 = PIJHJWII.field1086[field390];
				var1--;
			}

			if (field389 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field522.method4(field200.field683, 0, 1);
				field389 = field200.field683[0] & 0xFF;
				var1--;
			}

			if (field389 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field522.method4(field200.field683, 0, 2);
				field200.field684 = 0;
				field389 = field200.method226();
				var1 -= 2;
			}

			if (var1 < field389) {
				return false;
			}

			field200.field684 = 0;
			field522.method4(field200.field683, 0, field389);
			field391 = 0;
			field207 = field206;
			field206 = field205;
			field205 = field390;

			if (field390 == 46) {
				int var2 = field200.method226();
				int var3 = field200.method252();
				int var4 = var2 >> 10 & 0x1F;
				int var5 = var2 >> 5 & 0x1F;
				int var6 = var2 & 0x1F;
				IRYXZZFE.method329(var3).field774 = (var6 << 3) + (var4 << 19) + (var5 << 11);
				field390 = -1;
				return true;
			}

			if (field390 == 152 || field390 == 20) {
				int var7 = field424;
				int var8 = field425;
				if (field390 == 152) {
					var8 = field200.method254();
					var7 = field200.method254();
					field458 = false;
				}

				if (field390 == 20) {
					field200.method234();

					for (int var9 = 0; var9 < 4; var9++) {
						for (int var10 = 0; var10 < 13; var10++) {
							for (int var11 = 0; var11 < 13; var11++) {
								int var12 = field200.method235(1);
								if (var12 == 1) {
									field446[var9][var10][var11] = field200.method235(26);
								} else {
									field446[var9][var10][var11] = -1;
								}
							}
						}
					}

					field200.method236();
					var7 = field200.method226();
					var8 = field200.method252();
					field458 = true;
				}

				if (field424 == var7 && field425 == var8 && field164 == 2) {
					field390 = -1;
					return true;
				}

				field424 = var7;
				field425 = var8;
				field548 = (field424 - 6) * 8;
				field549 = (field425 - 6) * 8;
				field565 = false;
				if ((field424 / 8 == 48 || field424 / 8 == 49) && field425 / 8 == 48) {
					field565 = true;
				}

				if (field424 / 8 == 48 && field425 / 8 == 148) {
					field565 = true;
				}

				field164 = 1;
				field218 = System.currentTimeMillis();
				method72("Loading - please wait.", null);

				if (field390 == 152) {
					int var13 = 0;
					for (int var14 = (field424 - 6) / 8; var14 <= (field424 + 6) / 8; var14++) {
						for (int var15 = (field425 - 6) / 8; var15 <= (field425 + 6) / 8; var15++) {
							var13++;
						}
					}

					field372 = new byte[var13][];
					field270 = new byte[var13][];
					field174 = new int[var13];
					field175 = new int[var13];
					field176 = new int[var13];
					int var16 = 0;
					for (int var17 = (field424 - 6) / 8; var17 <= (field424 + 6) / 8; var17++) {
						for (int var18 = (field425 - 6) / 8; var18 <= (field425 + 6) / 8; var18++) {
							field174[var16] = (var17 << 8) + var18;

							if (field565 && (var18 == 49 || var18 == 149 || var18 == 147 || var17 == 50 || var17 == 49 && var18 == 47)) {
								field175[var16] = -1;
								field176[var16] = -1;
								var16++;
							} else {
								int var19 = field175[var16] = field543.method601(var18, var17, 0);
								if (var19 != -1) {
									field543.method585(3, var19);
								}

								int var20 = field176[var16] = field543.method601(var18, var17, 1);
								if (var20 != -1) {
									field543.method585(3, var20);
								}

								var16++;
							}
						}
					}
				}

				if (field390 == 20) {
					int var21 = 0;
					int[] var22 = new int[676];
					for (int var23 = 0; var23 < 4; var23++) {
						for (int var24 = 0; var24 < 13; var24++) {
							for (int var25 = 0; var25 < 13; var25++) {
								int var26 = field446[var23][var24][var25];
								if (var26 != -1) {
									int var27 = var26 >> 14 & 0x3FF;
									int var28 = var26 >> 3 & 0x7FF;
									int var29 = (var27 / 8 << 8) + var28 / 8;
									for (int var30 = 0; var30 < var21; var30++) {
										if (var22[var30] == var29) {
											var29 = -1;
											break;
										}
									}

									if (var29 != -1) {
										var22[var21++] = var29;
									}
								}
							}
						}
					}

					field372 = new byte[var21][];
					field270 = new byte[var21][];
					field174 = new int[var21];
					field175 = new int[var21];
					field176 = new int[var21];
					for (int var31 = 0; var31 < var21; var31++) {
						int var32 = field174[var31] = var22[var31];
						int var33 = var32 >> 8 & 0xFF;
						int var34 = var32 & 0xFF;
						int var35 = field175[var31] = field543.method601(var34, var33, 0);
						if (var35 != -1) {
							field543.method585(3, var35);
						}

						int var36 = field176[var31] = field543.method601(var34, var33, 1);
						if (var36 != -1) {
							field543.method585(3, var36);
						}
					}
				}

				int var37 = field548 - field550;
				int var38 = field549 - field551;
				field550 = field548;
				field551 = field549;

				for (int var39 = 0; var39 < 16384; var39++) {
					ONCZAQCQ var40 = field209[var39];
					if (var40 != null) {
						for (int var41 = 0; var41 < 10; var41++) {
							var40.field34[var41] -= var37;
							var40.field35[var41] -= var38;
						}

						var40.field62 -= var37 * 128;
						var40.field63 -= var38 * 128;
					}
				}

				for (int var42 = 0; var42 < field507; var42++) {
					AWOZVMFS var43 = field509[var42];
					if (var43 != null) {
						for (int var44 = 0; var44 < 10; var44++) {
							var43.field34[var44] -= var37;
							var43.field35[var44] -= var38;
						}

						var43.field62 -= var37 * 128;
						var43.field63 -= var38 * 128;
					}
				}

				field240 = true;
				byte var45 = 0;
				byte var46 = 104;
				byte var47 = 1;
				if (var37 < 0) {
					var45 = 103;
					var46 = -1;
					var47 = -1;
				}

				byte var48 = 0;
				byte var49 = 104;
				byte var50 = 1;
				if (var38 < 0) {
					var48 = 103;
					var49 = -1;
					var50 = -1;
				}

				for (int var51 = var45; var51 != var46; var51 += var47) {
					for (int var52 = var48; var52 != var49; var52 += var50) {
						int var53 = var37 + var51;
						int var54 = var38 + var52;
						for (int var55 = 0; var55 < 4; var55++) {
							if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
								field362[var55][var51][var52] = field362[var55][var53][var54];
							} else {
								field362[var55][var51][var52] = null;
							}
						}
					}
				}

				for (HCPBXDEK var56 = (HCPBXDEK) field474.method275(); var56 != null; var56 = (HCPBXDEK) field474.method277()) {
					var56.field745 -= var37;
					var56.field746 -= var38;
					if (var56.field745 < 0 || var56.field746 < 0 || var56.field745 >= 104 || var56.field746 >= 104) {
						var56.method334();
					}
				}

				if (field394 != 0) {
					field394 -= var37;
					field395 -= var38;
				}

				field260 = false;
				field390 = -1;
				return true;
			}

			if (field390 == 5) {
				method71();
				field390 = -1;
				return false;
			}

			if (field390 == 106) {
				int var57 = field200.method252();
				int var58 = field200.method226();
				int var59 = field200.method226();

				if (var57 == 0xFFFF) {
					IRYXZZFE.method329(var58).field806 = 0;
					field390 = -1;
					return true;
				}

				XLZQSPZS var60 = XLZQSPZS.method526(var57);
				IRYXZZFE.method329(var58).field806 = 4;
				IRYXZZFE.method329(var58).field807 = var57;
				IRYXZZFE.method329(var58).field832 = var60.field1336;
				IRYXZZFE.method329(var58).field833 = var60.field1318;
				IRYXZZFE.method329(var58).field831 = var60.field1322 * 100 / var59;
				field390 = -1;
				return true;
			}

			if (field390 == 53) {
				int var61 = field200.method254();
				int var62 = field200.method252();
				IRYXZZFE.method329(var62).field806 = 2;
				IRYXZZFE.method329(var62).field807 = var61;
				field390 = -1;
				return true;
			}

			if (field390 == 192) {
				for (int var63 = 0; var63 < field580.length; var63++) {
					if (field580[var63] != field276[var63]) {
						field580[var63] = field276[var63];
						method132(var63);
						field488 = true;
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 16) {
				field437 = field200.method243();
				field436 = field200.method245();

				while (field200.field684 < field389) {
					int var64 = field200.method224();
					method131(var64, field200);
				}

				field390 = -1;
				return true;
			}

			if (field390 == 128) {
				field488 = true;
				int var65 = field200.method259();
				int var66 = field200.method243();
				int var67 = field200.method245();
				field196[var67] = var65;
				field542[var67] = var66;
				field578[var67] = 1;
				for (int var68 = 0; var68 < 98; var68++) {
					if (var65 >= field584[var68]) {
						field578[var67] = var68 + 2;
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 205) {
				field312 = field200.method259();
				field455 = field200.method226();
				field459 = field200.method252();
				field228 = field200.method226();
				field200.method254();
				field305 = field200.method243();
				field359 = field200.method252();
				field333 = field200.method226();
				field202 = field200.method254();
				field369 = field200.method253();
				field200.method226();
				signlink.dnslookup(LGOZNEAG.method369(field312));
				field390 = -1;
				return true;
			}

			if (field390 == 125) {
				field324 = field200.method243();
				field488 = true;
				field238 = true;
				field390 = -1;
				return true;
			}

			if (field390 == 14) {
				int var69 = field200.method226();
				method93(var69);

				if (field468 != -1) {
					method146(field468);
					field468 = -1;
					field488 = true;
					field238 = true;
				}

				if (field450 != -1) {
					method146(field450);
					field450 = -1;
					field579 = true;
				}

				if (field568 != -1) {
					method146(field568);
					field568 = -1;
					field356 = true;
				}

				if (field246 != -1) {
					method146(field246);
					field246 = -1;
				}

				if (field239 != var69) {
					method146(field239);
					field239 = var69;
				}

				if (field567 != 0) {
					field567 = 0;
					field579 = true;
				}

				field400 = false;
				field390 = -1;
				return true;
			}

			if (field390 == 129) {
				field480 = field200.method224();
				if (field480 == field324) {
					if (field480 == 3) {
						field324 = 1;
					} else {
						field324 = 3;
					}

					field488 = true;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 136) {
				boolean var70 = field200.method245() == 1;
				int var71 = field200.method226();
				IRYXZZFE.method329(var71).field799 = var70;
				field390 = -1;
				return true;
			}

			if (field390 == 15) {
				int var72 = field200.method226();
				int var73 = field200.method253();
				method93(var72);

				if (var73 != -1) {
					method93(var73);
				}

				if (field239 != -1) {
					method146(field239);
					field239 = -1;
				}

				if (field468 != -1) {
					method146(field468);
					field468 = -1;
				}

				if (field450 != -1) {
					method146(field450);
					field450 = -1;
				}

				if (field568 != var72) {
					method146(field568);
					field568 = var72;
				}

				if (field246 != var72) {
					method146(field246);
					field246 = var73;
				}

				field567 = 0;
				field400 = false;
				field390 = -1;
				return true;
			}

			if (field390 == 104) {
				int var74 = field200.method226();
				int var75 = field200.method224();
				int var76 = field200.method226();
				if (field252 && !field215 && field554 < 50) {
					field501[field554] = var74;
					field268[field554] = var75;
					field241[field554] = GTYZUNUD.field730[var74] + var76;
					field554++;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 181) {
				field260 = true;
				field326 = field200.method224();
				field327 = field200.method224();
				field328 = field200.method226();
				field329 = field200.method224();
				field330 = field200.method224();
				if (field330 >= 100) {
					field169 = field326 * 128 + 64;
					field171 = field327 * 128 + 64;
					field170 = method129(field169, field171, field165) - field328;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 56) {
				int var77 = field200.method253();
				int var78 = field200.method252();
				int var79 = field200.method226();
				int var80 = field200.method254();
				IRYXZZFE.method329(var79).field832 = var78;
				IRYXZZFE.method329(var79).field833 = var77;
				IRYXZZFE.method329(var79).field831 = var80;
				field390 = -1;
				return true;
			}

			if (field390 == 40 || field390 == 2 || field390 == 255 || field390 == 65 || field390 == 175 || field390 == 146 || field390 == 121 || field390 == 250 || field390 == 126 || field390 == 164 || field390 == 198) {
				method131(field390, field200);
				field390 = -1;
				return true;
			}

			if (field390 == 158) {
				int var81 = field200.method226();
				int var82 = field200.method254();
				int var83 = field200.method252();
				IRYXZZFE.method329(var81).field794 = (var83 << 16) + var82;
				field390 = -1;
				return true;
			}

			if (field390 == 114) {
				field553 = false;
				field567 = 1;
				field178 = "";
				field579 = true;
				field390 = -1;
				return true;
			}

			if (field390 == 251) {
				field502 = field200.method252();
				field360 = field200.method245();
				field390 = -1;
				return true;
			}

			if (field390 == 150) {
				byte var84 = field200.method225();
				int var85 = field200.method226();
				field276[var85] = var84;

				if (field580[var85] != var84) {
					field580[var85] = var84;
					method132(var85);
					field488 = true;

					if (field566 != -1) {
						field579 = true;
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 216) {
				int var86 = field200.method224();
				int var87 = field200.method245();
				String var88 = field200.method231();
				if (var86 >= 1 && var86 <= 5) {
					if (var88.equalsIgnoreCase("null")) {
						var88 = null;
					}

					field536[var86 - 1] = var88;
					field537[var86 - 1] = var87 == 0;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 179) {
				if (field324 == 12) {
					field488 = true;
				}

				field156 = field200.method227();
				field390 = -1;
				return true;
			}

			if (field390 == 35) {
				int var89 = field200.method253();
				int var90 = field200.method226();
				IRYXZZFE var91 = IRYXZZFE.method329(var90);
				if (var91 != null && var91.field804 == 0) {
					if (var89 < 0) {
						var89 = 0;
					}

					if (var89 > var91.field803 - var91.field792) {
						var89 = var91.field803 - var91.field792;
					}

					var91.field810 = var89;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 137) {
				field260 = false;

				for (int var92 = 0; var92 < 5; var92++) {
					field306[var92] = false;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 124) {
				field553 = false;
				field567 = 2;
				field178 = "";
				field579 = true;
				field390 = -1;
				return true;
			}

			if (field390 == 253) {
				if (field468 != -1) {
					method146(field468);
					field468 = -1;
					field488 = true;
					field238 = true;
				}

				if (field450 != -1) {
					method146(field450);
					field450 = -1;
					field579 = true;
				}

				if (field568 != -1) {
					method146(field568);
					field568 = -1;
					field356 = true;
				}

				if (field246 != -1) {
					method146(field246);
					field246 = -1;
				}

				if (field239 != -1) {
					method146(field239);
					field239 = -1;
				}

				if (field567 != 0) {
					field567 = 0;
					field579 = true;
				}

				field400 = false;
				field390 = -1;
				return true;
			}

			if (field390 == 100) {
				field557 = field200.method224();
				field390 = -1;
				return true;
			}

			if (field390 == 241) {
				field436 = field200.method244();
				field437 = field200.method244();
				for (int var93 = field436; var93 < field436 + 8; var93++) {
					for (int var94 = field437; var94 < field437 + 8; var94++) {
						if (field362[field165][var93][var94] != null) {
							field362[field165][var93][var94] = null;
							method133(var93, var94);
						}
					}
				}

				for (HCPBXDEK var95 = (HCPBXDEK) field474.method275(); var95 != null; var95 = (HCPBXDEK) field474.method277()) {
					if (var95.field745 >= field436 && var95.field745 < field436 + 8 && var95.field746 >= field437 && var95.field746 < field437 + 8 && field165 == var95.field743) {
						var95.field742 = 0;
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 172) {
				method69(field389, field200);
				field390 = -1;
				return true;
			}

			if (field390 == 219) {
				field535 = field200.method224();
				field390 = -1;
				return true;
			}

			if (field390 == 148) {
				field449 = field200.method224();
				field315 = field200.method224();
				field343 = field200.method224();
				field426 = true;
				field579 = true;
				field390 = -1;
				return true;
			}

			if (field390 == 49) {
				int var96 = field200.method243();
				int var97 = field200.method226();
				if (var97 == 0xFFFF) {
					var97 = -1;
				}

				if (field516[var96] != var97) {
					method146(field516[var96]);
					field516[var96] = var97;
				}

				field488 = true;
				field238 = true;
				field390 = -1;
				return true;
			}

			if (field390 == 52) {
				field394 = 0;
				field390 = -1;
				return true;
			}

			if (field390 == 223) {
				String var98 = field200.method231();
				int var99 = field200.method252();
				IRYXZZFE.method329(var99).field800 = var98;

				if (field516[field324] == IRYXZZFE.method329(var99).field777) {
					field488 = true;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 206) {
				field488 = true;
				int var100 = field200.method226();
				IRYXZZFE var101 = IRYXZZFE.method329(var100);
				int var102 = field200.method226();
				for (int var103 = 0; var103 < var102; var103++) {
					var101.field829[var103] = field200.method226();
					int var104 = field200.method243();
					if (var104 == 255) {
						var104 = field200.method229();
					}

					var101.field791[var103] = var104;
				}

				for (int var105 = var102; var105 < var101.field829.length; var105++) {
					var101.field829[var105] = 0;
					var101.field791[var105] = 0;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 84) {
				int var106 = field200.method253();
				int var107 = field200.method226();
				IRYXZZFE.method329(var107).field806 = 1;
				IRYXZZFE.method329(var107).field807 = var106;
				field390 = -1;
				return true;
			}

			if (field390 == 96) {
				field260 = true;
				field528 = field200.method224();
				field529 = field200.method224();
				field530 = field200.method226();
				field531 = field200.method224();
				field532 = field200.method224();
				if (field532 >= 100) {
					int var108 = field528 * 128 + 64;
					int var109 = field529 * 128 + 64;
					int var110 = method129(var108, var109, field165) - field530;
					int var111 = var108 - field169;
					int var112 = var110 - field170;
					int var113 = var109 - field171;
					int var114 = (int) Math.sqrt(var111 * var111 + var113 * var113);
					field172 = (int) (Math.atan2(var112, var114) * 325.949D) & 0x7FF;
					field173 = (int) (Math.atan2(var111, var113) * -325.949D) & 0x7FF;

					if (field172 < 128) {
						field172 = 128;
					}

					if (field172 > 383) {
						field172 = 383;
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 86) {
				int var115 = field200.method224();
				int var116 = field200.method224();
				int var117 = field200.method224();
				int var118 = field200.method224();
				field306[var115] = true;
				field534[var115] = var116;
				field481[var115] = var117;
				field168[var115] = var118;
				field357[var115] = 0;
				field390 = -1;
				return true;
			}

			if (field390 == 32) {
				int var119 = field200.method226();
				int var120 = field200.method261();
				field276[var119] = var120;

				if (field580[var119] != var120) {
					field580[var119] = var120;
					method132(var119);
					field488 = true;

					if (field566 != -1) {
						field579 = true;
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 197) {
				long var121 = field200.method230();
				int var123 = field200.method224();
				String var124 = LGOZNEAG.method370(LGOZNEAG.method367(var121));
				for (int var125 = 0; var125 < field158; var125++) {
					if (field467[var125] == var121) {
						if (field408[var125] != var123) {
							field408[var125] = var123;
							field488 = true;

							if (var123 > 0) {
								method126(5, var124 + " has logged in.", "");
							}

							if (var123 == 0) {
								method126(5, var124 + " has logged out.", "");
							}
						}

						var124 = null;
						break;
					}
				}

				if (var124 != null && field158 < 200) {
					field467[field158] = var121;
					field472[field158] = var124;
					field408[field158] = var123;
					field158++;
					field488 = true;
				}

				boolean var126 = false;
				while (!var126) {
					var126 = true;
					for (int var127 = 0; var127 < field158 - 1; var127++) {
						if (field408[var127] != field212 && field408[var127 + 1] == field212 || field408[var127] == 0 && field408[var127 + 1] != 0) {
							int var128 = field408[var127];
							field408[var127] = field408[var127 + 1];
							field408[var127 + 1] = var128;
							String var129 = field472[var127];
							field472[var127] = field472[var127 + 1];
							field472[var127 + 1] = var129;
							long var130 = field467[var127];
							field467[var127] = field467[var127 + 1];
							field467[var127 + 1] = var130;
							field488 = true;
							var126 = false;
						}
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 71) {
				int var132 = field200.method252();
				method93(var132);

				if (field450 != -1) {
					method146(field450);
					field450 = -1;
					field579 = true;
				}

				if (field568 != -1) {
					method146(field568);
					field568 = -1;
					field356 = true;
				}

				if (field246 != -1) {
					method146(field246);
					field246 = -1;
				}

				if (field239 != -1) {
					method146(field239);
					field239 = -1;
				}

				if (field468 != var132) {
					method146(field468);
					field468 = var132;
				}

				if (field567 != 0) {
					field567 = 0;
					field579 = true;
				}

				field488 = true;
				field238 = true;
				field400 = false;
				field390 = -1;
				return true;
			}

			if (field390 == 229) {
				int var133 = field200.method226();
				if (var133 == 0xFFFF) {
					var133 = -1;
				}

				if (field201 != var133 && field336 && !field215 && field471 == 0) {
					field406 = var133;
					field407 = true;
					field543.method585(2, field406);
				}

				field201 = var133;
				field390 = -1;
				return true;
			}

			if (field390 == 22) {
				int var134 = field200.method258();
				int var135 = field200.method252();
				if (field336 && !field215) {
					field406 = var135;
					field407 = false;
					field543.method585(2, field406);
					field471 = var134;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 66) {
				int var136 = field200.method226();
				IRYXZZFE var137 = IRYXZZFE.method329(var136);
				for (int var138 = 0; var138 < var137.field829.length; var138++) {
					var137.field829[var138] = -1;
					var137.field829[var138] = 0;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 165) {
				if (field324 == 12) {
					field488 = true;
				}

				field217 = field200.method224();
				field390 = -1;
				return true;
			}

			if (field390 == 118) {
				int var139 = field200.method253();
				method93(var139);

				if (field468 != -1) {
					method146(field468);
					field468 = -1;
					field488 = true;
					field238 = true;
				}

				if (field568 != -1) {
					method146(field568);
					field568 = -1;
					field356 = true;
				}

				if (field246 != -1) {
					method146(field246);
					field246 = -1;
				}

				if (field239 != -1) {
					method146(field239);
					field239 = -1;
				}

				if (field450 != var139) {
					method146(field450);
					field450 = var139;
				}

				field400 = false;
				field579 = true;
				field390 = -1;
				return true;
			}

			if (field390 == 168) {
				for (int var140 = 0; var140 < field509.length; var140++) {
					if (field509[var140] != null) {
						field509[var140].field44 = -1;
					}
				}

				for (int var141 = 0; var141 < field209.length; var141++) {
					if (field209[var141] != null) {
						field209[var141].field44 = -1;
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 25) {
				field159 = field200.method224();
				field488 = true;
				field390 = -1;
				return true;
			}

			if (field390 == 242) {
				String var142 = field200.method231();
				if (var142.endsWith(":tradereq:")) {
					String var143 = var142.substring(0, var142.indexOf(":"));
					long var144 = LGOZNEAG.method366(var143);
					boolean var146 = false;
					for (int var147 = 0; var147 < field203; var147++) {
						if (field520[var147] == var144) {
							var146 = true;
							break;
						}
					}

					if (!var146 && field577 == 0) {
						method126(4, "wishes to trade with you.", var143);
					}
				} else if (var142.endsWith(":duelreq:")) {
					String var148 = var142.substring(0, var142.indexOf(":"));
					long var149 = LGOZNEAG.method366(var148);
					boolean var151 = false;
					for (int var152 = 0; var152 < field203; var152++) {
						if (field520[var152] == var149) {
							var151 = true;
							break;
						}
					}

					if (!var151 && field577 == 0) {
						method126(8, "wishes to duel with you.", var148);
					}
				} else if (var142.endsWith(":chalreq:")) {
					String var153 = var142.substring(0, var142.indexOf(":"));
					long var154 = LGOZNEAG.method366(var153);
					boolean var156 = false;
					for (int var157 = 0; var157 < field203; var157++) {
						if (field520[var157] == var154) {
							var156 = true;
							break;
						}
					}

					if (!var156 && field577 == 0) {
						String var158 = var142.substring(var142.indexOf(":") + 1, var142.length() - 9);
						method126(8, var158, var153);
					}
				} else {
					method126(0, var142, "");
				}

				field390 = -1;
				return true;
			}

			if (field390 == 62) {
				int var159 = field200.method226();
				int var160 = field200.method253();

				if (field450 != -1) {
					method146(field450);
					field450 = -1;
					field579 = true;
				}

				if (field568 != -1) {
					method146(field568);
					field568 = -1;
					field356 = true;
				}

				if (field246 != -1) {
					method146(field246);
					field246 = -1;
				}

				if (field239 != var160) {
					method146(field239);
					field239 = var160;
				}

				if (field468 != var159) {
					method146(field468);
					field468 = var159;
				}

				if (field567 != 0) {
					field567 = 0;
					field579 = true;
				}

				field488 = true;
				field238 = true;
				field400 = false;
				field390 = -1;
				return true;
			}

			if (field390 == 190) {
				field422 = field200.method254() * 30;
				field390 = -1;
				return true;
			}

			if (field390 == 30) {
				int var161 = field200.method253();
				IRYXZZFE.method329(var161).field806 = 3;

				if (field264.field116 == null) {
					IRYXZZFE.method329(var161).field807 = (field264.field111[11] << 5) + (field264.field111[8] << 10) + (field264.field111[0] << 15) + (field264.field101[0] << 25) + (field264.field101[4] << 20) + field264.field111[1];
				} else {
					IRYXZZFE.method329(var161).field807 = (int) (field264.field116.field982 + 0x12345678L);
				}

				field390 = -1;
				return true;
			}

			if (field390 == 144) {
				int var162 = field200.method255();
				if (field566 != var162) {
					method146(field566);
					field566 = var162;
				}

				field579 = true;
				field390 = -1;
				return true;
			}

			if (field390 == 60) {
				int var163 = field200.method256();
				if (var163 >= 0) {
					method93(var163);
				}

				if (field335 != var163) {
					method146(field335);
					field335 = var163;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 58) {
				field203 = field389 / 8;
				for (int var164 = 0; var164 < field203; var164++) {
					field520[var164] = field200.method230();
				}

				field390 = -1;
				return true;
			}

			if (field390 == 37) {
				method92(field200, field389);
				field240 = false;
				field390 = -1;
				return true;
			}

			if (field390 == 64) {
				int var165 = field200.method226();
				int var166 = field200.method255();
				int var167 = field200.method257();
				IRYXZZFE var168 = IRYXZZFE.method329(var165);
				var168.field819 = var166;
				var168.field789 = var167;
				field390 = -1;
				return true;
			}

			if (field390 == 153) {
				field251 = field200.method224();
				if (field251 == 1) {
					field515 = field200.method226();
				}

				if (field251 >= 2 && field251 <= 6) {
					if (field251 == 2) {
						field152 = 64;
						field153 = 64;
					}

					if (field251 == 3) {
						field152 = 0;
						field153 = 64;
					}

					if (field251 == 4) {
						field152 = 128;
						field153 = 64;
					}

					if (field251 == 5) {
						field152 = 64;
						field153 = 0;
					}

					if (field251 == 6) {
						field152 = 64;
						field153 = 128;
					}

					field251 = 2;
					field149 = field200.method226();
					field150 = field200.method226();
					field151 = field200.method224();
				}

				if (field251 == 10) {
					field222 = field200.method226();
				}

				field390 = -1;
				return true;
			}

			if (field390 == 1) {
				int var169 = field200.method255();
				int var170 = field200.method252();
				IRYXZZFE var171 = IRYXZZFE.method329(var170);
				if (var171.field780 != var169 || var169 == -1) {
					var171.field780 = var169;
					var171.field830 = 0;
					var171.field840 = 0;
				}

				field390 = -1;
				return true;
			}

			if (field390 == 243) {
				field437 = field200.method224();
				field436 = field200.method243();
				field390 = -1;
				return true;
			}

			if (field390 == 176) {
				long var172 = field200.method230();
				int var174 = field200.method229();
				int var175 = field200.method224();
				boolean var176 = false;
				for (int var177 = 0; var177 < 100; var177++) {
					if (field301[var177] == var174) {
						var176 = true;
						break;
					}
				}

				if (var175 <= 1) {
					for (int var178 = 0; var178 < field203; var178++) {
						if (field520[var178] == var172) {
							var176 = true;
							break;
						}
					}
				}

				if (!var176 && field577 == 0) {
					try {
						field301[field448] = var174;
						field448 = (field448 + 1) % 100;
						String var179 = OAEWGOIP.method396(field200, field389 - 13);
						if (var175 != 3) {
							var179 = WOWCAPIK.method486(var179);
						}

						if (var175 == 2 || var175 == 3) {
							method126(7, var179, "@cr2@" + LGOZNEAG.method370(LGOZNEAG.method367(var172)));
						} else if (var175 == 1) {
							method126(7, var179, "@cr1@" + LGOZNEAG.method370(LGOZNEAG.method367(var172)));
						} else {
							method126(3, var179, LGOZNEAG.method370(LGOZNEAG.method367(var172)));
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field390 = -1;
				return true;
			}

			if (field390 == 89) {
				field488 = true;
				int var181 = field200.method226();
				IRYXZZFE var182 = IRYXZZFE.method329(var181);
				while (field200.field684 < field389) {
					int var183 = field200.method238();
					int var184 = field200.method226();
					int var185 = field200.method224();
					if (var185 == 255) {
						var185 = field200.method229();
					}

					if (var183 >= 0 && var183 < var182.field829.length) {
						var182.field829[var183] = var184;
						var182.field791[var183] = var185;
					}
				}

				field390 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field390 + "," + field389 + " - " + field206 + "," + field207);
			method71();
		} catch (IOException var190) {
			method125();
		} catch (Exception var191) {
			String var187 = "T2 - " + field390 + "," + field206 + "," + field207 + " - " + field389 + "," + (field264.field34[0] + field548) + "," + (field264.field35[0] + field549) + " - ";
			for (int var188 = 0; var188 < field389 && var188 < 50; var188++) {
				var187 = var187 + field200.field683[var188] + ",";
			}

			signlink.reporterror(var187);
			method71();
		}

		return true;
	}

	@ObfuscatedName("client.i(I)V")
	public final void method60() {
		field313 = false;
		while (field242) {
			field313 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field230 = null;
		field231 = null;
		field340 = null;
		field402 = null;
		field403 = null;
		field404 = null;
		field405 = null;
		field197 = null;
		field198 = null;
		field410 = null;
		field411 = null;
		field338 = null;
		field339 = null;
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method61(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field158; var3++) {
				if (field467[var3] == arg0) {
					field158--;
					field488 = true;

					for (int var4 = var3; var4 < field158; var4++) {
						field472[var4] = field472[var4 + 1];
						field408[var4] = field408[var4 + 1];
						field467[var4] = field467[var4 + 1];
					}

					field560.method213(223);
					field560.method220(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILIRYXZZFE;IIIIIII)V")
	public final void method62(IRYXZZFE arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field444) {
			field398 = 32;
		} else {
			field398 = 0;
		}

		field444 = false;
		if (arg3 >= arg4 && arg3 < arg4 + 16 && arg5 >= arg7 && arg5 < arg7 + 16) {
			arg0.field810 -= field371 * 4;

			if (arg1 == 1) {
				field488 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field579 = true;
			}
		} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg5 >= arg6 + arg7 - 16 && arg5 < arg6 + arg7) {
			arg0.field810 += field371 * 4;

			if (arg1 == 1) {
				field488 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field579 = true;
			}
		} else if (arg3 >= arg4 - field398 && arg3 < arg4 + field398 + 16 && arg5 >= arg7 + 16 && arg5 < arg6 + arg7 - 16 && field371 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg5 - arg7 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg0.field810 = (arg2 - arg6) * var10 / var11;

			if (arg1 == 1) {
				field488 = true;
			}

			if (arg1 == 2 || arg1 == 3) {
				field579 = true;
			}

			field444 = true;
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method63(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method64(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(ILFCRLGSQA;)V")
	public final void method65(FCRLGSQA arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field197.length; var3++) {
			field197[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field197[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field198[var9] = (field197[var9 - 1] + field197[var9 + 1] + field197[var9 - 128] + field197[var9 + 128]) / 4;
				}
			}

			int[] var10 = field197;
			field197 = field198;
			field198 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field699; var12++) {
				for (int var13 = 0; var13 < arg0.field698; var13++) {
					if (arg0.field696[var11++] != 0) {
						int var14 = var13 + arg0.field700 + 16;
						int var15 = var12 + arg0.field701 + 16;
						int var16 = (var15 << 7) + var14;
						field197[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method66() {
		int var1 = field380.method375("Choose Option");
		for (int var2 = 0; var2 < field368; var2++) {
			int var3 = field380.method375(field245[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field368 * 15 + 21;
		if (field90 > 4 && field91 > 4 && field90 < 516 && field91 < 338) {
			int var5 = field90 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field91 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field349 = true;
			field277 = 0;
			field278 = var5;
			field279 = var6;
			field280 = var1;
			field281 = field368 * 15 + 22;
		}

		if (field90 > 553 && field91 > 205 && field90 < 743 && field91 < 466) {
			int var7 = field90 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field91 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field349 = true;
			field277 = 1;
			field278 = var7;
			field279 = var8;
			field280 = var1;
			field281 = field368 * 15 + 22;
		}

		if (field90 > 17 && field91 > 357 && field90 < 496 && field91 < 453) {
			int var9 = field90 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field91 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field349 = true;
			field277 = 2;
			field278 = var9;
			field279 = var10;
			field280 = var1;
			field281 = field368 * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method67(boolean arg0) {
		if (field264.field62 >> 7 == field394 && field264.field63 >> 7 == field395) {
			field394 = 0;
			field302++;
			if (field302 > 96) {
				field302 = 0;
				field560.method213(35);
			}
		}

		int var2 = field510;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			AWOZVMFS var4;
			int var5;
			if (arg0) {
				var4 = field264;
				var5 = field508 << 14;
			} else {
				var4 = field509[field511[var3]];
				var5 = field511[var3] << 14;
			}

			if (var4 != null && var4.method10()) {
				var4.field102 = false;
				if ((field215 && field510 > 50 || field510 > 200) && !arg0 && var4.field65 == var4.field40) {
					var4.field102 = true;
				}

				int var6 = var4.field62 >> 7;
				int var7 = var4.field63 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field115 == null || field499 < var4.field97 || field499 >= var4.field98) {
						if ((var4.field62 & 0x7F) == 0x40 && (var4.field63 & 0x7F) == 0x40) {
							if (field365[var6][var7] == field262) {
								continue;
							}

							field365[var6][var7] = field262;
						}

						var4.field109 = method129(var4.field62, var4.field63, field165);
						field363.method539(var4.field62, var4.field64, field165, var4.field63, 60, var4, var4.field109, var4.field36, var5);
					} else {
						var4.field102 = false;
						var4.field109 = method129(var4.field62, var4.field63, field165);
						field363.method540(var4.field62, var4.field64, var4.field109, var5, var4.field107, var4.field63, field165, var4.field106, 60, var4, var4.field105, var4.field104);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method68(long arg0) {
		if (arg0 != 0L) {
			if (field158 >= 100 && field360 != 1) {
				method126(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field158 >= 200) {
				method126(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = LGOZNEAG.method370(LGOZNEAG.method367(arg0));
				for (int var4 = 0; var4 < field158; var4++) {
					if (field467[var4] == arg0) {
						method126(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field203; var5++) {
					if (field520[var5] == arg0) {
						method126(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field264.field117)) {
					field472[field158] = var3;
					field467[field158] = arg0;
					field408[field158] = 0;
					field158++;
					field488 = true;
					field560.method213(167);
					field560.method220(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILEILHLJCE;B)V")
	public final void method69(int arg0, EILHLJCE arg1) {
		field317 = 0;
		field512 = 0;
		method86(arg0, arg1);
		method111(arg0, arg1);
		method143(arg0, arg1);

		for (int var3 = 0; var3 < field317; var3++) {
			int var4 = field318[var3];
			if (field499 != field209[var4].field29) {
				field209[var4].field1059 = null;
				field209[var4] = null;
			}
		}

		if (arg1.field684 != arg0) {
			signlink.reporterror(field154 + " size mismatch in getnpcpos - pos:" + arg1.field684 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field210; var5++) {
			if (field209[field211[var5]] == null) {
				signlink.reporterror(field154 + " null entry in npc list - pos:" + var5 + " size:" + field210);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method70() {
		short var1 = 256;

		if (field353 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field353 > 768) {
					field402[var2] = method159(field404[var2], 1024 - field353, field403[var2]);
				} else if (field353 > 256) {
					field402[var2] = field404[var2];
				} else {
					field402[var2] = method159(field403[var2], 256 - field353, field404[var2]);
				}
			}
		} else if (field354 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field354 > 768) {
					field402[var3] = method159(field405[var3], 1024 - field354, field403[var3]);
				} else if (field354 > 256) {
					field402[var3] = field405[var3];
				} else {
					field402[var3] = method159(field403[var3], 256 - field354, field405[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field402[var4] = field403[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field293.field1225[var5] = field338.field1027[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field303[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field410[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field402[var12];
					int var15 = field293.field1225[var7];
					field293.field1225[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field293.method464(0, field75, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field294.field1225[var16] = field339.field1027[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field303[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field410[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field402[var23];
					int var26 = field294.field1225[var18];
					field294.field1225[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field294.method464(0, field75, 637);
	}

	@ObfuscatedName("client.l(I)V")
	public final void method71() {
		try {
			if (field522 != null) {
				field522.method1();
			}
		} catch (Exception var2) {
		}

		field522 = null;
		field521 = false;
		field163 = 0;
		field154 = "";
		field155 = "";
		method76();
		field363.method528();

		for (int var1 = 0; var1 < 4; var1++) {
			field342[var1].method200();
		}

		System.gc();
		method180();
		field201 = -1;
		field406 = -1;
		field471 = 0;
	}

	@ObfuscatedName("client.a(BLjava/lang/String;Ljava/lang/String;)V")
	public final void method72(String arg0, String arg1) {
		if (field442 != null) {
			field442.method463();
			GBZDHVLZ.field717 = field384;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field379.method373(0, arg0, 257, var3);
			field379.method373(0xFFFFFF, arg0, 256, var3 - 1);
			var3 += 15;
			if (arg1 != null) {
				field379.method373(0, arg1, 257, var3);
				field379.method373(0xFFFFFF, arg1, 256, var3 - 1);
			}

			field442.method464(4, field75, 4);
		} else if (field76 != null) {
			field76.method463();
			GBZDHVLZ.field717 = field385;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			IFHRXNFO.method315(0, 383 - var5 / 2, var5, var6, var4 - var6 / 2 - 5);
			IFHRXNFO.method316(var4 - var6 / 2 - 5, var5, 383 - var5 / 2, var6, 0xFFFFFF);

			if (arg1 != null) {
				var4 -= 7;
			}

			field379.method373(0, arg0, 383, var4);
			field379.method373(0xFFFFFF, arg0, 382, var4 - 1);
			var4 += 15;
			if (arg1 != null) {
				field379.method373(0, arg1, 383, var4);
				field379.method373(0xFFFFFF, arg1, 382, var4 - 1);
			}

			field76.method464(0, field75, 0);
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method73() {
		if (field422 > 1) {
			field422--;
		}

		if (field393 > 0) {
			field393--;
		}

		for (int var1 = 0; var1 < 5 && method59(); var1++) {
		}

		if (field521) {
			synchronized (field219.field1231) {
				if (!field334) {
					field219.field1233 = 0;
				} else if (field89 != 0 || field219.field1233 >= 40) {
					field560.method213(224);
					field560.method214(0);
					int var3 = field560.field684;
					int var4 = 0;
					for (int var5 = 0; var5 < field219.field1233 && var3 - field560.field684 < 240; var5++) {
						var4++;
						int var6 = field219.field1234[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field219.field1236[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field219.field1234[var5] == -1 && field219.field1236[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field497 != var7 || field498 != var6) {
							int var9 = var7 - field497;
							field497 = var7;
							int var10 = var6 - field498;
							field498 = var6;

							if (field199 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field560.method215((field199 << 12) + (var9 << 6) + var10);
								field199 = 0;
							} else if (field199 < 8) {
								field560.method217((field199 << 19) + var8 + 0x800000);
								field199 = 0;
							} else {
								field560.method218((field199 << 19) + var8 - 0x40000000);
								field199 = 0;
							}
						} else if (field199 < 2047) {
							field199++;
						}
					}

					field560.method223(field560.field684 - var3);

					if (var4 >= field219.field1233) {
						field219.field1233 = 0;
					} else {
						field219.field1233 -= var4;
						for (int var11 = 0; var11 < field219.field1233; var11++) {
							field219.field1236[var11] = field219.field1236[var4 + var11];
							field219.field1234[var11] = field219.field1234[var4 + var11];
						}
					}
				}
			}

			if (field89 != 0) {
				long var12 = (field92 - field263) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field263 = field92;
				int var14 = field91;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field90;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field89 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field560.method213(150);
				field560.method218((var17 << 19) + (var18 << 20) + var16);
			}

			if (field434 > 0) {
				field434--;
			}

			if (field93[1] == 1 || field93[2] == 1 || field93[3] == 1 || field93[4] == 1) {
				field435 = true;
			}

			if (field435 && field434 <= 0) {
				field434 = 20;
				field435 = false;
				field560.method213(130);
				field560.method251(field569);
				field560.method215(field570);
			}

			if (field80 && !field438) {
				field438 = true;
				field560.method213(139);
				field560.method214(1);
			}

			if (!field80 && field438) {
				field438 = false;
				field560.method213(139);
				field560.method214(0);
			}

			method123();
			method164();
			method122();
			field391++;
			if (field391 > 750) {
				method125();
			}

			method110();
			method135();
			method144();
			field401++;

			if (field227 != 0) {
				field226 += 20;
				if (field226 >= 400) {
					field227 = 0;
				}
			}

			if (field454 != 0) {
				field451++;
				if (field451 >= 15) {
					if (field454 == 2) {
						field488 = true;
					}

					if (field454 == 3) {
						field579 = true;
					}

					field454 = 0;
				}
			}

			if (field525 != 0) {
				field399++;

				if (field83 > field526 + 5 || field83 < field526 - 5 || field84 > field527 + 5 || field84 < field527 - 5) {
					field491 = true;
				}

				if (field82 == 0) {
					if (field525 == 2) {
						field488 = true;
					}

					if (field525 == 3) {
						field579 = true;
					}

					field525 = 0;

					if (field491 && field399 >= 5) {
						field479 = -1;
						method158();

						if (field523 == field479 && field524 != field478) {
							IRYXZZFE var19 = IRYXZZFE.method329(field523);
							byte var20 = 0;
							if (field366 == 1 && var19.field773 == 206) {
								var20 = 1;
							}

							if (var19.field829[field478] <= 0) {
								var20 = 0;
							}

							if (var19.field778) {
								int var21 = field524;
								int var22 = field478;
								var19.field829[var22] = var19.field829[var21];
								var19.field791[var22] = var19.field791[var21];
								var19.field829[var21] = -1;
								var19.field791[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field524;
								int var24 = field478;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method323(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method323(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method323(field478, field524);
							}

							field560.method213(109);
							field560.method214(var20);
							field560.method250(field523);
							field560.method250(field478);
							field560.method249(field524);
						}
					} else if ((field167 == 1 || method77(field368 - 1)) && field368 > 2) {
						method66();
					} else if (field368 > 0) {
						method51(field368 - 1);
					}

					field451 = 10;
					field89 = 0;
				}
			}

			if (XOHMKFIT.field1382 != -1) {
				int var25 = XOHMKFIT.field1382;
				int var26 = XOHMKFIT.field1383;
				boolean var27 = method155(var25, var26, 0, 0, field264.field35[0], true, 0, field264.field34[0], 0, 0, 0);
				XOHMKFIT.field1382 = -1;

				if (var27) {
					field224 = field90;
					field225 = field91;
					field227 = 1;
					field226 = 0;
				}
			}

			if (field89 == 1 && field285 != null) {
				field285 = null;
				field579 = true;
				field89 = 0;
			}

			method127();

			if (field568 == -1) {
				method81();
				method181();
				method166();
			}

			if (field82 == 1 || field89 == 1) {
				field371++;
			}

			if (field477 == 0 && field186 == 0 && field267 == 0) {
				if (field248 > 0) {
					field248--;
				}
			} else if (field248 < 100) {
				field248++;
				if (field248 == 100) {
					if (field477 != 0) {
						field579 = true;
					}

					if (field186 != 0) {
						field488 = true;
					}
				}
			}

			if (field164 == 2) {
				method96();
			}

			if (field164 == 2 && field260) {
				method154();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field357[var28]++;
			}

			method152();
			field243++;
			if (field243 > 153) {
				field243 = 0;
				field560.method213(1);
				field560.method215(26173);
			}

			field81++;
			if (field81 > 4500) {
				field393 = 250;
				field81 -= 500;
				field560.method213(63);
			}

			field247++;
			if (field247 > 500) {
				field247 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field254 += field255;
				}

				if ((var29 & 0x2) == 2) {
					field518 += field519;
				}

				if ((var29 & 0x4) == 4) {
					field555 += field556;
				}
			}

			if (field254 < -50) {
				field255 = 2;
			}

			if (field254 > 50) {
				field255 = -2;
			}

			if (field518 < -55) {
				field519 = 2;
			}

			if (field518 > 55) {
				field519 = -2;
			}

			if (field555 < -40) {
				field556 = 1;
			}

			if (field555 > 40) {
				field556 = -1;
			}

			field355++;
			if (field355 > 500) {
				field355 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field287 += field288;
				}

				if ((var30 & 0x2) == 2) {
					field540 += field541;
				}
			}

			if (field287 < -60) {
				field288 = 2;
			}

			if (field287 > 60) {
				field288 = -2;
			}

			if (field540 < -20) {
				field541 = 1;
			}

			if (field540 > 10) {
				field541 = -1;
			}

			field392++;
			if (field392 > 50) {
				field560.method213(58);
			}

			try {
				if (field522 != null && field560.field684 > 0) {
					field522.method5(0, field560.field683, field560.field684);
					field560.field684 = 0;
					field392 = 0;
				}
			} catch (IOException var32) {
				method125();
			} catch (Exception var33) {
				method71();
			}
		}
	}

	@ObfuscatedName("client.a(BLEILHLJCE;I)V")
	public final void method74(EILHLJCE arg0, int arg1) {
		while (arg0.field685 + 10 < arg1 * 8) {
			int var3 = arg0.method235(11);
			if (var3 == 2047) {
				break;
			}

			if (field509[var3] == null) {
				field509[var3] = new AWOZVMFS();
				if (field514[var3] != null) {
					field509[var3].method27(field514[var3]);
				}
			}

			field511[field510++] = var3;
			AWOZVMFS var4 = field509[var3];
			var4.field29 = field499;
			int var5 = arg0.method235(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method235(1);
			if (var6 == 1) {
				field513[field512++] = var3;
			}

			int var7 = arg0.method235(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.method235(1);
			var4.method11(field264.field34[0] + var7, field264.field35[0] + var5, var8 == 1);
		}

		arg0.method236();
	}

	@ObfuscatedName("client.c(B)V")
	public final void method75() {
		field242 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field313) {
				field204++;
				method79();
				method79();
				method70();
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

		field242 = false;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method76() {
		DQLJXYPC.field668.method199();
		DQLJXYPC.field658.method199();
		NPWLDXJE.field978.method199();
		XLZQSPZS.field1337.method199();
		XLZQSPZS.field1327.method199();
		AWOZVMFS.field121.method199();
		TGIKVGNH.field1206.method199();
	}

	@ObfuscatedName("client.b(II)Z")
	public final boolean method77(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field309[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 696) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.d(B)V")
	public void method78() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field204);

		if (field543 != null) {
			System.out.println("Od-cycle:" + field543.field1429);
		}

		System.out.println("loop-cycle:" + field499);
		System.out.println("draw-cycle:" + field456);
		System.out.println("ptype:" + field390);
		System.out.println("psize:" + field389);

		if (field522 != null) {
			field522.method6();
		}

		field72 = true;
	}

	@ObfuscatedName("client.a(Z)Ljava/awt/Component;")
	public final Component method22() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field78 != null) {
			return field78;
		}

		return this;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method79() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field410[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field410[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field411[var10] = (field410[var10 - 1] + field410[var10 + 1] + field410[var10 - 128] + field410[var10 + 128]) / 4;
			}
		}

		field506 += 128;
		if (field506 > field197.length) {
			field506 -= field197.length;
			int var11 = (int) (Math.random() * 12.0D);
			method65(field340[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field411[var14 + 128] - field197[field506 + var14 & field197.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field410[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field303[var16] = field303[var16 + 1];
		}

		field303[var1 - 1] = (int) (Math.sin(field499 / 14.0D) * 16.0D + Math.sin(field499 / 15.0D) * 14.0D + Math.sin(field499 / 16.0D) * 12.0D);

		if (field353 > 0) {
			field353 -= 4;
		}

		if (field354 > 0) {
			field354 -= 4;
		}

		if (field353 == 0 && field354 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field353 = 1024;
			}

			if (var17 == 1) {
				field354 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method80() {
		field234 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field346[var1] = -1;
			for (int var2 = 0; var2 < TFKCMRVE.field1185; var2++) {
				if (!TFKCMRVE.field1186[var2].field1192 && TFKCMRVE.field1186[var2].field1187 == var1 + (field552 ? 0 : 7)) {
					field346[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method81() {
		if (field535 == 0 && field89 == 1) {
			int var1 = field90 - 25 - 550;
			int var2 = field91 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field570 + field287 & 0x7FF;
				int var4 = GBZDHVLZ.field715[var3];
				int var5 = GBZDHVLZ.field716[var3];
				var4 = (field540 + 256) * var4 >> 8;
				var5 = (field540 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field264.field62 + var6 >> 7;
				int var9 = field264.field63 - var7 >> 7;
				boolean var10 = method155(var8, var9, 1, 0, field264.field35[0], true, 0, field264.field34[0], 0, 0, 0);
				if (var10) {
					field560.method214(var1);
					field560.method214(var2);
					field560.method215(field570);
					field560.method214(57);
					field560.method214(field287);
					field560.method214(field540);
					field560.method214(89);
					field560.method215(field264.field62);
					field560.method215(field264.field63);
					field560.method214(field370);
					field560.method214(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBIIIIIIII)V")
	public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		HCPBXDEK var10 = null;
		for (HCPBXDEK var11 = (HCPBXDEK) field474.method275(); var11 != null; var11 = (HCPBXDEK) field474.method277()) {
			if (var11.field743 == arg2 && var11.field745 == arg1 && var11.field746 == arg0 && var11.field744 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new HCPBXDEK();
			var10.field743 = arg2;
			var10.field744 = arg3;
			var10.field745 = arg1;
			var10.field746 = arg0;
			method160(var10);
			field474.method272(var10);
		}

		var10.field736 = arg4;
		var10.field738 = arg8;
		var10.field737 = arg5;
		var10.field747 = arg7;
		var10.field742 = arg6;
	}

	@ObfuscatedName("client.g(B)I")
	public final int method83() {
		int var1 = 3;
		if (field172 < 310) {
			int var2 = field169 >> 7;
			int var3 = field171 >> 7;
			int var4 = field264.field62 >> 7;
			int var5 = field264.field63 >> 7;

			if ((field216[field165][var2][var3] & 0x4) != 0) {
				var1 = field165;
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

					if ((field216[field165][var2][var3] & 0x4) != 0) {
						var1 = field165;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field216[field165][var2][var3] & 0x4) != 0) {
							var1 = field165;
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

					if ((field216[field165][var2][var3] & 0x4) != 0) {
						var1 = field165;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field216[field165][var2][var3] & 0x4) != 0) {
							var1 = field165;
						}
					}
				}
			}
		}

		if ((field216[field165][field264.field62 >> 7][field264.field63 >> 7] & 0x4) != 0) {
			var1 = field165;
		}

		return var1;
	}

	@ObfuscatedName("client.d(Z)I")
	public final int method84() {
		int var1 = method129(field169, field171, field165);
		if (var1 - field170 < 800 && (field216[field165][field169 >> 7][field171 >> 7] & 0x4) != 0) {
			return field165;
		}

		return 3;
	}

	@ObfuscatedName("client.o(I)Ljava/net/Socket;")
	public final Socket method85(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(IILEILHLJCE;)V")
	public final void method86(int arg0, EILHLJCE arg1) {
		arg1.method234();
		int var3 = arg1.method235(8);
		if (var3 < field210) {
			for (int var4 = var3; var4 < field210; var4++) {
				field318[field317++] = field211[var4];
			}
		}

		if (var3 > field210) {
			signlink.reporterror(field154 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field210 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field211[var5];
			ONCZAQCQ var7 = field209[var6];
			int var8 = arg1.method235(1);
			if (var8 == 0) {
				field211[field210++] = var6;
				var7.field29 = field499;
			} else {
				int var9 = arg1.method235(2);
				if (var9 == 0) {
					field211[field210++] = var6;
					var7.field29 = field499;
					field513[field512++] = var6;
				} else if (var9 == 1) {
					field211[field210++] = var6;
					var7.field29 = field499;
					int var10 = arg1.method235(3);
					var7.method8(var10, false);
					int var11 = arg1.method235(1);
					if (var11 == 1) {
						field513[field512++] = var6;
					}
				} else if (var9 == 2) {
					field211[field210++] = var6;
					var7.field29 = field499;
					int var12 = arg1.method235(3);
					var7.method8(var12, true);
					int var13 = arg1.method235(3);
					var7.method8(var13, true);
					int var14 = arg1.method235(1);
					if (var14 == 1) {
						field513[field512++] = var6;
					}
				} else if (var9 == 3) {
					field318[field317++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method87(int arg0) {
		int[] var2 = field396.field1027;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field216[arg0][var7][var5] & 0x18) == 0) {
					field363.method563(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field216[arg0 + 1][var7][var5] & 0x8) != 0) {
					field363.method563(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field396.method399();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field216[arg0][var11][var10] & 0x18) == 0) {
					method97(var8, arg0, var10, var11, var9);
				}

				if (arg0 < 3 && (field216[arg0 + 1][var11][var10] & 0x8) != 0) {
					method97(var8, arg0 + 1, var10, var11, var9);
				}
			}
		}

		if (field442 != null) {
			field442.method463();
			GBZDHVLZ.field717 = field384;
		}

		field320 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field363.method557(field165, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = DQLJXYPC.method192(var14).field654;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field342[field165].field682;
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

						field332[field320] = field341[var15];
						field321[field320] = var16;
						field322[field320] = var17;
						field320++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method88() {
		field560.method213(211);

		if (field468 != -1) {
			method146(field468);
			field468 = -1;
			field488 = true;
			field400 = false;
			field238 = true;
		}

		if (field450 != -1) {
			method146(field450);
			field450 = -1;
			field579 = true;
			field400 = false;
		}

		if (field568 != -1) {
			method146(field568);
			field568 = -1;
			field356 = true;
		}

		if (field246 != -1) {
			method146(field246);
			field246 = -1;
		}

		if (field239 != -1) {
			method146(field239);
			field239 = -1;
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method19() {
		signlink.reporterror = false;

		try {
			if (field522 != null) {
				field522.method1();
			}
		} catch (Exception var1) {
		}

		field522 = null;
		method180();

		if (field219 != null) {
			field219.field1235 = false;
		}

		field219 = null;
		field543.method603();
		field543 = null;
		field208 = null;
		field560 = null;
		field558 = null;
		field200 = null;
		field174 = null;
		field372 = null;
		field270 = null;
		field175 = null;
		field176 = null;
		field559 = null;
		field216 = null;
		field363 = null;
		field342 = null;
		field469 = null;
		field489 = null;
		field160 = null;
		field161 = null;
		field423 = null;
		field440 = null;
		field441 = null;
		field442 = null;
		field443 = null;
		field282 = null;
		field283 = null;
		field284 = null;
		field187 = null;
		field188 = null;
		field189 = null;
		field190 = null;
		field191 = null;
		field192 = null;
		field193 = null;
		field194 = null;
		field195 = null;
		field386 = null;
		field387 = null;
		field388 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field447 = null;
		field482 = null;
		field483 = null;
		field484 = null;
		field485 = null;
		field486 = null;
		field373 = null;
		field374 = null;
		field375 = null;
		field376 = null;
		field377 = null;
		field581 = null;
		field582 = null;
		field266 = null;
		field325 = null;
		field311 = null;
		field323 = null;
		field148 = null;
		field179 = null;
		field180 = null;
		field181 = null;
		field182 = null;
		field183 = null;
		field269 = null;
		field341 = null;
		field365 = null;
		field509 = null;
		field511 = null;
		field513 = null;
		field514 = null;
		field318 = null;
		field209 = null;
		field211 = null;
		field362 = null;
		field474 = null;
		field236 = null;
		field273 = null;
		field307 = null;
		field308 = null;
		field309 = null;
		field310 = null;
		field245 = null;
		field580 = null;
		field321 = null;
		field322 = null;
		field332 = null;
		field396 = null;
		field472 = null;
		field467 = null;
		field408 = null;
		field293 = null;
		field294 = null;
		field290 = null;
		field291 = null;
		field292 = null;
		field295 = null;
		field296 = null;
		field297 = null;
		field298 = null;
		method60();
		DQLJXYPC.method193();
		NPWLDXJE.method394();
		XLZQSPZS.method519();
		IRYXZZFE.method327();
		SYTONBKT.field1170 = null;
		TFKCMRVE.field1186 = null;
		CBOPYDEB.field137 = null;
		ODMBIHRM.field1035 = null;
		TGIKVGNH.field1194 = null;
		TGIKVGNH.field1206 = null;
		ISZVQSTL.field843 = null;
		field76 = null;
		AWOZVMFS.field121 = null;
		GBZDHVLZ.method280();
		XOHMKFIT.method527();
		KBEXSZSN.method335();
		IBCKUTPD.method307();
		System.gc();
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.q(I)V")
	public final void method89() {
		Graphics var1 = method22().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method15(1);

		if (field457) {
			field313 = false;
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

		if (field364) {
			field313 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field490) {
			field313 = false;
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

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = KBEXSZSN.field935[var7];
			int var13 = KBEXSZSN.field936[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = KBEXSZSN.field935[var8];
			int var16 = KBEXSZSN.field936[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field169 = arg0 - var9;
		field170 = arg5 - var10;
		field171 = arg4 - var11;
		field172 = arg1;
		field173 = arg2;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method91() {
		for (QGPCEBJK var1 = (QGPCEBJK) field236.method275(); var1 != null; var1 = (QGPCEBJK) field236.method277()) {
			if (field165 != var1.field1119 || field499 > var1.field1133) {
				var1.method334();
			} else if (field499 >= var1.field1132) {
				if (var1.field1124 > 0) {
					ONCZAQCQ var2 = field209[var1.field1124 - 1];
					if (var2 != null && var2.field62 >= 0 && var2.field62 < 13312 && var2.field63 >= 0 && var2.field63 < 13312) {
						var1.method437(var2.field63, field499, var2.field62, method129(var2.field62, var2.field63, var1.field1119) - var1.field1115);
					}
				}

				if (var1.field1124 < 0) {
					int var3 = -var1.field1124 - 1;
					AWOZVMFS var4;
					if (field502 == var3) {
						var4 = field264;
					} else {
						var4 = field509[var3];
					}

					if (var4 != null && var4.field62 >= 0 && var4.field62 < 13312 && var4.field63 >= 0 && var4.field63 < 13312) {
						var1.method437(var4.field63, field499, var4.field62, method129(var4.field62, var4.field63, var1.field1119) - var1.field1115);
					}
				}

				var1.method438(field401);
				field363.method539((int) var1.field1116, var1.field1129, field165, (int) var1.field1117, 60, var1, (int) var1.field1118, false, -1);
			}
		}
	}

	@ObfuscatedName("client.a(ILEILHLJCE;I)V")
	public final void method92(EILHLJCE arg0, int arg1) {
		field317 = 0;
		field512 = 0;
		method165(arg0, arg1);
		method150(arg1, arg0);
		method74(arg0, arg1);
		method172(arg0, arg1);

		for (int var3 = 0; var3 < field317; var3++) {
			int var4 = field318[var3];
			if (field499 != field509[var4].field29) {
				field509[var4] = null;
			}
		}

		if (arg0.field684 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field684 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field510; var5++) {
			if (field509[field511[var5]] == null) {
				signlink.reporterror(field154 + " null entry in pl list - pos:" + var5 + " size:" + field510);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method93(int arg0) {
		IRYXZZFE var2 = IRYXZZFE.method329(arg0);
		for (int var3 = 0; var3 < var2.field793.length && var2.field793[var3] != -1; var3++) {
			IRYXZZFE var4 = IRYXZZFE.method329(var2.field793[var3]);
			if (var4.field804 == 1) {
				method93(var4.field796);
			}

			var4.field830 = 0;
			var4.field840 = 0;
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method94() {
		field262++;
		method67(true);
		method163(true);
		method67(false);
		method163(false);
		method91();
		method168();

		if (!field260) {
			int var1 = field569;
			if (field289 / 256 > var1) {
				var1 = field289 / 256;
			}

			if (field306[4] && field481[4] + 128 > var1) {
				var1 = field481[4] + 128;
			}

			int var2 = field570 + field555 & 0x7FF;
			method90(field432, var1, var2, var1 * 3 + 600, field433, method129(field264.field62, field264.field63, field165) - 50);
		}

		int var3;
		if (field260) {
			var3 = method84();
		} else {
			var3 = method83();
		}

		int var4 = field169;
		int var5 = field170;
		int var6 = field171;
		int var7 = field172;
		int var8 = field173;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field306[var9]) {
				int var10 = (int) (Math.random() * (field534[var9] * 2 + 1) + Math.sin(field168[var9] / 100.0D * field357[var9]) * field481[var9] - field534[var9]);
				if (var9 == 0) {
					field169 += var10;
				}

				if (var9 == 1) {
					field170 += var10;
				}

				if (var9 == 2) {
					field171 += var10;
				}

				if (var9 == 3) {
					field173 = field173 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field172 += var10;
					if (field172 < 128) {
						field172 = 128;
					}

					if (field172 > 383) {
						field172 = 383;
					}
				}
			}
		}

		int var11 = GBZDHVLZ.field726;
		KBEXSZSN.field930 = true;
		KBEXSZSN.field933 = 0;
		KBEXSZSN.field931 = field83 - 4;
		KBEXSZSN.field932 = field84 - 4;
		IFHRXNFO.method313();
		field363.method567(field170, field169, field171, var3, field172, field173);
		field363.method542();
		method147();
		method169();
		method54(var11);
		method153();
		field442.method464(4, field75, 4);
		field169 = var4;
		field170 = var5;
		field171 = var6;
		field172 = var7;
		field173 = var8;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method95() {
		field230 = new FCRLGSQA(field286, "titlebox", 0);
		field231 = new FCRLGSQA(field286, "titlebutton", 0);
		field340 = new FCRLGSQA[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field340[var1] = new FCRLGSQA(field286, "runes", var1);
		}

		field338 = new ODBDSPMH(128, 265);
		field339 = new ODBDSPMH(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field338.field1027[var2] = field293.field1225[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field339.field1027[var3] = field294.field1225[var3];
		}

		field403 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field403[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field403[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field403[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field403[var7 + 192] = 0xFFFFFF;
		}

		field404 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field404[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field404[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field404[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field404[var11 + 192] = 0xFFFFFF;
		}

		field405 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field405[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field405[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field405[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field405[var15 + 192] = 0xFFFFFF;
		}

		field402 = new int[256];
		field197 = new int[32768];
		field198 = new int[32768];
		method65(null);
		field410 = new int[32768];
		field411 = new int[32768];
		method24("Connecting to fileserver", 10);

		if (!field313) {
			field237 = true;
			field313 = true;
			method23(this, 2);
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method96() {
		try {
			int var1 = field264.field62 + field254;
			int var2 = field264.field63 + field518;
			if (field432 - var1 < -500 || field432 - var1 > 500 || field433 - var2 < -500 || field433 - var2 > 500) {
				field432 = var1;
				field433 = var2;
			}

			if (field432 != var1) {
				field432 += (var1 - field432) / 16;
			}

			if (field433 != var2) {
				field433 += (var2 - field433) / 16;
			}

			if (field93[1] == 1) {
				field571 += (-field571 - 24) / 2;
			} else if (field93[2] == 1) {
				field571 += (24 - field571) / 2;
			} else {
				field571 /= 2;
			}

			if (field93[3] == 1) {
				field572 += (12 - field572) / 2;
			} else if (field93[4] == 1) {
				field572 += (-field572 - 12) / 2;
			} else {
				field572 /= 2;
			}

			field570 = field571 / 2 + field570 & 0x7FF;
			field569 += field572 / 2;
			if (field569 < 128) {
				field569 = 128;
			}

			if (field569 > 383) {
				field569 = 383;
			}

			int var3 = field432 >> 7;
			int var4 = field433 >> 7;
			int var5 = method129(field432, field433, field165);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field165;
						if (var9 < 3 && (field216[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field559[var9][var7][var8];
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

			if (var11 > field289) {
				field289 += (var11 - field289) / 24;
			} else if (var11 < field289) {
				field289 += (var11 - field289) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field264.field62 + "," + field264.field63 + "," + field432 + "," + field433 + "," + field424 + "," + field425 + "," + field548 + "," + field549);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IBIIII)V")
	public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field363.method554(arg1, arg3, arg2);
		if (var6 != 0) {
			int var7 = field363.method558(arg1, arg3, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg0;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field396.field1027;
			int var12 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			DQLJXYPC var14 = DQLJXYPC.method192(var13);
			if (var14.field666 == -1) {
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
				FCRLGSQA var15 = field269[var14.field666];
				if (var15 != null) {
					int var16 = (var14.field641 * 4 - var15.field698) / 2;
					int var17 = (var14.field636 * 4 - var15.field699) / 2;
					var15.method270(arg3 * 4 + var16 + 48, (104 - arg2 - var14.field636) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field363.method556(arg1, arg3, arg2);
		if (var18 != 0) {
			int var19 = field363.method558(arg1, arg3, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			DQLJXYPC var23 = DQLJXYPC.method192(var22);
			if (var23.field666 != -1) {
				FCRLGSQA var24 = field269[var23.field666];
				if (var24 != null) {
					int var25 = (var23.field641 * 4 - var24.field698) / 2;
					int var26 = (var23.field636 * 4 - var24.field699) / 2;
					var24.method270(arg3 * 4 + var25 + 48, (104 - arg2 - var23.field636) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field396.field1027;
				int var29 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
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

		int var30 = field363.method557(arg1, arg3, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			DQLJXYPC var32 = DQLJXYPC.method192(var31);
			if (var32.field666 != -1) {
				FCRLGSQA var33 = field269[var32.field666];
				if (var33 != null) {
					int var34 = (var32.field641 * 4 - var33.field698) / 2;
					int var35 = (var32.field636 * 4 - var33.field699) / 2;
					var33.method270(arg3 * 4 + var34 + 48, (104 - arg2 - var32.field636) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method20() {
		if (field490 || field457 || field364) {
			method89();
		} else {
			field456++;

			if (field521) {
				method142();
			} else {
				method149(false);
			}

			field371 = 0;
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 349);

			if (arg0.length == 5) {
				field212 = Integer.parseInt(arg0[0]);
				field213 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method130();
				} else if (arg0[2].equals("highmem")) {
					method171();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field214 = false;
				} else if (arg0[3].equals("members")) {
					field214 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method12(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IIILAWOZVMFS;I)V")
	public final void method98(int arg0, int arg1, int arg2, AWOZVMFS arg3) {
		if (field264 != arg3 && field368 < 400) {
			String var5;
			if (arg3.field103 == 0) {
				var5 = arg3.field117 + method104(arg3.field110, field264.field110) + " (level-" + arg3.field110 + ")";
			} else {
				var5 = arg3.field117 + " (skill-" + arg3.field103 + ")";
			}

			if (field492 == 1) {
				field245[field368] = "Use " + field496 + " with @whi@" + var5;
				field309[field368] = 703;
				field310[field368] = arg1;
				field307[field368] = arg0;
				field308[field368] = arg2;
				field368++;
			} else if (field573 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field536[var6] != null) {
						field245[field368] = field536[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field536[var6].equalsIgnoreCase("attack")) {
							if (arg3.field110 > field264.field110) {
								var7 = 2000;
							}

							if (field264.field118 != 0 && arg3.field118 != 0) {
								if (field264.field118 == arg3.field118) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field537[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field309[field368] = var7 + 883;
						}

						if (var6 == 1) {
							field309[field368] = var7 + 145;
						}

						if (var6 == 2) {
							field309[field368] = var7 + 359;
						}

						if (var6 == 3) {
							field309[field368] = var7 + 896;
						}

						if (var6 == 4) {
							field309[field368] = var7 + 233;
						}

						field310[field368] = arg1;
						field307[field368] = arg0;
						field308[field368] = arg2;
						field368++;
					}
				}
			} else if ((field575 & 0x8) == 8) {
				field245[field368] = field576 + " @whi@" + var5;
				field309[field368] = 621;
				field310[field368] = arg1;
				field307[field368] = arg0;
				field308[field368] = arg2;
				field368++;
			}

			for (int var8 = 0; var8 < field368; var8++) {
				if (field309[var8] == 16) {
					field245[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LIRYXZZFE;Z)Z")
	public final boolean method99(IRYXZZFE arg0) {
		int var2 = arg0.field773;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field245[field368] = "Remove @whi@" + arg0.field800;
				field309[field368] = 212;
				field368++;
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

		field245[field368] = "Remove @whi@" + field472[var2];
		field309[field368] = 526;
		field368++;
		field245[field368] = "Message @whi@" + field472[var2];
		field309[field368] = 247;
		field368++;
		return true;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field78 != null) {
				return new URL("http://127.0.0.1:" + (field213 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.v(I)V")
	public final void method100() {
		if (field220 != 0) {
			MCYRKBJU var1 = field379;
			int var2 = 0;
			if (field422 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field505[var3] != null) {
					int var4 = field503[var3];
					String var5 = field504[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field315 == 0 || field315 == 1 && method179(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method377("From", var7, var8, 0);
						var1.method377("From", var7 - 1, var8, 0xFFFF);
						int var11 = var8 + var1.method375("From ");
						if (var6 == 1) {
							field445[0].method270(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field445[1].method270(var11, var7 - 12);
							var11 += 14;
						}

						var1.method377(var5 + ": " + field505[var3], var7, var11, 0);
						var1.method377(var5 + ": " + field505[var3], var7 - 1, var11, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field315 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method377(field505[var3], var9, 4, 0);
						var1.method377(field505[var3], var9 - 1, 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field315 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method377("To " + var5 + ": " + field505[var3], var10, 4, 0);
						var1.method377("To " + var5 + ": " + field505[var3], var10 - 1, 4, 0xFFFF);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean method101(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field363.method558(field165, arg0, arg2, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		field533++;
		if (field533 > 1184) {
			field533 = 0;
			field560.method213(127);
			field560.method214(0);
			int var8 = field560.field684;
			field560.method215(8709);
			field560.method215(18795);

			if ((int) (Math.random() * 2.0D) == 0) {
				field560.method214(235);
			}

			field560.method214(38);

			if ((int) (Math.random() * 2.0D) == 0) {
				field560.method215(55800);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field560.method215(42667);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field560.method214(1);
			}

			field560.method214(163);
			field560.method215(42960);

			if ((int) (Math.random() * 2.0D) == 0) {
				field560.method214(194);
			}

			field560.method223(field560.field684 - var8);
		}

		if (var6 == 10 || var6 == 11 || var6 == 22) {
			DQLJXYPC var9 = DQLJXYPC.method192(var4);
			int var10;
			int var11;
			if (var7 == 0 || var7 == 2) {
				var10 = var9.field641;
				var11 = var9.field636;
			} else {
				var10 = var9.field636;
				var11 = var9.field641;
			}

			int var12 = var9.field669;
			if (var7 != 0) {
				var12 = (var12 >> 4 - var7) + (var12 << var7 & 0xF);
			}

			method155(arg0, arg2, 2, var11, field264.field35[0], false, var12, field264.field34[0], 0, var10, 0);
		} else {
			method155(arg0, arg2, 2, 0, field264.field35[0], false, 0, field264.field34[0], var7, 0, var6 + 1);
		}

		field224 = field90;
		field225 = field91;
		field227 = 2;
		field226 = 0;
		return true;
	}

	@ObfuscatedName("client.a(IILAPSQOGBV;)V")
	public final void method102(int arg0, APSQOGBV arg1) {
		method103(arg1.field63, arg0, arg1.field62);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method103(int arg0, int arg1, int arg2) {
		if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
			int var4 = method129(arg2, arg0, field165) - arg1;
			arg2 -= field169;
			var4 -= field170;
			arg0 -= field171;
			int var5 = KBEXSZSN.field935[field172];
			int var6 = KBEXSZSN.field936[field172];
			int var7 = KBEXSZSN.field935[field173];
			int var8 = KBEXSZSN.field936[field173];
			int var9 = arg0 * var7 + arg2 * var8 >> 16;
			arg0 = arg0 * var8 - arg2 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field347 = (var9 << 9) / arg0 + GBZDHVLZ.field711;
				field348 = (var11 << 9) / arg0 + GBZDHVLZ.field712;
			} else {
				field347 = -1;
				field348 = -1;
			}
		} else {
			field347 = -1;
			field348 = -1;
		}
	}

	@ObfuscatedName("client.b(IBI)Ljava/lang/String;")
	public static final String method104(int arg0, int arg1) {
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

	@ObfuscatedName("client.w(I)V")
	public final void method105() {
		if (field443 == null) {
			method60();
			field76 = null;
			field290 = null;
			field291 = null;
			field292 = null;
			field293 = null;
			field294 = null;
			field295 = null;
			field296 = null;
			field297 = null;
			field298 = null;
			field443 = new UKPRFGXO(479, method22(), 96);
			field441 = new UKPRFGXO(172, method22(), 156);
			IFHRXNFO.method313();
			field387.method270(0, 0);
			field440 = new UKPRFGXO(190, method22(), 261);
			field442 = new UKPRFGXO(512, method22(), 334);
			IFHRXNFO.method313();
			field282 = new UKPRFGXO(496, method22(), 50);
			field283 = new UKPRFGXO(269, method22(), 37);
			field284 = new UKPRFGXO(249, method22(), 45);
			field356 = true;
			field442.method463();
			GBZDHVLZ.field717 = field384;
		}
	}

	@ObfuscatedName("client.a(ZILNPWLDXJE;II)V")
	public final void method106(int arg0, NPWLDXJE arg1, int arg2, int arg3) {
		if (field368 < 400) {
			if (arg1.field979 != null) {
				arg1 = arg1.method389();
			}

			if (arg1 != null && arg1.field988) {
				String var5 = arg1.field1001;
				if (arg1.field996 != 0) {
					var5 = var5 + method104(arg1.field996, field264.field110) + " (level-" + arg1.field996 + ")";
				}

				if (field492 == 1) {
					field245[field368] = "Use " + field496 + " with @yel@" + var5;
					field309[field368] = 646;
					field310[field368] = arg0;
					field307[field368] = arg3;
					field308[field368] = arg2;
					field368++;
				} else if (field573 != 1) {
					if (arg1.field993 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg1.field993[var6] != null && !arg1.field993[var6].equalsIgnoreCase("attack")) {
								field245[field368] = arg1.field993[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field309[field368] = 447;
								}

								if (var6 == 1) {
									field309[field368] = 24;
								}

								if (var6 == 2) {
									field309[field368] = 851;
								}

								if (var6 == 3) {
									field309[field368] = 515;
								}

								if (var6 == 4) {
									field309[field368] = 983;
								}

								field310[field368] = arg0;
								field307[field368] = arg3;
								field308[field368] = arg2;
								field368++;
							}
						}
					}

					if (arg1.field993 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg1.field993[var7] != null && arg1.field993[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg1.field996 > field264.field110) {
									var8 = 2000;
								}

								field245[field368] = arg1.field993[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field309[field368] = var8 + 447;
								}

								if (var7 == 1) {
									field309[field368] = var8 + 24;
								}

								if (var7 == 2) {
									field309[field368] = var8 + 851;
								}

								if (var7 == 3) {
									field309[field368] = var8 + 515;
								}

								if (var7 == 4) {
									field309[field368] = var8 + 983;
								}

								field310[field368] = arg0;
								field307[field368] = arg3;
								field308[field368] = arg2;
								field368++;
							}
						}
					}

					field245[field368] = "Examine @yel@" + var5;
					field309[field368] = 1335;
					field310[field368] = arg0;
					field307[field368] = arg3;
					field308[field368] = arg2;
					field368++;
				} else if ((field575 & 0x2) == 2) {
					field245[field368] = field576 + " @yel@" + var5;
					field309[field368] = 403;
					field310[field368] = arg0;
					field307[field368] = arg3;
					field308[field368] = arg2;
					field368++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public final String method107(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;IBI)LBBMKAXRK;")
	public final BBMKAXRK method108(String arg0, int arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field500[0] != null) {
				var6 = field500[0].method31(arg4);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field157.reset();
			field157.update(var6);
			int var8 = (int) field157.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new BBMKAXRK(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method24("Requesting " + arg0, arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method121(arg2 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				EILHLJCE var16 = new EILHLJCE(var15);
				var16.field684 = 3;
				int var17 = var16.method228() + 6;
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
						method24("Loading " + arg0 + " - " + var22 + "%", arg3);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field500[0] != null) {
						field500[0].method32(var6.length, var6, arg4);
					}
				} catch (Exception var28) {
					field500[0] = null;
				}

				if (var6 != null) {
					field157.reset();
					field157.update(var6);
					int var23 = (int) field157.getValue();
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
						method24("Game updated - please reload page", arg3);
						var25 = 10;
					} else {
						method24(var11 + " - Retrying in " + var25, arg3);
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

				field460 = !field460;
			}
		}

		return new BBMKAXRK(var6);
	}

	@ObfuscatedName("client.x(I)V")
	public final void method109() {
		if (field290 == null) {
			field76 = null;
			field443 = null;
			field441 = null;
			field440 = null;
			field442 = null;
			field282 = null;
			field283 = null;
			field284 = null;
			field293 = new UKPRFGXO(128, method22(), 265);
			IFHRXNFO.method313();
			field294 = new UKPRFGXO(128, method22(), 265);
			IFHRXNFO.method313();
			field290 = new UKPRFGXO(509, method22(), 171);
			IFHRXNFO.method313();
			field291 = new UKPRFGXO(360, method22(), 132);
			IFHRXNFO.method313();
			field292 = new UKPRFGXO(360, method22(), 200);
			IFHRXNFO.method313();
			field295 = new UKPRFGXO(202, method22(), 238);
			IFHRXNFO.method313();
			field296 = new UKPRFGXO(203, method22(), 238);
			IFHRXNFO.method313();
			field297 = new UKPRFGXO(74, method22(), 94);
			IFHRXNFO.method313();
			field298 = new UKPRFGXO(75, method22(), 94);
			IFHRXNFO.method313();

			if (field286 != null) {
				method120();
				method95();
			}

			field356 = true;
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method110() {
		for (int var1 = -1; var1 < field510; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field508;
			} else {
				var2 = field511[var1];
			}

			AWOZVMFS var3 = field509[var2];
			if (var3 != null) {
				method136(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(IZLEILHLJCE;)V")
	public final void method111(int arg0, EILHLJCE arg1) {
		while (arg1.field685 + 21 < arg0 * 8) {
			int var3 = arg1.method235(14);
			if (var3 == 16383) {
				break;
			}

			if (field209[var3] == null) {
				field209[var3] = new ONCZAQCQ();
			}

			ONCZAQCQ var4 = field209[var3];
			field211[field210++] = var3;
			var4.field29 = field499;
			int var5 = arg1.method235(1);
			var4.field1059 = NPWLDXJE.method393(arg1.method235(13));
			int var6 = arg1.method235(1);
			if (var6 == 1) {
				field513[field512++] = var3;
			}

			int var7 = arg1.method235(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method235(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field51 = var4.field1059.field987;
			var4.field37 = var4.field1059.field999;
			var4.field18 = var4.field1059.field1010;
			var4.field19 = var4.field1059.field995;
			var4.field20 = var4.field1059.field983;
			var4.field21 = var4.field1059.field1008;
			var4.field65 = var4.field1059.field1000;
			var4.method11(field264.field34[0] + var8, field264.field35[0] + var7, var5 == 1);
		}

		arg1.method236();
	}

	@ObfuscatedName("client.b(LIRYXZZFE;Z)V")
	public final void method112(IRYXZZFE arg0) {
		int var2 = arg0.field773;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field159 == 0) {
				arg0.field800 = "Loading friend list";
				arg0.field816 = 0;
			} else if (var2 == 1 && field159 == 1) {
				arg0.field800 = "Connecting to friendserver";
				arg0.field816 = 0;
			} else if (var2 == 2 && field159 != 2) {
				arg0.field800 = "Please wait...";
				arg0.field816 = 0;
			} else {
				int var3 = field158;
				if (field159 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field800 = "";
					arg0.field816 = 0;
				} else {
					arg0.field800 = field472[var2];
					arg0.field816 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field158;
			if (field159 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field800 = "";
				arg0.field816 = 0;
			} else {
				if (field408[var2] == 0) {
					arg0.field800 = "@red@Offline";
				} else if (field408[var2] < 200) {
					if (field408[var2] == field212) {
						arg0.field800 = "@gre@World" + (field408[var2] - 9);
					} else {
						arg0.field800 = "@yel@World" + (field408[var2] - 9);
					}
				} else if (field408[var2] == field212) {
					arg0.field800 = "@gre@Classic" + (field408[var2] - 219);
				} else {
					arg0.field800 = "@yel@Classic" + (field408[var2] - 219);
				}

				arg0.field816 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field158;
			if (field159 != 2) {
				var5 = 0;
			}

			arg0.field803 = var5 * 15 + 20;
			if (arg0.field803 <= arg0.field792) {
				arg0.field803 = arg0.field792 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field159 == 0) {
				arg0.field800 = "Loading ignore list";
				arg0.field816 = 0;
			} else if (var2 == 1 && field159 == 0) {
				arg0.field800 = "Please wait...";
				arg0.field816 = 0;
			} else {
				int var6 = field203;
				if (field159 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field800 = "";
					arg0.field816 = 0;
				} else {
					arg0.field800 = LGOZNEAG.method370(LGOZNEAG.method367(field520[var2]));
					arg0.field816 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field803 = field203 * 15 + 20;
			if (arg0.field803 <= arg0.field792) {
				arg0.field803 = arg0.field792 + 1;
			}
		} else if (var2 == 327) {
			arg0.field832 = 150;
			arg0.field833 = (int) (Math.sin(field499 / 40.0D) * 256.0D) & 0x7FF;

			if (field234) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field346[var7];
					if (var8 >= 0 && !TFKCMRVE.field1186[var8].method455()) {
						return;
					}
				}

				field234 = false;
				KBEXSZSN[] var9 = new KBEXSZSN[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field346[var11];
					if (var12 >= 0) {
						var9[var10++] = TFKCMRVE.field1186[var12].method456();
					}
				}

				KBEXSZSN var13 = new KBEXSZSN(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field583[var14] != 0) {
						var13.method353(field409[var14][0], field409[var14][field583[var14]]);

						if (var14 == 1) {
							var13.method353(field544[0], field544[field583[var14]]);
						}
					}
				}

				var13.method346();
				var13.method347(ODMBIHRM.field1035[field264.field65].field1037[0]);
				var13.method356(64, 850, -30, -50, -30, true);
				arg0.field806 = 5;
				arg0.field807 = 0;
				IRYXZZFE.method331(var13, 0, 5);
			}
		} else if (var2 == 324) {
			if (field563 == null) {
				field563 = arg0.field809;
				field564 = arg0.field812;
			}

			if (field552) {
				arg0.field809 = field564;
			} else {
				arg0.field809 = field563;
			}
		} else if (var2 == 325) {
			if (field563 == null) {
				field563 = arg0.field809;
				field564 = arg0.field812;
			}

			if (field552) {
				arg0.field809 = field563;
			} else {
				arg0.field809 = field564;
			}
		} else if (var2 == 600) {
			arg0.field800 = field538;
			if (field499 % 20 < 10) {
				arg0.field800 = arg0.field800 + "|";
			} else {
				arg0.field800 = arg0.field800 + " ";
			}
		} else if (var2 == 620) {
			if (field166 < 1) {
				arg0.field800 = "";
			} else if (field439) {
				arg0.field774 = 0xFF0000;
				arg0.field800 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field774 = 0xFFFFFF;
				arg0.field800 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field459 - field455;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field800 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field369 == 0) {
				arg0.field800 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field369 <= field459) {
				arg0.field800 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method113(field369);
			} else {
				int var17 = field459 + 14 - field369;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field800 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method113(field369) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field228 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field228 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field228 + " unread messages";
			}

			arg0.field800 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field359 > 0 && field359 <= field459 + 10) {
				arg0.field800 = "Last password change:\\n@gre@" + method113(field359);
			} else {
				arg0.field800 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 664) {
			if (field305 == 0) {
				arg0.field800 = "You have not yet set\\nany contact details.";
			}

			if (field305 == 1) {
				arg0.field800 = "Contact Details Last Set:\\n@gre@" + method113(field333);
			}

			if (field305 == 2) {
				arg0.field800 = "You need to set\\nnew contact details.";
			}
		} else if (var2 == 665) {
			if (field202 > 2 && !field214) {
				arg0.field800 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field202 > 2) {
				arg0.field800 = "\\n\\nYou have @gre@" + field202 + "@yel@ days of\\nmember credit remaining.";
			} else if (field202 > 0) {
				arg0.field800 = "You have @gre@" + field202 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field800 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field202 > 2 && !field214) {
				arg0.field800 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field202 > 0) {
				arg0.field800 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field800 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field369 > field459) {
				arg0.field800 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field800 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.c(BI)Ljava/lang/String;")
	public final String method113(int arg0) {
		if (arg0 > field459 + 10) {
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

	@ObfuscatedName("client.a(Ljava/lang/String;BI)V")
	public final void method24(String arg0, int arg1) {
		field233 = arg1;
		field545 = arg0;
		method109();

		if (field286 == null) {
			super.method24(arg0, arg1);
		} else {
			field292.method463();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field380.method373(0xFFFFFF, "RuneScape is loading - please wait...", var3 / 2, var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			IFHRXNFO.method316(var6, 304, var3 / 2 - 152, 34, 0x8C1111);
			IFHRXNFO.method316(var6 + 1, 302, var3 / 2 - 151, 32, 0);
			IFHRXNFO.method315(0x8C1111, var3 / 2 - 150, arg1 * 3, 30, var6 + 2);
			IFHRXNFO.method315(0, arg1 * 3 + var3 / 2 - 150, 300 - arg1 * 3, 30, var6 + 2);
			field380.method373(0xFFFFFF, arg0, var3 / 2, var4 / 2 + 5 - var5);
			field292.method464(171, field75, 202);

			if (field356) {
				field356 = false;

				if (!field313) {
					field293.method464(0, field75, 0);
					field294.method464(0, field75, 637);
				}

				field290.method464(0, field75, 128);
				field291.method464(371, field75, 202);
				field295.method464(265, field75, 0);
				field296.method464(265, field75, 562);
				field297.method464(171, field75, 128);
				field298.method464(171, field75, 562);
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method114(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field203; var3++) {
				if (field520[var3] == arg0) {
					field203--;
					field488 = true;

					for (int var4 = var3; var4 < field203; var4++) {
						field520[var4] = field520[var4 + 1];
					}

					field560.method213(146);
					field560.method220(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LODBDSPMH;ZII)V")
	public final void method115(ODBDSPMH arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field570 + field287 & 0x7FF;
			int var6 = KBEXSZSN.field935[var5];
			int var7 = KBEXSZSN.field936[var5];
			var6 = var6 * 256 / (field540 + 256);
			var7 = var7 * 256 / (field540 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field250.method409(var12 + 94 + 4 - 10, 15, 20, var10, 15, 83 - var13 - 20, 256, 20);
		} else {
			method178(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void method116() {
		if (field76 == null) {
			method60();
			field290 = null;
			field291 = null;
			field292 = null;
			field293 = null;
			field294 = null;
			field295 = null;
			field296 = null;
			field297 = null;
			field298 = null;
			field443 = null;
			field441 = null;
			field440 = null;
			field442 = null;
			field282 = null;
			field283 = null;
			field284 = null;
			field76 = new UKPRFGXO(765, method22(), 503);
			field356 = true;
		}
	}

	public final void run() {
		if (field237) {
			method75();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.e(Z)Z")
	public final boolean method117() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.A(I)V")
	public final void method118() {
		for (HCPBXDEK var1 = (HCPBXDEK) field474.method275(); var1 != null; var1 = (HCPBXDEK) field474.method277()) {
			if (var1.field742 == -1) {
				var1.field747 = 0;
				method160(var1);
			} else {
				var1.method334();
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method17() {
		method24("Starting up", 20);

		if (signlink.sunjava) {
			field69 = 5;
		}

		if (field253) {
			field490 = true;
		} else {
			field253 = true;
			boolean var1 = false;
			String var2 = method58();
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
						field500[var3] = new BDNJGDVN(signlink.cache_dat, signlink.cache_idx[var3], var3 + 1, 500000);
					}
				}

				try {
					method134();
					field286 = method108("title screen", field271[1], "title", 25, 1);
					field378 = new MCYRKBJU(field286, "p11_full", false);
					field379 = new MCYRKBJU(field286, "p12_full", false);
					field380 = new MCYRKBJU(field286, "b12_full", false);
					field381 = new MCYRKBJU(field286, "q8_full", true);
					method120();
					method95();
					BBMKAXRK var4 = method108("config", field271[2], "config", 30, 2);
					BBMKAXRK var5 = method108("interface", field271[3], "interface", 35, 3);
					BBMKAXRK var6 = method108("2d graphics", field271[4], "media", 40, 4);
					BBMKAXRK var7 = method108("textures", field271[6], "textures", 45, 6);
					BBMKAXRK var8 = method108("chat system", field271[7], "wordenc", 50, 7);
					BBMKAXRK var9 = method108("sound effects", field271[8], "sounds", 55, 8);
					field216 = new byte[4][104][104];
					field559 = new int[4][105][105];
					field363 = new XOHMKFIT(104, 104, field559, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field342[var10] = new DYTTVJNT(104, 104);
					}

					field396 = new ODBDSPMH(512, 512);
					BBMKAXRK var11 = method108("update list", field271[5], "versionlist", 60, 5);
					method24("Connecting to update server", 60);
					field543 = new YSAVREBH();
					field543.method593(var11, this);
					IBCKUTPD.method305(field543.method597());
					KBEXSZSN.method336(field543.method588(0), field543);

					if (!field215) {
						field406 = 0;
						field407 = true;
						field543.method585(2, field406);

						while (field543.method594() > 0) {
							method177();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field543.field1458 > 3) {
								method46("ondemand");
								return;
							}
						}
					}

					method24("Requesting animations", 65);
					int var12 = field543.method588(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field543.method585(1, var13);
					}

					while (field543.method594() > 0) {
						int var14 = var12 - field543.method594();
						if (var14 > 0) {
							method24("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method177();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field543.field1458 > 3) {
							method46("ondemand");
							return;
						}
					}

					method24("Requesting models", 70);
					int var15 = field543.method588(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field543.method592(var16);
						if ((var17 & 0x1) != 0) {
							field543.method585(0, var16);
						}
					}

					int var18 = field543.method594();
					while (field543.method594() > 0) {
						int var19 = var18 - field543.method594();
						if (var19 > 0) {
							method24("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method177();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field500[0] != null) {
						method24("Requesting maps", 75);
						field543.method585(3, field543.method601(48, 47, 0));
						field543.method585(3, field543.method601(48, 47, 1));
						field543.method585(3, field543.method601(48, 48, 0));
						field543.method585(3, field543.method601(48, 48, 1));
						field543.method585(3, field543.method601(48, 49, 0));
						field543.method585(3, field543.method601(48, 49, 1));
						field543.method585(3, field543.method601(47, 47, 0));
						field543.method585(3, field543.method601(47, 47, 1));
						field543.method585(3, field543.method601(47, 48, 0));
						field543.method585(3, field543.method601(47, 48, 1));
						field543.method585(3, field543.method601(148, 48, 0));
						field543.method585(3, field543.method601(148, 48, 1));
						int var20 = field543.method594();
						while (field543.method594() > 0) {
							int var21 = var20 - field543.method594();
							if (var21 > 0) {
								method24("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method177();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field543.method588(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field543.method592(var23);
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
							field543.method584(var23, 0, var25);
						}
					}

					field543.method595(field214);

					if (!field215) {
						int var26 = field543.method588(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field543.method586(var27)) {
								field543.method584(var27, 2, (byte) 1);
							}
						}
					}

					method24("Unpacking media", 80);
					field386 = new FCRLGSQA(var6, "invback", 0);
					field388 = new FCRLGSQA(var6, "chatback", 0);
					field387 = new FCRLGSQA(var6, "mapback", 0);
					field427 = new FCRLGSQA(var6, "backbase1", 0);
					field428 = new FCRLGSQA(var6, "backbase2", 0);
					field429 = new FCRLGSQA(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field447[var28] = new FCRLGSQA(var6, "sideicons", var28);
					}

					field581 = new ODBDSPMH(var6, "compass", 0);
					field250 = new ODBDSPMH(var6, "mapedge", 0);
					field250.method401();

					for (int var29 = 0; var29 < 72; var29++) {
						field269[var29] = new FCRLGSQA(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field341[var30] = new ODBDSPMH(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field582[var31] = new ODBDSPMH(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field266[var32] = new ODBDSPMH(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field325[var33] = new ODBDSPMH(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field311[var34] = new ODBDSPMH(var6, "headicons_hint", var34);
					}

					field148 = new ODBDSPMH(var6, "overlay_multiway", 0);
					field274 = new ODBDSPMH(var6, "mapmarker", 0);
					field275 = new ODBDSPMH(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field323[var35] = new ODBDSPMH(var6, "cross", var35);
					}

					field179 = new ODBDSPMH(var6, "mapdots", 0);
					field180 = new ODBDSPMH(var6, "mapdots", 1);
					field181 = new ODBDSPMH(var6, "mapdots", 2);
					field182 = new ODBDSPMH(var6, "mapdots", 3);
					field183 = new ODBDSPMH(var6, "mapdots", 4);
					field430 = new FCRLGSQA(var6, "scrollbar", 0);
					field431 = new FCRLGSQA(var6, "scrollbar", 1);
					field482 = new FCRLGSQA(var6, "redstone1", 0);
					field483 = new FCRLGSQA(var6, "redstone2", 0);
					field484 = new FCRLGSQA(var6, "redstone3", 0);
					field485 = new FCRLGSQA(var6, "redstone1", 0);
					field485.method267();
					field486 = new FCRLGSQA(var6, "redstone2", 0);
					field486.method267();
					field373 = new FCRLGSQA(var6, "redstone1", 0);
					field373.method268();
					field374 = new FCRLGSQA(var6, "redstone2", 0);
					field374.method268();
					field375 = new FCRLGSQA(var6, "redstone3", 0);
					field375.method268();
					field376 = new FCRLGSQA(var6, "redstone1", 0);
					field376.method267();
					field376.method268();
					field377 = new FCRLGSQA(var6, "redstone2", 0);
					field377.method267();
					field377.method268();

					for (int var36 = 0; var36 < 2; var36++) {
						field445[var36] = new FCRLGSQA(var6, "mod_icons", var36);
					}

					ODBDSPMH var37 = new ODBDSPMH(var6, "backleft1", 0);
					field187 = new UKPRFGXO(var37.field1028, method22(), var37.field1029);
					var37.method402(0, 0);
					ODBDSPMH var38 = new ODBDSPMH(var6, "backleft2", 0);
					field188 = new UKPRFGXO(var38.field1028, method22(), var38.field1029);
					var38.method402(0, 0);
					ODBDSPMH var39 = new ODBDSPMH(var6, "backright1", 0);
					field189 = new UKPRFGXO(var39.field1028, method22(), var39.field1029);
					var39.method402(0, 0);
					ODBDSPMH var40 = new ODBDSPMH(var6, "backright2", 0);
					field190 = new UKPRFGXO(var40.field1028, method22(), var40.field1029);
					var40.method402(0, 0);
					ODBDSPMH var41 = new ODBDSPMH(var6, "backtop1", 0);
					field191 = new UKPRFGXO(var41.field1028, method22(), var41.field1029);
					var41.method402(0, 0);
					ODBDSPMH var42 = new ODBDSPMH(var6, "backvmid1", 0);
					field192 = new UKPRFGXO(var42.field1028, method22(), var42.field1029);
					var42.method402(0, 0);
					ODBDSPMH var43 = new ODBDSPMH(var6, "backvmid2", 0);
					field193 = new UKPRFGXO(var43.field1028, method22(), var43.field1029);
					var43.method402(0, 0);
					ODBDSPMH var44 = new ODBDSPMH(var6, "backvmid3", 0);
					field194 = new UKPRFGXO(var44.field1028, method22(), var44.field1029);
					var44.method402(0, 0);
					ODBDSPMH var45 = new ODBDSPMH(var6, "backhmid2", 0);
					field195 = new UKPRFGXO(var45.field1028, method22(), var45.field1029);
					var45.method402(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field341[var50] != null) {
							field341[var50].method400(var48 + var49, var46 + var49, var47 + var49);
						}

						if (field269[var50] != null) {
							field269[var50].method269(var48 + var49, var46 + var49, var47 + var49);
						}
					}

					method24("Unpacking textures", 83);
					GBZDHVLZ.method285(var7);
					GBZDHVLZ.method289(0.8D);
					GBZDHVLZ.method284(20);
					method24("Unpacking config", 86);
					ODMBIHRM.method412(var4);
					DQLJXYPC.method187(var4);
					SYTONBKT.method449(var4);
					XLZQSPZS.method518(var4);
					NPWLDXJE.method391(var4);
					TFKCMRVE.method453(var4);
					TGIKVGNH.method459(var4);
					ISZVQSTL.method332(var4);
					SRLFLGUY.method447(var4);
					XLZQSPZS.field1309 = field214;

					if (!field215) {
						method24("Unpacking sounds", 90);
						byte[] var51 = var9.method30("sounds.dat", null);
						EILHLJCE var52 = new EILHLJCE(var51);
						GTYZUNUD.method297(var52);
					}

					method24("Unpacking interfaces", 95);
					MCYRKBJU[] var53 = new MCYRKBJU[] { field378, field379, field380, field381 };
					IRYXZZFE.method322(var6, var5, var53);
					method24("Preparing game engine", 100);

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field387.field696[field387.field698 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field361[var54] = var55;
						field304[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field387.field696[field387.field698 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field314[var58 - 5] = var59 - 25;
						field487[var58 - 5] = var60 - var59;
					}

					GBZDHVLZ.method282(503, 765);
					field385 = GBZDHVLZ.field717;
					GBZDHVLZ.method282(96, 479);
					field382 = GBZDHVLZ.field717;
					GBZDHVLZ.method282(261, 190);
					field383 = GBZDHVLZ.field717;
					GBZDHVLZ.method282(334, 512);
					field384 = GBZDHVLZ.field717;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = GBZDHVLZ.field715[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					XOHMKFIT.method564(800, 500, 512, var62, 334);
					WOWCAPIK.method476(var8);
					field219 = new ULPROSHL(this);
					method23(field219, 10);
					TUJJLJTQ.field1221 = this;
					DQLJXYPC.field633 = this;
					NPWLDXJE.field981 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field545 + " " + field233);
					field457 = true;
				}
			} else {
				field364 = true;
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.B(I)V")
	public final void method119() {
		if (field368 >= 2 || field492 != 0 || field573 != 0) {
			String var1;
			if (field492 == 1 && field368 < 2) {
				var1 = "Use " + field496 + " with...";
			} else if (field573 == 1 && field368 < 2) {
				var1 = field576 + "...";
			} else {
				var1 = field245[field368 - 1];
			}

			if (field368 > 2) {
				var1 = var1 + "@whi@ / " + (field368 - 2) + " more options";
			}

			field380.method382(0xFFFFFF, true, var1, 15, field499 / 1000, 4);
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method120() {
		byte[] var1 = field286.method30("title.dat", null);
		ODBDSPMH var2 = new ODBDSPMH(var1, this);
		field293.method463();
		var2.method402(0, 0);
		field294.method463();
		var2.method402(0, -637);
		field290.method463();
		var2.method402(0, -128);
		field291.method463();
		var2.method402(-371, -202);
		field292.method463();
		var2.method402(-171, -202);
		field295.method463();
		var2.method402(-265, 0);
		field296.method463();
		var2.method402(-265, -562);
		field297.method463();
		var2.method402(-171, -128);
		field298.method463();
		var2.method402(-171, -562);
		int[] var3 = new int[var2.field1028];
		for (int var4 = 0; var4 < var2.field1029; var4++) {
			for (int var5 = 0; var5 < var2.field1028; var5++) {
				var3[var5] = var2.field1027[var2.field1028 * var4 + var2.field1028 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1028; var6++) {
				var2.field1027[var2.field1028 * var4 + var6] = var3[var6];
			}
		}

		field293.method463();
		var2.method402(0, 382);
		field294.method463();
		var2.method402(0, -255);
		field290.method463();
		var2.method402(0, 254);
		field291.method463();
		var2.method402(-371, 180);
		field292.method463();
		var2.method402(-171, 180);
		field295.method463();
		var2.method402(-265, 382);
		field296.method463();
		var2.method402(-265, -180);
		field297.method463();
		var2.method402(-171, 254);
		field298.method463();
		var2.method402(-171, -180);
		ODBDSPMH var7 = new ODBDSPMH(field286, "logo", 0);
		field290.method463();
		var7.method404(382 - var7.field1028 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method121(String arg0) throws IOException {
		if (field460) {
			if (field162 != null) {
				try {
					field162.close();
				} catch (Exception var4) {
				}

				field162 = null;
			}

			field162 = method85(43595);
			field162.setSoTimeout(10000);
			InputStream var2 = field162.getInputStream();
			OutputStream var3 = field162.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.h(B)V")
	public final void method122() {
		for (int var1 = 0; var1 < field554; var1++) {
			if (field241[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field501[var1] != field546 || field268[var1] != field258) {
						EILHLJCE var3 = GTYZUNUD.method298(field268[var1], field501[var1]);
						if (System.currentTimeMillis() + var3.field684 / 22 > field185 / 22 + field367) {
							field185 = var3.field684;
							field367 = System.currentTimeMillis();

							if (method64(var3.field684, var3.field683)) {
								field546 = field501[var1];
								field258 = field268[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method117()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field241[var1] != -5) {
					field241[var1] = -5;
				} else {
					field554--;
					for (int var5 = var1; var5 < field554; var5++) {
						field501[var5] = field501[var5 + 1];
						field268[var5] = field268[var5 + 1];
						field241[var5] = field241[var5 + 1];
					}

					var1--;
				}
			} else {
				field241[var1]--;
			}
		}

		if (field471 > 0) {
			field471 -= 20;
			if (field471 < 0) {
				field471 = 0;
			}

			if (field471 == 0 && field336 && !field215) {
				field406 = field201;
				field407 = true;
				field543.method585(2, field406);
				return;
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method123() {
		if (field215 && field164 == 2 && OZIFXWPH.field1073 != field165) {
			method72("Loading - please wait.", null);
			field164 = 1;
			field218 = System.currentTimeMillis();
		}

		if (field164 == 1) {
			int var1 = method124();
			if (var1 != 0 && System.currentTimeMillis() - field218 > 360000L) {
				signlink.reporterror(field154 + " glcfb " + field466 + "," + var1 + "," + field215 + "," + field500[0] + "," + field543.method594() + "," + field165 + "," + field424 + "," + field425);
				field218 = System.currentTimeMillis();
			}
		}

		if (field164 == 2 && field229 != field165) {
			field229 = field165;
			method87(field165);
		}
	}

	@ObfuscatedName("client.D(I)I")
	public final int method124() {
		for (int var1 = 0; var1 < field372.length; var1++) {
			if (field372[var1] == null && field175[var1] != -1) {
				return -1;
			}

			if (field270[var1] == null && field176[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field372.length; var3++) {
			byte[] var4 = field270[var3];
			if (var4 != null) {
				int var5 = (field174[var3] >> 8) * 64 - field548;
				int var6 = (field174[var3] & 0xFF) * 64 - field549;
				if (field458) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= OZIFXWPH.method433(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field240) {
			return -4;
		} else {
			field164 = 2;
			OZIFXWPH.field1073 = field165;
			method145();
			field560.method213(210);
			return 0;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method125() {
		if (field393 > 0) {
			method71();
		} else {
			method72("Connection lost", "Please wait - attempting to reestablish");
			field535 = 0;
			field394 = 0;
			ABBBHPCA var1 = field522;
			field521 = false;
			field539 = 0;
			method161(field154, field155, true);

			if (!field521) {
				method71();
			}

			try {
				var1.method1();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;I)V")
	public final void method126(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field566 != -1) {
			field285 = arg1;
			field89 = 0;
		}

		if (field450 == -1) {
			field579 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field503[var4] = field503[var4 - 1];
			field504[var4] = field504[var4 - 1];
			field505[var4] = field505[var4 - 1];
		}

		field503[0] = arg0;
		field504[0] = arg2;
		field505[0] = arg1;
	}

	@ObfuscatedName("client.F(I)V")
	public final void method127() {
		if (field525 == 0) {
			int var1 = field89;
			if (field573 == 1 && field90 >= 516 && field91 >= 160 && field90 <= 765 && field91 <= 205) {
				var1 = 0;
			}

			if (field349) {
				if (var1 != 1) {
					int var2 = field83;
					int var3 = field84;
					if (field277 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field277 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field277 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field278 - 10 || var2 > field280 + field278 + 10 || var3 < field279 - 10 || var3 > field281 + field279 + 10) {
						field349 = false;

						if (field277 == 1) {
							field488 = true;
						}

						if (field277 == 2) {
							field579 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field278;
					int var5 = field279;
					int var6 = field280;
					int var7 = field90;
					int var8 = field91;
					if (field277 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field277 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field277 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field368; var10++) {
						int var11 = (field368 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method51(var9);
					}

					field349 = false;

					if (field277 == 1) {
						field488 = true;
					}

					if (field277 == 2) {
						field579 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field368 > 0) {
					int var12 = field309[field368 - 1];
					if (var12 == 391 || var12 == 377 || var12 == 277 || var12 == 281 || var12 == 485 || var12 == 181 || var12 == 946 || var12 == 152 || var12 == 1 || var12 == 530 || var12 == 963 || var12 == 1870) {
						int var13 = field307[field368 - 1];
						int var14 = field308[field368 - 1];
						IRYXZZFE var15 = IRYXZZFE.method329(var14);
						if (var15.field823 || var15.field778) {
							field491 = false;
							field399 = 0;
							field523 = var14;
							field524 = var13;
							field525 = 2;
							field526 = field90;
							field527 = field91;

							if (IRYXZZFE.method329(var14).field777 == field239) {
								field525 = 1;
							}

							if (IRYXZZFE.method329(var14).field777 == field450) {
								field525 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field167 == 1 || method77(field368 - 1)) && field368 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field368 > 0) {
					method51(field368 - 1);
				}

				if (var1 != 2 || field368 <= 0) {
					return;
				}

				method66();
			}
		}
	}

	@ObfuscatedName("client.a(ILIRYXZZFE;IIIIII)V")
	public final void method128(int arg0, IRYXZZFE arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1.field804 == 0 && arg1.field793 != null && !arg1.field799 && (arg4 >= arg6 && arg3 >= arg5 && arg4 <= arg1.field814 + arg6 && arg3 <= arg1.field792 + arg5)) {
			int var8 = arg1.field793.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg1.field815[var9] + arg6;
				int var11 = arg1.field841[var9] + arg5 - arg0;
				IRYXZZFE var12 = IRYXZZFE.method329(arg1.field793[var9]);
				var10 += var12.field819;
				var11 += var12.field789;
				if ((var12.field801 >= 0 || var12.field772 != 0) && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field814 + var10 && arg3 < var12.field792 + var11) {
					if (var12.field801 >= 0) {
						field473 = var12.field801;
					} else {
						field473 = var12.field796;
					}
				}

				if (var12.field804 == 8 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field814 + var10 && arg3 < var12.field792 + var11) {
					field351 = var12.field796;
				}

				if (var12.field804 == 0) {
					method128(var12.field810, var12, arg2, arg3, arg4, var11, var10);

					if (var12.field803 > var12.field792) {
						method62(var12, arg2, var12.field803, arg4, var12.field814 + var10, arg3, var12.field792, var11);
					}
				} else {
					if (var12.field816 == 1 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field814 + var10 && arg3 < var12.field792 + var11) {
						boolean var13 = false;
						if (var12.field773 != 0) {
							var13 = method99(var12);
						}

						if (!var13) {
							field245[field368] = var12.field788;
							field309[field368] = 426;
							field308[field368] = var12.field796;
							field368++;
						}
					}

					if (var12.field816 == 2 && field573 == 0 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field814 + var10 && arg3 < var12.field792 + var11) {
						String var14 = var12.field821;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field245[field368] = var14 + " @gre@" + var12.field779;
						field309[field368] = 582;
						field308[field368] = var12.field796;
						field368++;
					}

					if (var12.field816 == 3 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field814 + var10 && arg3 < var12.field792 + var11) {
						field245[field368] = "Close";

						if (arg2 == 3) {
							field309[field368] = 482;
						} else {
							field309[field368] = 208;
						}

						field308[field368] = var12.field796;
						field368++;
					}

					if (var12.field816 == 4 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field814 + var10 && arg3 < var12.field792 + var11) {
						field245[field368] = var12.field788;
						field309[field368] = 790;
						field308[field368] = var12.field796;
						field368++;
					}

					if (var12.field816 == 5 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field814 + var10 && arg3 < var12.field792 + var11) {
						field245[field368] = var12.field788;
						field309[field368] = 951;
						field308[field368] = var12.field796;
						field368++;
					}

					if (var12.field816 == 6 && !field400 && arg4 >= var10 && arg3 >= var11 && arg4 < var12.field814 + var10 && arg3 < var12.field792 + var11) {
						field245[field368] = var12.field788;
						field309[field368] = 405;
						field308[field368] = var12.field796;
						field368++;
					}

					if (var12.field804 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field792; var16++) {
							for (int var17 = 0; var17 < var12.field814; var17++) {
								int var18 = (var12.field824 + 32) * var17 + var10;
								int var19 = (var12.field797 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field817[var15];
									var19 += var12.field775[var15];
								}

								if (arg4 >= var18 && arg3 >= var19 && arg4 < var18 + 32 && arg3 < var19 + 32) {
									field478 = var15;
									field479 = var12.field796;

									if (var12.field829[var15] > 0) {
										XLZQSPZS var20 = XLZQSPZS.method526(var12.field829[var15] - 1);
										if (field492 == 1 && var12.field787) {
											if (field494 != var12.field796 || field493 != var15) {
												field245[field368] = "Use " + field496 + " with @lre@" + var20.field1338;
												field309[field368] = 395;
												field310[field368] = var20.field1303;
												field307[field368] = var15;
												field308[field368] = var12.field796;
												field368++;
											}
										} else if (field573 != 1 || !var12.field787) {
											if (var12.field787) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1335 != null && var20.field1335[var21] != null) {
														field245[field368] = var20.field1335[var21] + " @lre@" + var20.field1338;

														if (var21 == 3) {
															field309[field368] = 1;
														}

														if (var21 == 4) {
															field309[field368] = 530;
														}

														field310[field368] = var20.field1303;
														field307[field368] = var15;
														field308[field368] = var12.field796;
														field368++;
													} else if (var21 == 4) {
														field245[field368] = "Drop @lre@" + var20.field1338;
														field309[field368] = 530;
														field310[field368] = var20.field1303;
														field307[field368] = var15;
														field308[field368] = var12.field796;
														field368++;
													}
												}
											}

											if (var12.field828) {
												field245[field368] = "Use @lre@" + var20.field1338;
												field309[field368] = 963;
												field310[field368] = var20.field1303;
												field307[field368] = var15;
												field308[field368] = var12.field796;
												field368++;
											}

											if (var12.field787 && var20.field1335 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1335[var22] != null) {
														field245[field368] = var20.field1335[var22] + " @lre@" + var20.field1338;

														if (var22 == 0) {
															field309[field368] = 181;
														}

														if (var22 == 1) {
															field309[field368] = 946;
														}

														if (var22 == 2) {
															field309[field368] = 152;
														}

														field310[field368] = var20.field1303;
														field307[field368] = var15;
														field308[field368] = var12.field796;
														field368++;
													}
												}
											}

											if (var12.field784 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field784[var23] != null) {
														field245[field368] = var12.field784[var23] + " @lre@" + var20.field1338;

														if (var23 == 0) {
															field309[field368] = 391;
														}

														if (var23 == 1) {
															field309[field368] = 377;
														}

														if (var23 == 2) {
															field309[field368] = 277;
														}

														if (var23 == 3) {
															field309[field368] = 281;
														}

														if (var23 == 4) {
															field309[field368] = 485;
														}

														field310[field368] = var20.field1303;
														field307[field368] = var15;
														field308[field368] = var12.field796;
														field368++;
													}
												}
											}

											field245[field368] = "Examine @lre@" + var20.field1338;
											field309[field368] = 1870;
											field310[field368] = var20.field1303;
											field307[field368] = var15;
											field308[field368] = var12.field796;
											field368++;
										} else if ((field575 & 0x10) == 0x10) {
											field245[field368] = field576 + " @lre@" + var20.field1338;
											field309[field368] = 789;
											field310[field368] = var20.field1303;
											field307[field368] = var15;
											field308[field368] = var12.field796;
											field368++;
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

	@ObfuscatedName("client.a(IIBI)I")
	public final int method129(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (field216[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field559[var6][var4][var5] + field559[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field559[var6][var4][var5 + 1] + field559[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.G(I)V")
	public static final void method130() {
		XOHMKFIT.field1348 = true;
		GBZDHVLZ.field706 = true;
		field215 = true;
		OZIFXWPH.field1070 = true;
		DQLJXYPC.field655 = true;
	}

	@ObfuscatedName("client.b(IILEILHLJCE;)V")
	public final void method131(int arg0, EILHLJCE arg1) {
		if (arg0 == 126) {
			int var3 = arg1.method226();
			int var4 = arg1.method244();
			int var5 = var4 >> 2;
			int var6 = var4 & 0x3;
			int var7 = field272[var5];
			int var8 = arg1.method243();
			int var9 = (var8 >> 4 & 0x7) + field436;
			int var10 = (var8 & 0x7) + field437;
			if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
				int var11 = field559[field165][var9][var10];
				int var12 = field559[field165][var9 + 1][var10];
				int var13 = field559[field165][var9 + 1][var10 + 1];
				int var14 = field559[field165][var9][var10 + 1];
				if (var7 == 0) {
					NZICAUCM var15 = field363.method550(field165, var9, var10);
					if (var15 != null) {
						int var16 = var15.field1022 >> 14 & 0x7FFF;
						if (var5 == 2) {
							var15.field1020 = new TUJJLJTQ(var16, 2, var12, var3, var14, false, var6 + 4, var13, var11);
							var15.field1021 = new TUJJLJTQ(var16, 2, var12, var3, var14, false, var6 + 1 & 0x3, var13, var11);
						} else {
							var15.field1020 = new TUJJLJTQ(var16, var5, var12, var3, var14, false, var6, var13, var11);
						}
					}
				}

				if (var7 == 1) {
					MIRXZWXX var17 = field363.method551(var10, field165, var9);
					if (var17 != null) {
						var17.field972 = new TUJJLJTQ(var17.field973 >> 14 & 0x7FFF, 4, var12, var3, var14, false, 0, var13, var11);
					}
				}

				if (var7 == 2) {
					RJJKHPFX var18 = field363.method552(field165, var9, var10);

					if (var5 == 11) {
						var5 = 10;
					}

					if (var18 != null) {
						var18.field1138 = new TUJJLJTQ(var18.field1146 >> 14 & 0x7FFF, var5, var12, var3, var14, false, var6, var13, var11);
					}
				}

				if (var7 == 3) {
					JIDWLPIO var19 = field363.method553(var10, field165, var9);
					if (var19 != null) {
						var19.field861 = new TUJJLJTQ(var19.field862 >> 14 & 0x7FFF, 22, var12, var3, var14, false, var6, var13, var11);
					}
				}
			}
		} else if (arg0 == 121) {
			int var20 = arg1.method245();
			int var21 = (var20 >> 4 & 0x7) + field436;
			int var22 = (var20 & 0x7) + field437;
			int var23 = arg1.method254();
			if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
				FLJWGVEY var24 = field362[field165][var21][var22];
				if (var24 != null) {
					for (VQCXWNRE var25 = (VQCXWNRE) var24.method275(); var25 != null; var25 = (VQCXWNRE) var24.method277()) {
						if ((var23 & 0x7FFF) == var25.field1264) {
							var25.method334();
							break;
						}
					}

					if (var24.method275() == null) {
						field362[field165][var21][var22] = null;
					}

					method133(var21, var22);
				}
			}
		} else if (arg0 == 2) {
			int var26 = arg1.method224();
			int var27 = (var26 >> 4 & 0x7) + field436;
			int var28 = (var26 & 0x7) + field437;
			int var29 = arg1.method226();
			int var30 = arg1.method226();
			int var31 = arg1.method226();
			if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
				FLJWGVEY var32 = field362[field165][var27][var28];
				if (var32 != null) {
					for (VQCXWNRE var33 = (VQCXWNRE) var32.method275(); var33 != null; var33 = (VQCXWNRE) var32.method277()) {
						if ((var29 & 0x7FFF) == var33.field1264 && var33.field1265 == var30) {
							var33.field1265 = var31;
							break;
						}
					}

					method133(var27, var28);
				}
			}
		} else if (arg0 == 198) {
			int var34 = arg1.method245();
			int var35 = (var34 >> 4 & 0x7) + field436;
			int var36 = (var34 & 0x7) + field437;
			int var37 = arg1.method226();
			int var38 = arg1.method244();
			int var39 = var38 >> 2;
			int var40 = var38 & 0x3;
			int var41 = field272[var39];
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				method82(var36, var35, field165, var41, var37, var40, -1, 0, var39);
			}
		} else if (arg0 == 146) {
			int var42 = arg1.method224();
			int var43 = (var42 >> 4 & 0x7) + field436;
			int var44 = (var42 & 0x7) + field437;
			int var45 = var43 + arg1.method225();
			int var46 = var44 + arg1.method225();
			int var47 = arg1.method227();
			int var48 = arg1.method226();
			int var49 = arg1.method224() * 4;
			int var50 = arg1.method224() * 4;
			int var51 = arg1.method226();
			int var52 = arg1.method226();
			int var53 = arg1.method224();
			int var54 = arg1.method224();
			if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var48 != 0xFFFF) {
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				var45 = var45 * 128 + 64;
				var46 = var46 * 128 + 64;
				QGPCEBJK var55 = new QGPCEBJK(var50, field499 + var52, var53, var47, var54, field165, var43, field499 + var51, method129(var43, var44, field165) - var49, var44, var48);
				var55.method437(var46, field499 + var51, var45, method129(var45, var46, field165) - var50);
				field236.method272(var55);
			}
		} else {
			if (arg0 == 255) {
				int var56 = arg1.method252();
				byte var57 = arg1.method247();
				int var58 = arg1.method253();
				byte var59 = arg1.method248();
				byte var60 = arg1.method248();
				int var61 = arg1.method224();
				int var62 = (var61 >> 4 & 0x7) + field436;
				int var63 = (var61 & 0x7) + field437;
				int var64 = arg1.method254();
				int var65 = arg1.method245();
				int var66 = var65 >> 2;
				int var67 = var65 & 0x3;
				int var68 = field272[var66];
				byte var69 = arg1.method246();
				int var70 = arg1.method254();
				AWOZVMFS var71;
				if (field502 == var56) {
					var71 = field264;
				} else {
					var71 = field509[var56];
				}

				if (var71 != null) {
					DQLJXYPC var72 = DQLJXYPC.method192(var70);
					int var73 = field559[field165][var62][var63];
					int var74 = field559[field165][var62 + 1][var63];
					int var75 = field559[field165][var62 + 1][var63 + 1];
					int var76 = field559[field165][var62][var63 + 1];
					KBEXSZSN var77 = var72.method189(var66, var67, var73, var74, var75, var76, -1);
					if (var77 != null) {
						method82(var63, var62, field165, var68, -1, 0, var64 + 1, var58 + 1, 0);
						var71.field97 = field499 + var58;
						var71.field98 = field499 + var64;
						var71.field115 = var77;
						int var78 = var72.field641;
						int var79 = var72.field636;
						if (var67 == 1 || var67 == 3) {
							var78 = var72.field636;
							var79 = var72.field641;
						}

						var71.field112 = var62 * 128 + var78 * 64;
						var71.field114 = var63 * 128 + var79 * 64;
						var71.field113 = method129(var71.field112, var71.field114, field165);

						if (var60 > var59) {
							byte var80 = var60;
							var60 = var59;
							var59 = var80;
						}

						if (var69 > var57) {
							byte var81 = var69;
							var69 = var57;
							var57 = var81;
						}

						var71.field104 = var60 + var62;
						var71.field106 = var59 + var62;
						var71.field105 = var63 + var69;
						var71.field107 = var57 + var63;
					}
				}
			}

			if (arg0 == 164) {
				int var82 = arg1.method244();
				int var83 = (var82 >> 4 & 0x7) + field436;
				int var84 = (var82 & 0x7) + field437;
				int var85 = arg1.method224();
				int var86 = var85 >> 2;
				int var87 = var85 & 0x3;
				int var88 = field272[var86];
				if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
					method82(var84, var83, field165, var88, -1, var87, -1, 0, var86);
				}
			} else if (arg0 == 250) {
				int var89 = arg1.method224();
				int var90 = (var89 >> 4 & 0x7) + field436;
				int var91 = (var89 & 0x7) + field437;
				int var92 = arg1.method253();
				int var93 = arg1.method254();
				if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
					VQCXWNRE var94 = new VQCXWNRE();
					var94.field1264 = var92;
					var94.field1265 = var93;

					if (field362[field165][var90][var91] == null) {
						field362[field165][var90][var91] = new FLJWGVEY();
					}

					field362[field165][var90][var91].method272(var94);
					method133(var90, var91);
				}
			} else {
				if (arg0 == 40) {
					int var95 = arg1.method224();
					int var96 = (var95 >> 4 & 0x7) + field436;
					int var97 = (var95 & 0x7) + field437;
					int var98 = arg1.method226();
					int var99 = arg1.method224();
					int var100 = var99 >> 4 & 0xF;
					int var101 = var99 & 0x7;
					if (field264.field34[0] >= var96 - var100 && field264.field34[0] <= var96 + var100 && field264.field35[0] >= var97 - var100 && field264.field35[0] <= var97 + var100 && field252 && !field215 && field554 < 50) {
						field501[field554] = var98;
						field268[field554] = var101;
						field241[field554] = GTYZUNUD.field730[var98];
						field554++;
					}
				}

				if (arg0 == 65) {
					int var102 = arg1.method224();
					int var103 = (var102 >> 4 & 0x7) + field436;
					int var104 = (var102 & 0x7) + field437;
					int var105 = arg1.method253();
					int var106 = arg1.method226();
					int var107 = arg1.method226();
					if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && field502 != var106) {
						VQCXWNRE var108 = new VQCXWNRE();
						var108.field1264 = var107;
						var108.field1265 = var105;

						if (field362[field165][var103][var104] == null) {
							field362[field165][var103][var104] = new FLJWGVEY();
						}

						field362[field165][var103][var104].method272(var108);
						method133(var103, var104);
					}
				} else if (arg0 == 175) {
					int var109 = arg1.method224();
					int var110 = (var109 >> 4 & 0x7) + field436;
					int var111 = (var109 & 0x7) + field437;
					int var112 = arg1.method226();
					int var113 = arg1.method224();
					int var114 = arg1.method226();
					if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
						var110 = var110 * 128 + 64;
						var111 = var111 * 128 + 64;
						YHTUMUXE var115 = new YHTUMUXE(var111, method129(var110, var111, field165) - var113, var112, field499, field165, var114, var110);
						field273.method272(var115);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method132(int arg0) {
		int var2 = ISZVQSTL.field843[arg0].field851;
		if (var2 != 0) {
			int var3 = field580[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					GBZDHVLZ.method289(0.9D);
				}

				if (var3 == 2) {
					GBZDHVLZ.method289(0.8D);
				}

				if (var3 == 3) {
					GBZDHVLZ.method289(0.7D);
				}

				if (var3 == 4) {
					GBZDHVLZ.method289(0.6D);
				}

				XLZQSPZS.field1327.method199();
				field356 = true;
			}

			if (var2 == 3) {
				boolean var4 = field336;

				if (var3 == 0) {
					method63(field336, 0);
					field336 = true;
				}

				if (var3 == 1) {
					method63(field336, -400);
					field336 = true;
				}

				if (var3 == 2) {
					method63(field336, -800);
					field336 = true;
				}

				if (var3 == 3) {
					method63(field336, -1200);
					field336 = true;
				}

				if (var3 == 4) {
					field336 = false;
				}

				if (field336 != var4 && !field215) {
					if (field336) {
						field406 = field201;
						field407 = true;
						field543.method585(2, field406);
					} else {
						method180();
					}

					field471 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field252 = true;
					method156(0);
				}

				if (var3 == 1) {
					field252 = true;
					method156(-400);
				}

				if (var3 == 2) {
					field252 = true;
					method156(-800);
				}

				if (var3 == 3) {
					field252 = true;
					method156(-1200);
				}

				if (var3 == 4) {
					field252 = false;
				}
			}

			if (var2 == 5) {
				field167 = var3;
			}

			if (var2 == 6) {
				field561 = var3;
			}

			if (var2 == 8) {
				field220 = var3;
				field579 = true;
			}

			if (var2 == 9) {
				field366 = var3;
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method133(int arg0, int arg1) {
		FLJWGVEY var3 = field362[field165][arg0][arg1];
		if (var3 == null) {
			field363.method549(field165, arg0, arg1);
		} else {
			int var4 = -99999999;
			VQCXWNRE var5 = null;
			for (VQCXWNRE var6 = (VQCXWNRE) var3.method275(); var6 != null; var6 = (VQCXWNRE) var3.method277()) {
				XLZQSPZS var7 = XLZQSPZS.method526(var6.field1264);
				int var8 = var7.field1316;
				if (var7.field1331) {
					var8 = (var6.field1265 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method273(var5);
			VQCXWNRE var9 = null;
			VQCXWNRE var10 = null;
			for (VQCXWNRE var11 = (VQCXWNRE) var3.method275(); var11 != null; var11 = (VQCXWNRE) var3.method277()) {
				if (var5.field1264 != var11.field1264 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1264 != var11.field1264 && var9.field1264 != var11.field1264 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field363.method535(var10, field165, method129(arg0 * 128 + 64, arg1 * 128 + 64, field165), arg1, arg0, var9, var5, var12);
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method134() {
		int var1 = 5;
		field271[8] = 0;
		int var2 = 0;
		while (field271[8] == 0) {
			String var3 = "Unknown problem";
			method24("Connecting to web server", 20);

			try {
				DataInputStream var4 = method121("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 349);
				EILHLJCE var5 = new EILHLJCE(new byte[40]);
				var4.readFully(var5.field683, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field271[var6] = var5.method229();
				}

				int var7 = var5.method229();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field271[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field271[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field271[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field271[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field271[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field271[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method24("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method24(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field460 = !field460;
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method135() {
		field517++;
		if (field517 > 179) {
			field517 = 0;
			field560.method213(193);
			field560.method218(0);
		}

		for (int var1 = 0; var1 < field210; var1++) {
			int var2 = field211[var1];
			ONCZAQCQ var3 = field209[var2];
			if (var3 != null) {
				method136(var3, var3.field1059.field987);
			}
		}
	}

	@ObfuscatedName("client.a(LAPSQOGBV;II)V")
	public final void method136(APSQOGBV arg0, int arg1) {
		if (arg0.field62 < 128 || arg0.field63 < 128 || arg0.field62 >= 13184 || arg0.field63 >= 13184) {
			arg0.field44 = -1;
			arg0.field24 = -1;
			arg0.field57 = 0;
			arg0.field58 = 0;
			arg0.field62 = arg0.field34[0] * 128 + arg0.field51 * 64;
			arg0.field63 = arg0.field35[0] * 128 + arg0.field51 * 64;
			arg0.method7();
		}

		if (field264 == arg0 && (arg0.field62 < 1536 || arg0.field63 < 1536 || arg0.field62 >= 11776 || arg0.field63 >= 11776)) {
			arg0.field44 = -1;
			arg0.field24 = -1;
			arg0.field57 = 0;
			arg0.field58 = 0;
			arg0.field62 = arg0.field34[0] * 128 + arg0.field51 * 64;
			arg0.field63 = arg0.field35[0] * 128 + arg0.field51 * 64;
			arg0.method7();
		}

		if (arg0.field57 > field499) {
			method137(arg0);
		} else if (arg0.field58 >= field499) {
			method138(arg0);
		} else {
			method139(arg0);
		}

		method140(arg0);
		method141(arg0);
	}

	@ObfuscatedName("client.a(ZLAPSQOGBV;)V")
	public final void method137(APSQOGBV arg0) {
		int var2 = arg0.field57 - field499;
		int var3 = arg0.field53 * 128 + arg0.field51 * 64;
		int var4 = arg0.field55 * 128 + arg0.field51 * 64;
		arg0.field62 += (var3 - arg0.field62) / var2;
		arg0.field63 += (var4 - arg0.field63) / var2;
		arg0.field17 = 0;

		if (arg0.field59 == 0) {
			arg0.field61 = 1024;
		}

		if (arg0.field59 == 1) {
			arg0.field61 = 1536;
		}

		if (arg0.field59 == 2) {
			arg0.field61 = 0;
		}

		if (arg0.field59 == 3) {
			arg0.field61 = 512;
		}
	}

	@ObfuscatedName("client.a(LAPSQOGBV;B)V")
	public final void method138(APSQOGBV arg0) {
		if (field499 == arg0.field58 || arg0.field44 == -1 || arg0.field47 != 0 || arg0.field46 + 1 > ODMBIHRM.field1035[arg0.field44].method413(arg0.field45)) {
			int var2 = arg0.field58 - arg0.field57;
			int var3 = field499 - arg0.field57;
			int var4 = arg0.field53 * 128 + arg0.field51 * 64;
			int var5 = arg0.field55 * 128 + arg0.field51 * 64;
			int var6 = arg0.field54 * 128 + arg0.field51 * 64;
			int var7 = arg0.field56 * 128 + arg0.field51 * 64;
			arg0.field62 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field63 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field17 = 0;

		if (arg0.field59 == 0) {
			arg0.field61 = 1024;
		}

		if (arg0.field59 == 1) {
			arg0.field61 = 1536;
		}

		if (arg0.field59 == 2) {
			arg0.field61 = 0;
		}

		if (arg0.field59 == 3) {
			arg0.field61 = 512;
		}

		arg0.field64 = arg0.field61;
	}

	@ObfuscatedName("client.a(ILAPSQOGBV;)V")
	public final void method139(APSQOGBV arg0) {
		arg0.field40 = arg0.field65;
		if (arg0.field15 == 0) {
			arg0.field17 = 0;
		} else {
			if (arg0.field44 != -1 && arg0.field47 == 0) {
				ODMBIHRM var2 = ODMBIHRM.field1035[arg0.field44];
				if (arg0.field60 > 0 && var2.field1047 == 0) {
					arg0.field17++;
					return;
				}

				if (arg0.field60 <= 0 && var2.field1048 == 0) {
					arg0.field17++;
					return;
				}
			}

			int var3 = arg0.field62;
			int var4 = arg0.field63;
			int var5 = arg0.field34[arg0.field15 - 1] * 128 + arg0.field51 * 64;
			int var6 = arg0.field35[arg0.field15 - 1] * 128 + arg0.field51 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field61 = 1280;
					} else if (var4 > var6) {
						arg0.field61 = 1792;
					} else {
						arg0.field61 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field61 = 768;
					} else if (var4 > var6) {
						arg0.field61 = 256;
					} else {
						arg0.field61 = 512;
					}
				} else if (var4 < var6) {
					arg0.field61 = 1024;
				} else {
					arg0.field61 = 0;
				}

				int var7 = arg0.field61 - arg0.field64 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field19;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field18;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field21;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field20;
				}

				if (var8 == -1) {
					var8 = arg0.field18;
				}

				arg0.field40 = var8;
				int var9 = 4;
				if (arg0.field64 != arg0.field61 && arg0.field49 == -1 && arg0.field37 != 0) {
					var9 = 2;
				}

				if (arg0.field15 > 2) {
					var9 = 6;
				}

				if (arg0.field15 > 3) {
					var9 = 8;
				}

				if (arg0.field17 > 0 && arg0.field15 > 1) {
					var9 = 8;
					arg0.field17--;
				}

				if (arg0.field50[arg0.field15 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field40 == arg0.field18 && arg0.field16 != -1) {
					arg0.field40 = arg0.field16;
				}

				if (var3 < var5) {
					arg0.field62 += var9;
					if (arg0.field62 > var5) {
						arg0.field62 = var5;
					}
				} else if (var3 > var5) {
					arg0.field62 -= var9;
					if (arg0.field62 < var5) {
						arg0.field62 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field63 += var9;
					if (arg0.field63 > var6) {
						arg0.field63 = var6;
					}
				} else if (var4 > var6) {
					arg0.field63 -= var9;
					if (arg0.field63 < var6) {
						arg0.field63 = var6;
					}
				}

				if (arg0.field62 == var5 && arg0.field63 == var6) {
					arg0.field15--;

					if (arg0.field60 > 0) {
						arg0.field60--;
						return;
					}
				}
			} else {
				arg0.field62 = var5;
				arg0.field63 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(ZLAPSQOGBV;)V")
	public final void method140(APSQOGBV arg0) {
		if (arg0.field37 != 0) {
			if (arg0.field49 != -1 && arg0.field49 < 32768) {
				ONCZAQCQ var2 = field209[arg0.field49];
				if (var2 != null) {
					int var3 = arg0.field62 - var2.field62;
					int var4 = arg0.field63 - var2.field63;
					if (var3 != 0 || var4 != 0) {
						arg0.field61 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field49 >= 32768) {
				int var5 = arg0.field49 - 32768;
				if (field502 == var5) {
					var5 = field508;
				}

				AWOZVMFS var6 = field509[var5];
				if (var6 != null) {
					int var7 = arg0.field62 - var6.field62;
					int var8 = arg0.field63 - var6.field63;
					if (var7 != 0 || var8 != 0) {
						arg0.field61 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field38 != 0 || arg0.field39 != 0) && (arg0.field15 == 0 || arg0.field17 > 0)) {
				int var9 = arg0.field62 - (arg0.field38 - field548 - field548) * 64;
				int var10 = arg0.field63 - (arg0.field39 - field549 - field549) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field61 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field38 = 0;
				arg0.field39 = 0;
			}

			int var11 = arg0.field61 - arg0.field64 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field37 || var11 > 2048 - arg0.field37) {
					arg0.field64 = arg0.field61;
				} else if (var11 > 1024) {
					arg0.field64 -= arg0.field37;
				} else {
					arg0.field64 += arg0.field37;
				}

				arg0.field64 &= 0x7FF;
				if (arg0.field65 == arg0.field40 && arg0.field64 != arg0.field61) {
					if (arg0.field66 != -1) {
						arg0.field40 = arg0.field66;
						return;
					}

					arg0.field40 = arg0.field18;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLAPSQOGBV;)V")
	public final void method141(APSQOGBV arg0) {
		arg0.field36 = false;

		if (arg0.field40 != -1) {
			ODMBIHRM var2 = ODMBIHRM.field1035[arg0.field40];
			arg0.field42++;
			if (arg0.field41 < var2.field1036 && arg0.field42 > var2.method413(arg0.field41)) {
				arg0.field42 = 0;
				arg0.field41++;
			}

			if (arg0.field41 >= var2.field1036) {
				arg0.field42 = 0;
				arg0.field41 = 0;
			}
		}

		if (arg0.field24 != -1 && field499 >= arg0.field27) {
			if (arg0.field25 < 0) {
				arg0.field25 = 0;
			}

			ODMBIHRM var3 = TGIKVGNH.field1194[arg0.field24].field1198;
			arg0.field26++;
			while (arg0.field25 < var3.field1036 && arg0.field26 > var3.method413(arg0.field25)) {
				arg0.field26 -= var3.method413(arg0.field25);
				arg0.field25++;
			}

			if (arg0.field25 >= var3.field1036 && (arg0.field25 < 0 || arg0.field25 >= var3.field1036)) {
				arg0.field24 = -1;
			}
		}

		if (arg0.field44 != -1 && arg0.field47 <= 1) {
			ODMBIHRM var4 = ODMBIHRM.field1035[arg0.field44];
			if (var4.field1047 == 1 && arg0.field60 > 0 && arg0.field57 <= field499 && arg0.field58 < field499) {
				arg0.field47 = 1;
				return;
			}
		}

		if (arg0.field44 != -1 && arg0.field47 == 0) {
			ODMBIHRM var5 = ODMBIHRM.field1035[arg0.field44];
			arg0.field46++;
			while (arg0.field45 < var5.field1036 && arg0.field46 > var5.method413(arg0.field45)) {
				arg0.field46 -= var5.method413(arg0.field45);
				arg0.field45++;
			}

			if (arg0.field45 >= var5.field1036) {
				arg0.field45 -= var5.field1040;
				arg0.field48++;
				if (arg0.field48 >= var5.field1046) {
					arg0.field44 = -1;
				}

				if (arg0.field45 < 0 || arg0.field45 >= var5.field1036) {
					arg0.field44 = -1;
				}
			}

			arg0.field36 = var5.field1042;
		}

		if (arg0.field47 > 0) {
			arg0.field47--;
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method142() {
		if (field568 == -1 || field164 != 2 && field76 == null) {
			if (field356) {
				method105();
				field356 = false;
				field187.method464(4, field75, 0);
				field188.method464(357, field75, 0);
				field189.method464(4, field75, 722);
				field190.method464(205, field75, 743);
				field191.method464(0, field75, 0);
				field192.method464(4, field75, 516);
				field193.method464(205, field75, 516);
				field194.method464(357, field75, 496);
				field195.method464(338, field75, 0);
				field488 = true;
				field579 = true;
				field238 = true;
				field426 = true;

				if (field164 != 2) {
					field442.method464(4, field75, 4);
					field441.method464(4, field75, 550);
				}

				field344++;
				if (field344 > 131) {
					field344 = 0;
					field560.method213(84);
					field560.method218(0);
				}
			}

			if (field164 == 2) {
				method94();
			}

			if (field349 && field277 == 1) {
				field488 = true;
			}

			if (field468 != -1) {
				boolean var3 = method52(field468, field401);
				if (var3) {
					field488 = true;
				}
			}

			if (field454 == 2) {
				field488 = true;
			}

			if (field525 == 2) {
				field488 = true;
			}

			if (field488) {
				method170();
				field488 = false;
			}

			if (field450 == -1) {
				field331.field810 = field337 - field316 - 77;

				if (field83 > 448 && field83 < 560 && field84 > 332) {
					method62(field331, -1, field337, field83 - 17, 463, field84 - 357, 77, 0);
				}

				int var4 = field337 - field331.field810 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field337 - 77) {
					var4 = field337 - 77;
				}

				if (field316 != var4) {
					field316 = var4;
					field579 = true;
				}
			}

			if (field450 != -1) {
				boolean var5 = method52(field450, field401);
				if (var5) {
					field579 = true;
				}
			}

			if (field454 == 3) {
				field579 = true;
			}

			if (field525 == 3) {
				field579 = true;
			}

			if (field285 != null) {
				field579 = true;
			}

			if (field349 && field277 == 2) {
				field579 = true;
			}

			if (field579) {
				method176();
				field579 = false;
			}

			if (field164 == 2) {
				method48();
				field441.method464(4, field75, 550);
			}

			if (field480 != -1) {
				field238 = true;
			}

			if (field238) {
				if (field480 != -1 && field480 == field324) {
					field480 = -1;
					field560.method213(225);
					field560.method214(field324);
				}

				field238 = false;
				field284.method463();
				field429.method270(0, 0);

				if (field468 == -1) {
					if (field516[field324] != -1) {
						if (field324 == 0) {
							field482.method270(22, 10);
						}

						if (field324 == 1) {
							field483.method270(54, 8);
						}

						if (field324 == 2) {
							field483.method270(82, 8);
						}

						if (field324 == 3) {
							field484.method270(110, 8);
						}

						if (field324 == 4) {
							field486.method270(153, 8);
						}

						if (field324 == 5) {
							field486.method270(181, 8);
						}

						if (field324 == 6) {
							field485.method270(209, 9);
						}
					}

					if (field516[0] != -1 && (field480 != 0 || field499 % 20 < 10)) {
						field447[0].method270(29, 13);
					}

					if (field516[1] != -1 && (field480 != 1 || field499 % 20 < 10)) {
						field447[1].method270(53, 11);
					}

					if (field516[2] != -1 && (field480 != 2 || field499 % 20 < 10)) {
						field447[2].method270(82, 11);
					}

					if (field516[3] != -1 && (field480 != 3 || field499 % 20 < 10)) {
						field447[3].method270(115, 12);
					}

					if (field516[4] != -1 && (field480 != 4 || field499 % 20 < 10)) {
						field447[4].method270(153, 13);
					}

					if (field516[5] != -1 && (field480 != 5 || field499 % 20 < 10)) {
						field447[5].method270(180, 11);
					}

					if (field516[6] != -1 && (field480 != 6 || field499 % 20 < 10)) {
						field447[6].method270(208, 13);
					}
				}

				field284.method464(160, field75, 516);
				field283.method463();
				field428.method270(0, 0);

				if (field468 == -1) {
					if (field516[field324] != -1) {
						if (field324 == 7) {
							field373.method270(42, 0);
						}

						if (field324 == 8) {
							field374.method270(74, 0);
						}

						if (field324 == 9) {
							field374.method270(102, 0);
						}

						if (field324 == 10) {
							field375.method270(130, 1);
						}

						if (field324 == 11) {
							field377.method270(173, 0);
						}

						if (field324 == 12) {
							field377.method270(201, 0);
						}

						if (field324 == 13) {
							field376.method270(229, 0);
						}
					}

					if (field516[8] != -1 && (field480 != 8 || field499 % 20 < 10)) {
						field447[7].method270(74, 2);
					}

					if (field516[9] != -1 && (field480 != 9 || field499 % 20 < 10)) {
						field447[8].method270(102, 3);
					}

					if (field516[10] != -1 && (field480 != 10 || field499 % 20 < 10)) {
						field447[9].method270(137, 4);
					}

					if (field516[11] != -1 && (field480 != 11 || field499 % 20 < 10)) {
						field447[10].method270(174, 2);
					}

					if (field516[12] != -1 && (field480 != 12 || field499 % 20 < 10)) {
						field447[11].method270(201, 2);
					}

					if (field516[13] != -1 && (field480 != 13 || field499 % 20 < 10)) {
						field447[12].method270(226, 2);
					}
				}

				field283.method464(466, field75, 496);
				field442.method463();
				GBZDHVLZ.field717 = field384;
			}

			if (field426) {
				field426 = false;
				field282.method463();
				field427.method270(0, 0);
				field379.method374(55, "Public chat", 28, true, 0xFFFFFF);

				if (field449 == 0) {
					field379.method374(55, "On", 41, true, 0xFF00);
				}

				if (field449 == 1) {
					field379.method374(55, "Friends", 41, true, 0xFFFF00);
				}

				if (field449 == 2) {
					field379.method374(55, "Off", 41, true, 0xFF0000);
				}

				if (field449 == 3) {
					field379.method374(55, "Hide", 41, true, 0xFFFF);
				}

				field379.method374(184, "Private chat", 28, true, 0xFFFFFF);

				if (field315 == 0) {
					field379.method374(184, "On", 41, true, 0xFF00);
				}

				if (field315 == 1) {
					field379.method374(184, "Friends", 41, true, 0xFFFF00);
				}

				if (field315 == 2) {
					field379.method374(184, "Off", 41, true, 0xFF0000);
				}

				field379.method374(324, "Trade/compete", 28, true, 0xFFFFFF);

				if (field343 == 0) {
					field379.method374(324, "On", 41, true, 0xFF00);
				}

				if (field343 == 1) {
					field379.method374(324, "Friends", 41, true, 0xFFFF00);
				}

				if (field343 == 2) {
					field379.method374(324, "Off", 41, true, 0xFF0000);
				}

				field379.method374(458, "Report abuse", 33, true, 0xFFFFFF);
				field282.method464(453, field75, 0);
				field442.method463();
				GBZDHVLZ.field717 = field384;
			}

			field401 = 0;
		} else {
			if (field164 == 2) {
				method52(field568, field401);

				if (field246 != -1) {
					method52(field246, field401);
				}

				field401 = 0;
				method116();
				field76.method463();
				GBZDHVLZ.field717 = field385;
				IFHRXNFO.method313();
				field356 = true;
				IRYXZZFE var1 = IRYXZZFE.method329(field568);
				if (var1.field814 == 512 && var1.field792 == 334 && var1.field804 == 0) {
					var1.field814 = 765;
					var1.field792 = 503;
				}

				method157(var1, 0, 0, 0);

				if (field246 != -1) {
					IRYXZZFE var2 = IRYXZZFE.method329(field246);
					if (var2.field814 == 512 && var2.field792 == 334 && var2.field804 == 0) {
						var2.field814 = 765;
						var2.field792 = 503;
					}

					method157(var2, 0, 0, 0);
				}

				if (field349) {
					method49();
				} else {
					method158();
					method119();
				}
			}

			field76.method464(0, field75, 0);
		}
	}

	@ObfuscatedName("client.c(IILEILHLJCE;)V")
	public final void method143(int arg0, EILHLJCE arg1) {
		for (int var3 = 0; var3 < field512; var3++) {
			int var4 = field513[var3];
			ONCZAQCQ var5 = field209[var4];
			int var6 = arg1.method224();
			if ((var6 & 0x40) != 0) {
				var5.field43 = arg1.method231();
				var5.field23 = 100;
			}

			if ((var6 & 0x20) != 0) {
				var5.field38 = arg1.method252();
				var5.field39 = arg1.method226();
			}

			if ((var6 & 0x1) != 0) {
				int var7 = arg1.method244();
				int var8 = arg1.method244();
				var5.method9(field499, var8, var7);
				var5.field12 = field499 + 300;
				var5.field13 = arg1.method244();
				var5.field14 = arg1.method243();
			}

			if ((var6 & 0x2) != 0) {
				int var9 = arg1.method244();
				int var10 = arg1.method243();
				var5.method9(field499, var10, var9);
				var5.field12 = field499 + 300;
				var5.field13 = arg1.method245();
				var5.field14 = arg1.method224();
			}

			if ((var6 & 0x80) != 0) {
				var5.field24 = arg1.method253();
				int var11 = arg1.method260();
				var5.field28 = var11 >> 16;
				var5.field27 = (var11 & 0xFFFF) + field499;
				var5.field25 = 0;
				var5.field26 = 0;

				if (var5.field27 > field499) {
					var5.field25 = -1;
				}

				if (var5.field24 == 0xFFFF) {
					var5.field24 = -1;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field1059 = NPWLDXJE.method393(arg1.method254());
				var5.field51 = var5.field1059.field987;
				var5.field37 = var5.field1059.field999;
				var5.field18 = var5.field1059.field1010;
				var5.field19 = var5.field1059.field995;
				var5.field20 = var5.field1059.field983;
				var5.field21 = var5.field1059.field1008;
				var5.field65 = var5.field1059.field1000;
			}

			if ((var6 & 0x4) != 0) {
				var5.field49 = arg1.method253();
				if (var5.field49 == 0xFFFF) {
					var5.field49 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				int var12 = arg1.method252();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg1.method244();
				if (var5.field44 == var12 && var12 != -1) {
					int var14 = ODMBIHRM.field1035[var12].field1049;
					if (var14 == 1) {
						var5.field45 = 0;
						var5.field46 = 0;
						var5.field47 = var13;
						var5.field48 = 0;
					}

					if (var14 == 2) {
						var5.field48 = 0;
					}
				} else if (var12 == -1 || var5.field44 == -1 || ODMBIHRM.field1035[var12].field1043 >= ODMBIHRM.field1035[var5.field44].field1043) {
					var5.field44 = var12;
					var5.field45 = 0;
					var5.field46 = 0;
					var5.field47 = var13;
					var5.field48 = 0;
					var5.field60 = var5.field15;
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method144() {
		for (int var1 = -1; var1 < field510; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field508;
			} else {
				var2 = field511[var1];
			}

			AWOZVMFS var3 = field509[var2];
			if (var3 != null && var3.field23 > 0) {
				var3.field23--;
				if (var3.field23 == 0) {
					var3.field43 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field210; var4++) {
			int var5 = field211[var4];
			ONCZAQCQ var6 = field209[var5];
			if (var6 != null && var6.field23 > 0) {
				var6.field23--;
				if (var6.field23 == 0) {
					var6.field43 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method145() {
		try {
			field229 = -1;
			field273.method279();
			field236.method279();
			GBZDHVLZ.method283();
			method76();
			field363.method528();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field342[var1].method200();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field216[var2][var3][var4] = 0;
					}
				}
			}

			OZIFXWPH var5 = new OZIFXWPH(field559, 104, field216, 104);
			int var6 = field372.length;
			field560.method213(58);

			if (!field458) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field174[var7] >> 8) * 64 - field548;
					int var9 = (field174[var7] & 0xFF) * 64 - field549;
					byte[] var10 = field372[var7];
					if (var10 != null) {
						var5.method435(var9, var10, (field424 - 6) * 8, field342, (field425 - 6) * 8, var8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field174[var11] >> 8) * 64 - field548;
					int var13 = (field174[var11] & 0xFF) * 64 - field549;
					byte[] var14 = field372[var11];
					if (var14 == null && field425 < 800) {
						var5.method423(var13, 64, 64, var12);
					}
				}

				field560.method213(58);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field270[var15];
					if (var16 != null) {
						int var17 = (field174[var15] >> 8) * 64 - field548;
						int var18 = (field174[var15] & 0xFF) * 64 - field549;
						var5.method428(var17, var18, var16, field363, field342);
					}
				}
			}

			if (field458) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field446[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field174.length; var28++) {
									if (field174[var28] == var27 && field372[var28] != null) {
										var5.method434(var23, (var25 & 0x7) * 8, var24, var19, field342, (var26 & 0x7) * 8, field372[var28], var20 * 8, var21 * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field446[0][var29][var30];
						if (var31 == -1) {
							var5.method423(var30 * 8, 8, 8, var29 * 8);
						}
					}
				}

				field560.method213(58);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field446[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field174.length; var41++) {
									if (field174[var41] == var40 && field270[var41] != null) {
										var5.method426(var33 * 8, var32, var36, field363, (var39 & 0x7) * 8, (var38 & 0x7) * 8, field270[var41], field342, var34 * 8, var37);
										break;
									}
								}
							}
						}
					}
				}
			}

			field560.method213(58);
			var5.method430(field342, field363);

			if (field442 != null) {
				field442.method463();
				GBZDHVLZ.field717 = field384;
			}

			field560.method213(58);
			int var42 = OZIFXWPH.field1080;
			if (var42 > field165) {
				var42 = field165;
			}

			if (var42 < field165 - 1) {
				int var43 = field165 - 1;
			}

			if (field215) {
				field363.method529(OZIFXWPH.field1080);
			} else {
				field363.method529(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method133(var44, var45);
				}
			}

			method118();
		} catch (Exception var58) {
		}

		DQLJXYPC.field668.method199();

		if (field78 != null) {
			field560.method213(173);
			field560.method218(1057001181);
		}

		if (field215 && signlink.cache_dat != null) {
			int var47 = field543.method588(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field543.method592(var48);
				if ((var49 & 0x79) == 0) {
					KBEXSZSN.method338(var48);
				}
			}
		}

		System.gc();
		GBZDHVLZ.method284(20);
		field543.method600();
		int var50 = (field424 - 6) / 8 - 1;
		int var51 = (field424 + 6) / 8 + 1;
		int var52 = (field425 - 6) / 8 - 1;
		int var53 = (field425 + 6) / 8 + 1;
		if (field565) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field543.method601(var55, var54, 0);
					if (var56 != -1) {
						field543.method598(var56, 3);
					}

					int var57 = field543.method601(var55, var54, 1);
					if (var57 != -1) {
						field543.method598(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method146(int arg0) {
		IRYXZZFE.method324(arg0);
	}

	@ObfuscatedName("client.J(I)V")
	public final void method147() {
		field412 = 0;
		for (int var1 = -1; var1 < field510 + field210; var1++) {
			APSQOGBV var2;
			if (var1 == -1) {
				var2 = field264;
			} else if (var1 < field510) {
				var2 = field509[field511[var1]];
			} else {
				var2 = field209[field211[var1 - field510]];
			}

			if (var2 != null && var2.method10()) {
				if (var2 instanceof ONCZAQCQ) {
					NPWLDXJE var3 = ((ONCZAQCQ) var2).field1059;
					if (var3.field979 != null) {
						var3 = var3.method389();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field510) {
					NPWLDXJE var6 = ((ONCZAQCQ) var2).field1059;
					if (var6.field997 >= 0 && var6.field997 < field325.length) {
						method102(var2.field33 + 15, var2);

						if (field347 > -1) {
							field325[var6.field997].method404(field347 - 12, field348 - 30);
						}
					}

					if (field251 == 1 && field211[var1 - field510] == field515 && field499 % 20 < 10) {
						method102(var2.field33 + 15, var2);

						if (field347 > -1) {
							field311[0].method404(field347 - 12, field348 - 28);
						}
					}
				} else {
					int var4 = 30;
					AWOZVMFS var5 = (AWOZVMFS) var2;
					if (var5.field122 != -1 || var5.field99 != -1) {
						method102(var2.field33 + 15, var2);

						if (field347 > -1) {
							if (var5.field122 != -1) {
								field266[var5.field122].method404(field347 - 12, field348 - var4);
								var4 += 25;
							}

							if (var5.field99 != -1) {
								field325[var5.field99].method404(field347 - 12, field348 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field251 == 10 && field511[var1] == field222) {
						method102(var2.field33 + 15, var2);

						if (field347 > -1) {
							field311[1].method404(field347 - 12, field348 - var4);
						}
					}
				}

				if (var2.field43 != null && (var1 >= field510 || field449 == 0 || field449 == 3 || field449 == 1 && method179(((AWOZVMFS) var2).field117))) {
					method102(var2.field33, var2);

					if (field347 > -1 && field412 < field413) {
						field417[field412] = field380.method376(var2.field43) / 2;
						field416[field412] = field380.field964;
						field414[field412] = field347;
						field415[field412] = field348;
						field418[field412] = var2.field52;
						field419[field412] = var2.field22;
						field420[field412] = var2.field23;
						field421[field412++] = var2.field43;

						if (field561 == 0 && var2.field22 >= 1 && var2.field22 <= 3) {
							field416[field412] += 10;
							field415[field412] += 5;
						}

						if (field561 == 0 && var2.field22 == 4) {
							field417[field412] = 60;
						}

						if (field561 == 0 && var2.field22 == 5) {
							field416[field412] += 5;
						}
					}
				}

				if (var2.field12 > field499) {
					method102(var2.field33 + 15, var2);

					if (field347 > -1) {
						int var7 = var2.field13 * 30 / var2.field14;
						if (var7 > 30) {
							var7 = 30;
						}

						IFHRXNFO.method315(0xFF00, field347 - 15, var7, 5, field348 - 3);
						IFHRXNFO.method315(0xFF0000, field347 + var7 - 15, 30 - var7, 5, field348 - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field32[var8] > field499) {
						method102(var2.field33 / 2, var2);

						if (field347 > -1) {
							if (var8 == 1) {
								field348 -= 20;
							}

							if (var8 == 2) {
								field347 -= 15;
								field348 -= 10;
							}

							if (var8 == 3) {
								field347 += 15;
								field348 -= 10;
							}

							field582[var2.field31[var8]].method404(field347 - 12, field348 - 12);
							field378.method373(0, String.valueOf(var2.field30[var8]), field347, field348 + 4);
							field378.method373(0xFFFFFF, String.valueOf(var2.field30[var8]), field347 - 1, field348 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field412; var9++) {
			int var10 = field414[var9];
			int var11 = field415[var9];
			int var12 = field417[var9];
			int var13 = field416[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field415[var15] - field416[var15] && var11 - var13 < field415[var15] + 2 && var10 - var12 < field417[var15] + field414[var15] && var10 + var12 > field414[var15] - field417[var15] && field415[var15] - field416[var15] < var11) {
						var11 = field415[var15] - field416[var15];
						var14 = true;
					}
				}
			}

			field347 = field414[var9];
			field348 = field415[var9] = var11;
			String var16 = field421[var9];
			if (field561 == 0) {
				int var17 = 0xFFFF00;
				if (field418[var9] < 6) {
					var17 = field350[field418[var9]];
				}

				if (field418[var9] == 6) {
					var17 = field262 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field418[var9] == 7) {
					var17 = field262 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field418[var9] == 8) {
					var17 = field262 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field418[var9] == 9) {
					int var18 = 150 - field420[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field418[var9] == 10) {
					int var19 = 150 - field420[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field418[var9] == 11) {
					int var20 = 150 - field420[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field419[var9] == 0) {
					field380.method373(0, var16, field347, field348 + 1);
					field380.method373(var17, var16, field347, field348);
				}

				if (field419[var9] == 1) {
					field380.method378(field348 + 1, field347, field262, 0, var16);
					field380.method378(field348, field347, field262, var17, var16);
				}

				if (field419[var9] == 2) {
					field380.method379(field348 + 1, field347, 0, var16, field262);
					field380.method379(field348, field347, var17, var16, field262);
				}

				if (field419[var9] == 3) {
					field380.method380(150 - field420[var9], var16, field348 + 1, 0, field347, field262);
					field380.method380(150 - field420[var9], var16, field348, var17, field347, field262);
				}

				if (field419[var9] == 4) {
					int var21 = field380.method376(var16);
					int var22 = (150 - field420[var9]) * (var21 + 100) / 150;
					IFHRXNFO.method312(field347 + 50, 334, field347 - 50, 0);
					field380.method377(var16, field348 + 1, field347 + 50 - var22, 0);
					field380.method377(var16, field348, field347 + 50 - var22, var17);
					IFHRXNFO.method311();
				}

				if (field419[var9] == 5) {
					int var23 = 150 - field420[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					IFHRXNFO.method312(512, field348 + 5, 0, field348 - field380.field964 - 1);
					field380.method373(0, var16, field347, field348 + var24 + 1);
					field380.method373(var17, var16, field347, field348 + var24);
					IFHRXNFO.method311();
				}
			} else {
				field380.method373(0, var16, field347, field348 + 1);
				field380.method373(0xFFFF00, var16, field347, field348);
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method21() {
		field356 = true;
	}

	@ObfuscatedName("client.K(I)V")
	public final void method148() {
		if (field492 == 0 && field573 == 0) {
			field245[field368] = "Walk here";
			field309[field368] = 16;
			field307[field368] = field83;
			field308[field368] = field84;
			field368++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < KBEXSZSN.field933; var2++) {
			int var3 = KBEXSZSN.field934[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field363.method558(field165, var4, var5, var3) >= 0) {
					DQLJXYPC var8 = DQLJXYPC.method192(var7);
					if (var8.field659 != null) {
						var8 = var8.method194();
					}

					if (var8 == null) {
						continue;
					}

					if (field492 == 1) {
						field245[field368] = "Use " + field496 + " with @cya@" + var8.field662;
						field309[field368] = 419;
						field310[field368] = var3;
						field307[field368] = var4;
						field308[field368] = var5;
						field368++;
					} else if (field573 != 1) {
						if (var8.field651 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field651[var9] != null) {
									field245[field368] = var8.field651[var9] + " @cya@" + var8.field662;

									if (var9 == 0) {
										field309[field368] = 588;
									}

									if (var9 == 1) {
										field309[field368] = 256;
									}

									if (var9 == 2) {
										field309[field368] = 766;
									}

									if (var9 == 3) {
										field309[field368] = 985;
									}

									if (var9 == 4) {
										field309[field368] = 1577;
									}

									field310[field368] = var3;
									field307[field368] = var4;
									field308[field368] = var5;
									field368++;
								}
							}
						}

						field245[field368] = "Examine @cya@" + var8.field662;
						field309[field368] = 1327;
						field310[field368] = var8.field647 << 14;
						field307[field368] = var4;
						field308[field368] = var5;
						field368++;
					} else if ((field575 & 0x4) == 4) {
						field245[field368] = field576 + " @cya@" + var8.field662;
						field309[field368] = 157;
						field310[field368] = var3;
						field307[field368] = var4;
						field308[field368] = var5;
						field368++;
					}
				}

				if (var6 == 1) {
					ONCZAQCQ var10 = field209[var7];
					if (var10.field1059.field987 == 1 && (var10.field62 & 0x7F) == 0x40 && (var10.field63 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field210; var11++) {
							ONCZAQCQ var12 = field209[field211[var11]];
							if (var12 != null && var10 != var12 && var12.field1059.field987 == 1 && var10.field62 == var12.field62 && var10.field63 == var12.field63) {
								method106(field211[var11], var12.field1059, var5, var4);
							}
						}

						for (int var13 = 0; var13 < field510; var13++) {
							AWOZVMFS var14 = field509[field511[var13]];
							if (var14 != null && var10.field62 == var14.field62 && var10.field63 == var14.field63) {
								method98(var4, field511[var13], var5, var14);
							}
						}
					}

					method106(var7, var10.field1059, var5, var4);
				}

				if (var6 == 0) {
					AWOZVMFS var15 = field509[var7];
					if ((var15.field62 & 0x7F) == 0x40 && (var15.field63 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field210; var16++) {
							ONCZAQCQ var17 = field209[field211[var16]];
							if (var17 != null && var17.field1059.field987 == 1 && var15.field62 == var17.field62 && var15.field63 == var17.field63) {
								method106(field211[var16], var17.field1059, var5, var4);
							}
						}

						for (int var18 = 0; var18 < field510; var18++) {
							AWOZVMFS var19 = field509[field511[var18]];
							if (var19 != null && var15 != var19 && var15.field62 == var19.field62 && var15.field63 == var19.field63) {
								method98(var4, field511[var18], var5, var19);
							}
						}
					}

					method98(var4, var7, var5, var15);
				}

				if (var6 == 3) {
					FLJWGVEY var20 = field362[field165][var4][var5];
					if (var20 != null) {
						for (VQCXWNRE var21 = (VQCXWNRE) var20.method276(); var21 != null; var21 = (VQCXWNRE) var20.method278()) {
							XLZQSPZS var22 = XLZQSPZS.method526(var21.field1264);
							if (field492 == 1) {
								field245[field368] = "Use " + field496 + " with @lre@" + var22.field1338;
								field309[field368] = 62;
								field310[field368] = var21.field1264;
								field307[field368] = var4;
								field308[field368] = var5;
								field368++;
							} else if (field573 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1310 != null && var22.field1310[var23] != null) {
										field245[field368] = var22.field1310[var23] + " @lre@" + var22.field1338;

										if (var23 == 0) {
											field309[field368] = 184;
										}

										if (var23 == 1) {
											field309[field368] = 81;
										}

										if (var23 == 2) {
											field309[field368] = 98;
										}

										if (var23 == 3) {
											field309[field368] = 275;
										}

										if (var23 == 4) {
											field309[field368] = 689;
										}

										field310[field368] = var21.field1264;
										field307[field368] = var4;
										field308[field368] = var5;
										field368++;
									} else if (var23 == 2) {
										field245[field368] = "Take @lre@" + var22.field1338;
										field309[field368] = 98;
										field310[field368] = var21.field1264;
										field307[field368] = var4;
										field308[field368] = var5;
										field368++;
									}
								}

								field245[field368] = "Examine @lre@" + var22.field1338;
								field309[field368] = 1184;
								field310[field368] = var21.field1264;
								field307[field368] = var4;
								field308[field368] = var5;
								field368++;
							} else if ((field575 & 0x1) == 1) {
								field245[field368] = field576 + " @lre@" + var22.field1338;
								field309[field368] = 538;
								field310[field368] = var21.field1264;
								field307[field368] = var4;
								field308[field368] = var5;
								field368++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method149(boolean arg0) {
		method109();
		field292.method463();
		field230.method270(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field163 == 0) {
			int var4 = var3 / 2 + 80;
			field378.method374(var2 / 2, field543.field1452, var4, true, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field380.method374(var2 / 2, "Welcome to RuneScape", var5, true, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field231.method270(var6 - 73, var7 - 20);
			field380.method374(var6, "New User", var7 + 5, true, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field231.method270(var8 - 73, var7 - 20);
			field380.method374(var8, "Existing User", var7 + 5, true, 0xFFFFFF);
		}

		if (field163 == 2) {
			int var9 = var3 / 2 - 40;
			if (field461.length() > 0) {
				field380.method374(var2 / 2, field461, var9 - 15, true, 0xFFFF00);
				field380.method374(var2 / 2, field462, var9, true, 0xFFFF00);
				var9 += 30;
			} else {
				field380.method374(var2 / 2, field462, var9 - 7, true, 0xFFFF00);
				var9 += 30;
			}

			field380.method381(var2 / 2 - 90, var9, true, 0xFFFFFF, "Username: " + field154 + (field256 == 0 & field499 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field380.method381(var2 / 2 - 88, var9, true, 0xFFFFFF, "Password: " + LGOZNEAG.method371(field155) + (field256 == 1 & field499 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field231.method270(var10 - 73, var11 - 20);
				field380.method374(var10, "Login", var11 + 5, true, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field231.method270(var12 - 73, var11 - 20);
				field380.method374(var12, "Cancel", var11 + 5, true, 0xFFFFFF);
			}
		}

		if (field163 == 3) {
			field380.method374(var2 / 2, "Create a free account", var3 / 2 - 60, true, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field380.method374(var2 / 2, "To create a new account you need to", var13, true, 0xFFFFFF);
			var13 += 15;
			field380.method374(var2 / 2, "go back to the main RuneScape webpage", var13, true, 0xFFFFFF);
			var13 += 15;
			field380.method374(var2 / 2, "and choose the 'create account'", var13, true, 0xFFFFFF);
			var13 += 15;
			field380.method374(var2 / 2, "button near the top of that page.", var13, true, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field231.method270(var14 - 73, var15 - 20);
			field380.method374(var14, "Cancel", var15 + 5, true, 0xFFFFFF);
		}

		field292.method464(171, field75, 202);

		if (field356) {
			field356 = false;
			field290.method464(0, field75, 128);
			field291.method464(371, field75, 202);
			field295.method464(265, field75, 0);
			field296.method464(265, field75, 562);
			field297.method464(171, field75, 128);
			field298.method464(171, field75, 562);
		}
	}

	@ObfuscatedName("client.d(IILEILHLJCE;)V")
	public final void method150(int arg0, EILHLJCE arg1) {
		int var3 = arg1.method235(8);
		if (var3 < field510) {
			for (int var4 = var3; var4 < field510; var4++) {
				field318[field317++] = field511[var4];
			}
		}

		if (var3 > field510) {
			signlink.reporterror(field154 + " Too many players");
			throw new RuntimeException("eek");
		}

		field510 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field511[var5];
			AWOZVMFS var7 = field509[var6];
			int var8 = arg1.method235(1);
			if (var8 == 0) {
				field511[field510++] = var6;
				var7.field29 = field499;
			} else {
				int var9 = arg1.method235(2);
				if (var9 == 0) {
					field511[field510++] = var6;
					var7.field29 = field499;
					field513[field512++] = var6;
				} else if (var9 == 1) {
					field511[field510++] = var6;
					var7.field29 = field499;
					int var10 = arg1.method235(3);
					var7.method8(var10, false);
					int var11 = arg1.method235(1);
					if (var11 == 1) {
						field513[field512++] = var6;
					}
				} else if (var9 == 2) {
					field511[field510++] = var6;
					var7.field29 = field499;
					int var12 = arg1.method235(3);
					var7.method8(var12, true);
					int var13 = arg1.method235(3);
					var7.method8(var13, true);
					int var14 = arg1.method235(1);
					if (var14 == 1) {
						field513[field512++] = var6;
					}
				} else if (var9 == 3) {
					field318[field317++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILAWOZVMFS;LEILHLJCE;IZ)V")
	public final void method151(int arg0, AWOZVMFS arg1, EILHLJCE arg2, int arg3) {
		if ((arg0 & 0x20) != 0) {
			int var5 = arg2.method243();
			byte[] var6 = new byte[var5];
			EILHLJCE var7 = new EILHLJCE(var6);
			arg2.method233(var6, var5, 0);
			field514[arg3] = var7;
			arg1.method27(var7);
		}

		if ((arg0 & 0x100) != 0) {
			arg1.field24 = arg2.method254();
			int var8 = arg2.method260();
			arg1.field28 = var8 >> 16;
			arg1.field27 = (var8 & 0xFFFF) + field499;
			arg1.field25 = 0;
			arg1.field26 = 0;

			if (arg1.field27 > field499) {
				arg1.field25 = -1;
			}

			if (arg1.field24 == 0xFFFF) {
				arg1.field24 = -1;
			}
		}

		if ((arg0 & 0x1) != 0) {
			int var9 = arg2.method252();
			if (var9 == 0xFFFF) {
				var9 = -1;
			}

			int var10 = arg2.method243();
			if (arg1.field44 == var9 && var9 != -1) {
				int var11 = ODMBIHRM.field1035[var9].field1049;
				if (var11 == 1) {
					arg1.field45 = 0;
					arg1.field46 = 0;
					arg1.field47 = var10;
					arg1.field48 = 0;
				}

				if (var11 == 2) {
					arg1.field48 = 0;
				}
			} else if (var9 == -1 || arg1.field44 == -1 || ODMBIHRM.field1035[var9].field1043 >= ODMBIHRM.field1035[arg1.field44].field1043) {
				arg1.field44 = var9;
				arg1.field45 = 0;
				arg1.field46 = 0;
				arg1.field47 = var10;
				arg1.field48 = 0;
				arg1.field60 = arg1.field15;
			}
		}

		if ((arg0 & 0x2) != 0) {
			arg1.field38 = arg2.method226();
			arg1.field39 = arg2.method252();
		}

		if ((arg0 & 0x400) != 0) {
			arg1.field53 = arg2.method244();
			arg1.field55 = arg2.method245();
			arg1.field54 = arg2.method243();
			arg1.field56 = arg2.method243();
			arg1.field57 = arg2.method252() + field499;
			arg1.field58 = arg2.method253() + field499;
			arg1.field59 = arg2.method224();
			arg1.method7();
		}

		if ((arg0 & 0x8) != 0) {
			arg1.field43 = arg2.method231();
			if (arg1.field43.charAt(0) == '~') {
				arg1.field43 = arg1.field43.substring(1);
				method126(2, arg1.field43, arg1.field117);
			} else if (field264 == arg1) {
				method126(2, arg1.field43, arg1.field117);
			}

			arg1.field52 = 0;
			arg1.field22 = 0;
			arg1.field23 = 150;
		}

		if ((arg0 & 0x80) != 0) {
			arg1.field49 = arg2.method226();
			if (arg1.field49 == 0xFFFF) {
				arg1.field49 = -1;
			}
		}

		if ((arg0 & 0x200) != 0) {
			int var12 = arg2.method224();
			int var13 = arg2.method245();
			arg1.method9(field499, var13, var12);
			arg1.field12 = field499 + 300;
			arg1.field13 = arg2.method244();
			arg1.field14 = arg2.method245();
		}

		if ((arg0 & 0x40) != 0) {
			int var14 = arg2.method254();
			int var15 = arg2.method224();
			int var16 = arg2.method245();
			int var17 = arg2.field684;

			if (arg1.field117 != null && arg1.field120) {
				long var18 = LGOZNEAG.method366(arg1.field117);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < field203; var21++) {
						if (field520[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}

				if (!var20 && field577 == 0) {
					try {
						field208.field684 = 0;
						arg2.method263(var16, 0, field208.field683);
						field208.field684 = 0;
						String var22 = OAEWGOIP.method396(field208, var16);
						var22 = WOWCAPIK.method486(var22);
						arg1.field43 = var22;
						arg1.field52 = var14 >> 8;
						arg1.field22 = var14 & 0xFF;
						arg1.field23 = 150;

						if (var15 == 2 || var15 == 3) {
							method126(1, var22, "@cr2@" + arg1.field117);
						} else if (var15 == 1) {
							method126(1, var22, "@cr1@" + arg1.field117);
						} else {
							method126(2, var22, arg1.field117);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.field684 = var16 + var17;
		}

		if ((arg0 & 0x10) != 0) {
			int var24 = arg2.method245();
			int var25 = arg2.method243();
			arg1.method9(field499, var25, var24);
			arg1.field12 = field499 + 300;
			arg1.field13 = arg2.method224();
			arg1.field14 = arg2.method245();
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method152() {
		while (true) {
			int var1 = method16();
			if (var1 == -1) {
				return;
			}

			if (field239 != -1 && field547 == field239) {
				if (var1 == 8 && field538.length() > 0) {
					field538 = field538.substring(0, field538.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field538.length() < 12) {
					field538 = field538 + (char) var1;
				}
			} else if (field553) {
				if (var1 >= 32 && var1 <= 122 && field221.length() < 80) {
					field221 = field221 + (char) var1;
					field579 = true;
				}

				if (var1 == 8 && field221.length() > 0) {
					field221 = field221.substring(0, field221.length() - 1);
					field579 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field553 = false;
					field579 = true;

					if (field465 == 1) {
						long var2 = LGOZNEAG.method366(field221);
						method68(var2);
					}

					if (field465 == 2 && field158 > 0) {
						long var4 = LGOZNEAG.method366(field221);
						method61(var4);
					}

					if (field465 == 3 && field221.length() > 0) {
						field560.method213(168);
						field560.method214(0);
						int var6 = field560.field684;
						field560.method220(field177);
						OAEWGOIP.method397(field560, field221);
						field560.method223(field560.field684 - var6);
						field221 = OAEWGOIP.method398(field221);
						field221 = WOWCAPIK.method486(field221);
						method126(6, field221, LGOZNEAG.method370(LGOZNEAG.method367(field177)));

						if (field315 == 2) {
							field315 = 1;
							field426 = true;
							field560.method213(124);
							field560.method214(field449);
							field560.method214(field315);
							field560.method214(field343);
						}
					}

					if (field465 == 4 && field203 < 100) {
						long var7 = LGOZNEAG.method366(field221);
						method57(var7);
					}

					if (field465 == 5 && field203 > 0) {
						long var9 = LGOZNEAG.method366(field221);
						method114(var9);
					}
				}
			} else if (field567 == 1) {
				if (var1 >= 48 && var1 <= 57 && field178.length() < 10) {
					field178 = field178 + (char) var1;
					field579 = true;
				}

				if (var1 == 8 && field178.length() > 0) {
					field178 = field178.substring(0, field178.length() - 1);
					field579 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field178.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field178);
						} catch (Exception var21) {
						}

						field560.method213(86);
						field560.method218(var11);
					}

					field567 = 0;
					field579 = true;
				}
			} else if (field567 == 2) {
				if (var1 >= 32 && var1 <= 122 && field178.length() < 12) {
					field178 = field178 + (char) var1;
					field579 = true;
				}

				if (var1 == 8 && field178.length() > 0) {
					field178 = field178.substring(0, field178.length() - 1);
					field579 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field178.length() > 0) {
						field560.method213(200);
						field560.method220(LGOZNEAG.method366(field178));
					}

					field567 = 0;
					field579 = true;
				}
			} else if (field450 == -1 && field568 == -1) {
				if (var1 >= 32 && var1 <= 122 && field397.length() < 80) {
					field397 = field397 + (char) var1;
					field579 = true;
				}

				if (var1 == 8 && field397.length() > 0) {
					field397 = field397.substring(0, field397.length() - 1);
					field579 = true;
				}

				if ((var1 == 13 || var1 == 10) && field397.length() > 0) {
					if (field166 == 2) {
						if (field397.equals("::clientdrop")) {
							method125();
						}

						if (field397.equals("::lag")) {
							method78();
						}

						if (field397.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field543.method588(2); var12++) {
								field543.method584(var12, 2, (byte) 1);
							}
						}

						if (field397.equals("::fpson")) {
							field463 = true;
						}

						if (field397.equals("::fpsoff")) {
							field463 = false;
						}

						if (field397.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field342[var13].field682[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field397.startsWith("::")) {
						field560.method213(230);
						field560.method214(field397.length() - 1);
						field560.method221(field397.substring(2));
					} else {
						String var16 = field397.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field397 = field397.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field397 = field397.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field397 = field397.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field397 = field397.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field397 = field397.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field397 = field397.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field397 = field397.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field397 = field397.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field397 = field397.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field397 = field397.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field397 = field397.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field397 = field397.substring(6);
						}

						String var18 = field397.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field397 = field397.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field397 = field397.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field397 = field397.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field397 = field397.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field397 = field397.substring(6);
						}

						field560.method213(169);
						field560.method214(0);
						int var20 = field560.field684;
						field208.field684 = 0;
						OAEWGOIP.method397(field208, field397);
						field560.method262(field208.field683, field208.field684, 0);
						field560.method242(var19);
						field560.method214(var17);
						field560.method223(field560.field684 - var20);
						field397 = OAEWGOIP.method398(field397);
						field397 = WOWCAPIK.method486(field397);
						field264.field43 = field397;
						field264.field52 = var17;
						field264.field22 = var19;
						field264.field23 = 150;

						if (field166 == 2) {
							method126(2, field264.field43, "@cr2@" + field264.field117);
						} else if (field166 == 1) {
							method126(2, field264.field43, "@cr1@" + field264.field117);
						} else {
							method126(2, field264.field43, field264.field117);
						}

						if (field449 == 2) {
							field449 = 3;
							field426 = true;
							field560.method213(124);
							field560.method214(field449);
							field560.method214(field315);
							field560.method214(field343);
						}
					}

					field397 = "";
					field579 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method153() {
		method100();

		if (field227 == 1) {
			field323[field226 / 100].method404(field224 - 8 - 4, field225 - 8 - 4);
		}

		if (field227 == 2) {
			field323[field226 / 100 + 4].method404(field224 - 8 - 4, field225 - 8 - 4);
		}

		if (field335 != -1) {
			method52(field335, field401);
			method157(IRYXZZFE.method329(field335), 0, 0, 0);
		}

		if (field239 != -1) {
			method52(field239, field401);
			method157(IRYXZZFE.method329(field239), 0, 0, 0);
		}

		method174();

		if (!field349) {
			method158();
			method119();
		} else if (field277 == 0) {
			method49();
		}

		if (field557 == 1) {
			field148.method404(472, 296);
		}

		if (field463) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field71 < 30 && field215) {
				var3 = 0xFF0000;
			}

			if (field71 < 20 && !field215) {
				var3 = 0xFF0000;
			}

			field379.method372(var2, var1, var3, "Fps:" + field71);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field215) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field215) {
				int var8 = 0xFF0000;
			}

			field379.method372(var2, var1, 0xFFFF00, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field422 != 0) {
			int var9 = field422 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field379.method377("System update in: " + var10 + ":0" + var9, 329, 4, 0xFFFF00);
			} else {
				field379.method377("System update in: " + var10 + ":" + var9, 329, 4, 0xFFFF00);
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method154() {
		int var1 = field326 * 128 + 64;
		int var2 = field327 * 128 + 64;
		int var3 = method129(var1, var2, field165) - field328;

		if (field169 < var1) {
			field169 += (var1 - field169) * field330 / 1000 + field329;
			if (field169 > var1) {
				field169 = var1;
			}
		}

		if (field169 > var1) {
			field169 -= (field169 - var1) * field330 / 1000 + field329;
			if (field169 < var1) {
				field169 = var1;
			}
		}

		if (field170 < var3) {
			field170 += (var3 - field170) * field330 / 1000 + field329;
			if (field170 > var3) {
				field170 = var3;
			}
		}

		if (field170 > var3) {
			field170 -= (field170 - var3) * field330 / 1000 + field329;
			if (field170 < var3) {
				field170 = var3;
			}
		}

		if (field171 < var2) {
			field171 += (var2 - field171) * field330 / 1000 + field329;
			if (field171 > var2) {
				field171 = var2;
			}
		}

		if (field171 > var2) {
			field171 -= (field171 - var2) * field330 / 1000 + field329;
			if (field171 < var2) {
				field171 = var2;
			}
		}

		int var4 = field528 * 128 + 64;
		int var5 = field529 * 128 + 64;
		int var6 = method129(var4, var5, field165) - field530;
		int var7 = var4 - field169;
		int var8 = var6 - field170;
		int var9 = var5 - field171;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field172 < var11) {
			field172 += (var11 - field172) * field532 / 1000 + field531;
			if (field172 > var11) {
				field172 = var11;
			}
		}

		if (field172 > var11) {
			field172 -= (field172 - var11) * field532 / 1000 + field531;
			if (field172 < var11) {
				field172 = var11;
			}
		}

		int var13 = var12 - field173;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field173 += field532 * var13 / 1000 + field531;
			field173 &= 0x7FF;
		}

		if (var13 < 0) {
			field173 -= -var13 * field532 / 1000 + field531;
			field173 &= 0x7FF;
		}

		int var14 = var12 - field173;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field173 = var12;
		}
	}

	public final void init() {
		field212 = Integer.parseInt(getParameter("nodeid"));
		field213 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method130();
		} else {
			method171();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field214 = false;
		} else {
			field214 = true;
		}

		method13(765, 503);
	}

	@ObfuscatedName("client.a(IBIIIIZIIIII)Z")
	public final boolean method155(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field469[var14][var15] = 0;
				field489[var14][var15] = 99999999;
			}
		}

		int var16 = arg7;
		int var17 = arg4;
		field469[arg7][arg4] = 99;
		field489[arg7][arg4] = 0;
		byte var18 = 0;
		int var19 = 0;
		field160[var18] = arg7;
		int var35 = var18 + 1;
		field161[var18] = arg4;
		boolean var20 = false;
		int var21 = field160.length;
		int[][] var22 = field342[field165].field682;
		while (var35 != var19) {
			var16 = field160[var19];
			var17 = field161[var19];
			var19 = (var19 + 1) % var21;

			if (arg0 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && field342[field165].method209(var16, arg0, arg10 - 1, arg1, var17, arg8)) {
					var20 = true;
					break;
				}

				if (arg10 < 10 && field342[field165].method210(arg8, arg1, arg10 - 1, arg0, var17, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg9 != 0 && arg3 != 0 && field342[field165].method211(arg0, var17, arg1, arg9, var16, arg3, arg6)) {
				var20 = true;
				break;
			}

			int var23 = field489[var16][var17] + 1;
			if (var16 > 0 && field469[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field160[var35] = var16 - 1;
				field161[var35] = var17;
				var35 = (var35 + 1) % var21;
				field469[var16 - 1][var17] = 2;
				field489[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field469[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field160[var35] = var16 + 1;
				field161[var35] = var17;
				var35 = (var35 + 1) % var21;
				field469[var16 + 1][var17] = 8;
				field489[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field469[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field160[var35] = var16;
				field161[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field469[var16][var17 - 1] = 1;
				field489[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field469[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field160[var35] = var16;
				field161[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field469[var16][var17 + 1] = 4;
				field489[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field469[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field160[var35] = var16 - 1;
				field161[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field469[var16 - 1][var17 - 1] = 3;
				field489[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field469[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field160[var35] = var16 + 1;
				field161[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field469[var16 + 1][var17 - 1] = 9;
				field489[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field469[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field160[var35] = var16 - 1;
				field161[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field469[var16 - 1][var17 + 1] = 6;
				field489[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field469[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field160[var35] = var16 + 1;
				field161[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field469[var16 + 1][var17 + 1] = 12;
				field489[var16 + 1][var17 + 1] = var23;
			}
		}

		field370 = 0;
		if (!var20) {
			if (arg5) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg0 - var25; var26 <= arg0 + var25; var26++) {
						for (int var27 = arg1 - var25; var27 <= arg1 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field489[var26][var27] < var24) {
								var24 = field489[var26][var27];
								var16 = var26;
								var17 = var27;
								field370 = 1;
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
		field160[var28] = var16;
		int var36 = var28 + 1;
		field161[var28] = var17;
		int var29;
		int var30 = var29 = field469[var16][var17];
		while (arg7 != var16 || arg4 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field160[var36] = var16;
				field161[var36++] = var17;
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

			var30 = field469[var16][var17];
		}

		if (var36 <= 0) {
			if (arg2 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field160[var36];
		int var33 = field161[var36];

		if (arg2 == 0) {
			field560.method213(246);
			field560.method214(var31 + var31 + 3);
		}

		if (arg2 == 1) {
			field560.method213(147);
			field560.method214(var31 + var31 + 3 + 14);
		}

		if (arg2 == 2) {
			field560.method213(216);
			field560.method214(var31 + var31 + 3);
		}

		field560.method240(field93[5] == 1 ? 1 : 0);
		field560.method249(field549 + var33);
		field394 = field160[0];
		field395 = field161[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field560.method240(field160[var36] - var32);
			field560.method241(field161[var36] - var33);
		}

		field560.method249(field548 + var32);
		return true;
	}

	@ObfuscatedName("client.e(II)V")
	public final void method156(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(LIRYXZZFE;IBII)V")
	public final void method157(IRYXZZFE arg0, int arg1, int arg2, int arg3) {
		if (arg0.field804 == 0 && arg0.field793 != null && (!arg0.field799 || field345 == arg0.field796 || field232 == arg0.field796 || field244 == arg0.field796)) {
			int var5 = IFHRXNFO.field764;
			int var6 = IFHRXNFO.field762;
			int var7 = IFHRXNFO.field765;
			int var8 = IFHRXNFO.field763;
			IFHRXNFO.method312(arg0.field814 + arg1, arg0.field792 + arg2, arg1, arg2);
			int var9 = arg0.field793.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.field815[var10] + arg1;
				int var12 = arg0.field841[var10] + arg2 - arg3;
				IRYXZZFE var13 = IRYXZZFE.method329(arg0.field793[var10]);
				var11 += var13.field819;
				var12 += var13.field789;

				if (var13.field773 > 0) {
					method112(var13);
				}

				if (var13.field804 == 0) {
					if (var13.field810 > var13.field803 - var13.field792) {
						var13.field810 = var13.field803 - var13.field792;
					}

					if (var13.field810 < 0) {
						var13.field810 = 0;
					}

					method157(var13, var11, var12, var13.field810);

					if (var13.field803 > var13.field792) {
						method55(var13.field810, var13.field792, var13.field803, var13.field814 + var11, var12);
					}
				} else if (var13.field804 != 1) {
					if (var13.field804 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field792; var15++) {
							for (int var16 = 0; var16 < var13.field814; var16++) {
								int var17 = (var13.field824 + 32) * var16 + var11;
								int var18 = (var13.field797 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field817[var14];
									var18 += var13.field775[var14];
								}

								if (var13.field829[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field829[var14] - 1;
									if (var17 > IFHRXNFO.field764 - 32 && var17 < IFHRXNFO.field765 && var18 > IFHRXNFO.field762 - 32 && var18 < IFHRXNFO.field763 || field525 != 0 && field524 == var14) {
										int var22 = 0;
										if (field492 == 1 && field493 == var14 && field494 == var13.field796) {
											var22 = 0xFFFFFF;
										}

										ODBDSPMH var23 = XLZQSPZS.method524(var21, var22, var13.field791[var14]);
										if (var23 != null) {
											if (field525 != 0 && field524 == var14 && field523 == var13.field796) {
												var19 = field83 - field526;
												var20 = field84 - field527;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field399 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method406(128, var17 + var19, var18 + var20);

												if (var18 + var20 < IFHRXNFO.field762 && arg0.field810 > 0) {
													int var24 = (IFHRXNFO.field762 - var18 - var20) * field401 / 3;
													if (var24 > field401 * 10) {
														var24 = field401 * 10;
													}

													if (var24 > arg0.field810) {
														var24 = arg0.field810;
													}

													arg0.field810 -= var24;
													field527 += var24;
												}

												if (var18 + var20 + 32 > IFHRXNFO.field763 && arg0.field810 < arg0.field803 - arg0.field792) {
													int var25 = (var18 + var20 + 32 - IFHRXNFO.field763) * field401 / 3;
													if (var25 > field401 * 10) {
														var25 = field401 * 10;
													}

													if (var25 > arg0.field803 - arg0.field792 - arg0.field810) {
														var25 = arg0.field803 - arg0.field792 - arg0.field810;
													}

													arg0.field810 += var25;
													field527 -= var25;
												}
											} else if (field454 != 0 && field453 == var14 && field452 == var13.field796) {
												var23.method406(128, var17, var18);
											} else {
												var23.method404(var17, var18);
											}

											if (var23.field1032 == 33 || var13.field791[var14] != 1) {
												int var26 = var13.field791[var14];
												field378.method377(method167(var26), var18 + var20 + 10, var17 + 1 + var19, 0);
												field378.method377(method167(var26), var18 + var20 + 9, var17 + var19, 0xFFFF00);
											}
										}
									}
								} else if (var13.field838 != null && var14 < 20) {
									ODBDSPMH var27 = var13.field838[var14];
									if (var27 != null) {
										var27.method404(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field804 == 3) {
						boolean var28 = false;
						if (field244 == var13.field796 || field232 == var13.field796 || field345 == var13.field796) {
							var28 = true;
						}

						int var29;
						if (method45(var13)) {
							var29 = var13.field782;
							if (var28 && var13.field822 != 0) {
								var29 = var13.field822;
							}
						} else {
							var29 = var13.field774;
							if (var28 && var13.field772 != 0) {
								var29 = var13.field772;
							}
						}

						if (var13.field795 == 0) {
							if (var13.field790) {
								IFHRXNFO.method315(var29, var11, var13.field814, var13.field792, var12);
							} else {
								IFHRXNFO.method316(var12, var13.field814, var11, var13.field792, var29);
							}
						} else if (var13.field790) {
							IFHRXNFO.method314(var13.field792, var11, 256 - (var13.field795 & 0xFF), var12, var13.field814, var29);
						} else {
							IFHRXNFO.method317(var13.field814, var29, var11, var12, 256 - (var13.field795 & 0xFF), var13.field792);
						}
					} else if (var13.field804 == 4) {
						MCYRKBJU var30 = var13.field834;
						String var31 = var13.field800;
						boolean var32 = false;
						if (field244 == var13.field796 || field232 == var13.field796 || field345 == var13.field796) {
							var32 = true;
						}

						int var33;
						if (method45(var13)) {
							var33 = var13.field782;
							if (var32 && var13.field822 != 0) {
								var33 = var13.field822;
							}

							if (var13.field835.length() > 0) {
								var31 = var13.field835;
							}
						} else {
							var33 = var13.field774;
							if (var32 && var13.field772 != 0) {
								var33 = var13.field772;
							}
						}

						if (var13.field816 == 6 && field400) {
							var31 = "Please wait...";
							var33 = var13.field774;
						}

						if (IFHRXNFO.field760 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field964 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method107(method44(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method107(method44(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method107(method44(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method107(method44(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method107(method44(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field818) {
								var30.method374(var13.field814 / 2 + var11, var41, var34, var13.field776, var33);
							} else {
								var30.method381(var11, var34, var13.field776, var33, var41);
							}

							var34 += var30.field964;
						}
					} else if (var13.field804 == 5) {
						ODBDSPMH var42;
						if (method45(var13)) {
							var42 = var13.field812;
						} else {
							var42 = var13.field809;
						}

						if (var42 != null) {
							var42.method404(var11, var12);
						}
					} else if (var13.field804 == 6) {
						int var43 = GBZDHVLZ.field711;
						int var44 = GBZDHVLZ.field712;
						GBZDHVLZ.field711 = var13.field814 / 2 + var11;
						GBZDHVLZ.field712 = var13.field792 / 2 + var12;
						int var45 = GBZDHVLZ.field715[var13.field832] * var13.field831 >> 16;
						int var46 = GBZDHVLZ.field716[var13.field832] * var13.field831 >> 16;
						boolean var47 = method45(var13);
						int var48;
						if (var47) {
							var48 = var13.field781;
						} else {
							var48 = var13.field780;
						}

						KBEXSZSN var49;
						if (var48 == -1) {
							var49 = var13.method326(-1, -1, var47);
						} else {
							ODMBIHRM var50 = ODMBIHRM.field1035[var48];
							var49 = var13.method326(var50.field1037[var13.field830], var50.field1038[var13.field830], var47);
						}

						if (var49 != null) {
							var49.method360(0, var13.field833, 0, var13.field832, 0, var45, var46);
						}

						GBZDHVLZ.field711 = var43;
						GBZDHVLZ.field712 = var44;
					} else {
						if (var13.field804 == 7) {
							MCYRKBJU var51 = var13.field834;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field792; var53++) {
								for (int var54 = 0; var54 < var13.field814; var54++) {
									if (var13.field829[var52] > 0) {
										XLZQSPZS var55 = XLZQSPZS.method526(var13.field829[var52] - 1);
										String var56 = var55.field1338;
										if (var55.field1331 || var13.field791[var52] != 1) {
											var56 = var56 + " x" + method53(var13.field791[var52]);
										}

										int var57 = (var13.field824 + 115) * var54 + var11;
										int var58 = (var13.field797 + 12) * var53 + var12;
										if (var13.field818) {
											var51.method374(var13.field814 / 2 + var57, var56, var58, var13.field776, var13.field774);
										} else {
											var51.method381(var57, var58, var13.field776, var13.field774, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field804 == 8 && (field477 == var13.field796 || field186 == var13.field796 || field267 == var13.field796) && field248 == 100) {
							int var59 = 0;
							int var60 = 0;
							MCYRKBJU var61 = field379;
							String var62 = var13.field800;
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

								int var65 = var61.method375(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field964 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field814 + var11 - var59 - 5;
							int var67 = var13.field792 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg0.field814 + arg1) {
								var66 = arg0.field814 + arg1 - var59;
							}

							IFHRXNFO.method315(0xFFFFA0, var66, var59, var60, var67);
							IFHRXNFO.method316(var67, var59, var66, var60, 0);
							String var68 = var13.field800;
							int var69 = var61.field964 + var67 + 2;
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

								var61.method381(var66 + 3, var69, false, 0, var71);
								var69 += var61.field964 + 1;
							}
						}
					}
				}
			}

			IFHRXNFO.method312(var7, var8, var5, var6);
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method158() {
		if (field525 == 0) {
			field245[0] = "Cancel";
			field309[0] = 1921;
			field368 = 1;
			if (field568 == -1) {
				method47();
				field473 = 0;
				field351 = 0;

				if (field83 > 4 && field84 > 4 && field83 < 516 && field84 < 338) {
					if (field239 == -1) {
						method148();
					} else {
						method128(0, IRYXZZFE.method329(field239), 0, field84, field83, 4, 4);
					}
				}

				if (field473 != field345) {
					field345 = field473;
				}

				if (field351 != field267) {
					field267 = field351;
				}

				field473 = 0;
				field351 = 0;

				if (field83 > 553 && field84 > 205 && field83 < 743 && field84 < 466) {
					if (field468 != -1) {
						method128(0, IRYXZZFE.method329(field468), 1, field84, field83, 205, 553);
					} else if (field516[field324] != -1) {
						method128(0, IRYXZZFE.method329(field516[field324]), 1, field84, field83, 205, 553);
					}
				}

				if (field473 != field232) {
					field488 = true;
					field232 = field473;
				}

				if (field351 != field186) {
					field488 = true;
					field186 = field351;
				}

				field473 = 0;
				field351 = 0;

				if (field83 > 17 && field84 > 357 && field83 < 496 && field84 < 453) {
					if (field450 != -1) {
						method128(0, IRYXZZFE.method329(field450), 2, field84, field83, 357, 17);
					} else if (field566 != -1) {
						method128(0, IRYXZZFE.method329(field566), 3, field84, field83, 357, 17);
					} else if (field84 < 434 && field83 < 426) {
						method50(field84 - 357, field83 - 17);
					}
				}

				if ((field450 != -1 || field566 != -1) && field473 != field244) {
					field579 = true;
					field244 = field473;
				}

				if ((field450 != -1 || field566 != -1) && field477 != field351) {
					field579 = true;
					field477 = field351;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field368 - 1; var2++) {
						if (field309[var2] < 1000 && field309[var2 + 1] > 1000) {
							String var3 = field245[var2];
							field245[var2] = field245[var2 + 1];
							field245[var2 + 1] = var3;
							int var4 = field309[var2];
							field309[var2] = field309[var2 + 1];
							field309[var2 + 1] = var4;
							int var5 = field307[var2];
							field307[var2] = field307[var2 + 1];
							field307[var2 + 1] = var5;
							int var6 = field308[var2];
							field308[var2] = field308[var2 + 1];
							field308[var2 + 1] = var6;
							int var7 = field310[var2];
							field310[var2] = field310[var2 + 1];
							field310[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field473 = 0;
				field351 = 0;
				method128(0, IRYXZZFE.method329(field568), 0, field84, field83, 0, 0);

				if (field473 != field345) {
					field345 = field473;
				}

				if (field351 != field267) {
					field267 = field351;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method159(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(ILHCPBXDEK;)V")
	public final void method160(HCPBXDEK arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field744 == 0) {
			var2 = field363.method554(arg0.field743, arg0.field745, arg0.field746);
		}

		if (arg0.field744 == 1) {
			var2 = field363.method555(arg0.field743, arg0.field746, arg0.field745);
		}

		if (arg0.field744 == 2) {
			var2 = field363.method556(arg0.field743, arg0.field745, arg0.field746);
		}

		if (arg0.field744 == 3) {
			var2 = field363.method557(arg0.field743, arg0.field745, arg0.field746);
		}

		if (var2 != 0) {
			int var6 = field363.method558(arg0.field743, arg0.field745, arg0.field746, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field739 = var3;
		arg0.field741 = var4;
		arg0.field740 = var5;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method161(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field461 = "";
				field462 = "Connecting to server...";
				method149(true);
			}

			field522 = new ABBBHPCA(this, method85(field213 + 43594));
			long var4 = LGOZNEAG.method366(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field560.field684 = 0;
			field560.method214(14);
			field560.method214(var6);
			field522.method5(0, field560.field683, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field522.method2();
			}

			int var8 = field522.method2();
			int var9 = var8;

			if (var8 == 0) {
				field522.method4(field200.field683, 0, 8);
				field200.field684 = 0;
				field466 = field200.method230();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field466 >> 32), (int) field466 };
				field560.field684 = 0;
				field560.method214(10);
				field560.method218(var10[0]);
				field560.method218(var10[1]);
				field560.method218(var10[2]);
				field560.method218(var10[3]);
				field560.method218(signlink.uid);
				field560.method221(arg0);
				field560.method221(arg1);
				field560.method239(field358, field261);
				field558.field684 = 0;

				if (arg2) {
					field558.method214(18);
				} else {
					field558.method214(16);
				}

				field558.method214(field560.field684 + 36 + 1 + 1 + 2);
				field558.method214(255);
				field558.method215(349);
				field558.method214(field215 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field558.method218(field271[var11]);
				}

				field558.method222(field560.field684, field560.field683, 0);
				field560.field688 = new YPXEHIVX(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field562 = new YPXEHIVX(var10);
				field522.method5(0, field558.field683, field558.field684);
				var8 = field522.method2();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method161(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field166 = field522.method2();
				field334 = field522.method2() == 1;
				field263 = 0L;
				field199 = 0;
				field219.field1233 = 0;
				field80 = true;
				field438 = true;
				field521 = true;
				field560.field684 = 0;
				field200.field684 = 0;
				field390 = -1;
				field205 = -1;
				field206 = -1;
				field207 = -1;
				field389 = 0;
				field391 = 0;
				field422 = 0;
				field393 = 0;
				field251 = 0;
				field368 = 0;
				field349 = false;
				field81 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field505[var13] = null;
				}

				field492 = 0;
				field573 = 0;
				field164 = 0;
				field554 = 0;
				field254 = (int) (Math.random() * 100.0D) - 50;
				field518 = (int) (Math.random() * 110.0D) - 55;
				field555 = (int) (Math.random() * 80.0D) - 40;
				field287 = (int) (Math.random() * 120.0D) - 60;
				field540 = (int) (Math.random() * 30.0D) - 20;
				field570 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field535 = 0;
				field229 = -1;
				field394 = 0;
				field395 = 0;
				field510 = 0;
				field210 = 0;

				for (int var14 = 0; var14 < field507; var14++) {
					field509[var14] = null;
					field514[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field209[var15] = null;
				}

				field264 = field509[field508] = new AWOZVMFS();
				field236.method279();
				field273.method279();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field362[var16][var17][var18] = null;
						}
					}
				}

				field474 = new FLJWGVEY();
				field159 = 0;
				field158 = 0;
				method146(field566);
				field566 = -1;
				method146(field450);
				field450 = -1;
				method146(field239);
				field239 = -1;
				method146(field568);
				field568 = -1;
				method146(field246);
				field246 = -1;
				method146(field468);
				field468 = -1;
				method146(field335);
				field335 = -1;
				field400 = false;
				field324 = 3;
				field567 = 0;
				field349 = false;
				field553 = false;
				field285 = null;
				field557 = 0;
				field480 = -1;
				field552 = true;
				method80();

				for (int var19 = 0; var19 < 5; var19++) {
					field583[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field536[var20] = null;
					field537[var20] = false;
				}

				field475 = 0;
				field249 = 0;
				field184 = 0;
				field259 = 0;
				field223 = 0;
				field299 = 0;
				field352 = 0;
				method105();
			} else if (var8 == 3) {
				field461 = "";
				field462 = "Invalid username or password.";
			} else if (var8 == 4) {
				field461 = "Your account has been disabled.";
				field462 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field461 = "Your account is already logged in.";
				field462 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field461 = "RuneScape has been updated!";
				field462 = "Please reload this page.";
			} else if (var8 == 7) {
				field461 = "This world is full.";
				field462 = "Please use a different world.";
			} else if (var8 == 8) {
				field461 = "Unable to connect.";
				field462 = "Login server offline.";
			} else if (var8 == 9) {
				field461 = "Login limit exceeded.";
				field462 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field461 = "Unable to connect.";
				field462 = "Bad session id.";
			} else if (var8 == 11) {
				field461 = "Login server rejected session.";
				field462 = "Please try again.";
			} else if (var8 == 12) {
				field461 = "You need a members account to login to this world.";
				field462 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field461 = "Could not complete login.";
				field462 = "Please try using a different world.";
			} else if (var8 == 14) {
				field461 = "The server is being updated.";
				field462 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field521 = true;
				field560.field684 = 0;
				field200.field684 = 0;
				field390 = -1;
				field205 = -1;
				field206 = -1;
				field207 = -1;
				field389 = 0;
				field391 = 0;
				field422 = 0;
				field368 = 0;
				field349 = false;
				field218 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field461 = "Login attempts exceeded.";
				field462 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field461 = "You are standing in a members-only area.";
				field462 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field461 = "Invalid loginserver requested";
				field462 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field522.method2();
				for (var21 += 3; var21 >= 0; var21--) {
					field461 = "You have only just left another world";
					field462 = "Your profile will be transferred in: " + var21;
					method149(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method161(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field461 = "Malformed login packet.";
				field462 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field461 = "Unexpected server response";
				field462 = "Please try using a different world.";
			} else if (var9 != 0) {
				field461 = "No response from server";
				field462 = "Please try using a different world.";
			} else if (field539 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field539++;
				method161(arg0, arg1, arg2);
			} else {
				field461 = "No response from loginserver";
				field462 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field461 = "";
			field462 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method162() {
		if (field163 == 0) {
			int var1 = field73 / 2 - 80;
			int var2 = field74 / 2 + 20;
			var2 += 20;
			if (field89 == 1 && field90 >= var1 - 75 && field90 <= var1 + 75 && field91 >= var2 - 20 && field91 <= var2 + 20) {
				field163 = 3;
				field256 = 0;
			}

			int var3 = field73 / 2 + 80;
			if (field89 == 1 && field90 >= var3 - 75 && field90 <= var3 + 75 && field91 >= var2 - 20 && field91 <= var2 + 20) {
				field461 = "";
				field462 = "Enter your username & password.";
				field163 = 2;
				field256 = 0;
			}
		} else if (field163 == 2) {
			int var4 = field74 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field89 == 1 && field91 >= var4 - 15 && field91 < var4) {
				field256 = 0;
			}

			var4 += 15;
			if (field89 == 1 && field91 >= var4 - 15 && field91 < var4) {
				field256 = 1;
			}

			var4 += 15;
			int var5 = field73 / 2 - 80;
			int var6 = field74 / 2 + 50;
			var6 += 20;
			if (field89 == 1 && field90 >= var5 - 75 && field90 <= var5 + 75 && field91 >= var6 - 20 && field91 <= var6 + 20) {
				field539 = 0;
				method161(field154, field155, false);

				if (field521) {
					return;
				}
			}

			int var7 = field73 / 2 + 80;
			if (field89 == 1 && field90 >= var7 - 75 && field90 <= var7 + 75 && field91 >= var6 - 20 && field91 <= var6 + 20) {
				field163 = 0;
				field154 = "";
				field155 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method16();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field586.length(); var10++) {
					if (var8 == field586.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field256 == 0) {
					if (var8 == 8 && field154.length() > 0) {
						field154 = field154.substring(0, field154.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field256 = 1;
					}

					if (var9) {
						field154 = field154 + (char) var8;
					}

					if (field154.length() > 12) {
						field154 = field154.substring(0, 12);
					}
				} else if (field256 == 1) {
					if (var8 == 8 && field155.length() > 0) {
						field155 = field155.substring(0, field155.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field256 = 0;
					}

					if (var9) {
						field155 = field155 + (char) var8;
					}

					if (field155.length() > 20) {
						field155 = field155.substring(0, 20);
					}
				}
			}
		} else if (field163 == 3) {
			int var11 = field73 / 2;
			int var12 = field74 / 2 + 50;
			var12 += 20;
			if (field89 == 1 && field90 >= var11 - 75 && field90 <= var11 + 75 && field91 >= var12 - 20 && field91 <= var12 + 20) {
				field163 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method23(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method23(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.e(ZI)V")
	public final void method163(boolean arg0) {
		for (int var2 = 0; var2 < field210; var2++) {
			ONCZAQCQ var3 = field209[field211[var2]];
			int var4 = (field211[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method10() && var3.field1059.field1004 == arg0 && var3.field1059.method392()) {
				int var5 = var3.field62 >> 7;
				int var6 = var3.field63 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field51 == 1 && (var3.field62 & 0x7F) == 0x40 && (var3.field63 & 0x7F) == 0x40) {
						if (field365[var5][var6] == field262) {
							continue;
						}

						field365[var5][var6] = field262;
					}

					if (!var3.field1059.field988) {
						var4 += Integer.MIN_VALUE;
					}

					field363.method539(var3.field62, var3.field64, field165, var3.field63, (var3.field51 - 1) * 64 + 60, var3, method129(var3.field62, var3.field63, field165), var3.field36, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method164() {
		if (field164 == 2) {
			for (HCPBXDEK var1 = (HCPBXDEK) field474.method275(); var1 != null; var1 = (HCPBXDEK) field474.method277()) {
				if (var1.field742 > 0) {
					var1.field742--;
				}

				if (var1.field742 != 0) {
					if (var1.field747 > 0) {
						var1.field747--;
					}

					if (var1.field747 == 0 && var1.field745 >= 1 && var1.field746 >= 1 && var1.field745 <= 102 && var1.field746 <= 102 && (var1.field736 < 0 || OZIFXWPH.method436(var1.field738, var1.field736))) {
						method175(var1.field736, var1.field737, var1.field743, var1.field744, var1.field745, var1.field746, var1.field738);
						var1.field747 = -1;

						if (var1.field739 == var1.field736 && var1.field739 == -1) {
							var1.method334();
						} else if (var1.field739 == var1.field736 && var1.field740 == var1.field737 && var1.field741 == var1.field738) {
							var1.method334();
						}
					}
				} else if (var1.field739 < 0 || OZIFXWPH.method436(var1.field741, var1.field739)) {
					method175(var1.field739, var1.field740, var1.field743, var1.field744, var1.field745, var1.field746, var1.field741);
					var1.method334();
				}
			}

			field464++;
			if (field464 > 1896) {
				field464 = 0;
				field560.method213(119);
				field560.method214(0);
				int var2 = field560.field684;
				field560.method215((int) (Math.random() * 65536.0D));
				field560.method215((int) (Math.random() * 65536.0D));
				field560.method214(245);
				field560.method215(25901);
				field560.method214((int) (Math.random() * 256.0D));
				field560.method214(130);

				if ((int) (Math.random() * 2.0D) == 0) {
					field560.method214(74);
				}

				field560.method215(64410);
				field560.method214(239);

				if ((int) (Math.random() * 2.0D) == 0) {
					field560.method215(62571);
				}

				field560.method223(field560.field684 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LEILHLJCE;IB)V")
	public final void method165(EILHLJCE arg0, int arg1) {
		arg0.method234();
		int var3 = arg0.method235(1);
		if (var3 != 0) {
			int var4 = arg0.method235(2);
			if (var4 == 0) {
				field513[field512++] = field508;
			} else if (var4 == 1) {
				int var5 = arg0.method235(3);
				field264.method8(var5, false);
				int var6 = arg0.method235(1);
				if (var6 == 1) {
					field513[field512++] = field508;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method235(3);
				field264.method8(var7, true);
				int var8 = arg0.method235(3);
				field264.method8(var8, true);
				int var9 = arg0.method235(1);
				if (var9 == 1) {
					field513[field512++] = field508;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method235(7);
				int var11 = arg0.method235(7);
				field165 = arg0.method235(2);
				int var12 = arg0.method235(1);
				int var13 = arg0.method235(1);
				if (var13 == 1) {
					field513[field512++] = field508;
				}

				field264.method11(var10, var11, var12 == 1);
			}
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method166() {
		if (field89 == 1) {
			if (field90 >= 6 && field90 <= 106 && field91 >= 467 && field91 <= 499) {
				field449 = (field449 + 1) % 4;
				field426 = true;
				field579 = true;
				field560.method213(124);
				field560.method214(field449);
				field560.method214(field315);
				field560.method214(field343);
			}

			if (field90 >= 135 && field90 <= 235 && field91 >= 467 && field91 <= 499) {
				field315 = (field315 + 1) % 3;
				field426 = true;
				field579 = true;
				field560.method213(124);
				field560.method214(field449);
				field560.method214(field315);
				field560.method214(field343);
			}

			if (field90 >= 273 && field90 <= 373 && field91 >= 467 && field91 <= 499) {
				field343 = (field343 + 1) % 3;
				field426 = true;
				field579 = true;
				field560.method213(124);
				field560.method214(field449);
				field560.method214(field315);
				field560.method214(field343);
			}

			if (field90 >= 412 && field90 <= 512 && field91 >= 467 && field91 <= 499) {
				if (field239 == -1) {
					method88();
					field538 = "";
					field439 = false;
					field547 = field239 = IRYXZZFE.field769;
					return;
				}

				method126(0, "Please close the interface you have open before using 'report abuse'", "");
				return;
			}
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String method167(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.N(I)V")
	public final void method168() {
		for (YHTUMUXE var1 = (YHTUMUXE) field273.method275(); var1 != null; var1 = (YHTUMUXE) field273.method277()) {
			if (field165 != var1.field1411 || var1.field1415) {
				var1.method334();
			} else if (field499 >= var1.field1419) {
				var1.method579(field401);

				if (var1.field1415) {
					var1.method334();
				} else {
					field363.method539(var1.field1412, 0, var1.field1411, var1.field1413, 60, var1, var1.field1414, false, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method169() {
		if (field251 == 2) {
			method103((field150 - field549 << 7) + field153, field151 * 2, (field149 - field548 << 7) + field152);

			if (field347 > -1 && field499 % 20 < 10) {
				field311[0].method404(field347 - 12, field348 - 28);
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method170() {
		field440.method463();
		GBZDHVLZ.field717 = field383;
		field386.method270(0, 0);

		if (field468 != -1) {
			method157(IRYXZZFE.method329(field468), 0, 0, 0);
		} else if (field516[field324] != -1) {
			method157(IRYXZZFE.method329(field516[field324]), 0, 0, 0);
		}

		if (field349 && field277 == 1) {
			method49();
		}

		field440.method464(205, field75, 553);
		field442.method463();
		GBZDHVLZ.field717 = field384;
	}

	@ObfuscatedName("client.P(I)V")
	public static final void method171() {
		XOHMKFIT.field1348 = false;
		GBZDHVLZ.field706 = false;
		field215 = false;
		OZIFXWPH.field1070 = false;
		DQLJXYPC.field655 = false;
	}

	@ObfuscatedName("client.a(LEILHLJCE;BI)V")
	public final void method172(EILHLJCE arg0, int arg1) {
		for (int var3 = 0; var3 < field512; var3++) {
			int var4 = field513[var3];
			AWOZVMFS var5 = field509[var4];
			int var6 = arg0.method224();
			if ((var6 & 0x4) != 0) {
				var6 += arg0.method224() << 8;
			}

			method151(var6, var5, arg0, var4);
		}
	}

	@ObfuscatedName("client.a([BZZ)V")
	public final void method173(byte[] arg0, boolean arg1) {
		if (field336) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method174() {
		field577 = 0;
		int var1 = (field264.field62 >> 7) + field548;
		int var2 = (field264.field63 >> 7) + field549;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field577 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field577 = 1;
		}

		if (field577 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field577 = 0;
		}
	}

	@ObfuscatedName("client.a(IZIIIIII)V")
	public final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg5 >= 1 && arg4 <= 102 && arg5 <= 102) {
			if (field215 && field165 != arg2) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field363.method554(arg2, arg4, arg5);
			}

			if (arg3 == 1) {
				var8 = field363.method555(arg2, arg5, arg4);
			}

			if (arg3 == 2) {
				var8 = field363.method556(arg2, arg4, arg5);
			}

			if (arg3 == 3) {
				var8 = field363.method557(arg2, arg4, arg5);
			}

			if (var8 != 0) {
				int var12 = field363.method558(arg2, arg4, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field363.method545(arg4, arg2, arg5);
					DQLJXYPC var16 = DQLJXYPC.method192(var13);
					if (var16.field631) {
						field342[arg2].method205(var14, arg4, var16.field638, var15, arg5);
					}
				}

				if (arg3 == 1) {
					field363.method546(arg2, arg5, arg4);
				}

				if (arg3 == 2) {
					field363.method547(arg5, arg4, arg2);
					DQLJXYPC var17 = DQLJXYPC.method192(var13);
					if (var17.field641 + arg4 > 103 || var17.field641 + arg5 > 103 || var17.field636 + arg4 > 103 || var17.field636 + arg5 > 103) {
						return;
					}

					if (var17.field631) {
						field342[arg2].method206(arg5, var17.field641, var17.field636, var15, arg4, var17.field638);
					}
				}

				if (arg3 == 3) {
					field363.method548(arg5, arg4, arg2);
					DQLJXYPC var18 = DQLJXYPC.method192(var13);
					if (var18.field631 && var18.field632) {
						field342[arg2].method208(arg4, arg5);
					}
				}
			}

			if (arg0 >= 0) {
				int var19 = arg2;
				if (arg2 < 3 && (field216[1][arg4][arg5] & 0x2) == 2) {
					var19 = arg2 + 1;
				}

				OZIFXWPH.method424(field342[arg2], field363, arg0, arg4, arg6, field559, var19, arg5, arg1, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void method176() {
		field443.method463();
		GBZDHVLZ.field717 = field382;
		field388.method270(0, 0);

		if (field553) {
			field380.method373(0, field585, 239, 40);
			field380.method373(128, field221 + "*", 239, 60);
		} else if (field567 == 1) {
			field380.method373(0, "Enter amount:", 239, 40);
			field380.method373(128, field178 + "*", 239, 60);
		} else if (field567 == 2) {
			field380.method373(0, "Enter name:", 239, 40);
			field380.method373(128, field178 + "*", 239, 60);
		} else if (field285 != null) {
			field380.method373(0, field285, 239, 40);
			field380.method373(128, "Click to continue", 239, 60);
		} else if (field450 != -1) {
			method157(IRYXZZFE.method329(field450), 0, 0, 0);
		} else if (field566 == -1) {
			MCYRKBJU var1 = field379;
			int var2 = 0;
			IFHRXNFO.method312(463, 77, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field505[var3] != null) {
					int var4 = field503[var3];
					int var5 = field316 + 70 - var2 * 14;
					String var6 = field504[var3];
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
							var1.method377(field505[var3], var5, 4, 0);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field449 == 0 || field449 == 1 && method179(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field445[0].method270(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								field445[1].method270(var8, var5 - 12);
								var8 += 14;
							}

							var1.method377(var6 + ":", var5, var8, 0);
							var8 += var1.method375(var6) + 8;
							var1.method377(field505[var3], var5, var8, 255);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field220 == 0 && (var4 == 7 || field315 == 0 || field315 == 1 && method179(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method377("From", var5, var9, 0);
							int var11 = var9 + var1.method375("From ");
							if (var7 == 1) {
								field445[0].method270(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								field445[1].method270(var11, var5 - 12);
								var11 += 14;
							}

							var1.method377(var6 + ":", var5, var11, 0);
							var11 += var1.method375(var6) + 8;
							var1.method377(field505[var3], var5, var11, 0x800000);
						}

						var2++;
					}

					if (var4 == 4 && (field343 == 0 || field343 == 1 && method179(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method377(var6 + " " + field505[var3], var5, 4, 0x800080);
						}

						var2++;
					}

					if (var4 == 5 && field220 == 0 && field315 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method377(field505[var3], var5, 4, 0x800000);
						}

						var2++;
					}

					if (var4 == 6 && field220 == 0 && field315 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method377("To " + var6 + ":", var5, 4, 0);
							var1.method377(field505[var3], var5, var1.method375("To " + var6) + 12, 0x800000);
						}

						var2++;
					}

					if (var4 == 8 && (field343 == 0 || field343 == 1 && method179(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method377(var6 + " " + field505[var3], var5, 4, 0x7E3200);
						}

						var2++;
					}
				}
			}

			IFHRXNFO.method311();
			field337 = var2 * 14 + 7;
			if (field337 < 78) {
				field337 = 78;
			}

			method55(field337 - field316 - 77, 77, field337, 463, 0);
			String var10;
			if (field264 == null || field264.field117 == null) {
				var10 = LGOZNEAG.method370(field154);
			} else {
				var10 = field264.field117;
			}

			var1.method377(var10 + ":", 90, 4, 0);
			var1.method377(field397 + "*", 90, var1.method375(var10 + ": ") + 6, 255);
			IFHRXNFO.method318(479, 77, 0, 0);
		} else {
			method157(IRYXZZFE.method329(field566), 0, 0, 0);
		}

		if (field349 && field277 == 2) {
			method49();
		}

		field443.method464(357, field75, 17);
		field442.method463();
		GBZDHVLZ.field717 = field384;
	}

	@ObfuscatedName("client.c(I)V")
	public final void method18() {
		if (!field490 && !field457 && !field364) {
			field499++;

			if (field521) {
				method73();
			} else {
				method162();
			}

			method177();
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method177() {
		while (true) {
			CZKZHBFI var1 = field543.method599();
			if (var1 == null) {
				return;
			}

			if (var1.field614 == 0) {
				KBEXSZSN.method337(var1.field615, var1.field613);

				if ((field543.method592(var1.field615) & 0x62) != 0) {
					field488 = true;

					if (field450 != -1 || field566 != -1) {
						field579 = true;
					}
				}
			}

			if (var1.field614 == 1 && var1.field613 != null) {
				IBCKUTPD.method306(var1.field613);
			}

			if (var1.field614 == 2 && field406 == var1.field615 && var1.field613 != null) {
				method173(var1.field613, field407);
			}

			if (var1.field614 == 3 && field164 == 1) {
				for (int var2 = 0; var2 < field372.length; var2++) {
					if (field175[var2] == var1.field615) {
						field372[var2] = var1.field613;

						if (var1.field613 == null) {
							field175[var2] = -1;
						}

						break;
					}

					if (field176[var2] == var1.field615) {
						field270[var2] = var1.field613;

						if (var1.field613 == null) {
							field176[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field614 == 93 && field543.method590(var1.field615)) {
				OZIFXWPH.method417(new EILHLJCE(var1.field613), field543);
			}
		}
	}

	@ObfuscatedName("client.b(LODBDSPMH;ZII)V")
	public final void method178(ODBDSPMH arg0, int arg1, int arg2) {
		int var4 = field570 + field287 & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = KBEXSZSN.field935[var4];
			int var7 = KBEXSZSN.field936[var4];
			var6 = var6 * 256 / (field540 + 256);
			var7 = var7 * 256 / (field540 + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg0.method410(var8 + 94 + 4 - arg0.field1032 / 2, field387, 83 - var9 - arg0.field1033 / 2 - 4);
			} else {
				arg0.method404(var8 + 94 + 4 - arg0.field1032 / 2, 83 - var9 - arg0.field1033 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method179(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field158; var2++) {
			if (arg0.equalsIgnoreCase(field472[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field264.field117)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.S(I)V")
	public final void method180() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.T(I)V")
	public final void method181() {
		if (field89 == 1) {
			if (field90 >= 539 && field90 <= 573 && field91 >= 169 && field91 < 205 && field516[0] != -1) {
				field488 = true;
				field324 = 0;
				field238 = true;
			}

			if (field90 >= 569 && field90 <= 599 && field91 >= 168 && field91 < 205 && field516[1] != -1) {
				field488 = true;
				field324 = 1;
				field238 = true;
			}

			if (field90 >= 597 && field90 <= 627 && field91 >= 168 && field91 < 205 && field516[2] != -1) {
				field488 = true;
				field324 = 2;
				field238 = true;
			}

			if (field90 >= 625 && field90 <= 669 && field91 >= 168 && field91 < 203 && field516[3] != -1) {
				field488 = true;
				field324 = 3;
				field238 = true;
			}

			if (field90 >= 666 && field90 <= 696 && field91 >= 168 && field91 < 205 && field516[4] != -1) {
				field488 = true;
				field324 = 4;
				field238 = true;
			}

			if (field90 >= 694 && field90 <= 724 && field91 >= 168 && field91 < 205 && field516[5] != -1) {
				field488 = true;
				field324 = 5;
				field238 = true;
			}

			if (field90 >= 722 && field90 <= 756 && field91 >= 169 && field91 < 205 && field516[6] != -1) {
				field488 = true;
				field324 = 6;
				field238 = true;
			}

			if (field90 >= 540 && field90 <= 574 && field91 >= 466 && field91 < 502 && field516[7] != -1) {
				field488 = true;
				field324 = 7;
				field238 = true;
			}

			if (field90 >= 572 && field90 <= 602 && field91 >= 466 && field91 < 503 && field516[8] != -1) {
				field488 = true;
				field324 = 8;
				field238 = true;
			}

			if (field90 >= 599 && field90 <= 629 && field91 >= 466 && field91 < 503 && field516[9] != -1) {
				field488 = true;
				field324 = 9;
				field238 = true;
			}

			if (field90 >= 627 && field90 <= 671 && field91 >= 467 && field91 < 502 && field516[10] != -1) {
				field488 = true;
				field324 = 10;
				field238 = true;
			}

			if (field90 >= 669 && field90 <= 699 && field91 >= 466 && field91 < 503 && field516[11] != -1) {
				field488 = true;
				field324 = 11;
				field238 = true;
			}

			if (field90 >= 696 && field90 <= 726 && field91 >= 466 && field91 < 503 && field516[12] != -1) {
				field488 = true;
				field324 = 12;
				field238 = true;
			}

			if (field90 >= 724 && field90 <= 758 && field91 >= 466 && field91 < 502 && field516[13] != -1) {
				field488 = true;
				field324 = 13;
				field238 = true;
				return;
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field476[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			field584[var3] = var2 / 4;
		}
	}
}
