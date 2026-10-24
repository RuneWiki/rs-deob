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
public final class client extends MUZNSFEY {

	@ObfuscatedName("client.J")
	public int[] field166 = new int[50];

	@ObfuscatedName("client.K")
	public boolean field167 = false;

	@ObfuscatedName("client.L")
	public int[] field168 = new int[9];

	@ObfuscatedName("client.M")
	public JDSNLLMP field169 = new JDSNLLMP();

	@ObfuscatedName("client.P")
	public YLURZVWU field171 = new YLURZVWU();

	@ObfuscatedName("client.Q")
	public long[] field172 = new long[200];

	@ObfuscatedName("client.R")
	public int field173 = 0x332D25;

	@ObfuscatedName("client.S")
	public boolean field174 = false;

	@ObfuscatedName("client.T")
	public DZSIRBWX[] field175 = new DZSIRBWX[100];

	@ObfuscatedName("client.V")
	public int[] field176 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.W")
	public final int[] field177 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ab")
	public boolean field181 = false;

	@ObfuscatedName("client.cb")
	public YOXDZEVD field182 = YOXDZEVD.method537(1);

	@ObfuscatedName("client.gb")
	public String field184 = "";

	@ObfuscatedName("client.hb")
	public String field185 = "";

	@ObfuscatedName("client.ib")
	public boolean field186 = false;

	@ObfuscatedName("client.nb")
	public int field191 = -1;

	@ObfuscatedName("client.ob")
	public int[] field192 = new int[2000];

	@ObfuscatedName("client.zb")
	public int[] field201 = new int[151];

	@ObfuscatedName("client.Eb")
	public LEBPILPF[] field206 = new LEBPILPF[5];

	@ObfuscatedName("client.Jb")
	public YOXDZEVD field210 = YOXDZEVD.method537(1);

	@ObfuscatedName("client.Ub")
	public int[] field220 = new int[4000];

	@ObfuscatedName("client.Vb")
	public int[] field221 = new int[4000];

	@ObfuscatedName("client.Xb")
	public boolean field222 = true;

	@ObfuscatedName("client.Yb")
	public boolean field223 = true;

	@ObfuscatedName("client.dc")
	public DZSIRBWX[] field228 = new DZSIRBWX[2];

	@ObfuscatedName("client.ic")
	public int field233 = 1;

	@ObfuscatedName("client.kc")
	public final int field234 = 100;

	@ObfuscatedName("client.lc")
	public int[] field235 = new int[100];

	@ObfuscatedName("client.rc")
	public boolean[] field241 = new boolean[5];

	@ObfuscatedName("client.sc")
	public DYPVESKW[] field242 = new DYPVESKW[20];

	@ObfuscatedName("client.uc")
	public YOXDZEVD field244 = new YOXDZEVD(new byte[5000]);

	@ObfuscatedName("client.vc")
	public CMGLYFCQ[] field245 = new CMGLYFCQ[16384];

	@ObfuscatedName("client.xc")
	public int[] field247 = new int[16384];

	@ObfuscatedName("client.yc")
	public int field248 = -1;

	@ObfuscatedName("client.Ac")
	public int field250 = -1;

	@ObfuscatedName("client.Ec")
	public int field253 = -1;

	@ObfuscatedName("client.Ic")
	public DZSIRBWX[] field257 = new DZSIRBWX[13];

	@ObfuscatedName("client.Mc")
	public int[] field261 = new int[1000];

	@ObfuscatedName("client.Nc")
	public int[] field262 = new int[1000];

	@ObfuscatedName("client.Pc")
	public int[] field264 = new int[HASPTGBT.field719];

	@ObfuscatedName("client.Qc")
	public int field265 = 0x23201B;

	@ObfuscatedName("client.Tc")
	public int field267 = 78;

	@ObfuscatedName("client.kd")
	public boolean field283 = false;

	@ObfuscatedName("client.ld")
	public int[] field284 = new int[HASPTGBT.field719];

	@ObfuscatedName("client.Fd")
	public boolean field303 = true;

	@ObfuscatedName("client.Gd")
	public int field304 = 0x766654;

	@ObfuscatedName("client.Ld")
	public int[] field309 = new int[1000];

	@ObfuscatedName("client.Md")
	public boolean field310 = false;

	@ObfuscatedName("client.Nd")
	public int field311 = 0x4D4233;

	@ObfuscatedName("client.Rd")
	public boolean field315 = false;

	@ObfuscatedName("client.Ud")
	public volatile boolean field318 = false;

	@ObfuscatedName("client.Wd")
	public String[] field320 = new String[5];

	@ObfuscatedName("client.Xd")
	public boolean[] field321 = new boolean[5];

	@ObfuscatedName("client.Yd")
	public boolean field322 = true;

	@ObfuscatedName("client.ae")
	public int field324 = 2;

	@ObfuscatedName("client.fe")
	public int field329 = -1;

	@ObfuscatedName("client.ge")
	public int field330 = -1;

	@ObfuscatedName("client.he")
	public int[] field331 = new int[33];

	@ObfuscatedName("client.je")
	public YLURZVWU field332 = new YLURZVWU();

	@ObfuscatedName("client.le")
	public int[] field333 = new int[500];

	@ObfuscatedName("client.me")
	public int[] field334 = new int[500];

	@ObfuscatedName("client.ne")
	public int[] field335 = new int[500];

	@ObfuscatedName("client.oe")
	public int[] field336 = new int[500];

	@ObfuscatedName("client.pe")
	public DYPVESKW[] field337 = new DYPVESKW[8];

	@ObfuscatedName("client.se")
	public DYPVESKW[] field340 = new DYPVESKW[100];

	@ObfuscatedName("client.ue")
	public CRC32 field341 = new CRC32();

	@ObfuscatedName("client.we")
	public boolean field343 = false;

	@ObfuscatedName("client.Ge")
	public boolean field353 = false;

	@ObfuscatedName("client.Le")
	public int field356 = -1;

	@ObfuscatedName("client.Me")
	public GDVKBIIV[] field357 = new GDVKBIIV[4];

	@ObfuscatedName("client.Te")
	public int[] field363 = new int[5];

	@ObfuscatedName("client.Ue")
	public boolean field364 = false;

	@ObfuscatedName("client.We")
	public String field366 = "";

	@ObfuscatedName("client.Xe")
	public String field367 = "";

	@ObfuscatedName("client.af")
	public int[][] field369 = new int[104][104];

	@ObfuscatedName("client.bf")
	public int[] field370 = new int[256];

	@ObfuscatedName("client.hf")
	public boolean field376 = false;

	@ObfuscatedName("client.nf")
	public int[] field381 = new int[50];

	@ObfuscatedName("client.of")
	public int[] field382 = new int[HASPTGBT.field719];

	@ObfuscatedName("client.pf")
	public long[] field383 = new long[100];

	@ObfuscatedName("client.Ef")
	public boolean field397 = false;

	@ObfuscatedName("client.Ff")
	public int field398 = -1;

	@ObfuscatedName("client.Gf")
	public int[] field399 = new int[5];

	@ObfuscatedName("client.If")
	public int field401 = -1;

	@ObfuscatedName("client.Lf")
	public int field403 = 2;

	@ObfuscatedName("client.Uf")
	public int[][] field412 = new int[104][104];

	@ObfuscatedName("client.dg")
	public boolean field421 = true;

	@ObfuscatedName("client.eg")
	public boolean field422 = false;

	@ObfuscatedName("client.og")
	public int[] field431 = new int[200];

	@ObfuscatedName("client.pg")
	public boolean field432 = false;

	@ObfuscatedName("client.qg")
	public int field433 = -1;

	@ObfuscatedName("client.rg")
	public int[] field434 = new int[151];

	@ObfuscatedName("client.yg")
	public int field441 = 2048;

	@ObfuscatedName("client.zg")
	public int field442 = 2047;

	@ObfuscatedName("client.Ag")
	public AGFDLNBY[] field443 = new AGFDLNBY[field441];

	@ObfuscatedName("client.Cg")
	public int[] field445 = new int[field441];

	@ObfuscatedName("client.Eg")
	public int[] field447 = new int[field441];

	@ObfuscatedName("client.Fg")
	public YOXDZEVD[] field448 = new YOXDZEVD[field441];

	@ObfuscatedName("client.Gg")
	public int[] field449 = new int[50];

	@ObfuscatedName("client.Lg")
	public int field450 = -1;

	@ObfuscatedName("client.Wg")
	public int[] field461 = new int[100];

	@ObfuscatedName("client.Xg")
	public String[] field462 = new String[100];

	@ObfuscatedName("client.Yg")
	public String[] field463 = new String[100];

	@ObfuscatedName("client.fh")
	public YLURZVWU field469 = new YLURZVWU();

	@ObfuscatedName("client.nh")
	public volatile boolean field477 = false;

	@ObfuscatedName("client.ph")
	public int[] field479 = new int[5];

	@ObfuscatedName("client.rh")
	public int field481 = 2;

	@ObfuscatedName("client.th")
	public int field483 = 128;

	@ObfuscatedName("client.Gh")
	public int[] field492 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Hh")
	public boolean field493 = false;

	@ObfuscatedName("client.Sh")
	public String field503 = "";

	@ObfuscatedName("client.Wh")
	public boolean field506 = false;

	@ObfuscatedName("client.Yh")
	public YOXDZEVD field508 = YOXDZEVD.method537(1);

	@ObfuscatedName("client.bi")
	public int field511 = -1;

	@ObfuscatedName("client.fi")
	public int[][] field514 = new int[104][104];

	@ObfuscatedName("client.ri")
	public int field522 = -1;

	@ObfuscatedName("client.si")
	public int[][][] field523 = new int[4][13][13];

	@ObfuscatedName("client.vi")
	public String field526 = "";

	@ObfuscatedName("client.yi")
	public int[] field529 = new int[33];

	@ObfuscatedName("client.Ci")
	public DYPVESKW[] field533 = new DYPVESKW[20];

	@ObfuscatedName("client.Gi")
	public DYPVESKW[] field536 = new DYPVESKW[1000];

	@ObfuscatedName("client.Ii")
	public boolean field538 = false;

	@ObfuscatedName("client.Ji")
	public String[] field539 = new String[200];

	@ObfuscatedName("client.Li")
	public int[] field540 = new int[7];

	@ObfuscatedName("client.Qi")
	public boolean field544 = false;

	@ObfuscatedName("client.Ti")
	public int field547 = 1;

	@ObfuscatedName("client.Ui")
	public int field548 = -1;

	@ObfuscatedName("client.Vi")
	public boolean field549 = false;

	@ObfuscatedName("client.Xi")
	public String field551 = "";

	@ObfuscatedName("client.Yi")
	public String field552 = "";

	@ObfuscatedName("client.bj")
	public byte[] field555 = new byte[16384];

	@ObfuscatedName("client.cj")
	public YLURZVWU[][][] field556 = new YLURZVWU[4][104][104];

	@ObfuscatedName("client.dj")
	public String[] field557 = new String[500];

	@ObfuscatedName("client.hj")
	public boolean field560 = false;

	@ObfuscatedName("client.ij")
	public int[] field561 = new int[5];

	@ObfuscatedName("client.kj")
	public boolean field563 = false;

	@ObfuscatedName("client.mj")
	public String field565 = "";

	@ObfuscatedName("client.tj")
	public int[] field572 = new int[2000];

	@ObfuscatedName("client.uj")
	public int[] field573 = new int[5];

	@ObfuscatedName("client.xj")
	public boolean field576 = false;

	@ObfuscatedName("client.Aj")
	public int field579 = 50;

	@ObfuscatedName("client.Bj")
	public int[] field580 = new int[field579];

	@ObfuscatedName("client.Cj")
	public int[] field581 = new int[field579];

	@ObfuscatedName("client.Dj")
	public int[] field582 = new int[field579];

	@ObfuscatedName("client.Ej")
	public int[] field583 = new int[field579];

	@ObfuscatedName("client.Fj")
	public int[] field584 = new int[field579];

	@ObfuscatedName("client.Gj")
	public int[] field585 = new int[field579];

	@ObfuscatedName("client.Hj")
	public int[] field586 = new int[field579];

	@ObfuscatedName("client.Ij")
	public String[] field587 = new String[field579];

	@ObfuscatedName("client.Jj")
	public volatile boolean field588 = false;

	@ObfuscatedName("client.Lj")
	public int field590 = 3;

	@ObfuscatedName("client.Mb")
	public static int field212 = 10;

	@ObfuscatedName("client.Ob")
	public static boolean field214 = true;

	@ObfuscatedName("client.Oc")
	public static int[] field263 = new int[99];

	@ObfuscatedName("client.Td")
	public static BigInteger field317 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.rf")
	public static int[] field385 = new int[32];

	@ObfuscatedName("client.yh")
	public static final int[][] field488 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Uh")
	public static String field504 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Fi")
	public static final int[] field535 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.nj")
	public static BigInteger field566 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.O")
	public int field170;

	@ObfuscatedName("client.X")
	public int field178;

	@ObfuscatedName("client.Y")
	public static int field179;

	@ObfuscatedName("client.Z")
	public int field180;

	@ObfuscatedName("client.eb")
	public int field183;

	@ObfuscatedName("client.pb")
	public int field193;

	@ObfuscatedName("client.qb")
	public int field194;

	@ObfuscatedName("client.rb")
	public int field195;

	@ObfuscatedName("client.sb")
	public int field196;

	@ObfuscatedName("client.tb")
	public int field197;

	@ObfuscatedName("client.wb")
	public int field198;

	@ObfuscatedName("client.xb")
	public int field199;

	@ObfuscatedName("client.yb")
	public int field200;

	@ObfuscatedName("client.Fb")
	public static int field207;

	@ObfuscatedName("client.Gb")
	public int field208;

	@ObfuscatedName("client.Hb")
	public int field209;

	@ObfuscatedName("client.Kb")
	public int field211;

	@ObfuscatedName("client.Nb")
	public static int field213;

	@ObfuscatedName("client.Qb")
	public int field216;

	@ObfuscatedName("client.Rb")
	public int field217;

	@ObfuscatedName("client.Sb")
	public int field218;

	@ObfuscatedName("client.Tb")
	public int field219;

	@ObfuscatedName("client.Zb")
	public int field224;

	@ObfuscatedName("client.ac")
	public int field225;

	@ObfuscatedName("client.bc")
	public int field226;

	@ObfuscatedName("client.cc")
	public int field227;

	@ObfuscatedName("client.fc")
	public int field230;

	@ObfuscatedName("client.gc")
	public static int field231;

	@ObfuscatedName("client.hc")
	public int field232;

	@ObfuscatedName("client.mc")
	public int field236;

	@ObfuscatedName("client.nc")
	public int field237;

	@ObfuscatedName("client.oc")
	public int field238;

	@ObfuscatedName("client.pc")
	public int field239;

	@ObfuscatedName("client.qc")
	public int field240;

	@ObfuscatedName("client.tc")
	public int field243;

	@ObfuscatedName("client.wc")
	public int field246;

	@ObfuscatedName("client.zc")
	public int field249;

	@ObfuscatedName("client.Jc")
	public int field258;

	@ObfuscatedName("client.Kc")
	public int field259;

	@ObfuscatedName("client.Lc")
	public int field260;

	@ObfuscatedName("client.Sc")
	public static int field266;

	@ObfuscatedName("client.ed")
	public int field277;

	@ObfuscatedName("client.fd")
	public int field278;

	@ObfuscatedName("client.gd")
	public int field279;

	@ObfuscatedName("client.hd")
	public int field280;

	@ObfuscatedName("client.id")
	public int field281;

	@ObfuscatedName("client.jd")
	public int field282;

	@ObfuscatedName("client.md")
	public int field285;

	@ObfuscatedName("client.nd")
	public int field286;

	@ObfuscatedName("client.od")
	public int field287;

	@ObfuscatedName("client.pd")
	public int field288;

	@ObfuscatedName("client.vd")
	public int field294;

	@ObfuscatedName("client.wd")
	public int field295;

	@ObfuscatedName("client.xd")
	public int field296;

	@ObfuscatedName("client.yd")
	public int field297;

	@ObfuscatedName("client.Ad")
	public int field299;

	@ObfuscatedName("client.Bd")
	public int field300;

	@ObfuscatedName("client.Cd")
	public int field301;

	@ObfuscatedName("client.Ed")
	public int field302;

	@ObfuscatedName("client.Hd")
	public int field305;

	@ObfuscatedName("client.Id")
	public int field306;

	@ObfuscatedName("client.Jd")
	public int field307;

	@ObfuscatedName("client.Kd")
	public int field308;

	@ObfuscatedName("client.Od")
	public int field312;

	@ObfuscatedName("client.Pd")
	public int field313;

	@ObfuscatedName("client.Qd")
	public int field314;

	@ObfuscatedName("client.Sd")
	public static int field316;

	@ObfuscatedName("client.Vd")
	public static int field319;

	@ObfuscatedName("client.Zd")
	public int field323;

	@ObfuscatedName("client.be")
	public int field325;

	@ObfuscatedName("client.ee")
	public int field328;

	@ObfuscatedName("client.qe")
	public static int field338;

	@ObfuscatedName("client.ve")
	public int field342;

	@ObfuscatedName("client.ze")
	public int field346;

	@ObfuscatedName("client.Ae")
	public int field347;

	@ObfuscatedName("client.Be")
	public int field348;

	@ObfuscatedName("client.Ce")
	public int field349;

	@ObfuscatedName("client.De")
	public int field350;

	@ObfuscatedName("client.Ee")
	public int field351;

	@ObfuscatedName("client.Fe")
	public int field352;

	@ObfuscatedName("client.Ie")
	public int field354;

	@ObfuscatedName("client.Pe")
	public int field360;

	@ObfuscatedName("client.Qe")
	public int field361;

	@ObfuscatedName("client.Ve")
	public int field365;

	@ObfuscatedName("client.Ye")
	public static int field368;

	@ObfuscatedName("client.cf")
	public static int field371;

	@ObfuscatedName("client.lf")
	public int field379;

	@ObfuscatedName("client.mf")
	public int field380;

	@ObfuscatedName("client.qf")
	public int field384;

	@ObfuscatedName("client.sf")
	public int field386;

	@ObfuscatedName("client.uf")
	public int field387;

	@ObfuscatedName("client.Hf")
	public int field400;

	@ObfuscatedName("client.Kf")
	public int field402;

	@ObfuscatedName("client.Nf")
	public int field405;

	@ObfuscatedName("client.Of")
	public int field406;

	@ObfuscatedName("client.Pf")
	public int field407;

	@ObfuscatedName("client.Qf")
	public int field408;

	@ObfuscatedName("client.Rf")
	public int field409;

	@ObfuscatedName("client.Sf")
	public int field410;

	@ObfuscatedName("client.Tf")
	public int field411;

	@ObfuscatedName("client.Xf")
	public int field415;

	@ObfuscatedName("client.Yf")
	public int field416;

	@ObfuscatedName("client.Zf")
	public int field417;

	@ObfuscatedName("client.ag")
	public int field418;

	@ObfuscatedName("client.cg")
	public int field420;

	@ObfuscatedName("client.sg")
	public int field435;

	@ObfuscatedName("client.Bg")
	public int field444;

	@ObfuscatedName("client.Dg")
	public int field446;

	@ObfuscatedName("client.Mg")
	public int field451;

	@ObfuscatedName("client.Ng")
	public static int field452;

	@ObfuscatedName("client.Rg")
	public int field456;

	@ObfuscatedName("client.Sg")
	public int field457;

	@ObfuscatedName("client.Tg")
	public int field458;

	@ObfuscatedName("client.Ug")
	public int field459;

	@ObfuscatedName("client.Vg")
	public int field460;

	@ObfuscatedName("client.ah")
	public int field465;

	@ObfuscatedName("client.bh")
	public int field466;

	@ObfuscatedName("client.ch")
	public static int field467;

	@ObfuscatedName("client.dh")
	public int field468;

	@ObfuscatedName("client.gh")
	public int field470;

	@ObfuscatedName("client.hh")
	public int field471;

	@ObfuscatedName("client.ih")
	public int field472;

	@ObfuscatedName("client.jh")
	public int field473;

	@ObfuscatedName("client.kh")
	public int field474;

	@ObfuscatedName("client.lh")
	public int field475;

	@ObfuscatedName("client.qh")
	public int field480;

	@ObfuscatedName("client.uh")
	public int field484;

	@ObfuscatedName("client.vh")
	public int field485;

	@ObfuscatedName("client.wh")
	public int field486;

	@ObfuscatedName("client.xh")
	public int field487;

	@ObfuscatedName("client.zh")
	public int field489;

	@ObfuscatedName("client.Jh")
	public int field495;

	@ObfuscatedName("client.Kh")
	public int field496;

	@ObfuscatedName("client.Nh")
	public int field498;

	@ObfuscatedName("client.Oh")
	public static int field499;

	@ObfuscatedName("client.Ph")
	public int field500;

	@ObfuscatedName("client.Qh")
	public int field501;

	@ObfuscatedName("client.Rh")
	public int field502;

	@ObfuscatedName("client.Vh")
	public int field505;

	@ObfuscatedName("client.Xh")
	public int field507;

	@ObfuscatedName("client.Zh")
	public int field509;

	@ObfuscatedName("client.ai")
	public int field510;

	@ObfuscatedName("client.di")
	public int field513;

	@ObfuscatedName("client.gi")
	public int field515;

	@ObfuscatedName("client.ii")
	public static int field516;

	@ObfuscatedName("client.ki")
	public int field517;

	@ObfuscatedName("client.li")
	public int field518;

	@ObfuscatedName("client.Di")
	public int field534;

	@ObfuscatedName("client.Si")
	public int field546;

	@ObfuscatedName("client.Wi")
	public int field550;

	@ObfuscatedName("client.aj")
	public int field554;

	@ObfuscatedName("client.ej")
	public int field558;

	@ObfuscatedName("client.gj")
	public int field559;

	@ObfuscatedName("client.jj")
	public static int field562;

	@ObfuscatedName("client.lj")
	public static int field564;

	@ObfuscatedName("client.qj")
	public int field569;

	@ObfuscatedName("client.rj")
	public static int field570;

	@ObfuscatedName("client.sj")
	public int field571;

	@ObfuscatedName("client.yj")
	public int field577;

	@ObfuscatedName("client.zj")
	public int field578;

	@ObfuscatedName("client.Kj")
	public static int field589;

	@ObfuscatedName("client.xe")
	public long field344;

	@ObfuscatedName("client.kf")
	public long field378;

	@ObfuscatedName("client.oh")
	public long field478;

	@ObfuscatedName("client.sh")
	public long field482;

	@ObfuscatedName("client.ci")
	public long field512;

	@ObfuscatedName("client.Mf")
	public static AGFDLNBY field404;

	@ObfuscatedName("client.ec")
	public ANTLOSVZ field229;

	@ObfuscatedName("client.qd")
	public DYPVESKW field289;

	@ObfuscatedName("client.rd")
	public DYPVESKW field290;

	@ObfuscatedName("client.sd")
	public DYPVESKW field291;

	@ObfuscatedName("client.td")
	public DYPVESKW field292;

	@ObfuscatedName("client.ud")
	public DYPVESKW field293;

	@ObfuscatedName("client.Re")
	public DYPVESKW field362;

	@ObfuscatedName("client.Vf")
	public DYPVESKW field413;

	@ObfuscatedName("client.Wf")
	public DYPVESKW field414;

	@ObfuscatedName("client.ti")
	public DYPVESKW field524;

	@ObfuscatedName("client.ui")
	public DYPVESKW field525;

	@ObfuscatedName("client.Ri")
	public DYPVESKW field545;

	@ObfuscatedName("client.Zi")
	public DYPVESKW field553;

	@ObfuscatedName("client.oj")
	public DYPVESKW field567;

	@ObfuscatedName("client.pj")
	public DYPVESKW field568;

	@ObfuscatedName("client.Bc")
	public DZSIRBWX field251;

	@ObfuscatedName("client.Cc")
	public DZSIRBWX field252;

	@ObfuscatedName("client.gg")
	public DZSIRBWX field423;

	@ObfuscatedName("client.hg")
	public DZSIRBWX field424;

	@ObfuscatedName("client.ig")
	public DZSIRBWX field425;

	@ObfuscatedName("client.jg")
	public DZSIRBWX field426;

	@ObfuscatedName("client.kg")
	public DZSIRBWX field427;

	@ObfuscatedName("client.tg")
	public DZSIRBWX field436;

	@ObfuscatedName("client.ug")
	public DZSIRBWX field437;

	@ObfuscatedName("client.vg")
	public DZSIRBWX field438;

	@ObfuscatedName("client.wg")
	public DZSIRBWX field439;

	@ObfuscatedName("client.xg")
	public DZSIRBWX field440;

	@ObfuscatedName("client.oi")
	public DZSIRBWX field519;

	@ObfuscatedName("client.pi")
	public DZSIRBWX field520;

	@ObfuscatedName("client.qi")
	public DZSIRBWX field521;

	@ObfuscatedName("client.Ai")
	public DZSIRBWX field531;

	@ObfuscatedName("client.Bi")
	public DZSIRBWX field532;

	@ObfuscatedName("client.Mi")
	public DZSIRBWX field541;

	@ObfuscatedName("client.Ni")
	public DZSIRBWX field542;

	@ObfuscatedName("client.Oi")
	public DZSIRBWX field543;

	@ObfuscatedName("client.Ab")
	public OIDSBDUP field202;

	@ObfuscatedName("client.Bb")
	public OIDSBDUP field203;

	@ObfuscatedName("client.Cb")
	public OIDSBDUP field204;

	@ObfuscatedName("client.Db")
	public OIDSBDUP field205;

	@ObfuscatedName("client.Fc")
	public OIDSBDUP field254;

	@ObfuscatedName("client.Gc")
	public OIDSBDUP field255;

	@ObfuscatedName("client.Hc")
	public OIDSBDUP field256;

	@ObfuscatedName("client.Uc")
	public OIDSBDUP field268;

	@ObfuscatedName("client.Vc")
	public OIDSBDUP field269;

	@ObfuscatedName("client.Wc")
	public OIDSBDUP field270;

	@ObfuscatedName("client.Xc")
	public OIDSBDUP field271;

	@ObfuscatedName("client.Yc")
	public OIDSBDUP field272;

	@ObfuscatedName("client.Zc")
	public OIDSBDUP field273;

	@ObfuscatedName("client.ad")
	public OIDSBDUP field274;

	@ObfuscatedName("client.bd")
	public OIDSBDUP field275;

	@ObfuscatedName("client.cd")
	public OIDSBDUP field276;

	@ObfuscatedName("client.vf")
	public OIDSBDUP field388;

	@ObfuscatedName("client.wf")
	public OIDSBDUP field389;

	@ObfuscatedName("client.xf")
	public OIDSBDUP field390;

	@ObfuscatedName("client.yf")
	public OIDSBDUP field391;

	@ObfuscatedName("client.zf")
	public OIDSBDUP field392;

	@ObfuscatedName("client.Af")
	public OIDSBDUP field393;

	@ObfuscatedName("client.Bf")
	public OIDSBDUP field394;

	@ObfuscatedName("client.Cf")
	public OIDSBDUP field395;

	@ObfuscatedName("client.Df")
	public OIDSBDUP field396;

	@ObfuscatedName("client.de")
	public OTSGNSQM field327;

	@ObfuscatedName("client.Hi")
	public POKVNZOV field537;

	@ObfuscatedName("client.df")
	public RXCVCUUO field372;

	@ObfuscatedName("client.ef")
	public RXCVCUUO field373;

	@ObfuscatedName("client.ff")
	public RXCVCUUO field374;

	@ObfuscatedName("client.gf")
	public RXCVCUUO field375;

	@ObfuscatedName("client.Dh")
	public SFXLZPAR field491;

	@ObfuscatedName("client.mh")
	public UUFZOKXH field476;

	@ObfuscatedName("client.zi")
	public VNYQVBWD field530;

	@ObfuscatedName("client.zd")
	public String field298;

	@ObfuscatedName("client.jf")
	public String field377;

	@ObfuscatedName("client.bg")
	public String field419;

	@ObfuscatedName("client.Zg")
	public String field464;

	@ObfuscatedName("client.Mh")
	public Socket field497;

	@ObfuscatedName("client.Pb")
	public static boolean field215;

	@ObfuscatedName("client.ce")
	public static boolean field326;

	@ObfuscatedName("client.re")
	public static boolean field339;

	@ObfuscatedName("client.Je")
	public static boolean field355;

	@ObfuscatedName("client.jb")
	public int[] field187;

	@ObfuscatedName("client.kb")
	public int[] field188;

	@ObfuscatedName("client.lb")
	public int[] field189;

	@ObfuscatedName("client.mb")
	public int[] field190;

	@ObfuscatedName("client.Ne")
	public int[] field358;

	@ObfuscatedName("client.Oe")
	public int[] field359;

	@ObfuscatedName("client.lg")
	public int[] field428;

	@ObfuscatedName("client.mg")
	public int[] field429;

	@ObfuscatedName("client.ng")
	public int[] field430;

	@ObfuscatedName("client.Og")
	public int[] field453;

	@ObfuscatedName("client.Pg")
	public int[] field454;

	@ObfuscatedName("client.Qg")
	public int[] field455;

	@ObfuscatedName("client.wi")
	public int[] field527;

	@ObfuscatedName("client.xi")
	public int[] field528;

	@ObfuscatedName("client.vj")
	public DZSIRBWX[] field574;

	@ObfuscatedName("client.Ch")
	public byte[][] field490;

	@ObfuscatedName("client.Ih")
	public byte[][] field494;

	@ObfuscatedName("client.wj")
	public byte[][][] field575;

	@ObfuscatedName("client.ye")
	public int[][][] field345;

