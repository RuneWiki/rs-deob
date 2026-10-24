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
public final class client extends DZXWUJSL {

	@ObfuscatedName("client.L")
	public int field135 = -1;

	@ObfuscatedName("client.M")
	public SWNASVGQ[] field136 = new SWNASVGQ[20];

	@ObfuscatedName("client.O")
	public boolean field138 = false;

	@ObfuscatedName("client.ab")
	public int[] field148 = new int[5];

	@ObfuscatedName("client.gb")
	public MLYYHULT field154 = MLYYHULT.method284(1);

	@ObfuscatedName("client.nb")
	public boolean field161 = true;

	@ObfuscatedName("client.ob")
	public ZWZXPJNQ field162 = new ZWZXPJNQ();

	@ObfuscatedName("client.rb")
	public NUXLZYAZ[] field164 = new NUXLZYAZ[100];

	@ObfuscatedName("client.Cb")
	public int[] field175 = new int[5];

	@ObfuscatedName("client.Db")
	public volatile boolean field176 = false;

	@ObfuscatedName("client.Hb")
	public boolean field180 = false;

	@ObfuscatedName("client.Kb")
	public int field183 = -1;

	@ObfuscatedName("client.Nb")
	public int field186 = 1;

	@ObfuscatedName("client.Ob")
	public boolean[] field187 = new boolean[5];

	@ObfuscatedName("client.Pb")
	public int field188 = 128;

	@ObfuscatedName("client.Ub")
	public int field192 = -1;

	@ObfuscatedName("client.Vb")
	public int field193 = -1;

	@ObfuscatedName("client.cc")
	public SWNASVGQ[] field200 = new SWNASVGQ[100];

	@ObfuscatedName("client.fc")
	public int[] field203 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.gc")
	public int[] field204 = new int[500];

	@ObfuscatedName("client.hc")
	public int[] field205 = new int[500];

	@ObfuscatedName("client.ic")
	public int[] field206 = new int[500];

	@ObfuscatedName("client.jc")
	public int[] field207 = new int[500];

	@ObfuscatedName("client.kc")
	public int field208 = 3;

	@ObfuscatedName("client.lc")
	public boolean field209 = true;

	@ObfuscatedName("client.rc")
	public final int[] field214 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.sc")
	public int[] field215 = new int[50];

	@ObfuscatedName("client.vc")
	public SWNASVGQ[] field217 = new SWNASVGQ[32];

	@ObfuscatedName("client.wc")
	public int[] field218 = new int[33];

	@ObfuscatedName("client.Cc")
	public boolean field224 = false;

	@ObfuscatedName("client.Kc")
	public int[] field230 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Lc")
	public int field231 = 78;

	@ObfuscatedName("client.Mc")
	public int[][] field232 = new int[104][104];

	@ObfuscatedName("client.Oc")
	public boolean field234 = true;

	@ObfuscatedName("client.Pc")
	public MLYYHULT field235 = new MLYYHULT(new byte[5000]);

	@ObfuscatedName("client.Qc")
	public JMUIRIHZ[] field236 = new JMUIRIHZ[16384];

	@ObfuscatedName("client.Sc")
	public int[] field238 = new int[16384];

	@ObfuscatedName("client.Tc")
	public int[] field239 = new int[7];

	@ObfuscatedName("client.Wc")
	public int[] field242 = new int[5];

	@ObfuscatedName("client.cd")
	public boolean field247 = true;

	@ObfuscatedName("client.ed")
	public volatile boolean field248 = false;

	@ObfuscatedName("client.fd")
	public boolean field249 = false;

	@ObfuscatedName("client.sd")
	public int[] field262 = new int[2000];

	@ObfuscatedName("client.td")
	public int[][] field263 = new int[104][104];

	@ObfuscatedName("client.ud")
	public HWEMRKQZ field264 = new HWEMRKQZ();

	@ObfuscatedName("client.vd")
	public byte[] field265 = new byte[16384];

	@ObfuscatedName("client.wd")
	public NUXLZYAZ[] field266 = new NUXLZYAZ[2];

	@ObfuscatedName("client.yd")
	public boolean field268 = false;

	@ObfuscatedName("client.zd")
	public int[] field269 = new int[200];

	@ObfuscatedName("client.Ad")
	public boolean field270 = false;

	@ObfuscatedName("client.Bd")
	public boolean field271 = false;

	@ObfuscatedName("client.Dd")
	public SWNASVGQ[] field273 = new SWNASVGQ[32];

	@ObfuscatedName("client.Kd")
	public int[] field280 = new int[151];

	@ObfuscatedName("client.Nd")
	public boolean field283 = false;

	@ObfuscatedName("client.Qd")
	public RRDZGTNX[] field286 = new RRDZGTNX[5];

	@ObfuscatedName("client.Td")
	public boolean field288 = false;

	@ObfuscatedName("client.Ud")
	public boolean field289 = false;

	@ObfuscatedName("client.Wd")
	public int field291 = -1;

	@ObfuscatedName("client.Zd")
	public int field294 = 2;

	@ObfuscatedName("client.ce")
	public int field297 = 0x766654;

	@ObfuscatedName("client.he")
	public int field302 = -1;

	@ObfuscatedName("client.ie")
	public ZWZXPJNQ field303 = new ZWZXPJNQ();

	@ObfuscatedName("client.oe")
	public int[][][] field308 = new int[4][13][13];

	@ObfuscatedName("client.qe")
	public int[] field310 = new int[1000];

	@ObfuscatedName("client.re")
	public CRC32 field311 = new CRC32();

	@ObfuscatedName("client.se")
	public boolean field312 = false;

	@ObfuscatedName("client.Fe")
	public boolean field322 = true;

	@ObfuscatedName("client.He")
	public int[] field323 = new int[5];

	@ObfuscatedName("client.Qe")
	public int field330 = -1;

	@ObfuscatedName("client.Re")
	public boolean field331 = false;

	@ObfuscatedName("client.Se")
	public String field332 = "";

	@ObfuscatedName("client.We")
	public int[] field336 = new int[4000];

	@ObfuscatedName("client.Xe")
	public int[] field337 = new int[4000];

	@ObfuscatedName("client.Ye")
	public int field338 = -1;

	@ObfuscatedName("client.Ze")
	public int field339 = -1;

	@ObfuscatedName("client.af")
	public ZWZXPJNQ field340 = new ZWZXPJNQ();

	@ObfuscatedName("client.bf")
	public SWNASVGQ[] field341 = new SWNASVGQ[32];

	@ObfuscatedName("client.df")
	public String field343 = "";

	@ObfuscatedName("client.kf")
	public String[] field349 = new String[5];

	@ObfuscatedName("client.lf")
	public boolean[] field350 = new boolean[5];

	@ObfuscatedName("client.of")
	public boolean field353 = false;

	@ObfuscatedName("client.uf")
	public String[] field359 = new String[200];

	@ObfuscatedName("client.Bf")
	public int field366 = 2;

	@ObfuscatedName("client.Cf")
	public MLYYHULT field367 = MLYYHULT.method284(1);

	@ObfuscatedName("client.If")
	public String field373 = "";

	@ObfuscatedName("client.Kf")
	public String[] field375 = new String[100];

	@ObfuscatedName("client.Lf")
	public int[] field376 = new int[100];

	@ObfuscatedName("client.Nf")
	public boolean field378 = false;

	@ObfuscatedName("client.Rf")
	public int field380 = 1;

	@ObfuscatedName("client.Sf")
	public int[] field381 = new int[100];

	@ObfuscatedName("client.Tf")
	public String[] field382 = new String[100];

	@ObfuscatedName("client.Uf")
	public String[] field383 = new String[100];

	@ObfuscatedName("client.cg")
	public int field389 = 2048;

	@ObfuscatedName("client.dg")
	public int field390 = 2047;

	@ObfuscatedName("client.eg")
	public CHKMTWJC[] field391 = new CHKMTWJC[field389];

	@ObfuscatedName("client.gg")
	public int[] field393 = new int[field389];

	@ObfuscatedName("client.ig")
	public int[] field395 = new int[field389];

	@ObfuscatedName("client.jg")
	public MLYYHULT[] field396 = new MLYYHULT[field389];

	@ObfuscatedName("client.kg")
	public boolean field397 = false;

	@ObfuscatedName("client.mg")
	public MLYYHULT field399 = MLYYHULT.method284(1);

	@ObfuscatedName("client.ng")
	public String field400 = "";

	@ObfuscatedName("client.qg")
	public boolean field402 = false;

	@ObfuscatedName("client.sg")
	public int[] field404 = new int[151];

	@ObfuscatedName("client.ug")
	public volatile boolean field406 = false;

	@ObfuscatedName("client.Cg")
	public int field413 = 50;

	@ObfuscatedName("client.Dg")
	public int[] field414 = new int[field413];

	@ObfuscatedName("client.Eg")
	public int[] field415 = new int[field413];

	@ObfuscatedName("client.Fg")
	public int[] field416 = new int[field413];

	@ObfuscatedName("client.Gg")
	public int[] field417 = new int[field413];

	@ObfuscatedName("client.Hg")
	public int[] field418 = new int[field413];

	@ObfuscatedName("client.Ig")
	public int[] field419 = new int[field413];

	@ObfuscatedName("client.Jg")
	public int[] field420 = new int[field413];

	@ObfuscatedName("client.Kg")
	public String[] field421 = new String[field413];

	@ObfuscatedName("client.Mg")
	public SWNASVGQ[] field422 = new SWNASVGQ[8];

	@ObfuscatedName("client.Ng")
	public boolean field423 = false;

	@ObfuscatedName("client.Tg")
	public int[][] field427 = new int[104][104];

	@ObfuscatedName("client.Ug")
	public int field428 = -1;

	@ObfuscatedName("client.Wg")
	public NUXLZYAZ[] field430 = new NUXLZYAZ[13];

	@ObfuscatedName("client.Xg")
	public String field431 = "";

	@ObfuscatedName("client.Yg")
	public String field432 = "";

	@ObfuscatedName("client.bh")
	public SWNASVGQ[] field434 = new SWNASVGQ[1000];

	@ObfuscatedName("client.eh")
	public int[] field436 = new int[256];

	@ObfuscatedName("client.hh")
	public boolean field438 = false;

	@ObfuscatedName("client.kh")
	public int[] field441 = new int[HJKFAAYN.field774];

	@ObfuscatedName("client.ph")
	public int[] field445 = new int[HJKFAAYN.field774];

	@ObfuscatedName("client.qh")
	public int field446 = -1;

	@ObfuscatedName("client.th")
	public int field448 = 0x332D25;

	@ObfuscatedName("client.Ch")
	public int field456 = -1;

	@ObfuscatedName("client.Dh")
	public boolean field457 = false;

	@ObfuscatedName("client.Hh")
	public long[] field460 = new long[200];

	@ObfuscatedName("client.Nh")
	public int field466 = -1;

	@ObfuscatedName("client.Vh")
	public String field473 = "";

	@ObfuscatedName("client.Wh")
	public String field474 = "";

	@ObfuscatedName("client.ai")
	public boolean field478 = false;

	@ObfuscatedName("client.bi")
	public int field479 = 0x23201B;

	@ObfuscatedName("client.ci")
	public boolean field480 = false;

	@ObfuscatedName("client.li")
	public int[] field488 = new int[2000];

	@ObfuscatedName("client.mi")
	public int[] field489 = new int[33];

	@ObfuscatedName("client.vi")
	public long[] field497 = new long[100];

	@ObfuscatedName("client.wi")
	public OTPPFNKL[] field498 = new OTPPFNKL[4];

	@ObfuscatedName("client.Hi")
	public int field509 = 2;

	@ObfuscatedName("client.Ji")
	public int field510 = -1;

	@ObfuscatedName("client.Ki")
	public boolean field511 = false;

	@ObfuscatedName("client.Ri")
	public int[] field518 = new int[1000];

	@ObfuscatedName("client.Si")
	public int[] field519 = new int[1000];

	@ObfuscatedName("client.Vi")
	public int[] field521 = new int[50];

	@ObfuscatedName("client.Yi")
	public int[] field524 = new int[9];

	@ObfuscatedName("client.Zi")
	public int field525 = -1;

	@ObfuscatedName("client.bj")
	public int[] field527 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.lj")
	public String field537 = "";

	@ObfuscatedName("client.rj")
	public int[] field543 = new int[5];

	@ObfuscatedName("client.uj")
	public String[] field546 = new String[500];

	@ObfuscatedName("client.Aj")
	public String field551 = "";

	@ObfuscatedName("client.Dj")
	public int field553 = -1;

	@ObfuscatedName("client.Kj")
	public ZWZXPJNQ[][][] field560 = new ZWZXPJNQ[4][104][104];

	@ObfuscatedName("client.Lj")
	public final int field561 = 100;

	@ObfuscatedName("client.Mj")
	public int[] field562 = new int[100];

	@ObfuscatedName("client.Oj")
	public int[] field563 = new int[HJKFAAYN.field774];

	@ObfuscatedName("client.Pj")
	public int[] field564 = new int[50];

	@ObfuscatedName("client.Qj")
	public int field565 = 0x4D4233;

	@ObfuscatedName("client.N")
	public static int[] field137 = new int[99];

	@ObfuscatedName("client.V")
	public static int[] field144 = new int[32];

	@ObfuscatedName("client.Y")
	public static String field147 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.hb")
	public static BigInteger field155 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Xd")
	public static final int[][] field292 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.xe")
	public static int field316 = 10;

	@ObfuscatedName("client.ze")
	public static boolean field318 = true;

	@ObfuscatedName("client.pf")
	public static BigInteger field354 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Vf")
	public static final int[] field384 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.P")
	public int field139;

	@ObfuscatedName("client.Q")
	public int field140;

	@ObfuscatedName("client.R")
	public int field141;

	@ObfuscatedName("client.S")
	public int field142;

	@ObfuscatedName("client.T")
	public int field143;

	@ObfuscatedName("client.X")
	public int field146;

	@ObfuscatedName("client.ib")
	public int field156;

	@ObfuscatedName("client.jb")
	public int field157;

	@ObfuscatedName("client.kb")
	public int field158;

	@ObfuscatedName("client.mb")
	public int field160;

	@ObfuscatedName("client.qb")
	public int field163;

	@ObfuscatedName("client.wb")
	public int field169;

	@ObfuscatedName("client.xb")
	public int field170;

	@ObfuscatedName("client.yb")
	public int field171;

	@ObfuscatedName("client.zb")
	public int field172;

	@ObfuscatedName("client.Ab")
	public int field173;

	@ObfuscatedName("client.Bb")
	public int field174;

	@ObfuscatedName("client.Fb")
	public int field178;

	@ObfuscatedName("client.Gb")
	public int field179;

	@ObfuscatedName("client.Ib")
	public int field181;

	@ObfuscatedName("client.Jb")
	public int field182;

	@ObfuscatedName("client.Lb")
	public int field184;

	@ObfuscatedName("client.Mb")
	public int field185;

	@ObfuscatedName("client.Qb")
	public int field189;

	@ObfuscatedName("client.Rb")
	public int field190;

	@ObfuscatedName("client.Sb")
	public int field191;

	@ObfuscatedName("client.Wb")
	public int field194;

	@ObfuscatedName("client.Xb")
	public int field195;

	@ObfuscatedName("client.Yb")
	public int field196;

	@ObfuscatedName("client.Zb")
	public int field197;

	@ObfuscatedName("client.ac")
	public int field198;

	@ObfuscatedName("client.dc")
	public int field201;

	@ObfuscatedName("client.ec")
	public int field202;

	@ObfuscatedName("client.tc")
	public int field216;

	@ObfuscatedName("client.xc")
	public int field219;

	@ObfuscatedName("client.yc")
	public int field220;

	@ObfuscatedName("client.zc")
	public int field221;

	@ObfuscatedName("client.Ac")
	public int field222;

	@ObfuscatedName("client.Bc")
	public int field223;

	@ObfuscatedName("client.Gc")
	public int field226;

	@ObfuscatedName("client.Hc")
	public int field227;

	@ObfuscatedName("client.Ic")
	public int field228;

	@ObfuscatedName("client.Jc")
	public int field229;

	@ObfuscatedName("client.Rc")
	public int field237;

	@ObfuscatedName("client.Vc")
	public int field241;

	@ObfuscatedName("client.Yc")
	public int field243;

	@ObfuscatedName("client.Zc")
	public int field244;

	@ObfuscatedName("client.ad")
	public int field245;

	@ObfuscatedName("client.bd")
	public int field246;

	@ObfuscatedName("client.Cd")
	public int field272;

	@ObfuscatedName("client.Ed")
	public static int field274;

	@ObfuscatedName("client.Fd")
	public int field275;

	@ObfuscatedName("client.Gd")
	public int field276;

	@ObfuscatedName("client.Hd")
	public int field277;

	@ObfuscatedName("client.Id")
	public int field278;

	@ObfuscatedName("client.Jd")
	public int field279;

	@ObfuscatedName("client.Od")
	public static int field284;

	@ObfuscatedName("client.Pd")
	public static int field285;

	@ObfuscatedName("client.Vd")
	public static int field290;

	@ObfuscatedName("client.Yd")
	public int field293;

	@ObfuscatedName("client.ae")
	public int field295;

	@ObfuscatedName("client.be")
	public int field296;

	@ObfuscatedName("client.fe")
	public int field300;

	@ObfuscatedName("client.ge")
	public int field301;

	@ObfuscatedName("client.pe")
	public int field309;

	@ObfuscatedName("client.ue")
	public int field313;

	@ObfuscatedName("client.ve")
	public int field314;

	@ObfuscatedName("client.we")
	public static int field315;

	@ObfuscatedName("client.ye")
	public static int field317;

	@ObfuscatedName("client.De")
	public int field320;

	@ObfuscatedName("client.Ee")
	public int field321;

	@ObfuscatedName("client.Ie")
	public int field324;

	@ObfuscatedName("client.Oe")
	public static int field328;

	@ObfuscatedName("client.cf")
	public static int field342;

	@ObfuscatedName("client.ef")
	public int field344;

	@ObfuscatedName("client.ff")
	public int field345;

	@ObfuscatedName("client.gf")
	public int field346;

	@ObfuscatedName("client.hf")
	public int field347;

	@ObfuscatedName("client.jf")
	public int field348;

	@ObfuscatedName("client.nf")
	public int field352;

	@ObfuscatedName("client.qf")
	public int field355;

	@ObfuscatedName("client.vf")
	public int field360;

	@ObfuscatedName("client.wf")
	public int field361;

	@ObfuscatedName("client.xf")
	public int field362;

	@ObfuscatedName("client.yf")
	public int field363;

	@ObfuscatedName("client.Af")
	public int field365;

	@ObfuscatedName("client.Jf")
	public int field374;

	@ObfuscatedName("client.Mf")
	public int field377;

	@ObfuscatedName("client.Qf")
	public int field379;

	@ObfuscatedName("client.Xf")
	public int field385;

	@ObfuscatedName("client.Yf")
	public int field386;

	@ObfuscatedName("client.Zf")
	public int field387;

	@ObfuscatedName("client.fg")
	public int field392;

	@ObfuscatedName("client.hg")
	public int field394;

	@ObfuscatedName("client.lg")
	public int field398;

	@ObfuscatedName("client.pg")
	public int field401;

	@ObfuscatedName("client.rg")
	public static int field403;

	@ObfuscatedName("client.xg")
	public int field408;

	@ObfuscatedName("client.yg")
	public int field409;

	@ObfuscatedName("client.zg")
	public int field410;

	@ObfuscatedName("client.Ag")
	public static int field411;

	@ObfuscatedName("client.Bg")
	public int field412;

	@ObfuscatedName("client.Og")
	public int field424;

	@ObfuscatedName("client.Pg")
	public int field425;

	@ObfuscatedName("client.Rg")
	public int field426;

	@ObfuscatedName("client.Vg")
	public static int field429;

	@ObfuscatedName("client.dh")
	public int field435;

	@ObfuscatedName("client.gh")
	public int field437;

	@ObfuscatedName("client.lh")
	public int field442;

	@ObfuscatedName("client.mh")
	public int field443;

	@ObfuscatedName("client.uh")
	public static int field449;

	@ObfuscatedName("client.zh")
	public int field454;

	@ObfuscatedName("client.Eh")
	public int field458;

	@ObfuscatedName("client.Fh")
	public int field459;

	@ObfuscatedName("client.Ih")
	public int field461;

	@ObfuscatedName("client.Jh")
	public int field462;

	@ObfuscatedName("client.Kh")
	public int field463;

	@ObfuscatedName("client.Lh")
	public int field464;

	@ObfuscatedName("client.Mh")
	public int field465;

	@ObfuscatedName("client.Oh")
	public int field467;

	@ObfuscatedName("client.Ph")
	public int field468;

	@ObfuscatedName("client.Qh")
	public int field469;

	@ObfuscatedName("client.Rh")
	public int field470;

	@ObfuscatedName("client.Sh")
	public int field471;

	@ObfuscatedName("client.Th")
	public int field472;

	@ObfuscatedName("client.Xh")
	public int field475;

	@ObfuscatedName("client.Yh")
	public int field476;

	@ObfuscatedName("client.Zh")
	public int field477;

	@ObfuscatedName("client.di")
	public int field481;

	@ObfuscatedName("client.ki")
	public static int field487;

	@ObfuscatedName("client.oi")
	public int field491;

	@ObfuscatedName("client.pi")
	public static int field492;

	@ObfuscatedName("client.qi")
	public int field493;

	@ObfuscatedName("client.ri")
	public int field494;

	@ObfuscatedName("client.xi")
	public int field499;

	@ObfuscatedName("client.yi")
	public int field500;

	@ObfuscatedName("client.zi")
	public int field501;

	@ObfuscatedName("client.Ai")
	public int field502;

	@ObfuscatedName("client.Bi")
	public int field503;

	@ObfuscatedName("client.Ci")
	public int field504;

	@ObfuscatedName("client.Ei")
	public int field506;

	@ObfuscatedName("client.Fi")
	public int field507;

	@ObfuscatedName("client.Gi")
	public int field508;

	@ObfuscatedName("client.Qi")
	public int field517;

	@ObfuscatedName("client.Ui")
	public int field520;

	@ObfuscatedName("client.Wi")
	public int field522;

	@ObfuscatedName("client.Xi")
	public int field523;

	@ObfuscatedName("client.aj")
	public int field526;

	@ObfuscatedName("client.oj")
	public static int field540;

	@ObfuscatedName("client.pj")
	public static int field541;

	@ObfuscatedName("client.qj")
	public int field542;

	@ObfuscatedName("client.sj")
	public int field544;

	@ObfuscatedName("client.tj")
	public int field545;

	@ObfuscatedName("client.vj")
	public int field547;

	@ObfuscatedName("client.xj")
	public int field548;

	@ObfuscatedName("client.yj")
	public int field549;

	@ObfuscatedName("client.zj")
	public int field550;

	@ObfuscatedName("client.Cj")
	public int field552;

	@ObfuscatedName("client.Fj")
	public int field555;

	@ObfuscatedName("client.Gj")
	public int field556;

	@ObfuscatedName("client.Hj")
	public int field557;

	@ObfuscatedName("client.Ij")
	public int field558;

	@ObfuscatedName("client.Jj")
	public int field559;

	@ObfuscatedName("client.Rj")
	public int field566;

	@ObfuscatedName("client.Sj")
	public int field567;

	@ObfuscatedName("client.Yj")
	public int field572;

	@ObfuscatedName("client.ak")
	public int field574;

	@ObfuscatedName("client.bk")
	public int field575;

	@ObfuscatedName("client.W")
	public long field145;

	@ObfuscatedName("client.Eb")
	public long field177;

	@ObfuscatedName("client.vh")
	public long field450;

	@ObfuscatedName("client.Bh")
	public long field455;

	@ObfuscatedName("client.Di")
	public long field505;

	@ObfuscatedName("client.rh")
	public static CHKMTWJC field447;

	@ObfuscatedName("client.Ec")
	public FJSXIAWX field225;

	@ObfuscatedName("client.lb")
	public GWOEELWB field159;

	@ObfuscatedName("client.nj")
	public KPIQNZMJ field539;

	@ObfuscatedName("client.bb")
	public NUXLZYAZ field149;

	@ObfuscatedName("client.cb")
	public NUXLZYAZ field150;

	@ObfuscatedName("client.db")
	public NUXLZYAZ field151;

	@ObfuscatedName("client.eb")
	public NUXLZYAZ field152;

	@ObfuscatedName("client.fb")
	public NUXLZYAZ field153;

	@ObfuscatedName("client.gd")
	public NUXLZYAZ field250;

	@ObfuscatedName("client.hd")
	public NUXLZYAZ field251;

	@ObfuscatedName("client.id")
	public NUXLZYAZ field252;

	@ObfuscatedName("client.rf")
	public NUXLZYAZ field356;

	@ObfuscatedName("client.sf")
	public NUXLZYAZ field357;

	@ObfuscatedName("client.tf")
	public NUXLZYAZ field358;

	@ObfuscatedName("client.Df")
	public NUXLZYAZ field368;

	@ObfuscatedName("client.Ef")
	public NUXLZYAZ field369;

	@ObfuscatedName("client.Ff")
	public NUXLZYAZ field370;

	@ObfuscatedName("client.Gf")
	public NUXLZYAZ field371;

	@ObfuscatedName("client.Hf")
	public NUXLZYAZ field372;

	@ObfuscatedName("client.ih")
	public NUXLZYAZ field439;

	@ObfuscatedName("client.jh")
	public NUXLZYAZ field440;

	@ObfuscatedName("client.ti")
	public NUXLZYAZ field495;

	@ObfuscatedName("client.ui")
	public NUXLZYAZ field496;

	@ObfuscatedName("client.hi")
	public SSCDCBAC field484;

	@ObfuscatedName("client.ke")
	public SSVSGKGT field304;

	@ObfuscatedName("client.le")
	public SSVSGKGT field305;

	@ObfuscatedName("client.me")
	public SSVSGKGT field306;

	@ObfuscatedName("client.ne")
	public SSVSGKGT field307;

	@ObfuscatedName("client.K")
	public SWNASVGQ field134;

	@ObfuscatedName("client.Ld")
	public SWNASVGQ field281;

	@ObfuscatedName("client.Md")
	public SWNASVGQ field282;

	@ObfuscatedName("client.Te")
	public SWNASVGQ field333;

	@ObfuscatedName("client.Ue")
	public SWNASVGQ field334;

	@ObfuscatedName("client.nh")
	public SWNASVGQ field444;

	@ObfuscatedName("client.ii")
	public SWNASVGQ field485;

	@ObfuscatedName("client.ji")
	public SWNASVGQ field486;

	@ObfuscatedName("client.Li")
	public SWNASVGQ field512;

	@ObfuscatedName("client.Mi")
	public SWNASVGQ field513;

	@ObfuscatedName("client.Ni")
	public SWNASVGQ field514;

	@ObfuscatedName("client.Oi")
	public SWNASVGQ field515;

	@ObfuscatedName("client.Pi")
	public SWNASVGQ field516;

	@ObfuscatedName("client.mj")
	public SWNASVGQ field538;

	@ObfuscatedName("client.Zj")
	public SWNASVGQ field573;

	@ObfuscatedName("client.mf")
	public TAWLWNCF field351;

	@ObfuscatedName("client.sb")
	public WOKQCNXG field165;

	@ObfuscatedName("client.tb")
	public WOKQCNXG field166;

	@ObfuscatedName("client.ub")
	public WOKQCNXG field167;

	@ObfuscatedName("client.vb")
	public WOKQCNXG field168;

	@ObfuscatedName("client.jd")
	public WOKQCNXG field253;

	@ObfuscatedName("client.kd")
	public WOKQCNXG field254;

	@ObfuscatedName("client.ld")
	public WOKQCNXG field255;

	@ObfuscatedName("client.md")
	public WOKQCNXG field256;

	@ObfuscatedName("client.nd")
	public WOKQCNXG field257;

	@ObfuscatedName("client.od")
	public WOKQCNXG field258;

	@ObfuscatedName("client.pd")
	public WOKQCNXG field259;

	@ObfuscatedName("client.qd")
	public WOKQCNXG field260;

	@ObfuscatedName("client.rd")
	public WOKQCNXG field261;

	@ObfuscatedName("client.Le")
	public WOKQCNXG field325;

	@ObfuscatedName("client.Me")
	public WOKQCNXG field326;

	@ObfuscatedName("client.Ne")
	public WOKQCNXG field327;

	@ObfuscatedName("client.cj")
	public WOKQCNXG field528;

	@ObfuscatedName("client.dj")
	public WOKQCNXG field529;

	@ObfuscatedName("client.ej")
	public WOKQCNXG field530;

	@ObfuscatedName("client.fj")
	public WOKQCNXG field531;

	@ObfuscatedName("client.gj")
	public WOKQCNXG field532;

	@ObfuscatedName("client.hj")
	public WOKQCNXG field533;

	@ObfuscatedName("client.ij")
	public WOKQCNXG field534;

	@ObfuscatedName("client.jj")
	public WOKQCNXG field535;

	@ObfuscatedName("client.kj")
	public WOKQCNXG field536;

	@ObfuscatedName("client.vg")
	public YBAERVYW field407;

	@ObfuscatedName("client.bc")
	public String field199;

	@ObfuscatedName("client.Ve")
	public String field335;

	@ObfuscatedName("client.zf")
	public String field364;

	@ObfuscatedName("client.ag")
	public String field388;

	@ObfuscatedName("client.ni")
	public Socket field490;

	@ObfuscatedName("client.xd")
	public static boolean field267;

	@ObfuscatedName("client.Ae")
	public static boolean field319;

	@ObfuscatedName("client.tg")
	public static boolean field405;

	@ObfuscatedName("client.Zg")
	public static boolean field433;

	@ObfuscatedName("client.mc")
	public int[] field210;

	@ObfuscatedName("client.nc")
	public int[] field211;

	@ObfuscatedName("client.oc")
	public int[] field212;

	@ObfuscatedName("client.pc")
	public int[] field213;

	@ObfuscatedName("client.de")
	public int[] field298;

	@ObfuscatedName("client.ee")
	public int[] field299;

	@ObfuscatedName("client.wh")
	public int[] field451;

	@ObfuscatedName("client.xh")
	public int[] field452;

	@ObfuscatedName("client.yh")
	public int[] field453;

	@ObfuscatedName("client.fi")
	public int[] field482;

	@ObfuscatedName("client.gi")
	public int[] field483;

	@ObfuscatedName("client.Tj")
	public int[] field568;

	@ObfuscatedName("client.Uj")
	public int[] field569;

	@ObfuscatedName("client.Vj")
	public int[] field570;

	@ObfuscatedName("client.Wj")
	public int[] field571;

	@ObfuscatedName("client.Uc")
	public NUXLZYAZ[] field240;

	@ObfuscatedName("client.Pe")
	public byte[][] field329;

	@ObfuscatedName("client.Ej")
	public byte[][] field554;

	@ObfuscatedName("client.Rd")
	public byte[][][] field287;

	@ObfuscatedName("client.Nc")
	public int[][][] field233;

