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
public final class client extends MKANHSMC {

	@ObfuscatedName("client.L")
	public int[] field60 = new int[1000];

	@ObfuscatedName("client.M")
	public int[] field61 = new int[7];

	@ObfuscatedName("client.P")
	public IUVBENCV field64 = IUVBENCV.method233(1);

	@ObfuscatedName("client.R")
	public int field66 = 1;

	@ObfuscatedName("client.S")
	public boolean field67 = false;

	@ObfuscatedName("client.X")
	public AOKWRKNA[] field69 = new AOKWRKNA[4];

	@ObfuscatedName("client.cb")
	public boolean field74 = false;

	@ObfuscatedName("client.eb")
	public int[][] field76 = new int[104][104];

	@ObfuscatedName("client.fb")
	public int[] field77 = new int[50];

	@ObfuscatedName("client.gb")
	public int field78 = 128;

	@ObfuscatedName("client.ob")
	public GPLGZASP[] field86 = new GPLGZASP[20];

	@ObfuscatedName("client.vb")
	public GPLGZASP[] field92 = new GPLGZASP[8];

	@ObfuscatedName("client.xb")
	public boolean field94 = true;

	@ObfuscatedName("client.Ab")
	public String field96 = "";

	@ObfuscatedName("client.Gb")
	public boolean field100 = false;

	@ObfuscatedName("client.Jb")
	public int field101 = 0x23201B;

	@ObfuscatedName("client.Kb")
	public boolean field102 = false;

	@ObfuscatedName("client.Lb")
	public boolean field103 = false;

	@ObfuscatedName("client.Sb")
	public int field110 = 0x332D25;

	@ObfuscatedName("client.Tb")
	public GPLGZASP[] field111 = new GPLGZASP[1000];

	@ObfuscatedName("client.Zb")
	public volatile boolean field117 = false;

	@ObfuscatedName("client.ec")
	public int field121 = -1;

	@ObfuscatedName("client.oc")
	public int field129 = -1;

	@ObfuscatedName("client.qc")
	public String field131 = "";

	@ObfuscatedName("client.sc")
	public String[] field133 = new String[100];

	@ObfuscatedName("client.tc")
	public int[] field134 = new int[100];

	@ObfuscatedName("client.vc")
	public boolean field136 = false;

	@ObfuscatedName("client.zc")
	public int field140 = -1;

	@ObfuscatedName("client.Ac")
	public int[] field141 = new int[FRKFOCXX.field666];

	@ObfuscatedName("client.Bc")
	public int[] field142 = new int[2000];

	@ObfuscatedName("client.Jc")
	public int[] field146 = new int[33];

	@ObfuscatedName("client.Oc")
	public int field150 = -1;

	@ObfuscatedName("client.Qc")
	public boolean field151 = false;

	@ObfuscatedName("client.Rc")
	public int field152 = -1;

	@ObfuscatedName("client.Sc")
	public int[] field153 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.bd")
	public ZEEWTYXI[][][] field160 = new ZEEWTYXI[4][104][104];

	@ObfuscatedName("client.fd")
	public int[][] field164 = new int[104][104];

	@ObfuscatedName("client.hd")
	public SFVBUBEZ[] field165 = new SFVBUBEZ[13];

	@ObfuscatedName("client.sd")
	public GPLGZASP[] field173 = new GPLGZASP[32];

	@ObfuscatedName("client.vd")
	public IUVBENCV field176 = IUVBENCV.method233(1);

	@ObfuscatedName("client.yd")
	public boolean field178 = false;

	@ObfuscatedName("client.Ad")
	public int field180 = 2;

	@ObfuscatedName("client.Bd")
	public int[] field181 = new int[151];

	@ObfuscatedName("client.Dd")
	public int field183 = -1;

	@ObfuscatedName("client.Fd")
	public int field185 = 1;

	@ObfuscatedName("client.Kd")
	public String[] field190 = new String[200];

	@ObfuscatedName("client.Md")
	public boolean field192 = false;

	@ObfuscatedName("client.Od")
	public long[] field194 = new long[200];

	@ObfuscatedName("client.Rd")
	public BCXJTIWC[] field196 = new BCXJTIWC[5];

	@ObfuscatedName("client.Td")
	public SFVBUBEZ[] field198 = new SFVBUBEZ[100];

	@ObfuscatedName("client.he")
	public int[] field211 = new int[5];

	@ObfuscatedName("client.ie")
	public IUVBENCV field212 = new IUVBENCV(new byte[5000]);

	@ObfuscatedName("client.je")
	public KPZIZBER[] field213 = new KPZIZBER[16384];

	@ObfuscatedName("client.le")
	public int[] field215 = new int[16384];

	@ObfuscatedName("client.me")
	public String[] field216 = new String[5];

	@ObfuscatedName("client.ne")
	public boolean[] field217 = new boolean[5];

	@ObfuscatedName("client.xe")
	public boolean field225 = false;

	@ObfuscatedName("client.ze")
	public int[] field227 = new int[1000];

	@ObfuscatedName("client.Ae")
	public int[] field228 = new int[1000];

	@ObfuscatedName("client.De")
	public boolean field229 = false;

	@ObfuscatedName("client.Ie")
	public int field234 = 0x4D4233;

	@ObfuscatedName("client.Le")
	public final int[] field236 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Me")
	public GPLGZASP[] field237 = new GPLGZASP[32];

	@ObfuscatedName("client.Ne")
	public IUVBENCV field238 = IUVBENCV.method233(1);

	@ObfuscatedName("client.Oe")
	public int[] field239 = new int[5];

	@ObfuscatedName("client.Pe")
	public int field240 = -1;

	@ObfuscatedName("client.Qe")
	public int field241 = -1;

	@ObfuscatedName("client.Re")
	public int[] field242 = new int[2000];

	@ObfuscatedName("client.Ve")
	public String field246 = "";

	@ObfuscatedName("client.We")
	public String field247 = "";

	@ObfuscatedName("client.Xe")
	public int field248 = -1;

	@ObfuscatedName("client.Ye")
	public int field249 = -1;

	@ObfuscatedName("client.Ze")
	public int[] field250 = new int[50];

	@ObfuscatedName("client.hf")
	public int field258 = 2048;

	@ObfuscatedName("client.jf")
	public int field259 = 2047;

	@ObfuscatedName("client.kf")
	public VJDNWPCM[] field260 = new VJDNWPCM[field258];

	@ObfuscatedName("client.mf")
	public int[] field262 = new int[field258];

	@ObfuscatedName("client.of")
	public int[] field264 = new int[field258];

	@ObfuscatedName("client.pf")
	public IUVBENCV[] field265 = new IUVBENCV[field258];

	@ObfuscatedName("client.yf")
	public boolean field273 = true;

	@ObfuscatedName("client.Af")
	public int field275 = -1;

	@ObfuscatedName("client.Bf")
	public int[] field276 = new int[33];

	@ObfuscatedName("client.Gf")
	public int[] field280 = new int[50];

	@ObfuscatedName("client.If")
	public final int field281 = 100;

	@ObfuscatedName("client.Jf")
	public int[] field282 = new int[100];

	@ObfuscatedName("client.Kf")
	public int[] field283 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Lf")
	public int field284 = -1;

	@ObfuscatedName("client.Nf")
	public int[] field285 = new int[5];

	@ObfuscatedName("client.Of")
	public boolean field286 = false;

	@ObfuscatedName("client.Qf")
	public boolean field288 = false;

	@ObfuscatedName("client.Rf")
	public int[] field289 = new int[151];

	@ObfuscatedName("client.Sf")
	public int field290 = 78;

	@ObfuscatedName("client.ag")
	public SFVBUBEZ[] field296 = new SFVBUBEZ[2];

	@ObfuscatedName("client.dg")
	public int field299 = -1;

	@ObfuscatedName("client.eg")
	public int[] field300 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.jg")
	public boolean[] field305 = new boolean[5];

	@ObfuscatedName("client.mg")
	public String field307 = "";

	@ObfuscatedName("client.pg")
	public boolean field310 = true;

	@ObfuscatedName("client.ug")
	public int field314 = 50;

	@ObfuscatedName("client.vg")
	public int[] field315 = new int[field314];

	@ObfuscatedName("client.wg")
	public int[] field316 = new int[field314];

	@ObfuscatedName("client.xg")
	public int[] field317 = new int[field314];

	@ObfuscatedName("client.yg")
	public int[] field318 = new int[field314];

	@ObfuscatedName("client.zg")
	public int[] field319 = new int[field314];

	@ObfuscatedName("client.Ag")
	public int[] field320 = new int[field314];

	@ObfuscatedName("client.Bg")
	public int[] field321 = new int[field314];

	@ObfuscatedName("client.Cg")
	public String[] field322 = new String[field314];

	@ObfuscatedName("client.Dg")
	public boolean field323 = false;

	@ObfuscatedName("client.Fg")
	public int[] field325 = new int[500];

	@ObfuscatedName("client.Gg")
	public int[] field326 = new int[500];

	@ObfuscatedName("client.Hg")
	public int[] field327 = new int[500];

	@ObfuscatedName("client.Ig")
	public int[] field328 = new int[500];

	@ObfuscatedName("client.Sg")
	public byte[] field336 = new byte[16384];

	@ObfuscatedName("client.Tg")
	public int[] field337 = new int[100];

	@ObfuscatedName("client.Ug")
	public String[] field338 = new String[100];

	@ObfuscatedName("client.Vg")
	public String[] field339 = new String[100];

	@ObfuscatedName("client.Xg")
	public boolean field341 = false;

	@ObfuscatedName("client.ch")
	public volatile boolean field346 = false;

	@ObfuscatedName("client.fh")
	public GPLGZASP[] field348 = new GPLGZASP[32];

	@ObfuscatedName("client.Ah")
	public ZEEWTYXI field367 = new ZEEWTYXI();

	@ObfuscatedName("client.Bh")
	public boolean field368 = false;

	@ObfuscatedName("client.Dh")
	public int field369 = 0x766654;

	@ObfuscatedName("client.Eh")
	public int[] field370 = new int[5];

	@ObfuscatedName("client.Fh")
	public ZEEWTYXI field371 = new ZEEWTYXI();

	@ObfuscatedName("client.Hh")
	public int[] field372 = new int[9];

	@ObfuscatedName("client.Mh")
	public boolean field377 = false;

	@ObfuscatedName("client.Nh")
	public String field378 = "";

	@ObfuscatedName("client.Oh")
	public int field379 = -1;

	@ObfuscatedName("client.Ph")
	public int[][] field380 = new int[104][104];

	@ObfuscatedName("client.Qh")
	public int[] field381 = new int[200];

	@ObfuscatedName("client.Th")
	public boolean field384 = true;

	@ObfuscatedName("client.Uh")
	public volatile boolean field385 = false;

	@ObfuscatedName("client.Wh")
	public String field386 = "";

	@ObfuscatedName("client.Xh")
	public String field387 = "";

	@ObfuscatedName("client.Zh")
	public String field389 = "";

	@ObfuscatedName("client.ai")
	public int[] field390 = new int[256];

	@ObfuscatedName("client.Ci")
	public boolean field418 = false;

	@ObfuscatedName("client.Ei")
	public long[] field420 = new long[100];

	@ObfuscatedName("client.Ki")
	public int field426 = -1;

	@ObfuscatedName("client.Pi")
	public String field430 = "";

	@ObfuscatedName("client.Qi")
	public CRC32 field431 = new CRC32();

	@ObfuscatedName("client.aj")
	public MIIVNBFU field441 = new MIIVNBFU();

	@ObfuscatedName("client.cj")
	public int[] field443 = new int[FRKFOCXX.field666];

	@ObfuscatedName("client.qj")
	public int field457 = 2;

	@ObfuscatedName("client.sj")
	public boolean field458 = false;

	@ObfuscatedName("client.uj")
	public boolean field460 = true;

	@ObfuscatedName("client.zj")
	public int[] field463 = new int[FRKFOCXX.field666];

	@ObfuscatedName("client.Aj")
	public int field464 = 3;

	@ObfuscatedName("client.Bj")
	public boolean field465 = false;

	@ObfuscatedName("client.Cj")
	public int[][][] field466 = new int[4][13][13];

	@ObfuscatedName("client.Ij")
	public boolean field472 = false;

	@ObfuscatedName("client.Jj")
	public boolean field473 = false;

	@ObfuscatedName("client.Kj")
	public ZEEWTYXI field474 = new ZEEWTYXI();

	@ObfuscatedName("client.Nj")
	public String[] field477 = new String[500];

	@ObfuscatedName("client.dk")
	public GPLGZASP[] field490 = new GPLGZASP[100];

	@ObfuscatedName("client.fk")
	public int field492 = -1;

	@ObfuscatedName("client.hk")
	public int[] field494 = new int[4000];

	@ObfuscatedName("client.ik")
	public int[] field495 = new int[4000];

	@ObfuscatedName("client.kk")
	public int field497 = 2;

	@ObfuscatedName("client.nk")
	public int[] field500 = new int[5];

	@ObfuscatedName("client.Z")
	public static String field71 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Yb")
	public static int[] field116 = new int[99];

	@ObfuscatedName("client.Wc")
	public static final int[][] field156 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.ad")
	public static BigInteger field159 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Je")
	public static BigInteger field235 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Uf")
	public static int[] field291 = new int[32];

	@ObfuscatedName("client.ig")
	public static final int[] field304 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Vj")
	public static int field484 = 10;

	@ObfuscatedName("client.Xj")
	public static boolean field486 = true;

	@ObfuscatedName("client.Mb")
	public int field104;

	@ObfuscatedName("client.Nb")
	public int field105;

	@ObfuscatedName("client.Ob")
	public int field106;

	@ObfuscatedName("client.Pb")
	public int field107;

	@ObfuscatedName("client.Qb")
	public int field108;

	@ObfuscatedName("client.Rb")
	public static int field109;

	@ObfuscatedName("client.Vb")
	public int field113;

	@ObfuscatedName("client.Wb")
	public int field114;

	@ObfuscatedName("client.Xb")
	public int field115;

	@ObfuscatedName("client.bc")
	public int field118;

	@ObfuscatedName("client.cc")
	public int field119;

	@ObfuscatedName("client.dc")
	public int field120;

	@ObfuscatedName("client.gc")
	public int field123;

	@ObfuscatedName("client.hc")
	public int field124;

	@ObfuscatedName("client.ic")
	public int field125;

	@ObfuscatedName("client.jc")
	public int field126;

	@ObfuscatedName("client.kc")
	public int field127;

	@ObfuscatedName("client.nc")
	public int field128;

	@ObfuscatedName("client.pc")
	public int field130;

	@ObfuscatedName("client.rc")
	public int field132;

	@ObfuscatedName("client.uc")
	public int field135;

	@ObfuscatedName("client.wc")
	public int field137;

	@ObfuscatedName("client.xc")
	public int field138;

	@ObfuscatedName("client.Lc")
	public int field148;

	@ObfuscatedName("client.Mc")
	public int field149;

	@ObfuscatedName("client.Vc")
	public static int field155;

	@ObfuscatedName("client.Xc")
	public int field157;

	@ObfuscatedName("client.Zc")
	public int field158;

	@ObfuscatedName("client.cd")
	public int field161;

	@ObfuscatedName("client.dd")
	public int field162;

	@ObfuscatedName("client.ed")
	public int field163;

	@ObfuscatedName("client.id")
	public static int field166;

	@ObfuscatedName("client.jd")
	public int field167;

	@ObfuscatedName("client.kd")
	public int field168;

	@ObfuscatedName("client.nd")
	public int field169;

	@ObfuscatedName("client.od")
	public int field170;

	@ObfuscatedName("client.pd")
	public int field171;

	@ObfuscatedName("client.qd")
	public int field172;

	@ObfuscatedName("client.td")
	public int field174;

	@ObfuscatedName("client.ud")
	public static int field175;

	@ObfuscatedName("client.zd")
	public int field179;

	@ObfuscatedName("client.Cd")
	public int field182;

	@ObfuscatedName("client.Ed")
	public int field184;

	@ObfuscatedName("client.Gd")
	public int field186;

	@ObfuscatedName("client.Hd")
	public static int field187;

	@ObfuscatedName("client.Jd")
	public static int field189;

	@ObfuscatedName("client.Ld")
	public int field191;

	@ObfuscatedName("client.Qd")
	public int field195;

	@ObfuscatedName("client.Sd")
	public int field197;

	@ObfuscatedName("client.be")
	public int field205;

	@ObfuscatedName("client.ce")
	public int field206;

	@ObfuscatedName("client.de")
	public int field207;

	@ObfuscatedName("client.ee")
	public int field208;

	@ObfuscatedName("client.fe")
	public int field209;

	@ObfuscatedName("client.ge")
	public int field210;

	@ObfuscatedName("client.ke")
	public int field214;

	@ObfuscatedName("client.re")
	public static int field220;

	@ObfuscatedName("client.ye")
	public int field226;

	@ObfuscatedName("client.af")
	public static int field251;

	@ObfuscatedName("client.bf")
	public int field252;

	@ObfuscatedName("client.cf")
	public int field253;

	@ObfuscatedName("client.df")
	public int field254;

	@ObfuscatedName("client.ef")
	public int field255;

	@ObfuscatedName("client.gf")
	public int field257;

	@ObfuscatedName("client.lf")
	public int field261;

	@ObfuscatedName("client.nf")
	public int field263;

	@ObfuscatedName("client.vf")
	public int field270;

	@ObfuscatedName("client.wf")
	public int field271;

	@ObfuscatedName("client.Df")
	public int field277;

	@ObfuscatedName("client.Ef")
	public int field278;

	@ObfuscatedName("client.Ff")
	public int field279;

	@ObfuscatedName("client.Wf")
	public static int field292;

	@ObfuscatedName("client.Xf")
	public int field293;

	@ObfuscatedName("client.Yf")
	public int field294;

	@ObfuscatedName("client.Zf")
	public int field295;

	@ObfuscatedName("client.fg")
	public int field301;

	@ObfuscatedName("client.sg")
	public static int field312;

	@ObfuscatedName("client.tg")
	public int field313;

	@ObfuscatedName("client.Eg")
	public int field324;

	@ObfuscatedName("client.Kg")
	public int field329;

	@ObfuscatedName("client.Lg")
	public int field330;

	@ObfuscatedName("client.Mg")
	public int field331;

	@ObfuscatedName("client.Ng")
	public int field332;

	@ObfuscatedName("client.Og")
	public int field333;

	@ObfuscatedName("client.Qg")
	public int field334;

	@ObfuscatedName("client.Rg")
	public static int field335;

	@ObfuscatedName("client.Wg")
	public int field340;

	@ObfuscatedName("client.Yg")
	public int field342;

	@ObfuscatedName("client.Zg")
	public int field343;

	@ObfuscatedName("client.ah")
	public int field344;

	@ObfuscatedName("client.bh")
	public static int field345;

	@ObfuscatedName("client.gh")
	public int field349;

	@ObfuscatedName("client.hh")
	public int field350;

	@ObfuscatedName("client.sh")
	public int field361;

	@ObfuscatedName("client.vh")
	public int field362;

	@ObfuscatedName("client.wh")
	public int field363;

	@ObfuscatedName("client.xh")
	public int field364;

	@ObfuscatedName("client.yh")
	public int field365;

	@ObfuscatedName("client.Ih")
	public int field373;

	@ObfuscatedName("client.Jh")
	public int field374;

	@ObfuscatedName("client.Kh")
	public int field375;

	@ObfuscatedName("client.Lh")
	public int field376;

	@ObfuscatedName("client.Rh")
	public int field382;

	@ObfuscatedName("client.Sh")
	public int field383;

	@ObfuscatedName("client.Yh")
	public int field388;

	@ObfuscatedName("client.ki")
	public static int field400;

	@ObfuscatedName("client.yi")
	public int field414;

	@ObfuscatedName("client.zi")
	public int field415;

	@ObfuscatedName("client.Ai")
	public int field416;

	@ObfuscatedName("client.Bi")
	public int field417;

	@ObfuscatedName("client.Di")
	public int field419;

	@ObfuscatedName("client.Fi")
	public int field421;

	@ObfuscatedName("client.Gi")
	public int field422;

	@ObfuscatedName("client.Hi")
	public int field423;

	@ObfuscatedName("client.Ii")
	public int field424;

	@ObfuscatedName("client.Vi")
	public int field436;

	@ObfuscatedName("client.Wi")
	public int field437;

	@ObfuscatedName("client.Xi")
	public int field438;

	@ObfuscatedName("client.Yi")
	public int field439;

	@ObfuscatedName("client.Zi")
	public int field440;

	@ObfuscatedName("client.bj")
	public int field442;

	@ObfuscatedName("client.dj")
	public int field444;

	@ObfuscatedName("client.ej")
	public int field445;

	@ObfuscatedName("client.fj")
	public int field446;

	@ObfuscatedName("client.gj")
	public int field447;

	@ObfuscatedName("client.hj")
	public int field448;

	@ObfuscatedName("client.ij")
	public int field449;

	@ObfuscatedName("client.jj")
	public int field450;

	@ObfuscatedName("client.lj")
	public int field452;

	@ObfuscatedName("client.mj")
	public int field453;

	@ObfuscatedName("client.nj")
	public static int field454;

	@ObfuscatedName("client.oj")
	public int field455;

	@ObfuscatedName("client.pj")
	public int field456;

	@ObfuscatedName("client.tj")
	public int field459;

	@ObfuscatedName("client.xj")
	public static int field462;

	@ObfuscatedName("client.Dj")
	public int field467;

	@ObfuscatedName("client.Ej")
	public int field468;

	@ObfuscatedName("client.Fj")
	public int field469;

	@ObfuscatedName("client.Gj")
	public int field470;

	@ObfuscatedName("client.Hj")
	public int field471;

	@ObfuscatedName("client.Mj")
	public int field476;

	@ObfuscatedName("client.Pj")
	public int field478;

	@ObfuscatedName("client.Qj")
	public int field479;

	@ObfuscatedName("client.Rj")
	public int field480;

	@ObfuscatedName("client.Sj")
	public int field481;

	@ObfuscatedName("client.Tj")
	public int field482;

	@ObfuscatedName("client.Uj")
	public int field483;

	@ObfuscatedName("client.Wj")
	public static int field485;

	@ObfuscatedName("client.gk")
	public int field493;

	@ObfuscatedName("client.jk")
	public int field496;

	@ObfuscatedName("client.lk")
	public int field498;

	@ObfuscatedName("client.mk")
	public int field499;

	@ObfuscatedName("client.pk")
	public int field502;

	@ObfuscatedName("client.qk")
	public int field503;

	@ObfuscatedName("client.K")
	public int field59;

	@ObfuscatedName("client.N")
	public int field62;

	@ObfuscatedName("client.O")
	public int field63;

	@ObfuscatedName("client.Q")
	public int field65;

	@ObfuscatedName("client.Y")
	public static int field70;

	@ObfuscatedName("client.ab")
	public int field72;

	@ObfuscatedName("client.bb")
	public int field73;

	@ObfuscatedName("client.db")
	public static int field75;

	@ObfuscatedName("client.hb")
	public int field79;

	@ObfuscatedName("client.ib")
	public int field80;

	@ObfuscatedName("client.jb")
	public int field81;

	@ObfuscatedName("client.kb")
	public int field82;

	@ObfuscatedName("client.lb")
	public int field83;

	@ObfuscatedName("client.mb")
	public int field84;

	@ObfuscatedName("client.pb")
	public static int field87;

	@ObfuscatedName("client.wb")
	public int field93;

	@ObfuscatedName("client.zb")
	public int field95;

	@ObfuscatedName("client.Ud")
	public long field199;

	@ObfuscatedName("client.Ue")
	public long field245;

	@ObfuscatedName("client.Pf")
	public long field287;

	@ObfuscatedName("client.Ji")
	public long field425;

	@ObfuscatedName("client.kj")
	public long field451;

	@ObfuscatedName("client.kg")
	public AWEEREDT field306;

	@ObfuscatedName("client.xd")
	public BISZONYZ field177;

	@ObfuscatedName("client.yc")
	public CSJOZVFM field139;

	@ObfuscatedName("client.Ee")
	public DTPUNZHN field230;

	@ObfuscatedName("client.Fe")
	public DTPUNZHN field231;

	@ObfuscatedName("client.Ge")
	public DTPUNZHN field232;

	@ObfuscatedName("client.ih")
	public DTPUNZHN field351;

	@ObfuscatedName("client.jh")
	public DTPUNZHN field352;

	@ObfuscatedName("client.kh")
	public DTPUNZHN field353;

	@ObfuscatedName("client.lh")
	public DTPUNZHN field354;

	@ObfuscatedName("client.mh")
	public DTPUNZHN field355;

	@ObfuscatedName("client.nh")
	public DTPUNZHN field356;

	@ObfuscatedName("client.oh")
	public DTPUNZHN field357;

	@ObfuscatedName("client.ph")
	public DTPUNZHN field358;

	@ObfuscatedName("client.qh")
	public DTPUNZHN field359;

	@ObfuscatedName("client.bi")
	public DTPUNZHN field391;

	@ObfuscatedName("client.ci")
	public DTPUNZHN field392;

	@ObfuscatedName("client.di")
	public DTPUNZHN field393;

	@ObfuscatedName("client.ei")
	public DTPUNZHN field394;

	@ObfuscatedName("client.fi")
	public DTPUNZHN field395;

	@ObfuscatedName("client.gi")
	public DTPUNZHN field396;

	@ObfuscatedName("client.hi")
	public DTPUNZHN field397;

	@ObfuscatedName("client.ii")
	public DTPUNZHN field398;

	@ObfuscatedName("client.ji")
	public DTPUNZHN field399;

	@ObfuscatedName("client.qb")
	public DTPUNZHN field88;

	@ObfuscatedName("client.rb")
	public DTPUNZHN field89;

	@ObfuscatedName("client.sb")
	public DTPUNZHN field90;

	@ObfuscatedName("client.tb")
	public DTPUNZHN field91;

	@ObfuscatedName("client.fc")
	public GPLGZASP field122;

	@ObfuscatedName("client.Ec")
	public GPLGZASP field143;

	@ObfuscatedName("client.Fc")
	public GPLGZASP field144;

	@ObfuscatedName("client.Hc")
	public GPLGZASP field145;

	@ObfuscatedName("client.Se")
	public GPLGZASP field243;

	@ObfuscatedName("client.Te")
	public GPLGZASP field244;

	@ObfuscatedName("client.xf")
	public GPLGZASP field272;

	@ObfuscatedName("client.rg")
	public GPLGZASP field311;

	@ObfuscatedName("client.ti")
	public GPLGZASP field409;

	@ObfuscatedName("client.ui")
	public GPLGZASP field410;

	@ObfuscatedName("client.vi")
	public GPLGZASP field411;

	@ObfuscatedName("client.wi")
	public GPLGZASP field412;

	@ObfuscatedName("client.xi")
	public GPLGZASP field413;

	@ObfuscatedName("client.bk")
	public GPLGZASP field488;

	@ObfuscatedName("client.ck")
	public GPLGZASP field489;

	@ObfuscatedName("client.Kc")
	public ICHYZYSQ field147;

	@ObfuscatedName("client.vj")
	public LLZTMQTZ field461;

	@ObfuscatedName("client.He")
	public POACSVST field233;

	@ObfuscatedName("client.Vd")
	public SFVBUBEZ field200;

	@ObfuscatedName("client.Wd")
	public SFVBUBEZ field201;

	@ObfuscatedName("client.Xd")
	public SFVBUBEZ field202;

	@ObfuscatedName("client.Yd")
	public SFVBUBEZ field203;

	@ObfuscatedName("client.Zd")
	public SFVBUBEZ field204;

	@ObfuscatedName("client.bg")
	public SFVBUBEZ field297;

	@ObfuscatedName("client.cg")
	public SFVBUBEZ field298;

	@ObfuscatedName("client.gg")
	public SFVBUBEZ field302;

	@ObfuscatedName("client.hg")
	public SFVBUBEZ field303;

	@ObfuscatedName("client.oi")
	public SFVBUBEZ field404;

	@ObfuscatedName("client.pi")
	public SFVBUBEZ field405;

	@ObfuscatedName("client.qi")
	public SFVBUBEZ field406;

	@ObfuscatedName("client.ri")
	public SFVBUBEZ field407;

	@ObfuscatedName("client.si")
	public SFVBUBEZ field408;

	@ObfuscatedName("client.Mi")
	public SFVBUBEZ field427;

	@ObfuscatedName("client.Ni")
	public SFVBUBEZ field428;

	@ObfuscatedName("client.Oi")
	public SFVBUBEZ field429;

	@ObfuscatedName("client.Bb")
	public SFVBUBEZ field97;

	@ObfuscatedName("client.Cb")
	public SFVBUBEZ field98;

	@ObfuscatedName("client.Db")
	public SFVBUBEZ field99;

	@ObfuscatedName("client.Ri")
	public UOINBUQD field432;

	@ObfuscatedName("client.Si")
	public UOINBUQD field433;

	@ObfuscatedName("client.Ti")
	public UOINBUQD field434;

	@ObfuscatedName("client.Ui")
	public UOINBUQD field435;

	@ObfuscatedName("client.ek")
	public static VJDNWPCM field491;

	@ObfuscatedName("client.Nd")
	public String field193;

	@ObfuscatedName("client.ff")
	public String field256;

	@ObfuscatedName("client.Lj")
	public String field475;

	@ObfuscatedName("client.nb")
	public String field85;

	@ObfuscatedName("client.ok")
	public Socket field501;

	@ObfuscatedName("client.Ub")
	public static boolean field112;

	@ObfuscatedName("client.Uc")
	public static boolean field154;

	@ObfuscatedName("client.eh")
	public static boolean field347;

	@ObfuscatedName("client.Yj")
	public static boolean field487;

	@ObfuscatedName("client.pe")
	public int[] field218;

	@ObfuscatedName("client.qe")
	public int[] field219;

	@ObfuscatedName("client.se")
	public int[] field221;

	@ObfuscatedName("client.te")
	public int[] field222;

	@ObfuscatedName("client.ue")
	public int[] field223;

	@ObfuscatedName("client.ve")
	public int[] field224;

	@ObfuscatedName("client.qf")
	public int[] field266;

	@ObfuscatedName("client.rf")
	public int[] field267;

	@ObfuscatedName("client.sf")
	public int[] field268;

	@ObfuscatedName("client.tf")
	public int[] field269;

	@ObfuscatedName("client.ng")
	public int[] field308;

	@ObfuscatedName("client.og")
	public int[] field309;

	@ObfuscatedName("client.li")
	public int[] field401;

	@ObfuscatedName("client.mi")
	public int[] field402;

	@ObfuscatedName("client.ni")
	public int[] field403;

	@ObfuscatedName("client.zf")
	public SFVBUBEZ[] field274;

	@ObfuscatedName("client.rh")
	public byte[][] field360;

	@ObfuscatedName("client.U")
	public byte[][] field68;

	@ObfuscatedName("client.Id")
	public byte[][][] field188;

	@ObfuscatedName("client.zh")
	public int[][][] field366;

