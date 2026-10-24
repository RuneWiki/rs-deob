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
public final class client extends EPVRYXOV {

	@ObfuscatedName("client.M")
	public int field74 = 1;

	@ObfuscatedName("client.N")
	public int[] field75 = new int[100];

	@ObfuscatedName("client.O")
	public String[] field76 = new String[100];

	@ObfuscatedName("client.P")
	public String[] field77 = new String[100];

	@ObfuscatedName("client.W")
	public String field82 = "";

	@ObfuscatedName("client.Y")
	public String[] field84 = new String[100];

	@ObfuscatedName("client.Z")
	public int[] field85 = new int[100];

	@ObfuscatedName("client.bb")
	public boolean field87 = false;

	@ObfuscatedName("client.cb")
	public int[] field88 = new int[151];

	@ObfuscatedName("client.db")
	public FKNRMZJV[] field89 = new FKNRMZJV[20];

	@ObfuscatedName("client.eb")
	public int[] field90 = new int[33];

	@ObfuscatedName("client.ib")
	public boolean field94 = false;

	@ObfuscatedName("client.mb")
	public boolean field98 = false;

	@ObfuscatedName("client.nb")
	public CRC32 field99 = new CRC32();

	@ObfuscatedName("client.ob")
	public FYVRCFGT field100 = new FYVRCFGT();

	@ObfuscatedName("client.pb")
	public int[] field101 = new int[33];

	@ObfuscatedName("client.qb")
	public NQUAUMDT field102 = NQUAUMDT.method327(1);

	@ObfuscatedName("client.sb")
	public boolean field104 = true;

	@ObfuscatedName("client.wb")
	public int field107 = 3;

	@ObfuscatedName("client.xb")
	public int[] field108 = new int[9];

	@ObfuscatedName("client.zb")
	public int field110 = 0x332D25;

	@ObfuscatedName("client.Ab")
	public final int field111 = 100;

	@ObfuscatedName("client.Bb")
	public int[] field112 = new int[100];

	@ObfuscatedName("client.Db")
	public boolean field114 = false;

	@ObfuscatedName("client.Eb")
	public int[] field115 = new int[151];

	@ObfuscatedName("client.Fb")
	public FKNRMZJV[] field116 = new FKNRMZJV[32];

	@ObfuscatedName("client.Wb")
	public boolean field133 = true;

	@ObfuscatedName("client.Xb")
	public int field134 = -1;

	@ObfuscatedName("client.ec")
	public boolean field141 = false;

	@ObfuscatedName("client.fc")
	public int[] field142 = new int[7];

	@ObfuscatedName("client.jc")
	public int field145 = -1;

	@ObfuscatedName("client.kc")
	public final int[] field146 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.nc")
	public VGGOSQRK field149 = new VGGOSQRK();

	@ObfuscatedName("client.oc")
	public NQUAUMDT field150 = new NQUAUMDT(new byte[5000]);

	@ObfuscatedName("client.pc")
	public DWBMCYCE[] field151 = new DWBMCYCE[16384];

	@ObfuscatedName("client.rc")
	public int[] field153 = new int[16384];

	@ObfuscatedName("client.tc")
	public int field155 = -1;

	@ObfuscatedName("client.vc")
	public String field157 = "";

	@ObfuscatedName("client.xc")
	public AOYWVYEX[] field159 = new AOYWVYEX[5];

	@ObfuscatedName("client.Ec")
	public boolean field165 = true;

	@ObfuscatedName("client.Sc")
	public int[] field179 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Tc")
	public boolean field180 = false;

	@ObfuscatedName("client.Uc")
	public int field181 = 0x23201B;

	@ObfuscatedName("client.Wc")
	public int[] field183 = new int[50];

	@ObfuscatedName("client.Yc")
	public int field185 = -1;

	@ObfuscatedName("client.Zc")
	public int field186 = -1;

	@ObfuscatedName("client.dd")
	public int[] field189 = new int[200];

	@ObfuscatedName("client.fd")
	public boolean field190 = false;

	@ObfuscatedName("client.ld")
	public int field195 = 2;

	@ObfuscatedName("client.md")
	public boolean field196 = false;

	@ObfuscatedName("client.sd")
	public String field202 = "";

	@ObfuscatedName("client.wd")
	public int[][][] field206 = new int[4][13][13];

	@ObfuscatedName("client.yd")
	public int field208 = 2;

	@ObfuscatedName("client.Kd")
	public boolean field219 = true;

	@ObfuscatedName("client.Md")
	public int[] field221 = new int[5];

	@ObfuscatedName("client.Pd")
	public int[][] field224 = new int[104][104];

	@ObfuscatedName("client.Sd")
	public FYVRCFGT field226 = new FYVRCFGT();

	@ObfuscatedName("client.Td")
	public int field227 = -1;

	@ObfuscatedName("client.Ud")
	public int[][] field228 = new int[104][104];

	@ObfuscatedName("client.ce")
	public int field235 = 2;

	@ObfuscatedName("client.de")
	public long[] field236 = new long[100];

	@ObfuscatedName("client.fe")
	public int field237 = 0x766654;

	@ObfuscatedName("client.ke")
	public boolean field242 = false;

	@ObfuscatedName("client.qe")
	public boolean field248 = false;

	@ObfuscatedName("client.re")
	public int[] field249 = new int[4000];

	@ObfuscatedName("client.se")
	public int[] field250 = new int[4000];

	@ObfuscatedName("client.ue")
	public boolean field252 = false;

	@ObfuscatedName("client.we")
	public String[] field253 = new String[5];

	@ObfuscatedName("client.xe")
	public boolean[] field254 = new boolean[5];

	@ObfuscatedName("client.ze")
	public int field256 = -1;

	@ObfuscatedName("client.Be")
	public boolean field258 = false;

	@ObfuscatedName("client.Qe")
	public UZETOFZZ[] field270 = new UZETOFZZ[13];

	@ObfuscatedName("client.Re")
	public int field271 = 0x4D4233;

	@ObfuscatedName("client.cf")
	public int field281 = 128;

	@ObfuscatedName("client.of")
	public int[] field291 = new int[LXOZWTVI.field867];

	@ObfuscatedName("client.vf")
	public int field298 = 1;

	@ObfuscatedName("client.wf")
	public int field299 = -1;

	@ObfuscatedName("client.yf")
	public boolean field301 = false;

	@ObfuscatedName("client.zf")
	public int[] field302 = new int[LXOZWTVI.field867];

	@ObfuscatedName("client.Df")
	public int field305 = -1;

	@ObfuscatedName("client.Kf")
	public volatile boolean field311 = false;

	@ObfuscatedName("client.Mf")
	public boolean field313 = false;

	@ObfuscatedName("client.Tf")
	public int[] field317 = new int[1000];

	@ObfuscatedName("client.Uf")
	public int[] field318 = new int[1000];

	@ObfuscatedName("client.Vf")
	public int field319 = -1;

	@ObfuscatedName("client.Wf")
	public UZETOFZZ[] field320 = new UZETOFZZ[2];

	@ObfuscatedName("client.Yf")
	public int field322 = 50;

	@ObfuscatedName("client.Zf")
	public int[] field323 = new int[field322];

	@ObfuscatedName("client.ag")
	public int[] field324 = new int[field322];

	@ObfuscatedName("client.bg")
	public int[] field325 = new int[field322];

	@ObfuscatedName("client.cg")
	public int[] field326 = new int[field322];

	@ObfuscatedName("client.dg")
	public int[] field327 = new int[field322];

	@ObfuscatedName("client.eg")
	public int[] field328 = new int[field322];

	@ObfuscatedName("client.fg")
	public int[] field329 = new int[field322];

	@ObfuscatedName("client.gg")
	public String[] field330 = new String[field322];

	@ObfuscatedName("client.ig")
	public long[] field331 = new long[200];

	@ObfuscatedName("client.kg")
	public NQUAUMDT field332 = NQUAUMDT.method327(1);

	@ObfuscatedName("client.mg")
	public FKNRMZJV[] field334 = new FKNRMZJV[1000];

	@ObfuscatedName("client.og")
	public int field336 = -1;

	@ObfuscatedName("client.rg")
	public int[] field339 = new int[50];

	@ObfuscatedName("client.sg")
	public int[] field340 = new int[5];

	@ObfuscatedName("client.yg")
	public boolean field346 = false;

	@ObfuscatedName("client.Ag")
	public FYVRCFGT[][][] field348 = new FYVRCFGT[4][104][104];

	@ObfuscatedName("client.Bg")
	public int[] field349 = new int[2000];

	@ObfuscatedName("client.Cg")
	public String field350 = "";

	@ObfuscatedName("client.Dg")
	public String[] field351 = new String[500];

	@ObfuscatedName("client.Fg")
	public int field353 = -1;

	@ObfuscatedName("client.Gg")
	public String field354 = "";

	@ObfuscatedName("client.Hg")
	public String field355 = "";

	@ObfuscatedName("client.Jg")
	public int[] field356 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Yg")
	public int[] field370 = new int[5];

	@ObfuscatedName("client.jh")
	public boolean field381 = false;

	@ObfuscatedName("client.nh")
	public int[] field385 = new int[LXOZWTVI.field867];

	@ObfuscatedName("client.sh")
	public int[] field390 = new int[1000];

	@ObfuscatedName("client.uh")
	public int[] field392 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.vh")
	public int field393 = -1;

	@ObfuscatedName("client.Hh")
	public int field404 = 2048;

	@ObfuscatedName("client.Ih")
	public int field405 = 2047;

	@ObfuscatedName("client.Jh")
	public XVMRCEYW[] field406 = new XVMRCEYW[field404];

	@ObfuscatedName("client.Lh")
	public int[] field408 = new int[field404];

	@ObfuscatedName("client.Nh")
	public int[] field410 = new int[field404];

	@ObfuscatedName("client.Oh")
	public NQUAUMDT[] field411 = new NQUAUMDT[field404];

	@ObfuscatedName("client.Sh")
	public FKNRMZJV[] field415 = new FKNRMZJV[8];

	@ObfuscatedName("client.ci")
	public String[] field420 = new String[200];

	@ObfuscatedName("client.li")
	public UZETOFZZ[] field428 = new UZETOFZZ[100];

	@ObfuscatedName("client.ni")
	public byte[] field430 = new byte[16384];

	@ObfuscatedName("client.qi")
	public String field432 = "";

	@ObfuscatedName("client.ri")
	public String field433 = "";

	@ObfuscatedName("client.si")
	public int[][] field434 = new int[104][104];

	@ObfuscatedName("client.ui")
	public int field435 = -1;

	@ObfuscatedName("client.Ci")
	public FKNRMZJV[] field440 = new FKNRMZJV[100];

	@ObfuscatedName("client.Di")
	public int[] field441 = new int[2000];

	@ObfuscatedName("client.Ei")
	public int field442 = 78;

	@ObfuscatedName("client.Fi")
	public int[] field443 = new int[50];

	@ObfuscatedName("client.Ii")
	public String field446 = "";

	@ObfuscatedName("client.Pi")
	public int field453 = -1;

	@ObfuscatedName("client.Qi")
	public boolean field454 = false;

	@ObfuscatedName("client.Si")
	public boolean[] field456 = new boolean[5];

	@ObfuscatedName("client.bj")
	public boolean field465 = false;

	@ObfuscatedName("client.ej")
	public volatile boolean field468 = false;

	@ObfuscatedName("client.fj")
	public volatile boolean field469 = false;

	@ObfuscatedName("client.hj")
	public boolean field471 = true;

	@ObfuscatedName("client.pj")
	public String field478 = "";

	@ObfuscatedName("client.rj")
	public int field479 = -1;

	@ObfuscatedName("client.sj")
	public NQUAUMDT field480 = NQUAUMDT.method327(1);

	@ObfuscatedName("client.zj")
	public int[] field485 = new int[5];

	@ObfuscatedName("client.Aj")
	public FKNRMZJV[] field486 = new FKNRMZJV[32];

	@ObfuscatedName("client.Bj")
	public boolean field487 = false;

	@ObfuscatedName("client.Cj")
	public int[] field488 = new int[5];

	@ObfuscatedName("client.Ej")
	public FKNRMZJV[] field490 = new FKNRMZJV[32];

	@ObfuscatedName("client.Fj")
	public boolean field491 = false;

	@ObfuscatedName("client.Jj")
	public YCMSDYIA[] field494 = new YCMSDYIA[4];

	@ObfuscatedName("client.Kj")
	public FYVRCFGT field495 = new FYVRCFGT();

	@ObfuscatedName("client.Vj")
	public int[] field506 = new int[500];

	@ObfuscatedName("client.Wj")
	public int[] field507 = new int[500];

	@ObfuscatedName("client.Xj")
	public int[] field508 = new int[500];

	@ObfuscatedName("client.Yj")
	public int[] field509 = new int[500];

	@ObfuscatedName("client.bk")
	public int[] field511 = new int[256];

	@ObfuscatedName("client.gk")
	public boolean field514 = false;

	@ObfuscatedName("client.hk")
	public boolean field515 = false;

	@ObfuscatedName("client.lc")
	public static final int[][] field147 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Fc")
	public static int field166 = 10;

	@ObfuscatedName("client.Hc")
	public static boolean field168 = true;

	@ObfuscatedName("client.gd")
	public static String field191 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Xe")
	public static BigInteger field277 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Yh")
	public static final int[] field419 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.ii")
	public static BigInteger field426 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Oi")
	public static int[] field452 = new int[99];

	@ObfuscatedName("client.Gj")
	public static int[] field492 = new int[32];

	@ObfuscatedName("client.rb")
	public int field103;

	@ObfuscatedName("client.vb")
	public int field106;

	@ObfuscatedName("client.yb")
	public int field109;

	@ObfuscatedName("client.Cb")
	public int field113;

	@ObfuscatedName("client.Gb")
	public int field117;

	@ObfuscatedName("client.Hb")
	public int field118;

	@ObfuscatedName("client.Ib")
	public int field119;

	@ObfuscatedName("client.Jb")
	public int field120;

	@ObfuscatedName("client.Kb")
	public int field121;

	@ObfuscatedName("client.Nb")
	public int field124;

	@ObfuscatedName("client.Ob")
	public int field125;

	@ObfuscatedName("client.Pb")
	public int field126;

	@ObfuscatedName("client.Qb")
	public int field127;

	@ObfuscatedName("client.Rb")
	public int field128;

	@ObfuscatedName("client.Sb")
	public int field129;

	@ObfuscatedName("client.Yb")
	public static int field135;

	@ObfuscatedName("client.Zb")
	public int field136;

	@ObfuscatedName("client.ac")
	public int field137;

	@ObfuscatedName("client.bc")
	public int field138;

	@ObfuscatedName("client.cc")
	public int field139;

	@ObfuscatedName("client.dc")
	public int field140;

	@ObfuscatedName("client.ic")
	public int field144;

	@ObfuscatedName("client.qc")
	public int field152;

	@ObfuscatedName("client.sc")
	public int field154;

	@ObfuscatedName("client.uc")
	public static int field156;

	@ObfuscatedName("client.wc")
	public static int field158;

	@ObfuscatedName("client.Gc")
	public static int field167;

	@ObfuscatedName("client.Jc")
	public int field170;

	@ObfuscatedName("client.Kc")
	public int field171;

	@ObfuscatedName("client.Lc")
	public int field172;

	@ObfuscatedName("client.Mc")
	public int field173;

	@ObfuscatedName("client.Xc")
	public static int field184;

	@ObfuscatedName("client.kd")
	public int field194;

	@ObfuscatedName("client.td")
	public int field203;

	@ObfuscatedName("client.ud")
	public int field204;

	@ObfuscatedName("client.vd")
	public int field205;

	@ObfuscatedName("client.xd")
	public int field207;

	@ObfuscatedName("client.zd")
	public static int field209;

	@ObfuscatedName("client.Ad")
	public int field210;

	@ObfuscatedName("client.Bd")
	public int field211;

	@ObfuscatedName("client.Cd")
	public int field212;

	@ObfuscatedName("client.Dd")
	public int field213;

	@ObfuscatedName("client.Ed")
	public int field214;

	@ObfuscatedName("client.Fd")
	public int field215;

	@ObfuscatedName("client.Id")
	public int field217;

	@ObfuscatedName("client.Jd")
	public int field218;

	@ObfuscatedName("client.Ld")
	public int field220;

	@ObfuscatedName("client.Nd")
	public int field222;

	@ObfuscatedName("client.Od")
	public int field223;

	@ObfuscatedName("client.Rd")
	public int field225;

	@ObfuscatedName("client.Yd")
	public int field231;

	@ObfuscatedName("client.Zd")
	public int field232;

	@ObfuscatedName("client.ae")
	public int field233;

	@ObfuscatedName("client.be")
	public int field234;

	@ObfuscatedName("client.ge")
	public int field238;

	@ObfuscatedName("client.he")
	public int field239;

	@ObfuscatedName("client.ie")
	public int field240;

	@ObfuscatedName("client.pe")
	public int field247;

	@ObfuscatedName("client.te")
	public int field251;

	@ObfuscatedName("client.ye")
	public int field255;

	@ObfuscatedName("client.Ae")
	public static int field257;

	@ObfuscatedName("client.Ie")
	public int field262;

	@ObfuscatedName("client.Je")
	public int field263;

	@ObfuscatedName("client.Ke")
	public int field264;

	@ObfuscatedName("client.Le")
	public int field265;

	@ObfuscatedName("client.Ne")
	public int field267;

	@ObfuscatedName("client.Oe")
	public int field268;

	@ObfuscatedName("client.Pe")
	public int field269;

	@ObfuscatedName("client.Se")
	public int field272;

	@ObfuscatedName("client.Te")
	public int field273;

	@ObfuscatedName("client.Ue")
	public int field274;

	@ObfuscatedName("client.Ve")
	public int field275;

	@ObfuscatedName("client.We")
	public int field276;

	@ObfuscatedName("client.Ye")
	public int field278;

	@ObfuscatedName("client.Ze")
	public int field279;

	@ObfuscatedName("client.af")
	public int field280;

	@ObfuscatedName("client.df")
	public int field282;

	@ObfuscatedName("client.ef")
	public int field283;

	@ObfuscatedName("client.ff")
	public int field284;

	@ObfuscatedName("client.hf")
	public int field285;

	@ObfuscatedName("client.jf")
	public int field286;

	@ObfuscatedName("client.kf")
	public int field287;

	@ObfuscatedName("client.lf")
	public int field288;

	@ObfuscatedName("client.mf")
	public static int field289;

	@ObfuscatedName("client.nf")
	public static int field290;

	@ObfuscatedName("client.pf")
	public int field292;

	@ObfuscatedName("client.qf")
	public int field293;

	@ObfuscatedName("client.rf")
	public int field294;

	@ObfuscatedName("client.sf")
	public int field295;

	@ObfuscatedName("client.tf")
	public int field296;

	@ObfuscatedName("client.uf")
	public int field297;

	@ObfuscatedName("client.xf")
	public int field300;

	@ObfuscatedName("client.Ef")
	public int field306;

	@ObfuscatedName("client.If")
	public static int field310;

	@ObfuscatedName("client.Lf")
	public int field312;

	@ObfuscatedName("client.Nf")
	public int field314;

	@ObfuscatedName("client.Of")
	public int field315;

	@ObfuscatedName("client.Sf")
	public int field316;

	@ObfuscatedName("client.Xf")
	public int field321;

	@ObfuscatedName("client.lg")
	public int field333;

	@ObfuscatedName("client.ng")
	public int field335;

	@ObfuscatedName("client.tg")
	public int field341;

	@ObfuscatedName("client.ug")
	public int field342;

	@ObfuscatedName("client.vg")
	public int field343;

	@ObfuscatedName("client.wg")
	public int field344;

	@ObfuscatedName("client.xg")
	public int field345;

	@ObfuscatedName("client.zg")
	public static int field347;

	@ObfuscatedName("client.Eg")
	public int field352;

	@ObfuscatedName("client.ih")
	public int field380;

	@ObfuscatedName("client.mh")
	public int field384;

	@ObfuscatedName("client.oh")
	public int field386;

	@ObfuscatedName("client.ph")
	public int field387;

	@ObfuscatedName("client.rh")
	public int field389;

	@ObfuscatedName("client.wh")
	public int field394;

	@ObfuscatedName("client.zh")
	public int field397;

	@ObfuscatedName("client.Ah")
	public static int field398;

	@ObfuscatedName("client.Kh")
	public int field407;

	@ObfuscatedName("client.Mh")
	public int field409;

	@ObfuscatedName("client.Ph")
	public static int field412;

	@ObfuscatedName("client.Qh")
	public int field413;

	@ObfuscatedName("client.Rh")
	public int field414;

	@ObfuscatedName("client.Th")
	public int field416;

	@ObfuscatedName("client.Wh")
	public int field417;

	@ObfuscatedName("client.Xh")
	public int field418;

	@ObfuscatedName("client.di")
	public int field421;

	@ObfuscatedName("client.ei")
	public int field422;

	@ObfuscatedName("client.fi")
	public int field423;

	@ObfuscatedName("client.gi")
	public int field424;

	@ObfuscatedName("client.mi")
	public int field429;

	@ObfuscatedName("client.pi")
	public int field431;

	@ObfuscatedName("client.vi")
	public static int field436;

	@ObfuscatedName("client.yi")
	public static int field437;

	@ObfuscatedName("client.zi")
	public int field438;

	@ObfuscatedName("client.Ji")
	public int field447;

	@ObfuscatedName("client.Ni")
	public int field451;

	@ObfuscatedName("client.Ri")
	public int field455;

	@ObfuscatedName("client.Ti")
	public int field457;

	@ObfuscatedName("client.Ui")
	public int field458;

	@ObfuscatedName("client.Vi")
	public int field459;

	@ObfuscatedName("client.Wi")
	public int field460;

	@ObfuscatedName("client.Xi")
	public int field461;

	@ObfuscatedName("client.Yi")
	public int field462;

	@ObfuscatedName("client.Zi")
	public int field463;

	@ObfuscatedName("client.gj")
	public int field470;

	@ObfuscatedName("client.ij")
	public int field472;

	@ObfuscatedName("client.Dj")
	public int field489;

	@ObfuscatedName("client.Hj")
	public int field493;

	@ObfuscatedName("client.Lj")
	public static int field496;

	@ObfuscatedName("client.Mj")
	public int field497;

	@ObfuscatedName("client.Nj")
	public int field498;

	@ObfuscatedName("client.Oj")
	public int field499;

	@ObfuscatedName("client.Pj")
	public int field500;

	@ObfuscatedName("client.Sj")
	public int field503;

	@ObfuscatedName("client.Tj")
	public int field504;

	@ObfuscatedName("client.Uj")
	public int field505;

	@ObfuscatedName("client.dk")
	public static int field512;

	@ObfuscatedName("client.fk")
	public int field513;

	@ObfuscatedName("client.L")
	public int field73;

	@ObfuscatedName("client.Q")
	public int field78;

	@ObfuscatedName("client.S")
	public int field79;

	@ObfuscatedName("client.V")
	public int field81;

	@ObfuscatedName("client.X")
	public int field83;

	@ObfuscatedName("client.ab")
	public int field86;

	@ObfuscatedName("client.fb")
	public int field91;

	@ObfuscatedName("client.gb")
	public int field92;

	@ObfuscatedName("client.hb")
	public int field93;

	@ObfuscatedName("client.jb")
	public int field95;

	@ObfuscatedName("client.kb")
	public int field96;

	@ObfuscatedName("client.lb")
	public int field97;

	@ObfuscatedName("client.Wd")
	public long field230;

	@ObfuscatedName("client.Fe")
	public long field261;

	@ObfuscatedName("client.Me")
	public long field266;

	@ObfuscatedName("client.th")
	public long field391;

	@ObfuscatedName("client.Gi")
	public long field444;

	@ObfuscatedName("client.Tb")
	public ERQSZFRT field130;

	@ObfuscatedName("client.Ub")
	public ERQSZFRT field131;

	@ObfuscatedName("client.Vb")
	public ERQSZFRT field132;

	@ObfuscatedName("client.le")
	public ERQSZFRT field243;

	@ObfuscatedName("client.me")
	public ERQSZFRT field244;

	@ObfuscatedName("client.ne")
	public ERQSZFRT field245;

	@ObfuscatedName("client.oe")
	public ERQSZFRT field246;

	@ObfuscatedName("client.Lg")
	public ERQSZFRT field357;

	@ObfuscatedName("client.Mg")
	public ERQSZFRT field358;

	@ObfuscatedName("client.Ng")
	public ERQSZFRT field359;

	@ObfuscatedName("client.Og")
	public ERQSZFRT field360;

	@ObfuscatedName("client.Pg")
	public ERQSZFRT field361;

	@ObfuscatedName("client.Qg")
	public ERQSZFRT field362;

	@ObfuscatedName("client.Rg")
	public ERQSZFRT field363;

	@ObfuscatedName("client.Sg")
	public ERQSZFRT field364;

	@ObfuscatedName("client.Tg")
	public ERQSZFRT field365;

	@ObfuscatedName("client.Zg")
	public ERQSZFRT field371;

	@ObfuscatedName("client.ah")
	public ERQSZFRT field372;

	@ObfuscatedName("client.bh")
	public ERQSZFRT field373;

	@ObfuscatedName("client.ch")
	public ERQSZFRT field374;

	@ObfuscatedName("client.dh")
	public ERQSZFRT field375;

	@ObfuscatedName("client.eh")
	public ERQSZFRT field376;

	@ObfuscatedName("client.fh")
	public ERQSZFRT field377;

	@ObfuscatedName("client.gh")
	public ERQSZFRT field378;

	@ObfuscatedName("client.hh")
	public ERQSZFRT field379;

	@ObfuscatedName("client.Lb")
	public FKNRMZJV field122;

	@ObfuscatedName("client.Mb")
	public FKNRMZJV field123;

	@ObfuscatedName("client.mc")
	public FKNRMZJV field148;

	@ObfuscatedName("client.id")
	public FKNRMZJV field192;

	@ObfuscatedName("client.jd")
	public FKNRMZJV field193;

	@ObfuscatedName("client.pg")
	public FKNRMZJV field337;

	@ObfuscatedName("client.kh")
	public FKNRMZJV field382;

	@ObfuscatedName("client.qh")
	public FKNRMZJV field388;

	@ObfuscatedName("client.jj")
	public FKNRMZJV field473;

	@ObfuscatedName("client.kj")
	public FKNRMZJV field474;

	@ObfuscatedName("client.lj")
	public FKNRMZJV field475;

	@ObfuscatedName("client.mj")
	public FKNRMZJV field476;

	@ObfuscatedName("client.nj")
	public FKNRMZJV field477;

	@ObfuscatedName("client.Qj")
	public FKNRMZJV field501;

	@ObfuscatedName("client.Rj")
	public FKNRMZJV field502;

	@ObfuscatedName("client.Ai")
	public KAZZDHJI field439;

	@ObfuscatedName("client.Gh")
	public NJYVZTLI field403;

	@ObfuscatedName("client.ji")
	public QIACHOJO field427;

	@ObfuscatedName("client.je")
	public RQLSQIAP field241;

	@ObfuscatedName("client.De")
	public RSPRYUFS field259;

	@ObfuscatedName("client.Ug")
	public TJCUOFPI field366;

	@ObfuscatedName("client.Vg")
	public TJCUOFPI field367;

	@ObfuscatedName("client.Wg")
	public TJCUOFPI field368;

	@ObfuscatedName("client.Xg")
	public TJCUOFPI field369;

	@ObfuscatedName("client.Vc")
	public UJWODGQS field182;

	@ObfuscatedName("client.zc")
	public UZETOFZZ field160;

	@ObfuscatedName("client.Ac")
	public UZETOFZZ field161;

	@ObfuscatedName("client.Bc")
	public UZETOFZZ field162;

	@ObfuscatedName("client.Cc")
	public UZETOFZZ field163;

	@ObfuscatedName("client.Dc")
	public UZETOFZZ field164;

	@ObfuscatedName("client.nd")
	public UZETOFZZ field197;

	@ObfuscatedName("client.od")
	public UZETOFZZ field198;

	@ObfuscatedName("client.pd")
	public UZETOFZZ field199;

	@ObfuscatedName("client.qd")
	public UZETOFZZ field200;

	@ObfuscatedName("client.rd")
	public UZETOFZZ field201;

	@ObfuscatedName("client.Af")
	public UZETOFZZ field303;

	@ObfuscatedName("client.Bf")
	public UZETOFZZ field304;

	@ObfuscatedName("client.xh")
	public UZETOFZZ field395;

	@ObfuscatedName("client.yh")
	public UZETOFZZ field396;

	@ObfuscatedName("client.Ch")
	public UZETOFZZ field399;

	@ObfuscatedName("client.Dh")
	public UZETOFZZ field400;

	@ObfuscatedName("client.Eh")
	public UZETOFZZ field401;

	@ObfuscatedName("client.Ki")
	public UZETOFZZ field448;

	@ObfuscatedName("client.Li")
	public UZETOFZZ field449;

	@ObfuscatedName("client.Mi")
	public UZETOFZZ field450;

	@ObfuscatedName("client.lh")
	public static XVMRCEYW field383;

	@ObfuscatedName("client.Nc")
	public String field174;

	@ObfuscatedName("client.Vd")
	public String field229;

	@ObfuscatedName("client.hi")
	public String field425;

	@ObfuscatedName("client.T")
	public String field80;

	@ObfuscatedName("client.hc")
	public Socket field143;

	@ObfuscatedName("client.tb")
	public static boolean field105;

	@ObfuscatedName("client.Ic")
	public static boolean field169;

	@ObfuscatedName("client.Ee")
	public static boolean field260;

	@ObfuscatedName("client.Hi")
	public static boolean field445;

	@ObfuscatedName("client.Oc")
	public int[] field175;

	@ObfuscatedName("client.Pc")
	public int[] field176;

	@ObfuscatedName("client.Qc")
	public int[] field177;

	@ObfuscatedName("client.Rc")
	public int[] field178;

	@ObfuscatedName("client.ad")
	public int[] field187;

	@ObfuscatedName("client.bd")
	public int[] field188;

	@ObfuscatedName("client.Ff")
	public int[] field307;

	@ObfuscatedName("client.Gf")
	public int[] field308;

	@ObfuscatedName("client.Hf")
	public int[] field309;

	@ObfuscatedName("client.cj")
	public int[] field466;

	@ObfuscatedName("client.dj")
	public int[] field467;

	@ObfuscatedName("client.tj")
	public int[] field481;

	@ObfuscatedName("client.uj")
	public int[] field482;

	@ObfuscatedName("client.vj")
	public int[] field483;

	@ObfuscatedName("client.wj")
	public int[] field484;

	@ObfuscatedName("client.Hd")
	public UZETOFZZ[] field216;

	@ObfuscatedName("client.qg")
	public byte[][] field338;

	@ObfuscatedName("client.ak")
	public byte[][] field510;

	@ObfuscatedName("client.aj")
	public byte[][][] field464;

	@ObfuscatedName("client.Fh")
	public int[][][] field402;