	@ObfuscatedName("client.f(I)V")
	public static final void method25() {
		VNYQVBWD.field1199 = true;
		LLQSXMOX.field839 = true;
		field215 = true;
		MBPQTDOR.field863 = true;
		SHDUUMNW.field1120 = true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public final boolean method26(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field465; var2++) {
			if (arg0.equalsIgnoreCase(field539[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field404.field11)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method27() {
		field506 = true;
	}

	@ObfuscatedName("client.g(I)V")
	public final void method28() {
		if (field243 != 0) {
			RXCVCUUO var1 = field373;
			int var2 = 0;
			if (field258 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field463[var3] != null) {
					int var4 = field461[var3];
					String var5 = field462[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field554 == 0 || field554 == 1 && method26(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method386(var8, "From", 0, var7);
						var1.method386(var8, "From", 0xFFFF, var7 - 1);
						int var11 = var8 + var1.method384("From ");
						if (var6 == 1) {
							field228[0].method192(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field228[1].method192(var7 - 12, var11);
							var11 += 14;
						}

						var1.method386(var11, var5 + ": " + field463[var3], 0, var7);
						var1.method386(var11, var5 + ": " + field463[var3], 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field554 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method386(4, field463[var3], 0, var9);
						var1.method386(4, field463[var3], 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field554 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method386(4, "To " + var5 + ": " + field463[var3], 0, var10);
						var1.method386(4, "To " + var5 + ": " + field463[var3], 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method29() {
		field496 = 0;
		int var1 = (field404.field1370 >> 7) + field224;
		int var2 = (field404.field1371 >> 7) + field225;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field496 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field496 = 1;
		}

		if (field496 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field496 = 0;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method30() {
		if (field258 > 1) {
			field258--;
		}

		if (field197 > 0) {
			field197--;
		}

		for (int var1 = 0; var1 < 5 && method66(); var1++) {
		}

		if (field560) {
			synchronized (field229.field114) {
				if (!field326) {
					field229.field113 = 0;
				} else if (field909 != 0 || field229.field113 >= 40) {
					field210.method538(203);
					field210.method539(0);
					int var3 = field210.field1393;
					int var4 = 0;
					for (int var5 = 0; var5 < field229.field113 && var3 - field210.field1393 < 240; var5++) {
						var4++;
						int var6 = field229.field112[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field229.field115[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field229.field112[var5] == -1 && field229.field115[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field379 != var7 || field380 != var6) {
							int var9 = var7 - field379;
							field379 = var7;
							int var10 = var6 - field380;
							field380 = var6;

							if (field507 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field210.method540((field507 << 12) + (var9 << 6) + var10);
								field507 = 0;
							} else if (field507 < 8) {
								field210.method542((field507 << 19) + var8 + 0x800000);
								field507 = 0;
							} else {
								field210.method543((field507 << 19) + var8 - 0x40000000);
								field507 = 0;
							}
						} else if (field507 < 2047) {
							field507++;
						}
					}

					field210.method548(field210.field1393 - var3);

					if (var4 >= field229.field113) {
						field229.field113 = 0;
					} else {
						field229.field113 -= var4;
						for (int var11 = 0; var11 < field229.field113; var11++) {
							field229.field115[var11] = field229.field115[var4 + var11];
							field229.field112[var11] = field229.field112[var4 + var11];
						}
					}
				}
			}

			if (field909 != 0) {
				long var12 = (field912 - field378) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field378 = field912;
				int var14 = field911;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field910;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field909 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field210.method538(32);
				field210.method543((var17 << 19) + (var18 << 20) + var16);
			}

			if (field314 > 0) {
				field314--;
			}

			if (field913[1] == 1 || field913[2] == 1 || field913[3] == 1 || field913[4] == 1) {
				field315 = true;
			}

			if (field315 && field314 <= 0) {
				field314 = 20;
				field315 = false;
				field210.method538(106);
				field210.method573(field483);
				field210.method573(field484);
			}

			if (field900 && !field421) {
				field421 = true;
				field210.method538(49);
				field210.method539(1);
			}

			if (!field900 && field421) {
				field421 = false;
				field210.method538(49);
				field210.method539(0);
			}

			method143();
			method126();
			method131();
			field195++;
			if (field195 > 750) {
				method85();
			}

			method166();
			method32();
			method104();
			field301++;

			if (field219 != 0) {
				field218 += 20;
				if (field218 >= 400) {
					field219 = 0;
				}
			}

			if (field288 != 0) {
				field285++;
				if (field285 >= 15) {
					if (field288 == 2) {
						field174 = true;
					}

					if (field288 == 3) {
						field376 = true;
					}

					field288 = 0;
				}
			}

			if (field279 != 0) {
				field387++;

				if (field903 > field280 + 5 || field903 < field280 - 5 || field904 > field281 + 5 || field904 < field281 - 5) {
					field549 = true;
				}

				if (field902 == 0) {
					if (field279 == 2) {
						field174 = true;
					}

					if (field279 == 3) {
						field376 = true;
					}

					field279 = 0;

					if (field549 && field387 >= 5) {
						field411 = -1;
						method86();

						if (field411 == field277 && field410 != field278) {
							JDSNLLMP var19 = JDSNLLMP.field775[field277];
							byte var20 = 0;
							if (field513 == 1 && var19.field772 == 206) {
								var20 = 1;
							}

							if (var19.field760[field410] <= 0) {
								var20 = 0;
							}

							if (var19.field809) {
								int var21 = field278;
								int var22 = field410;
								var19.field760[var22] = var19.field760[var21];
								var19.field791[var22] = var19.field791[var21];
								var19.field760[var21] = -1;
								var19.field791[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field278;
								int var24 = field410;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method276(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method276(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method276(field278, field410);
							}

							field210.method538(251);
							field210.method575(field278);
							field210.method566(var20);
							field210.method574(field410);
							field210.method575(field277);
						}
					} else if ((field199 == 1 || method94(field198 - 1)) && field198 > 2) {
						method137();
					} else if (field198 > 0) {
						method82(field198 - 1);
					}

					field285 = 10;
					field909 = 0;
				}
			}

			if (VNYQVBWD.field1233 != -1) {
				int var25 = VNYQVBWD.field1233;
				int var26 = VNYQVBWD.field1234;
				boolean var27 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, true, 0, 0, 0, var26, var25);
				VNYQVBWD.field1233 = -1;

				if (var27) {
					field216 = field910;
					field217 = field911;
					field219 = 1;
					field218 = 0;
				}
			}

			if (field909 == 1 && field377 != null) {
				field377 = null;
				field376 = true;
				field909 = 0;
			}

			method101();
			method67();
			method136();
			method96();

			if (field902 == 1 || field909 == 1) {
				field384++;
			}

			if (field518 == 2) {
				method55();
			}

			if (field518 == 2 && field538) {
				method63();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field399[var28]++;
			}

			method102();
			field901++;
			if (field901 > 4500) {
				field197 = 250;
				field901 -= 500;
				field210.method538(204);
			}

			field501++;
			if (field501 > 500) {
				field501 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field480 += field481;
				}

				if ((var29 & 0x2) == 2) {
					field402 += field403;
				}

				if ((var29 & 0x4) == 4) {
					field546 += field547;
				}
			}

			if (field480 < -50) {
				field481 = 2;
			}

			if (field480 > 50) {
				field481 = -2;
			}

			if (field402 < -55) {
				field403 = 2;
			}

			if (field402 > 55) {
				field403 = -2;
			}

			if (field546 < -40) {
				field547 = 1;
			}

			if (field546 > 40) {
				field547 = -1;
			}

			field505++;
			if (field505 > 500) {
				field505 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field323 += field324;
				}

				if ((var30 & 0x2) == 2) {
					field232 += field233;
				}
			}

			if (field323 < -60) {
				field324 = 2;
			}

			if (field323 > 60) {
				field324 = -2;
			}

			if (field232 < -20) {
				field233 = 1;
			}

			if (field232 > 10) {
				field233 = -1;
			}

			field196++;
			if (field196 > 50) {
				field210.method538(236);
			}

			try {
				if (field491 != null && field210.field1393 > 0) {
					field491.method401(field210.field1393, 0, field210.field1392);
					field210.field1393 = 0;
					field196 = 0;
				}
			} catch (IOException var32) {
				method85();
			} catch (Exception var33) {
				method120();
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method31() {
		if (field198 >= 2 || field294 != 0 || field416 != 0) {
			String var1;
			if (field294 == 1 && field198 < 2) {
				var1 = "Use " + field298 + " with...";
			} else if (field416 == 1 && field198 < 2) {
				var1 = field419 + "...";
			} else {
				var1 = field557[field198 - 1];
			}

			if (field198 > 2) {
				var1 = var1 + "@whi@ / " + (field198 - 2) + " more options";
			}

			field374.method391(15, true, 0xFFFFFF, var1, 4, field316 / 1000);
		}
	}

	public final void run() {
		if (field318) {
			method145();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method32() {
		field564++;
		if (field564 > 105) {
			field564 = 0;
			field210.method538(199);
			field210.method539(253);
		}

		for (int var1 = 0; var1 < field246; var1++) {
			int var2 = field247[var1];
			CMGLYFCQ var3 = field245[var2];
			if (var3 != null) {
				method33(var3.field591.field671, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILYOWFBYTG;)V")
	public final void method33(int arg0, YOWFBYTG arg1) {
		if (arg1.field1370 < 128 || arg1.field1371 < 128 || arg1.field1370 >= 13184 || arg1.field1371 >= 13184) {
			arg1.field1376 = -1;
			arg1.field1381 = -1;
			arg1.field1355 = 0;
			arg1.field1356 = 0;
			arg1.field1370 = arg1.field1360[0] * 128 + arg1.field1349 * 64;
			arg1.field1371 = arg1.field1361[0] * 128 + arg1.field1349 * 64;
			arg1.method535();
		}

		if (field404 == arg1 && (arg1.field1370 < 1536 || arg1.field1371 < 1536 || arg1.field1370 >= 11776 || arg1.field1371 >= 11776)) {
			arg1.field1376 = -1;
			arg1.field1381 = -1;
			arg1.field1355 = 0;
			arg1.field1356 = 0;
			arg1.field1370 = arg1.field1360[0] * 128 + arg1.field1349 * 64;
			arg1.field1371 = arg1.field1361[0] * 128 + arg1.field1349 * 64;
			arg1.method535();
		}

		if (arg1.field1355 > field316) {
			method34(arg1);
		} else if (arg1.field1356 >= field316) {
			method35(arg1);
		} else {
			method36(arg1);
		}

		method37(arg1);
		method38(arg1);
	}

	@ObfuscatedName("client.a(ZLYOWFBYTG;)V")
	public final void method34(YOWFBYTG arg0) {
		int var2 = arg0.field1355 - field316;
		int var3 = arg0.field1351 * 128 + arg0.field1349 * 64;
		int var4 = arg0.field1353 * 128 + arg0.field1349 * 64;
		arg0.field1370 += (var3 - arg0.field1370) / var2;
		arg0.field1371 += (var4 - arg0.field1371) / var2;
		arg0.field1389 = 0;

		if (arg0.field1357 == 0) {
			arg0.field1363 = 1024;
		}

		if (arg0.field1357 == 1) {
			arg0.field1363 = 1536;
		}

		if (arg0.field1357 == 2) {
			arg0.field1363 = 0;
		}

		if (arg0.field1357 == 3) {
			arg0.field1363 = 512;
		}
	}

	@ObfuscatedName("client.a(ILYOWFBYTG;)V")
	public final void method35(YOWFBYTG arg0) {
		if (field316 == arg0.field1356 || arg0.field1376 == -1 || arg0.field1379 != 0 || arg0.field1378 + 1 > CGWBYVFN.field150[arg0.field1376].method23(arg0.field1377)) {
			int var2 = arg0.field1356 - arg0.field1355;
			int var3 = field316 - arg0.field1355;
			int var4 = arg0.field1351 * 128 + arg0.field1349 * 64;
			int var5 = arg0.field1353 * 128 + arg0.field1349 * 64;
			int var6 = arg0.field1352 * 128 + arg0.field1349 * 64;
			int var7 = arg0.field1354 * 128 + arg0.field1349 * 64;
			arg0.field1370 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1371 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1389 = 0;

		if (arg0.field1357 == 0) {
			arg0.field1363 = 1024;
		}

		if (arg0.field1357 == 1) {
			arg0.field1363 = 1536;
		}

		if (arg0.field1357 == 2) {
			arg0.field1363 = 0;
		}

		if (arg0.field1357 == 3) {
			arg0.field1363 = 512;
		}

		arg0.field1372 = arg0.field1363;
	}

	@ObfuscatedName("client.a(LYOWFBYTG;Z)V")
	public final void method36(YOWFBYTG arg0) {
		arg0.field1373 = arg0.field1387;
		if (arg0.field1364 == 0) {
			arg0.field1389 = 0;
		} else {
			if (arg0.field1376 != -1 && arg0.field1379 == 0) {
				CGWBYVFN var2 = CGWBYVFN.field150[arg0.field1376];
				if (arg0.field1341 > 0 && var2.field162 == 0) {
					arg0.field1389++;
					return;
				}

				if (arg0.field1341 <= 0 && var2.field163 == 0) {
					arg0.field1389++;
					return;
				}
			}

			int var3 = arg0.field1370;
			int var4 = arg0.field1371;
			int var5 = arg0.field1360[arg0.field1364 - 1] * 128 + arg0.field1349 * 64;
			int var6 = arg0.field1361[arg0.field1364 - 1] * 128 + arg0.field1349 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1363 = 1280;
					} else if (var4 > var6) {
						arg0.field1363 = 1792;
					} else {
						arg0.field1363 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1363 = 768;
					} else if (var4 > var6) {
						arg0.field1363 = 256;
					} else {
						arg0.field1363 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1363 = 1024;
				} else {
					arg0.field1363 = 0;
				}

				int var7 = arg0.field1363 - arg0.field1372 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1367;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1366;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1369;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1368;
				}

				if (var8 == -1) {
					var8 = arg0.field1366;
				}

				arg0.field1373 = var8;
				int var9 = 4;
				if (arg0.field1372 != arg0.field1363 && arg0.field1391 == -1 && arg0.field1362 != 0) {
					var9 = 2;
				}

				if (arg0.field1364 > 2) {
					var9 = 6;
				}

				if (arg0.field1364 > 3) {
					var9 = 8;
				}

				if (arg0.field1389 > 0 && arg0.field1364 > 1) {
					var9 = 8;
					arg0.field1389--;
				}

				if (arg0.field1390[arg0.field1364 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1373 == arg0.field1366 && arg0.field1358 != -1) {
					arg0.field1373 = arg0.field1358;
				}

				if (var3 < var5) {
					arg0.field1370 += var9;
					if (arg0.field1370 > var5) {
						arg0.field1370 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1370 -= var9;
					if (arg0.field1370 < var5) {
						arg0.field1370 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1371 += var9;
					if (arg0.field1371 > var6) {
						arg0.field1371 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1371 -= var9;
					if (arg0.field1371 < var6) {
						arg0.field1371 = var6;
					}
				}

				if (arg0.field1370 == var5 && arg0.field1371 == var6) {
					arg0.field1364--;

					if (arg0.field1341 > 0) {
						arg0.field1341--;
						return;
					}
				}
			} else {
				arg0.field1370 = var5;
				arg0.field1371 = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LYOWFBYTG;I)V")
	public final void method37(YOWFBYTG arg0) {
		if (arg0.field1362 != 0) {
			if (arg0.field1391 != -1 && arg0.field1391 < 32768) {
				CMGLYFCQ var2 = field245[arg0.field1391];
				if (var2 != null) {
					int var3 = arg0.field1370 - var2.field1370;
					int var4 = arg0.field1371 - var2.field1371;
					if (var3 != 0 || var4 != 0) {
						arg0.field1363 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1391 >= 32768) {
				int var5 = arg0.field1391 - 32768;
				if (field253 == var5) {
					var5 = field442;
				}

				AGFDLNBY var6 = field443[var5];
				if (var6 != null) {
					int var7 = arg0.field1370 - var6.field1370;
					int var8 = arg0.field1371 - var6.field1371;
					if (var7 != 0 || var8 != 0) {
						arg0.field1363 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1343 != 0 || arg0.field1344 != 0) && (arg0.field1364 == 0 || arg0.field1389 > 0)) {
				int var9 = arg0.field1370 - (arg0.field1343 - field224 - field224) * 64;
				int var10 = arg0.field1371 - (arg0.field1344 - field225 - field225) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1363 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1343 = 0;
				arg0.field1344 = 0;
			}

			int var11 = arg0.field1363 - arg0.field1372 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1362 || var11 > 2048 - arg0.field1362) {
					arg0.field1372 = arg0.field1363;
				} else if (var11 > 1024) {
					arg0.field1372 -= arg0.field1362;
				} else {
					arg0.field1372 += arg0.field1362;
				}

				arg0.field1372 &= 0x7FF;
				if (arg0.field1387 == arg0.field1373 && arg0.field1372 != arg0.field1363) {
					if (arg0.field1388 != -1) {
						arg0.field1373 = arg0.field1388;
						return;
					}

					arg0.field1373 = arg0.field1366;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LYOWFBYTG;B)V")
	public final void method38(YOWFBYTG arg0) {
		arg0.field1337 = false;

		if (arg0.field1373 != -1) {
			CGWBYVFN var2 = CGWBYVFN.field150[arg0.field1373];
			arg0.field1375++;
			if (arg0.field1374 < var2.field151 && arg0.field1375 > var2.method23(arg0.field1374)) {
				arg0.field1375 = 0;
				arg0.field1374++;
			}

			if (arg0.field1374 >= var2.field151) {
				arg0.field1375 = 0;
				arg0.field1374 = 0;
			}
		}

		if (arg0.field1381 != -1 && field316 >= arg0.field1384) {
			if (arg0.field1382 < 0) {
				arg0.field1382 = 0;
			}

			CGWBYVFN var3 = IDQQUVDL.field738[arg0.field1381].field742;
			arg0.field1383++;
			while (arg0.field1382 < var3.field151 && arg0.field1383 > var3.method23(arg0.field1382)) {
				arg0.field1383 -= var3.method23(arg0.field1382);
				arg0.field1382++;
			}

			if (arg0.field1382 >= var3.field151 && (arg0.field1382 < 0 || arg0.field1382 >= var3.field151)) {
				arg0.field1381 = -1;
			}
		}

		if (arg0.field1376 != -1 && arg0.field1379 <= 1) {
			CGWBYVFN var4 = CGWBYVFN.field150[arg0.field1376];
			if (var4.field162 == 1 && arg0.field1341 > 0 && arg0.field1355 <= field316 && arg0.field1356 < field316) {
				arg0.field1379 = 1;
				return;
			}
		}

		if (arg0.field1376 != -1 && arg0.field1379 == 0) {
			CGWBYVFN var5 = CGWBYVFN.field150[arg0.field1376];
			arg0.field1378++;
			while (arg0.field1377 < var5.field151 && arg0.field1378 > var5.method23(arg0.field1377)) {
				arg0.field1378 -= var5.method23(arg0.field1377);
				arg0.field1377++;
			}

			if (arg0.field1377 >= var5.field151) {
				arg0.field1377 -= var5.field155;
				arg0.field1380++;
				if (arg0.field1380 >= var5.field161) {
					arg0.field1376 = -1;
				}

				if (arg0.field1377 < 0 || arg0.field1377 >= var5.field151) {
					arg0.field1376 = -1;
				}
			}

			arg0.field1337 = var5.field157;
		}

		if (arg0.field1379 > 0) {
			arg0.field1379--;
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method39() {
		if (field506) {
			field506 = false;
			field388.method373(4, field895, 0);
			field389.method373(357, field895, 0);
			field390.method373(4, field895, 722);
			field391.method373(205, field895, 743);
			field392.method373(0, field895, 0);
			field393.method373(4, field895, 516);
			field394.method373(205, field895, 516);
			field395.method373(357, field895, 496);
			field396.method373(338, field895, 0);
			field174 = true;
			field376 = true;
			field310 = true;
			field167 = true;

			if (field518 != 2) {
				field204.method373(4, field895, 4);
				field203.method373(4, field895, 550);
			}
		}

		if (field518 == 2) {
			method149();
		}

		if (field353 && field236 == 1) {
			field174 = true;
		}

		if (field398 != -1) {
			boolean var1 = method42(field301, field398);
			if (var1) {
				field174 = true;
			}
		}

		if (field288 == 2) {
			field174 = true;
		}

		if (field279 == 2) {
			field174 = true;
		}

		if (field174) {
			method52();
			field174 = false;
		}

		if (field548 == -1) {
			field169.field769 = field267 - field559 - 77;

			if (field903 > 448 && field903 < 560 && field904 > 332) {
				method103(0, field904 - 357, field267, false, field169, 463, 77, field903 - 17);
			}

			int var2 = field267 - field169.field769 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field267 - 77) {
				var2 = field267 - 77;
			}

			if (field559 != var2) {
				field559 = var2;
				field376 = true;
			}

			field319++;
			if (field319 > 88) {
				field319 = 0;
				field210.method538(8);
			}
		}

		if (field548 != -1) {
			boolean var3 = method42(field301, field548);
			if (var3) {
				field376 = true;
			}
		}

		if (field288 == 3) {
			field376 = true;
		}

		if (field279 == 3) {
			field376 = true;
		}

		if (field377 != null) {
			field376 = true;
		}

		if (field353 && field236 == 2) {
			field376 = true;
		}

		if (field376) {
			method160();
			field376 = false;
		}

		if (field518 == 2) {
			method106();
			field203.method373(4, field895, 550);
		}

		if (field356 != -1) {
			field310 = true;
		}

		if (field310) {
			if (field356 != -1 && field590 == field356) {
				field356 = -1;
				field210.method538(139);
				field210.method539(field590);
			}

			field310 = false;
			field256.method372();
			field521.method192(0, 0);

			if (field398 == -1) {
				if (field492[field590] != -1) {
					if (field590 == 0) {
						field423.method192(10, 22);
					}

					if (field590 == 1) {
						field424.method192(8, 54);
					}

					if (field590 == 2) {
						field424.method192(8, 82);
					}

					if (field590 == 3) {
						field425.method192(8, 110);
					}

					if (field590 == 4) {
						field427.method192(8, 153);
					}

					if (field590 == 5) {
						field427.method192(8, 181);
					}

					if (field590 == 6) {
						field426.method192(9, 209);
					}
				}

				if (field492[0] != -1 && (field356 != 0 || field316 % 20 < 10)) {
					field257[0].method192(13, 29);
				}

				if (field492[1] != -1 && (field356 != 1 || field316 % 20 < 10)) {
					field257[1].method192(11, 53);
				}

				if (field492[2] != -1 && (field356 != 2 || field316 % 20 < 10)) {
					field257[2].method192(11, 82);
				}

				if (field492[3] != -1 && (field356 != 3 || field316 % 20 < 10)) {
					field257[3].method192(12, 115);
				}

				if (field492[4] != -1 && (field356 != 4 || field316 % 20 < 10)) {
					field257[4].method192(13, 153);
				}

				if (field492[5] != -1 && (field356 != 5 || field316 % 20 < 10)) {
					field257[5].method192(11, 180);
				}

				if (field492[6] != -1 && (field356 != 6 || field316 % 20 < 10)) {
					field257[6].method192(13, 208);
				}
			}

			field256.method373(160, field895, 516);
			field255.method372();
			field520.method192(0, 0);

			if (field398 == -1) {
				if (field492[field590] != -1) {
					if (field590 == 7) {
						field436.method192(0, 42);
					}

					if (field590 == 8) {
						field437.method192(0, 74);
					}

					if (field590 == 9) {
						field437.method192(0, 102);
					}

					if (field590 == 10) {
						field438.method192(1, 130);
					}

					if (field590 == 11) {
						field440.method192(0, 173);
					}

					if (field590 == 12) {
						field440.method192(0, 201);
					}

					if (field590 == 13) {
						field439.method192(0, 229);
					}
				}

				if (field492[8] != -1 && (field356 != 8 || field316 % 20 < 10)) {
					field257[7].method192(2, 74);
				}

				if (field492[9] != -1 && (field356 != 9 || field316 % 20 < 10)) {
					field257[8].method192(3, 102);
				}

				if (field492[10] != -1 && (field356 != 10 || field316 % 20 < 10)) {
					field257[9].method192(4, 137);
				}

				if (field492[11] != -1 && (field356 != 11 || field316 % 20 < 10)) {
					field257[10].method192(2, 174);
				}

				if (field492[12] != -1 && (field356 != 12 || field316 % 20 < 10)) {
					field257[11].method192(2, 201);
				}

				if (field492[13] != -1 && (field356 != 13 || field316 % 20 < 10)) {
					field257[12].method192(2, 226);
				}
			}

			field255.method373(466, field895, 496);
			field204.method372();
		}

		if (field167) {
			field167 = false;
			field254.method372();
			field519.method192(0, 0);
			field373.method383(28, 0xFFFFFF, 55, true, "Public chat");

			if (field569 == 0) {
				field373.method383(41, 0xFF00, 55, true, "On");
			}

			if (field569 == 1) {
				field373.method383(41, 0xFFFF00, 55, true, "Friends");
			}

			if (field569 == 2) {
				field373.method383(41, 0xFF0000, 55, true, "Off");
			}

			if (field569 == 3) {
				field373.method383(41, 0xFFFF, 55, true, "Hide");
			}

			field373.method383(28, 0xFFFFFF, 184, true, "Private chat");

			if (field554 == 0) {
				field373.method383(41, 0xFF00, 184, true, "On");
			}

			if (field554 == 1) {
				field373.method383(41, 0xFFFF00, 184, true, "Friends");
			}

			if (field554 == 2) {
				field373.method383(41, 0xFF0000, 184, true, "Off");
			}

			field373.method383(28, 0xFFFFFF, 324, true, "Trade/compete");

			if (field328 == 0) {
				field373.method383(41, 0xFF00, 324, true, "On");
			}

			if (field328 == 1) {
				field373.method383(41, 0xFFFF00, 324, true, "Friends");
			}

			if (field328 == 2) {
				field373.method383(41, 0xFF0000, 324, true, "Off");
			}

			field373.method383(33, 0xFFFFFF, 458, true, "Report abuse");
			field254.method373(453, field895, 0);
			field204.method372();
		}

		field301 = 0;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method40() {
		if (!field432 && !field364 && !field493) {
			field316++;

			if (field560) {
				method30();
			} else {
				method53();
			}

			method138();
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method41() {
		for (HGWWWEIE var1 = (HGWWWEIE) field332.method528(); var1 != null; var1 = (HGWWWEIE) field332.method530()) {
			if (field451 != var1.field727 || var1.field725) {
				var1.method589();
			} else if (field316 >= var1.field724) {
				var1.method230(field301);

				if (var1.field725) {
					var1.method589();
				} else {
					field530.method468(var1.field729, false, var1.field730, var1.field728, -1, var1.field727, var1, 0, 60);
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 315);

			if (arg0.length == 5) {
				field212 = Integer.parseInt(arg0[0]);
				field213 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method25();
				} else if (arg0[2].equals("highmem")) {
					method127();
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
				var1.method333(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(III)Z")
	public final boolean method42(int arg0, int arg1) {
		boolean var3 = false;
		JDSNLLMP var4 = JDSNLLMP.field775[arg1];
		for (int var5 = 0; var5 < var4.field807.length && var4.field807[var5] != -1; var5++) {
			JDSNLLMP var6 = JDSNLLMP.field775[var4.field807[var5]];
			if (var6.field788 == 1) {
				var3 |= method42(arg0, var6.field764);
			}

			if (var6.field788 == 6 && (var6.field773 != -1 || var6.field774 != -1)) {
				boolean var7 = method87(var6);
				int var8;
				if (var7) {
					var8 = var6.field774;
				} else {
					var8 = var6.field773;
				}

				if (var8 != -1) {
					CGWBYVFN var9 = CGWBYVFN.field150[var8];
					var6.field799 += arg0;
					while (var6.field799 > var9.method23(var6.field814)) {
						var6.field799 -= var9.method23(var6.field814) + 1;
						var6.field814++;
						if (var6.field814 >= var9.field151) {
							var6.field814 -= var9.field155;
							if (var6.field814 < 0 || var6.field814 >= var9.field151) {
								var6.field814 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.d(Z)Z")
	public final boolean method43() {
		return signlink.wavereplay();
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field898 != null) {
				return new URL("http://127.0.0.1:" + (field213 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.k(I)V")
	public void method44() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field495);

		if (field476 != null) {
			System.out.println("Od-cycle:" + field476.field1162);
		}

		System.out.println("loop-cycle:" + field316);
		System.out.println("draw-cycle:" + field452);
		System.out.println("ptype:" + field194);
		System.out.println("psize:" + field193);

		if (field491 != null) {
			field491.method402();
		}

		field892 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method45() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field898 != null) {
			return field898;
		}

		return this;
	}

	@ObfuscatedName("client.c(B)V")
	public final void method46() {
		field397 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field540[var1] = -1;
			for (int var2 = 0; var2 < XAYNDIOJ.field1285; var2++) {
				if (!XAYNDIOJ.field1286[var2].field1292 && XAYNDIOJ.field1286[var2].field1287 == var1 + (field222 ? 0 : 7)) {
					field540[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIZIIIIII)Z")
	public final boolean method47(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field514[var14][var15] = 0;
				field369[var14][var15] = 99999999;
			}
		}

		int var16 = arg2;
		int var17 = arg1;
		field514[arg2][arg1] = 99;
		field369[arg2][arg1] = 0;
		byte var18 = 0;
		int var19 = 0;
		field220[var18] = arg2;
		int var35 = var18 + 1;
		field221[var18] = arg1;
		boolean var20 = false;
		int var21 = field220.length;
		int[][] var22 = field357[field451].field711;
		while (var35 != var19) {
			var16 = field220[var19];
			var17 = field221[var19];
			var19 = (var19 + 1) % var21;

			if (arg10 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}

			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && field357[field451].method224(arg8, arg9, var17, arg10, arg0 - 1, var16)) {
					var20 = true;
					break;
				}

				if (arg0 < 10 && field357[field451].method225(arg10, arg9, var17, arg0 - 1, arg8, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg4 != 0 && arg7 != 0 && field357[field451].method226(var16, arg3, arg10, arg4, var17, arg9, arg7)) {
				var20 = true;
				break;
			}

			int var23 = field369[var16][var17] + 1;
			if (var16 > 0 && field514[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field220[var35] = var16 - 1;
				field221[var35] = var17;
				var35 = (var35 + 1) % var21;
				field514[var16 - 1][var17] = 2;
				field369[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field514[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field220[var35] = var16 + 1;
				field221[var35] = var17;
				var35 = (var35 + 1) % var21;
				field514[var16 + 1][var17] = 8;
				field369[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field514[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field220[var35] = var16;
				field221[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field514[var16][var17 - 1] = 1;
				field369[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field514[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field220[var35] = var16;
				field221[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field514[var16][var17 + 1] = 4;
				field369[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field514[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field220[var35] = var16 - 1;
				field221[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field514[var16 - 1][var17 - 1] = 3;
				field369[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field514[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field220[var35] = var16 + 1;
				field221[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field514[var16 + 1][var17 - 1] = 9;
				field369[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field514[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field220[var35] = var16 - 1;
				field221[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field514[var16 - 1][var17 + 1] = 6;
				field369[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field514[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field220[var35] = var16 + 1;
				field221[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field514[var16 + 1][var17 + 1] = 12;
				field369[var16 + 1][var17 + 1] = var23;
			}
		}

		field170 = 0;
		if (!var20) {
			if (arg5) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg10 - var25; var26 <= arg10 + var25; var26++) {
						for (int var27 = arg9 - var25; var27 <= arg9 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field369[var26][var27] < var24) {
								var24 = field369[var26][var27];
								var16 = var26;
								var17 = var27;
								field170 = 1;
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
		field220[var28] = var16;
		int var36 = var28 + 1;
		field221[var28] = var17;
		int var29;
		int var30 = var29 = field514[var16][var17];
		while (arg2 != var16 || arg1 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field220[var36] = var16;
				field221[var36++] = var17;
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

			var30 = field514[var16][var17];
		}

		if (var36 <= 0) {
			if (arg6 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field220[var36];
		int var33 = field221[var36];

		if (arg6 == 0) {
			field210.method538(61);
			field210.method539(var31 + var31 + 3);
		}

		if (arg6 == 1) {
			field210.method538(220);
			field210.method539(var31 + var31 + 3 + 14);
		}

		if (arg6 == 2) {
			field210.method538(21);
			field210.method539(var31 + var31 + 3);
		}

		field210.method540(field224 + var32);
		field210.method567(field913[5] == 1 ? 1 : 0);
		field360 = field220[0];
		field361 = field221[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field210.method567(field220[var36] - var32);
			field210.method539(field221[var36] - var33);
		}

		field210.method540(field225 + var33);
		return true;
	}

	@ObfuscatedName("client.a(IZILDYPVESKW;)V")
	public final void method48(int arg0, int arg1, DYPVESKW arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field484 + field323 & 0x7FF;
			int var6 = OIBEFFXI.field1016[var5];
			int var7 = OIBEFFXI.field1017[var5];
			var6 = var6 * 256 / (field232 + 256);
			var7 = var7 * 256 / (field232 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field545.method184(20, 20, 15, 15, 256, 83 - var13 - 20, var12 + 94 + 4 - 10, var10);
		} else {
			method83(arg1, arg0, arg2);
		}
	}

	public final void init() {
		field212 = Integer.parseInt(getParameter("nodeid"));
		field213 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method25();
		} else {
			method127();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field214 = false;
		} else {
			field214 = true;
		}

		method334(765, 503);
	}

	@ObfuscatedName("client.l(I)V")
	public final void method49() {
		Graphics var1 = method45().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method336(1);

		if (field364) {
			field477 = false;
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

		if (field493) {
			field477 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field432) {
			field477 = false;
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

	@ObfuscatedName("client.a(IBLYOXDZEVD;)V")
	public final void method50(int arg0, YOXDZEVD arg1) {
		if (arg0 == 89) {
			int var3 = arg1.method549();
			int var4 = (var3 >> 4 & 0x7) + field299;
			int var5 = (var3 & 0x7) + field300;
			int var6 = arg1.method551();
			int var7 = arg1.method551();
			int var8 = arg1.method551();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				YLURZVWU var9 = field556[field451][var4][var5];
				if (var9 != null) {
					for (RWDQVUEN var10 = (RWDQVUEN) var9.method528(); var10 != null; var10 = (RWDQVUEN) var9.method530()) {
						if ((var6 & 0x7FFF) == var10.field1040 && var10.field1039 == var7) {
							var10.field1039 = var8;
							break;
						}
					}

					method99(var4, var5);
				}
			}
		} else {
			if (arg0 == 178) {
				int var11 = arg1.method549();
				int var12 = (var11 >> 4 & 0x7) + field299;
				int var13 = (var11 & 0x7) + field300;
				int var14 = arg1.method551();
				int var15 = arg1.method549();
				int var16 = var15 >> 4 & 0xF;
				int var17 = var15 & 0x7;
				if (field404.field1360[0] >= var12 - var16 && field404.field1360[0] <= var12 + var16 && field404.field1361[0] >= var13 - var16 && field404.field1361[0] <= var13 + var16 && field223 && !field215 && field354 < 50) {
					field166[field354] = var14;
					field381[field354] = var17;
					field449[field354] = DFQOFKQS.field603[var14];
					field354++;
				}
			}

			if (arg0 == 62) {
				int var18 = arg1.method549();
				int var19 = var18 >> 2;
				int var20 = var18 & 0x3;
				int var21 = field177[var19];
				byte var22 = arg1.method571();
				byte var23 = arg1.method572();
				int var24 = arg1.method576();
				int var25 = arg1.method549();
				int var26 = (var25 >> 4 & 0x7) + field299;
				int var27 = (var25 & 0x7) + field300;
				int var28 = arg1.method576();
				byte var29 = arg1.method550();
				int var30 = arg1.method576();
				byte var31 = arg1.method572();
				int var32 = arg1.method578();
				AGFDLNBY var33;
				if (field253 == var28) {
					var33 = field404;
				} else {
					var33 = field443[var28];
				}

				if (var33 != null) {
					SHDUUMNW var34 = SHDUUMNW.method410(var30);
					int var35 = field345[field451][var26][var27];
					int var36 = field345[field451][var26 + 1][var27];
					int var37 = field345[field451][var26 + 1][var27 + 1];
					int var38 = field345[field451][var26][var27 + 1];
					OIBEFFXI var39 = var34.method405(var19, var20, var35, var36, var37, var38, -1);
					if (var39 != null) {
						method154(var21, 0, field451, var27, var32 + 1, 0, var26, var24 + 1, -1);
						var33.field20 = field316 + var32;
						var33.field21 = field316 + var24;
						var33.field10 = var39;
						int var40 = var34.field1125;
						int var41 = var34.field1094;
						if (var20 == 1 || var20 == 3) {
							var40 = var34.field1094;
							var41 = var34.field1125;
						}

						var33.field7 = var26 * 128 + var40 * 64;
						var33.field9 = var27 * 128 + var41 * 64;
						var33.field8 = method81(var33.field9, field451, var33.field7);

						if (var22 > var31) {
							byte var42 = var22;
							var22 = var31;
							var31 = var42;
						}

						if (var29 > var23) {
							byte var43 = var29;
							var29 = var23;
							var23 = var43;
						}

						var33.field16 = var22 + var26;
						var33.field18 = var26 + var31;
						var33.field17 = var27 + var29;
						var33.field19 = var23 + var27;
					}
				}
			}

			if (arg0 == 235) {
				int var44 = arg1.method569();
				int var45 = (var44 >> 4 & 0x7) + field299;
				int var46 = (var44 & 0x7) + field300;
				int var47 = arg1.method549();
				int var48 = var47 >> 2;
				int var49 = var47 & 0x3;
				int var50 = field177[var48];
				if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
					method154(var50, var49, field451, var46, 0, var48, var45, -1, -1);
				}
			} else if (arg0 == 202) {
				int var51 = arg1.method551();
				int var52 = arg1.method569();
				int var53 = (var52 >> 4 & 0x7) + field299;
				int var54 = (var52 & 0x7) + field300;
				int var55 = arg1.method577();
				if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
					RWDQVUEN var56 = new RWDQVUEN();
					var56.field1040 = var55;
					var56.field1039 = var51;

					if (field556[field451][var53][var54] == null) {
						field556[field451][var53][var54] = new YLURZVWU();
					}

					field556[field451][var53][var54].method525(var56);
					method99(var53, var54);
				}
			} else if (arg0 == 69) {
				int var57 = arg1.method549();
				int var58 = (var57 >> 4 & 0x7) + field299;
				int var59 = (var57 & 0x7) + field300;
				int var60 = var58 + arg1.method550();
				int var61 = var59 + arg1.method550();
				int var62 = arg1.method552();
				int var63 = arg1.method551();
				int var64 = arg1.method549() * 4;
				int var65 = arg1.method549() * 4;
				int var66 = arg1.method551();
				int var67 = arg1.method551();
				int var68 = arg1.method549();
				int var69 = arg1.method549();
				if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104 && var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && var63 != 0xFFFF) {
					var58 = var58 * 128 + 64;
					var59 = var59 * 128 + 64;
					var60 = var60 * 128 + 64;
					var61 = var61 * 128 + 64;
					XCJHWHNQ var70 = new XCJHWHNQ(field316 + var67, field451, var58, var63, var62, var69, var68, var59, field316 + var66, var65, method81(var59, field451, var58) - var64);
					var70.method514(var61, field316 + var66, method81(var61, field451, var60) - var65, var60);
					field469.method525(var70);
				}
			} else if (arg0 == 37) {
				int var71 = arg1.method576();
				int var72 = arg1.method549();
				int var73 = (var72 >> 4 & 0x7) + field299;
				int var74 = (var72 & 0x7) + field300;
				int var75 = arg1.method570();
				int var76 = var75 >> 2;
				int var77 = var75 & 0x3;
				int var78 = field177[var76];
				if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
					method154(var78, var77, field451, var74, 0, var76, var73, -1, var71);
				}
			} else if (arg0 == 97) {
				int var79 = arg1.method549();
				int var80 = var79 >> 2;
				int var81 = var79 & 0x3;
				int var82 = field177[var80];
				int var83 = arg1.method578();
				int var84 = arg1.method570();
				int var85 = (var84 >> 4 & 0x7) + field299;
				int var86 = (var84 & 0x7) + field300;
				if (var85 >= 0 && var86 >= 0 && var85 < 103 && var86 < 103) {
					int var87 = field345[field451][var85][var86];
					int var88 = field345[field451][var85 + 1][var86];
					int var89 = field345[field451][var85 + 1][var86 + 1];
					int var90 = field345[field451][var85][var86 + 1];
					if (var82 == 0) {
						UKCYVFXM var91 = field530.method479(var86, var85, field451);
						if (var91 != null) {
							int var92 = var91.field1149 >> 14 & 0x7FFF;
							if (var80 == 2) {
								var91.field1147 = new CAXQGHNZ(var81 + 4, var89, 2, false, var83, var92, var87, var88, var90);
								var91.field1148 = new CAXQGHNZ(var81 + 1 & 0x3, var89, 2, false, var83, var92, var87, var88, var90);
							} else {
								var91.field1147 = new CAXQGHNZ(var81, var89, var80, false, var83, var92, var87, var88, var90);
							}
						}
					}

					if (var82 == 1) {
						DRSWFNUH var93 = field530.method480(field451, var85, var86);
						if (var93 != null) {
							var93.field614 = new CAXQGHNZ(0, var89, 4, false, var83, var93.field615 >> 14 & 0x7FFF, var87, var88, var90);
						}
					}

					if (var82 == 2) {
						NLBRDXKI var94 = field530.method481(var86, var85, field451);

						if (var80 == 11) {
							var80 = 10;
						}

						if (var94 != null) {
							var94.field926 = new CAXQGHNZ(var81, var89, var80, false, var83, var94.field934 >> 14 & 0x7FFF, var87, var88, var90);
						}
					}

					if (var82 == 3) {
						HUYYVHFN var95 = field530.method482(field451, var85, var86);
						if (var95 != null) {
							var95.field734 = new CAXQGHNZ(var81, var89, 22, false, var83, var95.field735 >> 14 & 0x7FFF, var87, var88, var90);
						}
					}
				}
			} else if (arg0 == 213) {
				int var96 = arg1.method549();
				int var97 = (var96 >> 4 & 0x7) + field299;
				int var98 = (var96 & 0x7) + field300;
				int var99 = arg1.method551();
				int var100 = arg1.method549();
				int var101 = arg1.method551();
				if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
					var97 = var97 * 128 + 64;
					var98 = var98 * 128 + 64;
					HGWWWEIE var102 = new HGWWWEIE(method81(var98, field451, var97) - var100, field451, field316, var99, var98, var97, var101);
					field332.method525(var102);
				}
			} else if (arg0 == 17) {
				int var103 = arg1.method578();
				int var104 = arg1.method549();
				int var105 = (var104 >> 4 & 0x7) + field299;
				int var106 = (var104 & 0x7) + field300;
				int var107 = arg1.method577();
				int var108 = arg1.method551();
				if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && field253 != var107) {
					RWDQVUEN var109 = new RWDQVUEN();
					var109.field1040 = var103;
					var109.field1039 = var108;

					if (field556[field451][var105][var106] == null) {
						field556[field451][var105][var106] = new YLURZVWU();
					}

					field556[field451][var105][var106].method525(var109);
					method99(var105, var106);
				}
			} else if (arg0 == 61) {
				int var110 = arg1.method577();
				int var111 = arg1.method568();
				int var112 = (var111 >> 4 & 0x7) + field299;
				int var113 = (var111 & 0x7) + field300;
				if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
					YLURZVWU var114 = field556[field451][var112][var113];
					if (var114 != null) {
						for (RWDQVUEN var115 = (RWDQVUEN) var114.method528(); var115 != null; var115 = (RWDQVUEN) var114.method530()) {
							if ((var110 & 0x7FFF) == var115.field1040) {
								var115.method589();
								break;
							}
						}

						if (var114.method528() == null) {
							field556[field451][var112][var113] = null;
						}

						method99(var112, var113);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZIIII)V")
	public final void method51(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field531.method192(arg3, arg4);
		field532.method192(arg2 + arg3 - 16, arg4);
		KNERFXXY.method284(arg4, arg3 + 16, field265, arg2 - 32, 16);
		int var6 = (arg2 - 32) * arg2 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg2 - var6 - 32) * arg1 / (arg0 - arg2);
		KNERFXXY.method284(arg4, arg3 + var7 + 16, field311, var6, 16);
		KNERFXXY.method289(field304, arg4, var6, arg3 + var7 + 16);
		KNERFXXY.method289(field304, arg4 + 1, var6, arg3 + var7 + 16);
		KNERFXXY.method287(field304, arg4, arg3 + var7 + 16, 16);
		KNERFXXY.method287(field304, arg4, arg3 + var7 + 17, 16);
		KNERFXXY.method289(field173, arg4 + 15, var6, arg3 + var7 + 16);
		KNERFXXY.method289(field173, arg4 + 14, var6 - 1, arg3 + var7 + 17);
		KNERFXXY.method287(field173, arg4, arg3 + var7 + var6 + 15, 16);
		KNERFXXY.method287(field173, arg4 + 1, arg3 + 14 + var7 + var6, 15);
	}

	@ObfuscatedName("client.m(I)V")
	public final void method52() {
		field202.method372();
		LLQSXMOX.field850 = field454;
		field541.method192(0, 0);

		if (field398 != -1) {
			method78(0, JDSNLLMP.field775[field398], 0, 0);
		} else if (field492[field590] != -1) {
			method78(0, JDSNLLMP.field775[field492[field590]], 0, 0);
		}

		if (field353 && field236 == 1) {
			method69();
		}

		field202.method373(205, field895, 553);
		field204.method372();
		LLQSXMOX.field850 = field455;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method53() {
		if (field498 == 0) {
			int var1 = field893 / 2 - 80;
			int var2 = field894 / 2 + 20;
			var2 += 20;
			if (field909 == 1 && field910 >= var1 - 75 && field910 <= var1 + 75 && field911 >= var2 - 20 && field911 <= var2 + 20) {
				field498 = 3;
				field400 = 0;
			}

			int var3 = field893 / 2 + 80;
			if (field909 == 1 && field910 >= var3 - 75 && field910 <= var3 + 75 && field911 >= var2 - 20 && field911 <= var2 + 20) {
				field366 = "";
				field367 = "Enter your username & password.";
				field498 = 2;
				field400 = 0;
			}
		} else if (field498 == 2) {
			int var4 = field894 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field909 == 1 && field911 >= var4 - 15 && field911 < var4) {
				field400 = 0;
			}

			var4 += 15;
			if (field909 == 1 && field911 >= var4 - 15 && field911 < var4) {
				field400 = 1;
			}

			var4 += 15;
			int var5 = field893 / 2 - 80;
			int var6 = field894 / 2 + 50;
			var6 += 20;
			if (field909 == 1 && field910 >= var5 - 75 && field910 <= var5 + 75 && field911 >= var6 - 20 && field911 <= var6 + 20) {
				field515 = 0;
				method130(field184, field185, false);

				if (field560) {
					return;
				}
			}

			int var7 = field893 / 2 + 80;
			if (field909 == 1 && field910 >= var7 - 75 && field910 <= var7 + 75 && field911 >= var6 - 20 && field911 <= var6 + 20) {
				field498 = 0;
				field184 = "";
				field185 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method337();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field504.length(); var10++) {
					if (var8 == field504.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field400 == 0) {
					if (var8 == 8 && field184.length() > 0) {
						field184 = field184.substring(0, field184.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field400 = 1;
					}

					if (var9) {
						field184 = field184 + (char) var8;
					}

					if (field184.length() > 12) {
						field184 = field184.substring(0, 12);
					}
				} else if (field400 == 1) {
					if (var8 == 8 && field185.length() > 0) {
						field185 = field185.substring(0, field185.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field400 = 0;
					}

					if (var9) {
						field185 = field185 + (char) var8;
					}

					if (field185.length() > 20) {
						field185 = field185.substring(0, 20);
					}
				}
			}
		} else if (field498 == 3) {
			int var11 = field893 / 2;
			int var12 = field894 / 2 + 50;
			var12 += 20;
			if (field909 == 1 && field910 >= var11 - 75 && field910 <= var11 + 75 && field911 >= var12 - 20 && field911 <= var12 + 20) {
				field498 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method54(long arg0) {
		if (arg0 != 0L) {
			if (field465 >= 100 && field183 != 1) {
				method146(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field465 >= 200) {
				method146(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = FWDMWOLO.method213(FWDMWOLO.method210(arg0));
				for (int var4 = 0; var4 < field465; var4++) {
					if (field172[var4] == arg0) {
						method146(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field420; var5++) {
					if (field383[var5] == arg0) {
						method146(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field404.field11)) {
					field539[field465] = var3;
					field172[field465] = arg0;
					field431[field465] = 0;
					field465++;
					field174 = true;
					field210.method538(51);
					field210.method545(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method55() {
		try {
			int var1 = field404.field1370 + field480;
			int var2 = field404.field1371 + field402;
			if (field312 - var1 < -500 || field312 - var1 > 500 || field313 - var2 < -500 || field313 - var2 > 500) {
				field312 = var1;
				field313 = var2;
			}

			if (field312 != var1) {
				field312 += (var1 - field312) / 16;
			}

			if (field313 != var2) {
				field313 += (var2 - field313) / 16;
			}

			if (field913[1] == 1) {
				field485 += (-field485 - 24) / 2;
			} else if (field913[2] == 1) {
				field485 += (24 - field485) / 2;
			} else {
				field485 /= 2;
			}

			if (field913[3] == 1) {
				field486 += (12 - field486) / 2;
			} else if (field913[4] == 1) {
				field486 += (-field486 - 12) / 2;
			} else {
				field486 /= 2;
			}

			field484 = field485 / 2 + field484 & 0x7FF;
			field483 += field486 / 2;
			if (field483 < 128) {
				field483 = 128;
			}

			if (field483 > 383) {
				field483 = 383;
			}

			int var3 = field312 >> 7;
			int var4 = field313 >> 7;
			int var5 = method81(field313, field451, field312);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field451;
						if (var9 < 3 && (field575[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field345[var9][var7][var8];
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

			if (var11 > field571) {
				field571 += (var11 - field571) / 24;
			} else if (var11 < field571) {
				field571 += (var11 - field571) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field404.field1370 + "," + field404.field1371 + "," + field312 + "," + field313 + "," + field208 + "," + field209 + "," + field224 + "," + field225);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(ZLDZSIRBWX;)V")
	public final void method56(DZSIRBWX arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field358.length; var3++) {
			field358[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field358[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field359[var9] = (field358[var9 - 1] + field358[var9 + 1] + field358[var9 - 128] + field358[var9 + 128]) / 4;
				}
			}

			int[] var10 = field358;
			field358 = field359;
			field359 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field627; var12++) {
				for (int var13 = 0; var13 < arg0.field626; var13++) {
					if (arg0.field624[var11++] != 0) {
						int var14 = var13 + arg0.field628 + 16;
						int var15 = var12 + arg0.field629 + 16;
						int var16 = (var15 << 7) + var14;
						field358[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILYOXDZEVD;B)V")
	public final void method57(int arg0, YOXDZEVD arg1) {
		field308 = 0;
		field446 = 0;
		method90(arg1, arg0);
		method159(arg0, arg1);
		method129(arg0, arg1);
		method59(arg1, arg0);

		for (int var3 = 0; var3 < field308; var3++) {
			int var4 = field309[var3];
			if (field316 != field443[var4].field1365) {
				field443[var4] = null;
			}
		}

		if (arg1.field1393 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1393 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field444; var5++) {
			if (field443[field445[var5]] == null) {
				signlink.reporterror(field184 + " null entry in pl list - pos:" + var5 + " size:" + field444);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method58() {
		for (AIQUEQRG var1 = (AIQUEQRG) field171.method528(); var1 != null; var1 = (AIQUEQRG) field171.method530()) {
			if (var1.field109 == -1) {
				var1.field110 = 0;
				method162(var1);
			} else {
				var1.method589();
			}
		}
	}

	@ObfuscatedName("client.a(LYOXDZEVD;ZI)V")
	public final void method59(YOXDZEVD arg0, int arg1) {
		for (int var3 = 0; var3 < field446; var3++) {
			int var4 = field447[var3];
			AGFDLNBY var5 = field443[var4];
			int var6 = arg0.method549();
			if ((var6 & 0x40) != 0) {
				var6 += arg0.method549() << 8;
			}

			method117(arg0, var5, var4, var6);
		}
	}

	@ObfuscatedName("client.a(LYOXDZEVD;IB)V")
	public final void method60(YOXDZEVD arg0, int arg1) {
		while (arg0.field1394 + 21 < arg1 * 8) {
			int var3 = arg0.method560(14);
			if (var3 == 16383) {
				break;
			}

			if (field245[var3] == null) {
				field245[var3] = new CMGLYFCQ();
			}

			CMGLYFCQ var4 = field245[var3];
			field247[field246++] = var3;
			var4.field1365 = field316;
			int var5 = arg0.method560(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.method560(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.field591 = FKIKYVJJ.method202(arg0.method560(12));
			int var7 = arg0.method560(1);
			if (var7 == 1) {
				field447[field446++] = var3;
			}

			int var8 = arg0.method560(1);
			var4.field1349 = var4.field591.field671;
			var4.field1362 = var4.field591.field675;
			var4.field1366 = var4.field591.field678;
			var4.field1367 = var4.field591.field686;
			var4.field1368 = var4.field591.field664;
			var4.field1369 = var4.field591.field679;
			var4.field1387 = var4.field591.field661;
			var4.method533(field404.field1361[0] + var6, field404.field1360[0] + var5, var8 == 1);
		}

		arg0.method561();
	}

	@ObfuscatedName("client.a(BLJDSNLLMP;)V")
	public final void method61(JDSNLLMP arg0) {
		int var2 = arg0.field772;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field466 == 0) {
				arg0.field761 = "Loading friend list";
				arg0.field813 = 0;
			} else if (var2 == 1 && field466 == 1) {
				arg0.field761 = "Connecting to friendserver";
				arg0.field813 = 0;
			} else if (var2 == 2 && field466 != 2) {
				arg0.field761 = "Please wait...";
				arg0.field813 = 0;
			} else {
				int var3 = field465;
				if (field466 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field761 = "";
					arg0.field813 = 0;
				} else {
					arg0.field761 = field539[var2];
					arg0.field813 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field465;
			if (field466 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field761 = "";
				arg0.field813 = 0;
			} else {
				if (field431[var2] == 0) {
					arg0.field761 = "@red@Offline";
				} else if (field431[var2] == field212) {
					arg0.field761 = "@gre@World-" + (field431[var2] - 9);
				} else {
					arg0.field761 = "@yel@World-" + (field431[var2] - 9);
				}

				arg0.field813 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field465;
			if (field466 != 2) {
				var5 = 0;
			}

			arg0.field767 = var5 * 15 + 20;
			if (arg0.field767 <= arg0.field804) {
				arg0.field767 = arg0.field804 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field466 == 0) {
				arg0.field761 = "Loading ignore list";
				arg0.field813 = 0;
			} else if (var2 == 1 && field466 == 0) {
				arg0.field761 = "Please wait...";
				arg0.field813 = 0;
			} else {
				int var6 = field420;
				if (field466 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field761 = "";
					arg0.field813 = 0;
				} else {
					arg0.field761 = FWDMWOLO.method213(FWDMWOLO.method210(field383[var2]));
					arg0.field813 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field767 = field420 * 15 + 20;
			if (arg0.field767 <= arg0.field804) {
				arg0.field767 = arg0.field804 + 1;
			}
		} else if (var2 == 327) {
			arg0.field783 = 150;
			arg0.field784 = (int) (Math.sin(field316 / 40.0D) * 256.0D) & 0x7FF;

			if (field397) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field540[var7];
					if (var8 >= 0 && !XAYNDIOJ.field1286[var8].method510()) {
						return;
					}
				}

				field397 = false;
				OIBEFFXI[] var9 = new OIBEFFXI[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field540[var11];
					if (var12 >= 0) {
						var9[var10++] = XAYNDIOJ.field1286[var12].method511();
					}
				}

				OIBEFFXI var13 = new OIBEFFXI(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field479[var14] != 0) {
						var13.method360(field488[var14][0], field488[var14][field479[var14]]);

						if (var14 == 1) {
							var13.method360(field535[0], field535[field479[var14]]);
						}
					}
				}

				var13.method353();
				var13.method354(CGWBYVFN.field150[field404.field1387].field152[0]);
				var13.method363(64, 850, -30, -50, -30, true);
				arg0.field796 = 5;
				arg0.field797 = 0;
				JDSNLLMP.method273(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field567 == null) {
				field567 = arg0.field759;
				field568 = arg0.field789;
			}

			if (field222) {
				arg0.field759 = field568;
			} else {
				arg0.field759 = field567;
			}
		} else if (var2 == 325) {
			if (field567 == null) {
				field567 = arg0.field759;
				field568 = arg0.field789;
			}

			if (field222) {
				arg0.field759 = field567;
			} else {
				arg0.field759 = field568;
			}
		} else if (var2 == 600) {
			arg0.field761 = field526;
			if (field316 % 20 < 10) {
				arg0.field761 = arg0.field761 + "|";
			} else {
				arg0.field761 = arg0.field761 + " ";
			}
		} else if (var2 == 613) {
			if (field347 < 1) {
				arg0.field761 = "";
			} else if (field544) {
				arg0.field763 = 0xFF0000;
				arg0.field761 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field763 = 0xFFFFFF;
				arg0.field761 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field468 == 0) {
				arg0.field761 = "";
			} else {
				String var15;
				if (field200 == 0) {
					var15 = "earlier today";
				} else if (field200 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field200 + " days ago";
				}

				arg0.field761 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field178 == 0) {
				arg0.field761 = "0 unread messages";
				arg0.field763 = 0xFFFF00;
			}

			if (field178 == 1) {
				arg0.field761 = "1 unread message";
				arg0.field763 = 0xFF00;
			}

			if (field178 > 1) {
				arg0.field761 = field178 + " unread messages";
				arg0.field763 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field342 == 201) {
				if (field211 == 1) {
					arg0.field761 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field761 = "";
				}
			} else if (field342 == 200) {
				arg0.field761 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field342 == 0) {
					var16 = "Earlier today";
				} else if (field342 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field342 + " days ago";
				}

				arg0.field761 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field342 == 201) {
				if (field211 == 1) {
					arg0.field761 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field761 = "";
				}
			} else if (field342 == 200) {
				arg0.field761 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field761 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field342 == 201) {
				if (field211 == 1) {
					arg0.field761 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field761 = "";
				}
			} else if (field342 == 200) {
				arg0.field761 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field761 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.b(BLJDSNLLMP;)Z")
	public final boolean method62(JDSNLLMP arg0) {
		int var2 = arg0.field772;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field557[field198] = "Remove @whi@" + arg0.field761;
				field335[field198] = 799;
				field198++;
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

		field557[field198] = "Remove @whi@" + field539[var2];
		field335[field198] = 515;
		field198++;
		field557[field198] = "Message @whi@" + field539[var2];
		field335[field198] = 72;
		field198++;
		return true;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method63() {
		int var1 = field348 * 128 + 64;
		int var2 = field349 * 128 + 64;
		int var3 = method81(var2, field451, var1) - field350;

		if (field405 < var1) {
			field405 += (var1 - field405) * field352 / 1000 + field351;
			if (field405 > var1) {
				field405 = var1;
			}
		}

		if (field405 > var1) {
			field405 -= (field405 - var1) * field352 / 1000 + field351;
			if (field405 < var1) {
				field405 = var1;
			}
		}

		if (field406 < var3) {
			field406 += (var3 - field406) * field352 / 1000 + field351;
			if (field406 > var3) {
				field406 = var3;
			}
		}

		if (field406 > var3) {
			field406 -= (field406 - var3) * field352 / 1000 + field351;
			if (field406 < var3) {
				field406 = var3;
			}
		}

		if (field407 < var2) {
			field407 += (var2 - field407) * field352 / 1000 + field351;
			if (field407 > var2) {
				field407 = var2;
			}
		}

		if (field407 > var2) {
			field407 -= (field407 - var2) * field352 / 1000 + field351;
			if (field407 < var2) {
				field407 = var2;
			}
		}

		int var4 = field456 * 128 + 64;
		int var5 = field457 * 128 + 64;
		int var6 = method81(var5, field451, var4) - field458;
		int var7 = var4 - field405;
		int var8 = var6 - field406;
		int var9 = var5 - field407;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field408 < var11) {
			field408 += (var11 - field408) * field460 / 1000 + field459;
			if (field408 > var11) {
				field408 = var11;
			}
		}

		if (field408 > var11) {
			field408 -= (field408 - var11) * field460 / 1000 + field459;
			if (field408 < var11) {
				field408 = var11;
			}
		}

		int var13 = var12 - field409;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field409 += field460 * var13 / 1000 + field459;
			field409 &= 0x7FF;
		}

		if (var13 < 0) {
			field409 -= -var13 * field460 / 1000 + field459;
			field409 &= 0x7FF;
		}

		int var14 = var12 - field409;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field409 = var12;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method64() {
		if (field243 != 0) {
			int var1 = 0;
			if (field258 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field463[var2] != null) {
					int var3 = field461[var2];
					String var4 = field462[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field554 == 0 || field554 == 1 && method26(var4))) {
						int var8 = 329 - var1 * 13;
						if (field903 > 4 && field904 - 4 > var8 - 10 && field904 - 4 <= var8 + 3) {
							int var9 = field373.method384("From:  " + var4 + field463[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field903 < var9 + 4) {
								if (field347 >= 1) {
									field557[field198] = "Report abuse @whi@" + var4;
									field335[field198] = 2399;
									field198++;
								}

								field557[field198] = "Add ignore @whi@" + var4;
								field335[field198] = 2092;
								field198++;
								field557[field198] = "Add friend @whi@" + var4;
								field335[field198] = 2264;
								field198++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field554 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method65(int arg0, int arg1) {
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

	@ObfuscatedName("client.r(I)Z")
	public final boolean method66() {
		if (field491 == null) {
			return false;
		}

		try {
			int var1 = field491.method399();
			if (var1 == 0) {
				return false;
			}

			if (field194 == -1) {
				field491.method400(field508.field1392, 0, 1);
				field194 = field508.field1392[0] & 0xFF;
				if (field537 != null) {
					field194 = field194 - field537.method377() & 0xFF;
				}

				field193 = VVVPYTJQ.field1263[field194];
				var1--;
			}

			if (field193 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field491.method400(field508.field1392, 0, 1);
				field193 = field508.field1392[0] & 0xFF;
				var1--;
			}

			if (field193 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field491.method400(field508.field1392, 0, 2);
				field508.field1393 = 0;
				field193 = field508.method551();
				var1 -= 2;
			}

			if (var1 < field193) {
				return false;
			}

			field508.field1393 = 0;
			field491.method400(field508.field1392, 0, field193);
			field195 = 0;
			field307 = field306;
			field306 = field305;
			field305 = field194;

			if (field194 == 40) {
				int var2 = field508.method582();
				int var3 = field508.method576();
				field192[var3] = var2;

				if (field572[var3] != var2) {
					field572[var3] = var2;
					method124(var3);
					field174 = true;

					if (field450 != -1) {
						field376 = true;
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 53) {
				field174 = true;
				int var4 = field508.method551();
				JDSNLLMP var5 = JDSNLLMP.field775[var4];
				while (field508.field1393 < field193) {
					int var6 = field508.method563();
					int var7 = field508.method551();
					int var8 = field508.method549();
					if (var8 == 255) {
						var8 = field508.method554();
					}

					if (var6 >= 0 && var6 < var5.field760.length) {
						var5.field760[var6] = var7;
						var5.field791[var6] = var8;
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 183) {
				int var9 = field508.method579();
				if (var9 >= 0) {
					method157(var9);
				}

				field522 = var9;
				field194 = -1;
				return true;
			}

			if (field194 == 1) {
				int var10 = field508.method549();
				int var11 = field508.method576();
				if (var11 == 0xFFFF) {
					var11 = -1;
				}

				field492[var10] = var11;
				field174 = true;
				field310 = true;
				field194 = -1;
				return true;
			}

			if (field194 == 161) {
				int var12 = field508.method551();
				int var13 = field508.method578();
				int var14 = field508.method578();

				if (var13 == 0xFFFF) {
					JDSNLLMP.field775[var12].field796 = 0;
					field194 = -1;
					return true;
				}

				AIEFUHUQ var15 = AIEFUHUQ.method13(var13);
				JDSNLLMP.field775[var12].field796 = 4;
				JDSNLLMP.field775[var12].field797 = var13;
				JDSNLLMP.field775[var12].field783 = var15.field73;
				JDSNLLMP.field775[var12].field784 = var15.field66;
				JDSNLLMP.field775[var12].field782 = var15.field75 * 100 / var14;
				field194 = -1;
				return true;
			}

			if (field194 == 249) {
				field422 = false;
				field282 = 2;
				field503 = "";
				field376 = true;
				field194 = -1;
				return true;
			}

			if (field194 == 134) {
				int var16 = field508.method577();
				int var17 = field508.method576();
				int var18 = var16 >> 10 & 0x1F;
				int var19 = var16 >> 5 & 0x1F;
				int var20 = var16 & 0x1F;
				JDSNLLMP.field775[var17].field763 = (var20 << 3) + (var18 << 19) + (var19 << 11);
				field194 = -1;
				return true;
			}

			if (field194 == 120) {
				field420 = field193 / 8;
				for (int var21 = 0; var21 < field420; var21++) {
					field383[var21] = field508.method555();
				}

				field194 = -1;
				return true;
			}

			if (field194 == 234) {
				method57(field193, field508);
				field563 = false;
				field194 = -1;
				return true;
			}

			if (field194 == 15) {
				long var22 = field508.method555();
				int var24 = field508.method554();
				int var25 = field508.method549();
				boolean var26 = false;
				for (int var27 = 0; var27 < 100; var27++) {
					if (field235[var27] == var24) {
						var26 = true;
						break;
					}
				}

				if (var25 <= 1) {
					for (int var28 = 0; var28 < field420; var28++) {
						if (field383[var28] == var22) {
							var26 = true;
							break;
						}
					}
				}

				if (!var26 && field496 == 0) {
					try {
						field235[field346] = var24;
						field346 = (field346 + 1) % 100;
						String var29 = EEXPPJJP.method199(field508, field193 - 13);
						if (var25 != 3) {
							var29 = IHYZEVYW.method244(var29);
						}

						if (var25 == 2 || var25 == 3) {
							method146(7, var29, "@cr2@" + FWDMWOLO.method213(FWDMWOLO.method210(var22)));
						} else if (var25 == 1) {
							method146(7, var29, "@cr1@" + FWDMWOLO.method213(FWDMWOLO.method210(var22)));
						} else {
							method146(3, var29, FWDMWOLO.method213(FWDMWOLO.method210(var22)));
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 32) {
				field538 = true;
				field348 = field508.method549();
				field349 = field508.method549();
				field350 = field508.method551();
				field351 = field508.method549();
				field352 = field508.method549();
				if (field352 >= 100) {
					field405 = field348 * 128 + 64;
					field407 = field349 * 128 + 64;
					field406 = method81(field407, field451, field405) - field350;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 25) {
				field299 = field508.method569();
				field300 = field508.method568();
				field194 = -1;
				return true;
			}

			if (field194 == 154) {
				field258 = field508.method576() * 30;
				field194 = -1;
				return true;
			}

			if (field194 == 160) {
				int var31 = field508.method578();
				method157(var31);

				if (field398 != -1) {
					field398 = -1;
					field174 = true;
					field310 = true;
				}

				if (field548 != -1) {
					field548 = -1;
					field376 = true;
				}

				if (field282 != 0) {
					field282 = 0;
					field376 = true;
				}

				field401 = var31;
				field186 = false;
				field194 = -1;
				return true;
			}

			if (field194 == 139) {
				field435 = field508.method549();
				if (field435 == 1) {
					field517 = field508.method551();
				}

				if (field435 >= 2 && field435 <= 6) {
					if (field435 == 2) {
						field473 = 64;
						field474 = 64;
					}

					if (field435 == 3) {
						field473 = 0;
						field474 = 64;
					}

					if (field435 == 4) {
						field473 = 128;
						field474 = 64;
					}

					if (field435 == 5) {
						field473 = 64;
						field474 = 0;
					}

					if (field435 == 6) {
						field473 = 64;
						field474 = 128;
					}

					field435 = 2;
					field470 = field508.method551();
					field471 = field508.method551();
					field472 = field508.method549();
				}

				if (field435 == 10) {
					field415 = field508.method551();
				}

				field194 = -1;
				return true;
			}

			if (field194 == 103) {
				for (int var32 = 0; var32 < field572.length; var32++) {
					if (field572[var32] != field192[var32]) {
						field572[var32] = field192[var32];
						method124(var32);
						field174 = true;
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 80) {
				field174 = true;
				int var33 = field508.method551();
				JDSNLLMP var34 = JDSNLLMP.field775[var33];
				int var35 = field508.method551();
				for (int var36 = 0; var36 < var35; var36++) {
					var34.field760[var36] = field508.method578();
					int var37 = field508.method568();
					if (var37 == 255) {
						var37 = field508.method581();
					}

					var34.field791[var36] = var37;
				}

				for (int var38 = var35; var38 < var34.field760.length; var38++) {
					var34.field760[var38] = 0;
					var34.field791[var38] = 0;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 77) {
				int var39 = field508.method576();
				int var40 = field508.method578();
				JDSNLLMP.field775[var40].field796 = 2;
				JDSNLLMP.field775[var40].field797 = var39;
				field194 = -1;
				return true;
			}

			if (field194 == 98) {
				int var41 = field508.method551();
				int var42 = field508.method549();
				int var43 = field508.method551();
				if (field223 && !field215 && field354 < 50) {
					field166[field354] = var41;
					field381[field354] = var42;
					field449[field354] = DFQOFKQS.field603[var41] + var43;
					field354++;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 155) {
				byte var44 = field508.method550();
				int var45 = field508.method551();
				field192[var45] = var44;

				if (field572[var45] != var44) {
					field572[var45] = var44;
					method124(var45);
					field174 = true;

					if (field450 != -1) {
						field376 = true;
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 242) {
				field174 = true;
				int var46 = field508.method569();
				int var47 = field508.method568();
				int var48 = field508.method554();
				field264[var46] = var48;
				field382[var46] = var47;
				field284[var46] = 1;
				for (int var49 = 0; var49 < 98; var49++) {
					if (var48 >= field263[var49]) {
						field284[var46] = var49 + 2;
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 255) {
				field299 = field508.method549();
				field300 = field508.method569();
				for (int var50 = field299; var50 < field299 + 8; var50++) {
					for (int var51 = field300; var51 < field300 + 8; var51++) {
						if (field556[field451][var50][var51] != null) {
							field556[field451][var50][var51] = null;
							method99(var50, var51);
						}
					}
				}

				for (AIQUEQRG var52 = (AIQUEQRG) field171.method528(); var52 != null; var52 = (AIQUEQRG) field171.method530()) {
					if (var52.field101 >= field299 && var52.field101 < field299 + 8 && var52.field102 >= field300 && var52.field102 < field300 + 8 && field451 == var52.field99) {
						var52.field109 = 0;
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 65) {
				if (field398 != -1) {
					field398 = -1;
					field174 = true;
					field310 = true;
				}

				if (field548 != -1) {
					field548 = -1;
					field376 = true;
				}

				if (field282 != 0) {
					field282 = 0;
					field376 = true;
				}

				field401 = -1;
				field186 = false;
				field194 = -1;
				return true;
			}

			if (field194 == 179) {
				field569 = field508.method549();
				field554 = field508.method549();
				field328 = field508.method549();
				field167 = true;
				field376 = true;
				field194 = -1;
				return true;
			}

			if (field194 == 31) {
				String var53 = field508.method556();
				if (var53.endsWith(":tradereq:")) {
					String var54 = var53.substring(0, var53.indexOf(":"));
					long var55 = FWDMWOLO.method209(var54);
					boolean var57 = false;
					for (int var58 = 0; var58 < field420; var58++) {
						if (field383[var58] == var55) {
							var57 = true;
							break;
						}
					}

					if (!var57 && field496 == 0) {
						method146(4, "wishes to trade with you.", var54);
					}
				} else if (var53.endsWith(":duelreq:")) {
					String var59 = var53.substring(0, var53.indexOf(":"));
					long var60 = FWDMWOLO.method209(var59);
					boolean var62 = false;
					for (int var63 = 0; var63 < field420; var63++) {
						if (field383[var63] == var60) {
							var62 = true;
							break;
						}
					}

					if (!var62 && field496 == 0) {
						method146(8, "wishes to duel with you.", var59);
					}
				} else if (var53.endsWith(":chalreq:")) {
					String var64 = var53.substring(0, var53.indexOf(":"));
					long var65 = FWDMWOLO.method209(var64);
					boolean var67 = false;
					for (int var68 = 0; var68 < field420; var68++) {
						if (field383[var68] == var65) {
							var67 = true;
							break;
						}
					}

					if (!var67 && field496 == 0) {
						String var69 = var53.substring(var53.indexOf(":") + 1, var53.length() - 9);
						method146(8, var69, var64);
					}
				} else {
					method146(0, var53, "");
				}

				field194 = -1;
				return true;
			}

			if (field194 == 107) {
				field422 = false;
				field282 = 1;
				field503 = "";
				field376 = true;
				field194 = -1;
				return true;
			}

			if (field194 == 8) {
				field590 = field508.method549();
				field174 = true;
				field310 = true;
				field194 = -1;
				return true;
			}

			if (field194 == 71) {
				int var70 = field508.method576();
				if (var70 == 0xFFFF) {
					var70 = -1;
				}

				if (field250 != var70 && field322 && !field215 && field259 == 0) {
					field302 = var70;
					field303 = true;
					field476.method450(2, field302);
				}

				field250 = var70;
				field194 = -1;
				return true;
			}

			if (field194 == 184) {
				int var71 = field508.method551();
				int var72 = field508.method577();
				if (field322 && !field215) {
					field302 = var71;
					field303 = false;
					field476.method450(2, field302);
					field259 = var72;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 178 || field194 == 89 || field194 == 62 || field194 == 17 || field194 == 213 || field194 == 69 || field194 == 61 || field194 == 202 || field194 == 97 || field194 == 235 || field194 == 37) {
				method50(field194, field508);
				field194 = -1;
				return true;
			}

			if (field194 == 127) {
				int var73 = field508.method577();
				int var74 = field508.method577();
				JDSNLLMP.field775[var73].field796 = 1;
				JDSNLLMP.field775[var73].field797 = var74;
				field194 = -1;
				return true;
			}

			if (field194 == 92) {
				int var75 = field508.method580();
				int var76 = field508.method578();
				JDSNLLMP var77 = JDSNLLMP.field775[var76];
				var77.field773 = var75;

				if (var75 == -1) {
					var77.field814 = 0;
					var77.field799 = 0;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 85) {
				int var78 = field508.method580();
				field450 = var78;
				field376 = true;
				field194 = -1;
				return true;
			}

			if (field194 == 187) {
				method161(field193, field508);
				field194 = -1;
				return true;
			}

			if (field194 == 10) {
				int var79 = field508.method578();
				int var80 = field508.method578();
				int var81 = field508.method551();
				int var82 = field508.method578();
				JDSNLLMP.field775[var80].field783 = var82;
				JDSNLLMP.field775[var80].field784 = var79;
				JDSNLLMP.field775[var80].field782 = var81;
				field194 = -1;
				return true;
			}

			if (field194 == 246) {
				int var83 = field508.method549();
				int var84 = field508.method549();
				int var85 = field508.method549();
				int var86 = field508.method549();
				field241[var83] = true;
				field573[var83] = var84;
				field363[var83] = var85;
				field561[var83] = var86;
				field399[var83] = 0;
				field194 = -1;
				return true;
			}

			if (field194 == 7) {
				field538 = false;

				for (int var87 = 0; var87 < 5; var87++) {
					field241[var87] = false;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 150) {
				int var88 = field508.method576();
				JDSNLLMP.field775[var88].field796 = 3;

				if (field404.field2 == null) {
					JDSNLLMP.field775[var88].field797 = (field404.field4[11] << 5) + (field404.field4[8] << 10) + (field404.field4[0] << 15) + (field404.field5[0] << 25) + (field404.field5[4] << 20) + field404.field4[1];
				} else {
					JDSNLLMP.field775[var88].field797 = (int) (field404.field2.field693 + 0x12345678L);
				}

				field194 = -1;
				return true;
			}

			if (field194 == 233) {
				field466 = field508.method549();
				field174 = true;
				field194 = -1;
				return true;
			}

			if (field194 == 106) {
				int var89 = field508.method576();
				boolean var90 = field508.method569() == 1;
				JDSNLLMP.field775[var89].field762 = var90;
				field194 = -1;
				return true;
			}

			if (field194 == 36) {
				int var91 = field508.method580();
				int var92 = field508.method579();
				int var93 = field508.method576();
				JDSNLLMP var94 = JDSNLLMP.field775[var93];
				var94.field787 = var92;
				var94.field811 = var91;
				field194 = -1;
				return true;
			}

			if (field194 == 52) {
				for (int var95 = 0; var95 < field443.length; var95++) {
					if (field443[var95] != null) {
						field443[var95].field1376 = -1;
					}
				}

				for (int var96 = 0; var96 < field245.length; var96++) {
					if (field245[var96] != null) {
						field245[var96].field1376 = -1;
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 151) {
				field468 = field508.method554();
				field342 = field508.method568();
				field178 = field508.method576();
				field211 = field508.method568();
				field200 = field508.method577();

				if (field468 != 0 && field401 == -1) {
					signlink.dnslookup(FWDMWOLO.method212(field468));
					method84();
					short var97 = 650;
					if (field342 != 201 || field211 == 1) {
						var97 = 655;
					}

					field526 = "";
					field544 = false;

					for (int var98 = 0; var98 < JDSNLLMP.field775.length; var98++) {
						if (JDSNLLMP.field775[var98] != null && JDSNLLMP.field775[var98].field772 == var97) {
							field401 = JDSNLLMP.field775[var98].field798;
							break;
						}
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 90) {
				if (field590 == 12) {
					field174 = true;
				}

				field558 = field508.method552();
				field194 = -1;
				return true;
			}

			if (field194 == 44) {
				field538 = true;
				field456 = field508.method549();
				field457 = field508.method549();
				field458 = field508.method551();
				field459 = field508.method549();
				field460 = field508.method549();
				if (field460 >= 100) {
					int var99 = field456 * 128 + 64;
					int var100 = field457 * 128 + 64;
					int var101 = method81(var100, field451, var99) - field458;
					int var102 = var99 - field405;
					int var103 = var101 - field406;
					int var104 = var100 - field407;
					int var105 = (int) Math.sqrt(var102 * var102 + var104 * var104);
					field408 = (int) (Math.atan2(var103, var105) * 325.949D) & 0x7FF;
					field409 = (int) (Math.atan2(var102, var104) * -325.949D) & 0x7FF;

					if (field408 < 128) {
						field408 = 128;
					}

					if (field408 > 383) {
						field408 = 383;
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 217) {
				int var106 = field508.method578();
				String var107 = field508.method556();
				JDSNLLMP.field775[var106].field761 = var107;

				if (field492[field590] == JDSNLLMP.field775[var106].field798) {
					field174 = true;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 218) {
				field360 = 0;
				field194 = -1;
				return true;
			}

			if (field194 == 3 || field194 == 86) {
				int var108 = field208;
				int var109 = field209;
				if (field194 == 3) {
					var108 = field508.method578();
					var109 = field508.method577();
					field283 = false;
				}

				if (field194 == 86) {
					var108 = field508.method578();
					var109 = field508.method551();
					field508.method559();

					for (int var110 = 0; var110 < 4; var110++) {
						for (int var111 = 0; var111 < 13; var111++) {
							for (int var112 = 0; var112 < 13; var112++) {
								int var113 = field508.method560(1);
								if (var113 == 1) {
									field523[var110][var111][var112] = field508.method560(26);
								} else {
									field523[var110][var111][var112] = -1;
								}
							}
						}
					}

					field508.method561();
					field283 = true;
				}

				if (field208 == var108 && field209 == var109 && field518 == 2) {
					field194 = -1;
					return true;
				}

				field208 = var108;
				field209 = var109;
				field224 = (field208 - 6) * 8;
				field225 = (field209 - 6) * 8;
				field343 = false;
				if ((field208 / 8 == 48 || field208 / 8 == 49) && field209 / 8 == 48) {
					field343 = true;
				}

				if (field208 / 8 == 48 && field209 / 8 == 148) {
					field343 = true;
				}

				field518 = 1;
				field344 = System.currentTimeMillis();
				field204.method372();
				field373.method382(0, "Loading - please wait.", 151, 257);
				field373.method382(0xFFFFFF, "Loading - please wait.", 150, 256);
				field204.method373(4, field895, 4);

				if (field194 == 3) {
					int var114 = 0;
					for (int var115 = (field208 - 6) / 8; var115 <= (field208 + 6) / 8; var115++) {
						for (int var116 = (field209 - 6) / 8; var116 <= (field209 + 6) / 8; var116++) {
							var114++;
						}
					}

					field494 = new byte[var114][];
					field490 = new byte[var114][];
					field428 = new int[var114];
					field429 = new int[var114];
					field430 = new int[var114];
					int var117 = 0;
					for (int var118 = (field208 - 6) / 8; var118 <= (field208 + 6) / 8; var118++) {
						for (int var119 = (field209 - 6) / 8; var119 <= (field209 + 6) / 8; var119++) {
							field428[var117] = (var118 << 8) + var119;

							if (field343 && (var119 == 49 || var119 == 149 || var119 == 147 || var118 == 50 || var118 == 49 && var119 == 47)) {
								field429[var117] = -1;
								field430[var117] = -1;
								var117++;
							} else {
								int var120 = field429[var117] = field476.method433(var118, 0, var119);
								if (var120 != -1) {
									field476.method450(3, var120);
								}

								int var121 = field430[var117] = field476.method433(var118, 1, var119);
								if (var121 != -1) {
									field476.method450(3, var121);
								}

								var117++;
							}
						}
					}
				}

				if (field194 == 86) {
					int var122 = 0;
					int[] var123 = new int[676];
					for (int var124 = 0; var124 < 4; var124++) {
						for (int var125 = 0; var125 < 13; var125++) {
							for (int var126 = 0; var126 < 13; var126++) {
								int var127 = field523[var124][var125][var126];
								if (var127 != -1) {
									int var128 = var127 >> 14 & 0x3FF;
									int var129 = var127 >> 3 & 0x7FF;
									int var130 = (var128 / 8 << 8) + var129 / 8;
									for (int var131 = 0; var131 < var122; var131++) {
										if (var123[var131] == var130) {
											var130 = -1;
											break;
										}
									}

									if (var130 != -1) {
										var123[var122++] = var130;
									}
								}
							}
						}
					}

					field494 = new byte[var122][];
					field490 = new byte[var122][];
					field428 = new int[var122];
					field429 = new int[var122];
					field430 = new int[var122];
					for (int var132 = 0; var132 < var122; var132++) {
						int var133 = field428[var132] = var123[var132];
						int var134 = var133 >> 8 & 0xFF;
						int var135 = var133 & 0xFF;
						int var136 = field429[var132] = field476.method433(var134, 0, var135);
						if (var136 != -1) {
							field476.method450(3, var136);
						}

						int var137 = field430[var132] = field476.method433(var134, 1, var135);
						if (var137 != -1) {
							field476.method450(3, var137);
						}
					}
				}

				int var138 = field224 - field226;
				int var139 = field225 - field227;
				field226 = field224;
				field227 = field225;

				for (int var140 = 0; var140 < 16384; var140++) {
					CMGLYFCQ var141 = field245[var140];
					if (var141 != null) {
						for (int var142 = 0; var142 < 10; var142++) {
							var141.field1360[var142] -= var138;
							var141.field1361[var142] -= var139;
						}

						var141.field1370 -= var138 * 128;
						var141.field1371 -= var139 * 128;
					}
				}

				for (int var143 = 0; var143 < field441; var143++) {
					AGFDLNBY var144 = field443[var143];
					if (var144 != null) {
						for (int var145 = 0; var145 < 10; var145++) {
							var144.field1360[var145] -= var138;
							var144.field1361[var145] -= var139;
						}

						var144.field1370 -= var138 * 128;
						var144.field1371 -= var139 * 128;
					}
				}

				field563 = true;
				byte var146 = 0;
				byte var147 = 104;
				byte var148 = 1;
				if (var138 < 0) {
					var146 = 103;
					var147 = -1;
					var148 = -1;
				}

				byte var149 = 0;
				byte var150 = 104;
				byte var151 = 1;
				if (var139 < 0) {
					var149 = 103;
					var150 = -1;
					var151 = -1;
				}

				for (int var152 = var146; var152 != var147; var152 += var148) {
					for (int var153 = var149; var153 != var150; var153 += var151) {
						int var154 = var138 + var152;
						int var155 = var139 + var153;
						for (int var156 = 0; var156 < 4; var156++) {
							if (var154 >= 0 && var155 >= 0 && var154 < 104 && var155 < 104) {
								field556[var156][var152][var153] = field556[var156][var154][var155];
							} else {
								field556[var156][var152][var153] = null;
							}
						}
					}
				}

				for (AIQUEQRG var157 = (AIQUEQRG) field171.method528(); var157 != null; var157 = (AIQUEQRG) field171.method530()) {
					var157.field101 -= var138;
					var157.field102 -= var139;
					if (var157.field101 < 0 || var157.field102 < 0 || var157.field101 >= 104 || var157.field102 >= 104) {
						var157.method589();
					}
				}

				if (field360 != 0) {
					field360 -= var138;
					field361 -= var139;
				}

				field538 = false;
				field194 = -1;
				return true;
			}

			if (field194 == 212) {
				field180 = field508.method549();
				field194 = -1;
				return true;
			}

			if (field194 == 35) {
				int var158 = field508.method576();
				int var159 = field508.method577();
				JDSNLLMP var160 = JDSNLLMP.field775[var158];
				if (var160 != null && var160.field788 == 0) {
					if (var159 < 0) {
						var159 = 0;
					}

					if (var159 > var160.field767 - var160.field804) {
						var159 = var160.field767 - var160.field804;
					}

					var160.field769 = var159;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 64) {
				if (field590 == 12) {
					field174 = true;
				}

				field550 = field508.method549();
				field194 = -1;
				return true;
			}

			if (field194 == 42) {
				int var161 = field508.method578();
				int var162 = field508.method576();

				if (field548 != -1) {
					field548 = -1;
					field376 = true;
				}

				if (field282 != 0) {
					field282 = 0;
					field376 = true;
				}

				field401 = var161;
				field398 = var162;
				field174 = true;
				field310 = true;
				field186 = false;
				field194 = -1;
				return true;
			}

			if (field194 == 185) {
				String var163 = field508.method556();
				int var164 = field508.method549();
				int var165 = field508.method568();
				if (var164 >= 1 && var164 <= 5) {
					if (var163.equalsIgnoreCase("null")) {
						var163 = null;
					}

					field320[var164 - 1] = var163;
					field321[var164 - 1] = var165 == 0;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 197) {
				method120();
				field194 = -1;
				return false;
			}

			if (field194 == 215) {
				field500 = field508.method549();
				field194 = -1;
				return true;
			}

			if (field194 == 2) {
				field300 = field508.method549();
				field299 = field508.method569();

				while (field508.field1393 < field193) {
					int var166 = field508.method549();
					method50(var166, field508);
				}

				field194 = -1;
				return true;
			}

			if (field194 == 158) {
				long var167 = field508.method555();
				int var169 = field508.method549();
				String var170 = FWDMWOLO.method213(FWDMWOLO.method210(var167));
				for (int var171 = 0; var171 < field465; var171++) {
					if (field172[var171] == var167) {
						if (field431[var171] != var169) {
							field431[var171] = var169;
							field174 = true;

							if (var169 > 0) {
								method146(5, var170 + " has logged in.", "");
							}

							if (var169 == 0) {
								method146(5, var170 + " has logged out.", "");
							}
						}

						var170 = null;
						break;
					}
				}

				if (var170 != null && field465 < 200) {
					field172[field465] = var167;
					field539[field465] = var170;
					field431[field465] = var169;
					field465++;
					field174 = true;
				}

				boolean var172 = false;
				while (!var172) {
					var172 = true;
					for (int var173 = 0; var173 < field465 - 1; var173++) {
						if (field431[var173] != field212 && field431[var173 + 1] == field212 || field431[var173] == 0 && field431[var173 + 1] != 0) {
							int var174 = field431[var173];
							field431[var173] = field431[var173 + 1];
							field431[var173 + 1] = var174;
							String var175 = field539[var173];
							field539[var173] = field539[var173 + 1];
							field539[var173 + 1] = var175;
							long var176 = field172[var173];
							field172[var173] = field172[var173 + 1];
							field172[var173 + 1] = var176;
							field174 = true;
							var172 = false;
						}
					}
				}

				field194 = -1;
				return true;
			}

			if (field194 == 157) {
				field183 = field508.method569();
				field253 = field508.method578();
				field194 = -1;
				return true;
			}

			if (field194 == 45) {
				int var178 = field508.method551();
				method157(var178);

				if (field398 != -1) {
					field398 = -1;
					field174 = true;
					field310 = true;
				}

				field548 = var178;
				field376 = true;
				field401 = -1;
				field186 = false;
				field194 = -1;
				return true;
			}

			if (field194 == 170) {
				int var179 = field508.method576();
				JDSNLLMP var180 = JDSNLLMP.field775[var179];
				for (int var181 = 0; var181 < var180.field760.length; var181++) {
					var180.field760[var181] = -1;
					var180.field760[var181] = 0;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 14) {
				field356 = field508.method549();
				if (field590 == field356) {
					if (field356 == 3) {
						field590 = 1;
					} else {
						field590 = 3;
					}

					field174 = true;
				}

				field194 = -1;
				return true;
			}

			if (field194 == 67) {
				int var182 = field508.method577();
				method157(var182);

				if (field548 != -1) {
					field548 = -1;
					field376 = true;
				}

				if (field282 != 0) {
					field282 = 0;
					field376 = true;
				}

				field398 = var182;
				field174 = true;
				field310 = true;
				field401 = -1;
				field186 = false;
				field194 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field194 + "," + field193 + " - " + field306 + "," + field307);
			method120();
		} catch (IOException var187) {
			method85();
		} catch (Exception var188) {
			String var184 = "T2 - " + field194 + "," + field306 + "," + field307 + " - " + field193 + "," + (field404.field1360[0] + field224) + "," + (field404.field1361[0] + field225) + " - ";
			for (int var185 = 0; var185 < field193 && var185 < 50; var185++) {
				var184 = var184 + field508.field1392[var185] + ",";
			}

			signlink.reporterror(var184);
			method120();
		}

		return true;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method67() {
		if (field180 == 0 && field909 == 1) {
			int var1 = field910 - 25 - 550;
			int var2 = field911 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field484 + field323 & 0x7FF;
				int var4 = LLQSXMOX.field848[var3];
				int var5 = LLQSXMOX.field849[var3];
				var4 = (field232 + 256) * var4 >> 8;
				var5 = (field232 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field404.field1370 + var6 >> 7;
				int var9 = field404.field1371 - var7 >> 7;
				boolean var10 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, true, 1, 0, 0, var9, var8);
				if (var10) {
					field210.method539(var1);
					field210.method539(var2);
					field210.method540(field484);
					field210.method539(57);
					field210.method539(field323);
					field210.method539(field232);
					field210.method539(89);
					field210.method540(field404.field1370);
					field210.method540(field404.field1371);
					field210.method539(field170);
					field210.method539(63);
				}
			}

			field338++;
			if (field338 > 1084) {
				field338 = 0;
				field210.method538(100);
				field210.method539(0);
				int var11 = field210.field1393;

				if ((int) (Math.random() * 2.0D) == 0) {
					field210.method540(43797);
				}

				field210.method539(123);
				field210.method540(31673);
				field210.method540(58545);

				if ((int) (Math.random() * 2.0D) == 0) {
					field210.method539(54);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field210.method540(41636);
				}

				field210.method539(215);
				field210.method539(76);
				field210.method540((int) (Math.random() * 65536.0D));
				field210.method539(203);
				field210.method548(field210.field1393 - var11);
				return;
			}
		}
	}

	@ObfuscatedName("client.a([BBZ)V")
	public final void method68(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.s(I)V")
	public final void method69() {
		int var1 = field237;
		int var2 = field238;
		int var3 = field239;
		int var4 = field240;
		int var5 = 0x5D5447;
		KNERFXXY.method284(var1, var2, var5, var4, var3);
		KNERFXXY.method284(var1 + 1, var2 + 1, 0, 16, var3 - 2);
		KNERFXXY.method285(var2 + 18, var4 - 19, 0, var1 + 1, var3 - 2);
		field374.method386(var1 + 3, "Choose Option", var5, var2 + 14);
		int var6 = field903;
		int var7 = field904;
		if (field236 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field236 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field236 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field198; var8++) {
			int var9 = (field198 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field374.method390(field557[var8], var9, var1 + 3, var10, true);
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
			if (field215 && field451 != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field530.method483(arg6, arg2, arg5);
			}

			if (arg0 == 1) {
				var8 = field530.method484(arg5, arg6, arg2);
			}

			if (arg0 == 2) {
				var8 = field530.method485(arg6, arg2, arg5);
			}

			if (arg0 == 3) {
				var8 = field530.method486(arg6, arg2, arg5);
			}

			if (var8 != 0) {
				int var12 = field530.method487(arg6, arg2, arg5, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field530.method474(arg2, arg6, arg5);
					SHDUUMNW var16 = SHDUUMNW.method410(var13);
					if (var16.field1093) {
						field357[arg6].method220(var14, var15, var16.field1129, arg2, arg5);
					}
				}

				if (arg0 == 1) {
					field530.method475(arg6, arg2, arg5);
				}

				if (arg0 == 2) {
					field530.method476(arg6, arg2, arg5);
					SHDUUMNW var17 = SHDUUMNW.method410(var13);
					if (var17.field1125 + arg2 > 103 || var17.field1125 + arg5 > 103 || var17.field1094 + arg2 > 103 || var17.field1094 + arg5 > 103) {
						return;
					}

					if (var17.field1093) {
						field357[arg6].method221(var17.field1125, var17.field1094, var15, arg5, arg2, var17.field1129);
					}
				}

				if (arg0 == 3) {
					field530.method477(arg2, arg5, arg6);
					SHDUUMNW var18 = SHDUUMNW.method410(var13);
					if (var18.field1093 && var18.field1109) {
						field357[arg6].method223(arg5, arg2);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (field575[1][arg2][arg5] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				MBPQTDOR.method323(field357[arg6], arg5, arg2, arg4, var19, arg1, field530, arg3, field345, arg6);
				return;
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method71() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field530.method483(arg0, arg2, arg4);
		if (var6 != 0) {
			int var7 = field530.method487(arg0, arg2, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = field362.field617;
			int var12 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			SHDUUMNW var14 = SHDUUMNW.method410(var13);
			if (var14.field1127 == -1) {
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
				DZSIRBWX var15 = field175[var14.field1127];
				if (var15 != null) {
					int var16 = (var14.field1125 * 4 - var15.field626) / 2;
					int var17 = (var14.field1094 * 4 - var15.field627) / 2;
					var15.method192((104 - arg4 - var14.field1094) * 4 + var17 + 48, arg2 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field530.method485(arg0, arg2, arg4);
		if (var18 != 0) {
			int var19 = field530.method487(arg0, arg2, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			SHDUUMNW var23 = SHDUUMNW.method410(var22);
			if (var23.field1127 != -1) {
				DZSIRBWX var24 = field175[var23.field1127];
				if (var24 != null) {
					int var25 = (var23.field1125 * 4 - var24.field626) / 2;
					int var26 = (var23.field1094 * 4 - var24.field627) / 2;
					var24.method192((104 - arg4 - var23.field1094) * 4 + var26 + 48, arg2 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field362.field617;
				int var29 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = field530.method486(arg0, arg2, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			SHDUUMNW var32 = SHDUUMNW.method410(var31);
			if (var32.field1127 != -1) {
				DZSIRBWX var33 = field175[var32.field1127];
				if (var33 != null) {
					int var34 = (var32.field1125 * 4 - var33.field626) / 2;
					int var35 = (var32.field1094 * 4 - var33.field627) / 2;
					var33.method192((104 - arg4 - var32.field1094) * 4 + var35 + 48, arg2 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method73(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.c(III)V")
	public final void method74(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field463[var4] != null) {
				int var5 = field461[var4];
				int var6 = field559 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field462[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field569 == 0 || field569 == 1 && method26(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field404.field11)) {
						if (field347 >= 1) {
							field557[field198] = "Report abuse @whi@" + var7;
							field335[field198] = 399;
							field198++;
						}

						field557[field198] = "Add ignore @whi@" + var7;
						field335[field198] = 92;
						field198++;
						field557[field198] = "Add friend @whi@" + var7;
						field335[field198] = 264;
						field198++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field243 == 0 && (var5 == 7 || field554 == 0 || field554 == 1 && method26(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field347 >= 1) {
							field557[field198] = "Report abuse @whi@" + var7;
							field335[field198] = 399;
							field198++;
						}

						field557[field198] = "Add ignore @whi@" + var7;
						field335[field198] = 92;
						field198++;
						field557[field198] = "Add friend @whi@" + var7;
						field335[field198] = 264;
						field198++;
					}

					var3++;
				}

				if (var5 == 4 && (field328 == 0 || field328 == 1 && method26(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field557[field198] = "Accept trade @whi@" + var7;
						field335[field198] = 851;
						field198++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field243 == 0 && field554 < 2) {
					var3++;
				}

				if (var5 == 8 && (field328 == 0 || field328 == 1 && method26(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field557[field198] = "Accept challenge @whi@" + var7;
						field335[field198] = 471;
						field198++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)I")
	public final int method75() {
		int var1 = 3;
		if (field408 < 310) {
			int var2 = field405 >> 7;
			int var3 = field407 >> 7;
			int var4 = field404.field1370 >> 7;
			int var5 = field404.field1371 >> 7;

			if ((field575[field451][var2][var3] & 0x4) != 0) {
				var1 = field451;
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

					if ((field575[field451][var2][var3] & 0x4) != 0) {
						var1 = field451;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field575[field451][var2][var3] & 0x4) != 0) {
							var1 = field451;
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

					if ((field575[field451][var2][var3] & 0x4) != 0) {
						var1 = field451;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field575[field451][var2][var3] & 0x4) != 0) {
							var1 = field451;
						}
					}
				}
			}
		}

		if ((field575[field451][field404.field1370 >> 7][field404.field1371 >> 7] & 0x4) != 0) {
			var1 = field451;
		}

		return var1;
	}

	@ObfuscatedName("client.u(I)I")
	public final int method76() {
		int var1 = method81(field407, field451, field405);
		if (var1 - field406 < 800 && (field575[field451][field405 >> 7][field407 >> 7] & 0x4) != 0) {
			return field451;
		}

		return 3;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method77() {
		short var1 = 256;

		if (field509 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field509 > 768) {
					field187[var2] = method148(field189[var2], field188[var2], 1024 - field509);
				} else if (field509 > 256) {
					field187[var2] = field189[var2];
				} else {
					field187[var2] = method148(field188[var2], field189[var2], 256 - field509);
				}
			}
		} else if (field510 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field510 > 768) {
					field187[var3] = method148(field190[var3], field188[var3], 1024 - field510);
				} else if (field510 > 256) {
					field187[var3] = field190[var3];
				} else {
					field187[var3] = method148(field188[var3], field190[var3], 256 - field510);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field187[var4] = field188[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field271.field1020[var5] = field524.field617[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field370[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field527[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field187[var12];
					int var15 = field271.field1020[var7];
					field271.field1020[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field271.method373(0, field895, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field272.field1020[var16] = field525.field617[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field370[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field527[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field187[var23];
					int var26 = field272.field1020[var18];
					field272.field1020[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field272.method373(0, field895, 637);
	}

	@ObfuscatedName("client.a(ILJDSNLLMP;IIB)V")
	public final void method78(int arg0, JDSNLLMP arg1, int arg2, int arg3) {
		if (arg1.field788 == 0 && arg1.field807 != null && (!arg1.field762 || field386 == arg1.field764 || field249 == arg1.field764 || field365 == arg1.field764)) {
			int var5 = KNERFXXY.field829;
			int var6 = KNERFXXY.field827;
			int var7 = KNERFXXY.field830;
			int var8 = KNERFXXY.field828;
			KNERFXXY.method281(arg3, arg1.field804 + arg3, arg1.field812 + arg0, arg0);
			int var9 = arg1.field807.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field816[var10] + arg0;
				int var12 = arg1.field790[var10] + arg3 - arg2;
				JDSNLLMP var13 = JDSNLLMP.field775[arg1.field807[var10]];
				var11 += var13.field787;
				var12 += var13.field811;

				if (var13.field772 > 0) {
					method61(var13);
				}

				if (var13.field788 == 0) {
					if (var13.field769 > var13.field767 - var13.field804) {
						var13.field769 = var13.field767 - var13.field804;
					}

					if (var13.field769 < 0) {
						var13.field769 = 0;
					}

					method78(var11, var13, var13.field769, var12);

					if (var13.field767 > var13.field804) {
						method51(var13.field767, var13.field769, var13.field804, var12, var13.field812 + var11);
					}
				} else if (var13.field788 != 1) {
					if (var13.field788 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field804; var15++) {
							for (int var16 = 0; var16 < var13.field812; var16++) {
								int var17 = (var13.field808 + 32) * var16 + var11;
								int var18 = (var13.field766 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field781[var14];
									var18 += var13.field806[var14];
								}

								if (var13.field760[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field760[var14] - 1;
									if (var17 > KNERFXXY.field829 - 32 && var17 < KNERFXXY.field830 && var18 > KNERFXXY.field827 - 32 && var18 < KNERFXXY.field828 || field279 != 0 && field278 == var14) {
										int var22 = 0;
										if (field294 == 1 && field295 == var14 && field296 == var13.field764) {
											var22 = 0xFFFFFF;
										}

										DYPVESKW var23 = AIEFUHUQ.method14(var21, var13.field791[var14], var22);
										if (var23 != null) {
											if (field279 != 0 && field278 == var14 && field277 == var13.field764) {
												var19 = field903 - field280;
												var20 = field904 - field281;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field387 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method181(var18 + var20, 128, var17 + var19);

												if (var18 + var20 < KNERFXXY.field827 && arg1.field769 > 0) {
													int var24 = (KNERFXXY.field827 - var18 - var20) * field301 / 3;
													if (var24 > field301 * 10) {
														var24 = field301 * 10;
													}

													if (var24 > arg1.field769) {
														var24 = arg1.field769;
													}

													arg1.field769 -= var24;
													field281 += var24;
												}

												if (var18 + var20 + 32 > KNERFXXY.field828 && arg1.field769 < arg1.field767 - arg1.field804) {
													int var25 = (var18 + var20 + 32 - KNERFXXY.field828) * field301 / 3;
													if (var25 > field301 * 10) {
														var25 = field301 * 10;
													}

													if (var25 > arg1.field767 - arg1.field804 - arg1.field769) {
														var25 = arg1.field767 - arg1.field804 - arg1.field769;
													}

													arg1.field769 += var25;
													field281 -= var25;
												}
											} else if (field288 != 0 && field287 == var14 && field286 == var13.field764) {
												var23.method181(var18, 128, var17);
											} else {
												var23.method179(var18, var17);
											}

											if (var23.field622 == 33 || var13.field791[var14] != 1) {
												int var26 = var13.field791[var14];
												field372.method386(var17 + var19 + 1, method89(var26), 0, var18 + var20 + 10);
												field372.method386(var17 + var19, method89(var26), 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.field795 != null && var14 < 20) {
									DYPVESKW var27 = var13.field795[var14];
									if (var27 != null) {
										var27.method179(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field788 == 3) {
						boolean var28 = false;
						if (field365 == var13.field764 || field249 == var13.field764 || field386 == var13.field764) {
							var28 = true;
						}

						int var29;
						if (method87(var13)) {
							var29 = var13.field770;
							if (var28 && var13.field800 != 0) {
								var29 = var13.field800;
							}
						} else {
							var29 = var13.field763;
							if (var28 && var13.field771 != 0) {
								var29 = var13.field771;
							}
						}

						if (var13.field768 == 0) {
							if (var13.field820) {
								KNERFXXY.method284(var11, var12, var29, var13.field804, var13.field812);
							} else {
								KNERFXXY.method285(var12, var13.field804, var29, var11, var13.field812);
							}
						} else if (var13.field820) {
							KNERFXXY.method283(var13.field804, var29, var13.field812, var12, var11, 256 - (var13.field768 & 0xFF));
						} else {
							KNERFXXY.method286(var29, var13.field812, var11, 256 - (var13.field768 & 0xFF), var13.field804, var12);
						}
					} else if (var13.field788 == 4) {
						RXCVCUUO var30 = var13.field792;
						String var31 = var13.field761;
						boolean var32 = false;
						if (field365 == var13.field764 || field249 == var13.field764 || field386 == var13.field764) {
							var32 = true;
						}

						int var33;
						if (method87(var13)) {
							var33 = var13.field770;
							if (var32 && var13.field800 != 0) {
								var33 = var13.field800;
							}

							if (var13.field758.length() > 0) {
								var31 = var13.field758;
							}
						} else {
							var33 = var13.field763;
							if (var32 && var13.field771 != 0) {
								var33 = var13.field771;
							}
						}

						if (var13.field813 == 6 && field186) {
							var31 = "Please wait...";
							var33 = var13.field763;
						}

						if (KNERFXXY.field825 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1047 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method113(method153(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method113(method153(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method113(method153(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method113(method153(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method113(method153(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field821) {
								var30.method383(var34, var33, var13.field812 / 2 + var11, var13.field802, var41);
							} else {
								var30.method390(var41, var34, var11, var33, var13.field802);
							}

							var34 += var30.field1047;
						}
					} else if (var13.field788 == 5) {
						DYPVESKW var42;
						if (method87(var13)) {
							var42 = var13.field789;
						} else {
							var42 = var13.field759;
						}

						if (var42 != null) {
							var42.method179(var12, var11);
						}
					} else if (var13.field788 == 6) {
						int var43 = LLQSXMOX.field844;
						int var44 = LLQSXMOX.field845;
						LLQSXMOX.field844 = var13.field812 / 2 + var11;
						LLQSXMOX.field845 = var13.field804 / 2 + var12;
						int var45 = LLQSXMOX.field848[var13.field783] * var13.field782 >> 16;
						int var46 = LLQSXMOX.field849[var13.field783] * var13.field782 >> 16;
						boolean var47 = method87(var13);
						int var48;
						if (var47) {
							var48 = var13.field774;
						} else {
							var48 = var13.field773;
						}

						OIBEFFXI var49;
						if (var48 == -1) {
							var49 = var13.method272(var47, -1, -1);
						} else {
							CGWBYVFN var50 = CGWBYVFN.field150[var48];
							var49 = var13.method272(var47, var50.field152[var13.field814], var50.field153[var13.field814]);
						}

						if (var49 != null) {
							var49.method366(0, var13.field784, 0, var13.field783, 0, var45, var46);
						}

						LLQSXMOX.field844 = var43;
						LLQSXMOX.field845 = var44;
					} else if (var13.field788 == 7) {
						RXCVCUUO var51 = var13.field792;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field804; var53++) {
							for (int var54 = 0; var54 < var13.field812; var54++) {
								if (var13.field760[var52] > 0) {
									AIEFUHUQ var55 = AIEFUHUQ.method13(var13.field760[var52] - 1);
									String var56 = var55.field52;
									if (var55.field93 || var13.field791[var52] != 1) {
										var56 = var56 + " x" + method135(var13.field791[var52]);
									}

									int var57 = (var13.field808 + 115) * var54 + var11;
									int var58 = (var13.field766 + 12) * var53 + var12;
									if (var13.field821) {
										var51.method383(var58, var13.field763, var13.field812 / 2 + var57, var13.field802, var56);
									} else {
										var51.method390(var56, var58, var57, var13.field763, var13.field802);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			KNERFXXY.method281(var6, var8, var7, var5);
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method79() {
		if (field432 || field364 || field493) {
			method49();
		} else {
			field452++;

			if (field560) {
				method39();
			} else {
				method132(false);
			}

			field384 = 0;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method80() {
		if (field294 == 0 && field416 == 0) {
			field557[field198] = "Walk here";
			field335[field198] = 746;
			field333[field198] = field903;
			field334[field198] = field904;
			field198++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < OIBEFFXI.field1014; var2++) {
			int var3 = OIBEFFXI.field1015[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field530.method487(field451, var4, var5, var3) >= 0) {
					SHDUUMNW var8 = SHDUUMNW.method410(var7);
					if (var8.field1090 != null) {
						var8 = var8.method406();
					}

					if (var8 == null) {
						continue;
					}

					if (field294 == 1) {
						field557[field198] = "Use " + field298 + " with @cya@" + var8.field1119;
						field335[field198] = 888;
						field336[field198] = var3;
						field333[field198] = var4;
						field334[field198] = var5;
						field198++;
					} else if (field416 != 1) {
						if (var8.field1108 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1108[var9] != null) {
									field557[field198] = var8.field1108[var9] + " @cya@" + var8.field1119;

									if (var9 == 0) {
										field335[field198] = 234;
									}

									if (var9 == 1) {
										field335[field198] = 794;
									}

									if (var9 == 2) {
										field335[field198] = 164;
									}

									if (var9 == 3) {
										field335[field198] = 594;
									}

									if (var9 == 4) {
										field335[field198] = 1025;
									}

									field336[field198] = var3;
									field333[field198] = var4;
									field334[field198] = var5;
									field198++;
								}
							}
						}

						field557[field198] = "Examine @cya@" + var8.field1119;
						field335[field198] = 1446;
						field336[field198] = var8.field1117 << 14;
						field333[field198] = var4;
						field334[field198] = var5;
						field198++;
					} else if ((field418 & 0x4) == 4) {
						field557[field198] = field419 + " @cya@" + var8.field1119;
						field335[field198] = 330;
						field336[field198] = var3;
						field333[field198] = var4;
						field334[field198] = var5;
						field198++;
					}
				}

				if (var6 == 1) {
					CMGLYFCQ var10 = field245[var7];
					if (var10.field591.field671 == 1 && (var10.field1370 & 0x7F) == 0x40 && (var10.field1371 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field246; var11++) {
							CMGLYFCQ var12 = field245[field247[var11]];
							if (var12 != null && var10 != var12 && var12.field591.field671 == 1 && var10.field1370 == var12.field1370 && var10.field1371 == var12.field1371) {
								method147(field247[var11], var5, var12.field591, var4);
							}
						}

						for (int var13 = 0; var13 < field444; var13++) {
							AGFDLNBY var14 = field443[field445[var13]];
							if (var14 != null && var10.field1370 == var14.field1370 && var10.field1371 == var14.field1371) {
								method152(var14, var5, field445[var13], var4);
							}
						}
					}

					method147(var7, var5, var10.field591, var4);
				}

				if (var6 == 0) {
					AGFDLNBY var15 = field443[var7];
					if ((var15.field1370 & 0x7F) == 0x40 && (var15.field1371 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field246; var16++) {
							CMGLYFCQ var17 = field245[field247[var16]];
							if (var17 != null && var17.field591.field671 == 1 && var15.field1370 == var17.field1370 && var15.field1371 == var17.field1371) {
								method147(field247[var16], var5, var17.field591, var4);
							}
						}

						for (int var18 = 0; var18 < field444; var18++) {
							AGFDLNBY var19 = field443[field445[var18]];
							if (var19 != null && var15 != var19 && var15.field1370 == var19.field1370 && var15.field1371 == var19.field1371) {
								method152(var19, var5, field445[var18], var4);
							}
						}
					}

					method152(var15, var5, var7, var4);
				}

				if (var6 == 3) {
					YLURZVWU var20 = field556[field451][var4][var5];
					if (var20 != null) {
						for (RWDQVUEN var21 = (RWDQVUEN) var20.method529(); var21 != null; var21 = (RWDQVUEN) var20.method531()) {
							AIEFUHUQ var22 = AIEFUHUQ.method13(var21.field1040);
							if (field294 == 1) {
								field557[field198] = "Use " + field298 + " with @lre@" + var22.field52;
								field335[field198] = 158;
								field336[field198] = var21.field1040;
								field333[field198] = var4;
								field334[field198] = var5;
								field198++;
							} else if (field416 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field81 != null && var22.field81[var23] != null) {
										field557[field198] = var22.field81[var23] + " @lre@" + var22.field52;

										if (var23 == 0) {
											field335[field198] = 211;
										}

										if (var23 == 1) {
											field335[field198] = 498;
										}

										if (var23 == 2) {
											field335[field198] = 624;
										}

										if (var23 == 3) {
											field335[field198] = 287;
										}

										if (var23 == 4) {
											field335[field198] = 47;
										}

										field336[field198] = var21.field1040;
										field333[field198] = var4;
										field334[field198] = var5;
										field198++;
									} else if (var23 == 2) {
										field557[field198] = "Take @lre@" + var22.field52;
										field335[field198] = 624;
										field336[field198] = var21.field1040;
										field333[field198] = var4;
										field334[field198] = var5;
										field198++;
									}
								}

								field557[field198] = "Examine @lre@" + var22.field52;
								field335[field198] = 1498;
								field336[field198] = var21.field1040;
								field333[field198] = var4;
								field334[field198] = var5;
								field198++;
							} else if ((field418 & 0x1) == 1) {
								field557[field198] = field419 + " @lre@" + var22.field52;
								field335[field198] = 960;
								field336[field198] = var21.field1040;
								field333[field198] = var4;
								field334[field198] = var5;
								field198++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method81(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field575[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field345[var6][var4][var5] + field345[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field345[var6][var4][var5 + 1] + field345[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method82(int arg0) {
		if (arg0 >= 0) {
			if (field282 != 0) {
				field282 = 0;
				field376 = true;
			}

			int var2 = field333[arg0];
			int var3 = field334[arg0];
			int var4 = field335[arg0];
			int var5 = field336[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 164) {
				method92(var3, var5, var2);
				field210.method538(13);
				field210.method573(var5 >> 14 & 0x7FFF);
				field210.method573(field225 + var3);
				field210.method575(field224 + var2);
			}

			if (var4 == 685) {
				field210.method538(95);
				field210.method540(var3);
				JDSNLLMP var6 = JDSNLLMP.field775[var3];
				if (var6.field805 != null && var6.field805[0][0] == 5) {
					int var7 = var6.field805[0][1];
					field572[var7] = 1 - field572[var7];
					method124(var7);
					field174 = true;
				}
			}

			if (var4 == 585) {
				CMGLYFCQ var8 = field245[var5];
				if (var8 != null) {
					method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var8.field1361[0], var8.field1360[0]);
					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(227);
					field210.method574(var5);
				}
			}

			if (var4 == 960) {
				boolean var9 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, false, 2, 0, 0, var3, var2);
				if (!var9) {
					method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var3, var2);
				}

				field216 = field910;
				field217 = field911;
				field219 = 2;
				field218 = 0;
				field210.method538(125);
				field210.method574(field224 + var2);
				field210.method573(field417);
				field210.method574(field225 + var3);
				field210.method574(var5);
			}

			if (var4 == 404) {
				AGFDLNBY var11 = field443[var5];
				if (var11 != null) {
					method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var11.field1361[0], var11.field1360[0]);
					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(248);
					field210.method573(var5);
				}
			}

			if (var4 == 467) {
				CMGLYFCQ var12 = field245[var5];
				if (var12 != null) {
					method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var12.field1361[0], var12.field1360[0]);
					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(122);
					field210.method540(var5);
				}
			}

			if (var4 == 624) {
				boolean var13 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, false, 2, 0, 0, var3, var2);
				if (!var13) {
					method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var3, var2);
				}

				field216 = field910;
				field217 = field911;
				field219 = 2;
				field218 = 0;
				field210.method538(156);
				field210.method574(field225 + var3);
				field210.method574(var5);
				field210.method574(field224 + var2);
			}

			if (var4 == 851 || var4 == 471) {
				String var15 = field557[arg0];
				int var16 = var15.indexOf("@whi@");
				if (var16 != -1) {
					var15 = var15.substring(var16 + 5).trim();
					String var17 = FWDMWOLO.method213(FWDMWOLO.method210(FWDMWOLO.method209(var15)));
					boolean var18 = false;
					for (int var19 = 0; var19 < field444; var19++) {
						AGFDLNBY var20 = field443[field445[var19]];
						if (var20 != null && var20.field11 != null && var20.field11.equalsIgnoreCase(var17)) {
							method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var20.field1361[0], var20.field1360[0]);

							if (var4 == 851) {
								field210.method538(10);
								field210.method540(field445[var19]);
							}

							if (var4 == 471) {
								field499 += var5;
								if (field499 >= 50) {
									field210.method538(240);
									field210.method542(0x7BA80C);
									field499 = 0;
								}

								field210.method538(69);
								field210.method575(field445[var19]);
							}

							var18 = true;
							break;
						}
					}

					if (!var18) {
						method146(0, "Unable to find " + var17, "");
					}
				}
			}

			if (var4 == 1654) {
				AIEFUHUQ var21 = AIEFUHUQ.method13(var5);
				JDSNLLMP var22 = JDSNLLMP.field775[var3];
				String var23;
				if (var22 != null && var22.field791[var2] >= 100000) {
					var23 = var22.field791[var2] + " x " + var21.field52;
				} else if (var21.field85 == null) {
					var23 = "It's a " + var21.field52 + ".";
				} else {
					var23 = new String(var21.field85);
				}

				method146(0, var23, "");
			}

			if (var4 == 1171) {
				CMGLYFCQ var24 = field245[var5];
				if (var24 != null) {
					FKIKYVJJ var25 = var24.field591;
					if (var25.field688 != null) {
						var25 = var25.method206();
					}

					if (var25 != null) {
						String var26;
						if (var25.field695 == null) {
							var26 = "It's a " + var25.field691 + ".";
						} else {
							var26 = new String(var25.field695);
						}

						method146(0, var26, "");
					}
				}
			}

			if (var4 == 609) {
				field210.method538(167);
				field210.method573(var3);
				field210.method573(var5);
				field210.method540(field417);
				field210.method573(var2);
				field285 = 0;
				field286 = var3;
				field287 = var2;
				field288 = 2;
				if (JDSNLLMP.field775[var3].field798 == field401) {
					field288 = 1;
				}

				if (JDSNLLMP.field775[var3].field798 == field548) {
					field288 = 3;
				}
			}

			if (var4 == 639) {
				field210.method538(224);
				field210.method573(var5);
				field210.method574(var2);
				field210.method574(var3);
				field285 = 0;
				field286 = var3;
				field287 = var2;
				field288 = 2;
				if (JDSNLLMP.field775[var3].field798 == field401) {
					field288 = 1;
				}

				if (JDSNLLMP.field775[var3].field798 == field548) {
					field288 = 3;
				}
			}

			if (var4 == 399) {
				String var27 = field557[arg0];
				int var28 = var27.indexOf("@whi@");
				if (var28 != -1) {
					if (field401 == -1) {
						method84();
						field526 = var27.substring(var28 + 5).trim();
						field544 = false;

						for (int var29 = 0; var29 < JDSNLLMP.field775.length; var29++) {
							if (JDSNLLMP.field775[var29] != null && JDSNLLMP.field775[var29].field772 == 600) {
								field433 = field401 = JDSNLLMP.field775[var29].field798;
								break;
							}
						}
					} else {
						method146(0, "Please close the interface you have open before using 'report abuse'", "");
					}
				}
			}

			if (var4 == 813) {
				field210.method538(176);
				field210.method574(var2);
				field210.method574(var5);
				field210.method540(var3);
				field285 = 0;
				field286 = var3;
				field287 = var2;
				field288 = 2;
				if (JDSNLLMP.field775[var3].field798 == field401) {
					field288 = 1;
				}

				if (JDSNLLMP.field775[var3].field798 == field548) {
					field288 = 3;
				}
			}

			if (var4 == 654) {
				AGFDLNBY var30 = field443[var5];
				if (var30 != null) {
					method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var30.field1361[0], var30.field1360[0]);
					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(151);
					field210.method573(var5);
					field210.method575(field417);
				}
			}

			if (var4 == 972) {
				field210.method538(5);
				field210.method540(var3);
				field210.method573(var2);
				field210.method575(var5);
				field285 = 0;
				field286 = var3;
				field287 = var2;
				field288 = 2;
				if (JDSNLLMP.field775[var3].field798 == field401) {
					field288 = 1;
				}

				if (JDSNLLMP.field775[var3].field798 == field548) {
					field288 = 3;
				}
			}

			if (var4 == 691) {
				CMGLYFCQ var31 = field245[var5];
				if (var31 != null) {
					method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var31.field1361[0], var31.field1360[0]);
					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;

					if ((var5 & 0x3) == 0) {
						field179++;
					}

					if (field179 >= 93) {
						field210.method538(217);
						field210.method540(57731);
						field179 = 0;
					}

					field210.method538(73);
					field210.method574(var5);
				}
			}

			if (var4 == 57) {
				AGFDLNBY var32 = field443[var5];
				if (var32 != null) {
					method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var32.field1361[0], var32.field1360[0]);
					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(52);
					field210.method573(var5);
				}
			}

			if (var4 == 746) {
				if (field353) {
					field530.method495(var2 - 4, var3 - 4);
				} else {
					field530.method495(field910 - 4, field911 - 4);
				}
			}

			if (var4 == 496) {
				JDSNLLMP var33 = JDSNLLMP.field775[var3];
				field416 = 1;
				field417 = var3;
				field418 = var33.field819;
				field294 = 0;
				field174 = true;
				String var34 = var33.field786;
				if (var34.indexOf(" ") != -1) {
					var34 = var34.substring(0, var34.indexOf(" "));
				}

				String var35 = var33.field786;
				if (var35.indexOf(" ") != -1) {
					var35 = var35.substring(var35.indexOf(" ") + 1);
				}

				field419 = var34 + " " + var33.field785 + " " + var35;

				if (field418 == 16) {
					field174 = true;
					field590 = 3;
					field310 = true;
				}
			} else {
				if (var4 == 440) {
					field467++;
					if (field467 >= 95) {
						field210.method538(45);
						field467 = 0;
					}

					field210.method538(59);
					field210.method574(var5);
					field210.method575(var3);
					field210.method575(var2);
					field285 = 0;
					field286 = var3;
					field287 = var2;
					field288 = 2;
					if (JDSNLLMP.field775[var3].field798 == field401) {
						field288 = 1;
					}

					if (JDSNLLMP.field775[var3].field798 == field548) {
						field288 = 3;
					}
				}

				if (var4 == 815) {
					method84();
				}

				if (var4 == 971) {
					CMGLYFCQ var36 = field245[var5];
					if (var36 != null) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var36.field1361[0], var36.field1360[0]);
						field216 = field910;
						field217 = field911;
						field219 = 2;
						field218 = 0;
						field210.method538(218);
						field210.method573(field296);
						field210.method573(var5);
						field210.method575(field295);
						field210.method575(field297);
					}
				}

				if (var4 == 831) {
					AGFDLNBY var37 = field443[var5];
					if (var37 != null) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var37.field1361[0], var37.field1360[0]);
						field216 = field910;
						field217 = field911;
						field219 = 2;
						field218 = 0;
						field210.method538(174);
						field210.method573(var5);
					}
				}

				if (var4 == 1446) {
					int var38 = var5 >> 14 & 0x7FFF;
					SHDUUMNW var39 = SHDUUMNW.method410(var38);
					String var40;
					if (var39.field1122 == null) {
						var40 = "It's a " + var39.field1119 + ".";
					} else {
						var40 = new String(var39.field1122);
					}

					method146(0, var40, "");
				}

				if (var4 == 38) {
					CMGLYFCQ var41 = field245[var5];
					if (var41 != null) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var41.field1361[0], var41.field1360[0]);
						field216 = field910;
						field217 = field911;
						field219 = 2;
						field218 = 0;
						field210.method538(135);
						field210.method574(var5);
					}
				}

				if (var4 == 1498) {
					AIEFUHUQ var42 = AIEFUHUQ.method13(var5);
					String var43;
					if (var42.field85 == null) {
						var43 = "It's a " + var42.field52 + ".";
					} else {
						var43 = new String(var42.field85);
					}

					method146(0, var43, "");
				}

				if (var4 == 445) {
					AGFDLNBY var44 = field443[var5];
					if (var44 != null) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var44.field1361[0], var44.field1360[0]);
						field216 = field910;
						field217 = field911;
						field219 = 2;
						field218 = 0;
						field499 += var5;
						if (field499 >= 50) {
							field210.method538(240);
							field210.method542(0x7BA80C);
							field499 = 0;
						}

						field210.method538(69);
						field210.method575(var5);
					}
				}

				if (var4 == 615) {
					field210.method538(97);
					field210.method540(var5);
					field210.method574(var2);
					field210.method574(var3);
					field285 = 0;
					field286 = var3;
					field287 = var2;
					field288 = 2;
					if (JDSNLLMP.field775[var3].field798 == field401) {
						field288 = 1;
					}

					if (JDSNLLMP.field775[var3].field798 == field548) {
						field288 = 3;
					}
				}

				if (var4 == 1025) {
					method92(var3, var5, var2);
					field210.method538(36);
					field210.method575(field225 + var3);
					field210.method575(field224 + var2);
					field210.method574(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 262) {
					field210.method538(95);
					field210.method540(var3);
					JDSNLLMP var45 = JDSNLLMP.field775[var3];
					if (var45.field805 != null && var45.field805[0][0] == 5) {
						int var46 = var45.field805[0][1];
						if (field572[var46] != var45.field817[0]) {
							field572[var46] = var45.field817[0];
							method124(var46);
							field174 = true;
						}
					}
				}

				if (var4 == 234) {
					method92(var3, var5, var2);
					field210.method538(234);
					field210.method574(field224 + var2);
					field210.method573(var5 >> 14 & 0x7FFF);
					field210.method573(field225 + var3);
				}

				if (var4 == 868) {
					field210.method538(237);
					field210.method573(var5);
					field210.method540(var3);
					field210.method575(var2);
					field285 = 0;
					field286 = var3;
					field287 = var2;
					field288 = 2;
					if (JDSNLLMP.field775[var3].field798 == field401) {
						field288 = 1;
					}

					if (JDSNLLMP.field775[var3].field798 == field548) {
						field288 = 3;
					}
				}

				if (var4 == 997) {
					field570 += var3;
					if (field570 >= 76) {
						field210.method538(84);
						field210.method543(0);
						field570 = 0;
					}

					field210.method538(58);
					field210.method574(var2);
					field210.method540(var5);
					field210.method574(var3);
					field285 = 0;
					field286 = var3;
					field287 = var2;
					field288 = 2;
					if (JDSNLLMP.field775[var3].field798 == field401) {
						field288 = 1;
					}

					if (JDSNLLMP.field775[var3].field798 == field548) {
						field288 = 3;
					}
				}

				if (var4 == 330 && method92(var3, var5, var2)) {
					field210.method538(159);
					field210.method575(field417);
					field210.method574(field225 + var3);
					field210.method573(field224 + var2);
					field210.method540(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 794) {
					field207 += var3;
					if (field207 >= 112) {
						field210.method538(207);
						field210.method540(45399);
						field207 = 0;
					}

					method92(var3, var5, var2);
					field210.method538(48);
					field210.method574(var5 >> 14 & 0x7FFF);
					field210.method574(field224 + var2);
					field210.method573(field225 + var3);
				}

				if (var4 == 826) {
					field368 += var3;
					if (field368 >= 144) {
						field210.method538(169);
						field210.method540(36325);
						field368 = 0;
					}

					field210.method538(85);
					field210.method573(var2);
					field210.method574(var5);
					field210.method540(var3);
					field285 = 0;
					field286 = var3;
					field287 = var2;
					field288 = 2;
					if (JDSNLLMP.field775[var3].field798 == field401) {
						field288 = 1;
					}

					if (JDSNLLMP.field775[var3].field798 == field548) {
						field288 = 3;
					}
				}

				if (var4 == 47) {
					boolean var47 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, false, 2, 0, 0, var3, var2);
					if (!var47) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var3, var2);
					}

					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(177);
					field210.method574(field224 + var2);
					field210.method574(var5);
					field210.method575(field225 + var3);
				}

				if (var4 == 230 && !field186) {
					field210.method538(20);
					field210.method540(var3);
					field186 = true;
				}

				if (var4 == 264 || var4 == 92 || var4 == 515 || var4 == 799) {
					String var49 = field557[arg0];
					int var50 = var49.indexOf("@whi@");
					if (var50 != -1) {
						long var51 = FWDMWOLO.method209(var49.substring(var50 + 5).trim());
						if (var4 == 264) {
							method54(var51);
						}

						if (var4 == 92) {
							method91(var51);
						}

						if (var4 == 515) {
							method110(var51);
						}

						if (var4 == 799) {
							method163(var51);
						}
					}
				}

				if (var4 == 197) {
					field516++;
					if (field516 >= 123) {
						field210.method538(201);
						field516 = 0;
					}

					field210.method538(226);
					field210.method574(var2);
					field210.method575(var3);
					field210.method575(var5);
					field285 = 0;
					field286 = var3;
					field287 = var2;
					field288 = 2;
					if (JDSNLLMP.field775[var3].field798 == field401) {
						field288 = 1;
					}

					if (JDSNLLMP.field775[var3].field798 == field548) {
						field288 = 3;
					}
				}

				if (var4 == 600) {
					CMGLYFCQ var53 = field245[var5];
					if (var53 != null) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var53.field1361[0], var53.field1360[0]);
						field216 = field910;
						field217 = field911;
						field219 = 2;
						field218 = 0;
						field210.method538(133);
						field210.method573(field417);
						field210.method575(var5);
					}
				}

				if (var4 == 211) {
					boolean var54 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, false, 2, 0, 0, var3, var2);
					if (!var54) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var3, var2);
					}

					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(72);
					field210.method575(field224 + var2);
					field210.method574(var5);
					field210.method573(field225 + var3);
				}

				if (var4 == 359) {
					AGFDLNBY var56 = field443[var5];
					if (var56 != null) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var56.field1361[0], var56.field1360[0]);
						field216 = field910;
						field217 = field911;
						field219 = 2;
						field218 = 0;
						field210.method538(10);
						field210.method540(var5);
					}
				}

				if (var4 == 904) {
					field210.method538(25);
					field210.method574(field296);
					field210.method575(var3);
					field210.method574(field295);
					field210.method573(var2);
					field210.method574(var5);
					field210.method540(field297);
					field285 = 0;
					field286 = var3;
					field287 = var2;
					field288 = 2;
					if (JDSNLLMP.field775[var3].field798 == field401) {
						field288 = 1;
					}

					if (JDSNLLMP.field775[var3].field798 == field548) {
						field288 = 3;
					}
				}

				if (var4 == 72) {
					String var57 = field557[arg0];
					int var58 = var57.indexOf("@whi@");
					if (var58 != -1) {
						long var59 = FWDMWOLO.method209(var57.substring(var58 + 5).trim());
						int var61 = -1;
						for (int var62 = 0; var62 < field465; var62++) {
							if (field172[var62] == var59) {
								var61 = var62;
								break;
							}
						}

						if (var61 != -1 && field431[var61] > 0) {
							field376 = true;
							field282 = 0;
							field422 = true;
							field552 = "";
							field487 = 3;
							field478 = field172[var61];
							field565 = "Enter message to send to " + field539[var61];
						}
					}
				}

				if (var4 == 498) {
					boolean var63 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, false, 2, 0, 0, var3, var2);
					if (!var63) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var3, var2);
					}

					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(208);
					field210.method573(field225 + var3);
					field210.method574(var5);
					field210.method540(field224 + var2);
				}

				if (var4 == 888 && method92(var3, var5, var2)) {
					field210.method538(50);
					field210.method575(field295);
					field210.method540(field297);
					field210.method573(var5 >> 14 & 0x7FFF);
					field210.method540(field296);
					field210.method574(field224 + var2);
					field210.method540(field225 + var3);
				}

				if (var4 == 287) {
					boolean var65 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, false, 2, 0, 0, var3, var2);
					if (!var65) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var3, var2);
					}

					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(158);
					field210.method540(field225 + var3);
					field210.method574(var5);
					field210.method575(field224 + var2);
				}

				if (var4 == 158) {
					boolean var67 = method47(0, field404.field1361[0], field404.field1360[0], 0, 0, false, 2, 0, 0, var3, var2);
					if (!var67) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var3, var2);
					}

					field216 = field910;
					field217 = field911;
					field219 = 2;
					field218 = 0;
					field210.method538(162);
					field210.method540(field297);
					field210.method540(var5);
					field210.method540(field296);
					field210.method573(field295);
					field210.method573(field225 + var3);
					field210.method540(field224 + var2);
				}

				if (var4 == 558) {
					AGFDLNBY var69 = field443[var5];
					if (var69 != null) {
						method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var69.field1361[0], var69.field1360[0]);
						field216 = field910;
						field217 = field911;
						field219 = 2;
						field218 = 0;
						field210.method538(109);
						field210.method573(field297);
						field210.method540(var5);
						field210.method573(field296);
						field210.method575(field295);
					}
				}

				if (var4 == 727) {
					field294 = 1;
					field295 = var2;
					field296 = var3;
					field297 = var5;
					field298 = AIEFUHUQ.method13(var5).field52;
					field416 = 0;
					field174 = true;
				} else {
					if (var4 == 170) {
						JDSNLLMP var70 = JDSNLLMP.field775[var3];
						boolean var71 = true;
						if (var70.field772 > 0) {
							var71 = method114(var70);
						}

						if (var71) {
							field210.method538(95);
							field210.method540(var3);
						}
					}

					if (var4 == 966) {
						CMGLYFCQ var72 = field245[var5];
						if (var72 != null) {
							method47(0, field404.field1361[0], field404.field1360[0], 0, 1, false, 2, 1, 0, var72.field1361[0], var72.field1360[0]);
							field216 = field910;
							field217 = field911;
							field219 = 2;
							field218 = 0;
							field210.method538(209);
							field210.method540(var5);
						}
					}

					if (var4 == 19) {
						field371++;
						if (field371 >= 116) {
							field210.method538(39);
							field210.method543(0);
							field371 = 0;
						}

						field210.method538(64);
						field210.method573(var2);
						field210.method573(var3);
						field210.method575(var5);
						field285 = 0;
						field286 = var3;
						field287 = var2;
						field288 = 2;
						if (JDSNLLMP.field775[var3].field798 == field401) {
							field288 = 1;
						}

						if (JDSNLLMP.field775[var3].field798 == field548) {
							field288 = 3;
						}
					}

					if (var4 == 594) {
						method92(var3, var5, var2);
						field210.method538(150);
						field210.method540(field224 + var2);
						field210.method575(field225 + var3);
						field210.method573(var5 >> 14 & 0x7FFF);
					}

					field294 = 0;
					field416 = 0;
					field174 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBLDYPVESKW;)V")
	public final void method83(int arg0, int arg1, DYPVESKW arg2) {
		int var4 = field484 + field323 & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = OIBEFFXI.field1016[var4];
			int var7 = OIBEFFXI.field1017[var4];
			var6 = var6 * 256 / (field232 + 256);
			var7 = var7 * 256 / (field232 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.method185(83 - var9 - arg2.field623 / 2 - 4, var8 + 94 - arg2.field622 / 2 + 4, field542);
			} else {
				arg2.method179(83 - var9 - arg2.field623 / 2 - 4, var8 + 94 - arg2.field622 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method84() {
		field210.method538(166);

		if (field398 != -1) {
			field398 = -1;
			field174 = true;
			field186 = false;
			field310 = true;
		}

		if (field548 != -1) {
			field548 = -1;
			field376 = true;
			field186 = false;
		}

		field401 = -1;
	}

	@ObfuscatedName("client.w(I)V")
	public final void method85() {
		if (field197 > 0) {
			method120();
		} else {
			field204.method372();
			field373.method382(0, "Connection lost", 144, 257);
			field373.method382(0xFFFFFF, "Connection lost", 143, 256);
			field373.method382(0, "Please wait - attempting to reestablish", 159, 257);
			field373.method382(0xFFFFFF, "Please wait - attempting to reestablish", 158, 256);
			field204.method373(4, field895, 4);
			field180 = 0;
			field360 = 0;
			SFXLZPAR var1 = field491;
			field560 = false;
			field515 = 0;
			method130(field184, field185, true);

			if (!field560) {
				method120();
			}

			try {
				var1.method397();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method86() {
		if (field279 == 0) {
			field557[0] = "Cancel";
			field335[0] = 1462;
			field198 = 1;
			method64();
			field577 = 0;

			if (field903 > 4 && field904 > 4 && field903 < 516 && field904 < 338) {
				if (field401 == -1) {
					method80();
				} else {
					method118(4, field904, 4, JDSNLLMP.field775[field401], 0, field903);
				}
			}

			if (field577 != field386) {
				field386 = field577;
			}

			field577 = 0;

			if (field903 > 553 && field904 > 205 && field903 < 743 && field904 < 466) {
				if (field398 != -1) {
					method118(553, field904, 205, JDSNLLMP.field775[field398], 0, field903);
				} else if (field492[field590] != -1) {
					method118(553, field904, 205, JDSNLLMP.field775[field492[field590]], 0, field903);
				}
			}

			if (field577 != field249) {
				field174 = true;
				field249 = field577;
			}

			field577 = 0;

			if (field903 > 17 && field904 > 357 && field903 < 496 && field904 < 453) {
				if (field548 != -1) {
					method118(17, field904, 357, JDSNLLMP.field775[field548], 0, field903);
				} else if (field904 < 434 && field903 < 426) {
					method74(field903 - 17, field904 - 357);
				}
			}

			if (field548 != -1 && field577 != field365) {
				field376 = true;
				field365 = field577;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field198 - 1; var2++) {
					if (field335[var2] < 1000 && field335[var2 + 1] > 1000) {
						String var3 = field557[var2];
						field557[var2] = field557[var2 + 1];
						field557[var2 + 1] = var3;
						int var4 = field335[var2];
						field335[var2] = field335[var2 + 1];
						field335[var2 + 1] = var4;
						int var5 = field333[var2];
						field333[var2] = field333[var2 + 1];
						field333[var2 + 1] = var5;
						int var6 = field334[var2];
						field334[var2] = field334[var2 + 1];
						field334[var2 + 1] = var6;
						int var7 = field336[var2];
						field336[var2] = field336[var2 + 1];
						field336[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(BLJDSNLLMP;)Z")
	public final boolean method87(JDSNLLMP arg0) {
		if (arg0.field810 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field810.length; var2++) {
			int var3 = method153(arg0, var2);
			int var4 = arg0.field817[var2];
			if (arg0.field810[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field810[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field810[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method88() {
		byte[] var1 = field327.method376("title.dat", null);
		DYPVESKW var2 = new DYPVESKW(var1, this);
		field271.method372();
		var2.method177(0, 0);
		field272.method372();
		var2.method177(0, -637);
		field268.method372();
		var2.method177(0, -128);
		field269.method372();
		var2.method177(-371, -202);
		field270.method372();
		var2.method177(-171, -202);
		field273.method372();
		var2.method177(-265, 0);
		field274.method372();
		var2.method177(-265, -562);
		field275.method372();
		var2.method177(-171, -128);
		field276.method372();
		var2.method177(-171, -562);
		int[] var3 = new int[var2.field618];
		for (int var4 = 0; var4 < var2.field619; var4++) {
			for (int var5 = 0; var5 < var2.field618; var5++) {
				var3[var5] = var2.field617[var2.field618 * var4 + var2.field618 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field618; var6++) {
				var2.field617[var2.field618 * var4 + var6] = var3[var6];
			}
		}

		field271.method372();
		var2.method177(0, 382);
		field272.method372();
		var2.method177(0, -255);
		field268.method372();
		var2.method177(0, 254);
		field269.method372();
		var2.method177(-371, 180);
		field270.method372();
		var2.method177(-171, 180);
		field273.method372();
		var2.method177(-265, 382);
		field274.method372();
		var2.method177(-265, -180);
		field275.method372();
		var2.method177(-171, 254);
		field276.method372();
		var2.method177(-171, -180);
		DYPVESKW var7 = new DYPVESKW(field327, "logo", 0);
		field268.method372();
		var7.method179(18, 382 - var7.field618 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public static final String method89(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.a(LYOXDZEVD;IZ)V")
	public final void method90(YOXDZEVD arg0, int arg1) {
		arg0.method559();
		int var3 = arg0.method560(1);
		if (var3 != 0) {
			int var4 = arg0.method560(2);
			if (var4 == 0) {
				field447[field446++] = field442;
			} else if (var4 == 1) {
				int var5 = arg0.method560(3);
				field404.method536(var5, false);
				int var6 = arg0.method560(1);
				if (var6 == 1) {
					field447[field446++] = field442;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method560(3);
				field404.method536(var7, true);
				int var8 = arg0.method560(3);
				field404.method536(var8, true);
				int var9 = arg0.method560(1);
				if (var9 == 1) {
					field447[field446++] = field442;
				}
			} else if (var4 == 3) {
				field451 = arg0.method560(2);
				int var10 = arg0.method560(7);
				int var11 = arg0.method560(1);
				if (var11 == 1) {
					field447[field446++] = field442;
				}

				int var12 = arg0.method560(1);
				int var13 = arg0.method560(7);
				field404.method533(var10, var13, var12 == 1);
			}
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method91(long arg0) {
		if (arg0 != 0L) {
			if (field420 >= 100) {
				method146(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = FWDMWOLO.method213(FWDMWOLO.method210(arg0));
				for (int var4 = 0; var4 < field420; var4++) {
					if (field383[var4] == arg0) {
						method146(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field465; var5++) {
					if (field172[var5] == arg0) {
						method146(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field383[field420++] = arg0;
				field174 = true;
				field210.method538(250);
				field210.method545(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method92(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field530.method487(field451, arg2, arg0, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			SHDUUMNW var8 = SHDUUMNW.method410(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1125;
				var10 = var8.field1094;
			} else {
				var9 = var8.field1094;
				var10 = var8.field1125;
			}

			int var11 = var8.field1101;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method47(0, field404.field1361[0], field404.field1360[0], var11, var9, false, 2, var10, 0, arg0, arg2);
		} else {
			method47(var6 + 1, field404.field1361[0], field404.field1360[0], 0, 0, false, 2, 0, var7, arg0, arg2);
		}

		field216 = field910;
		field217 = field911;
		field219 = 2;
		field218 = 0;
		return true;
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method93() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field527[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field527[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field528[var10] = (field527[var10 - 1] + field527[var10 + 1] + field527[var10 - 128] + field527[var10 + 128]) / 4;
			}
		}

		field534 += 128;
		if (field534 > field358.length) {
			field534 -= field358.length;
			int var11 = (int) (Math.random() * 12.0D);
			method56(field574[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field528[var14 + 128] - field358[field534 + var14 & field358.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field527[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field370[var16] = field370[var16 + 1];
		}

		field370[var1 - 1] = (int) (Math.sin(field316 / 14.0D) * 16.0D + Math.sin(field316 / 15.0D) * 14.0D + Math.sin(field316 / 16.0D) * 12.0D);

		if (field509 > 0) {
			field509 -= 4;
		}

		if (field510 > 0) {
			field510 -= 4;
		}

		if (field509 == 0 && field510 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field509 = 1024;
			}

			if (var17 == 1) {
				field510 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(BI)Z")
	public final boolean method94(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field335[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 264) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method95(int arg0) {
		int[] var2 = field362.field617;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field575[arg0][var7][var5] & 0x18) == 0) {
					field530.method492(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field575[arg0 + 1][var7][var5] & 0x8) != 0) {
					field530.method492(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field362.method174();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field575[arg0][var11][var10] & 0x18) == 0) {
					method72(arg0, var8, var11, var9, var10);
				}

				if (arg0 < 3 && (field575[arg0 + 1][var11][var10] & 0x8) != 0) {
					method72(arg0 + 1, var8, var11, var9, var10);
				}
			}
		}

		field204.method372();
		field260 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field530.method486(field451, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = SHDUUMNW.method410(var14).field1124;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field357[field451].field711;
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

						field536[field260] = field340[var15];
						field261[field260] = var16;
						field262[field260] = var17;
						field260++;
					}
				}
			}
		}

		field562++;
		if (field562 > 57) {
			field562 = 0;
			field210.method538(24);
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method96() {
		if (field909 == 1) {
			if (field910 >= 6 && field910 <= 106 && field911 >= 467 && field911 <= 499) {
				field569 = (field569 + 1) % 4;
				field167 = true;
				field376 = true;
				field210.method538(192);
				field210.method539(field569);
				field210.method539(field554);
				field210.method539(field328);
			}

			if (field910 >= 135 && field910 <= 235 && field911 >= 467 && field911 <= 499) {
				field554 = (field554 + 1) % 3;
				field167 = true;
				field376 = true;
				field210.method538(192);
				field210.method539(field569);
				field210.method539(field554);
				field210.method539(field328);
			}

			if (field910 >= 273 && field910 <= 373 && field911 >= 467 && field911 <= 499) {
				field328 = (field328 + 1) % 3;
				field167 = true;
				field376 = true;
				field210.method538(192);
				field210.method539(field569);
				field210.method539(field554);
				field210.method539(field328);
			}

			if (field910 >= 412 && field910 <= 512 && field911 >= 467 && field911 <= 499) {
				if (field401 == -1) {
					method84();
					field526 = "";
					field544 = false;

					for (int var1 = 0; var1 < JDSNLLMP.field775.length; var1++) {
						if (JDSNLLMP.field775[var1] != null && JDSNLLMP.field775[var1].field772 == 600) {
							field433 = field401 = JDSNLLMP.field775[var1].field798;
							return;
						}
					}

					return;
				}

				method146(0, "Please close the interface you have open before using 'report abuse'", "");
				return;
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method97() {
		field477 = false;
		while (field588) {
			field477 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field251 = null;
		field252 = null;
		field574 = null;
		field187 = null;
		field188 = null;
		field189 = null;
		field190 = null;
		field358 = null;
		field359 = null;
		field527 = null;
		field528 = null;
		field524 = null;
		field525 = null;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BIILjava/lang/String;I)LOTSGNSQM;")
	public final OTSGNSQM method98(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field206[0] != null) {
				var6 = field206[0].method291(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field341.reset();
			field341.update(var6);
			int var8 = (int) field341.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new OTSGNSQM(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method156(arg4, "Requesting " + arg3);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method123(arg0 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				YOXDZEVD var16 = new YOXDZEVD(var15);
				var16.field1393 = 3;
				int var17 = var16.method553() + 6;
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
						method156(arg4, "Loading " + arg3 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field206[0] != null) {
						field206[0].method292(var6.length, var6, arg1);
					}
				} catch (Exception var28) {
					field206[0] = null;
				}

				if (var6 != null) {
					field341.reset();
					field341.update(var6);
					int var23 = (int) field341.getValue();
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
						method156(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						method156(arg4, var11 + " - Retrying in " + var25);
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

				field181 = !field181;
			}
		}

		return new OTSGNSQM(var6);
	}

	@ObfuscatedName("client.a(II)V")
	public final void method99(int arg0, int arg1) {
		YLURZVWU var3 = field556[field451][arg0][arg1];
		if (var3 == null) {
			field530.method478(field451, arg0, arg1);
		} else {
			int var4 = -99999999;
			RWDQVUEN var5 = null;
			for (RWDQVUEN var6 = (RWDQVUEN) var3.method528(); var6 != null; var6 = (RWDQVUEN) var3.method530()) {
				AIEFUHUQ var7 = AIEFUHUQ.method13(var6.field1040);
				int var8 = var7.field97;
				if (var7.field93) {
					var8 = (var6.field1039 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method526(var5);
			RWDQVUEN var9 = null;
			RWDQVUEN var10 = null;
			for (RWDQVUEN var11 = (RWDQVUEN) var3.method528(); var11 != null; var11 = (RWDQVUEN) var3.method530()) {
				if (var5.field1040 != var11.field1040 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1040 != var11.field1040 && var9.field1040 != var11.field1040 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field530.method464(var10, var12, var5, arg0, arg1, field451, method81(arg1 * 128 + 64, field451, arg0 * 128 + 64), var9);
		}
	}

	@ObfuscatedName("client.a(ZILYOXDZEVD;)V")
	public final void method100(int arg0, YOXDZEVD arg1) {
		for (int var3 = 0; var3 < field446; var3++) {
			int var4 = field447[var3];
			CMGLYFCQ var5 = field245[var4];
			int var6 = arg1.method549();
			if ((var6 & 0x4) != 0) {
				var5.field1345 = arg1.method556();
				var5.field1386 = 100;
			}

			if ((var6 & 0x1) != 0) {
				int var7 = arg1.method549();
				int var8 = arg1.method570();
				var5.method534(field316, var7, var8);
				var5.field1338 = field316 + 300;
				var5.field1339 = arg1.method570();
				var5.field1340 = arg1.method569();
			}

			if ((var6 & 0x80) != 0) {
				var5.field1343 = arg1.method578();
				var5.field1344 = arg1.method578();
			}

			if ((var6 & 0x8) != 0) {
				var5.field1391 = arg1.method578();
				if (var5.field1391 == 0xFFFF) {
					var5.field1391 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field1381 = arg1.method578();
				int var9 = arg1.method554();
				var5.field1385 = var9 >> 16;
				var5.field1384 = (var9 & 0xFFFF) + field316;
				var5.field1382 = 0;
				var5.field1383 = 0;

				if (var5.field1384 > field316) {
					var5.field1382 = -1;
				}

				if (var5.field1381 == 0xFFFF) {
					var5.field1381 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				int var10 = arg1.method577();
				if (var10 == 0xFFFF) {
					var10 = -1;
				}

				int var11 = arg1.method570();
				if (var5.field1376 == var10 && var10 != -1) {
					int var12 = CGWBYVFN.field150[var10].field164;
					if (var12 == 1) {
						var5.field1377 = 0;
						var5.field1378 = 0;
						var5.field1379 = var11;
						var5.field1380 = 0;
					}

					if (var12 == 2) {
						var5.field1380 = 0;
					}
				} else if (var10 == -1 || var5.field1376 == -1 || CGWBYVFN.field150[var10].field158 >= CGWBYVFN.field150[var5.field1376].field158) {
					var5.field1376 = var10;
					var5.field1377 = 0;
					var5.field1378 = 0;
					var5.field1379 = var11;
					var5.field1380 = 0;
					var5.field1341 = var5.field1364;
				}
			}

			if ((var6 & 0x40) != 0) {
				var5.field591 = FKIKYVJJ.method202(arg1.method551());
				var5.field1349 = var5.field591.field671;
				var5.field1362 = var5.field591.field675;
				var5.field1366 = var5.field591.field678;
				var5.field1367 = var5.field591.field686;
				var5.field1368 = var5.field591.field664;
				var5.field1369 = var5.field591.field679;
				var5.field1387 = var5.field591.field661;
			}

			if ((var6 & 0x10) != 0) {
				int var13 = arg1.method569();
				int var14 = arg1.method570();
				var5.method534(field316, var13, var14);
				var5.field1338 = field316 + 300;
				var5.field1339 = arg1.method568();
				var5.field1340 = arg1.method570();
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method101() {
		if (field279 == 0) {
			int var1 = field909;
			if (field416 == 1 && field910 >= 516 && field911 >= 160 && field910 <= 765 && field911 <= 205) {
				var1 = 0;
			}

			if (field353) {
				if (var1 != 1) {
					int var2 = field903;
					int var3 = field904;
					if (field236 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field236 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field236 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field237 - 10 || var2 > field239 + field237 + 10 || var3 < field238 - 10 || var3 > field240 + field238 + 10) {
						field353 = false;

						if (field236 == 1) {
							field174 = true;
						}

						if (field236 == 2) {
							field376 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field237;
					int var5 = field238;
					int var6 = field239;
					int var7 = field910;
					int var8 = field911;
					if (field236 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field236 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field236 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field198; var10++) {
						int var11 = (field198 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method82(var9);
					}

					field353 = false;

					if (field236 == 1) {
						field174 = true;
					}

					if (field236 == 2) {
						field376 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field198 > 0) {
					int var12 = field335[field198 - 1];
					if (var12 == 440 || var12 == 639 || var12 == 997 || var12 == 19 || var12 == 972 || var12 == 615 || var12 == 826 || var12 == 813 || var12 == 868 || var12 == 197 || var12 == 727 || var12 == 1654) {
						int var13 = field333[field198 - 1];
						int var14 = field334[field198 - 1];
						JDSNLLMP var15 = JDSNLLMP.field775[var14];
						if (var15.field776 || var15.field809) {
							field549 = false;
							field387 = 0;
							field277 = var14;
							field278 = var13;
							field279 = 2;
							field280 = field910;
							field281 = field911;

							if (JDSNLLMP.field775[var14].field798 == field401) {
								field279 = 1;
							}

							if (JDSNLLMP.field775[var14].field798 == field548) {
								field279 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field199 == 1 || method94(field198 - 1)) && field198 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field198 > 0) {
					method82(field198 - 1);
				}

				if (var1 != 2 || field198 <= 0) {
					return;
				}

				method137();
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method102() {
		field589++;
		if (field589 > 147) {
			field589 = 0;
			field210.method538(212);
			field210.method539(46);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method337();
					if (var1 == -1) {
						return;
					}

					if (field401 != -1 && field433 == field401) {
						break;
					}

					if (field422) {
						if (var1 >= 32 && var1 <= 122 && field552.length() < 80) {
							field552 = field552 + (char) var1;
							field376 = true;
						}

						if (var1 == 8 && field552.length() > 0) {
							field552 = field552.substring(0, field552.length() - 1);
							field376 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field422 = false;
							field376 = true;

							if (field487 == 1) {
								long var2 = FWDMWOLO.method209(field552);
								method54(var2);
							}

							if (field487 == 2 && field465 > 0) {
								long var4 = FWDMWOLO.method209(field552);
								method110(var4);
							}

							if (field487 == 3 && field552.length() > 0) {
								field210.method538(43);
								field210.method539(0);
								int var6 = field210.field1393;
								field210.method545(field478);
								EEXPPJJP.method200(field210, field552);
								field210.method548(field210.field1393 - var6);
								field552 = EEXPPJJP.method201(field552);
								field552 = IHYZEVYW.method244(field552);
								method146(6, field552, FWDMWOLO.method213(FWDMWOLO.method210(field478)));

								if (field554 == 2) {
									field554 = 1;
									field167 = true;
									field210.method538(192);
									field210.method539(field569);
									field210.method539(field554);
									field210.method539(field328);
								}
							}

							if (field487 == 4 && field420 < 100) {
								long var7 = FWDMWOLO.method209(field552);
								method91(var7);
							}

							if (field487 == 5 && field420 > 0) {
								long var9 = FWDMWOLO.method209(field552);
								method163(var9);
							}
						}
					} else if (field282 == 1) {
						if (var1 >= 48 && var1 <= 57 && field503.length() < 10) {
							field503 = field503 + (char) var1;
							field376 = true;
						}

						if (var1 == 8 && field503.length() > 0) {
							field503 = field503.substring(0, field503.length() - 1);
							field376 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field503.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field503);
								} catch (Exception var21) {
								}

								field210.method538(67);
								field210.method543(var11);
							}

							field282 = 0;
							field376 = true;
						}
					} else if (field282 == 2) {
						if (var1 >= 32 && var1 <= 122 && field503.length() < 12) {
							field503 = field503 + (char) var1;
							field376 = true;
						}

						if (var1 == 8 && field503.length() > 0) {
							field503 = field503.substring(0, field503.length() - 1);
							field376 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field503.length() > 0) {
								field210.method538(241);
								field210.method545(FWDMWOLO.method209(field503));
							}

							field282 = 0;
							field376 = true;
						}
					} else if (field548 == -1) {
						if (var1 >= 32 && var1 <= 122 && field551.length() < 80) {
							field551 = field551 + (char) var1;
							field376 = true;
						}

						if (var1 == 8 && field551.length() > 0) {
							field551 = field551.substring(0, field551.length() - 1);
							field376 = true;
						}

						if ((var1 == 13 || var1 == 10) && field551.length() > 0) {
							if (field347 == 2) {
								if (field551.equals("::clientdrop")) {
									method85();
								}

								if (field551.equals("::lag")) {
									method44();
								}

								if (field551.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field476.method435(2); var12++) {
										field476.method443((byte) 1, var12, 2);
									}
								}

								if (field551.equals("::fpson")) {
									field355 = true;
								}

								if (field551.equals("::fpsoff")) {
									field355 = false;
								}

								if (field551.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field357[var13].field711[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field551.startsWith("::")) {
								field210.method538(155);
								field210.method539(field551.length() - 1);
								field210.method546(field551.substring(2));
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

								field210.method538(173);
								field210.method539(0);
								int var20 = field210.field1393;
								field210.method539(var17);
								field210.method565(var19);
								field244.field1393 = 0;
								EEXPPJJP.method200(field244, field551);
								field210.method583(0, field244.field1393, field244.field1392);
								field210.method548(field210.field1393 - var20);
								field551 = EEXPPJJP.method201(field551);
								field551 = IHYZEVYW.method244(field551);
								field404.field1345 = field551;
								field404.field1342 = var17;
								field404.field1350 = var19;
								field404.field1386 = 150;

								if (field347 == 2) {
									method146(2, field404.field1345, "@cr2@" + field404.field11);
								} else if (field347 == 1) {
									method146(2, field404.field1345, "@cr1@" + field404.field11);
								} else {
									method146(2, field404.field1345, field404.field11);
								}

								if (field569 == 2) {
									field569 = 3;
									field167 = true;
									field210.method538(192);
									field210.method539(field569);
									field210.method539(field554);
									field210.method539(field328);
								}
							}

							field551 = "";
							field376 = true;
						}
					}
				}

				if (var1 == 8 && field526.length() > 0) {
					field526 = field526.substring(0, field526.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field526.length() < 12) {
				field526 = field526 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.a(IIIZLJDSNLLMP;IIII)V")
	public final void method103(int arg0, int arg1, int arg2, boolean arg3, JDSNLLMP arg4, int arg5, int arg6, int arg7) {
		if (field576) {
			field489 = 32;
		} else {
			field489 = 0;
		}

		field576 = false;
		if (arg7 >= arg5 && arg7 < arg5 + 16 && arg1 >= arg0 && arg1 < arg0 + 16) {
			arg4.field769 -= field384 * 4;

			if (arg3) {
				field174 = true;
				return;
			}
		} else if (arg7 >= arg5 && arg7 < arg5 + 16 && arg1 >= arg0 + arg6 - 16 && arg1 < arg0 + arg6) {
			arg4.field769 += field384 * 4;

			if (arg3) {
				field174 = true;
				return;
			}
		} else if (arg7 >= arg5 - field489 && arg7 < arg5 + field489 + 16 && arg1 >= arg0 + 16 && arg1 < arg0 + arg6 - 16 && field384 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg0 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg4.field769 = (arg2 - arg6) * var10 / var11;

			if (arg3) {
				field174 = true;
			}

			field576 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method104() {
		for (int var1 = -1; var1 < field444; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field442;
			} else {
				var2 = field445[var1];
			}

			AGFDLNBY var3 = field443[var2];
			if (var3 != null && var3.field1386 > 0) {
				var3.field1386--;
				if (var3.field1386 == 0) {
					var3.field1345 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field246; var4++) {
			int var5 = field247[var4];
			CMGLYFCQ var6 = field245[var5];
			if (var6 != null && var6.field1386 > 0) {
				var6.field1386--;
				if (var6.field1386 == 0) {
					var6.field1345 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg4;
		if (var7 != 0) {
			int var12 = OIBEFFXI.field1016[var7];
			int var13 = OIBEFFXI.field1017[var7];
			int var14 = var10 * var13 - arg4 * var12 >> 16;
			var11 = var10 * var12 + arg4 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = OIBEFFXI.field1016[var8];
			int var16 = OIBEFFXI.field1017[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field405 = arg2 - var9;
		field406 = arg3 - var10;
		field407 = arg5 - var11;
		field408 = arg0;
		field409 = arg1;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method106() {
		field203.method372();

		if (field180 == 2) {
			byte[] var1 = field542.field624;
			int[] var2 = KNERFXXY.field824;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field553.method183(256, 0, field484, 25, 33, 0, field331, 33, 25, field529);
			field204.method372();
		} else {
			int var5 = field484 + field323 & 0x7FF;
			int var6 = field404.field1370 / 32 + 48;
			int var7 = 464 - field404.field1371 / 32;
			field362.method183(field232 + 256, 5, var5, var7, 151, 25, field434, 146, var6, field201);
			field553.method183(256, 0, field484, 25, 33, 0, field331, 33, 25, field529);

			for (int var8 = 0; var8 < field260; var8++) {
				int var9 = field261[var8] * 4 + 2 - field404.field1370 / 32;
				int var10 = field262[var8] * 4 + 2 - field404.field1371 / 32;
				method83(var10, var9, field536[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					YLURZVWU var13 = field556[field451][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field404.field1370 / 32;
						int var15 = var12 * 4 + 2 - field404.field1371 / 32;
						method83(var15, var14, field289);
					}
				}
			}

			for (int var16 = 0; var16 < field246; var16++) {
				CMGLYFCQ var17 = field245[field247[var16]];
				if (var17 != null && var17.method1()) {
					FKIKYVJJ var18 = var17.field591;
					if (var18.field688 != null) {
						var18 = var18.method206();
					}

					if (var18 != null && var18.field670 && var18.field674) {
						int var19 = var17.field1370 / 32 - field404.field1370 / 32;
						int var20 = var17.field1371 / 32 - field404.field1371 / 32;
						method83(var20, var19, field290);
					}
				}
			}

			for (int var21 = 0; var21 < field444; var21++) {
				AGFDLNBY var22 = field443[field445[var21]];
				if (var22 != null && var22.method1()) {
					int var23 = var22.field1370 / 32 - field404.field1370 / 32;
					int var24 = var22.field1371 / 32 - field404.field1371 / 32;
					boolean var25 = false;
					long var26 = FWDMWOLO.method209(var22.field11);
					for (int var28 = 0; var28 < field465; var28++) {
						if (field172[var28] == var26 && field431[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field404.field1 != 0 && var22.field1 != 0 && field404.field1 == var22.field1) {
						var29 = true;
					}

					if (var25) {
						method83(var24, var23, field292);
					} else if (var29) {
						method83(var24, var23, field293);
					} else {
						method83(var24, var23, field291);
					}
				}
			}

			if (field435 != 0 && field316 % 20 < 10) {
				if (field435 == 1 && field517 >= 0 && field517 < field245.length) {
					CMGLYFCQ var30 = field245[field517];
					if (var30 != null) {
						int var31 = var30.field1370 / 32 - field404.field1370 / 32;
						int var32 = var30.field1371 / 32 - field404.field1371 / 32;
						method48(var31, var32, field414);
					}
				}

				if (field435 == 2) {
					int var33 = (field470 - field224) * 4 + 2 - field404.field1370 / 32;
					int var34 = (field471 - field225) * 4 + 2 - field404.field1371 / 32;
					method48(var33, var34, field414);
				}

				if (field435 == 10 && field415 >= 0 && field415 < field443.length) {
					AGFDLNBY var35 = field443[field415];
					if (var35 != null) {
						int var36 = var35.field1370 / 32 - field404.field1370 / 32;
						int var37 = var35.field1371 / 32 - field404.field1371 / 32;
						method48(var36, var37, field414);
					}
				}
			}

			if (field360 != 0) {
				int var38 = field360 * 4 + 2 - field404.field1370 / 32;
				int var39 = field361 * 4 + 2 - field404.field1371 / 32;
				method83(var39, var38, field413);
			}

			KNERFXXY.method284(97, 78, 0xFFFFFF, 3, 3);
			field204.method372();
		}
	}

	@ObfuscatedName("client.c(BI)V")
	public final void method107(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.A(I)V")
	public final void method108() {
		field578 = 0;
		for (int var1 = -1; var1 < field444 + field246; var1++) {
			YOWFBYTG var2;
			if (var1 == -1) {
				var2 = field404;
			} else if (var1 < field444) {
				var2 = field443[field445[var1]];
			} else {
				var2 = field245[field247[var1 - field444]];
			}

			if (var2 != null && var2.method1()) {
				if (var2 instanceof CMGLYFCQ) {
					FKIKYVJJ var3 = ((CMGLYFCQ) var2).field591;
					if (var3.field688 != null) {
						var3 = var3.method206();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field444) {
					FKIKYVJJ var7 = ((CMGLYFCQ) var2).field591;
					if (var7.field697 >= 0 && var7.field697 < field242.length) {
						method139(var2.field1359 + 15, var2);

						if (field329 > -1) {
							field242[var7.field697].method179(field330 - 30, field329 - 12);
						}
					}

					if (field435 == 1 && field247[var1 - field444] == field517 && field316 % 20 < 10) {
						method139(var2.field1359 + 15, var2);

						if (field329 > -1) {
							field242[2].method179(field330 - 28, field329 - 12);
						}
					}
				} else {
					int var4 = 30;
					AGFDLNBY var5 = (AGFDLNBY) var2;
					if (var5.field24 != 0) {
						method139(var2.field1359 + 15, var2);

						if (field329 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field24 & 1 << var6) != 0) {
									field242[var6].method179(field330 - var4, field329 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field435 == 10 && field445[var1] == field415) {
						method139(var2.field1359 + 15, var2);

						if (field329 > -1) {
							field242[7].method179(field330 - var4, field329 - 12);
						}
					}
				}

				if (var2.field1345 != null && (var1 >= field444 || field569 == 0 || field569 == 3 || field569 == 1 && method26(((AGFDLNBY) var2).field11))) {
					method139(var2.field1359, var2);

					if (field329 > -1 && field578 < field579) {
						field583[field578] = field374.method385(var2.field1345) / 2;
						field582[field578] = field374.field1047;
						field580[field578] = field329;
						field581[field578] = field330;
						field584[field578] = var2.field1342;
						field585[field578] = var2.field1350;
						field586[field578] = var2.field1386;
						field587[field578++] = var2.field1345;

						if (field502 == 0 && var2.field1350 >= 1 && var2.field1350 <= 3) {
							field582[field578] += 10;
							field581[field578] += 5;
						}

						if (field502 == 0 && var2.field1350 == 4) {
							field583[field578] = 60;
						}

						if (field502 == 0 && var2.field1350 == 5) {
							field582[field578] += 5;
						}
					}
				}

				if (var2.field1338 > field316) {
					method139(var2.field1359 + 15, var2);

					if (field329 > -1) {
						int var8 = var2.field1339 * 30 / var2.field1340;
						if (var8 > 30) {
							var8 = 30;
						}

						KNERFXXY.method284(field329 - 15, field330 - 3, 0xFF00, 5, var8);
						KNERFXXY.method284(field329 + var8 - 15, field330 - 3, 0xFF0000, 5, 30 - var8);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1348[var9] > field316) {
						method139(var2.field1359 / 2, var2);

						if (field329 > -1) {
							if (var9 == 1) {
								field330 -= 20;
							}

							if (var9 == 2) {
								field329 -= 15;
								field330 -= 10;
							}

							if (var9 == 3) {
								field329 += 15;
								field330 -= 10;
							}

							field533[var2.field1347[var9]].method179(field330 - 12, field329 - 12);
							field372.method382(0, String.valueOf(var2.field1346[var9]), field330 + 4, field329);
							field372.method382(0xFFFFFF, String.valueOf(var2.field1346[var9]), field330 + 3, field329 - 1);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field578; var10++) {
			int var11 = field580[var10];
			int var12 = field581[var10];
			int var13 = field583[var10];
			int var14 = field582[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field581[var16] - field582[var16] && var12 - var14 < field581[var16] + 2 && var11 - var13 < field583[var16] + field580[var16] && var11 + var13 > field580[var16] - field583[var16] && field581[var16] - field582[var16] < var12) {
						var12 = field581[var16] - field582[var16];
						var15 = true;
					}
				}
			}

			field329 = field580[var10];
			field330 = field581[var10] = var12;
			String var17 = field587[var10];
			if (field502 == 0) {
				int var18 = 0xFFFF00;
				if (field584[var10] < 6) {
					var18 = field176[field584[var10]];
				}

				if (field584[var10] == 6) {
					var18 = field325 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field584[var10] == 7) {
					var18 = field325 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field584[var10] == 8) {
					var18 = field325 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field584[var10] == 9) {
					int var19 = 150 - field586[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field584[var10] == 10) {
					int var20 = 150 - field586[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field584[var10] == 11) {
					int var21 = 150 - field586[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field585[var10] == 0) {
					field374.method382(0, var17, field330 + 1, field329);
					field374.method382(var18, var17, field330, field329);
				}

				if (field585[var10] == 1) {
					field374.method387(field330 + 1, field329, field325, 0, var17);
					field374.method387(field330, field329, field325, var18, var17);
				}

				if (field585[var10] == 2) {
					field374.method388(0, field330 + 1, field325, field329, var17);
					field374.method388(var18, field330, field325, field329, var17);
				}

				if (field585[var10] == 3) {
					field374.method389(field330 + 1, var17, 150 - field586[var10], field325, 0, field329);
					field374.method389(field330, var17, 150 - field586[var10], field325, var18, field329);
				}

				if (field585[var10] == 4) {
					int var22 = field374.method385(var17);
					int var23 = (150 - field586[var10]) * (var22 + 100) / 150;
					KNERFXXY.method281(0, 334, field329 + 50, field329 - 50);
					field374.method386(field329 + 50 - var23, var17, 0, field330 + 1);
					field374.method386(field329 + 50 - var23, var17, var18, field330);
					KNERFXXY.method280();
				}

				if (field585[var10] == 5) {
					int var24 = 150 - field586[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					KNERFXXY.method281(field330 - field374.field1047 - 1, field330 + 5, 512, 0);
					field374.method382(0, var17, field330 + var25 + 1, field329);
					field374.method382(var18, var17, field330 + var25, field329);
					KNERFXXY.method280();
				}
			} else {
				field374.method382(0, var17, field330 + 1, field329);
				field374.method382(0xFFFF00, var17, field330, field329);
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method109() {
		try {
			field191 = -1;
			field332.method532();
			field469.method532();
			LLQSXMOX.method298();
			method111();
			field530.method457();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field357[var1].method215();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field575[var2][var3][var4] = 0;
					}
				}
			}

			MBPQTDOR var5 = new MBPQTDOR(field575, field345, 104, 104);
			int var6 = field494.length;
			field210.method538(236);

			if (!field283) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field428[var7] >> 8) * 64 - field224;
					int var9 = (field428[var7] & 0xFF) * 64 - field225;
					byte[] var10 = field494[var7];
					if (var10 != null) {
						var5.method312((field209 - 6) * 8, field357, var8, (field208 - 6) * 8, var9, var10);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field428[var11] >> 8) * 64 - field224;
					int var13 = (field428[var11] & 0xFF) * 64 - field225;
					byte[] var14 = field494[var11];
					if (var14 == null && field209 < 800) {
						var5.method329(64, 64, var13, var12);
					}
				}

				field210.method538(236);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field490[var15];
					if (var16 != null) {
						int var17 = (field428[var15] >> 8) * 64 - field224;
						int var18 = (field428[var15] & 0xFF) * 64 - field225;
						var5.method320(var18, var17, field357, var16, field530);
					}
				}
			}

			if (field283) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field523[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field428.length; var28++) {
									if (field428[var28] == var27 && field494[var28] != null) {
										var5.method319(var19, field357, (var25 & 0x7) * 8, var23, (var26 & 0x7) * 8, var20 * 8, var24, var21 * 8, field494[var28]);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field523[0][var29][var30];
						if (var31 == -1) {
							var5.method329(8, 8, var30 * 8, var29 * 8);
						}
					}
				}

				field210.method538(236);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field523[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field428.length; var41++) {
									if (field428[var41] == var40 && field490[var41] != null) {
										var5.method322(field530, var32, var37, (var38 & 0x7) * 8, (var39 & 0x7) * 8, var34 * 8, field490[var41], field357, var33 * 8, var36);
										break;
									}
								}
							}
						}
					}
				}
			}

			field210.method538(236);
			var5.method332(field530, field357);
			field204.method372();
			field210.method538(236);
			int var42 = MBPQTDOR.field880;
			if (var42 > field451) {
				var42 = field451;
			}

			if (var42 < field451 - 1) {
				int var43 = field451 - 1;
			}

			if (field215) {
				field530.method458(MBPQTDOR.field880);
			} else {
				field530.method458(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method99(var44, var45);
				}
			}

			method58();
		} catch (Exception var58) {
		}

		SHDUUMNW.field1085.method229();

		if (field898 != null) {
			field210.method538(118);
			field210.method543(1057001181);
		}

		if (field215 && signlink.cache_dat != null) {
			int var47 = field476.method435(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field476.method436(var48);
				if ((var49 & 0x79) == 0) {
					OIBEFFXI.method345(var48);
				}
			}
		}

		System.gc();
		LLQSXMOX.method299(20);
		field476.method444();
		int var50 = (field208 - 6) / 8 - 1;
		int var51 = (field208 + 6) / 8 + 1;
		int var52 = (field209 - 6) / 8 - 1;
		int var53 = (field209 + 6) / 8 + 1;
		if (field343) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field476.method433(var54, 0, var55);
					if (var56 != -1) {
						field476.method441(var56, 3);
					}

					int var57 = field476.method433(var54, 1, var55);
					if (var57 != -1) {
						field476.method441(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method110(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field465; var3++) {
				if (field172[var3] == arg0) {
					field465--;
					field174 = true;

					for (int var4 = var3; var4 < field465; var4++) {
						field539[var4] = field539[var4 + 1];
						field431[var4] = field431[var4 + 1];
						field172[var4] = field172[var4 + 1];
					}

					field210.method538(7);
					field210.method545(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method111() {
		SHDUUMNW.field1085.method229();
		SHDUUMNW.field1086.method229();
		FKIKYVJJ.field663.method229();
		AIEFUHUQ.field84.method229();
		AIEFUHUQ.field87.method229();
		AGFDLNBY.field14.method229();
		IDQQUVDL.field750.method229();
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method112(boolean arg0) {
		for (int var2 = 0; var2 < field246; var2++) {
			CMGLYFCQ var3 = field245[field247[var2]];
			int var4 = (field247[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method1() && var3.field591.field676 == arg0) {
				int var5 = var3.field1370 >> 7;
				int var6 = var3.field1371 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1349 == 1 && (var3.field1370 & 0x7F) == 0x40 && (var3.field1371 & 0x7F) == 0x40) {
						if (field412[var5][var6] == field325) {
							continue;
						}

						field412[var5][var6] = field325;
					}

					if (!var3.field591.field674) {
						var4 += Integer.MIN_VALUE;
					}

					field530.method468(var3.field1371, var3.field1337, method81(var3.field1371, field451, var3.field1370), var3.field1370, var4, field451, var3, var3.field1372, (var3.field1349 - 1) * 64 + 60);
				}
			}
		}
	}

	@ObfuscatedName("client.c(ZI)Ljava/lang/String;")
	public final String method113(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(ILJDSNLLMP;)Z")
	public final boolean method114(JDSNLLMP arg0) {
		int var2 = arg0.field772;
		if (field466 == 2) {
			if (var2 == 201) {
				field376 = true;
				field282 = 0;
				field422 = true;
				field552 = "";
				field487 = 1;
				field565 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field376 = true;
				field282 = 0;
				field422 = true;
				field552 = "";
				field487 = 2;
				field565 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field197 = 250;
			return true;
		}

		if (var2 == 501) {
			field376 = true;
			field282 = 0;
			field422 = true;
			field552 = "";
			field487 = 4;
			field565 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field376 = true;
			field282 = 0;
			field422 = true;
			field552 = "";
			field487 = 5;
			field565 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field540[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = XAYNDIOJ.field1285 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= XAYNDIOJ.field1285) {
							var5 = 0;
						}
					}

					if (!XAYNDIOJ.field1286[var5].field1292 && XAYNDIOJ.field1286[var5].field1287 == var3 + (field222 ? 0 : 7)) {
						break;
					}
				}

				field540[var3] = var5;
				field397 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field479[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field488[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field488[var6].length) {
					var8 = 0;
				}
			}

			field479[var6] = var8;
			field397 = true;
		}

		if (var2 == 324 && !field222) {
			field222 = true;
			method46();
		}

		if (var2 == 325 && field222) {
			field222 = false;
			method46();
		}

		if (var2 == 326) {
			field210.method538(102);
			field210.method539(field222 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field210.method539(field540[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field210.method539(field479[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field544 = !field544;
		}

		if (var2 >= 601 && var2 <= 612) {
			method84();

			if (field526.length() > 0) {
				field210.method538(131);
				field210.method545(FWDMWOLO.method209(field526));
				field210.method539(var2 - 601);
				field210.method539(field544 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method115(String arg0) {
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

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method116(int arg0) {
		if (!field215) {
			if (LLQSXMOX.field858[17] >= arg0) {
				DZSIRBWX var2 = LLQSXMOX.field852[17];
				int var3 = var2.field627 * var2.field626 - 1;
				int var4 = field301 * var2.field626 * 2;
				byte[] var5 = var2.field624;
				byte[] var6 = field555;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field624 = var6;
				field555 = var5;
				LLQSXMOX.method302(17);
			}

			if (LLQSXMOX.field858[24] >= arg0) {
				DZSIRBWX var8 = LLQSXMOX.field852[24];
				int var9 = var8.field627 * var8.field626 - 1;
				int var10 = field301 * var8.field626 * 2;
				byte[] var11 = var8.field624;
				byte[] var12 = field555;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field624 = var12;
				field555 = var11;
				LLQSXMOX.method302(24);
			}

			if (LLQSXMOX.field858[34] >= arg0) {
				DZSIRBWX var14 = LLQSXMOX.field852[34];
				int var15 = var14.field627 * var14.field626 - 1;
				int var16 = field301 * var14.field626 * 2;
				byte[] var17 = var14.field624;
				byte[] var18 = field555;
				for (int var19 = 0; var19 <= var15; var19++) {
					var18[var19] = var17[var19 - var16 & var15];
				}

				var14.field624 = var18;
				field555 = var17;
				LLQSXMOX.method302(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LYOXDZEVD;LAGFDLNBY;III)V")
	public final void method117(YOXDZEVD arg0, AGFDLNBY arg1, int arg2, int arg3) {
		if ((arg3 & 0x100) != 0) {
			arg1.field1381 = arg0.method576();
			int var5 = arg0.method554();
			arg1.field1385 = var5 >> 16;
			arg1.field1384 = (var5 & 0xFFFF) + field316;
			arg1.field1382 = 0;
			arg1.field1383 = 0;

			if (arg1.field1384 > field316) {
				arg1.field1382 = -1;
			}

			if (arg1.field1381 == 0xFFFF) {
				arg1.field1381 = -1;
			}
		}

		if ((arg3 & 0x10) != 0) {
			int var6 = arg0.method578();
			if (var6 == 0xFFFF) {
				var6 = -1;
			}

			int var7 = arg0.method549();
			if (arg1.field1376 == var6 && var6 != -1) {
				int var8 = CGWBYVFN.field150[var6].field164;
				if (var8 == 1) {
					arg1.field1377 = 0;
					arg1.field1378 = 0;
					arg1.field1379 = var7;
					arg1.field1380 = 0;
				}

				if (var8 == 2) {
					arg1.field1380 = 0;
				}
			} else if (var6 == -1 || arg1.field1376 == -1 || CGWBYVFN.field150[var6].field158 >= CGWBYVFN.field150[arg1.field1376].field158) {
				arg1.field1376 = var6;
				arg1.field1377 = 0;
				arg1.field1378 = 0;
				arg1.field1379 = var7;
				arg1.field1380 = 0;
				arg1.field1341 = arg1.field1364;
			}
		}

		if ((arg3 & 0x200) != 0) {
			arg1.field1351 = arg0.method568();
			arg1.field1353 = arg0.method568();
			arg1.field1352 = arg0.method570();
			arg1.field1354 = arg0.method549();
			arg1.field1355 = arg0.method576() + field316;
			arg1.field1356 = arg0.method578() + field316;
			arg1.field1357 = arg0.method549();
			arg1.method535();
		}

		if ((arg3 & 0x80) != 0) {
			arg1.field1345 = arg0.method556();
			if (arg1.field1345.charAt(0) == '~') {
				arg1.field1345 = arg1.field1345.substring(1);
				method146(2, arg1.field1345, arg1.field11);
			} else if (field404 == arg1) {
				method146(2, arg1.field1345, arg1.field11);
			}

			arg1.field1342 = 0;
			arg1.field1350 = 0;
			arg1.field1386 = 150;
		}

		if ((arg3 & 0x20) != 0) {
			arg1.field1391 = arg0.method551();
			if (arg1.field1391 == 0xFFFF) {
				arg1.field1391 = -1;
			}
		}

		if ((arg3 & 0x2) != 0) {
			int var9 = arg0.method549();
			int var10 = arg0.method568();
			arg1.method534(field316, var9, var10);
			arg1.field1338 = field316 + 300;
			arg1.field1339 = arg0.method568();
			arg1.field1340 = arg0.method568();
		}

		if ((arg3 & 0x400) != 0) {
			int var11 = arg0.method549();
			int var12 = arg0.method570();
			arg1.method534(field316, var11, var12);
			arg1.field1338 = field316 + 300;
			arg1.field1339 = arg0.method570();
			arg1.field1340 = arg0.method569();
		}

		if ((arg3 & 0x8) != 0) {
			int var13 = arg0.method576();
			int var14 = arg0.method569();
			int var15 = arg0.method549();
			int var16 = arg0.field1393;

			if (arg1.field11 != null && arg1.field15) {
				long var17 = FWDMWOLO.method209(arg1.field11);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < field420; var20++) {
						if (field383[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && field496 == 0) {
					try {
						field244.field1393 = 0;
						arg0.method558(0, field244.field1392, var15);
						field244.field1393 = 0;
						String var21 = EEXPPJJP.method199(field244, var15);
						var21 = IHYZEVYW.method244(var21);
						arg1.field1345 = var21;
						arg1.field1342 = var13 >> 8;
						arg1.field1350 = var13 & 0xFF;
						arg1.field1386 = 150;

						if (var14 == 2 || var14 == 3) {
							method146(1, var21, "@cr2@" + arg1.field11);
						} else if (var14 == 1) {
							method146(1, var21, "@cr1@" + arg1.field11);
						} else {
							method146(2, var21, arg1.field11);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg0.field1393 = var15 + var16;
		}

		if ((arg3 & 0x4) != 0) {
			int var23 = arg0.method549();
			byte[] var24 = new byte[var23];
			YOXDZEVD var25 = new YOXDZEVD(var24);
			arg0.method584(var23, 0, var24);
			field448[arg2] = var25;
			arg1.method4(var25);
		}

		if ((arg3 & 0x1) != 0) {
			arg1.field1343 = arg0.method578();
			arg1.field1344 = arg0.method577();
		}
	}

	@ObfuscatedName("client.a(IIIILJDSNLLMP;II)V")
	public final void method118(int arg0, int arg1, int arg2, JDSNLLMP arg3, int arg4, int arg5) {
		if (arg3.field788 == 0 && arg3.field807 != null && !arg3.field762 && (arg5 >= arg0 && arg1 >= arg2 && arg5 <= arg3.field812 + arg0 && arg1 <= arg3.field804 + arg2)) {
			int var7 = arg3.field807.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.field816[var8] + arg0;
				int var10 = arg3.field790[var8] + arg2 - arg4;
				JDSNLLMP var11 = JDSNLLMP.field775[arg3.field807[var8]];
				var9 += var11.field787;
				var10 += var11.field811;
				if ((var11.field794 >= 0 || var11.field771 != 0) && arg5 >= var9 && arg1 >= var10 && arg5 < var11.field812 + var9 && arg1 < var11.field804 + var10) {
					if (var11.field794 >= 0) {
						field577 = var11.field794;
					} else {
						field577 = var11.field764;
					}
				}

				if (var11.field788 == 0) {
					method118(var9, arg1, var10, var11, var11.field769, arg5);

					if (var11.field767 > var11.field804) {
						method103(var10, arg1, var11.field767, true, var11, var11.field812 + var9, var11.field804, arg5);
					}
				} else {
					if (var11.field813 == 1 && arg5 >= var9 && arg1 >= var10 && arg5 < var11.field812 + var9 && arg1 < var11.field804 + var10) {
						boolean var12 = false;
						if (var11.field772 != 0) {
							var12 = method62(var11);
						}

						if (!var12) {
							field557[field198] = var11.field803;
							field335[field198] = 170;
							field334[field198] = var11.field764;
							field198++;
						}
					}

					if (var11.field813 == 2 && field416 == 0 && arg5 >= var9 && arg1 >= var10 && arg5 < var11.field812 + var9 && arg1 < var11.field804 + var10) {
						String var13 = var11.field786;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field557[field198] = var13 + " @gre@" + var11.field785;
						field335[field198] = 496;
						field334[field198] = var11.field764;
						field198++;
					}

					if (var11.field813 == 3 && arg5 >= var9 && arg1 >= var10 && arg5 < var11.field812 + var9 && arg1 < var11.field804 + var10) {
						field557[field198] = "Close";
						field335[field198] = 815;
						field334[field198] = var11.field764;
						field198++;
					}

					if (var11.field813 == 4 && arg5 >= var9 && arg1 >= var10 && arg5 < var11.field812 + var9 && arg1 < var11.field804 + var10) {
						field557[field198] = var11.field803;
						field335[field198] = 685;
						field334[field198] = var11.field764;
						field198++;
					}

					if (var11.field813 == 5 && arg5 >= var9 && arg1 >= var10 && arg5 < var11.field812 + var9 && arg1 < var11.field804 + var10) {
						field557[field198] = var11.field803;
						field335[field198] = 262;
						field334[field198] = var11.field764;
						field198++;
					}

					if (var11.field813 == 6 && !field186 && arg5 >= var9 && arg1 >= var10 && arg5 < var11.field812 + var9 && arg1 < var11.field804 + var10) {
						field557[field198] = var11.field803;
						field335[field198] = 230;
						field334[field198] = var11.field764;
						field198++;
					}

					if (var11.field788 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field804; var15++) {
							for (int var16 = 0; var16 < var11.field812; var16++) {
								int var17 = (var11.field808 + 32) * var16 + var9;
								int var18 = (var11.field766 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field781[var14];
									var18 += var11.field806[var14];
								}

								if (arg5 >= var17 && arg1 >= var18 && arg5 < var17 + 32 && arg1 < var18 + 32) {
									field410 = var14;
									field411 = var11.field764;

									if (var11.field760[var14] > 0) {
										AIEFUHUQ var19 = AIEFUHUQ.method13(var11.field760[var14] - 1);
										if (field294 == 1 && var11.field780) {
											if (field296 != var11.field764 || field295 != var14) {
												field557[field198] = "Use " + field298 + " with @lre@" + var19.field52;
												field335[field198] = 904;
												field336[field198] = var19.field63;
												field333[field198] = var14;
												field334[field198] = var11.field764;
												field198++;
											}
										} else if (field416 != 1 || !var11.field780) {
											if (var11.field780) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field88 != null && var19.field88[var20] != null) {
														field557[field198] = var19.field88[var20] + " @lre@" + var19.field52;

														if (var20 == 3) {
															field335[field198] = 868;
														}

														if (var20 == 4) {
															field335[field198] = 197;
														}

														field336[field198] = var19.field63;
														field333[field198] = var14;
														field334[field198] = var11.field764;
														field198++;
													} else if (var20 == 4) {
														field557[field198] = "Drop @lre@" + var19.field52;
														field335[field198] = 197;
														field336[field198] = var19.field63;
														field333[field198] = var14;
														field334[field198] = var11.field764;
														field198++;
													}
												}
											}

											if (var11.field779) {
												field557[field198] = "Use @lre@" + var19.field52;
												field335[field198] = 727;
												field336[field198] = var19.field63;
												field333[field198] = var14;
												field334[field198] = var11.field764;
												field198++;
											}

											if (var11.field780 && var19.field88 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field88[var21] != null) {
														field557[field198] = var19.field88[var21] + " @lre@" + var19.field52;

														if (var21 == 0) {
															field335[field198] = 615;
														}

														if (var21 == 1) {
															field335[field198] = 826;
														}

														if (var21 == 2) {
															field335[field198] = 813;
														}

														field336[field198] = var19.field63;
														field333[field198] = var14;
														field334[field198] = var11.field764;
														field198++;
													}
												}
											}

											if (var11.field765 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field765[var22] != null) {
														field557[field198] = var11.field765[var22] + " @lre@" + var19.field52;

														if (var22 == 0) {
															field335[field198] = 440;
														}

														if (var22 == 1) {
															field335[field198] = 639;
														}

														if (var22 == 2) {
															field335[field198] = 997;
														}

														if (var22 == 3) {
															field335[field198] = 19;
														}

														if (var22 == 4) {
															field335[field198] = 972;
														}

														field336[field198] = var19.field63;
														field333[field198] = var14;
														field334[field198] = var11.field764;
														field198++;
													}
												}
											}

											field557[field198] = "Examine @lre@" + var19.field52;
											field335[field198] = 1654;
											field336[field198] = var19.field63;
											field333[field198] = var14;
											field334[field198] = var11.field764;
											field198++;
										} else if ((field418 & 0x10) == 0x10) {
											field557[field198] = field419 + " @lre@" + var19.field52;
											field335[field198] = 609;
											field336[field198] = var19.field63;
											field333[field198] = var14;
											field334[field198] = var11.field764;
											field198++;
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

	@ObfuscatedName("client.a()V")
	public final void method119() {
		method156(20, "Starting up");

		if (signlink.sunjava) {
			field889 = 5;
		}

		if (field339) {
			field432 = true;
		} else {
			field339 = true;
			boolean var1 = false;
			String var2 = method133();
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
						field206[var3] = new LEBPILPF(500000, signlink.cache_dat, signlink.cache_idx[var3], var3 + 1);
					}
				}

				try {
					method122();
					field327 = method98("title", 1, field168[1], "title screen", 25);
					field372 = new RXCVCUUO(false, "p11_full", field327);
					field373 = new RXCVCUUO(false, "p12_full", field327);
					field374 = new RXCVCUUO(false, "b12_full", field327);
					field375 = new RXCVCUUO(true, "q8_full", field327);
					method88();
					method128();
					OTSGNSQM var4 = method98("config", 2, field168[2], "config", 30);
					OTSGNSQM var5 = method98("interface", 3, field168[3], "interface", 35);
					OTSGNSQM var6 = method98("media", 4, field168[4], "2d graphics", 40);
					OTSGNSQM var7 = method98("textures", 6, field168[6], "textures", 45);
					OTSGNSQM var8 = method98("wordenc", 7, field168[7], "chat system", 50);
					OTSGNSQM var9 = method98("sounds", 8, field168[8], "sound effects", 55);
					field575 = new byte[4][104][104];
					field345 = new int[4][105][105];
					field530 = new VNYQVBWD(4, 104, field345, 104);

					for (int var10 = 0; var10 < 4; var10++) {
						field357[var10] = new GDVKBIIV(104, 104);
					}

					field362 = new DYPVESKW(512, 512);
					OTSGNSQM var11 = method98("versionlist", 5, field168[5], "update list", 60);
					method156(60, "Connecting to update server");
					field476 = new UUFZOKXH();
					field476.method449(var11, this);
					UXVWESOT.method451(field476.method438());
					OIBEFFXI.method343(field476.method435(0), field476);

					if (!field215) {
						field302 = 0;
						try {
							field302 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field303 = true;
						field476.method450(2, field302);

						while (field476.method431() > 0) {
							method138();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field476.field1157 > 3) {
								method115("ondemand");
								return;
							}
						}
					}

					method156(65, "Requesting animations");
					int var12 = field476.method435(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field476.method450(1, var13);
					}

					while (field476.method431() > 0) {
						int var14 = var12 - field476.method431();
						if (var14 > 0) {
							method156(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method138();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field476.field1157 > 3) {
							method115("ondemand");
							return;
						}
					}

					method156(70, "Requesting models");
					int var15 = field476.method435(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field476.method436(var16);
						if ((var17 & 0x1) != 0) {
							field476.method450(0, var16);
						}
					}

					int var18 = field476.method431();
					while (field476.method431() > 0) {
						int var19 = var18 - field476.method431();
						if (var19 > 0) {
							method156(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method138();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field206[0] != null) {
						method156(75, "Requesting maps");
						field476.method450(3, field476.method433(47, 0, 48));
						field476.method450(3, field476.method433(47, 1, 48));
						field476.method450(3, field476.method433(48, 0, 48));
						field476.method450(3, field476.method433(48, 1, 48));
						field476.method450(3, field476.method433(49, 0, 48));
						field476.method450(3, field476.method433(49, 1, 48));
						field476.method450(3, field476.method433(47, 0, 47));
						field476.method450(3, field476.method433(47, 1, 47));
						field476.method450(3, field476.method433(48, 0, 47));
						field476.method450(3, field476.method433(48, 1, 47));
						field476.method450(3, field476.method433(48, 0, 148));
						field476.method450(3, field476.method433(48, 1, 148));
						int var20 = field476.method431();
						while (field476.method431() > 0) {
							int var21 = var20 - field476.method431();
							if (var21 > 0) {
								method156(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method138();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field476.method435(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field476.method436(var23);
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
							field476.method443(var25, var23, 0);
						}
					}

					field476.method439(field214);

					if (!field215) {
						int var26 = field476.method435(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field476.method445(var27)) {
								field476.method443((byte) 1, var27, 2);
							}
						}
					}

					method156(80, "Unpacking media");
					field541 = new DZSIRBWX(var6, "invback", 0);
					field543 = new DZSIRBWX(var6, "chatback", 0);
					field542 = new DZSIRBWX(var6, "mapback", 0);
					field519 = new DZSIRBWX(var6, "backbase1", 0);
					field520 = new DZSIRBWX(var6, "backbase2", 0);
					field521 = new DZSIRBWX(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field257[var28] = new DZSIRBWX(var6, "sideicons", var28);
					}

					field553 = new DYPVESKW(var6, "compass", 0);
					field545 = new DYPVESKW(var6, "mapedge", 0);
					field545.method176();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field175[var29] = new DZSIRBWX(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field340[var30] = new DYPVESKW(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field533[var31] = new DYPVESKW(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field242[var32] = new DYPVESKW(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field413 = new DYPVESKW(var6, "mapmarker", 0);
					field414 = new DYPVESKW(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field337[var33] = new DYPVESKW(var6, "cross", var33);
					}

					field289 = new DYPVESKW(var6, "mapdots", 0);
					field290 = new DYPVESKW(var6, "mapdots", 1);
					field291 = new DYPVESKW(var6, "mapdots", 2);
					field292 = new DYPVESKW(var6, "mapdots", 3);
					field293 = new DYPVESKW(var6, "mapdots", 4);
					field531 = new DZSIRBWX(var6, "scrollbar", 0);
					field532 = new DZSIRBWX(var6, "scrollbar", 1);
					field423 = new DZSIRBWX(var6, "redstone1", 0);
					field424 = new DZSIRBWX(var6, "redstone2", 0);
					field425 = new DZSIRBWX(var6, "redstone3", 0);
					field426 = new DZSIRBWX(var6, "redstone1", 0);
					field426.method189();
					field427 = new DZSIRBWX(var6, "redstone2", 0);
					field427.method189();
					field436 = new DZSIRBWX(var6, "redstone1", 0);
					field436.method190();
					field437 = new DZSIRBWX(var6, "redstone2", 0);
					field437.method190();
					field438 = new DZSIRBWX(var6, "redstone3", 0);
					field438.method190();
					field439 = new DZSIRBWX(var6, "redstone1", 0);
					field439.method189();
					field439.method190();
					field440 = new DZSIRBWX(var6, "redstone2", 0);
					field440.method189();
					field440.method190();

					for (int var34 = 0; var34 < 2; var34++) {
						field228[var34] = new DZSIRBWX(var6, "mod_icons", var34);
					}

					DYPVESKW var35 = new DYPVESKW(var6, "backleft1", 0);
					field388 = new OIDSBDUP(method45(), var35.field618, var35.field619);
					var35.method177(0, 0);
					DYPVESKW var36 = new DYPVESKW(var6, "backleft2", 0);
					field389 = new OIDSBDUP(method45(), var36.field618, var36.field619);
					var36.method177(0, 0);
					DYPVESKW var37 = new DYPVESKW(var6, "backright1", 0);
					field390 = new OIDSBDUP(method45(), var37.field618, var37.field619);
					var37.method177(0, 0);
					DYPVESKW var38 = new DYPVESKW(var6, "backright2", 0);
					field391 = new OIDSBDUP(method45(), var38.field618, var38.field619);
					var38.method177(0, 0);
					DYPVESKW var39 = new DYPVESKW(var6, "backtop1", 0);
					field392 = new OIDSBDUP(method45(), var39.field618, var39.field619);
					var39.method177(0, 0);
					DYPVESKW var40 = new DYPVESKW(var6, "backvmid1", 0);
					field393 = new OIDSBDUP(method45(), var40.field618, var40.field619);
					var40.method177(0, 0);
					DYPVESKW var41 = new DYPVESKW(var6, "backvmid2", 0);
					field394 = new OIDSBDUP(method45(), var41.field618, var41.field619);
					var41.method177(0, 0);
					DYPVESKW var42 = new DYPVESKW(var6, "backvmid3", 0);
					field395 = new OIDSBDUP(method45(), var42.field618, var42.field619);
					var42.method177(0, 0);
					DYPVESKW var43 = new DYPVESKW(var6, "backhmid2", 0);
					field396 = new OIDSBDUP(method45(), var43.field618, var43.field619);
					var43.method177(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field340[var48] != null) {
							field340[var48].method175(var46 + var47, var44 + var47, var45 + var47);
						}

						if (field175[var48] != null) {
							field175[var48].method191(var46 + var47, var44 + var47, var45 + var47);
						}
					}

					method156(83, "Unpacking textures");
					LLQSXMOX.method300(var7);
					LLQSXMOX.method304(0.8D);
					LLQSXMOX.method299(20);
					method156(86, "Unpacking config");
					CGWBYVFN.method22(var4);
					SHDUUMNW.method404(var4);
					XDCFWJPT.method516(var4);
					AIEFUHUQ.method15(var4);
					FKIKYVJJ.method204(var4);
					XAYNDIOJ.method508(var4);
					IDQQUVDL.method231(var4);
					BUSRYWAJ.method19(var4);
					SXQCXZWK.method416(var4);
					AIEFUHUQ.field55 = field214;

					if (!field215) {
						method156(90, "Unpacking sounds");
						byte[] var49 = var9.method376("sounds.dat", null);
						YOXDZEVD var50 = new YOXDZEVD(var49);
						DFQOFKQS.method168(var50);
					}

					method156(95, "Unpacking interfaces");
					RXCVCUUO[] var51 = new RXCVCUUO[] { field372, field373, field374, field375 };
					JDSNLLMP.method277(var51, var5, var6);
					method156(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field542.field624[field542.field626 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field331[var52] = var53;
						field529[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field542.field624[field542.field626 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field434[var56 - 5] = var57 - 25;
						field201[var56 - 5] = var58 - var57;
					}

					LLQSXMOX.method297(479, 96);
					field453 = LLQSXMOX.field850;
					LLQSXMOX.method297(190, 261);
					field454 = LLQSXMOX.field850;
					LLQSXMOX.method297(512, 334);
					field455 = LLQSXMOX.field850;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = LLQSXMOX.field848[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					VNYQVBWD.method493(334, 500, var60, 800, 512);
					IHYZEVYW.method234(var8);
					field229 = new ANTLOSVZ(this);
					method141(field229, 10);
					CAXQGHNZ.field142 = this;
					SHDUUMNW.field1126 = this;
					FKIKYVJJ.field666 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field464 + " " + field230);
					field364 = true;
				}
			} else {
				field493 = true;
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method120() {
		try {
			if (field491 != null) {
				field491.method397();
			}
		} catch (Exception var2) {
		}

		field491 = null;
		field560 = false;
		field498 = 0;
		field184 = "";
		field185 = "";
		method111();
		field530.method457();

		for (int var1 = 0; var1 < 4; var1++) {
			field357[var1].method215();
		}

		System.gc();
		method71();
		field250 = -1;
		field302 = -1;
		field259 = 0;
	}

	@ObfuscatedName("client.D(I)Ljava/net/Socket;")
	public final Socket method121(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.E(I)V")
	public final void method122() {
		int var1 = 5;
		field168[8] = 0;
		int var2 = 0;
		while (field168[8] == 0) {
			String var3 = "Unknown problem";
			method156(20, "Connecting to web server");

			try {
				DataInputStream var4 = method123("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 315);
				YOXDZEVD var5 = new YOXDZEVD(new byte[40]);
				var4.readFully(var5.field1392, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field168[var6] = var5.method554();
				}

				int var7 = var5.method554();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field168[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field168[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field168[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field168[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field168[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field168[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method156(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method156(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field181 = !field181;
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method123(String arg0) throws IOException {
		if (field181) {
			if (field497 != null) {
				try {
					field497.close();
				} catch (Exception var4) {
				}

				field497 = null;
			}

			field497 = method121(43595);
			field497.setSoTimeout(10000);
			InputStream var2 = field497.getInputStream();
			OutputStream var3 = field497.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.b(II)V")
	public final void method124(int arg0) {
		int var2 = BUSRYWAJ.field121[arg0].field129;
		if (var2 != 0) {
			int var3 = field572[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					LLQSXMOX.method304(0.9D);
				}

				if (var3 == 2) {
					LLQSXMOX.method304(0.8D);
				}

				if (var3 == 3) {
					LLQSXMOX.method304(0.7D);
				}

				if (var3 == 4) {
					LLQSXMOX.method304(0.6D);
				}

				AIEFUHUQ.field87.method229();
				field506 = true;
			}

			if (var2 == 3) {
				boolean var4 = field322;

				if (var3 == 0) {
					method155(0, field322);
					field322 = true;
				}

				if (var3 == 1) {
					method155(-400, field322);
					field322 = true;
				}

				if (var3 == 2) {
					method155(-800, field322);
					field322 = true;
				}

				if (var3 == 3) {
					method155(-1200, field322);
					field322 = true;
				}

				if (var3 == 4) {
					field322 = false;
				}

				if (field322 != var4 && !field215) {
					if (field322) {
						field302 = field250;
						field303 = true;
						field476.method450(2, field302);
					} else {
						method71();
					}

					field259 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field223 = true;
					method107(0);
				}

				if (var3 == 1) {
					field223 = true;
					method107(-400);
				}

				if (var3 == 2) {
					field223 = true;
					method107(-800);
				}

				if (var3 == 3) {
					field223 = true;
					method107(-1200);
				}

				if (var3 == 4) {
					field223 = false;
				}
			}

			if (var2 == 5) {
				field199 = var3;
			}

			if (var2 == 6) {
				field502 = var3;
			}

			if (var2 == 8) {
				field243 = var3;
				field376 = true;
			}

			if (var2 == 9) {
				field513 = var3;
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method125() {
		if (field435 == 2) {
			method140(field472 * 2, (field470 - field224 << 7) + field473, (field471 - field225 << 7) + field474);

			if (field329 > -1 && field316 % 20 < 10) {
				field242[2].method179(field330 - 28, field329 - 12);
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method126() {
		if (field518 == 2) {
			for (AIQUEQRG var1 = (AIQUEQRG) field171.method528(); var1 != null; var1 = (AIQUEQRG) field171.method530()) {
				if (var1.field109 > 0) {
					var1.field109--;
				}

				if (var1.field109 != 0) {
					if (var1.field110 > 0) {
						var1.field110--;
					}

					if (var1.field110 == 0 && var1.field101 >= 1 && var1.field102 >= 1 && var1.field101 <= 102 && var1.field102 <= 102 && (var1.field103 < 0 || MBPQTDOR.method316(var1.field105, var1.field103))) {
						method70(var1.field100, var1.field105, var1.field101, var1.field103, var1.field104, var1.field102, var1.field99);
						var1.field110 = -1;

						if (var1.field106 == var1.field103 && var1.field106 == -1) {
							var1.method589();
						} else if (var1.field106 == var1.field103 && var1.field107 == var1.field104 && var1.field108 == var1.field105) {
							var1.method589();
						}
					}
				} else if (var1.field106 < 0 || MBPQTDOR.method316(var1.field108, var1.field106)) {
					method70(var1.field100, var1.field108, var1.field101, var1.field106, var1.field107, var1.field102, var1.field99);
					var1.method589();
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public static final void method127() {
		VNYQVBWD.field1199 = false;
		LLQSXMOX.field839 = false;
		field215 = false;
		MBPQTDOR.field863 = false;
		SHDUUMNW.field1120 = false;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method128() {
		field251 = new DZSIRBWX(field327, "titlebox", 0);
		field252 = new DZSIRBWX(field327, "titlebutton", 0);
		field574 = new DZSIRBWX[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field574[var2] = new DZSIRBWX(field327, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field574[var3] = new DZSIRBWX(field327, "runes", (var3 & 0x3) + 12);
			}
		}

		field524 = new DYPVESKW(128, 265);
		field525 = new DYPVESKW(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field524.field617[var4] = field271.field1020[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field525.field617[var5] = field272.field1020[var5];
		}

		field188 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field188[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field188[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field188[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field188[var9 + 192] = 0xFFFFFF;
		}

		field189 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field189[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field189[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field189[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field189[var13 + 192] = 0xFFFFFF;
		}

		field190 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field190[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field190[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field190[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field190[var17 + 192] = 0xFFFFFF;
		}

		field187 = new int[256];
		field358 = new int[32768];
		field359 = new int[32768];
		method56(null);
		field527 = new int[32768];
		field528 = new int[32768];
		method156(10, "Connecting to fileserver");

		if (!field477) {
			field318 = true;
			field477 = true;
			method141(this, 2);
		}
	}

	@ObfuscatedName("client.a(BILYOXDZEVD;)V")
	public final void method129(int arg0, YOXDZEVD arg1) {
		while (arg1.field1394 + 10 < arg0 * 8) {
			int var3 = arg1.method560(11);
			if (var3 == 2047) {
				break;
			}

			if (field443[var3] == null) {
				field443[var3] = new AGFDLNBY();
				if (field448[var3] != null) {
					field443[var3].method4(field448[var3]);
				}
			}

			field445[field444++] = var3;
			AGFDLNBY var4 = field443[var3];
			var4.field1365 = field316;
			int var5 = arg1.method560(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method560(1);
			int var7 = arg1.method560(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method560(1);
			if (var8 == 1) {
				field447[field446++] = var3;
			}

			var4.method533(field404.field1361[0] + var5, field404.field1360[0] + var7, var6 == 1);
		}

		arg1.method561();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method130(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field366 = "";
				field367 = "Connecting to server...";
				method132(true);
			}

			field491 = new SFXLZPAR(this, method121(field213 + 43594));
			long var4 = FWDMWOLO.method209(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field210.field1393 = 0;
			field210.method539(14);
			field210.method539(var6);
			field491.method401(2, 0, field210.field1392);

			for (int var7 = 0; var7 < 8; var7++) {
				field491.method398();
			}

			int var8 = field491.method398();
			int var9 = var8;

			if (var8 == 0) {
				field491.method400(field508.field1392, 0, 8);
				field508.field1393 = 0;
				field512 = field508.method555();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field512 >> 32), (int) field512 };
				field210.field1393 = 0;
				field210.method539(10);
				field210.method543(var10[0]);
				field210.method543(var10[1]);
				field210.method543(var10[2]);
				field210.method543(var10[3]);
				field210.method543(signlink.uid);
				field210.method546(arg0);
				field210.method546(arg1);
				field210.method564(field317, field566);
				field182.field1393 = 0;

				if (arg2) {
					field182.method539(18);
				} else {
					field182.method539(16);
				}

				field182.method539(field210.field1393 + 36 + 1 + 1 + 2);
				field182.method539(255);
				field182.method540(315);
				field182.method539(field215 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field182.method543(field168[var11]);
				}

				field182.method547(0, field210.field1392, field210.field1393);
				field210.field1397 = new POKVNZOV(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field537 = new POKVNZOV(var10);
				field491.method401(field182.field1393, 0, field182.field1392);
				var8 = field491.method398();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method130(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field347 = field491.method398();
				field326 = field491.method398() == 1;
				field378 = 0L;
				field507 = 0;
				field229.field113 = 0;
				field900 = true;
				field421 = true;
				field560 = true;
				field210.field1393 = 0;
				field508.field1393 = 0;
				field194 = -1;
				field305 = -1;
				field306 = -1;
				field307 = -1;
				field193 = 0;
				field195 = 0;
				field258 = 0;
				field197 = 0;
				field435 = 0;
				field198 = 0;
				field353 = false;
				field901 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field463[var13] = null;
				}

				field294 = 0;
				field416 = 0;
				field518 = 0;
				field354 = 0;
				field480 = (int) (Math.random() * 100.0D) - 50;
				field402 = (int) (Math.random() * 110.0D) - 55;
				field546 = (int) (Math.random() * 80.0D) - 40;
				field323 = (int) (Math.random() * 120.0D) - 60;
				field232 = (int) (Math.random() * 30.0D) - 20;
				field484 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field180 = 0;
				field191 = -1;
				field360 = 0;
				field361 = 0;
				field444 = 0;
				field246 = 0;

				for (int var14 = 0; var14 < field441; var14++) {
					field443[var14] = null;
					field448[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field245[var15] = null;
				}

				field404 = field443[field442] = new AGFDLNBY();
				field469.method532();
				field332.method532();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field556[var16][var17][var18] = null;
						}
					}
				}

				field171 = new YLURZVWU();
				field466 = 0;
				field465 = 0;
				field450 = -1;
				field548 = -1;
				field401 = -1;
				field398 = -1;
				field522 = -1;
				field186 = false;
				field590 = 3;
				field282 = 0;
				field353 = false;
				field422 = false;
				field377 = null;
				field500 = 0;
				field356 = -1;
				field222 = true;
				method46();

				for (int var19 = 0; var19 < 5; var19++) {
					field479[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field320[var20] = null;
					field321[var20] = false;
				}

				field371 = 0;
				field467 = 0;
				field207 = 0;
				field368 = 0;
				field516 = 0;
				field570 = 0;
				field499 = 0;
				field179 = 0;
				method158();
			} else if (var8 == 3) {
				field366 = "";
				field367 = "Invalid username or password.";
			} else if (var8 == 4) {
				field366 = "Your account has been disabled.";
				field367 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field366 = "Your account is already logged in.";
				field367 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field366 = "RuneScape has been updated!";
				field367 = "Please reload this page.";
			} else if (var8 == 7) {
				field366 = "This world is full.";
				field367 = "Please use a different world.";
			} else if (var8 == 8) {
				field366 = "Unable to connect.";
				field367 = "Login server offline.";
			} else if (var8 == 9) {
				field366 = "Login limit exceeded.";
				field367 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field366 = "Unable to connect.";
				field367 = "Bad session id.";
			} else if (var8 == 11) {
				field367 = "Login server rejected session.";
				field367 = "Please try again.";
			} else if (var8 == 12) {
				field366 = "You need a members account to login to this world.";
				field367 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field366 = "Could not complete login.";
				field367 = "Please try using a different world.";
			} else if (var8 == 14) {
				field366 = "The server is being updated.";
				field367 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field560 = true;
				field210.field1393 = 0;
				field508.field1393 = 0;
				field194 = -1;
				field305 = -1;
				field306 = -1;
				field307 = -1;
				field193 = 0;
				field195 = 0;
				field258 = 0;
				field198 = 0;
				field353 = false;
				field344 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field366 = "Login attempts exceeded.";
				field367 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field366 = "You are standing in a members-only area.";
				field367 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field366 = "Invalid loginserver requested";
				field367 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field491.method398(); var21 >= 0; var21--) {
					field366 = "You have only just left another world";
					field367 = "Your profile will be transferred in: " + var21 + " seconds";
					method132(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method130(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field366 = "Unexpected server response";
				field367 = "Please try using a different world.";
			} else if (var9 != 0) {
				field366 = "No response from server";
				field367 = "Please try using a different world.";
			} else if (field515 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field515++;
				method130(arg0, arg1, arg2);
			} else {
				field366 = "No response from loginserver";
				field367 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field366 = "";
			field367 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method131() {
		for (int var1 = 0; var1 < field354; var1++) {
			if (field449[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field166[var1] != field511 || field381[var1] != field248) {
						YOXDZEVD var3 = DFQOFKQS.method169(field381[var1], field166[var1]);
						if (System.currentTimeMillis() + var3.field1393 / 22 > field475 / 22 + field482) {
							field475 = var3.field1393;
							field482 = System.currentTimeMillis();

							if (method73(var3.field1392, var3.field1393)) {
								field511 = field166[var1];
								field248 = field381[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method43()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field449[var1] != -5) {
					field449[var1] = -5;
				} else {
					field354--;
					for (int var5 = var1; var5 < field354; var5++) {
						field166[var5] = field166[var5 + 1];
						field381[var5] = field381[var5 + 1];
						field449[var5] = field449[var5 + 1];
					}

					var1--;
				}
			} else {
				field449[var1]--;
			}
		}

		if (field259 > 0) {
			field259 -= 20;
			if (field259 < 0) {
				field259 = 0;
			}

			if (field259 == 0 && field322 && !field215) {
				field302 = field250;
				field303 = true;
				field476.method450(2, field302);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void method132(boolean arg0) {
		method165();
		field270.method372();
		field251.method192(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field498 == 0) {
			int var4 = var3 / 2 + 80;
			field372.method383(var4, 0x75A9A9, var2 / 2, true, field476.field1161);
			int var5 = var3 / 2 - 20;
			field374.method383(var5, 0xFFFF00, var2 / 2, true, "Welcome to RuneScape");
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field252.method192(var7 - 20, var6 - 73);
			field374.method383(var7 + 5, 0xFFFFFF, var6, true, "New User");
			int var8 = var2 / 2 + 80;
			field252.method192(var7 - 20, var8 - 73);
			field374.method383(var7 + 5, 0xFFFFFF, var8, true, "Existing User");
		}

		if (field498 == 2) {
			int var9 = var3 / 2 - 40;
			if (field366.length() > 0) {
				field374.method383(var9 - 15, 0xFFFF00, var2 / 2, true, field366);
				field374.method383(var9, 0xFFFF00, var2 / 2, true, field367);
				var9 += 30;
			} else {
				field374.method383(var9 - 7, 0xFFFF00, var2 / 2, true, field367);
				var9 += 30;
			}

			field374.method390("Username: " + field184 + (field400 == 0 & field316 % 40 < 20 ? "@yel@|" : ""), var9, var2 / 2 - 90, 0xFFFFFF, true);
			var9 += 15;
			field374.method390("Password: " + FWDMWOLO.method214(field185) + (field400 == 1 & field316 % 40 < 20 ? "@yel@|" : ""), var9, var2 / 2 - 88, 0xFFFFFF, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field252.method192(var11 - 20, var10 - 73);
				field374.method383(var11 + 5, 0xFFFFFF, var10, true, "Login");
				int var12 = var2 / 2 + 80;
				field252.method192(var11 - 20, var12 - 73);
				field374.method383(var11 + 5, 0xFFFFFF, var12, true, "Cancel");
			}
		}

		if (field498 == 3) {
			field374.method383(var3 / 2 - 60, 0xFFFF00, var2 / 2, true, "Create a free account");
			int var13 = var3 / 2 - 35;
			field374.method383(var13, 0xFFFFFF, var2 / 2, true, "To create a new account you need to");
			var13 += 15;
			field374.method383(var13, 0xFFFFFF, var2 / 2, true, "go back to the main RuneScape webpage");
			var13 += 15;
			field374.method383(var13, 0xFFFFFF, var2 / 2, true, "and choose the red 'create account'");
			var13 += 15;
			field374.method383(var13, 0xFFFFFF, var2 / 2, true, "button at the top right of that page.");
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field252.method192(var15 - 20, var14 - 73);
			field374.method383(var15 + 5, 0xFFFFFF, var14, true, "Cancel");
		}

		field270.method373(171, field895, 202);

		if (field506) {
			field506 = false;
			field268.method373(0, field895, 128);
			field269.method373(371, field895, 202);
			field273.method373(265, field895, 0);
			field274.method373(265, field895, 562);
			field275.method373(171, field895, 128);
			field276.method373(171, field895, 562);
		}
	}

	@ObfuscatedName("client.H(I)Ljava/lang/String;")
	public final String method133() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field898 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(IILYOXDZEVD;)V")
	public final void method134(int arg0, YOXDZEVD arg1) {
		arg1.method559();
		int var3 = arg1.method560(8);
		if (var3 < field246) {
			for (int var4 = var3; var4 < field246; var4++) {
				field309[field308++] = field247[var4];
			}
		}

		if (var3 > field246) {
			signlink.reporterror(field184 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field246 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field247[var5];
			CMGLYFCQ var7 = field245[var6];
			int var8 = arg1.method560(1);
			if (var8 == 0) {
				field247[field246++] = var6;
				var7.field1365 = field316;
			} else {
				int var9 = arg1.method560(2);
				if (var9 == 0) {
					field247[field246++] = var6;
					var7.field1365 = field316;
					field447[field446++] = var6;
				} else if (var9 == 1) {
					field247[field246++] = var6;
					var7.field1365 = field316;
					int var10 = arg1.method560(3);
					var7.method536(var10, false);
					int var11 = arg1.method560(1);
					if (var11 == 1) {
						field447[field446++] = var6;
					}
				} else if (var9 == 2) {
					field247[field246++] = var6;
					var7.field1365 = field316;
					int var12 = arg1.method560(3);
					var7.method536(var12, true);
					int var13 = arg1.method560(3);
					var7.method536(var13, true);
					int var14 = arg1.method560(1);
					if (var14 == 1) {
						field447[field446++] = var6;
					}
				} else if (var9 == 3) {
					field309[field308++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IZ)Ljava/lang/String;")
	public static final String method135(int arg0) {
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

	@ObfuscatedName("client.I(I)V")
	public final void method136() {
		if (field909 == 1) {
			if (field910 >= 539 && field910 <= 573 && field911 >= 169 && field911 < 205 && field492[0] != -1) {
				field174 = true;
				field590 = 0;
				field310 = true;
			}

			if (field910 >= 569 && field910 <= 599 && field911 >= 168 && field911 < 205 && field492[1] != -1) {
				field174 = true;
				field590 = 1;
				field310 = true;
			}

			if (field910 >= 597 && field910 <= 627 && field911 >= 168 && field911 < 205 && field492[2] != -1) {
				field174 = true;
				field590 = 2;
				field310 = true;
			}

			if (field910 >= 625 && field910 <= 669 && field911 >= 168 && field911 < 203 && field492[3] != -1) {
				field174 = true;
				field590 = 3;
				field310 = true;
			}

			if (field910 >= 666 && field910 <= 696 && field911 >= 168 && field911 < 205 && field492[4] != -1) {
				field174 = true;
				field590 = 4;
				field310 = true;
			}

			if (field910 >= 694 && field910 <= 724 && field911 >= 168 && field911 < 205 && field492[5] != -1) {
				field174 = true;
				field590 = 5;
				field310 = true;
			}

			if (field910 >= 722 && field910 <= 756 && field911 >= 169 && field911 < 205 && field492[6] != -1) {
				field174 = true;
				field590 = 6;
				field310 = true;
			}

			if (field910 >= 540 && field910 <= 574 && field911 >= 466 && field911 < 502 && field492[7] != -1) {
				field174 = true;
				field590 = 7;
				field310 = true;
			}

			if (field910 >= 572 && field910 <= 602 && field911 >= 466 && field911 < 503 && field492[8] != -1) {
				field174 = true;
				field590 = 8;
				field310 = true;
			}

			if (field910 >= 599 && field910 <= 629 && field911 >= 466 && field911 < 503 && field492[9] != -1) {
				field174 = true;
				field590 = 9;
				field310 = true;
			}

			if (field910 >= 627 && field910 <= 671 && field911 >= 467 && field911 < 502 && field492[10] != -1) {
				field174 = true;
				field590 = 10;
				field310 = true;
			}

			if (field910 >= 669 && field910 <= 699 && field911 >= 466 && field911 < 503 && field492[11] != -1) {
				field174 = true;
				field590 = 11;
				field310 = true;
			}

			if (field910 >= 696 && field910 <= 726 && field911 >= 466 && field911 < 503 && field492[12] != -1) {
				field174 = true;
				field590 = 12;
				field310 = true;
			}

			if (field910 >= 724 && field910 <= 758 && field911 >= 466 && field911 < 502 && field492[13] != -1) {
				field174 = true;
				field590 = 13;
				field310 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method137() {
		int var1 = field374.method384("Choose Option");
		for (int var2 = 0; var2 < field198; var2++) {
			int var3 = field374.method384(field557[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field198 * 15 + 21;
		if (field910 > 4 && field911 > 4 && field910 < 516 && field911 < 338) {
			int var5 = field910 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field911 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field353 = true;
			field236 = 0;
			field237 = var5;
			field238 = var6;
			field239 = var1;
			field240 = field198 * 15 + 22;
		}

		if (field910 > 553 && field911 > 205 && field910 < 743 && field911 < 466) {
			int var7 = field910 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field911 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field353 = true;
			field236 = 1;
			field237 = var7;
			field238 = var8;
			field239 = var1;
			field240 = field198 * 15 + 22;
		}

		if (field910 > 17 && field911 > 357 && field910 < 496 && field911 < 453) {
			int var9 = field910 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field911 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field353 = true;
			field236 = 2;
			field237 = var9;
			field238 = var10;
			field239 = var1;
			field240 = field198 * 15 + 22;
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method138() {
		while (true) {
			NCZPZCRJ var1 = field476.method446();
			if (var1 == null) {
				return;
			}

			if (var1.field921 == 0) {
				OIBEFFXI.method344(var1.field918, var1.field919);

				if ((field476.method436(var1.field918) & 0x62) != 0) {
					field174 = true;

					if (field548 != -1) {
						field376 = true;
					}
				}
			}

			if (var1.field921 == 1 && var1.field919 != null) {
				UXVWESOT.method452(var1.field919);
			}

			if (var1.field921 == 2 && field302 == var1.field918 && var1.field919 != null) {
				method68(var1.field919, field303);
			}

			if (var1.field921 == 3 && field518 == 1) {
				for (int var2 = 0; var2 < field494.length; var2++) {
					if (field429[var2] == var1.field918) {
						field494[var2] = var1.field919;

						if (var1.field919 == null) {
							field429[var2] = -1;
						}

						break;
					}

					if (field430[var2] == var1.field918) {
						field490[var2] = var1.field919;

						if (var1.field919 == null) {
							field430[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field921 == 93 && field476.method434(var1.field918)) {
				MBPQTDOR.method317(field476, new YOXDZEVD(var1.field919));
			}
		}
	}

	@ObfuscatedName("client.a(BILYOWFBYTG;)V")
	public final void method139(int arg0, YOWFBYTG arg1) {
		method140(arg0, arg1.field1370, arg1.field1371);
	}

	@ObfuscatedName("client.c(IIII)V")
	public final void method140(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
			int var4 = method81(arg2, field451, arg1) - arg0;
			arg1 -= field405;
			var4 -= field406;
			arg2 -= field407;
			int var5 = OIBEFFXI.field1016[field408];
			int var6 = OIBEFFXI.field1017[field408];
			int var7 = OIBEFFXI.field1016[field409];
			int var8 = OIBEFFXI.field1017[field409];
			int var9 = arg1 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				field329 = (var9 << 9) / arg2 + LLQSXMOX.field844;
				field330 = (var11 << 9) / arg2 + LLQSXMOX.field845;
			} else {
				field329 = -1;
				field330 = -1;
			}
		} else {
			field329 = -1;
			field330 = -1;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method141(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method141(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method142() {
		signlink.reporterror = false;

		try {
			if (field491 != null) {
				field491.method397();
			}
		} catch (Exception var1) {
		}

		field491 = null;
		method71();

		if (field229 != null) {
			field229.field116 = false;
		}

		field229 = null;
		field476.method440();
		field476 = null;
		field244 = null;
		field210 = null;
		field182 = null;
		field508 = null;
		field428 = null;
		field494 = null;
		field490 = null;
		field429 = null;
		field430 = null;
		field345 = null;
		field575 = null;
		field530 = null;
		field357 = null;
		field514 = null;
		field369 = null;
		field220 = null;
		field221 = null;
		field555 = null;
		field202 = null;
		field203 = null;
		field204 = null;
		field205 = null;
		field254 = null;
		field255 = null;
		field256 = null;
		field388 = null;
		field389 = null;
		field390 = null;
		field391 = null;
		field392 = null;
		field393 = null;
		field394 = null;
		field395 = null;
		field396 = null;
		field541 = null;
		field542 = null;
		field543 = null;
		field519 = null;
		field520 = null;
		field521 = null;
		field257 = null;
		field423 = null;
		field424 = null;
		field425 = null;
		field426 = null;
		field427 = null;
		field436 = null;
		field437 = null;
		field438 = null;
		field439 = null;
		field440 = null;
		field553 = null;
		field533 = null;
		field242 = null;
		field337 = null;
		field289 = null;
		field290 = null;
		field291 = null;
		field292 = null;
		field293 = null;
		field175 = null;
		field340 = null;
		field412 = null;
		field443 = null;
		field445 = null;
		field447 = null;
		field448 = null;
		field309 = null;
		field245 = null;
		field247 = null;
		field556 = null;
		field171 = null;
		field469 = null;
		field332 = null;
		field333 = null;
		field334 = null;
		field335 = null;
		field336 = null;
		field557 = null;
		field572 = null;
		field261 = null;
		field262 = null;
		field536 = null;
		field362 = null;
		field539 = null;
		field172 = null;
		field431 = null;
		field271 = null;
		field272 = null;
		field268 = null;
		field269 = null;
		field270 = null;
		field273 = null;
		field274 = null;
		field275 = null;
		field276 = null;
		method97();
		SHDUUMNW.method407();
		FKIKYVJJ.method207();
		AIEFUHUQ.method7();
		XDCFWJPT.field1318 = null;
		XAYNDIOJ.field1286 = null;
		JDSNLLMP.field775 = null;
		DDQOGLSA.field592 = null;
		CGWBYVFN.field150 = null;
		IDQQUVDL.field738 = null;
		IDQQUVDL.field750 = null;
		BUSRYWAJ.field121 = null;
		field896 = null;
		AGFDLNBY.field14 = null;
		LLQSXMOX.method295();
		VNYQVBWD.method456();
		OIBEFFXI.method342();
		UXVWESOT.method453();
		System.gc();
	}

	@ObfuscatedName("client.K(I)V")
	public final void method143() {
		if (field215 && field518 == 2 && MBPQTDOR.field862 != field451) {
			field204.method372();
			field373.method382(0, "Loading - please wait.", 151, 257);
			field373.method382(0xFFFFFF, "Loading - please wait.", 150, 256);
			field204.method373(4, field895, 4);
			field518 = 1;
			field344 = System.currentTimeMillis();
		}

		if (field518 == 1) {
			int var1 = method144();
			if (var1 != 0 && System.currentTimeMillis() - field344 > 360000L) {
				signlink.reporterror(field184 + " glcfb " + field512 + "," + var1 + "," + field215 + "," + field206[0] + "," + field476.method431() + "," + field451 + "," + field208 + "," + field209);
				field344 = System.currentTimeMillis();
			}
		}

		if (field518 == 2 && field451 != field191) {
			field191 = field451;
			method95(field451);
		}
	}

	@ObfuscatedName("client.l(Z)I")
	public final int method144() {
		for (int var1 = 0; var1 < field494.length; var1++) {
			if (field494[var1] == null && field429[var1] != -1) {
				return -1;
			}

			if (field490[var1] == null && field430[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field494.length; var3++) {
			byte[] var4 = field490[var3];
			if (var4 != null) {
				int var5 = (field428[var3] >> 8) * 64 - field224;
				int var6 = (field428[var3] & 0xFF) * 64 - field225;
				if (field283) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= MBPQTDOR.method314(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field563) {
			return -4;
		} else {
			field518 = 2;
			MBPQTDOR.field862 = field451;
			method109();
			field210.method538(46);
			return 0;
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method145() {
		field588 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field477) {
				field495++;
				method93();
				method93();
				method77();
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

		field588 = false;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;Z)V")
	public final void method146(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field450 != -1) {
			field377 = arg1;
			field909 = 0;
		}

		if (field548 == -1) {
			field376 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field461[var4] = field461[var4 - 1];
			field462[var4] = field462[var4 - 1];
			field463[var4] = field463[var4 - 1];
		}

		field461[0] = arg0;
		field462[0] = arg2;
		field463[0] = arg1;
	}

	@ObfuscatedName("client.a(BIILFKIKYVJJ;I)V")
	public final void method147(int arg0, int arg1, FKIKYVJJ arg2, int arg3) {
		if (field198 < 400) {
			if (arg2.field688 != null) {
				arg2 = arg2.method206();
			}

			if (arg2 != null && arg2.field674) {
				String var5 = arg2.field691;
				if (arg2.field692 != 0) {
					var5 = var5 + method65(field404.field3, arg2.field692) + " (level-" + arg2.field692 + ")";
				}

				if (field294 == 1) {
					field557[field198] = "Use " + field298 + " with @yel@" + var5;
					field335[field198] = 971;
					field336[field198] = arg0;
					field333[field198] = arg3;
					field334[field198] = arg1;
					field198++;
				} else if (field416 != 1) {
					if (arg2.field668 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field668[var6] != null && !arg2.field668[var6].equalsIgnoreCase("attack")) {
								field557[field198] = arg2.field668[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field335[field198] = 38;
								}

								if (var6 == 1) {
									field335[field198] = 467;
								}

								if (var6 == 2) {
									field335[field198] = 585;
								}

								if (var6 == 3) {
									field335[field198] = 966;
								}

								if (var6 == 4) {
									field335[field198] = 691;
								}

								field336[field198] = arg0;
								field333[field198] = arg3;
								field334[field198] = arg1;
								field198++;
							}
						}
					}

					if (arg2.field668 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field668[var7] != null && arg2.field668[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field692 > field404.field3) {
									var8 = 2000;
								}

								field557[field198] = arg2.field668[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field335[field198] = var8 + 38;
								}

								if (var7 == 1) {
									field335[field198] = var8 + 467;
								}

								if (var7 == 2) {
									field335[field198] = var8 + 585;
								}

								if (var7 == 3) {
									field335[field198] = var8 + 966;
								}

								if (var7 == 4) {
									field335[field198] = var8 + 691;
								}

								field336[field198] = arg0;
								field333[field198] = arg3;
								field334[field198] = arg1;
								field198++;
							}
						}
					}

					field557[field198] = "Examine @yel@" + var5;
					field335[field198] = 1171;
					field336[field198] = arg0;
					field333[field198] = arg3;
					field334[field198] = arg1;
					field198++;
				} else if ((field418 & 0x2) == 2) {
					field557[field198] = field419 + " @yel@" + var5;
					field335[field198] = 600;
					field336[field198] = arg0;
					field333[field198] = arg3;
					field334[field198] = arg1;
					field198++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.d(IIII)I")
	public final int method148(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method149() {
		field325++;
		method164(true);
		method112(true);
		method164(false);
		method112(false);
		method151();
		method41();

		if (!field538) {
			int var1 = field483;
			if (field571 / 256 > var1) {
				var1 = field571 / 256;
			}

			if (field241[4] && field363[4] + 128 > var1) {
				var1 = field363[4] + 128;
			}

			int var2 = field546 + field484 & 0x7FF;
			method105(var1, var2, field312, method81(field404.field1371, field451, field404.field1370) - 50, var1 * 3 + 600, field313);
		}

		int var3;
		if (field538) {
			var3 = method76();
		} else {
			var3 = method75();
		}

		int var4 = field405;
		int var5 = field406;
		int var6 = field407;
		int var7 = field408;
		int var8 = field409;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field241[var9]) {
				int var10 = (int) (Math.random() * (field573[var9] * 2 + 1) + Math.sin(field561[var9] / 100.0D * field399[var9]) * field363[var9] - field573[var9]);
				if (var9 == 0) {
					field405 += var10;
				}

				if (var9 == 1) {
					field406 += var10;
				}

				if (var9 == 2) {
					field407 += var10;
				}

				if (var9 == 3) {
					field409 = field409 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field408 += var10;
					if (field408 < 128) {
						field408 = 128;
					}

					if (field408 > 383) {
						field408 = 383;
					}
				}
			}
		}

		int var11 = LLQSXMOX.field859;
		OIBEFFXI.field1011 = true;
		OIBEFFXI.field1014 = 0;
		OIBEFFXI.field1012 = field903 - 4;
		OIBEFFXI.field1013 = field904 - 4;
		KNERFXXY.method282();
		field530.method496(field406, var3, field409, field405, field408, field407);
		field530.method471();
		method108();
		method125();
		method116(var11);
		method150();
		field204.method373(4, field895, 4);
		field405 = var4;
		field406 = var5;
		field407 = var6;
		field408 = var7;
		field409 = var8;
	}

	@ObfuscatedName("client.n(B)V")
	public final void method150() {
		method28();

		if (field219 == 1) {
			field337[field218 / 100].method179(field217 - 8 - 4, field216 - 8 - 4);
		}

		if (field219 == 2) {
			field337[field218 / 100 + 4].method179(field217 - 8 - 4, field216 - 8 - 4);
		}

		if (field522 != -1) {
			method42(field301, field522);
			method78(0, JDSNLLMP.field775[field522], 0, 0);
		}

		if (field401 != -1) {
			method42(field301, field401);
			method78(0, JDSNLLMP.field775[field401], 0, 0);
		}

		method29();

		if (!field353) {
			method86();
			method31();
		} else if (field236 == 0) {
			method69();
		}

		if (field500 == 1) {
			field242[1].method179(296, 472);
		}

		if (field355) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field891 < 15) {
				var3 = 0xFF0000;
			}

			field373.method381(var1, var2, "Fps:" + field891, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field215) {
				int var7 = 0xFF0000;
			}

			field373.method381(var1, var2, "Mem:" + var5 + "k", 0xFFFF00);
			var2 += 15;
		}

		if (field258 != 0) {
			int var8 = field258 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field373.method386(4, "System update in: " + var9 + ":0" + var8, 0xFFFF00, 329);
			} else {
				field373.method386(4, "System update in: " + var9 + ":" + var8, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method151() {
		for (XCJHWHNQ var1 = (XCJHWHNQ) field469.method528(); var1 != null; var1 = (XCJHWHNQ) field469.method530()) {
			if (field451 != var1.field1297 || field316 > var1.field1304) {
				var1.method589();
			} else if (field316 >= var1.field1303) {
				if (var1.field1307 > 0) {
					CMGLYFCQ var2 = field245[var1.field1307 - 1];
					if (var2 != null && var2.field1370 >= 0 && var2.field1370 < 13312 && var2.field1371 >= 0 && var2.field1371 < 13312) {
						var1.method514(var2.field1371, field316, method81(var2.field1371, var1.field1297, var2.field1370) - var1.field1296, var2.field1370);
					}
				}

				if (var1.field1307 < 0) {
					int var3 = -var1.field1307 - 1;
					AGFDLNBY var4;
					if (field253 == var3) {
						var4 = field404;
					} else {
						var4 = field443[var3];
					}

					if (var4 != null && var4.field1370 >= 0 && var4.field1370 < 13312 && var4.field1371 >= 0 && var4.field1371 < 13312) {
						var1.method514(var4.field1371, field316, method81(var4.field1371, var1.field1297, var4.field1370) - var1.field1296, var4.field1370);
					}
				}

				var1.method515(field301);
				field530.method468((int) var1.field1309, false, (int) var1.field1310, (int) var1.field1308, -1, field451, var1, var1.field1301, 60);
			}
		}
	}

	@ObfuscatedName("client.a(LAGFDLNBY;IIII)V")
	public final void method152(AGFDLNBY arg0, int arg1, int arg2, int arg3) {
		if (field404 != arg0 && field198 < 400) {
			String var5;
			if (arg0.field13 == 0) {
				var5 = arg0.field11 + method65(field404.field3, arg0.field3) + " (level-" + arg0.field3 + ")";
			} else {
				var5 = arg0.field11 + " (skill-" + arg0.field13 + ")";
			}

			if (field294 == 1) {
				field557[field198] = "Use " + field298 + " with @whi@" + var5;
				field335[field198] = 558;
				field336[field198] = arg2;
				field333[field198] = arg3;
				field334[field198] = arg1;
				field198++;
			} else if (field416 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field320[var6] != null) {
						field557[field198] = field320[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field320[var6].equalsIgnoreCase("attack")) {
							if (arg0.field3 > field404.field3) {
								var7 = 2000;
							}

							if (field404.field1 != 0 && arg0.field1 != 0) {
								if (field404.field1 == arg0.field1) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field321[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field335[field198] = var7 + 445;
						}

						if (var6 == 1) {
							field335[field198] = var7 + 57;
						}

						if (var6 == 2) {
							field335[field198] = var7 + 831;
						}

						if (var6 == 3) {
							field335[field198] = var7 + 359;
						}

						if (var6 == 4) {
							field335[field198] = var7 + 404;
						}

						field336[field198] = arg2;
						field333[field198] = arg3;
						field334[field198] = arg1;
						field198++;
					}
				}
			} else if ((field418 & 0x8) == 8) {
				field557[field198] = field419 + " @whi@" + var5;
				field335[field198] = 654;
				field336[field198] = arg2;
				field333[field198] = arg3;
				field334[field198] = arg1;
				field198++;
			}

			for (int var8 = 0; var8 < field198; var8++) {
				if (field335[var8] == 746) {
					field557[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLJDSNLLMP;I)I")
	public final int method153(JDSNLLMP arg0, int arg1) {
		if (arg0.field805 == null || arg1 >= arg0.field805.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field805[arg1];
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
					var8 = field382[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field284[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field264[var3[var5++]];
				}

				if (var7 == 4) {
					JDSNLLMP var10 = JDSNLLMP.field775[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < AIEFUHUQ.field57 && (!AIEFUHUQ.method13(var11).field86 || field214)) {
						for (int var12 = 0; var12 < var10.field760.length; var12++) {
							if (var11 + 1 == var10.field760[var12]) {
								var8 += var10.field791[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field572[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field263[field284[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field572[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field404.field3;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < HASPTGBT.field719; var13++) {
						if (HASPTGBT.field721[var13]) {
							var8 += field284[var13];
						}
					}
				}

				if (var7 == 10) {
					JDSNLLMP var14 = JDSNLLMP.field775[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < AIEFUHUQ.field57 && (!AIEFUHUQ.method13(var15).field86 || field214)) {
						for (int var16 = 0; var16 < var14.field760.length; var16++) {
							if (var14.field760[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field550;
				}

				if (var7 == 12) {
					var8 = field558;
				}

				if (var7 == 13) {
					int var17 = field572[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					SXQCXZWK var20 = SXQCXZWK.field1133[var19];
					int var21 = var20.field1135;
					int var22 = var20.field1136;
					int var23 = var20.field1137;
					int var24 = field385[var23 - var22];
					var8 = field572[var21] >> var22 & var24;
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
					var8 = (field404.field1370 >> 7) + field224;
				}

				if (var7 == 19) {
					var8 = (field404.field1371 >> 7) + field225;
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

	@ObfuscatedName("client.a(BIIIIIIIII)V")
	public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		AIQUEQRG var10 = null;
		for (AIQUEQRG var11 = (AIQUEQRG) field171.method528(); var11 != null; var11 = (AIQUEQRG) field171.method530()) {
			if (var11.field99 == arg2 && var11.field101 == arg6 && var11.field102 == arg3 && var11.field100 == arg0) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new AIQUEQRG();
			var10.field99 = arg2;
			var10.field100 = arg0;
			var10.field101 = arg6;
			var10.field102 = arg3;
			method162(var10);
			field171.method525(var10);
		}

		var10.field103 = arg8;
		var10.field105 = arg5;
		var10.field104 = arg1;
		var10.field110 = arg4;
		var10.field109 = arg7;
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method155(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(BILjava/lang/String;)V")
	public final void method156(int arg0, String arg1) {
		field230 = arg0;
		field464 = arg1;
		method165();

		if (field327 == null) {
			super.method156(arg0, arg1);
		} else {
			field270.method372();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field374.method382(0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			KNERFXXY.method285(var6, 34, 0x8C1111, var3 / 2 - 152, 304);
			KNERFXXY.method285(var6 + 1, 32, 0, var3 / 2 - 151, 302);
			KNERFXXY.method284(var3 / 2 - 150, var6 + 2, 0x8C1111, 30, arg0 * 3);
			KNERFXXY.method284(arg0 * 3 + var3 / 2 - 150, var6 + 2, 0, 30, 300 - arg0 * 3);
			field374.method382(0xFFFFFF, arg1, var4 / 2 + 5 - var5, var3 / 2);
			field270.method373(171, field895, 202);

			if (field506) {
				field506 = false;

				if (!field477) {
					field271.method373(0, field895, 0);
					field272.method373(0, field895, 637);
				}

				field268.method373(0, field895, 128);
				field269.method373(371, field895, 202);
				field273.method373(265, field895, 0);
				field274.method373(265, field895, 562);
				field275.method373(171, field895, 128);
				field276.method373(171, field895, 562);
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method157(int arg0) {
		JDSNLLMP var2 = JDSNLLMP.field775[arg0];
		for (int var3 = 0; var3 < var2.field807.length && var2.field807[var3] != -1; var3++) {
			JDSNLLMP var4 = JDSNLLMP.field775[var2.field807[var3]];
			if (var4.field788 == 1) {
				method157(var4.field764);
			}

			var4.field814 = 0;
			var4.field799 = 0;
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method158() {
		if (field205 == null) {
			method97();
			field896 = null;
			field268 = null;
			field269 = null;
			field270 = null;
			field271 = null;
			field272 = null;
			field273 = null;
			field274 = null;
			field275 = null;
			field276 = null;
			field205 = new OIDSBDUP(method45(), 479, 96);
			field203 = new OIDSBDUP(method45(), 172, 156);
			KNERFXXY.method282();
			field542.method192(0, 0);
			field202 = new OIDSBDUP(method45(), 190, 261);
			field204 = new OIDSBDUP(method45(), 512, 334);
			KNERFXXY.method282();
			field254 = new OIDSBDUP(method45(), 496, 50);
			field255 = new OIDSBDUP(method45(), 269, 37);
			field256 = new OIDSBDUP(method45(), 249, 45);
			field506 = true;
		}
	}

	@ObfuscatedName("client.b(ILYOXDZEVD;B)V")
	public final void method159(int arg0, YOXDZEVD arg1) {
		int var3 = arg1.method560(8);
		if (var3 < field444) {
			for (int var4 = var3; var4 < field444; var4++) {
				field309[field308++] = field445[var4];
			}
		}

		if (var3 > field444) {
			signlink.reporterror(field184 + " Too many players");
			throw new RuntimeException("eek");
		}

		field444 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field445[var5];
			AGFDLNBY var7 = field443[var6];
			int var8 = arg1.method560(1);
			if (var8 == 0) {
				field445[field444++] = var6;
				var7.field1365 = field316;
			} else {
				int var9 = arg1.method560(2);
				if (var9 == 0) {
					field445[field444++] = var6;
					var7.field1365 = field316;
					field447[field446++] = var6;
				} else if (var9 == 1) {
					field445[field444++] = var6;
					var7.field1365 = field316;
					int var10 = arg1.method560(3);
					var7.method536(var10, false);
					int var11 = arg1.method560(1);
					if (var11 == 1) {
						field447[field446++] = var6;
					}
				} else if (var9 == 2) {
					field445[field444++] = var6;
					var7.field1365 = field316;
					int var12 = arg1.method560(3);
					var7.method536(var12, true);
					int var13 = arg1.method560(3);
					var7.method536(var13, true);
					int var14 = arg1.method560(1);
					if (var14 == 1) {
						field447[field446++] = var6;
					}
				} else if (var9 == 3) {
					field309[field308++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method160() {
		field205.method372();
		LLQSXMOX.field850 = field453;
		field543.method192(0, 0);

		if (field422) {
			field374.method382(0, field565, 40, 239);
			field374.method382(128, field552 + "*", 60, 239);
		} else if (field282 == 1) {
			field374.method382(0, "Enter amount:", 40, 239);
			field374.method382(128, field503 + "*", 60, 239);
		} else if (field282 == 2) {
			field374.method382(0, "Enter name:", 40, 239);
			field374.method382(128, field503 + "*", 60, 239);
		} else if (field377 != null) {
			field374.method382(0, field377, 40, 239);
			field374.method382(128, "Click to continue", 60, 239);
		} else if (field548 != -1) {
			method78(0, JDSNLLMP.field775[field548], 0, 0);
		} else if (field450 == -1) {
			RXCVCUUO var1 = field373;
			int var2 = 0;
			KNERFXXY.method281(0, 77, 463, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field463[var3] != null) {
					int var4 = field461[var3];
					int var5 = field559 + 70 - var2 * 14;
					String var6 = field462[var3];
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
							var1.method386(4, field463[var3], 0, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field569 == 0 || field569 == 1 && method26(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field228[0].method192(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field228[1].method192(var5 - 12, var8);
								var8 += 14;
							}

							var1.method386(var8, var6 + ":", 0, var5);
							var8 += var1.method384(var6) + 8;
							var1.method386(var8, field463[var3], 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field243 == 0 && (var4 == 7 || field554 == 0 || field554 == 1 && method26(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method386(var9, "From", 0, var5);
							int var11 = var9 + var1.method384("From ");
							if (var7 == 1) {
								field228[0].method192(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field228[1].method192(var5 - 12, var11);
								var11 += 14;
							}

							var1.method386(var11, var6 + ":", 0, var5);
							var11 += var1.method384(var6) + 8;
							var1.method386(var11, field463[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (field328 == 0 || field328 == 1 && method26(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method386(4, var6 + " " + field463[var3], 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && field243 == 0 && field554 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method386(4, field463[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && field243 == 0 && field554 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method386(4, "To " + var6 + ":", 0, var5);
							var1.method386(var1.method384("To " + var6) + 12, field463[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (field328 == 0 || field328 == 1 && method26(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method386(4, var6 + " " + field463[var3], 0x7E3200, var5);
						}

						var2++;
					}
				}
			}

			KNERFXXY.method280();
			field267 = var2 * 14 + 7;
			if (field267 < 78) {
				field267 = 78;
			}

			method51(field267, field267 - field559 - 77, 77, 0, 463);
			String var10;
			if (field404 == null || field404.field11 == null) {
				var10 = FWDMWOLO.method213(field184);
			} else {
				var10 = field404.field11;
			}

			var1.method386(4, var10 + ":", 0, 90);
			var1.method386(var1.method384(var10 + ": ") + 6, field551 + "*", 255, 90);
			KNERFXXY.method287(0, 0, 77, 479);
		} else {
			method78(0, JDSNLLMP.field775[field450], 0, 0);
		}

		if (field353 && field236 == 2) {
			method69();
		}

		field205.method373(357, field895, 17);
		field204.method372();
		LLQSXMOX.field850 = field455;
	}

	@ObfuscatedName("client.c(ILYOXDZEVD;B)V")
	public final void method161(int arg0, YOXDZEVD arg1) {
		field308 = 0;
		field446 = 0;
		method134(arg0, arg1);
		method60(arg1, arg0);
		method100(arg0, arg1);

		for (int var3 = 0; var3 < field308; var3++) {
			int var4 = field309[var3];
			if (field316 != field245[var4].field1365) {
				field245[var4].field591 = null;
				field245[var4] = null;
			}
		}

		if (arg1.field1393 != arg0) {
			signlink.reporterror(field184 + " size mismatch in getnpcpos - pos:" + arg1.field1393 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field246; var5++) {
			if (field245[field247[var5]] == null) {
				signlink.reporterror(field184 + " null entry in npc list - pos:" + var5 + " size:" + field246);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(LAIQUEQRG;I)V")
	public final void method162(AIQUEQRG arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field100 == 0) {
			var2 = field530.method483(arg0.field99, arg0.field101, arg0.field102);
		}

		if (arg0.field100 == 1) {
			var2 = field530.method484(arg0.field102, arg0.field99, arg0.field101);
		}

		if (arg0.field100 == 2) {
			var2 = field530.method485(arg0.field99, arg0.field101, arg0.field102);
		}

		if (arg0.field100 == 3) {
			var2 = field530.method486(arg0.field99, arg0.field101, arg0.field102);
		}

		if (var2 != 0) {
			int var6 = field530.method487(arg0.field99, arg0.field101, arg0.field102, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field106 = var3;
		arg0.field108 = var4;
		arg0.field107 = var5;
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method163(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field420; var3++) {
				if (field383[var3] == arg0) {
					field420--;
					field174 = true;

					for (int var4 = var3; var4 < field420; var4++) {
						field383[var4] = field383[var4 + 1];
					}

					field210.method538(221);
					field210.method545(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZZ)V")
	public final void method164(boolean arg0) {
		if (field404.field1370 >> 7 == field360 && field404.field1371 >> 7 == field361) {
			field360 = 0;
			field231++;
			if (field231 > 103) {
				field231 = 0;
				field210.method538(195);
				field210.method540(37611);
			}
		}

		int var2 = field444;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			AGFDLNBY var4;
			int var5;
			if (arg0) {
				var4 = field404;
				var5 = field442 << 14;
			} else {
				var4 = field443[field445[var3]];
				var5 = field445[var3] << 14;
			}

			if (var4 != null && var4.method1()) {
				var4.field25 = false;
				if ((field215 && field444 > 50 || field444 > 200) && !arg0 && var4.field1387 == var4.field1373) {
					var4.field25 = true;
				}

				int var6 = var4.field1370 >> 7;
				int var7 = var4.field1371 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field10 == null || field316 < var4.field20 || field316 >= var4.field21) {
						if ((var4.field1370 & 0x7F) == 0x40 && (var4.field1371 & 0x7F) == 0x40) {
							if (field412[var6][var7] == field325) {
								continue;
							}

							field412[var6][var7] = field325;
						}

						var4.field6 = method81(var4.field1371, field451, var4.field1370);
						field530.method468(var4.field1371, var4.field1337, var4.field6, var4.field1370, var5, field451, var4, var4.field1372, 60);
					} else {
						var4.field25 = false;
						var4.field6 = method81(var4.field1371, field451, var4.field1370);
						field530.method469(var4.field6, var5, var4, field451, var4.field19, var4.field1372, var4.field16, var4.field17, 60, var4.field18, var4.field1370, var4.field1371);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method165() {
		if (field268 == null) {
			field896 = null;
			field205 = null;
			field203 = null;
			field202 = null;
			field204 = null;
			field254 = null;
			field255 = null;
			field256 = null;
			field271 = new OIDSBDUP(method45(), 128, 265);
			KNERFXXY.method282();
			field272 = new OIDSBDUP(method45(), 128, 265);
			KNERFXXY.method282();
			field268 = new OIDSBDUP(method45(), 509, 171);
			KNERFXXY.method282();
			field269 = new OIDSBDUP(method45(), 360, 132);
			KNERFXXY.method282();
			field270 = new OIDSBDUP(method45(), 360, 200);
			KNERFXXY.method282();
			field273 = new OIDSBDUP(method45(), 202, 238);
			KNERFXXY.method282();
			field274 = new OIDSBDUP(method45(), 203, 238);
			KNERFXXY.method282();
			field275 = new OIDSBDUP(method45(), 74, 94);
			KNERFXXY.method282();
			field276 = new OIDSBDUP(method45(), 75, 94);
			KNERFXXY.method282();

			if (field327 != null) {
				method88();
				method128();
			}

			field506 = true;
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method166() {
		for (int var1 = -1; var1 < field444; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field442;
			} else {
				var2 = field445[var1];
			}

			AGFDLNBY var3 = field443[var2];
			if (var3 != null) {
				method33(1, var3);
			}
		}

		field266++;
		if (field266 > 183) {
			field266 = 0;
			field210.method538(216);
			field210.method539(222);
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field263[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field385[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
