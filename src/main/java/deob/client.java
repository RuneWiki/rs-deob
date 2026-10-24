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
public final class client extends GYSHSTYO {

	@ObfuscatedName("client.K")
	public long[] field57 = new long[100];

	@ObfuscatedName("client.L")
	public ILVDIPQT field58 = new ILVDIPQT();

	@ObfuscatedName("client.M")
	public int field59 = -1;

	@ObfuscatedName("client.N")
	public int[] field60 = new int[5];

	@ObfuscatedName("client.O")
	public int field61 = 128;

	@ObfuscatedName("client.X")
	public int[] field68 = new int[UILCRUTQ.field1335];

	@ObfuscatedName("client.ab")
	public int field71 = -1;

	@ObfuscatedName("client.db")
	public int[] field74 = new int[5];

	@ObfuscatedName("client.eb")
	public final int field75 = 100;

	@ObfuscatedName("client.fb")
	public int[] field76 = new int[100];

	@ObfuscatedName("client.gb")
	public boolean field77 = false;

	@ObfuscatedName("client.hb")
	public VDSDFSIV[] field78 = new VDSDFSIV[1000];

	@ObfuscatedName("client.ib")
	public String field79 = "";

	@ObfuscatedName("client.jb")
	public String field80 = "";

	@ObfuscatedName("client.kb")
	public int[] field81 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.wb")
	public DNACUOZQ[] field91 = new DNACUOZQ[2];

	@ObfuscatedName("client.yb")
	public boolean field93 = false;

	@ObfuscatedName("client.zb")
	public VDSDFSIV[] field94 = new VDSDFSIV[20];

	@ObfuscatedName("client.Bb")
	public boolean field96 = false;

	@ObfuscatedName("client.Fb")
	public int[] field100 = new int[200];

	@ObfuscatedName("client.Kb")
	public String field103 = "";

	@ObfuscatedName("client.Lb")
	public volatile boolean field104 = false;

	@ObfuscatedName("client.Qb")
	public boolean field108 = false;

	@ObfuscatedName("client.Yb")
	public boolean field115 = false;

	@ObfuscatedName("client.Zb")
	public int[] field116 = new int[4000];

	@ObfuscatedName("client.ac")
	public int[] field117 = new int[4000];

	@ObfuscatedName("client.cc")
	public DNACUOZQ[] field118 = new DNACUOZQ[13];

	@ObfuscatedName("client.lc")
	public XOUQUKZW field124 = XOUQUKZW.method509(1);

	@ObfuscatedName("client.mc")
	public String[] field125 = new String[500];

	@ObfuscatedName("client.pc")
	public volatile boolean field127 = false;

	@ObfuscatedName("client.rc")
	public String field128 = "";

	@ObfuscatedName("client.vc")
	public int field131 = -1;

	@ObfuscatedName("client.wc")
	public XOUQUKZW field132 = XOUQUKZW.method509(1);

	@ObfuscatedName("client.xc")
	public boolean field133 = false;

	@ObfuscatedName("client.Fc")
	public boolean field140 = false;

	@ObfuscatedName("client.Hc")
	public int[] field142 = new int[1000];

	@ObfuscatedName("client.Ic")
	public int[] field143 = new int[1000];

	@ObfuscatedName("client.Jc")
	public boolean field144 = false;

	@ObfuscatedName("client.Pc")
	public boolean field149 = true;

	@ObfuscatedName("client.Qc")
	public boolean field150 = false;

	@ObfuscatedName("client.Sc")
	public int[] field152 = new int[7];

	@ObfuscatedName("client.Vc")
	public int[] field153 = new int[50];

	@ObfuscatedName("client.Wc")
	public boolean field154 = false;

	@ObfuscatedName("client.Xc")
	public boolean field155 = true;

	@ObfuscatedName("client.nd")
	public boolean field171 = true;

	@ObfuscatedName("client.Ad")
	public int[][] field182 = new int[104][104];

	@ObfuscatedName("client.Bd")
	public boolean field183 = false;

	@ObfuscatedName("client.Gd")
	public int[] field188 = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Hd")
	public int[] field189 = new int[50];

	@ObfuscatedName("client.Jd")
	public XOUQUKZW field191 = new XOUQUKZW(new byte[5000]);

	@ObfuscatedName("client.Kd")
	public AVKLDTFF[] field192 = new AVKLDTFF[16384];

	@ObfuscatedName("client.Md")
	public int[] field194 = new int[16384];

	@ObfuscatedName("client.Nd")
	public boolean field195 = false;

	@ObfuscatedName("client.Pd")
	public YAQQZUCW[] field196 = new YAQQZUCW[5];

	@ObfuscatedName("client.Wd")
	public int field203 = 1;

	@ObfuscatedName("client.ge")
	public boolean field213 = false;

	@ObfuscatedName("client.he")
	public int field214 = 2048;

	@ObfuscatedName("client.ie")
	public int field215 = 2047;

	@ObfuscatedName("client.je")
	public LAKHMHBY[] field216 = new LAKHMHBY[field214];

	@ObfuscatedName("client.le")
	public int[] field218 = new int[field214];

	@ObfuscatedName("client.ne")
	public int[] field220 = new int[field214];

	@ObfuscatedName("client.oe")
	public XOUQUKZW[] field221 = new XOUQUKZW[field214];

	@ObfuscatedName("client.qe")
	public int[] field223 = new int[1000];

	@ObfuscatedName("client.te")
	public String[] field226 = new String[200];

	@ObfuscatedName("client.ye")
	public int[][] field228 = new int[104][104];

	@ObfuscatedName("client.Ce")
	public volatile boolean field232 = false;

	@ObfuscatedName("client.Fe")
	public ILVDIPQT[][][] field235 = new ILVDIPQT[4][104][104];

	@ObfuscatedName("client.Ie")
	public int[] field238 = new int[50];

	@ObfuscatedName("client.Je")
	public int field239 = -1;

	@ObfuscatedName("client.Ke")
	public int[] field240 = new int[256];

	@ObfuscatedName("client.Le")
	public int[] field241 = new int[UILCRUTQ.field1335];

	@ObfuscatedName("client.Ve")
	public ILVDIPQT field249 = new ILVDIPQT();

	@ObfuscatedName("client.ef")
	public int[] field258 = new int[33];

	@ObfuscatedName("client.gf")
	public int[] field259 = new int[5];

	@ObfuscatedName("client.hf")
	public int field260 = 78;

	@ObfuscatedName("client.jf")
	public String field261 = "";

	@ObfuscatedName("client.qf")
	public int[][][] field268 = new int[4][13][13];

	@ObfuscatedName("client.vf")
	public int field273 = 1;

	@ObfuscatedName("client.wf")
	public int[][] field274 = new int[104][104];

	@ObfuscatedName("client.zf")
	public int field276 = 0x332D25;

	@ObfuscatedName("client.Bf")
	public int[] field278 = new int[9];

	@ObfuscatedName("client.Jf")
	public int[] field286 = new int[33];

	@ObfuscatedName("client.Of")
	public int field290 = 50;

	@ObfuscatedName("client.Pf")
	public int[] field291 = new int[field290];

	@ObfuscatedName("client.Qf")
	public int[] field292 = new int[field290];

	@ObfuscatedName("client.Rf")
	public int[] field293 = new int[field290];

	@ObfuscatedName("client.Sf")
	public int[] field294 = new int[field290];

	@ObfuscatedName("client.Tf")
	public int[] field295 = new int[field290];

	@ObfuscatedName("client.Uf")
	public int[] field296 = new int[field290];

	@ObfuscatedName("client.Vf")
	public int[] field297 = new int[field290];

	@ObfuscatedName("client.Wf")
	public String[] field298 = new String[field290];

	@ObfuscatedName("client.Xf")
	public int field299 = -1;

	@ObfuscatedName("client.Zf")
	public final int[] field300 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ag")
	public ILVDIPQT field301 = new ILVDIPQT();

	@ObfuscatedName("client.cg")
	public int[] field303 = new int[151];

	@ObfuscatedName("client.hg")
	public int field307 = 0x766654;

	@ObfuscatedName("client.kg")
	public int[] field310 = new int[UILCRUTQ.field1335];

	@ObfuscatedName("client.lg")
	public int[] field311 = new int[5];

	@ObfuscatedName("client.mg")
	public boolean field312 = false;

	@ObfuscatedName("client.ng")
	public VDSDFSIV[] field313 = new VDSDFSIV[100];

	@ObfuscatedName("client.Ag")
	public int field324 = 0x23201B;

	@ObfuscatedName("client.Bg")
	public boolean field325 = false;

	@ObfuscatedName("client.Cg")
	public YMCKWFGH[] field326 = new YMCKWFGH[4];

	@ObfuscatedName("client.Dg")
	public int field327 = -1;

	@ObfuscatedName("client.Eg")
	public XOUQUKZW field328 = XOUQUKZW.method509(1);

	@ObfuscatedName("client.Fg")
	public boolean field329 = false;

	@ObfuscatedName("client.Hg")
	public int field330 = -1;

	@ObfuscatedName("client.Ig")
	public long[] field331 = new long[200];

	@ObfuscatedName("client.Kg")
	public int field333 = 3;

	@ObfuscatedName("client.Rg")
	public String[] field340 = new String[5];

	@ObfuscatedName("client.Sg")
	public boolean[] field341 = new boolean[5];

	@ObfuscatedName("client.Tg")
	public int[] field342 = new int[2000];

	@ObfuscatedName("client.Yg")
	public int field347 = -1;

	@ObfuscatedName("client.Zg")
	public boolean field348 = false;

	@ObfuscatedName("client.dh")
	public int field350 = 0x4D4233;

	@ObfuscatedName("client.eh")
	public String field351 = "";

	@ObfuscatedName("client.fh")
	public String field352 = "";

	@ObfuscatedName("client.ih")
	public int[] field354 = new int[5];

	@ObfuscatedName("client.rh")
	public int[] field362 = new int[100];

	@ObfuscatedName("client.sh")
	public String[] field363 = new String[100];

	@ObfuscatedName("client.th")
	public String[] field364 = new String[100];

	@ObfuscatedName("client.wh")
	public DNACUOZQ[] field365 = new DNACUOZQ[100];

	@ObfuscatedName("client.yh")
	public boolean field366 = false;

	@ObfuscatedName("client.Bh")
	public boolean field369 = false;

	@ObfuscatedName("client.Dh")
	public byte[] field371 = new byte[16384];

	@ObfuscatedName("client.Hh")
	public int field374 = 2;

	@ObfuscatedName("client.Ih")
	public int field375 = -1;

	@ObfuscatedName("client.Jh")
	public int field376 = -1;

	@ObfuscatedName("client.Kh")
	public boolean[] field377 = new boolean[5];

	@ObfuscatedName("client.Ph")
	public int field382 = -1;

	@ObfuscatedName("client.Wh")
	public boolean field388 = false;

	@ObfuscatedName("client.Yh")
	public int field390 = -1;

	@ObfuscatedName("client.ci")
	public int field392 = -1;

	@ObfuscatedName("client.hi")
	public boolean field396 = false;

	@ObfuscatedName("client.ji")
	public boolean field398 = true;

	@ObfuscatedName("client.li")
	public String field400 = "";

	@ObfuscatedName("client.si")
	public PFVGIFDY field406 = new PFVGIFDY();

	@ObfuscatedName("client.wi")
	public VDSDFSIV[] field410 = new VDSDFSIV[8];

	@ObfuscatedName("client.Mi")
	public String field424 = "";

	@ObfuscatedName("client.Ti")
	public boolean field431 = false;

	@ObfuscatedName("client.Xi")
	public boolean field433 = true;

	@ObfuscatedName("client.Zi")
	public VDSDFSIV[] field434 = new VDSDFSIV[20];

	@ObfuscatedName("client.hj")
	public int[] field441 = new int[500];

	@ObfuscatedName("client.ij")
	public int[] field442 = new int[500];

	@ObfuscatedName("client.jj")
	public int[] field443 = new int[500];

	@ObfuscatedName("client.kj")
	public int[] field444 = new int[500];

	@ObfuscatedName("client.oj")
	public int[] field448 = new int[2000];

	@ObfuscatedName("client.pj")
	public int field449 = -1;

	@ObfuscatedName("client.rj")
	public CRC32 field451 = new CRC32();

	@ObfuscatedName("client.tj")
	public int[] field453 = new int[151];

	@ObfuscatedName("client.yj")
	public int field458 = 2;

	@ObfuscatedName("client.Pj")
	public int field475 = 2;

	@ObfuscatedName("client.Y")
	public static final int[][] field69 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.bb")
	public static BigInteger field72 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Xb")
	public static int[] field114 = new int[99];

	@ObfuscatedName("client.Zc")
	public static int field157 = 10;

	@ObfuscatedName("client.bd")
	public static boolean field159 = true;

	@ObfuscatedName("client.Xd")
	public static BigInteger field204 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Zd")
	public static final int[] field206 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Lh")
	public static int[] field378 = new int[32];

	@ObfuscatedName("client.Vi")
	public static String field432 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Gb")
	public int field101;

	@ObfuscatedName("client.Hb")
	public int field102;

	@ObfuscatedName("client.Mb")
	public int field105;

	@ObfuscatedName("client.Nb")
	public static int field106;

	@ObfuscatedName("client.Pb")
	public int field107;

	@ObfuscatedName("client.Rb")
	public int field109;

	@ObfuscatedName("client.Sb")
	public int field110;

	@ObfuscatedName("client.dc")
	public int field119;

	@ObfuscatedName("client.hc")
	public int field122;

	@ObfuscatedName("client.jc")
	public int field123;

	@ObfuscatedName("client.nc")
	public int field126;

	@ObfuscatedName("client.sc")
	public static int field129;

	@ObfuscatedName("client.uc")
	public static int field130;

	@ObfuscatedName("client.Gc")
	public int field141;

	@ObfuscatedName("client.Kc")
	public int field145;

	@ObfuscatedName("client.Mc")
	public int field147;

	@ObfuscatedName("client.Nc")
	public int field148;

	@ObfuscatedName("client.Rc")
	public int field151;

	@ObfuscatedName("client.Yc")
	public int field156;

	@ObfuscatedName("client.ad")
	public static int field158;

	@ObfuscatedName("client.dd")
	public int field161;

	@ObfuscatedName("client.ed")
	public int field162;

	@ObfuscatedName("client.fd")
	public int field163;

	@ObfuscatedName("client.gd")
	public int field164;

	@ObfuscatedName("client.hd")
	public int field165;

	@ObfuscatedName("client.id")
	public int field166;

	@ObfuscatedName("client.jd")
	public int field167;

	@ObfuscatedName("client.kd")
	public int field168;

	@ObfuscatedName("client.ld")
	public int field169;

	@ObfuscatedName("client.md")
	public int field170;

	@ObfuscatedName("client.od")
	public int field172;

	@ObfuscatedName("client.Cd")
	public int field184;

	@ObfuscatedName("client.Dd")
	public int field185;

	@ObfuscatedName("client.Ed")
	public int field186;

	@ObfuscatedName("client.Fd")
	public int field187;

	@ObfuscatedName("client.Id")
	public int field190;

	@ObfuscatedName("client.Ld")
	public int field193;

	@ObfuscatedName("client.Qd")
	public int field197;

	@ObfuscatedName("client.Rd")
	public int field198;

	@ObfuscatedName("client.Sd")
	public int field199;

	@ObfuscatedName("client.Td")
	public int field200;

	@ObfuscatedName("client.Ud")
	public int field201;

	@ObfuscatedName("client.Vd")
	public int field202;

	@ObfuscatedName("client.Yd")
	public int field205;

	@ObfuscatedName("client.ae")
	public int field207;

	@ObfuscatedName("client.ke")
	public int field217;

	@ObfuscatedName("client.me")
	public int field219;

	@ObfuscatedName("client.pe")
	public int field222;

	@ObfuscatedName("client.re")
	public static int field224;

	@ObfuscatedName("client.we")
	public int field227;

	@ObfuscatedName("client.ze")
	public int field229;

	@ObfuscatedName("client.De")
	public int field233;

	@ObfuscatedName("client.Ee")
	public int field234;

	@ObfuscatedName("client.Ge")
	public int field236;

	@ObfuscatedName("client.He")
	public int field237;

	@ObfuscatedName("client.We")
	public int field250;

	@ObfuscatedName("client.Xe")
	public int field251;

	@ObfuscatedName("client.Ye")
	public int field252;

	@ObfuscatedName("client.df")
	public int field257;

	@ObfuscatedName("client.lf")
	public int field263;

	@ObfuscatedName("client.mf")
	public int field264;

	@ObfuscatedName("client.nf")
	public int field265;

	@ObfuscatedName("client.of")
	public int field266;

	@ObfuscatedName("client.sf")
	public int field270;

	@ObfuscatedName("client.tf")
	public int field271;

	@ObfuscatedName("client.uf")
	public int field272;

	@ObfuscatedName("client.yf")
	public int field275;

	@ObfuscatedName("client.Af")
	public int field277;

	@ObfuscatedName("client.Cf")
	public int field279;

	@ObfuscatedName("client.Df")
	public int field280;

	@ObfuscatedName("client.Ef")
	public int field281;

	@ObfuscatedName("client.Ff")
	public int field282;

	@ObfuscatedName("client.Gf")
	public static int field283;

	@ObfuscatedName("client.If")
	public int field285;

	@ObfuscatedName("client.Kf")
	public static int field287;

	@ObfuscatedName("client.Lf")
	public int field288;

	@ObfuscatedName("client.Nf")
	public int field289;

	@ObfuscatedName("client.fg")
	public int field306;

	@ObfuscatedName("client.jg")
	public int field309;

	@ObfuscatedName("client.Jg")
	public int field332;

	@ObfuscatedName("client.Ug")
	public int field343;

	@ObfuscatedName("client.Vg")
	public int field344;

	@ObfuscatedName("client.Wg")
	public int field345;

	@ObfuscatedName("client.hh")
	public int field353;

	@ObfuscatedName("client.jh")
	public int field355;

	@ObfuscatedName("client.kh")
	public int field356;

	@ObfuscatedName("client.lh")
	public int field357;

	@ObfuscatedName("client.mh")
	public int field358;

	@ObfuscatedName("client.nh")
	public int field359;

	@ObfuscatedName("client.oh")
	public int field360;

	@ObfuscatedName("client.qh")
	public int field361;

	@ObfuscatedName("client.zh")
	public static int field367;

	@ObfuscatedName("client.Ah")
	public int field368;

	@ObfuscatedName("client.Eh")
	public int field372;

	@ObfuscatedName("client.Gh")
	public int field373;

	@ObfuscatedName("client.Oh")
	public static int field381;

	@ObfuscatedName("client.Xh")
	public int field389;

	@ObfuscatedName("client.Zh")
	public int field391;

	@ObfuscatedName("client.ei")
	public int field393;

	@ObfuscatedName("client.fi")
	public int field394;

	@ObfuscatedName("client.gi")
	public int field395;

	@ObfuscatedName("client.ii")
	public int field397;

	@ObfuscatedName("client.ki")
	public int field399;

	@ObfuscatedName("client.mi")
	public int field401;

	@ObfuscatedName("client.ni")
	public int field402;

	@ObfuscatedName("client.oi")
	public int field403;

	@ObfuscatedName("client.pi")
	public int field404;

	@ObfuscatedName("client.qi")
	public int field405;

	@ObfuscatedName("client.ti")
	public int field407;

	@ObfuscatedName("client.ui")
	public int field408;

	@ObfuscatedName("client.Bi")
	public int field414;

	@ObfuscatedName("client.Di")
	public int field416;

	@ObfuscatedName("client.Ei")
	public int field417;

	@ObfuscatedName("client.Ni")
	public static int field425;

	@ObfuscatedName("client.Oi")
	public int field426;

	@ObfuscatedName("client.Pi")
	public int field427;

	@ObfuscatedName("client.Qi")
	public int field428;

	@ObfuscatedName("client.Ri")
	public int field429;

	@ObfuscatedName("client.Si")
	public int field430;

	@ObfuscatedName("client.bj")
	public int field435;

	@ObfuscatedName("client.cj")
	public static int field436;

	@ObfuscatedName("client.dj")
	public int field437;

	@ObfuscatedName("client.ej")
	public int field438;

	@ObfuscatedName("client.fj")
	public int field439;

	@ObfuscatedName("client.qj")
	public static int field450;

	@ObfuscatedName("client.sj")
	public int field452;

	@ObfuscatedName("client.wj")
	public int field456;

	@ObfuscatedName("client.xj")
	public int field457;

	@ObfuscatedName("client.Aj")
	public int field460;

	@ObfuscatedName("client.Bj")
	public int field461;

	@ObfuscatedName("client.Cj")
	public int field462;

	@ObfuscatedName("client.Ej")
	public int field464;

	@ObfuscatedName("client.Fj")
	public int field465;

	@ObfuscatedName("client.Gj")
	public int field466;

	@ObfuscatedName("client.Hj")
	public int field467;

	@ObfuscatedName("client.Ij")
	public int field468;

	@ObfuscatedName("client.Jj")
	public int field469;

	@ObfuscatedName("client.Kj")
	public int field470;

	@ObfuscatedName("client.Lj")
	public int field471;

	@ObfuscatedName("client.Mj")
	public int field472;

	@ObfuscatedName("client.Nj")
	public int field473;

	@ObfuscatedName("client.Oj")
	public int field474;

	@ObfuscatedName("client.Qj")
	public int field476;

	@ObfuscatedName("client.P")
	public int field62;

	@ObfuscatedName("client.Q")
	public int field63;

	@ObfuscatedName("client.R")
	public int field64;

	@ObfuscatedName("client.Z")
	public static int field70;

	@ObfuscatedName("client.lb")
	public int field82;

	@ObfuscatedName("client.ob")
	public int field83;

	@ObfuscatedName("client.pb")
	public int field84;

	@ObfuscatedName("client.qb")
	public int field85;

	@ObfuscatedName("client.rb")
	public int field86;

	@ObfuscatedName("client.sb")
	public int field87;

	@ObfuscatedName("client.tb")
	public int field88;

	@ObfuscatedName("client.vb")
	public int field90;

	@ObfuscatedName("client.Ab")
	public int field95;

	@ObfuscatedName("client.Qg")
	public long field339;

	@ObfuscatedName("client.xi")
	public long field411;

	@ObfuscatedName("client.Dj")
	public long field463;

	@ObfuscatedName("client.T")
	public long field65;

	@ObfuscatedName("client.V")
	public long field66;

	@ObfuscatedName("client.rf")
	public ABEJMBLI field269;

	@ObfuscatedName("client.Ze")
	public BFOGRMWS field253;

	@ObfuscatedName("client.af")
	public BFOGRMWS field254;

	@ObfuscatedName("client.bf")
	public BFOGRMWS field255;

	@ObfuscatedName("client.cf")
	public BFOGRMWS field256;

	@ObfuscatedName("client.rd")
	public CMDDPBTD field173;

	@ObfuscatedName("client.sd")
	public CMDDPBTD field174;

	@ObfuscatedName("client.td")
	public CMDDPBTD field175;

	@ObfuscatedName("client.ud")
	public CMDDPBTD field176;

	@ObfuscatedName("client.vd")
	public CMDDPBTD field177;

	@ObfuscatedName("client.wd")
	public CMDDPBTD field178;

	@ObfuscatedName("client.xd")
	public CMDDPBTD field179;

	@ObfuscatedName("client.yd")
	public CMDDPBTD field180;

	@ObfuscatedName("client.zd")
	public CMDDPBTD field181;

	@ObfuscatedName("client.ce")
	public CMDDPBTD field209;

	@ObfuscatedName("client.de")
	public CMDDPBTD field210;

	@ObfuscatedName("client.ee")
	public CMDDPBTD field211;

	@ObfuscatedName("client.fe")
	public CMDDPBTD field212;

	@ObfuscatedName("client.rg")
	public CMDDPBTD field315;

	@ObfuscatedName("client.sg")
	public CMDDPBTD field316;

	@ObfuscatedName("client.tg")
	public CMDDPBTD field317;

	@ObfuscatedName("client.ug")
	public CMDDPBTD field318;

	@ObfuscatedName("client.vg")
	public CMDDPBTD field319;

	@ObfuscatedName("client.wg")
	public CMDDPBTD field320;

	@ObfuscatedName("client.xg")
	public CMDDPBTD field321;

	@ObfuscatedName("client.yg")
	public CMDDPBTD field322;

	@ObfuscatedName("client.zg")
	public CMDDPBTD field323;

	@ObfuscatedName("client.Fi")
	public CMDDPBTD field418;

	@ObfuscatedName("client.Gi")
	public CMDDPBTD field419;

	@ObfuscatedName("client.Hi")
	public CMDDPBTD field420;

	@ObfuscatedName("client.kf")
	public CVNWKEAW field262;

	@ObfuscatedName("client.yc")
	public DNACUOZQ field134;

	@ObfuscatedName("client.zc")
	public DNACUOZQ field135;

	@ObfuscatedName("client.Ac")
	public DNACUOZQ field136;

	@ObfuscatedName("client.Bc")
	public DNACUOZQ field137;

	@ObfuscatedName("client.Cc")
	public DNACUOZQ field138;

	@ObfuscatedName("client.Se")
	public DNACUOZQ field246;

	@ObfuscatedName("client.Te")
	public DNACUOZQ field247;

	@ObfuscatedName("client.Ue")
	public DNACUOZQ field248;

	@ObfuscatedName("client.Mh")
	public DNACUOZQ field379;

	@ObfuscatedName("client.Nh")
	public DNACUOZQ field380;

	@ObfuscatedName("client.Qh")
	public DNACUOZQ field383;

	@ObfuscatedName("client.Rh")
	public DNACUOZQ field384;

	@ObfuscatedName("client.Sh")
	public DNACUOZQ field385;

	@ObfuscatedName("client.Th")
	public DNACUOZQ field386;

	@ObfuscatedName("client.Uh")
	public DNACUOZQ field387;

	@ObfuscatedName("client.Ii")
	public DNACUOZQ field421;

	@ObfuscatedName("client.Ji")
	public DNACUOZQ field422;

	@ObfuscatedName("client.Ki")
	public DNACUOZQ field423;

	@ObfuscatedName("client.Db")
	public DNACUOZQ field98;

	@ObfuscatedName("client.Eb")
	public DNACUOZQ field99;

	@ObfuscatedName("client.bh")
	public GLVCMXFQ field349;

	@ObfuscatedName("client.ub")
	public LAFREBFM field89;

	@ObfuscatedName("client.Cb")
	public static LAKHMHBY field97;

	@ObfuscatedName("client.Hf")
	public NIZPXICY field284;

	@ObfuscatedName("client.se")
	public TXSWXFHQ field225;

	@ObfuscatedName("client.fc")
	public VDSDFSIV field120;

	@ObfuscatedName("client.gc")
	public VDSDFSIV field121;

	@ObfuscatedName("client.bg")
	public VDSDFSIV field302;

	@ObfuscatedName("client.dg")
	public VDSDFSIV field304;

	@ObfuscatedName("client.eg")
	public VDSDFSIV field305;

	@ObfuscatedName("client.Lg")
	public VDSDFSIV field334;

	@ObfuscatedName("client.Mg")
	public VDSDFSIV field335;

	@ObfuscatedName("client.Ng")
	public VDSDFSIV field336;

	@ObfuscatedName("client.Og")
	public VDSDFSIV field337;

	@ObfuscatedName("client.Pg")
	public VDSDFSIV field338;

	@ObfuscatedName("client.vi")
	public VDSDFSIV field409;

	@ObfuscatedName("client.zi")
	public VDSDFSIV field412;

	@ObfuscatedName("client.Ai")
	public VDSDFSIV field413;

	@ObfuscatedName("client.cb")
	public VDSDFSIV field73;

	@ObfuscatedName("client.Dc")
	public String field139;

	@ObfuscatedName("client.pf")
	public String field267;

	@ObfuscatedName("client.Xg")
	public String field346;

	@ObfuscatedName("client.Ci")
	public String field415;

	@ObfuscatedName("client.ig")
	public Socket field308;

	@ObfuscatedName("client.Lc")
	public static boolean field146;

	@ObfuscatedName("client.cd")
	public static boolean field160;

	@ObfuscatedName("client.be")
	public static boolean field208;

	@ObfuscatedName("client.xb")
	public static boolean field92;

	@ObfuscatedName("client.Tb")
	public int[] field111;

	@ObfuscatedName("client.Ub")
	public int[] field112;

	@ObfuscatedName("client.Vb")
	public int[] field113;

	@ObfuscatedName("client.Ae")
	public int[] field230;

	@ObfuscatedName("client.Be")
	public int[] field231;

	@ObfuscatedName("client.Ne")
	public int[] field242;

	@ObfuscatedName("client.Oe")
	public int[] field243;

	@ObfuscatedName("client.Pe")
	public int[] field244;

	@ObfuscatedName("client.Qe")
	public int[] field245;

	@ObfuscatedName("client.lj")
	public int[] field445;

	@ObfuscatedName("client.mj")
	public int[] field446;

	@ObfuscatedName("client.nj")
	public int[] field447;

	@ObfuscatedName("client.uj")
	public int[] field454;

	@ObfuscatedName("client.vj")
	public int[] field455;

	@ObfuscatedName("client.W")
	public DNACUOZQ[] field67;

	@ObfuscatedName("client.Ch")
	public byte[][] field370;

	@ObfuscatedName("client.zj")
	public byte[][] field459;

	@ObfuscatedName("client.gj")
	public byte[][][] field440;

	@ObfuscatedName("client.og")
	public int[][][] field314;