	@ObfuscatedName("client.g(I)V")
	public final void method18() {
		if (field255 == 0 && field559 == 1) {
			int var1 = field560 - 25 - 550;
			int var2 = field561 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field282 + field194 & 0x7FF;
				int var4 = ZVPDLSTW.field1503[var3];
				int var5 = ZVPDLSTW.field1504[var3];
				var4 = (field73 + 256) * var4 >> 8;
				var5 = (field73 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field383.field1342 + var6 >> 7;
				int var9 = field383.field1343 - var7 >> 7;
				boolean var10 = method156(0, 0, var9, 0, field383.field1352[0], 0, var8, 0, true, 1, field383.field1351[0]);
				if (var10) {
					field332.method329(var1);
					field332.method329(var2);
					field332.method330(field282);
					field332.method329(57);
					field332.method329(field194);
					field332.method329(field73);
					field332.method329(89);
					field332.method330(field383.field1342);
					field332.method330(field383.field1343);
					field332.method329(field288);
					field332.method329(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void method19() {
		if (field140 > 0) {
			method23();
		} else {
			method24("Please wait - attempting to reestablish", "Connection lost");
			field255 = 0;
			field386 = 0;
			QIACHOJO var1 = field427;
			field313 = false;
			field247 = 0;
			method38(field432, field433, true);

			if (!field313) {
				method23();
			}

			try {
				var1.method420();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		CPAFTRRP var10 = null;
		for (CPAFTRRP var11 = (CPAFTRRP) field100.method200(); var11 != null; var11 = (CPAFTRRP) field100.method202()) {
			if (var11.field516 == arg6 && var11.field518 == arg7 && var11.field519 == arg3 && var11.field517 == arg8) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new CPAFTRRP();
			var10.field516 = arg6;
			var10.field517 = arg8;
			var10.field518 = arg7;
			var10.field519 = arg3;
			method139(var10);
			field100.method197(var10);
		}

		var10.field521 = arg2;
		var10.field523 = arg1;
		var10.field522 = arg0;
		var10.field520 = arg4;
		var10.field524 = arg5;
	}

	@ObfuscatedName("client.a(ILVGGOSQRK;B)I")
	public final int method21(int arg0, VGGOSQRK arg1) {
		if (arg1.field1238 == null || arg0 >= arg1.field1238.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1238[arg0];
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
					var8 = field385[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field302[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field291[var3[var5++]];
				}

				if (var7 == 4) {
					VGGOSQRK var10 = VGGOSQRK.method538(var3[var5++]);
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < ULRRTYRQ.field1160 && (!ULRRTYRQ.method520(var11).field1190 || field168)) {
						for (int var12 = 0; var12 < var10.field1210.length; var12++) {
							if (var11 + 1 == var10.field1210[var12]) {
								var8 += var10.field1233[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field441[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field452[field302[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field441[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field383.field1391;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < LXOZWTVI.field867; var13++) {
						if (LXOZWTVI.field869[var13]) {
							var8 += field302[var13];
						}
					}
				}

				if (var7 == 10) {
					VGGOSQRK var14 = VGGOSQRK.method538(var3[var5++]);
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < ULRRTYRQ.field1160 && (!ULRRTYRQ.method520(var15).field1190 || field168)) {
						for (int var16 = 0; var16 < var14.field1210.length; var16++) {
							if (var14.field1210[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field103;
				}

				if (var7 == 12) {
					var8 = field418;
				}

				if (var7 == 13) {
					int var17 = field441[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					JYNIYSOU var20 = JYNIYSOU.field748[var19];
					int var21 = var20.field750;
					int var22 = var20.field751;
					int var23 = var20.field752;
					int var24 = field492[var23 - var22];
					var8 = field441[var21] >> var22 & var24;
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
					var8 = (field383.field1342 >> 7) + field262;
				}

				if (var7 == 19) {
					var8 = (field383.field1343 >> 7) + field263;
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

	@ObfuscatedName("client.h(I)Ljava/net/Socket;")
	public final Socket method22(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(B)V")
	public final void method23() {
		try {
			if (field427 != null) {
				field427.method420();
			}
		} catch (Exception var2) {
		}

		field427 = null;
		field313 = false;
		field144 = 0;
		field432 = "";
		field433 = "";
		method143();
		field182.method458();

		for (int var1 = 0; var1 < 4; var1++) {
			field494[var1].method561();
		}

		System.gc();
		method65();
		field134 = -1;
		field470 = -1;
		field78 = 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;I)V")
	public final void method24(String arg0, String arg1) {
		if (field245 != null) {
			field245.method173();
			ZVPDLSTW.field1505 = field483;
			int var3 = 151;
			if (arg0 != null) {
				var3 -= 7;
			}

			field367.method435(0, var3, arg1, 257);
			field367.method435(0xFFFFFF, var3 - 1, arg1, 256);
			var3 += 15;
			if (arg0 != null) {
				field367.method435(0, var3, arg0, 257);
				field367.method435(0xFFFFFF, var3 - 1, arg0, 256);
			}

			field245.method174(field545, 4, 4);
		} else if (field546 != null) {
			field546.method173();
			ZVPDLSTW.field1505 = field484;
			int var4 = 251;
			short var5 = 300;
			byte var6 = 50;
			VMBJKBNJ.method547(var5, 383 - var5 / 2, var6, var4 - var6 / 2 - 5, 0);
			VMBJKBNJ.method548(383 - var5 / 2, var5, 0xFFFFFF, var6, var4 - var6 / 2 - 5);

			if (arg0 != null) {
				var4 -= 7;
			}

			field367.method435(0, var4, arg1, 383);
			field367.method435(0xFFFFFF, var4 - 1, arg1, 382);
			var4 += 15;
			if (arg0 != null) {
				field367.method435(0, var4, arg0, 383);
				field367.method435(0xFFFFFF, var4 - 1, arg0, 382);
			}

			field546.method174(field545, 0, 0);
		}
	}

	@ObfuscatedName("client.a(II)V")
	public final void method25(int arg0) {
		if (!field169) {
			for (int var2 = 0; var2 < field356.length; var2++) {
				int var3 = field356[var2];
				if (ZVPDLSTW.field1513[var3] >= arg0) {
					UZETOFZZ var4 = ZVPDLSTW.field1507[var3];
					int var5 = var4.field1205 * var4.field1204 - 1;
					int var6 = field106 * var4.field1204 * 2;
					byte[] var7 = var4.field1202;
					byte[] var8 = field430;
					for (int var9 = 0; var9 <= var5; var9++) {
						var8[var9] = var7[var9 - var6 & var5];
					}

					var4.field1202 = var8;
					field430 = var7;
					ZVPDLSTW.method595(var3);
				}
			}

			field135++;
			if (field135 > 136) {
				field135 = 0;
				field332.method328(68);
				field332.method330(8854);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method26(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.i(I)Z")
	public final boolean method27() {
		if (field427 == null) {
			return false;
		}

		try {
			int var1 = field427.method422();
			if (var1 == 0) {
				return false;
			}

			if (field137 == -1) {
				field427.method423(field480.field928, 0, 1);
				field137 = field480.field928[0] & 0xFF;
				if (field439 != null) {
					field137 = field137 - field439.method241() & 0xFF;
				}

				field136 = GERGIESA.field651[field137];
				var1--;
			}

			if (field136 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field427.method423(field480.field928, 0, 1);
				field136 = field480.field928[0] & 0xFF;
				var1--;
			}

			if (field136 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field427.method423(field480.field928, 0, 2);
				field480.field929 = 0;
				field136 = field480.method341();
				var1 -= 2;
			}

			if (var1 < field136) {
				return false;
			}

			field480.field929 = 0;
			field427.method423(field480.field928, 0, field136);
			field138 = 0;
			field205 = field204;
			field204 = field203;
			field203 = field137;

			if (field137 == 139) {
				int var2 = field480.method341();
				if (var2 == 0xFFFF) {
					var2 = -1;
				}

				if (field134 != var2 && field165 && !field169 && field78 == 0) {
					field470 = var2;
					field471 = true;
					field403.method306(2, field470);
				}

				field134 = var2;
				field137 = -1;
				return true;
			}

			if (field137 == 93) {
				int var3 = field480.method371();
				int var4 = field480.method368();
				if (field165 && !field169) {
					field470 = var4;
					field471 = false;
					field403.method306(2, field470);
					field78 = var3;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 23) {
				field215 = field480.method359();
				field214 = field480.method358();
				field137 = -1;
				return true;
			}

			if (field137 == 229) {
				field491 = true;
				int var5 = field480.method341();
				VGGOSQRK var6 = VGGOSQRK.method538(var5);
				while (field480.field929 < field136) {
					int var7 = field480.method353();
					int var8 = field480.method341();
					int var9 = field480.method339();
					if (var9 == 255) {
						var9 = field480.method344();
					}

					if (var7 >= 0 && var7 < var6.field1210.length) {
						var6.field1210[var7] = var8;
						var6.field1233[var7] = var9;
					}
				}

				field137 = -1;
				return true;
			}

			if (field137 == 185) {
				if (field145 != -1) {
					method32(field145);
					field145 = -1;
					field491 = true;
					field190 = true;
				}

				if (field305 != -1) {
					method32(field305);
					field305 = -1;
					field514 = true;
				}

				if (field227 != -1) {
					method32(field227);
					field227 = -1;
					field98 = true;
				}

				if (field353 != -1) {
					method32(field353);
					field353 = -1;
				}

				if (field319 != -1) {
					method32(field319);
					field319 = -1;
				}

				if (field225 != 0) {
					field225 = 0;
					field514 = true;
				}

				field346 = false;
				field137 = -1;
				return true;
			}

			if (field137 == 125) {
				field113 = field480.method339();
				if (field113 == 1) {
					field300 = field480.method341();
				}

				if (field113 >= 2 && field113 <= 6) {
					if (field113 == 2) {
						field275 = 64;
						field276 = 64;
					}

					if (field113 == 3) {
						field275 = 0;
						field276 = 64;
					}

					if (field113 == 4) {
						field275 = 128;
						field276 = 64;
					}

					if (field113 == 5) {
						field275 = 64;
						field276 = 0;
					}

					if (field113 == 6) {
						field275 = 64;
						field276 = 128;
					}

					field113 = 2;
					field272 = field480.method341();
					field273 = field480.method341();
					field274 = field480.method339();
				}

				if (field113 == 10) {
					field314 = field480.method341();
				}

				field137 = -1;
				return true;
			}

			if (field137 == 241) {
				field414 = field480.method339();
				field154 = field480.method339();
				field269 = field480.method339();
				field515 = true;
				field514 = true;
				field137 = -1;
				return true;
			}

			if (field137 == 194) {
				int var10 = field480.method368();
				int var11 = field480.method368();
				int var12 = field480.method367();
				int var13 = field480.method368();
				VGGOSQRK.method538(var11).field1229 = var13;
				VGGOSQRK.method538(var11).field1230 = var10;
				VGGOSQRK.method538(var11).field1228 = var12;
				field137 = -1;
				return true;
			}

			if (field137 == 158) {
				field417 = field480.method339();
				field137 = -1;
				return true;
			}

			if (field137 == 223) {
				field393 = field480.method339();
				if (field393 == field107) {
					if (field393 == 3) {
						field107 = 1;
					} else {
						field107 = 3;
					}

					field491 = true;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 103) {
				field479 = field480.method368();
				field463 = field480.method359();
				field137 = -1;
				return true;
			}

			if (field137 == 28) {
				String var14 = field480.method346();
				if (var14.endsWith(":tradereq:")) {
					String var15 = var14.substring(0, var14.indexOf(":"));
					long var16 = SISNGPYM.method428(var15);
					boolean var18 = false;
					for (int var19 = 0; var19 < field451; var19++) {
						if (field236[var19] == var16) {
							var18 = true;
							break;
						}
					}

					if (!var18 && field493 == 0) {
						method67(var15, 4, "wishes to trade with you.");
					}
				} else if (var14.endsWith(":duelreq:")) {
					String var20 = var14.substring(0, var14.indexOf(":"));
					long var21 = SISNGPYM.method428(var20);
					boolean var23 = false;
					for (int var24 = 0; var24 < field451; var24++) {
						if (field236[var24] == var21) {
							var23 = true;
							break;
						}
					}

					if (!var23 && field493 == 0) {
						method67(var20, 8, "wishes to duel with you.");
					}
				} else if (var14.endsWith(":chalreq:")) {
					String var25 = var14.substring(0, var14.indexOf(":"));
					long var26 = SISNGPYM.method428(var25);
					boolean var28 = false;
					for (int var29 = 0; var29 < field451; var29++) {
						if (field236[var29] == var26) {
							var28 = true;
							break;
						}
					}

					if (!var28 && field493 == 0) {
						String var30 = var14.substring(var14.indexOf(":") + 1, var14.length() - 9);
						method67(var25, 8, var30);
					}
				} else {
					method67("", 0, var14);
				}

				field137 = -1;
				return true;
			}

			if (field137 == 190) {
				int var31 = field480.method367();
				method60(var31);

				if (field305 != -1) {
					method32(field305);
					field305 = -1;
					field514 = true;
				}

				if (field227 != -1) {
					method32(field227);
					field227 = -1;
					field98 = true;
				}

				if (field353 != -1) {
					method32(field353);
					field353 = -1;
				}

				if (field319 != -1) {
					method32(field319);
					field319 = -1;
				}

				if (field145 != var31) {
					method32(field145);
					field145 = var31;
				}

				if (field225 != 0) {
					field225 = 0;
					field514 = true;
				}

				field491 = true;
				field190 = true;
				field346 = false;
				field137 = -1;
				return true;
			}

			if (field137 == 236) {
				field465 = true;
				field457 = field480.method339();
				field458 = field480.method339();
				field459 = field480.method341();
				field460 = field480.method339();
				field461 = field480.method339();
				if (field461 >= 100) {
					field125 = field457 * 128 + 64;
					field127 = field458 * 128 + 64;
					field126 = method69(field125, field503, field127) - field459;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 127) {
				field107 = field480.method357();
				field491 = true;
				field190 = true;
				field137 = -1;
				return true;
			}

			if (field137 == 72) {
				field215 = field480.method359();
				field214 = field480.method359();

				while (field480.field929 < field136) {
					int var32 = field480.method339();
					method35(field480, var32);
				}

				field137 = -1;
				return true;
			}

			if (field137 == 249) {
				if (field107 == 12) {
					field491 = true;
				}

				field103 = field480.method339();
				field137 = -1;
				return true;
			}

			if (field137 == 21) {
				field451 = field136 / 8;
				for (int var33 = 0; var33 < field451; var33++) {
					field236[var33] = field480.method345();
				}

				field137 = -1;
				return true;
			}

			if (field137 == 7) {
				field480.method367();
				field480.method339();
				field280 = field480.method366();
				field421 = field480.method367();
				field239 = field480.method368();
				field480.method367();
				field233 = field480.method368();
				field480.method368();
				field489 = field480.method366();
				field335 = field480.method368();
				field438 = field480.method373();
				signlink.dnslookup(SISNGPYM.method431(field438));
				field137 = -1;
				return true;
			}

			if (field137 == 57) {
				int var34 = field480.method342();
				if (field453 != var34) {
					method32(field453);
					field453 = var34;
				}

				field514 = true;
				field137 = -1;
				return true;
			}

			if (field137 == 118) {
				int var35 = field480.method370();
				int var36 = field480.method369();
				int var37 = field480.method341();
				VGGOSQRK var38 = VGGOSQRK.method538(var37);
				var38.field1271 = var35;
				var38.field1227 = var36;
				field137 = -1;
				return true;
			}

			if (field137 == 73) {
				long var39 = field480.method345();
				int var41 = field480.method344();
				int var42 = field480.method339();
				boolean var43 = false;
				for (int var44 = 0; var44 < 100; var44++) {
					if (field112[var44] == var41) {
						var43 = true;
						break;
					}
				}

				if (var42 <= 1) {
					for (int var45 = 0; var45 < field451; var45++) {
						if (field236[var45] == var39) {
							var43 = true;
							break;
						}
					}
				}

				if (!var43 && field493 == 0) {
					try {
						field112[field431] = var41;
						field431 = (field431 + 1) % 100;
						String var46 = ZIBXIXQC.method580(field136 - 13, field480);
						if (var42 != 3) {
							var46 = NGLCBGTC.method277(var46);
						}

						if (var42 == 2 || var42 == 3) {
							method67("@cr2@" + SISNGPYM.method432(SISNGPYM.method429(var39)), 7, var46);
						} else if (var42 == 1) {
							method67("@cr1@" + SISNGPYM.method432(SISNGPYM.method429(var39)), 7, var46);
						} else {
							method67(SISNGPYM.method432(SISNGPYM.method429(var39)), 3, var46);
						}
					} catch (Exception var189) {
						signlink.reporterror("cde1");
					}
				}

				field137 = -1;
				return true;
			}

			if (field137 == 40) {
				field465 = true;
				field292 = field480.method339();
				field293 = field480.method339();
				field294 = field480.method341();
				field295 = field480.method339();
				field296 = field480.method339();
				if (field296 >= 100) {
					int var48 = field292 * 128 + 64;
					int var49 = field293 * 128 + 64;
					int var50 = method69(var48, field503, var49) - field294;
					int var51 = var48 - field125;
					int var52 = var50 - field126;
					int var53 = var49 - field127;
					int var54 = (int) Math.sqrt(var51 * var51 + var53 * var53);
					field128 = (int) (Math.atan2(var52, var54) * 325.949D) & 0x7FF;
					field129 = (int) (Math.atan2(var51, var53) * -325.949D) & 0x7FF;

					if (field128 < 128) {
						field128 = 128;
					}

					if (field128 > 383) {
						field128 = 383;
					}
				}

				field137 = -1;
				return true;
			}

			if (field137 == 49) {
				int var55 = field480.method366();
				int var56 = field480.method341();
				method60(var56);

				if (var55 != -1) {
					method60(var55);
				}

				if (field319 != -1) {
					method32(field319);
					field319 = -1;
				}

				if (field145 != -1) {
					method32(field145);
					field145 = -1;
				}

				if (field305 != -1) {
					method32(field305);
					field305 = -1;
				}

				if (field227 != var56) {
					method32(field227);
					field227 = var56;
				}

				if (field353 != var56) {
					method32(field353);
					field353 = var55;
				}

				field225 = 0;
				field346 = false;
				field137 = -1;
				return true;
			}

			if (field137 == 121) {
				long var57 = field480.method345();
				int var59 = field480.method339();
				String var60 = SISNGPYM.method432(SISNGPYM.method429(var57));
				for (int var61 = 0; var61 < field231; var61++) {
					if (field331[var61] == var57) {
						if (field189[var61] != var59) {
							field189[var61] = var59;
							field491 = true;

							if (var59 > 0) {
								method67("", 5, var60 + " has logged in.");
							}

							if (var59 == 0) {
								method67("", 5, var60 + " has logged out.");
							}
						}

						var60 = null;
						break;
					}
				}

				if (var60 != null && field231 < 200) {
					field331[field231] = var57;
					field420[field231] = var60;
					field189[field231] = var59;
					field231++;
					field491 = true;
				}

				boolean var62 = false;
				while (!var62) {
					var62 = true;
					for (int var63 = 0; var63 < field231 - 1; var63++) {
						if (field189[var63] != field166 && field189[var63 + 1] == field166 || field189[var63] == 0 && field189[var63 + 1] != 0) {
							int var64 = field189[var63];
							field189[var63] = field189[var63 + 1];
							field189[var63 + 1] = var64;
							String var65 = field420[var63];
							field420[var63] = field420[var63 + 1];
							field420[var63 + 1] = var65;
							long var66 = field331[var63];
							field331[var63] = field331[var63 + 1];
							field331[var63 + 1] = var66;
							field491 = true;
							var62 = false;
						}
					}
				}

				field137 = -1;
				return true;
			}

			if (field137 == 123) {
				field465 = false;

				for (int var68 = 0; var68 < 5; var68++) {
					field456[var68] = false;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 51) {
				field87 = false;
				field225 = 2;
				field478 = "";
				field514 = true;
				field137 = -1;
				return true;
			}

			if (field137 == 26) {
				int var69 = field480.method342();
				if (var69 >= 0) {
					method60(var69);
				}

				if (field336 != var69) {
					method32(field336);
					field336 = var69;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 82) {
				if (field107 == 12) {
					field491 = true;
				}

				field418 = field480.method342();
				field137 = -1;
				return true;
			}

			if (field137 == 237) {
				for (int var70 = 0; var70 < field406.length; var70++) {
					if (field406[var70] != null) {
						field406[var70].field1345 = -1;
					}
				}

				for (int var71 = 0; var71 < field151.length; var71++) {
					if (field151[var71] != null) {
						field151[var71].field1345 = -1;
					}
				}

				field137 = -1;
				return true;
			}

			if (field137 == 181) {
				method113(field136, field480);
				field252 = false;
				field137 = -1;
				return true;
			}

			if (field137 == 128) {
				field232 = field480.method339();
				field491 = true;
				field137 = -1;
				return true;
			}

			if (field137 == 69) {
				field214 = field480.method359();
				field215 = field480.method359();
				for (int var72 = field214; var72 < field214 + 8; var72++) {
					for (int var73 = field215; var73 < field215 + 8; var73++) {
						if (field348[field503][var72][var73] != null) {
							field348[field503][var72][var73] = null;
							method98(var72, var73);
						}
					}
				}

				for (CPAFTRRP var74 = (CPAFTRRP) field100.method200(); var74 != null; var74 = (CPAFTRRP) field100.method202()) {
					if (var74.field518 >= field214 && var74.field518 < field214 + 8 && var74.field519 >= field215 && var74.field519 < field215 + 8 && field503 == var74.field516) {
						var74.field524 = 0;
					}
				}

				field137 = -1;
				return true;
			}

			if (field137 == 91) {
				int var75 = field480.method368();
				VGGOSQRK var76 = VGGOSQRK.method538(var75);
				for (int var77 = 0; var77 < var76.field1210.length; var77++) {
					var76.field1210[var77] = -1;
					var76.field1210[var77] = 0;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 126) {
				int var78 = field480.method341();
				int var79 = field480.method339();
				int var80 = field480.method341();
				if (var80 == 0xFFFF) {
					if (field416 < 50) {
						field183[field416] = (short) var78;
						field443[field416] = var79;
						field339[field416] = 0;
						field416++;
					}
				} else if (field133 && !field169 && field416 < 50) {
					field183[field416] = var78;
					field443[field416] = var79;
					field339[field416] = MDGCJDZI.field871[var78] + var80;
					field416++;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 81) {
				field87 = false;
				field225 = 1;
				field478 = "";
				field514 = true;
				field137 = -1;
				return true;
			}

			if (field137 == 120) {
				field491 = true;
				int var81 = field480.method341();
				VGGOSQRK var82 = VGGOSQRK.method538(var81);
				int var83 = field480.method341();
				for (int var84 = 0; var84 < var83; var84++) {
					int var85 = field480.method358();
					if (var85 == 255) {
						var85 = field480.method375();
					}

					var82.field1210[var84] = field480.method366();
					var82.field1233[var84] = var85;
				}

				for (int var86 = var83; var86 < var82.field1210.length; var86++) {
					var82.field1210[var86] = 0;
					var82.field1233[var86] = 0;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 198) {
				int var87 = field480.method367();
				int var88 = field480.method374();
				field349[var87] = var88;

				if (field441[var87] != var88) {
					field441[var87] = var88;
					method157(var87);
					field491 = true;

					if (field453 != -1) {
						field514 = true;
					}
				}

				field137 = -1;
				return true;
			}

			if (field137 == 212) {
				int var89 = field480.method341();
				String var90 = field480.method346();
				VGGOSQRK.method538(var89).field1282 = var90;

				if (field392[field107] == VGGOSQRK.method538(var89).field1272) {
					field491 = true;
				}

				field137 = -1;
				return true;
			}

			if (field137 == 238) {
				int var91 = field480.method339();
				int var92 = field480.method339();
				int var93 = field480.method339();
				int var94 = field480.method339();
				field456[var91] = true;
				field488[var91] = var92;
				field221[var91] = var93;
				field370[var91] = var94;
				field485[var91] = 0;
				field137 = -1;
				return true;
			}

			if (field137 == 131) {
				method115(field480, field136);
				field137 = -1;
				return true;
			}

			if (field137 == 75) {
				field79 = field480.method367() * 30;
				field137 = -1;
				return true;
			}

			if (field137 != 61 && field137 != 37) {
				if (field137 == 76) {
					int var145 = field480.method366();
					int var146 = field480.method366();
					int var147 = field480.method366();
					if (var147 == 0xFFFF) {
						VGGOSQRK.method538(var145).field1215 = 0;
						field137 = -1;
						return true;
					}

					ULRRTYRQ var148 = ULRRTYRQ.method520(var147);
					VGGOSQRK.method538(var145).field1215 = 4;
					VGGOSQRK.method538(var145).field1216 = var147;
					VGGOSQRK.method538(var145).field1229 = var148.field1159;
					VGGOSQRK.method538(var145).field1230 = var148.field1163;
					VGGOSQRK.method538(var145).field1228 = var148.field1201 * 100 / var146;
					field137 = -1;
					return true;
				}

				if (field137 != 58) {
					if (field137 == 4) {
						int var151 = field480.method366();
						int var152 = field480.method367();
						VGGOSQRK.method538(var151).field1215 = 1;
						VGGOSQRK.method538(var151).field1216 = var152;
						field137 = -1;
						return true;
					}

					if (field137 == 204) {
						int var153 = field480.method366();
						int var154 = field480.method370();
						VGGOSQRK var155 = VGGOSQRK.method538(var153);
						if (var155.field1235 != var154 || var154 == -1) {
							var155.field1235 = var154;
							var155.field1243 = 0;
							var155.field1211 = 0;
						}

						field137 = -1;
						return true;
					}

					if (field137 == 112 || field137 == 41 || field137 == 172 || field137 == 220 || field137 == 87 || field137 == 219 || field137 == 13 || field137 == 226 || field137 == 221 || field137 == 134 || field137 == 105) {
						method35(field480, field137);
						field137 = -1;
						return true;
					}

					if (field137 == 29) {
						int var156 = field480.method366();
						VGGOSQRK.method538(var156).field1215 = 3;

						if (field383.field1377 == null) {
							VGGOSQRK.method538(var156).field1216 = (field383.field1381[11] << 5) + (field383.field1381[8] << 10) + (field383.field1381[0] << 15) + (field383.field1392[0] << 25) + (field383.field1392[4] << 20) + field383.field1381[1];
						} else {
							VGGOSQRK.method538(var156).field1216 = (int) (field383.field1377.field33 + 0x12345678L);
						}

						field137 = -1;
						return true;
					}

					if (field137 == 166) {
						for (int var157 = 0; var157 < field441.length; var157++) {
							if (field441[var157] != field349[var157]) {
								field441[var157] = field349[var157];
								method157(var157);
								field491 = true;
							}
						}

						field137 = -1;
						return true;
					}

					if (field137 == 3) {
						int var158 = field480.method359();
						int var159 = field480.method341();
						if (var159 == 0xFFFF) {
							var159 = -1;
						}

						if (field392[var158] != var159) {
							method32(field392[var158]);
							field392[var158] = var159;
						}

						field491 = true;
						field190 = true;
						field137 = -1;
						return true;
					}

					if (field137 == 33) {
						int var160 = field480.method368();
						int var161 = field480.method366();
						int var162 = field480.method366();
						VGGOSQRK.method538(var160).field1276 = (var161 << 16) + var162;
						field137 = -1;
						return true;
					}

					if (field137 == 89) {
						field255 = field480.method339();
						field137 = -1;
						return true;
					}

					if (field137 == 122) {
						field386 = 0;
						field137 = -1;
						return true;
					}

					if (field137 == 255) {
						int var163 = field480.method367();
						method60(var163);

						if (field145 != -1) {
							method32(field145);
							field145 = -1;
							field491 = true;
							field190 = true;
						}

						if (field305 != -1) {
							method32(field305);
							field305 = -1;
							field514 = true;
						}

						if (field227 != -1) {
							method32(field227);
							field227 = -1;
							field98 = true;
						}

						if (field353 != -1) {
							method32(field353);
							field353 = -1;
						}

						if (field319 != var163) {
							method32(field319);
							field319 = var163;
						}

						if (field225 != 0) {
							field225 = 0;
							field514 = true;
						}

						field346 = false;
						field137 = -1;
						return true;
					}

					if (field137 == 153) {
						method23();
						field137 = -1;
						return false;
					}

					if (field137 == 10) {
						int var164 = field480.method366();
						method60(var164);

						if (field145 != -1) {
							method32(field145);
							field145 = -1;
							field491 = true;
							field190 = true;
						}

						if (field227 != -1) {
							method32(field227);
							field227 = -1;
							field98 = true;
						}

						if (field353 != -1) {
							method32(field353);
							field353 = -1;
						}

						if (field319 != -1) {
							method32(field319);
							field319 = -1;
						}

						if (field305 != var164) {
							method32(field305);
							field305 = var164;
						}

						field346 = false;
						field514 = true;
						field137 = -1;
						return true;
					}

					if (field137 == 32) {
						int var165 = field480.method341();
						boolean var166 = field480.method339() == 1;
						VGGOSQRK.method538(var165).field1245 = var166;
						field137 = -1;
						return true;
					}

					if (field137 == 234) {
						int var167 = field480.method366();
						int var168 = field480.method368();
						VGGOSQRK var169 = VGGOSQRK.method538(var167);
						if (var169 != null && var169.field1279 == 0) {
							if (var168 < 0) {
								var168 = 0;
							}

							if (var168 > var169.field1275 - var169.field1274) {
								var168 = var169.field1275 - var169.field1274;
							}

							var169.field1234 = var168;
						}

						field137 = -1;
						return true;
					}

					if (field137 == 213) {
						int var170 = field480.method366();
						int var171 = field480.method341();
						int var172 = var170 >> 10 & 0x1F;
						int var173 = var170 >> 5 & 0x1F;
						int var174 = var170 & 0x1F;
						VGGOSQRK.method538(var171).field1263 = (var174 << 3) + (var172 << 19) + (var173 << 11);
						field137 = -1;
						return true;
					}

					if (field137 == 66) {
						byte var175 = field480.method361();
						int var176 = field480.method367();
						field349[var176] = var175;

						if (field441[var176] != var175) {
							field441[var176] = var175;
							method157(var176);
							field491 = true;

							if (field453 != -1) {
								field514 = true;
							}
						}

						field137 = -1;
						return true;
					}

					if (field137 == 244) {
						String var177 = field480.method346();
						int var178 = field480.method359();
						int var179 = field480.method358();
						if (var178 >= 1 && var178 <= 5) {
							if (var177.equalsIgnoreCase("null")) {
								var177 = null;
							}

							field253[var178 - 1] = var177;
							field254[var178 - 1] = var179 == 0;
						}

						field137 = -1;
						return true;
					}

					if (field137 == 141) {
						field491 = true;
						int var180 = field480.method357();
						int var181 = field480.method373();
						int var182 = field480.method357();
						field291[var180] = var181;
						field385[var180] = var182;
						field302[var180] = 1;
						for (int var183 = 0; var183 < 98; var183++) {
							if (var181 >= field452[var183]) {
								field302[var180] = var183 + 2;
							}
						}

						field137 = -1;
						return true;
					}

					if (field137 == 63) {
						int var184 = field480.method341();
						int var185 = field480.method367();
						VGGOSQRK.method538(var184).field1215 = 2;
						VGGOSQRK.method538(var184).field1216 = var185;
						field137 = -1;
						return true;
					}

					signlink.reporterror("T1 - " + field137 + "," + field136 + " - " + field204 + "," + field205);
					method23();
					return true;
				}

				int var149 = field480.method341();
				int var150 = field480.method341();

				if (field305 != -1) {
					method32(field305);
					field305 = -1;
					field514 = true;
				}

				if (field227 != -1) {
					method32(field227);
					field227 = -1;
					field98 = true;
				}

				if (field353 != -1) {
					method32(field353);
					field353 = -1;
				}

				if (field319 != var149) {
					method32(field319);
					field319 = var149;
				}

				if (field145 != var150) {
					method32(field145);
					field145 = var150;
				}

				if (field225 != 0) {
					field225 = 0;
					field514 = true;
				}

				field491 = true;
				field190 = true;
				field346 = false;
				field137 = -1;
				return true;
			}

			int var95 = field267;
			int var96 = field268;
			if (field137 == 61) {
				var95 = field480.method341();
				var96 = field480.method341();
				field114 = false;
			}

			if (field137 == 37) {
				var96 = field480.method366();
				var95 = field480.method367();
				field480.method349();

				for (int var97 = 0; var97 < 4; var97++) {
					for (int var98 = 0; var98 < 13; var98++) {
						for (int var99 = 0; var99 < 13; var99++) {
							int var100 = field480.method350(1);
							if (var100 == 1) {
								field206[var97][var98][var99] = field480.method350(26);
							} else {
								field206[var97][var98][var99] = -1;
							}
						}
					}
				}

				field480.method351();
				field114 = true;
			}

			if (field267 == var95 && field268 == var96 && field394 == 2) {
				field137 = -1;
				return true;
			}

			field267 = var95;
			field268 = var96;
			field262 = (field267 - 6) * 8;
			field263 = (field268 - 6) * 8;
			field242 = false;
			if ((field267 / 8 == 48 || field267 / 8 == 49) && field268 / 8 == 48) {
				field242 = true;
			}

			if (field267 / 8 == 48 && field268 / 8 == 148) {
				field242 = true;
			}

			field394 = 1;
			field444 = System.currentTimeMillis();
			method24(null, "Loading - please wait.");

			if (field137 == 61) {
				int var101 = 0;
				for (int var102 = (field267 - 6) / 8; var102 <= (field267 + 6) / 8; var102++) {
					for (int var103 = (field268 - 6) / 8; var103 <= (field268 + 6) / 8; var103++) {
						var101++;
					}
				}

				field338 = new byte[var101][];
				field510 = new byte[var101][];
				field307 = new int[var101];
				field308 = new int[var101];
				field309 = new int[var101];
				int var104 = 0;
				for (int var105 = (field267 - 6) / 8; var105 <= (field267 + 6) / 8; var105++) {
					for (int var106 = (field268 - 6) / 8; var106 <= (field268 + 6) / 8; var106++) {
						field307[var104] = (var105 << 8) + var106;

						if (field242 && (var106 == 49 || var106 == 149 || var106 == 147 || var105 == 50 || var105 == 49 && var106 == 47)) {
							field308[var104] = -1;
							field309[var104] = -1;
							var104++;
						} else {
							int var107 = field308[var104] = field403.method310(0, var106, var105);
							if (var107 != -1) {
								field403.method306(3, var107);
							}

							int var108 = field309[var104] = field403.method310(1, var106, var105);
							if (var108 != -1) {
								field403.method306(3, var108);
							}

							var104++;
						}
					}
				}
			}

			if (field137 == 37) {
				int var109 = 0;
				int[] var110 = new int[676];
				for (int var111 = 0; var111 < 4; var111++) {
					for (int var112 = 0; var112 < 13; var112++) {
						for (int var113 = 0; var113 < 13; var113++) {
							int var114 = field206[var111][var112][var113];
							if (var114 != -1) {
								int var115 = var114 >> 14 & 0x3FF;
								int var116 = var114 >> 3 & 0x7FF;
								int var117 = (var115 / 8 << 8) + var116 / 8;
								for (int var118 = 0; var118 < var109; var118++) {
									if (var110[var118] == var117) {
										var117 = -1;
										break;
									}
								}

								if (var117 != -1) {
									var110[var109++] = var117;
								}
							}
						}
					}
				}

				field338 = new byte[var109][];
				field510 = new byte[var109][];
				field307 = new int[var109];
				field308 = new int[var109];
				field309 = new int[var109];
				for (int var119 = 0; var119 < var109; var119++) {
					int var120 = field307[var119] = var110[var119];
					int var121 = var120 >> 8 & 0xFF;
					int var122 = var120 & 0xFF;
					int var123 = field308[var119] = field403.method310(0, var122, var121);
					if (var123 != -1) {
						field403.method306(3, var123);
					}

					int var124 = field309[var119] = field403.method310(1, var122, var121);
					if (var124 != -1) {
						field403.method306(3, var124);
					}
				}
			}

			int var125 = field262 - field264;
			int var126 = field263 - field265;
			field264 = field262;
			field265 = field263;

			for (int var127 = 0; var127 < 16384; var127++) {
				DWBMCYCE var128 = field151[var127];
				if (var128 != null) {
					for (int var129 = 0; var129 < 10; var129++) {
						var128.field1351[var129] -= var125;
						var128.field1352[var129] -= var126;
					}

					var128.field1342 -= var125 * 128;
					var128.field1343 -= var126 * 128;
				}
			}

			for (int var130 = 0; var130 < field404; var130++) {
				XVMRCEYW var131 = field406[var130];
				if (var131 != null) {
					for (int var132 = 0; var132 < 10; var132++) {
						var131.field1351[var132] -= var125;
						var131.field1352[var132] -= var126;
					}

					var131.field1342 -= var125 * 128;
					var131.field1343 -= var126 * 128;
				}
			}

			field252 = true;
			byte var133 = 0;
			byte var134 = 104;
			byte var135 = 1;
			if (var125 < 0) {
				var133 = 103;
				var134 = -1;
				var135 = -1;
			}

			byte var136 = 0;
			byte var137 = 104;
			byte var138 = 1;
			if (var126 < 0) {
				var136 = 103;
				var137 = -1;
				var138 = -1;
			}

			for (int var139 = var133; var139 != var134; var139 += var135) {
				for (int var140 = var136; var140 != var137; var140 += var138) {
					int var141 = var125 + var139;
					int var142 = var126 + var140;
					for (int var143 = 0; var143 < 4; var143++) {
						if (var141 >= 0 && var142 >= 0 && var141 < 104 && var142 < 104) {
							field348[var143][var139][var140] = field348[var143][var141][var142];
						} else {
							field348[var143][var139][var140] = null;
						}
					}
				}
			}

			for (CPAFTRRP var144 = (CPAFTRRP) field100.method200(); var144 != null; var144 = (CPAFTRRP) field100.method202()) {
				var144.field518 -= var125;
				var144.field519 -= var126;
				if (var144.field518 < 0 || var144.field519 < 0 || var144.field518 >= 104 || var144.field519 >= 104) {
					var144.method326();
				}
			}

			if (field386 != 0) {
				field386 -= var125;
				field387 -= var126;
			}

			field465 = false;
			field137 = -1;
			return true;
		} catch (IOException var190) {
			method19();
		} catch (Exception var191) {
			String var187 = "T2 - " + field137 + "," + field204 + "," + field205 + " - " + field136 + "," + (field383.field1351[0] + field262) + "," + (field383.field1352[0] + field263) + " - ";
			for (int var188 = 0; var188 < field136 && var188 < 50; var188++) {
				var187 = var187 + field480.field928[var188] + ",";
			}

			signlink.reporterror(var187);
			method23();
		}

		return true;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method28() {
		if (field238 >= 2 || field170 != 0 || field422 != 0) {
			String var1;
			if (field170 == 1 && field238 < 2) {
				var1 = "Use " + field174 + " with...";
			} else if (field422 == 1 && field238 < 2) {
				var1 = field425 + "...";
			} else {
				var1 = field351[field238 - 1];
			}

			if (field238 > 2) {
				var1 = var1 + "@whi@ / " + (field238 - 2) + " more options";
			}

			field368.method444(true, 15, 0xFFFFFF, var1, field512 / 1000, 4);
		}
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void method29(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method30() {
		for (CPAFTRRP var1 = (CPAFTRRP) field100.method200(); var1 != null; var1 = (CPAFTRRP) field100.method202()) {
			if (var1.field524 == -1) {
				var1.field520 = 0;
				method139(var1);
			} else {
				var1.method326();
			}
		}
	}

	@ObfuscatedName("client.a(LXVMRCEYW;IIZI)V")
	public final void method31(XVMRCEYW arg0, int arg1, int arg2, int arg3) {
		if (field383 != arg0 && field238 < 400) {
			String var5;
			if (arg0.field1388 == 0) {
				var5 = arg0.field1390 + method36(arg0.field1391, field383.field1391) + " (level-" + arg0.field1391 + ")";
			} else {
				var5 = arg0.field1390 + " (skill-" + arg0.field1388 + ")";
			}

			if (field170 == 1) {
				field351[field238] = "Use " + field174 + " with @whi@" + var5;
				field508[field238] = 600;
				field509[field238] = arg1;
				field506[field238] = arg3;
				field507[field238] = arg2;
				field238++;
			} else if (field422 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field253[var6] != null) {
						field351[field238] = field253[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field253[var6].equalsIgnoreCase("attack")) {
							if (arg0.field1391 > field383.field1391) {
								var7 = 2000;
							}

							if (field383.field1396 != 0 && arg0.field1396 != 0) {
								if (field383.field1396 == arg0.field1396) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field254[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field508[field238] = var7 + 665;
						}

						if (var6 == 1) {
							field508[field238] = var7 + 741;
						}

						if (var6 == 2) {
							field508[field238] = var7 + 870;
						}

						if (var6 == 3) {
							field508[field238] = var7 + 711;
						}

						if (var6 == 4) {
							field508[field238] = var7 + 9;
						}

						field509[field238] = arg1;
						field506[field238] = arg3;
						field507[field238] = arg2;
						field238++;
					}
				}
			} else if ((field424 & 0x8) == 8) {
				field351[field238] = field425 + " @whi@" + var5;
				field508[field238] = 347;
				field509[field238] = arg1;
				field506[field238] = arg3;
				field507[field238] = arg2;
				field238++;
			}

			for (int var8 = 0; var8 < field238; var8++) {
				if (field508[var8] == 1) {
					field351[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method32(int arg0) {
		VGGOSQRK.method540(arg0);
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void method33(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field231; var3++) {
				if (field331[var3] == arg0) {
					field231--;
					field491 = true;

					for (int var4 = var3; var4 < field231; var4++) {
						field420[var4] = field420[var4 + 1];
						field189[var4] = field189[var4 + 1];
						field331[var4] = field331[var4 + 1];
					}

					field332.method328(112);
					field332.method335(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method34() {
		if (field246 == null) {
			method78();
			field546 = null;
			field357 = null;
			field358 = null;
			field359 = null;
			field360 = null;
			field361 = null;
			field362 = null;
			field363 = null;
			field364 = null;
			field365 = null;
			field246 = new ERQSZFRT(96, 479, method73());
			field244 = new ERQSZFRT(156, 172, method73());
			VMBJKBNJ.method545();
			field400.method530(0, 0);
			field243 = new ERQSZFRT(261, 190, method73());
			field245 = new ERQSZFRT(334, 512, method73());
			VMBJKBNJ.method545();
			field130 = new ERQSZFRT(50, 496, method73());
			field131 = new ERQSZFRT(37, 269, method73());
			field132 = new ERQSZFRT(45, 249, method73());
			field98 = true;
			field245.method173();
			ZVPDLSTW.field1505 = field483;
		}
	}

	@ObfuscatedName("client.a(ILNQUAUMDT;I)V")
	public final void method35(NQUAUMDT arg0, int arg1) {
		if (arg1 == 221) {
			int var3 = arg0.method357();
			int var4 = (var3 >> 4 & 0x7) + field214;
			int var5 = (var3 & 0x7) + field215;
			int var6 = arg0.method368();
			int var7 = arg0.method357();
			int var8 = var7 >> 2;
			int var9 = var7 & 0x3;
			int var10 = field146[var8];
			if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
				int var11 = field402[field503][var4][var5];
				int var12 = field402[field503][var4 + 1][var5];
				int var13 = field402[field503][var4 + 1][var5 + 1];
				int var14 = field402[field503][var4][var5 + 1];
				if (var10 == 0) {
					QKZGSVZM var15 = field182.method480(var5, var4, field503);
					if (var15 != null) {
						int var16 = var15.field1031 >> 14 & 0x7FFF;
						if (var8 == 2) {
							var15.field1029 = new JSKMYDBH(var16, var11, 2, var14, var12, var13, var9 + 4, false, var6);
							var15.field1030 = new JSKMYDBH(var16, var11, 2, var14, var12, var13, var9 + 1 & 0x3, false, var6);
						} else {
							var15.field1029 = new JSKMYDBH(var16, var11, var8, var14, var12, var13, var9, false, var6);
						}
					}
				}

				if (var10 == 1) {
					ILGCTAXR var17 = field182.method481(var5, var4, field503);
					if (var17 != null) {
						var17.field657 = new JSKMYDBH(var17.field658 >> 14 & 0x7FFF, var11, 4, var14, var12, var13, 0, false, var6);
					}
				}

				if (var10 == 2) {
					SAVMBBAQ var18 = field182.method482(var5, field503, var4);

					if (var8 == 11) {
						var8 = 10;
					}

					if (var18 != null) {
						var18.field1054 = new JSKMYDBH(var18.field1062 >> 14 & 0x7FFF, var11, var8, var14, var12, var13, var9, false, var6);
					}
				}

				if (var10 == 3) {
					EWMGSEMB var19 = field182.method483(var4, field503, var5);
					if (var19 != null) {
						var19.field576 = new JSKMYDBH(var19.field577 >> 14 & 0x7FFF, var11, 22, var14, var12, var13, var9, false, var6);
					}
				}
			}
		} else if (arg1 == 220) {
			int var20 = arg0.method368();
			int var21 = arg0.method358();
			int var22 = (var21 >> 4 & 0x7) + field214;
			int var23 = (var21 & 0x7) + field215;
			int var24 = arg0.method341();
			int var25 = arg0.method368();
			if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && field479 != var24) {
				RQFEYKNL var26 = new RQFEYKNL();
				var26.field1034 = var20;
				var26.field1033 = var25;

				if (field348[field503][var22][var23] == null) {
					field348[field503][var22][var23] = new FYVRCFGT();
				}

				field348[field503][var22][var23].method197(var26);
				method98(var22, var23);
			}
		} else if (arg1 == 105) {
			int var27 = arg0.method367();
			int var28 = arg0.method358();
			int var29 = var28 >> 2;
			int var30 = var28 & 0x3;
			int var31 = field146[var29];
			int var32 = arg0.method357();
			int var33 = (var32 >> 4 & 0x7) + field214;
			int var34 = (var32 & 0x7) + field215;
			if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
				method20(var30, var29, var27, var34, 0, -1, field503, var33, var31);
			}
		} else {
			if (arg1 == 172) {
				int var35 = arg0.method357();
				int var36 = (var35 >> 4 & 0x7) + field214;
				int var37 = (var35 & 0x7) + field215;
				byte var38 = arg0.method361();
				int var39 = arg0.method359();
				int var40 = var39 >> 2;
				int var41 = var39 & 0x3;
				int var42 = field146[var40];
				int var43 = arg0.method341();
				byte var44 = arg0.method340();
				byte var45 = arg0.method360();
				int var46 = arg0.method366();
				byte var47 = arg0.method362();
				int var48 = arg0.method366();
				int var49 = arg0.method366();
				XVMRCEYW var50;
				if (field479 == var49) {
					var50 = field383;
				} else {
					var50 = field406[var49];
				}

				if (var50 != null) {
					KBTDMRWU var51 = KBTDMRWU.method249(var43);
					int var52 = field402[field503][var36][var37];
					int var53 = field402[field503][var36 + 1][var37];
					int var54 = field402[field503][var36 + 1][var37 + 1];
					int var55 = field402[field503][var36][var37 + 1];
					JUQSYEMB var56 = var51.method247(var40, var41, var52, var53, var54, var55, -1);
					if (var56 != null) {
						method20(0, 0, -1, var37, var46 + 1, var48 + 1, field503, var36, var42);
						var50.field1379 = field512 + var46;
						var50.field1380 = field512 + var48;
						var50.field1376 = var56;
						int var57 = var51.field804;
						int var58 = var51.field763;
						if (var41 == 1 || var41 == 3) {
							var57 = var51.field763;
							var58 = var51.field804;
						}

						var50.field1373 = var36 * 128 + var57 * 64;
						var50.field1375 = var37 * 128 + var58 * 64;
						var50.field1374 = method69(var50.field1373, field503, var50.field1375);

						if (var44 > var47) {
							byte var59 = var44;
							var44 = var47;
							var47 = var59;
						}

						if (var45 > var38) {
							byte var60 = var45;
							var45 = var38;
							var38 = var60;
						}

						var50.field1383 = var36 + var44;
						var50.field1385 = var36 + var47;
						var50.field1384 = var37 + var45;
						var50.field1386 = var37 + var38;
					}
				}
			}

			if (arg1 == 13) {
				int var61 = arg0.method358();
				int var62 = (var61 >> 4 & 0x7) + field214;
				int var63 = (var61 & 0x7) + field215;
				int var64 = arg0.method341();
				if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
					FYVRCFGT var65 = field348[field503][var62][var63];
					if (var65 != null) {
						for (RQFEYKNL var66 = (RQFEYKNL) var65.method200(); var66 != null; var66 = (RQFEYKNL) var65.method202()) {
							if ((var64 & 0x7FFF) == var66.field1034) {
								var66.method326();
								break;
							}
						}

						if (var65.method200() == null) {
							field348[field503][var62][var63] = null;
						}

						method98(var62, var63);
					}
				}
			} else if (arg1 == 134) {
				int var67 = arg0.method357();
				int var68 = (var67 >> 4 & 0x7) + field214;
				int var69 = (var67 & 0x7) + field215;
				int var70 = arg0.method359();
				int var71 = var70 >> 2;
				int var72 = var70 & 0x3;
				int var73 = field146[var71];
				if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
					method20(var72, var71, -1, var69, 0, -1, field503, var68, var73);
				}
			} else if (arg1 == 219) {
				int var74 = arg0.method339();
				int var75 = (var74 >> 4 & 0x7) + field214;
				int var76 = (var74 & 0x7) + field215;
				int var77 = var75 + arg0.method340();
				int var78 = var76 + arg0.method340();
				int var79 = arg0.method342();
				int var80 = arg0.method341();
				int var81 = arg0.method339() * 4;
				int var82 = arg0.method339() * 4;
				int var83 = arg0.method341();
				int var84 = arg0.method341();
				int var85 = arg0.method339();
				int var86 = arg0.method339();
				if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104 && var80 != 0xFFFF) {
					var75 = var75 * 128 + 64;
					var76 = var76 * 128 + 64;
					var77 = var77 * 128 + 64;
					var78 = var78 * 128 + 64;
					YFDAHBXI var87 = new YFDAHBXI(var86, var76, method69(var75, field503, var76) - var81, var82, var85, var79, var75, field512 + var84, var80, field503, field512 + var83);
					var87.method574(method69(var77, field503, var78) - var82, field512 + var83, var77, var78);
					field226.method197(var87);
				}
			} else {
				if (arg1 == 112) {
					int var88 = arg0.method339();
					int var89 = (var88 >> 4 & 0x7) + field214;
					int var90 = (var88 & 0x7) + field215;
					int var91 = arg0.method341();
					int var92 = arg0.method339();
					int var93 = var92 >> 4 & 0xF;
					int var94 = var92 & 0x7;
					if (field383.field1351[0] >= var89 - var93 && field383.field1351[0] <= var89 + var93 && field383.field1352[0] >= var90 - var93 && field383.field1352[0] <= var90 + var93 && field133 && !field169 && field416 < 50) {
						field183[field416] = var91;
						field443[field416] = var94;
						field339[field416] = MDGCJDZI.field871[var91];
						field416++;
					}
				}

				if (arg1 == 41) {
					int var95 = arg0.method339();
					int var96 = (var95 >> 4 & 0x7) + field214;
					int var97 = (var95 & 0x7) + field215;
					int var98 = arg0.method341();
					int var99 = arg0.method341();
					int var100 = arg0.method341();
					if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
						FYVRCFGT var101 = field348[field503][var96][var97];
						if (var101 != null) {
							for (RQFEYKNL var102 = (RQFEYKNL) var101.method200(); var102 != null; var102 = (RQFEYKNL) var101.method202()) {
								if ((var98 & 0x7FFF) == var102.field1034 && var102.field1033 == var99) {
									var102.field1033 = var100;
									break;
								}
							}

							method98(var96, var97);
						}
					}
				} else if (arg1 == 226) {
					int var103 = arg0.method341();
					int var104 = arg0.method359();
					int var105 = (var104 >> 4 & 0x7) + field214;
					int var106 = (var104 & 0x7) + field215;
					int var107 = arg0.method367();
					if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
						RQFEYKNL var108 = new RQFEYKNL();
						var108.field1034 = var107;
						var108.field1033 = var103;

						if (field348[field503][var105][var106] == null) {
							field348[field503][var105][var106] = new FYVRCFGT();
						}

						field348[field503][var105][var106].method197(var108);
						method98(var105, var106);
					}
				} else if (arg1 == 87) {
					int var109 = arg0.method339();
					int var110 = (var109 >> 4 & 0x7) + field214;
					int var111 = (var109 & 0x7) + field215;
					int var112 = arg0.method341();
					int var113 = arg0.method339();
					int var114 = arg0.method341();
					if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
						var110 = var110 * 128 + 64;
						var111 = var111 * 128 + 64;
						PKNSNRDF var115 = new PKNSNRDF(field503, var111, var112, field512, var114, var110, method69(var110, field503, var111) - var113);
						field495.method197(var115);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZI)Ljava/lang/String;")
	public static final String method36(int arg0, int arg1) {
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

	@ObfuscatedName("client.k(I)V")
	public static final void method37() {
		UJWODGQS.field1084 = true;
		ZVPDLSTW.field1494 = true;
		field169 = true;
		OBDFVVEL.field961 = true;
		KBTDMRWU.field797 = true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method38(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field354 = "";
				field355 = "Connecting to server...";
				method40(true);
			}

			field427 = new QIACHOJO(method22(field167 + 43594), this);
			long var4 = SISNGPYM.method428(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field332.field929 = 0;
			field332.method329(14);
			field332.method329(var6);
			field427.method424(0, field332.field928, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field427.method421();
			}

			int var8 = field427.method421();
			int var9 = var8;

			if (var8 == 0) {
				field427.method423(field480.field928, 0, 8);
				field480.field929 = 0;
				field266 = field480.method345();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field266 >> 32), (int) field266 };
				field332.field929 = 0;
				field332.method329(10);
				field332.method333(var10[0]);
				field332.method333(var10[1]);
				field332.method333(var10[2]);
				field332.method333(var10[3]);
				field332.method333(signlink.uid);
				field332.method336(arg0);
				field332.method336(arg1);
				field332.method354(field426, field277);
				field102.field929 = 0;

				if (arg2) {
					field102.method329(18);
				} else {
					field102.method329(16);
				}

				field102.method329(field332.field929 + 36 + 1 + 1 + 2);
				field102.method329(255);
				field102.method330(358);
				field102.method329(field169 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field102.method333(field108[var11]);
				}

				field102.method337(field332.field928, field332.field929, 0);
				field332.field933 = new KAZZDHJI(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field439 = new KAZZDHJI(var10);
				field427.method424(0, field102.field928, field102.field929);
				var8 = field427.method421();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method38(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field217 = field427.method421();
				field105 = field427.method421() == 1;
				field261 = 0L;
				field95 = 0;
				field241.field1040 = 0;
				field550 = true;
				field219 = true;
				field313 = true;
				field332.field929 = 0;
				field480.field929 = 0;
				field137 = -1;
				field203 = -1;
				field204 = -1;
				field205 = -1;
				field136 = 0;
				field138 = 0;
				field79 = 0;
				field140 = 0;
				field113 = 0;
				field238 = 0;
				field301 = false;
				field551 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field77[var13] = null;
				}

				field170 = 0;
				field422 = 0;
				field394 = 0;
				field416 = 0;
				field207 = (int) (Math.random() * 100.0D) - 50;
				field234 = (int) (Math.random() * 110.0D) - 55;
				field297 = (int) (Math.random() * 80.0D) - 40;
				field194 = (int) (Math.random() * 120.0D) - 60;
				field73 = (int) (Math.random() * 30.0D) - 20;
				field282 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field255 = 0;
				field155 = -1;
				field386 = 0;
				field387 = 0;
				field407 = 0;
				field152 = 0;

				for (int var14 = 0; var14 < field404; var14++) {
					field406[var14] = null;
					field411[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field151[var15] = null;
				}

				field383 = field406[field405] = new XVMRCEYW();
				field226.method204();
				field495.method204();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field348[var16][var17][var18] = null;
						}
					}
				}

				field100 = new FYVRCFGT();
				field232 = 0;
				field231 = 0;
				method32(field453);
				field453 = -1;
				method32(field305);
				field305 = -1;
				method32(field319);
				field319 = -1;
				method32(field227);
				field227 = -1;
				method32(field353);
				field353 = -1;
				method32(field145);
				field145 = -1;
				method32(field336);
				field336 = -1;
				field346 = false;
				field107 = 3;
				field225 = 0;
				field301 = false;
				field87 = false;
				field229 = null;
				field417 = 0;
				field393 = -1;
				field104 = true;
				method92();

				for (int var19 = 0; var19 < 5; var19++) {
					field340[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field253[var20] = null;
					field254[var20] = false;
				}

				field184 = 0;
				field496 = 0;
				field257 = 0;
				field437 = 0;
				field436 = 0;
				field209 = 0;
				method34();
			} else if (var8 == 3) {
				field354 = "";
				field355 = "Invalid username or password.";
			} else if (var8 == 4) {
				field354 = "Your account has been disabled.";
				field355 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field354 = "Your account is already logged in.";
				field355 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field354 = "RuneScape has been updated!";
				field355 = "Please reload this page.";
			} else if (var8 == 7) {
				field354 = "This world is full.";
				field355 = "Please use a different world.";
			} else if (var8 == 8) {
				field354 = "Unable to connect.";
				field355 = "Login server offline.";
			} else if (var8 == 9) {
				field354 = "Login limit exceeded.";
				field355 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field354 = "Unable to connect.";
				field355 = "Bad session id.";
			} else if (var8 == 11) {
				field354 = "Login server rejected session.";
				field355 = "Please try again.";
			} else if (var8 == 12) {
				field354 = "You need a members account to login to this world.";
				field355 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field354 = "Could not complete login.";
				field355 = "Please try using a different world.";
			} else if (var8 == 14) {
				field354 = "The server is being updated.";
				field355 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field313 = true;
				field332.field929 = 0;
				field480.field929 = 0;
				field137 = -1;
				field203 = -1;
				field204 = -1;
				field205 = -1;
				field136 = 0;
				field138 = 0;
				field79 = 0;
				field238 = 0;
				field301 = false;
				field444 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field354 = "Login attempts exceeded.";
				field355 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field354 = "You are standing in a members-only area.";
				field355 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field354 = "Invalid loginserver requested";
				field355 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = field427.method421();
				for (var21 += 3; var21 >= 0; var21--) {
					field354 = "You have only just left another world";
					field355 = "Your profile will be transferred in: " + var21;
					method40(true);

					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}

				method38(arg0, arg1, arg2);
			} else if (var8 == 22) {
				field354 = "Malformed login packet.";
				field355 = "Please try again.";
			} else if (var8 == 23) {
				field354 = "This IP address has been blocked for 24";
				field355 = "hours, as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field354 = "Unexpected server response";
				field355 = "Please try using a different world.";
			} else if (var9 != 0) {
				field354 = "No response from server";
				field355 = "Please try using a different world.";
			} else if (field247 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field247++;
				method38(arg0, arg1, arg2);
			} else {
				field354 = "No response from loginserver";
				field355 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field354 = "";
			field355 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method39() {
		if (field357 == null) {
			field546 = null;
			field246 = null;
			field244 = null;
			field243 = null;
			field245 = null;
			field130 = null;
			field131 = null;
			field132 = null;
			field360 = new ERQSZFRT(265, 128, method73());
			VMBJKBNJ.method545();
			field361 = new ERQSZFRT(265, 128, method73());
			VMBJKBNJ.method545();
			field357 = new ERQSZFRT(171, 509, method73());
			VMBJKBNJ.method545();
			field358 = new ERQSZFRT(132, 360, method73());
			VMBJKBNJ.method545();
			field359 = new ERQSZFRT(200, 360, method73());
			VMBJKBNJ.method545();
			field362 = new ERQSZFRT(238, 202, method73());
			VMBJKBNJ.method545();
			field363 = new ERQSZFRT(238, 203, method73());
			VMBJKBNJ.method545();
			field364 = new ERQSZFRT(94, 74, method73());
			VMBJKBNJ.method545();
			field365 = new ERQSZFRT(94, 75, method73());
			VMBJKBNJ.method545();

			if (field259 != null) {
				method97();
				method51();
			}

			field98 = true;
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method40(boolean arg0) {
		method39();
		field359.method173();
		field303.method530(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field144 == 0) {
			int var4 = var3 / 2 + 80;
			field366.method436(var4, 0x75A9A9, field403.field891, true, var2 / 2);
			int var5 = var3 / 2 - 20;
			field368.method436(var5, 0xFFFF00, "Welcome to RuneScape", true, var2 / 2);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field304.method530(var7 - 20, var6 - 73);
			field368.method436(var7 + 5, 0xFFFFFF, "New User", true, var6);
			int var8 = var2 / 2 + 80;
			field304.method530(var7 - 20, var8 - 73);
			field368.method436(var7 + 5, 0xFFFFFF, "Existing User", true, var8);
		}

		if (field144 == 2) {
			int var9 = var3 / 2 - 40;
			if (field354.length() > 0) {
				field368.method436(var9 - 15, 0xFFFF00, field354, true, var2 / 2);
				field368.method436(var9, 0xFFFF00, field355, true, var2 / 2);
				var9 += 30;
			} else {
				field368.method436(var9 - 7, 0xFFFF00, field355, true, var2 / 2);
				var9 += 30;
			}

			field368.method443(0xFFFFFF, true, var9, var2 / 2 - 90, "Username: " + field432 + (field472 == 0 & field512 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			field368.method443(0xFFFFFF, true, var9, var2 / 2 - 88, "Password: " + SISNGPYM.method433(field433) + (field472 == 1 & field512 % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field304.method530(var11 - 20, var10 - 73);
				field368.method436(var11 + 5, 0xFFFFFF, "Login", true, var10);
				int var12 = var2 / 2 + 80;
				field304.method530(var11 - 20, var12 - 73);
				field368.method436(var11 + 5, 0xFFFFFF, "Cancel", true, var12);
			}
		}

		if (field144 == 3) {
			field368.method436(var3 / 2 - 60, 0xFFFF00, "Create a free account", true, var2 / 2);
			int var13 = var3 / 2 - 35;
			field368.method436(var13, 0xFFFFFF, "To create a new account you need to", true, var2 / 2);
			var13 += 15;
			field368.method436(var13, 0xFFFFFF, "go back to the main RuneScape webpage", true, var2 / 2);
			var13 += 15;
			field368.method436(var13, 0xFFFFFF, "and choose the 'create account'", true, var2 / 2);
			var13 += 15;
			field368.method436(var13, 0xFFFFFF, "button near the top of that page.", true, var2 / 2);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field304.method530(var15 - 20, var14 - 73);
			field368.method436(var15 + 5, 0xFFFFFF, "Cancel", true, var14);
		}

		field359.method174(field545, 171, 202);

		if (field98) {
			field98 = false;
			field357.method174(field545, 0, 128);
			field358.method174(field545, 371, 202);
			field362.method174(field545, 265, 0);
			field363.method174(field545, 265, 562);
			field364.method174(field545, 171, 128);
			field365.method174(field545, 171, 562);
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public final String method41(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.c(II)Z")
	public final boolean method42(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field508[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 159) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method43() {
		for (int var1 = 0; var1 < field152; var1++) {
			int var2 = field153[var1];
			DWBMCYCE var3 = field151[var2];
			if (var3 != null) {
				method44(var3.field536.field8, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILXEGGEBDS;)V")
	public final void method44(int arg0, XEGGEBDS arg1) {
		if (arg1.field1342 < 128 || arg1.field1343 < 128 || arg1.field1342 >= 13184 || arg1.field1343 >= 13184) {
			arg1.field1345 = -1;
			arg1.field1328 = -1;
			arg1.field1367 = 0;
			arg1.field1368 = 0;
			arg1.field1342 = arg1.field1351[0] * 128 + arg1.field1327 * 64;
			arg1.field1343 = arg1.field1352[0] * 128 + arg1.field1327 * 64;
			arg1.method557();
		}

		if (field383 == arg1 && (arg1.field1342 < 1536 || arg1.field1343 < 1536 || arg1.field1342 >= 11776 || arg1.field1343 >= 11776)) {
			arg1.field1345 = -1;
			arg1.field1328 = -1;
			arg1.field1367 = 0;
			arg1.field1368 = 0;
			arg1.field1342 = arg1.field1351[0] * 128 + arg1.field1327 * 64;
			arg1.field1343 = arg1.field1352[0] * 128 + arg1.field1327 * 64;
			arg1.method557();
		}

		if (arg1.field1367 > field512) {
			method45(arg1);
		} else if (arg1.field1368 >= field512) {
			method46(arg1);
		} else {
			method47(arg1);
		}

		method48(arg1);
		method49(arg1);
	}

	@ObfuscatedName("client.a(LXEGGEBDS;Z)V")
	public final void method45(XEGGEBDS arg0) {
		int var2 = arg0.field1367 - field512;
		int var3 = arg0.field1363 * 128 + arg0.field1327 * 64;
		int var4 = arg0.field1365 * 128 + arg0.field1327 * 64;
		arg0.field1342 += (var3 - arg0.field1342) / var2;
		arg0.field1343 += (var4 - arg0.field1343) / var2;
		arg0.field1358 = 0;

		if (arg0.field1369 == 0) {
			arg0.field1340 = 1024;
		}

		if (arg0.field1369 == 1) {
			arg0.field1340 = 1536;
		}

		if (arg0.field1369 == 2) {
			arg0.field1340 = 0;
		}

		if (arg0.field1369 == 3) {
			arg0.field1340 = 512;
		}
	}

	@ObfuscatedName("client.a(ILXEGGEBDS;)V")
	public final void method46(XEGGEBDS arg0) {
		if (field512 == arg0.field1368 || arg0.field1345 == -1 || arg0.field1348 != 0 || arg0.field1347 + 1 > KYGPROVJ.field828[arg0.field1345].method256(arg0.field1346)) {
			int var2 = arg0.field1368 - arg0.field1367;
			int var3 = field512 - arg0.field1367;
			int var4 = arg0.field1363 * 128 + arg0.field1327 * 64;
			int var5 = arg0.field1365 * 128 + arg0.field1327 * 64;
			int var6 = arg0.field1364 * 128 + arg0.field1327 * 64;
			int var7 = arg0.field1366 * 128 + arg0.field1327 * 64;
			arg0.field1342 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1343 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1358 = 0;

		if (arg0.field1369 == 0) {
			arg0.field1340 = 1024;
		}

		if (arg0.field1369 == 1) {
			arg0.field1340 = 1536;
		}

		if (arg0.field1369 == 2) {
			arg0.field1340 = 0;
		}

		if (arg0.field1369 == 3) {
			arg0.field1340 = 512;
		}

		arg0.field1344 = arg0.field1340;
	}

	@ObfuscatedName("client.a(LXEGGEBDS;I)V")
	public final void method47(XEGGEBDS arg0) {
		arg0.field1323 = arg0.field1360;
		if (arg0.field1318 == 0) {
			arg0.field1358 = 0;
		} else {
			if (arg0.field1345 != -1 && arg0.field1348 == 0) {
				KYGPROVJ var2 = KYGPROVJ.field828[arg0.field1345];
				if (arg0.field1353 > 0 && var2.field840 == 0) {
					arg0.field1358++;
					return;
				}

				if (arg0.field1353 <= 0 && var2.field841 == 0) {
					arg0.field1358++;
					return;
				}
			}

			int var3 = arg0.field1342;
			int var4 = arg0.field1343;
			int var5 = arg0.field1351[arg0.field1318 - 1] * 128 + arg0.field1327 * 64;
			int var6 = arg0.field1352[arg0.field1318 - 1] * 128 + arg0.field1327 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1340 = 1280;
					} else if (var4 > var6) {
						arg0.field1340 = 1792;
					} else {
						arg0.field1340 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1340 = 768;
					} else if (var4 > var6) {
						arg0.field1340 = 256;
					} else {
						arg0.field1340 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1340 = 1024;
				} else {
					arg0.field1340 = 0;
				}

				int var7 = arg0.field1340 - arg0.field1344 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1334;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1333;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1336;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1335;
				}

				if (var8 == -1) {
					var8 = arg0.field1333;
				}

				arg0.field1323 = var8;
				int var9 = 4;
				if (arg0.field1344 != arg0.field1340 && arg0.field1359 == -1 && arg0.field1326 != 0) {
					var9 = 2;
				}

				if (arg0.field1318 > 2) {
					var9 = 6;
				}

				if (arg0.field1318 > 3) {
					var9 = 8;
				}

				if (arg0.field1358 > 0 && arg0.field1318 > 1) {
					var9 = 8;
					arg0.field1358--;
				}

				if (arg0.field1341[arg0.field1318 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1333 == arg0.field1323 && arg0.field1354 != -1) {
					arg0.field1323 = arg0.field1354;
				}

				if (var3 < var5) {
					arg0.field1342 += var9;
					if (arg0.field1342 > var5) {
						arg0.field1342 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1342 -= var9;
					if (arg0.field1342 < var5) {
						arg0.field1342 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1343 += var9;
					if (arg0.field1343 > var6) {
						arg0.field1343 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1343 -= var9;
					if (arg0.field1343 < var6) {
						arg0.field1343 = var6;
					}
				}

				if (arg0.field1342 == var5 && arg0.field1343 == var6) {
					arg0.field1318--;

					if (arg0.field1353 > 0) {
						arg0.field1353--;
						return;
					}
				}
			} else {
				arg0.field1342 = var5;
				arg0.field1343 = var6;
			}
		}
	}

	@ObfuscatedName("client.b(LXEGGEBDS;I)V")
	public final void method48(XEGGEBDS arg0) {
		if (arg0.field1326 != 0) {
			if (arg0.field1359 != -1 && arg0.field1359 < 32768) {
				DWBMCYCE var2 = field151[arg0.field1359];
				if (var2 != null) {
					int var3 = arg0.field1342 - var2.field1342;
					int var4 = arg0.field1343 - var2.field1343;
					if (var3 != 0 || var4 != 0) {
						arg0.field1340 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1359 >= 32768) {
				int var5 = arg0.field1359 - 32768;
				if (field479 == var5) {
					var5 = field405;
				}

				XVMRCEYW var6 = field406[var5];
				if (var6 != null) {
					int var7 = arg0.field1342 - var6.field1342;
					int var8 = arg0.field1343 - var6.field1343;
					if (var7 != 0 || var8 != 0) {
						arg0.field1340 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1316 != 0 || arg0.field1317 != 0) && (arg0.field1318 == 0 || arg0.field1358 > 0)) {
				int var9 = arg0.field1342 - (arg0.field1316 - field262 - field262) * 64;
				int var10 = arg0.field1343 - (arg0.field1317 - field263 - field263) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1340 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1316 = 0;
				arg0.field1317 = 0;
			}

			int var11 = arg0.field1340 - arg0.field1344 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1326 || var11 > 2048 - arg0.field1326) {
					arg0.field1344 = arg0.field1340;
				} else if (var11 > 1024) {
					arg0.field1344 -= arg0.field1326;
				} else {
					arg0.field1344 += arg0.field1326;
				}

				arg0.field1344 &= 0x7FF;
				if (arg0.field1360 == arg0.field1323 && arg0.field1344 != arg0.field1340) {
					if (arg0.field1361 != -1) {
						arg0.field1323 = arg0.field1361;
						return;
					}

					arg0.field1323 = arg0.field1333;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLXEGGEBDS;)V")
	public final void method49(XEGGEBDS arg0) {
		arg0.field1370 = false;

		if (arg0.field1323 != -1) {
			KYGPROVJ var2 = KYGPROVJ.field828[arg0.field1323];
			arg0.field1325++;
			if (arg0.field1324 < var2.field829 && arg0.field1325 > var2.method256(arg0.field1324)) {
				arg0.field1325 = 0;
				arg0.field1324++;
			}

			if (arg0.field1324 >= var2.field829) {
				arg0.field1325 = 0;
				arg0.field1324 = 0;
			}
		}

		if (arg0.field1328 != -1 && field512 >= arg0.field1331) {
			if (arg0.field1329 < 0) {
				arg0.field1329 = 0;
			}

			KYGPROVJ var3 = PHXJLMVH.field975[arg0.field1328].field979;
			arg0.field1330++;
			while (arg0.field1329 < var3.field829 && arg0.field1330 > var3.method256(arg0.field1329)) {
				arg0.field1330 -= var3.method256(arg0.field1329);
				arg0.field1329++;
			}

			if (arg0.field1329 >= var3.field829 && (arg0.field1329 < 0 || arg0.field1329 >= var3.field829)) {
				arg0.field1328 = -1;
			}
		}

		if (arg0.field1345 != -1 && arg0.field1348 <= 1) {
			KYGPROVJ var4 = KYGPROVJ.field828[arg0.field1345];
			if (var4.field840 == 1 && arg0.field1353 > 0 && arg0.field1367 <= field512 && arg0.field1368 < field512) {
				arg0.field1348 = 1;
				return;
			}
		}

		if (arg0.field1345 != -1 && arg0.field1348 == 0) {
			KYGPROVJ var5 = KYGPROVJ.field828[arg0.field1345];
			arg0.field1347++;
			while (arg0.field1346 < var5.field829 && arg0.field1347 > var5.method256(arg0.field1346)) {
				arg0.field1347 -= var5.method256(arg0.field1346);
				arg0.field1346++;
			}

			if (arg0.field1346 >= var5.field829) {
				arg0.field1346 -= var5.field833;
				arg0.field1349++;
				if (arg0.field1349 >= var5.field839) {
					arg0.field1345 = -1;
				}

				if (arg0.field1346 < 0 || arg0.field1346 >= var5.field829) {
					arg0.field1345 = -1;
				}
			}

			arg0.field1370 = var5.field835;
		}

		if (arg0.field1348 > 0) {
			arg0.field1348--;
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void method50() {
		if (field227 == -1 || field394 != 2 && field546 == null) {
			if (field98) {
				method34();
				field98 = false;
				field371.method174(field545, 4, 0);
				field372.method174(field545, 357, 0);
				field373.method174(field545, 4, 722);
				field374.method174(field545, 205, 743);
				field375.method174(field545, 0, 0);
				field376.method174(field545, 4, 516);
				field377.method174(field545, 205, 516);
				field378.method174(field545, 357, 496);
				field379.method174(field545, 338, 0);
				field491 = true;
				field514 = true;
				field190 = true;
				field515 = true;

				if (field394 != 2) {
					field245.method174(field545, 4, 4);
					field244.method174(field545, 4, 550);
				}
			}

			if (field394 == 2) {
				method147();
			}

			if (field301 && field117 == 1) {
				field491 = true;
			}

			if (field145 != -1) {
				boolean var3 = method88(field145, field106);
				if (var3) {
					field491 = true;
				}
			}

			if (field213 == 2) {
				field491 = true;
			}

			if (field343 == 2) {
				field491 = true;
			}

			if (field491) {
				method71();
				field491 = false;
			}

			field347++;
			if (field347 > 100) {
				field347 = 0;
				field332.method328(102);
				field332.method329(192);
			}

			if (field305 == -1 && field225 == 0) {
				field149.field1234 = field442 - field312 - 77;

				if (field553 > 448 && field553 < 560 && field554 > 332) {
					method144(field149, 0, field554 - 357, field442, 463, 77, field553 - 17, -1);
				}

				int var4 = field442 - field149.field1234 - 77;
				if (var4 < 0) {
					var4 = 0;
				}

				if (var4 > field442 - 77) {
					var4 = field442 - 77;
				}

				if (field312 != var4) {
					field312 = var4;
					field514 = true;
				}
			}

			if (field305 == -1 && field225 == 3) {
				int var5 = field83 * 14 + 7;
				field149.field1234 = field86;

				if (field553 > 448 && field553 < 560 && field554 > 332) {
					method144(field149, 0, field554 - 357, var5, 463, 77, field553 - 17, -1);
				}

				int var6 = field149.field1234;
				if (var6 < 0) {
					var6 = 0;
				}

				if (var6 > var5 - 77) {
					var6 = var5 - 77;
				}

				if (field86 != var6) {
					field86 = var6;
					field514 = true;
				}
			}

			if (field305 != -1) {
				boolean var7 = method88(field305, field106);
				if (var7) {
					field514 = true;
				}
			}

			if (field213 == 3) {
				field514 = true;
			}

			if (field343 == 3) {
				field514 = true;
			}

			if (field229 != null) {
				field514 = true;
			}

			if (field301 && field117 == 2) {
				field514 = true;
			}

			if (field514) {
				method91();
				field514 = false;
			}

			if (field394 == 2) {
				method100();
				field244.method174(field545, 4, 550);
				field310++;
				if (field310 > 1394) {
					field310 = 0;
					field332.method328(167);
					field332.method329(0);
					int var8 = field332.field929;

					if ((int) (Math.random() * 2.0D) == 0) {
						field332.method329(109);
					}

					field332.method330((int) (Math.random() * 65536.0D));
					field332.method330(65484);

					if ((int) (Math.random() * 2.0D) == 0) {
						field332.method330(37273);
					}

					field332.method329((int) (Math.random() * 256.0D));

					if ((int) (Math.random() * 2.0D) == 0) {
						field332.method329(212);
					}

					field332.method330(42668);
					field332.method329((int) (Math.random() * 256.0D));
					field332.method330(43683);
					field332.method329(65);
					field332.method338(field332.field929 - var8);
				}
			}

			if (field393 != -1) {
				field190 = true;
			}

			if (field190) {
				if (field393 != -1 && field393 == field107) {
					field393 = -1;
					field332.method328(252);
					field332.method329(field107);
				}

				field190 = false;
				field132.method173();
				field450.method530(0, 0);

				if (field145 == -1) {
					if (field392[field107] != -1) {
						if (field107 == 0) {
							field197.method530(10, 22);
						}

						if (field107 == 1) {
							field198.method530(8, 54);
						}

						if (field107 == 2) {
							field198.method530(8, 82);
						}

						if (field107 == 3) {
							field199.method530(8, 110);
						}

						if (field107 == 4) {
							field201.method530(8, 153);
						}

						if (field107 == 5) {
							field201.method530(8, 181);
						}

						if (field107 == 6) {
							field200.method530(9, 209);
						}
					}

					if (field392[0] != -1 && (field393 != 0 || field512 % 20 < 10)) {
						field270[0].method530(13, 29);
					}

					if (field392[1] != -1 && (field393 != 1 || field512 % 20 < 10)) {
						field270[1].method530(11, 53);
					}

					if (field392[2] != -1 && (field393 != 2 || field512 % 20 < 10)) {
						field270[2].method530(11, 82);
					}

					if (field392[3] != -1 && (field393 != 3 || field512 % 20 < 10)) {
						field270[3].method530(12, 115);
					}

					if (field392[4] != -1 && (field393 != 4 || field512 % 20 < 10)) {
						field270[4].method530(13, 153);
					}

					if (field392[5] != -1 && (field393 != 5 || field512 % 20 < 10)) {
						field270[5].method530(11, 180);
					}

					if (field392[6] != -1 && (field393 != 6 || field512 % 20 < 10)) {
						field270[6].method530(13, 208);
					}
				}

				field132.method174(field545, 160, 516);
				field131.method173();
				field449.method530(0, 0);

				if (field145 == -1) {
					if (field392[field107] != -1) {
						if (field107 == 7) {
							field160.method530(0, 42);
						}

						if (field107 == 8) {
							field161.method530(0, 74);
						}

						if (field107 == 9) {
							field161.method530(0, 102);
						}

						if (field107 == 10) {
							field162.method530(1, 130);
						}

						if (field107 == 11) {
							field164.method530(0, 173);
						}

						if (field107 == 12) {
							field164.method530(0, 201);
						}

						if (field107 == 13) {
							field163.method530(0, 229);
						}
					}

					if (field392[8] != -1 && (field393 != 8 || field512 % 20 < 10)) {
						field270[7].method530(2, 74);
					}

					if (field392[9] != -1 && (field393 != 9 || field512 % 20 < 10)) {
						field270[8].method530(3, 102);
					}

					if (field392[10] != -1 && (field393 != 10 || field512 % 20 < 10)) {
						field270[9].method530(4, 137);
					}

					if (field392[11] != -1 && (field393 != 11 || field512 % 20 < 10)) {
						field270[10].method530(2, 174);
					}

					if (field392[12] != -1 && (field393 != 12 || field512 % 20 < 10)) {
						field270[11].method530(2, 201);
					}

					if (field392[13] != -1 && (field393 != 13 || field512 % 20 < 10)) {
						field270[12].method530(2, 226);
					}
				}

				field131.method174(field545, 466, 496);
				field245.method173();
				ZVPDLSTW.field1505 = field483;
			}

			if (field515) {
				field515 = false;
				field130.method173();
				field448.method530(0, 0);
				field367.method436(28, 0xFFFFFF, "Public chat", true, 55);

				if (field414 == 0) {
					field367.method436(41, 0xFF00, "On", true, 55);
				}

				if (field414 == 1) {
					field367.method436(41, 0xFFFF00, "Friends", true, 55);
				}

				if (field414 == 2) {
					field367.method436(41, 0xFF0000, "Off", true, 55);
				}

				if (field414 == 3) {
					field367.method436(41, 0xFFFF, "Hide", true, 55);
				}

				field367.method436(28, 0xFFFFFF, "Private chat", true, 184);

				if (field154 == 0) {
					field367.method436(41, 0xFF00, "On", true, 184);
				}

				if (field154 == 1) {
					field367.method436(41, 0xFFFF00, "Friends", true, 184);
				}

				if (field154 == 2) {
					field367.method436(41, 0xFF0000, "Off", true, 184);
				}

				field367.method436(28, 0xFFFFFF, "Trade/compete", true, 324);

				if (field269 == 0) {
					field367.method436(41, 0xFF00, "On", true, 324);
				}

				if (field269 == 1) {
					field367.method436(41, 0xFFFF00, "Friends", true, 324);
				}

				if (field269 == 2) {
					field367.method436(41, 0xFF0000, "Off", true, 324);
				}

				field367.method436(33, 0xFFFFFF, "Report abuse", true, 458);
				field130.method174(field545, 453, 0);
				field245.method173();
				ZVPDLSTW.field1505 = field483;
			}

			field106 = 0;
		} else {
			if (field394 == 2) {
				method88(field227, field106);

				if (field353 != -1) {
					method88(field353, field106);
				}

				field106 = 0;
				method80();
				field546.method173();
				ZVPDLSTW.field1505 = field484;
				VMBJKBNJ.method545();
				field98 = true;
				VGGOSQRK var1 = VGGOSQRK.method538(field227);
				if (var1.field1270 == 512 && var1.field1274 == 334 && var1.field1279 == 0) {
					var1.field1270 = 765;
					var1.field1274 = 503;
				}

				method121(0, 0, var1, 0);

				if (field353 != -1) {
					VGGOSQRK var2 = VGGOSQRK.method538(field353);
					if (var2.field1270 == 512 && var2.field1274 == 334 && var2.field1279 == 0) {
						var2.field1270 = 765;
						var2.field1274 = 503;
					}

					method121(0, 0, var2, 0);
				}

				if (field301) {
					method158();
				} else {
					method55();
					method28();
				}
			}

			field546.method174(field545, 0, 0);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method51() {
		field303 = new UZETOFZZ(field259, "titlebox", 0);
		field304 = new UZETOFZZ(field259, "titlebutton", 0);
		field216 = new UZETOFZZ[12];
		for (int var1 = 0; var1 < 12; var1++) {
			field216[var1] = new UZETOFZZ(field259, "runes", var1);
		}

		field501 = new FKNRMZJV(128, 265);
		field502 = new FKNRMZJV(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			field501.field590[var2] = field360.field567[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			field502.field590[var3] = field361.field567[var3];
		}

		field176 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			field176[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			field176[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			field176[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field176[var7 + 192] = 0xFFFFFF;
		}

		field177 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			field177[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field177[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			field177[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field177[var11 + 192] = 0xFFFFFF;
		}

		field178 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field178[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field178[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			field178[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field178[var15 + 192] = 0xFFFFFF;
		}

		field175 = new int[256];
		field187 = new int[32768];
		field188 = new int[32768];
		method94(null);
		field466 = new int[32768];
		field467 = new int[32768];
		method101(10, "Connecting to fileserver");

		if (!field469) {
			field311 = true;
			field469 = true;
			method142(this, 2);
		}
	}

	@ObfuscatedName("client.m(I)Z")
	public final boolean method52() {
		return signlink.wavereplay();
	}

	public final void init() {
		field166 = Integer.parseInt(getParameter("nodeid"));
		field167 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method37();
		} else {
			method56();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field168 = false;
		} else {
			field168 = true;
		}

		method169(503, 765);
	}

	@ObfuscatedName("client.a(BIILFKNRMZJV;)V")
	public final void method53(int arg0, int arg1, FKNRMZJV arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field282 + field194 & 0x7FF;
			int var6 = JUQSYEMB.field743[var5];
			int var7 = JUQSYEMB.field744[var5];
			var6 = var6 * 256 / (field73 + 256);
			var7 = var7 * 256 / (field73 + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field382.method190(83 - var13 - 20, 256, 20, 20, 15, 15, var12 + 94 + 4 - 10, var10);
		} else {
			method120(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.a(IIILAPPQAEOL;I)V")
	public final void method54(int arg0, int arg1, APPQAEOL arg2, int arg3) {
		if (field238 < 400) {
			if (arg2.field14 != null) {
				arg2 = arg2.method5();
			}

			if (arg2 != null && arg2.field9) {
				String var5 = arg2.field34;
				if (arg2.field13 != 0) {
					var5 = var5 + method36(arg2.field13, field383.field1391) + " (level-" + arg2.field13 + ")";
				}

				if (field170 == 1) {
					field351[field238] = "Use " + field174 + " with @yel@" + var5;
					field508[field238] = 219;
					field509[field238] = arg3;
					field506[field238] = arg0;
					field507[field238] = arg1;
					field238++;
				} else if (field422 != 1) {
					if (arg2.field22 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg2.field22[var6] != null && !arg2.field22[var6].equalsIgnoreCase("attack")) {
								field351[field238] = arg2.field22[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field508[field238] = 90;
								}

								if (var6 == 1) {
									field508[field238] = 468;
								}

								if (var6 == 2) {
									field508[field238] = 432;
								}

								if (var6 == 3) {
									field508[field238] = 550;
								}

								if (var6 == 4) {
									field508[field238] = 866;
								}

								field509[field238] = arg3;
								field506[field238] = arg0;
								field507[field238] = arg1;
								field238++;
							}
						}
					}

					if (arg2.field22 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg2.field22[var7] != null && arg2.field22[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg2.field13 > field383.field1391) {
									var8 = 2000;
								}

								field351[field238] = arg2.field22[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field508[field238] = var8 + 90;
								}

								if (var7 == 1) {
									field508[field238] = var8 + 468;
								}

								if (var7 == 2) {
									field508[field238] = var8 + 432;
								}

								if (var7 == 3) {
									field508[field238] = var8 + 550;
								}

								if (var7 == 4) {
									field508[field238] = var8 + 866;
								}

								field509[field238] = arg3;
								field506[field238] = arg0;
								field507[field238] = arg1;
								field238++;
							}
						}
					}

					field351[field238] = "Examine @yel@" + var5;
					field508[field238] = 1532;
					field509[field238] = arg3;
					field506[field238] = arg0;
					field507[field238] = arg1;
					field238++;
				} else if ((field424 & 0x2) == 2) {
					field351[field238] = field425 + " @yel@" + var5;
					field508[field238] = 843;
					field509[field238] = arg3;
					field506[field238] = arg0;
					field507[field238] = arg1;
					field238++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method55() {
		if (field343 == 0) {
			field351[0] = "Cancel";
			field508[0] = 1855;
			field238 = 1;
			if (field227 == -1) {
				method108();
				field397 = 0;
				field413 = 0;

				if (field553 > 4 && field554 > 4 && field553 < 516 && field554 < 338) {
					if (field319 == -1) {
						method62();
					} else {
						method126(field553, 4, 0, VGGOSQRK.method538(field319), 4, 0, field554);
					}
				}

				if (field397 != field380) {
					field380 = field397;
				}

				if (field447 != field413) {
					field447 = field413;
				}

				field397 = 0;
				field413 = 0;

				if (field553 > 553 && field554 > 205 && field553 < 743 && field554 < 466) {
					if (field145 != -1) {
						method126(field553, 553, 1, VGGOSQRK.method538(field145), 205, 0, field554);
					} else if (field392[field107] != -1) {
						method126(field553, 553, 1, VGGOSQRK.method538(field392[field107]), 205, 0, field554);
					}
				}

				if (field397 != field124) {
					field491 = true;
					field124 = field397;
				}

				if (field413 != field222) {
					field491 = true;
					field222 = field413;
				}

				field397 = 0;
				field413 = 0;

				if (field553 > 17 && field554 > 357 && field553 < 496 && field554 < 453) {
					if (field305 != -1) {
						method126(field553, 17, 2, VGGOSQRK.method538(field305), 357, 0, field554);
					} else if (field453 != -1) {
						method126(field553, 17, 3, VGGOSQRK.method538(field453), 357, 0, field554);
					} else if (field554 < 434 && field553 < 426 && field225 == 0) {
						method82(field554 - 357, field553 - 17);
					}
				}

				if ((field305 != -1 || field453 != -1) && field397 != field220) {
					field514 = true;
					field220 = field397;
				}

				if ((field305 != -1 || field453 != -1) && field413 != field306) {
					field514 = true;
					field306 = field413;
				}

				boolean var1 = false;
				while (!var1) {
					var1 = true;
					for (int var2 = 0; var2 < field238 - 1; var2++) {
						if (field508[var2] < 1000 && field508[var2 + 1] > 1000) {
							String var3 = field351[var2];
							field351[var2] = field351[var2 + 1];
							field351[var2 + 1] = var3;
							int var4 = field508[var2];
							field508[var2] = field508[var2 + 1];
							field508[var2 + 1] = var4;
							int var5 = field506[var2];
							field506[var2] = field506[var2 + 1];
							field506[var2 + 1] = var5;
							int var6 = field507[var2];
							field507[var2] = field507[var2 + 1];
							field507[var2 + 1] = var6;
							int var7 = field509[var2];
							field509[var2] = field509[var2 + 1];
							field509[var2 + 1] = var7;
							var1 = false;
						}
					}
				}
			} else {
				field397 = 0;
				field413 = 0;
				method126(field553, 0, 0, VGGOSQRK.method538(field227), 0, 0, field554);

				if (field397 != field380) {
					field380 = field397;
				}

				if (field447 != field413) {
					field447 = field413;
				}
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public static final void method56() {
		UJWODGQS.field1084 = false;
		ZVPDLSTW.field1494 = false;
		field169 = false;
		OBDFVVEL.field961 = false;
		KBTDMRWU.field797 = false;
	}

	@ObfuscatedName("client.a(BILNQUAUMDT;)V")
	public final void method57(int arg0, NQUAUMDT arg1) {
		for (int var3 = 0; var3 < field409; var3++) {
			int var4 = field410[var3];
			XVMRCEYW var5 = field406[var4];
			int var6 = arg1.method339();
			if ((var6 & 0x10) != 0) {
				var6 += arg1.method339() << 8;
			}

			method151(var4, arg1, var5, var6);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IZII)LRSPRYUFS;")
	public final RSPRYUFS method58(String arg0, String arg1, int arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field159[0] != null) {
				var6 = field159[0].method1(arg2);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field99.reset();
			field99.update(var6);
			int var8 = (int) field99.getValue();
			if (arg4 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new RSPRYUFS(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method101(arg3, "Requesting " + arg0);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method148(arg1 + arg4);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				NQUAUMDT var16 = new NQUAUMDT(var15);
				var16.field929 = 3;
				int var17 = var16.method343() + 6;
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
						method101(arg3, "Loading " + arg0 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field159[0] != null) {
						field159[0].method2(var6, arg2, var6.length);
					}
				} catch (Exception var28) {
					field159[0] = null;
				}

				if (var6 != null) {
					field99.reset();
					field99.update(var6);
					int var23 = (int) field99.getValue();
					if (arg4 != var23) {
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
						method101(arg3, "Game updated - please reload page");
						var25 = 10;
					} else {
						method101(arg3, var11 + " - Retrying in " + var25);
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

				field381 = !field381;
			}
		}

		return new RSPRYUFS(var6);
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method59(int arg0) {
		int[] var2 = field388.field590;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field464[arg0][var7][var5] & 0x18) == 0) {
					field182.method493(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field464[arg0 + 1][var7][var5] & 0x8) != 0) {
					field182.method493(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field388.method180();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field464[arg0][var11][var10] & 0x18) == 0) {
					method153(var10, var11, arg0, var8, var9);
				}

				if (arg0 < 3 && (field464[arg0 + 1][var11][var10] & 0x8) != 0) {
					method153(var10, var11, arg0 + 1, var8, var9);
				}
			}
		}

		if (field245 != null) {
			field245.method173();
			ZVPDLSTW.field1505 = field483;
		}

		field316 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field182.method487(field503, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = KBTDMRWU.method249(var14).field786;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field494[field503].field1449;
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

						field334[field316] = field440[var15];
						field317[field316] = var16;
						field318[field316] = var17;
						field316++;
					}
				}
			}
		}

		field290++;
		if (field290 > 62) {
			field290 = 0;
			field332.method328(187);
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void method60(int arg0) {
		VGGOSQRK var2 = VGGOSQRK.method538(arg0);
		for (int var3 = 0; var3 < var2.field1224.length && var2.field1224[var3] != -1; var3++) {
			VGGOSQRK var4 = VGGOSQRK.method538(var2.field1224[var3]);
			if (var4.field1279 == 1) {
				method60(var4.field1246);
			}

			var4.field1243 = 0;
			var4.field1211 = 0;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method61() {
		field468 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field469) {
				field352++;
				method160();
				method160();
				method105();
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

		field468 = false;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method62() {
		if (field170 == 0 && field422 == 0) {
			field351[field238] = "Walk here";
			field508[field238] = 1;
			field506[field238] = field553;
			field507[field238] = field554;
			field238++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < JUQSYEMB.field741; var2++) {
			int var3 = JUQSYEMB.field742[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field182.method488(field503, var4, var5, var3) >= 0) {
					KBTDMRWU var8 = KBTDMRWU.method249(var7);
					if (var8.field782 != null) {
						var8 = var8.method250();
					}

					if (var8 == null) {
						continue;
					}

					if (field170 == 1) {
						field351[field238] = "Use " + field174 + " with @cya@" + var8.field777;
						field508[field238] = 980;
						field509[field238] = var3;
						field506[field238] = var4;
						field507[field238] = var5;
						field238++;
					} else if (field422 != 1) {
						if (var8.field798 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field798[var9] != null) {
									field351[field238] = var8.field798[var9] + " @cya@" + var8.field777;

									if (var9 == 0) {
										field508[field238] = 694;
									}

									if (var9 == 1) {
										field508[field238] = 232;
									}

									if (var9 == 2) {
										field508[field238] = 308;
									}

									if (var9 == 3) {
										field508[field238] = 293;
									}

									if (var9 == 4) {
										field508[field238] = 1952;
									}

									field509[field238] = var3;
									field506[field238] = var4;
									field507[field238] = var5;
									field238++;
								}
							}
						}

						field351[field238] = "Examine @cya@" + var8.field777;
						field508[field238] = 1439;
						field509[field238] = var8.field769 << 14;
						field506[field238] = var4;
						field507[field238] = var5;
						field238++;
					} else if ((field424 & 0x4) == 4) {
						field351[field238] = field425 + " @cya@" + var8.field777;
						field508[field238] = 214;
						field509[field238] = var3;
						field506[field238] = var4;
						field507[field238] = var5;
						field238++;
					}
				}

				if (var6 == 1) {
					DWBMCYCE var10 = field151[var7];
					if (var10.field536.field8 == 1 && (var10.field1342 & 0x7F) == 0x40 && (var10.field1343 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field152; var11++) {
							DWBMCYCE var12 = field151[field153[var11]];
							if (var12 != null && var10 != var12 && var12.field536.field8 == 1 && var10.field1342 == var12.field1342 && var10.field1343 == var12.field1343) {
								method54(var4, var5, var12.field536, field153[var11]);
							}
						}

						for (int var13 = 0; var13 < field407; var13++) {
							XVMRCEYW var14 = field406[field408[var13]];
							if (var14 != null && var10.field1342 == var14.field1342 && var10.field1343 == var14.field1343) {
								method31(var14, field408[var13], var5, var4);
							}
						}
					}

					method54(var4, var5, var10.field536, var7);
				}

				if (var6 == 0) {
					XVMRCEYW var15 = field406[var7];
					if ((var15.field1342 & 0x7F) == 0x40 && (var15.field1343 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field152; var16++) {
							DWBMCYCE var17 = field151[field153[var16]];
							if (var17 != null && var17.field536.field8 == 1 && var15.field1342 == var17.field1342 && var15.field1343 == var17.field1343) {
								method54(var4, var5, var17.field536, field153[var16]);
							}
						}

						for (int var18 = 0; var18 < field407; var18++) {
							XVMRCEYW var19 = field406[field408[var18]];
							if (var19 != null && var15 != var19 && var15.field1342 == var19.field1342 && var15.field1343 == var19.field1343) {
								method31(var19, field408[var18], var5, var4);
							}
						}
					}

					method31(var15, var7, var5, var4);
				}

				if (var6 == 3) {
					FYVRCFGT var20 = field348[field503][var4][var5];
					if (var20 != null) {
						for (RQFEYKNL var21 = (RQFEYKNL) var20.method201(); var21 != null; var21 = (RQFEYKNL) var20.method203()) {
							ULRRTYRQ var22 = ULRRTYRQ.method520(var21.field1034);
							if (field170 == 1) {
								field351[field238] = "Use " + field174 + " with @lre@" + var22.field1182;
								field508[field238] = 762;
								field509[field238] = var21.field1034;
								field506[field238] = var4;
								field507[field238] = var5;
								field238++;
							} else if (field422 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field1185 != null && var22.field1185[var23] != null) {
										field351[field238] = var22.field1185[var23] + " @lre@" + var22.field1182;

										if (var23 == 0) {
											field508[field238] = 873;
										}

										if (var23 == 1) {
											field508[field238] = 852;
										}

										if (var23 == 2) {
											field508[field238] = 752;
										}

										if (var23 == 3) {
											field508[field238] = 24;
										}

										if (var23 == 4) {
											field508[field238] = 64;
										}

										field509[field238] = var21.field1034;
										field506[field238] = var4;
										field507[field238] = var5;
										field238++;
									} else if (var23 == 2) {
										field351[field238] = "Take @lre@" + var22.field1182;
										field508[field238] = 752;
										field509[field238] = var21.field1034;
										field506[field238] = var4;
										field507[field238] = var5;
										field238++;
									}
								}

								field351[field238] = "Examine @lre@" + var22.field1182;
								field508[field238] = 1288;
								field509[field238] = var21.field1034;
								field506[field238] = var4;
								field507[field238] = var5;
								field238++;
							} else if ((field424 & 0x1) == 1) {
								field351[field238] = field425 + " @lre@" + var22.field1182;
								field508[field238] = 985;
								field509[field238] = var21.field1034;
								field506[field238] = var4;
								field507[field238] = var5;
								field238++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(LNQUAUMDT;II)V")
	public final void method63(NQUAUMDT arg0, int arg1) {
		int var3 = arg0.method350(8);
		if (var3 < field407) {
			for (int var4 = var3; var4 < field407; var4++) {
				field390[field389++] = field408[var4];
			}
		}

		if (var3 > field407) {
			signlink.reporterror(field432 + " Too many players");
			throw new RuntimeException("eek");
		}

		field407 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field408[var5];
			XVMRCEYW var7 = field406[var6];
			int var8 = arg0.method350(1);
			if (var8 == 0) {
				field408[field407++] = var6;
				var7.field1362 = field512;
			} else {
				int var9 = arg0.method350(2);
				if (var9 == 0) {
					field408[field407++] = var6;
					var7.field1362 = field512;
					field410[field409++] = var6;
				} else if (var9 == 1) {
					field408[field407++] = var6;
					var7.field1362 = field512;
					int var10 = arg0.method350(3);
					var7.method554(false, var10);
					int var11 = arg0.method350(1);
					if (var11 == 1) {
						field410[field409++] = var6;
					}
				} else if (var9 == 2) {
					field408[field407++] = var6;
					var7.field1362 = field512;
					int var12 = arg0.method350(3);
					var7.method554(true, var12);
					int var13 = arg0.method350(3);
					var7.method554(true, var13);
					int var14 = arg0.method350(1);
					if (var14 == 1) {
						field410[field409++] = var6;
					}
				} else if (var9 == 3) {
					field390[field389++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method64() {
		if (field343 == 0) {
			int var1 = field559;
			if (field422 == 1 && field560 >= 516 && field561 >= 160 && field560 <= 765 && field561 <= 205) {
				var1 = 0;
			}

			if (field301) {
				if (var1 != 1) {
					int var2 = field553;
					int var3 = field554;
					if (field117 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field117 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field117 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field118 - 10 || var2 > field120 + field118 + 10 || var3 < field119 - 10 || var3 > field121 + field119 + 10) {
						field301 = false;

						if (field117 == 1) {
							field491 = true;
						}

						if (field117 == 2) {
							field514 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field118;
					int var5 = field119;
					int var6 = field120;
					int var7 = field560;
					int var8 = field561;
					if (field117 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field117 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field117 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field238; var10++) {
						int var11 = (field238 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method159(var9);
					}

					field301 = false;

					if (field117 == 1) {
						field491 = true;
					}

					if (field117 == 2) {
						field514 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field238 > 0) {
					int var12 = field508[field238 - 1];
					if (var12 == 236 || var12 == 29 || var12 == 651 || var12 == 605 || var12 == 490 || var12 == 504 || var12 == 486 || var12 == 18 || var12 == 675 || var12 == 393 || var12 == 871 || var12 == 1910) {
						int var13 = field506[field238 - 1];
						int var14 = field507[field238 - 1];
						VGGOSQRK var15 = VGGOSQRK.method538(var14);
						if (var15.field1256 || var15.field1225) {
							field248 = false;
							field81 = 0;
							field341 = var14;
							field342 = var13;
							field343 = 2;
							field344 = field560;
							field345 = field561;

							if (VGGOSQRK.method538(var14).field1272 == field319) {
								field343 = 1;
							}

							if (VGGOSQRK.method538(var14).field1272 == field305) {
								field343 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field223 == 1 || method42(field238 - 1)) && field238 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field238 > 0) {
					method159(field238 - 1);
				}

				if (var1 != 2 || field238 <= 0) {
					return;
				}

				method111();
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method65() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.q(I)V")
	public final void method66() {
		if (field144 == 0) {
			int var1 = field543 / 2 - 80;
			int var2 = field544 / 2 + 20;
			var2 += 20;
			if (field559 == 1 && field560 >= var1 - 75 && field560 <= var1 + 75 && field561 >= var2 - 20 && field561 <= var2 + 20) {
				field144 = 3;
				field472 = 0;
			}

			int var3 = field543 / 2 + 80;
			if (field559 == 1 && field560 >= var3 - 75 && field560 <= var3 + 75 && field561 >= var2 - 20 && field561 <= var2 + 20) {
				field354 = "";
				field355 = "Enter your username & password.";
				field144 = 2;
				field472 = 0;
			}
		} else if (field144 == 2) {
			int var4 = field544 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field559 == 1 && field561 >= var4 - 15 && field561 < var4) {
				field472 = 0;
			}

			var4 += 15;
			if (field559 == 1 && field561 >= var4 - 15 && field561 < var4) {
				field472 = 1;
			}

			var4 += 15;
			int var5 = field543 / 2 - 80;
			int var6 = field544 / 2 + 50;
			var6 += 20;
			if (field559 == 1 && field560 >= var5 - 75 && field560 <= var5 + 75 && field561 >= var6 - 20 && field561 <= var6 + 20) {
				field247 = 0;
				method38(field432, field433, false);

				if (field313) {
					return;
				}
			}

			int var7 = field543 / 2 + 80;
			if (field559 == 1 && field560 >= var7 - 75 && field560 <= var7 + 75 && field561 >= var6 - 20 && field561 <= var6 + 20) {
				field144 = 0;
				field432 = "";
				field433 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method172();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field191.length(); var10++) {
					if (var8 == field191.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field472 == 0) {
					if (var8 == 8 && field432.length() > 0) {
						field432 = field432.substring(0, field432.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field472 = 1;
					}

					if (var9) {
						field432 = field432 + (char) var8;
					}

					if (field432.length() > 12) {
						field432 = field432.substring(0, 12);
					}
				} else if (field472 == 1) {
					if (var8 == 8 && field433.length() > 0) {
						field433 = field433.substring(0, field433.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field472 = 0;
					}

					if (var9) {
						field433 = field433 + (char) var8;
					}

					if (field433.length() > 20) {
						field433 = field433.substring(0, 20);
					}
				}
			}
		} else if (field144 == 3) {
			int var11 = field543 / 2;
			int var12 = field544 / 2 + 50;
			var12 += 20;
			if (field559 == 1 && field560 >= var11 - 75 && field560 <= var11 + 75 && field561 >= var12 - 20 && field561 <= var12 + 20) {
				field144 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ZILjava/lang/String;)V")
	public final void method67(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field453 != -1) {
			field229 = arg2;
			field559 = 0;
		}

		if (field305 == -1) {
			field514 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field75[var4] = field75[var4 - 1];
			field76[var4] = field76[var4 - 1];
			field77[var4] = field77[var4 - 1];
		}

		field75[0] = arg1;
		field76[0] = arg0;
		field77[0] = arg2;
	}

	@ObfuscatedName("client.a(I[BI)Z")
	public final boolean method68(int arg0, byte[] arg1) {
		if (arg1 == null) {
			return true;
		}

		return signlink.wavesave(arg1, arg0);
	}

	@ObfuscatedName("client.a(IIIB)I")
	public final int method69(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg1;
			if (arg1 < 3 && (field464[1][var4][var5] & 0x2) == 2) {
				var6 = arg1 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg2 & 0x7F;
			int var9 = (128 - var7) * field402[var6][var4][var5] + field402[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field402[var6][var4][var5 + 1] + field402[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method70(String arg0) {
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

	@ObfuscatedName("client.r(I)V")
	public final void method71() {
		field243.method173();
		ZVPDLSTW.field1505 = field482;
		field399.method530(0, 0);

		if (field145 != -1) {
			method121(0, 0, VGGOSQRK.method538(field145), 0);
		} else if (field392[field107] != -1) {
			method121(0, 0, VGGOSQRK.method538(field392[field107]), 0);
		}

		if (field301 && field117 == 1) {
			method158();
		}

		field243.method174(field545, 205, 553);
		field245.method173();
		ZVPDLSTW.field1505 = field483;
	}

	@ObfuscatedName("client.s(I)V")
	public void method72() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field352);

		if (field403 != null) {
			System.out.println("Od-cycle:" + field403.field909);
		}

		System.out.println("loop-cycle:" + field512);
		System.out.println("draw-cycle:" + field158);
		System.out.println("ptype:" + field137);
		System.out.println("psize:" + field136);

		if (field427 != null) {
			field427.method425();
		}

		field542 = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final Component method73() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field548 != null) {
			return field548;
		}

		return this;
	}

	@ObfuscatedName("client.a(ZLVGGOSQRK;)Z")
	public final boolean method74(VGGOSQRK arg0) {
		int var2 = arg0.field1217;
		if (field232 == 2) {
			if (var2 == 201) {
				field514 = true;
				field225 = 0;
				field87 = true;
				field202 = "";
				field429 = 1;
				field350 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field514 = true;
				field225 = 0;
				field87 = true;
				field202 = "";
				field429 = 2;
				field350 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field140 = 250;
			return true;
		}

		if (var2 == 501) {
			field514 = true;
			field225 = 0;
			field87 = true;
			field202 = "";
			field429 = 4;
			field350 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field514 = true;
			field225 = 0;
			field87 = true;
			field202 = "";
			field429 = 5;
			field350 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field142[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = TMMXBYBU.field1074 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= TMMXBYBU.field1074) {
							var5 = 0;
						}
					}

					if (!TMMXBYBU.field1075[var5].field1081 && TMMXBYBU.field1075[var5].field1076 == var3 + (field104 ? 0 : 7)) {
						break;
					}
				}

				field142[var3] = var5;
				field141 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field340[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field147[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field147[var6].length) {
					var8 = 0;
				}
			}

			field340[var6] = var8;
			field141 = true;
		}

		if (var2 == 324 && !field104) {
			field104 = true;
			method92();
		}

		if (var2 == 325 && field104) {
			field104 = false;
			method92();
		}

		if (var2 == 326) {
			field332.method328(254);
			field332.method329(field104 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field332.method329(field142[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field332.method329(field340[var10]);
			}

			return true;
		}

		if (var2 == 620) {
			field180 = !field180;
		}

		if (var2 >= 601 && var2 <= 613) {
			method162();

			if (field157.length() > 0) {
				field332.method328(251);
				field332.method335(SISNGPYM.method428(field157));
				field332.method329(var2 - 601);
				field332.method329(field180 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.t(I)V")
	public final void method75() {
		while (true) {
			WIICVWRM var1 = field403.method321();
			if (var1 == null) {
				return;
			}

			if (var1.field1313 == 0) {
				JUQSYEMB.method210(var1.field1311, var1.field1312);

				if ((field403.method307(var1.field1312) & 0x62) != 0) {
					field491 = true;

					if (field305 != -1 || field453 != -1) {
						field514 = true;
					}
				}
			}

			if (var1.field1313 == 1 && var1.field1311 != null) {
				YYYUATIU.method576(var1.field1311);
			}

			if (var1.field1313 == 2 && field470 == var1.field1312 && var1.field1311 != null) {
				method85(field471, var1.field1311);
			}

			if (var1.field1313 == 3 && field394 == 1) {
				for (int var2 = 0; var2 < field338.length; var2++) {
					if (field308[var2] == var1.field1312) {
						field338[var2] = var1.field1311;

						if (var1.field1311 == null) {
							field308[var2] = -1;
						}

						break;
					}

					if (field309[var2] == var1.field1312) {
						field510[var2] = var1.field1311;

						if (var1.field1311 == null) {
							field309[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field1313 == 93 && field403.method312(var1.field1312)) {
				OBDFVVEL.method378(new NQUAUMDT(var1.field1311), field403);
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method76() {
		if (field79 > 1) {
			field79--;
		}

		if (field140 > 0) {
			field140--;
		}

		for (int var1 = 0; var1 < 5 && method27(); var1++) {
		}

		if (field313) {
			synchronized (field241.field1038) {
				if (!field105) {
					field241.field1040 = 0;
				} else if (field559 != 0 || field241.field1040 >= 40) {
					field332.method328(155);
					field332.method329(0);
					int var3 = field332.field929;
					int var4 = 0;
					for (int var5 = 0; var5 < field241.field1040 && var3 - field332.field929 < 240; var5++) {
						var4++;
						int var6 = field241.field1037[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field241.field1036[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field241.field1037[var5] == -1 && field241.field1036[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field504 != var7 || field505 != var6) {
							int var9 = var7 - field504;
							field504 = var7;
							int var10 = var6 - field505;
							field505 = var6;

							if (field95 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field332.method330((field95 << 12) + (var9 << 6) + var10);
								field95 = 0;
							} else if (field95 < 8) {
								field332.method332((field95 << 19) + var8 + 0x800000);
								field95 = 0;
							} else {
								field332.method333((field95 << 19) + var8 - 0x40000000);
								field95 = 0;
							}
						} else if (field95 < 2047) {
							field95++;
						}
					}

					field332.method338(field332.field929 - var3);

					if (var4 >= field241.field1040) {
						field241.field1040 = 0;
					} else {
						field241.field1040 -= var4;
						for (int var11 = 0; var11 < field241.field1040; var11++) {
							field241.field1036[var11] = field241.field1036[var4 + var11];
							field241.field1037[var11] = field241.field1037[var4 + var11];
						}
					}
				}
			}

			if (field559 != 0) {
				long var12 = (field562 - field261) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field261 = field562;
				int var14 = field561;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field560;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field559 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field332.method328(30);
				field332.method372((var17 << 19) + (var18 << 20) + var16);
			}

			if (field93 > 0) {
				field93--;
			}

			if (field563[1] == 1 || field563[2] == 1 || field563[3] == 1 || field563[4] == 1) {
				field94 = true;
			}

			if (field94 && field93 <= 0) {
				field93 = 20;
				field94 = false;
				field332.method328(10);
				field332.method364(field281);
				field332.method365(field282);
			}

			if (field550 && !field219) {
				field219 = true;
				field332.method328(153);
				field332.method329(1);
			}

			if (!field550 && field219) {
				field219 = false;
				field332.method328(153);
				field332.method329(0);
			}

			method102();
			method164();
			method128();
			field138++;
			if (field138 > 750) {
				method19();
			}

			method104();
			method43();
			method119();
			field106++;

			if (field500 != 0) {
				field499 += 20;
				if (field499 >= 400) {
					field500 = 0;
				}
			}

			if (field213 != 0) {
				field210++;
				if (field210 >= 15) {
					if (field213 == 2) {
						field491 = true;
					}

					if (field213 == 3) {
						field514 = true;
					}

					field213 = 0;
				}
			}

			if (field343 != 0) {
				field81++;

				if (field553 > field344 + 5 || field553 < field344 - 5 || field554 > field345 + 5 || field554 < field345 - 5) {
					field248 = true;
				}

				if (field552 == 0) {
					if (field343 == 2) {
						field491 = true;
					}

					if (field343 == 3) {
						field514 = true;
					}

					field343 = 0;

					if (field248 && field81 >= 5) {
						field279 = -1;
						method55();

						if (field341 == field279 && field342 != field278) {
							VGGOSQRK var19 = VGGOSQRK.method538(field341);
							byte var20 = 0;
							if (field240 == 1 && var19.field1217 == 206) {
								var20 = 1;
							}

							if (var19.field1210[field278] <= 0) {
								var20 = 0;
							}

							if (var19.field1225) {
								int var21 = field342;
								int var22 = field278;
								var19.field1210[var22] = var19.field1210[var21];
								var19.field1233[var22] = var19.field1233[var21];
								var19.field1210[var21] = -1;
								var19.field1233[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field342;
								int var24 = field278;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method532(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.method532(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.method532(field342, field278);
							}

							field332.method328(140);
							field332.method330(field342);
							field332.method356(var20);
							field332.method364(field341);
							field332.method330(field278);
						}
					} else if ((field223 == 1 || method42(field238 - 1)) && field238 > 2) {
						method111();
					} else if (field238 > 0) {
						method159(field238 - 1);
					}

					field210 = 10;
					field559 = 0;
				}
			}

			if (UJWODGQS.field1118 != -1) {
				int var25 = UJWODGQS.field1118;
				int var26 = UJWODGQS.field1119;
				boolean var27 = method156(0, 0, var26, 0, field383.field1352[0], 0, var25, 0, true, 0, field383.field1351[0]);
				UJWODGQS.field1118 = -1;

				if (var27) {
					field497 = field560;
					field498 = field561;
					field500 = 1;
					field499 = 0;
				}
			}

			if (field559 == 1 && field229 != null) {
				field229 = null;
				field514 = true;
				field559 = 0;
			}

			method64();

			if (field227 == -1) {
				method18();
				method106();
				method124();
			}

			if (field552 == 1 || field559 == 1) {
				field315++;
			}

			if (field306 == 0 && field222 == 0 && field447 == 0) {
				if (field462 > 0) {
					field462--;
				}
			} else if (field462 < 100) {
				field462++;
				if (field462 == 100) {
					if (field306 != 0) {
						field514 = true;
					}

					if (field222 != 0) {
						field491 = true;
					}
				}
			}

			if (field394 == 2) {
				method125();
			}

			if (field394 == 2 && field465) {
				method123();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field485[var28]++;
			}

			method150();
			field551++;
			if (field551 > 4500) {
				field140 = 250;
				field551 -= 500;
				field332.method328(200);
			}

			field384++;
			if (field384 > 500) {
				field384 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field207 += field208;
				}

				if ((var29 & 0x2) == 2) {
					field234 += field235;
				}

				if ((var29 & 0x4) == 4) {
					field297 += field298;
				}
			}

			if (field207 < -50) {
				field208 = 2;
			}

			if (field207 > 50) {
				field208 = -2;
			}

			if (field234 < -55) {
				field235 = 2;
			}

			if (field234 > 55) {
				field235 = -2;
			}

			if (field297 < -40) {
				field298 = 1;
			}

			if (field297 > 40) {
				field298 = -1;
			}

			field97++;
			if (field97 > 500) {
				field97 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field194 += field195;
				}

				if ((var30 & 0x2) == 2) {
					field73 += field74;
				}
			}

			if (field194 < -60) {
				field195 = 2;
			}

			if (field194 > 60) {
				field195 = -2;
			}

			if (field73 < -20) {
				field74 = 1;
			}

			if (field73 > 10) {
				field74 = -1;
			}

			field139++;
			if (field139 > 50) {
				field332.method328(28);
			}

			try {
				if (field427 != null && field332.field929 > 0) {
					field427.method424(0, field332.field928, field332.field929);
					field332.field929 = 0;
					field139 = 0;
				}
			} catch (IOException var32) {
				method19();
			} catch (Exception var33) {
				method23();
			}
		}
	}

	@ObfuscatedName("client.c(IZ)Ljava/lang/String;")
	public static final String method77(int arg0) {
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

	@ObfuscatedName("client.v(I)V")
	public final void method78() {
		field469 = false;
		while (field468) {
			field469 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field303 = null;
		field304 = null;
		field216 = null;
		field175 = null;
		field176 = null;
		field177 = null;
		field178 = null;
		field187 = null;
		field188 = null;
		field466 = null;
		field467 = null;
		field501 = null;
		field502 = null;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method79() {
		try {
			field155 = -1;
			field495.method204();
			field226.method204();
			ZVPDLSTW.method591();
			method143();
			field182.method458();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field494[var1].method561();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field464[var2][var3][var4] = 0;
					}
				}
			}

			OBDFVVEL var5 = new OBDFVVEL(104, field402, 104, field464);
			int var6 = field338.length;
			field332.method328(28);

			if (!field114) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field307[var7] >> 8) * 64 - field262;
					int var9 = (field307[var7] & 0xFF) * 64 - field263;
					byte[] var10 = field338[var7];
					if (var10 != null) {
						var5.method383(var9, var8, field494, var10, (field268 - 6) * 8, (field267 - 6) * 8);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field307[var11] >> 8) * 64 - field262;
					int var13 = (field307[var11] & 0xFF) * 64 - field263;
					byte[] var14 = field338[var11];
					if (var14 == null && field268 < 800) {
						var5.method386(var13, 64, 64, var12);
					}
				}

				field332.method328(28);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field510[var15];
					if (var16 != null) {
						int var17 = (field307[var15] >> 8) * 64 - field262;
						int var18 = (field307[var15] & 0xFF) * 64 - field263;
						var5.method381(var18, var16, field494, field182, var17);
					}
				}
			}

			if (field114) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							boolean var22 = false;
							int var23 = field206[var19][var20][var21];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < field307.length; var29++) {
									if (field307[var29] == var28 && field338[var29] != null) {
										var5.method393((var26 & 0x7) * 8, var20 * 8, field338[var29], (var27 & 0x7) * 8, var24, field494, var21 * 8, var25, var19);
										var22 = true;
										break;
									}
								}
							}

							if (!var22) {
								var5.method385(var20 * 8, var19, var21 * 8);
							}
						}
					}
				}

				for (int var30 = 0; var30 < 13; var30++) {
					for (int var31 = 0; var31 < 13; var31++) {
						int var32 = field206[0][var30][var31];
						if (var32 == -1) {
							var5.method386(var31 * 8, 8, 8, var30 * 8);
						}
					}
				}

				field332.method328(28);

				for (int var33 = 0; var33 < 4; var33++) {
					for (int var34 = 0; var34 < 13; var34++) {
						for (int var35 = 0; var35 < 13; var35++) {
							int var36 = field206[var33][var34][var35];
							if (var36 != -1) {
								int var37 = var36 >> 24 & 0x3;
								int var38 = var36 >> 1 & 0x3;
								int var39 = var36 >> 14 & 0x3FF;
								int var40 = var36 >> 3 & 0x7FF;
								int var41 = (var39 / 8 << 8) + var40 / 8;
								for (int var42 = 0; var42 < field307.length; var42++) {
									if (field307[var42] == var41 && field510[var42] != null) {
										var5.method395(var38, field182, field494, field510[var42], (var39 & 0x7) * 8, var34 * 8, var37, (var40 & 0x7) * 8, var35 * 8, var33);
										break;
									}
								}
							}
						}
					}
				}
			}

			field332.method328(28);
			var5.method394(field494, field182);

			if (field245 != null) {
				field245.method173();
				ZVPDLSTW.field1505 = field483;
			}

			field332.method328(28);
			int var43 = OBDFVVEL.field951;
			if (var43 > field503) {
				var43 = field503;
			}

			if (var43 < field503 - 1) {
				int var44 = field503 - 1;
			}

			if (field169) {
				field182.method459(OBDFVVEL.field951);
			} else {
				field182.method459(0);
			}

			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					method98(var45, var46);
				}
			}

			method30();
		} catch (Exception var59) {
		}

		KBTDMRWU.field801.method511();

		if (field548 != null) {
			field332.method328(205);
			field332.method333(1057001181);
		}

		if (field169 && signlink.cache_dat != null) {
			int var48 = field403.method325(0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = field403.method307(var49);
				if ((var50 & 0x79) == 0) {
					JUQSYEMB.method211(var49);
				}
			}
		}

		System.gc();
		ZVPDLSTW.method592(20);
		field403.method319();
		int var51 = (field267 - 6) / 8 - 1;
		int var52 = (field267 + 6) / 8 + 1;
		int var53 = (field268 - 6) / 8 - 1;
		int var54 = (field268 + 6) / 8 + 1;
		if (field242) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}

		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = field403.method310(0, var56, var55);
					if (var57 != -1) {
						field403.method324(var57, 3);
					}

					int var58 = field403.method310(1, var56, var55);
					if (var58 != -1) {
						field403.method324(var58, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method80() {
		if (field546 == null) {
			method78();
			field357 = null;
			field358 = null;
			field359 = null;
			field360 = null;
			field361 = null;
			field362 = null;
			field363 = null;
			field364 = null;
			field365 = null;
			field246 = null;
			field244 = null;
			field243 = null;
			field245 = null;
			field130 = null;
			field131 = null;
			field132 = null;
			field546 = new ERQSZFRT(503, 765, method73());
			field98 = true;
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void method81() {
		if (!field258 && !field196 && !field454) {
			field512++;

			if (field313) {
				method76();
			} else {
				method66();
			}

			method75();
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method82(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field77[var4] != null) {
				int var5 = field75[var4];
				int var6 = field312 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field76[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field414 == 0 || field414 == 1 && method152(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field383.field1390)) {
						if (field217 >= 1) {
							field351[field238] = "Report abuse @whi@" + var7;
							field508[field238] = 722;
							field238++;
						}

						field351[field238] = "Add ignore @whi@" + var7;
						field508[field238] = 444;
						field238++;
						field351[field238] = "Add friend @whi@" + var7;
						field508[field238] = 159;
						field238++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field513 == 0 && (var5 == 7 || field154 == 0 || field154 == 1 && method152(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (field217 >= 1) {
							field351[field238] = "Report abuse @whi@" + var7;
							field508[field238] = 722;
							field238++;
						}

						field351[field238] = "Add ignore @whi@" + var7;
						field508[field238] = 444;
						field238++;
						field351[field238] = "Add friend @whi@" + var7;
						field508[field238] = 159;
						field238++;
					}

					var3++;
				}

				if (var5 == 4 && (field269 == 0 || field269 == 1 && method152(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field351[field238] = "Accept trade @whi@" + var7;
						field508[field238] = 749;
						field238++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field513 == 0 && field154 < 2) {
					var3++;
				}

				if (var5 == 8 && (field269 == 0 || field269 == 1 && method152(var7))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						field351[field238] = "Accept challenge @whi@" + var7;
						field508[field238] = 921;
						field238++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method83() {
		int var1 = 5;
		field108[8] = 0;
		int var2 = 0;
		while (field108[8] == 0) {
			String var3 = "Unknown problem";
			method101(20, "Connecting to web server");

			try {
				DataInputStream var4 = method148("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 358);
				NQUAUMDT var5 = new NQUAUMDT(new byte[40]);
				var4.readFully(var5.field928, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field108[var6] = var5.method344();
				}

				int var7 = var5.method344();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field108[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field108[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field108[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field108[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field108[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field108[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method101(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						method101(10, var3 + " - Will retry in " + var10 + " secs.");
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

				field381 = !field381;
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field548 != null) {
				return new URL("http://127.0.0.1:" + (field167 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method84() {
		for (PKNSNRDF var1 = (PKNSNRDF) field495.method200(); var1 != null; var1 = (PKNSNRDF) field495.method202()) {
			if (field503 != var1.field993 || var1.field992) {
				var1.method326();
			} else if (field512 >= var1.field989) {
				var1.method415(field106);

				if (var1.field992) {
					var1.method326();
				} else {
					field182.method469(var1, var1.field994, -1, var1.field996, 0, 60, false, var1.field993, var1.field995);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZ[B)V")
	public final void method85(boolean arg0, byte[] arg1) {
		if (field165) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.a(LVGGOSQRK;I)Z")
	public final boolean method86(VGGOSQRK arg0) {
		if (arg0.field1226 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1226.length; var2++) {
			int var3 = method21(var2, arg0);
			int var4 = arg0.field1221[var2];
			if (arg0.field1226[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1226[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1226[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(ZILNQUAUMDT;)V")
	public final void method87(int arg0, NQUAUMDT arg1) {
		for (int var3 = 0; var3 < field409; var3++) {
			int var4 = field410[var3];
			DWBMCYCE var5 = field151[var4];
			int var6 = arg1.method339();
			if ((var6 & 0x4) != 0) {
				int var7 = arg1.method367();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg1.method358();
				if (var5.field1345 == var7 && var7 != -1) {
					int var9 = KYGPROVJ.field828[var7].field842;
					if (var9 == 1) {
						var5.field1346 = 0;
						var5.field1347 = 0;
						var5.field1348 = var8;
						var5.field1349 = 0;
					}

					if (var9 == 2) {
						var5.field1349 = 0;
					}
				} else if (var7 == -1 || var5.field1345 == -1 || KYGPROVJ.field828[var7].field836 >= KYGPROVJ.field828[var5.field1345].field836) {
					var5.field1345 = var7;
					var5.field1346 = 0;
					var5.field1347 = 0;
					var5.field1348 = var8;
					var5.field1349 = 0;
					var5.field1353 = var5.field1318;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.field1319 = arg1.method346();
				var5.field1350 = 100;
			}

			if ((var6 & 0x40) != 0) {
				int var10 = arg1.method359();
				int var11 = arg1.method358();
				var5.method555(field512, var11, var10);
				var5.field1320 = field512 + 300;
				var5.field1321 = arg1.method359();
				var5.field1322 = arg1.method359();
			}

			if ((var6 & 0x1) != 0) {
				var5.field536 = APPQAEOL.method10(arg1.method367());
				var5.field1327 = var5.field536.field8;
				var5.field1326 = var5.field536.field6;
				var5.field1333 = var5.field536.field32;
				var5.field1334 = var5.field536.field42;
				var5.field1335 = var5.field536.field35;
				var5.field1336 = var5.field536.field21;
				var5.field1360 = var5.field536.field25;
			}

			if ((var6 & 0x10) != 0) {
				var5.field1359 = arg1.method367();
				if (var5.field1359 == 0xFFFF) {
					var5.field1359 = -1;
				}
			}

			if ((var6 & 0x80) != 0) {
				int var12 = arg1.method357();
				int var13 = arg1.method357();
				var5.method555(field512, var13, var12);
				var5.field1320 = field512 + 300;
				var5.field1321 = arg1.method339();
				var5.field1322 = arg1.method357();
			}

			if ((var6 & 0x2) != 0) {
				var5.field1316 = arg1.method367();
				var5.field1317 = arg1.method341();
			}

			if ((var6 & 0x8) != 0) {
				var5.field1328 = arg1.method368();
				int var14 = arg1.method344();
				var5.field1332 = var14 >> 16;
				var5.field1331 = (var14 & 0xFFFF) + field512;
				var5.field1329 = 0;
				var5.field1330 = 0;

				if (var5.field1331 > field512) {
					var5.field1329 = -1;
				}

				if (var5.field1328 == 0xFFFF) {
					var5.field1328 = -1;
				}
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method88(int arg0, int arg1) {
		boolean var3 = false;
		VGGOSQRK var4 = VGGOSQRK.method538(arg0);
		for (int var5 = 0; var5 < var4.field1224.length && var4.field1224[var5] != -1; var5++) {
			VGGOSQRK var6 = VGGOSQRK.method538(var4.field1224[var5]);
			if (var6.field1279 == 0) {
				var3 |= method88(var6.field1246, arg1);
			}

			if (var6.field1279 == 6 && (var6.field1235 != -1 || var6.field1236 != -1)) {
				boolean var7 = method86(var6);
				int var8;
				if (var7) {
					var8 = var6.field1236;
				} else {
					var8 = var6.field1235;
				}

				if (var8 != -1) {
					KYGPROVJ var9 = KYGPROVJ.field828[var8];
					var6.field1211 += arg1;
					while (var6.field1211 > var9.method256(var6.field1243)) {
						var6.field1211 -= var9.method256(var6.field1243) + 1;
						var6.field1243++;
						if (var6.field1243 >= var9.field829) {
							var6.field1243 -= var9.field833;
							if (var6.field1243 < 0 || var6.field1243 >= var9.field829) {
								var6.field1243 = 0;
							}
						}

						var3 = true;
					}
				}
			}

			if (var6.field1279 == 6 && var6.field1276 != 0) {
				int var10 = var6.field1276 >> 16;
				int var11 = var6.field1276 << 16 >> 16;
				var10 = arg1 * var10;
				var11 = arg1 * var11;
				var6.field1229 = var6.field1229 + var10 & 0x7FF;
				var6.field1230 = var6.field1230 + var11 & 0x7FF;
				var3 = true;
			}
		}

		return var3;
	}

	@ObfuscatedName("client.g(B)I")
	public final int method89() {
		int var1 = 3;
		if (field128 < 310) {
			int var2 = field125 >> 7;
			int var3 = field127 >> 7;
			int var4 = field383.field1342 >> 7;
			int var5 = field383.field1343 >> 7;

			if ((field464[field503][var2][var3] & 0x4) != 0) {
				var1 = field503;
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

					if ((field464[field503][var2][var3] & 0x4) != 0) {
						var1 = field503;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field464[field503][var2][var3] & 0x4) != 0) {
							var1 = field503;
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

					if ((field464[field503][var2][var3] & 0x4) != 0) {
						var1 = field503;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field464[field503][var2][var3] & 0x4) != 0) {
							var1 = field503;
						}
					}
				}
			}
		}

		if ((field464[field503][field383.field1342 >> 7][field383.field1343 >> 7] & 0x4) != 0) {
			var1 = field503;
		}

		return var1;
	}

	@ObfuscatedName("client.y(I)I")
	public final int method90() {
		int var1 = method69(field125, field503, field127);
		if (var1 - field126 < 800 && (field464[field503][field125 >> 7][field127 >> 7] & 0x4) != 0) {
			return field503;
		}

		return 3;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method91() {
		field246.method173();
		ZVPDLSTW.field1505 = field481;
		field401.method530(0, 0);

		if (field87) {
			field368.method435(0, 40, field350, 239);
			field368.method435(128, 60, field202 + "*", 239);
		} else if (field225 == 1) {
			field368.method435(0, 40, "Enter amount:", 239);
			field368.method435(128, 60, field478 + "*", 239);
		} else if (field225 == 2) {
			field368.method435(0, 40, "Enter name:", 239);
			field368.method435(128, 60, field478 + "*", 239);
		} else if (field225 == 3) {
			if (field82 != field478) {
				method118(field478);
				field82 = field478;
			}

			TJCUOFPI var1 = field367;
			VMBJKBNJ.method544(0, 463, 0, 77);

			for (int var2 = 0; var2 < field83; var2++) {
				int var3 = var2 * 14 + 18 - field86;
				if (var3 > 0 && var3 < 110) {
					var1.method435(0, var3, field84[var2], 239);
				}
			}

			VMBJKBNJ.method543();

			if (field83 > 5) {
				method133(field83 * 14 + 7, 463, field86, 77, 0);
			}

			if (field478.length() == 0) {
				field368.method435(255, 40, "Enter object name", 239);
			} else if (field83 == 0) {
				field368.method435(0, 40, "No matching objects found, please shorten search", 239);
			}

			var1.method435(0, 90, field478 + "*", 239);
			VMBJKBNJ.method550(0, 77, 0, 479);
		} else if (field229 != null) {
			field368.method435(0, 40, field229, 239);
			field368.method435(128, 60, "Click to continue", 239);
		} else if (field305 != -1) {
			method121(0, 0, VGGOSQRK.method538(field305), 0);
		} else if (field453 == -1) {
			TJCUOFPI var4 = field367;
			int var5 = 0;
			VMBJKBNJ.method544(0, 463, 0, 77);

			for (int var6 = 0; var6 < 100; var6++) {
				if (field77[var6] != null) {
					int var7 = field75[var6];
					int var8 = field312 + 70 - var5 * 14;
					String var9 = field76[var6];
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
							var4.method439(0, field77[var6], 4, var8);
						}

						var5++;
					}

					if ((var7 == 1 || var7 == 2) && (var7 == 1 || field414 == 0 || field414 == 1 && method152(var9))) {
						if (var8 > 0 && var8 < 110) {
							int var11 = 4;
							if (var10 == 1) {
								field320[0].method530(var8 - 12, var11);
								var11 += 14;
							}

							if (var10 == 2) {
								field320[1].method530(var8 - 12, var11);
								var11 += 14;
							}

							var4.method439(0, var9 + ":", var11, var8);
							var11 += var4.method437(var9) + 8;
							var4.method439(255, field77[var6], var11, var8);
						}

						var5++;
					}

					if ((var7 == 3 || var7 == 7) && field513 == 0 && (var7 == 7 || field154 == 0 || field154 == 1 && method152(var9))) {
						if (var8 > 0 && var8 < 110) {
							byte var12 = 4;
							var4.method439(0, "From", var12, var8);
							int var14 = var12 + var4.method437("From ");
							if (var10 == 1) {
								field320[0].method530(var8 - 12, var14);
								var14 += 14;
							}

							if (var10 == 2) {
								field320[1].method530(var8 - 12, var14);
								var14 += 14;
							}

							var4.method439(0, var9 + ":", var14, var8);
							var14 += var4.method437(var9) + 8;
							var4.method439(0x800000, field77[var6], var14, var8);
						}

						var5++;
					}

					if (var7 == 4 && (field269 == 0 || field269 == 1 && method152(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method439(0x800080, var9 + " " + field77[var6], 4, var8);
						}

						var5++;
					}

					if (var7 == 5 && field513 == 0 && field154 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method439(0x800000, field77[var6], 4, var8);
						}

						var5++;
					}

					if (var7 == 6 && field513 == 0 && field154 < 2) {
						if (var8 > 0 && var8 < 110) {
							var4.method439(0, "To " + var9 + ":", 4, var8);
							var4.method439(0x800000, field77[var6], var4.method437("To " + var9) + 12, var8);
						}

						var5++;
					}

					if (var7 == 8 && (field269 == 0 || field269 == 1 && method152(var9))) {
						if (var8 > 0 && var8 < 110) {
							var4.method439(0x7E3200, var9 + " " + field77[var6], 4, var8);
						}

						var5++;
					}
				}
			}

			VMBJKBNJ.method543();
			field442 = var5 * 14 + 7;
			if (field442 < 78) {
				field442 = 78;
			}

			method133(field442, 463, field442 - field312 - 77, 77, 0);
			String var13;
			if (field383 == null || field383.field1390 == null) {
				var13 = SISNGPYM.method432(field432);
			} else {
				var13 = field383.field1390;
			}

			var4.method439(0, var13 + ":", 4, 90);
			var4.method439(255, field446 + "*", var4.method437(var13 + ": ") + 6, 90);
			VMBJKBNJ.method550(0, 77, 0, 479);
		} else {
			method121(0, 0, VGGOSQRK.method538(field453), 0);
		}

		if (field301 && field117 == 2) {
			method158();
		}

		field246.method174(field545, 357, 17);
		field245.method173();
		ZVPDLSTW.field1505 = field483;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method92() {
		field141 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field142[var1] = -1;
			for (int var2 = 0; var2 < TMMXBYBU.field1074; var2++) {
				if (!TMMXBYBU.field1075[var2].field1081 && TMMXBYBU.field1075[var2].field1076 == var1 + (field104 ? 0 : 7)) {
					field142[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method93() {
		field321 = 0;
		for (int var1 = -1; var1 < field407 + field152; var1++) {
			XEGGEBDS var2;
			if (var1 == -1) {
				var2 = field383;
			} else if (var1 < field407) {
				var2 = field406[field408[var1]];
			} else {
				var2 = field151[field153[var1 - field407]];
			}

			if (var2 != null && var2.method166()) {
				if (var2 instanceof DWBMCYCE) {
					APPQAEOL var3 = ((DWBMCYCE) var2).field536;
					if (var3.field14 != null) {
						var3 = var3.method5();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field407) {
					APPQAEOL var6 = ((DWBMCYCE) var2).field536;
					if (var6.field40 >= 0 && var6.field40 < field116.length) {
						method109(var2.field1338 + 15, var2);

						if (field185 > -1) {
							field116[var6.field40].method185(field186 - 30, field185 - 12);
						}
					}

					if (field113 == 1 && field153[var1 - field407] == field300 && field512 % 20 < 10) {
						method109(var2.field1338 + 15, var2);

						if (field185 > -1) {
							field490[0].method185(field186 - 28, field185 - 12);
						}
					}
				} else {
					int var4 = 30;
					XVMRCEYW var5 = (XVMRCEYW) var2;
					if (var5.field1393 != -1 || var5.field1389 != -1) {
						method109(var2.field1338 + 15, var2);

						if (field185 > -1) {
							if (var5.field1393 != -1) {
								field486[var5.field1393].method185(field186 - var4, field185 - 12);
								var4 += 25;
							}

							if (var5.field1389 != -1) {
								field116[var5.field1389].method185(field186 - var4, field185 - 12);
								var4 += 25;
							}
						}
					}

					if (var1 >= 0 && field113 == 10 && field408[var1] == field314) {
						method109(var2.field1338 + 15, var2);

						if (field185 > -1) {
							field490[1].method185(field186 - var4, field185 - 12);
						}
					}
				}

				if (var2.field1319 != null && (var1 >= field407 || field414 == 0 || field414 == 3 || field414 == 1 && method152(((XVMRCEYW) var2).field1390))) {
					method109(var2.field1338, var2);

					if (field185 > -1 && field321 < field322) {
						field326[field321] = field368.method438(var2.field1319) / 2;
						field325[field321] = field368.field1071;
						field323[field321] = field185;
						field324[field321] = field186;
						field327[field321] = var2.field1337;
						field328[field321] = var2.field1339;
						field329[field321] = var2.field1350;
						field330[field321++] = var2.field1319;

						if (field96 == 0 && var2.field1339 >= 1 && var2.field1339 <= 3) {
							field325[field321] += 10;
							field324[field321] += 5;
						}

						if (field96 == 0 && var2.field1339 == 4) {
							field326[field321] = 60;
						}

						if (field96 == 0 && var2.field1339 == 5) {
							field325[field321] += 5;
						}
					}
				}

				if (var2.field1320 > field512) {
					method109(var2.field1338 + 15, var2);

					if (field185 > -1) {
						int var7 = var2.field1321 * 30 / var2.field1322;
						if (var7 > 30) {
							var7 = 30;
						}

						VMBJKBNJ.method547(var7, field185 - 15, 5, field186 - 3, 0xFF00);
						VMBJKBNJ.method547(30 - var7, field185 - 15 + var7, 5, field186 - 3, 0xFF0000);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.field1357[var8] > field512) {
						method109(var2.field1338 / 2, var2);

						if (field185 > -1) {
							if (var8 == 1) {
								field186 -= 20;
							}

							if (var8 == 2) {
								field185 -= 15;
								field186 -= 10;
							}

							if (var8 == 3) {
								field185 += 15;
								field186 -= 10;
							}

							field89[var2.field1356[var8]].method185(field186 - 12, field185 - 12);
							field366.method435(0, field186 + 4, String.valueOf(var2.field1355[var8]), field185);
							field366.method435(0xFFFFFF, field186 + 3, String.valueOf(var2.field1355[var8]), field185 - 1);
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < field321; var9++) {
			int var10 = field323[var9];
			int var11 = field324[var9];
			int var12 = field326[var9];
			int var13 = field325[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field324[var15] - field325[var15] && var11 - var13 < field324[var15] + 2 && var10 - var12 < field326[var15] + field323[var15] && var10 + var12 > field323[var15] - field326[var15] && field324[var15] - field325[var15] < var11) {
						var11 = field324[var15] - field325[var15];
						var14 = true;
					}
				}
			}

			field185 = field323[var9];
			field186 = field324[var9] = var11;
			String var16 = field330[var9];
			if (field96 == 0) {
				int var17 = 0xFFFF00;
				if (field327[var9] < 6) {
					var17 = field179[field327[var9]];
				}

				if (field327[var9] == 6) {
					var17 = field109 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field327[var9] == 7) {
					var17 = field109 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field327[var9] == 8) {
					var17 = field109 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field327[var9] == 9) {
					int var18 = 150 - field329[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (field327[var9] == 10) {
					int var19 = 150 - field329[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (field327[var9] == 11) {
					int var20 = 150 - field329[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (field328[var9] == 0) {
					field368.method435(0, field186 + 1, var16, field185);
					field368.method435(var17, field186, var16, field185);
				}

				if (field328[var9] == 1) {
					field368.method440(field185, field186 + 1, var16, field109, 0);
					field368.method440(field185, field186, var16, field109, var17);
				}

				if (field328[var9] == 2) {
					field368.method441(field186 + 1, var16, field185, field109, 0);
					field368.method441(field186, var16, field185, field109, var17);
				}

				if (field328[var9] == 3) {
					field368.method442(field186 + 1, field109, 0, var16, field185, 150 - field329[var9]);
					field368.method442(field186, field109, var17, var16, field185, 150 - field329[var9]);
				}

				if (field328[var9] == 4) {
					int var21 = field368.method438(var16);
					int var22 = (150 - field329[var9]) * (var21 + 100) / 150;
					VMBJKBNJ.method544(0, field185 + 50, field185 - 50, 334);
					field368.method439(0, var16, field185 + 50 - var22, field186 + 1);
					field368.method439(var17, var16, field185 + 50 - var22, field186);
					VMBJKBNJ.method543();
				}

				if (field328[var9] == 5) {
					int var23 = 150 - field329[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}

					VMBJKBNJ.method544(field186 - field368.field1071 - 1, 512, 0, field186 + 5);
					field368.method435(0, field186 + var24 + 1, var16, field185);
					field368.method435(var17, field186 + var24, var16, field185);
					VMBJKBNJ.method543();
				}
			} else {
				field368.method435(0, field186 + 1, var16, field185);
				field368.method435(0xFFFF00, field186, var16, field185);
			}
		}
	}

	@ObfuscatedName("client.a(LUZETOFZZ;B)V")
	public final void method94(UZETOFZZ arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field187.length; var3++) {
			field187[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field187[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field188[var9] = (field187[var9 - 1] + field187[var9 + 1] + field187[var9 - 128] + field187[var9 + 128]) / 4;
				}
			}

			int[] var10 = field187;
			field187 = field188;
			field188 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field1205; var12++) {
				for (int var13 = 0; var13 < arg0.field1204; var13++) {
					if (arg0.field1202[var11++] != 0) {
						int var14 = var13 + arg0.field1206 + 16;
						int var15 = var12 + arg0.field1207 + 16;
						int var16 = (var15 << 7) + var14;
						field187[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(LNQUAUMDT;II)V")
	public final void method95(NQUAUMDT arg0, int arg1) {
		arg0.method349();
		int var3 = arg0.method350(8);
		if (var3 < field152) {
			for (int var4 = var3; var4 < field152; var4++) {
				field390[field389++] = field153[var4];
			}
		}

		if (var3 > field152) {
			signlink.reporterror(field432 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field152 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field153[var5];
			DWBMCYCE var7 = field151[var6];
			int var8 = arg0.method350(1);
			if (var8 == 0) {
				field153[field152++] = var6;
				var7.field1362 = field512;
			} else {
				int var9 = arg0.method350(2);
				if (var9 == 0) {
					field153[field152++] = var6;
					var7.field1362 = field512;
					field410[field409++] = var6;
				} else if (var9 == 1) {
					field153[field152++] = var6;
					var7.field1362 = field512;
					int var10 = arg0.method350(3);
					var7.method554(false, var10);
					int var11 = arg0.method350(1);
					if (var11 == 1) {
						field410[field409++] = var6;
					}
				} else if (var9 == 2) {
					field153[field152++] = var6;
					var7.field1362 = field512;
					int var12 = arg0.method350(3);
					var7.method554(true, var12);
					int var13 = arg0.method350(3);
					var7.method554(true, var13);
					int var14 = arg0.method350(1);
					if (var14 == 1) {
						field410[field409++] = var6;
					}
				} else if (var9 == 3) {
					field390[field389++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg0 & 0x7FF;
		int var8 = 2048 - arg5 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg2;
		if (var7 != 0) {
			int var12 = JUQSYEMB.field743[var7];
			int var13 = JUQSYEMB.field744[var7];
			int var14 = var10 * var13 - arg2 * var12 >> 16;
			var11 = var10 * var12 + arg2 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = JUQSYEMB.field743[var8];
			int var16 = JUQSYEMB.field744[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field125 = arg1 - var9;
		field126 = arg3 - var10;
		field127 = arg4 - var11;
		field128 = arg0;
		field129 = arg5;
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method97() {
		byte[] var1 = field259.method427("title.dat", null);
		FKNRMZJV var2 = new FKNRMZJV(var1, this);
		field360.method173();
		var2.method183(0, 0);
		field361.method173();
		var2.method183(-637, 0);
		field357.method173();
		var2.method183(-128, 0);
		field358.method173();
		var2.method183(-202, -371);
		field359.method173();
		var2.method183(-202, -171);
		field362.method173();
		var2.method183(0, -265);
		field363.method173();
		var2.method183(-562, -265);
		field364.method173();
		var2.method183(-128, -171);
		field365.method173();
		var2.method183(-562, -171);
		int[] var3 = new int[var2.field591];
		for (int var4 = 0; var4 < var2.field592; var4++) {
			for (int var5 = 0; var5 < var2.field591; var5++) {
				var3[var5] = var2.field590[var2.field591 * var4 + var2.field591 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field591; var6++) {
				var2.field590[var2.field591 * var4 + var6] = var3[var6];
			}
		}

		field360.method173();
		var2.method183(382, 0);
		field361.method173();
		var2.method183(-255, 0);
		field357.method173();
		var2.method183(254, 0);
		field358.method173();
		var2.method183(180, -371);
		field359.method173();
		var2.method183(180, -171);
		field362.method173();
		var2.method183(382, -265);
		field363.method173();
		var2.method183(-180, -265);
		field364.method173();
		var2.method183(254, -171);
		field365.method173();
		var2.method183(-180, -171);
		FKNRMZJV var7 = new FKNRMZJV(field259, "logo", 0);
		field357.method173();
		var7.method185(18, 382 - var7.field591 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.d(II)V")
	public final void method98(int arg0, int arg1) {
		FYVRCFGT var3 = field348[field503][arg0][arg1];
		if (var3 == null) {
			field182.method479(field503, arg0, arg1);
		} else {
			int var4 = -99999999;
			RQFEYKNL var5 = null;
			for (RQFEYKNL var6 = (RQFEYKNL) var3.method200(); var6 != null; var6 = (RQFEYKNL) var3.method202()) {
				ULRRTYRQ var7 = ULRRTYRQ.method520(var6.field1034);
				int var8 = var7.field1176;
				if (var7.field1192) {
					var8 = (var6.field1033 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method198(var5);
			RQFEYKNL var9 = null;
			RQFEYKNL var10 = null;
			for (RQFEYKNL var11 = (RQFEYKNL) var3.method200(); var11 != null; var11 = (RQFEYKNL) var3.method202()) {
				if (var5.field1034 != var11.field1034 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1034 != var11.field1034 && var9.field1034 != var11.field1034 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field182.method465(var9, var5, method69(arg0 * 128 + 64, field503, arg1 * 128 + 64), var12, arg1, field503, arg0, var10);
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method99(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field451; var3++) {
				if (field236[var3] == arg0) {
					field451--;
					field491 = true;

					for (int var4 = var3; var4 < field451; var4++) {
						field236[var4] = field236[var4 + 1];
					}

					field332.method328(229);
					field332.method335(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method100() {
		field244.method173();

		if (field255 == 2) {
			byte[] var1 = field400.field1202;
			int[] var2 = VMBJKBNJ.field1283;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field148.method189(0, 33, 25, 33, 25, 0, 256, field282, field90, field101);
			field245.method173();
			ZVPDLSTW.field1505 = field483;
		} else {
			int var5 = field282 + field194 & 0x7FF;
			int var6 = field383.field1342 / 32 + 48;
			int var7 = 464 - field383.field1343 / 32;
			field388.method189(5, 151, var6, 146, var7, 25, field73 + 256, var5, field88, field115);
			field148.method189(0, 33, 25, 33, 25, 0, 256, field282, field90, field101);

			for (int var8 = 0; var8 < field316; var8++) {
				int var9 = field317[var8] * 4 + 2 - field383.field1342 / 32;
				int var10 = field318[var8] * 4 + 2 - field383.field1343 / 32;
				method120(var9, field334[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					FYVRCFGT var13 = field348[field503][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field383.field1342 / 32;
						int var15 = var12 * 4 + 2 - field383.field1343 / 32;
						method120(var14, field473, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field152; var16++) {
				DWBMCYCE var17 = field151[field153[var16]];
				if (var17 != null && var17.method166()) {
					APPQAEOL var18 = var17.field536;
					if (var18.field14 != null) {
						var18 = var18.method5();
					}

					if (var18 != null && var18.field19 && var18.field9) {
						int var19 = var17.field1342 / 32 - field383.field1342 / 32;
						int var20 = var17.field1343 / 32 - field383.field1343 / 32;
						method120(var19, field474, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field407; var21++) {
				XVMRCEYW var22 = field406[field408[var21]];
				if (var22 != null && var22.method166()) {
					int var23 = var22.field1342 / 32 - field383.field1342 / 32;
					int var24 = var22.field1343 / 32 - field383.field1343 / 32;
					boolean var25 = false;
					long var26 = SISNGPYM.method428(var22.field1390);
					for (int var28 = 0; var28 < field231; var28++) {
						if (field331[var28] == var26 && field189[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field383.field1396 != 0 && var22.field1396 != 0 && field383.field1396 == var22.field1396) {
						var29 = true;
					}

					if (var25) {
						method120(var23, field476, var24);
					} else if (var29) {
						method120(var23, field477, var24);
					} else {
						method120(var23, field475, var24);
					}
				}
			}

			if (field113 != 0 && field512 % 20 < 10) {
				if (field113 == 1 && field300 >= 0 && field300 < field151.length) {
					DWBMCYCE var30 = field151[field300];
					if (var30 != null) {
						int var31 = var30.field1342 / 32 - field383.field1342 / 32;
						int var32 = var30.field1343 / 32 - field383.field1343 / 32;
						method53(var31, var32, field123);
					}
				}

				if (field113 == 2) {
					int var33 = (field272 - field262) * 4 + 2 - field383.field1342 / 32;
					int var34 = (field273 - field263) * 4 + 2 - field383.field1343 / 32;
					method53(var33, var34, field123);
				}

				if (field113 == 10 && field314 >= 0 && field314 < field406.length) {
					XVMRCEYW var35 = field406[field314];
					if (var35 != null) {
						int var36 = var35.field1342 / 32 - field383.field1342 / 32;
						int var37 = var35.field1343 / 32 - field383.field1343 / 32;
						method53(var36, var37, field123);
					}
				}
			}

			if (field386 != 0) {
				int var38 = field386 * 4 + 2 - field383.field1342 / 32;
				int var39 = field387 * 4 + 2 - field383.field1343 / 32;
				method120(var38, field122, var39);
			}

			VMBJKBNJ.method547(3, 97, 3, 78, 0xFFFFFF);
			field245.method173();
			ZVPDLSTW.field1505 = field483;
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void method101(int arg0, String arg1) {
		field218 = arg0;
		field80 = arg1;
		method39();

		if (field259 == null) {
			super.method101(arg0, arg1);
		} else {
			field359.method173();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field368.method435(0xFFFFFF, var4 / 2 - var5 - 26, "RuneScape is loading - please wait...", var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			VMBJKBNJ.method548(var3 / 2 - 152, 304, 0x8C1111, 34, var6);
			VMBJKBNJ.method548(var3 / 2 - 151, 302, 0, 32, var6 + 1);
			VMBJKBNJ.method547(arg0 * 3, var3 / 2 - 150, 30, var6 + 2, 0x8C1111);
			VMBJKBNJ.method547(300 - arg0 * 3, arg0 * 3 + (var3 / 2 - 150), 30, var6 + 2, 0);
			field368.method435(0xFFFFFF, var4 / 2 + 5 - var5, arg1, var3 / 2);
			field359.method174(field545, 171, 202);

			if (field98) {
				field98 = false;

				if (!field469) {
					field360.method174(field545, 0, 0);
					field361.method174(field545, 0, 637);
				}

				field357.method174(field545, 0, 128);
				field358.method174(field545, 371, 202);
				field362.method174(field545, 265, 0);
				field363.method174(field545, 265, 562);
				field364.method174(field545, 171, 128);
				field365.method174(field545, 171, 562);
			}
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void method102() {
		if (field169 && field394 == 2 && OBDFVVEL.field942 != field503) {
			method24(null, "Loading - please wait.");
			field394 = 1;
			field444 = System.currentTimeMillis();
		}

		if (field394 == 1) {
			int var1 = method103();
			if (var1 != 0 && System.currentTimeMillis() - field444 > 360000L) {
				signlink.reporterror(field432 + " glcfb " + field266 + "," + var1 + "," + field169 + "," + field159[0] + "," + field403.method305() + "," + field503 + "," + field267 + "," + field268);
				field444 = System.currentTimeMillis();
			}
		}

		if (field394 == 2 && field503 != field155) {
			field155 = field503;
			method59(field503);
		}
	}

	@ObfuscatedName("client.B(I)I")
	public final int method103() {
		for (int var1 = 0; var1 < field338.length; var1++) {
			if (field338[var1] == null && field308[var1] != -1) {
				return -1;
			}

			if (field510[var1] == null && field309[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field338.length; var3++) {
			byte[] var4 = field510[var3];
			if (var4 != null) {
				int var5 = (field307[var3] >> 8) * 64 - field262;
				int var6 = (field307[var3] & 0xFF) * 64 - field263;
				if (field114) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= OBDFVVEL.method391(var6, var4, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field252) {
			return -4;
		} else {
			field394 = 2;
			OBDFVVEL.field942 = field503;
			method79();
			field332.method328(98);
			return 0;
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.C(I)V")
	public final void method104() {
		for (int var1 = -1; var1 < field407; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field405;
			} else {
				var2 = field408[var1];
			}

			XVMRCEYW var3 = field406[var2];
			if (var3 != null) {
				method44(1, var3);
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method105() {
		short var1 = 256;

		if (field285 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field285 > 768) {
					field175[var2] = method26(1024 - field285, field176[var2], field177[var2]);
				} else if (field285 > 256) {
					field175[var2] = field177[var2];
				} else {
					field175[var2] = method26(256 - field285, field177[var2], field176[var2]);
				}
			}
		} else if (field286 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field286 > 768) {
					field175[var3] = method26(1024 - field286, field176[var3], field178[var3]);
				} else if (field286 > 256) {
					field175[var3] = field178[var3];
				} else {
					field175[var3] = method26(256 - field286, field178[var3], field176[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field175[var4] = field176[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field360.field567[var5] = field501.field590[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field511[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field466[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field175[var12];
					int var15 = field360.field567[var7];
					field360.field567[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field360.method174(field545, 0, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field361.field567[var16] = field502.field590[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field511[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field466[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field175[var23];
					int var26 = field361.field567[var18];
					field361.field567[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field361.method174(field545, 0, 637);
	}

	@ObfuscatedName("client.E(I)V")
	public final void method106() {
		if (field559 == 1) {
			if (field560 >= 539 && field560 <= 573 && field561 >= 169 && field561 < 205 && field392[0] != -1) {
				field491 = true;
				field107 = 0;
				field190 = true;
			}

			if (field560 >= 569 && field560 <= 599 && field561 >= 168 && field561 < 205 && field392[1] != -1) {
				field491 = true;
				field107 = 1;
				field190 = true;
			}

			if (field560 >= 597 && field560 <= 627 && field561 >= 168 && field561 < 205 && field392[2] != -1) {
				field491 = true;
				field107 = 2;
				field190 = true;
			}

			if (field560 >= 625 && field560 <= 669 && field561 >= 168 && field561 < 203 && field392[3] != -1) {
				field491 = true;
				field107 = 3;
				field190 = true;
			}

			if (field560 >= 666 && field560 <= 696 && field561 >= 168 && field561 < 205 && field392[4] != -1) {
				field491 = true;
				field107 = 4;
				field190 = true;
			}

			if (field560 >= 694 && field560 <= 724 && field561 >= 168 && field561 < 205 && field392[5] != -1) {
				field491 = true;
				field107 = 5;
				field190 = true;
			}

			if (field560 >= 722 && field560 <= 756 && field561 >= 169 && field561 < 205 && field392[6] != -1) {
				field491 = true;
				field107 = 6;
				field190 = true;
			}

			if (field560 >= 540 && field560 <= 574 && field561 >= 466 && field561 < 502 && field392[7] != -1) {
				field491 = true;
				field107 = 7;
				field190 = true;
			}

			if (field560 >= 572 && field560 <= 602 && field561 >= 466 && field561 < 503 && field392[8] != -1) {
				field491 = true;
				field107 = 8;
				field190 = true;
			}

			if (field560 >= 599 && field560 <= 629 && field561 >= 466 && field561 < 503 && field392[9] != -1) {
				field491 = true;
				field107 = 9;
				field190 = true;
			}

			if (field560 >= 627 && field560 <= 671 && field561 >= 467 && field561 < 502 && field392[10] != -1) {
				field491 = true;
				field107 = 10;
				field190 = true;
			}

			if (field560 >= 669 && field560 <= 699 && field561 >= 466 && field561 < 503 && field392[11] != -1) {
				field491 = true;
				field107 = 11;
				field190 = true;
			}

			if (field560 >= 696 && field560 <= 726 && field561 >= 466 && field561 < 503 && field392[12] != -1) {
				field491 = true;
				field107 = 12;
				field190 = true;
			}

			if (field560 >= 724 && field560 <= 758 && field561 >= 466 && field561 < 502 && field392[13] != -1) {
				field491 = true;
				field107 = 13;
				field190 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method107() {
		Graphics var1 = method73().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method171(1);

		if (field196) {
			field469 = false;
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

		if (field454) {
			field469 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field258) {
			field469 = false;
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

	@ObfuscatedName("client.k(Z)V")
	public final void method108() {
		if (field513 != 0) {
			int var1 = 0;
			if (field79 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field77[var2] != null) {
					int var3 = field75[var2];
					String var4 = field76[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field154 == 0 || field154 == 1 && method152(var4))) {
						int var8 = 329 - var1 * 13;
						if (field553 > 4 && field554 - 4 > var8 - 10 && field554 - 4 <= var8 + 3) {
							int var9 = field367.method437("From:  " + var4 + field77[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field553 < var9 + 4) {
								if (field217 >= 1) {
									field351[field238] = "Report abuse @whi@" + var4;
									field508[field238] = 2722;
									field238++;
								}

								field351[field238] = "Add ignore @whi@" + var4;
								field508[field238] = 2444;
								field238++;
								field351[field238] = "Add friend @whi@" + var4;
								field508[field238] = 2159;
								field238++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field154 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILXEGGEBDS;I)V")
	public final void method109(int arg0, XEGGEBDS arg1) {
		method110(arg1.field1343, arg1.field1342, arg0);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void method110(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method69(arg1, field503, arg0) - arg2;
			arg1 -= field125;
			var4 -= field126;
			arg0 -= field127;
			int var5 = JUQSYEMB.field743[field128];
			int var6 = JUQSYEMB.field744[field128];
			int var7 = JUQSYEMB.field743[field129];
			int var8 = JUQSYEMB.field744[field129];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field185 = (var9 << 9) / arg0 + ZVPDLSTW.field1499;
				field186 = (var11 << 9) / arg0 + ZVPDLSTW.field1500;
			} else {
				field185 = -1;
				field186 = -1;
			}
		} else {
			field185 = -1;
			field186 = -1;
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method111() {
		int var1 = field368.method437("Choose Option");
		for (int var2 = 0; var2 < field238; var2++) {
			int var3 = field368.method437(field351[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field238 * 15 + 21;
		if (field560 > 4 && field561 > 4 && field560 < 516 && field561 < 338) {
			int var5 = field560 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field561 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field301 = true;
			field117 = 0;
			field118 = var5;
			field119 = var6;
			field120 = var1;
			field121 = field238 * 15 + 22;
		}

		if (field560 > 553 && field561 > 205 && field560 < 743 && field561 < 466) {
			int var7 = field560 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field561 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field301 = true;
			field117 = 1;
			field118 = var7;
			field119 = var8;
			field120 = var1;
			field121 = field238 * 15 + 22;
		}

		if (field560 > 17 && field561 > 357 && field560 < 496 && field561 < 453) {
			int var9 = field560 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field561 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field301 = true;
			field117 = 2;
			field118 = var9;
			field119 = var10;
			field120 = var1;
			field121 = field238 * 15 + 22;
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method112(long arg0) {
		if (arg0 != 0L) {
			if (field451 >= 100) {
				method67("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = SISNGPYM.method432(SISNGPYM.method429(arg0));
				for (int var4 = 0; var4 < field451; var4++) {
					if (field236[var4] == arg0) {
						method67("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field231; var5++) {
					if (field331[var5] == arg0) {
						method67("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field236[field451++] = arg0;
				field491 = true;
				field332.method328(232);
				field332.method335(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(ILNQUAUMDT;I)V")
	public final void method113(int arg0, NQUAUMDT arg1) {
		field389 = 0;
		field409 = 0;
		method131(arg0, arg1);
		method63(arg1, arg0);
		method138(arg0, arg1);
		method57(arg0, arg1);

		for (int var3 = 0; var3 < field389; var3++) {
			int var4 = field390[var3];
			if (field512 != field406[var4].field1362) {
				field406[var4] = null;
			}
		}

		if (arg1.field929 != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field929 + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field407; var5++) {
			if (field406[field408[var5]] == null) {
				signlink.reporterror(field432 + " null entry in pl list - pos:" + var5 + " size:" + field407);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void method114() {
		field98 = true;
	}

	@ObfuscatedName("client.c(ILNQUAUMDT;I)V")
	public final void method115(NQUAUMDT arg0, int arg1) {
		field389 = 0;
		field409 = 0;
		method95(arg0, arg1);
		method129(arg1, arg0);
		method87(arg1, arg0);

		for (int var3 = 0; var3 < field389; var3++) {
			int var4 = field390[var3];
			if (field512 != field151[var4].field1362) {
				field151[var4].field536 = null;
				field151[var4] = null;
			}
		}

		if (arg0.field929 != arg1) {
			signlink.reporterror(field432 + " size mismatch in getnpcpos - pos:" + arg0.field929 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field152; var5++) {
			if (field151[field153[var5]] == null) {
				signlink.reporterror(field432 + " null entry in npc list - pos:" + var5 + " size:" + field152);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void method116(long arg0) {
		if (arg0 != 0L) {
			if (field231 >= 100 && field463 != 1) {
				method67("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field231 >= 200) {
				method67("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = SISNGPYM.method432(SISNGPYM.method429(arg0));
				for (int var4 = 0; var4 < field231; var4++) {
					if (field331[var4] == arg0) {
						method67("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field451; var5++) {
					if (field236[var5] == arg0) {
						method67("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field383.field1390)) {
					field420[field231] = var3;
					field331[field231] = arg0;
					field189[field231] = 0;
					field231++;
					field491 = true;
					field332.method328(41);
					field332.method335(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.d(IZ)V")
	public final void method117(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public final void method118(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field83 = 0;
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

			field83 = 0;
			label46: for (int var7 = 0; var7 < ULRRTYRQ.field1160; var7++) {
				ULRRTYRQ var8 = ULRRTYRQ.method520(var7);
				if (var8.field1166 == -1 && var8.field1182 != null) {
					String var9 = var8.field1182.toLowerCase();
					for (int var10 = 0; var10 < var4; var10++) {
						if (var9.indexOf(var3[var10]) == -1) {
							continue label46;
						}
					}

					field84[field83] = var9;
					field85[field83] = var7;
					field83++;
					if (field83 >= field84.length) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method119() {
		for (int var1 = -1; var1 < field407; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field405;
			} else {
				var2 = field408[var1];
			}

			XVMRCEYW var3 = field406[var2];
			if (var3 != null && var3.field1350 > 0) {
				var3.field1350--;
				if (var3.field1350 == 0) {
					var3.field1319 = null;
				}
			}
		}

		field289++;
		if (field289 > 1171) {
			field289 = 0;
			field332.method328(53);
			field332.method329(0);
			int var4 = field332.field929;
			field332.method330(32114);
			field332.method330(24032);

			if ((int) (Math.random() * 2.0D) == 0) {
				field332.method329(188);
			}

			field332.method330((int) (Math.random() * 65536.0D));
			field332.method330(38856);
			field332.method330(16760);

			if ((int) (Math.random() * 2.0D) == 0) {
				field332.method329(22);
			}

			field332.method330(52293);

			if ((int) (Math.random() * 2.0D) == 0) {
				field332.method330(63391);
			}

			field332.method330((int) (Math.random() * 65536.0D));
			field332.method338(field332.field929 - var4);
		}

		for (int var5 = 0; var5 < field152; var5++) {
			int var6 = field153[var5];
			DWBMCYCE var7 = field151[var6];
			if (var7 != null && var7.field1350 > 0) {
				var7.field1350--;
				if (var7.field1350 == 0) {
					var7.field1319 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILFKNRMZJV;I)V")
	public final void method120(int arg0, FKNRMZJV arg1, int arg2) {
		int var4 = field282 + field194 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = JUQSYEMB.field743[var4];
			int var7 = JUQSYEMB.field744[var4];
			var6 = var6 * 256 / (field73 + 256);
			var7 = var7 * 256 / (field73 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method191(var8 + 94 + 4 - arg1.field595 / 2, 83 - var9 - arg1.field596 / 2 - 4, field400);
			} else {
				arg1.method185(83 - var9 - arg1.field596 / 2 - 4, var8 + 94 - arg1.field595 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIILVGGOSQRK;I)V")
	public final void method121(int arg0, int arg1, VGGOSQRK arg2, int arg3) {
		if (arg2.field1279 == 0 && arg2.field1224 != null && (!arg2.field1245 || field380 == arg2.field1246 || field124 == arg2.field1246 || field220 == arg2.field1246)) {
			int var5 = VMBJKBNJ.field1288;
			int var6 = VMBJKBNJ.field1286;
			int var7 = VMBJKBNJ.field1289;
			int var8 = VMBJKBNJ.field1287;
			VMBJKBNJ.method544(arg3, arg2.field1270 + arg0, arg0, arg2.field1274 + arg3);
			int var9 = arg2.field1224.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field1248[var10] + arg0;
				int var12 = arg2.field1232[var10] + arg3 - arg1;
				VGGOSQRK var13 = VGGOSQRK.method538(arg2.field1224[var10]);
				var11 += var13.field1271;
				var12 += var13.field1227;

				if (var13.field1217 > 0) {
					method134(var13);
				}

				if (var13.field1279 == 0) {
					if (var13.field1234 > var13.field1275 - var13.field1274) {
						var13.field1234 = var13.field1275 - var13.field1274;
					}

					if (var13.field1234 < 0) {
						var13.field1234 = 0;
					}

					method121(var11, var13.field1234, var13, var12);

					if (var13.field1275 > var13.field1274) {
						method133(var13.field1275, var13.field1270 + var11, var13.field1234, var13.field1274, var12);
					}
				} else if (var13.field1279 != 1) {
					if (var13.field1279 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1274; var15++) {
							for (int var16 = 0; var16 < var13.field1270; var16++) {
								int var17 = (var13.field1269 + 32) * var16 + var11;
								int var18 = (var13.field1257 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1237[var14];
									var18 += var13.field1220[var14];
								}

								if (var13.field1210[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1210[var14] - 1;
									if (var17 > VMBJKBNJ.field1288 - 32 && var17 < VMBJKBNJ.field1289 && var18 > VMBJKBNJ.field1286 - 32 && var18 < VMBJKBNJ.field1287 || field343 != 0 && field342 == var14) {
										int var22 = 0;
										if (field170 == 1 && field171 == var14 && field172 == var13.field1246) {
											var22 = 0xFFFFFF;
										}

										FKNRMZJV var23 = ULRRTYRQ.method524(var22, var13.field1233[var14], var21);
										if (var23 != null) {
											if (field343 != 0 && field342 == var14 && field341 == var13.field1246) {
												var19 = field553 - field344;
												var20 = field554 - field345;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field81 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method187(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < VMBJKBNJ.field1286 && arg2.field1234 > 0) {
													int var24 = (VMBJKBNJ.field1286 - var18 - var20) * field106 / 3;
													if (var24 > field106 * 10) {
														var24 = field106 * 10;
													}

													if (var24 > arg2.field1234) {
														var24 = arg2.field1234;
													}

													arg2.field1234 -= var24;
													field345 += var24;
												}

												if (var18 + var20 + 32 > VMBJKBNJ.field1287 && arg2.field1234 < arg2.field1275 - arg2.field1274) {
													int var25 = (var18 + var20 + 32 - VMBJKBNJ.field1287) * field106 / 3;
													if (var25 > field106 * 10) {
														var25 = field106 * 10;
													}

													if (var25 > arg2.field1275 - arg2.field1274 - arg2.field1234) {
														var25 = arg2.field1275 - arg2.field1274 - arg2.field1234;
													}

													arg2.field1234 += var25;
													field345 -= var25;
												}
											} else if (field213 != 0 && field212 == var14 && field211 == var13.field1246) {
												var23.method187(var17, var18, 128);
											} else {
												var23.method185(var18, var17);
											}

											if (var23.field595 == 33 || var13.field1233[var14] != 1) {
												int var26 = var13.field1233[var14];
												field366.method439(0, method154(var26), var17 + var19 + 1, var18 + 10 + var20);
												field366.method439(0xFFFF00, method154(var26), var17 + var19, var18 + 9 + var20);
											}
										}
									}
								} else if (var13.field1267 != null && var14 < 20) {
									FKNRMZJV var27 = var13.field1267[var14];
									if (var27 != null) {
										var27.method185(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1279 == 3) {
						boolean var28 = false;
						if (field220 == var13.field1246 || field124 == var13.field1246 || field380 == var13.field1246) {
							var28 = true;
						}

						int var29;
						if (method86(var13)) {
							var29 = var13.field1242;
							if (var28 && var13.field1268 != 0) {
								var29 = var13.field1268;
							}
						} else {
							var29 = var13.field1263;
							if (var28 && var13.field1222 != 0) {
								var29 = var13.field1222;
							}
						}

						if (var13.field1231 == 0) {
							if (var13.field1254) {
								VMBJKBNJ.method547(var13.field1270, var11, var13.field1274, var12, var29);
							} else {
								VMBJKBNJ.method548(var11, var13.field1270, var29, var13.field1274, var12);
							}
						} else if (var13.field1254) {
							VMBJKBNJ.method546(var12, 256 - (var13.field1231 & 0xFF), var13.field1274, var11, var29, var13.field1270);
						} else {
							VMBJKBNJ.method549(256 - (var13.field1231 & 0xFF), var13.field1270, var12, var11, var29, var13.field1274);
						}
					} else if (var13.field1279 == 4) {
						TJCUOFPI var30 = var13.field1249;
						String var31 = var13.field1282;
						boolean var32 = false;
						if (field220 == var13.field1246 || field124 == var13.field1246 || field380 == var13.field1246) {
							var32 = true;
						}

						int var33;
						if (method86(var13)) {
							var33 = var13.field1242;
							if (var32 && var13.field1268 != 0) {
								var33 = var13.field1268;
							}

							if (var13.field1247.length() > 0) {
								var31 = var13.field1247;
							}
						} else {
							var33 = var13.field1263;
							if (var32 && var13.field1222 != 0) {
								var33 = var13.field1222;
							}
						}

						if (var13.field1262 == 6 && field346) {
							var31 = "Please wait...";
							var33 = var13.field1263;
						}

						if (VMBJKBNJ.field1284 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field1071 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method41(method21(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method41(method21(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method41(method21(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method41(method21(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method41(method21(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1214) {
								var30.method436(var34, var33, var41, var13.field1280, var13.field1270 / 2 + var11);
							} else {
								var30.method443(var33, var13.field1280, var34, var11, var41);
							}

							var34 += var30.field1071;
						}
					} else if (var13.field1279 == 5) {
						FKNRMZJV var42;
						if (method86(var13)) {
							var42 = var13.field1273;
						} else {
							var42 = var13.field1255;
						}

						if (var42 != null) {
							var42.method185(var12, var11);
						}
					} else if (var13.field1279 == 6) {
						int var43 = ZVPDLSTW.field1499;
						int var44 = ZVPDLSTW.field1500;
						ZVPDLSTW.field1499 = var13.field1270 / 2 + var11;
						ZVPDLSTW.field1500 = var13.field1274 / 2 + var12;
						int var45 = ZVPDLSTW.field1503[var13.field1229] * var13.field1228 >> 16;
						int var46 = ZVPDLSTW.field1504[var13.field1229] * var13.field1228 >> 16;
						boolean var47 = method86(var13);
						int var48;
						if (var47) {
							var48 = var13.field1236;
						} else {
							var48 = var13.field1235;
						}

						JUQSYEMB var49;
						if (var48 == -1) {
							var49 = var13.method536(-1, var47, -1);
						} else {
							KYGPROVJ var50 = KYGPROVJ.field828[var48];
							var49 = var13.method536(var50.field831[var13.field1243], var47, var50.field830[var13.field1243]);
						}

						if (var49 != null) {
							var49.method233(0, var13.field1230, 0, var13.field1229, 0, var45, var46);
						}

						ZVPDLSTW.field1499 = var43;
						ZVPDLSTW.field1500 = var44;
					} else {
						if (var13.field1279 == 7) {
							TJCUOFPI var51 = var13.field1249;
							int var52 = 0;
							for (int var53 = 0; var53 < var13.field1274; var53++) {
								for (int var54 = 0; var54 < var13.field1270; var54++) {
									if (var13.field1210[var52] > 0) {
										ULRRTYRQ var55 = ULRRTYRQ.method520(var13.field1210[var52] - 1);
										String var56 = String.valueOf(var55.field1182);
										if (var55.field1192 || var13.field1233[var52] != 1) {
											var56 = var56 + " x" + method77(var13.field1233[var52]);
										}

										int var57 = (var13.field1269 + 115) * var54 + var11;
										int var58 = (var13.field1257 + 12) * var53 + var12;
										if (var13.field1214) {
											var51.method436(var58, var13.field1263, var56, var13.field1280, var13.field1270 / 2 + var57);
										} else {
											var51.method443(var13.field1263, var13.field1280, var58, var57, var56);
										}
									}

									var52++;
								}
							}
						}

						if (var13.field1279 == 8 && (field306 == var13.field1246 || field222 == var13.field1246 || field447 == var13.field1246) && field462 == 100) {
							int var59 = 0;
							int var60 = 0;
							TJCUOFPI var61 = field367;
							String var62 = var13.field1282;
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

								int var65 = var61.method437(var64);
								if (var65 > var59) {
									var59 = var65;
								}

								var60 += var61.field1071 + 1;
							}

							var59 += 6;
							var60 += 7;
							int var66 = var13.field1270 + var11 - var59 - 5;
							int var67 = var13.field1274 + var12 + 5;

							if (var66 < var11 + 5) {
								var66 = var11 + 5;
							}

							if (var59 + var66 > arg2.field1270 + arg0) {
								var66 = arg2.field1270 + arg0 - var59;
							}

							if (var60 + var67 > arg2.field1274 + arg3) {
								var67 = arg2.field1274 + arg3 - var60;
							}

							VMBJKBNJ.method547(var59, var66, var60, var67, 0xFFFFA0);
							VMBJKBNJ.method548(var66, var59, 0, var60, var67);
							String var68 = var13.field1282;
							int var69 = var61.field1071 + var67 + 2;
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

								var61.method443(0, false, var69, var66 + 3, var71);
								var69 += var61.field1071 + 1;
							}
						}
					}
				}
			}

			VMBJKBNJ.method544(var6, var7, var5, var8);
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method122(boolean arg0) {
		if (field383.field1342 >> 7 == field386 && field383.field1343 >> 7 == field387) {
			field386 = 0;
		}

		int var2 = field407;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			XVMRCEYW var4;
			int var5;
			if (arg0) {
				var4 = field383;
				var5 = field405 << 14;
			} else {
				var4 = field406[field408[var3]];
				var5 = field408[var3] << 14;
			}

			if (var4 != null && var4.method166()) {
				var4.field1395 = false;
				if ((field169 && field407 > 50 || field407 > 200) && !arg0 && var4.field1360 == var4.field1323) {
					var4.field1395 = true;
				}

				int var6 = var4.field1342 >> 7;
				int var7 = var4.field1343 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field1376 == null || field512 < var4.field1379 || field512 >= var4.field1380) {
						if ((var4.field1342 & 0x7F) == 0x40 && (var4.field1343 & 0x7F) == 0x40) {
							if (field434[var6][var7] == field109) {
								continue;
							}

							field434[var6][var7] = field109;
						}

						var4.field1371 = method69(var4.field1342, field503, var4.field1343);
						field182.method469(var4, var4.field1342, var5, var4.field1371, var4.field1344, 60, var4.field1370, field503, var4.field1343);
					} else {
						var4.field1395 = false;
						var4.field1371 = method69(var4.field1342, field503, var4.field1343);
						field182.method470(var4.field1344, field503, var4.field1342, var5, var4.field1385, var4, var4.field1384, var4.field1383, 60, var4.field1371, var4.field1386, var4.field1343);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method123() {
		int var1 = field457 * 128 + 64;
		int var2 = field458 * 128 + 64;
		int var3 = method69(var1, field503, var2) - field459;

		if (field125 < var1) {
			field125 += (var1 - field125) * field461 / 1000 + field460;
			if (field125 > var1) {
				field125 = var1;
			}
		}

		if (field125 > var1) {
			field125 -= (field125 - var1) * field461 / 1000 + field460;
			if (field125 < var1) {
				field125 = var1;
			}
		}

		if (field126 < var3) {
			field126 += (var3 - field126) * field461 / 1000 + field460;
			if (field126 > var3) {
				field126 = var3;
			}
		}

		if (field126 > var3) {
			field126 -= (field126 - var3) * field461 / 1000 + field460;
			if (field126 < var3) {
				field126 = var3;
			}
		}

		if (field127 < var2) {
			field127 += (var2 - field127) * field461 / 1000 + field460;
			if (field127 > var2) {
				field127 = var2;
			}
		}

		if (field127 > var2) {
			field127 -= (field127 - var2) * field461 / 1000 + field460;
			if (field127 < var2) {
				field127 = var2;
			}
		}

		int var4 = field292 * 128 + 64;
		int var5 = field293 * 128 + 64;
		int var6 = method69(var4, field503, var5) - field294;
		int var7 = var4 - field125;
		int var8 = var6 - field126;
		int var9 = var5 - field127;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field128 < var11) {
			field128 += (var11 - field128) * field296 / 1000 + field295;
			if (field128 > var11) {
				field128 = var11;
			}
		}

		if (field128 > var11) {
			field128 -= (field128 - var11) * field296 / 1000 + field295;
			if (field128 < var11) {
				field128 = var11;
			}
		}

		int var13 = var12 - field129;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field129 += field296 * var13 / 1000 + field295;
			field129 &= 0x7FF;
		}

		if (var13 < 0) {
			field129 -= -var13 * field296 / 1000 + field295;
			field129 &= 0x7FF;
		}

		int var14 = var12 - field129;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field129 = var12;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void method124() {
		if (field559 == 1) {
			if (field560 >= 6 && field560 <= 106 && field561 >= 467 && field561 <= 499) {
				field414 = (field414 + 1) % 4;
				field515 = true;
				field514 = true;
				field332.method328(56);
				field332.method329(field414);
				field332.method329(field154);
				field332.method329(field269);
			}

			if (field560 >= 135 && field560 <= 235 && field561 >= 467 && field561 <= 499) {
				field154 = (field154 + 1) % 3;
				field515 = true;
				field514 = true;
				field332.method328(56);
				field332.method329(field414);
				field332.method329(field154);
				field332.method329(field269);
			}

			if (field560 >= 273 && field560 <= 373 && field561 >= 467 && field561 <= 499) {
				field269 = (field269 + 1) % 3;
				field515 = true;
				field514 = true;
				field332.method328(56);
				field332.method329(field414);
				field332.method329(field154);
				field332.method329(field269);
			}

			if (field560 >= 412 && field560 <= 512 && field561 >= 467 && field561 <= 499) {
				if (field319 == -1) {
					method162();
					field157 = "";
					field180 = false;
					field256 = field319 = VGGOSQRK.field1251;
					return;
				}

				method67("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method125() {
		try {
			int var1 = field383.field1342 + field207;
			int var2 = field383.field1343 + field234;
			if (field91 - var1 < -500 || field91 - var1 > 500 || field92 - var2 < -500 || field92 - var2 > 500) {
				field91 = var1;
				field92 = var2;
			}

			if (field91 != var1) {
				field91 += (var1 - field91) / 16;
			}

			if (field92 != var2) {
				field92 += (var2 - field92) / 16;
			}

			if (field563[1] == 1) {
				field283 += (-field283 - 24) / 2;
			} else if (field563[2] == 1) {
				field283 += (24 - field283) / 2;
			} else {
				field283 /= 2;
			}

			if (field563[3] == 1) {
				field284 += (12 - field284) / 2;
			} else if (field563[4] == 1) {
				field284 += (-field284 - 12) / 2;
			} else {
				field284 /= 2;
			}

			field282 = field283 / 2 + field282 & 0x7FF;
			field281 += field284 / 2;
			if (field281 < 128) {
				field281 = 128;
			}

			if (field281 > 383) {
				field281 = 383;
			}

			int var3 = field91 >> 7;
			int var4 = field92 >> 7;
			int var5 = method69(field91, field503, field92);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field503;
						if (var9 < 3 && (field464[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field402[var9][var7][var8];
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

			if (var11 > field333) {
				field333 += (var11 - field333) / 24;
			} else if (var11 < field333) {
				field333 += (var11 - field333) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field383.field1342 + "," + field383.field1343 + "," + field91 + "," + field92 + "," + field267 + "," + field268 + "," + field262 + "," + field263);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(IIILVGGOSQRK;IIII)V")
	public final void method126(int arg0, int arg1, int arg2, VGGOSQRK arg3, int arg4, int arg5, int arg6) {
		if (arg3.field1279 == 0 && arg3.field1224 != null && !arg3.field1245 && (arg0 >= arg1 && arg6 >= arg4 && arg0 <= arg3.field1270 + arg1 && arg6 <= arg3.field1274 + arg4)) {
			int var8 = arg3.field1224.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg3.field1248[var9] + arg1;
				int var11 = arg3.field1232[var9] + arg4 - arg5;
				VGGOSQRK var12 = VGGOSQRK.method538(arg3.field1224[var9]);
				var10 += var12.field1271;
				var11 += var12.field1227;
				if ((var12.field1265 >= 0 || var12.field1222 != 0) && arg0 >= var10 && arg6 >= var11 && arg0 < var12.field1270 + var10 && arg6 < var12.field1274 + var11) {
					if (var12.field1265 >= 0) {
						field397 = var12.field1265;
					} else {
						field397 = var12.field1246;
					}
				}

				if (var12.field1279 == 8 && arg0 >= var10 && arg6 >= var11 && arg0 < var12.field1270 + var10 && arg6 < var12.field1274 + var11) {
					field413 = var12.field1246;
				}

				if (var12.field1279 == 0) {
					method126(arg0, var10, arg2, var12, var11, var12.field1234, arg6);

					if (var12.field1275 > var12.field1274) {
						method144(var12, var11, arg6, var12.field1275, var12.field1270 + var10, var12.field1274, arg0, arg2);
					}
				} else {
					if (var12.field1262 == 1 && arg0 >= var10 && arg6 >= var11 && arg0 < var12.field1270 + var10 && arg6 < var12.field1274 + var11) {
						boolean var13 = false;
						if (var12.field1217 != 0) {
							var13 = method155(var12);
						}

						if (!var13) {
							field351[field238] = var12.field1218;
							field508[field238] = 455;
							field507[field238] = var12.field1246;
							field238++;
						}
					}

					if (var12.field1262 == 2 && field422 == 0 && arg0 >= var10 && arg6 >= var11 && arg0 < var12.field1270 + var10 && arg6 < var12.field1274 + var11) {
						String var14 = var12.field1277;
						if (var14.indexOf(" ") != -1) {
							var14 = var14.substring(0, var14.indexOf(" "));
						}

						field351[field238] = var14 + " @gre@" + var12.field1260;
						field508[field238] = 246;
						field507[field238] = var12.field1246;
						field238++;
					}

					if (var12.field1262 == 3 && arg0 >= var10 && arg6 >= var11 && arg0 < var12.field1270 + var10 && arg6 < var12.field1274 + var11) {
						field351[field238] = "Close";

						if (arg2 == 3) {
							field508[field238] = 405;
						} else {
							field508[field238] = 990;
						}

						field507[field238] = var12.field1246;
						field238++;
					}

					if (var12.field1262 == 4 && arg0 >= var10 && arg6 >= var11 && arg0 < var12.field1270 + var10 && arg6 < var12.field1274 + var11) {
						field351[field238] = var12.field1218;
						field508[field238] = 523;
						field507[field238] = var12.field1246;
						field238++;
					}

					if (var12.field1262 == 5 && arg0 >= var10 && arg6 >= var11 && arg0 < var12.field1270 + var10 && arg6 < var12.field1274 + var11) {
						field351[field238] = var12.field1218;
						field508[field238] = 883;
						field507[field238] = var12.field1246;
						field238++;
					}

					if (var12.field1262 == 6 && !field346 && arg0 >= var10 && arg6 >= var11 && arg0 < var12.field1270 + var10 && arg6 < var12.field1274 + var11) {
						field351[field238] = var12.field1218;
						field508[field238] = 149;
						field507[field238] = var12.field1246;
						field238++;
					}

					if (var12.field1279 == 2) {
						int var15 = 0;
						for (int var16 = 0; var16 < var12.field1274; var16++) {
							for (int var17 = 0; var17 < var12.field1270; var17++) {
								int var18 = (var12.field1269 + 32) * var17 + var10;
								int var19 = (var12.field1257 + 32) * var16 + var11;
								if (var15 < 20) {
									var18 += var12.field1237[var15];
									var19 += var12.field1220[var15];
								}

								if (arg0 >= var18 && arg6 >= var19 && arg0 < var18 + 32 && arg6 < var19 + 32) {
									field278 = var15;
									field279 = var12.field1246;

									if (var12.field1210[var15] > 0) {
										ULRRTYRQ var20 = ULRRTYRQ.method520(var12.field1210[var15] - 1);
										if (field170 == 1 && var12.field1266) {
											if (field172 != var12.field1246 || field171 != var15) {
												field351[field238] = "Use " + field174 + " with @lre@" + var20.field1182;
												field508[field238] = 835;
												field509[field238] = var20.field1158;
												field506[field238] = var15;
												field507[field238] = var12.field1246;
												field238++;
											}
										} else if (field422 != 1 || !var12.field1266) {
											if (var12.field1266) {
												for (int var21 = 4; var21 >= 3; var21--) {
													if (var20.field1179 != null && var20.field1179[var21] != null) {
														field351[field238] = var20.field1179[var21] + " @lre@" + var20.field1182;

														if (var21 == 3) {
															field508[field238] = 675;
														}

														if (var21 == 4) {
															field508[field238] = 393;
														}

														field509[field238] = var20.field1158;
														field506[field238] = var15;
														field507[field238] = var12.field1246;
														field238++;
													} else if (var21 == 4) {
														field351[field238] = "Drop @lre@" + var20.field1182;
														field508[field238] = 393;
														field509[field238] = var20.field1158;
														field506[field238] = var15;
														field507[field238] = var12.field1246;
														field238++;
													}
												}
											}

											if (var12.field1252) {
												field351[field238] = "Use @lre@" + var20.field1182;
												field508[field238] = 871;
												field509[field238] = var20.field1158;
												field506[field238] = var15;
												field507[field238] = var12.field1246;
												field238++;
											}

											if (var12.field1266 && var20.field1179 != null) {
												for (int var22 = 2; var22 >= 0; var22--) {
													if (var20.field1179[var22] != null) {
														field351[field238] = var20.field1179[var22] + " @lre@" + var20.field1182;

														if (var22 == 0) {
															field508[field238] = 504;
														}

														if (var22 == 1) {
															field508[field238] = 486;
														}

														if (var22 == 2) {
															field508[field238] = 18;
														}

														field509[field238] = var20.field1158;
														field506[field238] = var15;
														field507[field238] = var12.field1246;
														field238++;
													}
												}
											}

											if (var12.field1212 != null) {
												for (int var23 = 4; var23 >= 0; var23--) {
													if (var12.field1212[var23] != null) {
														field351[field238] = var12.field1212[var23] + " @lre@" + var20.field1182;

														if (var23 == 0) {
															field508[field238] = 236;
														}

														if (var23 == 1) {
															field508[field238] = 29;
														}

														if (var23 == 2) {
															field508[field238] = 651;
														}

														if (var23 == 3) {
															field508[field238] = 605;
														}

														if (var23 == 4) {
															field508[field238] = 490;
														}

														field509[field238] = var20.field1158;
														field506[field238] = var15;
														field507[field238] = var12.field1246;
														field238++;
													}
												}
											}

											field351[field238] = "Examine @lre@" + var20.field1182;
											field508[field238] = 1910;
											field509[field238] = var20.field1158;
											field506[field238] = var15;
											field507[field238] = var12.field1246;
											field238++;
										} else if ((field424 & 0x10) == 0x10) {
											field351[field238] = field425 + " @lre@" + var20.field1182;
											field508[field238] = 632;
											field509[field238] = var20.field1158;
											field506[field238] = var15;
											field507[field238] = var12.field1246;
											field238++;
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

	@ObfuscatedName("client.l(Z)Ljava/lang/String;")
	public final String method127() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field548 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.m(Z)V")
	public final void method128() {
		for (int var1 = 0; var1 < field416; var1++) {
			if (field339[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field183[var1] != field435 || field443[var1] != field299) {
						NQUAUMDT var3 = MDGCJDZI.method259(field183[var1], field443[var1]);
						if (System.currentTimeMillis() + var3.field929 / 22 > field455 / 22 + field230) {
							field455 = var3.field929;
							field230 = System.currentTimeMillis();

							if (method68(var3.field929, var3.field928)) {
								field435 = field183[var1];
								field299 = field443[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method52()) {
						var2 = true;
					}
				} catch (Exception var6) {
					if (signlink.reporterror) {
						field332.method328(111);
						field332.method330(field183[var1] & 0x7FFF);
					} else {
						field332.method328(111);
						field332.method330(-1);
					}
				}

				if (var2 && field339[var1] != -5) {
					field339[var1] = -5;
				} else {
					field416--;
					for (int var5 = var1; var5 < field416; var5++) {
						field183[var5] = field183[var5 + 1];
						field443[var5] = field443[var5 + 1];
						field339[var5] = field339[var5 + 1];
					}

					var1--;
				}
			} else {
				field339[var1]--;
			}
		}

		if (field78 > 0) {
			field78 -= 20;
			if (field78 < 0) {
				field78 = 0;
			}

			if (field78 == 0 && field165 && !field169) {
				field470 = field134;
				field471 = true;
				field403.method306(2, field470);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IILNQUAUMDT;)V")
	public final void method129(int arg0, NQUAUMDT arg1) {
		while (arg1.field930 + 21 < arg0 * 8) {
			int var3 = arg1.method350(14);
			if (var3 == 16383) {
				break;
			}

			if (field151[var3] == null) {
				field151[var3] = new DWBMCYCE();
			}

			DWBMCYCE var4 = field151[var3];
			field153[field152++] = var3;
			var4.field1362 = field512;
			int var5 = arg1.method350(1);
			if (var5 == 1) {
				field410[field409++] = var3;
			}

			int var6 = arg1.method350(1);
			int var7 = arg1.method350(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method350(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field536 = APPQAEOL.method10(arg1.method350(13));
			var4.field1327 = var4.field536.field8;
			var4.field1326 = var4.field536.field6;
			var4.field1333 = var4.field536.field32;
			var4.field1334 = var4.field536.field42;
			var4.field1335 = var4.field536.field35;
			var4.field1336 = var4.field536.field21;
			var4.field1360 = var4.field536.field25;
			var4.method556(field383.field1352[0] + var8, field383.field1351[0] + var7, var6 == 1);
		}

		arg1.method351();
	}

	@ObfuscatedName("client.c(IIII)Z")
	public final boolean method130(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = field182.method488(field503, arg1, arg2, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			KBTDMRWU var8 = KBTDMRWU.method249(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field804;
				var10 = var8.field763;
			} else {
				var9 = var8.field763;
				var10 = var8.field804;
			}

			int var11 = var8.field766;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method156(0, var9, arg2, var11, field383.field1352[0], var10, arg1, 0, false, 2, field383.field1351[0]);
		} else {
			method156(var7, 0, arg2, 0, field383.field1352[0], 0, arg1, var6 + 1, false, 2, field383.field1351[0]);
		}

		field497 = field560;
		field498 = field561;
		field500 = 2;
		field499 = 0;
		return true;
	}

	@ObfuscatedName("client.a(IZLNQUAUMDT;)V")
	public final void method131(int arg0, NQUAUMDT arg1) {
		arg1.method349();
		int var3 = arg1.method350(1);
		if (var3 != 0) {
			int var4 = arg1.method350(2);
			if (var4 == 0) {
				field410[field409++] = field405;
			} else if (var4 == 1) {
				int var5 = arg1.method350(3);
				field383.method554(false, var5);
				int var6 = arg1.method350(1);
				if (var6 == 1) {
					field410[field409++] = field405;
				}
			} else if (var4 == 2) {
				int var7 = arg1.method350(3);
				field383.method554(true, var7);
				int var8 = arg1.method350(3);
				field383.method554(true, var8);
				int var9 = arg1.method350(1);
				if (var9 == 1) {
					field410[field409++] = field405;
				}
			} else if (var4 == 3) {
				int var10 = arg1.method350(1);
				int var11 = arg1.method350(7);
				int var12 = arg1.method350(7);
				int var13 = arg1.method350(1);
				if (var13 == 1) {
					field410[field409++] = field405;
				}

				field503 = arg1.method350(2);
				field383.method556(var12, var11, var10 == 1);
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method132() {
		method101(20, "Starting up");

		if (signlink.sunjava) {
			field539 = 5;
		}

		if (field260) {
			field258 = true;
		} else {
			field260 = true;
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

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						field159[var3] = new AOYWVYEX(signlink.cache_dat, var3 + 1, 500000, signlink.cache_idx[var3]);
					}
				}

				try {
					method83();
					field259 = method58("title screen", "title", 1, 25, field108[1]);
					field366 = new TJCUOFPI(field259, false, "p11_full");
					field367 = new TJCUOFPI(field259, false, "p12_full");
					field368 = new TJCUOFPI(field259, false, "b12_full");
					field369 = new TJCUOFPI(field259, true, "q8_full");
					method97();
					method51();
					RSPRYUFS var4 = method58("config", "config", 2, 30, field108[2]);
					RSPRYUFS var5 = method58("interface", "interface", 3, 35, field108[3]);
					RSPRYUFS var6 = method58("2d graphics", "media", 4, 40, field108[4]);
					RSPRYUFS var7 = method58("textures", "textures", 6, 45, field108[6]);
					RSPRYUFS var8 = method58("chat system", "wordenc", 7, 50, field108[7]);
					RSPRYUFS var9 = method58("sound effects", "sounds", 8, 55, field108[8]);
					field464 = new byte[4][104][104];
					field402 = new int[4][105][105];
					field182 = new UJWODGQS(104, 104, field402, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field494[var10] = new YCMSDYIA(104, 104);
					}

					field388 = new FKNRMZJV(512, 512);
					RSPRYUFS var11 = method58("update list", "versionlist", 5, 60, field108[5]);
					method101(60, "Connecting to update server");
					field403 = new NJYVZTLI();
					field403.method316(var11, this);
					YYYUATIU.method575(field403.method315());
					JUQSYEMB.method209(field403.method325(0), field403);

					if (!field169) {
						field470 = 0;
						field471 = true;
						field403.method306(2, field470);

						while (field403.method305() > 0) {
							method75();

							try {
								Thread.sleep(100L);
							} catch (Exception var71) {
							}

							if (field403.field893 > 3) {
								method70("ondemand");
								return;
							}
						}
					}

					method101(65, "Requesting animations");
					int var12 = field403.method325(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field403.method306(1, var13);
					}

					while (field403.method305() > 0) {
						int var14 = var12 - field403.method305();
						if (var14 > 0) {
							method101(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						method75();

						try {
							Thread.sleep(100L);
						} catch (Exception var70) {
						}

						if (field403.field893 > 3) {
							method70("ondemand");
							return;
						}
					}

					method101(70, "Requesting models");
					int var15 = field403.method325(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field403.method307(var16);
						if ((var17 & 0x1) != 0) {
							field403.method306(0, var16);
						}
					}

					int var18 = field403.method305();
					while (field403.method305() > 0) {
						int var19 = var18 - field403.method305();
						if (var19 > 0) {
							method101(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						method75();

						try {
							Thread.sleep(100L);
						} catch (Exception var69) {
						}
					}

					if (field159[0] != null) {
						method101(75, "Requesting maps");
						field403.method306(3, field403.method310(0, 48, 47));
						field403.method306(3, field403.method310(1, 48, 47));
						field403.method306(3, field403.method310(0, 48, 48));
						field403.method306(3, field403.method310(1, 48, 48));
						field403.method306(3, field403.method310(0, 48, 49));
						field403.method306(3, field403.method310(1, 48, 49));
						field403.method306(3, field403.method310(0, 47, 47));
						field403.method306(3, field403.method310(1, 47, 47));
						field403.method306(3, field403.method310(0, 47, 48));
						field403.method306(3, field403.method310(1, 47, 48));
						field403.method306(3, field403.method310(0, 148, 48));
						field403.method306(3, field403.method310(1, 148, 48));
						int var20 = field403.method305();
						while (field403.method305() > 0) {
							int var21 = var20 - field403.method305();
							if (var21 > 0) {
								method101(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							method75();

							try {
								Thread.sleep(100L);
							} catch (Exception var68) {
							}
						}
					}

					int var22 = field403.method325(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field403.method307(var23);
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
							field403.method322(0, var25, var23);
						}
					}

					field403.method320(field168);

					if (!field169) {
						int var26 = field403.method325(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field403.method311(var27)) {
								field403.method322(2, (byte) 1, var27);
							}
						}
					}

					method101(80, "Unpacking media");
					field399 = new UZETOFZZ(var6, "invback", 0);
					field401 = new UZETOFZZ(var6, "chatback", 0);
					field400 = new UZETOFZZ(var6, "mapback", 0);
					field448 = new UZETOFZZ(var6, "backbase1", 0);
					field449 = new UZETOFZZ(var6, "backbase2", 0);
					field450 = new UZETOFZZ(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field270[var28] = new UZETOFZZ(var6, "sideicons", var28);
					}

					field148 = new FKNRMZJV(var6, "compass", 0);
					field382 = new FKNRMZJV(var6, "mapedge", 0);
					field382.method182();

					for (int var29 = 0; var29 < 72; var29++) {
						field428[var29] = new UZETOFZZ(var6, "mapscene", var29);
					}

					for (int var30 = 0; var30 < 63; var30++) {
						field440[var30] = new FKNRMZJV(var6, "mapfunction", var30);
					}

					for (int var31 = 0; var31 < 5; var31++) {
						field89[var31] = new FKNRMZJV(var6, "hitmarks", var31);
					}

					for (int var32 = 0; var32 < 6; var32++) {
						field486[var32] = new FKNRMZJV(var6, "headicons_pk", var32);
					}

					for (int var33 = 0; var33 < 9; var33++) {
						field116[var33] = new FKNRMZJV(var6, "headicons_prayer", var33);
					}

					for (int var34 = 0; var34 < 6; var34++) {
						field490[var34] = new FKNRMZJV(var6, "headicons_hint", var34);
					}

					field337 = new FKNRMZJV(var6, "overlay_multiway", 0);
					field122 = new FKNRMZJV(var6, "mapmarker", 0);
					field123 = new FKNRMZJV(var6, "mapmarker", 1);

					for (int var35 = 0; var35 < 8; var35++) {
						field415[var35] = new FKNRMZJV(var6, "cross", var35);
					}

					field473 = new FKNRMZJV(var6, "mapdots", 0);
					field474 = new FKNRMZJV(var6, "mapdots", 1);
					field475 = new FKNRMZJV(var6, "mapdots", 2);
					field476 = new FKNRMZJV(var6, "mapdots", 3);
					field477 = new FKNRMZJV(var6, "mapdots", 4);
					field395 = new UZETOFZZ(var6, "scrollbar", 0);
					field396 = new UZETOFZZ(var6, "scrollbar", 1);
					field197 = new UZETOFZZ(var6, "redstone1", 0);
					field198 = new UZETOFZZ(var6, "redstone2", 0);
					field199 = new UZETOFZZ(var6, "redstone3", 0);
					field200 = new UZETOFZZ(var6, "redstone1", 0);
					field200.method527();
					field201 = new UZETOFZZ(var6, "redstone2", 0);
					field201.method527();
					field160 = new UZETOFZZ(var6, "redstone1", 0);
					field160.method528();
					field161 = new UZETOFZZ(var6, "redstone2", 0);
					field161.method528();
					field162 = new UZETOFZZ(var6, "redstone3", 0);
					field162.method528();
					field163 = new UZETOFZZ(var6, "redstone1", 0);
					field163.method527();
					field163.method528();
					field164 = new UZETOFZZ(var6, "redstone2", 0);
					field164.method527();
					field164.method528();

					for (int var36 = 0; var36 < 2; var36++) {
						field320[var36] = new UZETOFZZ(var6, "mod_icons", var36);
					}

					FKNRMZJV var37 = new FKNRMZJV(var6, "backleft1", 0);
					field371 = new ERQSZFRT(var37.field592, var37.field591, method73());
					var37.method183(0, 0);
					FKNRMZJV var38 = new FKNRMZJV(var6, "backleft2", 0);
					field372 = new ERQSZFRT(var38.field592, var38.field591, method73());
					var38.method183(0, 0);
					FKNRMZJV var39 = new FKNRMZJV(var6, "backright1", 0);
					field373 = new ERQSZFRT(var39.field592, var39.field591, method73());
					var39.method183(0, 0);
					FKNRMZJV var40 = new FKNRMZJV(var6, "backright2", 0);
					field374 = new ERQSZFRT(var40.field592, var40.field591, method73());
					var40.method183(0, 0);
					FKNRMZJV var41 = new FKNRMZJV(var6, "backtop1", 0);
					field375 = new ERQSZFRT(var41.field592, var41.field591, method73());
					var41.method183(0, 0);
					FKNRMZJV var42 = new FKNRMZJV(var6, "backvmid1", 0);
					field376 = new ERQSZFRT(var42.field592, var42.field591, method73());
					var42.method183(0, 0);
					FKNRMZJV var43 = new FKNRMZJV(var6, "backvmid2", 0);
					field377 = new ERQSZFRT(var43.field592, var43.field591, method73());
					var43.method183(0, 0);
					FKNRMZJV var44 = new FKNRMZJV(var6, "backvmid3", 0);
					field378 = new ERQSZFRT(var44.field592, var44.field591, method73());
					var44.method183(0, 0);
					FKNRMZJV var45 = new FKNRMZJV(var6, "backhmid2", 0);
					field379 = new ERQSZFRT(var45.field592, var45.field591, method73());
					var45.method183(0, 0);
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 21.0D) - 10;
					int var48 = (int) (Math.random() * 21.0D) - 10;
					int var49 = (int) (Math.random() * 41.0D) - 20;
					for (int var50 = 0; var50 < 100; var50++) {
						if (field440[var50] != null) {
							field440[var50].method181(var48 + var49, var47 + var49, var46 + var49);
						}

						if (field428[var50] != null) {
							field428[var50].method529(var48 + var49, var47 + var49, var46 + var49);
						}
					}

					method101(83, "Unpacking textures");
					ZVPDLSTW.method593(var7);
					ZVPDLSTW.method597(0.8D);
					ZVPDLSTW.method592(20);
					method101(86, "Unpacking config");
					KYGPROVJ.method255(var4);
					KBTDMRWU.method251(var4);
					QFWUSXIS.method416(var4);
					ULRRTYRQ.method518(var4);
					APPQAEOL.method9(var4);
					TMMXBYBU.method450(var4);
					PHXJLMVH.method412(var4);
					FZDJIIMM.method205(var4);
					JYNIYSOU.method239(var4);
					ULRRTYRQ.field1170 = field168;

					if (!field169) {
						method101(90, "Unpacking sounds");
						byte[] var51 = var9.method427("sounds.dat", null);
						NQUAUMDT var52 = new NQUAUMDT(var51);
						MDGCJDZI.method258(var52);
					}

					method101(95, "Unpacking interfaces");
					TJCUOFPI[] var53 = new TJCUOFPI[] { field366, field367, field368, field369 };
					VGGOSQRK.method535(var53, var6, var5);
					method101(100, "Preparing game engine");

					for (int var54 = 0; var54 < 33; var54++) {
						int var55 = 999;
						int var56 = 0;
						for (int var57 = 0; var57 < 34; var57++) {
							if (field400.field1202[field400.field1204 * var54 + var57] == 0) {
								if (var55 == 999) {
									var55 = var57;
								}
							} else if (var55 != 999) {
								var56 = var57;
								break;
							}
						}

						field101[var54] = var55;
						field90[var54] = var56 - var55;
					}

					for (int var58 = 5; var58 < 156; var58++) {
						int var59 = 999;
						int var60 = 0;
						for (int var61 = 25; var61 < 172; var61++) {
							if (field400.field1202[field400.field1204 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
								if (var59 == 999) {
									var59 = var61;
								}
							} else if (var59 != 999) {
								var60 = var61;
								break;
							}
						}

						field115[var58 - 5] = var59 - 25;
						field88[var58 - 5] = var60 - var59;
					}

					ZVPDLSTW.method590(503, 765);
					field484 = ZVPDLSTW.field1505;
					ZVPDLSTW.method590(96, 479);
					field481 = ZVPDLSTW.field1505;
					ZVPDLSTW.method590(261, 190);
					field482 = ZVPDLSTW.field1505;
					ZVPDLSTW.method590(334, 512);
					field483 = ZVPDLSTW.field1505;
					int[] var62 = new int[9];
					for (int var63 = 0; var63 < 9; var63++) {
						int var64 = var63 * 32 + 128 + 15;
						int var65 = var64 * 3 + 600;
						int var66 = ZVPDLSTW.field1503[var64];
						var62[var63] = var65 * var66 >> 16;
					}

					UJWODGQS.method494(334, var62, 500, 512, 800);
					NGLCBGTC.method267(var8);
					field241 = new RQLSQIAP(this);
					method142(field241, 10);
					JSKMYDBH.field663 = this;
					KBTDMRWU.field783 = this;
					APPQAEOL.field7 = this;
				} catch (Exception var72) {
					signlink.reporterror("loaderror " + field80 + " " + field218);
					field196 = true;
				}
			} else {
				field454 = true;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field395.method530(arg4, arg1);
		field396.method530(arg3 + arg4 - 16, arg1);
		VMBJKBNJ.method547(16, arg1, arg3 - 32, arg4 + 16, field181);
		int var6 = (arg3 - 32) * arg3 / arg0;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg2 / (arg0 - arg3);
		VMBJKBNJ.method547(16, arg1, var6, arg4 + var7 + 16, field271);
		VMBJKBNJ.method552(arg1, arg4 + var7 + 16, field237, var6);
		VMBJKBNJ.method552(arg1 + 1, arg4 + 16 + var7, field237, var6);
		VMBJKBNJ.method550(field237, arg4 + var7 + 16, arg1, 16);
		VMBJKBNJ.method550(field237, arg4 + var7 + 17, arg1, 16);
		VMBJKBNJ.method552(arg1 + 15, arg4 + 16 + var7, field110, var6);
		VMBJKBNJ.method552(arg1 + 14, arg4 + 17 + var7, field110, var6 - 1);
		VMBJKBNJ.method550(field110, arg4 + var7 + var6 + 15, arg1, 16);
		VMBJKBNJ.method550(field110, arg4 + var7 + var6 + 14, arg1 + 1, 15);
	}

	@ObfuscatedName("client.a(ILVGGOSQRK;)V")
	public final void method134(VGGOSQRK arg0) {
		int var2 = arg0.field1217;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field232 == 0) {
				arg0.field1282 = "Loading friend list";
				arg0.field1262 = 0;
			} else if (var2 == 1 && field232 == 1) {
				arg0.field1282 = "Connecting to friendserver";
				arg0.field1262 = 0;
			} else if (var2 == 2 && field232 != 2) {
				arg0.field1282 = "Please wait...";
				arg0.field1262 = 0;
			} else {
				int var3 = field231;
				if (field232 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1282 = "";
					arg0.field1262 = 0;
				} else {
					arg0.field1282 = field420[var2];
					arg0.field1262 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field231;
			if (field232 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1282 = "";
				arg0.field1262 = 0;
			} else {
				if (field189[var2] == 0) {
					arg0.field1282 = "@red@Offline";
				} else if (field189[var2] < 200) {
					if (field189[var2] == field166) {
						arg0.field1282 = "@gre@World" + (field189[var2] - 9);
					} else {
						arg0.field1282 = "@yel@World" + (field189[var2] - 9);
					}
				} else if (field189[var2] == field166) {
					arg0.field1282 = "@gre@Classic" + (field189[var2] - 219);
				} else {
					arg0.field1282 = "@yel@Classic" + (field189[var2] - 219);
				}

				arg0.field1262 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field231;
			if (field232 != 2) {
				var5 = 0;
			}

			arg0.field1275 = var5 * 15 + 20;
			if (arg0.field1275 <= arg0.field1274) {
				arg0.field1275 = arg0.field1274 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field232 == 0) {
				arg0.field1282 = "Loading ignore list";
				arg0.field1262 = 0;
			} else if (var2 == 1 && field232 == 0) {
				arg0.field1282 = "Please wait...";
				arg0.field1262 = 0;
			} else {
				int var6 = field451;
				if (field232 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1282 = "";
					arg0.field1262 = 0;
				} else {
					arg0.field1282 = SISNGPYM.method432(SISNGPYM.method429(field236[var2]));
					arg0.field1262 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1275 = field451 * 15 + 20;
			if (arg0.field1275 <= arg0.field1274) {
				arg0.field1275 = arg0.field1274 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1229 = 150;
			arg0.field1230 = (int) (Math.sin(field512 / 40.0D) * 256.0D) & 0x7FF;

			if (field141) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field142[var7];
					if (var8 >= 0 && !TMMXBYBU.field1075[var8].method452()) {
						return;
					}
				}

				field141 = false;
				JUQSYEMB[] var9 = new JUQSYEMB[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field142[var11];
					if (var12 >= 0) {
						var9[var10++] = TMMXBYBU.field1075[var12].method453();
					}
				}

				JUQSYEMB var13 = new JUQSYEMB(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field340[var14] != 0) {
						var13.method226(field147[var14][0], field147[var14][field340[var14]]);

						if (var14 == 1) {
							var13.method226(field419[0], field419[field340[var14]]);
						}
					}
				}

				var13.method219();
				var13.method220(KYGPROVJ.field828[field383.field1360].field830[0]);
				var13.method229(64, 850, -30, -50, -30, true);
				arg0.field1215 = 5;
				arg0.field1216 = 0;
				VGGOSQRK.method533(5, var13, 0);
			}
		} else if (var2 == 324) {
			if (field192 == null) {
				field192 = arg0.field1255;
				field193 = arg0.field1273;
			}

			if (field104) {
				arg0.field1255 = field193;
			} else {
				arg0.field1255 = field192;
			}
		} else if (var2 == 325) {
			if (field192 == null) {
				field192 = arg0.field1255;
				field193 = arg0.field1273;
			}

			if (field104) {
				arg0.field1255 = field192;
			} else {
				arg0.field1255 = field193;
			}
		} else if (var2 == 600) {
			arg0.field1282 = field157;
			if (field512 % 20 < 10) {
				arg0.field1282 = arg0.field1282 + "|";
			} else {
				arg0.field1282 = arg0.field1282 + " ";
			}
		} else if (var2 == 620) {
			if (field217 < 1) {
				arg0.field1282 = "";
			} else if (field180) {
				arg0.field1263 = 0xFF0000;
				arg0.field1282 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1263 = 0xFFFFFF;
				arg0.field1282 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 660) {
			int var15 = field335 - field239;
			String var16;
			if (var15 <= 0) {
				var16 = "earlier today";
			} else if (var15 == 1) {
				var16 = "yesterday";
			} else {
				var16 = var15 + " days ago";
			}

			arg0.field1282 = "You last logged in @red@" + var16 + "@bla@ from: @red@" + signlink.dns;
		} else if (var2 == 661) {
			if (field280 == 0) {
				arg0.field1282 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
			} else if (field280 <= field335) {
				arg0.field1282 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method135(field280);
			} else {
				int var17 = field335 + 14 - field280;
				String var18;
				if (var17 <= 0) {
					var18 = "Earlier today";
				} else if (var17 == 1) {
					var18 = "Yesterday";
				} else {
					var18 = var17 + " days ago";
				}

				arg0.field1282 = var18 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method135(field280) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
			}
		} else if (var2 == 662) {
			String var19;
			if (field421 == 0) {
				var19 = "@yel@0 unread messages";
			} else if (field421 == 1) {
				var19 = "@gre@1 unread message";
			} else {
				var19 = "@gre@" + field421 + " unread messages";
			}

			arg0.field1282 = "You have " + var19 + "\\nin your message centre.";
		} else if (var2 == 663) {
			if (field233 > 0 && field233 <= field335 + 10) {
				arg0.field1282 = "Last password change:\\n@gre@" + method135(field233);
			} else {
				arg0.field1282 = "Last password change:\\n@gre@Never changed";
			}
		} else if (var2 == 665) {
			if (field489 > 2 && !field168) {
				arg0.field1282 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
			} else if (field489 > 2) {
				arg0.field1282 = "\\n\\nYou have @gre@" + field489 + "@yel@ days of\\nmember credit remaining.";
			} else if (field489 > 0) {
				arg0.field1282 = "You have @gre@" + field489 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
			} else {
				arg0.field1282 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
			}
		} else if (var2 == 667) {
			if (field489 > 2 && !field168) {
				arg0.field1282 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
			} else if (field489 > 0) {
				arg0.field1282 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
			} else {
				arg0.field1282 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
			}
		} else if (var2 == 668) {
			if (field280 > field335) {
				arg0.field1282 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
			} else {
				arg0.field1282 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
			}
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method135(int arg0) {
		if (arg0 > field335 + 10) {
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

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 358);

			if (arg0.length == 5) {
				field166 = Integer.parseInt(arg0[0]);
				field167 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method37();
				} else if (arg0[2].equals("highmem")) {
					method56();
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
				var1.method168(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method136() {
		field448 = null;
		field449 = null;
		field450 = null;
		field360 = null;
		field361 = null;
		field357 = null;
		field358 = null;
		field359 = null;
		field151 = null;
		field153 = null;

		try {
			if (field427 != null) {
				field427.method420();
			}
		} catch (Exception var1) {
		}

		field427 = null;
		field428 = null;
		field440 = null;
		method65();
		field362 = null;
		field363 = null;
		field364 = null;
		field365 = null;
		field473 = null;
		field474 = null;
		field475 = null;
		field476 = null;
		field477 = null;
		field388 = null;
		field441 = null;
		field197 = null;
		field198 = null;
		field199 = null;
		field200 = null;
		field201 = null;
		field434 = null;
		field270 = null;
		field160 = null;
		field161 = null;
		field162 = null;
		field163 = null;
		field164 = null;
		field402 = null;
		field464 = null;
		field182 = null;
		field494 = null;
		field130 = null;
		field131 = null;
		field132 = null;

		if (field241 != null) {
			field241.field1035 = false;
		}

		field241 = null;
		field337 = null;
		field332 = null;
		field102 = null;
		field480 = null;
		field406 = null;
		field408 = null;
		field410 = null;
		field411 = null;
		field390 = null;
		field226 = null;
		field495 = null;
		field224 = null;
		field228 = null;
		field249 = null;
		field250 = null;
		field371 = null;
		field372 = null;
		field373 = null;
		field374 = null;

		if (field403 != null) {
			field403.method314();
		}

		field403 = null;
		field317 = null;
		field318 = null;
		field334 = null;
		field420 = null;
		field331 = null;
		field189 = null;
		field150 = null;
		field348 = null;
		field100 = null;
		field375 = null;
		field376 = null;
		field377 = null;
		field378 = null;
		field379 = null;
		field243 = null;
		field244 = null;
		field245 = null;
		field246 = null;
		field148 = null;
		field89 = null;
		field486 = null;
		field116 = null;
		field490 = null;
		field415 = null;
		field506 = null;
		field507 = null;
		field508 = null;
		field509 = null;
		field351 = null;
		field307 = null;
		field338 = null;
		field510 = null;
		field308 = null;
		field309 = null;
		field399 = null;
		field400 = null;
		field401 = null;
		field430 = null;
		method78();
		KBTDMRWU.method248();
		APPQAEOL.method8();
		ULRRTYRQ.method523();
		VGGOSQRK.method539();
		QFWUSXIS.field998 = null;
		TMMXBYBU.field1075 = null;
		FRJCAKFE.field622 = null;
		KYGPROVJ.field828 = null;
		PHXJLMVH.field975 = null;
		PHXJLMVH.field987 = null;
		FZDJIIMM.field635 = null;
		field546 = null;
		XVMRCEYW.field1382 = null;
		ZVPDLSTW.method588();
		UJWODGQS.method457();
		JUQSYEMB.method208();
		YYYUATIU.method577();
		System.gc();
	}

	@ObfuscatedName("client.d(I)V")
	public final void method137() {
		if (field258 || field196 || field454) {
			method107();
		} else {
			field158++;

			if (field313) {
				method50();
			} else {
				method40(false);
			}

			field315 = 0;
		}
	}

	@ObfuscatedName("client.b(IILNQUAUMDT;)V")
	public final void method138(int arg0, NQUAUMDT arg1) {
		while (arg1.field930 + 10 < arg0 * 8) {
			int var3 = arg1.method350(11);
			if (var3 == 2047) {
				break;
			}

			if (field406[var3] == null) {
				field406[var3] = new XVMRCEYW();
				if (field411[var3] != null) {
					field406[var3].method558(field411[var3]);
				}
			}

			field408[field407++] = var3;
			XVMRCEYW var4 = field406[var3];
			var4.field1362 = field512;
			int var5 = arg1.method350(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.method350(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method350(1);
			int var8 = arg1.method350(1);
			if (var8 == 1) {
				field410[field409++] = var3;
			}

			var4.method556(field383.field1352[0] + var5, field383.field1351[0] + var6, var7 == 1);
		}

		arg1.method351();
	}

	@ObfuscatedName("client.a(LCPAFTRRP;I)V")
	public final void method139(CPAFTRRP arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field517 == 0) {
			var2 = field182.method484(arg0.field516, arg0.field518, arg0.field519);
		}

		if (arg0.field517 == 1) {
			var2 = field182.method485(arg0.field518, arg0.field516, arg0.field519);
		}

		if (arg0.field517 == 2) {
			var2 = field182.method486(arg0.field516, arg0.field518, arg0.field519);
		}

		if (arg0.field517 == 3) {
			var2 = field182.method487(arg0.field516, arg0.field518, arg0.field519);
		}

		if (var2 != 0) {
			int var6 = field182.method488(arg0.field516, arg0.field518, arg0.field519, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field525 = var3;
		arg0.field527 = var4;
		arg0.field526 = var5;
	}

	@ObfuscatedName("client.K(I)V")
	public final void method140() {
		if (field113 == 2) {
			method110((field273 - field263 << 7) + field276, (field272 - field262 << 7) + field275, field274 * 2);

			if (field185 > -1 && field512 % 20 < 10) {
				field490[0].method185(field186 - 28, field185 - 12);
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method141() {
		method163();

		if (field500 == 1) {
			field415[field499 / 100].method185(field498 - 8 - 4, field497 - 8 - 4);
			field412++;
			if (field412 > 1225) {
				field412 = 0;
				field332.method328(92);
				field332.method329(0);
				int var1 = field332.field929;
				field332.method329((int) (Math.random() * 256.0D));
				field332.method329(186);

				if ((int) (Math.random() * 2.0D) == 0) {
					field332.method329(216);
				}

				field332.method329(210);
				field332.method329(2);
				field332.method330((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					field332.method329(230);
				}

				field332.method330((int) (Math.random() * 65536.0D));
				field332.method330(52559);
				field332.method330(29994);
				field332.method338(field332.field929 - var1);
			}
		}

		if (field500 == 2) {
			field415[field499 / 100 + 4].method185(field498 - 8 - 4, field497 - 8 - 4);
		}

		if (field336 != -1) {
			method88(field336, field106);
			method121(0, 0, VGGOSQRK.method538(field336), 0);
		}

		if (field319 != -1) {
			method88(field319, field106);
			method121(0, 0, VGGOSQRK.method538(field319), 0);
		}

		method146();

		if (!field301) {
			method55();
			method28();
		} else if (field117 == 0) {
			method158();
		}

		if (field417 == 1) {
			field337.method185(296, 472);
		}

		if (field445) {
			short var2 = 507;
			int var3 = 20;
			int var4 = 0xFFFF00;
			if (field541 < 30 && field169) {
				var4 = 0xFF0000;
			}

			if (field541 < 20 && !field169) {
				var4 = 0xFF0000;
			}

			field367.method434("Fps:" + field541, var3, var2, var4);
			var3 += 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 0xFFFF00;

			if (var6 > 0x2000000 && field169) {
				int var8 = 0xFF0000;
			}

			if (var6 > 0x4000000 && !field169) {
				int var9 = 0xFF0000;
			}

			field367.method434("Mem:" + var6 + "k", var3, var2, 0xFFFF00);
			var3 += 15;
		}

		if (field79 != 0) {
			int var10 = field79 / 50;
			int var11 = var10 / 60;
			var10 %= 60;
			if (var10 < 10) {
				field367.method439(0xFFFF00, "System update in: " + var11 + ":0" + var10, 4, 329);
			} else {
				field367.method439(0xFFFF00, "System update in: " + var11 + ":" + var10, 4, 329);
			}

			field398++;
			if (field398 > 85) {
				field398 = 0;
				field332.method328(246);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method142(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method142(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method143() {
		KBTDMRWU.field801.method511();
		KBTDMRWU.field787.method511();
		APPQAEOL.field11.method511();
		ULRRTYRQ.field1187.method511();
		ULRRTYRQ.field1177.method511();
		XVMRCEYW.field1382.method511();
		PHXJLMVH.field987.method511();
	}

	@ObfuscatedName("client.a(ILVGGOSQRK;IIIIIII)V")
	public final void method144(VGGOSQRK arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field487) {
			field287 = 32;
		} else {
			field287 = 0;
		}

		field487 = false;
		if (arg6 >= arg4 && arg6 < arg4 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
			arg0.field1234 -= field315 * 4;

			if (arg7 == 1) {
				field491 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field514 = true;
			}
		} else if (arg6 >= arg4 && arg6 < arg4 + 16 && arg2 >= arg1 + arg5 - 16 && arg2 < arg1 + arg5) {
			arg0.field1234 += field315 * 4;

			if (arg7 == 1) {
				field491 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field514 = true;
			}
		} else if (arg6 >= arg4 - field287 && arg6 < arg4 + field287 + 16 && arg2 >= arg1 + 16 && arg2 < arg1 + arg5 - 16 && field315 > 0) {
			int var9 = (arg5 - 32) * arg5 / arg3;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg1 - var9 / 2 - 16;
			int var11 = arg5 - var9 - 32;
			arg0.field1234 = (arg3 - arg5) * var10 / var11;

			if (arg7 == 1) {
				field491 = true;
			}

			if (arg7 == 2 || arg7 == 3) {
				field514 = true;
			}

			field487 = true;
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method145() {
		for (YFDAHBXI var1 = (YFDAHBXI) field226.method200(); var1 != null; var1 = (YFDAHBXI) field226.method202()) {
			if (field503 != var1.field1469 || field512 > var1.field1468) {
				var1.method326();
			} else if (field512 >= var1.field1467) {
				if (var1.field1462 > 0) {
					DWBMCYCE var2 = field151[var1.field1462 - 1];
					if (var2 != null && var2.field1342 >= 0 && var2.field1342 < 13312 && var2.field1343 >= 0 && var2.field1343 < 13312) {
						var1.method574(method69(var2.field1342, var1.field1469, var2.field1343) - var1.field1459, field512, var2.field1342, var2.field1343);
					}
				}

				if (var1.field1462 < 0) {
					int var3 = -var1.field1462 - 1;
					XVMRCEYW var4;
					if (field479 == var3) {
						var4 = field383;
					} else {
						var4 = field406[var3];
					}

					if (var4 != null && var4.field1342 >= 0 && var4.field1342 < 13312 && var4.field1343 >= 0 && var4.field1343 < 13312) {
						var1.method574(method69(var4.field1342, var1.field1469, var4.field1343) - var1.field1459, field512, var4.field1342, var4.field1343);
					}
				}

				var1.method573(field106);
				field182.method469(var1, (int) var1.field1464, -1, (int) var1.field1466, var1.field1454, 60, false, field503, (int) var1.field1465);
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void method146() {
		field493 = 0;
		int var1 = (field383.field1342 >> 7) + field262;
		int var2 = (field383.field1343 >> 7) + field263;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field493 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field493 = 1;
		}

		if (field493 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field493 = 0;
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void method147() {
		field109++;
		method122(true);
		method161(true);
		method122(false);
		method161(false);
		method145();
		method84();

		if (!field465) {
			int var1 = field281;
			if (field333 / 256 > var1) {
				var1 = field333 / 256;
			}

			if (field456[4] && field221[4] + 128 > var1) {
				var1 = field221[4] + 128;
			}

			int var2 = field297 + field282 & 0x7FF;
			method96(var1, field91, var1 * 3 + 600, method69(field383.field1342, field503, field383.field1343) - 50, field92, var2);
		}

		int var3;
		if (field465) {
			var3 = method90();
		} else {
			var3 = method89();
		}

		int var4 = field125;
		int var5 = field126;
		int var6 = field127;
		int var7 = field128;
		int var8 = field129;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field456[var9]) {
				int var10 = (int) (Math.random() * (field488[var9] * 2 + 1) + Math.sin(field370[var9] / 100.0D * field485[var9]) * field221[var9] - field488[var9]);
				if (var9 == 0) {
					field125 += var10;
				}

				if (var9 == 1) {
					field126 += var10;
				}

				if (var9 == 2) {
					field127 += var10;
				}

				if (var9 == 3) {
					field129 = field129 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field128 += var10;
					if (field128 < 128) {
						field128 = 128;
					}

					if (field128 > 383) {
						field128 = 383;
					}
				}
			}
		}

		int var11 = ZVPDLSTW.field1514;
		JUQSYEMB.field738 = true;
		JUQSYEMB.field741 = 0;
		JUQSYEMB.field739 = field553 - 4;
		JUQSYEMB.field740 = field554 - 4;
		VMBJKBNJ.method545();
		field182.method497(field127, field129, var3, field125, field128, field126);
		field182.method472();
		method93();
		method140();
		method25(var11);
		method141();
		field245.method174(field545, 4, 4);
		field125 = var4;
		field126 = var5;
		field127 = var6;
		field128 = var7;
		field129 = var8;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method148(String arg0) throws IOException {
		if (field381) {
			if (field143 != null) {
				try {
					field143.close();
				} catch (Exception var4) {
				}

				field143 = null;
			}

			field143 = method22(43595);
			field143.setSoTimeout(10000);
			InputStream var2 = field143.getInputStream();
			OutputStream var3 = field143.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.a(IIIIIZII)V")
	public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg0 >= 1 && arg4 <= 102 && arg0 <= 102) {
			if (field169 && field503 != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field182.method484(arg6, arg4, arg0);
			}

			if (arg3 == 1) {
				var8 = field182.method485(arg4, arg6, arg0);
			}

			if (arg3 == 2) {
				var8 = field182.method486(arg6, arg4, arg0);
			}

			if (arg3 == 3) {
				var8 = field182.method487(arg6, arg4, arg0);
			}

			if (var8 != 0) {
				int var12 = field182.method488(arg6, arg4, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field182.method475(arg6, arg4, arg0);
					KBTDMRWU var16 = KBTDMRWU.method249(var13);
					if (var16.field793) {
						field494[arg6].method566(var16.field774, var15, arg0, var14, arg4);
					}
				}

				if (arg3 == 1) {
					field182.method476(arg6, arg0, arg4);
				}

				if (arg3 == 2) {
					field182.method477(arg6, arg4, arg0);
					KBTDMRWU var17 = KBTDMRWU.method249(var13);
					if (var17.field804 + arg4 > 103 || var17.field804 + arg0 > 103 || var17.field763 + arg4 > 103 || var17.field763 + arg0 > 103) {
						return;
					}

					if (var17.field793) {
						field494[arg6].method567(var17.field804, var17.field774, arg4, var15, var17.field763, arg0);
					}
				}

				if (arg3 == 3) {
					field182.method478(arg4, arg6, arg0);
					KBTDMRWU var18 = KBTDMRWU.method249(var13);
					if (var18.field793 && var18.field771) {
						field494[arg6].method569(arg0, arg4);
					}
				}
			}

			if (arg5 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (field464[1][arg4][arg0] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				OBDFVVEL.method382(arg5, arg0, arg6, field182, field494[arg6], arg1, field402, arg4, var19, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.p(Z)V")
	public final void method150() {
		field156++;
		if (field156 > 168) {
			field156 = 0;
			field332.method328(23);
			field332.method333(0);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = method172();
					if (var1 == -1) {
						return;
					}

					if (field319 != -1 && field319 == field256) {
						break;
					}

					if (field87) {
						if (var1 >= 32 && var1 <= 122 && field202.length() < 80) {
							field202 = field202 + (char) var1;
							field514 = true;
						}

						if (var1 == 8 && field202.length() > 0) {
							field202 = field202.substring(0, field202.length() - 1);
							field514 = true;
						}

						if (var1 == 13 || var1 == 10) {
							field87 = false;
							field514 = true;

							if (field429 == 1) {
								long var2 = SISNGPYM.method428(field202);
								method116(var2);
							}

							if (field429 == 2 && field231 > 0) {
								long var4 = SISNGPYM.method428(field202);
								method33(var4);
							}

							if (field429 == 3 && field202.length() > 0) {
								field332.method328(58);
								field332.method329(0);
								int var6 = field332.field929;
								field332.method335(field391);
								ZIBXIXQC.method581(field202, field332);
								field332.method338(field332.field929 - var6);
								field202 = ZIBXIXQC.method582(field202);
								field202 = NGLCBGTC.method277(field202);
								method67(SISNGPYM.method432(SISNGPYM.method429(field391)), 6, field202);

								if (field154 == 2) {
									field154 = 1;
									field515 = true;
									field332.method328(56);
									field332.method329(field414);
									field332.method329(field154);
									field332.method329(field269);
								}
							}

							if (field429 == 4 && field451 < 100) {
								long var7 = SISNGPYM.method428(field202);
								method112(var7);
							}

							if (field429 == 5 && field451 > 0) {
								long var9 = SISNGPYM.method428(field202);
								method99(var9);
							}
						}
					} else if (field225 == 1) {
						if (var1 >= 48 && var1 <= 57 && field478.length() < 10) {
							field478 = field478 + (char) var1;
							field514 = true;
						}

						if (var1 == 8 && field478.length() > 0) {
							field478 = field478.substring(0, field478.length() - 1);
							field514 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field478.length() > 0) {
								int var11 = 0;
								try {
									var11 = Integer.parseInt(field478);
								} catch (Exception var21) {
								}

								field332.method328(5);
								field332.method333(var11);
							}

							field225 = 0;
							field514 = true;
						}
					} else if (field225 == 2) {
						if (var1 >= 32 && var1 <= 122 && field478.length() < 12) {
							field478 = field478 + (char) var1;
							field514 = true;
						}

						if (var1 == 8 && field478.length() > 0) {
							field478 = field478.substring(0, field478.length() - 1);
							field514 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (field478.length() > 0) {
								field332.method328(192);
								field332.method335(SISNGPYM.method428(field478));
							}

							field225 = 0;
							field514 = true;
						}
					} else if (field225 == 3) {
						if (var1 >= 32 && var1 <= 122 && field478.length() < 40) {
							field478 = field478 + (char) var1;
							field514 = true;
						}

						if (var1 == 8 && field478.length() > 0) {
							field478 = field478.substring(0, field478.length() - 1);
							field514 = true;
						}
					} else if (field305 == -1 && field227 == -1) {
						if (var1 >= 32 && var1 <= 122 && field446.length() < 80) {
							field446 = field446 + (char) var1;
							field514 = true;
						}

						if (var1 == 8 && field446.length() > 0) {
							field446 = field446.substring(0, field446.length() - 1);
							field514 = true;
						}

						if ((var1 == 13 || var1 == 10) && field446.length() > 0) {
							if (field217 == 2) {
								if (field446.equals("::clientdrop")) {
									method19();
								}

								if (field446.equals("::lag")) {
									method72();
								}

								if (field446.equals("::prefetchmusic")) {
									for (int var12 = 0; var12 < field403.method325(2); var12++) {
										field403.method322(2, (byte) 1, var12);
									}
								}

								if (field446.equals("::fpson")) {
									field445 = true;
								}

								if (field446.equals("::fpsoff")) {
									field445 = false;
								}

								if (field446.equals("::noclip")) {
									for (int var13 = 0; var13 < 4; var13++) {
										for (int var14 = 1; var14 < 103; var14++) {
											for (int var15 = 1; var15 < 103; var15++) {
												field494[var13].field1449[var14][var15] = 0;
											}
										}
									}
								}
							}

							if (field446.startsWith("::")) {
								field332.method328(15);
								field332.method329(field446.length() - 1);
								field332.method336(field446.substring(2));
							} else {
								String var16 = field446.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("yellow:")) {
									var17 = 0;
									field446 = field446.substring(7);
								} else if (var16.startsWith("red:")) {
									var17 = 1;
									field446 = field446.substring(4);
								} else if (var16.startsWith("green:")) {
									var17 = 2;
									field446 = field446.substring(6);
								} else if (var16.startsWith("cyan:")) {
									var17 = 3;
									field446 = field446.substring(5);
								} else if (var16.startsWith("purple:")) {
									var17 = 4;
									field446 = field446.substring(7);
								} else if (var16.startsWith("white:")) {
									var17 = 5;
									field446 = field446.substring(6);
								} else if (var16.startsWith("flash1:")) {
									var17 = 6;
									field446 = field446.substring(7);
								} else if (var16.startsWith("flash2:")) {
									var17 = 7;
									field446 = field446.substring(7);
								} else if (var16.startsWith("flash3:")) {
									var17 = 8;
									field446 = field446.substring(7);
								} else if (var16.startsWith("glow1:")) {
									var17 = 9;
									field446 = field446.substring(6);
								} else if (var16.startsWith("glow2:")) {
									var17 = 10;
									field446 = field446.substring(6);
								} else if (var16.startsWith("glow3:")) {
									var17 = 11;
									field446 = field446.substring(6);
								}

								String var18 = field446.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("wave:")) {
									var19 = 1;
									field446 = field446.substring(5);
								} else if (var18.startsWith("wave2:")) {
									var19 = 2;
									field446 = field446.substring(6);
								} else if (var18.startsWith("shake:")) {
									var19 = 3;
									field446 = field446.substring(6);
								} else if (var18.startsWith("scroll:")) {
									var19 = 4;
									field446 = field446.substring(7);
								} else if (var18.startsWith("slide:")) {
									var19 = 5;
									field446 = field446.substring(6);
								}

								field332.method328(47);
								field332.method329(0);
								int var20 = field332.field929;
								field332.method355(var19);
								field332.method356(var17);
								field150.field929 = 0;
								ZIBXIXQC.method581(field446, field150);
								field332.method376(field150.field929, field150.field928, 0);
								field332.method338(field332.field929 - var20);
								field446 = ZIBXIXQC.method582(field446);
								field446 = NGLCBGTC.method277(field446);
								field383.field1319 = field446;
								field383.field1337 = var17;
								field383.field1339 = var19;
								field383.field1350 = 150;

								if (field217 == 2) {
									method67("@cr2@" + field383.field1390, 2, field383.field1319);
								} else if (field217 == 1) {
									method67("@cr1@" + field383.field1390, 2, field383.field1319);
								} else {
									method67(field383.field1390, 2, field383.field1319);
								}

								if (field414 == 2) {
									field414 = 3;
									field515 = true;
									field332.method328(56);
									field332.method329(field414);
									field332.method329(field154);
									field332.method329(field269);
								}
							}

							field446 = "";
							field514 = true;
						}
					}
				}

				if (var1 == 8 && field157.length() > 0) {
					field157 = field157.substring(0, field157.length() - 1);
				}
			} while ((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (field157.length() < 12) {
				field157 = field157 + (char) var1;
			}
		}
	}

	@ObfuscatedName("client.a(ILNQUAUMDT;LXVMRCEYW;II)V")
	public final void method151(int arg0, NQUAUMDT arg1, XVMRCEYW arg2, int arg3) {
		if ((arg3 & 0x4) != 0) {
			int var5 = arg1.method359();
			byte[] var6 = new byte[var5];
			NQUAUMDT var7 = new NQUAUMDT(var6);
			arg1.method377(var6, var5, 0);
			field411[arg0] = var7;
			arg2.method558(var7);
		}

		if ((arg3 & 0x20) != 0) {
			arg2.field1316 = arg1.method368();
			arg2.field1317 = arg1.method367();
		}

		if ((arg3 & 0x200) != 0) {
			int var8 = arg1.method359();
			int var9 = arg1.method359();
			arg2.method555(field512, var9, var8);
			arg2.field1320 = field512 + 300;
			arg2.field1321 = arg1.method357();
			arg2.field1322 = arg1.method359();
		}

		if ((arg3 & 0x80) != 0) {
			arg2.field1319 = arg1.method346();
			if (arg2.field1319.charAt(0) == '~') {
				arg2.field1319 = arg2.field1319.substring(1);
				method67(arg2.field1390, 2, arg2.field1319);
			} else if (field383 == arg2) {
				method67(arg2.field1390, 2, arg2.field1319);
			}

			arg2.field1337 = 0;
			arg2.field1339 = 0;
			arg2.field1350 = 150;
		}

		if ((arg3 & 0x2) != 0) {
			int var10 = arg1.method367();
			if (var10 == 0xFFFF) {
				var10 = -1;
			}

			int var11 = arg1.method358();
			if (arg2.field1345 == var10 && var10 != -1) {
				int var12 = KYGPROVJ.field828[var10].field842;
				if (var12 == 1) {
					arg2.field1346 = 0;
					arg2.field1347 = 0;
					arg2.field1348 = var11;
					arg2.field1349 = 0;
				}

				if (var12 == 2) {
					arg2.field1349 = 0;
				}
			} else if (var10 == -1 || arg2.field1345 == -1 || KYGPROVJ.field828[var10].field836 >= KYGPROVJ.field828[arg2.field1345].field836) {
				arg2.field1345 = var10;
				arg2.field1346 = 0;
				arg2.field1347 = 0;
				arg2.field1348 = var11;
				arg2.field1349 = 0;
				arg2.field1353 = arg2.field1318;
			}
		}

		if ((arg3 & 0x1) != 0) {
			int var13 = arg1.method339();
			int var14 = arg1.method359();
			arg2.method555(field512, var14, var13);
			arg2.field1320 = field512 + 300;
			arg2.field1321 = arg1.method358();
			arg2.field1322 = arg1.method359();
		}

		if ((arg3 & 0x400) != 0) {
			arg2.field1328 = arg1.method366();
			int var15 = arg1.method374();
			arg2.field1332 = var15 >> 16;
			arg2.field1331 = (var15 & 0xFFFF) + field512;
			arg2.field1329 = 0;
			arg2.field1330 = 0;

			if (arg2.field1331 > field512) {
				arg2.field1329 = -1;
			}

			if (arg2.field1328 == 0xFFFF) {
				arg2.field1328 = -1;
			}
		}

		if ((arg3 & 0x40) != 0) {
			arg2.field1359 = arg1.method341();
			if (arg2.field1359 == 0xFFFF) {
				arg2.field1359 = -1;
			}
		}

		if ((arg3 & 0x8) != 0) {
			int var16 = arg1.method366();
			int var17 = arg1.method357();
			int var18 = arg1.method359();
			int var19 = arg1.field929;

			if (arg2.field1390 != null && arg2.field1372) {
				long var20 = SISNGPYM.method428(arg2.field1390);
				boolean var22 = false;
				if (var17 <= 1) {
					for (int var23 = 0; var23 < field451; var23++) {
						if (field236[var23] == var20) {
							var22 = true;
							break;
						}
					}
				}

				if (!var22 && field493 == 0) {
					try {
						field150.field929 = 0;
						arg1.method348(0, field150.field928, var18);
						field150.field929 = 0;
						String var24 = ZIBXIXQC.method580(var18, field150);
						var24 = NGLCBGTC.method277(var24);
						arg2.field1319 = var24;
						arg2.field1337 = var16 >> 8;
						arg2.field1339 = var16 & 0xFF;
						arg2.field1350 = 150;

						if (var17 == 2 || var17 == 3) {
							method67("@cr2@" + arg2.field1390, 1, var24);
						} else if (var17 == 1) {
							method67("@cr1@" + arg2.field1390, 1, var24);
						} else {
							method67(arg2.field1390, 2, var24);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg1.field929 = var18 + var19;
		}

		if ((arg3 & 0x100) != 0) {
			arg2.field1363 = arg1.method358();
			arg2.field1365 = arg1.method358();
			arg2.field1364 = arg1.method339();
			arg2.field1366 = arg1.method359();
			arg2.field1367 = arg1.method341() + field512;
			arg2.field1368 = arg1.method367() + field512;
			arg2.field1369 = arg1.method359();
			arg2.method557();
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean method152(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field231; var2++) {
			if (arg0.equalsIgnoreCase(field420[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field383.field1390)) {
			return true;
		}

		return false;
	}

	public final void run() {
		if (field311) {
			method61();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field182.method484(arg2, arg1, arg0);
		if (var6 != 0) {
			int var7 = field182.method488(arg2, arg1, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg3;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field388.field590;
			int var12 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			KBTDMRWU var14 = KBTDMRWU.method249(var13);
			if (var14.field794 == -1) {
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
				UZETOFZZ var15 = field428[var14.field794];
				if (var15 != null) {
					int var16 = (var14.field804 * 4 - var15.field1204) / 2;
					int var17 = (var14.field763 * 4 - var15.field1205) / 2;
					var15.method530((104 - arg0 - var14.field763) * 4 + var17 + 48, arg1 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field182.method486(arg2, arg1, arg0);
		if (var18 != 0) {
			int var19 = field182.method488(arg2, arg1, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			KBTDMRWU var23 = KBTDMRWU.method249(var22);
			if (var23.field794 != -1) {
				UZETOFZZ var24 = field428[var23.field794];
				if (var24 != null) {
					int var25 = (var23.field804 * 4 - var24.field1204) / 2;
					int var26 = (var23.field763 * 4 - var24.field1205) / 2;
					var24.method530((104 - arg0 - var23.field763) * 4 + var26 + 48, arg1 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field388.field590;
				int var29 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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

		int var30 = field182.method487(arg2, arg1, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			KBTDMRWU var32 = KBTDMRWU.method249(var31);
			if (var32.field794 != -1) {
				UZETOFZZ var33 = field428[var32.field794];
				if (var33 != null) {
					int var34 = (var32.field804 * 4 - var33.field1204) / 2;
					int var35 = (var32.field763 * 4 - var33.field1205) / 2;
					var33.method530((104 - arg0 - var32.field763) * 4 + var35 + 48, arg1 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.e(IZ)Ljava/lang/String;")
	public static final String method154(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.b(ILVGGOSQRK;)Z")
	public final boolean method155(VGGOSQRK arg0) {
		int var2 = arg0.field1217;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field351[field238] = "Remove @whi@" + arg0.field1282;
				field508[field238] = 387;
				field238++;
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

		field351[field238] = "Remove @whi@" + field420[var2];
		field508[field238] = 641;
		field238++;
		field351[field238] = "Message @whi@" + field420[var2];
		field508[field238] = 664;
		field238++;
		return true;
	}

	@ObfuscatedName("client.a(IIIIIIIIZIII)Z")
	public final boolean method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field224[var14][var15] = 0;
				field228[var14][var15] = 99999999;
			}
		}

		int var16 = arg10;
		int var17 = arg4;
		field224[arg10][arg4] = 99;
		field228[arg10][arg4] = 0;
		byte var18 = 0;
		int var19 = 0;
		field249[var18] = arg10;
		int var35 = var18 + 1;
		field250[var18] = arg4;
		boolean var20 = false;
		int var21 = field249.length;
		int[][] var22 = field494[field503].field1449;
		while (var35 != var19) {
			var16 = field249[var19];
			var17 = field250[var19];
			var19 = (var19 + 1) % var21;

			if (arg6 == var16 && arg2 == var17) {
				var20 = true;
				break;
			}

			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && field494[field503].method570(var17, arg7 - 1, arg2, var16, arg6, arg0)) {
					var20 = true;
					break;
				}

				if (arg7 < 10 && field494[field503].method571(var16, arg7 - 1, arg6, arg2, arg0, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg1 != 0 && arg5 != 0 && field494[field503].method572(arg1, var17, arg6, arg5, var16, arg3, arg2)) {
				var20 = true;
				break;
			}

			int var23 = field228[var16][var17] + 1;
			if (var16 > 0 && field224[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field249[var35] = var16 - 1;
				field250[var35] = var17;
				var35 = (var35 + 1) % var21;
				field224[var16 - 1][var17] = 2;
				field228[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field224[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field249[var35] = var16 + 1;
				field250[var35] = var17;
				var35 = (var35 + 1) % var21;
				field224[var16 + 1][var17] = 8;
				field228[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field224[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field249[var35] = var16;
				field250[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field224[var16][var17 - 1] = 1;
				field228[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field224[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field249[var35] = var16;
				field250[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field224[var16][var17 + 1] = 4;
				field228[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field224[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field249[var35] = var16 - 1;
				field250[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field224[var16 - 1][var17 - 1] = 3;
				field228[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field224[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field249[var35] = var16 + 1;
				field250[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field224[var16 + 1][var17 - 1] = 9;
				field228[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field224[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field249[var35] = var16 - 1;
				field250[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field224[var16 - 1][var17 + 1] = 6;
				field228[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field224[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field249[var35] = var16 + 1;
				field250[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field224[var16 + 1][var17 + 1] = 12;
				field228[var16 + 1][var17 + 1] = var23;
			}
		}

		field288 = 0;
		if (!var20) {
			if (arg8) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg6 - var25; var26 <= arg6 + var25; var26++) {
						for (int var27 = arg2 - var25; var27 <= arg2 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field228[var26][var27] < var24) {
								var24 = field228[var26][var27];
								var16 = var26;
								var17 = var27;
								field288 = 1;
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
		field249[var28] = var16;
		int var36 = var28 + 1;
		field250[var28] = var17;
		int var29;
		int var30 = var29 = field224[var16][var17];
		while (arg10 != var16 || arg4 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field249[var36] = var16;
				field250[var36++] = var17;
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

			var30 = field224[var16][var17];
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
		int var32 = field249[var36];
		int var33 = field250[var36];

		if ((var31 & 0x3) == 0) {
			field257++;
		}

		if (field257 >= 59) {
			field332.method328(13);
			field257 = 0;
		}

		if (arg9 == 0) {
			field332.method328(215);
			field332.method329(var31 + var31 + 3);
		}

		if (arg9 == 1) {
			field332.method328(31);
			field332.method329(var31 + var31 + 3 + 14);
		}

		if (arg9 == 2) {
			field332.method328(238);
			field332.method329(var31 + var31 + 3);
		}

		field332.method355(field563[5] == 1 ? 1 : 0);
		field332.method365(field262 + var32);
		field386 = field249[0];
		field387 = field250[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field332.method355(field249[var36] - var32);
			field332.method356(field250[var36] - var33);
		}

		field332.method330(field263 + var33);
		return true;
	}

	@ObfuscatedName("client.f(II)V")
	public final void method157(int arg0) {
		int var2 = FZDJIIMM.field635[arg0].field643;
		if (var2 != 0) {
			int var3 = field441[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					ZVPDLSTW.method597(0.9D);
				}

				if (var3 == 2) {
					ZVPDLSTW.method597(0.8D);
				}

				if (var3 == 3) {
					ZVPDLSTW.method597(0.7D);
				}

				if (var3 == 4) {
					ZVPDLSTW.method597(0.6D);
				}

				ULRRTYRQ.field1177.method511();
				field98 = true;
			}

			if (var2 == 3) {
				boolean var4 = field165;

				if (var3 == 0) {
					method29(field165, 0);
					field165 = true;
				}

				if (var3 == 1) {
					method29(field165, -400);
					field165 = true;
				}

				if (var3 == 2) {
					method29(field165, -800);
					field165 = true;
				}

				if (var3 == 3) {
					method29(field165, -1200);
					field165 = true;
				}

				if (var3 == 4) {
					field165 = false;
				}

				if (field165 != var4 && !field169) {
					if (field165) {
						field470 = field134;
						field471 = true;
						field403.method306(2, field470);
					} else {
						method65();
					}

					field78 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field133 = true;
					method117(0);
				}

				if (var3 == 1) {
					field133 = true;
					method117(-400);
				}

				if (var3 == 2) {
					field133 = true;
					method117(-800);
				}

				if (var3 == 3) {
					field133 = true;
					method117(-1200);
				}

				if (var3 == 4) {
					field133 = false;
				}
			}

			if (var2 == 5) {
				field223 = var3;
			}

			if (var2 == 6) {
				field96 = var3;
			}

			if (var2 == 8) {
				field513 = var3;
				field514 = true;
			}

			if (var2 == 9) {
				field240 = var3;
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void method158() {
		int var1 = field118;
		int var2 = field119;
		int var3 = field120;
		int var4 = field121;
		int var5 = 0x5D5447;
		VMBJKBNJ.method547(var3, var1, var4, var2, var5);
		VMBJKBNJ.method547(var3 - 2, var1 + 1, 16, var2 + 1, 0);
		VMBJKBNJ.method548(var1 + 1, var3 - 2, 0, var4 - 19, var2 + 18);
		field368.method439(var5, "Choose Option", var1 + 3, var2 + 14);
		int var6 = field553;
		int var7 = field554;
		if (field117 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field117 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field117 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field238; var8++) {
			int var9 = (field238 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field368.method443(var10, true, var9, var1 + 3, field351[var8]);
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method159(int arg0) {
		if (arg0 >= 0) {
			int var2 = field506[arg0];
			int var3 = field507[arg0];
			int var4 = field508[arg0];
			int var5 = field509[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (field225 != 0 && var4 != 1855) {
				field225 = 0;
				field514 = true;
			}

			if (var4 == 64) {
				boolean var6 = method156(0, 0, var3, 0, field383.field1352[0], 0, var2, 0, false, 2, field383.field1351[0]);
				if (!var6) {
					method156(0, 1, var3, 0, field383.field1352[0], 1, var2, 0, false, 2, field383.field1351[0]);
				}

				field497 = field560;
				field498 = field561;
				field500 = 2;
				field499 = 0;
				field332.method328(46);
				field332.method363(field262 + var2);
				field332.method365(field263 + var3);
				field332.method330(var5);
			}

			if (var4 == 1439) {
				int var8 = var5 >> 14 & 0x7FFF;
				KBTDMRWU var9 = KBTDMRWU.method249(var8);
				String var10;
				if (var9.field775 == null) {
					var10 = "It's a " + var9.field777 + ".";
				} else {
					var10 = new String(var9.field775);
				}

				method67("", 0, var10);
			}

			if (var4 == 871) {
				field170 = 1;
				field171 = var2;
				field172 = var3;
				field173 = var5;
				field174 = String.valueOf(ULRRTYRQ.method520(var5).field1182);
				field422 = 0;
				field491 = true;
			} else {
				if (var4 == 219) {
					DWBMCYCE var11 = field151[var5];
					if (var11 != null) {
						method156(0, 1, var11.field1352[0], 0, field383.field1352[0], 1, var11.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(250);
						field332.method364(field171);
						field332.method365(field172);
						field332.method330(field173);
						field332.method330(var5);
					}
				}

				if (var4 == 523) {
					field332.method328(154);
					field332.method330(var3);
					VGGOSQRK var12 = VGGOSQRK.method538(var3);
					if (var12.field1238 != null && var12.field1238[0][0] == 5) {
						int var13 = var12.field1238[0][1];
						field441[var13] = 1 - field441[var13];
						method157(var13);
						field491 = true;
					}
				}

				if (var4 == 18) {
					field332.method328(162);
					field332.method363(var2);
					field332.method330(var3);
					field332.method363(var5);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 752) {
					boolean var14 = method156(0, 0, var3, 0, field383.field1352[0], 0, var2, 0, false, 2, field383.field1351[0]);
					if (!var14) {
						method156(0, 1, var3, 0, field383.field1352[0], 1, var2, 0, false, 2, field383.field1351[0]);
					}

					field497 = field560;
					field498 = field561;
					field500 = 2;
					field499 = 0;

					if ((var3 & 0x3) == 0) {
						field496++;
					}

					if (field496 >= 50) {
						field332.method328(49);
						field332.method330(23270);
						field496 = 0;
					}

					field332.method328(121);
					field332.method330(var5);
					field332.method365(field263 + var3);
					field332.method365(field262 + var2);
				}

				if (var4 == 694) {
					method130(var5, var2, var3);
					field332.method328(158);
					field332.method363(field263 + var3);
					field332.method365(field262 + var2);
					field332.method363(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 90) {
					DWBMCYCE var16 = field151[var5];
					if (var16 != null) {
						method156(0, 1, var16.field1352[0], 0, field383.field1352[0], 1, var16.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(21);
						field332.method330(var5);
					}
				}

				if (var4 == 468) {
					DWBMCYCE var17 = field151[var5];
					if (var17 != null) {
						method156(0, 1, var17.field1352[0], 0, field383.field1352[0], 1, var17.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(152);
						field332.method365(var5);
					}
				}

				if (var4 == 232) {
					method130(var5, var2, var3);
					field332.method328(249);
					field332.method365(var5 >> 14 & 0x7FFF);
					field332.method365(field262 + var2);
					field332.method364(field263 + var3);
				}

				if (var4 == 749 || var4 == 921) {
					String var18 = field351[arg0];
					int var19 = var18.indexOf("@whi@");
					if (var19 != -1) {
						var18 = var18.substring(var19 + 5).trim();
						String var20 = SISNGPYM.method432(SISNGPYM.method429(SISNGPYM.method428(var18)));
						boolean var21 = false;
						for (int var22 = 0; var22 < field407; var22++) {
							XVMRCEYW var23 = field406[field408[var22]];
							if (var23 != null && var23.field1390 != null && var23.field1390.equalsIgnoreCase(var20)) {
								method156(0, 1, var23.field1352[0], 0, field383.field1352[0], 1, var23.field1351[0], 0, false, 2, field383.field1351[0]);

								if (var4 == 749) {
									field332.method328(16);
									field332.method330(field408[var22]);
								}

								if (var4 == 921) {
									field332.method328(201);
									field332.method365(field408[var22]);
								}

								var21 = true;
								break;
							}
						}

						if (!var21) {
							method67("", 0, "Unable to find " + var20);
						}
					}
				}

				if (var4 == 1952) {
					method130(var5, var2, var3);
					field332.method328(0);
					field332.method330(field262 + var2);
					field332.method365(var5 >> 14 & 0x7FFF);
					field332.method365(field263 + var3);
				}

				if (var4 == 883) {
					field332.method328(154);
					field332.method330(var3);
					VGGOSQRK var24 = VGGOSQRK.method538(var3);
					if (var24.field1238 != null && var24.field1238[0][0] == 5) {
						int var25 = var24.field1238[0][1];
						if (field441[var25] != var24.field1221[0]) {
							field441[var25] = var24.field1221[0];
							method157(var25);
							field491 = true;
						}
					}
				}

				if (var4 == 843) {
					DWBMCYCE var26 = field151[var5];
					if (var26 != null) {
						method156(0, 1, var26.field1352[0], 0, field383.field1352[0], 1, var26.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(219);
						field332.method363(var5);
						field332.method365(field423);
					}
				}

				if (var4 == 550) {
					DWBMCYCE var27 = field151[var5];
					if (var27 != null) {
						method156(0, 1, var27.field1352[0], 0, field383.field1352[0], 1, var27.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(133);
						field332.method365(var5);
					}
				}

				if (var4 == 980 && method130(var5, var2, var3)) {
					field332.method328(186);
					field332.method364(var5 >> 14 & 0x7FFF);
					field332.method330(field173);
					field332.method365(field172);
					field332.method330(field171);
					field332.method330(field262 + var2);
					field332.method365(field263 + var3);
				}

				if (var4 == 664) {
					String var28 = field351[arg0];
					int var29 = var28.indexOf("@whi@");
					if (var29 != -1) {
						long var30 = SISNGPYM.method428(var28.substring(var29 + 5).trim());
						int var32 = -1;
						for (int var33 = 0; var33 < field231; var33++) {
							if (field331[var33] == var30) {
								var32 = var33;
								break;
							}
						}

						if (var32 != -1 && field189[var32] > 0) {
							field514 = true;
							field225 = 0;
							field87 = true;
							field202 = "";
							field429 = 3;
							field391 = field331[var32];
							field350 = "Enter message to send to " + field420[var32];
						}
					}
				}

				if (var4 == 665) {
					XVMRCEYW var34 = field406[var5];
					if (var34 != null) {
						method156(0, 1, var34.field1352[0], 0, field383.field1352[0], 1, var34.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(201);
						field332.method365(var5);
					}
				}

				if (var4 == 293) {
					method130(var5, var2, var3);
					field332.method328(189);
					field332.method365(var5 >> 14 & 0x7FFF);
					field332.method364(field262 + var2);
					field332.method363(field263 + var3);
				}

				if (var4 == 870) {
					XVMRCEYW var35 = field406[var5];
					if (var35 != null) {
						method156(0, 1, var35.field1352[0], 0, field383.field1352[0], 1, var35.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field436++;
						if (field436 >= 85) {
							field332.method328(147);
							field332.method330(13671);
							field436 = 0;
						}

						field332.method328(217);
						field332.method363(var5);
					}
				}

				if (var4 == 455) {
					VGGOSQRK var36 = VGGOSQRK.method538(var3);
					boolean var37 = true;
					if (var36.field1217 > 0) {
						var37 = method74(var36);
					}

					if (var37) {
						field332.method328(154);
						field332.method330(var3);
					}
				}

				if (var4 == 873) {
					boolean var38 = method156(0, 0, var3, 0, field383.field1352[0], 0, var2, 0, false, 2, field383.field1351[0]);
					if (!var38) {
						method156(0, 1, var3, 0, field383.field1352[0], 1, var2, 0, false, 2, field383.field1351[0]);
					}

					field497 = field560;
					field498 = field561;
					field500 = 2;
					field499 = 0;
					field332.method328(213);
					field332.method364(field263 + var3);
					field332.method364(var5);
					field332.method365(field262 + var2);
				}

				if (var4 == 504) {
					field332.method328(9);
					field332.method365(var2);
					field332.method364(var3);
					field332.method364(var5);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 1) {
					if (field301) {
						field182.method496(var2 - 4, var3 - 4);
					} else {
						field182.method496(field560 - 4, field561 - 4);
					}
				}

				if (var4 == 722) {
					String var40 = field351[arg0];
					int var41 = var40.indexOf("@whi@");
					if (var41 != -1) {
						if (field319 == -1) {
							method162();
							field157 = var40.substring(var41 + 5).trim();
							field180 = false;
							field256 = field319 = VGGOSQRK.field1251;
						} else {
							method67("", 0, "Please close the interface you have open before using 'report abuse'");
						}
					}
				}

				if (var4 == 632) {
					field332.method328(11);
					field332.method330(var2);
					field332.method363(field423);
					field332.method364(var3);
					field332.method365(var5);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 29) {
					if ((var5 & 0x3) == 0) {
						field437++;
					}

					if (field437 >= 84) {
						field332.method328(90);
						field332.method330(40661);
						field437 = 0;
					}

					field332.method328(57);
					field332.method363(var2);
					field332.method364(var5);
					field332.method364(var3);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 486) {
					field332.method328(127);
					field332.method330(var3);
					field332.method365(var5);
					field332.method365(var2);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 990) {
					method162();
				}

				if (var4 == 347) {
					XVMRCEYW var42 = field406[var5];
					if (var42 != null) {
						method156(0, 1, var42.field1352[0], 0, field383.field1352[0], 1, var42.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(237);
						field332.method363(var5);
						field332.method363(field423);
					}
				}

				if (var4 == 159 || var4 == 444 || var4 == 641 || var4 == 387) {
					String var43 = field351[arg0];
					int var44 = var43.indexOf("@whi@");
					if (var44 != -1) {
						long var45 = SISNGPYM.method428(var43.substring(var44 + 5).trim());
						if (var4 == 159) {
							method116(var45);
						}

						if (var4 == 444) {
							method112(var45);
						}

						if (var4 == 641) {
							method33(var45);
						}

						if (var4 == 387) {
							method99(var45);
						}
					}
				}

				if (var4 == 866) {
					DWBMCYCE var47 = field151[var5];
					if (var47 != null) {
						method156(0, 1, var47.field1352[0], 0, field383.field1352[0], 1, var47.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(94);
						field332.method330(var5);
					}
				}

				if (var4 == 651) {
					field332.method328(55);
					field332.method363(var2);
					field332.method330(var3);
					field332.method330(var5);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 675) {
					field332.method328(118);
					field332.method363(var3);
					field332.method364(var5);
					field332.method363(var2);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 600) {
					XVMRCEYW var48 = field406[var5];
					if (var48 != null) {
						method156(0, 1, var48.field1352[0], 0, field383.field1352[0], 1, var48.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(177);
						field332.method364(field171);
						field332.method364(var5);
						field332.method363(field172);
						field332.method365(field173);
					}
				}

				if (var4 == 393) {
					field332.method328(85);
					field332.method364(var5);
					field332.method365(var2);
					field332.method364(var3);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 1288) {
					ULRRTYRQ var49 = ULRRTYRQ.method520(var5);
					String var50;
					if (var49.field1198 == null) {
						var50 = "It's a " + var49.field1182 + ".";
					} else {
						var50 = new String(var49.field1198);
					}

					method67("", 0, var50);
				}

				if (var4 == 605) {
					field332.method328(150);
					field332.method365(var2);
					field332.method330(var5);
					field332.method364(var3);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 24) {
					boolean var51 = method156(0, 0, var3, 0, field383.field1352[0], 0, var2, 0, false, 2, field383.field1351[0]);
					if (!var51) {
						method156(0, 1, var3, 0, field383.field1352[0], 1, var2, 0, false, 2, field383.field1351[0]);
					}

					field497 = field560;
					field498 = field561;
					field500 = 2;
					field499 = 0;
					field332.method328(12);
					field332.method330(field262 + var2);
					field332.method365(field263 + var3);
					field332.method364(var5);
				}

				if (var4 == 835) {
					field332.method328(51);
					field332.method363(var3);
					field332.method330(var2);
					field332.method330(field171);
					field332.method364(var5);
					field332.method363(field172);
					field332.method365(field173);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 308) {
					method130(var5, var2, var3);
					field332.method328(170);
					field332.method330(field263 + var3);
					field332.method330(field262 + var2);
					field332.method364(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 9) {
					XVMRCEYW var53 = field406[var5];
					if (var53 != null) {
						method156(0, 1, var53.field1352[0], 0, field383.field1352[0], 1, var53.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(59);
						field332.method330(var5);
					}
				}

				if (var4 == 762) {
					boolean var54 = method156(0, 0, var3, 0, field383.field1352[0], 0, var2, 0, false, 2, field383.field1351[0]);
					if (!var54) {
						method156(0, 1, var3, 0, field383.field1352[0], 1, var2, 0, false, 2, field383.field1351[0]);
					}

					field497 = field560;
					field498 = field561;
					field500 = 2;
					field499 = 0;
					field332.method328(216);
					field332.method364(field173);
					field332.method363(field172);
					field332.method330(field171);
					field332.method365(var5);
					field332.method365(field262 + var2);
					field332.method365(field263 + var3);
				}

				if (var4 == 985) {
					boolean var56 = method156(0, 0, var3, 0, field383.field1352[0], 0, var2, 0, false, 2, field383.field1351[0]);
					if (!var56) {
						method156(0, 1, var3, 0, field383.field1352[0], 1, var2, 0, false, 2, field383.field1351[0]);
					}

					field497 = field560;
					field498 = field561;
					field500 = 2;
					field499 = 0;
					field332.method328(159);
					field332.method364(field262 + var2);
					field332.method330(field263 + var3);
					field332.method364(var5);
					field332.method363(field423);
				}

				if (var4 == 214 && method130(var5, var2, var3)) {
					field332.method328(188);
					field332.method365(field423);
					field332.method364(field262 + var2);
					field332.method363(var5 >> 14 & 0x7FFF);
					field332.method365(field263 + var3);
				}

				if (var4 == 852) {
					boolean var58 = method156(0, 0, var3, 0, field383.field1352[0], 0, var2, 0, false, 2, field383.field1351[0]);
					if (!var58) {
						method156(0, 1, var3, 0, field383.field1352[0], 1, var2, 0, false, 2, field383.field1351[0]);
					}

					field497 = field560;
					field498 = field561;
					field500 = 2;
					field499 = 0;
					field332.method328(4);
					field332.method364(var5);
					field332.method364(field262 + var2);
					field332.method365(field263 + var3);
				}

				if (var4 == 741) {
					XVMRCEYW var60 = field406[var5];
					if (var60 != null) {
						method156(0, 1, var60.field1352[0], 0, field383.field1352[0], 1, var60.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;

						if ((var5 & 0x3) == 0) {
							field184++;
						}

						if (field184 >= 74) {
							field332.method328(203);
							field332.method329(232);
							field184 = 0;
						}

						field332.method328(6);
						field332.method330(var5);
					}
				}

				if (var4 == 432) {
					DWBMCYCE var61 = field151[var5];
					if (var61 != null) {
						method156(0, 1, var61.field1352[0], 0, field383.field1352[0], 1, var61.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(87);
						field332.method364(var5);
					}
				}

				if (var4 == 490) {
					field332.method328(65);
					field332.method364(var2);
					field332.method364(var5);
					field332.method365(var3);
					field210 = 0;
					field211 = var3;
					field212 = var2;
					field213 = 2;
					if (VGGOSQRK.method538(var3).field1272 == field319) {
						field213 = 1;
					}

					if (VGGOSQRK.method538(var3).field1272 == field305) {
						field213 = 3;
					}
				}

				if (var4 == 711) {
					XVMRCEYW var62 = field406[var5];
					if (var62 != null) {
						method156(0, 1, var62.field1352[0], 0, field383.field1352[0], 1, var62.field1351[0], 0, false, 2, field383.field1351[0]);
						field497 = field560;
						field498 = field561;
						field500 = 2;
						field499 = 0;
						field332.method328(16);
						field332.method330(var5);
					}
				}

				if (var4 == 1910) {
					ULRRTYRQ var63 = ULRRTYRQ.method520(var5);
					VGGOSQRK var64 = VGGOSQRK.method538(var3);
					String var65;
					if (var64 != null && var64.field1233[var2] >= 100000) {
						var65 = var64.field1233[var2] + " x " + var63.field1182;
					} else if (var63.field1198 == null) {
						var65 = "It's a " + var63.field1182 + ".";
					} else {
						var65 = new String(var63.field1198);
					}

					method67("", 0, var65);
				}

				if (var4 == 149 && !field346) {
					field332.method328(214);
					field332.method330(var3);
					field346 = true;
				}

				if (var4 == 246) {
					VGGOSQRK var66 = VGGOSQRK.method538(var3);
					field422 = 1;
					field423 = var3;
					field424 = var66.field1223;
					field170 = 0;
					field491 = true;
					String var67 = var66.field1277;
					if (var67.indexOf(" ") != -1) {
						var67 = var67.substring(0, var67.indexOf(" "));
					}

					String var68 = var66.field1277;
					if (var68.indexOf(" ") != -1) {
						var68 = var68.substring(var68.indexOf(" ") + 1);
					}

					field425 = var67 + " " + var66.field1260 + " " + var68;

					if (field424 == 16) {
						field491 = true;
						field107 = 3;
						field190 = true;
					}
				} else {
					if (var4 == 405) {
						method32(field453);
						field453 = -1;
						field514 = true;
					}

					if (var4 == 236) {
						field209++;
						if (field209 >= 146) {
							field332.method328(36);
							field332.method333(0);
							field209 = 0;
						}

						field332.method328(226);
						field332.method363(var5);
						field332.method365(var2);
						field332.method363(var3);
						field210 = 0;
						field211 = var3;
						field212 = var2;
						field213 = 2;
						if (VGGOSQRK.method538(var3).field1272 == field319) {
							field213 = 1;
						}

						if (VGGOSQRK.method538(var3).field1272 == field305) {
							field213 = 3;
						}
					}

					if (var4 == 1532) {
						DWBMCYCE var69 = field151[var5];
						if (var69 != null) {
							APPQAEOL var70 = var69.field536;
							if (var70.field14 != null) {
								var70 = var70.method5();
							}

							if (var70 != null) {
								String var71;
								if (var70.field15 == null) {
									var71 = "It's a " + var70.field34 + ".";
								} else {
									var71 = new String(var70.field15);
								}

								method67("", 0, var71);
							}
						}
					}

					field170 = 0;
					field422 = 0;
					field491 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method160() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field466[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field466[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field467[var10] = (field466[var10 - 1] + field466[var10 + 1] + field466[var10 - 128] + field466[var10 + 128]) / 4;
			}
		}

		field251 += 128;
		if (field251 > field187.length) {
			field251 -= field187.length;
			int var11 = (int) (Math.random() * 12.0D);
			method94(field216[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field467[var14 + 128] - field187[field251 + var14 & field187.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field466[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field511[var16] = field511[var16 + 1];
		}

		field511[var1 - 1] = (int) (Math.sin(field512 / 14.0D) * 16.0D + Math.sin(field512 / 15.0D) * 14.0D + Math.sin(field512 / 16.0D) * 12.0D);

		if (field285 > 0) {
			field285 -= 4;
		}

		if (field286 > 0) {
			field286 -= 4;
		}

		if (field285 == 0 && field286 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field285 = 1024;
			}

			if (var17 == 1) {
				field286 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method161(boolean arg0) {
		for (int var2 = 0; var2 < field152; var2++) {
			DWBMCYCE var3 = field151[field153[var2]];
			int var4 = (field153[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method166() && var3.field536.field24 == arg0 && var3.field536.method6()) {
				int var5 = var3.field1342 >> 7;
				int var6 = var3.field1343 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1327 == 1 && (var3.field1342 & 0x7F) == 0x40 && (var3.field1343 & 0x7F) == 0x40) {
						if (field434[var5][var6] == field109) {
							continue;
						}

						field434[var5][var6] = field109;
					}

					if (!var3.field536.field9) {
						var4 += Integer.MIN_VALUE;
					}

					field182.method469(var3, var3.field1342, var4, method69(var3.field1342, field503, var3.field1343), var3.field1344, (var3.field1327 - 1) * 64 + 60, var3.field1370, field503, var3.field1343);
				}
			}
		}
	}

	@ObfuscatedName("client.q(Z)V")
	public final void method162() {
		field332.method328(116);

		if (field145 != -1) {
			method32(field145);
			field145 = -1;
			field491 = true;
			field346 = false;
			field190 = true;
		}

		if (field305 != -1) {
			method32(field305);
			field305 = -1;
			field514 = true;
			field346 = false;
		}

		if (field227 != -1) {
			method32(field227);
			field227 = -1;
			field98 = true;
		}

		if (field353 != -1) {
			method32(field353);
			field353 = -1;
		}

		if (field319 != -1) {
			method32(field319);
			field319 = -1;
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method163() {
		if (field513 != 0) {
			TJCUOFPI var1 = field367;
			int var2 = 0;
			if (field79 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field77[var3] != null) {
					int var4 = field75[var3];
					String var5 = field76[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field154 == 0 || field154 == 1 && method152(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method439(0, "From", var8, var7);
						var1.method439(0xFFFF, "From", var8, var7 - 1);
						int var11 = var8 + var1.method437("From ");
						if (var6 == 1) {
							field320[0].method530(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field320[1].method530(var7 - 12, var11);
							var11 += 14;
						}

						var1.method439(0, var5 + ": " + field77[var3], var11, var7);
						var1.method439(0xFFFF, var5 + ": " + field77[var3], var11, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field154 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method439(0, field77[var3], 4, var9);
						var1.method439(0xFFFF, field77[var3], 4, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field154 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method439(0, "To " + var5 + ": " + field77[var3], 4, var10);
						var1.method439(0xFFFF, "To " + var5 + ": " + field77[var3], 4, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method164() {
		if (field394 == 2) {
			for (CPAFTRRP var1 = (CPAFTRRP) field100.method200(); var1 != null; var1 = (CPAFTRRP) field100.method202()) {
				if (var1.field524 > 0) {
					var1.field524--;
				}

				if (var1.field524 != 0) {
					if (var1.field520 > 0) {
						var1.field520--;
					}

					if (var1.field520 == 0 && var1.field518 >= 1 && var1.field519 >= 1 && var1.field518 <= 102 && var1.field519 <= 102 && (var1.field521 < 0 || OBDFVVEL.method379(var1.field521, var1.field523))) {
						method149(var1.field519, var1.field522, var1.field523, var1.field517, var1.field518, var1.field521, var1.field516);
						var1.field520 = -1;

						if (var1.field525 == var1.field521 && var1.field525 == -1) {
							var1.method326();
						} else if (var1.field525 == var1.field521 && var1.field526 == var1.field522 && var1.field527 == var1.field523) {
							var1.method326();
						}
					}
				} else if (var1.field525 < 0 || OBDFVVEL.method379(var1.field525, var1.field527)) {
					method149(var1.field519, var1.field526, var1.field527, var1.field517, var1.field518, var1.field525, var1.field516);
					var1.method326();
				}
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field452[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field492[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