	@ObfuscatedName("client.a(ZI)V")
	public final void method47(boolean arg0) {
		if (field491.field548 >> 7 == field270 && field491.field549 >> 7 == field271) {
			field270 = 0;
		}

		int var2 = field261;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			VJDNWPCM var4;
			int var5;
			if (arg0) {
				var4 = field491;
				var5 = field259 << 14;
			} else {
				var4 = field260[field262[var3]];
				var5 = field262[var3] << 14;
			}

			if (var4 != null && var4.method203()) {
				var4.field1410 = false;
				if ((field487 && field261 > 50 || field261 > 200) && !arg0 && var4.field562 == var4.field535) {
					var4.field1410 = true;
				}

				int var6 = var4.field548 >> 7;
				int var7 = var4.field549 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1407 == null || field292 < var4.field1415 || field292 >= var4.field1416) {
						if ((var4.field548 & 0x7F) == 0x40 && (var4.field549 & 0x7F) == 0x40) {
							if (field380[var6][var7] == field168) {
								continue;
							}

							field380[var6][var7] = field168;
						}

						var4.field1393 = method146(var4.field549, field182, var4.field548);
						field233.method398(60, var4.field548, field182, var5, var4.field549, var4.field568, var4, var4.field1393, var4.field550);
					} else {
						var4.field1410 = false;
						var4.field1393 = method146(var4.field549, field182, var4.field548);
						field233.method399(var4.field1394, var4.field1397, var4.field1393, var4.field1396, var4.field549, var4.field548, 60, var4, var5, field182, var4.field550, var4.field1395);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public final void method48(boolean arg0) {
		for (int var2 = 0; var2 < field214; var2++) {
			KPZIZBER var3 = field213[field215[var2]];
			int var4 = (field215[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method203() && var3.field906.field1104 == arg0 && var3.field906.method369()) {
				int var5 = var3.field548 >> 7;
				int var6 = var3.field549 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field561 == 1 && (var3.field548 & 0x7F) == 0x40 && (var3.field549 & 0x7F) == 0x40) {
						if (field380[var5][var6] == field168) {
							continue;
						}

						field380[var5][var6] = field168;
					}

					if (!var3.field906.field1101) {
						var4 += Integer.MIN_VALUE;
					}

					field233.method398((var3.field561 - 1) * 64 + 60, var3.field548, field182, var4, var3.field549, var3.field568, var3, method146(var3.field549, field182, var3.field548), var3.field550);
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method49() {
		short var1 = 256;

		if (field119 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field119 > 768) {
					field266[var2] = method130(field267[var2], field268[var2], 1024 - field119);
				} else if (field119 > 256) {
					field266[var2] = field268[var2];
				} else {
					field266[var2] = method130(field268[var2], field267[var2], 256 - field119);
				}
			}
		} else if (field120 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field120 > 768) {
					field266[var3] = method130(field267[var3], field269[var3], 1024 - field120);
				} else if (field120 > 256) {
					field266[var3] = field269[var3];
				} else {
					field266[var3] = method130(field269[var3], field267[var3], 256 - field120);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field266[var4] = field267[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field354.field602[var5] = field143.field693[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field390[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field218[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field266[var12];
					int var15 = field354.field602[var7];
					field354.field602[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field354.method206(0, field1041, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field355.field602[var16] = field144.field693[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field390[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field218[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field266[var23];
					int var26 = field355.field602[var18];
					field355.field602[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field355.method206(637, field1041, 0);
	}

	@ObfuscatedName("client.e(I)V")
	public final void method50() {
		if (field493 == 2) {
			method119((field329 - field169 << 7) + field332, (field330 - field170 << 7) + field333, field331 * 2);

			if (field248 > -1 && field292 % 20 < 10) {
				field237[0].method220(field249 - 28, field248 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method51(long arg0) {
		if (arg0 != 0L) {
			if (field162 >= 100) {
				method160(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = RSIGORUG.method456(RSIGORUG.method453(arg0));
				for (int var4 = 0; var4 < field162; var4++) {
					if (field420[var4] == arg0) {
						method160(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field498; var5++) {
					if (field194[var5] == arg0) {
						method160(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				field420[field162++] = arg0;
				field323 = true;
				field64.method234(238);
				field64.method241(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method52(int arg0) {
		int var2 = TRINWBEO.field1355[arg0].field1363;
		if (var2 != 0) {
			int var3 = field142[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					ZGIYLEBF.method594(0.9D);
				}

				if (var3 == 2) {
					ZGIYLEBF.method594(0.8D);
				}

				if (var3 == 3) {
					ZGIYLEBF.method594(0.7D);
				}

				if (var3 == 4) {
					ZGIYLEBF.method594(0.6D);
				}

				IXFCVZPT.field779.method440();
				field341 = true;
			}

			if (var2 == 3) {
				boolean var4 = field94;

				if (var3 == 0) {
					method58(field94, 0);
					field94 = true;
				}

				if (var3 == 1) {
					method58(field94, -400);
					field94 = true;
				}

				if (var3 == 2) {
					method58(field94, -800);
					field94 = true;
				}

				if (var3 == 3) {
					method58(field94, -1200);
					field94 = true;
				}

				if (var3 == 4) {
					field94 = false;
				}

				if (field94 != var4 && !field487) {
					if (field94) {
						field459 = field150;
						field460 = true;
						field177.method40(2, field459);
					} else {
						method92();
					}

					field163 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field273 = true;
					method181(0);
				}

				if (var3 == 1) {
					field273 = true;
					method181(-400);
				}

				if (var3 == 2) {
					field273 = true;
					method181(-800);
				}

				if (var3 == 3) {
					field273 = true;
					method181(-1200);
				}

				if (var3 == 4) {
					field273 = false;
				}
			}

			if (var2 == 5) {
				field174 = var3;
			}

			if (var2 == 6) {
				field503 = var3;
			}

			if (var2 == 8) {
				field72 = var3;
				field67 = true;
			}

			if (var2 == 9) {
				field115 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IIZIII)V")
	public final void method53(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field233.method413(arg1, arg2, arg0);
		if (var6 != 0) {
			int var7 = field233.method417(arg1, arg2, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field272.field693;
			int var12 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			MCFQOEAW var14 = MCFQOEAW.method341(var13);
			if (var14.field945 == -1) {
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
				SFVBUBEZ var15 = field198[var14.field945];
				if (var15 != null) {
					int var16 = (var14.field914 * 4 - var15.field1276) / 2;
					int var17 = (var14.field947 * 4 - var15.field1277) / 2;
					var15.method463((104 - arg0 - var14.field947) * 4 + var17 + 48, arg2 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field233.method415(arg1, arg2, arg0);
		if (var18 != 0) {
			int var19 = field233.method417(arg1, arg2, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			MCFQOEAW var23 = MCFQOEAW.method341(var22);
			if (var23.field945 != -1) {
				SFVBUBEZ var24 = field198[var23.field945];
				if (var24 != null) {
					int var25 = (var23.field914 * 4 - var24.field1276) / 2;
					int var26 = (var23.field947 * 4 - var24.field1277) / 2;
					var24.method463((104 - arg0 - var23.field947) * 4 + var26 + 48, arg2 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field272.field693;
				int var29 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = field233.method416(arg1, arg2, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			MCFQOEAW var32 = MCFQOEAW.method341(var31);
			if (var32.field945 != -1) {
				SFVBUBEZ var33 = field198[var32.field945];
				if (var33 != null) {
					int var34 = (var32.field914 * 4 - var33.field1276) / 2;
					int var35 = (var32.field947 * 4 - var33.field1277) / 2;
					var33.method463((104 - arg0 - var32.field947) * 4 + var35 + 48, arg2 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LSFVBUBEZ;B)V")
	public final void method54(SFVBUBEZ arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field308.length; var3++) {
			field308[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field308[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field309[var9] = (field308[var9 - 1] + field308[var9 + 1] + field308[var9 - 128] + field308[var9 + 128]) / 4;
				}
			}

			int[] var10 = field308;
			field308 = field309;
			field309 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1277; var12++) {
				for (int var13 = 0; var13 < arg0.field1276; var13++) {
					if (arg0.field1274[var11++] != 0) {
						int var14 = var13 + arg0.field1278 + 16;
						int var15 = var12 + arg0.field1279 + 16;
						int var16 = (var15 << 7) + var14;
						field308[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method55() {
		if (field158 == 2) {
			for (JQXBQBEJ var1 = (JQXBQBEJ) field474.method580(); var1 != null; var1 = (JQXBQBEJ) field474.method582()) {
				if (var1.field875 > 0) {
					var1.field875--;
				}

				if (var1.field875 != 0) {
					if (var1.field876 > 0) {
						var1.field876--;
					}

					if (var1.field876 == 0 && var1.field879 >= 1 && var1.field880 >= 1 && var1.field879 <= 102 && var1.field880 <= 102 && (var1.field869 < 0 || SNNOFNNG.method485(var1.field871, var1.field869))) {
						method56(var1.field878, var1.field871, var1.field879, var1.field869, var1.field880, var1.field870, var1.field877);
						var1.field876 = -1;

						if (var1.field872 == var1.field869 && var1.field872 == -1) {
							var1.method602();
						} else if (var1.field872 == var1.field869 && var1.field873 == var1.field870 && var1.field874 == var1.field871) {
							var1.method602();
						}
					}
				} else if (var1.field872 < 0 || SNNOFNNG.method485(var1.field874, var1.field872)) {
					method56(var1.field878, var1.field874, var1.field879, var1.field872, var1.field880, var1.field873, var1.field877);
					var1.method602();
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg4 >= 1 && arg2 <= 102 && arg4 <= 102) {
			if (field487 && field182 != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg0 == 0) {
				var8 = field233.method413(arg6, arg2, arg4);
			}

			if (arg0 == 1) {
				var8 = field233.method414(arg4, arg2, arg6);
			}

			if (arg0 == 2) {
				var8 = field233.method415(arg6, arg2, arg4);
			}

			if (arg0 == 3) {
				var8 = field233.method416(arg6, arg2, arg4);
			}

			if (var8 != 0) {
				int var12 = field233.method417(arg6, arg2, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg0 == 0) {
					field233.method404(arg4, arg6, arg2);
					MCFQOEAW var16 = MCFQOEAW.method341(var13);
					if (var16.field935) {
						field69[arg6].method6(var14, var16.field913, var15, arg2, arg4);
					}
				}

				if (arg0 == 1) {
					field233.method405(arg6, arg4, arg2);
				}

				if (arg0 == 2) {
					field233.method406(arg6, arg4, arg2);
					MCFQOEAW var17 = MCFQOEAW.method341(var13);
					if (var17.field914 + arg2 > 103 || var17.field914 + arg4 > 103 || var17.field947 + arg2 > 103 || var17.field947 + arg4 > 103) {
						return;
					}

					if (var17.field935) {
						field69[arg6].method7(var17.field913, var17.field947, arg2, arg4, var15, var17.field914);
					}
				}

				if (arg0 == 3) {
					field233.method407(arg6, arg2, arg4);
					MCFQOEAW var18 = MCFQOEAW.method341(var13);
					if (var18.field935 && var18.field936) {
						field69[arg6].method9(arg2, arg4);
					}
				}
			}

			if (arg3 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (field188[1][arg2][arg4] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				SNNOFNNG.method481(arg4, var19, arg1, arg2, arg5, arg6, field233, field69[arg6], field366, arg3);
				return;
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method57() {
		int var1 = field434.method504("Choose Option");
		for (int var2 = 0; var2 < field388; var2++) {
			int var3 = field434.method504(field477[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field388 * 15 + 21;
		if (field1056 > 4 && field1057 > 4 && field1056 < 516 && field1057 < 338) {
			int var5 = field1056 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field1057 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field192 = true;
			field123 = 0;
			field124 = var5;
			field125 = var6;
			field126 = var1;
			field127 = field388 * 15 + 22;
		}

		if (field1056 > 553 && field1057 > 205 && field1056 < 743 && field1057 < 466) {
			int var7 = field1056 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field1057 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field192 = true;
			field123 = 1;
			field124 = var7;
			field125 = var8;
			field126 = var1;
			field127 = field388 * 15 + 22;
		}

		if (field1056 > 17 && field1057 > 357 && field1056 < 496 && field1057 < 453) {
			int var9 = field1056 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field1057 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field192 = true;
			field123 = 2;
			field124 = var9;
			field125 = var10;
			field126 = var1;
			field127 = field388 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(ZZI)V")
	public final void method58(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method59() {
		while (true) {
			OVHZHUGL var1 = field177.method22();
			if (var1 == null) {
				return;
			}

			if (var1.field1170 == 0) {
				JJMVUSJJ.method298(var1.field1173, var1.field1169);

				if ((field177.method35(var1.field1173) & 0x62) != 0) {
					field323 = true;

					if (field275 != -1 || field379 != -1) {
						field67 = true;
					}
				}
			}

			if (var1.field1170 == 1 && var1.field1169 != null) {
				OJYMITMR.method379(var1.field1169);
			}

			if (var1.field1170 == 2 && field459 == var1.field1173 && var1.field1169 != null) {
				method68(field460, var1.field1169);
			}

			if (var1.field1170 == 3 && field158 == 1) {
				for (int var2 = 0; var2 < field68.length; var2++) {
					if (field402[var2] == var1.field1173) {
						field68[var2] = var1.field1169;

						if (var1.field1169 == null) {
							field402[var2] = -1;
						}

						break;
					}

					if (field403[var2] == var1.field1173) {
						field360[var2] = var1.field1169;

						if (var1.field1169 == null) {
							field403[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1170 == 93 && field177.method37(var1.field1173)) {
				SNNOFNNG.method472(field177, new IUVBENCV(var1.field1169));
			}
		}
	}

	@ObfuscatedName("client.a(IIZIIIIIIIII)Z")
	public final boolean method60(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field164[var14][var15] = 0;
				field76[var14][var15] = 99999999;
			}
		}

		int var16 = arg4;
		int var17 = arg9;
		field164[arg4][arg9] = 99;
		field76[arg4][arg9] = 0;
		byte var18 = 0;
		int var19 = 0;
		field494[var18] = arg4;
		int var39 = var18 + 1;
		field495[var18] = arg9;
		boolean var20 = false;
		int var21 = field494.length;
		int[][] var22 = field69[field182].field5;
		while (var39 != var19) {
			var16 = field494[var19];
			var17 = field495[var19];
			var19 = (var19 + 1) % var21;

			if (arg8 == var16 && arg0 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && field69[field182].method10(var17, arg0, arg6, arg3 - 1, var16, arg8)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && field69[field182].method11(arg8, var17, var16, arg6, arg0, arg3 - 1)) {
					var20 = true;
					break;
				}
			}

			if (arg10 != 0 && arg5 != 0 && field69[field182].method12(arg10, arg0, arg7, arg5, var17, arg8, var16)) {
				var20 = true;
				break;
			}

			int var23 = field76[var16][var17] + 1;
			if (var16 > 0 && field164[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field494[var39] = var16 - 1;
				field495[var39] = var17;
				var39 = (var39 + 1) % var21;
				field164[var16 - 1][var17] = 2;
				field76[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field164[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field494[var39] = var16 + 1;
				field495[var39] = var17;
				var39 = (var39 + 1) % var21;
				field164[var16 + 1][var17] = 8;
				field76[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field164[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field494[var39] = var16;
				field495[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field164[var16][var17 - 1] = 1;
				field76[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field164[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field494[var39] = var16;
				field495[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field164[var16][var17 + 1] = 4;
				field76[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field164[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field494[var39] = var16 - 1;
				field495[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field164[var16 - 1][var17 - 1] = 3;
				field76[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field164[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field494[var39] = var16 + 1;
				field495[var39] = var17 - 1;
				var39 = (var39 + 1) % var21;
				field164[var16 + 1][var17 - 1] = 9;
				field76[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field164[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field494[var39] = var16 - 1;
				field495[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field164[var16 - 1][var17 + 1] = 6;
				field76[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field164[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field494[var39] = var16 + 1;
				field495[var39] = var17 + 1;
				var39 = (var39 + 1) % var21;
				field164[var16 + 1][var17 + 1] = 12;
				field76[var16 + 1][var17 + 1] = var23;
			}
		}

		field449 = 0;
		if (!var20) {
			if (!arg2) {
				return false;
			}

			int var24 = 1000;
			int var25 = 100;
			byte var26 = 10;
			for (int var27 = arg8 - var26; var27 <= arg8 + var26; var27++) {
				for (int var28 = arg0 - var26; var28 <= arg0 + var26; var28++) {
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && field76[var27][var28] < 100) {
						int var29 = 0;
						if (var27 < arg8) {
							var29 = arg8 - var27;
						} else if (var27 > arg8 + arg10 - 1) {
							var29 = var27 + 1 - arg8 - arg10;
						}

						int var30 = 0;
						if (var28 < arg0) {
							var30 = arg0 - var28;
						} else if (var28 > arg0 + arg5 - 1) {
							var30 = var28 + 1 - arg0 - arg5;
						}

						int var31 = var29 * var29 + var30 * var30;
						if (var31 < var24 || var24 == var31 && field76[var27][var28] < var25) {
							var24 = var31;
							var25 = field76[var27][var28];
							var16 = var27;
							var17 = var28;
						}
					}
				}
			}

			if (var24 == 1000) {
				return false;
			}

			if (arg4 == var16 && arg9 == var17) {
				return false;
			}

			field449 = 1;
		}

		byte var32 = 0;
		field494[var32] = var16;
		int var40 = var32 + 1;
		field495[var32] = var17;
		int var33;
		int var34 = var33 = field164[var16][var17];
		while (arg4 != var16 || arg9 != var17) {
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

			var34 = field164[var16][var17];
		}

		if (var40 <= 0) {
			if (arg1 == 1) {
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

		if (arg1 == 0) {
			field64.method234(45);
			field64.method235(var35 + var35 + 3);
		}

		if (arg1 == 1) {
			field64.method234(89);
			field64.method235(var35 + var35 + 3 + 14);
		}

		if (arg1 == 2) {
			field64.method234(97);
			field64.method235(var35 + var35 + 3);
		}

		field270 = field494[0];
		field271 = field495[0];

		for (int var38 = 1; var38 < var35; var38++) {
			var40--;
			field64.method235(field494[var40] - var36);
			field64.method235(field495[var40] - var37);
		}

		field64.method261(field1059[5] == 1 ? 1 : 0);
		field64.method270(field169 + var36);
		field64.method269(field170 + var37);
		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method61(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field246 = "";
				field247 = "Connecting to server...";
				method175(true);
			}

			field139 = new CSJOZVFM(method158(field485 + 43594), this);
			long var4 = RSIGORUG.method452(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field64.field733 = 0;
			field64.method235(14);
			field64.method235(var6);
			field139.method198(field64.field732, 2, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				field139.method195();
			}

			int var8 = field139.method195();
			int var9 = var8;

			if (var8 == 0) {
				field139.method197(field238.field732, 0, 8);
				field238.field733 = 0;
				field425 = field238.method251();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field425 >> 32), (int) field425 };
				field64.field733 = 0;
				field64.method235(10);
				field64.method239(var10[0]);
				field64.method239(var10[1]);
				field64.method239(var10[2]);
				field64.method239(var10[3]);
				field64.method239(signlink.uid);
				field64.method242(arg0);
				field64.method242(arg1);
				field64.method260(field235, field159);
				field176.field733 = 0;

				if (arg2) {
					field176.method235(18);
				} else {
					field176.method235(16);
				}

				field176.method235(field64.field733 + 36 + 1 + 1 + 2);
				field176.method235(255);
				field176.method236(376);
				field176.method235(field487 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field176.method239(field372[var11]);
				}

				field176.method243(0, field64.field732, field64.field733);
				field64.field737 = new ICHYZYSQ(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field147 = new ICHYZYSQ(var10);
				field139.method198(field176.field732, field176.field733, 0);
				var8 = field139.method195();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method61(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field197 = field139.method195();
				field154 = field139.method195() == 1;
				field451 = 0L;
				field452 = 0;
				field461.field910 = 0;
				field1046 = true;
				field384 = true;
				field286 = true;
				field64.field733 = 0;
				field238.field733 = 0;
				field445 = -1;
				field342 = -1;
				field343 = -1;
				field344 = -1;
				field444 = 0;
				field446 = 0;
				field95 = 0;
				field448 = 0;
				field493 = 0;
				field388 = 0;
				field192 = false;
				field1047 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field339[var13] = null;
				}

				field252 = 0;
				field82 = 0;
				field158 = 0;
				field419 = 0;
				field456 = (int) (Math.random() * 100.0D) - 50;
				field179 = (int) (Math.random() * 110.0D) - 55;
				field65 = (int) (Math.random() * 80.0D) - 40;
				field496 = (int) (Math.random() * 120.0D) - 60;
				field184 = (int) (Math.random() * 30.0D) - 20;
				field79 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field453 = 0;
				field129 = -1;
				field270 = 0;
				field271 = 0;
				field261 = 0;
				field214 = 0;

				for (int var14 = 0; var14 < field258; var14++) {
					field260[var14] = null;
					field265[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field213[var15] = null;
				}

				field491 = field260[field259] = new VJDNWPCM();
				field371.method584();
				field367.method584();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field160[var16][var17][var18] = null;
						}
					}
				}

				field474 = new ZEEWTYXI();
				field499 = 0;
				field498 = 0;
				method70(field379);
				field379 = -1;
				method70(field275);
				field275 = -1;
				method70(field492);
				field492 = -1;
				method70(field241);
				field241 = -1;
				method70(field152);
				field152 = -1;
				method70(field183);
				field183 = -1;
				method70(field140);
				field140 = -1;
				field229 = false;
				field464 = 3;
				field191 = 0;
				field192 = false;
				field136 = false;
				field475 = null;
				field334 = 0;
				field240 = -1;
				field310 = true;
				method116();

				for (int var19 = 0; var19 < 5; var19++) {
					field370[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field216[var20] = null;
					field217[var20] = false;
				}

				field70 = 0;
				field187 = 0;
				field109 = 0;
				field189 = 0;
				field462 = 0;
				field155 = 0;
				field454 = 0;
				method185();
			} else if (var8 == 3) {
				field246 = "";
				field247 = "Invalid username or password.";
			} else if (var8 == 4) {
				field246 = "Your account has been disabled.";
				field247 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field246 = "Your account is already logged in.";
				field247 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field246 = "RuneScape has been updated!";
				field247 = "Please reload this page.";
			} else if (var8 == 7) {
				field246 = "This world is full.";
				field247 = "Please use a different world.";
			} else if (var8 == 8) {
				field246 = "Unable to connect.";
				field247 = "Login server offline.";
			} else if (var8 == 9) {
				field246 = "Login limit exceeded.";
				field247 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field246 = "Unable to connect.";
				field247 = "Bad session id.";
			} else if (var8 == 12) {
				field246 = "You need a members account to login to this world.";
				field247 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field246 = "Could not complete login.";
				field247 = "Please try using a different world.";
			} else if (var8 == 14) {
				field246 = "The server is being updated.";
				field247 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field286 = true;
				field64.field733 = 0;
				field238.field733 = 0;
				field445 = -1;
				field342 = -1;
				field343 = -1;
				field344 = -1;
				field444 = 0;
				field446 = 0;
				field95 = 0;
				field388 = 0;
				field192 = false;
				field245 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field246 = "Login attempts exceeded.";
				field247 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field246 = "You are standing in a members-only area.";
				field247 = "To play on this world move to a free area first";
			} else if (var8 == 18) {
				field246 = "Account locked as we suspect it has been stolen.";
				field247 = "Press 'recover a locked account' on front page.";
			} else if (var8 == 20) {
				field246 = "Invalid loginserver requested";
				field247 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field139.method195();
				for (var21 += 3; var21 >= 0; var21--) {
					field246 = "You have only just left another world";
					field247 = "Your profile will be transferred in: " + var21;
					method175(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method61(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field246 = "Malformed login packet.";
				field247 = "Please try again.";
			} else if (var8 == 23) {
				field246 = "No reply from loginserver.";
				field247 = "Please try again.";
			} else if (var8 == 24) {
				field246 = "Error loading your profile.";
				field247 = "Please contact customer support.";
			} else if (var8 == 25) {
				field246 = "Unexpected loginserver response.";
				field247 = "Please try using a different world.";
			} else if (var8 == 26) {
				field246 = "This computers address has been blocked";
				field247 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field246 = "Unexpected server response";
				field247 = "Please try using a different world.";
			} else if (var9 != 0) {
				field246 = "No response from server";
				field247 = "Please try using a different world.";
			} else if (field73 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field73++;
				method61(arg0, arg1, arg2);
			} else {
				field246 = "No response from loginserver";
				field247 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field246 = "";
			field247 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method62() {
		if (field351 == null) {
			field1042 = null;
			field91 = null;
			field89 = null;
			field88 = null;
			field90 = null;
			field230 = null;
			field231 = null;
			field232 = null;
			field354 = new DTPUNZHN(265, 128, method135());
			TIJYBGAE.method490();
			field355 = new DTPUNZHN(265, 128, method135());
			TIJYBGAE.method490();
			field351 = new DTPUNZHN(171, 509, method135());
			TIJYBGAE.method490();
			field352 = new DTPUNZHN(132, 360, method135());
			TIJYBGAE.method490();
			field353 = new DTPUNZHN(200, 360, method135());
			TIJYBGAE.method490();
			field356 = new DTPUNZHN(238, 202, method135());
			TIJYBGAE.method490();
			field357 = new DTPUNZHN(238, 203, method135());
			TIJYBGAE.method490();
			field358 = new DTPUNZHN(94, 74, method135());
			TIJYBGAE.method490();
			field359 = new DTPUNZHN(94, 75, method135());
			TIJYBGAE.method490();

			if (field306 != null) {
				method169();
				method106();
			}

			field341 = true;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method63() {
		if (field502 == 0) {
			int var1 = field1039 / 2 - 80;
			int var2 = field1040 / 2 + 20;
			var2 += 20;
			if (field1055 == 1 && field1056 >= var1 - 75 && field1056 <= var1 + 75 && field1057 >= var2 - 20 && field1057 <= var2 + 20) {
				field502 = 3;
				field138 = 0;
			}

			int var3 = field1039 / 2 + 80;
			if (field1055 == 1 && field1056 >= var3 - 75 && field1056 <= var3 + 75 && field1057 >= var2 - 20 && field1057 <= var2 + 20) {
				field246 = "";
				field247 = "Enter your username & password.";
				field502 = 2;
				field138 = 0;
			}
		} else if (field502 == 2) {
			int var4 = field1040 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field1055 == 1 && field1057 >= var4 - 15 && field1057 < var4) {
				field138 = 0;
			}

			var4 += 15;
			if (field1055 == 1 && field1057 >= var4 - 15 && field1057 < var4) {
				field138 = 1;
			}

			var4 += 15;
			int var5 = field1039 / 2 - 80;
			int var6 = field1040 / 2 + 50;
			var6 += 20;
			if (field1055 == 1 && field1056 >= var5 - 75 && field1056 <= var5 + 75 && field1057 >= var6 - 20 && field1057 <= var6 + 20) {
				field73 = 0;
				method61(field386, field387, false);

				if (field286) {
					return;
				}
			}

			int var7 = field1039 / 2 + 80;
			if (field1055 == 1 && field1056 >= var7 - 75 && field1056 <= var7 + 75 && field1057 >= var6 - 20 && field1057 <= var6 + 20) {
				field502 = 0;
				field386 = "";
				field387 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method357();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field71.length(); var10++) {
					if (var8 == field71.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field138 == 0) {
					if (var8 == 8 && field386.length() > 0) {
						field386 = field386.substring(0, field386.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field138 = 1;
					}

					if (var9) {
						field386 = field386 + (char) var8;
					}

					if (field386.length() > 12) {
						field386 = field386.substring(0, 12);
					}
				} else if (field138 == 1) {
					if (var8 == 8 && field387.length() > 0) {
						field387 = field387.substring(0, field387.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field138 = 0;
					}

					if (var9) {
						field387 = field387 + (char) var8;
					}

					if (field387.length() > 20) {
						field387 = field387.substring(0, 20);
					}
				}
			}
		} else if (field502 == 3) {
			int var11 = field1039 / 2;
			int var12 = field1040 / 2 + 50;
			var12 += 20;
			if (field1055 == 1 && field1056 >= var11 - 75 && field1056 <= var11 + 75 && field1057 >= var12 - 20 && field1057 <= var12 + 20) {
				field502 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method64() {
		field212 = null;
		field198 = null;
		field490 = null;
		field88 = null;
		field89 = null;
		field90 = null;
		field91 = null;
		field325 = null;
		field326 = null;
		field327 = null;
		field328 = null;
		field477 = null;
		field395 = null;
		field396 = null;
		field397 = null;
		field398 = null;
		field399 = null;
		field230 = null;
		field231 = null;
		field232 = null;
		field336 = null;
		field190 = null;
		field194 = null;
		field381 = null;

		if (field177 != null) {
			field177.method25();
		}

		field177 = null;
		field380 = null;
		field213 = null;
		field215 = null;
		field371 = null;
		field367 = null;
		field427 = null;
		field428 = null;
		field429 = null;
		field391 = null;
		field392 = null;
		field393 = null;
		field394 = null;
		field311 = null;
		field165 = null;
		field64 = null;
		field176 = null;
		field238 = null;
		field227 = null;
		field228 = null;
		field111 = null;
		field200 = null;
		field201 = null;
		field202 = null;
		field203 = null;
		field204 = null;
		field366 = null;
		field188 = null;
		field233 = null;
		field69 = null;
		field356 = null;
		field357 = null;
		field358 = null;
		field359 = null;

		if (field461 != null) {
			field461.field911 = false;
		}

		field461 = null;
		field260 = null;
		field262 = null;
		field264 = null;
		field265 = null;
		field60 = null;
		field354 = null;
		field355 = null;
		field351 = null;
		field352 = null;
		field353 = null;
		field404 = null;
		field405 = null;
		field406 = null;
		field407 = null;
		field408 = null;
		field145 = null;
		field86 = null;
		field348 = null;
		field173 = null;
		field237 = null;
		field92 = null;
		field160 = null;
		field474 = null;
		field272 = null;
		field142 = null;
		field409 = null;
		field410 = null;
		field411 = null;
		field412 = null;
		field413 = null;
		field97 = null;
		field98 = null;
		field99 = null;

		try {
			if (field139 != null) {
				field139.method194();
			}
		} catch (Exception var1) {
		}

		field139 = null;
		field401 = null;
		field68 = null;
		field360 = null;
		field402 = null;
		field403 = null;
		method92();
		field164 = null;
		field76 = null;
		field494 = null;
		field495 = null;
		method124();
		MCFQOEAW.method334();
		NIJEYEOX.method366();
		IXFCVZPT.method295();
		MIIVNBFU.method343();
		YDUFKDFX.field1456 = null;
		WINORGIB.field1418 = null;
		PNNQKWHW.field1177 = null;
		XTKQUJNF.field1432 = null;
		EBBSHPSJ.field609 = null;
		EBBSHPSJ.field621 = null;
		TRINWBEO.field1355 = null;
		field1042 = null;
		VJDNWPCM.field1413 = null;
		ZGIYLEBF.method585();
		POACSVST.method386();
		JJMVUSJJ.method296();
		OJYMITMR.method380();
		System.gc();
	}

	@ObfuscatedName("client.j(I)V")
	public final void method65() {
		while (true) {
			int var1 = method357();
			if (var1 == -1) {
				return;
			}

			if (field492 != -1 && field492 == field284) {
				if (var1 == 8 && field307.length() > 0) {
					field307 = field307.substring(0, field307.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field307.length() < 12) {
					field307 = field307 + (char) var1;
				}
			} else if (field136) {
				if (var1 >= 32 && var1 <= 122 && field430.length() < 80) {
					field430 = field430 + (char) var1;
					field67 = true;
				}

				if (var1 == 8 && field430.length() > 0) {
					field430 = field430.substring(0, field430.length() - 1);
					field67 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field136 = false;
					field67 = true;

					if (field257 == 1) {
						long var2 = RSIGORUG.method452(field430);
						method129(var2);
					}

					if (field257 == 2 && field498 > 0) {
						long var4 = RSIGORUG.method452(field430);
						method157(var4);
					}

					if (field257 == 3 && field430.length() > 0) {
						field64.method234(73);
						field64.method235(0);
						int var6 = field64.field733;
						field64.method241(field287);
						PMGJNHXQ.method384(field430, field64);
						field64.method244(field64.field733 - var6);
						field430 = PMGJNHXQ.method385(field430);
						field430 = XWTMFQHB.method544(field430);
						method160(6, field430, RSIGORUG.method456(RSIGORUG.method453(field287)));

						if (field365 == 2) {
							field365 = 1;
							field151 = true;
							field64.method234(222);
							field64.method235(field301);
							field64.method235(field365);
							field64.method235(field279);
						}
					}

					if (field257 == 4 && field162 < 100) {
						long var7 = RSIGORUG.method452(field430);
						method51(var7);
					}

					if (field257 == 5 && field162 > 0) {
						long var9 = RSIGORUG.method452(field430);
						method150(var9);
					}
				}
			} else if (field191 == 1) {
				if (var1 >= 48 && var1 <= 57 && field96.length() < 10) {
					field96 = field96 + (char) var1;
					field67 = true;
				}

				if (var1 == 8 && field96.length() > 0) {
					field96 = field96.substring(0, field96.length() - 1);
					field67 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field96.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field96);
						} catch (Exception var21) {
						}

						field64.method234(0);
						field64.method239(var11);
					}

					field191 = 0;
					field67 = true;
				}
			} else if (field191 == 2) {
				if (var1 >= 32 && var1 <= 122 && field96.length() < 12) {
					field96 = field96 + (char) var1;
					field67 = true;
				}

				if (var1 == 8 && field96.length() > 0) {
					field96 = field96.substring(0, field96.length() - 1);
					field67 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field96.length() > 0) {
						field64.method234(124);
						field64.method241(RSIGORUG.method452(field96));
					}

					field191 = 0;
					field67 = true;
				}
			} else if (field191 == 3) {
				if (var1 >= 32 && var1 <= 122 && field96.length() < 40) {
					field96 = field96 + (char) var1;
					field67 = true;
				}

				if (var1 == 8 && field96.length() > 0) {
					field96 = field96.substring(0, field96.length() - 1);
					field67 = true;
				}
			} else if (field275 == -1 && field241 == -1) {
				if (var1 >= 32 && var1 <= 122 && field389.length() < 80) {
					field389 = field389 + (char) var1;
					field67 = true;
				}

				if (var1 == 8 && field389.length() > 0) {
					field389 = field389.substring(0, field389.length() - 1);
					field67 = true;
				}

				if ((var1 == 13 || var1 == 10) && field389.length() > 0) {
					if (field197 == 2) {
						if (field389.equals("::clientdrop")) {
							method183();
						}

						if (field389.equals("::lag")) {
							method134();
						}

						if (field389.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field177.method27(2); var12++) {
								field177.method23(var12, (byte) 1, 2);
							}
						}

						if (field389.equals("::fpson")) {
							field112 = true;
						}

						if (field389.equals("::fpsoff")) {
							field112 = false;
						}

						if (field389.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field69[var13].field5[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field389.startsWith("::")) {
						field64.method234(63);
						field64.method235(field389.length() - 1);
						field64.method242(field389.substring(2));
					} else {
						String var16 = field389.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field389 = field389.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field389 = field389.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field389 = field389.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field389 = field389.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field389 = field389.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field389 = field389.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field389 = field389.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field389 = field389.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field389 = field389.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field389 = field389.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field389 = field389.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field389 = field389.substring(6);
						}

						String var18 = field389.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field389 = field389.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field389 = field389.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field389 = field389.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field389 = field389.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field389 = field389.substring(6);
						}

						field64.method234(34);
						field64.method235(0);
						int var20 = field64.field733;
						field64.method235(var19);
						field64.method235(var17);
						field212.field733 = 0;
						PMGJNHXQ.method384(field389, field212);
						field64.method280(0, field212.field733, field212.field732);
						field64.method244(field64.field733 - var20);
						field389 = PMGJNHXQ.method385(field389);
						field389 = XWTMFQHB.method544(field389);
						field491.field534 = field389;
						field491.field565 = var17;
						field491.field560 = var19;
						field491.field559 = 150;

						if (field197 == 2) {
							method160(2, field491.field534, "@cr2@" + field491.field1402);
						} else if (field197 == 1) {
							method160(2, field491.field534, "@cr1@" + field491.field1402);
						} else {
							method160(2, field491.field534, field491.field1402);
						}

						if (field301 == 2) {
							field301 = 3;
							field151 = true;
							field64.method234(222);
							field64.method235(field301);
							field64.method235(field365);
							field64.method235(field279);
						}
					}

					field389 = "";
					field67 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method66() {
		if (field1042 == null) {
			method124();
			field351 = null;
			field352 = null;
			field353 = null;
			field354 = null;
			field355 = null;
			field356 = null;
			field357 = null;
			field358 = null;
			field359 = null;
			field91 = null;
			field89 = null;
			field88 = null;
			field90 = null;
			field230 = null;
			field231 = null;
			field232 = null;
			field1042 = new DTPUNZHN(503, 765, method135());
			field341 = true;
		}
	}

	@ObfuscatedName("client.a(IZLGPLGZASP;I)V")
	public final void method67(int arg0, GPLGZASP arg1, int arg2) {
		int var4 = arg0 * arg0 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field79 + field496 & 0x7FF;
			int var6 = JJMVUSJJ.field865[var5];
			int var7 = JJMVUSJJ.field866[var5];
			var6 = var6 * 256 / (field184 + 256);
			var7 = var7 * 256 / (field184 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field122.method225(256, 15, 20, 20, var12 + 94 + 4 - 10, var10, 15, 83 - var13 - 20);
		} else {
			method171(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void method68(boolean arg0, byte[] arg1) {
		if (field94) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method69() {
		field89.method205();

		if (field453 == 2) {
			byte[] var1 = field428.field1274;
			int[] var2 = TIJYBGAE.field1344;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field145.method224(0, 256, field276, 0, field146, 33, 33, 25, 25, field79);
			field90.method205();
			ZGIYLEBF.field1495 = field223;
		} else {
			int var5 = field79 + field496 & 0x7FF;
			int var6 = field491.field548 / 32 + 48;
			int var7 = 464 - field491.field549 / 32;
			field272.method224(25, field184 + 256, field289, 5, field181, 146, 151, var6, var7, var5);
			field145.method224(0, 256, field276, 0, field146, 33, 33, 25, 25, field79);

			for (int var8 = 0; var8 < field226; var8++) {
				int var9 = field227[var8] * 4 + 2 - field491.field548 / 32;
				int var10 = field228[var8] * 4 + 2 - field491.field549 / 32;
				method171(var9, var10, field111[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					ZEEWTYXI var13 = field160[field182][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field491.field548 / 32;
						int var15 = var12 * 4 + 2 - field491.field549 / 32;
						method171(var14, var15, field409);
					}
				}
			}

			for (int var16 = 0; var16 < field214; var16++) {
				KPZIZBER var17 = field213[field215[var16]];
				if (var17 != null && var17.method203()) {
					NIJEYEOX var18 = var17.field906;
					if (var18.field1094 != null) {
						var18 = var18.method362();
					}

					if (var18 != null && var18.field1106 && var18.field1101) {
						int var19 = var17.field548 / 32 - field491.field548 / 32;
						int var20 = var17.field549 / 32 - field491.field549 / 32;
						method171(var19, var20, field410);
					}
				}
			}

			for (int var21 = 0; var21 < field261; var21++) {
				VJDNWPCM var22 = field260[field262[var21]];
				if (var22 != null && var22.method203()) {
					int var23 = var22.field548 / 32 - field491.field548 / 32;
					int var24 = var22.field549 / 32 - field491.field549 / 32;
					boolean var25 = false;
					long var26 = RSIGORUG.method452(var22.field1402);
					for (int var28 = 0; var28 < field498; var28++) {
						if (field194[var28] == var26 && field381[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field491.field1411 != 0 && var22.field1411 != 0 && field491.field1411 == var22.field1411) {
						var29 = true;
					}

					if (var25) {
						method171(var23, var24, field412);
					} else if (var29) {
						method171(var23, var24, field413);
					} else {
						method171(var23, var24, field411);
					}
				}
			}

			if (field493 != 0 && field292 % 20 < 10) {
				if (field493 == 1 && field62 >= 0 && field62 < field213.length) {
					KPZIZBER var30 = field213[field62];
					if (var30 != null) {
						int var31 = var30.field548 / 32 - field491.field548 / 32;
						int var32 = var30.field549 / 32 - field491.field549 / 32;
						method67(var31, field489, var32);
					}
				}

				if (field493 == 2) {
					int var33 = (field329 - field169) * 4 + 2 - field491.field548 / 32;
					int var34 = (field330 - field170) * 4 + 2 - field491.field549 / 32;
					method67(var33, field489, var34);
				}

				if (field493 == 10 && field113 >= 0 && field113 < field260.length) {
					VJDNWPCM var35 = field260[field113];
					if (var35 != null) {
						int var36 = var35.field548 / 32 - field491.field548 / 32;
						int var37 = var35.field549 / 32 - field491.field549 / 32;
						method67(var36, field489, var37);
					}
				}
			}

			if (field270 != 0) {
				int var38 = field270 * 4 + 2 - field491.field548 / 32;
				int var39 = field271 * 4 + 2 - field491.field549 / 32;
				method171(var38, var39, field488);
			}

			TIJYBGAE.method492(3, 78, 0xFFFFFF, 3, 97);
			field90.method205();
			ZGIYLEBF.field1495 = field223;
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method70(int arg0) {
		MIIVNBFU.method348(arg0);
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method71() {
		int var1 = field124;
		int var2 = field125;
		int var3 = field126;
		int var4 = field127;
		int var5 = 0x5D5447;
		TIJYBGAE.method492(var3, var2, var5, var4, var1);
		TIJYBGAE.method492(var3 - 2, var2 + 1, 0, 16, var1 + 1);
		TIJYBGAE.method493(0, var3 - 2, var4 - 19, var2 + 18, var1 + 1);
		field434.method506(var5, "Choose Option", var1 + 3, var2 + 14);
		int var6 = field1049;
		int var7 = field1050;
		if (field123 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field123 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field123 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field388; var8++) {
			int var9 = (field388 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field434.method510(field477[var8], true, var1 + 3, var10, var9);
		}
	}

	@ObfuscatedName("client.a(ZLMIIVNBFU;)Z")
	public final boolean method72(MIIVNBFU arg0) {
		int var2 = arg0.field1020;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field477[field388] = "Remove @whi@" + arg0.field969;
				field327[field388] = 169;
				field388++;
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

		field477[field388] = "Remove @whi@" + field190[var2];
		field327[field388] = 140;
		field388++;
		field477[field388] = "Message @whi@" + field190[var2];
		field327[field388] = 788;
		field388++;
		return true;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method73() {
		if (field465 || field368 || field178) {
			method174();
		} else {
			field166++;

			if (field286) {
				method82();
			} else {
				method175(false);
			}

			field455 = 0;
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method74() {
		field168++;
		method47(true);
		method48(true);
		method47(false);
		method48(false);
		method101();
		method154();

		if (!field458) {
			int var1 = field78;
			if (field293 / 256 > var1) {
				var1 = field293 / 256;
			}

			if (field305[4] && field239[4] + 128 > var1) {
				var1 = field239[4] + 128;
			}

			int var2 = field79 + field65 & 0x7FF;
			method140(var1, field469, method146(field491.field549, field182, field491.field548) - 50, field470, var2, var1 * 3 + 600);
			field312++;
			if (field312 > 148) {
				field312 = 0;
				field64.method234(75);
				field64.method239(0);
			}
		}

		int var3;
		if (field458) {
			var3 = method115();
		} else {
			var3 = method114();
		}

		int var4 = field104;
		int var5 = field105;
		int var6 = field106;
		int var7 = field107;
		int var8 = field108;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field305[var9]) {
				int var10 = (int) (Math.random() * (field211[var9] * 2 + 1) + Math.sin(field500[var9] / 100.0D * field285[var9]) * field239[var9] - field211[var9]);
				if (var9 == 0) {
					field104 += var10;
				}

				if (var9 == 1) {
					field105 += var10;
				}

				if (var9 == 2) {
					field106 += var10;
				}

				if (var9 == 3) {
					field108 = field108 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field107 += var10;
					if (field107 < 128) {
						field107 = 128;
					}

					if (field107 > 383) {
						field107 = 383;
					}
				}
			}
		}

		int var11 = ZGIYLEBF.field1504;
		JJMVUSJJ.field860 = true;
		JJMVUSJJ.field863 = 0;
		JJMVUSJJ.field861 = field1049 - 4;
		JJMVUSJJ.field862 = field1050 - 4;
		TIJYBGAE.method490();
		field233.method426(field108, var3, field107, field105, field106, field104);
		field233.method401();
		method165();
		method50();
		method149(var11);
		method117();
		field90.method206(4, field1041, 4);
		field104 = var4;
		field105 = var5;
		field106 = var6;
		field107 = var7;
		field108 = var8;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method75() {
		for (int var1 = 0; var1 < field214; var1++) {
			int var2 = field215[var1];
			KPZIZBER var3 = field213[var2];
			if (var3 != null) {
				method76(var3, var3.field906.field1075);
			}
		}
	}

	@ObfuscatedName("client.a(ILDBHOKPMQ;I)V")
	public final void method76(DBHOKPMQ arg0, int arg1) {
		if (arg0.field548 < 128 || arg0.field549 < 128 || arg0.field548 >= 13184 || arg0.field549 >= 13184) {
			arg0.field543 = -1;
			arg0.field529 = -1;
			arg0.field518 = 0;
			arg0.field519 = 0;
			arg0.field548 = arg0.field537[0] * 128 + arg0.field561 * 64;
			arg0.field549 = arg0.field538[0] * 128 + arg0.field561 * 64;
			arg0.method200();
		}

		if (field491 == arg0 && (arg0.field548 < 1536 || arg0.field549 < 1536 || arg0.field548 >= 11776 || arg0.field549 >= 11776)) {
			arg0.field543 = -1;
			arg0.field529 = -1;
			arg0.field518 = 0;
			arg0.field519 = 0;
			arg0.field548 = arg0.field537[0] * 128 + arg0.field561 * 64;
			arg0.field549 = arg0.field538[0] * 128 + arg0.field561 * 64;
			arg0.method200();
		}

		if (arg0.field518 > field292) {
			method77(arg0);
		} else if (arg0.field519 >= field292) {
			method78(arg0);
		} else {
			method79(arg0);
		}

		method80(arg0);
		method81(arg0);
	}

	@ObfuscatedName("client.a(ZLDBHOKPMQ;)V")
	public final void method77(DBHOKPMQ arg0) {
		int var2 = arg0.field518 - field292;
		int var3 = arg0.field561 * 64 + arg0.field514 * 128;
		int var4 = arg0.field561 * 64 + arg0.field516 * 128;
		arg0.field548 += (var3 - arg0.field548) / var2;
		arg0.field549 += (var4 - arg0.field549) / var2;
		arg0.field555 = 0;

		if (arg0.field520 == 0) {
			arg0.field528 = 1024;
		}

		if (arg0.field520 == 1) {
			arg0.field528 = 1536;
		}

		if (arg0.field520 == 2) {
			arg0.field528 = 0;
		}

		if (arg0.field520 == 3) {
			arg0.field528 = 512;
		}
	}

	@ObfuscatedName("client.a(LDBHOKPMQ;Z)V")
	public final void method78(DBHOKPMQ arg0) {
		if (field292 == arg0.field519 || arg0.field543 == -1 || arg0.field546 != 0 || arg0.field545 + 1 > XTKQUJNF.field1432[arg0.field543].method532(arg0.field544)) {
			int var2 = arg0.field519 - arg0.field518;
			int var3 = field292 - arg0.field518;
			int var4 = arg0.field561 * 64 + arg0.field514 * 128;
			int var5 = arg0.field561 * 64 + arg0.field516 * 128;
			int var6 = arg0.field561 * 64 + arg0.field515 * 128;
			int var7 = arg0.field561 * 64 + arg0.field517 * 128;
			arg0.field548 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field549 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field555 = 0;

		if (arg0.field520 == 0) {
			arg0.field528 = 1024;
		}

		if (arg0.field520 == 1) {
			arg0.field528 = 1536;
		}

		if (arg0.field520 == 2) {
			arg0.field528 = 0;
		}

		if (arg0.field520 == 3) {
			arg0.field528 = 512;
		}

		arg0.field550 = arg0.field528;
	}

	@ObfuscatedName("client.a(LDBHOKPMQ;I)V")
	public final void method79(DBHOKPMQ arg0) {
		arg0.field562 = arg0.field535;
		if (arg0.field523 == 0) {
			arg0.field555 = 0;
		} else {
			if (arg0.field543 != -1 && arg0.field546 == 0) {
				XTKQUJNF var2 = XTKQUJNF.field1432[arg0.field543];
				if (arg0.field540 > 0 && var2.field1444 == 0) {
					arg0.field555++;
					return;
				}

				if (arg0.field540 <= 0 && var2.field1445 == 0) {
					arg0.field555++;
					return;
				}
			}

			int var3 = arg0.field548;
			int var4 = arg0.field549;
			int var5 = arg0.field537[arg0.field523 - 1] * 128 + arg0.field561 * 64;
			int var6 = arg0.field538[arg0.field523 - 1] * 128 + arg0.field561 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field528 = 1280;
					} else if (var4 > var6) {
						arg0.field528 = 1792;
					} else {
						arg0.field528 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field528 = 768;
					} else if (var4 > var6) {
						arg0.field528 = 256;
					} else {
						arg0.field528 = 512;
					}
				} else if (var4 < var6) {
					arg0.field528 = 1024;
				} else {
					arg0.field528 = 0;
				}

				int var7 = arg0.field528 - arg0.field550 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field525;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field524;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field527;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field526;
				}

				if (var8 == -1) {
					var8 = arg0.field524;
				}

				arg0.field562 = var8;
				int var9 = 4;
				if (arg0.field550 != arg0.field528 && arg0.field554 == -1 && arg0.field539 != 0) {
					var9 = 2;
				}

				if (arg0.field523 > 2) {
					var9 = 6;
				}

				if (arg0.field523 > 3) {
					var9 = 8;
				}

				if (arg0.field555 > 0 && arg0.field523 > 1) {
					var9 = 8;
					arg0.field555--;
				}

				if (arg0.field542[arg0.field523 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field562 == arg0.field524 && arg0.field566 != -1) {
					arg0.field562 = arg0.field566;
				}

				if (var3 < var5) {
					arg0.field548 += var9;
					if (arg0.field548 > var5) {
						arg0.field548 = var5;
					}
				} else if (var3 > var5) {
					arg0.field548 -= var9;
					if (arg0.field548 < var5) {
						arg0.field548 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field549 += var9;
					if (arg0.field549 > var6) {
						arg0.field549 = var6;
					}
				} else if (var4 > var6) {
					arg0.field549 -= var9;
					if (arg0.field549 < var6) {
						arg0.field549 = var6;
					}
				}

				if (arg0.field548 == var5 && arg0.field549 == var6) {
					arg0.field523--;

					if (arg0.field540 > 0) {
						arg0.field540--;
						return;
					}
				}
			} else {
				arg0.field548 = var5;
				arg0.field549 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(LDBHOKPMQ;I)V")
	public final void method80(DBHOKPMQ arg0) {
		if (arg0.field539 != 0) {
			if (arg0.field554 != -1 && arg0.field554 < 32768) {
				KPZIZBER var2 = field213[arg0.field554];
				if (var2 != null) {
					int var3 = arg0.field548 - var2.field548;
					int var4 = arg0.field549 - var2.field549;
					if (var3 != 0 || var4 != 0) {
						arg0.field528 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field554 >= 32768) {
				int var5 = arg0.field554 - 32768;
				if (field299 == var5) {
					var5 = field259;
				}

				VJDNWPCM var6 = field260[var5];
				if (var6 != null) {
					int var7 = arg0.field548 - var6.field548;
					int var8 = arg0.field549 - var6.field549;
					if (var7 != 0 || var8 != 0) {
						arg0.field528 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field521 != 0 || arg0.field522 != 0) && (arg0.field523 == 0 || arg0.field555 > 0)) {
				int var9 = arg0.field548 - (arg0.field521 - field169 - field169) * 64;
				int var10 = arg0.field549 - (arg0.field522 - field170 - field170) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field528 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field521 = 0;
				arg0.field522 = 0;
			}

			int var11 = arg0.field528 - arg0.field550 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field539 || var11 > 2048 - arg0.field539) {
					arg0.field550 = arg0.field528;
				} else if (var11 > 1024) {
					arg0.field550 -= arg0.field539;
				} else {
					arg0.field550 += arg0.field539;
				}

				arg0.field550 &= 0x7FF;
				if (arg0.field562 == arg0.field535 && arg0.field550 != arg0.field528) {
					if (arg0.field536 != -1) {
						arg0.field562 = arg0.field536;
						return;
					}

					arg0.field562 = arg0.field524;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILDBHOKPMQ;)V")
	public final void method81(DBHOKPMQ arg0) {
		arg0.field568 = false;

		if (arg0.field562 != -1) {
			XTKQUJNF var2 = XTKQUJNF.field1432[arg0.field562];
			arg0.field564++;
			if (arg0.field563 < var2.field1433 && arg0.field564 > var2.method532(arg0.field563)) {
				arg0.field564 = 1;
				arg0.field563++;
			}

			if (arg0.field563 >= var2.field1433) {
				arg0.field564 = 1;
				arg0.field563 = 0;
			}
		}

		if (arg0.field529 != -1 && field292 >= arg0.field532) {
			if (arg0.field530 < 0) {
				arg0.field530 = 0;
			}

			XTKQUJNF var3 = EBBSHPSJ.field609[arg0.field529].field613;
			arg0.field531++;
			if (arg0.field530 < var3.field1433 && arg0.field531 > var3.method532(arg0.field530)) {
				arg0.field531 = 1;
				arg0.field530++;
			}

			if (arg0.field530 >= var3.field1433 && (arg0.field530 < 0 || arg0.field530 >= var3.field1433)) {
				arg0.field529 = -1;
			}
		}

		if (arg0.field543 != -1 && arg0.field546 <= 1) {
			XTKQUJNF var4 = XTKQUJNF.field1432[arg0.field543];
			if (var4.field1444 == 1 && arg0.field540 > 0 && arg0.field518 <= field292 && arg0.field519 < field292) {
				arg0.field546 = 1;
				return;
			}
		}

		if (arg0.field543 != -1 && arg0.field546 == 0) {
			XTKQUJNF var5 = XTKQUJNF.field1432[arg0.field543];
			arg0.field545++;
			if (arg0.field544 < var5.field1433 && arg0.field545 > var5.method532(arg0.field544)) {
				arg0.field545 = 1;
				arg0.field544++;
			}

			if (arg0.field544 >= var5.field1433) {
				arg0.field544 -= var5.field1437;
				arg0.field547++;
				if (arg0.field547 >= var5.field1443) {
					arg0.field543 = -1;
				}

				if (arg0.field544 < 0 || arg0.field544 >= var5.field1433) {
					arg0.field543 = -1;
				}
			}

			arg0.field568 = var5.field1439;
		}

		if (arg0.field546 > 0) {
			arg0.field546--;
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method82() {
		if (field241 == -1 || field158 != 2 && field1042 == null) {
			if (field341) {
				method185();
				field341 = false;
				field391.method206(0, field1041, 4);
				field392.method206(0, field1041, 357);
				field393.method206(722, field1041, 4);
				field394.method206(743, field1041, 205);
				field395.method206(0, field1041, 0);
				field396.method206(516, field1041, 4);
				field397.method206(516, field1041, 205);
				field398.method206(496, field1041, 357);
				field399.method206(0, field1041, 338);
				field323 = true;
				field67 = true;
				field100 = true;
				field151 = true;

				if (field158 != 2) {
					field90.method206(4, field1041, 4);
					field89.method206(550, field1041, 4);
				}
			}

			if (field158 == 2) {
				method74();
			}

			if (field192 && field123 == 1) {
				field323 = true;
			}

			if (field183 != -1) {
				boolean var3 = method87(field183, field382);
				if (var3) {
					field323 = true;
				}
			}

			if (field417 == 2) {
				field323 = true;
			}

			if (field480 == 2) {
				field323 = true;
			}

			if (field323) {
				method153();
				field323 = false;
			}

			field175++;
			if (field175 > 1085) {
				field175 = 0;
				field64.method234(22);
				field64.method235(0);
				int var4 = field64.field733;

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method235(22);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method235(115);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(11812);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method235(72);
				}

				field64.method236(38281);
				field64.method236(19117);

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(5064);
				}

				field64.method235(17);
				field64.method236(51022);
				field64.method235((int) (Math.random() * 256.0D));
				field64.method244(field64.field733 - var4);
			}

			if (field275 == -1 && field191 == 0) {
				field441.field980 = field290 - field157 - 77;

				if (field1049 > 448 && field1049 < 560 && field1050 > 332) {
					method84(77, field290, 0, 463, field1049 - 17, field441, field1050 - 357, -1);
				}

				int var5 = field290 - field441.field980 - 77;
				if (var5 < 0) {
					var5 = 0;
				}

				if (var5 > field290 - 77) {
					var5 = field290 - 77;
				}

				if (field157 != var5) {
					field157 = var5;
					field67 = true;
				}
			}

			if (field275 == -1 && field191 == 3) {
				int var6 = field132 * 14 + 7;
				field441.field980 = field135;

				if (field1049 > 448 && field1049 < 560 && field1050 > 332) {
					method84(77, var6, 0, 463, field1049 - 17, field441, field1050 - 357, -1);
				}

				int var7 = field441.field980;
				if (var7 < 0) {
					var7 = 0;
				}

				if (var7 > var6 - 77) {
					var7 = var6 - 77;
				}

				if (field135 != var7) {
					field135 = var7;
					field67 = true;
				}
			}

			if (field275 != -1) {
				boolean var8 = method87(field275, field382);
				if (var8) {
					field67 = true;
				}
			}

			if (field417 == 3) {
				field67 = true;
			}

			if (field480 == 3) {
				field67 = true;
			}

			if (field475 != null) {
				field67 = true;
			}

			if (field192 && field123 == 2) {
				field67 = true;
			}

			if (field67) {
				method145();
				field67 = false;
			}

			if (field158 == 2) {
				method69();
				field89.method206(550, field1041, 4);
			}

			if (field240 != -1) {
				field100 = true;
			}

			if (field100) {
				if (field240 != -1 && field464 == field240) {
					field240 = -1;
					field64.method234(192);
					field64.method235(field464);
				}

				field100 = false;
				field232.method205();
				field99.method463(0, 0);

				if (field183 == -1) {
					if (field300[field464] != -1) {
						if (field464 == 0) {
							field200.method463(10, 22);
						}

						if (field464 == 1) {
							field201.method463(8, 54);
						}

						if (field464 == 2) {
							field201.method463(8, 82);
						}

						if (field464 == 3) {
							field202.method463(8, 110);
						}

						if (field464 == 4) {
							field204.method463(8, 153);
						}

						if (field464 == 5) {
							field204.method463(8, 181);
						}

						if (field464 == 6) {
							field203.method463(9, 209);
						}
					}

					if (field300[0] != -1 && (field240 != 0 || field292 % 20 < 10)) {
						field165[0].method463(13, 29);
					}

					if (field300[1] != -1 && (field240 != 1 || field292 % 20 < 10)) {
						field165[1].method463(11, 53);
					}

					if (field300[2] != -1 && (field240 != 2 || field292 % 20 < 10)) {
						field165[2].method463(11, 82);
					}

					if (field300[3] != -1 && (field240 != 3 || field292 % 20 < 10)) {
						field165[3].method463(12, 115);
					}

					if (field300[4] != -1 && (field240 != 4 || field292 % 20 < 10)) {
						field165[4].method463(13, 153);
					}

					if (field300[5] != -1 && (field240 != 5 || field292 % 20 < 10)) {
						field165[5].method463(11, 180);
					}

					if (field300[6] != -1 && (field240 != 6 || field292 % 20 < 10)) {
						field165[6].method463(13, 208);
					}
				}

				field232.method206(516, field1041, 160);
				field231.method205();
				field98.method463(0, 0);

				if (field183 == -1) {
					if (field300[field464] != -1) {
						if (field464 == 7) {
							field404.method463(0, 42);
						}

						if (field464 == 8) {
							field405.method463(0, 74);
						}

						if (field464 == 9) {
							field405.method463(0, 102);
						}

						if (field464 == 10) {
							field406.method463(1, 130);
						}

						if (field464 == 11) {
							field408.method463(0, 173);
						}

						if (field464 == 12) {
							field408.method463(0, 201);
						}

						if (field464 == 13) {
							field407.method463(0, 229);
						}
					}

					if (field300[8] != -1 && (field240 != 8 || field292 % 20 < 10)) {
						field165[7].method463(2, 74);
					}

					if (field300[9] != -1 && (field240 != 9 || field292 % 20 < 10)) {
						field165[8].method463(3, 102);
					}

					if (field300[10] != -1 && (field240 != 10 || field292 % 20 < 10)) {
						field165[9].method463(4, 137);
					}

					if (field300[11] != -1 && (field240 != 11 || field292 % 20 < 10)) {
						field165[10].method463(2, 174);
					}

					if (field300[12] != -1 && (field240 != 12 || field292 % 20 < 10)) {
						field165[11].method463(2, 201);
					}

					if (field300[13] != -1 && (field240 != 13 || field292 % 20 < 10)) {
						field165[12].method463(2, 226);
					}
				}

				field231.method206(496, field1041, 466);
				field90.method205();
				ZGIYLEBF.field1495 = field223;
			}

			if (field151) {
				field151 = false;
				field230.method205();
				field97.method463(0, 0);
				field433.method503("Public chat", 0xFFFFFF, 55, 28, true);

				if (field301 == 0) {
					field433.method503("On", 0xFF00, 55, 41, true);
				}

				if (field301 == 1) {
					field433.method503("Friends", 0xFFFF00, 55, 41, true);
				}

				if (field301 == 2) {
					field433.method503("Off", 0xFF0000, 55, 41, true);
				}

				if (field301 == 3) {
					field433.method503("Hide", 0xFFFF, 55, 41, true);
				}

				field433.method503("Private chat", 0xFFFFFF, 184, 28, true);

				if (field365 == 0) {
					field433.method503("On", 0xFF00, 184, 41, true);
				}

				if (field365 == 1) {
					field433.method503("Friends", 0xFFFF00, 184, 41, true);
				}

				if (field365 == 2) {
					field433.method503("Off", 0xFF0000, 184, 41, true);
				}

				field433.method503("Trade/compete", 0xFFFFFF, 324, 28, true);

				if (field279 == 0) {
					field433.method503("On", 0xFF00, 324, 41, true);
				}

				if (field279 == 1) {
					field433.method503("Friends", 0xFFFF00, 324, 41, true);
				}

				if (field279 == 2) {
					field433.method503("Off", 0xFF0000, 324, 41, true);
				}

				field433.method503("Report abuse", 0xFFFFFF, 458, 33, true);
				field230.method206(0, field1041, 453);
				field90.method205();
				ZGIYLEBF.field1495 = field223;
			}

			field382 = 0;
		} else {
			if (field158 == 2) {
				method87(field241, field382);

				if (field152 != -1) {
					method87(field152, field382);
				}

				field382 = 0;
				method66();
				field1042.method205();
				ZGIYLEBF.field1495 = field224;
				TIJYBGAE.method490();
				field341 = true;
				MIIVNBFU var1 = MIIVNBFU.method350(field241);
				if (var1.field962 == 512 && var1.field1031 == 334 && var1.field1014 == 0) {
					var1.field962 = 765;
					var1.field1031 = 503;
				}

				method133(0, var1, 0, 0);

				if (field152 != -1) {
					MIIVNBFU var2 = MIIVNBFU.method350(field152);
					if (var2.field962 == 512 && var2.field1031 == 334 && var2.field1014 == 0) {
						var2.field962 = 765;
						var2.field1031 = 503;
					}

					method133(0, var2, 0, 0);
				}

				if (field192) {
					method71();
				} else {
					method109();
					method96();
				}
			}

			field1042.method206(0, field1041, 0);
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method83() {
		for (JQXBQBEJ var1 = (JQXBQBEJ) field474.method580(); var1 != null; var1 = (JQXBQBEJ) field474.method582()) {
			if (var1.field875 == -1) {
				var1.field876 = 0;
				method162(var1);
			} else {
				var1.method602();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIILMIIVNBFU;III)V")
	public final void method84(int arg0, int arg1, int arg2, int arg3, int arg4, MIIVNBFU arg5, int arg6, int arg7) {
		if (field74) {
			field324 = 32;
		} else {
			field324 = 0;
		}

		field74 = false;
		if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
			arg5.field980 -= field455 * 4;

			if (arg7 == 1) {
				field323 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field67 = true;
			}
		} else if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg0 + arg2 - 16 && arg6 < arg0 + arg2) {
			arg5.field980 += field455 * 4;

			if (arg7 == 1) {
				field323 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field67 = true;
			}
		} else if (arg4 >= arg3 - field324 && arg4 < arg3 + field324 + 16 && arg6 >= arg2 + 16 && arg6 < arg0 + arg2 - 16 && field455 > 0) {
			int var9 = (arg0 - 32) * arg0 / arg1;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg6 - arg2 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg5.field980 = (arg1 - arg0) * var10 / var11;

			if (arg7 == 1) {
				field323 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field67 = true;
			}

			field74 = true;
		}
	}

	@ObfuscatedName("client.a(IILIUVBENCV;)V")
	public final void method85(int arg0, IUVBENCV arg1) {
		field59 = 0;
		field263 = 0;
		method89(arg1, arg0);
		method128(arg0, arg1);
		method112(arg0, arg1);

		for (int var3 = 0; var3 < field59; var3++) {
			int var4 = field60[var3];
			if (field292 != field213[var4].field567) {
				field213[var4].field906 = null;
				field213[var4] = null;
			}
		}

		if (arg1.field733 != arg0) {
			signlink.reporterror(field386 + " size mismatch in getnpcpos - pos:" + arg1.field733 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field214; var5++) {
			if (field213[field215[var5]] == null) {
				signlink.reporterror(field386 + " null entry in npc list - pos:" + var5 + " size:" + field214);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method86() {
		int var1 = field436 * 128 + 64;
		int var2 = field437 * 128 + 64;
		int var3 = method146(var2, field182, var1) - field438;

		if (field104 < var1) {
			field104 += (var1 - field104) * field440 / 1000 + field439;
			if (field104 > var1) {
				field104 = var1;
			}
		}

		if (field104 > var1) {
			field104 -= (field104 - var1) * field440 / 1000 + field439;
			if (field104 < var1) {
				field104 = var1;
			}
		}

		if (field105 < var3) {
			field105 += (var3 - field105) * field440 / 1000 + field439;
			if (field105 > var3) {
				field105 = var3;
			}
		}

		if (field105 > var3) {
			field105 -= (field105 - var3) * field440 / 1000 + field439;
			if (field105 < var3) {
				field105 = var3;
			}
		}

		if (field106 < var2) {
			field106 += (var2 - field106) * field440 / 1000 + field439;
			if (field106 > var2) {
				field106 = var2;
			}
		}

		if (field106 > var2) {
			field106 -= (field106 - var2) * field440 / 1000 + field439;
			if (field106 < var2) {
				field106 = var2;
			}
		}

		field400++;
		if (field400 > 131) {
			field400 = 0;
			field64.method234(131);
			field64.method235(223);
		}

		int var4 = field205 * 128 + 64;
		int var5 = field206 * 128 + 64;
		int var6 = method146(var5, field182, var4) - field207;
		int var7 = var4 - field104;
		int var8 = var6 - field105;
		int var9 = var5 - field106;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field107 < var11) {
			field107 += (var11 - field107) * field209 / 1000 + field208;
			if (field107 > var11) {
				field107 = var11;
			}
		}

		if (field107 > var11) {
			field107 -= (field107 - var11) * field209 / 1000 + field208;
			if (field107 < var11) {
				field107 = var11;
			}
		}

		int var13 = var12 - field108;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field108 += field209 * var13 / 1000 + field208;
			field108 &= 0x7FF;
		}

		if (var13 < 0) {
			field108 -= -var13 * field209 / 1000 + field208;
			field108 &= 0x7FF;
		}

		int var14 = var12 - field108;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field108 = var12;
		}
	}

	@ObfuscatedName("client.a(IBI)Z")
	public final boolean method87(int arg0, int arg1) {
		boolean var3 = false;
		MIIVNBFU var4 = MIIVNBFU.method350(arg0);
		for (int var5 = 0; var5 < var4.field993.length && var4.field993[var5] != -1; var5++) {
			MIIVNBFU var6 = MIIVNBFU.method350(var4.field993[var5]);
			if (var6.field1014 == 0) {
				var3 |= method87(var6.field963, arg1);
			}

			if (var6.field1014 == 6 && (var6.field981 != -1 || var6.field982 != -1)) {
				boolean var7 = method138(var6);
				int var8;
				if (var7) {
					var8 = var6.field982;
				} else {
					var8 = var6.field981;
				}

				if (var8 != -1) {
					XTKQUJNF var9 = XTKQUJNF.field1432[var8];
					var6.field994 += arg1;
					while (var6.field994 > var9.method532(var6.field967)) {
						var6.field994 -= var9.method532(var6.field967);
						var6.field967++;
						if (var6.field967 >= var9.field1433) {
							var6.field967 -= var9.field1437;
							if (var6.field967 < 0 || var6.field967 >= var9.field1433) {
								var6.field967 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1014 == 6 && var6.field968 != 0) {
				int var10 = var6.field968 >> 16;
				int var11 = var6.field968 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1011 = var6.field1011 + var10 & 0x7FF;
				var6.field1012 = var6.field1012 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(ILIUVBENCV;I)V")
	public final void method88(int arg0, IUVBENCV arg1) {
		int var3 = arg1.method256(8);
		if (var3 < field261) {
			for (int var4 = var3; var4 < field261; var4++) {
				field60[field59++] = field262[var4];
			}
		}

		if (var3 > field261) {
			signlink.reporterror(field386 + " Too many players");
			throw new RuntimeException("eek");
		}

		field261 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field262[var5];
			VJDNWPCM var7 = field260[var6];
			int var8 = arg1.method256(1);
			if (var8 == 0) {
				field262[field261++] = var6;
				var7.field567 = field292;
			} else {
				int var9 = arg1.method256(2);
				if (var9 == 0) {
					field262[field261++] = var6;
					var7.field567 = field292;
					field264[field263++] = var6;
				} else if (var9 == 1) {
					field262[field261++] = var6;
					var7.field567 = field292;
					int var10 = arg1.method256(3);
					var7.method201(var10, false);
					int var11 = arg1.method256(1);
					if (var11 == 1) {
						field264[field263++] = var6;
					}
				} else if (var9 == 2) {
					field262[field261++] = var6;
					var7.field567 = field292;
					int var12 = arg1.method256(3);
					var7.method201(var12, true);
					int var13 = arg1.method256(3);
					var7.method201(var13, true);
					int var14 = arg1.method256(1);
					if (var14 == 1) {
						field264[field263++] = var6;
					}
				} else if (var9 == 3) {
					field60[field59++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LIUVBENCV;II)V")
	public final void method89(IUVBENCV arg0, int arg1) {
		arg0.method255();
		int var3 = arg0.method256(8);
		if (var3 < field214) {
			for (int var4 = var3; var4 < field214; var4++) {
				field60[field59++] = field215[var4];
			}
		}

		if (var3 > field214) {
			signlink.reporterror(field386 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field214 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field215[var5];
			KPZIZBER var7 = field213[var6];
			int var8 = arg0.method256(1);
			if (var8 == 0) {
				field215[field214++] = var6;
				var7.field567 = field292;
			} else {
				int var9 = arg0.method256(2);
				if (var9 == 0) {
					field215[field214++] = var6;
					var7.field567 = field292;
					field264[field263++] = var6;
				} else if (var9 == 1) {
					field215[field214++] = var6;
					var7.field567 = field292;
					int var10 = arg0.method256(3);
					var7.method201(var10, false);
					int var11 = arg0.method256(1);
					if (var11 == 1) {
						field264[field263++] = var6;
					}
				} else if (var9 == 2) {
					field215[field214++] = var6;
					var7.field567 = field292;
					int var12 = arg0.method256(3);
					var7.method201(var12, true);
					int var13 = arg0.method256(3);
					var7.method201(var13, true);
					int var14 = arg0.method256(1);
					if (var14 == 1) {
						field264[field263++] = var6;
					}
				} else if (var9 == 3) {
					field60[field59++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method90(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method90(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.m(I)Ljava/lang/String;")
	public final String method91() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field1044 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.n(I)V")
	public final void method92() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.b(IILIUVBENCV;)V")
	public final void method93(int arg0, IUVBENCV arg1) {
		arg1.method255();
		int var3 = arg1.method256(1);
		if (var3 != 0) {
			int var4 = arg1.method256(2);
			if (var4 == 0) {
				field264[field263++] = field259;
			} else if (var4 == 1) {
				int var5 = arg1.method256(3);
				field491.method201(var5, false);
				int var6 = arg1.method256(1);
				if (var6 == 1) {
					field264[field263++] = field259;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method256(3);
				field491.method201(var7, true);
				int var8 = arg1.method256(3);
				field491.method201(var8, true);
				int var9 = arg1.method256(1);
				if (var9 == 1) {
					field264[field263++] = field259;
				}
			} else if (var4 == 3) {
				field182 = arg1.method256(2);
				int var10 = arg1.method256(7);
				int var11 = arg1.method256(7);
				int var12 = arg1.method256(1);
				int var13 = arg1.method256(1);
				if (var13 == 1) {
					field264[field263++] = field259;
				}

				field491.method202(var11, var10, var12 == 1);
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method94() {
		if (!field465 && !field368 && !field178) {
			field292++;

			if (field286) {
				method127();
			} else {
				method63();
			}

			method59();
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field302.method463(arg4, arg3);
		field303.method463(arg1 + arg4 - 16, arg3);
		TIJYBGAE.method492(16, arg4 + 16, field101, arg1 - 32, arg3);
		int var6 = (arg1 - 32) * arg1 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg1 - var6 - 32) * arg0 / (arg2 - arg1);
		TIJYBGAE.method492(16, arg4 + var7 + 16, field234, var6, arg3);
		TIJYBGAE.method497(arg4 + var7 + 16, var6, arg3, field369);
		TIJYBGAE.method497(arg4 + var7 + 16, var6, arg3 + 1, field369);
		TIJYBGAE.method495(arg4 + var7 + 16, field369, arg3, 16);
		TIJYBGAE.method495(arg4 + var7 + 17, field369, arg3, 16);
		TIJYBGAE.method497(arg4 + var7 + 16, var6, arg3 + 15, field110);
		TIJYBGAE.method497(arg4 + var7 + 17, var6 - 1, arg3 + 14, field110);
		TIJYBGAE.method495(arg4 + var7 + var6 + 15, field110, arg3, 16);
		TIJYBGAE.method495(arg4 + var7 + var6 + 14, field110, arg3 + 1, 15);
	}

	@ObfuscatedName("client.o(I)V")
	public final void method96() {
		if (field388 >= 2 || field252 != 0 || field82 != 0) {
			String var1;
			if (field252 == 1 && field388 < 2) {
				var1 = "Use " + field256 + " with...";
			} else if (field82 == 1 && field388 < 2) {
				var1 = field85 + "...";
			} else {
				var1 = field477[field388 - 1];
			}

			if (field388 > 2) {
				var1 = var1 + "@whi@ / " + (field388 - 2) + " more options";
			}

			field434.method511(field292 / 1000, 4, true, var1, 0xFFFFFF, 15);
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void method97(int arg0, int arg1) {
		ZEEWTYXI var3 = field160[field182][arg0][arg1];
		if (var3 == null) {
			field233.method408(field182, arg0, arg1);
		} else {
			int var4 = -99999999;
			GXJXRNJQ var5 = null;
			for (GXJXRNJQ var6 = (GXJXRNJQ) var3.method580(); var6 != null; var6 = (GXJXRNJQ) var3.method582()) {
				IXFCVZPT var7 = IXFCVZPT.method285(var6.field700);
				int var8 = var7.field755;
				if (var7.field752) {
					var8 = (var6.field701 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method578(var5);
			GXJXRNJQ var9 = null;
			GXJXRNJQ var10 = null;
			for (GXJXRNJQ var11 = (GXJXRNJQ) var3.method580(); var11 != null; var11 = (GXJXRNJQ) var3.method582()) {
				if (var5.field700 != var11.field700 && var9 == null) {
					var9 = var11;
				}

				if (var5.field700 != var11.field700 && var9.field700 != var11.field700 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field233.method394(method146(arg1 * 128 + 64, field182, arg0 * 128 + 64), var10, var9, arg1, var5, field182, var12, arg0);
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method98(int arg0) {
		int[] var2 = field272.field693;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field188[arg0][var7][var5] & 0x18) == 0) {
					field233.method422(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field188[arg0 + 1][var7][var5] & 0x8) != 0) {
					field233.method422(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field272.method215();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field188[arg0][var11][var10] & 0x18) == 0) {
					method53(var10, arg0, var11, var8, var9);
				}

				if (arg0 < 3 && (field188[arg0 + 1][var11][var10] & 0x8) != 0) {
					method53(var10, arg0 + 1, var11, var8, var9);
				}
			}
		}

		if (field90 != null) {
			field90.method205();
			ZGIYLEBF.field1495 = field223;
		}

		field226 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field233.method416(field182, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = MCFQOEAW.method341(var14).field919;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field69[field182].field5;
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

						field111[field226] = field490[var15];
						field227[field226] = var16;
						field228[field226] = var17;
						field226++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method99() {
		if (field487 && field158 == 2 && SNNOFNNG.field1305 != field182) {
			method104("Loading - please wait.", null);
			field158 = 1;
			field245 = System.currentTimeMillis();
		}

		if (field158 == 1) {
			int var1 = method100();
			if (var1 != 0 && System.currentTimeMillis() - field245 > 360000L) {
				signlink.reporterror(field386 + " glcfb " + field425 + "," + var1 + "," + field487 + "," + field196[0] + "," + field177.method29() + "," + field182 + "," + field422 + "," + field423);
				field245 = System.currentTimeMillis();
			}
		}

		if (field158 == 2 && field182 != field129) {
			field129 = field182;
			method98(field182);
		}
	}

	@ObfuscatedName("client.f(B)I")
	public final int method100() {
		for (int var1 = 0; var1 < field68.length; var1++) {
			if (field68[var1] == null && field402[var1] != -1) {
				return -1;
			}

			if (field360[var1] == null && field403[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field68.length; var3++) {
			byte[] var4 = field360[var3];
			if (var4 != null) {
				int var5 = (field401[var3] >> 8) * 64 - field169;
				int var6 = (field401[var3] & 0xFF) * 64 - field170;
				if (field225) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= SNNOFNNG.method484(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (field288) {
			return -4;
		} else {
			field158 = 2;
			SNNOFNNG.field1305 = field182;
			method110();
			field64.method234(66);
			return 0;
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method101() {
		for (HMUVVYST var1 = (HMUVVYST) field371.method580(); var1 != null; var1 = (HMUVVYST) field371.method582()) {
			if (field182 != var1.field724 || field292 > var1.field721) {
				var1.method602();
			} else if (field292 >= var1.field720) {
				if (var1.field713 > 0) {
					KPZIZBER var2 = field213[var1.field713 - 1];
					if (var2 != null && var2.field548 >= 0 && var2.field548 < 13312 && var2.field549 >= 0 && var2.field549 < 13312) {
						var1.method228(var2.field548, method146(var2.field549, var1.field724, var2.field548) - var1.field705, field292, var2.field549);
					}
				}

				if (var1.field713 < 0) {
					int var3 = -var1.field713 - 1;
					VJDNWPCM var4;
					if (field299 == var3) {
						var4 = field491;
					} else {
						var4 = field260[var3];
					}

					if (var4 != null && var4.field548 >= 0 && var4.field548 < 13312 && var4.field549 >= 0 && var4.field549 < 13312) {
						var1.method228(var4.field548, method146(var4.field549, var1.field724, var4.field548) - var1.field705, field292, var4.field549);
					}
				}

				var1.method229(field382);
				field233.method398(60, (int) var1.field707, field182, -1, (int) var1.field708, false, var1, (int) var1.field709, var1.field722);
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method102() {
		field385 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field117) {
				field421++;
				method164();
				method164();
				method49();
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

		field385 = false;
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method103() {
		try {
			if (field139 != null) {
				field139.method194();
			}
		} catch (Exception var2) {
		}

		field139 = null;
		field286 = false;
		field502 = 0;
		field386 = "";
		field387 = "";
		method108();
		field233.method387();

		for (int var1 = 0; var1 < 4; var1++) {
			field69[var1].method1();
		}

		System.gc();
		method92();
		field150 = -1;
		field459 = -1;
		field163 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;)V")
	public final void method104(String arg0, String arg1) {
		if (field90 != null) {
			field90.method205();
			ZGIYLEBF.field1495 = field223;
			int var3 = 151;
			if (arg1 != null) {
				var3 -= 7;
			}

			field433.method502(0, 257, arg0, var3);
			field433.method502(0xFFFFFF, 256, arg0, var3 - 1);
			var3 += 15;
			if (arg1 != null) {
				field433.method502(0, 257, arg1, var3);
				field433.method502(0xFFFFFF, 256, arg1, var3 - 1);
			}

			field90.method206(4, field1041, 4);
		} else if (field1042 != null) {
			field1042.method205();
			ZGIYLEBF.field1495 = field224;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			TIJYBGAE.method492(var5, var4 - var6 / 2 - 5, 0, var6, 383 - var5 / 2);
			TIJYBGAE.method493(0xFFFFFF, var5, var6, var4 - var6 / 2 - 5, 383 - var5 / 2);

			if (arg1 != null) {
				var4 -= 7;
			}

			field433.method502(0, 383, arg0, var4);
			field433.method502(0xFFFFFF, 382, arg0, var4 - 1);
			var4 += 15;
			if (arg1 != null) {
				field433.method502(0, 383, arg1, var4);
				field433.method502(0xFFFFFF, 382, arg1, var4 - 1);
			}

			field1042.method206(0, field1041, 0);
		}
	}

	@ObfuscatedName("client.d(II)Z")
	public final boolean method105(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field327[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 294) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method106() {
		field297 = new SFVBUBEZ(field306, "titlebox", 0);
		field298 = new SFVBUBEZ(field306, "titlebutton", 0);
		field274 = new SFVBUBEZ[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field274[var1] = new SFVBUBEZ(field306, "runes", var1);
		}

		field143 = new GPLGZASP(128, 265);
		field144 = new GPLGZASP(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field143.field693[var2] = field354.field602[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field144.field693[var3] = field355.field602[var3];
		}

		field267 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field267[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field267[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field267[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field267[var7 + 192] = 0xFFFFFF;
		}

		field268 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field268[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field268[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field268[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field268[var11 + 192] = 0xFFFFFF;
		}

		field269 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field269[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field269[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field269[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field269[var15 + 192] = 0xFFFFFF;
		}

		field266 = new int[256];
		field308 = new int[32768];
		field309 = new int[32768];
		method54(null);
		field218 = new int[32768];
		field219 = new int[32768];
		method125("Connecting to fileserver", 10);

		if (!field117) {
			field346 = true;
			field117 = true;
			method90(this, 2);
		}
	}

	@ObfuscatedName("client.b(ILIUVBENCV;I)V")
	public final void method107(int arg0, IUVBENCV arg1) {
		while (arg1.field734 + 10 < arg0 * 8) {
			int var3 = arg1.method256(11);
			if (var3 == 2047) {
				break;
			}

			if (field260[var3] == null) {
				field260[var3] = new VJDNWPCM();
				if (field265[var3] != null) {
					field260[var3].method524(field265[var3]);
				}
			}

			field262[field261++] = var3;
			VJDNWPCM var4 = field260[var3];
			var4.field567 = field292;
			int var5 = arg1.method256(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method256(1);
			if (var6 == 1) {
				field264[field263++] = var3;
			}

			int var7 = arg1.method256(1);
			int var8 = arg1.method256(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method202(field491.field537[0] + var5, field491.field538[0] + var8, var7 == 1);
		}

		arg1.method257();
	}

	@ObfuscatedName("client.s(I)V")
	public final void method108() {
		MCFQOEAW.field934.method440();
		MCFQOEAW.field933.method440();
		NIJEYEOX.field1100.method440();
		IXFCVZPT.field778.method440();
		IXFCVZPT.field779.method440();
		VJDNWPCM.field1413.method440();
		EBBSHPSJ.field621.method440();
	}

	@ObfuscatedName("client.t(I)V")
	public final void method109() {
		if (field480 == 0) {
			field477[0] = "Cancel";
			field327[0] = 1957;
			field388 = 1;
			if (field241 == -1) {
				method189();
				field128 = 0;
				field364 = 0;

				if (field1049 > 4 && field1050 > 4 && field1049 < 516 && field1050 < 338) {
					if (field492 == -1) {
						method147();
					} else {
						method141(4, 0, 0, MIIVNBFU.method350(field492), field1050, 4, field1049);
					}
				}

				if (field424 != field128) {
					field424 = field128;
				}

				if (field364 != field118) {
					field118 = field364;
				}

				field128 = 0;
				field364 = 0;

				if (field1049 > 553 && field1050 > 205 && field1049 < 743 && field1050 < 466) {
					if (field183 != -1) {
						method141(553, 1, 0, MIIVNBFU.method350(field183), field1050, 205, field1049);
					} else if (field300[field464] != -1) {
						method141(553, 1, 0, MIIVNBFU.method350(field300[field464]), field1050, 205, field1049);
					}
				}

				if (field450 != field128) {
					field323 = true;
					field450 = field128;
				}

				if (field364 != field114) {
					field323 = true;
					field114 = field364;
				}

				field128 = 0;
				field364 = 0;

				if (field1049 > 17 && field1050 > 357 && field1049 < 496 && field1050 < 453) {
					if (field275 != -1) {
						method141(17, 2, 0, MIIVNBFU.method350(field275), field1050, 357, field1049);
					} else if (field379 != -1) {
						method141(17, 3, 0, MIIVNBFU.method350(field379), field1050, 357, field1049);
					} else if (field1050 < 434 && field1049 < 426 && field191 == 0) {
						method121(field1049 - 17, field1050 - 357);
					}
				}

				if ((field275 != -1 || field379 != -1) && field476 != field128) {
					field67 = true;
					field476 = field128;
				}

				if ((field275 != -1 || field379 != -1) && field364 != field130) {
					field67 = true;
					field130 = field364;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field388 - 1; var2++) {
						if (field327[var2] < 1000 && field327[var2 + 1] > 1000) {
							String var3 = field477[var2];
							field477[var2] = field477[var2 + 1];
							field477[var2 + 1] = var3;
							int var4 = field327[var2];
							field327[var2] = field327[var2 + 1];
							field327[var2 + 1] = var4;
							int var5 = field325[var2];
							field325[var2] = field325[var2 + 1];
							field325[var2 + 1] = var5;
							int var6 = field326[var2];
							field326[var2] = field326[var2 + 1];
							field326[var2 + 1] = var6;
							int var7 = field328[var2];
							field328[var2] = field328[var2 + 1];
							field328[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field128 = 0;
				field364 = 0;
				method141(0, 0, 0, MIIVNBFU.method350(field241), field1050, 0, field1049);

				if (field424 != field128) {
					field424 = field128;
				}

				if (field364 != field118) {
					field118 = field364;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 376);

			if (arg0.length == 5) {
				field484 = Integer.parseInt(arg0[0]);
				field485 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method139();
				} else if (arg0[2].equals("highmem")) {
					method144();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field486 = false;
				} else if (arg0[3].equals("members")) {
					field486 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method353(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method110() {
		try {
			field129 = -1;
			field367.method584();
			field371.method584();
			ZGIYLEBF.method588();
			method108();
			field233.method387();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field69[var1].method1();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field188[var2][var3][var4] = 0;
					}
				}
			}

			SNNOFNNG var5 = new SNNOFNNG(field366, field188, 104, 104);
			int var6 = field68.length;
			field64.method234(32);

			if (!field225) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field401[var7] >> 8) * 64 - field169;
					int var9 = (field401[var7] & 0xFF) * 64 - field170;
					byte[] var10 = field68[var7];
					if (var10 != null) {
						var5.method474(var10, var9, field69, (field423 - 6) * 8, (field422 - 6) * 8, var8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field401[var11] >> 8) * 64 - field169;
					int var13 = (field401[var11] & 0xFF) * 64 - field170;
					byte[] var14 = field68[var11];
					if (var14 == null && field423 < 800) {
						var5.method468(64, var13, 64, var12);
					}
				}

				field345++;
				if (field345 > 107) {
					field345 = 0;
					field64.method234(231);
					field64.method238(0xD55372);
				}

				field64.method234(32);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field360[var15];
					if (var16 != null) {
						int var17 = (field401[var15] >> 8) * 64 - field169;
						int var18 = (field401[var15] & 0xFF) * 64 - field170;
						var5.method476(var18, field69, field233, var16, var17);
					}
				}
			}

			if (field225) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field466[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field401.length; var29++) {
									if (field401[var29] == var28 && field68[var29] != null) {
										var5.method467(field69, var21 * 8, (var26 & 0x7) * 8, var25, var19, var24, var20 * 8, field68[var29], (var27 & 0x7) * 8);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method478(var20 * 8, var21 * 8, var19);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field466[0][var30][var31];
						if (var32 == -1) {
							var5.method468(8, var31 * 8, 8, var30 * 8);
						}
					}
				}

				field64.method234(32);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field466[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field401.length; var42++) {
									if (field401[var42] == var41 && field360[var42] != null) {
										var5.method473(var34 * 8, field360[var42], var35 * 8, (var39 & 0x7) * 8, var33, field233, (var40 & 0x7) * 8, var37, field69, var38);
										break;
									}
								}
							}
						}
					}
				}
			}

			field64.method234(32);
			var5.method486(field69, field233);

			if (field90 != null) {
				field90.method205();
				ZGIYLEBF.field1495 = field223;
			}

			field64.method234(32);
			int var43 = SNNOFNNG.field1294;
			if (var43 > field182) {
				var43 = field182;
			}

			if (var43 < field182 - 1) {
				int var44 = field182 - 1;
			}

			if (field487) {
				field233.method388(SNNOFNNG.field1294);
			} else {
				field233.method388(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method97(var45, var46);
				}
			}

			method83();
		} catch (Exception var59) {
		}

		MCFQOEAW.field934.method440();

		if (field1044 != null) {
			field64.method234(127);
			field64.method239(1057001181);
		}

		if (field487 && signlink.cache_dat != null) {
			int var48 = field177.method27(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field177.method35(var49);
				if ((var50 & 0x79) == 0) {
					JJMVUSJJ.method299(var49);
				}
			}
		}

		System.gc();
		ZGIYLEBF.method589(20);
		field177.method39();
		int var51 = (field422 - 6) / 8 - 1;
		int var52 = (field422 + 6) / 8 + 1;
		int var53 = (field423 - 6) / 8 - 1;
		int var54 = (field423 + 6) / 8 + 1;
		if (field473) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field177.method28(0, var55, var56);
					if (var57 != -1) {
						field177.method26(var57, 3);
					}

					int var58 = field177.method28(1, var55, var56);
					if (var58 != -1) {
						field177.method26(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method111(int arg0) {
		MIIVNBFU var2 = MIIVNBFU.method350(arg0);
		for (int var3 = 0; var3 < var2.field993.length && var2.field993[var3] != -1; var3++) {
			MIIVNBFU var4 = MIIVNBFU.method350(var2.field993[var3]);
			if (var4.field1014 == 1) {
				method111(var4.field963);
			}

			var4.field967 = 0;
			var4.field994 = 0;
		}
	}

	@ObfuscatedName("client.c(ILIUVBENCV;I)V")
	public final void method112(int arg0, IUVBENCV arg1) {
		for (int var3 = 0; var3 < field263; var3++) {
			int var4 = field264[var3];
			KPZIZBER var5 = field213[var4];
			int var6 = arg1.method245();
			if ((var6 & 0x8) != 0) {
				int var7 = arg1.method245();
				int var8 = arg1.method264();
				var5.method204(field292, var8, var7);
				var5.field551 = field292 + 300;
				var5.field552 = arg1.method264();
				var5.field553 = arg1.method245();
			}

			if ((var6 & 0x10) != 0) {
				int var9 = arg1.method271();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				int var10 = arg1.method262();
				if (var5.field543 == var9 && var9 != -1) {
					int var11 = XTKQUJNF.field1432[var9].field1446;
					if (var11 == 1) {
						var5.field544 = 0;
						var5.field545 = 0;
						var5.field546 = var10;
						var5.field547 = 0;
					}

					if (var11 == 2) {
						var5.field547 = 0;
					}
				} else if (var9 == -1 || var5.field543 == -1 || XTKQUJNF.field1432[var9].field1440 >= XTKQUJNF.field1432[var5.field543].field1440) {
					var5.field543 = var9;
					var5.field544 = 0;
					var5.field545 = 0;
					var5.field546 = var10;
					var5.field547 = 0;
					var5.field540 = var5.field523;
				}
			}

			if ((var6 & 0x40) != 0) {
				var5.field529 = arg1.method271();
				int var12 = arg1.method278();
				var5.field533 = var12 >> 16;
				var5.field532 = (var12 & 0xFFFF) + field292;
				var5.field530 = 0;
				var5.field531 = 0;

				if (var5.field532 > field292) {
					var5.field530 = -1;
				}

				if (var5.field529 == 0xFFFF) {
					var5.field529 = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field521 = arg1.method247();
				var5.field522 = arg1.method247();
			}

			if ((var6 & 0x1) != 0) {
				var5.field534 = arg1.method252();
				var5.field559 = 100;
			}

			if ((var6 & 0x80) != 0) {
				var5.field906 = NIJEYEOX.method363(arg1.method271());
				var5.field561 = var5.field906.field1075;
				var5.field539 = var5.field906.field1109;
				var5.field524 = var5.field906.field1085;
				var5.field525 = var5.field906.field1078;
				var5.field526 = var5.field906.field1090;
				var5.field527 = var5.field906.field1087;
				var5.field535 = var5.field906.field1084;
			}

			if ((var6 & 0x4) != 0) {
				var5.field554 = arg1.method273();
				if (var5.field554 == 0xFFFF) {
					var5.field554 = -1;
				}
			}

			if ((var6 & 0x2) != 0) {
				int var13 = arg1.method245();
				int var14 = arg1.method245();
				var5.method204(field292, var14, var13);
				var5.field551 = field292 + 300;
				var5.field552 = arg1.method264();
				var5.field553 = arg1.method245();
			}
		}
	}

	@ObfuscatedName("client.a(IZII)Z")
	public final boolean method113(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field233.method417(field182, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			MCFQOEAW var8 = MCFQOEAW.method341(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field914;
				var10 = var8.field947;
			} else {
				var9 = var8.field947;
				var10 = var8.field914;
			}

			int var11 = var8.field932;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method60(arg2, 2, true, 0, field491.field537[0], var10, 0, var11, arg1, field491.field538[0], var9);
		} else {
			method60(arg2, 2, true, var6 + 1, field491.field537[0], 0, var7, 0, arg1, field491.field538[0], 0);
		}

		field373 = field1056;
		field374 = field1057;
		field376 = 2;
		field375 = 0;
		return true;
	}

	@ObfuscatedName("client.h(B)I")
	public final int method114() {
		int var1 = 3;
		if (field107 < 310) {
			int var2 = field104 >> 7;
			int var3 = field106 >> 7;
			int var4 = field491.field548 >> 7;
			int var5 = field491.field549 >> 7;

			if ((field188[field182][var2][var3] & 0x4) != 0) {
				var1 = field182;
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

					if ((field188[field182][var2][var3] & 0x4) != 0) {
						var1 = field182;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field188[field182][var2][var3] & 0x4) != 0) {
							var1 = field182;
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

					if ((field188[field182][var2][var3] & 0x4) != 0) {
						var1 = field182;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field188[field182][var2][var3] & 0x4) != 0) {
							var1 = field182;
						}
					}
				}
			}
		}

		if ((field188[field182][field491.field548 >> 7][field491.field549 >> 7] & 0x4) != 0) {
			var1 = field182;
		}

		return var1;
	}

	@ObfuscatedName("client.i(B)I")
	public final int method115() {
		int var1 = method146(field106, field182, field104);
		if (var1 - field105 < 800 && (field188[field182][field104 >> 7][field106 >> 7] & 0x4) != 0) {
			return field182;
		}

		return 3;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method116() {
		field102 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field61[var1] = -1;
			for (int var2 = 0; var2 < WINORGIB.field1417; var2++) {
				if (!WINORGIB.field1418[var2].field1424 && WINORGIB.field1418[var2].field1419 == var1 + (field310 ? 0 : 7)) {
					field61[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method117() {
		method126();

		if (field376 == 1) {
			field92[field375 / 100].method220(field374 - 8 - 4, field373 - 8 - 4);
		}

		if (field376 == 2) {
			field92[field375 / 100 + 4].method220(field374 - 8 - 4, field373 - 8 - 4);
			field75++;
			if (field75 > 1352) {
				field75 = 0;
				field64.method234(145);
				field64.method235(0);
				int var1 = field64.field733;
				field64.method236((int) (Math.random() * 65536.0D));
				field64.method236(19362);

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(38938);
				}

				field64.method236((int) (Math.random() * 65536.0D));
				field64.method236((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(3521);
				}

				field64.method235((int) (Math.random() * 256.0D));
				field64.method235(120);
				field64.method236(14321);
				field64.method235((int) (Math.random() * 256.0D));
				field64.method244(field64.field733 - var1);
			}
		}

		if (field140 != -1) {
			method87(field140, field382);
			method133(0, MIIVNBFU.method350(field140), 0, 0);
		}

		if (field492 != -1) {
			method87(field492, field382);
			method133(0, MIIVNBFU.method350(field492), 0, 0);
		}

		method122();

		if (!field192) {
			method109();
			method96();
		} else if (field123 == 0) {
			method71();
		}

		if (field334 == 1) {
			field311.method220(296, 472);
		}

		if (field112) {
			short var2 = 507;
			int var3 = 20;
			int var4 = 0xFFFF00;
			if (field1037 < 30 && field487) {
				var4 = 0xFF0000;
			}

			if (field1037 < 20 && !field487) {
				var4 = 0xFF0000;
			}

			field433.method501(var4, "Fps:" + field1037, var2, var3);
			var3 += 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 0xFFFF00;

			if (var6 > 0x2000000 && field487) {
				int var8 = 0xFF0000;
			}

			if (var6 > 0x4000000 && !field487) {
				int var9 = 0xFF0000;
			}

			field433.method501(0xFFFF00, "Mem:" + var6 + "k", var2, var3);
			var3 += 15;
		}

		if (field95 != 0) {
			int var10 = field95 / 50;
			int var11 = var10 / 60;
			var10 %= 60;
			if (var10 < 10) {
				field433.method506(0xFFFF00, "System update in: " + var11 + ":0" + var10, 4, 329);
			} else {
				field433.method506(0xFFFF00, "System update in: " + var11 + ":" + var10, 4, 329);
			}

			field335++;
			if (field335 > 1517) {
				field335 = 0;
				field64.method234(200);
				field64.method235(0);
				int var12 = field64.field733;

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method235(174);
				}

				field64.method235((int) (Math.random() * 256.0D));
				field64.method235(151);
				field64.method236(48341);
				field64.method235((int) (Math.random() * 256.0D));
				field64.method235((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(57937);
				}

				field64.method236((int) (Math.random() * 65536.0D));
				field64.method235(188);
				field64.method235(175);
				field64.method244(field64.field733 - var12);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZILDBHOKPMQ;)V")
	public final void method118(int arg0, DBHOKPMQ arg1) {
		method119(arg1.field548, arg1.field549, arg0);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method119(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = method146(arg1, field182, arg0) - arg2;
			arg0 -= field104;
			var4 -= field105;
			arg1 -= field106;
			int var5 = JJMVUSJJ.field865[field107];
			int var6 = JJMVUSJJ.field866[field107];
			int var7 = JJMVUSJJ.field865[field108];
			int var8 = JJMVUSJJ.field866[field108];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				field248 = (var9 << 9) / arg1 + ZGIYLEBF.field1489;
				field249 = (var11 << 9) / arg1 + ZGIYLEBF.field1490;
			} else {
				field248 = -1;
				field249 = -1;
			}
		} else {
			field248 = -1;
			field249 = -1;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IZIILjava/lang/String;)LAWEEREDT;")
	public final AWEEREDT method120(String arg0, int arg1, int arg2, int arg3, String arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field196[0] != null) {
				var6 = field196[0].method15(arg3);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field431.reset();
			field431.update(var6);
			int var8 = (int) field431.getValue();
			if (arg1 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new AWEEREDT(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method125("Requesting " + arg4, arg2);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method166(arg0 + arg1);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				IUVBENCV var16 = new IUVBENCV(var15);
				var16.field733 = 3;
				int var17 = var16.method249() + 6;
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
						method125("Loading " + arg4 + " - " + var22 + "%", arg2);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field196[0] != null) {
						field196[0].method16(var6, arg3, var6.length);
					}
				} catch (Exception var28) {
					field196[0] = null;
				}

				if (var6 != null) {
					field431.reset();
					field431.update(var6);
					int var23 = (int) field431.getValue();
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
						method125("Game updated - please reload page", arg2);
						var25 = 10;
					} else {
						method125(var11 + " - Retrying in " + var25, arg2);
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

				field377 = !field377;
			}
		}

		return new AWEEREDT(var6);
	}

	@ObfuscatedName("client.c(III)V")
	public final void method121(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field339[var4] != null) {
				int var5 = field337[var4];
				int var6 = field157 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field338[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field301 == 0 || field301 == 1 && method180(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field491.field1402)) {
						if (field197 >= 1) {
							field477[field388] = "Report abuse @whi@" + var7;
							field327[field388] = 702;
							field388++;
						}

						field477[field388] = "Add ignore @whi@" + var7;
						field327[field388] = 38;
						field388++;
						field477[field388] = "Add friend @whi@" + var7;
						field327[field388] = 294;
						field388++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field72 == 0 && (var5 == 7 || field365 == 0 || field365 == 1 && method180(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field197 >= 1) {
							field477[field388] = "Report abuse @whi@" + var7;
							field327[field388] = 702;
							field388++;
						}

						field477[field388] = "Add ignore @whi@" + var7;
						field327[field388] = 38;
						field388++;
						field477[field388] = "Add friend @whi@" + var7;
						field327[field388] = 294;
						field388++;
					}

					var3++;
				}

				if (var5 == 4 && (field279 == 0 || field279 == 1 && method180(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field477[field388] = "Accept trade @whi@" + var7;
						field327[field388] = 899;
						field388++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field72 == 0 && field365 < 2) {
					var3++;
				}

				if (var5 == 8 && (field279 == 0 || field279 == 1 && method180(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field477[field388] = "Accept challenge @whi@" + var7;
						field327[field388] = 108;
						field388++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method122() {
		field442 = 0;
		int var1 = (field491.field548 >> 7) + field169;
		int var2 = (field491.field549 >> 7) + field170;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field442 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field442 = 1;
		}

		if (field442 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field442 = 0;
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public final void method123(int arg0) {
		if (arg0 >= 0) {
			int var2 = field325[arg0];
			int var3 = field326[arg0];
			int var4 = field327[arg0];
			int var5 = field328[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field191 != 0 && var4 != 1957) {
				field191 = 0;
				field67 = true;
			}

			if (var4 == 618) {
				VJDNWPCM var6 = field260[var5];
				if (var6 != null) {
					method60(var6.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var6.field537[0], field491.field538[0], 1);
					field373 = field1056;
					field374 = field1057;
					field376 = 2;
					field375 = 0;
					field64.method234(136);
					field64.method268(var5);
					field64.method236(field83);
				}
			}

			if (var4 == 584 && method113(var5, var2, var3)) {
				field64.method234(86);
				field64.method270(var5 >> 14 & 0x7FFF);
				field64.method236(field170 + var3);
				field64.method268(field169 + var2);
				field64.method269(field83);
			}

			if (var4 == 450) {
				boolean var7 = method60(var3, 2, false, 0, field491.field537[0], 0, 0, 0, var2, field491.field538[0], 0);
				if (!var7) {
					method60(var3, 2, false, 0, field491.field537[0], 1, 0, 0, var2, field491.field538[0], 1);
				}

				field373 = field1056;
				field374 = field1057;
				field376 = 2;
				field375 = 0;
				field64.method234(201);
				field64.method269(field169 + var2);
				field64.method269(field255);
				field64.method269(field253);
				field64.method236(var5);
				field64.method270(field254);
				field64.method269(field170 + var3);
			}

			if (var4 == 899 || var4 == 108) {
				String var9 = field477[arg0];
				int var10 = var9.indexOf("@whi@");
				if (var10 != -1) {
					var9 = var9.substring(var10 + 5).trim();
					String var11 = RSIGORUG.method456(RSIGORUG.method453(RSIGORUG.method452(var9)));
					boolean var12 = false;
					for (int var13 = 0; var13 < field261; var13++) {
						VJDNWPCM var14 = field260[field262[var13]];
						if (var14 != null && var14.field1402 != null && var14.field1402.equalsIgnoreCase(var11)) {
							method60(var14.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var14.field537[0], field491.field538[0], 1);

							if (var4 == 899) {
								field64.method234(132);
								field64.method269(field262[var13]);
							}

							if (var4 == 108) {
								field155 += var5;
								if (field155 >= 71) {
									field64.method234(149);
									field64.method236(42042);
									field155 = 0;
								}

								field64.method234(206);
								field64.method236(field262[var13]);
							}

							var12 = true;
							break;
						}
					}

					if (!var12) {
						method160(0, "Unable to find " + var11, "");
					}
				}
			}

			if (var4 == 321) {
				boolean var15 = method60(var3, 2, false, 0, field491.field537[0], 0, 0, 0, var2, field491.field538[0], 0);
				if (!var15) {
					method60(var3, 2, false, 0, field491.field537[0], 1, 0, 0, var2, field491.field538[0], 1);
				}

				field373 = field1056;
				field374 = field1057;
				field376 = 2;
				field375 = 0;
				field64.method234(154);
				field64.method236(field170 + var3);
				field64.method269(var5);
				field64.method269(field169 + var2);
			}

			if (var4 == 898) {
				field64.method234(94);
				field64.method270(var5);
				field64.method270(var2);
				field64.method268(var3);
				field414 = 0;
				field415 = var3;
				field416 = var2;
				field417 = 2;
				if (MIIVNBFU.method350(var3).field991 == field492) {
					field417 = 1;
				}

				if (MIIVNBFU.method350(var3).field991 == field275) {
					field417 = 3;
				}
			}

			if (var4 == 665) {
				VJDNWPCM var17 = field260[var5];
				if (var17 != null) {
					method60(var17.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var17.field537[0], field491.field538[0], 1);
					field373 = field1056;
					field374 = field1057;
					field376 = 2;
					field375 = 0;
					field155 += var5;
					if (field155 >= 71) {
						field64.method234(149);
						field64.method236(42042);
						field155 = 0;
					}

					field64.method234(206);
					field64.method236(var5);
				}
			}

			if (var4 == 386) {
				method113(var5, var2, var3);
				field64.method234(229);
				field64.method269(field169 + var2);
				field64.method269(field170 + var3);
				field64.method269(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 845) {
				KPZIZBER var18 = field213[var5];
				if (var18 != null) {
					method60(var18.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var18.field537[0], field491.field538[0], 1);
					field373 = field1056;
					field374 = field1057;
					field376 = 2;
					field375 = 0;
					field64.method234(155);
					field64.method269(var5);
				}
			}

			if (var4 == 42) {
				VJDNWPCM var19 = field260[var5];
				if (var19 != null) {
					method60(var19.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var19.field537[0], field491.field538[0], 1);
					field373 = field1056;
					field374 = field1057;
					field376 = 2;
					field375 = 0;
					field64.method234(198);
					field64.method268(var5);
				}
			}

			if (var4 == 294 || var4 == 38 || var4 == 140 || var4 == 169) {
				String var20 = field477[arg0];
				int var21 = var20.indexOf("@whi@");
				if (var21 != -1) {
					long var22 = RSIGORUG.method452(var20.substring(var21 + 5).trim());
					if (var4 == 294) {
						method129(var22);
					}

					if (var4 == 38) {
						method51(var22);
					}

					if (var4 == 140) {
						method157(var22);
					}

					if (var4 == 169) {
						method150(var22);
					}
				}
			}

			if (var4 == 871) {
				field64.method234(2);
				field64.method236(var3);
				MIIVNBFU var24 = MIIVNBFU.method350(var3);
				if (var24.field1008 != null && var24.field1008[0][0] == 5) {
					int var25 = var24.field1008[0][1];
					if (field142[var25] != var24.field1026[0]) {
						field142[var25] = var24.field1026[0];
						method52(var25);
						field323 = true;
					}
				}
			}

			if (var4 == 524) {
				boolean var26 = method60(var3, 2, false, 0, field491.field537[0], 0, 0, 0, var2, field491.field538[0], 0);
				if (!var26) {
					method60(var3, 2, false, 0, field491.field537[0], 1, 0, 0, var2, field491.field538[0], 1);
				}

				field373 = field1056;
				field374 = field1057;
				field376 = 2;
				field375 = 0;
				field64.method234(33);
				field64.method236(field169 + var2);
				field64.method269(var5);
				field64.method269(field83);
				field64.method270(field170 + var3);
			}

			if (var4 == 788) {
				String var28 = field477[arg0];
				int var29 = var28.indexOf("@whi@");
				if (var29 != -1) {
					long var30 = RSIGORUG.method452(var28.substring(var29 + 5).trim());
					int var32 = -1;
					for (int var33 = 0; var33 < field498; var33++) {
						if (field194[var33] == var30) {
							var32 = var33;
							break;
						}
					}

					if (var32 != -1 && field381[var32] > 0) {
						field67 = true;
						field191 = 0;
						field136 = true;
						field430 = "";
						field257 = 3;
						field287 = field194[var32];
						field378 = "Enter message to send to " + field190[var32];
					}
				}
			}

			if (var4 == 339) {
				KPZIZBER var34 = field213[var5];
				if (var34 != null) {
					method60(var34.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var34.field537[0], field491.field538[0], 1);
					field373 = field1056;
					field374 = field1057;
					field376 = 2;
					field375 = 0;
					field64.method234(243);
					field64.method268(var5);
				}
			}

			if (var4 == 851) {
				KPZIZBER var35 = field213[var5];
				if (var35 != null) {
					method60(var35.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var35.field537[0], field491.field538[0], 1);
					field373 = field1056;
					field374 = field1057;
					field376 = 2;
					field375 = 0;
					field64.method234(178);
					field64.method270(var5);
				}
			}

			if (var4 == 409) {
				boolean var36 = method60(var3, 2, false, 0, field491.field537[0], 0, 0, 0, var2, field491.field538[0], 0);
				if (!var36) {
					method60(var3, 2, false, 0, field491.field537[0], 1, 0, 0, var2, field491.field538[0], 1);
				}

				field373 = field1056;
				field374 = field1057;
				field376 = 2;
				field375 = 0;
				field64.method234(93);
				field64.method268(field169 + var2);
				field64.method236(field170 + var3);
				field64.method236(var5);
			}

			if (var4 == 967 && !field229) {
				field64.method234(115);
				field64.method236(var3);
				field229 = true;
			}

			if (var4 == 586) {
				field64.method234(211);
				field64.method270(var2);
				field64.method236(var3);
				field64.method270(field254);
				field64.method236(field253);
				field64.method270(field255);
				field64.method268(var5);
				field414 = 0;
				field415 = var3;
				field416 = var2;
				field417 = 2;
				if (MIIVNBFU.method350(var3).field991 == field492) {
					field417 = 1;
				}

				if (MIIVNBFU.method350(var3).field991 == field275) {
					field417 = 3;
				}
			}

			if (var4 == 794) {
				boolean var38 = method60(var3, 2, false, 0, field491.field537[0], 0, 0, 0, var2, field491.field538[0], 0);
				if (!var38) {
					method60(var3, 2, false, 0, field491.field537[0], 1, 0, 0, var2, field491.field538[0], 1);
				}

				field373 = field1056;
				field374 = field1057;
				field376 = 2;
				field375 = 0;
				field64.method234(223);
				field64.method236(var5);
				field64.method236(field169 + var2);
				field64.method268(field170 + var3);
			}

			if (var4 == 36) {
				KPZIZBER var40 = field213[var5];
				if (var40 != null) {
					method60(var40.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var40.field537[0], field491.field538[0], 1);
					field373 = field1056;
					field374 = field1057;
					field376 = 2;
					field375 = 0;

					if ((var5 & 0x3) == 0) {
						field189++;
					}

					if (field189 >= 103) {
						field64.method234(74);
						field64.method238(0x416A03);
						field189 = 0;
					}

					field64.method234(169);
					field64.method268(var5);
				}
			}

			if (var4 == 877) {
				method131();
			}

			if (var4 == 139) {
				field64.method234(180);
				field64.method236(var3);
				field64.method270(var2);
				field64.method236(var5);
				field414 = 0;
				field415 = var3;
				field416 = var2;
				field417 = 2;
				if (MIIVNBFU.method350(var3).field991 == field492) {
					field417 = 1;
				}

				if (MIIVNBFU.method350(var3).field991 == field275) {
					field417 = 3;
				}
			}

			if (var4 == 1433) {
				KPZIZBER var41 = field213[var5];
				if (var41 != null) {
					NIJEYEOX var42 = var41.field906;
					if (var42.field1094 != null) {
						var42 = var42.method362();
					}

					if (var42 != null) {
						String var43;
						if (var42.field1107 == null) {
							var43 = "It's a " + var42.field1079 + ".";
						} else {
							var43 = new String(var42.field1107);
						}

						method160(0, var43, "");
					}
				}
			}

			if (var4 == 1065) {
				IXFCVZPT var44 = IXFCVZPT.method285(var5);
				String var45;
				if (var44.field750 == null) {
					var45 = "It's a " + var44.field783 + ".";
				} else {
					var45 = new String(var44.field750);
				}

				method160(0, var45, "");
			}

			if (var4 == 154) {
				KPZIZBER var46 = field213[var5];
				if (var46 != null) {
					method60(var46.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var46.field537[0], field491.field538[0], 1);
					field373 = field1056;
					field374 = field1057;
					field376 = 2;
					field375 = 0;
					field64.method234(51);
					field64.method236(var5);
					field64.method269(field83);
				}
			}

			if (var4 == 263) {
				field64.method234(101);
				field64.method269(var2);
				field64.method270(var5);
				field64.method268(var3);
				field414 = 0;
				field415 = var3;
				field416 = var2;
				field417 = 2;
				if (MIIVNBFU.method350(var3).field991 == field492) {
					field417 = 1;
				}

				if (MIIVNBFU.method350(var3).field991 == field275) {
					field417 = 3;
				}
			}

			if (var4 == 638) {
				method113(var5, var2, var3);
				field64.method234(49);
				field64.method268(field169 + var2);
				field64.method270(field170 + var3);
				field64.method236(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 26) {
				field252 = 1;
				field253 = var2;
				field254 = var3;
				field255 = var5;
				field256 = String.valueOf(IXFCVZPT.method285(var5).field783);
				field82 = 0;
				field323 = true;
			} else {
				if (var4 == 561) {
					KPZIZBER var47 = field213[var5];
					if (var47 != null) {
						method60(var47.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var47.field537[0], field491.field538[0], 1);
						field373 = field1056;
						field374 = field1057;
						field376 = 2;
						field375 = 0;
						field64.method234(52);
						field64.method269(field254);
						field64.method270(var5);
						field64.method236(field253);
						field64.method236(field255);
					}
				}

				if (var4 == 859) {
					KPZIZBER var48 = field213[var5];
					if (var48 != null) {
						method60(var48.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var48.field537[0], field491.field538[0], 1);
						field373 = field1056;
						field374 = field1057;
						field376 = 2;
						field375 = 0;
						field64.method234(250);
						field64.method268(var5);
					}
				}

				if (var4 == 634) {
					VJDNWPCM var49 = field260[var5];
					if (var49 != null) {
						method60(var49.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var49.field537[0], field491.field538[0], 1);
						field373 = field1056;
						field374 = field1057;
						field376 = 2;
						field375 = 0;
						field64.method234(28);
						field64.method236(var5);
					}
				}

				if (var4 == 663) {
					VJDNWPCM var50 = field260[var5];
					if (var50 != null) {
						method60(var50.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var50.field537[0], field491.field538[0], 1);
						field373 = field1056;
						field374 = field1057;
						field376 = 2;
						field375 = 0;
						field64.method234(132);
						field64.method269(var5);
					}
				}

				if (var4 == 463) {
					method113(var5, var2, var3);
					field64.method234(105);
					field64.method269(field170 + var3);
					field64.method269(field169 + var2);
					field64.method236(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 702) {
					String var51 = field477[arg0];
					int var52 = var51.indexOf("@whi@");
					if (var52 != -1) {
						if (field492 == -1) {
							method131();
							field307 = var51.substring(var52 + 5).trim();
							field418 = false;
							field284 = field492 = MIIVNBFU.field997;
						} else {
							method160(0, "Please close the interface you have open before using 'report abuse'", "");
						}
					}
				}

				if (var4 == 178) {
					field109++;
					if (field109 >= 78) {
						field64.method234(161);
						field64.method239(0);
						field109 = 0;
					}

					method113(var5, var2, var3);
					field64.method234(254);
					field64.method268(var5 >> 14 & 0x7FFF);
					field64.method270(field169 + var2);
					field64.method268(field170 + var3);
				}

				if (var4 == 358) {
					MIIVNBFU var53 = MIIVNBFU.method350(var3);
					field82 = 1;
					field83 = var3;
					field84 = var53.field979;
					field252 = 0;
					field323 = true;
					String var54 = var53.field971;
					if (var54.indexOf(" ") != -1) {
						var54 = var54.substring(0, var54.indexOf(" "));
					}

					String var55 = var53.field971;
					if (var55.indexOf(" ") != -1) {
						var55 = var55.substring(var55.indexOf(" ") + 1);
					}

					field85 = var54 + " " + var53.field1021 + " " + var55;

					if (field84 == 16) {
						field323 = true;
						field464 = 3;
						field100 = true;
					}
				} else {
					if (var4 == 426) {
						field462++;
						if (field462 >= 56) {
							field64.method234(202);
							field64.method238(0x9CBF81);
							field462 = 0;
						}

						field64.method234(177);
						field64.method269(var5);
						field64.method268(var2);
						field64.method270(var3);
						field414 = 0;
						field415 = var3;
						field416 = var2;
						field417 = 2;
						if (MIIVNBFU.method350(var3).field991 == field492) {
							field417 = 1;
						}

						if (MIIVNBFU.method350(var3).field991 == field275) {
							field417 = 3;
						}
					}

					if (var4 == 931) {
						field64.method234(14);
						field64.method268(field83);
						field64.method270(var3);
						field64.method270(var2);
						field64.method269(var5);
						field414 = 0;
						field415 = var3;
						field416 = var2;
						field417 = 2;
						if (MIIVNBFU.method350(var3).field991 == field492) {
							field417 = 1;
						}

						if (MIIVNBFU.method350(var3).field991 == field275) {
							field417 = 3;
						}
					}

					if (var4 == 245) {
						field64.method234(23);
						field64.method269(var3);
						field64.method268(var5);
						field64.method269(var2);
						field414 = 0;
						field415 = var3;
						field416 = var2;
						field417 = 2;
						if (MIIVNBFU.method350(var3).field991 == field492) {
							field417 = 1;
						}

						if (MIIVNBFU.method350(var3).field991 == field275) {
							field417 = 3;
						}
					}

					if (var4 == 819) {
						method70(field379);
						field379 = -1;
						field67 = true;
					}

					if (var4 == 331) {
						field70++;
						if (field70 >= 148) {
							field64.method234(108);
							field64.method236(64453);
							field70 = 0;
						}

						field64.method234(190);
						field64.method269(var2);
						field64.method270(var3);
						field64.method270(var5);
						field414 = 0;
						field415 = var3;
						field416 = var2;
						field417 = 2;
						if (MIIVNBFU.method350(var3).field991 == field492) {
							field417 = 1;
						}

						if (MIIVNBFU.method350(var3).field991 == field275) {
							field417 = 3;
						}
					}

					if (var4 == 66) {
						if (field192) {
							field233.method425(var2 - 4, var3 - 4);
						} else {
							field233.method425(field1056 - 4, field1057 - 4);
						}
					}

					if (var4 == 80) {
						field64.method234(46);
						field64.method270(var5);
						field64.method236(var2);
						field64.method269(var3);
						field414 = 0;
						field415 = var3;
						field416 = var2;
						field417 = 2;
						if (MIIVNBFU.method350(var3).field991 == field492) {
							field417 = 1;
						}

						if (MIIVNBFU.method350(var3).field991 == field275) {
							field417 = 3;
						}
					}

					if (var4 == 124 && method113(var5, var2, var3)) {
						field64.method234(4);
						field64.method270(field253);
						field64.method269(field170 + var3);
						field64.method268(field255);
						field64.method268(var5 >> 14 & 0x7FFF);
						field64.method269(field254);
						field64.method270(field169 + var2);
					}

					if (var4 == 766) {
						VJDNWPCM var56 = field260[var5];
						if (var56 != null) {
							method60(var56.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var56.field537[0], field491.field538[0], 1);
							field373 = field1056;
							field374 = field1057;
							field376 = 2;
							field375 = 0;
							field64.method234(123);
							field64.method270(field254);
							field64.method270(field255);
							field64.method269(field253);
							field64.method269(var5);
						}
					}

					if (var4 == 213) {
						field187 += var3;
						if (field187 >= 146) {
							field64.method234(208);
							field64.method238(0x70F757);
							field187 = 0;
						}

						field64.method234(150);
						field64.method268(var2);
						field64.method270(var3);
						field64.method268(var5);
						field414 = 0;
						field415 = var3;
						field416 = var2;
						field417 = 2;
						if (MIIVNBFU.method350(var3).field991 == field492) {
							field417 = 1;
						}

						if (MIIVNBFU.method350(var3).field991 == field275) {
							field417 = 3;
						}
					}

					if (var4 == 890) {
						field64.method234(87);
						field64.method270(var5);
						field64.method236(var3);
						field64.method268(var2);
						field414 = 0;
						field415 = var3;
						field416 = var2;
						field417 = 2;
						if (MIIVNBFU.method350(var3).field991 == field492) {
							field417 = 1;
						}

						if (MIIVNBFU.method350(var3).field991 == field275) {
							field417 = 3;
						}
					}

					if (var4 == 797) {
						field64.method234(242);
						field64.method236(var3);
						field64.method270(var2);
						field64.method236(var5);
						field414 = 0;
						field415 = var3;
						field416 = var2;
						field417 = 2;
						if (MIIVNBFU.method350(var3).field991 == field492) {
							field417 = 1;
						}

						if (MIIVNBFU.method350(var3).field991 == field275) {
							field417 = 3;
						}
					}

					if (var4 == 1901) {
						method113(var5, var2, var3);
						field64.method234(237);
						field64.method236(field170 + var3);
						field64.method269(var5 >> 14 & 0x7FFF);
						field64.method268(field169 + var2);
					}

					if (var4 == 776) {
						field64.method234(2);
						field64.method236(var3);
						MIIVNBFU var57 = MIIVNBFU.method350(var3);
						if (var57.field1008 != null && var57.field1008[0][0] == 5) {
							int var58 = var57.field1008[0][1];
							field142[var58] = 1 - field142[var58];
							method52(var58);
							field323 = true;
						}
					}

					if (var4 == 315) {
						MIIVNBFU var59 = MIIVNBFU.method350(var3);
						boolean var60 = true;
						if (var59.field1020 > 0) {
							var60 = method182(var59);
						}

						if (var60) {
							field64.method234(2);
							field64.method236(var3);
						}
					}

					if (var4 == 54) {
						boolean var61 = method60(var3, 2, false, 0, field491.field537[0], 0, 0, 0, var2, field491.field538[0], 0);
						if (!var61) {
							method60(var3, 2, false, 0, field491.field537[0], 1, 0, 0, var2, field491.field538[0], 1);
						}

						field373 = field1056;
						field374 = field1057;
						field376 = 2;
						field375 = 0;
						field64.method234(184);
						field64.method268(field169 + var2);
						field64.method270(var5);
						field64.method268(field170 + var3);
					}

					if (var4 == 1881) {
						int var63 = var5 >> 14 & 0x7FFF;
						MCFQOEAW var64 = MCFQOEAW.method341(var63);
						String var65;
						if (var64.field921 == null) {
							var65 = "It's a " + var64.field944 + ".";
						} else {
							var65 = new String(var64.field921);
						}

						method160(0, var65, "");
					}

					if (var4 == 1164) {
						IXFCVZPT var66 = IXFCVZPT.method285(var5);
						MIIVNBFU var67 = MIIVNBFU.method350(var3);
						String var68;
						if (var67 != null && var67.field990[var2] >= 100000) {
							var68 = var67.field990[var2] + " x " + var66.field783;
						} else if (var66.field750 == null) {
							var68 = "It's a " + var66.field783 + ".";
						} else {
							var68 = new String(var66.field750);
						}

						method160(0, var68, "");
					}

					if (var4 == 738) {
						boolean var69 = method60(var3, 2, false, 0, field491.field537[0], 0, 0, 0, var2, field491.field538[0], 0);
						if (!var69) {
							method60(var3, 2, false, 0, field491.field537[0], 1, 0, 0, var2, field491.field538[0], 1);
						}

						field373 = field1056;
						field374 = field1057;
						field376 = 2;
						field375 = 0;
						field454 += var5;
						if (field454 >= 111) {
							field64.method234(173);
							field64.method238(0x9EA71D);
							field454 = 0;
						}

						field64.method234(164);
						field64.method236(var5);
						field64.method269(field170 + var3);
						field64.method268(field169 + var2);
					}

					if (var4 == 429) {
						VJDNWPCM var71 = field260[var5];
						if (var71 != null) {
							method60(var71.field538[0], 2, false, 0, field491.field537[0], 1, 0, 0, var71.field537[0], field491.field538[0], 1);
							field373 = field1056;
							field374 = field1057;
							field376 = 2;
							field375 = 0;
							field64.method234(39);
							field64.method269(var5);
						}
					}

					field252 = 0;
					field82 = 0;
					field323 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method124() {
		field117 = false;
		while (field385) {
			field117 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field297 = null;
		field298 = null;
		field274 = null;
		field266 = null;
		field267 = null;
		field268 = null;
		field269 = null;
		field308 = null;
		field309 = null;
		field218 = null;
		field219 = null;
		field143 = null;
		field144 = null;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IB)V")
	public final void method125(String arg0, int arg1) {
		field294 = arg1;
		field193 = arg0;
		method62();

		if (field306 == null) {
			super.method125(arg0, arg1);
		} else {
			field353.method205();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field434.method502(0xFFFFFF, var3 / 2, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26);
			int var6 = var4 / 2 - var5 - 18;
			TIJYBGAE.method493(0x8C1111, 304, 34, var6, var3 / 2 - 152);
			TIJYBGAE.method493(0, 302, 32, var6 + 1, var3 / 2 - 151);
			TIJYBGAE.method492(arg1 * 3, var6 + 2, 0x8C1111, 30, var3 / 2 - 150);
			TIJYBGAE.method492(300 - arg1 * 3, var6 + 2, 0, 30, arg1 * 3 + var3 / 2 - 150);
			field434.method502(0xFFFFFF, var3 / 2, arg0, var4 / 2 + 5 - var5);
			field353.method206(202, field1041, 171);

			if (field341) {
				field341 = false;

				if (!field117) {
					field354.method206(0, field1041, 0);
					field355.method206(637, field1041, 0);
				}

				field351.method206(128, field1041, 0);
				field352.method206(202, field1041, 371);
				field356.method206(0, field1041, 265);
				field357.method206(562, field1041, 265);
				field358.method206(128, field1041, 171);
				field359.method206(562, field1041, 171);
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method126() {
		if (field72 != 0) {
			UOINBUQD var1 = field433;
			int var2 = 0;
			if (field95 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field339[var3] != null) {
					int var4 = field337[var3];
					String var5 = field338[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field365 == 0 || field365 == 1 && method180(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method506(0, "From", var8, var7);
						var1.method506(0xFFFF, "From", var8, var7 - 1);
						int var11 = var8 + var1.method504("From ");
						if (var6 == 1) {
							field296[0].method463(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field296[1].method463(var7 - 12, var11);
							var11 += 14;
						}

						var1.method506(0, var5 + ": " + field339[var3], var11, var7);
						var1.method506(0xFFFF, var5 + ": " + field339[var3], var11, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field365 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method506(0, field339[var3], 4, var9);
						var1.method506(0xFFFF, field339[var3], 4, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field365 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method506(0, "To " + var5 + ": " + field339[var3], 4, var10);
						var1.method506(0xFFFF, "To " + var5 + ": " + field339[var3], 4, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method127() {
		if (field95 > 1) {
			field95--;
		}

		if (field448 > 0) {
			field448--;
		}

		for (int var1 = 0; var1 < 5 && method132(); var1++) {
		}

		if (field286) {
			synchronized (field461.field907) {
				if (!field154) {
					field461.field910 = 0;
				} else if (field1055 != 0 || field461.field910 >= 40) {
					field64.method234(11);
					field64.method235(0);
					int var3 = field64.field733;
					int var4 = 0;
					for (int var5 = 0; var5 < field461.field910 && var3 - field64.field733 < 240; var5++) {
						var4++;
						int var6 = field461.field909[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field461.field908[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field461.field909[var5] == -1 && field461.field908[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field467 != var7 || field468 != var6) {
							int var9 = var7 - field467;
							field467 = var7;
							int var10 = var6 - field468;
							field468 = var6;

							if (field452 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field64.method236((field452 << 12) + (var9 << 6) + var10);
								field452 = 0;
							} else if (field452 < 8) {
								field64.method238((field452 << 19) + var8 + 0x800000);
								field452 = 0;
							} else {
								field64.method239((field452 << 19) + var8 - 0x40000000);
								field452 = 0;
							}
						} else if (field452 < 2047) {
							field452++;
						}
					}

					field64.method244(field64.field733 - var3);

					if (var4 >= field461.field910) {
						field461.field910 = 0;
					} else {
						field461.field910 -= var4;
						for (int var11 = 0; var11 < field461.field910; var11++) {
							field461.field908[var11] = field461.field908[var4 + var11];
							field461.field909[var11] = field461.field909[var4 + var11];
						}
					}
				}
			}

			if (field1055 != 0) {
				long var12 = (field1058 - field451) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field451 = field1058;
				int var14 = field1057;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field1056;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field1055 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field64.method234(62);
				field64.method239((var17 << 19) + (var18 << 20) + var16);
			}

			if (field471 > 0) {
				field471--;
			}

			if (field1059[1] == 1 || field1059[2] == 1 || field1059[3] == 1 || field1059[4] == 1) {
				field472 = true;
			}

			if (field472 && field471 <= 0) {
				field471 = 20;
				field472 = false;
				field64.method234(179);
				field64.method270(field79);
				field64.method270(field78);
			}

			if (field1046 && !field384) {
				field384 = true;
				field64.method234(18);
				field64.method235(1);
			}

			if (!field1046 && field384) {
				field384 = false;
				field64.method234(18);
				field64.method235(0);
			}

			method99();
			method55();
			method187();
			field446++;
			if (field446 > 750) {
				method183();
			}

			method172();
			method75();
			method161();
			field382++;

			if (field376 != 0) {
				field375 += 20;
				if (field375 >= 400) {
					field376 = 0;
				}
			}

			if (field417 != 0) {
				field414++;
				if (field414 >= 15) {
					if (field417 == 2) {
						field323 = true;
					}

					if (field417 == 3) {
						field67 = true;
					}

					field417 = 0;
				}
			}

			if (field480 != 0) {
				field362++;

				if (field1049 > field481 + 5 || field1049 < field481 - 5 || field1050 > field482 + 5 || field1050 < field482 - 5) {
					field103 = true;
				}

				if (field1048 == 0) {
					if (field480 == 2) {
						field323 = true;
					}

					if (field480 == 3) {
						field67 = true;
					}

					field480 = 0;

					if (field103 && field362 >= 5) {
						field149 = -1;
						method109();

						if (field478 == field149 && field479 != field148) {
							MIIVNBFU var19 = MIIVNBFU.method350(field478);
							byte var20 = 0;
							if (field115 == 1 && var19.field1020 == 206) {
								var20 = 1;
							}

							if (var19.field989[field148] <= 0) {
								var20 = 0;
							}

							if (var19.field986) {
								int var21 = field479;
								int var22 = field148;
								var19.field989[var22] = var19.field989[var21];
								var19.field990[var22] = var19.field990[var21];
								var19.field989[var21] = -1;
								var19.field990[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field479;
								int var24 = field148;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method349(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method349(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method349(field148, field479);
							}

							field64.method234(220);
							field64.method235(var20);
							field64.method268(field478);
							field64.method269(field148);
							field64.method236(field479);
						}
					} else if ((field174 == 1 || method105(field388 - 1)) && field388 > 2) {
						method57();
					} else if (field388 > 0) {
						method123(field388 - 1);
					}

					field414 = 10;
					field1055 = 0;
				}
			}

			if (POACSVST.field1221 != -1) {
				int var25 = POACSVST.field1221;
				int var26 = POACSVST.field1222;
				boolean var27 = method60(var26, 0, true, 0, field491.field537[0], 0, 0, 0, var25, field491.field538[0], 0);
				POACSVST.field1221 = -1;

				if (var27) {
					field373 = field1056;
					field374 = field1057;
					field376 = 1;
					field375 = 0;
				}
			}

			if (field1055 == 1 && field475 != null) {
				field475 = null;
				field67 = true;
				field1055 = 0;
			}

			method173();

			if (field241 == -1) {
				method184();
				method155();
				method190();
			}

			if (field1048 == 1 || field1055 == 1) {
				field455++;
			}

			if (field130 == 0 && field114 == 0 && field118 == 0) {
				if (field210 > 0) {
					field210--;
				}
			} else if (field210 < 100) {
				field210++;
				if (field210 == 100) {
					if (field130 != 0) {
						field67 = true;
					}

					if (field114 != 0) {
						field323 = true;
					}
				}
			}

			if (field158 == 2) {
				method170();
			}

			if (field158 == 2 && field458) {
				method86();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field285[var28]++;
			}

			method65();
			field1047++;
			if (field1047 > 4500) {
				field448 = 250;
				field1047 -= 500;
				field64.method234(217);
			}

			field93++;
			if (field93 > 500) {
				field93 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field456 += field457;
				}

				if ((var29 & 0x2) == 2) {
					field179 += field180;
				}

				if ((var29 & 0x4) == 4) {
					field65 += field66;
				}
			}

			if (field456 < -50) {
				field457 = 2;
			}

			if (field456 > 50) {
				field457 = -2;
			}

			if (field179 < -55) {
				field180 = 2;
			}

			if (field179 > 55) {
				field180 = -2;
			}

			if (field65 < -40) {
				field66 = 1;
			}

			if (field65 > 40) {
				field66 = -1;
			}

			field340++;
			if (field340 > 500) {
				field340 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field496 += field497;
				}

				if ((var30 & 0x2) == 2) {
					field184 += field185;
				}
			}

			if (field496 < -60) {
				field497 = 2;
			}

			if (field496 > 60) {
				field497 = -2;
			}

			if (field184 < -20) {
				field185 = 1;
			}

			if (field184 > 10) {
				field185 = -1;
			}

			field447++;
			if (field447 > 50) {
				field64.method234(32);
			}

			try {
				if (field139 != null && field64.field733 > 0) {
					field139.method198(field64.field732, field64.field733, 0);
					field64.field733 = 0;
					field447 = 0;
				}
			} catch (IOException var32) {
				method183();
			} catch (Exception var33) {
				method103();
			}
		}
	}

	@ObfuscatedName("client.a(ZILIUVBENCV;)V")
	public final void method128(int arg0, IUVBENCV arg1) {
		while (arg1.field734 + 21 < arg0 * 8) {
			int var3 = arg1.method256(14);
			if (var3 == 16383) {
				break;
			}

			if (field213[var3] == null) {
				field213[var3] = new KPZIZBER();
			}

			KPZIZBER var4 = field213[var3];
			field215[field214++] = var3;
			var4.field567 = field292;
			var4.field906 = NIJEYEOX.method363(arg1.method256(13));
			int var5 = arg1.method256(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method256(1);
			int var7 = arg1.method256(1);
			if (var7 == 1) {
				field264[field263++] = var3;
			}

			int var8 = arg1.method256(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field561 = var4.field906.field1075;
			var4.field539 = var4.field906.field1109;
			var4.field524 = var4.field906.field1085;
			var4.field525 = var4.field906.field1078;
			var4.field526 = var4.field906.field1090;
			var4.field527 = var4.field906.field1087;
			var4.field535 = var4.field906.field1084;
			var4.method202(field491.field537[0] + var5, field491.field538[0] + var8, var6 == 1);
		}

		arg1.method257();
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method129(long arg0) {
		if (arg0 != 0L) {
			if (field498 >= 100 && field186 != 1) {
				method160(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else if (field498 >= 200) {
				method160(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
			} else {
				String var3 = RSIGORUG.method456(RSIGORUG.method453(arg0));
				for (int var4 = 0; var4 < field498; var4++) {
					if (field194[var4] == arg0) {
						method160(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < field162; var5++) {
					if (field420[var5] == arg0) {
						method160(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(field491.field1402)) {
					field190[field498] = var3;
					field194[field498] = arg0;
					field381[field498] = 0;
					field498++;
					field323 = true;
					field64.method234(53);
					field64.method241(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int method130(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.x(I)V")
	public final void method131() {
		field64.method234(176);

		if (field183 != -1) {
			method70(field183);
			field183 = -1;
			field323 = true;
			field229 = false;
			field100 = true;
		}

		if (field275 != -1) {
			method70(field275);
			field275 = -1;
			field67 = true;
			field229 = false;
		}

		if (field241 != -1) {
			method70(field241);
			field241 = -1;
			field341 = true;
		}

		if (field152 != -1) {
			method70(field152);
			field152 = -1;
		}

		if (field492 != -1) {
			method70(field492);
			field492 = -1;
		}
	}

	@ObfuscatedName("client.j(Z)Z")
	public final boolean method132() {
		if (field139 == null) {
			return false;
		}

		try {
			int var1 = field139.method196();
			if (var1 == 0) {
				return false;
			}

			if (field445 == -1) {
				field139.method197(field238.field732, 0, 1);
				field445 = field238.field732[0] & 0xFF;
				if (field147 != null) {
					field445 = field445 - field147.method230() & 0xFF;
				}

				field444 = IXWEHRFQ.field796[field445];
				var1--;
			}

			if (field444 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field139.method197(field238.field732, 0, 1);
				field444 = field238.field732[0] & 0xFF;
				var1--;
			}

			if (field444 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field139.method197(field238.field732, 0, 2);
				field238.field733 = 0;
				field444 = field238.method247();
				var1 -= 2;
			}

			if (var1 < field444) {
				return false;
			}

			field238.field733 = 0;
			field139.method197(field238.field732, 0, field444);
			field446 = 0;
			field344 = field343;
			field343 = field342;
			field342 = field445;

			if (field445 == 23) {
				field186 = field238.method264();
				field299 = field238.method247();
				field445 = -1;
				return true;
			}

			if (field445 == 97) {
				int var2 = field238.method272();
				int var3 = field238.method248();
				int var4 = field238.method275();
				MIIVNBFU var5 = MIIVNBFU.method350(var2);
				var5.field985 = var3;
				var5.field964 = var4;
				field445 = -1;
				return true;
			}

			if (field445 == 219) {
				boolean var6 = field238.method263() == 1;
				int var7 = field238.method271();
				MIIVNBFU.method350(var7).field998 = var6;
				field445 = -1;
				return true;
			}

			if (field445 == 210) {
				field240 = field238.method245();
				if (field464 == field240) {
					if (field240 == 3) {
						field464 = 1;
					} else {
						field464 = 3;
					}

					field323 = true;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 19) {
				method85(field444, field238);
				field445 = -1;
				return true;
			}

			if (field445 == 233) {
				method191(field238, field444);
				field288 = false;
				field445 = -1;
				return true;
			}

			if (field445 == 155) {
				int var8 = field238.method247();
				if (var8 == 0xFFFF) {
					var8 = -1;
				}

				if (field150 != var8 && field94 && !field487 && field163 == 0) {
					field459 = var8;
					field460 = true;
					field177.method40(2, field459);
				}

				field150 = var8;
				field445 = -1;
				return true;
			}

			if (field445 == 225) {
				int var9 = field238.method276();
				int var10 = field238.method247();
				if (field94 && !field487) {
					field459 = var10;
					field460 = false;
					field177.method40(2, field459);
					field163 = var9;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 213) {
				field350 = field238.method263();
				field349 = field238.method264();
				field445 = -1;
				return true;
			}

			if (field445 == 236) {
				field453 = field238.method245();
				field445 = -1;
				return true;
			}

			if (field445 == 247) {
				method103();
				field445 = -1;
				return false;
			}

			if (field445 == 30) {
				int var11 = field238.method247();
				MIIVNBFU var12 = MIIVNBFU.method350(var11);
				for (int var13 = 0; var13 < var12.field989.length; var13++) {
					var12.field989[var13] = -1;
					var12.field989[var13] = 0;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 230) {
				int var14 = field238.method247();
				int var15 = field238.method245();
				int var16 = field238.method247();
				if (var16 == 0xFFFF) {
					if (field419 < 50) {
						field250[field419] = (short) var14;
						field77[field419] = var15;
						field280[field419] = 0;
						field419++;
					}
				} else if (field273 && !field487 && field419 < 50) {
					field250[field419] = var14;
					field77[field419] = var15;
					field280[field419] = QJLULATA.field1260[var14] + var16;
					field419++;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 208) {
				long var17 = field238.method251();
				int var19 = field238.method250();
				int var20 = field238.method245();
				boolean var21 = false;
				for (int var22 = 0; var22 < 100; var22++) {
					if (field282[var22] == var19) {
						var21 = true;
						break;
					}
				}

				if (var20 <= 1) {
					for (int var23 = 0; var23 < field162; var23++) {
						if (field420[var23] == var17) {
							var21 = true;
							break;
						}
					}
				}

				if (!var21 && field442 == 0) {
					try {
						field282[field137] = var19;
						field137 = (field137 + 1) % 100;
						String var24 = PMGJNHXQ.method383(field444 - 13, field238);
						if (var20 != 3) {
							var24 = XWTMFQHB.method544(var24);
						}

						if (var20 == 2 || var20 == 3) {
							method160(7, var24, "@cr2@" + RSIGORUG.method456(RSIGORUG.method453(var17)));
						} else if (var20 == 1) {
							method160(7, var24, "@cr1@" + RSIGORUG.method456(RSIGORUG.method453(var17)));
						} else {
							method160(3, var24, RSIGORUG.method456(RSIGORUG.method453(var17)));
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 178) {
				int var26 = field238.method275();
				int var27 = field238.method271();
				MIIVNBFU var28 = MIIVNBFU.method350(var27);
				if (var28.field981 != var26 || var26 == -1) {
					var28.field981 = var26;
					var28.field967 = 0;
					var28.field994 = 0;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 202) {
				field349 = field238.method264();
				field350 = field238.method245();

				while (field238.field733 < field444) {
					int var29 = field238.method245();
					method163(var29, field238);
				}

				field445 = -1;
				return true;
			}

			if (field445 == 180) {
				field238.method271();
				field277 = field238.method279();
				field63 = field238.method273();
				field238.method273();
				field195 = field238.method247();
				field295 = field238.method247();
				field238.method273();
				field361 = field238.method271();
				field383 = field238.method273();
				field238.method245();
				field363 = field238.method273();
				signlink.dnslookup(RSIGORUG.method455(field277));
				field445 = -1;
				return true;
			}

			if (field445 == 181) {
				int var30 = field238.method273();
				int var31 = field238.method272();
				int var32 = var30 >> 10 & 0x1F;
				int var33 = var30 >> 5 & 0x1F;
				int var34 = var30 & 0x1F;
				MIIVNBFU.method350(var31).field977 = (var34 << 3) + (var32 << 19) + (var33 << 11);
				field445 = -1;
				return true;
			}

			if (field445 == 237) {
				field323 = true;
				int var35 = field238.method262();
				int var36 = field238.method278();
				int var37 = field238.method263();
				field463[var35] = var36;
				field443[var35] = var37;
				field141[var35] = 1;
				for (int var38 = 0; var38 < 98; var38++) {
					if (var36 >= field116[var38]) {
						field141[var35] = var38 + 2;
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 43) {
				for (int var39 = 0; var39 < field142.length; var39++) {
					if (field242[var39] != field142[var39]) {
						field142[var39] = field242[var39];
						method52(var39);
						field323 = true;
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 120) {
				field493 = field238.method245();
				if (field493 == 1) {
					field62 = field238.method247();
				}

				if (field493 >= 2 && field493 <= 6) {
					if (field493 == 2) {
						field332 = 64;
						field333 = 64;
					}

					if (field493 == 3) {
						field332 = 0;
						field333 = 64;
					}

					if (field493 == 4) {
						field332 = 128;
						field333 = 64;
					}

					if (field493 == 5) {
						field332 = 64;
						field333 = 0;
					}

					if (field493 == 6) {
						field332 = 64;
						field333 = 128;
					}

					field493 = 2;
					field329 = field238.method247();
					field330 = field238.method247();
					field331 = field238.method245();
				}

				if (field493 == 10) {
					field113 = field238.method247();
				}

				field445 = -1;
				return true;
			}

			if (field445 == 189) {
				int var40 = field238.method273();
				int var41 = field238.method273();
				int var42 = field238.method272();
				int var43 = field238.method271();
				MIIVNBFU.method350(var40).field1011 = var42;
				MIIVNBFU.method350(var40).field1012 = var41;
				MIIVNBFU.method350(var40).field1010 = var43;
				field445 = -1;
				return true;
			}

			if (field445 == 83) {
				int var44 = field238.method271();
				method111(var44);

				if (field183 != -1) {
					method70(field183);
					field183 = -1;
					field323 = true;
					field100 = true;
				}

				if (field275 != -1) {
					method70(field275);
					field275 = -1;
					field67 = true;
				}

				if (field241 != -1) {
					method70(field241);
					field241 = -1;
					field341 = true;
				}

				if (field152 != -1) {
					method70(field152);
					field152 = -1;
				}

				if (field492 != var44) {
					method70(field492);
					field492 = var44;
				}

				if (field191 != 0) {
					field191 = 0;
					field67 = true;
				}

				field229 = false;
				field445 = -1;
				return true;
			}

			if (field445 == 159) {
				field458 = false;

				for (int var45 = 0; var45 < 5; var45++) {
					field305[var45] = false;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 55 || field445 == 114 || field445 == 137 || field445 == 1 || field445 == 39 || field445 == 68 || field445 == 112 || field445 == 125 || field445 == 115 || field445 == 132 || field445 == 75) {
				method163(field445, field238);
				field445 = -1;
				return true;
			}

			if (field445 == 56) {
				int var46 = field238.method277();
				int var47 = field238.method272();
				field242[var47] = var46;

				if (field142[var47] != var46) {
					field142[var47] = var46;
					method52(var47);
					field323 = true;

					if (field379 != -1) {
						field67 = true;
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 6) {
				for (int var48 = 0; var48 < field260.length; var48++) {
					if (field260[var48] != null) {
						field260[var48].field543 = -1;
					}
				}

				for (int var49 = 0; var49 < field213.length; var49++) {
					if (field213[var49] != null) {
						field213[var49].field543 = -1;
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 52) {
				int var50 = field238.method271();
				int var51 = field238.method273();
				int var52 = field238.method271();
				MIIVNBFU.method350(var52).field968 = (var51 << 16) + var50;
				field445 = -1;
				return true;
			}

			if (field445 == 161) {
				int var53 = field238.method273();
				int var54 = field238.method273();
				MIIVNBFU.method350(var53).field983 = 1;
				MIIVNBFU.method350(var53).field984 = var54;
				field445 = -1;
				return true;
			}

			if (field445 == 46) {
				field95 = field238.method247() * 30;
				field445 = -1;
				return true;
			}

			if (field445 == 153) {
				if (field464 == 12) {
					field323 = true;
				}

				field483 = field238.method248();
				field445 = -1;
				return true;
			}

			if (field445 == 88) {
				field349 = field238.method262();
				field350 = field238.method264();
				for (int var55 = field349; var55 < field349 + 8; var55++) {
					for (int var56 = field350; var56 < field350 + 8; var56++) {
						if (field160[field182][var55][var56] != null) {
							field160[field182][var55][var56] = null;
							method97(var55, var56);
						}
					}
				}

				for (JQXBQBEJ var57 = (JQXBQBEJ) field474.method580(); var57 != null; var57 = (JQXBQBEJ) field474.method582()) {
					if (var57.field879 >= field349 && var57.field879 < field349 + 8 && var57.field880 >= field350 && var57.field880 < field350 + 8 && field182 == var57.field877) {
						var57.field875 = 0;
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 38) {
				int var58 = field238.method247();
				int var59 = field238.method273();
				MIIVNBFU var60 = MIIVNBFU.method350(var59);
				if (var60 != null && var60.field1014 == 0) {
					if (var58 < 0) {
						var58 = 0;
					}

					if (var58 > var60.field1004 - var60.field1031) {
						var58 = var60.field1004 - var60.field1031;
					}

					var60.field980 = var58;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 254) {
				field323 = true;
				int var61 = field238.method247();
				MIIVNBFU var62 = MIIVNBFU.method350(var61);
				int var63 = field238.method247();
				for (int var64 = 0; var64 < var63; var64++) {
					var62.field989[var64] = field238.method247();
					int var65 = field238.method245();
					if (var65 == 255) {
						var65 = field238.method277();
					}

					var62.field990[var64] = var65;
				}

				for (int var66 = var63; var66 < var62.field989.length; var66++) {
					var62.field989[var66] = 0;
					var62.field990[var66] = 0;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 0) {
				String var67 = field238.method252();
				int var68 = field238.method263();
				int var69 = field238.method264();
				if (var68 >= 1 && var68 <= 5) {
					if (var67.equalsIgnoreCase("null")) {
						var67 = null;
					}

					field216[var68 - 1] = var67;
					field217[var68 - 1] = var69 == 0;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 186) {
				field136 = false;
				field191 = 1;
				field96 = "";
				field67 = true;
				field445 = -1;
				return true;
			}

			if (field445 == 160) {
				field301 = field238.method245();
				field365 = field238.method245();
				field279 = field238.method245();
				field151 = true;
				field67 = true;
				field445 = -1;
				return true;
			}

			if (field445 == 35) {
				int var70 = field238.method274();
				if (field379 != var70) {
					method70(field379);
					field379 = var70;
				}

				field67 = true;
				field445 = -1;
				return true;
			}

			if (field445 == 205) {
				field458 = true;
				field205 = field238.method245();
				field206 = field238.method245();
				field207 = field238.method247();
				field208 = field238.method245();
				field209 = field238.method245();
				if (field209 >= 100) {
					int var71 = field205 * 128 + 64;
					int var72 = field206 * 128 + 64;
					int var73 = method146(var72, field182, var71) - field207;
					int var74 = var71 - field104;
					int var75 = var73 - field105;
					int var76 = var72 - field106;
					int var77 = (int) Math.sqrt(var74 * var74 + var76 * var76);
					field107 = (int) (Math.atan2(var75, var77) * 325.949D) & 0x7FF;
					field108 = (int) (Math.atan2(var74, var76) * -325.949D) & 0x7FF;

					if (field107 < 128) {
						field107 = 128;
					}

					if (field107 > 383) {
						field107 = 383;
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 175) {
				int var78 = field238.method272();
				method111(var78);

				if (field275 != -1) {
					method70(field275);
					field275 = -1;
					field67 = true;
				}

				if (field241 != -1) {
					method70(field241);
					field241 = -1;
					field341 = true;
				}

				if (field152 != -1) {
					method70(field152);
					field152 = -1;
				}

				if (field492 != -1) {
					method70(field492);
					field492 = -1;
				}

				if (field183 != var78) {
					method70(field183);
					field183 = var78;
				}

				if (field191 != 0) {
					field191 = 0;
					field67 = true;
				}

				field323 = true;
				field100 = true;
				field229 = false;
				field445 = -1;
				return true;
			}

			if (field445 == 21) {
				int var79 = field238.method247();
				MIIVNBFU.method350(var79).field983 = 3;

				if (field491.field1399 == null) {
					MIIVNBFU.method350(var79).field984 = (field491.field1401[11] << 5) + (field491.field1401[8] << 10) + (field491.field1401[0] << 15) + (field491.field1403[0] << 25) + (field491.field1403[4] << 20) + field491.field1401[1];
				} else {
					MIIVNBFU.method350(var79).field984 = (int) (field491.field1399.field1083 + 0x12345678L);
				}

				field445 = -1;
				return true;
			}

			if (field445 == 170) {
				field270 = 0;
				field445 = -1;
				return true;
			}

			if (field445 == 50) {
				field334 = field238.method245();
				field445 = -1;
				return true;
			}

			if (field445 == 200) {
				field323 = true;
				int var80 = field238.method247();
				MIIVNBFU var81 = MIIVNBFU.method350(var80);
				while (field238.field733 < field444) {
					int var82 = field238.method259();
					int var83 = field238.method247();
					int var84 = field238.method245();
					if (var84 == 255) {
						var84 = field238.method250();
					}

					if (var82 >= 0 && var82 < var81.field989.length) {
						var81.field989[var82] = var83;
						var81.field990[var82] = var84;
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 25) {
				long var85 = field238.method251();
				int var87 = field238.method245();
				String var88 = RSIGORUG.method456(RSIGORUG.method453(var85));
				for (int var89 = 0; var89 < field498; var89++) {
					if (field194[var89] == var85) {
						if (field381[var89] != var87) {
							field381[var89] = var87;
							field323 = true;

							if (var87 > 0) {
								method160(5, var88 + " has logged in.", "");
							}

							if (var87 == 0) {
								method160(5, var88 + " has logged out.", "");
							}
						}

						var88 = null;
						break;
					}
				}

				if (var88 != null && field498 < 200) {
					field194[field498] = var85;
					field190[field498] = var88;
					field381[field498] = var87;
					field498++;
					field323 = true;
				}

				boolean var90 = false;
				while (!var90) {
					var90 = true;
					for (int var91 = 0; var91 < field498 - 1; var91++) {
						if (field381[var91] != field484 && field381[var91 + 1] == field484 || field381[var91] == 0 && field381[var91 + 1] != 0) {
							int var92 = field381[var91];
							field381[var91] = field381[var91 + 1];
							field381[var91 + 1] = var92;
							String var93 = field190[var91];
							field190[var91] = field190[var91 + 1];
							field190[var91 + 1] = var93;
							long var94 = field194[var91];
							field194[var91] = field194[var91 + 1];
							field194[var91 + 1] = var94;
							field323 = true;
							var90 = false;
						}
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 142) {
				int var96 = field238.method272();
				method111(var96);

				if (field183 != -1) {
					method70(field183);
					field183 = -1;
					field323 = true;
					field100 = true;
				}

				if (field241 != -1) {
					method70(field241);
					field241 = -1;
					field341 = true;
				}

				if (field152 != -1) {
					method70(field152);
					field152 = -1;
				}

				if (field492 != -1) {
					method70(field492);
					field492 = -1;
				}

				if (field275 != var96) {
					method70(field275);
					field275 = var96;
				}

				field229 = false;
				field67 = true;
				field445 = -1;
				return true;
			}

			if (field445 == 177) {
				int var97 = field238.method245();
				int var98 = field238.method245();
				int var99 = field238.method245();
				int var100 = field238.method245();
				field305[var97] = true;
				field211[var97] = var98;
				field239[var97] = var99;
				field500[var97] = var100;
				field285[var97] = 0;
				field445 = -1;
				return true;
			}

			if (field445 == 109) {
				int var101 = field238.method248();
				if (var101 >= 0) {
					method111(var101);
				}

				if (field140 != var101) {
					method70(field140);
					field140 = var101;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 239) {
				int var102 = field238.method247();
				int var103 = field238.method264();

				if (var102 == 0xFFFF) {
					var102 = -1;
				}

				if (field300[var103] != var102) {
					method70(field300[var103]);
					field300[var103] = var102;
				}

				field323 = true;
				field100 = true;
				field445 = -1;
				return true;
			}

			if (field445 == 61) {
				int var104 = field238.method247();
				int var105 = field238.method272();
				int var106 = field238.method272();
				if (var106 == 0xFFFF) {
					MIIVNBFU.method350(var105).field983 = 0;
					field445 = -1;
					return true;
				}

				IXFCVZPT var107 = IXFCVZPT.method285(var106);
				MIIVNBFU.method350(var105).field983 = 4;
				MIIVNBFU.method350(var105).field984 = var106;
				MIIVNBFU.method350(var105).field1011 = var107.field790;
				MIIVNBFU.method350(var105).field1012 = var107.field762;
				MIIVNBFU.method350(var105).field1010 = var107.field782 * 100 / var104;
				field445 = -1;
				return true;
			}

			if (field445 == 235) {
				field136 = false;
				field191 = 2;
				field96 = "";
				field67 = true;
				field445 = -1;
				return true;
			}

			if (field445 == 84) {
				field464 = field238.method264();
				field323 = true;
				field100 = true;
				field445 = -1;
				return true;
			}

			if (field445 == 255) {
				int var108 = field238.method271();
				int var109 = field238.method247();
				MIIVNBFU.method350(var109).field983 = 2;
				MIIVNBFU.method350(var109).field984 = var108;
				field445 = -1;
				return true;
			}

			if (field445 == 111) {
				String var110 = field238.method252();
				if (var110.endsWith(":tradereq:")) {
					String var111 = var110.substring(0, var110.indexOf(":"));
					long var112 = RSIGORUG.method452(var111);
					boolean var114 = false;
					for (int var115 = 0; var115 < field162; var115++) {
						if (field420[var115] == var112) {
							var114 = true;
							break;
						}
					}

					if (!var114 && field442 == 0) {
						method160(4, "wishes to trade with you.", var111);
					}
				} else if (var110.endsWith(":duelreq:")) {
					String var116 = var110.substring(0, var110.indexOf(":"));
					long var117 = RSIGORUG.method452(var116);
					boolean var119 = false;
					for (int var120 = 0; var120 < field162; var120++) {
						if (field420[var120] == var117) {
							var119 = true;
							break;
						}
					}

					if (!var119 && field442 == 0) {
						method160(8, "wishes to duel with you.", var116);
					}
				} else if (var110.endsWith(":chalreq:")) {
					String var121 = var110.substring(0, var110.indexOf(":"));
					long var122 = RSIGORUG.method452(var121);
					boolean var124 = false;
					for (int var125 = 0; var125 < field162; var125++) {
						if (field420[var125] == var122) {
							var124 = true;
							break;
						}
					}

					if (!var124 && field442 == 0) {
						String var126 = var110.substring(var110.indexOf(":") + 1, var110.length() - 9);
						method160(8, var126, var121);
					}
				} else {
					method160(0, var110, "");
				}

				field445 = -1;
				return true;
			}

			if (field445 == 156) {
				field458 = true;
				field436 = field238.method245();
				field437 = field238.method245();
				field438 = field238.method247();
				field439 = field238.method245();
				field440 = field238.method245();
				if (field440 >= 100) {
					field104 = field436 * 128 + 64;
					field106 = field437 * 128 + 64;
					field105 = method146(field106, field182, field104) - field438;
				}

				field445 = -1;
				return true;
			}

			if (field445 == 87) {
				field499 = field238.method245();
				field323 = true;
				field445 = -1;
				return true;
			}

			if (field445 == 62 || field445 == 8) {
				int var127 = field422;
				int var128 = field423;
				if (field445 == 62) {
					var128 = field238.method273();
					var127 = field238.method273();
					field225 = false;
				}

				if (field445 == 8) {
					field238.method255();

					for (int var129 = 0; var129 < 4; var129++) {
						for (int var130 = 0; var130 < 13; var130++) {
							for (int var131 = 0; var131 < 13; var131++) {
								int var132 = field238.method256(1);
								if (var132 == 1) {
									field466[var129][var130][var131] = field238.method256(26);
								} else {
									field466[var129][var130][var131] = -1;
								}
							}
						}
					}

					field238.method257();
					var128 = field238.method271();
					var127 = field238.method247();
					field225 = true;
				}

				if (field422 == var127 && field423 == var128 && field158 == 2) {
					field445 = -1;
					return true;
				}

				field422 = var127;
				field423 = var128;
				field169 = (field422 - 6) * 8;
				field170 = (field423 - 6) * 8;
				field473 = false;
				if ((field422 / 8 == 48 || field422 / 8 == 49) && field423 / 8 == 48) {
					field473 = true;
				}

				if (field422 / 8 == 48 && field423 / 8 == 148) {
					field473 = true;
				}

				field158 = 1;
				field245 = System.currentTimeMillis();
				method104("Loading - please wait.", null);

				if (field445 == 62) {
					int var133 = 0;
					for (int var134 = (field422 - 6) / 8; var134 <= (field422 + 6) / 8; var134++) {
						for (int var135 = (field423 - 6) / 8; var135 <= (field423 + 6) / 8; var135++) {
							var133++;
						}
					}

					field68 = new byte[var133][];
					field360 = new byte[var133][];
					field401 = new int[var133];
					field402 = new int[var133];
					field403 = new int[var133];
					int var136 = 0;
					for (int var137 = (field422 - 6) / 8; var137 <= (field422 + 6) / 8; var137++) {
						for (int var138 = (field423 - 6) / 8; var138 <= (field423 + 6) / 8; var138++) {
							field401[var136] = (var137 << 8) + var138;

							if (field473 && (var138 == 49 || var138 == 149 || var138 == 147 || var137 == 50 || var137 == 49 && var138 == 47)) {
								field402[var136] = -1;
								field403[var136] = -1;
								var136++;
							} else {
								int var139 = field402[var136] = field177.method28(0, var137, var138);
								if (var139 != -1) {
									field177.method40(3, var139);
								}

								int var140 = field403[var136] = field177.method28(1, var137, var138);
								if (var140 != -1) {
									field177.method40(3, var140);
								}

								var136++;
							}
						}
					}
				}

				if (field445 == 8) {
					int var141 = 0;
					int[] var142 = new int[676];
					for (int var143 = 0; var143 < 4; var143++) {
						for (int var144 = 0; var144 < 13; var144++) {
							for (int var145 = 0; var145 < 13; var145++) {
								int var146 = field466[var143][var144][var145];
								if (var146 != -1) {
									int var147 = var146 >> 14 & 0x3FF;
									int var148 = var146 >> 3 & 0x7FF;
									int var149 = (var147 / 8 << 8) + var148 / 8;
									for (int var150 = 0; var150 < var141; var150++) {
										if (var142[var150] == var149) {
											var149 = -1;
											break;
										}
									}

									if (var149 != -1) {
										var142[var141++] = var149;
									}
								}
							}
						}
					}

					field68 = new byte[var141][];
					field360 = new byte[var141][];
					field401 = new int[var141];
					field402 = new int[var141];
					field403 = new int[var141];
					for (int var151 = 0; var151 < var141; var151++) {
						int var152 = field401[var151] = var142[var151];
						int var153 = var152 >> 8 & 0xFF;
						int var154 = var152 & 0xFF;
						int var155 = field402[var151] = field177.method28(0, var153, var154);
						if (var155 != -1) {
							field177.method40(3, var155);
						}

						int var156 = field403[var151] = field177.method28(1, var153, var154);
						if (var156 != -1) {
							field177.method40(3, var156);
						}
					}
				}

				int var157 = field169 - field171;
				int var158 = field170 - field172;
				field171 = field169;
				field172 = field170;

				for (int var159 = 0; var159 < 16384; var159++) {
					KPZIZBER var160 = field213[var159];
					if (var160 != null) {
						for (int var161 = 0; var161 < 10; var161++) {
							var160.field537[var161] -= var157;
							var160.field538[var161] -= var158;
						}

						var160.field548 -= var157 * 128;
						var160.field549 -= var158 * 128;
					}
				}

				for (int var162 = 0; var162 < field258; var162++) {
					VJDNWPCM var163 = field260[var162];
					if (var163 != null) {
						for (int var164 = 0; var164 < 10; var164++) {
							var163.field537[var164] -= var157;
							var163.field538[var164] -= var158;
						}

						var163.field548 -= var157 * 128;
						var163.field549 -= var158 * 128;
					}
				}

				field288 = true;
				byte var165 = 0;
				byte var166 = 104;
				byte var167 = 1;
				if (var157 < 0) {
					var165 = 103;
					var166 = -1;
					var167 = -1;
				}

				byte var168 = 0;
				byte var169 = 104;
				byte var170 = 1;
				if (var158 < 0) {
					var168 = 103;
					var169 = -1;
					var170 = -1;
				}

				for (int var171 = var165; var171 != var166; var171 += var167) {
					for (int var172 = var168; var172 != var169; var172 += var170) {
						int var173 = var157 + var171;
						int var174 = var158 + var172;
						for (int var175 = 0; var175 < 4; var175++) {
							if (var173 >= 0 && var174 >= 0 && var173 < 104 && var174 < 104) {
								field160[var175][var171][var172] = field160[var175][var173][var174];
							} else {
								field160[var175][var171][var172] = null;
							}
						}
					}
				}

				for (JQXBQBEJ var176 = (JQXBQBEJ) field474.method580(); var176 != null; var176 = (JQXBQBEJ) field474.method582()) {
					var176.field879 -= var157;
					var176.field880 -= var158;
					if (var176.field879 < 0 || var176.field880 < 0 || var176.field879 >= 104 || var176.field880 >= 104) {
						var176.method602();
					}
				}

				if (field270 != 0) {
					field270 -= var157;
					field271 -= var158;
				}

				field458 = false;
				field445 = -1;
				return true;
			}

			if (field445 == 232) {
				int var177 = field238.method272();
				int var178 = field238.method273();

				if (field275 != -1) {
					method70(field275);
					field275 = -1;
					field67 = true;
				}

				if (field241 != -1) {
					method70(field241);
					field241 = -1;
					field341 = true;
				}

				if (field152 != -1) {
					method70(field152);
					field152 = -1;
				}

				if (field492 != var178) {
					method70(field492);
					field492 = var178;
				}

				if (field183 != var177) {
					method70(field183);
					field183 = var177;
				}

				if (field191 != 0) {
					field191 = 0;
					field67 = true;
				}

				field323 = true;
				field100 = true;
				field229 = false;
				field445 = -1;
				return true;
			}

			if (field445 == 150) {
				byte var179 = field238.method266();
				int var180 = field238.method273();
				field242[var180] = var179;

				if (field142[var180] != var179) {
					field142[var180] = var179;
					method52(var180);
					field323 = true;

					if (field379 != -1) {
						field67 = true;
					}
				}

				field445 = -1;
				return true;
			}

			if (field445 == 18) {
				field162 = field444 / 8;
				for (int var181 = 0; var181 < field162; var181++) {
					field420[var181] = field238.method251();
				}

				field445 = -1;
				return true;
			}

			if (field445 == 171) {
				if (field183 != -1) {
					method70(field183);
					field183 = -1;
					field323 = true;
					field100 = true;
				}

				if (field275 != -1) {
					method70(field275);
					field275 = -1;
					field67 = true;
				}

				if (field241 != -1) {
					method70(field241);
					field241 = -1;
					field341 = true;
				}

				if (field152 != -1) {
					method70(field152);
					field152 = -1;
				}

				if (field492 != -1) {
					method70(field492);
					field492 = -1;
				}

				if (field191 != 0) {
					field191 = 0;
					field67 = true;
				}

				field229 = false;
				field445 = -1;
				return true;
			}

			if (field445 == 143) {
				int var182 = field238.method271();
				int var183 = field238.method271();
				method111(var182);

				if (var183 != -1) {
					method111(var183);
				}

				if (field492 != -1) {
					method70(field492);
					field492 = -1;
				}

				if (field183 != -1) {
					method70(field183);
					field183 = -1;
				}

				if (field275 != -1) {
					method70(field275);
					field275 = -1;
				}

				if (field241 != var182) {
					method70(field241);
					field241 = var182;
				}

				if (field152 != var182) {
					method70(field152);
					field152 = var183;
				}

				field191 = 0;
				field229 = false;
				field445 = -1;
				return true;
			}

			if (field445 == 85) {
				if (field464 == 12) {
					field323 = true;
				}

				field278 = field238.method245();
				field445 = -1;
				return true;
			}

			if (field445 == 9) {
				int var184 = field238.method271();
				String var185 = field238.method252();
				MIIVNBFU.method350(var184).field969 = var185;

				if (field300[field464] == MIIVNBFU.method350(var184).field991) {
					field323 = true;
				}

				field445 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field445 + "," + field444 + " - " + field343 + "," + field344);
			method103();
		} catch (IOException var190) {
			method183();
		} catch (Exception var191) {
			String var187 = "T2 - " + field445 + "," + field343 + "," + field344 + " - " + field444 + "," + (field491.field537[0] + field169) + "," + (field491.field538[0] + field170) + " - ";
			for (int var188 = 0; var188 < field444 && var188 < 50; var188++) {
				var187 = var187 + field238.field732[var188] + ",";
			}

			signlink.reporterror(var187);
			method103();
		}

		return true;
	}

	@ObfuscatedName("client.a(IILMIIVNBFU;II)V")
	public final void method133(int arg0, MIIVNBFU arg1, int arg2, int arg3) {
		if (arg1.field1014 == 0 && arg1.field993 != null && (!arg1.field998 || field424 == arg1.field963 || field450 == arg1.field963 || field476 == arg1.field963)) {
			int var5 = TIJYBGAE.field1349;
			int var6 = TIJYBGAE.field1347;
			int var7 = TIJYBGAE.field1350;
			int var8 = TIJYBGAE.field1348;
			TIJYBGAE.method489(arg1.field1031 + arg2, arg0, arg2, arg1.field962 + arg0);
			int var9 = arg1.field993.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.field1016[var10] + arg0;
				int var12 = arg1.field996[var10] + arg2 - arg3;
				MIIVNBFU var13 = MIIVNBFU.method350(arg1.field993[var10]);
				var11 += var13.field985;
				var12 += var13.field964;

				if (var13.field1020 > 0) {
					method142(var13);
				}

				if (var13.field1014 == 0) {
					if (var13.field980 > var13.field1004 - var13.field1031) {
						var13.field980 = var13.field1004 - var13.field1031;
					}

					if (var13.field980 < 0) {
						var13.field980 = 0;
					}

					method133(var11, var13, var12, var13.field980);

					if (var13.field1004 > var13.field1031) {
						method95(var13.field980, var13.field1031, var13.field1004, var13.field962 + var11, var12);
					}
				} else if (var13.field1014 != 1) {
					if (var13.field1014 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1031; var15++) {
							for (int var16 = 0; var16 < var13.field962; var16++) {
								int var17 = (var13.field1006 + 32) * var16 + var11;
								int var18 = (var13.field970 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1027[var14];
									var18 += var13.field978[var14];
								}

								if (var13.field989[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field989[var14] - 1;
									if (var17 > TIJYBGAE.field1349 - 32 && var17 < TIJYBGAE.field1350 && var18 > TIJYBGAE.field1347 - 32 && var18 < TIJYBGAE.field1348 || field480 != 0 && field479 == var14) {
										int var22 = 0;
										if (field252 == 1 && field253 == var14 && field254 == var13.field963) {
											var22 = 0xFFFFFF;
										}

										GPLGZASP var23 = IXFCVZPT.method287(var13.field990[var14], var21, var22);
										if (var23 != null) {
											if (field480 != 0 && field479 == var14 && field478 == var13.field963) {
												var19 = field1049 - field481;
												var20 = field1050 - field482;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field362 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method222(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < TIJYBGAE.field1347 && arg1.field980 > 0) {
													int var24 = (TIJYBGAE.field1347 - var18 - var20) * field382 / 3;
													if (var24 > field382 * 10) {
														var24 = field382 * 10;
													}

													if (var24 > arg1.field980) {
														var24 = arg1.field980;
													}

													arg1.field980 -= var24;
													field482 += var24;
												}

												if (var18 + var20 + 32 > TIJYBGAE.field1348 && arg1.field980 < arg1.field1004 - arg1.field1031) {
													int var25 = (var18 + var20 + 32 - TIJYBGAE.field1348) * field382 / 3;
													if (var25 > field382 * 10) {
														var25 = field382 * 10;
													}

													if (var25 > arg1.field1004 - arg1.field1031 - arg1.field980) {
														var25 = arg1.field1004 - arg1.field1031 - arg1.field980;
													}

													arg1.field980 += var25;
													field482 -= var25;
												}
											} else if (field417 != 0 && field416 == var14 && field415 == var13.field963) {
												var23.method222(var18, var17, 128);
											} else {
												var23.method220(var18, var17);
											}

											if (var23.field698 == 33 || var13.field990[var14] != 1) {
												int var26 = var13.field990[var14];
												field432.method506(0, method152(var26), var17 + var19 + 1, var18 + 10 + var20);
												field432.method506(0xFFFF00, method152(var26), var17 + var19, var18 + 9 + var20);
											}
										}
									}
								} else if (var13.field987 != null && var14 < 20) {
									GPLGZASP var27 = var13.field987[var14];
									if (var27 != null) {
										var27.method220(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1014 == 3) {
						boolean var28 = false;
						if (field476 == var13.field963 || field450 == var13.field963 || field424 == var13.field963) {
							var28 = true;
						}

						int var29;
						if (method138(var13)) {
							var29 = var13.field972;
							if (var28 && var13.field1003 != 0) {
								var29 = var13.field1003;
							}
						} else {
							var29 = var13.field977;
							if (var28 && var13.field1023 != 0) {
								var29 = var13.field1023;
							}
						}

						if (var13.field960 == 0) {
							if (var13.field965) {
								TIJYBGAE.method492(var13.field962, var12, var29, var13.field1031, var11);
							} else {
								TIJYBGAE.method493(var29, var13.field962, var13.field1031, var12, var11);
							}
						} else if (var13.field965) {
							TIJYBGAE.method491(var13.field1031, var11, var12, 256 - (var13.field960 & 0xFF), var13.field962, var29);
						} else {
							TIJYBGAE.method494(256 - (var13.field960 & 0xFF), var11, var12, var29, var13.field962, var13.field1031);
						}
					} else if (var13.field1014 == 4) {
						UOINBUQD var30 = var13.field1032;
						String var31 = var13.field969;
						boolean var32 = false;
						if (field476 == var13.field963 || field450 == var13.field963 || field424 == var13.field963) {
							var32 = true;
						}

						int var33;
						if (method138(var13)) {
							var33 = var13.field972;
							if (var32 && var13.field1003 != 0) {
								var33 = var13.field1003;
							}

							if (var13.field1017.length() > 0) {
								var31 = var13.field1017;
							}
						} else {
							var33 = var13.field977;
							if (var32 && var13.field1023 != 0) {
								var33 = var13.field1023;
							}
						}

						if (var13.field1001 == 6 && field229) {
							var31 = "Please wait...";
							var33 = var13.field977;
						}

						if (TIJYBGAE.field1345 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1380 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method136(method168(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method136(method168(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method136(method168(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method136(method168(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method136(method168(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.field1007) {
								var30.method503(var41, var33, var13.field962 / 2 + var11, var34, var13.field974);
							} else {
								var30.method510(var41, var13.field974, var11, var33, var34);
							}

							var34 += var30.field1380;
						}
					} else if (var13.field1014 == 5) {
						GPLGZASP var42;
						if (method138(var13)) {
							var42 = var13.field1018;
						} else {
							var42 = var13.field961;
						}

						if (var42 != null) {
							var42.method220(var12, var11);
						}
					} else if (var13.field1014 == 6) {
						int var43 = ZGIYLEBF.field1489;
						int var44 = ZGIYLEBF.field1490;
						ZGIYLEBF.field1489 = var13.field962 / 2 + var11;
						ZGIYLEBF.field1490 = var13.field1031 / 2 + var12;
						int var45 = ZGIYLEBF.field1493[var13.field1011] * var13.field1010 >> 16;
						int var46 = ZGIYLEBF.field1494[var13.field1011] * var13.field1010 >> 16;
						boolean var47 = method138(var13);
						int var48;
						if (var47) {
							var48 = var13.field982;
						} else {
							var48 = var13.field981;
						}

						JJMVUSJJ var49;
						if (var48 == -1) {
							var49 = var13.method345(-1, -1, var47);
						} else {
							XTKQUJNF var50 = XTKQUJNF.field1432[var48];
							var49 = var13.method345(var50.field1434[var13.field967], var50.field1435[var13.field967], var47);
						}

						if (var49 != null) {
							var49.method321(0, var13.field1012, 0, var13.field1011, 0, var45, var46);
						}

						ZGIYLEBF.field1489 = var43;
						ZGIYLEBF.field1490 = var44;
					} else {
						if (var13.field1014 == 7) {
							UOINBUQD var51 = var13.field1032;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1031; var53++) {
								for (int var54 = 0; var54 < var13.field962; var54++) {
									if (var13.field989[var52] > 0) {
										IXFCVZPT var55 = IXFCVZPT.method285(var13.field989[var52] - 1);
										String var56 = String.valueOf(var55.field783);
										if (var55.field752 || var13.field990[var52] != 1) {
											var56 = var56 + " x" + method193(var13.field990[var52]);
										}

										int var57 = (var13.field1006 + 115) * var54 + var11;
										int var58 = (var13.field970 + 12) * var53 + var12;
										if (var13.field1007) {
											var51.method503(var56, var13.field977, var13.field962 / 2 + var57, var58, var13.field974);
										} else {
											var51.method510(var56, var13.field974, var57, var13.field977, var58);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1014 == 8 && (field130 == var13.field963 || field114 == var13.field963 || field118 == var13.field963) && field210 == 100) {
							int var59 = 0;
							int var60 = 0;
							UOINBUQD var61 = field433;
							String var62 = var13.field969;
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

								int var65 = var61.method504(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1380 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field962 + var11 - var59 - 5;
							int var67 = var13.field1031 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg1.field962 + arg0) {
								var66 = arg1.field962 + arg0 - var59;
							}

							if (var60 + var67 > arg1.field1031 + arg2) {
								var67 = arg1.field1031 + arg2 - var60;
							}

							TIJYBGAE.method492(var59, var67, 0xFFFFA0, var60, var66);
							TIJYBGAE.method493(0, var59, var60, var67, var66);
							String var68 = var13.field969;
							int var69 = var61.field1380 + var67 + 2;
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

								var61.method510(var71, false, var66 + 3, 0, var69);
								var69 += var61.field1380 + 1;
							}
						}
					}
				}
			}

			TIJYBGAE.method489(var8, var5, var6, var7);
		}
	}

	@ObfuscatedName("client.y(I)V")
	public void method134() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field421);

		if (field177 != null) {
			System.out.println("Od-cycle:" + field177.field32);
		}

		System.out.println("loop-cycle:" + field292);
		System.out.println("draw-cycle:" + field166);
		System.out.println("ptype:" + field445);
		System.out.println("psize:" + field444);

		if (field139 != null) {
			field139.method199();
		}

		field1038 = true;
	}

	@ObfuscatedName("client.b(B)Ljava/awt/Component;")
	public final Component method135() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field1044 != null) {
			return field1044;
		}

		return this;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method136(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IIILVJDNWPCM;LIUVBENCV;)V")
	public final void method137(int arg0, int arg1, VJDNWPCM arg2, IUVBENCV arg3) {
		if ((arg1 & 0x8) != 0) {
			int var5 = arg3.method263();
			int var6 = arg3.method262();
			arg2.method204(field292, var6, var5);
			arg2.field551 = field292 + 300;
			arg2.field552 = arg3.method262();
			arg2.field553 = arg3.method245();
		}

		if ((arg1 & 0x20) != 0) {
			arg2.field534 = arg3.method252();
			if (arg2.field534.charAt(0) == '~') {
				arg2.field534 = arg2.field534.substring(1);
				method160(2, arg2.field534, arg2.field1402);
			} else if (field491 == arg2) {
				method160(2, arg2.field534, arg2.field1402);
			}

			arg2.field565 = 0;
			arg2.field560 = 0;
			arg2.field559 = 150;
		}

		if ((arg1 & 0x1) != 0) {
			int var7 = arg3.method272();
			int var8 = arg3.method245();
			int var9 = arg3.method264();
			int var10 = arg3.field733;

			if (arg2.field1402 != null && arg2.field1400) {
				long var11 = RSIGORUG.method452(arg2.field1402);
				boolean var13 = false;
				if (var8 <= 1) {
					for (int var14 = 0; var14 < field162; var14++) {
						if (field420[var14] == var11) {
							var13 = true;
							break;
						}
					}
				}

				if (!var13 && field442 == 0) {
					try {
						field212.field733 = 0;
						arg3.method254(var9, 0, field212.field732);
						field212.field733 = 0;
						String var15 = PMGJNHXQ.method383(var9, field212);
						var15 = XWTMFQHB.method544(var15);
						arg2.field534 = var15;
						arg2.field565 = var7 >> 8;
						arg2.field560 = var7 & 0xFF;
						arg2.field559 = 150;

						if (var8 == 2 || var8 == 3) {
							method160(1, var15, "@cr2@" + arg2.field1402);
						} else if (var8 == 1) {
							method160(1, var15, "@cr1@" + arg2.field1402);
						} else {
							method160(2, var15, arg2.field1402);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field733 = var9 + var10;
		}

		if ((arg1 & 0x40) != 0) {
			arg2.field554 = arg3.method271();
			if (arg2.field554 == 0xFFFF) {
				arg2.field554 = -1;
			}
		}

		if ((arg1 & 0x4) != 0) {
			int var17 = arg3.method273();
			if (var17 == 0xFFFF) {
				var17 = -1;
			}

			int var18 = arg3.method245();
			if (arg2.field543 == var17 && var17 != -1) {
				int var19 = XTKQUJNF.field1432[var17].field1446;
				if (var19 == 1) {
					arg2.field544 = 0;
					arg2.field545 = 0;
					arg2.field546 = var18;
					arg2.field547 = 0;
				}

				if (var19 == 2) {
					arg2.field547 = 0;
				}
			} else if (var17 == -1 || arg2.field543 == -1 || XTKQUJNF.field1432[var17].field1440 >= XTKQUJNF.field1432[arg2.field543].field1440) {
				arg2.field543 = var17;
				arg2.field544 = 0;
				arg2.field545 = 0;
				arg2.field546 = var18;
				arg2.field547 = 0;
				arg2.field540 = arg2.field523;
			}
		}

		if ((arg1 & 0x200) != 0) {
			arg2.field514 = arg3.method263();
			arg2.field516 = arg3.method245();
			arg2.field515 = arg3.method264();
			arg2.field517 = arg3.method264();
			arg2.field518 = arg3.method247() + field292;
			arg2.field519 = arg3.method271() + field292;
			arg2.field520 = arg3.method262();
			arg2.method200();
		}

		if ((arg1 & 0x400) != 0) {
			arg2.field529 = arg3.method272();
			int var20 = arg3.method279();
			arg2.field533 = var20 >> 16;
			arg2.field532 = (var20 & 0xFFFF) + field292;
			arg2.field530 = 0;
			arg2.field531 = 0;

			if (arg2.field532 > field292) {
				arg2.field530 = -1;
			}

			if (arg2.field529 == 0xFFFF) {
				arg2.field529 = -1;
			}
		}

		if ((arg1 & 0x80) != 0) {
			int var21 = arg3.method262();
			byte[] var22 = new byte[var21];
			IUVBENCV var23 = new IUVBENCV(var22);
			arg3.method281(var21, var22, 0);
			field265[arg0] = var23;
			arg2.method524(var23);
		}

		if ((arg1 & 0x2) != 0) {
			arg2.field521 = arg3.method272();
			arg2.field522 = arg3.method271();
		}

		if ((arg1 & 0x100) != 0) {
			int var24 = arg3.method264();
			int var25 = arg3.method262();
			arg2.method204(field292, var25, var24);
			arg2.field551 = field292 + 300;
			arg2.field552 = arg3.method262();
			arg2.field553 = arg3.method263();
		}
	}

	@ObfuscatedName("client.a(BLMIIVNBFU;)Z")
	public final boolean method138(MIIVNBFU arg0) {
		if (arg0.field995 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field995.length; var2++) {
			int var3 = method168(arg0, var2);
			int var4 = arg0.field1026[var2];
			if (arg0.field995[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field995[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field995[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.z(I)V")
	public static final void method139() {
		POACSVST.field1187 = true;
		ZGIYLEBF.field1484 = true;
		field487 = true;
		SNNOFNNG.field1292 = true;
		MCFQOEAW.field918 = true;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = JJMVUSJJ.field865[var7];
			int var13 = JJMVUSJJ.field866[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = JJMVUSJJ.field865[var8];
			int var16 = JJMVUSJJ.field866[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field104 = arg1 - var9;
		field105 = arg2 - var10;
		field106 = arg3 - var11;
		field107 = arg0;
		field108 = arg4;
	}

	@ObfuscatedName("client.a(IIILMIIVNBFU;IIII)V")
	public final void method141(int arg0, int arg1, int arg2, MIIVNBFU arg3, int arg4, int arg5, int arg6) {
		if (arg3.field1014 == 0 && arg3.field993 != null && !arg3.field998 && (arg6 >= arg0 && arg4 >= arg5 && arg6 <= arg3.field962 + arg0 && arg4 <= arg3.field1031 + arg5)) {
			int var8 = arg3.field993.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg3.field1016[var9] + arg0;
				int var11 = arg3.field996[var9] + arg5 - arg2;
				MIIVNBFU var12 = MIIVNBFU.method350(arg3.field993[var9]);
				var10 += var12.field985;
				var11 += var12.field964;
				if ((var12.field1002 >= 0 || var12.field1023 != 0) && arg6 >= var10 && arg4 >= var11 && arg6 < var12.field962 + var10 && arg4 < var12.field1031 + var11) {
					if (var12.field1002 >= 0) {
						field128 = var12.field1002;
					} else {
						field128 = var12.field963;
					}
				}

				if (var12.field1014 == 8 && arg6 >= var10 && arg4 >= var11 && arg6 < var12.field962 + var10 && arg4 < var12.field1031 + var11) {
					field364 = var12.field963;
				}

				if (var12.field1014 == 0) {
					method141(var10, arg1, var12.field980, var12, arg4, var11, arg6);

					if (var12.field1004 > var12.field1031) {
						method84(var12.field1031, var12.field1004, var11, var12.field962 + var10, arg6, var12, arg4, arg1);
					}
				} else {
					if (var12.field1001 == 1 && arg6 >= var10 && arg4 >= var11 && arg6 < var12.field962 + var10 && arg4 < var12.field1031 + var11) {
						boolean var13 = false;
						if (var12.field1020 != 0) {
							var13 = method72(var12);
						}

						if (!var13) {
							field477[field388] = var12.field1024;
							field327[field388] = 315;
							field326[field388] = var12.field963;
							field388++;
						}
					}

					if (var12.field1001 == 2 && field82 == 0 && arg6 >= var10 && arg4 >= var11 && arg6 < var12.field962 + var10 && arg4 < var12.field1031 + var11) {
						String var14 = var12.field971;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field477[field388] = var14 + " @gre@" + var12.field1021;
						field327[field388] = 358;
						field326[field388] = var12.field963;
						field388++;
					}

					if (var12.field1001 == 3 && arg6 >= var10 && arg4 >= var11 && arg6 < var12.field962 + var10 && arg4 < var12.field1031 + var11) {
						field477[field388] = "Close";

						if (arg1 == 3) {
							field327[field388] = 819;
						} else {
							field327[field388] = 877;
						}

						field326[field388] = var12.field963;
						field388++;
					}

					if (var12.field1001 == 4 && arg6 >= var10 && arg4 >= var11 && arg6 < var12.field962 + var10 && arg4 < var12.field1031 + var11) {
						field477[field388] = var12.field1024;
						field327[field388] = 776;
						field326[field388] = var12.field963;
						field388++;
					}

					if (var12.field1001 == 5 && arg6 >= var10 && arg4 >= var11 && arg6 < var12.field962 + var10 && arg4 < var12.field1031 + var11) {
						field477[field388] = var12.field1024;
						field327[field388] = 871;
						field326[field388] = var12.field963;
						field388++;
					}

					if (var12.field1001 == 6 && !field229 && arg6 >= var10 && arg4 >= var11 && arg6 < var12.field962 + var10 && arg4 < var12.field1031 + var11) {
						field477[field388] = var12.field1024;
						field327[field388] = 967;
						field326[field388] = var12.field963;
						field388++;
					}

					if (var12.field1014 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1031; var16++) {
							for (int var17 = 0; var17 < var12.field962; var17++) {
								int var18 = (var12.field1006 + 32) * var17 + var10;
								int var19 = (var12.field970 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1027[var15];
									var19 += var12.field978[var15];
								}

								if (arg6 >= var18 && arg4 >= var19 && arg6 < var18 + 32 && arg4 < var19 + 32) {
									field148 = var15;
									field149 = var12.field963;

									if (var12.field989[var15] > 0) {
										IXFCVZPT var20 = IXFCVZPT.method285(var12.field989[var15] - 1);
										if (field252 == 1 && var12.field976) {
											if (field254 != var12.field963 || field253 != var15) {
												field477[field388] = "Use " + field256 + " with @lre@" + var20.field783;
												field327[field388] = 586;
												field328[field388] = var20.field768;
												field325[field388] = var15;
												field326[field388] = var12.field963;
												field388++;
											}
										} else if (field82 != 1 || !var12.field976) {
											if (var12.field976) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field770 != null && var20.field770[var21] != null) {
														field477[field388] = var20.field770[var21] + " @lre@" + var20.field783;

														if (var21 == 3) {
															field327[field388] = 213;
														}

														if (var21 == 4) {
															field327[field388] = 245;
														}

														field328[field388] = var20.field768;
														field325[field388] = var15;
														field326[field388] = var12.field963;
														field388++;
													} else if (var21 == 4) {
														field477[field388] = "Drop @lre@" + var20.field783;
														field327[field388] = 245;
														field328[field388] = var20.field768;
														field325[field388] = var15;
														field326[field388] = var12.field963;
														field388++;
													}
												}
											}

											if (var12.field1005) {
												field477[field388] = "Use @lre@" + var20.field783;
												field327[field388] = 26;
												field328[field388] = var20.field768;
												field325[field388] = var15;
												field326[field388] = var12.field963;
												field388++;
											}

											if (var12.field976 && var20.field770 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field770[var22] != null) {
														field477[field388] = var20.field770[var22] + " @lre@" + var20.field783;

														if (var22 == 0) {
															field327[field388] = 80;
														}

														if (var22 == 1) {
															field327[field388] = 331;
														}

														if (var22 == 2) {
															field327[field388] = 426;
														}

														field328[field388] = var20.field768;
														field325[field388] = var15;
														field326[field388] = var12.field963;
														field388++;
													}
												}
											}

											if (var12.field1009 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1009[var23] != null) {
														field477[field388] = var12.field1009[var23] + " @lre@" + var20.field783;

														if (var23 == 0) {
															field327[field388] = 263;
														}

														if (var23 == 1) {
															field327[field388] = 898;
														}

														if (var23 == 2) {
															field327[field388] = 890;
														}

														if (var23 == 3) {
															field327[field388] = 139;
														}

														if (var23 == 4) {
															field327[field388] = 797;
														}

														field328[field388] = var20.field768;
														field325[field388] = var15;
														field326[field388] = var12.field963;
														field388++;
													}
												}
											}

											field477[field388] = "Examine @lre@" + var20.field783;
											field327[field388] = 1164;
											field328[field388] = var20.field768;
											field325[field388] = var15;
											field326[field388] = var12.field963;
											field388++;
										} else if ((field84 & 0x10) == 0x10) {
											field477[field388] = field85 + " @lre@" + var20.field783;
											field327[field388] = 931;
											field328[field388] = var20.field768;
											field325[field388] = var15;
											field326[field388] = var12.field963;
											field388++;
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

	@ObfuscatedName("client.a(ILMIIVNBFU;)V")
	public final void method142(MIIVNBFU arg0) {
		int var2 = arg0.field1020;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field499 == 0) {
				arg0.field969 = "Loading friend list";
				arg0.field1001 = 0;
			} else if (var2 == 1 && field499 == 1) {
				arg0.field969 = "Connecting to friendserver";
				arg0.field1001 = 0;
			} else if (var2 == 2 && field499 != 2) {
				arg0.field969 = "Please wait...";
				arg0.field1001 = 0;
			} else {
				int var3 = field498;
				if (field499 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field969 = "";
					arg0.field1001 = 0;
				} else {
					arg0.field969 = field190[var2];
					arg0.field1001 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field498;
			if (field499 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field969 = "";
				arg0.field1001 = 0;
			} else {
				if (field381[var2] == 0) {
					arg0.field969 = "@red@Offline";
				} else if (field381[var2] < 200) {
					if (field381[var2] == field484) {
						arg0.field969 = "@gre@World" + (field381[var2] - 9);
					} else {
						arg0.field969 = "@yel@World" + (field381[var2] - 9);
					}
				} else if (field381[var2] == field484) {
					arg0.field969 = "@gre@Classic" + (field381[var2] - 219);
				} else {
					arg0.field969 = "@yel@Classic" + (field381[var2] - 219);
				}

				arg0.field1001 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field498;
			if (field499 != 2) {
				var5 = 0;
			}

			arg0.field1004 = var5 * 15 + 20;
			if (arg0.field1004 <= arg0.field1031) {
				arg0.field1004 = arg0.field1031 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field499 == 0) {
				arg0.field969 = "Loading ignore list";
				arg0.field1001 = 0;
			} else if (var2 == 1 && field499 == 0) {
				arg0.field969 = "Please wait...";
				arg0.field1001 = 0;
			} else {
				int var6 = field162;
				if (field499 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field969 = "";
					arg0.field1001 = 0;
				} else {
					arg0.field969 = RSIGORUG.method456(RSIGORUG.method453(field420[var2]));
					arg0.field1001 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1004 = field162 * 15 + 20;
			if (arg0.field1004 <= arg0.field1031) {
				arg0.field1004 = arg0.field1031 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1011 = 150;
			arg0.field1012 = (int) (Math.sin(field292 / 40.0D) * 256.0D) & 0x7FF;

			if (field102) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field61[var7];
					if (var8 >= 0 && !WINORGIB.field1418[var8].method527()) {
						return;
					}
				}

				field102 = false;
				JJMVUSJJ[] var9 = new JJMVUSJJ[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field61[var11];
					if (var12 >= 0) {
						var9[var10++] = WINORGIB.field1418[var12].method528();
					}
				}

				JJMVUSJJ var13 = new JJMVUSJJ(var9, var10);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field370[var14] != 0) {
						var13.method314(field156[var14][0], field156[var14][field370[var14]]);

						if (var14 == 1) {
							var13.method314(field304[0], field304[field370[var14]]);
						}
					}
				}

				var13.method307();
				var13.method308(XTKQUJNF.field1432[field491.field535].field1434[0]);
				var13.method317(64, 850, -30, -50, -30, true);
				arg0.field983 = 5;
				arg0.field984 = 0;
				MIIVNBFU.method346(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field243 == null) {
				field243 = arg0.field961;
				field244 = arg0.field1018;
			}

			if (field310) {
				arg0.field961 = field244;
			} else {
				arg0.field961 = field243;
			}
		} else if (var2 == 325) {
			if (field243 == null) {
				field243 = arg0.field961;
				field244 = arg0.field1018;
			}

			if (field310) {
				arg0.field961 = field243;
			} else {
				arg0.field961 = field244;
			}
		} else if (var2 == 600) {
			arg0.field969 = field307;
			if (field292 % 20 < 10) {
				arg0.field969 = arg0.field969 + "|";
			} else {
				arg0.field969 = arg0.field969 + " ";
			}
		} else if (var2 == 620) {
			if (field197 < 1) {
				arg0.field969 = "";
			} else if (field418) {
				arg0.field977 = 0xFF0000;
				arg0.field969 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field977 = 0xFFFFFF;
				arg0.field969 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field63 - field363;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field969 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field195 == 0) {
				arg0.field969 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field195 <= field63) {
				arg0.field969 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method143(field195);
			} else {
				int var17 = field63 + 14 - field195;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field969 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method143(field195) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field361 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field361 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field361 + " unread messages";
			}

			arg0.field969 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field383 > 0 && field383 <= field63 + 10) {
				arg0.field969 = "Last password change:\\n@gre@" + method143(field383);
			} else {
				arg0.field969 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field295 > 2 && !field486) {
				arg0.field969 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field295 > 2) {
				arg0.field969 = "\\n\\nYou have @gre@" + field295 + "@yel@ days of\\nmember credit remaining.";
			} else if (field295 > 0) {
				arg0.field969 = "You have @gre@" + field295 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field969 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field295 > 2 && !field486) {
				arg0.field969 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field295 > 0) {
				arg0.field969 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field969 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field195 > field63) {
				arg0.field969 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field969 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public final String method143(int arg0) {
		if (arg0 > field63 + 10) {
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

	@ObfuscatedName("client.A(I)V")
	public static final void method144() {
		POACSVST.field1187 = false;
		ZGIYLEBF.field1484 = false;
		field487 = false;
		SNNOFNNG.field1292 = false;
		MCFQOEAW.field918 = false;
	}

	@ObfuscatedName("client.B(I)V")
	public final void method145() {
		field91.method205();
		ZGIYLEBF.field1495 = field221;
		field429.method463(0, 0);

		if (field136) {
			field434.method502(0, 239, field378, 40);
			field434.method502(128, 239, field430 + "*", 60);
		} else if (field191 == 1) {
			field434.method502(0, 239, "Enter amount:", 40);
			field434.method502(128, 239, field96 + "*", 60);
		} else if (field191 == 2) {
			field434.method502(0, 239, "Enter name:", 40);
			field434.method502(128, 239, field96 + "*", 60);
		} else if (field191 == 3) {
			if (field96 != field131) {
				method188(field96);
				field131 = field96;
			}

			UOINBUQD var1 = field433;
			TIJYBGAE.method489(77, 0, 0, 463);

			for (int var2 = 0; var2 < field132; var2++) {
				int var3 = var2 * 14 + 18 - field135;
				if (var3 > 0 && var3 < 110) {
					var1.method502(0, 239, field133[var2], var3);
				}
			}

			TIJYBGAE.method488();

			if (field132 > 5) {
				method95(field135, 77, field132 * 14 + 7, 463, 0);
			}

			if (field96.length() == 0) {
				field434.method502(255, 239, "Enter object name", 40);
			} else if (field132 == 0) {
				field434.method502(0, 239, "No matching objects found, please shorten search", 40);
			}

			var1.method502(0, 239, field96 + "*", 90);
			TIJYBGAE.method495(77, 0, 0, 479);
		} else if (field475 != null) {
			field434.method502(0, 239, field475, 40);
			field434.method502(128, 239, "Click to continue", 60);
		} else if (field275 != -1) {
			method133(0, MIIVNBFU.method350(field275), 0, 0);
		} else if (field379 == -1) {
			UOINBUQD var4 = field433;
			int var5 = 0;
			TIJYBGAE.method489(77, 0, 0, 463);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field339[var6] != null) {
					int var7 = field337[var6];
					int var8 = field157 + 70 - var5 * 14;
					String var9 = field338[var6];
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
							var4.method506(0, field339[var6], 4, var8);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field301 == 0 || field301 == 1 && method180(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field296[0].method463(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field296[1].method463(var8 - 12, var11);
								var11 += 14;
							}

							var4.method506(0, var9 + ":", var11, var8);
							var11 += var4.method504(var9) + 8;
							var4.method506(255, field339[var6], var11, var8);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field72 == 0 && (var7 == 7 || field365 == 0 || field365 == 1 && method180(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method506(0, "From", var12, var8);
							int var14 = var12 + var4.method504("From ");
							if (var10 == 1) {
								field296[0].method463(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field296[1].method463(var8 - 12, var14);
								var14 += 14;
							}

							var4.method506(0, var9 + ":", var14, var8);
							var14 += var4.method504(var9) + 8;
							var4.method506(0x800000, field339[var6], var14, var8);
						}

						var5++;
					}

					if (var7 == 4 && (field279 == 0 || field279 == 1 && method180(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method506(0x800080, var9 + " " + field339[var6], 4, var8);
						}

						var5++;
					}

					if (var7 == 5 && field72 == 0 && field365 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method506(0x800000, field339[var6], 4, var8);
						}

						var5++;
					}

					if (var7 == 6 && field72 == 0 && field365 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method506(0, "To " + var9 + ":", 4, var8);
							var4.method506(0x800000, field339[var6], var4.method504("To " + var9) + 12, var8);
						}

						var5++;
					}

					if (var7 == 8 && (field279 == 0 || field279 == 1 && method180(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method506(0x7E3200, var9 + " " + field339[var6], 4, var8);
						}

						var5++;
					}
				}
			}

			TIJYBGAE.method488();
			field290 = var5 * 14 + 7;
			if (field290 < 78) {
				field290 = 78;
			}

			method95(field290 - field157 - 77, 77, field290, 463, 0);
			String var13;
			if (field491 == null || field491.field1402 == null) {
				var13 = RSIGORUG.method456(field386);
			} else {
				var13 = field491.field1402;
			}

			var4.method506(0, var13 + ":", 4, 90);
			var4.method506(255, field389 + "*", var4.method504(var13 + ": ") + 6, 90);
			TIJYBGAE.method495(77, 0, 0, 479);
		} else {
			method133(0, MIIVNBFU.method350(field379), 0, 0);
		}

		if (field192 && field123 == 2) {
			method71();
		}

		field91.method206(17, field1041, 357);
		field90.method205();
		ZGIYLEBF.field1495 = field223;
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method146(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg0 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field188[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg0 & 0x7F;
			int var9 = (128 - var7) * field366[var6][var4][var5] + field366[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field366[var6][var4][var5 + 1] + field366[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method147() {
		if (field252 == 0 && field82 == 0) {
			field477[field388] = "Walk here";
			field327[field388] = 66;
			field325[field388] = field1049;
			field326[field388] = field1050;
			field388++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < JJMVUSJJ.field863; var2++) {
			int var3 = JJMVUSJJ.field864[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field233.method417(field182, var4, var5, var3) >= 0) {
					MCFQOEAW var8 = MCFQOEAW.method341(var7);
					if (var8.field922 != null) {
						var8 = var8.method332();
					}

					if (var8 == null) {
						continue;
					}

					if (field252 == 1) {
						field477[field388] = "Use " + field256 + " with @cya@" + var8.field944;
						field327[field388] = 124;
						field328[field388] = var3;
						field325[field388] = var4;
						field326[field388] = var5;
						field388++;
					} else if (field82 != 1) {
						if (var8.field957 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field957[var9] != null) {
									field477[field388] = var8.field957[var9] + " @cya@" + var8.field944;

									if (var9 == 0) {
										field327[field388] = 178;
									}

									if (var9 == 1) {
										field327[field388] = 638;
									}

									if (var9 == 2) {
										field327[field388] = 386;
									}

									if (var9 == 3) {
										field327[field388] = 463;
									}

									if (var9 == 4) {
										field327[field388] = 1901;
									}

									field328[field388] = var3;
									field325[field388] = var4;
									field326[field388] = var5;
									field388++;
								}
							}
						}

						field477[field388] = "Examine @cya@" + var8.field944;
						field327[field388] = 1881;
						field328[field388] = var8.field925 << 14;
						field325[field388] = var4;
						field326[field388] = var5;
						field388++;
					} else if ((field84 & 0x4) == 4) {
						field477[field388] = field85 + " @cya@" + var8.field944;
						field327[field388] = 584;
						field328[field388] = var3;
						field325[field388] = var4;
						field326[field388] = var5;
						field388++;
					}
				}

				if (var6 == 1) {
					KPZIZBER var10 = field213[var7];
					if (var10.field906.field1075 == 1 && (var10.field548 & 0x7F) == 0x40 && (var10.field549 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field214; var11++) {
							KPZIZBER var12 = field213[field215[var11]];
							if (var12 != null && var10 != var12 && var12.field906.field1075 == 1 && var10.field548 == var12.field548 && var10.field549 == var12.field549) {
								method167(field215[var11], var5, var4, var12.field906);
							}
						}

						for (int var13 = 0; var13 < field261; var13++) {
							VJDNWPCM var14 = field260[field262[var13]];
							if (var14 != null && var10.field548 == var14.field548 && var10.field549 == var14.field549) {
								method156(var14, var5, var4, field262[var13]);
							}
						}
					}

					method167(var7, var5, var4, var10.field906);
				}

				if (var6 == 0) {
					VJDNWPCM var15 = field260[var7];
					if ((var15.field548 & 0x7F) == 0x40 && (var15.field549 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field214; var16++) {
							KPZIZBER var17 = field213[field215[var16]];
							if (var17 != null && var17.field906.field1075 == 1 && var15.field548 == var17.field548 && var15.field549 == var17.field549) {
								method167(field215[var16], var5, var4, var17.field906);
							}
						}

						for (int var18 = 0; var18 < field261; var18++) {
							VJDNWPCM var19 = field260[field262[var18]];
							if (var19 != null && var15 != var19 && var15.field548 == var19.field548 && var15.field549 == var19.field549) {
								method156(var19, var5, var4, field262[var18]);
							}
						}
					}

					method156(var15, var5, var4, var7);
				}

				if (var6 == 3) {
					ZEEWTYXI var20 = field160[field182][var4][var5];
					if (var20 != null) {
						for (GXJXRNJQ var21 = (GXJXRNJQ) var20.method581(); var21 != null; var21 = (GXJXRNJQ) var20.method583()) {
							IXFCVZPT var22 = IXFCVZPT.method285(var21.field700);
							if (field252 == 1) {
								field477[field388] = "Use " + field256 + " with @lre@" + var22.field783;
								field327[field388] = 450;
								field328[field388] = var21.field700;
								field325[field388] = var4;
								field326[field388] = var5;
								field388++;
							} else if (field82 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field769 != null && var22.field769[var23] != null) {
										field477[field388] = var22.field769[var23] + " @lre@" + var22.field783;

										if (var23 == 0) {
											field327[field388] = 738;
										}

										if (var23 == 1) {
											field327[field388] = 794;
										}

										if (var23 == 2) {
											field327[field388] = 54;
										}

										if (var23 == 3) {
											field327[field388] = 409;
										}

										if (var23 == 4) {
											field327[field388] = 321;
										}

										field328[field388] = var21.field700;
										field325[field388] = var4;
										field326[field388] = var5;
										field388++;
									} else if (var23 == 2) {
										field477[field388] = "Take @lre@" + var22.field783;
										field327[field388] = 54;
										field328[field388] = var21.field700;
										field325[field388] = var4;
										field326[field388] = var5;
										field388++;
									}
								}

								field477[field388] = "Examine @lre@" + var22.field783;
								field327[field388] = 1065;
								field328[field388] = var21.field700;
								field325[field388] = var4;
								field326[field388] = var5;
								field388++;
							} else if ((field84 & 0x1) == 1) {
								field477[field388] = field85 + " @lre@" + var22.field783;
								field327[field388] = 524;
								field328[field388] = var21.field700;
								field325[field388] = var4;
								field326[field388] = var5;
								field388++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method148() {
		int var1 = 5;
		field372[8] = 0;
		int var2 = 0;
		while (field372[8] == 0) {
			String var3 = "Unknown problem";
			method125("Connecting to web server", 20);

			try {
				DataInputStream var4 = method166("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 376);
				IUVBENCV var5 = new IUVBENCV(new byte[40]);
				var4.readFully(var5.field732, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field372[var6] = var5.method250();
				}

				int var7 = var5.method250();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field372[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field372[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field372[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field372[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field372[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field372[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method125("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method125(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field377 = !field377;
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method149(int arg0) {
		if (!field487) {
			for (int var2 = 0; var2 < field283.length; var2++) {
				int var3 = field283[var2];
				if (ZGIYLEBF.field1503[var3] >= arg0) {
					SFVBUBEZ var4 = ZGIYLEBF.field1497[var3];
					int var5 = var4.field1277 * var4.field1276 - 1;
					int var6 = field382 * var4.field1276 * 2;
					byte[] var7 = var4.field1274;
					byte[] var8 = field336;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1274 = var8;
					field336 = var7;
					ZGIYLEBF.method592(var3);
					field251++;
					if (field251 > 90) {
						field251 = 0;
						field64.method234(137);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method150(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field162; var3++) {
				if (field420[var3] == arg0) {
					field162--;
					field323 = true;

					for (int var4 = var3; var4 < field162; var4++) {
						field420[var4] = field420[var4 + 1];
					}

					field64.method234(240);
					field64.method241(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LIUVBENCV;II)V")
	public final void method151(IUVBENCV arg0, int arg1) {
		for (int var3 = 0; var3 < field263; var3++) {
			int var4 = field264[var3];
			VJDNWPCM var5 = field260[var4];
			int var6 = arg0.method245();
			if ((var6 & 0x10) != 0) {
				var6 += arg0.method245() << 8;
			}

			method137(var4, var6, var5, arg0);
		}
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public static final String method152(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method153() {
		field88.method205();
		ZGIYLEBF.field1495 = field222;
		field427.method463(0, 0);

		if (field183 != -1) {
			method133(0, MIIVNBFU.method350(field183), 0, 0);
		} else if (field300[field464] != -1) {
			method133(0, MIIVNBFU.method350(field300[field464]), 0, 0);
		}

		if (field192 && field123 == 1) {
			method71();
		}

		field88.method206(553, field1041, 205);
		field90.method205();
		ZGIYLEBF.field1495 = field223;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method154() {
		for (FNTVIFXL var1 = (FNTVIFXL) field367.method580(); var1 != null; var1 = (FNTVIFXL) field367.method582()) {
			if (field182 != var1.field658 || var1.field662) {
				var1.method602();
			} else if (field292 >= var1.field657) {
				var1.method213(field382);

				if (var1.field662) {
					var1.method602();
				} else {
					field233.method398(60, var1.field659, var1.field658, -1, var1.field660, false, var1, var1.field661, 0);
				}
			}
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method155() {
		if (field1055 == 1) {
			if (field1056 >= 539 && field1056 <= 573 && field1057 >= 169 && field1057 < 205 && field300[0] != -1) {
				field323 = true;
				field464 = 0;
				field100 = true;
			}

			if (field1056 >= 569 && field1056 <= 599 && field1057 >= 168 && field1057 < 205 && field300[1] != -1) {
				field323 = true;
				field464 = 1;
				field100 = true;
			}

			if (field1056 >= 597 && field1056 <= 627 && field1057 >= 168 && field1057 < 205 && field300[2] != -1) {
				field323 = true;
				field464 = 2;
				field100 = true;
			}

			if (field1056 >= 625 && field1056 <= 669 && field1057 >= 168 && field1057 < 203 && field300[3] != -1) {
				field323 = true;
				field464 = 3;
				field100 = true;
			}

			if (field1056 >= 666 && field1056 <= 696 && field1057 >= 168 && field1057 < 205 && field300[4] != -1) {
				field323 = true;
				field464 = 4;
				field100 = true;
			}

			if (field1056 >= 694 && field1056 <= 724 && field1057 >= 168 && field1057 < 205 && field300[5] != -1) {
				field323 = true;
				field464 = 5;
				field100 = true;
			}

			if (field1056 >= 722 && field1056 <= 756 && field1057 >= 169 && field1057 < 205 && field300[6] != -1) {
				field323 = true;
				field464 = 6;
				field100 = true;
			}

			if (field1056 >= 540 && field1056 <= 574 && field1057 >= 466 && field1057 < 502 && field300[7] != -1) {
				field323 = true;
				field464 = 7;
				field100 = true;
			}

			if (field1056 >= 572 && field1056 <= 602 && field1057 >= 466 && field1057 < 503 && field300[8] != -1) {
				field323 = true;
				field464 = 8;
				field100 = true;
			}

			if (field1056 >= 599 && field1056 <= 629 && field1057 >= 466 && field1057 < 503 && field300[9] != -1) {
				field323 = true;
				field464 = 9;
				field100 = true;
			}

			if (field1056 >= 627 && field1056 <= 671 && field1057 >= 467 && field1057 < 502 && field300[10] != -1) {
				field323 = true;
				field464 = 10;
				field100 = true;
			}

			if (field1056 >= 669 && field1056 <= 699 && field1057 >= 466 && field1057 < 503 && field300[11] != -1) {
				field323 = true;
				field464 = 11;
				field100 = true;
			}

			if (field1056 >= 696 && field1056 <= 726 && field1057 >= 466 && field1057 < 503 && field300[12] != -1) {
				field323 = true;
				field464 = 12;
				field100 = true;
			}

			if (field1056 >= 724 && field1056 <= 758 && field1057 >= 466 && field1057 < 502 && field300[13] != -1) {
				field323 = true;
				field464 = 13;
				field100 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZLVJDNWPCM;III)V")
	public final void method156(VJDNWPCM arg0, int arg1, int arg2, int arg3) {
		if (field491 != arg0 && field388 < 400) {
			String var5;
			if (arg0.field1398 == 0) {
				var5 = arg0.field1402 + method179(field491.field1408, arg0.field1408) + " (level-" + arg0.field1408 + ")";
			} else {
				var5 = arg0.field1402 + " (skill-" + arg0.field1398 + ")";
			}

			if (field252 == 1) {
				field477[field388] = "Use " + field256 + " with @whi@" + var5;
				field327[field388] = 766;
				field328[field388] = arg3;
				field325[field388] = arg2;
				field326[field388] = arg1;
				field388++;
			} else if (field82 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field216[var6] != null) {
						field477[field388] = field216[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field216[var6].equalsIgnoreCase("attack")) {
							if (arg0.field1408 > field491.field1408) {
								var7 = 2000;
							}

							if (field491.field1411 != 0 && arg0.field1411 != 0) {
								if (field491.field1411 == arg0.field1411) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field217[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field327[field388] = var7 + 665;
						}

						if (var6 == 1) {
							field327[field388] = var7 + 429;
						}

						if (var6 == 2) {
							field327[field388] = var7 + 42;
						}

						if (var6 == 3) {
							field327[field388] = var7 + 663;
						}

						if (var6 == 4) {
							field327[field388] = var7 + 634;
						}

						field328[field388] = arg3;
						field325[field388] = arg2;
						field326[field388] = arg1;
						field388++;
					}
				}
			} else if ((field84 & 0x8) == 8) {
				field477[field388] = field85 + " @whi@" + var5;
				field327[field388] = 618;
				field328[field388] = arg3;
				field325[field388] = arg2;
				field326[field388] = arg1;
				field388++;
			}

			for (int var8 = 0; var8 < field388; var8++) {
				if (field327[var8] == 66) {
					field477[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.c(JI)V")
	public final void method157(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field498; var3++) {
				if (field194[var3] == arg0) {
					field498--;
					field323 = true;

					for (int var4 = var3; var4 < field498; var4++) {
						field190[var4] = field190[var4 + 1];
						field381[var4] = field381[var4 + 1];
						field194[var4] = field194[var4 + 1];
					}

					field64.method234(19);
					field64.method241(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.F(I)Ljava/net/Socket;")
	public final Socket method158(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method159(String arg0) {
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

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void method160(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && field379 != -1) {
			field475 = arg1;
			field1055 = 0;
		}

		if (field275 == -1) {
			field67 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field337[var4] = field337[var4 - 1];
			field338[var4] = field338[var4 - 1];
			field339[var4] = field339[var4 - 1];
		}

		field337[0] = arg0;
		field338[0] = arg2;
		field339[0] = arg1;
	}

	@ObfuscatedName("client.G(I)V")
	public final void method161() {
		for (int var1 = -1; var1 < field261; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field259;
			} else {
				var2 = field262[var1];
			}

			VJDNWPCM var3 = field260[var2];
			if (var3 != null && var3.field559 > 0) {
				var3.field559--;
				if (var3.field559 == 0) {
					var3.field534 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field214; var4++) {
			int var5 = field215[var4];
			KPZIZBER var6 = field213[var5];
			if (var6 != null && var6.field559 > 0) {
				var6.field559--;
				if (var6.field559 == 0) {
					var6.field534 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LJQXBQBEJ;I)V")
	public final void method162(JQXBQBEJ arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field878 == 0) {
			var2 = field233.method413(arg0.field877, arg0.field879, arg0.field880);
		}

		if (arg0.field878 == 1) {
			var2 = field233.method414(arg0.field880, arg0.field879, arg0.field877);
		}

		if (arg0.field878 == 2) {
			var2 = field233.method415(arg0.field877, arg0.field879, arg0.field880);
		}

		if (arg0.field878 == 3) {
			var2 = field233.method416(arg0.field877, arg0.field879, arg0.field880);
		}

		if (var2 != 0) {
			int var6 = field233.method417(arg0.field877, arg0.field879, arg0.field880, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field872 = var3;
		arg0.field874 = var4;
		arg0.field873 = var5;
	}

	@ObfuscatedName("client.a(ILIUVBENCV;Z)V")
	public final void method163(int arg0, IUVBENCV arg1) {
		if (arg0 == 112) {
			int var3 = arg1.method272();
			int var4 = arg1.method264();
			int var5 = (var4 >> 4 & 0x7) + field349;
			int var6 = (var4 & 0x7) + field350;
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				ZEEWTYXI var7 = field160[field182][var5][var6];
				if (var7 != null) {
					for (GXJXRNJQ var8 = (GXJXRNJQ) var7.method580(); var8 != null; var8 = (GXJXRNJQ) var7.method582()) {
						if ((var3 & 0x7FFF) == var8.field700) {
							var8.method602();
							break;
						}
					}

					if (var7.method580() == null) {
						field160[field182][var5][var6] = null;
					}

					method97(var5, var6);
				}
			}
		} else if (arg0 == 114) {
			int var9 = arg1.method245();
			int var10 = (var9 >> 4 & 0x7) + field349;
			int var11 = (var9 & 0x7) + field350;
			int var12 = arg1.method247();
			int var13 = arg1.method247();
			int var14 = arg1.method247();
			if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
				ZEEWTYXI var15 = field160[field182][var10][var11];
				if (var15 != null) {
					for (GXJXRNJQ var16 = (GXJXRNJQ) var15.method580(); var16 != null; var16 = (GXJXRNJQ) var15.method582()) {
						if ((var12 & 0x7FFF) == var16.field700 && var16.field701 == var13) {
							var16.field701 = var14;
							break;
						}
					}

					method97(var10, var11);
				}
			}
		} else if (arg0 == 1) {
			int var17 = arg1.method273();
			int var18 = arg1.method263();
			int var19 = (var18 >> 4 & 0x7) + field349;
			int var20 = (var18 & 0x7) + field350;
			int var21 = arg1.method271();
			int var22 = arg1.method271();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && field299 != var17) {
				GXJXRNJQ var23 = new GXJXRNJQ();
				var23.field700 = var21;
				var23.field701 = var22;

				if (field160[field182][var19][var20] == null) {
					field160[field182][var19][var20] = new ZEEWTYXI();
				}

				field160[field182][var19][var20].method577(var23);
				method97(var19, var20);
			}
		} else if (arg0 == 75) {
			int var24 = arg1.method247();
			int var25 = arg1.method264();
			int var26 = var25 >> 2;
			int var27 = var25 & 0x3;
			int var28 = field236[var26];
			int var29 = arg1.method262();
			int var30 = (var29 >> 4 & 0x7) + field349;
			int var31 = (var29 & 0x7) + field350;
			if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
				method177(var30, var26, var31, var28, var27, 0, field182, -1, var24);
			}
		} else if (arg0 == 39) {
			int var32 = arg1.method245();
			int var33 = (var32 >> 4 & 0x7) + field349;
			int var34 = (var32 & 0x7) + field350;
			int var35 = arg1.method247();
			int var36 = arg1.method245();
			int var37 = arg1.method247();
			if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
				var33 = var33 * 128 + 64;
				var34 = var34 * 128 + 64;
				FNTVIFXL var38 = new FNTVIFXL(method146(var34, field182, var33) - var36, var35, field182, var34, field292, var33, var37);
				field367.method577(var38);
			}
		} else if (arg0 == 125) {
			int var39 = arg1.method272();
			int var40 = arg1.method245();
			int var41 = (var40 >> 4 & 0x7) + field349;
			int var42 = (var40 & 0x7) + field350;
			int var43 = arg1.method271();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
				GXJXRNJQ var44 = new GXJXRNJQ();
				var44.field700 = var39;
				var44.field701 = var43;

				if (field160[field182][var41][var42] == null) {
					field160[field182][var41][var42] = new ZEEWTYXI();
				}

				field160[field182][var41][var42].method577(var44);
				method97(var41, var42);
			}
		} else if (arg0 == 115) {
			int var45 = arg1.method273();
			int var46 = arg1.method263();
			int var47 = (var46 >> 4 & 0x7) + field349;
			int var48 = (var46 & 0x7) + field350;
			int var49 = arg1.method245();
			int var50 = var49 >> 2;
			int var51 = var49 & 0x3;
			int var52 = field236[var50];
			if (var47 >= 0 && var48 >= 0 && var47 < 103 && var48 < 103) {
				int var53 = field366[field182][var47][var48];
				int var54 = field366[field182][var47 + 1][var48];
				int var55 = field366[field182][var47 + 1][var48 + 1];
				int var56 = field366[field182][var47][var48 + 1];
				if (var52 == 0) {
					ZNTQHFZT var57 = field233.method409(var48, field182, var47);
					if (var57 != null) {
						int var58 = var57.field1517 >> 14 & 0x7FFF;
						if (var50 == 2) {
							var57.field1515 = new YUINHFWF(var56, var55, var45, 2, false, var54, var53, var58, var51 + 4);
							var57.field1516 = new YUINHFWF(var56, var55, var45, 2, false, var54, var53, var58, var51 + 1 & 0x3);
						} else {
							var57.field1515 = new YUINHFWF(var56, var55, var45, var50, false, var54, var53, var58, var51);
						}
					}
				}

				if (var52 == 1) {
					EMIYNZVR var59 = field233.method410(var48, var47, field182);
					if (var59 != null) {
						var59.field637 = new YUINHFWF(var56, var55, var45, 4, false, var54, var53, var59.field638 >> 14 & 0x7FFF, 0);
					}
				}

				if (var52 == 2) {
					EPBBXAMF var60 = field233.method411(var47, var48, field182);

					if (var50 == 11) {
						var50 = 10;
					}

					if (var60 != null) {
						var60.field644 = new YUINHFWF(var56, var55, var45, var50, false, var54, var53, var60.field652 >> 14 & 0x7FFF, var51);
					}
				}

				if (var52 == 3) {
					XJTZVEUK var61 = field233.method412(var47, var48, field182);
					if (var61 != null) {
						var61.field1428 = new YUINHFWF(var56, var55, var45, 22, false, var54, var53, var61.field1429 >> 14 & 0x7FFF, var51);
					}
				}
			}
		} else if (arg0 == 68) {
			int var62 = arg1.method245();
			int var63 = (var62 >> 4 & 0x7) + field349;
			int var64 = (var62 & 0x7) + field350;
			int var65 = var63 + arg1.method246();
			int var66 = var64 + arg1.method246();
			int var67 = arg1.method248();
			int var68 = arg1.method247();
			int var69 = arg1.method245() * 4;
			int var70 = arg1.method245() * 4;
			int var71 = arg1.method247();
			int var72 = arg1.method247();
			int var73 = arg1.method245();
			int var74 = arg1.method245();
			if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104 && var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104 && var68 != 0xFFFF) {
				var63 = var63 * 128 + 64;
				var64 = var64 * 128 + 64;
				var65 = var65 * 128 + 64;
				var66 = var66 * 128 + 64;
				HMUVVYST var75 = new HMUVVYST(field292 + var71, method146(var64, field182, var63) - var69, field292 + var72, var73, var67, var74, var70, field182, var64, var68, var63);
				var75.method228(var65, method146(var66, field182, var65) - var70, field292 + var71, var66);
				field371.method577(var75);
			}
		} else {
			if (arg0 == 55) {
				int var76 = arg1.method245();
				int var77 = (var76 >> 4 & 0x7) + field349;
				int var78 = (var76 & 0x7) + field350;
				int var79 = arg1.method247();
				int var80 = arg1.method245();
				int var81 = var80 >> 4 & 0xF;
				int var82 = var80 & 0x7;
				if (field491.field537[0] >= var77 - var81 && field491.field537[0] <= var77 + var81 && field491.field538[0] >= var78 - var81 && field491.field538[0] <= var78 + var81 && field273 && !field487 && field419 < 50) {
					field250[field419] = var79;
					field77[field419] = var82;
					field280[field419] = QJLULATA.field1260[var79];
					field419++;
				}
			}

			if (arg0 == 132) {
				int var83 = arg1.method245();
				int var84 = var83 >> 2;
				int var85 = var83 & 0x3;
				int var86 = field236[var84];
				int var87 = arg1.method263();
				int var88 = (var87 >> 4 & 0x7) + field349;
				int var89 = (var87 & 0x7) + field350;
				if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
					method177(var88, var84, var89, var86, var85, 0, field182, -1, -1);
				}
			} else if (arg0 == 137) {
				int var90 = arg1.method247();
				int var91 = arg1.method264();
				int var92 = (var91 >> 4 & 0x7) + field349;
				int var93 = (var91 & 0x7) + field350;
				byte var94 = arg1.method265();
				byte var95 = arg1.method267();
				int var96 = arg1.method273();
				byte var97 = arg1.method267();
				int var98 = arg1.method271();
				int var99 = arg1.method263();
				int var100 = var99 >> 2;
				int var101 = var99 & 0x3;
				int var102 = field236[var100];
				int var103 = arg1.method271();
				byte var104 = arg1.method266();
				VJDNWPCM var105;
				if (field299 == var90) {
					var105 = field491;
				} else {
					var105 = field260[var90];
				}

				if (var105 != null) {
					MCFQOEAW var106 = MCFQOEAW.method341(var98);
					int var107 = field366[field182][var92][var93];
					int var108 = field366[field182][var92 + 1][var93];
					int var109 = field366[field182][var92 + 1][var93 + 1];
					int var110 = field366[field182][var92][var93 + 1];
					JJMVUSJJ var111 = var106.method338(var100, var101, var107, var108, var109, var110, -1);
					if (var111 != null) {
						method177(var92, 0, var93, var102, 0, var103 + 1, field182, var96 + 1, -1);
						var105.field1415 = field292 + var103;
						var105.field1416 = field292 + var96;
						var105.field1407 = var111;
						int var112 = var106.field914;
						int var113 = var106.field947;
						if (var101 == 1 || var101 == 3) {
							var112 = var106.field947;
							var113 = var106.field914;
						}

						var105.field1404 = var92 * 128 + var112 * 64;
						var105.field1406 = var93 * 128 + var113 * 64;
						var105.field1405 = method146(var105.field1406, field182, var105.field1404);

						if (var104 > var97) {
							byte var114 = var104;
							var104 = var97;
							var97 = var114;
						}

						if (var95 > var94) {
							byte var115 = var95;
							var95 = var94;
							var94 = var115;
						}

						var105.field1394 = var92 + var104;
						var105.field1396 = var92 + var97;
						var105.field1395 = var93 + var95;
						var105.field1397 = var93 + var94;
						return;
					}
				}
			}
		}
	}

	public final void init() {
		field484 = Integer.parseInt(getParameter("nodeid"));
		field485 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method139();
		} else {
			method144();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field486 = false;
		} else {
			field486 = true;
		}

		method354(765, 503);
	}

	@ObfuscatedName("client.H(I)V")
	public final void method164() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field218[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field218[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field219[var10] = (field218[var10 - 1] + field218[var10 + 1] + field218[var10 - 128] + field218[var10 + 128]) / 4;
			}
		}

		field167 += 128;
		if (field167 > field308.length) {
			field167 -= field308.length;
			int var11 = (int) (Math.random() * 12.0D);
			method54(field274[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field219[var14 + 128] - field308[field167 + var14 & field308.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field218[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field390[var16] = field390[var16 + 1];
		}

		field390[var1 - 1] = (int) (Math.sin(field292 / 14.0D) * 16.0D + Math.sin(field292 / 15.0D) * 14.0D + Math.sin(field292 / 16.0D) * 12.0D);

		if (field119 > 0) {
			field119 -= 4;
		}

		if (field120 > 0) {
			field120 -= 4;
		}

		if (field119 == 0 && field120 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field119 = 1024;
			}

			if (var17 == 1) {
				field120 = 1024;
				return;
			}
		}
	}

	public final void run() {
		if (field346) {
			method102();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method165() {
		field313 = 0;
		for (int var1 = -1; var1 < field261 + field214; var1++) {
			DBHOKPMQ var2;
			if (var1 == -1) {
				var2 = field491;
			} else if (var1 < field261) {
				var2 = field260[field262[var1]];
			} else {
				var2 = field213[field215[var1 - field261]];
			}

			if (var2 != null && var2.method203()) {
				if (var2 instanceof KPZIZBER) {
					NIJEYEOX var3 = ((KPZIZBER) var2).field906;
					if (var3.field1094 != null) {
						var3 = var3.method362();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field261) {
					NIJEYEOX var6 = ((KPZIZBER) var2).field906;
					if (var6.field1093 >= 0 && var6.field1093 < field173.length) {
						method118(var2.field541 + 15, var2);

						if (field248 > -1) {
							field173[var6.field1093].method220(field249 - 30, field248 - 12);
						}
					}

					if (field493 == 1 && field215[var1 - field261] == field62 && field292 % 20 < 10) {
						method118(var2.field541 + 15, var2);

						if (field248 > -1) {
							field237[0].method220(field249 - 28, field248 - 12);
						}
					}
				} else {
					int var4 = 30;
					VJDNWPCM var5 = (VJDNWPCM) var2;
					if (var5.field1412 != -1 || var5.field1414 != -1) {
						method118(var2.field541 + 15, var2);

						if (field248 > -1) {
							if (var5.field1412 != -1) {
								field348[var5.field1412].method220(field249 - var4, field248 - 12);
								var4 += 25;
							}

							if (var5.field1414 != -1) {
								field173[var5.field1414].method220(field249 - var4, field248 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field493 == 10 && field262[var1] == field113) {
						method118(var2.field541 + 15, var2);

						if (field248 > -1) {
							field237[1].method220(field249 - var4, field248 - 12);
						}
					}
				}

				if (var2.field534 != null && (var1 >= field261 || field301 == 0 || field301 == 3 || field301 == 1 && method180(((VJDNWPCM) var2).field1402))) {
					method118(var2.field541, var2);

					if (field248 > -1 && field313 < field314) {
						field318[field313] = field434.method505(var2.field534) / 2;
						field317[field313] = field434.field1380;
						field315[field313] = field248;
						field316[field313] = field249;
						field319[field313] = var2.field565;
						field320[field313] = var2.field560;
						field321[field313] = var2.field559;
						field322[field313++] = var2.field534;

						if (field503 == 0 && var2.field560 >= 1 && var2.field560 <= 3) {
							field317[field313] += 10;
							field316[field313] += 5;
						}

						if (field503 == 0 && var2.field560 == 4) {
							field318[field313] = 60;
						}

						if (field503 == 0 && var2.field560 == 5) {
							field317[field313] += 5;
						}
					}
				}

				if (var2.field551 > field292) {
					method118(var2.field541 + 15, var2);

					if (field248 > -1) {
						int var7 = var2.field552 * 30 / var2.field553;
						if (var7 > 30) {
							var7 = 30;
						}

						TIJYBGAE.method492(var7, field249 - 3, 0xFF00, 5, field248 - 15);
						TIJYBGAE.method492(30 - var7, field249 - 3, 0xFF0000, 5, field248 + var7 - 15);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field558[var8] > field292) {
						method118(var2.field541 / 2, var2);

						if (field248 > -1) {
							if (var8 == 1) {
								field249 -= 20;
							}

							if (var8 == 2) {
								field248 -= 15;
								field249 -= 10;
							}

							if (var8 == 3) {
								field248 += 15;
								field249 -= 10;
							}

							field86[var2.field557[var8]].method220(field249 - 12, field248 - 12);
							field432.method502(0, field248, String.valueOf(var2.field556[var8]), field249 + 4);
							field432.method502(0xFFFFFF, field248 - 1, String.valueOf(var2.field556[var8]), field249 + 3);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field313; var9++) {
			int var10 = field315[var9];
			int var11 = field316[var9];
			int var12 = field318[var9];
			int var13 = field317[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field316[var15] - field317[var15] && var11 - var13 < field316[var15] + 2 && var10 - var12 < field318[var15] + field315[var15] && var10 + var12 > field315[var15] - field318[var15] && field316[var15] - field317[var15] < var11) {
						var11 = field316[var15] - field317[var15];
						var14 = true;
					}
				}
			}

			field248 = field315[var9];
			field249 = field316[var9] = var11;
			String var16 = field322[var9];
			if (field503 == 0) {
				int var17 = 0xFFFF00;
				if (field319[var9] < 6) {
					var17 = field153[field319[var9]];
				}

				if (field319[var9] == 6) {
					var17 = field168 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field319[var9] == 7) {
					var17 = field168 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field319[var9] == 8) {
					var17 = field168 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field319[var9] == 9) {
					int var18 = 150 - field321[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field319[var9] == 10) {
					int var19 = 150 - field321[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field319[var9] == 11) {
					int var20 = 150 - field321[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field320[var9] == 0) {
					field434.method502(0, field248, var16, field249 + 1);
					field434.method502(var17, field248, var16, field249);
				}

				if (field320[var9] == 1) {
					field434.method507(field248, var16, field168, 0, field249 + 1);
					field434.method507(field248, var16, field168, var17, field249);
				}

				if (field320[var9] == 2) {
					field434.method508(field248, 0, field168, field249 + 1, var16);
					field434.method508(field248, var17, field168, field249, var16);
				}

				if (field320[var9] == 3) {
					field434.method509(0, field249 + 1, field248, 150 - field321[var9], var16, field168);
					field434.method509(var17, field249, field248, 150 - field321[var9], var16, field168);
				}

				if (field320[var9] == 4) {
					int var21 = field434.method505(var16);
					int var22 = (150 - field321[var9]) * (var21 + 100) / 150;
					TIJYBGAE.method489(334, field248 - 50, 0, field248 + 50);
					field434.method506(0, var16, field248 + 50 - var22, field249 + 1);
					field434.method506(var17, var16, field248 + 50 - var22, field249);
					TIJYBGAE.method488();
				}

				if (field320[var9] == 5) {
					int var23 = 150 - field321[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					TIJYBGAE.method489(field249 + 5, 0, field249 - field434.field1380 - 1, 512);
					field434.method502(0, field248, var16, field249 + var24 + 1);
					field434.method502(var17, field248, var16, field249 + var24);
					TIJYBGAE.method488();
				}
			} else {
				field434.method502(0, field248, var16, field249 + 1);
				field434.method502(0xFFFF00, field248, var16, field249);
			}
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method166(String arg0) throws IOException {
		if (field377) {
			if (field501 != null) {
				try {
					field501.close();
				} catch (Exception var4) {
				}

				field501 = null;
			}

			field501 = method158(43595);
			field501.setSoTimeout(10000);
			InputStream var2 = field501.getInputStream();
			OutputStream var3 = field501.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(IIIBLNIJEYEOX;)V")
	public final void method167(int arg0, int arg1, int arg2, NIJEYEOX arg3) {
		if (field388 < 400) {
			if (arg3.field1094 != null) {
				arg3 = arg3.method362();
			}

			if (arg3 != null && arg3.field1101) {
				String var5 = arg3.field1079;
				if (arg3.field1105 != 0) {
					var5 = var5 + method179(field491.field1408, arg3.field1105) + " (level-" + arg3.field1105 + ")";
				}

				if (field252 == 1) {
					field477[field388] = "Use " + field256 + " with @yel@" + var5;
					field327[field388] = 561;
					field328[field388] = arg0;
					field325[field388] = arg2;
					field326[field388] = arg1;
					field388++;
				} else if (field82 != 1) {
					if (arg3.field1080 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field1080[var6] != null && !arg3.field1080[var6].equalsIgnoreCase("attack")) {
								field477[field388] = arg3.field1080[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field327[field388] = 339;
								}

								if (var6 == 1) {
									field327[field388] = 845;
								}

								if (var6 == 2) {
									field327[field388] = 851;
								}

								if (var6 == 3) {
									field327[field388] = 36;
								}

								if (var6 == 4) {
									field327[field388] = 859;
								}

								field328[field388] = arg0;
								field325[field388] = arg2;
								field326[field388] = arg1;
								field388++;
							}
						}
					}

					if (arg3.field1080 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field1080[var7] != null && arg3.field1080[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field1105 > field491.field1408) {
									var8 = 2000;
								}

								field477[field388] = arg3.field1080[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field327[field388] = var8 + 339;
								}

								if (var7 == 1) {
									field327[field388] = var8 + 845;
								}

								if (var7 == 2) {
									field327[field388] = var8 + 851;
								}

								if (var7 == 3) {
									field327[field388] = var8 + 36;
								}

								if (var7 == 4) {
									field327[field388] = var8 + 859;
								}

								field328[field388] = arg0;
								field325[field388] = arg2;
								field326[field388] = arg1;
								field388++;
							}
						}
					}

					field477[field388] = "Examine @yel@" + var5;
					field327[field388] = 1433;
					field328[field388] = arg0;
					field325[field388] = arg2;
					field326[field388] = arg1;
					field388++;
				} else if ((field84 & 0x2) == 2) {
					field477[field388] = field85 + " @yel@" + var5;
					field327[field388] = 154;
					field328[field388] = arg0;
					field325[field388] = arg2;
					field326[field388] = arg1;
					field388++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(LMIIVNBFU;BI)I")
	public final int method168(MIIVNBFU arg0, int arg1) {
		if (arg0.field1008 == null || arg1 >= arg0.field1008.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.field1008[arg1];
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
					var8 = field443[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field141[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field463[var3[var5++]];
				}

				if (var7 == 4) {
					MIIVNBFU var10 = MIIVNBFU.method350(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < IXFCVZPT.field757 && (!IXFCVZPT.method285(var11).field747 || field486)) {
						for (int var12 = 0; var12 < var10.field989.length; var12++) {
							if (var11 + 1 == var10.field989[var12]) {
								var8 += var10.field990[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field142[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field116[field141[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field142[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field491.field1408;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < FRKFOCXX.field666; var13++) {
						if (FRKFOCXX.field668[var13]) {
							var8 += field141[var13];
						}
					}
				}

				if (var7 == 10) {
					MIIVNBFU var14 = MIIVNBFU.method350(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < IXFCVZPT.field757 && (!IXFCVZPT.method285(var15).field747 || field486)) {
						for (int var16 = 0; var16 < var14.field989.length; var16++) {
							if (var14.field989[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field278;
				}

				if (var7 == 12) {
					var8 = field483;
				}

				if (var7 == 13) {
					int var17 = field142[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					EHPXVLSO var20 = EHPXVLSO.field623[var19];
					int var21 = var20.field625;
					int var22 = var20.field626;
					int var23 = var20.field627;
					int var24 = field291[var23 - var22];
					var8 = field142[var21] >> var22 & var24;
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
					var8 = (field491.field548 >> 7) + field169;
				}

				if (var7 == 19) {
					var8 = (field491.field549 >> 7) + field170;
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

	@ObfuscatedName("client.l(Z)V")
	public final void method169() {
		byte[] var1 = field306.method14("title.dat", null);
		GPLGZASP var2 = new GPLGZASP(var1, this);
		field354.method205();
		var2.method218(0, 0);
		field355.method205();
		var2.method218(-637, 0);
		field351.method205();
		var2.method218(-128, 0);
		field352.method205();
		var2.method218(-202, -371);
		field353.method205();
		var2.method218(-202, -171);
		field356.method205();
		var2.method218(0, -265);
		field357.method205();
		var2.method218(-562, -265);
		field358.method205();
		var2.method218(-128, -171);
		field359.method205();
		var2.method218(-562, -171);
		int[] var3 = new int[var2.field694];
		for (int var4 = 0; var4 < var2.field695; var4++) {
			for (int var5 = 0; var5 < var2.field694; var5++) {
				var3[var5] = var2.field693[var2.field694 * var4 + var2.field694 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field694; var6++) {
				var2.field693[var2.field694 * var4 + var6] = var3[var6];
			}
		}

		field354.method205();
		var2.method218(382, 0);
		field355.method205();
		var2.method218(-255, 0);
		field351.method205();
		var2.method218(254, 0);
		field352.method205();
		var2.method218(180, -371);
		field353.method205();
		var2.method218(180, -171);
		field356.method205();
		var2.method218(382, -265);
		field357.method205();
		var2.method218(-180, -265);
		field358.method205();
		var2.method218(254, -171);
		field359.method205();
		var2.method218(-180, -171);
		GPLGZASP var7 = new GPLGZASP(field306, "logo", 0);
		field351.method205();
		var7.method220(18, 382 - var7.field694 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.I(I)V")
	public final void method170() {
		try {
			int var1 = field491.field548 + field456;
			int var2 = field491.field549 + field179;
			if (field469 - var1 < -500 || field469 - var1 > 500 || field470 - var2 < -500 || field470 - var2 > 500) {
				field469 = var1;
				field470 = var2;
			}

			if (field469 != var1) {
				field469 += (var1 - field469) / 16;
			}

			if (field470 != var2) {
				field470 += (var2 - field470) / 16;
			}

			if (field1059[1] == 1) {
				field80 += (-field80 - 24) / 2;
			} else if (field1059[2] == 1) {
				field80 += (24 - field80) / 2;
			} else {
				field80 /= 2;
			}

			if (field1059[3] == 1) {
				field81 += (12 - field81) / 2;
			} else if (field1059[4] == 1) {
				field81 += (-field81 - 12) / 2;
			} else {
				field81 /= 2;
			}

			field79 = field80 / 2 + field79 & 0x7FF;
			field78 += field81 / 2;
			if (field78 < 128) {
				field78 = 128;
			}

			if (field78 > 383) {
				field78 = 383;
			}

			field220++;
			if (field220 > 1601) {
				field220 = 0;
				field64.method234(35);
				field64.method235(0);
				int var3 = field64.field733;
				field64.method235((int) (Math.random() * 256.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(18929);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method235(115);
				}

				field64.method236(40940);
				field64.method236(15807);

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method235(215);
				}

				field64.method235(34);
				field64.method235(66);

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(27687);
				}

				field64.method236((int) (Math.random() * 65536.0D));
				field64.method244(field64.field733 - var3);
			}

			int var4 = field469 >> 7;
			int var5 = field470 >> 7;
			int var6 = method146(field470, field182, field469);
			int var7 = 0;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
						int var10 = field182;
						if (var10 < 3 && (field188[1][var8][var9] & 0x2) == 2) {
							var10++;
						}

						int var11 = var6 - field366[var10][var8][var9];
						if (var11 > var7) {
							var7 = var11;
						}
					}
				}
			}

			int var12 = var7 * 192;
			if (var12 > 98048) {
				var12 = 98048;
			}

			if (var12 < 32768) {
				var12 = 32768;
			}

			if (var12 > field293) {
				field293 += (var12 - field293) / 24;
			} else if (var12 < field293) {
				field293 += (var12 - field293) / 80;
			}
		} catch (Exception var13) {
			signlink.reporterror("glfc_ex " + field491.field548 + "," + field491.field549 + "," + field469 + "," + field470 + "," + field422 + "," + field423 + "," + field169 + "," + field170);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IILGPLGZASP;I)V")
	public final void method171(int arg0, int arg1, GPLGZASP arg2) {
		if (arg2 != null) {
			int var4 = field79 + field496 & 0x7FF;
			int var5 = arg0 * arg0 + arg1 * arg1;
			if (var5 <= 6400) {
				int var6 = JJMVUSJJ.field865[var4];
				int var7 = JJMVUSJJ.field866[var4];
				var6 = var6 * 256 / (field184 + 256);
				var7 = var7 * 256 / (field184 + 256);
				int var8 = arg0 * var7 + arg1 * var6 >> 16;
				int var9 = arg1 * var7 - arg0 * var6 >> 16;
				if (var5 > 2500) {
					arg2.method226(var8 + 94 + 4 - arg2.field698 / 2, 83 - var9 - arg2.field699 / 2 - 4, field428);
				} else {
					arg2.method220(83 - var9 - arg2.field699 / 2 - 4, var8 + 94 - arg2.field698 / 2 + 4);
				}
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method172() {
		for (int var1 = -1; var1 < field261; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field259;
			} else {
				var2 = field262[var1];
			}

			VJDNWPCM var3 = field260[var2];
			if (var3 != null) {
				method76(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method173() {
		if (field480 == 0) {
			int var1 = field1055;
			if (field82 == 1 && field1056 >= 516 && field1057 >= 160 && field1056 <= 765 && field1057 <= 205) {
				var1 = 0;
			}

			if (field192) {
				if (var1 != 1) {
					int var2 = field1049;
					int var3 = field1050;
					if (field123 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field123 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field123 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field124 - 10 || var2 > field126 + field124 + 10 || var3 < field125 - 10 || var3 > field127 + field125 + 10) {
						field192 = false;

						if (field123 == 1) {
							field323 = true;
						}

						if (field123 == 2) {
							field67 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field124;
					int var5 = field125;
					int var6 = field126;
					int var7 = field1056;
					int var8 = field1057;
					if (field123 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field123 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field123 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field388; var10++) {
						int var11 = (field388 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method123(var9);
					}

					field192 = false;

					if (field123 == 1) {
						field323 = true;
					}

					if (field123 == 2) {
						field67 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field388 > 0) {
					int var12 = field327[field388 - 1];
					if (var12 == 263 || var12 == 898 || var12 == 890 || var12 == 139 || var12 == 797 || var12 == 80 || var12 == 331 || var12 == 426 || var12 == 213 || var12 == 245 || var12 == 26 || var12 == 1164) {
						int var13 = field325[field388 - 1];
						int var14 = field326[field388 - 1];
						MIIVNBFU var15 = MIIVNBFU.method350(var14);
						if (var15.field992 || var15.field986) {
							field103 = false;
							field362 = 0;
							field478 = var14;
							field479 = var13;
							field480 = 2;
							field481 = field1056;
							field482 = field1057;

							if (MIIVNBFU.method350(var14).field991 == field492) {
								field480 = 1;
							}

							if (MIIVNBFU.method350(var14).field991 == field275) {
								field480 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field174 == 1 || method105(field388 - 1)) && field388 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field388 > 0) {
					method123(field388 - 1);
				}

				if (var1 != 2 || field388 <= 0) {
					return;
				}

				method57();
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method174() {
		Graphics var1 = method135().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method356(1);

		if (field368) {
			field117 = false;
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

		if (field178) {
			field117 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field465) {
			field117 = false;
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

	@ObfuscatedName("client.c(IZ)V")
	public final void method175(boolean arg0) {
		method62();
		field353.method205();
		field297.method463(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field502 == 0) {
			int var4 = var3 / 2 + 80;
			field432.method503(field177.field37, 0x75A9A9, var2 / 2, var4, true);
			int var5 = var3 / 2 - 20;
			field434.method503("Welcome to RuneScape", 0xFFFF00, var2 / 2, var5, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field298.method463(var7 - 20, var6 - 73);
			field434.method503("New User", 0xFFFFFF, var6, var7 + 5, true);
			int var8 = var2 / 2 + 80;
			field298.method463(var7 - 20, var8 - 73);
			field434.method503("Existing User", 0xFFFFFF, var8, var7 + 5, true);
		}

		if (field502 == 2) {
			int var9 = var3 / 2 - 40;
			if (field246.length() > 0) {
				field434.method503(field246, 0xFFFF00, var2 / 2, var9 - 15, true);
				field434.method503(field247, 0xFFFF00, var2 / 2, var9, true);
				var9 += 30;
			} else {
				field434.method503(field247, 0xFFFF00, var2 / 2, var9 - 7, true);
				var9 += 30;
			}

			field434.method510("Username: " + field386 + (field138 == 0 & field292 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 90, 0xFFFFFF, var9);
			var9 += 15;
			field434.method510("Password: " + RSIGORUG.method457(field387) + (field138 == 1 & field292 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 88, 0xFFFFFF, var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field298.method463(var11 - 20, var10 - 73);
				field434.method503("Login", 0xFFFFFF, var10, var11 + 5, true);
				int var12 = var2 / 2 + 80;
				field298.method463(var11 - 20, var12 - 73);
				field434.method503("Cancel", 0xFFFFFF, var12, var11 + 5, true);
			}
		}

		if (field502 == 3) {
			field434.method503("Create a free account", 0xFFFF00, var2 / 2, var3 / 2 - 60, true);
			int var13 = var3 / 2 - 35;
			field434.method503("To create a new account you need to", 0xFFFFFF, var2 / 2, var13, true);
			var13 += 15;
			field434.method503("go back to the main RuneScape webpage", 0xFFFFFF, var2 / 2, var13, true);
			var13 += 15;
			field434.method503("and choose the 'create account'", 0xFFFFFF, var2 / 2, var13, true);
			var13 += 15;
			field434.method503("button near the top of that page.", 0xFFFFFF, var2 / 2, var13, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field298.method463(var15 - 20, var14 - 73);
			field434.method503("Cancel", 0xFFFFFF, var14, var15 + 5, true);
		}

		field353.method206(202, field1041, 171);

		if (field341) {
			field341 = false;
			field351.method206(128, field1041, 0);
			field352.method206(202, field1041, 371);
			field356.method206(0, field1041, 265);
			field357.method206(562, field1041, 265);
			field358.method206(128, field1041, 171);
			field359.method206(562, field1041, 171);
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method176() {
		method125("Starting up", 20);

		if (signlink.sunjava) {
			field1035 = 5;
		}

		if (field347) {
			field465 = true;
		} else {
			field347 = true;
			boolean var1 = false;
			String var2 = method91();
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
						field196[var3] = new BCXJTIWC(600000, signlink.cache_dat, var3 + 1, signlink.cache_idx[var3]);
					}
				}

				try {
					method148();
					field306 = method120("title", field372[1], 25, 1, "title screen");
					field432 = new UOINBUQD(false, field306, "p11_full");
					field433 = new UOINBUQD(false, field306, "p12_full");
					field434 = new UOINBUQD(false, field306, "b12_full");
					field435 = new UOINBUQD(true, field306, "q8_full");
					method169();
					method106();
					AWEEREDT var4 = method120("config", field372[2], 30, 2, "config");
					AWEEREDT var5 = method120("interface", field372[3], 35, 3, "interface");
					AWEEREDT var6 = method120("media", field372[4], 40, 4, "2d graphics");
					AWEEREDT var7 = method120("textures", field372[6], 45, 6, "textures");
					AWEEREDT var8 = method120("wordenc", field372[7], 50, 7, "chat system");
					AWEEREDT var9 = method120("sounds", field372[8], 55, 8, "sound effects");
					field188 = new byte[4][104][104];
					field366 = new int[4][105][105];
					field233 = new POACSVST(104, 104, field366, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field69[var10] = new AOKWRKNA(104, 104);
					}

					field272 = new GPLGZASP(512, 512);
					AWEEREDT var11 = method120("versionlist", field372[5], 60, 5, "update list");
					method125("Connecting to update server", 60);
					field177 = new BISZONYZ();
					field177.method36(var11, this);
					OJYMITMR.method378(field177.method31());
					JJMVUSJJ.method297(field177.method27(0), field177);

					if (!field487) {
						field459 = 0;
						field460 = true;
						field177.method40(2, field459);

						while (field177.method29() > 0) {
							method59();

							try {
								Thread.sleep(100L);
							} catch (Exception var74) {
							}

							if (field177.field47 > 3) {
								method159("ondemand");
								return;
							}
						}
					}

					method125("Requesting animations", 65);
					int var12 = field177.method27(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field177.method40(1, var13);
					}

					while (field177.method29() > 0) {
						int var14 = var12 - field177.method29();
						if (var14 > 0) {
							method125("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method59();

						try {
							Thread.sleep(100L);
						} catch (Exception var73) {
						}

						if (field177.field47 > 3) {
							method159("ondemand");
							return;
						}
					}

					method125("Requesting models", 70);
					int var15 = field177.method27(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field177.method35(var16);
						if ((var17 & 0x1) != 0) {
							field177.method40(0, var16);
						}
					}

					int var18 = field177.method29();
					while (field177.method29() > 0) {
						int var19 = var18 - field177.method29();
						if (var19 > 0) {
							method125("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method59();

						try {
							Thread.sleep(100L);
						} catch (Exception var72) {
						}
					}

					if (field196[0] != null) {
						method125("Requesting maps", 75);
						field177.method40(3, field177.method28(0, 47, 48));
						field177.method40(3, field177.method28(1, 47, 48));
						field177.method40(3, field177.method28(0, 48, 48));
						field177.method40(3, field177.method28(1, 48, 48));
						field177.method40(3, field177.method28(0, 49, 48));
						field177.method40(3, field177.method28(1, 49, 48));
						field177.method40(3, field177.method28(0, 47, 47));
						field177.method40(3, field177.method28(1, 47, 47));
						field177.method40(3, field177.method28(0, 48, 47));
						field177.method40(3, field177.method28(1, 48, 47));
						field177.method40(3, field177.method28(0, 48, 148));
						field177.method40(3, field177.method28(1, 48, 148));
						int var20 = field177.method29();
						while (field177.method29() > 0) {
							int var21 = var20 - field177.method29();
							if (var21 > 0) {
								method125("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method59();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}
						}
					}

					int var22 = field177.method27(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field177.method35(var23);
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
							field177.method23(var23, var25, 0);
						}
					}

					field177.method34(field486);

					if (!field487) {
						int var26 = field177.method27(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field177.method20(var27)) {
								field177.method23(var27, (byte) 1, 2);
							}
						}
					}

					int var28 = field177.method27(0);
					for (int var29 = 0; var29 < var28; var29++) {
						int var30 = field177.method35(var29);
						if (var30 == 0 && field177.field49 < 200) {
							field177.method23(var29, (byte) 1, 0);
						}
					}

					method125("Unpacking media", 80);
					field427 = new SFVBUBEZ(var6, "invback", 0);
					field429 = new SFVBUBEZ(var6, "chatback", 0);
					field428 = new SFVBUBEZ(var6, "mapback", 0);
					field97 = new SFVBUBEZ(var6, "backbase1", 0);
					field98 = new SFVBUBEZ(var6, "backbase2", 0);
					field99 = new SFVBUBEZ(var6, "backhmid1", 0);

					for (int var31 = 0; var31 < 13; var31++) {
						field165[var31] = new SFVBUBEZ(var6, "sideicons", var31);
					}

					field145 = new GPLGZASP(var6, "compass", 0);
					field122 = new GPLGZASP(var6, "mapedge", 0);
					field122.method217();

					for (int var32 = 0; var32 < 72; var32++) {
						field198[var32] = new SFVBUBEZ(var6, "mapscene", var32);
					}

					for (int var33 = 0; var33 < 70; var33++) {
						field490[var33] = new GPLGZASP(var6, "mapfunction", var33);
					}

					for (int var34 = 0; var34 < 5; var34++) {
						field86[var34] = new GPLGZASP(var6, "hitmarks", var34);
					}

					for (int var35 = 0; var35 < 6; var35++) {
						field348[var35] = new GPLGZASP(var6, "headicons_pk", var35);
					}

					for (int var36 = 0; var36 < 9; var36++) {
						field173[var36] = new GPLGZASP(var6, "headicons_prayer", var36);
					}

					for (int var37 = 0; var37 < 6; var37++) {
						field237[var37] = new GPLGZASP(var6, "headicons_hint", var37);
					}

					field311 = new GPLGZASP(var6, "overlay_multiway", 0);
					field488 = new GPLGZASP(var6, "mapmarker", 0);
					field489 = new GPLGZASP(var6, "mapmarker", 1);

					for (int var38 = 0; var38 < 8; var38++) {
						field92[var38] = new GPLGZASP(var6, "cross", var38);
					}

					field409 = new GPLGZASP(var6, "mapdots", 0);
					field410 = new GPLGZASP(var6, "mapdots", 1);
					field411 = new GPLGZASP(var6, "mapdots", 2);
					field412 = new GPLGZASP(var6, "mapdots", 3);
					field413 = new GPLGZASP(var6, "mapdots", 4);
					field302 = new SFVBUBEZ(var6, "scrollbar", 0);
					field303 = new SFVBUBEZ(var6, "scrollbar", 1);
					field200 = new SFVBUBEZ(var6, "redstone1", 0);
					field201 = new SFVBUBEZ(var6, "redstone2", 0);
					field202 = new SFVBUBEZ(var6, "redstone3", 0);
					field203 = new SFVBUBEZ(var6, "redstone1", 0);
					field203.method460();
					field204 = new SFVBUBEZ(var6, "redstone2", 0);
					field204.method460();
					field404 = new SFVBUBEZ(var6, "redstone1", 0);
					field404.method461();
					field405 = new SFVBUBEZ(var6, "redstone2", 0);
					field405.method461();
					field406 = new SFVBUBEZ(var6, "redstone3", 0);
					field406.method461();
					field407 = new SFVBUBEZ(var6, "redstone1", 0);
					field407.method460();
					field407.method461();
					field408 = new SFVBUBEZ(var6, "redstone2", 0);
					field408.method460();
					field408.method461();

					for (int var39 = 0; var39 < 2; var39++) {
						field296[var39] = new SFVBUBEZ(var6, "mod_icons", var39);
					}

					GPLGZASP var40 = new GPLGZASP(var6, "backleft1", 0);
					field391 = new DTPUNZHN(var40.field695, var40.field694, method135());
					var40.method218(0, 0);
					GPLGZASP var41 = new GPLGZASP(var6, "backleft2", 0);
					field392 = new DTPUNZHN(var41.field695, var41.field694, method135());
					var41.method218(0, 0);
					GPLGZASP var42 = new GPLGZASP(var6, "backright1", 0);
					field393 = new DTPUNZHN(var42.field695, var42.field694, method135());
					var42.method218(0, 0);
					GPLGZASP var43 = new GPLGZASP(var6, "backright2", 0);
					field394 = new DTPUNZHN(var43.field695, var43.field694, method135());
					var43.method218(0, 0);
					GPLGZASP var44 = new GPLGZASP(var6, "backtop1", 0);
					field395 = new DTPUNZHN(var44.field695, var44.field694, method135());
					var44.method218(0, 0);
					GPLGZASP var45 = new GPLGZASP(var6, "backvmid1", 0);
					field396 = new DTPUNZHN(var45.field695, var45.field694, method135());
					var45.method218(0, 0);
					GPLGZASP var46 = new GPLGZASP(var6, "backvmid2", 0);
					field397 = new DTPUNZHN(var46.field695, var46.field694, method135());
					var46.method218(0, 0);
					GPLGZASP var47 = new GPLGZASP(var6, "backvmid3", 0);
					field398 = new DTPUNZHN(var47.field695, var47.field694, method135());
					var47.method218(0, 0);
					GPLGZASP var48 = new GPLGZASP(var6, "backhmid2", 0);
					field399 = new DTPUNZHN(var48.field695, var48.field694, method135());
					var48.method218(0, 0);
					int var49 = (int) (Math.random() * 21.0D) - 10;
					int var50 = (int) (Math.random() * 21.0D) - 10;
					int var51 = (int) (Math.random() * 21.0D) - 10;
					int var52 = (int) (Math.random() * 41.0D) - 20;
					for (int var53 = 0; var53 < 100; var53++) {
						if (field490[var53] != null) {
							field490[var53].method216(var49 + var52, var50 + var52, var51 + var52);
						}

						if (field198[var53] != null) {
							field198[var53].method462(var49 + var52, var50 + var52, var51 + var52);
						}
					}

					method125("Unpacking textures", 83);
					ZGIYLEBF.method590(var7);
					ZGIYLEBF.method594(0.8D);
					ZGIYLEBF.method589(20);
					method125("Unpacking config", 86);
					XTKQUJNF.method531(var4);
					MCFQOEAW.method339(var4);
					YDUFKDFX.method572(var4);
					IXFCVZPT.method288(var4);
					NIJEYEOX.method365(var4);
					WINORGIB.method525(var4);
					EBBSHPSJ.method208(var4);
					TRINWBEO.method499(var4);
					EHPXVLSO.method211(var4);
					IXFCVZPT.field753 = field486;

					if (!field487) {
						method125("Unpacking sounds", 90);
						byte[] var54 = var9.method14("sounds.dat", null);
						IUVBENCV var55 = new IUVBENCV(var54);
						QJLULATA.method446(var55);
					}

					method125("Unpacking interfaces", 95);
					UOINBUQD[] var56 = new UOINBUQD[] { field432, field433, field434, field435 };
					MIIVNBFU.method351(var56, var5, var6);
					method125("Preparing game engine", 100);

					for (int var57 = 0; var57 < 33; var57++) {
						int var58 = 999;
						int var59 = 0;
						for (int var60 = 0; var60 < 34; var60++) {
							if (field428.field1274[field428.field1276 * var57 + var60] == 0) {
								if (var58 == 999) {
									var58 = var60;
								}
							} else if (var58 != 999) {
								var59 = var60;
								break;
							}
						}

						field146[var57] = var58;
						field276[var57] = var59 - var58;
					}

					for (int var61 = 5; var61 < 156; var61++) {
						int var62 = 999;
						int var63 = 0;
						for (int var64 = 25; var64 < 172; var64++) {
							if (field428.field1274[field428.field1276 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
								if (var62 == 999) {
									var62 = var64;
								}
							} else if (var62 != 999) {
								var63 = var64;
								break;
							}
						}

						field181[var61 - 5] = var62 - 25;
						field289[var61 - 5] = var63 - var62;
					}

					ZGIYLEBF.method587(765, 503);
					field224 = ZGIYLEBF.field1495;
					ZGIYLEBF.method587(479, 96);
					field221 = ZGIYLEBF.field1495;
					ZGIYLEBF.method587(190, 261);
					field222 = ZGIYLEBF.field1495;
					ZGIYLEBF.method587(512, 334);
					field223 = ZGIYLEBF.field1495;
					int[] var65 = new int[9];
					for (int var66 = 0; var66 < 9; var66++) {
						int var67 = var66 * 32 + 128 + 15;
						int var68 = var67 * 3 + 600;
						int var69 = ZGIYLEBF.field1493[var67];
						var65[var66] = var68 * var69 >> 16;
					}

					POACSVST.method423(512, 334, var65, 800, 500);
					XWTMFQHB.method534(var8);
					field461 = new LLZTMQTZ(this);
					method90(field461, 10);
					YUINHFWF.field1473 = this;
					MCFQOEAW.field951 = this;
					NIJEYEOX.field1099 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field193 + " " + field294);
					field368 = true;
				}
			} else {
				field178 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIBIIII)V")
	public final void method177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		JQXBQBEJ var10 = null;
		for (JQXBQBEJ var11 = (JQXBQBEJ) field474.method580(); var11 != null; var11 = (JQXBQBEJ) field474.method582()) {
			if (var11.field877 == arg6 && var11.field879 == arg0 && var11.field880 == arg2 && var11.field878 == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new JQXBQBEJ();
			var10.field877 = arg6;
			var10.field878 = arg3;
			var10.field879 = arg0;
			var10.field880 = arg2;
			method162(var10);
			field474.method577(var10);
		}

		var10.field869 = arg8;
		var10.field871 = arg1;
		var10.field870 = arg4;
		var10.field876 = arg5;
		var10.field875 = arg7;
	}

	@ObfuscatedName("client.K(I)Z")
	public final boolean method178() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.d(III)Ljava/lang/String;")
	public static final String method179(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(Ljava/lang/String;Z)Z")
	public final boolean method180(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field498; var2++) {
			if (arg0.equalsIgnoreCase(field190[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field491.field1402)) {
			return true;
		}

		return false;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.c(BI)V")
	public final void method181(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.b(BLMIIVNBFU;)Z")
	public final boolean method182(MIIVNBFU arg0) {
		int var2 = arg0.field1020;
		if (field499 == 2) {
			if (var2 == 201) {
				field67 = true;
				field191 = 0;
				field136 = true;
				field430 = "";
				field257 = 1;
				field378 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field67 = true;
				field191 = 0;
				field136 = true;
				field430 = "";
				field257 = 2;
				field378 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field448 = 250;
			return true;
		}

		if (var2 == 501) {
			field67 = true;
			field191 = 0;
			field136 = true;
			field430 = "";
			field257 = 4;
			field378 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field67 = true;
			field191 = 0;
			field136 = true;
			field430 = "";
			field257 = 5;
			field378 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field61[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = WINORGIB.field1417 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= WINORGIB.field1417) {
							var5 = 0;
						}
					}

					if (!WINORGIB.field1418[var5].field1424 && WINORGIB.field1418[var5].field1419 == var3 + (field310 ? 0 : 7)) {
						break;
					}
				}

				field61[var3] = var5;
				field102 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field370[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field156[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field156[var6].length) {
					var8 = 0;
				}
			}

			field370[var6] = var8;
			field102 = true;
		}

		if (var2 == 324 && !field310) {
			field310 = true;
			method116();
		}

		if (var2 == 325 && field310) {
			field310 = false;
			method116();
		}

		if (var2 == 326) {
			field64.method234(225);
			field64.method235(field310 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field64.method235(field61[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field64.method235(field370[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field418 = !field418;
		}

		if (var2 >= 601 && var2 <= 613) {
			method131();

			if (field307.length() > 0) {
				field64.method234(158);
				field64.method241(RSIGORUG.method452(field307));
				field64.method235(var2 - 601);
				field64.method235(field418 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method183() {
		if (field448 > 0) {
			method103();
		} else {
			method104("Connection lost", "Please wait - attempting to reestablish");
			field453 = 0;
			field270 = 0;
			CSJOZVFM var1 = field139;
			field286 = false;
			field73 = 0;
			method61(field386, field387, true);

			if (!field286) {
				method103();
			}

			try {
				var1.method194();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method184() {
		if (field453 == 0 && field1055 == 1) {
			int var1 = field1056 - 25 - 550;
			int var2 = field1057 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field79 + field496 & 0x7FF;
				int var4 = ZGIYLEBF.field1493[var3];
				int var5 = ZGIYLEBF.field1494[var3];
				var4 = (field184 + 256) * var4 >> 8;
				var5 = (field184 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field491.field548 + var6 >> 7;
				int var9 = field491.field549 - var7 >> 7;
				boolean var10 = method60(var9, 1, true, 0, field491.field537[0], 0, 0, 0, var8, field491.field538[0], 0);
				if (var10) {
					field64.method235(var1);
					field64.method235(var2);
					field64.method236(field79);
					field64.method235(57);
					field64.method235(field496);
					field64.method235(field184);
					field64.method235(89);
					field64.method236(field491.field548);
					field64.method236(field491.field549);
					field64.method235(field449);
					field64.method235(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method185() {
		if (field91 == null) {
			method124();
			field1042 = null;
			field351 = null;
			field352 = null;
			field353 = null;
			field354 = null;
			field355 = null;
			field356 = null;
			field357 = null;
			field358 = null;
			field359 = null;
			field91 = new DTPUNZHN(96, 479, method135());
			field89 = new DTPUNZHN(156, 172, method135());
			TIJYBGAE.method490();
			field428.method463(0, 0);
			field88 = new DTPUNZHN(261, 190, method135());
			field90 = new DTPUNZHN(334, 512, method135());
			TIJYBGAE.method490();
			field230 = new DTPUNZHN(50, 496, method135());
			field231 = new DTPUNZHN(37, 269, method135());
			field232 = new DTPUNZHN(45, 249, method135());
			field341 = true;
			field90.method205();
			ZGIYLEBF.field1495 = field223;
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method186() {
		field341 = true;
	}

	@ObfuscatedName("client.N(I)V")
	public final void method187() {
		for (int var1 = 0; var1 < field419; var1++) {
			if (field280[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field250[var1] != field121 || field77[var1] != field426) {
						IUVBENCV var3 = QJLULATA.method447(field77[var1], field250[var1]);
						if (System.currentTimeMillis() + var3.field733 / 22 > field161 / 22 + field199) {
							field161 = var3.field733;
							field199 = System.currentTimeMillis();

							if (method192(var3.field732, var3.field733)) {
								field121 = field250[var1];
								field426 = field77[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method178()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field64.method234(199);
						field64.method236(field250[var1] & 0x7FFF);
					} else {
						field64.method234(199);
						field64.method236(-1);
					}
				}

				if (var2 && field280[var1] != -5) {
					field280[var1] = -5;
				} else {
					field419--;
					for (int var5 = var1; var5 < field419; var5++) {
						field250[var5] = field250[var5 + 1];
						field77[var5] = field77[var5 + 1];
						field280[var5] = field280[var5 + 1];
					}

					var1--;
				}
			} else {
				field280[var1]--;
			}
		}

		if (field163 > 0) {
			field163 -= 20;
			if (field163 < 0) {
				field163 = 0;
			}

			if (field163 == 0 && field94 && !field487) {
				field459 = field150;
				field460 = true;
				field177.method40(2, field459);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)V")
	public final void method188(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field132 = 0;
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

			field132 = 0;
			label46: for (int var7 = 0; var7 < IXFCVZPT.field757; var7++) {
				IXFCVZPT var8 = IXFCVZPT.method285(var7);
				if (var8.field793 == -1 && var8.field783 != null) {
					String var9 = var8.field783.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field133[field132] = var9;
					field134[field132] = var7;
					field132++;
					if (field132 >= field133.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method189() {
		if (field72 != 0) {
			int var1 = 0;
			if (field95 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field339[var2] != null) {
					int var3 = field337[var2];
					String var4 = field338[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field365 == 0 || field365 == 1 && method180(var4))) {
						int var8 = 329 - var1 * 13;
						if (field1049 > 4 && field1050 - 4 > var8 - 10 && field1050 - 4 <= var8 + 3) {
							int var9 = field433.method504("From:  " + var4 + field339[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field1049 < var9 + 4) {
								if (field197 >= 1) {
									field477[field388] = "Report abuse @whi@" + var4;
									field327[field388] = 2702;
									field388++;
								}

								field477[field388] = "Add ignore @whi@" + var4;
								field327[field388] = 2038;
								field388++;
								field477[field388] = "Add friend @whi@" + var4;
								field327[field388] = 2294;
								field388++;
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

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field1044 != null) {
				return new URL("http://127.0.0.1:" + (field485 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.P(I)V")
	public final void method190() {
		if (field1055 == 1) {
			if (field1056 >= 6 && field1056 <= 106 && field1057 >= 467 && field1057 <= 499) {
				field301 = (field301 + 1) % 4;
				field151 = true;
				field67 = true;
				field64.method234(222);
				field64.method235(field301);
				field64.method235(field365);
				field64.method235(field279);
			}

			if (field1056 >= 135 && field1056 <= 235 && field1057 >= 467 && field1057 <= 499) {
				field365 = (field365 + 1) % 3;
				field151 = true;
				field67 = true;
				field64.method234(222);
				field64.method235(field301);
				field64.method235(field365);
				field64.method235(field279);
			}

			if (field1056 >= 273 && field1056 <= 373 && field1057 >= 467 && field1057 <= 499) {
				field279 = (field279 + 1) % 3;
				field151 = true;
				field67 = true;
				field64.method234(222);
				field64.method235(field301);
				field64.method235(field365);
				field64.method235(field279);
			}

			if (field1056 >= 412 && field1056 <= 512 && field1057 >= 467 && field1057 <= 499) {
				if (field492 == -1) {
					method131();
					field307 = "";
					field418 = false;
					field284 = field492 = MIIVNBFU.field997;
				} else {
					method160(0, "Please close the interface you have open before using 'report abuse'", "");
				}
			}

			field87++;
			if (field87 > 1392) {
				field87 = 0;
				field64.method234(92);
				field64.method235(0);
				int var1 = field64.field733;

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(22162);
				}

				field64.method235(6);

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(23692);
				}

				field64.method236(43388);

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method235(88);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method235(231);
				}

				field64.method236((int) (Math.random() * 65536.0D));
				field64.method235(152);

				if ((int) (Math.random() * 2.0D) == 0) {
					field64.method236(14937);
				}

				field64.method236(64269);
				field64.method244(field64.field733 - var1);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LIUVBENCV;IB)V")
	public final void method191(IUVBENCV arg0, int arg1) {
		field59 = 0;
		field263 = 0;
		method93(arg1, arg0);
		method88(arg1, arg0);
		method107(arg1, arg0);
		method151(arg0, arg1);

		for (int var3 = 0; var3 < field59; var3++) {
			int var4 = field60[var3];
			if (field292 != field260[var4].field567) {
				field260[var4] = null;
			}
		}

		if (arg0.field733 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field733 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field261; var5++) {
			if (field260[field262[var5]] == null) {
				signlink.reporterror(field386 + " null entry in pl list - pos:" + var5 + " size:" + field261);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method192(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.c(ZI)Ljava/lang/String;")
	public static final String method193(int arg0) {
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

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field116[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field291[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