	public final void run() {
		if (field406) {
			method72();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IZIIIIIIIIII)Z")
	public final boolean method64(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field427[var14][var15] = 0;
				field263[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg9;
		field427[arg8][arg9] = 99;
		field263[arg8][arg9] = 0;
		byte var18 = 0;
		int var19 = 0;
		field336[var18] = arg8;
		int var35 = var18 + 1;
		field337[var18] = arg9;
		boolean var20 = false;
		int var21 = field336.length;
		int[][] var22 = field498[field545].field1069;
		while (var35 != var19) {
			var16 = field336[var19];
			var17 = field337[var19];
			var19 = (var19 + 1) % var21;

			if (arg4 == var16 && arg7 == var17) {
				var20 = true;
				break;
			}

			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && field498[field545].method362(arg6, arg7, arg4, var17, arg2 - 1, var16)) {
					var20 = true;
					break;
				}

				if (arg2 < 10 && field498[field545].method363(arg4, arg2 - 1, arg7, arg6, var16, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg3 != 0 && arg5 != 0 && field498[field545].method364(arg5, var17, var16, arg4, arg3, arg7, arg10)) {
				var20 = true;
				break;
			}

			int var23 = field263[var16][var17] + 1;
			if (var16 > 0 && field427[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field336[var35] = var16 - 1;
				field337[var35] = var17;
				var35 = (var35 + 1) % var21;
				field427[var16 - 1][var17] = 2;
				field263[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field427[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field336[var35] = var16 + 1;
				field337[var35] = var17;
				var35 = (var35 + 1) % var21;
				field427[var16 + 1][var17] = 8;
				field263[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field427[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field336[var35] = var16;
				field337[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field427[var16][var17 - 1] = 1;
				field263[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field427[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field336[var35] = var16;
				field337[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field427[var16][var17 + 1] = 4;
				field263[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field427[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field336[var35] = var16 - 1;
				field337[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field427[var16 - 1][var17 - 1] = 3;
				field263[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field427[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field336[var35] = var16 + 1;
				field337[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field427[var16 + 1][var17 - 1] = 9;
				field263[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field427[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field336[var35] = var16 - 1;
				field337[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field427[var16 - 1][var17 + 1] = 6;
				field263[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field427[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field336[var35] = var16 + 1;
				field337[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field427[var16 + 1][var17 + 1] = 12;
				field263[var16 + 1][var17 + 1] = var23;
			}
		}

		field547 = 0;
		if (!var20) {
			if (arg1) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg4 - var25; var26 <= arg4 + var25; var26++) {
						for (int var27 = arg7 - var25; var27 <= arg7 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field263[var26][var27] < var24) {
								var24 = field263[var26][var27];
								var16 = var26;
								var17 = var27;
								field547 = 1;
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
		field336[var28] = var16;
		int var36 = var28 + 1;
		field337[var28] = var17;
		int var29;
		int var30 = var29 = field427[var16][var17];
		while (arg8 != var16 || arg9 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field336[var36] = var16;
				field337[var36++] = var17;
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

			var30 = field427[var16][var17];
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
		int var32 = field336[var36];
		int var33 = field337[var36];

		if (arg0 == 0) {
			field367.method285(246);
			field367.method286(var31 + var31 + 3);
		}

		if (arg0 == 1) {
			field367.method285(147);
			field367.method286(var31 + var31 + 3 + 14);
		}

		if (arg0 == 2) {
			field367.method285(216);
			field367.method286(var31 + var31 + 3);
		}

		field367.method312(field660[5] == 1 ? 1 : 0);
		field367.method321(field227 + var33);
		field442 = field336[0];
		field443 = field337[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field367.method312(field336[var36] - var32);
			field367.method313(field337[var36] - var33);
		}

		field367.method321(field226 + var32);
		return true;
	}

	@ObfuscatedName("client.a(IBII)Z")
	public final boolean method65(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 14 & 0x7FFF;
		int var5 = field351.method517(field545, arg0, arg1, arg2);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		field411++;
		if (field411 > 1184) {
			field411 = 0;
			field367.method285(127);
			field367.method286(0);
			int var8 = field367.field963;
			field367.method287(8709);
			field367.method287(18795);

			if ((int) (Math.random() * 2.0D) == 0) {
				field367.method286(235);
			}

			field367.method286(38);

			if ((int) (Math.random() * 2.0D) == 0) {
				field367.method287(55800);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field367.method287(42667);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				field367.method286(1);
			}

			field367.method286(163);
			field367.method287(42960);

			if ((int) (Math.random() * 2.0D) == 0) {
				field367.method286(194);
			}

			field367.method295(field367.field963 - var8);
		}

		if (var6 == 10 || var6 == 11 || var6 == 22) {
			LYSBQDHB var9 = LYSBQDHB.method282(var4);
			int var10;
			int var11;
			if (var7 == 0 || var7 == 2) {
				var10 = var9.field882;
				var11 = var9.field891;
			} else {
				var10 = var9.field891;
				var11 = var9.field882;
			}

			int var12 = var9.field892;
			if (var7 != 0) {
				var12 = (var12 >> 4 - var7) + (var12 << var7 & 0xF);
			}

			method64(2, false, 0, var10, arg0, var11, 0, arg1, field447.field1003[0], field447.field1004[0], var12);
		} else {
			method64(2, false, var6 + 1, 0, arg0, 0, var7, arg1, field447.field1003[0], field447.field1004[0], 0);
		}

		field499 = field657;
		field500 = field658;
		field502 = 2;
		field501 = 0;
		return true;
	}

	@ObfuscatedName("client.e(I)V")
	public final void method66() {
		field480 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field239[var1] = -1;
			for (int var2 = 0; var2 < NQIAMATB.field980; var2++) {
				if (!NQIAMATB.field981[var2].field987 && NQIAMATB.field981[var2].field982 == var1 + (field247 ? 0 : 7)) {
					field239[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILMLYYHULT;B)V")
	public final void method67(int arg0, MLYYHULT arg1) {
		field309 = 0;
		field394 = 0;
		method119(arg0, arg1);
		method163(arg1, arg0);
		method146(arg0, arg1);
		method125(arg1, arg0);

		for (int var3 = 0; var3 < field309; var3++) {
			int var4 = field310[var3];
			if (field449 != field391[var4].field1028) {
				field391[var4] = null;
			}
		}

		if (arg1.field963 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field963 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field392; var5++) {
			if (field391[field393[var5]] == null) {
				signlink.reporterror(field473 + " null entry in pl list - pos:" + var5 + " size:" + field392);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method68() {
		short var1 = 256;

		if (field566 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field566 > 768) {
					field210[var2] = method171(1024 - field566, field211[var2], field212[var2]);
				} else if (field566 > 256) {
					field210[var2] = field212[var2];
				} else {
					field210[var2] = method171(256 - field566, field212[var2], field211[var2]);
				}
			}
		} else if (field567 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field567 > 768) {
					field210[var3] = method171(1024 - field567, field211[var3], field213[var3]);
				} else if (field567 > 256) {
					field210[var3] = field213[var3];
				} else {
					field210[var3] = method171(256 - field567, field213[var3], field211[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field210[var4] = field211[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field531.field1431[var5] = field333.field1245[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field436[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field482[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field210[var12];
					int var15 = field531.field1431[var7];
					field531.field1431[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field531.method579(0, field642, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field532.field1431[var16] = field334.field1245[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field436[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field482[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field210[var23];
					int var26 = field532.field1431[var18];
					field532.field1431[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field532.method579(0, field642, 637);
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;I)V")
	public final void method69(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field553 != -1) {
			field199 = arg2;
			field656 = 0;
		}

		if (field525 == -1) {
			field457 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field381[var4] = field381[var4 - 1];
			field382[var4] = field382[var4 - 1];
			field383[var4] = field383[var4 - 1];
		}

		field381[0] = arg0;
		field382[0] = arg1;
		field383[0] = arg2;
	}

	@ObfuscatedName("client.b(III)Z")
	public final boolean method70(int arg0, int arg1) {
		boolean var3 = false;
		HWEMRKQZ var4 = HWEMRKQZ.method256(arg0);
		for (int var5 = 0; var5 < var4.field811.length && var4.field811[var5] != -1; var5++) {
			HWEMRKQZ var6 = HWEMRKQZ.method256(var4.field811[var5]);
			if (var6.field793 == 1) {
				var3 |= method70(var6.field805, arg1);
			}

			if (var6.field793 == 6 && (var6.field794 != -1 || var6.field795 != -1)) {
				boolean var7 = method73(var6);
				int var8;
				if (var7) {
					var8 = var6.field795;
				} else {
					var8 = var6.field794;
				}

				if (var8 != -1) {
					UVDKTGZK var9 = UVDKTGZK.field1357[var8];
					var6.field818 += arg1;
					while (var6.field818 > var9.method562(var6.field840)) {
						var6.field818 -= var9.method562(var6.field840) + 1;
						var6.field840++;
						if (var6.field840 >= var9.field1358) {
							var6.field840 -= var9.field1362;
							if (var6.field840 < 0 || var6.field840 >= var9.field1358) {
								var6.field840 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field793 == 6 && var6.field823 != 0) {
				int var10 = var6.field823 >> 16;
				int var11 = var6.field823 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field782 = var6.field782 + var10 & 0x7FF;
				var6.field783 = var6.field783 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(II)V")
	public final void method71(int arg0) {
		int var2 = KTJKDKKM.field865[arg0].field873;
		if (var2 != 0) {
			int var3 = field262[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					PNDCOEKM.method428(0.9D);
				}

				if (var3 == 2) {
					PNDCOEKM.method428(0.8D);
				}

				if (var3 == 3) {
					PNDCOEKM.method428(0.7D);
				}

				if (var3 == 4) {
					PNDCOEKM.method428(0.6D);
				}

				PICYKCUA.field1084.method540();
				field402 = true;
			}

			if (var2 == 3) {
				boolean var4 = field209;

				if (var3 == 0) {
					method207(field209, 0);
					field209 = true;
				}

				if (var3 == 1) {
					method207(field209, -400);
					field209 = true;
				}

				if (var3 == 2) {
					method207(field209, -800);
					field209 = true;
				}

				if (var3 == 3) {
					method207(field209, -1200);
					field209 = true;
				}

				if (var3 == 4) {
					field209 = false;
				}

				if (field209 != var4 && !field319) {
					if (field209) {
						field160 = field510;
						field161 = true;
						field225.method237(2, field160);
					} else {
						method209();
					}

					field410 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field322 = true;
					method156(0);
				}

				if (var3 == 1) {
					field322 = true;
					method156(-400);
				}

				if (var3 == 2) {
					field322 = true;
					method156(-800);
				}

				if (var3 == 3) {
					field322 = true;
					method156(-1200);
				}

				if (var3 == 4) {
					field322 = false;
				}
			}

			if (var2 == 5) {
				field522 = var3;
			}

			if (var2 == 6) {
				field301 = var3;
			}

			if (var2 == 8) {
				field437 = var3;
				field457 = true;
			}

			if (var2 == 9) {
				field321 = var3;
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method72() {
		field176 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field248) {
				field408++;
				method149();
				method149();
				method68();
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

		field176 = false;
	}

	@ObfuscatedName("client.a(LHWEMRKQZ;I)Z")
	public final boolean method73(HWEMRKQZ arg0) {
		if (arg0.field834 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field834.length; var2++) {
			int var3 = method127(var2, arg0);
			int var4 = arg0.field808[var2];
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

	@ObfuscatedName("client.a(LNXRPKSXU;ZI)V")
	public final void method74(NXRPKSXU arg0, int arg1) {
		method75(arg0.field1015, arg0.field1014, arg1);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method75(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method80(field545, arg1, arg0) - arg2;
			arg1 -= field555;
			var4 -= field556;
			arg0 -= field557;
			int var5 = CADBNSXE.field79[field558];
			int var6 = CADBNSXE.field80[field558];
			int var7 = CADBNSXE.field79[field559];
			int var8 = CADBNSXE.field80[field559];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field338 = (var9 << 9) / arg0 + PNDCOEKM.field1135;
				field339 = (var11 << 9) / arg0 + PNDCOEKM.field1136;
			} else {
				field338 = -1;
				field339 = -1;
			}
		} else {
			field338 = -1;
			field339 = -1;
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method76() {
		field166.method578();

		if (field542 == 2) {
			byte[] var1 = field251.field988;
			int[] var2 = UKUXLUWP.field1345;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field573.method478(field218, field489, 0, 256, 0, 25, 25, 33, field189, 33);
			field167.method578();
			PNDCOEKM.field1141 = field570;
		} else {
			int var5 = field293 + field189 & 0x7FF;
			int var6 = field447.field1014 / 32 + 48;
			int var7 = 464 - field447.field1015 / 32;
			field444.method478(field404, field280, 5, field185 + 256, 25, var6, var7, 146, var5, 151);
			field573.method478(field218, field489, 0, 256, 0, 25, 25, 33, field189, 33);

			for (int var8 = 0; var8 < field517; var8++) {
				int var9 = field518[var8] * 4 + 2 - field447.field1014 / 32;
				int var10 = field519[var8] * 4 + 2 - field447.field1015 / 32;
				method143(var9, var10, field434[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					ZWZXPJNQ var13 = field560[field545][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field447.field1014 / 32;
						int var15 = var12 * 4 + 2 - field447.field1015 / 32;
						method143(var14, var15, field512);
					}
				}
			}

			for (int var16 = 0; var16 < field237; var16++) {
				JMUIRIHZ var17 = field236[field238[var16]];
				if (var17 != null && var17.method38()) {
					VWKJSKWX var18 = var17.field853;
					if (var18.field1400 != null) {
						var18 = var18.method570();
					}

					if (var18 != null && var18.field1388 && var18.field1396) {
						int var19 = var17.field1014 / 32 - field447.field1014 / 32;
						int var20 = var17.field1015 / 32 - field447.field1015 / 32;
						method143(var19, var20, field513);
					}
				}
			}

			for (int var21 = 0; var21 < field392; var21++) {
				CHKMTWJC var22 = field391[field393[var21]];
				if (var22 != null && var22.method38()) {
					int var23 = var22.field1014 / 32 - field447.field1014 / 32;
					int var24 = var22.field1015 / 32 - field447.field1015 / 32;
					boolean var25 = false;
					long var26 = XBRLLWQI.method581(var22.field99);
					for (int var28 = 0; var28 < field549; var28++) {
						if (field460[var28] == var26 && field269[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field447.field98 != 0 && var22.field98 != 0 && field447.field98 == var22.field98) {
						var29 = true;
					}

					if (var25) {
						method143(var23, var24, field515);
					} else if (var29) {
						method143(var23, var24, field516);
					} else {
						method143(var23, var24, field514);
					}
				}
			}

			if (field179 != 0 && field449 % 20 < 10) {
				if (field179 == 1 && field426 >= 0 && field426 < field236.length) {
					JMUIRIHZ var30 = field236[field426];
					if (var30 != null) {
						int var31 = var30.field1014 / 32 - field447.field1014 / 32;
						int var32 = var30.field1015 / 32 - field447.field1015 / 32;
						method108(field282, var31, var32);
					}
				}

				if (field179 == 2) {
					int var33 = (field219 - field226) * 4 + 2 - field447.field1014 / 32;
					int var34 = (field220 - field227) * 4 + 2 - field447.field1015 / 32;
					method108(field282, var33, var34);
				}

				if (field179 == 10 && field481 >= 0 && field481 < field391.length) {
					CHKMTWJC var35 = field391[field481];
					if (var35 != null) {
						int var36 = var35.field1014 / 32 - field447.field1014 / 32;
						int var37 = var35.field1015 / 32 - field447.field1015 / 32;
						method108(field282, var36, var37);
					}
				}
			}

			if (field442 != 0) {
				int var38 = field442 * 4 + 2 - field447.field1014 / 32;
				int var39 = field443 * 4 + 2 - field447.field1015 / 32;
				method143(var38, var39, field281);
			}

			UKUXLUWP.method546(0xFFFFFF, 97, 78, 3, 3);
			field167.method578();
			PNDCOEKM.field1141 = field570;
		}
	}

	@ObfuscatedName("client.a(LNUXLZYAZ;I)V")
	public final void method77(NUXLZYAZ arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field298.length; var3++) {
			field298[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field298[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field299[var9] = (field298[var9 - 1] + field298[var9 + 1] + field298[var9 - 128] + field298[var9 + 128]) / 4;
				}
			}

			int[] var10 = field298;
			field298 = field299;
			field299 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field991; var12++) {
				for (int var13 = 0; var13 < arg0.field990; var13++) {
					if (arg0.field988[var11++] != 0) {
						int var14 = var13 + arg0.field992 + 16;
						int var15 = var12 + arg0.field993 + 16;
						int var16 = (var15 << 7) + var14;
						field298[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method78() {
		if (field143 > 0) {
			method176();
		} else {
			method177("Connection lost", "Please wait - attempting to reestablish");
			field542 = 0;
			field442 = 0;
			KPIQNZMJ var1 = field539;
			field288 = false;
			field296 = 0;
			method191(field473, field474, true);

			if (!field288) {
				method176();
			}

			try {
				var1.method261();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method79() {
		LYSBQDHB.field887.method540();
		LYSBQDHB.field894.method540();
		VWKJSKWX.field1389.method540();
		PICYKCUA.field1121.method540();
		PICYKCUA.field1084.method540();
		CHKMTWJC.field83.method540();
		XWNROHZR.field1451.method540();
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method80(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field287[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg1 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field233[var6][var4][var5] + field233[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field233[var6][var4][var5 + 1] + field233[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field495.method347(arg1, arg0);
		field496.method347(arg1, arg0 + arg2 - 16);
		UKUXLUWP.method546(field479, arg1, arg0 + 16, 16, arg2 - 32);
		int var6 = (arg2 - 32) * arg2 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg4 / (arg3 - arg2);
		UKUXLUWP.method546(field565, arg1, arg0 + var7 + 16, 16, var6);
		UKUXLUWP.method551(field297, var6, arg1, arg0 + var7 + 16);
		UKUXLUWP.method551(field297, var6, arg1 + 1, arg0 + 16 + var7);
		UKUXLUWP.method549(field297, arg0 + var7 + 16, 16, arg1);
		UKUXLUWP.method549(field297, arg0 + var7 + 17, 16, arg1);
		UKUXLUWP.method551(field448, var6, arg1 + 15, arg0 + 16 + var7);
		UKUXLUWP.method551(field448, var6 - 1, arg1 + 14, arg0 + var7 + 17);
		UKUXLUWP.method549(field448, arg0 + var7 + var6 + 15, 16, arg1);
		UKUXLUWP.method549(field448, arg0 + var7 + var6 + 14, 15, arg1 + 1);
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method82() {
		if (field526 >= 2 || field360 != 0 || field385 != 0) {
			String var1;
			if (field360 == 1 && field526 < 2) {
				var1 = "Use " + field364 + " with...";
			} else if (field385 == 1 && field526 < 2) {
				var1 = field388 + "...";
			} else {
				var1 = field546[field526 - 1];
			}

			if (field526 > 2) {
				var1 = var1 + "@whi@ / " + (field526 - 2) + " more options";
			}

			field306.method463(var1, 4, 15, field449 / 1000, 0xFFFFFF, true);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method83() {
		field494++;
		method89(true);
		method134(true);
		method89(false);
		method134(false);
		method157();
		method101();

		if (!field138) {
			int var1 = field188;
			if (field300 / 256 > var1) {
				var1 = field300 / 256;
			}

			if (field187[4] && field323[4] + 128 > var1) {
				var1 = field323[4] + 128;
			}

			int var2 = field379 + field189 & 0x7FF;
			method139(var2, field475, method80(field545, field447.field1014, field447.field1015) - 50, var1 * 3 + 600, field476, var1);
		}

		int var3;
		if (field138) {
			var3 = method91();
		} else {
			var3 = method90();
		}

		int var4 = field555;
		int var5 = field556;
		int var6 = field557;
		int var7 = field558;
		int var8 = field559;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field187[var9]) {
				int var10 = (int) (Math.random() * (field175[var9] * 2 + 1) + Math.sin(field543[var9] / 100.0D * field148[var9]) * field323[var9] - field175[var9]);
				if (var9 == 0) {
					field555 += var10;
				}

				if (var9 == 1) {
					field556 += var10;
				}

				if (var9 == 2) {
					field557 += var10;
				}

				if (var9 == 3) {
					field559 = field559 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field558 += var10;
					if (field558 < 128) {
						field558 = 128;
					}

					if (field558 > 383) {
						field558 = 383;
					}
				}
			}
		}

		int var11 = PNDCOEKM.field1150;
		CADBNSXE.field74 = true;
		CADBNSXE.field77 = 0;
		CADBNSXE.field75 = field650 - 4;
		CADBNSXE.field76 = field651 - 4;
		UKUXLUWP.method544();
		field351.method526(var3, field557, field555, field556, field558, field559);
		field351.method501();
		method197();
		method151();
		method86(var11);
		method128();
		field167.method579(4, field642, 4);
		field555 = var4;
		field556 = var5;
		field557 = var6;
		field558 = var7;
		field559 = var8;
	}

	@ObfuscatedName("client.e(B)V")
	public final void method84() {
		field248 = false;
		while (field176) {
			field248 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field439 = null;
		field440 = null;
		field240 = null;
		field210 = null;
		field211 = null;
		field212 = null;
		field213 = null;
		field298 = null;
		field299 = null;
		field482 = null;
		field483 = null;
		field333 = null;
		field334 = null;
	}

	@ObfuscatedName("client.h(I)V")
	public final void method85() {
		for (int var1 = -1; var1 < field392; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field390;
			} else {
				var2 = field393[var1];
			}

			CHKMTWJC var3 = field391[var2];
			if (var3 != null) {
				method184(1, var3);
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method86(int arg0) {
		if (!field319) {
			for (int var2 = 0; var2 < field230.length; var2++) {
				int var3 = field230[var2];
				if (PNDCOEKM.field1149[var3] >= arg0) {
					NUXLZYAZ var4 = PNDCOEKM.field1143[var3];
					int var5 = var4.field991 * var4.field990 - 1;
					int var6 = field246 * var4.field990 * 2;
					byte[] var7 = var4.field988;
					byte[] var8 = field265;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field988 = var8;
					field265 = var7;
					PNDCOEKM.method426(var3);
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method87() {
		if (field542 == 0 && field656 == 1) {
			int var1 = field657 - 25 - 550;
			int var2 = field658 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field293 + field189 & 0x7FF;
				int var4 = PNDCOEKM.field1139[var3];
				int var5 = PNDCOEKM.field1140[var3];
				var4 = (field185 + 256) * var4 >> 8;
				var5 = (field185 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field447.field1014 + var6 >> 7;
				int var9 = field447.field1015 - var7 >> 7;
				boolean var10 = method64(1, true, 0, 0, var8, 0, 0, var9, field447.field1003[0], field447.field1004[0], 0);
				if (var10) {
					field367.method286(var1);
					field367.method286(var2);
					field367.method287(field189);
					field367.method286(57);
					field367.method286(field293);
					field367.method286(field185);
					field367.method286(89);
					field367.method287(field447.field1014);
					field367.method287(field447.field1015);
					field367.method286(field547);
					field367.method286(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)Ljava/lang/String;")
	public final String method88() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field645 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method89(boolean arg0) {
		if (field447.field1014 >> 7 == field442 && field447.field1015 >> 7 == field443) {
			field442 = 0;
			field487++;
			if (field487 > 96) {
				field487 = 0;
				field367.method285(35);
			}
		}

		int var2 = field392;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			CHKMTWJC var4;
			int var5;
			if (arg0) {
				var4 = field447;
				var5 = field390 << 14;
			} else {
				var4 = field391[field393[var3]];
				var5 = field393[var3] << 14;
			}

			if (var4 != null && var4.method38()) {
				var4.field92 = false;
				if ((field319 && field392 > 50 || field392 > 200) && !arg0 && var4.field1017 == var4.field1011) {
					var4.field92 = true;
				}

				int var6 = var4.field1014 >> 7;
				int var7 = var4.field1015 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field108 == null || field449 < var4.field103 || field449 >= var4.field104) {
						if ((var4.field1014 & 0x7F) == 0x40 && (var4.field1015 & 0x7F) == 0x40) {
							if (field232[var6][var7] == field494) {
								continue;
							}

							field232[var6][var7] = field494;
						}

						var4.field85 = method80(field545, var4.field1014, var4.field1015);
						field351.method498(var4.field1016, var4.field1015, var4.field1050, 60, var4, field545, var4.field85, var4.field1014, var5);
					} else {
						var4.field92 = false;
						var4.field85 = method80(field545, var4.field1014, var4.field1015);
						field351.method499(var5, field545, var4.field1016, var4.field1014, 60, var4.field94, var4.field95, var4.field85, var4.field96, var4.field97, var4.field1015, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)I")
	public final int method90() {
		int var1 = 3;
		if (field558 < 310) {
			int var2 = field555 >> 7;
			int var3 = field557 >> 7;
			int var4 = field447.field1014 >> 7;
			int var5 = field447.field1015 >> 7;

			if ((field287[field545][var2][var3] & 0x4) != 0) {
				var1 = field545;
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

					if ((field287[field545][var2][var3] & 0x4) != 0) {
						var1 = field545;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field287[field545][var2][var3] & 0x4) != 0) {
							var1 = field545;
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

					if ((field287[field545][var2][var3] & 0x4) != 0) {
						var1 = field545;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field287[field545][var2][var3] & 0x4) != 0) {
							var1 = field545;
						}
					}
				}
			}
		}

		if ((field287[field545][field447.field1014 >> 7][field447.field1015 >> 7] & 0x4) != 0) {
			var1 = field545;
		}

		return var1;
	}

	@ObfuscatedName("client.j(I)I")
	public final int method91() {
		int var1 = method80(field545, field555, field557);
		if (var1 - field556 < 800 && (field287[field545][field555 >> 7][field557 >> 7] & 0x4) != 0) {
			return field545;
		}

		return 3;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method92() {
		if (field528 == null) {
			field643 = null;
			field168 = null;
			field166 = null;
			field165 = null;
			field167 = null;
			field325 = null;
			field326 = null;
			field327 = null;
			field531 = new WOKQCNXG(128, 265, method122());
			UKUXLUWP.method544();
			field532 = new WOKQCNXG(128, 265, method122());
			UKUXLUWP.method544();
			field528 = new WOKQCNXG(509, 171, method122());
			UKUXLUWP.method544();
			field529 = new WOKQCNXG(360, 132, method122());
			UKUXLUWP.method544();
			field530 = new WOKQCNXG(360, 200, method122());
			UKUXLUWP.method544();
			field533 = new WOKQCNXG(202, 238, method122());
			UKUXLUWP.method544();
			field534 = new WOKQCNXG(203, 238, method122());
			UKUXLUWP.method544();
			field535 = new WOKQCNXG(74, 94, method122());
			UKUXLUWP.method544();
			field536 = new WOKQCNXG(75, 94, method122());
			UKUXLUWP.method544();

			if (field159 != null) {
				method198();
				method193();
			}

			field402 = true;
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method93() {
		if (!field268 && !field283 && !field249) {
			field449++;

			if (field288) {
				method201();
			} else {
				method126();
			}

			method137();
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method94() {
		try {
			field193 = -1;
			field340.method604();
			field162.method604();
			PNDCOEKM.method422();
			method79();
			field351.method487();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field498[var1].method353();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field287[var2][var3][var4] = 0;
					}
				}
			}

			CJZJWICI var5 = new CJZJWICI(104, field233, field287, 104);
			int var6 = field329.length;
			field367.method285(58);

			if (!field289) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field451[var7] >> 8) * 64 - field226;
					int var9 = (field451[var7] & 0xFF) * 64 - field227;
					byte[] var10 = field329[var7];
					if (var10 != null) {
						var5.method55(var10, var8, field498, var9, (field158 - 6) * 8, (field157 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field451[var11] >> 8) * 64 - field226;
					int var13 = (field451[var11] & 0xFF) * 64 - field227;
					byte[] var14 = field329[var11];
					if (var14 == null && field158 < 800) {
						var5.method63(64, var12, var13, 64);
					}
				}

				field367.method285(58);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field554[var15];
					if (var16 != null) {
						int var17 = (field451[var15] >> 8) * 64 - field226;
						int var18 = (field451[var15] & 0xFF) * 64 - field227;
						var5.method47(var18, field498, field351, var17, var16);
					}
				}
			}

			if (field289) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field308[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field451.length; var28++) {
									if (field451[var28] == var27 && field329[var28] != null) {
										var5.method56((var26 & 0x7) * 8, var23, field498, var21 * 8, var20 * 8, field329[var28], var19, var24, (var25 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field308[0][var29][var30];
						if (var31 == -1) {
							var5.method63(8, var29 * 8, var30 * 8, 8);
						}
					}
				}

				field367.method285(58);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field308[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field451.length; var41++) {
									if (field451[var41] == var40 && field554[var41] != null) {
										var5.method48(var36, var34 * 8, (var39 & 0x7) * 8, var33 * 8, field498, var37, (var38 & 0x7) * 8, field351, field554[var41], var32);
										break;
									}
								}
							}
						}
					}
				}
			}

			field367.method285(58);
			var5.method62(field498, field351);

			if (field167 != null) {
				field167.method578();
				PNDCOEKM.field1141 = field570;
			}

			field367.method285(58);
			int var42 = CJZJWICI.field127;
			if (var42 > field545) {
				var42 = field545;
			}

			if (var42 < field545 - 1) {
				int var43 = field545 - 1;
			}

			if (field319) {
				field351.method488(CJZJWICI.field127);
			} else {
				field351.method488(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method199(var44, var45);
				}
			}

			method95();
		} catch (Exception var58) {
		}

		LYSBQDHB.field887.method540();

		if (field645 != null) {
			field367.method285(173);
			field367.method290(1057001181);
		}

		if (field319 && signlink.cache_dat != null) {
			int var47 = field225.method239(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field225.method234(var48);
				if ((var49 & 0x79) == 0) {
					CADBNSXE.method10(var48);
				}
			}
		}

		System.gc();
		PNDCOEKM.method423(20);
		field225.method238();
		int var50 = (field157 - 6) / 8 - 1;
		int var51 = (field157 + 6) / 8 + 1;
		int var52 = (field158 - 6) / 8 - 1;
		int var53 = (field158 + 6) / 8 + 1;
		if (field271) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field225.method235(var55, var54, 0);
					if (var56 != -1) {
						field225.method230(3, var56);
					}

					int var57 = field225.method235(var55, var54, 1);
					if (var57 != -1) {
						field225.method230(3, var57);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method95() {
		for (MLLEEKZP var1 = (MLLEEKZP) field303.method600(); var1 != null; var1 = (MLLEEKZP) field303.method602()) {
			if (var1.field957 == -1) {
				var1.field961 = 0;
				method159(var1);
			} else {
				var1.method367();
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field351.method513(arg0, arg1, arg4);
		if (var6 != 0) {
			int var7 = field351.method517(arg0, arg1, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg2;
			}

			int[] var11 = field444.field1245;
			int var12 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LYSBQDHB var14 = LYSBQDHB.method282(var13);
			if (var14.field917 == -1) {
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
				NUXLZYAZ var15 = field164[var14.field917];
				if (var15 != null) {
					int var16 = (var14.field882 * 4 - var15.field990) / 2;
					int var17 = (var14.field891 * 4 - var15.field991) / 2;
					var15.method347(arg1 * 4 + var16 + 48, (104 - arg4 - var14.field891) * 4 + 48 + var17);
				}
			}
		}

		int var18 = field351.method515(arg0, arg1, arg4);
		if (var18 != 0) {
			int var19 = field351.method517(arg0, arg1, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LYSBQDHB var23 = LYSBQDHB.method282(var22);
			if (var23.field917 != -1) {
				NUXLZYAZ var24 = field164[var23.field917];
				if (var24 != null) {
					int var25 = (var23.field882 * 4 - var24.field990) / 2;
					int var26 = (var23.field891 * 4 - var24.field991) / 2;
					var24.method347(arg1 * 4 + var25 + 48, (104 - arg4 - var23.field891) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field444.field1245;
				int var29 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field351.method516(arg0, arg1, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LYSBQDHB var32 = LYSBQDHB.method282(var31);
			if (var32.field917 != -1) {
				NUXLZYAZ var33 = field164[var32.field917];
				if (var33 != null) {
					int var34 = (var32.field882 * 4 - var33.field990) / 2;
					int var35 = (var32.field891 * 4 - var33.field991) / 2;
					var33.method347(arg1 * 4 + var34 + 48, (104 - arg4 - var32.field891) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method97() {
		if (field493 == 2) {
			for (MLLEEKZP var1 = (MLLEEKZP) field303.method600(); var1 != null; var1 = (MLLEEKZP) field303.method602()) {
				if (var1.field957 > 0) {
					var1.field957--;
				}

				if (var1.field957 != 0) {
					if (var1.field961 > 0) {
						var1.field961--;
					}

					if (var1.field961 == 0 && var1.field955 >= 1 && var1.field956 >= 1 && var1.field955 <= 102 && var1.field956 <= 102 && (var1.field958 < 0 || CJZJWICI.method49(var1.field960, var1.field958))) {
						method179(var1.field959, var1.field954, var1.field955, var1.field960, var1.field953, var1.field956, var1.field958);
						var1.field961 = -1;

						if (var1.field958 == var1.field950 && var1.field950 == -1) {
							var1.method367();
						} else if (var1.field958 == var1.field950 && var1.field959 == var1.field951 && var1.field960 == var1.field952) {
							var1.method367();
						}
					}
				} else if (var1.field950 < 0 || CJZJWICI.method49(var1.field952, var1.field950)) {
					method179(var1.field951, var1.field954, var1.field955, var1.field952, var1.field953, var1.field956, var1.field950);
					var1.method367();
				}
			}

			field285++;
			if (field285 > 1896) {
				field285 = 0;
				field367.method285(119);
				field367.method286(0);
				int var2 = field367.field963;
				field367.method287((int) (Math.random() * 65536.0D));
				field367.method287((int) (Math.random() * 65536.0D));
				field367.method286(245);
				field367.method287(25901);
				field367.method286((int) (Math.random() * 256.0D));
				field367.method286(130);

				if ((int) (Math.random() * 2.0D) == 0) {
					field367.method286(74);
				}

				field367.method287(64410);
				field367.method286(239);

				if ((int) (Math.random() * 2.0D) == 0) {
					field367.method287(62571);
				}

				field367.method295(field367.field963 - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method98() {
		field402 = true;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method99() {
		if (field656 == 1) {
			if (field657 >= 6 && field657 <= 106 && field658 >= 467 && field658 <= 499) {
				field435 = (field435 + 1) % 4;
				field353 = true;
				field457 = true;
				field367.method285(124);
				field367.method286(field435);
				field367.method286(field244);
				field367.method286(field572);
			}

			if (field657 >= 135 && field657 <= 235 && field658 >= 467 && field658 <= 499) {
				field244 = (field244 + 1) % 3;
				field353 = true;
				field457 = true;
				field367.method285(124);
				field367.method286(field435);
				field367.method286(field244);
				field367.method286(field572);
			}

			if (field657 >= 273 && field657 <= 373 && field658 >= 467 && field658 <= 499) {
				field572 = (field572 + 1) % 3;
				field353 = true;
				field457 = true;
				field367.method285(124);
				field367.method286(field435);
				field367.method286(field244);
				field367.method286(field572);
			}

			if (field657 >= 412 && field657 <= 512 && field658 >= 467 && field658 <= 499) {
				if (field183 == -1) {
					method107();
					field537 = "";
					field312 = false;
					field456 = field183 = HWEMRKQZ.field803;
					return;
				}

				method69(0, "", "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method100() {
		if (field268 || field283 || field249) {
			method116();
		} else {
			field342++;

			if (field288) {
				method190();
			} else {
				method104(false);
			}

			field459 = 0;
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method101() {
		for (ROWJKVEC var1 = (ROWJKVEC) field340.method600(); var1 != null; var1 = (ROWJKVEC) field340.method602()) {
			if (field545 != var1.field1208 || var1.field1207) {
				var1.method367();
			} else if (field449 >= var1.field1204) {
				var1.method445(field246);

				if (var1.field1207) {
					var1.method367();
				} else {
					field351.method498(0, var1.field1210, false, 60, var1, var1.field1208, var1.field1211, var1.field1209, -1);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method102(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field549; var3++) {
				if (field460[var3] == arg0) {
					field549--;
					field438 = true;

					for (int var4 = var3; var4 < field549; var4++) {
						field359[var4] = field359[var4 + 1];
						field269[var4] = field269[var4 + 1];
						field460[var4] = field460[var4 + 1];
					}

					field367.method285(223);
					field367.method292(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method103() {
		try {
			int var1 = field447.field1014 + field365;
			int var2 = field447.field1015 + field508;
			if (field475 - var1 < -500 || field475 - var1 > 500 || field476 - var2 < -500 || field476 - var2 > 500) {
				field475 = var1;
				field476 = var2;
			}

			if (field475 != var1) {
				field475 += (var1 - field475) / 16;
			}

			if (field476 != var2) {
				field476 += (var2 - field476) / 16;
			}

			if (field660[1] == 1) {
				field190 += (-field190 - 24) / 2;
			} else if (field660[2] == 1) {
				field190 += (24 - field190) / 2;
			} else {
				field190 /= 2;
			}

			if (field660[3] == 1) {
				field191 += (12 - field191) / 2;
			} else if (field660[4] == 1) {
				field191 += (-field191 - 12) / 2;
			} else {
				field191 /= 2;
			}

			field189 = field190 / 2 + field189 & 0x7FF;
			field188 += field191 / 2;
			if (field188 < 128) {
				field188 = 128;
			}

			if (field188 > 383) {
				field188 = 383;
			}

			int var3 = field475 >> 7;
			int var4 = field476 >> 7;
			int var5 = method80(field545, field475, field476);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field545;
						if (var9 < 3 && (field287[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field233[var9][var7][var8];
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

			if (var11 > field300) {
				field300 += (var11 - field300) / 24;
			} else if (var11 < field300) {
				field300 += (var11 - field300) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field447.field1014 + "," + field447.field1015 + "," + field475 + "," + field476 + "," + field157 + "," + field158 + "," + field226 + "," + field227);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method104(boolean arg0) {
		method92();
		field530.method578();
		field439.method347(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field491 == 0) {
			int var4 = var3 / 2 + 80;
			field304.method455(field225.field696, var4, true, var2 / 2, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field306.method455("Welcome to RuneScape", var5, true, var2 / 2, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field440.method347(var6 - 73, var7 - 20);
			field306.method455("New User", var7 + 5, true, var6, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field440.method347(var8 - 73, var7 - 20);
			field306.method455("Existing User", var7 + 5, true, var8, 0xFFFFFF);
		}

		if (field491 == 2) {
			int var9 = var3 / 2 - 40;
			if (field431.length() > 0) {
				field306.method455(field431, var9 - 15, true, var2 / 2, 0xFFFF00);
				field306.method455(field432, var9, true, var2 / 2, 0xFFFF00);
				var9 += 30;
			} else {
				field306.method455(field432, var9 - 7, true, var2 / 2, 0xFFFF00);
				var9 += 30;
			}

			field306.method462(var2 / 2 - 90, 0xFFFFFF, true, "Username: " + field473 + (field320 == 0 & field449 % 40 < 20 ? "@yel@|" : ""), var9);
			var9 += 15;
			field306.method462(var2 / 2 - 88, 0xFFFFFF, true, "Password: " + XBRLLWQI.method586(field474) + (field320 == 1 & field449 % 40 < 20 ? "@yel@|" : ""), var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field440.method347(var10 - 73, var11 - 20);
				field306.method455("Login", var11 + 5, true, var10, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field440.method347(var12 - 73, var11 - 20);
				field306.method455("Cancel", var11 + 5, true, var12, 0xFFFFFF);
			}
		}

		if (field491 == 3) {
			field306.method455("Create a free account", var3 / 2 - 60, true, var2 / 2, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field306.method455("To create a new account you need to", var13, true, var2 / 2, 0xFFFFFF);
			var13 += 15;
			field306.method455("go back to the main RuneScape webpage", var13, true, var2 / 2, 0xFFFFFF);
			var13 += 15;
			field306.method455("and choose the 'create account'", var13, true, var2 / 2, 0xFFFFFF);
			var13 += 15;
			field306.method455("button near the top of that page.", var13, true, var2 / 2, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field440.method347(var14 - 73, var15 - 20);
			field306.method455("Cancel", var15 + 5, true, var14, 0xFFFFFF);
		}

		field530.method579(171, field642, 202);

		if (field402) {
			field402 = false;
			field528.method579(0, field642, 128);
			field529.method579(371, field642, 202);
			field533.method579(265, field642, 0);
			field534.method579(265, field642, 562);
			field535.method579(171, field642, 128);
			field536.method579(171, field642, 562);
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method105(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field178; var3++) {
				if (field497[var3] == arg0) {
					field178--;
					field438 = true;

					for (int var4 = var3; var4 < field178; var4++) {
						field497[var4] = field497[var4 + 1];
					}

					field367.method285(146);
					field367.method292(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILCHKMTWJC;ILMLYYHULT;B)V")
	public final void method106(int arg0, CHKMTWJC arg1, int arg2, MLYYHULT arg3) {
		if ((arg0 & 0x20) != 0) {
			int var5 = arg3.method315();
			byte[] var6 = new byte[var5];
			MLYYHULT var7 = new MLYYHULT(var6);
			arg3.method305(var5, 0, var6);
			field396[arg2] = var7;
			arg1.method42(var7);
		}

		if ((arg0 & 0x100) != 0) {
			arg1.field996 = arg3.method326();
			int var8 = arg3.method332();
			arg1.field1000 = var8 >> 16;
			arg1.field999 = (var8 & 0xFFFF) + field449;
			arg1.field997 = 0;
			arg1.field998 = 0;

			if (arg1.field999 > field449) {
				arg1.field997 = -1;
			}

			if (arg1.field996 == 0xFFFF) {
				arg1.field996 = -1;
			}
		}

		if ((arg0 & 0x1) != 0) {
			int var9 = arg3.method324();
			if (var9 == 0xFFFF) {
				var9 = -1;
			}

			int var10 = arg3.method315();
			if (arg1.field1044 == var9 && var9 != -1) {
				int var11 = UVDKTGZK.field1357[var9].field1371;
				if (var11 == 1) {
					arg1.field1045 = 0;
					arg1.field1046 = 0;
					arg1.field1047 = var10;
					arg1.field1048 = 0;
				}

				if (var11 == 2) {
					arg1.field1048 = 0;
				}
			} else if (var9 == -1 || arg1.field1044 == -1 || UVDKTGZK.field1357[var9].field1365 >= UVDKTGZK.field1357[arg1.field1044].field1365) {
				arg1.field1044 = var9;
				arg1.field1045 = 0;
				arg1.field1046 = 0;
				arg1.field1047 = var10;
				arg1.field1048 = 0;
				arg1.field1006 = arg1.field1029;
			}
		}

		if ((arg0 & 0x2) != 0) {
			arg1.field1041 = arg3.method298();
			arg1.field1042 = arg3.method324();
		}

		if ((arg0 & 0x400) != 0) {
			arg1.field1030 = arg3.method316();
			arg1.field1032 = arg3.method317();
			arg1.field1031 = arg3.method315();
			arg1.field1033 = arg3.method315();
			arg1.field1034 = arg3.method324() + field449;
			arg1.field1035 = arg3.method325() + field449;
			arg1.field1036 = arg3.method296();
			arg1.method350();
		}

		if ((arg0 & 0x8) != 0) {
			arg1.field1001 = arg3.method303();
			if (arg1.field1001.charAt(0) == '~') {
				arg1.field1001 = arg1.field1001.substring(1);
				method69(2, arg1.field99, arg1.field1001);
			} else if (field447 == arg1) {
				method69(2, arg1.field99, arg1.field1001);
			}

			arg1.field1013 = 0;
			arg1.field1005 = 0;
			arg1.field1037 = 150;
		}

		if ((arg0 & 0x80) != 0) {
			arg1.field1026 = arg3.method298();
			if (arg1.field1026 == 0xFFFF) {
				arg1.field1026 = -1;
			}
		}

		if ((arg0 & 0x200) != 0) {
			int var12 = arg3.method296();
			int var13 = arg3.method317();
			arg1.method349(var13, var12, field449);
			arg1.field1008 = field449 + 300;
			arg1.field1009 = arg3.method316();
			arg1.field1010 = arg3.method317();
		}

		if ((arg0 & 0x40) != 0) {
			int var14 = arg3.method326();
			int var15 = arg3.method296();
			int var16 = arg3.method317();
			int var17 = arg3.field963;

			if (arg1.field99 != null && arg1.field87) {
				long var18 = XBRLLWQI.method581(arg1.field99);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < field178; var21++) {
						if (field497[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}

				if (!var20 && field352 == 0) {
					try {
						field235.field963 = 0;
						arg3.method335(0, field235.field962, var16);
						field235.field963 = 0;
						String var22 = GVESONCD.method245(field235, var16);
						var22 = PBBEXDRS.method378(var22);
						arg1.field1001 = var22;
						arg1.field1013 = var14 >> 8;
						arg1.field1005 = var14 & 0xFF;
						arg1.field1037 = 150;

						if (var15 == 2 || var15 == 3) {
							method69(1, "@cr2@" + arg1.field99, var22);
						} else if (var15 == 1) {
							method69(1, "@cr1@" + arg1.field99, var22);
						} else {
							method69(2, arg1.field99, var22);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field963 = var16 + var17;
		}

		if ((arg0 & 0x10) != 0) {
			int var24 = arg3.method317();
			int var25 = arg3.method315();
			arg1.method349(var25, var24, field449);
			arg1.field1008 = field449 + 300;
			arg1.field1009 = arg3.method296();
			arg1.field1010 = arg3.method317();
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method107() {
		field367.method285(211);

		if (field466 != -1) {
			method158(field466);
			field466 = -1;
			field438 = true;
			field397 = false;
			field423 = true;
		}

		if (field525 != -1) {
			method158(field525);
			field525 = -1;
			field457 = true;
			field397 = false;
		}

		if (field330 != -1) {
			method158(field330);
			field330 = -1;
			field402 = true;
		}

		if (field192 != -1) {
			method158(field192);
			field192 = -1;
		}

		if (field183 != -1) {
			method158(field183);
			field183 = -1;
		}
	}

	@ObfuscatedName("client.a(LSWNASVGQ;III)V")
	public final void method108(SWNASVGQ arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field293 + field189 & 0x7FF;
			int var6 = CADBNSXE.field79[var5];
			int var7 = CADBNSXE.field80[var5];
			var6 = var6 * 256 / (field185 + 256);
			var7 = var7 * 256 / (field185 + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field134.method479(var12 + 94 + 4 - 10, 20, var10, 20, 15, 256, 15, 83 - var13 - 20);
		} else {
			method143(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.a(ILHWEMRKQZ;)Z")
	public final boolean method109(HWEMRKQZ arg0) {
		int var2 = arg0.field841;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field546[field526] = "Remove @whi@" + arg0.field819;
				field206[field526] = 212;
				field526++;
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

		field546[field526] = "Remove @whi@" + field359[var2];
		field206[field526] = 526;
		field526++;
		field546[field526] = "Message @whi@" + field359[var2];
		field206[field526] = 247;
		field526++;
		return true;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method110() {
		if (field437 != 0) {
			SSVSGKGT var1 = field305;
			int var2 = 0;
			if (field345 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field383[var3] != null) {
					int var4 = field381[var3];
					String var5 = field382[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field244 == 0 || field244 == 1 && method132(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method458(0, var8, var7, "From");
						var1.method458(0xFFFF, var8, var7 - 1, "From");
						int var11 = var8 + var1.method456("From ");
						if (var6 == 1) {
							field266[0].method347(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							field266[1].method347(var11, var7 - 12);
							var11 += 14;
						}

						var1.method458(0, var11, var7, var5 + ": " + field383[var3]);
						var1.method458(0xFFFF, var11, var7 - 1, var5 + ": " + field383[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field244 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method458(0, 4, var9, field383[var3]);
						var1.method458(0xFFFF, 4, var9 - 1, field383[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field244 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method458(0, 4, var10, "To " + var5 + ": " + field383[var3]);
						var1.method458(0xFFFF, 4, var10 - 1, "To " + var5 + ": " + field383[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(LHWEMRKQZ;I)V")
	public final void method111(HWEMRKQZ arg0) {
		int var2 = arg0.field841;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field550 == 0) {
				arg0.field819 = "Loading friend list";
				arg0.field798 = 0;
			} else if (var2 == 1 && field550 == 1) {
				arg0.field819 = "Connecting to friendserver";
				arg0.field798 = 0;
			} else if (var2 == 2 && field550 != 2) {
				arg0.field819 = "Please wait...";
				arg0.field798 = 0;
			} else {
				int var3 = field549;
				if (field550 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field819 = "";
					arg0.field798 = 0;
				} else {
					arg0.field819 = field359[var2];
					arg0.field798 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field549;
			if (field550 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field819 = "";
				arg0.field798 = 0;
			} else {
				if (field269[var2] == 0) {
					arg0.field819 = "@red@Offline";
				} else if (field269[var2] < 200) {
					if (field269[var2] == field316) {
						arg0.field819 = "@gre@World" + (field269[var2] - 9);
					} else {
						arg0.field819 = "@yel@World" + (field269[var2] - 9);
					}
				} else if (field269[var2] == field316) {
					arg0.field819 = "@gre@Classic" + (field269[var2] - 219);
				} else {
					arg0.field819 = "@yel@Classic" + (field269[var2] - 219);
				}

				arg0.field798 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field549;
			if (field550 != 2) {
				var5 = 0;
			}

			arg0.field792 = var5 * 15 + 20;
			if (arg0.field792 <= arg0.field813) {
				arg0.field792 = arg0.field813 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field550 == 0) {
				arg0.field819 = "Loading ignore list";
				arg0.field798 = 0;
			} else if (var2 == 1 && field550 == 0) {
				arg0.field819 = "Please wait...";
				arg0.field798 = 0;
			} else {
				int var6 = field178;
				if (field550 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field819 = "";
					arg0.field798 = 0;
				} else {
					arg0.field819 = XBRLLWQI.method585(XBRLLWQI.method582(field497[var2]));
					arg0.field798 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field792 = field178 * 15 + 20;
			if (arg0.field792 <= arg0.field813) {
				arg0.field792 = arg0.field813 + 1;
			}
		} else if (var2 == 327) {
			arg0.field782 = 150;
			arg0.field783 = (int) (Math.sin(field449 / 40.0D) * 256.0D) & 0x7FF;

			if (field480) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field239[var7];
					if (var8 >= 0 && !NQIAMATB.field981[var8].method338()) {
						return;
					}
				}

				field480 = false;
				CADBNSXE[] var9 = new CADBNSXE[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field239[var11];
					if (var12 >= 0) {
						var9[var10++] = NQIAMATB.field981[var12].method339();
					}
				}

				CADBNSXE var13 = new CADBNSXE(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field242[var14] != 0) {
						var13.method25(field292[var14][0], field292[var14][field242[var14]]);

						if (var14 == 1) {
							var13.method25(field384[0], field384[field242[var14]]);
						}
					}
				}

				var13.method18();
				var13.method19(UVDKTGZK.field1357[field447.field1011].field1359[0]);
				var13.method28(64, 850, -30, -50, -30, true);
				arg0.field847 = 5;
				arg0.field848 = 0;
				HWEMRKQZ.method259(5, 0, var13);
			}
		} else if (var2 == 324) {
			if (field485 == null) {
				field485 = arg0.field777;
				field486 = arg0.field816;
			}

			if (field247) {
				arg0.field777 = field486;
			} else {
				arg0.field777 = field485;
			}
		} else if (var2 == 325) {
			if (field485 == null) {
				field485 = arg0.field777;
				field486 = arg0.field816;
			}

			if (field247) {
				arg0.field777 = field485;
			} else {
				arg0.field777 = field486;
			}
		} else if (var2 == 600) {
			arg0.field819 = field537;
			if (field449 % 20 < 10) {
				arg0.field819 = arg0.field819 + "|";
			} else {
				arg0.field819 = arg0.field819 + " ";
			}
		} else if (var2 == 620) {
			if (field503 < 1) {
				arg0.field819 = "";
			} else if (field312) {
				arg0.field842 = 0xFF0000;
				arg0.field819 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field842 = 0xFFFFFF;
				arg0.field819 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field461 - field355;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field819 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field241 == 0) {
				arg0.field819 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field241 <= field461) {
				arg0.field819 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method112(field241);
			} else {
				int var17 = field461 + 14 - field241;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field819 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method112(field241) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field575 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field575 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field575 + " unread messages";
			}

			arg0.field819 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field472 > 0 && field472 <= field461 + 10) {
				arg0.field819 = "Last password change:\\n@gre@" + method112(field472);
			} else {
				arg0.field819 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field344 > 2 && !field318) {
				arg0.field819 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field344 > 2) {
				arg0.field819 = "\\n\\nYou have @gre@" + field344 + "@yel@ days of\\nmember credit remaining.";
			} else if (field344 > 0) {
				arg0.field819 = "You have @gre@" + field344 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field819 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field344 > 2 && !field318) {
				arg0.field819 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field344 > 0) {
				arg0.field819 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field819 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field241 > field461) {
				arg0.field819 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field819 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.c(ZI)Ljava/lang/String;")
	public final String method112(int arg0) {
		if (arg0 > field461 + 10) {
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

	@ObfuscatedName("client.a(IZIIIIIIII)V")
	public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		MLLEEKZP var10 = null;
		for (MLLEEKZP var11 = (MLLEEKZP) field303.method600(); var11 != null; var11 = (MLLEEKZP) field303.method602()) {
			if (var11.field953 == arg8 && var11.field955 == arg3 && var11.field956 == arg4 && var11.field954 == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new MLLEEKZP();
			var10.field953 = arg8;
			var10.field954 = arg6;
			var10.field955 = arg3;
			var10.field956 = arg4;
			method159(var10);
			field303.method597(var10);
		}

		var10.field958 = arg1;
		var10.field960 = arg0;
		var10.field959 = arg5;
		var10.field961 = arg7;
		var10.field957 = arg2;
	}

	@ObfuscatedName("client.c(II)Ljava/lang/String;")
	public static final String method114(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.o(I)V")
	public final void method115() {
		field352 = 0;
		int var1 = (field447.field1014 >> 7) + field226;
		int var2 = (field447.field1015 >> 7) + field227;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field352 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field352 = 1;
		}

		if (field352 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field352 = 0;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method116() {
		Graphics var1 = method122().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method222(1);

		if (field283) {
			field248 = false;
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

		if (field249) {
			field248 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field268) {
			field248 = false;
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

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public static final String method117(int arg0) {
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

	@ObfuscatedName("client.b(IZI)Ljava/lang/String;")
	public static final String method118(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(IILMLYYHULT;)V")
	public final void method119(int arg0, MLYYHULT arg1) {
		arg1.method306();
		int var3 = arg1.method307(1);
		if (var3 != 0) {
			int var4 = arg1.method307(2);
			if (var4 == 0) {
				field395[field394++] = field390;
			} else if (var4 == 1) {
				int var5 = arg1.method307(3);
				field447.method351(var5, false);
				int var6 = arg1.method307(1);
				if (var6 == 1) {
					field395[field394++] = field390;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method307(3);
				field447.method351(var7, true);
				int var8 = arg1.method307(3);
				field447.method351(var8, true);
				int var9 = arg1.method307(1);
				if (var9 == 1) {
					field395[field394++] = field390;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method307(7);
				int var11 = arg1.method307(7);
				field545 = arg1.method307(2);
				int var12 = arg1.method307(1);
				int var13 = arg1.method307(1);
				if (var13 == 1) {
					field395[field394++] = field390;
				}

				field447.method352(var10, var11, var12 == 1);
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method120() {
		for (int var1 = 0; var1 < field504; var1++) {
			if (field564[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field215[var1] != field302 || field521[var1] != field291) {
						MLYYHULT var3 = BSYFPVLV.method2(field521[var1], field215[var1]);
						if (System.currentTimeMillis() + var3.field963 / 22 > field424 / 22 + field505) {
							field424 = var3.field963;
							field505 = System.currentTimeMillis();

							if (method181(var3.field963, var3.field962)) {
								field302 = field215[var1];
								field291 = field521[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method195()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field564[var1] != -5) {
					field564[var1] = -5;
				} else {
					field504--;
					for (int var5 = var1; var5 < field504; var5++) {
						field215[var5] = field215[var5 + 1];
						field521[var5] = field521[var5 + 1];
						field564[var5] = field564[var5 + 1];
					}

					var1--;
				}
			} else {
				field564[var1]--;
			}
		}

		if (field410 > 0) {
			field410 -= 20;
			if (field410 < 0) {
				field410 = 0;
			}

			if (field410 == 0 && field209 && !field319) {
				field160 = field510;
				field161 = true;
				field225.method237(2, field160);
				return;
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public void method121() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field408);

		if (field225 != null) {
			System.out.println("Od-cycle:" + field225.field697);
		}

		System.out.println("loop-cycle:" + field449);
		System.out.println("draw-cycle:" + field342);
		System.out.println("ptype:" + field140);
		System.out.println("psize:" + field139);

		if (field539 != null) {
			field539.method266();
		}

		field639 = true;
	}

	@ObfuscatedName("client.b(Z)Ljava/awt/Component;")
	public final Component method122() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field645 != null) {
			return field645;
		}

		return this;
	}

	@ObfuscatedName("client.i(Z)Z")
	public final boolean method123() {
		if (field539 == null) {
			return false;
		}

		try {
			int var1 = field539.method263();
			if (var1 == 0) {
				return false;
			}

			if (field140 == -1) {
				field539.method264(field154.field962, 0, 1);
				field140 = field154.field962[0] & 0xFF;
				if (field484 != null) {
					field140 = field140 - field484.method450() & 0xFF;
				}

				field139 = YOQEUTUL.field1494[field140];
				var1--;
			}

			if (field139 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field539.method264(field154.field962, 0, 1);
				field139 = field154.field962[0] & 0xFF;
				var1--;
			}

			if (field139 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field539.method264(field154.field962, 0, 2);
				field154.field963 = 0;
				field139 = field154.method298();
				var1 -= 2;
			}

			if (var1 < field139) {
				return false;
			}

			field154.field963 = 0;
			field539.method264(field154.field962, 0, field139);
			field141 = 0;
			field348 = field347;
			field347 = field346;
			field346 = field140;

			if (field140 == 100) {
				field184 = field154.method296();
				field140 = -1;
				return true;
			}

			if (field140 == 229) {
				int var2 = field154.method298();
				if (var2 == 0xFFFF) {
					var2 = -1;
				}

				if (field510 != var2 && field209 && !field319 && field410 == 0) {
					field160 = var2;
					field161 = true;
					field225.method237(2, field160);
				}

				field510 = var2;
				field140 = -1;
				return true;
			}

			if (field140 == 22) {
				int var3 = field154.method330();
				int var4 = field154.method324();
				if (field209 && !field319) {
					field160 = var4;
					field161 = false;
					field225.method237(2, field160);
					field410 = var3;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 192) {
				for (int var5 = 0; var5 < field262.length; var5++) {
					if (field488[var5] != field262[var5]) {
						field262[var5] = field488[var5];
						method71(var5);
						field438 = true;
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 56) {
				int var6 = field154.method325();
				int var7 = field154.method324();
				int var8 = field154.method298();
				int var9 = field154.method326();
				HWEMRKQZ.method256(var8).field782 = var7;
				HWEMRKQZ.method256(var8).field783 = var6;
				HWEMRKQZ.method256(var8).field781 = var9;
				field140 = -1;
				return true;
			}

			if (field140 == 89) {
				field438 = true;
				int var10 = field154.method298();
				HWEMRKQZ var11 = HWEMRKQZ.method256(var10);
				while (field154.field963 < field139) {
					int var12 = field154.method310();
					int var13 = field154.method298();
					int var14 = field154.method296();
					if (var14 == 255) {
						var14 = field154.method301();
					}

					if (var12 >= 0 && var12 < var11.field796.length) {
						var11.field796[var12] = var13;
						var11.field830[var12] = var14;
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 190) {
				field345 = field154.method326() * 30;
				field140 = -1;
				return true;
			}

			if (field140 == 40 || field140 == 2 || field140 == 255 || field140 == 65 || field140 == 175 || field140 == 146 || field140 == 121 || field140 == 250 || field140 == 126 || field140 == 164 || field140 == 198) {
				method129(field140, field154);
				field140 = -1;
				return true;
			}

			if (field140 == 136) {
				boolean var15 = field154.method317() == 1;
				int var16 = field154.method298();
				HWEMRKQZ.method256(var16).field797 = var15;
				field140 = -1;
				return true;
			}

			if (field140 == 152 || field140 == 20) {
				int var17 = field157;
				int var18 = field158;
				if (field140 == 152) {
					var18 = field154.method326();
					var17 = field154.method326();
					field289 = false;
				}

				if (field140 == 20) {
					field154.method306();

					for (int var19 = 0; var19 < 4; var19++) {
						for (int var20 = 0; var20 < 13; var20++) {
							for (int var21 = 0; var21 < 13; var21++) {
								int var22 = field154.method307(1);
								if (var22 == 1) {
									field308[var19][var20][var21] = field154.method307(26);
								} else {
									field308[var19][var20][var21] = -1;
								}
							}
						}
					}

					field154.method308();
					var17 = field154.method298();
					var18 = field154.method324();
					field289 = true;
				}

				if (field157 == var17 && field158 == var18 && field493 == 2) {
					field140 = -1;
					return true;
				}

				field157 = var17;
				field158 = var18;
				field226 = (field157 - 6) * 8;
				field227 = (field158 - 6) * 8;
				field271 = false;
				if ((field157 / 8 == 48 || field157 / 8 == 49) && field158 / 8 == 48) {
					field271 = true;
				}

				if (field157 / 8 == 48 && field158 / 8 == 148) {
					field271 = true;
				}

				field493 = 1;
				field177 = System.currentTimeMillis();
				method177("Loading - please wait.", null);

				if (field140 == 152) {
					int var23 = 0;
					for (int var24 = (field157 - 6) / 8; var24 <= (field157 + 6) / 8; var24++) {
						for (int var25 = (field158 - 6) / 8; var25 <= (field158 + 6) / 8; var25++) {
							var23++;
						}
					}

					field329 = new byte[var23][];
					field554 = new byte[var23][];
					field451 = new int[var23];
					field452 = new int[var23];
					field453 = new int[var23];
					int var26 = 0;
					for (int var27 = (field157 - 6) / 8; var27 <= (field157 + 6) / 8; var27++) {
						for (int var28 = (field158 - 6) / 8; var28 <= (field158 + 6) / 8; var28++) {
							field451[var26] = (var27 << 8) + var28;

							if (field271 && (var28 == 49 || var28 == 149 || var28 == 147 || var27 == 50 || var27 == 49 && var28 == 47)) {
								field452[var26] = -1;
								field453[var26] = -1;
								var26++;
							} else {
								int var29 = field452[var26] = field225.method235(var28, var27, 0);
								if (var29 != -1) {
									field225.method237(3, var29);
								}

								int var30 = field453[var26] = field225.method235(var28, var27, 1);
								if (var30 != -1) {
									field225.method237(3, var30);
								}

								var26++;
							}
						}
					}
				}

				if (field140 == 20) {
					int var31 = 0;
					int[] var32 = new int[676];
					for (int var33 = 0; var33 < 4; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							for (int var35 = 0; var35 < 13; var35++) {
								int var36 = field308[var33][var34][var35];
								if (var36 != -1) {
									int var37 = var36 >> 14 & 0x3FF;
									int var38 = var36 >> 3 & 0x7FF;
									int var39 = (var37 / 8 << 8) + var38 / 8;
									for (int var40 = 0; var40 < var31; var40++) {
										if (var32[var40] == var39) {
											var39 = -1;
											break;
										}
									}

									if (var39 != -1) {
										var32[var31++] = var39;
									}
								}
							}
						}
					}

					field329 = new byte[var31][];
					field554 = new byte[var31][];
					field451 = new int[var31];
					field452 = new int[var31];
					field453 = new int[var31];
					for (int var41 = 0; var41 < var31; var41++) {
						int var42 = field451[var41] = var32[var41];
						int var43 = var42 >> 8 & 0xFF;
						int var44 = var42 & 0xFF;
						int var45 = field452[var41] = field225.method235(var44, var43, 0);
						if (var45 != -1) {
							field225.method237(3, var45);
						}

						int var46 = field453[var41] = field225.method235(var44, var43, 1);
						if (var46 != -1) {
							field225.method237(3, var46);
						}
					}
				}

				int var47 = field226 - field228;
				int var48 = field227 - field229;
				field228 = field226;
				field229 = field227;

				for (int var49 = 0; var49 < 16384; var49++) {
					JMUIRIHZ var50 = field236[var49];
					if (var50 != null) {
						for (int var51 = 0; var51 < 10; var51++) {
							var50.field1003[var51] -= var47;
							var50.field1004[var51] -= var48;
						}

						var50.field1014 -= var47 * 128;
						var50.field1015 -= var48 * 128;
					}
				}

				for (int var52 = 0; var52 < field389; var52++) {
					CHKMTWJC var53 = field391[var52];
					if (var53 != null) {
						for (int var54 = 0; var54 < 10; var54++) {
							var53.field1003[var54] -= var47;
							var53.field1004[var54] -= var48;
						}

						var53.field1014 -= var47 * 128;
						var53.field1015 -= var48 * 128;
					}
				}

				field511 = true;
				byte var55 = 0;
				byte var56 = 104;
				byte var57 = 1;
				if (var47 < 0) {
					var55 = 103;
					var56 = -1;
					var57 = -1;
				}

				byte var58 = 0;
				byte var59 = 104;
				byte var60 = 1;
				if (var48 < 0) {
					var58 = 103;
					var59 = -1;
					var60 = -1;
				}

				for (int var61 = var55; var61 != var56; var61 += var57) {
					for (int var62 = var58; var62 != var59; var62 += var60) {
						int var63 = var47 + var61;
						int var64 = var48 + var62;
						for (int var65 = 0; var65 < 4; var65++) {
							if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
								field560[var65][var61][var62] = field560[var65][var63][var64];
							} else {
								field560[var65][var61][var62] = null;
							}
						}
					}
				}

				for (MLLEEKZP var66 = (MLLEEKZP) field303.method600(); var66 != null; var66 = (MLLEEKZP) field303.method602()) {
					var66.field955 -= var47;
					var66.field956 -= var48;
					if (var66.field955 < 0 || var66.field956 < 0 || var66.field955 >= 104 || var66.field956 >= 104) {
						var66.method367();
					}
				}

				if (field442 != 0) {
					field442 -= var47;
					field443 -= var48;
				}

				field138 = false;
				field140 = -1;
				return true;
			}

			if (field140 == 62) {
				int var67 = field154.method298();
				int var68 = field154.method325();

				if (field525 != -1) {
					method158(field525);
					field525 = -1;
					field457 = true;
				}

				if (field330 != -1) {
					method158(field330);
					field330 = -1;
					field402 = true;
				}

				if (field192 != -1) {
					method158(field192);
					field192 = -1;
				}

				if (field183 != var68) {
					method158(field183);
					field183 = var68;
				}

				if (field466 != var67) {
					method158(field466);
					field466 = var67;
				}

				if (field314 != 0) {
					field314 = 0;
					field457 = true;
				}

				field438 = true;
				field423 = true;
				field397 = false;
				field140 = -1;
				return true;
			}

			if (field140 == 181) {
				field138 = true;
				field169 = field154.method296();
				field170 = field154.method296();
				field171 = field154.method298();
				field172 = field154.method296();
				field173 = field154.method296();
				if (field173 >= 100) {
					field555 = field169 * 128 + 64;
					field557 = field170 * 128 + 64;
					field556 = method80(field545, field555, field557) - field171;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 53) {
				int var69 = field154.method326();
				int var70 = field154.method324();
				HWEMRKQZ.method256(var70).field847 = 2;
				HWEMRKQZ.method256(var70).field848 = var69;
				field140 = -1;
				return true;
			}

			if (field140 == 49) {
				int var71 = field154.method315();
				int var72 = field154.method298();
				if (var72 == 0xFFFF) {
					var72 = -1;
				}

				if (field527[var71] != var72) {
					method158(field527[var71]);
					field527[var71] = var72;
				}

				field438 = true;
				field423 = true;
				field140 = -1;
				return true;
			}

			if (field140 == 150) {
				byte var73 = field154.method297();
				int var74 = field154.method298();
				field488[var74] = var73;

				if (field262[var74] != var73) {
					field262[var74] = var73;
					method71(var74);
					field438 = true;

					if (field553 != -1) {
						field457 = true;
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 58) {
				field178 = field139 / 8;
				for (int var75 = 0; var75 < field178; var75++) {
					field497[var75] = field154.method302();
				}

				field140 = -1;
				return true;
			}

			if (field140 == 128) {
				field438 = true;
				int var76 = field154.method331();
				int var77 = field154.method315();
				int var78 = field154.method317();
				field445[var78] = var76;
				field441[var78] = var77;
				field563[var78] = 1;
				for (int var79 = 0; var79 < 98; var79++) {
					if (var76 >= field137[var79]) {
						field563[var78] = var79 + 2;
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 137) {
				field138 = false;

				for (int var80 = 0; var80 < 5; var80++) {
					field187[var80] = false;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 148) {
				field435 = field154.method296();
				field244 = field154.method296();
				field572 = field154.method296();
				field353 = true;
				field457 = true;
				field140 = -1;
				return true;
			}

			if (field140 == 216) {
				int var81 = field154.method296();
				int var82 = field154.method317();
				String var83 = field154.method303();
				if (var81 >= 1 && var81 <= 5) {
					if (var83.equalsIgnoreCase("null")) {
						var83 = null;
					}

					field349[var81 - 1] = var83;
					field350[var81 - 1] = var82 == 0;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 86) {
				int var84 = field154.method296();
				int var85 = field154.method296();
				int var86 = field154.method296();
				int var87 = field154.method296();
				field187[var84] = true;
				field175[var84] = var85;
				field323[var84] = var86;
				field543[var84] = var87;
				field148[var84] = 0;
				field140 = -1;
				return true;
			}

			if (field140 == 60) {
				int var88 = field154.method328();
				if (var88 >= 0) {
					method155(var88);
				}

				if (field446 != var88) {
					method158(field446);
					field446 = var88;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 35) {
				int var89 = field154.method325();
				int var90 = field154.method298();
				HWEMRKQZ var91 = HWEMRKQZ.method256(var90);
				if (var91 != null && var91.field793 == 0) {
					if (var89 < 0) {
						var89 = 0;
					}

					if (var89 > var91.field792 - var91.field813) {
						var89 = var91.field792 - var91.field813;
					}

					var91.field827 = var89;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 64) {
				int var92 = field154.method298();
				int var93 = field154.method327();
				int var94 = field154.method329();
				HWEMRKQZ var95 = HWEMRKQZ.method256(var92);
				var95.field789 = var93;
				var95.field844 = var94;
				field140 = -1;
				return true;
			}

			if (field140 == 251) {
				field428 = field154.method324();
				field454 = field154.method317();
				field140 = -1;
				return true;
			}

			if (field140 == 25) {
				field550 = field154.method296();
				field438 = true;
				field140 = -1;
				return true;
			}

			if (field140 == 205) {
				field425 = field154.method331();
				field355 = field154.method298();
				field461 = field154.method324();
				field575 = field154.method298();
				field154.method326();
				field154.method315();
				field472 = field154.method324();
				field154.method298();
				field344 = field154.method326();
				field241 = field154.method325();
				field154.method298();
				signlink.dnslookup(XBRLLWQI.method584(field425));
				field140 = -1;
				return true;
			}

			if (field140 == 106) {
				int var96 = field154.method324();
				int var97 = field154.method298();
				int var98 = field154.method298();

				if (var96 == 0xFFFF) {
					HWEMRKQZ.method256(var97).field847 = 0;
					field140 = -1;
					return true;
				}

				PICYKCUA var99 = PICYKCUA.method418(var96);
				HWEMRKQZ.method256(var97).field847 = 4;
				HWEMRKQZ.method256(var97).field848 = var96;
				HWEMRKQZ.method256(var97).field782 = var99.field1082;
				HWEMRKQZ.method256(var97).field783 = var99.field1107;
				HWEMRKQZ.method256(var97).field781 = var99.field1096 * 100 / var98;
				field140 = -1;
				return true;
			}

			if (field140 == 15) {
				int var100 = field154.method298();
				int var101 = field154.method325();
				method155(var100);

				if (var101 != -1) {
					method155(var101);
				}

				if (field183 != -1) {
					method158(field183);
					field183 = -1;
				}

				if (field466 != -1) {
					method158(field466);
					field466 = -1;
				}

				if (field525 != -1) {
					method158(field525);
					field525 = -1;
				}

				if (field330 != var100) {
					method158(field330);
					field330 = var100;
				}

				if (field192 != var100) {
					method158(field192);
					field192 = var101;
				}

				field314 = 0;
				field397 = false;
				field140 = -1;
				return true;
			}

			if (field140 == 219) {
				field542 = field154.method296();
				field140 = -1;
				return true;
			}

			if (field140 == 172) {
				method140(field139, field154);
				field140 = -1;
				return true;
			}

			if (field140 == 66) {
				int var102 = field154.method298();
				HWEMRKQZ var103 = HWEMRKQZ.method256(var102);
				for (int var104 = 0; var104 < var103.field796.length; var104++) {
					var103.field796[var104] = -1;
					var103.field796[var104] = 0;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 84) {
				int var105 = field154.method325();
				int var106 = field154.method298();
				HWEMRKQZ.method256(var106).field847 = 1;
				HWEMRKQZ.method256(var106).field848 = var105;
				field140 = -1;
				return true;
			}

			if (field140 == 176) {
				long var107 = field154.method302();
				int var109 = field154.method301();
				int var110 = field154.method296();
				boolean var111 = false;
				for (int var112 = 0; var112 < 100; var112++) {
					if (field562[var112] == var109) {
						var111 = true;
						break;
					}
				}

				if (var110 <= 1) {
					for (int var113 = 0; var113 < field178; var113++) {
						if (field497[var113] == var107) {
							var111 = true;
							break;
						}
					}
				}

				if (!var111 && field352 == 0) {
					try {
						field562[field409] = var109;
						field409 = (field409 + 1) % 100;
						String var114 = GVESONCD.method245(field154, field139 - 13);
						if (var110 != 3) {
							var114 = PBBEXDRS.method378(var114);
						}

						if (var110 == 2 || var110 == 3) {
							method69(7, "@cr2@" + XBRLLWQI.method585(XBRLLWQI.method582(var107)), var114);
						} else if (var110 == 1) {
							method69(7, "@cr1@" + XBRLLWQI.method585(XBRLLWQI.method582(var107)), var114);
						} else {
							method69(3, XBRLLWQI.method585(XBRLLWQI.method582(var107)), var114);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 197) {
				long var116 = field154.method302();
				int var118 = field154.method296();
				String var119 = XBRLLWQI.method585(XBRLLWQI.method582(var116));
				for (int var120 = 0; var120 < field549; var120++) {
					if (field460[var120] == var116) {
						if (field269[var120] != var118) {
							field269[var120] = var118;
							field438 = true;

							if (var118 > 0) {
								method69(5, "", var119 + " has logged in.");
							}

							if (var118 == 0) {
								method69(5, "", var119 + " has logged out.");
							}
						}

						var119 = null;
						break;
					}
				}

				if (var119 != null && field549 < 200) {
					field460[field549] = var116;
					field359[field549] = var119;
					field269[field549] = var118;
					field549++;
					field438 = true;
				}

				boolean var121 = false;
				while (!var121) {
					var121 = true;
					for (int var122 = 0; var122 < field549 - 1; var122++) {
						if (field269[var122] != field316 && field269[var122 + 1] == field316 || field269[var122] == 0 && field269[var122 + 1] != 0) {
							int var123 = field269[var122];
							field269[var122] = field269[var122 + 1];
							field269[var122 + 1] = var123;
							String var124 = field359[var122];
							field359[var122] = field359[var122 + 1];
							field359[var122 + 1] = var124;
							long var125 = field460[var122];
							field460[var122] = field460[var122 + 1];
							field460[var122 + 1] = var125;
							field438 = true;
							var121 = false;
						}
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 223) {
				String var127 = field154.method303();
				int var128 = field154.method324();
				HWEMRKQZ.method256(var128).field819 = var127;

				if (field527[field208] == HWEMRKQZ.method256(var128).field828) {
					field438 = true;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 37) {
				method67(field139, field154);
				field511 = false;
				field140 = -1;
				return true;
			}

			if (field140 == 158) {
				int var129 = field154.method298();
				int var130 = field154.method326();
				int var131 = field154.method324();
				HWEMRKQZ.method256(var129).field823 = (var131 << 16) + var130;
				field140 = -1;
				return true;
			}

			if (field140 == 46) {
				int var132 = field154.method298();
				int var133 = field154.method324();
				int var134 = var132 >> 10 & 0x1F;
				int var135 = var132 >> 5 & 0x1F;
				int var136 = var132 & 0x1F;
				HWEMRKQZ.method256(var133).field842 = (var136 << 3) + (var134 << 19) + (var135 << 11);
				field140 = -1;
				return true;
			}

			if (field140 == 1) {
				int var137 = field154.method327();
				int var138 = field154.method324();
				HWEMRKQZ var139 = HWEMRKQZ.method256(var138);
				if (var139.field794 != var137 || var137 == -1) {
					var139.field794 = var137;
					var139.field840 = 0;
					var139.field818 = 0;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 168) {
				for (int var140 = 0; var140 < field391.length; var140++) {
					if (field391[var140] != null) {
						field391[var140].field1044 = -1;
					}
				}

				for (int var141 = 0; var141 < field236.length; var141++) {
					if (field236[var141] != null) {
						field236[var141].field1044 = -1;
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 165) {
				if (field208 == 12) {
					field438 = true;
				}

				field163 = field154.method296();
				field140 = -1;
				return true;
			}

			if (field140 == 129) {
				field135 = field154.method296();
				if (field208 == field135) {
					if (field135 == 3) {
						field208 = 1;
					} else {
						field208 = 3;
					}

					field438 = true;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 144) {
				int var142 = field154.method327();
				if (field553 != var142) {
					method158(field553);
					field553 = var142;
				}

				field457 = true;
				field140 = -1;
				return true;
			}

			if (field140 == 104) {
				int var143 = field154.method298();
				int var144 = field154.method296();
				int var145 = field154.method298();
				if (field322 && !field319 && field504 < 50) {
					field215[field504] = var143;
					field521[field504] = var144;
					field564[field504] = BSYFPVLV.field5[var143] + var145;
					field504++;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 52) {
				field442 = 0;
				field140 = -1;
				return true;
			}

			if (field140 == 124) {
				field378 = false;
				field314 = 2;
				field343 = "";
				field457 = true;
				field140 = -1;
				return true;
			}

			if (field140 == 118) {
				int var146 = field154.method325();
				method155(var146);

				if (field466 != -1) {
					method158(field466);
					field466 = -1;
					field438 = true;
					field423 = true;
				}

				if (field330 != -1) {
					method158(field330);
					field330 = -1;
					field402 = true;
				}

				if (field192 != -1) {
					method158(field192);
					field192 = -1;
				}

				if (field183 != -1) {
					method158(field183);
					field183 = -1;
				}

				if (field525 != var146) {
					method158(field525);
					field525 = var146;
				}

				field397 = false;
				field457 = true;
				field140 = -1;
				return true;
			}

			if (field140 == 242) {
				String var147 = field154.method303();
				if (var147.endsWith(":tradereq:")) {
					String var148 = var147.substring(0, var147.indexOf(":"));
					long var149 = XBRLLWQI.method581(var148);
					boolean var151 = false;
					for (int var152 = 0; var152 < field178; var152++) {
						if (field497[var152] == var149) {
							var151 = true;
							break;
						}
					}

					if (!var151 && field352 == 0) {
						method69(4, var148, "wishes to trade with you.");
					}
				} else if (var147.endsWith(":duelreq:")) {
					String var153 = var147.substring(0, var147.indexOf(":"));
					long var154 = XBRLLWQI.method581(var153);
					boolean var156 = false;
					for (int var157 = 0; var157 < field178; var157++) {
						if (field497[var157] == var154) {
							var156 = true;
							break;
						}
					}

					if (!var156 && field352 == 0) {
						method69(8, var153, "wishes to duel with you.");
					}
				} else if (var147.endsWith(":chalreq:")) {
					String var158 = var147.substring(0, var147.indexOf(":"));
					long var159 = XBRLLWQI.method581(var158);
					boolean var161 = false;
					for (int var162 = 0; var162 < field178; var162++) {
						if (field497[var162] == var159) {
							var161 = true;
							break;
						}
					}

					if (!var161 && field352 == 0) {
						String var163 = var147.substring(var147.indexOf(":") + 1, var147.length() - 9);
						method69(8, var158, var163);
					}
				} else {
					method69(0, "", var147);
				}

				field140 = -1;
				return true;
			}

			if (field140 == 14) {
				int var164 = field154.method298();
				method155(var164);

				if (field466 != -1) {
					method158(field466);
					field466 = -1;
					field438 = true;
					field423 = true;
				}

				if (field525 != -1) {
					method158(field525);
					field525 = -1;
					field457 = true;
				}

				if (field330 != -1) {
					method158(field330);
					field330 = -1;
					field402 = true;
				}

				if (field192 != -1) {
					method158(field192);
					field192 = -1;
				}

				if (field183 != var164) {
					method158(field183);
					field183 = var164;
				}

				if (field314 != 0) {
					field314 = 0;
					field457 = true;
				}

				field397 = false;
				field140 = -1;
				return true;
			}

			if (field140 == 241) {
				field506 = field154.method316();
				field507 = field154.method316();
				for (int var165 = field506; var165 < field506 + 8; var165++) {
					for (int var166 = field507; var166 < field507 + 8; var166++) {
						if (field560[field545][var165][var166] != null) {
							field560[field545][var165][var166] = null;
							method199(var165, var166);
						}
					}
				}

				for (MLLEEKZP var167 = (MLLEEKZP) field303.method600(); var167 != null; var167 = (MLLEEKZP) field303.method602()) {
					if (var167.field955 >= field506 && var167.field955 < field506 + 8 && var167.field956 >= field507 && var167.field956 < field507 + 8 && field545 == var167.field953) {
						var167.field957 = 0;
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 71) {
				int var168 = field154.method324();
				method155(var168);

				if (field525 != -1) {
					method158(field525);
					field525 = -1;
					field457 = true;
				}

				if (field330 != -1) {
					method158(field330);
					field330 = -1;
					field402 = true;
				}

				if (field192 != -1) {
					method158(field192);
					field192 = -1;
				}

				if (field183 != -1) {
					method158(field183);
					field183 = -1;
				}

				if (field466 != var168) {
					method158(field466);
					field466 = var168;
				}

				if (field314 != 0) {
					field314 = 0;
					field457 = true;
				}

				field438 = true;
				field423 = true;
				field397 = false;
				field140 = -1;
				return true;
			}

			if (field140 == 253) {
				if (field466 != -1) {
					method158(field466);
					field466 = -1;
					field438 = true;
					field423 = true;
				}

				if (field525 != -1) {
					method158(field525);
					field525 = -1;
					field457 = true;
				}

				if (field330 != -1) {
					method158(field330);
					field330 = -1;
					field402 = true;
				}

				if (field192 != -1) {
					method158(field192);
					field192 = -1;
				}

				if (field183 != -1) {
					method158(field183);
					field183 = -1;
				}

				if (field314 != 0) {
					field314 = 0;
					field457 = true;
				}

				field397 = false;
				field140 = -1;
				return true;
			}

			if (field140 == 153) {
				field179 = field154.method296();
				if (field179 == 1) {
					field426 = field154.method298();
				}

				if (field179 >= 2 && field179 <= 6) {
					if (field179 == 2) {
						field222 = 64;
						field223 = 64;
					}

					if (field179 == 3) {
						field222 = 0;
						field223 = 64;
					}

					if (field179 == 4) {
						field222 = 128;
						field223 = 64;
					}

					if (field179 == 5) {
						field222 = 64;
						field223 = 0;
					}

					if (field179 == 6) {
						field222 = 64;
						field223 = 128;
					}

					field179 = 2;
					field219 = field154.method298();
					field220 = field154.method298();
					field221 = field154.method296();
				}

				if (field179 == 10) {
					field481 = field154.method298();
				}

				field140 = -1;
				return true;
			}

			if (field140 == 243) {
				field507 = field154.method296();
				field506 = field154.method315();
				field140 = -1;
				return true;
			}

			if (field140 == 16) {
				field507 = field154.method315();
				field506 = field154.method317();

				while (field154.field963 < field139) {
					int var169 = field154.method296();
					method129(var169, field154);
				}

				field140 = -1;
				return true;
			}

			if (field140 == 179) {
				if (field208 == 12) {
					field438 = true;
				}

				field398 = field154.method299();
				field140 = -1;
				return true;
			}

			if (field140 == 125) {
				field208 = field154.method315();
				field438 = true;
				field423 = true;
				field140 = -1;
				return true;
			}

			if (field140 == 5) {
				method176();
				field140 = -1;
				return false;
			}

			if (field140 == 32) {
				int var170 = field154.method298();
				int var171 = field154.method333();
				field488[var170] = var171;

				if (field262[var170] != var171) {
					field262[var170] = var171;
					method71(var170);
					field438 = true;

					if (field553 != -1) {
						field457 = true;
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 96) {
				field138 = true;
				field275 = field154.method296();
				field276 = field154.method296();
				field277 = field154.method298();
				field278 = field154.method296();
				field279 = field154.method296();
				if (field279 >= 100) {
					int var172 = field275 * 128 + 64;
					int var173 = field276 * 128 + 64;
					int var174 = method80(field545, var172, var173) - field277;
					int var175 = var172 - field555;
					int var176 = var174 - field556;
					int var177 = var173 - field557;
					int var178 = (int) Math.sqrt(var175 * var175 + var177 * var177);
					field558 = (int) (Math.atan2(var176, var178) * 325.949D) & 0x7FF;
					field559 = (int) (Math.atan2(var175, var177) * -325.949D) & 0x7FF;

					if (field558 < 128) {
						field558 = 128;
					}

					if (field558 > 383) {
						field558 = 383;
					}
				}

				field140 = -1;
				return true;
			}

			if (field140 == 30) {
				int var179 = field154.method325();
				HWEMRKQZ.method256(var179).field847 = 3;

				if (field447.field93 == null) {
					HWEMRKQZ.method256(var179).field848 = (field447.field88[11] << 5) + (field447.field88[8] << 10) + (field447.field88[0] << 15) + (field447.field91[0] << 25) + (field447.field91[4] << 20) + field447.field88[1];
				} else {
					HWEMRKQZ.method256(var179).field848 = (int) (field447.field93.field1395 + 0x12345678L);
				}

				field140 = -1;
				return true;
			}

			if (field140 == 206) {
				field438 = true;
				int var180 = field154.method298();
				HWEMRKQZ var181 = HWEMRKQZ.method256(var180);
				int var182 = field154.method298();
				for (int var183 = 0; var183 < var182; var183++) {
					var181.field796[var183] = field154.method298();
					int var184 = field154.method315();
					if (var184 == 255) {
						var184 = field154.method301();
					}

					var181.field830[var183] = var184;
				}

				for (int var185 = var182; var185 < var181.field796.length; var185++) {
					var181.field796[var185] = 0;
					var181.field830[var185] = 0;
				}

				field140 = -1;
				return true;
			}

			if (field140 == 114) {
				field378 = false;
				field314 = 1;
				field343 = "";
				field457 = true;
				field140 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field140 + "," + field139 + " - " + field347 + "," + field348);
			method176();
		} catch (IOException var190) {
			method78();
		} catch (Exception var191) {
			String var187 = "T2 - " + field140 + "," + field347 + "," + field348 + " - " + field139 + "," + (field447.field1003[0] + field226) + "," + (field447.field1004[0] + field227) + " - ";
			for (int var188 = 0; var188 < field139 && var188 < 50; var188++) {
				var187 = var187 + field154.field962[var188] + ",";
			}

			signlink.reporterror(var187);
			method176();
		}

		return true;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method124(int arg0) {
		if (arg0 >= 0) {
			int var2 = field204[arg0];
			int var3 = field205[arg0];
			int var4 = field206[arg0];
			int var5 = field207[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field314 != 0 && var4 != 1921) {
				field314 = 0;
				field457 = true;
			}

			if (var4 == 766) {
				method65(var2, var3, var5);
				field367.method285(217);
				field367.method323(field226 + var2);
				field367.method321(field227 + var3);
				field367.method321(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 790) {
				field367.method285(208);
				field367.method287(var3);
				HWEMRKQZ var6 = HWEMRKQZ.method256(var3);
				if (var6.field843 != null && var6.field843[0][0] == 5) {
					int var7 = var6.field843[0][1];
					field262[var7] = 1 - field262[var7];
					method71(var7);
					field438 = true;
				}
			}

			if (var4 == 24) {
				JMUIRIHZ var8 = field236[var5];
				if (var8 != null) {
					method64(2, false, 0, 1, var8.field1003[0], 1, 0, var8.field1004[0], field447.field1003[0], field447.field1004[0], 0);
					field499 = field657;
					field500 = field658;
					field502 = 2;
					field501 = 0;
					field367.method285(76);
					field367.method323(var5);
				}
			}

			if (var4 == 951) {
				field367.method285(208);
				field367.method287(var3);
				HWEMRKQZ var9 = HWEMRKQZ.method256(var3);
				if (var9.field843 != null && var9.field843[0][0] == 5) {
					int var10 = var9.field843[0][1];
					if (field262[var10] != var9.field808[0]) {
						field262[var10] = var9.field808[0];
						method71(var10);
						field438 = true;
					}
				}
			}

			if (var4 == 1577) {
				method65(var2, var3, var5);
				field367.method285(206);
				field367.method323(field226 + var2);
				field367.method321(field227 + var3);
				field367.method287(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 208) {
				method107();
			}

			if (var4 == 1335) {
				JMUIRIHZ var11 = field236[var5];
				if (var11 != null) {
					VWKJSKWX var12 = var11.field853;
					if (var12.field1400 != null) {
						var12 = var12.method570();
					}

					if (var12 != null) {
						String var13;
						if (var12.field1413 == null) {
							var13 = "It's a " + var12.field1391 + ".";
						} else {
							var13 = new String(var12.field1413);
						}

						method69(0, "", var13);
					}
				}
			}

			if (var4 == 696 || var4 == 379 || var4 == 526 || var4 == 212) {
				String var14 = field546[arg0];
				int var15 = var14.indexOf("@whi@");
				if (var15 != -1) {
					long var16 = XBRLLWQI.method581(var14.substring(var15 + 5).trim());
					if (var4 == 696) {
						method154(var16);
					}

					if (var4 == 379) {
						method167(var16);
					}

					if (var4 == 526) {
						method102(var16);
					}

					if (var4 == 212) {
						method105(var16);
					}
				}
			}

			if (var4 == 582) {
				HWEMRKQZ var18 = HWEMRKQZ.method256(var3);
				field385 = 1;
				field386 = var3;
				field387 = var18.field836;
				field360 = 0;
				field438 = true;
				String var19 = var18.field833;
				if (var19.indexOf(" ") != -1) {
					var19 = var19.substring(0, var19.indexOf(" "));
				}

				String var20 = var18.field833;
				if (var20.indexOf(" ") != -1) {
					var20 = var20.substring(var20.indexOf(" ") + 1);
				}

				field388 = var19 + " " + var18.field817 + " " + var20;

				if (field387 == 16) {
					field438 = true;
					field208 = 3;
					field423 = true;
				}
			} else {
				if (var4 == 621) {
					CHKMTWJC var21 = field391[var5];
					if (var21 != null) {
						method64(2, false, 0, 1, var21.field1003[0], 1, 0, var21.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(170);
						field367.method322(field386);
						field367.method287(var5);
					}
				}

				if (var4 == 184) {
					boolean var22 = method64(2, false, 0, 0, var2, 0, 0, var3, field447.field1003[0], field447.field1004[0], 0);
					if (!var22) {
						method64(2, false, 0, 1, var2, 1, 0, var3, field447.field1003[0], field447.field1004[0], 0);
					}

					field499 = field657;
					field500 = field658;
					field502 = 2;
					field501 = 0;
					field367.method285(41);
					field367.method287(var5);
					field367.method323(field227 + var3);
					field367.method287(field226 + var2);
				}

				if (var4 == 851) {
					JMUIRIHZ var24 = field236[var5];
					if (var24 != null) {
						method64(2, false, 0, 1, var24.field1003[0], 1, 0, var24.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;

						if ((var5 & 0x3) == 0) {
							field315++;
						}

						if (field315 >= 111) {
							field367.method285(199);
							field367.method290(0);
							field315 = 0;
						}

						field367.method285(37);
						field367.method287(var5);
					}
				}

				if (var4 == 940 || var4 == 113) {
					String var25 = field546[arg0];
					int var26 = var25.indexOf("@whi@");
					if (var26 != -1) {
						var25 = var25.substring(var26 + 5).trim();
						String var27 = XBRLLWQI.method585(XBRLLWQI.method582(XBRLLWQI.method581(var25)));
						boolean var28 = false;
						for (int var29 = 0; var29 < field392; var29++) {
							CHKMTWJC var30 = field391[field393[var29]];
							if (var30 != null && var30.field99 != null && var30.field99.equalsIgnoreCase(var27)) {
								method64(2, false, 0, 1, var30.field1003[0], 1, 0, var30.field1004[0], field447.field1003[0], field447.field1004[0], 0);

								if (var4 == 940) {
									field367.method285(162);
									field367.method287(field393[var29]);
								}

								if (var4 == 113) {
									field367.method285(99);
									field367.method323(field393[var29]);
								}

								var28 = true;
								break;
							}
						}

						if (!var28) {
							method69(0, "", "Unable to find " + var27);
						}
					}
				}

				if (var4 == 1327) {
					int var31 = var5 >> 14 & 0x7FFF;
					LYSBQDHB var32 = LYSBQDHB.method282(var31);
					String var33;
					if (var32.field903 == null) {
						var33 = "It's a " + var32.field918 + ".";
					} else {
						var33 = new String(var32.field903);
					}

					method69(0, "", var33);
				}

				if (var4 == 277) {
					field429++;
					if (field429 >= 132) {
						field367.method285(95);
						field367.method290(0);
						field429 = 0;
					}

					field367.method285(93);
					field367.method322(var3);
					field367.method322(var2);
					field367.method287(var5);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 1184) {
					PICYKCUA var34 = PICYKCUA.method418(var5);
					String var35;
					if (var34.field1099 == null) {
						var35 = "It's a " + var34.field1127 + ".";
					} else {
						var35 = new String(var34.field1099);
					}

					method69(0, "", var35);
				}

				if (var4 == 1) {
					field367.method285(73);
					field367.method322(var3);
					field367.method322(var5);
					field367.method287(var2);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 482) {
					method158(field553);
					field553 = -1;
					field457 = true;
				}

				if (var4 == 946) {
					field367.method285(17);
					field367.method322(var2);
					field367.method322(var5);
					field367.method287(var3);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 391) {
					field367.method285(174);
					field367.method322(var2);
					field367.method323(var5);
					field367.method321(var3);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 426) {
					HWEMRKQZ var36 = HWEMRKQZ.method256(var3);
					boolean var37 = true;
					if (var36.field841 > 0) {
						var37 = method133(var36);
					}

					if (var37) {
						field367.method285(208);
						field367.method287(var3);
					}
				}

				if (var4 == 896) {
					CHKMTWJC var38 = field391[var5];
					if (var38 != null) {
						method64(2, false, 0, 1, var38.field1003[0], 1, 0, var38.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(162);
						field367.method287(var5);
					}
				}

				if (var4 == 247) {
					String var39 = field546[arg0];
					int var40 = var39.indexOf("@whi@");
					if (var40 != -1) {
						long var41 = XBRLLWQI.method581(var39.substring(var40 + 5).trim());
						int var43 = -1;
						for (int var44 = 0; var44 < field549; var44++) {
							if (field460[var44] == var41) {
								var43 = var44;
								break;
							}
						}

						if (var43 != -1 && field269[var43] > 0) {
							field457 = true;
							field314 = 0;
							field378 = true;
							field400 = "";
							field313 = 3;
							field145 = field460[var43];
							field332 = "Enter message to send to " + field359[var43];
						}
					}
				}

				if (var4 == 985) {
					field541 += var3;
					if (field541 >= 145) {
						field367.method285(100);
						field541 = 0;
					}

					method65(var2, var3, var5);
					field367.method285(59);
					field367.method287(var5 >> 14 & 0x7FFF);
					field367.method321(field227 + var3);
					field367.method322(field226 + var2);
				}

				if (var4 == 62) {
					boolean var45 = method64(2, false, 0, 0, var2, 0, 0, var3, field447.field1003[0], field447.field1004[0], 0);
					if (!var45) {
						method64(2, false, 0, 1, var2, 1, 0, var3, field447.field1003[0], field447.field1004[0], 0);
					}

					field499 = field657;
					field500 = field658;
					field502 = 2;
					field501 = 0;
					field367.method285(113);
					field367.method322(field361);
					field367.method321(field227 + var3);
					field367.method322(field363);
					field367.method323(field362);
					field367.method287(field226 + var2);
					field367.method287(var5);
				}

				if (var4 == 81) {
					boolean var47 = method64(2, false, 0, 0, var2, 0, 0, var3, field447.field1003[0], field447.field1004[0], 0);
					if (!var47) {
						method64(2, false, 0, 1, var2, 1, 0, var3, field447.field1003[0], field447.field1004[0], 0);
					}

					field499 = field657;
					field500 = field658;
					field502 = 2;
					field501 = 0;
					field367.method285(12);
					field367.method322(var5);
					field367.method287(field227 + var3);
					field367.method323(field226 + var2);
				}

				if (var4 == 281) {
					field290 += var3;
					if (field290 >= 82) {
						field367.method285(182);
						field290 = 0;
					}

					field367.method285(255);
					field367.method287(var2);
					field367.method322(var5);
					field367.method322(var3);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 256) {
					method65(var2, var3, var5);
					field367.method285(102);
					field367.method321(field226 + var2);
					field367.method322(field227 + var3);
					field367.method322(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 157 && method65(var2, var3, var5)) {
					field367.method285(90);
					field367.method287(field227 + var3);
					field367.method322(var5 >> 14 & 0x7FFF);
					field367.method287(field226 + var2);
					field367.method323(field386);
				}

				if (var4 == 883) {
					CHKMTWJC var49 = field391[var5];
					if (var49 != null) {
						method64(2, false, 0, 1, var49.field1003[0], 1, 0, var49.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(99);
						field367.method323(var5);
					}
				}

				if (var4 == 233) {
					CHKMTWJC var50 = field391[var5];
					if (var50 != null) {
						method64(2, false, 0, 1, var50.field1003[0], 1, 0, var50.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(190);
						field367.method287(var5);
					}
				}

				if (var4 == 1870) {
					PICYKCUA var51 = PICYKCUA.method418(var5);
					HWEMRKQZ var52 = HWEMRKQZ.method256(var3);
					String var53;
					if (var52 != null && var52.field830[var2] >= 100000) {
						var53 = var52.field830[var2] + " x " + var51.field1127;
					} else if (var51.field1099 == null) {
						var53 = "It's a " + var51.field1127 + ".";
					} else {
						var53 = new String(var51.field1099);
					}

					method69(0, "", var53);
				}

				if (var4 == 789) {
					field367.method285(14);
					field367.method323(field386);
					field367.method287(var5);
					field367.method321(var3);
					field367.method322(var2);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 145) {
					CHKMTWJC var54 = field391[var5];
					if (var54 != null) {
						method64(2, false, 0, 1, var54.field1003[0], 1, 0, var54.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field284 += var5;
						if (field284 >= 50) {
							field367.method285(164);
							field367.method289(0x3A9711);
							field284 = 0;
						}

						field367.method285(54);
						field367.method322(var5);
					}
				}

				if (var4 == 983) {
					JMUIRIHZ var55 = field236[var5];
					if (var55 != null) {
						method64(2, false, 0, 1, var55.field1003[0], 1, 0, var55.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(158);
						field367.method321(var5);
					}
				}

				if (var4 == 703) {
					CHKMTWJC var56 = field391[var5];
					if (var56 != null) {
						method64(2, false, 0, 1, var56.field1003[0], 1, 0, var56.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(189);
						field367.method322(var5);
						field367.method287(field362);
						field367.method322(field361);
						field367.method321(field363);
					}
				}

				if (var4 == 275) {
					boolean var57 = method64(2, false, 0, 0, var2, 0, 0, var3, field447.field1003[0], field447.field1004[0], 0);
					if (!var57) {
						method64(2, false, 0, 1, var2, 1, 0, var3, field447.field1003[0], field447.field1004[0], 0);
					}

					field499 = field657;
					field500 = field658;
					field502 = 2;
					field501 = 0;
					field367.method285(143);
					field367.method321(field227 + var3);
					field367.method322(var5);
					field367.method321(field226 + var2);
				}

				if (var4 == 530) {
					field367.method285(19);
					field367.method321(var3);
					field367.method321(var2);
					field367.method323(var5);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 646) {
					JMUIRIHZ var59 = field236[var5];
					if (var59 != null) {
						method64(2, false, 0, 1, var59.field1003[0], 1, 0, var59.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(48);
						field367.method287(field362);
						field367.method321(field363);
						field367.method321(var5);
						field367.method321(field361);
					}
				}

				if (var4 == 447) {
					JMUIRIHZ var60 = field236[var5];
					if (var60 != null) {
						method64(2, false, 0, 1, var60.field1003[0], 1, 0, var60.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(163);
						field367.method322(var5);
					}
				}

				if (var4 == 485) {
					field367.method285(117);
					field367.method323(var5);
					field367.method321(var2);
					field367.method323(var3);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 377) {
					field367.method285(226);
					field367.method323(var2);
					field367.method287(var5);
					field367.method321(var3);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 181) {
					field367.method285(140);
					field367.method321(var2);
					field367.method322(var3);
					field367.method323(var5);
					field462 = 0;
					field463 = var3;
					field464 = var2;
					field465 = 2;
					if (HWEMRKQZ.method256(var3).field828 == field183) {
						field465 = 1;
					}

					if (HWEMRKQZ.method256(var3).field828 == field525) {
						field465 = 3;
					}
				}

				if (var4 == 359) {
					CHKMTWJC var61 = field391[var5];
					if (var61 != null) {
						method64(2, false, 0, 1, var61.field1003[0], 1, 0, var61.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(134);
						field367.method321(var5);
					}
				}

				if (var4 == 403) {
					JMUIRIHZ var62 = field236[var5];
					if (var62 != null) {
						method64(2, false, 0, 1, var62.field1003[0], 1, 0, var62.field1004[0], field447.field1003[0], field447.field1004[0], 0);
						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(21);
						field367.method321(var5);
						field367.method321(field386);
					}
				}

				if (var4 == 588) {
					method65(var2, var3, var5);
					field367.method285(9);
					field367.method321(field227 + var3);
					field367.method322(var5 >> 14 & 0x7FFF);
					field367.method323(field226 + var2);
				}

				if (var4 == 405 && !field397) {
					field367.method285(154);
					field367.method287(var3);
					field397 = true;
				}

				if (var4 == 963) {
					field360 = 1;
					field361 = var2;
					field362 = var3;
					field363 = var5;
					field364 = PICYKCUA.method418(var5).field1127;
					field385 = 0;
					field438 = true;
				} else {
					if (var4 == 98) {
						boolean var63 = method64(2, false, 0, 0, var2, 0, 0, var3, field447.field1003[0], field447.field1004[0], 0);
						if (!var63) {
							method64(2, false, 0, 1, var2, 1, 0, var3, field447.field1003[0], field447.field1004[0], 0);
						}

						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(105);
						field367.method323(field227 + var3);
						field367.method321(var5);
						field367.method322(field226 + var2);
					}

					if (var4 == 16) {
						if (field270) {
							field351.method525(var3 - 4, var2 - 4);
						} else {
							field351.method525(field658 - 4, field657 - 4);
						}
					}

					if (var4 == 538) {
						boolean var65 = method64(2, false, 0, 0, var2, 0, 0, var3, field447.field1003[0], field447.field1004[0], 0);
						if (!var65) {
							method64(2, false, 0, 1, var2, 1, 0, var3, field447.field1003[0], field447.field1004[0], 0);
						}

						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field367.method285(104);
						field367.method322(field226 + var2);
						field367.method287(field227 + var3);
						field367.method321(field386);
						field367.method287(var5);
					}

					if (var4 == 689) {
						boolean var67 = method64(2, false, 0, 0, var2, 0, 0, var3, field447.field1003[0], field447.field1004[0], 0);
						if (!var67) {
							method64(2, false, 0, 1, var2, 1, 0, var3, field447.field1003[0], field447.field1004[0], 0);
						}

						field499 = field657;
						field500 = field658;
						field502 = 2;
						field501 = 0;
						field328 += var3;
						if (field328 >= 102) {
							field367.method285(30);
							field367.method290(0);
							field328 = 0;
						}

						field367.method285(57);
						field367.method287(var5);
						field367.method287(field226 + var2);
						field367.method322(field227 + var3);
					}

					if (var4 == 787) {
						String var69 = field546[arg0];
						int var70 = var69.indexOf("@whi@");
						if (var70 != -1) {
							if (field183 == -1) {
								method107();
								field537 = var69.substring(var70 + 5).trim();
								field312 = false;
								field456 = field183 = HWEMRKQZ.field803;
							} else {
								method69(0, "", "Please close the interface you have open before using 'report abuse'");
							}
						}
					}

					if (var4 == 515) {
						JMUIRIHZ var71 = field236[var5];
						if (var71 != null) {
							method64(2, false, 0, 1, var71.field1003[0], 1, 0, var71.field1004[0], field447.field1003[0], field447.field1004[0], 0);
							field499 = field657;
							field500 = field658;
							field502 = 2;
							field501 = 0;
							field367.method285(16);
							field367.method322(var5);
						}
					}

					if (var4 == 395) {
						field367.method285(137);
						field367.method321(var3);
						field367.method287(field362);
						field367.method321(field363);
						field367.method322(field361);
						field367.method322(var2);
						field367.method321(var5);
						field462 = 0;
						field463 = var3;
						field464 = var2;
						field465 = 2;
						if (HWEMRKQZ.method256(var3).field828 == field183) {
							field465 = 1;
						}

						if (HWEMRKQZ.method256(var3).field828 == field525) {
							field465 = 3;
						}
					}

					if (var4 == 152) {
						if ((var2 & 0x3) == 0) {
							field274++;
						}

						if (field274 >= 129) {
							field367.method285(87);
							field367.method287(37562);
							field274 = 0;
						}

						field367.method285(176);
						field367.method287(var3);
						field367.method287(var2);
						field367.method287(var5);
						field462 = 0;
						field463 = var3;
						field464 = var2;
						field465 = 2;
						if (HWEMRKQZ.method256(var3).field828 == field183) {
							field465 = 1;
						}

						if (HWEMRKQZ.method256(var3).field828 == field525) {
							field465 = 3;
						}
					}

					if (var4 == 419 && method65(var2, var3, var5)) {
						field367.method285(18);
						field367.method323(field363);
						field367.method322(var5 >> 14 & 0x7FFF);
						field367.method287(field361);
						field367.method321(field226 + var2);
						field367.method323(field362);
						field367.method287(field227 + var3);
					}

					field360 = 0;
					field385 = 0;
					field438 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLMLYYHULT;I)V")
	public final void method125(MLYYHULT arg0, int arg1) {
		for (int var3 = 0; var3 < field394; var3++) {
			int var4 = field395[var3];
			CHKMTWJC var5 = field391[var4];
			int var6 = arg0.method296();
			if ((var6 & 0x4) != 0) {
				var6 += arg0.method296() << 8;
			}

			method106(var6, var5, var4, arg0);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method126() {
		if (field491 == 0) {
			int var1 = field640 / 2 - 80;
			int var2 = field641 / 2 + 20;
			var2 += 20;
			if (field656 == 1 && field657 >= var1 - 75 && field657 <= var1 + 75 && field658 >= var2 - 20 && field658 <= var2 + 20) {
				field491 = 3;
				field320 = 0;
			}

			int var3 = field640 / 2 + 80;
			if (field656 == 1 && field657 >= var3 - 75 && field657 <= var3 + 75 && field658 >= var2 - 20 && field658 <= var2 + 20) {
				field431 = "";
				field432 = "Enter your username & password.";
				field491 = 2;
				field320 = 0;
			}
		} else if (field491 == 2) {
			int var4 = field641 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field656 == 1 && field658 >= var4 - 15 && field658 < var4) {
				field320 = 0;
			}

			var4 += 15;
			if (field656 == 1 && field658 >= var4 - 15 && field658 < var4) {
				field320 = 1;
			}

			var4 += 15;
			int var5 = field640 / 2 - 80;
			int var6 = field641 / 2 + 50;
			var6 += 20;
			if (field656 == 1 && field657 >= var5 - 75 && field657 <= var5 + 75 && field658 >= var6 - 20 && field658 <= var6 + 20) {
				field296 = 0;
				method191(field473, field474, false);

				if (field288) {
					return;
				}
			}

			int var7 = field640 / 2 + 80;
			if (field656 == 1 && field657 >= var7 - 75 && field657 <= var7 + 75 && field658 >= var6 - 20 && field658 <= var6 + 20) {
				field491 = 0;
				field473 = "";
				field474 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method223();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field147.length(); var10++) {
					if (var8 == field147.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field320 == 0) {
					if (var8 == 8 && field473.length() > 0) {
						field473 = field473.substring(0, field473.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field320 = 1;
					}

					if (var9) {
						field473 = field473 + (char) var8;
					}

					if (field473.length() > 12) {
						field473 = field473.substring(0, 12);
					}
				} else if (field320 == 1) {
					if (var8 == 8 && field474.length() > 0) {
						field474 = field474.substring(0, field474.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field320 = 0;
					}

					if (var9) {
						field474 = field474 + (char) var8;
					}

					if (field474.length() > 20) {
						field474 = field474.substring(0, 20);
					}
				}
			}
		} else if (field491 == 3) {
			int var11 = field640 / 2;
			int var12 = field641 / 2 + 50;
			var12 += 20;
			if (field656 == 1 && field657 >= var11 - 75 && field657 <= var11 + 75 && field658 >= var12 - 20 && field658 <= var12 + 20) {
				field491 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILHWEMRKQZ;)I")
	public final int method127(int arg0, HWEMRKQZ arg1) {
		if (arg1.field843 == null || arg0 >= arg1.field843.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field843[arg0];
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
					var8 = field441[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field563[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field445[var3[var5++]];
				}

				if (var7 == 4) {
					HWEMRKQZ var10 = HWEMRKQZ.method256(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < PICYKCUA.field1097 && (!PICYKCUA.method418(var11).field1126 || field318)) {
						for (int var12 = 0; var12 < var10.field796.length; var12++) {
							if (var11 + 1 == var10.field796[var12]) {
								var8 += var10.field830[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field262[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field137[field563[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field262[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field447.field101;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < HJKFAAYN.field774; var13++) {
						if (HJKFAAYN.field776[var13]) {
							var8 += field563[var13];
						}
					}
				}

				if (var7 == 10) {
					HWEMRKQZ var14 = HWEMRKQZ.method256(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < PICYKCUA.field1097 && (!PICYKCUA.method418(var15).field1126 || field318)) {
						for (int var16 = 0; var16 < var14.field796.length; var16++) {
							if (var14.field796[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field163;
				}

				if (var7 == 12) {
					var8 = field398;
				}

				if (var7 == 13) {
					int var17 = field262[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					WOJPETNO var20 = WOJPETNO.field1422[var19];
					int var21 = var20.field1424;
					int var22 = var20.field1425;
					int var23 = var20.field1426;
					int var24 = field144[var23 - var22];
					var8 = field262[var21] >> var22 & var24;
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
					var8 = (field447.field1014 >> 7) + field226;
				}

				if (var7 == 19) {
					var8 = (field447.field1015 >> 7) + field227;
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

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field645 != null) {
				return new URL("http://127.0.0.1:" + (field317 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 350);

			if (arg0.length == 5) {
				field316 = Integer.parseInt(arg0[0]);
				field317 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method164();
				} else if (arg0[2].equals("highmem")) {
					method130();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field318 = false;
				} else if (arg0[3].equals("members")) {
					field318 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method219(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method128() {
		method110();

		if (field502 == 1) {
			field422[field501 / 100].method474(field499 - 8 - 4, field500 - 8 - 4);
		}

		if (field502 == 2) {
			field422[field501 / 100 + 4].method474(field499 - 8 - 4, field500 - 8 - 4);
		}

		if (field446 != -1) {
			method70(field446, field246);
			method148(0, 0, 0, HWEMRKQZ.method256(field446));
		}

		if (field183 != -1) {
			method70(field183, field246);
			method148(0, 0, 0, HWEMRKQZ.method256(field183));
		}

		method115();

		if (!field270) {
			method203();
			method82();
		} else if (field467 == 0) {
			method147();
		}

		if (field184 == 1) {
			field538.method474(472, 296);
		}

		if (field433) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field638 < 30 && field319) {
				var3 = 0xFF0000;
			}

			if (field638 < 20 && !field319) {
				var3 = 0xFF0000;
			}

			field305.method453(var1, var2, var3, "Fps:" + field638);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field319) {
				int var7 = 0xFF0000;
			}

			if (var5 > 0x4000000 && !field319) {
				int var8 = 0xFF0000;
			}

			field305.method453(var1, var2, 0xFFFF00, "Mem:" + var5 + "k");
			var2 += 15;
		}

		if (field345 != 0) {
			int var9 = field345 / 50;
			int var10 = var9 / 60;
			var9 %= 60;
			if (var9 < 10) {
				field305.method458(0xFFFF00, 4, 329, "System update in: " + var10 + ":0" + var9);
			} else {
				field305.method458(0xFFFF00, 4, 329, "System update in: " + var10 + ":" + var9);
			}
		}
	}

	@ObfuscatedName("client.b(IILMLYYHULT;)V")
	public final void method129(int arg0, MLYYHULT arg1) {
		if (arg0 == 126) {
			int var3 = arg1.method298();
			int var4 = arg1.method316();
			int var5 = var4 >> 2;
			int var6 = var4 & 0x3;
			int var7 = field214[var5];
			int var8 = arg1.method315();
			int var9 = (var8 >> 4 & 0x7) + field506;
			int var10 = (var8 & 0x7) + field507;
			if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
				int var11 = field233[field545][var9][var10];
				int var12 = field233[field545][var9 + 1][var10];
				int var13 = field233[field545][var9 + 1][var10 + 1];
				int var14 = field233[field545][var9][var10 + 1];
				if (var7 == 0) {
					XZAAVEGI var15 = field351.method509(field545, var10, var9);
					if (var15 != null) {
						int var16 = var15.field1459 >> 14 & 0x7FFF;
						if (var5 == 2) {
							var15.field1457 = new DROEXFTE(false, var6 + 4, var16, 2, var11, var12, var13, var3, var14);
							var15.field1458 = new DROEXFTE(false, var6 + 1 & 0x3, var16, 2, var11, var12, var13, var3, var14);
						} else {
							var15.field1457 = new DROEXFTE(false, var6, var16, var5, var11, var12, var13, var3, var14);
						}
					}
				}

				if (var7 == 1) {
					SILRHMYS var17 = field351.method510(field545, var9, var10);
					if (var17 != null) {
						var17.field1227 = new DROEXFTE(false, 0, var17.field1228 >> 14 & 0x7FFF, 4, var11, var12, var13, var3, var14);
					}
				}

				if (var7 == 2) {
					OSMAAYAE var18 = field351.method511(field545, var10, var9);

					if (var5 == 11) {
						var5 = 10;
					}

					if (var18 != null) {
						var18.field1055 = new DROEXFTE(false, var6, var18.field1063 >> 14 & 0x7FFF, var5, var11, var12, var13, var3, var14);
					}
				}

				if (var7 == 3) {
					ETVGHEQO var19 = field351.method512(var9, var10, field545);
					if (var19 != null) {
						var19.field667 = new DROEXFTE(false, var6, var19.field668 >> 14 & 0x7FFF, 22, var11, var12, var13, var3, var14);
					}
				}
			}
		} else if (arg0 == 175) {
			int var20 = arg1.method296();
			int var21 = (var20 >> 4 & 0x7) + field506;
			int var22 = (var20 & 0x7) + field507;
			int var23 = arg1.method298();
			int var24 = arg1.method296();
			int var25 = arg1.method298();
			if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
				var21 = var21 * 128 + 64;
				var22 = var22 * 128 + 64;
				ROWJKVEC var26 = new ROWJKVEC(var25, var22, method80(field545, var21, var22) - var24, var23, field545, field449, var21);
				field340.method597(var26);
			}
		} else {
			if (arg0 == 40) {
				int var27 = arg1.method296();
				int var28 = (var27 >> 4 & 0x7) + field506;
				int var29 = (var27 & 0x7) + field507;
				int var30 = arg1.method298();
				int var31 = arg1.method296();
				int var32 = var31 >> 4 & 0xF;
				int var33 = var31 & 0x7;
				if (field447.field1003[0] >= var28 - var32 && field447.field1003[0] <= var28 + var32 && field447.field1004[0] >= var29 - var32 && field447.field1004[0] <= var29 + var32 && field322 && !field319 && field504 < 50) {
					field215[field504] = var30;
					field521[field504] = var33;
					field564[field504] = BSYFPVLV.field5[var30];
					field504++;
				}
			}

			if (arg0 == 164) {
				int var34 = arg1.method316();
				int var35 = (var34 >> 4 & 0x7) + field506;
				int var36 = (var34 & 0x7) + field507;
				int var37 = arg1.method296();
				int var38 = var37 >> 2;
				int var39 = var37 & 0x3;
				int var40 = field214[var38];
				if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
					method113(var38, -1, -1, var35, var36, var39, var40, 0, field545);
				}
			} else {
				if (arg0 == 255) {
					int var41 = arg1.method324();
					byte var42 = arg1.method319();
					int var43 = arg1.method325();
					byte var44 = arg1.method320();
					byte var45 = arg1.method320();
					int var46 = arg1.method296();
					int var47 = (var46 >> 4 & 0x7) + field506;
					int var48 = (var46 & 0x7) + field507;
					int var49 = arg1.method326();
					int var50 = arg1.method317();
					int var51 = var50 >> 2;
					int var52 = var50 & 0x3;
					int var53 = field214[var51];
					byte var54 = arg1.method318();
					int var55 = arg1.method326();
					CHKMTWJC var56;
					if (field428 == var41) {
						var56 = field447;
					} else {
						var56 = field391[var41];
					}

					if (var56 != null) {
						LYSBQDHB var57 = LYSBQDHB.method282(var55);
						int var58 = field233[field545][var47][var48];
						int var59 = field233[field545][var47 + 1][var48];
						int var60 = field233[field545][var47 + 1][var48 + 1];
						int var61 = field233[field545][var47][var48 + 1];
						CADBNSXE var62 = var57.method283(var51, var52, var58, var59, var60, var61, -1);
						if (var62 != null) {
							method113(0, -1, var49 + 1, var47, var48, 0, var53, var43 + 1, field545);
							var56.field103 = field449 + var43;
							var56.field104 = field449 + var49;
							var56.field108 = var62;
							int var63 = var57.field882;
							int var64 = var57.field891;
							if (var52 == 1 || var52 == 3) {
								var63 = var57.field891;
								var64 = var57.field882;
							}

							var56.field105 = var47 * 128 + var63 * 64;
							var56.field107 = var48 * 128 + var64 * 64;
							var56.field106 = method80(field545, var56.field105, var56.field107);

							if (var45 > var44) {
								byte var65 = var45;
								var45 = var44;
								var44 = var65;
							}

							if (var54 > var42) {
								byte var66 = var54;
								var54 = var42;
								var42 = var66;
							}

							var56.field94 = var45 + var47;
							var56.field96 = var44 + var47;
							var56.field95 = var48 + var54;
							var56.field97 = var42 + var48;
						}
					}
				}

				if (arg0 == 198) {
					int var67 = arg1.method317();
					int var68 = (var67 >> 4 & 0x7) + field506;
					int var69 = (var67 & 0x7) + field507;
					int var70 = arg1.method298();
					int var71 = arg1.method316();
					int var72 = var71 >> 2;
					int var73 = var71 & 0x3;
					int var74 = field214[var72];
					if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
						method113(var72, var70, -1, var68, var69, var73, var74, 0, field545);
					}
				} else if (arg0 == 146) {
					int var75 = arg1.method296();
					int var76 = (var75 >> 4 & 0x7) + field506;
					int var77 = (var75 & 0x7) + field507;
					int var78 = var76 + arg1.method297();
					int var79 = var77 + arg1.method297();
					int var80 = arg1.method299();
					int var81 = arg1.method298();
					int var82 = arg1.method296() * 4;
					int var83 = arg1.method296() * 4;
					int var84 = arg1.method298();
					int var85 = arg1.method298();
					int var86 = arg1.method296();
					int var87 = arg1.method296();
					if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && var81 != 0xFFFF) {
						var76 = var76 * 128 + 64;
						var77 = var77 * 128 + 64;
						var78 = var78 * 128 + 64;
						var79 = var79 * 128 + 64;
						YBXLKULU var88 = new YBXLKULU(var81, field449 + var84, field449 + var85, var80, var77, var86, var76, field545, var87, var83, method80(field545, var76, var77) - var82);
						var88.method591(var79, field449 + var84, method80(field545, var78, var79) - var83, var78);
						field162.method597(var88);
					}
				} else if (arg0 == 2) {
					int var89 = arg1.method296();
					int var90 = (var89 >> 4 & 0x7) + field506;
					int var91 = (var89 & 0x7) + field507;
					int var92 = arg1.method298();
					int var93 = arg1.method298();
					int var94 = arg1.method298();
					if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
						ZWZXPJNQ var95 = field560[field545][var90][var91];
						if (var95 != null) {
							for (YLPPYQUD var96 = (YLPPYQUD) var95.method600(); var96 != null; var96 = (YLPPYQUD) var95.method602()) {
								if ((var92 & 0x7FFF) == var96.field1492 && var96.field1491 == var93) {
									var96.field1491 = var94;
									break;
								}
							}

							method199(var90, var91);
						}
					}
				} else if (arg0 == 65) {
					int var97 = arg1.method296();
					int var98 = (var97 >> 4 & 0x7) + field506;
					int var99 = (var97 & 0x7) + field507;
					int var100 = arg1.method325();
					int var101 = arg1.method298();
					int var102 = arg1.method298();
					if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && field428 != var101) {
						YLPPYQUD var103 = new YLPPYQUD();
						var103.field1492 = var102;
						var103.field1491 = var100;

						if (field560[field545][var98][var99] == null) {
							field560[field545][var98][var99] = new ZWZXPJNQ();
						}

						field560[field545][var98][var99].method597(var103);
						method199(var98, var99);
					}
				} else if (arg0 == 121) {
					int var104 = arg1.method317();
					int var105 = (var104 >> 4 & 0x7) + field506;
					int var106 = (var104 & 0x7) + field507;
					int var107 = arg1.method326();
					if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
						ZWZXPJNQ var108 = field560[field545][var105][var106];
						if (var108 != null) {
							for (YLPPYQUD var109 = (YLPPYQUD) var108.method600(); var109 != null; var109 = (YLPPYQUD) var108.method602()) {
								if ((var107 & 0x7FFF) == var109.field1492) {
									var109.method367();
									break;
								}
							}

							if (var108.method600() == null) {
								field560[field545][var105][var106] = null;
							}

							method199(var105, var106);
						}
					}
				} else if (arg0 == 250) {
					int var110 = arg1.method296();
					int var111 = (var110 >> 4 & 0x7) + field506;
					int var112 = (var110 & 0x7) + field507;
					int var113 = arg1.method325();
					int var114 = arg1.method326();
					if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
						YLPPYQUD var115 = new YLPPYQUD();
						var115.field1492 = var113;
						var115.field1491 = var114;

						if (field560[field545][var111][var112] == null) {
							field560[field545][var111][var112] = new ZWZXPJNQ();
						}

						field560[field545][var111][var112].method597(var115);
						method199(var111, var112);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public static final void method130() {
		TAWLWNCF.field1265 = false;
		PNDCOEKM.field1130 = false;
		field319 = false;
		CJZJWICI.field124 = false;
		LYSBQDHB.field893 = false;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method131(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method131(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;)Z")
	public final boolean method132(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field549; var2++) {
			if (arg0.equalsIgnoreCase(field359[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field447.field99)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(LHWEMRKQZ;I)Z")
	public final boolean method133(HWEMRKQZ arg0) {
		int var2 = arg0.field841;
		if (field550 == 2) {
			if (var2 == 201) {
				field457 = true;
				field314 = 0;
				field378 = true;
				field400 = "";
				field313 = 1;
				field332 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field457 = true;
				field314 = 0;
				field378 = true;
				field400 = "";
				field313 = 2;
				field332 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field143 = 250;
			return true;
		}

		if (var2 == 501) {
			field457 = true;
			field314 = 0;
			field378 = true;
			field400 = "";
			field313 = 4;
			field332 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field457 = true;
			field314 = 0;
			field378 = true;
			field400 = "";
			field313 = 5;
			field332 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field239[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = NQIAMATB.field980 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= NQIAMATB.field980) {
							var5 = 0;
						}
					}

					if (!NQIAMATB.field981[var5].field987 && NQIAMATB.field981[var5].field982 == var3 + (field247 ? 0 : 7)) {
						break;
					}
				}

				field239[var3] = var5;
				field480 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field242[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field292[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field292[var6].length) {
					var8 = 0;
				}
			}

			field242[var6] = var8;
			field480 = true;
		}

		if (var2 == 324 && !field247) {
			field247 = true;
			method66();
		}

		if (var2 == 325 && field247) {
			field247 = false;
			method66();
		}

		if (var2 == 326) {
			field367.method285(205);
			field367.method286(field247 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field367.method286(field239[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field367.method286(field242[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field312 = !field312;
		}

		if (var2 >= 601 && var2 <= 613) {
			method107();

			if (field537.length() > 0) {
				field367.method285(3);
				field367.method292(XBRLLWQI.method581(field537));
				field367.method286(var2 - 601);
				field367.method286(field312 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method134(boolean arg0) {
		for (int var2 = 0; var2 < field237; var2++) {
			JMUIRIHZ var3 = field236[field238[var2]];
			int var4 = (field238[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method38() && var3.field853.field1410 == arg0 && var3.field853.method569()) {
				int var5 = var3.field1014 >> 7;
				int var6 = var3.field1015 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1007 == 1 && (var3.field1014 & 0x7F) == 0x40 && (var3.field1015 & 0x7F) == 0x40) {
						if (field232[var5][var6] == field494) {
							continue;
						}

						field232[var5][var6] = field494;
					}

					if (!var3.field853.field1396) {
						var4 += Integer.MIN_VALUE;
					}

					field351.method498(var3.field1016, var3.field1015, var3.field1050, (var3.field1007 - 1) * 64 + 60, var3, field545, method80(field545, var3.field1014, var3.field1015), var3.field1014, var4);
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)Z")
	public final boolean method135(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field206[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 696) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method136(byte[] arg0, boolean arg1) {
		if (field209) {
			signlink.midifade = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method137() {
		while (true) {
			NCRHUMXM var1 = field225.method243();
			if (var1 == null) {
				return;
			}

			if (var1.field975 == 0) {
				CADBNSXE.method9(var1.field976, var1.field979);

				if ((field225.method234(var1.field976) & 0x62) != 0) {
					field438 = true;

					if (field525 != -1 || field553 != -1) {
						field457 = true;
					}
				}
			}

			if (var1.field975 == 1 && var1.field979 != null) {
				DFGNFGZH.method212(var1.field979);
			}

			if (var1.field975 == 2 && field160 == var1.field976 && var1.field979 != null) {
				method136(var1.field979, field161);
			}

			if (var1.field975 == 3 && field493 == 1) {
				for (int var2 = 0; var2 < field329.length; var2++) {
					if (field452[var2] == var1.field976) {
						field329[var2] = var1.field979;

						if (var1.field979 == null) {
							field452[var2] = -1;
						}

						break;
					}

					if (field453[var2] == var1.field976) {
						field554[var2] = var1.field979;

						if (var1.field979 == null) {
							field453[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field975 == 93 && field225.method228(var1.field976)) {
				CJZJWICI.method51(field225, new MLYYHULT(var1.field979));
			}
		}
	}

	@ObfuscatedName("client.a(BLVWKJSKWX;III)V")
	public final void method138(VWKJSKWX arg0, int arg1, int arg2, int arg3) {
		if (field526 < 400) {
			if (arg0.field1400 != null) {
				arg0 = arg0.method570();
			}

			if (arg0 != null && arg0.field1396) {
				String var5 = arg0.field1391;
				if (arg0.field1411 != 0) {
					var5 = var5 + method118(arg0.field1411, field447.field101) + " (level-" + arg0.field1411 + ")";
				}

				if (field360 == 1) {
					field546[field526] = "Use " + field364 + " with @yel@" + var5;
					field206[field526] = 646;
					field207[field526] = arg3;
					field204[field526] = arg2;
					field205[field526] = arg1;
					field526++;
				} else if (field385 != 1) {
					if (arg0.field1406 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.field1406[var6] != null && !arg0.field1406[var6].equalsIgnoreCase("attack")) {
								field546[field526] = arg0.field1406[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field206[field526] = 447;
								}

								if (var6 == 1) {
									field206[field526] = 24;
								}

								if (var6 == 2) {
									field206[field526] = 851;
								}

								if (var6 == 3) {
									field206[field526] = 515;
								}

								if (var6 == 4) {
									field206[field526] = 983;
								}

								field207[field526] = arg3;
								field204[field526] = arg2;
								field205[field526] = arg1;
								field526++;
							}
						}
					}

					if (arg0.field1406 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg0.field1406[var7] != null && arg0.field1406[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg0.field1411 > field447.field101) {
									var8 = 2000;
								}

								field546[field526] = arg0.field1406[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field206[field526] = var8 + 447;
								}

								if (var7 == 1) {
									field206[field526] = var8 + 24;
								}

								if (var7 == 2) {
									field206[field526] = var8 + 851;
								}

								if (var7 == 3) {
									field206[field526] = var8 + 515;
								}

								if (var7 == 4) {
									field206[field526] = var8 + 983;
								}

								field207[field526] = arg3;
								field204[field526] = arg2;
								field205[field526] = arg1;
								field526++;
							}
						}
					}

					field546[field526] = "Examine @yel@" + var5;
					field206[field526] = 1335;
					field207[field526] = arg3;
					field204[field526] = arg2;
					field205[field526] = arg1;
					field526++;
				} else if ((field387 & 0x2) == 2) {
					field546[field526] = field388 + " @yel@" + var5;
					field206[field526] = 403;
					field207[field526] = arg3;
					field204[field526] = arg2;
					field205[field526] = arg1;
					field526++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = CADBNSXE.field79[var7];
			int var13 = CADBNSXE.field80[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = CADBNSXE.field79[var8];
			int var16 = CADBNSXE.field80[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field555 = arg1 - var9;
		field556 = arg2 - var10;
		field557 = arg4 - var11;
		field558 = arg5;
		field559 = arg0;
	}

	@ObfuscatedName("client.a(ILMLYYHULT;Z)V")
	public final void method140(int arg0, MLYYHULT arg1) {
		field309 = 0;
		field394 = 0;
		method194(arg0, arg1);
		method210(arg0, arg1);
		method161(arg1, arg0);

		for (int var3 = 0; var3 < field309; var3++) {
			int var4 = field310[var3];
			if (field449 != field236[var4].field1028) {
				field236[var4].field853 = null;
				field236[var4] = null;
			}
		}

		if (arg1.field963 != arg0) {
			signlink.reporterror(field473 + " size mismatch in getnpcpos - pos:" + arg1.field963 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field237; var5++) {
			if (field236[field238[var5]] == null) {
				signlink.reporterror(field473 + " null entry in npc list - pos:" + var5 + " size:" + field237);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(LHWEMRKQZ;IIIIZII)V")
	public final void method141(HWEMRKQZ arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0.field793 == 0 && arg0.field811 != null && !arg0.field797 && (arg4 >= arg3 && arg1 >= arg6 && arg4 <= arg0.field826 + arg3 && arg1 <= arg0.field813 + arg6)) {
			int var8 = arg0.field811.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg0.field829[var9] + arg3;
				int var11 = arg0.field806[var9] + arg6 - arg5;
				HWEMRKQZ var12 = HWEMRKQZ.method256(arg0.field811[var9]);
				var10 += var12.field789;
				var11 += var12.field844;
				if ((var12.field786 >= 0 || var12.field825 != 0) && arg4 >= var10 && arg1 >= var11 && arg4 < var12.field826 + var10 && arg1 < var12.field813 + var11) {
					if (var12.field786 >= 0) {
						field324 = var12.field786;
					} else {
						field324 = var12.field805;
					}
				}

				if (var12.field793 == 8 && arg4 >= var10 && arg1 >= var11 && arg4 < var12.field826 + var10 && arg1 < var12.field813 + var11) {
					field458 = var12.field805;
				}

				if (var12.field793 == 0) {
					method141(var12, arg1, arg2, var10, arg4, var12.field827, var11);

					if (var12.field792 > var12.field813) {
						method145(var12.field792, var11, var12.field826 + var10, arg4, arg2, var12, arg1, var12.field813);
					}
				} else {
					if (var12.field798 == 1 && arg4 >= var10 && arg1 >= var11 && arg4 < var12.field826 + var10 && arg1 < var12.field813 + var11) {
						boolean var13 = false;
						if (var12.field841 != 0) {
							var13 = method109(var12);
						}

						if (!var13) {
							field546[field526] = var12.field780;
							field206[field526] = 426;
							field205[field526] = var12.field805;
							field526++;
						}
					}

					if (var12.field798 == 2 && field385 == 0 && arg4 >= var10 && arg1 >= var11 && arg4 < var12.field826 + var10 && arg1 < var12.field813 + var11) {
						String var14 = var12.field833;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field546[field526] = var14 + " @gre@" + var12.field817;
						field206[field526] = 582;
						field205[field526] = var12.field805;
						field526++;
					}

					if (var12.field798 == 3 && arg4 >= var10 && arg1 >= var11 && arg4 < var12.field826 + var10 && arg1 < var12.field813 + var11) {
						field546[field526] = "Close";

						if (arg2 == 3) {
							field206[field526] = 482;
						} else {
							field206[field526] = 208;
						}

						field205[field526] = var12.field805;
						field526++;
					}

					if (var12.field798 == 4 && arg4 >= var10 && arg1 >= var11 && arg4 < var12.field826 + var10 && arg1 < var12.field813 + var11) {
						field546[field526] = var12.field780;
						field206[field526] = 790;
						field205[field526] = var12.field805;
						field526++;
					}

					if (var12.field798 == 5 && arg4 >= var10 && arg1 >= var11 && arg4 < var12.field826 + var10 && arg1 < var12.field813 + var11) {
						field546[field526] = var12.field780;
						field206[field526] = 951;
						field205[field526] = var12.field805;
						field526++;
					}

					if (var12.field798 == 6 && !field397 && arg4 >= var10 && arg1 >= var11 && arg4 < var12.field826 + var10 && arg1 < var12.field813 + var11) {
						field546[field526] = var12.field780;
						field206[field526] = 405;
						field205[field526] = var12.field805;
						field526++;
					}

					if (var12.field793 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field813; var16++) {
							for (int var17 = 0; var17 < var12.field826; var17++) {
								int var18 = (var12.field832 + 32) * var17 + var10;
								int var19 = (var12.field845 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field820[var15];
									var19 += var12.field838[var15];
								}

								if (arg4 >= var18 && arg1 >= var19 && arg4 < var18 + 32 && arg1 < var19 + 32) {
									field181 = var15;
									field182 = var12.field805;

									if (var12.field796[var15] > 0) {
										PICYKCUA var20 = PICYKCUA.method418(var12.field796[var15] - 1);
										if (field360 == 1 && var12.field821) {
											if (field362 != var12.field805 || field361 != var15) {
												field546[field526] = "Use " + field364 + " with @lre@" + var20.field1127;
												field206[field526] = 395;
												field207[field526] = var20.field1106;
												field204[field526] = var15;
												field205[field526] = var12.field805;
												field526++;
											}
										} else if (field385 != 1 || !var12.field821) {
											if (var12.field821) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1104 != null && var20.field1104[var21] != null) {
														field546[field526] = var20.field1104[var21] + " @lre@" + var20.field1127;

														if (var21 == 3) {
															field206[field526] = 1;
														}

														if (var21 == 4) {
															field206[field526] = 530;
														}

														field207[field526] = var20.field1106;
														field204[field526] = var15;
														field205[field526] = var12.field805;
														field526++;
													} else if (var21 == 4) {
														field546[field526] = "Drop @lre@" + var20.field1127;
														field206[field526] = 530;
														field207[field526] = var20.field1106;
														field204[field526] = var15;
														field205[field526] = var12.field805;
														field526++;
													}
												}
											}

											if (var12.field809) {
												field546[field526] = "Use @lre@" + var20.field1127;
												field206[field526] = 963;
												field207[field526] = var20.field1106;
												field204[field526] = var15;
												field205[field526] = var12.field805;
												field526++;
											}

											if (var12.field821 && var20.field1104 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1104[var22] != null) {
														field546[field526] = var20.field1104[var22] + " @lre@" + var20.field1127;

														if (var22 == 0) {
															field206[field526] = 181;
														}

														if (var22 == 1) {
															field206[field526] = 946;
														}

														if (var22 == 2) {
															field206[field526] = 152;
														}

														field207[field526] = var20.field1106;
														field204[field526] = var15;
														field205[field526] = var12.field805;
														field526++;
													}
												}
											}

											if (var12.field779 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field779[var23] != null) {
														field546[field526] = var12.field779[var23] + " @lre@" + var20.field1127;

														if (var23 == 0) {
															field206[field526] = 391;
														}

														if (var23 == 1) {
															field206[field526] = 377;
														}

														if (var23 == 2) {
															field206[field526] = 277;
														}

														if (var23 == 3) {
															field206[field526] = 281;
														}

														if (var23 == 4) {
															field206[field526] = 485;
														}

														field207[field526] = var20.field1106;
														field204[field526] = var15;
														field205[field526] = var12.field805;
														field526++;
													}
												}
											}

											field546[field526] = "Examine @lre@" + var20.field1127;
											field206[field526] = 1870;
											field207[field526] = var20.field1106;
											field204[field526] = var15;
											field205[field526] = var12.field805;
											field526++;
										} else if ((field387 & 0x10) == 0x10) {
											field546[field526] = field388 + " @lre@" + var20.field1127;
											field206[field526] = 789;
											field207[field526] = var20.field1106;
											field204[field526] = var15;
											field205[field526] = var12.field805;
											field526++;
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

	@ObfuscatedName("client.a(ILjava/lang/String;Z)V")
	public final void method142(int arg0, String arg1) {
		field552 = arg0;
		field335 = arg1;
		method92();

		if (field159 == null) {
			super.method142(arg0, arg1);
		} else {
			field530.method578();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field306.method454(0xFFFFFF, var4 / 2 - var5 - 26, var3 / 2, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			UKUXLUWP.method547(var6, 34, var3 / 2 - 152, 0x8C1111, 304);
			UKUXLUWP.method547(var6 + 1, 32, var3 / 2 - 151, 0, 302);
			UKUXLUWP.method546(0x8C1111, var3 / 2 - 150, var6 + 2, arg0 * 3, 30);
			UKUXLUWP.method546(0, arg0 * 3 + var3 / 2 - 150, var6 + 2, 300 - arg0 * 3, 30);
			field306.method454(0xFFFFFF, var4 / 2 + 5 - var5, var3 / 2, arg1);
			field530.method579(171, field642, 202);

			if (field402) {
				field402 = false;

				if (!field248) {
					field531.method579(0, field642, 0);
					field532.method579(0, field642, 637);
				}

				field528.method579(0, field642, 128);
				field529.method579(371, field642, 202);
				field533.method579(265, field642, 0);
				field534.method579(265, field642, 562);
				field535.method579(171, field642, 128);
				field536.method579(171, field642, 562);
			}
		}
	}

	@ObfuscatedName("client.a(IIZLSWNASVGQ;)V")
	public final void method143(int arg0, int arg1, SWNASVGQ arg2) {
		int var4 = field293 + field189 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = CADBNSXE.field79[var4];
			int var7 = CADBNSXE.field80[var4];
			var6 = var6 * 256 / (field185 + 256);
			var7 = var7 * 256 / (field185 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method480(83 - var9 - arg2.field1251 / 2 - 4, var8 + 94 - arg2.field1250 / 2 + 4, field251);
			} else {
				arg2.method474(var8 + 94 + 4 - arg2.field1250 / 2, 83 - var9 - arg2.field1251 / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIILCHKMTWJC;I)V")
	public final void method144(int arg0, int arg1, CHKMTWJC arg2, int arg3) {
		if (field447 != arg2 && field526 < 400) {
			String var5;
			if (arg2.field89 == 0) {
				var5 = arg2.field99 + method118(arg2.field101, field447.field101) + " (level-" + arg2.field101 + ")";
			} else {
				var5 = arg2.field99 + " (skill-" + arg2.field89 + ")";
			}

			if (field360 == 1) {
				field546[field526] = "Use " + field364 + " with @whi@" + var5;
				field206[field526] = 703;
				field207[field526] = arg1;
				field204[field526] = arg3;
				field205[field526] = arg0;
				field526++;
			} else if (field385 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field349[var6] != null) {
						field546[field526] = field349[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field349[var6].equalsIgnoreCase("attack")) {
							if (arg2.field101 > field447.field101) {
								var7 = 2000;
							}

							if (field447.field98 != 0 && arg2.field98 != 0) {
								if (field447.field98 == arg2.field98) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field350[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field206[field526] = var7 + 883;
						}

						if (var6 == 1) {
							field206[field526] = var7 + 145;
						}

						if (var6 == 2) {
							field206[field526] = var7 + 359;
						}

						if (var6 == 3) {
							field206[field526] = var7 + 896;
						}

						if (var6 == 4) {
							field206[field526] = var7 + 233;
						}

						field207[field526] = arg1;
						field204[field526] = arg3;
						field205[field526] = arg0;
						field526++;
					}
				}
			} else if ((field387 & 0x8) == 8) {
				field546[field526] = field388 + " @whi@" + var5;
				field206[field526] = 621;
				field207[field526] = arg1;
				field204[field526] = arg3;
				field205[field526] = arg0;
				field526++;
			}

			for (int var8 = 0; var8 < field526; var8++) {
				if (field206[var8] == 16) {
					field546[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIILHWEMRKQZ;III)V")
	public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, HWEMRKQZ arg5, int arg6, int arg7) {
		if (field224) {
			field216 = 32;
		} else {
			field216 = 0;
		}

		field224 = false;
		if (arg3 >= arg2 && arg3 < arg2 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
			arg5.field827 -= field459 * 4;

			if (arg4 == 1) {
				field438 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field457 = true;
			}
		} else if (arg3 >= arg2 && arg3 < arg2 + 16 && arg6 >= arg1 + arg7 - 16 && arg6 < arg1 + arg7) {
			arg5.field827 += field459 * 4;

			if (arg4 == 1) {
				field438 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field457 = true;
			}
		} else if (arg3 >= arg2 - field216 && arg3 < arg2 + field216 + 16 && arg6 >= arg1 + 16 && arg6 < arg1 + arg7 - 16 && field459 > 0) {
			int var9 = (arg7 - 32) * arg7 / arg0;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg1 - var9 / 2 - 16;
			int var11 = arg7 - var9 - 32;
			arg5.field827 = (arg0 - arg7) * var10 / var11;

			if (arg4 == 1) {
				field438 = true;
			}

			if (arg4 == 2 || arg4 == 3) {
				field457 = true;
			}

			field224 = true;
		}
	}

	@ObfuscatedName("client.c(IILMLYYHULT;)V")
	public final void method146(int arg0, MLYYHULT arg1) {
		while (arg1.field964 + 10 < arg0 * 8) {
			int var3 = arg1.method307(11);
			if (var3 == 2047) {
				break;
			}

			if (field391[var3] == null) {
				field391[var3] = new CHKMTWJC();
				if (field396[var3] != null) {
					field391[var3].method42(field396[var3]);
				}
			}

			field393[field392++] = var3;
			CHKMTWJC var4 = field391[var3];
			var4.field1028 = field449;
			int var5 = arg1.method307(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method307(1);
			if (var6 == 1) {
				field395[field394++] = var3;
			}

			int var7 = arg1.method307(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method307(1);
			var4.method352(field447.field1003[0] + var7, field447.field1004[0] + var5, var8 == 1);
		}

		arg1.method308();
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method147() {
		int var1 = field468;
		int var2 = field469;
		int var3 = field470;
		int var4 = field471;
		int var5 = 0x5D5447;
		UKUXLUWP.method546(var5, var1, var2, var3, var4);
		UKUXLUWP.method546(0, var1 + 1, var2 + 1, var3 - 2, 16);
		UKUXLUWP.method547(var2 + 18, var4 - 19, var1 + 1, 0, var3 - 2);
		field306.method458(var5, var1 + 3, var2 + 14, "Choose Option");
		int var6 = field650;
		int var7 = field651;
		if (field467 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field467 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field467 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field526; var8++) {
			int var9 = (field526 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field306.method462(var1 + 3, var10, true, field546[var8], var9);
		}
	}

	public final void init() {
		field316 = Integer.parseInt(getParameter("nodeid"));
		field317 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method164();
		} else {
			method130();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field318 = false;
		} else {
			field318 = true;
		}

		method220(765, 503);
	}

	@ObfuscatedName("client.a(BIIILHWEMRKQZ;)V")
	public final void method148(int arg0, int arg1, int arg2, HWEMRKQZ arg3) {
		if (arg3.field793 == 0 && arg3.field811 != null && (!arg3.field797 || field156 == arg3.field805 || field146 == arg3.field805 || field520 == arg3.field805)) {
			int var5 = UKUXLUWP.field1350;
			int var6 = UKUXLUWP.field1348;
			int var7 = UKUXLUWP.field1351;
			int var8 = UKUXLUWP.field1349;
			UKUXLUWP.method543(arg0, arg1, arg3.field826 + arg0, arg3.field813 + arg1);
			int var9 = arg3.field811.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg3.field829[var10] + arg0;
				int var12 = arg3.field806[var10] + arg1 - arg2;
				HWEMRKQZ var13 = HWEMRKQZ.method256(arg3.field811[var10]);
				var11 += var13.field789;
				var12 += var13.field844;

				if (var13.field841 > 0) {
					method111(var13);
				}

				if (var13.field793 == 0) {
					if (var13.field827 > var13.field792 - var13.field813) {
						var13.field827 = var13.field792 - var13.field813;
					}

					if (var13.field827 < 0) {
						var13.field827 = 0;
					}

					method148(var11, var12, var13.field827, var13);

					if (var13.field792 > var13.field813) {
						method81(var12, var13.field826 + var11, var13.field813, var13.field792, var13.field827);
					}
				} else if (var13.field793 != 1) {
					if (var13.field793 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field813; var15++) {
							for (int var16 = 0; var16 < var13.field826; var16++) {
								int var17 = (var13.field832 + 32) * var16 + var11;
								int var18 = (var13.field845 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field820[var14];
									var18 += var13.field838[var14];
								}

								if (var13.field796[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field796[var14] - 1;
									if (var17 > UKUXLUWP.field1350 - 32 && var17 < UKUXLUWP.field1351 && var18 > UKUXLUWP.field1348 - 32 && var18 < UKUXLUWP.field1349 || field196 != 0 && field195 == var14) {
										int var22 = 0;
										if (field360 == 1 && field361 == var14 && field362 == var13.field805) {
											var22 = 0xFFFFFF;
										}

										SWNASVGQ var23 = PICYKCUA.method412(var13.field830[var14], var22, var21);
										if (var23 != null) {
											if (field196 != 0 && field195 == var14 && field194 == var13.field805) {
												var19 = field650 - field197;
												var20 = field651 - field198;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field548 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method476(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < UKUXLUWP.field1348 && arg3.field827 > 0) {
													int var24 = (UKUXLUWP.field1348 - var18 - var20) * field246 / 3;
													if (var24 > field246 * 10) {
														var24 = field246 * 10;
													}

													if (var24 > arg3.field827) {
														var24 = arg3.field827;
													}

													arg3.field827 -= var24;
													field198 += var24;
												}

												if (var18 + var20 + 32 > UKUXLUWP.field1349 && arg3.field827 < arg3.field792 - arg3.field813) {
													int var25 = (var18 + var20 + 32 - UKUXLUWP.field1349) * field246 / 3;
													if (var25 > field246 * 10) {
														var25 = field246 * 10;
													}

													if (var25 > arg3.field792 - arg3.field813 - arg3.field827) {
														var25 = arg3.field792 - arg3.field813 - arg3.field827;
													}

													arg3.field827 += var25;
													field198 -= var25;
												}
											} else if (field465 != 0 && field464 == var14 && field463 == var13.field805) {
												var23.method476(var17, var18, 128);
											} else {
												var23.method474(var17, var18);
											}

											if (var23.field1250 == 33 || var13.field830[var14] != 1) {
												int var26 = var13.field830[var14];
												field304.method458(0, var17 + var19 + 1, var18 + 10 + var20, method114(var26));
												field304.method458(0xFFFF00, var17 + var19, var18 + 9 + var20, method114(var26));
											}
										}
									}
								} else if (var13.field849 != null && var14 < 20) {
									SWNASVGQ var27 = var13.field849[var14];
									if (var27 != null) {
										var27.method474(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.field793 == 3) {
						boolean var28 = false;
						if (field520 == var13.field805 || field146 == var13.field805 || field156 == var13.field805) {
							var28 = true;
						}

						int var29;
						if (method73(var13)) {
							var29 = var13.field788;
							if (var28 && var13.field831 != 0) {
								var29 = var13.field831;
							}
						} else {
							var29 = var13.field842;
							if (var28 && var13.field825 != 0) {
								var29 = var13.field825;
							}
						}

						if (var13.field787 == 0) {
							if (var13.field790) {
								UKUXLUWP.method546(var29, var11, var12, var13.field826, var13.field813);
							} else {
								UKUXLUWP.method547(var12, var13.field813, var11, var29, var13.field826);
							}
						} else if (var13.field790) {
							UKUXLUWP.method545(var11, var12, var29, 256 - (var13.field787 & 0xFF), var13.field813, var13.field826);
						} else {
							UKUXLUWP.method548(var12, var13.field826, var11, 256 - (var13.field787 & 0xFF), var13.field813, var29);
						}
					} else if (var13.field793 == 4) {
						SSVSGKGT var30 = var13.field802;
						String var31 = var13.field819;
						boolean var32 = false;
						if (field520 == var13.field805 || field146 == var13.field805 || field156 == var13.field805) {
							var32 = true;
						}

						int var33;
						if (method73(var13)) {
							var33 = var13.field788;
							if (var32 && var13.field831 != 0) {
								var33 = var13.field831;
							}

							if (var13.field804.length() > 0) {
								var31 = var13.field804;
							}
						} else {
							var33 = var13.field842;
							if (var32 && var13.field825 != 0) {
								var33 = var13.field825;
							}
						}

						if (var13.field798 == 6 && field397) {
							var31 = "Please wait...";
							var33 = var13.field842;
						}

						if (UKUXLUWP.field1346 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1242 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method200(method127(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method200(method127(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method200(method127(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method200(method127(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method200(method127(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field846) {
								var30.method455(var41, var34, var13.field810, var13.field826 / 2 + var11, var33);
							} else {
								var30.method462(var11, var33, var13.field810, var41, var34);
							}

							var34 += var30.field1242;
						}
					} else if (var13.field793 == 5) {
						SWNASVGQ var42;
						if (method73(var13)) {
							var42 = var13.field816;
						} else {
							var42 = var13.field777;
						}

						if (var42 != null) {
							var42.method474(var11, var12);
						}
					} else if (var13.field793 == 6) {
						int var43 = PNDCOEKM.field1135;
						int var44 = PNDCOEKM.field1136;
						PNDCOEKM.field1135 = var13.field826 / 2 + var11;
						PNDCOEKM.field1136 = var13.field813 / 2 + var12;
						int var45 = PNDCOEKM.field1139[var13.field782] * var13.field781 >> 16;
						int var46 = PNDCOEKM.field1140[var13.field782] * var13.field781 >> 16;
						boolean var47 = method73(var13);
						int var48;
						if (var47) {
							var48 = var13.field795;
						} else {
							var48 = var13.field794;
						}

						CADBNSXE var49;
						if (var48 == -1) {
							var49 = var13.method252(-1, -1, var47);
						} else {
							UVDKTGZK var50 = UVDKTGZK.field1357[var48];
							var49 = var13.method252(var50.field1360[var13.field840], var50.field1359[var13.field840], var47);
						}

						if (var49 != null) {
							var49.method32(0, var13.field783, 0, var13.field782, 0, var45, var46);
						}

						PNDCOEKM.field1135 = var43;
						PNDCOEKM.field1136 = var44;
					} else {
						if (var13.field793 == 7) {
							SSVSGKGT var51 = var13.field802;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field813; var53++) {
								for (int var54 = 0; var54 < var13.field826; var54++) {
									if (var13.field796[var52] > 0) {
										PICYKCUA var55 = PICYKCUA.method418(var13.field796[var52] - 1);
										String var56 = var55.field1127;
										if (var55.field1112 || var13.field830[var52] != 1) {
											var56 = var56 + " x" + method117(var13.field830[var52]);
										}

										int var57 = (var13.field832 + 115) * var54 + var11;
										int var58 = (var13.field845 + 12) * var53 + var12;
										if (var13.field846) {
											var51.method455(var56, var58, var13.field810, var13.field826 / 2 + var57, var13.field842);
										} else {
											var51.method462(var57, var13.field842, var13.field810, var56, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field793 == 8 && (field245 == var13.field805 || field174 == var13.field805 || field243 == var13.field805) && field544 == 100) {
							int var59 = 0;
							int var60 = 0;
							SSVSGKGT var61 = field305;
							String var62 = var13.field819;
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

								int var65 = var61.method456(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1242 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field826 + var11 - var59 - 5;
							int var67 = var13.field813 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg3.field826 + arg0) {
								var66 = arg3.field826 + arg0 - var59;
							}

							UKUXLUWP.method546(0xFFFFA0, var66, var67, var59, var60);
							UKUXLUWP.method547(var67, var60, var66, 0, var59);
							String var68 = var13.field819;
							int var69 = var61.field1242 + var67 + 2;
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

								var61.method462(var66 + 3, 0, false, var71, var69);
								var69 += var61.field1242 + 1;
							}
						}
					}
				}
			}

			UKUXLUWP.method543(var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method149() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field482[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field482[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field483[var10] = (field482[var10 - 1] + field482[var10 + 1] + field482[var10 - 128] + field482[var10 + 128]) / 4;
			}
		}

		field574 += 128;
		if (field574 > field298.length) {
			field574 -= field298.length;
			int var11 = (int) (Math.random() * 12.0D);
			method77(field240[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field483[var14 + 128] - field298[field574 + var14 & field298.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field482[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field436[var16] = field436[var16 + 1];
		}

		field436[var1 - 1] = (int) (Math.sin(field449 / 14.0D) * 16.0D + Math.sin(field449 / 15.0D) * 14.0D + Math.sin(field449 / 16.0D) * 12.0D);

		if (field566 > 0) {
			field566 -= 4;
		}

		if (field567 > 0) {
			field567 -= 4;
		}

		if (field566 == 0 && field567 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field566 = 1024;
			}

			if (var17 == 1) {
				field567 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method150() {
		while (true) {
			int var1 = method223();
			if (var1 == -1) {
				return;
			}

			if (field183 != -1 && field456 == field183) {
				if (var1 == 8 && field537.length() > 0) {
					field537 = field537.substring(0, field537.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field537.length() < 12) {
					field537 = field537 + (char) var1;
				}
			} else if (field378) {
				if (var1 >= 32 && var1 <= 122 && field400.length() < 80) {
					field400 = field400 + (char) var1;
					field457 = true;
				}

				if (var1 == 8 && field400.length() > 0) {
					field400 = field400.substring(0, field400.length() - 1);
					field457 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field378 = false;
					field457 = true;

					if (field313 == 1) {
						long var2 = XBRLLWQI.method581(field400);
						method154(var2);
					}

					if (field313 == 2 && field549 > 0) {
						long var4 = XBRLLWQI.method581(field400);
						method102(var4);
					}

					if (field313 == 3 && field400.length() > 0) {
						field367.method285(168);
						field367.method286(0);
						int var6 = field367.field963;
						field367.method292(field145);
						GVESONCD.method246(field400, field367);
						field367.method295(field367.field963 - var6);
						field400 = GVESONCD.method247(field400);
						field400 = PBBEXDRS.method378(field400);
						method69(6, XBRLLWQI.method585(XBRLLWQI.method582(field145)), field400);

						if (field244 == 2) {
							field244 = 1;
							field353 = true;
							field367.method285(124);
							field367.method286(field435);
							field367.method286(field244);
							field367.method286(field572);
						}
					}

					if (field313 == 4 && field178 < 100) {
						long var7 = XBRLLWQI.method581(field400);
						method167(var7);
					}

					if (field313 == 5 && field178 > 0) {
						long var9 = XBRLLWQI.method581(field400);
						method105(var9);
					}
				}
			} else if (field314 == 1) {
				if (var1 >= 48 && var1 <= 57 && field343.length() < 10) {
					field343 = field343 + (char) var1;
					field457 = true;
				}

				if (var1 == 8 && field343.length() > 0) {
					field343 = field343.substring(0, field343.length() - 1);
					field457 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field343.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field343);
						} catch (Exception var21) {
						}

						field367.method285(86);
						field367.method290(var11);
					}

					field314 = 0;
					field457 = true;
				}
			} else if (field314 == 2) {
				if (var1 >= 32 && var1 <= 122 && field343.length() < 12) {
					field343 = field343 + (char) var1;
					field457 = true;
				}

				if (var1 == 8 && field343.length() > 0) {
					field343 = field343.substring(0, field343.length() - 1);
					field457 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field343.length() > 0) {
						field367.method285(200);
						field367.method292(XBRLLWQI.method581(field343));
					}

					field314 = 0;
					field457 = true;
				}
			} else if (field314 == 3) {
				if (var1 >= 32 && var1 <= 122 && field343.length() < 40) {
					field343 = field343 + (char) var1;
					field457 = true;
				}

				if (var1 == 8 && field343.length() > 0) {
					field343 = field343.substring(0, field343.length() - 1);
					field457 = true;
				}
			} else if (field525 == -1 && field330 == -1) {
				if (var1 >= 32 && var1 <= 122 && field551.length() < 80) {
					field551 = field551 + (char) var1;
					field457 = true;
				}

				if (var1 == 8 && field551.length() > 0) {
					field551 = field551.substring(0, field551.length() - 1);
					field457 = true;
				}

				if ((var1 == 13 || var1 == 10) && field551.length() > 0) {
					if (field503 == 2) {
						if (field551.equals("::clientdrop")) {
							method78();
						}

						if (field551.equals("::lag")) {
							method121();
						}

						if (field551.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field225.method239(2); var12++) {
								field225.method227(2, var12, (byte) 1);
							}
						}

						if (field551.equals("::fpson")) {
							field433 = true;
						}

						if (field551.equals("::fpsoff")) {
							field433 = false;
						}

						if (field551.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field498[var13].field1069[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field551.startsWith("::")) {
						field367.method285(230);
						field367.method286(field551.length() - 1);
						field367.method293(field551.substring(2));
					} else {
						String var16 = field551.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field551 = field551.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field551 = field551.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field551 = field551.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field551 = field551.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field551 = field551.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field551 = field551.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field551 = field551.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field551 = field551.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field551 = field551.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field551 = field551.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field551 = field551.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field551 = field551.substring(6);
						}

						String var18 = field551.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field551 = field551.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field551 = field551.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field551 = field551.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field551 = field551.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field551 = field551.substring(6);
						}

						field367.method285(169);
						field367.method286(0);
						int var20 = field367.field963;
						field235.field963 = 0;
						GVESONCD.method246(field551, field235);
						field367.method334(field235.field962, 0, field235.field963);
						field367.method314(var19);
						field367.method286(var17);
						field367.method295(field367.field963 - var20);
						field551 = GVESONCD.method247(field551);
						field551 = PBBEXDRS.method378(field551);
						field447.field1001 = field551;
						field447.field1013 = var17;
						field447.field1005 = var19;
						field447.field1037 = 150;

						if (field503 == 2) {
							method69(2, "@cr2@" + field447.field99, field447.field1001);
						} else if (field503 == 1) {
							method69(2, "@cr1@" + field447.field99, field447.field1001);
						} else {
							method69(2, field447.field99, field447.field1001);
						}

						if (field435 == 2) {
							field435 = 3;
							field353 = true;
							field367.method285(124);
							field367.method286(field435);
							field367.method286(field244);
							field367.method286(field572);
						}
					}

					field551 = "";
					field457 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method151() {
		if (field179 == 2) {
			method75((field220 - field227 << 7) + field223, (field219 - field226 << 7) + field222, field221 * 2);

			if (field338 > -1 && field449 % 20 < 10) {
				field273[0].method474(field338 - 12, field339 - 28);
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method152() {
		if (field319 && field493 == 2 && CJZJWICI.field130 != field545) {
			method177("Loading - please wait.", null);
			field493 = 1;
			field177 = System.currentTimeMillis();
		}

		if (field493 == 1) {
			int var1 = method153();
			if (var1 != 0 && System.currentTimeMillis() - field177 > 360000L) {
				signlink.reporterror(field473 + " glcfb " + field455 + "," + var1 + "," + field319 + "," + field286[0] + "," + field225.method225() + "," + field545 + "," + field157 + "," + field158);
				field177 = System.currentTimeMillis();
			}
		}

		if (field493 == 2 && field545 != field193) {
			field193 = field545;
			method165(field545);
		}
	}

	@ObfuscatedName("client.y(I)I")
	public final int method153() {
		for (int var1 = 0; var1 < field329.length; var1++) {
			if (field329[var1] == null && field452[var1] != -1) {
				return -1;
			}

			if (field554[var1] == null && field453[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field329.length; var3++) {
			byte[] var4 = field554[var3];
			if (var4 != null) {
				int var5 = (field451[var3] >> 8) * 64 - field226;
				int var6 = (field451[var3] & 0xFF) * 64 - field227;
				if (field289) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= CJZJWICI.method50(var4, var5, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field511) {
			return -4;
		} else {
			field493 = 2;
			CJZJWICI.field130 = field545;
			method94();
			field367.method285(210);
			return 0;
		}
	}

	@ObfuscatedName("client.b(BJ)V")
	public final void method154(long arg0) {
		if (arg0 != 0L) {
			if (field549 >= 100 && field454 != 1) {
				method69(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field549 >= 200) {
				method69(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = XBRLLWQI.method585(XBRLLWQI.method582(arg0));
				for (int var4 = 0; var4 < field549; var4++) {
					if (field460[var4] == arg0) {
						method69(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field178; var5++) {
					if (field497[var5] == arg0) {
						method69(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field447.field99)) {
					field359[field549] = var3;
					field460[field549] = arg0;
					field269[field549] = 0;
					field549++;
					field438 = true;
					field367.method285(167);
					field367.method292(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method155(int arg0) {
		HWEMRKQZ var2 = HWEMRKQZ.method256(arg0);
		for (int var3 = 0; var3 < var2.field811.length && var2.field811[var3] != -1; var3++) {
			HWEMRKQZ var4 = HWEMRKQZ.method256(var2.field811[var3]);
			if (var4.field793 == 1) {
				method155(var4.field805);
			}

			var4.field840 = 0;
			var4.field818 = 0;
		}
	}

	@ObfuscatedName("client.c(BI)V")
	public final void method156(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method157() {
		for (YBXLKULU var1 = (YBXLKULU) field162.method600(); var1 != null; var1 = (YBXLKULU) field162.method602()) {
			if (field545 != var1.field1472 || field449 > var1.field1484) {
				var1.method367();
			} else if (field449 >= var1.field1483) {
				if (var1.field1478 > 0) {
					JMUIRIHZ var2 = field236[var1.field1478 - 1];
					if (var2 != null && var2.field1014 >= 0 && var2.field1014 < 13312 && var2.field1015 >= 0 && var2.field1015 < 13312) {
						var1.method591(var2.field1015, field449, method80(var1.field1472, var2.field1014, var2.field1015) - var1.field1488, var2.field1014);
					}
				}

				if (var1.field1478 < 0) {
					int var3 = -var1.field1478 - 1;
					CHKMTWJC var4;
					if (field428 == var3) {
						var4 = field447;
					} else {
						var4 = field391[var3];
					}

					if (var4 != null && var4.field1014 >= 0 && var4.field1014 < 13312 && var4.field1015 >= 0 && var4.field1015 < 13312) {
						var1.method591(var4.field1015, field449, method80(var1.field1472, var4.field1014, var4.field1015) - var1.field1488, var4.field1014);
					}
				}

				var1.method590(field246);
				field351.method498(var1.field1474, (int) var1.field1469, false, 60, var1, field545, (int) var1.field1470, (int) var1.field1468, -1);
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method158(int arg0) {
		HWEMRKQZ.method257(arg0);
	}

	@ObfuscatedName("client.a(LMLLEEKZP;B)V")
	public final void method159(MLLEEKZP arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field954 == 0) {
			var2 = field351.method513(arg0.field953, arg0.field955, arg0.field956);
		}

		if (arg0.field954 == 1) {
			var2 = field351.method514(arg0.field955, arg0.field953, arg0.field956);
		}

		if (arg0.field954 == 2) {
			var2 = field351.method515(arg0.field953, arg0.field955, arg0.field956);
		}

		if (arg0.field954 == 3) {
			var2 = field351.method516(arg0.field953, arg0.field955, arg0.field956);
		}

		if (var2 != 0) {
			int var6 = field351.method517(arg0.field953, arg0.field955, arg0.field956, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field950 = var3;
		arg0.field952 = var4;
		arg0.field951 = var5;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method160() {
		if (field656 == 1) {
			if (field657 >= 539 && field657 <= 573 && field658 >= 169 && field658 < 205 && field527[0] != -1) {
				field438 = true;
				field208 = 0;
				field423 = true;
			}

			if (field657 >= 569 && field657 <= 599 && field658 >= 168 && field658 < 205 && field527[1] != -1) {
				field438 = true;
				field208 = 1;
				field423 = true;
			}

			if (field657 >= 597 && field657 <= 627 && field658 >= 168 && field658 < 205 && field527[2] != -1) {
				field438 = true;
				field208 = 2;
				field423 = true;
			}

			if (field657 >= 625 && field657 <= 669 && field658 >= 168 && field658 < 203 && field527[3] != -1) {
				field438 = true;
				field208 = 3;
				field423 = true;
			}

			if (field657 >= 666 && field657 <= 696 && field658 >= 168 && field658 < 205 && field527[4] != -1) {
				field438 = true;
				field208 = 4;
				field423 = true;
			}

			if (field657 >= 694 && field657 <= 724 && field658 >= 168 && field658 < 205 && field527[5] != -1) {
				field438 = true;
				field208 = 5;
				field423 = true;
			}

			if (field657 >= 722 && field657 <= 756 && field658 >= 169 && field658 < 205 && field527[6] != -1) {
				field438 = true;
				field208 = 6;
				field423 = true;
			}

			if (field657 >= 540 && field657 <= 574 && field658 >= 466 && field658 < 502 && field527[7] != -1) {
				field438 = true;
				field208 = 7;
				field423 = true;
			}

			if (field657 >= 572 && field657 <= 602 && field658 >= 466 && field658 < 503 && field527[8] != -1) {
				field438 = true;
				field208 = 8;
				field423 = true;
			}

			if (field657 >= 599 && field657 <= 629 && field658 >= 466 && field658 < 503 && field527[9] != -1) {
				field438 = true;
				field208 = 9;
				field423 = true;
			}

			if (field657 >= 627 && field657 <= 671 && field658 >= 467 && field658 < 502 && field527[10] != -1) {
				field438 = true;
				field208 = 10;
				field423 = true;
			}

			if (field657 >= 669 && field657 <= 699 && field658 >= 466 && field658 < 503 && field527[11] != -1) {
				field438 = true;
				field208 = 11;
				field423 = true;
			}

			if (field657 >= 696 && field657 <= 726 && field658 >= 466 && field658 < 503 && field527[12] != -1) {
				field438 = true;
				field208 = 12;
				field423 = true;
			}

			if (field657 >= 724 && field657 <= 758 && field658 >= 466 && field658 < 502 && field527[13] != -1) {
				field438 = true;
				field208 = 13;
				field423 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LMLYYHULT;IZ)V")
	public final void method161(MLYYHULT arg0, int arg1) {
		for (int var3 = 0; var3 < field394; var3++) {
			int var4 = field395[var3];
			JMUIRIHZ var5 = field236[var4];
			int var6 = arg0.method296();
			if ((var6 & 0x40) != 0) {
				var5.field1001 = arg0.method303();
				var5.field1037 = 100;
			}

			if ((var6 & 0x20) != 0) {
				var5.field1041 = arg0.method324();
				var5.field1042 = arg0.method298();
			}

			if ((var6 & 0x1) != 0) {
				int var7 = arg0.method316();
				int var8 = arg0.method316();
				var5.method349(var8, var7, field449);
				var5.field1008 = field449 + 300;
				var5.field1009 = arg0.method316();
				var5.field1010 = arg0.method315();
			}

			if ((var6 & 0x2) != 0) {
				int var9 = arg0.method316();
				int var10 = arg0.method315();
				var5.method349(var10, var9, field449);
				var5.field1008 = field449 + 300;
				var5.field1009 = arg0.method317();
				var5.field1010 = arg0.method296();
			}

			if ((var6 & 0x80) != 0) {
				var5.field996 = arg0.method325();
				int var11 = arg0.method332();
				var5.field1000 = var11 >> 16;
				var5.field999 = (var11 & 0xFFFF) + field449;
				var5.field997 = 0;
				var5.field998 = 0;

				if (var5.field999 > field449) {
					var5.field997 = -1;
				}

				if (var5.field996 == 0xFFFF) {
					var5.field996 = -1;
				}
			}

			if ((var6 & 0x10) != 0) {
				var5.field853 = VWKJSKWX.method574(arg0.method326());
				var5.field1007 = var5.field853.field1409;
				var5.field1002 = var5.field853.field1404;
				var5.field1021 = var5.field853.field1385;
				var5.field1022 = var5.field853.field1402;
				var5.field1023 = var5.field853.field1394;
				var5.field1024 = var5.field853.field1408;
				var5.field1011 = var5.field853.field1407;
			}

			if ((var6 & 0x4) != 0) {
				var5.field1026 = arg0.method325();
				if (var5.field1026 == 0xFFFF) {
					var5.field1026 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				int var12 = arg0.method324();
				if (var12 == 0xFFFF) {
					var12 = -1;
				}

				int var13 = arg0.method316();
				if (var5.field1044 == var12 && var12 != -1) {
					int var14 = UVDKTGZK.field1357[var12].field1371;
					if (var14 == 1) {
						var5.field1045 = 0;
						var5.field1046 = 0;
						var5.field1047 = var13;
						var5.field1048 = 0;
					}

					if (var14 == 2) {
						var5.field1048 = 0;
					}
				} else if (var12 == -1 || var5.field1044 == -1 || UVDKTGZK.field1357[var12].field1365 >= UVDKTGZK.field1357[var5.field1044].field1365) {
					var5.field1044 = var12;
					var5.field1045 = 0;
					var5.field1046 = 0;
					var5.field1047 = var13;
					var5.field1048 = 0;
					var5.field1006 = var5.field1029;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BIIILjava/lang/String;)LGWOEELWB;")
	public final GWOEELWB method162(String arg0, int arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field286[0] != null) {
				var6 = field286[0].method446(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field311.reset();
			field311.update(var6);
			int var8 = (int) field311.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new GWOEELWB(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method142(arg3, "Requesting " + arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method206(arg0 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				MLYYHULT var16 = new MLYYHULT(var15);
				var16.field963 = 3;
				int var17 = var16.method300() + 6;
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
						method142(arg3, "Loading " + arg4 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field286[0] != null) {
						field286[0].method447(arg2, var6, var6.length);
					}
				} catch (Exception var28) {
					field286[0] = null;
				}

				if (var6 != null) {
					field311.reset();
					field311.update(var6);
					int var23 = (int) field311.getValue();
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
						method142(arg3, "Game updated - please reload page");
						var25 = 10;
					} else {
						method142(arg3, var11 + " - Retrying in " + var25);
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

				field180 = !field180;
			}
		}

		return new GWOEELWB(var6);
	}

	@ObfuscatedName("client.a(LMLYYHULT;II)V")
	public final void method163(MLYYHULT arg0, int arg1) {
		int var3 = arg0.method307(8);
		if (var3 < field392) {
			for (int var4 = var3; var4 < field392; var4++) {
				field310[field309++] = field393[var4];
			}
		}

		if (var3 > field392) {
			signlink.reporterror(field473 + " Too many players");
			throw new RuntimeException("eek");
		}

		field392 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field393[var5];
			CHKMTWJC var7 = field391[var6];
			int var8 = arg0.method307(1);
			if (var8 == 0) {
				field393[field392++] = var6;
				var7.field1028 = field449;
			} else {
				int var9 = arg0.method307(2);
				if (var9 == 0) {
					field393[field392++] = var6;
					var7.field1028 = field449;
					field395[field394++] = var6;
				} else if (var9 == 1) {
					field393[field392++] = var6;
					var7.field1028 = field449;
					int var10 = arg0.method307(3);
					var7.method351(var10, false);
					int var11 = arg0.method307(1);
					if (var11 == 1) {
						field395[field394++] = var6;
					}
				} else if (var9 == 2) {
					field393[field392++] = var6;
					var7.field1028 = field449;
					int var12 = arg0.method307(3);
					var7.method351(var12, true);
					int var13 = arg0.method307(3);
					var7.method351(var13, true);
					int var14 = arg0.method307(1);
					if (var14 == 1) {
						field395[field394++] = var6;
					}
				} else if (var9 == 3) {
					field310[field309++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.z(I)V")
	public static final void method164() {
		TAWLWNCF.field1265 = true;
		PNDCOEKM.field1130 = true;
		field319 = true;
		CJZJWICI.field124 = true;
		LYSBQDHB.field893 = true;
	}

	@ObfuscatedName("client.g(II)V")
	public final void method165(int arg0) {
		int[] var2 = field444.field1245;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field287[arg0][var7][var5] & 0x18) == 0) {
					field351.method522(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field287[arg0 + 1][var7][var5] & 0x8) != 0) {
					field351.method522(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field444.method469();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field287[arg0][var11][var10] & 0x18) == 0) {
					method96(arg0, var11, var9, var8, var10);
				}

				if (arg0 < 3 && (field287[arg0 + 1][var11][var10] & 0x8) != 0) {
					method96(arg0 + 1, var11, var9, var8, var10);
				}
			}
		}

		if (field167 != null) {
			field167.method578();
			PNDCOEKM.field1141 = field570;
		}

		field517 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field351.method516(field545, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = LYSBQDHB.method282(var14).field886;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field498[field545].field1069;
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

						field434[field517] = field200[var15];
						field518[field517] = var16;
						field519[field517] = var17;
						field517++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method166() {
		for (int var1 = -1; var1 < field392; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field390;
			} else {
				var2 = field393[var1];
			}

			CHKMTWJC var3 = field391[var2];
			if (var3 != null && var3.field1037 > 0) {
				var3.field1037--;
				if (var3.field1037 == 0) {
					var3.field1001 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field237; var4++) {
			int var5 = field238[var4];
			JMUIRIHZ var6 = field236[var5];
			if (var6 != null && var6.field1037 > 0) {
				var6.field1037--;
				if (var6.field1037 == 0) {
					var6.field1001 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method167(long arg0) {
		if (arg0 != 0L) {
			if (field178 >= 100) {
				method69(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = XBRLLWQI.method585(XBRLLWQI.method582(arg0));
				for (int var4 = 0; var4 < field178; var4++) {
					if (field497[var4] == arg0) {
						method69(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field549; var5++) {
					if (field460[var5] == arg0) {
						method69(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field497[field178++] = arg0;
				field438 = true;
				field367.method285(71);
				field367.method292(arg0);
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method168() {
		field165.method578();
		PNDCOEKM.field1141 = field569;
		field250.method347(0, 0);

		if (field466 != -1) {
			method148(0, 0, 0, HWEMRKQZ.method256(field466));
		} else if (field527[field208] != -1) {
			method148(0, 0, 0, HWEMRKQZ.method256(field527[field208]));
		}

		if (field270 && field467 == 1) {
			method147();
		}

		field165.method579(205, field642, 553);
		field167.method578();
		PNDCOEKM.field1141 = field570;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method169() {
		if (field437 != 0) {
			int var1 = 0;
			if (field345 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field383[var2] != null) {
					int var3 = field381[var2];
					String var4 = field382[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field244 == 0 || field244 == 1 && method132(var4))) {
						int var8 = 329 - var1 * 13;
						if (field650 > 4 && field651 - 4 > var8 - 10 && field651 - 4 <= var8 + 3) {
							int var9 = field305.method456("From:  " + var4 + field383[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field650 < var9 + 4) {
								if (field503 >= 1) {
									field546[field526] = "Report abuse @whi@" + var4;
									field206[field526] = 2787;
									field526++;
								}

								field546[field526] = "Add ignore @whi@" + var4;
								field206[field526] = 2379;
								field526++;
								field546[field526] = "Add friend @whi@" + var4;
								field206[field526] = 2696;
								field526++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field244 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void method170() {
		field168.method578();
		PNDCOEKM.field1141 = field568;
		field252.method347(0, 0);

		if (field378) {
			field306.method454(0, 40, 239, field332);
			field306.method454(128, 60, 239, field400 + "*");
		} else if (field314 == 1) {
			field306.method454(0, 40, 239, "Enter amount:");
			field306.method454(128, 60, 239, field343 + "*");
		} else if (field314 == 2) {
			field306.method454(0, 40, 239, "Enter name:");
			field306.method454(128, 60, 239, field343 + "*");
		} else if (field314 == 3) {
			if (field373 != field343) {
				method192(field343);
				field373 = field343;
			}

			SSVSGKGT var1 = field305;
			UKUXLUWP.method543(0, 0, 463, 77);

			for (int var2 = 0; var2 < field374; var2++) {
				int var3 = var2 * 14 + 18 - field377;
				if (var3 > 0 && var3 < 110) {
					var1.method454(0, var3, 239, field375[var2]);
				}
			}

			UKUXLUWP.method542();

			if (field374 > 5) {
				method81(0, 463, 77, field374 * 14 + 7, field377);
			}

			if (field343.length() == 0) {
				field306.method454(255, 40, 239, "Enter object name");
			} else if (field374 == 0) {
				field306.method454(0, 40, 239, "No matching objects found, please shorten search");
			}

			var1.method454(0, 90, 239, field343 + "*");
			UKUXLUWP.method549(0, 77, 479, 0);
		} else if (field199 != null) {
			field306.method454(0, 40, 239, field199);
			field306.method454(128, 60, 239, "Click to continue");
		} else if (field525 != -1) {
			method148(0, 0, 0, HWEMRKQZ.method256(field525));
		} else if (field553 == -1) {
			SSVSGKGT var4 = field305;
			int var5 = 0;
			UKUXLUWP.method543(0, 0, 463, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field383[var6] != null) {
					int var7 = field381[var6];
					int var8 = field295 + 70 - var5 * 14;
					String var9 = field382[var6];
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
							var4.method458(0, 4, var8, field383[var6]);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field435 == 0 || field435 == 1 && method132(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field266[0].method347(var11, var8 - 12);
								var11 += 14;
							}

							if (var10 == 2) {
								field266[1].method347(var11, var8 - 12);
								var11 += 14;
							}

							var4.method458(0, var11, var8, var9 + ":");
							var11 += var4.method456(var9) + 8;
							var4.method458(255, var11, var8, field383[var6]);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field437 == 0 && (var7 == 7 || field244 == 0 || field244 == 1 && method132(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method458(0, var12, var8, "From");
							int var14 = var12 + var4.method456("From ");
							if (var10 == 1) {
								field266[0].method347(var14, var8 - 12);
								var14 += 14;
							}

							if (var10 == 2) {
								field266[1].method347(var14, var8 - 12);
								var14 += 14;
							}

							var4.method458(0, var14, var8, var9 + ":");
							var14 += var4.method456(var9) + 8;
							var4.method458(0x800000, var14, var8, field383[var6]);
						}

						var5++;
					}

					if (var7 == 4 && (field572 == 0 || field572 == 1 && method132(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method458(0x800080, 4, var8, var9 + " " + field383[var6]);
						}

						var5++;
					}

					if (var7 == 5 && field437 == 0 && field244 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method458(0x800000, 4, var8, field383[var6]);
						}

						var5++;
					}

					if (var7 == 6 && field437 == 0 && field244 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method458(0, 4, var8, "To " + var9 + ":");
							var4.method458(0x800000, var4.method456("To " + var9) + 12, var8, field383[var6]);
						}

						var5++;
					}

					if (var7 == 8 && (field572 == 0 || field572 == 1 && method132(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method458(0x7E3200, 4, var8, var9 + " " + field383[var6]);
						}

						var5++;
					}
				}
			}

			UKUXLUWP.method542();
			field231 = var5 * 14 + 7;
			if (field231 < 78) {
				field231 = 78;
			}

			method81(0, 463, 77, field231, field231 - field295 - 77);
			String var13;
			if (field447 == null || field447.field99 == null) {
				var13 = XBRLLWQI.method585(field473);
			} else {
				var13 = field447.field99;
			}

			var4.method458(0, 4, 90, var13 + ":");
			var4.method458(255, var4.method456(var13 + ": ") + 6, 90, field551 + "*");
			UKUXLUWP.method549(0, 77, 479, 0);
		} else {
			method148(0, 0, 0, HWEMRKQZ.method256(field553));
		}

		if (field270 && field467 == 2) {
			method147();
		}

		field168.method579(357, field642, 17);
		field167.method578();
		PNDCOEKM.field1141 = field570;
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method171(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method172() {
		int var1 = field306.method456("Choose Option");
		for (int var2 = 0; var2 < field526; var2++) {
			int var3 = field306.method456(field546[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field526 * 15 + 21;
		if (field657 > 4 && field658 > 4 && field657 < 516 && field658 < 338) {
			int var5 = field657 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field658 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field270 = true;
			field467 = 0;
			field468 = var5;
			field469 = var6;
			field470 = var1;
			field471 = field526 * 15 + 22;
		}

		if (field657 > 553 && field658 > 205 && field657 < 743 && field658 < 466) {
			int var7 = field657 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field658 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field270 = true;
			field467 = 1;
			field468 = var7;
			field469 = var8;
			field470 = var1;
			field471 = field526 * 15 + 22;
		}

		if (field657 > 17 && field658 > 357 && field657 < 496 && field658 < 453) {
			int var9 = field657 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field658 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field270 = true;
			field467 = 2;
			field468 = var9;
			field469 = var10;
			field470 = var1;
			field471 = field526 * 15 + 22;
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method173() {
		if (field196 == 0) {
			int var1 = field656;
			if (field385 == 1 && field657 >= 516 && field658 >= 160 && field657 <= 765 && field658 <= 205) {
				var1 = 0;
			}

			if (field270) {
				if (var1 != 1) {
					int var2 = field650;
					int var3 = field651;
					if (field467 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field467 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field467 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field468 - 10 || var2 > field470 + field468 + 10 || var3 < field469 - 10 || var3 > field471 + field469 + 10) {
						field270 = false;

						if (field467 == 1) {
							field438 = true;
						}

						if (field467 == 2) {
							field457 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field468;
					int var5 = field469;
					int var6 = field470;
					int var7 = field657;
					int var8 = field658;
					if (field467 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field467 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field467 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field526; var10++) {
						int var11 = (field526 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method124(var9);
					}

					field270 = false;

					if (field467 == 1) {
						field438 = true;
					}

					if (field467 == 2) {
						field457 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field526 > 0) {
					int var12 = field206[field526 - 1];
					if (var12 == 391 || var12 == 377 || var12 == 277 || var12 == 281 || var12 == 485 || var12 == 181 || var12 == 946 || var12 == 152 || var12 == 1 || var12 == 530 || var12 == 963 || var12 == 1870) {
						int var13 = field204[field526 - 1];
						int var14 = field205[field526 - 1];
						HWEMRKQZ var15 = HWEMRKQZ.method256(var14);
						if (var15.field837 || var15.field791) {
							field331 = false;
							field548 = 0;
							field194 = var14;
							field195 = var13;
							field196 = 2;
							field197 = field657;
							field198 = field658;

							if (HWEMRKQZ.method256(var14).field828 == field183) {
								field196 = 1;
							}

							if (HWEMRKQZ.method256(var14).field828 == field525) {
								field196 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field522 == 1 || method135(field526 - 1)) && field526 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field526 > 0) {
					method124(field526 - 1);
				}

				if (var1 != 2 || field526 <= 0) {
					return;
				}

				method172();
			}
		}
	}

	@ObfuscatedName("client.c(III)V")
	public final void method174(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field383[var4] != null) {
				int var5 = field381[var4];
				int var6 = field295 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field382[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field435 == 0 || field435 == 1 && method132(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field447.field99)) {
						if (field503 >= 1) {
							field546[field526] = "Report abuse @whi@" + var7;
							field206[field526] = 787;
							field526++;
						}

						field546[field526] = "Add ignore @whi@" + var7;
						field206[field526] = 379;
						field526++;
						field546[field526] = "Add friend @whi@" + var7;
						field206[field526] = 696;
						field526++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field437 == 0 && (var5 == 7 || field244 == 0 || field244 == 1 && method132(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field503 >= 1) {
							field546[field526] = "Report abuse @whi@" + var7;
							field206[field526] = 787;
							field526++;
						}

						field546[field526] = "Add ignore @whi@" + var7;
						field206[field526] = 379;
						field526++;
						field546[field526] = "Add friend @whi@" + var7;
						field206[field526] = 696;
						field526++;
					}

					var3++;
				}

				if (var5 == 4 && (field572 == 0 || field572 == 1 && method132(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field546[field526] = "Accept trade @whi@" + var7;
						field206[field526] = 940;
						field526++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field437 == 0 && field244 < 2) {
					var3++;
				}

				if (var5 == 8 && (field572 == 0 || field572 == 1 && method132(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field546[field526] = "Accept challenge @whi@" + var7;
						field206[field526] = 113;
						field526++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)Ljava/net/Socket;")
	public final Socket method175(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.D(I)V")
	public final void method176() {
		try {
			if (field539 != null) {
				field539.method261();
			}
		} catch (Exception var2) {
		}

		field539 = null;
		field288 = false;
		field491 = 0;
		field473 = "";
		field474 = "";
		method79();
		field351.method487();

		for (int var1 = 0; var1 < 4; var1++) {
			field498[var1].method353();
		}

		System.gc();
		method209();
		field510 = -1;
		field160 = -1;
		field410 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ZLjava/lang/String;)V")
	public final void method177(String arg0, String arg1) {
		if (field167 != null) {
			field167.method578();
			PNDCOEKM.field1141 = field570;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field305.method454(0, var3, 257, arg0);
			field305.method454(0xFFFFFF, var3 - 1, 256, arg0);
			var3 += 15;
			if (arg1 != null) {
				field305.method454(0, var3, 257, arg1);
				field305.method454(0xFFFFFF, var3 - 1, 256, arg1);
			}

			field167.method579(4, field642, 4);
		} else if (field643 != null) {
			field643.method578();
			PNDCOEKM.field1141 = field571;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			UKUXLUWP.method546(0, 383 - var5 / 2, var4 - 5 - var6 / 2, var5, var6);
			UKUXLUWP.method547(var4 - var6 / 2 - 5, var6, 383 - var5 / 2, 0xFFFFFF, var5);

			if (arg1 != null) {
				var4 -= 7;
			}

			field305.method454(0, var4, 383, arg0);
			field305.method454(0xFFFFFF, var4 - 1, 382, arg0);
			var4 += 15;
			if (arg1 != null) {
				field305.method454(0, var4, 383, arg1);
				field305.method454(0xFFFFFF, var4 - 1, 382, arg1);
			}

			field643.method579(0, field642, 0);
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method178() {
		int var1 = field169 * 128 + 64;
		int var2 = field170 * 128 + 64;
		int var3 = method80(field545, var1, var2) - field171;

		if (field555 < var1) {
			field555 += (var1 - field555) * field173 / 1000 + field172;
			if (field555 > var1) {
				field555 = var1;
			}
		}

		if (field555 > var1) {
			field555 -= (field555 - var1) * field173 / 1000 + field172;
			if (field555 < var1) {
				field555 = var1;
			}
		}

		if (field556 < var3) {
			field556 += (var3 - field556) * field173 / 1000 + field172;
			if (field556 > var3) {
				field556 = var3;
			}
		}

		if (field556 > var3) {
			field556 -= (field556 - var3) * field173 / 1000 + field172;
			if (field556 < var3) {
				field556 = var3;
			}
		}

		if (field557 < var2) {
			field557 += (var2 - field557) * field173 / 1000 + field172;
			if (field557 > var2) {
				field557 = var2;
			}
		}

		if (field557 > var2) {
			field557 -= (field557 - var2) * field173 / 1000 + field172;
			if (field557 < var2) {
				field557 = var2;
			}
		}

		int var4 = field275 * 128 + 64;
		int var5 = field276 * 128 + 64;
		int var6 = method80(field545, var4, var5) - field277;
		int var7 = var4 - field555;
		int var8 = var6 - field556;
		int var9 = var5 - field557;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field558 < var11) {
			field558 += (var11 - field558) * field279 / 1000 + field278;
			if (field558 > var11) {
				field558 = var11;
			}
		}

		if (field558 > var11) {
			field558 -= (field558 - var11) * field279 / 1000 + field278;
			if (field558 < var11) {
				field558 = var11;
			}
		}

		int var13 = var12 - field559;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field559 += field279 * var13 / 1000 + field278;
			field559 &= 0x7FF;
		}

		if (var13 < 0) {
			field559 -= -var13 * field279 / 1000 + field278;
			field559 &= 0x7FF;
		}

		int var14 = var12 - field559;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field559 = var12;
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
			if (field319 && field545 != arg4) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = field351.method513(arg4, arg2, arg5);
			}

			if (arg1 == 1) {
				var8 = field351.method514(arg2, arg4, arg5);
			}

			if (arg1 == 2) {
				var8 = field351.method515(arg4, arg2, arg5);
			}

			if (arg1 == 3) {
				var8 = field351.method516(arg4, arg2, arg5);
			}

			if (var8 != 0) {
				int var12 = field351.method517(arg4, arg2, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					field351.method504(arg4, arg5, arg2);
					LYSBQDHB var16 = LYSBQDHB.method282(var13);
					if (var16.field908) {
						field498[arg4].method358(arg2, arg5, var16.field923, var15, var14);
					}
				}

				if (arg1 == 1) {
					field351.method505(arg2, arg5, arg4);
				}

				if (arg1 == 2) {
					field351.method506(arg2, arg5, arg4);
					LYSBQDHB var17 = LYSBQDHB.method282(var13);
					if (var17.field882 + arg2 > 103 || var17.field882 + arg5 > 103 || var17.field891 + arg2 > 103 || var17.field891 + arg5 > 103) {
						return;
					}

					if (var17.field908) {
						field498[arg4].method359(var17.field882, arg2, var17.field891, var15, var17.field923, arg5);
					}
				}

				if (arg1 == 3) {
					field351.method507(arg2, arg5, arg4);
					LYSBQDHB var18 = LYSBQDHB.method282(var13);
					if (var18.field908 && var18.field881) {
						field498[arg4].method361(arg2, arg5);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg4;
				if (arg4 < 3 && (field287[1][arg2][arg5] & 0x2) == 2) {
					var19 = arg4 + 1;
				}

				CJZJWICI.method58(var19, arg0, arg2, field351, arg4, field233, arg5, field498[arg4], arg3, arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method180(String arg0) {
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

	@ObfuscatedName("client.a(II[B)Z")
	public final boolean method181(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.E(I)V")
	public final void method182() {
		if (field643 == null) {
			method84();
			field528 = null;
			field529 = null;
			field530 = null;
			field531 = null;
			field532 = null;
			field533 = null;
			field534 = null;
			field535 = null;
			field536 = null;
			field168 = null;
			field166 = null;
			field165 = null;
			field167 = null;
			field325 = null;
			field326 = null;
			field327 = null;
			field643 = new WOKQCNXG(765, 503, method122());
			field402 = true;
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method183() {
		field492++;
		if (field492 > 179) {
			field492 = 0;
			field367.method285(193);
			field367.method290(0);
		}

		for (int var1 = 0; var1 < field237; var1++) {
			int var2 = field238[var1];
			JMUIRIHZ var3 = field236[var2];
			if (var3 != null) {
				method184(var3.field853.field1409, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILNXRPKSXU;)V")
	public final void method184(int arg0, NXRPKSXU arg1) {
		if (arg1.field1014 < 128 || arg1.field1015 < 128 || arg1.field1014 >= 13184 || arg1.field1015 >= 13184) {
			arg1.field1044 = -1;
			arg1.field996 = -1;
			arg1.field1034 = 0;
			arg1.field1035 = 0;
			arg1.field1014 = arg1.field1003[0] * 128 + arg1.field1007 * 64;
			arg1.field1015 = arg1.field1004[0] * 128 + arg1.field1007 * 64;
			arg1.method350();
		}

		if (field447 == arg1 && (arg1.field1014 < 1536 || arg1.field1015 < 1536 || arg1.field1014 >= 11776 || arg1.field1015 >= 11776)) {
			arg1.field1044 = -1;
			arg1.field996 = -1;
			arg1.field1034 = 0;
			arg1.field1035 = 0;
			arg1.field1014 = arg1.field1003[0] * 128 + arg1.field1007 * 64;
			arg1.field1015 = arg1.field1004[0] * 128 + arg1.field1007 * 64;
			arg1.method350();
		}

		if (arg1.field1034 > field449) {
			method185(arg1);
		} else if (arg1.field1035 >= field449) {
			method186(arg1);
		} else {
			method187(arg1);
		}

		method188(arg1);
		method189(arg1);
	}

	@ObfuscatedName("client.a(ILNXRPKSXU;)V")
	public final void method185(NXRPKSXU arg0) {
		int var2 = arg0.field1034 - field449;
		int var3 = arg0.field1030 * 128 + arg0.field1007 * 64;
		int var4 = arg0.field1032 * 128 + arg0.field1007 * 64;
		arg0.field1014 += (var3 - arg0.field1014) / var2;
		arg0.field1015 += (var4 - arg0.field1015) / var2;
		arg0.field1027 = 0;

		if (arg0.field1036 == 0) {
			arg0.field1020 = 1024;
		}

		if (arg0.field1036 == 1) {
			arg0.field1020 = 1536;
		}

		if (arg0.field1036 == 2) {
			arg0.field1020 = 0;
		}

		if (arg0.field1036 == 3) {
			arg0.field1020 = 512;
		}
	}

	@ObfuscatedName("client.a(BLNXRPKSXU;)V")
	public final void method186(NXRPKSXU arg0) {
		if (field449 == arg0.field1035 || arg0.field1044 == -1 || arg0.field1047 != 0 || arg0.field1046 + 1 > UVDKTGZK.field1357[arg0.field1044].method562(arg0.field1045)) {
			int var2 = arg0.field1035 - arg0.field1034;
			int var3 = field449 - arg0.field1034;
			int var4 = arg0.field1030 * 128 + arg0.field1007 * 64;
			int var5 = arg0.field1032 * 128 + arg0.field1007 * 64;
			int var6 = arg0.field1031 * 128 + arg0.field1007 * 64;
			int var7 = arg0.field1033 * 128 + arg0.field1007 * 64;
			arg0.field1014 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1015 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1027 = 0;

		if (arg0.field1036 == 0) {
			arg0.field1020 = 1024;
		}

		if (arg0.field1036 == 1) {
			arg0.field1020 = 1536;
		}

		if (arg0.field1036 == 2) {
			arg0.field1020 = 0;
		}

		if (arg0.field1036 == 3) {
			arg0.field1020 = 512;
		}

		arg0.field1016 = arg0.field1020;
	}

	@ObfuscatedName("client.a(LNXRPKSXU;I)V")
	public final void method187(NXRPKSXU arg0) {
		arg0.field1017 = arg0.field1011;
		if (arg0.field1029 == 0) {
			arg0.field1027 = 0;
		} else {
			if (arg0.field1044 != -1 && arg0.field1047 == 0) {
				UVDKTGZK var2 = UVDKTGZK.field1357[arg0.field1044];
				if (arg0.field1006 > 0 && var2.field1369 == 0) {
					arg0.field1027++;
					return;
				}

				if (arg0.field1006 <= 0 && var2.field1370 == 0) {
					arg0.field1027++;
					return;
				}
			}

			int var3 = arg0.field1014;
			int var4 = arg0.field1015;
			int var5 = arg0.field1003[arg0.field1029 - 1] * 128 + arg0.field1007 * 64;
			int var6 = arg0.field1004[arg0.field1029 - 1] * 128 + arg0.field1007 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1020 = 1280;
					} else if (var4 > var6) {
						arg0.field1020 = 1792;
					} else {
						arg0.field1020 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1020 = 768;
					} else if (var4 > var6) {
						arg0.field1020 = 256;
					} else {
						arg0.field1020 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1020 = 1024;
				} else {
					arg0.field1020 = 0;
				}

				int var7 = arg0.field1020 - arg0.field1016 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1022;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1021;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1024;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1023;
				}

				if (var8 == -1) {
					var8 = arg0.field1021;
				}

				arg0.field1017 = var8;
				int var9 = 4;
				if (arg0.field1020 != arg0.field1016 && arg0.field1026 == -1 && arg0.field1002 != 0) {
					var9 = 2;
				}

				if (arg0.field1029 > 2) {
					var9 = 6;
				}

				if (arg0.field1029 > 3) {
					var9 = 8;
				}

				if (arg0.field1027 > 0 && arg0.field1029 > 1) {
					var9 = 8;
					arg0.field1027--;
				}

				if (arg0.field1025[arg0.field1029 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1021 == arg0.field1017 && arg0.field1043 != -1) {
					arg0.field1017 = arg0.field1043;
				}

				if (var3 < var5) {
					arg0.field1014 += var9;
					if (arg0.field1014 > var5) {
						arg0.field1014 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1014 -= var9;
					if (arg0.field1014 < var5) {
						arg0.field1014 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1015 += var9;
					if (arg0.field1015 > var6) {
						arg0.field1015 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1015 -= var9;
					if (arg0.field1015 < var6) {
						arg0.field1015 = var6;
					}
				}

				if (arg0.field1014 == var5 && arg0.field1015 == var6) {
					arg0.field1029--;

					if (arg0.field1006 > 0) {
						arg0.field1006--;
						return;
					}
				}
			} else {
				arg0.field1014 = var5;
				arg0.field1015 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(ZLNXRPKSXU;)V")
	public final void method188(NXRPKSXU arg0) {
		if (arg0.field1002 != 0) {
			if (arg0.field1026 != -1 && arg0.field1026 < 32768) {
				JMUIRIHZ var2 = field236[arg0.field1026];
				if (var2 != null) {
					int var3 = arg0.field1014 - var2.field1014;
					int var4 = arg0.field1015 - var2.field1015;
					if (var3 != 0 || var4 != 0) {
						arg0.field1020 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1026 >= 32768) {
				int var5 = arg0.field1026 - 32768;
				if (field428 == var5) {
					var5 = field390;
				}

				CHKMTWJC var6 = field391[var5];
				if (var6 != null) {
					int var7 = arg0.field1014 - var6.field1014;
					int var8 = arg0.field1015 - var6.field1015;
					if (var7 != 0 || var8 != 0) {
						arg0.field1020 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1041 != 0 || arg0.field1042 != 0) && (arg0.field1029 == 0 || arg0.field1027 > 0)) {
				int var9 = arg0.field1014 - (arg0.field1041 - field226 - field226) * 64;
				int var10 = arg0.field1015 - (arg0.field1042 - field227 - field227) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1020 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1041 = 0;
				arg0.field1042 = 0;
			}

			int var11 = arg0.field1020 - arg0.field1016 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1002 || var11 > 2048 - arg0.field1002) {
					arg0.field1016 = arg0.field1020;
				} else if (var11 > 1024) {
					arg0.field1016 -= arg0.field1002;
				} else {
					arg0.field1016 += arg0.field1002;
				}

				arg0.field1016 &= 0x7FF;
				if (arg0.field1017 == arg0.field1011 && arg0.field1020 != arg0.field1016) {
					if (arg0.field1012 != -1) {
						arg0.field1017 = arg0.field1012;
						return;
					}

					arg0.field1017 = arg0.field1021;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILNXRPKSXU;)V")
	public final void method189(NXRPKSXU arg0) {
		arg0.field1050 = false;

		if (arg0.field1017 != -1) {
			UVDKTGZK var2 = UVDKTGZK.field1357[arg0.field1017];
			arg0.field1019++;
			if (arg0.field1018 < var2.field1358 && arg0.field1019 > var2.method562(arg0.field1018)) {
				arg0.field1019 = 0;
				arg0.field1018++;
			}

			if (arg0.field1018 >= var2.field1358) {
				arg0.field1019 = 0;
				arg0.field1018 = 0;
			}
		}

		if (arg0.field996 != -1 && field449 >= arg0.field999) {
			if (arg0.field997 < 0) {
				arg0.field997 = 0;
			}

			UVDKTGZK var3 = XWNROHZR.field1439[arg0.field996].field1443;
			arg0.field998++;
			while (arg0.field997 < var3.field1358 && arg0.field998 > var3.method562(arg0.field997)) {
				arg0.field998 -= var3.method562(arg0.field997);
				arg0.field997++;
			}

			if (arg0.field997 >= var3.field1358 && (arg0.field997 < 0 || arg0.field997 >= var3.field1358)) {
				arg0.field996 = -1;
			}
		}

		if (arg0.field1044 != -1 && arg0.field1047 <= 1) {
			UVDKTGZK var4 = UVDKTGZK.field1357[arg0.field1044];
			if (var4.field1369 == 1 && arg0.field1006 > 0 && arg0.field1034 <= field449 && arg0.field1035 < field449) {
				arg0.field1047 = 1;
				return;
			}
		}

		if (arg0.field1044 != -1 && arg0.field1047 == 0) {
			UVDKTGZK var5 = UVDKTGZK.field1357[arg0.field1044];
			arg0.field1046++;
			while (arg0.field1045 < var5.field1358 && arg0.field1046 > var5.method562(arg0.field1045)) {
				arg0.field1046 -= var5.method562(arg0.field1045);
				arg0.field1045++;
			}

			if (arg0.field1045 >= var5.field1358) {
				arg0.field1045 -= var5.field1362;
				arg0.field1048++;
				if (arg0.field1048 >= var5.field1368) {
					arg0.field1044 = -1;
				}

				if (arg0.field1045 < 0 || arg0.field1045 >= var5.field1358) {
					arg0.field1044 = -1;
				}
			}

			arg0.field1050 = var5.field1364;
		}

		if (arg0.field1047 > 0) {
			arg0.field1047--;
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method190() {
		if (field330 == -1 || field493 != 2 && field643 == null) {
			if (field402) {
				method202();
				field402 = false;
				field253.method579(4, field642, 0);
				field254.method579(357, field642, 0);
				field255.method579(4, field642, 722);
				field256.method579(205, field642, 743);
				field257.method579(0, field642, 0);
				field258.method579(4, field642, 516);
				field259.method579(205, field642, 516);
				field260.method579(357, field642, 496);
				field261.method579(338, field642, 0);
				field438 = true;
				field457 = true;
				field423 = true;
				field353 = true;

				if (field493 != 2) {
					field167.method579(4, field642, 4);
					field166.method579(4, field642, 550);
				}

				field540++;
				if (field540 > 131) {
					field540 = 0;
					field367.method285(84);
					field367.method290(0);
				}
			}

			if (field493 == 2) {
				method83();
			}

			if (field270 && field467 == 1) {
				field438 = true;
			}

			if (field466 != -1) {
				boolean var3 = method70(field466, field246);
				if (var3) {
					field438 = true;
				}
			}

			if (field465 == 2) {
				field438 = true;
			}

			if (field196 == 2) {
				field438 = true;
			}

			if (field438) {
				method168();
				field438 = false;
			}

			if (field525 == -1 && field314 == 0) {
				field264.field827 = field231 - field295 - 77;

				if (field650 > 448 && field650 < 560 && field651 > 332) {
					method145(field231, 0, 463, field650 - 17, -1, field264, field651 - 357, 77);
				}

				int var4 = field231 - field264.field827 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field231 - 77) {
					var4 = field231 - 77;
				}

				if (field295 != var4) {
					field295 = var4;
					field457 = true;
				}
			}

			if (field525 == -1 && field314 == 3) {
				int var5 = field374 * 14 + 7;
				field264.field827 = field377;

				if (field650 > 448 && field650 < 560 && field651 > 332) {
					method145(var5, 0, 463, field650 - 17, -1, field264, field651 - 357, 77);
				}

				int var6 = field264.field827;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field377 != var6) {
					field377 = var6;
					field457 = true;
				}
			}

			if (field525 != -1) {
				boolean var7 = method70(field525, field246);
				if (var7) {
					field457 = true;
				}
			}

			if (field465 == 3) {
				field457 = true;
			}

			if (field196 == 3) {
				field457 = true;
			}

			if (field199 != null) {
				field457 = true;
			}

			if (field270 && field467 == 2) {
				field457 = true;
			}

			if (field457) {
				method170();
				field457 = false;
			}

			if (field493 == 2) {
				method76();
				field166.method579(4, field642, 550);
			}

			if (field135 != -1) {
				field423 = true;
			}

			if (field423) {
				if (field135 != -1 && field208 == field135) {
					field135 = -1;
					field367.method285(225);
					field367.method286(field208);
				}

				field423 = false;
				field327.method578();
				field358.method347(0, 0);

				if (field466 == -1) {
					if (field527[field208] != -1) {
						if (field208 == 0) {
							field149.method347(22, 10);
						}

						if (field208 == 1) {
							field150.method347(54, 8);
						}

						if (field208 == 2) {
							field150.method347(82, 8);
						}

						if (field208 == 3) {
							field151.method347(110, 8);
						}

						if (field208 == 4) {
							field153.method347(153, 8);
						}

						if (field208 == 5) {
							field153.method347(181, 8);
						}

						if (field208 == 6) {
							field152.method347(209, 9);
						}
					}

					if (field527[0] != -1 && (field135 != 0 || field449 % 20 < 10)) {
						field430[0].method347(29, 13);
					}

					if (field527[1] != -1 && (field135 != 1 || field449 % 20 < 10)) {
						field430[1].method347(53, 11);
					}

					if (field527[2] != -1 && (field135 != 2 || field449 % 20 < 10)) {
						field430[2].method347(82, 11);
					}

					if (field527[3] != -1 && (field135 != 3 || field449 % 20 < 10)) {
						field430[3].method347(115, 12);
					}

					if (field527[4] != -1 && (field135 != 4 || field449 % 20 < 10)) {
						field430[4].method347(153, 13);
					}

					if (field527[5] != -1 && (field135 != 5 || field449 % 20 < 10)) {
						field430[5].method347(180, 11);
					}

					if (field527[6] != -1 && (field135 != 6 || field449 % 20 < 10)) {
						field430[6].method347(208, 13);
					}
				}

				field327.method579(160, field642, 516);
				field326.method578();
				field357.method347(0, 0);

				if (field466 == -1) {
					if (field527[field208] != -1) {
						if (field208 == 7) {
							field368.method347(42, 0);
						}

						if (field208 == 8) {
							field369.method347(74, 0);
						}

						if (field208 == 9) {
							field369.method347(102, 0);
						}

						if (field208 == 10) {
							field370.method347(130, 1);
						}

						if (field208 == 11) {
							field372.method347(173, 0);
						}

						if (field208 == 12) {
							field372.method347(201, 0);
						}

						if (field208 == 13) {
							field371.method347(229, 0);
						}
					}

					if (field527[8] != -1 && (field135 != 8 || field449 % 20 < 10)) {
						field430[7].method347(74, 2);
					}

					if (field527[9] != -1 && (field135 != 9 || field449 % 20 < 10)) {
						field430[8].method347(102, 3);
					}

					if (field527[10] != -1 && (field135 != 10 || field449 % 20 < 10)) {
						field430[9].method347(137, 4);
					}

					if (field527[11] != -1 && (field135 != 11 || field449 % 20 < 10)) {
						field430[10].method347(174, 2);
					}

					if (field527[12] != -1 && (field135 != 12 || field449 % 20 < 10)) {
						field430[11].method347(201, 2);
					}

					if (field527[13] != -1 && (field135 != 13 || field449 % 20 < 10)) {
						field430[12].method347(226, 2);
					}
				}

				field326.method579(466, field642, 496);
				field167.method578();
				PNDCOEKM.field1141 = field570;
			}

			if (field353) {
				field353 = false;
				field325.method578();
				field356.method347(0, 0);
				field305.method455("Public chat", 28, true, 55, 0xFFFFFF);

				if (field435 == 0) {
					field305.method455("On", 41, true, 55, 0xFF00);
				}

				if (field435 == 1) {
					field305.method455("Friends", 41, true, 55, 0xFFFF00);
				}

				if (field435 == 2) {
					field305.method455("Off", 41, true, 55, 0xFF0000);
				}

				if (field435 == 3) {
					field305.method455("Hide", 41, true, 55, 0xFFFF);
				}

				field305.method455("Private chat", 28, true, 184, 0xFFFFFF);

				if (field244 == 0) {
					field305.method455("On", 41, true, 184, 0xFF00);
				}

				if (field244 == 1) {
					field305.method455("Friends", 41, true, 184, 0xFFFF00);
				}

				if (field244 == 2) {
					field305.method455("Off", 41, true, 184, 0xFF0000);
				}

				field305.method455("Trade/compete", 28, true, 324, 0xFFFFFF);

				if (field572 == 0) {
					field305.method455("On", 41, true, 324, 0xFF00);
				}

				if (field572 == 1) {
					field305.method455("Friends", 41, true, 324, 0xFFFF00);
				}

				if (field572 == 2) {
					field305.method455("Off", 41, true, 324, 0xFF0000);
				}

				field305.method455("Report abuse", 33, true, 458, 0xFFFFFF);
				field325.method579(453, field642, 0);
				field167.method578();
				PNDCOEKM.field1141 = field570;
			}

			field246 = 0;
		} else {
			if (field493 == 2) {
				method70(field330, field246);

				if (field192 != -1) {
					method70(field192, field246);
				}

				field246 = 0;
				method182();
				field643.method578();
				PNDCOEKM.field1141 = field571;
				UKUXLUWP.method544();
				field402 = true;
				HWEMRKQZ var1 = HWEMRKQZ.method256(field330);
				if (var1.field826 == 512 && var1.field813 == 334 && var1.field793 == 0) {
					var1.field826 = 765;
					var1.field813 = 503;
				}

				method148(0, 0, 0, var1);

				if (field192 != -1) {
					HWEMRKQZ var2 = HWEMRKQZ.method256(field192);
					if (var2.field826 == 512 && var2.field813 == 334 && var2.field793 == 0) {
						var2.field826 = 765;
						var2.field813 = 503;
					}

					method148(0, 0, 0, var2);
				}

				if (field270) {
					method147();
				} else {
					method203();
					method82();
				}
			}

			field643.method579(0, field642, 0);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method191(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field431 = "";
				field432 = "Connecting to server...";
				method104(true);
			}

			field539 = new KPIQNZMJ(method175(field317 + 43594), this);
			long var4 = XBRLLWQI.method581(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field367.field963 = 0;
			field367.method286(14);
			field367.method286(var6);
			field539.method265(2, 0, field367.field962);

			for (int var7 = 0; var7 < 8; var7++) {
				field539.method262();
			}

			int var8 = field539.method262();
			int var9 = var8;

			if (var8 == 0) {
				field539.method264(field154.field962, 0, 8);
				field154.field963 = 0;
				field455 = field154.method302();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field455 >> 32), (int) field455 };
				field367.field963 = 0;
				field367.method286(10);
				field367.method290(var10[0]);
				field367.method290(var10[1]);
				field367.method290(var10[2]);
				field367.method290(var10[3]);
				field367.method290(signlink.uid);
				field367.method293(arg0);
				field367.method293(arg1);
				field367.method311(field354, field155);
				field399.field963 = 0;

				if (arg2) {
					field399.method286(18);
				} else {
					field399.method286(16);
				}

				field399.method286(field367.field963 + 36 + 1 + 1 + 2);
				field399.method286(255);
				field399.method287(350);
				field399.method286(field319 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field399.method290(field524[var11]);
				}

				field399.method294(0, field367.field962, field367.field963);
				field367.field967 = new SSCDCBAC(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field484 = new SSCDCBAC(var10);
				field539.method265(field399.field963, 0, field399.field962);
				var8 = field539.method262();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method191(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field503 = field539.method262();
				field405 = field539.method262() == 1;
				field450 = 0L;
				field272 = 0;
				field407.field1466 = 0;
				field647 = true;
				field234 = true;
				field288 = true;
				field367.field963 = 0;
				field154.field963 = 0;
				field140 = -1;
				field346 = -1;
				field347 = -1;
				field348 = -1;
				field139 = 0;
				field141 = 0;
				field345 = 0;
				field143 = 0;
				field179 = 0;
				field526 = 0;
				field270 = false;
				field648 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field383[var13] = null;
				}

				field360 = 0;
				field385 = 0;
				field493 = 0;
				field504 = 0;
				field365 = (int) (Math.random() * 100.0D) - 50;
				field508 = (int) (Math.random() * 110.0D) - 55;
				field379 = (int) (Math.random() * 80.0D) - 40;
				field293 = (int) (Math.random() * 120.0D) - 60;
				field185 = (int) (Math.random() * 30.0D) - 20;
				field189 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field542 = 0;
				field193 = -1;
				field442 = 0;
				field443 = 0;
				field392 = 0;
				field237 = 0;

				for (int var14 = 0; var14 < field389; var14++) {
					field391[var14] = null;
					field396[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field236[var15] = null;
				}

				field447 = field391[field390] = new CHKMTWJC();
				field162.method604();
				field340.method604();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field560[var16][var17][var18] = null;
						}
					}
				}

				field303 = new ZWZXPJNQ();
				field550 = 0;
				field549 = 0;
				method158(field553);
				field553 = -1;
				method158(field525);
				field525 = -1;
				method158(field183);
				field183 = -1;
				method158(field330);
				field330 = -1;
				method158(field192);
				field192 = -1;
				method158(field466);
				field466 = -1;
				method158(field446);
				field446 = -1;
				field397 = false;
				field208 = 3;
				field314 = 0;
				field270 = false;
				field378 = false;
				field199 = null;
				field184 = 0;
				field135 = -1;
				field247 = true;
				method66();

				for (int var19 = 0; var19 < 5; var19++) {
					field242[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field349[var20] = null;
					field350[var20] = false;
				}

				field274 = 0;
				field315 = 0;
				field429 = 0;
				field284 = 0;
				field328 = 0;
				field541 = 0;
				field290 = 0;
				method202();
			} else if (var8 == 3) {
				field431 = "";
				field432 = "Invalid username or password.";
			} else if (var8 == 4) {
				field431 = "Your account has been disabled.";
				field432 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field431 = "Your account is already logged in.";
				field432 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field431 = "RuneScape has been updated!";
				field432 = "Please reload this page.";
			} else if (var8 == 7) {
				field431 = "This world is full.";
				field432 = "Please use a different world.";
			} else if (var8 == 8) {
				field431 = "Unable to connect.";
				field432 = "Login server offline.";
			} else if (var8 == 9) {
				field431 = "Login limit exceeded.";
				field432 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field431 = "Unable to connect.";
				field432 = "Bad session id.";
			} else if (var8 == 11) {
				field431 = "Login server rejected session.";
				field432 = "Please try again.";
			} else if (var8 == 12) {
				field431 = "You need a members account to login to this world.";
				field432 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field431 = "Could not complete login.";
				field432 = "Please try using a different world.";
			} else if (var8 == 14) {
				field431 = "The server is being updated.";
				field432 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field288 = true;
				field367.field963 = 0;
				field154.field963 = 0;
				field140 = -1;
				field346 = -1;
				field347 = -1;
				field348 = -1;
				field139 = 0;
				field141 = 0;
				field345 = 0;
				field526 = 0;
				field270 = false;
				field177 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field431 = "Login attempts exceeded.";
				field432 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field431 = "You are standing in a members-only area.";
				field432 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field431 = "Invalid loginserver requested";
				field432 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field539.method262();
				for (var21 += 3; var21 >= 0; var21--) {
					field431 = "You have only just left another world";
					field432 = "Your profile will be transferred in: " + var21;
					method104(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method191(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field431 = "Malformed login packet.";
				field432 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field431 = "Unexpected server response";
				field432 = "Please try using a different world.";
			} else if (var9 != 0) {
				field431 = "No response from server";
				field432 = "Please try using a different world.";
			} else if (field296 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field296++;
				method191(arg0, arg1, arg2);
			} else {
				field431 = "No response from loginserver";
				field432 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field431 = "";
			field432 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public final void method192(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field374 = 0;
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

			field374 = 0;
			label46: for (int var7 = 0; var7 < PICYKCUA.field1097; var7++) {
				PICYKCUA var8 = PICYKCUA.method418(var7);
				if (var8.field1115 == -1 && var8.field1127 != null) {
					String var9 = var8.field1127.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field375[field374] = var9;
					field376[field374] = var7;
					field374++;
					if (field374 >= field375.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method193() {
		field439 = new NUXLZYAZ(field159, "titlebox", 0);
		field440 = new NUXLZYAZ(field159, "titlebutton", 0);
		field240 = new NUXLZYAZ[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field240[var1] = new NUXLZYAZ(field159, "runes", var1);
		}

		field333 = new SWNASVGQ(128, 265);
		field334 = new SWNASVGQ(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field333.field1245[var2] = field531.field1431[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field334.field1245[var3] = field532.field1431[var3];
		}

		field211 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field211[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field211[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field211[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field211[var7 + 192] = 0xFFFFFF;
		}

		field212 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field212[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field212[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field212[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field212[var11 + 192] = 0xFFFFFF;
		}

		field213 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field213[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field213[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field213[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field213[var15 + 192] = 0xFFFFFF;
		}

		field210 = new int[256];
		field298 = new int[32768];
		field299 = new int[32768];
		method77(null);
		field482 = new int[32768];
		field483 = new int[32768];
		method142(10, "Connecting to fileserver");

		if (!field248) {
			field406 = true;
			field248 = true;
			method131(this, 2);
		}
	}

	@ObfuscatedName("client.d(IILMLYYHULT;)V")
	public final void method194(int arg0, MLYYHULT arg1) {
		arg1.method306();
		int var3 = arg1.method307(8);
		if (var3 < field237) {
			for (int var4 = var3; var4 < field237; var4++) {
				field310[field309++] = field238[var4];
			}
		}

		if (var3 > field237) {
			signlink.reporterror(field473 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field237 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field238[var5];
			JMUIRIHZ var7 = field236[var6];
			int var8 = arg1.method307(1);
			if (var8 == 0) {
				field238[field237++] = var6;
				var7.field1028 = field449;
			} else {
				int var9 = arg1.method307(2);
				if (var9 == 0) {
					field238[field237++] = var6;
					var7.field1028 = field449;
					field395[field394++] = var6;
				} else if (var9 == 1) {
					field238[field237++] = var6;
					var7.field1028 = field449;
					int var10 = arg1.method307(3);
					var7.method351(var10, false);
					int var11 = arg1.method307(1);
					if (var11 == 1) {
						field395[field394++] = var6;
					}
				} else if (var9 == 2) {
					field238[field237++] = var6;
					var7.field1028 = field449;
					int var12 = arg1.method307(3);
					var7.method351(var12, true);
					int var13 = arg1.method307(3);
					var7.method351(var13, true);
					int var14 = arg1.method307(1);
					if (var14 == 1) {
						field395[field394++] = var6;
					}
				} else if (var9 == 3) {
					field310[field309++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)Z")
	public final boolean method195() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.H(I)V")
	public final void method196() {
		int var1 = 5;
		field524[8] = 0;
		int var2 = 0;
		while (field524[8] == 0) {
			String var3 = "Unknown problem";
			method142(20, "Connecting to web server");

			try {
				DataInputStream var4 = method206("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 350);
				MLYYHULT var5 = new MLYYHULT(new byte[40]);
				var4.readFully(var5.field962, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field524[var6] = var5.method301();
				}

				int var7 = var5.method301();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field524[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field524[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field524[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field524[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field524[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field524[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method142(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method142(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field180 = !field180;
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method197() {
		field412 = 0;
		for (int var1 = -1; var1 < field392 + field237; var1++) {
			NXRPKSXU var2;
			if (var1 == -1) {
				var2 = field447;
			} else if (var1 < field392) {
				var2 = field391[field393[var1]];
			} else {
				var2 = field236[field238[var1 - field392]];
			}

			if (var2 != null && var2.method38()) {
				if (var2 instanceof JMUIRIHZ) {
					VWKJSKWX var3 = ((JMUIRIHZ) var2).field853;
					if (var3.field1400 != null) {
						var3 = var3.method570();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field392) {
					VWKJSKWX var6 = ((JMUIRIHZ) var2).field853;
					if (var6.field1392 >= 0 && var6.field1392 < field217.length) {
						method74(var2, var2.field1049 + 15);

						if (field338 > -1) {
							field217[var6.field1392].method474(field338 - 12, field339 - 30);
						}
					}

					if (field179 == 1 && field238[var1 - field392] == field426 && field449 % 20 < 10) {
						method74(var2, var2.field1049 + 15);

						if (field338 > -1) {
							field273[0].method474(field338 - 12, field339 - 28);
						}
					}
				} else {
					int var4 = 30;
					CHKMTWJC var5 = (CHKMTWJC) var2;
					if (var5.field86 != -1 || var5.field84 != -1) {
						method74(var2, var2.field1049 + 15);

						if (field338 > -1) {
							if (var5.field86 != -1) {
								field341[var5.field86].method474(field338 - 12, field339 - var4);
								var4 += 25;
							}

							if (var5.field84 != -1) {
								field217[var5.field84].method474(field338 - 12, field339 - var4);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field179 == 10 && field393[var1] == field481) {
						method74(var2, var2.field1049 + 15);

						if (field338 > -1) {
							field273[1].method474(field338 - 12, field339 - var4);
						}
					}
				}

				if (var2.field1001 != null && (var1 >= field392 || field435 == 0 || field435 == 3 || field435 == 1 && method132(((CHKMTWJC) var2).field99))) {
					method74(var2, var2.field1049);

					if (field338 > -1 && field412 < field413) {
						field417[field412] = field306.method457(var2.field1001) / 2;
						field416[field412] = field306.field1242;
						field414[field412] = field338;
						field415[field412] = field339;
						field418[field412] = var2.field1013;
						field419[field412] = var2.field1005;
						field420[field412] = var2.field1037;
						field421[field412++] = var2.field1001;

						if (field301 == 0 && var2.field1005 >= 1 && var2.field1005 <= 3) {
							field416[field412] += 10;
							field415[field412] += 5;
						}

						if (field301 == 0 && var2.field1005 == 4) {
							field417[field412] = 60;
						}

						if (field301 == 0 && var2.field1005 == 5) {
							field416[field412] += 5;
						}
					}
				}

				if (var2.field1008 > field449) {
					method74(var2, var2.field1049 + 15);

					if (field338 > -1) {
						int var7 = var2.field1009 * 30 / var2.field1010;
						if (var7 > 30) {
							var7 = 30;
						}

						UKUXLUWP.method546(0xFF00, field338 - 15, field339 - 3, var7, 5);
						UKUXLUWP.method546(0xFF0000, field338 + var7 - 15, field339 - 3, 30 - var7, 5);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1040[var8] > field449) {
						method74(var2, var2.field1049 / 2);

						if (field338 > -1) {
							if (var8 == 1) {
								field339 -= 20;
							}

							if (var8 == 2) {
								field338 -= 15;
								field339 -= 10;
							}

							if (var8 == 3) {
								field338 += 15;
								field339 -= 10;
							}

							field136[var2.field1039[var8]].method474(field338 - 12, field339 - 12);
							field304.method454(0, field339 + 4, field338, String.valueOf(var2.field1038[var8]));
							field304.method454(0xFFFFFF, field339 + 3, field338 - 1, String.valueOf(var2.field1038[var8]));
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

			field338 = field414[var9];
			field339 = field415[var9] = var11;
			String var16 = field421[var9];
			if (field301 == 0) {
				int var17 = 0xFFFF00;
				if (field418[var9] < 6) {
					var17 = field203[field418[var9]];
				}

				if (field418[var9] == 6) {
					var17 = field494 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field418[var9] == 7) {
					var17 = field494 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field418[var9] == 8) {
					var17 = field494 % 20 < 10 ? 0xB000 : 0x80FF80;
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
					field306.method454(0, field339 + 1, field338, var16);
					field306.method454(var17, field339, field338, var16);
				}

				if (field419[var9] == 1) {
					field306.method459(field494, field339 + 1, 0, field338, var16);
					field306.method459(field494, field339, var17, field338, var16);
				}

				if (field419[var9] == 2) {
					field306.method460(field339 + 1, 0, field338, var16, field494);
					field306.method460(field339, var17, field338, var16, field494);
				}

				if (field419[var9] == 3) {
					field306.method461(0, var16, 150 - field420[var9], field339 + 1, field494, field338);
					field306.method461(var17, var16, 150 - field420[var9], field339, field494, field338);
				}

				if (field419[var9] == 4) {
					int var21 = field306.method457(var16);
					int var22 = (150 - field420[var9]) * (var21 + 100) / 150;
					UKUXLUWP.method543(field338 - 50, 0, field338 + 50, 334);
					field306.method458(0, field338 + 50 - var22, field339 + 1, var16);
					field306.method458(var17, field338 + 50 - var22, field339, var16);
					UKUXLUWP.method542();
				}

				if (field419[var9] == 5) {
					int var23 = 150 - field420[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					UKUXLUWP.method543(0, field339 - field306.field1242 - 1, 512, field339 + 5);
					field306.method454(0, field339 + var24 + 1, field338, var16);
					field306.method454(var17, field339 + var24, field338, var16);
					UKUXLUWP.method542();
				}
			} else {
				field306.method454(0, field339 + 1, field338, var16);
				field306.method454(0xFFFF00, field339, field338, var16);
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void method198() {
		byte[] var1 = field159.method249("title.dat", null);
		SWNASVGQ var2 = new SWNASVGQ(var1, this);
		field531.method578();
		var2.method472(0, 0);
		field532.method578();
		var2.method472(-637, 0);
		field528.method578();
		var2.method472(-128, 0);
		field529.method578();
		var2.method472(-202, -371);
		field530.method578();
		var2.method472(-202, -171);
		field533.method578();
		var2.method472(0, -265);
		field534.method578();
		var2.method472(-562, -265);
		field535.method578();
		var2.method472(-128, -171);
		field536.method578();
		var2.method472(-562, -171);
		int[] var3 = new int[var2.field1246];
		for (int var4 = 0; var4 < var2.field1247; var4++) {
			for (int var5 = 0; var5 < var2.field1246; var5++) {
				var3[var5] = var2.field1245[var2.field1246 * var4 + var2.field1246 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1246; var6++) {
				var2.field1245[var2.field1246 * var4 + var6] = var3[var6];
			}
		}

		field531.method578();
		var2.method472(382, 0);
		field532.method578();
		var2.method472(-255, 0);
		field528.method578();
		var2.method472(254, 0);
		field529.method578();
		var2.method472(180, -371);
		field530.method578();
		var2.method472(180, -171);
		field533.method578();
		var2.method472(382, -265);
		field534.method578();
		var2.method472(-180, -265);
		field535.method578();
		var2.method472(254, -171);
		field536.method578();
		var2.method472(-180, -171);
		SWNASVGQ var7 = new SWNASVGQ(field159, "logo", 0);
		field528.method578();
		var7.method474(382 - var7.field1246 / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.h(II)V")
	public final void method199(int arg0, int arg1) {
		ZWZXPJNQ var3 = field560[field545][arg0][arg1];
		if (var3 == null) {
			field351.method508(field545, arg0, arg1);
		} else {
			int var4 = -99999999;
			YLPPYQUD var5 = null;
			for (YLPPYQUD var6 = (YLPPYQUD) var3.method600(); var6 != null; var6 = (YLPPYQUD) var3.method602()) {
				PICYKCUA var7 = PICYKCUA.method418(var6.field1492);
				int var8 = var7.field1087;
				if (var7.field1112) {
					var8 = (var6.field1491 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method598(var5);
			YLPPYQUD var9 = null;
			YLPPYQUD var10 = null;
			for (YLPPYQUD var11 = (YLPPYQUD) var3.method600(); var11 != null; var11 = (YLPPYQUD) var3.method602()) {
				if (var5.field1492 != var11.field1492 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1492 != var11.field1492 && var9.field1492 != var11.field1492 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field351.method494(var9, var10, method80(field545, arg0 * 128 + 64, arg1 * 128 + 64), field545, arg1, arg0, var5, var12);
		}
	}

	@ObfuscatedName("client.d(BI)Ljava/lang/String;")
	public final String method200(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.J(I)V")
	public final void method201() {
		if (field345 > 1) {
			field345--;
		}

		if (field143 > 0) {
			field143--;
		}

		for (int var1 = 0; var1 < 5 && method123(); var1++) {
		}

		if (field288) {
			synchronized (field407.field1464) {
				if (!field405) {
					field407.field1466 = 0;
				} else if (field656 != 0 || field407.field1466 >= 40) {
					field367.method285(224);
					field367.method286(0);
					int var3 = field367.field963;
					int var4 = 0;
					for (int var5 = 0; var5 < field407.field1466 && var3 - field367.field963 < 240; var5++) {
						var4++;
						int var6 = field407.field1463[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field407.field1465[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field407.field1463[var5] == -1 && field407.field1465[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field201 != var7 || field202 != var6) {
							int var9 = var7 - field201;
							field201 = var7;
							int var10 = var6 - field202;
							field202 = var6;

							if (field272 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field367.method287((field272 << 12) + (var9 << 6) + var10);
								field272 = 0;
							} else if (field272 < 8) {
								field367.method289((field272 << 19) + var8 + 0x800000);
								field272 = 0;
							} else {
								field367.method290((field272 << 19) + var8 - 0x40000000);
								field272 = 0;
							}
						} else if (field272 < 2047) {
							field272++;
						}
					}

					field367.method295(field367.field963 - var3);

					if (var4 >= field407.field1466) {
						field407.field1466 = 0;
					} else {
						field407.field1466 -= var4;
						for (int var11 = 0; var11 < field407.field1466; var11++) {
							field407.field1465[var11] = field407.field1465[var4 + var11];
							field407.field1463[var11] = field407.field1463[var4 + var11];
						}
					}
				}
			}

			if (field656 != 0) {
				long var12 = (field659 - field450) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field450 = field659;
				int var14 = field658;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field657;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field656 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field367.method285(150);
				field367.method290((var17 << 19) + (var18 << 20) + var16);
			}

			if (field477 > 0) {
				field477--;
			}

			if (field660[1] == 1 || field660[2] == 1 || field660[3] == 1 || field660[4] == 1) {
				field478 = true;
			}

			if (field478 && field477 <= 0) {
				field477 = 20;
				field478 = false;
				field367.method285(130);
				field367.method323(field188);
				field367.method287(field189);
			}

			if (field647 && !field234) {
				field234 = true;
				field367.method285(139);
				field367.method286(1);
			}

			if (!field647 && field234) {
				field234 = false;
				field367.method285(139);
				field367.method286(0);
			}

			method152();
			method97();
			method120();
			field141++;
			if (field141 > 750) {
				method78();
			}

			method85();
			method183();
			method166();
			field246++;

			if (field502 != 0) {
				field501 += 20;
				if (field501 >= 400) {
					field502 = 0;
				}
			}

			if (field465 != 0) {
				field462++;
				if (field462 >= 15) {
					if (field465 == 2) {
						field438 = true;
					}

					if (field465 == 3) {
						field457 = true;
					}

					field465 = 0;
				}
			}

			if (field196 != 0) {
				field548++;

				if (field650 > field197 + 5 || field650 < field197 - 5 || field651 > field198 + 5 || field651 < field198 - 5) {
					field331 = true;
				}

				if (field649 == 0) {
					if (field196 == 2) {
						field438 = true;
					}

					if (field196 == 3) {
						field457 = true;
					}

					field196 = 0;

					if (field331 && field548 >= 5) {
						field182 = -1;
						method203();

						if (field194 == field182 && field195 != field181) {
							HWEMRKQZ var19 = HWEMRKQZ.method256(field194);
							byte var20 = 0;
							if (field321 == 1 && var19.field841 == 206) {
								var20 = 1;
							}

							if (var19.field796[field181] <= 0) {
								var20 = 0;
							}

							if (var19.field791) {
								int var21 = field195;
								int var22 = field181;
								var19.field796[var22] = var19.field796[var21];
								var19.field830[var22] = var19.field830[var21];
								var19.field796[var21] = -1;
								var19.field830[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field195;
								int var24 = field181;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method253(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method253(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method253(field181, field195);
							}

							field367.method285(109);
							field367.method286(var20);
							field367.method322(field194);
							field367.method322(field181);
							field367.method321(field195);
						}
					} else if ((field522 == 1 || method135(field526 - 1)) && field526 > 2) {
						method172();
					} else if (field526 > 0) {
						method124(field526 - 1);
					}

					field462 = 10;
					field656 = 0;
				}
			}

			if (TAWLWNCF.field1299 != -1) {
				int var25 = TAWLWNCF.field1299;
				int var26 = TAWLWNCF.field1300;
				boolean var27 = method64(0, true, 0, 0, var25, 0, 0, var26, field447.field1003[0], field447.field1004[0], 0);
				TAWLWNCF.field1299 = -1;

				if (var27) {
					field499 = field657;
					field500 = field658;
					field502 = 1;
					field501 = 0;
				}
			}

			if (field656 == 1 && field199 != null) {
				field199 = null;
				field457 = true;
				field656 = 0;
			}

			method173();

			if (field330 == -1) {
				method87();
				method160();
				method99();
			}

			if (field649 == 1 || field656 == 1) {
				field459++;
			}

			if (field245 == 0 && field174 == 0 && field243 == 0) {
				if (field544 > 0) {
					field544--;
				}
			} else if (field544 < 100) {
				field544++;
				if (field544 == 100) {
					if (field245 != 0) {
						field457 = true;
					}

					if (field174 != 0) {
						field438 = true;
					}
				}
			}

			if (field493 == 2) {
				method103();
			}

			if (field493 == 2 && field138) {
				method178();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field148[var28]++;
			}

			method150();
			field403++;
			if (field403 > 153) {
				field403 = 0;
				field367.method285(1);
				field367.method287(26173);
			}

			field648++;
			if (field648 > 4500) {
				field143 = 250;
				field648 -= 500;
				field367.method285(63);
			}

			field523++;
			if (field523 > 500) {
				field523 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field365 += field366;
				}

				if ((var29 & 0x2) == 2) {
					field508 += field509;
				}

				if ((var29 & 0x4) == 4) {
					field379 += field380;
				}
			}

			if (field365 < -50) {
				field366 = 2;
			}

			if (field365 > 50) {
				field366 = -2;
			}

			if (field508 < -55) {
				field509 = 2;
			}

			if (field508 > 55) {
				field509 = -2;
			}

			if (field379 < -40) {
				field380 = 1;
			}

			if (field379 > 40) {
				field380 = -1;
			}

			field401++;
			if (field401 > 500) {
				field401 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field293 += field294;
				}

				if ((var30 & 0x2) == 2) {
					field185 += field186;
				}
			}

			if (field293 < -60) {
				field294 = 2;
			}

			if (field293 > 60) {
				field294 = -2;
			}

			if (field185 < -20) {
				field186 = 1;
			}

			if (field185 > 10) {
				field186 = -1;
			}

			field142++;
			if (field142 > 50) {
				field367.method285(58);
			}

			try {
				if (field539 != null && field367.field963 > 0) {
					field539.method265(field367.field963, 0, field367.field962);
					field367.field963 = 0;
					field142 = 0;
				}
			} catch (IOException var32) {
				method78();
			} catch (Exception var33) {
				method176();
			}
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void method202() {
		if (field168 == null) {
			method84();
			field643 = null;
			field528 = null;
			field529 = null;
			field530 = null;
			field531 = null;
			field532 = null;
			field533 = null;
			field534 = null;
			field535 = null;
			field536 = null;
			field168 = new WOKQCNXG(479, 96, method122());
			field166 = new WOKQCNXG(172, 156, method122());
			UKUXLUWP.method544();
			field251.method347(0, 0);
			field165 = new WOKQCNXG(190, 261, method122());
			field167 = new WOKQCNXG(512, 334, method122());
			UKUXLUWP.method544();
			field325 = new WOKQCNXG(496, 50, method122());
			field326 = new WOKQCNXG(269, 37, method122());
			field327 = new WOKQCNXG(249, 45, method122());
			field402 = true;
			field167.method578();
			PNDCOEKM.field1141 = field570;
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method203() {
		if (field196 == 0) {
			field546[0] = "Cancel";
			field206[0] = 1921;
			field526 = 1;
			if (field330 == -1) {
				method169();
				field324 = 0;
				field458 = 0;

				if (field650 > 4 && field651 > 4 && field650 < 516 && field651 < 338) {
					if (field183 == -1) {
						method205();
					} else {
						method141(HWEMRKQZ.method256(field183), field651, 0, 4, field650, 0, 4);
					}
				}

				if (field324 != field156) {
					field156 = field324;
				}

				if (field458 != field243) {
					field243 = field458;
				}

				field324 = 0;
				field458 = 0;

				if (field650 > 553 && field651 > 205 && field650 < 743 && field651 < 466) {
					if (field466 != -1) {
						method141(HWEMRKQZ.method256(field466), field651, 1, 553, field650, 0, 205);
					} else if (field527[field208] != -1) {
						method141(HWEMRKQZ.method256(field527[field208]), field651, 1, 553, field650, 0, 205);
					}
				}

				if (field324 != field146) {
					field438 = true;
					field146 = field324;
				}

				if (field458 != field174) {
					field438 = true;
					field174 = field458;
				}

				field324 = 0;
				field458 = 0;

				if (field650 > 17 && field651 > 357 && field650 < 496 && field651 < 453) {
					if (field525 != -1) {
						method141(HWEMRKQZ.method256(field525), field651, 2, 17, field650, 0, 357);
					} else if (field553 != -1) {
						method141(HWEMRKQZ.method256(field553), field651, 3, 17, field650, 0, 357);
					} else if (field651 < 434 && field650 < 426 && field314 == 0) {
						method174(field650 - 17, field651 - 357);
					}
				}

				if ((field525 != -1 || field553 != -1) && field520 != field324) {
					field457 = true;
					field520 = field324;
				}

				if ((field525 != -1 || field553 != -1) && field458 != field245) {
					field457 = true;
					field245 = field458;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field526 - 1; var2++) {
						if (field206[var2] < 1000 && field206[var2 + 1] > 1000) {
							String var3 = field546[var2];
							field546[var2] = field546[var2 + 1];
							field546[var2 + 1] = var3;
							int var4 = field206[var2];
							field206[var2] = field206[var2 + 1];
							field206[var2 + 1] = var4;
							int var5 = field204[var2];
							field204[var2] = field204[var2 + 1];
							field204[var2 + 1] = var5;
							int var6 = field205[var2];
							field205[var2] = field205[var2 + 1];
							field205[var2 + 1] = var6;
							int var7 = field207[var2];
							field207[var2] = field207[var2 + 1];
							field207[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field324 = 0;
				field458 = 0;
				method141(HWEMRKQZ.method256(field330), field651, 0, 0, field650, 0, 0);

				if (field324 != field156) {
					field156 = field324;
				}

				if (field458 != field243) {
					field243 = field458;
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method204() {
		signlink.reporterror = false;

		try {
			if (field539 != null) {
				field539.method261();
			}
		} catch (Exception var1) {
		}

		field539 = null;
		method209();

		if (field407 != null) {
			field407.field1462 = false;
		}

		field407 = null;
		field225.method231();
		field225 = null;
		field235 = null;
		field367 = null;
		field399 = null;
		field154 = null;
		field451 = null;
		field329 = null;
		field554 = null;
		field452 = null;
		field453 = null;
		field233 = null;
		field287 = null;
		field351 = null;
		field498 = null;
		field427 = null;
		field263 = null;
		field336 = null;
		field337 = null;
		field265 = null;
		field165 = null;
		field166 = null;
		field167 = null;
		field168 = null;
		field325 = null;
		field326 = null;
		field327 = null;
		field253 = null;
		field254 = null;
		field255 = null;
		field256 = null;
		field257 = null;
		field258 = null;
		field259 = null;
		field260 = null;
		field261 = null;
		field250 = null;
		field251 = null;
		field252 = null;
		field356 = null;
		field357 = null;
		field358 = null;
		field430 = null;
		field149 = null;
		field150 = null;
		field151 = null;
		field152 = null;
		field153 = null;
		field368 = null;
		field369 = null;
		field370 = null;
		field371 = null;
		field372 = null;
		field573 = null;
		field136 = null;
		field341 = null;
		field217 = null;
		field273 = null;
		field422 = null;
		field538 = null;
		field512 = null;
		field513 = null;
		field514 = null;
		field515 = null;
		field516 = null;
		field164 = null;
		field200 = null;
		field232 = null;
		field391 = null;
		field393 = null;
		field395 = null;
		field396 = null;
		field310 = null;
		field236 = null;
		field238 = null;
		field560 = null;
		field303 = null;
		field162 = null;
		field340 = null;
		field204 = null;
		field205 = null;
		field206 = null;
		field207 = null;
		field546 = null;
		field262 = null;
		field518 = null;
		field519 = null;
		field434 = null;
		field444 = null;
		field359 = null;
		field460 = null;
		field269 = null;
		field531 = null;
		field532 = null;
		field528 = null;
		field529 = null;
		field530 = null;
		field533 = null;
		field534 = null;
		field535 = null;
		field536 = null;
		method84();
		LYSBQDHB.method281();
		VWKJSKWX.method571();
		PICYKCUA.method414();
		HWEMRKQZ.method251();
		SXDNVMNH.field1253 = null;
		NQIAMATB.field981 = null;
		UDDRZUAX.field1328 = null;
		UVDKTGZK.field1357 = null;
		XWNROHZR.field1439 = null;
		XWNROHZR.field1451 = null;
		KTJKDKKM.field865 = null;
		field643 = null;
		CHKMTWJC.field83 = null;
		PNDCOEKM.method419();
		TAWLWNCF.method486();
		CADBNSXE.method7();
		DFGNFGZH.method213();
		System.gc();
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method205() {
		if (field360 == 0 && field385 == 0) {
			field546[field526] = "Walk here";
			field206[field526] = 16;
			field204[field526] = field650;
			field205[field526] = field651;
			field526++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < CADBNSXE.field77; var2++) {
			int var3 = CADBNSXE.field78[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field351.method517(field545, var4, var5, var3) >= 0) {
					LYSBQDHB var8 = LYSBQDHB.method282(var7);
					if (var8.field911 != null) {
						var8 = var8.method278();
					}

					if (var8 == null) {
						continue;
					}

					if (field360 == 1) {
						field546[field526] = "Use " + field364 + " with @cya@" + var8.field918;
						field206[field526] = 419;
						field207[field526] = var3;
						field204[field526] = var4;
						field205[field526] = var5;
						field526++;
					} else if (field385 != 1) {
						if (var8.field898 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field898[var9] != null) {
									field546[field526] = var8.field898[var9] + " @cya@" + var8.field918;

									if (var9 == 0) {
										field206[field526] = 588;
									}

									if (var9 == 1) {
										field206[field526] = 256;
									}

									if (var9 == 2) {
										field206[field526] = 766;
									}

									if (var9 == 3) {
										field206[field526] = 985;
									}

									if (var9 == 4) {
										field206[field526] = 1577;
									}

									field207[field526] = var3;
									field204[field526] = var4;
									field205[field526] = var5;
									field526++;
								}
							}
						}

						field546[field526] = "Examine @cya@" + var8.field918;
						field206[field526] = 1327;
						field207[field526] = var8.field913 << 14;
						field204[field526] = var4;
						field205[field526] = var5;
						field526++;
					} else if ((field387 & 0x4) == 4) {
						field546[field526] = field388 + " @cya@" + var8.field918;
						field206[field526] = 157;
						field207[field526] = var3;
						field204[field526] = var4;
						field205[field526] = var5;
						field526++;
					}
				}

				if (var6 == 1) {
					JMUIRIHZ var10 = field236[var7];
					if (var10.field853.field1409 == 1 && (var10.field1014 & 0x7F) == 0x40 && (var10.field1015 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field237; var11++) {
							JMUIRIHZ var12 = field236[field238[var11]];
							if (var12 != null && var10 != var12 && var12.field853.field1409 == 1 && var10.field1014 == var12.field1014 && var10.field1015 == var12.field1015) {
								method138(var12.field853, var5, var4, field238[var11]);
							}
						}

						for (int var13 = 0; var13 < field392; var13++) {
							CHKMTWJC var14 = field391[field393[var13]];
							if (var14 != null && var10.field1014 == var14.field1014 && var10.field1015 == var14.field1015) {
								method144(var5, field393[var13], var14, var4);
							}
						}
					}

					method138(var10.field853, var5, var4, var7);
				}

				if (var6 == 0) {
					CHKMTWJC var15 = field391[var7];
					if ((var15.field1014 & 0x7F) == 0x40 && (var15.field1015 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field237; var16++) {
							JMUIRIHZ var17 = field236[field238[var16]];
							if (var17 != null && var17.field853.field1409 == 1 && var15.field1014 == var17.field1014 && var15.field1015 == var17.field1015) {
								method138(var17.field853, var5, var4, field238[var16]);
							}
						}

						for (int var18 = 0; var18 < field392; var18++) {
							CHKMTWJC var19 = field391[field393[var18]];
							if (var19 != null && var15 != var19 && var15.field1014 == var19.field1014 && var15.field1015 == var19.field1015) {
								method144(var5, field393[var18], var19, var4);
							}
						}
					}

					method144(var5, var7, var15, var4);
				}

				if (var6 == 3) {
					ZWZXPJNQ var20 = field560[field545][var4][var5];
					if (var20 != null) {
						for (YLPPYQUD var21 = (YLPPYQUD) var20.method601(); var21 != null; var21 = (YLPPYQUD) var20.method603()) {
							PICYKCUA var22 = PICYKCUA.method418(var21.field1492);
							if (field360 == 1) {
								field546[field526] = "Use " + field364 + " with @lre@" + var22.field1127;
								field206[field526] = 62;
								field207[field526] = var21.field1492;
								field204[field526] = var4;
								field205[field526] = var5;
								field526++;
							} else if (field385 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1114 != null && var22.field1114[var23] != null) {
										field546[field526] = var22.field1114[var23] + " @lre@" + var22.field1127;

										if (var23 == 0) {
											field206[field526] = 184;
										}

										if (var23 == 1) {
											field206[field526] = 81;
										}

										if (var23 == 2) {
											field206[field526] = 98;
										}

										if (var23 == 3) {
											field206[field526] = 275;
										}

										if (var23 == 4) {
											field206[field526] = 689;
										}

										field207[field526] = var21.field1492;
										field204[field526] = var4;
										field205[field526] = var5;
										field526++;
									} else if (var23 == 2) {
										field546[field526] = "Take @lre@" + var22.field1127;
										field206[field526] = 98;
										field207[field526] = var21.field1492;
										field204[field526] = var4;
										field205[field526] = var5;
										field526++;
									}
								}

								field546[field526] = "Examine @lre@" + var22.field1127;
								field206[field526] = 1184;
								field207[field526] = var21.field1492;
								field204[field526] = var4;
								field205[field526] = var5;
								field526++;
							} else if ((field387 & 0x1) == 1) {
								field546[field526] = field388 + " @lre@" + var22.field1127;
								field206[field526] = 538;
								field207[field526] = var21.field1492;
								field204[field526] = var4;
								field205[field526] = var5;
								field526++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method206(String arg0) throws IOException {
		if (field180) {
			if (field490 != null) {
				try {
					field490.close();
				} catch (Exception var4) {
				}

				field490 = null;
			}

			field490 = method175(43595);
			field490.setSoTimeout(10000);
			InputStream var2 = field490.getInputStream();
			OutputStream var3 = field490.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.c(IZI)V")
	public final void method207(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a()V")
	public final void method208() {
		method142(20, "Starting up");

		if (signlink.sunjava) {
			field636 = 5;
		}

		if (field267) {
			field268 = true;
		} else {
			field267 = true;
			boolean var1 = false;
			String var2 = method88();
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
						field286[var3] = new RRDZGTNX(var3 + 1, signlink.cache_dat, signlink.cache_idx[var3], 500000);
					}
				}

				try {
					method196();
					field159 = method162("title", field524[1], 1, 25, "title screen");
					field304 = new SSVSGKGT("p11_full", false, field159);
					field305 = new SSVSGKGT("p12_full", false, field159);
					field306 = new SSVSGKGT("b12_full", false, field159);
					field307 = new SSVSGKGT("q8_full", true, field159);
					method198();
					method193();
					GWOEELWB var4 = method162("config", field524[2], 2, 30, "config");
					GWOEELWB var5 = method162("interface", field524[3], 3, 35, "interface");
					GWOEELWB var6 = method162("media", field524[4], 4, 40, "2d graphics");
					GWOEELWB var7 = method162("textures", field524[6], 6, 45, "textures");
					GWOEELWB var8 = method162("wordenc", field524[7], 7, 50, "chat system");
					GWOEELWB var9 = method162("sounds", field524[8], 8, 55, "sound effects");
					field287 = new byte[4][104][104];
					field233 = new int[4][105][105];
					field351 = new TAWLWNCF(4, 104, field233, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field498[var10] = new OTPPFNKL(104, 104);
					}

					field444 = new SWNASVGQ(512, 512);
					GWOEELWB var11 = method162("versionlist", field524[5], 5, 60, "update list");
					method142(60, "Connecting to update server");
					field225 = new FJSXIAWX();
					field225.method233(var11, this);
					DFGNFGZH.method211(field225.method236());
					CADBNSXE.method8(field225.method239(0), field225);

					if (!field319) {
						field160 = 0;
						field161 = true;
						field225.method237(2, field160);

						while (field225.method225() > 0) {
							method137();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field225.field677 > 3) {
								method180("ondemand");
								return;
							}
						}
					}

					method142(65, "Requesting animations");
					int var12 = field225.method239(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field225.method237(1, var13);
					}

					while (field225.method225() > 0) {
						int var14 = var12 - field225.method225();
						if (var14 > 0) {
							method142(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method137();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field225.field677 > 3) {
							method180("ondemand");
							return;
						}
					}

					method142(70, "Requesting models");
					int var15 = field225.method239(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field225.method234(var16);
						if ((var17 & 0x1) != 0) {
							field225.method237(0, var16);
						}
					}

					int var18 = field225.method225();
					while (field225.method225() > 0) {
						int var19 = var18 - field225.method225();
						if (var19 > 0) {
							method142(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method137();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field286[0] != null) {
						method142(75, "Requesting maps");
						field225.method237(3, field225.method235(48, 47, 0));
						field225.method237(3, field225.method235(48, 47, 1));
						field225.method237(3, field225.method235(48, 48, 0));
						field225.method237(3, field225.method235(48, 48, 1));
						field225.method237(3, field225.method235(48, 49, 0));
						field225.method237(3, field225.method235(48, 49, 1));
						field225.method237(3, field225.method235(47, 47, 0));
						field225.method237(3, field225.method235(47, 47, 1));
						field225.method237(3, field225.method235(47, 48, 0));
						field225.method237(3, field225.method235(47, 48, 1));
						field225.method237(3, field225.method235(148, 48, 0));
						field225.method237(3, field225.method235(148, 48, 1));
						int var20 = field225.method225();
						while (field225.method225() > 0) {
							int var21 = var20 - field225.method225();
							if (var21 > 0) {
								method142(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method137();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field225.method239(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field225.method234(var23);
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
							field225.method227(0, var23, var25);
						}
					}

					field225.method232(field318);

					if (!field319) {
						int var26 = field225.method239(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field225.method240(var27)) {
								field225.method227(2, var27, (byte) 1);
							}
						}
					}

					method142(80, "Unpacking media");
					field250 = new NUXLZYAZ(var6, "invback", 0);
					field252 = new NUXLZYAZ(var6, "chatback", 0);
					field251 = new NUXLZYAZ(var6, "mapback", 0);
					field356 = new NUXLZYAZ(var6, "backbase1", 0);
					field357 = new NUXLZYAZ(var6, "backbase2", 0);
					field358 = new NUXLZYAZ(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field430[var28] = new NUXLZYAZ(var6, "sideicons", var28);
					}

					field573 = new SWNASVGQ(var6, "compass", 0);
					field134 = new SWNASVGQ(var6, "mapedge", 0);
					field134.method471();

					for (int var29 = 0; var29 < 72; var29++) {
						field164[var29] = new NUXLZYAZ(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field200[var30] = new SWNASVGQ(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field136[var31] = new SWNASVGQ(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field341[var32] = new SWNASVGQ(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field217[var33] = new SWNASVGQ(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field273[var34] = new SWNASVGQ(var6, "headicons_hint", var34);
					}

					field538 = new SWNASVGQ(var6, "overlay_multiway", 0);
					field281 = new SWNASVGQ(var6, "mapmarker", 0);
					field282 = new SWNASVGQ(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field422[var35] = new SWNASVGQ(var6, "cross", var35);
					}

					field512 = new SWNASVGQ(var6, "mapdots", 0);
					field513 = new SWNASVGQ(var6, "mapdots", 1);
					field514 = new SWNASVGQ(var6, "mapdots", 2);
					field515 = new SWNASVGQ(var6, "mapdots", 3);
					field516 = new SWNASVGQ(var6, "mapdots", 4);
					field495 = new NUXLZYAZ(var6, "scrollbar", 0);
					field496 = new NUXLZYAZ(var6, "scrollbar", 1);
					field149 = new NUXLZYAZ(var6, "redstone1", 0);
					field150 = new NUXLZYAZ(var6, "redstone2", 0);
					field151 = new NUXLZYAZ(var6, "redstone3", 0);
					field152 = new NUXLZYAZ(var6, "redstone1", 0);
					field152.method344();
					field153 = new NUXLZYAZ(var6, "redstone2", 0);
					field153.method344();
					field368 = new NUXLZYAZ(var6, "redstone1", 0);
					field368.method345();
					field369 = new NUXLZYAZ(var6, "redstone2", 0);
					field369.method345();
					field370 = new NUXLZYAZ(var6, "redstone3", 0);
					field370.method345();
					field371 = new NUXLZYAZ(var6, "redstone1", 0);
					field371.method344();
					field371.method345();
					field372 = new NUXLZYAZ(var6, "redstone2", 0);
					field372.method344();
					field372.method345();

					for (int var36 = 0; var36 < 2; var36++) {
						field266[var36] = new NUXLZYAZ(var6, "mod_icons", var36);
					}

					SWNASVGQ var37 = new SWNASVGQ(var6, "backleft1", 0);
					field253 = new WOKQCNXG(var37.field1246, var37.field1247, method122());
					var37.method472(0, 0);
					SWNASVGQ var38 = new SWNASVGQ(var6, "backleft2", 0);
					field254 = new WOKQCNXG(var38.field1246, var38.field1247, method122());
					var38.method472(0, 0);
					SWNASVGQ var39 = new SWNASVGQ(var6, "backright1", 0);
					field255 = new WOKQCNXG(var39.field1246, var39.field1247, method122());
					var39.method472(0, 0);
					SWNASVGQ var40 = new SWNASVGQ(var6, "backright2", 0);
					field256 = new WOKQCNXG(var40.field1246, var40.field1247, method122());
					var40.method472(0, 0);
					SWNASVGQ var41 = new SWNASVGQ(var6, "backtop1", 0);
					field257 = new WOKQCNXG(var41.field1246, var41.field1247, method122());
					var41.method472(0, 0);
					SWNASVGQ var42 = new SWNASVGQ(var6, "backvmid1", 0);
					field258 = new WOKQCNXG(var42.field1246, var42.field1247, method122());
					var42.method472(0, 0);
					SWNASVGQ var43 = new SWNASVGQ(var6, "backvmid2", 0);
					field259 = new WOKQCNXG(var43.field1246, var43.field1247, method122());
					var43.method472(0, 0);
					SWNASVGQ var44 = new SWNASVGQ(var6, "backvmid3", 0);
					field260 = new WOKQCNXG(var44.field1246, var44.field1247, method122());
					var44.method472(0, 0);
					SWNASVGQ var45 = new SWNASVGQ(var6, "backhmid2", 0);
					field261 = new WOKQCNXG(var45.field1246, var45.field1247, method122());
					var45.method472(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field200[var50] != null) {
							field200[var50].method470(var48 + var49, var47 + var49, var46 + var49);
						}

						if (field164[var50] != null) {
							field164[var50].method346(var48 + var49, var47 + var49, var46 + var49);
						}
					}

					method142(83, "Unpacking textures");
					PNDCOEKM.method424(var7);
					PNDCOEKM.method428(0.8D);
					PNDCOEKM.method423(20);
					method142(86, "Unpacking config");
					UVDKTGZK.method561(var4);
					LYSBQDHB.method274(var4);
					SXDNVMNH.method482(var4);
					PICYKCUA.method417(var4);
					VWKJSKWX.method573(var4);
					NQIAMATB.method336(var4);
					XWNROHZR.method587(var4);
					KTJKDKKM.method267(var4);
					WOJPETNO.method576(var4);
					PICYKCUA.field1093 = field318;

					if (!field319) {
						method142(90, "Unpacking sounds");
						byte[] var51 = var9.method249("sounds.dat", null);
						MLYYHULT var52 = new MLYYHULT(var51);
						BSYFPVLV.method1(var52);
					}

					method142(95, "Unpacking interfaces");
					SSVSGKGT[] var53 = new SSVSGKGT[] { field304, field305, field306, field307 };
					HWEMRKQZ.method255(var6, var53, var5);
					method142(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field251.field988[field251.field990 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field218[var54] = var55;
						field489[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field251.field988[field251.field990 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field404[var58 - 5] = var59 - 25;
						field280[var58 - 5] = var60 - var59;
					}

					PNDCOEKM.method421(503, 765);
					field571 = PNDCOEKM.field1141;
					PNDCOEKM.method421(96, 479);
					field568 = PNDCOEKM.field1141;
					PNDCOEKM.method421(261, 190);
					field569 = PNDCOEKM.field1141;
					PNDCOEKM.method421(334, 512);
					field570 = PNDCOEKM.field1141;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = PNDCOEKM.field1139[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					TAWLWNCF.method523(800, 334, 500, 512, var62);
					PBBEXDRS.method368(var8);
					field407 = new YBAERVYW(this);
					method131(field407, 10);
					DROEXFTE.field623 = this;
					LYSBQDHB.field910 = this;
					VWKJSKWX.field1397 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field335 + " " + field552);
					field283 = true;
				}
			} else {
				field249 = true;
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method209() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(ZILMLYYHULT;)V")
	public final void method210(int arg0, MLYYHULT arg1) {
		while (arg1.field964 + 21 < arg0 * 8) {
			int var3 = arg1.method307(14);
			if (var3 == 16383) {
				break;
			}

			if (field236[var3] == null) {
				field236[var3] = new JMUIRIHZ();
			}

			JMUIRIHZ var4 = field236[var3];
			field238[field237++] = var3;
			var4.field1028 = field449;
			int var5 = arg1.method307(1);
			var4.field853 = VWKJSKWX.method574(arg1.method307(13));
			int var6 = arg1.method307(1);
			if (var6 == 1) {
				field395[field394++] = var3;
			}

			int var7 = arg1.method307(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method307(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1007 = var4.field853.field1409;
			var4.field1002 = var4.field853.field1404;
			var4.field1021 = var4.field853.field1385;
			var4.field1022 = var4.field853.field1402;
			var4.field1023 = var4.field853.field1394;
			var4.field1024 = var4.field853.field1408;
			var4.field1011 = var4.field853.field1407;
			var4.method352(field447.field1003[0] + var8, field447.field1004[0] + var7, var5 == 1);
		}

		arg1.method308();
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field137[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field144[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