	@ObfuscatedName("client.b(Z)V")
	public final void method34() {
		field379 = new DNACUOZQ(field262, "titlebox", 0);
		field380 = new DNACUOZQ(field262, "titlebutton", 0);
		field67 = new DNACUOZQ[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				field67[var2] = new DNACUOZQ(field262, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				field67[var3] = new DNACUOZQ(field262, "runes", (var3 & 0x3) + 12);
			}
		}

		field412 = new VDSDFSIV(128, 265);
		field413 = new VDSDFSIV(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			field412.field1338[var4] = field176.field477[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field413.field1338[var5] = field177.field477[var5];
		}

		field243 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			field243[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			field243[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			field243[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			field243[var9 + 192] = 0xFFFFFF;
		}

		field244 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			field244[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			field244[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			field244[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			field244[var13 + 192] = 0xFFFFFF;
		}

		field245 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			field245[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			field245[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			field245[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			field245[var17 + 192] = 0xFFFFFF;
		}

		field242 = new int[256];
		field230 = new int[32768];
		field231 = new int[32768];
		method113(null);
		field454 = new int[32768];
		field455 = new int[32768];
		method110("Connecting to fileserver", 10);

		if (!field127) {
			field232 = true;
			field127 = true;
			method93(this, 2);
		}
	}

	@ObfuscatedName("client.f(I)V")
	public final void method35() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				field454[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			field454[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				field455[var10] = (field454[var10 - 1] + field454[var10 + 1] + field454[var10 - 128] + field454[var10 + 128]) / 4;
			}
		}

		field437 += 128;
		if (field437 > field230.length) {
			field437 -= field230.length;
			int var11 = (int) (Math.random() * 12.0D);
			method113(field67[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = field455[var14 + 128] - field230[field437 + var14 & field230.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				field454[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			field240[var16] = field240[var16 + 1];
		}

		field240[var1 - 1] = (int) (Math.sin(field425 / 14.0D) * 16.0D + Math.sin(field425 / 15.0D) * 14.0D + Math.sin(field425 / 16.0D) * 12.0D);

		if (field438 > 0) {
			field438 -= 4;
		}

		if (field439 > 0) {
			field439 -= 4;
		}

		if (field438 == 0 && field439 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				field438 = 1024;
			}

			if (var17 == 1) {
				field439 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void method36() {
		signlink.reporterror = false;

		try {
			if (field269 != null) {
				field269.method1();
			}
		} catch (Exception var1) {
		}

		field269 = null;
		method64();

		if (field284 != null) {
			field284.field976 = false;
		}

		field284 = null;
		field225.method482();
		field225 = null;
		field191 = null;
		field132 = null;
		field124 = null;
		field328 = null;
		field111 = null;
		field459 = null;
		field370 = null;
		field112 = null;
		field113 = null;
		field314 = null;
		field440 = null;
		field349 = null;
		field326 = null;
		field228 = null;
		field182 = null;
		field116 = null;
		field117 = null;
		field371 = null;
		field209 = null;
		field210 = null;
		field211 = null;
		field212 = null;
		field418 = null;
		field419 = null;
		field420 = null;
		field315 = null;
		field316 = null;
		field317 = null;
		field318 = null;
		field319 = null;
		field320 = null;
		field321 = null;
		field322 = null;
		field323 = null;
		field246 = null;
		field247 = null;
		field248 = null;
		field421 = null;
		field422 = null;
		field423 = null;
		field118 = null;
		field134 = null;
		field135 = null;
		field136 = null;
		field137 = null;
		field138 = null;
		field383 = null;
		field384 = null;
		field385 = null;
		field386 = null;
		field387 = null;
		field302 = null;
		field94 = null;
		field434 = null;
		field410 = null;
		field334 = null;
		field335 = null;
		field336 = null;
		field337 = null;
		field338 = null;
		field365 = null;
		field313 = null;
		field274 = null;
		field216 = null;
		field218 = null;
		field220 = null;
		field221 = null;
		field223 = null;
		field192 = null;
		field194 = null;
		field235 = null;
		field301 = null;
		field58 = null;
		field249 = null;
		field441 = null;
		field442 = null;
		field443 = null;
		field444 = null;
		field125 = null;
		field342 = null;
		field142 = null;
		field143 = null;
		field78 = null;
		field409 = null;
		field226 = null;
		field331 = null;
		field100 = null;
		field176 = null;
		field177 = null;
		field173 = null;
		field174 = null;
		field175 = null;
		field178 = null;
		field179 = null;
		field180 = null;
		field181 = null;
		method69();
		SCWSBSIM.method468();
		HQFMWUSH.method310();
		HMRHACIQ.method296();
		ECSVNCGM.field552 = null;
		NRGHMRLX.field1015 = null;
		PFVGIFDY.field1078 = null;
		EOXZIOSL.field571 = null;
		NMXKUYSC.field998 = null;
		FULHVSIU.field604 = null;
		FULHVSIU.field616 = null;
		NJBQYBAL.field983 = null;
		field689 = null;
		LAKHMHBY.field943 = null;
		OIDJTTQC.method431();
		GLVCMXFQ.method232();
		KPUOCBCE.method375();
		ZNUJPBQV.method583();
		System.gc();
	}

	@ObfuscatedName("client.g(I)Z")
	public final boolean method37() {
		if (field269 == null) {
			return false;
		}

		try {
			int var1 = field269.method3();
			if (var1 == 0) {
				return false;
			}

			if (field465 == -1) {
				field269.method4(field328.field1366, 0, 1);
				field465 = field328.field1366[0] & 0xFF;
				if (field89 != null) {
					field465 = field465 - field89.method405() & 0xFF;
				}

				field464 = ZFOONWXI.field1418[field465];
				var1--;
			}

			if (field464 == -1) {
				if (var1 <= 0) {
					return false;
				}

				field269.method4(field328.field1366, 0, 1);
				field464 = field328.field1366[0] & 0xFF;
				var1--;
			}

			if (field464 == -2) {
				if (var1 <= 1) {
					return false;
				}

				field269.method4(field328.field1366, 0, 2);
				field328.field1367 = 0;
				field464 = field328.method523();
				var1 -= 2;
			}

			if (var1 < field464) {
				return false;
			}

			field328.field1367 = 0;
			field269.method4(field328.field1366, 0, field464);
			field466 = 0;
			field462 = field461;
			field461 = field460;
			field460 = field465;

			if (field465 == 47) {
				int var2 = field328.method551();
				int var3 = field328.method524();
				int var4 = field328.method523();
				PFVGIFDY var5 = PFVGIFDY.field1078[var4];
				var5.field1097 = var3;
				var5.field1076 = var2;
				field465 = -1;
				return true;
			}

			if (field465 == 177) {
				field388 = true;
				field355 = field328.method521();
				field356 = field328.method521();
				field357 = field328.method523();
				field358 = field328.method521();
				field359 = field328.method521();
				if (field359 >= 100) {
					field426 = field355 * 128 + 64;
					field428 = field356 * 128 + 64;
					field427 = method119(field105, field428, field426) - field357;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 53) {
				int var6 = field328.method523();
				method87(var6);

				if (field382 != -1) {
					field382 = -1;
					field431 = true;
					field140 = true;
				}

				if (field299 != -1) {
					field299 = -1;
					field195 = true;
				}

				if (field122 != 0) {
					field122 = 0;
					field195 = true;
				}

				field392 = var6;
				field77 = false;
				field465 = -1;
				return true;
			}

			if (field465 == 134) {
				field431 = true;
				int var7 = field328.method523();
				PFVGIFDY var8 = PFVGIFDY.field1078[var7];
				while (field328.field1367 < field464) {
					int var9 = field328.method535();
					int var10 = field328.method523();
					int var11 = field328.method521();
					if (var11 == 255) {
						var11 = field328.method526();
					}

					if (var9 >= 0 && var9 < var8.field1104.length) {
						var8.field1104[var9] = var10;
						var8.field1100[var9] = var11;
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 15) {
				int var12 = field328.method524();
				int var13 = field328.method548();
				PFVGIFDY var14 = PFVGIFDY.field1078[var13];
				var14.field1129 = var12;

				if (var12 == -1) {
					var14.field1126 = 0;
					var14.field1072 = 0;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 239) {
				int var15 = field328.method548();
				int var16 = field328.method549();
				PFVGIFDY.field1078[var15].field1084 = 2;
				PFVGIFDY.field1078[var15].field1085 = var16;
				field465 = -1;
				return true;
			}

			if (field465 == 82) {
				int var17 = field328.method552();
				field327 = var17;
				field195 = true;
				field465 = -1;
				return true;
			}

			if (field465 == 132) {
				if (field333 == 12) {
					field431 = true;
				}

				field285 = field328.method524();
				field465 = -1;
				return true;
			}

			if (field465 == 244) {
				field172 = field328.method521();
				field414 = field328.method521();
				field156 = field328.method521();
				field366 = true;
				field195 = true;
				field465 = -1;
				return true;
			}

			if (field465 == 136) {
				field431 = true;
				int var18 = field328.method521();
				int var19 = field328.method521();
				int var20 = field328.method526();
				field310[var18] = var20;
				field68[var18] = var19;
				field241[var18] = 1;
				for (int var21 = 0; var21 < 98; var21++) {
					if (var20 >= field114[var21]) {
						field241[var18] = var21 + 2;
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 17) {
				int var22 = field328.method550();
				byte var23 = field328.method542();
				field448[var22] = var23;

				if (field342[var22] != var23) {
					field342[var22] = var23;
					method165(var22);
					field431 = true;

					if (field327 != -1) {
						field195 = true;
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 76) {
				field207 = field464 / 8;
				for (int var24 = 0; var24 < field207; var24++) {
					field57[var24] = field328.method527();
				}

				field465 = -1;
				return true;
			}

			if (field465 == 233) {
				field144 = false;
				field122 = 2;
				field103 = "";
				field195 = true;
				field465 = -1;
				return true;
			}

			if (field465 == 237) {
				field469 = field328.method548() * 30;
				field465 = -1;
				return true;
			}

			if (field465 == 25) {
				field71 = field328.method549();
				field372 = field328.method541();
				field465 = -1;
				return true;
			}

			if (field465 == 77) {
				int var25 = field328.method523();
				method87(var25);

				if (field299 != -1) {
					field299 = -1;
					field195 = true;
				}

				if (field122 != 0) {
					field122 = 0;
					field195 = true;
				}

				field382 = var25;
				field431 = true;
				field140 = true;
				field392 = -1;
				field77 = false;
				field465 = -1;
				return true;
			}

			if (field465 == 94) {
				int var26 = field328.method548();
				if (var26 == 0xFFFF) {
					var26 = -1;
				}

				if (field239 != var26 && field155 && !field160 && field190 == 0) {
					field397 = var26;
					field398 = true;
					field225.method478(2, field397);
				}

				field239 = var26;
				field465 = -1;
				return true;
			}

			if (field465 == 159) {
				int var27 = field328.method523();
				int var28 = field328.method548();
				if (field155 && !field160) {
					field397 = var27;
					field398 = false;
					field225.method478(2, field397);
					field190 = var28;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 56) {
				field431 = true;
				int var29 = field328.method523();
				PFVGIFDY var30 = PFVGIFDY.field1078[var29];
				int var31 = field328.method523();
				for (int var32 = 0; var32 < var31; var32++) {
					int var33 = field328.method540();
					if (var33 == 255) {
						var33 = field328.method554();
					}

					var30.field1104[var32] = field328.method523();
					var30.field1100[var32] = var33;
				}

				for (int var34 = var31; var34 < var30.field1104.length; var34++) {
					var30.field1104[var34] = 0;
					var30.field1100[var34] = 0;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 37) {
				String var35 = field328.method528();
				int var36 = field328.method550();
				PFVGIFDY.field1078[var36].field1106 = var35;

				if (field81[field333] == PFVGIFDY.field1078[var36].field1073) {
					field431 = true;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 167) {
				field144 = false;
				field122 = 1;
				field103 = "";
				field195 = true;
				field465 = -1;
				return true;
			}

			if (field465 == 139) {
				int var37 = field328.method549();
				int var38 = field328.method539();

				if (var37 == 0xFFFF) {
					var37 = -1;
				}

				field81[var38] = var37;
				field431 = true;
				field140 = true;
				field465 = -1;
				return true;
			}

			if (field465 == 157) {
				field251 = field328.method541();
				field250 = field328.method540();
				field465 = -1;
				return true;
			}

			if (field465 == 58) {
				int var39 = field328.method549();
				int var40 = field328.method548();
				int var41 = field328.method550();
				int var42 = field328.method550();
				PFVGIFDY.field1078[var41].field1121 = var40;
				PFVGIFDY.field1078[var41].field1122 = var39;
				PFVGIFDY.field1078[var41].field1120 = var42;
				field465 = -1;
				return true;
			}

			if (field465 == 101) {
				int var43 = field328.method521();
				int var44 = field328.method521();
				int var45 = field328.method521();
				int var46 = field328.method521();
				field377[var43] = true;
				field60[var43] = var44;
				field311[var43] = var45;
				field259[var43] = var46;
				field354[var43] = 0;
				field465 = -1;
				return true;
			}

			if (field465 == 50) {
				field388 = true;
				field84 = field328.method521();
				field85 = field328.method521();
				field86 = field328.method523();
				field87 = field328.method521();
				field88 = field328.method521();
				if (field88 >= 100) {
					int var47 = field84 * 128 + 64;
					int var48 = field85 * 128 + 64;
					int var49 = method119(field105, var48, var47) - field86;
					int var50 = var47 - field426;
					int var51 = var49 - field427;
					int var52 = var48 - field428;
					int var53 = (int) Math.sqrt(var50 * var50 + var52 * var52);
					field429 = (int) (Math.atan2(var51, var53) * 325.949D) & 0x7FF;
					field430 = (int) (Math.atan2(var50, var52) * -325.949D) & 0x7FF;

					if (field429 < 128) {
						field429 = 128;
					}

					if (field429 > 383) {
						field429 = 383;
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 192) {
				field250 = field328.method539();
				field251 = field328.method539();

				while (field328.field1367 < field464) {
					int var54 = field328.method521();
					method54(var54, field328);
				}

				field465 = -1;
				return true;
			}

			if (field465 == 89) {
				field333 = field328.method540();
				field431 = true;
				field140 = true;
				field465 = -1;
				return true;
			}

			if (field465 == 121) {
				for (int var55 = 0; var55 < field342.length; var55++) {
					if (field448[var55] != field342[var55]) {
						field342[var55] = field448[var55];
						method165(var55);
						field431 = true;
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 92) {
				field389 = field328.method548();
				field270 = field328.method556();
				field82 = field328.method539();
				field332 = field328.method540();
				field161 = field328.method548();

				if (field270 != 0 && field392 == -1) {
					signlink.dnslookup(YBENSMAZ.method566(field270));
					method94();
					short var56 = 650;
					if (field82 != 201 || field332 == 1) {
						var56 = 655;
					}

					field128 = "";
					field96 = false;

					for (int var57 = 0; var57 < PFVGIFDY.field1078.length; var57++) {
						if (PFVGIFDY.field1078[var57] != null && PFVGIFDY.field1078[var57].field1094 == var56) {
							field392 = PFVGIFDY.field1078[var57].field1073;
							break;
						}
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 145) {
				field170 = field328.method521();
				field431 = true;
				field465 = -1;
				return true;
			}

			if (field465 == 100) {
				long var58 = field328.method527();
				int var60 = field328.method526();
				int var61 = field328.method521();
				boolean var62 = false;
				for (int var63 = 0; var63 < 100; var63++) {
					if (field76[var63] == var60) {
						var62 = true;
						break;
					}
				}

				if (var61 <= 1) {
					for (int var64 = 0; var64 < field207; var64++) {
						if (field57[var64] == var58) {
							var62 = true;
							break;
						}
					}
				}

				if (!var62 && field417 == 0) {
					try {
						field76[field90] = var60;
						field90 = (field90 + 1) % 100;
						String var65 = EEYZEKLH.method216(field328, field464 - 13);
						if (var61 != 3) {
							var65 = IVFROAJT.method347(var65);
						}

						if (var61 == 2 || var61 == 3) {
							method100("@cr2@" + YBENSMAZ.method567(YBENSMAZ.method564(var58)), 7, var65);
						} else if (var61 == 1) {
							method100("@cr1@" + YBENSMAZ.method567(YBENSMAZ.method564(var58)), 7, var65);
						} else {
							method100(YBENSMAZ.method567(YBENSMAZ.method564(var58)), 3, var65);
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 3) {
				int var67 = field328.method523();
				int var68 = field328.method521();
				int var69 = field328.method523();
				if (field433 && !field160 && field102 < 50) {
					field153[field102] = var67;
					field189[field102] = var68;
					field238[field102] = ZTSFQLLW.field1477[var67] + var69;
					field102++;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 108) {
				String var70 = field328.method528();
				int var71 = field328.method539();
				int var72 = field328.method539();
				if (var72 >= 1 && var72 <= 5) {
					if (var70.equalsIgnoreCase("null")) {
						var70 = null;
					}

					field340[var72 - 1] = var70;
					field341[var72 - 1] = var71 == 0;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 104) {
				int var73 = field328.method523();
				int var74 = field328.method550();
				PFVGIFDY.field1078[var73].field1084 = 1;
				PFVGIFDY.field1078[var73].field1085 = var74;
				field465 = -1;
				return true;
			}

			if (field465 == 169) {
				int var75 = field328.method554();
				int var76 = field328.method549();
				field448[var76] = var75;

				if (field342[var76] != var75) {
					field342[var76] = var75;
					method165(var76);
					field431 = true;

					if (field327 != -1) {
						field195 = true;
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 243) {
				if (field382 != -1) {
					field382 = -1;
					field431 = true;
					field140 = true;
				}

				if (field299 != -1) {
					field299 = -1;
					field195 = true;
				}

				if (field122 != 0) {
					field122 = 0;
					field195 = true;
				}

				field392 = -1;
				field77 = false;
				field465 = -1;
				return true;
			}

			if (field465 == 65) {
				if (field333 == 12) {
					field431 = true;
				}

				field123 = field328.method521();
				field465 = -1;
				return true;
			}

			if (field465 == 28) {
				int var77 = field328.method550();
				PFVGIFDY var78 = PFVGIFDY.field1078[var77];
				for (int var79 = 0; var79 < var78.field1104.length; var79++) {
					var78.field1104[var79] = -1;
					var78.field1104[var79] = 0;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 188) {
				field251 = field328.method541();
				field250 = field328.method540();
				for (int var80 = field250; var80 < field250 + 8; var80++) {
					for (int var81 = field251; var81 < field251 + 8; var81++) {
						if (field235[field105][var80][var81] != null) {
							field235[field105][var80][var81] = null;
							method136(var80, var81);
						}
					}
				}

				for (IRATNZCY var82 = (IRATNZCY) field301.method332(); var82 != null; var82 = (IRATNZCY) field301.method334()) {
					if (var82.field832 >= field250 && var82.field832 < field250 + 8 && var82.field833 >= field251 && var82.field833 < field251 + 8 && field105 == var82.field830) {
						var82.field834 = 0;
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 175) {
				method96();
				field465 = -1;
				return false;
			}

			if (field465 == 42 || field465 == 210 || field465 == 57 || field465 == 156 || field465 == 143 || field465 == 75 || field465 == 149 || field465 == 6 || field465 == 247 || field465 == 112 || field465 == 88) {
				method54(field465, field328);
				field465 = -1;
				return true;
			}

			if (field465 == 126) {
				method121(field328, field464);
				field465 = -1;
				return true;
			}

			if (field465 == 30) {
				int var83 = field328.method549();
				int var84 = field328.method523();
				PFVGIFDY var85 = PFVGIFDY.field1078[var83];
				if (var85 != null && var85.field1092 == 0) {
					if (var84 < 0) {
						var84 = 0;
					}

					if (var84 > var85.field1113 - var85.field1077) {
						var84 = var85.field1113 - var85.field1077;
					}

					var85.field1118 = var84;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 170 || field465 == 245) {
				int var86 = field233;
				int var87 = field234;
				if (field465 == 170) {
					var87 = field328.method550();
					var86 = field328.method548();
					field329 = false;
				}

				if (field465 == 245) {
					var86 = field328.method523();
					var87 = field328.method550();
					field328.method531();

					for (int var88 = 0; var88 < 4; var88++) {
						for (int var89 = 0; var89 < 13; var89++) {
							for (int var90 = 0; var90 < 13; var90++) {
								int var91 = field328.method532(1);
								if (var91 == 1) {
									field268[var88][var89][var90] = field328.method532(26);
								} else {
									field268[var88][var89][var90] = -1;
								}
							}
						}
					}

					field328.method533();
					field329 = true;
				}

				if (field233 == var86 && field234 == var87 && field252 == 2) {
					field465 = -1;
					return true;
				}

				field233 = var86;
				field234 = var87;
				field184 = (field233 - 6) * 8;
				field185 = (field234 - 6) * 8;
				field93 = false;
				if ((field233 / 8 == 48 || field233 / 8 == 49) && field234 / 8 == 48) {
					field93 = true;
				}

				if (field233 / 8 == 48 && field234 / 8 == 148) {
					field93 = true;
				}

				field252 = 1;
				field66 = System.currentTimeMillis();
				field211.method176();
				field254.method15(151, 257, 0, "Loading - please wait.");
				field254.method15(150, 256, 0xFFFFFF, "Loading - please wait.");
				field211.method177(4, field688, 4);

				if (field465 == 170) {
					int var92 = 0;
					for (int var93 = (field233 - 6) / 8; var93 <= (field233 + 6) / 8; var93++) {
						for (int var94 = (field234 - 6) / 8; var94 <= (field234 + 6) / 8; var94++) {
							var92++;
						}
					}

					field459 = new byte[var92][];
					field370 = new byte[var92][];
					field111 = new int[var92];
					field112 = new int[var92];
					field113 = new int[var92];
					int var95 = 0;
					for (int var96 = (field233 - 6) / 8; var96 <= (field233 + 6) / 8; var96++) {
						for (int var97 = (field234 - 6) / 8; var97 <= (field234 + 6) / 8; var97++) {
							field111[var95] = (var96 << 8) + var97;

							if (field93 && (var97 == 49 || var97 == 149 || var97 == 147 || var96 == 50 || var96 == 49 && var97 == 47)) {
								field112[var95] = -1;
								field113[var95] = -1;
								var95++;
							} else {
								int var98 = field112[var95] = field225.method475(var97, var96, 0);
								if (var98 != -1) {
									field225.method478(3, var98);
								}

								int var99 = field113[var95] = field225.method475(var97, var96, 1);
								if (var99 != -1) {
									field225.method478(3, var99);
								}

								var95++;
							}
						}
					}
				}

				if (field465 == 245) {
					int var100 = 0;
					int[] var101 = new int[676];
					for (int var102 = 0; var102 < 4; var102++) {
						for (int var103 = 0; var103 < 13; var103++) {
							for (int var104 = 0; var104 < 13; var104++) {
								int var105 = field268[var102][var103][var104];
								if (var105 != -1) {
									int var106 = var105 >> 14 & 0x3FF;
									int var107 = var105 >> 3 & 0x7FF;
									int var108 = (var106 / 8 << 8) + var107 / 8;
									for (int var109 = 0; var109 < var100; var109++) {
										if (var101[var109] == var108) {
											var108 = -1;
											break;
										}
									}

									if (var108 != -1) {
										var101[var100++] = var108;
									}
								}
							}
						}
					}

					field459 = new byte[var100][];
					field370 = new byte[var100][];
					field111 = new int[var100];
					field112 = new int[var100];
					field113 = new int[var100];
					for (int var110 = 0; var110 < var100; var110++) {
						int var111 = field111[var110] = var101[var110];
						int var112 = var111 >> 8 & 0xFF;
						int var113 = var111 & 0xFF;
						int var114 = field112[var110] = field225.method475(var113, var112, 0);
						if (var114 != -1) {
							field225.method478(3, var114);
						}

						int var115 = field113[var110] = field225.method475(var113, var112, 1);
						if (var115 != -1) {
							field225.method478(3, var115);
						}
					}
				}

				int var116 = field184 - field186;
				int var117 = field185 - field187;
				field186 = field184;
				field187 = field185;

				for (int var118 = 0; var118 < 16384; var118++) {
					AVKLDTFF var119 = field192[var118];
					if (var119 != null) {
						for (int var120 = 0; var120 < 10; var120++) {
							var119.field1192[var120] -= var116;
							var119.field1193[var120] -= var117;
						}

						var119.field1157 -= var116 * 128;
						var119.field1158 -= var117 * 128;
					}
				}

				for (int var121 = 0; var121 < field214; var121++) {
					LAKHMHBY var122 = field216[var121];
					if (var122 != null) {
						for (int var123 = 0; var123 < 10; var123++) {
							var122.field1192[var123] -= var116;
							var122.field1193[var123] -= var117;
						}

						var122.field1157 -= var116 * 128;
						var122.field1158 -= var117 * 128;
					}
				}

				field213 = true;
				byte var124 = 0;
				byte var125 = 104;
				byte var126 = 1;
				if (var116 < 0) {
					var124 = 103;
					var125 = -1;
					var126 = -1;
				}

				byte var127 = 0;
				byte var128 = 104;
				byte var129 = 1;
				if (var117 < 0) {
					var127 = 103;
					var128 = -1;
					var129 = -1;
				}

				for (int var130 = var124; var130 != var125; var130 += var126) {
					for (int var131 = var127; var131 != var128; var131 += var129) {
						int var132 = var116 + var130;
						int var133 = var117 + var131;
						for (int var134 = 0; var134 < 4; var134++) {
							if (var132 >= 0 && var133 >= 0 && var132 < 104 && var133 < 104) {
								field235[var134][var130][var131] = field235[var134][var132][var133];
							} else {
								field235[var134][var130][var131] = null;
							}
						}
					}
				}

				for (IRATNZCY var135 = (IRATNZCY) field301.method332(); var135 != null; var135 = (IRATNZCY) field301.method334()) {
					var135.field832 -= var116;
					var135.field833 -= var117;
					if (var135.field832 < 0 || var135.field833 < 0 || var135.field832 >= 104 || var135.field833 >= 104) {
						var135.method471();
					}
				}

				if (field407 != 0) {
					field407 -= var116;
					field408 -= var117;
				}

				field388 = false;
				field465 = -1;
				return true;
			}

			if (field465 == 253) {
				int var136 = field328.method549();
				int var137 = field328.method523();

				if (field299 != -1) {
					field299 = -1;
					field195 = true;
				}

				if (field122 != 0) {
					field122 = 0;
					field195 = true;
				}

				field392 = var137;
				field382 = var136;
				field431 = true;
				field140 = true;
				field77 = false;
				field465 = -1;
				return true;
			}

			if (field465 == 217) {
				method65(field328, field464);
				field213 = false;
				field465 = -1;
				return true;
			}

			if (field465 == 179) {
				field151 = field328.method521();
				field465 = -1;
				return true;
			}

			if (field465 == 255) {
				field407 = 0;
				field465 = -1;
				return true;
			}

			if (field465 == 102) {
				field107 = field328.method521();
				field465 = -1;
				return true;
			}

			if (field465 == 41) {
				int var138 = field328.method548();
				boolean var139 = field328.method541() == 1;
				PFVGIFDY.field1078[var138].field1086 = var139;
				field465 = -1;
				return true;
			}

			if (field465 == 158) {
				String var140 = field328.method528();
				if (var140.endsWith(":tradereq:")) {
					String var141 = var140.substring(0, var140.indexOf(":"));
					long var142 = YBENSMAZ.method563(var141);
					boolean var144 = false;
					for (int var145 = 0; var145 < field207; var145++) {
						if (field57[var145] == var142) {
							var144 = true;
							break;
						}
					}

					if (!var144 && field417 == 0) {
						method100(var141, 4, "wishes to trade with you.");
					}
				} else if (var140.endsWith(":duelreq:")) {
					String var146 = var140.substring(0, var140.indexOf(":"));
					long var147 = YBENSMAZ.method563(var146);
					boolean var149 = false;
					for (int var150 = 0; var150 < field207; var150++) {
						if (field57[var150] == var147) {
							var149 = true;
							break;
						}
					}

					if (!var149 && field417 == 0) {
						method100(var146, 8, "wishes to duel with you.");
					}
				} else if (var140.endsWith(":chalreq:")) {
					String var151 = var140.substring(0, var140.indexOf(":"));
					long var152 = YBENSMAZ.method563(var151);
					boolean var154 = false;
					for (int var155 = 0; var155 < field207; var155++) {
						if (field57[var155] == var152) {
							var154 = true;
							break;
						}
					}

					if (!var154 && field417 == 0) {
						String var156 = var140.substring(var140.indexOf(":") + 1, var140.length() - 9);
						method100(var151, 8, var156);
					}
				} else {
					method100("", 0, var140);
				}

				field465 = -1;
				return true;
			}

			if (field465 == 224) {
				long var157 = field328.method527();
				int var159 = field328.method521();
				String var160 = YBENSMAZ.method567(YBENSMAZ.method564(var157));
				for (int var161 = 0; var161 < field169; var161++) {
					if (field331[var161] == var157) {
						if (field100[var161] != var159) {
							field100[var161] = var159;
							field431 = true;

							if (var159 > 0) {
								method100("", 5, var160 + " has logged in.");
							}

							if (var159 == 0) {
								method100("", 5, var160 + " has logged out.");
							}
						}

						var160 = null;
						break;
					}
				}

				if (var160 != null && field169 < 200) {
					field331[field169] = var157;
					field226[field169] = var160;
					field100[field169] = var159;
					field169++;
					field431 = true;
				}

				boolean var162 = false;
				while (!var162) {
					var162 = true;
					for (int var163 = 0; var163 < field169 - 1; var163++) {
						if (field100[var163] != field157 && field100[var163 + 1] == field157 || field100[var163] == 0 && field100[var163 + 1] != 0) {
							int var164 = field100[var163];
							field100[var163] = field100[var163 + 1];
							field100[var163 + 1] = var164;
							String var165 = field226[var163];
							field226[var163] = field226[var163 + 1];
							field226[var163 + 1] = var165;
							long var166 = field331[var163];
							field331[var163] = field331[var163 + 1];
							field331[var163 + 1] = var166;
							field431 = true;
							var162 = false;
						}
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 171) {
				int var168 = field328.method550();
				PFVGIFDY.field1078[var168].field1084 = 3;

				if (field97.field944 == null) {
					PFVGIFDY.field1078[var168].field1085 = (field97.field942[11] << 5) + (field97.field942[8] << 10) + (field97.field942[0] << 15) + (field97.field959[0] << 25) + (field97.field959[4] << 20) + field97.field942[1];
				} else {
					PFVGIFDY.field1078[var168].field1085 = (int) (field97.field944.field781 + 0x12345678L);
				}

				field465 = -1;
				return true;
			}

			if (field465 == 97) {
				field388 = false;

				for (int var169 = 0; var169 < 5; var169++) {
					field377[var169] = false;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 182) {
				int var170 = field328.method548();
				method87(var170);

				if (field382 != -1) {
					field382 = -1;
					field431 = true;
					field140 = true;
				}

				field299 = var170;
				field195 = true;
				field392 = -1;
				field77 = false;
				field465 = -1;
				return true;
			}

			if (field465 == 79) {
				field330 = field328.method539();
				if (field333 == field330) {
					if (field330 == 3) {
						field333 = 1;
					} else {
						field333 = 3;
					}

					field431 = true;
				}

				field465 = -1;
				return true;
			}

			if (field465 == 125) {
				int var171 = field328.method549();
				int var172 = field328.method550();
				int var173 = var172 >> 10 & 0x1F;
				int var174 = var172 >> 5 & 0x1F;
				int var175 = var172 & 0x1F;
				PFVGIFDY.field1078[var171].field1095 = (var175 << 3) + (var173 << 19) + (var174 << 11);
				field465 = -1;
				return true;
			}

			if (field465 == 208) {
				field257 = field328.method521();
				if (field257 == 1) {
					field360 = field328.method523();
				}

				if (field257 >= 2 && field257 <= 6) {
					if (field257 == 2) {
						field165 = 64;
						field166 = 64;
					}

					if (field257 == 3) {
						field165 = 0;
						field166 = 64;
					}

					if (field257 == 4) {
						field165 = 128;
						field166 = 64;
					}

					if (field257 == 5) {
						field165 = 64;
						field166 = 0;
					}

					if (field257 == 6) {
						field165 = 64;
						field166 = 128;
					}

					field257 = 2;
					field162 = field328.method523();
					field163 = field328.method523();
					field164 = field328.method521();
				}

				if (field257 == 10) {
					field399 = field328.method523();
				}

				field465 = -1;
				return true;
			}

			if (field465 == 55) {
				int var176 = field328.method523();
				int var177 = field328.method550();
				int var178 = field328.method523();
				if (var178 == 0xFFFF) {
					PFVGIFDY.field1078[var176].field1084 = 0;
					field465 = -1;
					return true;
				}

				HMRHACIQ var179 = HMRHACIQ.method293(var178);
				PFVGIFDY.field1078[var176].field1084 = 4;
				PFVGIFDY.field1078[var176].field1085 = var178;
				PFVGIFDY.field1078[var176].field1121 = var179.field723;
				PFVGIFDY.field1078[var176].field1122 = var179.field713;
				PFVGIFDY.field1078[var176].field1120 = var179.field721 * 100 / var177;
				field465 = -1;
				return true;
			}

			if (field465 == 87) {
				for (int var180 = 0; var180 < field216.length; var180++) {
					if (field216[var180] != null) {
						field216[var180].field1151 = -1;
					}
				}

				for (int var181 = 0; var181 < field192.length; var181++) {
					if (field192[var181] != null) {
						field192[var181].field1151 = -1;
					}
				}

				field465 = -1;
				return true;
			}

			if (field465 == 184) {
				int var182 = field328.method524();
				if (var182 >= 0) {
					method87(var182);
				}

				field390 = var182;
				field465 = -1;
				return true;
			}

			signlink.reporterror("T1 - " + field465 + "," + field464 + " - " + field461 + "," + field462);
			method96();
		} catch (IOException var187) {
			method118();
		} catch (Exception var188) {
			String var184 = "T2 - " + field465 + "," + field461 + "," + field462 + " - " + field464 + "," + (field97.field1192[0] + field184) + "," + (field97.field1193[0] + field185) + " - ";
			for (int var185 = 0; var185 < field464 && var185 < 50; var185++) {
				var184 = var184 + field328.field1366[var185] + ",";
			}

			signlink.reporterror(var184);
			method96();
		}

		return true;
	}

	@ObfuscatedName("client.h(I)V")
	public final void method38() {
		field353++;
		method91(true);
		method58(true);
		method91(false);
		method58(false);
		method131();
		method155();

		if (!field388) {
			int var1 = field61;
			if (field110 / 256 > var1) {
				var1 = field110 / 256;
			}

			if (field377[4] && field311[4] + 128 > var1) {
				var1 = field311[4] + 128;
			}

			int var2 = field62 + field272 & 0x7FF;
			method52(method119(field105, field97.field1158, field97.field1157) - 50, var2, field394, var1 * 3 + 600, var1, field393);
		}

		int var3;
		if (field388) {
			var3 = method57();
		} else {
			var3 = method56();
		}

		int var4 = field426;
		int var5 = field427;
		int var6 = field428;
		int var7 = field429;
		int var8 = field430;

		for (int var9 = 0; var9 < 5; var9++) {
			if (field377[var9]) {
				int var10 = (int) (Math.random() * (field60[var9] * 2 + 1) + Math.sin(field259[var9] / 100.0D * field354[var9]) * field311[var9] - field60[var9]);
				if (var9 == 0) {
					field426 += var10;
				}

				if (var9 == 1) {
					field427 += var10;
				}

				if (var9 == 2) {
					field428 += var10;
				}

				if (var9 == 3) {
					field430 = field430 + var10 & 0x7FF;
				}

				if (var9 == 4) {
					field429 += var10;
					if (field429 < 128) {
						field429 = 128;
					}

					if (field429 > 383) {
						field429 = 383;
					}
				}
			}
		}

		int var11 = OIDJTTQC.field1069;
		KPUOCBCE.field915 = true;
		KPUOCBCE.field918 = 0;
		KPUOCBCE.field916 = field696 - 4;
		KPUOCBCE.field917 = field697 - 4;
		IIPNJDNO.method320();
		field349.method272(field430, field426, field428, var3, field427, field429);
		field349.method247();
		method157();
		method72();
		method60(var11);
		method132();
		field211.method177(4, field688, 4);
		field426 = var4;
		field427 = var5;
		field428 = var6;
		field429 = var7;
		field430 = var8;
	}

	@ObfuscatedName("client.b(B)V")
	public final void method39() {
		if (field126 != 0) {
			int var1 = 0;
			if (field469 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (field364[var2] != null) {
					int var3 = field362[var2];
					String var4 = field363[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || field414 == 0 || field414 == 1 && method161(var4))) {
						int var8 = 329 - var1 * 13;
						if (field696 > 4 && field697 - 4 > var8 - 10 && field697 - 4 <= var8 + 3) {
							int var9 = field254.method17("From:  " + var4 + field364[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (field696 < var9 + 4) {
								if (field275 >= 1) {
									field125[field416] = "Report abuse @whi@" + var4;
									field443[field416] = 2423;
									field416++;
								}

								field125[field416] = "Add ignore @whi@" + var4;
								field443[field416] = 2400;
								field416++;
								field125[field416] = "Add friend @whi@" + var4;
								field443[field416] = 2290;
								field416++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && field414 < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method40(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * var4 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(LLAKHMHBY;IBII)V")
	public final void method41(LAKHMHBY arg0, int arg1, int arg2, int arg3) {
		if (field97 != arg0 && field416 < 400) {
			String var5;
			if (arg0.field956 == 0) {
				var5 = arg0.field960 + method129(field97.field955, arg0.field955) + " (level-" + arg0.field955 + ")";
			} else {
				var5 = arg0.field960 + " (skill-" + arg0.field956 + ")";
			}

			if (field263 == 1) {
				field125[field416] = "Use " + field267 + " with @whi@" + var5;
				field443[field416] = 978;
				field444[field416] = arg3;
				field441[field416] = arg2;
				field442[field416] = arg1;
				field416++;
			} else if (field343 != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (field340[var6] != null) {
						field125[field416] = field340[var6] + " @whi@" + var5;
						short var7 = 0;
						if (field340[var6].equalsIgnoreCase("attack")) {
							if (arg0.field955 > field97.field955) {
								var7 = 2000;
							}

							if (field97.field938 != 0 && arg0.field938 != 0) {
								if (field97.field938 == arg0.field938) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (field341[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							field443[field416] = var7 + 725;
						}

						if (var6 == 1) {
							field443[field416] = var7 + 397;
						}

						if (var6 == 2) {
							field443[field416] = var7 + 4;
						}

						if (var6 == 3) {
							field443[field416] = var7 + 19;
						}

						if (var6 == 4) {
							field443[field416] = var7 + 716;
						}

						field444[field416] = arg3;
						field441[field416] = arg2;
						field442[field416] = arg1;
						field416++;
					}
				}
			} else if ((field345 & 0x8) == 8) {
				field125[field416] = field346 + " @whi@" + var5;
				field443[field416] = 877;
				field444[field416] = arg3;
				field441[field416] = arg2;
				field442[field416] = arg1;
				field416++;
			}

			for (int var8 = 0; var8 < field416; var8++) {
				if (field443[var8] == 472) {
					field125[var8] = "Walk here @whi@" + var5;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method42() {
		int var1 = field255.method17("Choose Option");
		for (int var2 = 0; var2 < field416; var2++) {
			int var3 = field255.method17(field125[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = field416 * 15 + 21;
		if (field703 > 4 && field704 > 4 && field703 < 516 && field704 < 338) {
			int var5 = field703 - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = field704 - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			field348 = true;
			field401 = 0;
			field402 = var5;
			field403 = var6;
			field404 = var1;
			field405 = field416 * 15 + 22;
		}

		if (field703 > 553 && field704 > 205 && field703 < 743 && field704 < 466) {
			int var7 = field703 - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = field704 - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			field348 = true;
			field401 = 1;
			field402 = var7;
			field403 = var8;
			field404 = var1;
			field405 = field416 * 15 + 22;
		}

		if (field703 > 17 && field704 > 357 && field703 < 496 && field704 < 453) {
			int var9 = field703 - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = field704 - 357;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			field348 = true;
			field401 = 2;
			field402 = var9;
			field403 = var10;
			field404 = var1;
			field405 = field416 * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method43(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				field79 = "";
				field80 = "Connecting to server...";
				method49(true);
			}

			field269 = new ABEJMBLI(method135(field158 + 43594), this);
			long var4 = YBENSMAZ.method563(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			field132.field1367 = 0;
			field132.method511(14);
			field132.method511(var6);
			field269.method5(field132.field1366, 0, 2);

			for (int var7 = 0; var7 < 8; var7++) {
				field269.method2();
			}

			int var8 = field269.method2();
			int var9 = var8;

			if (var8 == 0) {
				field269.method4(field328.field1366, 0, 8);
				field328.field1367 = 0;
				field339 = field328.method527();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field339 >> 32), (int) field339 };
				field132.field1367 = 0;
				field132.method511(10);
				field132.method515(var10[0]);
				field132.method515(var10[1]);
				field132.method515(var10[2]);
				field132.method515(var10[3]);
				field132.method515(signlink.uid);
				field132.method518(arg0);
				field132.method518(arg1);
				field132.method536(field204, field72);
				field124.field1367 = 0;

				if (arg2) {
					field124.method511(18);
				} else {
					field124.method511(16);
				}

				field124.method511(field132.field1367 + 36 + 1 + 1 + 2);
				field124.method511(255);
				field124.method512(316);
				field124.method511(field160 ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					field124.method515(field278[var11]);
				}

				field124.method519(field132.field1367, field132.field1366, 0);
				field132.field1371 = new LAFREBFM(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				field89 = new LAFREBFM(var10);
				field269.method5(field124.field1366, 0, field124.field1367);
				var8 = field269.method2();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				method43(arg0, arg1, arg2);
			} else if (var8 == 2) {
				field275 = field269.method2();
				field208 = field269.method2() == 1;
				field463 = 0L;
				field83 = 0;
				field284.field980 = 0;
				field693 = true;
				field149 = true;
				field150 = true;
				field132.field1367 = 0;
				field328.field1367 = 0;
				field465 = -1;
				field460 = -1;
				field461 = -1;
				field462 = -1;
				field464 = 0;
				field466 = 0;
				field469 = 0;
				field468 = 0;
				field257 = 0;
				field416 = 0;
				field348 = false;
				field694 = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					field364[var13] = null;
				}

				field263 = 0;
				field343 = 0;
				field252 = 0;
				field102 = 0;
				field474 = (int) (Math.random() * 100.0D) - 50;
				field373 = (int) (Math.random() * 110.0D) - 55;
				field272 = (int) (Math.random() * 80.0D) - 40;
				field457 = (int) (Math.random() * 120.0D) - 60;
				field202 = (int) (Math.random() * 30.0D) - 20;
				field62 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				field107 = 0;
				field449 = -1;
				field407 = 0;
				field408 = 0;
				field217 = 0;
				field193 = 0;

				for (int var14 = 0; var14 < field214; var14++) {
					field216[var14] = null;
					field221[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					field192[var15] = null;
				}

				field97 = field216[field215] = new LAKHMHBY();
				field58.method336();
				field249.method336();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							field235[var16][var17][var18] = null;
						}
					}
				}

				field301 = new ILVDIPQT();
				field170 = 0;
				field169 = 0;
				field327 = -1;
				field299 = -1;
				field392 = -1;
				field382 = -1;
				field390 = -1;
				field77 = false;
				field333 = 3;
				field122 = 0;
				field348 = false;
				field144 = false;
				field415 = null;
				field151 = 0;
				field330 = -1;
				field171 = true;
				method137();

				for (int var19 = 0; var19 < 5; var19++) {
					field74[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					field340[var20] = null;
					field341[var20] = false;
				}

				field106 = 0;
				field129 = 0;
				field70 = 0;
				field283 = 0;
				field450 = 0;
				method51();
			} else if (var8 == 3) {
				field79 = "";
				field80 = "Invalid username or password.";
			} else if (var8 == 4) {
				field79 = "Your account has been disabled.";
				field80 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				field79 = "Your account is already logged in.";
				field80 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				field79 = "RuneScape has been updated!";
				field80 = "Please reload this page.";
			} else if (var8 == 7) {
				field79 = "This world is full.";
				field80 = "Please use a different world.";
			} else if (var8 == 8) {
				field79 = "Unable to connect.";
				field80 = "Login server offline.";
			} else if (var8 == 9) {
				field79 = "Login limit exceeded.";
				field80 = "Too many connections from your address.";
			} else if (var8 == 10) {
				field79 = "Unable to connect.";
				field80 = "Bad session id.";
			} else if (var8 == 11) {
				field80 = "Login server rejected session.";
				field80 = "Please try again.";
			} else if (var8 == 12) {
				field79 = "You need a members account to login to this world.";
				field80 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				field79 = "Could not complete login.";
				field80 = "Please try using a different world.";
			} else if (var8 == 14) {
				field79 = "The server is being updated.";
				field80 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				field150 = true;
				field132.field1367 = 0;
				field328.field1367 = 0;
				field465 = -1;
				field460 = -1;
				field461 = -1;
				field462 = -1;
				field464 = 0;
				field466 = 0;
				field469 = 0;
				field416 = 0;
				field348 = false;
				field66 = System.currentTimeMillis();
			} else if (var8 == 16) {
				field79 = "Login attempts exceeded.";
				field80 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				field79 = "You are standing in a members-only area.";
				field80 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				field79 = "Invalid loginserver requested";
				field80 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = field269.method2(); var21 >= 0; var21--) {
					field79 = "You have only just left another world";
					field80 = "Your profile will be transferred in: " + var21 + " seconds";
					method49(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				method43(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				field79 = "Unexpected server response";
				field80 = "Please try using a different world.";
			} else if (var9 != 0) {
				field79 = "No response from server";
				field80 = "Please try using a different world.";
			} else if (field391 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				field391++;
				method43(arg0, arg1, arg2);
			} else {
				field79 = "No response from loginserver";
				field80 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			field79 = "";
			field80 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method44() {
		if (field702 == 1) {
			if (field703 >= 6 && field703 <= 106 && field704 >= 467 && field704 <= 499) {
				field172 = (field172 + 1) % 4;
				field366 = true;
				field195 = true;
				field132.method510(26);
				field132.method511(field172);
				field132.method511(field414);
				field132.method511(field156);
			}

			if (field703 >= 135 && field703 <= 235 && field704 >= 467 && field704 <= 499) {
				field414 = (field414 + 1) % 3;
				field366 = true;
				field195 = true;
				field132.method510(26);
				field132.method511(field172);
				field132.method511(field414);
				field132.method511(field156);
			}

			if (field703 >= 273 && field703 <= 373 && field704 >= 467 && field704 <= 499) {
				field156 = (field156 + 1) % 3;
				field366 = true;
				field195 = true;
				field132.method510(26);
				field132.method511(field172);
				field132.method511(field414);
				field132.method511(field156);
			}

			if (field703 >= 412 && field703 <= 512 && field704 >= 467 && field704 <= 499) {
				if (field392 == -1) {
					method94();
					field128 = "";
					field96 = false;

					for (int var1 = 0; var1 < PFVGIFDY.field1078.length; var1++) {
						if (PFVGIFDY.field1078[var1] != null && PFVGIFDY.field1078[var1].field1094 == 600) {
							field131 = field392 = PFVGIFDY.field1078[var1].field1073;
							return;
						}
					}

					return;
				}

				method100("", 0, "Please close the interface you have open before using 'report abuse'");
				return;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIZI)V")
	public final void method45(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = field349.method259(arg2, arg0, arg3);
		if (var6 != 0) {
			int var7 = field349.method263(arg2, arg0, arg3, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg4;
			}

			int[] var11 = field409.field1338;
			int var12 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			SCWSBSIM var14 = SCWSBSIM.method464(var13);
			if (var14.field1288 == -1) {
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
				DNACUOZQ var15 = field365[var14.field1288];
				if (var15 != null) {
					int var16 = (var14.field1249 * 4 - var15.field518) / 2;
					int var17 = (var14.field1283 * 4 - var15.field519) / 2;
					var15.method186((104 - arg3 - var14.field1283) * 4 + var17 + 48, arg0 * 4 + 48 + var16);
				}
			}
		}

		int var18 = field349.method261(arg2, arg0, arg3);
		if (var18 != 0) {
			int var19 = field349.method263(arg2, arg0, arg3, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			SCWSBSIM var23 = SCWSBSIM.method464(var22);
			if (var23.field1288 != -1) {
				DNACUOZQ var24 = field365[var23.field1288];
				if (var24 != null) {
					int var25 = (var23.field1249 * 4 - var24.field518) / 2;
					int var26 = (var23.field1283 * 4 - var24.field519) / 2;
					var24.method186((104 - arg3 - var23.field1283) * 4 + var26 + 48, arg0 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = field409.field1338;
				int var29 = (103 - arg3) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = field349.method262(arg2, arg0, arg3);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			SCWSBSIM var32 = SCWSBSIM.method464(var31);
			if (var32.field1288 != -1) {
				DNACUOZQ var33 = field365[var32.field1288];
				if (var33 != null) {
					int var34 = (var32.field1249 * 4 - var33.field518) / 2;
					int var35 = (var32.field1283 * 4 - var33.field519) / 2;
					var33.method186((104 - arg3 - var32.field1283) * 4 + var35 + 48, arg0 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void method46() {
		int var1 = 5;
		field278[8] = 0;
		int var2 = 0;
		while (field278[8] == 0) {
			String var3 = "Unknown problem";
			method110("Connecting to web server", 20);

			try {
				DataInputStream var4 = method162("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 316);
				XOUQUKZW var5 = new XOUQUKZW(new byte[40]);
				var4.readFully(var5.field1366, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					field278[var6] = var5.method526();
				}

				int var7 = var5.method526();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + field278[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					field278[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				field278[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				field278[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				field278[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (field278[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						method110("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						method110(var3 + " - Will retry in " + var10 + " secs.", 10);
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

				field325 = !field325;
			}
		}
	}

	@ObfuscatedName("client.b(IZI)V")
	public final void method47(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method48() {
		try {
			int var1 = field97.field1157 + field474;
			int var2 = field97.field1158 + field373;
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

			if (field706[1] == 1) {
				field63 += (-field63 - 24) / 2;
			} else if (field706[2] == 1) {
				field63 += (24 - field63) / 2;
			} else {
				field63 /= 2;
			}

			if (field706[3] == 1) {
				field64 += (12 - field64) / 2;
			} else if (field706[4] == 1) {
				field64 += (-field64 - 12) / 2;
			} else {
				field64 /= 2;
			}

			field62 = field63 / 2 + field62 & 0x7FF;
			field61 += field64 / 2;
			if (field61 < 128) {
				field61 = 128;
			}

			if (field61 > 383) {
				field61 = 383;
			}

			int var3 = field393 >> 7;
			int var4 = field394 >> 7;
			int var5 = method119(field105, field394, field393);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = field105;
						if (var9 < 3 && (field440[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - field314[var9][var7][var8];
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

			if (var11 > field110) {
				field110 += (var11 - field110) / 24;
			} else if (var11 < field110) {
				field110 += (var11 - field110) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + field97.field1157 + "," + field97.field1158 + "," + field393 + "," + field394 + "," + field233 + "," + field234 + "," + field184 + "," + field185);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void method49(boolean arg0) {
		method53();
		field175.method176();
		field379.method186(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (field309 == 0) {
			int var4 = var3 / 2 + 80;
			field253.method16(true, field225.field1327, var2 / 2, var4, 0x75A9A9);
			int var5 = var3 / 2 - 20;
			field255.method16(true, "Welcome to RuneScape", var2 / 2, var5, 0xFFFF00);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			field380.method186(var7 - 20, var6 - 73);
			field255.method16(true, "New User", var6, var7 + 5, 0xFFFFFF);
			int var8 = var2 / 2 + 80;
			field380.method186(var7 - 20, var8 - 73);
			field255.method16(true, "Existing User", var8, var7 + 5, 0xFFFFFF);
		}

		if (field309 == 2) {
			int var9 = var3 / 2 - 40;
			if (field79.length() > 0) {
				field255.method16(true, field79, var2 / 2, var9 - 15, 0xFFFF00);
				field255.method16(true, field80, var2 / 2, var9, 0xFFFF00);
				var9 += 30;
			} else {
				field255.method16(true, field80, var2 / 2, var9 - 7, 0xFFFF00);
				var9 += 30;
			}

			field255.method23(var2 / 2 - 90, var9, "Username: " + field351 + (field227 == 0 & field425 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, true);
			var9 += 15;
			field255.method23(var2 / 2 - 88, var9, "Password: " + YBENSMAZ.method568(field352) + (field227 == 1 & field425 % 40 < 20 ? "@yel@|" : ""), 0xFFFFFF, true);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				field380.method186(var11 - 20, var10 - 73);
				field255.method16(true, "Login", var10, var11 + 5, 0xFFFFFF);
				int var12 = var2 / 2 + 80;
				field380.method186(var11 - 20, var12 - 73);
				field255.method16(true, "Cancel", var12, var11 + 5, 0xFFFFFF);
			}
		}

		if (field309 == 3) {
			field255.method16(true, "Create a free account", var2 / 2, var3 / 2 - 60, 0xFFFF00);
			int var13 = var3 / 2 - 35;
			field255.method16(true, "To create a new account you need to", var2 / 2, var13, 0xFFFFFF);
			var13 += 15;
			field255.method16(true, "go back to the main RuneScape webpage", var2 / 2, var13, 0xFFFFFF);
			var13 += 15;
			field255.method16(true, "and choose the red 'create account'", var2 / 2, var13, 0xFFFFFF);
			var13 += 15;
			field255.method16(true, "button at the top right of that page.", var2 / 2, var13, 0xFFFFFF);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			field380.method186(var15 - 20, var14 - 73);
			field255.method16(true, "Cancel", var14, var15 + 5, 0xFFFFFF);
		}

		field175.method177(171, field688, 202);

		if (field369) {
			field369 = false;
			field173.method177(0, field688, 128);
			field174.method177(371, field688, 202);
			field178.method177(265, field688, 0);
			field179.method177(265, field688, 562);
			field180.method177(171, field688, 128);
			field181.method177(171, field688, 562);
		}
	}

	@ObfuscatedName("client.a(LXOUQUKZW;II)V")
	public final void method50(XOUQUKZW arg0, int arg1) {
		int var3 = arg0.method532(8);
		if (var3 < field217) {
			for (int var4 = var3; var4 < field217; var4++) {
				field223[field222++] = field218[var4];
			}
		}

		if (var3 > field217) {
			signlink.reporterror(field351 + " Too many players");
			throw new RuntimeException("eek");
		}

		field217 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field218[var5];
			LAKHMHBY var7 = field216[var6];
			int var8 = arg0.method532(1);
			if (var8 == 0) {
				field218[field217++] = var6;
				var7.field1160 = field425;
			} else {
				int var9 = arg0.method532(2);
				if (var9 == 0) {
					field218[field217++] = var6;
					var7.field1160 = field425;
					field220[field219++] = var6;
				} else if (var9 == 1) {
					field218[field217++] = var6;
					var7.field1160 = field425;
					int var10 = arg0.method532(3);
					var7.method457(false, var10);
					int var11 = arg0.method532(1);
					if (var11 == 1) {
						field220[field219++] = var6;
					}
				} else if (var9 == 2) {
					field218[field217++] = var6;
					var7.field1160 = field425;
					int var12 = arg0.method532(3);
					var7.method457(true, var12);
					int var13 = arg0.method532(3);
					var7.method457(true, var13);
					int var14 = arg0.method532(1);
					if (var14 == 1) {
						field220[field219++] = var6;
					}
				} else if (var9 == 3) {
					field223[field222++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method51() {
		if (field212 == null) {
			method69();
			field689 = null;
			field173 = null;
			field174 = null;
			field175 = null;
			field176 = null;
			field177 = null;
			field178 = null;
			field179 = null;
			field180 = null;
			field181 = null;
			field212 = new CMDDPBTD(96, method140(), 479);
			field210 = new CMDDPBTD(156, method140(), 172);
			IIPNJDNO.method320();
			field247.method186(0, 0);
			field209 = new CMDDPBTD(261, method140(), 190);
			field211 = new CMDDPBTD(334, method140(), 512);
			IIPNJDNO.method320();
			field418 = new CMDDPBTD(50, method140(), 496);
			field419 = new CMDDPBTD(37, method140(), 269);
			field420 = new CMDDPBTD(45, method140(), 249);
			field369 = true;
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (field691 != null) {
				return new URL("http://127.0.0.1:" + (field158 + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg4 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg3;
		if (var7 != 0) {
			int var12 = KPUOCBCE.field920[var7];
			int var13 = KPUOCBCE.field921[var7];
			int var14 = var10 * var13 - arg3 * var12 >> 16;
			var11 = var10 * var12 + arg3 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = KPUOCBCE.field920[var8];
			int var16 = KPUOCBCE.field921[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		field426 = arg5 - var9;
		field427 = arg0 - var10;
		field428 = arg2 - var11;
		field429 = arg4;
		field430 = arg1;
	}

	@ObfuscatedName("client.d(B)V")
	public final void method53() {
		if (field173 == null) {
			field689 = null;
			field212 = null;
			field210 = null;
			field209 = null;
			field211 = null;
			field418 = null;
			field419 = null;
			field420 = null;
			field176 = new CMDDPBTD(265, method140(), 128);
			IIPNJDNO.method320();
			field177 = new CMDDPBTD(265, method140(), 128);
			IIPNJDNO.method320();
			field173 = new CMDDPBTD(171, method140(), 509);
			IIPNJDNO.method320();
			field174 = new CMDDPBTD(132, method140(), 360);
			IIPNJDNO.method320();
			field175 = new CMDDPBTD(200, method140(), 360);
			IIPNJDNO.method320();
			field178 = new CMDDPBTD(238, method140(), 202);
			IIPNJDNO.method320();
			field179 = new CMDDPBTD(238, method140(), 203);
			IIPNJDNO.method320();
			field180 = new CMDDPBTD(94, method140(), 74);
			IIPNJDNO.method320();
			field181 = new CMDDPBTD(94, method140(), 75);
			IIPNJDNO.method320();

			if (field262 != null) {
				method103();
				method34();
			}

			field369 = true;
		}
	}

	@ObfuscatedName("client.a(IILXOUQUKZW;)V")
	public final void method54(int arg0, XOUQUKZW arg1) {
		if (arg0 == 112) {
			int var3 = arg1.method539();
			int var4 = (var3 >> 4 & 0x7) + field250;
			int var5 = (var3 & 0x7) + field251;
			int var6 = arg1.method521();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field300[var7];
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				method106(var5, 0, var8, var4, var9, var7, -1, -1, field105);
			}
		} else if (arg0 == 247) {
			int var10 = arg1.method548();
			int var11 = arg1.method540();
			int var12 = (var11 >> 4 & 0x7) + field250;
			int var13 = (var11 & 0x7) + field251;
			int var14 = arg1.method540();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field300[var15];
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var18 = field314[field105][var12][var13];
				int var19 = field314[field105][var12 + 1][var13];
				int var20 = field314[field105][var12 + 1][var13 + 1];
				int var21 = field314[field105][var12][var13 + 1];
				if (var17 == 0) {
					EYXXOIXA var22 = field349.method255(var13, var12, field105);
					if (var22 != null) {
						int var23 = var22.field593 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var22.field591 = new LOFYMKZK(var16 + 4, var23, 2, var10, var19, var18, false, var21, var20);
							var22.field592 = new LOFYMKZK(var16 + 1 & 0x3, var23, 2, var10, var19, var18, false, var21, var20);
						} else {
							var22.field591 = new LOFYMKZK(var16, var23, var15, var10, var19, var18, false, var21, var20);
						}
					}
				}

				if (var17 == 1) {
					VJORNJSM var24 = field349.method256(var13, var12, field105);
					if (var24 != null) {
						var24.field1350 = new LOFYMKZK(0, var24.field1351 >> 14 & 0x7FFF, 4, var10, var19, var18, false, var21, var20);
					}
				}

				if (var17 == 2) {
					PJHWSUQK var25 = field349.method257(field105, var12, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var25 != null) {
						var25.field1140 = new LOFYMKZK(var16, var25.field1148 >> 14 & 0x7FFF, var15, var10, var19, var18, false, var21, var20);
					}
				}

				if (var17 == 3) {
					JCOZDSYV var26 = field349.method258(var13, field105, var12);
					if (var26 != null) {
						var26.field848 = new LOFYMKZK(var16, var26.field849 >> 14 & 0x7FFF, 22, var10, var19, var18, false, var21, var20);
					}
				}
			}
		} else if (arg0 == 149) {
			int var27 = arg1.method540();
			int var28 = (var27 >> 4 & 0x7) + field250;
			int var29 = (var27 & 0x7) + field251;
			int var30 = arg1.method550();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				ILVDIPQT var31 = field235[field105][var28][var29];
				if (var31 != null) {
					for (XXIPNARK var32 = (XXIPNARK) var31.method332(); var32 != null; var32 = (XXIPNARK) var31.method334()) {
						if ((var30 & 0x7FFF) == var32.field1404) {
							var32.method471();
							break;
						}
					}

					if (var31.method332() == null) {
						field235[field105][var28][var29] = null;
					}

					method136(var28, var29);
				}
			}
		} else {
			if (arg0 == 57) {
				int var33 = arg1.method549();
				int var34 = arg1.method550();
				int var35 = arg1.method539();
				int var36 = var35 >> 2;
				int var37 = var35 & 0x3;
				int var38 = field300[var36];
				int var39 = arg1.method523();
				byte var40 = arg1.method543();
				byte var41 = arg1.method522();
				int var42 = arg1.method539();
				int var43 = (var42 >> 4 & 0x7) + field250;
				int var44 = (var42 & 0x7) + field251;
				byte var45 = arg1.method522();
				int var46 = arg1.method523();
				byte var47 = arg1.method544();
				LAKHMHBY var48;
				if (field71 == var39) {
					var48 = field97;
				} else {
					var48 = field216[var39];
				}

				if (var48 != null) {
					SCWSBSIM var49 = SCWSBSIM.method464(var34);
					int var50 = field314[field105][var43][var44];
					int var51 = field314[field105][var43 + 1][var44];
					int var52 = field314[field105][var43 + 1][var44 + 1];
					int var53 = field314[field105][var43][var44 + 1];
					KPUOCBCE var54 = var49.method470(var36, var37, var50, var51, var52, var53, -1);
					if (var54 != null) {
						method106(var44, var46 + 1, 0, var43, var38, 0, -1, var33 + 1, field105);
						var48.field940 = field425 + var46;
						var48.field941 = field425 + var33;
						var48.field954 = var54;
						int var55 = var49.field1249;
						int var56 = var49.field1283;
						if (var37 == 1 || var37 == 3) {
							var55 = var49.field1283;
							var56 = var49.field1249;
						}

						var48.field951 = var43 * 128 + var55 * 64;
						var48.field953 = var44 * 128 + var56 * 64;
						var48.field952 = method119(field105, var48.field953, var48.field951);

						if (var47 > var45) {
							byte var57 = var47;
							var47 = var45;
							var45 = var57;
						}

						if (var40 > var41) {
							byte var58 = var40;
							var40 = var41;
							var41 = var58;
						}

						var48.field946 = var43 + var47;
						var48.field948 = var43 + var45;
						var48.field947 = var40 + var44;
						var48.field949 = var41 + var44;
					}
				}
			}

			if (arg0 == 88) {
				int var59 = arg1.method540();
				int var60 = (var59 >> 4 & 0x7) + field250;
				int var61 = (var59 & 0x7) + field251;
				int var62 = arg1.method548();
				int var63 = arg1.method521();
				int var64 = var63 >> 2;
				int var65 = var63 & 0x3;
				int var66 = field300[var64];
				if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
					method106(var61, 0, var65, var60, var66, var64, var62, -1, field105);
				}
			} else {
				if (arg0 == 42) {
					int var67 = arg1.method521();
					int var68 = (var67 >> 4 & 0x7) + field250;
					int var69 = (var67 & 0x7) + field251;
					int var70 = arg1.method523();
					int var71 = arg1.method521();
					int var72 = var71 >> 4 & 0xF;
					int var73 = var71 & 0x7;
					if (field97.field1192[0] >= var68 - var72 && field97.field1192[0] <= var68 + var72 && field97.field1193[0] >= var69 - var72 && field97.field1193[0] <= var69 + var72 && field433 && !field160 && field102 < 50) {
						field153[field102] = var70;
						field189[field102] = var73;
						field238[field102] = ZTSFQLLW.field1477[var70];
						field102++;
					}
				}

				if (arg0 == 6) {
					int var74 = arg1.method549();
					int var75 = arg1.method523();
					int var76 = arg1.method521();
					int var77 = (var76 >> 4 & 0x7) + field250;
					int var78 = (var76 & 0x7) + field251;
					if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
						XXIPNARK var79 = new XXIPNARK();
						var79.field1404 = var74;
						var79.field1405 = var75;

						if (field235[field105][var77][var78] == null) {
							field235[field105][var77][var78] = new ILVDIPQT();
						}

						field235[field105][var77][var78].method329(var79);
						method136(var77, var78);
					}
				} else if (arg0 == 210) {
					int var80 = arg1.method521();
					int var81 = (var80 >> 4 & 0x7) + field250;
					int var82 = (var80 & 0x7) + field251;
					int var83 = arg1.method523();
					int var84 = arg1.method523();
					int var85 = arg1.method523();
					if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
						ILVDIPQT var86 = field235[field105][var81][var82];
						if (var86 != null) {
							for (XXIPNARK var87 = (XXIPNARK) var86.method332(); var87 != null; var87 = (XXIPNARK) var86.method334()) {
								if ((var83 & 0x7FFF) == var87.field1404 && var87.field1405 == var84) {
									var87.field1405 = var85;
									break;
								}
							}

							method136(var81, var82);
						}
					}
				} else if (arg0 == 143) {
					int var88 = arg1.method521();
					int var89 = (var88 >> 4 & 0x7) + field250;
					int var90 = (var88 & 0x7) + field251;
					int var91 = arg1.method523();
					int var92 = arg1.method521();
					int var93 = arg1.method523();
					if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
						var89 = var89 * 128 + 64;
						var90 = var90 * 128 + 64;
						HYUBDXHD var94 = new HYUBDXHD(var89, var91, var90, method119(field105, var90, var89) - var92, field425, var93, field105);
						field249.method329(var94);
					}
				} else if (arg0 == 156) {
					int var95 = arg1.method541();
					int var96 = (var95 >> 4 & 0x7) + field250;
					int var97 = (var95 & 0x7) + field251;
					int var98 = arg1.method523();
					int var99 = arg1.method523();
					int var100 = arg1.method549();
					if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104 && field71 != var100) {
						XXIPNARK var101 = new XXIPNARK();
						var101.field1404 = var99;
						var101.field1405 = var98;

						if (field235[field105][var96][var97] == null) {
							field235[field105][var96][var97] = new ILVDIPQT();
						}

						field235[field105][var96][var97].method329(var101);
						method136(var96, var97);
					}
				} else if (arg0 == 75) {
					int var102 = arg1.method521();
					int var103 = (var102 >> 4 & 0x7) + field250;
					int var104 = (var102 & 0x7) + field251;
					int var105 = var103 + arg1.method522();
					int var106 = var104 + arg1.method522();
					int var107 = arg1.method524();
					int var108 = arg1.method523();
					int var109 = arg1.method521() * 4;
					int var110 = arg1.method521() * 4;
					int var111 = arg1.method523();
					int var112 = arg1.method523();
					int var113 = arg1.method521();
					int var114 = arg1.method521();
					if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var108 != 0xFFFF) {
						var103 = var103 * 128 + 64;
						var104 = var104 * 128 + 64;
						var105 = var105 * 128 + 64;
						var106 = var106 * 128 + 64;
						RVCZOCZG var115 = new RVCZOCZG(field425 + var111, field105, var103, method119(field105, var104, var103) - var109, var108, var110, var113, field425 + var112, var107, var114, var104);
						var115.method458(var105, var106, method119(field105, var106, var105) - var110, field425 + var111);
						field58.method329(var115);
					}
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 316);

			if (arg0.length == 5) {
				field157 = Integer.parseInt(arg0[0]);
				field158 = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					method71();
				} else if (arg0[2].equals("highmem")) {
					method120();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					field159 = false;
				} else if (arg0[3].equals("members")) {
					field159 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method284(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IZLPFVGIFDY;)I")
	public final int method55(int arg0, PFVGIFDY arg1) {
		if (arg1.field1132 == null || arg0 >= arg1.field1132.length) {
			return -2;
		}

		try {
			int[] var3 = arg1.field1132[arg0];
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
					var8 = field68[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = field241[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = field310[var3[var5++]];
				}

				if (var7 == 4) {
					PFVGIFDY var10 = PFVGIFDY.field1078[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < HMRHACIQ.field731 && (!HMRHACIQ.method293(var11).field754 || field159)) {
						for (int var12 = 0; var12 < var10.field1104.length; var12++) {
							if (var11 + 1 == var10.field1104[var12]) {
								var8 += var10.field1100[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = field342[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = field114[field241[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = field342[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = field97.field955;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < UILCRUTQ.field1335; var13++) {
						if (UILCRUTQ.field1337[var13]) {
							var8 += field241[var13];
						}
					}
				}

				if (var7 == 10) {
					PFVGIFDY var14 = PFVGIFDY.field1078[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < HMRHACIQ.field731 && (!HMRHACIQ.method293(var15).field754 || field159)) {
						for (int var16 = 0; var16 < var14.field1104.length; var16++) {
							if (var14.field1104[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = field123;
				}

				if (var7 == 12) {
					var8 = field285;
				}

				if (var7 == 13) {
					int var17 = field342[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					XBHMGKWV var20 = XBHMGKWV.field1354[var19];
					int var21 = var20.field1356;
					int var22 = var20.field1357;
					int var23 = var20.field1358;
					int var24 = field378[var23 - var22];
					var8 = field342[var21] >> var22 & var24;
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
					var8 = (field97.field1157 >> 7) + field184;
				}

				if (var7 == 19) {
					var8 = (field97.field1158 >> 7) + field185;
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

	@ObfuscatedName("client.m(I)I")
	public final int method56() {
		int var1 = 3;
		if (field429 < 310) {
			field436++;
			if (field436 > 55) {
				field436 = 0;
				field132.method510(76);
			}

			int var2 = field426 >> 7;
			int var3 = field428 >> 7;
			int var4 = field97.field1157 >> 7;
			int var5 = field97.field1158 >> 7;

			if ((field440[field105][var2][var3] & 0x4) != 0) {
				var1 = field105;
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

					if ((field440[field105][var2][var3] & 0x4) != 0) {
						var1 = field105;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((field440[field105][var2][var3] & 0x4) != 0) {
							var1 = field105;
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

					if ((field440[field105][var2][var3] & 0x4) != 0) {
						var1 = field105;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((field440[field105][var2][var3] & 0x4) != 0) {
							var1 = field105;
						}
					}
				}
			}
		}

		if ((field440[field105][field97.field1157 >> 7][field97.field1158 >> 7] & 0x4) != 0) {
			var1 = field105;
		}

		return var1;
	}

	@ObfuscatedName("client.e(B)I")
	public final int method57() {
		int var1 = method119(field105, field428, field426);
		if (var1 - field427 < 800 && (field440[field105][field426 >> 7][field428 >> 7] & 0x4) != 0) {
			return field105;
		}

		return 3;
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method58(boolean arg0) {
		for (int var2 = 0; var2 < field193; var2++) {
			AVKLDTFF var3 = field192[field194[var2]];
			int var4 = (field194[var2] << 14) + 0x20000000;
			if (var3 != null && var3.method12() && var3.field36.field800 == arg0) {
				int var5 = var3.field1157 >> 7;
				int var6 = var3.field1158 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field1198 == 1 && (var3.field1157 & 0x7F) == 0x40 && (var3.field1158 & 0x7F) == 0x40) {
						if (field274[var5][var6] == field353) {
							continue;
						}

						field274[var5][var6] = field353;
					}

					if (!var3.field36.field780) {
						var4 += Integer.MIN_VALUE;
					}

					field349.method244(var3.field1159, var3, var4, var3.field1157, var3.field1158, var3.field1172, method119(field105, var3.field1158, var3.field1157), (var3.field1198 - 1) * 64 + 60, field105);
				}
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void method59(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (field364[var4] != null) {
				int var5 = field362[var4];
				int var6 = field456 + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = field363[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || field172 == 0 || field172 == 1 && method161(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(field97.field960)) {
						if (field275 >= 1) {
							field125[field416] = "Report abuse @whi@" + var7;
							field443[field416] = 423;
							field416++;
						}

						field125[field416] = "Add ignore @whi@" + var7;
						field443[field416] = 400;
						field416++;
						field125[field416] = "Add friend @whi@" + var7;
						field443[field416] = 290;
						field416++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && field126 == 0 && (var5 == 7 || field414 == 0 || field414 == 1 && method161(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (field275 >= 1) {
							field125[field416] = "Report abuse @whi@" + var7;
							field443[field416] = 423;
							field416++;
						}

						field125[field416] = "Add ignore @whi@" + var7;
						field443[field416] = 400;
						field416++;
						field125[field416] = "Add friend @whi@" + var7;
						field443[field416] = 290;
						field416++;
					}

					var3++;
				}

				if (var5 == 4 && (field156 == 0 || field156 == 1 && method161(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field125[field416] = "Accept trade @whi@" + var7;
						field443[field416] = 18;
						field416++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && field126 == 0 && field414 < 2) {
					var3++;
				}

				if (var5 == 8 && (field156 == 0 || field156 == 1 && method161(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						field125[field416] = "Accept challenge @whi@" + var7;
						field443[field416] = 188;
						field416++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method60(int arg0) {
		if (!field160) {
			if (OIDJTTQC.field1068[17] >= arg0) {
				DNACUOZQ var2 = OIDJTTQC.field1062[17];
				int var3 = var2.field519 * var2.field518 - 1;
				int var4 = field476 * var2.field518 * 2;
				byte[] var5 = var2.field516;
				byte[] var6 = field371;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.field516 = var6;
				field371 = var5;
				OIDJTTQC.method438(17);
			}

			if (OIDJTTQC.field1068[24] >= arg0) {
				DNACUOZQ var8 = OIDJTTQC.field1062[24];
				int var9 = var8.field519 * var8.field518 - 1;
				int var10 = field476 * var8.field518 * 2;
				byte[] var11 = var8.field516;
				byte[] var12 = field371;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.field516 = var12;
				field371 = var11;
				OIDJTTQC.method438(24);
				field224++;
				if (field224 > 1462) {
					field224 = 0;
					field132.method510(120);
					field132.method511(0);
					int var14 = field132.field1367;
					field132.method511((int) (Math.random() * 256.0D));
					field132.method511((int) (Math.random() * 256.0D));
					field132.method512(17174);
					field132.method511(95);
					field132.method511(72);
					field132.method511(178);

					if ((int) (Math.random() * 2.0D) == 0) {
						field132.method512(29524);
					}

					field132.method512(49542);

					if ((int) (Math.random() * 2.0D) == 0) {
						field132.method512(64751);
					}

					field132.method511(189);
					field132.method520(field132.field1367 - var14);
				}
			}

			if (OIDJTTQC.field1068[34] >= arg0) {
				DNACUOZQ var15 = OIDJTTQC.field1062[34];
				int var16 = var15.field519 * var15.field518 - 1;
				int var17 = field476 * var15.field518 * 2;
				byte[] var18 = var15.field516;
				byte[] var19 = field371;
				for (int var20 = 0; var20 <= var16; var20++) {
					var19[var20] = var18[var20 - var17 & var16];
				}

				var15.field516 = var19;
				field371 = var18;
				OIDJTTQC.method438(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method61() {
		if (field199 == 0) {
			field125[0] = "Cancel";
			field443[0] = 1352;
			field416 = 1;
			method39();
			field277 = 0;

			if (field696 > 4 && field697 > 4 && field696 < 516 && field697 < 338) {
				if (field392 == -1) {
					method169();
				} else {
					method149(4, PFVGIFDY.field1078[field392], field697, 0, 4, field696);
				}
			}

			if (field95 != field277) {
				field95 = field277;
			}

			field277 = 0;

			if (field696 > 553 && field697 > 205 && field696 < 743 && field697 < 466) {
				if (field382 != -1) {
					method149(553, PFVGIFDY.field1078[field382], field697, 0, 205, field696);
				} else if (field81[field333] != -1) {
					method149(553, PFVGIFDY.field1078[field81[field333]], field697, 0, 205, field696);
				}
			}

			if (field277 != field237) {
				field431 = true;
				field237 = field277;
			}

			field277 = 0;

			if (field696 > 17 && field697 > 357 && field696 < 496 && field697 < 453) {
				if (field299 != -1) {
					method149(17, PFVGIFDY.field1078[field299], field697, 0, 357, field696);
				} else if (field697 < 434 && field696 < 426) {
					method59(field696 - 17, field697 - 357);
				}
			}

			if (field299 != -1 && field277 != field145) {
				field195 = true;
				field145 = field277;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < field416 - 1; var2++) {
					if (field443[var2] < 1000 && field443[var2 + 1] > 1000) {
						String var3 = field125[var2];
						field125[var2] = field125[var2 + 1];
						field125[var2 + 1] = var3;
						int var4 = field443[var2];
						field443[var2] = field443[var2 + 1];
						field443[var2 + 1] = var4;
						int var5 = field441[var2];
						field441[var2] = field441[var2 + 1];
						field441[var2 + 1] = var5;
						int var6 = field442[var2];
						field442[var2] = field442[var2 + 1];
						field442[var2 + 1] = var6;
						int var7 = field444[var2];
						field444[var2] = field444[var2 + 1];
						field444[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method62(long arg0) {
		if (arg0 != 0L) {
			if (field207 >= 100) {
				method100("", 0, "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = YBENSMAZ.method567(YBENSMAZ.method564(arg0));
				for (int var4 = 0; var4 < field207; var4++) {
					if (field57[var4] == arg0) {
						method100("", 0, var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < field169; var5++) {
					if (field331[var5] == arg0) {
						method100("", 0, "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				field57[field207++] = arg0;
				field431 = true;
				field132.method510(118);
				field132.method517(arg0);
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method63() {
		field209.method176();
		OIDJTTQC.field1060 = field446;
		field246.method186(0, 0);

		if (field382 != -1) {
			method128(0, 0, PFVGIFDY.field1078[field382], 0);
		} else if (field81[field333] != -1) {
			method128(0, 0, PFVGIFDY.field1078[field81[field333]], 0);
		}

		if (field348 && field401 == 1) {
			method70();
		}

		field209.method177(205, field688, 553);
		field211.method176();
		OIDJTTQC.field1060 = field447;
	}

	@ObfuscatedName("client.f(B)V")
	public final void method64() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(LXOUQUKZW;IB)V")
	public final void method65(XOUQUKZW arg0, int arg1) {
		field222 = 0;
		field219 = 0;
		method88(arg0, arg1);
		method50(arg0, arg1);
		method166(arg1, arg0);
		method148(arg0, arg1);

		for (int var3 = 0; var3 < field222; var3++) {
			int var4 = field223[var3];
			if (field425 != field216[var4].field1160) {
				field216[var4] = null;
			}
		}

		if (arg0.field1367 != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1367 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field217; var5++) {
			if (field216[field218[var5]] == null) {
				signlink.reporterror(field351 + " null entry in pl list - pos:" + var5 + " size:" + field217);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method66() {
		for (int var1 = -1; var1 < field217; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field215;
			} else {
				var2 = field218[var1];
			}

			LAKHMHBY var3 = field216[var2];
			if (var3 != null) {
				method77(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIILjava/lang/String;I)LCVNWKEAW;")
	public final CVNWKEAW method67(String arg0, int arg1, int arg2, String arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (field196[0] != null) {
				var6 = field196[0].method559(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			field451.reset();
			field451.update(var6);
			int var8 = (int) field451.getValue();
			if (arg2 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new CVNWKEAW(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			method110("Requesting " + arg0, arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = method162(arg3 + arg2);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				XOUQUKZW var16 = new XOUQUKZW(var15);
				var16.field1367 = 3;
				int var17 = var16.method525() + 6;
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
						method110("Loading " + arg0 + " - " + var22 + "%", arg4);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (field196[0] != null) {
						field196[0].method560(var6.length, var6, arg1);
					}
				} catch (Exception var28) {
					field196[0] = null;
				}

				if (var6 != null) {
					field451.reset();
					field451.update(var6);
					int var23 = (int) field451.getValue();
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
						method110("Game updated - please reload page", arg4);
						var25 = 10;
					} else {
						method110(var11 + " - Retrying in " + var25, arg4);
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

				field325 = !field325;
			}
		}

		return new CVNWKEAW(var6);
	}

	@ObfuscatedName("client.a(B)V")
	public final void method68() {
		field369 = true;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method69() {
		field127 = false;
		while (field104) {
			field127 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		field379 = null;
		field380 = null;
		field67 = null;
		field242 = null;
		field243 = null;
		field244 = null;
		field245 = null;
		field230 = null;
		field231 = null;
		field454 = null;
		field455 = null;
		field412 = null;
		field413 = null;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method70() {
		int var1 = field402;
		int var2 = field403;
		int var3 = field404;
		int var4 = field405;
		int var5 = 0x5D5447;
		IIPNJDNO.method322(var2, var1, var5, var3, var4);
		IIPNJDNO.method322(var2 + 1, var1 + 1, 0, var3 - 2, 16);
		IIPNJDNO.method323(var3 - 2, 0, var2 + 18, var1 + 1, var4 - 19);
		field255.method19("Choose Option", var5, var2 + 14, var1 + 3);
		int var6 = field696;
		int var7 = field697;
		if (field401 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (field401 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (field401 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < field416; var8++) {
			int var9 = (field416 - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			field255.method23(var1 + 3, var9, field125[var8], var10, true);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public static final void method71() {
		GLVCMXFQ.field617 = true;
		OIDJTTQC.field1049 = true;
		field160 = true;
		DWQOSSFD.field545 = true;
		SCWSBSIM.field1270 = true;
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method72() {
		if (field257 == 2) {
			method173((field163 - field185 << 7) + field166, (field162 - field184 << 7) + field165, field164 * 2);

			if (field375 > -1 && field425 % 20 < 10) {
				field434[2].method499(field376 - 28, field375 - 12);
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method73(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field169; var3++) {
				if (field331[var3] == arg0) {
					field169--;
					field431 = true;

					for (int var4 = var3; var4 < field169; var4++) {
						field226[var4] = field226[var4 + 1];
						field100[var4] = field100[var4 + 1];
						field331[var4] = field331[var4 + 1];
					}

					field132.method510(38);
					field132.method517(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void method74() {
		if (field252 == 2) {
			for (IRATNZCY var1 = (IRATNZCY) field301.method332(); var1 != null; var1 = (IRATNZCY) field301.method334()) {
				if (var1.field834 > 0) {
					var1.field834--;
				}

				if (var1.field834 != 0) {
					if (var1.field829 > 0) {
						var1.field829--;
					}

					if (var1.field829 == 0 && var1.field832 >= 1 && var1.field833 >= 1 && var1.field832 <= 102 && var1.field833 <= 102 && (var1.field835 < 0 || DWQOSSFD.method202(var1.field837, var1.field835))) {
						method95(var1.field832, var1.field836, var1.field837, var1.field831, var1.field833, var1.field830, var1.field835);
						var1.field829 = -1;

						if (var1.field835 == var1.field826 && var1.field826 == -1) {
							var1.method471();
						} else if (var1.field835 == var1.field826 && var1.field836 == var1.field827 && var1.field837 == var1.field828) {
							var1.method471();
						}
					}
				} else if (var1.field826 < 0 || DWQOSSFD.method202(var1.field828, var1.field826)) {
					method95(var1.field832, var1.field827, var1.field828, var1.field831, var1.field833, var1.field830, var1.field826);
					var1.method471();
				}
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method75() {
		if (field469 > 1) {
			field469--;
		}

		if (field468 > 0) {
			field468--;
		}

		for (int var1 = 0; var1 < 5 && method37(); var1++) {
		}

		if (field150) {
			synchronized (field284.field979) {
				if (!field208) {
					field284.field980 = 0;
				} else if (field702 != 0 || field284.field980 >= 40) {
					field132.method510(30);
					field132.method511(0);
					int var3 = field132.field1367;
					int var4 = 0;
					for (int var5 = 0; var5 < field284.field980 && var3 - field132.field1367 < 240; var5++) {
						var4++;
						int var6 = field284.field977[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = field284.field981[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (field284.field977[var5] == -1 && field284.field981[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (field147 != var7 || field148 != var6) {
							int var9 = var7 - field147;
							field147 = var7;
							int var10 = var6 - field148;
							field148 = var6;

							if (field83 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								field132.method512((field83 << 12) + (var9 << 6) + var10);
								field83 = 0;
							} else if (field83 < 8) {
								field132.method514((field83 << 19) + var8 + 0x800000);
								field83 = 0;
							} else {
								field132.method515((field83 << 19) + var8 - 0x40000000);
								field83 = 0;
							}
						} else if (field83 < 2047) {
							field83++;
						}
					}

					field132.method520(field132.field1367 - var3);

					if (var4 >= field284.field980) {
						field284.field980 = 0;
					} else {
						field284.field980 -= var4;
						for (int var11 = 0; var11 < field284.field980; var11++) {
							field284.field981[var11] = field284.field981[var4 + var11];
							field284.field977[var11] = field284.field977[var4 + var11];
						}
					}
				}
			}

			if (field702 != 0) {
				long var12 = (field705 - field463) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				field463 = field705;
				int var14 = field704;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = field703;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (field702 == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				field132.method510(168);
				field132.method553((var17 << 19) + (var18 << 20) + var16);
			}

			if (field395 > 0) {
				field395--;
			}

			if (field706[1] == 1 || field706[2] == 1 || field706[3] == 1 || field706[4] == 1) {
				field396 = true;
			}

			if (field396 && field395 <= 0) {
				field395 = 20;
				field396 = false;
				field132.method510(65);
				field132.method546(field61);
				field132.method545(field62);
			}

			if (field693 && !field149) {
				field149 = true;
				field132.method510(108);
				field132.method511(1);
			}

			if (!field693 && field149) {
				field149 = false;
				field132.method510(108);
				field132.method511(0);
			}

			method104();
			method74();
			method98();
			field466++;
			if (field466 > 750) {
				method118();
			}

			method66();
			method76();
			method152();
			field476++;

			if (field473 != 0) {
				field472 += 20;
				if (field472 >= 400) {
					field473 = 0;
				}
			}

			if (field282 != 0) {
				field279++;
				if (field279 >= 15) {
					if (field282 == 2) {
						field431 = true;
					}

					if (field282 == 3) {
						field195 = true;
					}

					field282 = 0;
				}
			}

			if (field199 != 0) {
				field288++;

				if (field696 > field200 + 5 || field696 < field200 - 5 || field697 > field201 + 5 || field697 < field201 - 5) {
					field108 = true;
				}

				if (field695 == 0) {
					if (field199 == 2) {
						field431 = true;
					}

					if (field199 == 3) {
						field195 = true;
					}

					field199 = 0;

					if (field108 && field288 >= 5) {
						field168 = -1;
						method61();

						if (field197 == field168 && field198 != field167) {
							PFVGIFDY var19 = PFVGIFDY.field1078[field197];
							byte var20 = 0;
							if (field101 == 1 && var19.field1094 == 206) {
								var20 = 1;
							}

							if (var19.field1104[field167] <= 0) {
								var20 = 0;
							}

							if (var19.field1110) {
								int var21 = field198;
								int var22 = field167;
								var19.field1104[var22] = var19.field1104[var21];
								var19.field1100[var22] = var19.field1100[var21];
								var19.field1104[var21] = -1;
								var19.field1100[var21] = 0;
							} else if (var20 == 1) {
								int var23 = field198;
								int var24 = field167;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.method448(var23 - 1, var23);
										var23--;
									} else if (var23 < var24) {
										var19.method448(var23 + 1, var23);
										var23++;
									}
								}
							} else {
								var19.method448(field167, field198);
							}

							field132.method510(85);
							field132.method545(field167);
							field132.method512(field197);
							field132.method511(var20);
							field132.method546(field198);
						}
					} else if ((field435 == 1 || method122(field416 - 1)) && field416 > 2) {
						method42();
					} else if (field416 > 0) {
						method164(field416 - 1);
					}

					field279 = 10;
					field702 = 0;
				}
			}

			if (GLVCMXFQ.field651 != -1) {
				int var25 = GLVCMXFQ.field651;
				int var26 = GLVCMXFQ.field652;
				boolean var27 = method126(0, var26, 0, 0, field97.field1192[0], 0, var25, true, field97.field1193[0], 0, 0);
				GLVCMXFQ.field651 = -1;

				if (var27) {
					field470 = field703;
					field471 = field704;
					field473 = 1;
					field472 = 0;
				}
			}

			if (field702 == 1 && field415 != null) {
				field415 = null;
				field195 = true;
				field702 = 0;
			}

			method150();
			method127();
			method163();
			method44();

			if (field695 == 1 || field702 == 1) {
				field109++;
			}

			if (field252 == 2) {
				method48();
			}

			if (field252 == 2 && field388) {
				method89();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				field354[var28]++;
			}

			method159();
			field694++;
			if (field694 > 4500) {
				field468 = 250;
				field694 -= 500;
				field132.method510(173);
			}

			field452++;
			if (field452 > 500) {
				field452 = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					field474 += field475;
				}

				if ((var29 & 0x2) == 2) {
					field373 += field374;
				}

				if ((var29 & 0x4) == 4) {
					field272 += field273;
				}
			}

			if (field474 < -50) {
				field475 = 2;
			}

			if (field474 > 50) {
				field475 = -2;
			}

			if (field373 < -55) {
				field374 = 2;
			}

			if (field373 > 55) {
				field374 = -2;
			}

			if (field272 < -40) {
				field273 = 1;
			}

			if (field272 > 40) {
				field273 = -1;
			}

			field368++;
			if (field368 > 500) {
				field368 = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					field457 += field458;
				}

				if ((var30 & 0x2) == 2) {
					field202 += field203;
				}
			}

			if (field457 < -60) {
				field458 = 2;
			}

			if (field457 > 60) {
				field458 = -2;
			}

			if (field202 < -20) {
				field203 = 1;
			}

			if (field202 > 10) {
				field203 = -1;
			}

			field467++;
			if (field467 > 50) {
				field132.method510(134);
			}

			try {
				if (field269 != null && field132.field1367 > 0) {
					field269.method5(field132.field1366, 0, field132.field1367);
					field132.field1367 = 0;
					field467 = 0;
				}
			} catch (IOException var32) {
				method118();
			} catch (Exception var33) {
				method96();
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void method76() {
		for (int var1 = 0; var1 < field193; var1++) {
			int var2 = field194[var1];
			AVKLDTFF var3 = field192[var2];
			if (var3 != null) {
				method77(var3, var3.field36.field791);
			}
		}
	}

	@ObfuscatedName("client.a(LQMQRUGDN;II)V")
	public final void method77(QMQRUGDN arg0, int arg1) {
		if (arg0.field1157 < 128 || arg0.field1158 < 128 || arg0.field1157 >= 13184 || arg0.field1158 >= 13184) {
			arg0.field1151 = -1;
			arg0.field1167 = -1;
			arg0.field1189 = 0;
			arg0.field1190 = 0;
			arg0.field1157 = arg0.field1192[0] * 128 + arg0.field1198 * 64;
			arg0.field1158 = arg0.field1193[0] * 128 + arg0.field1198 * 64;
			arg0.method456();
		}

		if (field97 == arg0 && (arg0.field1157 < 1536 || arg0.field1158 < 1536 || arg0.field1157 >= 11776 || arg0.field1158 >= 11776)) {
			arg0.field1151 = -1;
			arg0.field1167 = -1;
			arg0.field1189 = 0;
			arg0.field1190 = 0;
			arg0.field1157 = arg0.field1192[0] * 128 + arg0.field1198 * 64;
			arg0.field1158 = arg0.field1193[0] * 128 + arg0.field1198 * 64;
			arg0.method456();
		}

		if (arg0.field1189 > field425) {
			method78(arg0);
		} else if (arg0.field1190 >= field425) {
			method79(arg0);
		} else {
			method80(arg0);
		}

		method81(arg0);
		method82(arg0);
	}

	@ObfuscatedName("client.a(LQMQRUGDN;I)V")
	public final void method78(QMQRUGDN arg0) {
		int var2 = arg0.field1189 - field425;
		int var3 = arg0.field1198 * 64 + arg0.field1185 * 128;
		int var4 = arg0.field1198 * 64 + arg0.field1187 * 128;
		arg0.field1157 += (var3 - arg0.field1157) / var2;
		arg0.field1158 += (var4 - arg0.field1158) / var2;
		arg0.field1182 = 0;

		if (arg0.field1191 == 0) {
			arg0.field1200 = 1024;
		}

		if (arg0.field1191 == 1) {
			arg0.field1200 = 1536;
		}

		if (arg0.field1191 == 2) {
			arg0.field1200 = 0;
		}

		if (arg0.field1191 == 3) {
			arg0.field1200 = 512;
		}
	}

	@ObfuscatedName("client.a(ILQMQRUGDN;)V")
	public final void method79(QMQRUGDN arg0) {
		if (field425 == arg0.field1190 || arg0.field1151 == -1 || arg0.field1154 != 0 || arg0.field1153 + 1 > NMXKUYSC.field998[arg0.field1151].method415(arg0.field1152)) {
			int var2 = arg0.field1190 - arg0.field1189;
			int var3 = field425 - arg0.field1189;
			int var4 = arg0.field1198 * 64 + arg0.field1185 * 128;
			int var5 = arg0.field1198 * 64 + arg0.field1187 * 128;
			int var6 = arg0.field1198 * 64 + arg0.field1186 * 128;
			int var7 = arg0.field1198 * 64 + arg0.field1188 * 128;
			arg0.field1157 = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.field1158 = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.field1182 = 0;

		if (arg0.field1191 == 0) {
			arg0.field1200 = 1024;
		}

		if (arg0.field1191 == 1) {
			arg0.field1200 = 1536;
		}

		if (arg0.field1191 == 2) {
			arg0.field1200 = 0;
		}

		if (arg0.field1191 == 3) {
			arg0.field1200 = 512;
		}

		arg0.field1159 = arg0.field1200;
	}

	@ObfuscatedName("client.b(ILQMQRUGDN;)V")
	public final void method80(QMQRUGDN arg0) {
		arg0.field1163 = arg0.field1183;
		if (arg0.field1199 == 0) {
			arg0.field1182 = 0;
		} else {
			if (arg0.field1151 != -1 && arg0.field1154 == 0) {
				NMXKUYSC var2 = NMXKUYSC.field998[arg0.field1151];
				if (arg0.field1150 > 0 && var2.field1010 == 0) {
					arg0.field1182++;
					return;
				}

				if (arg0.field1150 <= 0 && var2.field1011 == 0) {
					arg0.field1182++;
					return;
				}
			}

			int var3 = arg0.field1157;
			int var4 = arg0.field1158;
			int var5 = arg0.field1192[arg0.field1199 - 1] * 128 + arg0.field1198 * 64;
			int var6 = arg0.field1193[arg0.field1199 - 1] * 128 + arg0.field1198 * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.field1200 = 1280;
					} else if (var4 > var6) {
						arg0.field1200 = 1792;
					} else {
						arg0.field1200 = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.field1200 = 768;
					} else if (var4 > var6) {
						arg0.field1200 = 256;
					} else {
						arg0.field1200 = 512;
					}
				} else if (var4 < var6) {
					arg0.field1200 = 1024;
				} else {
					arg0.field1200 = 0;
				}

				int var7 = arg0.field1200 - arg0.field1159 & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.field1195;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.field1194;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.field1197;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.field1196;
				}

				if (var8 == -1) {
					var8 = arg0.field1194;
				}

				arg0.field1163 = var8;
				int var9 = 4;
				if (arg0.field1200 != arg0.field1159 && arg0.field1166 == -1 && arg0.field1201 != 0) {
					var9 = 2;
				}

				if (arg0.field1199 > 2) {
					var9 = 6;
				}

				if (arg0.field1199 > 3) {
					var9 = 8;
				}

				if (arg0.field1182 > 0 && arg0.field1199 > 1) {
					var9 = 8;
					arg0.field1182--;
				}

				if (arg0.field1161[arg0.field1199 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.field1194 == arg0.field1163 && arg0.field1174 != -1) {
					arg0.field1163 = arg0.field1174;
				}

				if (var3 < var5) {
					arg0.field1157 += var9;
					if (arg0.field1157 > var5) {
						arg0.field1157 = var5;
					}
				} else if (var3 > var5) {
					arg0.field1157 -= var9;
					if (arg0.field1157 < var5) {
						arg0.field1157 = var5;
					}
				}

				if (var4 < var6) {
					arg0.field1158 += var9;
					if (arg0.field1158 > var6) {
						arg0.field1158 = var6;
					}
				} else if (var4 > var6) {
					arg0.field1158 -= var9;
					if (arg0.field1158 < var6) {
						arg0.field1158 = var6;
					}
				}

				if (arg0.field1157 == var5 && arg0.field1158 == var6) {
					arg0.field1199--;

					if (arg0.field1150 > 0) {
						arg0.field1150--;
						return;
					}
				}
			} else {
				arg0.field1157 = var5;
				arg0.field1158 = var6;
			}
		}
	}

	@ObfuscatedName("client.c(ILQMQRUGDN;)V")
	public final void method81(QMQRUGDN arg0) {
		if (arg0.field1201 != 0) {
			if (arg0.field1166 != -1 && arg0.field1166 < 32768) {
				AVKLDTFF var2 = field192[arg0.field1166];
				if (var2 != null) {
					int var3 = arg0.field1157 - var2.field1157;
					int var4 = arg0.field1158 - var2.field1158;
					if (var3 != 0 || var4 != 0) {
						arg0.field1200 = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.field1166 >= 32768) {
				int var5 = arg0.field1166 - 32768;
				if (field71 == var5) {
					var5 = field215;
				}

				LAKHMHBY var6 = field216[var5];
				if (var6 != null) {
					int var7 = arg0.field1157 - var6.field1157;
					int var8 = arg0.field1158 - var6.field1158;
					if (var7 != 0 || var8 != 0) {
						arg0.field1200 = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.field1178 != 0 || arg0.field1179 != 0) && (arg0.field1199 == 0 || arg0.field1182 > 0)) {
				int var9 = arg0.field1157 - (arg0.field1178 - field184 - field184) * 64;
				int var10 = arg0.field1158 - (arg0.field1179 - field185 - field185) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.field1200 = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.field1178 = 0;
				arg0.field1179 = 0;
			}

			int var11 = arg0.field1200 - arg0.field1159 & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.field1201 || var11 > 2048 - arg0.field1201) {
					arg0.field1159 = arg0.field1200;
				} else if (var11 > 1024) {
					arg0.field1159 -= arg0.field1201;
				} else {
					arg0.field1159 += arg0.field1201;
				}

				arg0.field1159 &= 0x7FF;
				if (arg0.field1183 == arg0.field1163 && arg0.field1200 != arg0.field1159) {
					if (arg0.field1184 != -1) {
						arg0.field1163 = arg0.field1184;
						return;
					}

					arg0.field1163 = arg0.field1194;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLQMQRUGDN;)V")
	public final void method82(QMQRUGDN arg0) {
		arg0.field1172 = false;

		if (arg0.field1163 != -1) {
			NMXKUYSC var2 = NMXKUYSC.field998[arg0.field1163];
			arg0.field1165++;
			if (arg0.field1164 < var2.field999 && arg0.field1165 > var2.method415(arg0.field1164)) {
				arg0.field1165 = 0;
				arg0.field1164++;
			}

			if (arg0.field1164 >= var2.field999) {
				arg0.field1165 = 0;
				arg0.field1164 = 0;
			}
		}

		if (arg0.field1167 != -1 && field425 >= arg0.field1170) {
			if (arg0.field1168 < 0) {
				arg0.field1168 = 0;
			}

			NMXKUYSC var3 = FULHVSIU.field604[arg0.field1167].field608;
			arg0.field1169++;
			while (arg0.field1168 < var3.field999 && arg0.field1169 > var3.method415(arg0.field1168)) {
				arg0.field1169 -= var3.method415(arg0.field1168);
				arg0.field1168++;
			}

			if (arg0.field1168 >= var3.field999 && (arg0.field1168 < 0 || arg0.field1168 >= var3.field999)) {
				arg0.field1167 = -1;
			}
		}

		if (arg0.field1151 != -1 && arg0.field1154 <= 1) {
			NMXKUYSC var4 = NMXKUYSC.field998[arg0.field1151];
			if (var4.field1010 == 1 && arg0.field1150 > 0 && arg0.field1189 <= field425 && arg0.field1190 < field425) {
				arg0.field1154 = 1;
				return;
			}
		}

		if (arg0.field1151 != -1 && arg0.field1154 == 0) {
			NMXKUYSC var5 = NMXKUYSC.field998[arg0.field1151];
			arg0.field1153++;
			while (arg0.field1152 < var5.field999 && arg0.field1153 > var5.method415(arg0.field1152)) {
				arg0.field1153 -= var5.method415(arg0.field1152);
				arg0.field1152++;
			}

			if (arg0.field1152 >= var5.field999) {
				arg0.field1152 -= var5.field1003;
				arg0.field1155++;
				if (arg0.field1155 >= var5.field1009) {
					arg0.field1151 = -1;
				}

				if (arg0.field1152 < 0 || arg0.field1152 >= var5.field999) {
					arg0.field1151 = -1;
				}
			}

			arg0.field1172 = var5.field1005;
		}

		if (arg0.field1154 > 0) {
			arg0.field1154--;
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void method83() {
		if (field369) {
			field369 = false;
			field315.method177(4, field688, 0);
			field316.method177(357, field688, 0);
			field317.method177(4, field688, 722);
			field318.method177(205, field688, 743);
			field319.method177(0, field688, 0);
			field320.method177(4, field688, 516);
			field321.method177(205, field688, 516);
			field322.method177(357, field688, 496);
			field323.method177(338, field688, 0);
			field431 = true;
			field195 = true;
			field140 = true;
			field366 = true;

			if (field252 != 2) {
				field211.method177(4, field688, 4);
				field210.method177(4, field688, 550);
			}

			field287++;
			if (field287 > 90) {
				field287 = 0;
				field132.method510(68);
			}
		}

		if (field252 == 2) {
			method38();
		}

		if (field348 && field401 == 1) {
			field431 = true;
		}

		if (field382 != -1) {
			boolean var1 = method86(field382, field476);
			if (var1) {
				field431 = true;
			}
		}

		if (field282 == 2) {
			field431 = true;
		}

		if (field199 == 2) {
			field431 = true;
		}

		if (field431) {
			method63();
			field431 = false;
		}

		if (field299 == -1) {
			field406.field1118 = field260 - field456 - 77;

			if (field696 > 448 && field696 < 560 && field697 > 332) {
				method102(field260, field696 - 17, field406, false, 0, 463, 77, field697 - 357);
			}

			int var2 = field260 - field406.field1118 - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > field260 - 77) {
				var2 = field260 - 77;
			}

			if (field456 != var2) {
				field456 = var2;
				field195 = true;
			}
		}

		if (field299 != -1) {
			boolean var3 = method86(field299, field476);
			if (var3) {
				field195 = true;
			}
		}

		if (field282 == 3) {
			field195 = true;
		}

		if (field199 == 3) {
			field195 = true;
		}

		if (field415 != null) {
			field195 = true;
		}

		if (field348 && field401 == 2) {
			field195 = true;
		}

		if (field195) {
			method107();
			field195 = false;
		}

		if (field252 == 2) {
			method116();
			field210.method177(4, field688, 550);
		}

		if (field330 != -1) {
			field140 = true;
		}

		if (field140) {
			if (field330 != -1 && field333 == field330) {
				field330 = -1;
				field132.method510(128);
				field132.method511(field333);
			}

			field140 = false;
			field420.method176();
			field423.method186(0, 0);

			if (field382 == -1) {
				if (field81[field333] != -1) {
					if (field333 == 0) {
						field134.method186(10, 22);
					}

					if (field333 == 1) {
						field135.method186(8, 54);
					}

					if (field333 == 2) {
						field135.method186(8, 82);
					}

					if (field333 == 3) {
						field136.method186(8, 110);
					}

					if (field333 == 4) {
						field138.method186(8, 153);
					}

					if (field333 == 5) {
						field138.method186(8, 181);
					}

					if (field333 == 6) {
						field137.method186(9, 209);
					}
				}

				if (field81[0] != -1 && (field330 != 0 || field425 % 20 < 10)) {
					field118[0].method186(13, 29);
				}

				if (field81[1] != -1 && (field330 != 1 || field425 % 20 < 10)) {
					field118[1].method186(11, 53);
				}

				if (field81[2] != -1 && (field330 != 2 || field425 % 20 < 10)) {
					field118[2].method186(11, 82);
				}

				if (field81[3] != -1 && (field330 != 3 || field425 % 20 < 10)) {
					field118[3].method186(12, 115);
				}

				if (field81[4] != -1 && (field330 != 4 || field425 % 20 < 10)) {
					field118[4].method186(13, 153);
				}

				if (field81[5] != -1 && (field330 != 5 || field425 % 20 < 10)) {
					field118[5].method186(11, 180);
				}

				if (field81[6] != -1 && (field330 != 6 || field425 % 20 < 10)) {
					field118[6].method186(13, 208);
				}
			}

			field420.method177(160, field688, 516);
			field419.method176();
			field422.method186(0, 0);

			if (field382 == -1) {
				if (field81[field333] != -1) {
					if (field333 == 7) {
						field383.method186(0, 42);
					}

					if (field333 == 8) {
						field384.method186(0, 74);
					}

					if (field333 == 9) {
						field384.method186(0, 102);
					}

					if (field333 == 10) {
						field385.method186(1, 130);
					}

					if (field333 == 11) {
						field387.method186(0, 173);
					}

					if (field333 == 12) {
						field387.method186(0, 201);
					}

					if (field333 == 13) {
						field386.method186(0, 229);
					}
				}

				if (field81[8] != -1 && (field330 != 8 || field425 % 20 < 10)) {
					field118[7].method186(2, 74);
				}

				if (field81[9] != -1 && (field330 != 9 || field425 % 20 < 10)) {
					field118[8].method186(3, 102);
				}

				if (field81[10] != -1 && (field330 != 10 || field425 % 20 < 10)) {
					field118[9].method186(4, 137);
				}

				if (field81[11] != -1 && (field330 != 11 || field425 % 20 < 10)) {
					field118[10].method186(2, 174);
				}

				if (field81[12] != -1 && (field330 != 12 || field425 % 20 < 10)) {
					field118[11].method186(2, 201);
				}

				if (field81[13] != -1 && (field330 != 13 || field425 % 20 < 10)) {
					field118[12].method186(2, 226);
				}
			}

			field419.method177(466, field688, 496);
			field211.method176();
		}

		if (field366) {
			field366 = false;
			field418.method176();
			field421.method186(0, 0);
			field254.method16(true, "Public chat", 55, 28, 0xFFFFFF);

			if (field172 == 0) {
				field254.method16(true, "On", 55, 41, 0xFF00);
			}

			if (field172 == 1) {
				field254.method16(true, "Friends", 55, 41, 0xFFFF00);
			}

			if (field172 == 2) {
				field254.method16(true, "Off", 55, 41, 0xFF0000);
			}

			if (field172 == 3) {
				field254.method16(true, "Hide", 55, 41, 0xFFFF);
			}

			field254.method16(true, "Private chat", 184, 28, 0xFFFFFF);

			if (field414 == 0) {
				field254.method16(true, "On", 184, 41, 0xFF00);
			}

			if (field414 == 1) {
				field254.method16(true, "Friends", 184, 41, 0xFFFF00);
			}

			if (field414 == 2) {
				field254.method16(true, "Off", 184, 41, 0xFF0000);
			}

			field254.method16(true, "Trade/compete", 324, 28, 0xFFFFFF);

			if (field156 == 0) {
				field254.method16(true, "On", 324, 41, 0xFF00);
			}

			if (field156 == 1) {
				field254.method16(true, "Friends", 324, 41, 0xFFFF00);
			}

			if (field156 == 2) {
				field254.method16(true, "Off", 324, 41, 0xFF0000);
			}

			field254.method16(true, "Report abuse", 458, 33, 0xFFFFFF);
			field418.method177(453, field688, 0);
			field211.method176();
		}

		field476 = 0;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method84() {
		short var1 = 256;

		if (field438 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field438 > 768) {
					field242[var2] = method40(1024 - field438, field244[var2], field243[var2]);
				} else if (field438 > 256) {
					field242[var2] = field244[var2];
				} else {
					field242[var2] = method40(256 - field438, field243[var2], field244[var2]);
				}
			}
		} else if (field439 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (field439 > 768) {
					field242[var3] = method40(1024 - field439, field245[var3], field243[var3]);
				} else if (field439 > 256) {
					field242[var3] = field245[var3];
				} else {
					field242[var3] = method40(256 - field439, field243[var3], field245[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				field242[var4] = field243[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			field176.field477[var5] = field412.field1338[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * field240[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = field454[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = field242[var12];
					int var15 = field176.field477[var7];
					field176.field477[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		field176.method177(0, field688, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			field177.field477[var16] = field413.field1338[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * field240[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = field454[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = field242[var23];
					int var26 = field177.field477[var18];
					field177.field477[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		field177.method177(0, field688, 637);
	}

	@ObfuscatedName("client.i(Z)V")
	public final void method85() {
		for (IRATNZCY var1 = (IRATNZCY) field301.method332(); var1 != null; var1 = (IRATNZCY) field301.method334()) {
			if (var1.field834 == -1) {
				var1.field829 = 0;
				method109(var1);
			} else {
				var1.method471();
			}
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method86(int arg0, int arg1) {
		boolean var3 = false;
		PFVGIFDY var4 = PFVGIFDY.field1078[arg0];
		for (int var5 = 0; var5 < var4.field1088.length && var4.field1088[var5] != -1; var5++) {
			PFVGIFDY var6 = PFVGIFDY.field1078[var4.field1088[var5]];
			if (var6.field1092 == 1) {
				var3 |= method86(var6.field1117, arg1);
			}

			if (var6.field1092 == 6 && (var6.field1129 != -1 || var6.field1130 != -1)) {
				boolean var7 = method112(var6);
				int var8;
				if (var7) {
					var8 = var6.field1130;
				} else {
					var8 = var6.field1129;
				}

				if (var8 != -1) {
					NMXKUYSC var9 = NMXKUYSC.field998[var8];
					var6.field1072 += arg1;
					while (var6.field1072 > var9.method415(var6.field1126)) {
						var6.field1072 -= var9.method415(var6.field1126) + 1;
						var6.field1126++;
						if (var6.field1126 >= var9.field999) {
							var6.field1126 -= var9.field1003;
							if (var6.field1126 < 0 || var6.field1126 >= var9.field999) {
								var6.field1126 = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.b(IB)V")
	public final void method87(int arg0) {
		PFVGIFDY var2 = PFVGIFDY.field1078[arg0];
		for (int var3 = 0; var3 < var2.field1088.length && var2.field1088[var3] != -1; var3++) {
			PFVGIFDY var4 = PFVGIFDY.field1078[var2.field1088[var3]];
			if (var4.field1092 == 1) {
				method87(var4.field1117);
			}

			var4.field1126 = 0;
			var4.field1072 = 0;
		}
	}

	@ObfuscatedName("client.b(LXOUQUKZW;II)V")
	public final void method88(XOUQUKZW arg0, int arg1) {
		arg0.method531();
		int var3 = arg0.method532(1);
		if (var3 != 0) {
			int var4 = arg0.method532(2);
			if (var4 == 0) {
				field220[field219++] = field215;
			} else if (var4 == 1) {
				int var5 = arg0.method532(3);
				field97.method457(false, var5);
				int var6 = arg0.method532(1);
				if (var6 == 1) {
					field220[field219++] = field215;
				}
			} else if (var4 == 2) {
				int var7 = arg0.method532(3);
				field97.method457(true, var7);
				int var8 = arg0.method532(3);
				field97.method457(true, var8);
				int var9 = arg0.method532(1);
				if (var9 == 1) {
					field220[field219++] = field215;
				}
			} else if (var4 == 3) {
				int var10 = arg0.method532(1);
				int var11 = arg0.method532(7);
				int var12 = arg0.method532(7);
				field105 = arg0.method532(2);
				int var13 = arg0.method532(1);
				if (var13 == 1) {
					field220[field219++] = field215;
				}

				field97.method454(var11, var12, var10 == 1);
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method89() {
		int var1 = field355 * 128 + 64;
		int var2 = field356 * 128 + 64;
		int var3 = method119(field105, var2, var1) - field357;

		if (field426 < var1) {
			field426 += (var1 - field426) * field359 / 1000 + field358;
			if (field426 > var1) {
				field426 = var1;
			}
		}

		if (field426 > var1) {
			field426 -= (field426 - var1) * field359 / 1000 + field358;
			if (field426 < var1) {
				field426 = var1;
			}
		}

		if (field427 < var3) {
			field427 += (var3 - field427) * field359 / 1000 + field358;
			if (field427 > var3) {
				field427 = var3;
			}
		}

		if (field427 > var3) {
			field427 -= (field427 - var3) * field359 / 1000 + field358;
			if (field427 < var3) {
				field427 = var3;
			}
		}

		if (field428 < var2) {
			field428 += (var2 - field428) * field359 / 1000 + field358;
			if (field428 > var2) {
				field428 = var2;
			}
		}

		if (field428 > var2) {
			field428 -= (field428 - var2) * field359 / 1000 + field358;
			if (field428 < var2) {
				field428 = var2;
			}
		}

		int var4 = field84 * 128 + 64;
		int var5 = field85 * 128 + 64;
		int var6 = method119(field105, var5, var4) - field86;
		int var7 = var4 - field426;
		int var8 = var6 - field427;
		int var9 = var5 - field428;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (field429 < var11) {
			field429 += (var11 - field429) * field88 / 1000 + field87;
			if (field429 > var11) {
				field429 = var11;
			}
		}

		if (field429 > var11) {
			field429 -= (field429 - var11) * field88 / 1000 + field87;
			if (field429 < var11) {
				field429 = var11;
			}
		}

		int var13 = var12 - field430;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			field430 += field88 * var13 / 1000 + field87;
			field430 &= 0x7FF;
		}

		if (var13 < 0) {
			field430 -= -var13 * field88 / 1000 + field87;
			field430 &= 0x7FF;
		}

		int var14 = var12 - field430;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			field430 = var12;
		}
	}

	@ObfuscatedName("client.a(IIILVDSDFSIV;)V")
	public final void method90(int arg0, int arg1, VDSDFSIV arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = field62 + field457 & 0x7FF;
			int var6 = KPUOCBCE.field920[var5];
			int var7 = KPUOCBCE.field921[var5];
			var6 = var6 * 256 / (field202 + 256);
			var7 = var7 * 256 / (field202 + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			field73.method504(15, 256, 20, 83 - var13 - 20, 20, 15, var12 + 94 + 4 - 10, var10);
		} else {
			method145(arg1, arg2, arg0);
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method91(boolean arg0) {
		if (field97.field1157 >> 7 == field407 && field97.field1158 >> 7 == field408) {
			field407 = 0;
		}

		int var2 = field217;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			LAKHMHBY var4;
			int var5;
			if (arg0) {
				var4 = field97;
				var5 = field215 << 14;
			} else {
				var4 = field216[field218[var3]];
				var5 = field218[var3] << 14;
			}

			if (var4 != null && var4.method12()) {
				var4.field961 = false;
				if ((field160 && field217 > 50 || field217 > 200) && !arg0 && var4.field1183 == var4.field1163) {
					var4.field961 = true;
				}

				int var6 = var4.field1157 >> 7;
				int var7 = var4.field1158 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field954 == null || field425 < var4.field940 || field425 >= var4.field941) {
						if ((var4.field1157 & 0x7F) == 0x40 && (var4.field1158 & 0x7F) == 0x40) {
							if (field274[var6][var7] == field353) {
								continue;
							}

							field274[var6][var7] = field353;
						}

						var4.field957 = method119(field105, var4.field1158, var4.field1157);
						field349.method244(var4.field1159, var4, var5, var4.field1157, var4.field1158, var4.field1172, var4.field957, 60, field105);
					} else {
						var4.field961 = false;
						var4.field957 = method119(field105, var4.field1158, var4.field1157);
						field349.method245(var4.field1158, var4.field947, field105, var4.field946, var4.field949, var5, var4.field1159, var4.field948, var4.field957, var4.field1157, 60, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void method92() {
		if (field133 || field312 || field115) {
			method153();
		} else {
			field381++;

			if (field150) {
				method83();
			} else {
				method49(false);
			}

			field109 = 0;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method93(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.method93(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void method94() {
		field132.method510(13);

		if (field382 != -1) {
			field382 = -1;
			field431 = true;
			field77 = false;
			field140 = true;
		}

		if (field299 != -1) {
			field299 = -1;
			field195 = true;
			field77 = false;
		}

		field392 = -1;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 1 && arg4 >= 1 && arg0 <= 102 && arg4 <= 102) {
			if (field160 && field105 != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = field349.method259(arg5, arg0, arg4);
			}

			if (arg3 == 1) {
				var8 = field349.method260(arg4, arg0, arg5);
			}

			if (arg3 == 2) {
				var8 = field349.method261(arg5, arg0, arg4);
			}

			if (arg3 == 3) {
				var8 = field349.method262(arg5, arg0, arg4);
			}

			if (var8 != 0) {
				int var12 = field349.method263(arg5, arg0, arg4, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					field349.method250(arg5, arg0, arg4);
					SCWSBSIM var16 = SCWSBSIM.method464(var13);
					if (var16.field1274) {
						field326[arg5].method574(var16.field1272, arg4, var15, arg0, var14);
					}
				}

				if (arg3 == 1) {
					field349.method251(arg5, arg4, arg0);
				}

				if (arg3 == 2) {
					field349.method252(arg5, arg0, arg4);
					SCWSBSIM var17 = SCWSBSIM.method464(var13);
					if (var17.field1249 + arg0 > 103 || var17.field1249 + arg4 > 103 || var17.field1283 + arg0 > 103 || var17.field1283 + arg4 > 103) {
						return;
					}

					if (var17.field1274) {
						field326[arg5].method575(var15, arg4, var17.field1272, var17.field1283, var17.field1249, arg0);
					}
				}

				if (arg3 == 3) {
					field349.method253(arg5, arg4, arg0);
					SCWSBSIM var18 = SCWSBSIM.method464(var13);
					if (var18.field1274 && var18.field1252) {
						field326[arg5].method577(arg4, arg0);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (field440[1][arg0][arg4] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				DWQOSSFD.method197(arg4, field349, field326[arg5], field314, arg1, arg5, arg6, arg0, arg2, var19);
				return;
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method96() {
		try {
			if (field269 != null) {
				field269.method1();
			}
		} catch (Exception var2) {
		}

		field269 = null;
		field150 = false;
		field309 = 0;
		field351 = "";
		field352 = "";
		method147();
		field349.method233();

		for (int var1 = 0; var1 < 4; var1++) {
			field326[var1].method569();
		}

		System.gc();
		method64();
		field239 = -1;
		field397 = -1;
		field190 = 0;
	}

	@ObfuscatedName("client.c(LXOUQUKZW;II)V")
	public final void method97(XOUQUKZW arg0, int arg1) {
		for (int var3 = 0; var3 < field219; var3++) {
			int var4 = field220[var3];
			AVKLDTFF var5 = field192[var4];
			int var6 = arg0.method521();
			if ((var6 & 0x10) != 0) {
				var5.field1181 = arg0.method528();
				var5.field1173 = 100;
			}

			if ((var6 & 0x80) != 0) {
				var5.field36 = HQFMWUSH.method309(arg0.method523());
				var5.field1198 = var5.field36.field791;
				var5.field1201 = var5.field36.field783;
				var5.field1194 = var5.field36.field777;
				var5.field1195 = var5.field36.field770;
				var5.field1196 = var5.field36.field794;
				var5.field1197 = var5.field36.field797;
				var5.field1183 = var5.field36.field799;
			}

			if ((var6 & 0x4) != 0) {
				int var7 = arg0.method550();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg0.method539();
				if (var5.field1151 == var7 && var7 != -1) {
					int var9 = NMXKUYSC.field998[var7].field1012;
					if (var9 == 1) {
						var5.field1152 = 0;
						var5.field1153 = 0;
						var5.field1154 = var8;
						var5.field1155 = 0;
					}

					if (var9 == 2) {
						var5.field1155 = 0;
					}
				} else if (var7 == -1 || var5.field1151 == -1 || NMXKUYSC.field998[var7].field1006 >= NMXKUYSC.field998[var5.field1151].field1006) {
					var5.field1151 = var7;
					var5.field1152 = 0;
					var5.field1153 = 0;
					var5.field1154 = var8;
					var5.field1155 = 0;
					var5.field1150 = var5.field1199;
				}
			}

			if ((var6 & 0x2) != 0) {
				var5.field1178 = arg0.method550();
				var5.field1179 = arg0.method550();
			}

			if ((var6 & 0x40) != 0) {
				var5.field1166 = arg0.method523();
				if (var5.field1166 == 0xFFFF) {
					var5.field1166 = -1;
				}
			}

			if ((var6 & 0x8) != 0) {
				var5.field1167 = arg0.method550();
				int var10 = arg0.method554();
				var5.field1171 = var10 >> 16;
				var5.field1170 = (var10 & 0xFFFF) + field425;
				var5.field1168 = 0;
				var5.field1169 = 0;

				if (var5.field1170 > field425) {
					var5.field1168 = -1;
				}

				if (var5.field1167 == 0xFFFF) {
					var5.field1167 = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				int var11 = arg0.method540();
				int var12 = arg0.method521();
				var5.method455(var12, field425, var11);
				var5.field1175 = field425 + 300;
				var5.field1176 = arg0.method521();
				var5.field1177 = arg0.method521();
			}

			if ((var6 & 0x20) != 0) {
				int var13 = arg0.method539();
				int var14 = arg0.method521();
				var5.method455(var14, field425, var13);
				var5.field1175 = field425 + 300;
				var5.field1176 = arg0.method541();
				var5.field1177 = arg0.method541();
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method98() {
		for (int var1 = 0; var1 < field102; var1++) {
			if (field238[var1] <= 0) {
				boolean var2 = false;
				try {
					if (field153[var1] != field59 || field189[var1] != field347) {
						XOUQUKZW var3 = ZTSFQLLW.method587(field189[var1], field153[var1]);
						if (System.currentTimeMillis() + var3.field1367 / 22 > field119 / 22 + field65) {
							field119 = var3.field1367;
							field65 = System.currentTimeMillis();

							if (method123(var3.field1366, var3.field1367)) {
								field59 = field153[var1];
								field347 = field189[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!method133()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && field238[var1] != -5) {
					field238[var1] = -5;
				} else {
					field102--;
					for (int var5 = var1; var5 < field102; var5++) {
						field153[var5] = field153[var5 + 1];
						field189[var5] = field189[var5 + 1];
						field238[var5] = field238[var5 + 1];
					}

					var1--;
				}
			} else {
				field238[var1]--;
			}
		}

		if (field190 > 0) {
			field190 -= 20;
			if (field190 < 0) {
				field190 = 0;
			}

			if (field190 == 0 && field155 && !field160) {
				field397 = field239;
				field398 = true;
				field225.method478(2, field397);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IIII)Z")
	public final boolean method99(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 14 & 0x7FFF;
		int var5 = field349.method263(field105, arg0, arg2, arg1);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			SCWSBSIM var8 = SCWSBSIM.method464(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.field1249;
				var10 = var8.field1283;
			} else {
				var9 = var8.field1283;
				var10 = var8.field1249;
			}

			int var11 = var8.field1267;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			method126(var9, arg2, 0, 2, field97.field1192[0], var11, arg0, false, field97.field1193[0], var10, 0);
		} else {
			method126(0, arg2, var6 + 1, 2, field97.field1192[0], 0, arg0, false, field97.field1193[0], 0, var7);
		}

		field470 = field703;
		field471 = field704;
		field473 = 2;
		field472 = 0;
		return true;
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IILjava/lang/String;)V")
	public final void method100(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && field327 != -1) {
			field415 = arg2;
			field702 = 0;
		}

		if (field299 == -1) {
			field195 = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			field362[var4] = field362[var4 - 1];
			field363[var4] = field363[var4 - 1];
			field364[var4] = field364[var4 - 1];
		}

		field362[0] = arg1;
		field363[0] = arg0;
		field364[0] = arg2;
	}

	@ObfuscatedName("client.b(II)V")
	public final void method101(int arg0) {
		int[] var2 = field409.field1338;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((field440[arg0][var7][var5] & 0x18) == 0) {
					field349.method268(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (field440[arg0 + 1][var7][var5] & 0x8) != 0) {
					field349.method268(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		field409.method494();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((field440[arg0][var11][var10] & 0x18) == 0) {
					method45(var11, var8, arg0, var10, var9);
				}

				if (arg0 < 3 && (field440[arg0 + 1][var11][var10] & 0x8) != 0) {
					method45(var11, var8, arg0 + 1, var10, var9);
				}
			}
		}

		field211.method176();
		field130++;
		if (field130 > 146) {
			field130 = 0;
			field132.method510(88);
			field132.method512(62406);
		}

		field141 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = field349.method262(field105, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = SCWSBSIM.method464(var14).field1256;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = field326[field105].field1416;
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

						field78[field141] = field313[var15];
						field142[field141] = var16;
						field143[field141] = var17;
						field141++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILPFVGIFDY;ZIIIII)V")
	public final void method102(int arg0, int arg1, PFVGIFDY arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field183) {
			field271 = 32;
		} else {
			field271 = 0;
		}

		field183 = false;
		if (arg1 >= arg5 && arg1 < arg5 + 16 && arg7 >= arg4 && arg7 < arg4 + 16) {
			arg2.field1118 -= field109 * 4;

			if (arg3) {
				field431 = true;
				return;
			}
		} else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg7 >= arg4 + arg6 - 16 && arg7 < arg4 + arg6) {
			arg2.field1118 += field109 * 4;

			if (arg3) {
				field431 = true;
				return;
			}
		} else if (arg1 >= arg5 - field271 && arg1 < arg5 + field271 + 16 && arg7 >= arg4 + 16 && arg7 < arg4 + arg6 - 16 && field109 > 0) {
			int var9 = (arg6 - 32) * arg6 / arg0;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg7 - arg4 - var9 / 2 - 16;
			int var11 = arg6 - var9 - 32;
			arg2.field1118 = (arg0 - arg6) * var10 / var11;

			if (arg3) {
				field431 = true;
			}

			field183 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void method103() {
		byte[] var1 = field262.method180("title.dat", null);
		VDSDFSIV var2 = new VDSDFSIV(var1, this);
		field176.method176();
		var2.method497(0, 0);
		field177.method176();
		var2.method497(-637, 0);
		field173.method176();
		var2.method497(-128, 0);
		field174.method176();
		var2.method497(-202, -371);
		field175.method176();
		var2.method497(-202, -171);
		field178.method176();
		var2.method497(0, -265);
		field179.method176();
		var2.method497(-562, -265);
		field180.method176();
		var2.method497(-128, -171);
		field181.method176();
		var2.method497(-562, -171);
		int[] var3 = new int[var2.field1339];
		for (int var4 = 0; var4 < var2.field1340; var4++) {
			for (int var5 = 0; var5 < var2.field1339; var5++) {
				var3[var5] = var2.field1338[var2.field1339 * var4 + var2.field1339 - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.field1339; var6++) {
				var2.field1338[var2.field1339 * var4 + var6] = var3[var6];
			}
		}

		field176.method176();
		var2.method497(382, 0);
		field177.method176();
		var2.method497(-255, 0);
		field173.method176();
		var2.method497(254, 0);
		field174.method176();
		var2.method497(180, -371);
		field175.method176();
		var2.method497(180, -171);
		field178.method176();
		var2.method497(382, -265);
		field179.method176();
		var2.method497(-180, -265);
		field180.method176();
		var2.method497(254, -171);
		field181.method176();
		var2.method497(-180, -171);
		VDSDFSIV var7 = new VDSDFSIV(field262, "logo", 0);
		field173.method176();
		var7.method499(18, 382 - var7.field1339 / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.v(I)V")
	public final void method104() {
		if (field160 && field252 == 2 && DWQOSSFD.field542 != field105) {
			field211.method176();
			field254.method15(151, 257, 0, "Loading - please wait.");
			field254.method15(150, 256, 0xFFFFFF, "Loading - please wait.");
			field211.method177(4, field688, 4);
			field252 = 1;
			field66 = System.currentTimeMillis();
		}

		if (field252 == 1) {
			int var1 = method105();
			if (var1 != 0 && System.currentTimeMillis() - field66 > 360000L) {
				signlink.reporterror(field351 + " glcfb " + field339 + "," + var1 + "," + field160 + "," + field196[0] + "," + field225.method487() + "," + field105 + "," + field233 + "," + field234);
				field66 = System.currentTimeMillis();
			}
		}

		if (field252 == 2 && field449 != field105) {
			field449 = field105;
			method101(field105);
		}
	}

	@ObfuscatedName("client.w(I)I")
	public final int method105() {
		for (int var1 = 0; var1 < field459.length; var1++) {
			if (field459[var1] == null && field112[var1] != -1) {
				return -1;
			}

			if (field370[var1] == null && field113[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < field459.length; var3++) {
			byte[] var4 = field370[var3];
			if (var4 != null) {
				int var5 = (field111[var3] >> 8) * 64 - field184;
				int var6 = (field111[var3] & 0xFF) * 64 - field185;
				if (field329) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= DWQOSSFD.method191(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (field213) {
			return -4;
		} else {
			field252 = 2;
			DWQOSSFD.field542 = field105;
			method125();
			field132.method510(246);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		IRATNZCY var10 = null;
		for (IRATNZCY var11 = (IRATNZCY) field301.method332(); var11 != null; var11 = (IRATNZCY) field301.method334()) {
			if (var11.field830 == arg8 && var11.field832 == arg3 && var11.field833 == arg0 && var11.field831 == arg4) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new IRATNZCY();
			var10.field830 = arg8;
			var10.field831 = arg4;
			var10.field832 = arg3;
			var10.field833 = arg0;
			method109(var10);
			field301.method329(var10);
		}

		var10.field835 = arg6;
		var10.field837 = arg5;
		var10.field836 = arg2;
		var10.field829 = arg1;
		var10.field834 = arg7;
	}

	@ObfuscatedName("client.x(I)V")
	public final void method107() {
		field212.method176();
		OIDJTTQC.field1060 = field445;
		field248.method186(0, 0);

		if (field144) {
			field255.method15(40, 239, 0, field261);
			field255.method15(60, 239, 128, field400 + "*");
		} else if (field122 == 1) {
			field255.method15(40, 239, 0, "Enter amount:");
			field255.method15(60, 239, 128, field103 + "*");
		} else if (field122 == 2) {
			field255.method15(40, 239, 0, "Enter name:");
			field255.method15(60, 239, 128, field103 + "*");
		} else if (field415 != null) {
			field255.method15(40, 239, 0, field415);
			field255.method15(60, 239, 128, "Click to continue");
		} else if (field299 != -1) {
			method128(0, 0, PFVGIFDY.field1078[field299], 0);
		} else if (field327 == -1) {
			BFOGRMWS var1 = field254;
			int var2 = 0;
			IIPNJDNO.method319(463, 0, 0, 77);

			for (int var3 = 0; var3 < 100; var3++) {
				if (field364[var3] != null) {
					int var4 = field362[var3];
					int var5 = field456 + 70 - var2 * 14;
					String var6 = field363[var3];
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
							var1.method19(field364[var3], 0, var5, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field172 == 0 || field172 == 1 && method161(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field91[0].method186(var5 - 12, var8);
								var8 += 14;
							}

							if (var7 == 2) {
								field91[1].method186(var5 - 12, var8);
								var8 += 14;
							}

							var1.method19(var6 + ":", 0, var5, var8);
							var8 += var1.method17(var6) + 8;
							var1.method19(field364[var3], 255, var5, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && field126 == 0 && (var4 == 7 || field414 == 0 || field414 == 1 && method161(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.method19("From", 0, var5, var9);
							int var11 = var9 + var1.method17("From ");
							if (var7 == 1) {
								field91[0].method186(var5 - 12, var11);
								var11 += 14;
							}

							if (var7 == 2) {
								field91[1].method186(var5 - 12, var11);
								var11 += 14;
							}

							var1.method19(var6 + ":", 0, var5, var11);
							var11 += var1.method17(var6) + 8;
							var1.method19(field364[var3], 0x800000, var5, var11);
						}

						var2++;
					}

					if (var4 == 4 && (field156 == 0 || field156 == 1 && method161(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method19(var6 + " " + field364[var3], 0x800080, var5, 4);
						}

						var2++;
					}

					if (var4 == 5 && field126 == 0 && field414 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method19(field364[var3], 0x800000, var5, 4);
						}

						var2++;
					}

					if (var4 == 6 && field126 == 0 && field414 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method19("To " + var6 + ":", 0, var5, 4);
							var1.method19(field364[var3], 0x800000, var5, var1.method17("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (field156 == 0 || field156 == 1 && method161(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method19(var6 + " " + field364[var3], 0x7E3200, var5, 4);
						}

						var2++;
					}
				}
			}

			IIPNJDNO.method318();
			field260 = var2 * 14 + 7;
			if (field260 < 78) {
				field260 = 78;
			}

			method124(463, 0, field260, 77, field260 - field456 - 77);
			String var10;
			if (field97 == null || field97.field960 == null) {
				var10 = YBENSMAZ.method567(field351);
			} else {
				var10 = field97.field960;
			}

			var1.method19(var10 + ":", 0, 90, 4);
			var1.method19(field424 + "*", 255, 90, var1.method17(var10 + ": ") + 6);
			IIPNJDNO.method325(0, 479, 0, 77);
		} else {
			method128(0, 0, PFVGIFDY.field1078[field327], 0);
		}

		if (field348 && field401 == 2) {
			method70();
		}

		field212.method177(357, field688, 17);
		field211.method176();
		OIDJTTQC.field1060 = field447;
	}

	@ObfuscatedName("client.a(ILPFVGIFDY;)Z")
	public final boolean method108(PFVGIFDY arg0) {
		int var2 = arg0.field1094;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				field125[field416] = "Remove @whi@" + arg0.field1106;
				field443[field416] = 670;
				field416++;
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

		field125[field416] = "Remove @whi@" + field226[var2];
		field443[field416] = 324;
		field416++;
		field125[field416] = "Message @whi@" + field226[var2];
		field443[field416] = 394;
		field416++;
		return true;
	}

	@ObfuscatedName("client.a(BLIRATNZCY;)V")
	public final void method109(IRATNZCY arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.field831 == 0) {
			var2 = field349.method259(arg0.field830, arg0.field832, arg0.field833);
		}

		if (arg0.field831 == 1) {
			var2 = field349.method260(arg0.field833, arg0.field832, arg0.field830);
		}

		if (arg0.field831 == 2) {
			var2 = field349.method261(arg0.field830, arg0.field832, arg0.field833);
		}

		if (arg0.field831 == 3) {
			var2 = field349.method262(arg0.field830, arg0.field832, arg0.field833);
		}

		if (var2 != 0) {
			int var6 = field349.method263(arg0.field830, arg0.field832, arg0.field833, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.field826 = var3;
		arg0.field828 = var4;
		arg0.field827 = var5;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IB)V")
	public final void method110(String arg0, int arg1) {
		field361 = arg1;
		field139 = arg0;
		method53();

		if (field262 == null) {
			super.method110(arg0, arg1);
		} else {
			field175.method176();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			field255.method15(var4 / 2 - var5 - 26, var3 / 2, 0xFFFFFF, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			IIPNJDNO.method323(304, 0x8C1111, var6, var3 / 2 - 152, 34);
			IIPNJDNO.method323(302, 0, var6 + 1, var3 / 2 - 151, 32);
			IIPNJDNO.method322(var6 + 2, var3 / 2 - 150, 0x8C1111, arg1 * 3, 30);
			IIPNJDNO.method322(var6 + 2, arg1 * 3 + (var3 / 2 - 150), 0, 300 - arg1 * 3, 30);
			field255.method15(var4 / 2 + 5 - var5, var3 / 2, 0xFFFFFF, arg0);
			field175.method177(171, field688, 202);

			if (field369) {
				field369 = false;

				if (!field127) {
					field176.method177(0, field688, 0);
					field177.method177(0, field688, 637);
				}

				field173.method177(0, field688, 128);
				field174.method177(371, field688, 202);
				field178.method177(265, field688, 0);
				field179.method177(265, field688, 562);
				field180.method177(171, field688, 128);
				field181.method177(171, field688, 562);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void method111(String arg0) {
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

	@ObfuscatedName("client.a(ZLPFVGIFDY;)Z")
	public final boolean method112(PFVGIFDY arg0) {
		if (arg0.field1109 == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.field1109.length; var2++) {
			int var3 = method55(var2, arg0);
			int var4 = arg0.field1083[var2];
			if (arg0.field1109[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.field1109[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.field1109[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.a(LDNACUOZQ;Z)V")
	public final void method113(DNACUOZQ arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < field230.length; var3++) {
			field230[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			field230[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					field231[var9] = (field230[var9 - 1] + field230[var9 + 1] + field230[var9 - 128] + field230[var9 + 128]) / 4;
				}
			}

			int[] var10 = field230;
			field230 = field231;
			field231 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.field519; var12++) {
				for (int var13 = 0; var13 < arg0.field518; var13++) {
					if (arg0.field516[var11++] != 0) {
						int var14 = var13 + arg0.field520 + 16;
						int var15 = var12 + arg0.field521 + 16;
						int var16 = (var15 << 7) + var14;
						field230[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method114() {
		method110("Starting up", 20);

		if (signlink.sunjava) {
			field682 = 5;
		}

		if (field92) {
			field133 = true;
		} else {
			field92 = true;
			boolean var1 = false;
			String var2 = method130();
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
						field196[var3] = new YAQQZUCW(signlink.cache_idx[var3], 500000, var3 + 1, signlink.cache_dat);
					}
				}

				try {
					method46();
					field262 = method67("title screen", 1, field278[1], "title", 25);
					field253 = new BFOGRMWS(field262, false, "p11_full");
					field254 = new BFOGRMWS(field262, false, "p12_full");
					field255 = new BFOGRMWS(field262, false, "b12_full");
					field256 = new BFOGRMWS(field262, true, "q8_full");
					method103();
					method34();
					CVNWKEAW var4 = method67("config", 2, field278[2], "config", 30);
					CVNWKEAW var5 = method67("interface", 3, field278[3], "interface", 35);
					CVNWKEAW var6 = method67("2d graphics", 4, field278[4], "media", 40);
					CVNWKEAW var7 = method67("textures", 6, field278[6], "textures", 45);
					CVNWKEAW var8 = method67("chat system", 7, field278[7], "wordenc", 50);
					CVNWKEAW var9 = method67("sound effects", 8, field278[8], "sounds", 55);
					field440 = new byte[4][104][104];
					field314 = new int[4][105][105];
					field349 = new GLVCMXFQ(field314, 104, 104, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						field326[var10] = new YMCKWFGH(104, 104);
					}

					field409 = new VDSDFSIV(512, 512);
					CVNWKEAW var11 = method67("update list", 5, field278[5], "versionlist", 60);
					method110("Connecting to update server", 60);
					field225 = new TXSWXFHQ();
					field225.method480(var11, this);
					ZNUJPBQV.method581(field225.method488());
					KPUOCBCE.method376(field225.method486(0), field225);

					if (!field160) {
						field397 = 0;
						try {
							field397 = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						field398 = true;
						field225.method478(2, field397);

						while (field225.method487() > 0) {
							method154();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (field225.field1319 > 3) {
								method111("ondemand");
								return;
							}
						}
					}

					method110("Requesting animations", 65);
					int var12 = field225.method486(1);
					for (int var13 = 0; var13 < var12; var13++) {
						field225.method478(1, var13);
					}

					while (field225.method487() > 0) {
						int var14 = var12 - field225.method487();
						if (var14 > 0) {
							method110("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						method154();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (field225.field1319 > 3) {
							method111("ondemand");
							return;
						}
					}

					method110("Requesting models", 70);
					int var15 = field225.method486(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = field225.method479(var16);
						if ((var17 & 0x1) != 0) {
							field225.method478(0, var16);
						}
					}

					int var18 = field225.method487();
					while (field225.method487() > 0) {
						int var19 = var18 - field225.method487();
						if (var19 > 0) {
							method110("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						method154();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (field196[0] != null) {
						method110("Requesting maps", 75);
						field225.method478(3, field225.method475(48, 47, 0));
						field225.method478(3, field225.method475(48, 47, 1));
						field225.method478(3, field225.method475(48, 48, 0));
						field225.method478(3, field225.method475(48, 48, 1));
						field225.method478(3, field225.method475(48, 49, 0));
						field225.method478(3, field225.method475(48, 49, 1));
						field225.method478(3, field225.method475(47, 47, 0));
						field225.method478(3, field225.method475(47, 47, 1));
						field225.method478(3, field225.method475(47, 48, 0));
						field225.method478(3, field225.method475(47, 48, 1));
						field225.method478(3, field225.method475(148, 48, 0));
						field225.method478(3, field225.method475(148, 48, 1));
						int var20 = field225.method487();
						while (field225.method487() > 0) {
							int var21 = var20 - field225.method487();
							if (var21 > 0) {
								method110("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							method154();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = field225.method486(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = field225.method479(var23);
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
							field225.method473(var25, 0, var23);
						}
					}

					field225.method483(field159);

					if (!field160) {
						int var26 = field225.method486(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (field225.method492(var27)) {
								field225.method473((byte) 1, 2, var27);
							}
						}
					}

					method110("Unpacking media", 80);
					field246 = new DNACUOZQ(var6, "invback", 0);
					field248 = new DNACUOZQ(var6, "chatback", 0);
					field247 = new DNACUOZQ(var6, "mapback", 0);
					field421 = new DNACUOZQ(var6, "backbase1", 0);
					field422 = new DNACUOZQ(var6, "backbase2", 0);
					field423 = new DNACUOZQ(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						field118[var28] = new DNACUOZQ(var6, "sideicons", var28);
					}

					field302 = new VDSDFSIV(var6, "compass", 0);
					field73 = new VDSDFSIV(var6, "mapedge", 0);
					field73.method496();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							field365[var29] = new DNACUOZQ(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							field313[var30] = new VDSDFSIV(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							field94[var31] = new VDSDFSIV(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							field434[var32] = new VDSDFSIV(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					field304 = new VDSDFSIV(var6, "mapmarker", 0);
					field305 = new VDSDFSIV(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						field410[var33] = new VDSDFSIV(var6, "cross", var33);
					}

					field334 = new VDSDFSIV(var6, "mapdots", 0);
					field335 = new VDSDFSIV(var6, "mapdots", 1);
					field336 = new VDSDFSIV(var6, "mapdots", 2);
					field337 = new VDSDFSIV(var6, "mapdots", 3);
					field338 = new VDSDFSIV(var6, "mapdots", 4);
					field98 = new DNACUOZQ(var6, "scrollbar", 0);
					field99 = new DNACUOZQ(var6, "scrollbar", 1);
					field134 = new DNACUOZQ(var6, "redstone1", 0);
					field135 = new DNACUOZQ(var6, "redstone2", 0);
					field136 = new DNACUOZQ(var6, "redstone3", 0);
					field137 = new DNACUOZQ(var6, "redstone1", 0);
					field137.method183();
					field138 = new DNACUOZQ(var6, "redstone2", 0);
					field138.method183();
					field383 = new DNACUOZQ(var6, "redstone1", 0);
					field383.method184();
					field384 = new DNACUOZQ(var6, "redstone2", 0);
					field384.method184();
					field385 = new DNACUOZQ(var6, "redstone3", 0);
					field385.method184();
					field386 = new DNACUOZQ(var6, "redstone1", 0);
					field386.method183();
					field386.method184();
					field387 = new DNACUOZQ(var6, "redstone2", 0);
					field387.method183();
					field387.method184();

					for (int var34 = 0; var34 < 2; var34++) {
						field91[var34] = new DNACUOZQ(var6, "mod_icons", var34);
					}

					VDSDFSIV var35 = new VDSDFSIV(var6, "backleft1", 0);
					field315 = new CMDDPBTD(var35.field1340, method140(), var35.field1339);
					var35.method497(0, 0);
					VDSDFSIV var36 = new VDSDFSIV(var6, "backleft2", 0);
					field316 = new CMDDPBTD(var36.field1340, method140(), var36.field1339);
					var36.method497(0, 0);
					VDSDFSIV var37 = new VDSDFSIV(var6, "backright1", 0);
					field317 = new CMDDPBTD(var37.field1340, method140(), var37.field1339);
					var37.method497(0, 0);
					VDSDFSIV var38 = new VDSDFSIV(var6, "backright2", 0);
					field318 = new CMDDPBTD(var38.field1340, method140(), var38.field1339);
					var38.method497(0, 0);
					VDSDFSIV var39 = new VDSDFSIV(var6, "backtop1", 0);
					field319 = new CMDDPBTD(var39.field1340, method140(), var39.field1339);
					var39.method497(0, 0);
					VDSDFSIV var40 = new VDSDFSIV(var6, "backvmid1", 0);
					field320 = new CMDDPBTD(var40.field1340, method140(), var40.field1339);
					var40.method497(0, 0);
					VDSDFSIV var41 = new VDSDFSIV(var6, "backvmid2", 0);
					field321 = new CMDDPBTD(var41.field1340, method140(), var41.field1339);
					var41.method497(0, 0);
					VDSDFSIV var42 = new VDSDFSIV(var6, "backvmid3", 0);
					field322 = new CMDDPBTD(var42.field1340, method140(), var42.field1339);
					var42.method497(0, 0);
					VDSDFSIV var43 = new VDSDFSIV(var6, "backhmid2", 0);
					field323 = new CMDDPBTD(var43.field1340, method140(), var43.field1339);
					var43.method497(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (field313[var48] != null) {
							field313[var48].method495(var45 + var47, var44 + var47, var46 + var47);
						}

						if (field365[var48] != null) {
							field365[var48].method185(var45 + var47, var44 + var47, var46 + var47);
						}
					}

					method110("Unpacking textures", 83);
					OIDJTTQC.method436(var7);
					OIDJTTQC.method440(0.8D);
					OIDJTTQC.method435(20);
					method110("Unpacking config", 86);
					NMXKUYSC.method414(var4);
					SCWSBSIM.method466(var4);
					ECSVNCGM.method211(var4);
					HMRHACIQ.method300(var4);
					HQFMWUSH.method311(var4);
					NRGHMRLX.method417(var4);
					FULHVSIU.method229(var4);
					NJBQYBAL.method412(var4);
					XBHMGKWV.method507(var4);
					HMRHACIQ.field712 = field159;

					if (!field160) {
						method110("Unpacking sounds", 90);
						byte[] var49 = var9.method180("sounds.dat", null);
						XOUQUKZW var50 = new XOUQUKZW(var49);
						ZTSFQLLW.method586(var50);
					}

					method110("Unpacking interfaces", 95);
					BFOGRMWS[] var51 = new BFOGRMWS[] { field253, field254, field255, field256 };
					PFVGIFDY.method452(var51, var6, var5);
					method110("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (field247.field516[field247.field518 * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						field286[var52] = var53;
						field258[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (field247.field516[field247.field518 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						field453[var56 - 5] = var57 - 25;
						field303[var56 - 5] = var58 - var57;
					}

					OIDJTTQC.method433(96, 479);
					field445 = OIDJTTQC.field1060;
					OIDJTTQC.method433(261, 190);
					field446 = OIDJTTQC.field1060;
					OIDJTTQC.method433(334, 512);
					field447 = OIDJTTQC.field1060;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = OIDJTTQC.field1058[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					GLVCMXFQ.method269(500, 512, var60, 334, 800);
					IVFROAJT.method337(var8);
					field284 = new NIZPXICY(this);
					method93(field284, 10);
					LOFYMKZK.field967 = this;
					SCWSBSIM.field1250 = this;
					HQFMWUSH.field772 = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + field139 + " " + field361);
					field312 = true;
				}
			} else {
				field115 = true;
			}
		}
	}

	@ObfuscatedName("client.a(LLAKHMHBY;IIZLXOUQUKZW;)V")
	public final void method115(LAKHMHBY arg0, int arg1, int arg2, XOUQUKZW arg3) {
		if ((arg1 & 0x1) != 0) {
			arg0.field1166 = arg3.method549();
			if (arg0.field1166 == 0xFFFF) {
				arg0.field1166 = -1;
			}
		}

		if ((arg1 & 0x4) != 0) {
			arg0.field1181 = arg3.method528();
			if (arg0.field1181.charAt(0) == '~') {
				arg0.field1181 = arg0.field1181.substring(1);
				method100(arg0.field960, 2, arg0.field1181);
			} else if (field97 == arg0) {
				method100(arg0.field960, 2, arg0.field1181);
			}

			arg0.field1162 = 0;
			arg0.field1180 = 0;
			arg0.field1173 = 150;
		}

		if ((arg1 & 0x400) != 0) {
			arg0.field1167 = arg3.method548();
			int var5 = arg3.method555();
			arg0.field1171 = var5 >> 16;
			arg0.field1170 = (var5 & 0xFFFF) + field425;
			arg0.field1168 = 0;
			arg0.field1169 = 0;

			if (arg0.field1170 > field425) {
				arg0.field1168 = -1;
			}

			if (arg0.field1167 == 0xFFFF) {
				arg0.field1167 = -1;
			}
		}

		if ((arg1 & 0x80) != 0) {
			int var6 = arg3.method548();
			if (var6 == 0xFFFF) {
				var6 = -1;
			}

			int var7 = arg3.method541();
			if (arg0.field1151 == var6 && var6 != -1) {
				int var8 = NMXKUYSC.field998[var6].field1012;
				if (var8 == 1) {
					arg0.field1152 = 0;
					arg0.field1153 = 0;
					arg0.field1154 = var7;
					arg0.field1155 = 0;
				}

				if (var8 == 2) {
					arg0.field1155 = 0;
				}
			} else if (var6 == -1 || arg0.field1151 == -1 || NMXKUYSC.field998[var6].field1006 >= NMXKUYSC.field998[arg0.field1151].field1006) {
				arg0.field1151 = var6;
				arg0.field1152 = 0;
				arg0.field1153 = 0;
				arg0.field1154 = var7;
				arg0.field1155 = 0;
				arg0.field1150 = arg0.field1199;
			}
		}

		if ((arg1 & 0x100) != 0) {
			arg0.field1185 = arg3.method540();
			arg0.field1187 = arg3.method541();
			arg0.field1186 = arg3.method521();
			arg0.field1188 = arg3.method540();
			arg0.field1189 = arg3.method550() + field425;
			arg0.field1190 = arg3.method550() + field425;
			arg0.field1191 = arg3.method540();
			arg0.method456();
		}

		if ((arg1 & 0x200) != 0) {
			int var9 = arg3.method540();
			int var10 = arg3.method540();
			arg0.method455(var10, field425, var9);
			arg0.field1175 = field425 + 300;
			arg0.field1176 = arg3.method541();
			arg0.field1177 = arg3.method541();
		}

		if ((arg1 & 0x8) != 0) {
			arg0.field1178 = arg3.method548();
			arg0.field1179 = arg3.method548();
		}

		if ((arg1 & 0x2) != 0) {
			int var11 = arg3.method550();
			int var12 = arg3.method539();
			int var13 = arg3.method539();
			int var14 = arg3.field1367;

			if (arg0.field960 != null && arg0.field939) {
				long var15 = YBENSMAZ.method563(arg0.field960);
				boolean var17 = false;
				if (var12 <= 1) {
					for (int var18 = 0; var18 < field207; var18++) {
						if (field57[var18] == var15) {
							var17 = true;
							break;
						}
					}
				}

				if (!var17 && field417 == 0) {
					try {
						field191.field1367 = 0;
						arg3.method558(var13, 0, field191.field1366);
						field191.field1367 = 0;
						String var19 = EEYZEKLH.method216(field191, var13);
						var19 = IVFROAJT.method347(var19);
						arg0.field1181 = var19;
						arg0.field1162 = var11 >> 8;
						arg0.field1180 = var11 & 0xFF;
						arg0.field1173 = 150;

						if (var12 == 2 || var12 == 3) {
							method100("@cr2@" + arg0.field960, 1, var19);
						} else if (var12 == 1) {
							method100("@cr1@" + arg0.field960, 1, var19);
						} else {
							method100(arg0.field960, 2, var19);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.field1367 = var13 + var14;
		}

		if ((arg1 & 0x20) != 0) {
			int var21 = arg3.method541();
			int var22 = arg3.method521();
			arg0.method455(var22, field425, var21);
			arg0.field1175 = field425 + 300;
			arg0.field1176 = arg3.method541();
			arg0.field1177 = arg3.method539();
		}

		if ((arg1 & 0x10) != 0) {
			int var23 = arg3.method541();
			byte[] var24 = new byte[var23];
			XOUQUKZW var25 = new XOUQUKZW(var24);
			arg3.method530(0, var23, var24);
			field221[arg2] = var25;
			arg0.method410(var25);
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void method116() {
		field210.method176();

		if (field107 == 2) {
			byte[] var1 = field247.field516;
			int[] var2 = IIPNJDNO.field811;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			field302.method503(33, 0, field62, 33, 25, 25, 256, 0, field286, field258);
			field211.method176();
		} else {
			int var5 = field62 + field457 & 0x7FF;
			int var6 = field97.field1157 / 32 + 48;
			int var7 = 464 - field97.field1158 / 32;
			field409.method503(146, 5, var5, 151, var6, var7, field202 + 256, 25, field453, field303);
			field302.method503(33, 0, field62, 33, 25, 25, 256, 0, field286, field258);

			for (int var8 = 0; var8 < field141; var8++) {
				int var9 = field142[var8] * 4 + 2 - field97.field1157 / 32;
				int var10 = field143[var8] * 4 + 2 - field97.field1158 / 32;
				method145(var9, field78[var8], var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					ILVDIPQT var13 = field235[field105][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - field97.field1157 / 32;
						int var15 = var12 * 4 + 2 - field97.field1158 / 32;
						method145(var14, field334, var15);
					}
				}
			}

			for (int var16 = 0; var16 < field193; var16++) {
				AVKLDTFF var17 = field192[field194[var16]];
				if (var17 != null && var17.method12()) {
					HQFMWUSH var18 = var17.field36;
					if (var18.field779 != null) {
						var18 = var18.method308();
					}

					if (var18 != null && var18.field793 && var18.field780) {
						int var19 = var17.field1157 / 32 - field97.field1157 / 32;
						int var20 = var17.field1158 / 32 - field97.field1158 / 32;
						method145(var19, field335, var20);
					}
				}
			}

			for (int var21 = 0; var21 < field217; var21++) {
				LAKHMHBY var22 = field216[field218[var21]];
				if (var22 != null && var22.method12()) {
					int var23 = var22.field1157 / 32 - field97.field1157 / 32;
					int var24 = var22.field1158 / 32 - field97.field1158 / 32;
					boolean var25 = false;
					long var26 = YBENSMAZ.method563(var22.field960);
					for (int var28 = 0; var28 < field169; var28++) {
						if (field331[var28] == var26 && field100[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (field97.field938 != 0 && var22.field938 != 0 && field97.field938 == var22.field938) {
						var29 = true;
					}

					if (var25) {
						method145(var23, field337, var24);
					} else if (var29) {
						method145(var23, field338, var24);
					} else {
						method145(var23, field336, var24);
					}
				}
			}

			if (field257 != 0 && field425 % 20 < 10) {
				if (field257 == 1 && field360 >= 0 && field360 < field192.length) {
					AVKLDTFF var30 = field192[field360];
					if (var30 != null) {
						int var31 = var30.field1157 / 32 - field97.field1157 / 32;
						int var32 = var30.field1158 / 32 - field97.field1158 / 32;
						method90(var32, var31, field305);
					}
				}

				if (field257 == 2) {
					int var33 = (field162 - field184) * 4 + 2 - field97.field1157 / 32;
					int var34 = (field163 - field185) * 4 + 2 - field97.field1158 / 32;
					method90(var34, var33, field305);
				}

				if (field257 == 10 && field399 >= 0 && field399 < field216.length) {
					LAKHMHBY var35 = field216[field399];
					if (var35 != null) {
						int var36 = var35.field1157 / 32 - field97.field1157 / 32;
						int var37 = var35.field1158 / 32 - field97.field1158 / 32;
						method90(var37, var36, field305);
					}
				}
			}

			if (field407 != 0) {
				int var38 = field407 * 4 + 2 - field97.field1157 / 32;
				int var39 = field408 * 4 + 2 - field97.field1158 / 32;
				method145(var38, field304, var39);
			}

			IIPNJDNO.method322(78, 97, 0xFFFFFF, 3, 3);
			field211.method176();
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method117() {
		if (field309 == 0) {
			int var1 = field686 / 2 - 80;
			int var2 = field687 / 2 + 20;
			var2 += 20;
			if (field702 == 1 && field703 >= var1 - 75 && field703 <= var1 + 75 && field704 >= var2 - 20 && field704 <= var2 + 20) {
				field309 = 3;
				field227 = 0;
			}

			int var3 = field686 / 2 + 80;
			if (field702 == 1 && field703 >= var3 - 75 && field703 <= var3 + 75 && field704 >= var2 - 20 && field704 <= var2 + 20) {
				field79 = "";
				field80 = "Enter your username & password.";
				field309 = 2;
				field227 = 0;
			}
		} else if (field309 == 2) {
			int var4 = field687 / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (field702 == 1 && field704 >= var4 - 15 && field704 < var4) {
				field227 = 0;
			}

			var4 += 15;
			if (field702 == 1 && field704 >= var4 - 15 && field704 < var4) {
				field227 = 1;
			}

			var4 += 15;
			int var5 = field686 / 2 - 80;
			int var6 = field687 / 2 + 50;
			var6 += 20;
			if (field702 == 1 && field703 >= var5 - 75 && field703 <= var5 + 75 && field704 >= var6 - 20 && field704 <= var6 + 20) {
				field391 = 0;
				method43(field351, field352, false);

				if (field150) {
					return;
				}
			}

			int var7 = field686 / 2 + 80;
			if (field702 == 1 && field703 >= var7 - 75 && field703 <= var7 + 75 && field704 >= var6 - 20 && field704 <= var6 + 20) {
				field309 = 0;
				field351 = "";
				field352 = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = method288();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < field432.length(); var10++) {
					if (var8 == field432.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (field227 == 0) {
					if (var8 == 8 && field351.length() > 0) {
						field351 = field351.substring(0, field351.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field227 = 1;
					}

					if (var9) {
						field351 = field351 + (char) var8;
					}

					if (field351.length() > 12) {
						field351 = field351.substring(0, 12);
					}
				} else if (field227 == 1) {
					if (var8 == 8 && field352.length() > 0) {
						field352 = field352.substring(0, field352.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						field227 = 0;
					}

					if (var9) {
						field352 = field352 + (char) var8;
					}

					if (field352.length() > 20) {
						field352 = field352.substring(0, 20);
					}
				}
			}
		} else if (field309 == 3) {
			int var11 = field686 / 2;
			int var12 = field687 / 2 + 50;
			var12 += 20;
			if (field702 == 1 && field703 >= var11 - 75 && field703 <= var11 + 75 && field704 >= var12 - 20 && field704 <= var12 + 20) {
				field309 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void method118() {
		if (field468 > 0) {
			method96();
		} else {
			field211.method176();
			field254.method15(144, 257, 0, "Connection lost");
			field254.method15(143, 256, 0xFFFFFF, "Connection lost");
			field254.method15(159, 257, 0, "Please wait - attempting to reestablish");
			field254.method15(158, 256, 0xFFFFFF, "Please wait - attempting to reestablish");
			field211.method177(4, field688, 4);
			field107 = 0;
			field407 = 0;
			ABEJMBLI var1 = field269;
			field150 = false;
			field391 = 0;
			method43(field351, field352, true);

			if (!field150) {
				method96();
			}

			try {
				var1.method1();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int method119(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (field440[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * field314[var6][var4][var5] + field314[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * field314[var6][var4][var5 + 1] + field314[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.z(I)V")
	public static final void method120() {
		GLVCMXFQ.field617 = false;
		OIDJTTQC.field1049 = false;
		field160 = false;
		DWQOSSFD.field545 = false;
		SCWSBSIM.field1270 = false;
	}

	@ObfuscatedName("client.a(LXOUQUKZW;BI)V")
	public final void method121(XOUQUKZW arg0, int arg1) {
		field222 = 0;
		field219 = 0;
		method167(arg0, arg1);
		method146(arg1, arg0);
		method97(arg0, arg1);

		for (int var3 = 0; var3 < field222; var3++) {
			int var4 = field223[var3];
			if (field425 != field192[var4].field1160) {
				field192[var4].field36 = null;
				field192[var4] = null;
			}
		}

		if (arg0.field1367 != arg1) {
			signlink.reporterror(field351 + " size mismatch in getnpcpos - pos:" + arg0.field1367 + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < field193; var5++) {
			if (field192[field194[var5]] == null) {
				signlink.reporterror(field351 + " null entry in npc list - pos:" + var5 + " size:" + field193);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(II)Z")
	public final boolean method122(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = field443[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 290) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method123(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.b(IIIIZI)V")
	public final void method124(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field98.method186(arg1, arg0);
		field99.method186(arg1 + arg3 - 16, arg0);
		IIPNJDNO.method322(arg1 + 16, arg0, field324, 16, arg3 - 32);
		int var6 = (arg3 - 32) * arg3 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg3 - var6 - 32) * arg4 / (arg2 - arg3);
		IIPNJDNO.method322(arg1 + var7 + 16, arg0, field350, 16, var6);
		IIPNJDNO.method327(field307, var6, arg0, arg1 + var7 + 16);
		IIPNJDNO.method327(field307, var6, arg0 + 1, arg1 + 16 + var7);
		IIPNJDNO.method325(field307, 16, arg0, arg1 + var7 + 16);
		IIPNJDNO.method325(field307, 16, arg0, arg1 + var7 + 17);
		IIPNJDNO.method327(field276, var6, arg0 + 15, arg1 + 16 + var7);
		IIPNJDNO.method327(field276, var6 - 1, arg0 + 14, arg1 + var7 + 17);
		IIPNJDNO.method325(field276, 16, arg0, arg1 + var7 + var6 + 15);
		IIPNJDNO.method325(field276, 15, arg0 + 1, arg1 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.A(I)V")
	public final void method125() {
		try {
			field449 = -1;
			field249.method336();
			field58.method336();
			OIDJTTQC.method434();
			method147();
			field349.method233();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				field326[var1].method569();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						field440[var2][var3][var4] = 0;
					}
				}
			}

			DWQOSSFD var5 = new DWQOSSFD(104, field314, field440, 104);
			int var6 = field459.length;
			field132.method510(134);

			if (!field329) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (field111[var7] >> 8) * 64 - field184;
					int var9 = (field111[var7] & 0xFF) * 64 - field185;
					byte[] var10 = field459[var7];
					if (var10 != null) {
						var5.method200(var9, var10, (field234 - 6) * 8, (field233 - 6) * 8, var8, field326);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (field111[var11] >> 8) * 64 - field184;
					int var13 = (field111[var11] & 0xFF) * 64 - field185;
					byte[] var14 = field459[var11];
					if (var14 == null && field234 < 800) {
						var5.method194(var13, 64, 64, var12);
					}
				}

				field132.method510(134);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = field370[var15];
					if (var16 != null) {
						int var17 = (field111[var15] >> 8) * 64 - field184;
						int var18 = (field111[var15] & 0xFF) * 64 - field185;
						var5.method205(var17, field349, var18, var16, field326);
					}
				}
			}

			if (field329) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = field268[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < field111.length; var28++) {
									if (field111[var28] == var27 && field459[var28] != null) {
										var5.method203((var26 & 0x7) * 8, var20 * 8, field326, field459[var28], var24, var19, var23, var21 * 8, (var25 & 0x7) * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = field268[0][var29][var30];
						if (var31 == -1) {
							var5.method194(var30 * 8, 8, 8, var29 * 8);
						}
					}
				}

				field132.method510(134);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = field268[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < field111.length; var41++) {
									if (field111[var41] == var40 && field370[var41] != null) {
										var5.method190(var33 * 8, var37, (var39 & 0x7) * 8, field370[var41], var32, (var38 & 0x7) * 8, var36, field326, field349, var34 * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			field132.method510(134);
			var5.method204(field326, field349);
			field211.method176();
			field132.method510(134);
			int var42 = DWQOSSFD.field525;
			if (var42 > field105) {
				var42 = field105;
			}

			if (var42 < field105 - 1) {
				int var43 = field105 - 1;
			}

			if (field160) {
				field349.method234(DWQOSSFD.field525);
			} else {
				field349.method234(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					method136(var44, var45);
				}
			}

			method85();
		} catch (Exception var58) {
		}

		SCWSBSIM.field1280.method304();

		if (field691 != null) {
			field132.method510(126);
			field132.method515(1057001181);
		}

		if (field160 && signlink.cache_dat != null) {
			int var47 = field225.method486(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = field225.method479(var48);
				if ((var49 & 0x79) == 0) {
					KPUOCBCE.method378(var48);
				}
			}
		}

		System.gc();
		OIDJTTQC.method435(20);
		field225.method484();
		int var50 = (field233 - 6) / 8 - 1;
		int var51 = (field233 + 6) / 8 + 1;
		int var52 = (field234 - 6) / 8 - 1;
		int var53 = (field234 + 6) / 8 + 1;
		if (field93) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = field225.method475(var55, var54, 0);
					if (var56 != -1) {
						field225.method476(3, var56);
					}

					int var57 = field225.method475(var55, var54, 1);
					if (var57 != -1) {
						field225.method476(3, var57);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIZZIII)Z")
	public final boolean method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				field228[var14][var15] = 0;
				field182[var14][var15] = 99999999;
			}
		}

		int var16 = arg4;
		int var17 = arg8;
		field228[arg4][arg8] = 99;
		field182[arg4][arg8] = 0;
		byte var18 = 0;
		int var19 = 0;
		field116[var18] = arg4;
		int var35 = var18 + 1;
		field117[var18] = arg8;
		boolean var20 = false;
		int var21 = field116.length;
		int[][] var22 = field326[field105].field1416;
		while (var35 != var19) {
			var16 = field116[var19];
			var17 = field117[var19];
			var19 = (var19 + 1) % var21;

			if (arg6 == var16 && arg1 == var17) {
				var20 = true;
				break;
			}

			if (arg2 != 0) {
				if ((arg2 < 5 || arg2 == 10) && field326[field105].method578(var16, var17, arg2 - 1, arg6, arg10, arg1)) {
					var20 = true;
					break;
				}

				if (arg2 < 10 && field326[field105].method579(arg2 - 1, arg6, arg1, var17, arg10, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg0 != 0 && arg9 != 0 && field326[field105].method580(arg9, arg1, var17, var16, arg0, arg6, arg5)) {
				var20 = true;
				break;
			}

			int var23 = field182[var16][var17] + 1;
			if (var16 > 0 && field228[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				field116[var35] = var16 - 1;
				field117[var35] = var17;
				var35 = (var35 + 1) % var21;
				field228[var16 - 1][var17] = 2;
				field182[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && field228[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				field116[var35] = var16 + 1;
				field117[var35] = var17;
				var35 = (var35 + 1) % var21;
				field228[var16 + 1][var17] = 8;
				field182[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && field228[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field116[var35] = var16;
				field117[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field228[var16][var17 - 1] = 1;
				field182[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && field228[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field116[var35] = var16;
				field117[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field228[var16][var17 + 1] = 4;
				field182[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && field228[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field116[var35] = var16 - 1;
				field117[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field228[var16 - 1][var17 - 1] = 3;
				field182[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && field228[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				field116[var35] = var16 + 1;
				field117[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				field228[var16 + 1][var17 - 1] = 9;
				field182[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && field228[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field116[var35] = var16 - 1;
				field117[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field228[var16 - 1][var17 + 1] = 6;
				field182[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && field228[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				field116[var35] = var16 + 1;
				field117[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				field228[var16 + 1][var17 + 1] = 12;
				field182[var16 + 1][var17 + 1] = var23;
			}
		}

		field306 = 0;
		if (!var20) {
			if (arg7) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg6 - var25; var26 <= arg6 + var25; var26++) {
						for (int var27 = arg1 - var25; var27 <= arg1 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && field182[var26][var27] < var24) {
								var24 = field182[var26][var27];
								var16 = var26;
								var17 = var27;
								field306 = 1;
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
		field116[var28] = var16;
		int var36 = var28 + 1;
		field117[var28] = var17;
		int var29;
		int var30 = var29 = field228[var16][var17];
		while (arg4 != var16 || arg8 != var17) {
			if (var29 != var30) {
				var29 = var30;
				field116[var36] = var16;
				field117[var36++] = var17;
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

			var30 = field228[var16][var17];
		}

		if (var36 <= 0) {
			if (arg3 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = field116[var36];
		int var33 = field117[var36];

		if (arg3 == 0) {
			field132.method510(24);
			field132.method511(var31 + var31 + 3);
		}

		if (arg3 == 1) {
			field132.method510(36);
			field132.method511(var31 + var31 + 3 + 14);
		}

		if (arg3 == 2) {
			field132.method510(19);
			field132.method511(var31 + var31 + 3);
		}

		field407 = field116[0];
		field408 = field117[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			field132.method511(field116[var36] - var32);
			field132.method538(field117[var36] - var33);
		}

		field132.method511(field706[5] == 1 ? 1 : 0);
		field132.method512(field185 + var33);
		field132.method512(field184 + var32);
		return true;
	}

	@ObfuscatedName("client.j(B)V")
	public final void method127() {
		if (field107 == 0 && field702 == 1) {
			int var1 = field703 - 25 - 550;
			int var2 = field704 - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = field62 + field457 & 0x7FF;
				int var4 = OIDJTTQC.field1058[var3];
				int var5 = OIDJTTQC.field1059[var3];
				var4 = (field202 + 256) * var4 >> 8;
				var5 = (field202 + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = field97.field1157 + var6 >> 7;
				int var9 = field97.field1158 - var7 >> 7;
				boolean var10 = method126(0, var9, 0, 1, field97.field1192[0], 0, var8, true, field97.field1193[0], 0, 0);
				if (var10) {
					field132.method511(var1);
					field132.method511(var2);
					field132.method512(field62);
					field132.method511(57);
					field132.method511(field457);
					field132.method511(field202);
					field132.method511(89);
					field132.method512(field97.field1157);
					field132.method512(field97.field1158);
					field132.method511(field306);
					field132.method511(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBILPFVGIFDY;I)V")
	public final void method128(int arg0, int arg1, PFVGIFDY arg2, int arg3) {
		if (arg2.field1092 == 0 && arg2.field1088 != null && (!arg2.field1086 || field95 == arg2.field1117 || field237 == arg2.field1117 || field145 == arg2.field1117)) {
			int var5 = IIPNJDNO.field816;
			int var6 = IIPNJDNO.field814;
			int var7 = IIPNJDNO.field817;
			int var8 = IIPNJDNO.field815;
			IIPNJDNO.method319(arg2.field1112 + arg1, arg0, arg1, arg2.field1077 + arg0);
			int var9 = arg2.field1088.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.field1079[var10] + arg1;
				int var12 = arg2.field1125[var10] + arg0 - arg3;
				PFVGIFDY var13 = PFVGIFDY.field1078[arg2.field1088[var10]];
				var11 += var13.field1097;
				var12 += var13.field1076;

				if (var13.field1094 > 0) {
					method168(var13);
				}

				if (var13.field1092 == 0) {
					if (var13.field1118 > var13.field1113 - var13.field1077) {
						var13.field1118 = var13.field1113 - var13.field1077;
					}

					if (var13.field1118 < 0) {
						var13.field1118 = 0;
					}

					method128(var12, var11, var13, var13.field1118);

					if (var13.field1113 > var13.field1077) {
						method124(var13.field1112 + var11, var12, var13.field1113, var13.field1077, var13.field1118);
					}
				} else if (var13.field1092 != 1) {
					if (var13.field1092 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.field1077; var15++) {
							for (int var16 = 0; var16 < var13.field1112; var16++) {
								int var17 = (var13.field1087 + 32) * var16 + var11;
								int var18 = (var13.field1111 + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.field1099[var14];
									var18 += var13.field1123[var14];
								}

								if (var13.field1104[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.field1104[var14] - 1;
									if (var17 > IIPNJDNO.field816 - 32 && var17 < IIPNJDNO.field817 && var18 > IIPNJDNO.field814 - 32 && var18 < IIPNJDNO.field815 || field199 != 0 && field198 == var14) {
										int var22 = 0;
										if (field263 == 1 && field264 == var14 && field265 == var13.field1117) {
											var22 = 0xFFFFFF;
										}

										VDSDFSIV var23 = HMRHACIQ.method292(var13.field1100[var14], var22, var21);
										if (var23 != null) {
											if (field199 != 0 && field198 == var14 && field197 == var13.field1117) {
												var19 = field696 - field200;
												var20 = field697 - field201;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (field288 < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.method501(var17 + var19, 128, var18 + var20);

												if (var18 + var20 < IIPNJDNO.field814 && arg2.field1118 > 0) {
													int var24 = (IIPNJDNO.field814 - var18 - var20) * field476 / 3;
													if (var24 > field476 * 10) {
														var24 = field476 * 10;
													}

													if (var24 > arg2.field1118) {
														var24 = arg2.field1118;
													}

													arg2.field1118 -= var24;
													field201 += var24;
												}

												if (var18 + var20 + 32 > IIPNJDNO.field815 && arg2.field1118 < arg2.field1113 - arg2.field1077) {
													int var25 = (var18 + var20 + 32 - IIPNJDNO.field815) * field476 / 3;
													if (var25 > field476 * 10) {
														var25 = field476 * 10;
													}

													if (var25 > arg2.field1113 - arg2.field1077 - arg2.field1118) {
														var25 = arg2.field1113 - arg2.field1077 - arg2.field1118;
													}

													arg2.field1118 += var25;
													field201 -= var25;
												}
											} else if (field282 != 0 && field281 == var14 && field280 == var13.field1117) {
												var23.method501(var17, 128, var18);
											} else {
												var23.method499(var18, var17);
											}

											if (var23.field1343 == 33 || var13.field1100[var14] != 1) {
												int var26 = var13.field1100[var14];
												field253.method19(method174(var26), 0, var18 + var20 + 10, var17 + 1 + var19);
												field253.method19(method174(var26), 0xFFFF00, var18 + var20 + 9, var17 + var19);
											}
										}
									}
								} else if (var13.field1103 != null && var14 < 20) {
									VDSDFSIV var27 = var13.field1103[var14];
									if (var27 != null) {
										var27.method499(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.field1092 == 3) {
						boolean var28 = false;
						if (field145 == var13.field1117 || field237 == var13.field1117 || field95 == var13.field1117) {
							var28 = true;
						}

						int var29;
						if (method112(var13)) {
							var29 = var13.field1116;
							if (var28 && var13.field1102 != 0) {
								var29 = var13.field1102;
							}
						} else {
							var29 = var13.field1095;
							if (var28 && var13.field1124 != 0) {
								var29 = var13.field1124;
							}
						}

						if (var13.field1091 == 0) {
							if (var13.field1108) {
								IIPNJDNO.method322(var12, var11, var29, var13.field1112, var13.field1077);
							} else {
								IIPNJDNO.method323(var13.field1112, var29, var12, var11, var13.field1077);
							}
						} else if (var13.field1108) {
							IIPNJDNO.method321(var13.field1077, var12, 256 - (var13.field1091 & 0xFF), var13.field1112, var11, var29);
						} else {
							IIPNJDNO.method324(256 - (var13.field1091 & 0xFF), var13.field1112, var29, var13.field1077, var12, var11);
						}
					} else if (var13.field1092 == 4) {
						BFOGRMWS var30 = var13.field1081;
						String var31 = var13.field1106;
						boolean var32 = false;
						if (field145 == var13.field1117 || field237 == var13.field1117 || field95 == var13.field1117) {
							var32 = true;
						}

						int var33;
						if (method112(var13)) {
							var33 = var13.field1116;
							if (var32 && var13.field1102 != 0) {
								var33 = var13.field1102;
							}

							if (var13.field1128.length() > 0) {
								var31 = var13.field1128;
							}
						} else {
							var33 = var13.field1095;
							if (var32 && var13.field1124 != 0) {
								var33 = var13.field1124;
							}
						}

						if (var13.field1093 == 6 && field77) {
							var31 = "Please wait...";
							var33 = var13.field1095;
						}

						if (IIPNJDNO.field812 == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.field43 + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + method138(method55(0, var13)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + method138(method55(1, var13)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + method138(method55(2, var13)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + method138(method55(3, var13)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + method138(method55(4, var13)) + var31.substring(var39 + 2);
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

							if (var13.field1098) {
								var30.method16(var13.field1134, var41, var13.field1112 / 2 + var11, var34, var33);
							} else {
								var30.method23(var11, var34, var41, var33, var13.field1134);
							}

							var34 += var30.field43;
						}
					} else if (var13.field1092 == 5) {
						VDSDFSIV var42;
						if (method112(var13)) {
							var42 = var13.field1114;
						} else {
							var42 = var13.field1107;
						}

						if (var42 != null) {
							var42.method499(var12, var11);
						}
					} else if (var13.field1092 == 6) {
						int var43 = OIDJTTQC.field1054;
						int var44 = OIDJTTQC.field1055;
						OIDJTTQC.field1054 = var13.field1112 / 2 + var11;
						OIDJTTQC.field1055 = var13.field1077 / 2 + var12;
						int var45 = OIDJTTQC.field1058[var13.field1121] * var13.field1120 >> 16;
						int var46 = OIDJTTQC.field1059[var13.field1121] * var13.field1120 >> 16;
						boolean var47 = method112(var13);
						int var48;
						if (var47) {
							var48 = var13.field1130;
						} else {
							var48 = var13.field1129;
						}

						KPUOCBCE var49;
						if (var48 == -1) {
							var49 = var13.method453(-1, var47, -1);
						} else {
							NMXKUYSC var50 = NMXKUYSC.field998[var48];
							var49 = var13.method453(var50.field1001[var13.field1126], var47, var50.field1000[var13.field1126]);
						}

						if (var49 != null) {
							var49.method399(0, var13.field1122, 0, var13.field1121, 0, var45, var46);
						}

						OIDJTTQC.field1054 = var43;
						OIDJTTQC.field1055 = var44;
					} else if (var13.field1092 == 7) {
						BFOGRMWS var51 = var13.field1081;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.field1077; var53++) {
							for (int var54 = 0; var54 < var13.field1112; var54++) {
								if (var13.field1104[var52] > 0) {
									HMRHACIQ var55 = HMRHACIQ.method293(var13.field1104[var52] - 1);
									String var56 = var55.field757;
									if (var55.field729 || var13.field1100[var52] != 1) {
										var56 = var56 + " x" + method171(var13.field1100[var52]);
									}

									int var57 = (var13.field1087 + 115) * var54 + var11;
									int var58 = (var13.field1111 + 12) * var53 + var12;
									if (var13.field1098) {
										var51.method16(var13.field1134, var56, var13.field1112 / 2 + var57, var58, var13.field1095);
									} else {
										var51.method23(var57, var58, var56, var13.field1095, var13.field1134);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			IIPNJDNO.method319(var7, var6, var5, var8);
		}
	}

	@ObfuscatedName("client.a(IIZ)Ljava/lang/String;")
	public static final String method129(int arg0, int arg1) {
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

	@ObfuscatedName("client.k(B)Ljava/lang/String;")
	public final String method130() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (field691 != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.B(I)V")
	public final void method131() {
		for (RVCZOCZG var1 = (RVCZOCZG) field58.method332(); var1 != null; var1 = (RVCZOCZG) field58.method334()) {
			if (field105 != var1.field1233 || field425 > var1.field1226) {
				var1.method471();
			} else if (field425 >= var1.field1225) {
				if (var1.field1224 > 0) {
					AVKLDTFF var2 = field192[var1.field1224 - 1];
					if (var2 != null && var2.field1157 >= 0 && var2.field1157 < 13312 && var2.field1158 >= 0 && var2.field1158 < 13312) {
						var1.method458(var2.field1157, var2.field1158, method119(var1.field1233, var2.field1158, var2.field1157) - var1.field1230, field425);
					}
				}

				if (var1.field1224 < 0) {
					int var3 = -var1.field1224 - 1;
					LAKHMHBY var4;
					if (field71 == var3) {
						var4 = field97;
					} else {
						var4 = field216[var3];
					}

					if (var4 != null && var4.field1157 >= 0 && var4.field1157 < 13312 && var4.field1158 >= 0 && var4.field1158 < 13312) {
						var1.method458(var4.field1157, var4.field1158, method119(var1.field1233, var4.field1158, var4.field1157) - var1.field1230, field425);
					}
				}

				var1.method459(field476);
				field349.method244(var1.field1236, var1, -1, (int) var1.field1239, (int) var1.field1240, false, (int) var1.field1241, 60, field105);
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void method132() {
		method141();

		if (field473 == 1) {
			field410[field472 / 100].method499(field471 - 8 - 4, field470 - 8 - 4);
		}

		if (field473 == 2) {
			field410[field472 / 100 + 4].method499(field471 - 8 - 4, field470 - 8 - 4);
		}

		if (field390 != -1) {
			method86(field390, field476);
			method128(0, 0, PFVGIFDY.field1078[field390], 0);
		}

		if (field392 != -1) {
			method86(field392, field476);
			method128(0, 0, PFVGIFDY.field1078[field392], 0);
		}

		method144();

		if (!field348) {
			method61();
			method175();
		} else if (field401 == 0) {
			method70();
		}

		if (field151 == 1) {
			field434[1].method499(296, 472);
		}

		if (field146) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (field684 < 15) {
				var3 = 0xFF0000;
			}

			field254.method14("Fps:" + field684, var2, var1, var3);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && field160) {
				int var7 = 0xFF0000;
			}

			field254.method14("Mem:" + var5 + "k", var2, var1, 0xFFFF00);
			var2 += 15;
		}

		if (field469 != 0) {
			int var8 = field469 / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				field254.method19("System update in: " + var9 + ":0" + var8, 0xFFFF00, 329, 4);
			} else {
				field254.method19("System update in: " + var9 + ":" + var8, 0xFFFF00, 329, 4);
			}

			field367++;
			if (field367 > 76) {
				field367 = 0;
				field132.method510(231);
				return;
			}
		}
	}

	@ObfuscatedName("client.D(I)Z")
	public final boolean method133() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method134(long arg0) {
		if (arg0 != 0L) {
			if (field169 >= 100 && field372 != 1) {
				method100("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (field169 >= 200) {
				method100("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = YBENSMAZ.method567(YBENSMAZ.method564(arg0));
				for (int var4 = 0; var4 < field169; var4++) {
					if (field331[var4] == arg0) {
						method100("", 0, var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < field207; var5++) {
					if (field57[var5] == arg0) {
						method100("", 0, "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(field97.field960)) {
					field226[field169] = var3;
					field331[field169] = arg0;
					field100[field169] = 0;
					field169++;
					field431 = true;
					field132.method510(21);
					field132.method517(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)Ljava/net/Socket;")
	public final Socket method135(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.d(II)V")
	public final void method136(int arg0, int arg1) {
		ILVDIPQT var3 = field235[field105][arg0][arg1];
		if (var3 == null) {
			field349.method254(field105, arg0, arg1);
		} else {
			int var4 = -99999999;
			XXIPNARK var5 = null;
			for (XXIPNARK var6 = (XXIPNARK) var3.method332(); var6 != null; var6 = (XXIPNARK) var3.method334()) {
				HMRHACIQ var7 = HMRHACIQ.method293(var6.field1404);
				int var8 = var7.field750;
				if (var7.field729) {
					var8 = (var6.field1405 + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method330(var5);
			XXIPNARK var9 = null;
			XXIPNARK var10 = null;
			for (XXIPNARK var11 = (XXIPNARK) var3.method332(); var11 != null; var11 = (XXIPNARK) var3.method334()) {
				if (var5.field1404 != var11.field1404 && var9 == null) {
					var9 = var11;
				}

				if (var5.field1404 != var11.field1404 && var9.field1404 != var11.field1404 && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			field349.method240(field105, arg1, var12, method119(field105, arg1 * 128 + 64, arg0 * 128 + 64), var9, var5, arg0, var10);
		}
	}

	public final void init() {
		field157 = Integer.parseInt(getParameter("nodeid"));
		field158 = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method71();
		} else {
			method120();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field159 = false;
		} else {
			field159 = true;
		}

		method285(503, 765);
	}

	@ObfuscatedName("client.F(I)V")
	public final void method137() {
		field154 = true;

		for (int var1 = 0; var1 < 7; var1++) {
			field152[var1] = -1;
			for (int var2 = 0; var2 < NRGHMRLX.field1014; var2++) {
				if (!NRGHMRLX.field1015[var2].field1021 && NRGHMRLX.field1015[var2].field1016 == var1 + (field171 ? 0 : 7)) {
					field152[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public final String method138(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.l(B)V")
	public void method139() {
		System.out.println("============");
		System.out.println("flame-cycle:" + field236);

		if (field225 != null) {
			System.out.println("Od-cycle:" + field225.field1326);
		}

		System.out.println("loop-cycle:" + field425);
		System.out.println("draw-cycle:" + field381);
		System.out.println("ptype:" + field465);
		System.out.println("psize:" + field464);

		if (field269 != null) {
			field269.method6();
		}

		field685 = true;
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	public final Component method140() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (field691 != null) {
			return field691;
		}

		return this;
	}

	@ObfuscatedName("client.m(B)V")
	public final void method141() {
		if (field126 != 0) {
			BFOGRMWS var1 = field254;
			int var2 = 0;
			if (field469 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (field364[var3] != null) {
					int var4 = field362[var3];
					String var5 = field363[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || field414 == 0 || field414 == 1 && method161(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method19("From", 0, var7, var8);
						var1.method19("From", 0xFFFF, var7 - 1, var8);
						int var11 = var8 + var1.method17("From ");
						if (var6 == 1) {
							field91[0].method186(var7 - 12, var11);
							var11 += 14;
						}

						if (var6 == 2) {
							field91[1].method186(var7 - 12, var11);
							var11 += 14;
						}

						var1.method19(var5 + ": " + field364[var3], 0, var7, var11);
						var1.method19(var5 + ": " + field364[var3], 0xFFFF, var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && field414 < 2) {
						int var9 = 329 - var2 * 13;
						var1.method19(field364[var3], 0, var9, 4);
						var1.method19(field364[var3], 0xFFFF, var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && field414 < 2) {
						int var10 = 329 - var2 * 13;
						var1.method19("To " + var5 + ": " + field364[var3], 0, var10, 4);
						var1.method19("To " + var5 + ": " + field364[var3], 0xFFFF, var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
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

	@ObfuscatedName("client.b(ZLPFVGIFDY;)Z")
	public final boolean method142(PFVGIFDY arg0) {
		int var2 = arg0.field1094;
		if (field170 == 2) {
			if (var2 == 201) {
				field195 = true;
				field122 = 0;
				field144 = true;
				field400 = "";
				field229 = 1;
				field261 = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				field195 = true;
				field122 = 0;
				field144 = true;
				field400 = "";
				field229 = 2;
				field261 = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			field468 = 250;
			return true;
		}

		if (var2 == 501) {
			field195 = true;
			field122 = 0;
			field144 = true;
			field400 = "";
			field229 = 4;
			field261 = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			field195 = true;
			field122 = 0;
			field144 = true;
			field400 = "";
			field229 = 5;
			field261 = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = field152[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = NRGHMRLX.field1014 - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= NRGHMRLX.field1014) {
							var5 = 0;
						}
					}

					if (!NRGHMRLX.field1015[var5].field1021 && NRGHMRLX.field1015[var5].field1016 == var3 + (field171 ? 0 : 7)) {
						break;
					}
				}

				field152[var3] = var5;
				field154 = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = field74[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = field69[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= field69[var6].length) {
					var8 = 0;
				}
			}

			field74[var6] = var8;
			field154 = true;
		}

		if (var2 == 324 && !field171) {
			field171 = true;
			method137();
		}

		if (var2 == 325 && field171) {
			field171 = false;
			method137();
		}

		if (var2 == 326) {
			field132.method510(180);
			field132.method511(field171 ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				field132.method511(field152[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				field132.method511(field74[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			field96 = !field96;
		}

		if (var2 >= 601 && var2 <= 612) {
			method94();

			if (field128.length() > 0) {
				field132.method510(175);
				field132.method517(YBENSMAZ.method563(field128));
				field132.method511(var2 - 601);
				field132.method511(field96 ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method143(int arg0) {
		signlink.wavevol = arg0;
	}

	public final void run() {
		if (field232) {
			method151();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void method144() {
		field417 = 0;
		int var1 = (field97.field1157 >> 7) + field184;
		int var2 = (field97.field1158 >> 7) + field185;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			field417 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			field417 = 1;
		}

		if (field417 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			field417 = 0;
		}
	}

	@ObfuscatedName("client.a(BILVDSDFSIV;I)V")
	public final void method145(int arg0, VDSDFSIV arg1, int arg2) {
		int var4 = field62 + field457 & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = KPUOCBCE.field920[var4];
			int var7 = KPUOCBCE.field921[var4];
			var6 = var6 * 256 / (field202 + 256);
			var7 = var7 * 256 / (field202 + 256);
			int var8 = arg0 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg0 * var6 >> 16;
			if (var5 > 2500) {
				arg1.method505(var8 + 94 + 4 - arg1.field1343 / 2, field247, 83 - var9 - arg1.field1344 / 2 - 4);
			} else {
				arg1.method499(83 - var9 - arg1.field1344 / 2 - 4, var8 + 94 - arg1.field1343 / 2 + 4);
			}
		}
	}

	@ObfuscatedName("client.a(ILXOUQUKZW;I)V")
	public final void method146(int arg0, XOUQUKZW arg1) {
		while (arg1.field1368 + 21 < arg0 * 8) {
			int var3 = arg1.method532(14);
			if (var3 == 16383) {
				break;
			}

			if (field192[var3] == null) {
				field192[var3] = new AVKLDTFF();
			}

			AVKLDTFF var4 = field192[var3];
			field194[field193++] = var3;
			var4.field1160 = field425;
			var4.field36 = HQFMWUSH.method309(arg1.method532(12));
			int var5 = arg1.method532(1);
			int var6 = arg1.method532(1);
			if (var6 == 1) {
				field220[field219++] = var3;
			}

			int var7 = arg1.method532(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg1.method532(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.field1198 = var4.field36.field791;
			var4.field1201 = var4.field36.field783;
			var4.field1194 = var4.field36.field777;
			var4.field1195 = var4.field36.field770;
			var4.field1196 = var4.field36.field794;
			var4.field1197 = var4.field36.field797;
			var4.field1183 = var4.field36.field799;
			var4.method454(field97.field1193[0] + var7, field97.field1192[0] + var8, var5 == 1);
		}

		arg1.method533();
	}

	@ObfuscatedName("client.n(B)V")
	public final void method147() {
		SCWSBSIM.field1280.method304();
		SCWSBSIM.field1259.method304();
		HQFMWUSH.field778.method304();
		HMRHACIQ.field747.method304();
		HMRHACIQ.field725.method304();
		LAKHMHBY.field943.method304();
		FULHVSIU.field616.method304();
	}

	@ObfuscatedName("client.b(ILXOUQUKZW;I)V")
	public final void method148(XOUQUKZW arg0, int arg1) {
		for (int var3 = 0; var3 < field219; var3++) {
			int var4 = field220[var3];
			LAKHMHBY var5 = field216[var4];
			int var6 = arg0.method521();
			if ((var6 & 0x40) != 0) {
				var6 += arg0.method521() << 8;
			}

			method115(var5, var6, var4, arg0);
		}
	}

	@ObfuscatedName("client.a(ILPFVGIFDY;IIIIZ)V")
	public final void method149(int arg0, PFVGIFDY arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.field1092 == 0 && arg1.field1088 != null && !arg1.field1086 && (arg5 >= arg0 && arg2 >= arg4 && arg5 <= arg1.field1112 + arg0 && arg2 <= arg1.field1077 + arg4)) {
			int var7 = arg1.field1088.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.field1079[var8] + arg0;
				int var10 = arg1.field1125[var8] + arg4 - arg3;
				PFVGIFDY var11 = PFVGIFDY.field1078[arg1.field1088[var8]];
				var9 += var11.field1097;
				var10 += var11.field1076;
				if ((var11.field1080 >= 0 || var11.field1124 != 0) && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1112 + var9 && arg2 < var11.field1077 + var10) {
					if (var11.field1080 >= 0) {
						field277 = var11.field1080;
					} else {
						field277 = var11.field1117;
					}
				}

				if (var11.field1092 == 0) {
					method149(var9, var11, arg2, var11.field1118, var10, arg5);

					if (var11.field1113 > var11.field1077) {
						method102(var11.field1113, arg5, var11, true, var10, var11.field1112 + var9, var11.field1077, arg2);
					}
				} else {
					if (var11.field1093 == 1 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1112 + var9 && arg2 < var11.field1077 + var10) {
						boolean var12 = false;
						if (var11.field1094 != 0) {
							var12 = method108(var11);
						}

						if (!var12) {
							field125[field416] = var11.field1135;
							field443[field416] = 903;
							field442[field416] = var11.field1117;
							field416++;
						}
					}

					if (var11.field1093 == 2 && field343 == 0 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1112 + var9 && arg2 < var11.field1077 + var10) {
						String var13 = var11.field1127;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						field125[field416] = var13 + " @gre@" + var11.field1090;
						field443[field416] = 604;
						field442[field416] = var11.field1117;
						field416++;
					}

					if (var11.field1093 == 3 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1112 + var9 && arg2 < var11.field1077 + var10) {
						field125[field416] = "Close";
						field443[field416] = 863;
						field442[field416] = var11.field1117;
						field416++;
					}

					if (var11.field1093 == 4 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1112 + var9 && arg2 < var11.field1077 + var10) {
						field125[field416] = var11.field1135;
						field443[field416] = 627;
						field442[field416] = var11.field1117;
						field416++;
					}

					if (var11.field1093 == 5 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1112 + var9 && arg2 < var11.field1077 + var10) {
						field125[field416] = var11.field1135;
						field443[field416] = 975;
						field442[field416] = var11.field1117;
						field416++;
					}

					if (var11.field1093 == 6 && !field77 && arg5 >= var9 && arg2 >= var10 && arg5 < var11.field1112 + var9 && arg2 < var11.field1077 + var10) {
						field125[field416] = var11.field1135;
						field443[field416] = 542;
						field442[field416] = var11.field1117;
						field416++;
					}

					if (var11.field1092 == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.field1077; var15++) {
							for (int var16 = 0; var16 < var11.field1112; var16++) {
								int var17 = (var11.field1087 + 32) * var16 + var9;
								int var18 = (var11.field1111 + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.field1099[var14];
									var18 += var11.field1123[var14];
								}

								if (arg5 >= var17 && arg2 >= var18 && arg5 < var17 + 32 && arg2 < var18 + 32) {
									field167 = var14;
									field168 = var11.field1117;

									if (var11.field1104[var14] > 0) {
										HMRHACIQ var19 = HMRHACIQ.method293(var11.field1104[var14] - 1);
										if (field263 == 1 && var11.field1105) {
											if (field265 != var11.field1117 || field264 != var14) {
												field125[field416] = "Use " + field267 + " with @lre@" + var19.field757;
												field443[field416] = 616;
												field444[field416] = var19.field756;
												field441[field416] = var14;
												field442[field416] = var11.field1117;
												field416++;
											}
										} else if (field343 != 1 || !var11.field1105) {
											if (var11.field1105) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.field755 != null && var19.field755[var20] != null) {
														field125[field416] = var19.field755[var20] + " @lre@" + var19.field757;

														if (var20 == 3) {
															field443[field416] = 752;
														}

														if (var20 == 4) {
															field443[field416] = 804;
														}

														field444[field416] = var19.field756;
														field441[field416] = var14;
														field442[field416] = var11.field1117;
														field416++;
													} else if (var20 == 4) {
														field125[field416] = "Drop @lre@" + var19.field757;
														field443[field416] = 804;
														field444[field416] = var19.field756;
														field441[field416] = var14;
														field442[field416] = var11.field1117;
														field416++;
													}
												}
											}

											if (var11.field1101) {
												field125[field416] = "Use @lre@" + var19.field757;
												field443[field416] = 762;
												field444[field416] = var19.field756;
												field441[field416] = var14;
												field442[field416] = var11.field1117;
												field416++;
											}

											if (var11.field1105 && var19.field755 != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.field755[var21] != null) {
														field125[field416] = var19.field755[var21] + " @lre@" + var19.field757;

														if (var21 == 0) {
															field443[field416] = 255;
														}

														if (var21 == 1) {
															field443[field416] = 704;
														}

														if (var21 == 2) {
															field443[field416] = 617;
														}

														field444[field416] = var19.field756;
														field441[field416] = var14;
														field442[field416] = var11.field1117;
														field416++;
													}
												}
											}

											if (var11.field1096 != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.field1096[var22] != null) {
														field125[field416] = var11.field1096[var22] + " @lre@" + var19.field757;

														if (var22 == 0) {
															field443[field416] = 801;
														}

														if (var22 == 1) {
															field443[field416] = 630;
														}

														if (var22 == 2) {
															field443[field416] = 769;
														}

														if (var22 == 3) {
															field443[field416] = 416;
														}

														if (var22 == 4) {
															field443[field416] = 142;
														}

														field444[field416] = var19.field756;
														field441[field416] = var14;
														field442[field416] = var11.field1117;
														field416++;
													}
												}
											}

											field125[field416] = "Examine @lre@" + var19.field757;
											field443[field416] = 1410;
											field444[field416] = var19.field756;
											field441[field416] = var14;
											field442[field416] = var11.field1117;
											field416++;
										} else if ((field345 & 0x10) == 0x10) {
											field125[field416] = field346 + " @lre@" + var19.field757;
											field443[field416] = 992;
											field444[field416] = var19.field756;
											field441[field416] = var14;
											field442[field416] = var11.field1117;
											field416++;
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

	@ObfuscatedName("client.G(I)V")
	public final void method150() {
		if (field199 == 0) {
			int var1 = field702;
			if (field343 == 1 && field703 >= 516 && field704 >= 160 && field703 <= 765 && field704 <= 205) {
				var1 = 0;
			}

			if (field348) {
				if (var1 != 1) {
					int var2 = field696;
					int var3 = field697;
					if (field401 == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (field401 == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (field401 == 2) {
						var2 -= 17;
						var3 -= 357;
					}

					if (var2 < field402 - 10 || var2 > field404 + field402 + 10 || var3 < field403 - 10 || var3 > field405 + field403 + 10) {
						field348 = false;

						if (field401 == 1) {
							field431 = true;
						}

						if (field401 == 2) {
							field195 = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = field402;
					int var5 = field403;
					int var6 = field404;
					int var7 = field703;
					int var8 = field704;
					if (field401 == 0) {
						var7 -= 4;
						var8 -= 4;
					}

					if (field401 == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (field401 == 2) {
						var7 -= 17;
						var8 -= 357;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < field416; var10++) {
						int var11 = (field416 - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						method164(var9);
					}

					field348 = false;

					if (field401 == 1) {
						field431 = true;
					}

					if (field401 == 2) {
						field195 = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && field416 > 0) {
					int var12 = field443[field416 - 1];
					if (var12 == 801 || var12 == 630 || var12 == 769 || var12 == 416 || var12 == 142 || var12 == 255 || var12 == 704 || var12 == 617 || var12 == 752 || var12 == 804 || var12 == 762 || var12 == 1410) {
						int var13 = field441[field416 - 1];
						int var14 = field442[field416 - 1];
						PFVGIFDY var15 = PFVGIFDY.field1078[var14];
						if (var15.field1131 || var15.field1110) {
							field108 = false;
							field288 = 0;
							field197 = var14;
							field198 = var13;
							field199 = 2;
							field200 = field703;
							field201 = field704;

							if (PFVGIFDY.field1078[var14].field1073 == field392) {
								field199 = 1;
							}

							if (PFVGIFDY.field1078[var14].field1073 == field299) {
								field199 = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (field435 == 1 || method122(field416 - 1)) && field416 > 2) {
					var1 = 2;
				}

				if (var1 == 1 && field416 > 0) {
					method164(field416 - 1);
				}

				if (var1 != 2 || field416 <= 0) {
					return;
				}

				method42();
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method151() {
		field104 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (field127) {
				field236++;
				method35();
				method35();
				method84();
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

		field104 = false;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method152() {
		for (int var1 = -1; var1 < field217; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = field215;
			} else {
				var2 = field218[var1];
			}

			LAKHMHBY var3 = field216[var2];
			if (var3 != null && var3.field1173 > 0) {
				var3.field1173--;
				if (var3.field1173 == 0) {
					var3.field1181 = null;
				}
			}
		}

		for (int var4 = 0; var4 < field193; var4++) {
			int var5 = field194[var4];
			AVKLDTFF var6 = field192[var5];
			if (var6 != null && var6.field1173 > 0) {
				var6.field1173--;
				if (var6.field1173 == 0) {
					var6.field1181 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method153() {
		Graphics var1 = method140().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		method287(1);

		if (field312) {
			field127 = false;
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

		if (field115) {
			field127 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (field133) {
			field127 = false;
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

	@ObfuscatedName("client.K(I)V")
	public final void method154() {
		while (true) {
			EWBEDHEW var1 = field225.method485();
			if (var1 == null) {
				return;
			}

			if (var1.field583 == 0) {
				KPUOCBCE.method377(var1.field582, var1.field584);

				if ((field225.method479(var1.field584) & 0x62) != 0) {
					field431 = true;

					if (field299 != -1) {
						field195 = true;
					}
				}
			}

			if (var1.field583 == 1 && var1.field582 != null) {
				ZNUJPBQV.method582(var1.field582);
			}

			if (var1.field583 == 2 && field397 == var1.field584 && var1.field582 != null) {
				method170(var1.field582, field398);
			}

			if (var1.field583 == 3 && field252 == 1) {
				for (int var2 = 0; var2 < field459.length; var2++) {
					if (field112[var2] == var1.field584) {
						field459[var2] = var1.field582;

						if (var1.field582 == null) {
							field112[var2] = -1;
						}

						break;
					}

					if (field113[var2] == var1.field584) {
						field370[var2] = var1.field582;

						if (var1.field582 == null) {
							field113[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.field583 == 93 && field225.method481(var1.field584)) {
				DWQOSSFD.method195(field225, new XOUQUKZW(var1.field582));
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void method155() {
		for (HYUBDXHD var1 = (HYUBDXHD) field249.method332(); var1 != null; var1 = (HYUBDXHD) field249.method334()) {
			if (field105 != var1.field807 || var1.field806) {
				var1.method471();
			} else if (field425 >= var1.field803) {
				var1.method316(field476);

				if (var1.field806) {
					var1.method471();
				} else {
					field349.method244(0, var1, -1, var1.field808, var1.field809, false, var1.field810, 60, var1.field807);
				}
			}
		}
	}

	@ObfuscatedName("client.b(I)V")
	public final void method156() {
		if (!field133 && !field312 && !field115) {
			field425++;

			if (field150) {
				method75();
			} else {
				method117();
			}

			method154();
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method157() {
		field289 = 0;
		for (int var1 = -1; var1 < field217 + field193; var1++) {
			QMQRUGDN var2;
			if (var1 == -1) {
				var2 = field97;
			} else if (var1 < field217) {
				var2 = field216[field218[var1]];
			} else {
				var2 = field192[field194[var1 - field217]];
			}

			if (var2 != null && var2.method12()) {
				if (var2 instanceof AVKLDTFF) {
					HQFMWUSH var3 = ((AVKLDTFF) var2).field36;
					if (var3.field779 != null) {
						var3 = var3.method308();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= field217) {
					HQFMWUSH var7 = ((AVKLDTFF) var2).field36;
					if (var7.field771 >= 0 && var7.field771 < field434.length) {
						method172(var2.field1156 + 15, var2);

						if (field375 > -1) {
							field434[var7.field771].method499(field376 - 30, field375 - 12);
						}
					}

					if (field257 == 1 && field194[var1 - field217] == field360 && field425 % 20 < 10) {
						method172(var2.field1156 + 15, var2);

						if (field375 > -1) {
							field434[2].method499(field376 - 28, field375 - 12);
						}
					}
				} else {
					int var4 = 30;
					LAKHMHBY var5 = (LAKHMHBY) var2;
					if (var5.field937 != 0) {
						method172(var2.field1156 + 15, var2);

						if (field375 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field937 & 1 << var6) != 0) {
									field434[var6].method499(field376 - var4, field375 - 12);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && field257 == 10 && field218[var1] == field399) {
						method172(var2.field1156 + 15, var2);

						if (field375 > -1) {
							field434[7].method499(field376 - var4, field375 - 12);
						}
					}
				}

				if (var2.field1181 != null && (var1 >= field217 || field172 == 0 || field172 == 3 || field172 == 1 && method161(((LAKHMHBY) var2).field960))) {
					method172(var2.field1156, var2);

					if (field375 > -1 && field289 < field290) {
						field294[field289] = field255.method18(var2.field1181) / 2;
						field293[field289] = field255.field43;
						field291[field289] = field375;
						field292[field289] = field376;
						field295[field289] = var2.field1162;
						field296[field289] = var2.field1180;
						field297[field289] = var2.field1173;
						field298[field289++] = var2.field1181;

						if (field205 == 0 && var2.field1180 >= 1 && var2.field1180 <= 3) {
							field293[field289] += 10;
							field292[field289] += 5;
						}

						if (field205 == 0 && var2.field1180 == 4) {
							field294[field289] = 60;
						}

						if (field205 == 0 && var2.field1180 == 5) {
							field293[field289] += 5;
						}
					}
				}

				if (var2.field1175 > field425) {
					method172(var2.field1156 + 15, var2);

					if (field375 > -1) {
						int var8 = var2.field1176 * 30 / var2.field1177;
						if (var8 > 30) {
							var8 = 30;
						}

						IIPNJDNO.method322(field376 - 3, field375 - 15, 0xFF00, var8, 5);
						IIPNJDNO.method322(field376 - 3, field375 - 15 + var8, 0xFF0000, 30 - var8, 5);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.field1204[var9] > field425) {
						method172(var2.field1156 / 2, var2);

						if (field375 > -1) {
							if (var9 == 1) {
								field376 -= 20;
							}

							if (var9 == 2) {
								field375 -= 15;
								field376 -= 10;
							}

							if (var9 == 3) {
								field375 += 15;
								field376 -= 10;
							}

							field94[var2.field1203[var9]].method499(field376 - 12, field375 - 12);
							field253.method15(field376 + 4, field375, 0, String.valueOf(var2.field1202[var9]));
							field253.method15(field376 + 3, field375 - 1, 0xFFFFFF, String.valueOf(var2.field1202[var9]));
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < field289; var10++) {
			int var11 = field291[var10];
			int var12 = field292[var10];
			int var13 = field294[var10];
			int var14 = field293[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > field292[var16] - field293[var16] && var12 - var14 < field292[var16] + 2 && var11 - var13 < field294[var16] + field291[var16] && var11 + var13 > field291[var16] - field294[var16] && field292[var16] - field293[var16] < var12) {
						var12 = field292[var16] - field293[var16];
						var15 = true;
					}
				}
			}

			field375 = field291[var10];
			field376 = field292[var10] = var12;
			String var17 = field298[var10];
			if (field205 == 0) {
				int var18 = 0xFFFF00;
				if (field295[var10] < 6) {
					var18 = field188[field295[var10]];
				}

				if (field295[var10] == 6) {
					var18 = field353 % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (field295[var10] == 7) {
					var18 = field353 % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (field295[var10] == 8) {
					var18 = field353 % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (field295[var10] == 9) {
					int var19 = 150 - field297[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (field295[var10] == 10) {
					int var20 = 150 - field297[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (field295[var10] == 11) {
					int var21 = 150 - field297[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (field296[var10] == 0) {
					field255.method15(field376 + 1, field375, 0, var17);
					field255.method15(field376, field375, var18, var17);
				}

				if (field296[var10] == 1) {
					field255.method20(var17, field375, field353, field376 + 1, 0);
					field255.method20(var17, field375, field353, field376, var18);
				}

				if (field296[var10] == 2) {
					field255.method21(var17, field376 + 1, 0, field353, field375);
					field255.method21(var17, field376, var18, field353, field375);
				}

				if (field296[var10] == 3) {
					field255.method22(0, var17, field353, 150 - field297[var10], field376 + 1, field375);
					field255.method22(var18, var17, field353, 150 - field297[var10], field376, field375);
				}

				if (field296[var10] == 4) {
					int var22 = field255.method18(var17);
					int var23 = (150 - field297[var10]) * (var22 + 100) / 150;
					IIPNJDNO.method319(field375 + 50, 0, field375 - 50, 334);
					field255.method19(var17, 0, field376 + 1, field375 + 50 - var23);
					field255.method19(var17, var18, field376, field375 + 50 - var23);
					IIPNJDNO.method318();
				}

				if (field296[var10] == 5) {
					int var24 = 150 - field297[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					IIPNJDNO.method319(512, field376 - field255.field43 - 1, 0, field376 + 5);
					field255.method15(field376 + var25 + 1, field375, 0, var17);
					field255.method15(field376 + var25, field375, var18, var17);
					IIPNJDNO.method318();
				}
			} else {
				field255.method15(field376 + 1, field375, 0, var17);
				field255.method15(field376, field375, 0xFFFF00, var17);
			}
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method158(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < field207; var3++) {
				if (field57[var3] == arg0) {
					field207--;
					field431 = true;

					for (int var4 = var3; var4 < field207; var4++) {
						field57[var4] = field57[var4 + 1];
					}

					field132.method510(27);
					field132.method517(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.N(I)V")
	public final void method159() {
		while (true) {
			int var1 = method288();
			if (var1 == -1) {
				return;
			}

			if (field392 != -1 && field392 == field131) {
				if (var1 == 8 && field128.length() > 0) {
					field128 = field128.substring(0, field128.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && field128.length() < 12) {
					field128 = field128 + (char) var1;
				}
			} else if (field144) {
				if (var1 >= 32 && var1 <= 122 && field400.length() < 80) {
					field400 = field400 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field400.length() > 0) {
					field400 = field400.substring(0, field400.length() - 1);
					field195 = true;
				}

				if (var1 == 13 || var1 == 10) {
					field144 = false;
					field195 = true;

					if (field229 == 1) {
						long var2 = YBENSMAZ.method563(field400);
						method134(var2);
					}

					if (field229 == 2 && field169 > 0) {
						long var4 = YBENSMAZ.method563(field400);
						method73(var4);
					}

					if (field229 == 3 && field400.length() > 0) {
						field132.method510(59);
						field132.method511(0);
						int var6 = field132.field1367;
						field132.method517(field411);
						EEYZEKLH.method217(field400, field132);
						field132.method520(field132.field1367 - var6);
						field400 = EEYZEKLH.method218(field400);
						field400 = IVFROAJT.method347(field400);
						method100(YBENSMAZ.method567(YBENSMAZ.method564(field411)), 6, field400);

						if (field414 == 2) {
							field414 = 1;
							field366 = true;
							field132.method510(26);
							field132.method511(field172);
							field132.method511(field414);
							field132.method511(field156);
						}
					}

					if (field229 == 4 && field207 < 100) {
						long var7 = YBENSMAZ.method563(field400);
						method62(var7);
					}

					if (field229 == 5 && field207 > 0) {
						long var9 = YBENSMAZ.method563(field400);
						method158(var9);
					}
				}
			} else if (field122 == 1) {
				if (var1 >= 48 && var1 <= 57 && field103.length() < 10) {
					field103 = field103 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field103.length() > 0) {
					field103 = field103.substring(0, field103.length() - 1);
					field195 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field103.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(field103);
						} catch (Exception var21) {
						}

						field132.method510(214);
						field132.method515(var11);
					}

					field122 = 0;
					field195 = true;
				}
			} else if (field122 == 2) {
				if (var1 >= 32 && var1 <= 122 && field103.length() < 12) {
					field103 = field103 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field103.length() > 0) {
					field103 = field103.substring(0, field103.length() - 1);
					field195 = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (field103.length() > 0) {
						field132.method510(203);
						field132.method517(YBENSMAZ.method563(field103));
					}

					field122 = 0;
					field195 = true;
				}
			} else if (field299 == -1) {
				if (var1 >= 32 && var1 <= 122 && field424.length() < 80) {
					field424 = field424 + (char) var1;
					field195 = true;
				}

				if (var1 == 8 && field424.length() > 0) {
					field424 = field424.substring(0, field424.length() - 1);
					field195 = true;
				}

				if ((var1 == 13 || var1 == 10) && field424.length() > 0) {
					if (field275 == 2) {
						if (field424.equals("::clientdrop")) {
							method118();
						}

						if (field424.equals("::lag")) {
							method139();
						}

						if (field424.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < field225.method486(2); var12++) {
								field225.method473((byte) 1, 2, var12);
							}
						}

						if (field424.equals("::fpson")) {
							field146 = true;
						}

						if (field424.equals("::fpsoff")) {
							field146 = false;
						}

						if (field424.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										field326[var13].field1416[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (field424.startsWith("::")) {
						field132.method510(109);
						field132.method511(field424.length() - 1);
						field132.method518(field424.substring(2));
					} else {
						String var16 = field424.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							field424 = field424.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							field424 = field424.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							field424 = field424.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							field424 = field424.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							field424 = field424.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							field424 = field424.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							field424 = field424.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							field424 = field424.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							field424 = field424.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							field424 = field424.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							field424 = field424.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							field424 = field424.substring(6);
						}

						String var18 = field424.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							field424 = field424.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							field424 = field424.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							field424 = field424.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							field424 = field424.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							field424 = field424.substring(6);
						}

						field132.method510(226);
						field132.method511(0);
						int var20 = field132.field1367;
						field132.method537(var17);
						field132.method538(var19);
						field191.field1367 = 0;
						EEYZEKLH.method217(field424, field191);
						field132.method557(0, field191.field1367, field191.field1366);
						field132.method520(field132.field1367 - var20);
						field424 = EEYZEKLH.method218(field424);
						field424 = IVFROAJT.method347(field424);
						field97.field1181 = field424;
						field97.field1162 = var17;
						field97.field1180 = var19;
						field97.field1173 = 150;

						if (field275 == 2) {
							method100("@cr2@" + field97.field960, 2, field97.field1181);
						} else if (field275 == 1) {
							method100("@cr1@" + field97.field960, 2, field97.field1181);
						} else {
							method100(field97.field960, 2, field97.field1181);
						}

						if (field172 == 2) {
							field172 = 3;
							field366 = true;
							field132.method510(26);
							field132.method511(field172);
							field132.method511(field414);
							field132.method511(field156);
						}
					}

					field424 = "";
					field195 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIILHQFMWUSH;)V")
	public final void method160(int arg0, int arg1, int arg2, HQFMWUSH arg3) {
		if (field416 < 400) {
			if (arg3.field779 != null) {
				arg3 = arg3.method308();
			}

			if (arg3 != null && arg3.field780) {
				String var5 = arg3.field789;
				if (arg3.field773 != 0) {
					var5 = var5 + method129(field97.field955, arg3.field773) + " (level-" + arg3.field773 + ")";
				}

				if (field263 == 1) {
					field125[field416] = "Use " + field267 + " with @yel@" + var5;
					field443[field416] = 728;
					field444[field416] = arg2;
					field441[field416] = arg0;
					field442[field416] = arg1;
					field416++;
				} else if (field343 != 1) {
					if (arg3.field796 != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg3.field796[var6] != null && !arg3.field796[var6].equalsIgnoreCase("attack")) {
								field125[field416] = arg3.field796[var6] + " @yel@" + var5;

								if (var6 == 0) {
									field443[field416] = 638;
								}

								if (var6 == 1) {
									field443[field416] = 523;
								}

								if (var6 == 2) {
									field443[field416] = 993;
								}

								if (var6 == 3) {
									field443[field416] = 773;
								}

								if (var6 == 4) {
									field443[field416] = 473;
								}

								field444[field416] = arg2;
								field441[field416] = arg0;
								field442[field416] = arg1;
								field416++;
							}
						}
					}

					if (arg3.field796 != null) {
						for (int var7 = 4; var7 >= 0; var7--) {
							if (arg3.field796[var7] != null && arg3.field796[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (arg3.field773 > field97.field955) {
									var8 = 2000;
								}

								field125[field416] = arg3.field796[var7] + " @yel@" + var5;

								if (var7 == 0) {
									field443[field416] = var8 + 638;
								}

								if (var7 == 1) {
									field443[field416] = var8 + 523;
								}

								if (var7 == 2) {
									field443[field416] = var8 + 993;
								}

								if (var7 == 3) {
									field443[field416] = var8 + 773;
								}

								if (var7 == 4) {
									field443[field416] = var8 + 473;
								}

								field444[field416] = arg2;
								field441[field416] = arg0;
								field442[field416] = arg1;
								field416++;
							}
						}
					}

					field125[field416] = "Examine @yel@" + var5;
					field443[field416] = 1659;
					field444[field416] = arg2;
					field441[field416] = arg0;
					field442[field416] = arg1;
					field416++;
				} else if ((field345 & 0x2) == 2) {
					field125[field416] = field346 + " @yel@" + var5;
					field443[field416] = 771;
					field444[field416] = arg2;
					field441[field416] = arg0;
					field442[field416] = arg1;
					field416++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method161(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < field169; var2++) {
			if (arg0.equalsIgnoreCase(field226[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(field97.field960)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method162(String arg0) throws IOException {
		if (field325) {
			if (field308 != null) {
				try {
					field308.close();
				} catch (Exception var4) {
				}

				field308 = null;
			}

			field308 = method135(43595);
			field308.setSoTimeout(10000);
			InputStream var2 = field308.getInputStream();
			OutputStream var3 = field308.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.O(I)V")
	public final void method163() {
		if (field702 == 1) {
			if (field703 >= 539 && field703 <= 573 && field704 >= 169 && field704 < 205 && field81[0] != -1) {
				field431 = true;
				field333 = 0;
				field140 = true;
			}

			if (field703 >= 569 && field703 <= 599 && field704 >= 168 && field704 < 205 && field81[1] != -1) {
				field431 = true;
				field333 = 1;
				field140 = true;
			}

			if (field703 >= 597 && field703 <= 627 && field704 >= 168 && field704 < 205 && field81[2] != -1) {
				field431 = true;
				field333 = 2;
				field140 = true;
			}

			if (field703 >= 625 && field703 <= 669 && field704 >= 168 && field704 < 203 && field81[3] != -1) {
				field431 = true;
				field333 = 3;
				field140 = true;
			}

			if (field703 >= 666 && field703 <= 696 && field704 >= 168 && field704 < 205 && field81[4] != -1) {
				field431 = true;
				field333 = 4;
				field140 = true;
			}

			if (field703 >= 694 && field703 <= 724 && field704 >= 168 && field704 < 205 && field81[5] != -1) {
				field431 = true;
				field333 = 5;
				field140 = true;
			}

			if (field703 >= 722 && field703 <= 756 && field704 >= 169 && field704 < 205 && field81[6] != -1) {
				field431 = true;
				field333 = 6;
				field140 = true;
			}

			if (field703 >= 540 && field703 <= 574 && field704 >= 466 && field704 < 502 && field81[7] != -1) {
				field431 = true;
				field333 = 7;
				field140 = true;
			}

			if (field703 >= 572 && field703 <= 602 && field704 >= 466 && field704 < 503 && field81[8] != -1) {
				field431 = true;
				field333 = 8;
				field140 = true;
			}

			if (field703 >= 599 && field703 <= 629 && field704 >= 466 && field704 < 503 && field81[9] != -1) {
				field431 = true;
				field333 = 9;
				field140 = true;
			}

			if (field703 >= 627 && field703 <= 671 && field704 >= 467 && field704 < 502 && field81[10] != -1) {
				field431 = true;
				field333 = 10;
				field140 = true;
			}

			if (field703 >= 669 && field703 <= 699 && field704 >= 466 && field704 < 503 && field81[11] != -1) {
				field431 = true;
				field333 = 11;
				field140 = true;
			}

			if (field703 >= 696 && field703 <= 726 && field704 >= 466 && field704 < 503 && field81[12] != -1) {
				field431 = true;
				field333 = 12;
				field140 = true;
			}

			if (field703 >= 724 && field703 <= 758 && field704 >= 466 && field704 < 502 && field81[13] != -1) {
				field431 = true;
				field333 = 13;
				field140 = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.c(IB)V")
	public final void method164(int arg0) {
		if (arg0 >= 0) {
			if (field122 != 0) {
				field122 = 0;
				field195 = true;
			}

			int var2 = field441[arg0];
			int var3 = field442[arg0];
			int var4 = field443[arg0];
			int var5 = field444[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 627) {
				field132.method510(156);
				field132.method512(var3);
				PFVGIFDY var6 = PFVGIFDY.field1078[var3];
				if (var6.field1132 != null && var6.field1132[0][0] == 5) {
					int var7 = var6.field1132[0][1];
					field342[var7] = 1 - field342[var7];
					method165(var7);
					field431 = true;
				}
			}

			if (var4 == 394) {
				String var8 = field125[arg0];
				int var9 = var8.indexOf("@whi@");
				if (var9 != -1) {
					long var10 = YBENSMAZ.method563(var8.substring(var9 + 5).trim());
					int var12 = -1;
					for (int var13 = 0; var13 < field169; var13++) {
						if (field331[var13] == var10) {
							var12 = var13;
							break;
						}
					}

					if (var12 != -1 && field100[var12] > 0) {
						field195 = true;
						field122 = 0;
						field144 = true;
						field400 = "";
						field229 = 3;
						field411 = field331[var12];
						field261 = "Enter message to send to " + field226[var12];
					}
				}
			}

			if (var4 == 975) {
				field132.method510(156);
				field132.method512(var3);
				PFVGIFDY var14 = PFVGIFDY.field1078[var3];
				if (var14.field1132 != null && var14.field1132[0][0] == 5) {
					int var15 = var14.field1132[0][1];
					if (field342[var15] != var14.field1083[0]) {
						field342[var15] = var14.field1083[0];
						method165(var15);
						field431 = true;
					}
				}
			}

			if (var4 == 1689) {
				int var16 = var5 >> 14 & 0x7FFF;
				SCWSBSIM var17 = SCWSBSIM.method464(var16);
				String var18;
				if (var17.field1251 == null) {
					var18 = "It's a " + var17.field1278 + ".";
				} else {
					var18 = new String(var17.field1251);
				}

				method100("", 0, var18);
			}

			if (var4 == 542 && !field77) {
				field132.method510(56);
				field132.method512(var3);
				field77 = true;
			}

			if (var4 == 374) {
				boolean var19 = method126(0, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 0, 0);
				if (!var19) {
					method126(1, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 1, 0);
				}

				field470 = field703;
				field471 = field704;
				field473 = 2;
				field472 = 0;
				field132.method510(124);
				field132.method545(field184 + var2);
				field132.method512(var5);
				field132.method546(field344);
				field132.method546(field185 + var3);
			}

			if (var4 == 473) {
				AVKLDTFF var21 = field192[var5];
				if (var21 != null) {
					method126(1, var21.field1193[0], 0, 2, field97.field1192[0], 0, var21.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(42);
					field132.method545(var5);
				}
			}

			if (var4 == 583) {
				method99(var2, var5, var3);
				field132.method510(215);
				field132.method545(var5 >> 14 & 0x7FFF);
				field132.method546(field185 + var3);
				field132.method512(field184 + var2);
			}

			if (var4 == 771) {
				AVKLDTFF var22 = field192[var5];
				if (var22 != null) {
					method126(1, var22.field1193[0], 0, 2, field97.field1192[0], 0, var22.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(169);
					field132.method512(var5);
					field132.method547(field344);
				}
			}

			if (var4 == 416) {
				field132.method510(129);
				field132.method546(var3);
				field132.method512(var5);
				field132.method512(var2);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 18 || var4 == 188) {
				String var23 = field125[arg0];
				int var24 = var23.indexOf("@whi@");
				if (var24 != -1) {
					var23 = var23.substring(var24 + 5).trim();
					String var25 = YBENSMAZ.method567(YBENSMAZ.method564(YBENSMAZ.method563(var23)));
					boolean var26 = false;
					for (int var27 = 0; var27 < field217; var27++) {
						LAKHMHBY var28 = field216[field218[var27]];
						if (var28 != null && var28.field960 != null && var28.field960.equalsIgnoreCase(var25)) {
							method126(1, var28.field1193[0], 0, 2, field97.field1192[0], 0, var28.field1192[0], false, field97.field1193[0], 1, 0);

							if (var4 == 18) {
								field132.method510(31);
								field132.method547(field218[var27]);
							}

							if (var4 == 188) {
								field283++;
								if (field283 >= 104) {
									field132.method510(62);
									field132.method515(0);
									field283 = 0;
								}

								field132.method510(164);
								field132.method546(field218[var27]);
							}

							var26 = true;
							break;
						}
					}

					if (!var26) {
						method100("", 0, "Unable to find " + var25);
					}
				}
			}

			if (var4 == 616) {
				field132.method510(57);
				field132.method547(var3);
				field132.method512(var2);
				field132.method545(field264);
				field132.method547(var5);
				field132.method545(field266);
				field132.method547(field265);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 863) {
				method94();
			}

			if (var4 == 523) {
				AVKLDTFF var29 = field192[var5];
				if (var29 != null) {
					method126(1, var29.field1193[0], 0, 2, field97.field1192[0], 0, var29.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(201);
					field132.method546(var5);
				}
			}

			if (var4 == 4) {
				LAKHMHBY var30 = field216[var5];
				if (var30 != null) {
					method126(1, var30.field1193[0], 0, 2, field97.field1192[0], 0, var30.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;

					if ((var5 & 0x3) == 0) {
						field450++;
					}

					if (field450 >= 85) {
						field132.method510(206);
						field132.method512(42716);
						field450 = 0;
					}

					field132.method510(171);
					field132.method512(var5);
				}
			}

			if (var4 == 804) {
				field70++;
				if (field70 >= 59) {
					field132.method510(100);
					field132.method515(0);
					field70 = 0;
				}

				field132.method510(81);
				field132.method545(var5);
				field132.method547(var3);
				field132.method512(var2);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 1686) {
				method99(var2, var5, var3);
				field132.method510(16);
				field132.method512(field185 + var3);
				field132.method545(field184 + var2);
				field132.method512(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 397) {
				LAKHMHBY var31 = field216[var5];
				if (var31 != null) {
					method126(1, var31.field1193[0], 0, 2, field97.field1192[0], 0, var31.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(110);
					field132.method547(var5);
				}
			}

			if (var4 == 630) {
				field132.method510(78);
				field132.method512(var3);
				field132.method546(var2);
				field132.method547(var5);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 752) {
				field132.method510(54);
				field132.method545(var2);
				field132.method546(var5);
				field132.method546(var3);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 412) {
				boolean var32 = method126(0, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 0, 0);
				if (!var32) {
					method126(1, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 1, 0);
				}

				field470 = field703;
				field471 = field704;
				field473 = 2;
				field472 = 0;
				field132.method510(227);
				field132.method512(field184 + var2);
				field132.method512(var5);
				field132.method512(field185 + var3);
			}

			if (var4 == 653) {
				method99(var2, var5, var3);
				field132.method510(192);
				field132.method547(field184 + var2);
				field132.method547(field185 + var3);
				field132.method546(var5 >> 14 & 0x7FFF);
			}

			if (var4 == 813) {
				boolean var34 = method126(0, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 0, 0);
				if (!var34) {
					method126(1, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 1, 0);
				}

				field470 = field703;
				field471 = field704;
				field473 = 2;
				field472 = 0;
				field132.method510(84);
				field132.method546(field184 + var2);
				field132.method547(field185 + var3);
				field132.method546(var5);
			}

			if (var4 == 933) {
				boolean var36 = method126(0, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 0, 0);
				if (!var36) {
					method126(1, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 1, 0);
				}

				field470 = field703;
				field471 = field704;
				field473 = 2;
				field472 = 0;
				field132.method510(28);
				field132.method545(var5);
				field132.method546(field185 + var3);
				field132.method547(field184 + var2);
			}

			if (var4 == 638) {
				AVKLDTFF var38 = field192[var5];
				if (var38 != null) {
					method126(1, var38.field1193[0], 0, 2, field97.field1192[0], 0, var38.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(216);
					field132.method545(var5);
				}
			}

			if (var4 == 617) {
				field106 += var3;
				if (field106 >= 147) {
					field132.method510(195);
					field132.method511(220);
					field106 = 0;
				}

				field132.method510(247);
				field132.method545(var2);
				field132.method545(var3);
				field132.method547(var5);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 728) {
				AVKLDTFF var39 = field192[var5];
				if (var39 != null) {
					method126(1, var39.field1193[0], 0, 2, field97.field1192[0], 0, var39.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(10);
					field132.method545(var5);
					field132.method512(field265);
					field132.method512(field264);
					field132.method512(field266);
				}
			}

			if (var4 == 91) {
				method99(var2, var5, var3);
				field132.method510(77);
				field132.method545(field184 + var2);
				field132.method512(var5 >> 14 & 0x7FFF);
				field132.method545(field185 + var3);
			}

			if (var4 == 566) {
				boolean var40 = method126(0, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 0, 0);
				if (!var40) {
					method126(1, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 1, 0);
				}

				field470 = field703;
				field471 = field704;
				field473 = 2;
				field472 = 0;
				field132.method510(188);
				field132.method547(var5);
				field132.method545(field184 + var2);
				field132.method545(field185 + var3);
			}

			if (var4 == 343) {
				boolean var42 = method126(0, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 0, 0);
				if (!var42) {
					method126(1, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 1, 0);
				}

				field470 = field703;
				field471 = field704;
				field473 = 2;
				field472 = 0;
				field132.method510(61);
				field132.method546(var5);
				field132.method547(field184 + var2);
				field132.method545(field185 + var3);
			}

			if (var4 == 1410) {
				HMRHACIQ var44 = HMRHACIQ.method293(var5);
				PFVGIFDY var45 = PFVGIFDY.field1078[var3];
				String var46;
				if (var45 != null && var45.field1100[var2] >= 100000) {
					var46 = var45.field1100[var2] + " x " + var44.field757;
				} else if (var44.field720 == null) {
					var46 = "It's a " + var44.field757 + ".";
				} else {
					var46 = new String(var44.field720);
				}

				method100("", 0, var46);
			}

			if (var4 == 877) {
				LAKHMHBY var47 = field216[var5];
				if (var47 != null) {
					method126(1, var47.field1193[0], 0, 2, field97.field1192[0], 0, var47.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(73);
					field132.method547(field344);
					field132.method512(var5);
				}
			}

			if (var4 == 769) {
				field132.method510(212);
				field132.method547(var5);
				field132.method545(var2);
				field132.method545(var3);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 704) {
				field129++;
				if (field129 >= 124) {
					field132.method510(99);
					field129 = 0;
				}

				field132.method510(242);
				field132.method512(var3);
				field132.method545(var5);
				field132.method512(var2);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 472) {
				if (field348) {
					field349.method271(var3 - 4, var2 - 4);
				} else {
					field349.method271(field704 - 4, field703 - 4);
				}
			}

			if (var4 == 423) {
				String var48 = field125[arg0];
				int var49 = var48.indexOf("@whi@");
				if (var49 != -1) {
					if (field392 == -1) {
						method94();
						field128 = var48.substring(var49 + 5).trim();
						field96 = false;

						for (int var50 = 0; var50 < PFVGIFDY.field1078.length; var50++) {
							if (PFVGIFDY.field1078[var50] != null && PFVGIFDY.field1078[var50].field1094 == 600) {
								field131 = field392 = PFVGIFDY.field1078[var50].field1073;
								break;
							}
						}
					} else {
						method100("", 0, "Please close the interface you have open before using 'report abuse'");
					}
				}
			}

			if (var4 == 993) {
				AVKLDTFF var51 = field192[var5];
				if (var51 != null) {
					method126(1, var51.field1193[0], 0, 2, field97.field1192[0], 0, var51.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(80);
					field132.method545(var5);
				}
			}

			if (var4 == 978) {
				LAKHMHBY var52 = field216[var5];
				if (var52 != null) {
					method126(1, var52.field1193[0], 0, 2, field97.field1192[0], 0, var52.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(191);
					field132.method546(var5);
					field132.method512(field266);
					field132.method512(field265);
					field132.method512(field264);
				}
			}

			if (var4 == 19) {
				LAKHMHBY var53 = field216[var5];
				if (var53 != null) {
					method126(1, var53.field1193[0], 0, 2, field97.field1192[0], 0, var53.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(31);
					field132.method547(var5);
				}
			}

			if (var4 == 1659) {
				AVKLDTFF var54 = field192[var5];
				if (var54 != null) {
					HQFMWUSH var55 = var54.field36;
					if (var55.field779 != null) {
						var55 = var55.method308();
					}

					if (var55 != null) {
						String var56;
						if (var55.field765 == null) {
							var56 = "It's a " + var55.field789 + ".";
						} else {
							var56 = new String(var55.field765);
						}

						method100("", 0, var56);
					}
				}
			}

			if (var4 == 716) {
				LAKHMHBY var57 = field216[var5];
				if (var57 != null) {
					method126(1, var57.field1193[0], 0, 2, field97.field1192[0], 0, var57.field1192[0], false, field97.field1193[0], 1, 0);
					field470 = field703;
					field471 = field704;
					field473 = 2;
					field472 = 0;
					field132.method510(114);
					field132.method546(var5);
				}
			}

			if (var4 == 801) {
				field132.method510(105);
				field132.method545(var3);
				field132.method512(var2);
				field132.method545(var5);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 992) {
				field132.method510(233);
				field132.method547(field344);
				field132.method545(var5);
				field132.method545(var2);
				field132.method547(var3);
				field279 = 0;
				field280 = var3;
				field281 = var2;
				field282 = 2;
				if (PFVGIFDY.field1078[var3].field1073 == field392) {
					field282 = 1;
				}

				if (PFVGIFDY.field1078[var3].field1073 == field299) {
					field282 = 3;
				}
			}

			if (var4 == 762) {
				field263 = 1;
				field264 = var2;
				field265 = var3;
				field266 = var5;
				field267 = HMRHACIQ.method293(var5).field757;
				field343 = 0;
				field431 = true;
			} else {
				if (var4 == 591 && method99(var2, var5, var3)) {
					field132.method510(221);
					field132.method547(var5 >> 14 & 0x7FFF);
					field132.method545(field184 + var2);
					field132.method512(field185 + var3);
					field132.method547(field344);
				}

				if (var4 == 1770) {
					HMRHACIQ var58 = HMRHACIQ.method293(var5);
					String var59;
					if (var58.field720 == null) {
						var59 = "It's a " + var58.field757 + ".";
					} else {
						var59 = new String(var58.field720);
					}

					method100("", 0, var59);
				}

				if (var4 == 604) {
					PFVGIFDY var60 = PFVGIFDY.field1078[var3];
					field343 = 1;
					field344 = var3;
					field345 = var60.field1119;
					field263 = 0;
					field431 = true;
					String var61 = var60.field1127;
					if (var61.indexOf(" ") != -1) {
						var61 = var61.substring(0, var61.indexOf(" "));
					}

					String var62 = var60.field1127;
					if (var62.indexOf(" ") != -1) {
						var62 = var62.substring(var62.indexOf(" ") + 1);
					}

					field346 = var61 + " " + var60.field1090 + " " + var62;

					if (field345 == 16) {
						field431 = true;
						field333 = 3;
						field140 = true;
					}
				} else {
					if (var4 == 142) {
						field132.method510(250);
						field132.method546(var3);
						field132.method547(var5);
						field132.method545(var2);
						field279 = 0;
						field280 = var3;
						field281 = var2;
						field282 = 2;
						if (PFVGIFDY.field1078[var3].field1073 == field392) {
							field282 = 1;
						}

						if (PFVGIFDY.field1078[var3].field1073 == field299) {
							field282 = 3;
						}
					}

					if (var4 == 918) {
						boolean var63 = method126(0, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 0, 0);
						if (!var63) {
							method126(1, var3, 0, 2, field97.field1192[0], 0, var2, false, field97.field1193[0], 1, 0);
						}

						field470 = field703;
						field471 = field704;
						field473 = 2;
						field472 = 0;
						field132.method510(39);
						field132.method546(var5);
						field132.method546(field266);
						field132.method545(field184 + var2);
						field132.method546(field264);
						field132.method546(field265);
						field132.method547(field185 + var3);
					}

					if (var4 == 255) {
						field132.method510(125);
						field132.method512(var3);
						field132.method546(var2);
						field132.method545(var5);
						field279 = 0;
						field280 = var3;
						field281 = var2;
						field282 = 2;
						if (PFVGIFDY.field1078[var3].field1073 == field392) {
							field282 = 1;
						}

						if (PFVGIFDY.field1078[var3].field1073 == field299) {
							field282 = 3;
						}
					}

					if (var4 == 290 || var4 == 400 || var4 == 324 || var4 == 670) {
						String var65 = field125[arg0];
						int var66 = var65.indexOf("@whi@");
						if (var66 != -1) {
							long var67 = YBENSMAZ.method563(var65.substring(var66 + 5).trim());
							if (var4 == 290) {
								method134(var67);
							}

							if (var4 == 400) {
								method62(var67);
							}

							if (var4 == 324) {
								method73(var67);
							}

							if (var4 == 670) {
								method158(var67);
							}
						}
					}

					if (var4 == 639) {
						method99(var2, var5, var3);
						field132.method510(222);
						field132.method545(field185 + var3);
						field132.method547(var5 >> 14 & 0x7FFF);
						field132.method546(field184 + var2);
					}

					if (var4 == 903) {
						PFVGIFDY var69 = PFVGIFDY.field1078[var3];
						boolean var70 = true;
						if (var69.field1094 > 0) {
							var70 = method142(var69);
						}

						if (var70) {
							field132.method510(156);
							field132.method512(var3);
						}
					}

					if (var4 == 725) {
						LAKHMHBY var71 = field216[var5];
						if (var71 != null) {
							method126(1, var71.field1193[0], 0, 2, field97.field1192[0], 0, var71.field1192[0], false, field97.field1193[0], 1, 0);
							field470 = field703;
							field471 = field704;
							field473 = 2;
							field472 = 0;
							field283++;
							if (field283 >= 104) {
								field132.method510(62);
								field132.method515(0);
								field283 = 0;
							}

							field132.method510(164);
							field132.method546(var5);
						}
					}

					if (var4 == 773) {
						AVKLDTFF var72 = field192[var5];
						if (var72 != null) {
							method126(1, var72.field1193[0], 0, 2, field97.field1192[0], 0, var72.field1192[0], false, field97.field1193[0], 1, 0);
							field470 = field703;
							field471 = field704;
							field473 = 2;
							field472 = 0;
							field132.method510(223);
							field132.method546(var5);
						}
					}

					if (var4 == 553 && method99(var2, var5, var3)) {
						field132.method510(251);
						field132.method512(field185 + var3);
						field132.method547(field265);
						field132.method546(field184 + var2);
						field132.method547(var5 >> 14 & 0x7FFF);
						field132.method545(field266);
						field132.method547(field264);
					}

					field263 = 0;
					field343 = 0;
					field431 = true;
				}
			}
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method165(int arg0) {
		int var2 = NJBQYBAL.field983[arg0].field991;
		if (var2 != 0) {
			int var3 = field342[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					OIDJTTQC.method440(0.9D);
				}

				if (var3 == 2) {
					OIDJTTQC.method440(0.8D);
				}

				if (var3 == 3) {
					OIDJTTQC.method440(0.7D);
				}

				if (var3 == 4) {
					OIDJTTQC.method440(0.6D);
				}

				HMRHACIQ.field725.method304();
				field369 = true;
			}

			if (var2 == 3) {
				boolean var4 = field155;

				if (var3 == 0) {
					method47(0, field155);
					field155 = true;
				}

				if (var3 == 1) {
					method47(-400, field155);
					field155 = true;
				}

				if (var3 == 2) {
					method47(-800, field155);
					field155 = true;
				}

				if (var3 == 3) {
					method47(-1200, field155);
					field155 = true;
				}

				if (var3 == 4) {
					field155 = false;
				}

				if (field155 != var4 && !field160) {
					if (field155) {
						field397 = field239;
						field398 = true;
						field225.method478(2, field397);
					} else {
						method64();
					}

					field190 = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					field433 = true;
					method143(0);
				}

				if (var3 == 1) {
					field433 = true;
					method143(-400);
				}

				if (var3 == 2) {
					field433 = true;
					method143(-800);
				}

				if (var3 == 3) {
					field433 = true;
					method143(-1200);
				}

				if (var3 == 4) {
					field433 = false;
				}
			}

			if (var2 == 5) {
				field435 = var3;
			}

			if (var2 == 6) {
				field205 = var3;
			}

			if (var2 == 8) {
				field126 = var3;
				field195 = true;
			}

			if (var2 == 9) {
				field101 = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IBLXOUQUKZW;)V")
	public final void method166(int arg0, XOUQUKZW arg1) {
		while (arg1.field1368 + 10 < arg0 * 8) {
			int var3 = arg1.method532(11);
			if (var3 == 2047) {
				break;
			}

			if (field216[var3] == null) {
				field216[var3] = new LAKHMHBY();
				if (field221[var3] != null) {
					field216[var3].method410(field221[var3]);
				}
			}

			field218[field217++] = var3;
			LAKHMHBY var4 = field216[var3];
			var4.field1160 = field425;
			int var5 = arg1.method532(1);
			if (var5 == 1) {
				field220[field219++] = var3;
			}

			int var6 = arg1.method532(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.method532(1);
			int var8 = arg1.method532(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.method454(field97.field1193[0] + var6, field97.field1192[0] + var8, var7 == 1);
		}

		arg1.method533();
	}

	@ObfuscatedName("client.d(LXOUQUKZW;II)V")
	public final void method167(XOUQUKZW arg0, int arg1) {
		arg0.method531();
		int var3 = arg0.method532(8);
		if (var3 < field193) {
			for (int var4 = var3; var4 < field193; var4++) {
				field223[field222++] = field194[var4];
			}
		}

		if (var3 > field193) {
			signlink.reporterror(field351 + " Too many npcs");
			throw new RuntimeException("eek");
		}

		field193 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = field194[var5];
			AVKLDTFF var7 = field192[var6];
			int var8 = arg0.method532(1);
			if (var8 == 0) {
				field194[field193++] = var6;
				var7.field1160 = field425;
			} else {
				int var9 = arg0.method532(2);
				if (var9 == 0) {
					field194[field193++] = var6;
					var7.field1160 = field425;
					field220[field219++] = var6;
				} else if (var9 == 1) {
					field194[field193++] = var6;
					var7.field1160 = field425;
					int var10 = arg0.method532(3);
					var7.method457(false, var10);
					int var11 = arg0.method532(1);
					if (var11 == 1) {
						field220[field219++] = var6;
					}
				} else if (var9 == 2) {
					field194[field193++] = var6;
					var7.field1160 = field425;
					int var12 = arg0.method532(3);
					var7.method457(true, var12);
					int var13 = arg0.method532(3);
					var7.method457(true, var13);
					int var14 = arg0.method532(1);
					if (var14 == 1) {
						field220[field219++] = var6;
					}
				} else if (var9 == 3) {
					field223[field222++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILPFVGIFDY;)V")
	public final void method168(PFVGIFDY arg0) {
		int var2 = arg0.field1094;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && field170 == 0) {
				arg0.field1106 = "Loading friend list";
				arg0.field1093 = 0;
			} else if (var2 == 1 && field170 == 1) {
				arg0.field1106 = "Connecting to friendserver";
				arg0.field1093 = 0;
			} else if (var2 == 2 && field170 != 2) {
				arg0.field1106 = "Please wait...";
				arg0.field1093 = 0;
			} else {
				int var3 = field169;
				if (field170 != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.field1106 = "";
					arg0.field1093 = 0;
				} else {
					arg0.field1106 = field226[var2];
					arg0.field1093 = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = field169;
			if (field170 != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
				arg0.field1106 = "";
				arg0.field1093 = 0;
			} else {
				if (field100[var2] == 0) {
					arg0.field1106 = "@red@Offline";
				} else if (field100[var2] == field157) {
					arg0.field1106 = "@gre@World-" + (field100[var2] - 9);
				} else {
					arg0.field1106 = "@yel@World-" + (field100[var2] - 9);
				}

				arg0.field1093 = 1;
			}
		} else if (var2 == 203) {
			int var5 = field169;
			if (field170 != 2) {
				var5 = 0;
			}

			arg0.field1113 = var5 * 15 + 20;
			if (arg0.field1113 <= arg0.field1077) {
				arg0.field1113 = arg0.field1077 + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && field170 == 0) {
				arg0.field1106 = "Loading ignore list";
				arg0.field1093 = 0;
			} else if (var2 == 1 && field170 == 0) {
				arg0.field1106 = "Please wait...";
				arg0.field1093 = 0;
			} else {
				int var6 = field207;
				if (field170 == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.field1106 = "";
					arg0.field1093 = 0;
				} else {
					arg0.field1106 = YBENSMAZ.method567(YBENSMAZ.method564(field57[var2]));
					arg0.field1093 = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.field1113 = field207 * 15 + 20;
			if (arg0.field1113 <= arg0.field1077) {
				arg0.field1113 = arg0.field1077 + 1;
			}
		} else if (var2 == 327) {
			arg0.field1121 = 150;
			arg0.field1122 = (int) (Math.sin(field425 / 40.0D) * 256.0D) & 0x7FF;

			if (field154) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = field152[var7];
					if (var8 >= 0 && !NRGHMRLX.field1015[var8].method419()) {
						return;
					}
				}

				field154 = false;
				KPUOCBCE[] var9 = new KPUOCBCE[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = field152[var11];
					if (var12 >= 0) {
						var9[var10++] = NRGHMRLX.field1015[var12].method420();
					}
				}

				KPUOCBCE var13 = new KPUOCBCE(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (field74[var14] != 0) {
						var13.method393(field69[var14][0], field69[var14][field74[var14]]);

						if (var14 == 1) {
							var13.method393(field206[0], field206[field74[var14]]);
						}
					}
				}

				var13.method386();
				var13.method387(NMXKUYSC.field998[field97.field1183].field1000[0]);
				var13.method396(64, 850, -30, -50, -30, true);
				arg0.field1084 = 5;
				arg0.field1085 = 0;
				PFVGIFDY.method449(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (field120 == null) {
				field120 = arg0.field1107;
				field121 = arg0.field1114;
			}

			if (field171) {
				arg0.field1107 = field121;
			} else {
				arg0.field1107 = field120;
			}
		} else if (var2 == 325) {
			if (field120 == null) {
				field120 = arg0.field1107;
				field121 = arg0.field1114;
			}

			if (field171) {
				arg0.field1107 = field120;
			} else {
				arg0.field1107 = field121;
			}
		} else if (var2 == 600) {
			arg0.field1106 = field128;
			if (field425 % 20 < 10) {
				arg0.field1106 = arg0.field1106 + "|";
			} else {
				arg0.field1106 = arg0.field1106 + " ";
			}
		} else if (var2 == 613) {
			if (field275 < 1) {
				arg0.field1106 = "";
			} else if (field96) {
				arg0.field1095 = 0xFF0000;
				arg0.field1106 = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.field1095 = 0xFFFFFF;
				arg0.field1106 = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (field270 == 0) {
				arg0.field1106 = "";
			} else {
				String var15;
				if (field161 == 0) {
					var15 = "earlier today";
				} else if (field161 == 1) {
					var15 = "yesterday";
				} else {
					var15 = field161 + " days ago";
				}

				arg0.field1106 = "You last logged in " + var15 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (field389 == 0) {
				arg0.field1106 = "0 unread messages";
				arg0.field1095 = 0xFFFF00;
			}

			if (field389 == 1) {
				arg0.field1106 = "1 unread message";
				arg0.field1095 = 0xFF00;
			}

			if (field389 > 1) {
				arg0.field1106 = field389 + " unread messages";
				arg0.field1095 = 0xFF00;
			}
		} else if (var2 == 652) {
			if (field82 == 201) {
				if (field332 == 1) {
					arg0.field1106 = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.field1106 = "";
				}
			} else if (field82 == 200) {
				arg0.field1106 = "You have not yet set any password recovery questions.";
			} else {
				String var16;
				if (field82 == 0) {
					var16 = "Earlier today";
				} else if (field82 == 1) {
					var16 = "Yesterday";
				} else {
					var16 = field82 + " days ago";
				}

				arg0.field1106 = var16 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (field82 == 201) {
				if (field332 == 1) {
					arg0.field1106 = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.field1106 = "";
				}
			} else if (field82 == 200) {
				arg0.field1106 = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.field1106 = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (field82 == 201) {
				if (field332 == 1) {
					arg0.field1106 = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.field1106 = "";
				}
			} else if (field82 == 200) {
				arg0.field1106 = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.field1106 = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method169() {
		if (field263 == 0 && field343 == 0) {
			field125[field416] = "Walk here";
			field443[field416] = 472;
			field441[field416] = field696;
			field442[field416] = field697;
			field416++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < KPUOCBCE.field918; var2++) {
			int var3 = KPUOCBCE.field919[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && field349.method263(field105, var4, var5, var3) >= 0) {
					SCWSBSIM var8 = SCWSBSIM.method464(var7);
					if (var8.field1266 != null) {
						var8 = var8.method463();
					}

					if (var8 == null) {
						continue;
					}

					if (field263 == 1) {
						field125[field416] = "Use " + field267 + " with @cya@" + var8.field1278;
						field443[field416] = 553;
						field444[field416] = var3;
						field441[field416] = var4;
						field442[field416] = var5;
						field416++;
					} else if (field343 != 1) {
						if (var8.field1265 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.field1265[var9] != null) {
									field125[field416] = var8.field1265[var9] + " @cya@" + var8.field1278;

									if (var9 == 0) {
										field443[field416] = 91;
									}

									if (var9 == 1) {
										field443[field416] = 653;
									}

									if (var9 == 2) {
										field443[field416] = 583;
									}

									if (var9 == 3) {
										field443[field416] = 639;
									}

									if (var9 == 4) {
										field443[field416] = 1686;
									}

									field444[field416] = var3;
									field441[field416] = var4;
									field442[field416] = var5;
									field416++;
								}
							}
						}

						field125[field416] = "Examine @cya@" + var8.field1278;
						field443[field416] = 1689;
						field444[field416] = var8.field1279 << 14;
						field441[field416] = var4;
						field442[field416] = var5;
						field416++;
					} else if ((field345 & 0x4) == 4) {
						field125[field416] = field346 + " @cya@" + var8.field1278;
						field443[field416] = 591;
						field444[field416] = var3;
						field441[field416] = var4;
						field442[field416] = var5;
						field416++;
					}
				}

				if (var6 == 1) {
					AVKLDTFF var10 = field192[var7];
					if (var10.field36.field791 == 1 && (var10.field1157 & 0x7F) == 0x40 && (var10.field1158 & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < field193; var11++) {
							AVKLDTFF var12 = field192[field194[var11]];
							if (var12 != null && var10 != var12 && var12.field36.field791 == 1 && var10.field1157 == var12.field1157 && var10.field1158 == var12.field1158) {
								method160(var4, var5, field194[var11], var12.field36);
							}
						}

						for (int var13 = 0; var13 < field217; var13++) {
							LAKHMHBY var14 = field216[field218[var13]];
							if (var14 != null && var10.field1157 == var14.field1157 && var10.field1158 == var14.field1158) {
								method41(var14, var5, var4, field218[var13]);
							}
						}
					}

					method160(var4, var5, var7, var10.field36);
				}

				if (var6 == 0) {
					LAKHMHBY var15 = field216[var7];
					if ((var15.field1157 & 0x7F) == 0x40 && (var15.field1158 & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < field193; var16++) {
							AVKLDTFF var17 = field192[field194[var16]];
							if (var17 != null && var17.field36.field791 == 1 && var15.field1157 == var17.field1157 && var15.field1158 == var17.field1158) {
								method160(var4, var5, field194[var16], var17.field36);
							}
						}

						for (int var18 = 0; var18 < field217; var18++) {
							LAKHMHBY var19 = field216[field218[var18]];
							if (var19 != null && var15 != var19 && var15.field1157 == var19.field1157 && var15.field1158 == var19.field1158) {
								method41(var19, var5, var4, field218[var18]);
							}
						}
					}

					method41(var15, var5, var4, var7);
				}

				if (var6 == 3) {
					ILVDIPQT var20 = field235[field105][var4][var5];
					if (var20 != null) {
						for (XXIPNARK var21 = (XXIPNARK) var20.method333(); var21 != null; var21 = (XXIPNARK) var20.method335()) {
							HMRHACIQ var22 = HMRHACIQ.method293(var21.field1404);
							if (field263 == 1) {
								field125[field416] = "Use " + field267 + " with @lre@" + var22.field757;
								field443[field416] = 918;
								field444[field416] = var21.field1404;
								field441[field416] = var4;
								field442[field416] = var5;
								field416++;
							} else if (field343 != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.field722 != null && var22.field722[var23] != null) {
										field125[field416] = var22.field722[var23] + " @lre@" + var22.field757;

										if (var23 == 0) {
											field443[field416] = 343;
										}

										if (var23 == 1) {
											field443[field416] = 813;
										}

										if (var23 == 2) {
											field443[field416] = 933;
										}

										if (var23 == 3) {
											field443[field416] = 566;
										}

										if (var23 == 4) {
											field443[field416] = 412;
										}

										field444[field416] = var21.field1404;
										field441[field416] = var4;
										field442[field416] = var5;
										field416++;
									} else if (var23 == 2) {
										field125[field416] = "Take @lre@" + var22.field757;
										field443[field416] = 933;
										field444[field416] = var21.field1404;
										field441[field416] = var4;
										field442[field416] = var5;
										field416++;
									}
								}

								field125[field416] = "Examine @lre@" + var22.field757;
								field443[field416] = 1770;
								field444[field416] = var21.field1404;
								field441[field416] = var4;
								field442[field416] = var5;
								field416++;
							} else if ((field345 & 0x1) == 1) {
								field125[field416] = field346 + " @lre@" + var22.field757;
								field443[field416] = 374;
								field444[field416] = var21.field1404;
								field441[field416] = var4;
								field442[field416] = var5;
								field416++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a([BIZ)V")
	public final void method170(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public static final String method171(int arg0) {
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

	@ObfuscatedName("client.a(IILQMQRUGDN;)V")
	public final void method172(int arg0, QMQRUGDN arg1) {
		method173(arg1.field1158, arg1.field1157, arg0);
	}

	@ObfuscatedName("client.d(IIII)V")
	public final void method173(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = method119(field105, arg0, arg1) - arg2;
			arg1 -= field426;
			var4 -= field427;
			arg0 -= field428;
			int var5 = KPUOCBCE.field920[field429];
			int var6 = KPUOCBCE.field921[field429];
			int var7 = KPUOCBCE.field920[field430];
			int var8 = KPUOCBCE.field921[field430];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				field375 = (var9 << 9) / arg0 + OIDJTTQC.field1054;
				field376 = (var11 << 9) / arg0 + OIDJTTQC.field1055;
			} else {
				field375 = -1;
				field376 = -1;
			}
		} else {
			field375 = -1;
			field376 = -1;
		}
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static final String method174(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method175() {
		if (field416 >= 2 || field263 != 0 || field343 != 0) {
			String var1;
			if (field263 == 1 && field416 < 2) {
				var1 = "Use " + field267 + " with...";
			} else if (field343 == 1 && field416 < 2) {
				var1 = field346 + "...";
			} else {
				var1 = field125[field416 - 1];
			}

			if (field416 > 2) {
				var1 = var1 + "@whi@ / " + (field416 - 2) + " more options";
			}

			field255.method24(var1, field425 / 1000, 15, 0xFFFFFF, 4, true);
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			field114[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			field378[var5] = var4 - 1;
			var4 += var4;
		}
	}
}
